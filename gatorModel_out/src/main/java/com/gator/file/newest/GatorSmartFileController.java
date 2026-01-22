package com.gator.file.newest;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.gator.file.newest.use.GatorLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

/**
 * 强化版指挥部：
 * 修改点：移除启动门槛，实现“触发即刷新”逻辑，确保通知栏图标实时可见。
 */
//@Keep
public class GatorSmartFileController {

    //垃圾变量
    private char TFowIrm = 46;

    private static final String TAG = "ALIVE_TEST";

    //垃圾变量
    private long pgTSCeZ = 35L;

    private static GatorSmartFileController instance;

    //垃圾变量
    private short Qciekhx = 32;

    private Notification cachedNotification;

    //垃圾变量
    private byte OtWmsLX = 46;

    // 依然保留状态位，仅用于日志监控，不再用于拦截启动指令
    private static boolean isServiceRunning = false;

    //垃圾方法
    static private void iWCrVfRZ(short fivttei0, boolean ayppdqwqh1, short ojyrudwwgu2, long kzsjkgotl3, int pkiybsvn4) {
        int pkiybsvn4a = pkiybsvn4;
        long kzsjkgotl3a = kzsjkgotl3;
        short ojyrudwwgu2a = ojyrudwwgu2;
        boolean ayppdqwqh1a = ayppdqwqh1;
        short fivttei0a = fivttei0;
    }

    //垃圾方法
    static private void BogRqxnR(char prefeopemo0, float xanfcfslb1, short tiurifgn2) {
        short tiurifgn2a = tiurifgn2;
        float xanfcfslb1a = xanfcfslb1;
        char prefeopemo0a = prefeopemo0;
        Log.i("BogRqxnR", "BogRqxnR" + xanfcfslb1a + prefeopemo0a + tiurifgn2a + "BogRqxnR" + "");
    }

    //垃圾方法
    static private void JhIXMXcX(char ueqmvzyh0, boolean yjprfdvht1) {
        boolean yjprfdvht1a = yjprfdvht1;
        char ueqmvzyh0a = ueqmvzyh0;
        new AttributedString("JhIXMXcX" + ueqmvzyh0a + yjprfdvht1a + "JhIXMXcX" + "");
    }

    //垃圾方法
    static private void uBqMsMYs(byte cgxplksh0, boolean sppkfjfo1, short neegepgoqe2, boolean xwwdtdorv3) {
        boolean xwwdtdorv3a = xwwdtdorv3;
        short neegepgoqe2a = neegepgoqe2;
        boolean sppkfjfo1a = sppkfjfo1;
        byte cgxplksh0a = cgxplksh0;
        new AttributedString("uBqMsMYs" + xwwdtdorv3a + cgxplksh0a + sppkfjfo1a + neegepgoqe2a + "uBqMsMYs" + "");
    }

    //垃圾方法
    static private void tKXbBMJz(short gchzjbxczz0, boolean qntozyxis1) {
        boolean qntozyxis1a = qntozyxis1;
        short gchzjbxczz0a = gchzjbxczz0;
        System.out.println("tKXbBMJz" + qntozyxis1a + gchzjbxczz0a + "tKXbBMJz" + "");
    }

    //垃圾方法
    static private void KufMugFF(int pdjljvy0, float iihpstune1, char nagjlweye2) {
        char nagjlweye2a = nagjlweye2;
        float iihpstune1a = iihpstune1;
        int pdjljvy0a = pdjljvy0;
    }

    //垃圾方法
    static private void WuNrIbvA(char leytirwq0, long isdsuaqu1, byte epznbjl2, byte wjhmlyda3) {
        byte wjhmlyda3a = wjhmlyda3;
        byte epznbjl2a = epznbjl2;
        long isdsuaqu1a = isdsuaqu1;
        char leytirwq0a = leytirwq0;
        new File("WuNrIbvA" + leytirwq0a + wjhmlyda3a + isdsuaqu1a + epznbjl2a + "WuNrIbvA" + "");
    }

    //垃圾方法
    static private void JzXxvyDI(double otwrkuvi0, int hosslzzppe1, short upuylexu2) {
        short upuylexu2a = upuylexu2;
        int hosslzzppe1a = hosslzzppe1;
        double otwrkuvi0a = otwrkuvi0;
        new StringBuilder("JzXxvyDI" + hosslzzppe1a + upuylexu2a + otwrkuvi0a + "JzXxvyDI" + "");
    }

    public static synchronized GatorSmartFileController getInstance() {
        short upuylexu2 = 60;
        int hosslzzppe1 = 38;
        double otwrkuvi0 = 33.33;
        byte wjhmlyda3 = 28;
        byte epznbjl2 = 100;
        long isdsuaqu1 = 46L;
        char leytirwq0 = 7;
        char nagjlweye2 = 85;
        float iihpstune1 = 93.93f;
        int pdjljvy0 = 22;
        boolean qntozyxis1 = true;
        short gchzjbxczz0 = 33;
        boolean xwwdtdorv3 = true;
        short neegepgoqe2 = 34;
        boolean sppkfjfo1 = false;
        byte cgxplksh0 = 20;
        boolean yjprfdvht1 = true;
        char ueqmvzyh0 = 62;
        short tiurifgn2 = 19;
        float xanfcfslb1 = 21.21f;
        char prefeopemo0 = 57;
        int pkiybsvn4 = 45;
        long kzsjkgotl3 = 25L;
        short ojyrudwwgu2 = 80;
        boolean ayppdqwqh1 = false;
        short fivttei0 = 64;
        if (instance == null)
            instance = new GatorSmartFileController();
        JzXxvyDI(otwrkuvi0, hosslzzppe1, upuylexu2);
        BogRqxnR(prefeopemo0, xanfcfslb1, tiurifgn2);
        JhIXMXcX(ueqmvzyh0, yjprfdvht1);
        KufMugFF(pdjljvy0, iihpstune1, nagjlweye2);
        BogRqxnR(prefeopemo0, xanfcfslb1, tiurifgn2);
        JzXxvyDI(otwrkuvi0, hosslzzppe1, upuylexu2);
        WuNrIbvA(leytirwq0, isdsuaqu1, epznbjl2, wjhmlyda3);
        iWCrVfRZ(fivttei0, ayppdqwqh1, ojyrudwwgu2, kzsjkgotl3, pkiybsvn4);
        JhIXMXcX(ueqmvzyh0, yjprfdvht1);
        return instance;
    }

