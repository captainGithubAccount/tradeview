package com.smartfile.model.old.opdj.msg;

import android.util.Log;

import com.smartfile.model.old.use.SmartfileNotiTimesHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.shownotificy.SmartfileNtTransfer;

public class SmartfileMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public SmartfileMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            SmartfileMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                SmartfileNtTransfer.onFcmEvent(SmartfileNotiTimesHelper.Event.FCM_PUSH);
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
