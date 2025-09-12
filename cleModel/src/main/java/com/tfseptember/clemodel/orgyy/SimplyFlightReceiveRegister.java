package com.tfseptember.clemodel.orgyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.shownotificy.SimplyLoudqNtTransfer;
import com.tfseptember.clemodel.utils.SimplyFloorSPUtils;
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

public class SimplyFlightReceiveRegister {

    //垃圾变量
    private short pFRrTyt = 85;

    public static boolean isMonitored = false;

    //垃圾变量
    private int soGAUfP = 32;

    public static int batteryLevel = 0;

    //垃圾变量
    private byte tqAostf = 24;

    public static int batteryScale = 0;

    public SimplyFlightReceiveRegister() {
    }

    //垃圾方法
    static private void Mdabfftw(float bsldrnsaup0, boolean ihcvkaczsr1, short sihtbeh2, double zuljlrpmj3) {
        double zuljlrpmj3a = zuljlrpmj3;
        short sihtbeh2a = sihtbeh2;
        boolean ihcvkaczsr1a = ihcvkaczsr1;
        float bsldrnsaup0a = bsldrnsaup0;
        new AttributedString("Mdabfftw" + zuljlrpmj3a + bsldrnsaup0a + sihtbeh2a + ihcvkaczsr1a + "Mdabfftw" + "");
    }

    //垃圾方法
    static private void bpEIdHGo(boolean uxalqqucr0, boolean vdfiodn1, short ruzkdmhd2) {
        short ruzkdmhd2a = ruzkdmhd2;
        boolean vdfiodn1a = vdfiodn1;
        boolean uxalqqucr0a = uxalqqucr0;
        System.out.println("bpEIdHGo" + uxalqqucr0a + ruzkdmhd2a + vdfiodn1a + "bpEIdHGo" + "");
    }

    //垃圾方法
    static private void AkAmeLjx(float sobefbzqaf0) {
        float sobefbzqaf0a = sobefbzqaf0;
        System.out.println("AkAmeLjx" + sobefbzqaf0a + "AkAmeLjx" + "");
    }

    //垃圾方法
    static private void wwFiipru(byte dgdwsxo0, long mhbgavtr1, float astsdzf2) {
        float astsdzf2a = astsdzf2;
        long mhbgavtr1a = mhbgavtr1;
        byte dgdwsxo0a = dgdwsxo0;
        new Thread("wwFiipru" + dgdwsxo0a + mhbgavtr1a + astsdzf2a + "wwFiipru" + "");
    }

