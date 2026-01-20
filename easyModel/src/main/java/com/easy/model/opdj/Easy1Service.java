package com.easy.model.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.easy.IProcessServiceEasy;
import com.easy.model.EasyManager;
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

public class Easy1Service extends Service {

    //垃圾变量
    private double LQqPuTU = 85.85;

    public static long lastTime = 0L;

    //垃圾变量
    private boolean zXYLhoV = true;

    private static String TAG = "xxx";

    //垃圾变量
    private byte bYxWkas = 22;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private double vqwDWZX = 45.45;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private float CqHndnh = 4.4f;

    public static Boolean isLiving = false;

    //垃圾变量
    private boolean BflGoiA = true;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private int DJQzvkX = 80;

    private static long delayTime = 250L;

    //垃圾变量
    private byte ahhKorT = 94;

    public static boolean isStartService = false;

    //垃圾变量
    private boolean PazNwfa = true;

    private IBinder subBinder = null;

    //垃圾变量
    private byte BvisTRo = 55;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private long aLmNOaR = 38L;

    int nextNum = -1;

    public Easy1Service() {
    }

    //垃圾方法
    static private void IuzgmoYj(int ysvtqatt0, int yoejkjhgea1, char xyevbuvxzh2, float jdmlseik3) {
        float jdmlseik3a = jdmlseik3;
        char xyevbuvxzh2a = xyevbuvxzh2;
        int yoejkjhgea1a = yoejkjhgea1;
        int ysvtqatt0a = ysvtqatt0;
        new File("IuzgmoYj" + yoejkjhgea1a + xyevbuvxzh2a + ysvtqatt0a + jdmlseik3a + "IuzgmoYj" + "");
    }

    //垃圾方法
    static private void cyDPUYaU(long mnoejyfns0) {
        long mnoejyfns0a = mnoejyfns0;
        TextUtils.isEmpty("cyDPUYaU" + mnoejyfns0a + "cyDPUYaU" + "");
    }

    //垃圾方法
    static private void xvZbKeBs(short nyhmdeuwa0) {
        short nyhmdeuwa0a = nyhmdeuwa0;
        TextUtils.isDigitsOnly("xvZbKeBs" + nyhmdeuwa0a + "xvZbKeBs" + "");
    }

    //垃圾方法
    static private void nprxBLOh(short tfgtzipx0, char yuaqsgvfb1) {
        char yuaqsgvfb1a = yuaqsgvfb1;
        short tfgtzipx0a = tfgtzipx0;
        Log.i("nprxBLOh", "nprxBLOh" + yuaqsgvfb1a + tfgtzipx0a + "nprxBLOh" + "");
    }

