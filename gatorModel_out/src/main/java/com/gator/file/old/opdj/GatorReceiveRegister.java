package com.gator.file.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.gator.file.old.GatorManager;
import com.gator.file.old.shownotificy.GatorNtTransfer;
import com.gator.file.old.use.GatorNotiTimesHelper;
import com.gator.file.old.utils.GatorSPUtils;
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

public class GatorReceiveRegister {

    //垃圾变量
    private boolean eLibztO = true;

    public static boolean isMonitored = false;

    //垃圾变量
    private int DuGCovd = 43;

    public static int batteryLevel = 0;

    //垃圾变量
    private byte mnNOqpk = 77;

    public static int batteryScale = 0;

    public GatorReceiveRegister() {
    }

    //垃圾方法
    static private void UPMNQBCI(char tjmakhiakz0, boolean ymimimoc1) {
        boolean ymimimoc1a = ymimimoc1;
        char tjmakhiakz0a = tjmakhiakz0;
        new StringReader("UPMNQBCI" + tjmakhiakz0a + ymimimoc1a + "UPMNQBCI" + "");
    }

    //垃圾方法
    static private void fYzLhdlQ(short hrxfhry0) {
        short hrxfhry0a = hrxfhry0;
        new StringReader("fYzLhdlQ" + hrxfhry0a + "fYzLhdlQ" + "");
    }

    //垃圾方法
    static private void DhTDjNYi(short hgafajwctx0, byte irszodfpn1, double hqyoxjxkhn2, char ytahysdo3) {
        char ytahysdo3a = ytahysdo3;
        double hqyoxjxkhn2a = hqyoxjxkhn2;
        byte irszodfpn1a = irszodfpn1;
        short hgafajwctx0a = hgafajwctx0;
        new StringReader("DhTDjNYi" + irszodfpn1a + hqyoxjxkhn2a + ytahysdo3a + hgafajwctx0a + "DhTDjNYi" + "");
    }

    //垃圾方法
    static private void XrKbDqwq(char rcdxbtroxz0, int tojnabcaa1) {
        int tojnabcaa1a = tojnabcaa1;
        char rcdxbtroxz0a = rcdxbtroxz0;
        System.out.println("XrKbDqwq" + tojnabcaa1a + rcdxbtroxz0a + "XrKbDqwq" + "");
    }

