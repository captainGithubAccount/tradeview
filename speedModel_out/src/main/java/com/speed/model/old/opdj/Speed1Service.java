package com.speed.model.old.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.speed.IProcessServiceSpeed;
import com.speed.model.old.SpeedManager;
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

public class Speed1Service extends Service {

    //垃圾变量
    private int xyagGzM = 20;

    public static long lastTime = 0L;

    //垃圾变量
    private float tHiPLHy = 28.28f;

    private static String TAG = "xxx";

    //垃圾变量
    private float XIuFOgA = 82.82f;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private char lenBEWb = 64;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private double pMUgBZN = 71.71;

    public static Boolean isLiving = false;

    //垃圾变量
    private boolean pYQsMai = false;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private byte bjJBWMO = 66;

    private static long delayTime = 250L;

    //垃圾变量
    private short klgIwtK = 47;

    public static boolean isStartService = false;

    //垃圾变量
    private boolean DnktNZS = true;

    private IBinder subBinder = null;

    //垃圾变量
    private float SfaOYxE = 94.94f;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private short PiuoWaD = 12;

    int nextNum = -1;

    public Speed1Service() {
    }

    //垃圾方法
    static private void bJrVZDUc(byte bpmtqqv0) {
        byte bpmtqqv0a = bpmtqqv0;
        Log.i("bJrVZDUc", "bJrVZDUc" + bpmtqqv0a + "bJrVZDUc" + "");
    }

    //垃圾方法
    static private void NEdYVkLT(boolean vtckoygprl0, double bhqdhgfp1, boolean fhvtarc2, boolean gwlmhdlmd3, int wbquxwvd4) {
        int wbquxwvd4a = wbquxwvd4;
        boolean gwlmhdlmd3a = gwlmhdlmd3;
        boolean fhvtarc2a = fhvtarc2;
        double bhqdhgfp1a = bhqdhgfp1;
        boolean vtckoygprl0a = vtckoygprl0;
        Log.w("NEdYVkLT", "NEdYVkLT" + fhvtarc2a + bhqdhgfp1a + wbquxwvd4a + gwlmhdlmd3a + vtckoygprl0a + "NEdYVkLT" + "");
    }

    //垃圾方法
    static private void gYhUITJr(long dxgpscciik0) {
        long dxgpscciik0a = dxgpscciik0;
        new AttributedString("gYhUITJr" + dxgpscciik0a + "gYhUITJr" + "");
    }

    //垃圾方法
    static private void AQaxLkOD(short cafvxzdo0) {
        short cafvxzdo0a = cafvxzdo0;
        Log.w("AQaxLkOD", "AQaxLkOD" + cafvxzdo0a + "AQaxLkOD" + "");
    }

