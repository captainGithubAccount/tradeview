package com.whitenoti.wasid.opdj.msg;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.shownotificy.WhiterNtTransfer;

public class WhiterMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public WhiterMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (WhiterManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            WhiterMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                WhiterNtTransfer.onFcmEvent();
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
