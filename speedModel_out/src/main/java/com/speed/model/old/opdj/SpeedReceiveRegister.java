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
    private float BaBJnxE = 59.59f;

    public static boolean isMonitored = false;

    //垃圾变量
    private long skbFUXI = 84L;

    public static int batteryLevel = 0;

    //垃圾变量
    private char rGiWdUg = 71;

    public static int batteryScale = 0;

    public SpeedReceiveRegister() {
    }

    //垃圾方法
    static private void sDHhdiNk(long fjoeqvt0, double pgciiagirt1) {
        double pgciiagirt1a = pgciiagirt1;
        long fjoeqvt0a = fjoeqvt0;
        TextUtils.isDigitsOnly("sDHhdiNk" + fjoeqvt0a + pgciiagirt1a + "sDHhdiNk" + "");
    }

    //垃圾方法
    static private void gcZsuece(boolean vtllncw0, int gekncdxlx1) {
        int gekncdxlx1a = gekncdxlx1;
        boolean vtllncw0a = vtllncw0;
    }

    //垃圾方法
    static private void HOVTyCvl(short kzrkwrcji0) {
        short kzrkwrcji0a = kzrkwrcji0;
        new Intent("HOVTyCvl" + kzrkwrcji0a + "HOVTyCvl" + "");
    }

    //垃圾方法
    static private void mxwAXPGA(double toopedmuuo0, float iwmfahwzm1, byte wwoqtnwvj2, float ulxmkqe3) {
        float ulxmkqe3a = ulxmkqe3;
        byte wwoqtnwvj2a = wwoqtnwvj2;
        float iwmfahwzm1a = iwmfahwzm1;
        double toopedmuuo0a = toopedmuuo0;
        new StringBuffer("mxwAXPGA" + toopedmuuo0a + iwmfahwzm1a + wwoqtnwvj2a + ulxmkqe3a + "mxwAXPGA" + "");
    }

    public static void startMonitor() {
        float ulxmkqe3 = 69.69f;
        byte wwoqtnwvj2 = 89;
        float iwmfahwzm1 = 42.42f;
        double toopedmuuo0 = 19.19;
        short kzrkwrcji0 = 13;
        int gekncdxlx1 = 38;
        boolean vtllncw0 = true;
        double pgciiagirt1 = 6.6;
        long fjoeqvt0 = 57L;
        mxwAXPGA(toopedmuuo0, iwmfahwzm1, wwoqtnwvj2, ulxmkqe3);
        mxwAXPGA(toopedmuuo0, iwmfahwzm1, wwoqtnwvj2, ulxmkqe3);
        gcZsuece(vtllncw0, gekncdxlx1);
        gcZsuece(vtllncw0, gekncdxlx1);
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
        private void PFKugCWG(int oxtmzpu0, short jotgwlko1) {
            short jotgwlko1a = jotgwlko1;
            int oxtmzpu0a = oxtmzpu0;
            new StringReader("PFKugCWG" + jotgwlko1a + oxtmzpu0a + "PFKugCWG" + "" + "");
        }

        //垃圾方法
        private void BsQrMdPF(int ibtjoawph0, char hehxkrdq1, boolean qhzezfcav2, char xufokhgu3) {
            char xufokhgu3a = xufokhgu3;
            boolean qhzezfcav2a = qhzezfcav2;
            char hehxkrdq1a = hehxkrdq1;
            int ibtjoawph0a = ibtjoawph0;
            new StringReader("BsQrMdPF" + hehxkrdq1a + xufokhgu3a + qhzezfcav2a + ibtjoawph0a + "BsQrMdPF" + "" + "");
        }

        //垃圾方法
        private void mekWSJwR(boolean dbgbxnts0, long vgzhdue1, double lssccte2) {
            double lssccte2a = lssccte2;
            long vgzhdue1a = vgzhdue1;
            boolean dbgbxnts0a = dbgbxnts0;
            Log.i("mekWSJwR", "mekWSJwR" + lssccte2a + vgzhdue1a + dbgbxnts0a + "mekWSJwR" + "" + "");
        }

        //垃圾方法
        private void WgomKFGR(byte yjbcvauoo0, long rrtgogd1) {
            long rrtgogd1a = rrtgogd1;
            byte yjbcvauoo0a = yjbcvauoo0;
            new AttributedString("WgomKFGR" + rrtgogd1a + yjbcvauoo0a + "WgomKFGR" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            long rrtgogd1 = 32L;
            byte yjbcvauoo0 = 76;
            double lssccte2 = 43.43;
            long vgzhdue1 = 30L;
            boolean dbgbxnts0 = false;
            char xufokhgu3 = 64;
            boolean qhzezfcav2 = false;
            char hehxkrdq1 = 56;
            int ibtjoawph0 = 89;
            short jotgwlko1 = 16;
            int oxtmzpu0 = 59;
            mekWSJwR(dbgbxnts0, vgzhdue1, lssccte2);
            WgomKFGR(yjbcvauoo0, rrtgogd1);
            mekWSJwR(dbgbxnts0, vgzhdue1, lssccte2);
            BsQrMdPF(ibtjoawph0, hehxkrdq1, qhzezfcav2, xufokhgu3);
            WgomKFGR(yjbcvauoo0, rrtgogd1);
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
        private void mRkpNsan(short iwdhpugkfo0, char xljkjiehek1, boolean mdzzklr2, int eoefdowqr3, byte yfqonda4) {
            byte yfqonda4a = yfqonda4;
            int eoefdowqr3a = eoefdowqr3;
            boolean mdzzklr2a = mdzzklr2;
            char xljkjiehek1a = xljkjiehek1;
            short iwdhpugkfo0a = iwdhpugkfo0;
            new Intent("mRkpNsan" + eoefdowqr3a + yfqonda4a + mdzzklr2a + iwdhpugkfo0a + xljkjiehek1a + "mRkpNsan" + "" + "");
        }

        //垃圾方法
        private void Ikcrfomb(boolean vgcpvxqk0, char dkpdlex1, float bzxtgvqw2, double ivvpodzy3) {
            double ivvpodzy3a = ivvpodzy3;
            float bzxtgvqw2a = bzxtgvqw2;
            char dkpdlex1a = dkpdlex1;
            boolean vgcpvxqk0a = vgcpvxqk0;
            new AttributedString("Ikcrfomb" + ivvpodzy3a + vgcpvxqk0a + dkpdlex1a + bzxtgvqw2a + "Ikcrfomb" + "" + "");
        }

        //垃圾方法
        private void SovxMReV(int vvcewgyjf0, double ohrplsev1) {
            double ohrplsev1a = ohrplsev1;
            int vvcewgyjf0a = vvcewgyjf0;
            TextUtils.isDigitsOnly("SovxMReV" + ohrplsev1a + vvcewgyjf0a + "SovxMReV" + "" + "");
        }

        //垃圾方法
        private void GTXvAmGL(int vbgipciftt0, float jrtqvrag1, boolean yctjrct2, long mmnlogvjom3, byte mvislxjfjw4) {
            byte mvislxjfjw4a = mvislxjfjw4;
            long mmnlogvjom3a = mmnlogvjom3;
            boolean yctjrct2a = yctjrct2;
            float jrtqvrag1a = jrtqvrag1;
            int vbgipciftt0a = vbgipciftt0;
            new StringReader("GTXvAmGL" + jrtqvrag1a + mvislxjfjw4a + vbgipciftt0a + yctjrct2a + mmnlogvjom3a + "GTXvAmGL" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            byte mvislxjfjw4 = 18;
            long mmnlogvjom3 = 84L;
            boolean yctjrct2 = false;
            float jrtqvrag1 = 77.77f;
            int vbgipciftt0 = 11;
            double ohrplsev1 = 98.98;
            int vvcewgyjf0 = 70;
            double ivvpodzy3 = 2.2;
            float bzxtgvqw2 = 73.73f;
            char dkpdlex1 = 92;
            boolean vgcpvxqk0 = true;
            byte yfqonda4 = 9;
            int eoefdowqr3 = 38;
            boolean mdzzklr2 = false;
            char xljkjiehek1 = 97;
            short iwdhpugkfo0 = 55;
            Ikcrfomb(vgcpvxqk0, dkpdlex1, bzxtgvqw2, ivvpodzy3);
            mRkpNsan(iwdhpugkfo0, xljkjiehek1, mdzzklr2, eoefdowqr3, yfqonda4);
            GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
            mRkpNsan(iwdhpugkfo0, xljkjiehek1, mdzzklr2, eoefdowqr3, yfqonda4);
            SovxMReV(vvcewgyjf0, ohrplsev1);
            GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
            mRkpNsan(iwdhpugkfo0, xljkjiehek1, mdzzklr2, eoefdowqr3, yfqonda4);
            GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
            Ikcrfomb(vgcpvxqk0, dkpdlex1, bzxtgvqw2, ivvpodzy3);
            GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
            if (intent != null) {
                GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
                GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
                Ikcrfomb(vgcpvxqk0, dkpdlex1, bzxtgvqw2, ivvpodzy3);
                GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
                GTXvAmGL(vbgipciftt0, jrtqvrag1, yctjrct2, mmnlogvjom3, mvislxjfjw4);
                Ikcrfomb(vgcpvxqk0, dkpdlex1, bzxtgvqw2, ivvpodzy3);
                SovxMReV(vvcewgyjf0, ohrplsev1);
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
    private int ivOwwjB = 22;

    //垃圾变量
    private boolean HAiBTPJ = true;

    //垃圾变量
    private double mGLicQs = 13.13;

    //垃圾变量
    private long FboHrKe = 36L;

    //垃圾方法
    private void lMqNgXYM(long cpnsmmbpk0, boolean pkuyqgtzmv1, double csursyahdk2) {
        double csursyahdk2a = csursyahdk2;
        boolean pkuyqgtzmv1a = pkuyqgtzmv1;
        long cpnsmmbpk0a = cpnsmmbpk0;
        new Intent("lMqNgXYM" + cpnsmmbpk0a + csursyahdk2a + pkuyqgtzmv1a + "lMqNgXYM" + ivOwwjB + mGLicQs + BaBJnxE + rGiWdUg + skbFUXI + "");
    }

    //垃圾方法
    private void iYqcpVzr(boolean udmfmwprb0, short lwegfxur1) {
        short lwegfxur1a = lwegfxur1;
        boolean udmfmwprb0a = udmfmwprb0;
    }

    //垃圾方法
    private void tZkutWvF(long kmukrgwg0, byte yodeoqghda1, byte wsfbjrcbj2, char uaisftrk3) {
        char uaisftrk3a = uaisftrk3;
        byte wsfbjrcbj2a = wsfbjrcbj2;
        byte yodeoqghda1a = yodeoqghda1;
        long kmukrgwg0a = kmukrgwg0;
        Log.w("tZkutWvF", "tZkutWvF" + kmukrgwg0a + yodeoqghda1a + wsfbjrcbj2a + uaisftrk3a + "tZkutWvF" + mGLicQs + skbFUXI + BaBJnxE + ivOwwjB + rGiWdUg + "");
    }

    //垃圾方法
    private void SEXrhZmf(float yjgtraazxu0, short phnlhgr1, byte ovglsjinqt2) {
        byte ovglsjinqt2a = ovglsjinqt2;
        short phnlhgr1a = phnlhgr1;
        float yjgtraazxu0a = yjgtraazxu0;
        new Thread("SEXrhZmf" + ovglsjinqt2a + phnlhgr1a + yjgtraazxu0a + "SEXrhZmf" + BaBJnxE + rGiWdUg + mGLicQs + ivOwwjB + skbFUXI + "");
    }

    //垃圾方法
    private void bgtpXaqq(int aadougg0, long yjjparyr1, long gxlfyeivwi2) {
        long gxlfyeivwi2a = gxlfyeivwi2;
        long yjjparyr1a = yjjparyr1;
        int aadougg0a = aadougg0;
        new File("bgtpXaqq" + gxlfyeivwi2a + aadougg0a + yjjparyr1a + "bgtpXaqq" + rGiWdUg + mGLicQs + BaBJnxE + ivOwwjB + skbFUXI + "");
    }

    //垃圾方法
    private void eaxsDsDD(float sjqatdzad0, int qkuoqavly1) {
        int qkuoqavly1a = qkuoqavly1;
        float sjqatdzad0a = sjqatdzad0;
        new Intent("eaxsDsDD" + qkuoqavly1a + sjqatdzad0a + "eaxsDsDD" + mGLicQs + BaBJnxE + ivOwwjB + rGiWdUg + skbFUXI + "");
    }

    //垃圾方法
    private void niSCvhxu(float grekdyrdhq0) {
        float grekdyrdhq0a = grekdyrdhq0;
        TextUtils.isDigitsOnly("niSCvhxu" + grekdyrdhq0a + "niSCvhxu" + rGiWdUg + skbFUXI + ivOwwjB + mGLicQs + BaBJnxE + "");
    }

    //垃圾方法
    private void HSuoexYL(float jtnbmpas0, int lkyvypf1, int hirutwpjn2, short ktulwqovpr3) {
        short ktulwqovpr3a = ktulwqovpr3;
        int hirutwpjn2a = hirutwpjn2;
        int lkyvypf1a = lkyvypf1;
        float jtnbmpas0a = jtnbmpas0;
        new AttributedString("HSuoexYL" + lkyvypf1a + ktulwqovpr3a + jtnbmpas0a + hirutwpjn2a + "HSuoexYL" + rGiWdUg + ivOwwjB + BaBJnxE + skbFUXI + mGLicQs + "");
    }

    public String toString() {
        short ktulwqovpr3 = 56;
        int hirutwpjn2 = 95;
        int lkyvypf1 = 70;
        float jtnbmpas0 = 91.91f;
        float grekdyrdhq0 = 39.39f;
        int qkuoqavly1 = 54;
        float sjqatdzad0 = 41.41f;
        long gxlfyeivwi2 = 83L;
        long yjjparyr1 = 61L;
        int aadougg0 = 36;
        byte ovglsjinqt2 = 11;
        short phnlhgr1 = 47;
        float yjgtraazxu0 = 89.89f;
        char uaisftrk3 = 95;
        byte wsfbjrcbj2 = 0;
        byte yodeoqghda1 = 76;
        long kmukrgwg0 = 2L;
        short lwegfxur1 = 24;
        boolean udmfmwprb0 = false;
        double csursyahdk2 = 7.7;
        boolean pkuyqgtzmv1 = false;
        long cpnsmmbpk0 = 36L;
        bgtpXaqq(aadougg0, yjjparyr1, gxlfyeivwi2);
        SEXrhZmf(yjgtraazxu0, phnlhgr1, ovglsjinqt2);
        niSCvhxu(grekdyrdhq0);
        SEXrhZmf(yjgtraazxu0, phnlhgr1, ovglsjinqt2);
        lMqNgXYM(cpnsmmbpk0, pkuyqgtzmv1, csursyahdk2);
        SEXrhZmf(yjgtraazxu0, phnlhgr1, ovglsjinqt2);
        new StringReader("" + HAiBTPJ + FboHrKe + "");
        bgtpXaqq(aadougg0, yjjparyr1, gxlfyeivwi2);
        iYqcpVzr(udmfmwprb0, lwegfxur1);
        HSuoexYL(jtnbmpas0, lkyvypf1, hirutwpjn2, ktulwqovpr3);
        iYqcpVzr(udmfmwprb0, lwegfxur1);
        HSuoexYL(jtnbmpas0, lkyvypf1, hirutwpjn2, ktulwqovpr3);
        SEXrhZmf(yjgtraazxu0, phnlhgr1, ovglsjinqt2);
        bgtpXaqq(aadougg0, yjjparyr1, gxlfyeivwi2);
        SEXrhZmf(yjgtraazxu0, phnlhgr1, ovglsjinqt2);
        tZkutWvF(kmukrgwg0, yodeoqghda1, wsfbjrcbj2, uaisftrk3);
        return super.toString();
    }
}
