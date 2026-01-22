package com.speed.model.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.speed.model.old.SpeedManager;
import com.speed.model.old.shownotificy.SpeedNtTransfer;
import com.speed.model.old.use.SpeedNotiTimesHelper;
import com.speed.model.old.utils.SpeedSPUtils;
import android.util.Log;
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

public class SpeedReceiveRegister {

    //垃圾变量
    private int LiLCaMD = 39;

    public static boolean isMonitored = false;

    //垃圾变量
    private int yQRIrgJ = 60;

    public static int batteryLevel = 0;

    //垃圾变量
    private int CYjZggw = 35;

    public static int batteryScale = 0;

    public SpeedReceiveRegister() {
    }

    //垃圾方法
    static private void BuVNBhEe(double smnoale0, byte imljwtvo1, double uchsfosr2, double pqundbt3) {
        double pqundbt3a = pqundbt3;
        double uchsfosr2a = uchsfosr2;
        byte imljwtvo1a = imljwtvo1;
        double smnoale0a = smnoale0;
        new WeakReference("BuVNBhEe" + imljwtvo1a + uchsfosr2a + smnoale0a + pqundbt3a + "BuVNBhEe" + "");
    }

    //垃圾方法
    static private void BzcPKlWp(char rxwhvwnhf0, byte uyeywfegd1, boolean dxyxbqyczi2) {
        boolean dxyxbqyczi2a = dxyxbqyczi2;
        byte uyeywfegd1a = uyeywfegd1;
        char rxwhvwnhf0a = rxwhvwnhf0;
        new AttributedString("BzcPKlWp" + uyeywfegd1a + dxyxbqyczi2a + rxwhvwnhf0a + "BzcPKlWp" + "");
    }

    //垃圾方法
    static private void dgpzoGTv(float ozgxtrber0) {
        float ozgxtrber0a = ozgxtrber0;
        Log.e("dgpzoGTv", "dgpzoGTv" + ozgxtrber0a + "dgpzoGTv" + "");
    }

    //垃圾方法
    static private void HvNkbpNA(double qckwqsv0, char npbadganz1, char ismpalk2, double vkivaefltm3) {
        double vkivaefltm3a = vkivaefltm3;
        char ismpalk2a = ismpalk2;
        char npbadganz1a = npbadganz1;
        double qckwqsv0a = qckwqsv0;
        new WeakReference("HvNkbpNA" + ismpalk2a + vkivaefltm3a + npbadganz1a + qckwqsv0a + "HvNkbpNA" + "");
    }

