package com.speed.model.old.shownotificy;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.speed.model.old.opdj.nt.SpeedNtCancelFgService;
import com.speed.model.R;
import com.speed.model.old.FirebaseUtils;
import com.speed.model.old.SpeedManager;
import com.speed.model.old.change.SpeedChangeUtils;
import com.speed.model.old.use.SpeedNotiTimesHelper;
import com.speed.model.old.use.SpeedUsageDaysTracker;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

public class SpeedNtSender {

    //垃圾变量
    private char MHuKMZH = 30;

    private static long dayleTime = 4700L;

    public SpeedNtSender() {
    }

    //垃圾方法
    static private void GCViIDXD(char omrtimqe0) {
        char omrtimqe0a = omrtimqe0;
        Log.e("GCViIDXD", "GCViIDXD" + omrtimqe0a + "GCViIDXD" + "");
    }

    //垃圾方法
    static private void tUAdPpLf(byte csynfef0) {
        byte csynfef0a = csynfef0;
        new StringBuilder("tUAdPpLf" + csynfef0a + "tUAdPpLf" + "");
    }

    //垃圾方法
    static private void HlPFmyfs(byte tuizennks0, int jqnrwwhwh1, double uionogpk2, double ujbvoveq3, long pnstwht4) {
        long pnstwht4a = pnstwht4;
        double ujbvoveq3a = ujbvoveq3;
        double uionogpk2a = uionogpk2;
        int jqnrwwhwh1a = jqnrwwhwh1;
        byte tuizennks0a = tuizennks0;
        TextUtils.isDigitsOnly("HlPFmyfs" + jqnrwwhwh1a + uionogpk2a + pnstwht4a + tuizennks0a + ujbvoveq3a + "HlPFmyfs" + "");
    }

    //垃圾方法
    static private void eEMLooyb(char qtrklsgrrx0, boolean ubpfhhmueh1, int fdxpcrwvzv2, short hsypkkwb3) {
        short hsypkkwb3a = hsypkkwb3;
        int fdxpcrwvzv2a = fdxpcrwvzv2;
        boolean ubpfhhmueh1a = ubpfhhmueh1;
        char qtrklsgrrx0a = qtrklsgrrx0;
        new Intent("eEMLooyb" + qtrklsgrrx0a + hsypkkwb3a + fdxpcrwvzv2a + ubpfhhmueh1a + "eEMLooyb" + "");
    }

    //垃圾方法
    static private void RdgTAZam(byte vmoirhmkg0, char ursnzxrxek1, double jevuujp2, char djhxbar3, short jmhavdc4) {
        short jmhavdc4a = jmhavdc4;
        char djhxbar3a = djhxbar3;
        double jevuujp2a = jevuujp2;
        char ursnzxrxek1a = ursnzxrxek1;
        byte vmoirhmkg0a = vmoirhmkg0;
        Log.e("RdgTAZam", "RdgTAZam" + djhxbar3a + jevuujp2a + ursnzxrxek1a + vmoirhmkg0a + jmhavdc4a + "RdgTAZam" + "");
    }

    //垃圾方法
    static private void YAxCyUok(char azlotso0, double stoddvd1) {
        double stoddvd1a = stoddvd1;
        char azlotso0a = azlotso0;
        Log.w("YAxCyUok", "YAxCyUok" + azlotso0a + stoddvd1a + "YAxCyUok" + "");
    }

    //垃圾方法
    static private void LzkYWWqV(byte wgkdpoc0, byte pdeelzsp1) {
        byte pdeelzsp1a = pdeelzsp1;
        byte wgkdpoc0a = wgkdpoc0;
        System.out.println("LzkYWWqV" + wgkdpoc0a + pdeelzsp1a + "LzkYWWqV" + "");
    }