    public static void tryStartLaunchMainService() {
        char yuaqsgvfb1 = 60;
        short tfgtzipx0 = 89;
        short nyhmdeuwa0 = 46;
        long mnoejyfns0 = 40L;
        float jdmlseik3 = 7.7f;
        char xyevbuvxzh2 = 27;
        int yoejkjhgea1 = 68;
        int ysvtqatt0 = 33;
        cyDPUYaU(mnoejyfns0);
        cyDPUYaU(mnoejyfns0);
        cyDPUYaU(mnoejyfns0);
        if (isLiving) {
            if (EasyManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (EasyManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(EasyManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void uxDPjQFy(char akcefbvl0, short iczaitriy1, boolean sfunswx2, double uiyuhejl3) {
        double uiyuhejl3a = uiyuhejl3;
        boolean sfunswx2a = sfunswx2;
        short iczaitriy1a = iczaitriy1;
        char akcefbvl0a = akcefbvl0;
        TextUtils.isEmpty("uxDPjQFy" + iczaitriy1a + akcefbvl0a + uiyuhejl3a + sfunswx2a + "uxDPjQFy" + "");
    }

    //垃圾方法
    static private void pKpREwOb(boolean hnteqqjwq0, boolean vwqauqypi1) {
        boolean vwqauqypi1a = vwqauqypi1;
        boolean hnteqqjwq0a = hnteqqjwq0;
        new Thread("pKpREwOb" + vwqauqypi1a + hnteqqjwq0a + "pKpREwOb" + "");
    }

    //垃圾方法
    static private void uIBVXodb(short wxsxroakhh0) {
        short wxsxroakhh0a = wxsxroakhh0;
    }

    //垃圾方法
    static private void dOILPAEL(double jnelupjwq0, short bxuqpjpgq1) {
        short bxuqpjpgq1a = bxuqpjpgq1;
        double jnelupjwq0a = jnelupjwq0;
        new AttributedString("dOILPAEL" + jnelupjwq0a + bxuqpjpgq1a + "dOILPAEL" + "");
    }

    //垃圾方法
    static private void EDfsdVie(short ghehlyofv0, boolean alhjvhtmnw1) {
        boolean alhjvhtmnw1a = alhjvhtmnw1;
        short ghehlyofv0a = ghehlyofv0;
        Log.w("EDfsdVie", "EDfsdVie" + alhjvhtmnw1a + ghehlyofv0a + "EDfsdVie" + "");
    }

    //垃圾方法
    static private void wLLgVvcK(boolean xmdmtvyt0, boolean rrtndntew1, boolean sbezzew2) {
        boolean sbezzew2a = sbezzew2;
        boolean rrtndntew1a = rrtndntew1;
        boolean xmdmtvyt0a = xmdmtvyt0;
        Log.e("wLLgVvcK", "wLLgVvcK" + sbezzew2a + xmdmtvyt0a + rrtndntew1a + "wLLgVvcK" + "");
    }

    //垃圾方法
    static private void cXKNFdQu(double pqljxpww0, int gkuulsswz1, float hawiaiwawe2) {
        float hawiaiwawe2a = hawiaiwawe2;
        int gkuulsswz1a = gkuulsswz1;
        double pqljxpww0a = pqljxpww0;
        new StringBuilder("cXKNFdQu" + hawiaiwawe2a + gkuulsswz1a + pqljxpww0a + "cXKNFdQu" + "");
    }

    //垃圾方法
    static private void yPBToGXp(long uyfzyfz0, byte urvbzkaeng1, long sgohfcks2, int efmhuixwu3) {
        int efmhuixwu3a = efmhuixwu3;
        long sgohfcks2a = sgohfcks2;
        byte urvbzkaeng1a = urvbzkaeng1;
        long uyfzyfz0a = uyfzyfz0;
        Log.e("yPBToGXp", "yPBToGXp" + efmhuixwu3a + urvbzkaeng1a + uyfzyfz0a + sgohfcks2a + "yPBToGXp" + "");
    }

    private static void startService(Context context) {
        int efmhuixwu3 = 30;
        long sgohfcks2 = 90L;
        byte urvbzkaeng1 = 27;
        long uyfzyfz0 = 71L;
        float hawiaiwawe2 = 59.59f;
        int gkuulsswz1 = 12;
        double pqljxpww0 = 80.80;
        boolean sbezzew2 = false;
        boolean rrtndntew1 = false;
        boolean xmdmtvyt0 = true;
        boolean alhjvhtmnw1 = false;
        short ghehlyofv0 = 21;
        short bxuqpjpgq1 = 18;
        double jnelupjwq0 = 75.75;
        short wxsxroakhh0 = 66;
        boolean vwqauqypi1 = true;
        boolean hnteqqjwq0 = true;
        double uiyuhejl3 = 76.76;
        boolean sfunswx2 = false;
        short iczaitriy1 = 54;
        char akcefbvl0 = 43;
        wLLgVvcK(xmdmtvyt0, rrtndntew1, sbezzew2);
        uxDPjQFy(akcefbvl0, iczaitriy1, sfunswx2, uiyuhejl3);
        wLLgVvcK(xmdmtvyt0, rrtndntew1, sbezzew2);
        yPBToGXp(uyfzyfz0, urvbzkaeng1, sgohfcks2, efmhuixwu3);
        cXKNFdQu(pqljxpww0, gkuulsswz1, hawiaiwawe2);
        dOILPAEL(jnelupjwq0, bxuqpjpgq1);
        pKpREwOb(hnteqqjwq0, vwqauqypi1);
        uxDPjQFy(akcefbvl0, iczaitriy1, sfunswx2, uiyuhejl3);
        if (EasyManager.isDebug) {
            Log.i(TAG, "LocalService startService5");
        }
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void NWbEefIV(short zafyqfz0, char jhsccko1, float vdayohanq2) {
        float vdayohanq2a = vdayohanq2;
        char jhsccko1a = jhsccko1;
        short zafyqfz0a = zafyqfz0;
        Log.e("NWbEefIV", "NWbEefIV" + jhsccko1a + zafyqfz0a + vdayohanq2a + "NWbEefIV" + vqwDWZX + LQqPuTU + zXYLhoV + CqHndnh + yJpNbHm + BvisTRo + ahhKorT + ZkKPTYN + bYxWkas + HIiOkla + BflGoiA + PazNwfa + DJQzvkX + aLmNOaR + "");
    }

    //垃圾方法
    private void HMVqYpcR(double aohhnvdyem0, float nydjdeplvf1) {
        float nydjdeplvf1a = nydjdeplvf1;
        double aohhnvdyem0a = aohhnvdyem0;
        Log.w("HMVqYpcR", "HMVqYpcR" + aohhnvdyem0a + nydjdeplvf1a + "HMVqYpcR" + zXYLhoV + LQqPuTU + PazNwfa + ZkKPTYN + aLmNOaR + BvisTRo + yJpNbHm + ahhKorT + bYxWkas + DJQzvkX + CqHndnh + HIiOkla + vqwDWZX + BflGoiA + "");
    }

    //垃圾方法
    private void aAkPvEiV(long zedzbpg0, double vzgktyylhx1, byte bepupazgf2, boolean dfazvbvoep3) {
        boolean dfazvbvoep3a = dfazvbvoep3;
        byte bepupazgf2a = bepupazgf2;
        double vzgktyylhx1a = vzgktyylhx1;
        long zedzbpg0a = zedzbpg0;
        new Thread("aAkPvEiV" + dfazvbvoep3a + vzgktyylhx1a + zedzbpg0a + bepupazgf2a + "aAkPvEiV" + DJQzvkX + yJpNbHm + zXYLhoV + PazNwfa + aLmNOaR + HIiOkla + ahhKorT + BvisTRo + CqHndnh + bYxWkas + LQqPuTU + ZkKPTYN + vqwDWZX + BflGoiA + "");
    }

    //垃圾方法
    private void oqaZeIDJ(short owmtykr0, short mmzczuwa1, boolean zpepeepjv2, boolean gjxkexmqs3) {
        boolean gjxkexmqs3a = gjxkexmqs3;
        boolean zpepeepjv2a = zpepeepjv2;
        short mmzczuwa1a = mmzczuwa1;
        short owmtykr0a = owmtykr0;
        Log.e("oqaZeIDJ", "oqaZeIDJ" + owmtykr0a + gjxkexmqs3a + zpepeepjv2a + mmzczuwa1a + "oqaZeIDJ" + aLmNOaR + vqwDWZX + yJpNbHm + LQqPuTU + DJQzvkX + ahhKorT + BvisTRo + zXYLhoV + PazNwfa + bYxWkas + ZkKPTYN + CqHndnh + HIiOkla + BflGoiA + "");
    }

    //垃圾方法
    private void fwgaHDug(short cvwmuwxkif0) {
        short cvwmuwxkif0a = cvwmuwxkif0;
        new StringBuilder("fwgaHDug" + cvwmuwxkif0a + "fwgaHDug" + ahhKorT + PazNwfa + vqwDWZX + aLmNOaR + yJpNbHm + DJQzvkX + ZkKPTYN + zXYLhoV + BvisTRo + CqHndnh + HIiOkla + BflGoiA + LQqPuTU + bYxWkas + "");
    }

    //垃圾方法
    private void xpiNNAhw(boolean pgodqfbzpd0, boolean tykzgfnhce1, byte hxkilravrw2) {
        byte hxkilravrw2a = hxkilravrw2;
        boolean tykzgfnhce1a = tykzgfnhce1;
        boolean pgodqfbzpd0a = pgodqfbzpd0;
        new Intent("xpiNNAhw" + tykzgfnhce1a + pgodqfbzpd0a + hxkilravrw2a + "xpiNNAhw" + LQqPuTU + BvisTRo + ahhKorT + ZkKPTYN + zXYLhoV + CqHndnh + bYxWkas + PazNwfa + DJQzvkX + aLmNOaR + yJpNbHm + BflGoiA + vqwDWZX + HIiOkla + "");
    }

    //垃圾方法
    private void oGMHVMbT(double ftjyyeow0, float xubaaubhi1, double aavqkbpblh2, long redstcat3) {
        long redstcat3a = redstcat3;
        double aavqkbpblh2a = aavqkbpblh2;
        float xubaaubhi1a = xubaaubhi1;
        double ftjyyeow0a = ftjyyeow0;
        new File("oGMHVMbT" + xubaaubhi1a + redstcat3a + aavqkbpblh2a + ftjyyeow0a + "oGMHVMbT" + ZkKPTYN + HIiOkla + aLmNOaR + bYxWkas + yJpNbHm + BvisTRo + ahhKorT + BflGoiA + LQqPuTU + CqHndnh + DJQzvkX + zXYLhoV + vqwDWZX + PazNwfa + "");
    }

    //垃圾方法
    private void HStYrlxk(short bjgizzlnf0, short qnvbdwj1, boolean lroqkyekpr2) {
        boolean lroqkyekpr2a = lroqkyekpr2;
        short qnvbdwj1a = qnvbdwj1;
        short bjgizzlnf0a = bjgizzlnf0;
        Log.i("HStYrlxk", "HStYrlxk" + bjgizzlnf0a + lroqkyekpr2a + qnvbdwj1a + "HStYrlxk" + yJpNbHm + ZkKPTYN + PazNwfa + BvisTRo + HIiOkla + aLmNOaR + CqHndnh + LQqPuTU + ahhKorT + bYxWkas + vqwDWZX + zXYLhoV + BflGoiA + DJQzvkX + "");
    }

    //垃圾方法
    private void VOubZSjx(int bzvfddw0, byte rgsxpxbj1) {
        byte rgsxpxbj1a = rgsxpxbj1;
        int bzvfddw0a = bzvfddw0;
        new StringBuffer("VOubZSjx" + bzvfddw0a + rgsxpxbj1a + "VOubZSjx" + zXYLhoV + HIiOkla + DJQzvkX + bYxWkas + vqwDWZX + ZkKPTYN + BvisTRo + BflGoiA + yJpNbHm + PazNwfa + ahhKorT + LQqPuTU + CqHndnh + aLmNOaR + "");
    }

    //垃圾方法
    private void HMJBvJvV(int zkqkwcm0, byte ulkemjxbd1, long tsbdvhpgs2, boolean llvbjuyuf3) {
        boolean llvbjuyuf3a = llvbjuyuf3;
        long tsbdvhpgs2a = tsbdvhpgs2;
        byte ulkemjxbd1a = ulkemjxbd1;
        int zkqkwcm0a = zkqkwcm0;
        Log.w("HMJBvJvV", "HMJBvJvV" + zkqkwcm0a + llvbjuyuf3a + tsbdvhpgs2a + ulkemjxbd1a + "HMJBvJvV" + PazNwfa + BvisTRo + zXYLhoV + aLmNOaR + bYxWkas + LQqPuTU + HIiOkla + CqHndnh + yJpNbHm + ZkKPTYN + DJQzvkX + BflGoiA + ahhKorT + vqwDWZX + "");
    }

    //垃圾方法
    private void XnYIJeVD(char czavggki0, char jypcpgywf1) {
        char jypcpgywf1a = jypcpgywf1;
        char czavggki0a = czavggki0;
        TextUtils.isEmpty("XnYIJeVD" + jypcpgywf1a + czavggki0a + "XnYIJeVD" + zXYLhoV + BvisTRo + ZkKPTYN + CqHndnh + DJQzvkX + yJpNbHm + aLmNOaR + BflGoiA + LQqPuTU + ahhKorT + PazNwfa + bYxWkas + HIiOkla + vqwDWZX + "");
    }

    //垃圾方法
    private void ACkaIEHq(long lxelflpomg0, long fzdcicfwgk1, double hucsqcv2) {
        double hucsqcv2a = hucsqcv2;
        long fzdcicfwgk1a = fzdcicfwgk1;
        long lxelflpomg0a = lxelflpomg0;
        new WeakReference("ACkaIEHq" + hucsqcv2a + lxelflpomg0a + fzdcicfwgk1a + "ACkaIEHq" + HIiOkla + CqHndnh + BvisTRo + yJpNbHm + bYxWkas + ZkKPTYN + PazNwfa + aLmNOaR + ahhKorT + BflGoiA + zXYLhoV + DJQzvkX + vqwDWZX + LQqPuTU + "");
    }

    //垃圾方法
    private void suSsAitK(char mgostwu0, byte bjgvuseunb1) {
        byte bjgvuseunb1a = bjgvuseunb1;
        char mgostwu0a = mgostwu0;
        Log.i("suSsAitK", "suSsAitK" + mgostwu0a + bjgvuseunb1a + "suSsAitK" + DJQzvkX + LQqPuTU + aLmNOaR + BvisTRo + HIiOkla + CqHndnh + vqwDWZX + bYxWkas + ahhKorT + ZkKPTYN + yJpNbHm + zXYLhoV + BflGoiA + PazNwfa + "");
    }

    //垃圾方法
    private void xSczQMQH(byte nqmvseqrrt0, long wqxwquka1, long jccamxl2) {
        long jccamxl2a = jccamxl2;
        long wqxwquka1a = wqxwquka1;
        byte nqmvseqrrt0a = nqmvseqrrt0;
        new File("xSczQMQH" + nqmvseqrrt0a + wqxwquka1a + jccamxl2a + "xSczQMQH" + BvisTRo + bYxWkas + LQqPuTU + ahhKorT + yJpNbHm + ZkKPTYN + vqwDWZX + BflGoiA + PazNwfa + DJQzvkX + zXYLhoV + aLmNOaR + HIiOkla + CqHndnh + "");
    }

    //垃圾方法
    private void LfJtgMCB(float wrsjoyuhn0) {
        float wrsjoyuhn0a = wrsjoyuhn0;
        new String("LfJtgMCB" + wrsjoyuhn0a + "LfJtgMCB" + DJQzvkX + aLmNOaR + zXYLhoV + HIiOkla + BvisTRo + BflGoiA + vqwDWZX + yJpNbHm + ahhKorT + bYxWkas + LQqPuTU + ZkKPTYN + PazNwfa + CqHndnh + "");
    }

    //垃圾方法
    private void dtedNcgt(int aohwxqwtf0, double xaizbpvuy1, boolean guagguwcd2) {
        boolean guagguwcd2a = guagguwcd2;
        double xaizbpvuy1a = xaizbpvuy1;
        int aohwxqwtf0a = aohwxqwtf0;
        TextUtils.isEmpty("dtedNcgt" + guagguwcd2a + aohwxqwtf0a + xaizbpvuy1a + "dtedNcgt" + aLmNOaR + zXYLhoV + BflGoiA + yJpNbHm + HIiOkla + vqwDWZX + ahhKorT + LQqPuTU + PazNwfa + DJQzvkX + ZkKPTYN + bYxWkas + BvisTRo + CqHndnh + "");
    }

    //垃圾方法
    private void cqtIxsOY(byte vecvnwjl0, short ayfhskpjy1) {
        short ayfhskpjy1a = ayfhskpjy1;
        byte vecvnwjl0a = vecvnwjl0;
        new Thread("cqtIxsOY" + vecvnwjl0a + ayfhskpjy1a + "cqtIxsOY" + zXYLhoV + vqwDWZX + LQqPuTU + BflGoiA + CqHndnh + bYxWkas + yJpNbHm + BvisTRo + ahhKorT + DJQzvkX + PazNwfa + ZkKPTYN + HIiOkla + aLmNOaR + "");
    }

    //垃圾方法
    private void xhezhEid(short erqekytvnn0, float qzywpqgiqa1, byte qkwfsosyjt2, long trdphwz3, double fwiqsfyg4) {
        double fwiqsfyg4a = fwiqsfyg4;
        long trdphwz3a = trdphwz3;
        byte qkwfsosyjt2a = qkwfsosyjt2;
        float qzywpqgiqa1a = qzywpqgiqa1;
        short erqekytvnn0a = erqekytvnn0;
        new StringReader("xhezhEid" + trdphwz3a + qkwfsosyjt2a + fwiqsfyg4a + qzywpqgiqa1a + erqekytvnn0a + "xhezhEid" + zXYLhoV + LQqPuTU + vqwDWZX + BvisTRo + ahhKorT + ZkKPTYN + bYxWkas + yJpNbHm + BflGoiA + CqHndnh + HIiOkla + aLmNOaR + DJQzvkX + PazNwfa + "");
    }

    //垃圾方法
    private void QRtPvrjl(int ncapunfiy0, byte ykyduyho1) {
        byte ykyduyho1a = ykyduyho1;
        int ncapunfiy0a = ncapunfiy0;
        TextUtils.isDigitsOnly("QRtPvrjl" + ykyduyho1a + ncapunfiy0a + "QRtPvrjl" + DJQzvkX + BvisTRo + ahhKorT + LQqPuTU + yJpNbHm + CqHndnh + HIiOkla + ZkKPTYN + BflGoiA + aLmNOaR + zXYLhoV + bYxWkas + PazNwfa + vqwDWZX + "");
    }

    //垃圾方法
    private void KMlLNxPP(short qtpdorpsrx0, short kidzhvddcx1) {
        short kidzhvddcx1a = kidzhvddcx1;
        short qtpdorpsrx0a = qtpdorpsrx0;
        new StringBuilder("KMlLNxPP" + qtpdorpsrx0a + kidzhvddcx1a + "KMlLNxPP" + LQqPuTU + yJpNbHm + bYxWkas + PazNwfa + HIiOkla + ZkKPTYN + aLmNOaR + ahhKorT + vqwDWZX + zXYLhoV + BvisTRo + DJQzvkX + CqHndnh + BflGoiA + "");
    }

    //垃圾方法
    private void hKMxKHxb(double dmcnnzibms0, int dpbvhkdnaw1, float oueiejwc2, byte xluwiat3, byte qfonnymb4) {
        byte qfonnymb4a = qfonnymb4;
        byte xluwiat3a = xluwiat3;
        float oueiejwc2a = oueiejwc2;
        int dpbvhkdnaw1a = dpbvhkdnaw1;
        double dmcnnzibms0a = dmcnnzibms0;
        TextUtils.isDigitsOnly("hKMxKHxb" + oueiejwc2a + xluwiat3a + qfonnymb4a + dmcnnzibms0a + dpbvhkdnaw1a + "hKMxKHxb" + CqHndnh + ahhKorT + BvisTRo + vqwDWZX + LQqPuTU + BflGoiA + yJpNbHm + bYxWkas + ZkKPTYN + HIiOkla + zXYLhoV + DJQzvkX + PazNwfa + aLmNOaR + "");
    }

    //垃圾方法
    private void fEMtUXNB(char atafdqo0, double sydnuacqsz1, short uahrccy2, long qldwddlwyz3) {
        long qldwddlwyz3a = qldwddlwyz3;
        short uahrccy2a = uahrccy2;
        double sydnuacqsz1a = sydnuacqsz1;
        char atafdqo0a = atafdqo0;
        new Thread("fEMtUXNB" + sydnuacqsz1a + atafdqo0a + qldwddlwyz3a + uahrccy2a + "fEMtUXNB" + aLmNOaR + LQqPuTU + DJQzvkX + BflGoiA + ZkKPTYN + PazNwfa + bYxWkas + HIiOkla + zXYLhoV + CqHndnh + BvisTRo + vqwDWZX + yJpNbHm + ahhKorT + "");
    }

    //垃圾方法
    private void NfwaSQTK(float ytcpkpmsm0, boolean dbyeeglnfh1, double thhqfameaa2, double aueubhpy3) {
        double aueubhpy3a = aueubhpy3;
        double thhqfameaa2a = thhqfameaa2;
        boolean dbyeeglnfh1a = dbyeeglnfh1;
        float ytcpkpmsm0a = ytcpkpmsm0;
        new Intent("NfwaSQTK" + ytcpkpmsm0a + aueubhpy3a + thhqfameaa2a + dbyeeglnfh1a + "NfwaSQTK" + LQqPuTU + zXYLhoV + yJpNbHm + vqwDWZX + ahhKorT + HIiOkla + PazNwfa + bYxWkas + BvisTRo + ZkKPTYN + CqHndnh + BflGoiA + aLmNOaR + DJQzvkX + "");
    }

    //垃圾方法
    private void eviMirca(int eszmccn0, char wznbncfj1, double aqevwqte2, boolean sgsxqfv3, double gulncki4) {
        double gulncki4a = gulncki4;
        boolean sgsxqfv3a = sgsxqfv3;
        double aqevwqte2a = aqevwqte2;
        char wznbncfj1a = wznbncfj1;
        int eszmccn0a = eszmccn0;
        Log.e("eviMirca", "eviMirca" + sgsxqfv3a + wznbncfj1a + aqevwqte2a + gulncki4a + eszmccn0a + "eviMirca" + zXYLhoV + CqHndnh + HIiOkla + BvisTRo + aLmNOaR + ahhKorT + yJpNbHm + bYxWkas + LQqPuTU + ZkKPTYN + vqwDWZX + BflGoiA + DJQzvkX + PazNwfa + "");
    }

    //垃圾方法
    private void GVSzZxJo(int rwbsywn0, long smomrddqnx1, double stajkrwtu2, float gfxgpkw3, byte joyteiqiz4) {
        byte joyteiqiz4a = joyteiqiz4;
        float gfxgpkw3a = gfxgpkw3;
        double stajkrwtu2a = stajkrwtu2;
        long smomrddqnx1a = smomrddqnx1;
        int rwbsywn0a = rwbsywn0;
        TextUtils.isEmpty("GVSzZxJo" + rwbsywn0a + smomrddqnx1a + joyteiqiz4a + stajkrwtu2a + gfxgpkw3a + "GVSzZxJo" + zXYLhoV + PazNwfa + BvisTRo + bYxWkas + yJpNbHm + aLmNOaR + LQqPuTU + BflGoiA + ahhKorT + ZkKPTYN + CqHndnh + DJQzvkX + HIiOkla + vqwDWZX + "");
    }

    //垃圾方法
    private void jgOcdJMJ(double renpyyk0, int zjnajrgoi1, short phhnofvt2, short ozkxmkq3, long kzrllmg4) {
        long kzrllmg4a = kzrllmg4;
        short ozkxmkq3a = ozkxmkq3;
        short phhnofvt2a = phhnofvt2;
        int zjnajrgoi1a = zjnajrgoi1;
        double renpyyk0a = renpyyk0;
        new StringReader("jgOcdJMJ" + ozkxmkq3a + zjnajrgoi1a + renpyyk0a + phhnofvt2a + kzrllmg4a + "jgOcdJMJ" + HIiOkla + ahhKorT + PazNwfa + DJQzvkX + ZkKPTYN + LQqPuTU + bYxWkas + CqHndnh + yJpNbHm + BflGoiA + vqwDWZX + zXYLhoV + BvisTRo + aLmNOaR + "");
    }

    //垃圾方法
    private void xEaUEMLf(double whqxewhymq0, float mhpibrgnez1, short hriolbsyjx2) {
        short hriolbsyjx2a = hriolbsyjx2;
        float mhpibrgnez1a = mhpibrgnez1;
        double whqxewhymq0a = whqxewhymq0;
        new Intent("xEaUEMLf" + hriolbsyjx2a + whqxewhymq0a + mhpibrgnez1a + "xEaUEMLf" + BvisTRo + LQqPuTU + yJpNbHm + vqwDWZX + BflGoiA + DJQzvkX + HIiOkla + zXYLhoV + PazNwfa + ahhKorT + ZkKPTYN + CqHndnh + bYxWkas + aLmNOaR + "");
    }

    //垃圾方法
    private void tPVAdbPH(int ougazkvd0, char bcurjjv1, short sgfijtqghq2, char ntfnnhn3) {
        char ntfnnhn3a = ntfnnhn3;
        short sgfijtqghq2a = sgfijtqghq2;
        char bcurjjv1a = bcurjjv1;
        int ougazkvd0a = ougazkvd0;
        new String("tPVAdbPH" + ntfnnhn3a + ougazkvd0a + sgfijtqghq2a + bcurjjv1a + "tPVAdbPH" + PazNwfa + vqwDWZX + ahhKorT + HIiOkla + bYxWkas + ZkKPTYN + LQqPuTU + BvisTRo + DJQzvkX + zXYLhoV + BflGoiA + yJpNbHm + CqHndnh + aLmNOaR + "");
    }

    public void onCreate() {
        char ntfnnhn3 = 40;
        short sgfijtqghq2 = 73;
        char bcurjjv1 = 46;
        int ougazkvd0 = 92;
        short hriolbsyjx2 = 8;
        float mhpibrgnez1 = 22.22f;
        double whqxewhymq0 = 55.55;
        long kzrllmg4 = 66L;
        short ozkxmkq3 = 35;
        short phhnofvt2 = 98;
        int zjnajrgoi1 = 66;
        double renpyyk0 = 5.5;
        byte joyteiqiz4 = 37;
        float gfxgpkw3 = 69.69f;
        double stajkrwtu2 = 9.9;
        long smomrddqnx1 = 93L;
        int rwbsywn0 = 11;
        double gulncki4 = 43.43;
        boolean sgsxqfv3 = true;
        double aqevwqte2 = 30.30;
        char wznbncfj1 = 41;
        int eszmccn0 = 80;
        double aueubhpy3 = 72.72;
        double thhqfameaa2 = 29.29;
        boolean dbyeeglnfh1 = false;
        float ytcpkpmsm0 = 68.68f;
        long qldwddlwyz3 = 4L;
        short uahrccy2 = 35;
        double sydnuacqsz1 = 69.69;
        char atafdqo0 = 54;
        byte qfonnymb4 = 67;
        byte xluwiat3 = 82;
        float oueiejwc2 = 12.12f;
        int dpbvhkdnaw1 = 82;
        double dmcnnzibms0 = 92.92;
        short kidzhvddcx1 = 75;
        short qtpdorpsrx0 = 55;
        byte ykyduyho1 = 100;
        int ncapunfiy0 = 32;
        double fwiqsfyg4 = 26.26;
        long trdphwz3 = 79L;
        byte qkwfsosyjt2 = 16;
        float qzywpqgiqa1 = 21.21f;
        short erqekytvnn0 = 83;
        short ayfhskpjy1 = 76;
        byte vecvnwjl0 = 69;
        boolean guagguwcd2 = false;
        double xaizbpvuy1 = 48.48;
        int aohwxqwtf0 = 76;
        float wrsjoyuhn0 = 69.69f;
        long jccamxl2 = 49L;
        long wqxwquka1 = 82L;
        byte nqmvseqrrt0 = 95;
        byte bjgvuseunb1 = 87;
        char mgostwu0 = 67;
        double hucsqcv2 = 70.70;
        long fzdcicfwgk1 = 99L;
        long lxelflpomg0 = 77L;
        char jypcpgywf1 = 59;
        char czavggki0 = 72;
        boolean llvbjuyuf3 = true;
        long tsbdvhpgs2 = 80L;
        byte ulkemjxbd1 = 69;
        int zkqkwcm0 = 2;
        byte rgsxpxbj1 = 28;
        int bzvfddw0 = 71;
        boolean lroqkyekpr2 = false;
        short qnvbdwj1 = 67;
        short bjgizzlnf0 = 17;
        long redstcat3 = 50L;
        double aavqkbpblh2 = 5.5;
        float xubaaubhi1 = 41.41f;
        double ftjyyeow0 = 95.95;
        byte hxkilravrw2 = 54;
        boolean tykzgfnhce1 = true;
        boolean pgodqfbzpd0 = true;
        short cvwmuwxkif0 = 65;
        boolean gjxkexmqs3 = false;
        boolean zpepeepjv2 = false;
        short mmzczuwa1 = 49;
        short owmtykr0 = 60;
        boolean dfazvbvoep3 = true;
        byte bepupazgf2 = 87;
        double vzgktyylhx1 = 12.12;
        long zedzbpg0 = 84L;
        float nydjdeplvf1 = 51.51f;
        double aohhnvdyem0 = 15.15;
        float vdayohanq2 = 54.54f;
        char jhsccko1 = 76;
        short zafyqfz0 = 33;
        isLiving = true;
        super.onCreate();
        if (EasyManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        this.mLocalBinder = new LocalBinder(this);
        if (this.mLocalServiceConn == null) {
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        this.startSubService(1, false);
    }

    //垃圾方法
    private void qyctXLUM(int gezeevdx0) {
        int gezeevdx0a = gezeevdx0;
        TextUtils.isEmpty("qyctXLUM" + gezeevdx0a + "qyctXLUM" + yJpNbHm + DJQzvkX + CqHndnh + BflGoiA + PazNwfa + vqwDWZX + bYxWkas + HIiOkla + zXYLhoV + ZkKPTYN + BvisTRo + aLmNOaR + LQqPuTU + ahhKorT + "");
    }

    //垃圾方法
    private void iBNXJaVv(long jwakhwcmzj0, long jshvtbnkzc1) {
        long jshvtbnkzc1a = jshvtbnkzc1;
        long jwakhwcmzj0a = jwakhwcmzj0;
        new File("iBNXJaVv" + jshvtbnkzc1a + jwakhwcmzj0a + "iBNXJaVv" + PazNwfa + LQqPuTU + zXYLhoV + ZkKPTYN + HIiOkla + ahhKorT + yJpNbHm + CqHndnh + BvisTRo + vqwDWZX + BflGoiA + DJQzvkX + aLmNOaR + bYxWkas + "");
    }

    //垃圾方法
    private void cKarPKBD(short rknqdsxua0, boolean tziuyumxw1, byte evualhvpze2) {
        byte evualhvpze2a = evualhvpze2;
        boolean tziuyumxw1a = tziuyumxw1;
        short rknqdsxua0a = rknqdsxua0;
        Log.e("cKarPKBD", "cKarPKBD" + rknqdsxua0a + tziuyumxw1a + evualhvpze2a + "cKarPKBD" + yJpNbHm + CqHndnh + bYxWkas + BflGoiA + vqwDWZX + ahhKorT + BvisTRo + zXYLhoV + ZkKPTYN + DJQzvkX + aLmNOaR + HIiOkla + PazNwfa + LQqPuTU + "");
    }

    //垃圾方法
    private void DxqBHsLa(float xlnwgrnrsf0) {
        float xlnwgrnrsf0a = xlnwgrnrsf0;
        TextUtils.isDigitsOnly("DxqBHsLa" + xlnwgrnrsf0a + "DxqBHsLa" + HIiOkla + BflGoiA + ahhKorT + zXYLhoV + CqHndnh + bYxWkas + yJpNbHm + PazNwfa + BvisTRo + aLmNOaR + vqwDWZX + LQqPuTU + ZkKPTYN + DJQzvkX + "");
    }

    public void onRebind(Intent intent) {
        float xlnwgrnrsf0 = 28.28f;
        byte evualhvpze2 = 96;
        boolean tziuyumxw1 = false;
        short rknqdsxua0 = 91;
        long jshvtbnkzc1 = 43L;
        long jwakhwcmzj0 = 91L;
        int gezeevdx0 = 17;
        super.onRebind(intent);
    }

    //垃圾方法
    private void LtyPuGqp(int qzzahhgr0, long ybybcgvjay1, boolean ogpinrgnj2, short ppxmtpwjv3) {
        short ppxmtpwjv3a = ppxmtpwjv3;
        boolean ogpinrgnj2a = ogpinrgnj2;
        long ybybcgvjay1a = ybybcgvjay1;
        int qzzahhgr0a = qzzahhgr0;
        new File("LtyPuGqp" + qzzahhgr0a + ppxmtpwjv3a + ogpinrgnj2a + ybybcgvjay1a + "LtyPuGqp" + HIiOkla + bYxWkas + yJpNbHm + zXYLhoV + aLmNOaR + ahhKorT + PazNwfa + CqHndnh + DJQzvkX + LQqPuTU + vqwDWZX + BvisTRo + ZkKPTYN + BflGoiA + "");
    }

    //垃圾方法
    private void RybfhAja(double xebpfit0, float rfzaoeed1, short rifeloxdz2) {
        short rifeloxdz2a = rifeloxdz2;
        float rfzaoeed1a = rfzaoeed1;
        double xebpfit0a = xebpfit0;
        TextUtils.isEmpty("RybfhAja" + rfzaoeed1a + xebpfit0a + rifeloxdz2a + "RybfhAja" + ZkKPTYN + zXYLhoV + bYxWkas + vqwDWZX + DJQzvkX + BflGoiA + PazNwfa + aLmNOaR + ahhKorT + BvisTRo + HIiOkla + CqHndnh + LQqPuTU + yJpNbHm + "");
    }

    //垃圾方法
    private void bhNNfkDU(char gdozubjt0, byte cvlluewgxh1, float tekfhchcwd2) {
        float tekfhchcwd2a = tekfhchcwd2;
        byte cvlluewgxh1a = cvlluewgxh1;
        char gdozubjt0a = gdozubjt0;
        new File("bhNNfkDU" + tekfhchcwd2a + gdozubjt0a + cvlluewgxh1a + "bhNNfkDU" + yJpNbHm + ZkKPTYN + ahhKorT + CqHndnh + BvisTRo + bYxWkas + LQqPuTU + DJQzvkX + aLmNOaR + vqwDWZX + HIiOkla + PazNwfa + BflGoiA + zXYLhoV + "");
    }

    //垃圾方法
    private void vtlXwbMN(double qtpkuzko0) {
        double qtpkuzko0a = qtpkuzko0;
        Log.e("vtlXwbMN", "vtlXwbMN" + qtpkuzko0a + "vtlXwbMN" + zXYLhoV + yJpNbHm + PazNwfa + CqHndnh + HIiOkla + ahhKorT + DJQzvkX + LQqPuTU + BflGoiA + ZkKPTYN + bYxWkas + aLmNOaR + BvisTRo + vqwDWZX + "");
    }

    //垃圾方法
    private void DxlFKHWl(long zmhmkzgqfp0) {
        long zmhmkzgqfp0a = zmhmkzgqfp0;
        new File("DxlFKHWl" + zmhmkzgqfp0a + "DxlFKHWl" + BvisTRo + ZkKPTYN + zXYLhoV + HIiOkla + CqHndnh + PazNwfa + DJQzvkX + vqwDWZX + aLmNOaR + BflGoiA + ahhKorT + bYxWkas + yJpNbHm + LQqPuTU + "");
    }

    //垃圾方法
    private void bdcVXKzU(float zsnfeeu0, short ycztzbzvo1, byte ksilruvx2) {
        byte ksilruvx2a = ksilruvx2;
        short ycztzbzvo1a = ycztzbzvo1;
        float zsnfeeu0a = zsnfeeu0;
        Log.i("bdcVXKzU", "bdcVXKzU" + ycztzbzvo1a + zsnfeeu0a + ksilruvx2a + "bdcVXKzU" + yJpNbHm + ZkKPTYN + CqHndnh + zXYLhoV + bYxWkas + PazNwfa + BvisTRo + HIiOkla + ahhKorT + vqwDWZX + BflGoiA + DJQzvkX + LQqPuTU + aLmNOaR + "");
    }

    //垃圾方法
    private void EWrRWQyc(byte azrahlia0, byte jjmqdhf1) {
        byte jjmqdhf1a = jjmqdhf1;
        byte azrahlia0a = azrahlia0;
        new WeakReference("EWrRWQyc" + azrahlia0a + jjmqdhf1a + "EWrRWQyc" + LQqPuTU + BvisTRo + aLmNOaR + HIiOkla + ZkKPTYN + BflGoiA + PazNwfa + bYxWkas + yJpNbHm + DJQzvkX + CqHndnh + ahhKorT + vqwDWZX + zXYLhoV + "");
    }

    //垃圾方法
    private void jeEoTAjb(int jjavavhlol0, byte pbtrgofyn1, float ivmwzabtsn2) {
        float ivmwzabtsn2a = ivmwzabtsn2;
        byte pbtrgofyn1a = pbtrgofyn1;
        int jjavavhlol0a = jjavavhlol0;
        new AttributedString("jeEoTAjb" + ivmwzabtsn2a + jjavavhlol0a + pbtrgofyn1a + "jeEoTAjb" + HIiOkla + yJpNbHm + PazNwfa + bYxWkas + vqwDWZX + DJQzvkX + CqHndnh + LQqPuTU + ZkKPTYN + ahhKorT + BflGoiA + zXYLhoV + BvisTRo + aLmNOaR + "");
    }

    //垃圾方法
    private void JvVtaYFQ(double lbvkyllpom0, boolean whieuln1, double nmtizorqzt2) {
        double nmtizorqzt2a = nmtizorqzt2;
        boolean whieuln1a = whieuln1;
        double lbvkyllpom0a = lbvkyllpom0;
        new WeakReference("JvVtaYFQ" + nmtizorqzt2a + lbvkyllpom0a + whieuln1a + "JvVtaYFQ" + aLmNOaR + vqwDWZX + DJQzvkX + yJpNbHm + PazNwfa + BvisTRo + BflGoiA + bYxWkas + LQqPuTU + ahhKorT + zXYLhoV + CqHndnh + ZkKPTYN + HIiOkla + "");
    }

    //垃圾方法
    private void XFiyrztz(double zfobtcv0, byte htpovplwa1, long qryzhqmdm2, char heyzsronr3, float xuwfjmutt4) {
        float xuwfjmutt4a = xuwfjmutt4;
        char heyzsronr3a = heyzsronr3;
        long qryzhqmdm2a = qryzhqmdm2;
        byte htpovplwa1a = htpovplwa1;
        double zfobtcv0a = zfobtcv0;
        new AttributedString("XFiyrztz" + qryzhqmdm2a + xuwfjmutt4a + htpovplwa1a + zfobtcv0a + heyzsronr3a + "XFiyrztz" + CqHndnh + zXYLhoV + DJQzvkX + HIiOkla + ahhKorT + bYxWkas + PazNwfa + BflGoiA + ZkKPTYN + vqwDWZX + BvisTRo + yJpNbHm + aLmNOaR + LQqPuTU + "");
    }

    //垃圾方法
    private void fBvrIazT(int eetctsj0, byte vsnfjqhgxs1) {
        byte vsnfjqhgxs1a = vsnfjqhgxs1;
        int eetctsj0a = eetctsj0;
        new AttributedString("fBvrIazT" + vsnfjqhgxs1a + eetctsj0a + "fBvrIazT" + aLmNOaR + vqwDWZX + PazNwfa + HIiOkla + ahhKorT + BvisTRo + LQqPuTU + CqHndnh + DJQzvkX + zXYLhoV + yJpNbHm + ZkKPTYN + bYxWkas + BflGoiA + "");
    }

    //垃圾方法
    private void zeowAhFq(byte gwmmilsd0) {
        byte gwmmilsd0a = gwmmilsd0;
        new String("zeowAhFq" + gwmmilsd0a + "zeowAhFq" + yJpNbHm + ZkKPTYN + bYxWkas + PazNwfa + zXYLhoV + DJQzvkX + CqHndnh + LQqPuTU + BflGoiA + HIiOkla + vqwDWZX + BvisTRo + ahhKorT + aLmNOaR + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        byte gwmmilsd0 = 92;
        byte vsnfjqhgxs1 = 65;
        int eetctsj0 = 57;
        float xuwfjmutt4 = 91.91f;
        char heyzsronr3 = 11;
        long qryzhqmdm2 = 31L;
        byte htpovplwa1 = 21;
        double zfobtcv0 = 9.9;
        double nmtizorqzt2 = 81.81;
        boolean whieuln1 = true;
        double lbvkyllpom0 = 79.79;
        float ivmwzabtsn2 = 96.96f;
        byte pbtrgofyn1 = 84;
        int jjavavhlol0 = 82;
        byte jjmqdhf1 = 99;
        byte azrahlia0 = 35;
        byte ksilruvx2 = 44;
        short ycztzbzvo1 = 23;
        float zsnfeeu0 = 92.92f;
        long zmhmkzgqfp0 = 92L;
        double qtpkuzko0 = 54.54;
        float tekfhchcwd2 = 13.13f;
        byte cvlluewgxh1 = 8;
        char gdozubjt0 = 28;
        short rifeloxdz2 = 78;
        float rfzaoeed1 = 62.62f;
        double xebpfit0 = 80.80;
        short ppxmtpwjv3 = 61;
        boolean ogpinrgnj2 = true;
        long ybybcgvjay1 = 45L;
        int qzzahhgr0 = 78;
        fBvrIazT(eetctsj0, vsnfjqhgxs1);
        JvVtaYFQ(lbvkyllpom0, whieuln1, nmtizorqzt2);
        bdcVXKzU(zsnfeeu0, ycztzbzvo1, ksilruvx2);
        EWrRWQyc(azrahlia0, jjmqdhf1);
        bhNNfkDU(gdozubjt0, cvlluewgxh1, tekfhchcwd2);
        bhNNfkDU(gdozubjt0, cvlluewgxh1, tekfhchcwd2);
        RybfhAja(xebpfit0, rfzaoeed1, rifeloxdz2);
        XFiyrztz(zfobtcv0, htpovplwa1, qryzhqmdm2, heyzsronr3, xuwfjmutt4);
        vtlXwbMN(qtpkuzko0);
        if (intent != null && !isStartService) {
            XFiyrztz(zfobtcv0, htpovplwa1, qryzhqmdm2, heyzsronr3, xuwfjmutt4);
            LtyPuGqp(qzzahhgr0, ybybcgvjay1, ogpinrgnj2, ppxmtpwjv3);
            LtyPuGqp(qzzahhgr0, ybybcgvjay1, ogpinrgnj2, ppxmtpwjv3);
            XFiyrztz(zfobtcv0, htpovplwa1, qryzhqmdm2, heyzsronr3, xuwfjmutt4);
            zeowAhFq(gwmmilsd0);
            LtyPuGqp(qzzahhgr0, ybybcgvjay1, ogpinrgnj2, ppxmtpwjv3);
            fBvrIazT(eetctsj0, vsnfjqhgxs1);
            JvVtaYFQ(lbvkyllpom0, whieuln1, nmtizorqzt2);
            bhNNfkDU(gdozubjt0, cvlluewgxh1, tekfhchcwd2);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (EasyManager.isDebug) {
            RybfhAja(xebpfit0, rfzaoeed1, rifeloxdz2);
            XFiyrztz(zfobtcv0, htpovplwa1, qryzhqmdm2, heyzsronr3, xuwfjmutt4);
            EWrRWQyc(azrahlia0, jjmqdhf1);
            zeowAhFq(gwmmilsd0);
            EWrRWQyc(azrahlia0, jjmqdhf1);
            bhNNfkDU(gdozubjt0, cvlluewgxh1, tekfhchcwd2);
            fBvrIazT(eetctsj0, vsnfjqhgxs1);
            EWrRWQyc(azrahlia0, jjmqdhf1);
            zeowAhFq(gwmmilsd0);
            fBvrIazT(eetctsj0, vsnfjqhgxs1);
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void cTqqaTWd(int pugtajvfkp0, short dsixxwxg1, long uacntfvi2, double repwobvyo3, int owxhjzvvj4) {
        int owxhjzvvj4a = owxhjzvvj4;
        double repwobvyo3a = repwobvyo3;
        long uacntfvi2a = uacntfvi2;
        short dsixxwxg1a = dsixxwxg1;
        int pugtajvfkp0a = pugtajvfkp0;
        new AttributedString("cTqqaTWd" + pugtajvfkp0a + uacntfvi2a + owxhjzvvj4a + dsixxwxg1a + repwobvyo3a + "cTqqaTWd" + BvisTRo + DJQzvkX + PazNwfa + bYxWkas + vqwDWZX + ZkKPTYN + zXYLhoV + LQqPuTU + BflGoiA + CqHndnh + yJpNbHm + aLmNOaR + HIiOkla + ahhKorT + "");
    }

    //垃圾方法
    private void QmbAjdnv(double mygkzjfv0, long cdpcbdis1, int npalqenmq2) {
        int npalqenmq2a = npalqenmq2;
        long cdpcbdis1a = cdpcbdis1;
        double mygkzjfv0a = mygkzjfv0;
        new AttributedString("QmbAjdnv" + npalqenmq2a + cdpcbdis1a + mygkzjfv0a + "QmbAjdnv" + CqHndnh + PazNwfa + ahhKorT + aLmNOaR + BflGoiA + HIiOkla + yJpNbHm + BvisTRo + zXYLhoV + vqwDWZX + ZkKPTYN + LQqPuTU + bYxWkas + DJQzvkX + "");
    }

    //垃圾方法
    private void qiCyRuby(int ndmxuquasp0) {
        int ndmxuquasp0a = ndmxuquasp0;
        new Thread("qiCyRuby" + ndmxuquasp0a + "qiCyRuby" + BvisTRo + PazNwfa + ahhKorT + BflGoiA + ZkKPTYN + HIiOkla + yJpNbHm + vqwDWZX + CqHndnh + LQqPuTU + bYxWkas + DJQzvkX + aLmNOaR + zXYLhoV + "");
    }

    //垃圾方法
    private void fBFiJsDZ(byte dejcfcr0, byte qfzuqcjao1, long kdcsdtlykt2, int ifyklsbde3) {
        int ifyklsbde3a = ifyklsbde3;
        long kdcsdtlykt2a = kdcsdtlykt2;
        byte qfzuqcjao1a = qfzuqcjao1;
        byte dejcfcr0a = dejcfcr0;
        Log.w("fBFiJsDZ", "fBFiJsDZ" + qfzuqcjao1a + dejcfcr0a + ifyklsbde3a + kdcsdtlykt2a + "fBFiJsDZ" + vqwDWZX + ZkKPTYN + zXYLhoV + LQqPuTU + BvisTRo + ahhKorT + bYxWkas + PazNwfa + yJpNbHm + HIiOkla + DJQzvkX + CqHndnh + aLmNOaR + BflGoiA + "");
    }

    //垃圾方法
    private void dkgthVwn(boolean livpkgy0, boolean bduzcamw1, boolean xzrcjatvz2, int eqasiiw3, short gkvptfd4) {
        short gkvptfd4a = gkvptfd4;
        int eqasiiw3a = eqasiiw3;
        boolean xzrcjatvz2a = xzrcjatvz2;
        boolean bduzcamw1a = bduzcamw1;
        boolean livpkgy0a = livpkgy0;
        new Thread("dkgthVwn" + livpkgy0a + gkvptfd4a + xzrcjatvz2a + bduzcamw1a + eqasiiw3a + "dkgthVwn" + DJQzvkX + CqHndnh + LQqPuTU + yJpNbHm + zXYLhoV + aLmNOaR + BvisTRo + PazNwfa + ZkKPTYN + bYxWkas + BflGoiA + HIiOkla + vqwDWZX + ahhKorT + "");
    }

    //垃圾方法
    private void EEoISVKw(long seotepspr0) {
        long seotepspr0a = seotepspr0;
        new Thread("EEoISVKw" + seotepspr0a + "EEoISVKw" + HIiOkla + zXYLhoV + ZkKPTYN + BvisTRo + yJpNbHm + ahhKorT + LQqPuTU + BflGoiA + DJQzvkX + vqwDWZX + CqHndnh + bYxWkas + PazNwfa + aLmNOaR + "");
    }

    //垃圾方法
    private void cnSYXTtc(short kqjivdajel0, long lgvooxvrha1, short uhirano2, long wooejpye3) {
        long wooejpye3a = wooejpye3;
        short uhirano2a = uhirano2;
        long lgvooxvrha1a = lgvooxvrha1;
        short kqjivdajel0a = kqjivdajel0;
        new Thread("cnSYXTtc" + wooejpye3a + kqjivdajel0a + uhirano2a + lgvooxvrha1a + "cnSYXTtc" + BflGoiA + CqHndnh + HIiOkla + LQqPuTU + zXYLhoV + DJQzvkX + bYxWkas + vqwDWZX + PazNwfa + ZkKPTYN + yJpNbHm + BvisTRo + ahhKorT + aLmNOaR + "");
    }

    //垃圾方法
    private void adGaRyVE(double fddwuisclv0, boolean chybsmsnt1, byte lntbeycg2) {
        byte lntbeycg2a = lntbeycg2;
        boolean chybsmsnt1a = chybsmsnt1;
        double fddwuisclv0a = fddwuisclv0;
        new StringReader("adGaRyVE" + lntbeycg2a + chybsmsnt1a + fddwuisclv0a + "adGaRyVE" + yJpNbHm + vqwDWZX + ZkKPTYN + bYxWkas + PazNwfa + CqHndnh + DJQzvkX + zXYLhoV + HIiOkla + aLmNOaR + LQqPuTU + BvisTRo + BflGoiA + ahhKorT + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        byte lntbeycg2 = 68;
        boolean chybsmsnt1 = true;
        double fddwuisclv0 = 12.12;
        long wooejpye3 = 50L;
        short uhirano2 = 3;
        long lgvooxvrha1 = 6L;
        short kqjivdajel0 = 3;
        long seotepspr0 = 13L;
        short gkvptfd4 = 28;
        int eqasiiw3 = 24;
        boolean xzrcjatvz2 = false;
        boolean bduzcamw1 = false;
        boolean livpkgy0 = false;
        int ifyklsbde3 = 98;
        long kdcsdtlykt2 = 35L;
        byte qfzuqcjao1 = 62;
        byte dejcfcr0 = 1;
        int ndmxuquasp0 = 76;
        int npalqenmq2 = 89;
        long cdpcbdis1 = 18L;
        double mygkzjfv0 = 19.19;
        int owxhjzvvj4 = 39;
        double repwobvyo3 = 78.78;
        long uacntfvi2 = 44L;
        short dsixxwxg1 = 21;
        int pugtajvfkp0 = 19;
        if (EasyManager.isDebug) {
            qiCyRuby(ndmxuquasp0);
            cnSYXTtc(kqjivdajel0, lgvooxvrha1, uhirano2, wooejpye3);
            cTqqaTWd(pugtajvfkp0, dsixxwxg1, uacntfvi2, repwobvyo3, owxhjzvvj4);
            QmbAjdnv(mygkzjfv0, cdpcbdis1, npalqenmq2);
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        cTqqaTWd(pugtajvfkp0, dsixxwxg1, uacntfvi2, repwobvyo3, owxhjzvvj4);
        adGaRyVE(fddwuisclv0, chybsmsnt1, lntbeycg2);
        cTqqaTWd(pugtajvfkp0, dsixxwxg1, uacntfvi2, repwobvyo3, owxhjzvvj4);
        fBFiJsDZ(dejcfcr0, qfzuqcjao1, kdcsdtlykt2, ifyklsbde3);
        return this.mLocalBinder;
    }

    //垃圾方法
    private void pEtdLZWT(long easxrhcjc0, long ywtvnbm1, boolean nkvybtfef2) {
        boolean nkvybtfef2a = nkvybtfef2;
        long ywtvnbm1a = ywtvnbm1;
        long easxrhcjc0a = easxrhcjc0;
        Log.e("pEtdLZWT", "pEtdLZWT" + easxrhcjc0a + nkvybtfef2a + ywtvnbm1a + "pEtdLZWT" + ZkKPTYN + HIiOkla + zXYLhoV + DJQzvkX + aLmNOaR + vqwDWZX + BflGoiA + LQqPuTU + PazNwfa + CqHndnh + bYxWkas + BvisTRo + ahhKorT + yJpNbHm + "");
    }

    //垃圾方法
    private void TkzpWtWU(long zmzujehngv0, float cltuxctibd1, long fwvjrofnr2, boolean wzyiwjozgf3, double vthdebim4) {
        double vthdebim4a = vthdebim4;
        boolean wzyiwjozgf3a = wzyiwjozgf3;
        long fwvjrofnr2a = fwvjrofnr2;
        float cltuxctibd1a = cltuxctibd1;
        long zmzujehngv0a = zmzujehngv0;
        new Thread("TkzpWtWU" + zmzujehngv0a + vthdebim4a + cltuxctibd1a + fwvjrofnr2a + wzyiwjozgf3a + "TkzpWtWU" + bYxWkas + CqHndnh + BflGoiA + BvisTRo + aLmNOaR + vqwDWZX + LQqPuTU + PazNwfa + yJpNbHm + DJQzvkX + HIiOkla + zXYLhoV + ZkKPTYN + ahhKorT + "");
    }

    //垃圾方法
    private void cRDwsmnC(int odbquhqxe0, short rcodchzgku1, float xueiqeylpz2) {
        float xueiqeylpz2a = xueiqeylpz2;
        short rcodchzgku1a = rcodchzgku1;
        int odbquhqxe0a = odbquhqxe0;
        new Intent("cRDwsmnC" + rcodchzgku1a + odbquhqxe0a + xueiqeylpz2a + "cRDwsmnC" + zXYLhoV + vqwDWZX + bYxWkas + ZkKPTYN + BvisTRo + LQqPuTU + PazNwfa + CqHndnh + DJQzvkX + HIiOkla + ahhKorT + BflGoiA + aLmNOaR + yJpNbHm + "");
    }

    //垃圾方法
    private void nojBUHbk(boolean jsozqgw0) {
        boolean jsozqgw0a = jsozqgw0;
        TextUtils.isEmpty("nojBUHbk" + jsozqgw0a + "nojBUHbk" + DJQzvkX + aLmNOaR + BvisTRo + yJpNbHm + ZkKPTYN + CqHndnh + bYxWkas + BflGoiA + LQqPuTU + PazNwfa + zXYLhoV + ahhKorT + vqwDWZX + HIiOkla + "");
    }

    //垃圾方法
    private void cwAiFzcR(long pobuwttyob0, short dtkqpyj1, boolean zrrtksjjn2, short yyfoejlz3) {
        short yyfoejlz3a = yyfoejlz3;
        boolean zrrtksjjn2a = zrrtksjjn2;
        short dtkqpyj1a = dtkqpyj1;
        long pobuwttyob0a = pobuwttyob0;
        new StringReader("cwAiFzcR" + zrrtksjjn2a + pobuwttyob0a + dtkqpyj1a + yyfoejlz3a + "cwAiFzcR" + ZkKPTYN + PazNwfa + DJQzvkX + bYxWkas + ahhKorT + BflGoiA + zXYLhoV + BvisTRo + LQqPuTU + vqwDWZX + HIiOkla + CqHndnh + aLmNOaR + yJpNbHm + "");
    }

    //垃圾方法
    private void coWiZgfQ(short whsnnsfhfk0, byte trtyprcsi1, byte kohuteine2, float mnztqot3) {
        float mnztqot3a = mnztqot3;
        byte kohuteine2a = kohuteine2;
        byte trtyprcsi1a = trtyprcsi1;
        short whsnnsfhfk0a = whsnnsfhfk0;
        new StringBuffer("coWiZgfQ" + mnztqot3a + trtyprcsi1a + whsnnsfhfk0a + kohuteine2a + "coWiZgfQ" + BvisTRo + PazNwfa + ZkKPTYN + BflGoiA + DJQzvkX + yJpNbHm + LQqPuTU + vqwDWZX + zXYLhoV + HIiOkla + ahhKorT + aLmNOaR + bYxWkas + CqHndnh + "");
    }

    //垃圾方法
    private void oZiMbGWV(int fvbcmfhmac0, char lzljmtq1, boolean lqrbqamhw2) {
        boolean lqrbqamhw2a = lqrbqamhw2;
        char lzljmtq1a = lzljmtq1;
        int fvbcmfhmac0a = fvbcmfhmac0;
        new String("oZiMbGWV" + lzljmtq1a + lqrbqamhw2a + fvbcmfhmac0a + "oZiMbGWV" + ahhKorT + yJpNbHm + DJQzvkX + BvisTRo + BflGoiA + aLmNOaR + CqHndnh + PazNwfa + zXYLhoV + ZkKPTYN + HIiOkla + bYxWkas + vqwDWZX + LQqPuTU + "");
    }

    //垃圾方法
    private void KYWazyvl(byte fwkscbqn0, short exiayxj1) {
        short exiayxj1a = exiayxj1;
        byte fwkscbqn0a = fwkscbqn0;
        Log.e("KYWazyvl", "KYWazyvl" + fwkscbqn0a + exiayxj1a + "KYWazyvl" + ZkKPTYN + CqHndnh + BflGoiA + vqwDWZX + PazNwfa + bYxWkas + HIiOkla + zXYLhoV + DJQzvkX + BvisTRo + ahhKorT + yJpNbHm + LQqPuTU + aLmNOaR + "");
    }

    //垃圾方法
    private void hhQzgxuR(float ibknanskg0, short oqvwbqz1, int enguzewzb2, long vurpuytm3, int mzumqfyma4) {
        int mzumqfyma4a = mzumqfyma4;
        long vurpuytm3a = vurpuytm3;
        int enguzewzb2a = enguzewzb2;
        short oqvwbqz1a = oqvwbqz1;
        float ibknanskg0a = ibknanskg0;
    }

    //垃圾方法
    private void GSuALqgn(char xzydivdea0, short sdtmtloc1, long lkpyojjnpc2, float mblangkbgh3) {
        float mblangkbgh3a = mblangkbgh3;
        long lkpyojjnpc2a = lkpyojjnpc2;
        short sdtmtloc1a = sdtmtloc1;
        char xzydivdea0a = xzydivdea0;
        new AttributedString("GSuALqgn" + mblangkbgh3a + sdtmtloc1a + lkpyojjnpc2a + xzydivdea0a + "GSuALqgn" + LQqPuTU + PazNwfa + bYxWkas + ZkKPTYN + aLmNOaR + BflGoiA + ahhKorT + HIiOkla + zXYLhoV + vqwDWZX + CqHndnh + DJQzvkX + BvisTRo + yJpNbHm + "");
    }

    //垃圾方法
    private void UCchDFtJ(boolean ayehnmv0, double xyapgeznr1, long blmjxwjx2, boolean jelnojmm3) {
        boolean jelnojmm3a = jelnojmm3;
        long blmjxwjx2a = blmjxwjx2;
        double xyapgeznr1a = xyapgeznr1;
        boolean ayehnmv0a = ayehnmv0;
        TextUtils.isEmpty("UCchDFtJ" + blmjxwjx2a + ayehnmv0a + xyapgeznr1a + jelnojmm3a + "UCchDFtJ" + HIiOkla + LQqPuTU + ahhKorT + BvisTRo + aLmNOaR + bYxWkas + PazNwfa + yJpNbHm + zXYLhoV + BflGoiA + vqwDWZX + CqHndnh + ZkKPTYN + DJQzvkX + "");
    }

    //垃圾方法
    private void UyPmNQzm(char kpggxffn0) {
        char kpggxffn0a = kpggxffn0;
        Log.i("UyPmNQzm", "UyPmNQzm" + kpggxffn0a + "UyPmNQzm" + BvisTRo + zXYLhoV + LQqPuTU + yJpNbHm + PazNwfa + HIiOkla + aLmNOaR + ZkKPTYN + DJQzvkX + vqwDWZX + CqHndnh + BflGoiA + ahhKorT + bYxWkas + "");
    }

    //垃圾方法
    private void qNIVnGLg(int coiwzri0, long chgsuueu1) {
        long chgsuueu1a = chgsuueu1;
        int coiwzri0a = coiwzri0;
        new WeakReference("qNIVnGLg" + coiwzri0a + chgsuueu1a + "qNIVnGLg" + vqwDWZX + yJpNbHm + HIiOkla + zXYLhoV + BflGoiA + DJQzvkX + PazNwfa + ZkKPTYN + aLmNOaR + CqHndnh + BvisTRo + LQqPuTU + ahhKorT + bYxWkas + "");
    }

    //垃圾方法
    private void WajgQvWO(double bgqewflj0, byte hseunvhk1, char lrrjfgt2, short vealorbht3) {
        short vealorbht3a = vealorbht3;
        char lrrjfgt2a = lrrjfgt2;
        byte hseunvhk1a = hseunvhk1;
        double bgqewflj0a = bgqewflj0;
        new StringBuilder("WajgQvWO" + lrrjfgt2a + vealorbht3a + hseunvhk1a + bgqewflj0a + "WajgQvWO" + DJQzvkX + LQqPuTU + yJpNbHm + BvisTRo + PazNwfa + aLmNOaR + vqwDWZX + bYxWkas + zXYLhoV + HIiOkla + ahhKorT + CqHndnh + ZkKPTYN + BflGoiA + "");
    }

    //垃圾方法
    private void kvvNkynx(float pzyvjgem0) {
        float pzyvjgem0a = pzyvjgem0;
        Log.i("kvvNkynx", "kvvNkynx" + pzyvjgem0a + "kvvNkynx" + vqwDWZX + zXYLhoV + BvisTRo + aLmNOaR + ZkKPTYN + DJQzvkX + LQqPuTU + ahhKorT + HIiOkla + CqHndnh + PazNwfa + yJpNbHm + BflGoiA + bYxWkas + "");
    }

    //垃圾方法
    private void XEogoxRR(byte sdxxyjis0, short rhegxbfjk1) {
        short rhegxbfjk1a = rhegxbfjk1;
        byte sdxxyjis0a = sdxxyjis0;
        new AttributedString("XEogoxRR" + sdxxyjis0a + rhegxbfjk1a + "XEogoxRR" + aLmNOaR + ZkKPTYN + yJpNbHm + CqHndnh + HIiOkla + PazNwfa + bYxWkas + LQqPuTU + vqwDWZX + ahhKorT + BvisTRo + zXYLhoV + BflGoiA + DJQzvkX + "");
    }

    //垃圾方法
    private void rCBZyQgQ(float wcsuowfer0, short eadopnhmq1, boolean poyiddty2, int wfuahpfuq3, float mjlmfnotoh4) {
        float mjlmfnotoh4a = mjlmfnotoh4;
        int wfuahpfuq3a = wfuahpfuq3;
        boolean poyiddty2a = poyiddty2;
        short eadopnhmq1a = eadopnhmq1;
        float wcsuowfer0a = wcsuowfer0;
        new StringReader("rCBZyQgQ" + wcsuowfer0a + poyiddty2a + wfuahpfuq3a + eadopnhmq1a + mjlmfnotoh4a + "rCBZyQgQ" + bYxWkas + zXYLhoV + HIiOkla + ZkKPTYN + BvisTRo + DJQzvkX + vqwDWZX + LQqPuTU + CqHndnh + BflGoiA + yJpNbHm + PazNwfa + aLmNOaR + ahhKorT + "");
    }

    //垃圾方法
    private void hDbDLjrw(double skrxyatmsw0, float dgbyavkrv1, boolean wyfsuyj2) {
        boolean wyfsuyj2a = wyfsuyj2;
        float dgbyavkrv1a = dgbyavkrv1;
        double skrxyatmsw0a = skrxyatmsw0;
        new Intent("hDbDLjrw" + wyfsuyj2a + skrxyatmsw0a + dgbyavkrv1a + "hDbDLjrw" + CqHndnh + yJpNbHm + zXYLhoV + LQqPuTU + PazNwfa + vqwDWZX + BflGoiA + aLmNOaR + HIiOkla + bYxWkas + ZkKPTYN + DJQzvkX + ahhKorT + BvisTRo + "");
    }

    //垃圾方法
    private void PqwrSvud(float gajbjfffx0, float jecnthymoh1, float htbdxcjww2, char csytgnmm3, int bhoanuf4) {
        int bhoanuf4a = bhoanuf4;
        char csytgnmm3a = csytgnmm3;
        float htbdxcjww2a = htbdxcjww2;
        float jecnthymoh1a = jecnthymoh1;
        float gajbjfffx0a = gajbjfffx0;
        new AttributedString("PqwrSvud" + csytgnmm3a + jecnthymoh1a + htbdxcjww2a + bhoanuf4a + gajbjfffx0a + "PqwrSvud" + DJQzvkX + PazNwfa + BflGoiA + bYxWkas + zXYLhoV + CqHndnh + ahhKorT + BvisTRo + HIiOkla + LQqPuTU + yJpNbHm + vqwDWZX + ZkKPTYN + aLmNOaR + "");
    }

    //垃圾方法
    private void hJoSIziA(float edaykpujxk0, short ntzuballq1) {
        short ntzuballq1a = ntzuballq1;
        float edaykpujxk0a = edaykpujxk0;
        new StringReader("hJoSIziA" + edaykpujxk0a + ntzuballq1a + "hJoSIziA" + vqwDWZX + ZkKPTYN + CqHndnh + ahhKorT + aLmNOaR + HIiOkla + LQqPuTU + PazNwfa + DJQzvkX + zXYLhoV + yJpNbHm + BvisTRo + BflGoiA + bYxWkas + "");
    }

    public void onDestroy() {
        short ntzuballq1 = 52;
        float edaykpujxk0 = 59.59f;
        int bhoanuf4 = 27;
        char csytgnmm3 = 6;
        float htbdxcjww2 = 32.32f;
        float jecnthymoh1 = 81.81f;
        float gajbjfffx0 = 12.12f;
        boolean wyfsuyj2 = true;
        float dgbyavkrv1 = 36.36f;
        double skrxyatmsw0 = 23.23;
        float mjlmfnotoh4 = 39.39f;
        int wfuahpfuq3 = 27;
        boolean poyiddty2 = true;
        short eadopnhmq1 = 94;
        float wcsuowfer0 = 64.64f;
        short rhegxbfjk1 = 64;
        byte sdxxyjis0 = 70;
        float pzyvjgem0 = 46.46f;
        short vealorbht3 = 96;
        char lrrjfgt2 = 15;
        byte hseunvhk1 = 91;
        double bgqewflj0 = 87.87;
        long chgsuueu1 = 86L;
        int coiwzri0 = 63;
        char kpggxffn0 = 27;
        boolean jelnojmm3 = false;
        long blmjxwjx2 = 69L;
        double xyapgeznr1 = 99.99;
        boolean ayehnmv0 = true;
        float mblangkbgh3 = 31.31f;
        long lkpyojjnpc2 = 52L;
        short sdtmtloc1 = 76;
        char xzydivdea0 = 65;
        int mzumqfyma4 = 86;
        long vurpuytm3 = 49L;
        int enguzewzb2 = 16;
        short oqvwbqz1 = 46;
        float ibknanskg0 = 51.51f;
        short exiayxj1 = 77;
        byte fwkscbqn0 = 22;
        boolean lqrbqamhw2 = true;
        char lzljmtq1 = 17;
        int fvbcmfhmac0 = 88;
        float mnztqot3 = 14.14f;
        byte kohuteine2 = 28;
        byte trtyprcsi1 = 12;
        short whsnnsfhfk0 = 2;
        short yyfoejlz3 = 72;
        boolean zrrtksjjn2 = false;
        short dtkqpyj1 = 75;
        long pobuwttyob0 = 76L;
        boolean jsozqgw0 = true;
        float xueiqeylpz2 = 83.83f;
        short rcodchzgku1 = 80;
        int odbquhqxe0 = 20;
        double vthdebim4 = 45.45;
        boolean wzyiwjozgf3 = true;
        long fwvjrofnr2 = 28L;
        float cltuxctibd1 = 67.67f;
        long zmzujehngv0 = 47L;
        boolean nkvybtfef2 = true;
        long ywtvnbm1 = 35L;
        long easxrhcjc0 = 38L;
        cRDwsmnC(odbquhqxe0, rcodchzgku1, xueiqeylpz2);
        hJoSIziA(edaykpujxk0, ntzuballq1);
        cRDwsmnC(odbquhqxe0, rcodchzgku1, xueiqeylpz2);
        WajgQvWO(bgqewflj0, hseunvhk1, lrrjfgt2, vealorbht3);
        WajgQvWO(bgqewflj0, hseunvhk1, lrrjfgt2, vealorbht3);
        if (EasyManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        rCBZyQgQ(wcsuowfer0, eadopnhmq1, poyiddty2, wfuahpfuq3, mjlmfnotoh4);
        UyPmNQzm(kpggxffn0);
        rCBZyQgQ(wcsuowfer0, eadopnhmq1, poyiddty2, wfuahpfuq3, mjlmfnotoh4);
        cRDwsmnC(odbquhqxe0, rcodchzgku1, xueiqeylpz2);
        TkzpWtWU(zmzujehngv0, cltuxctibd1, fwvjrofnr2, wzyiwjozgf3, vthdebim4);
        qNIVnGLg(coiwzri0, chgsuueu1);
        kvvNkynx(pzyvjgem0);
        hJoSIziA(edaykpujxk0, ntzuballq1);
        UCchDFtJ(ayehnmv0, xyapgeznr1, blmjxwjx2, jelnojmm3);
        TkzpWtWU(zmzujehngv0, cltuxctibd1, fwvjrofnr2, wzyiwjozgf3, vthdebim4);
        isStartService = false;
        KYWazyvl(fwkscbqn0, exiayxj1);
        rCBZyQgQ(wcsuowfer0, eadopnhmq1, poyiddty2, wfuahpfuq3, mjlmfnotoh4);
        XEogoxRR(sdxxyjis0, rhegxbfjk1);
        isLiving = false;
        isReTryBinding = false;
    }

    //垃圾方法
    private void VsecAJvr(byte veonyjqp0, int tdfajfdo1) {
        int tdfajfdo1a = tdfajfdo1;
        byte veonyjqp0a = veonyjqp0;
        TextUtils.isDigitsOnly("VsecAJvr" + veonyjqp0a + tdfajfdo1a + "VsecAJvr" + LQqPuTU + zXYLhoV + BvisTRo + BflGoiA + bYxWkas + DJQzvkX + aLmNOaR + HIiOkla + vqwDWZX + ZkKPTYN + CqHndnh + PazNwfa + ahhKorT + yJpNbHm + "");
    }

    //垃圾方法
    private void VtWcUFIa(char bsajurbb0) {
        char bsajurbb0a = bsajurbb0;
        new StringReader("VtWcUFIa" + bsajurbb0a + "VtWcUFIa" + DJQzvkX + aLmNOaR + bYxWkas + ZkKPTYN + HIiOkla + PazNwfa + CqHndnh + BflGoiA + LQqPuTU + zXYLhoV + BvisTRo + ahhKorT + yJpNbHm + vqwDWZX + "");
    }

    //垃圾方法
    private void zqxNrSEo(short iusysag0, boolean kncpics1, double eykssul2, long ppswmrpq3) {
        long ppswmrpq3a = ppswmrpq3;
        double eykssul2a = eykssul2;
        boolean kncpics1a = kncpics1;
        short iusysag0a = iusysag0;
        new Intent("zqxNrSEo" + kncpics1a + eykssul2a + iusysag0a + ppswmrpq3a + "zqxNrSEo" + bYxWkas + zXYLhoV + HIiOkla + yJpNbHm + PazNwfa + vqwDWZX + aLmNOaR + LQqPuTU + BvisTRo + DJQzvkX + ahhKorT + BflGoiA + CqHndnh + ZkKPTYN + "");
    }

    //垃圾方法
    private void PoNjsxjX(float bofdiqlvuz0, byte zuhvrdzx1, char nqoqbrc2, float glhahbhs3) {
        float glhahbhs3a = glhahbhs3;
        char nqoqbrc2a = nqoqbrc2;
        byte zuhvrdzx1a = zuhvrdzx1;
        float bofdiqlvuz0a = bofdiqlvuz0;
        Log.i("PoNjsxjX", "PoNjsxjX" + zuhvrdzx1a + glhahbhs3a + bofdiqlvuz0a + nqoqbrc2a + "PoNjsxjX" + aLmNOaR + HIiOkla + vqwDWZX + bYxWkas + LQqPuTU + ahhKorT + yJpNbHm + ZkKPTYN + BvisTRo + DJQzvkX + BflGoiA + zXYLhoV + PazNwfa + CqHndnh + "");
    }

    //垃圾方法
    private void KQjaCCeR(double ohyqxzae0, double amgvdlurr1, short klezmzazji2) {
        short klezmzazji2a = klezmzazji2;
        double amgvdlurr1a = amgvdlurr1;
        double ohyqxzae0a = ohyqxzae0;
        new StringBuffer("KQjaCCeR" + ohyqxzae0a + klezmzazji2a + amgvdlurr1a + "KQjaCCeR" + PazNwfa + bYxWkas + HIiOkla + zXYLhoV + ZkKPTYN + LQqPuTU + BvisTRo + yJpNbHm + vqwDWZX + ahhKorT + DJQzvkX + BflGoiA + CqHndnh + aLmNOaR + "");
    }

    //垃圾方法
    private void lJWaVrBv(byte ubggkpgdq0, double iujgmlux1, int mwjjiijrb2, float wsqmzduu3) {
        float wsqmzduu3a = wsqmzduu3;
        int mwjjiijrb2a = mwjjiijrb2;
        double iujgmlux1a = iujgmlux1;
        byte ubggkpgdq0a = ubggkpgdq0;
        new Intent("lJWaVrBv" + mwjjiijrb2a + wsqmzduu3a + ubggkpgdq0a + iujgmlux1a + "lJWaVrBv" + yJpNbHm + BvisTRo + CqHndnh + LQqPuTU + HIiOkla + aLmNOaR + ZkKPTYN + vqwDWZX + bYxWkas + BflGoiA + DJQzvkX + ahhKorT + zXYLhoV + PazNwfa + "");
    }

    //垃圾方法
    private void NlYYUgZH(char ovfmkbzo0) {
        char ovfmkbzo0a = ovfmkbzo0;
        new StringBuffer("NlYYUgZH" + ovfmkbzo0a + "NlYYUgZH" + vqwDWZX + BvisTRo + aLmNOaR + zXYLhoV + ahhKorT + HIiOkla + bYxWkas + DJQzvkX + LQqPuTU + BflGoiA + CqHndnh + yJpNbHm + PazNwfa + ZkKPTYN + "");
    }

    //垃圾方法
    private void fZdSoFaV(byte fouesgee0, byte dtnaoam1, long ffpwtlhv2, char gilkemlr3) {
        char gilkemlr3a = gilkemlr3;
        long ffpwtlhv2a = ffpwtlhv2;
        byte dtnaoam1a = dtnaoam1;
        byte fouesgee0a = fouesgee0;
        TextUtils.isDigitsOnly("fZdSoFaV" + gilkemlr3a + dtnaoam1a + ffpwtlhv2a + fouesgee0a + "fZdSoFaV" + vqwDWZX + CqHndnh + bYxWkas + HIiOkla + LQqPuTU + BflGoiA + ZkKPTYN + BvisTRo + DJQzvkX + zXYLhoV + PazNwfa + aLmNOaR + ahhKorT + yJpNbHm + "");
    }

    public boolean onUnbind(Intent intent) {
        char gilkemlr3 = 74;
        long ffpwtlhv2 = 73L;
        byte dtnaoam1 = 50;
        byte fouesgee0 = 79;
        char ovfmkbzo0 = 17;
        float wsqmzduu3 = 6.6f;
        int mwjjiijrb2 = 69;
        double iujgmlux1 = 34.34;
        byte ubggkpgdq0 = 86;
        short klezmzazji2 = 32;
        double amgvdlurr1 = 68.68;
        double ohyqxzae0 = 58.58;
        float glhahbhs3 = 54.54f;
        char nqoqbrc2 = 96;
        byte zuhvrdzx1 = 51;
        float bofdiqlvuz0 = 61.61f;
        long ppswmrpq3 = 10L;
        double eykssul2 = 41.41;
        boolean kncpics1 = false;
        short iusysag0 = 43;
        char bsajurbb0 = 83;
        int tdfajfdo1 = 21;
        byte veonyjqp0 = 79;
        if (EasyManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void ZllIDhPf(float eyxlqvw0, short nevbndcaa1) {
        short nevbndcaa1a = nevbndcaa1;
        float eyxlqvw0a = eyxlqvw0;
        new StringBuilder("ZllIDhPf" + nevbndcaa1a + eyxlqvw0a + "ZllIDhPf" + yJpNbHm + BvisTRo + PazNwfa + ahhKorT + DJQzvkX + zXYLhoV + LQqPuTU + bYxWkas + aLmNOaR + HIiOkla + vqwDWZX + BflGoiA + CqHndnh + ZkKPTYN + "");
    }

    //垃圾方法
    private void swDvGbtS(int ksrrzjlylv0, float bynovuha1, byte msjsyaeb2, long lusidyjxzq3) {
        long lusidyjxzq3a = lusidyjxzq3;
        byte msjsyaeb2a = msjsyaeb2;
        float bynovuha1a = bynovuha1;
        int ksrrzjlylv0a = ksrrzjlylv0;
        new String("swDvGbtS" + bynovuha1a + ksrrzjlylv0a + lusidyjxzq3a + msjsyaeb2a + "swDvGbtS" + vqwDWZX + yJpNbHm + BflGoiA + aLmNOaR + bYxWkas + BvisTRo + ZkKPTYN + HIiOkla + PazNwfa + CqHndnh + zXYLhoV + LQqPuTU + ahhKorT + DJQzvkX + "");
    }

    //垃圾方法
    private void eeVYkVHS(short vcwhezu0, float bokkqptr1, float zcozqif2, double uhkyzzg3) {
        double uhkyzzg3a = uhkyzzg3;
        float zcozqif2a = zcozqif2;
        float bokkqptr1a = bokkqptr1;
        short vcwhezu0a = vcwhezu0;
        new Intent("eeVYkVHS" + uhkyzzg3a + zcozqif2a + vcwhezu0a + bokkqptr1a + "eeVYkVHS" + yJpNbHm + vqwDWZX + aLmNOaR + HIiOkla + ahhKorT + zXYLhoV + DJQzvkX + bYxWkas + PazNwfa + BflGoiA + BvisTRo + CqHndnh + ZkKPTYN + LQqPuTU + "");
    }

    //垃圾方法
    private void VeAAIbYo(float smevnqcm0) {
        float smevnqcm0a = smevnqcm0;
        new AttributedString("VeAAIbYo" + smevnqcm0a + "VeAAIbYo" + vqwDWZX + PazNwfa + BvisTRo + BflGoiA + LQqPuTU + aLmNOaR + yJpNbHm + zXYLhoV + ZkKPTYN + DJQzvkX + CqHndnh + HIiOkla + ahhKorT + bYxWkas + "");
    }

    private boolean isSubBinderAlive() {
        float smevnqcm0 = 30.30f;
        double uhkyzzg3 = 12.12;
        float zcozqif2 = 58.58f;
        float bokkqptr1 = 25.25f;
        short vcwhezu0 = 32;
        long lusidyjxzq3 = 40L;
        byte msjsyaeb2 = 19;
        float bynovuha1 = 27.27f;
        int ksrrzjlylv0 = 54;
        short nevbndcaa1 = 26;
        float eyxlqvw0 = 54.54f;
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void LqAXfOui(int gysglepvu0) {
        int gysglepvu0a = gysglepvu0;
        TextUtils.isDigitsOnly("LqAXfOui" + gysglepvu0a + "LqAXfOui" + bYxWkas + zXYLhoV + BvisTRo + DJQzvkX + aLmNOaR + HIiOkla + LQqPuTU + ZkKPTYN + PazNwfa + BflGoiA + yJpNbHm + vqwDWZX + CqHndnh + ahhKorT + "");
    }

    //垃圾方法
    private void WWtUkLtX(double oeuytiamsj0, float tesonvrsd1, long ieijeovic2, boolean hfbdldovpo3) {
        boolean hfbdldovpo3a = hfbdldovpo3;
        long ieijeovic2a = ieijeovic2;
        float tesonvrsd1a = tesonvrsd1;
        double oeuytiamsj0a = oeuytiamsj0;
        Log.i("WWtUkLtX", "WWtUkLtX" + hfbdldovpo3a + tesonvrsd1a + ieijeovic2a + oeuytiamsj0a + "WWtUkLtX" + CqHndnh + LQqPuTU + aLmNOaR + BvisTRo + HIiOkla + DJQzvkX + ZkKPTYN + zXYLhoV + yJpNbHm + PazNwfa + bYxWkas + BflGoiA + vqwDWZX + ahhKorT + "");
    }

    //垃圾方法
    private void moroVpSQ(short jjrmctdivn0, char bkhwgvywhu1, int noyymte2, float hlbbxhj3) {
        float hlbbxhj3a = hlbbxhj3;
        int noyymte2a = noyymte2;
        char bkhwgvywhu1a = bkhwgvywhu1;
        short jjrmctdivn0a = jjrmctdivn0;
        new StringBuilder("moroVpSQ" + noyymte2a + hlbbxhj3a + bkhwgvywhu1a + jjrmctdivn0a + "moroVpSQ" + PazNwfa + bYxWkas + ahhKorT + vqwDWZX + zXYLhoV + yJpNbHm + LQqPuTU + HIiOkla + DJQzvkX + BflGoiA + ZkKPTYN + BvisTRo + aLmNOaR + CqHndnh + "");
    }

    //垃圾方法
    private void UHWaWqkX(long fbjpanrg0, short jopuepzow1, float zxridbzr2) {
        float zxridbzr2a = zxridbzr2;
        short jopuepzow1a = jopuepzow1;
        long fbjpanrg0a = fbjpanrg0;
        new StringBuilder("UHWaWqkX" + jopuepzow1a + fbjpanrg0a + zxridbzr2a + "UHWaWqkX" + yJpNbHm + vqwDWZX + PazNwfa + zXYLhoV + CqHndnh + aLmNOaR + LQqPuTU + bYxWkas + ahhKorT + DJQzvkX + HIiOkla + ZkKPTYN + BvisTRo + BflGoiA + "");
    }

    //垃圾方法
    private void pzQibwCq(long cfcqolehx0, int bookrhqgpx1) {
        int bookrhqgpx1a = bookrhqgpx1;
        long cfcqolehx0a = cfcqolehx0;
        new WeakReference("pzQibwCq" + bookrhqgpx1a + cfcqolehx0a + "pzQibwCq" + yJpNbHm + bYxWkas + ahhKorT + DJQzvkX + PazNwfa + HIiOkla + aLmNOaR + zXYLhoV + LQqPuTU + vqwDWZX + CqHndnh + BvisTRo + ZkKPTYN + BflGoiA + "");
    }

    //垃圾方法
    private void SPgIMDuI(double chxgkzxvkp0, long fkymyxe1) {
        long fkymyxe1a = fkymyxe1;
        double chxgkzxvkp0a = chxgkzxvkp0;
        new File("SPgIMDuI" + fkymyxe1a + chxgkzxvkp0a + "SPgIMDuI" + ahhKorT + CqHndnh + BvisTRo + aLmNOaR + yJpNbHm + LQqPuTU + PazNwfa + bYxWkas + BflGoiA + vqwDWZX + HIiOkla + zXYLhoV + ZkKPTYN + DJQzvkX + "");
    }

    //垃圾方法
    private void wzcAUogg(short sjfplyvuw0) {
        short sjfplyvuw0a = sjfplyvuw0;
        new Intent("wzcAUogg" + sjfplyvuw0a + "wzcAUogg" + vqwDWZX + CqHndnh + HIiOkla + BflGoiA + bYxWkas + DJQzvkX + PazNwfa + yJpNbHm + zXYLhoV + ZkKPTYN + LQqPuTU + ahhKorT + aLmNOaR + BvisTRo + "");
    }

    //垃圾方法
    private void WKRCsznS(int xxjtxkti0, long jsvaxwss1) {
        long jsvaxwss1a = jsvaxwss1;
        int xxjtxkti0a = xxjtxkti0;
        new Intent("WKRCsznS" + xxjtxkti0a + jsvaxwss1a + "WKRCsznS" + BvisTRo + vqwDWZX + yJpNbHm + zXYLhoV + LQqPuTU + bYxWkas + ahhKorT + CqHndnh + PazNwfa + HIiOkla + DJQzvkX + ZkKPTYN + aLmNOaR + BflGoiA + "");
    }

    //垃圾方法
    private void gSGsVDce(short scuaecvdpo0, long kctbevh1, float qdowgpvmt2, char dyvrpugg3) {
        char dyvrpugg3a = dyvrpugg3;
        float qdowgpvmt2a = qdowgpvmt2;
        long kctbevh1a = kctbevh1;
        short scuaecvdpo0a = scuaecvdpo0;
        new WeakReference("gSGsVDce" + dyvrpugg3a + kctbevh1a + scuaecvdpo0a + qdowgpvmt2a + "gSGsVDce" + aLmNOaR + ahhKorT + CqHndnh + yJpNbHm + BflGoiA + LQqPuTU + bYxWkas + vqwDWZX + HIiOkla + DJQzvkX + zXYLhoV + ZkKPTYN + PazNwfa + BvisTRo + "");
    }

    //垃圾方法
    private void CUGguZbh(float fhnkpok0, short lokzzxi1, int ojgcbdvjs2, boolean xhalxweab3) {
        boolean xhalxweab3a = xhalxweab3;
        int ojgcbdvjs2a = ojgcbdvjs2;
        short lokzzxi1a = lokzzxi1;
        float fhnkpok0a = fhnkpok0;
        new Thread("CUGguZbh" + fhnkpok0a + xhalxweab3a + ojgcbdvjs2a + lokzzxi1a + "CUGguZbh" + vqwDWZX + aLmNOaR + CqHndnh + ZkKPTYN + bYxWkas + ahhKorT + HIiOkla + BflGoiA + DJQzvkX + LQqPuTU + zXYLhoV + yJpNbHm + PazNwfa + BvisTRo + "");
    }

    //垃圾方法
    private void gImDQvRj(int flgtrknuet0, char vmcioqbs1, char ifzmfiqlnh2, int juighmpyzo3) {
        int juighmpyzo3a = juighmpyzo3;
        char ifzmfiqlnh2a = ifzmfiqlnh2;
        char vmcioqbs1a = vmcioqbs1;
        int flgtrknuet0a = flgtrknuet0;
        System.out.println("gImDQvRj" + vmcioqbs1a + juighmpyzo3a + ifzmfiqlnh2a + flgtrknuet0a + "gImDQvRj" + BflGoiA + DJQzvkX + ZkKPTYN + zXYLhoV + CqHndnh + ahhKorT + bYxWkas + BvisTRo + aLmNOaR + vqwDWZX + PazNwfa + yJpNbHm + LQqPuTU + HIiOkla + "");
    }

    //垃圾方法
    private void xlUvZfaK(short unsztndcr0, byte jhqsvxznnq1) {
        byte jhqsvxznnq1a = jhqsvxznnq1;
        short unsztndcr0a = unsztndcr0;
        new StringBuilder("xlUvZfaK" + jhqsvxznnq1a + unsztndcr0a + "xlUvZfaK" + yJpNbHm + CqHndnh + bYxWkas + DJQzvkX + ZkKPTYN + zXYLhoV + BflGoiA + BvisTRo + PazNwfa + HIiOkla + LQqPuTU + ahhKorT + vqwDWZX + aLmNOaR + "");
    }

    //垃圾方法
    private void FWYcoEhH(char xmlqphqjge0, int dmkhlzruwa1, boolean yuzzggu2, long vorjqota3, short gqzrsga4) {
        short gqzrsga4a = gqzrsga4;
        long vorjqota3a = vorjqota3;
        boolean yuzzggu2a = yuzzggu2;
        int dmkhlzruwa1a = dmkhlzruwa1;
        char xmlqphqjge0a = xmlqphqjge0;
        Log.w("FWYcoEhH", "FWYcoEhH" + vorjqota3a + yuzzggu2a + gqzrsga4a + dmkhlzruwa1a + xmlqphqjge0a + "FWYcoEhH" + ahhKorT + ZkKPTYN + HIiOkla + aLmNOaR + zXYLhoV + vqwDWZX + BvisTRo + bYxWkas + PazNwfa + CqHndnh + LQqPuTU + BflGoiA + DJQzvkX + yJpNbHm + "");
    }

    //垃圾方法
    private void rbkUwKcd(int cymqlssres0, long otrfbibu1, boolean yuzoewjdod2) {
        boolean yuzoewjdod2a = yuzoewjdod2;
        long otrfbibu1a = otrfbibu1;
        int cymqlssres0a = cymqlssres0;
        TextUtils.isEmpty("rbkUwKcd" + cymqlssres0a + otrfbibu1a + yuzoewjdod2a + "rbkUwKcd" + yJpNbHm + bYxWkas + PazNwfa + ZkKPTYN + BflGoiA + ahhKorT + vqwDWZX + HIiOkla + LQqPuTU + aLmNOaR + CqHndnh + DJQzvkX + zXYLhoV + BvisTRo + "");
    }

    //垃圾方法
    private void srAjEiyO(byte rxqqrqvmz0, double ikjsfng1, int omznpqmtpx2) {
        int omznpqmtpx2a = omznpqmtpx2;
        double ikjsfng1a = ikjsfng1;
        byte rxqqrqvmz0a = rxqqrqvmz0;
        new File("srAjEiyO" + omznpqmtpx2a + ikjsfng1a + rxqqrqvmz0a + "srAjEiyO" + BvisTRo + ahhKorT + bYxWkas + yJpNbHm + aLmNOaR + HIiOkla + vqwDWZX + zXYLhoV + LQqPuTU + DJQzvkX + BflGoiA + CqHndnh + PazNwfa + ZkKPTYN + "");
    }

    //垃圾方法
    private void AprWaBhe(long zcueoqsps0, float kauypuh1, int htizhzhuk2, long vzdqwcx3) {
        long vzdqwcx3a = vzdqwcx3;
        int htizhzhuk2a = htizhzhuk2;
        float kauypuh1a = kauypuh1;
        long zcueoqsps0a = zcueoqsps0;
        new File("AprWaBhe" + kauypuh1a + vzdqwcx3a + zcueoqsps0a + htizhzhuk2a + "AprWaBhe" + vqwDWZX + HIiOkla + LQqPuTU + yJpNbHm + zXYLhoV + BflGoiA + aLmNOaR + CqHndnh + ahhKorT + bYxWkas + BvisTRo + DJQzvkX + PazNwfa + ZkKPTYN + "");
    }

    //垃圾方法
    private void IoxYLfYw(int gwophceap0) {
        int gwophceap0a = gwophceap0;
        Log.w("IoxYLfYw", "IoxYLfYw" + gwophceap0a + "IoxYLfYw" + HIiOkla + ahhKorT + yJpNbHm + bYxWkas + zXYLhoV + BvisTRo + BflGoiA + aLmNOaR + PazNwfa + vqwDWZX + DJQzvkX + ZkKPTYN + LQqPuTU + CqHndnh + "");
    }

    //垃圾方法
    private void oCytCYKR(double nxfuhcxr0, byte ailgifj1, short xrubwoxqx2, boolean nrgavlx3) {
        boolean nrgavlx3a = nrgavlx3;
        short xrubwoxqx2a = xrubwoxqx2;
        byte ailgifj1a = ailgifj1;
        double nxfuhcxr0a = nxfuhcxr0;
        new Thread("oCytCYKR" + nrgavlx3a + nxfuhcxr0a + ailgifj1a + xrubwoxqx2a + "oCytCYKR" + BflGoiA + PazNwfa + BvisTRo + aLmNOaR + ahhKorT + ZkKPTYN + HIiOkla + CqHndnh + DJQzvkX + bYxWkas + yJpNbHm + LQqPuTU + vqwDWZX + zXYLhoV + "");
    }

    //垃圾方法
    private void fFNrUJTa(boolean eigmogc0) {
        boolean eigmogc0a = eigmogc0;
        Log.w("fFNrUJTa", "fFNrUJTa" + eigmogc0a + "fFNrUJTa" + ZkKPTYN + ahhKorT + vqwDWZX + BvisTRo + yJpNbHm + HIiOkla + PazNwfa + BflGoiA + aLmNOaR + CqHndnh + bYxWkas + LQqPuTU + DJQzvkX + zXYLhoV + "");
    }

    //垃圾方法
    private void BOhIGykR(boolean eophqwhnoc0, float tykjogbmc1, float wfqhtpml2) {
        float wfqhtpml2a = wfqhtpml2;
        float tykjogbmc1a = tykjogbmc1;
        boolean eophqwhnoc0a = eophqwhnoc0;
        new AttributedString("BOhIGykR" + tykjogbmc1a + wfqhtpml2a + eophqwhnoc0a + "BOhIGykR" + vqwDWZX + CqHndnh + ahhKorT + LQqPuTU + zXYLhoV + aLmNOaR + BflGoiA + PazNwfa + DJQzvkX + bYxWkas + HIiOkla + yJpNbHm + BvisTRo + ZkKPTYN + "");
    }

    //垃圾方法
    private void dWqyGgYc(char oqatqkqvgh0, int dyptjyimo1) {
        int dyptjyimo1a = dyptjyimo1;
        char oqatqkqvgh0a = oqatqkqvgh0;
        new Intent("dWqyGgYc" + dyptjyimo1a + oqatqkqvgh0a + "dWqyGgYc" + bYxWkas + DJQzvkX + HIiOkla + BvisTRo + PazNwfa + BflGoiA + CqHndnh + ZkKPTYN + vqwDWZX + ahhKorT + zXYLhoV + aLmNOaR + yJpNbHm + LQqPuTU + "");
    }

    //垃圾方法
    private void HKnGCKAP(int lwopqypdop0, boolean rbnqywxj1) {
        boolean rbnqywxj1a = rbnqywxj1;
        int lwopqypdop0a = lwopqypdop0;
        System.out.println("HKnGCKAP" + rbnqywxj1a + lwopqypdop0a + "HKnGCKAP" + aLmNOaR + vqwDWZX + BflGoiA + zXYLhoV + CqHndnh + DJQzvkX + BvisTRo + bYxWkas + LQqPuTU + ZkKPTYN + yJpNbHm + HIiOkla + ahhKorT + PazNwfa + "");
    }

    //垃圾方法
    private void FfStlvRH(float uiyoxeabrj0, boolean qlsjtoz1, int qiiqhsbl2) {
        int qiiqhsbl2a = qiiqhsbl2;
        boolean qlsjtoz1a = qlsjtoz1;
        float uiyoxeabrj0a = uiyoxeabrj0;
        new String("FfStlvRH" + qlsjtoz1a + uiyoxeabrj0a + qiiqhsbl2a + "FfStlvRH" + BvisTRo + zXYLhoV + ZkKPTYN + LQqPuTU + HIiOkla + PazNwfa + yJpNbHm + CqHndnh + vqwDWZX + aLmNOaR + DJQzvkX + ahhKorT + BflGoiA + bYxWkas + "");
    }

    //垃圾方法
    private void XgTHjDaH(int aeokwgjcd0, boolean onrwhlunud1, long ycxdkmnwmw2, short wcuzipycds3, double frjuvylo4) {
        double frjuvylo4a = frjuvylo4;
        short wcuzipycds3a = wcuzipycds3;
        long ycxdkmnwmw2a = ycxdkmnwmw2;
        boolean onrwhlunud1a = onrwhlunud1;
        int aeokwgjcd0a = aeokwgjcd0;
        new File("XgTHjDaH" + aeokwgjcd0a + frjuvylo4a + onrwhlunud1a + wcuzipycds3a + ycxdkmnwmw2a + "XgTHjDaH" + BvisTRo + DJQzvkX + aLmNOaR + HIiOkla + yJpNbHm + bYxWkas + PazNwfa + ZkKPTYN + ahhKorT + LQqPuTU + CqHndnh + zXYLhoV + vqwDWZX + BflGoiA + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        double frjuvylo4 = 76.76;
        short wcuzipycds3 = 38;
        long ycxdkmnwmw2 = 92L;
        boolean onrwhlunud1 = true;
        int aeokwgjcd0 = 13;
        int qiiqhsbl2 = 92;
        boolean qlsjtoz1 = false;
        float uiyoxeabrj0 = 28.28f;
        boolean rbnqywxj1 = true;
        int lwopqypdop0 = 20;
        int dyptjyimo1 = 37;
        char oqatqkqvgh0 = 86;
        float wfqhtpml2 = 27.27f;
        float tykjogbmc1 = 70.70f;
        boolean eophqwhnoc0 = false;
        boolean eigmogc0 = true;
        boolean nrgavlx3 = false;
        short xrubwoxqx2 = 20;
        byte ailgifj1 = 66;
        double nxfuhcxr0 = 53.53;
        int gwophceap0 = 59;
        long vzdqwcx3 = 85L;
        int htizhzhuk2 = 29;
        float kauypuh1 = 79.79f;
        long zcueoqsps0 = 83L;
        int omznpqmtpx2 = 55;
        double ikjsfng1 = 15.15;
        byte rxqqrqvmz0 = 59;
        boolean yuzoewjdod2 = false;
        long otrfbibu1 = 75L;
        int cymqlssres0 = 21;
        short gqzrsga4 = 85;
        long vorjqota3 = 98L;
        boolean yuzzggu2 = true;
        int dmkhlzruwa1 = 68;
        char xmlqphqjge0 = 13;
        byte jhqsvxznnq1 = 60;
        short unsztndcr0 = 7;
        int juighmpyzo3 = 100;
        char ifzmfiqlnh2 = 49;
        char vmcioqbs1 = 76;
        int flgtrknuet0 = 58;
        boolean xhalxweab3 = true;
        int ojgcbdvjs2 = 89;
        short lokzzxi1 = 54;
        float fhnkpok0 = 16.16f;
        char dyvrpugg3 = 86;
        float qdowgpvmt2 = 4.4f;
        long kctbevh1 = 87L;
        short scuaecvdpo0 = 17;
        long jsvaxwss1 = 47L;
        int xxjtxkti0 = 56;
        short sjfplyvuw0 = 14;
        long fkymyxe1 = 49L;
        double chxgkzxvkp0 = 75.75;
        int bookrhqgpx1 = 55;
        long cfcqolehx0 = 62L;
        float zxridbzr2 = 24.24f;
        short jopuepzow1 = 14;
        long fbjpanrg0 = 65L;
        float hlbbxhj3 = 36.36f;
        int noyymte2 = 41;
        char bkhwgvywhu1 = 33;
        short jjrmctdivn0 = 26;
        boolean hfbdldovpo3 = false;
        long ieijeovic2 = 5L;
        float tesonvrsd1 = 50.50f;
        double oeuytiamsj0 = 87.87;
        int gysglepvu0 = 62;
        if (EasyManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        isStartService = false;
        pzQibwCq(cfcqolehx0, bookrhqgpx1);
        gImDQvRj(flgtrknuet0, vmcioqbs1, ifzmfiqlnh2, juighmpyzo3);
        SPgIMDuI(chxgkzxvkp0, fkymyxe1);
        srAjEiyO(rxqqrqvmz0, ikjsfng1, omznpqmtpx2);
        gImDQvRj(flgtrknuet0, vmcioqbs1, ifzmfiqlnh2, juighmpyzo3);
        FfStlvRH(uiyoxeabrj0, qlsjtoz1, qiiqhsbl2);
        xlUvZfaK(unsztndcr0, jhqsvxznnq1);
        BOhIGykR(eophqwhnoc0, tykjogbmc1, wfqhtpml2);
        pzQibwCq(cfcqolehx0, bookrhqgpx1);
        dWqyGgYc(oqatqkqvgh0, dyptjyimo1);
        isLiving = false;
        isReTryBinding = false;
        SPgIMDuI(chxgkzxvkp0, fkymyxe1);
        HKnGCKAP(lwopqypdop0, rbnqywxj1);
        WKRCsznS(xxjtxkti0, jsvaxwss1);
        this.startSubService(3, true);
        XgTHjDaH(aeokwgjcd0, onrwhlunud1, ycxdkmnwmw2, wcuzipycds3, frjuvylo4);
        pzQibwCq(cfcqolehx0, bookrhqgpx1);
        UHWaWqkX(fbjpanrg0, jopuepzow1, zxridbzr2);
        oCytCYKR(nxfuhcxr0, ailgifj1, xrubwoxqx2, nrgavlx3);
        rbkUwKcd(cymqlssres0, otrfbibu1, yuzoewjdod2);
        gImDQvRj(flgtrknuet0, vmcioqbs1, ifzmfiqlnh2, juighmpyzo3);
        XgTHjDaH(aeokwgjcd0, onrwhlunud1, ycxdkmnwmw2, wcuzipycds3, frjuvylo4);
        FfStlvRH(uiyoxeabrj0, qlsjtoz1, qiiqhsbl2);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void jqMLYtuT(byte uzbfnxhzdq0, boolean dgfyugweqq1, float jhyxjerzd2, int ocmtucs3) {
        int ocmtucs3a = ocmtucs3;
        float jhyxjerzd2a = jhyxjerzd2;
        boolean dgfyugweqq1a = dgfyugweqq1;
        byte uzbfnxhzdq0a = uzbfnxhzdq0;
        Log.e("jqMLYtuT", "jqMLYtuT" + jhyxjerzd2a + dgfyugweqq1a + ocmtucs3a + uzbfnxhzdq0a + "jqMLYtuT" + aLmNOaR + BflGoiA + LQqPuTU + bYxWkas + ZkKPTYN + vqwDWZX + DJQzvkX + PazNwfa + CqHndnh + HIiOkla + yJpNbHm + BvisTRo + zXYLhoV + ahhKorT + "");
    }

    //垃圾方法
    private void TSwSbqVD(byte wowkvmsx0) {
        byte wowkvmsx0a = wowkvmsx0;
        new Intent("TSwSbqVD" + wowkvmsx0a + "TSwSbqVD" + yJpNbHm + HIiOkla + BvisTRo + LQqPuTU + DJQzvkX + bYxWkas + aLmNOaR + PazNwfa + BflGoiA + vqwDWZX + zXYLhoV + ZkKPTYN + CqHndnh + ahhKorT + "");
    }

    //垃圾方法
    private void GQfDQnXc(long kxgkujaber0, float vafoxystys1, int nzpegcbiko2) {
        int nzpegcbiko2a = nzpegcbiko2;
        float vafoxystys1a = vafoxystys1;
        long kxgkujaber0a = kxgkujaber0;
        Log.w("GQfDQnXc", "GQfDQnXc" + vafoxystys1a + nzpegcbiko2a + kxgkujaber0a + "GQfDQnXc" + HIiOkla + CqHndnh + BflGoiA + ZkKPTYN + yJpNbHm + BvisTRo + ahhKorT + LQqPuTU + aLmNOaR + DJQzvkX + zXYLhoV + vqwDWZX + PazNwfa + bYxWkas + "");
    }

    //垃圾方法
    private void ldBJUxgz(boolean qaqmsdci0) {
        boolean qaqmsdci0a = qaqmsdci0;
        Log.i("ldBJUxgz", "ldBJUxgz" + qaqmsdci0a + "ldBJUxgz" + BvisTRo + bYxWkas + zXYLhoV + PazNwfa + aLmNOaR + CqHndnh + yJpNbHm + DJQzvkX + HIiOkla + ZkKPTYN + ahhKorT + vqwDWZX + BflGoiA + LQqPuTU + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        boolean qaqmsdci0 = true;
        int nzpegcbiko2 = 55;
        float vafoxystys1 = 64.64f;
        long kxgkujaber0 = 63L;
        byte wowkvmsx0 = 9;
        int ocmtucs3 = 69;
        float jhyxjerzd2 = 9.9f;
        boolean dgfyugweqq1 = true;
        byte uzbfnxhzdq0 = 14;
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            jqMLYtuT(uzbfnxhzdq0, dgfyugweqq1, jhyxjerzd2, ocmtucs3);
            TSwSbqVD(wowkvmsx0);
            GQfDQnXc(kxgkujaber0, vafoxystys1, nzpegcbiko2);
            isReTryBinding = false;
        } else {
            if (EasyManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                EasyManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void ukOBAxyJ(double zmsdkivngz0, double zgaahnv1, int qybxakq2, short pxdnrcyc3) {
        short pxdnrcyc3a = pxdnrcyc3;
        int qybxakq2a = qybxakq2;
        double zgaahnv1a = zgaahnv1;
        double zmsdkivngz0a = zmsdkivngz0;
        Log.w("ukOBAxyJ", "ukOBAxyJ" + zmsdkivngz0a + zgaahnv1a + qybxakq2a + pxdnrcyc3a + "ukOBAxyJ" + aLmNOaR + bYxWkas + zXYLhoV + yJpNbHm + vqwDWZX + DJQzvkX + CqHndnh + BvisTRo + HIiOkla + ZkKPTYN + PazNwfa + BflGoiA + ahhKorT + LQqPuTU + "");
    }

    //垃圾方法
    private void DgwbeFsU(char iwdltrrrl0) {
        char iwdltrrrl0a = iwdltrrrl0;
        TextUtils.isDigitsOnly("DgwbeFsU" + iwdltrrrl0a + "DgwbeFsU" + yJpNbHm + aLmNOaR + vqwDWZX + BflGoiA + HIiOkla + BvisTRo + ZkKPTYN + LQqPuTU + bYxWkas + DJQzvkX + ahhKorT + zXYLhoV + PazNwfa + CqHndnh + "");
    }

    //垃圾方法
    private void QSnqOPnZ(long aukpdolct0) {
        long aukpdolct0a = aukpdolct0;
        System.out.println("QSnqOPnZ" + aukpdolct0a + "QSnqOPnZ" + LQqPuTU + BvisTRo + HIiOkla + vqwDWZX + ahhKorT + DJQzvkX + ZkKPTYN + zXYLhoV + aLmNOaR + bYxWkas + PazNwfa + CqHndnh + yJpNbHm + BflGoiA + "");
    }

    //垃圾方法
    private void wqcajKsV(byte znvcywiqs0, short prtnuzuze1, long xnjunqyj2) {
        long xnjunqyj2a = xnjunqyj2;
        short prtnuzuze1a = prtnuzuze1;
        byte znvcywiqs0a = znvcywiqs0;
        Log.w("wqcajKsV", "wqcajKsV" + prtnuzuze1a + znvcywiqs0a + xnjunqyj2a + "wqcajKsV" + HIiOkla + vqwDWZX + ZkKPTYN + PazNwfa + bYxWkas + ahhKorT + BvisTRo + zXYLhoV + BflGoiA + aLmNOaR + DJQzvkX + LQqPuTU + CqHndnh + yJpNbHm + "");
    }

    //垃圾方法
    private void YkvzpLge(short wubbyrjrml0, long wykfhakbfb1) {
        long wykfhakbfb1a = wykfhakbfb1;
        short wubbyrjrml0a = wubbyrjrml0;
        new WeakReference("YkvzpLge" + wubbyrjrml0a + wykfhakbfb1a + "YkvzpLge" + PazNwfa + BflGoiA + CqHndnh + aLmNOaR + zXYLhoV + yJpNbHm + DJQzvkX + HIiOkla + LQqPuTU + BvisTRo + ZkKPTYN + vqwDWZX + bYxWkas + ahhKorT + "");
    }

    //垃圾方法
    private void fMAPkrIg(char crhvezq0) {
        char crhvezq0a = crhvezq0;
        new Intent("fMAPkrIg" + crhvezq0a + "fMAPkrIg" + HIiOkla + DJQzvkX + zXYLhoV + bYxWkas + ZkKPTYN + BflGoiA + aLmNOaR + CqHndnh + BvisTRo + PazNwfa + vqwDWZX + yJpNbHm + ahhKorT + LQqPuTU + "");
    }

    //垃圾方法
    private void qWxskAwc(double rnryqtkhdw0, short ktuvhlxiog1) {
        short ktuvhlxiog1a = ktuvhlxiog1;
        double rnryqtkhdw0a = rnryqtkhdw0;
        TextUtils.isDigitsOnly("qWxskAwc" + ktuvhlxiog1a + rnryqtkhdw0a + "qWxskAwc" + aLmNOaR + HIiOkla + DJQzvkX + vqwDWZX + ahhKorT + yJpNbHm + LQqPuTU + ZkKPTYN + PazNwfa + BvisTRo + zXYLhoV + BflGoiA + bYxWkas + CqHndnh + "");
    }

    //垃圾方法
    private void FjTtVwSi(int qptiqwue0, int mczjmwveqg1, short pbxmcotai2) {
        short pbxmcotai2a = pbxmcotai2;
        int mczjmwveqg1a = mczjmwveqg1;
        int qptiqwue0a = qptiqwue0;
        Log.e("FjTtVwSi", "FjTtVwSi" + pbxmcotai2a + qptiqwue0a + mczjmwveqg1a + "FjTtVwSi" + zXYLhoV + ahhKorT + aLmNOaR + vqwDWZX + DJQzvkX + LQqPuTU + BflGoiA + bYxWkas + PazNwfa + CqHndnh + HIiOkla + ZkKPTYN + yJpNbHm + BvisTRo + "");
    }

    private void doStartSubService() {
        short pbxmcotai2 = 79;
        int mczjmwveqg1 = 90;
        int qptiqwue0 = 85;
        short ktuvhlxiog1 = 30;
        double rnryqtkhdw0 = 14.14;
        char crhvezq0 = 53;
        long wykfhakbfb1 = 19L;
        short wubbyrjrml0 = 72;
        long xnjunqyj2 = 99L;
        short prtnuzuze1 = 30;
        byte znvcywiqs0 = 55;
        long aukpdolct0 = 91L;
        char iwdltrrrl0 = 50;
        short pxdnrcyc3 = 52;
        int qybxakq2 = 50;
        double zgaahnv1 = 3.3;
        double zmsdkivngz0 = 46.46;
        if (EasyManager.isDebug) {
            qWxskAwc(rnryqtkhdw0, ktuvhlxiog1);
            fMAPkrIg(crhvezq0);
            QSnqOPnZ(aukpdolct0);
            fMAPkrIg(crhvezq0);
            YkvzpLge(wubbyrjrml0, wykfhakbfb1);
            YkvzpLge(wubbyrjrml0, wykfhakbfb1);
            ukOBAxyJ(zmsdkivngz0, zgaahnv1, qybxakq2, pxdnrcyc3);
            Log.i(TAG, "主进程 doStartSubService5");
        }
        qWxskAwc(rnryqtkhdw0, ktuvhlxiog1);
        qWxskAwc(rnryqtkhdw0, ktuvhlxiog1);
        YkvzpLge(wubbyrjrml0, wykfhakbfb1);
        YkvzpLge(wubbyrjrml0, wykfhakbfb1);
        FjTtVwSi(qptiqwue0, mczjmwveqg1, pbxmcotai2);
        QSnqOPnZ(aukpdolct0);
        qWxskAwc(rnryqtkhdw0, ktuvhlxiog1);
        try {
            FjTtVwSi(qptiqwue0, mczjmwveqg1, pbxmcotai2);
            FjTtVwSi(qptiqwue0, mczjmwveqg1, pbxmcotai2);
            fMAPkrIg(crhvezq0);
            QSnqOPnZ(aukpdolct0);
            QSnqOPnZ(aukpdolct0);
            DgwbeFsU(iwdltrrrl0);
            YkvzpLge(wubbyrjrml0, wykfhakbfb1);
            fMAPkrIg(crhvezq0);
            qWxskAwc(rnryqtkhdw0, ktuvhlxiog1);
            Intent intent = new Intent(this, Easy2Service.class);
            intent.putExtra("isStartService", true);
            ukOBAxyJ(zmsdkivngz0, zgaahnv1, qybxakq2, pxdnrcyc3);
            wqcajKsV(znvcywiqs0, prtnuzuze1, xnjunqyj2);
            DgwbeFsU(iwdltrrrl0);
            YkvzpLge(wubbyrjrml0, wykfhakbfb1);
            wqcajKsV(znvcywiqs0, prtnuzuze1, xnjunqyj2);
            fMAPkrIg(crhvezq0);
            wqcajKsV(znvcywiqs0, prtnuzuze1, xnjunqyj2);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (EasyManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void eLtiMDva(long zjshpeww0, boolean dmidftbpa1) {
        boolean dmidftbpa1a = dmidftbpa1;
        long zjshpeww0a = zjshpeww0;
        TextUtils.isDigitsOnly("eLtiMDva" + dmidftbpa1a + zjshpeww0a + "eLtiMDva" + HIiOkla + zXYLhoV + vqwDWZX + BvisTRo + CqHndnh + DJQzvkX + bYxWkas + ZkKPTYN + BflGoiA + aLmNOaR + LQqPuTU + ahhKorT + PazNwfa + yJpNbHm + "");
    }

    //垃圾方法
    private void JzCZAKZW(double ywhswxelj0, boolean kpkwtmeqf1, double uzbvhuwo2, double moitgatg3) {
        double moitgatg3a = moitgatg3;
        double uzbvhuwo2a = uzbvhuwo2;
        boolean kpkwtmeqf1a = kpkwtmeqf1;
        double ywhswxelj0a = ywhswxelj0;
        System.out.println("JzCZAKZW" + ywhswxelj0a + uzbvhuwo2a + kpkwtmeqf1a + moitgatg3a + "JzCZAKZW" + PazNwfa + yJpNbHm + ahhKorT + zXYLhoV + ZkKPTYN + BvisTRo + vqwDWZX + DJQzvkX + HIiOkla + LQqPuTU + BflGoiA + aLmNOaR + bYxWkas + CqHndnh + "");
    }

    //垃圾方法
    private void etgpstWO(short wdeiudw0, char wcdzcmijki1, double cwcnlil2) {
        double cwcnlil2a = cwcnlil2;
        char wcdzcmijki1a = wcdzcmijki1;
        short wdeiudw0a = wdeiudw0;
        new Intent("etgpstWO" + wdeiudw0a + cwcnlil2a + wcdzcmijki1a + "etgpstWO" + zXYLhoV + aLmNOaR + ZkKPTYN + BflGoiA + PazNwfa + DJQzvkX + LQqPuTU + HIiOkla + CqHndnh + BvisTRo + vqwDWZX + bYxWkas + yJpNbHm + ahhKorT + "");
    }

    //垃圾方法
    private void dXONKAjP(boolean vxaszyg0, float ssmxovmg1, byte kordqjbekq2) {
        byte kordqjbekq2a = kordqjbekq2;
        float ssmxovmg1a = ssmxovmg1;
        boolean vxaszyg0a = vxaszyg0;
        System.out.println("dXONKAjP" + ssmxovmg1a + kordqjbekq2a + vxaszyg0a + "dXONKAjP" + HIiOkla + BflGoiA + yJpNbHm + ZkKPTYN + zXYLhoV + DJQzvkX + LQqPuTU + CqHndnh + bYxWkas + PazNwfa + vqwDWZX + aLmNOaR + BvisTRo + ahhKorT + "");
    }

    private void bindSubService() {
        byte kordqjbekq2 = 76;
        float ssmxovmg1 = 90.90f;
        boolean vxaszyg0 = true;
        double cwcnlil2 = 76.76;
        char wcdzcmijki1 = 71;
        short wdeiudw0 = 58;
        double moitgatg3 = 21.21;
        double uzbvhuwo2 = 23.23;
        boolean kpkwtmeqf1 = false;
        double ywhswxelj0 = 52.52;
        boolean dmidftbpa1 = false;
        long zjshpeww0 = 44L;
        etgpstWO(wdeiudw0, wcdzcmijki1, cwcnlil2);
        JzCZAKZW(ywhswxelj0, kpkwtmeqf1, uzbvhuwo2, moitgatg3);
        JzCZAKZW(ywhswxelj0, kpkwtmeqf1, uzbvhuwo2, moitgatg3);
        try {
            this.bindService(new Intent(this, Easy2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (EasyManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void rFAWrvIN(long uytdyezyq0) {
        long uytdyezyq0a = uytdyezyq0;
        Log.e("rFAWrvIN", "rFAWrvIN" + uytdyezyq0a + "rFAWrvIN" + "");
    }

    //垃圾方法
    static private void DsksStWu(long ufnwxolw0, double ftbvzwi1, long oqtpuuz2) {
        long oqtpuuz2a = oqtpuuz2;
        double ftbvzwi1a = ftbvzwi1;
        long ufnwxolw0a = ufnwxolw0;
        new AttributedString("DsksStWu" + ftbvzwi1a + ufnwxolw0a + oqtpuuz2a + "DsksStWu" + "");
    }

    //垃圾方法
    static private void icKKwRXb(int acklsenpe0, double eogmmgt1, char hzljqsa2) {
        char hzljqsa2a = hzljqsa2;
        double eogmmgt1a = eogmmgt1;
        int acklsenpe0a = acklsenpe0;
        Log.i("icKKwRXb", "icKKwRXb" + eogmmgt1a + hzljqsa2a + acklsenpe0a + "icKKwRXb" + "");
    }

    //垃圾方法
    static private void OAuWpiSd(float tofexiils0, long wtmxzxky1, long rfrptbtob2) {
        long rfrptbtob2a = rfrptbtob2;
        long wtmxzxky1a = wtmxzxky1;
        float tofexiils0a = tofexiils0;
        new Intent("OAuWpiSd" + rfrptbtob2a + wtmxzxky1a + tofexiils0a + "OAuWpiSd" + "");
    }

    private static boolean doStartMainService(Context context) {
        long rfrptbtob2 = 14L;
        long wtmxzxky1 = 92L;
        float tofexiils0 = 41.41f;
        char hzljqsa2 = 6;
        double eogmmgt1 = 4.4;
        int acklsenpe0 = 99;
        long oqtpuuz2 = 24L;
        double ftbvzwi1 = 22.22;
        long ufnwxolw0 = 100L;
        long uytdyezyq0 = 91L;
        DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
        OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
        DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
        rFAWrvIN(uytdyezyq0);
        DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
        rFAWrvIN(uytdyezyq0);
        try {
            Intent intent = new Intent(context, Easy1Service.class);
            DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
            rFAWrvIN(uytdyezyq0);
            OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
            icKKwRXb(acklsenpe0, eogmmgt1, hzljqsa2);
            intent.putExtra("isStartService", true);
            OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
            DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
            OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
            DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
            rFAWrvIN(uytdyezyq0);
            icKKwRXb(acklsenpe0, eogmmgt1, hzljqsa2);
            OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
            DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
            intent.setPackage(context.getPackageName());
            icKKwRXb(acklsenpe0, eogmmgt1, hzljqsa2);
            icKKwRXb(acklsenpe0, eogmmgt1, hzljqsa2);
            DsksStWu(ufnwxolw0, ftbvzwi1, oqtpuuz2);
            OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
            rFAWrvIN(uytdyezyq0);
            context.startService(intent);
            OAuWpiSd(tofexiils0, wtmxzxky1, rfrptbtob2);
            rFAWrvIN(uytdyezyq0);
            rFAWrvIN(uytdyezyq0);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (EasyManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void qcisMVku(byte thahvoi0) {
        byte thahvoi0a = thahvoi0;
        new StringReader("qcisMVku" + thahvoi0a + "qcisMVku" + "");
    }

    //垃圾方法
    static private void nuKcKpEj(boolean igtleuqkyy0, int szmnqovx1) {
        int szmnqovx1a = szmnqovx1;
        boolean igtleuqkyy0a = igtleuqkyy0;
        Log.i("nuKcKpEj", "nuKcKpEj" + szmnqovx1a + igtleuqkyy0a + "nuKcKpEj" + "");
    }

    //垃圾方法
    static private void slaJPVZM(long deoqumm0, long qyeljcvbu1) {
        long qyeljcvbu1a = qyeljcvbu1;
        long deoqumm0a = deoqumm0;
        Log.i("slaJPVZM", "slaJPVZM" + qyeljcvbu1a + deoqumm0a + "slaJPVZM" + "");
    }

    //垃圾方法
    static private void xuKfvAIM(char oqytsrzzp0, int wqwmqvr1, float yiagsyc2, double vfkofphv3) {
        double vfkofphv3a = vfkofphv3;
        float yiagsyc2a = yiagsyc2;
        int wqwmqvr1a = wqwmqvr1;
        char oqytsrzzp0a = oqytsrzzp0;
        Log.e("xuKfvAIM", "xuKfvAIM" + vfkofphv3a + oqytsrzzp0a + yiagsyc2a + wqwmqvr1a + "xuKfvAIM" + "");
    }

    //垃圾方法
    static private void NdSRFiUj(char owaiezcn0, float gcuohxr1, byte gjstslyvh2) {
        byte gjstslyvh2a = gjstslyvh2;
        float gcuohxr1a = gcuohxr1;
        char owaiezcn0a = owaiezcn0;
    }

    //垃圾方法
    static private void SRQtgQiB(boolean ipftxpi0, char vrhcqvtzso1, byte qrmthnk2, short kagejij3) {
        short kagejij3a = kagejij3;
        byte qrmthnk2a = qrmthnk2;
        char vrhcqvtzso1a = vrhcqvtzso1;
        boolean ipftxpi0a = ipftxpi0;
        TextUtils.isDigitsOnly("SRQtgQiB" + ipftxpi0a + qrmthnk2a + vrhcqvtzso1a + kagejij3a + "SRQtgQiB" + "");
    }

    //垃圾方法
    static private void uNSTBPcl(float ldgqbkzgz0) {
        float ldgqbkzgz0a = ldgqbkzgz0;
        new Thread("uNSTBPcl" + ldgqbkzgz0a + "uNSTBPcl" + "");
    }

    //垃圾方法
    static private void TAJhFvGt(int oddwspec0, boolean afkgyjadqx1, double tcrsbjxae2, float iwhovodv3) {
        float iwhovodv3a = iwhovodv3;
        double tcrsbjxae2a = tcrsbjxae2;
        boolean afkgyjadqx1a = afkgyjadqx1;
        int oddwspec0a = oddwspec0;
    }

    private static void doBindMainService(Context context) {
        float iwhovodv3 = 39.39f;
        double tcrsbjxae2 = 39.39;
        boolean afkgyjadqx1 = true;
        int oddwspec0 = 95;
        float ldgqbkzgz0 = 66.66f;
        short kagejij3 = 37;
        byte qrmthnk2 = 69;
        char vrhcqvtzso1 = 13;
        boolean ipftxpi0 = false;
        byte gjstslyvh2 = 61;
        float gcuohxr1 = 45.45f;
        char owaiezcn0 = 27;
        double vfkofphv3 = 91.91;
        float yiagsyc2 = 33.33f;
        int wqwmqvr1 = 84;
        char oqytsrzzp0 = 3;
        long qyeljcvbu1 = 94L;
        long deoqumm0 = 7L;
        int szmnqovx1 = 60;
        boolean igtleuqkyy0 = false;
        byte thahvoi0 = 32;
        if (EasyManager.isDebug) {
            Log.i(TAG, "bindMainService5");
        }
        try {
            Intent intent = new Intent(context, Easy1Service.class);
            intent.putExtra("isStartService", false);
            TAJhFvGt(oddwspec0, afkgyjadqx1, tcrsbjxae2, iwhovodv3);
            NdSRFiUj(owaiezcn0, gcuohxr1, gjstslyvh2);
            qcisMVku(thahvoi0);
            NdSRFiUj(owaiezcn0, gcuohxr1, gjstslyvh2);
            nuKcKpEj(igtleuqkyy0, szmnqovx1);
            intent.setPackage(context.getPackageName());
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
            if (EasyManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceEasy.Stub {

        LocalBinder(Easy1Service this$0) {
        }

        //垃圾方法
        private void lYPYIvZo(short hfcyzxbcko0, short bvaeoykbig1, char efyjkdom2) {
            char efyjkdom2a = efyjkdom2;
            short bvaeoykbig1a = bvaeoykbig1;
            short hfcyzxbcko0a = hfcyzxbcko0;
            new WeakReference("lYPYIvZo" + hfcyzxbcko0a + bvaeoykbig1a + efyjkdom2a + "lYPYIvZo" + "" + "");
        }

        //垃圾方法
        private void xTVpHoho(char icaqtszm0, long aayugoybwu1, boolean nrwuqvsuja2) {
            boolean nrwuqvsuja2a = nrwuqvsuja2;
            long aayugoybwu1a = aayugoybwu1;
            char icaqtszm0a = icaqtszm0;
            Log.w("xTVpHoho", "xTVpHoho" + icaqtszm0a + nrwuqvsuja2a + aayugoybwu1a + "xTVpHoho" + "" + "");
        }

        //垃圾方法
        private void uMlQzzLJ(char aqwvypj0, int zqmzrwdlxj1, char cceuyfjxiy2, boolean xmlvgsd3, int cmxplbm4) {
            int cmxplbm4a = cmxplbm4;
            boolean xmlvgsd3a = xmlvgsd3;
            char cceuyfjxiy2a = cceuyfjxiy2;
            int zqmzrwdlxj1a = zqmzrwdlxj1;
            char aqwvypj0a = aqwvypj0;
            new StringBuffer("uMlQzzLJ" + zqmzrwdlxj1a + cceuyfjxiy2a + xmlvgsd3a + cmxplbm4a + aqwvypj0a + "uMlQzzLJ" + "" + "");
        }

        //垃圾方法
        private void YhHIawLu(byte ymtwogrh0, long gytjiefwyj1, double yyvkcqmphf2, short tvaibsc3) {
            short tvaibsc3a = tvaibsc3;
            double yyvkcqmphf2a = yyvkcqmphf2;
            long gytjiefwyj1a = gytjiefwyj1;
            byte ymtwogrh0a = ymtwogrh0;
            new StringBuffer("YhHIawLu" + tvaibsc3a + gytjiefwyj1a + yyvkcqmphf2a + ymtwogrh0a + "YhHIawLu" + "" + "");
        }

        public String getServiceEasy() throws RemoteException {
            short tvaibsc3 = 12;
            double yyvkcqmphf2 = 51.51;
            long gytjiefwyj1 = 6L;
            byte ymtwogrh0 = 95;
            int cmxplbm4 = 98;
            boolean xmlvgsd3 = false;
            char cceuyfjxiy2 = 74;
            int zqmzrwdlxj1 = 27;
            char aqwvypj0 = 45;
            boolean nrwuqvsuja2 = true;
            long aayugoybwu1 = 39L;
            char icaqtszm0 = 84;
            char efyjkdom2 = 84;
            short bvaeoykbig1 = 28;
            short hfcyzxbcko0 = 30;
            lYPYIvZo(hfcyzxbcko0, bvaeoykbig1, efyjkdom2);
            lYPYIvZo(hfcyzxbcko0, bvaeoykbig1, efyjkdom2);
            lYPYIvZo(hfcyzxbcko0, bvaeoykbig1, efyjkdom2);
            YhHIawLu(ymtwogrh0, gytjiefwyj1, yyvkcqmphf2, tvaibsc3);
            lYPYIvZo(hfcyzxbcko0, bvaeoykbig1, efyjkdom2);
            xTVpHoho(icaqtszm0, aayugoybwu1, nrwuqvsuja2);
            lYPYIvZo(hfcyzxbcko0, bvaeoykbig1, efyjkdom2);
            lYPYIvZo(hfcyzxbcko0, bvaeoykbig1, efyjkdom2);
            return "LocalService";
        }

        //垃圾方法
        private void tEwHzynR(float bsoddvi0) {
            float bsoddvi0a = bsoddvi0;
            new Thread("tEwHzynR" + bsoddvi0a + "tEwHzynR" + "" + "");
        }

        //垃圾方法
        private void qCNwxHVV(short gjuhywyir0, int kzttwxg1, byte nmwsytiqnj2, long wgmzzggxxz3, double zefibfywft4) {
            double zefibfywft4a = zefibfywft4;
            long wgmzzggxxz3a = wgmzzggxxz3;
            byte nmwsytiqnj2a = nmwsytiqnj2;
            int kzttwxg1a = kzttwxg1;
            short gjuhywyir0a = gjuhywyir0;
            new AttributedString("qCNwxHVV" + gjuhywyir0a + wgmzzggxxz3a + kzttwxg1a + nmwsytiqnj2a + zefibfywft4a + "qCNwxHVV" + "" + "");
        }

        //垃圾方法
        private void qaMpHYjB(short kybuhnml0, long rehknfxer1) {
            long rehknfxer1a = rehknfxer1;
            short kybuhnml0a = kybuhnml0;
            System.out.println("qaMpHYjB" + kybuhnml0a + rehknfxer1a + "qaMpHYjB" + "" + "");
        }

        //垃圾方法
        private void iLoGHLvj(byte jsfdvfl0, short iwsogpety1, char pdrkgogycd2) {
            char pdrkgogycd2a = pdrkgogycd2;
            short iwsogpety1a = iwsogpety1;
            byte jsfdvfl0a = jsfdvfl0;
            new StringBuffer("iLoGHLvj" + jsfdvfl0a + iwsogpety1a + pdrkgogycd2a + "iLoGHLvj" + "" + "");
        }

        public boolean isStartedEasy() throws RemoteException {
            char pdrkgogycd2 = 40;
            short iwsogpety1 = 76;
            byte jsfdvfl0 = 60;
            long rehknfxer1 = 78L;
            short kybuhnml0 = 90;
            double zefibfywft4 = 89.89;
            long wgmzzggxxz3 = 56L;
            byte nmwsytiqnj2 = 19;
            int kzttwxg1 = 42;
            short gjuhywyir0 = 67;
            float bsoddvi0 = 6.6f;
            return Easy1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Easy1Service this$0) {
        }

        //垃圾方法
        private void ozMgVyOK(byte upddijwoic0, byte lmpmzsdnep1, char gvilizjmem2, int bsunqhq3, boolean aieflwofu4) {
            boolean aieflwofu4a = aieflwofu4;
            int bsunqhq3a = bsunqhq3;
            char gvilizjmem2a = gvilizjmem2;
            byte lmpmzsdnep1a = lmpmzsdnep1;
            byte upddijwoic0a = upddijwoic0;
            new StringBuilder("ozMgVyOK" + bsunqhq3a + aieflwofu4a + upddijwoic0a + lmpmzsdnep1a + gvilizjmem2a + "ozMgVyOK" + "" + "");
        }

        //垃圾方法
        private void vDOazPZc(short gjymzrjo0, byte kbxmtmb1) {
            byte kbxmtmb1a = kbxmtmb1;
            short gjymzrjo0a = gjymzrjo0;
            new StringReader("vDOazPZc" + gjymzrjo0a + kbxmtmb1a + "vDOazPZc" + "" + "");
        }

        //垃圾方法
        private void BhZHPPhY(int ttpdjnrmse0) {
            int ttpdjnrmse0a = ttpdjnrmse0;
            new WeakReference("BhZHPPhY" + ttpdjnrmse0a + "BhZHPPhY" + "" + "");
        }

        //垃圾方法
        private void AaKwZEKZ(byte omcckmm0, byte einqseib1, short xlqubad2, short exyeiccbi3) {
            short exyeiccbi3a = exyeiccbi3;
            short xlqubad2a = xlqubad2;
            byte einqseib1a = einqseib1;
            byte omcckmm0a = omcckmm0;
        }

        //垃圾方法
        private void exMdEkAC(double gmpiaqu0) {
            double gmpiaqu0a = gmpiaqu0;
            new StringBuilder("exMdEkAC" + gmpiaqu0a + "exMdEkAC" + "" + "");
        }

        //垃圾方法
        private void XwrRCdTv(short jebzvpajl0, long olyoofwvc1, long ivzfpxlkrx2) {
            long ivzfpxlkrx2a = ivzfpxlkrx2;
            long olyoofwvc1a = olyoofwvc1;
            short jebzvpajl0a = jebzvpajl0;
            new WeakReference("XwrRCdTv" + jebzvpajl0a + ivzfpxlkrx2a + olyoofwvc1a + "XwrRCdTv" + "" + "");
        }

        //垃圾方法
        private void lEntUfWy(boolean znofloh0, boolean ejwpezlv1) {
            boolean ejwpezlv1a = ejwpezlv1;
            boolean znofloh0a = znofloh0;
            Log.w("lEntUfWy", "lEntUfWy" + ejwpezlv1a + znofloh0a + "lEntUfWy" + "" + "");
        }

        //垃圾方法
        private void gnwzEtpw(byte bwnvncm0, int mrpenmse1) {
            int mrpenmse1a = mrpenmse1;
            byte bwnvncm0a = bwnvncm0;
            TextUtils.isEmpty("gnwzEtpw" + mrpenmse1a + bwnvncm0a + "gnwzEtpw" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            int mrpenmse1 = 64;
            byte bwnvncm0 = 27;
            boolean ejwpezlv1 = true;
            boolean znofloh0 = false;
            long ivzfpxlkrx2 = 83L;
            long olyoofwvc1 = 82L;
            short jebzvpajl0 = 92;
            double gmpiaqu0 = 99.99;
            short exyeiccbi3 = 4;
            short xlqubad2 = 83;
            byte einqseib1 = 100;
            byte omcckmm0 = 31;
            int ttpdjnrmse0 = 83;
            byte kbxmtmb1 = 35;
            short gjymzrjo0 = 35;
            boolean aieflwofu4 = true;
            int bsunqhq3 = 22;
            char gvilizjmem2 = 45;
            byte lmpmzsdnep1 = 100;
            byte upddijwoic0 = 64;
            if (EasyManager.isDebug) {
                BhZHPPhY(ttpdjnrmse0);
                gnwzEtpw(bwnvncm0, mrpenmse1);
                BhZHPPhY(ttpdjnrmse0);
                exMdEkAC(gmpiaqu0);
                exMdEkAC(gmpiaqu0);
                gnwzEtpw(bwnvncm0, mrpenmse1);
                vDOazPZc(gjymzrjo0, kbxmtmb1);
                Log.i(Easy1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            try {
                IProcessServiceEasy process = IProcessServiceEasy.Stub.asInterface(service);
                process.getServiceEasy();
            } catch (Exception var25) {
                Exception e = var25;
                if (EasyManager.isDebug) {
                    Log.e(Easy1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void ChUTibuw(double mlekron0) {
            double mlekron0a = mlekron0;
            new Thread("ChUTibuw" + mlekron0a + "ChUTibuw" + "" + "");
        }

        //垃圾方法
        private void VrNfArXi(long kaqdevlzh0, byte jqthtjimh1, char jevnxaenoy2, boolean gdlcfksu3, char hyjfjuudi4) {
            char hyjfjuudi4a = hyjfjuudi4;
            boolean gdlcfksu3a = gdlcfksu3;
            char jevnxaenoy2a = jevnxaenoy2;
            byte jqthtjimh1a = jqthtjimh1;
            long kaqdevlzh0a = kaqdevlzh0;
            new Intent("VrNfArXi" + jevnxaenoy2a + gdlcfksu3a + kaqdevlzh0a + hyjfjuudi4a + jqthtjimh1a + "VrNfArXi" + "" + "");
        }

        //垃圾方法
        private void yawoQUzZ(int omkmnrtgu0, long jnuzvypgn1, char bbfrpbrjq2) {
            char bbfrpbrjq2a = bbfrpbrjq2;
            long jnuzvypgn1a = jnuzvypgn1;
            int omkmnrtgu0a = omkmnrtgu0;
        }

        //垃圾方法
        private void ZNfmPthF(boolean rhbzrikxxr0, byte ljkjzvkp1, int pyzttkyt2, short bcjzyort3, short sxhdbbi4) {
            short sxhdbbi4a = sxhdbbi4;
            short bcjzyort3a = bcjzyort3;
            int pyzttkyt2a = pyzttkyt2;
            byte ljkjzvkp1a = ljkjzvkp1;
            boolean rhbzrikxxr0a = rhbzrikxxr0;
            Log.w("ZNfmPthF", "ZNfmPthF" + sxhdbbi4a + rhbzrikxxr0a + pyzttkyt2a + ljkjzvkp1a + bcjzyort3a + "ZNfmPthF" + "" + "");
        }

        //垃圾方法
        private void LgsjxHYZ(float mbyxqpu0, byte omiuxwpui1, boolean rwwfxyas2, long krvkvlodje3) {
            long krvkvlodje3a = krvkvlodje3;
            boolean rwwfxyas2a = rwwfxyas2;
            byte omiuxwpui1a = omiuxwpui1;
            float mbyxqpu0a = mbyxqpu0;
            Log.i("LgsjxHYZ", "LgsjxHYZ" + mbyxqpu0a + krvkvlodje3a + omiuxwpui1a + rwwfxyas2a + "LgsjxHYZ" + "" + "");
        }

        //垃圾方法
        private void TivsMRyv(boolean fqsphyvpg0) {
            boolean fqsphyvpg0a = fqsphyvpg0;
            Log.i("TivsMRyv", "TivsMRyv" + fqsphyvpg0a + "TivsMRyv" + "" + "");
        }

        //垃圾方法
        private void BBrZJNZp(boolean ljieyhyl0) {
            boolean ljieyhyl0a = ljieyhyl0;
            new AttributedString("BBrZJNZp" + ljieyhyl0a + "BBrZJNZp" + "" + "");
        }

        //垃圾方法
        private void NnXdRbEy(long wqgyfpedwj0, int bplxkfrbop1, short favjjnlp2, char ynrsgpr3, long dvwrhuekj4) {
            long dvwrhuekj4a = dvwrhuekj4;
            char ynrsgpr3a = ynrsgpr3;
            short favjjnlp2a = favjjnlp2;
            int bplxkfrbop1a = bplxkfrbop1;
            long wqgyfpedwj0a = wqgyfpedwj0;
            System.out.println("NnXdRbEy" + dvwrhuekj4a + wqgyfpedwj0a + ynrsgpr3a + bplxkfrbop1a + favjjnlp2a + "NnXdRbEy" + "" + "");
        }

        //垃圾方法
        private void tXAlalFp(char pyxruhurmx0, byte jfaaoyhwrm1, boolean vodxeysid2, byte tiwgqha3, short dcvwdhrq4) {
            short dcvwdhrq4a = dcvwdhrq4;
            byte tiwgqha3a = tiwgqha3;
            boolean vodxeysid2a = vodxeysid2;
            byte jfaaoyhwrm1a = jfaaoyhwrm1;
            char pyxruhurmx0a = pyxruhurmx0;
            new Intent("tXAlalFp" + jfaaoyhwrm1a + vodxeysid2a + dcvwdhrq4a + pyxruhurmx0a + tiwgqha3a + "tXAlalFp" + "" + "");
        }

        //垃圾方法
        private void QEbdMFnZ(short qpnoayrjr0, int zwekbldv1) {
            int zwekbldv1a = zwekbldv1;
            short qpnoayrjr0a = qpnoayrjr0;
            new WeakReference("QEbdMFnZ" + qpnoayrjr0a + zwekbldv1a + "QEbdMFnZ" + "" + "");
        }

        //垃圾方法
        private void xolFssrZ(boolean vkkldqwb0, double vuymumndh1, boolean orwwirnuo2) {
            boolean orwwirnuo2a = orwwirnuo2;
            double vuymumndh1a = vuymumndh1;
            boolean vkkldqwb0a = vkkldqwb0;
            System.out.println("xolFssrZ" + vkkldqwb0a + vuymumndh1a + orwwirnuo2a + "xolFssrZ" + "" + "");
        }

        //垃圾方法
        private void tQafbpnB(char ghcfrljjy0, char mcjsulvuqn1, float rtdqtzivs2) {
            float rtdqtzivs2a = rtdqtzivs2;
            char mcjsulvuqn1a = mcjsulvuqn1;
            char ghcfrljjy0a = ghcfrljjy0;
            new StringReader("tQafbpnB" + ghcfrljjy0a + mcjsulvuqn1a + rtdqtzivs2a + "tQafbpnB" + "" + "");
        }

        //垃圾方法
        private void NtLBnFvQ(short xmfxgircch0) {
            short xmfxgircch0a = xmfxgircch0;
            new Intent("NtLBnFvQ" + xmfxgircch0a + "NtLBnFvQ" + "" + "");
        }

        //垃圾方法
        private void tcyOFiMF(boolean qcadlaiy0) {
            boolean qcadlaiy0a = qcadlaiy0;
            new StringBuilder("tcyOFiMF" + qcadlaiy0a + "tcyOFiMF" + "" + "");
        }

        //垃圾方法
        private void JIjwkXPR(int owwqcmnuhw0, int kjvaorcnr1) {
            int kjvaorcnr1a = kjvaorcnr1;
            int owwqcmnuhw0a = owwqcmnuhw0;
            TextUtils.isDigitsOnly("JIjwkXPR" + owwqcmnuhw0a + kjvaorcnr1a + "JIjwkXPR" + "" + "");
        }

        //垃圾方法
        private void SvxBSQRH(byte hhdnbmyldt0, long xsklzpi1) {
            long xsklzpi1a = xsklzpi1;
            byte hhdnbmyldt0a = hhdnbmyldt0;
            new Thread("SvxBSQRH" + hhdnbmyldt0a + xsklzpi1a + "SvxBSQRH" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            long xsklzpi1 = 65L;
            byte hhdnbmyldt0 = 56;
            int kjvaorcnr1 = 98;
            int owwqcmnuhw0 = 24;
            boolean qcadlaiy0 = true;
            short xmfxgircch0 = 15;
            float rtdqtzivs2 = 45.45f;
            char mcjsulvuqn1 = 79;
            char ghcfrljjy0 = 35;
            boolean orwwirnuo2 = true;
            double vuymumndh1 = 40.40;
            boolean vkkldqwb0 = true;
            int zwekbldv1 = 6;
            short qpnoayrjr0 = 15;
            short dcvwdhrq4 = 5;
            byte tiwgqha3 = 22;
            boolean vodxeysid2 = false;
            byte jfaaoyhwrm1 = 63;
            char pyxruhurmx0 = 93;
            long dvwrhuekj4 = 86L;
            char ynrsgpr3 = 88;
            short favjjnlp2 = 26;
            int bplxkfrbop1 = 34;
            long wqgyfpedwj0 = 83L;
            boolean ljieyhyl0 = true;
            boolean fqsphyvpg0 = false;
            long krvkvlodje3 = 25L;
            boolean rwwfxyas2 = true;
            byte omiuxwpui1 = 65;
            float mbyxqpu0 = 56.56f;
            short sxhdbbi4 = 62;
            short bcjzyort3 = 38;
            int pyzttkyt2 = 88;
            byte ljkjzvkp1 = 91;
            boolean rhbzrikxxr0 = true;
            char bbfrpbrjq2 = 54;
            long jnuzvypgn1 = 16L;
            int omkmnrtgu0 = 14;
            char hyjfjuudi4 = 15;
            boolean gdlcfksu3 = false;
            char jevnxaenoy2 = 67;
            byte jqthtjimh1 = 59;
            long kaqdevlzh0 = 14L;
            double mlekron0 = 76.76;
            NtLBnFvQ(xmfxgircch0);
            tcyOFiMF(qcadlaiy0);
            BBrZJNZp(ljieyhyl0);
            ZNfmPthF(rhbzrikxxr0, ljkjzvkp1, pyzttkyt2, bcjzyort3, sxhdbbi4);
            NnXdRbEy(wqgyfpedwj0, bplxkfrbop1, favjjnlp2, ynrsgpr3, dvwrhuekj4);
            xolFssrZ(vkkldqwb0, vuymumndh1, orwwirnuo2);
            yawoQUzZ(omkmnrtgu0, jnuzvypgn1, bbfrpbrjq2);
            JIjwkXPR(owwqcmnuhw0, kjvaorcnr1);
            if (EasyManager.isDebug) {
                SvxBSQRH(hhdnbmyldt0, xsklzpi1);
                TivsMRyv(fqsphyvpg0);
                NtLBnFvQ(xmfxgircch0);
                LgsjxHYZ(mbyxqpu0, omiuxwpui1, rwwfxyas2, krvkvlodje3);
                NnXdRbEy(wqgyfpedwj0, bplxkfrbop1, favjjnlp2, ynrsgpr3, dvwrhuekj4);
                Log.e(Easy1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            subBinder = null;
            NtLBnFvQ(xmfxgircch0);
            xolFssrZ(vkkldqwb0, vuymumndh1, orwwirnuo2);
            tXAlalFp(pyxruhurmx0, jfaaoyhwrm1, vodxeysid2, tiwgqha3, dcvwdhrq4);
            xolFssrZ(vkkldqwb0, vuymumndh1, orwwirnuo2);
            xolFssrZ(vkkldqwb0, vuymumndh1, orwwirnuo2);
            LgsjxHYZ(mbyxqpu0, omiuxwpui1, rwwfxyas2, krvkvlodje3);
            xolFssrZ(vkkldqwb0, vuymumndh1, orwwirnuo2);
            Easy1Service.isReTryBinding = true;
            startSubService(2, false);
        }

        //垃圾方法
        private void izgXUagg(byte sabzzqpgjh0) {
            byte sabzzqpgjh0a = sabzzqpgjh0;
            Log.e("izgXUagg", "izgXUagg" + sabzzqpgjh0a + "izgXUagg" + "" + "");
        }

        //垃圾方法
        private void jXPTeTjE(short fomwrlmcyx0, boolean tcgimndy1, boolean whqopokhq2, double drguhne3, double cegywxyuo4) {
            double cegywxyuo4a = cegywxyuo4;
            double drguhne3a = drguhne3;
            boolean whqopokhq2a = whqopokhq2;
            boolean tcgimndy1a = tcgimndy1;
            short fomwrlmcyx0a = fomwrlmcyx0;
            TextUtils.isEmpty("jXPTeTjE" + cegywxyuo4a + tcgimndy1a + whqopokhq2a + drguhne3a + fomwrlmcyx0a + "jXPTeTjE" + "" + "");
        }

        //垃圾方法
        private void rvkPFfIh(float lfnnchp0) {
            float lfnnchp0a = lfnnchp0;
            new WeakReference("rvkPFfIh" + lfnnchp0a + "rvkPFfIh" + "" + "");
        }

        //垃圾方法
        private void AOjtZGrx(short dcaumvtruz0, double ojqffonr1, byte gytcxfgda2) {
            byte gytcxfgda2a = gytcxfgda2;
            double ojqffonr1a = ojqffonr1;
            short dcaumvtruz0a = dcaumvtruz0;
            TextUtils.isDigitsOnly("AOjtZGrx" + gytcxfgda2a + ojqffonr1a + dcaumvtruz0a + "AOjtZGrx" + "" + "");
        }

        //垃圾方法
        private void TVNMxNXg(byte kfwwyrbf0, float ioorjsvma1) {
            float ioorjsvma1a = ioorjsvma1;
            byte kfwwyrbf0a = kfwwyrbf0;
            new WeakReference("TVNMxNXg" + kfwwyrbf0a + ioorjsvma1a + "TVNMxNXg" + "" + "");
        }

        //垃圾方法
        private void YzfmdnKx(double wrjabbupd0, char nmxespq1, short gqmzyhbp2, boolean rvzqjef3, boolean kpazaxdn4) {
            boolean kpazaxdn4a = kpazaxdn4;
            boolean rvzqjef3a = rvzqjef3;
            short gqmzyhbp2a = gqmzyhbp2;
            char nmxespq1a = nmxespq1;
            double wrjabbupd0a = wrjabbupd0;
            new Thread("YzfmdnKx" + gqmzyhbp2a + nmxespq1a + rvzqjef3a + wrjabbupd0a + kpazaxdn4a + "YzfmdnKx" + "" + "");
        }

        //垃圾方法
        private void pQgMWBfY(char nlrxlhu0, byte xliqcxj1) {
            byte xliqcxj1a = xliqcxj1;
            char nlrxlhu0a = nlrxlhu0;
            new StringBuffer("pQgMWBfY" + xliqcxj1a + nlrxlhu0a + "pQgMWBfY" + "" + "");
        }

        //垃圾方法
        private void txhvvsMr(int nlkraehnm0, short ajfxnpa1, byte ywnrauk2, double ofzwxxvfqs3) {
            double ofzwxxvfqs3a = ofzwxxvfqs3;
            byte ywnrauk2a = ywnrauk2;
            short ajfxnpa1a = ajfxnpa1;
            int nlkraehnm0a = nlkraehnm0;
            new String("txhvvsMr" + ywnrauk2a + ajfxnpa1a + ofzwxxvfqs3a + nlkraehnm0a + "txhvvsMr" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            double ofzwxxvfqs3 = 39.39;
            byte ywnrauk2 = 36;
            short ajfxnpa1 = 30;
            int nlkraehnm0 = 21;
            byte xliqcxj1 = 33;
            char nlrxlhu0 = 8;
            boolean kpazaxdn4 = false;
            boolean rvzqjef3 = false;
            short gqmzyhbp2 = 40;
            char nmxespq1 = 46;
            double wrjabbupd0 = 62.62;
            float ioorjsvma1 = 40.40f;
            byte kfwwyrbf0 = 36;
            byte gytcxfgda2 = 85;
            double ojqffonr1 = 27.27;
            short dcaumvtruz0 = 69;
            float lfnnchp0 = 66.66f;
            double cegywxyuo4 = 23.23;
            double drguhne3 = 5.5;
            boolean whqopokhq2 = true;
            boolean tcgimndy1 = true;
            short fomwrlmcyx0 = 76;
            byte sabzzqpgjh0 = 15;
            rvkPFfIh(lfnnchp0);
            AOjtZGrx(dcaumvtruz0, ojqffonr1, gytcxfgda2);
            YzfmdnKx(wrjabbupd0, nmxespq1, gqmzyhbp2, rvzqjef3, kpazaxdn4);
            if (EasyManager.isDebug) {
                Log.e(Easy1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private boolean HIiOkla = false;

    //垃圾变量
    private double IFnlwEB = 94.94;

    //垃圾变量
    private short ZkKPTYN = 44;

    //垃圾变量
    private float PfsanhH = 34.34f;

    //垃圾变量
    private byte yJpNbHm = 76;

    //垃圾变量
    private double BIvVjcZ = 0.0;

    //垃圾方法
    private void NrWNpkyh(boolean acnubezi0, boolean lwufnrpte1, short bkhtmpux2, short eqcftug3, long tbxfaiogp4) {
        long tbxfaiogp4a = tbxfaiogp4;
        short eqcftug3a = eqcftug3;
        short bkhtmpux2a = bkhtmpux2;
        boolean lwufnrpte1a = lwufnrpte1;
        boolean acnubezi0a = acnubezi0;
        TextUtils.isDigitsOnly("NrWNpkyh" + tbxfaiogp4a + bkhtmpux2a + acnubezi0a + eqcftug3a + lwufnrpte1a + "NrWNpkyh" + yJpNbHm + LQqPuTU + DJQzvkX + CqHndnh + ahhKorT + bYxWkas + BvisTRo + zXYLhoV + ZkKPTYN + HIiOkla + aLmNOaR + PazNwfa + vqwDWZX + BflGoiA + "");
    }

    //垃圾方法
    private void lUtidMUc(short uqaduirg0, long jmozzpljji1, boolean qrvfrkvlt2, char quedksmi3) {
        char quedksmi3a = quedksmi3;
        boolean qrvfrkvlt2a = qrvfrkvlt2;
        long jmozzpljji1a = jmozzpljji1;
        short uqaduirg0a = uqaduirg0;
        System.out.println("lUtidMUc" + qrvfrkvlt2a + uqaduirg0a + quedksmi3a + jmozzpljji1a + "lUtidMUc" + PazNwfa + zXYLhoV + yJpNbHm + ZkKPTYN + BvisTRo + aLmNOaR + LQqPuTU + HIiOkla + CqHndnh + DJQzvkX + ahhKorT + BflGoiA + bYxWkas + vqwDWZX + "");
    }

    //垃圾方法
    private void MrEnqnbi(char kiggmri0, int yltxnlbo1, long cgyfqba2) {
        long cgyfqba2a = cgyfqba2;
        int yltxnlbo1a = yltxnlbo1;
        char kiggmri0a = kiggmri0;
        System.out.println("MrEnqnbi" + yltxnlbo1a + cgyfqba2a + kiggmri0a + "MrEnqnbi" + ZkKPTYN + ahhKorT + BvisTRo + aLmNOaR + bYxWkas + PazNwfa + BflGoiA + vqwDWZX + CqHndnh + yJpNbHm + HIiOkla + LQqPuTU + DJQzvkX + zXYLhoV + "");
    }

    //垃圾方法
    private void zCemFcKy(long mfikngqe0, char ksycmlvk1, byte xzjbvkrk2) {
        byte xzjbvkrk2a = xzjbvkrk2;
        char ksycmlvk1a = ksycmlvk1;
        long mfikngqe0a = mfikngqe0;
        Log.e("zCemFcKy", "zCemFcKy" + mfikngqe0a + ksycmlvk1a + xzjbvkrk2a + "zCemFcKy" + HIiOkla + bYxWkas + ahhKorT + zXYLhoV + ZkKPTYN + yJpNbHm + aLmNOaR + BflGoiA + DJQzvkX + BvisTRo + CqHndnh + PazNwfa + vqwDWZX + LQqPuTU + "");
    }

    //垃圾方法
    private void QCnEIQSk(float gugvnymho0, boolean tptudwtf1, double wdihlerk2, byte dctikajbwn3) {
        byte dctikajbwn3a = dctikajbwn3;
        double wdihlerk2a = wdihlerk2;
        boolean tptudwtf1a = tptudwtf1;
        float gugvnymho0a = gugvnymho0;
        Log.i("QCnEIQSk", "QCnEIQSk" + dctikajbwn3a + wdihlerk2a + gugvnymho0a + tptudwtf1a + "QCnEIQSk" + ahhKorT + LQqPuTU + ZkKPTYN + HIiOkla + yJpNbHm + DJQzvkX + PazNwfa + BvisTRo + aLmNOaR + CqHndnh + zXYLhoV + BflGoiA + bYxWkas + vqwDWZX + "");
    }

    //垃圾方法
    private void zBgVvIDC(long smzilba0, double qyajnzaqa1, short dsxrdolcpg2, byte mzjvbpvisk3) {
        byte mzjvbpvisk3a = mzjvbpvisk3;
        short dsxrdolcpg2a = dsxrdolcpg2;
        double qyajnzaqa1a = qyajnzaqa1;
        long smzilba0a = smzilba0;
        System.out.println("zBgVvIDC" + mzjvbpvisk3a + qyajnzaqa1a + dsxrdolcpg2a + smzilba0a + "zBgVvIDC" + LQqPuTU + BvisTRo + yJpNbHm + PazNwfa + DJQzvkX + ahhKorT + CqHndnh + vqwDWZX + aLmNOaR + BflGoiA + zXYLhoV + HIiOkla + bYxWkas + ZkKPTYN + "");
    }

    //垃圾方法
    private void jLPwmVhv(float ntizpqgcer0, short jikahsr1, boolean viokxawwux2) {
        boolean viokxawwux2a = viokxawwux2;
        short jikahsr1a = jikahsr1;
        float ntizpqgcer0a = ntizpqgcer0;
        new File("jLPwmVhv" + ntizpqgcer0a + viokxawwux2a + jikahsr1a + "jLPwmVhv" + vqwDWZX + HIiOkla + ZkKPTYN + yJpNbHm + BvisTRo + bYxWkas + ahhKorT + LQqPuTU + aLmNOaR + BflGoiA + zXYLhoV + PazNwfa + CqHndnh + DJQzvkX + "");
    }

    //垃圾方法
    private void NbdietsI(byte dscjfoar0) {
        byte dscjfoar0a = dscjfoar0;
        new AttributedString("NbdietsI" + dscjfoar0a + "NbdietsI" + vqwDWZX + CqHndnh + yJpNbHm + bYxWkas + zXYLhoV + BflGoiA + aLmNOaR + PazNwfa + HIiOkla + BvisTRo + ahhKorT + DJQzvkX + ZkKPTYN + LQqPuTU + "");
    }

    public String toString() {
        byte dscjfoar0 = 20;
        boolean viokxawwux2 = false;
        short jikahsr1 = 44;
        float ntizpqgcer0 = 40.40f;
        byte mzjvbpvisk3 = 42;
        short dsxrdolcpg2 = 76;
        double qyajnzaqa1 = 20.20;
        long smzilba0 = 10L;
        byte dctikajbwn3 = 19;
        double wdihlerk2 = 8.8;
        boolean tptudwtf1 = true;
        float gugvnymho0 = 80.80f;
        byte xzjbvkrk2 = 15;
        char ksycmlvk1 = 81;
        long mfikngqe0 = 0L;
        long cgyfqba2 = 28L;
        int yltxnlbo1 = 36;
        char kiggmri0 = 31;
        char quedksmi3 = 80;
        boolean qrvfrkvlt2 = true;
        long jmozzpljji1 = 67L;
        short uqaduirg0 = 10;
        long tbxfaiogp4 = 22L;
        short eqcftug3 = 87;
        short bkhtmpux2 = 48;
        boolean lwufnrpte1 = true;
        boolean acnubezi0 = true;
        new Thread("" + PfsanhH + IFnlwEB + BIvVjcZ + "");
        QCnEIQSk(gugvnymho0, tptudwtf1, wdihlerk2, dctikajbwn3);
        QCnEIQSk(gugvnymho0, tptudwtf1, wdihlerk2, dctikajbwn3);
        NbdietsI(dscjfoar0);
        zBgVvIDC(smzilba0, qyajnzaqa1, dsxrdolcpg2, mzjvbpvisk3);
        zCemFcKy(mfikngqe0, ksycmlvk1, xzjbvkrk2);
        NbdietsI(dscjfoar0);
        MrEnqnbi(kiggmri0, yltxnlbo1, cgyfqba2);
        NrWNpkyh(acnubezi0, lwufnrpte1, bkhtmpux2, eqcftug3, tbxfaiogp4);
        NbdietsI(dscjfoar0);
        return super.toString();
    }
}
