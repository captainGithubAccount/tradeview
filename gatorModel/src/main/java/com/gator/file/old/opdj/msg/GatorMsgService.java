package com.gator.file.old.opdj.msg;

import android.util.Log;

import com.gator.file.old.use.GatorNotiTimesHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.gator.file.old.GatorManager;
import com.gator.file.old.shownotificy.GatorNtTransfer;

public class GatorMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public GatorMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (GatorManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            GatorMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                GatorNtTransfer.onFcmEvent(GatorNotiTimesHelper.Event.FCM_PUSH);
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