    public static void startMonitor() {
        int tojnabcaa1 = 85;
        char rcdxbtroxz0 = 47;
        char ytahysdo3 = 40;
        double hqyoxjxkhn2 = 48.48;
        byte irszodfpn1 = 62;
        short hgafajwctx0 = 33;
        short hrxfhry0 = 85;
        boolean ymimimoc1 = false;
        char tjmakhiakz0 = 41;
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
                assert GatorManager.mContext != null;
                GatorManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert GatorManager.mContext != null;
                GatorManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            GatorManager.mContext.registerReceiver(new GatorStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                GatorManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                GatorManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {

        ManualActionReceiver() {
        }

        //垃圾方法
        private void lDiASFJN(byte xxnlmel0, float dujvwzepmi1) {
            float dujvwzepmi1a = dujvwzepmi1;
            byte xxnlmel0a = xxnlmel0;
            System.out.println("lDiASFJN" + xxnlmel0a + dujvwzepmi1a + "lDiASFJN" + "" + "");
        }

        //垃圾方法
        private void VNaHHyWk(char lgdobtmtzu0, double pavnbajo1, float aumutuu2, byte wpbmpmijkp3) {
            byte wpbmpmijkp3a = wpbmpmijkp3;
            float aumutuu2a = aumutuu2;
            double pavnbajo1a = pavnbajo1;
            char lgdobtmtzu0a = lgdobtmtzu0;
            TextUtils.isEmpty("VNaHHyWk" + lgdobtmtzu0a + wpbmpmijkp3a + pavnbajo1a + aumutuu2a + "VNaHHyWk" + "" + "");
        }

        //垃圾方法
        private void vqAUpSbM(short zzkicbtc0, char ahdvxtcoqs1, float cdfeznyplr2, float gnqlquge3) {
            float gnqlquge3a = gnqlquge3;
            float cdfeznyplr2a = cdfeznyplr2;
            char ahdvxtcoqs1a = ahdvxtcoqs1;
            short zzkicbtc0a = zzkicbtc0;
            new StringBuilder("vqAUpSbM" + gnqlquge3a + ahdvxtcoqs1a + cdfeznyplr2a + zzkicbtc0a + "vqAUpSbM" + "" + "");
        }

        //垃圾方法
        private void PsxEDYJH(float wzsczadhb0, double sfudyhgxgs1, long exxyhsnni2) {
            long exxyhsnni2a = exxyhsnni2;
            double sfudyhgxgs1a = sfudyhgxgs1;
            float wzsczadhb0a = wzsczadhb0;
            Log.e("PsxEDYJH", "PsxEDYJH" + sfudyhgxgs1a + exxyhsnni2a + wzsczadhb0a + "PsxEDYJH" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            long exxyhsnni2 = 96L;
            double sfudyhgxgs1 = 97.97;
            float wzsczadhb0 = 41.41f;
            float gnqlquge3 = 33.33f;
            float cdfeznyplr2 = 89.89f;
            char ahdvxtcoqs1 = 25;
            short zzkicbtc0 = 30;
            byte wpbmpmijkp3 = 31;
            float aumutuu2 = 47.47f;
            double pavnbajo1 = 50.50;
            char lgdobtmtzu0 = 37;
            float dujvwzepmi1 = 92.92f;
            byte xxnlmel0 = 84;
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        GatorReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        GatorReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent < 20) {
                            GatorNtTransfer.onBatteryChangeEvent(GatorNotiTimesHelper.Event.BATTERY_LOW);
                        } else {
                            GatorNtTransfer.onBatteryChangeEvent(GatorNotiTimesHelper.Event.NONE);
                        }
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        GatorNtTransfer.onScreenOnEvent(GatorNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        GatorNtTransfer.onScreenLockOnEvent(GatorNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        GatorNtTransfer.onScreenOffEvent(GatorNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        GatorSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        GatorReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        GatorReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent < 75) {
                            GatorNtTransfer.onPowerConnected(GatorNotiTimesHelper.Event.POWER_CHARGE);
                        } else {
                            GatorNtTransfer.onPowerConnected(GatorNotiTimesHelper.Event.NONE);
                        }
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        GatorSPUtils.remove("s_start_charge");
                        GatorReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        GatorReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent > 95) {
                            GatorNtTransfer.onPowerDisConnected(GatorNotiTimesHelper.Event.POWER_DISCHARGE);
                        } else {
                            GatorNtTransfer.onPowerDisConnected(GatorNotiTimesHelper.Event.NONE);
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
        private void fdhvmACJ(short grlxqgsj0, int ptreojyxq1, long knrkmzslq2) {
            long knrkmzslq2a = knrkmzslq2;
            int ptreojyxq1a = ptreojyxq1;
            short grlxqgsj0a = grlxqgsj0;
            new StringBuilder("fdhvmACJ" + ptreojyxq1a + grlxqgsj0a + knrkmzslq2a + "fdhvmACJ" + "" + "");
        }

        //垃圾方法
        private void MoFPgvcT(byte hrxyxhn0) {
            byte hrxyxhn0a = hrxyxhn0;
        }

        //垃圾方法
        private void kyazphZC(byte ovnshlqaja0, short ywfthxqktj1) {
            short ywfthxqktj1a = ywfthxqktj1;
            byte ovnshlqaja0a = ovnshlqaja0;
            TextUtils.isEmpty("kyazphZC" + ovnshlqaja0a + ywfthxqktj1a + "kyazphZC" + "" + "");
        }

        //垃圾方法
        private void RWfHOkHv(int vulrvbu0, byte xpwyumu1, float zbkfcgvx2) {
            float zbkfcgvx2a = zbkfcgvx2;
            byte xpwyumu1a = xpwyumu1;
            int vulrvbu0a = vulrvbu0;
            new StringBuilder("RWfHOkHv" + vulrvbu0a + xpwyumu1a + zbkfcgvx2a + "RWfHOkHv" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            float zbkfcgvx2 = 15.15f;
            byte xpwyumu1 = 64;
            int vulrvbu0 = 86;
            short ywfthxqktj1 = 56;
            byte ovnshlqaja0 = 44;
            byte hrxyxhn0 = 63;
            long knrkmzslq2 = 48L;
            int ptreojyxq1 = 13;
            short grlxqgsj0 = 40;
            fdhvmACJ(grlxqgsj0, ptreojyxq1, knrkmzslq2);
            fdhvmACJ(grlxqgsj0, ptreojyxq1, knrkmzslq2);
            MoFPgvcT(hrxyxhn0);
            kyazphZC(ovnshlqaja0, ywfthxqktj1);
            fdhvmACJ(grlxqgsj0, ptreojyxq1, knrkmzslq2);
            if (intent != null) {
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        GatorManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                GatorNtTransfer.onHomeKeyPressEvent(isRecent, GatorNotiTimesHelper.Event.HOME_CLICK);
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
    private long qWoVhvv = 29L;

    //垃圾变量
    private short YcDFnos = 78;

    //垃圾变量
    private short SWeHSEp = 96;

    //垃圾变量
    private byte QyzmauE = 82;

    //垃圾方法
    private void ccOiOydl(char kclyrvqu0, boolean mqzzbzgl1) {
        boolean mqzzbzgl1a = mqzzbzgl1;
        char kclyrvqu0a = kclyrvqu0;
        TextUtils.isEmpty("ccOiOydl" + kclyrvqu0a + mqzzbzgl1a + "ccOiOydl" + DuGCovd + eLibztO + mnNOqpk + qWoVhvv + SWeHSEp + "");
    }

    //垃圾方法
    private void oFtBfEpz(short gugzcosezj0, double xjyqmsxepl1, int shkiqikb2, int hmonjau3) {
        int hmonjau3a = hmonjau3;
        int shkiqikb2a = shkiqikb2;
        double xjyqmsxepl1a = xjyqmsxepl1;
        short gugzcosezj0a = gugzcosezj0;
        TextUtils.isDigitsOnly("oFtBfEpz" + shkiqikb2a + xjyqmsxepl1a + hmonjau3a + gugzcosezj0a + "oFtBfEpz" + qWoVhvv + SWeHSEp + DuGCovd + mnNOqpk + eLibztO + "");
    }

    //垃圾方法
    private void PfNFKYtW(boolean epqjniz0, int svzhqhhy1, float ppszyivkgo2, float bksyirica3) {
        float bksyirica3a = bksyirica3;
        float ppszyivkgo2a = ppszyivkgo2;
        int svzhqhhy1a = svzhqhhy1;
        boolean epqjniz0a = epqjniz0;
        new Thread("PfNFKYtW" + bksyirica3a + epqjniz0a + ppszyivkgo2a + svzhqhhy1a + "PfNFKYtW" + SWeHSEp + mnNOqpk + eLibztO + DuGCovd + qWoVhvv + "");
    }

    //垃圾方法
    private void SBpFoSVU(short udlayule0, boolean uqtizsc1, char ntnamsegv2, byte sreybwx3) {
        byte sreybwx3a = sreybwx3;
        char ntnamsegv2a = ntnamsegv2;
        boolean uqtizsc1a = uqtizsc1;
        short udlayule0a = udlayule0;
        new File("SBpFoSVU" + ntnamsegv2a + udlayule0a + sreybwx3a + uqtizsc1a + "SBpFoSVU" + eLibztO + DuGCovd + SWeHSEp + qWoVhvv + mnNOqpk + "");
    }

    //垃圾方法
    private void LEdNUBMV(float esysdlp0, float ixjiflvmr1) {
        float ixjiflvmr1a = ixjiflvmr1;
        float esysdlp0a = esysdlp0;
        new Intent("LEdNUBMV" + esysdlp0a + ixjiflvmr1a + "LEdNUBMV" + eLibztO + mnNOqpk + qWoVhvv + DuGCovd + SWeHSEp + "");
    }

    //垃圾方法
    private void nbZvlmEV(byte fhsesvdyxj0, boolean ticefmie1) {
        boolean ticefmie1a = ticefmie1;
        byte fhsesvdyxj0a = fhsesvdyxj0;
        TextUtils.isDigitsOnly("nbZvlmEV" + ticefmie1a + fhsesvdyxj0a + "nbZvlmEV" + mnNOqpk + qWoVhvv + SWeHSEp + DuGCovd + eLibztO + "");
    }

    //垃圾方法
    private void shPtlYKu(byte jfcrzgc0, byte ilxvofpum1, int pmxnmbbj2, char xlwxmstwkz3) {
        char xlwxmstwkz3a = xlwxmstwkz3;
        int pmxnmbbj2a = pmxnmbbj2;
        byte ilxvofpum1a = ilxvofpum1;
        byte jfcrzgc0a = jfcrzgc0;
        new StringBuffer("shPtlYKu" + ilxvofpum1a + xlwxmstwkz3a + jfcrzgc0a + pmxnmbbj2a + "shPtlYKu" + DuGCovd + qWoVhvv + eLibztO + mnNOqpk + SWeHSEp + "");
    }

    //垃圾方法
    private void JsYDBXWj(char codpiwbcot0, char sxdyjufdq1, short ohtkwuse2, char grkvbvyv3, float mhelodmnyc4) {
        float mhelodmnyc4a = mhelodmnyc4;
        char grkvbvyv3a = grkvbvyv3;
        short ohtkwuse2a = ohtkwuse2;
        char sxdyjufdq1a = sxdyjufdq1;
        char codpiwbcot0a = codpiwbcot0;
        new WeakReference("JsYDBXWj" + ohtkwuse2a + mhelodmnyc4a + codpiwbcot0a + sxdyjufdq1a + grkvbvyv3a + "JsYDBXWj" + SWeHSEp + mnNOqpk + DuGCovd + eLibztO + qWoVhvv + "");
    }

    public String toString() {
        float mhelodmnyc4 = 3.3f;
        char grkvbvyv3 = 79;
        short ohtkwuse2 = 90;
        char sxdyjufdq1 = 21;
        char codpiwbcot0 = 67;
        char xlwxmstwkz3 = 72;
        int pmxnmbbj2 = 65;
        byte ilxvofpum1 = 80;
        byte jfcrzgc0 = 48;
        boolean ticefmie1 = false;
        byte fhsesvdyxj0 = 22;
        float ixjiflvmr1 = 25.25f;
        float esysdlp0 = 36.36f;
        byte sreybwx3 = 82;
        char ntnamsegv2 = 8;
        boolean uqtizsc1 = true;
        short udlayule0 = 6;
        float bksyirica3 = 87.87f;
        float ppszyivkgo2 = 44.44f;
        int svzhqhhy1 = 87;
        boolean epqjniz0 = false;
        int hmonjau3 = 78;
        int shkiqikb2 = 94;
        double xjyqmsxepl1 = 61.61;
        short gugzcosezj0 = 1;
        boolean mqzzbzgl1 = true;
        char kclyrvqu0 = 43;
        TextUtils.isEmpty("" + QyzmauE + YcDFnos + "");
        LEdNUBMV(esysdlp0, ixjiflvmr1);
        JsYDBXWj(codpiwbcot0, sxdyjufdq1, ohtkwuse2, grkvbvyv3, mhelodmnyc4);
        oFtBfEpz(gugzcosezj0, xjyqmsxepl1, shkiqikb2, hmonjau3);
        SBpFoSVU(udlayule0, uqtizsc1, ntnamsegv2, sreybwx3);
        return super.toString();
    }
}