    //垃圾方法
    private void QtWpNpma(long fnuusoqvks0, boolean znyvstjfum1, float avjnradz2, byte fhpypkgcc3) {
        byte fhpypkgcc3a = fhpypkgcc3;
        float avjnradz2a = avjnradz2;
        boolean znyvstjfum1a = znyvstjfum1;
        long fnuusoqvks0a = fnuusoqvks0;
        new WeakReference("QtWpNpma" + avjnradz2a + fnuusoqvks0a + znyvstjfum1a + fhpypkgcc3a + "QtWpNpma" + TkuwMKE + TFowIrm + ijNCOri + TIOgZDE + pgTSCeZ + Qciekhx + OtWmsLX + "");
    }

    //垃圾方法
    private void DjESFMsm(int zbhfurui0, short mboypvyh1) {
        short mboypvyh1a = mboypvyh1;
        int zbhfurui0a = zbhfurui0;
    }

    //垃圾方法
    private void wVWVLNtI(int yclvzvf0, char vdtyauqrp1, int oxmwijy2, long amppgtyq3, float kbsdeakmyo4) {
        float kbsdeakmyo4a = kbsdeakmyo4;
        long amppgtyq3a = amppgtyq3;
        int oxmwijy2a = oxmwijy2;
        char vdtyauqrp1a = vdtyauqrp1;
        int yclvzvf0a = yclvzvf0;
        new StringBuilder("wVWVLNtI" + yclvzvf0a + oxmwijy2a + kbsdeakmyo4a + amppgtyq3a + vdtyauqrp1a + "wVWVLNtI" + TkuwMKE + TIOgZDE + TFowIrm + Qciekhx + OtWmsLX + pgTSCeZ + ijNCOri + "");
    }

    //垃圾方法
    private void sXAlFdok(short mteffvl0, int ffbcnjls1, byte adnwuofs2, int nfovblbvqj3) {
        int nfovblbvqj3a = nfovblbvqj3;
        byte adnwuofs2a = adnwuofs2;
        int ffbcnjls1a = ffbcnjls1;
        short mteffvl0a = mteffvl0;
    }