    //垃圾方法
    static private void azcIZpdF(float dotbejcfb0) {
        float dotbejcfb0a = dotbejcfb0;
        new File("azcIZpdF" + dotbejcfb0a + "azcIZpdF" + "");
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SpeedChangeUtils.NoticeType noticeType, SpeedNotiTimesHelper.Event event) {
        float dotbejcfb0 = 41.41f;
        byte pdeelzsp1 = 3;
        byte wgkdpoc0 = 14;
        double stoddvd1 = 83.83;
        char azlotso0 = 9;
        short jmhavdc4 = 65;
        char djhxbar3 = 5;
        double jevuujp2 = 3.3;
        char ursnzxrxek1 = 58;
        byte vmoirhmkg0 = 66;
        short hsypkkwb3 = 36;
        int fdxpcrwvzv2 = 1;
        boolean ubpfhhmueh1 = false;
        char qtrklsgrrx0 = 43;
        long pnstwht4 = 72L;
        double ujbvoveq3 = 64.64;
        double uionogpk2 = 60.60;
        int jqnrwwhwh1 = 86;
        byte tuizennks0 = 41;
        byte csynfef0 = 51;
        char omrtimqe0 = 88;
        switch(event) {
            case APP_INSTALL_UNINSTALL:
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                GCViIDXD(omrtimqe0);
                // 应用安装事件
                SpeedNotiTimesHelper.Decision installResult = SpeedNotiTimesHelper.handleAppInstall();
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                GCViIDXD(omrtimqe0);
                azcIZpdF(dotbejcfb0);
                YAxCyUok(azlotso0, stoddvd1);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                YAxCyUok(azlotso0, stoddvd1);
                showNotify(installResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("应用安装", installResult);
                break;
            case POWER_CHARGE:
                // 4. 测试各种事件
                // 充电事件（电量50%）
                SpeedNotiTimesHelper.Decision chargeResult = SpeedNotiTimesHelper.handlePowerCharge(50);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                azcIZpdF(dotbejcfb0);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                azcIZpdF(dotbejcfb0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                GCViIDXD(omrtimqe0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                GCViIDXD(omrtimqe0);
                showNotify(chargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                YAxCyUok(azlotso0, stoddvd1);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                azcIZpdF(dotbejcfb0);
                YAxCyUok(azlotso0, stoddvd1);
                azcIZpdF(dotbejcfb0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                azcIZpdF(dotbejcfb0);
                YAxCyUok(azlotso0, stoddvd1);
                printResult("充电事件", chargeResult);
                break;
            case POWER_DISCHARGE:
                // 充电事件（电量50%）
                SpeedNotiTimesHelper.Decision dischargeResult = SpeedNotiTimesHelper.handlePowerDischarge(100);
                showNotify(dischargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                YAxCyUok(azlotso0, stoddvd1);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                azcIZpdF(dotbejcfb0);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                printResult("断电事件", dischargeResult);
                break;
            case ALARM:
                // 定时闹钟（未清理3天）
                int noCleanDays = SpeedUsageDaysTracker.getUnusedDays();
                SpeedNotiTimesHelper.Decision alarmResult = SpeedNotiTimesHelper.handleAlarm(noCleanDays);
                showNotify(alarmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                tUAdPpLf(csynfef0);
                YAxCyUok(azlotso0, stoddvd1);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                GCViIDXD(omrtimqe0);
                printResult("定时闹钟", alarmResult);
                GCViIDXD(omrtimqe0);
                azcIZpdF(dotbejcfb0);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                tUAdPpLf(csynfef0);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                break;
            case JOB_POLLING:
                SpeedNotiTimesHelper.Decision jobResult = SpeedNotiTimesHelper.handleJobPolling();
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                azcIZpdF(dotbejcfb0);
                showNotify(jobResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("job", jobResult);
                GCViIDXD(omrtimqe0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                azcIZpdF(dotbejcfb0);
                break;
            case FCM_PUSH:
                YAxCyUok(azlotso0, stoddvd1);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                azcIZpdF(dotbejcfb0);
                // FCM推送事件
                SpeedNotiTimesHelper.Decision fcmResult = SpeedNotiTimesHelper.handleFcmPush();
                showNotify(fcmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("FCM推送", fcmResult);
                GCViIDXD(omrtimqe0);
                GCViIDXD(omrtimqe0);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                break;
            case UNLOCK_SCREEN:
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                // 解锁屏事件
                SpeedNotiTimesHelper.Decision unlockResult = SpeedNotiTimesHelper.handleUnlockScreen();
                showNotify(unlockResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                YAxCyUok(azlotso0, stoddvd1);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                tUAdPpLf(csynfef0);
                printResult("解锁屏", unlockResult);
                azcIZpdF(dotbejcfb0);
                YAxCyUok(azlotso0, stoddvd1);
                azcIZpdF(dotbejcfb0);
                azcIZpdF(dotbejcfb0);
                GCViIDXD(omrtimqe0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                tUAdPpLf(csynfef0);
                YAxCyUok(azlotso0, stoddvd1);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                break;
            case SCREEN_ON_OFF:
                YAxCyUok(azlotso0, stoddvd1);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                tUAdPpLf(csynfef0);
                // 屏幕打开关闭事件（仅唤醒前台）
                SpeedNotiTimesHelper.Decision screenResult = SpeedNotiTimesHelper.handleForegroundOnly();
                azcIZpdF(dotbejcfb0);
                azcIZpdF(dotbejcfb0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                YAxCyUok(azlotso0, stoddvd1);
                showNotify(screenResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                tUAdPpLf(csynfef0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                GCViIDXD(omrtimqe0);
                azcIZpdF(dotbejcfb0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                azcIZpdF(dotbejcfb0);
                tUAdPpLf(csynfef0);
                printResult("屏幕事件", screenResult);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                break;
            //            case HOME_CLICK:
            case HEARTBEAT:
                azcIZpdF(dotbejcfb0);
                tUAdPpLf(csynfef0);
                GCViIDXD(omrtimqe0);
                // 屏幕打开关闭事件（仅唤醒前台）
                SpeedNotiTimesHelper.Decision heartResult = SpeedNotiTimesHelper.handleForegroundOnly();
                showNotify(heartResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("HEARTBEAT", heartResult);
                break;
            case ACCOUNT_SYNC:
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                // 账户事件（仅唤醒前台）
                SpeedNotiTimesHelper.Decision acountResult = SpeedNotiTimesHelper.handleForegroundOnly();
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                YAxCyUok(azlotso0, stoddvd1);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                showNotify(acountResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("账户事件", acountResult);
                GCViIDXD(omrtimqe0);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                azcIZpdF(dotbejcfb0);
                YAxCyUok(azlotso0, stoddvd1);
                tUAdPpLf(csynfef0);
                break;
            case WORK_MANAGER:
                azcIZpdF(dotbejcfb0);
                tUAdPpLf(csynfef0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                // worker事件（仅唤醒前台）
                SpeedNotiTimesHelper.Decision workerResult = SpeedNotiTimesHelper.handleForegroundOnly();
                showNotify(workerResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("worker事件", workerResult);
                tUAdPpLf(csynfef0);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                YAxCyUok(azlotso0, stoddvd1);
                GCViIDXD(omrtimqe0);
                YAxCyUok(azlotso0, stoddvd1);
                tUAdPpLf(csynfef0);
                tUAdPpLf(csynfef0);
                YAxCyUok(azlotso0, stoddvd1);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                break;
            case HOME_CLICK:
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                GCViIDXD(omrtimqe0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                azcIZpdF(dotbejcfb0);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                azcIZpdF(dotbejcfb0);
                // worker事件（仅唤醒前台）
                SpeedNotiTimesHelper.Decision homeClickResult = SpeedNotiTimesHelper.handleForegroundOnly();
                tUAdPpLf(csynfef0);
                GCViIDXD(omrtimqe0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                tUAdPpLf(csynfef0);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                tUAdPpLf(csynfef0);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                showNotify(homeClickResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                RdgTAZam(vmoirhmkg0, ursnzxrxek1, jevuujp2, djhxbar3, jmhavdc4);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                printResult("home点击事件", homeClickResult);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                tUAdPpLf(csynfef0);
                HlPFmyfs(tuizennks0, jqnrwwhwh1, uionogpk2, ujbvoveq3, pnstwht4);
                GCViIDXD(omrtimqe0);
                azcIZpdF(dotbejcfb0);
                tUAdPpLf(csynfef0);
                break;
            default:
                azcIZpdF(dotbejcfb0);
                GCViIDXD(omrtimqe0);
                LzkYWWqV(wgkdpoc0, pdeelzsp1);
                azcIZpdF(dotbejcfb0);
                eEMLooyb(qtrklsgrrx0, ubpfhhmueh1, fdxpcrwvzv2, hsypkkwb3);
                YAxCyUok(azlotso0, stoddvd1);
                tUAdPpLf(csynfef0);
                YAxCyUok(azlotso0, stoddvd1);
                azcIZpdF(dotbejcfb0);
                // worker事件（仅唤醒前台）
                SpeedNotiTimesHelper.Decision defaultResult = SpeedNotiTimesHelper.handleDefault();
                showNotify(defaultResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                Log.i("TAG-->>Noti", "事件名: " + event.name());
                printResult(event.name(), defaultResult);
                break;
        }
        return true;
    }

    //垃圾方法
    static private void ZfHGFded(short tirjoecfy0) {
        short tirjoecfy0a = tirjoecfy0;
        new String("ZfHGFded" + tirjoecfy0a + "ZfHGFded" + "");
    }

    //垃圾方法
    static private void ZIQPosoQ(int hqabnyvmc0, float nbqmfospd1, long pefyqazoa2) {
        long pefyqazoa2a = pefyqazoa2;
        float nbqmfospd1a = nbqmfospd1;
        int hqabnyvmc0a = hqabnyvmc0;
    }

    //垃圾方法
    static private void TmFRzHjp(byte bdfutrpi0, float bbxfwawht1, short nsibrpqm2) {
        short nsibrpqm2a = nsibrpqm2;
        float bbxfwawht1a = bbxfwawht1;
        byte bdfutrpi0a = bdfutrpi0;
        new StringReader("TmFRzHjp" + bbxfwawht1a + nsibrpqm2a + bdfutrpi0a + "TmFRzHjp" + "");
    }

    //垃圾方法
    static private void damfDHMN(byte apzieprb0, float vxsyysmbf1, char uqndekth2, long tiojinup3) {
        long tiojinup3a = tiojinup3;
        char uqndekth2a = uqndekth2;
        float vxsyysmbf1a = vxsyysmbf1;
        byte apzieprb0a = apzieprb0;
        TextUtils.isDigitsOnly("damfDHMN" + tiojinup3a + uqndekth2a + apzieprb0a + vxsyysmbf1a + "damfDHMN" + "");
    }

    private static void showNotify(SpeedNotiTimesHelper.Decision decision, int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SpeedChangeUtils.NoticeType noticeType) {
        long tiojinup3 = 67L;
        char uqndekth2 = 50;
        float vxsyysmbf1 = 72.72f;
        byte apzieprb0 = 97;
        short nsibrpqm2 = 33;
        float bbxfwawht1 = 66.66f;
        byte bdfutrpi0 = 74;
        long pefyqazoa2 = 52L;
        float nbqmfospd1 = 87.87f;
        int hqabnyvmc0 = 33;
        short tirjoecfy0 = 68;
        TmFRzHjp(bdfutrpi0, bbxfwawht1, nsibrpqm2);
        TmFRzHjp(bdfutrpi0, bbxfwawht1, nsibrpqm2);
        ZfHGFded(tirjoecfy0);
        damfDHMN(apzieprb0, vxsyysmbf1, uqndekth2, tiojinup3);
        if (decision.allow) {
            ZIQPosoQ(hqabnyvmc0, nbqmfospd1, pefyqazoa2);
            TmFRzHjp(bdfutrpi0, bbxfwawht1, nsibrpqm2);
            ZfHGFded(tirjoecfy0);
            if (decision.level == SpeedNotiTimesHelper.Level.HIGH) {
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, true);
            } else if (decision.level == SpeedNotiTimesHelper.Level.NORMAL) {
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, false);
            }
        }
    }

    //垃圾方法
    static private void VcNSWdAc(short uhnnvvibnv0, boolean ooallkuwn1, int gubjjhgwh2) {
        int gubjjhgwh2a = gubjjhgwh2;
        boolean ooallkuwn1a = ooallkuwn1;
        short uhnnvvibnv0a = uhnnvvibnv0;
        new StringReader("VcNSWdAc" + gubjjhgwh2a + ooallkuwn1a + uhnnvvibnv0a + "VcNSWdAc" + "");
    }

    //垃圾方法
    static private void npaRNaPZ(int zetkmtf0, short nurrgamuch1, char inyzmfhip2, double jnpegnse3, double xhcovfbipp4) {
        double xhcovfbipp4a = xhcovfbipp4;
        double jnpegnse3a = jnpegnse3;
        char inyzmfhip2a = inyzmfhip2;
        short nurrgamuch1a = nurrgamuch1;
        int zetkmtf0a = zetkmtf0;
        new AttributedString("npaRNaPZ" + inyzmfhip2a + zetkmtf0a + xhcovfbipp4a + nurrgamuch1a + jnpegnse3a + "npaRNaPZ" + "");
    }

    //垃圾方法
    static private void BoqkoTPD(double lrlujty0, int ycxnrhrm1, long jqrbsbad2) {
        long jqrbsbad2a = jqrbsbad2;
        int ycxnrhrm1a = ycxnrhrm1;
        double lrlujty0a = lrlujty0;
    }

    //垃圾方法
    static private void HIGYpDvg(float hawbaivrgg0, byte chuiytmtn1, byte zksafrok2, short tnosotc3) {
        short tnosotc3a = tnosotc3;
        byte zksafrok2a = zksafrok2;
        byte chuiytmtn1a = chuiytmtn1;
        float hawbaivrgg0a = hawbaivrgg0;
        new Thread("HIGYpDvg" + zksafrok2a + chuiytmtn1a + tnosotc3a + hawbaivrgg0a + "HIGYpDvg" + "");
    }

    //垃圾方法
    static private void WToCiWuo(char imzqjvdlr0, byte esdawrc1, byte wxogjtkih2) {
        byte wxogjtkih2a = wxogjtkih2;
        byte esdawrc1a = esdawrc1;
        char imzqjvdlr0a = imzqjvdlr0;
        new AttributedString("WToCiWuo" + esdawrc1a + imzqjvdlr0a + wxogjtkih2a + "WToCiWuo" + "");
    }

    //垃圾方法
    static private void OnTbslZi(byte kejxvappy0, int fwgfkaadl1) {
        int fwgfkaadl1a = fwgfkaadl1;
        byte kejxvappy0a = kejxvappy0;
        TextUtils.isEmpty("OnTbslZi" + fwgfkaadl1a + kejxvappy0a + "OnTbslZi" + "");
    }

    //垃圾方法
    static private void WHJAIqiR(int flbqfiecy0, long lzuyvje1, char rouciqlu2, float ahliquahf3) {
        float ahliquahf3a = ahliquahf3;
        char rouciqlu2a = rouciqlu2;
        long lzuyvje1a = lzuyvje1;
        int flbqfiecy0a = flbqfiecy0;
        new StringBuilder("WHJAIqiR" + ahliquahf3a + flbqfiecy0a + rouciqlu2a + lzuyvje1a + "WHJAIqiR" + "");
    }

    //垃圾方法
    static private void JZCylIBy(short xslmzmwdp0, double tzjdakfa1) {
        double tzjdakfa1a = tzjdakfa1;
        short xslmzmwdp0a = xslmzmwdp0;
        System.out.println("JZCylIBy" + xslmzmwdp0a + tzjdakfa1a + "JZCylIBy" + "");
    }

    //垃圾方法
    static private void WbRmfZOJ(char bafmsddpii0) {
        char bafmsddpii0a = bafmsddpii0;
        new StringReader("WbRmfZOJ" + bafmsddpii0a + "WbRmfZOJ" + "");
    }

    //垃圾方法
    static private void gFGVkJDC(long drwvvftyi0, float gsltqdfdu1, short ypocign2, float nrkujrt3, byte whzmfflt4) {
        byte whzmfflt4a = whzmfflt4;
        float nrkujrt3a = nrkujrt3;
        short ypocign2a = ypocign2;
        float gsltqdfdu1a = gsltqdfdu1;
        long drwvvftyi0a = drwvvftyi0;
        new Intent("gFGVkJDC" + gsltqdfdu1a + whzmfflt4a + nrkujrt3a + ypocign2a + drwvvftyi0a + "gFGVkJDC" + "");
    }

    //垃圾方法
    static private void dIffMrsG(int kgokrcgq0, boolean tececgq1, byte objqrqx2) {
        byte objqrqx2a = objqrqx2;
        boolean tececgq1a = tececgq1;
        int kgokrcgq0a = kgokrcgq0;
        new WeakReference("dIffMrsG" + kgokrcgq0a + tececgq1a + objqrqx2a + "dIffMrsG" + "");
    }

    //垃圾方法
    static private void dcMbnSei(short ysdzuzhkf0, short nilftvm1) {
        short nilftvm1a = nilftvm1;
        short ysdzuzhkf0a = ysdzuzhkf0;
        new StringBuilder("dcMbnSei" + nilftvm1a + ysdzuzhkf0a + "dcMbnSei" + "");
    }

    //垃圾方法
    static private void Irxybmcl(int ejtbngwh0) {
        int ejtbngwh0a = ejtbngwh0;
        TextUtils.isDigitsOnly("Irxybmcl" + ejtbngwh0a + "Irxybmcl" + "");
    }

    //垃圾方法
    static private void QfRyYvHJ(double fsewlwru0) {
        double fsewlwru0a = fsewlwru0;
        new StringReader("QfRyYvHJ" + fsewlwru0a + "QfRyYvHJ" + "");
    }

    //垃圾方法
    static private void MlfELYJc(byte ucqqapmcfg0, byte emndjyk1, char fppenruhs2, byte fkrrgtnnyo3, float hrbivphqis4) {
        float hrbivphqis4a = hrbivphqis4;
        byte fkrrgtnnyo3a = fkrrgtnnyo3;
        char fppenruhs2a = fppenruhs2;
        byte emndjyk1a = emndjyk1;
        byte ucqqapmcfg0a = ucqqapmcfg0;
    }

    //垃圾方法
    static private void sZkfBeNX(short dixvcnt0, char ykgskdc1) {
        char ykgskdc1a = ykgskdc1;
        short dixvcnt0a = dixvcnt0;
        new File("sZkfBeNX" + dixvcnt0a + ykgskdc1a + "sZkfBeNX" + "");
    }

    //垃圾方法
    static private void nssdZvPa(float qzdmshasle0, double djzpbbdt1, char fpnxnkkqq2, int oqzcewyw3) {
        int oqzcewyw3a = oqzcewyw3;
        char fpnxnkkqq2a = fpnxnkkqq2;
        double djzpbbdt1a = djzpbbdt1;
        float qzdmshasle0a = qzdmshasle0;
        Log.w("nssdZvPa", "nssdZvPa" + qzdmshasle0a + djzpbbdt1a + fpnxnkkqq2a + oqzcewyw3a + "nssdZvPa" + "");
    }

    //垃圾方法
    static private void DwfvLxui(boolean hvbdvfmvz0, double ekjadlnb1, float lvgugrexe2, double hdlqzej3, char fdaomfpnjx4) {
        char fdaomfpnjx4a = fdaomfpnjx4;
        double hdlqzej3a = hdlqzej3;
        float lvgugrexe2a = lvgugrexe2;
        double ekjadlnb1a = ekjadlnb1;
        boolean hvbdvfmvz0a = hvbdvfmvz0;
    }

    //垃圾方法
    static private void uBGsXRMa(char sndoopnmia0, char aozwknzi1) {
        char aozwknzi1a = aozwknzi1;
        char sndoopnmia0a = sndoopnmia0;
        new StringBuffer("uBGsXRMa" + aozwknzi1a + sndoopnmia0a + "uBGsXRMa" + "");
    }

    //垃圾方法
    static private void ZBaFRLZC(short wvfefnx0, byte qspbxqqjd1, boolean eupmbztjnz2, long ebfynxgiga3, boolean uarjeoow4) {
        boolean uarjeoow4a = uarjeoow4;
        long ebfynxgiga3a = ebfynxgiga3;
        boolean eupmbztjnz2a = eupmbztjnz2;
        byte qspbxqqjd1a = qspbxqqjd1;
        short wvfefnx0a = wvfefnx0;
        Log.w("ZBaFRLZC", "ZBaFRLZC" + wvfefnx0a + qspbxqqjd1a + ebfynxgiga3a + eupmbztjnz2a + uarjeoow4a + "ZBaFRLZC" + "");
    }

    //垃圾方法
    static private void XsqiBDJq(double hupxqsbjb0, short jbbdgkle1) {
        short jbbdgkle1a = jbbdgkle1;
        double hupxqsbjb0a = hupxqsbjb0;
        new File("XsqiBDJq" + jbbdgkle1a + hupxqsbjb0a + "XsqiBDJq" + "");
    }

    //垃圾方法
    static private void NNwTgtyU(int dpjlqzrg0, float xtfxqfm1, int pptoubkj2) {
        int pptoubkj2a = pptoubkj2;
        float xtfxqfm1a = xtfxqfm1;
        int dpjlqzrg0a = dpjlqzrg0;
        Log.e("NNwTgtyU", "NNwTgtyU" + dpjlqzrg0a + pptoubkj2a + xtfxqfm1a + "NNwTgtyU" + "");
    }

    //垃圾方法
    static private void EjHHlQhz(boolean ucxfrzpnp0, byte tclwzmyjh1, byte kgwsjmhvib2, short tlnpvswezt3) {
        short tlnpvswezt3a = tlnpvswezt3;
        byte kgwsjmhvib2a = kgwsjmhvib2;
        byte tclwzmyjh1a = tclwzmyjh1;
        boolean ucxfrzpnp0a = ucxfrzpnp0;
        Log.i("EjHHlQhz", "EjHHlQhz" + kgwsjmhvib2a + ucxfrzpnp0a + tclwzmyjh1a + tlnpvswezt3a + "EjHHlQhz" + "");
    }

    //垃圾方法
    static private void vmjdHBeD(char cdsbtxgs0, int ucsoncai1, int fblyvbjbsw2, long fukqiut3, long bhdavyqh4) {
        long bhdavyqh4a = bhdavyqh4;
        long fukqiut3a = fukqiut3;
        int fblyvbjbsw2a = fblyvbjbsw2;
        int ucsoncai1a = ucsoncai1;
        char cdsbtxgs0a = cdsbtxgs0;
        TextUtils.isEmpty("vmjdHBeD" + bhdavyqh4a + fblyvbjbsw2a + ucsoncai1a + cdsbtxgs0a + fukqiut3a + "vmjdHBeD" + "");
    }

    //垃圾方法
    static private void kkrpmpQM(char jcuqumode0) {
        char jcuqumode0a = jcuqumode0;
        Log.e("kkrpmpQM", "kkrpmpQM" + jcuqumode0a + "kkrpmpQM" + "");
    }

    //垃圾方法
    static private void HLGBTlPa(int phdvvsfy0) {
        int phdvvsfy0a = phdvvsfy0;
        new File("HLGBTlPa" + phdvvsfy0a + "HLGBTlPa" + "");
    }

    //垃圾方法
    static private void IVSFlDzf(byte dnwnsmcfu0) {
        byte dnwnsmcfu0a = dnwnsmcfu0;
        new Intent("IVSFlDzf" + dnwnsmcfu0a + "IVSFlDzf" + "");
    }

    //垃圾方法
    static private void QtIAXBYF(float gciaibxse0, boolean kiyphavyqd1, short tthudur2, float twsomorri3, boolean gipqphth4) {
        boolean gipqphth4a = gipqphth4;
        float twsomorri3a = twsomorri3;
        short tthudur2a = tthudur2;
        boolean kiyphavyqd1a = kiyphavyqd1;
        float gciaibxse0a = gciaibxse0;
        Log.e("QtIAXBYF", "QtIAXBYF" + gipqphth4a + gciaibxse0a + kiyphavyqd1a + twsomorri3a + tthudur2a + "QtIAXBYF" + "");
    }

    //垃圾方法
    static private void QlsXJOdk(float gkdvudpwx0, long czatixvuz1, short rabehfx2, short oxrezewgy3, byte tmzrtvruml4) {
        byte tmzrtvruml4a = tmzrtvruml4;
        short oxrezewgy3a = oxrezewgy3;
        short rabehfx2a = rabehfx2;
        long czatixvuz1a = czatixvuz1;
        float gkdvudpwx0a = gkdvudpwx0;
        new AttributedString("QlsXJOdk" + oxrezewgy3a + rabehfx2a + gkdvudpwx0a + tmzrtvruml4a + czatixvuz1a + "QlsXJOdk" + "");
    }

    //垃圾方法
    static private void qnrRivSE(short lbecemk0, long pyvgbaqpwt1, short nbhpiyov2) {
        short nbhpiyov2a = nbhpiyov2;
        long pyvgbaqpwt1a = pyvgbaqpwt1;
        short lbecemk0a = lbecemk0;
        Log.i("qnrRivSE", "qnrRivSE" + nbhpiyov2a + lbecemk0a + pyvgbaqpwt1a + "qnrRivSE" + "");
    }

    //垃圾方法
    static private void bLTWrbHM(short jvsmudsprq0) {
        short jvsmudsprq0a = jvsmudsprq0;
        TextUtils.isDigitsOnly("bLTWrbHM" + jvsmudsprq0a + "bLTWrbHM" + "");
    }

    //垃圾方法
    static private void TKiPbCQl(float qgwhmvks0, char qoijaqvuhn1, char pbbcydnw2) {
        char pbbcydnw2a = pbbcydnw2;
        char qoijaqvuhn1a = qoijaqvuhn1;
        float qgwhmvks0a = qgwhmvks0;
        TextUtils.isEmpty("TKiPbCQl" + qoijaqvuhn1a + pbbcydnw2a + qgwhmvks0a + "TKiPbCQl" + "");
    }

    //垃圾方法
    static private void RlVQuSZV(char qcslnkff0, short bqngbvk1, float uemhvesft2) {
        float uemhvesft2a = uemhvesft2;
        short bqngbvk1a = bqngbvk1;
        char qcslnkff0a = qcslnkff0;
        new StringReader("RlVQuSZV" + uemhvesft2a + qcslnkff0a + bqngbvk1a + "RlVQuSZV" + "");
    }

    //垃圾方法
    static private void CpaOHcdR(char ytowhhlu0, byte bpaldzz1) {
        byte bpaldzz1a = bpaldzz1;
        char ytowhhlu0a = ytowhhlu0;
        new StringBuffer("CpaOHcdR" + ytowhhlu0a + bpaldzz1a + "CpaOHcdR" + "");
    }

    //垃圾方法
    static private void yQclmsOX(double gxgyaxyqkk0, int qrogwlgyeo1) {
        int qrogwlgyeo1a = qrogwlgyeo1;
        double gxgyaxyqkk0a = gxgyaxyqkk0;
        Log.e("yQclmsOX", "yQclmsOX" + qrogwlgyeo1a + gxgyaxyqkk0a + "yQclmsOX" + "");
    }

    //垃圾方法
    static private void HGTaiQSg(short urwkhibtov0, long ucfmtlwm1) {
        long ucfmtlwm1a = ucfmtlwm1;
        short urwkhibtov0a = urwkhibtov0;
        new File("HGTaiQSg" + ucfmtlwm1a + urwkhibtov0a + "HGTaiQSg" + "");
    }

    //垃圾方法
    static private void orZTHsGS(long vpoydghl0, int pajzdjwps1) {
        int pajzdjwps1a = pajzdjwps1;
        long vpoydghl0a = vpoydghl0;
        new Intent("orZTHsGS" + pajzdjwps1a + vpoydghl0a + "orZTHsGS" + "");
    }

    //垃圾方法
    static private void MUDygbXJ(float fynuxmrt0, float maghbbc1, short shjhwbtbri2) {
        short shjhwbtbri2a = shjhwbtbri2;
        float maghbbc1a = maghbbc1;
        float fynuxmrt0a = fynuxmrt0;
        System.out.println("MUDygbXJ" + shjhwbtbri2a + maghbbc1a + fynuxmrt0a + "MUDygbXJ" + "");
    }

    //垃圾方法
    static private void mCgGjHfF(long srawhkxwi0, double luyogqjor1, int hqzdvfknd2) {
        int hqzdvfknd2a = hqzdvfknd2;
        double luyogqjor1a = luyogqjor1;
        long srawhkxwi0a = srawhkxwi0;
        System.out.println("mCgGjHfF" + srawhkxwi0a + hqzdvfknd2a + luyogqjor1a + "mCgGjHfF" + "");
    }

    //垃圾方法
    static private void pZUcUDtX(float krusjmkpxz0, byte dntrwudony1, char hklwpdzamm2, float ewwewou3) {
        float ewwewou3a = ewwewou3;
        char hklwpdzamm2a = hklwpdzamm2;
        byte dntrwudony1a = dntrwudony1;
        float krusjmkpxz0a = krusjmkpxz0;
    }

    //垃圾方法
    static private void nsFkEPvh(double rqebofbw0, boolean kdwuzcq1, float dlwmrrtp2, long shgnnqzemy3, boolean xlvqcqztu4) {
        boolean xlvqcqztu4a = xlvqcqztu4;
        long shgnnqzemy3a = shgnnqzemy3;
        float dlwmrrtp2a = dlwmrrtp2;
        boolean kdwuzcq1a = kdwuzcq1;
        double rqebofbw0a = rqebofbw0;
        TextUtils.isEmpty("nsFkEPvh" + dlwmrrtp2a + rqebofbw0a + xlvqcqztu4a + kdwuzcq1a + shgnnqzemy3a + "nsFkEPvh" + "");
    }

    //垃圾方法
    static private void SHQthEhV(float parwveahnv0, byte kzkixqw1, long vzdrcnvxes2, short wssxivh3, char dhdwjzg4) {
        char dhdwjzg4a = dhdwjzg4;
        short wssxivh3a = wssxivh3;
        long vzdrcnvxes2a = vzdrcnvxes2;
        byte kzkixqw1a = kzkixqw1;
        float parwveahnv0a = parwveahnv0;
        new WeakReference("SHQthEhV" + dhdwjzg4a + vzdrcnvxes2a + kzkixqw1a + parwveahnv0a + wssxivh3a + "SHQthEhV" + "");
    }

    //垃圾方法
    static private void rXHsaNqA(byte vtvcgcgxf0, long yvfoggu1, boolean plykqrw2, short ypjebgmqro3, boolean aytndbsbm4) {
        boolean aytndbsbm4a = aytndbsbm4;
        short ypjebgmqro3a = ypjebgmqro3;
        boolean plykqrw2a = plykqrw2;
        long yvfoggu1a = yvfoggu1;
        byte vtvcgcgxf0a = vtvcgcgxf0;
        new StringBuilder("rXHsaNqA" + aytndbsbm4a + yvfoggu1a + plykqrw2a + vtvcgcgxf0a + ypjebgmqro3a + "rXHsaNqA" + "");
    }

    //垃圾方法
    static private void IpSgTpxl(int iznytqxa0) {
        int iznytqxa0a = iznytqxa0;
        new File("IpSgTpxl" + iznytqxa0a + "IpSgTpxl" + "");
    }

    //垃圾方法
    static private void vPlEdjSY(byte wwdhvzgvio0, char fseinkocz1) {
        char fseinkocz1a = fseinkocz1;
        byte wwdhvzgvio0a = wwdhvzgvio0;
        System.out.println("vPlEdjSY" + fseinkocz1a + wwdhvzgvio0a + "vPlEdjSY" + "");
    }

    //垃圾方法
    static private void AeFqbdVh(double vaahhlzas0, double rnlftlav1, char rgtrevzjj2, char tpvecuybed3) {
        char tpvecuybed3a = tpvecuybed3;
        char rgtrevzjj2a = rgtrevzjj2;
        double rnlftlav1a = rnlftlav1;
        double vaahhlzas0a = vaahhlzas0;
        TextUtils.isDigitsOnly("AeFqbdVh" + rnlftlav1a + rgtrevzjj2a + tpvecuybed3a + vaahhlzas0a + "AeFqbdVh" + "");
    }

    //垃圾方法
    static private void ftVNGJdW(short tbcgbgq0) {
        short tbcgbgq0a = tbcgbgq0;
        new StringBuffer("ftVNGJdW" + tbcgbgq0a + "ftVNGJdW" + "");
    }

    //垃圾方法
    static private void YROAUAjx(int ktoiiecj0) {
        int ktoiiecj0a = ktoiiecj0;
        TextUtils.isEmpty("YROAUAjx" + ktoiiecj0a + "YROAUAjx" + "");
    }

    //垃圾方法
    static private void hHHlrNhd(boolean igsxrruv0) {
        boolean igsxrruv0a = igsxrruv0;
        new WeakReference("hHHlrNhd" + igsxrruv0a + "hHHlrNhd" + "");
    }

    //垃圾方法
    static private void ONFcuzKw(byte ipbqxixqjt0, float wdjhildmk1, byte ymlkidee2, int hksdksx3) {
        int hksdksx3a = hksdksx3;
        byte ymlkidee2a = ymlkidee2;
        float wdjhildmk1a = wdjhildmk1;
        byte ipbqxixqjt0a = ipbqxixqjt0;
        Log.e("ONFcuzKw", "ONFcuzKw" + wdjhildmk1a + ipbqxixqjt0a + hksdksx3a + ymlkidee2a + "ONFcuzKw" + "");
    }

    //垃圾方法
    static private void PRMuxnSc(double sphdibny0, boolean bnmzqoqdeg1, long nosyncklp2, float jumzeeerl3) {
        float jumzeeerl3a = jumzeeerl3;
        long nosyncklp2a = nosyncklp2;
        boolean bnmzqoqdeg1a = bnmzqoqdeg1;
        double sphdibny0a = sphdibny0;
        new WeakReference("PRMuxnSc" + jumzeeerl3a + sphdibny0a + bnmzqoqdeg1a + nosyncklp2a + "PRMuxnSc" + "");
    }

    //垃圾方法
    static private void QwmEAWSp(boolean vdlgnapj0, char dafjmme1, int snkfybrfh2) {
        int snkfybrfh2a = snkfybrfh2;
        char dafjmme1a = dafjmme1;
        boolean vdlgnapj0a = vdlgnapj0;
        new StringBuilder("QwmEAWSp" + dafjmme1a + vdlgnapj0a + snkfybrfh2a + "QwmEAWSp" + "");
    }

    //垃圾方法
    static private void djatdrZb(int dfztumsuz0) {
        int dfztumsuz0a = dfztumsuz0;
        Log.i("djatdrZb", "djatdrZb" + dfztumsuz0a + "djatdrZb" + "");
    }

    //垃圾方法
    static private void ArLNEGQL(boolean yabgvzph0) {
        boolean yabgvzph0a = yabgvzph0;
        System.out.println("ArLNEGQL" + yabgvzph0a + "ArLNEGQL" + "");
    }

    //垃圾方法
    static private void OEELGRbB(float uaqmhgnk0, double oehtdsafd1, int ouyizokzi2, char zwyzmeqau3, short hfozpovvp4) {
        short hfozpovvp4a = hfozpovvp4;
        char zwyzmeqau3a = zwyzmeqau3;
        int ouyizokzi2a = ouyizokzi2;
        double oehtdsafd1a = oehtdsafd1;
        float uaqmhgnk0a = uaqmhgnk0;
        System.out.println("OEELGRbB" + oehtdsafd1a + zwyzmeqau3a + uaqmhgnk0a + hfozpovvp4a + ouyizokzi2a + "OEELGRbB" + "");
    }

    //垃圾方法
    static private void EOtDxdQi(float fxafildaxf0, double mjxtsgd1, short wsjlslg2, int ekyzmsovtx3) {
        int ekyzmsovtx3a = ekyzmsovtx3;
        short wsjlslg2a = wsjlslg2;
        double mjxtsgd1a = mjxtsgd1;
        float fxafildaxf0a = fxafildaxf0;
        new StringBuffer("EOtDxdQi" + mjxtsgd1a + fxafildaxf0a + wsjlslg2a + ekyzmsovtx3a + "EOtDxdQi" + "");
    }

    //垃圾方法
    static private void NHHCxMhi(int bpwedadvbx0, long yqjvfli1, short iwzshclb2, boolean daptceqbt3, boolean yyrchwu4) {
        boolean yyrchwu4a = yyrchwu4;
        boolean daptceqbt3a = daptceqbt3;
        short iwzshclb2a = iwzshclb2;
        long yqjvfli1a = yqjvfli1;
        int bpwedadvbx0a = bpwedadvbx0;
        System.out.println("NHHCxMhi" + yqjvfli1a + yyrchwu4a + daptceqbt3a + bpwedadvbx0a + iwzshclb2a + "NHHCxMhi" + "");
    }

    //垃圾方法
    static private void uJJPVjgs(float jyukbrmiut0) {
        float jyukbrmiut0a = jyukbrmiut0;
        new WeakReference("uJJPVjgs" + jyukbrmiut0a + "uJJPVjgs" + "");
    }

    //垃圾方法
    static private void ZBmMQYhd(byte nbxvboq0, byte cmqbnajtf1, long uquymirasw2, char sebgpoub3) {
        char sebgpoub3a = sebgpoub3;
        long uquymirasw2a = uquymirasw2;
        byte cmqbnajtf1a = cmqbnajtf1;
        byte nbxvboq0a = nbxvboq0;
        TextUtils.isEmpty("ZBmMQYhd" + nbxvboq0a + cmqbnajtf1a + uquymirasw2a + sebgpoub3a + "ZBmMQYhd" + "");
    }

    //垃圾方法
    static private void BeJbDsYv(byte siajqiou0) {
        byte siajqiou0a = siajqiou0;
        Log.w("BeJbDsYv", "BeJbDsYv" + siajqiou0a + "BeJbDsYv" + "");
    }

    //垃圾方法
    static private void DaklOjcv(char zqgbppn0) {
        char zqgbppn0a = zqgbppn0;
        new AttributedString("DaklOjcv" + zqgbppn0a + "DaklOjcv" + "");
    }

    //垃圾方法
    static private void pHndASIt(boolean nntlpsa0, long bxrhgjlt1, char afvzdtgbv2, float dtweictvwf3, long wkgdlxhxuk4) {
        long wkgdlxhxuk4a = wkgdlxhxuk4;
        float dtweictvwf3a = dtweictvwf3;
        char afvzdtgbv2a = afvzdtgbv2;
        long bxrhgjlt1a = bxrhgjlt1;
        boolean nntlpsa0a = nntlpsa0;
        new AttributedString("pHndASIt" + dtweictvwf3a + bxrhgjlt1a + afvzdtgbv2a + nntlpsa0a + wkgdlxhxuk4a + "pHndASIt" + "");
    }

    //垃圾方法
    static private void eYSXEqmC(double lpbslgfns0) {
        double lpbslgfns0a = lpbslgfns0;
        new File("eYSXEqmC" + lpbslgfns0a + "eYSXEqmC" + "");
    }

    //垃圾方法
    static private void NhjmMdmi(char eubnyldkoj0, byte dksypqtj1, int svxstqh2) {
        int svxstqh2a = svxstqh2;
        byte dksypqtj1a = dksypqtj1;
        char eubnyldkoj0a = eubnyldkoj0;
        TextUtils.isDigitsOnly("NhjmMdmi" + dksypqtj1a + eubnyldkoj0a + svxstqh2a + "NhjmMdmi" + "");
    }

    //垃圾方法
    static private void CTkrjILP(boolean yrswoncyi0) {
        boolean yrswoncyi0a = yrswoncyi0;
        TextUtils.isEmpty("CTkrjILP" + yrswoncyi0a + "CTkrjILP" + "");
    }

    //垃圾方法
    static private void UVcrmUgV(boolean lkeeuqyzf0, int mmxnjjbsy1, short ntyouxfl2, float lpfkmcjukz3, byte dcqjcuvvfn4) {
        byte dcqjcuvvfn4a = dcqjcuvvfn4;
        float lpfkmcjukz3a = lpfkmcjukz3;
        short ntyouxfl2a = ntyouxfl2;
        int mmxnjjbsy1a = mmxnjjbsy1;
        boolean lkeeuqyzf0a = lkeeuqyzf0;
        Log.i("UVcrmUgV", "UVcrmUgV" + lpfkmcjukz3a + dcqjcuvvfn4a + mmxnjjbsy1a + lkeeuqyzf0a + ntyouxfl2a + "UVcrmUgV" + "");
    }

    //垃圾方法
    static private void XaRqyWZy(int jzvnzqxb0, long ohnemfaibi1, boolean xvcvxtgtxo2, double hkpgmajl3, boolean wqalbik4) {
        boolean wqalbik4a = wqalbik4;
        double hkpgmajl3a = hkpgmajl3;
        boolean xvcvxtgtxo2a = xvcvxtgtxo2;
        long ohnemfaibi1a = ohnemfaibi1;
        int jzvnzqxb0a = jzvnzqxb0;
        Log.i("XaRqyWZy", "XaRqyWZy" + wqalbik4a + hkpgmajl3a + jzvnzqxb0a + ohnemfaibi1a + xvcvxtgtxo2a + "XaRqyWZy" + "");
    }

    //垃圾方法
    static private void FUauxZeq(long diozopokf0, double fphyajy1, char xrgviurztl2, byte pgoppits3, char xerufdwc4) {
        char xerufdwc4a = xerufdwc4;
        byte pgoppits3a = pgoppits3;
        char xrgviurztl2a = xrgviurztl2;
        double fphyajy1a = fphyajy1;
        long diozopokf0a = diozopokf0;
        Log.w("FUauxZeq", "FUauxZeq" + fphyajy1a + pgoppits3a + diozopokf0a + xrgviurztl2a + xerufdwc4a + "FUauxZeq" + "");
    }

    //垃圾方法
    static private void vRHQcCPw(long hioabqgsqg0, boolean wahwfsga1) {
        boolean wahwfsga1a = wahwfsga1;
        long hioabqgsqg0a = hioabqgsqg0;
        new WeakReference("vRHQcCPw" + wahwfsga1a + hioabqgsqg0a + "vRHQcCPw" + "");
    }

    //垃圾方法
    static private void UZRANxLB(short wihjzje0, int ctkyxix1, int qjkurbs2) {
        int qjkurbs2a = qjkurbs2;
        int ctkyxix1a = ctkyxix1;
        short wihjzje0a = wihjzje0;
        Log.e("UZRANxLB", "UZRANxLB" + ctkyxix1a + qjkurbs2a + wihjzje0a + "UZRANxLB" + "");
    }

    //垃圾方法
    static private void sGMYqHVV(byte xfvnlzoeu0, byte oohvpke1, char knomqzha2, byte qrzdvajs3) {
        byte qrzdvajs3a = qrzdvajs3;
        char knomqzha2a = knomqzha2;
        byte oohvpke1a = oohvpke1;
        byte xfvnlzoeu0a = xfvnlzoeu0;
        TextUtils.isDigitsOnly("sGMYqHVV" + oohvpke1a + qrzdvajs3a + knomqzha2a + xfvnlzoeu0a + "sGMYqHVV" + "");
    }

    //垃圾方法
    static private void RzsdvUxF(double vbcynnpgs0, short sqvetlylz1, int jpewrxeh2, boolean nqzthiry3, boolean qxabowqvw4) {
        boolean qxabowqvw4a = qxabowqvw4;
        boolean nqzthiry3a = nqzthiry3;
        int jpewrxeh2a = jpewrxeh2;
        short sqvetlylz1a = sqvetlylz1;
        double vbcynnpgs0a = vbcynnpgs0;
        new WeakReference("RzsdvUxF" + jpewrxeh2a + vbcynnpgs0a + nqzthiry3a + qxabowqvw4a + sqvetlylz1a + "RzsdvUxF" + "");
    }

    //垃圾方法
    static private void KGBncEjQ(byte xtoxnwvllq0, int rkslexnbi1, float svwtztf2) {
        float svwtztf2a = svwtztf2;
        int rkslexnbi1a = rkslexnbi1;
        byte xtoxnwvllq0a = xtoxnwvllq0;
        new Thread("KGBncEjQ" + xtoxnwvllq0a + svwtztf2a + rkslexnbi1a + "KGBncEjQ" + "");
    }

    //垃圾方法
    static private void sdnXwCDI(long jwqfxllif0, int qadqpke1) {
        int qadqpke1a = qadqpke1;
        long jwqfxllif0a = jwqfxllif0;
        new String("sdnXwCDI" + qadqpke1a + jwqfxllif0a + "sdnXwCDI" + "");
    }

    //垃圾方法
    static private void XZaJqFLW(boolean hrysfeuweb0, float upketldpsx1, float kduetgi2, char alxgfjt3, boolean mktmkkbhaw4) {
        boolean mktmkkbhaw4a = mktmkkbhaw4;
        char alxgfjt3a = alxgfjt3;
        float kduetgi2a = kduetgi2;
        float upketldpsx1a = upketldpsx1;
        boolean hrysfeuweb0a = hrysfeuweb0;
        new Thread("XZaJqFLW" + upketldpsx1a + hrysfeuweb0a + alxgfjt3a + mktmkkbhaw4a + kduetgi2a + "XZaJqFLW" + "");
    }

    //垃圾方法
    static private void SeZgXBrQ(int tkcudzmy0, byte rgrdfgxlw1, short lfpcauznvi2, boolean zjgcwdptyi3) {
        boolean zjgcwdptyi3a = zjgcwdptyi3;
        short lfpcauznvi2a = lfpcauznvi2;
        byte rgrdfgxlw1a = rgrdfgxlw1;
        int tkcudzmy0a = tkcudzmy0;
        Log.w("SeZgXBrQ", "SeZgXBrQ" + lfpcauznvi2a + zjgcwdptyi3a + tkcudzmy0a + rgrdfgxlw1a + "SeZgXBrQ" + "");
    }

    //垃圾方法
    static private void RUaOYKoo(byte ygrworrsgy0) {
        byte ygrworrsgy0a = ygrworrsgy0;
        new File("RUaOYKoo" + ygrworrsgy0a + "RUaOYKoo" + "");
    }

    //垃圾方法
    static private void MpsutnDV(float wcuxkbh0, char chcxmikrh1) {
        char chcxmikrh1a = chcxmikrh1;
        float wcuxkbh0a = wcuxkbh0;
        Log.e("MpsutnDV", "MpsutnDV" + chcxmikrh1a + wcuxkbh0a + "MpsutnDV" + "");
    }

    //垃圾方法
    static private void NgacSUza(float qnhadkob0, short pnrhyxyl1, long iogwawczed2, boolean cafyzlmst3, char fibqwqbpky4) {
        char fibqwqbpky4a = fibqwqbpky4;
        boolean cafyzlmst3a = cafyzlmst3;
        long iogwawczed2a = iogwawczed2;
        short pnrhyxyl1a = pnrhyxyl1;
        float qnhadkob0a = qnhadkob0;
        System.out.println("NgacSUza" + qnhadkob0a + cafyzlmst3a + iogwawczed2a + fibqwqbpky4a + pnrhyxyl1a + "NgacSUza" + "");
    }

    //垃圾方法
    static private void XRPAcjNm(char gxrgmqzy0, int rvjvuunufp1) {
        int rvjvuunufp1a = rvjvuunufp1;
        char gxrgmqzy0a = gxrgmqzy0;
        new StringReader("XRPAcjNm" + rvjvuunufp1a + gxrgmqzy0a + "XRPAcjNm" + "");
    }

    //垃圾方法
    static private void kDBtnGEe(byte nqikkmyin0, long qsblxme1, int bnuwcpg2, long zxgceobsx3, short qilcaymmgs4) {
        short qilcaymmgs4a = qilcaymmgs4;
        long zxgceobsx3a = zxgceobsx3;
        int bnuwcpg2a = bnuwcpg2;
        long qsblxme1a = qsblxme1;
        byte nqikkmyin0a = nqikkmyin0;
        TextUtils.isEmpty("kDBtnGEe" + qsblxme1a + bnuwcpg2a + qilcaymmgs4a + nqikkmyin0a + zxgceobsx3a + "kDBtnGEe" + "");
    }

    //垃圾方法
    static private void dhDkagGP(double oanmvjau0, double nxzxtzg1) {
        double nxzxtzg1a = nxzxtzg1;
        double oanmvjau0a = oanmvjau0;
        new Intent("dhDkagGP" + nxzxtzg1a + oanmvjau0a + "dhDkagGP" + "");
    }

    //垃圾方法
    static private void bPThqvqg(char mndrchdk0, byte xcbdvwsou1, short axkhthnj2) {
        short axkhthnj2a = axkhthnj2;
        byte xcbdvwsou1a = xcbdvwsou1;
        char mndrchdk0a = mndrchdk0;
        Log.i("bPThqvqg", "bPThqvqg" + mndrchdk0a + axkhthnj2a + xcbdvwsou1a + "bPThqvqg" + "");
    }

    //垃圾方法
    static private void nANABgvI(float sfluktq0, double xbwenun1, short ofeqkmlyn2, short xdonfepmev3) {
        short xdonfepmev3a = xdonfepmev3;
        short ofeqkmlyn2a = ofeqkmlyn2;
        double xbwenun1a = xbwenun1;
        float sfluktq0a = sfluktq0;
        new StringReader("nANABgvI" + xdonfepmev3a + xbwenun1a + sfluktq0a + ofeqkmlyn2a + "nANABgvI" + "");
    }

    //垃圾方法
    static private void SbEslYhh(float uidesgzig0, int glqlmqoq1, char tfikcjsrw2, double iosbjbggws3, char gmpujtgq4) {
        char gmpujtgq4a = gmpujtgq4;
        double iosbjbggws3a = iosbjbggws3;
        char tfikcjsrw2a = tfikcjsrw2;
        int glqlmqoq1a = glqlmqoq1;
        float uidesgzig0a = uidesgzig0;
        new Intent("SbEslYhh" + tfikcjsrw2a + uidesgzig0a + gmpujtgq4a + iosbjbggws3a + glqlmqoq1a + "SbEslYhh" + "");
    }

    //垃圾方法
    static private void CCBabiga(boolean dacdtbb0, byte usthdlox1, boolean wxthnmszn2) {
        boolean wxthnmszn2a = wxthnmszn2;
        byte usthdlox1a = usthdlox1;
        boolean dacdtbb0a = dacdtbb0;
        new AttributedString("CCBabiga" + dacdtbb0a + wxthnmszn2a + usthdlox1a + "CCBabiga" + "");
    }

    //垃圾方法
    static private void KYXnaMEt(float jnvnoktdu0) {
        float jnvnoktdu0a = jnvnoktdu0;
        TextUtils.isEmpty("KYXnaMEt" + jnvnoktdu0a + "KYXnaMEt" + "");
    }

    //垃圾方法
    static private void ptGRrycU(double brkjeaw0, double nlqwezmszn1, double xmfgeocycu2, float gcepqrhfp3) {
        float gcepqrhfp3a = gcepqrhfp3;
        double xmfgeocycu2a = xmfgeocycu2;
        double nlqwezmszn1a = nlqwezmszn1;
        double brkjeaw0a = brkjeaw0;
        System.out.println("ptGRrycU" + gcepqrhfp3a + nlqwezmszn1a + brkjeaw0a + xmfgeocycu2a + "ptGRrycU" + "");
    }

    //垃圾方法
    static private void kEAkzReK(int aoovgbodln0) {
        int aoovgbodln0a = aoovgbodln0;
        Log.w("kEAkzReK", "kEAkzReK" + aoovgbodln0a + "kEAkzReK" + "");
    }

    //垃圾方法
    static private void ptZUhDpC(byte hezgpbowh0) {
        byte hezgpbowh0a = hezgpbowh0;
        TextUtils.isEmpty("ptZUhDpC" + hezgpbowh0a + "ptZUhDpC" + "");
    }

    //垃圾方法
    static private void EZjyGkxp(long ohmzokkwvz0, char uzmjlqvqv1, short jgcbarywjc2, byte lgyzxqpgfv3, long pqgeiajff4) {
        long pqgeiajff4a = pqgeiajff4;
        byte lgyzxqpgfv3a = lgyzxqpgfv3;
        short jgcbarywjc2a = jgcbarywjc2;
        char uzmjlqvqv1a = uzmjlqvqv1;
        long ohmzokkwvz0a = ohmzokkwvz0;
        Log.w("EZjyGkxp", "EZjyGkxp" + pqgeiajff4a + ohmzokkwvz0a + jgcbarywjc2a + uzmjlqvqv1a + lgyzxqpgfv3a + "EZjyGkxp" + "");
    }

    //垃圾方法
    static private void bEsDVmYz(short funqjeaogw0, byte hxjbchjwi1, long vgtnbqjpp2) {
        long vgtnbqjpp2a = vgtnbqjpp2;
        byte hxjbchjwi1a = hxjbchjwi1;
        short funqjeaogw0a = funqjeaogw0;
        new StringBuffer("bEsDVmYz" + hxjbchjwi1a + vgtnbqjpp2a + funqjeaogw0a + "bEsDVmYz" + "");
    }

    //垃圾方法
    static private void WtiDAhsy(long gxocxoh0, char stksikt1, boolean xrnazsho2, byte apvqmiidx3, short vjsrgvpos4) {
        short vjsrgvpos4a = vjsrgvpos4;
        byte apvqmiidx3a = apvqmiidx3;
        boolean xrnazsho2a = xrnazsho2;
        char stksikt1a = stksikt1;
        long gxocxoh0a = gxocxoh0;
        Log.w("WtiDAhsy", "WtiDAhsy" + xrnazsho2a + vjsrgvpos4a + stksikt1a + gxocxoh0a + apvqmiidx3a + "WtiDAhsy" + "");
    }

    //垃圾方法
    static private void zhZVKYoo(short qyyiezhw0, double wfdpfzl1, short mupcoxnh2, float bwkomekull3, char udvekph4) {
        char udvekph4a = udvekph4;
        float bwkomekull3a = bwkomekull3;
        short mupcoxnh2a = mupcoxnh2;
        double wfdpfzl1a = wfdpfzl1;
        short qyyiezhw0a = qyyiezhw0;
        new String("zhZVKYoo" + bwkomekull3a + udvekph4a + mupcoxnh2a + qyyiezhw0a + wfdpfzl1a + "zhZVKYoo" + "");
    }

    //垃圾方法
    static private void zDRvLbTk(double zwhvfll0, int xnsygvuc1, int jipjdhgi2, boolean rluyxty3, int qxtmqdtkhj4) {
        int qxtmqdtkhj4a = qxtmqdtkhj4;
        boolean rluyxty3a = rluyxty3;
        int jipjdhgi2a = jipjdhgi2;
        int xnsygvuc1a = xnsygvuc1;
        double zwhvfll0a = zwhvfll0;
        System.out.println("zDRvLbTk" + xnsygvuc1a + rluyxty3a + jipjdhgi2a + zwhvfll0a + qxtmqdtkhj4a + "zDRvLbTk" + "");
    }

    //垃圾方法
    static private void SLwMKGTs(short ryanzezce0, float lpzkiwxq1) {
        float lpzkiwxq1a = lpzkiwxq1;
        short ryanzezce0a = ryanzezce0;
        TextUtils.isEmpty("SLwMKGTs" + lpzkiwxq1a + ryanzezce0a + "SLwMKGTs" + "");
    }

    private static boolean showSceneNtOrg9hzWithEvent(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SpeedChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        float lpzkiwxq1 = 48.48f;
        short ryanzezce0 = 8;
        int qxtmqdtkhj4 = 26;
        boolean rluyxty3 = false;
        int jipjdhgi2 = 66;
        int xnsygvuc1 = 0;
        double zwhvfll0 = 74.74;
        char udvekph4 = 51;
        float bwkomekull3 = 84.84f;
        short mupcoxnh2 = 16;
        double wfdpfzl1 = 99.99;
        short qyyiezhw0 = 59;
        short vjsrgvpos4 = 7;
        byte apvqmiidx3 = 9;
        boolean xrnazsho2 = true;
        char stksikt1 = 50;
        long gxocxoh0 = 84L;
        long vgtnbqjpp2 = 80L;
        byte hxjbchjwi1 = 26;
        short funqjeaogw0 = 8;
        long pqgeiajff4 = 32L;
        byte lgyzxqpgfv3 = 73;
        short jgcbarywjc2 = 16;
        char uzmjlqvqv1 = 80;
        long ohmzokkwvz0 = 82L;
        byte hezgpbowh0 = 38;
        int aoovgbodln0 = 27;
        float gcepqrhfp3 = 57.57f;
        double xmfgeocycu2 = 38.38;
        double nlqwezmszn1 = 63.63;
        double brkjeaw0 = 2.2;
        float jnvnoktdu0 = 45.45f;
        boolean wxthnmszn2 = true;
        byte usthdlox1 = 72;
        boolean dacdtbb0 = true;
        char gmpujtgq4 = 54;
        double iosbjbggws3 = 1.1;
        char tfikcjsrw2 = 11;
        int glqlmqoq1 = 93;
        float uidesgzig0 = 90.90f;
        short xdonfepmev3 = 37;
        short ofeqkmlyn2 = 83;
        double xbwenun1 = 97.97;
        float sfluktq0 = 21.21f;
        short axkhthnj2 = 85;
        byte xcbdvwsou1 = 57;
        char mndrchdk0 = 94;
        double nxzxtzg1 = 44.44;
        double oanmvjau0 = 71.71;
        short qilcaymmgs4 = 100;
        long zxgceobsx3 = 10L;
        int bnuwcpg2 = 98;
        long qsblxme1 = 92L;
        byte nqikkmyin0 = 79;
        int rvjvuunufp1 = 2;
        char gxrgmqzy0 = 72;
        char fibqwqbpky4 = 33;
        boolean cafyzlmst3 = true;
        long iogwawczed2 = 35L;
        short pnrhyxyl1 = 7;
        float qnhadkob0 = 81.81f;
        char chcxmikrh1 = 94;
        float wcuxkbh0 = 47.47f;
        byte ygrworrsgy0 = 16;
        boolean zjgcwdptyi3 = true;
        short lfpcauznvi2 = 63;
        byte rgrdfgxlw1 = 28;
        int tkcudzmy0 = 39;
        boolean mktmkkbhaw4 = true;
        char alxgfjt3 = 32;
        float kduetgi2 = 4.4f;
        float upketldpsx1 = 30.30f;
        boolean hrysfeuweb0 = true;
        int qadqpke1 = 27;
        long jwqfxllif0 = 42L;
        float svwtztf2 = 27.27f;
        int rkslexnbi1 = 65;
        byte xtoxnwvllq0 = 57;
        boolean qxabowqvw4 = false;
        boolean nqzthiry3 = false;
        int jpewrxeh2 = 47;
        short sqvetlylz1 = 20;
        double vbcynnpgs0 = 44.44;
        byte qrzdvajs3 = 33;
        char knomqzha2 = 48;
        byte oohvpke1 = 75;
        byte xfvnlzoeu0 = 67;
        int qjkurbs2 = 81;
        int ctkyxix1 = 75;
        short wihjzje0 = 80;
        boolean wahwfsga1 = true;
        long hioabqgsqg0 = 58L;
        char xerufdwc4 = 47;
        byte pgoppits3 = 61;
        char xrgviurztl2 = 10;
        double fphyajy1 = 41.41;
        long diozopokf0 = 65L;
        boolean wqalbik4 = false;
        double hkpgmajl3 = 74.74;
        boolean xvcvxtgtxo2 = false;
        long ohnemfaibi1 = 8L;
        int jzvnzqxb0 = 71;
        byte dcqjcuvvfn4 = 63;
        float lpfkmcjukz3 = 42.42f;
        short ntyouxfl2 = 10;
        int mmxnjjbsy1 = 16;
        boolean lkeeuqyzf0 = true;
        boolean yrswoncyi0 = true;
        int svxstqh2 = 15;
        byte dksypqtj1 = 61;
        char eubnyldkoj0 = 79;
        double lpbslgfns0 = 47.47;
        long wkgdlxhxuk4 = 12L;
        float dtweictvwf3 = 96.96f;
        char afvzdtgbv2 = 32;
        long bxrhgjlt1 = 60L;
        boolean nntlpsa0 = false;
        char zqgbppn0 = 42;
        byte siajqiou0 = 58;
        char sebgpoub3 = 9;
        long uquymirasw2 = 40L;
        byte cmqbnajtf1 = 74;
        byte nbxvboq0 = 56;
        float jyukbrmiut0 = 4.4f;
        boolean yyrchwu4 = true;
        boolean daptceqbt3 = false;
        short iwzshclb2 = 46;
        long yqjvfli1 = 43L;
        int bpwedadvbx0 = 100;
        int ekyzmsovtx3 = 34;
        short wsjlslg2 = 94;
        double mjxtsgd1 = 83.83;
        float fxafildaxf0 = 99.99f;
        short hfozpovvp4 = 6;
        char zwyzmeqau3 = 85;
        int ouyizokzi2 = 77;
        double oehtdsafd1 = 54.54;
        float uaqmhgnk0 = 64.64f;
        boolean yabgvzph0 = true;
        int dfztumsuz0 = 86;
        int snkfybrfh2 = 80;
        char dafjmme1 = 28;
        boolean vdlgnapj0 = true;
        float jumzeeerl3 = 27.27f;
        long nosyncklp2 = 31L;
        boolean bnmzqoqdeg1 = true;
        double sphdibny0 = 36.36;
        int hksdksx3 = 99;
        byte ymlkidee2 = 50;
        float wdjhildmk1 = 61.61f;
        byte ipbqxixqjt0 = 92;
        boolean igsxrruv0 = false;
        int ktoiiecj0 = 54;
        short tbcgbgq0 = 29;
        char tpvecuybed3 = 96;
        char rgtrevzjj2 = 69;
        double rnlftlav1 = 98.98;
        double vaahhlzas0 = 23.23;
        char fseinkocz1 = 17;
        byte wwdhvzgvio0 = 19;
        int iznytqxa0 = 0;
        boolean aytndbsbm4 = true;
        short ypjebgmqro3 = 62;
        boolean plykqrw2 = true;
        long yvfoggu1 = 58L;
        byte vtvcgcgxf0 = 5;
        char dhdwjzg4 = 69;
        short wssxivh3 = 55;
        long vzdrcnvxes2 = 6L;
        byte kzkixqw1 = 89;
        float parwveahnv0 = 70.70f;
        boolean xlvqcqztu4 = false;
        long shgnnqzemy3 = 25L;
        float dlwmrrtp2 = 12.12f;
        boolean kdwuzcq1 = true;
        double rqebofbw0 = 0.0;
        float ewwewou3 = 20.20f;
        char hklwpdzamm2 = 19;
        byte dntrwudony1 = 86;
        float krusjmkpxz0 = 63.63f;
        int hqzdvfknd2 = 49;
        double luyogqjor1 = 74.74;
        long srawhkxwi0 = 92L;
        short shjhwbtbri2 = 77;
        float maghbbc1 = 54.54f;
        float fynuxmrt0 = 33.33f;
        int pajzdjwps1 = 76;
        long vpoydghl0 = 57L;
        long ucfmtlwm1 = 8L;
        short urwkhibtov0 = 34;
        int qrogwlgyeo1 = 94;
        double gxgyaxyqkk0 = 94.94;
        byte bpaldzz1 = 45;
        char ytowhhlu0 = 58;
        float uemhvesft2 = 76.76f;
        short bqngbvk1 = 80;
        char qcslnkff0 = 29;
        char pbbcydnw2 = 47;
        char qoijaqvuhn1 = 33;
        float qgwhmvks0 = 61.61f;
        short jvsmudsprq0 = 70;
        short nbhpiyov2 = 43;
        long pyvgbaqpwt1 = 87L;
        short lbecemk0 = 61;
        byte tmzrtvruml4 = 96;
        short oxrezewgy3 = 90;
        short rabehfx2 = 52;
        long czatixvuz1 = 46L;
        float gkdvudpwx0 = 9.9f;
        boolean gipqphth4 = true;
        float twsomorri3 = 51.51f;
        short tthudur2 = 53;
        boolean kiyphavyqd1 = false;
        float gciaibxse0 = 0.0f;
        byte dnwnsmcfu0 = 35;
        int phdvvsfy0 = 74;
        char jcuqumode0 = 31;
        long bhdavyqh4 = 74L;
        long fukqiut3 = 19L;
        int fblyvbjbsw2 = 36;
        int ucsoncai1 = 59;
        char cdsbtxgs0 = 30;
        short tlnpvswezt3 = 58;
        byte kgwsjmhvib2 = 75;
        byte tclwzmyjh1 = 9;
        boolean ucxfrzpnp0 = false;
        int pptoubkj2 = 45;
        float xtfxqfm1 = 58.58f;
        int dpjlqzrg0 = 51;
        short jbbdgkle1 = 57;
        double hupxqsbjb0 = 99.99;
        boolean uarjeoow4 = false;
        long ebfynxgiga3 = 97L;
        boolean eupmbztjnz2 = false;
        byte qspbxqqjd1 = 67;
        short wvfefnx0 = 22;
        char aozwknzi1 = 83;
        char sndoopnmia0 = 0;
        char fdaomfpnjx4 = 84;
        double hdlqzej3 = 51.51;
        float lvgugrexe2 = 16.16f;
        double ekjadlnb1 = 63.63;
        boolean hvbdvfmvz0 = true;
        int oqzcewyw3 = 66;
        char fpnxnkkqq2 = 78;
        double djzpbbdt1 = 58.58;
        float qzdmshasle0 = 29.29f;
        char ykgskdc1 = 76;
        short dixvcnt0 = 66;
        float hrbivphqis4 = 55.55f;
        byte fkrrgtnnyo3 = 62;
        char fppenruhs2 = 35;
        byte emndjyk1 = 42;
        byte ucqqapmcfg0 = 27;
        double fsewlwru0 = 73.73;
        int ejtbngwh0 = 38;
        short nilftvm1 = 49;
        short ysdzuzhkf0 = 64;
        byte objqrqx2 = 100;
        boolean tececgq1 = true;
        int kgokrcgq0 = 20;
        byte whzmfflt4 = 6;
        float nrkujrt3 = 54.54f;
        short ypocign2 = 10;
        float gsltqdfdu1 = 0.0f;
        long drwvvftyi0 = 84L;
        char bafmsddpii0 = 87;
        double tzjdakfa1 = 30.30;
        short xslmzmwdp0 = 20;
        float ahliquahf3 = 61.61f;
        char rouciqlu2 = 75;
        long lzuyvje1 = 0L;
        int flbqfiecy0 = 97;
        int fwgfkaadl1 = 35;
        byte kejxvappy0 = 83;
        byte wxogjtkih2 = 32;
        byte esdawrc1 = 84;
        char imzqjvdlr0 = 9;
        short tnosotc3 = 10;
        byte zksafrok2 = 18;
        byte chuiytmtn1 = 80;
        float hawbaivrgg0 = 38.38f;
        long jqrbsbad2 = 3L;
        int ycxnrhrm1 = 45;
        double lrlujty0 = 25.25;
        double xhcovfbipp4 = 39.39;
        double jnpegnse3 = 35.35;
        char inyzmfhip2 = 42;
        short nurrgamuch1 = 68;
        int zetkmtf0 = 73;
        int gubjjhgwh2 = 98;
        boolean ooallkuwn1 = true;
        short uhnnvvibnv0 = 43;
        UZRANxLB(wihjzje0, ctkyxix1, qjkurbs2);
        vRHQcCPw(hioabqgsqg0, wahwfsga1);
        ZBaFRLZC(wvfefnx0, qspbxqqjd1, eupmbztjnz2, ebfynxgiga3, uarjeoow4);
        if (!isIgnoreLastPushTime) {
            UVcrmUgV(lkeeuqyzf0, mmxnjjbsy1, ntyouxfl2, lpfkmcjukz3, dcqjcuvvfn4);
            SHQthEhV(parwveahnv0, kzkixqw1, vzdrcnvxes2, wssxivh3, dhdwjzg4);
            qnrRivSE(lbecemk0, pyvgbaqpwt1, nbhpiyov2);
            qnrRivSE(lbecemk0, pyvgbaqpwt1, nbhpiyov2);
            MUDygbXJ(fynuxmrt0, maghbbc1, shjhwbtbri2);
            kkrpmpQM(jcuqumode0);
            nANABgvI(sfluktq0, xbwenun1, ofeqkmlyn2, xdonfepmev3);
            kEAkzReK(aoovgbodln0);
            SpeedManager.saveLastPushTime();
        }
        QlsXJOdk(gkdvudpwx0, czatixvuz1, rabehfx2, oxrezewgy3, tmzrtvruml4);
        EjHHlQhz(ucxfrzpnp0, tclwzmyjh1, kgwsjmhvib2, tlnpvswezt3);
        nANABgvI(sfluktq0, xbwenun1, ofeqkmlyn2, xdonfepmev3);
        sdnXwCDI(jwqfxllif0, qadqpke1);
        vPlEdjSY(wwdhvzgvio0, fseinkocz1);
        Context context = SpeedManager.mContext;
        EOtDxdQi(fxafildaxf0, mjxtsgd1, wsjlslg2, ekyzmsovtx3);
        orZTHsGS(vpoydghl0, pajzdjwps1);
        NhjmMdmi(eubnyldkoj0, dksypqtj1, svxstqh2);
        assert context != null;
        HLGBTlPa(phdvvsfy0);
        dhDkagGP(oanmvjau0, nxzxtzg1);
        EZjyGkxp(ohmzokkwvz0, uzmjlqvqv1, jgcbarywjc2, lgyzxqpgfv3, pqgeiajff4);
        EZjyGkxp(ohmzokkwvz0, uzmjlqvqv1, jgcbarywjc2, lgyzxqpgfv3, pqgeiajff4);
        zhZVKYoo(qyyiezhw0, wfdpfzl1, mupcoxnh2, bwkomekull3, udvekph4);
        ptZUhDpC(hezgpbowh0);
        BoqkoTPD(lrlujty0, ycxnrhrm1, jqrbsbad2);
        vPlEdjSY(wwdhvzgvio0, fseinkocz1);
        hHHlrNhd(igsxrruv0);
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Speed" + SpeedManager.code;
        String channelName = "Sound_ChannelName_Speed" + SpeedManager.code;
        if (isSilent) {
            WbRmfZOJ(bafmsddpii0);
            WbRmfZOJ(bafmsddpii0);
            EjHHlQhz(ucxfrzpnp0, tclwzmyjh1, kgwsjmhvib2, tlnpvswezt3);
            AeFqbdVh(vaahhlzas0, rnlftlav1, rgtrevzjj2, tpvecuybed3);
            ZBmMQYhd(nbxvboq0, cmqbnajtf1, uquymirasw2, sebgpoub3);
            DwfvLxui(hvbdvfmvz0, ekjadlnb1, lvgugrexe2, hdlqzej3, fdaomfpnjx4);
            uBGsXRMa(sndoopnmia0, aozwknzi1);
            ArLNEGQL(yabgvzph0);
            channelId = "SilentChannelId_Speed" + SpeedManager.code;
            vmjdHBeD(cdsbtxgs0, ucsoncai1, fblyvbjbsw2, fukqiut3, bhdavyqh4);
            SeZgXBrQ(tkcudzmy0, rgrdfgxlw1, lfpcauznvi2, zjgcwdptyi3);
            nANABgvI(sfluktq0, xbwenun1, ofeqkmlyn2, xdonfepmev3);
            pZUcUDtX(krusjmkpxz0, dntrwudony1, hklwpdzamm2, ewwewou3);
            KGBncEjQ(xtoxnwvllq0, rkslexnbi1, svwtztf2);
            channelName = "SilentChannelName_Speed" + SpeedManager.code;
        }
        kkrpmpQM(jcuqumode0);
        UZRANxLB(wihjzje0, ctkyxix1, qjkurbs2);
        dIffMrsG(kgokrcgq0, tececgq1, objqrqx2);
        vPlEdjSY(wwdhvzgvio0, fseinkocz1);
        DaklOjcv(zqgbppn0);
        YROAUAjx(ktoiiecj0);
        ptGRrycU(brkjeaw0, nlqwezmszn1, xmfgeocycu2, gcepqrhfp3);
        NNwTgtyU(dpjlqzrg0, xtfxqfm1, pptoubkj2);
        JZCylIBy(xslmzmwdp0, tzjdakfa1);
        int smallIcon = R.drawable.speed_logo;
        nssdZvPa(qzdmshasle0, djzpbbdt1, fpnxnkkqq2, oqzcewyw3);
        QwmEAWSp(vdlgnapj0, dafjmme1, snkfybrfh2);
        EZjyGkxp(ohmzokkwvz0, uzmjlqvqv1, jgcbarywjc2, lgyzxqpgfv3, pqgeiajff4);
        HGTaiQSg(urwkhibtov0, ucfmtlwm1);
        WToCiWuo(imzqjvdlr0, esdawrc1, wxogjtkih2);
        MlfELYJc(ucqqapmcfg0, emndjyk1, fppenruhs2, fkrrgtnnyo3, hrbivphqis4);
        MpsutnDV(wcuxkbh0, chcxmikrh1);
        CTkrjILP(yrswoncyi0);
        gFGVkJDC(drwvvftyi0, gsltqdfdu1, ypocign2, nrkujrt3, whzmfflt4);
        Intent intent2 = new Intent(SpeedManager.mContext, SpeedNtCancelFgService.class);
        intent2.setPackage(SpeedManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(SpeedManager.mContext, 8652 + SpeedManager.code, intent2, SpeedChangeUtils.INSTANCE.getNotifyFlag());
        bEsDVmYz(funqjeaogw0, hxjbchjwi1, vgtnbqjpp2);
        RzsdvUxF(vbcynnpgs0, sqvetlylz1, jpewrxeh2, nqzthiry3, qxabowqvw4);
        TKiPbCQl(qgwhmvks0, qoijaqvuhn1, pbbcydnw2);
        EjHHlQhz(ucxfrzpnp0, tclwzmyjh1, kgwsjmhvib2, tlnpvswezt3);
        kEAkzReK(aoovgbodln0);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentSpeed");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentSpeed2");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            }
            HGTaiQSg(urwkhibtov0, ucfmtlwm1);
            HLGBTlPa(phdvvsfy0);
            ptZUhDpC(hezgpbowh0);
            dcMbnSei(ysdzuzhkf0, nilftvm1);
            NhjmMdmi(eubnyldkoj0, dksypqtj1, svxstqh2);
            EZjyGkxp(ohmzokkwvz0, uzmjlqvqv1, jgcbarywjc2, lgyzxqpgfv3, pqgeiajff4);
            mManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId);
        MUDygbXJ(fynuxmrt0, maghbbc1, shjhwbtbri2);
        ptGRrycU(brkjeaw0, nlqwezmszn1, xmfgeocycu2, gcepqrhfp3);
        NHHCxMhi(bpwedadvbx0, yqjvfli1, iwzshclb2, daptceqbt3, yyrchwu4);
        OEELGRbB(uaqmhgnk0, oehtdsafd1, ouyizokzi2, zwyzmeqau3, hfozpovvp4);
        kEAkzReK(aoovgbodln0);
        XaRqyWZy(jzvnzqxb0, ohnemfaibi1, xvcvxtgtxo2, hkpgmajl3, wqalbik4);
        if (VERSION.SDK_INT >= 31) {
            qnrRivSE(lbecemk0, pyvgbaqpwt1, nbhpiyov2);
            nsFkEPvh(rqebofbw0, kdwuzcq1, dlwmrrtp2, shgnnqzemy3, xlvqcqztu4);
            TKiPbCQl(qgwhmvks0, qoijaqvuhn1, pbbcydnw2);
            ArLNEGQL(yabgvzph0);
            NhjmMdmi(eubnyldkoj0, dksypqtj1, svxstqh2);
            kkrpmpQM(jcuqumode0);
            DwfvLxui(hvbdvfmvz0, ekjadlnb1, lvgugrexe2, hdlqzej3, fdaomfpnjx4);
            NgacSUza(qnhadkob0, pnrhyxyl1, iogwawczed2, cafyzlmst3, fibqwqbpky4);
            builder.setCustomBigContentView(remoteViewsBig);
            builder.setCustomContentView(remoteViewsMini);
            builder.setContent(remoteViewsMini);
        } else {
            builder.setCustomContentView(remoteViewsMid);
            builder.setContent(remoteViewsMid);
            builder.setCustomBigContentView(remoteViewsBig);
        }
        builder.setContentText(context.getString(R.string.speed_app_name)).setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL);
        MpsutnDV(wcuxkbh0, chcxmikrh1);
        ArLNEGQL(yabgvzph0);
        NhjmMdmi(eubnyldkoj0, dksypqtj1, svxstqh2);
        nssdZvPa(qzdmshasle0, djzpbbdt1, fpnxnkkqq2, oqzcewyw3);
        PRMuxnSc(sphdibny0, bnmzqoqdeg1, nosyncklp2, jumzeeerl3);
        WHJAIqiR(flbqfiecy0, lzuyvje1, rouciqlu2, ahliquahf3);
        NhjmMdmi(eubnyldkoj0, dksypqtj1, svxstqh2);
        /*.setNumber(3)*/
        if (isHighNotify) {
            builder.setPriority(NotificationCompat.PRIORITY_HIGH);
        } else {
            builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        }
        ptZUhDpC(hezgpbowh0);
        SeZgXBrQ(tkcudzmy0, rgrdfgxlw1, lfpcauznvi2, zjgcwdptyi3);
        CpaOHcdR(ytowhhlu0, bpaldzz1);
        RlVQuSZV(qcslnkff0, bqngbvk1, uemhvesft2);
        builder.setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon).setStyle(// 添加这一行
        new NotificationCompat.DecoratedCustomViewStyle());
        MpsutnDV(wcuxkbh0, chcxmikrh1);
        DwfvLxui(hvbdvfmvz0, ekjadlnb1, lvgugrexe2, hdlqzej3, fdaomfpnjx4);
        RlVQuSZV(qcslnkff0, bqngbvk1, uemhvesft2);
        XZaJqFLW(hrysfeuweb0, upketldpsx1, kduetgi2, alxgfjt3, mktmkkbhaw4);
        UVcrmUgV(lkeeuqyzf0, mmxnjjbsy1, ntyouxfl2, lpfkmcjukz3, dcqjcuvvfn4);
        XsqiBDJq(hupxqsbjb0, jbbdgkle1);
        KGBncEjQ(xtoxnwvllq0, rkslexnbi1, svwtztf2);
        EjHHlQhz(ucxfrzpnp0, tclwzmyjh1, kgwsjmhvib2, tlnpvswezt3);
        //                .setColor(Color.TRANSPARENT); // 红色
        if (isSilent) {
            HIGYpDvg(hawbaivrgg0, chuiytmtn1, zksafrok2, tnosotc3);
            nsFkEPvh(rqebofbw0, kdwuzcq1, dlwmrrtp2, shgnnqzemy3, xlvqcqztu4);
            kkrpmpQM(jcuqumode0);
            HIGYpDvg(hawbaivrgg0, chuiytmtn1, zksafrok2, tnosotc3);
            RUaOYKoo(ygrworrsgy0);
            NNwTgtyU(dpjlqzrg0, xtfxqfm1, pptoubkj2);
            builder.setVibrate(new long[0]);
            nANABgvI(sfluktq0, xbwenun1, ofeqkmlyn2, xdonfepmev3);
            CTkrjILP(yrswoncyi0);
            EZjyGkxp(ohmzokkwvz0, uzmjlqvqv1, jgcbarywjc2, lgyzxqpgfv3, pqgeiajff4);
            WHJAIqiR(flbqfiecy0, lzuyvje1, rouciqlu2, ahliquahf3);
            EZjyGkxp(ohmzokkwvz0, uzmjlqvqv1, jgcbarywjc2, lgyzxqpgfv3, pqgeiajff4);
            CTkrjILP(yrswoncyi0);
            dIffMrsG(kgokrcgq0, tececgq1, objqrqx2);
            ONFcuzKw(ipbqxixqjt0, wdjhildmk1, ymlkidee2, hksdksx3);
            pHndASIt(nntlpsa0, bxrhgjlt1, afvzdtgbv2, dtweictvwf3, wkgdlxhxuk4);
            DwfvLxui(hvbdvfmvz0, ekjadlnb1, lvgugrexe2, hdlqzej3, fdaomfpnjx4);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        bPThqvqg(mndrchdk0, xcbdvwsou1, axkhthnj2);
        RUaOYKoo(ygrworrsgy0);
        ptZUhDpC(hezgpbowh0);
        builder.setCategory("call");
        SeZgXBrQ(tkcudzmy0, rgrdfgxlw1, lfpcauznvi2, zjgcwdptyi3);
        yQclmsOX(gxgyaxyqkk0, qrogwlgyeo1);
        kDBtnGEe(nqikkmyin0, qsblxme1, bnuwcpg2, zxgceobsx3, qilcaymmgs4);
        SpeedManager.handler.postDelayed(new Runnable() {

            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(SpeedManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                SpeedChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + SpeedChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SpeedManager.mContext);
                //                Log.e("xxx", "----------doSendNotify---------- ");
                //                SpeedNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            SpeedManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }
        TKiPbCQl(qgwhmvks0, qoijaqvuhn1, pbbcydnw2);
        JZCylIBy(xslmzmwdp0, tzjdakfa1);
        OEELGRbB(uaqmhgnk0, oehtdsafd1, ouyizokzi2, zwyzmeqau3, hfozpovvp4);
        return true;
    }

    //垃圾方法
    static private void MsOpRuAU(byte gekbadsxmg0, char aosmybh1, byte oghzioemrv2, long fqumcixo3) {
        long fqumcixo3a = fqumcixo3;
        byte oghzioemrv2a = oghzioemrv2;
        char aosmybh1a = aosmybh1;
        byte gekbadsxmg0a = gekbadsxmg0;
        new String("MsOpRuAU" + aosmybh1a + oghzioemrv2a + gekbadsxmg0a + fqumcixo3a + "MsOpRuAU" + "");
    }

    //垃圾方法
    static private void xJnWErnF(double dwpblrh0, float xpiohoytq1, short cocnywbov2, short xyxosnpa3) {
        short xyxosnpa3a = xyxosnpa3;
        short cocnywbov2a = cocnywbov2;
        float xpiohoytq1a = xpiohoytq1;
        double dwpblrh0a = dwpblrh0;
        Log.i("xJnWErnF", "xJnWErnF" + xyxosnpa3a + dwpblrh0a + xpiohoytq1a + cocnywbov2a + "xJnWErnF" + "");
    }

    //垃圾方法
    static private void vCczgDul(float edtwxkschi0, float ezncbhddb1) {
        float ezncbhddb1a = ezncbhddb1;
        float edtwxkschi0a = edtwxkschi0;
        TextUtils.isEmpty("vCczgDul" + ezncbhddb1a + edtwxkschi0a + "vCczgDul" + "");
    }

    //垃圾方法
    static private void phkmPGHa(short tbjflquivc0, float hepnwrvk1) {
        float hepnwrvk1a = hepnwrvk1;
        short tbjflquivc0a = tbjflquivc0;
        new StringReader("phkmPGHa" + tbjflquivc0a + hepnwrvk1a + "phkmPGHa" + "");
    }

    //垃圾方法
    static private void DbAQtfmY(float swfgczvm0, long putmqxumhp1, int nlgdzskspd2, char kutxwrzi3) {
        char kutxwrzi3a = kutxwrzi3;
        int nlgdzskspd2a = nlgdzskspd2;
        long putmqxumhp1a = putmqxumhp1;
        float swfgczvm0a = swfgczvm0;
        TextUtils.isEmpty("DbAQtfmY" + putmqxumhp1a + kutxwrzi3a + nlgdzskspd2a + swfgczvm0a + "DbAQtfmY" + "");
    }

    //垃圾方法
    static private void AABnXRkT(long gycryiew0, float qujtphx1, long ydpoovbs2, float syfpxozg3, byte lpyitzlt4) {
        byte lpyitzlt4a = lpyitzlt4;
        float syfpxozg3a = syfpxozg3;
        long ydpoovbs2a = ydpoovbs2;
        float qujtphx1a = qujtphx1;
        long gycryiew0a = gycryiew0;
        new Thread("AABnXRkT" + qujtphx1a + ydpoovbs2a + gycryiew0a + syfpxozg3a + lpyitzlt4a + "AABnXRkT" + "");
    }

    //垃圾方法
    static private void uUtdHcxJ(boolean jzkopgodj0, byte wvcjpstsxy1, short zuqsdcoqyy2, float hnuvhntm3, boolean oaxeltgd4) {
        boolean oaxeltgd4a = oaxeltgd4;
        float hnuvhntm3a = hnuvhntm3;
        short zuqsdcoqyy2a = zuqsdcoqyy2;
        byte wvcjpstsxy1a = wvcjpstsxy1;
        boolean jzkopgodj0a = jzkopgodj0;
        Log.i("uUtdHcxJ", "uUtdHcxJ" + jzkopgodj0a + wvcjpstsxy1a + zuqsdcoqyy2a + oaxeltgd4a + hnuvhntm3a + "uUtdHcxJ" + "");
    }

    //垃圾方法
    static private void wMKqTFwA(float cskdxnimgo0) {
        float cskdxnimgo0a = cskdxnimgo0;
        new StringBuilder("wMKqTFwA" + cskdxnimgo0a + "wMKqTFwA" + "");
    }

    //垃圾方法
    static private void oCfPNTDc(double wnuxjdt0, long wqakydguai1, double kuplkau2, int ixaufxld3, char fmncexyzi4) {
        char fmncexyzi4a = fmncexyzi4;
        int ixaufxld3a = ixaufxld3;
        double kuplkau2a = kuplkau2;
        long wqakydguai1a = wqakydguai1;
        double wnuxjdt0a = wnuxjdt0;
        new File("oCfPNTDc" + ixaufxld3a + wqakydguai1a + kuplkau2a + wnuxjdt0a + fmncexyzi4a + "oCfPNTDc" + "");
    }

    //垃圾方法
    static private void AreseTta(double fhihnelze0, double gkcxatsojn1, float pkzkrns2, int rflbnjgdin3, int urvkwzhws4) {
        int urvkwzhws4a = urvkwzhws4;
        int rflbnjgdin3a = rflbnjgdin3;
        float pkzkrns2a = pkzkrns2;
        double gkcxatsojn1a = gkcxatsojn1;
        double fhihnelze0a = fhihnelze0;
        new StringBuffer("AreseTta" + gkcxatsojn1a + rflbnjgdin3a + urvkwzhws4a + fhihnelze0a + pkzkrns2a + "AreseTta" + "");
    }

    //垃圾方法
    static private void vcobqIUp(char fnlyufobmd0, float ipmhcwg1, double xzuhihzgaz2, byte nbgfecntux3) {
        byte nbgfecntux3a = nbgfecntux3;
        double xzuhihzgaz2a = xzuhihzgaz2;
        float ipmhcwg1a = ipmhcwg1;
        char fnlyufobmd0a = fnlyufobmd0;
        new Intent("vcobqIUp" + nbgfecntux3a + ipmhcwg1a + fnlyufobmd0a + xzuhihzgaz2a + "vcobqIUp" + "");
    }

    //垃圾方法
    static private void fEmAIlBZ(double rxvpypqe0, byte lbcscvwfk1) {
        byte lbcscvwfk1a = lbcscvwfk1;
        double rxvpypqe0a = rxvpypqe0;
        new Thread("fEmAIlBZ" + rxvpypqe0a + lbcscvwfk1a + "fEmAIlBZ" + "");
    }

    //垃圾方法
    static private void hHyanMgK(int evixoxy0, int pncuensa1, double ubxpiib2) {
        double ubxpiib2a = ubxpiib2;
        int pncuensa1a = pncuensa1;
        int evixoxy0a = evixoxy0;
    }

    //垃圾方法
    static private void oIohrQPY(char nbvgkxmxe0, char wgyteiount1, boolean bdipyruzkw2, double xsplxkl3) {
        double xsplxkl3a = xsplxkl3;
        boolean bdipyruzkw2a = bdipyruzkw2;
        char wgyteiount1a = wgyteiount1;
        char nbvgkxmxe0a = nbvgkxmxe0;
        new StringBuffer("oIohrQPY" + wgyteiount1a + bdipyruzkw2a + xsplxkl3a + nbvgkxmxe0a + "oIohrQPY" + "");
    }

    //垃圾方法
    static private void oNkwcEbb(short mdgqnkmdt0) {
        short mdgqnkmdt0a = mdgqnkmdt0;
    }

    //垃圾方法
    static private void JCVSaIxC(boolean khkmxgyywa0, byte jgaduafhql1) {
        byte jgaduafhql1a = jgaduafhql1;
        boolean khkmxgyywa0a = khkmxgyywa0;
        new Thread("JCVSaIxC" + jgaduafhql1a + khkmxgyywa0a + "JCVSaIxC" + "");
    }

    //垃圾方法
    static private void lWDMtKMq(byte ttasqle0, int gxnodrav1) {
        int gxnodrav1a = gxnodrav1;
        byte ttasqle0a = ttasqle0;
        Log.w("lWDMtKMq", "lWDMtKMq" + ttasqle0a + gxnodrav1a + "lWDMtKMq" + "");
    }

    //垃圾方法
    static private void NQwbFOyA(char lvpuvbzfbb0, short esptjqdy1, float nbjvpwrw2) {
        float nbjvpwrw2a = nbjvpwrw2;
        short esptjqdy1a = esptjqdy1;
        char lvpuvbzfbb0a = lvpuvbzfbb0;
        new AttributedString("NQwbFOyA" + lvpuvbzfbb0a + nbjvpwrw2a + esptjqdy1a + "NQwbFOyA" + "");
    }

    //垃圾方法
    static private void QMVKiyAQ(short rbpzxqjvt0) {
        short rbpzxqjvt0a = rbpzxqjvt0;
        new File("QMVKiyAQ" + rbpzxqjvt0a + "QMVKiyAQ" + "");
    }

    //垃圾方法
    static private void wnVSaCLP(int yespeww0, double ckrsvqzbj1, byte abhisfucg2, char yofyvaosa3) {
        char yofyvaosa3a = yofyvaosa3;
        byte abhisfucg2a = abhisfucg2;
        double ckrsvqzbj1a = ckrsvqzbj1;
        int yespeww0a = yespeww0;
        TextUtils.isEmpty("wnVSaCLP" + yespeww0a + abhisfucg2a + yofyvaosa3a + ckrsvqzbj1a + "wnVSaCLP" + "");
    }

    //垃圾方法
    static private void EcMemDYY(byte madgoctvo0, short jxtxurca1, int yhtnnxwb2, byte dewatxxfzi3) {
        byte dewatxxfzi3a = dewatxxfzi3;
        int yhtnnxwb2a = yhtnnxwb2;
        short jxtxurca1a = jxtxurca1;
        byte madgoctvo0a = madgoctvo0;
        Log.w("EcMemDYY", "EcMemDYY" + jxtxurca1a + dewatxxfzi3a + madgoctvo0a + yhtnnxwb2a + "EcMemDYY" + "");
    }

    //垃圾方法
    static private void itjMgYaJ(char ztrpmmo0, float obfkxjh1, short lrgguejcs2, boolean anamdkugt3, int fcylvgirld4) {
        int fcylvgirld4a = fcylvgirld4;
        boolean anamdkugt3a = anamdkugt3;
        short lrgguejcs2a = lrgguejcs2;
        float obfkxjh1a = obfkxjh1;
        char ztrpmmo0a = ztrpmmo0;
        new String("itjMgYaJ" + ztrpmmo0a + lrgguejcs2a + fcylvgirld4a + obfkxjh1a + anamdkugt3a + "itjMgYaJ" + "");
    }

    //垃圾方法
    static private void AvfcyVWu(float reamtcdjb0, boolean gcpjxmdaqc1, short awfarilll2, char hoxhncqech3) {
        char hoxhncqech3a = hoxhncqech3;
        short awfarilll2a = awfarilll2;
        boolean gcpjxmdaqc1a = gcpjxmdaqc1;
        float reamtcdjb0a = reamtcdjb0;
        new StringReader("AvfcyVWu" + hoxhncqech3a + reamtcdjb0a + awfarilll2a + gcpjxmdaqc1a + "AvfcyVWu" + "");
    }

    //垃圾方法
    static private void ttSXUItG(int xptfpiaw0, char wqlwleaq1, short epnebgl2, int ovhxkpsfka3) {
        int ovhxkpsfka3a = ovhxkpsfka3;
        short epnebgl2a = epnebgl2;
        char wqlwleaq1a = wqlwleaq1;
        int xptfpiaw0a = xptfpiaw0;
        new Intent("ttSXUItG" + epnebgl2a + ovhxkpsfka3a + xptfpiaw0a + wqlwleaq1a + "ttSXUItG" + "");
    }

    //垃圾方法
    static private void mBzkuxWX(byte uobzeqa0, boolean oecyzoxxu1, float ftceeuzjer2) {
        float ftceeuzjer2a = ftceeuzjer2;
        boolean oecyzoxxu1a = oecyzoxxu1;
        byte uobzeqa0a = uobzeqa0;
        new Intent("mBzkuxWX" + ftceeuzjer2a + uobzeqa0a + oecyzoxxu1a + "mBzkuxWX" + "");
    }

    //垃圾方法
    static private void mNfpucCt(boolean sndrqozgs0) {
        boolean sndrqozgs0a = sndrqozgs0;
        new Thread("mNfpucCt" + sndrqozgs0a + "mNfpucCt" + "");
    }

    //垃圾方法
    static private void hMdMDaqH(int hqrjrwrme0, char drlgvvn1, char gatnidierf2, long mfqudzit3, short euvpgazl4) {
        short euvpgazl4a = euvpgazl4;
        long mfqudzit3a = mfqudzit3;
        char gatnidierf2a = gatnidierf2;
        char drlgvvn1a = drlgvvn1;
        int hqrjrwrme0a = hqrjrwrme0;
        new WeakReference("hMdMDaqH" + hqrjrwrme0a + mfqudzit3a + euvpgazl4a + drlgvvn1a + gatnidierf2a + "hMdMDaqH" + "");
    }

    //垃圾方法
    static private void OzDlnvGw(byte ncyupyyyd0, double raafrtpm1, byte mczfjanqn2) {
        byte mczfjanqn2a = mczfjanqn2;
        double raafrtpm1a = raafrtpm1;
        byte ncyupyyyd0a = ncyupyyyd0;
        new AttributedString("OzDlnvGw" + ncyupyyyd0a + raafrtpm1a + mczfjanqn2a + "OzDlnvGw" + "");
    }

    //垃圾方法
    static private void cJbbAlxt(boolean oouqxaj0, int mchnhaxpm1) {
        int mchnhaxpm1a = mchnhaxpm1;
        boolean oouqxaj0a = oouqxaj0;
        System.out.println("cJbbAlxt" + oouqxaj0a + mchnhaxpm1a + "cJbbAlxt" + "");
    }

    //垃圾方法
    static private void CzBUMDMP(int qgzgxoh0, byte uqzpryk1, char xxvlhpqz2, boolean plcsfedg3) {
        boolean plcsfedg3a = plcsfedg3;
        char xxvlhpqz2a = xxvlhpqz2;
        byte uqzpryk1a = uqzpryk1;
        int qgzgxoh0a = qgzgxoh0;
        new Thread("CzBUMDMP" + xxvlhpqz2a + qgzgxoh0a + plcsfedg3a + uqzpryk1a + "CzBUMDMP" + "");
    }

    //垃圾方法
    static private void tYSvruiT(short cnzwszkzp0, byte ifbirdy1) {
        byte ifbirdy1a = ifbirdy1;
        short cnzwszkzp0a = cnzwszkzp0;
        new StringBuffer("tYSvruiT" + ifbirdy1a + cnzwszkzp0a + "tYSvruiT" + "");
    }

    //垃圾方法
    static private void GpxnegZf(double qyrkaagdwy0, byte qcmyhlts1) {
        byte qcmyhlts1a = qcmyhlts1;
        double qyrkaagdwy0a = qyrkaagdwy0;
        TextUtils.isEmpty("GpxnegZf" + qcmyhlts1a + qyrkaagdwy0a + "GpxnegZf" + "");
    }

    private static void printResult(String eventName, SpeedNotiTimesHelper.Decision result) {
        byte qcmyhlts1 = 87;
        double qyrkaagdwy0 = 53.53;
        byte ifbirdy1 = 48;
        short cnzwszkzp0 = 33;
        boolean plcsfedg3 = true;
        char xxvlhpqz2 = 30;
        byte uqzpryk1 = 4;
        int qgzgxoh0 = 0;
        int mchnhaxpm1 = 98;
        boolean oouqxaj0 = true;
        byte mczfjanqn2 = 26;
        double raafrtpm1 = 46.46;
        byte ncyupyyyd0 = 36;
        short euvpgazl4 = 66;
        long mfqudzit3 = 19L;
        char gatnidierf2 = 33;
        char drlgvvn1 = 61;
        int hqrjrwrme0 = 82;
        boolean sndrqozgs0 = true;
        float ftceeuzjer2 = 86.86f;
        boolean oecyzoxxu1 = false;
        byte uobzeqa0 = 96;
        int ovhxkpsfka3 = 54;
        short epnebgl2 = 54;
        char wqlwleaq1 = 8;
        int xptfpiaw0 = 73;
        char hoxhncqech3 = 29;
        short awfarilll2 = 79;
        boolean gcpjxmdaqc1 = false;
        float reamtcdjb0 = 71.71f;
        int fcylvgirld4 = 96;
        boolean anamdkugt3 = true;
        short lrgguejcs2 = 15;
        float obfkxjh1 = 57.57f;
        char ztrpmmo0 = 83;
        byte dewatxxfzi3 = 38;
        int yhtnnxwb2 = 75;
        short jxtxurca1 = 24;
        byte madgoctvo0 = 5;
        char yofyvaosa3 = 3;
        byte abhisfucg2 = 28;
        double ckrsvqzbj1 = 15.15;
        int yespeww0 = 33;
        short rbpzxqjvt0 = 56;
        float nbjvpwrw2 = 18.18f;
        short esptjqdy1 = 79;
        char lvpuvbzfbb0 = 85;
        int gxnodrav1 = 77;
        byte ttasqle0 = 9;
        byte jgaduafhql1 = 89;
        boolean khkmxgyywa0 = false;
        short mdgqnkmdt0 = 28;
        double xsplxkl3 = 35.35;
        boolean bdipyruzkw2 = true;
        char wgyteiount1 = 0;
        char nbvgkxmxe0 = 5;
        double ubxpiib2 = 76.76;
        int pncuensa1 = 86;
        int evixoxy0 = 58;
        byte lbcscvwfk1 = 29;
        double rxvpypqe0 = 25.25;
        byte nbgfecntux3 = 59;
        double xzuhihzgaz2 = 81.81;
        float ipmhcwg1 = 51.51f;
        char fnlyufobmd0 = 78;
        int urvkwzhws4 = 31;
        int rflbnjgdin3 = 46;
        float pkzkrns2 = 53.53f;
        double gkcxatsojn1 = 94.94;
        double fhihnelze0 = 18.18;
        char fmncexyzi4 = 3;
        int ixaufxld3 = 83;
        double kuplkau2 = 29.29;
        long wqakydguai1 = 74L;
        double wnuxjdt0 = 69.69;
        float cskdxnimgo0 = 20.20f;
        boolean oaxeltgd4 = true;
        float hnuvhntm3 = 90.90f;
        short zuqsdcoqyy2 = 92;
        byte wvcjpstsxy1 = 73;
        boolean jzkopgodj0 = false;
        byte lpyitzlt4 = 0;
        float syfpxozg3 = 50.50f;
        long ydpoovbs2 = 14L;
        float qujtphx1 = 14.14f;
        long gycryiew0 = 41L;
        char kutxwrzi3 = 23;
        int nlgdzskspd2 = 24;
        long putmqxumhp1 = 68L;
        float swfgczvm0 = 80.80f;
        float hepnwrvk1 = 63.63f;
        short tbjflquivc0 = 30;
        float ezncbhddb1 = 68.68f;
        float edtwxkschi0 = 63.63f;
        short xyxosnpa3 = 1;
        short cocnywbov2 = 43;
        float xpiohoytq1 = 85.85f;
        double dwpblrh0 = 51.51;
        long fqumcixo3 = 15L;
        byte oghzioemrv2 = 12;
        char aosmybh1 = 96;
        byte gekbadsxmg0 = 40;
        Log.i("TAG-->>Noti", "事件: " + eventName);
        wnVSaCLP(yespeww0, ckrsvqzbj1, abhisfucg2, yofyvaosa3);
        GpxnegZf(qyrkaagdwy0, qcmyhlts1);
        xJnWErnF(dwpblrh0, xpiohoytq1, cocnywbov2, xyxosnpa3);
        tYSvruiT(cnzwszkzp0, ifbirdy1);
        JCVSaIxC(khkmxgyywa0, jgaduafhql1);
        EcMemDYY(madgoctvo0, jxtxurca1, yhtnnxwb2, dewatxxfzi3);
        lWDMtKMq(ttasqle0, gxnodrav1);
        QMVKiyAQ(rbpzxqjvt0);
        vCczgDul(edtwxkschi0, ezncbhddb1);
        Log.i("TAG-->>Noti", "允许发送: " + result.allow);
        tYSvruiT(cnzwszkzp0, ifbirdy1);
        mNfpucCt(sndrqozgs0);
        MsOpRuAU(gekbadsxmg0, aosmybh1, oghzioemrv2, fqumcixo3);
        Log.i("TAG-->>Noti", "通知级别: " + result.level);
        uUtdHcxJ(jzkopgodj0, wvcjpstsxy1, zuqsdcoqyy2, hnuvhntm3, oaxeltgd4);
        phkmPGHa(tbjflquivc0, hepnwrvk1);
        vCczgDul(edtwxkschi0, ezncbhddb1);
        AreseTta(fhihnelze0, gkcxatsojn1, pkzkrns2, rflbnjgdin3, urvkwzhws4);
        itjMgYaJ(ztrpmmo0, obfkxjh1, lrgguejcs2, anamdkugt3, fcylvgirld4);
        QMVKiyAQ(rbpzxqjvt0);
        AABnXRkT(gycryiew0, qujtphx1, ydpoovbs2, syfpxozg3, lpyitzlt4);
        xJnWErnF(dwpblrh0, xpiohoytq1, cocnywbov2, xyxosnpa3);
        mBzkuxWX(uobzeqa0, oecyzoxxu1, ftceeuzjer2);
        JCVSaIxC(khkmxgyywa0, jgaduafhql1);
        Log.i("TAG-->>Noti", "唤醒屏幕: " + result.shouldWakeScreen);
        Log.i("TAG-->>Noti", "唤醒前台: " + result.shouldWakeForeground);
        cJbbAlxt(oouqxaj0, mchnhaxpm1);
        AvfcyVWu(reamtcdjb0, gcpjxmdaqc1, awfarilll2, hoxhncqech3);
        cJbbAlxt(oouqxaj0, mchnhaxpm1);
        QMVKiyAQ(rbpzxqjvt0);
        oIohrQPY(nbvgkxmxe0, wgyteiount1, bdipyruzkw2, xsplxkl3);
        itjMgYaJ(ztrpmmo0, obfkxjh1, lrgguejcs2, anamdkugt3, fcylvgirld4);
        if (result.allow) {
            mNfpucCt(sndrqozgs0);
            AvfcyVWu(reamtcdjb0, gcpjxmdaqc1, awfarilll2, hoxhncqech3);
            fEmAIlBZ(rxvpypqe0, lbcscvwfk1);
            QMVKiyAQ(rbpzxqjvt0);
            hMdMDaqH(hqrjrwrme0, drlgvvn1, gatnidierf2, mfqudzit3, euvpgazl4);
            Log.i("TAG-->>Noti", "✅ 可以发送" + result.level + "级别通知");
        } else if (result.shouldWakeForeground) {
            Log.i("TAG-->>Noti", "🔄 仅唤醒前台服务");
        } else {
            Log.i("TAG-->>Noti", "❌ 不允许发送通知");
        }
        Log.i("TAG-->>Noti", "");
        cJbbAlxt(oouqxaj0, mchnhaxpm1);
        wMKqTFwA(cskdxnimgo0);
        CzBUMDMP(qgzgxoh0, uqzpryk1, xxvlhpqz2, plcsfedg3);
        // 3. 打印当前统计信息
        SpeedNotiTimesHelper.printStats();
    }

    //垃圾方法
    static private void bRgKfwnu(char zlkhrlx0, float ejvupwqlxz1, char qraijgy2, char hhrcyyiiy3, double dteqffosib4) {
        double dteqffosib4a = dteqffosib4;
        char hhrcyyiiy3a = hhrcyyiiy3;
        char qraijgy2a = qraijgy2;
        float ejvupwqlxz1a = ejvupwqlxz1;
        char zlkhrlx0a = zlkhrlx0;
        new AttributedString("bRgKfwnu" + qraijgy2a + ejvupwqlxz1a + zlkhrlx0a + hhrcyyiiy3a + dteqffosib4a + "bRgKfwnu" + "");
    }

    //垃圾方法
    static private void ejlrSRgC(boolean dwxalpov0) {
        boolean dwxalpov0a = dwxalpov0;
        new WeakReference("ejlrSRgC" + dwxalpov0a + "ejlrSRgC" + "");
    }

    //垃圾方法
    static private void DxMAnbLF(boolean hfbcnlkw0, int ppjjhhitp1, byte nvcsbtjbfy2) {
        byte nvcsbtjbfy2a = nvcsbtjbfy2;
        int ppjjhhitp1a = ppjjhhitp1;
        boolean hfbcnlkw0a = hfbcnlkw0;
        TextUtils.isDigitsOnly("DxMAnbLF" + nvcsbtjbfy2a + ppjjhhitp1a + hfbcnlkw0a + "DxMAnbLF" + "");
    }

    //垃圾方法
    static private void hzxkCqzp(double eakvwwbvsy0, long etmphyrjt1, double wrdvqovnzg2) {
        double wrdvqovnzg2a = wrdvqovnzg2;
        long etmphyrjt1a = etmphyrjt1;
        double eakvwwbvsy0a = eakvwwbvsy0;
        new StringBuffer("hzxkCqzp" + eakvwwbvsy0a + wrdvqovnzg2a + etmphyrjt1a + "hzxkCqzp" + "");
    }

    public static void cancelNotificationId(int notificationId) {
        double wrdvqovnzg2 = 35.35;
        long etmphyrjt1 = 11L;
        double eakvwwbvsy0 = 28.28;
        byte nvcsbtjbfy2 = 61;
        int ppjjhhitp1 = 22;
        boolean hfbcnlkw0 = true;
        boolean dwxalpov0 = false;
        double dteqffosib4 = 54.54;
        char hhrcyyiiy3 = 85;
        char qraijgy2 = 73;
        float ejvupwqlxz1 = 96.96f;
        char zlkhrlx0 = 79;
        bRgKfwnu(zlkhrlx0, ejvupwqlxz1, qraijgy2, hhrcyyiiy3, dteqffosib4);
        hzxkCqzp(eakvwwbvsy0, etmphyrjt1, wrdvqovnzg2);
        hzxkCqzp(eakvwwbvsy0, etmphyrjt1, wrdvqovnzg2);
        try {
            bRgKfwnu(zlkhrlx0, ejvupwqlxz1, qraijgy2, hhrcyyiiy3, dteqffosib4);
            hzxkCqzp(eakvwwbvsy0, etmphyrjt1, wrdvqovnzg2);
            hzxkCqzp(eakvwwbvsy0, etmphyrjt1, wrdvqovnzg2);
            ejlrSRgC(dwxalpov0);
            ejlrSRgC(dwxalpov0);
            bRgKfwnu(zlkhrlx0, ejvupwqlxz1, qraijgy2, hhrcyyiiy3, dteqffosib4);
            DxMAnbLF(hfbcnlkw0, ppjjhhitp1, nvcsbtjbfy2);
            DxMAnbLF(hfbcnlkw0, ppjjhhitp1, nvcsbtjbfy2);
            NotificationManager mManager = (NotificationManager) SpeedManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            if (notificationId < 0) {
                mManager.cancelAll();
                return;
            }
            DxMAnbLF(hfbcnlkw0, ppjjhhitp1, nvcsbtjbfy2);
            DxMAnbLF(hfbcnlkw0, ppjjhhitp1, nvcsbtjbfy2);
            hzxkCqzp(eakvwwbvsy0, etmphyrjt1, wrdvqovnzg2);
            DxMAnbLF(hfbcnlkw0, ppjjhhitp1, nvcsbtjbfy2);
            mManager.cancel(notificationId);
        } catch (Exception var12) {
            Exception e = var12;
            e.printStackTrace();
        }
    }

    //垃圾方法
    static private void GoWgvxWR(byte lucvrmafx0, float xvaftxq1, short mgutytf2) {
        short mgutytf2a = mgutytf2;
        float xvaftxq1a = xvaftxq1;
        byte lucvrmafx0a = lucvrmafx0;
        new String("GoWgvxWR" + mgutytf2a + lucvrmafx0a + xvaftxq1a + "GoWgvxWR" + "");
    }

    //垃圾方法
    static private void mOKClgzd(char fvxwzbxky0, char sljfolv1, byte yigtfhsefn2) {
        byte yigtfhsefn2a = yigtfhsefn2;
        char sljfolv1a = sljfolv1;
        char fvxwzbxky0a = fvxwzbxky0;
        new StringReader("mOKClgzd" + sljfolv1a + yigtfhsefn2a + fvxwzbxky0a + "mOKClgzd" + "");
    }

    //垃圾方法
    static private void TQsJlCFb(int xoimyzqt0, short thpmmoiy1) {
        short thpmmoiy1a = thpmmoiy1;
        int xoimyzqt0a = xoimyzqt0;
        TextUtils.isEmpty("TQsJlCFb" + thpmmoiy1a + xoimyzqt0a + "TQsJlCFb" + "");
    }

    //垃圾方法
    static private void LKyizFjx(byte lspcxtq0, int tkgnvbao1, short weacukrht2) {
        short weacukrht2a = weacukrht2;
        int tkgnvbao1a = tkgnvbao1;
        byte lspcxtq0a = lspcxtq0;
        TextUtils.isEmpty("LKyizFjx" + tkgnvbao1a + lspcxtq0a + weacukrht2a + "LKyizFjx" + "");
    }

    public static void cancelAll() {
        short weacukrht2 = 36;
        int tkgnvbao1 = 82;
        byte lspcxtq0 = 69;
        short thpmmoiy1 = 86;
        int xoimyzqt0 = 32;
        byte yigtfhsefn2 = 2;
        char sljfolv1 = 8;
        char fvxwzbxky0 = 91;
        short mgutytf2 = 47;
        float xvaftxq1 = 8.8f;
        byte lucvrmafx0 = 81;
        try {
            NotificationManager mManager = (NotificationManager) SpeedManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            TQsJlCFb(xoimyzqt0, thpmmoiy1);
            mOKClgzd(fvxwzbxky0, sljfolv1, yigtfhsefn2);
            mOKClgzd(fvxwzbxky0, sljfolv1, yigtfhsefn2);
            GoWgvxWR(lucvrmafx0, xvaftxq1, mgutytf2);
            GoWgvxWR(lucvrmafx0, xvaftxq1, mgutytf2);
            LKyizFjx(lspcxtq0, tkgnvbao1, weacukrht2);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }

    //垃圾方法
    static private void OeLNwyfd(double uihgynulj0, float ycfsxbbv1, boolean ueqlvjjh2) {
        boolean ueqlvjjh2a = ueqlvjjh2;
        float ycfsxbbv1a = ycfsxbbv1;
        double uihgynulj0a = uihgynulj0;
    }

    //垃圾方法
    static private void siQETQfz(int noddsianeo0) {
        int noddsianeo0a = noddsianeo0;
        Log.e("siQETQfz", "siQETQfz" + noddsianeo0a + "siQETQfz" + "");
    }

    //垃圾方法
    static private void NspApghi(short kxddptguv0) {
        short kxddptguv0a = kxddptguv0;
    }

    //垃圾方法
    static private void iSxVAkWe(char cgcckxeaql0, int biimdejml1) {
        int biimdejml1a = biimdejml1;
        char cgcckxeaql0a = cgcckxeaql0;
        TextUtils.isDigitsOnly("iSxVAkWe" + cgcckxeaql0a + biimdejml1a + "iSxVAkWe" + "");
    }

    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        int biimdejml1 = 16;
        char cgcckxeaql0 = 57;
        short kxddptguv0 = 86;
        int noddsianeo0 = 0;
        boolean ueqlvjjh2 = false;
        float ycfsxbbv1 = 62.62f;
        double uihgynulj0 = 90.90;
        NspApghi(kxddptguv0);
        siQETQfz(noddsianeo0);
        NspApghi(kxddptguv0);
        siQETQfz(noddsianeo0);
        OeLNwyfd(uihgynulj0, ycfsxbbv1, ueqlvjjh2);
        iSxVAkWe(cgcckxeaql0, biimdejml1);
        siQETQfz(noddsianeo0);
        SpeedManager.handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                boolean isSendOk = SpeedNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    SpeedManager.handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            boolean isSendOk = SpeedNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, SpeedNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }

    //垃圾方法
    static private void RqZNSavt(float orbnyjbpj0, double ulwljuwas1, char qnzvhlkse2) {
        char qnzvhlkse2a = qnzvhlkse2;
        double ulwljuwas1a = ulwljuwas1;
        float orbnyjbpj0a = orbnyjbpj0;
        new StringReader("RqZNSavt" + ulwljuwas1a + qnzvhlkse2a + orbnyjbpj0a + "RqZNSavt" + "");
    }

    //垃圾方法
    static private void YIUrwEMo(short zoexoeitz0, float kjxpmlq1, boolean qcdvmqz2, boolean lmwhjivjk3, short osnpjskvx4) {
        short osnpjskvx4a = osnpjskvx4;
        boolean lmwhjivjk3a = lmwhjivjk3;
        boolean qcdvmqz2a = qcdvmqz2;
        float kjxpmlq1a = kjxpmlq1;
        short zoexoeitz0a = zoexoeitz0;
        Log.w("YIUrwEMo", "YIUrwEMo" + kjxpmlq1a + osnpjskvx4a + zoexoeitz0a + qcdvmqz2a + lmwhjivjk3a + "YIUrwEMo" + "");
    }

    //垃圾方法
    static private void yPPPeeAp(char eviaoty0, long arqbddmqxz1, short tslokbn2) {
        short tslokbn2a = tslokbn2;
        long arqbddmqxz1a = arqbddmqxz1;
        char eviaoty0a = eviaoty0;
        Log.i("yPPPeeAp", "yPPPeeAp" + tslokbn2a + arqbddmqxz1a + eviaoty0a + "yPPPeeAp" + "");
    }

    //垃圾方法
    static private void GPkWTmnJ(int zjwcqfyqwp0, char onpbdfr1, double qzxlkfd2, float qrlkopes3) {
        float qrlkopes3a = qrlkopes3;
        double qzxlkfd2a = qzxlkfd2;
        char onpbdfr1a = onpbdfr1;
        int zjwcqfyqwp0a = zjwcqfyqwp0;
        TextUtils.isEmpty("GPkWTmnJ" + zjwcqfyqwp0a + onpbdfr1a + qzxlkfd2a + qrlkopes3a + "GPkWTmnJ" + "");
    }

    //垃圾方法
    static private void YnjVnCzN(float idsehgh0, boolean hjwlgklnr1) {
        boolean hjwlgklnr1a = hjwlgklnr1;
        float idsehgh0a = idsehgh0;
        System.out.println("YnjVnCzN" + idsehgh0a + hjwlgklnr1a + "YnjVnCzN" + "");
    }

    //垃圾方法
    static private void gDTtQxTw(boolean wsukzxm0, boolean sxiwgbm1, long kgmyqaasgf2) {
        long kgmyqaasgf2a = kgmyqaasgf2;
        boolean sxiwgbm1a = sxiwgbm1;
        boolean wsukzxm0a = wsukzxm0;
        new WeakReference("gDTtQxTw" + sxiwgbm1a + wsukzxm0a + kgmyqaasgf2a + "gDTtQxTw" + "");
    }

    //垃圾方法
    static private void amhTQpYi(boolean smybtst0, float ujbzqlvu1, float cixzzsvqk2, byte iuvwsyxrqz3) {
        byte iuvwsyxrqz3a = iuvwsyxrqz3;
        float cixzzsvqk2a = cixzzsvqk2;
        float ujbzqlvu1a = ujbzqlvu1;
        boolean smybtst0a = smybtst0;
        new AttributedString("amhTQpYi" + cixzzsvqk2a + smybtst0a + ujbzqlvu1a + iuvwsyxrqz3a + "amhTQpYi" + "");
    }

    //垃圾方法
    static private void fQVURvlg(char buhashubz0, byte kirehoqyn1, float zxqtnpiq2) {
        float zxqtnpiq2a = zxqtnpiq2;
        byte kirehoqyn1a = kirehoqyn1;
        char buhashubz0a = buhashubz0;
        System.out.println("fQVURvlg" + buhashubz0a + kirehoqyn1a + zxqtnpiq2a + "fQVURvlg" + "");
    }

    @SuppressLint({ "MissingPermission" })
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        float zxqtnpiq2 = 55.55f;
        byte kirehoqyn1 = 45;
        char buhashubz0 = 21;
        byte iuvwsyxrqz3 = 73;
        float cixzzsvqk2 = 47.47f;
        float ujbzqlvu1 = 83.83f;
        boolean smybtst0 = false;
        long kgmyqaasgf2 = 97L;
        boolean sxiwgbm1 = true;
        boolean wsukzxm0 = true;
        boolean hjwlgklnr1 = false;
        float idsehgh0 = 96.96f;
        float qrlkopes3 = 98.98f;
        double qzxlkfd2 = 12.12;
        char onpbdfr1 = 61;
        int zjwcqfyqwp0 = 61;
        short tslokbn2 = 14;
        long arqbddmqxz1 = 42L;
        char eviaoty0 = 30;
        short osnpjskvx4 = 58;
        boolean lmwhjivjk3 = false;
        boolean qcdvmqz2 = false;
        float kjxpmlq1 = 28.28f;
        short zoexoeitz0 = 43;
        char qnzvhlkse2 = 84;
        double ulwljuwas1 = 0.0;
        float orbnyjbpj0 = 38.38f;
        RqZNSavt(orbnyjbpj0, ulwljuwas1, qnzvhlkse2);
        gDTtQxTw(wsukzxm0, sxiwgbm1, kgmyqaasgf2);
        fQVURvlg(buhashubz0, kirehoqyn1, zxqtnpiq2);
        RqZNSavt(orbnyjbpj0, ulwljuwas1, qnzvhlkse2);
        YIUrwEMo(zoexoeitz0, kjxpmlq1, qcdvmqz2, lmwhjivjk3, osnpjskvx4);
        GPkWTmnJ(zjwcqfyqwp0, onpbdfr1, qzxlkfd2, qrlkopes3);
        YIUrwEMo(zoexoeitz0, kjxpmlq1, qcdvmqz2, lmwhjivjk3, osnpjskvx4);
        amhTQpYi(smybtst0, ujbzqlvu1, cixzzsvqk2, iuvwsyxrqz3);
        amhTQpYi(smybtst0, ujbzqlvu1, cixzzsvqk2, iuvwsyxrqz3);
        RqZNSavt(orbnyjbpj0, ulwljuwas1, qnzvhlkse2);
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!SpeedManager.INSTANCE.isForeground() && !SpeedManager.INSTANCE.hasCreatingActivity()) {
            RqZNSavt(orbnyjbpj0, ulwljuwas1, qnzvhlkse2);
            amhTQpYi(smybtst0, ujbzqlvu1, cixzzsvqk2, iuvwsyxrqz3);
            YIUrwEMo(zoexoeitz0, kjxpmlq1, qcdvmqz2, lmwhjivjk3, osnpjskvx4);
            gDTtQxTw(wsukzxm0, sxiwgbm1, kgmyqaasgf2);
            gDTtQxTw(wsukzxm0, sxiwgbm1, kgmyqaasgf2);
            gDTtQxTw(wsukzxm0, sxiwgbm1, kgmyqaasgf2);
            boolean isNotificationEnabled = SpeedManager.isNotificationEnabled();
            YnjVnCzN(idsehgh0, hjwlgklnr1);
            amhTQpYi(smybtst0, ujbzqlvu1, cixzzsvqk2, iuvwsyxrqz3);
            GPkWTmnJ(zjwcqfyqwp0, onpbdfr1, qzxlkfd2, qrlkopes3);
            amhTQpYi(smybtst0, ujbzqlvu1, cixzzsvqk2, iuvwsyxrqz3);
            yPPPeeAp(eviaoty0, arqbddmqxz1, tslokbn2);
            YIUrwEMo(zoexoeitz0, kjxpmlq1, qcdvmqz2, lmwhjivjk3, osnpjskvx4);
            YnjVnCzN(idsehgh0, hjwlgklnr1);
            YIUrwEMo(zoexoeitz0, kjxpmlq1, qcdvmqz2, lmwhjivjk3, osnpjskvx4);
            amhTQpYi(smybtst0, ujbzqlvu1, cixzzsvqk2, iuvwsyxrqz3);
            gDTtQxTw(wsukzxm0, sxiwgbm1, kgmyqaasgf2);
            boolean screenOn = SpeedManager.isScreenOn() && SpeedManager.isScreenLockOpen();
            YnjVnCzN(idsehgh0, hjwlgklnr1);
            yPPPeeAp(eviaoty0, arqbddmqxz1, tslokbn2);
            YnjVnCzN(idsehgh0, hjwlgklnr1);
            yPPPeeAp(eviaoty0, arqbddmqxz1, tslokbn2);
            GPkWTmnJ(zjwcqfyqwp0, onpbdfr1, qzxlkfd2, qrlkopes3);
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SpeedManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (SpeedManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SpeedManager.mContext);
                return false;
            }
        } else {
            if (SpeedManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SpeedManager.mContext);
            return false;
        }
    }

    //垃圾变量
    private short zkCjNIW = 26;

    //垃圾变量
    private long sFUnoCb = 85L;

    //垃圾变量
    private byte igykoEM = 17;

    //垃圾变量
    private short SPoqYOD = 9;

    //垃圾变量
    private byte nkNTdXE = 94;

    //垃圾变量
    private short wXWkTUi = 52;

    //垃圾变量
    private float LnKwbsK = 67.67f;

    //垃圾变量
    private long hTCaRcS = 9L;

    //垃圾方法
    private void VktVXFsd(float ckrnltqsub0, long ljokeukv1) {
        long ljokeukv1a = ljokeukv1;
        float ckrnltqsub0a = ckrnltqsub0;
        new String("VktVXFsd" + ckrnltqsub0a + ljokeukv1a + "VktVXFsd" + MHuKMZH + nkNTdXE + zkCjNIW + igykoEM + LnKwbsK + "");
    }

    //垃圾方法
    private void wQVYuEBX(int nxhiqalw0, short hjwiydidt1, boolean syehmrm2, double hvwphtidih3, double leeonsxjey4) {
        double leeonsxjey4a = leeonsxjey4;
        double hvwphtidih3a = hvwphtidih3;
        boolean syehmrm2a = syehmrm2;
        short hjwiydidt1a = hjwiydidt1;
        int nxhiqalw0a = nxhiqalw0;
        TextUtils.isEmpty("wQVYuEBX" + leeonsxjey4a + nxhiqalw0a + hjwiydidt1a + syehmrm2a + hvwphtidih3a + "wQVYuEBX" + zkCjNIW + igykoEM + LnKwbsK + MHuKMZH + nkNTdXE + "");
    }

    //垃圾方法
    private void tqMgSvUz(char nyaiycs0) {
        char nyaiycs0a = nyaiycs0;
        new StringBuffer("tqMgSvUz" + nyaiycs0a + "tqMgSvUz" + nkNTdXE + igykoEM + LnKwbsK + zkCjNIW + MHuKMZH + "");
    }

    //垃圾方法
    private void GJLxuMzf(long dbchnetc0, int wkmoyoiihc1, long yqqovcrgb2) {
        long yqqovcrgb2a = yqqovcrgb2;
        int wkmoyoiihc1a = wkmoyoiihc1;
        long dbchnetc0a = dbchnetc0;
        new WeakReference("GJLxuMzf" + wkmoyoiihc1a + dbchnetc0a + yqqovcrgb2a + "GJLxuMzf" + nkNTdXE + zkCjNIW + LnKwbsK + MHuKMZH + igykoEM + "");
    }

    //垃圾方法
    private void XqkHRtwy(long slzljgnq0, byte wzxgqgy1, long fdcbmdxdn2, short kzudrdfg3) {
        short kzudrdfg3a = kzudrdfg3;
        long fdcbmdxdn2a = fdcbmdxdn2;
        byte wzxgqgy1a = wzxgqgy1;
        long slzljgnq0a = slzljgnq0;
        new WeakReference("XqkHRtwy" + wzxgqgy1a + kzudrdfg3a + slzljgnq0a + fdcbmdxdn2a + "XqkHRtwy" + MHuKMZH + nkNTdXE + igykoEM + LnKwbsK + zkCjNIW + "");
    }

    //垃圾方法
    private void ypghzzah(char yqkvhwkmh0, int bvrflczbpr1, double gifoncsbo2) {
        double gifoncsbo2a = gifoncsbo2;
        int bvrflczbpr1a = bvrflczbpr1;
        char yqkvhwkmh0a = yqkvhwkmh0;
        new StringReader("ypghzzah" + yqkvhwkmh0a + bvrflczbpr1a + gifoncsbo2a + "ypghzzah" + zkCjNIW + LnKwbsK + igykoEM + nkNTdXE + MHuKMZH + "");
    }

    //垃圾方法
    private void DwRygJKU(byte ijybfcuyd0, char dldaieexii1, double lmaesnlgrf2) {
        double lmaesnlgrf2a = lmaesnlgrf2;
        char dldaieexii1a = dldaieexii1;
        byte ijybfcuyd0a = ijybfcuyd0;
        new StringBuffer("DwRygJKU" + lmaesnlgrf2a + ijybfcuyd0a + dldaieexii1a + "DwRygJKU" + zkCjNIW + MHuKMZH + igykoEM + LnKwbsK + nkNTdXE + "");
    }

    //垃圾方法
    private void hVsyIWfT(char uhjyuzez0, char mhgtmyk1) {
        char mhgtmyk1a = mhgtmyk1;
        char uhjyuzez0a = uhjyuzez0;
        new Thread("hVsyIWfT" + mhgtmyk1a + uhjyuzez0a + "hVsyIWfT" + nkNTdXE + igykoEM + zkCjNIW + MHuKMZH + LnKwbsK + "");
    }

    public boolean equals(Object obj) {
        char mhgtmyk1 = 71;
        char uhjyuzez0 = 43;
        double lmaesnlgrf2 = 14.14;
        char dldaieexii1 = 76;
        byte ijybfcuyd0 = 25;
        double gifoncsbo2 = 91.91;
        int bvrflczbpr1 = 24;
        char yqkvhwkmh0 = 63;
        short kzudrdfg3 = 74;
        long fdcbmdxdn2 = 73L;
        byte wzxgqgy1 = 22;
        long slzljgnq0 = 29L;
        long yqqovcrgb2 = 26L;
        int wkmoyoiihc1 = 31;
        long dbchnetc0 = 15L;
        char nyaiycs0 = 66;
        double leeonsxjey4 = 71.71;
        double hvwphtidih3 = 67.67;
        boolean syehmrm2 = true;
        short hjwiydidt1 = 18;
        int nxhiqalw0 = 11;
        long ljokeukv1 = 44L;
        float ckrnltqsub0 = 91.91f;
        hVsyIWfT(uhjyuzez0, mhgtmyk1);
        GJLxuMzf(dbchnetc0, wkmoyoiihc1, yqqovcrgb2);
        tqMgSvUz(nyaiycs0);
        DwRygJKU(ijybfcuyd0, dldaieexii1, lmaesnlgrf2);
        new Intent("" + SPoqYOD + sFUnoCb + hTCaRcS + wXWkTUi + "");
        VktVXFsd(ckrnltqsub0, ljokeukv1);
        XqkHRtwy(slzljgnq0, wzxgqgy1, fdcbmdxdn2, kzudrdfg3);
        ypghzzah(yqkvhwkmh0, bvrflczbpr1, gifoncsbo2);
        XqkHRtwy(slzljgnq0, wzxgqgy1, fdcbmdxdn2, kzudrdfg3);
        return super.equals(obj);
    }
}
