package com.location.smartfilemodel.orgyy.msg;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.shownotificy.SmartFileNtTransfer;

public class SmartFileMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public SmartFileMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            SmartFileMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                SmartFileNtTransfer.onFcmEvent();
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