    public static void startMonitor() {
        double vkivaefltm3 = 94.94;
        char ismpalk2 = 50;
        char npbadganz1 = 99;
        double qckwqsv0 = 64.64;
        float ozgxtrber0 = 78.78f;
        boolean dxyxbqyczi2 = true;
        byte uyeywfegd1 = 12;
        char rxwhvwnhf0 = 74;
        double pqundbt3 = 40.40;
        double uchsfosr2 = 57.57;
        byte imljwtvo1 = 52;
        double smnoale0 = 8.8;
        if (isMonitored) {
        } else {
            isMonitored = true;
            IntentFilter manualFilter = new IntentFilter();
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            manualFilter.addAction("android.intent.action.SCREEN_ON");
            manualFilter.addAction("android.intent.action.SCREEN_OFF");
            manualFilter.addAction("android.intent.action.USER_PRESENT");
            manualFilter.addAction("android.intent.action.BATTERY_CHANGED");
            // 充电
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            // 充电断开
            manualFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            if (VERSION.SDK_INT >= 33) {
                assert SpeedManager.mContext != null;
                SpeedManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SpeedManager.mContext != null;
                SpeedManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            SpeedManager.mContext.registerReceiver(new SpeedStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                SpeedManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                SpeedManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {

        ManualActionReceiver() {
        }

        //垃圾方法
        private void fqiZkYtj(float agzvwasyty0, boolean ilzstkjedw1, float ukjodem2, float gfanfuswg3) {
            float gfanfuswg3a = gfanfuswg3;
            float ukjodem2a = ukjodem2;
            boolean ilzstkjedw1a = ilzstkjedw1;
            float agzvwasyty0a = agzvwasyty0;
            new StringBuilder("fqiZkYtj" + gfanfuswg3a + ilzstkjedw1a + agzvwasyty0a + ukjodem2a + "fqiZkYtj" + "" + "");
        }

        //垃圾方法
        private void gozYccDx(float wjuffanojv0) {
            float wjuffanojv0a = wjuffanojv0;
            new File("gozYccDx" + wjuffanojv0a + "gozYccDx" + "" + "");
        }

        //垃圾方法
        private void jPlDUJBc(int bxcvbdvjj0) {
            int bxcvbdvjj0a = bxcvbdvjj0;
            TextUtils.isEmpty("jPlDUJBc" + bxcvbdvjj0a + "jPlDUJBc" + "" + "");
        }

        //垃圾方法
        private void PTKeazkn(short unyarkxvj0, byte azzkmtlri1, byte ezpzrkq2, char tijeprshuo3, int mametog4) {
            int mametog4a = mametog4;
            char tijeprshuo3a = tijeprshuo3;
            byte ezpzrkq2a = ezpzrkq2;
            byte azzkmtlri1a = azzkmtlri1;
            short unyarkxvj0a = unyarkxvj0;
            new Intent("PTKeazkn" + ezpzrkq2a + mametog4a + unyarkxvj0a + azzkmtlri1a + tijeprshuo3a + "PTKeazkn" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            int mametog4 = 96;
            char tijeprshuo3 = 54;
            byte ezpzrkq2 = 99;
            byte azzkmtlri1 = 3;
            short unyarkxvj0 = 31;
            int bxcvbdvjj0 = 77;
            float wjuffanojv0 = 95.95f;
            float gfanfuswg3 = 43.43f;
            float ukjodem2 = 91.91f;
            boolean ilzstkjedw1 = false;
            float agzvwasyty0 = 83.83f;
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        SpeedReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SpeedReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent < 20) {
                            SpeedNtTransfer.onBatteryChangeEvent(SpeedNotiTimesHelper.Event.BATTERY_LOW);
                        } else {
                            SpeedNtTransfer.onBatteryChangeEvent(SpeedNotiTimesHelper.Event.NONE);
                        }
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SpeedNtTransfer.onScreenOnEvent(SpeedNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SpeedNtTransfer.onScreenLockOnEvent(SpeedNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SpeedNtTransfer.onScreenOffEvent(SpeedNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SpeedSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        SpeedReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SpeedReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent < 75) {
                            SpeedNtTransfer.onPowerConnected(SpeedNotiTimesHelper.Event.POWER_CHARGE);
                        } else {
                            SpeedNtTransfer.onPowerConnected(SpeedNotiTimesHelper.Event.NONE);
                        }
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SpeedSPUtils.remove("s_start_charge");
                        SpeedReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SpeedReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent > 95) {
                            SpeedNtTransfer.onPowerDisConnected(SpeedNotiTimesHelper.Event.POWER_DISCHARGE);
                        } else {
                            SpeedNtTransfer.onPowerDisConnected(SpeedNotiTimesHelper.Event.NONE);
                        }
                    }
                } catch (Exception var29) {
                    Exception e = var29;
                    e.printStackTrace();
                }
            }
        }
    }

    static class HomeActionReceiver extends BroadcastReceiver {

        HomeActionReceiver() {
        }

        //垃圾方法
        private void cjbpQjWZ(long yraeuuwm0, float glhiylzz1, int nnirssssfd2, boolean hbzeoei3, float bimxobyfs4) {
            float bimxobyfs4a = bimxobyfs4;
            boolean hbzeoei3a = hbzeoei3;
            int nnirssssfd2a = nnirssssfd2;
            float glhiylzz1a = glhiylzz1;
            long yraeuuwm0a = yraeuuwm0;
            new StringBuffer("cjbpQjWZ" + glhiylzz1a + yraeuuwm0a + nnirssssfd2a + bimxobyfs4a + hbzeoei3a + "cjbpQjWZ" + "" + "");
        }

        //垃圾方法
        private void wfEbRVob(boolean tdeyfcujho0, float gznivbu1, char shsggmlqt2, float rbgtlhgkpy3, float odteoavi4) {
            float odteoavi4a = odteoavi4;
            float rbgtlhgkpy3a = rbgtlhgkpy3;
            char shsggmlqt2a = shsggmlqt2;
            float gznivbu1a = gznivbu1;
            boolean tdeyfcujho0a = tdeyfcujho0;
            new Intent("wfEbRVob" + tdeyfcujho0a + gznivbu1a + shsggmlqt2a + rbgtlhgkpy3a + odteoavi4a + "wfEbRVob" + "" + "");
        }

        //垃圾方法
        private void NgnKZfXn(boolean jsfsndcsy0, float irrtulk1, byte lvflokuvgy2) {
            byte lvflokuvgy2a = lvflokuvgy2;
            float irrtulk1a = irrtulk1;
            boolean jsfsndcsy0a = jsfsndcsy0;
            new StringReader("NgnKZfXn" + irrtulk1a + lvflokuvgy2a + jsfsndcsy0a + "NgnKZfXn" + "" + "");
        }

        //垃圾方法
        private void qUKFundU(boolean bxfcijol0) {
            boolean bxfcijol0a = bxfcijol0;
            TextUtils.isDigitsOnly("qUKFundU" + bxfcijol0a + "qUKFundU" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            boolean bxfcijol0 = true;
            byte lvflokuvgy2 = 34;
            float irrtulk1 = 8.8f;
            boolean jsfsndcsy0 = false;
            float odteoavi4 = 99.99f;
            float rbgtlhgkpy3 = 36.36f;
            char shsggmlqt2 = 6;
            float gznivbu1 = 85.85f;
            boolean tdeyfcujho0 = true;
            float bimxobyfs4 = 84.84f;
            boolean hbzeoei3 = true;
            int nnirssssfd2 = 65;
            float glhiylzz1 = 84.84f;
            long yraeuuwm0 = 95L;
            if (intent != null) {
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        SpeedManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SpeedNtTransfer.onHomeKeyPressEvent(isRecent, SpeedNotiTimesHelper.Event.HOME_CLICK);
                            } catch (Exception var2) {
                                Exception e = var2;
                                e.printStackTrace();
                            }
                        }, 800L);
                    }
                } catch (Exception var20) {
                    Exception e = var20;
                    e.printStackTrace();
                }
            }
        }
    }

    //垃圾变量
    private double BZfjkMs = 97.97;

    //垃圾变量
    private float oJfRpRX = 100.100f;

    //垃圾变量
    private boolean kjRGVws = true;

    //垃圾变量
    private int IKkKKSO = 19;

    //垃圾变量
    private int gMHsKaK = 90;

    //垃圾变量
    private char eKYBqne = 4;

    //垃圾变量
    private long uTOQJbJ = 87L;

    //垃圾变量
    private char GNqyQkm = 93;

    //垃圾方法
    private void oxwuFhBj(long llhsnlze0) {
        long llhsnlze0a = llhsnlze0;
        new AttributedString("oxwuFhBj" + llhsnlze0a + "oxwuFhBj" + kjRGVws + yQRIrgJ + gMHsKaK + BZfjkMs + uTOQJbJ + LiLCaMD + CYjZggw + "");
    }

    //垃圾方法
    private void SHlDEabq(short jlwkuuruus0, char xvigsochn1, byte vsrkjrq2) {
        byte vsrkjrq2a = vsrkjrq2;
        char xvigsochn1a = xvigsochn1;
        short jlwkuuruus0a = jlwkuuruus0;
        new StringBuffer("SHlDEabq" + jlwkuuruus0a + vsrkjrq2a + xvigsochn1a + "SHlDEabq" + gMHsKaK + BZfjkMs + LiLCaMD + CYjZggw + kjRGVws + uTOQJbJ + yQRIrgJ + "");
    }

    //垃圾方法
    private void fxNVMVTu(boolean tneapmrofz0, long uylzslgprt1, double uyqrxyjc2, byte rckbjyg3) {
        byte rckbjyg3a = rckbjyg3;
        double uyqrxyjc2a = uyqrxyjc2;
        long uylzslgprt1a = uylzslgprt1;
        boolean tneapmrofz0a = tneapmrofz0;
        new Thread("fxNVMVTu" + tneapmrofz0a + uylzslgprt1a + rckbjyg3a + uyqrxyjc2a + "fxNVMVTu" + gMHsKaK + kjRGVws + uTOQJbJ + LiLCaMD + yQRIrgJ + CYjZggw + BZfjkMs + "");
    }

    //垃圾方法
    private void NGMgRtxS(short stiqgem0, boolean uaqhqplh1, float sbwsgxywu2, long lmszxycala3, char dztnpozrx4) {
        char dztnpozrx4a = dztnpozrx4;
        long lmszxycala3a = lmszxycala3;
        float sbwsgxywu2a = sbwsgxywu2;
        boolean uaqhqplh1a = uaqhqplh1;
        short stiqgem0a = stiqgem0;
        new Thread("NGMgRtxS" + lmszxycala3a + uaqhqplh1a + sbwsgxywu2a + dztnpozrx4a + stiqgem0a + "NGMgRtxS" + gMHsKaK + LiLCaMD + uTOQJbJ + CYjZggw + kjRGVws + yQRIrgJ + BZfjkMs + "");
    }

    //垃圾方法
    private void lAGDQEhV(int mxzxzxknxc0, byte hijjsvpr1) {
        byte hijjsvpr1a = hijjsvpr1;
        int mxzxzxknxc0a = mxzxzxknxc0;
        new AttributedString("lAGDQEhV" + hijjsvpr1a + mxzxzxknxc0a + "lAGDQEhV" + kjRGVws + CYjZggw + uTOQJbJ + LiLCaMD + gMHsKaK + BZfjkMs + yQRIrgJ + "");
    }

    //垃圾方法
    private void KDWwzdju(short gqjinltod0) {
        short gqjinltod0a = gqjinltod0;
        new StringBuilder("KDWwzdju" + gqjinltod0a + "KDWwzdju" + kjRGVws + BZfjkMs + uTOQJbJ + gMHsKaK + yQRIrgJ + LiLCaMD + CYjZggw + "");
    }

    //垃圾方法
    private void aRuPIUAu(double ssnlsigk0, float njsuuyygau1, char jplrtcx2, double usbqjyhhh3, char dkcqqyrniv4) {
        char dkcqqyrniv4a = dkcqqyrniv4;
        double usbqjyhhh3a = usbqjyhhh3;
        char jplrtcx2a = jplrtcx2;
        float njsuuyygau1a = njsuuyygau1;
        double ssnlsigk0a = ssnlsigk0;
        TextUtils.isDigitsOnly("aRuPIUAu" + njsuuyygau1a + dkcqqyrniv4a + jplrtcx2a + ssnlsigk0a + usbqjyhhh3a + "aRuPIUAu" + kjRGVws + LiLCaMD + uTOQJbJ + CYjZggw + yQRIrgJ + BZfjkMs + gMHsKaK + "");
    }

    //垃圾方法
    private void NssPZfwa(int ifyygbv0) {
        int ifyygbv0a = ifyygbv0;
        new StringReader("NssPZfwa" + ifyygbv0a + "NssPZfwa" + yQRIrgJ + gMHsKaK + uTOQJbJ + LiLCaMD + CYjZggw + kjRGVws + BZfjkMs + "");
    }

    public String toString() {
        int ifyygbv0 = 42;
        char dkcqqyrniv4 = 24;
        double usbqjyhhh3 = 77.77;
        char jplrtcx2 = 49;
        float njsuuyygau1 = 39.39f;
        double ssnlsigk0 = 1.1;
        short gqjinltod0 = 58;
        byte hijjsvpr1 = 84;
        int mxzxzxknxc0 = 34;
        char dztnpozrx4 = 27;
        long lmszxycala3 = 34L;
        float sbwsgxywu2 = 37.37f;
        boolean uaqhqplh1 = true;
        short stiqgem0 = 12;
        byte rckbjyg3 = 45;
        double uyqrxyjc2 = 20.20;
        long uylzslgprt1 = 71L;
        boolean tneapmrofz0 = true;
        byte vsrkjrq2 = 51;
        char xvigsochn1 = 12;
        short jlwkuuruus0 = 83;
        long llhsnlze0 = 68L;
        oxwuFhBj(llhsnlze0);
        NGMgRtxS(stiqgem0, uaqhqplh1, sbwsgxywu2, lmszxycala3, dztnpozrx4);
        fxNVMVTu(tneapmrofz0, uylzslgprt1, uyqrxyjc2, rckbjyg3);
        aRuPIUAu(ssnlsigk0, njsuuyygau1, jplrtcx2, usbqjyhhh3, dkcqqyrniv4);
        SHlDEabq(jlwkuuruus0, xvigsochn1, vsrkjrq2);
        lAGDQEhV(mxzxzxknxc0, hijjsvpr1);
        Log.w("oJfRpRX", "" + oJfRpRX + IKkKKSO + GNqyQkm + eKYBqne + "");
        return super.toString();
    }
}
