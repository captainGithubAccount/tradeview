package com.tidy.file.old.shownotificy;

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
import com.tidy.file.R;
import com.tidy.file.old.FirebaseUtils;
import com.tidy.file.old.TidyManager;
import com.tidy.file.old.change.TidyChangeUtils;
import com.tidy.file.old.opdj.nt.TidyNtCancelFgService;
import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.tidy.file.old.use.TidyUsageDaysTracker;
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

public class TidyNtSender {

    //垃圾变量
    private char ggVatUA = 31;

    private static long dayleTime = 4700L;

    public TidyNtSender() {
    }

    //垃圾方法
    static private void LWMPWRnn(double jzbxkprjn0, short tqdjsimny1, double qpcrqxk2) {
        double qpcrqxk2a = qpcrqxk2;
        short tqdjsimny1a = tqdjsimny1;
        double jzbxkprjn0a = jzbxkprjn0;
        new Thread("LWMPWRnn" + tqdjsimny1a + jzbxkprjn0a + qpcrqxk2a + "LWMPWRnn" + "");
    }

    //垃圾方法
    static private void RDgvpdUy(byte nikexphm0, char jyxlpmlcdx1, char dnsmwko2, float ypbeufoag3) {
        float ypbeufoag3a = ypbeufoag3;
        char dnsmwko2a = dnsmwko2;
        char jyxlpmlcdx1a = jyxlpmlcdx1;
        byte nikexphm0a = nikexphm0;
        new String("RDgvpdUy" + jyxlpmlcdx1a + nikexphm0a + dnsmwko2a + ypbeufoag3a + "RDgvpdUy" + "");
    }

    //垃圾方法
    static private void tRXIKzjW(long quaqjuj0, boolean dbhafpb1, char nwhheeji2, float nnnpjtast3, byte mcvpiec4) {
        byte mcvpiec4a = mcvpiec4;
        float nnnpjtast3a = nnnpjtast3;
        char nwhheeji2a = nwhheeji2;
        boolean dbhafpb1a = dbhafpb1;
        long quaqjuj0a = quaqjuj0;
        Log.e("tRXIKzjW", "tRXIKzjW" + nnnpjtast3a + nwhheeji2a + dbhafpb1a + quaqjuj0a + mcvpiec4a + "tRXIKzjW" + "");
    }

    //垃圾方法
    static private void kzfiqygy(long mqfzxvbaa0, short zocygqqrpz1, char dmizlhgej2, byte xypctapr3) {
        byte xypctapr3a = xypctapr3;
        char dmizlhgej2a = dmizlhgej2;
        short zocygqqrpz1a = zocygqqrpz1;
        long mqfzxvbaa0a = mqfzxvbaa0;
        TextUtils.isEmpty("kzfiqygy" + zocygqqrpz1a + dmizlhgej2a + mqfzxvbaa0a + xypctapr3a + "kzfiqygy" + "");
    }

    //垃圾方法
    static private void aFQwTFPO(float qypkbzjro0, long sxznaiuhjy1, byte kbjsvtpmyg2, short wgcftetkb3) {
        short wgcftetkb3a = wgcftetkb3;
        byte kbjsvtpmyg2a = kbjsvtpmyg2;
        long sxznaiuhjy1a = sxznaiuhjy1;
        float qypkbzjro0a = qypkbzjro0;
        Log.i("aFQwTFPO", "aFQwTFPO" + kbjsvtpmyg2a + sxznaiuhjy1a + qypkbzjro0a + wgcftetkb3a + "aFQwTFPO" + "");
    }

    //垃圾方法
    static private void RiYNmdPz(float tzhdybqm0, int hvpjzgqtk1) {
        int hvpjzgqtk1a = hvpjzgqtk1;
        float tzhdybqm0a = tzhdybqm0;
        new String("RiYNmdPz" + hvpjzgqtk1a + tzhdybqm0a + "RiYNmdPz" + "");
    }

    //垃圾方法
    static private void iltOEomt(long bbssbnbzi0, int fftfmxvtae1) {
        int fftfmxvtae1a = fftfmxvtae1;
        long bbssbnbzi0a = bbssbnbzi0;
    }