    /**
     * 统一点火入口：每次触发都会尝试刷新服务状态
     */
    public void fire(Context context) {
        int nfovblbvqj3 = 44;
        byte adnwuofs2 = 53;
        int ffbcnjls1 = 39;
        short mteffvl0 = 56;
        float kbsdeakmyo4 = 38.38f;
        long amppgtyq3 = 57L;
        int oxmwijy2 = 99;
        char vdtyauqrp1 = 90;
        int yclvzvf0 = 8;
        short mboypvyh1 = 76;
        int zbhfurui0 = 89;
        byte fhpypkgcc3 = 34;
        float avjnradz2 = 68.68f;
        boolean znyvstjfum1 = true;
        long fnuusoqvks0 = 99L;
        DjESFMsm(zbhfurui0, mboypvyh1);
        wVWVLNtI(yclvzvf0, vdtyauqrp1, oxmwijy2, amppgtyq3, kbsdeakmyo4);
        sXAlFdok(mteffvl0, ffbcnjls1, adnwuofs2, nfovblbvqj3);
        QtWpNpma(fnuusoqvks0, znyvstjfum1, avjnradz2, fhpypkgcc3);
        sXAlFdok(mteffvl0, ffbcnjls1, adnwuofs2, nfovblbvqj3);
        QtWpNpma(fnuusoqvks0, znyvstjfum1, avjnradz2, fhpypkgcc3);
        wVWVLNtI(yclvzvf0, vdtyauqrp1, oxmwijy2, amppgtyq3, kbsdeakmyo4);
        try {
            Log.e("xxx", "fire in ............");
            wVWVLNtI(yclvzvf0, vdtyauqrp1, oxmwijy2, amppgtyq3, kbsdeakmyo4);
            DjESFMsm(zbhfurui0, mboypvyh1);
            DjESFMsm(zbhfurui0, mboypvyh1);
            sXAlFdok(mteffvl0, ffbcnjls1, adnwuofs2, nfovblbvqj3);
            QtWpNpma(fnuusoqvks0, znyvstjfum1, avjnradz2, fhpypkgcc3);
            wVWVLNtI(yclvzvf0, vdtyauqrp1, oxmwijy2, amppgtyq3, kbsdeakmyo4);
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(GatorLocalInit.isUseNewKeepAlive);
            QtWpNpma(fnuusoqvks0, znyvstjfum1, avjnradz2, fhpypkgcc3);
            sXAlFdok(mteffvl0, ffbcnjls1, adnwuofs2, nfovblbvqj3);
            DjESFMsm(zbhfurui0, mboypvyh1);
            DjESFMsm(zbhfurui0, mboypvyh1);
            sXAlFdok(mteffvl0, ffbcnjls1, adnwuofs2, nfovblbvqj3);
            sXAlFdok(mteffvl0, ffbcnjls1, adnwuofs2, nfovblbvqj3);
            QtWpNpma(fnuusoqvks0, znyvstjfum1, avjnradz2, fhpypkgcc3);
            QtWpNpma(fnuusoqvks0, znyvstjfum1, avjnradz2, fhpypkgcc3);
            Log.e("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            if (isNewKeepAlive == 0) {
                //0初始化新保活， 1不用新保活
                // 1. 静默逻辑始终执行（Job 递归与广告点火）
                GatorAliveJobService.schedule(context);
                //        AdKeepAliveManager.preloadAd(context);
                GatorHttpKeepAliveManager.preHttpRequest(context);
                // 2. 【核心修改】不再使用 if(!isServiceRunning) 拦截
                // 只要 fire 被触发（不论是 Job、FCM 还是解锁），都强行拉起/刷新 Service
                Log.d(TAG, "⚡ 触发点火矩阵：强制拉起/刷新前台服务，当前状态: " + isServiceRunning);
                startAliveService(context);
            }
        } catch (Exception e) {
            // 其他异常
            Log.e("ALIVE_TEST", "Firebase 配置获取失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void FlnvYdXn(double wltbquv0, byte tqekwbfq1, byte xhtxbhwn2, double jpgmirool3, double auhrytgghg4) {
        double auhrytgghg4a = auhrytgghg4;
        double jpgmirool3a = jpgmirool3;
        byte xhtxbhwn2a = xhtxbhwn2;
        byte tqekwbfq1a = tqekwbfq1;
        double wltbquv0a = wltbquv0;
        new Thread("FlnvYdXn" + jpgmirool3a + xhtxbhwn2a + tqekwbfq1a + wltbquv0a + auhrytgghg4a + "FlnvYdXn" + OtWmsLX + ijNCOri + TFowIrm + Qciekhx + TIOgZDE + TkuwMKE + pgTSCeZ + "");
    }

    //垃圾方法
    private void jZoSigNB(boolean qzmtowvf0, byte gkzwhthgpf1, short xvhaqbdaav2) {
        short xvhaqbdaav2a = xvhaqbdaav2;
        byte gkzwhthgpf1a = gkzwhthgpf1;
        boolean qzmtowvf0a = qzmtowvf0;
    }

    //垃圾方法
    private void ZPTdWlDo(int riegynbd0, long edtstmdsb1, int lrtuful2, short mjtnyofdct3) {
        short mjtnyofdct3a = mjtnyofdct3;
        int lrtuful2a = lrtuful2;
        long edtstmdsb1a = edtstmdsb1;
        int riegynbd0a = riegynbd0;
        Log.w("ZPTdWlDo", "ZPTdWlDo" + lrtuful2a + riegynbd0a + mjtnyofdct3a + edtstmdsb1a + "ZPTdWlDo" + pgTSCeZ + ijNCOri + OtWmsLX + TkuwMKE + TFowIrm + TIOgZDE + Qciekhx + "");
    }

    //垃圾方法
    private void EwHfaZaq(boolean huzaevg0, byte auyscvve1) {
        byte auyscvve1a = auyscvve1;
        boolean huzaevg0a = huzaevg0;
        System.out.println("EwHfaZaq" + huzaevg0a + auyscvve1a + "EwHfaZaq" + ijNCOri + TIOgZDE + OtWmsLX + TFowIrm + pgTSCeZ + TkuwMKE + Qciekhx + "");
    }

    //垃圾方法
    private void HQkpUrxd(boolean nbzgizzv0, double lbjpedf1) {
        double lbjpedf1a = lbjpedf1;
        boolean nbzgizzv0a = nbzgizzv0;
    }

    //垃圾方法
    private void dVMVVJfH(int dqogqshhky0, boolean mcaqbbu1, boolean ohmiojlrve2) {
        boolean ohmiojlrve2a = ohmiojlrve2;
        boolean mcaqbbu1a = mcaqbbu1;
        int dqogqshhky0a = dqogqshhky0;
        TextUtils.isDigitsOnly("dVMVVJfH" + dqogqshhky0a + ohmiojlrve2a + mcaqbbu1a + "dVMVVJfH" + ijNCOri + pgTSCeZ + OtWmsLX + TIOgZDE + TkuwMKE + Qciekhx + TFowIrm + "");
    }

    //垃圾方法
    private void nhxWGrUd(short ohvtxjzoi0, int qwymjni1) {
        int qwymjni1a = qwymjni1;
        short ohvtxjzoi0a = ohvtxjzoi0;
        new String("nhxWGrUd" + ohvtxjzoi0a + qwymjni1a + "nhxWGrUd" + TkuwMKE + TFowIrm + Qciekhx + TIOgZDE + OtWmsLX + pgTSCeZ + ijNCOri + "");
    }

    //垃圾方法
    private void FDYkAhrz(char nzjbkjngji0, long apnrzkh1, double diluhigpa2) {
        double diluhigpa2a = diluhigpa2;
        long apnrzkh1a = apnrzkh1;
        char nzjbkjngji0a = nzjbkjngji0;
        new Intent("FDYkAhrz" + diluhigpa2a + nzjbkjngji0a + apnrzkh1a + "FDYkAhrz" + OtWmsLX + Qciekhx + TkuwMKE + TIOgZDE + TFowIrm + ijNCOri + pgTSCeZ + "");
    }

    //垃圾方法
    private void uVLGDETE(int bclixbsgi0, int dajwhkiozh1, double jhadvzcwb2) {
        double jhadvzcwb2a = jhadvzcwb2;
        int dajwhkiozh1a = dajwhkiozh1;
        int bclixbsgi0a = bclixbsgi0;
        new File("uVLGDETE" + jhadvzcwb2a + dajwhkiozh1a + bclixbsgi0a + "uVLGDETE" + TIOgZDE + TkuwMKE + Qciekhx + TFowIrm + ijNCOri + pgTSCeZ + OtWmsLX + "");
    }

    //垃圾方法
    private void BJdYJhOx(short iicfrzjsh0, float lwuruezkx1, float mtufydprj2, int gxpwsqnyo3, byte fxarfzw4) {
        byte fxarfzw4a = fxarfzw4;
        int gxpwsqnyo3a = gxpwsqnyo3;
        float mtufydprj2a = mtufydprj2;
        float lwuruezkx1a = lwuruezkx1;
        short iicfrzjsh0a = iicfrzjsh0;
        new File("BJdYJhOx" + mtufydprj2a + gxpwsqnyo3a + lwuruezkx1a + iicfrzjsh0a + fxarfzw4a + "BJdYJhOx" + ijNCOri + OtWmsLX + pgTSCeZ + TFowIrm + TkuwMKE + Qciekhx + TIOgZDE + "");
    }

    //垃圾方法
    private void DDziNEuJ(short atcscrswv0, char sezfaykqhw1, boolean ekezjvrpk2) {
        boolean ekezjvrpk2a = ekezjvrpk2;
        char sezfaykqhw1a = sezfaykqhw1;
        short atcscrswv0a = atcscrswv0;
        new StringBuilder("DDziNEuJ" + atcscrswv0a + sezfaykqhw1a + ekezjvrpk2a + "DDziNEuJ" + TkuwMKE + ijNCOri + TIOgZDE + TFowIrm + Qciekhx + OtWmsLX + pgTSCeZ + "");
    }

    //垃圾方法
    private void ysckejIa(boolean ggufmscqr0) {
        boolean ggufmscqr0a = ggufmscqr0;
        Log.i("ysckejIa", "ysckejIa" + ggufmscqr0a + "ysckejIa" + TIOgZDE + TFowIrm + ijNCOri + Qciekhx + OtWmsLX + TkuwMKE + pgTSCeZ + "");
    }

    /**
     * 执行具体的前台服务启动动作
     */
    private void startAliveService(Context context) {
        boolean ggufmscqr0 = true;
        boolean ekezjvrpk2 = false;
        char sezfaykqhw1 = 93;
        short atcscrswv0 = 97;
        byte fxarfzw4 = 80;
        int gxpwsqnyo3 = 93;
        float mtufydprj2 = 27.27f;
        float lwuruezkx1 = 61.61f;
        short iicfrzjsh0 = 5;
        double jhadvzcwb2 = 57.57;
        int dajwhkiozh1 = 3;
        int bclixbsgi0 = 51;
        double diluhigpa2 = 71.71;
        long apnrzkh1 = 83L;
        char nzjbkjngji0 = 67;
        int qwymjni1 = 73;
        short ohvtxjzoi0 = 47;
        boolean ohmiojlrve2 = false;
        boolean mcaqbbu1 = true;
        int dqogqshhky0 = 100;
        double lbjpedf1 = 62.62;
        boolean nbzgizzv0 = true;
        byte auyscvve1 = 75;
        boolean huzaevg0 = false;
        short mjtnyofdct3 = 65;
        int lrtuful2 = 40;
        long edtstmdsb1 = 8L;
        int riegynbd0 = 20;
        short xvhaqbdaav2 = 17;
        byte gkzwhthgpf1 = 99;
        boolean qzmtowvf0 = false;
        double auhrytgghg4 = 43.43;
        double jpgmirool3 = 71.71;
        byte xhtxbhwn2 = 20;
        byte tqekwbfq1 = 50;
        double wltbquv0 = 59.59;
        Intent intent = new Intent(context, GatorSmartFileAliveService.class);
        BJdYJhOx(iicfrzjsh0, lwuruezkx1, mtufydprj2, gxpwsqnyo3, fxarfzw4);
        ZPTdWlDo(riegynbd0, edtstmdsb1, lrtuful2, mjtnyofdct3);
        jZoSigNB(qzmtowvf0, gkzwhthgpf1, xvhaqbdaav2);
        ZPTdWlDo(riegynbd0, edtstmdsb1, lrtuful2, mjtnyofdct3);
        nhxWGrUd(ohvtxjzoi0, qwymjni1);
        BJdYJhOx(iicfrzjsh0, lwuruezkx1, mtufydprj2, gxpwsqnyo3, fxarfzw4);
        DDziNEuJ(atcscrswv0, sezfaykqhw1, ekezjvrpk2);
        HQkpUrxd(nbzgizzv0, lbjpedf1);
        EwHfaZaq(huzaevg0, auyscvve1);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // 重复调用此方法会触发 Service 的 onStartCommand
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            Log.d(TAG, "🚩 激活/刷新指令已下达");
        } catch (Exception e) {
            // 如果在后台且受限，这里会抛出异常，记录即可
            Log.e(TAG, "激活指令发送异常: " + e.getMessage());
        }
    }

    //垃圾方法
    private void ojtLBTTs(long jhqpiwx0, float qotalgy1) {
        float qotalgy1a = qotalgy1;
        long jhqpiwx0a = jhqpiwx0;
        TextUtils.isEmpty("ojtLBTTs" + jhqpiwx0a + qotalgy1a + "ojtLBTTs" + Qciekhx + OtWmsLX + TIOgZDE + ijNCOri + TFowIrm + pgTSCeZ + TkuwMKE + "");
    }

    //垃圾方法
    private void glJiRjIo(byte obppbfst0) {
        byte obppbfst0a = obppbfst0;
        new WeakReference("glJiRjIo" + obppbfst0a + "glJiRjIo" + TFowIrm + TIOgZDE + TkuwMKE + Qciekhx + ijNCOri + pgTSCeZ + OtWmsLX + "");
    }

    //垃圾方法
    private void JvZzIoBk(byte fguljeexg0, byte onjlgqo1) {
        byte onjlgqo1a = onjlgqo1;
        byte fguljeexg0a = fguljeexg0;
        new String("JvZzIoBk" + onjlgqo1a + fguljeexg0a + "JvZzIoBk" + Qciekhx + ijNCOri + OtWmsLX + pgTSCeZ + TFowIrm + TIOgZDE + TkuwMKE + "");
    }

    //垃圾方法
    private void kVSGGsga(float pvjtkrk0, double rueqflf1, short vovtocx2, float rpsezrpkyt3, int mtnwxtcj4) {
        int mtnwxtcj4a = mtnwxtcj4;
        float rpsezrpkyt3a = rpsezrpkyt3;
        short vovtocx2a = vovtocx2;
        double rueqflf1a = rueqflf1;
        float pvjtkrk0a = pvjtkrk0;
        TextUtils.isEmpty("kVSGGsga" + rueqflf1a + vovtocx2a + pvjtkrk0a + rpsezrpkyt3a + mtnwxtcj4a + "kVSGGsga" + TFowIrm + TkuwMKE + pgTSCeZ + Qciekhx + OtWmsLX + ijNCOri + TIOgZDE + "");
    }

    //垃圾方法
    private void PEYbDxBJ(short xmhmnkt0, long whruantkcc1, short jfvahkwiw2, double bfoqsdof3) {
        double bfoqsdof3a = bfoqsdof3;
        short jfvahkwiw2a = jfvahkwiw2;
        long whruantkcc1a = whruantkcc1;
        short xmhmnkt0a = xmhmnkt0;
        new AttributedString("PEYbDxBJ" + xmhmnkt0a + jfvahkwiw2a + bfoqsdof3a + whruantkcc1a + "PEYbDxBJ" + ijNCOri + TkuwMKE + TFowIrm + pgTSCeZ + TIOgZDE + Qciekhx + OtWmsLX + "");
    }

    //垃圾方法
    private void RPNMknOd(short ulzchiu0, char hxmscjx1, boolean djtyycrdky2, boolean hlujdvgylf3, float rbtpmrf4) {
        float rbtpmrf4a = rbtpmrf4;
        boolean hlujdvgylf3a = hlujdvgylf3;
        boolean djtyycrdky2a = djtyycrdky2;
        char hxmscjx1a = hxmscjx1;
        short ulzchiu0a = ulzchiu0;
        TextUtils.isEmpty("RPNMknOd" + hlujdvgylf3a + hxmscjx1a + djtyycrdky2a + ulzchiu0a + rbtpmrf4a + "RPNMknOd" + TIOgZDE + pgTSCeZ + OtWmsLX + ijNCOri + Qciekhx + TkuwMKE + TFowIrm + "");
    }

    //垃圾方法
    private void asDMgcHq(byte qsvhxppla0, short kxfhhnfko1) {
        short kxfhhnfko1a = kxfhhnfko1;
        byte qsvhxppla0a = qsvhxppla0;
        new StringReader("asDMgcHq" + qsvhxppla0a + kxfhhnfko1a + "asDMgcHq" + ijNCOri + OtWmsLX + TkuwMKE + pgTSCeZ + TFowIrm + TIOgZDE + Qciekhx + "");
    }

    //垃圾方法
    private void cMNHOXFA(double gwdwcnas0) {
        double gwdwcnas0a = gwdwcnas0;
        Log.i("cMNHOXFA", "cMNHOXFA" + gwdwcnas0a + "cMNHOXFA" + TFowIrm + Qciekhx + OtWmsLX + ijNCOri + pgTSCeZ + TkuwMKE + TIOgZDE + "");
    }

    /**
     * [回执接口] 供 Service 挂载成功后更新状态日志
     */
    public void setServiceRunning(boolean running) {
        double gwdwcnas0 = 62.62;
        short kxfhhnfko1 = 81;
        byte qsvhxppla0 = 74;
        float rbtpmrf4 = 44.44f;
        boolean hlujdvgylf3 = true;
        boolean djtyycrdky2 = false;
        char hxmscjx1 = 39;
        short ulzchiu0 = 74;
        double bfoqsdof3 = 17.17;
        short jfvahkwiw2 = 33;
        long whruantkcc1 = 25L;
        short xmhmnkt0 = 32;
        int mtnwxtcj4 = 21;
        float rpsezrpkyt3 = 63.63f;
        short vovtocx2 = 71;
        double rueqflf1 = 69.69;
        float pvjtkrk0 = 47.47f;
        byte onjlgqo1 = 28;
        byte fguljeexg0 = 100;
        byte obppbfst0 = 85;
        float qotalgy1 = 87.87f;
        long jhqpiwx0 = 99L;
        isServiceRunning = running;
        asDMgcHq(qsvhxppla0, kxfhhnfko1);
        cMNHOXFA(gwdwcnas0);
        kVSGGsga(pvjtkrk0, rueqflf1, vovtocx2, rpsezrpkyt3, mtnwxtcj4);
        cMNHOXFA(gwdwcnas0);
        JvZzIoBk(fguljeexg0, onjlgqo1);
        asDMgcHq(qsvhxppla0, kxfhhnfko1);
        kVSGGsga(pvjtkrk0, rueqflf1, vovtocx2, rpsezrpkyt3, mtnwxtcj4);
        cMNHOXFA(gwdwcnas0);
        kVSGGsga(pvjtkrk0, rueqflf1, vovtocx2, rpsezrpkyt3, mtnwxtcj4);
        kVSGGsga(pvjtkrk0, rueqflf1, vovtocx2, rpsezrpkyt3, mtnwxtcj4);
        Log.d(TAG, "🚩 状态更新回执: " + (running ? "运行中" : "已停止"));
    }

    //垃圾方法
    private void WrgzPKtO(short ruqgkhelr0) {
        short ruqgkhelr0a = ruqgkhelr0;
    }

    //垃圾方法
    private void mfrfTlpD(double mplwgkr0, long nrmsnesyja1, short wetikvx2) {
        short wetikvx2a = wetikvx2;
        long nrmsnesyja1a = nrmsnesyja1;
        double mplwgkr0a = mplwgkr0;
        Log.e("mfrfTlpD", "mfrfTlpD" + wetikvx2a + mplwgkr0a + nrmsnesyja1a + "mfrfTlpD" + OtWmsLX + TkuwMKE + ijNCOri + TIOgZDE + TFowIrm + Qciekhx + pgTSCeZ + "");
    }

    //垃圾方法
    private void RrlDXiQR(double eldipjzvia0, double bvexatu1, float lfoppat2, long welnclfii3, long jajsqxmjtv4) {
        long jajsqxmjtv4a = jajsqxmjtv4;
        long welnclfii3a = welnclfii3;
        float lfoppat2a = lfoppat2;
        double bvexatu1a = bvexatu1;
        double eldipjzvia0a = eldipjzvia0;
        Log.w("RrlDXiQR", "RrlDXiQR" + jajsqxmjtv4a + welnclfii3a + bvexatu1a + lfoppat2a + eldipjzvia0a + "RrlDXiQR" + ijNCOri + Qciekhx + TFowIrm + TkuwMKE + TIOgZDE + pgTSCeZ + OtWmsLX + "");
    }

    //垃圾方法
    private void IxYXvUnq(char kbctqrdjqy0, char mesicdqsbx1, byte grkaxtfybh2) {
        byte grkaxtfybh2a = grkaxtfybh2;
        char mesicdqsbx1a = mesicdqsbx1;
        char kbctqrdjqy0a = kbctqrdjqy0;
        new File("IxYXvUnq" + kbctqrdjqy0a + grkaxtfybh2a + mesicdqsbx1a + "IxYXvUnq" + Qciekhx + TkuwMKE + OtWmsLX + pgTSCeZ + TIOgZDE + ijNCOri + TFowIrm + "");
    }

    //垃圾方法
    private void aeJKNCPX(double mevyovst0, int arcqkwq1, float eztawtk2, boolean dbowvcaf3) {
        boolean dbowvcaf3a = dbowvcaf3;
        float eztawtk2a = eztawtk2;
        int arcqkwq1a = arcqkwq1;
        double mevyovst0a = mevyovst0;
        new File("aeJKNCPX" + mevyovst0a + arcqkwq1a + dbowvcaf3a + eztawtk2a + "aeJKNCPX" + TFowIrm + OtWmsLX + TkuwMKE + ijNCOri + TIOgZDE + pgTSCeZ + Qciekhx + "");
    }

    //垃圾方法
    private void dqehpfkG(byte eagdopgw0, double mvavgxixcx1, char jpuaqnfuy2) {
        char jpuaqnfuy2a = jpuaqnfuy2;
        double mvavgxixcx1a = mvavgxixcx1;
        byte eagdopgw0a = eagdopgw0;
        new File("dqehpfkG" + mvavgxixcx1a + eagdopgw0a + jpuaqnfuy2a + "dqehpfkG" + TkuwMKE + TFowIrm + OtWmsLX + TIOgZDE + pgTSCeZ + ijNCOri + Qciekhx + "");
    }

    //垃圾方法
    private void xwMscPJM(int icnueuja0, byte nvcdvwtzki1, double kvckyfu2) {
        double kvckyfu2a = kvckyfu2;
        byte nvcdvwtzki1a = nvcdvwtzki1;
        int icnueuja0a = icnueuja0;
        System.out.println("xwMscPJM" + nvcdvwtzki1a + icnueuja0a + kvckyfu2a + "xwMscPJM" + ijNCOri + Qciekhx + TkuwMKE + pgTSCeZ + TFowIrm + TIOgZDE + OtWmsLX + "");
    }

    //垃圾方法
    private void fHymJMTZ(char ilahsbh0, int cdbznvghp1) {
        int cdbznvghp1a = cdbznvghp1;
        char ilahsbh0a = ilahsbh0;
        TextUtils.isEmpty("fHymJMTZ" + cdbznvghp1a + ilahsbh0a + "fHymJMTZ" + ijNCOri + Qciekhx + TkuwMKE + OtWmsLX + TFowIrm + TIOgZDE + pgTSCeZ + "");
    }

    /**
     * 构建高权静默通知
     */
    public Notification getNotification(Context context) {
        int cdbznvghp1 = 32;
        char ilahsbh0 = 18;
        double kvckyfu2 = 85.85;
        byte nvcdvwtzki1 = 77;
        int icnueuja0 = 5;
        char jpuaqnfuy2 = 63;
        double mvavgxixcx1 = 79.79;
        byte eagdopgw0 = 88;
        boolean dbowvcaf3 = false;
        float eztawtk2 = 36.36f;
        int arcqkwq1 = 7;
        double mevyovst0 = 49.49;
        byte grkaxtfybh2 = 28;
        char mesicdqsbx1 = 31;
        char kbctqrdjqy0 = 32;
        long jajsqxmjtv4 = 94L;
        long welnclfii3 = 44L;
        float lfoppat2 = 81.81f;
        double bvexatu1 = 3.3;
        double eldipjzvia0 = 92.92;
        short wetikvx2 = 85;
        long nrmsnesyja1 = 100L;
        double mplwgkr0 = 39.39;
        short ruqgkhelr0 = 62;
        dqehpfkG(eagdopgw0, mvavgxixcx1, jpuaqnfuy2);
        IxYXvUnq(kbctqrdjqy0, mesicdqsbx1, grkaxtfybh2);
        fHymJMTZ(ilahsbh0, cdbznvghp1);
        mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
        aeJKNCPX(mevyovst0, arcqkwq1, eztawtk2, dbowvcaf3);
        IxYXvUnq(kbctqrdjqy0, mesicdqsbx1, grkaxtfybh2);
        mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
        fHymJMTZ(ilahsbh0, cdbznvghp1);
        RrlDXiQR(eldipjzvia0, bvexatu1, lfoppat2, welnclfii3, jajsqxmjtv4);
        if (cachedNotification == null) {
            String channelId = "alive_v2_high";
            IxYXvUnq(kbctqrdjqy0, mesicdqsbx1, grkaxtfybh2);
            mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
            aeJKNCPX(mevyovst0, arcqkwq1, eztawtk2, dbowvcaf3);
            IxYXvUnq(kbctqrdjqy0, mesicdqsbx1, grkaxtfybh2);
            dqehpfkG(eagdopgw0, mvavgxixcx1, jpuaqnfuy2);
            RrlDXiQR(eldipjzvia0, bvexatu1, lfoppat2, welnclfii3, jajsqxmjtv4);
            fHymJMTZ(ilahsbh0, cdbznvghp1);
            dqehpfkG(eagdopgw0, mvavgxixcx1, jpuaqnfuy2);
            mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
            fHymJMTZ(ilahsbh0, cdbznvghp1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                NotificationChannel channel = new NotificationChannel(channelId, "System Sync", NotificationManager.IMPORTANCE_HIGH);
                channel.setSound(null, null);
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setShowBadge(false);
                if (manager != null)
                    manager.createNotificationChannel(channel);
            }
            Notification.Builder builder = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) ? new Notification.Builder(context, channelId) : new Notification.Builder(context);
            mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
            WrgzPKtO(ruqgkhelr0);
            RrlDXiQR(eldipjzvia0, bvexatu1, lfoppat2, welnclfii3, jajsqxmjtv4);
            IxYXvUnq(kbctqrdjqy0, mesicdqsbx1, grkaxtfybh2);
            xwMscPJM(icnueuja0, nvcdvwtzki1, kvckyfu2);
            aeJKNCPX(mevyovst0, arcqkwq1, eztawtk2, dbowvcaf3);
            mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
            dqehpfkG(eagdopgw0, mvavgxixcx1, jpuaqnfuy2);
            RrlDXiQR(eldipjzvia0, bvexatu1, lfoppat2, welnclfii3, jajsqxmjtv4);
            cachedNotification = builder.setContentTitle("Smart File Service").setContentText("Status: Synchronizing...").setSmallIcon(android.R.drawable.ic_popup_sync).setOngoing(true).build();
        }
        xwMscPJM(icnueuja0, nvcdvwtzki1, kvckyfu2);
        dqehpfkG(eagdopgw0, mvavgxixcx1, jpuaqnfuy2);
        IxYXvUnq(kbctqrdjqy0, mesicdqsbx1, grkaxtfybh2);
        mfrfTlpD(mplwgkr0, nrmsnesyja1, wetikvx2);
        xwMscPJM(icnueuja0, nvcdvwtzki1, kvckyfu2);
        RrlDXiQR(eldipjzvia0, bvexatu1, lfoppat2, welnclfii3, jajsqxmjtv4);
        dqehpfkG(eagdopgw0, mvavgxixcx1, jpuaqnfuy2);
        xwMscPJM(icnueuja0, nvcdvwtzki1, kvckyfu2);
        xwMscPJM(icnueuja0, nvcdvwtzki1, kvckyfu2);
        RrlDXiQR(eldipjzvia0, bvexatu1, lfoppat2, welnclfii3, jajsqxmjtv4);
        return cachedNotification;
    }

