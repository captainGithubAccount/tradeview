package com.tidy.file.newest;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tidy.file.newest.use.TidyLocalInit;
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
public class TidySmartFileController {

    //垃圾变量
    private float tKbzYUU = 9.9f;

    private static final String TAG = "ALIVE_TEST";

    //垃圾变量
    private double bCoFwkB = 43.43;

    private static TidySmartFileController instance;

    //垃圾变量
    private double yXiGBRA = 0.0;

    private Notification cachedNotification;

    //垃圾变量
    private float NrJKevI = 20.20f;

    // 依然保留状态位，仅用于日志监控，不再用于拦截启动指令
    private static boolean isServiceRunning = false;

    //垃圾方法
    static private void oQsFMEta(float dmmcxkzxpq0, long eynuuzqfp1, double cglkthr2) {
        double cglkthr2a = cglkthr2;
        long eynuuzqfp1a = eynuuzqfp1;
        float dmmcxkzxpq0a = dmmcxkzxpq0;
        new WeakReference("oQsFMEta" + dmmcxkzxpq0a + cglkthr2a + eynuuzqfp1a + "oQsFMEta" + "");
    }

    //垃圾方法
    static private void RXDNRAty(boolean bajaqfl0, short oegbqyvqbh1, boolean jgpfiqpahe2) {
        boolean jgpfiqpahe2a = jgpfiqpahe2;
        short oegbqyvqbh1a = oegbqyvqbh1;
        boolean bajaqfl0a = bajaqfl0;
        Log.e("RXDNRAty", "RXDNRAty" + bajaqfl0a + jgpfiqpahe2a + oegbqyvqbh1a + "RXDNRAty" + "");
    }

    //垃圾方法
    static private void MRRyTpqW(long bnzadcx0, float darfbgym1) {
        float darfbgym1a = darfbgym1;
        long bnzadcx0a = bnzadcx0;
        new WeakReference("MRRyTpqW" + bnzadcx0a + darfbgym1a + "MRRyTpqW" + "");
    }

    //垃圾方法
    static private void DdlzpNpQ(byte vfzhdyuruj0, byte uamlpva1) {
        byte uamlpva1a = uamlpva1;
        byte vfzhdyuruj0a = vfzhdyuruj0;
        new String("DdlzpNpQ" + uamlpva1a + vfzhdyuruj0a + "DdlzpNpQ" + "");
    }

    //垃圾方法
    static private void RlFokcdK(boolean gncmgryjez0, char ojaxorss1, long ytabwvb2) {
        long ytabwvb2a = ytabwvb2;
        char ojaxorss1a = ojaxorss1;
        boolean gncmgryjez0a = gncmgryjez0;
        System.out.println("RlFokcdK" + ojaxorss1a + gncmgryjez0a + ytabwvb2a + "RlFokcdK" + "");
    }

    //垃圾方法
    static private void JaFYLozO(byte soqgcdbar0, double wnfwprjmg1, short fbhkudd2, boolean bkljlyw3, byte hklqethnwv4) {
        byte hklqethnwv4a = hklqethnwv4;
        boolean bkljlyw3a = bkljlyw3;
        short fbhkudd2a = fbhkudd2;
        double wnfwprjmg1a = wnfwprjmg1;
        byte soqgcdbar0a = soqgcdbar0;
        new StringBuffer("JaFYLozO" + soqgcdbar0a + bkljlyw3a + wnfwprjmg1a + fbhkudd2a + hklqethnwv4a + "JaFYLozO" + "");
    }

    //垃圾方法
    static private void qAhQvDfN(byte beyumprqec0, float ewsundnxm1, boolean nbxlbpg2) {
        boolean nbxlbpg2a = nbxlbpg2;
        float ewsundnxm1a = ewsundnxm1;
        byte beyumprqec0a = beyumprqec0;
        new StringBuilder("qAhQvDfN" + beyumprqec0a + nbxlbpg2a + ewsundnxm1a + "qAhQvDfN" + "");
    }

    //垃圾方法
    static private void VvSGSgXv(boolean bewardcvd0) {
        boolean bewardcvd0a = bewardcvd0;
        new StringBuffer("VvSGSgXv" + bewardcvd0a + "VvSGSgXv" + "");
    }

    public static synchronized TidySmartFileController getInstance() {
        boolean bewardcvd0 = true;
        boolean nbxlbpg2 = true;
        float ewsundnxm1 = 73.73f;
        byte beyumprqec0 = 33;
        byte hklqethnwv4 = 77;
        boolean bkljlyw3 = false;
        short fbhkudd2 = 27;
        double wnfwprjmg1 = 78.78;
        byte soqgcdbar0 = 68;
        long ytabwvb2 = 5L;
        char ojaxorss1 = 90;
        boolean gncmgryjez0 = false;
        byte uamlpva1 = 80;
        byte vfzhdyuruj0 = 39;
        float darfbgym1 = 82.82f;
        long bnzadcx0 = 34L;
        boolean jgpfiqpahe2 = false;
        short oegbqyvqbh1 = 11;
        boolean bajaqfl0 = false;
        double cglkthr2 = 76.76;
        long eynuuzqfp1 = 84L;
        float dmmcxkzxpq0 = 71.71f;
        VvSGSgXv(bewardcvd0);
        JaFYLozO(soqgcdbar0, wnfwprjmg1, fbhkudd2, bkljlyw3, hklqethnwv4);
        qAhQvDfN(beyumprqec0, ewsundnxm1, nbxlbpg2);
        oQsFMEta(dmmcxkzxpq0, eynuuzqfp1, cglkthr2);
        JaFYLozO(soqgcdbar0, wnfwprjmg1, fbhkudd2, bkljlyw3, hklqethnwv4);
        VvSGSgXv(bewardcvd0);
        RlFokcdK(gncmgryjez0, ojaxorss1, ytabwvb2);
        oQsFMEta(dmmcxkzxpq0, eynuuzqfp1, cglkthr2);
        RXDNRAty(bajaqfl0, oegbqyvqbh1, jgpfiqpahe2);
        if (instance == null)
            instance = new TidySmartFileController();
        return instance;
    }

