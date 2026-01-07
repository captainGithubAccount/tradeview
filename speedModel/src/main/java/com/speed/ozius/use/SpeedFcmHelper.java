package com.speed.ozius.use;

import android.util.Log;

import androidx.annotation.Keep;

import com.google.firebase.messaging.RemoteMessage;
import com.speed.ozius.SpeedManager;
import com.speed.ozius.opdj.msg.SpeedMsgUploader;
import com.speed.ozius.shownotificy.SpeedNtTransfer;

/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @version 1.0.0
 * Created by 2026年-01月
 * @autor lwj
 */

@Keep
public class SpeedFcmHelper {
    public static String mToken = "";
    private static long lastTime = 0L;
    public static void onNewToken(String token) {

        if (SpeedManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onNewToken token=" + token);
        }
        try {
            mToken = token;
            SpeedMsgUploader.getInstance().reloadToken();
        } catch (Exception var44) {
            Exception e = var44;
            e.printStackTrace();
        }

    }

    public static void onMessageReceived(RemoteMessage remoteMessage) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "MsgServiceOrg9hz onMessageReceived remoteMessage=" + remoteMessage.toString());
        }
        if (System.currentTimeMillis() - lastTime > 60000L) {
            try {
                SpeedNtTransfer.onFcmEvent();
            } catch (Exception var54) {
                Exception e = var54;
                e.printStackTrace();
            }
            lastTime = System.currentTimeMillis();
        }

    }
}