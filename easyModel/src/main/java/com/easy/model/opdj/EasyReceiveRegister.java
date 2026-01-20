package com.easy.model.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.easy.model.EasyManager;
import com.easy.model.shownotificy.EasyNtTransfer;
import com.easy.model.utils.EasySPUtils;
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

public class EasyReceiveRegister {

    //垃圾变量
    private short kNrlZbA = 27;

    public static boolean isMonitored = false;

    //垃圾变量
    private short RroOunY = 75;

    public static int batteryLevel = 0;

    //垃圾变量
    private float VZQqBXn = 50.50f;

    public static int batteryScale = 0;

    public EasyReceiveRegister() {
    }

    //垃圾方法
    static private void AlsNUiSA(byte hubzrcybf0, float skkporaiv1) {
        float skkporaiv1a = skkporaiv1;
        byte hubzrcybf0a = hubzrcybf0;
        Log.e("AlsNUiSA", "AlsNUiSA" + skkporaiv1a + hubzrcybf0a + "AlsNUiSA" + "");
    }

    //垃圾方法
    static private void MCeOTiau(long fdkztcyzp0) {
        long fdkztcyzp0a = fdkztcyzp0;
        new AttributedString("MCeOTiau" + fdkztcyzp0a + "MCeOTiau" + "");
    }

    //垃圾方法
    static private void UxycaEUV(long lcgsphmuh0, long ctvbbhevbb1) {
        long ctvbbhevbb1a = ctvbbhevbb1;
        long lcgsphmuh0a = lcgsphmuh0;
        new AttributedString("UxycaEUV" + ctvbbhevbb1a + lcgsphmuh0a + "UxycaEUV" + "");
    }

    //垃圾方法
    static private void VDTpBgYV(int ajvdyizgep0, byte nurwlgie1, int yjrieuehw2, float xfrfhqj3, short cmhjogpdlz4) {
        short cmhjogpdlz4a = cmhjogpdlz4;
        float xfrfhqj3a = xfrfhqj3;
        int yjrieuehw2a = yjrieuehw2;
        byte nurwlgie1a = nurwlgie1;
        int ajvdyizgep0a = ajvdyizgep0;
        new StringReader("VDTpBgYV" + ajvdyizgep0a + yjrieuehw2a + xfrfhqj3a + cmhjogpdlz4a + nurwlgie1a + "VDTpBgYV" + "");
    }