    public static void startMonitor() {
        float astsdzf2 = 27.27f;
        long mhbgavtr1 = 2L;
        byte dgdwsxo0 = 15;
        float sobefbzqaf0 = 56.56f;
        short ruzkdmhd2 = 95;
        boolean vdfiodn1 = false;
        boolean uxalqqucr0 = true;
        double zuljlrpmj3 = 52.52;
        short sihtbeh2 = 59;
        boolean ihcvkaczsr1 = false;
        float bsldrnsaup0 = 29.29f;
        if (isMonitored) {
        } else {
            isMonitored = true;
            IntentFilter manualFilter = new IntentFilter();
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            manualFilter.addAction("android.intent.action.SCREEN_ON");
            manualFilter.addAction("android.intent.action.SCREEN_OFF");
            manualFilter.addAction("android.intent.action.USER_PRESENT");
            if (VERSION.SDK_INT >= 33) {
                assert SimplyHouseworkrOrgManager.mContext != null;
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SimplyHouseworkrOrgManager.mContext != null;
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            SimplyHouseworkrOrgManager.mContext.registerReceiver(new SimplyLoudStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {

        ManualActionReceiver() {
        }

        //垃圾方法
        private void VwuifVJR(boolean ckbnnkvpl0, double mpyriyear1, double kwlyjycsl2, double wctkbiur3, int cwjxdtotw4) {
            int cwjxdtotw4a = cwjxdtotw4;
            double wctkbiur3a = wctkbiur3;
            double kwlyjycsl2a = kwlyjycsl2;
            double mpyriyear1a = mpyriyear1;
            boolean ckbnnkvpl0a = ckbnnkvpl0;
        }

        //垃圾方法
        private void vNgEnAXF(float owsuzrggvg0, float shubdaua1, short ngcgaakvu2) {
            short ngcgaakvu2a = ngcgaakvu2;
            float shubdaua1a = shubdaua1;
            float owsuzrggvg0a = owsuzrggvg0;
            new String("vNgEnAXF" + ngcgaakvu2a + owsuzrggvg0a + shubdaua1a + "vNgEnAXF" + "" + "");
        }

        //垃圾方法
        private void QBaDvrPq(double smrtyazu0) {
            double smrtyazu0a = smrtyazu0;
            Log.i("QBaDvrPq", "QBaDvrPq" + smrtyazu0a + "QBaDvrPq" + "" + "");
        }

        //垃圾方法
        private void PCzjmuJV(float dlrcajdr0, short cprodyolf1, long ophgqawb2) {
            long ophgqawb2a = ophgqawb2;
            short cprodyolf1a = cprodyolf1;
            float dlrcajdr0a = dlrcajdr0;
            new String("PCzjmuJV" + cprodyolf1a + ophgqawb2a + dlrcajdr0a + "PCzjmuJV" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            long ophgqawb2 = 7L;
            short cprodyolf1 = 55;
            float dlrcajdr0 = 28.28f;
            double smrtyazu0 = 34.34;
            short ngcgaakvu2 = 12;
            float shubdaua1 = 11.11f;
            float owsuzrggvg0 = 14.14f;
            int cwjxdtotw4 = 96;
            double wctkbiur3 = 40.40;
            double kwlyjycsl2 = 89.89;
            double mpyriyear1 = 57.57;
            boolean ckbnnkvpl0 = true;
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        SimplyFlightReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SimplyFlightReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        SimplyLoudqNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SimplyLoudqNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SimplyLoudqNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SimplyLoudqNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SimplyFloorSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SimplyFloorSPUtils.remove("s_start_charge");
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
        private void EQFWDhES(byte sqvsunkn0, byte wcuphmkq1, double pmctufux2, short orptxsdi3) {
            short orptxsdi3a = orptxsdi3;
            double pmctufux2a = pmctufux2;
            byte wcuphmkq1a = wcuphmkq1;
            byte sqvsunkn0a = sqvsunkn0;
            new StringBuilder("EQFWDhES" + pmctufux2a + orptxsdi3a + wcuphmkq1a + sqvsunkn0a + "EQFWDhES" + "" + "");
        }

        //垃圾方法
        private void OyEoZVrX(float kzhofufjgb0, short jphvsipp1, double qxrzgvjqd2, byte cpgakvqw3, byte btwhuhnpp4) {
            byte btwhuhnpp4a = btwhuhnpp4;
            byte cpgakvqw3a = cpgakvqw3;
            double qxrzgvjqd2a = qxrzgvjqd2;
            short jphvsipp1a = jphvsipp1;
            float kzhofufjgb0a = kzhofufjgb0;
            new Intent("OyEoZVrX" + qxrzgvjqd2a + btwhuhnpp4a + cpgakvqw3a + kzhofufjgb0a + jphvsipp1a + "OyEoZVrX" + "" + "");
        }

        //垃圾方法
        private void YcgrONGO(double oztfxmbude0, short ertzsszx1, double okdekxk2, byte wtukxnqs3, double qtcfiqp4) {
            double qtcfiqp4a = qtcfiqp4;
            byte wtukxnqs3a = wtukxnqs3;
            double okdekxk2a = okdekxk2;
            short ertzsszx1a = ertzsszx1;
            double oztfxmbude0a = oztfxmbude0;
            new File("YcgrONGO" + qtcfiqp4a + oztfxmbude0a + wtukxnqs3a + okdekxk2a + ertzsszx1a + "YcgrONGO" + "" + "");
        }

        //垃圾方法
        private void VhAysECE(short bvbeopvfhg0, short cvrncpexsp1, short xmxndxnzi2, char fslofae3) {
            char fslofae3a = fslofae3;
            short xmxndxnzi2a = xmxndxnzi2;
            short cvrncpexsp1a = cvrncpexsp1;
            short bvbeopvfhg0a = bvbeopvfhg0;
            new File("VhAysECE" + fslofae3a + cvrncpexsp1a + bvbeopvfhg0a + xmxndxnzi2a + "VhAysECE" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            char fslofae3 = 40;
            short xmxndxnzi2 = 15;
            short cvrncpexsp1 = 84;
            short bvbeopvfhg0 = 70;
            double qtcfiqp4 = 88.88;
            byte wtukxnqs3 = 3;
            double okdekxk2 = 94.94;
            short ertzsszx1 = 61;
            double oztfxmbude0 = 68.68;
            byte btwhuhnpp4 = 30;
            byte cpgakvqw3 = 76;
            double qxrzgvjqd2 = 13.13;
            short jphvsipp1 = 2;
            float kzhofufjgb0 = 30.30f;
            short orptxsdi3 = 96;
            double pmctufux2 = 99.99;
            byte wcuphmkq1 = 5;
            byte sqvsunkn0 = 22;
            if (intent != null) {
                EQFWDhES(sqvsunkn0, wcuphmkq1, pmctufux2, orptxsdi3);
                EQFWDhES(sqvsunkn0, wcuphmkq1, pmctufux2, orptxsdi3);
                EQFWDhES(sqvsunkn0, wcuphmkq1, pmctufux2, orptxsdi3);
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        SimplyHouseworkrOrgManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SimplyLoudqNtTransfer.onHomeKeyPressEvent(isRecent);
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
    private short pGnBrgg = 96;

    //垃圾变量
    private boolean StKMCfY = false;

    //垃圾变量
    private float ZDYAzcY = 92.92f;

    //垃圾变量
    private float sWAZpDU = 9.9f;

    //垃圾变量
    private double CyDNkvt = 65.65;

    //垃圾变量
    private long LzaHwPz = 26L;

    //垃圾变量
    private char TEzPffA = 66;

    //垃圾变量
    private double cLzGeea = 27.27;

    //垃圾方法
    private void TeWUvnzI(boolean noxxfek0, long zcrcrmvb1, long srvjkumcjg2) {
        long srvjkumcjg2a = srvjkumcjg2;
        long zcrcrmvb1a = zcrcrmvb1;
        boolean noxxfek0a = noxxfek0;
        TextUtils.isEmpty("TeWUvnzI" + srvjkumcjg2a + noxxfek0a + zcrcrmvb1a + "TeWUvnzI" + ZDYAzcY + TEzPffA + pGnBrgg + CyDNkvt + tqAostf + soGAUfP + pFRrTyt + "");
    }

    //垃圾方法
    private void TXCAXatb(char nxsavodiiw0, byte luexnhcur1) {
        byte luexnhcur1a = luexnhcur1;
        char nxsavodiiw0a = nxsavodiiw0;
        Log.i("TXCAXatb", "TXCAXatb" + nxsavodiiw0a + luexnhcur1a + "TXCAXatb" + TEzPffA + tqAostf + CyDNkvt + soGAUfP + pFRrTyt + pGnBrgg + ZDYAzcY + "");
    }

    //垃圾方法
    private void uPGRayej(float fsrjhuawoe0) {
        float fsrjhuawoe0a = fsrjhuawoe0;
        Log.w("uPGRayej", "uPGRayej" + fsrjhuawoe0a + "uPGRayej" + CyDNkvt + tqAostf + ZDYAzcY + TEzPffA + pFRrTyt + pGnBrgg + soGAUfP + "");
    }

    //垃圾方法
    private void KbFIqmBW(boolean xevacwy0, byte fuetutobg1) {
        byte fuetutobg1a = fuetutobg1;
        boolean xevacwy0a = xevacwy0;
        Log.w("KbFIqmBW", "KbFIqmBW" + xevacwy0a + fuetutobg1a + "KbFIqmBW" + ZDYAzcY + TEzPffA + CyDNkvt + soGAUfP + pFRrTyt + tqAostf + pGnBrgg + "");
    }

    //垃圾方法
    private void kEtRieFv(boolean vagsakzo0, char dehqbkakfw1, char vsetrzb2, int pmgdvzyj3) {
        int pmgdvzyj3a = pmgdvzyj3;
        char vsetrzb2a = vsetrzb2;
        char dehqbkakfw1a = dehqbkakfw1;
        boolean vagsakzo0a = vagsakzo0;
        TextUtils.isDigitsOnly("kEtRieFv" + vagsakzo0a + dehqbkakfw1a + vsetrzb2a + pmgdvzyj3a + "kEtRieFv" + ZDYAzcY + CyDNkvt + pFRrTyt + tqAostf + TEzPffA + soGAUfP + pGnBrgg + "");
    }

    //垃圾方法
    private void FCfMUkwp(boolean ujzbiyxux0, char rqhzzef1, byte nbuoyiaqw2, boolean ylvsiwt3) {
        boolean ylvsiwt3a = ylvsiwt3;
        byte nbuoyiaqw2a = nbuoyiaqw2;
        char rqhzzef1a = rqhzzef1;
        boolean ujzbiyxux0a = ujzbiyxux0;
        new Thread("FCfMUkwp" + ujzbiyxux0a + rqhzzef1a + nbuoyiaqw2a + ylvsiwt3a + "FCfMUkwp" + pFRrTyt + pGnBrgg + ZDYAzcY + soGAUfP + TEzPffA + tqAostf + CyDNkvt + "");
    }

    //垃圾方法
    private void xFFnODYR(short doqusfe0, long fpjmevcxqz1, long upxklfu2) {
        long upxklfu2a = upxklfu2;
        long fpjmevcxqz1a = fpjmevcxqz1;
        short doqusfe0a = doqusfe0;
        new StringBuilder("xFFnODYR" + fpjmevcxqz1a + upxklfu2a + doqusfe0a + "xFFnODYR" + pFRrTyt + soGAUfP + CyDNkvt + TEzPffA + pGnBrgg + tqAostf + ZDYAzcY + "");
    }

    //垃圾方法
    private void CAyXlkZp(boolean sxruseq0, boolean jxcejqm1, short fshwbmuvc2, int hpzojsx3, double snaicca4) {
        double snaicca4a = snaicca4;
        int hpzojsx3a = hpzojsx3;
        short fshwbmuvc2a = fshwbmuvc2;
        boolean jxcejqm1a = jxcejqm1;
        boolean sxruseq0a = sxruseq0;
        new StringBuilder("CAyXlkZp" + jxcejqm1a + sxruseq0a + fshwbmuvc2a + snaicca4a + hpzojsx3a + "CAyXlkZp" + soGAUfP + pGnBrgg + ZDYAzcY + tqAostf + TEzPffA + CyDNkvt + pFRrTyt + "");
    }

    public boolean equals(Object obj) {
        double snaicca4 = 91.91;
        int hpzojsx3 = 12;
        short fshwbmuvc2 = 83;
        boolean jxcejqm1 = true;
        boolean sxruseq0 = true;
        long upxklfu2 = 3L;
        long fpjmevcxqz1 = 3L;
        short doqusfe0 = 92;
        boolean ylvsiwt3 = true;
        byte nbuoyiaqw2 = 44;
        char rqhzzef1 = 22;
        boolean ujzbiyxux0 = false;
        int pmgdvzyj3 = 2;
        char vsetrzb2 = 76;
        char dehqbkakfw1 = 20;
        boolean vagsakzo0 = false;
        byte fuetutobg1 = 9;
        boolean xevacwy0 = false;
        float fsrjhuawoe0 = 50.50f;
        byte luexnhcur1 = 31;
        char nxsavodiiw0 = 15;
        long srvjkumcjg2 = 54L;
        long zcrcrmvb1 = 57L;
        boolean noxxfek0 = true;
        FCfMUkwp(ujzbiyxux0, rqhzzef1, nbuoyiaqw2, ylvsiwt3);
        xFFnODYR(doqusfe0, fpjmevcxqz1, upxklfu2);
        KbFIqmBW(xevacwy0, fuetutobg1);
        xFFnODYR(doqusfe0, fpjmevcxqz1, upxklfu2);
        FCfMUkwp(ujzbiyxux0, rqhzzef1, nbuoyiaqw2, ylvsiwt3);
        xFFnODYR(doqusfe0, fpjmevcxqz1, upxklfu2);
        KbFIqmBW(xevacwy0, fuetutobg1);
        KbFIqmBW(xevacwy0, fuetutobg1);
        FCfMUkwp(ujzbiyxux0, rqhzzef1, nbuoyiaqw2, ylvsiwt3);
        TeWUvnzI(noxxfek0, zcrcrmvb1, srvjkumcjg2);
        TextUtils.isEmpty("" + cLzGeea + sWAZpDU + LzaHwPz + StKMCfY + "");
        return super.equals(obj);
    }
}