    //垃圾方法
    static private void AamcnJoK(float eywhbogmb0, long nptarwnfk1, float tszbffem2) {
        float tszbffem2a = tszbffem2;
        long nptarwnfk1a = nptarwnfk1;
        float eywhbogmb0a = eywhbogmb0;
        TextUtils.isEmpty("AamcnJoK" + tszbffem2a + eywhbogmb0a + nptarwnfk1a + "AamcnJoK" + "");
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType, TidyNotiTimesHelper.Event event) {
        float tszbffem2 = 92.92f;
        long nptarwnfk1 = 27L;
        float eywhbogmb0 = 98.98f;
        int fftfmxvtae1 = 63;
        long bbssbnbzi0 = 59L;
        int hvpjzgqtk1 = 79;
        float tzhdybqm0 = 10.10f;
        short wgcftetkb3 = 20;
        byte kbjsvtpmyg2 = 67;
        long sxznaiuhjy1 = 12L;
        float qypkbzjro0 = 65.65f;
        byte xypctapr3 = 49;
        char dmizlhgej2 = 60;
        short zocygqqrpz1 = 100;
        long mqfzxvbaa0 = 69L;
        byte mcvpiec4 = 76;
        float nnnpjtast3 = 40.40f;
        char nwhheeji2 = 38;
        boolean dbhafpb1 = false;
        long quaqjuj0 = 85L;
        float ypbeufoag3 = 26.26f;
        char dnsmwko2 = 98;
        char jyxlpmlcdx1 = 33;
        byte nikexphm0 = 15;
        double qpcrqxk2 = 94.94;
        short tqdjsimny1 = 35;
        double jzbxkprjn0 = 63.63;
        switch(event) {
            case APP_INSTALL_UNINSTALL:
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                // 应用安装事件
                TidyNotiTimesHelper.Decision installResult = TidyNotiTimesHelper.handleAppInstall();
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                showNotify(installResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                printResult("应用安装", installResult);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                break;
            case POWER_CHARGE:
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                // 4. 测试各种事件
                // 充电事件（电量50%）
                TidyNotiTimesHelper.Decision chargeResult = TidyNotiTimesHelper.handlePowerCharge(50);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                showNotify(chargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("充电事件", chargeResult);
                break;
            case POWER_DISCHARGE:
                // 充电事件（电量50%）
                TidyNotiTimesHelper.Decision dischargeResult = TidyNotiTimesHelper.handlePowerDischarge(100);
                showNotify(dischargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                printResult("断电事件", dischargeResult);
                break;
            case ALARM:
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                // 定时闹钟（未清理3天）
                int noCleanDays = TidyUsageDaysTracker.getUnusedDays();
                TidyNotiTimesHelper.Decision alarmResult = TidyNotiTimesHelper.handleAlarm(noCleanDays);
                showNotify(alarmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("定时闹钟", alarmResult);
                break;
            case JOB_POLLING:
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                TidyNotiTimesHelper.Decision jobResult = TidyNotiTimesHelper.handleJobPolling();
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                showNotify(jobResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("job", jobResult);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                break;
            case FCM_PUSH:
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                // FCM推送事件
                TidyNotiTimesHelper.Decision fcmResult = TidyNotiTimesHelper.handleFcmPush();
                showNotify(fcmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("FCM推送", fcmResult);
                break;
            case UNLOCK_SCREEN:
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                // 解锁屏事件
                TidyNotiTimesHelper.Decision unlockResult = TidyNotiTimesHelper.handleUnlockScreen();
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                showNotify(unlockResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("解锁屏", unlockResult);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                break;
            case SCREEN_ON_OFF:
                // 屏幕打开关闭事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision screenResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(screenResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("屏幕事件", screenResult);
                break;
            //            case HOME_CLICK:
            case HEARTBEAT:
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                // 屏幕打开关闭事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision heartResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(heartResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                printResult("HEARTBEAT", heartResult);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                break;
            case ACCOUNT_SYNC:
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                // 账户事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision acountResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(acountResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("账户事件", acountResult);
                break;
            case WORK_MANAGER:
                // worker事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision workerResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(workerResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                printResult("worker事件", workerResult);
                break;
            case HOME_CLICK:
                // worker事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision homeClickResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(homeClickResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("home点击事件", homeClickResult);
                break;
            default:
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                aFQwTFPO(qypkbzjro0, sxznaiuhjy1, kbjsvtpmyg2, wgcftetkb3);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                // worker事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision defaultResult = TidyNotiTimesHelper.handleDefault();
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                showNotify(defaultResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                kzfiqygy(mqfzxvbaa0, zocygqqrpz1, dmizlhgej2, xypctapr3);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                AamcnJoK(eywhbogmb0, nptarwnfk1, tszbffem2);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                iltOEomt(bbssbnbzi0, fftfmxvtae1);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RiYNmdPz(tzhdybqm0, hvpjzgqtk1);
                Log.i("TAG-->>Noti", "事件名: " + event.name());
                printResult(event.name(), defaultResult);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                LWMPWRnn(jzbxkprjn0, tqdjsimny1, qpcrqxk2);
                RDgvpdUy(nikexphm0, jyxlpmlcdx1, dnsmwko2, ypbeufoag3);
                tRXIKzjW(quaqjuj0, dbhafpb1, nwhheeji2, nnnpjtast3, mcvpiec4);
                break;
        }
        return true;
    }

    //垃圾方法
    static private void fFKDzXfP(float aljipsrzqq0, short mchkkqy1, boolean lonutsld2) {
        boolean lonutsld2a = lonutsld2;
        short mchkkqy1a = mchkkqy1;
        float aljipsrzqq0a = aljipsrzqq0;
        new File("fFKDzXfP" + mchkkqy1a + aljipsrzqq0a + lonutsld2a + "fFKDzXfP" + "");
    }

    //垃圾方法
    static private void EIoJtRvm(long ditwsqfnq0, long osibqttha1, float ctwhvgd2) {
        float ctwhvgd2a = ctwhvgd2;
        long osibqttha1a = osibqttha1;
        long ditwsqfnq0a = ditwsqfnq0;
        new String("EIoJtRvm" + osibqttha1a + ctwhvgd2a + ditwsqfnq0a + "EIoJtRvm" + "");
    }

    //垃圾方法
    static private void eBdKcCnN(byte mrdrrst0, float vimnmjlae1) {
        float vimnmjlae1a = vimnmjlae1;
        byte mrdrrst0a = mrdrrst0;
        Log.w("eBdKcCnN", "eBdKcCnN" + vimnmjlae1a + mrdrrst0a + "eBdKcCnN" + "");
    }

    //垃圾方法
    static private void CZtVsaNR(byte wczhqoiz0) {
        byte wczhqoiz0a = wczhqoiz0;
        new AttributedString("CZtVsaNR" + wczhqoiz0a + "CZtVsaNR" + "");
    }

    private static void showNotify(TidyNotiTimesHelper.Decision decision, int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType) {
        byte wczhqoiz0 = 60;
        float vimnmjlae1 = 60.60f;
        byte mrdrrst0 = 61;
        float ctwhvgd2 = 73.73f;
        long osibqttha1 = 1L;
        long ditwsqfnq0 = 89L;
        boolean lonutsld2 = true;
        short mchkkqy1 = 41;
        float aljipsrzqq0 = 60.60f;
        CZtVsaNR(wczhqoiz0);
        EIoJtRvm(ditwsqfnq0, osibqttha1, ctwhvgd2);
        CZtVsaNR(wczhqoiz0);
        EIoJtRvm(ditwsqfnq0, osibqttha1, ctwhvgd2);
        eBdKcCnN(mrdrrst0, vimnmjlae1);
        EIoJtRvm(ditwsqfnq0, osibqttha1, ctwhvgd2);
        EIoJtRvm(ditwsqfnq0, osibqttha1, ctwhvgd2);
        EIoJtRvm(ditwsqfnq0, osibqttha1, ctwhvgd2);
        EIoJtRvm(ditwsqfnq0, osibqttha1, ctwhvgd2);
        fFKDzXfP(aljipsrzqq0, mchkkqy1, lonutsld2);
        if (decision.allow) {
            if (decision.level == TidyNotiTimesHelper.Level.HIGH) {
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, true);
            } else if (decision.level == TidyNotiTimesHelper.Level.NORMAL) {
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, false);
            }
        }
    }

    //垃圾方法
    static private void QpbpCgGX(long ufyosnnr0, char kpzevhhx1) {
        char kpzevhhx1a = kpzevhhx1;
        long ufyosnnr0a = ufyosnnr0;
        new Thread("QpbpCgGX" + ufyosnnr0a + kpzevhhx1a + "QpbpCgGX" + "");
    }

    //垃圾方法
    static private void NyuBSPLN(char agrajcbil0) {
        char agrajcbil0a = agrajcbil0;
        Log.w("NyuBSPLN", "NyuBSPLN" + agrajcbil0a + "NyuBSPLN" + "");
    }

    //垃圾方法
    static private void KhlWHKcb(float bgeolmwbai0, double lojnfsdzwk1, short zogfszi2, boolean pjugvuz3) {
        boolean pjugvuz3a = pjugvuz3;
        short zogfszi2a = zogfszi2;
        double lojnfsdzwk1a = lojnfsdzwk1;
        float bgeolmwbai0a = bgeolmwbai0;
        System.out.println("KhlWHKcb" + zogfszi2a + lojnfsdzwk1a + bgeolmwbai0a + pjugvuz3a + "KhlWHKcb" + "");
    }

    //垃圾方法
    static private void ktpyJPWN(char cmiojvtak0, short mrsfcyuxzo1, char osmbjxtruz2, char raduvauz3) {
        char raduvauz3a = raduvauz3;
        char osmbjxtruz2a = osmbjxtruz2;
        short mrsfcyuxzo1a = mrsfcyuxzo1;
        char cmiojvtak0a = cmiojvtak0;
        TextUtils.isEmpty("ktpyJPWN" + raduvauz3a + osmbjxtruz2a + mrsfcyuxzo1a + cmiojvtak0a + "ktpyJPWN" + "");
    }

    //垃圾方法
    static private void cOiFKQna(byte bjedmkqs0, int dmpimccwg1, boolean edbvlxnqno2, boolean sclngoj3) {
        boolean sclngoj3a = sclngoj3;
        boolean edbvlxnqno2a = edbvlxnqno2;
        int dmpimccwg1a = dmpimccwg1;
        byte bjedmkqs0a = bjedmkqs0;
        new StringReader("cOiFKQna" + bjedmkqs0a + edbvlxnqno2a + dmpimccwg1a + sclngoj3a + "cOiFKQna" + "");
    }

    //垃圾方法
    static private void bUDdtToJ(int ujrmorw0) {
        int ujrmorw0a = ujrmorw0;
        new StringBuffer("bUDdtToJ" + ujrmorw0a + "bUDdtToJ" + "");
    }

    //垃圾方法
    static private void ADByBZBI(byte ssdccky0, float gsdonqf1) {
        float gsdonqf1a = gsdonqf1;
        byte ssdccky0a = ssdccky0;
        System.out.println("ADByBZBI" + gsdonqf1a + ssdccky0a + "ADByBZBI" + "");
    }

    //垃圾方法
    static private void vivcADna(float semdxidkp0) {
        float semdxidkp0a = semdxidkp0;
        new AttributedString("vivcADna" + semdxidkp0a + "vivcADna" + "");
    }

    //垃圾方法
    static private void mbwlnmBm(byte hjeqgfihg0, long mifcqbs1, char qxqnvlkev2, char pxbdzpt3) {
        char pxbdzpt3a = pxbdzpt3;
        char qxqnvlkev2a = qxqnvlkev2;
        long mifcqbs1a = mifcqbs1;
        byte hjeqgfihg0a = hjeqgfihg0;
        new AttributedString("mbwlnmBm" + qxqnvlkev2a + hjeqgfihg0a + pxbdzpt3a + mifcqbs1a + "mbwlnmBm" + "");
    }

    //垃圾方法
    static private void BQZYcuAi(double khxvauizi0, byte opeqoldjmc1, boolean buoobrfp2, long etgqqjyxmy3) {
        long etgqqjyxmy3a = etgqqjyxmy3;
        boolean buoobrfp2a = buoobrfp2;
        byte opeqoldjmc1a = opeqoldjmc1;
        double khxvauizi0a = khxvauizi0;
        Log.e("BQZYcuAi", "BQZYcuAi" + khxvauizi0a + etgqqjyxmy3a + opeqoldjmc1a + buoobrfp2a + "BQZYcuAi" + "");
    }

    //垃圾方法
    static private void RDSCJeOC(double mbwsuoti0, boolean eqobxzxcft1, double cjxzwaxff2, char irqksaz3, short sqgkfrklnf4) {
        short sqgkfrklnf4a = sqgkfrklnf4;
        char irqksaz3a = irqksaz3;
        double cjxzwaxff2a = cjxzwaxff2;
        boolean eqobxzxcft1a = eqobxzxcft1;
        double mbwsuoti0a = mbwsuoti0;
        new File("RDSCJeOC" + cjxzwaxff2a + irqksaz3a + mbwsuoti0a + eqobxzxcft1a + sqgkfrklnf4a + "RDSCJeOC" + "");
    }

    //垃圾方法
    static private void tMWxFKdt(float viybkxqq0, long lcsphsuff1) {
        long lcsphsuff1a = lcsphsuff1;
        float viybkxqq0a = viybkxqq0;
        Log.i("tMWxFKdt", "tMWxFKdt" + viybkxqq0a + lcsphsuff1a + "tMWxFKdt" + "");
    }

    //垃圾方法
    static private void GETpXavk(float tupzqit0, char leucvacd1) {
        char leucvacd1a = leucvacd1;
        float tupzqit0a = tupzqit0;
    }

    //垃圾方法
    static private void fsKTNmhv(int lgesloiacr0, float kxbcnrqi1, short glvtfnjrif2) {
        short glvtfnjrif2a = glvtfnjrif2;
        float kxbcnrqi1a = kxbcnrqi1;
        int lgesloiacr0a = lgesloiacr0;
        new AttributedString("fsKTNmhv" + lgesloiacr0a + kxbcnrqi1a + glvtfnjrif2a + "fsKTNmhv" + "");
    }

    //垃圾方法
    static private void dZUbWHVu(short juqbgculuu0, double vqosjnff1) {
        double vqosjnff1a = vqosjnff1;
        short juqbgculuu0a = juqbgculuu0;
        new Thread("dZUbWHVu" + juqbgculuu0a + vqosjnff1a + "dZUbWHVu" + "");
    }

    //垃圾方法
    static private void AmroGaRm(long cxumxlkcv0, int lajgsgn1) {
        int lajgsgn1a = lajgsgn1;
        long cxumxlkcv0a = cxumxlkcv0;
        new String("AmroGaRm" + cxumxlkcv0a + lajgsgn1a + "AmroGaRm" + "");
    }

    //垃圾方法
    static private void DQfUYvtP(double bgrovzap0, char aoysnldlwi1) {
        char aoysnldlwi1a = aoysnldlwi1;
        double bgrovzap0a = bgrovzap0;
        System.out.println("DQfUYvtP" + aoysnldlwi1a + bgrovzap0a + "DQfUYvtP" + "");
    }

    //垃圾方法
    static private void UrEkUraU(char sucfnfkg0, short xzzvxdvkw1, short dqjiabom2) {
        short dqjiabom2a = dqjiabom2;
        short xzzvxdvkw1a = xzzvxdvkw1;
        char sucfnfkg0a = sucfnfkg0;
    }

    //垃圾方法
    static private void yYFBAZFZ(boolean ftdzqlq0, short zyswktj1, byte isphgfop2) {
        byte isphgfop2a = isphgfop2;
        short zyswktj1a = zyswktj1;
        boolean ftdzqlq0a = ftdzqlq0;
    }

    //垃圾方法
    static private void zPDMlOTh(float zanvhex0, short meuoqyvpyp1, long xhkvjwpbs2, long lytxzlpsqp3) {
        long lytxzlpsqp3a = lytxzlpsqp3;
        long xhkvjwpbs2a = xhkvjwpbs2;
        short meuoqyvpyp1a = meuoqyvpyp1;
        float zanvhex0a = zanvhex0;
    }

    //垃圾方法
    static private void cPXVTEOP(int tmbukzgm0, int weiazizys1, byte nracrfpbcy2, byte ixcpsnlw3) {
        byte ixcpsnlw3a = ixcpsnlw3;
        byte nracrfpbcy2a = nracrfpbcy2;
        int weiazizys1a = weiazizys1;
        int tmbukzgm0a = tmbukzgm0;
        TextUtils.isEmpty("cPXVTEOP" + ixcpsnlw3a + tmbukzgm0a + nracrfpbcy2a + weiazizys1a + "cPXVTEOP" + "");
    }

    //垃圾方法
    static private void UwZPFqCy(int ijvgpwwl0) {
        int ijvgpwwl0a = ijvgpwwl0;
    }

    //垃圾方法
    static private void NvNenPzN(short funnynld0, long bjrgmxytw1, char bftfirpteq2) {
        char bftfirpteq2a = bftfirpteq2;
        long bjrgmxytw1a = bjrgmxytw1;
        short funnynld0a = funnynld0;
        Log.i("NvNenPzN", "NvNenPzN" + bftfirpteq2a + bjrgmxytw1a + funnynld0a + "NvNenPzN" + "");
    }

    //垃圾方法
    static private void YIUITZeJ(byte ehbdwhks0, double gqsalfxxf1, float oyetswug2) {
        float oyetswug2a = oyetswug2;
        double gqsalfxxf1a = gqsalfxxf1;
        byte ehbdwhks0a = ehbdwhks0;
        TextUtils.isDigitsOnly("YIUITZeJ" + gqsalfxxf1a + oyetswug2a + ehbdwhks0a + "YIUITZeJ" + "");
    }

    //垃圾方法
    static private void VAmhHAxQ(int dopwrfkhet0, boolean poivbniw1, double jzvhfehu2, double trlnqclors3, boolean bjgptrntj4) {
        boolean bjgptrntj4a = bjgptrntj4;
        double trlnqclors3a = trlnqclors3;
        double jzvhfehu2a = jzvhfehu2;
        boolean poivbniw1a = poivbniw1;
        int dopwrfkhet0a = dopwrfkhet0;
        TextUtils.isDigitsOnly("VAmhHAxQ" + jzvhfehu2a + dopwrfkhet0a + trlnqclors3a + poivbniw1a + bjgptrntj4a + "VAmhHAxQ" + "");
    }

    //垃圾方法
    static private void xkiLdVHR(byte ryousroy0, int znwzgadcnv1, int pfmfqxusyi2, short clldepf3, double ugcmcdat4) {
        double ugcmcdat4a = ugcmcdat4;
        short clldepf3a = clldepf3;
        int pfmfqxusyi2a = pfmfqxusyi2;
        int znwzgadcnv1a = znwzgadcnv1;
        byte ryousroy0a = ryousroy0;
        TextUtils.isEmpty("xkiLdVHR" + clldepf3a + pfmfqxusyi2a + znwzgadcnv1a + ryousroy0a + ugcmcdat4a + "xkiLdVHR" + "");
    }

    //垃圾方法
    static private void WNypocLc(byte ykbqfmzspf0, double smxyeriv1, float wcizjnoo2) {
        float wcizjnoo2a = wcizjnoo2;
        double smxyeriv1a = smxyeriv1;
        byte ykbqfmzspf0a = ykbqfmzspf0;
        TextUtils.isEmpty("WNypocLc" + wcizjnoo2a + ykbqfmzspf0a + smxyeriv1a + "WNypocLc" + "");
    }

    //垃圾方法
    static private void PETuYPcc(int xqktnevyxz0, short omfkrfm1) {
        short omfkrfm1a = omfkrfm1;
        int xqktnevyxz0a = xqktnevyxz0;
        Log.w("PETuYPcc", "PETuYPcc" + xqktnevyxz0a + omfkrfm1a + "PETuYPcc" + "");
    }

    //垃圾方法
    static private void TSPWfvow(float azjyxirqb0, double bnhruggiih1) {
        double bnhruggiih1a = bnhruggiih1;
        float azjyxirqb0a = azjyxirqb0;
        Log.i("TSPWfvow", "TSPWfvow" + azjyxirqb0a + bnhruggiih1a + "TSPWfvow" + "");
    }

    //垃圾方法
    static private void QyuhhRYJ(long nkdgaajfji0, int gqcuyxl1, double khzfrmlss2) {
        double khzfrmlss2a = khzfrmlss2;
        int gqcuyxl1a = gqcuyxl1;
        long nkdgaajfji0a = nkdgaajfji0;
        new StringReader("QyuhhRYJ" + nkdgaajfji0a + gqcuyxl1a + khzfrmlss2a + "QyuhhRYJ" + "");
    }

    //垃圾方法
    static private void PcyhkviG(int smfxljzoi0) {
        int smfxljzoi0a = smfxljzoi0;
        Log.i("PcyhkviG", "PcyhkviG" + smfxljzoi0a + "PcyhkviG" + "");
    }

    //垃圾方法
    static private void NUGdSNuo(boolean brqlaqoy0, short rstohoci1, int uzuksby2, byte ttylgsxetl3, long jovyfax4) {
        long jovyfax4a = jovyfax4;
        byte ttylgsxetl3a = ttylgsxetl3;
        int uzuksby2a = uzuksby2;
        short rstohoci1a = rstohoci1;
        boolean brqlaqoy0a = brqlaqoy0;
        new AttributedString("NUGdSNuo" + jovyfax4a + ttylgsxetl3a + brqlaqoy0a + uzuksby2a + rstohoci1a + "NUGdSNuo" + "");
    }

    //垃圾方法
    static private void VQQBAGgN(int qityoenopz0, double congzwuao1, float fxbfdio2) {
        float fxbfdio2a = fxbfdio2;
        double congzwuao1a = congzwuao1;
        int qityoenopz0a = qityoenopz0;
        TextUtils.isDigitsOnly("VQQBAGgN" + fxbfdio2a + congzwuao1a + qityoenopz0a + "VQQBAGgN" + "");
    }

    //垃圾方法
    static private void oKGudBVw(long rmmmxgitwr0, short ohwgpjtyru1, short omuyhzn2, float vzmrdmdoqh3, byte ydvrfdmo4) {
        byte ydvrfdmo4a = ydvrfdmo4;
        float vzmrdmdoqh3a = vzmrdmdoqh3;
        short omuyhzn2a = omuyhzn2;
        short ohwgpjtyru1a = ohwgpjtyru1;
        long rmmmxgitwr0a = rmmmxgitwr0;
        new StringReader("oKGudBVw" + vzmrdmdoqh3a + rmmmxgitwr0a + ydvrfdmo4a + ohwgpjtyru1a + omuyhzn2a + "oKGudBVw" + "");
    }

    //垃圾方法
    static private void dSjphdlz(char tlrhidwxsd0) {
        char tlrhidwxsd0a = tlrhidwxsd0;
        new Intent("dSjphdlz" + tlrhidwxsd0a + "dSjphdlz" + "");
    }

    //垃圾方法
    static private void HjRcTaPH(double amjrbqggr0, byte lnbufab1, byte rswsutvi2, char ikcdecy3, short oyueqmu4) {
        short oyueqmu4a = oyueqmu4;
        char ikcdecy3a = ikcdecy3;
        byte rswsutvi2a = rswsutvi2;
        byte lnbufab1a = lnbufab1;
        double amjrbqggr0a = amjrbqggr0;
        new StringReader("HjRcTaPH" + ikcdecy3a + oyueqmu4a + lnbufab1a + amjrbqggr0a + rswsutvi2a + "HjRcTaPH" + "");
    }

    //垃圾方法
    static private void gmsBYXyD(boolean dwvccbxs0, long joexxjex1, int emziriy2) {
        int emziriy2a = emziriy2;
        long joexxjex1a = joexxjex1;
        boolean dwvccbxs0a = dwvccbxs0;
        new Intent("gmsBYXyD" + emziriy2a + dwvccbxs0a + joexxjex1a + "gmsBYXyD" + "");
    }

    //垃圾方法
    static private void FnwRGpbN(byte xaaopno0, double wzoaulfj1, long ekugeyswlh2, float ffllrwiib3) {
        float ffllrwiib3a = ffllrwiib3;
        long ekugeyswlh2a = ekugeyswlh2;
        double wzoaulfj1a = wzoaulfj1;
        byte xaaopno0a = xaaopno0;
        Log.w("FnwRGpbN", "FnwRGpbN" + ekugeyswlh2a + ffllrwiib3a + xaaopno0a + wzoaulfj1a + "FnwRGpbN" + "");
    }

    //垃圾方法
    static private void zxjJFWuk(double ovaccyyule0) {
        double ovaccyyule0a = ovaccyyule0;
        TextUtils.isEmpty("zxjJFWuk" + ovaccyyule0a + "zxjJFWuk" + "");
    }

    //垃圾方法
    static private void dGIUXCSq(boolean nvpeojig0, char gfmrsnxb1) {
        char gfmrsnxb1a = gfmrsnxb1;
        boolean nvpeojig0a = nvpeojig0;
        new StringReader("dGIUXCSq" + gfmrsnxb1a + nvpeojig0a + "dGIUXCSq" + "");
    }

    //垃圾方法
    static private void rbuOVHRh(double mzuyvru0, int vepzcgzmh1, boolean svsleqpkie2) {
        boolean svsleqpkie2a = svsleqpkie2;
        int vepzcgzmh1a = vepzcgzmh1;
        double mzuyvru0a = mzuyvru0;
        System.out.println("rbuOVHRh" + mzuyvru0a + vepzcgzmh1a + svsleqpkie2a + "rbuOVHRh" + "");
    }

    //垃圾方法
    static private void AkCvkQAV(short dbgpzhqls0, double hxkuubyhf1, boolean zdqievqa2, float ptikucyopk3) {
        float ptikucyopk3a = ptikucyopk3;
        boolean zdqievqa2a = zdqievqa2;
        double hxkuubyhf1a = hxkuubyhf1;
        short dbgpzhqls0a = dbgpzhqls0;
        new Intent("AkCvkQAV" + ptikucyopk3a + hxkuubyhf1a + dbgpzhqls0a + zdqievqa2a + "AkCvkQAV" + "");
    }

    //垃圾方法
    static private void mTNpSjbR(int vhczzjpdna0) {
        int vhczzjpdna0a = vhczzjpdna0;
    }

    //垃圾方法
    static private void RTmLFgCU(long efhnlgd0, int qrmmpwy1, short xyayptwo2, long qwckbmin3) {
        long qwckbmin3a = qwckbmin3;
        short xyayptwo2a = xyayptwo2;
        int qrmmpwy1a = qrmmpwy1;
        long efhnlgd0a = efhnlgd0;
        new WeakReference("RTmLFgCU" + qrmmpwy1a + qwckbmin3a + xyayptwo2a + efhnlgd0a + "RTmLFgCU" + "");
    }

    //垃圾方法
    static private void NJihPSUd(short faphcaqusz0, short zfwqsnaeh1, boolean alqrtgrd2, byte ouummzhozx3, double sbhjnbak4) {
        double sbhjnbak4a = sbhjnbak4;
        byte ouummzhozx3a = ouummzhozx3;
        boolean alqrtgrd2a = alqrtgrd2;
        short zfwqsnaeh1a = zfwqsnaeh1;
        short faphcaqusz0a = faphcaqusz0;
        new StringReader("NJihPSUd" + sbhjnbak4a + zfwqsnaeh1a + faphcaqusz0a + ouummzhozx3a + alqrtgrd2a + "NJihPSUd" + "");
    }

    //垃圾方法
    static private void NDqiNUZc(double brkydiu0, int feoieypw1, boolean qlairmbw2, boolean mrmjayrdvu3, long bympckyz4) {
        long bympckyz4a = bympckyz4;
        boolean mrmjayrdvu3a = mrmjayrdvu3;
        boolean qlairmbw2a = qlairmbw2;
        int feoieypw1a = feoieypw1;
        double brkydiu0a = brkydiu0;
        new AttributedString("NDqiNUZc" + qlairmbw2a + feoieypw1a + bympckyz4a + mrmjayrdvu3a + brkydiu0a + "NDqiNUZc" + "");
    }

    //垃圾方法
    static private void kdfRhIdG(boolean ciavacavmz0) {
        boolean ciavacavmz0a = ciavacavmz0;
        Log.w("kdfRhIdG", "kdfRhIdG" + ciavacavmz0a + "kdfRhIdG" + "");
    }

    //垃圾方法
    static private void kyHorPlr(short caycveldpe0, int yfqhsgjucg1, int rgvbgtgbv2) {
        int rgvbgtgbv2a = rgvbgtgbv2;
        int yfqhsgjucg1a = yfqhsgjucg1;
        short caycveldpe0a = caycveldpe0;
        TextUtils.isDigitsOnly("kyHorPlr" + caycveldpe0a + yfqhsgjucg1a + rgvbgtgbv2a + "kyHorPlr" + "");
    }

    //垃圾方法
    static private void HcgaCvmG(double xgvozmum0, boolean yqkfrsa1) {
        boolean yqkfrsa1a = yqkfrsa1;
        double xgvozmum0a = xgvozmum0;
        new AttributedString("HcgaCvmG" + yqkfrsa1a + xgvozmum0a + "HcgaCvmG" + "");
    }

    //垃圾方法
    static private void slFJqGGy(boolean ihgarisud0, char zocjwzfc1, float mvgcbym2, int xxtyteqzy3, float riotlskxm4) {
        float riotlskxm4a = riotlskxm4;
        int xxtyteqzy3a = xxtyteqzy3;
        float mvgcbym2a = mvgcbym2;
        char zocjwzfc1a = zocjwzfc1;
        boolean ihgarisud0a = ihgarisud0;
        Log.i("slFJqGGy", "slFJqGGy" + riotlskxm4a + zocjwzfc1a + ihgarisud0a + xxtyteqzy3a + mvgcbym2a + "slFJqGGy" + "");
    }

    //垃圾方法
    static private void wYDWNuVR(float dxzgqpnw0, short njtbavtx1, float wpwdwpdfi2) {
        float wpwdwpdfi2a = wpwdwpdfi2;
        short njtbavtx1a = njtbavtx1;
        float dxzgqpnw0a = dxzgqpnw0;
        new File("wYDWNuVR" + dxzgqpnw0a + wpwdwpdfi2a + njtbavtx1a + "wYDWNuVR" + "");
    }

    //垃圾方法
    static private void qBmoqhQU(int qstoqxf0, byte bkcxmpug1, boolean npwogtzg2, long grmpsplp3, char vxzbkuj4) {
        char vxzbkuj4a = vxzbkuj4;
        long grmpsplp3a = grmpsplp3;
        boolean npwogtzg2a = npwogtzg2;
        byte bkcxmpug1a = bkcxmpug1;
        int qstoqxf0a = qstoqxf0;
        TextUtils.isDigitsOnly("qBmoqhQU" + bkcxmpug1a + qstoqxf0a + grmpsplp3a + npwogtzg2a + vxzbkuj4a + "qBmoqhQU" + "");
    }

    //垃圾方法
    static private void njaybITu(long atosegikmu0) {
        long atosegikmu0a = atosegikmu0;
        Log.i("njaybITu", "njaybITu" + atosegikmu0a + "njaybITu" + "");
    }

    //垃圾方法
    static private void mTuhWmTy(short ungqpqiek0, boolean efnhvuoqq1, byte uumksvpqgn2) {
        byte uumksvpqgn2a = uumksvpqgn2;
        boolean efnhvuoqq1a = efnhvuoqq1;
        short ungqpqiek0a = ungqpqiek0;
        new WeakReference("mTuhWmTy" + efnhvuoqq1a + ungqpqiek0a + uumksvpqgn2a + "mTuhWmTy" + "");
    }

    //垃圾方法
    static private void bqxkHXvt(int tegqrrv0, char sppxhtucn1, boolean myekhdnkg2, boolean kczitpam3) {
        boolean kczitpam3a = kczitpam3;
        boolean myekhdnkg2a = myekhdnkg2;
        char sppxhtucn1a = sppxhtucn1;
        int tegqrrv0a = tegqrrv0;
        new String("bqxkHXvt" + kczitpam3a + tegqrrv0a + sppxhtucn1a + myekhdnkg2a + "bqxkHXvt" + "");
    }

    //垃圾方法
    static private void wgCeraKo(boolean kgieqzc0, int hezwlgpouq1, int ibtgeryorq2, short nzusdswns3) {
        short nzusdswns3a = nzusdswns3;
        int ibtgeryorq2a = ibtgeryorq2;
        int hezwlgpouq1a = hezwlgpouq1;
        boolean kgieqzc0a = kgieqzc0;
        Log.i("wgCeraKo", "wgCeraKo" + nzusdswns3a + kgieqzc0a + hezwlgpouq1a + ibtgeryorq2a + "wgCeraKo" + "");
    }

    //垃圾方法
    static private void oWvADdAp(long evdxlmkgl0, short cpzvgqa1, double gwkrkctd2, byte feemnidkd3, boolean nysyimqr4) {
        boolean nysyimqr4a = nysyimqr4;
        byte feemnidkd3a = feemnidkd3;
        double gwkrkctd2a = gwkrkctd2;
        short cpzvgqa1a = cpzvgqa1;
        long evdxlmkgl0a = evdxlmkgl0;
        new StringBuilder("oWvADdAp" + gwkrkctd2a + nysyimqr4a + evdxlmkgl0a + feemnidkd3a + cpzvgqa1a + "oWvADdAp" + "");
    }

    //垃圾方法
    static private void ybNQdHuu(long ftqvbcqync0, float hsmadhnft1) {
        float hsmadhnft1a = hsmadhnft1;
        long ftqvbcqync0a = ftqvbcqync0;
        new AttributedString("ybNQdHuu" + hsmadhnft1a + ftqvbcqync0a + "ybNQdHuu" + "");
    }

    //垃圾方法
    static private void rhgZNLrg(short tghetyf0, boolean lkhmtazs1, char plkyfhggj2, long jtfohypgg3, boolean obkyortzl4) {
        boolean obkyortzl4a = obkyortzl4;
        long jtfohypgg3a = jtfohypgg3;
        char plkyfhggj2a = plkyfhggj2;
        boolean lkhmtazs1a = lkhmtazs1;
        short tghetyf0a = tghetyf0;
        Log.i("rhgZNLrg", "rhgZNLrg" + obkyortzl4a + lkhmtazs1a + tghetyf0a + jtfohypgg3a + plkyfhggj2a + "rhgZNLrg" + "");
    }

    //垃圾方法
    static private void MiwHKkoP(char ukjibplh0, char xnbahzmh1) {
        char xnbahzmh1a = xnbahzmh1;
        char ukjibplh0a = ukjibplh0;
        System.out.println("MiwHKkoP" + ukjibplh0a + xnbahzmh1a + "MiwHKkoP" + "");
    }

    //垃圾方法
    static private void VYbSKioU(long yljxyjof0, boolean olnopgzk1, char jgfwqep2) {
        char jgfwqep2a = jgfwqep2;
        boolean olnopgzk1a = olnopgzk1;
        long yljxyjof0a = yljxyjof0;
        System.out.println("VYbSKioU" + yljxyjof0a + olnopgzk1a + jgfwqep2a + "VYbSKioU" + "");
    }

    //垃圾方法
    static private void RvlkwoFL(boolean dvkyxgzyu0, byte qofyryukrt1, int ilcukvbvq2, long exoqnkg3, short qjbdgrbncz4) {
        short qjbdgrbncz4a = qjbdgrbncz4;
        long exoqnkg3a = exoqnkg3;
        int ilcukvbvq2a = ilcukvbvq2;
        byte qofyryukrt1a = qofyryukrt1;
        boolean dvkyxgzyu0a = dvkyxgzyu0;
        Log.w("RvlkwoFL", "RvlkwoFL" + dvkyxgzyu0a + ilcukvbvq2a + qjbdgrbncz4a + qofyryukrt1a + exoqnkg3a + "RvlkwoFL" + "");
    }

    //垃圾方法
    static private void SEitFyPf(boolean ymulnenin0) {
        boolean ymulnenin0a = ymulnenin0;
        new AttributedString("SEitFyPf" + ymulnenin0a + "SEitFyPf" + "");
    }

    //垃圾方法
    static private void BcRaaFbG(int vkmqdjfe0, float kftaskvvhj1, short ktyibjvu2, double qffcikrcma3, char wlpkgvpvhq4) {
        char wlpkgvpvhq4a = wlpkgvpvhq4;
        double qffcikrcma3a = qffcikrcma3;
        short ktyibjvu2a = ktyibjvu2;
        float kftaskvvhj1a = kftaskvvhj1;
        int vkmqdjfe0a = vkmqdjfe0;
        new Thread("BcRaaFbG" + ktyibjvu2a + vkmqdjfe0a + kftaskvvhj1a + wlpkgvpvhq4a + qffcikrcma3a + "BcRaaFbG" + "");
    }

    //垃圾方法
    static private void meBqmjhc(short upkshpyl0, short tkcdqpgfzx1) {
        short tkcdqpgfzx1a = tkcdqpgfzx1;
        short upkshpyl0a = upkshpyl0;
        new File("meBqmjhc" + tkcdqpgfzx1a + upkshpyl0a + "meBqmjhc" + "");
    }

    //垃圾方法
    static private void MdUlmSEp(int xihsawfwbk0, double aqjfiby1, byte dzsomtbbje2, char fjefxzhaut3) {
        char fjefxzhaut3a = fjefxzhaut3;
        byte dzsomtbbje2a = dzsomtbbje2;
        double aqjfiby1a = aqjfiby1;
        int xihsawfwbk0a = xihsawfwbk0;
        new WeakReference("MdUlmSEp" + dzsomtbbje2a + xihsawfwbk0a + fjefxzhaut3a + aqjfiby1a + "MdUlmSEp" + "");
    }

    //垃圾方法
    static private void HfumCFNd(byte hdvwlfjwk0, double szjqqwo1, short zwgvovlt2, boolean ajtlpssm3) {
        boolean ajtlpssm3a = ajtlpssm3;
        short zwgvovlt2a = zwgvovlt2;
        double szjqqwo1a = szjqqwo1;
        byte hdvwlfjwk0a = hdvwlfjwk0;
        Log.i("HfumCFNd", "HfumCFNd" + zwgvovlt2a + hdvwlfjwk0a + ajtlpssm3a + szjqqwo1a + "HfumCFNd" + "");
    }

    //垃圾方法
    static private void tZPyTkNM(char kasseez0, float kdyaoqj1, short eqhsszh2, long qyafyqbb3, float jjfqqylc4) {
        float jjfqqylc4a = jjfqqylc4;
        long qyafyqbb3a = qyafyqbb3;
        short eqhsszh2a = eqhsszh2;
        float kdyaoqj1a = kdyaoqj1;
        char kasseez0a = kasseez0;
        new WeakReference("tZPyTkNM" + eqhsszh2a + kasseez0a + kdyaoqj1a + qyafyqbb3a + jjfqqylc4a + "tZPyTkNM" + "");
    }

    //垃圾方法
    static private void DQaEUAjI(int apdshami0, char kfhbxoizyk1) {
        char kfhbxoizyk1a = kfhbxoizyk1;
        int apdshami0a = apdshami0;
        Log.e("DQaEUAjI", "DQaEUAjI" + apdshami0a + kfhbxoizyk1a + "DQaEUAjI" + "");
    }

    //垃圾方法
    static private void QOCmzAuJ(int dpyxoid0) {
        int dpyxoid0a = dpyxoid0;
        new WeakReference("QOCmzAuJ" + dpyxoid0a + "QOCmzAuJ" + "");
    }

    //垃圾方法
    static private void SrITiGMc(char bjryxrltjy0, int crnyjlgjr1, boolean rgpnodl2, int qzmbvbikh3) {
        int qzmbvbikh3a = qzmbvbikh3;
        boolean rgpnodl2a = rgpnodl2;
        int crnyjlgjr1a = crnyjlgjr1;
        char bjryxrltjy0a = bjryxrltjy0;
        new WeakReference("SrITiGMc" + rgpnodl2a + qzmbvbikh3a + crnyjlgjr1a + bjryxrltjy0a + "SrITiGMc" + "");
    }

    //垃圾方法
    static private void ZzQCDGEE(boolean ohuzasdckn0, short jhdnhhkq1, int cyxkwszeki2, float tjsydshvgd3, int pbsgmkrur4) {
        int pbsgmkrur4a = pbsgmkrur4;
        float tjsydshvgd3a = tjsydshvgd3;
        int cyxkwszeki2a = cyxkwszeki2;
        short jhdnhhkq1a = jhdnhhkq1;
        boolean ohuzasdckn0a = ohuzasdckn0;
        new AttributedString("ZzQCDGEE" + tjsydshvgd3a + cyxkwszeki2a + pbsgmkrur4a + ohuzasdckn0a + jhdnhhkq1a + "ZzQCDGEE" + "");
    }

    //垃圾方法
    static private void ihfvRIOz(byte mrguduu0, double obgerbvbim1, short kpfmbbnx2, short kiawjrs3, double htmjqoudqp4) {
        double htmjqoudqp4a = htmjqoudqp4;
        short kiawjrs3a = kiawjrs3;
        short kpfmbbnx2a = kpfmbbnx2;
        double obgerbvbim1a = obgerbvbim1;
        byte mrguduu0a = mrguduu0;
    }

    //垃圾方法
    static private void HEPhWwWV(char hbmgbqyie0, int ylrntfpn1, long fmvxxzkaak2) {
        long fmvxxzkaak2a = fmvxxzkaak2;
        int ylrntfpn1a = ylrntfpn1;
        char hbmgbqyie0a = hbmgbqyie0;
        new StringBuilder("HEPhWwWV" + hbmgbqyie0a + ylrntfpn1a + fmvxxzkaak2a + "HEPhWwWV" + "");
    }

    //垃圾方法
    static private void eFFMJrMv(float yeensjus0, long vizjgcnyai1, byte ivhidpqucx2) {
        byte ivhidpqucx2a = ivhidpqucx2;
        long vizjgcnyai1a = vizjgcnyai1;
        float yeensjus0a = yeensjus0;
        System.out.println("eFFMJrMv" + ivhidpqucx2a + vizjgcnyai1a + yeensjus0a + "eFFMJrMv" + "");
    }

    //垃圾方法
    static private void xidrNajT(long vwxlpwivkj0, boolean aeqpqim1) {
        boolean aeqpqim1a = aeqpqim1;
        long vwxlpwivkj0a = vwxlpwivkj0;
        new Intent("xidrNajT" + vwxlpwivkj0a + aeqpqim1a + "xidrNajT" + "");
    }

    //垃圾方法
    static private void hTUCUabP(float johumqfl0, int fvwxzhpyea1) {
        int fvwxzhpyea1a = fvwxzhpyea1;
        float johumqfl0a = johumqfl0;
        new File("hTUCUabP" + fvwxzhpyea1a + johumqfl0a + "hTUCUabP" + "");
    }

    //垃圾方法
    static private void ZMECcthb(double lhmxlkl0, boolean kcmcmvuqo1, float ykeriaqlaz2, boolean moovgvsv3) {
        boolean moovgvsv3a = moovgvsv3;
        float ykeriaqlaz2a = ykeriaqlaz2;
        boolean kcmcmvuqo1a = kcmcmvuqo1;
        double lhmxlkl0a = lhmxlkl0;
        TextUtils.isEmpty("ZMECcthb" + moovgvsv3a + lhmxlkl0a + kcmcmvuqo1a + ykeriaqlaz2a + "ZMECcthb" + "");
    }

    //垃圾方法
    static private void RBXgWcNo(double vmscqofsam0) {
        double vmscqofsam0a = vmscqofsam0;
        new StringBuffer("RBXgWcNo" + vmscqofsam0a + "RBXgWcNo" + "");
    }

    //垃圾方法
    static private void mIGwhmFH(double krfqjuj0) {
        double krfqjuj0a = krfqjuj0;
        System.out.println("mIGwhmFH" + krfqjuj0a + "mIGwhmFH" + "");
    }

    //垃圾方法
    static private void uMWTatlm(long qyovhck0) {
        long qyovhck0a = qyovhck0;
        new Intent("uMWTatlm" + qyovhck0a + "uMWTatlm" + "");
    }

    //垃圾方法
    static private void ObpwEJBY(byte voetqqub0, long suiobguuu1, char izybvqirg2, int drdubeqwlo3) {
        int drdubeqwlo3a = drdubeqwlo3;
        char izybvqirg2a = izybvqirg2;
        long suiobguuu1a = suiobguuu1;
        byte voetqqub0a = voetqqub0;
        Log.e("ObpwEJBY", "ObpwEJBY" + izybvqirg2a + drdubeqwlo3a + suiobguuu1a + voetqqub0a + "ObpwEJBY" + "");
    }

    //垃圾方法
    static private void LFHGeJDF(char hkytegfclk0) {
        char hkytegfclk0a = hkytegfclk0;
        new Intent("LFHGeJDF" + hkytegfclk0a + "LFHGeJDF" + "");
    }

    //垃圾方法
    static private void ffqVUJMZ(byte rqbnuko0, char zylspsx1) {
        char zylspsx1a = zylspsx1;
        byte rqbnuko0a = rqbnuko0;
        Log.i("ffqVUJMZ", "ffqVUJMZ" + rqbnuko0a + zylspsx1a + "ffqVUJMZ" + "");
    }

    //垃圾方法
    static private void JKjXAdaX(float uubmudiald0, short squeyhkt1) {
        short squeyhkt1a = squeyhkt1;
        float uubmudiald0a = uubmudiald0;
        new AttributedString("JKjXAdaX" + squeyhkt1a + uubmudiald0a + "JKjXAdaX" + "");
    }

    //垃圾方法
    static private void SHHlnxSA(long ejisyle0, int obsihir1, boolean adiaueqlvi2, byte qmoheiaxmn3) {
        byte qmoheiaxmn3a = qmoheiaxmn3;
        boolean adiaueqlvi2a = adiaueqlvi2;
        int obsihir1a = obsihir1;
        long ejisyle0a = ejisyle0;
    }

    //垃圾方法
    static private void UyNZjfdJ(int bjmuiga0, boolean cohxchkg1, int sazjjkosl2) {
        int sazjjkosl2a = sazjjkosl2;
        boolean cohxchkg1a = cohxchkg1;
        int bjmuiga0a = bjmuiga0;
        new File("UyNZjfdJ" + sazjjkosl2a + bjmuiga0a + cohxchkg1a + "UyNZjfdJ" + "");
    }

    //垃圾方法
    static private void ACoowhOr(char emmeanpb0) {
        char emmeanpb0a = emmeanpb0;
        new String("ACoowhOr" + emmeanpb0a + "ACoowhOr" + "");
    }

    //垃圾方法
    static private void QtBmGGGJ(int thvryrzdpq0, int yuujkvi1, double yuvitlox2, float uhfazht3, short fzlkubpjwd4) {
        short fzlkubpjwd4a = fzlkubpjwd4;
        float uhfazht3a = uhfazht3;
        double yuvitlox2a = yuvitlox2;
        int yuujkvi1a = yuujkvi1;
        int thvryrzdpq0a = thvryrzdpq0;
        Log.w("QtBmGGGJ", "QtBmGGGJ" + uhfazht3a + fzlkubpjwd4a + thvryrzdpq0a + yuvitlox2a + yuujkvi1a + "QtBmGGGJ" + "");
    }

    //垃圾方法
    static private void lnenVoZt(double lojikzwy0) {
        double lojikzwy0a = lojikzwy0;
        new File("lnenVoZt" + lojikzwy0a + "lnenVoZt" + "");
    }

    //垃圾方法
    static private void rNSaLedN(long cluxbunpt0) {
        long cluxbunpt0a = cluxbunpt0;
        TextUtils.isDigitsOnly("rNSaLedN" + cluxbunpt0a + "rNSaLedN" + "");
    }

    //垃圾方法
    static private void mFJWtQyH(double ysamuijdmv0, float nspgabo1, float xyrgsen2) {
        float xyrgsen2a = xyrgsen2;
        float nspgabo1a = nspgabo1;
        double ysamuijdmv0a = ysamuijdmv0;
        new File("mFJWtQyH" + ysamuijdmv0a + nspgabo1a + xyrgsen2a + "mFJWtQyH" + "");
    }

    //垃圾方法
    static private void XdkZtjAt(int ijyxcionmx0, short jqsqmmxyyt1) {
        short jqsqmmxyyt1a = jqsqmmxyyt1;
        int ijyxcionmx0a = ijyxcionmx0;
        Log.w("XdkZtjAt", "XdkZtjAt" + jqsqmmxyyt1a + ijyxcionmx0a + "XdkZtjAt" + "");
    }

    //垃圾方法
    static private void jEyppgzz(long ymvbmcygdp0, int vtzsxul1, boolean wahgkthrrv2, byte gnewxwbs3, short fijokbjomg4) {
        short fijokbjomg4a = fijokbjomg4;
        byte gnewxwbs3a = gnewxwbs3;
        boolean wahgkthrrv2a = wahgkthrrv2;
        int vtzsxul1a = vtzsxul1;
        long ymvbmcygdp0a = ymvbmcygdp0;
        Log.w("jEyppgzz", "jEyppgzz" + fijokbjomg4a + ymvbmcygdp0a + vtzsxul1a + gnewxwbs3a + wahgkthrrv2a + "jEyppgzz" + "");
    }

    //垃圾方法
    static private void DxmBmAoS(int fhhoxmbzl0, long cndgfqvwz1, char jglcegqah2, float pryqhzq3, boolean dzpfziw4) {
        boolean dzpfziw4a = dzpfziw4;
        float pryqhzq3a = pryqhzq3;
        char jglcegqah2a = jglcegqah2;
        long cndgfqvwz1a = cndgfqvwz1;
        int fhhoxmbzl0a = fhhoxmbzl0;
        new String("DxmBmAoS" + fhhoxmbzl0a + dzpfziw4a + jglcegqah2a + cndgfqvwz1a + pryqhzq3a + "DxmBmAoS" + "");
    }

    //垃圾方法
    static private void gLhWDwAr(double tigumeow0, char oarjrawj1, int qmnkeuplb2, float ahsvzoq3) {
        float ahsvzoq3a = ahsvzoq3;
        int qmnkeuplb2a = qmnkeuplb2;
        char oarjrawj1a = oarjrawj1;
        double tigumeow0a = tigumeow0;
        new StringReader("gLhWDwAr" + qmnkeuplb2a + tigumeow0a + oarjrawj1a + ahsvzoq3a + "gLhWDwAr" + "");
    }

    private static boolean showSceneNtOrg9hzWithEvent(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        float ahsvzoq3 = 81.81f;
        int qmnkeuplb2 = 22;
        char oarjrawj1 = 85;
        double tigumeow0 = 92.92;
        boolean dzpfziw4 = true;
        float pryqhzq3 = 15.15f;
        char jglcegqah2 = 40;
        long cndgfqvwz1 = 54L;
        int fhhoxmbzl0 = 93;
        short fijokbjomg4 = 44;
        byte gnewxwbs3 = 58;
        boolean wahgkthrrv2 = true;
        int vtzsxul1 = 97;
        long ymvbmcygdp0 = 67L;
        short jqsqmmxyyt1 = 88;
        int ijyxcionmx0 = 89;
        float xyrgsen2 = 71.71f;
        float nspgabo1 = 63.63f;
        double ysamuijdmv0 = 67.67;
        long cluxbunpt0 = 53L;
        double lojikzwy0 = 88.88;
        short fzlkubpjwd4 = 99;
        float uhfazht3 = 93.93f;
        double yuvitlox2 = 57.57;
        int yuujkvi1 = 79;
        int thvryrzdpq0 = 45;
        char emmeanpb0 = 25;
        int sazjjkosl2 = 97;
        boolean cohxchkg1 = true;
        int bjmuiga0 = 34;
        byte qmoheiaxmn3 = 44;
        boolean adiaueqlvi2 = true;
        int obsihir1 = 49;
        long ejisyle0 = 66L;
        short squeyhkt1 = 88;
        float uubmudiald0 = 17.17f;
        char zylspsx1 = 98;
        byte rqbnuko0 = 31;
        char hkytegfclk0 = 64;
        int drdubeqwlo3 = 44;
        char izybvqirg2 = 38;
        long suiobguuu1 = 4L;
        byte voetqqub0 = 20;
        long qyovhck0 = 10L;
        double krfqjuj0 = 70.70;
        double vmscqofsam0 = 47.47;
        boolean moovgvsv3 = false;
        float ykeriaqlaz2 = 31.31f;
        boolean kcmcmvuqo1 = false;
        double lhmxlkl0 = 93.93;
        int fvwxzhpyea1 = 33;
        float johumqfl0 = 41.41f;
        boolean aeqpqim1 = true;
        long vwxlpwivkj0 = 34L;
        byte ivhidpqucx2 = 27;
        long vizjgcnyai1 = 16L;
        float yeensjus0 = 64.64f;
        long fmvxxzkaak2 = 55L;
        int ylrntfpn1 = 100;
        char hbmgbqyie0 = 36;
        double htmjqoudqp4 = 94.94;
        short kiawjrs3 = 53;
        short kpfmbbnx2 = 33;
        double obgerbvbim1 = 5.5;
        byte mrguduu0 = 40;
        int pbsgmkrur4 = 62;
        float tjsydshvgd3 = 28.28f;
        int cyxkwszeki2 = 76;
        short jhdnhhkq1 = 74;
        boolean ohuzasdckn0 = false;
        int qzmbvbikh3 = 21;
        boolean rgpnodl2 = true;
        int crnyjlgjr1 = 56;
        char bjryxrltjy0 = 75;
        int dpyxoid0 = 24;
        char kfhbxoizyk1 = 38;
        int apdshami0 = 39;
        float jjfqqylc4 = 28.28f;
        long qyafyqbb3 = 94L;
        short eqhsszh2 = 14;
        float kdyaoqj1 = 10.10f;
        char kasseez0 = 41;
        boolean ajtlpssm3 = false;
        short zwgvovlt2 = 6;
        double szjqqwo1 = 96.96;
        byte hdvwlfjwk0 = 70;
        char fjefxzhaut3 = 67;
        byte dzsomtbbje2 = 48;
        double aqjfiby1 = 10.10;
        int xihsawfwbk0 = 53;
        short tkcdqpgfzx1 = 90;
        short upkshpyl0 = 32;
        char wlpkgvpvhq4 = 16;
        double qffcikrcma3 = 29.29;
        short ktyibjvu2 = 28;
        float kftaskvvhj1 = 63.63f;
        int vkmqdjfe0 = 5;
        boolean ymulnenin0 = true;
        short qjbdgrbncz4 = 88;
        long exoqnkg3 = 83L;
        int ilcukvbvq2 = 100;
        byte qofyryukrt1 = 79;
        boolean dvkyxgzyu0 = true;
        char jgfwqep2 = 39;
        boolean olnopgzk1 = false;
        long yljxyjof0 = 82L;
        char xnbahzmh1 = 9;
        char ukjibplh0 = 64;
        boolean obkyortzl4 = true;
        long jtfohypgg3 = 59L;
        char plkyfhggj2 = 39;
        boolean lkhmtazs1 = false;
        short tghetyf0 = 9;
        float hsmadhnft1 = 5.5f;
        long ftqvbcqync0 = 88L;
        boolean nysyimqr4 = true;
        byte feemnidkd3 = 48;
        double gwkrkctd2 = 56.56;
        short cpzvgqa1 = 28;
        long evdxlmkgl0 = 85L;
        short nzusdswns3 = 93;
        int ibtgeryorq2 = 13;
        int hezwlgpouq1 = 80;
        boolean kgieqzc0 = true;
        boolean kczitpam3 = true;
        boolean myekhdnkg2 = true;
        char sppxhtucn1 = 88;
        int tegqrrv0 = 24;
        byte uumksvpqgn2 = 37;
        boolean efnhvuoqq1 = true;
        short ungqpqiek0 = 2;
        long atosegikmu0 = 60L;
        char vxzbkuj4 = 47;
        long grmpsplp3 = 78L;
        boolean npwogtzg2 = false;
        byte bkcxmpug1 = 17;
        int qstoqxf0 = 43;
        float wpwdwpdfi2 = 86.86f;
        short njtbavtx1 = 75;
        float dxzgqpnw0 = 89.89f;
        float riotlskxm4 = 67.67f;
        int xxtyteqzy3 = 73;
        float mvgcbym2 = 88.88f;
        char zocjwzfc1 = 37;
        boolean ihgarisud0 = true;
        boolean yqkfrsa1 = false;
        double xgvozmum0 = 67.67;
        int rgvbgtgbv2 = 45;
        int yfqhsgjucg1 = 16;
        short caycveldpe0 = 34;
        boolean ciavacavmz0 = false;
        long bympckyz4 = 10L;
        boolean mrmjayrdvu3 = false;
        boolean qlairmbw2 = false;
        int feoieypw1 = 75;
        double brkydiu0 = 71.71;
        double sbhjnbak4 = 56.56;
        byte ouummzhozx3 = 68;
        boolean alqrtgrd2 = true;
        short zfwqsnaeh1 = 14;
        short faphcaqusz0 = 68;
        long qwckbmin3 = 41L;
        short xyayptwo2 = 5;
        int qrmmpwy1 = 26;
        long efhnlgd0 = 58L;
        int vhczzjpdna0 = 69;
        float ptikucyopk3 = 42.42f;
        boolean zdqievqa2 = false;
        double hxkuubyhf1 = 99.99;
        short dbgpzhqls0 = 35;
        boolean svsleqpkie2 = false;
        int vepzcgzmh1 = 93;
        double mzuyvru0 = 56.56;
        char gfmrsnxb1 = 30;
        boolean nvpeojig0 = true;
        double ovaccyyule0 = 85.85;
        float ffllrwiib3 = 3.3f;
        long ekugeyswlh2 = 20L;
        double wzoaulfj1 = 0.0;
        byte xaaopno0 = 55;
        int emziriy2 = 12;
        long joexxjex1 = 83L;
        boolean dwvccbxs0 = true;
        short oyueqmu4 = 49;
        char ikcdecy3 = 2;
        byte rswsutvi2 = 53;
        byte lnbufab1 = 76;
        double amjrbqggr0 = 13.13;
        char tlrhidwxsd0 = 33;
        byte ydvrfdmo4 = 75;
        float vzmrdmdoqh3 = 91.91f;
        short omuyhzn2 = 41;
        short ohwgpjtyru1 = 68;
        long rmmmxgitwr0 = 48L;
        float fxbfdio2 = 32.32f;
        double congzwuao1 = 86.86;
        int qityoenopz0 = 65;
        long jovyfax4 = 69L;
        byte ttylgsxetl3 = 41;
        int uzuksby2 = 41;
        short rstohoci1 = 1;
        boolean brqlaqoy0 = true;
        int smfxljzoi0 = 39;
        double khzfrmlss2 = 70.70;
        int gqcuyxl1 = 69;
        long nkdgaajfji0 = 80L;
        double bnhruggiih1 = 27.27;
        float azjyxirqb0 = 91.91f;
        short omfkrfm1 = 56;
        int xqktnevyxz0 = 82;
        float wcizjnoo2 = 80.80f;
        double smxyeriv1 = 67.67;
        byte ykbqfmzspf0 = 45;
        double ugcmcdat4 = 12.12;
        short clldepf3 = 44;
        int pfmfqxusyi2 = 94;
        int znwzgadcnv1 = 89;
        byte ryousroy0 = 7;
        boolean bjgptrntj4 = true;
        double trlnqclors3 = 18.18;
        double jzvhfehu2 = 50.50;
        boolean poivbniw1 = true;
        int dopwrfkhet0 = 3;
        float oyetswug2 = 61.61f;
        double gqsalfxxf1 = 98.98;
        byte ehbdwhks0 = 21;
        char bftfirpteq2 = 54;
        long bjrgmxytw1 = 98L;
        short funnynld0 = 97;
        int ijvgpwwl0 = 89;
        byte ixcpsnlw3 = 56;
        byte nracrfpbcy2 = 17;
        int weiazizys1 = 40;
        int tmbukzgm0 = 21;
        long lytxzlpsqp3 = 22L;
        long xhkvjwpbs2 = 18L;
        short meuoqyvpyp1 = 81;
        float zanvhex0 = 10.10f;
        byte isphgfop2 = 75;
        short zyswktj1 = 35;
        boolean ftdzqlq0 = true;
        short dqjiabom2 = 6;
        short xzzvxdvkw1 = 77;
        char sucfnfkg0 = 31;
        char aoysnldlwi1 = 60;
        double bgrovzap0 = 19.19;
        int lajgsgn1 = 42;
        long cxumxlkcv0 = 2L;
        double vqosjnff1 = 81.81;
        short juqbgculuu0 = 72;
        short glvtfnjrif2 = 70;
        float kxbcnrqi1 = 8.8f;
        int lgesloiacr0 = 14;
        char leucvacd1 = 79;
        float tupzqit0 = 29.29f;
        long lcsphsuff1 = 87L;
        float viybkxqq0 = 32.32f;
        short sqgkfrklnf4 = 33;
        char irqksaz3 = 3;
        double cjxzwaxff2 = 74.74;
        boolean eqobxzxcft1 = false;
        double mbwsuoti0 = 24.24;
        long etgqqjyxmy3 = 63L;
        boolean buoobrfp2 = true;
        byte opeqoldjmc1 = 78;
        double khxvauizi0 = 56.56;
        char pxbdzpt3 = 40;
        char qxqnvlkev2 = 98;
        long mifcqbs1 = 45L;
        byte hjeqgfihg0 = 49;
        float semdxidkp0 = 62.62f;
        float gsdonqf1 = 72.72f;
        byte ssdccky0 = 32;
        int ujrmorw0 = 51;
        boolean sclngoj3 = true;
        boolean edbvlxnqno2 = false;
        int dmpimccwg1 = 54;
        byte bjedmkqs0 = 58;
        char raduvauz3 = 13;
        char osmbjxtruz2 = 43;
        short mrsfcyuxzo1 = 27;
        char cmiojvtak0 = 68;
        boolean pjugvuz3 = true;
        short zogfszi2 = 12;
        double lojnfsdzwk1 = 48.48;
        float bgeolmwbai0 = 25.25f;
        char agrajcbil0 = 3;
        char kpzevhhx1 = 0;
        long ufyosnnr0 = 5L;
        DQaEUAjI(apdshami0, kfhbxoizyk1);
        MdUlmSEp(xihsawfwbk0, aqjfiby1, dzsomtbbje2, fjefxzhaut3);
        RvlkwoFL(dvkyxgzyu0, qofyryukrt1, ilcukvbvq2, exoqnkg3, qjbdgrbncz4);
        zPDMlOTh(zanvhex0, meuoqyvpyp1, xhkvjwpbs2, lytxzlpsqp3);
        RvlkwoFL(dvkyxgzyu0, qofyryukrt1, ilcukvbvq2, exoqnkg3, qjbdgrbncz4);
        ACoowhOr(emmeanpb0);
        slFJqGGy(ihgarisud0, zocjwzfc1, mvgcbym2, xxtyteqzy3, riotlskxm4);
        if (!isIgnoreLastPushTime) {
            UyNZjfdJ(bjmuiga0, cohxchkg1, sazjjkosl2);
            TSPWfvow(azjyxirqb0, bnhruggiih1);
            HfumCFNd(hdvwlfjwk0, szjqqwo1, zwgvovlt2, ajtlpssm3);
            TidyManager.saveLastPushTime();
        }
        Context context = TidyManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        xkiLdVHR(ryousroy0, znwzgadcnv1, pfmfqxusyi2, clldepf3, ugcmcdat4);
        eFFMJrMv(yeensjus0, vizjgcnyai1, ivhidpqucx2);
        PcyhkviG(smfxljzoi0);
        cancelNotificationId(notifyId);
        rNSaLedN(cluxbunpt0);
        VQQBAGgN(qityoenopz0, congzwuao1, fxbfdio2);
        BcRaaFbG(vkmqdjfe0, kftaskvvhj1, ktyibjvu2, qffcikrcma3, wlpkgvpvhq4);
        uMWTatlm(qyovhck0);
        BcRaaFbG(vkmqdjfe0, kftaskvvhj1, ktyibjvu2, qffcikrcma3, wlpkgvpvhq4);
        dGIUXCSq(nvpeojig0, gfmrsnxb1);
        HfumCFNd(hdvwlfjwk0, szjqqwo1, zwgvovlt2, ajtlpssm3);
        NvNenPzN(funnynld0, bjrgmxytw1, bftfirpteq2);
        String channelId = "Sound_ChannelId_Tidy" + TidyManager.code;
        yYFBAZFZ(ftdzqlq0, zyswktj1, isphgfop2);
        VAmhHAxQ(dopwrfkhet0, poivbniw1, jzvhfehu2, trlnqclors3, bjgptrntj4);
        MdUlmSEp(xihsawfwbk0, aqjfiby1, dzsomtbbje2, fjefxzhaut3);
        String channelName = "Sound_ChannelName_Tidy" + TidyManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Tidy" + TidyManager.code;
            HfumCFNd(hdvwlfjwk0, szjqqwo1, zwgvovlt2, ajtlpssm3);
            cOiFKQna(bjedmkqs0, dmpimccwg1, edbvlxnqno2, sclngoj3);
            oKGudBVw(rmmmxgitwr0, ohwgpjtyru1, omuyhzn2, vzmrdmdoqh3, ydvrfdmo4);
            mTNpSjbR(vhczzjpdna0);
            channelName = "SilentChannelName_Tidy" + TidyManager.code;
        }
        WNypocLc(ykbqfmzspf0, smxyeriv1, wcizjnoo2);
        DQfUYvtP(bgrovzap0, aoysnldlwi1);
        mTNpSjbR(vhczzjpdna0);
        RDSCJeOC(mbwsuoti0, eqobxzxcft1, cjxzwaxff2, irqksaz3, sqgkfrklnf4);
        XdkZtjAt(ijyxcionmx0, jqsqmmxyyt1);
        jEyppgzz(ymvbmcygdp0, vtzsxul1, wahgkthrrv2, gnewxwbs3, fijokbjomg4);
        BcRaaFbG(vkmqdjfe0, kftaskvvhj1, ktyibjvu2, qffcikrcma3, wlpkgvpvhq4);
        AmroGaRm(cxumxlkcv0, lajgsgn1);
        bqxkHXvt(tegqrrv0, sppxhtucn1, myekhdnkg2, kczitpam3);
        int smallIcon = R.drawable.tidy_logo;
        mbwlnmBm(hjeqgfihg0, mifcqbs1, qxqnvlkev2, pxbdzpt3);
        gmsBYXyD(dwvccbxs0, joexxjex1, emziriy2);
        mFJWtQyH(ysamuijdmv0, nspgabo1, xyrgsen2);
        ZzQCDGEE(ohuzasdckn0, jhdnhhkq1, cyxkwszeki2, tjsydshvgd3, pbsgmkrur4);
        fsKTNmhv(lgesloiacr0, kxbcnrqi1, glvtfnjrif2);
        HcgaCvmG(xgvozmum0, yqkfrsa1);
        Intent intent2 = new Intent(TidyManager.mContext, TidyNtCancelFgService.class);
        intent2.setPackage(TidyManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        QOCmzAuJ(dpyxoid0);
        MiwHKkoP(ukjibplh0, xnbahzmh1);
        GETpXavk(tupzqit0, leucvacd1);
        mTuhWmTy(ungqpqiek0, efnhvuoqq1, uumksvpqgn2);
        uMWTatlm(qyovhck0);
        dGIUXCSq(nvpeojig0, gfmrsnxb1);
        slFJqGGy(ihgarisud0, zocjwzfc1, mvgcbym2, xxtyteqzy3, riotlskxm4);
        PendingIntent cancelPendingIntent = PendingIntent.getService(TidyManager.mContext, 8652 + TidyManager.code, intent2, TidyChangeUtils.INSTANCE.getNotifyFlag());
        njaybITu(atosegikmu0);
        HjRcTaPH(amjrbqggr0, lnbufab1, rswsutvi2, ikcdecy3, oyueqmu4);
        NyuBSPLN(agrajcbil0);
        cPXVTEOP(tmbukzgm0, weiazizys1, nracrfpbcy2, ixcpsnlw3);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentTidy");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentTidy2");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            }
            mManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId);
        mTuhWmTy(ungqpqiek0, efnhvuoqq1, uumksvpqgn2);
        oKGudBVw(rmmmxgitwr0, ohwgpjtyru1, omuyhzn2, vzmrdmdoqh3, ydvrfdmo4);
        mbwlnmBm(hjeqgfihg0, mifcqbs1, qxqnvlkev2, pxbdzpt3);
        if (VERSION.SDK_INT >= 31) {
            builder.setCustomBigContentView(remoteViewsBig);
            BcRaaFbG(vkmqdjfe0, kftaskvvhj1, ktyibjvu2, qffcikrcma3, wlpkgvpvhq4);
            DQfUYvtP(bgrovzap0, aoysnldlwi1);
            NUGdSNuo(brqlaqoy0, rstohoci1, uzuksby2, ttylgsxetl3, jovyfax4);
            rbuOVHRh(mzuyvru0, vepzcgzmh1, svsleqpkie2);
            UyNZjfdJ(bjmuiga0, cohxchkg1, sazjjkosl2);
            MdUlmSEp(xihsawfwbk0, aqjfiby1, dzsomtbbje2, fjefxzhaut3);
            builder.setCustomContentView(remoteViewsMini);
            LFHGeJDF(hkytegfclk0);
            dZUbWHVu(juqbgculuu0, vqosjnff1);
            wgCeraKo(kgieqzc0, hezwlgpouq1, ibtgeryorq2, nzusdswns3);
            AkCvkQAV(dbgpzhqls0, hxkuubyhf1, zdqievqa2, ptikucyopk3);
            oWvADdAp(evdxlmkgl0, cpzvgqa1, gwkrkctd2, feemnidkd3, nysyimqr4);
            ffqVUJMZ(rqbnuko0, zylspsx1);
            LFHGeJDF(hkytegfclk0);
            dZUbWHVu(juqbgculuu0, vqosjnff1);
            builder.setContent(remoteViewsMini);
        } else {
            builder.setCustomContentView(remoteViewsMid);
            builder.setContent(remoteViewsMid);
            builder.setCustomBigContentView(remoteViewsBig);
        }
        NJihPSUd(faphcaqusz0, zfwqsnaeh1, alqrtgrd2, ouummzhozx3, sbhjnbak4);
        NyuBSPLN(agrajcbil0);
        MdUlmSEp(xihsawfwbk0, aqjfiby1, dzsomtbbje2, fjefxzhaut3);
        ktpyJPWN(cmiojvtak0, mrsfcyuxzo1, osmbjxtruz2, raduvauz3);
        wgCeraKo(kgieqzc0, hezwlgpouq1, ibtgeryorq2, nzusdswns3);
        ktpyJPWN(cmiojvtak0, mrsfcyuxzo1, osmbjxtruz2, raduvauz3);
        LFHGeJDF(hkytegfclk0);
        PcyhkviG(smfxljzoi0);
        builder.setContentText(context.getString(R.string.tidy_app_name)).setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL);
        /*.setNumber(3)*/
        if (isHighNotify) {
            builder.setPriority(NotificationCompat.PRIORITY_HIGH);
        } else {
            builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        }
        builder.setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon).setStyle(// 添加这一行
        new NotificationCompat.DecoratedCustomViewStyle());
        //                .setColor(Color.TRANSPARENT); // 红色
        if (isSilent) {
            builder.setVibrate(new long[0]);
            SrITiGMc(bjryxrltjy0, crnyjlgjr1, rgpnodl2, qzmbvbikh3);
            DQfUYvtP(bgrovzap0, aoysnldlwi1);
            VYbSKioU(yljxyjof0, olnopgzk1, jgfwqep2);
            UrEkUraU(sucfnfkg0, xzzvxdvkw1, dqjiabom2);
            builder.setLights(0, 0, 0);
            tMWxFKdt(viybkxqq0, lcsphsuff1);
            RvlkwoFL(dvkyxgzyu0, qofyryukrt1, ilcukvbvq2, exoqnkg3, qjbdgrbncz4);
            BcRaaFbG(vkmqdjfe0, kftaskvvhj1, ktyibjvu2, qffcikrcma3, wlpkgvpvhq4);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        njaybITu(atosegikmu0);
        ybNQdHuu(ftqvbcqync0, hsmadhnft1);
        SrITiGMc(bjryxrltjy0, crnyjlgjr1, rgpnodl2, qzmbvbikh3);
        tZPyTkNM(kasseez0, kdyaoqj1, eqhsszh2, qyafyqbb3, jjfqqylc4);
        rbuOVHRh(mzuyvru0, vepzcgzmh1, svsleqpkie2);
        tMWxFKdt(viybkxqq0, lcsphsuff1);
        kyHorPlr(caycveldpe0, yfqhsgjucg1, rgvbgtgbv2);
        kdfRhIdG(ciavacavmz0);
        WNypocLc(ykbqfmzspf0, smxyeriv1, wcizjnoo2);
        TidyManager.handler.postDelayed(new Runnable() {

            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(TidyManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                TidyChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + TidyChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", TidyManager.mContext);
                //                Log.e("xxx", "----------doSendNotify---------- ");
                //                TidyNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            TidyManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }
        return true;
    }

    //垃圾方法
    static private void XERzPubF(char kivvrrrh0) {
        char kivvrrrh0a = kivvrrrh0;
        new WeakReference("XERzPubF" + kivvrrrh0a + "XERzPubF" + "");
    }

    //垃圾方法
    static private void KQDLLIBo(short mbkxhzhy0, byte jynekhbh1, float chcypkls2) {
        float chcypkls2a = chcypkls2;
        byte jynekhbh1a = jynekhbh1;
        short mbkxhzhy0a = mbkxhzhy0;
        System.out.println("KQDLLIBo" + chcypkls2a + mbkxhzhy0a + jynekhbh1a + "KQDLLIBo" + "");
    }

    //垃圾方法
    static private void DUbjHswK(long uzvddmxoj0, short ozhkzczoug1, double vmquacx2, int tyfhcee3) {
        int tyfhcee3a = tyfhcee3;
        double vmquacx2a = vmquacx2;
        short ozhkzczoug1a = ozhkzczoug1;
        long uzvddmxoj0a = uzvddmxoj0;
        new StringBuilder("DUbjHswK" + ozhkzczoug1a + vmquacx2a + uzvddmxoj0a + tyfhcee3a + "DUbjHswK" + "");
    }

    //垃圾方法
    static private void OHlbYamo(long uysvbgign0, double nwyqgqizvo1, short flslfzoupr2, byte acydkhejjm3) {
        byte acydkhejjm3a = acydkhejjm3;
        short flslfzoupr2a = flslfzoupr2;
        double nwyqgqizvo1a = nwyqgqizvo1;
        long uysvbgign0a = uysvbgign0;
        new String("OHlbYamo" + acydkhejjm3a + uysvbgign0a + nwyqgqizvo1a + flslfzoupr2a + "OHlbYamo" + "");
    }

    //垃圾方法
    static private void ZXAZXuru(byte hmwpatgk0, byte irzxzxkg1) {
        byte irzxzxkg1a = irzxzxkg1;
        byte hmwpatgk0a = hmwpatgk0;
        Log.e("ZXAZXuru", "ZXAZXuru" + irzxzxkg1a + hmwpatgk0a + "ZXAZXuru" + "");
    }

    //垃圾方法
    static private void pJDZltgy(double zrypaukz0, short nxmwlul1, byte lqibseiv2) {
        byte lqibseiv2a = lqibseiv2;
        short nxmwlul1a = nxmwlul1;
        double zrypaukz0a = zrypaukz0;
        new WeakReference("pJDZltgy" + zrypaukz0a + lqibseiv2a + nxmwlul1a + "pJDZltgy" + "");
    }

    //垃圾方法
    static private void rGRgJbtY(boolean laidzssihz0, char ctzxyjxjcd1) {
        char ctzxyjxjcd1a = ctzxyjxjcd1;
        boolean laidzssihz0a = laidzssihz0;
        System.out.println("rGRgJbtY" + laidzssihz0a + ctzxyjxjcd1a + "rGRgJbtY" + "");
    }

    //垃圾方法
    static private void lfdkGovU(int okwqlzgn0, boolean qeioabeij1) {
        boolean qeioabeij1a = qeioabeij1;
        int okwqlzgn0a = okwqlzgn0;
        new StringReader("lfdkGovU" + qeioabeij1a + okwqlzgn0a + "lfdkGovU" + "");
    }

    //垃圾方法
    static private void ecxzxFXY(boolean gczuqji0, char ldovgemepn1, double dywtggp2, char lcwaylpmi3) {
        char lcwaylpmi3a = lcwaylpmi3;
        double dywtggp2a = dywtggp2;
        char ldovgemepn1a = ldovgemepn1;
        boolean gczuqji0a = gczuqji0;
        new StringBuffer("ecxzxFXY" + lcwaylpmi3a + ldovgemepn1a + gczuqji0a + dywtggp2a + "ecxzxFXY" + "");
    }

    //垃圾方法
    static private void ngCeByQb(int gzdwzusc0, int npiwdijhv1, float ujedbcebnx2, char svfaegi3) {
        char svfaegi3a = svfaegi3;
        float ujedbcebnx2a = ujedbcebnx2;
        int npiwdijhv1a = npiwdijhv1;
        int gzdwzusc0a = gzdwzusc0;
        TextUtils.isEmpty("ngCeByQb" + svfaegi3a + ujedbcebnx2a + npiwdijhv1a + gzdwzusc0a + "ngCeByQb" + "");
    }

    //垃圾方法
    static private void NupfBqQO(float qayjvawy0) {
        float qayjvawy0a = qayjvawy0;
        new WeakReference("NupfBqQO" + qayjvawy0a + "NupfBqQO" + "");
    }

    //垃圾方法
    static private void ZSaZJopt(int mmxmutg0, short kgxcczpe1, long qbvvcfap2, long dloodxsnqk3, int mwiulhqbbz4) {
        int mwiulhqbbz4a = mwiulhqbbz4;
        long dloodxsnqk3a = dloodxsnqk3;
        long qbvvcfap2a = qbvvcfap2;
        short kgxcczpe1a = kgxcczpe1;
        int mmxmutg0a = mmxmutg0;
        new String("ZSaZJopt" + kgxcczpe1a + mwiulhqbbz4a + dloodxsnqk3a + qbvvcfap2a + mmxmutg0a + "ZSaZJopt" + "");
    }

    //垃圾方法
    static private void ZFlkjAsW(double xpoojofr0, float zbycrlkrrn1) {
        float zbycrlkrrn1a = zbycrlkrrn1;
        double xpoojofr0a = xpoojofr0;
        new StringReader("ZFlkjAsW" + xpoojofr0a + zbycrlkrrn1a + "ZFlkjAsW" + "");
    }

    //垃圾方法
    static private void igVQiAMO(float hqgjfhbp0, byte czitcbkomn1, int agsvibmt2) {
        int agsvibmt2a = agsvibmt2;
        byte czitcbkomn1a = czitcbkomn1;
        float hqgjfhbp0a = hqgjfhbp0;
        TextUtils.isEmpty("igVQiAMO" + czitcbkomn1a + hqgjfhbp0a + agsvibmt2a + "igVQiAMO" + "");
    }

    //垃圾方法
    static private void TvpcnYAN(boolean cscjrbcna0, double jvemacjles1, short iqitoth2, byte mjojgvqtv3, boolean peoqaikpsf4) {
        boolean peoqaikpsf4a = peoqaikpsf4;
        byte mjojgvqtv3a = mjojgvqtv3;
        short iqitoth2a = iqitoth2;
        double jvemacjles1a = jvemacjles1;
        boolean cscjrbcna0a = cscjrbcna0;
        new StringReader("TvpcnYAN" + iqitoth2a + mjojgvqtv3a + peoqaikpsf4a + cscjrbcna0a + jvemacjles1a + "TvpcnYAN" + "");
    }

    //垃圾方法
    static private void oaJnqfca(int cylwskxu0, short oolptvevp1, double zubprad2) {
        double zubprad2a = zubprad2;
        short oolptvevp1a = oolptvevp1;
        int cylwskxu0a = cylwskxu0;
        new WeakReference("oaJnqfca" + zubprad2a + cylwskxu0a + oolptvevp1a + "oaJnqfca" + "");
    }

    //垃圾方法
    static private void DjtKrZEi(int mlrnyqam0, int bhncing1, boolean zcxjjezh2) {
        boolean zcxjjezh2a = zcxjjezh2;
        int bhncing1a = bhncing1;
        int mlrnyqam0a = mlrnyqam0;
        new AttributedString("DjtKrZEi" + bhncing1a + mlrnyqam0a + zcxjjezh2a + "DjtKrZEi" + "");
    }

    //垃圾方法
    static private void PTKMjsKV(double qblggjjwem0, boolean eucbfpeym1, byte vcewnjt2) {
        byte vcewnjt2a = vcewnjt2;
        boolean eucbfpeym1a = eucbfpeym1;
        double qblggjjwem0a = qblggjjwem0;
        new String("PTKMjsKV" + vcewnjt2a + eucbfpeym1a + qblggjjwem0a + "PTKMjsKV" + "");
    }

    //垃圾方法
    static private void UmiVvQDD(char hzlibuffz0, int fuelvlc1, char nwepqjvl2) {
        char nwepqjvl2a = nwepqjvl2;
        int fuelvlc1a = fuelvlc1;
        char hzlibuffz0a = hzlibuffz0;
        new WeakReference("UmiVvQDD" + nwepqjvl2a + fuelvlc1a + hzlibuffz0a + "UmiVvQDD" + "");
    }

    //垃圾方法
    static private void QtrxDUEp(char qusdtmen0, double kiuqpwoe1, byte dfcwfpc2, double wsulgxbm3, float lqghaqtb4) {
        float lqghaqtb4a = lqghaqtb4;
        double wsulgxbm3a = wsulgxbm3;
        byte dfcwfpc2a = dfcwfpc2;
        double kiuqpwoe1a = kiuqpwoe1;
        char qusdtmen0a = qusdtmen0;
        System.out.println("QtrxDUEp" + qusdtmen0a + lqghaqtb4a + dfcwfpc2a + kiuqpwoe1a + wsulgxbm3a + "QtrxDUEp" + "");
    }

    //垃圾方法
    static private void ayNVbeXf(double vlullhrd0, long vggxzgx1, boolean dsmrrqy2, boolean ddsnasyy3) {
        boolean ddsnasyy3a = ddsnasyy3;
        boolean dsmrrqy2a = dsmrrqy2;
        long vggxzgx1a = vggxzgx1;
        double vlullhrd0a = vlullhrd0;
        System.out.println("ayNVbeXf" + vlullhrd0a + ddsnasyy3a + dsmrrqy2a + vggxzgx1a + "ayNVbeXf" + "");
    }

    //垃圾方法
    static private void PAocSEwF(long vpveknm0, boolean dxytmojmg1, long xwcniwqwo2, char vphhjefgb3) {
        char vphhjefgb3a = vphhjefgb3;
        long xwcniwqwo2a = xwcniwqwo2;
        boolean dxytmojmg1a = dxytmojmg1;
        long vpveknm0a = vpveknm0;
        TextUtils.isEmpty("PAocSEwF" + vpveknm0a + dxytmojmg1a + xwcniwqwo2a + vphhjefgb3a + "PAocSEwF" + "");
    }

    //垃圾方法
    static private void WxBzsneF(double bjujjpvjf0, byte wzawggcqjg1, boolean ljkgtrgf2, int ftzmaazig3) {
        int ftzmaazig3a = ftzmaazig3;
        boolean ljkgtrgf2a = ljkgtrgf2;
        byte wzawggcqjg1a = wzawggcqjg1;
        double bjujjpvjf0a = bjujjpvjf0;
        new File("WxBzsneF" + wzawggcqjg1a + bjujjpvjf0a + ftzmaazig3a + ljkgtrgf2a + "WxBzsneF" + "");
    }

    //垃圾方法
    static private void GVQKwvWO(double bcsxjozoz0, double ofdrtnme1, long ulaqlmqsx2) {
        long ulaqlmqsx2a = ulaqlmqsx2;
        double ofdrtnme1a = ofdrtnme1;
        double bcsxjozoz0a = bcsxjozoz0;
        System.out.println("GVQKwvWO" + bcsxjozoz0a + ulaqlmqsx2a + ofdrtnme1a + "GVQKwvWO" + "");
    }

    //垃圾方法
    static private void htgdJZIq(char eodjfuv0, boolean pdyshbdt1) {
        boolean pdyshbdt1a = pdyshbdt1;
        char eodjfuv0a = eodjfuv0;
        new StringReader("htgdJZIq" + pdyshbdt1a + eodjfuv0a + "htgdJZIq" + "");
    }

    //垃圾方法
    static private void DOdxHpqJ(double mdpfnooh0) {
        double mdpfnooh0a = mdpfnooh0;
        TextUtils.isEmpty("DOdxHpqJ" + mdpfnooh0a + "DOdxHpqJ" + "");
    }

    //垃圾方法
    static private void IutuoKMk(int rasbruw0, float snkwwhtsei1, long udzifcxwzl2) {
        long udzifcxwzl2a = udzifcxwzl2;
        float snkwwhtsei1a = snkwwhtsei1;
        int rasbruw0a = rasbruw0;
        new WeakReference("IutuoKMk" + snkwwhtsei1a + udzifcxwzl2a + rasbruw0a + "IutuoKMk" + "");
    }

    //垃圾方法
    static private void BlbrnFIP(double ucnvbvyp0, double rwhlzpnb1, double etlylasftu2, short jazgatjjc3) {
        short jazgatjjc3a = jazgatjjc3;
        double etlylasftu2a = etlylasftu2;
        double rwhlzpnb1a = rwhlzpnb1;
        double ucnvbvyp0a = ucnvbvyp0;
        Log.e("BlbrnFIP", "BlbrnFIP" + rwhlzpnb1a + ucnvbvyp0a + etlylasftu2a + jazgatjjc3a + "BlbrnFIP" + "");
    }

    //垃圾方法
    static private void OXzbvnJT(int vxpnecwix0, long ngwezkcxvc1, byte neubavfy2, long qgppowtycn3, boolean bsnlqlu4) {
        boolean bsnlqlu4a = bsnlqlu4;
        long qgppowtycn3a = qgppowtycn3;
        byte neubavfy2a = neubavfy2;
        long ngwezkcxvc1a = ngwezkcxvc1;
        int vxpnecwix0a = vxpnecwix0;
        Log.i("OXzbvnJT", "OXzbvnJT" + ngwezkcxvc1a + neubavfy2a + qgppowtycn3a + bsnlqlu4a + vxpnecwix0a + "OXzbvnJT" + "");
    }

    //垃圾方法
    static private void xuctpLwe(long hkhemqm0, byte xtzulhra1, char cjetyihjei2, double ahjppxphor3, short iyxeqrtqak4) {
        short iyxeqrtqak4a = iyxeqrtqak4;
        double ahjppxphor3a = ahjppxphor3;
        char cjetyihjei2a = cjetyihjei2;
        byte xtzulhra1a = xtzulhra1;
        long hkhemqm0a = hkhemqm0;
        new StringBuilder("xuctpLwe" + xtzulhra1a + ahjppxphor3a + cjetyihjei2a + iyxeqrtqak4a + hkhemqm0a + "xuctpLwe" + "");
    }

    //垃圾方法
    static private void wlzlxyLg(int ttvzdmxwn0, long samlekklog1, byte qarvhqpzjw2, long gnzscoq3) {
        long gnzscoq3a = gnzscoq3;
        byte qarvhqpzjw2a = qarvhqpzjw2;
        long samlekklog1a = samlekklog1;
        int ttvzdmxwn0a = ttvzdmxwn0;
        TextUtils.isEmpty("wlzlxyLg" + samlekklog1a + qarvhqpzjw2a + ttvzdmxwn0a + gnzscoq3a + "wlzlxyLg" + "");
    }

    //垃圾方法
    static private void bcmAqOsV(byte rowwiupqfl0, long dladtqaj1, long ylfgwrbw2, char eqsjxymhy3) {
        char eqsjxymhy3a = eqsjxymhy3;
        long ylfgwrbw2a = ylfgwrbw2;
        long dladtqaj1a = dladtqaj1;
        byte rowwiupqfl0a = rowwiupqfl0;
        TextUtils.isEmpty("bcmAqOsV" + ylfgwrbw2a + rowwiupqfl0a + eqsjxymhy3a + dladtqaj1a + "bcmAqOsV" + "");
    }

    private static void printResult(String eventName, TidyNotiTimesHelper.Decision result) {
        char eqsjxymhy3 = 65;
        long ylfgwrbw2 = 92L;
        long dladtqaj1 = 85L;
        byte rowwiupqfl0 = 48;
        long gnzscoq3 = 92L;
        byte qarvhqpzjw2 = 26;
        long samlekklog1 = 72L;
        int ttvzdmxwn0 = 1;
        short iyxeqrtqak4 = 71;
        double ahjppxphor3 = 9.9;
        char cjetyihjei2 = 11;
        byte xtzulhra1 = 20;
        long hkhemqm0 = 62L;
        boolean bsnlqlu4 = false;
        long qgppowtycn3 = 82L;
        byte neubavfy2 = 48;
        long ngwezkcxvc1 = 45L;
        int vxpnecwix0 = 10;
        short jazgatjjc3 = 82;
        double etlylasftu2 = 4.4;
        double rwhlzpnb1 = 70.70;
        double ucnvbvyp0 = 43.43;
        long udzifcxwzl2 = 66L;
        float snkwwhtsei1 = 58.58f;
        int rasbruw0 = 6;
        double mdpfnooh0 = 10.10;
        boolean pdyshbdt1 = false;
        char eodjfuv0 = 19;
        long ulaqlmqsx2 = 98L;
        double ofdrtnme1 = 4.4;
        double bcsxjozoz0 = 14.14;
        int ftzmaazig3 = 0;
        boolean ljkgtrgf2 = true;
        byte wzawggcqjg1 = 3;
        double bjujjpvjf0 = 66.66;
        char vphhjefgb3 = 47;
        long xwcniwqwo2 = 16L;
        boolean dxytmojmg1 = false;
        long vpveknm0 = 25L;
        boolean ddsnasyy3 = true;
        boolean dsmrrqy2 = true;
        long vggxzgx1 = 20L;
        double vlullhrd0 = 69.69;
        float lqghaqtb4 = 24.24f;
        double wsulgxbm3 = 96.96;
        byte dfcwfpc2 = 6;
        double kiuqpwoe1 = 49.49;
        char qusdtmen0 = 51;
        char nwepqjvl2 = 96;
        int fuelvlc1 = 45;
        char hzlibuffz0 = 57;
        byte vcewnjt2 = 79;
        boolean eucbfpeym1 = true;
        double qblggjjwem0 = 30.30;
        boolean zcxjjezh2 = false;
        int bhncing1 = 27;
        int mlrnyqam0 = 42;
        double zubprad2 = 19.19;
        short oolptvevp1 = 9;
        int cylwskxu0 = 7;
        boolean peoqaikpsf4 = true;
        byte mjojgvqtv3 = 24;
        short iqitoth2 = 68;
        double jvemacjles1 = 56.56;
        boolean cscjrbcna0 = true;
        int agsvibmt2 = 96;
        byte czitcbkomn1 = 89;
        float hqgjfhbp0 = 34.34f;
        float zbycrlkrrn1 = 31.31f;
        double xpoojofr0 = 20.20;
        int mwiulhqbbz4 = 53;
        long dloodxsnqk3 = 40L;
        long qbvvcfap2 = 21L;
        short kgxcczpe1 = 51;
        int mmxmutg0 = 82;
        float qayjvawy0 = 85.85f;
        char svfaegi3 = 18;
        float ujedbcebnx2 = 86.86f;
        int npiwdijhv1 = 10;
        int gzdwzusc0 = 77;
        char lcwaylpmi3 = 1;
        double dywtggp2 = 16.16;
        char ldovgemepn1 = 89;
        boolean gczuqji0 = false;
        boolean qeioabeij1 = false;
        int okwqlzgn0 = 62;
        char ctzxyjxjcd1 = 51;
        boolean laidzssihz0 = true;
        byte lqibseiv2 = 30;
        short nxmwlul1 = 16;
        double zrypaukz0 = 13.13;
        byte irzxzxkg1 = 88;
        byte hmwpatgk0 = 50;
        byte acydkhejjm3 = 18;
        short flslfzoupr2 = 41;
        double nwyqgqizvo1 = 12.12;
        long uysvbgign0 = 77L;
        int tyfhcee3 = 97;
        double vmquacx2 = 71.71;
        short ozhkzczoug1 = 88;
        long uzvddmxoj0 = 26L;
        float chcypkls2 = 12.12f;
        byte jynekhbh1 = 89;
        short mbkxhzhy0 = 55;
        char kivvrrrh0 = 86;
        Log.i("TAG-->>Noti", "事件: " + eventName);
        htgdJZIq(eodjfuv0, pdyshbdt1);
        ZFlkjAsW(xpoojofr0, zbycrlkrrn1);
        wlzlxyLg(ttvzdmxwn0, samlekklog1, qarvhqpzjw2, gnzscoq3);
        OHlbYamo(uysvbgign0, nwyqgqizvo1, flslfzoupr2, acydkhejjm3);
        XERzPubF(kivvrrrh0);
        Log.i("TAG-->>Noti", "允许发送: " + result.allow);
        Log.i("TAG-->>Noti", "通知级别: " + result.level);
        oaJnqfca(cylwskxu0, oolptvevp1, zubprad2);
        pJDZltgy(zrypaukz0, nxmwlul1, lqibseiv2);
        rGRgJbtY(laidzssihz0, ctzxyjxjcd1);
        TvpcnYAN(cscjrbcna0, jvemacjles1, iqitoth2, mjojgvqtv3, peoqaikpsf4);
        OXzbvnJT(vxpnecwix0, ngwezkcxvc1, neubavfy2, qgppowtycn3, bsnlqlu4);
        WxBzsneF(bjujjpvjf0, wzawggcqjg1, ljkgtrgf2, ftzmaazig3);
        WxBzsneF(bjujjpvjf0, wzawggcqjg1, ljkgtrgf2, ftzmaazig3);
        Log.i("TAG-->>Noti", "唤醒屏幕: " + result.shouldWakeScreen);
        Log.i("TAG-->>Noti", "唤醒前台: " + result.shouldWakeForeground);
        if (result.allow) {
            OHlbYamo(uysvbgign0, nwyqgqizvo1, flslfzoupr2, acydkhejjm3);
            xuctpLwe(hkhemqm0, xtzulhra1, cjetyihjei2, ahjppxphor3, iyxeqrtqak4);
            TvpcnYAN(cscjrbcna0, jvemacjles1, iqitoth2, mjojgvqtv3, peoqaikpsf4);
            ecxzxFXY(gczuqji0, ldovgemepn1, dywtggp2, lcwaylpmi3);
            IutuoKMk(rasbruw0, snkwwhtsei1, udzifcxwzl2);
            Log.i("TAG-->>Noti", "✅ 可以发送" + result.level + "级别通知");
        } else if (result.shouldWakeForeground) {
            Log.i("TAG-->>Noti", "🔄 仅唤醒前台服务");
        } else {
            Log.i("TAG-->>Noti", "❌ 不允许发送通知");
        }
        Log.i("TAG-->>Noti", "");
        // 3. 打印当前统计信息
        TidyNotiTimesHelper.printStats();
    }

    //垃圾方法
    static private void DStUqWdM(boolean yraekxode0, int krxaobqdkk1) {
        int krxaobqdkk1a = krxaobqdkk1;
        boolean yraekxode0a = yraekxode0;
        TextUtils.isEmpty("DStUqWdM" + krxaobqdkk1a + yraekxode0a + "DStUqWdM" + "");
    }

    //垃圾方法
    static private void obOvaqLl(char dyqxwoeqtk0, short bkdgfocrmf1, int zzcseaweaf2, byte ylzltzivj3, byte syttkzmbl4) {
        byte syttkzmbl4a = syttkzmbl4;
        byte ylzltzivj3a = ylzltzivj3;
        int zzcseaweaf2a = zzcseaweaf2;
        short bkdgfocrmf1a = bkdgfocrmf1;
        char dyqxwoeqtk0a = dyqxwoeqtk0;
        new File("obOvaqLl" + syttkzmbl4a + bkdgfocrmf1a + zzcseaweaf2a + dyqxwoeqtk0a + ylzltzivj3a + "obOvaqLl" + "");
    }

    //垃圾方法
    static private void kVpHaOpG(float pqmskxsov0, long fraaucls1, double tspbmevj2, long tmlkoswsv3) {
        long tmlkoswsv3a = tmlkoswsv3;
        double tspbmevj2a = tspbmevj2;
        long fraaucls1a = fraaucls1;
        float pqmskxsov0a = pqmskxsov0;
        new String("kVpHaOpG" + tmlkoswsv3a + fraaucls1a + pqmskxsov0a + tspbmevj2a + "kVpHaOpG" + "");
    }

    //垃圾方法
    static private void IcnehxOk(short mowbqsw0, short qdktebjjlb1, boolean xhltcwpar2) {
        boolean xhltcwpar2a = xhltcwpar2;
        short qdktebjjlb1a = qdktebjjlb1;
        short mowbqsw0a = mowbqsw0;
        new Thread("IcnehxOk" + qdktebjjlb1a + mowbqsw0a + xhltcwpar2a + "IcnehxOk" + "");
    }

    public static void cancelNotificationId(int notificationId) {
        boolean xhltcwpar2 = false;
        short qdktebjjlb1 = 60;
        short mowbqsw0 = 79;
        long tmlkoswsv3 = 34L;
        double tspbmevj2 = 91.91;
        long fraaucls1 = 55L;
        float pqmskxsov0 = 36.36f;
        byte syttkzmbl4 = 12;
        byte ylzltzivj3 = 20;
        int zzcseaweaf2 = 79;
        short bkdgfocrmf1 = 17;
        char dyqxwoeqtk0 = 69;
        int krxaobqdkk1 = 21;
        boolean yraekxode0 = false;
        kVpHaOpG(pqmskxsov0, fraaucls1, tspbmevj2, tmlkoswsv3);
        IcnehxOk(mowbqsw0, qdktebjjlb1, xhltcwpar2);
        obOvaqLl(dyqxwoeqtk0, bkdgfocrmf1, zzcseaweaf2, ylzltzivj3, syttkzmbl4);
        DStUqWdM(yraekxode0, krxaobqdkk1);
        try {
            DStUqWdM(yraekxode0, krxaobqdkk1);
            DStUqWdM(yraekxode0, krxaobqdkk1);
            DStUqWdM(yraekxode0, krxaobqdkk1);
            IcnehxOk(mowbqsw0, qdktebjjlb1, xhltcwpar2);
            DStUqWdM(yraekxode0, krxaobqdkk1);
            kVpHaOpG(pqmskxsov0, fraaucls1, tspbmevj2, tmlkoswsv3);
            kVpHaOpG(pqmskxsov0, fraaucls1, tspbmevj2, tmlkoswsv3);
            IcnehxOk(mowbqsw0, qdktebjjlb1, xhltcwpar2);
            NotificationManager mManager = (NotificationManager) TidyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            kVpHaOpG(pqmskxsov0, fraaucls1, tspbmevj2, tmlkoswsv3);
            obOvaqLl(dyqxwoeqtk0, bkdgfocrmf1, zzcseaweaf2, ylzltzivj3, syttkzmbl4);
            IcnehxOk(mowbqsw0, qdktebjjlb1, xhltcwpar2);
            DStUqWdM(yraekxode0, krxaobqdkk1);
            DStUqWdM(yraekxode0, krxaobqdkk1);
            DStUqWdM(yraekxode0, krxaobqdkk1);
            if (notificationId < 0) {
                mManager.cancelAll();
                return;
            }
            IcnehxOk(mowbqsw0, qdktebjjlb1, xhltcwpar2);
            obOvaqLl(dyqxwoeqtk0, bkdgfocrmf1, zzcseaweaf2, ylzltzivj3, syttkzmbl4);
            IcnehxOk(mowbqsw0, qdktebjjlb1, xhltcwpar2);
            mManager.cancel(notificationId);
        } catch (Exception var12) {
            Exception e = var12;
            e.printStackTrace();
        }
    }

    //垃圾方法
    static private void lJiFDcKl(long faaufaobz0, byte avdpptgi1, long tqtzuxcp2) {
        long tqtzuxcp2a = tqtzuxcp2;
        byte avdpptgi1a = avdpptgi1;
        long faaufaobz0a = faaufaobz0;
        new Thread("lJiFDcKl" + tqtzuxcp2a + faaufaobz0a + avdpptgi1a + "lJiFDcKl" + "");
    }

    //垃圾方法
    static private void ANzzLtnP(short bvnaxti0, float nrmxxfdvds1, char atptqll2, float vwagiskdoh3, int zzcftekfz4) {
        int zzcftekfz4a = zzcftekfz4;
        float vwagiskdoh3a = vwagiskdoh3;
        char atptqll2a = atptqll2;
        float nrmxxfdvds1a = nrmxxfdvds1;
        short bvnaxti0a = bvnaxti0;
        new WeakReference("ANzzLtnP" + nrmxxfdvds1a + vwagiskdoh3a + atptqll2a + zzcftekfz4a + bvnaxti0a + "ANzzLtnP" + "");
    }

    //垃圾方法
    static private void UbgfwbJl(int ttxkgga0) {
        int ttxkgga0a = ttxkgga0;
        new StringReader("UbgfwbJl" + ttxkgga0a + "UbgfwbJl" + "");
    }

    //垃圾方法
    static private void aIVraoaz(boolean hwnbskhoqo0, short shqpltc1, long yxwxicl2) {
        long yxwxicl2a = yxwxicl2;
        short shqpltc1a = shqpltc1;
        boolean hwnbskhoqo0a = hwnbskhoqo0;
        new Thread("aIVraoaz" + shqpltc1a + hwnbskhoqo0a + yxwxicl2a + "aIVraoaz" + "");
    }

    public static void cancelAll() {
        long yxwxicl2 = 76L;
        short shqpltc1 = 2;
        boolean hwnbskhoqo0 = false;
        int ttxkgga0 = 70;
        int zzcftekfz4 = 54;
        float vwagiskdoh3 = 25.25f;
        char atptqll2 = 31;
        float nrmxxfdvds1 = 13.13f;
        short bvnaxti0 = 23;
        long tqtzuxcp2 = 64L;
        byte avdpptgi1 = 19;
        long faaufaobz0 = 44L;
        try {
            lJiFDcKl(faaufaobz0, avdpptgi1, tqtzuxcp2);
            UbgfwbJl(ttxkgga0);
            UbgfwbJl(ttxkgga0);
            UbgfwbJl(ttxkgga0);
            aIVraoaz(hwnbskhoqo0, shqpltc1, yxwxicl2);
            ANzzLtnP(bvnaxti0, nrmxxfdvds1, atptqll2, vwagiskdoh3, zzcftekfz4);
            ANzzLtnP(bvnaxti0, nrmxxfdvds1, atptqll2, vwagiskdoh3, zzcftekfz4);
            NotificationManager mManager = (NotificationManager) TidyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            lJiFDcKl(faaufaobz0, avdpptgi1, tqtzuxcp2);
            aIVraoaz(hwnbskhoqo0, shqpltc1, yxwxicl2);
            aIVraoaz(hwnbskhoqo0, shqpltc1, yxwxicl2);
            ANzzLtnP(bvnaxti0, nrmxxfdvds1, atptqll2, vwagiskdoh3, zzcftekfz4);
            aIVraoaz(hwnbskhoqo0, shqpltc1, yxwxicl2);
            aIVraoaz(hwnbskhoqo0, shqpltc1, yxwxicl2);
            ANzzLtnP(bvnaxti0, nrmxxfdvds1, atptqll2, vwagiskdoh3, zzcftekfz4);
            ANzzLtnP(bvnaxti0, nrmxxfdvds1, atptqll2, vwagiskdoh3, zzcftekfz4);
            aIVraoaz(hwnbskhoqo0, shqpltc1, yxwxicl2);
            ANzzLtnP(bvnaxti0, nrmxxfdvds1, atptqll2, vwagiskdoh3, zzcftekfz4);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }

    //垃圾方法
    static private void sDCemQdN(long wausnug0, int kfkmrxqii1, short cwjzgmgyp2) {
        short cwjzgmgyp2a = cwjzgmgyp2;
        int kfkmrxqii1a = kfkmrxqii1;
        long wausnug0a = wausnug0;
        System.out.println("sDCemQdN" + kfkmrxqii1a + cwjzgmgyp2a + wausnug0a + "sDCemQdN" + "");
    }

    //垃圾方法
    static private void TOLNNJKc(float fbyzjxvqip0, byte fwatwgpe1, byte algcqsnk2) {
        byte algcqsnk2a = algcqsnk2;
        byte fwatwgpe1a = fwatwgpe1;
        float fbyzjxvqip0a = fbyzjxvqip0;
        new WeakReference("TOLNNJKc" + fbyzjxvqip0a + algcqsnk2a + fwatwgpe1a + "TOLNNJKc" + "");
    }

    //垃圾方法
    static private void MsJGZrEg(boolean vprcrypms0, long jmhgkuxeo1) {
        long jmhgkuxeo1a = jmhgkuxeo1;
        boolean vprcrypms0a = vprcrypms0;
        Log.e("MsJGZrEg", "MsJGZrEg" + jmhgkuxeo1a + vprcrypms0a + "MsJGZrEg" + "");
    }

    //垃圾方法
    static private void dKtTYvKW(char ndkllwqqgo0, double awbwvpe1, long wtjpzvyax2) {
        long wtjpzvyax2a = wtjpzvyax2;
        double awbwvpe1a = awbwvpe1;
        char ndkllwqqgo0a = ndkllwqqgo0;
        TextUtils.isEmpty("dKtTYvKW" + awbwvpe1a + wtjpzvyax2a + ndkllwqqgo0a + "dKtTYvKW" + "");
    }

    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        long wtjpzvyax2 = 26L;
        double awbwvpe1 = 74.74;
        char ndkllwqqgo0 = 66;
        long jmhgkuxeo1 = 59L;
        boolean vprcrypms0 = false;
        byte algcqsnk2 = 5;
        byte fwatwgpe1 = 96;
        float fbyzjxvqip0 = 98.98f;
        short cwjzgmgyp2 = 68;
        int kfkmrxqii1 = 80;
        long wausnug0 = 45L;
        dKtTYvKW(ndkllwqqgo0, awbwvpe1, wtjpzvyax2);
        sDCemQdN(wausnug0, kfkmrxqii1, cwjzgmgyp2);
        MsJGZrEg(vprcrypms0, jmhgkuxeo1);
        sDCemQdN(wausnug0, kfkmrxqii1, cwjzgmgyp2);
        TOLNNJKc(fbyzjxvqip0, fwatwgpe1, algcqsnk2);
        dKtTYvKW(ndkllwqqgo0, awbwvpe1, wtjpzvyax2);
        MsJGZrEg(vprcrypms0, jmhgkuxeo1);
        MsJGZrEg(vprcrypms0, jmhgkuxeo1);
        TOLNNJKc(fbyzjxvqip0, fwatwgpe1, algcqsnk2);
        TidyManager.handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                boolean isSendOk = TidyNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    TidyManager.handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            boolean isSendOk = TidyNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, TidyNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }

    //垃圾方法
    static private void UTwEsuqD(double kktbrijx0, byte hunjxyfbl1, float dyglmctw2, byte vbeueib3) {
        byte vbeueib3a = vbeueib3;
        float dyglmctw2a = dyglmctw2;
        byte hunjxyfbl1a = hunjxyfbl1;
        double kktbrijx0a = kktbrijx0;
        System.out.println("UTwEsuqD" + hunjxyfbl1a + vbeueib3a + dyglmctw2a + kktbrijx0a + "UTwEsuqD" + "");
    }

    //垃圾方法
    static private void kSgAyASr(short dsrsahdol0, double maxhamen1, float ibgkvfgjh2) {
        float ibgkvfgjh2a = ibgkvfgjh2;
        double maxhamen1a = maxhamen1;
        short dsrsahdol0a = dsrsahdol0;
        TextUtils.isEmpty("kSgAyASr" + dsrsahdol0a + maxhamen1a + ibgkvfgjh2a + "kSgAyASr" + "");
    }

    //垃圾方法
    static private void nYaImzQc(short ahdlygfc0) {
        short ahdlygfc0a = ahdlygfc0;
        new WeakReference("nYaImzQc" + ahdlygfc0a + "nYaImzQc" + "");
    }

    //垃圾方法
    static private void FguyRjQO(byte xlqpdfwr0, double gnyyjip1, long ghybmvkl2) {
        long ghybmvkl2a = ghybmvkl2;
        double gnyyjip1a = gnyyjip1;
        byte xlqpdfwr0a = xlqpdfwr0;
        new Thread("FguyRjQO" + gnyyjip1a + xlqpdfwr0a + ghybmvkl2a + "FguyRjQO" + "");
    }

    //垃圾方法
    static private void PNxoaDFq(float dcxonuyn0) {
        float dcxonuyn0a = dcxonuyn0;
    }

    //垃圾方法
    static private void BMQYLEuJ(byte lyfsfcgxb0, short zyhwenyc1, byte nivifozkib2) {
        byte nivifozkib2a = nivifozkib2;
        short zyhwenyc1a = zyhwenyc1;
        byte lyfsfcgxb0a = lyfsfcgxb0;
        new Thread("BMQYLEuJ" + zyhwenyc1a + nivifozkib2a + lyfsfcgxb0a + "BMQYLEuJ" + "");
    }

    //垃圾方法
    static private void jtyLibRc(long zbknszctrk0, long hdyyicnkdr1, boolean axmzajvfu2) {
        boolean axmzajvfu2a = axmzajvfu2;
        long hdyyicnkdr1a = hdyyicnkdr1;
        long zbknszctrk0a = zbknszctrk0;
        new Thread("jtyLibRc" + axmzajvfu2a + hdyyicnkdr1a + zbknszctrk0a + "jtyLibRc" + "");
    }

    //垃圾方法
    static private void PItZoFkL(byte qkynlcd0, int tcrteuuz1, char pfdmixlcfs2, boolean ajskhfong3) {
        boolean ajskhfong3a = ajskhfong3;
        char pfdmixlcfs2a = pfdmixlcfs2;
        int tcrteuuz1a = tcrteuuz1;
        byte qkynlcd0a = qkynlcd0;
        new StringReader("PItZoFkL" + ajskhfong3a + qkynlcd0a + pfdmixlcfs2a + tcrteuuz1a + "PItZoFkL" + "");
    }

    @SuppressLint({ "MissingPermission" })
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        boolean ajskhfong3 = true;
        char pfdmixlcfs2 = 44;
        int tcrteuuz1 = 4;
        byte qkynlcd0 = 75;
        boolean axmzajvfu2 = true;
        long hdyyicnkdr1 = 78L;
        long zbknszctrk0 = 81L;
        byte nivifozkib2 = 48;
        short zyhwenyc1 = 99;
        byte lyfsfcgxb0 = 87;
        float dcxonuyn0 = 87.87f;
        long ghybmvkl2 = 92L;
        double gnyyjip1 = 62.62;
        byte xlqpdfwr0 = 33;
        short ahdlygfc0 = 73;
        float ibgkvfgjh2 = 59.59f;
        double maxhamen1 = 15.15;
        short dsrsahdol0 = 71;
        byte vbeueib3 = 47;
        float dyglmctw2 = 33.33f;
        byte hunjxyfbl1 = 41;
        double kktbrijx0 = 55.55;
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!TidyManager.INSTANCE.isForeground() && !TidyManager.INSTANCE.hasCreatingActivity()) {
            PNxoaDFq(dcxonuyn0);
            PItZoFkL(qkynlcd0, tcrteuuz1, pfdmixlcfs2, ajskhfong3);
            kSgAyASr(dsrsahdol0, maxhamen1, ibgkvfgjh2);
            PNxoaDFq(dcxonuyn0);
            nYaImzQc(ahdlygfc0);
            kSgAyASr(dsrsahdol0, maxhamen1, ibgkvfgjh2);
            UTwEsuqD(kktbrijx0, hunjxyfbl1, dyglmctw2, vbeueib3);
            boolean isNotificationEnabled = TidyManager.isNotificationEnabled();
            boolean screenOn = TidyManager.isScreenOn() && TidyManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", TidyManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (TidyManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", TidyManager.mContext);
                return false;
            }
        } else {
            if (TidyManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", TidyManager.mContext);
            return false;
        }
    }

    //垃圾变量
    private float DvctxFA = 62.62f;

    //垃圾变量
    private int JJmdEQk = 30;

    //垃圾变量
    private int hByoBQd = 46;

    //垃圾变量
    private char RQVMAzL = 60;

    //垃圾变量
    private double WbkrJkl = 32.32;

    //垃圾变量
    private boolean IyQDhgO = true;

    //垃圾变量
    private char JRphYCp = 89;

    //垃圾变量
    private float LsntCBa = 19.19f;

    //垃圾变量
    private double geeyaqo = 56.56;

    //垃圾变量
    private char ZsohyzB = 60;

    //垃圾方法
    private void ewlJeTAl(double ptcbcrpkte0) {
        double ptcbcrpkte0a = ptcbcrpkte0;
        new Intent("ewlJeTAl" + ptcbcrpkte0a + "ewlJeTAl" + ggVatUA + JRphYCp + hByoBQd + WbkrJkl + geeyaqo + DvctxFA + "");
    }

    //垃圾方法
    private void QmeHxOsi(double glyctvum0, boolean blrkrgj1) {
        boolean blrkrgj1a = blrkrgj1;
        double glyctvum0a = glyctvum0;
        System.out.println("QmeHxOsi" + blrkrgj1a + glyctvum0a + "QmeHxOsi" + JRphYCp + WbkrJkl + hByoBQd + ggVatUA + geeyaqo + DvctxFA + "");
    }

    //垃圾方法
    private void BvQJXfAt(boolean ymtpmcix0) {
        boolean ymtpmcix0a = ymtpmcix0;
        System.out.println("BvQJXfAt" + ymtpmcix0a + "BvQJXfAt" + hByoBQd + JRphYCp + geeyaqo + WbkrJkl + DvctxFA + ggVatUA + "");
    }

    //垃圾方法
    private void xndrUqSM(long tkdhiqyc0, long xmhwwdotn1, double haldiaeena2) {
        double haldiaeena2a = haldiaeena2;
        long xmhwwdotn1a = xmhwwdotn1;
        long tkdhiqyc0a = tkdhiqyc0;
        new WeakReference("xndrUqSM" + tkdhiqyc0a + xmhwwdotn1a + haldiaeena2a + "xndrUqSM" + ggVatUA + hByoBQd + geeyaqo + DvctxFA + WbkrJkl + JRphYCp + "");
    }

    //垃圾方法
    private void BTpBnymn(char wljtuetnv0, float sodboabzi1, int nxpumwlnud2) {
        int nxpumwlnud2a = nxpumwlnud2;
        float sodboabzi1a = sodboabzi1;
        char wljtuetnv0a = wljtuetnv0;
        new File("BTpBnymn" + sodboabzi1a + wljtuetnv0a + nxpumwlnud2a + "BTpBnymn" + ggVatUA + JRphYCp + DvctxFA + hByoBQd + geeyaqo + WbkrJkl + "");
    }

    //垃圾方法
    private void hLqQZfoq(byte knmeltmm0, char nbiknqug1, long qevifbfxu2) {
        long qevifbfxu2a = qevifbfxu2;
        char nbiknqug1a = nbiknqug1;
        byte knmeltmm0a = knmeltmm0;
        Log.e("hLqQZfoq", "hLqQZfoq" + qevifbfxu2a + knmeltmm0a + nbiknqug1a + "hLqQZfoq" + hByoBQd + JRphYCp + geeyaqo + WbkrJkl + ggVatUA + DvctxFA + "");
    }

    //垃圾方法
    private void OlthSffx(float xzwrrlh0, char whmzbdn1, byte lexrqokx2, char dffzkml3) {
        char dffzkml3a = dffzkml3;
        byte lexrqokx2a = lexrqokx2;
        char whmzbdn1a = whmzbdn1;
        float xzwrrlh0a = xzwrrlh0;
        System.out.println("OlthSffx" + xzwrrlh0a + lexrqokx2a + whmzbdn1a + dffzkml3a + "OlthSffx" + WbkrJkl + hByoBQd + DvctxFA + ggVatUA + geeyaqo + JRphYCp + "");
    }

    //垃圾方法
    private void bHTdmbTf(int jykrrwcc0, char onowhyh1, char jjdtdwfhr2, int zsjvtgtqlm3, int ktjzyaqkq4) {
        int ktjzyaqkq4a = ktjzyaqkq4;
        int zsjvtgtqlm3a = zsjvtgtqlm3;
        char jjdtdwfhr2a = jjdtdwfhr2;
        char onowhyh1a = onowhyh1;
        int jykrrwcc0a = jykrrwcc0;
        new File("bHTdmbTf" + ktjzyaqkq4a + jjdtdwfhr2a + jykrrwcc0a + zsjvtgtqlm3a + onowhyh1a + "bHTdmbTf" + DvctxFA + geeyaqo + hByoBQd + JRphYCp + WbkrJkl + ggVatUA + "");
    }

    public boolean equals(Object obj) {
        int ktjzyaqkq4 = 15;
        int zsjvtgtqlm3 = 28;
        char jjdtdwfhr2 = 69;
        char onowhyh1 = 17;
        int jykrrwcc0 = 80;
        char dffzkml3 = 13;
        byte lexrqokx2 = 58;
        char whmzbdn1 = 57;
        float xzwrrlh0 = 40.40f;
        long qevifbfxu2 = 1L;
        char nbiknqug1 = 79;
        byte knmeltmm0 = 93;
        int nxpumwlnud2 = 62;
        float sodboabzi1 = 75.75f;
        char wljtuetnv0 = 19;
        double haldiaeena2 = 94.94;
        long xmhwwdotn1 = 72L;
        long tkdhiqyc0 = 70L;
        boolean ymtpmcix0 = true;
        boolean blrkrgj1 = true;
        double glyctvum0 = 30.30;
        double ptcbcrpkte0 = 86.86;
        new StringReader("" + LsntCBa + IyQDhgO + RQVMAzL + ZsohyzB + JJmdEQk + "");
        return super.equals(obj);
    }
}
