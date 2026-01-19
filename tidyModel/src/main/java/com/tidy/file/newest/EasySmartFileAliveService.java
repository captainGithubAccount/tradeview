package com.tidy.file.newest;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.tidy.file.old.use.EasyStartOngoingNotifyHelper;

/**
 * 强化版前台服务：
 * 配合“强制点火”逻辑，实现图标的失而复得与实时刷新。
 */
public class EasySmartFileAliveService extends Service {
    EasyStartOngoingNotifyHelper helper;
    private static final String TAG = "ALIVE_TEST";
    // 定义通知被划掉的特殊动作
    public static final String ACTION_NOTIFY_REMOVED = "com.smartfile.NOTIFY_REMOVED";

    @Override
    public void onCreate() {
        super.onCreate();
        helper = new EasyStartOngoingNotifyHelper(this);
        helper.oncreate(this, this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // [新增] 监听划掉动作：如果用户划掉了通知，立即重置状态，等待下一个 Job/解锁 周期瞬间补回
        if (intent != null && ACTION_NOTIFY_REMOVED.equals(intent.getAction())) {
            Log.d(TAG, "🚩 监测到通知被划掉，释放状态锁...");
            EasySmartFileController.getInstance().setServiceRunning(false);
            return START_NOT_STICKY;
        }


        Log.d(TAG, "🚩 收到拉活/刷新指令，执行 startForeground...");

        try {
//            StartOngoingServiceHelper.start();
            helper.onStartCommand(this);



            // 构建带“删除监听”的通知对象
//            Notification notification = buildManagedNotification();

            // 回执成功状态
//            SmartFileController.getInstance().setServiceRunning(true);
            Log.d(TAG, "✅ 图标挂载/刷新成功");

        } catch (Exception e) {
            Log.e(TAG, "🚩 挂载失败: " + e.getMessage());
//            SmartFileController.getInstance().setServiceRunning(false);
        }

        /*try {
            // 构建带“删除监听”的通知对象
            Notification notification = buildManagedNotification();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                // Android 14+ 必须指定类型，这里沿用 DATA_SYNC
                startForeground(100, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                startForeground(100, notification);
            }

            // 回执成功状态
            SmartFileController.getInstance().setServiceRunning(true);
            Log.d(TAG, "✅ 图标挂载/刷新成功");

        } catch (Exception e) {
            Log.e(TAG, "🚩 挂载失败: " + e.getMessage());
            SmartFileController.getInstance().setServiceRunning(false);
        }*/

        return START_STICKY;
    }

    /**
     * 构建通知并绑定 deleteIntent (用于感应图标是否消失)
     */
    private Notification buildManagedNotification() {
        // 创建一个指向自己的 Intent，当用户划掉通知时，系统会通知此 Service
        Intent delIntent = new Intent(this, EasySmartFileAliveService.class);
        delIntent.setAction(ACTION_NOTIFY_REMOVED);

        PendingIntent pendingDelete = PendingIntent.getService(this, 0,
                delIntent, PendingIntent.FLAG_IMMUTABLE);

        Notification notification = EasySmartFileController.getInstance().getNotification(this);
        notification.deleteIntent = pendingDelete; // 注入删除监听

        return notification;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "🚩 服务已销毁，重置状态...");
        EasySmartFileController.getInstance().setServiceRunning(false);
        helper.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) { return null; }
}