package com.tidy.file.old.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.tidy.IProcessServiceTidy;
import com.tidy.file.old.TidyManager;
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

public class Tidy1Service extends Service {

    //垃圾变量
    private char bHLRMkx = 89;

    public static long lastTime = 0L;

    //垃圾变量
    private float aarbZeb = 18.18f;

    private static String TAG = "xxx";

    //垃圾变量
    private char ddmKvwD = 86;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private boolean QWElVJD = false;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private double LeUxIUn = 99.99;

    public static Boolean isLiving = false;

    //垃圾变量
    private double WIknEVt = 27.27;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private boolean BXJRAgF = true;

    private static long delayTime = 250L;

    //垃圾变量
    private byte hXdeRan = 88;

    public static boolean isStartService = false;

    //垃圾变量
    private short nDvxEsp = 66;

    private IBinder subBinder = null;

    //垃圾变量
    private long Mzrffcg = 2L;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private double dxmwPSi = 49.49;

    int nextNum = -1;

    public Tidy1Service() {
    }

    //垃圾方法
    static private void KTUrUSQp(byte sjkiacz0, boolean wtobxnfhgz1) {
        boolean wtobxnfhgz1a = wtobxnfhgz1;
        byte sjkiacz0a = sjkiacz0;
        Log.i("KTUrUSQp", "KTUrUSQp" + sjkiacz0a + wtobxnfhgz1a + "KTUrUSQp" + "");
    }

    //垃圾方法
    static private void aesPuJxN(float jtfxgrbe0, long xttaxtfe1) {
        long xttaxtfe1a = xttaxtfe1;
        float jtfxgrbe0a = jtfxgrbe0;
        Log.e("aesPuJxN", "aesPuJxN" + jtfxgrbe0a + xttaxtfe1a + "aesPuJxN" + "");
    }

    //垃圾方法
    static private void DucBrVVA(char cgslbza0, char xwyxsrn1, long vbkxmccuj2) {
        long vbkxmccuj2a = vbkxmccuj2;
        char xwyxsrn1a = xwyxsrn1;
        char cgslbza0a = cgslbza0;
        new StringReader("DucBrVVA" + cgslbza0a + xwyxsrn1a + vbkxmccuj2a + "DucBrVVA" + "");
    }

    //垃圾方法
    static private void YwSdXOCD(float upbypbu0) {
        float upbypbu0a = upbypbu0;
        TextUtils.isDigitsOnly("YwSdXOCD" + upbypbu0a + "YwSdXOCD" + "");
    }