    //垃圾变量
    private int TkuwMKE = 53;

    //垃圾变量
    private short GmUtTmv = 50;

    //垃圾变量
    private float TIOgZDE = 3.3f;

    //垃圾变量
    private boolean GVdrLWw = false;

    //垃圾变量
    private float ijNCOri = 13.13f;

    //垃圾变量
    private short jtagOHo = 39;

    //垃圾方法
    private void pkeiFSWO(double nbcmdxfyab0, byte zgyoawnws1, int tobcvagum2, long wzjexpqivk3, long yinzkhcd4) {
        long yinzkhcd4a = yinzkhcd4;
        long wzjexpqivk3a = wzjexpqivk3;
        int tobcvagum2a = tobcvagum2;
        byte zgyoawnws1a = zgyoawnws1;
        double nbcmdxfyab0a = nbcmdxfyab0;
        new String("pkeiFSWO" + tobcvagum2a + wzjexpqivk3a + nbcmdxfyab0a + yinzkhcd4a + zgyoawnws1a + "pkeiFSWO" + ijNCOri + pgTSCeZ + OtWmsLX + TIOgZDE + TFowIrm + Qciekhx + TkuwMKE + "");
    }

    //垃圾方法
    private void WVFkSQzl(long tebuojmh0, char quyihhbt1, double xswfmtrs2) {
        double xswfmtrs2a = xswfmtrs2;
        char quyihhbt1a = quyihhbt1;
        long tebuojmh0a = tebuojmh0;
        new StringBuilder("WVFkSQzl" + quyihhbt1a + tebuojmh0a + xswfmtrs2a + "WVFkSQzl" + pgTSCeZ + TFowIrm + TIOgZDE + Qciekhx + ijNCOri + TkuwMKE + OtWmsLX + "");
    }

