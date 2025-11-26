package com.recover.redate.orgyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.recover.redate.RecoverOrgManager;
import com.recover.redate.shownotificy.RecoverNtTransfer;
import com.recover.redate.utils.RecoverSPUtils;
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

public class RecoverReceiveRegister {

    //垃圾变量
    private int sSfkLeU = 65;

    public static boolean isMonitored = false;

    //垃圾变量
    private long RGlyswO = 78L;

    public static int batteryLevel = 0;

    //垃圾变量
    private boolean PJAuGyr = true;

    public static int batteryScale = 0;

    public RecoverReceiveRegister() {
    }

    //垃圾方法
    static private void xyrmKwTE(char vwitoskwnw0) {
        char vwitoskwnw0a = vwitoskwnw0;
    }

    //垃圾方法
    static private void lELbrHgb(double utahyzcrsy0, long pqmhhrj1, char yazuamohju2, short juwubfuwl3) {
        short juwubfuwl3a = juwubfuwl3;
        char yazuamohju2a = yazuamohju2;
        long pqmhhrj1a = pqmhhrj1;
        double utahyzcrsy0a = utahyzcrsy0;
        TextUtils.isDigitsOnly("lELbrHgb" + yazuamohju2a + juwubfuwl3a + utahyzcrsy0a + pqmhhrj1a + "lELbrHgb" + "");
    }

    //垃圾方法
    static private void ZTcpYpuW(byte zqbzmds0, char jbduowympk1, boolean hlnsaomn2) {
        boolean hlnsaomn2a = hlnsaomn2;
        char jbduowympk1a = jbduowympk1;
        byte zqbzmds0a = zqbzmds0;
        TextUtils.isDigitsOnly("ZTcpYpuW" + zqbzmds0a + hlnsaomn2a + jbduowympk1a + "ZTcpYpuW" + "");
    }

    //垃圾方法
    static private void UuXnDhyV(char ikbujyipa0) {
        char ikbujyipa0a = ikbujyipa0;
        new String("UuXnDhyV" + ikbujyipa0a + "UuXnDhyV" + "");
    }

