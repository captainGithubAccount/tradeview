package com.download.model.old.opdj.msg;

import android.util.Log;

import com.download.model.old.use.DownloadNotiTimesHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.download.model.old.DownloadManager;
import com.download.model.old.shownotificy.DownloadNtTransfer;

public class DownloadMsgService extends FirebaseMessagingService {
    public static String mToken = "";
    private long lastTime = 0L;

    public DownloadMsgService() {
    }

    public void onNewToken(String token) {
        super.onNewToken(token);
        if (DownloadManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            DownloadMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        super.onMessageReceived(remoteMessage);
        if (System.currentTimeMillis() - this.lastTime > 60000L) {
            try {
                DownloadNtTransfer.onFcmEvent(DownloadNotiTimesHelper.Event.FCM_PUSH);
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