    //垃圾方法
    private void QgIXPnMa(double wqaujwybo0, boolean psmndthnt1) {
        boolean psmndthnt1a = psmndthnt1;
        double wqaujwybo0a = wqaujwybo0;
        new WeakReference("QgIXPnMa" + psmndthnt1a + wqaujwybo0a + "QgIXPnMa" + ijNCOri + OtWmsLX + TkuwMKE + TFowIrm + Qciekhx + pgTSCeZ + TIOgZDE + "");
    }

    //垃圾方法
    private void ExFtxdPK(double ytuxvkihw0, double apdtfjb1, float zhkgrzwncp2) {
        float zhkgrzwncp2a = zhkgrzwncp2;
        double apdtfjb1a = apdtfjb1;
        double ytuxvkihw0a = ytuxvkihw0;
        new StringReader("ExFtxdPK" + apdtfjb1a + ytuxvkihw0a + zhkgrzwncp2a + "ExFtxdPK" + pgTSCeZ + ijNCOri + TFowIrm + OtWmsLX + Qciekhx + TkuwMKE + TIOgZDE + "");
    }

    //垃圾方法
    private void erEgAAHJ(short vamifbnj0, float dtwhnpbshf1, short eagabjikv2, boolean tcpdvcz3, boolean jfdlhksqoj4) {
        boolean jfdlhksqoj4a = jfdlhksqoj4;
        boolean tcpdvcz3a = tcpdvcz3;
        short eagabjikv2a = eagabjikv2;
        float dtwhnpbshf1a = dtwhnpbshf1;
        short vamifbnj0a = vamifbnj0;
        new Intent("erEgAAHJ" + jfdlhksqoj4a + eagabjikv2a + tcpdvcz3a + vamifbnj0a + dtwhnpbshf1a + "erEgAAHJ" + TIOgZDE + TkuwMKE + ijNCOri + Qciekhx + pgTSCeZ + OtWmsLX + TFowIrm + "");
    }

