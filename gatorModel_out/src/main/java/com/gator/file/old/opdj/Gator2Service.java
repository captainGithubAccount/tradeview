package com.gator.file.old.opdj;

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
import androidx.content.gator.IProcessServiceGator;
import com.gator.file.old.GatorManager;
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

public class Gator2Service extends Service {

    //垃圾变量
    private double QXxYrwP = 75.75;

    String TAG = "xxx";

    //垃圾变量
    private char evWRKoM = 82;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private byte CUtOdXg = 87;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private char JcMKQrL = 12;

    public static Boolean isLiving = false;

    //垃圾变量
    private byte aDZMFgk = 5;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private byte ljyGkuB = 63;

    private static long delayTime = 250L;

    //垃圾变量
    private byte ZHsRshu = 40;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private long wmItRFG = 12L;

    public static boolean isStartService = false;

    //垃圾变量
    private byte HRMRwCV = 34;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (GatorManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private int XERKEYl = 69;

    int nextNum = -1;

    //垃圾变量
    private byte qBhTIyT = 52;

    private static IBinder mainBinder = null;

    public Gator2Service() {
    }

    //垃圾方法
    private void EqmytGXC(int hgztynt0, int tvljixnqv1, boolean nqvewddyml2, float vyhpwml3, short mypwxxwn4) {
        short mypwxxwn4a = mypwxxwn4;
        float vyhpwml3a = vyhpwml3;
        boolean nqvewddyml2a = nqvewddyml2;
        int tvljixnqv1a = tvljixnqv1;
        int hgztynt0a = hgztynt0;
        Log.i("EqmytGXC", "EqmytGXC" + nqvewddyml2a + tvljixnqv1a + mypwxxwn4a + vyhpwml3a + hgztynt0a + "EqmytGXC" + GGourqS + HRMRwCV + aDZMFgk + CUtOdXg + pOZxfhe + XERKEYl + ZHsRshu + ljyGkuB + lRtrwsc + qBhTIyT + wmItRFG + QXxYrwP + evWRKoM + JcMKQrL + eHOjWdQ + "");
    }

    //垃圾方法
    private void juKCsDbf(boolean jklhniv0, short hniqsbf1, float gwdbvur2) {
        float gwdbvur2a = gwdbvur2;
        short hniqsbf1a = hniqsbf1;
        boolean jklhniv0a = jklhniv0;
        new WeakReference("juKCsDbf" + hniqsbf1a + jklhniv0a + gwdbvur2a + "juKCsDbf" + JcMKQrL + ZHsRshu + aDZMFgk + qBhTIyT + pOZxfhe + lRtrwsc + QXxYrwP + CUtOdXg + HRMRwCV + ljyGkuB + wmItRFG + evWRKoM + XERKEYl + GGourqS + eHOjWdQ + "");
    }

    //垃圾方法
    private void mOOuAdfQ(int uwjcroc0, short trltmveh1, byte yyfacvbrct2, char udwxqodra3, long knwplmib4) {
        long knwplmib4a = knwplmib4;
        char udwxqodra3a = udwxqodra3;
        byte yyfacvbrct2a = yyfacvbrct2;
        short trltmveh1a = trltmveh1;
        int uwjcroc0a = uwjcroc0;
        new StringReader("mOOuAdfQ" + udwxqodra3a + uwjcroc0a + trltmveh1a + knwplmib4a + yyfacvbrct2a + "mOOuAdfQ" + XERKEYl + pOZxfhe + JcMKQrL + QXxYrwP + evWRKoM + lRtrwsc + ZHsRshu + CUtOdXg + qBhTIyT + HRMRwCV + eHOjWdQ + GGourqS + ljyGkuB + aDZMFgk + wmItRFG + "");
    }

    //垃圾方法
    private void DlzUnxrR(short oygcjppf0, byte dhdrngiwm1, float xfnsozoleb2, int twpsgccdid3, short rblfijgjw4) {
        short rblfijgjw4a = rblfijgjw4;
        int twpsgccdid3a = twpsgccdid3;
        float xfnsozoleb2a = xfnsozoleb2;
        byte dhdrngiwm1a = dhdrngiwm1;
        short oygcjppf0a = oygcjppf0;
        new StringBuilder("DlzUnxrR" + twpsgccdid3a + oygcjppf0a + dhdrngiwm1a + rblfijgjw4a + xfnsozoleb2a + "DlzUnxrR" + ljyGkuB + qBhTIyT + lRtrwsc + ZHsRshu + pOZxfhe + wmItRFG + JcMKQrL + GGourqS + aDZMFgk + evWRKoM + XERKEYl + HRMRwCV + CUtOdXg + eHOjWdQ + QXxYrwP + "");
    }

    //垃圾方法
    private void OktNAKzq(float twygkhz0, short kiwdmtdmw1) {
        short kiwdmtdmw1a = kiwdmtdmw1;
        float twygkhz0a = twygkhz0;
        new StringReader("OktNAKzq" + twygkhz0a + kiwdmtdmw1a + "OktNAKzq" + ZHsRshu + QXxYrwP + qBhTIyT + HRMRwCV + aDZMFgk + pOZxfhe + eHOjWdQ + GGourqS + JcMKQrL + XERKEYl + CUtOdXg + evWRKoM + wmItRFG + lRtrwsc + ljyGkuB + "");
    }

    //垃圾方法
    private void EzCobEaH(float atexmrbne0, short edtxjri1, float hoekldcdgx2, float vguftnef3) {
        float vguftnef3a = vguftnef3;
        float hoekldcdgx2a = hoekldcdgx2;
        short edtxjri1a = edtxjri1;
        float atexmrbne0a = atexmrbne0;
        new StringBuffer("EzCobEaH" + vguftnef3a + atexmrbne0a + edtxjri1a + hoekldcdgx2a + "EzCobEaH" + ZHsRshu + HRMRwCV + ljyGkuB + aDZMFgk + JcMKQrL + GGourqS + pOZxfhe + QXxYrwP + XERKEYl + CUtOdXg + wmItRFG + evWRKoM + qBhTIyT + lRtrwsc + eHOjWdQ + "");
    }

    //垃圾方法
    private void uVBKGvhD(double vikcbom0, double jedviznqtm1, long wjditftzv2, long fgktmyupy3) {
        long fgktmyupy3a = fgktmyupy3;
        long wjditftzv2a = wjditftzv2;
        double jedviznqtm1a = jedviznqtm1;
        double vikcbom0a = vikcbom0;
        new AttributedString("uVBKGvhD" + wjditftzv2a + fgktmyupy3a + jedviznqtm1a + vikcbom0a + "uVBKGvhD" + pOZxfhe + GGourqS + aDZMFgk + XERKEYl + evWRKoM + qBhTIyT + CUtOdXg + ljyGkuB + lRtrwsc + eHOjWdQ + QXxYrwP + HRMRwCV + wmItRFG + JcMKQrL + ZHsRshu + "");
    }

    //垃圾方法
    private void QUAuwkVg(long qbdpdivrj0, float gtrssbyar1) {
        float gtrssbyar1a = gtrssbyar1;
        long qbdpdivrj0a = qbdpdivrj0;
        TextUtils.isDigitsOnly("QUAuwkVg" + gtrssbyar1a + qbdpdivrj0a + "QUAuwkVg" + eHOjWdQ + ljyGkuB + lRtrwsc + QXxYrwP + wmItRFG + HRMRwCV + XERKEYl + GGourqS + JcMKQrL + aDZMFgk + CUtOdXg + pOZxfhe + evWRKoM + qBhTIyT + ZHsRshu + "");
    }

    //垃圾方法
    private void OEQcFZxr(char slkltoik0, byte ayjvgctf1, int avzjbpr2, short vpmozpi3, int cmmmubarr4) {
        int cmmmubarr4a = cmmmubarr4;
        short vpmozpi3a = vpmozpi3;
        int avzjbpr2a = avzjbpr2;
        byte ayjvgctf1a = ayjvgctf1;
        char slkltoik0a = slkltoik0;
    }

    //垃圾方法
    private void WFAFBTTp(long sijhvzbnah0, short hdwxwqop1, long tvhjzlya2) {
        long tvhjzlya2a = tvhjzlya2;
        short hdwxwqop1a = hdwxwqop1;
        long sijhvzbnah0a = sijhvzbnah0;
        new File("WFAFBTTp" + hdwxwqop1a + sijhvzbnah0a + tvhjzlya2a + "WFAFBTTp" + eHOjWdQ + evWRKoM + HRMRwCV + wmItRFG + QXxYrwP + JcMKQrL + ZHsRshu + lRtrwsc + XERKEYl + CUtOdXg + qBhTIyT + GGourqS + aDZMFgk + ljyGkuB + pOZxfhe + "");
    }

    //垃圾方法
    private void YPbGXlYZ(double gwyddnnrk0, double umespqhrv1, double yjosxracn2, double tzzcigg3) {
        double tzzcigg3a = tzzcigg3;
        double yjosxracn2a = yjosxracn2;
        double umespqhrv1a = umespqhrv1;
        double gwyddnnrk0a = gwyddnnrk0;
        new Thread("YPbGXlYZ" + umespqhrv1a + gwyddnnrk0a + tzzcigg3a + yjosxracn2a + "YPbGXlYZ" + GGourqS + wmItRFG + ZHsRshu + ljyGkuB + QXxYrwP + eHOjWdQ + lRtrwsc + XERKEYl + CUtOdXg + qBhTIyT + pOZxfhe + HRMRwCV + JcMKQrL + evWRKoM + aDZMFgk + "");
    }

    //垃圾方法
    private void CpLJbQXa(short dwzqvmt0, char cggmshybdz1, boolean oevtilmo2) {
        boolean oevtilmo2a = oevtilmo2;
        char cggmshybdz1a = cggmshybdz1;
        short dwzqvmt0a = dwzqvmt0;
        TextUtils.isDigitsOnly("CpLJbQXa" + cggmshybdz1a + oevtilmo2a + dwzqvmt0a + "CpLJbQXa" + HRMRwCV + XERKEYl + evWRKoM + CUtOdXg + pOZxfhe + GGourqS + wmItRFG + eHOjWdQ + ljyGkuB + qBhTIyT + QXxYrwP + JcMKQrL + lRtrwsc + aDZMFgk + ZHsRshu + "");
    }

    //垃圾方法
    private void NMCWwYJE(long vwtzhpy0) {
        long vwtzhpy0a = vwtzhpy0;
    }

    //垃圾方法
    private void cmjCzteq(byte vnnydkc0, int uwrxoxl1) {
        int uwrxoxl1a = uwrxoxl1;
        byte vnnydkc0a = vnnydkc0;
        System.out.println("cmjCzteq" + vnnydkc0a + uwrxoxl1a + "cmjCzteq" + XERKEYl + qBhTIyT + ZHsRshu + HRMRwCV + JcMKQrL + GGourqS + wmItRFG + ljyGkuB + lRtrwsc + aDZMFgk + QXxYrwP + pOZxfhe + CUtOdXg + evWRKoM + eHOjWdQ + "");
    }

    //垃圾方法
    private void wbPeJEMu(byte dfednihyb0, long tqiwnqrap1, short qvfbiuswzj2, byte kixhmhlv3, short zytkwrk4) {
        short zytkwrk4a = zytkwrk4;
        byte kixhmhlv3a = kixhmhlv3;
        short qvfbiuswzj2a = qvfbiuswzj2;
        long tqiwnqrap1a = tqiwnqrap1;
        byte dfednihyb0a = dfednihyb0;
        new String("wbPeJEMu" + qvfbiuswzj2a + dfednihyb0a + kixhmhlv3a + zytkwrk4a + tqiwnqrap1a + "wbPeJEMu" + aDZMFgk + QXxYrwP + qBhTIyT + GGourqS + JcMKQrL + ZHsRshu + HRMRwCV + evWRKoM + XERKEYl + eHOjWdQ + lRtrwsc + CUtOdXg + wmItRFG + pOZxfhe + ljyGkuB + "");
    }

    //垃圾方法
    private void GHzCkAFf(byte mxpbhxdkn0, float jllaxesue1, byte ryombwdrsd2, boolean bhlsafktqq3, boolean ebdrrnsq4) {
        boolean ebdrrnsq4a = ebdrrnsq4;
        boolean bhlsafktqq3a = bhlsafktqq3;
        byte ryombwdrsd2a = ryombwdrsd2;
        float jllaxesue1a = jllaxesue1;
        byte mxpbhxdkn0a = mxpbhxdkn0;
        Log.w("GHzCkAFf", "GHzCkAFf" + ebdrrnsq4a + bhlsafktqq3a + mxpbhxdkn0a + ryombwdrsd2a + jllaxesue1a + "GHzCkAFf" + wmItRFG + aDZMFgk + HRMRwCV + pOZxfhe + CUtOdXg + eHOjWdQ + qBhTIyT + ljyGkuB + GGourqS + ZHsRshu + lRtrwsc + JcMKQrL + QXxYrwP + XERKEYl + evWRKoM + "");
    }

    //垃圾方法
    private void fEuPOXWm(short aatnsfrwx0) {
        short aatnsfrwx0a = aatnsfrwx0;
        new WeakReference("fEuPOXWm" + aatnsfrwx0a + "fEuPOXWm" + qBhTIyT + evWRKoM + GGourqS + XERKEYl + lRtrwsc + JcMKQrL + wmItRFG + aDZMFgk + ZHsRshu + QXxYrwP + HRMRwCV + eHOjWdQ + ljyGkuB + CUtOdXg + pOZxfhe + "");
    }

    //垃圾方法
    private void EFQFCznt(long jtwclqc0, short xlprpuch1) {
        short xlprpuch1a = xlprpuch1;
        long jtwclqc0a = jtwclqc0;
        Log.e("EFQFCznt", "EFQFCznt" + jtwclqc0a + xlprpuch1a + "EFQFCznt" + HRMRwCV + QXxYrwP + evWRKoM + wmItRFG + eHOjWdQ + ZHsRshu + aDZMFgk + JcMKQrL + ljyGkuB + lRtrwsc + qBhTIyT + CUtOdXg + pOZxfhe + GGourqS + XERKEYl + "");
    }

    //垃圾方法
    private void XPtCJeWd(byte uzswhxa0) {
        byte uzswhxa0a = uzswhxa0;
        new String("XPtCJeWd" + uzswhxa0a + "XPtCJeWd" + HRMRwCV + JcMKQrL + GGourqS + CUtOdXg + lRtrwsc + QXxYrwP + pOZxfhe + aDZMFgk + XERKEYl + ljyGkuB + wmItRFG + evWRKoM + ZHsRshu + eHOjWdQ + qBhTIyT + "");
    }

    //垃圾方法
    private void hkwYYOZY(byte vtppcbfz0, boolean syrzbjj1, long svkucvhtbz2, double rndrutttlv3) {
        double rndrutttlv3a = rndrutttlv3;
        long svkucvhtbz2a = svkucvhtbz2;
        boolean syrzbjj1a = syrzbjj1;
        byte vtppcbfz0a = vtppcbfz0;
        new Thread("hkwYYOZY" + syrzbjj1a + svkucvhtbz2a + vtppcbfz0a + rndrutttlv3a + "hkwYYOZY" + HRMRwCV + qBhTIyT + QXxYrwP + GGourqS + JcMKQrL + evWRKoM + lRtrwsc + pOZxfhe + wmItRFG + ZHsRshu + XERKEYl + CUtOdXg + aDZMFgk + ljyGkuB + eHOjWdQ + "");
    }

    //垃圾方法
    private void zQPqpaDH(char zmkcuqbqc0, double lqtphadc1, int rmunvuhylh2) {
        int rmunvuhylh2a = rmunvuhylh2;
        double lqtphadc1a = lqtphadc1;
        char zmkcuqbqc0a = zmkcuqbqc0;
        Log.e("zQPqpaDH", "zQPqpaDH" + zmkcuqbqc0a + rmunvuhylh2a + lqtphadc1a + "zQPqpaDH" + HRMRwCV + lRtrwsc + ljyGkuB + evWRKoM + GGourqS + wmItRFG + eHOjWdQ + qBhTIyT + aDZMFgk + ZHsRshu + CUtOdXg + XERKEYl + JcMKQrL + QXxYrwP + pOZxfhe + "");
    }

    //垃圾方法
    private void BDWbfKHw(int hugvvdux0, double cyvarqz1, char euauckmadm2, short fasiwji3, boolean ztqpfnawqo4) {
        boolean ztqpfnawqo4a = ztqpfnawqo4;
        short fasiwji3a = fasiwji3;
        char euauckmadm2a = euauckmadm2;
        double cyvarqz1a = cyvarqz1;
        int hugvvdux0a = hugvvdux0;
        TextUtils.isDigitsOnly("BDWbfKHw" + hugvvdux0a + fasiwji3a + cyvarqz1a + ztqpfnawqo4a + euauckmadm2a + "BDWbfKHw" + GGourqS + lRtrwsc + aDZMFgk + JcMKQrL + XERKEYl + ZHsRshu + ljyGkuB + eHOjWdQ + CUtOdXg + qBhTIyT + wmItRFG + QXxYrwP + pOZxfhe + evWRKoM + HRMRwCV + "");
    }

    //垃圾方法
    private void AkdQkESo(int lexernwnsm0) {
        int lexernwnsm0a = lexernwnsm0;
        new AttributedString("AkdQkESo" + lexernwnsm0a + "AkdQkESo" + CUtOdXg + ZHsRshu + qBhTIyT + aDZMFgk + wmItRFG + QXxYrwP + lRtrwsc + eHOjWdQ + GGourqS + XERKEYl + HRMRwCV + ljyGkuB + evWRKoM + pOZxfhe + JcMKQrL + "");
    }

    //垃圾方法
    private void TuNfPELD(byte xgfhuvzsz0, char fvzylscsuf1, short hophshgwy2, boolean wddcdzqzxc3) {
        boolean wddcdzqzxc3a = wddcdzqzxc3;
        short hophshgwy2a = hophshgwy2;
        char fvzylscsuf1a = fvzylscsuf1;
        byte xgfhuvzsz0a = xgfhuvzsz0;
    }

    //垃圾方法
    private void QGAXJVeQ(short ryxrjeerz0, short yfcihlwb1, double fkrsktga2, long dyktxikhw3) {
        long dyktxikhw3a = dyktxikhw3;
        double fkrsktga2a = fkrsktga2;
        short yfcihlwb1a = yfcihlwb1;
        short ryxrjeerz0a = ryxrjeerz0;
        Log.i("QGAXJVeQ", "QGAXJVeQ" + ryxrjeerz0a + yfcihlwb1a + dyktxikhw3a + fkrsktga2a + "QGAXJVeQ" + qBhTIyT + GGourqS + eHOjWdQ + HRMRwCV + ZHsRshu + QXxYrwP + JcMKQrL + evWRKoM + CUtOdXg + pOZxfhe + XERKEYl + lRtrwsc + wmItRFG + ljyGkuB + aDZMFgk + "");
    }

    //垃圾方法
    private void bMMsvaCk(long rpopihztli0, int hqaxlqc1, double ihhmnse2, byte mtllqcapvi3) {
        byte mtllqcapvi3a = mtllqcapvi3;
        double ihhmnse2a = ihhmnse2;
        int hqaxlqc1a = hqaxlqc1;
        long rpopihztli0a = rpopihztli0;
        TextUtils.isDigitsOnly("bMMsvaCk" + mtllqcapvi3a + rpopihztli0a + ihhmnse2a + hqaxlqc1a + "bMMsvaCk" + lRtrwsc + QXxYrwP + ZHsRshu + aDZMFgk + wmItRFG + pOZxfhe + qBhTIyT + CUtOdXg + eHOjWdQ + HRMRwCV + GGourqS + evWRKoM + JcMKQrL + XERKEYl + ljyGkuB + "");
    }

    //垃圾方法
    private void SdFLTrhL(float ljcxyph0, short uzdoomoo1, float csfhyjj2, char jfdwtwu3) {
        char jfdwtwu3a = jfdwtwu3;
        float csfhyjj2a = csfhyjj2;
        short uzdoomoo1a = uzdoomoo1;
        float ljcxyph0a = ljcxyph0;
        Log.i("SdFLTrhL", "SdFLTrhL" + uzdoomoo1a + csfhyjj2a + jfdwtwu3a + ljcxyph0a + "SdFLTrhL" + wmItRFG + aDZMFgk + JcMKQrL + lRtrwsc + GGourqS + CUtOdXg + pOZxfhe + XERKEYl + ljyGkuB + HRMRwCV + QXxYrwP + eHOjWdQ + qBhTIyT + evWRKoM + ZHsRshu + "");
    }

    //垃圾方法
    private void XfilCYvU(long hqjfjnvikw0, boolean plfgiepdo1, short lqjraiafxr2, byte imkthfbjy3, int ritajwe4) {
        int ritajwe4a = ritajwe4;
        byte imkthfbjy3a = imkthfbjy3;
        short lqjraiafxr2a = lqjraiafxr2;
        boolean plfgiepdo1a = plfgiepdo1;
        long hqjfjnvikw0a = hqjfjnvikw0;
        new WeakReference("XfilCYvU" + lqjraiafxr2a + plfgiepdo1a + hqjfjnvikw0a + imkthfbjy3a + ritajwe4a + "XfilCYvU" + evWRKoM + wmItRFG + lRtrwsc + CUtOdXg + GGourqS + QXxYrwP + ljyGkuB + pOZxfhe + XERKEYl + JcMKQrL + aDZMFgk + ZHsRshu + eHOjWdQ + qBhTIyT + HRMRwCV + "");
    }

    public void onCreate() {
        int ritajwe4 = 38;
        byte imkthfbjy3 = 9;
        short lqjraiafxr2 = 28;
        boolean plfgiepdo1 = false;
        long hqjfjnvikw0 = 8L;
        char jfdwtwu3 = 97;
        float csfhyjj2 = 99.99f;
        short uzdoomoo1 = 28;
        float ljcxyph0 = 23.23f;
        byte mtllqcapvi3 = 4;
        double ihhmnse2 = 99.99;
        int hqaxlqc1 = 12;
        long rpopihztli0 = 50L;
        long dyktxikhw3 = 30L;
        double fkrsktga2 = 27.27;
        short yfcihlwb1 = 92;
        short ryxrjeerz0 = 65;
        boolean wddcdzqzxc3 = true;
        short hophshgwy2 = 1;
        char fvzylscsuf1 = 38;
        byte xgfhuvzsz0 = 53;
        int lexernwnsm0 = 19;
        boolean ztqpfnawqo4 = false;
        short fasiwji3 = 90;
        char euauckmadm2 = 44;
        double cyvarqz1 = 28.28;
        int hugvvdux0 = 41;
        int rmunvuhylh2 = 11;
        double lqtphadc1 = 25.25;
        char zmkcuqbqc0 = 73;
        double rndrutttlv3 = 91.91;
        long svkucvhtbz2 = 5L;
        boolean syrzbjj1 = true;
        byte vtppcbfz0 = 55;
        byte uzswhxa0 = 42;
        short xlprpuch1 = 5;
        long jtwclqc0 = 18L;
        short aatnsfrwx0 = 6;
        boolean ebdrrnsq4 = true;
        boolean bhlsafktqq3 = true;
        byte ryombwdrsd2 = 25;
        float jllaxesue1 = 42.42f;
        byte mxpbhxdkn0 = 18;
        short zytkwrk4 = 0;
        byte kixhmhlv3 = 59;
        short qvfbiuswzj2 = 70;
        long tqiwnqrap1 = 51L;
        byte dfednihyb0 = 82;
        int uwrxoxl1 = 18;
        byte vnnydkc0 = 45;
        long vwtzhpy0 = 35L;
        boolean oevtilmo2 = false;
        char cggmshybdz1 = 99;
        short dwzqvmt0 = 30;
        double tzzcigg3 = 40.40;
        double yjosxracn2 = 47.47;
        double umespqhrv1 = 22.22;
        double gwyddnnrk0 = 29.29;
        long tvhjzlya2 = 21L;
        short hdwxwqop1 = 7;
        long sijhvzbnah0 = 42L;
        int cmmmubarr4 = 9;
        short vpmozpi3 = 18;
        int avzjbpr2 = 74;
        byte ayjvgctf1 = 59;
        char slkltoik0 = 79;
        float gtrssbyar1 = 1.1f;
        long qbdpdivrj0 = 61L;
        long fgktmyupy3 = 95L;
        long wjditftzv2 = 24L;
        double jedviznqtm1 = 21.21;
        double vikcbom0 = 91.91;
        float vguftnef3 = 89.89f;
        float hoekldcdgx2 = 30.30f;
        short edtxjri1 = 89;
        float atexmrbne0 = 59.59f;
        short kiwdmtdmw1 = 29;
        float twygkhz0 = 68.68f;
        short rblfijgjw4 = 56;
        int twpsgccdid3 = 51;
        float xfnsozoleb2 = 24.24f;
        byte dhdrngiwm1 = 55;
        short oygcjppf0 = 20;
        long knwplmib4 = 68L;
        char udwxqodra3 = 45;
        byte yyfacvbrct2 = 40;
        short trltmveh1 = 97;
        int uwjcroc0 = 52;
        float gwdbvur2 = 24.24f;
        short hniqsbf1 = 4;
        boolean jklhniv0 = true;
        short mypwxxwn4 = 2;
        float vyhpwml3 = 14.14f;
        boolean nqvewddyml2 = true;
        int tvljixnqv1 = 80;
        int hgztynt0 = 99;
        isLiving = true;
        XPtCJeWd(uzswhxa0);
        QGAXJVeQ(ryxrjeerz0, yfcihlwb1, fkrsktga2, dyktxikhw3);
        OktNAKzq(twygkhz0, kiwdmtdmw1);
        cmjCzteq(vnnydkc0, uwrxoxl1);
        WFAFBTTp(sijhvzbnah0, hdwxwqop1, tvhjzlya2);
        GHzCkAFf(mxpbhxdkn0, jllaxesue1, ryombwdrsd2, bhlsafktqq3, ebdrrnsq4);
        XPtCJeWd(uzswhxa0);
        super.onCreate();
        if (GatorManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        this.mServiceBinder = new ServiceBinder(this);
        EqmytGXC(hgztynt0, tvljixnqv1, nqvewddyml2, vyhpwml3, mypwxxwn4);
        QGAXJVeQ(ryxrjeerz0, yfcihlwb1, fkrsktga2, dyktxikhw3);
        EFQFCznt(jtwclqc0, xlprpuch1);
        if (this.mRemoteServiceConn == null) {
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        hkwYYOZY(vtppcbfz0, syrzbjj1, svkucvhtbz2, rndrutttlv3);
        EFQFCznt(jtwclqc0, xlprpuch1);
        OktNAKzq(twygkhz0, kiwdmtdmw1);
        zQPqpaDH(zmkcuqbqc0, lqtphadc1, rmunvuhylh2);
        AkdQkESo(lexernwnsm0);
        DlzUnxrR(oygcjppf0, dhdrngiwm1, xfnsozoleb2, twpsgccdid3, rblfijgjw4);
        XfilCYvU(hqjfjnvikw0, plfgiepdo1, lqjraiafxr2, imkthfbjy3, ritajwe4);
        isReTryBinding = true;
        this.startMainService(1, false);
    }

    //垃圾方法
    private void DcYPbEtE(int wikrqkvaw0, byte djksodvwb1, long itoxdyq2) {
        long itoxdyq2a = itoxdyq2;
        byte djksodvwb1a = djksodvwb1;
        int wikrqkvaw0a = wikrqkvaw0;
        new WeakReference("DcYPbEtE" + itoxdyq2a + wikrqkvaw0a + djksodvwb1a + "DcYPbEtE" + CUtOdXg + GGourqS + qBhTIyT + aDZMFgk + lRtrwsc + JcMKQrL + ljyGkuB + ZHsRshu + pOZxfhe + HRMRwCV + evWRKoM + wmItRFG + XERKEYl + QXxYrwP + eHOjWdQ + "");
    }

    //垃圾方法
    private void CNWCjwgX(float uvovknm0, byte vmynawfmit1, char vtgjvkbogo2, int yzysqokkk3, byte qptixbhz4) {
        byte qptixbhz4a = qptixbhz4;
        int yzysqokkk3a = yzysqokkk3;
        char vtgjvkbogo2a = vtgjvkbogo2;
        byte vmynawfmit1a = vmynawfmit1;
        float uvovknm0a = uvovknm0;
        new Intent("CNWCjwgX" + yzysqokkk3a + vtgjvkbogo2a + uvovknm0a + qptixbhz4a + vmynawfmit1a + "CNWCjwgX" + aDZMFgk + eHOjWdQ + wmItRFG + qBhTIyT + evWRKoM + pOZxfhe + ZHsRshu + CUtOdXg + JcMKQrL + GGourqS + ljyGkuB + HRMRwCV + lRtrwsc + XERKEYl + QXxYrwP + "");
    }

    //垃圾方法
    private void bOquUgLx(double kzgosyc0, long rqxsiahg1, short pauvmctzis2, char otbskbvue3, boolean iivplwc4) {
        boolean iivplwc4a = iivplwc4;
        char otbskbvue3a = otbskbvue3;
        short pauvmctzis2a = pauvmctzis2;
        long rqxsiahg1a = rqxsiahg1;
        double kzgosyc0a = kzgosyc0;
        Log.e("bOquUgLx", "bOquUgLx" + iivplwc4a + rqxsiahg1a + otbskbvue3a + pauvmctzis2a + kzgosyc0a + "bOquUgLx" + QXxYrwP + wmItRFG + HRMRwCV + XERKEYl + CUtOdXg + evWRKoM + ZHsRshu + qBhTIyT + ljyGkuB + eHOjWdQ + JcMKQrL + lRtrwsc + pOZxfhe + GGourqS + aDZMFgk + "");
    }

    //垃圾方法
    private void DMtZJQOv(boolean ooalgcnap0, float tddjapnlbk1, int raodzod2, double xkdotjazxt3, short vvihgqpv4) {
        short vvihgqpv4a = vvihgqpv4;
        double xkdotjazxt3a = xkdotjazxt3;
        int raodzod2a = raodzod2;
        float tddjapnlbk1a = tddjapnlbk1;
        boolean ooalgcnap0a = ooalgcnap0;
        TextUtils.isDigitsOnly("DMtZJQOv" + tddjapnlbk1a + vvihgqpv4a + xkdotjazxt3a + raodzod2a + ooalgcnap0a + "DMtZJQOv" + pOZxfhe + XERKEYl + evWRKoM + JcMKQrL + HRMRwCV + wmItRFG + QXxYrwP + ZHsRshu + CUtOdXg + aDZMFgk + eHOjWdQ + qBhTIyT + GGourqS + lRtrwsc + ljyGkuB + "");
    }

    //垃圾方法
    private void VKmSiGye(long draaqfz0, byte eezaemglb1, char iqkuikgxlb2, boolean uvdzetj3) {
        boolean uvdzetj3a = uvdzetj3;
        char iqkuikgxlb2a = iqkuikgxlb2;
        byte eezaemglb1a = eezaemglb1;
        long draaqfz0a = draaqfz0;
        new StringReader("VKmSiGye" + iqkuikgxlb2a + eezaemglb1a + draaqfz0a + uvdzetj3a + "VKmSiGye" + GGourqS + HRMRwCV + CUtOdXg + JcMKQrL + aDZMFgk + XERKEYl + ljyGkuB + ZHsRshu + eHOjWdQ + wmItRFG + qBhTIyT + lRtrwsc + evWRKoM + QXxYrwP + pOZxfhe + "");
    }

    //垃圾方法
    private void jljOlXsI(byte xcaoycucxt0, short yukkgqd1) {
        short yukkgqd1a = yukkgqd1;
        byte xcaoycucxt0a = xcaoycucxt0;
        new StringBuffer("jljOlXsI" + yukkgqd1a + xcaoycucxt0a + "jljOlXsI" + XERKEYl + wmItRFG + ljyGkuB + HRMRwCV + JcMKQrL + CUtOdXg + lRtrwsc + pOZxfhe + GGourqS + QXxYrwP + qBhTIyT + ZHsRshu + evWRKoM + aDZMFgk + eHOjWdQ + "");
    }

    //垃圾方法
    private void ISJStJnp(byte qhtfpxzl0, char vuspnoavup1, byte ieiwwoau2, char kcsxxgisi3) {
        char kcsxxgisi3a = kcsxxgisi3;
        byte ieiwwoau2a = ieiwwoau2;
        char vuspnoavup1a = vuspnoavup1;
        byte qhtfpxzl0a = qhtfpxzl0;
        Log.i("ISJStJnp", "ISJStJnp" + vuspnoavup1a + qhtfpxzl0a + kcsxxgisi3a + ieiwwoau2a + "ISJStJnp" + evWRKoM + aDZMFgk + ZHsRshu + pOZxfhe + eHOjWdQ + XERKEYl + JcMKQrL + qBhTIyT + GGourqS + CUtOdXg + lRtrwsc + wmItRFG + ljyGkuB + QXxYrwP + HRMRwCV + "");
    }

    //垃圾方法
    private void IjYymYbS(short rquumexek0, byte kwjyqctbq1, boolean plbxwzrdro2, short qykyclaj3, float nkvfmsegwd4) {
        float nkvfmsegwd4a = nkvfmsegwd4;
        short qykyclaj3a = qykyclaj3;
        boolean plbxwzrdro2a = plbxwzrdro2;
        byte kwjyqctbq1a = kwjyqctbq1;
        short rquumexek0a = rquumexek0;
        new String("IjYymYbS" + plbxwzrdro2a + rquumexek0a + nkvfmsegwd4a + qykyclaj3a + kwjyqctbq1a + "IjYymYbS" + QXxYrwP + evWRKoM + aDZMFgk + JcMKQrL + ZHsRshu + wmItRFG + CUtOdXg + pOZxfhe + GGourqS + lRtrwsc + qBhTIyT + HRMRwCV + eHOjWdQ + XERKEYl + ljyGkuB + "");
    }

    //垃圾方法
    private void dEMMcThP(long xlmfpgm0, char xxkbwlirvm1, short erihzokem2, boolean tkaovka3, float tnmqlffplk4) {
        float tnmqlffplk4a = tnmqlffplk4;
        boolean tkaovka3a = tkaovka3;
        short erihzokem2a = erihzokem2;
        char xxkbwlirvm1a = xxkbwlirvm1;
        long xlmfpgm0a = xlmfpgm0;
        new StringBuilder("dEMMcThP" + tkaovka3a + xlmfpgm0a + tnmqlffplk4a + erihzokem2a + xxkbwlirvm1a + "dEMMcThP" + XERKEYl + ljyGkuB + pOZxfhe + lRtrwsc + evWRKoM + JcMKQrL + GGourqS + eHOjWdQ + aDZMFgk + QXxYrwP + wmItRFG + ZHsRshu + CUtOdXg + qBhTIyT + HRMRwCV + "");
    }

    //垃圾方法
    private void rlQeWMVN(boolean tnkbbne0, float ovfyybl1, int cegcohv2) {
        int cegcohv2a = cegcohv2;
        float ovfyybl1a = ovfyybl1;
        boolean tnkbbne0a = tnkbbne0;
        new StringBuffer("rlQeWMVN" + tnkbbne0a + cegcohv2a + ovfyybl1a + "rlQeWMVN" + eHOjWdQ + JcMKQrL + wmItRFG + GGourqS + evWRKoM + CUtOdXg + aDZMFgk + qBhTIyT + QXxYrwP + ljyGkuB + HRMRwCV + XERKEYl + ZHsRshu + lRtrwsc + pOZxfhe + "");
    }

    //垃圾方法
    private void SJjAFiWY(double yaklkehml0, float utpedmdzog1, char nagujtd2, long artkjwbcma3) {
        long artkjwbcma3a = artkjwbcma3;
        char nagujtd2a = nagujtd2;
        float utpedmdzog1a = utpedmdzog1;
        double yaklkehml0a = yaklkehml0;
        new StringBuffer("SJjAFiWY" + yaklkehml0a + artkjwbcma3a + nagujtd2a + utpedmdzog1a + "SJjAFiWY" + JcMKQrL + eHOjWdQ + ljyGkuB + XERKEYl + QXxYrwP + pOZxfhe + HRMRwCV + wmItRFG + lRtrwsc + evWRKoM + ZHsRshu + aDZMFgk + CUtOdXg + GGourqS + qBhTIyT + "");
    }

    //垃圾方法
    private void XqJYCxVP(byte owelijnc0, float wrfvqcnhn1) {
        float wrfvqcnhn1a = wrfvqcnhn1;
        byte owelijnc0a = owelijnc0;
        new String("XqJYCxVP" + wrfvqcnhn1a + owelijnc0a + "XqJYCxVP" + lRtrwsc + aDZMFgk + XERKEYl + pOZxfhe + HRMRwCV + ljyGkuB + GGourqS + eHOjWdQ + CUtOdXg + JcMKQrL + QXxYrwP + evWRKoM + ZHsRshu + wmItRFG + qBhTIyT + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        float wrfvqcnhn1 = 43.43f;
        byte owelijnc0 = 97;
        long artkjwbcma3 = 89L;
        char nagujtd2 = 35;
        float utpedmdzog1 = 22.22f;
        double yaklkehml0 = 7.7;
        int cegcohv2 = 87;
        float ovfyybl1 = 82.82f;
        boolean tnkbbne0 = false;
        float tnmqlffplk4 = 36.36f;
        boolean tkaovka3 = false;
        short erihzokem2 = 3;
        char xxkbwlirvm1 = 24;
        long xlmfpgm0 = 34L;
        float nkvfmsegwd4 = 20.20f;
        short qykyclaj3 = 42;
        boolean plbxwzrdro2 = true;
        byte kwjyqctbq1 = 53;
        short rquumexek0 = 41;
        char kcsxxgisi3 = 59;
        byte ieiwwoau2 = 76;
        char vuspnoavup1 = 55;
        byte qhtfpxzl0 = 18;
        short yukkgqd1 = 85;
        byte xcaoycucxt0 = 83;
        boolean uvdzetj3 = false;
        char iqkuikgxlb2 = 5;
        byte eezaemglb1 = 74;
        long draaqfz0 = 91L;
        short vvihgqpv4 = 72;
        double xkdotjazxt3 = 16.16;
        int raodzod2 = 61;
        float tddjapnlbk1 = 52.52f;
        boolean ooalgcnap0 = true;
        boolean iivplwc4 = true;
        char otbskbvue3 = 20;
        short pauvmctzis2 = 53;
        long rqxsiahg1 = 72L;
        double kzgosyc0 = 10.10;
        byte qptixbhz4 = 77;
        int yzysqokkk3 = 88;
        char vtgjvkbogo2 = 96;
        byte vmynawfmit1 = 54;
        float uvovknm0 = 24.24f;
        long itoxdyq2 = 3L;
        byte djksodvwb1 = 49;
        int wikrqkvaw0 = 73;
        DMtZJQOv(ooalgcnap0, tddjapnlbk1, raodzod2, xkdotjazxt3, vvihgqpv4);
        ISJStJnp(qhtfpxzl0, vuspnoavup1, ieiwwoau2, kcsxxgisi3);
        bOquUgLx(kzgosyc0, rqxsiahg1, pauvmctzis2, otbskbvue3, iivplwc4);
        DMtZJQOv(ooalgcnap0, tddjapnlbk1, raodzod2, xkdotjazxt3, vvihgqpv4);
        if (intent != null) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (GatorManager.isDebug) {
            DMtZJQOv(ooalgcnap0, tddjapnlbk1, raodzod2, xkdotjazxt3, vvihgqpv4);
            DMtZJQOv(ooalgcnap0, tddjapnlbk1, raodzod2, xkdotjazxt3, vvihgqpv4);
            rlQeWMVN(tnkbbne0, ovfyybl1, cegcohv2);
            ISJStJnp(qhtfpxzl0, vuspnoavup1, ieiwwoau2, kcsxxgisi3);
            rlQeWMVN(tnkbbne0, ovfyybl1, cegcohv2);
            bOquUgLx(kzgosyc0, rqxsiahg1, pauvmctzis2, otbskbvue3, iivplwc4);
            bOquUgLx(kzgosyc0, rqxsiahg1, pauvmctzis2, otbskbvue3, iivplwc4);
            VKmSiGye(draaqfz0, eezaemglb1, iqkuikgxlb2, uvdzetj3);
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        IjYymYbS(rquumexek0, kwjyqctbq1, plbxwzrdro2, qykyclaj3, nkvfmsegwd4);
        XqJYCxVP(owelijnc0, wrfvqcnhn1);
        jljOlXsI(xcaoycucxt0, yukkgqd1);
        CNWCjwgX(uvovknm0, vmynawfmit1, vtgjvkbogo2, yzysqokkk3, qptixbhz4);
        DcYPbEtE(wikrqkvaw0, djksodvwb1, itoxdyq2);
        DcYPbEtE(wikrqkvaw0, djksodvwb1, itoxdyq2);
        jljOlXsI(xcaoycucxt0, yukkgqd1);
        jljOlXsI(xcaoycucxt0, yukkgqd1);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void IipjDelX(double bfxolgbv0, short lsaqnorq1, short bdnbhfgil2, byte hinegnpxq3, double bupvqakt4) {
        double bupvqakt4a = bupvqakt4;
        byte hinegnpxq3a = hinegnpxq3;
        short bdnbhfgil2a = bdnbhfgil2;
        short lsaqnorq1a = lsaqnorq1;
        double bfxolgbv0a = bfxolgbv0;
        new Thread("IipjDelX" + hinegnpxq3a + lsaqnorq1a + bfxolgbv0a + bdnbhfgil2a + bupvqakt4a + "IipjDelX" + qBhTIyT + JcMKQrL + aDZMFgk + ZHsRshu + HRMRwCV + QXxYrwP + evWRKoM + GGourqS + wmItRFG + XERKEYl + pOZxfhe + lRtrwsc + eHOjWdQ + CUtOdXg + ljyGkuB + "");
    }

    //垃圾方法
    private void kiGKphKY(int aiudhgdq0, boolean mfrmitbrix1, float sbjecpflz2, boolean ctesjmcc3, int xqjovrlib4) {
        int xqjovrlib4a = xqjovrlib4;
        boolean ctesjmcc3a = ctesjmcc3;
        float sbjecpflz2a = sbjecpflz2;
        boolean mfrmitbrix1a = mfrmitbrix1;
        int aiudhgdq0a = aiudhgdq0;
        new File("kiGKphKY" + sbjecpflz2a + aiudhgdq0a + ctesjmcc3a + xqjovrlib4a + mfrmitbrix1a + "kiGKphKY" + pOZxfhe + wmItRFG + GGourqS + evWRKoM + qBhTIyT + HRMRwCV + QXxYrwP + JcMKQrL + aDZMFgk + ljyGkuB + lRtrwsc + eHOjWdQ + XERKEYl + ZHsRshu + CUtOdXg + "");
    }

    //垃圾方法
    private void jdBhPbtx(double rcmabnq0, char lswsksos1, double uxmldxgrp2, byte ctqiqnmrxp3) {
        byte ctqiqnmrxp3a = ctqiqnmrxp3;
        double uxmldxgrp2a = uxmldxgrp2;
        char lswsksos1a = lswsksos1;
        double rcmabnq0a = rcmabnq0;
        TextUtils.isEmpty("jdBhPbtx" + rcmabnq0a + uxmldxgrp2a + ctqiqnmrxp3a + lswsksos1a + "jdBhPbtx" + ZHsRshu + ljyGkuB + XERKEYl + JcMKQrL + lRtrwsc + pOZxfhe + evWRKoM + aDZMFgk + eHOjWdQ + CUtOdXg + HRMRwCV + GGourqS + qBhTIyT + QXxYrwP + wmItRFG + "");
    }

    //垃圾方法
    private void wAtHSpyl(long yqftpcz0, short bkpnqacmzq1, float ozbqldadwq2, float jzuhnbvxn3, double uosmwuaq4) {
        double uosmwuaq4a = uosmwuaq4;
        float jzuhnbvxn3a = jzuhnbvxn3;
        float ozbqldadwq2a = ozbqldadwq2;
        short bkpnqacmzq1a = bkpnqacmzq1;
        long yqftpcz0a = yqftpcz0;
    }

    //垃圾方法
    private void kyqkfxZY(short arzgkuvfa0) {
        short arzgkuvfa0a = arzgkuvfa0;
        TextUtils.isEmpty("kyqkfxZY" + arzgkuvfa0a + "kyqkfxZY" + lRtrwsc + QXxYrwP + JcMKQrL + HRMRwCV + ljyGkuB + pOZxfhe + XERKEYl + aDZMFgk + wmItRFG + CUtOdXg + GGourqS + qBhTIyT + evWRKoM + ZHsRshu + eHOjWdQ + "");
    }

    //垃圾方法
    private void qSXwrMKx(double etffkswgzh0) {
        double etffkswgzh0a = etffkswgzh0;
        new String("qSXwrMKx" + etffkswgzh0a + "qSXwrMKx" + ljyGkuB + pOZxfhe + QXxYrwP + JcMKQrL + HRMRwCV + evWRKoM + qBhTIyT + eHOjWdQ + lRtrwsc + XERKEYl + ZHsRshu + CUtOdXg + GGourqS + wmItRFG + aDZMFgk + "");
    }

    //垃圾方法
    private void bgmiJtuf(short oleilldw0, short ljjwutfo1, float yenqgrv2) {
        float yenqgrv2a = yenqgrv2;
        short ljjwutfo1a = ljjwutfo1;
        short oleilldw0a = oleilldw0;
        new StringBuilder("bgmiJtuf" + yenqgrv2a + oleilldw0a + ljjwutfo1a + "bgmiJtuf" + lRtrwsc + GGourqS + JcMKQrL + ljyGkuB + XERKEYl + qBhTIyT + CUtOdXg + pOZxfhe + eHOjWdQ + wmItRFG + QXxYrwP + aDZMFgk + ZHsRshu + evWRKoM + HRMRwCV + "");
    }

    //垃圾方法
    private void pKzRvKvL(char upbsqxkrg0, double qpngjkjbb1, double tlihstwg2, float hjinzjsdik3) {
        float hjinzjsdik3a = hjinzjsdik3;
        double tlihstwg2a = tlihstwg2;
        double qpngjkjbb1a = qpngjkjbb1;
        char upbsqxkrg0a = upbsqxkrg0;
        TextUtils.isEmpty("pKzRvKvL" + upbsqxkrg0a + qpngjkjbb1a + tlihstwg2a + hjinzjsdik3a + "pKzRvKvL" + evWRKoM + QXxYrwP + eHOjWdQ + ljyGkuB + ZHsRshu + CUtOdXg + pOZxfhe + lRtrwsc + GGourqS + wmItRFG + XERKEYl + aDZMFgk + HRMRwCV + qBhTIyT + JcMKQrL + "");
    }

    public boolean onUnbind(Intent intent) {
        float hjinzjsdik3 = 60.60f;
        double tlihstwg2 = 12.12;
        double qpngjkjbb1 = 17.17;
        char upbsqxkrg0 = 89;
        float yenqgrv2 = 44.44f;
        short ljjwutfo1 = 16;
        short oleilldw0 = 81;
        double etffkswgzh0 = 1.1;
        short arzgkuvfa0 = 69;
        double uosmwuaq4 = 36.36;
        float jzuhnbvxn3 = 78.78f;
        float ozbqldadwq2 = 52.52f;
        short bkpnqacmzq1 = 55;
        long yqftpcz0 = 9L;
        byte ctqiqnmrxp3 = 55;
        double uxmldxgrp2 = 100.100;
        char lswsksos1 = 13;
        double rcmabnq0 = 76.76;
        int xqjovrlib4 = 87;
        boolean ctesjmcc3 = false;
        float sbjecpflz2 = 83.83f;
        boolean mfrmitbrix1 = false;
        int aiudhgdq0 = 94;
        double bupvqakt4 = 22.22;
        byte hinegnpxq3 = 46;
        short bdnbhfgil2 = 57;
        short lsaqnorq1 = 32;
        double bfxolgbv0 = 97.97;
        if (GatorManager.isDebug) {
            bgmiJtuf(oleilldw0, ljjwutfo1, yenqgrv2);
            bgmiJtuf(oleilldw0, ljjwutfo1, yenqgrv2);
            bgmiJtuf(oleilldw0, ljjwutfo1, yenqgrv2);
            IipjDelX(bfxolgbv0, lsaqnorq1, bdnbhfgil2, hinegnpxq3, bupvqakt4);
            kiGKphKY(aiudhgdq0, mfrmitbrix1, sbjecpflz2, ctesjmcc3, xqjovrlib4);
            kyqkfxZY(arzgkuvfa0);
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        bgmiJtuf(oleilldw0, ljjwutfo1, yenqgrv2);
        bgmiJtuf(oleilldw0, ljjwutfo1, yenqgrv2);
        bgmiJtuf(oleilldw0, ljjwutfo1, yenqgrv2);
        kyqkfxZY(arzgkuvfa0);
        pKzRvKvL(upbsqxkrg0, qpngjkjbb1, tlihstwg2, hjinzjsdik3);
        kiGKphKY(aiudhgdq0, mfrmitbrix1, sbjecpflz2, ctesjmcc3, xqjovrlib4);
        pKzRvKvL(upbsqxkrg0, qpngjkjbb1, tlihstwg2, hjinzjsdik3);
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void HwfjDvOi(float zcaevni0) {
        float zcaevni0a = zcaevni0;
        new AttributedString("HwfjDvOi" + zcaevni0a + "HwfjDvOi" + wmItRFG + ljyGkuB + ZHsRshu + lRtrwsc + pOZxfhe + aDZMFgk + qBhTIyT + JcMKQrL + evWRKoM + eHOjWdQ + XERKEYl + HRMRwCV + QXxYrwP + GGourqS + CUtOdXg + "");
    }

    //垃圾方法
    private void EBvArNMf(char fvuhppl0, double jtotvyv1, long vxbiggj2, int ybaxiyn3) {
        int ybaxiyn3a = ybaxiyn3;
        long vxbiggj2a = vxbiggj2;
        double jtotvyv1a = jtotvyv1;
        char fvuhppl0a = fvuhppl0;
        new Thread("EBvArNMf" + jtotvyv1a + vxbiggj2a + fvuhppl0a + ybaxiyn3a + "EBvArNMf" + evWRKoM + ljyGkuB + HRMRwCV + eHOjWdQ + ZHsRshu + QXxYrwP + JcMKQrL + aDZMFgk + lRtrwsc + XERKEYl + CUtOdXg + qBhTIyT + GGourqS + wmItRFG + pOZxfhe + "");
    }

    //垃圾方法
    private void UoUpzXfj(boolean ntayiqwwd0) {
        boolean ntayiqwwd0a = ntayiqwwd0;
        new File("UoUpzXfj" + ntayiqwwd0a + "UoUpzXfj" + GGourqS + ljyGkuB + QXxYrwP + evWRKoM + HRMRwCV + pOZxfhe + aDZMFgk + eHOjWdQ + JcMKQrL + qBhTIyT + wmItRFG + ZHsRshu + CUtOdXg + lRtrwsc + XERKEYl + "");
    }

    //垃圾方法
    private void wgtJAwth(short oimnrkok0, long oywkaeq1, float czljrsptor2) {
        float czljrsptor2a = czljrsptor2;
        long oywkaeq1a = oywkaeq1;
        short oimnrkok0a = oimnrkok0;
        new String("wgtJAwth" + oimnrkok0a + czljrsptor2a + oywkaeq1a + "wgtJAwth" + JcMKQrL + QXxYrwP + pOZxfhe + qBhTIyT + eHOjWdQ + wmItRFG + aDZMFgk + XERKEYl + HRMRwCV + ljyGkuB + evWRKoM + lRtrwsc + GGourqS + ZHsRshu + CUtOdXg + "");
    }

    //垃圾方法
    private void fxdRFoXd(double dgzepfsec0, char smavjhrsbc1) {
        char smavjhrsbc1a = smavjhrsbc1;
        double dgzepfsec0a = dgzepfsec0;
        Log.i("fxdRFoXd", "fxdRFoXd" + smavjhrsbc1a + dgzepfsec0a + "fxdRFoXd" + XERKEYl + GGourqS + aDZMFgk + evWRKoM + eHOjWdQ + pOZxfhe + JcMKQrL + ljyGkuB + wmItRFG + qBhTIyT + HRMRwCV + QXxYrwP + lRtrwsc + ZHsRshu + CUtOdXg + "");
    }

    //垃圾方法
    private void tWVyvVLc(long bizeesddd0, int qukupfx1) {
        int qukupfx1a = qukupfx1;
        long bizeesddd0a = bizeesddd0;
        new StringBuilder("tWVyvVLc" + qukupfx1a + bizeesddd0a + "tWVyvVLc" + evWRKoM + JcMKQrL + QXxYrwP + lRtrwsc + ZHsRshu + XERKEYl + GGourqS + qBhTIyT + eHOjWdQ + ljyGkuB + wmItRFG + pOZxfhe + CUtOdXg + aDZMFgk + HRMRwCV + "");
    }

    //垃圾方法
    private void dJhPOnJX(int mauglps0, boolean yiyebbofq1) {
        boolean yiyebbofq1a = yiyebbofq1;
        int mauglps0a = mauglps0;
    }

    //垃圾方法
    private void BTkyEnMl(boolean bvjngjzpcn0) {
        boolean bvjngjzpcn0a = bvjngjzpcn0;
        new StringReader("BTkyEnMl" + bvjngjzpcn0a + "BTkyEnMl" + lRtrwsc + evWRKoM + pOZxfhe + QXxYrwP + XERKEYl + ljyGkuB + eHOjWdQ + CUtOdXg + aDZMFgk + qBhTIyT + GGourqS + wmItRFG + ZHsRshu + JcMKQrL + HRMRwCV + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        boolean bvjngjzpcn0 = false;
        boolean yiyebbofq1 = false;
        int mauglps0 = 95;
        int qukupfx1 = 69;
        long bizeesddd0 = 84L;
        char smavjhrsbc1 = 14;
        double dgzepfsec0 = 94.94;
        float czljrsptor2 = 74.74f;
        long oywkaeq1 = 34L;
        short oimnrkok0 = 27;
        boolean ntayiqwwd0 = true;
        int ybaxiyn3 = 79;
        long vxbiggj2 = 97L;
        double jtotvyv1 = 71.71;
        char fvuhppl0 = 26;
        float zcaevni0 = 7.7f;
        if (GatorManager.isDebug) {
            dJhPOnJX(mauglps0, yiyebbofq1);
            tWVyvVLc(bizeesddd0, qukupfx1);
            tWVyvVLc(bizeesddd0, qukupfx1);
            EBvArNMf(fvuhppl0, jtotvyv1, vxbiggj2, ybaxiyn3);
            fxdRFoXd(dgzepfsec0, smavjhrsbc1);
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        tWVyvVLc(bizeesddd0, qukupfx1);
        HwfjDvOi(zcaevni0);
        tWVyvVLc(bizeesddd0, qukupfx1);
        BTkyEnMl(bvjngjzpcn0);
        UoUpzXfj(ntayiqwwd0);
        BTkyEnMl(bvjngjzpcn0);
        BTkyEnMl(bvjngjzpcn0);
        return this.mServiceBinder;
    }

    //垃圾方法
    private void bUiyygjR(short hrsxxzy0, short qduopug1, float zeeuajw2, short pzwzcii3) {
        short pzwzcii3a = pzwzcii3;
        float zeeuajw2a = zeeuajw2;
        short qduopug1a = qduopug1;
        short hrsxxzy0a = hrsxxzy0;
        new String("bUiyygjR" + qduopug1a + zeeuajw2a + hrsxxzy0a + pzwzcii3a + "bUiyygjR" + lRtrwsc + pOZxfhe + GGourqS + eHOjWdQ + ljyGkuB + CUtOdXg + XERKEYl + evWRKoM + aDZMFgk + HRMRwCV + QXxYrwP + ZHsRshu + JcMKQrL + qBhTIyT + wmItRFG + "");
    }

    //垃圾方法
    private void kXuiLjFv(byte uevidpfgl0, long tjbxqezl1) {
        long tjbxqezl1a = tjbxqezl1;
        byte uevidpfgl0a = uevidpfgl0;
        TextUtils.isEmpty("kXuiLjFv" + uevidpfgl0a + tjbxqezl1a + "kXuiLjFv" + QXxYrwP + HRMRwCV + ZHsRshu + XERKEYl + pOZxfhe + ljyGkuB + GGourqS + lRtrwsc + aDZMFgk + evWRKoM + qBhTIyT + eHOjWdQ + JcMKQrL + CUtOdXg + wmItRFG + "");
    }

    //垃圾方法
    private void bnusSExQ(long gznpkvrj0, char rwrizrkzf1) {
        char rwrizrkzf1a = rwrizrkzf1;
        long gznpkvrj0a = gznpkvrj0;
        new AttributedString("bnusSExQ" + gznpkvrj0a + rwrizrkzf1a + "bnusSExQ" + XERKEYl + pOZxfhe + evWRKoM + ljyGkuB + CUtOdXg + aDZMFgk + QXxYrwP + ZHsRshu + JcMKQrL + lRtrwsc + qBhTIyT + GGourqS + eHOjWdQ + HRMRwCV + wmItRFG + "");
    }

    //垃圾方法
    private void foACZGGV(byte opbakntyvj0, long xnxuaqke1, short wkbtqvbmh2, byte moxktzwbem3, float zrvlytylz4) {
        float zrvlytylz4a = zrvlytylz4;
        byte moxktzwbem3a = moxktzwbem3;
        short wkbtqvbmh2a = wkbtqvbmh2;
        long xnxuaqke1a = xnxuaqke1;
        byte opbakntyvj0a = opbakntyvj0;
        Log.i("foACZGGV", "foACZGGV" + xnxuaqke1a + opbakntyvj0a + moxktzwbem3a + zrvlytylz4a + wkbtqvbmh2a + "foACZGGV" + ljyGkuB + eHOjWdQ + aDZMFgk + evWRKoM + GGourqS + lRtrwsc + QXxYrwP + JcMKQrL + CUtOdXg + HRMRwCV + qBhTIyT + pOZxfhe + ZHsRshu + wmItRFG + XERKEYl + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        float zrvlytylz4 = 93.93f;
        byte moxktzwbem3 = 88;
        short wkbtqvbmh2 = 73;
        long xnxuaqke1 = 7L;
        byte opbakntyvj0 = 72;
        char rwrizrkzf1 = 78;
        long gznpkvrj0 = 3L;
        long tjbxqezl1 = 45L;
        byte uevidpfgl0 = 66;
        short pzwzcii3 = 37;
        float zeeuajw2 = 14.14f;
        short qduopug1 = 99;
        short hrsxxzy0 = 5;
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            if (GatorManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            bUiyygjR(hrsxxzy0, qduopug1, zeeuajw2, pzwzcii3);
            kXuiLjFv(uevidpfgl0, tjbxqezl1);
            kXuiLjFv(uevidpfgl0, tjbxqezl1);
            kXuiLjFv(uevidpfgl0, tjbxqezl1);
            kXuiLjFv(uevidpfgl0, tjbxqezl1);
            bnusSExQ(gznpkvrj0, rwrizrkzf1);
            this.doStartMainService();
            foACZGGV(opbakntyvj0, xnxuaqke1, wkbtqvbmh2, moxktzwbem3, zrvlytylz4);
            bUiyygjR(hrsxxzy0, qduopug1, zeeuajw2, pzwzcii3);
            bUiyygjR(hrsxxzy0, qduopug1, zeeuajw2, pzwzcii3);
            foACZGGV(opbakntyvj0, xnxuaqke1, wkbtqvbmh2, moxktzwbem3, zrvlytylz4);
            bUiyygjR(hrsxxzy0, qduopug1, zeeuajw2, pzwzcii3);
            kXuiLjFv(uevidpfgl0, tjbxqezl1);
            this.doBindMainService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                if (GatorManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void OlOEfZAE(boolean usrelcqcz0, short bfxteplba1, short pllfpls2, short obfkxkxav3, byte zzlmycoun4) {
        byte zzlmycoun4a = zzlmycoun4;
        short obfkxkxav3a = obfkxkxav3;
        short pllfpls2a = pllfpls2;
        short bfxteplba1a = bfxteplba1;
        boolean usrelcqcz0a = usrelcqcz0;
        new StringBuffer("OlOEfZAE" + pllfpls2a + usrelcqcz0a + zzlmycoun4a + bfxteplba1a + obfkxkxav3a + "OlOEfZAE" + eHOjWdQ + CUtOdXg + evWRKoM + lRtrwsc + ljyGkuB + HRMRwCV + aDZMFgk + QXxYrwP + XERKEYl + ZHsRshu + qBhTIyT + wmItRFG + GGourqS + pOZxfhe + JcMKQrL + "");
    }

    //垃圾方法
    private void zEAQFIXJ(short bfukgubr0, char kfwsxybc1, byte ukwuyoxc2, float wqixlprtki3, byte krhczehx4) {
        byte krhczehx4a = krhczehx4;
        float wqixlprtki3a = wqixlprtki3;
        byte ukwuyoxc2a = ukwuyoxc2;
        char kfwsxybc1a = kfwsxybc1;
        short bfukgubr0a = bfukgubr0;
        new WeakReference("zEAQFIXJ" + krhczehx4a + kfwsxybc1a + bfukgubr0a + ukwuyoxc2a + wqixlprtki3a + "zEAQFIXJ" + GGourqS + evWRKoM + ZHsRshu + JcMKQrL + CUtOdXg + HRMRwCV + pOZxfhe + eHOjWdQ + ljyGkuB + wmItRFG + aDZMFgk + QXxYrwP + XERKEYl + lRtrwsc + qBhTIyT + "");
    }

    //垃圾方法
    private void vUNrxcQo(long yfnmfanbip0, int zuhgpmngk1, float zxdivmcl2, float hgghirit3, float vgqceru4) {
        float vgqceru4a = vgqceru4;
        float hgghirit3a = hgghirit3;
        float zxdivmcl2a = zxdivmcl2;
        int zuhgpmngk1a = zuhgpmngk1;
        long yfnmfanbip0a = yfnmfanbip0;
    }

    //垃圾方法
    private void ZtFgldRt(short davcgos0, long yclcvbmmj1, char ssxxpyo2, float utzykouyy3) {
        float utzykouyy3a = utzykouyy3;
        char ssxxpyo2a = ssxxpyo2;
        long yclcvbmmj1a = yclcvbmmj1;
        short davcgos0a = davcgos0;
        new String("ZtFgldRt" + ssxxpyo2a + yclcvbmmj1a + utzykouyy3a + davcgos0a + "ZtFgldRt" + qBhTIyT + HRMRwCV + CUtOdXg + eHOjWdQ + pOZxfhe + GGourqS + aDZMFgk + XERKEYl + wmItRFG + JcMKQrL + ljyGkuB + QXxYrwP + evWRKoM + ZHsRshu + lRtrwsc + "");
    }

    private void doStartMainService() {
        float utzykouyy3 = 45.45f;
        char ssxxpyo2 = 42;
        long yclcvbmmj1 = 74L;
        short davcgos0 = 76;
        float vgqceru4 = 24.24f;
        float hgghirit3 = 9.9f;
        float zxdivmcl2 = 69.69f;
        int zuhgpmngk1 = 69;
        long yfnmfanbip0 = 12L;
        byte krhczehx4 = 92;
        float wqixlprtki3 = 48.48f;
        byte ukwuyoxc2 = 22;
        char kfwsxybc1 = 4;
        short bfukgubr0 = 17;
        byte zzlmycoun4 = 41;
        short obfkxkxav3 = 7;
        short pllfpls2 = 83;
        short bfxteplba1 = 10;
        boolean usrelcqcz0 = true;
        ZtFgldRt(davcgos0, yclcvbmmj1, ssxxpyo2, utzykouyy3);
        OlOEfZAE(usrelcqcz0, bfxteplba1, pllfpls2, obfkxkxav3, zzlmycoun4);
        ZtFgldRt(davcgos0, yclcvbmmj1, ssxxpyo2, utzykouyy3);
        vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
        OlOEfZAE(usrelcqcz0, bfxteplba1, pllfpls2, obfkxkxav3, zzlmycoun4);
        try {
            OlOEfZAE(usrelcqcz0, bfxteplba1, pllfpls2, obfkxkxav3, zzlmycoun4);
            ZtFgldRt(davcgos0, yclcvbmmj1, ssxxpyo2, utzykouyy3);
            zEAQFIXJ(bfukgubr0, kfwsxybc1, ukwuyoxc2, wqixlprtki3, krhczehx4);
            OlOEfZAE(usrelcqcz0, bfxteplba1, pllfpls2, obfkxkxav3, zzlmycoun4);
            vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
            vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
            vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
            OlOEfZAE(usrelcqcz0, bfxteplba1, pllfpls2, obfkxkxav3, zzlmycoun4);
            Intent intent = new Intent(this, Gator1Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            zEAQFIXJ(bfukgubr0, kfwsxybc1, ukwuyoxc2, wqixlprtki3, krhczehx4);
            vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
            vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
            ZtFgldRt(davcgos0, yclcvbmmj1, ssxxpyo2, utzykouyy3);
            OlOEfZAE(usrelcqcz0, bfxteplba1, pllfpls2, obfkxkxav3, zzlmycoun4);
            ZtFgldRt(davcgos0, yclcvbmmj1, ssxxpyo2, utzykouyy3);
            zEAQFIXJ(bfukgubr0, kfwsxybc1, ukwuyoxc2, wqixlprtki3, krhczehx4);
            vUNrxcQo(yfnmfanbip0, zuhgpmngk1, zxdivmcl2, hgghirit3, vgqceru4);
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (GatorManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾变量
    private double lRtrwsc = 4.4;

    // 绑定状态标志
    private boolean mIsBound = false;

    //垃圾方法
    private void KMcvnuxi(float zxdahblg0, int pjjzdfzd1) {
        int pjjzdfzd1a = pjjzdfzd1;
        float zxdahblg0a = zxdahblg0;
        new StringReader("KMcvnuxi" + pjjzdfzd1a + zxdahblg0a + "KMcvnuxi" + ljyGkuB + QXxYrwP + XERKEYl + HRMRwCV + ZHsRshu + lRtrwsc + eHOjWdQ + wmItRFG + JcMKQrL + qBhTIyT + evWRKoM + aDZMFgk + CUtOdXg + pOZxfhe + GGourqS + "");
    }

    //垃圾方法
    private void mprcfSkY(boolean qysrkysxb0, double milwwkt1, double jrntasjb2, boolean beebknwfu3, int rxycotqm4) {
        int rxycotqm4a = rxycotqm4;
        boolean beebknwfu3a = beebknwfu3;
        double jrntasjb2a = jrntasjb2;
        double milwwkt1a = milwwkt1;
        boolean qysrkysxb0a = qysrkysxb0;
        new WeakReference("mprcfSkY" + beebknwfu3a + jrntasjb2a + qysrkysxb0a + milwwkt1a + rxycotqm4a + "mprcfSkY" + lRtrwsc + wmItRFG + XERKEYl + ZHsRshu + JcMKQrL + ljyGkuB + aDZMFgk + QXxYrwP + eHOjWdQ + evWRKoM + GGourqS + HRMRwCV + qBhTIyT + pOZxfhe + CUtOdXg + "");
    }

    //垃圾方法
    private void QyiKvTRN(byte cggntflglg0, char rnpappbaf1, short deubxjxavz2, short pyxkeswdql3, long fofhnefatz4) {
        long fofhnefatz4a = fofhnefatz4;
        short pyxkeswdql3a = pyxkeswdql3;
        short deubxjxavz2a = deubxjxavz2;
        char rnpappbaf1a = rnpappbaf1;
        byte cggntflglg0a = cggntflglg0;
        new Thread("QyiKvTRN" + deubxjxavz2a + cggntflglg0a + pyxkeswdql3a + rnpappbaf1a + fofhnefatz4a + "QyiKvTRN" + qBhTIyT + CUtOdXg + ZHsRshu + aDZMFgk + eHOjWdQ + lRtrwsc + GGourqS + ljyGkuB + pOZxfhe + JcMKQrL + HRMRwCV + XERKEYl + wmItRFG + QXxYrwP + evWRKoM + "");
    }

    //垃圾方法
    private void ZdRErAQQ(byte onioila0, boolean aelhxbvvso1, long aaakfla2, boolean llmkpttdgq3, double kukovpmz4) {
        double kukovpmz4a = kukovpmz4;
        boolean llmkpttdgq3a = llmkpttdgq3;
        long aaakfla2a = aaakfla2;
        boolean aelhxbvvso1a = aelhxbvvso1;
        byte onioila0a = onioila0;
        new StringReader("ZdRErAQQ" + llmkpttdgq3a + kukovpmz4a + aaakfla2a + onioila0a + aelhxbvvso1a + "ZdRErAQQ" + GGourqS + XERKEYl + HRMRwCV + ZHsRshu + evWRKoM + aDZMFgk + CUtOdXg + qBhTIyT + ljyGkuB + wmItRFG + QXxYrwP + JcMKQrL + lRtrwsc + eHOjWdQ + pOZxfhe + "");
    }

    //垃圾方法
    private void QQrypgnY(float qoqftrfy0, double tktpwhga1, long dzuntyghzg2, boolean vifgevlj3) {
        boolean vifgevlj3a = vifgevlj3;
        long dzuntyghzg2a = dzuntyghzg2;
        double tktpwhga1a = tktpwhga1;
        float qoqftrfy0a = qoqftrfy0;
    }

    //垃圾方法
    private void fvfKNnnO(char mougyyrl0) {
        char mougyyrl0a = mougyyrl0;
        new AttributedString("fvfKNnnO" + mougyyrl0a + "fvfKNnnO" + qBhTIyT + CUtOdXg + XERKEYl + evWRKoM + pOZxfhe + lRtrwsc + wmItRFG + HRMRwCV + JcMKQrL + eHOjWdQ + aDZMFgk + ZHsRshu + GGourqS + ljyGkuB + QXxYrwP + "");
    }

    //垃圾方法
    private void ahdyjRIK(double wbozpaikwm0) {
        double wbozpaikwm0a = wbozpaikwm0;
        new String("ahdyjRIK" + wbozpaikwm0a + "ahdyjRIK" + ljyGkuB + XERKEYl + qBhTIyT + eHOjWdQ + JcMKQrL + evWRKoM + pOZxfhe + CUtOdXg + QXxYrwP + HRMRwCV + lRtrwsc + ZHsRshu + aDZMFgk + wmItRFG + GGourqS + "");
    }

    //垃圾方法
    private void aChoAWEF(boolean bqulchom0, double suogdhrvui1) {
        double suogdhrvui1a = suogdhrvui1;
        boolean bqulchom0a = bqulchom0;
        new Intent("aChoAWEF" + suogdhrvui1a + bqulchom0a + "aChoAWEF" + aDZMFgk + CUtOdXg + eHOjWdQ + HRMRwCV + evWRKoM + QXxYrwP + wmItRFG + ljyGkuB + ZHsRshu + GGourqS + JcMKQrL + pOZxfhe + qBhTIyT + lRtrwsc + XERKEYl + "");
    }

    private void doBindMainService() {
        double suogdhrvui1 = 4.4;
        boolean bqulchom0 = true;
        double wbozpaikwm0 = 27.27;
        char mougyyrl0 = 39;
        boolean vifgevlj3 = true;
        long dzuntyghzg2 = 53L;
        double tktpwhga1 = 41.41;
        float qoqftrfy0 = 63.63f;
        double kukovpmz4 = 20.20;
        boolean llmkpttdgq3 = true;
        long aaakfla2 = 29L;
        boolean aelhxbvvso1 = false;
        byte onioila0 = 47;
        long fofhnefatz4 = 79L;
        short pyxkeswdql3 = 76;
        short deubxjxavz2 = 1;
        char rnpappbaf1 = 58;
        byte cggntflglg0 = 43;
        int rxycotqm4 = 93;
        boolean beebknwfu3 = true;
        double jrntasjb2 = 77.77;
        double milwwkt1 = 64.64;
        boolean qysrkysxb0 = true;
        int pjjzdfzd1 = 11;
        float zxdahblg0 = 16.16f;
        aChoAWEF(bqulchom0, suogdhrvui1);
        ZdRErAQQ(onioila0, aelhxbvvso1, aaakfla2, llmkpttdgq3, kukovpmz4);
        fvfKNnnO(mougyyrl0);
        KMcvnuxi(zxdahblg0, pjjzdfzd1);
        KMcvnuxi(zxdahblg0, pjjzdfzd1);
        ZdRErAQQ(onioila0, aelhxbvvso1, aaakfla2, llmkpttdgq3, kukovpmz4);
        KMcvnuxi(zxdahblg0, pjjzdfzd1);
        QQrypgnY(qoqftrfy0, tktpwhga1, dzuntyghzg2, vifgevlj3);
        KMcvnuxi(zxdahblg0, pjjzdfzd1);
        mprcfSkY(qysrkysxb0, milwwkt1, jrntasjb2, beebknwfu3, rxycotqm4);
        if (GatorManager.isDebug) {
            mprcfSkY(qysrkysxb0, milwwkt1, jrntasjb2, beebknwfu3, rxycotqm4);
            KMcvnuxi(zxdahblg0, pjjzdfzd1);
            QQrypgnY(qoqftrfy0, tktpwhga1, dzuntyghzg2, vifgevlj3);
            ZdRErAQQ(onioila0, aelhxbvvso1, aaakfla2, llmkpttdgq3, kukovpmz4);
            ZdRErAQQ(onioila0, aelhxbvvso1, aaakfla2, llmkpttdgq3, kukovpmz4);
            QQrypgnY(qoqftrfy0, tktpwhga1, dzuntyghzg2, vifgevlj3);
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        KMcvnuxi(zxdahblg0, pjjzdfzd1);
        QQrypgnY(qoqftrfy0, tktpwhga1, dzuntyghzg2, vifgevlj3);
        ahdyjRIK(wbozpaikwm0);
        ahdyjRIK(wbozpaikwm0);
        fvfKNnnO(mougyyrl0);
        try {
            mIsBound = this.bindService(new Intent(this, Gator1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (GatorManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void raUdXjzR(char qzdqmxwe0, short mpgirvq1) {
        short mpgirvq1a = mpgirvq1;
        char qzdqmxwe0a = qzdqmxwe0;
        Log.e("raUdXjzR", "raUdXjzR" + mpgirvq1a + qzdqmxwe0a + "raUdXjzR" + aDZMFgk + XERKEYl + CUtOdXg + ZHsRshu + GGourqS + QXxYrwP + ljyGkuB + pOZxfhe + evWRKoM + qBhTIyT + HRMRwCV + wmItRFG + JcMKQrL + eHOjWdQ + lRtrwsc + "");
    }

    //垃圾方法
    private void yBkguGTd(double ffjfent0, char ufrvbrzlo1, double qdqeart2, int ipgbwogkz3) {
        int ipgbwogkz3a = ipgbwogkz3;
        double qdqeart2a = qdqeart2;
        char ufrvbrzlo1a = ufrvbrzlo1;
        double ffjfent0a = ffjfent0;
        new AttributedString("yBkguGTd" + qdqeart2a + ffjfent0a + ufrvbrzlo1a + ipgbwogkz3a + "yBkguGTd" + pOZxfhe + GGourqS + HRMRwCV + aDZMFgk + ZHsRshu + qBhTIyT + lRtrwsc + XERKEYl + eHOjWdQ + CUtOdXg + evWRKoM + JcMKQrL + QXxYrwP + wmItRFG + ljyGkuB + "");
    }

    //垃圾方法
    private void UAgoyfAR(float fcnvmla0, long zvtbvarkut1, byte tkkdtordwv2, long hwupxmp3, long cvpztyq4) {
        long cvpztyq4a = cvpztyq4;
        long hwupxmp3a = hwupxmp3;
        byte tkkdtordwv2a = tkkdtordwv2;
        long zvtbvarkut1a = zvtbvarkut1;
        float fcnvmla0a = fcnvmla0;
        new String("UAgoyfAR" + cvpztyq4a + fcnvmla0a + tkkdtordwv2a + zvtbvarkut1a + hwupxmp3a + "UAgoyfAR" + evWRKoM + QXxYrwP + aDZMFgk + JcMKQrL + ZHsRshu + XERKEYl + GGourqS + HRMRwCV + pOZxfhe + wmItRFG + lRtrwsc + ljyGkuB + qBhTIyT + eHOjWdQ + CUtOdXg + "");
    }

    //垃圾方法
    private void ZZRHHsBj(short pwkhvmlx0) {
        short pwkhvmlx0a = pwkhvmlx0;
        Log.i("ZZRHHsBj", "ZZRHHsBj" + pwkhvmlx0a + "ZZRHHsBj" + ljyGkuB + HRMRwCV + pOZxfhe + CUtOdXg + QXxYrwP + lRtrwsc + XERKEYl + GGourqS + ZHsRshu + JcMKQrL + aDZMFgk + eHOjWdQ + wmItRFG + qBhTIyT + evWRKoM + "");
    }

    //垃圾方法
    private void gBvxVabl(int jqqrpzde0, byte bixkvfern1, float vrrmfmvhpe2, int yovrpzcitv3) {
        int yovrpzcitv3a = yovrpzcitv3;
        float vrrmfmvhpe2a = vrrmfmvhpe2;
        byte bixkvfern1a = bixkvfern1;
        int jqqrpzde0a = jqqrpzde0;
        new StringBuffer("gBvxVabl" + yovrpzcitv3a + vrrmfmvhpe2a + bixkvfern1a + jqqrpzde0a + "gBvxVabl" + JcMKQrL + aDZMFgk + qBhTIyT + GGourqS + QXxYrwP + wmItRFG + ljyGkuB + XERKEYl + ZHsRshu + HRMRwCV + pOZxfhe + evWRKoM + CUtOdXg + eHOjWdQ + lRtrwsc + "");
    }

    //垃圾方法
    private void AcTTFUMo(byte nslhoovxsi0, char whjdsxqgoy1, byte rhjbdqqbho2) {
        byte rhjbdqqbho2a = rhjbdqqbho2;
        char whjdsxqgoy1a = whjdsxqgoy1;
        byte nslhoovxsi0a = nslhoovxsi0;
        Log.e("AcTTFUMo", "AcTTFUMo" + nslhoovxsi0a + whjdsxqgoy1a + rhjbdqqbho2a + "AcTTFUMo" + lRtrwsc + HRMRwCV + JcMKQrL + ljyGkuB + pOZxfhe + GGourqS + eHOjWdQ + QXxYrwP + qBhTIyT + evWRKoM + XERKEYl + wmItRFG + ZHsRshu + CUtOdXg + aDZMFgk + "");
    }

    //垃圾方法
    private void BsoJqfNI(float imutdmv0, short vgmcaiz1, byte fdudxlhpq2, boolean vmiceldzj3, int mmgzggffmu4) {
        int mmgzggffmu4a = mmgzggffmu4;
        boolean vmiceldzj3a = vmiceldzj3;
        byte fdudxlhpq2a = fdudxlhpq2;
        short vgmcaiz1a = vgmcaiz1;
        float imutdmv0a = imutdmv0;
        new String("BsoJqfNI" + imutdmv0a + vmiceldzj3a + mmgzggffmu4a + vgmcaiz1a + fdudxlhpq2a + "BsoJqfNI" + wmItRFG + CUtOdXg + qBhTIyT + XERKEYl + JcMKQrL + ljyGkuB + QXxYrwP + ZHsRshu + lRtrwsc + GGourqS + HRMRwCV + evWRKoM + eHOjWdQ + pOZxfhe + aDZMFgk + "");
    }

    //垃圾方法
    private void yMRWDsuF(long ilnnaafouq0) {
        long ilnnaafouq0a = ilnnaafouq0;
        TextUtils.isEmpty("yMRWDsuF" + ilnnaafouq0a + "yMRWDsuF" + ljyGkuB + evWRKoM + QXxYrwP + GGourqS + ZHsRshu + eHOjWdQ + HRMRwCV + JcMKQrL + lRtrwsc + aDZMFgk + qBhTIyT + CUtOdXg + wmItRFG + XERKEYl + pOZxfhe + "");
    }

    //垃圾方法
    private void raVlcTDQ(int onbygcnb0, float ksxmpfq1) {
        float ksxmpfq1a = ksxmpfq1;
        int onbygcnb0a = onbygcnb0;
    }

    //垃圾方法
    private void ahFrbeDC(int dvdvdzbigp0, long spsrizhao1, short swbqkisnc2) {
        short swbqkisnc2a = swbqkisnc2;
        long spsrizhao1a = spsrizhao1;
        int dvdvdzbigp0a = dvdvdzbigp0;
        new File("ahFrbeDC" + spsrizhao1a + dvdvdzbigp0a + swbqkisnc2a + "ahFrbeDC" + GGourqS + eHOjWdQ + lRtrwsc + qBhTIyT + wmItRFG + pOZxfhe + XERKEYl + evWRKoM + CUtOdXg + JcMKQrL + aDZMFgk + HRMRwCV + QXxYrwP + ljyGkuB + ZHsRshu + "");
    }

    //垃圾方法
    private void wFwTDJgP(boolean ecyvpgkpai0, boolean fsmbdohlif1, char phzfnuloge2, byte howukefqd3, double egeotvsi4) {
        double egeotvsi4a = egeotvsi4;
        byte howukefqd3a = howukefqd3;
        char phzfnuloge2a = phzfnuloge2;
        boolean fsmbdohlif1a = fsmbdohlif1;
        boolean ecyvpgkpai0a = ecyvpgkpai0;
        new AttributedString("wFwTDJgP" + ecyvpgkpai0a + egeotvsi4a + fsmbdohlif1a + howukefqd3a + phzfnuloge2a + "wFwTDJgP" + XERKEYl + qBhTIyT + evWRKoM + JcMKQrL + ljyGkuB + pOZxfhe + eHOjWdQ + QXxYrwP + wmItRFG + GGourqS + CUtOdXg + lRtrwsc + HRMRwCV + ZHsRshu + aDZMFgk + "");
    }

    //垃圾方法
    private void NIQLHSgn(byte ulbdmyh0) {
        byte ulbdmyh0a = ulbdmyh0;
        TextUtils.isDigitsOnly("NIQLHSgn" + ulbdmyh0a + "NIQLHSgn" + wmItRFG + pOZxfhe + XERKEYl + HRMRwCV + JcMKQrL + lRtrwsc + ZHsRshu + GGourqS + eHOjWdQ + aDZMFgk + ljyGkuB + QXxYrwP + CUtOdXg + qBhTIyT + evWRKoM + "");
    }

    //垃圾方法
    private void gIuySeHs(double zrxhnhor0, char nafveue1) {
        char nafveue1a = nafveue1;
        double zrxhnhor0a = zrxhnhor0;
        new StringBuffer("gIuySeHs" + nafveue1a + zrxhnhor0a + "gIuySeHs" + pOZxfhe + JcMKQrL + wmItRFG + ZHsRshu + CUtOdXg + GGourqS + evWRKoM + HRMRwCV + QXxYrwP + XERKEYl + aDZMFgk + qBhTIyT + ljyGkuB + lRtrwsc + eHOjWdQ + "");
    }

    //垃圾方法
    private void FmiKtAFJ(byte nagvjdc0, double qgbmbzgl1, int lqqtsuc2, long zldtujinh3) {
        long zldtujinh3a = zldtujinh3;
        int lqqtsuc2a = lqqtsuc2;
        double qgbmbzgl1a = qgbmbzgl1;
        byte nagvjdc0a = nagvjdc0;
        new Intent("FmiKtAFJ" + lqqtsuc2a + zldtujinh3a + qgbmbzgl1a + nagvjdc0a + "FmiKtAFJ" + JcMKQrL + evWRKoM + QXxYrwP + qBhTIyT + CUtOdXg + lRtrwsc + eHOjWdQ + ZHsRshu + XERKEYl + pOZxfhe + ljyGkuB + HRMRwCV + GGourqS + wmItRFG + aDZMFgk + "");
    }

    //垃圾方法
    private void pCyIwgFS(short oopidlrx0, long xhkwfvb1, short jkmixwye2) {
        short jkmixwye2a = jkmixwye2;
        long xhkwfvb1a = xhkwfvb1;
        short oopidlrx0a = oopidlrx0;
        new AttributedString("pCyIwgFS" + jkmixwye2a + xhkwfvb1a + oopidlrx0a + "pCyIwgFS" + ljyGkuB + wmItRFG + JcMKQrL + HRMRwCV + GGourqS + eHOjWdQ + aDZMFgk + lRtrwsc + evWRKoM + QXxYrwP + qBhTIyT + ZHsRshu + CUtOdXg + pOZxfhe + XERKEYl + "");
    }

    //垃圾方法
    private void XnVnhTeS(int pulkkuvfv0) {
        int pulkkuvfv0a = pulkkuvfv0;
        new StringBuffer("XnVnhTeS" + pulkkuvfv0a + "XnVnhTeS" + QXxYrwP + XERKEYl + wmItRFG + ljyGkuB + qBhTIyT + evWRKoM + aDZMFgk + CUtOdXg + JcMKQrL + lRtrwsc + pOZxfhe + ZHsRshu + eHOjWdQ + GGourqS + HRMRwCV + "");
    }

    //垃圾方法
    private void hnacHhuR(long kuggowe0, int xfgmfsfbq1, double oqzvztxtuq2) {
        double oqzvztxtuq2a = oqzvztxtuq2;
        int xfgmfsfbq1a = xfgmfsfbq1;
        long kuggowe0a = kuggowe0;
        Log.e("hnacHhuR", "hnacHhuR" + oqzvztxtuq2a + xfgmfsfbq1a + kuggowe0a + "hnacHhuR" + wmItRFG + ZHsRshu + CUtOdXg + XERKEYl + aDZMFgk + GGourqS + eHOjWdQ + ljyGkuB + pOZxfhe + QXxYrwP + evWRKoM + qBhTIyT + JcMKQrL + HRMRwCV + lRtrwsc + "");
    }

    //垃圾方法
    private void ajYGcIKa(short bimxkddbza0, byte hzuaydpg1, int uycdyegn2) {
        int uycdyegn2a = uycdyegn2;
        byte hzuaydpg1a = hzuaydpg1;
        short bimxkddbza0a = bimxkddbza0;
        Log.i("ajYGcIKa", "ajYGcIKa" + hzuaydpg1a + uycdyegn2a + bimxkddbza0a + "ajYGcIKa" + HRMRwCV + JcMKQrL + evWRKoM + lRtrwsc + ZHsRshu + QXxYrwP + ljyGkuB + qBhTIyT + wmItRFG + XERKEYl + GGourqS + CUtOdXg + eHOjWdQ + pOZxfhe + aDZMFgk + "");
    }

    //垃圾方法
    private void nAHvCVQZ(double zeswjljuo0) {
        double zeswjljuo0a = zeswjljuo0;
        new Thread("nAHvCVQZ" + zeswjljuo0a + "nAHvCVQZ" + lRtrwsc + ljyGkuB + pOZxfhe + evWRKoM + XERKEYl + QXxYrwP + ZHsRshu + CUtOdXg + qBhTIyT + HRMRwCV + GGourqS + aDZMFgk + eHOjWdQ + JcMKQrL + wmItRFG + "");
    }

    //垃圾方法
    private void gzaTatOj(float ucosjok0, int pwqitwhych1, float notktirs2, int htplwxwe3, double vtxaedrgo4) {
        double vtxaedrgo4a = vtxaedrgo4;
        int htplwxwe3a = htplwxwe3;
        float notktirs2a = notktirs2;
        int pwqitwhych1a = pwqitwhych1;
        float ucosjok0a = ucosjok0;
        TextUtils.isEmpty("gzaTatOj" + pwqitwhych1a + htplwxwe3a + vtxaedrgo4a + ucosjok0a + notktirs2a + "gzaTatOj" + pOZxfhe + evWRKoM + eHOjWdQ + lRtrwsc + QXxYrwP + GGourqS + JcMKQrL + HRMRwCV + ljyGkuB + wmItRFG + ZHsRshu + CUtOdXg + XERKEYl + aDZMFgk + qBhTIyT + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        double vtxaedrgo4 = 38.38;
        int htplwxwe3 = 68;
        float notktirs2 = 58.58f;
        int pwqitwhych1 = 38;
        float ucosjok0 = 71.71f;
        double zeswjljuo0 = 95.95;
        int uycdyegn2 = 64;
        byte hzuaydpg1 = 60;
        short bimxkddbza0 = 92;
        double oqzvztxtuq2 = 25.25;
        int xfgmfsfbq1 = 13;
        long kuggowe0 = 74L;
        int pulkkuvfv0 = 90;
        short jkmixwye2 = 92;
        long xhkwfvb1 = 20L;
        short oopidlrx0 = 95;
        long zldtujinh3 = 11L;
        int lqqtsuc2 = 4;
        double qgbmbzgl1 = 83.83;
        byte nagvjdc0 = 80;
        char nafveue1 = 88;
        double zrxhnhor0 = 90.90;
        byte ulbdmyh0 = 77;
        double egeotvsi4 = 60.60;
        byte howukefqd3 = 32;
        char phzfnuloge2 = 25;
        boolean fsmbdohlif1 = false;
        boolean ecyvpgkpai0 = false;
        short swbqkisnc2 = 27;
        long spsrizhao1 = 44L;
        int dvdvdzbigp0 = 7;
        float ksxmpfq1 = 55.55f;
        int onbygcnb0 = 86;
        long ilnnaafouq0 = 63L;
        int mmgzggffmu4 = 53;
        boolean vmiceldzj3 = false;
        byte fdudxlhpq2 = 40;
        short vgmcaiz1 = 21;
        float imutdmv0 = 39.39f;
        byte rhjbdqqbho2 = 5;
        char whjdsxqgoy1 = 29;
        byte nslhoovxsi0 = 11;
        int yovrpzcitv3 = 74;
        float vrrmfmvhpe2 = 34.34f;
        byte bixkvfern1 = 28;
        int jqqrpzde0 = 6;
        short pwkhvmlx0 = 61;
        long cvpztyq4 = 40L;
        long hwupxmp3 = 67L;
        byte tkkdtordwv2 = 16;
        long zvtbvarkut1 = 65L;
        float fcnvmla0 = 6.6f;
        int ipgbwogkz3 = 49;
        double qdqeart2 = 71.71;
        char ufrvbrzlo1 = 61;
        double ffjfent0 = 74.74;
        short mpgirvq1 = 51;
        char qzdqmxwe0 = 42;
        hnacHhuR(kuggowe0, xfgmfsfbq1, oqzvztxtuq2);
        UAgoyfAR(fcnvmla0, zvtbvarkut1, tkkdtordwv2, hwupxmp3, cvpztyq4);
        AcTTFUMo(nslhoovxsi0, whjdsxqgoy1, rhjbdqqbho2);
        ZZRHHsBj(pwkhvmlx0);
        NIQLHSgn(ulbdmyh0);
        mainBinder = null;
        yBkguGTd(ffjfent0, ufrvbrzlo1, qdqeart2, ipgbwogkz3);
        FmiKtAFJ(nagvjdc0, qgbmbzgl1, lqqtsuc2, zldtujinh3);
        yMRWDsuF(ilnnaafouq0);
        pCyIwgFS(oopidlrx0, xhkwfvb1, jkmixwye2);
        XnVnhTeS(pulkkuvfv0);
        gBvxVabl(jqqrpzde0, bixkvfern1, vrrmfmvhpe2, yovrpzcitv3);
        NIQLHSgn(ulbdmyh0);
        gIuySeHs(zrxhnhor0, nafveue1);
        wFwTDJgP(ecyvpgkpai0, fsmbdohlif1, phzfnuloge2, howukefqd3, egeotvsi4);
        gBvxVabl(jqqrpzde0, bixkvfern1, vrrmfmvhpe2, yovrpzcitv3);
        if (GatorManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        NIQLHSgn(ulbdmyh0);
        pCyIwgFS(oopidlrx0, xhkwfvb1, jkmixwye2);
        yMRWDsuF(ilnnaafouq0);
        UAgoyfAR(fcnvmla0, zvtbvarkut1, tkkdtordwv2, hwupxmp3, cvpztyq4);
        pCyIwgFS(oopidlrx0, xhkwfvb1, jkmixwye2);
        ahFrbeDC(dvdvdzbigp0, spsrizhao1, swbqkisnc2);
        UAgoyfAR(fcnvmla0, zvtbvarkut1, tkkdtordwv2, hwupxmp3, cvpztyq4);
        isReTryBinding = true;
        raUdXjzR(qzdqmxwe0, mpgirvq1);
        raVlcTDQ(onbygcnb0, ksxmpfq1);
        gzaTatOj(ucosjok0, pwqitwhych1, notktirs2, htplwxwe3, vtxaedrgo4);
        gBvxVabl(jqqrpzde0, bixkvfern1, vrrmfmvhpe2, yovrpzcitv3);
        hnacHhuR(kuggowe0, xfgmfsfbq1, oqzvztxtuq2);
        ahFrbeDC(dvdvdzbigp0, spsrizhao1, swbqkisnc2);
        hnacHhuR(kuggowe0, xfgmfsfbq1, oqzvztxtuq2);
        gBvxVabl(jqqrpzde0, bixkvfern1, vrrmfmvhpe2, yovrpzcitv3);
        ZZRHHsBj(pwkhvmlx0);
        this.startMainService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void hLavRPpI(double bmnjiwjzq0, long wnclbrus1, float xwrzgndpy2) {
        float xwrzgndpy2a = xwrzgndpy2;
        long wnclbrus1a = wnclbrus1;
        double bmnjiwjzq0a = bmnjiwjzq0;
        TextUtils.isEmpty("hLavRPpI" + xwrzgndpy2a + wnclbrus1a + bmnjiwjzq0a + "hLavRPpI" + qBhTIyT + CUtOdXg + evWRKoM + JcMKQrL + GGourqS + ljyGkuB + lRtrwsc + eHOjWdQ + aDZMFgk + HRMRwCV + pOZxfhe + XERKEYl + wmItRFG + ZHsRshu + QXxYrwP + "");
    }

    //垃圾方法
    private void wVNLdIJe(byte zefjxvciu0, short cssebyfpg1, short jahwximh2) {
        short jahwximh2a = jahwximh2;
        short cssebyfpg1a = cssebyfpg1;
        byte zefjxvciu0a = zefjxvciu0;
        new StringReader("wVNLdIJe" + cssebyfpg1a + zefjxvciu0a + jahwximh2a + "wVNLdIJe" + GGourqS + ZHsRshu + aDZMFgk + HRMRwCV + QXxYrwP + lRtrwsc + eHOjWdQ + XERKEYl + evWRKoM + wmItRFG + JcMKQrL + pOZxfhe + qBhTIyT + CUtOdXg + ljyGkuB + "");
    }

    //垃圾方法
    private void ZKHNYiKc(char dcbnmqimb0, boolean lvvogsonn1, double evpayqawjn2, short rnorxatmm3) {
        short rnorxatmm3a = rnorxatmm3;
        double evpayqawjn2a = evpayqawjn2;
        boolean lvvogsonn1a = lvvogsonn1;
        char dcbnmqimb0a = dcbnmqimb0;
        new AttributedString("ZKHNYiKc" + lvvogsonn1a + rnorxatmm3a + evpayqawjn2a + dcbnmqimb0a + "ZKHNYiKc" + wmItRFG + lRtrwsc + aDZMFgk + ZHsRshu + eHOjWdQ + qBhTIyT + CUtOdXg + pOZxfhe + XERKEYl + JcMKQrL + QXxYrwP + GGourqS + HRMRwCV + evWRKoM + ljyGkuB + "");
    }

    //垃圾方法
    private void JTcYsAvt(long biityjm0, char zzgkrhyxrr1) {
        char zzgkrhyxrr1a = zzgkrhyxrr1;
        long biityjm0a = biityjm0;
        Log.e("JTcYsAvt", "JTcYsAvt" + zzgkrhyxrr1a + biityjm0a + "JTcYsAvt" + qBhTIyT + QXxYrwP + evWRKoM + lRtrwsc + eHOjWdQ + wmItRFG + ZHsRshu + GGourqS + ljyGkuB + pOZxfhe + CUtOdXg + XERKEYl + JcMKQrL + HRMRwCV + aDZMFgk + "");
    }

    //垃圾方法
    private void xSTsRcGb(float yzfvscqwf0, long ghtifuexdm1, int sfvbfhz2) {
        int sfvbfhz2a = sfvbfhz2;
        long ghtifuexdm1a = ghtifuexdm1;
        float yzfvscqwf0a = yzfvscqwf0;
        new File("xSTsRcGb" + ghtifuexdm1a + sfvbfhz2a + yzfvscqwf0a + "xSTsRcGb" + evWRKoM + wmItRFG + XERKEYl + qBhTIyT + CUtOdXg + pOZxfhe + lRtrwsc + JcMKQrL + ZHsRshu + aDZMFgk + ljyGkuB + eHOjWdQ + HRMRwCV + QXxYrwP + GGourqS + "");
    }

    //垃圾方法
    private void FCUhbHKP(int xdxjebcfoy0) {
        int xdxjebcfoy0a = xdxjebcfoy0;
        TextUtils.isDigitsOnly("FCUhbHKP" + xdxjebcfoy0a + "FCUhbHKP" + JcMKQrL + aDZMFgk + CUtOdXg + eHOjWdQ + ZHsRshu + HRMRwCV + wmItRFG + pOZxfhe + lRtrwsc + XERKEYl + qBhTIyT + ljyGkuB + evWRKoM + QXxYrwP + GGourqS + "");
    }

    //垃圾方法
    private void KCiUdmNK(short dgcsolglj0, byte mejuhsr1) {
        byte mejuhsr1a = mejuhsr1;
        short dgcsolglj0a = dgcsolglj0;
        new StringBuilder("KCiUdmNK" + mejuhsr1a + dgcsolglj0a + "KCiUdmNK" + QXxYrwP + CUtOdXg + HRMRwCV + evWRKoM + eHOjWdQ + wmItRFG + pOZxfhe + qBhTIyT + JcMKQrL + lRtrwsc + XERKEYl + ZHsRshu + aDZMFgk + ljyGkuB + GGourqS + "");
    }

    //垃圾方法
    private void HxbMzWie(float lpqqtjbl0) {
        float lpqqtjbl0a = lpqqtjbl0;
    }

    //垃圾方法
    private void LHccIrYr(long xxordpou0, boolean mpkpcrxhh1, byte uswktbyzg2) {
        byte uswktbyzg2a = uswktbyzg2;
        boolean mpkpcrxhh1a = mpkpcrxhh1;
        long xxordpou0a = xxordpou0;
        new Intent("LHccIrYr" + uswktbyzg2a + mpkpcrxhh1a + xxordpou0a + "LHccIrYr" + ljyGkuB + evWRKoM + CUtOdXg + QXxYrwP + HRMRwCV + GGourqS + aDZMFgk + pOZxfhe + ZHsRshu + JcMKQrL + qBhTIyT + XERKEYl + wmItRFG + eHOjWdQ + lRtrwsc + "");
    }

    //垃圾方法
    private void SaKBFXbI(char cvtdxfm0, double btprlzl1) {
        double btprlzl1a = btprlzl1;
        char cvtdxfm0a = cvtdxfm0;
        new Intent("SaKBFXbI" + cvtdxfm0a + btprlzl1a + "SaKBFXbI" + eHOjWdQ + GGourqS + evWRKoM + lRtrwsc + pOZxfhe + QXxYrwP + aDZMFgk + CUtOdXg + ZHsRshu + XERKEYl + HRMRwCV + JcMKQrL + ljyGkuB + wmItRFG + qBhTIyT + "");
    }

    //垃圾方法
    private void TXqPgWcP(float qfwjgpg0, double fvdtsze1, double hfrvaxjdo2, boolean xqaaidzn3, float diytlwpprr4) {
        float diytlwpprr4a = diytlwpprr4;
        boolean xqaaidzn3a = xqaaidzn3;
        double hfrvaxjdo2a = hfrvaxjdo2;
        double fvdtsze1a = fvdtsze1;
        float qfwjgpg0a = qfwjgpg0;
        new StringBuilder("TXqPgWcP" + hfrvaxjdo2a + qfwjgpg0a + diytlwpprr4a + fvdtsze1a + xqaaidzn3a + "TXqPgWcP" + GGourqS + aDZMFgk + CUtOdXg + lRtrwsc + eHOjWdQ + wmItRFG + qBhTIyT + QXxYrwP + HRMRwCV + evWRKoM + ljyGkuB + JcMKQrL + pOZxfhe + ZHsRshu + XERKEYl + "");
    }

    //垃圾方法
    private void oGvWQHOL(char noouhrrno0, double ajhyyqz1) {
        double ajhyyqz1a = ajhyyqz1;
        char noouhrrno0a = noouhrrno0;
        new Thread("oGvWQHOL" + noouhrrno0a + ajhyyqz1a + "oGvWQHOL" + lRtrwsc + QXxYrwP + evWRKoM + XERKEYl + aDZMFgk + ljyGkuB + wmItRFG + GGourqS + CUtOdXg + eHOjWdQ + JcMKQrL + ZHsRshu + HRMRwCV + qBhTIyT + pOZxfhe + "");
    }

    //垃圾方法
    private void bBsRxAsm(boolean iemaldsddk0, long hcmvpmw1, boolean xomhsxq2, boolean qjwwapumqi3, int srqjuxhgy4) {
        int srqjuxhgy4a = srqjuxhgy4;
        boolean qjwwapumqi3a = qjwwapumqi3;
        boolean xomhsxq2a = xomhsxq2;
        long hcmvpmw1a = hcmvpmw1;
        boolean iemaldsddk0a = iemaldsddk0;
        new StringBuffer("bBsRxAsm" + qjwwapumqi3a + srqjuxhgy4a + hcmvpmw1a + iemaldsddk0a + xomhsxq2a + "bBsRxAsm" + wmItRFG + HRMRwCV + qBhTIyT + eHOjWdQ + ZHsRshu + XERKEYl + aDZMFgk + ljyGkuB + GGourqS + JcMKQrL + lRtrwsc + QXxYrwP + CUtOdXg + pOZxfhe + evWRKoM + "");
    }

    //垃圾方法
    private void vGvXauib(float fmrcpsexx0) {
        float fmrcpsexx0a = fmrcpsexx0;
        new WeakReference("vGvXauib" + fmrcpsexx0a + "vGvXauib" + JcMKQrL + evWRKoM + aDZMFgk + eHOjWdQ + pOZxfhe + XERKEYl + CUtOdXg + GGourqS + HRMRwCV + ljyGkuB + wmItRFG + lRtrwsc + ZHsRshu + QXxYrwP + qBhTIyT + "");
    }

    //垃圾方法
    private void qoQgUZEx(boolean qjjdgorft0) {
        boolean qjjdgorft0a = qjjdgorft0;
        TextUtils.isDigitsOnly("qoQgUZEx" + qjjdgorft0a + "qoQgUZEx" + aDZMFgk + qBhTIyT + eHOjWdQ + CUtOdXg + evWRKoM + wmItRFG + HRMRwCV + ZHsRshu + JcMKQrL + QXxYrwP + XERKEYl + GGourqS + pOZxfhe + ljyGkuB + lRtrwsc + "");
    }

    //垃圾方法
    private void TfLaximk(byte xwcyydcvhe0, byte uxhylzygga1) {
        byte uxhylzygga1a = uxhylzygga1;
        byte xwcyydcvhe0a = xwcyydcvhe0;
        new StringReader("TfLaximk" + xwcyydcvhe0a + uxhylzygga1a + "TfLaximk" + CUtOdXg + JcMKQrL + pOZxfhe + lRtrwsc + qBhTIyT + aDZMFgk + ljyGkuB + QXxYrwP + HRMRwCV + evWRKoM + XERKEYl + ZHsRshu + eHOjWdQ + GGourqS + wmItRFG + "");
    }

    //垃圾方法
    private void cYcCQBDU(short petngmytw0, short kmcczhngq1, int trqufieho2) {
        int trqufieho2a = trqufieho2;
        short kmcczhngq1a = kmcczhngq1;
        short petngmytw0a = petngmytw0;
        new AttributedString("cYcCQBDU" + kmcczhngq1a + petngmytw0a + trqufieho2a + "cYcCQBDU" + wmItRFG + pOZxfhe + QXxYrwP + JcMKQrL + HRMRwCV + evWRKoM + aDZMFgk + qBhTIyT + eHOjWdQ + lRtrwsc + XERKEYl + CUtOdXg + ljyGkuB + ZHsRshu + GGourqS + "");
    }

    //垃圾方法
    private void pCxVPasr(float bibifyfzvq0, byte mgvjnprip1) {
        byte mgvjnprip1a = mgvjnprip1;
        float bibifyfzvq0a = bibifyfzvq0;
        Log.e("pCxVPasr", "pCxVPasr" + bibifyfzvq0a + mgvjnprip1a + "pCxVPasr" + ZHsRshu + QXxYrwP + evWRKoM + XERKEYl + JcMKQrL + aDZMFgk + eHOjWdQ + qBhTIyT + ljyGkuB + CUtOdXg + wmItRFG + HRMRwCV + pOZxfhe + GGourqS + lRtrwsc + "");
    }

    //垃圾方法
    private void kUyKTDQu(long fpqcksq0, int nykwbknlx1, double vculmpj2) {
        double vculmpj2a = vculmpj2;
        int nykwbknlx1a = nykwbknlx1;
        long fpqcksq0a = fpqcksq0;
        new WeakReference("kUyKTDQu" + fpqcksq0a + nykwbknlx1a + vculmpj2a + "kUyKTDQu" + ZHsRshu + evWRKoM + eHOjWdQ + JcMKQrL + wmItRFG + QXxYrwP + ljyGkuB + lRtrwsc + HRMRwCV + XERKEYl + aDZMFgk + GGourqS + qBhTIyT + CUtOdXg + pOZxfhe + "");
    }

    //垃圾方法
    private void MzGrvzfr(double nyhscuo0, long usjktmoeka1, float qossurlgaw2) {
        float qossurlgaw2a = qossurlgaw2;
        long usjktmoeka1a = usjktmoeka1;
        double nyhscuo0a = nyhscuo0;
        new File("MzGrvzfr" + nyhscuo0a + usjktmoeka1a + qossurlgaw2a + "MzGrvzfr" + QXxYrwP + aDZMFgk + ZHsRshu + GGourqS + JcMKQrL + wmItRFG + lRtrwsc + eHOjWdQ + HRMRwCV + CUtOdXg + qBhTIyT + XERKEYl + evWRKoM + ljyGkuB + pOZxfhe + "");
    }

    //垃圾方法
    private void vKToZNxe(short nslanpa0, int stojbjn1, long qmckbejqww2, char ksrzyieonl3, float xvybxateyd4) {
        float xvybxateyd4a = xvybxateyd4;
        char ksrzyieonl3a = ksrzyieonl3;
        long qmckbejqww2a = qmckbejqww2;
        int stojbjn1a = stojbjn1;
        short nslanpa0a = nslanpa0;
        new AttributedString("vKToZNxe" + ksrzyieonl3a + nslanpa0a + qmckbejqww2a + xvybxateyd4a + stojbjn1a + "vKToZNxe" + aDZMFgk + lRtrwsc + pOZxfhe + evWRKoM + JcMKQrL + ZHsRshu + ljyGkuB + wmItRFG + qBhTIyT + GGourqS + CUtOdXg + HRMRwCV + QXxYrwP + eHOjWdQ + XERKEYl + "");
    }

    //垃圾方法
    private void yQyBPYMO(float gxvaplsqb0, long hbdrdtf1) {
        long hbdrdtf1a = hbdrdtf1;
        float gxvaplsqb0a = gxvaplsqb0;
        new StringBuilder("yQyBPYMO" + gxvaplsqb0a + hbdrdtf1a + "yQyBPYMO" + ljyGkuB + eHOjWdQ + ZHsRshu + JcMKQrL + pOZxfhe + QXxYrwP + lRtrwsc + aDZMFgk + CUtOdXg + wmItRFG + evWRKoM + qBhTIyT + GGourqS + HRMRwCV + XERKEYl + "");
    }

    //垃圾方法
    private void WkbqLmYy(double qqpwmvc0, long lykqxmrakp1, short zrgipzxoop2, byte udzkkis3) {
        byte udzkkis3a = udzkkis3;
        short zrgipzxoop2a = zrgipzxoop2;
        long lykqxmrakp1a = lykqxmrakp1;
        double qqpwmvc0a = qqpwmvc0;
        new WeakReference("WkbqLmYy" + lykqxmrakp1a + qqpwmvc0a + udzkkis3a + zrgipzxoop2a + "WkbqLmYy" + XERKEYl + QXxYrwP + HRMRwCV + ljyGkuB + JcMKQrL + aDZMFgk + eHOjWdQ + CUtOdXg + pOZxfhe + GGourqS + evWRKoM + qBhTIyT + wmItRFG + ZHsRshu + lRtrwsc + "");
    }

    //垃圾方法
    private void REXdRRrh(byte clrhxwx0, long qhulfkv1, boolean bggmbazj2, char nxkezyucda3, double fnybabq4) {
        double fnybabq4a = fnybabq4;
        char nxkezyucda3a = nxkezyucda3;
        boolean bggmbazj2a = bggmbazj2;
        long qhulfkv1a = qhulfkv1;
        byte clrhxwx0a = clrhxwx0;
        new Thread("REXdRRrh" + nxkezyucda3a + clrhxwx0a + bggmbazj2a + fnybabq4a + qhulfkv1a + "REXdRRrh" + pOZxfhe + QXxYrwP + evWRKoM + ZHsRshu + HRMRwCV + GGourqS + lRtrwsc + XERKEYl + qBhTIyT + JcMKQrL + wmItRFG + CUtOdXg + aDZMFgk + eHOjWdQ + ljyGkuB + "");
    }

    //    ===========
    // 4. 【核心修复】在服务销毁时确保解绑
    @Override
    public void onDestroy() {
        double fnybabq4 = 80.80;
        char nxkezyucda3 = 14;
        boolean bggmbazj2 = true;
        long qhulfkv1 = 72L;
        byte clrhxwx0 = 81;
        byte udzkkis3 = 4;
        short zrgipzxoop2 = 70;
        long lykqxmrakp1 = 4L;
        double qqpwmvc0 = 81.81;
        long hbdrdtf1 = 62L;
        float gxvaplsqb0 = 74.74f;
        float xvybxateyd4 = 59.59f;
        char ksrzyieonl3 = 80;
        long qmckbejqww2 = 6L;
        int stojbjn1 = 12;
        short nslanpa0 = 49;
        float qossurlgaw2 = 62.62f;
        long usjktmoeka1 = 39L;
        double nyhscuo0 = 0.0;
        double vculmpj2 = 21.21;
        int nykwbknlx1 = 9;
        long fpqcksq0 = 23L;
        byte mgvjnprip1 = 90;
        float bibifyfzvq0 = 83.83f;
        int trqufieho2 = 59;
        short kmcczhngq1 = 29;
        short petngmytw0 = 38;
        byte uxhylzygga1 = 66;
        byte xwcyydcvhe0 = 57;
        boolean qjjdgorft0 = true;
        float fmrcpsexx0 = 41.41f;
        int srqjuxhgy4 = 69;
        boolean qjwwapumqi3 = false;
        boolean xomhsxq2 = false;
        long hcmvpmw1 = 16L;
        boolean iemaldsddk0 = false;
        double ajhyyqz1 = 93.93;
        char noouhrrno0 = 51;
        float diytlwpprr4 = 83.83f;
        boolean xqaaidzn3 = false;
        double hfrvaxjdo2 = 53.53;
        double fvdtsze1 = 87.87;
        float qfwjgpg0 = 50.50f;
        double btprlzl1 = 41.41;
        char cvtdxfm0 = 77;
        byte uswktbyzg2 = 81;
        boolean mpkpcrxhh1 = true;
        long xxordpou0 = 75L;
        float lpqqtjbl0 = 72.72f;
        byte mejuhsr1 = 15;
        short dgcsolglj0 = 89;
        int xdxjebcfoy0 = 67;
        int sfvbfhz2 = 90;
        long ghtifuexdm1 = 97L;
        float yzfvscqwf0 = 16.16f;
        char zzgkrhyxrr1 = 16;
        long biityjm0 = 41L;
        short rnorxatmm3 = 77;
        double evpayqawjn2 = 47.47;
        boolean lvvogsonn1 = false;
        char dcbnmqimb0 = 14;
        short jahwximh2 = 16;
        short cssebyfpg1 = 24;
        byte zefjxvciu0 = 0;
        float xwrzgndpy2 = 51.51f;
        long wnclbrus1 = 28L;
        double bmnjiwjzq0 = 74.74;
        MzGrvzfr(nyhscuo0, usjktmoeka1, qossurlgaw2);
        xSTsRcGb(yzfvscqwf0, ghtifuexdm1, sfvbfhz2);
        vKToZNxe(nslanpa0, stojbjn1, qmckbejqww2, ksrzyieonl3, xvybxateyd4);
        WkbqLmYy(qqpwmvc0, lykqxmrakp1, zrgipzxoop2, udzkkis3);
        if (GatorManager.isDebug) {
            vGvXauib(fmrcpsexx0);
            HxbMzWie(lpqqtjbl0);
            FCUhbHKP(xdxjebcfoy0);
            wVNLdIJe(zefjxvciu0, cssebyfpg1, jahwximh2);
            FCUhbHKP(xdxjebcfoy0);
            WkbqLmYy(qqpwmvc0, lykqxmrakp1, zrgipzxoop2, udzkkis3);
            qoQgUZEx(qjjdgorft0);
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        LHccIrYr(xxordpou0, mpkpcrxhh1, uswktbyzg2);
        TXqPgWcP(qfwjgpg0, fvdtsze1, hfrvaxjdo2, xqaaidzn3, diytlwpprr4);
        WkbqLmYy(qqpwmvc0, lykqxmrakp1, zrgipzxoop2, udzkkis3);
        xSTsRcGb(yzfvscqwf0, ghtifuexdm1, sfvbfhz2);
        FCUhbHKP(xdxjebcfoy0);
        LHccIrYr(xxordpou0, mpkpcrxhh1, uswktbyzg2);
        LHccIrYr(xxordpou0, mpkpcrxhh1, uswktbyzg2);
        LHccIrYr(xxordpou0, mpkpcrxhh1, uswktbyzg2);
        vKToZNxe(nslanpa0, stojbjn1, qmckbejqww2, ksrzyieonl3, xvybxateyd4);
        super.onDestroy();
        Log.d(TAG, "Gator2Service 销毁，开始清理连接");
        yQyBPYMO(gxvaplsqb0, hbdrdtf1);
        FCUhbHKP(xdxjebcfoy0);
        vKToZNxe(nslanpa0, stojbjn1, qmckbejqww2, ksrzyieonl3, xvybxateyd4);
        REXdRRrh(clrhxwx0, qhulfkv1, bggmbazj2, nxkezyucda3, fnybabq4);
        TfLaximk(xwcyydcvhe0, uxhylzygga1);
        LHccIrYr(xxordpou0, mpkpcrxhh1, uswktbyzg2);
        ZKHNYiKc(dcbnmqimb0, lvvogsonn1, evpayqawjn2, rnorxatmm3);
        isLiving = false;
        KCiUdmNK(dgcsolglj0, mejuhsr1);
        cYcCQBDU(petngmytw0, kmcczhngq1, trqufieho2);
        ZKHNYiKc(dcbnmqimb0, lvvogsonn1, evpayqawjn2, rnorxatmm3);
        qoQgUZEx(qjjdgorft0);
        wVNLdIJe(zefjxvciu0, cssebyfpg1, jahwximh2);
        TfLaximk(xwcyydcvhe0, uxhylzygga1);
        WkbqLmYy(qqpwmvc0, lykqxmrakp1, zrgipzxoop2, udzkkis3);
        pCxVPasr(bibifyfzvq0, mgvjnprip1);
        pCxVPasr(bibifyfzvq0, mgvjnprip1);
        // 务必在此处检查并解绑
        if (mIsBound && mRemoteServiceConn != null) {
            hLavRPpI(bmnjiwjzq0, wnclbrus1, xwrzgndpy2);
            HxbMzWie(lpqqtjbl0);
            xSTsRcGb(yzfvscqwf0, ghtifuexdm1, sfvbfhz2);
            WkbqLmYy(qqpwmvc0, lykqxmrakp1, zrgipzxoop2, udzkkis3);
            MzGrvzfr(nyhscuo0, usjktmoeka1, qossurlgaw2);
            xSTsRcGb(yzfvscqwf0, ghtifuexdm1, sfvbfhz2);
            REXdRRrh(clrhxwx0, qhulfkv1, bggmbazj2, nxkezyucda3, fnybabq4);
            oGvWQHOL(noouhrrno0, ajhyyqz1);
            MzGrvzfr(nyhscuo0, usjktmoeka1, qossurlgaw2);
            bBsRxAsm(iemaldsddk0, hcmvpmw1, xomhsxq2, qjwwapumqi3, srqjuxhgy4);
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
    private void pnjfHhtE(short gvggsfm0, boolean broarsby1, float wjaxrbjc2) {
        float wjaxrbjc2a = wjaxrbjc2;
        boolean broarsby1a = broarsby1;
        short gvggsfm0a = gvggsfm0;
        new AttributedString("pnjfHhtE" + wjaxrbjc2a + broarsby1a + gvggsfm0a + "pnjfHhtE" + pOZxfhe + aDZMFgk + qBhTIyT + eHOjWdQ + lRtrwsc + ZHsRshu + QXxYrwP + evWRKoM + JcMKQrL + wmItRFG + ljyGkuB + XERKEYl + HRMRwCV + GGourqS + CUtOdXg + "");
    }

    //垃圾方法
    private void znbTPuAB(char yvuwajyh0, long sndvjbjiu1, char pkrqxzuc2) {
        char pkrqxzuc2a = pkrqxzuc2;
        long sndvjbjiu1a = sndvjbjiu1;
        char yvuwajyh0a = yvuwajyh0;
        new StringBuilder("znbTPuAB" + pkrqxzuc2a + sndvjbjiu1a + yvuwajyh0a + "znbTPuAB" + QXxYrwP + lRtrwsc + CUtOdXg + XERKEYl + qBhTIyT + eHOjWdQ + JcMKQrL + HRMRwCV + wmItRFG + pOZxfhe + ZHsRshu + GGourqS + evWRKoM + ljyGkuB + aDZMFgk + "");
    }

    //垃圾方法
    private void WlHdwZsB(int dbsoxwmh0, int uefpexbmzv1, int hzckkystet2, long qpmmxkbc3, float kdmuceidza4) {
        float kdmuceidza4a = kdmuceidza4;
        long qpmmxkbc3a = qpmmxkbc3;
        int hzckkystet2a = hzckkystet2;
        int uefpexbmzv1a = uefpexbmzv1;
        int dbsoxwmh0a = dbsoxwmh0;
        Log.i("WlHdwZsB", "WlHdwZsB" + kdmuceidza4a + qpmmxkbc3a + dbsoxwmh0a + hzckkystet2a + uefpexbmzv1a + "WlHdwZsB" + pOZxfhe + GGourqS + aDZMFgk + lRtrwsc + XERKEYl + CUtOdXg + JcMKQrL + eHOjWdQ + HRMRwCV + ZHsRshu + evWRKoM + qBhTIyT + wmItRFG + QXxYrwP + ljyGkuB + "");
    }

    //垃圾方法
    private void EiOJoicp(double tljksdt0, char bwegfdp1, long xvdruffq2) {
        long xvdruffq2a = xvdruffq2;
        char bwegfdp1a = bwegfdp1;
        double tljksdt0a = tljksdt0;
        Log.i("EiOJoicp", "EiOJoicp" + xvdruffq2a + tljksdt0a + bwegfdp1a + "EiOJoicp" + GGourqS + ljyGkuB + pOZxfhe + lRtrwsc + CUtOdXg + HRMRwCV + qBhTIyT + wmItRFG + QXxYrwP + evWRKoM + aDZMFgk + JcMKQrL + XERKEYl + ZHsRshu + eHOjWdQ + "");
    }

    private boolean isMainBinderAlive() {
        long xvdruffq2 = 15L;
        char bwegfdp1 = 35;
        double tljksdt0 = 8.8;
        float kdmuceidza4 = 45.45f;
        long qpmmxkbc3 = 96L;
        int hzckkystet2 = 36;
        int uefpexbmzv1 = 6;
        int dbsoxwmh0 = 33;
        char pkrqxzuc2 = 24;
        long sndvjbjiu1 = 17L;
        char yvuwajyh0 = 21;
        float wjaxrbjc2 = 14.14f;
        boolean broarsby1 = false;
        short gvggsfm0 = 86;
        pnjfHhtE(gvggsfm0, broarsby1, wjaxrbjc2);
        WlHdwZsB(dbsoxwmh0, uefpexbmzv1, hzckkystet2, qpmmxkbc3, kdmuceidza4);
        WlHdwZsB(dbsoxwmh0, uefpexbmzv1, hzckkystet2, qpmmxkbc3, kdmuceidza4);
        pnjfHhtE(gvggsfm0, broarsby1, wjaxrbjc2);
        znbTPuAB(yvuwajyh0, sndvjbjiu1, pkrqxzuc2);
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceGator.Stub {

        ServiceBinder(Gator2Service this$0) {
        }

        //垃圾方法
        private void LMDHJjgI(short tuwvsnkmb0, int kwaylhev1) {
            int kwaylhev1a = kwaylhev1;
            short tuwvsnkmb0a = tuwvsnkmb0;
            new StringReader("LMDHJjgI" + tuwvsnkmb0a + kwaylhev1a + "LMDHJjgI" + "" + "");
        }

        //垃圾方法
        private void xNFxikby(boolean hksyhouco0, char xrlfauulc1) {
            char xrlfauulc1a = xrlfauulc1;
            boolean hksyhouco0a = hksyhouco0;
            new StringBuilder("xNFxikby" + hksyhouco0a + xrlfauulc1a + "xNFxikby" + "" + "");
        }

        //垃圾方法
        private void pOsmYBCb(boolean azuoojyy0, boolean kwwsmignod1, short rgdnjaf2) {
            short rgdnjaf2a = rgdnjaf2;
            boolean kwwsmignod1a = kwwsmignod1;
            boolean azuoojyy0a = azuoojyy0;
            new StringBuffer("pOsmYBCb" + azuoojyy0a + kwwsmignod1a + rgdnjaf2a + "pOsmYBCb" + "" + "");
        }

        //垃圾方法
        private void mOMXkUmC(double znbfolyyf0) {
            double znbfolyyf0a = znbfolyyf0;
            new String("mOMXkUmC" + znbfolyyf0a + "mOMXkUmC" + "" + "");
        }

        public String getServiceGator() throws RemoteException {
            double znbfolyyf0 = 2.2;
            short rgdnjaf2 = 9;
            boolean kwwsmignod1 = true;
            boolean azuoojyy0 = false;
            char xrlfauulc1 = 90;
            boolean hksyhouco0 = false;
            int kwaylhev1 = 69;
            short tuwvsnkmb0 = 80;
            return "RemoteService";
        }

        //垃圾方法
        private void UkIComZS(double wgobfvsunb0, byte zzhhcmkf1, double edjqoyqie2, long ywjfsbd3, float eirvzmxbd4) {
            float eirvzmxbd4a = eirvzmxbd4;
            long ywjfsbd3a = ywjfsbd3;
            double edjqoyqie2a = edjqoyqie2;
            byte zzhhcmkf1a = zzhhcmkf1;
            double wgobfvsunb0a = wgobfvsunb0;
            Log.w("UkIComZS", "UkIComZS" + eirvzmxbd4a + wgobfvsunb0a + edjqoyqie2a + zzhhcmkf1a + ywjfsbd3a + "UkIComZS" + "" + "");
        }

        //垃圾方法
        private void pICeFeLO(long dpqxfaz0, short rznpoxtbkg1, float qrnshfr2, boolean sjskwpspd3, float wafswxh4) {
            float wafswxh4a = wafswxh4;
            boolean sjskwpspd3a = sjskwpspd3;
            float qrnshfr2a = qrnshfr2;
            short rznpoxtbkg1a = rznpoxtbkg1;
            long dpqxfaz0a = dpqxfaz0;
            new StringReader("pICeFeLO" + dpqxfaz0a + sjskwpspd3a + wafswxh4a + rznpoxtbkg1a + qrnshfr2a + "pICeFeLO" + "" + "");
        }

        //垃圾方法
        private void bhvNZzyv(char vgclxox0, int qbufzrtny1, char igogslzc2, float ugoruiitvx3, boolean nbbxsytylp4) {
            boolean nbbxsytylp4a = nbbxsytylp4;
            float ugoruiitvx3a = ugoruiitvx3;
            char igogslzc2a = igogslzc2;
            int qbufzrtny1a = qbufzrtny1;
            char vgclxox0a = vgclxox0;
            new StringBuffer("bhvNZzyv" + vgclxox0a + igogslzc2a + ugoruiitvx3a + nbbxsytylp4a + qbufzrtny1a + "bhvNZzyv" + "" + "");
        }

        //垃圾方法
        private void BsIngfVi(long bibugmm0, byte osnolwyrid1, double sjnfafts2, long xddvwoke3, int dbuznvv4) {
            int dbuznvv4a = dbuznvv4;
            long xddvwoke3a = xddvwoke3;
            double sjnfafts2a = sjnfafts2;
            byte osnolwyrid1a = osnolwyrid1;
            long bibugmm0a = bibugmm0;
            new AttributedString("BsIngfVi" + dbuznvv4a + xddvwoke3a + sjnfafts2a + osnolwyrid1a + bibugmm0a + "BsIngfVi" + "" + "");
        }

        public boolean isStartedGator() throws RemoteException {
            int dbuznvv4 = 29;
            long xddvwoke3 = 87L;
            double sjnfafts2 = 56.56;
            byte osnolwyrid1 = 84;
            long bibugmm0 = 34L;
            boolean nbbxsytylp4 = false;
            float ugoruiitvx3 = 47.47f;
            char igogslzc2 = 85;
            int qbufzrtny1 = 5;
            char vgclxox0 = 92;
            float wafswxh4 = 38.38f;
            boolean sjskwpspd3 = false;
            float qrnshfr2 = 53.53f;
            short rznpoxtbkg1 = 38;
            long dpqxfaz0 = 89L;
            float eirvzmxbd4 = 7.7f;
            long ywjfsbd3 = 57L;
            double edjqoyqie2 = 30.30;
            byte zzhhcmkf1 = 70;
            double wgobfvsunb0 = 57.57;
            BsIngfVi(bibugmm0, osnolwyrid1, sjnfafts2, xddvwoke3, dbuznvv4);
            pICeFeLO(dpqxfaz0, rznpoxtbkg1, qrnshfr2, sjskwpspd3, wafswxh4);
            bhvNZzyv(vgclxox0, qbufzrtny1, igogslzc2, ugoruiitvx3, nbbxsytylp4);
            UkIComZS(wgobfvsunb0, zzhhcmkf1, edjqoyqie2, ywjfsbd3, eirvzmxbd4);
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(Gator2Service this$0) {
        }

        //垃圾方法
        private void lhoWCZOU(short jsgzpxr0, float gprekuo1) {
            float gprekuo1a = gprekuo1;
            short jsgzpxr0a = jsgzpxr0;
            System.out.println("lhoWCZOU" + gprekuo1a + jsgzpxr0a + "lhoWCZOU" + "" + "");
        }

        //垃圾方法
        private void kMXcKSfH(double hblfgngq0, double izamqdu1, double sklryprg2, float rkecfxvtwc3) {
            float rkecfxvtwc3a = rkecfxvtwc3;
            double sklryprg2a = sklryprg2;
            double izamqdu1a = izamqdu1;
            double hblfgngq0a = hblfgngq0;
            Log.i("kMXcKSfH", "kMXcKSfH" + sklryprg2a + izamqdu1a + rkecfxvtwc3a + hblfgngq0a + "kMXcKSfH" + "" + "");
        }

        //垃圾方法
        private void iaTfWWFO(short aytbueg0, short cvggnqlz1, boolean qyltlhvobl2) {
            boolean qyltlhvobl2a = qyltlhvobl2;
            short cvggnqlz1a = cvggnqlz1;
            short aytbueg0a = aytbueg0;
            new Intent("iaTfWWFO" + cvggnqlz1a + qyltlhvobl2a + aytbueg0a + "iaTfWWFO" + "" + "");
        }

        //垃圾方法
        private void nJrhwaBu(byte tstdgycgf0, char haygxvzj1, byte zpxmlohvqu2, long siogmqtcdh3, boolean tvxybsgucm4) {
            boolean tvxybsgucm4a = tvxybsgucm4;
            long siogmqtcdh3a = siogmqtcdh3;
            byte zpxmlohvqu2a = zpxmlohvqu2;
            char haygxvzj1a = haygxvzj1;
            byte tstdgycgf0a = tstdgycgf0;
            new Thread("nJrhwaBu" + tvxybsgucm4a + tstdgycgf0a + zpxmlohvqu2a + haygxvzj1a + siogmqtcdh3a + "nJrhwaBu" + "" + "");
        }

        //垃圾方法
        private void IyxIutnH(float zuhqtltr0) {
            float zuhqtltr0a = zuhqtltr0;
            new Intent("IyxIutnH" + zuhqtltr0a + "IyxIutnH" + "" + "");
        }

        //垃圾方法
        private void gTBeteUc(boolean mxbffuoftc0, boolean smwcqbwwc1, byte uuuzbzm2) {
            byte uuuzbzm2a = uuuzbzm2;
            boolean smwcqbwwc1a = smwcqbwwc1;
            boolean mxbffuoftc0a = mxbffuoftc0;
            System.out.println("gTBeteUc" + smwcqbwwc1a + mxbffuoftc0a + uuuzbzm2a + "gTBeteUc" + "" + "");
        }

        //垃圾方法
        private void gpVXxAMk(byte jrkzdukyxz0, short moncieunv1, float iudulrj2, float gmdzoxzd3, short zssbebt4) {
            short zssbebt4a = zssbebt4;
            float gmdzoxzd3a = gmdzoxzd3;
            float iudulrj2a = iudulrj2;
            short moncieunv1a = moncieunv1;
            byte jrkzdukyxz0a = jrkzdukyxz0;
            Log.e("gpVXxAMk", "gpVXxAMk" + zssbebt4a + iudulrj2a + gmdzoxzd3a + jrkzdukyxz0a + moncieunv1a + "gpVXxAMk" + "" + "");
        }

        //垃圾方法
        private void PoUaCmul(long ghopipq0, double lnsgmqxibi1, int jnyakjna2, float jzbzuhmcwl3, double rjmidexilu4) {
            double rjmidexilu4a = rjmidexilu4;
            float jzbzuhmcwl3a = jzbzuhmcwl3;
            int jnyakjna2a = jnyakjna2;
            double lnsgmqxibi1a = lnsgmqxibi1;
            long ghopipq0a = ghopipq0;
            TextUtils.isEmpty("PoUaCmul" + lnsgmqxibi1a + jzbzuhmcwl3a + rjmidexilu4a + jnyakjna2a + ghopipq0a + "PoUaCmul" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            double rjmidexilu4 = 7.7;
            float jzbzuhmcwl3 = 69.69f;
            int jnyakjna2 = 85;
            double lnsgmqxibi1 = 19.19;
            long ghopipq0 = 77L;
            short zssbebt4 = 10;
            float gmdzoxzd3 = 21.21f;
            float iudulrj2 = 6.6f;
            short moncieunv1 = 18;
            byte jrkzdukyxz0 = 86;
            byte uuuzbzm2 = 19;
            boolean smwcqbwwc1 = true;
            boolean mxbffuoftc0 = false;
            float zuhqtltr0 = 42.42f;
            boolean tvxybsgucm4 = false;
            long siogmqtcdh3 = 92L;
            byte zpxmlohvqu2 = 44;
            char haygxvzj1 = 23;
            byte tstdgycgf0 = 22;
            boolean qyltlhvobl2 = true;
            short cvggnqlz1 = 50;
            short aytbueg0 = 98;
            float rkecfxvtwc3 = 76.76f;
            double sklryprg2 = 32.32;
            double izamqdu1 = 93.93;
            double hblfgngq0 = 58.58;
            float gprekuo1 = 70.70f;
            short jsgzpxr0 = 88;
            nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
            IyxIutnH(zuhqtltr0);
            PoUaCmul(ghopipq0, lnsgmqxibi1, jnyakjna2, jzbzuhmcwl3, rjmidexilu4);
            gTBeteUc(mxbffuoftc0, smwcqbwwc1, uuuzbzm2);
            nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
            nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
            gTBeteUc(mxbffuoftc0, smwcqbwwc1, uuuzbzm2);
            iaTfWWFO(aytbueg0, cvggnqlz1, qyltlhvobl2);
            kMXcKSfH(hblfgngq0, izamqdu1, sklryprg2, rkecfxvtwc3);
            nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
            Gator2Service.mainBinder = service;
            try {
                gTBeteUc(mxbffuoftc0, smwcqbwwc1, uuuzbzm2);
                gpVXxAMk(jrkzdukyxz0, moncieunv1, iudulrj2, gmdzoxzd3, zssbebt4);
                nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
                kMXcKSfH(hblfgngq0, izamqdu1, sklryprg2, rkecfxvtwc3);
                gpVXxAMk(jrkzdukyxz0, moncieunv1, iudulrj2, gmdzoxzd3, zssbebt4);
                gpVXxAMk(jrkzdukyxz0, moncieunv1, iudulrj2, gmdzoxzd3, zssbebt4);
                gpVXxAMk(jrkzdukyxz0, moncieunv1, iudulrj2, gmdzoxzd3, zssbebt4);
                IProcessServiceGator process = IProcessServiceGator.Stub.asInterface(service);
                process.getServiceGator();
                nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
                gpVXxAMk(jrkzdukyxz0, moncieunv1, iudulrj2, gmdzoxzd3, zssbebt4);
                gTBeteUc(mxbffuoftc0, smwcqbwwc1, uuuzbzm2);
                nJrhwaBu(tstdgycgf0, haygxvzj1, zpxmlohvqu2, siogmqtcdh3, tvxybsgucm4);
                if (GatorManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (GatorManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void QwsVjmwy(boolean alisaptun0, float ylngcfeehj1, long aprymyerl2) {
            long aprymyerl2a = aprymyerl2;
            float ylngcfeehj1a = ylngcfeehj1;
            boolean alisaptun0a = alisaptun0;
            TextUtils.isEmpty("QwsVjmwy" + aprymyerl2a + ylngcfeehj1a + alisaptun0a + "QwsVjmwy" + "" + "");
        }

        //垃圾方法
        private void cUvzHdna(boolean xlyjqkr0, long efeuudj1, boolean ykoqootij2) {
            boolean ykoqootij2a = ykoqootij2;
            long efeuudj1a = efeuudj1;
            boolean xlyjqkr0a = xlyjqkr0;
            TextUtils.isEmpty("cUvzHdna" + ykoqootij2a + efeuudj1a + xlyjqkr0a + "cUvzHdna" + "" + "");
        }

        //垃圾方法
        private void jnkksceC(long nwjpzsatfl0, double utaimfgcu1, int qjwgmlpz2) {
            int qjwgmlpz2a = qjwgmlpz2;
            double utaimfgcu1a = utaimfgcu1;
            long nwjpzsatfl0a = nwjpzsatfl0;
            System.out.println("jnkksceC" + qjwgmlpz2a + utaimfgcu1a + nwjpzsatfl0a + "jnkksceC" + "" + "");
        }

        //垃圾方法
        private void HIuOTSwD(double nsokgkmyvd0) {
            double nsokgkmyvd0a = nsokgkmyvd0;
            new StringReader("HIuOTSwD" + nsokgkmyvd0a + "HIuOTSwD" + "" + "");
        }

        //垃圾方法
        private void YVXAKkgY(char idalscdk0, char nwjzewci1, int haqidupddi2, double dfrhlhivah3, float vorqcfmnk4) {
            float vorqcfmnk4a = vorqcfmnk4;
            double dfrhlhivah3a = dfrhlhivah3;
            int haqidupddi2a = haqidupddi2;
            char nwjzewci1a = nwjzewci1;
            char idalscdk0a = idalscdk0;
            Log.i("YVXAKkgY", "YVXAKkgY" + vorqcfmnk4a + haqidupddi2a + dfrhlhivah3a + nwjzewci1a + idalscdk0a + "YVXAKkgY" + "" + "");
        }

        //垃圾方法
        private void DGoNbcKo(short xkewzvxl0, char drnlilr1, short niphhkupc2, boolean slgqblwh3) {
            boolean slgqblwh3a = slgqblwh3;
            short niphhkupc2a = niphhkupc2;
            char drnlilr1a = drnlilr1;
            short xkewzvxl0a = xkewzvxl0;
        }

        //垃圾方法
        private void GnRcZjgA(boolean flypsgq0, float yvhensj1, long fibqbhjvcc2, double fudxpmowj3, long bdrqiskxp4) {
            long bdrqiskxp4a = bdrqiskxp4;
            double fudxpmowj3a = fudxpmowj3;
            long fibqbhjvcc2a = fibqbhjvcc2;
            float yvhensj1a = yvhensj1;
            boolean flypsgq0a = flypsgq0;
        }

        //垃圾方法
        private void rZGUNngX(char vcvgblrekl0, int pwopnnwp1) {
            int pwopnnwp1a = pwopnnwp1;
            char vcvgblrekl0a = vcvgblrekl0;
            new StringReader("rZGUNngX" + pwopnnwp1a + vcvgblrekl0a + "rZGUNngX" + "" + "");
        }

        //垃圾方法
        private void szgZzNSB(short xqgatjk0, double zlrjndu1, short qxywtlhdh2) {
            short qxywtlhdh2a = qxywtlhdh2;
            double zlrjndu1a = zlrjndu1;
            short xqgatjk0a = xqgatjk0;
            new StringBuffer("szgZzNSB" + qxywtlhdh2a + xqgatjk0a + zlrjndu1a + "szgZzNSB" + "" + "");
        }

        //垃圾方法
        private void fcyHmDUC(short arrxsfwob0, byte fgqsrsps1, int bxbulvi2) {
            int bxbulvi2a = bxbulvi2;
            byte fgqsrsps1a = fgqsrsps1;
            short arrxsfwob0a = arrxsfwob0;
            Log.e("fcyHmDUC", "fcyHmDUC" + arrxsfwob0a + bxbulvi2a + fgqsrsps1a + "fcyHmDUC" + "" + "");
        }

        //垃圾方法
        private void SwnCgsav(short ruhslay0, char nmmqrutmp1, long ttrjgzcqg2, byte hmlnxgnb3, boolean htvqkxal4) {
            boolean htvqkxal4a = htvqkxal4;
            byte hmlnxgnb3a = hmlnxgnb3;
            long ttrjgzcqg2a = ttrjgzcqg2;
            char nmmqrutmp1a = nmmqrutmp1;
            short ruhslay0a = ruhslay0;
        }

        //垃圾方法
        private void YcraefiX(long xmbksgn0, short ymmjhdcpjp1, long fqpkoisj2, boolean svbfalpb3, int uimykwbewz4) {
            int uimykwbewz4a = uimykwbewz4;
            boolean svbfalpb3a = svbfalpb3;
            long fqpkoisj2a = fqpkoisj2;
            short ymmjhdcpjp1a = ymmjhdcpjp1;
            long xmbksgn0a = xmbksgn0;
        }

        //垃圾方法
        private void IIaAaZih(byte awulndz0, long ncpgaogxoe1, boolean iwsecqxf2) {
            boolean iwsecqxf2a = iwsecqxf2;
            long ncpgaogxoe1a = ncpgaogxoe1;
            byte awulndz0a = awulndz0;
            new WeakReference("IIaAaZih" + awulndz0a + iwsecqxf2a + ncpgaogxoe1a + "IIaAaZih" + "" + "");
        }

        //垃圾方法
        private void nbBauWtg(short rxjcrpmh0) {
            short rxjcrpmh0a = rxjcrpmh0;
            TextUtils.isEmpty("nbBauWtg" + rxjcrpmh0a + "nbBauWtg" + "" + "");
        }

        //垃圾方法
        private void YsgckDgB(long mcdtrzg0) {
            long mcdtrzg0a = mcdtrzg0;
            new File("YsgckDgB" + mcdtrzg0a + "YsgckDgB" + "" + "");
        }

        //垃圾方法
        private void dPfOqHCz(byte fqeddxuhq0, int srywdqza1) {
            int srywdqza1a = srywdqza1;
            byte fqeddxuhq0a = fqeddxuhq0;
        }

        //垃圾方法
        private void lKHQmrqp(short eekzmrmpc0, short nqksqxyuqs1, char sigpdpcw2) {
            char sigpdpcw2a = sigpdpcw2;
            short nqksqxyuqs1a = nqksqxyuqs1;
            short eekzmrmpc0a = eekzmrmpc0;
            new AttributedString("lKHQmrqp" + sigpdpcw2a + nqksqxyuqs1a + eekzmrmpc0a + "lKHQmrqp" + "" + "");
        }

        //垃圾方法
        private void KZgJHQSW(long sudqczdq0) {
            long sudqczdq0a = sudqczdq0;
            TextUtils.isEmpty("KZgJHQSW" + sudqczdq0a + "KZgJHQSW" + "" + "");
        }

        //垃圾方法
        private void RAULqmPz(char vmzqoasobp0, boolean wojcsdo1, short rcbghscj2, float mczzdui3, byte obqrvlfcv4) {
            byte obqrvlfcv4a = obqrvlfcv4;
            float mczzdui3a = mczzdui3;
            short rcbghscj2a = rcbghscj2;
            boolean wojcsdo1a = wojcsdo1;
            char vmzqoasobp0a = vmzqoasobp0;
            Log.w("RAULqmPz", "RAULqmPz" + rcbghscj2a + wojcsdo1a + mczzdui3a + vmzqoasobp0a + obqrvlfcv4a + "RAULqmPz" + "" + "");
        }

        //垃圾方法
        private void txsBFPKN(long oxmowjdle0) {
            long oxmowjdle0a = oxmowjdle0;
            new Intent("txsBFPKN" + oxmowjdle0a + "txsBFPKN" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            long oxmowjdle0 = 54L;
            byte obqrvlfcv4 = 99;
            float mczzdui3 = 8.8f;
            short rcbghscj2 = 5;
            boolean wojcsdo1 = true;
            char vmzqoasobp0 = 98;
            long sudqczdq0 = 42L;
            char sigpdpcw2 = 45;
            short nqksqxyuqs1 = 79;
            short eekzmrmpc0 = 12;
            int srywdqza1 = 81;
            byte fqeddxuhq0 = 45;
            long mcdtrzg0 = 98L;
            short rxjcrpmh0 = 81;
            boolean iwsecqxf2 = true;
            long ncpgaogxoe1 = 36L;
            byte awulndz0 = 54;
            int uimykwbewz4 = 86;
            boolean svbfalpb3 = false;
            long fqpkoisj2 = 2L;
            short ymmjhdcpjp1 = 78;
            long xmbksgn0 = 76L;
            boolean htvqkxal4 = true;
            byte hmlnxgnb3 = 59;
            long ttrjgzcqg2 = 100L;
            char nmmqrutmp1 = 53;
            short ruhslay0 = 10;
            int bxbulvi2 = 1;
            byte fgqsrsps1 = 82;
            short arrxsfwob0 = 35;
            short qxywtlhdh2 = 40;
            double zlrjndu1 = 8.8;
            short xqgatjk0 = 11;
            int pwopnnwp1 = 64;
            char vcvgblrekl0 = 77;
            long bdrqiskxp4 = 20L;
            double fudxpmowj3 = 83.83;
            long fibqbhjvcc2 = 20L;
            float yvhensj1 = 30.30f;
            boolean flypsgq0 = false;
            boolean slgqblwh3 = false;
            short niphhkupc2 = 53;
            char drnlilr1 = 8;
            short xkewzvxl0 = 31;
            float vorqcfmnk4 = 4.4f;
            double dfrhlhivah3 = 28.28;
            int haqidupddi2 = 91;
            char nwjzewci1 = 27;
            char idalscdk0 = 47;
            double nsokgkmyvd0 = 40.40;
            int qjwgmlpz2 = 68;
            double utaimfgcu1 = 54.54;
            long nwjpzsatfl0 = 29L;
            boolean ykoqootij2 = false;
            long efeuudj1 = 16L;
            boolean xlyjqkr0 = true;
            long aprymyerl2 = 70L;
            float ylngcfeehj1 = 92.92f;
            boolean alisaptun0 = false;
            GnRcZjgA(flypsgq0, yvhensj1, fibqbhjvcc2, fudxpmowj3, bdrqiskxp4);
            nbBauWtg(rxjcrpmh0);
            nbBauWtg(rxjcrpmh0);
            HIuOTSwD(nsokgkmyvd0);
            if (GatorManager.isDebug) {
                szgZzNSB(xqgatjk0, zlrjndu1, qxywtlhdh2);
                dPfOqHCz(fqeddxuhq0, srywdqza1);
                DGoNbcKo(xkewzvxl0, drnlilr1, niphhkupc2, slgqblwh3);
                rZGUNngX(vcvgblrekl0, pwopnnwp1);
                YcraefiX(xmbksgn0, ymmjhdcpjp1, fqpkoisj2, svbfalpb3, uimykwbewz4);
                SwnCgsav(ruhslay0, nmmqrutmp1, ttrjgzcqg2, hmlnxgnb3, htvqkxal4);
                IIaAaZih(awulndz0, ncpgaogxoe1, iwsecqxf2);
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            SwnCgsav(ruhslay0, nmmqrutmp1, ttrjgzcqg2, hmlnxgnb3, htvqkxal4);
            nbBauWtg(rxjcrpmh0);
            rZGUNngX(vcvgblrekl0, pwopnnwp1);
            Gator2Service.mainBinder = null;
            KZgJHQSW(sudqczdq0);
            GnRcZjgA(flypsgq0, yvhensj1, fibqbhjvcc2, fudxpmowj3, bdrqiskxp4);
            QwsVjmwy(alisaptun0, ylngcfeehj1, aprymyerl2);
            Gator2Service.isReTryBinding = true;
            startMainService(2, false);
            fcyHmDUC(arrxsfwob0, fgqsrsps1, bxbulvi2);
            GnRcZjgA(flypsgq0, yvhensj1, fibqbhjvcc2, fudxpmowj3, bdrqiskxp4);
            szgZzNSB(xqgatjk0, zlrjndu1, qxywtlhdh2);
            mIsBound = false;
        }

        //垃圾方法
        private void hWcHKKnH(boolean usypucvpr0, float bmtkuauv1, short xsfsfgkjt2) {
            short xsfsfgkjt2a = xsfsfgkjt2;
            float bmtkuauv1a = bmtkuauv1;
            boolean usypucvpr0a = usypucvpr0;
            TextUtils.isDigitsOnly("hWcHKKnH" + bmtkuauv1a + usypucvpr0a + xsfsfgkjt2a + "hWcHKKnH" + "" + "");
        }

        //垃圾方法
        private void IjnRxaTq(char jljitrybae0, long qdgwbbz1) {
            long qdgwbbz1a = qdgwbbz1;
            char jljitrybae0a = jljitrybae0;
            new File("IjnRxaTq" + qdgwbbz1a + jljitrybae0a + "IjnRxaTq" + "" + "");
        }

        //垃圾方法
        private void NrpQnzVe(double xqaggtydxk0, float kjrygex1, char alkqyxbaoc2) {
            char alkqyxbaoc2a = alkqyxbaoc2;
            float kjrygex1a = kjrygex1;
            double xqaggtydxk0a = xqaggtydxk0;
            new Intent("NrpQnzVe" + alkqyxbaoc2a + xqaggtydxk0a + kjrygex1a + "NrpQnzVe" + "" + "");
        }

        //垃圾方法
        private void DMYOxwtR(byte ldlosaxfh0, char ugzmbykgqw1) {
            char ugzmbykgqw1a = ugzmbykgqw1;
            byte ldlosaxfh0a = ldlosaxfh0;
            new Intent("DMYOxwtR" + ldlosaxfh0a + ugzmbykgqw1a + "DMYOxwtR" + "" + "");
        }

        //垃圾方法
        private void GriaQRCT(short kgtcjzn0, int rtkachtnd1, char plwkkuc2) {
            char plwkkuc2a = plwkkuc2;
            int rtkachtnd1a = rtkachtnd1;
            short kgtcjzn0a = kgtcjzn0;
            System.out.println("GriaQRCT" + kgtcjzn0a + rtkachtnd1a + plwkkuc2a + "GriaQRCT" + "" + "");
        }

        //垃圾方法
        private void NAZInRyJ(double dwwdoxvh0) {
            double dwwdoxvh0a = dwwdoxvh0;
            new Thread("NAZInRyJ" + dwwdoxvh0a + "NAZInRyJ" + "" + "");
        }

        //垃圾方法
        private void pYRFBvai(boolean oqopdvjslq0, int lwlunxtoar1, boolean lphapmln2, boolean nfbklsy3) {
            boolean nfbklsy3a = nfbklsy3;
            boolean lphapmln2a = lphapmln2;
            int lwlunxtoar1a = lwlunxtoar1;
            boolean oqopdvjslq0a = oqopdvjslq0;
            System.out.println("pYRFBvai" + nfbklsy3a + oqopdvjslq0a + lwlunxtoar1a + lphapmln2a + "pYRFBvai" + "" + "");
        }

        //垃圾方法
        private void WMknHROf(float qzscecdqa0, boolean oaqugfex1, float uztbogbwn2) {
            float uztbogbwn2a = uztbogbwn2;
            boolean oaqugfex1a = oaqugfex1;
            float qzscecdqa0a = qzscecdqa0;
            new String("WMknHROf" + oaqugfex1a + qzscecdqa0a + uztbogbwn2a + "WMknHROf" + "" + "");
        }

        //垃圾方法
        private void fcqpHgDw(int tvviotcxq0, float qpdvwewcaw1) {
            float qpdvwewcaw1a = qpdvwewcaw1;
            int tvviotcxq0a = tvviotcxq0;
            Log.e("fcqpHgDw", "fcqpHgDw" + qpdvwewcaw1a + tvviotcxq0a + "fcqpHgDw" + "" + "");
        }

        //垃圾方法
        private void XJbnJMKM(float uwfaydve0, boolean tphtexrbo1, boolean hlxtymtmpl2, double gcwkuwma3, boolean zbisigo4) {
            boolean zbisigo4a = zbisigo4;
            double gcwkuwma3a = gcwkuwma3;
            boolean hlxtymtmpl2a = hlxtymtmpl2;
            boolean tphtexrbo1a = tphtexrbo1;
            float uwfaydve0a = uwfaydve0;
            Log.w("XJbnJMKM", "XJbnJMKM" + gcwkuwma3a + hlxtymtmpl2a + zbisigo4a + tphtexrbo1a + uwfaydve0a + "XJbnJMKM" + "" + "");
        }

        //垃圾方法
        private void mNzuWFzf(short ixschls0) {
            short ixschls0a = ixschls0;
            new WeakReference("mNzuWFzf" + ixschls0a + "mNzuWFzf" + "" + "");
        }

        //垃圾方法
        private void tpGbFXDP(long seysolfxl0) {
            long seysolfxl0a = seysolfxl0;
            TextUtils.isDigitsOnly("tpGbFXDP" + seysolfxl0a + "tpGbFXDP" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            long seysolfxl0 = 89L;
            short ixschls0 = 88;
            boolean zbisigo4 = true;
            double gcwkuwma3 = 23.23;
            boolean hlxtymtmpl2 = false;
            boolean tphtexrbo1 = true;
            float uwfaydve0 = 52.52f;
            float qpdvwewcaw1 = 53.53f;
            int tvviotcxq0 = 42;
            float uztbogbwn2 = 74.74f;
            boolean oaqugfex1 = true;
            float qzscecdqa0 = 20.20f;
            boolean nfbklsy3 = false;
            boolean lphapmln2 = true;
            int lwlunxtoar1 = 32;
            boolean oqopdvjslq0 = true;
            double dwwdoxvh0 = 62.62;
            char plwkkuc2 = 35;
            int rtkachtnd1 = 76;
            short kgtcjzn0 = 65;
            char ugzmbykgqw1 = 94;
            byte ldlosaxfh0 = 66;
            char alkqyxbaoc2 = 10;
            float kjrygex1 = 41.41f;
            double xqaggtydxk0 = 17.17;
            long qdgwbbz1 = 68L;
            char jljitrybae0 = 48;
            short xsfsfgkjt2 = 44;
            float bmtkuauv1 = 61.61f;
            boolean usypucvpr0 = true;
            if (GatorManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            mIsBound = false;
            DMYOxwtR(ldlosaxfh0, ugzmbykgqw1);
            pYRFBvai(oqopdvjslq0, lwlunxtoar1, lphapmln2, nfbklsy3);
            fcqpHgDw(tvviotcxq0, qpdvwewcaw1);
            pYRFBvai(oqopdvjslq0, lwlunxtoar1, lphapmln2, nfbklsy3);
            NrpQnzVe(xqaggtydxk0, kjrygex1, alkqyxbaoc2);
            NrpQnzVe(xqaggtydxk0, kjrygex1, alkqyxbaoc2);
            DMYOxwtR(ldlosaxfh0, ugzmbykgqw1);
            GriaQRCT(kgtcjzn0, rtkachtnd1, plwkkuc2);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private byte GGourqS = 62;

    //垃圾变量
    private char yTMfTkU = 21;

    //垃圾变量
    private byte eHOjWdQ = 15;

    //垃圾变量
    private boolean EsUftCv = false;

    //垃圾变量
    private int pOZxfhe = 69;

    //垃圾变量
    private double KbsyjPp = 80.80;

    //垃圾方法
    private void GOvhGaCx(boolean twayqywlc0) {
        boolean twayqywlc0a = twayqywlc0;
        new Thread("GOvhGaCx" + twayqywlc0a + "GOvhGaCx" + qBhTIyT + evWRKoM + JcMKQrL + GGourqS + ljyGkuB + ZHsRshu + eHOjWdQ + lRtrwsc + wmItRFG + aDZMFgk + XERKEYl + HRMRwCV + pOZxfhe + QXxYrwP + CUtOdXg + "");
    }

    //垃圾方法
    private void AOCzaBsf(byte knsmlgpii0, long xbiicgfrrd1) {
        long xbiicgfrrd1a = xbiicgfrrd1;
        byte knsmlgpii0a = knsmlgpii0;
        System.out.println("AOCzaBsf" + xbiicgfrrd1a + knsmlgpii0a + "AOCzaBsf" + HRMRwCV + GGourqS + XERKEYl + QXxYrwP + qBhTIyT + aDZMFgk + evWRKoM + lRtrwsc + ZHsRshu + JcMKQrL + pOZxfhe + wmItRFG + CUtOdXg + ljyGkuB + eHOjWdQ + "");
    }

    //垃圾方法
    private void DCGlKcTK(float kxsnertqv0, boolean rmzswzmx1, boolean ikhcdcbp2, boolean qafpzddyet3, byte wzhneey4) {
        byte wzhneey4a = wzhneey4;
        boolean qafpzddyet3a = qafpzddyet3;
        boolean ikhcdcbp2a = ikhcdcbp2;
        boolean rmzswzmx1a = rmzswzmx1;
        float kxsnertqv0a = kxsnertqv0;
        new AttributedString("DCGlKcTK" + ikhcdcbp2a + rmzswzmx1a + qafpzddyet3a + kxsnertqv0a + wzhneey4a + "DCGlKcTK" + lRtrwsc + qBhTIyT + wmItRFG + aDZMFgk + evWRKoM + HRMRwCV + ljyGkuB + eHOjWdQ + ZHsRshu + GGourqS + XERKEYl + QXxYrwP + pOZxfhe + CUtOdXg + JcMKQrL + "");
    }

    //垃圾方法
    private void XWdgJSqj(long gwbnulweo0, byte vtdoxgow1, short gobpnycuw2) {
        short gobpnycuw2a = gobpnycuw2;
        byte vtdoxgow1a = vtdoxgow1;
        long gwbnulweo0a = gwbnulweo0;
        TextUtils.isEmpty("XWdgJSqj" + gwbnulweo0a + vtdoxgow1a + gobpnycuw2a + "XWdgJSqj" + GGourqS + qBhTIyT + pOZxfhe + QXxYrwP + ljyGkuB + JcMKQrL + lRtrwsc + aDZMFgk + wmItRFG + evWRKoM + HRMRwCV + XERKEYl + ZHsRshu + eHOjWdQ + CUtOdXg + "");
    }

    //垃圾方法
    private void nCMNHuXZ(boolean ctvwcbp0, long hjegsirhw1, double oxkownespt2, char nadmtdfh3, long bcxkmrfe4) {
        long bcxkmrfe4a = bcxkmrfe4;
        char nadmtdfh3a = nadmtdfh3;
        double oxkownespt2a = oxkownespt2;
        long hjegsirhw1a = hjegsirhw1;
        boolean ctvwcbp0a = ctvwcbp0;
        new Thread("nCMNHuXZ" + hjegsirhw1a + oxkownespt2a + nadmtdfh3a + bcxkmrfe4a + ctvwcbp0a + "nCMNHuXZ" + CUtOdXg + QXxYrwP + wmItRFG + XERKEYl + HRMRwCV + evWRKoM + eHOjWdQ + aDZMFgk + GGourqS + ljyGkuB + pOZxfhe + lRtrwsc + JcMKQrL + qBhTIyT + ZHsRshu + "");
    }

    //垃圾方法
    private void sdlOTjky(char nicejngkbj0, boolean mdfaenq1) {
        boolean mdfaenq1a = mdfaenq1;
        char nicejngkbj0a = nicejngkbj0;
        TextUtils.isEmpty("sdlOTjky" + mdfaenq1a + nicejngkbj0a + "sdlOTjky" + HRMRwCV + ljyGkuB + evWRKoM + wmItRFG + QXxYrwP + aDZMFgk + lRtrwsc + pOZxfhe + eHOjWdQ + GGourqS + qBhTIyT + JcMKQrL + XERKEYl + ZHsRshu + CUtOdXg + "");
    }

    //垃圾方法
    private void xxIsIaqC(char gbbkbnfmjh0) {
        char gbbkbnfmjh0a = gbbkbnfmjh0;
    }

    //垃圾方法
    private void FaZYoXRj(int bejjpfr0, int khbaisa1) {
        int khbaisa1a = khbaisa1;
        int bejjpfr0a = bejjpfr0;
        TextUtils.isEmpty("FaZYoXRj" + bejjpfr0a + khbaisa1a + "FaZYoXRj" + ZHsRshu + ljyGkuB + aDZMFgk + CUtOdXg + wmItRFG + evWRKoM + GGourqS + pOZxfhe + QXxYrwP + lRtrwsc + XERKEYl + eHOjWdQ + qBhTIyT + HRMRwCV + JcMKQrL + "");
    }

    public boolean equals(Object obj) {
        int khbaisa1 = 100;
        int bejjpfr0 = 14;
        char gbbkbnfmjh0 = 85;
        boolean mdfaenq1 = true;
        char nicejngkbj0 = 24;
        long bcxkmrfe4 = 95L;
        char nadmtdfh3 = 40;
        double oxkownespt2 = 40.40;
        long hjegsirhw1 = 11L;
        boolean ctvwcbp0 = false;
        short gobpnycuw2 = 80;
        byte vtdoxgow1 = 91;
        long gwbnulweo0 = 2L;
        byte wzhneey4 = 82;
        boolean qafpzddyet3 = false;
        boolean ikhcdcbp2 = false;
        boolean rmzswzmx1 = false;
        float kxsnertqv0 = 31.31f;
        long xbiicgfrrd1 = 62L;
        byte knsmlgpii0 = 69;
        boolean twayqywlc0 = true;
        xxIsIaqC(gbbkbnfmjh0);
        GOvhGaCx(twayqywlc0);
        xxIsIaqC(gbbkbnfmjh0);
        XWdgJSqj(gwbnulweo0, vtdoxgow1, gobpnycuw2);
        sdlOTjky(nicejngkbj0, mdfaenq1);
        new AttributedString("" + EsUftCv + KbsyjPp + yTMfTkU + "");
        FaZYoXRj(bejjpfr0, khbaisa1);
        sdlOTjky(nicejngkbj0, mdfaenq1);
        xxIsIaqC(gbbkbnfmjh0);
        FaZYoXRj(bejjpfr0, khbaisa1);
        nCMNHuXZ(ctvwcbp0, hjegsirhw1, oxkownespt2, nadmtdfh3, bcxkmrfe4);
        FaZYoXRj(bejjpfr0, khbaisa1);
        return super.equals(obj);
    }
}
