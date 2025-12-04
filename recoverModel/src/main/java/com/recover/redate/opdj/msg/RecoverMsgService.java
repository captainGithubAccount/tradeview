package com.recover.redate.opdj.msg;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.recover.redate.RecoverManager;
import com.recover.redate.shownotificy.RecoverNtTransfer;

public class RecoverMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public RecoverMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (RecoverManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            RecoverMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                RecoverNtTransfer.onFcmEvent();
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
