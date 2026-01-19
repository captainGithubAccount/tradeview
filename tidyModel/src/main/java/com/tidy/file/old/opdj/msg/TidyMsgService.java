package com.tidy.file.old.opdj.msg;

import android.util.Log;

import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tidy.file.old.TidyManager;
import com.tidy.file.old.shownotificy.TidyNtTransfer;

public class TidyMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public TidyMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (TidyManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            TidyMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                TidyNtTransfer.onFcmEvent(TidyNotiTimesHelper.Event.FCM_PUSH);
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