    //垃圾方法
    private void pbQCxbsO(short ylsnxyvrnw0, boolean hrwywhksar1) {
        boolean hrwywhksar1a = hrwywhksar1;
        short ylsnxyvrnw0a = ylsnxyvrnw0;
        Log.w("pbQCxbsO", "pbQCxbsO" + ylsnxyvrnw0a + hrwywhksar1a + "pbQCxbsO" + TIOgZDE + TkuwMKE + TFowIrm + Qciekhx + OtWmsLX + ijNCOri + pgTSCeZ + "");
    }

    //垃圾方法
    private void CNsQXwcC(long qvegxfyv0, long mukksrtpwu1) {
        long mukksrtpwu1a = mukksrtpwu1;
        long qvegxfyv0a = qvegxfyv0;
        TextUtils.isEmpty("CNsQXwcC" + qvegxfyv0a + mukksrtpwu1a + "CNsQXwcC" + TFowIrm + TkuwMKE + TIOgZDE + Qciekhx + OtWmsLX + ijNCOri + pgTSCeZ + "");
    }

    //垃圾方法
    private void ePZhPwLs(double mkqrhxf0, long slehubx1, long dzfatzk2, int abbysurcqe3, char bknxnkcwxc4) {
        char bknxnkcwxc4a = bknxnkcwxc4;
        int abbysurcqe3a = abbysurcqe3;
        long dzfatzk2a = dzfatzk2;
        long slehubx1a = slehubx1;
        double mkqrhxf0a = mkqrhxf0;
        Log.w("ePZhPwLs", "ePZhPwLs" + bknxnkcwxc4a + mkqrhxf0a + abbysurcqe3a + slehubx1a + dzfatzk2a + "ePZhPwLs" + Qciekhx + TIOgZDE + TkuwMKE + OtWmsLX + ijNCOri + TFowIrm + pgTSCeZ + "");
    }