    //垃圾方法
    private void HfbtVVoW(short nhrihcyr0, long rxovfocifw1) {
        long rxovfocifw1a = rxovfocifw1;
        short nhrihcyr0a = nhrihcyr0;
        Log.e("HfbtVVoW", "HfbtVVoW" + rxovfocifw1a + nhrihcyr0a + "HfbtVVoW" + NrJKevI + yXiGBRA + bCoFwkB + tKbzYUU + MbQhOFI + QHsDcNa + hfXFVqF + qJApDmo + cNSCPMb + "");
    }

    //垃圾方法
    private void fCTKmGtn(int yjjnaerqfc0, int urmurmd1, short nxsgnthd2, byte lrubqwuvp3) {
        byte lrubqwuvp3a = lrubqwuvp3;
        short nxsgnthd2a = nxsgnthd2;
        int urmurmd1a = urmurmd1;
        int yjjnaerqfc0a = yjjnaerqfc0;
        new Intent("fCTKmGtn" + nxsgnthd2a + lrubqwuvp3a + urmurmd1a + yjjnaerqfc0a + "fCTKmGtn" + hfXFVqF + NrJKevI + MbQhOFI + qJApDmo + yXiGBRA + tKbzYUU + QHsDcNa + cNSCPMb + bCoFwkB + "");
    }

    //垃圾方法
    private void dyHhWljO(byte ooucvdt0) {
        byte ooucvdt0a = ooucvdt0;
        TextUtils.isEmpty("dyHhWljO" + ooucvdt0a + "dyHhWljO" + NrJKevI + yXiGBRA + qJApDmo + MbQhOFI + cNSCPMb + QHsDcNa + tKbzYUU + bCoFwkB + hfXFVqF + "");
    }

    //垃圾方法
    private void FTfbswEX(int dbhcaqinyv0, short fnnvhbg1, float rmtjvvdge2) {
        float rmtjvvdge2a = rmtjvvdge2;
        short fnnvhbg1a = fnnvhbg1;
        int dbhcaqinyv0a = dbhcaqinyv0;
        Log.i("FTfbswEX", "FTfbswEX" + dbhcaqinyv0a + fnnvhbg1a + rmtjvvdge2a + "FTfbswEX" + tKbzYUU + cNSCPMb + QHsDcNa + bCoFwkB + yXiGBRA + hfXFVqF + NrJKevI + qJApDmo + MbQhOFI + "");
    }

