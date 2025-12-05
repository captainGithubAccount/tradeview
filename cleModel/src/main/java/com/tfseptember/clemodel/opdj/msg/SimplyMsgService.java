package com.tfseptember.clemodel.opdj.msg;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.shownotificy.SimplyNtTransfer;

public class SimplyMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public SimplyMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            SimplyMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                SimplyNtTransfer.onFcmEvent();
            } catch (Exception var54) {
                Exception e = var54;
                e.printStackTrace();
            }
            this.lastTime = System.currentTimeMillis();
        }

    }

    public void onDeletedMessages() {
    }
}