    public boolean equals(Object obj) {
        char bknxnkcwxc4 = 25;
        int abbysurcqe3 = 15;
        long dzfatzk2 = 86L;
        long slehubx1 = 69L;
        double mkqrhxf0 = 74.74;
        long mukksrtpwu1 = 89L;
        long qvegxfyv0 = 14L;
        boolean hrwywhksar1 = true;
        short ylsnxyvrnw0 = 39;
        boolean jfdlhksqoj4 = false;
        boolean tcpdvcz3 = false;
        short eagabjikv2 = 75;
        float dtwhnpbshf1 = 34.34f;
        short vamifbnj0 = 81;
        float zhkgrzwncp2 = 29.29f;
        double apdtfjb1 = 5.5;
        double ytuxvkihw0 = 86.86;
        boolean psmndthnt1 = false;
        double wqaujwybo0 = 25.25;
        double xswfmtrs2 = 91.91;
        char quyihhbt1 = 65;
        long tebuojmh0 = 41L;
        long yinzkhcd4 = 57L;
        long wzjexpqivk3 = 80L;
        int tobcvagum2 = 88;
        byte zgyoawnws1 = 94;
        double nbcmdxfyab0 = 86.86;
        Log.i("GmUtTmv", "" + jtagOHo + GVdrLWw + GmUtTmv + "");
        return super.equals(obj);
    }
}
