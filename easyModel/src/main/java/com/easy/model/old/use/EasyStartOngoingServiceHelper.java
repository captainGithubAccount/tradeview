package com.easy.model.old.use;

import android.os.Build;
import android.util.Log;

import androidx.annotation.Keep;

import com.easy.model.old.EasyManager;
import com.easy.model.old.opdj.nt.EasyNtFgService;
import com.easy.model.old.opdj.nt.EasyNtUtils;


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
public class EasyStartOngoingServiceHelper {
    private static final String TAG = "ALIVE_TEST";

    public static void start(){
        if (!EasyNtFgService.getIsShowing()) {
            if (Build.VERSION.SDK_INT >= 33) {
                Log.d(TAG, "✅ ==============  旧保活前台通知服务启动1");
                if (!EasyNtUtils.isOngoingServiceRunning(EasyNtFgService.class)) {
                    Log.d(TAG, "✅ ==============  旧保活前台通知服务启动1  --- start service");
                    EasyManager.INSTANCE.startNotifyService(false);
                }
            } else if (EasyNtUtils.isNotificationEnabled() && !EasyNtUtils.isOngoingServiceRunning(EasyNtFgService.class)) {
                Log.d(TAG, "✅ ==============  旧保活前台通知服务启动2");
                Log.d(TAG, "✅ ==============  旧保活前台通知服务启动2  --- start service");
                EasyManager.INSTANCE.startNotifyService(false);
            }
        }
    }
}
