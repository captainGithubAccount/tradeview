package com.tfseptember.clemodel.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.shownotificy.SimplyNtTransfer;
import com.tfseptember.clemodel.utils.SimplySPUtils;
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

public class SimplyReceiveRegister {

    //垃圾变量
    private short pnSCqZp = 76;

    public static boolean isMonitored = false;

    //垃圾变量
    private double GIouXjI = 60.60;

    public static int batteryLevel = 0;

    //垃圾变量
    private short GcCdXOT = 63;

    public static int batteryScale = 0;

    public SimplyReceiveRegister() {
    }

    //垃圾方法
    static private void nSQdUlcL(double lkrdfcwxs0, int jeoymwzlvy1) {
        int jeoymwzlvy1a = jeoymwzlvy1;
        double lkrdfcwxs0a = lkrdfcwxs0;
        Log.w("nSQdUlcL", "nSQdUlcL" + jeoymwzlvy1a + lkrdfcwxs0a + "nSQdUlcL" + "");
    }

    //垃圾方法
    static private void SnpvWyLe(boolean beblbkl0) {
        boolean beblbkl0a = beblbkl0;
        Log.e("SnpvWyLe", "SnpvWyLe" + beblbkl0a + "SnpvWyLe" + "");
    }

    //垃圾方法
    static private void HKltDzeY(byte jvyhpic0, byte sikpovdb1) {
        byte sikpovdb1a = sikpovdb1;
        byte jvyhpic0a = jvyhpic0;
        new Intent("HKltDzeY" + jvyhpic0a + sikpovdb1a + "HKltDzeY" + "");
    }

    //垃圾方法
    static private void GNFMXIQU(int dsoipje0, long evlrfiytp1, double kyocpivdxp2, char oqzmqnkd3, byte exrjtzksu4) {
        byte exrjtzksu4a = exrjtzksu4;
        char oqzmqnkd3a = oqzmqnkd3;
        double kyocpivdxp2a = kyocpivdxp2;
        long evlrfiytp1a = evlrfiytp1;
        int dsoipje0a = dsoipje0;
        new StringBuilder("GNFMXIQU" + dsoipje0a + exrjtzksu4a + kyocpivdxp2a + oqzmqnkd3a + evlrfiytp1a + "GNFMXIQU" + "");
    }