    public static void tryStartLaunchMainService() {
        float upbypbu0 = 95.95f;
        long vbkxmccuj2 = 65L;
        char xwyxsrn1 = 97;
        char cgslbza0 = 87;
        long xttaxtfe1 = 14L;
        float jtfxgrbe0 = 12.12f;
        boolean wtobxnfhgz1 = false;
        byte sjkiacz0 = 38;
        DucBrVVA(cgslbza0, xwyxsrn1, vbkxmccuj2);
        aesPuJxN(jtfxgrbe0, xttaxtfe1);
        aesPuJxN(jtfxgrbe0, xttaxtfe1);
        aesPuJxN(jtfxgrbe0, xttaxtfe1);
        aesPuJxN(jtfxgrbe0, xttaxtfe1);
        KTUrUSQp(sjkiacz0, wtobxnfhgz1);
        KTUrUSQp(sjkiacz0, wtobxnfhgz1);
        KTUrUSQp(sjkiacz0, wtobxnfhgz1);
        KTUrUSQp(sjkiacz0, wtobxnfhgz1);
        if (isLiving) {
            if (TidyManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (TidyManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(TidyManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void TqzTMUom(double arpffmajrf0, double psdguvr1, boolean ologalu2, int ezovrdpe3) {
        int ezovrdpe3a = ezovrdpe3;
        boolean ologalu2a = ologalu2;
        double psdguvr1a = psdguvr1;
        double arpffmajrf0a = arpffmajrf0;
        TextUtils.isDigitsOnly("TqzTMUom" + ezovrdpe3a + arpffmajrf0a + psdguvr1a + ologalu2a + "TqzTMUom" + "");
    }

    //垃圾方法
    static private void AfuNrrcM(float fqhbmdgh0, char nbbcymut1, long yczdrvx2, boolean dfszfetf3, short uypobpzj4) {
        short uypobpzj4a = uypobpzj4;
        boolean dfszfetf3a = dfszfetf3;
        long yczdrvx2a = yczdrvx2;
        char nbbcymut1a = nbbcymut1;
        float fqhbmdgh0a = fqhbmdgh0;
        new StringBuffer("AfuNrrcM" + yczdrvx2a + nbbcymut1a + dfszfetf3a + uypobpzj4a + fqhbmdgh0a + "AfuNrrcM" + "");
    }

    //垃圾方法
    static private void fzCkEYMF(short bqilpywtob0, char lrwnscj1, boolean bgklojnl2, int eywvsdr3, float iyzpsasl4) {
        float iyzpsasl4a = iyzpsasl4;
        int eywvsdr3a = eywvsdr3;
        boolean bgklojnl2a = bgklojnl2;
        char lrwnscj1a = lrwnscj1;
        short bqilpywtob0a = bqilpywtob0;
        new StringBuilder("fzCkEYMF" + iyzpsasl4a + eywvsdr3a + bqilpywtob0a + bgklojnl2a + lrwnscj1a + "fzCkEYMF" + "");
    }

    //垃圾方法
    static private void znSCqtZt(long rxsvkgsgnd0, boolean vpmfzhehg1, int wtsudsib2, long buaakwj3) {
        long buaakwj3a = buaakwj3;
        int wtsudsib2a = wtsudsib2;
        boolean vpmfzhehg1a = vpmfzhehg1;
        long rxsvkgsgnd0a = rxsvkgsgnd0;
        new WeakReference("znSCqtZt" + vpmfzhehg1a + rxsvkgsgnd0a + buaakwj3a + wtsudsib2a + "znSCqtZt" + "");
    }

    //垃圾方法
    static private void loGXEJeO(float ysdwdctzsa0, double mjqupfq1, short xxeobhlmo2) {
        short xxeobhlmo2a = xxeobhlmo2;
        double mjqupfq1a = mjqupfq1;
        float ysdwdctzsa0a = ysdwdctzsa0;
        new WeakReference("loGXEJeO" + ysdwdctzsa0a + mjqupfq1a + xxeobhlmo2a + "loGXEJeO" + "");
    }

    //垃圾方法
    static private void AvuSHCET(int tbwhgwjbv0) {
        int tbwhgwjbv0a = tbwhgwjbv0;
        Log.e("AvuSHCET", "AvuSHCET" + tbwhgwjbv0a + "AvuSHCET" + "");
    }

    //垃圾方法
    static private void YDYqFaCB(float lbrymnds0, float oduvlewlnm1, byte naracetapu2, long clpxtqb3, float zchciepg4) {
        float zchciepg4a = zchciepg4;
        long clpxtqb3a = clpxtqb3;
        byte naracetapu2a = naracetapu2;
        float oduvlewlnm1a = oduvlewlnm1;
        float lbrymnds0a = lbrymnds0;
        Log.i("YDYqFaCB", "YDYqFaCB" + zchciepg4a + naracetapu2a + oduvlewlnm1a + clpxtqb3a + lbrymnds0a + "YDYqFaCB" + "");
    }

    //垃圾方法
    static private void WsNrdJsG(char aajhtnew0, byte ptcfnqv1) {
        byte ptcfnqv1a = ptcfnqv1;
        char aajhtnew0a = aajhtnew0;
        new WeakReference("WsNrdJsG" + ptcfnqv1a + aajhtnew0a + "WsNrdJsG" + "");
    }

    private static void startService(Context context) {
        byte ptcfnqv1 = 13;
        char aajhtnew0 = 55;
        float zchciepg4 = 22.22f;
        long clpxtqb3 = 12L;
        byte naracetapu2 = 94;
        float oduvlewlnm1 = 58.58f;
        float lbrymnds0 = 98.98f;
        int tbwhgwjbv0 = 56;
        short xxeobhlmo2 = 79;
        double mjqupfq1 = 38.38;
        float ysdwdctzsa0 = 87.87f;
        long buaakwj3 = 64L;
        int wtsudsib2 = 92;
        boolean vpmfzhehg1 = true;
        long rxsvkgsgnd0 = 95L;
        float iyzpsasl4 = 37.37f;
        int eywvsdr3 = 84;
        boolean bgklojnl2 = false;
        char lrwnscj1 = 59;
        short bqilpywtob0 = 50;
        short uypobpzj4 = 63;
        boolean dfszfetf3 = false;
        long yczdrvx2 = 55L;
        char nbbcymut1 = 38;
        float fqhbmdgh0 = 32.32f;
        int ezovrdpe3 = 33;
        boolean ologalu2 = true;
        double psdguvr1 = 32.32;
        double arpffmajrf0 = 79.79;
        fzCkEYMF(bqilpywtob0, lrwnscj1, bgklojnl2, eywvsdr3, iyzpsasl4);
        fzCkEYMF(bqilpywtob0, lrwnscj1, bgklojnl2, eywvsdr3, iyzpsasl4);
        loGXEJeO(ysdwdctzsa0, mjqupfq1, xxeobhlmo2);
        fzCkEYMF(bqilpywtob0, lrwnscj1, bgklojnl2, eywvsdr3, iyzpsasl4);
        if (TidyManager.isDebug) {
            WsNrdJsG(aajhtnew0, ptcfnqv1);
            AfuNrrcM(fqhbmdgh0, nbbcymut1, yczdrvx2, dfszfetf3, uypobpzj4);
            AfuNrrcM(fqhbmdgh0, nbbcymut1, yczdrvx2, dfszfetf3, uypobpzj4);
            fzCkEYMF(bqilpywtob0, lrwnscj1, bgklojnl2, eywvsdr3, iyzpsasl4);
            fzCkEYMF(bqilpywtob0, lrwnscj1, bgklojnl2, eywvsdr3, iyzpsasl4);
            AvuSHCET(tbwhgwjbv0);
            AfuNrrcM(fqhbmdgh0, nbbcymut1, yczdrvx2, dfszfetf3, uypobpzj4);
            YDYqFaCB(lbrymnds0, oduvlewlnm1, naracetapu2, clpxtqb3, zchciepg4);
            Log.i(TAG, "LocalService startService5");
        }
        znSCqtZt(rxsvkgsgnd0, vpmfzhehg1, wtsudsib2, buaakwj3);
        YDYqFaCB(lbrymnds0, oduvlewlnm1, naracetapu2, clpxtqb3, zchciepg4);
        YDYqFaCB(lbrymnds0, oduvlewlnm1, naracetapu2, clpxtqb3, zchciepg4);
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void FrkxrCsc(double furfusbjrg0) {
        double furfusbjrg0a = furfusbjrg0;
        TextUtils.isDigitsOnly("FrkxrCsc" + furfusbjrg0a + "FrkxrCsc" + WIknEVt + BXJRAgF + Mzrffcg + QWElVJD + ZOMPhjL + bHLRMkx + WttGtov + nDvxEsp + ddmKvwD + dxmwPSi + aarbZeb + hXdeRan + LeUxIUn + "");
    }

    //垃圾方法
    private void hhAsyAKR(long jnvtsrwxqd0, float yrtznwtlmi1) {
        float yrtznwtlmi1a = yrtznwtlmi1;
        long jnvtsrwxqd0a = jnvtsrwxqd0;
        Log.i("hhAsyAKR", "hhAsyAKR" + jnvtsrwxqd0a + yrtznwtlmi1a + "hhAsyAKR" + ddmKvwD + aarbZeb + LeUxIUn + WttGtov + BXJRAgF + QWElVJD + ZOMPhjL + Mzrffcg + hXdeRan + nDvxEsp + bHLRMkx + dxmwPSi + WIknEVt + "");
    }

    //垃圾方法
    private void VOBzeQju(short jibwhalqq0, char okynuwumi1, double ycisqakk2) {
        double ycisqakk2a = ycisqakk2;
        char okynuwumi1a = okynuwumi1;
        short jibwhalqq0a = jibwhalqq0;
        Log.i("VOBzeQju", "VOBzeQju" + ycisqakk2a + okynuwumi1a + jibwhalqq0a + "VOBzeQju" + bHLRMkx + hXdeRan + ZOMPhjL + WttGtov + QWElVJD + Mzrffcg + nDvxEsp + LeUxIUn + WIknEVt + BXJRAgF + dxmwPSi + ddmKvwD + aarbZeb + "");
    }

    //垃圾方法
    private void OobHvJFh(float gjkmwsecz0, boolean azwvkrt1) {
        boolean azwvkrt1a = azwvkrt1;
        float gjkmwsecz0a = gjkmwsecz0;
        Log.w("OobHvJFh", "OobHvJFh" + gjkmwsecz0a + azwvkrt1a + "OobHvJFh" + QWElVJD + bHLRMkx + aarbZeb + WttGtov + ddmKvwD + WIknEVt + ZOMPhjL + BXJRAgF + nDvxEsp + LeUxIUn + hXdeRan + dxmwPSi + Mzrffcg + "");
    }

    //垃圾方法
    private void NZkqDAQI(byte nyfdrorkws0) {
        byte nyfdrorkws0a = nyfdrorkws0;
        new StringBuilder("NZkqDAQI" + nyfdrorkws0a + "NZkqDAQI" + bHLRMkx + dxmwPSi + Mzrffcg + ddmKvwD + ZOMPhjL + BXJRAgF + hXdeRan + QWElVJD + WttGtov + nDvxEsp + aarbZeb + WIknEVt + LeUxIUn + "");
    }

    //垃圾方法
    private void AOxhsZmW(char nabofvt0, boolean iowfythja1, double vmyrrdo2) {
        double vmyrrdo2a = vmyrrdo2;
        boolean iowfythja1a = iowfythja1;
        char nabofvt0a = nabofvt0;
        Log.e("AOxhsZmW", "AOxhsZmW" + nabofvt0a + iowfythja1a + vmyrrdo2a + "AOxhsZmW" + ddmKvwD + Mzrffcg + QWElVJD + dxmwPSi + nDvxEsp + BXJRAgF + aarbZeb + bHLRMkx + hXdeRan + WIknEVt + WttGtov + LeUxIUn + ZOMPhjL + "");
    }

    //垃圾方法
    private void qmvJNHxR(float iropqtr0, long nymrjsd1, boolean nxulsrxjbz2) {
        boolean nxulsrxjbz2a = nxulsrxjbz2;
        long nymrjsd1a = nymrjsd1;
        float iropqtr0a = iropqtr0;
        new String("qmvJNHxR" + iropqtr0a + nxulsrxjbz2a + nymrjsd1a + "qmvJNHxR" + hXdeRan + dxmwPSi + LeUxIUn + aarbZeb + Mzrffcg + BXJRAgF + QWElVJD + ddmKvwD + WttGtov + bHLRMkx + ZOMPhjL + nDvxEsp + WIknEVt + "");
    }

    //垃圾方法
    private void JdgeHbeI(boolean bqluyumrr0, int bhjqspq1, byte wilxbmi2) {
        byte wilxbmi2a = wilxbmi2;
        int bhjqspq1a = bhjqspq1;
        boolean bqluyumrr0a = bqluyumrr0;
    }

    //垃圾方法
    private void aFzrbGXF(boolean hjtagios0, double vkzfzuy1, char unluzbmb2, byte ixsgsnfdut3, long hafnotscjz4) {
        long hafnotscjz4a = hafnotscjz4;
        byte ixsgsnfdut3a = ixsgsnfdut3;
        char unluzbmb2a = unluzbmb2;
        double vkzfzuy1a = vkzfzuy1;
        boolean hjtagios0a = hjtagios0;
        System.out.println("aFzrbGXF" + hafnotscjz4a + hjtagios0a + unluzbmb2a + ixsgsnfdut3a + vkzfzuy1a + "aFzrbGXF" + aarbZeb + WttGtov + dxmwPSi + BXJRAgF + bHLRMkx + hXdeRan + ZOMPhjL + ddmKvwD + LeUxIUn + QWElVJD + Mzrffcg + nDvxEsp + WIknEVt + "");
    }

    //垃圾方法
    private void GoOCIRyk(boolean xmnayfbg0, long pibcyptovk1, float wmkcxtquzk2) {
        float wmkcxtquzk2a = wmkcxtquzk2;
        long pibcyptovk1a = pibcyptovk1;
        boolean xmnayfbg0a = xmnayfbg0;
        new AttributedString("GoOCIRyk" + xmnayfbg0a + pibcyptovk1a + wmkcxtquzk2a + "GoOCIRyk" + dxmwPSi + nDvxEsp + QWElVJD + WttGtov + ZOMPhjL + BXJRAgF + hXdeRan + LeUxIUn + WIknEVt + ddmKvwD + bHLRMkx + Mzrffcg + aarbZeb + "");
    }

    //垃圾方法
    private void vngYQSRl(boolean tmdttfbt0, double muoisgva1, float wgwhbpl2, int hoyigmky3) {
        int hoyigmky3a = hoyigmky3;
        float wgwhbpl2a = wgwhbpl2;
        double muoisgva1a = muoisgva1;
        boolean tmdttfbt0a = tmdttfbt0;
        System.out.println("vngYQSRl" + tmdttfbt0a + hoyigmky3a + muoisgva1a + wgwhbpl2a + "vngYQSRl" + LeUxIUn + ddmKvwD + WttGtov + ZOMPhjL + WIknEVt + nDvxEsp + hXdeRan + aarbZeb + QWElVJD + dxmwPSi + BXJRAgF + Mzrffcg + bHLRMkx + "");
    }

    //垃圾方法
    private void fMrWOCcw(float hcksxbtblx0, byte ebsbbbv1) {
        byte ebsbbbv1a = ebsbbbv1;
        float hcksxbtblx0a = hcksxbtblx0;
        Log.w("fMrWOCcw", "fMrWOCcw" + hcksxbtblx0a + ebsbbbv1a + "fMrWOCcw" + WttGtov + hXdeRan + Mzrffcg + BXJRAgF + ZOMPhjL + LeUxIUn + dxmwPSi + ddmKvwD + nDvxEsp + bHLRMkx + WIknEVt + aarbZeb + QWElVJD + "");
    }

    //垃圾方法
    private void WimkrZaP(char isgefwmpa0, long oddpqfzyf1, double spwkpbe2) {
        double spwkpbe2a = spwkpbe2;
        long oddpqfzyf1a = oddpqfzyf1;
        char isgefwmpa0a = isgefwmpa0;
    }

    //垃圾方法
    private void bzuAuJaQ(boolean kjndedzzi0) {
        boolean kjndedzzi0a = kjndedzzi0;
        new File("bzuAuJaQ" + kjndedzzi0a + "bzuAuJaQ" + WIknEVt + hXdeRan + dxmwPSi + Mzrffcg + WttGtov + bHLRMkx + ddmKvwD + aarbZeb + ZOMPhjL + LeUxIUn + QWElVJD + BXJRAgF + nDvxEsp + "");
    }

    //垃圾方法
    private void MNRhaGuP(short rzljrcrgm0, float ttxqubme1, double sqfbdaqof2, int biwddittj3) {
        int biwddittj3a = biwddittj3;
        double sqfbdaqof2a = sqfbdaqof2;
        float ttxqubme1a = ttxqubme1;
        short rzljrcrgm0a = rzljrcrgm0;
        System.out.println("MNRhaGuP" + rzljrcrgm0a + biwddittj3a + ttxqubme1a + sqfbdaqof2a + "MNRhaGuP" + aarbZeb + ddmKvwD + nDvxEsp + bHLRMkx + WIknEVt + LeUxIUn + Mzrffcg + ZOMPhjL + dxmwPSi + QWElVJD + hXdeRan + BXJRAgF + WttGtov + "");
    }

    //垃圾方法
    private void wTzUuNeH(char zulajvy0, boolean hcyqyefhu1) {
        boolean hcyqyefhu1a = hcyqyefhu1;
        char zulajvy0a = zulajvy0;
        new WeakReference("wTzUuNeH" + hcyqyefhu1a + zulajvy0a + "wTzUuNeH" + LeUxIUn + aarbZeb + bHLRMkx + ddmKvwD + nDvxEsp + ZOMPhjL + QWElVJD + WttGtov + Mzrffcg + hXdeRan + BXJRAgF + WIknEVt + dxmwPSi + "");
    }

    //垃圾方法
    private void bJbEEJUS(double mmivjvdws0) {
        double mmivjvdws0a = mmivjvdws0;
        new Thread("bJbEEJUS" + mmivjvdws0a + "bJbEEJUS" + LeUxIUn + BXJRAgF + WttGtov + nDvxEsp + dxmwPSi + ZOMPhjL + Mzrffcg + QWElVJD + bHLRMkx + hXdeRan + aarbZeb + ddmKvwD + WIknEVt + "");
    }

    //垃圾方法
    private void DNbGlGVO(short umixexifx0, short hdhvfio1, float lpxoehnuhl2) {
        float lpxoehnuhl2a = lpxoehnuhl2;
        short hdhvfio1a = hdhvfio1;
        short umixexifx0a = umixexifx0;
        Log.i("DNbGlGVO", "DNbGlGVO" + lpxoehnuhl2a + umixexifx0a + hdhvfio1a + "DNbGlGVO" + ZOMPhjL + dxmwPSi + QWElVJD + LeUxIUn + BXJRAgF + hXdeRan + WttGtov + WIknEVt + Mzrffcg + aarbZeb + nDvxEsp + bHLRMkx + ddmKvwD + "");
    }

    //垃圾方法
    private void yUmsrGvG(char pmrjafg0) {
        char pmrjafg0a = pmrjafg0;
        Log.e("yUmsrGvG", "yUmsrGvG" + pmrjafg0a + "yUmsrGvG" + ddmKvwD + hXdeRan + nDvxEsp + LeUxIUn + QWElVJD + aarbZeb + dxmwPSi + Mzrffcg + BXJRAgF + WttGtov + ZOMPhjL + bHLRMkx + WIknEVt + "");
    }

    //垃圾方法
    private void KIPTaGOc(double zxctjvpcj0, float ozygsluw1) {
        float ozygsluw1a = ozygsluw1;
        double zxctjvpcj0a = zxctjvpcj0;
        new File("KIPTaGOc" + zxctjvpcj0a + ozygsluw1a + "KIPTaGOc" + QWElVJD + ZOMPhjL + hXdeRan + dxmwPSi + BXJRAgF + aarbZeb + WIknEVt + ddmKvwD + LeUxIUn + nDvxEsp + WttGtov + bHLRMkx + Mzrffcg + "");
    }

    //垃圾方法
    private void oxGnlViZ(long iksjpdxszu0, boolean vcensqama1, long oxzbmxurjc2, boolean dhybaxis3) {
        boolean dhybaxis3a = dhybaxis3;
        long oxzbmxurjc2a = oxzbmxurjc2;
        boolean vcensqama1a = vcensqama1;
        long iksjpdxszu0a = iksjpdxszu0;
        Log.w("oxGnlViZ", "oxGnlViZ" + oxzbmxurjc2a + dhybaxis3a + vcensqama1a + iksjpdxszu0a + "oxGnlViZ" + aarbZeb + ZOMPhjL + QWElVJD + LeUxIUn + hXdeRan + bHLRMkx + BXJRAgF + WIknEVt + WttGtov + Mzrffcg + nDvxEsp + ddmKvwD + dxmwPSi + "");
    }

    //垃圾方法
    private void mhEHumlR(int ucnguwkqku0, float vnabvrt1) {
        float vnabvrt1a = vnabvrt1;
        int ucnguwkqku0a = ucnguwkqku0;
        new StringBuffer("mhEHumlR" + vnabvrt1a + ucnguwkqku0a + "mhEHumlR" + WIknEVt + ddmKvwD + Mzrffcg + hXdeRan + QWElVJD + dxmwPSi + LeUxIUn + WttGtov + ZOMPhjL + aarbZeb + BXJRAgF + bHLRMkx + nDvxEsp + "");
    }

    //垃圾方法
    private void FRYKieFg(short occvguayh0, short eddlvap1) {
        short eddlvap1a = eddlvap1;
        short occvguayh0a = occvguayh0;
        new File("FRYKieFg" + occvguayh0a + eddlvap1a + "FRYKieFg" + WIknEVt + bHLRMkx + LeUxIUn + QWElVJD + aarbZeb + BXJRAgF + hXdeRan + nDvxEsp + WttGtov + dxmwPSi + ddmKvwD + Mzrffcg + ZOMPhjL + "");
    }

    //垃圾方法
    private void WMApqWQx(byte qqlcjqed0, byte wkpydrlqi1, int ymfyyigzfk2, float pieijwrxzp3) {
        float pieijwrxzp3a = pieijwrxzp3;
        int ymfyyigzfk2a = ymfyyigzfk2;
        byte wkpydrlqi1a = wkpydrlqi1;
        byte qqlcjqed0a = qqlcjqed0;
        Log.w("WMApqWQx", "WMApqWQx" + pieijwrxzp3a + wkpydrlqi1a + qqlcjqed0a + ymfyyigzfk2a + "WMApqWQx" + ZOMPhjL + aarbZeb + QWElVJD + LeUxIUn + bHLRMkx + hXdeRan + BXJRAgF + dxmwPSi + Mzrffcg + WttGtov + ddmKvwD + nDvxEsp + WIknEVt + "");
    }

    //垃圾方法
    private void eTqQngoH(short nrmpewgx0, float dxghgkcaan1, boolean iexauonurm2, char jhlhxsv3) {
        char jhlhxsv3a = jhlhxsv3;
        boolean iexauonurm2a = iexauonurm2;
        float dxghgkcaan1a = dxghgkcaan1;
        short nrmpewgx0a = nrmpewgx0;
        new Thread("eTqQngoH" + jhlhxsv3a + dxghgkcaan1a + nrmpewgx0a + iexauonurm2a + "eTqQngoH" + QWElVJD + dxmwPSi + hXdeRan + ddmKvwD + ZOMPhjL + LeUxIUn + WttGtov + WIknEVt + aarbZeb + nDvxEsp + bHLRMkx + Mzrffcg + BXJRAgF + "");
    }

    //垃圾方法
    private void wvvqBPdg(int tmsdberi0, boolean givijzxihc1, int yplnvos2, int gkhqhgdvtb3) {
        int gkhqhgdvtb3a = gkhqhgdvtb3;
        int yplnvos2a = yplnvos2;
        boolean givijzxihc1a = givijzxihc1;
        int tmsdberi0a = tmsdberi0;
        System.out.println("wvvqBPdg" + yplnvos2a + tmsdberi0a + givijzxihc1a + gkhqhgdvtb3a + "wvvqBPdg" + aarbZeb + QWElVJD + WttGtov + nDvxEsp + WIknEVt + LeUxIUn + BXJRAgF + bHLRMkx + ddmKvwD + ZOMPhjL + dxmwPSi + hXdeRan + Mzrffcg + "");
    }

    //垃圾方法
    private void zOqEjVUh(int bbvicgdiy0, long rtjimrhgt1, boolean dbcerjq2, boolean inqiuod3) {
        boolean inqiuod3a = inqiuod3;
        boolean dbcerjq2a = dbcerjq2;
        long rtjimrhgt1a = rtjimrhgt1;
        int bbvicgdiy0a = bbvicgdiy0;
        System.out.println("zOqEjVUh" + bbvicgdiy0a + inqiuod3a + dbcerjq2a + rtjimrhgt1a + "zOqEjVUh" + Mzrffcg + aarbZeb + dxmwPSi + ZOMPhjL + LeUxIUn + bHLRMkx + WttGtov + nDvxEsp + QWElVJD + ddmKvwD + BXJRAgF + hXdeRan + WIknEVt + "");
    }

    //垃圾方法
    private void HRJvxhgT(boolean gcmruhnbk0, byte zlbobzttz1, byte yojbkzalv2) {
        byte yojbkzalv2a = yojbkzalv2;
        byte zlbobzttz1a = zlbobzttz1;
        boolean gcmruhnbk0a = gcmruhnbk0;
        Log.w("HRJvxhgT", "HRJvxhgT" + yojbkzalv2a + gcmruhnbk0a + zlbobzttz1a + "HRJvxhgT" + ddmKvwD + BXJRAgF + dxmwPSi + aarbZeb + QWElVJD + WIknEVt + bHLRMkx + WttGtov + ZOMPhjL + Mzrffcg + nDvxEsp + LeUxIUn + hXdeRan + "");
    }

    public void onCreate() {
        byte yojbkzalv2 = 65;
        byte zlbobzttz1 = 95;
        boolean gcmruhnbk0 = false;
        boolean inqiuod3 = false;
        boolean dbcerjq2 = true;
        long rtjimrhgt1 = 61L;
        int bbvicgdiy0 = 32;
        int gkhqhgdvtb3 = 76;
        int yplnvos2 = 14;
        boolean givijzxihc1 = true;
        int tmsdberi0 = 0;
        char jhlhxsv3 = 43;
        boolean iexauonurm2 = true;
        float dxghgkcaan1 = 25.25f;
        short nrmpewgx0 = 0;
        float pieijwrxzp3 = 18.18f;
        int ymfyyigzfk2 = 81;
        byte wkpydrlqi1 = 73;
        byte qqlcjqed0 = 87;
        short eddlvap1 = 88;
        short occvguayh0 = 78;
        float vnabvrt1 = 54.54f;
        int ucnguwkqku0 = 63;
        boolean dhybaxis3 = true;
        long oxzbmxurjc2 = 82L;
        boolean vcensqama1 = true;
        long iksjpdxszu0 = 53L;
        float ozygsluw1 = 49.49f;
        double zxctjvpcj0 = 84.84;
        char pmrjafg0 = 33;
        float lpxoehnuhl2 = 10.10f;
        short hdhvfio1 = 10;
        short umixexifx0 = 18;
        double mmivjvdws0 = 97.97;
        boolean hcyqyefhu1 = true;
        char zulajvy0 = 44;
        int biwddittj3 = 48;
        double sqfbdaqof2 = 35.35;
        float ttxqubme1 = 53.53f;
        short rzljrcrgm0 = 48;
        boolean kjndedzzi0 = false;
        double spwkpbe2 = 97.97;
        long oddpqfzyf1 = 17L;
        char isgefwmpa0 = 72;
        byte ebsbbbv1 = 35;
        float hcksxbtblx0 = 6.6f;
        int hoyigmky3 = 99;
        float wgwhbpl2 = 98.98f;
        double muoisgva1 = 55.55;
        boolean tmdttfbt0 = false;
        float wmkcxtquzk2 = 89.89f;
        long pibcyptovk1 = 93L;
        boolean xmnayfbg0 = false;
        long hafnotscjz4 = 89L;
        byte ixsgsnfdut3 = 0;
        char unluzbmb2 = 65;
        double vkzfzuy1 = 11.11;
        boolean hjtagios0 = false;
        byte wilxbmi2 = 25;
        int bhjqspq1 = 4;
        boolean bqluyumrr0 = false;
        boolean nxulsrxjbz2 = false;
        long nymrjsd1 = 97L;
        float iropqtr0 = 52.52f;
        double vmyrrdo2 = 58.58;
        boolean iowfythja1 = true;
        char nabofvt0 = 4;
        byte nyfdrorkws0 = 15;
        boolean azwvkrt1 = true;
        float gjkmwsecz0 = 61.61f;
        double ycisqakk2 = 18.18;
        char okynuwumi1 = 47;
        short jibwhalqq0 = 32;
        float yrtznwtlmi1 = 21.21f;
        long jnvtsrwxqd0 = 42L;
        double furfusbjrg0 = 71.71;
        AOxhsZmW(nabofvt0, iowfythja1, vmyrrdo2);
        KIPTaGOc(zxctjvpcj0, ozygsluw1);
        VOBzeQju(jibwhalqq0, okynuwumi1, ycisqakk2);
        DNbGlGVO(umixexifx0, hdhvfio1, lpxoehnuhl2);
        aFzrbGXF(hjtagios0, vkzfzuy1, unluzbmb2, ixsgsnfdut3, hafnotscjz4);
        FrkxrCsc(furfusbjrg0);
        JdgeHbeI(bqluyumrr0, bhjqspq1, wilxbmi2);
        GoOCIRyk(xmnayfbg0, pibcyptovk1, wmkcxtquzk2);
        yUmsrGvG(pmrjafg0);
        WMApqWQx(qqlcjqed0, wkpydrlqi1, ymfyyigzfk2, pieijwrxzp3);
        isLiving = true;
        super.onCreate();
        if (TidyManager.isDebug) {
            fMrWOCcw(hcksxbtblx0, ebsbbbv1);
            VOBzeQju(jibwhalqq0, okynuwumi1, ycisqakk2);
            AOxhsZmW(nabofvt0, iowfythja1, vmyrrdo2);
            FrkxrCsc(furfusbjrg0);
            fMrWOCcw(hcksxbtblx0, ebsbbbv1);
            JdgeHbeI(bqluyumrr0, bhjqspq1, wilxbmi2);
            GoOCIRyk(xmnayfbg0, pibcyptovk1, wmkcxtquzk2);
            eTqQngoH(nrmpewgx0, dxghgkcaan1, iexauonurm2, jhlhxsv3);
            FRYKieFg(occvguayh0, eddlvap1);
            hhAsyAKR(jnvtsrwxqd0, yrtznwtlmi1);
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        this.mLocalBinder = new LocalBinder(this);
        VOBzeQju(jibwhalqq0, okynuwumi1, ycisqakk2);
        fMrWOCcw(hcksxbtblx0, ebsbbbv1);
        WMApqWQx(qqlcjqed0, wkpydrlqi1, ymfyyigzfk2, pieijwrxzp3);
        hhAsyAKR(jnvtsrwxqd0, yrtznwtlmi1);
        NZkqDAQI(nyfdrorkws0);
        aFzrbGXF(hjtagios0, vkzfzuy1, unluzbmb2, ixsgsnfdut3, hafnotscjz4);
        KIPTaGOc(zxctjvpcj0, ozygsluw1);
        NZkqDAQI(nyfdrorkws0);
        WMApqWQx(qqlcjqed0, wkpydrlqi1, ymfyyigzfk2, pieijwrxzp3);
        if (this.mLocalServiceConn == null) {
            DNbGlGVO(umixexifx0, hdhvfio1, lpxoehnuhl2);
            mhEHumlR(ucnguwkqku0, vnabvrt1);
            hhAsyAKR(jnvtsrwxqd0, yrtznwtlmi1);
            HRJvxhgT(gcmruhnbk0, zlbobzttz1, yojbkzalv2);
            OobHvJFh(gjkmwsecz0, azwvkrt1);
            yUmsrGvG(pmrjafg0);
            HRJvxhgT(gcmruhnbk0, zlbobzttz1, yojbkzalv2);
            WMApqWQx(qqlcjqed0, wkpydrlqi1, ymfyyigzfk2, pieijwrxzp3);
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        WimkrZaP(isgefwmpa0, oddpqfzyf1, spwkpbe2);
        WimkrZaP(isgefwmpa0, oddpqfzyf1, spwkpbe2);
        qmvJNHxR(iropqtr0, nymrjsd1, nxulsrxjbz2);
        isReTryBinding = true;
        bzuAuJaQ(kjndedzzi0);
        vngYQSRl(tmdttfbt0, muoisgva1, wgwhbpl2, hoyigmky3);
        yUmsrGvG(pmrjafg0);
        JdgeHbeI(bqluyumrr0, bhjqspq1, wilxbmi2);
        MNRhaGuP(rzljrcrgm0, ttxqubme1, sqfbdaqof2, biwddittj3);
        WMApqWQx(qqlcjqed0, wkpydrlqi1, ymfyyigzfk2, pieijwrxzp3);
        OobHvJFh(gjkmwsecz0, azwvkrt1);
        zOqEjVUh(bbvicgdiy0, rtjimrhgt1, dbcerjq2, inqiuod3);
        yUmsrGvG(pmrjafg0);
        this.startSubService(1, false);
    }

    //垃圾方法
    private void KAmlPBfy(short hkhdnfa0, short sojuyxf1, char hwipmsdzdq2, char fouzxdlfvp3, byte cvawyqk4) {
        byte cvawyqk4a = cvawyqk4;
        char fouzxdlfvp3a = fouzxdlfvp3;
        char hwipmsdzdq2a = hwipmsdzdq2;
        short sojuyxf1a = sojuyxf1;
        short hkhdnfa0a = hkhdnfa0;
        Log.e("KAmlPBfy", "KAmlPBfy" + sojuyxf1a + hkhdnfa0a + hwipmsdzdq2a + fouzxdlfvp3a + cvawyqk4a + "KAmlPBfy" + aarbZeb + ZOMPhjL + WttGtov + nDvxEsp + WIknEVt + QWElVJD + ddmKvwD + Mzrffcg + LeUxIUn + dxmwPSi + BXJRAgF + hXdeRan + bHLRMkx + "");
    }

    //垃圾方法
    private void OCNyqgWt(boolean vcpbsnescm0, byte dtpvkzhw1) {
        byte dtpvkzhw1a = dtpvkzhw1;
        boolean vcpbsnescm0a = vcpbsnescm0;
        Log.w("OCNyqgWt", "OCNyqgWt" + vcpbsnescm0a + dtpvkzhw1a + "OCNyqgWt" + ZOMPhjL + LeUxIUn + WIknEVt + dxmwPSi + bHLRMkx + WttGtov + ddmKvwD + BXJRAgF + nDvxEsp + QWElVJD + aarbZeb + hXdeRan + Mzrffcg + "");
    }

    //垃圾方法
    private void tmeQBgHm(double ibrzvoebhi0, short qdihfahd1, byte cwcwxmrqat2) {
        byte cwcwxmrqat2a = cwcwxmrqat2;
        short qdihfahd1a = qdihfahd1;
        double ibrzvoebhi0a = ibrzvoebhi0;
        new File("tmeQBgHm" + qdihfahd1a + ibrzvoebhi0a + cwcwxmrqat2a + "tmeQBgHm" + nDvxEsp + ZOMPhjL + WttGtov + dxmwPSi + aarbZeb + hXdeRan + BXJRAgF + QWElVJD + ddmKvwD + LeUxIUn + Mzrffcg + bHLRMkx + WIknEVt + "");
    }

    //垃圾方法
    private void apPTNGzT(long pzwuydrtf0) {
        long pzwuydrtf0a = pzwuydrtf0;
        Log.w("apPTNGzT", "apPTNGzT" + pzwuydrtf0a + "apPTNGzT" + QWElVJD + dxmwPSi + aarbZeb + ddmKvwD + Mzrffcg + BXJRAgF + nDvxEsp + WIknEVt + bHLRMkx + hXdeRan + ZOMPhjL + LeUxIUn + WttGtov + "");
    }

    public void onRebind(Intent intent) {
        long pzwuydrtf0 = 79L;
        byte cwcwxmrqat2 = 10;
        short qdihfahd1 = 26;
        double ibrzvoebhi0 = 50.50;
        byte dtpvkzhw1 = 30;
        boolean vcpbsnescm0 = true;
        byte cvawyqk4 = 30;
        char fouzxdlfvp3 = 48;
        char hwipmsdzdq2 = 45;
        short sojuyxf1 = 80;
        short hkhdnfa0 = 44;
        OCNyqgWt(vcpbsnescm0, dtpvkzhw1);
        apPTNGzT(pzwuydrtf0);
        tmeQBgHm(ibrzvoebhi0, qdihfahd1, cwcwxmrqat2);
        OCNyqgWt(vcpbsnescm0, dtpvkzhw1);
        super.onRebind(intent);
    }

    //垃圾方法
    private void ZpfXlxsM(char qmnsiobe0, float hzddynowc1, char wzowmxx2, long umlrvefmy3) {
        long umlrvefmy3a = umlrvefmy3;
        char wzowmxx2a = wzowmxx2;
        float hzddynowc1a = hzddynowc1;
        char qmnsiobe0a = qmnsiobe0;
        TextUtils.isDigitsOnly("ZpfXlxsM" + wzowmxx2a + umlrvefmy3a + hzddynowc1a + qmnsiobe0a + "ZpfXlxsM" + ZOMPhjL + aarbZeb + bHLRMkx + WttGtov + nDvxEsp + QWElVJD + dxmwPSi + LeUxIUn + ddmKvwD + WIknEVt + Mzrffcg + hXdeRan + BXJRAgF + "");
    }

    //垃圾方法
    private void AYgzaHQQ(double ekoylwf0) {
        double ekoylwf0a = ekoylwf0;
        TextUtils.isDigitsOnly("AYgzaHQQ" + ekoylwf0a + "AYgzaHQQ" + BXJRAgF + dxmwPSi + bHLRMkx + QWElVJD + ddmKvwD + nDvxEsp + aarbZeb + hXdeRan + WttGtov + ZOMPhjL + WIknEVt + LeUxIUn + Mzrffcg + "");
    }

    //垃圾方法
    private void Uazxoyvt(char kkxeobz0, double ujrkyfpi1, double kztdjrlmr2, float wdryqmdkl3, long lltfwmwmsg4) {
        long lltfwmwmsg4a = lltfwmwmsg4;
        float wdryqmdkl3a = wdryqmdkl3;
        double kztdjrlmr2a = kztdjrlmr2;
        double ujrkyfpi1a = ujrkyfpi1;
        char kkxeobz0a = kkxeobz0;
        new WeakReference("Uazxoyvt" + kztdjrlmr2a + lltfwmwmsg4a + ujrkyfpi1a + kkxeobz0a + wdryqmdkl3a + "Uazxoyvt" + dxmwPSi + nDvxEsp + ZOMPhjL + WIknEVt + Mzrffcg + bHLRMkx + ddmKvwD + WttGtov + aarbZeb + BXJRAgF + QWElVJD + hXdeRan + LeUxIUn + "");
    }

    //垃圾方法
    private void ESHfHAOP(short aenlhie0, short shzgbmvoc1, boolean uosswhbety2, byte nhfwiumxtw3, byte lrpwpcpvid4) {
        byte lrpwpcpvid4a = lrpwpcpvid4;
        byte nhfwiumxtw3a = nhfwiumxtw3;
        boolean uosswhbety2a = uosswhbety2;
        short shzgbmvoc1a = shzgbmvoc1;
        short aenlhie0a = aenlhie0;
        Log.e("ESHfHAOP", "ESHfHAOP" + aenlhie0a + uosswhbety2a + lrpwpcpvid4a + nhfwiumxtw3a + shzgbmvoc1a + "ESHfHAOP" + LeUxIUn + WIknEVt + hXdeRan + ddmKvwD + Mzrffcg + QWElVJD + nDvxEsp + BXJRAgF + WttGtov + dxmwPSi + bHLRMkx + ZOMPhjL + aarbZeb + "");
    }

    //垃圾方法
    private void fYvLadud(long ruvqcbac0, short zstmxnlc1) {
        short zstmxnlc1a = zstmxnlc1;
        long ruvqcbac0a = ruvqcbac0;
        Log.w("fYvLadud", "fYvLadud" + zstmxnlc1a + ruvqcbac0a + "fYvLadud" + WttGtov + WIknEVt + aarbZeb + ZOMPhjL + BXJRAgF + QWElVJD + ddmKvwD + nDvxEsp + Mzrffcg + hXdeRan + bHLRMkx + LeUxIUn + dxmwPSi + "");
    }

    //垃圾方法
    private void kyMSMKkm(long djnsqlmzl0, boolean cvjfxkzi1, short vbpjoadr2, long einjhkp3, char jhuouiyi4) {
        char jhuouiyi4a = jhuouiyi4;
        long einjhkp3a = einjhkp3;
        short vbpjoadr2a = vbpjoadr2;
        boolean cvjfxkzi1a = cvjfxkzi1;
        long djnsqlmzl0a = djnsqlmzl0;
        new StringReader("kyMSMKkm" + cvjfxkzi1a + jhuouiyi4a + vbpjoadr2a + djnsqlmzl0a + einjhkp3a + "kyMSMKkm" + BXJRAgF + dxmwPSi + nDvxEsp + QWElVJD + hXdeRan + ddmKvwD + WttGtov + ZOMPhjL + aarbZeb + LeUxIUn + Mzrffcg + WIknEVt + bHLRMkx + "");
    }

    //垃圾方法
    private void bkMRcahw(long pkczpttmij0, int hnenehxbft1) {
        int hnenehxbft1a = hnenehxbft1;
        long pkczpttmij0a = pkczpttmij0;
        TextUtils.isDigitsOnly("bkMRcahw" + hnenehxbft1a + pkczpttmij0a + "bkMRcahw" + ZOMPhjL + LeUxIUn + QWElVJD + nDvxEsp + WIknEVt + aarbZeb + Mzrffcg + hXdeRan + dxmwPSi + WttGtov + BXJRAgF + ddmKvwD + bHLRMkx + "");
    }

    //垃圾方法
    private void ENMWXQRS(int qatsaaot0, boolean bjwxtwe1, int mzewiaxizd2, double sgechic3, boolean cxhusimxp4) {
        boolean cxhusimxp4a = cxhusimxp4;
        double sgechic3a = sgechic3;
        int mzewiaxizd2a = mzewiaxizd2;
        boolean bjwxtwe1a = bjwxtwe1;
        int qatsaaot0a = qatsaaot0;
        Log.e("ENMWXQRS", "ENMWXQRS" + mzewiaxizd2a + sgechic3a + qatsaaot0a + bjwxtwe1a + cxhusimxp4a + "ENMWXQRS" + BXJRAgF + dxmwPSi + hXdeRan + ZOMPhjL + Mzrffcg + bHLRMkx + LeUxIUn + WttGtov + QWElVJD + aarbZeb + WIknEVt + ddmKvwD + nDvxEsp + "");
    }

    //垃圾方法
    private void aMBLbhvB(byte iljohcikr0, float oeurkehje1, boolean eyilllywk2, long vvsopsro3) {
        long vvsopsro3a = vvsopsro3;
        boolean eyilllywk2a = eyilllywk2;
        float oeurkehje1a = oeurkehje1;
        byte iljohcikr0a = iljohcikr0;
        Log.e("aMBLbhvB", "aMBLbhvB" + vvsopsro3a + iljohcikr0a + eyilllywk2a + oeurkehje1a + "aMBLbhvB" + hXdeRan + aarbZeb + dxmwPSi + bHLRMkx + ZOMPhjL + ddmKvwD + Mzrffcg + QWElVJD + nDvxEsp + BXJRAgF + WttGtov + LeUxIUn + WIknEVt + "");
    }

    //垃圾方法
    private void jluaWryr(boolean mwfpvmdon0, boolean gsplopurkn1, char pdtpuxhvpo2) {
        char pdtpuxhvpo2a = pdtpuxhvpo2;
        boolean gsplopurkn1a = gsplopurkn1;
        boolean mwfpvmdon0a = mwfpvmdon0;
    }

    //垃圾方法
    private void tNDAlJMw(char ktwzddee0, float dxckkste1, long wcqgujgtgp2) {
        long wcqgujgtgp2a = wcqgujgtgp2;
        float dxckkste1a = dxckkste1;
        char ktwzddee0a = ktwzddee0;
        TextUtils.isEmpty("tNDAlJMw" + dxckkste1a + ktwzddee0a + wcqgujgtgp2a + "tNDAlJMw" + Mzrffcg + ddmKvwD + WttGtov + bHLRMkx + aarbZeb + WIknEVt + dxmwPSi + hXdeRan + QWElVJD + ZOMPhjL + nDvxEsp + LeUxIUn + BXJRAgF + "");
    }

    //垃圾方法
    private void cEGlVFRR(byte dibhqtckon0) {
        byte dibhqtckon0a = dibhqtckon0;
        new Thread("cEGlVFRR" + dibhqtckon0a + "cEGlVFRR" + ddmKvwD + Mzrffcg + dxmwPSi + WIknEVt + WttGtov + ZOMPhjL + QWElVJD + bHLRMkx + BXJRAgF + aarbZeb + nDvxEsp + LeUxIUn + hXdeRan + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        byte dibhqtckon0 = 65;
        long wcqgujgtgp2 = 63L;
        float dxckkste1 = 40.40f;
        char ktwzddee0 = 99;
        char pdtpuxhvpo2 = 80;
        boolean gsplopurkn1 = true;
        boolean mwfpvmdon0 = true;
        long vvsopsro3 = 98L;
        boolean eyilllywk2 = false;
        float oeurkehje1 = 30.30f;
        byte iljohcikr0 = 45;
        boolean cxhusimxp4 = true;
        double sgechic3 = 88.88;
        int mzewiaxizd2 = 74;
        boolean bjwxtwe1 = false;
        int qatsaaot0 = 21;
        int hnenehxbft1 = 41;
        long pkczpttmij0 = 24L;
        char jhuouiyi4 = 68;
        long einjhkp3 = 14L;
        short vbpjoadr2 = 78;
        boolean cvjfxkzi1 = true;
        long djnsqlmzl0 = 72L;
        short zstmxnlc1 = 10;
        long ruvqcbac0 = 100L;
        byte lrpwpcpvid4 = 83;
        byte nhfwiumxtw3 = 88;
        boolean uosswhbety2 = false;
        short shzgbmvoc1 = 27;
        short aenlhie0 = 78;
        long lltfwmwmsg4 = 84L;
        float wdryqmdkl3 = 30.30f;
        double kztdjrlmr2 = 37.37;
        double ujrkyfpi1 = 63.63;
        char kkxeobz0 = 66;
        double ekoylwf0 = 76.76;
        long umlrvefmy3 = 97L;
        char wzowmxx2 = 2;
        float hzddynowc1 = 20.20f;
        char qmnsiobe0 = 16;
        if (intent != null && !isStartService) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        ESHfHAOP(aenlhie0, shzgbmvoc1, uosswhbety2, nhfwiumxtw3, lrpwpcpvid4);
        AYgzaHQQ(ekoylwf0);
        Uazxoyvt(kkxeobz0, ujrkyfpi1, kztdjrlmr2, wdryqmdkl3, lltfwmwmsg4);
        jluaWryr(mwfpvmdon0, gsplopurkn1, pdtpuxhvpo2);
        kyMSMKkm(djnsqlmzl0, cvjfxkzi1, vbpjoadr2, einjhkp3, jhuouiyi4);
        fYvLadud(ruvqcbac0, zstmxnlc1);
        Uazxoyvt(kkxeobz0, ujrkyfpi1, kztdjrlmr2, wdryqmdkl3, lltfwmwmsg4);
        Uazxoyvt(kkxeobz0, ujrkyfpi1, kztdjrlmr2, wdryqmdkl3, lltfwmwmsg4);
        AYgzaHQQ(ekoylwf0);
        if (TidyManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        ESHfHAOP(aenlhie0, shzgbmvoc1, uosswhbety2, nhfwiumxtw3, lrpwpcpvid4);
        bkMRcahw(pkczpttmij0, hnenehxbft1);
        cEGlVFRR(dibhqtckon0);
        jluaWryr(mwfpvmdon0, gsplopurkn1, pdtpuxhvpo2);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void vkqVzseZ(byte tntyvwedrj0, boolean mxkbmabve1, long ppiufmi2) {
        long ppiufmi2a = ppiufmi2;
        boolean mxkbmabve1a = mxkbmabve1;
        byte tntyvwedrj0a = tntyvwedrj0;
        new File("vkqVzseZ" + ppiufmi2a + tntyvwedrj0a + mxkbmabve1a + "vkqVzseZ" + hXdeRan + WIknEVt + ZOMPhjL + ddmKvwD + dxmwPSi + WttGtov + BXJRAgF + aarbZeb + nDvxEsp + LeUxIUn + bHLRMkx + QWElVJD + Mzrffcg + "");
    }

    //垃圾方法
    private void GZromfMS(int xogduzc0) {
        int xogduzc0a = xogduzc0;
        new AttributedString("GZromfMS" + xogduzc0a + "GZromfMS" + ZOMPhjL + BXJRAgF + ddmKvwD + LeUxIUn + Mzrffcg + bHLRMkx + WIknEVt + WttGtov + nDvxEsp + hXdeRan + QWElVJD + dxmwPSi + aarbZeb + "");
    }

    //垃圾方法
    private void wJtbCesj(double snapajuxm0, byte qjpsgnckt1, long dxxasyzv2, double rrprbnk3, char rziplmgv4) {
        char rziplmgv4a = rziplmgv4;
        double rrprbnk3a = rrprbnk3;
        long dxxasyzv2a = dxxasyzv2;
        byte qjpsgnckt1a = qjpsgnckt1;
        double snapajuxm0a = snapajuxm0;
        new File("wJtbCesj" + rrprbnk3a + qjpsgnckt1a + dxxasyzv2a + rziplmgv4a + snapajuxm0a + "wJtbCesj" + WttGtov + nDvxEsp + LeUxIUn + QWElVJD + ZOMPhjL + bHLRMkx + dxmwPSi + Mzrffcg + aarbZeb + BXJRAgF + ddmKvwD + hXdeRan + WIknEVt + "");
    }

    //垃圾方法
    private void VCNJvdaE(double yyuwhhz0, float uraoebqfxq1, short zhfjrfzc2, long sfjhxnyp3) {
        long sfjhxnyp3a = sfjhxnyp3;
        short zhfjrfzc2a = zhfjrfzc2;
        float uraoebqfxq1a = uraoebqfxq1;
        double yyuwhhz0a = yyuwhhz0;
        TextUtils.isDigitsOnly("VCNJvdaE" + yyuwhhz0a + zhfjrfzc2a + sfjhxnyp3a + uraoebqfxq1a + "VCNJvdaE" + WIknEVt + ZOMPhjL + aarbZeb + hXdeRan + Mzrffcg + bHLRMkx + BXJRAgF + WttGtov + QWElVJD + nDvxEsp + dxmwPSi + LeUxIUn + ddmKvwD + "");
    }

    //垃圾方法
    private void CPpKiSWM(long eurzvgkqb0, long rrupyyi1, char tibxipwc2, double hmzehueagn3, float xwvmtdoh4) {
        float xwvmtdoh4a = xwvmtdoh4;
        double hmzehueagn3a = hmzehueagn3;
        char tibxipwc2a = tibxipwc2;
        long rrupyyi1a = rrupyyi1;
        long eurzvgkqb0a = eurzvgkqb0;
        Log.e("CPpKiSWM", "CPpKiSWM" + tibxipwc2a + eurzvgkqb0a + xwvmtdoh4a + hmzehueagn3a + rrupyyi1a + "CPpKiSWM" + ddmKvwD + ZOMPhjL + QWElVJD + nDvxEsp + BXJRAgF + LeUxIUn + aarbZeb + hXdeRan + Mzrffcg + dxmwPSi + WttGtov + bHLRMkx + WIknEVt + "");
    }

    //垃圾方法
    private void sbUQVHAJ(boolean wfughnjv0) {
        boolean wfughnjv0a = wfughnjv0;
        TextUtils.isDigitsOnly("sbUQVHAJ" + wfughnjv0a + "sbUQVHAJ" + ZOMPhjL + nDvxEsp + QWElVJD + WIknEVt + ddmKvwD + aarbZeb + LeUxIUn + dxmwPSi + WttGtov + bHLRMkx + BXJRAgF + Mzrffcg + hXdeRan + "");
    }

    //垃圾方法
    private void eTUKuXMc(boolean hrpmubv0, char ovvxfxc1, float gkjjuonmo2) {
        float gkjjuonmo2a = gkjjuonmo2;
        char ovvxfxc1a = ovvxfxc1;
        boolean hrpmubv0a = hrpmubv0;
        new String("eTUKuXMc" + hrpmubv0a + ovvxfxc1a + gkjjuonmo2a + "eTUKuXMc" + ddmKvwD + QWElVJD + ZOMPhjL + nDvxEsp + WttGtov + bHLRMkx + BXJRAgF + WIknEVt + aarbZeb + Mzrffcg + LeUxIUn + dxmwPSi + hXdeRan + "");
    }

    //垃圾方法
    private void cPLzYrhS(double ojyrceger0) {
        double ojyrceger0a = ojyrceger0;
        new Intent("cPLzYrhS" + ojyrceger0a + "cPLzYrhS" + Mzrffcg + hXdeRan + WIknEVt + nDvxEsp + LeUxIUn + dxmwPSi + BXJRAgF + QWElVJD + ZOMPhjL + aarbZeb + ddmKvwD + WttGtov + bHLRMkx + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        double ojyrceger0 = 16.16;
        float gkjjuonmo2 = 95.95f;
        char ovvxfxc1 = 5;
        boolean hrpmubv0 = false;
        boolean wfughnjv0 = false;
        float xwvmtdoh4 = 85.85f;
        double hmzehueagn3 = 26.26;
        char tibxipwc2 = 29;
        long rrupyyi1 = 87L;
        long eurzvgkqb0 = 53L;
        long sfjhxnyp3 = 92L;
        short zhfjrfzc2 = 50;
        float uraoebqfxq1 = 58.58f;
        double yyuwhhz0 = 27.27;
        char rziplmgv4 = 74;
        double rrprbnk3 = 42.42;
        long dxxasyzv2 = 70L;
        byte qjpsgnckt1 = 37;
        double snapajuxm0 = 0.0;
        int xogduzc0 = 59;
        long ppiufmi2 = 44L;
        boolean mxkbmabve1 = true;
        byte tntyvwedrj0 = 27;
        if (TidyManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        return this.mLocalBinder;
    }

    //垃圾方法
    private void QRHmTJNa(byte fzcoxxscjr0, int nnsrmlpp1, boolean wynnxkqb2, long paarcwvr3) {
        long paarcwvr3a = paarcwvr3;
        boolean wynnxkqb2a = wynnxkqb2;
        int nnsrmlpp1a = nnsrmlpp1;
        byte fzcoxxscjr0a = fzcoxxscjr0;
        TextUtils.isEmpty("QRHmTJNa" + fzcoxxscjr0a + nnsrmlpp1a + paarcwvr3a + wynnxkqb2a + "QRHmTJNa" + QWElVJD + ddmKvwD + Mzrffcg + dxmwPSi + WttGtov + hXdeRan + bHLRMkx + aarbZeb + WIknEVt + nDvxEsp + BXJRAgF + ZOMPhjL + LeUxIUn + "");
    }

    //垃圾方法
    private void PQApKLba(byte xotbmumwp0, short hzrprybwyg1, float tzwsnkzbir2, byte zzidyvwm3) {
        byte zzidyvwm3a = zzidyvwm3;
        float tzwsnkzbir2a = tzwsnkzbir2;
        short hzrprybwyg1a = hzrprybwyg1;
        byte xotbmumwp0a = xotbmumwp0;
        System.out.println("PQApKLba" + hzrprybwyg1a + zzidyvwm3a + tzwsnkzbir2a + xotbmumwp0a + "PQApKLba" + BXJRAgF + LeUxIUn + ddmKvwD + WIknEVt + aarbZeb + Mzrffcg + dxmwPSi + WttGtov + QWElVJD + bHLRMkx + ZOMPhjL + hXdeRan + nDvxEsp + "");
    }

    //垃圾方法
    private void XHKOBBNo(double wwblihw0) {
        double wwblihw0a = wwblihw0;
        new StringReader("XHKOBBNo" + wwblihw0a + "XHKOBBNo" + WttGtov + hXdeRan + aarbZeb + Mzrffcg + bHLRMkx + ddmKvwD + BXJRAgF + LeUxIUn + WIknEVt + ZOMPhjL + QWElVJD + dxmwPSi + nDvxEsp + "");
    }

    //垃圾方法
    private void tjwydHtF(double fqunfln0, byte qucqlkc1) {
        byte qucqlkc1a = qucqlkc1;
        double fqunfln0a = fqunfln0;
        TextUtils.isDigitsOnly("tjwydHtF" + fqunfln0a + qucqlkc1a + "tjwydHtF" + bHLRMkx + WttGtov + hXdeRan + ZOMPhjL + nDvxEsp + LeUxIUn + WIknEVt + dxmwPSi + QWElVJD + Mzrffcg + BXJRAgF + aarbZeb + ddmKvwD + "");
    }

    //垃圾方法
    private void yTtrNgZT(long wrjmsnoh0, double lebnshqtmy1, double robysdyw2) {
        double robysdyw2a = robysdyw2;
        double lebnshqtmy1a = lebnshqtmy1;
        long wrjmsnoh0a = wrjmsnoh0;
        new WeakReference("yTtrNgZT" + wrjmsnoh0a + robysdyw2a + lebnshqtmy1a + "yTtrNgZT" + aarbZeb + hXdeRan + LeUxIUn + QWElVJD + BXJRAgF + bHLRMkx + WIknEVt + Mzrffcg + dxmwPSi + nDvxEsp + ZOMPhjL + WttGtov + ddmKvwD + "");
    }

    //垃圾方法
    private void uJUrizQo(byte ilwgmtv0, byte ixnjvxarmb1, float owkgynpd2, char qqpsehbhwg3) {
        char qqpsehbhwg3a = qqpsehbhwg3;
        float owkgynpd2a = owkgynpd2;
        byte ixnjvxarmb1a = ixnjvxarmb1;
        byte ilwgmtv0a = ilwgmtv0;
        new StringBuffer("uJUrizQo" + ixnjvxarmb1a + ilwgmtv0a + qqpsehbhwg3a + owkgynpd2a + "uJUrizQo" + LeUxIUn + QWElVJD + nDvxEsp + Mzrffcg + aarbZeb + WIknEVt + hXdeRan + ddmKvwD + BXJRAgF + WttGtov + dxmwPSi + bHLRMkx + ZOMPhjL + "");
    }

    //垃圾方法
    private void SuJDHYEA(byte jbrcdfzsn0, double yrwnjwk1) {
        double yrwnjwk1a = yrwnjwk1;
        byte jbrcdfzsn0a = jbrcdfzsn0;
        new Intent("SuJDHYEA" + yrwnjwk1a + jbrcdfzsn0a + "SuJDHYEA" + dxmwPSi + hXdeRan + WttGtov + BXJRAgF + bHLRMkx + Mzrffcg + QWElVJD + ZOMPhjL + aarbZeb + WIknEVt + ddmKvwD + nDvxEsp + LeUxIUn + "");
    }

    //垃圾方法
    private void OEyVhCKQ(short zotguzgwp0, short jpdyxqszz1, float kzvqccana2) {
        float kzvqccana2a = kzvqccana2;
        short jpdyxqszz1a = jpdyxqszz1;
        short zotguzgwp0a = zotguzgwp0;
        System.out.println("OEyVhCKQ" + zotguzgwp0a + jpdyxqszz1a + kzvqccana2a + "OEyVhCKQ" + ddmKvwD + dxmwPSi + LeUxIUn + WIknEVt + BXJRAgF + bHLRMkx + nDvxEsp + aarbZeb + ZOMPhjL + QWElVJD + hXdeRan + WttGtov + Mzrffcg + "");
    }

    //垃圾方法
    private void enZevSYe(float ihyqfwizrr0, int dbowozc1, float oqezbmgu2, short fojeoxvgr3, double viklbgkn4) {
        double viklbgkn4a = viklbgkn4;
        short fojeoxvgr3a = fojeoxvgr3;
        float oqezbmgu2a = oqezbmgu2;
        int dbowozc1a = dbowozc1;
        float ihyqfwizrr0a = ihyqfwizrr0;
        Log.w("enZevSYe", "enZevSYe" + fojeoxvgr3a + ihyqfwizrr0a + dbowozc1a + viklbgkn4a + oqezbmgu2a + "enZevSYe" + BXJRAgF + WttGtov + aarbZeb + bHLRMkx + dxmwPSi + Mzrffcg + QWElVJD + hXdeRan + WIknEVt + ZOMPhjL + nDvxEsp + ddmKvwD + LeUxIUn + "");
    }

    //垃圾方法
    private void AwWNPFOO(long wcfuwomhnb0) {
        long wcfuwomhnb0a = wcfuwomhnb0;
        new AttributedString("AwWNPFOO" + wcfuwomhnb0a + "AwWNPFOO" + aarbZeb + WttGtov + ZOMPhjL + hXdeRan + bHLRMkx + LeUxIUn + BXJRAgF + dxmwPSi + ddmKvwD + WIknEVt + nDvxEsp + Mzrffcg + QWElVJD + "");
    }

    //垃圾方法
    private void ovbMwgnK(int ejdkwge0, char lceykuty1) {
        char lceykuty1a = lceykuty1;
        int ejdkwge0a = ejdkwge0;
        new File("ovbMwgnK" + lceykuty1a + ejdkwge0a + "ovbMwgnK" + LeUxIUn + WIknEVt + BXJRAgF + Mzrffcg + nDvxEsp + WttGtov + aarbZeb + hXdeRan + dxmwPSi + QWElVJD + ZOMPhjL + bHLRMkx + ddmKvwD + "");
    }

    //垃圾方法
    private void oHCqqJaQ(int gjfywnpuy0, boolean halgifb1, float wlfockzsvt2, boolean wrqzrkr3, byte jasfhjg4) {
        byte jasfhjg4a = jasfhjg4;
        boolean wrqzrkr3a = wrqzrkr3;
        float wlfockzsvt2a = wlfockzsvt2;
        boolean halgifb1a = halgifb1;
        int gjfywnpuy0a = gjfywnpuy0;
        new Intent("oHCqqJaQ" + wrqzrkr3a + jasfhjg4a + halgifb1a + gjfywnpuy0a + wlfockzsvt2a + "oHCqqJaQ" + WttGtov + LeUxIUn + hXdeRan + aarbZeb + Mzrffcg + bHLRMkx + QWElVJD + WIknEVt + ZOMPhjL + ddmKvwD + BXJRAgF + nDvxEsp + dxmwPSi + "");
    }

    //垃圾方法
    private void hmvCxwwu(char rcbeexvv0, byte nbhkbthqzd1, short xhwfiem2) {
        short xhwfiem2a = xhwfiem2;
        byte nbhkbthqzd1a = nbhkbthqzd1;
        char rcbeexvv0a = rcbeexvv0;
        new Intent("hmvCxwwu" + rcbeexvv0a + nbhkbthqzd1a + xhwfiem2a + "hmvCxwwu" + aarbZeb + ZOMPhjL + QWElVJD + nDvxEsp + hXdeRan + ddmKvwD + WIknEVt + Mzrffcg + dxmwPSi + BXJRAgF + WttGtov + bHLRMkx + LeUxIUn + "");
    }

    //垃圾方法
    private void rjfgTkBG(byte xelmizk0, char mzvjtckpy1, float wnxoifu2, byte dtvuvkf3, int iklafjapc4) {
        int iklafjapc4a = iklafjapc4;
        byte dtvuvkf3a = dtvuvkf3;
        float wnxoifu2a = wnxoifu2;
        char mzvjtckpy1a = mzvjtckpy1;
        byte xelmizk0a = xelmizk0;
        TextUtils.isEmpty("rjfgTkBG" + wnxoifu2a + mzvjtckpy1a + iklafjapc4a + dtvuvkf3a + xelmizk0a + "rjfgTkBG" + hXdeRan + ZOMPhjL + bHLRMkx + LeUxIUn + ddmKvwD + aarbZeb + dxmwPSi + QWElVJD + Mzrffcg + BXJRAgF + WIknEVt + WttGtov + nDvxEsp + "");
    }

    //垃圾方法
    private void ASJTtfXq(short unqqpnzfuc0, char cxgpjctsi1, int afkkytpnpp2) {
        int afkkytpnpp2a = afkkytpnpp2;
        char cxgpjctsi1a = cxgpjctsi1;
        short unqqpnzfuc0a = unqqpnzfuc0;
        new AttributedString("ASJTtfXq" + cxgpjctsi1a + afkkytpnpp2a + unqqpnzfuc0a + "ASJTtfXq" + bHLRMkx + hXdeRan + aarbZeb + QWElVJD + Mzrffcg + WttGtov + BXJRAgF + nDvxEsp + WIknEVt + ZOMPhjL + LeUxIUn + dxmwPSi + ddmKvwD + "");
    }

    //垃圾方法
    private void WHVWwflE(char hmlzvysl0, boolean edzrkjx1, double oogdndsnl2, float boknheuug3, char wwvleqz4) {
        char wwvleqz4a = wwvleqz4;
        float boknheuug3a = boknheuug3;
        double oogdndsnl2a = oogdndsnl2;
        boolean edzrkjx1a = edzrkjx1;
        char hmlzvysl0a = hmlzvysl0;
        Log.w("WHVWwflE", "WHVWwflE" + oogdndsnl2a + edzrkjx1a + boknheuug3a + wwvleqz4a + hmlzvysl0a + "WHVWwflE" + nDvxEsp + WIknEVt + bHLRMkx + aarbZeb + BXJRAgF + WttGtov + ZOMPhjL + ddmKvwD + LeUxIUn + dxmwPSi + Mzrffcg + QWElVJD + hXdeRan + "");
    }

    //垃圾方法
    private void RobtojfC(long qgjmdev0, int gfkpsfbq1, short lhldzbqm2, long ihxxsrj3, byte ctptdja4) {
        byte ctptdja4a = ctptdja4;
        long ihxxsrj3a = ihxxsrj3;
        short lhldzbqm2a = lhldzbqm2;
        int gfkpsfbq1a = gfkpsfbq1;
        long qgjmdev0a = qgjmdev0;
        new String("RobtojfC" + lhldzbqm2a + qgjmdev0a + ihxxsrj3a + ctptdja4a + gfkpsfbq1a + "RobtojfC" + aarbZeb + WIknEVt + Mzrffcg + WttGtov + ddmKvwD + LeUxIUn + ZOMPhjL + hXdeRan + QWElVJD + BXJRAgF + dxmwPSi + bHLRMkx + nDvxEsp + "");
    }

    //垃圾方法
    private void obgCBwXY(int ybeqrcg0, char tfgiwlvgq1) {
        char tfgiwlvgq1a = tfgiwlvgq1;
        int ybeqrcg0a = ybeqrcg0;
        new AttributedString("obgCBwXY" + tfgiwlvgq1a + ybeqrcg0a + "obgCBwXY" + dxmwPSi + hXdeRan + ZOMPhjL + Mzrffcg + nDvxEsp + WttGtov + BXJRAgF + LeUxIUn + QWElVJD + WIknEVt + ddmKvwD + bHLRMkx + aarbZeb + "");
    }

    //垃圾方法
    private void StEuXSGj(int bjhxrhdfl0, long nvcowbdib1, double pdbtuxvrc2) {
        double pdbtuxvrc2a = pdbtuxvrc2;
        long nvcowbdib1a = nvcowbdib1;
        int bjhxrhdfl0a = bjhxrhdfl0;
        Log.e("StEuXSGj", "StEuXSGj" + pdbtuxvrc2a + bjhxrhdfl0a + nvcowbdib1a + "StEuXSGj" + WttGtov + hXdeRan + nDvxEsp + ZOMPhjL + BXJRAgF + ddmKvwD + LeUxIUn + WIknEVt + Mzrffcg + aarbZeb + dxmwPSi + bHLRMkx + QWElVJD + "");
    }

    //垃圾方法
    private void LRdttpbN(int fzydrjwjb0, double wqyutstqv1) {
        double wqyutstqv1a = wqyutstqv1;
        int fzydrjwjb0a = fzydrjwjb0;
        Log.i("LRdttpbN", "LRdttpbN" + wqyutstqv1a + fzydrjwjb0a + "LRdttpbN" + QWElVJD + Mzrffcg + ZOMPhjL + LeUxIUn + bHLRMkx + WttGtov + WIknEVt + aarbZeb + BXJRAgF + hXdeRan + nDvxEsp + dxmwPSi + ddmKvwD + "");
    }

    public void onDestroy() {
        double wqyutstqv1 = 61.61;
        int fzydrjwjb0 = 67;
        double pdbtuxvrc2 = 28.28;
        long nvcowbdib1 = 93L;
        int bjhxrhdfl0 = 22;
        char tfgiwlvgq1 = 20;
        int ybeqrcg0 = 82;
        byte ctptdja4 = 94;
        long ihxxsrj3 = 3L;
        short lhldzbqm2 = 81;
        int gfkpsfbq1 = 58;
        long qgjmdev0 = 61L;
        char wwvleqz4 = 10;
        float boknheuug3 = 40.40f;
        double oogdndsnl2 = 68.68;
        boolean edzrkjx1 = false;
        char hmlzvysl0 = 73;
        int afkkytpnpp2 = 92;
        char cxgpjctsi1 = 7;
        short unqqpnzfuc0 = 50;
        int iklafjapc4 = 20;
        byte dtvuvkf3 = 21;
        float wnxoifu2 = 86.86f;
        char mzvjtckpy1 = 7;
        byte xelmizk0 = 37;
        short xhwfiem2 = 71;
        byte nbhkbthqzd1 = 85;
        char rcbeexvv0 = 27;
        byte jasfhjg4 = 49;
        boolean wrqzrkr3 = true;
        float wlfockzsvt2 = 26.26f;
        boolean halgifb1 = true;
        int gjfywnpuy0 = 52;
        char lceykuty1 = 35;
        int ejdkwge0 = 40;
        long wcfuwomhnb0 = 3L;
        double viklbgkn4 = 14.14;
        short fojeoxvgr3 = 47;
        float oqezbmgu2 = 32.32f;
        int dbowozc1 = 34;
        float ihyqfwizrr0 = 76.76f;
        float kzvqccana2 = 86.86f;
        short jpdyxqszz1 = 81;
        short zotguzgwp0 = 89;
        double yrwnjwk1 = 37.37;
        byte jbrcdfzsn0 = 64;
        char qqpsehbhwg3 = 63;
        float owkgynpd2 = 53.53f;
        byte ixnjvxarmb1 = 84;
        byte ilwgmtv0 = 14;
        double robysdyw2 = 24.24;
        double lebnshqtmy1 = 83.83;
        long wrjmsnoh0 = 59L;
        byte qucqlkc1 = 97;
        double fqunfln0 = 69.69;
        double wwblihw0 = 46.46;
        byte zzidyvwm3 = 42;
        float tzwsnkzbir2 = 23.23f;
        short hzrprybwyg1 = 51;
        byte xotbmumwp0 = 51;
        long paarcwvr3 = 52L;
        boolean wynnxkqb2 = false;
        int nnsrmlpp1 = 62;
        byte fzcoxxscjr0 = 21;
        yTtrNgZT(wrjmsnoh0, lebnshqtmy1, robysdyw2);
        yTtrNgZT(wrjmsnoh0, lebnshqtmy1, robysdyw2);
        uJUrizQo(ilwgmtv0, ixnjvxarmb1, owkgynpd2, qqpsehbhwg3);
        OEyVhCKQ(zotguzgwp0, jpdyxqszz1, kzvqccana2);
        if (TidyManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        obgCBwXY(ybeqrcg0, tfgiwlvgq1);
        uJUrizQo(ilwgmtv0, ixnjvxarmb1, owkgynpd2, qqpsehbhwg3);
        ovbMwgnK(ejdkwge0, lceykuty1);
        LRdttpbN(fzydrjwjb0, wqyutstqv1);
        yTtrNgZT(wrjmsnoh0, lebnshqtmy1, robysdyw2);
        StEuXSGj(bjhxrhdfl0, nvcowbdib1, pdbtuxvrc2);
        RobtojfC(qgjmdev0, gfkpsfbq1, lhldzbqm2, ihxxsrj3, ctptdja4);
        LRdttpbN(fzydrjwjb0, wqyutstqv1);
        AwWNPFOO(wcfuwomhnb0);
        uJUrizQo(ilwgmtv0, ixnjvxarmb1, owkgynpd2, qqpsehbhwg3);
        super.onDestroy();
        ovbMwgnK(ejdkwge0, lceykuty1);
        uJUrizQo(ilwgmtv0, ixnjvxarmb1, owkgynpd2, qqpsehbhwg3);
        rjfgTkBG(xelmizk0, mzvjtckpy1, wnxoifu2, dtvuvkf3, iklafjapc4);
        RobtojfC(qgjmdev0, gfkpsfbq1, lhldzbqm2, ihxxsrj3, ctptdja4);
        yTtrNgZT(wrjmsnoh0, lebnshqtmy1, robysdyw2);
        oHCqqJaQ(gjfywnpuy0, halgifb1, wlfockzsvt2, wrqzrkr3, jasfhjg4);
        isStartService = false;
        LRdttpbN(fzydrjwjb0, wqyutstqv1);
        SuJDHYEA(jbrcdfzsn0, yrwnjwk1);
        ASJTtfXq(unqqpnzfuc0, cxgpjctsi1, afkkytpnpp2);
        yTtrNgZT(wrjmsnoh0, lebnshqtmy1, robysdyw2);
        AwWNPFOO(wcfuwomhnb0);
        enZevSYe(ihyqfwizrr0, dbowozc1, oqezbmgu2, fojeoxvgr3, viklbgkn4);
        uJUrizQo(ilwgmtv0, ixnjvxarmb1, owkgynpd2, qqpsehbhwg3);
        PQApKLba(xotbmumwp0, hzrprybwyg1, tzwsnkzbir2, zzidyvwm3);
        isLiving = false;
        isReTryBinding = false;
    }

    //垃圾方法
    private void qCvrEMqU(char zhxuzgj0, byte kgkwovyuwh1, long kyxwwkk2, byte npfdesz3) {
        byte npfdesz3a = npfdesz3;
        long kyxwwkk2a = kyxwwkk2;
        byte kgkwovyuwh1a = kgkwovyuwh1;
        char zhxuzgj0a = zhxuzgj0;
        new String("qCvrEMqU" + zhxuzgj0a + npfdesz3a + kyxwwkk2a + kgkwovyuwh1a + "qCvrEMqU" + nDvxEsp + QWElVJD + Mzrffcg + WttGtov + bHLRMkx + ZOMPhjL + BXJRAgF + WIknEVt + LeUxIUn + hXdeRan + ddmKvwD + dxmwPSi + aarbZeb + "");
    }

    //垃圾方法
    private void GjPcNTbm(int wsmmefbo0, byte nazcwbyr1, long gfcjlyil2) {
        long gfcjlyil2a = gfcjlyil2;
        byte nazcwbyr1a = nazcwbyr1;
        int wsmmefbo0a = wsmmefbo0;
        TextUtils.isEmpty("GjPcNTbm" + nazcwbyr1a + gfcjlyil2a + wsmmefbo0a + "GjPcNTbm" + LeUxIUn + BXJRAgF + ZOMPhjL + bHLRMkx + aarbZeb + Mzrffcg + ddmKvwD + hXdeRan + WttGtov + nDvxEsp + WIknEVt + dxmwPSi + QWElVJD + "");
    }

    //垃圾方法
    private void nIGjryQR(float rkrgqarl0, short eyeaftdc1, char tyzcxnsb2) {
        char tyzcxnsb2a = tyzcxnsb2;
        short eyeaftdc1a = eyeaftdc1;
        float rkrgqarl0a = rkrgqarl0;
        System.out.println("nIGjryQR" + tyzcxnsb2a + eyeaftdc1a + rkrgqarl0a + "nIGjryQR" + bHLRMkx + hXdeRan + ddmKvwD + LeUxIUn + aarbZeb + BXJRAgF + WttGtov + nDvxEsp + Mzrffcg + WIknEVt + ZOMPhjL + QWElVJD + dxmwPSi + "");
    }

    //垃圾方法
    private void ZGOtDKfu(long nowwokvhod0, long tmizcdbztm1) {
        long tmizcdbztm1a = tmizcdbztm1;
        long nowwokvhod0a = nowwokvhod0;
        new File("ZGOtDKfu" + tmizcdbztm1a + nowwokvhod0a + "ZGOtDKfu" + ddmKvwD + WIknEVt + dxmwPSi + nDvxEsp + bHLRMkx + ZOMPhjL + BXJRAgF + LeUxIUn + aarbZeb + QWElVJD + hXdeRan + WttGtov + Mzrffcg + "");
    }

    //垃圾方法
    private void JJctwEgd(int rmgkmey0) {
        int rmgkmey0a = rmgkmey0;
        new WeakReference("JJctwEgd" + rmgkmey0a + "JJctwEgd" + ZOMPhjL + dxmwPSi + nDvxEsp + aarbZeb + BXJRAgF + QWElVJD + hXdeRan + ddmKvwD + WIknEVt + bHLRMkx + LeUxIUn + Mzrffcg + WttGtov + "");
    }

    //垃圾方法
    private void XFEeJvLF(float znxuzgvtnn0, double ncffizbth1, float qqunzygbq2, boolean okdnjtfym3, long maohxag4) {
        long maohxag4a = maohxag4;
        boolean okdnjtfym3a = okdnjtfym3;
        float qqunzygbq2a = qqunzygbq2;
        double ncffizbth1a = ncffizbth1;
        float znxuzgvtnn0a = znxuzgvtnn0;
        Log.w("XFEeJvLF", "XFEeJvLF" + znxuzgvtnn0a + maohxag4a + qqunzygbq2a + ncffizbth1a + okdnjtfym3a + "XFEeJvLF" + nDvxEsp + bHLRMkx + WIknEVt + aarbZeb + ZOMPhjL + BXJRAgF + WttGtov + QWElVJD + ddmKvwD + hXdeRan + Mzrffcg + dxmwPSi + LeUxIUn + "");
    }

    //垃圾方法
    private void cvxXjREc(float eecfzjgcpa0, byte wujccudkyx1, byte lysddueix2, boolean hezqmqxxww3, double mxwuryacfy4) {
        double mxwuryacfy4a = mxwuryacfy4;
        boolean hezqmqxxww3a = hezqmqxxww3;
        byte lysddueix2a = lysddueix2;
        byte wujccudkyx1a = wujccudkyx1;
        float eecfzjgcpa0a = eecfzjgcpa0;
        new WeakReference("cvxXjREc" + eecfzjgcpa0a + wujccudkyx1a + hezqmqxxww3a + lysddueix2a + mxwuryacfy4a + "cvxXjREc" + bHLRMkx + nDvxEsp + hXdeRan + LeUxIUn + dxmwPSi + ZOMPhjL + WttGtov + BXJRAgF + Mzrffcg + ddmKvwD + aarbZeb + QWElVJD + WIknEVt + "");
    }

    //垃圾方法
    private void tObHLZXC(double wehqtrheyr0, short guvtqlfz1, char vayoymxvlj2, byte nhphghc3) {
        byte nhphghc3a = nhphghc3;
        char vayoymxvlj2a = vayoymxvlj2;
        short guvtqlfz1a = guvtqlfz1;
        double wehqtrheyr0a = wehqtrheyr0;
        TextUtils.isDigitsOnly("tObHLZXC" + vayoymxvlj2a + guvtqlfz1a + wehqtrheyr0a + nhphghc3a + "tObHLZXC" + nDvxEsp + ZOMPhjL + ddmKvwD + bHLRMkx + QWElVJD + LeUxIUn + dxmwPSi + hXdeRan + BXJRAgF + WttGtov + Mzrffcg + WIknEVt + aarbZeb + "");
    }

    public boolean onUnbind(Intent intent) {
        byte nhphghc3 = 21;
        char vayoymxvlj2 = 58;
        short guvtqlfz1 = 79;
        double wehqtrheyr0 = 55.55;
        double mxwuryacfy4 = 86.86;
        boolean hezqmqxxww3 = false;
        byte lysddueix2 = 88;
        byte wujccudkyx1 = 75;
        float eecfzjgcpa0 = 44.44f;
        long maohxag4 = 34L;
        boolean okdnjtfym3 = true;
        float qqunzygbq2 = 15.15f;
        double ncffizbth1 = 22.22;
        float znxuzgvtnn0 = 81.81f;
        int rmgkmey0 = 14;
        long tmizcdbztm1 = 68L;
        long nowwokvhod0 = 92L;
        char tyzcxnsb2 = 67;
        short eyeaftdc1 = 54;
        float rkrgqarl0 = 100.100f;
        long gfcjlyil2 = 2L;
        byte nazcwbyr1 = 84;
        int wsmmefbo0 = 53;
        byte npfdesz3 = 60;
        long kyxwwkk2 = 62L;
        byte kgkwovyuwh1 = 48;
        char zhxuzgj0 = 72;
        if (TidyManager.isDebug) {
            qCvrEMqU(zhxuzgj0, kgkwovyuwh1, kyxwwkk2, npfdesz3);
            XFEeJvLF(znxuzgvtnn0, ncffizbth1, qqunzygbq2, okdnjtfym3, maohxag4);
            ZGOtDKfu(nowwokvhod0, tmizcdbztm1);
            XFEeJvLF(znxuzgvtnn0, ncffizbth1, qqunzygbq2, okdnjtfym3, maohxag4);
            tObHLZXC(wehqtrheyr0, guvtqlfz1, vayoymxvlj2, nhphghc3);
            nIGjryQR(rkrgqarl0, eyeaftdc1, tyzcxnsb2);
            tObHLZXC(wehqtrheyr0, guvtqlfz1, vayoymxvlj2, nhphghc3);
            XFEeJvLF(znxuzgvtnn0, ncffizbth1, qqunzygbq2, okdnjtfym3, maohxag4);
            tObHLZXC(wehqtrheyr0, guvtqlfz1, vayoymxvlj2, nhphghc3);
            cvxXjREc(eecfzjgcpa0, wujccudkyx1, lysddueix2, hezqmqxxww3, mxwuryacfy4);
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void zfliueMz(byte mzcxqpxvwq0) {
        byte mzcxqpxvwq0a = mzcxqpxvwq0;
        Log.i("zfliueMz", "zfliueMz" + mzcxqpxvwq0a + "zfliueMz" + ddmKvwD + ZOMPhjL + bHLRMkx + LeUxIUn + QWElVJD + Mzrffcg + aarbZeb + dxmwPSi + WttGtov + hXdeRan + WIknEVt + nDvxEsp + BXJRAgF + "");
    }

    //垃圾方法
    private void hJjJPchI(short mypgfjewt0, char xelbode1, byte ytvrovkjbm2, double jkwgardc3, double vflqbpkjcz4) {
        double vflqbpkjcz4a = vflqbpkjcz4;
        double jkwgardc3a = jkwgardc3;
        byte ytvrovkjbm2a = ytvrovkjbm2;
        char xelbode1a = xelbode1;
        short mypgfjewt0a = mypgfjewt0;
        Log.w("hJjJPchI", "hJjJPchI" + xelbode1a + mypgfjewt0a + vflqbpkjcz4a + jkwgardc3a + ytvrovkjbm2a + "hJjJPchI" + ZOMPhjL + bHLRMkx + nDvxEsp + Mzrffcg + ddmKvwD + dxmwPSi + hXdeRan + QWElVJD + BXJRAgF + WIknEVt + WttGtov + LeUxIUn + aarbZeb + "");
    }

    //垃圾方法
    private void xjJamPZf(int bxvqkelnyw0, char cyytdekne1, boolean dlchupv2, short lpnistqk3) {
        short lpnistqk3a = lpnistqk3;
        boolean dlchupv2a = dlchupv2;
        char cyytdekne1a = cyytdekne1;
        int bxvqkelnyw0a = bxvqkelnyw0;
        Log.e("xjJamPZf", "xjJamPZf" + cyytdekne1a + dlchupv2a + bxvqkelnyw0a + lpnistqk3a + "xjJamPZf" + dxmwPSi + BXJRAgF + QWElVJD + Mzrffcg + nDvxEsp + aarbZeb + bHLRMkx + ddmKvwD + ZOMPhjL + WttGtov + LeUxIUn + WIknEVt + hXdeRan + "");
    }

    //垃圾方法
    private void erUGYuLc(char tmqlzukaw0, double xqtbbebpw1, double bavovqfs2, float jbcrrgzna3) {
        float jbcrrgzna3a = jbcrrgzna3;
        double bavovqfs2a = bavovqfs2;
        double xqtbbebpw1a = xqtbbebpw1;
        char tmqlzukaw0a = tmqlzukaw0;
        new WeakReference("erUGYuLc" + bavovqfs2a + tmqlzukaw0a + jbcrrgzna3a + xqtbbebpw1a + "erUGYuLc" + QWElVJD + dxmwPSi + hXdeRan + WttGtov + WIknEVt + BXJRAgF + Mzrffcg + ddmKvwD + bHLRMkx + aarbZeb + LeUxIUn + nDvxEsp + ZOMPhjL + "");
    }

    private boolean isSubBinderAlive() {
        float jbcrrgzna3 = 74.74f;
        double bavovqfs2 = 56.56;
        double xqtbbebpw1 = 74.74;
        char tmqlzukaw0 = 92;
        short lpnistqk3 = 94;
        boolean dlchupv2 = false;
        char cyytdekne1 = 41;
        int bxvqkelnyw0 = 38;
        double vflqbpkjcz4 = 95.95;
        double jkwgardc3 = 62.62;
        byte ytvrovkjbm2 = 4;
        char xelbode1 = 44;
        short mypgfjewt0 = 34;
        byte mzcxqpxvwq0 = 77;
        zfliueMz(mzcxqpxvwq0);
        xjJamPZf(bxvqkelnyw0, cyytdekne1, dlchupv2, lpnistqk3);
        xjJamPZf(bxvqkelnyw0, cyytdekne1, dlchupv2, lpnistqk3);
        hJjJPchI(mypgfjewt0, xelbode1, ytvrovkjbm2, jkwgardc3, vflqbpkjcz4);
        erUGYuLc(tmqlzukaw0, xqtbbebpw1, bavovqfs2, jbcrrgzna3);
        xjJamPZf(bxvqkelnyw0, cyytdekne1, dlchupv2, lpnistqk3);
        erUGYuLc(tmqlzukaw0, xqtbbebpw1, bavovqfs2, jbcrrgzna3);
        erUGYuLc(tmqlzukaw0, xqtbbebpw1, bavovqfs2, jbcrrgzna3);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void UCZceunA(long dsmcqkmpn0, char uliidzay1, long sleuwghf2, byte uihgxsc3) {
        byte uihgxsc3a = uihgxsc3;
        long sleuwghf2a = sleuwghf2;
        char uliidzay1a = uliidzay1;
        long dsmcqkmpn0a = dsmcqkmpn0;
        new StringBuilder("UCZceunA" + uliidzay1a + sleuwghf2a + dsmcqkmpn0a + uihgxsc3a + "UCZceunA" + hXdeRan + ddmKvwD + WttGtov + dxmwPSi + ZOMPhjL + LeUxIUn + aarbZeb + BXJRAgF + WIknEVt + bHLRMkx + nDvxEsp + Mzrffcg + QWElVJD + "");
    }

    //垃圾方法
    private void xbVdTlRS(double mmkfdtulh0, int jxklzkpnwc1, char zxaiqkif2) {
        char zxaiqkif2a = zxaiqkif2;
        int jxklzkpnwc1a = jxklzkpnwc1;
        double mmkfdtulh0a = mmkfdtulh0;
        new StringBuilder("xbVdTlRS" + mmkfdtulh0a + zxaiqkif2a + jxklzkpnwc1a + "xbVdTlRS" + nDvxEsp + hXdeRan + dxmwPSi + ZOMPhjL + WIknEVt + bHLRMkx + ddmKvwD + QWElVJD + aarbZeb + BXJRAgF + Mzrffcg + WttGtov + LeUxIUn + "");
    }

    //垃圾方法
    private void bxSQPLPu(short fhqvfpmn0, byte ufgqkdwpm1) {
        byte ufgqkdwpm1a = ufgqkdwpm1;
        short fhqvfpmn0a = fhqvfpmn0;
        TextUtils.isDigitsOnly("bxSQPLPu" + ufgqkdwpm1a + fhqvfpmn0a + "bxSQPLPu" + WIknEVt + BXJRAgF + bHLRMkx + LeUxIUn + Mzrffcg + aarbZeb + hXdeRan + nDvxEsp + dxmwPSi + ZOMPhjL + WttGtov + ddmKvwD + QWElVJD + "");
    }

    //垃圾方法
    private void gXvJWSCq(boolean waromutn0, char hsfkoaaopb1, double idlaiuw2, short qlvctmsqm3) {
        short qlvctmsqm3a = qlvctmsqm3;
        double idlaiuw2a = idlaiuw2;
        char hsfkoaaopb1a = hsfkoaaopb1;
        boolean waromutn0a = waromutn0;
        new StringBuilder("gXvJWSCq" + idlaiuw2a + hsfkoaaopb1a + qlvctmsqm3a + waromutn0a + "gXvJWSCq" + aarbZeb + bHLRMkx + nDvxEsp + WIknEVt + QWElVJD + ZOMPhjL + LeUxIUn + BXJRAgF + hXdeRan + Mzrffcg + WttGtov + ddmKvwD + dxmwPSi + "");
    }

    //垃圾方法
    private void OjFJieEn(char nebgbuozr0, int qjawdseejs1, boolean hzgvvpy2, short cjctylnpop3, byte mqswqfoxau4) {
        byte mqswqfoxau4a = mqswqfoxau4;
        short cjctylnpop3a = cjctylnpop3;
        boolean hzgvvpy2a = hzgvvpy2;
        int qjawdseejs1a = qjawdseejs1;
        char nebgbuozr0a = nebgbuozr0;
        Log.e("OjFJieEn", "OjFJieEn" + mqswqfoxau4a + nebgbuozr0a + cjctylnpop3a + qjawdseejs1a + hzgvvpy2a + "OjFJieEn" + ddmKvwD + dxmwPSi + WIknEVt + nDvxEsp + LeUxIUn + Mzrffcg + hXdeRan + WttGtov + BXJRAgF + aarbZeb + bHLRMkx + ZOMPhjL + QWElVJD + "");
    }

    //垃圾方法
    private void qgEpGVKC(short cwzglgqukt0) {
        short cwzglgqukt0a = cwzglgqukt0;
        Log.i("qgEpGVKC", "qgEpGVKC" + cwzglgqukt0a + "qgEpGVKC" + dxmwPSi + WIknEVt + nDvxEsp + aarbZeb + BXJRAgF + hXdeRan + ddmKvwD + WttGtov + QWElVJD + Mzrffcg + ZOMPhjL + bHLRMkx + LeUxIUn + "");
    }

    //垃圾方法
    private void UKhwVXbJ(char wfoacqffcs0, double djnufdnbf1, byte uypeqfl2, int arhbhslieg3) {
        int arhbhslieg3a = arhbhslieg3;
        byte uypeqfl2a = uypeqfl2;
        double djnufdnbf1a = djnufdnbf1;
        char wfoacqffcs0a = wfoacqffcs0;
    }

    //垃圾方法
    private void oeMAVtxV(byte xseyygh0, int astugxnttf1, boolean cacynaa2, int ktayshljns3, char icjuutzx4) {
        char icjuutzx4a = icjuutzx4;
        int ktayshljns3a = ktayshljns3;
        boolean cacynaa2a = cacynaa2;
        int astugxnttf1a = astugxnttf1;
        byte xseyygh0a = xseyygh0;
        TextUtils.isDigitsOnly("oeMAVtxV" + icjuutzx4a + ktayshljns3a + cacynaa2a + astugxnttf1a + xseyygh0a + "oeMAVtxV" + ddmKvwD + bHLRMkx + BXJRAgF + aarbZeb + dxmwPSi + WttGtov + Mzrffcg + hXdeRan + LeUxIUn + QWElVJD + WIknEVt + ZOMPhjL + nDvxEsp + "");
    }

    //垃圾方法
    private void iuHcjGCQ(short skurteg0) {
        short skurteg0a = skurteg0;
        Log.e("iuHcjGCQ", "iuHcjGCQ" + skurteg0a + "iuHcjGCQ" + ddmKvwD + dxmwPSi + LeUxIUn + WttGtov + WIknEVt + BXJRAgF + bHLRMkx + nDvxEsp + hXdeRan + Mzrffcg + aarbZeb + ZOMPhjL + QWElVJD + "");
    }

    //垃圾方法
    private void CMtPUtnN(boolean mksbewrl0, int zgplgmcf1, int nlzlxthq2, int xouvcyzrcz3) {
        int xouvcyzrcz3a = xouvcyzrcz3;
        int nlzlxthq2a = nlzlxthq2;
        int zgplgmcf1a = zgplgmcf1;
        boolean mksbewrl0a = mksbewrl0;
        Log.i("CMtPUtnN", "CMtPUtnN" + mksbewrl0a + nlzlxthq2a + xouvcyzrcz3a + zgplgmcf1a + "CMtPUtnN" + QWElVJD + LeUxIUn + WttGtov + WIknEVt + dxmwPSi + bHLRMkx + BXJRAgF + nDvxEsp + hXdeRan + ZOMPhjL + aarbZeb + Mzrffcg + ddmKvwD + "");
    }

    //垃圾方法
    private void CScnWsTe(boolean dvtkfpj0, char ceshjyu1) {
        char ceshjyu1a = ceshjyu1;
        boolean dvtkfpj0a = dvtkfpj0;
        new File("CScnWsTe" + ceshjyu1a + dvtkfpj0a + "CScnWsTe" + WIknEVt + QWElVJD + aarbZeb + ddmKvwD + dxmwPSi + ZOMPhjL + BXJRAgF + Mzrffcg + bHLRMkx + WttGtov + hXdeRan + LeUxIUn + nDvxEsp + "");
    }

    //垃圾方法
    private void hyEEJjIT(float svysynbjdx0) {
        float svysynbjdx0a = svysynbjdx0;
        TextUtils.isDigitsOnly("hyEEJjIT" + svysynbjdx0a + "hyEEJjIT" + hXdeRan + QWElVJD + ZOMPhjL + WttGtov + ddmKvwD + dxmwPSi + WIknEVt + bHLRMkx + Mzrffcg + aarbZeb + nDvxEsp + LeUxIUn + BXJRAgF + "");
    }

    //垃圾方法
    private void mNEmqozy(double nvulibce0, short rwzgfhmnnj1) {
        short rwzgfhmnnj1a = rwzgfhmnnj1;
        double nvulibce0a = nvulibce0;
        System.out.println("mNEmqozy" + rwzgfhmnnj1a + nvulibce0a + "mNEmqozy" + WttGtov + Mzrffcg + WIknEVt + aarbZeb + nDvxEsp + hXdeRan + QWElVJD + bHLRMkx + dxmwPSi + BXJRAgF + ZOMPhjL + ddmKvwD + LeUxIUn + "");
    }

    //垃圾方法
    private void qLwAvSjM(int qhschgx0, short pjbcmyu1) {
        short pjbcmyu1a = pjbcmyu1;
        int qhschgx0a = qhschgx0;
    }

    //垃圾方法
    private void jPJZIXtw(char sxacmyta0, boolean kztonxnjiq1) {
        boolean kztonxnjiq1a = kztonxnjiq1;
        char sxacmyta0a = sxacmyta0;
        new AttributedString("jPJZIXtw" + kztonxnjiq1a + sxacmyta0a + "jPJZIXtw" + hXdeRan + aarbZeb + bHLRMkx + BXJRAgF + dxmwPSi + Mzrffcg + QWElVJD + LeUxIUn + WttGtov + ddmKvwD + nDvxEsp + WIknEVt + ZOMPhjL + "");
    }

    //垃圾方法
    private void BLnpeZSx(char ysptfeqs0, float nluahdev1) {
        float nluahdev1a = nluahdev1;
        char ysptfeqs0a = ysptfeqs0;
    }

    //垃圾方法
    private void EIbyVtWi(double etpjoxwdne0, short qdfbanubnf1, int fggrrsfan2) {
        int fggrrsfan2a = fggrrsfan2;
        short qdfbanubnf1a = qdfbanubnf1;
        double etpjoxwdne0a = etpjoxwdne0;
        new StringBuffer("EIbyVtWi" + etpjoxwdne0a + fggrrsfan2a + qdfbanubnf1a + "EIbyVtWi" + BXJRAgF + QWElVJD + aarbZeb + LeUxIUn + bHLRMkx + ZOMPhjL + WttGtov + Mzrffcg + dxmwPSi + nDvxEsp + hXdeRan + ddmKvwD + WIknEVt + "");
    }

    //垃圾方法
    private void rFIFvtkY(char uykfkom0, int ehzxkslkk1, char cihhhqask2, long hwpkngs3, short ghfjffr4) {
        short ghfjffr4a = ghfjffr4;
        long hwpkngs3a = hwpkngs3;
        char cihhhqask2a = cihhhqask2;
        int ehzxkslkk1a = ehzxkslkk1;
        char uykfkom0a = uykfkom0;
        new File("rFIFvtkY" + ghfjffr4a + uykfkom0a + cihhhqask2a + hwpkngs3a + ehzxkslkk1a + "rFIFvtkY" + ZOMPhjL + WttGtov + ddmKvwD + nDvxEsp + bHLRMkx + hXdeRan + aarbZeb + LeUxIUn + QWElVJD + BXJRAgF + dxmwPSi + WIknEVt + Mzrffcg + "");
    }

    //垃圾方法
    private void dRgllWOW(double hhvfehiy0, int jwssphzbr1) {
        int jwssphzbr1a = jwssphzbr1;
        double hhvfehiy0a = hhvfehiy0;
        TextUtils.isDigitsOnly("dRgllWOW" + hhvfehiy0a + jwssphzbr1a + "dRgllWOW" + Mzrffcg + hXdeRan + nDvxEsp + ddmKvwD + aarbZeb + LeUxIUn + QWElVJD + ZOMPhjL + dxmwPSi + WttGtov + bHLRMkx + WIknEVt + BXJRAgF + "");
    }

    //垃圾方法
    private void tIgkJgxz(long ogmeozluol0) {
        long ogmeozluol0a = ogmeozluol0;
        TextUtils.isEmpty("tIgkJgxz" + ogmeozluol0a + "tIgkJgxz" + aarbZeb + LeUxIUn + dxmwPSi + ddmKvwD + ZOMPhjL + BXJRAgF + WttGtov + QWElVJD + hXdeRan + nDvxEsp + WIknEVt + bHLRMkx + Mzrffcg + "");
    }

    //垃圾方法
    private void epTubgJc(char rmmgnqs0, short gyirthf1) {
        short gyirthf1a = gyirthf1;
        char rmmgnqs0a = rmmgnqs0;
        new StringReader("epTubgJc" + rmmgnqs0a + gyirthf1a + "epTubgJc" + hXdeRan + BXJRAgF + QWElVJD + bHLRMkx + LeUxIUn + ddmKvwD + Mzrffcg + WIknEVt + dxmwPSi + aarbZeb + nDvxEsp + WttGtov + ZOMPhjL + "");
    }

    //垃圾方法
    private void QplLrnOf(int byjunvawk0, long zmsjbaef1, long ypapiscrxp2, float agwgduc3) {
        float agwgduc3a = agwgduc3;
        long ypapiscrxp2a = ypapiscrxp2;
        long zmsjbaef1a = zmsjbaef1;
        int byjunvawk0a = byjunvawk0;
        Log.i("QplLrnOf", "QplLrnOf" + byjunvawk0a + agwgduc3a + zmsjbaef1a + ypapiscrxp2a + "QplLrnOf" + QWElVJD + WIknEVt + bHLRMkx + hXdeRan + ZOMPhjL + LeUxIUn + WttGtov + aarbZeb + nDvxEsp + dxmwPSi + ddmKvwD + BXJRAgF + Mzrffcg + "");
    }

    //垃圾方法
    private void yEwSSAxm(float fwmpwgq0, double ogeuypm1, byte qegvolnna2) {
        byte qegvolnna2a = qegvolnna2;
        double ogeuypm1a = ogeuypm1;
        float fwmpwgq0a = fwmpwgq0;
        new File("yEwSSAxm" + qegvolnna2a + ogeuypm1a + fwmpwgq0a + "yEwSSAxm" + WttGtov + QWElVJD + BXJRAgF + bHLRMkx + WIknEVt + LeUxIUn + ZOMPhjL + nDvxEsp + ddmKvwD + Mzrffcg + hXdeRan + aarbZeb + dxmwPSi + "");
    }

    //垃圾方法
    private void PSJBCvuV(long fwewtuzfgc0, int kycilqjpu1, long cezyaqdgse2, byte artdgqdunv3, int kozjthzp4) {
        int kozjthzp4a = kozjthzp4;
        byte artdgqdunv3a = artdgqdunv3;
        long cezyaqdgse2a = cezyaqdgse2;
        int kycilqjpu1a = kycilqjpu1;
        long fwewtuzfgc0a = fwewtuzfgc0;
        Log.e("PSJBCvuV", "PSJBCvuV" + kycilqjpu1a + artdgqdunv3a + fwewtuzfgc0a + kozjthzp4a + cezyaqdgse2a + "PSJBCvuV" + aarbZeb + dxmwPSi + ZOMPhjL + ddmKvwD + BXJRAgF + WIknEVt + LeUxIUn + Mzrffcg + bHLRMkx + hXdeRan + WttGtov + nDvxEsp + QWElVJD + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        int kozjthzp4 = 11;
        byte artdgqdunv3 = 22;
        long cezyaqdgse2 = 48L;
        int kycilqjpu1 = 25;
        long fwewtuzfgc0 = 78L;
        byte qegvolnna2 = 69;
        double ogeuypm1 = 98.98;
        float fwmpwgq0 = 45.45f;
        float agwgduc3 = 12.12f;
        long ypapiscrxp2 = 90L;
        long zmsjbaef1 = 96L;
        int byjunvawk0 = 26;
        short gyirthf1 = 40;
        char rmmgnqs0 = 88;
        long ogmeozluol0 = 88L;
        int jwssphzbr1 = 71;
        double hhvfehiy0 = 28.28;
        short ghfjffr4 = 82;
        long hwpkngs3 = 89L;
        char cihhhqask2 = 93;
        int ehzxkslkk1 = 60;
        char uykfkom0 = 63;
        int fggrrsfan2 = 17;
        short qdfbanubnf1 = 55;
        double etpjoxwdne0 = 10.10;
        float nluahdev1 = 56.56f;
        char ysptfeqs0 = 59;
        boolean kztonxnjiq1 = false;
        char sxacmyta0 = 23;
        short pjbcmyu1 = 46;
        int qhschgx0 = 13;
        short rwzgfhmnnj1 = 20;
        double nvulibce0 = 58.58;
        float svysynbjdx0 = 38.38f;
        char ceshjyu1 = 68;
        boolean dvtkfpj0 = true;
        int xouvcyzrcz3 = 70;
        int nlzlxthq2 = 78;
        int zgplgmcf1 = 89;
        boolean mksbewrl0 = true;
        short skurteg0 = 51;
        char icjuutzx4 = 9;
        int ktayshljns3 = 57;
        boolean cacynaa2 = false;
        int astugxnttf1 = 37;
        byte xseyygh0 = 66;
        int arhbhslieg3 = 26;
        byte uypeqfl2 = 47;
        double djnufdnbf1 = 6.6;
        char wfoacqffcs0 = 89;
        short cwzglgqukt0 = 6;
        byte mqswqfoxau4 = 3;
        short cjctylnpop3 = 42;
        boolean hzgvvpy2 = true;
        int qjawdseejs1 = 21;
        char nebgbuozr0 = 87;
        short qlvctmsqm3 = 28;
        double idlaiuw2 = 74.74;
        char hsfkoaaopb1 = 42;
        boolean waromutn0 = true;
        byte ufgqkdwpm1 = 53;
        short fhqvfpmn0 = 8;
        char zxaiqkif2 = 97;
        int jxklzkpnwc1 = 12;
        double mmkfdtulh0 = 60.60;
        byte uihgxsc3 = 84;
        long sleuwghf2 = 83L;
        char uliidzay1 = 74;
        long dsmcqkmpn0 = 62L;
        if (TidyManager.isDebug) {
            CMtPUtnN(mksbewrl0, zgplgmcf1, nlzlxthq2, xouvcyzrcz3);
            epTubgJc(rmmgnqs0, gyirthf1);
            CMtPUtnN(mksbewrl0, zgplgmcf1, nlzlxthq2, xouvcyzrcz3);
            xbVdTlRS(mmkfdtulh0, jxklzkpnwc1, zxaiqkif2);
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        yEwSSAxm(fwmpwgq0, ogeuypm1, qegvolnna2);
        EIbyVtWi(etpjoxwdne0, qdfbanubnf1, fggrrsfan2);
        xbVdTlRS(mmkfdtulh0, jxklzkpnwc1, zxaiqkif2);
        isStartService = false;
        bxSQPLPu(fhqvfpmn0, ufgqkdwpm1);
        BLnpeZSx(ysptfeqs0, nluahdev1);
        jPJZIXtw(sxacmyta0, kztonxnjiq1);
        isLiving = false;
        isReTryBinding = false;
        CScnWsTe(dvtkfpj0, ceshjyu1);
        OjFJieEn(nebgbuozr0, qjawdseejs1, hzgvvpy2, cjctylnpop3, mqswqfoxau4);
        dRgllWOW(hhvfehiy0, jwssphzbr1);
        BLnpeZSx(ysptfeqs0, nluahdev1);
        qLwAvSjM(qhschgx0, pjbcmyu1);
        bxSQPLPu(fhqvfpmn0, ufgqkdwpm1);
        mNEmqozy(nvulibce0, rwzgfhmnnj1);
        BLnpeZSx(ysptfeqs0, nluahdev1);
        this.startSubService(3, true);
        rFIFvtkY(uykfkom0, ehzxkslkk1, cihhhqask2, hwpkngs3, ghfjffr4);
        oeMAVtxV(xseyygh0, astugxnttf1, cacynaa2, ktayshljns3, icjuutzx4);
        OjFJieEn(nebgbuozr0, qjawdseejs1, hzgvvpy2, cjctylnpop3, mqswqfoxau4);
        jPJZIXtw(sxacmyta0, kztonxnjiq1);
        oeMAVtxV(xseyygh0, astugxnttf1, cacynaa2, ktayshljns3, icjuutzx4);
        rFIFvtkY(uykfkom0, ehzxkslkk1, cihhhqask2, hwpkngs3, ghfjffr4);
        hyEEJjIT(svysynbjdx0);
        xbVdTlRS(mmkfdtulh0, jxklzkpnwc1, zxaiqkif2);
        tIgkJgxz(ogmeozluol0);
        PSJBCvuV(fwewtuzfgc0, kycilqjpu1, cezyaqdgse2, artdgqdunv3, kozjthzp4);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void lHudKTnK(long ufuijcmm0) {
        long ufuijcmm0a = ufuijcmm0;
        new Thread("lHudKTnK" + ufuijcmm0a + "lHudKTnK" + QWElVJD + BXJRAgF + hXdeRan + aarbZeb + nDvxEsp + dxmwPSi + WttGtov + LeUxIUn + ddmKvwD + bHLRMkx + ZOMPhjL + Mzrffcg + WIknEVt + "");
    }

    //垃圾方法
    private void LJiioxKt(char prskeailb0, char shxbtzcf1) {
        char shxbtzcf1a = shxbtzcf1;
        char prskeailb0a = prskeailb0;
    }

    //垃圾方法
    private void MlHWNPWZ(byte lgwzuavc0, long nhkwftgo1, boolean euhovut2) {
        boolean euhovut2a = euhovut2;
        long nhkwftgo1a = nhkwftgo1;
        byte lgwzuavc0a = lgwzuavc0;
        Log.w("MlHWNPWZ", "MlHWNPWZ" + euhovut2a + lgwzuavc0a + nhkwftgo1a + "MlHWNPWZ" + Mzrffcg + aarbZeb + nDvxEsp + WIknEVt + bHLRMkx + WttGtov + LeUxIUn + ddmKvwD + ZOMPhjL + BXJRAgF + hXdeRan + dxmwPSi + QWElVJD + "");
    }

    //垃圾方法
    private void siHIiooO(double hspfkkmhy0) {
        double hspfkkmhy0a = hspfkkmhy0;
        new StringReader("siHIiooO" + hspfkkmhy0a + "siHIiooO" + ZOMPhjL + WttGtov + hXdeRan + ddmKvwD + QWElVJD + dxmwPSi + nDvxEsp + bHLRMkx + LeUxIUn + WIknEVt + BXJRAgF + Mzrffcg + aarbZeb + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        double hspfkkmhy0 = 58.58;
        boolean euhovut2 = false;
        long nhkwftgo1 = 34L;
        byte lgwzuavc0 = 36;
        char shxbtzcf1 = 53;
        char prskeailb0 = 12;
        long ufuijcmm0 = 80L;
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            isReTryBinding = false;
        } else {
            if (TidyManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                TidyManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void ePahCHJg(int lsfsgovuh0, double kfgjfxpiom1, short rtxylpw2, byte qxhgrkr3) {
        byte qxhgrkr3a = qxhgrkr3;
        short rtxylpw2a = rtxylpw2;
        double kfgjfxpiom1a = kfgjfxpiom1;
        int lsfsgovuh0a = lsfsgovuh0;
        new Thread("ePahCHJg" + qxhgrkr3a + rtxylpw2a + lsfsgovuh0a + kfgjfxpiom1a + "ePahCHJg" + QWElVJD + aarbZeb + dxmwPSi + bHLRMkx + ddmKvwD + WttGtov + nDvxEsp + WIknEVt + LeUxIUn + hXdeRan + BXJRAgF + Mzrffcg + ZOMPhjL + "");
    }

    //垃圾方法
    private void onhetlNa(boolean biwdubyf0, long vnckhfb1, byte zdbvtplm2) {
        byte zdbvtplm2a = zdbvtplm2;
        long vnckhfb1a = vnckhfb1;
        boolean biwdubyf0a = biwdubyf0;
        new WeakReference("onhetlNa" + vnckhfb1a + zdbvtplm2a + biwdubyf0a + "onhetlNa" + WttGtov + dxmwPSi + LeUxIUn + nDvxEsp + QWElVJD + Mzrffcg + bHLRMkx + aarbZeb + ddmKvwD + BXJRAgF + hXdeRan + ZOMPhjL + WIknEVt + "");
    }

    //垃圾方法
    private void KoveVkdw(long dvjpheump0, int qwypahvhuj1, int cwqesgjki2, boolean rpoiomsznv3, byte okquvrvp4) {
        byte okquvrvp4a = okquvrvp4;
        boolean rpoiomsznv3a = rpoiomsznv3;
        int cwqesgjki2a = cwqesgjki2;
        int qwypahvhuj1a = qwypahvhuj1;
        long dvjpheump0a = dvjpheump0;
        new String("KoveVkdw" + rpoiomsznv3a + okquvrvp4a + dvjpheump0a + cwqesgjki2a + qwypahvhuj1a + "KoveVkdw" + hXdeRan + ZOMPhjL + bHLRMkx + WIknEVt + BXJRAgF + ddmKvwD + nDvxEsp + Mzrffcg + dxmwPSi + LeUxIUn + QWElVJD + WttGtov + aarbZeb + "");
    }

    //垃圾方法
    private void QXzDNuYF(int uoiwzqr0, int nycdmtfc1, int edoqgfm2, long rywcflk3) {
        long rywcflk3a = rywcflk3;
        int edoqgfm2a = edoqgfm2;
        int nycdmtfc1a = nycdmtfc1;
        int uoiwzqr0a = uoiwzqr0;
        Log.e("QXzDNuYF", "QXzDNuYF" + nycdmtfc1a + uoiwzqr0a + rywcflk3a + edoqgfm2a + "QXzDNuYF" + BXJRAgF + WttGtov + hXdeRan + QWElVJD + WIknEVt + ddmKvwD + Mzrffcg + dxmwPSi + bHLRMkx + aarbZeb + nDvxEsp + ZOMPhjL + LeUxIUn + "");
    }

    //垃圾方法
    private void mnStnmlx(char ribuvxm0) {
        char ribuvxm0a = ribuvxm0;
        new Intent("mnStnmlx" + ribuvxm0a + "mnStnmlx" + WIknEVt + aarbZeb + bHLRMkx + dxmwPSi + WttGtov + ddmKvwD + nDvxEsp + ZOMPhjL + BXJRAgF + LeUxIUn + QWElVJD + hXdeRan + Mzrffcg + "");
    }

    //垃圾方法
    private void EzOFuwLx(double rkvsdqvfb0, double sfqllfwn1) {
        double sfqllfwn1a = sfqllfwn1;
        double rkvsdqvfb0a = rkvsdqvfb0;
        Log.e("EzOFuwLx", "EzOFuwLx" + rkvsdqvfb0a + sfqllfwn1a + "EzOFuwLx" + bHLRMkx + QWElVJD + ddmKvwD + nDvxEsp + LeUxIUn + WttGtov + WIknEVt + aarbZeb + dxmwPSi + ZOMPhjL + BXJRAgF + hXdeRan + Mzrffcg + "");
    }

    //垃圾方法
    private void OCTnrVcf(long jgbbizoss0, float qcyrzprlc1) {
        float qcyrzprlc1a = qcyrzprlc1;
        long jgbbizoss0a = jgbbizoss0;
        new StringReader("OCTnrVcf" + qcyrzprlc1a + jgbbizoss0a + "OCTnrVcf" + bHLRMkx + ZOMPhjL + LeUxIUn + Mzrffcg + QWElVJD + hXdeRan + WttGtov + BXJRAgF + WIknEVt + ddmKvwD + dxmwPSi + nDvxEsp + aarbZeb + "");
    }

    //垃圾方法
    private void VxsfWmGq(double vfdegkuk0, short fetofbe1, float fkdnjcq2, int cxnjtnh3, int qcdnxyctbg4) {
        int qcdnxyctbg4a = qcdnxyctbg4;
        int cxnjtnh3a = cxnjtnh3;
        float fkdnjcq2a = fkdnjcq2;
        short fetofbe1a = fetofbe1;
        double vfdegkuk0a = vfdegkuk0;
        new AttributedString("VxsfWmGq" + qcdnxyctbg4a + fetofbe1a + fkdnjcq2a + cxnjtnh3a + vfdegkuk0a + "VxsfWmGq" + bHLRMkx + QWElVJD + ddmKvwD + aarbZeb + Mzrffcg + BXJRAgF + nDvxEsp + hXdeRan + dxmwPSi + WIknEVt + ZOMPhjL + LeUxIUn + WttGtov + "");
    }

    private void doStartSubService() {
        int qcdnxyctbg4 = 100;
        int cxnjtnh3 = 63;
        float fkdnjcq2 = 64.64f;
        short fetofbe1 = 62;
        double vfdegkuk0 = 53.53;
        float qcyrzprlc1 = 36.36f;
        long jgbbizoss0 = 84L;
        double sfqllfwn1 = 91.91;
        double rkvsdqvfb0 = 99.99;
        char ribuvxm0 = 99;
        long rywcflk3 = 47L;
        int edoqgfm2 = 30;
        int nycdmtfc1 = 94;
        int uoiwzqr0 = 31;
        byte okquvrvp4 = 89;
        boolean rpoiomsznv3 = true;
        int cwqesgjki2 = 64;
        int qwypahvhuj1 = 16;
        long dvjpheump0 = 5L;
        byte zdbvtplm2 = 14;
        long vnckhfb1 = 72L;
        boolean biwdubyf0 = true;
        byte qxhgrkr3 = 82;
        short rtxylpw2 = 32;
        double kfgjfxpiom1 = 26.26;
        int lsfsgovuh0 = 87;
        if (TidyManager.isDebug) {
            Log.i(TAG, "主进程 doStartSubService5");
        }
        try {
            Intent intent = new Intent(this, com.tidy.file.old.opdj.Tidy2Service.class);
            onhetlNa(biwdubyf0, vnckhfb1, zdbvtplm2);
            mnStnmlx(ribuvxm0);
            OCTnrVcf(jgbbizoss0, qcyrzprlc1);
            VxsfWmGq(vfdegkuk0, fetofbe1, fkdnjcq2, cxnjtnh3, qcdnxyctbg4);
            EzOFuwLx(rkvsdqvfb0, sfqllfwn1);
            intent.putExtra("isStartService", true);
            onhetlNa(biwdubyf0, vnckhfb1, zdbvtplm2);
            QXzDNuYF(uoiwzqr0, nycdmtfc1, edoqgfm2, rywcflk3);
            EzOFuwLx(rkvsdqvfb0, sfqllfwn1);
            OCTnrVcf(jgbbizoss0, qcyrzprlc1);
            KoveVkdw(dvjpheump0, qwypahvhuj1, cwqesgjki2, rpoiomsznv3, okquvrvp4);
            mnStnmlx(ribuvxm0);
            onhetlNa(biwdubyf0, vnckhfb1, zdbvtplm2);
            mnStnmlx(ribuvxm0);
            QXzDNuYF(uoiwzqr0, nycdmtfc1, edoqgfm2, rywcflk3);
            EzOFuwLx(rkvsdqvfb0, sfqllfwn1);
            intent.setPackage(this.getPackageName());
            OCTnrVcf(jgbbizoss0, qcyrzprlc1);
            OCTnrVcf(jgbbizoss0, qcyrzprlc1);
            KoveVkdw(dvjpheump0, qwypahvhuj1, cwqesgjki2, rpoiomsznv3, okquvrvp4);
            EzOFuwLx(rkvsdqvfb0, sfqllfwn1);
            EzOFuwLx(rkvsdqvfb0, sfqllfwn1);
            mnStnmlx(ribuvxm0);
            onhetlNa(biwdubyf0, vnckhfb1, zdbvtplm2);
            mnStnmlx(ribuvxm0);
            ePahCHJg(lsfsgovuh0, kfgjfxpiom1, rtxylpw2, qxhgrkr3);
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (TidyManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void iJmUnDpp(boolean nmmyzdqi0) {
        boolean nmmyzdqi0a = nmmyzdqi0;
        new Thread("iJmUnDpp" + nmmyzdqi0a + "iJmUnDpp" + WttGtov + bHLRMkx + BXJRAgF + hXdeRan + LeUxIUn + Mzrffcg + aarbZeb + dxmwPSi + nDvxEsp + ZOMPhjL + ddmKvwD + WIknEVt + QWElVJD + "");
    }

    //垃圾方法
    private void yLFPtyws(byte ffpzreoxbg0, int jjnggrw1) {
        int jjnggrw1a = jjnggrw1;
        byte ffpzreoxbg0a = ffpzreoxbg0;
        TextUtils.isEmpty("yLFPtyws" + ffpzreoxbg0a + jjnggrw1a + "yLFPtyws" + ddmKvwD + dxmwPSi + QWElVJD + Mzrffcg + nDvxEsp + ZOMPhjL + hXdeRan + WIknEVt + LeUxIUn + bHLRMkx + BXJRAgF + WttGtov + aarbZeb + "");
    }

    //垃圾方法
    private void JInvKJGI(int exujjlxcic0) {
        int exujjlxcic0a = exujjlxcic0;
        new String("JInvKJGI" + exujjlxcic0a + "JInvKJGI" + hXdeRan + WttGtov + Mzrffcg + QWElVJD + BXJRAgF + LeUxIUn + aarbZeb + ZOMPhjL + WIknEVt + bHLRMkx + ddmKvwD + nDvxEsp + dxmwPSi + "");
    }

    //垃圾方法
    private void QrRGJRyQ(double rvtzunc0, short codgxryd1) {
        short codgxryd1a = codgxryd1;
        double rvtzunc0a = rvtzunc0;
        new String("QrRGJRyQ" + codgxryd1a + rvtzunc0a + "QrRGJRyQ" + bHLRMkx + ZOMPhjL + aarbZeb + QWElVJD + hXdeRan + ddmKvwD + WIknEVt + LeUxIUn + Mzrffcg + WttGtov + dxmwPSi + BXJRAgF + nDvxEsp + "");
    }

    private void bindSubService() {
        short codgxryd1 = 47;
        double rvtzunc0 = 34.34;
        int exujjlxcic0 = 79;
        int jjnggrw1 = 85;
        byte ffpzreoxbg0 = 41;
        boolean nmmyzdqi0 = false;
        try {
            yLFPtyws(ffpzreoxbg0, jjnggrw1);
            iJmUnDpp(nmmyzdqi0);
            iJmUnDpp(nmmyzdqi0);
            iJmUnDpp(nmmyzdqi0);
            this.bindService(new Intent(this, com.tidy.file.old.opdj.Tidy2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (TidyManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void JTMBBpTF(int dlwptml0, byte jmkkrla1, char ebqgyqjo2, char satekjgrw3) {
        char satekjgrw3a = satekjgrw3;
        char ebqgyqjo2a = ebqgyqjo2;
        byte jmkkrla1a = jmkkrla1;
        int dlwptml0a = dlwptml0;
        new Intent("JTMBBpTF" + jmkkrla1a + dlwptml0a + ebqgyqjo2a + satekjgrw3a + "JTMBBpTF" + "");
    }

    //垃圾方法
    static private void PPbbZGgI(long obkqzym0) {
        long obkqzym0a = obkqzym0;
        new StringBuffer("PPbbZGgI" + obkqzym0a + "PPbbZGgI" + "");
    }

    //垃圾方法
    static private void DypBZirL(boolean pnxjaub0, boolean choxxbxvl1) {
        boolean choxxbxvl1a = choxxbxvl1;
        boolean pnxjaub0a = pnxjaub0;
        Log.e("DypBZirL", "DypBZirL" + choxxbxvl1a + pnxjaub0a + "DypBZirL" + "");
    }

    //垃圾方法
    static private void EhHcAsNQ(int rmyehlwzq0, double tyhodegmzi1, float sgkhmgbjh2, float lyohnha3) {
        float lyohnha3a = lyohnha3;
        float sgkhmgbjh2a = sgkhmgbjh2;
        double tyhodegmzi1a = tyhodegmzi1;
        int rmyehlwzq0a = rmyehlwzq0;
        Log.i("EhHcAsNQ", "EhHcAsNQ" + lyohnha3a + tyhodegmzi1a + sgkhmgbjh2a + rmyehlwzq0a + "EhHcAsNQ" + "");
    }

    private static boolean doStartMainService(Context context) {
        float lyohnha3 = 73.73f;
        float sgkhmgbjh2 = 74.74f;
        double tyhodegmzi1 = 23.23;
        int rmyehlwzq0 = 89;
        boolean choxxbxvl1 = false;
        boolean pnxjaub0 = true;
        long obkqzym0 = 48L;
        char satekjgrw3 = 74;
        char ebqgyqjo2 = 25;
        byte jmkkrla1 = 57;
        int dlwptml0 = 73;
        try {
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            JTMBBpTF(dlwptml0, jmkkrla1, ebqgyqjo2, satekjgrw3);
            PPbbZGgI(obkqzym0);
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            DypBZirL(pnxjaub0, choxxbxvl1);
            JTMBBpTF(dlwptml0, jmkkrla1, ebqgyqjo2, satekjgrw3);
            DypBZirL(pnxjaub0, choxxbxvl1);
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            Intent intent = new Intent(context, Tidy1Service.class);
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            JTMBBpTF(dlwptml0, jmkkrla1, ebqgyqjo2, satekjgrw3);
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            DypBZirL(pnxjaub0, choxxbxvl1);
            PPbbZGgI(obkqzym0);
            JTMBBpTF(dlwptml0, jmkkrla1, ebqgyqjo2, satekjgrw3);
            EhHcAsNQ(rmyehlwzq0, tyhodegmzi1, sgkhmgbjh2, lyohnha3);
            PPbbZGgI(obkqzym0);
            intent.putExtra("isStartService", true);
            intent.setPackage(context.getPackageName());
            JTMBBpTF(dlwptml0, jmkkrla1, ebqgyqjo2, satekjgrw3);
            PPbbZGgI(obkqzym0);
            JTMBBpTF(dlwptml0, jmkkrla1, ebqgyqjo2, satekjgrw3);
            PPbbZGgI(obkqzym0);
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (TidyManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void irdjThzN(boolean avdrldcax0, byte ogntpdhd1, short whhdpjci2) {
        short whhdpjci2a = whhdpjci2;
        byte ogntpdhd1a = ogntpdhd1;
        boolean avdrldcax0a = avdrldcax0;
        new AttributedString("irdjThzN" + whhdpjci2a + ogntpdhd1a + avdrldcax0a + "irdjThzN" + "");
    }

    //垃圾方法
    static private void vtAguzHF(boolean naiewysgz0, boolean swjlihies1, float xanhxekiyx2) {
        float xanhxekiyx2a = xanhxekiyx2;
        boolean swjlihies1a = swjlihies1;
        boolean naiewysgz0a = naiewysgz0;
        Log.i("vtAguzHF", "vtAguzHF" + naiewysgz0a + xanhxekiyx2a + swjlihies1a + "vtAguzHF" + "");
    }

    //垃圾方法
    static private void jmOuUEta(byte jjzwzkq0) {
        byte jjzwzkq0a = jjzwzkq0;
        new Intent("jmOuUEta" + jjzwzkq0a + "jmOuUEta" + "");
    }

    //垃圾方法
    static private void IXbYtPmG(byte eyuiffzgr0, int fdozyhuzz1, long skhnzoq2, short xoicjamnkp3, double vygxveceb4) {
        double vygxveceb4a = vygxveceb4;
        short xoicjamnkp3a = xoicjamnkp3;
        long skhnzoq2a = skhnzoq2;
        int fdozyhuzz1a = fdozyhuzz1;
        byte eyuiffzgr0a = eyuiffzgr0;
        new WeakReference("IXbYtPmG" + fdozyhuzz1a + skhnzoq2a + vygxveceb4a + xoicjamnkp3a + eyuiffzgr0a + "IXbYtPmG" + "");
    }

    //垃圾方法
    static private void nyGoWPwl(double vadzsxqwkk0) {
        double vadzsxqwkk0a = vadzsxqwkk0;
        new StringReader("nyGoWPwl" + vadzsxqwkk0a + "nyGoWPwl" + "");
    }

    //垃圾方法
    static private void hyPLdjSl(byte xihtfcwcvg0) {
        byte xihtfcwcvg0a = xihtfcwcvg0;
        new File("hyPLdjSl" + xihtfcwcvg0a + "hyPLdjSl" + "");
    }

    //垃圾方法
    static private void VLmhoOnK(float iemrvde0, byte vjzwagw1, short hobjjoqewt2, byte kajgnrjk3, int eehaujjvu4) {
        int eehaujjvu4a = eehaujjvu4;
        byte kajgnrjk3a = kajgnrjk3;
        short hobjjoqewt2a = hobjjoqewt2;
        byte vjzwagw1a = vjzwagw1;
        float iemrvde0a = iemrvde0;
        new File("VLmhoOnK" + iemrvde0a + kajgnrjk3a + vjzwagw1a + eehaujjvu4a + hobjjoqewt2a + "VLmhoOnK" + "");
    }

    //垃圾方法
    static private void dUZihTzu(float vkysmdva0, short gbifnzzwfe1, boolean hpohphopv2, char qpvexgf3, int ajaandlo4) {
        int ajaandlo4a = ajaandlo4;
        char qpvexgf3a = qpvexgf3;
        boolean hpohphopv2a = hpohphopv2;
        short gbifnzzwfe1a = gbifnzzwfe1;
        float vkysmdva0a = vkysmdva0;
        TextUtils.isDigitsOnly("dUZihTzu" + vkysmdva0a + qpvexgf3a + ajaandlo4a + hpohphopv2a + gbifnzzwfe1a + "dUZihTzu" + "");
    }

    private static void doBindMainService(Context context) {
        int ajaandlo4 = 2;
        char qpvexgf3 = 7;
        boolean hpohphopv2 = true;
        short gbifnzzwfe1 = 51;
        float vkysmdva0 = 49.49f;
        int eehaujjvu4 = 19;
        byte kajgnrjk3 = 15;
        short hobjjoqewt2 = 86;
        byte vjzwagw1 = 71;
        float iemrvde0 = 83.83f;
        byte xihtfcwcvg0 = 64;
        double vadzsxqwkk0 = 82.82;
        double vygxveceb4 = 89.89;
        short xoicjamnkp3 = 87;
        long skhnzoq2 = 73L;
        int fdozyhuzz1 = 17;
        byte eyuiffzgr0 = 71;
        byte jjzwzkq0 = 72;
        float xanhxekiyx2 = 47.47f;
        boolean swjlihies1 = true;
        boolean naiewysgz0 = false;
        short whhdpjci2 = 82;
        byte ogntpdhd1 = 99;
        boolean avdrldcax0 = true;
        if (TidyManager.isDebug) {
            nyGoWPwl(vadzsxqwkk0);
            irdjThzN(avdrldcax0, ogntpdhd1, whhdpjci2);
            hyPLdjSl(xihtfcwcvg0);
            VLmhoOnK(iemrvde0, vjzwagw1, hobjjoqewt2, kajgnrjk3, eehaujjvu4);
            irdjThzN(avdrldcax0, ogntpdhd1, whhdpjci2);
            vtAguzHF(naiewysgz0, swjlihies1, xanhxekiyx2);
            IXbYtPmG(eyuiffzgr0, fdozyhuzz1, skhnzoq2, xoicjamnkp3, vygxveceb4);
            Log.i(TAG, "bindMainService5");
        }
        jmOuUEta(jjzwzkq0);
        hyPLdjSl(xihtfcwcvg0);
        dUZihTzu(vkysmdva0, gbifnzzwfe1, hpohphopv2, qpvexgf3, ajaandlo4);
        nyGoWPwl(vadzsxqwkk0);
        jmOuUEta(jjzwzkq0);
        jmOuUEta(jjzwzkq0);
        vtAguzHF(naiewysgz0, swjlihies1, xanhxekiyx2);
        try {
            Intent intent = new Intent(context, Tidy1Service.class);
            vtAguzHF(naiewysgz0, swjlihies1, xanhxekiyx2);
            hyPLdjSl(xihtfcwcvg0);
            hyPLdjSl(xihtfcwcvg0);
            irdjThzN(avdrldcax0, ogntpdhd1, whhdpjci2);
            vtAguzHF(naiewysgz0, swjlihies1, xanhxekiyx2);
            VLmhoOnK(iemrvde0, vjzwagw1, hobjjoqewt2, kajgnrjk3, eehaujjvu4);
            intent.putExtra("isStartService", false);
            hyPLdjSl(xihtfcwcvg0);
            nyGoWPwl(vadzsxqwkk0);
            vtAguzHF(naiewysgz0, swjlihies1, xanhxekiyx2);
            jmOuUEta(jjzwzkq0);
            VLmhoOnK(iemrvde0, vjzwagw1, hobjjoqewt2, kajgnrjk3, eehaujjvu4);
            nyGoWPwl(vadzsxqwkk0);
            hyPLdjSl(xihtfcwcvg0);
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
            if (TidyManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceTidy.Stub {

        LocalBinder(Tidy1Service this$0) {
        }

        //垃圾方法
        private void QSRXrqxm(byte wzkzdidey0, float iloehvzat1) {
            float iloehvzat1a = iloehvzat1;
            byte wzkzdidey0a = wzkzdidey0;
            new Intent("QSRXrqxm" + wzkzdidey0a + iloehvzat1a + "QSRXrqxm" + "" + "");
        }

        //垃圾方法
        private void TwHGQrmL(short zfzctbeg0, boolean henpmdc1, short tphmahtlc2, long ovoyzkbohl3) {
            long ovoyzkbohl3a = ovoyzkbohl3;
            short tphmahtlc2a = tphmahtlc2;
            boolean henpmdc1a = henpmdc1;
            short zfzctbeg0a = zfzctbeg0;
            new AttributedString("TwHGQrmL" + henpmdc1a + tphmahtlc2a + ovoyzkbohl3a + zfzctbeg0a + "TwHGQrmL" + "" + "");
        }

        //垃圾方法
        private void OejHcZzO(long wdddnrh0) {
            long wdddnrh0a = wdddnrh0;
            TextUtils.isDigitsOnly("OejHcZzO" + wdddnrh0a + "OejHcZzO" + "" + "");
        }

        //垃圾方法
        private void GdRQutja(float ferbgojl0) {
            float ferbgojl0a = ferbgojl0;
            new Thread("GdRQutja" + ferbgojl0a + "GdRQutja" + "" + "");
        }

        public String getServiceTidy() throws RemoteException {
            float ferbgojl0 = 56.56f;
            long wdddnrh0 = 13L;
            long ovoyzkbohl3 = 46L;
            short tphmahtlc2 = 4;
            boolean henpmdc1 = false;
            short zfzctbeg0 = 60;
            float iloehvzat1 = 88.88f;
            byte wzkzdidey0 = 96;
            GdRQutja(ferbgojl0);
            GdRQutja(ferbgojl0);
            GdRQutja(ferbgojl0);
            GdRQutja(ferbgojl0);
            QSRXrqxm(wzkzdidey0, iloehvzat1);
            TwHGQrmL(zfzctbeg0, henpmdc1, tphmahtlc2, ovoyzkbohl3);
            GdRQutja(ferbgojl0);
            QSRXrqxm(wzkzdidey0, iloehvzat1);
            GdRQutja(ferbgojl0);
            GdRQutja(ferbgojl0);
            return "LocalService";
        }

        //垃圾方法
        private void agCnUbhe(char vicaapczej0, int eizmvsdmko1, byte aepdvbceff2, long vvghyzgvqe3) {
            long vvghyzgvqe3a = vvghyzgvqe3;
            byte aepdvbceff2a = aepdvbceff2;
            int eizmvsdmko1a = eizmvsdmko1;
            char vicaapczej0a = vicaapczej0;
            System.out.println("agCnUbhe" + aepdvbceff2a + eizmvsdmko1a + vicaapczej0a + vvghyzgvqe3a + "agCnUbhe" + "" + "");
        }

        //垃圾方法
        private void hjEuwvVr(int szwsodhyay0, char fpdryesoy1, int ioxdkkfdm2, short dtlmzag3, long rvmzjuoeti4) {
            long rvmzjuoeti4a = rvmzjuoeti4;
            short dtlmzag3a = dtlmzag3;
            int ioxdkkfdm2a = ioxdkkfdm2;
            char fpdryesoy1a = fpdryesoy1;
            int szwsodhyay0a = szwsodhyay0;
        }

        //垃圾方法
        private void BwLVvxuK(double uzobvqkf0, long vfjeasn1, short fytjsqysou2, char upqwdamu3) {
            char upqwdamu3a = upqwdamu3;
            short fytjsqysou2a = fytjsqysou2;
            long vfjeasn1a = vfjeasn1;
            double uzobvqkf0a = uzobvqkf0;
            System.out.println("BwLVvxuK" + vfjeasn1a + upqwdamu3a + fytjsqysou2a + uzobvqkf0a + "BwLVvxuK" + "" + "");
        }

        //垃圾方法
        private void KILZSWIZ(byte lvsadctnjs0, int nviqfyo1, long ghpjqrwxt2, double arjvrzmui3, double lnjemszp4) {
            double lnjemszp4a = lnjemszp4;
            double arjvrzmui3a = arjvrzmui3;
            long ghpjqrwxt2a = ghpjqrwxt2;
            int nviqfyo1a = nviqfyo1;
            byte lvsadctnjs0a = lvsadctnjs0;
            new Intent("KILZSWIZ" + ghpjqrwxt2a + lvsadctnjs0a + lnjemszp4a + nviqfyo1a + arjvrzmui3a + "KILZSWIZ" + "" + "");
        }

        public boolean isStartedTidy() throws RemoteException {
            double lnjemszp4 = 3.3;
            double arjvrzmui3 = 20.20;
            long ghpjqrwxt2 = 57L;
            int nviqfyo1 = 28;
            byte lvsadctnjs0 = 83;
            char upqwdamu3 = 80;
            short fytjsqysou2 = 71;
            long vfjeasn1 = 73L;
            double uzobvqkf0 = 57.57;
            long rvmzjuoeti4 = 59L;
            short dtlmzag3 = 27;
            int ioxdkkfdm2 = 79;
            char fpdryesoy1 = 1;
            int szwsodhyay0 = 4;
            long vvghyzgvqe3 = 45L;
            byte aepdvbceff2 = 6;
            int eizmvsdmko1 = 36;
            char vicaapczej0 = 93;
            KILZSWIZ(lvsadctnjs0, nviqfyo1, ghpjqrwxt2, arjvrzmui3, lnjemszp4);
            KILZSWIZ(lvsadctnjs0, nviqfyo1, ghpjqrwxt2, arjvrzmui3, lnjemszp4);
            hjEuwvVr(szwsodhyay0, fpdryesoy1, ioxdkkfdm2, dtlmzag3, rvmzjuoeti4);
            BwLVvxuK(uzobvqkf0, vfjeasn1, fytjsqysou2, upqwdamu3);
            KILZSWIZ(lvsadctnjs0, nviqfyo1, ghpjqrwxt2, arjvrzmui3, lnjemszp4);
            agCnUbhe(vicaapczej0, eizmvsdmko1, aepdvbceff2, vvghyzgvqe3);
            BwLVvxuK(uzobvqkf0, vfjeasn1, fytjsqysou2, upqwdamu3);
            hjEuwvVr(szwsodhyay0, fpdryesoy1, ioxdkkfdm2, dtlmzag3, rvmzjuoeti4);
            BwLVvxuK(uzobvqkf0, vfjeasn1, fytjsqysou2, upqwdamu3);
            return Tidy1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Tidy1Service this$0) {
        }

        //垃圾方法
        private void drTlJaPK(double byxbrssb0) {
            double byxbrssb0a = byxbrssb0;
            Log.i("drTlJaPK", "drTlJaPK" + byxbrssb0a + "drTlJaPK" + "" + "");
        }

        //垃圾方法
        private void TPiMaKcW(byte tdqyzlhvv0, byte typgbnac1, float xghglju2, byte eiqotqqk3) {
            byte eiqotqqk3a = eiqotqqk3;
            float xghglju2a = xghglju2;
            byte typgbnac1a = typgbnac1;
            byte tdqyzlhvv0a = tdqyzlhvv0;
            new StringBuilder("TPiMaKcW" + typgbnac1a + tdqyzlhvv0a + eiqotqqk3a + xghglju2a + "TPiMaKcW" + "" + "");
        }

        //垃圾方法
        private void pJonMBVt(byte tkvplffb0, double ulgtviyijf1) {
            double ulgtviyijf1a = ulgtviyijf1;
            byte tkvplffb0a = tkvplffb0;
            TextUtils.isDigitsOnly("pJonMBVt" + ulgtviyijf1a + tkvplffb0a + "pJonMBVt" + "" + "");
        }

        //垃圾方法
        private void upmyuDGS(int nodkchhjwn0, boolean swzvlrwi1) {
            boolean swzvlrwi1a = swzvlrwi1;
            int nodkchhjwn0a = nodkchhjwn0;
            System.out.println("upmyuDGS" + swzvlrwi1a + nodkchhjwn0a + "upmyuDGS" + "" + "");
        }

        //垃圾方法
        private void HAhzpJAX(double bjxgbhwm0, boolean hyvipnzwtb1, boolean jybxizz2, long pzhrmbtgc3, long wfudszl4) {
            long wfudszl4a = wfudszl4;
            long pzhrmbtgc3a = pzhrmbtgc3;
            boolean jybxizz2a = jybxizz2;
            boolean hyvipnzwtb1a = hyvipnzwtb1;
            double bjxgbhwm0a = bjxgbhwm0;
            new Thread("HAhzpJAX" + hyvipnzwtb1a + jybxizz2a + pzhrmbtgc3a + bjxgbhwm0a + wfudszl4a + "HAhzpJAX" + "" + "");
        }

        //垃圾方法
        private void qhVZZPnv(byte efdmidxsk0, byte cismcrcknw1, long gijafra2, long yorugmabld3) {
            long yorugmabld3a = yorugmabld3;
            long gijafra2a = gijafra2;
            byte cismcrcknw1a = cismcrcknw1;
            byte efdmidxsk0a = efdmidxsk0;
            new File("qhVZZPnv" + cismcrcknw1a + efdmidxsk0a + yorugmabld3a + gijafra2a + "qhVZZPnv" + "" + "");
        }

        //垃圾方法
        private void cGOQGhGi(short qntdqivec0, double qvxixspqeq1) {
            double qvxixspqeq1a = qvxixspqeq1;
            short qntdqivec0a = qntdqivec0;
            new String("cGOQGhGi" + qntdqivec0a + qvxixspqeq1a + "cGOQGhGi" + "" + "");
        }

        //垃圾方法
        private void fCACSxrF(double zcpvasum0, int poxtigazww1) {
            int poxtigazww1a = poxtigazww1;
            double zcpvasum0a = zcpvasum0;
            new WeakReference("fCACSxrF" + zcpvasum0a + poxtigazww1a + "fCACSxrF" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            int poxtigazww1 = 89;
            double zcpvasum0 = 67.67;
            double qvxixspqeq1 = 31.31;
            short qntdqivec0 = 84;
            long yorugmabld3 = 16L;
            long gijafra2 = 69L;
            byte cismcrcknw1 = 32;
            byte efdmidxsk0 = 42;
            long wfudszl4 = 47L;
            long pzhrmbtgc3 = 41L;
            boolean jybxizz2 = true;
            boolean hyvipnzwtb1 = false;
            double bjxgbhwm0 = 81.81;
            boolean swzvlrwi1 = true;
            int nodkchhjwn0 = 86;
            double ulgtviyijf1 = 7.7;
            byte tkvplffb0 = 88;
            byte eiqotqqk3 = 36;
            float xghglju2 = 24.24f;
            byte typgbnac1 = 80;
            byte tdqyzlhvv0 = 72;
            double byxbrssb0 = 71.71;
            if (TidyManager.isDebug) {
                HAhzpJAX(bjxgbhwm0, hyvipnzwtb1, jybxizz2, pzhrmbtgc3, wfudszl4);
                upmyuDGS(nodkchhjwn0, swzvlrwi1);
                qhVZZPnv(efdmidxsk0, cismcrcknw1, gijafra2, yorugmabld3);
                cGOQGhGi(qntdqivec0, qvxixspqeq1);
                Log.i(Tidy1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            TPiMaKcW(tdqyzlhvv0, typgbnac1, xghglju2, eiqotqqk3);
            TPiMaKcW(tdqyzlhvv0, typgbnac1, xghglju2, eiqotqqk3);
            cGOQGhGi(qntdqivec0, qvxixspqeq1);
            HAhzpJAX(bjxgbhwm0, hyvipnzwtb1, jybxizz2, pzhrmbtgc3, wfudszl4);
            cGOQGhGi(qntdqivec0, qvxixspqeq1);
            pJonMBVt(tkvplffb0, ulgtviyijf1);
            HAhzpJAX(bjxgbhwm0, hyvipnzwtb1, jybxizz2, pzhrmbtgc3, wfudszl4);
            qhVZZPnv(efdmidxsk0, cismcrcknw1, gijafra2, yorugmabld3);
            qhVZZPnv(efdmidxsk0, cismcrcknw1, gijafra2, yorugmabld3);
            TPiMaKcW(tdqyzlhvv0, typgbnac1, xghglju2, eiqotqqk3);
            try {
                cGOQGhGi(qntdqivec0, qvxixspqeq1);
                upmyuDGS(nodkchhjwn0, swzvlrwi1);
                pJonMBVt(tkvplffb0, ulgtviyijf1);
                pJonMBVt(tkvplffb0, ulgtviyijf1);
                pJonMBVt(tkvplffb0, ulgtviyijf1);
                upmyuDGS(nodkchhjwn0, swzvlrwi1);
                qhVZZPnv(efdmidxsk0, cismcrcknw1, gijafra2, yorugmabld3);
                qhVZZPnv(efdmidxsk0, cismcrcknw1, gijafra2, yorugmabld3);
                drTlJaPK(byxbrssb0);
                IProcessServiceTidy process = IProcessServiceTidy.Stub.asInterface(service);
                process.getServiceTidy();
            } catch (Exception var25) {
                Exception e = var25;
                if (TidyManager.isDebug) {
                    Log.e(Tidy1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void XFJvJlPC(byte teyjcnofk0, long pfovxyvt1, byte hrlwwmsmc2, char qccwnpxf3) {
            char qccwnpxf3a = qccwnpxf3;
            byte hrlwwmsmc2a = hrlwwmsmc2;
            long pfovxyvt1a = pfovxyvt1;
            byte teyjcnofk0a = teyjcnofk0;
            Log.e("XFJvJlPC", "XFJvJlPC" + teyjcnofk0a + qccwnpxf3a + pfovxyvt1a + hrlwwmsmc2a + "XFJvJlPC" + "" + "");
        }

        //垃圾方法
        private void WVbUSYAh(byte npmugze0, long cyqvlvect1, double mwyivwferx2, long yjxdpubh3) {
            long yjxdpubh3a = yjxdpubh3;
            double mwyivwferx2a = mwyivwferx2;
            long cyqvlvect1a = cyqvlvect1;
            byte npmugze0a = npmugze0;
            new String("WVbUSYAh" + cyqvlvect1a + npmugze0a + yjxdpubh3a + mwyivwferx2a + "WVbUSYAh" + "" + "");
        }

        //垃圾方法
        private void yZgHHUZZ(double ixxhkdotz0, boolean tyzbnus1, char vgvbspcdq2, double ouwqrrzh3, double rsyyctpltk4) {
            double rsyyctpltk4a = rsyyctpltk4;
            double ouwqrrzh3a = ouwqrrzh3;
            char vgvbspcdq2a = vgvbspcdq2;
            boolean tyzbnus1a = tyzbnus1;
            double ixxhkdotz0a = ixxhkdotz0;
        }

        //垃圾方法
        private void rbOdmRRy(float ukorfhxte0, char cmdwunwphi1, byte wcjaxcjz2) {
            byte wcjaxcjz2a = wcjaxcjz2;
            char cmdwunwphi1a = cmdwunwphi1;
            float ukorfhxte0a = ukorfhxte0;
            new StringBuffer("rbOdmRRy" + ukorfhxte0a + wcjaxcjz2a + cmdwunwphi1a + "rbOdmRRy" + "" + "");
        }

        //垃圾方法
        private void TWEPimNG(float azicnem0, float bnjnprxm1, long jkmyvnq2, double kfkciuzd3, long kxlbytod4) {
            long kxlbytod4a = kxlbytod4;
            double kfkciuzd3a = kfkciuzd3;
            long jkmyvnq2a = jkmyvnq2;
            float bnjnprxm1a = bnjnprxm1;
            float azicnem0a = azicnem0;
            Log.i("TWEPimNG", "TWEPimNG" + azicnem0a + jkmyvnq2a + bnjnprxm1a + kfkciuzd3a + kxlbytod4a + "TWEPimNG" + "" + "");
        }

        //垃圾方法
        private void fpFMdtGL(short dwoxfmq0) {
            short dwoxfmq0a = dwoxfmq0;
            new AttributedString("fpFMdtGL" + dwoxfmq0a + "fpFMdtGL" + "" + "");
        }

        //垃圾方法
        private void YhewRXgu(byte gfdusxfzwq0, short tmfpgsf1, long cintzasos2, boolean dtutgunc3, short yorwpqqp4) {
            short yorwpqqp4a = yorwpqqp4;
            boolean dtutgunc3a = dtutgunc3;
            long cintzasos2a = cintzasos2;
            short tmfpgsf1a = tmfpgsf1;
            byte gfdusxfzwq0a = gfdusxfzwq0;
            new File("YhewRXgu" + cintzasos2a + tmfpgsf1a + dtutgunc3a + gfdusxfzwq0a + yorwpqqp4a + "YhewRXgu" + "" + "");
        }

        //垃圾方法
        private void RWtLvPPg(float bvofmvci0, boolean ahrsykrsmf1, float hpcxsop2, char whakjnwy3) {
            char whakjnwy3a = whakjnwy3;
            float hpcxsop2a = hpcxsop2;
            boolean ahrsykrsmf1a = ahrsykrsmf1;
            float bvofmvci0a = bvofmvci0;
            new String("RWtLvPPg" + ahrsykrsmf1a + whakjnwy3a + hpcxsop2a + bvofmvci0a + "RWtLvPPg" + "" + "");
        }

        //垃圾方法
        private void yZkFeGzG(boolean nazwidg0, boolean urntgae1) {
            boolean urntgae1a = urntgae1;
            boolean nazwidg0a = nazwidg0;
            TextUtils.isEmpty("yZkFeGzG" + nazwidg0a + urntgae1a + "yZkFeGzG" + "" + "");
        }

        //垃圾方法
        private void luRIpuDY(byte powvbptkk0, int jlsaflweph1) {
            int jlsaflweph1a = jlsaflweph1;
            byte powvbptkk0a = powvbptkk0;
            Log.e("luRIpuDY", "luRIpuDY" + powvbptkk0a + jlsaflweph1a + "luRIpuDY" + "" + "");
        }

        //垃圾方法
        private void ihflbCPE(byte nlsrqhttww0) {
            byte nlsrqhttww0a = nlsrqhttww0;
            new AttributedString("ihflbCPE" + nlsrqhttww0a + "ihflbCPE" + "" + "");
        }

        //垃圾方法
        private void tzLNLhZH(double dusxpfxj0, int uzqpppvd1, float dnylqzri2) {
            float dnylqzri2a = dnylqzri2;
            int uzqpppvd1a = uzqpppvd1;
            double dusxpfxj0a = dusxpfxj0;
            new AttributedString("tzLNLhZH" + dnylqzri2a + uzqpppvd1a + dusxpfxj0a + "tzLNLhZH" + "" + "");
        }

        //垃圾方法
        private void MueKyHxk(byte ddclbfqwu0) {
            byte ddclbfqwu0a = ddclbfqwu0;
            new AttributedString("MueKyHxk" + ddclbfqwu0a + "MueKyHxk" + "" + "");
        }

        //垃圾方法
        private void dKkDhhOc(char uqgsgltzin0, char pgdrnqwxl1, double truekubki2) {
            double truekubki2a = truekubki2;
            char pgdrnqwxl1a = pgdrnqwxl1;
            char uqgsgltzin0a = uqgsgltzin0;
            System.out.println("dKkDhhOc" + truekubki2a + uqgsgltzin0a + pgdrnqwxl1a + "dKkDhhOc" + "" + "");
        }

        //垃圾方法
        private void sXEwxPVb(int jhmbecbwl0, boolean qoizrsbcj1, byte dniytakps2, int vgnhzux3, boolean vonzlbgut4) {
            boolean vonzlbgut4a = vonzlbgut4;
            int vgnhzux3a = vgnhzux3;
            byte dniytakps2a = dniytakps2;
            boolean qoizrsbcj1a = qoizrsbcj1;
            int jhmbecbwl0a = jhmbecbwl0;
        }

        //垃圾方法
        private void bezPiGMZ(boolean mdxjyxiz0, float bljkddifei1, char icmxbjnijw2, double klphfdrmzc3) {
            double klphfdrmzc3a = klphfdrmzc3;
            char icmxbjnijw2a = icmxbjnijw2;
            float bljkddifei1a = bljkddifei1;
            boolean mdxjyxiz0a = mdxjyxiz0;
            Log.w("bezPiGMZ", "bezPiGMZ" + icmxbjnijw2a + mdxjyxiz0a + klphfdrmzc3a + bljkddifei1a + "bezPiGMZ" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            double klphfdrmzc3 = 2.2;
            char icmxbjnijw2 = 35;
            float bljkddifei1 = 32.32f;
            boolean mdxjyxiz0 = true;
            boolean vonzlbgut4 = true;
            int vgnhzux3 = 93;
            byte dniytakps2 = 0;
            boolean qoizrsbcj1 = true;
            int jhmbecbwl0 = 60;
            double truekubki2 = 52.52;
            char pgdrnqwxl1 = 3;
            char uqgsgltzin0 = 38;
            byte ddclbfqwu0 = 0;
            float dnylqzri2 = 76.76f;
            int uzqpppvd1 = 69;
            double dusxpfxj0 = 29.29;
            byte nlsrqhttww0 = 50;
            int jlsaflweph1 = 17;
            byte powvbptkk0 = 65;
            boolean urntgae1 = true;
            boolean nazwidg0 = true;
            char whakjnwy3 = 55;
            float hpcxsop2 = 84.84f;
            boolean ahrsykrsmf1 = true;
            float bvofmvci0 = 33.33f;
            short yorwpqqp4 = 68;
            boolean dtutgunc3 = false;
            long cintzasos2 = 82L;
            short tmfpgsf1 = 40;
            byte gfdusxfzwq0 = 10;
            short dwoxfmq0 = 48;
            long kxlbytod4 = 57L;
            double kfkciuzd3 = 32.32;
            long jkmyvnq2 = 54L;
            float bnjnprxm1 = 100.100f;
            float azicnem0 = 33.33f;
            byte wcjaxcjz2 = 70;
            char cmdwunwphi1 = 76;
            float ukorfhxte0 = 21.21f;
            double rsyyctpltk4 = 79.79;
            double ouwqrrzh3 = 14.14;
            char vgvbspcdq2 = 50;
            boolean tyzbnus1 = false;
            double ixxhkdotz0 = 5.5;
            long yjxdpubh3 = 93L;
            double mwyivwferx2 = 53.53;
            long cyqvlvect1 = 98L;
            byte npmugze0 = 20;
            char qccwnpxf3 = 3;
            byte hrlwwmsmc2 = 78;
            long pfovxyvt1 = 100L;
            byte teyjcnofk0 = 81;
            ihflbCPE(nlsrqhttww0);
            tzLNLhZH(dusxpfxj0, uzqpppvd1, dnylqzri2);
            YhewRXgu(gfdusxfzwq0, tmfpgsf1, cintzasos2, dtutgunc3, yorwpqqp4);
            if (TidyManager.isDebug) {
                Log.e(Tidy1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            subBinder = null;
            Tidy1Service.isReTryBinding = true;
            luRIpuDY(powvbptkk0, jlsaflweph1);
            bezPiGMZ(mdxjyxiz0, bljkddifei1, icmxbjnijw2, klphfdrmzc3);
            ihflbCPE(nlsrqhttww0);
            rbOdmRRy(ukorfhxte0, cmdwunwphi1, wcjaxcjz2);
            tzLNLhZH(dusxpfxj0, uzqpppvd1, dnylqzri2);
            YhewRXgu(gfdusxfzwq0, tmfpgsf1, cintzasos2, dtutgunc3, yorwpqqp4);
            sXEwxPVb(jhmbecbwl0, qoizrsbcj1, dniytakps2, vgnhzux3, vonzlbgut4);
            YhewRXgu(gfdusxfzwq0, tmfpgsf1, cintzasos2, dtutgunc3, yorwpqqp4);
            TWEPimNG(azicnem0, bnjnprxm1, jkmyvnq2, kfkciuzd3, kxlbytod4);
            startSubService(2, false);
        }

        //垃圾方法
        private void WhIYStbD(char giojkzudc0, long pirwzmrz1, float yplpvhgmv2, byte yjbygkerz3) {
            byte yjbygkerz3a = yjbygkerz3;
            float yplpvhgmv2a = yplpvhgmv2;
            long pirwzmrz1a = pirwzmrz1;
            char giojkzudc0a = giojkzudc0;
            new Intent("WhIYStbD" + yjbygkerz3a + yplpvhgmv2a + pirwzmrz1a + giojkzudc0a + "WhIYStbD" + "" + "");
        }

        //垃圾方法
        private void SMVajFVx(long ktkhyyr0, long zzpwyfktf1, boolean mwamaaaheu2) {
            boolean mwamaaaheu2a = mwamaaaheu2;
            long zzpwyfktf1a = zzpwyfktf1;
            long ktkhyyr0a = ktkhyyr0;
            new StringReader("SMVajFVx" + ktkhyyr0a + zzpwyfktf1a + mwamaaaheu2a + "SMVajFVx" + "" + "");
        }

        //垃圾方法
        private void BNmlNptS(long ejtgaoklrw0) {
            long ejtgaoklrw0a = ejtgaoklrw0;
            new AttributedString("BNmlNptS" + ejtgaoklrw0a + "BNmlNptS" + "" + "");
        }

        //垃圾方法
        private void VqaSIHzK(long epueumgdjq0, double bpwmctxs1) {
            double bpwmctxs1a = bpwmctxs1;
            long epueumgdjq0a = epueumgdjq0;
            new String("VqaSIHzK" + bpwmctxs1a + epueumgdjq0a + "VqaSIHzK" + "" + "");
        }

        //垃圾方法
        private void GSPOwJdE(float etamnutep0, float etvqyhr1) {
            float etvqyhr1a = etvqyhr1;
            float etamnutep0a = etamnutep0;
            new String("GSPOwJdE" + etamnutep0a + etvqyhr1a + "GSPOwJdE" + "" + "");
        }

        //垃圾方法
        private void BzAWleHB(int doviutu0, long weyoruet1, float rsdbowcyl2, float vngevefhym3) {
            float vngevefhym3a = vngevefhym3;
            float rsdbowcyl2a = rsdbowcyl2;
            long weyoruet1a = weyoruet1;
            int doviutu0a = doviutu0;
            new StringReader("BzAWleHB" + vngevefhym3a + doviutu0a + weyoruet1a + rsdbowcyl2a + "BzAWleHB" + "" + "");
        }

        //垃圾方法
        private void HpwjaXOX(int malvskqt0) {
            int malvskqt0a = malvskqt0;
            new Thread("HpwjaXOX" + malvskqt0a + "HpwjaXOX" + "" + "");
        }

        //垃圾方法
        private void WdNIXCcV(long tkmywqlvgr0, char jssvuownri1, double ytbjxwxx2) {
            double ytbjxwxx2a = ytbjxwxx2;
            char jssvuownri1a = jssvuownri1;
            long tkmywqlvgr0a = tkmywqlvgr0;
            new StringBuffer("WdNIXCcV" + tkmywqlvgr0a + ytbjxwxx2a + jssvuownri1a + "WdNIXCcV" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            double ytbjxwxx2 = 13.13;
            char jssvuownri1 = 78;
            long tkmywqlvgr0 = 40L;
            int malvskqt0 = 15;
            float vngevefhym3 = 64.64f;
            float rsdbowcyl2 = 8.8f;
            long weyoruet1 = 97L;
            int doviutu0 = 34;
            float etvqyhr1 = 93.93f;
            float etamnutep0 = 34.34f;
            double bpwmctxs1 = 68.68;
            long epueumgdjq0 = 34L;
            long ejtgaoklrw0 = 36L;
            boolean mwamaaaheu2 = true;
            long zzpwyfktf1 = 69L;
            long ktkhyyr0 = 48L;
            byte yjbygkerz3 = 10;
            float yplpvhgmv2 = 13.13f;
            long pirwzmrz1 = 35L;
            char giojkzudc0 = 98;
            BzAWleHB(doviutu0, weyoruet1, rsdbowcyl2, vngevefhym3);
            WdNIXCcV(tkmywqlvgr0, jssvuownri1, ytbjxwxx2);
            BzAWleHB(doviutu0, weyoruet1, rsdbowcyl2, vngevefhym3);
            BzAWleHB(doviutu0, weyoruet1, rsdbowcyl2, vngevefhym3);
            WhIYStbD(giojkzudc0, pirwzmrz1, yplpvhgmv2, yjbygkerz3);
            if (TidyManager.isDebug) {
                BNmlNptS(ejtgaoklrw0);
                GSPOwJdE(etamnutep0, etvqyhr1);
                GSPOwJdE(etamnutep0, etvqyhr1);
                WhIYStbD(giojkzudc0, pirwzmrz1, yplpvhgmv2, yjbygkerz3);
                HpwjaXOX(malvskqt0);
                GSPOwJdE(etamnutep0, etvqyhr1);
                VqaSIHzK(epueumgdjq0, bpwmctxs1);
                Log.e(Tidy1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            BzAWleHB(doviutu0, weyoruet1, rsdbowcyl2, vngevefhym3);
            BzAWleHB(doviutu0, weyoruet1, rsdbowcyl2, vngevefhym3);
            BNmlNptS(ejtgaoklrw0);
            BNmlNptS(ejtgaoklrw0);
            WdNIXCcV(tkmywqlvgr0, jssvuownri1, ytbjxwxx2);
            SMVajFVx(ktkhyyr0, zzpwyfktf1, mwamaaaheu2);
            BNmlNptS(ejtgaoklrw0);
            HpwjaXOX(malvskqt0);
            BNmlNptS(ejtgaoklrw0);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private float WttGtov = 100.100f;

    //垃圾变量
    private short kmgZWVn = 35;

    //垃圾变量
    private long ZOMPhjL = 20L;

    //垃圾变量
    private double tCNwFPM = 20.20;

    //垃圾方法
    private void KhAyCEbq(char yctglckp0, double xyolwetqh1, char yhlooshad2, short pckieatqa3) {
        short pckieatqa3a = pckieatqa3;
        char yhlooshad2a = yhlooshad2;
        double xyolwetqh1a = xyolwetqh1;
        char yctglckp0a = yctglckp0;
        new File("KhAyCEbq" + yctglckp0a + yhlooshad2a + xyolwetqh1a + pckieatqa3a + "KhAyCEbq" + BXJRAgF + aarbZeb + bHLRMkx + nDvxEsp + dxmwPSi + ZOMPhjL + hXdeRan + QWElVJD + Mzrffcg + WIknEVt + ddmKvwD + LeUxIUn + WttGtov + "");
    }

    //垃圾方法
    private void GQLgDbGv(boolean qoydlpd0, byte ouklleqfzu1, char wrpdnnjel2) {
        char wrpdnnjel2a = wrpdnnjel2;
        byte ouklleqfzu1a = ouklleqfzu1;
        boolean qoydlpd0a = qoydlpd0;
        new File("GQLgDbGv" + ouklleqfzu1a + qoydlpd0a + wrpdnnjel2a + "GQLgDbGv" + WIknEVt + Mzrffcg + LeUxIUn + WttGtov + ZOMPhjL + ddmKvwD + dxmwPSi + BXJRAgF + hXdeRan + nDvxEsp + bHLRMkx + QWElVJD + aarbZeb + "");
    }

    //垃圾方法
    private void VtEHKRRn(long yswveleq0, char kycpeqvt1) {
        char kycpeqvt1a = kycpeqvt1;
        long yswveleq0a = yswveleq0;
        new String("VtEHKRRn" + kycpeqvt1a + yswveleq0a + "VtEHKRRn" + dxmwPSi + QWElVJD + Mzrffcg + bHLRMkx + aarbZeb + ZOMPhjL + ddmKvwD + WIknEVt + WttGtov + nDvxEsp + LeUxIUn + BXJRAgF + hXdeRan + "");
    }

    //垃圾方法
    private void BpqCkeWm(double zaltvbmph0, boolean jnvfrbzeew1, byte hgoqnio2) {
        byte hgoqnio2a = hgoqnio2;
        boolean jnvfrbzeew1a = jnvfrbzeew1;
        double zaltvbmph0a = zaltvbmph0;
        Log.i("BpqCkeWm", "BpqCkeWm" + zaltvbmph0a + jnvfrbzeew1a + hgoqnio2a + "BpqCkeWm" + Mzrffcg + BXJRAgF + ZOMPhjL + hXdeRan + LeUxIUn + aarbZeb + QWElVJD + nDvxEsp + WttGtov + WIknEVt + ddmKvwD + bHLRMkx + dxmwPSi + "");
    }

    //垃圾方法
    private void hNrzvoZH(double alaviwmjr0, int lkypmsaau1) {
        int lkypmsaau1a = lkypmsaau1;
        double alaviwmjr0a = alaviwmjr0;
        new Intent("hNrzvoZH" + alaviwmjr0a + lkypmsaau1a + "hNrzvoZH" + BXJRAgF + WttGtov + QWElVJD + dxmwPSi + bHLRMkx + WIknEVt + aarbZeb + hXdeRan + Mzrffcg + LeUxIUn + ZOMPhjL + nDvxEsp + ddmKvwD + "");
    }

    //垃圾方法
    private void xSkuVRUy(short twvfzdqc0, boolean pmoobmhijo1, boolean belpzwunm2, float sypdvwaldi3, long xtxtmzumr4) {
        long xtxtmzumr4a = xtxtmzumr4;
        float sypdvwaldi3a = sypdvwaldi3;
        boolean belpzwunm2a = belpzwunm2;
        boolean pmoobmhijo1a = pmoobmhijo1;
        short twvfzdqc0a = twvfzdqc0;
        new Intent("xSkuVRUy" + twvfzdqc0a + sypdvwaldi3a + belpzwunm2a + pmoobmhijo1a + xtxtmzumr4a + "xSkuVRUy" + ddmKvwD + ZOMPhjL + dxmwPSi + BXJRAgF + aarbZeb + WIknEVt + LeUxIUn + nDvxEsp + QWElVJD + hXdeRan + WttGtov + bHLRMkx + Mzrffcg + "");
    }

    //垃圾方法
    private void szOPsOfc(double jrjczga0) {
        double jrjczga0a = jrjczga0;
        System.out.println("szOPsOfc" + jrjczga0a + "szOPsOfc" + ddmKvwD + ZOMPhjL + BXJRAgF + QWElVJD + WIknEVt + dxmwPSi + Mzrffcg + hXdeRan + LeUxIUn + bHLRMkx + aarbZeb + nDvxEsp + WttGtov + "");
    }

    //垃圾方法
    private void JiFnnXDu(long uyiwrjhh0, char afpkeoal1, byte pjefwzyakt2, int kurlemadl3, char xetiskdxro4) {
        char xetiskdxro4a = xetiskdxro4;
        int kurlemadl3a = kurlemadl3;
        byte pjefwzyakt2a = pjefwzyakt2;
        char afpkeoal1a = afpkeoal1;
        long uyiwrjhh0a = uyiwrjhh0;
        new AttributedString("JiFnnXDu" + xetiskdxro4a + uyiwrjhh0a + kurlemadl3a + pjefwzyakt2a + afpkeoal1a + "JiFnnXDu" + dxmwPSi + hXdeRan + BXJRAgF + ZOMPhjL + QWElVJD + nDvxEsp + aarbZeb + bHLRMkx + WIknEVt + Mzrffcg + WttGtov + ddmKvwD + LeUxIUn + "");
    }

    public String toString() {
        char xetiskdxro4 = 22;
        int kurlemadl3 = 57;
        byte pjefwzyakt2 = 35;
        char afpkeoal1 = 91;
        long uyiwrjhh0 = 10L;
        double jrjczga0 = 27.27;
        long xtxtmzumr4 = 87L;
        float sypdvwaldi3 = 65.65f;
        boolean belpzwunm2 = false;
        boolean pmoobmhijo1 = false;
        short twvfzdqc0 = 7;
        int lkypmsaau1 = 33;
        double alaviwmjr0 = 34.34;
        byte hgoqnio2 = 75;
        boolean jnvfrbzeew1 = true;
        double zaltvbmph0 = 78.78;
        char kycpeqvt1 = 73;
        long yswveleq0 = 73L;
        char wrpdnnjel2 = 61;
        byte ouklleqfzu1 = 91;
        boolean qoydlpd0 = true;
        short pckieatqa3 = 70;
        char yhlooshad2 = 53;
        double xyolwetqh1 = 34.34;
        char yctglckp0 = 84;
        new File("" + tCNwFPM + kmgZWVn + "");
        JiFnnXDu(uyiwrjhh0, afpkeoal1, pjefwzyakt2, kurlemadl3, xetiskdxro4);
        GQLgDbGv(qoydlpd0, ouklleqfzu1, wrpdnnjel2);
        BpqCkeWm(zaltvbmph0, jnvfrbzeew1, hgoqnio2);
        VtEHKRRn(yswveleq0, kycpeqvt1);
        JiFnnXDu(uyiwrjhh0, afpkeoal1, pjefwzyakt2, kurlemadl3, xetiskdxro4);
        BpqCkeWm(zaltvbmph0, jnvfrbzeew1, hgoqnio2);
        GQLgDbGv(qoydlpd0, ouklleqfzu1, wrpdnnjel2);
        JiFnnXDu(uyiwrjhh0, afpkeoal1, pjefwzyakt2, kurlemadl3, xetiskdxro4);
        JiFnnXDu(uyiwrjhh0, afpkeoal1, pjefwzyakt2, kurlemadl3, xetiskdxro4);
        return super.toString();
    }
}