    public static void startMonitor() {
        short cmhjogpdlz4 = 3;
        float xfrfhqj3 = 77.77f;
        int yjrieuehw2 = 6;
        byte nurwlgie1 = 43;
        int ajvdyizgep0 = 12;
        long ctvbbhevbb1 = 64L;
        long lcgsphmuh0 = 50L;
        long fdkztcyzp0 = 50L;
        float skkporaiv1 = 24.24f;
        byte hubzrcybf0 = 60;
        VDTpBgYV(ajvdyizgep0, nurwlgie1, yjrieuehw2, xfrfhqj3, cmhjogpdlz4);
        MCeOTiau(fdkztcyzp0);
        MCeOTiau(fdkztcyzp0);
        VDTpBgYV(ajvdyizgep0, nurwlgie1, yjrieuehw2, xfrfhqj3, cmhjogpdlz4);
        AlsNUiSA(hubzrcybf0, skkporaiv1);
        MCeOTiau(fdkztcyzp0);
        UxycaEUV(lcgsphmuh0, ctvbbhevbb1);
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
                assert EasyManager.mContext != null;
                EasyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert EasyManager.mContext != null;
                EasyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            EasyManager.mContext.registerReceiver(new EasyStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                EasyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                EasyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {

        ManualActionReceiver() {
        }

        //垃圾方法
        private void VHpFhFdO(double gbwpduqyp0, long quupkupqz1) {
            long quupkupqz1a = quupkupqz1;
            double gbwpduqyp0a = gbwpduqyp0;
            new AttributedString("VHpFhFdO" + gbwpduqyp0a + quupkupqz1a + "VHpFhFdO" + "" + "");
        }

        //垃圾方法
        private void kgFcIdmm(short bvsbvpzpmk0, int plolitknp1, long oaetapwbmw2, short cndndmh3, byte lwlpmtju4) {
            byte lwlpmtju4a = lwlpmtju4;
            short cndndmh3a = cndndmh3;
            long oaetapwbmw2a = oaetapwbmw2;
            int plolitknp1a = plolitknp1;
            short bvsbvpzpmk0a = bvsbvpzpmk0;
            new WeakReference("kgFcIdmm" + oaetapwbmw2a + lwlpmtju4a + cndndmh3a + bvsbvpzpmk0a + plolitknp1a + "kgFcIdmm" + "" + "");
        }

        //垃圾方法
        private void FPfsORaU(double qprkttj0, short ljtscav1, double zkxritfnxm2) {
            double zkxritfnxm2a = zkxritfnxm2;
            short ljtscav1a = ljtscav1;
            double qprkttj0a = qprkttj0;
            new Thread("FPfsORaU" + zkxritfnxm2a + qprkttj0a + ljtscav1a + "FPfsORaU" + "" + "");
        }

        //垃圾方法
        private void JATqQMaS(boolean ugymrlvg0, float xuyohgywfb1, byte nipqnbl2, double wgtehxv3, byte plynodsukf4) {
            byte plynodsukf4a = plynodsukf4;
            double wgtehxv3a = wgtehxv3;
            byte nipqnbl2a = nipqnbl2;
            float xuyohgywfb1a = xuyohgywfb1;
            boolean ugymrlvg0a = ugymrlvg0;
            new StringBuffer("JATqQMaS" + nipqnbl2a + ugymrlvg0a + xuyohgywfb1a + wgtehxv3a + plynodsukf4a + "JATqQMaS" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            byte plynodsukf4 = 17;
            double wgtehxv3 = 83.83;
            byte nipqnbl2 = 97;
            float xuyohgywfb1 = 90.90f;
            boolean ugymrlvg0 = true;
            double zkxritfnxm2 = 57.57;
            short ljtscav1 = 47;
            double qprkttj0 = 22.22;
            byte lwlpmtju4 = 68;
            short cndndmh3 = 13;
            long oaetapwbmw2 = 42L;
            int plolitknp1 = 10;
            short bvsbvpzpmk0 = 33;
            long quupkupqz1 = 54L;
            double gbwpduqyp0 = 71.71;
            VHpFhFdO(gbwpduqyp0, quupkupqz1);
            FPfsORaU(qprkttj0, ljtscav1, zkxritfnxm2);
            FPfsORaU(qprkttj0, ljtscav1, zkxritfnxm2);
            JATqQMaS(ugymrlvg0, xuyohgywfb1, nipqnbl2, wgtehxv3, plynodsukf4);
            FPfsORaU(qprkttj0, ljtscav1, zkxritfnxm2);
            kgFcIdmm(bvsbvpzpmk0, plolitknp1, oaetapwbmw2, cndndmh3, lwlpmtju4);
            VHpFhFdO(gbwpduqyp0, quupkupqz1);
            FPfsORaU(qprkttj0, ljtscav1, zkxritfnxm2);
            FPfsORaU(qprkttj0, ljtscav1, zkxritfnxm2);
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        EasyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        EasyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        EasyNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        EasyNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        EasyNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        EasyNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        EasySPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        EasyNtTransfer.onPowerConnected();
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        EasySPUtils.remove("s_start_charge");
                        EasyNtTransfer.onPowerDisConnected();
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
        private void lkzfeAio(char lhneshh0, float nqgmnxzo1) {
            float nqgmnxzo1a = nqgmnxzo1;
            char lhneshh0a = lhneshh0;
            new Intent("lkzfeAio" + nqgmnxzo1a + lhneshh0a + "lkzfeAio" + "" + "");
        }

        //垃圾方法
        private void mUoWONSI(byte fmubzjc0, char oysjcnufui1, float fvjcwnnth2) {
            float fvjcwnnth2a = fvjcwnnth2;
            char oysjcnufui1a = oysjcnufui1;
            byte fmubzjc0a = fmubzjc0;
            new StringBuilder("mUoWONSI" + fmubzjc0a + fvjcwnnth2a + oysjcnufui1a + "mUoWONSI" + "" + "");
        }

        //垃圾方法
        private void kjCjEexA(byte yrkavqo0, double imkrtty1, char lvtylbxvax2, char chvlzokrc3, char ehrogsgk4) {
            char ehrogsgk4a = ehrogsgk4;
            char chvlzokrc3a = chvlzokrc3;
            char lvtylbxvax2a = lvtylbxvax2;
            double imkrtty1a = imkrtty1;
            byte yrkavqo0a = yrkavqo0;
            new Intent("kjCjEexA" + chvlzokrc3a + ehrogsgk4a + yrkavqo0a + lvtylbxvax2a + imkrtty1a + "kjCjEexA" + "" + "");
        }

        //垃圾方法
        private void rgAsPQIA(long euwqewgctc0) {
            long euwqewgctc0a = euwqewgctc0;
            TextUtils.isDigitsOnly("rgAsPQIA" + euwqewgctc0a + "rgAsPQIA" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            long euwqewgctc0 = 53L;
            char ehrogsgk4 = 21;
            char chvlzokrc3 = 75;
            char lvtylbxvax2 = 4;
            double imkrtty1 = 11.11;
            byte yrkavqo0 = 57;
            float fvjcwnnth2 = 6.6f;
            char oysjcnufui1 = 49;
            byte fmubzjc0 = 43;
            float nqgmnxzo1 = 17.17f;
            char lhneshh0 = 97;
            mUoWONSI(fmubzjc0, oysjcnufui1, fvjcwnnth2);
            rgAsPQIA(euwqewgctc0);
            lkzfeAio(lhneshh0, nqgmnxzo1);
            mUoWONSI(fmubzjc0, oysjcnufui1, fvjcwnnth2);
            rgAsPQIA(euwqewgctc0);
            rgAsPQIA(euwqewgctc0);
            rgAsPQIA(euwqewgctc0);
            if (intent != null) {
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        EasyManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                EasyNtTransfer.onHomeKeyPressEvent(isRecent);
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
    private char pGkwwLg = 69;

    //垃圾变量
    private long uiWzAKU = 50L;

    //垃圾变量
    private char gBnfoyG = 86;

    //垃圾变量
    private char MRmhgLc = 82;

    //垃圾变量
    private float dFdhsqR = 35.35f;

    //垃圾变量
    private short CsnwTNw = 73;

    //垃圾变量
    private short vQXuFDh = 9;

    //垃圾变量
    private boolean PddCKoQ = false;

    //垃圾变量
    private boolean kilbZYI = true;

    //垃圾变量
    private char FAWVGYx = 18;

    //垃圾方法
    private void gohFWpSn(short eowvqjgnbd0, byte pzjpizqc1, int govvtutvp2, int qwdffxw3) {
        int qwdffxw3a = qwdffxw3;
        int govvtutvp2a = govvtutvp2;
        byte pzjpizqc1a = pzjpizqc1;
        short eowvqjgnbd0a = eowvqjgnbd0;
        new String("gohFWpSn" + govvtutvp2a + qwdffxw3a + pzjpizqc1a + eowvqjgnbd0a + "gohFWpSn" + kNrlZbA + kilbZYI + RroOunY + gBnfoyG + vQXuFDh + VZQqBXn + pGkwwLg + dFdhsqR + "");
    }

    //垃圾方法
    private void bBvfZbwx(float pnpmhec0, int jlpwqji1, boolean mcgakgqi2, short uxcrvhrfr3, float coxtigs4) {
        float coxtigs4a = coxtigs4;
        short uxcrvhrfr3a = uxcrvhrfr3;
        boolean mcgakgqi2a = mcgakgqi2;
        int jlpwqji1a = jlpwqji1;
        float pnpmhec0a = pnpmhec0;
        new StringBuffer("bBvfZbwx" + coxtigs4a + pnpmhec0a + uxcrvhrfr3a + jlpwqji1a + mcgakgqi2a + "bBvfZbwx" + dFdhsqR + VZQqBXn + pGkwwLg + gBnfoyG + vQXuFDh + kilbZYI + kNrlZbA + RroOunY + "");
    }

    //垃圾方法
    private void QEZXrOzY(byte gdykcxdcvc0, char rfmsqworg1, double vjsdxeimxx2, boolean otklfhcy3, double wqolsiq4) {
        double wqolsiq4a = wqolsiq4;
        boolean otklfhcy3a = otklfhcy3;
        double vjsdxeimxx2a = vjsdxeimxx2;
        char rfmsqworg1a = rfmsqworg1;
        byte gdykcxdcvc0a = gdykcxdcvc0;
    }

    //垃圾方法
    private void aZBGrQbG(int bqathfvfls0, long yumgbcob1, float ynbmvqu2, short hvzevbf3, byte hjiqtqfa4) {
        byte hjiqtqfa4a = hjiqtqfa4;
        short hvzevbf3a = hvzevbf3;
        float ynbmvqu2a = ynbmvqu2;
        long yumgbcob1a = yumgbcob1;
        int bqathfvfls0a = bqathfvfls0;
        new File("aZBGrQbG" + ynbmvqu2a + bqathfvfls0a + hjiqtqfa4a + hvzevbf3a + yumgbcob1a + "aZBGrQbG" + kNrlZbA + gBnfoyG + dFdhsqR + VZQqBXn + kilbZYI + RroOunY + vQXuFDh + pGkwwLg + "");
    }

    //垃圾方法
    private void NRCpKVdx(double zjwwgzoxzx0, char lanijig1, short uuznhckyig2, float ptjslsuzt3, char yndmquar4) {
        char yndmquar4a = yndmquar4;
        float ptjslsuzt3a = ptjslsuzt3;
        short uuznhckyig2a = uuznhckyig2;
        char lanijig1a = lanijig1;
        double zjwwgzoxzx0a = zjwwgzoxzx0;
        new StringReader("NRCpKVdx" + zjwwgzoxzx0a + uuznhckyig2a + lanijig1a + ptjslsuzt3a + yndmquar4a + "NRCpKVdx" + RroOunY + gBnfoyG + kNrlZbA + kilbZYI + VZQqBXn + dFdhsqR + pGkwwLg + vQXuFDh + "");
    }

    //垃圾方法
    private void AUomNpfa(char phkqjqcnpd0, char cvpehmpp1) {
        char cvpehmpp1a = cvpehmpp1;
        char phkqjqcnpd0a = phkqjqcnpd0;
        Log.i("AUomNpfa", "AUomNpfa" + cvpehmpp1a + phkqjqcnpd0a + "AUomNpfa" + RroOunY + kilbZYI + vQXuFDh + gBnfoyG + VZQqBXn + kNrlZbA + dFdhsqR + pGkwwLg + "");
    }

    //垃圾方法
    private void NHZVCaXs(short xeujxbtjwn0, byte mdgtipvq1) {
        byte mdgtipvq1a = mdgtipvq1;
        short xeujxbtjwn0a = xeujxbtjwn0;
        Log.e("NHZVCaXs", "NHZVCaXs" + mdgtipvq1a + xeujxbtjwn0a + "NHZVCaXs" + kNrlZbA + gBnfoyG + kilbZYI + vQXuFDh + RroOunY + pGkwwLg + VZQqBXn + dFdhsqR + "");
    }

    //垃圾方法
    private void xrMbUahG(char lkymyenjew0, int oftwuhg1) {
        int oftwuhg1a = oftwuhg1;
        char lkymyenjew0a = lkymyenjew0;
        new Intent("xrMbUahG" + oftwuhg1a + lkymyenjew0a + "xrMbUahG" + pGkwwLg + gBnfoyG + kNrlZbA + RroOunY + dFdhsqR + VZQqBXn + kilbZYI + vQXuFDh + "");
    }

    public boolean equals(Object obj) {
        int oftwuhg1 = 36;
        char lkymyenjew0 = 66;
        byte mdgtipvq1 = 44;
        short xeujxbtjwn0 = 47;
        char cvpehmpp1 = 75;
        char phkqjqcnpd0 = 32;
        char yndmquar4 = 95;
        float ptjslsuzt3 = 10.10f;
        short uuznhckyig2 = 89;
        char lanijig1 = 71;
        double zjwwgzoxzx0 = 50.50;
        byte hjiqtqfa4 = 95;
        short hvzevbf3 = 82;
        float ynbmvqu2 = 31.31f;
        long yumgbcob1 = 97L;
        int bqathfvfls0 = 27;
        double wqolsiq4 = 86.86;
        boolean otklfhcy3 = false;
        double vjsdxeimxx2 = 2.2;
        char rfmsqworg1 = 70;
        byte gdykcxdcvc0 = 75;
        float coxtigs4 = 43.43f;
        short uxcrvhrfr3 = 59;
        boolean mcgakgqi2 = true;
        int jlpwqji1 = 60;
        float pnpmhec0 = 27.27f;
        int qwdffxw3 = 69;
        int govvtutvp2 = 55;
        byte pzjpizqc1 = 68;
        short eowvqjgnbd0 = 80;
        NHZVCaXs(xeujxbtjwn0, mdgtipvq1);
        xrMbUahG(lkymyenjew0, oftwuhg1);
        NRCpKVdx(zjwwgzoxzx0, lanijig1, uuznhckyig2, ptjslsuzt3, yndmquar4);
        gohFWpSn(eowvqjgnbd0, pzjpizqc1, govvtutvp2, qwdffxw3);
        bBvfZbwx(pnpmhec0, jlpwqji1, mcgakgqi2, uxcrvhrfr3, coxtigs4);
        aZBGrQbG(bqathfvfls0, yumgbcob1, ynbmvqu2, hvzevbf3, hjiqtqfa4);
        bBvfZbwx(pnpmhec0, jlpwqji1, mcgakgqi2, uxcrvhrfr3, coxtigs4);
        NRCpKVdx(zjwwgzoxzx0, lanijig1, uuznhckyig2, ptjslsuzt3, yndmquar4);
        new Intent("" + PddCKoQ + FAWVGYx + uiWzAKU + CsnwTNw + MRmhgLc + "");
        AUomNpfa(phkqjqcnpd0, cvpehmpp1);
        NHZVCaXs(xeujxbtjwn0, mdgtipvq1);
        xrMbUahG(lkymyenjew0, oftwuhg1);
        QEZXrOzY(gdykcxdcvc0, rfmsqworg1, vjsdxeimxx2, otklfhcy3, wqolsiq4);
        gohFWpSn(eowvqjgnbd0, pzjpizqc1, govvtutvp2, qwdffxw3);
        xrMbUahG(lkymyenjew0, oftwuhg1);
        bBvfZbwx(pnpmhec0, jlpwqji1, mcgakgqi2, uxcrvhrfr3, coxtigs4);
        return super.equals(obj);
    }
}