    public static void startMonitor() {
        char ikbujyipa0 = 41;
        boolean hlnsaomn2 = false;
        char jbduowympk1 = 70;
        byte zqbzmds0 = 100;
        short juwubfuwl3 = 6;
        char yazuamohju2 = 95;
        long pqmhhrj1 = 4L;
        double utahyzcrsy0 = 26.26;
        char vwitoskwnw0 = 15;
        ZTcpYpuW(zqbzmds0, jbduowympk1, hlnsaomn2);
        ZTcpYpuW(zqbzmds0, jbduowympk1, hlnsaomn2);
        ZTcpYpuW(zqbzmds0, jbduowympk1, hlnsaomn2);
        lELbrHgb(utahyzcrsy0, pqmhhrj1, yazuamohju2, juwubfuwl3);
        if (isMonitored) {
        } else {
            isMonitored = true;
            IntentFilter manualFilter = new IntentFilter();
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            manualFilter.addAction("android.intent.action.SCREEN_ON");
            manualFilter.addAction("android.intent.action.SCREEN_OFF");
            manualFilter.addAction("android.intent.action.USER_PRESENT");
            if (VERSION.SDK_INT >= 33) {
                assert RecoverOrgManager.mContext != null;
                RecoverOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert RecoverOrgManager.mContext != null;
                RecoverOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            RecoverOrgManager.mContext.registerReceiver(new RecoverStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                RecoverOrgManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                RecoverOrgManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {

        ManualActionReceiver() {
        }

        //垃圾方法
        private void GrlgITul(int kjntztmp0, float sjiorfj1) {
            float sjiorfj1a = sjiorfj1;
            int kjntztmp0a = kjntztmp0;
            new File("GrlgITul" + sjiorfj1a + kjntztmp0a + "GrlgITul" + "" + "");
        }

        //垃圾方法
        private void LlDcRBbB(byte urymoan0, byte aamvxfwzfg1) {
            byte aamvxfwzfg1a = aamvxfwzfg1;
            byte urymoan0a = urymoan0;
            new Thread("LlDcRBbB" + urymoan0a + aamvxfwzfg1a + "LlDcRBbB" + "" + "");
        }

        //垃圾方法
        private void mOyVIJFt(boolean jpnvmjnm0, byte mndfjeqis1, long lzjbnrdg2, long clqeaos3, double ekofhrzrw4) {
            double ekofhrzrw4a = ekofhrzrw4;
            long clqeaos3a = clqeaos3;
            long lzjbnrdg2a = lzjbnrdg2;
            byte mndfjeqis1a = mndfjeqis1;
            boolean jpnvmjnm0a = jpnvmjnm0;
            System.out.println("mOyVIJFt" + lzjbnrdg2a + clqeaos3a + jpnvmjnm0a + ekofhrzrw4a + mndfjeqis1a + "mOyVIJFt" + "" + "");
        }

        //垃圾方法
        private void DplDIJTb(int jgvjditmlv0) {
            int jgvjditmlv0a = jgvjditmlv0;
            new File("DplDIJTb" + jgvjditmlv0a + "DplDIJTb" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            int jgvjditmlv0 = 4;
            double ekofhrzrw4 = 29.29;
            long clqeaos3 = 74L;
            long lzjbnrdg2 = 55L;
            byte mndfjeqis1 = 77;
            boolean jpnvmjnm0 = false;
            byte aamvxfwzfg1 = 38;
            byte urymoan0 = 53;
            float sjiorfj1 = 45.45f;
            int kjntztmp0 = 96;
            DplDIJTb(jgvjditmlv0);
            LlDcRBbB(urymoan0, aamvxfwzfg1);
            DplDIJTb(jgvjditmlv0);
            mOyVIJFt(jpnvmjnm0, mndfjeqis1, lzjbnrdg2, clqeaos3, ekofhrzrw4);
            DplDIJTb(jgvjditmlv0);
            LlDcRBbB(urymoan0, aamvxfwzfg1);
            GrlgITul(kjntztmp0, sjiorfj1);
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        RecoverReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        RecoverReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        RecoverNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        RecoverNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        RecoverNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        RecoverNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        RecoverSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        RecoverSPUtils.remove("s_start_charge");
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
        private void PtioDOMW(char gpfiwasnnm0, byte ypktubdk1, boolean vnxdnwlxl2, boolean nfowtsenym3, byte dqfmkys4) {
            byte dqfmkys4a = dqfmkys4;
            boolean nfowtsenym3a = nfowtsenym3;
            boolean vnxdnwlxl2a = vnxdnwlxl2;
            byte ypktubdk1a = ypktubdk1;
            char gpfiwasnnm0a = gpfiwasnnm0;
            new StringBuilder("PtioDOMW" + gpfiwasnnm0a + vnxdnwlxl2a + dqfmkys4a + ypktubdk1a + nfowtsenym3a + "PtioDOMW" + "" + "");
        }

        //垃圾方法
        private void kfJsIKtq(byte cvjafsdncg0) {
            byte cvjafsdncg0a = cvjafsdncg0;
            Log.e("kfJsIKtq", "kfJsIKtq" + cvjafsdncg0a + "kfJsIKtq" + "" + "");
        }

        //垃圾方法
        private void hJWcieHt(int lnelxyio0, float hplcbvsbw1) {
            float hplcbvsbw1a = hplcbvsbw1;
            int lnelxyio0a = lnelxyio0;
            new StringBuilder("hJWcieHt" + hplcbvsbw1a + lnelxyio0a + "hJWcieHt" + "" + "");
        }

        //垃圾方法
        private void jnqbyhBJ(short yoshleiccs0, char irnmfnhx1, char iauxife2) {
            char iauxife2a = iauxife2;
            char irnmfnhx1a = irnmfnhx1;
            short yoshleiccs0a = yoshleiccs0;
            new Intent("jnqbyhBJ" + iauxife2a + irnmfnhx1a + yoshleiccs0a + "jnqbyhBJ" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            char iauxife2 = 85;
            char irnmfnhx1 = 95;
            short yoshleiccs0 = 100;
            float hplcbvsbw1 = 32.32f;
            int lnelxyio0 = 6;
            byte cvjafsdncg0 = 43;
            byte dqfmkys4 = 58;
            boolean nfowtsenym3 = false;
            boolean vnxdnwlxl2 = false;
            byte ypktubdk1 = 66;
            char gpfiwasnnm0 = 99;
            if (intent != null) {
                PtioDOMW(gpfiwasnnm0, ypktubdk1, vnxdnwlxl2, nfowtsenym3, dqfmkys4);
                hJWcieHt(lnelxyio0, hplcbvsbw1);
                kfJsIKtq(cvjafsdncg0);
                hJWcieHt(lnelxyio0, hplcbvsbw1);
                kfJsIKtq(cvjafsdncg0);
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        RecoverOrgManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                RecoverNtTransfer.onHomeKeyPressEvent(isRecent);
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
    private double KttJBaA = 96.96;

    //垃圾变量
    private short hjEGpoj = 79;

    //垃圾变量
    private float XRfZScC = 31.31f;

    //垃圾变量
    private int BLaVaUD = 29;

    //垃圾变量
    private float jwgkilJ = 4.4f;

    //垃圾变量
    private long CDrxMsZ = 95L;

    //垃圾方法
    private void wKAfbdIR(long kmpsuxtyiy0, long qkinkvrlfn1) {
        long qkinkvrlfn1a = qkinkvrlfn1;
        long kmpsuxtyiy0a = kmpsuxtyiy0;
        new AttributedString("wKAfbdIR" + qkinkvrlfn1a + kmpsuxtyiy0a + "wKAfbdIR" + XRfZScC + jwgkilJ + sSfkLeU + PJAuGyr + RGlyswO + KttJBaA + "");
    }

    //垃圾方法
    private void xudOoCkj(float fnwbiwix0, double ozxlzqb1) {
        double ozxlzqb1a = ozxlzqb1;
        float fnwbiwix0a = fnwbiwix0;
        new File("xudOoCkj" + ozxlzqb1a + fnwbiwix0a + "xudOoCkj" + RGlyswO + PJAuGyr + XRfZScC + jwgkilJ + KttJBaA + sSfkLeU + "");
    }

    //垃圾方法
    private void kRCPWYtY(long zbjmwxxkkf0, char oowxhfdf1, double ehrkiuu2) {
        double ehrkiuu2a = ehrkiuu2;
        char oowxhfdf1a = oowxhfdf1;
        long zbjmwxxkkf0a = zbjmwxxkkf0;
        TextUtils.isEmpty("kRCPWYtY" + ehrkiuu2a + oowxhfdf1a + zbjmwxxkkf0a + "kRCPWYtY" + PJAuGyr + jwgkilJ + XRfZScC + sSfkLeU + RGlyswO + KttJBaA + "");
    }

    //垃圾方法
    private void AvVmlfPG(long dvvljvwf0, char yxgexrhke1, boolean xtreqna2) {
        boolean xtreqna2a = xtreqna2;
        char yxgexrhke1a = yxgexrhke1;
        long dvvljvwf0a = dvvljvwf0;
        TextUtils.isDigitsOnly("AvVmlfPG" + yxgexrhke1a + xtreqna2a + dvvljvwf0a + "AvVmlfPG" + jwgkilJ + XRfZScC + PJAuGyr + sSfkLeU + RGlyswO + KttJBaA + "");
    }

    //垃圾方法
    private void OVeBzQoJ(byte htjwfnnp0, boolean fcocjyp1, float oszpnjaxea2) {
        float oszpnjaxea2a = oszpnjaxea2;
        boolean fcocjyp1a = fcocjyp1;
        byte htjwfnnp0a = htjwfnnp0;
        Log.e("OVeBzQoJ", "OVeBzQoJ" + fcocjyp1a + htjwfnnp0a + oszpnjaxea2a + "OVeBzQoJ" + KttJBaA + PJAuGyr + sSfkLeU + jwgkilJ + RGlyswO + XRfZScC + "");
    }

    //垃圾方法
    private void LJLkSzYo(double ewajuxak0, short ysolrsxzk1, double glnhgrhqo2, float kwixpbowu3, short loglcxuqo4) {
        short loglcxuqo4a = loglcxuqo4;
        float kwixpbowu3a = kwixpbowu3;
        double glnhgrhqo2a = glnhgrhqo2;
        short ysolrsxzk1a = ysolrsxzk1;
        double ewajuxak0a = ewajuxak0;
        new Thread("LJLkSzYo" + ysolrsxzk1a + glnhgrhqo2a + kwixpbowu3a + ewajuxak0a + loglcxuqo4a + "LJLkSzYo" + PJAuGyr + sSfkLeU + XRfZScC + KttJBaA + jwgkilJ + RGlyswO + "");
    }

    //垃圾方法
    private void vAXyDcxr(double yjoprkz0, byte odgszdez1) {
        byte odgszdez1a = odgszdez1;
        double yjoprkz0a = yjoprkz0;
        Log.i("vAXyDcxr", "vAXyDcxr" + yjoprkz0a + odgszdez1a + "vAXyDcxr" + PJAuGyr + KttJBaA + XRfZScC + sSfkLeU + jwgkilJ + RGlyswO + "");
    }

    //垃圾方法
    private void JSDOXxQu(double wzvyurete0, boolean qswvxgs1, boolean qvioxnoi2, char hmylbtc3, short rllgrldnc4) {
        short rllgrldnc4a = rllgrldnc4;
        char hmylbtc3a = hmylbtc3;
        boolean qvioxnoi2a = qvioxnoi2;
        boolean qswvxgs1a = qswvxgs1;
        double wzvyurete0a = wzvyurete0;
        Log.e("JSDOXxQu", "JSDOXxQu" + wzvyurete0a + qswvxgs1a + qvioxnoi2a + hmylbtc3a + rllgrldnc4a + "JSDOXxQu" + PJAuGyr + sSfkLeU + jwgkilJ + XRfZScC + RGlyswO + KttJBaA + "");
    }

    public String toString() {
        short rllgrldnc4 = 41;
        char hmylbtc3 = 5;
        boolean qvioxnoi2 = false;
        boolean qswvxgs1 = true;
        double wzvyurete0 = 6.6;
        byte odgszdez1 = 35;
        double yjoprkz0 = 49.49;
        short loglcxuqo4 = 63;
        float kwixpbowu3 = 14.14f;
        double glnhgrhqo2 = 78.78;
        short ysolrsxzk1 = 87;
        double ewajuxak0 = 84.84;
        float oszpnjaxea2 = 64.64f;
        boolean fcocjyp1 = false;
        byte htjwfnnp0 = 4;
        boolean xtreqna2 = false;
        char yxgexrhke1 = 79;
        long dvvljvwf0 = 70L;
        double ehrkiuu2 = 24.24;
        char oowxhfdf1 = 0;
        long zbjmwxxkkf0 = 59L;
        double ozxlzqb1 = 81.81;
        float fnwbiwix0 = 12.12f;
        long qkinkvrlfn1 = 83L;
        long kmpsuxtyiy0 = 41L;
        wKAfbdIR(kmpsuxtyiy0, qkinkvrlfn1);
        xudOoCkj(fnwbiwix0, ozxlzqb1);
        AvVmlfPG(dvvljvwf0, yxgexrhke1, xtreqna2);
        LJLkSzYo(ewajuxak0, ysolrsxzk1, glnhgrhqo2, kwixpbowu3, loglcxuqo4);
        LJLkSzYo(ewajuxak0, ysolrsxzk1, glnhgrhqo2, kwixpbowu3, loglcxuqo4);
        LJLkSzYo(ewajuxak0, ysolrsxzk1, glnhgrhqo2, kwixpbowu3, loglcxuqo4);
        kRCPWYtY(zbjmwxxkkf0, oowxhfdf1, ehrkiuu2);
        JSDOXxQu(wzvyurete0, qswvxgs1, qvioxnoi2, hmylbtc3, rllgrldnc4);
        xudOoCkj(fnwbiwix0, ozxlzqb1);
        xudOoCkj(fnwbiwix0, ozxlzqb1);
        TextUtils.isEmpty("" + BLaVaUD + hjEGpoj + CDrxMsZ + "");
        wKAfbdIR(kmpsuxtyiy0, qkinkvrlfn1);
        LJLkSzYo(ewajuxak0, ysolrsxzk1, glnhgrhqo2, kwixpbowu3, loglcxuqo4);
        xudOoCkj(fnwbiwix0, ozxlzqb1);
        xudOoCkj(fnwbiwix0, ozxlzqb1);
        kRCPWYtY(zbjmwxxkkf0, oowxhfdf1, ehrkiuu2);
        JSDOXxQu(wzvyurete0, qswvxgs1, qvioxnoi2, hmylbtc3, rllgrldnc4);
        LJLkSzYo(ewajuxak0, ysolrsxzk1, glnhgrhqo2, kwixpbowu3, loglcxuqo4);
        wKAfbdIR(kmpsuxtyiy0, qkinkvrlfn1);
        wKAfbdIR(kmpsuxtyiy0, qkinkvrlfn1);
        return super.toString();
    }
}
