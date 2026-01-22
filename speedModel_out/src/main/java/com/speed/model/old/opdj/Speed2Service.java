package com.speed.model.old.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
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

public class Speed2Service extends Service {

    //垃圾变量
    private int sFymQMI = 43;

    String TAG = "xxx";

    //垃圾变量
    private boolean sfZANgH = true;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private double vDBLPkG = 88.88;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private long mhvmhLi = 53L;

    public static Boolean isLiving = false;

    //垃圾变量
    private char gZVqzBA = 91;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private boolean WTSmtPB = true;

    private static long delayTime = 250L;

    //垃圾变量
    private byte PWVOGYV = 38;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private double EfRlqcj = 20.20;

    public static boolean isStartService = false;

    //垃圾变量
    private short UNAajVZ = 30;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (SpeedManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private short yXTNrSe = 35;

    int nextNum = -1;

    //垃圾变量
    private long LrBKERq = 46L;

    private static IBinder mainBinder = null;

    public Speed2Service() {
    }

    //垃圾方法
    private void SjdAsGTt(double nrznsbtglg0, double jpwjhvgtzj1, double tbdxzwivb2, float eewqajjm3, char xljjrbgy4) {
        char xljjrbgy4a = xljjrbgy4;
        float eewqajjm3a = eewqajjm3;
        double tbdxzwivb2a = tbdxzwivb2;
        double jpwjhvgtzj1a = jpwjhvgtzj1;
        double nrznsbtglg0a = nrznsbtglg0;
        new StringReader("SjdAsGTt" + eewqajjm3a + tbdxzwivb2a + xljjrbgy4a + jpwjhvgtzj1a + nrznsbtglg0a + "SjdAsGTt" + sFymQMI + JyhAYjn + mhvmhLi + gZVqzBA + sfZANgH + UNAajVZ + nURMYzq + EfRlqcj + yXTNrSe + cRFzqNH + KwUWZCI + rnDYhNz + WTSmtPB + vDBLPkG + PWVOGYV + LrBKERq + wWvSqAx + "");
    }

    //垃圾方法
    private void dzbkcbsE(char torbvtz0, char wukdbunmw1, int fkxjrhkm2) {
        int fkxjrhkm2a = fkxjrhkm2;
        char wukdbunmw1a = wukdbunmw1;
        char torbvtz0a = torbvtz0;
    }

    //垃圾方法
    private void cnXMlajS(double aogqtrxo0, byte qyntnzyvq1) {
        byte qyntnzyvq1a = qyntnzyvq1;
        double aogqtrxo0a = aogqtrxo0;
        new StringReader("cnXMlajS" + qyntnzyvq1a + aogqtrxo0a + "cnXMlajS" + LrBKERq + KwUWZCI + cRFzqNH + yXTNrSe + gZVqzBA + PWVOGYV + sfZANgH + sFymQMI + vDBLPkG + WTSmtPB + UNAajVZ + nURMYzq + wWvSqAx + rnDYhNz + EfRlqcj + JyhAYjn + mhvmhLi + "");
    }

    //垃圾方法
    private void BIdiZQhT(float mbjlrme0, int jprckhpfap1, int xrrshfo2, byte xuwbhmrnnz3, byte qbkjykxls4) {
        byte qbkjykxls4a = qbkjykxls4;
        byte xuwbhmrnnz3a = xuwbhmrnnz3;
        int xrrshfo2a = xrrshfo2;
        int jprckhpfap1a = jprckhpfap1;
        float mbjlrme0a = mbjlrme0;
        Log.w("BIdiZQhT", "BIdiZQhT" + mbjlrme0a + jprckhpfap1a + xrrshfo2a + xuwbhmrnnz3a + qbkjykxls4a + "BIdiZQhT" + gZVqzBA + UNAajVZ + KwUWZCI + nURMYzq + sFymQMI + vDBLPkG + sfZANgH + JyhAYjn + EfRlqcj + rnDYhNz + mhvmhLi + yXTNrSe + LrBKERq + wWvSqAx + cRFzqNH + WTSmtPB + PWVOGYV + "");
    }

    //垃圾方法
    private void JIWGaxBf(short cuglzqwdkt0, int wrpeouj1, double htzrvwa2, byte xnxqcfmm3) {
        byte xnxqcfmm3a = xnxqcfmm3;
        double htzrvwa2a = htzrvwa2;
        int wrpeouj1a = wrpeouj1;
        short cuglzqwdkt0a = cuglzqwdkt0;
        TextUtils.isDigitsOnly("JIWGaxBf" + htzrvwa2a + xnxqcfmm3a + cuglzqwdkt0a + wrpeouj1a + "JIWGaxBf" + sfZANgH + WTSmtPB + LrBKERq + mhvmhLi + PWVOGYV + yXTNrSe + vDBLPkG + KwUWZCI + UNAajVZ + gZVqzBA + JyhAYjn + sFymQMI + nURMYzq + wWvSqAx + cRFzqNH + rnDYhNz + EfRlqcj + "");
    }

    //垃圾方法
    private void zfwAYvKV(boolean aiiukfb0) {
        boolean aiiukfb0a = aiiukfb0;
        new StringBuilder("zfwAYvKV" + aiiukfb0a + "zfwAYvKV" + vDBLPkG + gZVqzBA + nURMYzq + cRFzqNH + rnDYhNz + EfRlqcj + wWvSqAx + yXTNrSe + UNAajVZ + PWVOGYV + sFymQMI + JyhAYjn + sfZANgH + KwUWZCI + LrBKERq + mhvmhLi + WTSmtPB + "");
    }

    //垃圾方法
    private void dubzyTTX(long ecrpgemic0, byte wgwyifrleo1) {
        byte wgwyifrleo1a = wgwyifrleo1;
        long ecrpgemic0a = ecrpgemic0;
        new Thread("dubzyTTX" + ecrpgemic0a + wgwyifrleo1a + "dubzyTTX" + PWVOGYV + cRFzqNH + sFymQMI + rnDYhNz + mhvmhLi + yXTNrSe + KwUWZCI + UNAajVZ + wWvSqAx + LrBKERq + JyhAYjn + gZVqzBA + WTSmtPB + sfZANgH + vDBLPkG + nURMYzq + EfRlqcj + "");
    }

    //垃圾方法
    private void JqyGhpsf(int plpeaeo0, byte txzlmytrw1) {
        byte txzlmytrw1a = txzlmytrw1;
        int plpeaeo0a = plpeaeo0;
        new Intent("JqyGhpsf" + plpeaeo0a + txzlmytrw1a + "JqyGhpsf" + sfZANgH + gZVqzBA + UNAajVZ + mhvmhLi + vDBLPkG + PWVOGYV + sFymQMI + cRFzqNH + yXTNrSe + nURMYzq + LrBKERq + EfRlqcj + rnDYhNz + WTSmtPB + wWvSqAx + KwUWZCI + JyhAYjn + "");
    }

    //垃圾方法
    private void IlpoxzKB(boolean svjapzaoy0, double gfbujvx1) {
        double gfbujvx1a = gfbujvx1;
        boolean svjapzaoy0a = svjapzaoy0;
        new File("IlpoxzKB" + gfbujvx1a + svjapzaoy0a + "IlpoxzKB" + cRFzqNH + gZVqzBA + wWvSqAx + yXTNrSe + nURMYzq + rnDYhNz + sFymQMI + UNAajVZ + vDBLPkG + JyhAYjn + mhvmhLi + LrBKERq + sfZANgH + EfRlqcj + KwUWZCI + WTSmtPB + PWVOGYV + "");
    }

    //垃圾方法
    private void ooexRIWE(short caxgbcen0, byte gtpblgkeo1, char qxddchhsgf2) {
        char qxddchhsgf2a = qxddchhsgf2;
        byte gtpblgkeo1a = gtpblgkeo1;
        short caxgbcen0a = caxgbcen0;
        new StringBuffer("ooexRIWE" + caxgbcen0a + gtpblgkeo1a + qxddchhsgf2a + "ooexRIWE" + mhvmhLi + cRFzqNH + gZVqzBA + JyhAYjn + KwUWZCI + sfZANgH + yXTNrSe + LrBKERq + rnDYhNz + sFymQMI + WTSmtPB + wWvSqAx + EfRlqcj + vDBLPkG + nURMYzq + UNAajVZ + PWVOGYV + "");
    }

    //垃圾方法
    private void iIJzsuCw(boolean vwrohwn0, double rqedmcr1) {
        double rqedmcr1a = rqedmcr1;
        boolean vwrohwn0a = vwrohwn0;
        Log.i("iIJzsuCw", "iIJzsuCw" + rqedmcr1a + vwrohwn0a + "iIJzsuCw" + yXTNrSe + gZVqzBA + rnDYhNz + UNAajVZ + cRFzqNH + EfRlqcj + vDBLPkG + KwUWZCI + WTSmtPB + mhvmhLi + wWvSqAx + nURMYzq + LrBKERq + sFymQMI + JyhAYjn + PWVOGYV + sfZANgH + "");
    }

    //垃圾方法
    private void GuzUiHnT(int ezxxbere0, long buqfxcds1, byte vjouymkbe2, int fxbskhsmx3, float kiohqmhy4) {
        float kiohqmhy4a = kiohqmhy4;
        int fxbskhsmx3a = fxbskhsmx3;
        byte vjouymkbe2a = vjouymkbe2;
        long buqfxcds1a = buqfxcds1;
        int ezxxbere0a = ezxxbere0;
        new File("GuzUiHnT" + buqfxcds1a + fxbskhsmx3a + vjouymkbe2a + ezxxbere0a + kiohqmhy4a + "GuzUiHnT" + vDBLPkG + mhvmhLi + cRFzqNH + yXTNrSe + rnDYhNz + JyhAYjn + UNAajVZ + EfRlqcj + LrBKERq + nURMYzq + gZVqzBA + wWvSqAx + KwUWZCI + sfZANgH + WTSmtPB + sFymQMI + PWVOGYV + "");
    }

    //垃圾方法
    private void nNzuiXcT(short wuiyfgx0, char fohnpiqune1, boolean nddznraddo2, double xhgdariohf3, short yozpdytp4) {
        short yozpdytp4a = yozpdytp4;
        double xhgdariohf3a = xhgdariohf3;
        boolean nddznraddo2a = nddznraddo2;
        char fohnpiqune1a = fohnpiqune1;
        short wuiyfgx0a = wuiyfgx0;
        new WeakReference("nNzuiXcT" + wuiyfgx0a + nddznraddo2a + xhgdariohf3a + yozpdytp4a + fohnpiqune1a + "nNzuiXcT" + EfRlqcj + wWvSqAx + vDBLPkG + cRFzqNH + mhvmhLi + rnDYhNz + WTSmtPB + LrBKERq + gZVqzBA + UNAajVZ + KwUWZCI + nURMYzq + JyhAYjn + yXTNrSe + sFymQMI + sfZANgH + PWVOGYV + "");
    }

    //垃圾方法
    private void pknDJSss(byte erxajiq0, boolean thetdtth1, long ckviqggmp2, long riqmque3) {
        long riqmque3a = riqmque3;
        long ckviqggmp2a = ckviqggmp2;
        boolean thetdtth1a = thetdtth1;
        byte erxajiq0a = erxajiq0;
        Log.i("pknDJSss", "pknDJSss" + ckviqggmp2a + erxajiq0a + riqmque3a + thetdtth1a + "pknDJSss" + LrBKERq + vDBLPkG + sFymQMI + mhvmhLi + sfZANgH + gZVqzBA + wWvSqAx + EfRlqcj + JyhAYjn + PWVOGYV + cRFzqNH + KwUWZCI + yXTNrSe + rnDYhNz + WTSmtPB + nURMYzq + UNAajVZ + "");
    }

    //垃圾方法
    private void qJVvojXW(int arxjpgk0, byte fwnsjjlzqh1, byte snrcrbgw2, boolean eiogtqu3, char twtqiaa4) {
        char twtqiaa4a = twtqiaa4;
        boolean eiogtqu3a = eiogtqu3;
        byte snrcrbgw2a = snrcrbgw2;
        byte fwnsjjlzqh1a = fwnsjjlzqh1;
        int arxjpgk0a = arxjpgk0;
        new File("qJVvojXW" + eiogtqu3a + snrcrbgw2a + fwnsjjlzqh1a + arxjpgk0a + twtqiaa4a + "qJVvojXW" + cRFzqNH + yXTNrSe + sfZANgH + PWVOGYV + EfRlqcj + mhvmhLi + UNAajVZ + wWvSqAx + rnDYhNz + nURMYzq + JyhAYjn + vDBLPkG + KwUWZCI + WTSmtPB + LrBKERq + gZVqzBA + sFymQMI + "");
    }

    //垃圾方法
    private void nSWoChBA(boolean fithgobewy0, byte zfiracfvm1, float tzeocwxz2, float crxzggoo3) {
        float crxzggoo3a = crxzggoo3;
        float tzeocwxz2a = tzeocwxz2;
        byte zfiracfvm1a = zfiracfvm1;
        boolean fithgobewy0a = fithgobewy0;
        new Thread("nSWoChBA" + crxzggoo3a + fithgobewy0a + tzeocwxz2a + zfiracfvm1a + "nSWoChBA" + yXTNrSe + PWVOGYV + rnDYhNz + LrBKERq + mhvmhLi + cRFzqNH + WTSmtPB + UNAajVZ + vDBLPkG + JyhAYjn + sFymQMI + nURMYzq + sfZANgH + KwUWZCI + gZVqzBA + EfRlqcj + wWvSqAx + "");
    }

    //垃圾方法
    private void wGKCiKtz(boolean zornlvv0) {
        boolean zornlvv0a = zornlvv0;
        new WeakReference("wGKCiKtz" + zornlvv0a + "wGKCiKtz" + sfZANgH + nURMYzq + EfRlqcj + sFymQMI + KwUWZCI + WTSmtPB + vDBLPkG + LrBKERq + mhvmhLi + wWvSqAx + gZVqzBA + JyhAYjn + UNAajVZ + rnDYhNz + yXTNrSe + cRFzqNH + PWVOGYV + "");
    }

    //垃圾方法
    private void EeMQEFst(short qqmdyytxoh0, float kmpourpvtj1, short ynknshsr2, char tbibvpsnfz3, double ajnbhwf4) {
        double ajnbhwf4a = ajnbhwf4;
        char tbibvpsnfz3a = tbibvpsnfz3;
        short ynknshsr2a = ynknshsr2;
        float kmpourpvtj1a = kmpourpvtj1;
        short qqmdyytxoh0a = qqmdyytxoh0;
        new Thread("EeMQEFst" + tbibvpsnfz3a + qqmdyytxoh0a + ynknshsr2a + ajnbhwf4a + kmpourpvtj1a + "EeMQEFst" + UNAajVZ + mhvmhLi + vDBLPkG + LrBKERq + WTSmtPB + wWvSqAx + sFymQMI + rnDYhNz + PWVOGYV + cRFzqNH + KwUWZCI + sfZANgH + yXTNrSe + EfRlqcj + gZVqzBA + JyhAYjn + nURMYzq + "");
    }

    //垃圾方法
    private void fKOSlSCn(double ppwtlnmbel0, double xlwabcnhn1) {
        double xlwabcnhn1a = xlwabcnhn1;
        double ppwtlnmbel0a = ppwtlnmbel0;
        Log.e("fKOSlSCn", "fKOSlSCn" + xlwabcnhn1a + ppwtlnmbel0a + "fKOSlSCn" + cRFzqNH + UNAajVZ + rnDYhNz + WTSmtPB + sFymQMI + mhvmhLi + EfRlqcj + sfZANgH + gZVqzBA + JyhAYjn + PWVOGYV + KwUWZCI + yXTNrSe + LrBKERq + vDBLPkG + nURMYzq + wWvSqAx + "");
    }

    //垃圾方法
    private void DeudufiO(boolean docpluhxgm0, long evxgeuihg1, double nwzbsqgjn2) {
        double nwzbsqgjn2a = nwzbsqgjn2;
        long evxgeuihg1a = evxgeuihg1;
        boolean docpluhxgm0a = docpluhxgm0;
        new Thread("DeudufiO" + docpluhxgm0a + evxgeuihg1a + nwzbsqgjn2a + "DeudufiO" + PWVOGYV + JyhAYjn + sfZANgH + gZVqzBA + yXTNrSe + WTSmtPB + UNAajVZ + cRFzqNH + mhvmhLi + vDBLPkG + EfRlqcj + LrBKERq + KwUWZCI + sFymQMI + rnDYhNz + nURMYzq + wWvSqAx + "");
    }

    //垃圾方法
    private void aurvpzwl(byte nwvqidas0, byte uleuerase1, long ekemczssqn2, byte rdcmjcwhqw3) {
        byte rdcmjcwhqw3a = rdcmjcwhqw3;
        long ekemczssqn2a = ekemczssqn2;
        byte uleuerase1a = uleuerase1;
        byte nwvqidas0a = nwvqidas0;
        new Intent("aurvpzwl" + ekemczssqn2a + nwvqidas0a + uleuerase1a + rdcmjcwhqw3a + "aurvpzwl" + cRFzqNH + WTSmtPB + rnDYhNz + mhvmhLi + wWvSqAx + LrBKERq + PWVOGYV + JyhAYjn + nURMYzq + vDBLPkG + sfZANgH + yXTNrSe + EfRlqcj + KwUWZCI + sFymQMI + UNAajVZ + gZVqzBA + "");
    }

    //垃圾方法
    private void OMipwlHQ(long alzvasyn0, boolean gkuuxuvk1) {
        boolean gkuuxuvk1a = gkuuxuvk1;
        long alzvasyn0a = alzvasyn0;
        Log.w("OMipwlHQ", "OMipwlHQ" + gkuuxuvk1a + alzvasyn0a + "OMipwlHQ" + JyhAYjn + KwUWZCI + WTSmtPB + wWvSqAx + cRFzqNH + LrBKERq + sFymQMI + PWVOGYV + mhvmhLi + EfRlqcj + gZVqzBA + sfZANgH + UNAajVZ + yXTNrSe + vDBLPkG + rnDYhNz + nURMYzq + "");
    }

    //垃圾方法
    private void wKDDlwJK(short vkcqemphee0, long nogzdpmm1, long jhwirmyem2) {
        long jhwirmyem2a = jhwirmyem2;
        long nogzdpmm1a = nogzdpmm1;
        short vkcqemphee0a = vkcqemphee0;
        new Thread("wKDDlwJK" + jhwirmyem2a + vkcqemphee0a + nogzdpmm1a + "wKDDlwJK" + KwUWZCI + PWVOGYV + vDBLPkG + gZVqzBA + JyhAYjn + sfZANgH + yXTNrSe + nURMYzq + EfRlqcj + mhvmhLi + wWvSqAx + cRFzqNH + LrBKERq + UNAajVZ + WTSmtPB + sFymQMI + rnDYhNz + "");
    }

    //垃圾方法
    private void cOffWqjO(short clwzesyzj0) {
        short clwzesyzj0a = clwzesyzj0;
        new Thread("cOffWqjO" + clwzesyzj0a + "cOffWqjO" + sFymQMI + sfZANgH + UNAajVZ + JyhAYjn + KwUWZCI + WTSmtPB + PWVOGYV + gZVqzBA + nURMYzq + cRFzqNH + wWvSqAx + mhvmhLi + EfRlqcj + LrBKERq + yXTNrSe + vDBLPkG + rnDYhNz + "");
    }

    //垃圾方法
    private void YNYAMqoi(short htuxnalwh0, float airqxjbp1) {
        float airqxjbp1a = airqxjbp1;
        short htuxnalwh0a = htuxnalwh0;
        new StringBuffer("YNYAMqoi" + htuxnalwh0a + airqxjbp1a + "YNYAMqoi" + WTSmtPB + yXTNrSe + sfZANgH + vDBLPkG + UNAajVZ + mhvmhLi + cRFzqNH + KwUWZCI + EfRlqcj + LrBKERq + JyhAYjn + nURMYzq + sFymQMI + PWVOGYV + rnDYhNz + gZVqzBA + wWvSqAx + "");
    }

    //垃圾方法
    private void WTainMiA(short dobbxtdbk0, long cwlzkqesxp1, double mjzgryiw2, short mxkuxbx3) {
        short mxkuxbx3a = mxkuxbx3;
        double mjzgryiw2a = mjzgryiw2;
        long cwlzkqesxp1a = cwlzkqesxp1;
        short dobbxtdbk0a = dobbxtdbk0;
        new AttributedString("WTainMiA" + mxkuxbx3a + cwlzkqesxp1a + mjzgryiw2a + dobbxtdbk0a + "WTainMiA" + EfRlqcj + sfZANgH + KwUWZCI + sFymQMI + PWVOGYV + UNAajVZ + WTSmtPB + rnDYhNz + JyhAYjn + vDBLPkG + wWvSqAx + LrBKERq + mhvmhLi + nURMYzq + yXTNrSe + gZVqzBA + cRFzqNH + "");
    }

    //垃圾方法
    private void tBnzLjzb(float pfpuydcg0, byte pinqumcdq1, double ommyqjc2, char azycfyf3) {
        char azycfyf3a = azycfyf3;
        double ommyqjc2a = ommyqjc2;
        byte pinqumcdq1a = pinqumcdq1;
        float pfpuydcg0a = pfpuydcg0;
        Log.i("tBnzLjzb", "tBnzLjzb" + azycfyf3a + pfpuydcg0a + pinqumcdq1a + ommyqjc2a + "tBnzLjzb" + nURMYzq + UNAajVZ + gZVqzBA + JyhAYjn + vDBLPkG + cRFzqNH + mhvmhLi + WTSmtPB + EfRlqcj + KwUWZCI + sfZANgH + PWVOGYV + LrBKERq + sFymQMI + rnDYhNz + yXTNrSe + wWvSqAx + "");
    }

    //垃圾方法
    private void bFWFUbkj(double xcuqhxdepq0, int spjqbmctl1) {
        int spjqbmctl1a = spjqbmctl1;
        double xcuqhxdepq0a = xcuqhxdepq0;
        TextUtils.isEmpty("bFWFUbkj" + xcuqhxdepq0a + spjqbmctl1a + "bFWFUbkj" + rnDYhNz + KwUWZCI + nURMYzq + WTSmtPB + sFymQMI + gZVqzBA + LrBKERq + JyhAYjn + wWvSqAx + UNAajVZ + EfRlqcj + cRFzqNH + mhvmhLi + vDBLPkG + PWVOGYV + yXTNrSe + sfZANgH + "");
    }

    public void onCreate() {
        int spjqbmctl1 = 31;
        double xcuqhxdepq0 = 65.65;
        char azycfyf3 = 53;
        double ommyqjc2 = 68.68;
        byte pinqumcdq1 = 43;
        float pfpuydcg0 = 15.15f;
        short mxkuxbx3 = 45;
        double mjzgryiw2 = 91.91;
        long cwlzkqesxp1 = 56L;
        short dobbxtdbk0 = 64;
        float airqxjbp1 = 7.7f;
        short htuxnalwh0 = 79;
        short clwzesyzj0 = 47;
        long jhwirmyem2 = 17L;
        long nogzdpmm1 = 50L;
        short vkcqemphee0 = 39;
        boolean gkuuxuvk1 = true;
        long alzvasyn0 = 2L;
        byte rdcmjcwhqw3 = 53;
        long ekemczssqn2 = 14L;
        byte uleuerase1 = 87;
        byte nwvqidas0 = 86;
        double nwzbsqgjn2 = 24.24;
        long evxgeuihg1 = 71L;
        boolean docpluhxgm0 = false;
        double xlwabcnhn1 = 24.24;
        double ppwtlnmbel0 = 20.20;
        double ajnbhwf4 = 38.38;
        char tbibvpsnfz3 = 75;
        short ynknshsr2 = 59;
        float kmpourpvtj1 = 60.60f;
        short qqmdyytxoh0 = 92;
        boolean zornlvv0 = false;
        float crxzggoo3 = 55.55f;
        float tzeocwxz2 = 38.38f;
        byte zfiracfvm1 = 88;
        boolean fithgobewy0 = false;
        char twtqiaa4 = 76;
        boolean eiogtqu3 = false;
        byte snrcrbgw2 = 87;
        byte fwnsjjlzqh1 = 87;
        int arxjpgk0 = 25;
        long riqmque3 = 33L;
        long ckviqggmp2 = 31L;
        boolean thetdtth1 = false;
        byte erxajiq0 = 21;
        short yozpdytp4 = 22;
        double xhgdariohf3 = 19.19;
        boolean nddznraddo2 = false;
        char fohnpiqune1 = 91;
        short wuiyfgx0 = 49;
        float kiohqmhy4 = 76.76f;
        int fxbskhsmx3 = 29;
        byte vjouymkbe2 = 78;
        long buqfxcds1 = 69L;
        int ezxxbere0 = 66;
        double rqedmcr1 = 25.25;
        boolean vwrohwn0 = true;
        char qxddchhsgf2 = 42;
        byte gtpblgkeo1 = 30;
        short caxgbcen0 = 61;
        double gfbujvx1 = 60.60;
        boolean svjapzaoy0 = false;
        byte txzlmytrw1 = 64;
        int plpeaeo0 = 77;
        byte wgwyifrleo1 = 53;
        long ecrpgemic0 = 83L;
        boolean aiiukfb0 = true;
        byte xnxqcfmm3 = 4;
        double htzrvwa2 = 65.65;
        int wrpeouj1 = 44;
        short cuglzqwdkt0 = 88;
        byte qbkjykxls4 = 43;
        byte xuwbhmrnnz3 = 47;
        int xrrshfo2 = 64;
        int jprckhpfap1 = 10;
        float mbjlrme0 = 99.99f;
        byte qyntnzyvq1 = 13;
        double aogqtrxo0 = 51.51;
        int fkxjrhkm2 = 97;
        char wukdbunmw1 = 55;
        char torbvtz0 = 71;
        char xljjrbgy4 = 58;
        float eewqajjm3 = 16.16f;
        double tbdxzwivb2 = 70.70;
        double jpwjhvgtzj1 = 81.81;
        double nrznsbtglg0 = 90.90;
        zfwAYvKV(aiiukfb0);
        SjdAsGTt(nrznsbtglg0, jpwjhvgtzj1, tbdxzwivb2, eewqajjm3, xljjrbgy4);
        nSWoChBA(fithgobewy0, zfiracfvm1, tzeocwxz2, crxzggoo3);
        WTainMiA(dobbxtdbk0, cwlzkqesxp1, mjzgryiw2, mxkuxbx3);
        dubzyTTX(ecrpgemic0, wgwyifrleo1);
        BIdiZQhT(mbjlrme0, jprckhpfap1, xrrshfo2, xuwbhmrnnz3, qbkjykxls4);
        SjdAsGTt(nrznsbtglg0, jpwjhvgtzj1, tbdxzwivb2, eewqajjm3, xljjrbgy4);
        JqyGhpsf(plpeaeo0, txzlmytrw1);
        fKOSlSCn(ppwtlnmbel0, xlwabcnhn1);
        isLiving = true;
        aurvpzwl(nwvqidas0, uleuerase1, ekemczssqn2, rdcmjcwhqw3);
        IlpoxzKB(svjapzaoy0, gfbujvx1);
        DeudufiO(docpluhxgm0, evxgeuihg1, nwzbsqgjn2);
        EeMQEFst(qqmdyytxoh0, kmpourpvtj1, ynknshsr2, tbibvpsnfz3, ajnbhwf4);
        WTainMiA(dobbxtdbk0, cwlzkqesxp1, mjzgryiw2, mxkuxbx3);
        nNzuiXcT(wuiyfgx0, fohnpiqune1, nddznraddo2, xhgdariohf3, yozpdytp4);
        YNYAMqoi(htuxnalwh0, airqxjbp1);
        super.onCreate();
        EeMQEFst(qqmdyytxoh0, kmpourpvtj1, ynknshsr2, tbibvpsnfz3, ajnbhwf4);
        nSWoChBA(fithgobewy0, zfiracfvm1, tzeocwxz2, crxzggoo3);
        JIWGaxBf(cuglzqwdkt0, wrpeouj1, htzrvwa2, xnxqcfmm3);
        YNYAMqoi(htuxnalwh0, airqxjbp1);
        DeudufiO(docpluhxgm0, evxgeuihg1, nwzbsqgjn2);
        aurvpzwl(nwvqidas0, uleuerase1, ekemczssqn2, rdcmjcwhqw3);
        wGKCiKtz(zornlvv0);
        pknDJSss(erxajiq0, thetdtth1, ckviqggmp2, riqmque3);
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        this.mServiceBinder = new ServiceBinder(this);
        nSWoChBA(fithgobewy0, zfiracfvm1, tzeocwxz2, crxzggoo3);
        SjdAsGTt(nrznsbtglg0, jpwjhvgtzj1, tbdxzwivb2, eewqajjm3, xljjrbgy4);
        zfwAYvKV(aiiukfb0);
        DeudufiO(docpluhxgm0, evxgeuihg1, nwzbsqgjn2);
        bFWFUbkj(xcuqhxdepq0, spjqbmctl1);
        DeudufiO(docpluhxgm0, evxgeuihg1, nwzbsqgjn2);
        qJVvojXW(arxjpgk0, fwnsjjlzqh1, snrcrbgw2, eiogtqu3, twtqiaa4);
        tBnzLjzb(pfpuydcg0, pinqumcdq1, ommyqjc2, azycfyf3);
        if (this.mRemoteServiceConn == null) {
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        OMipwlHQ(alzvasyn0, gkuuxuvk1);
        cOffWqjO(clwzesyzj0);
        dubzyTTX(ecrpgemic0, wgwyifrleo1);
        isReTryBinding = true;
        nNzuiXcT(wuiyfgx0, fohnpiqune1, nddznraddo2, xhgdariohf3, yozpdytp4);
        cOffWqjO(clwzesyzj0);
        bFWFUbkj(xcuqhxdepq0, spjqbmctl1);
        iIJzsuCw(vwrohwn0, rqedmcr1);
        zfwAYvKV(aiiukfb0);
        GuzUiHnT(ezxxbere0, buqfxcds1, vjouymkbe2, fxbskhsmx3, kiohqmhy4);
        DeudufiO(docpluhxgm0, evxgeuihg1, nwzbsqgjn2);
        this.startMainService(1, false);
    }

    //垃圾方法
    private void gipjzqxx(long qjlmqfkkxj0, char mkwemvj1, long bdooams2, long aaiekwl3, char tfiltoni4) {
        char tfiltoni4a = tfiltoni4;
        long aaiekwl3a = aaiekwl3;
        long bdooams2a = bdooams2;
        char mkwemvj1a = mkwemvj1;
        long qjlmqfkkxj0a = qjlmqfkkxj0;
        new Intent("gipjzqxx" + tfiltoni4a + mkwemvj1a + bdooams2a + qjlmqfkkxj0a + aaiekwl3a + "gipjzqxx" + KwUWZCI + wWvSqAx + PWVOGYV + JyhAYjn + WTSmtPB + vDBLPkG + sFymQMI + rnDYhNz + LrBKERq + cRFzqNH + EfRlqcj + sfZANgH + nURMYzq + UNAajVZ + mhvmhLi + yXTNrSe + gZVqzBA + "");
    }

    //垃圾方法
    private void LMDsRLml(short uxeadpk0, short fvxywxaaau1, char xbxbgpyr2, long aoooqidn3, short vknekkksww4) {
        short vknekkksww4a = vknekkksww4;
        long aoooqidn3a = aoooqidn3;
        char xbxbgpyr2a = xbxbgpyr2;
        short fvxywxaaau1a = fvxywxaaau1;
        short uxeadpk0a = uxeadpk0;
        Log.e("LMDsRLml", "LMDsRLml" + uxeadpk0a + vknekkksww4a + aoooqidn3a + fvxywxaaau1a + xbxbgpyr2a + "LMDsRLml" + gZVqzBA + nURMYzq + rnDYhNz + sfZANgH + WTSmtPB + PWVOGYV + yXTNrSe + wWvSqAx + JyhAYjn + UNAajVZ + mhvmhLi + sFymQMI + LrBKERq + cRFzqNH + KwUWZCI + EfRlqcj + vDBLPkG + "");
    }

    //垃圾方法
    private void vTVNxEKk(double vkfyomqe0, short ndprjwg1, int sdbqiis2, byte yxexeuae3, byte rmmtzkxp4) {
        byte rmmtzkxp4a = rmmtzkxp4;
        byte yxexeuae3a = yxexeuae3;
        int sdbqiis2a = sdbqiis2;
        short ndprjwg1a = ndprjwg1;
        double vkfyomqe0a = vkfyomqe0;
        new AttributedString("vTVNxEKk" + ndprjwg1a + sdbqiis2a + yxexeuae3a + vkfyomqe0a + rmmtzkxp4a + "vTVNxEKk" + UNAajVZ + rnDYhNz + wWvSqAx + vDBLPkG + LrBKERq + WTSmtPB + EfRlqcj + JyhAYjn + PWVOGYV + nURMYzq + sFymQMI + mhvmhLi + cRFzqNH + gZVqzBA + yXTNrSe + KwUWZCI + sfZANgH + "");
    }

    //垃圾方法
    private void HDyXxSrV(float mceefhcgi0, long uqoeahb1) {
        long uqoeahb1a = uqoeahb1;
        float mceefhcgi0a = mceefhcgi0;
    }

    //垃圾方法
    private void VLKzFLsa(float bwpakedpgj0) {
        float bwpakedpgj0a = bwpakedpgj0;
        new Thread("VLKzFLsa" + bwpakedpgj0a + "VLKzFLsa" + rnDYhNz + LrBKERq + PWVOGYV + WTSmtPB + yXTNrSe + EfRlqcj + mhvmhLi + JyhAYjn + cRFzqNH + gZVqzBA + nURMYzq + vDBLPkG + UNAajVZ + KwUWZCI + sfZANgH + sFymQMI + wWvSqAx + "");
    }

    //垃圾方法
    private void vuNtYscf(long hjfgecsbf0, byte yvqdeedj1, byte zumwabloak2) {
        byte zumwabloak2a = zumwabloak2;
        byte yvqdeedj1a = yvqdeedj1;
        long hjfgecsbf0a = hjfgecsbf0;
        new StringBuilder("vuNtYscf" + yvqdeedj1a + hjfgecsbf0a + zumwabloak2a + "vuNtYscf" + sfZANgH + nURMYzq + JyhAYjn + EfRlqcj + rnDYhNz + gZVqzBA + LrBKERq + UNAajVZ + wWvSqAx + cRFzqNH + KwUWZCI + vDBLPkG + yXTNrSe + PWVOGYV + mhvmhLi + sFymQMI + WTSmtPB + "");
    }

    //垃圾方法
    private void KHUORGGN(boolean pnawxag0, byte kxjlsnijrt1) {
        byte kxjlsnijrt1a = kxjlsnijrt1;
        boolean pnawxag0a = pnawxag0;
        Log.i("KHUORGGN", "KHUORGGN" + kxjlsnijrt1a + pnawxag0a + "KHUORGGN" + UNAajVZ + sFymQMI + rnDYhNz + sfZANgH + PWVOGYV + JyhAYjn + EfRlqcj + cRFzqNH + gZVqzBA + WTSmtPB + KwUWZCI + mhvmhLi + yXTNrSe + wWvSqAx + LrBKERq + vDBLPkG + nURMYzq + "");
    }

    //垃圾方法
    private void XqtQBGNR(short muctrghc0, byte vmypmkl1, double lktnovnfhk2, double ptxwram3, double lzdlurnmu4) {
        double lzdlurnmu4a = lzdlurnmu4;
        double ptxwram3a = ptxwram3;
        double lktnovnfhk2a = lktnovnfhk2;
        byte vmypmkl1a = vmypmkl1;
        short muctrghc0a = muctrghc0;
        System.out.println("XqtQBGNR" + muctrghc0a + lktnovnfhk2a + ptxwram3a + lzdlurnmu4a + vmypmkl1a + "XqtQBGNR" + EfRlqcj + gZVqzBA + yXTNrSe + sfZANgH + mhvmhLi + WTSmtPB + vDBLPkG + JyhAYjn + cRFzqNH + wWvSqAx + PWVOGYV + sFymQMI + LrBKERq + rnDYhNz + nURMYzq + KwUWZCI + UNAajVZ + "");
    }

    //垃圾方法
    private void dRmMKygm(short axanzuahkx0, long huvtlcnfy1, byte jcrsxkrcz2, double nwkqcfwkf3, float xbbkgojjul4) {
        float xbbkgojjul4a = xbbkgojjul4;
        double nwkqcfwkf3a = nwkqcfwkf3;
        byte jcrsxkrcz2a = jcrsxkrcz2;
        long huvtlcnfy1a = huvtlcnfy1;
        short axanzuahkx0a = axanzuahkx0;
        System.out.println("dRmMKygm" + xbbkgojjul4a + jcrsxkrcz2a + huvtlcnfy1a + axanzuahkx0a + nwkqcfwkf3a + "dRmMKygm" + mhvmhLi + yXTNrSe + nURMYzq + vDBLPkG + gZVqzBA + EfRlqcj + wWvSqAx + JyhAYjn + sfZANgH + cRFzqNH + WTSmtPB + LrBKERq + KwUWZCI + PWVOGYV + UNAajVZ + rnDYhNz + sFymQMI + "");
    }

    //垃圾方法
    private void KgrgNyzR(byte tlanqmmt0) {
        byte tlanqmmt0a = tlanqmmt0;
        new Intent("KgrgNyzR" + tlanqmmt0a + "KgrgNyzR" + mhvmhLi + JyhAYjn + sFymQMI + UNAajVZ + WTSmtPB + wWvSqAx + rnDYhNz + sfZANgH + yXTNrSe + gZVqzBA + LrBKERq + KwUWZCI + vDBLPkG + EfRlqcj + PWVOGYV + nURMYzq + cRFzqNH + "");
    }

    //垃圾方法
    private void ydbTgUOB(float rrocksr0, char ywflveex1, int vrogskxd2, float lqepawlag3) {
        float lqepawlag3a = lqepawlag3;
        int vrogskxd2a = vrogskxd2;
        char ywflveex1a = ywflveex1;
        float rrocksr0a = rrocksr0;
        new String("ydbTgUOB" + vrogskxd2a + ywflveex1a + rrocksr0a + lqepawlag3a + "ydbTgUOB" + rnDYhNz + LrBKERq + wWvSqAx + WTSmtPB + sFymQMI + vDBLPkG + JyhAYjn + nURMYzq + PWVOGYV + sfZANgH + gZVqzBA + cRFzqNH + mhvmhLi + KwUWZCI + UNAajVZ + yXTNrSe + EfRlqcj + "");
    }

    //垃圾方法
    private void CsvkSBmU(short lksqcyrm0, float tfjoyox1, byte bxunyikbg2) {
        byte bxunyikbg2a = bxunyikbg2;
        float tfjoyox1a = tfjoyox1;
        short lksqcyrm0a = lksqcyrm0;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        byte bxunyikbg2 = 34;
        float tfjoyox1 = 20.20f;
        short lksqcyrm0 = 82;
        float lqepawlag3 = 33.33f;
        int vrogskxd2 = 27;
        char ywflveex1 = 97;
        float rrocksr0 = 95.95f;
        byte tlanqmmt0 = 59;
        float xbbkgojjul4 = 22.22f;
        double nwkqcfwkf3 = 61.61;
        byte jcrsxkrcz2 = 70;
        long huvtlcnfy1 = 56L;
        short axanzuahkx0 = 95;
        double lzdlurnmu4 = 82.82;
        double ptxwram3 = 94.94;
        double lktnovnfhk2 = 18.18;
        byte vmypmkl1 = 6;
        short muctrghc0 = 52;
        byte kxjlsnijrt1 = 12;
        boolean pnawxag0 = true;
        byte zumwabloak2 = 90;
        byte yvqdeedj1 = 91;
        long hjfgecsbf0 = 18L;
        float bwpakedpgj0 = 35.35f;
        long uqoeahb1 = 66L;
        float mceefhcgi0 = 35.35f;
        byte rmmtzkxp4 = 31;
        byte yxexeuae3 = 99;
        int sdbqiis2 = 83;
        short ndprjwg1 = 78;
        double vkfyomqe0 = 97.97;
        short vknekkksww4 = 41;
        long aoooqidn3 = 29L;
        char xbxbgpyr2 = 0;
        short fvxywxaaau1 = 50;
        short uxeadpk0 = 6;
        char tfiltoni4 = 19;
        long aaiekwl3 = 13L;
        long bdooams2 = 63L;
        char mkwemvj1 = 33;
        long qjlmqfkkxj0 = 88L;
        gipjzqxx(qjlmqfkkxj0, mkwemvj1, bdooams2, aaiekwl3, tfiltoni4);
        gipjzqxx(qjlmqfkkxj0, mkwemvj1, bdooams2, aaiekwl3, tfiltoni4);
        HDyXxSrV(mceefhcgi0, uqoeahb1);
        XqtQBGNR(muctrghc0, vmypmkl1, lktnovnfhk2, ptxwram3, lzdlurnmu4);
        dRmMKygm(axanzuahkx0, huvtlcnfy1, jcrsxkrcz2, nwkqcfwkf3, xbbkgojjul4);
        XqtQBGNR(muctrghc0, vmypmkl1, lktnovnfhk2, ptxwram3, lzdlurnmu4);
        if (intent != null) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        vuNtYscf(hjfgecsbf0, yvqdeedj1, zumwabloak2);
        HDyXxSrV(mceefhcgi0, uqoeahb1);
        HDyXxSrV(mceefhcgi0, uqoeahb1);
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        vTVNxEKk(vkfyomqe0, ndprjwg1, sdbqiis2, yxexeuae3, rmmtzkxp4);
        KgrgNyzR(tlanqmmt0);
        KgrgNyzR(tlanqmmt0);
        HDyXxSrV(mceefhcgi0, uqoeahb1);
        XqtQBGNR(muctrghc0, vmypmkl1, lktnovnfhk2, ptxwram3, lzdlurnmu4);
        XqtQBGNR(muctrghc0, vmypmkl1, lktnovnfhk2, ptxwram3, lzdlurnmu4);
        vuNtYscf(hjfgecsbf0, yvqdeedj1, zumwabloak2);
        KgrgNyzR(tlanqmmt0);
        dRmMKygm(axanzuahkx0, huvtlcnfy1, jcrsxkrcz2, nwkqcfwkf3, xbbkgojjul4);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void gRbetNfT(int zwaqhdxy0, long zjlpkkprm1, boolean tktpsnxije2) {
        boolean tktpsnxije2a = tktpsnxije2;
        long zjlpkkprm1a = zjlpkkprm1;
        int zwaqhdxy0a = zwaqhdxy0;
        new StringBuilder("gRbetNfT" + zjlpkkprm1a + tktpsnxije2a + zwaqhdxy0a + "gRbetNfT" + UNAajVZ + vDBLPkG + PWVOGYV + sfZANgH + yXTNrSe + EfRlqcj + cRFzqNH + LrBKERq + rnDYhNz + nURMYzq + KwUWZCI + WTSmtPB + sFymQMI + gZVqzBA + mhvmhLi + JyhAYjn + wWvSqAx + "");
    }

    //垃圾方法
    private void nyvMadTs(short swshmwex0, float sfvdxsse1, double nuskznuw2, float iaypswd3, long pyowqireua4) {
        long pyowqireua4a = pyowqireua4;
        float iaypswd3a = iaypswd3;
        double nuskznuw2a = nuskznuw2;
        float sfvdxsse1a = sfvdxsse1;
        short swshmwex0a = swshmwex0;
    }

    //垃圾方法
    private void SWeHDLyD(boolean kxibswkf0, byte ovbwqdppx1, char cdqgpqanv2, int vxeskbdind3, int igvlsgcbo4) {
        int igvlsgcbo4a = igvlsgcbo4;
        int vxeskbdind3a = vxeskbdind3;
        char cdqgpqanv2a = cdqgpqanv2;
        byte ovbwqdppx1a = ovbwqdppx1;
        boolean kxibswkf0a = kxibswkf0;
        new WeakReference("SWeHDLyD" + igvlsgcbo4a + vxeskbdind3a + cdqgpqanv2a + ovbwqdppx1a + kxibswkf0a + "SWeHDLyD" + sfZANgH + LrBKERq + PWVOGYV + UNAajVZ + cRFzqNH + yXTNrSe + wWvSqAx + nURMYzq + gZVqzBA + JyhAYjn + KwUWZCI + EfRlqcj + mhvmhLi + sFymQMI + vDBLPkG + rnDYhNz + WTSmtPB + "");
    }

    //垃圾方法
    private void xVmSsmkO(char xprmceuswx0, boolean sgtlowluey1, int ohbyloxup2, float rkvkrekpix3) {
        float rkvkrekpix3a = rkvkrekpix3;
        int ohbyloxup2a = ohbyloxup2;
        boolean sgtlowluey1a = sgtlowluey1;
        char xprmceuswx0a = xprmceuswx0;
        new String("xVmSsmkO" + rkvkrekpix3a + xprmceuswx0a + sgtlowluey1a + ohbyloxup2a + "xVmSsmkO" + KwUWZCI + PWVOGYV + WTSmtPB + cRFzqNH + wWvSqAx + JyhAYjn + vDBLPkG + mhvmhLi + UNAajVZ + LrBKERq + EfRlqcj + sFymQMI + yXTNrSe + rnDYhNz + nURMYzq + sfZANgH + gZVqzBA + "");
    }

    //垃圾方法
    private void KcYEzfSj(float wpupexncb0, float hjtcvgz1, long yygkropgg2, double jibfuger3, int kflcygvlqv4) {
        int kflcygvlqv4a = kflcygvlqv4;
        double jibfuger3a = jibfuger3;
        long yygkropgg2a = yygkropgg2;
        float hjtcvgz1a = hjtcvgz1;
        float wpupexncb0a = wpupexncb0;
        System.out.println("KcYEzfSj" + jibfuger3a + kflcygvlqv4a + wpupexncb0a + hjtcvgz1a + yygkropgg2a + "KcYEzfSj" + yXTNrSe + UNAajVZ + WTSmtPB + gZVqzBA + mhvmhLi + JyhAYjn + sfZANgH + PWVOGYV + nURMYzq + wWvSqAx + cRFzqNH + vDBLPkG + KwUWZCI + LrBKERq + EfRlqcj + rnDYhNz + sFymQMI + "");
    }

    //垃圾方法
    private void CcRTkRIh(float bvwcxxh0, short pnjorflmg1, boolean yertuud2, boolean zygemlar3) {
        boolean zygemlar3a = zygemlar3;
        boolean yertuud2a = yertuud2;
        short pnjorflmg1a = pnjorflmg1;
        float bvwcxxh0a = bvwcxxh0;
        new StringBuffer("CcRTkRIh" + yertuud2a + zygemlar3a + pnjorflmg1a + bvwcxxh0a + "CcRTkRIh" + vDBLPkG + nURMYzq + rnDYhNz + cRFzqNH + PWVOGYV + yXTNrSe + gZVqzBA + UNAajVZ + wWvSqAx + LrBKERq + KwUWZCI + JyhAYjn + sfZANgH + WTSmtPB + EfRlqcj + sFymQMI + mhvmhLi + "");
    }

    //垃圾方法
    private void lwyohwBP(long sxoiets0, long tcngwul1, boolean txccwmnrse2, float zagnkcdiq3, byte cdurxcyqk4) {
        byte cdurxcyqk4a = cdurxcyqk4;
        float zagnkcdiq3a = zagnkcdiq3;
        boolean txccwmnrse2a = txccwmnrse2;
        long tcngwul1a = tcngwul1;
        long sxoiets0a = sxoiets0;
    }

    //垃圾方法
    private void WaOfjYiF(boolean mzuswliem0) {
        boolean mzuswliem0a = mzuswliem0;
        new StringBuilder("WaOfjYiF" + mzuswliem0a + "WaOfjYiF" + yXTNrSe + UNAajVZ + WTSmtPB + KwUWZCI + rnDYhNz + mhvmhLi + vDBLPkG + EfRlqcj + cRFzqNH + JyhAYjn + gZVqzBA + sFymQMI + PWVOGYV + sfZANgH + nURMYzq + wWvSqAx + LrBKERq + "");
    }

    public boolean onUnbind(Intent intent) {
        boolean mzuswliem0 = false;
        byte cdurxcyqk4 = 60;
        float zagnkcdiq3 = 47.47f;
        boolean txccwmnrse2 = false;
        long tcngwul1 = 72L;
        long sxoiets0 = 79L;
        boolean zygemlar3 = true;
        boolean yertuud2 = true;
        short pnjorflmg1 = 36;
        float bvwcxxh0 = 52.52f;
        int kflcygvlqv4 = 6;
        double jibfuger3 = 32.32;
        long yygkropgg2 = 49L;
        float hjtcvgz1 = 27.27f;
        float wpupexncb0 = 72.72f;
        float rkvkrekpix3 = 37.37f;
        int ohbyloxup2 = 83;
        boolean sgtlowluey1 = true;
        char xprmceuswx0 = 53;
        int igvlsgcbo4 = 21;
        int vxeskbdind3 = 67;
        char cdqgpqanv2 = 15;
        byte ovbwqdppx1 = 99;
        boolean kxibswkf0 = true;
        long pyowqireua4 = 18L;
        float iaypswd3 = 89.89f;
        double nuskznuw2 = 62.62;
        float sfvdxsse1 = 85.85f;
        short swshmwex0 = 66;
        boolean tktpsnxije2 = false;
        long zjlpkkprm1 = 30L;
        int zwaqhdxy0 = 57;
        lwyohwBP(sxoiets0, tcngwul1, txccwmnrse2, zagnkcdiq3, cdurxcyqk4);
        nyvMadTs(swshmwex0, sfvdxsse1, nuskznuw2, iaypswd3, pyowqireua4);
        WaOfjYiF(mzuswliem0);
        KcYEzfSj(wpupexncb0, hjtcvgz1, yygkropgg2, jibfuger3, kflcygvlqv4);
        KcYEzfSj(wpupexncb0, hjtcvgz1, yygkropgg2, jibfuger3, kflcygvlqv4);
        SWeHDLyD(kxibswkf0, ovbwqdppx1, cdqgpqanv2, vxeskbdind3, igvlsgcbo4);
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        xVmSsmkO(xprmceuswx0, sgtlowluey1, ohbyloxup2, rkvkrekpix3);
        CcRTkRIh(bvwcxxh0, pnjorflmg1, yertuud2, zygemlar3);
        nyvMadTs(swshmwex0, sfvdxsse1, nuskznuw2, iaypswd3, pyowqireua4);
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void wkVuICMP(float cbzzqvt0, boolean luvvcie1, double pyylzwnr2, long potwgns3, double xfefacfzk4) {
        double xfefacfzk4a = xfefacfzk4;
        long potwgns3a = potwgns3;
        double pyylzwnr2a = pyylzwnr2;
        boolean luvvcie1a = luvvcie1;
        float cbzzqvt0a = cbzzqvt0;
        new StringBuilder("wkVuICMP" + potwgns3a + pyylzwnr2a + cbzzqvt0a + luvvcie1a + xfefacfzk4a + "wkVuICMP" + sFymQMI + wWvSqAx + WTSmtPB + vDBLPkG + gZVqzBA + PWVOGYV + JyhAYjn + LrBKERq + mhvmhLi + nURMYzq + UNAajVZ + EfRlqcj + rnDYhNz + KwUWZCI + yXTNrSe + sfZANgH + cRFzqNH + "");
    }

    //垃圾方法
    private void JDqEcjGt(boolean oyglbzqscj0, boolean qfnirbs1, int tatvbixea2) {
        int tatvbixea2a = tatvbixea2;
        boolean qfnirbs1a = qfnirbs1;
        boolean oyglbzqscj0a = oyglbzqscj0;
        new StringBuffer("JDqEcjGt" + qfnirbs1a + oyglbzqscj0a + tatvbixea2a + "JDqEcjGt" + nURMYzq + sFymQMI + PWVOGYV + LrBKERq + UNAajVZ + cRFzqNH + WTSmtPB + yXTNrSe + EfRlqcj + mhvmhLi + gZVqzBA + JyhAYjn + rnDYhNz + KwUWZCI + wWvSqAx + vDBLPkG + sfZANgH + "");
    }

    //垃圾方法
    private void swnKbPyQ(float ufwwigzuql0, long qpkcrslwb1) {
        long qpkcrslwb1a = qpkcrslwb1;
        float ufwwigzuql0a = ufwwigzuql0;
        new Intent("swnKbPyQ" + ufwwigzuql0a + qpkcrslwb1a + "swnKbPyQ" + gZVqzBA + wWvSqAx + WTSmtPB + UNAajVZ + sfZANgH + vDBLPkG + JyhAYjn + rnDYhNz + EfRlqcj + KwUWZCI + yXTNrSe + mhvmhLi + LrBKERq + sFymQMI + nURMYzq + PWVOGYV + cRFzqNH + "");
    }

    //垃圾方法
    private void RGDpvuMG(boolean wlswpdrvq0, long vzjmudqkc1, float xnhumfyy2, int tndxjcau3, char bazbsoc4) {
        char bazbsoc4a = bazbsoc4;
        int tndxjcau3a = tndxjcau3;
        float xnhumfyy2a = xnhumfyy2;
        long vzjmudqkc1a = vzjmudqkc1;
        boolean wlswpdrvq0a = wlswpdrvq0;
        TextUtils.isEmpty("RGDpvuMG" + tndxjcau3a + bazbsoc4a + wlswpdrvq0a + xnhumfyy2a + vzjmudqkc1a + "RGDpvuMG" + gZVqzBA + EfRlqcj + KwUWZCI + wWvSqAx + cRFzqNH + mhvmhLi + JyhAYjn + nURMYzq + LrBKERq + PWVOGYV + yXTNrSe + UNAajVZ + vDBLPkG + sfZANgH + WTSmtPB + sFymQMI + rnDYhNz + "");
    }

    //垃圾方法
    private void rqqxyNCp(char lickggurd0) {
        char lickggurd0a = lickggurd0;
        System.out.println("rqqxyNCp" + lickggurd0a + "rqqxyNCp" + LrBKERq + wWvSqAx + nURMYzq + cRFzqNH + sfZANgH + yXTNrSe + sFymQMI + rnDYhNz + JyhAYjn + vDBLPkG + PWVOGYV + KwUWZCI + EfRlqcj + mhvmhLi + gZVqzBA + UNAajVZ + WTSmtPB + "");
    }

    //垃圾方法
    private void cFlmWsRg(int iazrzqyay0, byte ijrofmw1, boolean tovcpjuhyn2, byte aradbzgjef3) {
        byte aradbzgjef3a = aradbzgjef3;
        boolean tovcpjuhyn2a = tovcpjuhyn2;
        byte ijrofmw1a = ijrofmw1;
        int iazrzqyay0a = iazrzqyay0;
        new StringBuffer("cFlmWsRg" + ijrofmw1a + aradbzgjef3a + iazrzqyay0a + tovcpjuhyn2a + "cFlmWsRg" + JyhAYjn + vDBLPkG + yXTNrSe + mhvmhLi + cRFzqNH + wWvSqAx + gZVqzBA + KwUWZCI + sfZANgH + PWVOGYV + WTSmtPB + rnDYhNz + LrBKERq + EfRlqcj + sFymQMI + nURMYzq + UNAajVZ + "");
    }

    //垃圾方法
    private void PscDHmyl(short omnpfegnw0, char mjwhiizrtp1) {
        char mjwhiizrtp1a = mjwhiizrtp1;
        short omnpfegnw0a = omnpfegnw0;
        TextUtils.isDigitsOnly("PscDHmyl" + omnpfegnw0a + mjwhiizrtp1a + "PscDHmyl" + gZVqzBA + sFymQMI + sfZANgH + nURMYzq + mhvmhLi + JyhAYjn + yXTNrSe + EfRlqcj + WTSmtPB + PWVOGYV + vDBLPkG + cRFzqNH + rnDYhNz + KwUWZCI + wWvSqAx + LrBKERq + UNAajVZ + "");
    }

    //垃圾方法
    private void PLaftuVk(long lnwjrjmnyd0, int akgsiky1, int fqbzovm2, char qwpwhnbij3, boolean awuqzexm4) {
        boolean awuqzexm4a = awuqzexm4;
        char qwpwhnbij3a = qwpwhnbij3;
        int fqbzovm2a = fqbzovm2;
        int akgsiky1a = akgsiky1;
        long lnwjrjmnyd0a = lnwjrjmnyd0;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        boolean awuqzexm4 = true;
        char qwpwhnbij3 = 79;
        int fqbzovm2 = 55;
        int akgsiky1 = 71;
        long lnwjrjmnyd0 = 56L;
        char mjwhiizrtp1 = 9;
        short omnpfegnw0 = 95;
        byte aradbzgjef3 = 100;
        boolean tovcpjuhyn2 = false;
        byte ijrofmw1 = 69;
        int iazrzqyay0 = 95;
        char lickggurd0 = 72;
        char bazbsoc4 = 44;
        int tndxjcau3 = 10;
        float xnhumfyy2 = 22.22f;
        long vzjmudqkc1 = 86L;
        boolean wlswpdrvq0 = false;
        long qpkcrslwb1 = 88L;
        float ufwwigzuql0 = 46.46f;
        int tatvbixea2 = 2;
        boolean qfnirbs1 = false;
        boolean oyglbzqscj0 = false;
        double xfefacfzk4 = 55.55;
        long potwgns3 = 57L;
        double pyylzwnr2 = 37.37;
        boolean luvvcie1 = false;
        float cbzzqvt0 = 27.27f;
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        return this.mServiceBinder;
    }

    //垃圾方法
    private void ArzFgIOc(char yedlqefcr0, boolean wpxtfngxj1, float sqbvnrganm2, byte ywegrth3) {
        byte ywegrth3a = ywegrth3;
        float sqbvnrganm2a = sqbvnrganm2;
        boolean wpxtfngxj1a = wpxtfngxj1;
        char yedlqefcr0a = yedlqefcr0;
        Log.w("ArzFgIOc", "ArzFgIOc" + ywegrth3a + yedlqefcr0a + sqbvnrganm2a + wpxtfngxj1a + "ArzFgIOc" + WTSmtPB + mhvmhLi + PWVOGYV + nURMYzq + sfZANgH + wWvSqAx + gZVqzBA + KwUWZCI + UNAajVZ + cRFzqNH + sFymQMI + yXTNrSe + EfRlqcj + vDBLPkG + JyhAYjn + LrBKERq + rnDYhNz + "");
    }

    //垃圾方法
    private void qOPWxxdg(int axcjpeqab0, float treldpjmg1, boolean gsdfxst2, long kgqyznbpal3) {
        long kgqyznbpal3a = kgqyznbpal3;
        boolean gsdfxst2a = gsdfxst2;
        float treldpjmg1a = treldpjmg1;
        int axcjpeqab0a = axcjpeqab0;
        TextUtils.isEmpty("qOPWxxdg" + kgqyznbpal3a + treldpjmg1a + axcjpeqab0a + gsdfxst2a + "qOPWxxdg" + UNAajVZ + LrBKERq + rnDYhNz + JyhAYjn + PWVOGYV + yXTNrSe + KwUWZCI + mhvmhLi + sFymQMI + sfZANgH + EfRlqcj + wWvSqAx + WTSmtPB + nURMYzq + cRFzqNH + gZVqzBA + vDBLPkG + "");
    }

    //垃圾方法
    private void aJOfQuEE(byte wfdiwpcqka0, short lherusdr1, int vjoslucjy2, long vlcnpwkff3, double pkhqzbfd4) {
        double pkhqzbfd4a = pkhqzbfd4;
        long vlcnpwkff3a = vlcnpwkff3;
        int vjoslucjy2a = vjoslucjy2;
        short lherusdr1a = lherusdr1;
        byte wfdiwpcqka0a = wfdiwpcqka0;
        new StringBuffer("aJOfQuEE" + vlcnpwkff3a + vjoslucjy2a + wfdiwpcqka0a + lherusdr1a + pkhqzbfd4a + "aJOfQuEE" + EfRlqcj + yXTNrSe + wWvSqAx + JyhAYjn + PWVOGYV + UNAajVZ + rnDYhNz + gZVqzBA + KwUWZCI + mhvmhLi + cRFzqNH + sfZANgH + LrBKERq + vDBLPkG + sFymQMI + WTSmtPB + nURMYzq + "");
    }

    //垃圾方法
    private void SlkiNBZe(int xrpcxyycm0, boolean krzytetao1, boolean qvakyzk2) {
        boolean qvakyzk2a = qvakyzk2;
        boolean krzytetao1a = krzytetao1;
        int xrpcxyycm0a = xrpcxyycm0;
        new StringReader("SlkiNBZe" + krzytetao1a + qvakyzk2a + xrpcxyycm0a + "SlkiNBZe" + rnDYhNz + wWvSqAx + EfRlqcj + sfZANgH + PWVOGYV + LrBKERq + mhvmhLi + nURMYzq + cRFzqNH + yXTNrSe + gZVqzBA + sFymQMI + UNAajVZ + vDBLPkG + WTSmtPB + KwUWZCI + JyhAYjn + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        boolean qvakyzk2 = true;
        boolean krzytetao1 = false;
        int xrpcxyycm0 = 50;
        double pkhqzbfd4 = 49.49;
        long vlcnpwkff3 = 23L;
        int vjoslucjy2 = 39;
        short lherusdr1 = 67;
        byte wfdiwpcqka0 = 87;
        long kgqyznbpal3 = 49L;
        boolean gsdfxst2 = false;
        float treldpjmg1 = 42.42f;
        int axcjpeqab0 = 54;
        byte ywegrth3 = 98;
        float sqbvnrganm2 = 70.70f;
        boolean wpxtfngxj1 = false;
        char yedlqefcr0 = 57;
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            ArzFgIOc(yedlqefcr0, wpxtfngxj1, sqbvnrganm2, ywegrth3);
            qOPWxxdg(axcjpeqab0, treldpjmg1, gsdfxst2, kgqyznbpal3);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            if (SpeedManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            this.doStartMainService();
            this.doBindMainService();
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            SlkiNBZe(xrpcxyycm0, krzytetao1, qvakyzk2);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            SlkiNBZe(xrpcxyycm0, krzytetao1, qvakyzk2);
            qOPWxxdg(axcjpeqab0, treldpjmg1, gsdfxst2, kgqyznbpal3);
            ArzFgIOc(yedlqefcr0, wpxtfngxj1, sqbvnrganm2, ywegrth3);
            this.nextNum = retryNum - 1;
            qOPWxxdg(axcjpeqab0, treldpjmg1, gsdfxst2, kgqyznbpal3);
            qOPWxxdg(axcjpeqab0, treldpjmg1, gsdfxst2, kgqyznbpal3);
            ArzFgIOc(yedlqefcr0, wpxtfngxj1, sqbvnrganm2, ywegrth3);
            SlkiNBZe(xrpcxyycm0, krzytetao1, qvakyzk2);
            qOPWxxdg(axcjpeqab0, treldpjmg1, gsdfxst2, kgqyznbpal3);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            aJOfQuEE(wfdiwpcqka0, lherusdr1, vjoslucjy2, vlcnpwkff3, pkhqzbfd4);
            if (this.nextNum > 0) {
                if (SpeedManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void hINMyEBA(long vdlddcix0, byte bzmwxbrvhz1, short wigbfur2, double ttymtdldlj3) {
        double ttymtdldlj3a = ttymtdldlj3;
        short wigbfur2a = wigbfur2;
        byte bzmwxbrvhz1a = bzmwxbrvhz1;
        long vdlddcix0a = vdlddcix0;
        System.out.println("hINMyEBA" + wigbfur2a + bzmwxbrvhz1a + ttymtdldlj3a + vdlddcix0a + "hINMyEBA" + yXTNrSe + mhvmhLi + sFymQMI + KwUWZCI + sfZANgH + EfRlqcj + JyhAYjn + gZVqzBA + PWVOGYV + wWvSqAx + rnDYhNz + UNAajVZ + cRFzqNH + nURMYzq + vDBLPkG + LrBKERq + WTSmtPB + "");
    }

    //垃圾方法
    private void JNNiOCOA(short rjbopdeqp0) {
        short rjbopdeqp0a = rjbopdeqp0;
        new StringBuffer("JNNiOCOA" + rjbopdeqp0a + "JNNiOCOA" + rnDYhNz + EfRlqcj + WTSmtPB + cRFzqNH + nURMYzq + gZVqzBA + wWvSqAx + KwUWZCI + yXTNrSe + JyhAYjn + sfZANgH + LrBKERq + sFymQMI + PWVOGYV + UNAajVZ + vDBLPkG + mhvmhLi + "");
    }

    //垃圾方法
    private void wSXsPpSA(float abvzdkyl0, float rypldkxld1, double hfpgovsm2, int xzkveknz3) {
        int xzkveknz3a = xzkveknz3;
        double hfpgovsm2a = hfpgovsm2;
        float rypldkxld1a = rypldkxld1;
        float abvzdkyl0a = abvzdkyl0;
        new WeakReference("wSXsPpSA" + hfpgovsm2a + rypldkxld1a + xzkveknz3a + abvzdkyl0a + "wSXsPpSA" + rnDYhNz + cRFzqNH + sfZANgH + gZVqzBA + WTSmtPB + JyhAYjn + yXTNrSe + PWVOGYV + mhvmhLi + LrBKERq + UNAajVZ + KwUWZCI + sFymQMI + nURMYzq + vDBLPkG + EfRlqcj + wWvSqAx + "");
    }

    //垃圾方法
    private void lnpWFglw(double bhjoklfbl0, boolean erslokq1, byte xttohggtss2, int jjhtzwdb3, char dlnbbcm4) {
        char dlnbbcm4a = dlnbbcm4;
        int jjhtzwdb3a = jjhtzwdb3;
        byte xttohggtss2a = xttohggtss2;
        boolean erslokq1a = erslokq1;
        double bhjoklfbl0a = bhjoklfbl0;
    }

    private void doStartMainService() {
        char dlnbbcm4 = 1;
        int jjhtzwdb3 = 77;
        byte xttohggtss2 = 54;
        boolean erslokq1 = true;
        double bhjoklfbl0 = 7.7;
        int xzkveknz3 = 57;
        double hfpgovsm2 = 74.74;
        float rypldkxld1 = 55.55f;
        float abvzdkyl0 = 51.51f;
        short rjbopdeqp0 = 63;
        double ttymtdldlj3 = 72.72;
        short wigbfur2 = 53;
        byte bzmwxbrvhz1 = 15;
        long vdlddcix0 = 1L;
        lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
        wSXsPpSA(abvzdkyl0, rypldkxld1, hfpgovsm2, xzkveknz3);
        lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
        try {
            lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
            lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
            wSXsPpSA(abvzdkyl0, rypldkxld1, hfpgovsm2, xzkveknz3);
            wSXsPpSA(abvzdkyl0, rypldkxld1, hfpgovsm2, xzkveknz3);
            wSXsPpSA(abvzdkyl0, rypldkxld1, hfpgovsm2, xzkveknz3);
            lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
            lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
            Intent intent = new Intent(this, Speed1Service.class);
            intent.putExtra("isStartService", true);
            JNNiOCOA(rjbopdeqp0);
            JNNiOCOA(rjbopdeqp0);
            JNNiOCOA(rjbopdeqp0);
            JNNiOCOA(rjbopdeqp0);
            JNNiOCOA(rjbopdeqp0);
            wSXsPpSA(abvzdkyl0, rypldkxld1, hfpgovsm2, xzkveknz3);
            lnpWFglw(bhjoklfbl0, erslokq1, xttohggtss2, jjhtzwdb3, dlnbbcm4);
            JNNiOCOA(rjbopdeqp0);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (SpeedManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾变量
    private byte cRFzqNH = 5;

    // 绑定状态标志
    private boolean mIsBound = false;

    //垃圾方法
    private void SRnqaIBZ(char cntvkez0) {
        char cntvkez0a = cntvkez0;
        TextUtils.isEmpty("SRnqaIBZ" + cntvkez0a + "SRnqaIBZ" + PWVOGYV + WTSmtPB + sFymQMI + cRFzqNH + LrBKERq + rnDYhNz + nURMYzq + mhvmhLi + yXTNrSe + UNAajVZ + JyhAYjn + vDBLPkG + KwUWZCI + EfRlqcj + gZVqzBA + wWvSqAx + sfZANgH + "");
    }

    //垃圾方法
    private void DklnLsoG(short zpukclur0, byte wxoyplfl1, float glkelshvto2, char rwgwqapo3) {
        char rwgwqapo3a = rwgwqapo3;
        float glkelshvto2a = glkelshvto2;
        byte wxoyplfl1a = wxoyplfl1;
        short zpukclur0a = zpukclur0;
    }

    //垃圾方法
    private void WZtUCOUP(int vvzwrwzsvu0) {
        int vvzwrwzsvu0a = vvzwrwzsvu0;
        Log.e("WZtUCOUP", "WZtUCOUP" + vvzwrwzsvu0a + "WZtUCOUP" + sfZANgH + UNAajVZ + KwUWZCI + cRFzqNH + sFymQMI + EfRlqcj + wWvSqAx + JyhAYjn + LrBKERq + rnDYhNz + nURMYzq + WTSmtPB + yXTNrSe + vDBLPkG + mhvmhLi + gZVqzBA + PWVOGYV + "");
    }

    //垃圾方法
    private void mBwykNKj(byte kegetifqp0, float hgfwfhqvc1, int hrwpphx2, double bolokqy3) {
        double bolokqy3a = bolokqy3;
        int hrwpphx2a = hrwpphx2;
        float hgfwfhqvc1a = hgfwfhqvc1;
        byte kegetifqp0a = kegetifqp0;
        TextUtils.isEmpty("mBwykNKj" + bolokqy3a + kegetifqp0a + hgfwfhqvc1a + hrwpphx2a + "mBwykNKj" + UNAajVZ + sFymQMI + rnDYhNz + yXTNrSe + WTSmtPB + PWVOGYV + mhvmhLi + gZVqzBA + KwUWZCI + nURMYzq + JyhAYjn + LrBKERq + cRFzqNH + vDBLPkG + EfRlqcj + sfZANgH + wWvSqAx + "");
    }

    //垃圾方法
    private void ITceuYiw(byte zjruwvtmp0, short tcfixxla1, int uirnuphvv2) {
        int uirnuphvv2a = uirnuphvv2;
        short tcfixxla1a = tcfixxla1;
        byte zjruwvtmp0a = zjruwvtmp0;
        Log.w("ITceuYiw", "ITceuYiw" + uirnuphvv2a + zjruwvtmp0a + tcfixxla1a + "ITceuYiw" + cRFzqNH + vDBLPkG + nURMYzq + JyhAYjn + KwUWZCI + sFymQMI + sfZANgH + UNAajVZ + gZVqzBA + yXTNrSe + wWvSqAx + LrBKERq + mhvmhLi + PWVOGYV + rnDYhNz + WTSmtPB + EfRlqcj + "");
    }

    //垃圾方法
    private void KBHXvpQK(short yyusuxdlz0, char cukemda1, float cyzuvcz2, long zbgunvudg3) {
        long zbgunvudg3a = zbgunvudg3;
        float cyzuvcz2a = cyzuvcz2;
        char cukemda1a = cukemda1;
        short yyusuxdlz0a = yyusuxdlz0;
        new StringReader("KBHXvpQK" + zbgunvudg3a + cyzuvcz2a + yyusuxdlz0a + cukemda1a + "KBHXvpQK" + UNAajVZ + EfRlqcj + JyhAYjn + yXTNrSe + sfZANgH + WTSmtPB + gZVqzBA + nURMYzq + cRFzqNH + wWvSqAx + PWVOGYV + rnDYhNz + vDBLPkG + LrBKERq + mhvmhLi + sFymQMI + KwUWZCI + "");
    }

    //垃圾方法
    private void dMGddzGT(double okyiftu0, byte mfnpilc1, float fnsaztfo2, short imvjkswli3, float yxpeyyghlf4) {
        float yxpeyyghlf4a = yxpeyyghlf4;
        short imvjkswli3a = imvjkswli3;
        float fnsaztfo2a = fnsaztfo2;
        byte mfnpilc1a = mfnpilc1;
        double okyiftu0a = okyiftu0;
        new String("dMGddzGT" + yxpeyyghlf4a + fnsaztfo2a + mfnpilc1a + imvjkswli3a + okyiftu0a + "dMGddzGT" + vDBLPkG + EfRlqcj + UNAajVZ + cRFzqNH + yXTNrSe + wWvSqAx + LrBKERq + PWVOGYV + sfZANgH + gZVqzBA + rnDYhNz + JyhAYjn + KwUWZCI + sFymQMI + nURMYzq + mhvmhLi + WTSmtPB + "");
    }

    //垃圾方法
    private void VgjBHQks(double nczvmuw0, long ingdboz1) {
        long ingdboz1a = ingdboz1;
        double nczvmuw0a = nczvmuw0;
        new String("VgjBHQks" + nczvmuw0a + ingdboz1a + "VgjBHQks" + nURMYzq + JyhAYjn + mhvmhLi + UNAajVZ + wWvSqAx + KwUWZCI + WTSmtPB + sfZANgH + LrBKERq + rnDYhNz + sFymQMI + vDBLPkG + EfRlqcj + cRFzqNH + PWVOGYV + gZVqzBA + yXTNrSe + "");
    }

    private void doBindMainService() {
        long ingdboz1 = 6L;
        double nczvmuw0 = 94.94;
        float yxpeyyghlf4 = 100.100f;
        short imvjkswli3 = 2;
        float fnsaztfo2 = 68.68f;
        byte mfnpilc1 = 91;
        double okyiftu0 = 17.17;
        long zbgunvudg3 = 18L;
        float cyzuvcz2 = 54.54f;
        char cukemda1 = 26;
        short yyusuxdlz0 = 56;
        int uirnuphvv2 = 59;
        short tcfixxla1 = 76;
        byte zjruwvtmp0 = 25;
        double bolokqy3 = 67.67;
        int hrwpphx2 = 51;
        float hgfwfhqvc1 = 14.14f;
        byte kegetifqp0 = 48;
        int vvzwrwzsvu0 = 18;
        char rwgwqapo3 = 13;
        float glkelshvto2 = 79.79f;
        byte wxoyplfl1 = 98;
        short zpukclur0 = 7;
        char cntvkez0 = 34;
        if (SpeedManager.isDebug) {
            ITceuYiw(zjruwvtmp0, tcfixxla1, uirnuphvv2);
            mBwykNKj(kegetifqp0, hgfwfhqvc1, hrwpphx2, bolokqy3);
            mBwykNKj(kegetifqp0, hgfwfhqvc1, hrwpphx2, bolokqy3);
            WZtUCOUP(vvzwrwzsvu0);
            DklnLsoG(zpukclur0, wxoyplfl1, glkelshvto2, rwgwqapo3);
            KBHXvpQK(yyusuxdlz0, cukemda1, cyzuvcz2, zbgunvudg3);
            KBHXvpQK(yyusuxdlz0, cukemda1, cyzuvcz2, zbgunvudg3);
            SRnqaIBZ(cntvkez0);
            mBwykNKj(kegetifqp0, hgfwfhqvc1, hrwpphx2, bolokqy3);
            VgjBHQks(nczvmuw0, ingdboz1);
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        try {
            KBHXvpQK(yyusuxdlz0, cukemda1, cyzuvcz2, zbgunvudg3);
            WZtUCOUP(vvzwrwzsvu0);
            dMGddzGT(okyiftu0, mfnpilc1, fnsaztfo2, imvjkswli3, yxpeyyghlf4);
            KBHXvpQK(yyusuxdlz0, cukemda1, cyzuvcz2, zbgunvudg3);
            VgjBHQks(nczvmuw0, ingdboz1);
            mBwykNKj(kegetifqp0, hgfwfhqvc1, hrwpphx2, bolokqy3);
            VgjBHQks(nczvmuw0, ingdboz1);
            SRnqaIBZ(cntvkez0);
            mIsBound = this.bindService(new Intent(this, Speed1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (SpeedManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void BnaJQcVS(long oyizsfrsj0, double ijyvebcui1, byte vjpfqjpd2) {
        byte vjpfqjpd2a = vjpfqjpd2;
        double ijyvebcui1a = ijyvebcui1;
        long oyizsfrsj0a = oyizsfrsj0;
        new Thread("BnaJQcVS" + vjpfqjpd2a + ijyvebcui1a + oyizsfrsj0a + "BnaJQcVS" + cRFzqNH + nURMYzq + yXTNrSe + vDBLPkG + UNAajVZ + gZVqzBA + mhvmhLi + rnDYhNz + EfRlqcj + KwUWZCI + LrBKERq + WTSmtPB + wWvSqAx + JyhAYjn + sFymQMI + PWVOGYV + sfZANgH + "");
    }

    //垃圾方法
    private void FsNFmmBM(boolean qwsgnswg0, byte yiwqimirxp1) {
        byte yiwqimirxp1a = yiwqimirxp1;
        boolean qwsgnswg0a = qwsgnswg0;
        new Intent("FsNFmmBM" + yiwqimirxp1a + qwsgnswg0a + "FsNFmmBM" + UNAajVZ + gZVqzBA + cRFzqNH + rnDYhNz + JyhAYjn + yXTNrSe + PWVOGYV + sFymQMI + nURMYzq + EfRlqcj + mhvmhLi + wWvSqAx + LrBKERq + KwUWZCI + sfZANgH + WTSmtPB + vDBLPkG + "");
    }

    //垃圾方法
    private void lZqPgNKA(int ejbkmwpy0, float egbbdrstw1, float pzkcvqcdx2, char uldvaosayo3) {
        char uldvaosayo3a = uldvaosayo3;
        float pzkcvqcdx2a = pzkcvqcdx2;
        float egbbdrstw1a = egbbdrstw1;
        int ejbkmwpy0a = ejbkmwpy0;
        new Intent("lZqPgNKA" + pzkcvqcdx2a + uldvaosayo3a + egbbdrstw1a + ejbkmwpy0a + "lZqPgNKA" + LrBKERq + cRFzqNH + UNAajVZ + sfZANgH + JyhAYjn + wWvSqAx + EfRlqcj + nURMYzq + mhvmhLi + WTSmtPB + vDBLPkG + KwUWZCI + sFymQMI + yXTNrSe + gZVqzBA + rnDYhNz + PWVOGYV + "");
    }

    //垃圾方法
    private void WEHtgdCX(int xnboriwrz0, byte inunkch1, int frturjr2, double pkcnkns3) {
        double pkcnkns3a = pkcnkns3;
        int frturjr2a = frturjr2;
        byte inunkch1a = inunkch1;
        int xnboriwrz0a = xnboriwrz0;
        new StringBuilder("WEHtgdCX" + frturjr2a + xnboriwrz0a + pkcnkns3a + inunkch1a + "WEHtgdCX" + KwUWZCI + wWvSqAx + cRFzqNH + vDBLPkG + JyhAYjn + gZVqzBA + UNAajVZ + nURMYzq + mhvmhLi + PWVOGYV + WTSmtPB + sfZANgH + yXTNrSe + sFymQMI + LrBKERq + EfRlqcj + rnDYhNz + "");
    }

    //垃圾方法
    private void akxNBgzk(char iilmltxy0, long cjyweelo1, short dvhdgbno2) {
        short dvhdgbno2a = dvhdgbno2;
        long cjyweelo1a = cjyweelo1;
        char iilmltxy0a = iilmltxy0;
        new AttributedString("akxNBgzk" + dvhdgbno2a + iilmltxy0a + cjyweelo1a + "akxNBgzk" + sFymQMI + LrBKERq + yXTNrSe + JyhAYjn + KwUWZCI + cRFzqNH + gZVqzBA + UNAajVZ + vDBLPkG + rnDYhNz + sfZANgH + nURMYzq + WTSmtPB + EfRlqcj + PWVOGYV + wWvSqAx + mhvmhLi + "");
    }

    //垃圾方法
    private void ZIiIPfpe(float lfwvebg0, byte hazeffxb1) {
        byte hazeffxb1a = hazeffxb1;
        float lfwvebg0a = lfwvebg0;
        new String("ZIiIPfpe" + lfwvebg0a + hazeffxb1a + "ZIiIPfpe" + LrBKERq + PWVOGYV + rnDYhNz + JyhAYjn + gZVqzBA + sfZANgH + wWvSqAx + vDBLPkG + sFymQMI + mhvmhLi + nURMYzq + UNAajVZ + yXTNrSe + EfRlqcj + KwUWZCI + WTSmtPB + cRFzqNH + "");
    }

    //垃圾方法
    private void RAxpZMem(int lyplcsyrgz0, int vnynjuqc1, float jacfnsigdz2) {
        float jacfnsigdz2a = jacfnsigdz2;
        int vnynjuqc1a = vnynjuqc1;
        int lyplcsyrgz0a = lyplcsyrgz0;
        new StringBuffer("RAxpZMem" + jacfnsigdz2a + vnynjuqc1a + lyplcsyrgz0a + "RAxpZMem" + KwUWZCI + wWvSqAx + JyhAYjn + nURMYzq + sfZANgH + vDBLPkG + sFymQMI + yXTNrSe + EfRlqcj + gZVqzBA + cRFzqNH + LrBKERq + PWVOGYV + WTSmtPB + mhvmhLi + UNAajVZ + rnDYhNz + "");
    }

    //垃圾方法
    private void ajvZaKxi(byte istfgco0, byte wlzycguk1) {
        byte wlzycguk1a = wlzycguk1;
        byte istfgco0a = istfgco0;
        new Thread("ajvZaKxi" + wlzycguk1a + istfgco0a + "ajvZaKxi" + LrBKERq + UNAajVZ + gZVqzBA + EfRlqcj + sfZANgH + mhvmhLi + vDBLPkG + JyhAYjn + rnDYhNz + wWvSqAx + PWVOGYV + WTSmtPB + cRFzqNH + nURMYzq + sFymQMI + yXTNrSe + KwUWZCI + "");
    }

    //垃圾方法
    private void evxOAMSK(short ilkexrsh0) {
        short ilkexrsh0a = ilkexrsh0;
        new StringReader("evxOAMSK" + ilkexrsh0a + "evxOAMSK" + rnDYhNz + wWvSqAx + LrBKERq + vDBLPkG + WTSmtPB + yXTNrSe + sFymQMI + UNAajVZ + mhvmhLi + cRFzqNH + sfZANgH + gZVqzBA + nURMYzq + EfRlqcj + JyhAYjn + KwUWZCI + PWVOGYV + "");
    }

    //垃圾方法
    private void UJZdFQMO(short suqarpr0, long brqdlgcx1, long jaefhosm2, char slgndxdw3) {
        char slgndxdw3a = slgndxdw3;
        long jaefhosm2a = jaefhosm2;
        long brqdlgcx1a = brqdlgcx1;
        short suqarpr0a = suqarpr0;
        new String("UJZdFQMO" + suqarpr0a + slgndxdw3a + brqdlgcx1a + jaefhosm2a + "UJZdFQMO" + LrBKERq + EfRlqcj + vDBLPkG + JyhAYjn + wWvSqAx + sfZANgH + WTSmtPB + yXTNrSe + PWVOGYV + KwUWZCI + UNAajVZ + gZVqzBA + mhvmhLi + sFymQMI + rnDYhNz + nURMYzq + cRFzqNH + "");
    }

    //垃圾方法
    private void xGQjxiTT(boolean czvlhbxtp0, char dzxenwlbpw1) {
        char dzxenwlbpw1a = dzxenwlbpw1;
        boolean czvlhbxtp0a = czvlhbxtp0;
        new StringReader("xGQjxiTT" + dzxenwlbpw1a + czvlhbxtp0a + "xGQjxiTT" + nURMYzq + sFymQMI + sfZANgH + LrBKERq + JyhAYjn + mhvmhLi + cRFzqNH + WTSmtPB + UNAajVZ + EfRlqcj + yXTNrSe + KwUWZCI + wWvSqAx + gZVqzBA + PWVOGYV + rnDYhNz + vDBLPkG + "");
    }

    //垃圾方法
    private void OMZPYMyU(int ezeogdzej0, long wlhcfeh1, byte wfvexohm2, boolean koqomiz3) {
        boolean koqomiz3a = koqomiz3;
        byte wfvexohm2a = wfvexohm2;
        long wlhcfeh1a = wlhcfeh1;
        int ezeogdzej0a = ezeogdzej0;
        new Thread("OMZPYMyU" + wlhcfeh1a + koqomiz3a + ezeogdzej0a + wfvexohm2a + "OMZPYMyU" + sfZANgH + rnDYhNz + KwUWZCI + yXTNrSe + sFymQMI + mhvmhLi + WTSmtPB + nURMYzq + EfRlqcj + UNAajVZ + gZVqzBA + PWVOGYV + wWvSqAx + vDBLPkG + cRFzqNH + LrBKERq + JyhAYjn + "");
    }

    //垃圾方法
    private void ibsrjmkB(int amcycofm0, short oziftbagqd1) {
        short oziftbagqd1a = oziftbagqd1;
        int amcycofm0a = amcycofm0;
        TextUtils.isEmpty("ibsrjmkB" + oziftbagqd1a + amcycofm0a + "ibsrjmkB" + mhvmhLi + vDBLPkG + JyhAYjn + wWvSqAx + EfRlqcj + yXTNrSe + rnDYhNz + gZVqzBA + UNAajVZ + KwUWZCI + PWVOGYV + sFymQMI + nURMYzq + WTSmtPB + LrBKERq + cRFzqNH + sfZANgH + "");
    }

    //垃圾方法
    private void aOKySRxp(double zervguoy0, double keeqdqum1, long cqcvyetr2) {
        long cqcvyetr2a = cqcvyetr2;
        double keeqdqum1a = keeqdqum1;
        double zervguoy0a = zervguoy0;
        TextUtils.isEmpty("aOKySRxp" + keeqdqum1a + zervguoy0a + cqcvyetr2a + "aOKySRxp" + EfRlqcj + JyhAYjn + LrBKERq + KwUWZCI + mhvmhLi + sFymQMI + gZVqzBA + rnDYhNz + vDBLPkG + yXTNrSe + UNAajVZ + nURMYzq + wWvSqAx + sfZANgH + WTSmtPB + cRFzqNH + PWVOGYV + "");
    }

    //垃圾方法
    private void PetKBUvk(float sjytlznn0) {
        float sjytlznn0a = sjytlznn0;
        Log.e("PetKBUvk", "PetKBUvk" + sjytlznn0a + "PetKBUvk" + JyhAYjn + UNAajVZ + rnDYhNz + LrBKERq + mhvmhLi + sfZANgH + KwUWZCI + vDBLPkG + sFymQMI + cRFzqNH + yXTNrSe + WTSmtPB + gZVqzBA + PWVOGYV + EfRlqcj + wWvSqAx + nURMYzq + "");
    }

    //垃圾方法
    private void zmAQvSkD(boolean ybiptql0, boolean ycaajbfqia1) {
        boolean ycaajbfqia1a = ycaajbfqia1;
        boolean ybiptql0a = ybiptql0;
        Log.i("zmAQvSkD", "zmAQvSkD" + ybiptql0a + ycaajbfqia1a + "zmAQvSkD" + gZVqzBA + KwUWZCI + cRFzqNH + vDBLPkG + wWvSqAx + WTSmtPB + UNAajVZ + JyhAYjn + LrBKERq + EfRlqcj + sfZANgH + rnDYhNz + yXTNrSe + sFymQMI + PWVOGYV + nURMYzq + mhvmhLi + "");
    }

    //垃圾方法
    private void gpdTLomk(boolean dcswnsgl0, float tjpvcple1, int aufamjsvpc2, double aepyiqevb3, double ptgwlfv4) {
        double ptgwlfv4a = ptgwlfv4;
        double aepyiqevb3a = aepyiqevb3;
        int aufamjsvpc2a = aufamjsvpc2;
        float tjpvcple1a = tjpvcple1;
        boolean dcswnsgl0a = dcswnsgl0;
        new AttributedString("gpdTLomk" + ptgwlfv4a + tjpvcple1a + aepyiqevb3a + aufamjsvpc2a + dcswnsgl0a + "gpdTLomk" + PWVOGYV + yXTNrSe + WTSmtPB + mhvmhLi + UNAajVZ + nURMYzq + LrBKERq + wWvSqAx + cRFzqNH + EfRlqcj + JyhAYjn + sFymQMI + KwUWZCI + vDBLPkG + rnDYhNz + sfZANgH + gZVqzBA + "");
    }

    //垃圾方法
    private void XWDIootv(long wchkqvz0, double zfuoyhzo1) {
        double zfuoyhzo1a = zfuoyhzo1;
        long wchkqvz0a = wchkqvz0;
        new Intent("XWDIootv" + wchkqvz0a + zfuoyhzo1a + "XWDIootv" + PWVOGYV + cRFzqNH + gZVqzBA + mhvmhLi + wWvSqAx + yXTNrSe + JyhAYjn + sfZANgH + KwUWZCI + sFymQMI + LrBKERq + WTSmtPB + vDBLPkG + nURMYzq + UNAajVZ + EfRlqcj + rnDYhNz + "");
    }

    //垃圾方法
    private void ZncvfmAT(boolean oatdlpvmfz0) {
        boolean oatdlpvmfz0a = oatdlpvmfz0;
        new StringReader("ZncvfmAT" + oatdlpvmfz0a + "ZncvfmAT" + cRFzqNH + JyhAYjn + WTSmtPB + wWvSqAx + yXTNrSe + nURMYzq + gZVqzBA + vDBLPkG + EfRlqcj + rnDYhNz + sfZANgH + mhvmhLi + LrBKERq + sFymQMI + PWVOGYV + UNAajVZ + KwUWZCI + "");
    }

    //垃圾方法
    private void MpmmBCzt(int cygnfgi0, double funnalba1, char kpnkkkayy2, byte lbusdfd3) {
        byte lbusdfd3a = lbusdfd3;
        char kpnkkkayy2a = kpnkkkayy2;
        double funnalba1a = funnalba1;
        int cygnfgi0a = cygnfgi0;
        Log.w("MpmmBCzt", "MpmmBCzt" + kpnkkkayy2a + cygnfgi0a + lbusdfd3a + funnalba1a + "MpmmBCzt" + EfRlqcj + LrBKERq + wWvSqAx + WTSmtPB + rnDYhNz + mhvmhLi + cRFzqNH + UNAajVZ + KwUWZCI + vDBLPkG + gZVqzBA + yXTNrSe + sFymQMI + nURMYzq + PWVOGYV + JyhAYjn + sfZANgH + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        byte lbusdfd3 = 35;
        char kpnkkkayy2 = 28;
        double funnalba1 = 44.44;
        int cygnfgi0 = 15;
        boolean oatdlpvmfz0 = false;
        double zfuoyhzo1 = 45.45;
        long wchkqvz0 = 66L;
        double ptgwlfv4 = 90.90;
        double aepyiqevb3 = 50.50;
        int aufamjsvpc2 = 3;
        float tjpvcple1 = 44.44f;
        boolean dcswnsgl0 = true;
        boolean ycaajbfqia1 = false;
        boolean ybiptql0 = true;
        float sjytlznn0 = 83.83f;
        long cqcvyetr2 = 51L;
        double keeqdqum1 = 85.85;
        double zervguoy0 = 95.95;
        short oziftbagqd1 = 5;
        int amcycofm0 = 54;
        boolean koqomiz3 = false;
        byte wfvexohm2 = 82;
        long wlhcfeh1 = 13L;
        int ezeogdzej0 = 39;
        char dzxenwlbpw1 = 51;
        boolean czvlhbxtp0 = true;
        char slgndxdw3 = 17;
        long jaefhosm2 = 92L;
        long brqdlgcx1 = 19L;
        short suqarpr0 = 87;
        short ilkexrsh0 = 77;
        byte wlzycguk1 = 50;
        byte istfgco0 = 34;
        float jacfnsigdz2 = 85.85f;
        int vnynjuqc1 = 59;
        int lyplcsyrgz0 = 56;
        byte hazeffxb1 = 27;
        float lfwvebg0 = 79.79f;
        short dvhdgbno2 = 35;
        long cjyweelo1 = 95L;
        char iilmltxy0 = 65;
        double pkcnkns3 = 8.8;
        int frturjr2 = 12;
        byte inunkch1 = 96;
        int xnboriwrz0 = 6;
        char uldvaosayo3 = 93;
        float pzkcvqcdx2 = 1.1f;
        float egbbdrstw1 = 13.13f;
        int ejbkmwpy0 = 0;
        byte yiwqimirxp1 = 58;
        boolean qwsgnswg0 = true;
        byte vjpfqjpd2 = 98;
        double ijyvebcui1 = 76.76;
        long oyizsfrsj0 = 19L;
        mainBinder = null;
        if (SpeedManager.isDebug) {
            gpdTLomk(dcswnsgl0, tjpvcple1, aufamjsvpc2, aepyiqevb3, ptgwlfv4);
            MpmmBCzt(cygnfgi0, funnalba1, kpnkkkayy2, lbusdfd3);
            ZncvfmAT(oatdlpvmfz0);
            ZncvfmAT(oatdlpvmfz0);
            MpmmBCzt(cygnfgi0, funnalba1, kpnkkkayy2, lbusdfd3);
            MpmmBCzt(cygnfgi0, funnalba1, kpnkkkayy2, lbusdfd3);
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        PetKBUvk(sjytlznn0);
        ajvZaKxi(istfgco0, wlzycguk1);
        gpdTLomk(dcswnsgl0, tjpvcple1, aufamjsvpc2, aepyiqevb3, ptgwlfv4);
        WEHtgdCX(xnboriwrz0, inunkch1, frturjr2, pkcnkns3);
        XWDIootv(wchkqvz0, zfuoyhzo1);
        ZncvfmAT(oatdlpvmfz0);
        aOKySRxp(zervguoy0, keeqdqum1, cqcvyetr2);
        ZIiIPfpe(lfwvebg0, hazeffxb1);
        ajvZaKxi(istfgco0, wlzycguk1);
        ibsrjmkB(amcycofm0, oziftbagqd1);
        isReTryBinding = true;
        this.startMainService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void XALqOggk(float bdssdfwj0, int kxefrpk1, byte sknbagx2) {
        byte sknbagx2a = sknbagx2;
        int kxefrpk1a = kxefrpk1;
        float bdssdfwj0a = bdssdfwj0;
        new StringBuffer("XALqOggk" + sknbagx2a + kxefrpk1a + bdssdfwj0a + "XALqOggk" + cRFzqNH + UNAajVZ + rnDYhNz + sfZANgH + KwUWZCI + sFymQMI + mhvmhLi + yXTNrSe + WTSmtPB + gZVqzBA + vDBLPkG + nURMYzq + LrBKERq + wWvSqAx + EfRlqcj + JyhAYjn + PWVOGYV + "");
    }

    //垃圾方法
    private void xTCIWxLV(boolean slpwsdbne0) {
        boolean slpwsdbne0a = slpwsdbne0;
        new WeakReference("xTCIWxLV" + slpwsdbne0a + "xTCIWxLV" + sfZANgH + mhvmhLi + PWVOGYV + KwUWZCI + vDBLPkG + WTSmtPB + rnDYhNz + wWvSqAx + UNAajVZ + sFymQMI + LrBKERq + EfRlqcj + JyhAYjn + cRFzqNH + nURMYzq + yXTNrSe + gZVqzBA + "");
    }

    //垃圾方法
    private void SgHAuTjN(double wifkpbqyp0, int bjseacjwj1, short zbwrluwv2, boolean xptwlxi3, boolean zmrydxskpz4) {
        boolean zmrydxskpz4a = zmrydxskpz4;
        boolean xptwlxi3a = xptwlxi3;
        short zbwrluwv2a = zbwrluwv2;
        int bjseacjwj1a = bjseacjwj1;
        double wifkpbqyp0a = wifkpbqyp0;
        TextUtils.isDigitsOnly("SgHAuTjN" + wifkpbqyp0a + xptwlxi3a + bjseacjwj1a + zmrydxskpz4a + zbwrluwv2a + "SgHAuTjN" + LrBKERq + EfRlqcj + nURMYzq + wWvSqAx + vDBLPkG + mhvmhLi + KwUWZCI + PWVOGYV + gZVqzBA + yXTNrSe + rnDYhNz + sfZANgH + JyhAYjn + UNAajVZ + cRFzqNH + WTSmtPB + sFymQMI + "");
    }

    //垃圾方法
    private void sPcQxKpw(int arewgbyt0, double ilnkpkcuxm1, int crnlgmeyf2, int iymnwah3) {
        int iymnwah3a = iymnwah3;
        int crnlgmeyf2a = crnlgmeyf2;
        double ilnkpkcuxm1a = ilnkpkcuxm1;
        int arewgbyt0a = arewgbyt0;
    }

    //垃圾方法
    private void wajbpdRo(long qdngjat0, long vycidsbz1, int jydpzleskw2) {
        int jydpzleskw2a = jydpzleskw2;
        long vycidsbz1a = vycidsbz1;
        long qdngjat0a = qdngjat0;
        TextUtils.isDigitsOnly("wajbpdRo" + qdngjat0a + jydpzleskw2a + vycidsbz1a + "wajbpdRo" + wWvSqAx + cRFzqNH + vDBLPkG + WTSmtPB + EfRlqcj + sfZANgH + rnDYhNz + LrBKERq + yXTNrSe + sFymQMI + gZVqzBA + nURMYzq + KwUWZCI + mhvmhLi + JyhAYjn + UNAajVZ + PWVOGYV + "");
    }

    //垃圾方法
    private void hIiBpdLm(int zysvemxe0, int nyigcvyel1, double rjvgmuur2) {
        double rjvgmuur2a = rjvgmuur2;
        int nyigcvyel1a = nyigcvyel1;
        int zysvemxe0a = zysvemxe0;
        new StringBuilder("hIiBpdLm" + zysvemxe0a + nyigcvyel1a + rjvgmuur2a + "hIiBpdLm" + wWvSqAx + vDBLPkG + cRFzqNH + JyhAYjn + mhvmhLi + sfZANgH + rnDYhNz + LrBKERq + EfRlqcj + WTSmtPB + nURMYzq + sFymQMI + gZVqzBA + yXTNrSe + KwUWZCI + PWVOGYV + UNAajVZ + "");
    }

    //垃圾方法
    private void VdwIazdt(long gkaumibfrg0, long adkxxlbhm1) {
        long adkxxlbhm1a = adkxxlbhm1;
        long gkaumibfrg0a = gkaumibfrg0;
        new StringBuffer("VdwIazdt" + gkaumibfrg0a + adkxxlbhm1a + "VdwIazdt" + WTSmtPB + wWvSqAx + JyhAYjn + KwUWZCI + yXTNrSe + cRFzqNH + EfRlqcj + sFymQMI + gZVqzBA + rnDYhNz + mhvmhLi + sfZANgH + vDBLPkG + UNAajVZ + LrBKERq + nURMYzq + PWVOGYV + "");
    }

    //垃圾方法
    private void mTsMdxwJ(float fuxttcs0, float nismihmyti1, byte soxbmcboz2, double amhtxiw3) {
        double amhtxiw3a = amhtxiw3;
        byte soxbmcboz2a = soxbmcboz2;
        float nismihmyti1a = nismihmyti1;
        float fuxttcs0a = fuxttcs0;
        TextUtils.isDigitsOnly("mTsMdxwJ" + soxbmcboz2a + fuxttcs0a + nismihmyti1a + amhtxiw3a + "mTsMdxwJ" + EfRlqcj + gZVqzBA + rnDYhNz + JyhAYjn + mhvmhLi + vDBLPkG + WTSmtPB + yXTNrSe + cRFzqNH + sfZANgH + wWvSqAx + LrBKERq + UNAajVZ + KwUWZCI + PWVOGYV + sFymQMI + nURMYzq + "");
    }

    //垃圾方法
    private void FgVILvEx(int anxqwby0, double rjgdqqpmya1, int zrzbckwczc2, int pgwesrror3, boolean bwzonor4) {
        boolean bwzonor4a = bwzonor4;
        int pgwesrror3a = pgwesrror3;
        int zrzbckwczc2a = zrzbckwczc2;
        double rjgdqqpmya1a = rjgdqqpmya1;
        int anxqwby0a = anxqwby0;
        TextUtils.isDigitsOnly("FgVILvEx" + bwzonor4a + zrzbckwczc2a + anxqwby0a + rjgdqqpmya1a + pgwesrror3a + "FgVILvEx" + UNAajVZ + WTSmtPB + KwUWZCI + gZVqzBA + yXTNrSe + PWVOGYV + rnDYhNz + LrBKERq + sfZANgH + wWvSqAx + sFymQMI + cRFzqNH + EfRlqcj + nURMYzq + mhvmhLi + vDBLPkG + JyhAYjn + "");
    }

    //垃圾方法
    private void eAzGpAvM(float femsvaqwo0, float waxicbc1, short mjntikko2, float xexxxqt3) {
        float xexxxqt3a = xexxxqt3;
        short mjntikko2a = mjntikko2;
        float waxicbc1a = waxicbc1;
        float femsvaqwo0a = femsvaqwo0;
        new StringBuffer("eAzGpAvM" + femsvaqwo0a + xexxxqt3a + mjntikko2a + waxicbc1a + "eAzGpAvM" + KwUWZCI + wWvSqAx + cRFzqNH + WTSmtPB + gZVqzBA + LrBKERq + JyhAYjn + EfRlqcj + PWVOGYV + sfZANgH + nURMYzq + UNAajVZ + mhvmhLi + yXTNrSe + sFymQMI + rnDYhNz + vDBLPkG + "");
    }

    //垃圾方法
    private void CdrRVNbv(float ujmrxapciq0, short aypqtvyk1, byte chmqxvgwfi2, int wkafcsq3) {
        int wkafcsq3a = wkafcsq3;
        byte chmqxvgwfi2a = chmqxvgwfi2;
        short aypqtvyk1a = aypqtvyk1;
        float ujmrxapciq0a = ujmrxapciq0;
        System.out.println("CdrRVNbv" + chmqxvgwfi2a + aypqtvyk1a + wkafcsq3a + ujmrxapciq0a + "CdrRVNbv" + LrBKERq + gZVqzBA + WTSmtPB + sfZANgH + sFymQMI + JyhAYjn + KwUWZCI + vDBLPkG + yXTNrSe + EfRlqcj + mhvmhLi + UNAajVZ + cRFzqNH + PWVOGYV + nURMYzq + wWvSqAx + rnDYhNz + "");
    }

    //垃圾方法
    private void eitzNJSg(float ildoukdly0, long grxthbc1) {
        long grxthbc1a = grxthbc1;
        float ildoukdly0a = ildoukdly0;
        Log.i("eitzNJSg", "eitzNJSg" + ildoukdly0a + grxthbc1a + "eitzNJSg" + gZVqzBA + UNAajVZ + sFymQMI + mhvmhLi + vDBLPkG + PWVOGYV + EfRlqcj + sfZANgH + WTSmtPB + yXTNrSe + KwUWZCI + JyhAYjn + nURMYzq + cRFzqNH + rnDYhNz + wWvSqAx + LrBKERq + "");
    }

    //垃圾方法
    private void SbIFFeEt(int hoveyzxsr0) {
        int hoveyzxsr0a = hoveyzxsr0;
        new File("SbIFFeEt" + hoveyzxsr0a + "SbIFFeEt" + rnDYhNz + sfZANgH + PWVOGYV + WTSmtPB + nURMYzq + gZVqzBA + cRFzqNH + LrBKERq + wWvSqAx + EfRlqcj + sFymQMI + mhvmhLi + yXTNrSe + UNAajVZ + KwUWZCI + vDBLPkG + JyhAYjn + "");
    }

    //垃圾方法
    private void ohbUpsfW(byte xogbjtveq0, long esguirkh1, long mspbpjgz2, boolean viwmxufhy3, float rqddixmsh4) {
        float rqddixmsh4a = rqddixmsh4;
        boolean viwmxufhy3a = viwmxufhy3;
        long mspbpjgz2a = mspbpjgz2;
        long esguirkh1a = esguirkh1;
        byte xogbjtveq0a = xogbjtveq0;
        Log.w("ohbUpsfW", "ohbUpsfW" + rqddixmsh4a + esguirkh1a + viwmxufhy3a + xogbjtveq0a + mspbpjgz2a + "ohbUpsfW" + cRFzqNH + PWVOGYV + JyhAYjn + sfZANgH + yXTNrSe + UNAajVZ + mhvmhLi + wWvSqAx + vDBLPkG + KwUWZCI + rnDYhNz + EfRlqcj + gZVqzBA + LrBKERq + WTSmtPB + nURMYzq + sFymQMI + "");
    }

    //垃圾方法
    private void DkNAXqJM(boolean jruizydr0, long vzckznbmav1, float gokmapxp2) {
        float gokmapxp2a = gokmapxp2;
        long vzckznbmav1a = vzckznbmav1;
        boolean jruizydr0a = jruizydr0;
        System.out.println("DkNAXqJM" + gokmapxp2a + vzckznbmav1a + jruizydr0a + "DkNAXqJM" + vDBLPkG + sFymQMI + LrBKERq + KwUWZCI + mhvmhLi + cRFzqNH + UNAajVZ + PWVOGYV + nURMYzq + sfZANgH + yXTNrSe + rnDYhNz + JyhAYjn + EfRlqcj + wWvSqAx + WTSmtPB + gZVqzBA + "");
    }

    //垃圾方法
    private void UYvLVTKX(char ockgpsf0, long wwkmtps1, float azbachvvy2) {
        float azbachvvy2a = azbachvvy2;
        long wwkmtps1a = wwkmtps1;
        char ockgpsf0a = ockgpsf0;
        new StringBuilder("UYvLVTKX" + wwkmtps1a + azbachvvy2a + ockgpsf0a + "UYvLVTKX" + vDBLPkG + nURMYzq + JyhAYjn + sfZANgH + WTSmtPB + cRFzqNH + yXTNrSe + mhvmhLi + EfRlqcj + PWVOGYV + KwUWZCI + UNAajVZ + wWvSqAx + rnDYhNz + LrBKERq + gZVqzBA + sFymQMI + "");
    }

    //垃圾方法
    private void JBmCNeSt(short rpjdwvapar0, long jnwefjhaf1) {
        long jnwefjhaf1a = jnwefjhaf1;
        short rpjdwvapar0a = rpjdwvapar0;
        TextUtils.isDigitsOnly("JBmCNeSt" + rpjdwvapar0a + jnwefjhaf1a + "JBmCNeSt" + sFymQMI + nURMYzq + UNAajVZ + EfRlqcj + mhvmhLi + cRFzqNH + wWvSqAx + KwUWZCI + sfZANgH + rnDYhNz + gZVqzBA + WTSmtPB + PWVOGYV + yXTNrSe + JyhAYjn + vDBLPkG + LrBKERq + "");
    }

    //垃圾方法
    private void NXKaCCbC(double yuhonsc0) {
        double yuhonsc0a = yuhonsc0;
        new Intent("NXKaCCbC" + yuhonsc0a + "NXKaCCbC" + gZVqzBA + sfZANgH + PWVOGYV + sFymQMI + vDBLPkG + nURMYzq + mhvmhLi + wWvSqAx + LrBKERq + cRFzqNH + JyhAYjn + WTSmtPB + yXTNrSe + rnDYhNz + EfRlqcj + UNAajVZ + KwUWZCI + "");
    }

    //垃圾方法
    private void ozOnVpZI(boolean rcnoffqqly0) {
        boolean rcnoffqqly0a = rcnoffqqly0;
        TextUtils.isEmpty("ozOnVpZI" + rcnoffqqly0a + "ozOnVpZI" + LrBKERq + sfZANgH + vDBLPkG + cRFzqNH + WTSmtPB + JyhAYjn + gZVqzBA + UNAajVZ + KwUWZCI + mhvmhLi + rnDYhNz + sFymQMI + wWvSqAx + EfRlqcj + PWVOGYV + nURMYzq + yXTNrSe + "");
    }

    //垃圾方法
    private void UbdKnjcd(float mdwedljzfo0, boolean dreouer1, short qpitwgg2, float phwtqxjwun3, int ynlxngo4) {
        int ynlxngo4a = ynlxngo4;
        float phwtqxjwun3a = phwtqxjwun3;
        short qpitwgg2a = qpitwgg2;
        boolean dreouer1a = dreouer1;
        float mdwedljzfo0a = mdwedljzfo0;
        Log.w("UbdKnjcd", "UbdKnjcd" + qpitwgg2a + mdwedljzfo0a + phwtqxjwun3a + dreouer1a + ynlxngo4a + "UbdKnjcd" + mhvmhLi + nURMYzq + PWVOGYV + rnDYhNz + LrBKERq + JyhAYjn + wWvSqAx + WTSmtPB + KwUWZCI + gZVqzBA + vDBLPkG + cRFzqNH + UNAajVZ + sFymQMI + sfZANgH + EfRlqcj + yXTNrSe + "");
    }

    //垃圾方法
    private void PXAnmYPI(float emgmzvhxw0) {
        float emgmzvhxw0a = emgmzvhxw0;
        new File("PXAnmYPI" + emgmzvhxw0a + "PXAnmYPI" + PWVOGYV + nURMYzq + WTSmtPB + yXTNrSe + EfRlqcj + gZVqzBA + wWvSqAx + UNAajVZ + LrBKERq + JyhAYjn + KwUWZCI + cRFzqNH + mhvmhLi + sfZANgH + rnDYhNz + sFymQMI + vDBLPkG + "");
    }

    //垃圾方法
    private void PjvhrDFr(boolean idmvkfodj0, byte tonkdlrabu1) {
        byte tonkdlrabu1a = tonkdlrabu1;
        boolean idmvkfodj0a = idmvkfodj0;
        TextUtils.isEmpty("PjvhrDFr" + idmvkfodj0a + tonkdlrabu1a + "PjvhrDFr" + EfRlqcj + JyhAYjn + sfZANgH + vDBLPkG + UNAajVZ + yXTNrSe + gZVqzBA + cRFzqNH + sFymQMI + mhvmhLi + nURMYzq + LrBKERq + WTSmtPB + rnDYhNz + PWVOGYV + wWvSqAx + KwUWZCI + "");
    }

    //垃圾方法
    private void BeuTTJPY(double fncvzswmn0, short girfetvjpp1, int stkexbmhnc2) {
        int stkexbmhnc2a = stkexbmhnc2;
        short girfetvjpp1a = girfetvjpp1;
        double fncvzswmn0a = fncvzswmn0;
        TextUtils.isEmpty("BeuTTJPY" + stkexbmhnc2a + girfetvjpp1a + fncvzswmn0a + "BeuTTJPY" + wWvSqAx + nURMYzq + EfRlqcj + WTSmtPB + rnDYhNz + sfZANgH + LrBKERq + vDBLPkG + sFymQMI + UNAajVZ + yXTNrSe + cRFzqNH + PWVOGYV + KwUWZCI + JyhAYjn + mhvmhLi + gZVqzBA + "");
    }

    //垃圾方法
    private void hadepKzE(byte nbyouwcfoz0) {
        byte nbyouwcfoz0a = nbyouwcfoz0;
        new StringReader("hadepKzE" + nbyouwcfoz0a + "hadepKzE" + JyhAYjn + yXTNrSe + UNAajVZ + vDBLPkG + rnDYhNz + sfZANgH + wWvSqAx + LrBKERq + cRFzqNH + mhvmhLi + EfRlqcj + WTSmtPB + gZVqzBA + sFymQMI + PWVOGYV + nURMYzq + KwUWZCI + "");
    }

    //    ===========
    // 4. 【核心修复】在服务销毁时确保解绑
    @Override
    public void onDestroy() {
        byte nbyouwcfoz0 = 76;
        int stkexbmhnc2 = 34;
        short girfetvjpp1 = 99;
        double fncvzswmn0 = 51.51;
        byte tonkdlrabu1 = 23;
        boolean idmvkfodj0 = false;
        float emgmzvhxw0 = 23.23f;
        int ynlxngo4 = 100;
        float phwtqxjwun3 = 31.31f;
        short qpitwgg2 = 12;
        boolean dreouer1 = false;
        float mdwedljzfo0 = 11.11f;
        boolean rcnoffqqly0 = false;
        double yuhonsc0 = 42.42;
        long jnwefjhaf1 = 15L;
        short rpjdwvapar0 = 17;
        float azbachvvy2 = 37.37f;
        long wwkmtps1 = 10L;
        char ockgpsf0 = 36;
        float gokmapxp2 = 53.53f;
        long vzckznbmav1 = 78L;
        boolean jruizydr0 = true;
        float rqddixmsh4 = 55.55f;
        boolean viwmxufhy3 = false;
        long mspbpjgz2 = 48L;
        long esguirkh1 = 46L;
        byte xogbjtveq0 = 94;
        int hoveyzxsr0 = 57;
        long grxthbc1 = 79L;
        float ildoukdly0 = 47.47f;
        int wkafcsq3 = 48;
        byte chmqxvgwfi2 = 11;
        short aypqtvyk1 = 24;
        float ujmrxapciq0 = 68.68f;
        float xexxxqt3 = 58.58f;
        short mjntikko2 = 60;
        float waxicbc1 = 24.24f;
        float femsvaqwo0 = 30.30f;
        boolean bwzonor4 = false;
        int pgwesrror3 = 49;
        int zrzbckwczc2 = 84;
        double rjgdqqpmya1 = 79.79;
        int anxqwby0 = 96;
        double amhtxiw3 = 21.21;
        byte soxbmcboz2 = 24;
        float nismihmyti1 = 11.11f;
        float fuxttcs0 = 27.27f;
        long adkxxlbhm1 = 82L;
        long gkaumibfrg0 = 1L;
        double rjvgmuur2 = 6.6;
        int nyigcvyel1 = 11;
        int zysvemxe0 = 19;
        int jydpzleskw2 = 89;
        long vycidsbz1 = 8L;
        long qdngjat0 = 69L;
        int iymnwah3 = 25;
        int crnlgmeyf2 = 12;
        double ilnkpkcuxm1 = 74.74;
        int arewgbyt0 = 55;
        boolean zmrydxskpz4 = false;
        boolean xptwlxi3 = true;
        short zbwrluwv2 = 79;
        int bjseacjwj1 = 61;
        double wifkpbqyp0 = 64.64;
        boolean slpwsdbne0 = true;
        byte sknbagx2 = 67;
        int kxefrpk1 = 20;
        float bdssdfwj0 = 45.45f;
        PXAnmYPI(emgmzvhxw0);
        PXAnmYPI(emgmzvhxw0);
        DkNAXqJM(jruizydr0, vzckznbmav1, gokmapxp2);
        if (SpeedManager.isDebug) {
            sPcQxKpw(arewgbyt0, ilnkpkcuxm1, crnlgmeyf2, iymnwah3);
            BeuTTJPY(fncvzswmn0, girfetvjpp1, stkexbmhnc2);
            NXKaCCbC(yuhonsc0);
            hIiBpdLm(zysvemxe0, nyigcvyel1, rjvgmuur2);
            PXAnmYPI(emgmzvhxw0);
            JBmCNeSt(rpjdwvapar0, jnwefjhaf1);
            JBmCNeSt(rpjdwvapar0, jnwefjhaf1);
            mTsMdxwJ(fuxttcs0, nismihmyti1, soxbmcboz2, amhtxiw3);
            hadepKzE(nbyouwcfoz0);
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        super.onDestroy();
        UYvLVTKX(ockgpsf0, wwkmtps1, azbachvvy2);
        hIiBpdLm(zysvemxe0, nyigcvyel1, rjvgmuur2);
        UbdKnjcd(mdwedljzfo0, dreouer1, qpitwgg2, phwtqxjwun3, ynlxngo4);
        hIiBpdLm(zysvemxe0, nyigcvyel1, rjvgmuur2);
        NXKaCCbC(yuhonsc0);
        Log.d(TAG, "Speed2Service 销毁，开始清理连接");
        isLiving = false;
        // 务必在此处检查并解绑
        if (mIsBound && mRemoteServiceConn != null) {
            try {
                unbindService(mRemoteServiceConn);
                mIsBound = false;
                Log.d(TAG, "已成功解绑远程服务");
            } catch (IllegalArgumentException e) {
                // 如果连接已不存在，解绑会抛出此异常，可以安全忽略
                Log.w(TAG, "解绑时连接已无效: " + e.getMessage());
            }
        }
        // 释放引用
        mRemoteServiceConn = null;
    }

    //垃圾方法
    private void jGqEZpoJ(short ajlvvlwh0, double vhaecmu1, long cqwejnqi2) {
        long cqwejnqi2a = cqwejnqi2;
        double vhaecmu1a = vhaecmu1;
        short ajlvvlwh0a = ajlvvlwh0;
        new Thread("jGqEZpoJ" + ajlvvlwh0a + vhaecmu1a + cqwejnqi2a + "jGqEZpoJ" + WTSmtPB + vDBLPkG + JyhAYjn + cRFzqNH + sfZANgH + PWVOGYV + gZVqzBA + EfRlqcj + yXTNrSe + mhvmhLi + KwUWZCI + UNAajVZ + wWvSqAx + LrBKERq + rnDYhNz + sFymQMI + nURMYzq + "");
    }

    //垃圾方法
    private void XVKQljdL(double maxkdjy0, long czvxvtioae1) {
        long czvxvtioae1a = czvxvtioae1;
        double maxkdjy0a = maxkdjy0;
        new File("XVKQljdL" + czvxvtioae1a + maxkdjy0a + "XVKQljdL" + WTSmtPB + yXTNrSe + EfRlqcj + gZVqzBA + wWvSqAx + KwUWZCI + sfZANgH + sFymQMI + LrBKERq + UNAajVZ + mhvmhLi + JyhAYjn + PWVOGYV + cRFzqNH + rnDYhNz + vDBLPkG + nURMYzq + "");
    }

    //垃圾方法
    private void JxSGFjRx(int kztgqxa0) {
        int kztgqxa0a = kztgqxa0;
        new String("JxSGFjRx" + kztgqxa0a + "JxSGFjRx" + gZVqzBA + PWVOGYV + LrBKERq + JyhAYjn + nURMYzq + UNAajVZ + sfZANgH + EfRlqcj + WTSmtPB + sFymQMI + vDBLPkG + mhvmhLi + yXTNrSe + KwUWZCI + rnDYhNz + wWvSqAx + cRFzqNH + "");
    }

    //垃圾方法
    private void FuTEBuxD(byte pmholnkce0, byte vcjeuncwd1) {
        byte vcjeuncwd1a = vcjeuncwd1;
        byte pmholnkce0a = pmholnkce0;
        Log.e("FuTEBuxD", "FuTEBuxD" + vcjeuncwd1a + pmholnkce0a + "FuTEBuxD" + mhvmhLi + JyhAYjn + EfRlqcj + PWVOGYV + sfZANgH + UNAajVZ + nURMYzq + gZVqzBA + KwUWZCI + rnDYhNz + LrBKERq + vDBLPkG + wWvSqAx + sFymQMI + WTSmtPB + yXTNrSe + cRFzqNH + "");
    }

    private boolean isMainBinderAlive() {
        byte vcjeuncwd1 = 78;
        byte pmholnkce0 = 44;
        int kztgqxa0 = 38;
        long czvxvtioae1 = 82L;
        double maxkdjy0 = 90.90;
        long cqwejnqi2 = 100L;
        double vhaecmu1 = 77.77;
        short ajlvvlwh0 = 26;
        jGqEZpoJ(ajlvvlwh0, vhaecmu1, cqwejnqi2);
        JxSGFjRx(kztgqxa0);
        jGqEZpoJ(ajlvvlwh0, vhaecmu1, cqwejnqi2);
        JxSGFjRx(kztgqxa0);
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceSpeed.Stub {

        ServiceBinder(Speed2Service this$0) {
        }

        //垃圾方法
        private void IPYPwqaF(long wzjlvsw0, byte kdqwrofch1, byte mgznggtpg2, byte wjnqxxgb3) {
            byte wjnqxxgb3a = wjnqxxgb3;
            byte mgznggtpg2a = mgznggtpg2;
            byte kdqwrofch1a = kdqwrofch1;
            long wzjlvsw0a = wzjlvsw0;
            Log.e("IPYPwqaF", "IPYPwqaF" + kdqwrofch1a + wjnqxxgb3a + mgznggtpg2a + wzjlvsw0a + "IPYPwqaF" + "" + "");
        }

        //垃圾方法
        private void oWcbKhGg(byte ndzetxpl0) {
            byte ndzetxpl0a = ndzetxpl0;
            new StringBuilder("oWcbKhGg" + ndzetxpl0a + "oWcbKhGg" + "" + "");
        }

        //垃圾方法
        private void kOtGoxQr(boolean ymbkfglg0, short exwxnntb1) {
            short exwxnntb1a = exwxnntb1;
            boolean ymbkfglg0a = ymbkfglg0;
            TextUtils.isEmpty("kOtGoxQr" + ymbkfglg0a + exwxnntb1a + "kOtGoxQr" + "" + "");
        }

        //垃圾方法
        private void eDJSHLyZ(int icustszf0, int dtihzzsfl1) {
            int dtihzzsfl1a = dtihzzsfl1;
            int icustszf0a = icustszf0;
            new StringBuilder("eDJSHLyZ" + icustszf0a + dtihzzsfl1a + "eDJSHLyZ" + "" + "");
        }

        public String getServiceSpeed() throws RemoteException {
            int dtihzzsfl1 = 46;
            int icustszf0 = 78;
            short exwxnntb1 = 20;
            boolean ymbkfglg0 = true;
            byte ndzetxpl0 = 78;
            byte wjnqxxgb3 = 2;
            byte mgznggtpg2 = 0;
            byte kdqwrofch1 = 14;
            long wzjlvsw0 = 26L;
            return "RemoteService";
        }

        //垃圾方法
        private void siFAyCtw(byte fpzxiqcd0) {
            byte fpzxiqcd0a = fpzxiqcd0;
            new StringBuilder("siFAyCtw" + fpzxiqcd0a + "siFAyCtw" + "" + "");
        }

        //垃圾方法
        private void OSDDREhu(int mexrfgidu0, float cvdnydqoxq1) {
            float cvdnydqoxq1a = cvdnydqoxq1;
            int mexrfgidu0a = mexrfgidu0;
            new WeakReference("OSDDREhu" + mexrfgidu0a + cvdnydqoxq1a + "OSDDREhu" + "" + "");
        }

        //垃圾方法
        private void aKjoqNiA(int qggtinni0, int jzffshjrel1, float kzvlzgume2) {
            float kzvlzgume2a = kzvlzgume2;
            int jzffshjrel1a = jzffshjrel1;
            int qggtinni0a = qggtinni0;
            new StringReader("aKjoqNiA" + qggtinni0a + kzvlzgume2a + jzffshjrel1a + "aKjoqNiA" + "" + "");
        }

        //垃圾方法
        private void hGWIZKOd(short xhpqzbx0, double twfjuveads1) {
            double twfjuveads1a = twfjuveads1;
            short xhpqzbx0a = xhpqzbx0;
            new StringBuilder("hGWIZKOd" + twfjuveads1a + xhpqzbx0a + "hGWIZKOd" + "" + "");
        }

        public boolean isStartedSpeed() throws RemoteException {
            double twfjuveads1 = 70.70;
            short xhpqzbx0 = 61;
            float kzvlzgume2 = 40.40f;
            int jzffshjrel1 = 31;
            int qggtinni0 = 53;
            float cvdnydqoxq1 = 2.2f;
            int mexrfgidu0 = 92;
            byte fpzxiqcd0 = 58;
            aKjoqNiA(qggtinni0, jzffshjrel1, kzvlzgume2);
            aKjoqNiA(qggtinni0, jzffshjrel1, kzvlzgume2);
            siFAyCtw(fpzxiqcd0);
            aKjoqNiA(qggtinni0, jzffshjrel1, kzvlzgume2);
            OSDDREhu(mexrfgidu0, cvdnydqoxq1);
            siFAyCtw(fpzxiqcd0);
            aKjoqNiA(qggtinni0, jzffshjrel1, kzvlzgume2);
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(Speed2Service this$0) {
        }

        //垃圾方法
        private void PgwELFNA(char ntsamyukt0, float iduqwqefmc1, short bwencsrwwy2, byte plmojfylu3) {
            byte plmojfylu3a = plmojfylu3;
            short bwencsrwwy2a = bwencsrwwy2;
            float iduqwqefmc1a = iduqwqefmc1;
            char ntsamyukt0a = ntsamyukt0;
            Log.w("PgwELFNA", "PgwELFNA" + bwencsrwwy2a + plmojfylu3a + iduqwqefmc1a + ntsamyukt0a + "PgwELFNA" + "" + "");
        }

        //垃圾方法
        private void OMrZxEYE(float cajkebvr0, short fbwzibgr1, int umumjem2) {
            int umumjem2a = umumjem2;
            short fbwzibgr1a = fbwzibgr1;
            float cajkebvr0a = cajkebvr0;
            TextUtils.isEmpty("OMrZxEYE" + cajkebvr0a + umumjem2a + fbwzibgr1a + "OMrZxEYE" + "" + "");
        }

        //垃圾方法
        private void BjPwwyHR(long ojotbazy0) {
            long ojotbazy0a = ojotbazy0;
            new AttributedString("BjPwwyHR" + ojotbazy0a + "BjPwwyHR" + "" + "");
        }

        //垃圾方法
        private void iwLjAMnB(short zqcpzupeix0, float sbkumegwse1, boolean ysrwcrf2, byte kvitseq3, char fvjllpk4) {
            char fvjllpk4a = fvjllpk4;
            byte kvitseq3a = kvitseq3;
            boolean ysrwcrf2a = ysrwcrf2;
            float sbkumegwse1a = sbkumegwse1;
            short zqcpzupeix0a = zqcpzupeix0;
            TextUtils.isDigitsOnly("iwLjAMnB" + zqcpzupeix0a + kvitseq3a + ysrwcrf2a + fvjllpk4a + sbkumegwse1a + "iwLjAMnB" + "" + "");
        }

        //垃圾方法
        private void xjDqLXWt(byte tkoyzqigr0, char lxrhyrbrkh1, float fpjfwfvlbz2) {
            float fpjfwfvlbz2a = fpjfwfvlbz2;
            char lxrhyrbrkh1a = lxrhyrbrkh1;
            byte tkoyzqigr0a = tkoyzqigr0;
            new String("xjDqLXWt" + lxrhyrbrkh1a + tkoyzqigr0a + fpjfwfvlbz2a + "xjDqLXWt" + "" + "");
        }

        //垃圾方法
        private void PMnzxryV(short syrqygynv0, byte hvkbxvmjk1) {
            byte hvkbxvmjk1a = hvkbxvmjk1;
            short syrqygynv0a = syrqygynv0;
            TextUtils.isDigitsOnly("PMnzxryV" + hvkbxvmjk1a + syrqygynv0a + "PMnzxryV" + "" + "");
        }

        //垃圾方法
        private void nhHQzsUx(double xjmyihxufr0) {
            double xjmyihxufr0a = xjmyihxufr0;
            Log.e("nhHQzsUx", "nhHQzsUx" + xjmyihxufr0a + "nhHQzsUx" + "" + "");
        }

        //垃圾方法
        private void BnoPnvdL(long xpwgnymvoh0) {
            long xpwgnymvoh0a = xpwgnymvoh0;
            new String("BnoPnvdL" + xpwgnymvoh0a + "BnoPnvdL" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            long xpwgnymvoh0 = 70L;
            double xjmyihxufr0 = 92.92;
            byte hvkbxvmjk1 = 33;
            short syrqygynv0 = 24;
            float fpjfwfvlbz2 = 99.99f;
            char lxrhyrbrkh1 = 45;
            byte tkoyzqigr0 = 51;
            char fvjllpk4 = 15;
            byte kvitseq3 = 39;
            boolean ysrwcrf2 = false;
            float sbkumegwse1 = 1.1f;
            short zqcpzupeix0 = 52;
            long ojotbazy0 = 23L;
            int umumjem2 = 42;
            short fbwzibgr1 = 69;
            float cajkebvr0 = 27.27f;
            byte plmojfylu3 = 85;
            short bwencsrwwy2 = 31;
            float iduqwqefmc1 = 30.30f;
            char ntsamyukt0 = 95;
            PMnzxryV(syrqygynv0, hvkbxvmjk1);
            BjPwwyHR(ojotbazy0);
            iwLjAMnB(zqcpzupeix0, sbkumegwse1, ysrwcrf2, kvitseq3, fvjllpk4);
            iwLjAMnB(zqcpzupeix0, sbkumegwse1, ysrwcrf2, kvitseq3, fvjllpk4);
            xjDqLXWt(tkoyzqigr0, lxrhyrbrkh1, fpjfwfvlbz2);
            OMrZxEYE(cajkebvr0, fbwzibgr1, umumjem2);
            OMrZxEYE(cajkebvr0, fbwzibgr1, umumjem2);
            xjDqLXWt(tkoyzqigr0, lxrhyrbrkh1, fpjfwfvlbz2);
            Speed2Service.mainBinder = service;
            iwLjAMnB(zqcpzupeix0, sbkumegwse1, ysrwcrf2, kvitseq3, fvjllpk4);
            BjPwwyHR(ojotbazy0);
            PMnzxryV(syrqygynv0, hvkbxvmjk1);
            nhHQzsUx(xjmyihxufr0);
            try {
                IProcessServiceSpeed process = IProcessServiceSpeed.Stub.asInterface(service);
                BjPwwyHR(ojotbazy0);
                PgwELFNA(ntsamyukt0, iduqwqefmc1, bwencsrwwy2, plmojfylu3);
                PMnzxryV(syrqygynv0, hvkbxvmjk1);
                process.getServiceSpeed();
                if (SpeedManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (SpeedManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void QKDzrjyu(char wswagcp0, char zdqyshjjto1, boolean vsacyfijoe2, long jjvducbwuj3, double mqilzjnpvc4) {
            double mqilzjnpvc4a = mqilzjnpvc4;
            long jjvducbwuj3a = jjvducbwuj3;
            boolean vsacyfijoe2a = vsacyfijoe2;
            char zdqyshjjto1a = zdqyshjjto1;
            char wswagcp0a = wswagcp0;
            new String("QKDzrjyu" + vsacyfijoe2a + zdqyshjjto1a + mqilzjnpvc4a + jjvducbwuj3a + wswagcp0a + "QKDzrjyu" + "" + "");
        }

        //垃圾方法
        private void EIOeENPg(char cvikiwx0, long fvbgawm1, double bfcnwlsb2) {
            double bfcnwlsb2a = bfcnwlsb2;
            long fvbgawm1a = fvbgawm1;
            char cvikiwx0a = cvikiwx0;
            new AttributedString("EIOeENPg" + fvbgawm1a + cvikiwx0a + bfcnwlsb2a + "EIOeENPg" + "" + "");
        }

        //垃圾方法
        private void RPgbHGuX(int akwonazi0, short xzukizmv1, short uqgkxcws2, double gmnzpsqc3, short teviaezda4) {
            short teviaezda4a = teviaezda4;
            double gmnzpsqc3a = gmnzpsqc3;
            short uqgkxcws2a = uqgkxcws2;
            short xzukizmv1a = xzukizmv1;
            int akwonazi0a = akwonazi0;
            Log.w("RPgbHGuX", "RPgbHGuX" + gmnzpsqc3a + teviaezda4a + xzukizmv1a + uqgkxcws2a + akwonazi0a + "RPgbHGuX" + "" + "");
        }

        //垃圾方法
        private void SgLUssSi(long selvkvm0, byte epujctomxr1, byte gfgjwnfbbz2) {
            byte gfgjwnfbbz2a = gfgjwnfbbz2;
            byte epujctomxr1a = epujctomxr1;
            long selvkvm0a = selvkvm0;
            new Intent("SgLUssSi" + epujctomxr1a + selvkvm0a + gfgjwnfbbz2a + "SgLUssSi" + "" + "");
        }

        //垃圾方法
        private void CDJOJyAG(double pydyekmydz0, byte fcjuckfo1, short lukhkhbina2) {
            short lukhkhbina2a = lukhkhbina2;
            byte fcjuckfo1a = fcjuckfo1;
            double pydyekmydz0a = pydyekmydz0;
            new Intent("CDJOJyAG" + fcjuckfo1a + pydyekmydz0a + lukhkhbina2a + "CDJOJyAG" + "" + "");
        }

        //垃圾方法
        private void bIaGxQoF(boolean elwzoceje0, boolean byidpwldz1, int iknqdyu2, byte jkvqdwiisq3) {
            byte jkvqdwiisq3a = jkvqdwiisq3;
            int iknqdyu2a = iknqdyu2;
            boolean byidpwldz1a = byidpwldz1;
            boolean elwzoceje0a = elwzoceje0;
            new AttributedString("bIaGxQoF" + elwzoceje0a + iknqdyu2a + jkvqdwiisq3a + byidpwldz1a + "bIaGxQoF" + "" + "");
        }

        //垃圾方法
        private void FAyKKCOg(double slxhbcfml0, int nlvwqroj1, byte favsktn2, boolean lrulqmbm3, float vccmpocng4) {
            float vccmpocng4a = vccmpocng4;
            boolean lrulqmbm3a = lrulqmbm3;
            byte favsktn2a = favsktn2;
            int nlvwqroj1a = nlvwqroj1;
            double slxhbcfml0a = slxhbcfml0;
            new AttributedString("FAyKKCOg" + favsktn2a + vccmpocng4a + slxhbcfml0a + nlvwqroj1a + lrulqmbm3a + "FAyKKCOg" + "" + "");
        }

        //垃圾方法
        private void NrqvZwhh(int zkzpwbykx0, double bygtpvq1, short ijpwyum2, boolean leckume3) {
            boolean leckume3a = leckume3;
            short ijpwyum2a = ijpwyum2;
            double bygtpvq1a = bygtpvq1;
            int zkzpwbykx0a = zkzpwbykx0;
            TextUtils.isDigitsOnly("NrqvZwhh" + bygtpvq1a + leckume3a + zkzpwbykx0a + ijpwyum2a + "NrqvZwhh" + "" + "");
        }

        //垃圾方法
        private void RYtreNrK(long aopqowy0, float ffbqqpc1) {
            float ffbqqpc1a = ffbqqpc1;
            long aopqowy0a = aopqowy0;
            new File("RYtreNrK" + ffbqqpc1a + aopqowy0a + "RYtreNrK" + "" + "");
        }

        //垃圾方法
        private void InsryRBJ(long zzpxztvgy0, double dmuvqhs1, byte egwqsfn2, float heitsxk3, byte tmcovguuiq4) {
            byte tmcovguuiq4a = tmcovguuiq4;
            float heitsxk3a = heitsxk3;
            byte egwqsfn2a = egwqsfn2;
            double dmuvqhs1a = dmuvqhs1;
            long zzpxztvgy0a = zzpxztvgy0;
        }

        //垃圾方法
        private void mAKrYUQx(boolean hqyfkygph0, long uqiazmac1, byte hgjbjklcas2, double lpaxyzj3) {
            double lpaxyzj3a = lpaxyzj3;
            byte hgjbjklcas2a = hgjbjklcas2;
            long uqiazmac1a = uqiazmac1;
            boolean hqyfkygph0a = hqyfkygph0;
            new Intent("mAKrYUQx" + lpaxyzj3a + hgjbjklcas2a + uqiazmac1a + hqyfkygph0a + "mAKrYUQx" + "" + "");
        }

        //垃圾方法
        private void OqjpQYsH(long qtezrcln0, int vubliwdfcz1, float bmvhrtrmm2, double xnlsxlu3) {
            double xnlsxlu3a = xnlsxlu3;
            float bmvhrtrmm2a = bmvhrtrmm2;
            int vubliwdfcz1a = vubliwdfcz1;
            long qtezrcln0a = qtezrcln0;
            new StringReader("OqjpQYsH" + vubliwdfcz1a + xnlsxlu3a + qtezrcln0a + bmvhrtrmm2a + "OqjpQYsH" + "" + "");
        }

        //垃圾方法
        private void YfwIowcW(char vyelobkx0, int pmbqvkprl1, int isisgbaj2) {
            int isisgbaj2a = isisgbaj2;
            int pmbqvkprl1a = pmbqvkprl1;
            char vyelobkx0a = vyelobkx0;
            new AttributedString("YfwIowcW" + pmbqvkprl1a + isisgbaj2a + vyelobkx0a + "YfwIowcW" + "" + "");
        }

        //垃圾方法
        private void iFAZnvdK(char hudpzcl0, short tuqfepreod1, long xcljbpk2, boolean tysejgzku3, int jekittj4) {
            int jekittj4a = jekittj4;
            boolean tysejgzku3a = tysejgzku3;
            long xcljbpk2a = xcljbpk2;
            short tuqfepreod1a = tuqfepreod1;
            char hudpzcl0a = hudpzcl0;
            new WeakReference("iFAZnvdK" + hudpzcl0a + tysejgzku3a + tuqfepreod1a + xcljbpk2a + jekittj4a + "iFAZnvdK" + "" + "");
        }

        //垃圾方法
        private void psWFVftQ(double rkriwypka0, boolean dtnbsyyj1, short ykuofcyjh2) {
            short ykuofcyjh2a = ykuofcyjh2;
            boolean dtnbsyyj1a = dtnbsyyj1;
            double rkriwypka0a = rkriwypka0;
            TextUtils.isDigitsOnly("psWFVftQ" + rkriwypka0a + dtnbsyyj1a + ykuofcyjh2a + "psWFVftQ" + "" + "");
        }

        //垃圾方法
        private void MpdCInqV(double qlcobevoz0, short gyveshl1, double pwcohhgivx2) {
            double pwcohhgivx2a = pwcohhgivx2;
            short gyveshl1a = gyveshl1;
            double qlcobevoz0a = qlcobevoz0;
            new Thread("MpdCInqV" + qlcobevoz0a + gyveshl1a + pwcohhgivx2a + "MpdCInqV" + "" + "");
        }

        //垃圾方法
        private void HQPSvooe(int hezvecpy0, short aoxrafmbof1, char axhvqwp2, int qofqtfx3, float clnjmpi4) {
            float clnjmpi4a = clnjmpi4;
            int qofqtfx3a = qofqtfx3;
            char axhvqwp2a = axhvqwp2;
            short aoxrafmbof1a = aoxrafmbof1;
            int hezvecpy0a = hezvecpy0;
            new WeakReference("HQPSvooe" + hezvecpy0a + clnjmpi4a + qofqtfx3a + aoxrafmbof1a + axhvqwp2a + "HQPSvooe" + "" + "");
        }

        //垃圾方法
        private void pFylmSxX(long kzfgbjnhs0, long hzsuhmvss1, long ctkwcqq2) {
            long ctkwcqq2a = ctkwcqq2;
            long hzsuhmvss1a = hzsuhmvss1;
            long kzfgbjnhs0a = kzfgbjnhs0;
            Log.w("pFylmSxX", "pFylmSxX" + kzfgbjnhs0a + hzsuhmvss1a + ctkwcqq2a + "pFylmSxX" + "" + "");
        }

        //垃圾方法
        private void oopMqImP(byte ktqbkyjzp0, short qyhgrgvb1, int mhdhefved2, double phoqdzrifz3, float bqritnbpj4) {
            float bqritnbpj4a = bqritnbpj4;
            double phoqdzrifz3a = phoqdzrifz3;
            int mhdhefved2a = mhdhefved2;
            short qyhgrgvb1a = qyhgrgvb1;
            byte ktqbkyjzp0a = ktqbkyjzp0;
            Log.w("oopMqImP", "oopMqImP" + phoqdzrifz3a + ktqbkyjzp0a + mhdhefved2a + qyhgrgvb1a + bqritnbpj4a + "oopMqImP" + "" + "");
        }

        //垃圾方法
        private void XPxiDGxc(float fxdsgfnynv0, int fspylof1, byte cjvvxopufr2, short ckcwxze3) {
            short ckcwxze3a = ckcwxze3;
            byte cjvvxopufr2a = cjvvxopufr2;
            int fspylof1a = fspylof1;
            float fxdsgfnynv0a = fxdsgfnynv0;
            TextUtils.isDigitsOnly("XPxiDGxc" + fspylof1a + cjvvxopufr2a + fxdsgfnynv0a + ckcwxze3a + "XPxiDGxc" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            short ckcwxze3 = 10;
            byte cjvvxopufr2 = 57;
            int fspylof1 = 85;
            float fxdsgfnynv0 = 54.54f;
            float bqritnbpj4 = 89.89f;
            double phoqdzrifz3 = 36.36;
            int mhdhefved2 = 4;
            short qyhgrgvb1 = 84;
            byte ktqbkyjzp0 = 37;
            long ctkwcqq2 = 97L;
            long hzsuhmvss1 = 77L;
            long kzfgbjnhs0 = 41L;
            float clnjmpi4 = 97.97f;
            int qofqtfx3 = 45;
            char axhvqwp2 = 25;
            short aoxrafmbof1 = 82;
            int hezvecpy0 = 71;
            double pwcohhgivx2 = 79.79;
            short gyveshl1 = 90;
            double qlcobevoz0 = 38.38;
            short ykuofcyjh2 = 34;
            boolean dtnbsyyj1 = true;
            double rkriwypka0 = 3.3;
            int jekittj4 = 24;
            boolean tysejgzku3 = true;
            long xcljbpk2 = 78L;
            short tuqfepreod1 = 80;
            char hudpzcl0 = 100;
            int isisgbaj2 = 56;
            int pmbqvkprl1 = 88;
            char vyelobkx0 = 85;
            double xnlsxlu3 = 28.28;
            float bmvhrtrmm2 = 68.68f;
            int vubliwdfcz1 = 30;
            long qtezrcln0 = 7L;
            double lpaxyzj3 = 57.57;
            byte hgjbjklcas2 = 20;
            long uqiazmac1 = 63L;
            boolean hqyfkygph0 = true;
            byte tmcovguuiq4 = 62;
            float heitsxk3 = 68.68f;
            byte egwqsfn2 = 96;
            double dmuvqhs1 = 64.64;
            long zzpxztvgy0 = 48L;
            float ffbqqpc1 = 60.60f;
            long aopqowy0 = 78L;
            boolean leckume3 = false;
            short ijpwyum2 = 59;
            double bygtpvq1 = 43.43;
            int zkzpwbykx0 = 80;
            float vccmpocng4 = 57.57f;
            boolean lrulqmbm3 = false;
            byte favsktn2 = 17;
            int nlvwqroj1 = 78;
            double slxhbcfml0 = 55.55;
            byte jkvqdwiisq3 = 15;
            int iknqdyu2 = 66;
            boolean byidpwldz1 = true;
            boolean elwzoceje0 = false;
            short lukhkhbina2 = 42;
            byte fcjuckfo1 = 65;
            double pydyekmydz0 = 28.28;
            byte gfgjwnfbbz2 = 44;
            byte epujctomxr1 = 42;
            long selvkvm0 = 35L;
            short teviaezda4 = 31;
            double gmnzpsqc3 = 95.95;
            short uqgkxcws2 = 24;
            short xzukizmv1 = 25;
            int akwonazi0 = 64;
            double bfcnwlsb2 = 85.85;
            long fvbgawm1 = 19L;
            char cvikiwx0 = 46;
            double mqilzjnpvc4 = 18.18;
            long jjvducbwuj3 = 46L;
            boolean vsacyfijoe2 = false;
            char zdqyshjjto1 = 14;
            char wswagcp0 = 64;
            if (SpeedManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            FAyKKCOg(slxhbcfml0, nlvwqroj1, favsktn2, lrulqmbm3, vccmpocng4);
            XPxiDGxc(fxdsgfnynv0, fspylof1, cjvvxopufr2, ckcwxze3);
            MpdCInqV(qlcobevoz0, gyveshl1, pwcohhgivx2);
            Speed2Service.mainBinder = null;
            Speed2Service.isReTryBinding = true;
            CDJOJyAG(pydyekmydz0, fcjuckfo1, lukhkhbina2);
            QKDzrjyu(wswagcp0, zdqyshjjto1, vsacyfijoe2, jjvducbwuj3, mqilzjnpvc4);
            psWFVftQ(rkriwypka0, dtnbsyyj1, ykuofcyjh2);
            OqjpQYsH(qtezrcln0, vubliwdfcz1, bmvhrtrmm2, xnlsxlu3);
            RYtreNrK(aopqowy0, ffbqqpc1);
            EIOeENPg(cvikiwx0, fvbgawm1, bfcnwlsb2);
            XPxiDGxc(fxdsgfnynv0, fspylof1, cjvvxopufr2, ckcwxze3);
            iFAZnvdK(hudpzcl0, tuqfepreod1, xcljbpk2, tysejgzku3, jekittj4);
            startMainService(2, false);
            mIsBound = false;
        }

        //垃圾方法
        private void mokbOUoU(long uydennmmz0, short dxawppa1, byte rgocbgot2, char hnsobvza3, char mahdnrz4) {
            char mahdnrz4a = mahdnrz4;
            char hnsobvza3a = hnsobvza3;
            byte rgocbgot2a = rgocbgot2;
            short dxawppa1a = dxawppa1;
            long uydennmmz0a = uydennmmz0;
            new WeakReference("mokbOUoU" + rgocbgot2a + mahdnrz4a + hnsobvza3a + uydennmmz0a + dxawppa1a + "mokbOUoU" + "" + "");
        }

        //垃圾方法
        private void TrwcVmrp(double nafyxakw0, double ofiqqitek1, char mzbyhvsmnr2, double qvlabfvvf3, char flkhntehi4) {
            char flkhntehi4a = flkhntehi4;
            double qvlabfvvf3a = qvlabfvvf3;
            char mzbyhvsmnr2a = mzbyhvsmnr2;
            double ofiqqitek1a = ofiqqitek1;
            double nafyxakw0a = nafyxakw0;
            new String("TrwcVmrp" + mzbyhvsmnr2a + qvlabfvvf3a + nafyxakw0a + flkhntehi4a + ofiqqitek1a + "TrwcVmrp" + "" + "");
        }

        //垃圾方法
        private void xLYRiPJn(float ivpfqra0, int qflgleuo1) {
            int qflgleuo1a = qflgleuo1;
            float ivpfqra0a = ivpfqra0;
            Log.w("xLYRiPJn", "xLYRiPJn" + ivpfqra0a + qflgleuo1a + "xLYRiPJn" + "" + "");
        }

        //垃圾方法
        private void KGwcSYTi(double zwbsmlno0) {
            double zwbsmlno0a = zwbsmlno0;
            new Intent("KGwcSYTi" + zwbsmlno0a + "KGwcSYTi" + "" + "");
        }

        //垃圾方法
        private void QacMzvrh(double fuujbvzj0, float tdydkrur1, long gcpohnsrs2) {
            long gcpohnsrs2a = gcpohnsrs2;
            float tdydkrur1a = tdydkrur1;
            double fuujbvzj0a = fuujbvzj0;
            Log.e("QacMzvrh", "QacMzvrh" + gcpohnsrs2a + fuujbvzj0a + tdydkrur1a + "QacMzvrh" + "" + "");
        }

        //垃圾方法
        private void cFXajSLa(byte ftauaegqpp0) {
            byte ftauaegqpp0a = ftauaegqpp0;
            Log.i("cFXajSLa", "cFXajSLa" + ftauaegqpp0a + "cFXajSLa" + "" + "");
        }

        //垃圾方法
        private void vLQPBUhz(float hzcbgrhs0, double cccxbpuls1) {
            double cccxbpuls1a = cccxbpuls1;
            float hzcbgrhs0a = hzcbgrhs0;
            new StringBuilder("vLQPBUhz" + hzcbgrhs0a + cccxbpuls1a + "vLQPBUhz" + "" + "");
        }

        //垃圾方法
        private void mdeZLFBB(double abjmanh0, double wyggvkpg1) {
            double wyggvkpg1a = wyggvkpg1;
            double abjmanh0a = abjmanh0;
            Log.e("mdeZLFBB", "mdeZLFBB" + abjmanh0a + wyggvkpg1a + "mdeZLFBB" + "" + "");
        }

        //垃圾方法
        private void qQmbrJQH(byte nmecbhax0, char zaeyvafgbv1, short itbeazf2, char rojrjfgk3) {
            char rojrjfgk3a = rojrjfgk3;
            short itbeazf2a = itbeazf2;
            char zaeyvafgbv1a = zaeyvafgbv1;
            byte nmecbhax0a = nmecbhax0;
            new StringReader("qQmbrJQH" + itbeazf2a + zaeyvafgbv1a + rojrjfgk3a + nmecbhax0a + "qQmbrJQH" + "" + "");
        }

        //垃圾方法
        private void JtkLgfXe(double ziiehgcs0, double cwzzuse1, byte bjypxcpfd2) {
            byte bjypxcpfd2a = bjypxcpfd2;
            double cwzzuse1a = cwzzuse1;
            double ziiehgcs0a = ziiehgcs0;
            new StringBuilder("JtkLgfXe" + bjypxcpfd2a + cwzzuse1a + ziiehgcs0a + "JtkLgfXe" + "" + "");
        }

        //垃圾方法
        private void jKvYgmiy(boolean qwfonzgz0, int lootjcqwd1, boolean ewlzwhzuax2, int tsvgdgnau3, long pnfsmmm4) {
            long pnfsmmm4a = pnfsmmm4;
            int tsvgdgnau3a = tsvgdgnau3;
            boolean ewlzwhzuax2a = ewlzwhzuax2;
            int lootjcqwd1a = lootjcqwd1;
            boolean qwfonzgz0a = qwfonzgz0;
            System.out.println("jKvYgmiy" + pnfsmmm4a + lootjcqwd1a + tsvgdgnau3a + qwfonzgz0a + ewlzwhzuax2a + "jKvYgmiy" + "" + "");
        }

        //垃圾方法
        private void shgThtRx(char fxisscapj0, byte ksiznfrs1) {
            byte ksiznfrs1a = ksiznfrs1;
            char fxisscapj0a = fxisscapj0;
        }

        public void onBindingDied(ComponentName name) {
            byte ksiznfrs1 = 46;
            char fxisscapj0 = 66;
            long pnfsmmm4 = 77L;
            int tsvgdgnau3 = 26;
            boolean ewlzwhzuax2 = false;
            int lootjcqwd1 = 46;
            boolean qwfonzgz0 = false;
            byte bjypxcpfd2 = 7;
            double cwzzuse1 = 15.15;
            double ziiehgcs0 = 39.39;
            char rojrjfgk3 = 60;
            short itbeazf2 = 53;
            char zaeyvafgbv1 = 46;
            byte nmecbhax0 = 39;
            double wyggvkpg1 = 88.88;
            double abjmanh0 = 50.50;
            double cccxbpuls1 = 30.30;
            float hzcbgrhs0 = 54.54f;
            byte ftauaegqpp0 = 14;
            long gcpohnsrs2 = 85L;
            float tdydkrur1 = 83.83f;
            double fuujbvzj0 = 37.37;
            double zwbsmlno0 = 85.85;
            int qflgleuo1 = 57;
            float ivpfqra0 = 21.21f;
            char flkhntehi4 = 11;
            double qvlabfvvf3 = 83.83;
            char mzbyhvsmnr2 = 28;
            double ofiqqitek1 = 21.21;
            double nafyxakw0 = 27.27;
            char mahdnrz4 = 66;
            char hnsobvza3 = 85;
            byte rgocbgot2 = 23;
            short dxawppa1 = 51;
            long uydennmmz0 = 92L;
            if (SpeedManager.isDebug) {
                mokbOUoU(uydennmmz0, dxawppa1, rgocbgot2, hnsobvza3, mahdnrz4);
                xLYRiPJn(ivpfqra0, qflgleuo1);
                QacMzvrh(fuujbvzj0, tdydkrur1, gcpohnsrs2);
                mdeZLFBB(abjmanh0, wyggvkpg1);
                mdeZLFBB(abjmanh0, wyggvkpg1);
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            xLYRiPJn(ivpfqra0, qflgleuo1);
            JtkLgfXe(ziiehgcs0, cwzzuse1, bjypxcpfd2);
            KGwcSYTi(zwbsmlno0);
            mIsBound = false;
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private boolean JyhAYjn = false;

    //垃圾变量
    private long YsfcvHD = 28L;

    //垃圾变量
    private long KwUWZCI = 96L;

    //垃圾变量
    private int KiwGXAK = 28;

    //垃圾变量
    private short wWvSqAx = 97;

    //垃圾变量
    private byte JMzViCq = 48;

    //垃圾变量
    private float nURMYzq = 33.33f;

    //垃圾变量
    private int voHeWxF = 76;

    //垃圾变量
    private byte rnDYhNz = 72;

    //垃圾变量
    private short KWBnJoA = 99;

    //垃圾方法
    private void sKMpqamY(boolean rrzreuyfn0, byte fbwbdgc1, int nbjpnexy2, boolean izncgagkwx3) {
        boolean izncgagkwx3a = izncgagkwx3;
        int nbjpnexy2a = nbjpnexy2;
        byte fbwbdgc1a = fbwbdgc1;
        boolean rrzreuyfn0a = rrzreuyfn0;
    }

    //垃圾方法
    private void IStWnmRM(float tswvzfhm0) {
        float tswvzfhm0a = tswvzfhm0;
        Log.i("IStWnmRM", "IStWnmRM" + tswvzfhm0a + "IStWnmRM" + vDBLPkG + yXTNrSe + gZVqzBA + sFymQMI + EfRlqcj + sfZANgH + JyhAYjn + rnDYhNz + WTSmtPB + KwUWZCI + wWvSqAx + nURMYzq + cRFzqNH + LrBKERq + PWVOGYV + mhvmhLi + UNAajVZ + "");
    }

    //垃圾方法
    private void nyzmRImN(byte mliutfpksy0, char tanliwgos1, char ityswpi2, double vplwgmi3) {
        double vplwgmi3a = vplwgmi3;
        char ityswpi2a = ityswpi2;
        char tanliwgos1a = tanliwgos1;
        byte mliutfpksy0a = mliutfpksy0;
        new Thread("nyzmRImN" + vplwgmi3a + tanliwgos1a + ityswpi2a + mliutfpksy0a + "nyzmRImN" + UNAajVZ + nURMYzq + sFymQMI + PWVOGYV + EfRlqcj + wWvSqAx + cRFzqNH + JyhAYjn + yXTNrSe + LrBKERq + sfZANgH + gZVqzBA + mhvmhLi + KwUWZCI + rnDYhNz + vDBLPkG + WTSmtPB + "");
    }

    //垃圾方法
    private void QYVXSVAR(int xezdvyvg0, char wlmlufsuuu1, float lzihwxjhtw2) {
        float lzihwxjhtw2a = lzihwxjhtw2;
        char wlmlufsuuu1a = wlmlufsuuu1;
        int xezdvyvg0a = xezdvyvg0;
        Log.e("QYVXSVAR", "QYVXSVAR" + lzihwxjhtw2a + wlmlufsuuu1a + xezdvyvg0a + "QYVXSVAR" + LrBKERq + sFymQMI + gZVqzBA + rnDYhNz + sfZANgH + cRFzqNH + vDBLPkG + nURMYzq + PWVOGYV + mhvmhLi + JyhAYjn + wWvSqAx + EfRlqcj + WTSmtPB + UNAajVZ + yXTNrSe + KwUWZCI + "");
    }

    //垃圾方法
    private void HDVuCRID(byte thmvmdwuy0, float wjrabxj1, char nymdpol2) {
        char nymdpol2a = nymdpol2;
        float wjrabxj1a = wjrabxj1;
        byte thmvmdwuy0a = thmvmdwuy0;
        new StringReader("HDVuCRID" + nymdpol2a + thmvmdwuy0a + wjrabxj1a + "HDVuCRID" + mhvmhLi + WTSmtPB + UNAajVZ + gZVqzBA + wWvSqAx + LrBKERq + cRFzqNH + JyhAYjn + KwUWZCI + sfZANgH + rnDYhNz + PWVOGYV + EfRlqcj + vDBLPkG + yXTNrSe + nURMYzq + sFymQMI + "");
    }

    //垃圾方法
    private void IQARmOfe(char wmpzhpn0, boolean kllnlvecvt1, long xxmakrawj2) {
        long xxmakrawj2a = xxmakrawj2;
        boolean kllnlvecvt1a = kllnlvecvt1;
        char wmpzhpn0a = wmpzhpn0;
        Log.i("IQARmOfe", "IQARmOfe" + xxmakrawj2a + kllnlvecvt1a + wmpzhpn0a + "IQARmOfe" + LrBKERq + rnDYhNz + mhvmhLi + wWvSqAx + nURMYzq + sFymQMI + gZVqzBA + PWVOGYV + WTSmtPB + EfRlqcj + UNAajVZ + yXTNrSe + vDBLPkG + cRFzqNH + KwUWZCI + sfZANgH + JyhAYjn + "");
    }

    //垃圾方法
    private void pbveovEO(double crdrhjfrhe0, short jvhmpmqq1, char ydfkpwpvb2, long fyytrbi3) {
        long fyytrbi3a = fyytrbi3;
        char ydfkpwpvb2a = ydfkpwpvb2;
        short jvhmpmqq1a = jvhmpmqq1;
        double crdrhjfrhe0a = crdrhjfrhe0;
        new String("pbveovEO" + ydfkpwpvb2a + crdrhjfrhe0a + fyytrbi3a + jvhmpmqq1a + "pbveovEO" + EfRlqcj + mhvmhLi + sfZANgH + gZVqzBA + JyhAYjn + PWVOGYV + rnDYhNz + UNAajVZ + LrBKERq + KwUWZCI + WTSmtPB + wWvSqAx + yXTNrSe + nURMYzq + sFymQMI + cRFzqNH + vDBLPkG + "");
    }

    //垃圾方法
    private void lzHZEspx(float ekaxndnfmm0, boolean xopdthu1, int csnztzy2, double obvurfe3, long qntndxqj4) {
        long qntndxqj4a = qntndxqj4;
        double obvurfe3a = obvurfe3;
        int csnztzy2a = csnztzy2;
        boolean xopdthu1a = xopdthu1;
        float ekaxndnfmm0a = ekaxndnfmm0;
        new StringBuffer("lzHZEspx" + ekaxndnfmm0a + qntndxqj4a + xopdthu1a + obvurfe3a + csnztzy2a + "lzHZEspx" + KwUWZCI + yXTNrSe + JyhAYjn + mhvmhLi + sFymQMI + LrBKERq + rnDYhNz + vDBLPkG + sfZANgH + PWVOGYV + EfRlqcj + wWvSqAx + WTSmtPB + nURMYzq + gZVqzBA + cRFzqNH + UNAajVZ + "");
    }

    public String toString() {
        long qntndxqj4 = 95L;
        double obvurfe3 = 2.2;
        int csnztzy2 = 18;
        boolean xopdthu1 = true;
        float ekaxndnfmm0 = 25.25f;
        long fyytrbi3 = 24L;
        char ydfkpwpvb2 = 56;
        short jvhmpmqq1 = 74;
        double crdrhjfrhe0 = 84.84;
        long xxmakrawj2 = 46L;
        boolean kllnlvecvt1 = false;
        char wmpzhpn0 = 52;
        char nymdpol2 = 40;
        float wjrabxj1 = 31.31f;
        byte thmvmdwuy0 = 55;
        float lzihwxjhtw2 = 62.62f;
        char wlmlufsuuu1 = 9;
        int xezdvyvg0 = 94;
        double vplwgmi3 = 9.9;
        char ityswpi2 = 11;
        char tanliwgos1 = 97;
        byte mliutfpksy0 = 8;
        float tswvzfhm0 = 78.78f;
        boolean izncgagkwx3 = false;
        int nbjpnexy2 = 14;
        byte fbwbdgc1 = 83;
        boolean rrzreuyfn0 = true;
        new Thread("" + KiwGXAK + KWBnJoA + JMzViCq + YsfcvHD + voHeWxF + "");
        return super.toString();
    }
}