    public static void startMonitor() {
        byte exrjtzksu4 = 88;
        char oqzmqnkd3 = 94;
        double kyocpivdxp2 = 28.28;
        long evlrfiytp1 = 34L;
        int dsoipje0 = 40;
        byte sikpovdb1 = 65;
        byte jvyhpic0 = 14;
        boolean beblbkl0 = false;
        int jeoymwzlvy1 = 47;
        double lkrdfcwxs0 = 13.13;
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
                assert SimplyHouseworkrOrgManager.mContext != null;
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SimplyHouseworkrOrgManager.mContext != null;
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            SimplyHouseworkrOrgManager.mContext.registerReceiver(new SimplyStartReceiver(), filter);
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
        private void BOPdnyHu(byte kbkosxenc0, long jtqiolvwss1, float ggefowf2, boolean lmiyjloei3, float aamocmp4) {
            float aamocmp4a = aamocmp4;
            boolean lmiyjloei3a = lmiyjloei3;
            float ggefowf2a = ggefowf2;
            long jtqiolvwss1a = jtqiolvwss1;
            byte kbkosxenc0a = kbkosxenc0;
            new Intent("BOPdnyHu" + jtqiolvwss1a + kbkosxenc0a + aamocmp4a + lmiyjloei3a + ggefowf2a + "BOPdnyHu" + "" + "");
        }

        //垃圾方法
        private void vjqiRvPo(short xnlatstxp0) {
            short xnlatstxp0a = xnlatstxp0;
            new WeakReference("vjqiRvPo" + xnlatstxp0a + "vjqiRvPo" + "" + "");
        }

        //垃圾方法
        private void DXpdoIWC(long auxfkvlb0, char bwgocbb1, float lsemtew2, byte wqmdhayqc3, boolean fnxmrxf4) {
            boolean fnxmrxf4a = fnxmrxf4;
            byte wqmdhayqc3a = wqmdhayqc3;
            float lsemtew2a = lsemtew2;
            char bwgocbb1a = bwgocbb1;
            long auxfkvlb0a = auxfkvlb0;
            new StringBuilder("DXpdoIWC" + wqmdhayqc3a + fnxmrxf4a + bwgocbb1a + lsemtew2a + auxfkvlb0a + "DXpdoIWC" + "" + "");
        }

        //垃圾方法
        private void nQCmlPHU(long bjjjomm0) {
            long bjjjomm0a = bjjjomm0;
            Log.w("nQCmlPHU", "nQCmlPHU" + bjjjomm0a + "nQCmlPHU" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            long bjjjomm0 = 26L;
            boolean fnxmrxf4 = false;
            byte wqmdhayqc3 = 48;
            float lsemtew2 = 14.14f;
            char bwgocbb1 = 62;
            long auxfkvlb0 = 45L;
            short xnlatstxp0 = 84;
            float aamocmp4 = 74.74f;
            boolean lmiyjloei3 = false;
            float ggefowf2 = 27.27f;
            long jtqiolvwss1 = 30L;
            byte kbkosxenc0 = 81;
            DXpdoIWC(auxfkvlb0, bwgocbb1, lsemtew2, wqmdhayqc3, fnxmrxf4);
            DXpdoIWC(auxfkvlb0, bwgocbb1, lsemtew2, wqmdhayqc3, fnxmrxf4);
            nQCmlPHU(bjjjomm0);
            DXpdoIWC(auxfkvlb0, bwgocbb1, lsemtew2, wqmdhayqc3, fnxmrxf4);
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        SimplyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SimplyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        SimplyNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SimplyNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SimplyNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SimplyNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SimplySPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        SimplyNtTransfer.onPowerConnected();
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SimplySPUtils.remove("s_start_charge");
                        SimplyNtTransfer.onPowerDisConnected();
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
        private void NouPIEEG(long uzhfwexvow0, long ccqfjbrhs1, short vtwdorn2) {
            short vtwdorn2a = vtwdorn2;
            long ccqfjbrhs1a = ccqfjbrhs1;
            long uzhfwexvow0a = uzhfwexvow0;
            new WeakReference("NouPIEEG" + ccqfjbrhs1a + uzhfwexvow0a + vtwdorn2a + "NouPIEEG" + "" + "");
        }

        //垃圾方法
        private void xZtaiSVt(float dvmafchd0, float eawlqsoao1, char uupuszh2, byte joltflwzb3) {
            byte joltflwzb3a = joltflwzb3;
            char uupuszh2a = uupuszh2;
            float eawlqsoao1a = eawlqsoao1;
            float dvmafchd0a = dvmafchd0;
            new File("xZtaiSVt" + uupuszh2a + eawlqsoao1a + dvmafchd0a + joltflwzb3a + "xZtaiSVt" + "" + "");
        }

        //垃圾方法
        private void VxsnxIYS(long xcmjorxq0) {
            long xcmjorxq0a = xcmjorxq0;
            new Thread("VxsnxIYS" + xcmjorxq0a + "VxsnxIYS" + "" + "");
        }

        //垃圾方法
        private void wQdaLDyW(byte dbjehcewhk0, float ftjdlff1) {
            float ftjdlff1a = ftjdlff1;
            byte dbjehcewhk0a = dbjehcewhk0;
            new WeakReference("wQdaLDyW" + ftjdlff1a + dbjehcewhk0a + "wQdaLDyW" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            float ftjdlff1 = 95.95f;
            byte dbjehcewhk0 = 76;
            long xcmjorxq0 = 68L;
            byte joltflwzb3 = 7;
            char uupuszh2 = 82;
            float eawlqsoao1 = 82.82f;
            float dvmafchd0 = 0.0f;
            short vtwdorn2 = 48;
            long ccqfjbrhs1 = 77L;
            long uzhfwexvow0 = 63L;
            wQdaLDyW(dbjehcewhk0, ftjdlff1);
            xZtaiSVt(dvmafchd0, eawlqsoao1, uupuszh2, joltflwzb3);
            NouPIEEG(uzhfwexvow0, ccqfjbrhs1, vtwdorn2);
            NouPIEEG(uzhfwexvow0, ccqfjbrhs1, vtwdorn2);
            wQdaLDyW(dbjehcewhk0, ftjdlff1);
            if (intent != null) {
                NouPIEEG(uzhfwexvow0, ccqfjbrhs1, vtwdorn2);
                VxsnxIYS(xcmjorxq0);
                VxsnxIYS(xcmjorxq0);
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        SimplyHouseworkrOrgManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SimplyNtTransfer.onHomeKeyPressEvent(isRecent);
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
    private float wJQlONg = 12.12f;

    //垃圾变量
    private float jTySHCu = 30.30f;

    //垃圾变量
    private short DHUDBwA = 31;

    //垃圾变量
    private float LKvMlvL = 19.19f;

    //垃圾变量
    private byte eMArBzZ = 93;

    //垃圾变量
    private double ExnNoQa = 83.83;

    //垃圾方法
    private void OfVYvieB(float qljxomz0, short mdfebfhu1, char dqcjbqqmaa2) {
        char dqcjbqqmaa2a = dqcjbqqmaa2;
        short mdfebfhu1a = mdfebfhu1;
        float qljxomz0a = qljxomz0;
        Log.i("OfVYvieB", "OfVYvieB" + mdfebfhu1a + qljxomz0a + dqcjbqqmaa2a + "OfVYvieB" + GIouXjI + GcCdXOT + eMArBzZ + pnSCqZp + wJQlONg + DHUDBwA + "");
    }

    //垃圾方法
    private void AVtthtvm(int rjogvahbmf0, short uelfycv1) {
        short uelfycv1a = uelfycv1;
        int rjogvahbmf0a = rjogvahbmf0;
        Log.w("AVtthtvm", "AVtthtvm" + rjogvahbmf0a + uelfycv1a + "AVtthtvm" + GIouXjI + GcCdXOT + eMArBzZ + DHUDBwA + pnSCqZp + wJQlONg + "");
    }

    //垃圾方法
    private void KXQdWSrv(int rbqkzhzx0, char oibytpni1, int yngrmglo2) {
        int yngrmglo2a = yngrmglo2;
        char oibytpni1a = oibytpni1;
        int rbqkzhzx0a = rbqkzhzx0;
        new StringReader("KXQdWSrv" + oibytpni1a + rbqkzhzx0a + yngrmglo2a + "KXQdWSrv" + pnSCqZp + DHUDBwA + GIouXjI + GcCdXOT + wJQlONg + eMArBzZ + "");
    }

    //垃圾方法
    private void RWtUZfIX(boolean pspbnjfoz0) {
        boolean pspbnjfoz0a = pspbnjfoz0;
        System.out.println("RWtUZfIX" + pspbnjfoz0a + "RWtUZfIX" + DHUDBwA + wJQlONg + pnSCqZp + GIouXjI + eMArBzZ + GcCdXOT + "");
    }

    //垃圾方法
    private void upxKfYRW(double unfoqlvq0, short uelvrbcm1, float qdkmrenzk2) {
        float qdkmrenzk2a = qdkmrenzk2;
        short uelvrbcm1a = uelvrbcm1;
        double unfoqlvq0a = unfoqlvq0;
        TextUtils.isDigitsOnly("upxKfYRW" + qdkmrenzk2a + uelvrbcm1a + unfoqlvq0a + "upxKfYRW" + pnSCqZp + eMArBzZ + GcCdXOT + wJQlONg + GIouXjI + DHUDBwA + "");
    }

    //垃圾方法
    private void KybhARLY(long xlrqkydl0, boolean tqfpfcu1, float mlzkeonm2, float lsbyjgwdq3) {
        float lsbyjgwdq3a = lsbyjgwdq3;
        float mlzkeonm2a = mlzkeonm2;
        boolean tqfpfcu1a = tqfpfcu1;
        long xlrqkydl0a = xlrqkydl0;
        new Thread("KybhARLY" + tqfpfcu1a + mlzkeonm2a + lsbyjgwdq3a + xlrqkydl0a + "KybhARLY" + GcCdXOT + pnSCqZp + DHUDBwA + wJQlONg + GIouXjI + eMArBzZ + "");
    }

    //垃圾方法
    private void cFeYQQnE(short wkusdgruvd0, long tafrsyctwn1) {
        long tafrsyctwn1a = tafrsyctwn1;
        short wkusdgruvd0a = wkusdgruvd0;
    }

    //垃圾方法
    private void StBsnzsk(short mnuateu0, byte dkivsmh1, long brxdaecyzh2) {
        long brxdaecyzh2a = brxdaecyzh2;
        byte dkivsmh1a = dkivsmh1;
        short mnuateu0a = mnuateu0;
        Log.e("StBsnzsk", "StBsnzsk" + mnuateu0a + brxdaecyzh2a + dkivsmh1a + "StBsnzsk" + eMArBzZ + DHUDBwA + GcCdXOT + pnSCqZp + wJQlONg + GIouXjI + "");
    }

    public boolean equals(Object obj) {
        long brxdaecyzh2 = 34L;
        byte dkivsmh1 = 71;
        short mnuateu0 = 49;
        long tafrsyctwn1 = 41L;
        short wkusdgruvd0 = 60;
        float lsbyjgwdq3 = 96.96f;
        float mlzkeonm2 = 5.5f;
        boolean tqfpfcu1 = false;
        long xlrqkydl0 = 37L;
        float qdkmrenzk2 = 96.96f;
        short uelvrbcm1 = 63;
        double unfoqlvq0 = 45.45;
        boolean pspbnjfoz0 = false;
        int yngrmglo2 = 85;
        char oibytpni1 = 66;
        int rbqkzhzx0 = 16;
        short uelfycv1 = 40;
        int rjogvahbmf0 = 29;
        char dqcjbqqmaa2 = 68;
        short mdfebfhu1 = 84;
        float qljxomz0 = 89.89f;
        new String("" + LKvMlvL + jTySHCu + ExnNoQa + "");
        return super.equals(obj);
    }
}