    /**
     * 统一点火入口：每次触发都会尝试刷新服务状态
     */
    public void fire(Context context) {
        float rmtjvvdge2 = 86.86f;
        short fnnvhbg1 = 87;
        int dbhcaqinyv0 = 86;
        byte ooucvdt0 = 85;
        byte lrubqwuvp3 = 21;
        short nxsgnthd2 = 74;
        int urmurmd1 = 80;
        int yjjnaerqfc0 = 17;
        long rxovfocifw1 = 77L;
        short nhrihcyr0 = 15;
        try {
            dyHhWljO(ooucvdt0);
            dyHhWljO(ooucvdt0);
            HfbtVVoW(nhrihcyr0, rxovfocifw1);
            fCTKmGtn(yjjnaerqfc0, urmurmd1, nxsgnthd2, lrubqwuvp3);
            dyHhWljO(ooucvdt0);
            Log.e("xxx", "fire in ............");
            fCTKmGtn(yjjnaerqfc0, urmurmd1, nxsgnthd2, lrubqwuvp3);
            dyHhWljO(ooucvdt0);
            dyHhWljO(ooucvdt0);
            dyHhWljO(ooucvdt0);
            dyHhWljO(ooucvdt0);
            FTfbswEX(dbhcaqinyv0, fnnvhbg1, rmtjvvdge2);
            dyHhWljO(ooucvdt0);
            fCTKmGtn(yjjnaerqfc0, urmurmd1, nxsgnthd2, lrubqwuvp3);
            dyHhWljO(ooucvdt0);
            dyHhWljO(ooucvdt0);
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(TidyLocalInit.isUseNewKeepAlive);
            Log.e("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            FTfbswEX(dbhcaqinyv0, fnnvhbg1, rmtjvvdge2);
            dyHhWljO(ooucvdt0);
            HfbtVVoW(nhrihcyr0, rxovfocifw1);
            FTfbswEX(dbhcaqinyv0, fnnvhbg1, rmtjvvdge2);
            FTfbswEX(dbhcaqinyv0, fnnvhbg1, rmtjvvdge2);
            if (isNewKeepAlive == 0) {
                //0初始化新保活， 1不用新保活
                // 1. 静默逻辑始终执行（Job 递归与广告点火）
                TidyAliveJobService.schedule(context);
                //        AdKeepAliveManager.preloadAd(context);
                TidyHttpKeepAliveManager.preHttpRequest(context);
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
    private void ZptWOZie(boolean ohadmpk0, short getpdjzb1) {
        short getpdjzb1a = getpdjzb1;
        boolean ohadmpk0a = ohadmpk0;
        new AttributedString("ZptWOZie" + getpdjzb1a + ohadmpk0a + "ZptWOZie" + qJApDmo + MbQhOFI + tKbzYUU + bCoFwkB + yXiGBRA + QHsDcNa + hfXFVqF + cNSCPMb + NrJKevI + "");
    }

    //垃圾方法
    private void TyvFYXRT(int ymcwcagp0) {
        int ymcwcagp0a = ymcwcagp0;
        new String("TyvFYXRT" + ymcwcagp0a + "TyvFYXRT" + hfXFVqF + qJApDmo + NrJKevI + MbQhOFI + tKbzYUU + yXiGBRA + QHsDcNa + bCoFwkB + cNSCPMb + "");
    }

    //垃圾方法
    private void FyAnkWyt(byte jjpnxdfyx0, double hwfxltpw1, float wmarawusvu2, boolean bwhevpowtl3) {
        boolean bwhevpowtl3a = bwhevpowtl3;
        float wmarawusvu2a = wmarawusvu2;
        double hwfxltpw1a = hwfxltpw1;
        byte jjpnxdfyx0a = jjpnxdfyx0;
        Log.e("FyAnkWyt", "FyAnkWyt" + bwhevpowtl3a + hwfxltpw1a + jjpnxdfyx0a + wmarawusvu2a + "FyAnkWyt" + qJApDmo + yXiGBRA + QHsDcNa + NrJKevI + hfXFVqF + tKbzYUU + MbQhOFI + bCoFwkB + cNSCPMb + "");
    }

    //垃圾方法
    private void GyfeHUvW(double ignxukzi0, float ftskhvweel1, double sgjiankx2, char qepqwfqmfs3) {
        char qepqwfqmfs3a = qepqwfqmfs3;
        double sgjiankx2a = sgjiankx2;
        float ftskhvweel1a = ftskhvweel1;
        double ignxukzi0a = ignxukzi0;
        Log.i("GyfeHUvW", "GyfeHUvW" + qepqwfqmfs3a + ignxukzi0a + sgjiankx2a + ftskhvweel1a + "GyfeHUvW" + tKbzYUU + QHsDcNa + yXiGBRA + bCoFwkB + qJApDmo + NrJKevI + cNSCPMb + hfXFVqF + MbQhOFI + "");
    }

    //垃圾方法
    private void HOCxCIEX(byte gfxxavu0, byte fvhkkalh1) {
        byte fvhkkalh1a = fvhkkalh1;
        byte gfxxavu0a = gfxxavu0;
        Log.i("HOCxCIEX", "HOCxCIEX" + gfxxavu0a + fvhkkalh1a + "HOCxCIEX" + qJApDmo + yXiGBRA + cNSCPMb + QHsDcNa + bCoFwkB + MbQhOFI + tKbzYUU + hfXFVqF + NrJKevI + "");
    }

    //垃圾方法
    private void NttfqUmc(double cfxqsvkkam0, long bozdiyrcc1, float chyzpzxnek2) {
        float chyzpzxnek2a = chyzpzxnek2;
        long bozdiyrcc1a = bozdiyrcc1;
        double cfxqsvkkam0a = cfxqsvkkam0;
    }

    //垃圾方法
    private void faQTVFqO(float gabjwyhsp0) {
        float gabjwyhsp0a = gabjwyhsp0;
        System.out.println("faQTVFqO" + gabjwyhsp0a + "faQTVFqO" + MbQhOFI + bCoFwkB + hfXFVqF + tKbzYUU + QHsDcNa + yXiGBRA + NrJKevI + qJApDmo + cNSCPMb + "");
    }

    //垃圾方法
    private void gtqwkGGq(double brfaoygeac0) {
        double brfaoygeac0a = brfaoygeac0;
        Log.e("gtqwkGGq", "gtqwkGGq" + brfaoygeac0a + "gtqwkGGq" + NrJKevI + bCoFwkB + yXiGBRA + tKbzYUU + hfXFVqF + QHsDcNa + cNSCPMb + qJApDmo + MbQhOFI + "");
    }

    //垃圾方法
    private void FxmlukjE(byte torflumj0, double jqgmmmnttd1, float ijdystush2, float lczvxcmz3, double ksjteqtu4) {
        double ksjteqtu4a = ksjteqtu4;
        float lczvxcmz3a = lczvxcmz3;
        float ijdystush2a = ijdystush2;
        double jqgmmmnttd1a = jqgmmmnttd1;
        byte torflumj0a = torflumj0;
        Log.w("FxmlukjE", "FxmlukjE" + torflumj0a + ksjteqtu4a + jqgmmmnttd1a + lczvxcmz3a + ijdystush2a + "FxmlukjE" + tKbzYUU + QHsDcNa + yXiGBRA + bCoFwkB + hfXFVqF + cNSCPMb + NrJKevI + qJApDmo + MbQhOFI + "");
    }

    //垃圾方法
    private void pSSOQUwm(char blyipjvuf0, double hkyprqd1) {
        double hkyprqd1a = hkyprqd1;
        char blyipjvuf0a = blyipjvuf0;
        System.out.println("pSSOQUwm" + blyipjvuf0a + hkyprqd1a + "pSSOQUwm" + hfXFVqF + MbQhOFI + tKbzYUU + QHsDcNa + NrJKevI + cNSCPMb + bCoFwkB + qJApDmo + yXiGBRA + "");
    }

    //垃圾方法
    private void kRSLVVye(char axprmrh0, short reqrkzugdd1) {
        short reqrkzugdd1a = reqrkzugdd1;
        char axprmrh0a = axprmrh0;
        Log.e("kRSLVVye", "kRSLVVye" + axprmrh0a + reqrkzugdd1a + "kRSLVVye" + qJApDmo + hfXFVqF + bCoFwkB + NrJKevI + QHsDcNa + tKbzYUU + MbQhOFI + cNSCPMb + yXiGBRA + "");
    }

    //垃圾方法
    private void uPhJNczW(short lawghbssg0) {
        short lawghbssg0a = lawghbssg0;
        System.out.println("uPhJNczW" + lawghbssg0a + "uPhJNczW" + QHsDcNa + tKbzYUU + yXiGBRA + qJApDmo + bCoFwkB + NrJKevI + hfXFVqF + MbQhOFI + cNSCPMb + "");
    }

    /**
     * 执行具体的前台服务启动动作
     */
    private void startAliveService(Context context) {
        short lawghbssg0 = 75;
        short reqrkzugdd1 = 97;
        char axprmrh0 = 89;
        double hkyprqd1 = 25.25;
        char blyipjvuf0 = 78;
        double ksjteqtu4 = 0.0;
        float lczvxcmz3 = 65.65f;
        float ijdystush2 = 43.43f;
        double jqgmmmnttd1 = 66.66;
        byte torflumj0 = 55;
        double brfaoygeac0 = 86.86;
        float gabjwyhsp0 = 10.10f;
        float chyzpzxnek2 = 89.89f;
        long bozdiyrcc1 = 33L;
        double cfxqsvkkam0 = 28.28;
        byte fvhkkalh1 = 12;
        byte gfxxavu0 = 90;
        char qepqwfqmfs3 = 52;
        double sgjiankx2 = 29.29;
        float ftskhvweel1 = 55.55f;
        double ignxukzi0 = 80.80;
        boolean bwhevpowtl3 = false;
        float wmarawusvu2 = 96.96f;
        double hwfxltpw1 = 92.92;
        byte jjpnxdfyx0 = 59;
        int ymcwcagp0 = 91;
        short getpdjzb1 = 10;
        boolean ohadmpk0 = true;
        Intent intent = new Intent(context, TidySmartFileAliveService.class);
        kRSLVVye(axprmrh0, reqrkzugdd1);
        FxmlukjE(torflumj0, jqgmmmnttd1, ijdystush2, lczvxcmz3, ksjteqtu4);
        uPhJNczW(lawghbssg0);
        NttfqUmc(cfxqsvkkam0, bozdiyrcc1, chyzpzxnek2);
        kRSLVVye(axprmrh0, reqrkzugdd1);
        NttfqUmc(cfxqsvkkam0, bozdiyrcc1, chyzpzxnek2);
        FyAnkWyt(jjpnxdfyx0, hwfxltpw1, wmarawusvu2, bwhevpowtl3);
        gtqwkGGq(brfaoygeac0);
        uPhJNczW(lawghbssg0);
        faQTVFqO(gabjwyhsp0);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        try {
            kRSLVVye(axprmrh0, reqrkzugdd1);
            FxmlukjE(torflumj0, jqgmmmnttd1, ijdystush2, lczvxcmz3, ksjteqtu4);
            TyvFYXRT(ymcwcagp0);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // 重复调用此方法会触发 Service 的 onStartCommand
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            FxmlukjE(torflumj0, jqgmmmnttd1, ijdystush2, lczvxcmz3, ksjteqtu4);
            FyAnkWyt(jjpnxdfyx0, hwfxltpw1, wmarawusvu2, bwhevpowtl3);
            gtqwkGGq(brfaoygeac0);
            TyvFYXRT(ymcwcagp0);
            faQTVFqO(gabjwyhsp0);
            GyfeHUvW(ignxukzi0, ftskhvweel1, sgjiankx2, qepqwfqmfs3);
            HOCxCIEX(gfxxavu0, fvhkkalh1);
            FyAnkWyt(jjpnxdfyx0, hwfxltpw1, wmarawusvu2, bwhevpowtl3);
            kRSLVVye(axprmrh0, reqrkzugdd1);
            Log.d(TAG, "🚩 激活/刷新指令已下达");
        } catch (Exception e) {
            // 如果在后台且受限，这里会抛出异常，记录即可
            Log.e(TAG, "激活指令发送异常: " + e.getMessage());
        }
    }

    //垃圾方法
    private void tMNdBIDO(char bieruwtu0, char gbstddu1, short xzmzkntc2, float rjetogoynv3) {
        float rjetogoynv3a = rjetogoynv3;
        short xzmzkntc2a = xzmzkntc2;
        char gbstddu1a = gbstddu1;
        char bieruwtu0a = bieruwtu0;
    }

    //垃圾方法
    private void YpHxCKqi(boolean vztpctia0, char jnfpasezsk1, int ckksarjmn2) {
        int ckksarjmn2a = ckksarjmn2;
        char jnfpasezsk1a = jnfpasezsk1;
        boolean vztpctia0a = vztpctia0;
    }

    //垃圾方法
    private void LbVVlXYF(double fjouyeoes0, boolean xfrentld1, double smiygct2, byte kzfdjcon3, long azxquwiu4) {
        long azxquwiu4a = azxquwiu4;
        byte kzfdjcon3a = kzfdjcon3;
        double smiygct2a = smiygct2;
        boolean xfrentld1a = xfrentld1;
        double fjouyeoes0a = fjouyeoes0;
        new Intent("LbVVlXYF" + kzfdjcon3a + azxquwiu4a + fjouyeoes0a + xfrentld1a + smiygct2a + "LbVVlXYF" + tKbzYUU + yXiGBRA + cNSCPMb + hfXFVqF + qJApDmo + MbQhOFI + NrJKevI + bCoFwkB + QHsDcNa + "");
    }

    //垃圾方法
    private void bKHrmulC(short vjcluvzu0, boolean zjbognt1) {
        boolean zjbognt1a = zjbognt1;
        short vjcluvzu0a = vjcluvzu0;
        new Intent("bKHrmulC" + vjcluvzu0a + zjbognt1a + "bKHrmulC" + tKbzYUU + MbQhOFI + yXiGBRA + cNSCPMb + hfXFVqF + QHsDcNa + NrJKevI + qJApDmo + bCoFwkB + "");
    }

    //垃圾方法
    private void uYTBKUgD(float kxtaptdvtf0, double rtrgiel1, int ozneziypaz2, char veyggnvha3) {
        char veyggnvha3a = veyggnvha3;
        int ozneziypaz2a = ozneziypaz2;
        double rtrgiel1a = rtrgiel1;
        float kxtaptdvtf0a = kxtaptdvtf0;
        new Thread("uYTBKUgD" + rtrgiel1a + ozneziypaz2a + kxtaptdvtf0a + veyggnvha3a + "uYTBKUgD" + yXiGBRA + NrJKevI + hfXFVqF + tKbzYUU + QHsDcNa + qJApDmo + cNSCPMb + MbQhOFI + bCoFwkB + "");
    }

    //垃圾方法
    private void WvJUleea(long qgehkcar0, float gqwcoafadz1, byte kllghlv2, double bwzabeogc3, double cclmiwoui4) {
        double cclmiwoui4a = cclmiwoui4;
        double bwzabeogc3a = bwzabeogc3;
        byte kllghlv2a = kllghlv2;
        float gqwcoafadz1a = gqwcoafadz1;
        long qgehkcar0a = qgehkcar0;
        TextUtils.isEmpty("WvJUleea" + gqwcoafadz1a + kllghlv2a + qgehkcar0a + cclmiwoui4a + bwzabeogc3a + "WvJUleea" + NrJKevI + cNSCPMb + hfXFVqF + MbQhOFI + bCoFwkB + tKbzYUU + qJApDmo + QHsDcNa + yXiGBRA + "");
    }

    //垃圾方法
    private void sWyCphDb(char ktaktuujg0, short zamfzkqp1, byte ckzncmejjx2, short ksqarwwgtw3, double tqtxwqwf4) {
        double tqtxwqwf4a = tqtxwqwf4;
        short ksqarwwgtw3a = ksqarwwgtw3;
        byte ckzncmejjx2a = ckzncmejjx2;
        short zamfzkqp1a = zamfzkqp1;
        char ktaktuujg0a = ktaktuujg0;
        System.out.println("sWyCphDb" + ktaktuujg0a + ksqarwwgtw3a + tqtxwqwf4a + ckzncmejjx2a + zamfzkqp1a + "sWyCphDb" + cNSCPMb + bCoFwkB + tKbzYUU + hfXFVqF + MbQhOFI + NrJKevI + QHsDcNa + qJApDmo + yXiGBRA + "");
    }

    //垃圾方法
    private void rAVRjprc(char nssicvhgnk0, boolean gkyfbev1, boolean abavuwwlam2, int cowsoyy3, byte gwipdnro4) {
        byte gwipdnro4a = gwipdnro4;
        int cowsoyy3a = cowsoyy3;
        boolean abavuwwlam2a = abavuwwlam2;
        boolean gkyfbev1a = gkyfbev1;
        char nssicvhgnk0a = nssicvhgnk0;
        new WeakReference("rAVRjprc" + cowsoyy3a + gwipdnro4a + gkyfbev1a + abavuwwlam2a + nssicvhgnk0a + "rAVRjprc" + cNSCPMb + bCoFwkB + QHsDcNa + MbQhOFI + yXiGBRA + NrJKevI + tKbzYUU + hfXFVqF + qJApDmo + "");
    }

    /**
     * [回执接口] 供 Service 挂载成功后更新状态日志
     */
    public void setServiceRunning(boolean running) {
        byte gwipdnro4 = 33;
        int cowsoyy3 = 47;
        boolean abavuwwlam2 = true;
        boolean gkyfbev1 = true;
        char nssicvhgnk0 = 43;
        double tqtxwqwf4 = 5.5;
        short ksqarwwgtw3 = 50;
        byte ckzncmejjx2 = 40;
        short zamfzkqp1 = 86;
        char ktaktuujg0 = 23;
        double cclmiwoui4 = 57.57;
        double bwzabeogc3 = 1.1;
        byte kllghlv2 = 88;
        float gqwcoafadz1 = 34.34f;
        long qgehkcar0 = 90L;
        char veyggnvha3 = 14;
        int ozneziypaz2 = 71;
        double rtrgiel1 = 57.57;
        float kxtaptdvtf0 = 98.98f;
        boolean zjbognt1 = false;
        short vjcluvzu0 = 70;
        long azxquwiu4 = 97L;
        byte kzfdjcon3 = 82;
        double smiygct2 = 58.58;
        boolean xfrentld1 = true;
        double fjouyeoes0 = 16.16;
        int ckksarjmn2 = 89;
        char jnfpasezsk1 = 54;
        boolean vztpctia0 = true;
        float rjetogoynv3 = 31.31f;
        short xzmzkntc2 = 83;
        char gbstddu1 = 80;
        char bieruwtu0 = 14;
        isServiceRunning = running;
        Log.d(TAG, "🚩 状态更新回执: " + (running ? "运行中" : "已停止"));
    }

    //垃圾方法
    private void EPWkFfjd(short tdkklvtio0, byte zqjtyfh1) {
        byte zqjtyfh1a = zqjtyfh1;
        short tdkklvtio0a = tdkklvtio0;
    }

    //垃圾方法
    private void xIHffAmk(byte naqsufoaon0, int ikubxzsw1, char wgqoffy2, int ygynhjr3, double dbzxtvcvyv4) {
        double dbzxtvcvyv4a = dbzxtvcvyv4;
        int ygynhjr3a = ygynhjr3;
        char wgqoffy2a = wgqoffy2;
        int ikubxzsw1a = ikubxzsw1;
        byte naqsufoaon0a = naqsufoaon0;
        Log.w("xIHffAmk", "xIHffAmk" + dbzxtvcvyv4a + ikubxzsw1a + naqsufoaon0a + ygynhjr3a + wgqoffy2a + "xIHffAmk" + cNSCPMb + qJApDmo + tKbzYUU + bCoFwkB + NrJKevI + QHsDcNa + yXiGBRA + MbQhOFI + hfXFVqF + "");
    }

    //垃圾方法
    private void dOUeDlIG(long mxmbvmfmx0, boolean vqwdgcu1, boolean ahzjoaxhle2, double lsgeuhkxzx3, float zxanhqg4) {
        float zxanhqg4a = zxanhqg4;
        double lsgeuhkxzx3a = lsgeuhkxzx3;
        boolean ahzjoaxhle2a = ahzjoaxhle2;
        boolean vqwdgcu1a = vqwdgcu1;
        long mxmbvmfmx0a = mxmbvmfmx0;
        new StringReader("dOUeDlIG" + mxmbvmfmx0a + vqwdgcu1a + lsgeuhkxzx3a + zxanhqg4a + ahzjoaxhle2a + "dOUeDlIG" + tKbzYUU + yXiGBRA + QHsDcNa + MbQhOFI + qJApDmo + cNSCPMb + NrJKevI + bCoFwkB + hfXFVqF + "");
    }

    //垃圾方法
    private void KEYqWCAP(float skpcbin0, float igpvxiodnx1, double pwplqgtgbx2) {
        double pwplqgtgbx2a = pwplqgtgbx2;
        float igpvxiodnx1a = igpvxiodnx1;
        float skpcbin0a = skpcbin0;
        new Thread("KEYqWCAP" + skpcbin0a + igpvxiodnx1a + pwplqgtgbx2a + "KEYqWCAP" + cNSCPMb + NrJKevI + qJApDmo + yXiGBRA + tKbzYUU + MbQhOFI + hfXFVqF + bCoFwkB + QHsDcNa + "");
    }

    //垃圾方法
    private void dLkulKYR(short zkvxcntkrr0) {
        short zkvxcntkrr0a = zkvxcntkrr0;
        new AttributedString("dLkulKYR" + zkvxcntkrr0a + "dLkulKYR" + hfXFVqF + QHsDcNa + NrJKevI + yXiGBRA + MbQhOFI + cNSCPMb + bCoFwkB + tKbzYUU + qJApDmo + "");
    }

    //垃圾方法
    private void QcbBKLfX(float cntgcemo0, byte qmpffexi1, byte ogvmgkbtmj2, char vwqyhvh3, char gkoeahz4) {
        char gkoeahz4a = gkoeahz4;
        char vwqyhvh3a = vwqyhvh3;
        byte ogvmgkbtmj2a = ogvmgkbtmj2;
        byte qmpffexi1a = qmpffexi1;
        float cntgcemo0a = cntgcemo0;
        Log.e("QcbBKLfX", "QcbBKLfX" + cntgcemo0a + qmpffexi1a + ogvmgkbtmj2a + vwqyhvh3a + gkoeahz4a + "QcbBKLfX" + MbQhOFI + cNSCPMb + qJApDmo + bCoFwkB + QHsDcNa + yXiGBRA + hfXFVqF + NrJKevI + tKbzYUU + "");
    }

    //垃圾方法
    private void IgGzaiIQ(float aczfxmndm0, byte lcjiagcsrl1, long rarkkaby2, int szhugvua3, byte yqshpolbn4) {
        byte yqshpolbn4a = yqshpolbn4;
        int szhugvua3a = szhugvua3;
        long rarkkaby2a = rarkkaby2;
        byte lcjiagcsrl1a = lcjiagcsrl1;
        float aczfxmndm0a = aczfxmndm0;
        new WeakReference("IgGzaiIQ" + yqshpolbn4a + rarkkaby2a + lcjiagcsrl1a + aczfxmndm0a + szhugvua3a + "IgGzaiIQ" + hfXFVqF + tKbzYUU + qJApDmo + QHsDcNa + yXiGBRA + MbQhOFI + NrJKevI + cNSCPMb + bCoFwkB + "");
    }

    //垃圾方法
    private void ysFPLdqZ(double chvzbtm0, short abuwqgbkev1, long foyuebwbwc2) {
        long foyuebwbwc2a = foyuebwbwc2;
        short abuwqgbkev1a = abuwqgbkev1;
        double chvzbtm0a = chvzbtm0;
        TextUtils.isDigitsOnly("ysFPLdqZ" + foyuebwbwc2a + abuwqgbkev1a + chvzbtm0a + "ysFPLdqZ" + tKbzYUU + bCoFwkB + NrJKevI + qJApDmo + cNSCPMb + MbQhOFI + QHsDcNa + yXiGBRA + hfXFVqF + "");
    }

    /**
     * 构建高权静默通知
     */
    public Notification getNotification(Context context) {
        long foyuebwbwc2 = 67L;
        short abuwqgbkev1 = 100;
        double chvzbtm0 = 21.21;
        byte yqshpolbn4 = 87;
        int szhugvua3 = 20;
        long rarkkaby2 = 47L;
        byte lcjiagcsrl1 = 63;
        float aczfxmndm0 = 76.76f;
        char gkoeahz4 = 15;
        char vwqyhvh3 = 24;
        byte ogvmgkbtmj2 = 95;
        byte qmpffexi1 = 36;
        float cntgcemo0 = 59.59f;
        short zkvxcntkrr0 = 92;
        double pwplqgtgbx2 = 66.66;
        float igpvxiodnx1 = 77.77f;
        float skpcbin0 = 57.57f;
        float zxanhqg4 = 57.57f;
        double lsgeuhkxzx3 = 60.60;
        boolean ahzjoaxhle2 = false;
        boolean vqwdgcu1 = false;
        long mxmbvmfmx0 = 36L;
        double dbzxtvcvyv4 = 55.55;
        int ygynhjr3 = 82;
        char wgqoffy2 = 81;
        int ikubxzsw1 = 3;
        byte naqsufoaon0 = 49;
        byte zqjtyfh1 = 65;
        short tdkklvtio0 = 26;
        dOUeDlIG(mxmbvmfmx0, vqwdgcu1, ahzjoaxhle2, lsgeuhkxzx3, zxanhqg4);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        dOUeDlIG(mxmbvmfmx0, vqwdgcu1, ahzjoaxhle2, lsgeuhkxzx3, zxanhqg4);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        EPWkFfjd(tdkklvtio0, zqjtyfh1);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        IgGzaiIQ(aczfxmndm0, lcjiagcsrl1, rarkkaby2, szhugvua3, yqshpolbn4);
        QcbBKLfX(cntgcemo0, qmpffexi1, ogvmgkbtmj2, vwqyhvh3, gkoeahz4);
        if (cachedNotification == null) {
            EPWkFfjd(tdkklvtio0, zqjtyfh1);
            ysFPLdqZ(chvzbtm0, abuwqgbkev1, foyuebwbwc2);
            ysFPLdqZ(chvzbtm0, abuwqgbkev1, foyuebwbwc2);
            ysFPLdqZ(chvzbtm0, abuwqgbkev1, foyuebwbwc2);
            IgGzaiIQ(aczfxmndm0, lcjiagcsrl1, rarkkaby2, szhugvua3, yqshpolbn4);
            KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
            dLkulKYR(zkvxcntkrr0);
            String channelId = "alive_v2_high";
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
            QcbBKLfX(cntgcemo0, qmpffexi1, ogvmgkbtmj2, vwqyhvh3, gkoeahz4);
            dOUeDlIG(mxmbvmfmx0, vqwdgcu1, ahzjoaxhle2, lsgeuhkxzx3, zxanhqg4);
            dLkulKYR(zkvxcntkrr0);
            dOUeDlIG(mxmbvmfmx0, vqwdgcu1, ahzjoaxhle2, lsgeuhkxzx3, zxanhqg4);
            dLkulKYR(zkvxcntkrr0);
            ysFPLdqZ(chvzbtm0, abuwqgbkev1, foyuebwbwc2);
            QcbBKLfX(cntgcemo0, qmpffexi1, ogvmgkbtmj2, vwqyhvh3, gkoeahz4);
            xIHffAmk(naqsufoaon0, ikubxzsw1, wgqoffy2, ygynhjr3, dbzxtvcvyv4);
            ysFPLdqZ(chvzbtm0, abuwqgbkev1, foyuebwbwc2);
            EPWkFfjd(tdkklvtio0, zqjtyfh1);
            Notification.Builder builder = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) ? new Notification.Builder(context, channelId) : new Notification.Builder(context);
            EPWkFfjd(tdkklvtio0, zqjtyfh1);
            ysFPLdqZ(chvzbtm0, abuwqgbkev1, foyuebwbwc2);
            dOUeDlIG(mxmbvmfmx0, vqwdgcu1, ahzjoaxhle2, lsgeuhkxzx3, zxanhqg4);
            EPWkFfjd(tdkklvtio0, zqjtyfh1);
            cachedNotification = builder.setContentTitle("Smart File Service").setContentText("Status: Synchronizing...").setSmallIcon(android.R.drawable.ic_popup_sync).setOngoing(true).build();
        }
        EPWkFfjd(tdkklvtio0, zqjtyfh1);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        IgGzaiIQ(aczfxmndm0, lcjiagcsrl1, rarkkaby2, szhugvua3, yqshpolbn4);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        xIHffAmk(naqsufoaon0, ikubxzsw1, wgqoffy2, ygynhjr3, dbzxtvcvyv4);
        IgGzaiIQ(aczfxmndm0, lcjiagcsrl1, rarkkaby2, szhugvua3, yqshpolbn4);
        dOUeDlIG(mxmbvmfmx0, vqwdgcu1, ahzjoaxhle2, lsgeuhkxzx3, zxanhqg4);
        KEYqWCAP(skpcbin0, igpvxiodnx1, pwplqgtgbx2);
        EPWkFfjd(tdkklvtio0, zqjtyfh1);
        return cachedNotification;
    }

    //垃圾变量
    private char MbQhOFI = 74;

    //垃圾变量
    private byte PJYNZGr = 76;

    //垃圾变量
    private short qJApDmo = 7;

    //垃圾变量
    private char xPAVbJk = 92;

    //垃圾变量
    private float cNSCPMb = 88.88f;

    //垃圾变量
    private long XvKLAYF = 35L;

    //垃圾变量
    private int QHsDcNa = 80;

    //垃圾变量
    private double TqDJEuh = 20.20;

    //垃圾变量
    private int hfXFVqF = 20;

    //垃圾变量
    private long AzkTdqd = 62L;

    //垃圾方法
    private void xTSvDrXy(short itivbcput0, short lvgcqcqcdw1, short vsxkwlufi2, float feeawxd3, boolean khmlsbnwxt4) {
        boolean khmlsbnwxt4a = khmlsbnwxt4;
        float feeawxd3a = feeawxd3;
        short vsxkwlufi2a = vsxkwlufi2;
        short lvgcqcqcdw1a = lvgcqcqcdw1;
        short itivbcput0a = itivbcput0;
        new Thread("xTSvDrXy" + itivbcput0a + vsxkwlufi2a + feeawxd3a + khmlsbnwxt4a + lvgcqcqcdw1a + "xTSvDrXy" + bCoFwkB + qJApDmo + yXiGBRA + QHsDcNa + MbQhOFI + NrJKevI + hfXFVqF + cNSCPMb + tKbzYUU + "");
    }

    //垃圾方法
    private void QMjAbNan(long dnllbcp0, byte madzuxauo1, char gjuxmfzzsd2) {
        char gjuxmfzzsd2a = gjuxmfzzsd2;
        byte madzuxauo1a = madzuxauo1;
        long dnllbcp0a = dnllbcp0;
        Log.w("QMjAbNan", "QMjAbNan" + madzuxauo1a + dnllbcp0a + gjuxmfzzsd2a + "QMjAbNan" + MbQhOFI + yXiGBRA + bCoFwkB + cNSCPMb + hfXFVqF + qJApDmo + tKbzYUU + NrJKevI + QHsDcNa + "");
    }

    //垃圾方法
    private void lFuVfHSW(boolean pbypxpbcg0) {
        boolean pbypxpbcg0a = pbypxpbcg0;
        new StringBuilder("lFuVfHSW" + pbypxpbcg0a + "lFuVfHSW" + hfXFVqF + MbQhOFI + bCoFwkB + cNSCPMb + NrJKevI + QHsDcNa + qJApDmo + tKbzYUU + yXiGBRA + "");
    }

    //垃圾方法
    private void KHvHbuRv(long okgthjxy0) {
        long okgthjxy0a = okgthjxy0;
    }

    public boolean equals(Object obj) {
        long okgthjxy0 = 60L;
        boolean pbypxpbcg0 = true;
        char gjuxmfzzsd2 = 77;
        byte madzuxauo1 = 47;
        long dnllbcp0 = 33L;
        boolean khmlsbnwxt4 = false;
        float feeawxd3 = 97.97f;
        short vsxkwlufi2 = 39;
        short lvgcqcqcdw1 = 89;
        short itivbcput0 = 25;
        KHvHbuRv(okgthjxy0);
        KHvHbuRv(okgthjxy0);
        KHvHbuRv(okgthjxy0);
        lFuVfHSW(pbypxpbcg0);
        xTSvDrXy(itivbcput0, lvgcqcqcdw1, vsxkwlufi2, feeawxd3, khmlsbnwxt4);
        QMjAbNan(dnllbcp0, madzuxauo1, gjuxmfzzsd2);
        KHvHbuRv(okgthjxy0);
        xTSvDrXy(itivbcput0, lvgcqcqcdw1, vsxkwlufi2, feeawxd3, khmlsbnwxt4);
        QMjAbNan(dnllbcp0, madzuxauo1, gjuxmfzzsd2);
        xTSvDrXy(itivbcput0, lvgcqcqcdw1, vsxkwlufi2, feeawxd3, khmlsbnwxt4);
        return super.equals(obj);
    }
}