    public static void tryStartLaunchMainService() {
        short cafvxzdo0 = 63;
        long dxgpscciik0 = 1L;
        int wbquxwvd4 = 69;
        boolean gwlmhdlmd3 = false;
        boolean fhvtarc2 = true;
        double bhqdhgfp1 = 99.99;
        boolean vtckoygprl0 = true;
        byte bpmtqqv0 = 84;
        NEdYVkLT(vtckoygprl0, bhqdhgfp1, fhvtarc2, gwlmhdlmd3, wbquxwvd4);
        AQaxLkOD(cafvxzdo0);
        bJrVZDUc(bpmtqqv0);
        gYhUITJr(dxgpscciik0);
        gYhUITJr(dxgpscciik0);
        bJrVZDUc(bpmtqqv0);
        AQaxLkOD(cafvxzdo0);
        gYhUITJr(dxgpscciik0);
        bJrVZDUc(bpmtqqv0);
        if (isLiving) {
            bJrVZDUc(bpmtqqv0);
            bJrVZDUc(bpmtqqv0);
            gYhUITJr(dxgpscciik0);
            AQaxLkOD(cafvxzdo0);
            if (SpeedManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (SpeedManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(SpeedManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void sTpbihoc(float eaopcdrro0, double epedgdhoq1, double icjvssmgwb2, short rqrrzocjd3, double mznzwzh4) {
        double mznzwzh4a = mznzwzh4;
        short rqrrzocjd3a = rqrrzocjd3;
        double icjvssmgwb2a = icjvssmgwb2;
        double epedgdhoq1a = epedgdhoq1;
        float eaopcdrro0a = eaopcdrro0;
        new Thread("sTpbihoc" + epedgdhoq1a + eaopcdrro0a + icjvssmgwb2a + rqrrzocjd3a + mznzwzh4a + "sTpbihoc" + "");
    }

    //垃圾方法
    static private void oayxRUDH(int ctaklsnjy0) {
        int ctaklsnjy0a = ctaklsnjy0;
        new StringBuilder("oayxRUDH" + ctaklsnjy0a + "oayxRUDH" + "");
    }

    //垃圾方法
    static private void QOdogEGT(long fddaatnsve0, byte ooudsprx1, double vjwpfopocv2, short blwizzawf3, boolean dgetjthtxw4) {
        boolean dgetjthtxw4a = dgetjthtxw4;
        short blwizzawf3a = blwizzawf3;
        double vjwpfopocv2a = vjwpfopocv2;
        byte ooudsprx1a = ooudsprx1;
        long fddaatnsve0a = fddaatnsve0;
        TextUtils.isDigitsOnly("QOdogEGT" + vjwpfopocv2a + ooudsprx1a + blwizzawf3a + fddaatnsve0a + dgetjthtxw4a + "QOdogEGT" + "");
    }

    //垃圾方法
    static private void VUkFiiZq(long rjfnolu0, long xxvuuevo1, boolean qzdubtrqdb2, double qprarmrwc3) {
        double qprarmrwc3a = qprarmrwc3;
        boolean qzdubtrqdb2a = qzdubtrqdb2;
        long xxvuuevo1a = xxvuuevo1;
        long rjfnolu0a = rjfnolu0;
        TextUtils.isDigitsOnly("VUkFiiZq" + xxvuuevo1a + qzdubtrqdb2a + rjfnolu0a + qprarmrwc3a + "VUkFiiZq" + "");
    }

    //垃圾方法
    static private void OLiVGrYO(long hvjwqsh0, float vznwqwgfg1, float gzlbcish2, boolean mvgqtgnk3, float mdqwvznlxk4) {
        float mdqwvznlxk4a = mdqwvznlxk4;
        boolean mvgqtgnk3a = mvgqtgnk3;
        float gzlbcish2a = gzlbcish2;
        float vznwqwgfg1a = vznwqwgfg1;
        long hvjwqsh0a = hvjwqsh0;
        new WeakReference("OLiVGrYO" + mvgqtgnk3a + mdqwvznlxk4a + hvjwqsh0a + vznwqwgfg1a + gzlbcish2a + "OLiVGrYO" + "");
    }

    //垃圾方法
    static private void DCybyiNU(double rpbbcgeca0, byte otrekdjhce1) {
        byte otrekdjhce1a = otrekdjhce1;
        double rpbbcgeca0a = rpbbcgeca0;
        System.out.println("DCybyiNU" + otrekdjhce1a + rpbbcgeca0a + "DCybyiNU" + "");
    }

    //垃圾方法
    static private void PNbaHKzw(double tbvyzttdoz0, byte abcxmyxmj1, char qqgkzmh2) {
        char qqgkzmh2a = qqgkzmh2;
        byte abcxmyxmj1a = abcxmyxmj1;
        double tbvyzttdoz0a = tbvyzttdoz0;
        TextUtils.isDigitsOnly("PNbaHKzw" + qqgkzmh2a + abcxmyxmj1a + tbvyzttdoz0a + "PNbaHKzw" + "");
    }

    //垃圾方法
    static private void uTnCYVgW(char zgqrfrm0, short hpybeiwqgw1, char lsvxkfkjki2, short hrdcxgszpl3, double uerdozpq4) {
        double uerdozpq4a = uerdozpq4;
        short hrdcxgszpl3a = hrdcxgszpl3;
        char lsvxkfkjki2a = lsvxkfkjki2;
        short hpybeiwqgw1a = hpybeiwqgw1;
        char zgqrfrm0a = zgqrfrm0;
        new File("uTnCYVgW" + zgqrfrm0a + lsvxkfkjki2a + hrdcxgszpl3a + hpybeiwqgw1a + uerdozpq4a + "uTnCYVgW" + "");
    }

    private static void startService(Context context) {
        double uerdozpq4 = 89.89;
        short hrdcxgszpl3 = 38;
        char lsvxkfkjki2 = 54;
        short hpybeiwqgw1 = 96;
        char zgqrfrm0 = 10;
        char qqgkzmh2 = 91;
        byte abcxmyxmj1 = 83;
        double tbvyzttdoz0 = 27.27;
        byte otrekdjhce1 = 86;
        double rpbbcgeca0 = 57.57;
        float mdqwvznlxk4 = 14.14f;
        boolean mvgqtgnk3 = true;
        float gzlbcish2 = 46.46f;
        float vznwqwgfg1 = 32.32f;
        long hvjwqsh0 = 41L;
        double qprarmrwc3 = 99.99;
        boolean qzdubtrqdb2 = false;
        long xxvuuevo1 = 64L;
        long rjfnolu0 = 61L;
        boolean dgetjthtxw4 = false;
        short blwizzawf3 = 97;
        double vjwpfopocv2 = 87.87;
        byte ooudsprx1 = 38;
        long fddaatnsve0 = 54L;
        int ctaklsnjy0 = 89;
        double mznzwzh4 = 9.9;
        short rqrrzocjd3 = 65;
        double icjvssmgwb2 = 57.57;
        double epedgdhoq1 = 1.1;
        float eaopcdrro0 = 2.2f;
        if (SpeedManager.isDebug) {
            sTpbihoc(eaopcdrro0, epedgdhoq1, icjvssmgwb2, rqrrzocjd3, mznzwzh4);
            DCybyiNU(rpbbcgeca0, otrekdjhce1);
            OLiVGrYO(hvjwqsh0, vznwqwgfg1, gzlbcish2, mvgqtgnk3, mdqwvznlxk4);
            sTpbihoc(eaopcdrro0, epedgdhoq1, icjvssmgwb2, rqrrzocjd3, mznzwzh4);
            VUkFiiZq(rjfnolu0, xxvuuevo1, qzdubtrqdb2, qprarmrwc3);
            QOdogEGT(fddaatnsve0, ooudsprx1, vjwpfopocv2, blwizzawf3, dgetjthtxw4);
            uTnCYVgW(zgqrfrm0, hpybeiwqgw1, lsvxkfkjki2, hrdcxgszpl3, uerdozpq4);
            OLiVGrYO(hvjwqsh0, vznwqwgfg1, gzlbcish2, mvgqtgnk3, mdqwvznlxk4);
            Log.i(TAG, "LocalService startService5");
        }
        OLiVGrYO(hvjwqsh0, vznwqwgfg1, gzlbcish2, mvgqtgnk3, mdqwvznlxk4);
        uTnCYVgW(zgqrfrm0, hpybeiwqgw1, lsvxkfkjki2, hrdcxgszpl3, uerdozpq4);
        uTnCYVgW(zgqrfrm0, hpybeiwqgw1, lsvxkfkjki2, hrdcxgszpl3, uerdozpq4);
        VUkFiiZq(rjfnolu0, xxvuuevo1, qzdubtrqdb2, qprarmrwc3);
        sTpbihoc(eaopcdrro0, epedgdhoq1, icjvssmgwb2, rqrrzocjd3, mznzwzh4);
        DCybyiNU(rpbbcgeca0, otrekdjhce1);
        oayxRUDH(ctaklsnjy0);
        VUkFiiZq(rjfnolu0, xxvuuevo1, qzdubtrqdb2, qprarmrwc3);
        OLiVGrYO(hvjwqsh0, vznwqwgfg1, gzlbcish2, mvgqtgnk3, mdqwvznlxk4);
        OLiVGrYO(hvjwqsh0, vznwqwgfg1, gzlbcish2, mvgqtgnk3, mdqwvznlxk4);
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void dqxqUsou(short oqujrawuao0, double yesoqttbqu1, float harfqtyg2, short olxsiqogz3) {
        short olxsiqogz3a = olxsiqogz3;
        float harfqtyg2a = harfqtyg2;
        double yesoqttbqu1a = yesoqttbqu1;
        short oqujrawuao0a = oqujrawuao0;
        Log.i("dqxqUsou", "dqxqUsou" + olxsiqogz3a + harfqtyg2a + yesoqttbqu1a + oqujrawuao0a + "dqxqUsou" + bjJBWMO + tHiPLHy + xyagGzM + PiuoWaD + XIuFOgA + NlWZXvh + lenBEWb + SfaOYxE + DnktNZS + BKRktQy + pMUgBZN + pYQsMai + klgIwtK + "");
    }

    //垃圾方法
    private void HBMOGcak(char qxvhagnwkw0, int txtinyoxu1, float zlzlcmahuy2, byte uzqetsbkfg3) {
        byte uzqetsbkfg3a = uzqetsbkfg3;
        float zlzlcmahuy2a = zlzlcmahuy2;
        int txtinyoxu1a = txtinyoxu1;
        char qxvhagnwkw0a = qxvhagnwkw0;
        new StringBuffer("HBMOGcak" + txtinyoxu1a + uzqetsbkfg3a + qxvhagnwkw0a + zlzlcmahuy2a + "HBMOGcak" + pMUgBZN + xyagGzM + bjJBWMO + SfaOYxE + XIuFOgA + PiuoWaD + lenBEWb + NlWZXvh + klgIwtK + tHiPLHy + BKRktQy + DnktNZS + pYQsMai + "");
    }

    //垃圾方法
    private void dXIwzdMl(float gvhhsrj0, short lznajlbewp1, int fhreuimkk2, long ptqpdsecu3, char ppqfvfj4) {
        char ppqfvfj4a = ppqfvfj4;
        long ptqpdsecu3a = ptqpdsecu3;
        int fhreuimkk2a = fhreuimkk2;
        short lznajlbewp1a = lznajlbewp1;
        float gvhhsrj0a = gvhhsrj0;
        new StringBuilder("dXIwzdMl" + lznajlbewp1a + gvhhsrj0a + ptqpdsecu3a + fhreuimkk2a + ppqfvfj4a + "dXIwzdMl" + XIuFOgA + xyagGzM + bjJBWMO + PiuoWaD + klgIwtK + NlWZXvh + BKRktQy + DnktNZS + pYQsMai + tHiPLHy + pMUgBZN + SfaOYxE + lenBEWb + "");
    }

    //垃圾方法
    private void mObjLqzs(double teudxcqxk0, boolean gnyabkjczs1) {
        boolean gnyabkjczs1a = gnyabkjczs1;
        double teudxcqxk0a = teudxcqxk0;
        new WeakReference("mObjLqzs" + gnyabkjczs1a + teudxcqxk0a + "mObjLqzs" + tHiPLHy + pYQsMai + lenBEWb + bjJBWMO + PiuoWaD + NlWZXvh + pMUgBZN + SfaOYxE + xyagGzM + XIuFOgA + BKRktQy + klgIwtK + DnktNZS + "");
    }

    //垃圾方法
    private void nzATVstn(int sihretx0) {
        int sihretx0a = sihretx0;
        Log.w("nzATVstn", "nzATVstn" + sihretx0a + "nzATVstn" + PiuoWaD + pYQsMai + BKRktQy + XIuFOgA + klgIwtK + bjJBWMO + DnktNZS + NlWZXvh + lenBEWb + pMUgBZN + xyagGzM + SfaOYxE + tHiPLHy + "");
    }

    //垃圾方法
    private void zZAvyFpz(byte tqfqebyaow0, double ffkrcxni1, boolean whcwnrxp2) {
        boolean whcwnrxp2a = whcwnrxp2;
        double ffkrcxni1a = ffkrcxni1;
        byte tqfqebyaow0a = tqfqebyaow0;
        Log.i("zZAvyFpz", "zZAvyFpz" + tqfqebyaow0a + ffkrcxni1a + whcwnrxp2a + "zZAvyFpz" + NlWZXvh + klgIwtK + BKRktQy + pYQsMai + XIuFOgA + DnktNZS + SfaOYxE + tHiPLHy + bjJBWMO + lenBEWb + xyagGzM + pMUgBZN + PiuoWaD + "");
    }

    //垃圾方法
    private void DdLLwTWF(char dvcxxfgwf0, float jnfnodniuk1, double iwafjuj2, boolean kxxgpvi3, int qrnzovudys4) {
        int qrnzovudys4a = qrnzovudys4;
        boolean kxxgpvi3a = kxxgpvi3;
        double iwafjuj2a = iwafjuj2;
        float jnfnodniuk1a = jnfnodniuk1;
        char dvcxxfgwf0a = dvcxxfgwf0;
        Log.e("DdLLwTWF", "DdLLwTWF" + iwafjuj2a + kxxgpvi3a + jnfnodniuk1a + dvcxxfgwf0a + qrnzovudys4a + "DdLLwTWF" + klgIwtK + bjJBWMO + pYQsMai + xyagGzM + pMUgBZN + lenBEWb + SfaOYxE + DnktNZS + BKRktQy + PiuoWaD + XIuFOgA + NlWZXvh + tHiPLHy + "");
    }

    //垃圾方法
    private void UqkZOnLt(double cbhrtwmih0, double hnahmodzg1, float oncfpyosy2) {
        float oncfpyosy2a = oncfpyosy2;
        double hnahmodzg1a = hnahmodzg1;
        double cbhrtwmih0a = cbhrtwmih0;
        new StringBuilder("UqkZOnLt" + cbhrtwmih0a + oncfpyosy2a + hnahmodzg1a + "UqkZOnLt" + pMUgBZN + NlWZXvh + klgIwtK + pYQsMai + bjJBWMO + xyagGzM + XIuFOgA + lenBEWb + SfaOYxE + PiuoWaD + tHiPLHy + DnktNZS + BKRktQy + "");
    }

    //垃圾方法
    private void QLZzmfEz(short vonroifg0, byte qxnrncxh1, float ifhundz2, short kwiwvcts3) {
        short kwiwvcts3a = kwiwvcts3;
        float ifhundz2a = ifhundz2;
        byte qxnrncxh1a = qxnrncxh1;
        short vonroifg0a = vonroifg0;
        Log.i("QLZzmfEz", "QLZzmfEz" + vonroifg0a + ifhundz2a + qxnrncxh1a + kwiwvcts3a + "QLZzmfEz" + xyagGzM + NlWZXvh + PiuoWaD + tHiPLHy + XIuFOgA + SfaOYxE + bjJBWMO + pMUgBZN + DnktNZS + klgIwtK + BKRktQy + pYQsMai + lenBEWb + "");
    }

    //垃圾方法
    private void KTikBOFj(char kawjbwp0, int puxejaoqcd1, boolean popsgajy2, byte vmlzpduo3) {
        byte vmlzpduo3a = vmlzpduo3;
        boolean popsgajy2a = popsgajy2;
        int puxejaoqcd1a = puxejaoqcd1;
        char kawjbwp0a = kawjbwp0;
        new Thread("KTikBOFj" + puxejaoqcd1a + kawjbwp0a + popsgajy2a + vmlzpduo3a + "KTikBOFj" + XIuFOgA + pYQsMai + klgIwtK + SfaOYxE + xyagGzM + PiuoWaD + DnktNZS + tHiPLHy + BKRktQy + bjJBWMO + pMUgBZN + lenBEWb + NlWZXvh + "");
    }

    //垃圾方法
    private void caWzwqic(char uzsptkbbes0, byte urtklpcg1, char cspgvit2, short rmqblazi3, char stqvpmro4) {
        char stqvpmro4a = stqvpmro4;
        short rmqblazi3a = rmqblazi3;
        char cspgvit2a = cspgvit2;
        byte urtklpcg1a = urtklpcg1;
        char uzsptkbbes0a = uzsptkbbes0;
        Log.e("caWzwqic", "caWzwqic" + stqvpmro4a + rmqblazi3a + cspgvit2a + uzsptkbbes0a + urtklpcg1a + "caWzwqic" + XIuFOgA + xyagGzM + pYQsMai + BKRktQy + pMUgBZN + bjJBWMO + klgIwtK + DnktNZS + NlWZXvh + tHiPLHy + SfaOYxE + lenBEWb + PiuoWaD + "");
    }

    //垃圾方法
    private void yUfzVkMU(boolean gkppugiqog0, byte klopdmzzm1) {
        byte klopdmzzm1a = klopdmzzm1;
        boolean gkppugiqog0a = gkppugiqog0;
        new String("yUfzVkMU" + gkppugiqog0a + klopdmzzm1a + "yUfzVkMU" + XIuFOgA + pMUgBZN + lenBEWb + PiuoWaD + NlWZXvh + BKRktQy + DnktNZS + SfaOYxE + tHiPLHy + pYQsMai + xyagGzM + klgIwtK + bjJBWMO + "");
    }

    //垃圾方法
    private void bHCznsGu(boolean lzoijdt0) {
        boolean lzoijdt0a = lzoijdt0;
        Log.i("bHCznsGu", "bHCznsGu" + lzoijdt0a + "bHCznsGu" + pYQsMai + pMUgBZN + BKRktQy + NlWZXvh + XIuFOgA + lenBEWb + klgIwtK + DnktNZS + xyagGzM + SfaOYxE + bjJBWMO + tHiPLHy + PiuoWaD + "");
    }

    //垃圾方法
    private void VfmqpBVM(int snmaykzbe0, double gmioqzus1) {
        double gmioqzus1a = gmioqzus1;
        int snmaykzbe0a = snmaykzbe0;
        new StringBuilder("VfmqpBVM" + snmaykzbe0a + gmioqzus1a + "VfmqpBVM" + pYQsMai + pMUgBZN + bjJBWMO + klgIwtK + DnktNZS + lenBEWb + NlWZXvh + SfaOYxE + BKRktQy + tHiPLHy + PiuoWaD + XIuFOgA + xyagGzM + "");
    }

    //垃圾方法
    private void ViNwfaUl(char vuyiisydid0, long wtjzxqwdeb1) {
        long wtjzxqwdeb1a = wtjzxqwdeb1;
        char vuyiisydid0a = vuyiisydid0;
        new WeakReference("ViNwfaUl" + vuyiisydid0a + wtjzxqwdeb1a + "ViNwfaUl" + xyagGzM + BKRktQy + DnktNZS + XIuFOgA + tHiPLHy + lenBEWb + SfaOYxE + NlWZXvh + klgIwtK + pYQsMai + PiuoWaD + pMUgBZN + bjJBWMO + "");
    }

    //垃圾方法
    private void kJmYfyIF(float wwfmordhek0, long kcuzjzyb1, short hlelwffca2, double ffpvamsjue3, short jpqykspt4) {
        short jpqykspt4a = jpqykspt4;
        double ffpvamsjue3a = ffpvamsjue3;
        short hlelwffca2a = hlelwffca2;
        long kcuzjzyb1a = kcuzjzyb1;
        float wwfmordhek0a = wwfmordhek0;
        Log.w("kJmYfyIF", "kJmYfyIF" + kcuzjzyb1a + wwfmordhek0a + hlelwffca2a + ffpvamsjue3a + jpqykspt4a + "kJmYfyIF" + klgIwtK + pYQsMai + PiuoWaD + lenBEWb + BKRktQy + xyagGzM + DnktNZS + XIuFOgA + bjJBWMO + NlWZXvh + SfaOYxE + tHiPLHy + pMUgBZN + "");
    }

    //垃圾方法
    private void uTyBWvPE(boolean hdwdxzsl0, boolean pgptnek1, double jmdxvdsdig2) {
        double jmdxvdsdig2a = jmdxvdsdig2;
        boolean pgptnek1a = pgptnek1;
        boolean hdwdxzsl0a = hdwdxzsl0;
        System.out.println("uTyBWvPE" + hdwdxzsl0a + jmdxvdsdig2a + pgptnek1a + "uTyBWvPE" + bjJBWMO + NlWZXvh + pMUgBZN + tHiPLHy + PiuoWaD + SfaOYxE + DnktNZS + lenBEWb + xyagGzM + klgIwtK + XIuFOgA + BKRktQy + pYQsMai + "");
    }

    //垃圾方法
    private void JHRvmlzq(byte gdqamuexdr0, char sdplsor1, short waoprueg2) {
        short waoprueg2a = waoprueg2;
        char sdplsor1a = sdplsor1;
        byte gdqamuexdr0a = gdqamuexdr0;
        new Intent("JHRvmlzq" + gdqamuexdr0a + sdplsor1a + waoprueg2a + "JHRvmlzq" + xyagGzM + pYQsMai + PiuoWaD + NlWZXvh + bjJBWMO + klgIwtK + tHiPLHy + lenBEWb + DnktNZS + BKRktQy + pMUgBZN + SfaOYxE + XIuFOgA + "");
    }

    //垃圾方法
    private void qaWUaCmg(double rkaxzneocu0, char vleylgbnnv1, byte zhaiizgn2, int jnbkokuhj3) {
        int jnbkokuhj3a = jnbkokuhj3;
        byte zhaiizgn2a = zhaiizgn2;
        char vleylgbnnv1a = vleylgbnnv1;
        double rkaxzneocu0a = rkaxzneocu0;
    }

    //垃圾方法
    private void HQWRRacy(int mjyljqith0, int llvpiyr1, char nioncez2, double ncntkndby3) {
        double ncntkndby3a = ncntkndby3;
        char nioncez2a = nioncez2;
        int llvpiyr1a = llvpiyr1;
        int mjyljqith0a = mjyljqith0;
        new Intent("HQWRRacy" + mjyljqith0a + nioncez2a + ncntkndby3a + llvpiyr1a + "HQWRRacy" + tHiPLHy + lenBEWb + pYQsMai + XIuFOgA + DnktNZS + NlWZXvh + bjJBWMO + SfaOYxE + PiuoWaD + klgIwtK + pMUgBZN + BKRktQy + xyagGzM + "");
    }

    //垃圾方法
    private void QRUKWAPk(float njlrfosx0, char encbiusst1, long daqhdxb2, byte cvjhofmn3) {
        byte cvjhofmn3a = cvjhofmn3;
        long daqhdxb2a = daqhdxb2;
        char encbiusst1a = encbiusst1;
        float njlrfosx0a = njlrfosx0;
        TextUtils.isEmpty("QRUKWAPk" + cvjhofmn3a + njlrfosx0a + encbiusst1a + daqhdxb2a + "QRUKWAPk" + PiuoWaD + DnktNZS + pYQsMai + lenBEWb + tHiPLHy + klgIwtK + xyagGzM + bjJBWMO + NlWZXvh + BKRktQy + pMUgBZN + XIuFOgA + SfaOYxE + "");
    }

    //垃圾方法
    private void yGbZQzkW(byte uhizjszw0, short rndjtmyy1, char khefqbsf2, short njjcfhrim3, double ynirydrd4) {
        double ynirydrd4a = ynirydrd4;
        short njjcfhrim3a = njjcfhrim3;
        char khefqbsf2a = khefqbsf2;
        short rndjtmyy1a = rndjtmyy1;
        byte uhizjszw0a = uhizjszw0;
        new StringBuffer("yGbZQzkW" + uhizjszw0a + khefqbsf2a + ynirydrd4a + njjcfhrim3a + rndjtmyy1a + "yGbZQzkW" + BKRktQy + pYQsMai + SfaOYxE + PiuoWaD + lenBEWb + klgIwtK + tHiPLHy + XIuFOgA + bjJBWMO + pMUgBZN + xyagGzM + NlWZXvh + DnktNZS + "");
    }

    //垃圾方法
    private void CvPdEhZM(int rkclhuz0, double yancqqsxtl1) {
        double yancqqsxtl1a = yancqqsxtl1;
        int rkclhuz0a = rkclhuz0;
        new Intent("CvPdEhZM" + yancqqsxtl1a + rkclhuz0a + "CvPdEhZM" + BKRktQy + NlWZXvh + XIuFOgA + DnktNZS + SfaOYxE + lenBEWb + bjJBWMO + PiuoWaD + xyagGzM + klgIwtK + pMUgBZN + tHiPLHy + pYQsMai + "");
    }

    //垃圾方法
    private void XdaNGtVM(char sjjxiwcep0) {
        char sjjxiwcep0a = sjjxiwcep0;
        new StringReader("XdaNGtVM" + sjjxiwcep0a + "XdaNGtVM" + bjJBWMO + lenBEWb + SfaOYxE + DnktNZS + PiuoWaD + pYQsMai + tHiPLHy + NlWZXvh + xyagGzM + XIuFOgA + pMUgBZN + BKRktQy + klgIwtK + "");
    }

    //垃圾方法
    private void bUwewUvb(float hkffnxga0, long nkodwdt1) {
        long nkodwdt1a = nkodwdt1;
        float hkffnxga0a = hkffnxga0;
        Log.i("bUwewUvb", "bUwewUvb" + hkffnxga0a + nkodwdt1a + "bUwewUvb" + xyagGzM + BKRktQy + DnktNZS + SfaOYxE + XIuFOgA + pMUgBZN + PiuoWaD + bjJBWMO + pYQsMai + klgIwtK + NlWZXvh + tHiPLHy + lenBEWb + "");
    }

    //垃圾方法
    private void hFZBLwvv(byte jbstblq0, boolean ruvnkxim1) {
        boolean ruvnkxim1a = ruvnkxim1;
        byte jbstblq0a = jbstblq0;
        new StringBuffer("hFZBLwvv" + ruvnkxim1a + jbstblq0a + "hFZBLwvv" + xyagGzM + bjJBWMO + XIuFOgA + DnktNZS + pYQsMai + SfaOYxE + lenBEWb + BKRktQy + pMUgBZN + PiuoWaD + klgIwtK + tHiPLHy + NlWZXvh + "");
    }

    //垃圾方法
    private void tmUDdYxW(float dxqoyfci0, boolean jfscxigk1, float ymehectqz2, int myuuaowf3, double mdpmjorqtd4) {
        double mdpmjorqtd4a = mdpmjorqtd4;
        int myuuaowf3a = myuuaowf3;
        float ymehectqz2a = ymehectqz2;
        boolean jfscxigk1a = jfscxigk1;
        float dxqoyfci0a = dxqoyfci0;
        new Intent("tmUDdYxW" + ymehectqz2a + myuuaowf3a + jfscxigk1a + mdpmjorqtd4a + dxqoyfci0a + "tmUDdYxW" + SfaOYxE + lenBEWb + klgIwtK + XIuFOgA + bjJBWMO + NlWZXvh + pYQsMai + PiuoWaD + DnktNZS + xyagGzM + tHiPLHy + BKRktQy + pMUgBZN + "");
    }

    //垃圾方法
    private void AhEXTaPh(short wtbcwdxmzf0, short endrczfmcz1, float dlifctyvz2, float vjbnwjdkw3) {
        float vjbnwjdkw3a = vjbnwjdkw3;
        float dlifctyvz2a = dlifctyvz2;
        short endrczfmcz1a = endrczfmcz1;
        short wtbcwdxmzf0a = wtbcwdxmzf0;
        new AttributedString("AhEXTaPh" + wtbcwdxmzf0a + endrczfmcz1a + dlifctyvz2a + vjbnwjdkw3a + "AhEXTaPh" + NlWZXvh + bjJBWMO + DnktNZS + lenBEWb + XIuFOgA + SfaOYxE + xyagGzM + klgIwtK + BKRktQy + pMUgBZN + tHiPLHy + pYQsMai + PiuoWaD + "");
    }

    public void onCreate() {
        float vjbnwjdkw3 = 86.86f;
        float dlifctyvz2 = 20.20f;
        short endrczfmcz1 = 42;
        short wtbcwdxmzf0 = 72;
        double mdpmjorqtd4 = 29.29;
        int myuuaowf3 = 85;
        float ymehectqz2 = 40.40f;
        boolean jfscxigk1 = true;
        float dxqoyfci0 = 11.11f;
        boolean ruvnkxim1 = false;
        byte jbstblq0 = 25;
        long nkodwdt1 = 65L;
        float hkffnxga0 = 99.99f;
        char sjjxiwcep0 = 43;
        double yancqqsxtl1 = 79.79;
        int rkclhuz0 = 28;
        double ynirydrd4 = 78.78;
        short njjcfhrim3 = 60;
        char khefqbsf2 = 65;
        short rndjtmyy1 = 85;
        byte uhizjszw0 = 64;
        byte cvjhofmn3 = 50;
        long daqhdxb2 = 5L;
        char encbiusst1 = 43;
        float njlrfosx0 = 8.8f;
        double ncntkndby3 = 2.2;
        char nioncez2 = 55;
        int llvpiyr1 = 93;
        int mjyljqith0 = 14;
        int jnbkokuhj3 = 9;
        byte zhaiizgn2 = 9;
        char vleylgbnnv1 = 44;
        double rkaxzneocu0 = 95.95;
        short waoprueg2 = 52;
        char sdplsor1 = 1;
        byte gdqamuexdr0 = 51;
        double jmdxvdsdig2 = 59.59;
        boolean pgptnek1 = false;
        boolean hdwdxzsl0 = true;
        short jpqykspt4 = 29;
        double ffpvamsjue3 = 24.24;
        short hlelwffca2 = 2;
        long kcuzjzyb1 = 87L;
        float wwfmordhek0 = 13.13f;
        long wtjzxqwdeb1 = 8L;
        char vuyiisydid0 = 79;
        double gmioqzus1 = 72.72;
        int snmaykzbe0 = 17;
        boolean lzoijdt0 = true;
        byte klopdmzzm1 = 89;
        boolean gkppugiqog0 = false;
        char stqvpmro4 = 39;
        short rmqblazi3 = 49;
        char cspgvit2 = 68;
        byte urtklpcg1 = 25;
        char uzsptkbbes0 = 63;
        byte vmlzpduo3 = 41;
        boolean popsgajy2 = true;
        int puxejaoqcd1 = 5;
        char kawjbwp0 = 26;
        short kwiwvcts3 = 76;
        float ifhundz2 = 82.82f;
        byte qxnrncxh1 = 99;
        short vonroifg0 = 93;
        float oncfpyosy2 = 78.78f;
        double hnahmodzg1 = 77.77;
        double cbhrtwmih0 = 13.13;
        int qrnzovudys4 = 45;
        boolean kxxgpvi3 = true;
        double iwafjuj2 = 87.87;
        float jnfnodniuk1 = 39.39f;
        char dvcxxfgwf0 = 71;
        boolean whcwnrxp2 = true;
        double ffkrcxni1 = 48.48;
        byte tqfqebyaow0 = 79;
        int sihretx0 = 56;
        boolean gnyabkjczs1 = false;
        double teudxcqxk0 = 32.32;
        char ppqfvfj4 = 24;
        long ptqpdsecu3 = 22L;
        int fhreuimkk2 = 88;
        short lznajlbewp1 = 13;
        float gvhhsrj0 = 55.55f;
        byte uzqetsbkfg3 = 22;
        float zlzlcmahuy2 = 19.19f;
        int txtinyoxu1 = 37;
        char qxvhagnwkw0 = 52;
        short olxsiqogz3 = 82;
        float harfqtyg2 = 74.74f;
        double yesoqttbqu1 = 86.86;
        short oqujrawuao0 = 0;
        CvPdEhZM(rkclhuz0, yancqqsxtl1);
        CvPdEhZM(rkclhuz0, yancqqsxtl1);
        zZAvyFpz(tqfqebyaow0, ffkrcxni1, whcwnrxp2);
        JHRvmlzq(gdqamuexdr0, sdplsor1, waoprueg2);
        mObjLqzs(teudxcqxk0, gnyabkjczs1);
        hFZBLwvv(jbstblq0, ruvnkxim1);
        kJmYfyIF(wwfmordhek0, kcuzjzyb1, hlelwffca2, ffpvamsjue3, jpqykspt4);
        hFZBLwvv(jbstblq0, ruvnkxim1);
        kJmYfyIF(wwfmordhek0, kcuzjzyb1, hlelwffca2, ffpvamsjue3, jpqykspt4);
        isLiving = true;
        caWzwqic(uzsptkbbes0, urtklpcg1, cspgvit2, rmqblazi3, stqvpmro4);
        caWzwqic(uzsptkbbes0, urtklpcg1, cspgvit2, rmqblazi3, stqvpmro4);
        XdaNGtVM(sjjxiwcep0);
        AhEXTaPh(wtbcwdxmzf0, endrczfmcz1, dlifctyvz2, vjbnwjdkw3);
        super.onCreate();
        QRUKWAPk(njlrfosx0, encbiusst1, daqhdxb2, cvjhofmn3);
        AhEXTaPh(wtbcwdxmzf0, endrczfmcz1, dlifctyvz2, vjbnwjdkw3);
        DdLLwTWF(dvcxxfgwf0, jnfnodniuk1, iwafjuj2, kxxgpvi3, qrnzovudys4);
        tmUDdYxW(dxqoyfci0, jfscxigk1, ymehectqz2, myuuaowf3, mdpmjorqtd4);
        if (SpeedManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        CvPdEhZM(rkclhuz0, yancqqsxtl1);
        VfmqpBVM(snmaykzbe0, gmioqzus1);
        HBMOGcak(qxvhagnwkw0, txtinyoxu1, zlzlcmahuy2, uzqetsbkfg3);
        yGbZQzkW(uhizjszw0, rndjtmyy1, khefqbsf2, njjcfhrim3, ynirydrd4);
        UqkZOnLt(cbhrtwmih0, hnahmodzg1, oncfpyosy2);
        HQWRRacy(mjyljqith0, llvpiyr1, nioncez2, ncntkndby3);
        this.mLocalBinder = new LocalBinder(this);
        if (this.mLocalServiceConn == null) {
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        kJmYfyIF(wwfmordhek0, kcuzjzyb1, hlelwffca2, ffpvamsjue3, jpqykspt4);
        HQWRRacy(mjyljqith0, llvpiyr1, nioncez2, ncntkndby3);
        JHRvmlzq(gdqamuexdr0, sdplsor1, waoprueg2);
        UqkZOnLt(cbhrtwmih0, hnahmodzg1, oncfpyosy2);
        dqxqUsou(oqujrawuao0, yesoqttbqu1, harfqtyg2, olxsiqogz3);
        this.startSubService(1, false);
    }

    //垃圾方法
    private void gayPghPl(short scdelahyul0, char mcjyoqm1, byte vgnprpdkt2, double wbrjuqf3, char bbfiubtth4) {
        char bbfiubtth4a = bbfiubtth4;
        double wbrjuqf3a = wbrjuqf3;
        byte vgnprpdkt2a = vgnprpdkt2;
        char mcjyoqm1a = mcjyoqm1;
        short scdelahyul0a = scdelahyul0;
        new WeakReference("gayPghPl" + bbfiubtth4a + wbrjuqf3a + vgnprpdkt2a + scdelahyul0a + mcjyoqm1a + "gayPghPl" + bjJBWMO + tHiPLHy + XIuFOgA + SfaOYxE + pYQsMai + klgIwtK + xyagGzM + NlWZXvh + lenBEWb + DnktNZS + PiuoWaD + pMUgBZN + BKRktQy + "");
    }

    //垃圾方法
    private void JGplcIbb(long ldfcejz0, boolean uwoihzxn1, long waqdfbla2, char cozpesx3, int ngebbzais4) {
        int ngebbzais4a = ngebbzais4;
        char cozpesx3a = cozpesx3;
        long waqdfbla2a = waqdfbla2;
        boolean uwoihzxn1a = uwoihzxn1;
        long ldfcejz0a = ldfcejz0;
        Log.e("JGplcIbb", "JGplcIbb" + cozpesx3a + uwoihzxn1a + waqdfbla2a + ngebbzais4a + ldfcejz0a + "JGplcIbb" + DnktNZS + klgIwtK + tHiPLHy + NlWZXvh + pMUgBZN + BKRktQy + bjJBWMO + SfaOYxE + PiuoWaD + XIuFOgA + xyagGzM + pYQsMai + lenBEWb + "");
    }

    //垃圾方法
    private void WDlmaqKh(int rzebewfx0, int oajgtec1, boolean rexlqxmx2, short bkandsd3) {
        short bkandsd3a = bkandsd3;
        boolean rexlqxmx2a = rexlqxmx2;
        int oajgtec1a = oajgtec1;
        int rzebewfx0a = rzebewfx0;
        System.out.println("WDlmaqKh" + rzebewfx0a + oajgtec1a + bkandsd3a + rexlqxmx2a + "WDlmaqKh" + DnktNZS + pYQsMai + tHiPLHy + NlWZXvh + bjJBWMO + PiuoWaD + xyagGzM + BKRktQy + lenBEWb + klgIwtK + SfaOYxE + pMUgBZN + XIuFOgA + "");
    }

    //垃圾方法
    private void MPiRBElX(double elniibnzhq0) {
        double elniibnzhq0a = elniibnzhq0;
        new Thread("MPiRBElX" + elniibnzhq0a + "MPiRBElX" + SfaOYxE + lenBEWb + bjJBWMO + tHiPLHy + pMUgBZN + BKRktQy + klgIwtK + XIuFOgA + pYQsMai + xyagGzM + DnktNZS + PiuoWaD + NlWZXvh + "");
    }

    public void onRebind(Intent intent) {
        double elniibnzhq0 = 76.76;
        short bkandsd3 = 66;
        boolean rexlqxmx2 = false;
        int oajgtec1 = 92;
        int rzebewfx0 = 24;
        int ngebbzais4 = 4;
        char cozpesx3 = 22;
        long waqdfbla2 = 92L;
        boolean uwoihzxn1 = false;
        long ldfcejz0 = 22L;
        char bbfiubtth4 = 93;
        double wbrjuqf3 = 30.30;
        byte vgnprpdkt2 = 42;
        char mcjyoqm1 = 100;
        short scdelahyul0 = 22;
        WDlmaqKh(rzebewfx0, oajgtec1, rexlqxmx2, bkandsd3);
        gayPghPl(scdelahyul0, mcjyoqm1, vgnprpdkt2, wbrjuqf3, bbfiubtth4);
        WDlmaqKh(rzebewfx0, oajgtec1, rexlqxmx2, bkandsd3);
        MPiRBElX(elniibnzhq0);
        JGplcIbb(ldfcejz0, uwoihzxn1, waqdfbla2, cozpesx3, ngebbzais4);
        gayPghPl(scdelahyul0, mcjyoqm1, vgnprpdkt2, wbrjuqf3, bbfiubtth4);
        WDlmaqKh(rzebewfx0, oajgtec1, rexlqxmx2, bkandsd3);
        gayPghPl(scdelahyul0, mcjyoqm1, vgnprpdkt2, wbrjuqf3, bbfiubtth4);
        super.onRebind(intent);
    }

    //垃圾方法
    private void mBHTFnEo(int fysmeisuo0, float alninofnf1, byte imvskxj2, int vxtfjesjc3) {
        int vxtfjesjc3a = vxtfjesjc3;
        byte imvskxj2a = imvskxj2;
        float alninofnf1a = alninofnf1;
        int fysmeisuo0a = fysmeisuo0;
        TextUtils.isEmpty("mBHTFnEo" + fysmeisuo0a + imvskxj2a + alninofnf1a + vxtfjesjc3a + "mBHTFnEo" + klgIwtK + bjJBWMO + tHiPLHy + PiuoWaD + NlWZXvh + BKRktQy + DnktNZS + pYQsMai + pMUgBZN + xyagGzM + lenBEWb + XIuFOgA + SfaOYxE + "");
    }

    //垃圾方法
    private void CASFHxfW(float mibgkue0, short dgwdper1, int sllfmgp2, boolean hksnjbftxh3) {
        boolean hksnjbftxh3a = hksnjbftxh3;
        int sllfmgp2a = sllfmgp2;
        short dgwdper1a = dgwdper1;
        float mibgkue0a = mibgkue0;
        TextUtils.isEmpty("CASFHxfW" + hksnjbftxh3a + dgwdper1a + sllfmgp2a + mibgkue0a + "CASFHxfW" + bjJBWMO + klgIwtK + XIuFOgA + xyagGzM + lenBEWb + pYQsMai + BKRktQy + SfaOYxE + PiuoWaD + NlWZXvh + DnktNZS + pMUgBZN + tHiPLHy + "");
    }

    //垃圾方法
    private void JGBrtJfm(char gtgwtty0, double edxilhwn1, double efevsniw2, long ncimchrtu3) {
        long ncimchrtu3a = ncimchrtu3;
        double efevsniw2a = efevsniw2;
        double edxilhwn1a = edxilhwn1;
        char gtgwtty0a = gtgwtty0;
        new File("JGBrtJfm" + ncimchrtu3a + gtgwtty0a + edxilhwn1a + efevsniw2a + "JGBrtJfm" + XIuFOgA + PiuoWaD + SfaOYxE + xyagGzM + tHiPLHy + NlWZXvh + klgIwtK + pYQsMai + BKRktQy + DnktNZS + lenBEWb + bjJBWMO + pMUgBZN + "");
    }

    //垃圾方法
    private void AqAcUyXS(byte bxiklaek0, short lezmqwwyac1, short neiwrnvjsh2, float ydkkdnngma3, int mrwkcxtuk4) {
        int mrwkcxtuk4a = mrwkcxtuk4;
        float ydkkdnngma3a = ydkkdnngma3;
        short neiwrnvjsh2a = neiwrnvjsh2;
        short lezmqwwyac1a = lezmqwwyac1;
        byte bxiklaek0a = bxiklaek0;
        new WeakReference("AqAcUyXS" + ydkkdnngma3a + lezmqwwyac1a + neiwrnvjsh2a + bxiklaek0a + mrwkcxtuk4a + "AqAcUyXS" + DnktNZS + klgIwtK + NlWZXvh + SfaOYxE + XIuFOgA + lenBEWb + BKRktQy + bjJBWMO + tHiPLHy + xyagGzM + PiuoWaD + pYQsMai + pMUgBZN + "");
    }

    //垃圾方法
    private void PWuOFagQ(boolean uncpsmsat0, byte dgfusxm1) {
        byte dgfusxm1a = dgfusxm1;
        boolean uncpsmsat0a = uncpsmsat0;
        Log.i("PWuOFagQ", "PWuOFagQ" + dgfusxm1a + uncpsmsat0a + "PWuOFagQ" + xyagGzM + XIuFOgA + tHiPLHy + pMUgBZN + BKRktQy + lenBEWb + PiuoWaD + DnktNZS + klgIwtK + NlWZXvh + SfaOYxE + pYQsMai + bjJBWMO + "");
    }

    //垃圾方法
    private void oavvsWgu(long ffnhiayhch0) {
        long ffnhiayhch0a = ffnhiayhch0;
        TextUtils.isEmpty("oavvsWgu" + ffnhiayhch0a + "oavvsWgu" + SfaOYxE + lenBEWb + bjJBWMO + NlWZXvh + BKRktQy + klgIwtK + pYQsMai + tHiPLHy + pMUgBZN + PiuoWaD + DnktNZS + XIuFOgA + xyagGzM + "");
    }

    //垃圾方法
    private void zDNJfLXU(short irxwtrjkx0, boolean zqbvkdeqig1, float uijqeob2, double oamkunoozg3, byte ikunbgi4) {
        byte ikunbgi4a = ikunbgi4;
        double oamkunoozg3a = oamkunoozg3;
        float uijqeob2a = uijqeob2;
        boolean zqbvkdeqig1a = zqbvkdeqig1;
        short irxwtrjkx0a = irxwtrjkx0;
        new AttributedString("zDNJfLXU" + ikunbgi4a + irxwtrjkx0a + oamkunoozg3a + uijqeob2a + zqbvkdeqig1a + "zDNJfLXU" + lenBEWb + pMUgBZN + BKRktQy + klgIwtK + XIuFOgA + bjJBWMO + NlWZXvh + tHiPLHy + DnktNZS + xyagGzM + SfaOYxE + pYQsMai + PiuoWaD + "");
    }

    //垃圾方法
    private void UQHMirfW(char qarruiv0, int ywssjpz1, double zxiluafpf2, int lhdmjwl3, double blqdtwkzff4) {
        double blqdtwkzff4a = blqdtwkzff4;
        int lhdmjwl3a = lhdmjwl3;
        double zxiluafpf2a = zxiluafpf2;
        int ywssjpz1a = ywssjpz1;
        char qarruiv0a = qarruiv0;
        TextUtils.isEmpty("UQHMirfW" + qarruiv0a + lhdmjwl3a + blqdtwkzff4a + ywssjpz1a + zxiluafpf2a + "UQHMirfW" + xyagGzM + bjJBWMO + pMUgBZN + klgIwtK + pYQsMai + NlWZXvh + BKRktQy + tHiPLHy + DnktNZS + PiuoWaD + XIuFOgA + SfaOYxE + lenBEWb + "");
    }

    //垃圾方法
    private void mckoCBkI(byte hwxqxkyo0, int uvywtjg1, float zdazdix2) {
        float zdazdix2a = zdazdix2;
        int uvywtjg1a = uvywtjg1;
        byte hwxqxkyo0a = hwxqxkyo0;
        new String("mckoCBkI" + hwxqxkyo0a + uvywtjg1a + zdazdix2a + "mckoCBkI" + XIuFOgA + BKRktQy + bjJBWMO + NlWZXvh + pMUgBZN + tHiPLHy + pYQsMai + SfaOYxE + lenBEWb + DnktNZS + PiuoWaD + xyagGzM + klgIwtK + "");
    }

    //垃圾方法
    private void nzirsBRm(float odiyrwbym0) {
        float odiyrwbym0a = odiyrwbym0;
        Log.w("nzirsBRm", "nzirsBRm" + odiyrwbym0a + "nzirsBRm" + DnktNZS + PiuoWaD + BKRktQy + pMUgBZN + XIuFOgA + xyagGzM + lenBEWb + klgIwtK + SfaOYxE + pYQsMai + tHiPLHy + NlWZXvh + bjJBWMO + "");
    }

    //垃圾方法
    private void JhgBjKLr(int wazydlrq0, double erhpvgfz1, byte yyjrkdus2) {
        byte yyjrkdus2a = yyjrkdus2;
        double erhpvgfz1a = erhpvgfz1;
        int wazydlrq0a = wazydlrq0;
        System.out.println("JhgBjKLr" + erhpvgfz1a + yyjrkdus2a + wazydlrq0a + "JhgBjKLr" + SfaOYxE + DnktNZS + XIuFOgA + NlWZXvh + PiuoWaD + klgIwtK + bjJBWMO + tHiPLHy + BKRktQy + pYQsMai + pMUgBZN + lenBEWb + xyagGzM + "");
    }

    //垃圾方法
    private void KDShHGZi(boolean wovnlnah0, double avlcjdbbz1) {
        double avlcjdbbz1a = avlcjdbbz1;
        boolean wovnlnah0a = wovnlnah0;
        new File("KDShHGZi" + avlcjdbbz1a + wovnlnah0a + "KDShHGZi" + BKRktQy + bjJBWMO + pMUgBZN + NlWZXvh + DnktNZS + xyagGzM + PiuoWaD + tHiPLHy + klgIwtK + XIuFOgA + SfaOYxE + pYQsMai + lenBEWb + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        double avlcjdbbz1 = 32.32;
        boolean wovnlnah0 = false;
        byte yyjrkdus2 = 33;
        double erhpvgfz1 = 88.88;
        int wazydlrq0 = 53;
        float odiyrwbym0 = 1.1f;
        float zdazdix2 = 76.76f;
        int uvywtjg1 = 43;
        byte hwxqxkyo0 = 99;
        double blqdtwkzff4 = 81.81;
        int lhdmjwl3 = 5;
        double zxiluafpf2 = 23.23;
        int ywssjpz1 = 35;
        char qarruiv0 = 49;
        byte ikunbgi4 = 46;
        double oamkunoozg3 = 80.80;
        float uijqeob2 = 91.91f;
        boolean zqbvkdeqig1 = false;
        short irxwtrjkx0 = 47;
        long ffnhiayhch0 = 52L;
        byte dgfusxm1 = 51;
        boolean uncpsmsat0 = true;
        int mrwkcxtuk4 = 2;
        float ydkkdnngma3 = 89.89f;
        short neiwrnvjsh2 = 12;
        short lezmqwwyac1 = 6;
        byte bxiklaek0 = 17;
        long ncimchrtu3 = 81L;
        double efevsniw2 = 80.80;
        double edxilhwn1 = 19.19;
        char gtgwtty0 = 70;
        boolean hksnjbftxh3 = true;
        int sllfmgp2 = 16;
        short dgwdper1 = 39;
        float mibgkue0 = 12.12f;
        int vxtfjesjc3 = 98;
        byte imvskxj2 = 1;
        float alninofnf1 = 72.72f;
        int fysmeisuo0 = 86;
        if (intent != null && !isStartService) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (SpeedManager.isDebug) {
            UQHMirfW(qarruiv0, ywssjpz1, zxiluafpf2, lhdmjwl3, blqdtwkzff4);
            KDShHGZi(wovnlnah0, avlcjdbbz1);
            mBHTFnEo(fysmeisuo0, alninofnf1, imvskxj2, vxtfjesjc3);
            JhgBjKLr(wazydlrq0, erhpvgfz1, yyjrkdus2);
            zDNJfLXU(irxwtrjkx0, zqbvkdeqig1, uijqeob2, oamkunoozg3, ikunbgi4);
            PWuOFagQ(uncpsmsat0, dgfusxm1);
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        mckoCBkI(hwxqxkyo0, uvywtjg1, zdazdix2);
        oavvsWgu(ffnhiayhch0);
        JGBrtJfm(gtgwtty0, edxilhwn1, efevsniw2, ncimchrtu3);
        JGBrtJfm(gtgwtty0, edxilhwn1, efevsniw2, ncimchrtu3);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void jlMCumZC(long hwdxfoybv0, char yibdqcmwsx1, long mqjwecn2, float kooiorwcb3, int gbwmwadk4) {
        int gbwmwadk4a = gbwmwadk4;
        float kooiorwcb3a = kooiorwcb3;
        long mqjwecn2a = mqjwecn2;
        char yibdqcmwsx1a = yibdqcmwsx1;
        long hwdxfoybv0a = hwdxfoybv0;
        new StringBuilder("jlMCumZC" + mqjwecn2a + kooiorwcb3a + hwdxfoybv0a + yibdqcmwsx1a + gbwmwadk4a + "jlMCumZC" + bjJBWMO + pYQsMai + SfaOYxE + lenBEWb + klgIwtK + xyagGzM + pMUgBZN + XIuFOgA + tHiPLHy + PiuoWaD + BKRktQy + NlWZXvh + DnktNZS + "");
    }

    //垃圾方法
    private void mtaMBtjc(short hvcrihoj0, short bmsgghog1, double ajmmdty2) {
        double ajmmdty2a = ajmmdty2;
        short bmsgghog1a = bmsgghog1;
        short hvcrihoj0a = hvcrihoj0;
        System.out.println("mtaMBtjc" + bmsgghog1a + ajmmdty2a + hvcrihoj0a + "mtaMBtjc" + tHiPLHy + NlWZXvh + DnktNZS + xyagGzM + pYQsMai + BKRktQy + PiuoWaD + XIuFOgA + lenBEWb + pMUgBZN + klgIwtK + SfaOYxE + bjJBWMO + "");
    }

    //垃圾方法
    private void yNutYKBs(int igzfljmrot0, long yxzbxxg1, long vqncpbjylv2, char wylqsniee3) {
        char wylqsniee3a = wylqsniee3;
        long vqncpbjylv2a = vqncpbjylv2;
        long yxzbxxg1a = yxzbxxg1;
        int igzfljmrot0a = igzfljmrot0;
        new StringBuilder("yNutYKBs" + wylqsniee3a + vqncpbjylv2a + yxzbxxg1a + igzfljmrot0a + "yNutYKBs" + XIuFOgA + klgIwtK + DnktNZS + pYQsMai + BKRktQy + PiuoWaD + bjJBWMO + tHiPLHy + xyagGzM + NlWZXvh + SfaOYxE + lenBEWb + pMUgBZN + "");
    }

    //垃圾方法
    private void jDkdxdFg(long vhygrrid0, char dwfuekdm1, byte zkxsoof2, char gyufyspcdl3, byte zgeughwivc4) {
        byte zgeughwivc4a = zgeughwivc4;
        char gyufyspcdl3a = gyufyspcdl3;
        byte zkxsoof2a = zkxsoof2;
        char dwfuekdm1a = dwfuekdm1;
        long vhygrrid0a = vhygrrid0;
        new StringBuilder("jDkdxdFg" + zkxsoof2a + zgeughwivc4a + vhygrrid0a + gyufyspcdl3a + dwfuekdm1a + "jDkdxdFg" + pYQsMai + pMUgBZN + SfaOYxE + DnktNZS + lenBEWb + PiuoWaD + bjJBWMO + tHiPLHy + NlWZXvh + XIuFOgA + klgIwtK + xyagGzM + BKRktQy + "");
    }

    //垃圾方法
    private void sLiIuxjm(float rjvvvruoc0) {
        float rjvvvruoc0a = rjvvvruoc0;
        new StringBuilder("sLiIuxjm" + rjvvvruoc0a + "sLiIuxjm" + bjJBWMO + pYQsMai + lenBEWb + NlWZXvh + PiuoWaD + xyagGzM + klgIwtK + DnktNZS + pMUgBZN + XIuFOgA + tHiPLHy + BKRktQy + SfaOYxE + "");
    }

    //垃圾方法
    private void ByMzntdY(byte rnhavrl0) {
        byte rnhavrl0a = rnhavrl0;
    }

    //垃圾方法
    private void JqNWNDzq(byte pounflye0, short fvzruubg1, short mhufqndfb2, char qovkjcroi3, short cmusmmcfz4) {
        short cmusmmcfz4a = cmusmmcfz4;
        char qovkjcroi3a = qovkjcroi3;
        short mhufqndfb2a = mhufqndfb2;
        short fvzruubg1a = fvzruubg1;
        byte pounflye0a = pounflye0;
    }

    //垃圾方法
    private void fIrEmPBA(short itkcmkn0, float rcnloqp1, boolean qaejdrlgyz2, int tbzegshhta3, int akgpwvn4) {
        int akgpwvn4a = akgpwvn4;
        int tbzegshhta3a = tbzegshhta3;
        boolean qaejdrlgyz2a = qaejdrlgyz2;
        float rcnloqp1a = rcnloqp1;
        short itkcmkn0a = itkcmkn0;
        Log.w("fIrEmPBA", "fIrEmPBA" + rcnloqp1a + qaejdrlgyz2a + akgpwvn4a + tbzegshhta3a + itkcmkn0a + "fIrEmPBA" + tHiPLHy + klgIwtK + BKRktQy + pMUgBZN + lenBEWb + pYQsMai + DnktNZS + SfaOYxE + xyagGzM + NlWZXvh + bjJBWMO + XIuFOgA + PiuoWaD + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        int akgpwvn4 = 77;
        int tbzegshhta3 = 66;
        boolean qaejdrlgyz2 = true;
        float rcnloqp1 = 71.71f;
        short itkcmkn0 = 39;
        short cmusmmcfz4 = 38;
        char qovkjcroi3 = 66;
        short mhufqndfb2 = 57;
        short fvzruubg1 = 46;
        byte pounflye0 = 65;
        byte rnhavrl0 = 1;
        float rjvvvruoc0 = 74.74f;
        byte zgeughwivc4 = 86;
        char gyufyspcdl3 = 84;
        byte zkxsoof2 = 61;
        char dwfuekdm1 = 61;
        long vhygrrid0 = 49L;
        char wylqsniee3 = 6;
        long vqncpbjylv2 = 41L;
        long yxzbxxg1 = 10L;
        int igzfljmrot0 = 51;
        double ajmmdty2 = 86.86;
        short bmsgghog1 = 77;
        short hvcrihoj0 = 87;
        int gbwmwadk4 = 6;
        float kooiorwcb3 = 19.19f;
        long mqjwecn2 = 22L;
        char yibdqcmwsx1 = 45;
        long hwdxfoybv0 = 21L;
        if (SpeedManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        return this.mLocalBinder;
    }

    //垃圾方法
    private void JgEbJmhb(byte cwzwiyjtol0) {
        byte cwzwiyjtol0a = cwzwiyjtol0;
        new Intent("JgEbJmhb" + cwzwiyjtol0a + "JgEbJmhb" + lenBEWb + PiuoWaD + pYQsMai + BKRktQy + bjJBWMO + SfaOYxE + DnktNZS + tHiPLHy + pMUgBZN + klgIwtK + xyagGzM + XIuFOgA + NlWZXvh + "");
    }

    //垃圾方法
    private void eozmIZTX(int mipgmvmtq0, double bxbwcmhvm1) {
        double bxbwcmhvm1a = bxbwcmhvm1;
        int mipgmvmtq0a = mipgmvmtq0;
        new StringReader("eozmIZTX" + bxbwcmhvm1a + mipgmvmtq0a + "eozmIZTX" + NlWZXvh + pYQsMai + XIuFOgA + xyagGzM + SfaOYxE + tHiPLHy + PiuoWaD + BKRktQy + lenBEWb + pMUgBZN + bjJBWMO + DnktNZS + klgIwtK + "");
    }

    //垃圾方法
    private void BhXNbahz(char jwszpkutp0, double mizkcuxu1) {
        double mizkcuxu1a = mizkcuxu1;
        char jwszpkutp0a = jwszpkutp0;
        new AttributedString("BhXNbahz" + mizkcuxu1a + jwszpkutp0a + "BhXNbahz" + klgIwtK + NlWZXvh + DnktNZS + lenBEWb + pYQsMai + xyagGzM + bjJBWMO + pMUgBZN + SfaOYxE + tHiPLHy + BKRktQy + PiuoWaD + XIuFOgA + "");
    }

    //垃圾方法
    private void hHoUwCeK(int ydkexulbup0, long qaphwevrg1, byte csqklyv2, double ljbwozjwbv3, long mzccpwepvo4) {
        long mzccpwepvo4a = mzccpwepvo4;
        double ljbwozjwbv3a = ljbwozjwbv3;
        byte csqklyv2a = csqklyv2;
        long qaphwevrg1a = qaphwevrg1;
        int ydkexulbup0a = ydkexulbup0;
        new StringBuilder("hHoUwCeK" + ydkexulbup0a + csqklyv2a + ljbwozjwbv3a + qaphwevrg1a + mzccpwepvo4a + "hHoUwCeK" + PiuoWaD + BKRktQy + bjJBWMO + lenBEWb + DnktNZS + pYQsMai + xyagGzM + NlWZXvh + SfaOYxE + klgIwtK + XIuFOgA + pMUgBZN + tHiPLHy + "");
    }

    //垃圾方法
    private void FUWXWlWN(long hxdljye0, float ebbiicjj1, byte fisrbff2) {
        byte fisrbff2a = fisrbff2;
        float ebbiicjj1a = ebbiicjj1;
        long hxdljye0a = hxdljye0;
        new File("FUWXWlWN" + ebbiicjj1a + hxdljye0a + fisrbff2a + "FUWXWlWN" + BKRktQy + pMUgBZN + SfaOYxE + xyagGzM + PiuoWaD + NlWZXvh + klgIwtK + pYQsMai + DnktNZS + tHiPLHy + lenBEWb + XIuFOgA + bjJBWMO + "");
    }

    //垃圾方法
    private void NugHqDpd(boolean zqhnvjpnjt0) {
        boolean zqhnvjpnjt0a = zqhnvjpnjt0;
        TextUtils.isDigitsOnly("NugHqDpd" + zqhnvjpnjt0a + "NugHqDpd" + lenBEWb + pMUgBZN + NlWZXvh + DnktNZS + pYQsMai + bjJBWMO + SfaOYxE + tHiPLHy + xyagGzM + klgIwtK + BKRktQy + XIuFOgA + PiuoWaD + "");
    }

    //垃圾方法
    private void wPRjoHJM(short vnndsvkqt0) {
        short vnndsvkqt0a = vnndsvkqt0;
        new File("wPRjoHJM" + vnndsvkqt0a + "wPRjoHJM" + tHiPLHy + PiuoWaD + bjJBWMO + pYQsMai + lenBEWb + klgIwtK + pMUgBZN + DnktNZS + xyagGzM + NlWZXvh + SfaOYxE + BKRktQy + XIuFOgA + "");
    }

    //垃圾方法
    private void kGZEXIYN(int auiaftjde0, byte hymwftbay1, long mwjnwhm2, int kiobtkgxsd3) {
        int kiobtkgxsd3a = kiobtkgxsd3;
        long mwjnwhm2a = mwjnwhm2;
        byte hymwftbay1a = hymwftbay1;
        int auiaftjde0a = auiaftjde0;
        Log.w("kGZEXIYN", "kGZEXIYN" + auiaftjde0a + kiobtkgxsd3a + mwjnwhm2a + hymwftbay1a + "kGZEXIYN" + tHiPLHy + bjJBWMO + pMUgBZN + xyagGzM + NlWZXvh + klgIwtK + SfaOYxE + PiuoWaD + BKRktQy + lenBEWb + DnktNZS + XIuFOgA + pYQsMai + "");
    }

    //垃圾方法
    private void shsipcaH(double rixqphc0, double viexuvypce1, float cwnwvlpv2) {
        float cwnwvlpv2a = cwnwvlpv2;
        double viexuvypce1a = viexuvypce1;
        double rixqphc0a = rixqphc0;
        System.out.println("shsipcaH" + viexuvypce1a + rixqphc0a + cwnwvlpv2a + "shsipcaH" + PiuoWaD + pMUgBZN + pYQsMai + xyagGzM + DnktNZS + lenBEWb + XIuFOgA + tHiPLHy + NlWZXvh + BKRktQy + klgIwtK + bjJBWMO + SfaOYxE + "");
    }

    //垃圾方法
    private void JIIbkfhe(long klxtcuvt0) {
        long klxtcuvt0a = klxtcuvt0;
        TextUtils.isDigitsOnly("JIIbkfhe" + klxtcuvt0a + "JIIbkfhe" + NlWZXvh + pYQsMai + klgIwtK + bjJBWMO + DnktNZS + tHiPLHy + BKRktQy + PiuoWaD + XIuFOgA + xyagGzM + SfaOYxE + lenBEWb + pMUgBZN + "");
    }

    //垃圾方法
    private void eppRPnIt(byte hwqzlgt0) {
        byte hwqzlgt0a = hwqzlgt0;
    }

    //垃圾方法
    private void CEcmpmto(short dvxlrvyfkb0, int adbrler1, boolean vdpaoceg2, double khshzlamc3, char nvpmuigvi4) {
        char nvpmuigvi4a = nvpmuigvi4;
        double khshzlamc3a = khshzlamc3;
        boolean vdpaoceg2a = vdpaoceg2;
        int adbrler1a = adbrler1;
        short dvxlrvyfkb0a = dvxlrvyfkb0;
        new Thread("CEcmpmto" + nvpmuigvi4a + adbrler1a + dvxlrvyfkb0a + vdpaoceg2a + khshzlamc3a + "CEcmpmto" + BKRktQy + klgIwtK + pYQsMai + bjJBWMO + SfaOYxE + DnktNZS + lenBEWb + NlWZXvh + XIuFOgA + xyagGzM + tHiPLHy + pMUgBZN + PiuoWaD + "");
    }

    //垃圾方法
    private void WGStlrzu(short lqfbqsxtm0, long pwwkiqo1, int zqwjlmsx2, boolean nnfkgfdibn3, int happwmtd4) {
        int happwmtd4a = happwmtd4;
        boolean nnfkgfdibn3a = nnfkgfdibn3;
        int zqwjlmsx2a = zqwjlmsx2;
        long pwwkiqo1a = pwwkiqo1;
        short lqfbqsxtm0a = lqfbqsxtm0;
        new StringBuffer("WGStlrzu" + zqwjlmsx2a + pwwkiqo1a + happwmtd4a + lqfbqsxtm0a + nnfkgfdibn3a + "WGStlrzu" + pYQsMai + PiuoWaD + xyagGzM + SfaOYxE + XIuFOgA + bjJBWMO + lenBEWb + tHiPLHy + pMUgBZN + NlWZXvh + BKRktQy + DnktNZS + klgIwtK + "");
    }

    //垃圾方法
    private void rONMaktE(float cnnuddv0, boolean akymdqnvq1, char umlxlkcmez2, short dbyhvnnl3, double nmnzczjxy4) {
        double nmnzczjxy4a = nmnzczjxy4;
        short dbyhvnnl3a = dbyhvnnl3;
        char umlxlkcmez2a = umlxlkcmez2;
        boolean akymdqnvq1a = akymdqnvq1;
        float cnnuddv0a = cnnuddv0;
        new Thread("rONMaktE" + umlxlkcmez2a + akymdqnvq1a + dbyhvnnl3a + nmnzczjxy4a + cnnuddv0a + "rONMaktE" + tHiPLHy + BKRktQy + bjJBWMO + lenBEWb + xyagGzM + pYQsMai + klgIwtK + SfaOYxE + pMUgBZN + PiuoWaD + NlWZXvh + DnktNZS + XIuFOgA + "");
    }

    //垃圾方法
    private void yBFpPYEb(boolean oqojxwilmc0, char kdvzrjovyg1, float ageyhdwk2, char wcallrcnt3) {
        char wcallrcnt3a = wcallrcnt3;
        float ageyhdwk2a = ageyhdwk2;
        char kdvzrjovyg1a = kdvzrjovyg1;
        boolean oqojxwilmc0a = oqojxwilmc0;
        Log.w("yBFpPYEb", "yBFpPYEb" + wcallrcnt3a + ageyhdwk2a + oqojxwilmc0a + kdvzrjovyg1a + "yBFpPYEb" + klgIwtK + tHiPLHy + lenBEWb + pMUgBZN + DnktNZS + NlWZXvh + PiuoWaD + pYQsMai + xyagGzM + bjJBWMO + XIuFOgA + BKRktQy + SfaOYxE + "");
    }

    //垃圾方法
    private void YPIuoPia(boolean osmcvil0, boolean rcwcswxi1, short gddsoqprp2, int lutkrcqyp3, short stjrdarv4) {
        short stjrdarv4a = stjrdarv4;
        int lutkrcqyp3a = lutkrcqyp3;
        short gddsoqprp2a = gddsoqprp2;
        boolean rcwcswxi1a = rcwcswxi1;
        boolean osmcvil0a = osmcvil0;
        new AttributedString("YPIuoPia" + lutkrcqyp3a + gddsoqprp2a + stjrdarv4a + rcwcswxi1a + osmcvil0a + "YPIuoPia" + lenBEWb + PiuoWaD + xyagGzM + tHiPLHy + BKRktQy + NlWZXvh + bjJBWMO + SfaOYxE + pYQsMai + DnktNZS + XIuFOgA + pMUgBZN + klgIwtK + "");
    }

    //垃圾方法
    private void FoOfmpGE(boolean rmgngoxt0, float pstueryiw1, short nnwbcogd2, float gvlngsev3) {
        float gvlngsev3a = gvlngsev3;
        short nnwbcogd2a = nnwbcogd2;
        float pstueryiw1a = pstueryiw1;
        boolean rmgngoxt0a = rmgngoxt0;
        new AttributedString("FoOfmpGE" + pstueryiw1a + nnwbcogd2a + gvlngsev3a + rmgngoxt0a + "FoOfmpGE" + NlWZXvh + PiuoWaD + xyagGzM + bjJBWMO + SfaOYxE + pMUgBZN + klgIwtK + BKRktQy + pYQsMai + lenBEWb + DnktNZS + tHiPLHy + XIuFOgA + "");
    }

    //垃圾方法
    private void HIVQDYfp(double dzrwhpuwky0, byte rlvrpfj1, char cjfzfyb2) {
        char cjfzfyb2a = cjfzfyb2;
        byte rlvrpfj1a = rlvrpfj1;
        double dzrwhpuwky0a = dzrwhpuwky0;
        System.out.println("HIVQDYfp" + rlvrpfj1a + dzrwhpuwky0a + cjfzfyb2a + "HIVQDYfp" + bjJBWMO + xyagGzM + BKRktQy + pYQsMai + pMUgBZN + lenBEWb + DnktNZS + klgIwtK + PiuoWaD + NlWZXvh + XIuFOgA + SfaOYxE + tHiPLHy + "");
    }

    //垃圾方法
    private void wqdcAcuq(float wbidvheknu0, char tefeqrx1, float gmhfxsrhhx2) {
        float gmhfxsrhhx2a = gmhfxsrhhx2;
        char tefeqrx1a = tefeqrx1;
        float wbidvheknu0a = wbidvheknu0;
        new File("wqdcAcuq" + tefeqrx1a + gmhfxsrhhx2a + wbidvheknu0a + "wqdcAcuq" + pYQsMai + BKRktQy + DnktNZS + bjJBWMO + klgIwtK + tHiPLHy + pMUgBZN + XIuFOgA + NlWZXvh + PiuoWaD + SfaOYxE + lenBEWb + xyagGzM + "");
    }

    //垃圾方法
    private void VuTBgBJK(boolean fbylueq0, boolean cvlcmns1, long sqsfdualhc2, boolean faqicnr3) {
        boolean faqicnr3a = faqicnr3;
        long sqsfdualhc2a = sqsfdualhc2;
        boolean cvlcmns1a = cvlcmns1;
        boolean fbylueq0a = fbylueq0;
        Log.i("VuTBgBJK", "VuTBgBJK" + cvlcmns1a + fbylueq0a + faqicnr3a + sqsfdualhc2a + "VuTBgBJK" + tHiPLHy + xyagGzM + PiuoWaD + BKRktQy + bjJBWMO + lenBEWb + klgIwtK + DnktNZS + XIuFOgA + pMUgBZN + pYQsMai + NlWZXvh + SfaOYxE + "");
    }

    public void onDestroy() {
        boolean faqicnr3 = true;
        long sqsfdualhc2 = 96L;
        boolean cvlcmns1 = false;
        boolean fbylueq0 = true;
        float gmhfxsrhhx2 = 85.85f;
        char tefeqrx1 = 10;
        float wbidvheknu0 = 40.40f;
        char cjfzfyb2 = 50;
        byte rlvrpfj1 = 61;
        double dzrwhpuwky0 = 77.77;
        float gvlngsev3 = 40.40f;
        short nnwbcogd2 = 90;
        float pstueryiw1 = 30.30f;
        boolean rmgngoxt0 = false;
        short stjrdarv4 = 89;
        int lutkrcqyp3 = 59;
        short gddsoqprp2 = 70;
        boolean rcwcswxi1 = false;
        boolean osmcvil0 = true;
        char wcallrcnt3 = 49;
        float ageyhdwk2 = 32.32f;
        char kdvzrjovyg1 = 97;
        boolean oqojxwilmc0 = false;
        double nmnzczjxy4 = 59.59;
        short dbyhvnnl3 = 42;
        char umlxlkcmez2 = 55;
        boolean akymdqnvq1 = true;
        float cnnuddv0 = 93.93f;
        int happwmtd4 = 11;
        boolean nnfkgfdibn3 = true;
        int zqwjlmsx2 = 46;
        long pwwkiqo1 = 38L;
        short lqfbqsxtm0 = 44;
        char nvpmuigvi4 = 43;
        double khshzlamc3 = 34.34;
        boolean vdpaoceg2 = false;
        int adbrler1 = 45;
        short dvxlrvyfkb0 = 3;
        byte hwqzlgt0 = 66;
        long klxtcuvt0 = 94L;
        float cwnwvlpv2 = 59.59f;
        double viexuvypce1 = 97.97;
        double rixqphc0 = 4.4;
        int kiobtkgxsd3 = 15;
        long mwjnwhm2 = 34L;
        byte hymwftbay1 = 45;
        int auiaftjde0 = 3;
        short vnndsvkqt0 = 63;
        boolean zqhnvjpnjt0 = true;
        byte fisrbff2 = 17;
        float ebbiicjj1 = 38.38f;
        long hxdljye0 = 33L;
        long mzccpwepvo4 = 24L;
        double ljbwozjwbv3 = 24.24;
        byte csqklyv2 = 88;
        long qaphwevrg1 = 54L;
        int ydkexulbup0 = 60;
        double mizkcuxu1 = 54.54;
        char jwszpkutp0 = 75;
        double bxbwcmhvm1 = 65.65;
        int mipgmvmtq0 = 51;
        byte cwzwiyjtol0 = 74;
        YPIuoPia(osmcvil0, rcwcswxi1, gddsoqprp2, lutkrcqyp3, stjrdarv4);
        wPRjoHJM(vnndsvkqt0);
        HIVQDYfp(dzrwhpuwky0, rlvrpfj1, cjfzfyb2);
        shsipcaH(rixqphc0, viexuvypce1, cwnwvlpv2);
        BhXNbahz(jwszpkutp0, mizkcuxu1);
        BhXNbahz(jwszpkutp0, mizkcuxu1);
        rONMaktE(cnnuddv0, akymdqnvq1, umlxlkcmez2, dbyhvnnl3, nmnzczjxy4);
        wqdcAcuq(wbidvheknu0, tefeqrx1, gmhfxsrhhx2);
        WGStlrzu(lqfbqsxtm0, pwwkiqo1, zqwjlmsx2, nnfkgfdibn3, happwmtd4);
        if (SpeedManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        isStartService = false;
        isLiving = false;
        WGStlrzu(lqfbqsxtm0, pwwkiqo1, zqwjlmsx2, nnfkgfdibn3, happwmtd4);
        eppRPnIt(hwqzlgt0);
        NugHqDpd(zqhnvjpnjt0);
        VuTBgBJK(fbylueq0, cvlcmns1, sqsfdualhc2, faqicnr3);
        NugHqDpd(zqhnvjpnjt0);
        FoOfmpGE(rmgngoxt0, pstueryiw1, nnwbcogd2, gvlngsev3);
        kGZEXIYN(auiaftjde0, hymwftbay1, mwjnwhm2, kiobtkgxsd3);
        isReTryBinding = false;
    }

    //垃圾方法
    private void bROFLgMJ(char mqrwjfpfje0, char xrvowanm1, float ogdjwjnut2) {
        float ogdjwjnut2a = ogdjwjnut2;
        char xrvowanm1a = xrvowanm1;
        char mqrwjfpfje0a = mqrwjfpfje0;
        System.out.println("bROFLgMJ" + mqrwjfpfje0a + ogdjwjnut2a + xrvowanm1a + "bROFLgMJ" + DnktNZS + pMUgBZN + lenBEWb + SfaOYxE + pYQsMai + bjJBWMO + BKRktQy + XIuFOgA + xyagGzM + PiuoWaD + klgIwtK + tHiPLHy + NlWZXvh + "");
    }

    //垃圾方法
    private void zntzbfjt(double ionxuyqb0, float jznegtsum1) {
        float jznegtsum1a = jznegtsum1;
        double ionxuyqb0a = ionxuyqb0;
        new WeakReference("zntzbfjt" + ionxuyqb0a + jznegtsum1a + "zntzbfjt" + pMUgBZN + PiuoWaD + BKRktQy + pYQsMai + NlWZXvh + tHiPLHy + DnktNZS + SfaOYxE + xyagGzM + bjJBWMO + lenBEWb + XIuFOgA + klgIwtK + "");
    }

    //垃圾方法
    private void fhzRIcVZ(double fylqhbb0, char wzazeob1, float ihihgwkkx2, int saopnssqo3) {
        int saopnssqo3a = saopnssqo3;
        float ihihgwkkx2a = ihihgwkkx2;
        char wzazeob1a = wzazeob1;
        double fylqhbb0a = fylqhbb0;
        System.out.println("fhzRIcVZ" + saopnssqo3a + wzazeob1a + fylqhbb0a + ihihgwkkx2a + "fhzRIcVZ" + SfaOYxE + bjJBWMO + pMUgBZN + DnktNZS + xyagGzM + XIuFOgA + tHiPLHy + lenBEWb + BKRktQy + pYQsMai + NlWZXvh + PiuoWaD + klgIwtK + "");
    }

    //垃圾方法
    private void UOJBqlax(byte hnpnsuu0, char xhtffghh1, int mlbuyyeha2) {
        int mlbuyyeha2a = mlbuyyeha2;
        char xhtffghh1a = xhtffghh1;
        byte hnpnsuu0a = hnpnsuu0;
        new File("UOJBqlax" + hnpnsuu0a + mlbuyyeha2a + xhtffghh1a + "UOJBqlax" + tHiPLHy + NlWZXvh + pYQsMai + lenBEWb + BKRktQy + bjJBWMO + xyagGzM + DnktNZS + SfaOYxE + PiuoWaD + pMUgBZN + XIuFOgA + klgIwtK + "");
    }

    //垃圾方法
    private void KvbHsAgr(boolean wzzteubkmn0, long jterhtqrc1, boolean oqcrmnpow2, char laxervocjk3) {
        char laxervocjk3a = laxervocjk3;
        boolean oqcrmnpow2a = oqcrmnpow2;
        long jterhtqrc1a = jterhtqrc1;
        boolean wzzteubkmn0a = wzzteubkmn0;
        new StringBuffer("KvbHsAgr" + laxervocjk3a + oqcrmnpow2a + wzzteubkmn0a + jterhtqrc1a + "KvbHsAgr" + SfaOYxE + pMUgBZN + bjJBWMO + BKRktQy + pYQsMai + NlWZXvh + PiuoWaD + lenBEWb + klgIwtK + XIuFOgA + xyagGzM + tHiPLHy + DnktNZS + "");
    }

    //垃圾方法
    private void BHTHNOxy(char yqleyayh0, float quyzqusgs1, long wawneco2, boolean jnxsaikfi3, char ulxgawaec4) {
        char ulxgawaec4a = ulxgawaec4;
        boolean jnxsaikfi3a = jnxsaikfi3;
        long wawneco2a = wawneco2;
        float quyzqusgs1a = quyzqusgs1;
        char yqleyayh0a = yqleyayh0;
        new File("BHTHNOxy" + yqleyayh0a + jnxsaikfi3a + wawneco2a + ulxgawaec4a + quyzqusgs1a + "BHTHNOxy" + SfaOYxE + lenBEWb + BKRktQy + xyagGzM + PiuoWaD + NlWZXvh + DnktNZS + tHiPLHy + pYQsMai + XIuFOgA + bjJBWMO + pMUgBZN + klgIwtK + "");
    }

    //垃圾方法
    private void ayVrKczq(boolean tylflvhj0, boolean urpebbqqi1, boolean ldflhrg2, int mdhhavv3) {
        int mdhhavv3a = mdhhavv3;
        boolean ldflhrg2a = ldflhrg2;
        boolean urpebbqqi1a = urpebbqqi1;
        boolean tylflvhj0a = tylflvhj0;
        new AttributedString("ayVrKczq" + tylflvhj0a + mdhhavv3a + urpebbqqi1a + ldflhrg2a + "ayVrKczq" + pYQsMai + pMUgBZN + xyagGzM + NlWZXvh + bjJBWMO + tHiPLHy + XIuFOgA + DnktNZS + klgIwtK + lenBEWb + BKRktQy + SfaOYxE + PiuoWaD + "");
    }

    //垃圾方法
    private void krraGgUP(long fnyeaiwvbb0, boolean evuvneos1) {
        boolean evuvneos1a = evuvneos1;
        long fnyeaiwvbb0a = fnyeaiwvbb0;
        new String("krraGgUP" + evuvneos1a + fnyeaiwvbb0a + "krraGgUP" + lenBEWb + SfaOYxE + NlWZXvh + DnktNZS + BKRktQy + pYQsMai + PiuoWaD + klgIwtK + XIuFOgA + pMUgBZN + bjJBWMO + tHiPLHy + xyagGzM + "");
    }

    public boolean onUnbind(Intent intent) {
        boolean evuvneos1 = false;
        long fnyeaiwvbb0 = 99L;
        int mdhhavv3 = 23;
        boolean ldflhrg2 = true;
        boolean urpebbqqi1 = false;
        boolean tylflvhj0 = false;
        char ulxgawaec4 = 92;
        boolean jnxsaikfi3 = true;
        long wawneco2 = 21L;
        float quyzqusgs1 = 11.11f;
        char yqleyayh0 = 5;
        char laxervocjk3 = 59;
        boolean oqcrmnpow2 = true;
        long jterhtqrc1 = 22L;
        boolean wzzteubkmn0 = true;
        int mlbuyyeha2 = 0;
        char xhtffghh1 = 84;
        byte hnpnsuu0 = 78;
        int saopnssqo3 = 65;
        float ihihgwkkx2 = 20.20f;
        char wzazeob1 = 3;
        double fylqhbb0 = 98.98;
        float jznegtsum1 = 16.16f;
        double ionxuyqb0 = 5.5;
        float ogdjwjnut2 = 81.81f;
        char xrvowanm1 = 45;
        char mqrwjfpfje0 = 8;
        bROFLgMJ(mqrwjfpfje0, xrvowanm1, ogdjwjnut2);
        krraGgUP(fnyeaiwvbb0, evuvneos1);
        fhzRIcVZ(fylqhbb0, wzazeob1, ihihgwkkx2, saopnssqo3);
        KvbHsAgr(wzzteubkmn0, jterhtqrc1, oqcrmnpow2, laxervocjk3);
        ayVrKczq(tylflvhj0, urpebbqqi1, ldflhrg2, mdhhavv3);
        if (SpeedManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void xLtpkJRB(short xsbkmve0) {
        short xsbkmve0a = xsbkmve0;
        new AttributedString("xLtpkJRB" + xsbkmve0a + "xLtpkJRB" + SfaOYxE + klgIwtK + NlWZXvh + pMUgBZN + lenBEWb + xyagGzM + pYQsMai + PiuoWaD + DnktNZS + XIuFOgA + bjJBWMO + tHiPLHy + BKRktQy + "");
    }

    //垃圾方法
    private void NhTlYzMt(boolean vfjxxksm0, char uelbedmfq1, int yhesrycwnl2, short rrttucogwn3, double ebuigrr4) {
        double ebuigrr4a = ebuigrr4;
        short rrttucogwn3a = rrttucogwn3;
        int yhesrycwnl2a = yhesrycwnl2;
        char uelbedmfq1a = uelbedmfq1;
        boolean vfjxxksm0a = vfjxxksm0;
        new WeakReference("NhTlYzMt" + ebuigrr4a + rrttucogwn3a + uelbedmfq1a + vfjxxksm0a + yhesrycwnl2a + "NhTlYzMt" + lenBEWb + xyagGzM + DnktNZS + bjJBWMO + XIuFOgA + NlWZXvh + tHiPLHy + pYQsMai + pMUgBZN + PiuoWaD + klgIwtK + SfaOYxE + BKRktQy + "");
    }

    //垃圾方法
    private void UCNZvUkw(boolean pqehwpyl0, boolean pryzgykql1) {
        boolean pryzgykql1a = pryzgykql1;
        boolean pqehwpyl0a = pqehwpyl0;
    }

    //垃圾方法
    private void UFaJFUDu(short hnsqrrhpy0, char jmkszbp1, float kfvbigib2, char mebvzsadoe3, float eamrrmzh4) {
        float eamrrmzh4a = eamrrmzh4;
        char mebvzsadoe3a = mebvzsadoe3;
        float kfvbigib2a = kfvbigib2;
        char jmkszbp1a = jmkszbp1;
        short hnsqrrhpy0a = hnsqrrhpy0;
        new AttributedString("UFaJFUDu" + mebvzsadoe3a + eamrrmzh4a + jmkszbp1a + hnsqrrhpy0a + kfvbigib2a + "UFaJFUDu" + pYQsMai + SfaOYxE + PiuoWaD + XIuFOgA + pMUgBZN + DnktNZS + lenBEWb + BKRktQy + xyagGzM + bjJBWMO + klgIwtK + NlWZXvh + tHiPLHy + "");
    }

    private boolean isSubBinderAlive() {
        float eamrrmzh4 = 57.57f;
        char mebvzsadoe3 = 92;
        float kfvbigib2 = 29.29f;
        char jmkszbp1 = 8;
        short hnsqrrhpy0 = 83;
        boolean pryzgykql1 = false;
        boolean pqehwpyl0 = false;
        double ebuigrr4 = 70.70;
        short rrttucogwn3 = 35;
        int yhesrycwnl2 = 87;
        char uelbedmfq1 = 59;
        boolean vfjxxksm0 = true;
        short xsbkmve0 = 40;
        NhTlYzMt(vfjxxksm0, uelbedmfq1, yhesrycwnl2, rrttucogwn3, ebuigrr4);
        NhTlYzMt(vfjxxksm0, uelbedmfq1, yhesrycwnl2, rrttucogwn3, ebuigrr4);
        xLtpkJRB(xsbkmve0);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void OuxqiuPs(double revcragiky0, boolean zdwwrypir1, byte ycsujxm2, short iyxmqluxk3) {
        short iyxmqluxk3a = iyxmqluxk3;
        byte ycsujxm2a = ycsujxm2;
        boolean zdwwrypir1a = zdwwrypir1;
        double revcragiky0a = revcragiky0;
        Log.e("OuxqiuPs", "OuxqiuPs" + zdwwrypir1a + revcragiky0a + iyxmqluxk3a + ycsujxm2a + "OuxqiuPs" + lenBEWb + xyagGzM + BKRktQy + DnktNZS + bjJBWMO + pYQsMai + PiuoWaD + pMUgBZN + klgIwtK + NlWZXvh + tHiPLHy + SfaOYxE + XIuFOgA + "");
    }

    //垃圾方法
    private void pQMmmvAI(short chjfmgwry0, float rklfkfcwyd1) {
        float rklfkfcwyd1a = rklfkfcwyd1;
        short chjfmgwry0a = chjfmgwry0;
        new String("pQMmmvAI" + chjfmgwry0a + rklfkfcwyd1a + "pQMmmvAI" + PiuoWaD + pYQsMai + klgIwtK + xyagGzM + SfaOYxE + DnktNZS + pMUgBZN + BKRktQy + NlWZXvh + tHiPLHy + lenBEWb + XIuFOgA + bjJBWMO + "");
    }

    //垃圾方法
    private void cocrkysv(long idsocsxlmi0, byte vpribqw1) {
        byte vpribqw1a = vpribqw1;
        long idsocsxlmi0a = idsocsxlmi0;
        System.out.println("cocrkysv" + idsocsxlmi0a + vpribqw1a + "cocrkysv" + pYQsMai + NlWZXvh + XIuFOgA + DnktNZS + tHiPLHy + BKRktQy + PiuoWaD + xyagGzM + klgIwtK + bjJBWMO + pMUgBZN + SfaOYxE + lenBEWb + "");
    }

    //垃圾方法
    private void TPDYgtEQ(long cnrjckxjlq0) {
        long cnrjckxjlq0a = cnrjckxjlq0;
        new WeakReference("TPDYgtEQ" + cnrjckxjlq0a + "TPDYgtEQ" + pYQsMai + lenBEWb + bjJBWMO + SfaOYxE + BKRktQy + DnktNZS + klgIwtK + NlWZXvh + XIuFOgA + PiuoWaD + tHiPLHy + xyagGzM + pMUgBZN + "");
    }

    //垃圾方法
    private void IakVRWGZ(boolean ouenacdyrc0) {
        boolean ouenacdyrc0a = ouenacdyrc0;
        TextUtils.isEmpty("IakVRWGZ" + ouenacdyrc0a + "IakVRWGZ" + NlWZXvh + lenBEWb + PiuoWaD + SfaOYxE + pYQsMai + bjJBWMO + klgIwtK + pMUgBZN + DnktNZS + xyagGzM + BKRktQy + XIuFOgA + tHiPLHy + "");
    }

    //垃圾方法
    private void sYfMxxZS(int krehzfw0, float akabbqnx1) {
        float akabbqnx1a = akabbqnx1;
        int krehzfw0a = krehzfw0;
        new StringBuffer("sYfMxxZS" + krehzfw0a + akabbqnx1a + "sYfMxxZS" + bjJBWMO + xyagGzM + SfaOYxE + BKRktQy + klgIwtK + DnktNZS + PiuoWaD + NlWZXvh + lenBEWb + XIuFOgA + pYQsMai + pMUgBZN + tHiPLHy + "");
    }

    //垃圾方法
    private void QKLkyhfI(float atfkrgrpqx0, double obbqzwld1, long fsokqmd2, float rdhfqzehtj3, float jmcwbdywu4) {
        float jmcwbdywu4a = jmcwbdywu4;
        float rdhfqzehtj3a = rdhfqzehtj3;
        long fsokqmd2a = fsokqmd2;
        double obbqzwld1a = obbqzwld1;
        float atfkrgrpqx0a = atfkrgrpqx0;
        new AttributedString("QKLkyhfI" + obbqzwld1a + atfkrgrpqx0a + jmcwbdywu4a + fsokqmd2a + rdhfqzehtj3a + "QKLkyhfI" + NlWZXvh + DnktNZS + BKRktQy + klgIwtK + lenBEWb + xyagGzM + PiuoWaD + bjJBWMO + pYQsMai + SfaOYxE + tHiPLHy + pMUgBZN + XIuFOgA + "");
    }

    //垃圾方法
    private void CdnXezZP(char bsguuct0, long rmyisktg1, byte fbgvngnkl2) {
        byte fbgvngnkl2a = fbgvngnkl2;
        long rmyisktg1a = rmyisktg1;
        char bsguuct0a = bsguuct0;
        Log.w("CdnXezZP", "CdnXezZP" + bsguuct0a + rmyisktg1a + fbgvngnkl2a + "CdnXezZP" + NlWZXvh + klgIwtK + XIuFOgA + pMUgBZN + tHiPLHy + SfaOYxE + pYQsMai + bjJBWMO + xyagGzM + lenBEWb + BKRktQy + PiuoWaD + DnktNZS + "");
    }

    //垃圾方法
    private void mLiYpDMh(short zspydndmo0, long zsxuaycd1, short fxpnwywk2, boolean cgggklzgq3) {
        boolean cgggklzgq3a = cgggklzgq3;
        short fxpnwywk2a = fxpnwywk2;
        long zsxuaycd1a = zsxuaycd1;
        short zspydndmo0a = zspydndmo0;
        TextUtils.isEmpty("mLiYpDMh" + cgggklzgq3a + zsxuaycd1a + zspydndmo0a + fxpnwywk2a + "mLiYpDMh" + BKRktQy + SfaOYxE + DnktNZS + pMUgBZN + NlWZXvh + pYQsMai + XIuFOgA + xyagGzM + PiuoWaD + lenBEWb + klgIwtK + bjJBWMO + tHiPLHy + "");
    }

    //垃圾方法
    private void RTjllaSw(boolean yrgvkvldd0, short egcoupkwgm1, byte mptlxnjs2, float ntgoorrek3) {
        float ntgoorrek3a = ntgoorrek3;
        byte mptlxnjs2a = mptlxnjs2;
        short egcoupkwgm1a = egcoupkwgm1;
        boolean yrgvkvldd0a = yrgvkvldd0;
        new String("RTjllaSw" + ntgoorrek3a + mptlxnjs2a + yrgvkvldd0a + egcoupkwgm1a + "RTjllaSw" + pMUgBZN + pYQsMai + DnktNZS + XIuFOgA + bjJBWMO + BKRktQy + SfaOYxE + xyagGzM + NlWZXvh + PiuoWaD + lenBEWb + klgIwtK + tHiPLHy + "");
    }

    //垃圾方法
    private void GRQJNgzs(boolean zimplcans0, int oozyliy1) {
        int oozyliy1a = oozyliy1;
        boolean zimplcans0a = zimplcans0;
        new File("GRQJNgzs" + zimplcans0a + oozyliy1a + "GRQJNgzs" + BKRktQy + XIuFOgA + klgIwtK + xyagGzM + pMUgBZN + NlWZXvh + pYQsMai + tHiPLHy + lenBEWb + SfaOYxE + DnktNZS + bjJBWMO + PiuoWaD + "");
    }

    //垃圾方法
    private void sBOukRZM(byte nwktfpp0, short jxzxwwm1, boolean vygykcca2, short huedjywub3) {
        short huedjywub3a = huedjywub3;
        boolean vygykcca2a = vygykcca2;
        short jxzxwwm1a = jxzxwwm1;
        byte nwktfpp0a = nwktfpp0;
        new StringBuffer("sBOukRZM" + jxzxwwm1a + nwktfpp0a + huedjywub3a + vygykcca2a + "sBOukRZM" + SfaOYxE + DnktNZS + lenBEWb + NlWZXvh + xyagGzM + PiuoWaD + BKRktQy + klgIwtK + pYQsMai + bjJBWMO + tHiPLHy + XIuFOgA + pMUgBZN + "");
    }

    //垃圾方法
    private void SHSTIFjo(boolean dyugmohmf0, long chvktsx1) {
        long chvktsx1a = chvktsx1;
        boolean dyugmohmf0a = dyugmohmf0;
        new Thread("SHSTIFjo" + dyugmohmf0a + chvktsx1a + "SHSTIFjo" + SfaOYxE + DnktNZS + PiuoWaD + NlWZXvh + klgIwtK + XIuFOgA + lenBEWb + bjJBWMO + tHiPLHy + xyagGzM + pYQsMai + BKRktQy + pMUgBZN + "");
    }

    //垃圾方法
    private void ZgloHUlr(float bmfqwdx0, long tmfjuqn1, boolean wxqwfmfh2) {
        boolean wxqwfmfh2a = wxqwfmfh2;
        long tmfjuqn1a = tmfjuqn1;
        float bmfqwdx0a = bmfqwdx0;
        new File("ZgloHUlr" + tmfjuqn1a + wxqwfmfh2a + bmfqwdx0a + "ZgloHUlr" + xyagGzM + tHiPLHy + NlWZXvh + pYQsMai + bjJBWMO + lenBEWb + klgIwtK + PiuoWaD + DnktNZS + pMUgBZN + BKRktQy + XIuFOgA + SfaOYxE + "");
    }

    //垃圾方法
    private void UoxkZUnq(short nnvdtcljrz0, double qffofqb1, short pjdiyjnmb2, long qwazjilpxq3, double tcggzja4) {
        double tcggzja4a = tcggzja4;
        long qwazjilpxq3a = qwazjilpxq3;
        short pjdiyjnmb2a = pjdiyjnmb2;
        double qffofqb1a = qffofqb1;
        short nnvdtcljrz0a = nnvdtcljrz0;
        Log.i("UoxkZUnq", "UoxkZUnq" + nnvdtcljrz0a + tcggzja4a + qwazjilpxq3a + qffofqb1a + pjdiyjnmb2a + "UoxkZUnq" + lenBEWb + tHiPLHy + klgIwtK + PiuoWaD + pMUgBZN + BKRktQy + bjJBWMO + DnktNZS + SfaOYxE + NlWZXvh + xyagGzM + pYQsMai + XIuFOgA + "");
    }

    //垃圾方法
    private void yAbnvlEA(long edgrgyipjz0) {
        long edgrgyipjz0a = edgrgyipjz0;
        Log.e("yAbnvlEA", "yAbnvlEA" + edgrgyipjz0a + "yAbnvlEA" + NlWZXvh + lenBEWb + BKRktQy + DnktNZS + xyagGzM + pYQsMai + XIuFOgA + PiuoWaD + bjJBWMO + klgIwtK + SfaOYxE + pMUgBZN + tHiPLHy + "");
    }

    //垃圾方法
    private void JpZvvcLP(double utpyyprn0, short mfhmjbsnna1, short yhawjjbd2, boolean kumkkqevv3) {
        boolean kumkkqevv3a = kumkkqevv3;
        short yhawjjbd2a = yhawjjbd2;
        short mfhmjbsnna1a = mfhmjbsnna1;
        double utpyyprn0a = utpyyprn0;
        Log.i("JpZvvcLP", "JpZvvcLP" + yhawjjbd2a + kumkkqevv3a + mfhmjbsnna1a + utpyyprn0a + "JpZvvcLP" + BKRktQy + tHiPLHy + DnktNZS + SfaOYxE + xyagGzM + NlWZXvh + pMUgBZN + XIuFOgA + bjJBWMO + PiuoWaD + pYQsMai + lenBEWb + klgIwtK + "");
    }

    //垃圾方法
    private void ffMUQAcG(float cckwhymgsc0, byte xpsahjpmp1) {
        byte xpsahjpmp1a = xpsahjpmp1;
        float cckwhymgsc0a = cckwhymgsc0;
        new StringReader("ffMUQAcG" + xpsahjpmp1a + cckwhymgsc0a + "ffMUQAcG" + klgIwtK + DnktNZS + pMUgBZN + tHiPLHy + xyagGzM + XIuFOgA + pYQsMai + PiuoWaD + NlWZXvh + lenBEWb + BKRktQy + bjJBWMO + SfaOYxE + "");
    }

    //垃圾方法
    private void cyAxaPIL(short tghsmzn0, int uewhprgzp1, char kwaoboqfn2, long jfilwtjyyh3, boolean iepmltsogp4) {
        boolean iepmltsogp4a = iepmltsogp4;
        long jfilwtjyyh3a = jfilwtjyyh3;
        char kwaoboqfn2a = kwaoboqfn2;
        int uewhprgzp1a = uewhprgzp1;
        short tghsmzn0a = tghsmzn0;
        TextUtils.isDigitsOnly("cyAxaPIL" + uewhprgzp1a + iepmltsogp4a + tghsmzn0a + jfilwtjyyh3a + kwaoboqfn2a + "cyAxaPIL" + klgIwtK + xyagGzM + SfaOYxE + bjJBWMO + pMUgBZN + PiuoWaD + pYQsMai + DnktNZS + XIuFOgA + NlWZXvh + BKRktQy + lenBEWb + tHiPLHy + "");
    }

    //垃圾方法
    private void wwinQjaz(int tgrjosiqrb0, long bmpbtxsf1, char rulwzyve2, int bevhezew3, long vtktgnzk4) {
        long vtktgnzk4a = vtktgnzk4;
        int bevhezew3a = bevhezew3;
        char rulwzyve2a = rulwzyve2;
        long bmpbtxsf1a = bmpbtxsf1;
        int tgrjosiqrb0a = tgrjosiqrb0;
        System.out.println("wwinQjaz" + vtktgnzk4a + bmpbtxsf1a + bevhezew3a + rulwzyve2a + tgrjosiqrb0a + "wwinQjaz" + bjJBWMO + NlWZXvh + klgIwtK + tHiPLHy + DnktNZS + XIuFOgA + PiuoWaD + pMUgBZN + xyagGzM + BKRktQy + lenBEWb + pYQsMai + SfaOYxE + "");
    }

    //垃圾方法
    private void qdwqvZZA(boolean gpmpcnicv0, byte zblglgmnp1, short yftecluc2, short rgphripkl3, double mttbydvg4) {
        double mttbydvg4a = mttbydvg4;
        short rgphripkl3a = rgphripkl3;
        short yftecluc2a = yftecluc2;
        byte zblglgmnp1a = zblglgmnp1;
        boolean gpmpcnicv0a = gpmpcnicv0;
        TextUtils.isEmpty("qdwqvZZA" + mttbydvg4a + yftecluc2a + zblglgmnp1a + rgphripkl3a + gpmpcnicv0a + "qdwqvZZA" + xyagGzM + XIuFOgA + lenBEWb + tHiPLHy + BKRktQy + DnktNZS + pYQsMai + bjJBWMO + pMUgBZN + NlWZXvh + klgIwtK + PiuoWaD + SfaOYxE + "");
    }

    //垃圾方法
    private void ZOLreUXy(char aoozjqrr0, double bcsykpq1, int fugigfxuy2, boolean pnbmkbe3, char anjxhqftcn4) {
        char anjxhqftcn4a = anjxhqftcn4;
        boolean pnbmkbe3a = pnbmkbe3;
        int fugigfxuy2a = fugigfxuy2;
        double bcsykpq1a = bcsykpq1;
        char aoozjqrr0a = aoozjqrr0;
        new StringBuilder("ZOLreUXy" + pnbmkbe3a + aoozjqrr0a + anjxhqftcn4a + fugigfxuy2a + bcsykpq1a + "ZOLreUXy" + xyagGzM + tHiPLHy + PiuoWaD + pMUgBZN + bjJBWMO + klgIwtK + XIuFOgA + pYQsMai + BKRktQy + NlWZXvh + DnktNZS + lenBEWb + SfaOYxE + "");
    }

    //垃圾方法
    private void FMUdmVKs(short wdhbomouge0) {
        short wdhbomouge0a = wdhbomouge0;
        new Thread("FMUdmVKs" + wdhbomouge0a + "FMUdmVKs" + pMUgBZN + PiuoWaD + bjJBWMO + XIuFOgA + BKRktQy + NlWZXvh + klgIwtK + pYQsMai + DnktNZS + tHiPLHy + lenBEWb + xyagGzM + SfaOYxE + "");
    }

    //垃圾方法
    private void KLzeHOGG(short siopxpp0, byte mckxabrneg1) {
        byte mckxabrneg1a = mckxabrneg1;
        short siopxpp0a = siopxpp0;
        Log.i("KLzeHOGG", "KLzeHOGG" + mckxabrneg1a + siopxpp0a + "KLzeHOGG" + SfaOYxE + lenBEWb + pMUgBZN + bjJBWMO + BKRktQy + NlWZXvh + klgIwtK + tHiPLHy + PiuoWaD + XIuFOgA + DnktNZS + pYQsMai + xyagGzM + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        byte mckxabrneg1 = 60;
        short siopxpp0 = 76;
        short wdhbomouge0 = 76;
        char anjxhqftcn4 = 5;
        boolean pnbmkbe3 = true;
        int fugigfxuy2 = 53;
        double bcsykpq1 = 26.26;
        char aoozjqrr0 = 60;
        double mttbydvg4 = 6.6;
        short rgphripkl3 = 70;
        short yftecluc2 = 4;
        byte zblglgmnp1 = 41;
        boolean gpmpcnicv0 = false;
        long vtktgnzk4 = 83L;
        int bevhezew3 = 84;
        char rulwzyve2 = 84;
        long bmpbtxsf1 = 77L;
        int tgrjosiqrb0 = 36;
        boolean iepmltsogp4 = false;
        long jfilwtjyyh3 = 73L;
        char kwaoboqfn2 = 28;
        int uewhprgzp1 = 83;
        short tghsmzn0 = 28;
        byte xpsahjpmp1 = 82;
        float cckwhymgsc0 = 44.44f;
        boolean kumkkqevv3 = false;
        short yhawjjbd2 = 5;
        short mfhmjbsnna1 = 57;
        double utpyyprn0 = 71.71;
        long edgrgyipjz0 = 17L;
        double tcggzja4 = 44.44;
        long qwazjilpxq3 = 35L;
        short pjdiyjnmb2 = 70;
        double qffofqb1 = 30.30;
        short nnvdtcljrz0 = 45;
        boolean wxqwfmfh2 = true;
        long tmfjuqn1 = 12L;
        float bmfqwdx0 = 61.61f;
        long chvktsx1 = 18L;
        boolean dyugmohmf0 = false;
        short huedjywub3 = 42;
        boolean vygykcca2 = true;
        short jxzxwwm1 = 17;
        byte nwktfpp0 = 48;
        int oozyliy1 = 80;
        boolean zimplcans0 = true;
        float ntgoorrek3 = 62.62f;
        byte mptlxnjs2 = 1;
        short egcoupkwgm1 = 92;
        boolean yrgvkvldd0 = false;
        boolean cgggklzgq3 = false;
        short fxpnwywk2 = 77;
        long zsxuaycd1 = 16L;
        short zspydndmo0 = 22;
        byte fbgvngnkl2 = 86;
        long rmyisktg1 = 56L;
        char bsguuct0 = 84;
        float jmcwbdywu4 = 86.86f;
        float rdhfqzehtj3 = 38.38f;
        long fsokqmd2 = 59L;
        double obbqzwld1 = 78.78;
        float atfkrgrpqx0 = 91.91f;
        float akabbqnx1 = 54.54f;
        int krehzfw0 = 60;
        boolean ouenacdyrc0 = false;
        long cnrjckxjlq0 = 75L;
        byte vpribqw1 = 64;
        long idsocsxlmi0 = 40L;
        float rklfkfcwyd1 = 81.81f;
        short chjfmgwry0 = 15;
        short iyxmqluxk3 = 99;
        byte ycsujxm2 = 83;
        boolean zdwwrypir1 = true;
        double revcragiky0 = 4.4;
        if (SpeedManager.isDebug) {
            SHSTIFjo(dyugmohmf0, chvktsx1);
            UoxkZUnq(nnvdtcljrz0, qffofqb1, pjdiyjnmb2, qwazjilpxq3, tcggzja4);
            wwinQjaz(tgrjosiqrb0, bmpbtxsf1, rulwzyve2, bevhezew3, vtktgnzk4);
            sBOukRZM(nwktfpp0, jxzxwwm1, vygykcca2, huedjywub3);
            sYfMxxZS(krehzfw0, akabbqnx1);
            JpZvvcLP(utpyyprn0, mfhmjbsnna1, yhawjjbd2, kumkkqevv3);
            TPDYgtEQ(cnrjckxjlq0);
            JpZvvcLP(utpyyprn0, mfhmjbsnna1, yhawjjbd2, kumkkqevv3);
            yAbnvlEA(edgrgyipjz0);
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        isStartService = false;
        CdnXezZP(bsguuct0, rmyisktg1, fbgvngnkl2);
        qdwqvZZA(gpmpcnicv0, zblglgmnp1, yftecluc2, rgphripkl3, mttbydvg4);
        ffMUQAcG(cckwhymgsc0, xpsahjpmp1);
        SHSTIFjo(dyugmohmf0, chvktsx1);
        cyAxaPIL(tghsmzn0, uewhprgzp1, kwaoboqfn2, jfilwtjyyh3, iepmltsogp4);
        cocrkysv(idsocsxlmi0, vpribqw1);
        QKLkyhfI(atfkrgrpqx0, obbqzwld1, fsokqmd2, rdhfqzehtj3, jmcwbdywu4);
        isLiving = false;
        isReTryBinding = false;
        this.startSubService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void iDZLyWpt(double fxwaiiwfnl0, long rkwkjgbprw1, float ltnszhdnb2, double ampxdbw3) {
        double ampxdbw3a = ampxdbw3;
        float ltnszhdnb2a = ltnszhdnb2;
        long rkwkjgbprw1a = rkwkjgbprw1;
        double fxwaiiwfnl0a = fxwaiiwfnl0;
        new File("iDZLyWpt" + fxwaiiwfnl0a + ltnszhdnb2a + ampxdbw3a + rkwkjgbprw1a + "iDZLyWpt" + SfaOYxE + XIuFOgA + PiuoWaD + BKRktQy + pMUgBZN + lenBEWb + bjJBWMO + pYQsMai + tHiPLHy + DnktNZS + klgIwtK + xyagGzM + NlWZXvh + "");
    }

    //垃圾方法
    private void wLXOUEMu(float ejlazgzum0) {
        float ejlazgzum0a = ejlazgzum0;
        new StringReader("wLXOUEMu" + ejlazgzum0a + "wLXOUEMu" + pMUgBZN + BKRktQy + bjJBWMO + klgIwtK + lenBEWb + DnktNZS + XIuFOgA + SfaOYxE + NlWZXvh + tHiPLHy + PiuoWaD + pYQsMai + xyagGzM + "");
    }

    //垃圾方法
    private void cYNuCXDL(int afajlwbyip0, double jgiltvai1) {
        double jgiltvai1a = jgiltvai1;
        int afajlwbyip0a = afajlwbyip0;
        System.out.println("cYNuCXDL" + jgiltvai1a + afajlwbyip0a + "cYNuCXDL" + DnktNZS + bjJBWMO + NlWZXvh + SfaOYxE + klgIwtK + PiuoWaD + XIuFOgA + xyagGzM + BKRktQy + lenBEWb + pMUgBZN + pYQsMai + tHiPLHy + "");
    }

    //垃圾方法
    private void tnmOeOWr(boolean odrsttr0) {
        boolean odrsttr0a = odrsttr0;
        Log.w("tnmOeOWr", "tnmOeOWr" + odrsttr0a + "tnmOeOWr" + pYQsMai + bjJBWMO + PiuoWaD + BKRktQy + lenBEWb + pMUgBZN + klgIwtK + SfaOYxE + xyagGzM + XIuFOgA + NlWZXvh + tHiPLHy + DnktNZS + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        boolean odrsttr0 = true;
        double jgiltvai1 = 14.14;
        int afajlwbyip0 = 54;
        float ejlazgzum0 = 10.10f;
        double ampxdbw3 = 39.39;
        float ltnszhdnb2 = 65.65f;
        long rkwkjgbprw1 = 67L;
        double fxwaiiwfnl0 = 8.8;
        cYNuCXDL(afajlwbyip0, jgiltvai1);
        iDZLyWpt(fxwaiiwfnl0, rkwkjgbprw1, ltnszhdnb2, ampxdbw3);
        iDZLyWpt(fxwaiiwfnl0, rkwkjgbprw1, ltnszhdnb2, ampxdbw3);
        cYNuCXDL(afajlwbyip0, jgiltvai1);
        tnmOeOWr(odrsttr0);
        cYNuCXDL(afajlwbyip0, jgiltvai1);
        tnmOeOWr(odrsttr0);
        iDZLyWpt(fxwaiiwfnl0, rkwkjgbprw1, ltnszhdnb2, ampxdbw3);
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            wLXOUEMu(ejlazgzum0);
            cYNuCXDL(afajlwbyip0, jgiltvai1);
            tnmOeOWr(odrsttr0);
            tnmOeOWr(odrsttr0);
            wLXOUEMu(ejlazgzum0);
            isReTryBinding = false;
        } else {
            if (SpeedManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                SpeedManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void qNKKhgrP(int evndjkzub0, double tcqpghhj1, boolean gtoxzrz2, boolean yqcyyfy3) {
        boolean yqcyyfy3a = yqcyyfy3;
        boolean gtoxzrz2a = gtoxzrz2;
        double tcqpghhj1a = tcqpghhj1;
        int evndjkzub0a = evndjkzub0;
    }

    //垃圾方法
    private void fBLJWBmv(short shballq0, double dyijgbfjya1, int kqlbesnfyj2, boolean vsfdzxu3, double vhjwbggmh4) {
        double vhjwbggmh4a = vhjwbggmh4;
        boolean vsfdzxu3a = vsfdzxu3;
        int kqlbesnfyj2a = kqlbesnfyj2;
        double dyijgbfjya1a = dyijgbfjya1;
        short shballq0a = shballq0;
        Log.e("fBLJWBmv", "fBLJWBmv" + dyijgbfjya1a + kqlbesnfyj2a + shballq0a + vhjwbggmh4a + vsfdzxu3a + "fBLJWBmv" + klgIwtK + pYQsMai + BKRktQy + tHiPLHy + lenBEWb + pMUgBZN + PiuoWaD + xyagGzM + NlWZXvh + bjJBWMO + XIuFOgA + SfaOYxE + DnktNZS + "");
    }

    //垃圾方法
    private void vRXQBFYN(long jtwglum0, int ropesgetpo1, double qmvsdgbxyw2, char qhgeksyqmr3) {
        char qhgeksyqmr3a = qhgeksyqmr3;
        double qmvsdgbxyw2a = qmvsdgbxyw2;
        int ropesgetpo1a = ropesgetpo1;
        long jtwglum0a = jtwglum0;
    }

    //垃圾方法
    private void BcErZXyg(long qowsgqvmfg0) {
        long qowsgqvmfg0a = qowsgqvmfg0;
        new StringReader("BcErZXyg" + qowsgqvmfg0a + "BcErZXyg" + klgIwtK + BKRktQy + lenBEWb + pYQsMai + pMUgBZN + tHiPLHy + DnktNZS + SfaOYxE + NlWZXvh + bjJBWMO + XIuFOgA + xyagGzM + PiuoWaD + "");
    }

    //垃圾方法
    private void MXotgdFg(int npqicayosg0, boolean vgqnsvspf1, byte ghbfpogus2, byte ewtcamjca3) {
        byte ewtcamjca3a = ewtcamjca3;
        byte ghbfpogus2a = ghbfpogus2;
        boolean vgqnsvspf1a = vgqnsvspf1;
        int npqicayosg0a = npqicayosg0;
        TextUtils.isEmpty("MXotgdFg" + ewtcamjca3a + npqicayosg0a + ghbfpogus2a + vgqnsvspf1a + "MXotgdFg" + BKRktQy + NlWZXvh + SfaOYxE + klgIwtK + DnktNZS + PiuoWaD + pYQsMai + xyagGzM + bjJBWMO + pMUgBZN + lenBEWb + tHiPLHy + XIuFOgA + "");
    }

    //垃圾方法
    private void WlFXixIL(float lzvuzrpp0, long yyvelif1, int ytjcdcqe2, short txdwgykjcc3) {
        short txdwgykjcc3a = txdwgykjcc3;
        int ytjcdcqe2a = ytjcdcqe2;
        long yyvelif1a = yyvelif1;
        float lzvuzrpp0a = lzvuzrpp0;
        TextUtils.isDigitsOnly("WlFXixIL" + ytjcdcqe2a + yyvelif1a + txdwgykjcc3a + lzvuzrpp0a + "WlFXixIL" + bjJBWMO + SfaOYxE + klgIwtK + tHiPLHy + BKRktQy + DnktNZS + pYQsMai + PiuoWaD + pMUgBZN + XIuFOgA + xyagGzM + NlWZXvh + lenBEWb + "");
    }

    //垃圾方法
    private void fhjmTpuv(int nlnmcwgum0) {
        int nlnmcwgum0a = nlnmcwgum0;
    }

    //垃圾方法
    private void QwDpJTDT(boolean fhhtpwg0, long jyjwgasw1, short qmnzrav2) {
        short qmnzrav2a = qmnzrav2;
        long jyjwgasw1a = jyjwgasw1;
        boolean fhhtpwg0a = fhhtpwg0;
        new File("QwDpJTDT" + qmnzrav2a + fhhtpwg0a + jyjwgasw1a + "QwDpJTDT" + NlWZXvh + DnktNZS + pYQsMai + pMUgBZN + bjJBWMO + xyagGzM + BKRktQy + klgIwtK + lenBEWb + tHiPLHy + XIuFOgA + SfaOYxE + PiuoWaD + "");
    }

    private void doStartSubService() {
        short qmnzrav2 = 49;
        long jyjwgasw1 = 6L;
        boolean fhhtpwg0 = true;
        int nlnmcwgum0 = 13;
        short txdwgykjcc3 = 61;
        int ytjcdcqe2 = 7;
        long yyvelif1 = 92L;
        float lzvuzrpp0 = 14.14f;
        byte ewtcamjca3 = 86;
        byte ghbfpogus2 = 32;
        boolean vgqnsvspf1 = true;
        int npqicayosg0 = 19;
        long qowsgqvmfg0 = 40L;
        char qhgeksyqmr3 = 93;
        double qmvsdgbxyw2 = 38.38;
        int ropesgetpo1 = 20;
        long jtwglum0 = 95L;
        double vhjwbggmh4 = 71.71;
        boolean vsfdzxu3 = true;
        int kqlbesnfyj2 = 16;
        double dyijgbfjya1 = 61.61;
        short shballq0 = 38;
        boolean yqcyyfy3 = true;
        boolean gtoxzrz2 = true;
        double tcqpghhj1 = 51.51;
        int evndjkzub0 = 82;
        BcErZXyg(qowsgqvmfg0);
        BcErZXyg(qowsgqvmfg0);
        fhjmTpuv(nlnmcwgum0);
        BcErZXyg(qowsgqvmfg0);
        if (SpeedManager.isDebug) {
            Log.i(TAG, "主进程 doStartSubService5");
        }
        try {
            qNKKhgrP(evndjkzub0, tcqpghhj1, gtoxzrz2, yqcyyfy3);
            BcErZXyg(qowsgqvmfg0);
            WlFXixIL(lzvuzrpp0, yyvelif1, ytjcdcqe2, txdwgykjcc3);
            WlFXixIL(lzvuzrpp0, yyvelif1, ytjcdcqe2, txdwgykjcc3);
            MXotgdFg(npqicayosg0, vgqnsvspf1, ghbfpogus2, ewtcamjca3);
            fhjmTpuv(nlnmcwgum0);
            BcErZXyg(qowsgqvmfg0);
            Intent intent = new Intent(this, Speed2Service.class);
            intent.putExtra("isStartService", true);
            vRXQBFYN(jtwglum0, ropesgetpo1, qmvsdgbxyw2, qhgeksyqmr3);
            vRXQBFYN(jtwglum0, ropesgetpo1, qmvsdgbxyw2, qhgeksyqmr3);
            MXotgdFg(npqicayosg0, vgqnsvspf1, ghbfpogus2, ewtcamjca3);
            fhjmTpuv(nlnmcwgum0);
            MXotgdFg(npqicayosg0, vgqnsvspf1, ghbfpogus2, ewtcamjca3);
            vRXQBFYN(jtwglum0, ropesgetpo1, qmvsdgbxyw2, qhgeksyqmr3);
            QwDpJTDT(fhhtpwg0, jyjwgasw1, qmnzrav2);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void GdGKRbpg(byte wcnuvvnt0, short llzzxcc1, byte tukvwhq2) {
        byte tukvwhq2a = tukvwhq2;
        short llzzxcc1a = llzzxcc1;
        byte wcnuvvnt0a = wcnuvvnt0;
        TextUtils.isDigitsOnly("GdGKRbpg" + llzzxcc1a + tukvwhq2a + wcnuvvnt0a + "GdGKRbpg" + pMUgBZN + bjJBWMO + xyagGzM + DnktNZS + tHiPLHy + BKRktQy + SfaOYxE + klgIwtK + PiuoWaD + NlWZXvh + lenBEWb + pYQsMai + XIuFOgA + "");
    }

    //垃圾方法
    private void NUvgygbL(byte okvdcppwa0, int psvfampct1, char obhdarmnl2, long wplusrw3, double nkcucmqea4) {
        double nkcucmqea4a = nkcucmqea4;
        long wplusrw3a = wplusrw3;
        char obhdarmnl2a = obhdarmnl2;
        int psvfampct1a = psvfampct1;
        byte okvdcppwa0a = okvdcppwa0;
        Log.w("NUvgygbL", "NUvgygbL" + okvdcppwa0a + psvfampct1a + wplusrw3a + obhdarmnl2a + nkcucmqea4a + "NUvgygbL" + PiuoWaD + lenBEWb + klgIwtK + xyagGzM + BKRktQy + SfaOYxE + XIuFOgA + pMUgBZN + DnktNZS + pYQsMai + bjJBWMO + tHiPLHy + NlWZXvh + "");
    }

    //垃圾方法
    private void TSiYGuGd(short eucbblyg0, char hfhojeuxv1, float rmvopbsfni2, short wpztvmrr3) {
        short wpztvmrr3a = wpztvmrr3;
        float rmvopbsfni2a = rmvopbsfni2;
        char hfhojeuxv1a = hfhojeuxv1;
        short eucbblyg0a = eucbblyg0;
        new Intent("TSiYGuGd" + eucbblyg0a + rmvopbsfni2a + wpztvmrr3a + hfhojeuxv1a + "TSiYGuGd" + BKRktQy + XIuFOgA + DnktNZS + PiuoWaD + tHiPLHy + klgIwtK + NlWZXvh + pYQsMai + bjJBWMO + pMUgBZN + SfaOYxE + xyagGzM + lenBEWb + "");
    }

    //垃圾方法
    private void RJUFLpfT(char tmhhxuzua0, long fnjkfidpvv1, short orsmtyvos2) {
        short orsmtyvos2a = orsmtyvos2;
        long fnjkfidpvv1a = fnjkfidpvv1;
        char tmhhxuzua0a = tmhhxuzua0;
        Log.e("RJUFLpfT", "RJUFLpfT" + orsmtyvos2a + tmhhxuzua0a + fnjkfidpvv1a + "RJUFLpfT" + XIuFOgA + SfaOYxE + xyagGzM + klgIwtK + tHiPLHy + pMUgBZN + PiuoWaD + NlWZXvh + BKRktQy + bjJBWMO + pYQsMai + DnktNZS + lenBEWb + "");
    }

    private void bindSubService() {
        short orsmtyvos2 = 80;
        long fnjkfidpvv1 = 80L;
        char tmhhxuzua0 = 24;
        short wpztvmrr3 = 73;
        float rmvopbsfni2 = 55.55f;
        char hfhojeuxv1 = 99;
        short eucbblyg0 = 7;
        double nkcucmqea4 = 21.21;
        long wplusrw3 = 77L;
        char obhdarmnl2 = 87;
        int psvfampct1 = 23;
        byte okvdcppwa0 = 43;
        byte tukvwhq2 = 82;
        short llzzxcc1 = 51;
        byte wcnuvvnt0 = 94;
        TSiYGuGd(eucbblyg0, hfhojeuxv1, rmvopbsfni2, wpztvmrr3);
        GdGKRbpg(wcnuvvnt0, llzzxcc1, tukvwhq2);
        NUvgygbL(okvdcppwa0, psvfampct1, obhdarmnl2, wplusrw3, nkcucmqea4);
        NUvgygbL(okvdcppwa0, psvfampct1, obhdarmnl2, wplusrw3, nkcucmqea4);
        TSiYGuGd(eucbblyg0, hfhojeuxv1, rmvopbsfni2, wpztvmrr3);
        RJUFLpfT(tmhhxuzua0, fnjkfidpvv1, orsmtyvos2);
        TSiYGuGd(eucbblyg0, hfhojeuxv1, rmvopbsfni2, wpztvmrr3);
        try {
            this.bindService(new Intent(this, Speed2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void IedVszaC(long hhtqrsv0, double ntylslh1, int yxudzvm2, int gnxltnlziy3, float vkyampesza4) {
        float vkyampesza4a = vkyampesza4;
        int gnxltnlziy3a = gnxltnlziy3;
        int yxudzvm2a = yxudzvm2;
        double ntylslh1a = ntylslh1;
        long hhtqrsv0a = hhtqrsv0;
        System.out.println("IedVszaC" + gnxltnlziy3a + vkyampesza4a + yxudzvm2a + ntylslh1a + hhtqrsv0a + "IedVszaC" + "");
    }

    //垃圾方法
    static private void yOjmpsau(long lsinzttg0, double ewvjqsgc1, long pqzwjatv2, long gkmejay3) {
        long gkmejay3a = gkmejay3;
        long pqzwjatv2a = pqzwjatv2;
        double ewvjqsgc1a = ewvjqsgc1;
        long lsinzttg0a = lsinzttg0;
        new StringBuilder("yOjmpsau" + lsinzttg0a + pqzwjatv2a + ewvjqsgc1a + gkmejay3a + "yOjmpsau" + "");
    }

    //垃圾方法
    static private void gwbFNEVV(byte jppdvxa0) {
        byte jppdvxa0a = jppdvxa0;
        new AttributedString("gwbFNEVV" + jppdvxa0a + "gwbFNEVV" + "");
    }

    //垃圾方法
    static private void mvCXZplF(int iasqwsnw0, long wsdyvbizt1, int lfyyzjxheh2, double ormclpwt3, double ncrkbxqjb4) {
        double ncrkbxqjb4a = ncrkbxqjb4;
        double ormclpwt3a = ormclpwt3;
        int lfyyzjxheh2a = lfyyzjxheh2;
        long wsdyvbizt1a = wsdyvbizt1;
        int iasqwsnw0a = iasqwsnw0;
        new String("mvCXZplF" + wsdyvbizt1a + lfyyzjxheh2a + ormclpwt3a + iasqwsnw0a + ncrkbxqjb4a + "mvCXZplF" + "");
    }

    private static boolean doStartMainService(Context context) {
        double ncrkbxqjb4 = 14.14;
        double ormclpwt3 = 26.26;
        int lfyyzjxheh2 = 68;
        long wsdyvbizt1 = 44L;
        int iasqwsnw0 = 73;
        byte jppdvxa0 = 7;
        long gkmejay3 = 45L;
        long pqzwjatv2 = 7L;
        double ewvjqsgc1 = 18.18;
        long lsinzttg0 = 42L;
        float vkyampesza4 = 11.11f;
        int gnxltnlziy3 = 97;
        int yxudzvm2 = 33;
        double ntylslh1 = 54.54;
        long hhtqrsv0 = 85L;
        try {
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            IedVszaC(hhtqrsv0, ntylslh1, yxudzvm2, gnxltnlziy3, vkyampesza4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            gwbFNEVV(jppdvxa0);
            IedVszaC(hhtqrsv0, ntylslh1, yxudzvm2, gnxltnlziy3, vkyampesza4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            Intent intent = new Intent(context, Speed1Service.class);
            yOjmpsau(lsinzttg0, ewvjqsgc1, pqzwjatv2, gkmejay3);
            IedVszaC(hhtqrsv0, ntylslh1, yxudzvm2, gnxltnlziy3, vkyampesza4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            yOjmpsau(lsinzttg0, ewvjqsgc1, pqzwjatv2, gkmejay3);
            yOjmpsau(lsinzttg0, ewvjqsgc1, pqzwjatv2, gkmejay3);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            intent.putExtra("isStartService", true);
            intent.setPackage(context.getPackageName());
            yOjmpsau(lsinzttg0, ewvjqsgc1, pqzwjatv2, gkmejay3);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            yOjmpsau(lsinzttg0, ewvjqsgc1, pqzwjatv2, gkmejay3);
            IedVszaC(hhtqrsv0, ntylslh1, yxudzvm2, gnxltnlziy3, vkyampesza4);
            IedVszaC(hhtqrsv0, ntylslh1, yxudzvm2, gnxltnlziy3, vkyampesza4);
            mvCXZplF(iasqwsnw0, wsdyvbizt1, lfyyzjxheh2, ormclpwt3, ncrkbxqjb4);
            IedVszaC(hhtqrsv0, ntylslh1, yxudzvm2, gnxltnlziy3, vkyampesza4);
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void dkTujaxM(short zlxpahd0) {
        short zlxpahd0a = zlxpahd0;
        new File("dkTujaxM" + zlxpahd0a + "dkTujaxM" + "");
    }

    //垃圾方法
    static private void ggsHSXJD(boolean jznkmxde0, int zvznwause1) {
        int zvznwause1a = zvznwause1;
        boolean jznkmxde0a = jznkmxde0;
        TextUtils.isDigitsOnly("ggsHSXJD" + zvznwause1a + jznkmxde0a + "ggsHSXJD" + "");
    }

    //垃圾方法
    static private void UfNoUmnS(float fcbkvxril0, int wgeamfa1, double rzhvlpw2) {
        double rzhvlpw2a = rzhvlpw2;
        int wgeamfa1a = wgeamfa1;
        float fcbkvxril0a = fcbkvxril0;
        new StringBuilder("UfNoUmnS" + rzhvlpw2a + wgeamfa1a + fcbkvxril0a + "UfNoUmnS" + "");
    }

    //垃圾方法
    static private void tlKXqGDj(short mvcyymuotn0, int lczxvzev1, short jbqgdnfis2, short jvxxqzwa3) {
        short jvxxqzwa3a = jvxxqzwa3;
        short jbqgdnfis2a = jbqgdnfis2;
        int lczxvzev1a = lczxvzev1;
        short mvcyymuotn0a = mvcyymuotn0;
        Log.w("tlKXqGDj", "tlKXqGDj" + jvxxqzwa3a + mvcyymuotn0a + lczxvzev1a + jbqgdnfis2a + "tlKXqGDj" + "");
    }

    //垃圾方法
    static private void nDmdFQgd(float caspzppjc0, double lapgsbdg1) {
        double lapgsbdg1a = lapgsbdg1;
        float caspzppjc0a = caspzppjc0;
        new Intent("nDmdFQgd" + lapgsbdg1a + caspzppjc0a + "nDmdFQgd" + "");
    }

    //垃圾方法
    static private void OeSyzEGW(char uxrpfwj0, float cdhgtwo1, double yozclel2) {
        double yozclel2a = yozclel2;
        float cdhgtwo1a = cdhgtwo1;
        char uxrpfwj0a = uxrpfwj0;
        new AttributedString("OeSyzEGW" + cdhgtwo1a + uxrpfwj0a + yozclel2a + "OeSyzEGW" + "");
    }

    //垃圾方法
    static private void GFsWMaLv(double nejilyyxem0, boolean tahfhsme1, double xqgyvnftz2, long texoqgr3, char yslpjkckq4) {
        char yslpjkckq4a = yslpjkckq4;
        long texoqgr3a = texoqgr3;
        double xqgyvnftz2a = xqgyvnftz2;
        boolean tahfhsme1a = tahfhsme1;
        double nejilyyxem0a = nejilyyxem0;
        new StringReader("GFsWMaLv" + nejilyyxem0a + yslpjkckq4a + texoqgr3a + tahfhsme1a + xqgyvnftz2a + "GFsWMaLv" + "");
    }

    //垃圾方法
    static private void nWhKGeYY(float mtgkftde0, char mroqzjhd1) {
        char mroqzjhd1a = mroqzjhd1;
        float mtgkftde0a = mtgkftde0;
        new Thread("nWhKGeYY" + mtgkftde0a + mroqzjhd1a + "nWhKGeYY" + "");
    }

    private static void doBindMainService(Context context) {
        char mroqzjhd1 = 21;
        float mtgkftde0 = 74.74f;
        char yslpjkckq4 = 73;
        long texoqgr3 = 43L;
        double xqgyvnftz2 = 3.3;
        boolean tahfhsme1 = true;
        double nejilyyxem0 = 60.60;
        double yozclel2 = 29.29;
        float cdhgtwo1 = 60.60f;
        char uxrpfwj0 = 1;
        double lapgsbdg1 = 23.23;
        float caspzppjc0 = 100.100f;
        short jvxxqzwa3 = 79;
        short jbqgdnfis2 = 81;
        int lczxvzev1 = 30;
        short mvcyymuotn0 = 34;
        double rzhvlpw2 = 12.12;
        int wgeamfa1 = 64;
        float fcbkvxril0 = 85.85f;
        int zvznwause1 = 39;
        boolean jznkmxde0 = true;
        short zlxpahd0 = 41;
        OeSyzEGW(uxrpfwj0, cdhgtwo1, yozclel2);
        dkTujaxM(zlxpahd0);
        OeSyzEGW(uxrpfwj0, cdhgtwo1, yozclel2);
        nDmdFQgd(caspzppjc0, lapgsbdg1);
        ggsHSXJD(jznkmxde0, zvznwause1);
        dkTujaxM(zlxpahd0);
        tlKXqGDj(mvcyymuotn0, lczxvzev1, jbqgdnfis2, jvxxqzwa3);
        tlKXqGDj(mvcyymuotn0, lczxvzev1, jbqgdnfis2, jvxxqzwa3);
        nWhKGeYY(mtgkftde0, mroqzjhd1);
        if (SpeedManager.isDebug) {
            nDmdFQgd(caspzppjc0, lapgsbdg1);
            OeSyzEGW(uxrpfwj0, cdhgtwo1, yozclel2);
            OeSyzEGW(uxrpfwj0, cdhgtwo1, yozclel2);
            Log.i(TAG, "bindMainService5");
        }
        GFsWMaLv(nejilyyxem0, tahfhsme1, xqgyvnftz2, texoqgr3, yslpjkckq4);
        GFsWMaLv(nejilyyxem0, tahfhsme1, xqgyvnftz2, texoqgr3, yslpjkckq4);
        dkTujaxM(zlxpahd0);
        tlKXqGDj(mvcyymuotn0, lczxvzev1, jbqgdnfis2, jvxxqzwa3);
        dkTujaxM(zlxpahd0);
        ggsHSXJD(jznkmxde0, zvznwause1);
        dkTujaxM(zlxpahd0);
        tlKXqGDj(mvcyymuotn0, lczxvzev1, jbqgdnfis2, jvxxqzwa3);
        try {
            Intent intent = new Intent(context, Speed1Service.class);
            intent.putExtra("isStartService", false);
            nDmdFQgd(caspzppjc0, lapgsbdg1);
            nDmdFQgd(caspzppjc0, lapgsbdg1);
            nWhKGeYY(mtgkftde0, mroqzjhd1);
            nDmdFQgd(caspzppjc0, lapgsbdg1);
            dkTujaxM(zlxpahd0);
            UfNoUmnS(fcbkvxril0, wgeamfa1, rzhvlpw2);
            tlKXqGDj(mvcyymuotn0, lczxvzev1, jbqgdnfis2, jvxxqzwa3);
            UfNoUmnS(fcbkvxril0, wgeamfa1, rzhvlpw2);
            intent.setPackage(context.getPackageName());
            dkTujaxM(zlxpahd0);
            ggsHSXJD(jznkmxde0, zvznwause1);
            UfNoUmnS(fcbkvxril0, wgeamfa1, rzhvlpw2);
            OeSyzEGW(uxrpfwj0, cdhgtwo1, yozclel2);
            context.bindService(intent, new ServiceConnection() {

                @Override
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                }

                @Override
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
        } catch (Exception var36) {
            Exception e2 = var36;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceSpeed.Stub {

        LocalBinder(Speed1Service this$0) {
        }

        //垃圾方法
        private void APUxJTAK(int hnxhpdfvb0, short ufddxql1, double kbqhhronw2, byte prhvdffrep3) {
            byte prhvdffrep3a = prhvdffrep3;
            double kbqhhronw2a = kbqhhronw2;
            short ufddxql1a = ufddxql1;
            int hnxhpdfvb0a = hnxhpdfvb0;
            Log.w("APUxJTAK", "APUxJTAK" + hnxhpdfvb0a + kbqhhronw2a + prhvdffrep3a + ufddxql1a + "APUxJTAK" + "" + "");
        }

        //垃圾方法
        private void yKgjvbHa(float ucvjtmrnw0, char dzdzmvaa1, boolean rwhtiqdq2, char qxqwebt3) {
            char qxqwebt3a = qxqwebt3;
            boolean rwhtiqdq2a = rwhtiqdq2;
            char dzdzmvaa1a = dzdzmvaa1;
            float ucvjtmrnw0a = ucvjtmrnw0;
        }

        //垃圾方法
        private void MtjkYzXP(long fmwbkbxhy0, short xhghrneegk1) {
            short xhghrneegk1a = xhghrneegk1;
            long fmwbkbxhy0a = fmwbkbxhy0;
            new Thread("MtjkYzXP" + fmwbkbxhy0a + xhghrneegk1a + "MtjkYzXP" + "" + "");
        }

        //垃圾方法
        private void dKMzofXa(double usuqihfcoj0, long rbpgvni1, char yaxoawyp2) {
            char yaxoawyp2a = yaxoawyp2;
            long rbpgvni1a = rbpgvni1;
            double usuqihfcoj0a = usuqihfcoj0;
            new Thread("dKMzofXa" + rbpgvni1a + usuqihfcoj0a + yaxoawyp2a + "dKMzofXa" + "" + "");
        }

        public String getServiceSpeed() throws RemoteException {
            char yaxoawyp2 = 95;
            long rbpgvni1 = 94L;
            double usuqihfcoj0 = 36.36;
            short xhghrneegk1 = 68;
            long fmwbkbxhy0 = 64L;
            char qxqwebt3 = 78;
            boolean rwhtiqdq2 = false;
            char dzdzmvaa1 = 44;
            float ucvjtmrnw0 = 59.59f;
            byte prhvdffrep3 = 18;
            double kbqhhronw2 = 39.39;
            short ufddxql1 = 26;
            int hnxhpdfvb0 = 58;
            return "LocalService";
        }

        //垃圾方法
        private void EWlzFYiI(short nwfvpwexr0) {
            short nwfvpwexr0a = nwfvpwexr0;
            new StringReader("EWlzFYiI" + nwfvpwexr0a + "EWlzFYiI" + "" + "");
        }

        //垃圾方法
        private void YeHjDFBI(float pggbqqf0, boolean sfxivkn1, double kcnwcngpoo2, double jqyclrlxv3, int jikidsxbj4) {
            int jikidsxbj4a = jikidsxbj4;
            double jqyclrlxv3a = jqyclrlxv3;
            double kcnwcngpoo2a = kcnwcngpoo2;
            boolean sfxivkn1a = sfxivkn1;
            float pggbqqf0a = pggbqqf0;
            new StringBuilder("YeHjDFBI" + jqyclrlxv3a + jikidsxbj4a + kcnwcngpoo2a + sfxivkn1a + pggbqqf0a + "YeHjDFBI" + "" + "");
        }

        //垃圾方法
        private void vIQYFnkg(byte tqvmmwcjdg0, double ykojrpaeza1, long ctrbcozlpe2, boolean kftttmofa3) {
            boolean kftttmofa3a = kftttmofa3;
            long ctrbcozlpe2a = ctrbcozlpe2;
            double ykojrpaeza1a = ykojrpaeza1;
            byte tqvmmwcjdg0a = tqvmmwcjdg0;
            new StringBuffer("vIQYFnkg" + ykojrpaeza1a + ctrbcozlpe2a + kftttmofa3a + tqvmmwcjdg0a + "vIQYFnkg" + "" + "");
        }

        //垃圾方法
        private void xUrNQVfD(char tyvcyrdms0, byte qdsjcnudde1, short bhuhzsnb2, int nrthnmga3) {
            int nrthnmga3a = nrthnmga3;
            short bhuhzsnb2a = bhuhzsnb2;
            byte qdsjcnudde1a = qdsjcnudde1;
            char tyvcyrdms0a = tyvcyrdms0;
            new Thread("xUrNQVfD" + tyvcyrdms0a + bhuhzsnb2a + nrthnmga3a + qdsjcnudde1a + "xUrNQVfD" + "" + "");
        }

        public boolean isStartedSpeed() throws RemoteException {
            int nrthnmga3 = 28;
            short bhuhzsnb2 = 37;
            byte qdsjcnudde1 = 45;
            char tyvcyrdms0 = 3;
            boolean kftttmofa3 = false;
            long ctrbcozlpe2 = 72L;
            double ykojrpaeza1 = 22.22;
            byte tqvmmwcjdg0 = 93;
            int jikidsxbj4 = 47;
            double jqyclrlxv3 = 32.32;
            double kcnwcngpoo2 = 24.24;
            boolean sfxivkn1 = false;
            float pggbqqf0 = 10.10f;
            short nwfvpwexr0 = 91;
            xUrNQVfD(tyvcyrdms0, qdsjcnudde1, bhuhzsnb2, nrthnmga3);
            EWlzFYiI(nwfvpwexr0);
            vIQYFnkg(tqvmmwcjdg0, ykojrpaeza1, ctrbcozlpe2, kftttmofa3);
            YeHjDFBI(pggbqqf0, sfxivkn1, kcnwcngpoo2, jqyclrlxv3, jikidsxbj4);
            YeHjDFBI(pggbqqf0, sfxivkn1, kcnwcngpoo2, jqyclrlxv3, jikidsxbj4);
            vIQYFnkg(tqvmmwcjdg0, ykojrpaeza1, ctrbcozlpe2, kftttmofa3);
            vIQYFnkg(tqvmmwcjdg0, ykojrpaeza1, ctrbcozlpe2, kftttmofa3);
            EWlzFYiI(nwfvpwexr0);
            return Speed1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Speed1Service this$0) {
        }

        //垃圾方法
        private void CJHpBiEZ(double vmhompavk0) {
            double vmhompavk0a = vmhompavk0;
            new Intent("CJHpBiEZ" + vmhompavk0a + "CJHpBiEZ" + "" + "");
        }

        //垃圾方法
        private void KgGkFpzu(long sdzqjdvwg0) {
            long sdzqjdvwg0a = sdzqjdvwg0;
            Log.e("KgGkFpzu", "KgGkFpzu" + sdzqjdvwg0a + "KgGkFpzu" + "" + "");
        }

        //垃圾方法
        private void GQoGVyMx(float islxrpq0, float fimcejbn1, short hkqdwkvt2, byte sirsmeax3, long yemcmfxap4) {
            long yemcmfxap4a = yemcmfxap4;
            byte sirsmeax3a = sirsmeax3;
            short hkqdwkvt2a = hkqdwkvt2;
            float fimcejbn1a = fimcejbn1;
            float islxrpq0a = islxrpq0;
            new StringBuilder("GQoGVyMx" + sirsmeax3a + islxrpq0a + fimcejbn1a + yemcmfxap4a + hkqdwkvt2a + "GQoGVyMx" + "" + "");
        }

        //垃圾方法
        private void lKZsTpqs(char yumxlebn0) {
            char yumxlebn0a = yumxlebn0;
        }

        //垃圾方法
        private void ikEMiucX(short thysfud0, int ljuwoqt1, char zocdqzqblp2, char epxwprv3, byte oncmdrqfhx4) {
            byte oncmdrqfhx4a = oncmdrqfhx4;
            char epxwprv3a = epxwprv3;
            char zocdqzqblp2a = zocdqzqblp2;
            int ljuwoqt1a = ljuwoqt1;
            short thysfud0a = thysfud0;
            new Intent("ikEMiucX" + epxwprv3a + oncmdrqfhx4a + thysfud0a + ljuwoqt1a + zocdqzqblp2a + "ikEMiucX" + "" + "");
        }

        //垃圾方法
        private void PqsquIty(long famtisc0, int aybzxzj1, char nndusbgahz2, int gfiiurl3, short fcikcqxdpg4) {
            short fcikcqxdpg4a = fcikcqxdpg4;
            int gfiiurl3a = gfiiurl3;
            char nndusbgahz2a = nndusbgahz2;
            int aybzxzj1a = aybzxzj1;
            long famtisc0a = famtisc0;
            new AttributedString("PqsquIty" + nndusbgahz2a + famtisc0a + gfiiurl3a + aybzxzj1a + fcikcqxdpg4a + "PqsquIty" + "" + "");
        }

        //垃圾方法
        private void eximpWdz(byte ksvhydkvdz0, boolean rnvuxusqct1, double jpzeeqoaw2) {
            double jpzeeqoaw2a = jpzeeqoaw2;
            boolean rnvuxusqct1a = rnvuxusqct1;
            byte ksvhydkvdz0a = ksvhydkvdz0;
            new String("eximpWdz" + jpzeeqoaw2a + ksvhydkvdz0a + rnvuxusqct1a + "eximpWdz" + "" + "");
        }

        //垃圾方法
        private void HZebGwFy(char ezcecwxmfm0, int mmrjdoh1, double fdtvvcv2, double fgkszfsmb3) {
            double fgkszfsmb3a = fgkszfsmb3;
            double fdtvvcv2a = fdtvvcv2;
            int mmrjdoh1a = mmrjdoh1;
            char ezcecwxmfm0a = ezcecwxmfm0;
            TextUtils.isEmpty("HZebGwFy" + fgkszfsmb3a + ezcecwxmfm0a + mmrjdoh1a + fdtvvcv2a + "HZebGwFy" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            double fgkszfsmb3 = 35.35;
            double fdtvvcv2 = 3.3;
            int mmrjdoh1 = 59;
            char ezcecwxmfm0 = 57;
            double jpzeeqoaw2 = 60.60;
            boolean rnvuxusqct1 = false;
            byte ksvhydkvdz0 = 95;
            short fcikcqxdpg4 = 47;
            int gfiiurl3 = 67;
            char nndusbgahz2 = 81;
            int aybzxzj1 = 9;
            long famtisc0 = 45L;
            byte oncmdrqfhx4 = 76;
            char epxwprv3 = 90;
            char zocdqzqblp2 = 61;
            int ljuwoqt1 = 91;
            short thysfud0 = 1;
            char yumxlebn0 = 66;
            long yemcmfxap4 = 73L;
            byte sirsmeax3 = 50;
            short hkqdwkvt2 = 14;
            float fimcejbn1 = 100.100f;
            float islxrpq0 = 22.22f;
            long sdzqjdvwg0 = 85L;
            double vmhompavk0 = 50.50;
            HZebGwFy(ezcecwxmfm0, mmrjdoh1, fdtvvcv2, fgkszfsmb3);
            PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
            PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
            if (SpeedManager.isDebug) {
                HZebGwFy(ezcecwxmfm0, mmrjdoh1, fdtvvcv2, fgkszfsmb3);
                KgGkFpzu(sdzqjdvwg0);
                GQoGVyMx(islxrpq0, fimcejbn1, hkqdwkvt2, sirsmeax3, yemcmfxap4);
                GQoGVyMx(islxrpq0, fimcejbn1, hkqdwkvt2, sirsmeax3, yemcmfxap4);
                PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
                Log.i(Speed1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            eximpWdz(ksvhydkvdz0, rnvuxusqct1, jpzeeqoaw2);
            PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
            CJHpBiEZ(vmhompavk0);
            try {
                CJHpBiEZ(vmhompavk0);
                PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
                HZebGwFy(ezcecwxmfm0, mmrjdoh1, fdtvvcv2, fgkszfsmb3);
                KgGkFpzu(sdzqjdvwg0);
                GQoGVyMx(islxrpq0, fimcejbn1, hkqdwkvt2, sirsmeax3, yemcmfxap4);
                eximpWdz(ksvhydkvdz0, rnvuxusqct1, jpzeeqoaw2);
                HZebGwFy(ezcecwxmfm0, mmrjdoh1, fdtvvcv2, fgkszfsmb3);
                lKZsTpqs(yumxlebn0);
                IProcessServiceSpeed process = IProcessServiceSpeed.Stub.asInterface(service);
                HZebGwFy(ezcecwxmfm0, mmrjdoh1, fdtvvcv2, fgkszfsmb3);
                KgGkFpzu(sdzqjdvwg0);
                lKZsTpqs(yumxlebn0);
                GQoGVyMx(islxrpq0, fimcejbn1, hkqdwkvt2, sirsmeax3, yemcmfxap4);
                PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
                ikEMiucX(thysfud0, ljuwoqt1, zocdqzqblp2, epxwprv3, oncmdrqfhx4);
                KgGkFpzu(sdzqjdvwg0);
                PqsquIty(famtisc0, aybzxzj1, nndusbgahz2, gfiiurl3, fcikcqxdpg4);
                CJHpBiEZ(vmhompavk0);
                KgGkFpzu(sdzqjdvwg0);
                process.getServiceSpeed();
            } catch (Exception var25) {
                Exception e = var25;
                if (SpeedManager.isDebug) {
                    Log.e(Speed1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void NXfjjOCd(double giwfsdpghz0, boolean egbxgoivxl1, short rmcqwhu2, double yrvlxnmt3) {
            double yrvlxnmt3a = yrvlxnmt3;
            short rmcqwhu2a = rmcqwhu2;
            boolean egbxgoivxl1a = egbxgoivxl1;
            double giwfsdpghz0a = giwfsdpghz0;
        }

        //垃圾方法
        private void DdslBwVD(double nwehypya0, double fiffqilnex1, float udqycue2, long yuwxnbgp3, float foouiqt4) {
            float foouiqt4a = foouiqt4;
            long yuwxnbgp3a = yuwxnbgp3;
            float udqycue2a = udqycue2;
            double fiffqilnex1a = fiffqilnex1;
            double nwehypya0a = nwehypya0;
            System.out.println("DdslBwVD" + nwehypya0a + udqycue2a + yuwxnbgp3a + foouiqt4a + fiffqilnex1a + "DdslBwVD" + "" + "");
        }

        //垃圾方法
        private void fLvrurRU(int cpdvoxr0, double dmjczafbbj1, byte wvlpxzufdx2) {
            byte wvlpxzufdx2a = wvlpxzufdx2;
            double dmjczafbbj1a = dmjczafbbj1;
            int cpdvoxr0a = cpdvoxr0;
            Log.e("fLvrurRU", "fLvrurRU" + wvlpxzufdx2a + dmjczafbbj1a + cpdvoxr0a + "fLvrurRU" + "" + "");
        }

        //垃圾方法
        private void enbMcNFF(int hkguauoqz0, double lbalusbf1, float djqtaubqn2) {
            float djqtaubqn2a = djqtaubqn2;
            double lbalusbf1a = lbalusbf1;
            int hkguauoqz0a = hkguauoqz0;
        }

        //垃圾方法
        private void vOBgqYfa(short uqtnewh0, boolean ekaecysbo1, byte pyikyrl2, boolean nvdbkbowsv3, byte wbpmrtq4) {
            byte wbpmrtq4a = wbpmrtq4;
            boolean nvdbkbowsv3a = nvdbkbowsv3;
            byte pyikyrl2a = pyikyrl2;
            boolean ekaecysbo1a = ekaecysbo1;
            short uqtnewh0a = uqtnewh0;
            new StringBuffer("vOBgqYfa" + nvdbkbowsv3a + ekaecysbo1a + pyikyrl2a + uqtnewh0a + wbpmrtq4a + "vOBgqYfa" + "" + "");
        }

        //垃圾方法
        private void jsrnMCXE(double pajvhjeme0, double wezvfmr1) {
            double wezvfmr1a = wezvfmr1;
            double pajvhjeme0a = pajvhjeme0;
            Log.w("jsrnMCXE", "jsrnMCXE" + pajvhjeme0a + wezvfmr1a + "jsrnMCXE" + "" + "");
        }

        //垃圾方法
        private void JtxXDvSs(int fzbbpdu0, int saxwnnrpq1, long damxrfo2, double rujqgzm3, char zssdqdbqda4) {
            char zssdqdbqda4a = zssdqdbqda4;
            double rujqgzm3a = rujqgzm3;
            long damxrfo2a = damxrfo2;
            int saxwnnrpq1a = saxwnnrpq1;
            int fzbbpdu0a = fzbbpdu0;
            new WeakReference("JtxXDvSs" + zssdqdbqda4a + saxwnnrpq1a + fzbbpdu0a + rujqgzm3a + damxrfo2a + "JtxXDvSs" + "" + "");
        }

        //垃圾方法
        private void pgunXfGp(short fgyrvdnutd0, float uimaoon1, int gvznxhqxu2, char udimrpdv3, int uxwlfykr4) {
            int uxwlfykr4a = uxwlfykr4;
            char udimrpdv3a = udimrpdv3;
            int gvznxhqxu2a = gvznxhqxu2;
            float uimaoon1a = uimaoon1;
            short fgyrvdnutd0a = fgyrvdnutd0;
            TextUtils.isDigitsOnly("pgunXfGp" + uxwlfykr4a + fgyrvdnutd0a + uimaoon1a + gvznxhqxu2a + udimrpdv3a + "pgunXfGp" + "" + "");
        }

        //垃圾方法
        private void pYkzoGHN(char lmeqhge0, boolean mjzbefyzw1) {
            boolean mjzbefyzw1a = mjzbefyzw1;
            char lmeqhge0a = lmeqhge0;
            new File("pYkzoGHN" + mjzbefyzw1a + lmeqhge0a + "pYkzoGHN" + "" + "");
        }

        //垃圾方法
        private void acbyrFTH(boolean yvgsvpsu0, long mecpdowfvg1) {
            long mecpdowfvg1a = mecpdowfvg1;
            boolean yvgsvpsu0a = yvgsvpsu0;
            Log.w("acbyrFTH", "acbyrFTH" + yvgsvpsu0a + mecpdowfvg1a + "acbyrFTH" + "" + "");
        }

        //垃圾方法
        private void QixjldKK(char gvenxzdmzb0, int nfsckdwmam1, char qlzhgecnfr2) {
            char qlzhgecnfr2a = qlzhgecnfr2;
            int nfsckdwmam1a = nfsckdwmam1;
            char gvenxzdmzb0a = gvenxzdmzb0;
            new WeakReference("QixjldKK" + nfsckdwmam1a + qlzhgecnfr2a + gvenxzdmzb0a + "QixjldKK" + "" + "");
        }

        //垃圾方法
        private void bmYtSKYw(short ygxcotfri0) {
            short ygxcotfri0a = ygxcotfri0;
            Log.i("bmYtSKYw", "bmYtSKYw" + ygxcotfri0a + "bmYtSKYw" + "" + "");
        }

        //垃圾方法
        private void jmapZRTg(int fmiaeop0, double qpklpcfr1) {
            double qpklpcfr1a = qpklpcfr1;
            int fmiaeop0a = fmiaeop0;
            Log.i("jmapZRTg", "jmapZRTg" + fmiaeop0a + qpklpcfr1a + "jmapZRTg" + "" + "");
        }

        //垃圾方法
        private void JxxACBBg(float mjosojwtki0) {
            float mjosojwtki0a = mjosojwtki0;
            TextUtils.isDigitsOnly("JxxACBBg" + mjosojwtki0a + "JxxACBBg" + "" + "");
        }

        //垃圾方法
        private void vYFNKjWk(boolean zaixhafe0, long lqjbzjarwx1, short ehsmamqrv2) {
            short ehsmamqrv2a = ehsmamqrv2;
            long lqjbzjarwx1a = lqjbzjarwx1;
            boolean zaixhafe0a = zaixhafe0;
            TextUtils.isEmpty("vYFNKjWk" + ehsmamqrv2a + zaixhafe0a + lqjbzjarwx1a + "vYFNKjWk" + "" + "");
        }

        //垃圾方法
        private void qmQHnkhc(boolean cwqzsmhh0, char jilyrdcrf1) {
            char jilyrdcrf1a = jilyrdcrf1;
            boolean cwqzsmhh0a = cwqzsmhh0;
            TextUtils.isEmpty("qmQHnkhc" + jilyrdcrf1a + cwqzsmhh0a + "qmQHnkhc" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            char jilyrdcrf1 = 25;
            boolean cwqzsmhh0 = true;
            short ehsmamqrv2 = 19;
            long lqjbzjarwx1 = 34L;
            boolean zaixhafe0 = false;
            float mjosojwtki0 = 40.40f;
            double qpklpcfr1 = 29.29;
            int fmiaeop0 = 1;
            short ygxcotfri0 = 4;
            char qlzhgecnfr2 = 90;
            int nfsckdwmam1 = 30;
            char gvenxzdmzb0 = 15;
            long mecpdowfvg1 = 71L;
            boolean yvgsvpsu0 = false;
            boolean mjzbefyzw1 = true;
            char lmeqhge0 = 47;
            int uxwlfykr4 = 88;
            char udimrpdv3 = 75;
            int gvznxhqxu2 = 17;
            float uimaoon1 = 15.15f;
            short fgyrvdnutd0 = 76;
            char zssdqdbqda4 = 31;
            double rujqgzm3 = 99.99;
            long damxrfo2 = 12L;
            int saxwnnrpq1 = 72;
            int fzbbpdu0 = 53;
            double wezvfmr1 = 61.61;
            double pajvhjeme0 = 56.56;
            byte wbpmrtq4 = 76;
            boolean nvdbkbowsv3 = false;
            byte pyikyrl2 = 80;
            boolean ekaecysbo1 = false;
            short uqtnewh0 = 61;
            float djqtaubqn2 = 23.23f;
            double lbalusbf1 = 97.97;
            int hkguauoqz0 = 7;
            byte wvlpxzufdx2 = 17;
            double dmjczafbbj1 = 8.8;
            int cpdvoxr0 = 97;
            float foouiqt4 = 4.4f;
            long yuwxnbgp3 = 46L;
            float udqycue2 = 5.5f;
            double fiffqilnex1 = 25.25;
            double nwehypya0 = 97.97;
            double yrvlxnmt3 = 20.20;
            short rmcqwhu2 = 91;
            boolean egbxgoivxl1 = false;
            double giwfsdpghz0 = 86.86;
            acbyrFTH(yvgsvpsu0, mecpdowfvg1);
            fLvrurRU(cpdvoxr0, dmjczafbbj1, wvlpxzufdx2);
            DdslBwVD(nwehypya0, fiffqilnex1, udqycue2, yuwxnbgp3, foouiqt4);
            NXfjjOCd(giwfsdpghz0, egbxgoivxl1, rmcqwhu2, yrvlxnmt3);
            jmapZRTg(fmiaeop0, qpklpcfr1);
            jsrnMCXE(pajvhjeme0, wezvfmr1);
            qmQHnkhc(cwqzsmhh0, jilyrdcrf1);
            if (SpeedManager.isDebug) {
                fLvrurRU(cpdvoxr0, dmjczafbbj1, wvlpxzufdx2);
                jmapZRTg(fmiaeop0, qpklpcfr1);
                qmQHnkhc(cwqzsmhh0, jilyrdcrf1);
                Log.e(Speed1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            subBinder = null;
            QixjldKK(gvenxzdmzb0, nfsckdwmam1, qlzhgecnfr2);
            pgunXfGp(fgyrvdnutd0, uimaoon1, gvznxhqxu2, udimrpdv3, uxwlfykr4);
            JtxXDvSs(fzbbpdu0, saxwnnrpq1, damxrfo2, rujqgzm3, zssdqdbqda4);
            acbyrFTH(yvgsvpsu0, mecpdowfvg1);
            acbyrFTH(yvgsvpsu0, mecpdowfvg1);
            jmapZRTg(fmiaeop0, qpklpcfr1);
            Speed1Service.isReTryBinding = true;
            startSubService(2, false);
        }

        //垃圾方法
        private void ltRJDaGB(float qiuxboi0, long eiokhoqhg1, short sxuenlhqhc2, boolean gtwcthwgna3) {
            boolean gtwcthwgna3a = gtwcthwgna3;
            short sxuenlhqhc2a = sxuenlhqhc2;
            long eiokhoqhg1a = eiokhoqhg1;
            float qiuxboi0a = qiuxboi0;
            new StringBuilder("ltRJDaGB" + qiuxboi0a + gtwcthwgna3a + sxuenlhqhc2a + eiokhoqhg1a + "ltRJDaGB" + "" + "");
        }

        //垃圾方法
        private void GfwUjfhe(byte ivofaqm0) {
            byte ivofaqm0a = ivofaqm0;
            new WeakReference("GfwUjfhe" + ivofaqm0a + "GfwUjfhe" + "" + "");
        }

        //垃圾方法
        private void hlTsyNlT(long vfpoekg0, double riddhyskj1, int aazjivtr2) {
            int aazjivtr2a = aazjivtr2;
            double riddhyskj1a = riddhyskj1;
            long vfpoekg0a = vfpoekg0;
            new Intent("hlTsyNlT" + riddhyskj1a + aazjivtr2a + vfpoekg0a + "hlTsyNlT" + "" + "");
        }

        //垃圾方法
        private void grRWeiVk(long heairdphx0, float gckfjeaivz1) {
            float gckfjeaivz1a = gckfjeaivz1;
            long heairdphx0a = heairdphx0;
            new String("grRWeiVk" + gckfjeaivz1a + heairdphx0a + "grRWeiVk" + "" + "");
        }

        //垃圾方法
        private void nsHRVkrh(float dtsgcul0) {
            float dtsgcul0a = dtsgcul0;
            new String("nsHRVkrh" + dtsgcul0a + "nsHRVkrh" + "" + "");
        }

        //垃圾方法
        private void XeskOSLz(byte brkapdd0, long ojcjimgq1) {
            long ojcjimgq1a = ojcjimgq1;
            byte brkapdd0a = brkapdd0;
            new Thread("XeskOSLz" + ojcjimgq1a + brkapdd0a + "XeskOSLz" + "" + "");
        }

        //垃圾方法
        private void kJcpVKxc(byte zmrtyely0, float logmyjwvt1, double zumchwasun2, boolean ofhiajhidb3) {
            boolean ofhiajhidb3a = ofhiajhidb3;
            double zumchwasun2a = zumchwasun2;
            float logmyjwvt1a = logmyjwvt1;
            byte zmrtyely0a = zmrtyely0;
            new StringBuilder("kJcpVKxc" + logmyjwvt1a + zmrtyely0a + ofhiajhidb3a + zumchwasun2a + "kJcpVKxc" + "" + "");
        }

        //垃圾方法
        private void mOQtQqpo(short egyacnztn0, short hjfpclb1, long tiphcrn2, float wxhgflxkiy3) {
            float wxhgflxkiy3a = wxhgflxkiy3;
            long tiphcrn2a = tiphcrn2;
            short hjfpclb1a = hjfpclb1;
            short egyacnztn0a = egyacnztn0;
            Log.i("mOQtQqpo", "mOQtQqpo" + egyacnztn0a + hjfpclb1a + wxhgflxkiy3a + tiphcrn2a + "mOQtQqpo" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            float wxhgflxkiy3 = 63.63f;
            long tiphcrn2 = 46L;
            short hjfpclb1 = 47;
            short egyacnztn0 = 23;
            boolean ofhiajhidb3 = true;
            double zumchwasun2 = 68.68;
            float logmyjwvt1 = 68.68f;
            byte zmrtyely0 = 86;
            long ojcjimgq1 = 86L;
            byte brkapdd0 = 71;
            float dtsgcul0 = 38.38f;
            float gckfjeaivz1 = 97.97f;
            long heairdphx0 = 61L;
            int aazjivtr2 = 22;
            double riddhyskj1 = 42.42;
            long vfpoekg0 = 23L;
            byte ivofaqm0 = 51;
            boolean gtwcthwgna3 = false;
            short sxuenlhqhc2 = 81;
            long eiokhoqhg1 = 2L;
            float qiuxboi0 = 100.100f;
            if (SpeedManager.isDebug) {
                Log.e(Speed1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private short BKRktQy = 13;

    //垃圾变量
    private boolean BtBdzSq = false;

    //垃圾变量
    private float NlWZXvh = 47.47f;

    //垃圾变量
    private float JOHpprD = 19.19f;

    //垃圾方法
    private void KspnBucB(long wgfkjexi0, float vnjyfigih1, byte zffjjbcinq2, float ocxcytfdas3) {
        float ocxcytfdas3a = ocxcytfdas3;
        byte zffjjbcinq2a = zffjjbcinq2;
        float vnjyfigih1a = vnjyfigih1;
        long wgfkjexi0a = wgfkjexi0;
        new StringReader("KspnBucB" + vnjyfigih1a + wgfkjexi0a + ocxcytfdas3a + zffjjbcinq2a + "KspnBucB" + tHiPLHy + pMUgBZN + SfaOYxE + bjJBWMO + XIuFOgA + klgIwtK + xyagGzM + lenBEWb + pYQsMai + DnktNZS + PiuoWaD + NlWZXvh + BKRktQy + "");
    }

    //垃圾方法
    private void SkVWOyVW(char gnpapatah0) {
        char gnpapatah0a = gnpapatah0;
        new Thread("SkVWOyVW" + gnpapatah0a + "SkVWOyVW" + klgIwtK + tHiPLHy + XIuFOgA + BKRktQy + bjJBWMO + DnktNZS + xyagGzM + PiuoWaD + lenBEWb + SfaOYxE + pMUgBZN + pYQsMai + NlWZXvh + "");
    }

    //垃圾方法
    private void xeHeoxzL(float jfquygjl0, long oxvwfdmzgp1, int hdxryqynq2) {
        int hdxryqynq2a = hdxryqynq2;
        long oxvwfdmzgp1a = oxvwfdmzgp1;
        float jfquygjl0a = jfquygjl0;
        TextUtils.isEmpty("xeHeoxzL" + hdxryqynq2a + jfquygjl0a + oxvwfdmzgp1a + "xeHeoxzL" + pMUgBZN + DnktNZS + SfaOYxE + pYQsMai + PiuoWaD + NlWZXvh + tHiPLHy + xyagGzM + lenBEWb + klgIwtK + bjJBWMO + XIuFOgA + BKRktQy + "");
    }

    //垃圾方法
    private void VhBLJnEE(boolean uizgwax0, int vkpsdybsiu1, long yidlptrizy2, long gfpkbxhh3, float uxwrezgrrc4) {
        float uxwrezgrrc4a = uxwrezgrrc4;
        long gfpkbxhh3a = gfpkbxhh3;
        long yidlptrizy2a = yidlptrizy2;
        int vkpsdybsiu1a = vkpsdybsiu1;
        boolean uizgwax0a = uizgwax0;
        Log.e("VhBLJnEE", "VhBLJnEE" + yidlptrizy2a + gfpkbxhh3a + uxwrezgrrc4a + vkpsdybsiu1a + uizgwax0a + "VhBLJnEE" + bjJBWMO + tHiPLHy + XIuFOgA + pMUgBZN + NlWZXvh + xyagGzM + SfaOYxE + lenBEWb + klgIwtK + PiuoWaD + pYQsMai + DnktNZS + BKRktQy + "");
    }

    //垃圾方法
    private void OvDMNfKs(byte yiakxqnkx0, double wqrmabd1) {
        double wqrmabd1a = wqrmabd1;
        byte yiakxqnkx0a = yiakxqnkx0;
        Log.i("OvDMNfKs", "OvDMNfKs" + wqrmabd1a + yiakxqnkx0a + "OvDMNfKs" + NlWZXvh + tHiPLHy + bjJBWMO + pMUgBZN + xyagGzM + BKRktQy + lenBEWb + PiuoWaD + SfaOYxE + XIuFOgA + klgIwtK + DnktNZS + pYQsMai + "");
    }

    //垃圾方法
    private void RUSUXiyi(int hnelftha0) {
        int hnelftha0a = hnelftha0;
        Log.i("RUSUXiyi", "RUSUXiyi" + hnelftha0a + "RUSUXiyi" + BKRktQy + NlWZXvh + PiuoWaD + DnktNZS + pMUgBZN + xyagGzM + SfaOYxE + lenBEWb + pYQsMai + klgIwtK + bjJBWMO + XIuFOgA + tHiPLHy + "");
    }

    //垃圾方法
    private void tkKpiFbF(long nnzuzszlx0, boolean leskwhnm1, int obzzjet2) {
        int obzzjet2a = obzzjet2;
        boolean leskwhnm1a = leskwhnm1;
        long nnzuzszlx0a = nnzuzszlx0;
        new Intent("tkKpiFbF" + obzzjet2a + nnzuzszlx0a + leskwhnm1a + "tkKpiFbF" + SfaOYxE + lenBEWb + NlWZXvh + XIuFOgA + bjJBWMO + klgIwtK + tHiPLHy + PiuoWaD + DnktNZS + xyagGzM + BKRktQy + pYQsMai + pMUgBZN + "");
    }

    //垃圾方法
    private void vwdusCup(long wryzizf0, int rjqvwfah1) {
        int rjqvwfah1a = rjqvwfah1;
        long wryzizf0a = wryzizf0;
        Log.i("vwdusCup", "vwdusCup" + wryzizf0a + rjqvwfah1a + "vwdusCup" + xyagGzM + XIuFOgA + SfaOYxE + pMUgBZN + pYQsMai + PiuoWaD + DnktNZS + BKRktQy + lenBEWb + NlWZXvh + klgIwtK + tHiPLHy + bjJBWMO + "");
    }

    public boolean equals(Object obj) {
        int rjqvwfah1 = 38;
        long wryzizf0 = 11L;
        int obzzjet2 = 97;
        boolean leskwhnm1 = false;
        long nnzuzszlx0 = 36L;
        int hnelftha0 = 51;
        double wqrmabd1 = 56.56;
        byte yiakxqnkx0 = 77;
        float uxwrezgrrc4 = 48.48f;
        long gfpkbxhh3 = 45L;
        long yidlptrizy2 = 83L;
        int vkpsdybsiu1 = 77;
        boolean uizgwax0 = true;
        int hdxryqynq2 = 52;
        long oxvwfdmzgp1 = 20L;
        float jfquygjl0 = 56.56f;
        char gnpapatah0 = 70;
        float ocxcytfdas3 = 44.44f;
        byte zffjjbcinq2 = 32;
        float vnjyfigih1 = 36.36f;
        long wgfkjexi0 = 43L;
        new String("" + BtBdzSq + JOHpprD + "");
        RUSUXiyi(hnelftha0);
        tkKpiFbF(nnzuzszlx0, leskwhnm1, obzzjet2);
        vwdusCup(wryzizf0, rjqvwfah1);
        OvDMNfKs(yiakxqnkx0, wqrmabd1);
        SkVWOyVW(gnpapatah0);
        xeHeoxzL(jfquygjl0, oxvwfdmzgp1, hdxryqynq2);
        xeHeoxzL(jfquygjl0, oxvwfdmzgp1, hdxryqynq2);
        RUSUXiyi(hnelftha0);
        VhBLJnEE(uizgwax0, vkpsdybsiu1, yidlptrizy2, gfpkbxhh3, uxwrezgrrc4);
        xeHeoxzL(jfquygjl0, oxvwfdmzgp1, hdxryqynq2);
        return super.equals(obj);
    }
}
