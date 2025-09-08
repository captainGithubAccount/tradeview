package com.tfseptember.clemodel.orgyy.msg;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.shownotificy.BlueTenNtTransfer;

public class BlueTenMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public BlueTenMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            BlueTenMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                BlueTenNtTransfer.onFcmEvent();
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
