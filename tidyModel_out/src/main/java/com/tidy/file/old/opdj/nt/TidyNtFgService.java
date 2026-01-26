package com.tidy.file.old.opdj.nt;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tidy.file.old.FirebaseUtils;
import com.tidy.file.old.TidyManager;
import com.tidy.file.R;
import com.tidy.file.old.shownotificy.TidyNtTransfer;
import com.tidy.file.old.use.TidyNotiTimesHelper;
import java.util.Iterator;
import java.util.Objects;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

public class TidyNtFgService extends Service {

    //垃圾变量
    private short bUflrTe = 7;

    static boolean isLiving;

    //垃圾变量
    private int CZBywWv = 14;

    static boolean isShowing;

    //垃圾变量
    private int RsRPiuv = 60;

    static String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private short nDuvFRn = 62;

    static String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private short JQBHDzd = 25;

    static int Notification_ID1 = 9745125;

    //垃圾变量
    private short BEGaqch = 80;

    //clock  job  launchapp  everytime_show_notify(每次通知展示的时候)
    static String from = "action_from";

    public TidyNtFgService() {
    }

    //垃圾方法
    static private void wmznwxRh(long dnixxweatt0, byte dpyirwvn1, char xifwhitl2, double zlwiwpbdw3) {
        double zlwiwpbdw3a = zlwiwpbdw3;
        char xifwhitl2a = xifwhitl2;
        byte dpyirwvn1a = dpyirwvn1;
        long dnixxweatt0a = dnixxweatt0;
        new WeakReference("wmznwxRh" + dpyirwvn1a + zlwiwpbdw3a + xifwhitl2a + dnixxweatt0a + "wmznwxRh" + "");
    }

    //垃圾方法
    static private void QxrKJepK(double jnaalinkh0, long prtcggsi1, long sitlnws2, long qvbsizay3) {
        long qvbsizay3a = qvbsizay3;
        long sitlnws2a = sitlnws2;
        long prtcggsi1a = prtcggsi1;
        double jnaalinkh0a = jnaalinkh0;
        new StringReader("QxrKJepK" + jnaalinkh0a + prtcggsi1a + qvbsizay3a + sitlnws2a + "QxrKJepK" + "");
    }

    //垃圾方法
    static private void oJYYaOxv(double aateegiw0, short vztfioy1) {
        short vztfioy1a = vztfioy1;
        double aateegiw0a = aateegiw0;
        new StringBuilder("oJYYaOxv" + aateegiw0a + vztfioy1a + "oJYYaOxv" + "");
    }

    //垃圾方法
    static private void oaVCsRoL(byte xjtdxivyrb0, byte fkqwlbaw1, char cclhbcvpl2, double oddrwhy3) {
        double oddrwhy3a = oddrwhy3;
        char cclhbcvpl2a = cclhbcvpl2;
        byte fkqwlbaw1a = fkqwlbaw1;
        byte xjtdxivyrb0a = xjtdxivyrb0;
        new Thread("oaVCsRoL" + oddrwhy3a + cclhbcvpl2a + fkqwlbaw1a + xjtdxivyrb0a + "oaVCsRoL" + "");
    }

    public static boolean getIsShowing() {
        double oddrwhy3 = 27.27;
        char cclhbcvpl2 = 55;
        byte fkqwlbaw1 = 7;
        byte xjtdxivyrb0 = 35;
        short vztfioy1 = 16;
        double aateegiw0 = 0.0;
        long qvbsizay3 = 67L;
        long sitlnws2 = 76L;
        long prtcggsi1 = 32L;
        double jnaalinkh0 = 10.10;
        double zlwiwpbdw3 = 37.37;
        char xifwhitl2 = 15;
        byte dpyirwvn1 = 87;
        long dnixxweatt0 = 65L;
        wmznwxRh(dnixxweatt0, dpyirwvn1, xifwhitl2, zlwiwpbdw3);
        wmznwxRh(dnixxweatt0, dpyirwvn1, xifwhitl2, zlwiwpbdw3);
        oaVCsRoL(xjtdxivyrb0, fkqwlbaw1, cclhbcvpl2, oddrwhy3);
        return isShowing;
    }

    //垃圾方法
    static private void OqgbWhSD(char hjmvmjsrth0, short jsffhqqjyt1) {
        short jsffhqqjyt1a = jsffhqqjyt1;
        char hjmvmjsrth0a = hjmvmjsrth0;
        new File("OqgbWhSD" + jsffhqqjyt1a + hjmvmjsrth0a + "OqgbWhSD" + "");
    }

    //垃圾方法
    static private void YeldSQzR(byte eehzqaq0, char dimsupi1, long pesfuzt2) {
        long pesfuzt2a = pesfuzt2;
        char dimsupi1a = dimsupi1;
        byte eehzqaq0a = eehzqaq0;
        new StringBuffer("YeldSQzR" + eehzqaq0a + dimsupi1a + pesfuzt2a + "YeldSQzR" + "");
    }

    //垃圾方法
    static private void vIDcaCFJ(int eicloudelb0, byte xsshbixux1, int zzhackh2) {
        int zzhackh2a = zzhackh2;
        byte xsshbixux1a = xsshbixux1;
        int eicloudelb0a = eicloudelb0;
        new Intent("vIDcaCFJ" + eicloudelb0a + zzhackh2a + xsshbixux1a + "vIDcaCFJ" + "");
    }

    //垃圾方法
    static private void fOjbOrCX(short bntlwgvq0, boolean qnhgkeetes1, double rkygrhso2) {
        double rkygrhso2a = rkygrhso2;
        boolean qnhgkeetes1a = qnhgkeetes1;
        short bntlwgvq0a = bntlwgvq0;
        System.out.println("fOjbOrCX" + bntlwgvq0a + qnhgkeetes1a + rkygrhso2a + "fOjbOrCX" + "");
    }

    public static void startNotifyService(boolean isFromActivity, String from) {
        double rkygrhso2 = 66.66;
        boolean qnhgkeetes1 = true;
        short bntlwgvq0 = 10;
        int zzhackh2 = 13;
        byte xsshbixux1 = 36;
        int eicloudelb0 = 27;
        long pesfuzt2 = 28L;
        char dimsupi1 = 41;
        byte eehzqaq0 = 1;
        short jsffhqqjyt1 = 59;
        char hjmvmjsrth0 = 0;
        fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
        fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
        fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
        vIDcaCFJ(eicloudelb0, xsshbixux1, zzhackh2);
        vIDcaCFJ(eicloudelb0, xsshbixux1, zzhackh2);
        try {
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            OqgbWhSD(hjmvmjsrth0, jsffhqqjyt1);
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            YeldSQzR(eehzqaq0, dimsupi1, pesfuzt2);
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            OqgbWhSD(hjmvmjsrth0, jsffhqqjyt1);
            YeldSQzR(eehzqaq0, dimsupi1, pesfuzt2);
            OqgbWhSD(hjmvmjsrth0, jsffhqqjyt1);
            Context context = TidyManager.mContext;
            Intent intent = new Intent(context, TidyNtFgService.class);
            intent.putExtra(TidyNtFgService.from, from);
            intent.setPackage(context.getPackageName());
            OqgbWhSD(hjmvmjsrth0, jsffhqqjyt1);
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            YeldSQzR(eehzqaq0, dimsupi1, pesfuzt2);
            YeldSQzR(eehzqaq0, dimsupi1, pesfuzt2);
            YeldSQzR(eehzqaq0, dimsupi1, pesfuzt2);
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            OqgbWhSD(hjmvmjsrth0, jsffhqqjyt1);
            fOjbOrCX(bntlwgvq0, qnhgkeetes1, rkygrhso2);
            if (VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception var19) {
            Exception e = var19;
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void jFcIBQFa(float lvwsjkz0, boolean jlmqkblnwi1, boolean yumjneqfv2, byte thcuxuehqb3) {
        byte thcuxuehqb3a = thcuxuehqb3;
        boolean yumjneqfv2a = yumjneqfv2;
        boolean jlmqkblnwi1a = jlmqkblnwi1;
        float lvwsjkz0a = lvwsjkz0;
        TextUtils.isEmpty("jFcIBQFa" + jlmqkblnwi1a + yumjneqfv2a + lvwsjkz0a + thcuxuehqb3a + "jFcIBQFa" + CZBywWv + nDuvFRn + JQBHDzd + XlzHheA + FYtVhlo + RsRPiuv + bUflrTe + BEGaqch + "");
    }

    //垃圾方法
    private void zeYTwegv(char xpeqchyc0) {
        char xpeqchyc0a = xpeqchyc0;
        TextUtils.isEmpty("zeYTwegv" + xpeqchyc0a + "zeYTwegv" + RsRPiuv + JQBHDzd + FYtVhlo + BEGaqch + CZBywWv + nDuvFRn + bUflrTe + XlzHheA + "");
    }

    //垃圾方法
    private void QpbRSpbl(long lgtvwrss0, double fvczulf1, char fzeypmkovi2, byte kfehmvib3, int lnmdnzgtk4) {
        int lnmdnzgtk4a = lnmdnzgtk4;
        byte kfehmvib3a = kfehmvib3;
        char fzeypmkovi2a = fzeypmkovi2;
        double fvczulf1a = fvczulf1;
        long lgtvwrss0a = lgtvwrss0;
        Log.e("QpbRSpbl", "QpbRSpbl" + lgtvwrss0a + kfehmvib3a + fvczulf1a + fzeypmkovi2a + lnmdnzgtk4a + "QpbRSpbl" + XlzHheA + BEGaqch + JQBHDzd + bUflrTe + RsRPiuv + FYtVhlo + CZBywWv + nDuvFRn + "");
    }

    //垃圾方法
    private void vjdQgYLF(char dohijqkdt0, boolean igbhqjajk1) {
        boolean igbhqjajk1a = igbhqjajk1;
        char dohijqkdt0a = dohijqkdt0;
        new StringBuffer("vjdQgYLF" + igbhqjajk1a + dohijqkdt0a + "vjdQgYLF" + FYtVhlo + XlzHheA + BEGaqch + RsRPiuv + CZBywWv + bUflrTe + nDuvFRn + JQBHDzd + "");
    }

    //垃圾方法
    private void xBKngWqp(char hrwzazguj0) {
        char hrwzazguj0a = hrwzazguj0;
        new StringBuilder("xBKngWqp" + hrwzazguj0a + "xBKngWqp" + XlzHheA + nDuvFRn + BEGaqch + RsRPiuv + CZBywWv + FYtVhlo + JQBHDzd + bUflrTe + "");
    }

    //垃圾方法
    private void iqnLMCbv(float nkhiylxwq0, boolean ujxodjpv1, char rgxdpiyt2, short iejuejosh3) {
        short iejuejosh3a = iejuejosh3;
        char rgxdpiyt2a = rgxdpiyt2;
        boolean ujxodjpv1a = ujxodjpv1;
        float nkhiylxwq0a = nkhiylxwq0;
        TextUtils.isEmpty("iqnLMCbv" + nkhiylxwq0a + ujxodjpv1a + iejuejosh3a + rgxdpiyt2a + "iqnLMCbv" + RsRPiuv + XlzHheA + CZBywWv + nDuvFRn + bUflrTe + JQBHDzd + BEGaqch + FYtVhlo + "");
    }

    //垃圾方法
    private void pUYghsuT(boolean qgfengnj0, long gbubdynnba1, boolean aelfcpi2) {
        boolean aelfcpi2a = aelfcpi2;
        long gbubdynnba1a = gbubdynnba1;
        boolean qgfengnj0a = qgfengnj0;
        System.out.println("pUYghsuT" + aelfcpi2a + qgfengnj0a + gbubdynnba1a + "pUYghsuT" + CZBywWv + BEGaqch + FYtVhlo + nDuvFRn + JQBHDzd + bUflrTe + XlzHheA + RsRPiuv + "");
    }

    //垃圾方法
    private void VlBiUmQC(int mptzlmaie0, float ocnlgfeq1, long yppzamqpas2, long eewuneljd3) {
        long eewuneljd3a = eewuneljd3;
        long yppzamqpas2a = yppzamqpas2;
        float ocnlgfeq1a = ocnlgfeq1;
        int mptzlmaie0a = mptzlmaie0;
        new File("VlBiUmQC" + ocnlgfeq1a + mptzlmaie0a + yppzamqpas2a + eewuneljd3a + "VlBiUmQC" + FYtVhlo + RsRPiuv + nDuvFRn + XlzHheA + bUflrTe + BEGaqch + JQBHDzd + CZBywWv + "");
    }

    //垃圾方法
    private void sCtTwmSc(byte inrqbgj0, int hofjfveeom1, boolean dqiqzugh2, int qchcnuzwm3) {
        int qchcnuzwm3a = qchcnuzwm3;
        boolean dqiqzugh2a = dqiqzugh2;
        int hofjfveeom1a = hofjfveeom1;
        byte inrqbgj0a = inrqbgj0;
        new Intent("sCtTwmSc" + qchcnuzwm3a + dqiqzugh2a + inrqbgj0a + hofjfveeom1a + "sCtTwmSc" + nDuvFRn + XlzHheA + CZBywWv + JQBHDzd + BEGaqch + bUflrTe + RsRPiuv + FYtVhlo + "");
    }

    //垃圾方法
    private void ZhcnCUNQ(char ghulkkoln0, boolean jacsssdeqp1, boolean fdlrrboumo2) {
        boolean fdlrrboumo2a = fdlrrboumo2;
        boolean jacsssdeqp1a = jacsssdeqp1;
        char ghulkkoln0a = ghulkkoln0;
        new WeakReference("ZhcnCUNQ" + ghulkkoln0a + fdlrrboumo2a + jacsssdeqp1a + "ZhcnCUNQ" + RsRPiuv + bUflrTe + BEGaqch + FYtVhlo + XlzHheA + JQBHDzd + CZBywWv + nDuvFRn + "");
    }

    //垃圾方法
    private void wKBbZiga(int ppwldwidxj0, long sbwiisrtow1, long jscuzlsdnz2) {
        long jscuzlsdnz2a = jscuzlsdnz2;
        long sbwiisrtow1a = sbwiisrtow1;
        int ppwldwidxj0a = ppwldwidxj0;
        new Thread("wKBbZiga" + sbwiisrtow1a + jscuzlsdnz2a + ppwldwidxj0a + "wKBbZiga" + XlzHheA + FYtVhlo + BEGaqch + bUflrTe + CZBywWv + RsRPiuv + nDuvFRn + JQBHDzd + "");
    }

    //垃圾方法
    private void joPHKnbg(boolean baofvxl0, boolean vkdbppxq1) {
        boolean vkdbppxq1a = vkdbppxq1;
        boolean baofvxl0a = baofvxl0;
        new StringReader("joPHKnbg" + vkdbppxq1a + baofvxl0a + "joPHKnbg" + FYtVhlo + JQBHDzd + XlzHheA + BEGaqch + RsRPiuv + bUflrTe + nDuvFRn + CZBywWv + "");
    }

    //垃圾方法
    private void qDxKeitz(double qrbwauznsd0) {
        double qrbwauznsd0a = qrbwauznsd0;
    }

    //垃圾方法
    private void GnYoWhsR(long mygtcch0) {
        long mygtcch0a = mygtcch0;
        new String("GnYoWhsR" + mygtcch0a + "GnYoWhsR" + CZBywWv + XlzHheA + nDuvFRn + FYtVhlo + bUflrTe + JQBHDzd + BEGaqch + RsRPiuv + "");
    }

    //垃圾方法
    private void PnRgaZHr(boolean ynurndp0) {
        boolean ynurndp0a = ynurndp0;
        new Intent("PnRgaZHr" + ynurndp0a + "PnRgaZHr" + XlzHheA + CZBywWv + bUflrTe + nDuvFRn + RsRPiuv + JQBHDzd + BEGaqch + FYtVhlo + "");
    }

    //垃圾方法
    private void PtFrcFAO(long orygeua0, int ujvjamjkzn1) {
        int ujvjamjkzn1a = ujvjamjkzn1;
        long orygeua0a = orygeua0;
        new StringBuffer("PtFrcFAO" + ujvjamjkzn1a + orygeua0a + "PtFrcFAO" + XlzHheA + RsRPiuv + CZBywWv + nDuvFRn + bUflrTe + JQBHDzd + FYtVhlo + BEGaqch + "");
    }

    //垃圾方法
    private void CGMeKMRG(char zbmhgasf0, float bbwgglz1) {
        float bbwgglz1a = bbwgglz1;
        char zbmhgasf0a = zbmhgasf0;
        Log.i("CGMeKMRG", "CGMeKMRG" + bbwgglz1a + zbmhgasf0a + "CGMeKMRG" + RsRPiuv + nDuvFRn + FYtVhlo + BEGaqch + CZBywWv + XlzHheA + JQBHDzd + bUflrTe + "");
    }

    //垃圾方法
    private void skkojCMB(long zznrwowz0, char zgzvkssb1, int wpbogxmssg2, long auhikjpnlf3) {
        long auhikjpnlf3a = auhikjpnlf3;
        int wpbogxmssg2a = wpbogxmssg2;
        char zgzvkssb1a = zgzvkssb1;
        long zznrwowz0a = zznrwowz0;
        Log.w("skkojCMB", "skkojCMB" + zznrwowz0a + wpbogxmssg2a + auhikjpnlf3a + zgzvkssb1a + "skkojCMB" + RsRPiuv + bUflrTe + CZBywWv + nDuvFRn + JQBHDzd + XlzHheA + BEGaqch + FYtVhlo + "");
    }

    //垃圾方法
    private void defWFDIY(int ettkwtbqlz0, char wykzzfsl1, char vmcjncp2, byte iuiopvaq3, char nnmplxmziu4) {
        char nnmplxmziu4a = nnmplxmziu4;
        byte iuiopvaq3a = iuiopvaq3;
        char vmcjncp2a = vmcjncp2;
        char wykzzfsl1a = wykzzfsl1;
        int ettkwtbqlz0a = ettkwtbqlz0;
        new WeakReference("defWFDIY" + ettkwtbqlz0a + iuiopvaq3a + nnmplxmziu4a + wykzzfsl1a + vmcjncp2a + "defWFDIY" + XlzHheA + JQBHDzd + CZBywWv + RsRPiuv + BEGaqch + FYtVhlo + nDuvFRn + bUflrTe + "");
    }

    //垃圾方法
    private void CrFMILEi(short dmzcgqkoh0) {
        short dmzcgqkoh0a = dmzcgqkoh0;
        new StringBuilder("CrFMILEi" + dmzcgqkoh0a + "CrFMILEi" + nDuvFRn + JQBHDzd + bUflrTe + XlzHheA + BEGaqch + FYtVhlo + CZBywWv + RsRPiuv + "");
    }

    public void onCreate() {
        short dmzcgqkoh0 = 61;
        char nnmplxmziu4 = 48;
        byte iuiopvaq3 = 95;
        char vmcjncp2 = 61;
        char wykzzfsl1 = 66;
        int ettkwtbqlz0 = 55;
        long auhikjpnlf3 = 62L;
        int wpbogxmssg2 = 15;
        char zgzvkssb1 = 16;
        long zznrwowz0 = 94L;
        float bbwgglz1 = 88.88f;
        char zbmhgasf0 = 51;
        int ujvjamjkzn1 = 88;
        long orygeua0 = 96L;
        boolean ynurndp0 = true;
        long mygtcch0 = 89L;
        double qrbwauznsd0 = 80.80;
        boolean vkdbppxq1 = false;
        boolean baofvxl0 = true;
        long jscuzlsdnz2 = 42L;
        long sbwiisrtow1 = 63L;
        int ppwldwidxj0 = 61;
        boolean fdlrrboumo2 = true;
        boolean jacsssdeqp1 = true;
        char ghulkkoln0 = 13;
        int qchcnuzwm3 = 25;
        boolean dqiqzugh2 = false;
        int hofjfveeom1 = 50;
        byte inrqbgj0 = 57;
        long eewuneljd3 = 34L;
        long yppzamqpas2 = 32L;
        float ocnlgfeq1 = 90.90f;
        int mptzlmaie0 = 45;
        boolean aelfcpi2 = false;
        long gbubdynnba1 = 85L;
        boolean qgfengnj0 = true;
        short iejuejosh3 = 50;
        char rgxdpiyt2 = 41;
        boolean ujxodjpv1 = false;
        float nkhiylxwq0 = 85.85f;
        char hrwzazguj0 = 17;
        boolean igbhqjajk1 = true;
        char dohijqkdt0 = 5;
        int lnmdnzgtk4 = 35;
        byte kfehmvib3 = 53;
        char fzeypmkovi2 = 38;
        double fvczulf1 = 6.6;
        long lgtvwrss0 = 12L;
        char xpeqchyc0 = 27;
        byte thcuxuehqb3 = 28;
        boolean yumjneqfv2 = true;
        boolean jlmqkblnwi1 = false;
        float lvwsjkz0 = 74.74f;
        skkojCMB(zznrwowz0, zgzvkssb1, wpbogxmssg2, auhikjpnlf3);
        defWFDIY(ettkwtbqlz0, wykzzfsl1, vmcjncp2, iuiopvaq3, nnmplxmziu4);
        skkojCMB(zznrwowz0, zgzvkssb1, wpbogxmssg2, auhikjpnlf3);
        joPHKnbg(baofvxl0, vkdbppxq1);
        jFcIBQFa(lvwsjkz0, jlmqkblnwi1, yumjneqfv2, thcuxuehqb3);
        pUYghsuT(qgfengnj0, gbubdynnba1, aelfcpi2);
        qDxKeitz(qrbwauznsd0);
        isLiving = true;
        isShowing = false;
        defWFDIY(ettkwtbqlz0, wykzzfsl1, vmcjncp2, iuiopvaq3, nnmplxmziu4);
        PtFrcFAO(orygeua0, ujvjamjkzn1);
        CrFMILEi(dmzcgqkoh0);
        PtFrcFAO(orygeua0, ujvjamjkzn1);
        CrFMILEi(dmzcgqkoh0);
        xBKngWqp(hrwzazguj0);
        GnYoWhsR(mygtcch0);
        super.onCreate();
        joPHKnbg(baofvxl0, vkdbppxq1);
        zeYTwegv(xpeqchyc0);
        iqnLMCbv(nkhiylxwq0, ujxodjpv1, rgxdpiyt2, iejuejosh3);
        CrFMILEi(dmzcgqkoh0);
        joPHKnbg(baofvxl0, vkdbppxq1);
        GnYoWhsR(mygtcch0);
        skkojCMB(zznrwowz0, zgzvkssb1, wpbogxmssg2, auhikjpnlf3);
        skkojCMB(zznrwowz0, zgzvkssb1, wpbogxmssg2, auhikjpnlf3);
        if (TidyManager.isDebug) {
            GnYoWhsR(mygtcch0);
            wKBbZiga(ppwldwidxj0, sbwiisrtow1, jscuzlsdnz2);
            ZhcnCUNQ(ghulkkoln0, jacsssdeqp1, fdlrrboumo2);
            GnYoWhsR(mygtcch0);
            sCtTwmSc(inrqbgj0, hofjfveeom1, dqiqzugh2, qchcnuzwm3);
            sCtTwmSc(inrqbgj0, hofjfveeom1, dqiqzugh2, qchcnuzwm3);
            GnYoWhsR(mygtcch0);
            VlBiUmQC(mptzlmaie0, ocnlgfeq1, yppzamqpas2, eewuneljd3);
            skkojCMB(zznrwowz0, zgzvkssb1, wpbogxmssg2, auhikjpnlf3);
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        CGMeKMRG(zbmhgasf0, bbwgglz1);
        jFcIBQFa(lvwsjkz0, jlmqkblnwi1, yumjneqfv2, thcuxuehqb3);
        GnYoWhsR(mygtcch0);
        sCtTwmSc(inrqbgj0, hofjfveeom1, dqiqzugh2, qchcnuzwm3);
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            if (TidyManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }
            isShowing = true;
            if (!com.tidy.file.old.opdj.nt.TidyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var83) {
            Exception e = var83;
            isShowing = false;
            if (TidyManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground error,e=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void GMlTjamL(long oopijkl0) {
        long oopijkl0a = oopijkl0;
        Log.e("GMlTjamL", "GMlTjamL" + oopijkl0a + "GMlTjamL" + XlzHheA + CZBywWv + bUflrTe + RsRPiuv + FYtVhlo + nDuvFRn + JQBHDzd + BEGaqch + "");
    }

    //垃圾方法
    private void neYFJuYY(char cenhjntcmf0, long kanzunt1, long mslzfampw2) {
        long mslzfampw2a = mslzfampw2;
        long kanzunt1a = kanzunt1;
        char cenhjntcmf0a = cenhjntcmf0;
        new Intent("neYFJuYY" + kanzunt1a + mslzfampw2a + cenhjntcmf0a + "neYFJuYY" + CZBywWv + XlzHheA + bUflrTe + nDuvFRn + JQBHDzd + RsRPiuv + FYtVhlo + BEGaqch + "");
    }

    //垃圾方法
    private void nxpBgHzb(char zfbmymu0) {
        char zfbmymu0a = zfbmymu0;
        new Thread("nxpBgHzb" + zfbmymu0a + "nxpBgHzb" + nDuvFRn + BEGaqch + CZBywWv + bUflrTe + RsRPiuv + XlzHheA + FYtVhlo + JQBHDzd + "");
    }

    //垃圾方法
    private void FNqYUSyr(char qwrygaw0, boolean cekaletc1, byte ziheucabl2, byte tojeayin3) {
        byte tojeayin3a = tojeayin3;
        byte ziheucabl2a = ziheucabl2;
        boolean cekaletc1a = cekaletc1;
        char qwrygaw0a = qwrygaw0;
        TextUtils.isEmpty("FNqYUSyr" + tojeayin3a + ziheucabl2a + cekaletc1a + qwrygaw0a + "FNqYUSyr" + RsRPiuv + XlzHheA + bUflrTe + JQBHDzd + BEGaqch + CZBywWv + FYtVhlo + nDuvFRn + "");
    }

    //垃圾方法
    private void OPYSVhUm(long rijabxeqhz0, short huhdvvjhkq1, byte bprejdk2, char rkyqyyr3, long kvskofxwz4) {
        long kvskofxwz4a = kvskofxwz4;
        char rkyqyyr3a = rkyqyyr3;
        byte bprejdk2a = bprejdk2;
        short huhdvvjhkq1a = huhdvvjhkq1;
        long rijabxeqhz0a = rijabxeqhz0;
        new WeakReference("OPYSVhUm" + bprejdk2a + rijabxeqhz0a + rkyqyyr3a + kvskofxwz4a + huhdvvjhkq1a + "OPYSVhUm" + bUflrTe + FYtVhlo + nDuvFRn + RsRPiuv + JQBHDzd + BEGaqch + XlzHheA + CZBywWv + "");
    }

    //垃圾方法
    private void TtkNrnuo(char vlgcxishkw0) {
        char vlgcxishkw0a = vlgcxishkw0;
        new AttributedString("TtkNrnuo" + vlgcxishkw0a + "TtkNrnuo" + JQBHDzd + nDuvFRn + XlzHheA + CZBywWv + BEGaqch + bUflrTe + FYtVhlo + RsRPiuv + "");
    }

    //垃圾方法
    private void KsmCdPsi(byte jvyejzjwwx0) {
        byte jvyejzjwwx0a = jvyejzjwwx0;
        System.out.println("KsmCdPsi" + jvyejzjwwx0a + "KsmCdPsi" + JQBHDzd + FYtVhlo + RsRPiuv + CZBywWv + nDuvFRn + XlzHheA + bUflrTe + BEGaqch + "");
    }

    //垃圾方法
    private void BIiljVxB(byte jrxavtnpgc0, float nblhakoho1, char kjxckwkcp2, double meowzrvvn3) {
        double meowzrvvn3a = meowzrvvn3;
        char kjxckwkcp2a = kjxckwkcp2;
        float nblhakoho1a = nblhakoho1;
        byte jrxavtnpgc0a = jrxavtnpgc0;
        Log.e("BIiljVxB", "BIiljVxB" + meowzrvvn3a + kjxckwkcp2a + jrxavtnpgc0a + nblhakoho1a + "BIiljVxB" + bUflrTe + BEGaqch + FYtVhlo + RsRPiuv + XlzHheA + JQBHDzd + nDuvFRn + CZBywWv + "");
    }

    //垃圾方法
    private void IzjrpuQP(int zzghfivx0) {
        int zzghfivx0a = zzghfivx0;
        new AttributedString("IzjrpuQP" + zzghfivx0a + "IzjrpuQP" + BEGaqch + CZBywWv + nDuvFRn + FYtVhlo + RsRPiuv + JQBHDzd + bUflrTe + XlzHheA + "");
    }

    //垃圾方法
    private void GDBWmbAH(short ovkxaade0, boolean rtomnyxgu1, char bktnohz2, char avhyrccab3) {
        char avhyrccab3a = avhyrccab3;
        char bktnohz2a = bktnohz2;
        boolean rtomnyxgu1a = rtomnyxgu1;
        short ovkxaade0a = ovkxaade0;
        Log.e("GDBWmbAH", "GDBWmbAH" + bktnohz2a + avhyrccab3a + ovkxaade0a + rtomnyxgu1a + "GDBWmbAH" + RsRPiuv + JQBHDzd + XlzHheA + nDuvFRn + bUflrTe + CZBywWv + FYtVhlo + BEGaqch + "");
    }

    //垃圾方法
    private void BnawUxKo(float hiwntydvl0, boolean ryqeowv1, long tyzgaovjx2, short wpmgjsa3, int xjzmdgfwwb4) {
        int xjzmdgfwwb4a = xjzmdgfwwb4;
        short wpmgjsa3a = wpmgjsa3;
        long tyzgaovjx2a = tyzgaovjx2;
        boolean ryqeowv1a = ryqeowv1;
        float hiwntydvl0a = hiwntydvl0;
        Log.i("BnawUxKo", "BnawUxKo" + tyzgaovjx2a + xjzmdgfwwb4a + hiwntydvl0a + wpmgjsa3a + ryqeowv1a + "BnawUxKo" + JQBHDzd + RsRPiuv + XlzHheA + bUflrTe + CZBywWv + FYtVhlo + BEGaqch + nDuvFRn + "");
    }

    //垃圾方法
    private void QCEzLyQj(char ycsvzhnk0, char pnttvdxlcu1, boolean ysbgezws2) {
        boolean ysbgezws2a = ysbgezws2;
        char pnttvdxlcu1a = pnttvdxlcu1;
        char ycsvzhnk0a = ycsvzhnk0;
        new StringBuffer("QCEzLyQj" + pnttvdxlcu1a + ysbgezws2a + ycsvzhnk0a + "QCEzLyQj" + FYtVhlo + RsRPiuv + bUflrTe + JQBHDzd + CZBywWv + BEGaqch + nDuvFRn + XlzHheA + "");
    }

    //垃圾方法
    private void OoKRgxjm(char jltwezilx0) {
        char jltwezilx0a = jltwezilx0;
        TextUtils.isDigitsOnly("OoKRgxjm" + jltwezilx0a + "OoKRgxjm" + BEGaqch + RsRPiuv + bUflrTe + CZBywWv + JQBHDzd + nDuvFRn + XlzHheA + FYtVhlo + "");
    }

    //垃圾方法
    private void kFaWVSQZ(short xvlhxip0) {
        short xvlhxip0a = xvlhxip0;
        new StringBuffer("kFaWVSQZ" + xvlhxip0a + "kFaWVSQZ" + JQBHDzd + FYtVhlo + nDuvFRn + bUflrTe + RsRPiuv + BEGaqch + XlzHheA + CZBywWv + "");
    }

    //垃圾方法
    private void fngyIsAQ(double zhxaqdl0, float fesgizk1) {
        float fesgizk1a = fesgizk1;
        double zhxaqdl0a = zhxaqdl0;
        new StringBuilder("fngyIsAQ" + zhxaqdl0a + fesgizk1a + "fngyIsAQ" + CZBywWv + RsRPiuv + FYtVhlo + bUflrTe + nDuvFRn + JQBHDzd + BEGaqch + XlzHheA + "");
    }

    //垃圾方法
    private void ZnEOSTCK(int alhkcexja0) {
        int alhkcexja0a = alhkcexja0;
        Log.w("ZnEOSTCK", "ZnEOSTCK" + alhkcexja0a + "ZnEOSTCK" + bUflrTe + XlzHheA + FYtVhlo + nDuvFRn + RsRPiuv + JQBHDzd + CZBywWv + BEGaqch + "");
    }

    //垃圾方法
    private void jrTCXRML(byte jpzfolv0, int cgviisyxt1, float xgrxdtxqy2, long jrmplzj3, int fuoaypqv4) {
        int fuoaypqv4a = fuoaypqv4;
        long jrmplzj3a = jrmplzj3;
        float xgrxdtxqy2a = xgrxdtxqy2;
        int cgviisyxt1a = cgviisyxt1;
        byte jpzfolv0a = jpzfolv0;
        new StringReader("jrTCXRML" + cgviisyxt1a + fuoaypqv4a + jrmplzj3a + xgrxdtxqy2a + jpzfolv0a + "jrTCXRML" + RsRPiuv + nDuvFRn + JQBHDzd + FYtVhlo + bUflrTe + CZBywWv + BEGaqch + XlzHheA + "");
    }

    //垃圾方法
    private void TaqHQLWy(int nvsuugnbm0, byte urlaxyv1, float hlnjyui2, short kmzdxvtxw3) {
        short kmzdxvtxw3a = kmzdxvtxw3;
        float hlnjyui2a = hlnjyui2;
        byte urlaxyv1a = urlaxyv1;
        int nvsuugnbm0a = nvsuugnbm0;
        new StringBuffer("TaqHQLWy" + urlaxyv1a + nvsuugnbm0a + kmzdxvtxw3a + hlnjyui2a + "TaqHQLWy" + JQBHDzd + XlzHheA + FYtVhlo + nDuvFRn + bUflrTe + RsRPiuv + BEGaqch + CZBywWv + "");
    }

    //垃圾方法
    private void jaUhgicD(char biscmbw0) {
        char biscmbw0a = biscmbw0;
        new StringBuilder("jaUhgicD" + biscmbw0a + "jaUhgicD" + CZBywWv + JQBHDzd + XlzHheA + nDuvFRn + bUflrTe + RsRPiuv + BEGaqch + FYtVhlo + "");
    }

    //垃圾方法
    private void LakHIQkO(short luyxyeb0, int gfqxvbotth1) {
        int gfqxvbotth1a = gfqxvbotth1;
        short luyxyeb0a = luyxyeb0;
        TextUtils.isDigitsOnly("LakHIQkO" + gfqxvbotth1a + luyxyeb0a + "LakHIQkO" + BEGaqch + JQBHDzd + CZBywWv + bUflrTe + nDuvFRn + RsRPiuv + FYtVhlo + XlzHheA + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        isLiving = true;
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
//                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }

            isShowing = true;
            if (!com.tidy.file.old.opdj.nt.TidyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var71) {
            isShowing = false;
        }
        if(intent != null){
            String from_action = intent.getStringExtra(from);
            if(Objects.equals(from_action, "clock")){
                TidyNtTransfer.onTimeTickUpEvent(TidyNotiTimesHelper.Event.ALARM);
            }else if(Objects.equals(from_action, "job")){
                TidyNtTransfer.onTimeTickUpEvent(TidyNotiTimesHelper.Event.JOB_POLLING );
            }else if(Objects.equals(from_action, "everytime_show_notify")){
                TidyNtTransfer.onTimeTickUpEvent(TidyNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY );

            }else if(Objects.equals(from_action, "launchapp")){
                TidyNtTransfer.onTimeTickUpEvent(TidyNotiTimesHelper.Event.LAUNCH_APP );

            }
        }

        return Service.START_STICKY;
    }

    //垃圾方法
    private void zLsdgjQJ(boolean fghrbney0, char vtpaexx1, short wiytfwdr2) {
        short wiytfwdr2a = wiytfwdr2;
        char vtpaexx1a = vtpaexx1;
        boolean fghrbney0a = fghrbney0;
        new WeakReference("zLsdgjQJ" + vtpaexx1a + fghrbney0a + wiytfwdr2a + "zLsdgjQJ" + CZBywWv + RsRPiuv + XlzHheA + FYtVhlo + BEGaqch + nDuvFRn + JQBHDzd + bUflrTe + "");
    }

    //垃圾方法
    private void XHeyxhRr(float ovjdomz0) {
        float ovjdomz0a = ovjdomz0;
        new StringReader("XHeyxhRr" + ovjdomz0a + "XHeyxhRr" + JQBHDzd + RsRPiuv + FYtVhlo + bUflrTe + nDuvFRn + BEGaqch + CZBywWv + XlzHheA + "");
    }

    //垃圾方法
    private void cXYyhHRu(int gomtqaguzl0, double mccyfpm1) {
        double mccyfpm1a = mccyfpm1;
        int gomtqaguzl0a = gomtqaguzl0;
        new Intent("cXYyhHRu" + mccyfpm1a + gomtqaguzl0a + "cXYyhHRu" + bUflrTe + nDuvFRn + CZBywWv + JQBHDzd + RsRPiuv + FYtVhlo + XlzHheA + BEGaqch + "");
    }

    //垃圾方法
    private void OGYtqGHR(long jumooaer0, long igdcmgi1, short lluibzubs2) {
        short lluibzubs2a = lluibzubs2;
        long igdcmgi1a = igdcmgi1;
        long jumooaer0a = jumooaer0;
        new Intent("OGYtqGHR" + igdcmgi1a + jumooaer0a + lluibzubs2a + "OGYtqGHR" + JQBHDzd + bUflrTe + RsRPiuv + BEGaqch + CZBywWv + nDuvFRn + FYtVhlo + XlzHheA + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        short lluibzubs2 = 1;
        long igdcmgi1 = 30L;
        long jumooaer0 = 82L;
        double mccyfpm1 = 5.5;
        int gomtqaguzl0 = 20;
        float ovjdomz0 = 37.37f;
        short wiytfwdr2 = 90;
        char vtpaexx1 = 52;
        boolean fghrbney0 = true;
        return null;
    }

    //垃圾方法
    private void xuvOqpNw(long yafvldu0, double nmouyhi1) {
        double nmouyhi1a = nmouyhi1;
        long yafvldu0a = yafvldu0;
        new StringBuffer("xuvOqpNw" + nmouyhi1a + yafvldu0a + "xuvOqpNw" + FYtVhlo + bUflrTe + RsRPiuv + nDuvFRn + CZBywWv + XlzHheA + JQBHDzd + BEGaqch + "");
    }

    //垃圾方法
    private void bMQKgxUo(long mfduyin0, long hwaxmny1, byte zzxnyjyyu2, short zylmhbaol3, boolean jvpfizhe4) {
        boolean jvpfizhe4a = jvpfizhe4;
        short zylmhbaol3a = zylmhbaol3;
        byte zzxnyjyyu2a = zzxnyjyyu2;
        long hwaxmny1a = hwaxmny1;
        long mfduyin0a = mfduyin0;
        new StringBuilder("bMQKgxUo" + mfduyin0a + jvpfizhe4a + zylmhbaol3a + hwaxmny1a + zzxnyjyyu2a + "bMQKgxUo" + bUflrTe + BEGaqch + nDuvFRn + XlzHheA + FYtVhlo + JQBHDzd + RsRPiuv + CZBywWv + "");
    }

    //垃圾方法
    private void JiBbzJxV(long fkaqgqdnbl0, byte sckkyqvxs1) {
        byte sckkyqvxs1a = sckkyqvxs1;
        long fkaqgqdnbl0a = fkaqgqdnbl0;
        new String("JiBbzJxV" + sckkyqvxs1a + fkaqgqdnbl0a + "JiBbzJxV" + RsRPiuv + JQBHDzd + BEGaqch + FYtVhlo + CZBywWv + bUflrTe + XlzHheA + nDuvFRn + "");
    }

    //垃圾方法
    private void cjRsxVCp(float gfwhhxfhu0, int zqdzqxcqw1, boolean futryxld2, short hhqextunn3, short rgqidnjcm4) {
        short rgqidnjcm4a = rgqidnjcm4;
        short hhqextunn3a = hhqextunn3;
        boolean futryxld2a = futryxld2;
        int zqdzqxcqw1a = zqdzqxcqw1;
        float gfwhhxfhu0a = gfwhhxfhu0;
        System.out.println("cjRsxVCp" + futryxld2a + gfwhhxfhu0a + zqdzqxcqw1a + hhqextunn3a + rgqidnjcm4a + "cjRsxVCp" + JQBHDzd + BEGaqch + FYtVhlo + bUflrTe + XlzHheA + nDuvFRn + CZBywWv + RsRPiuv + "");
    }

    //垃圾方法
    private void YdZjGMpf(float fmusabjcj0, boolean xmgxstb1, int ekuxbmuvl2) {
        int ekuxbmuvl2a = ekuxbmuvl2;
        boolean xmgxstb1a = xmgxstb1;
        float fmusabjcj0a = fmusabjcj0;
        Log.e("YdZjGMpf", "YdZjGMpf" + xmgxstb1a + fmusabjcj0a + ekuxbmuvl2a + "YdZjGMpf" + RsRPiuv + JQBHDzd + XlzHheA + CZBywWv + bUflrTe + BEGaqch + FYtVhlo + nDuvFRn + "");
    }

    //垃圾方法
    private void DHkkPqwl(double iziufae0, boolean uhsfpvtxy1, long ubdwfvex2) {
        long ubdwfvex2a = ubdwfvex2;
        boolean uhsfpvtxy1a = uhsfpvtxy1;
        double iziufae0a = iziufae0;
        new File("DHkkPqwl" + uhsfpvtxy1a + iziufae0a + ubdwfvex2a + "DHkkPqwl" + FYtVhlo + XlzHheA + bUflrTe + CZBywWv + nDuvFRn + RsRPiuv + JQBHDzd + BEGaqch + "");
    }

    //垃圾方法
    private void IUNSegBm(float pxuzlev0, float xhyasxq1, double gcdroxrt2, long ehtlnyaz3, byte xjxfgnoxz4) {
        byte xjxfgnoxz4a = xjxfgnoxz4;
        long ehtlnyaz3a = ehtlnyaz3;
        double gcdroxrt2a = gcdroxrt2;
        float xhyasxq1a = xhyasxq1;
        float pxuzlev0a = pxuzlev0;
        Log.w("IUNSegBm", "IUNSegBm" + xhyasxq1a + ehtlnyaz3a + gcdroxrt2a + xjxfgnoxz4a + pxuzlev0a + "IUNSegBm" + bUflrTe + JQBHDzd + RsRPiuv + BEGaqch + FYtVhlo + nDuvFRn + XlzHheA + CZBywWv + "");
    }

    //垃圾方法
    private void uYNQEEnB(char wssdbzveo0, float ovjahnw1, byte ckhgona2, char ebourccjhq3, byte ebwjsixh4) {
        byte ebwjsixh4a = ebwjsixh4;
        char ebourccjhq3a = ebourccjhq3;
        byte ckhgona2a = ckhgona2;
        float ovjahnw1a = ovjahnw1;
        char wssdbzveo0a = wssdbzveo0;
        Log.i("uYNQEEnB", "uYNQEEnB" + ovjahnw1a + ckhgona2a + ebourccjhq3a + wssdbzveo0a + ebwjsixh4a + "uYNQEEnB" + RsRPiuv + XlzHheA + bUflrTe + CZBywWv + nDuvFRn + JQBHDzd + BEGaqch + FYtVhlo + "");
    }

    //垃圾方法
    private void kJJjrtux(float izhluyq0, boolean aznsubjthk1, double xjmtbpbfej2) {
        double xjmtbpbfej2a = xjmtbpbfej2;
        boolean aznsubjthk1a = aznsubjthk1;
        float izhluyq0a = izhluyq0;
        TextUtils.isDigitsOnly("kJJjrtux" + aznsubjthk1a + izhluyq0a + xjmtbpbfej2a + "kJJjrtux" + XlzHheA + nDuvFRn + BEGaqch + FYtVhlo + CZBywWv + bUflrTe + RsRPiuv + JQBHDzd + "");
    }

    //垃圾方法
    private void YmgSkRwe(long xetkxgbc0, boolean xxbnhadytm1, byte pxsyuffwqp2, boolean sjgmjkwcn3, float slmpbnzwt4) {
        float slmpbnzwt4a = slmpbnzwt4;
        boolean sjgmjkwcn3a = sjgmjkwcn3;
        byte pxsyuffwqp2a = pxsyuffwqp2;
        boolean xxbnhadytm1a = xxbnhadytm1;
        long xetkxgbc0a = xetkxgbc0;
        new AttributedString("YmgSkRwe" + sjgmjkwcn3a + slmpbnzwt4a + xxbnhadytm1a + pxsyuffwqp2a + xetkxgbc0a + "YmgSkRwe" + XlzHheA + RsRPiuv + bUflrTe + CZBywWv + BEGaqch + FYtVhlo + JQBHDzd + nDuvFRn + "");
    }

    //垃圾方法
    private void rMJMcPpw(double ntfdgrt0) {
        double ntfdgrt0a = ntfdgrt0;
        TextUtils.isEmpty("rMJMcPpw" + ntfdgrt0a + "rMJMcPpw" + bUflrTe + JQBHDzd + BEGaqch + FYtVhlo + CZBywWv + XlzHheA + RsRPiuv + nDuvFRn + "");
    }

    //垃圾方法
    private void npEBvhkn(char wztlysegut0) {
        char wztlysegut0a = wztlysegut0;
        new StringReader("npEBvhkn" + wztlysegut0a + "npEBvhkn" + nDuvFRn + bUflrTe + XlzHheA + CZBywWv + BEGaqch + FYtVhlo + RsRPiuv + JQBHDzd + "");
    }

    public void onDestroy() {
        char wztlysegut0 = 71;
        double ntfdgrt0 = 60.60;
        float slmpbnzwt4 = 0.0f;
        boolean sjgmjkwcn3 = true;
        byte pxsyuffwqp2 = 85;
        boolean xxbnhadytm1 = false;
        long xetkxgbc0 = 70L;
        double xjmtbpbfej2 = 26.26;
        boolean aznsubjthk1 = false;
        float izhluyq0 = 5.5f;
        byte ebwjsixh4 = 65;
        char ebourccjhq3 = 98;
        byte ckhgona2 = 82;
        float ovjahnw1 = 89.89f;
        char wssdbzveo0 = 53;
        byte xjxfgnoxz4 = 93;
        long ehtlnyaz3 = 19L;
        double gcdroxrt2 = 66.66;
        float xhyasxq1 = 98.98f;
        float pxuzlev0 = 99.99f;
        long ubdwfvex2 = 11L;
        boolean uhsfpvtxy1 = true;
        double iziufae0 = 69.69;
        int ekuxbmuvl2 = 47;
        boolean xmgxstb1 = false;
        float fmusabjcj0 = 82.82f;
        short rgqidnjcm4 = 17;
        short hhqextunn3 = 96;
        boolean futryxld2 = false;
        int zqdzqxcqw1 = 80;
        float gfwhhxfhu0 = 50.50f;
        byte sckkyqvxs1 = 83;
        long fkaqgqdnbl0 = 97L;
        boolean jvpfizhe4 = false;
        short zylmhbaol3 = 42;
        byte zzxnyjyyu2 = 90;
        long hwaxmny1 = 68L;
        long mfduyin0 = 31L;
        double nmouyhi1 = 22.22;
        long yafvldu0 = 43L;
        YmgSkRwe(xetkxgbc0, xxbnhadytm1, pxsyuffwqp2, sjgmjkwcn3, slmpbnzwt4);
        rMJMcPpw(ntfdgrt0);
        bMQKgxUo(mfduyin0, hwaxmny1, zzxnyjyyu2, zylmhbaol3, jvpfizhe4);
        rMJMcPpw(ntfdgrt0);
        cjRsxVCp(gfwhhxfhu0, zqdzqxcqw1, futryxld2, hhqextunn3, rgqidnjcm4);
        kJJjrtux(izhluyq0, aznsubjthk1, xjmtbpbfej2);
        IUNSegBm(pxuzlev0, xhyasxq1, gcdroxrt2, ehtlnyaz3, xjxfgnoxz4);
        YdZjGMpf(fmusabjcj0, xmgxstb1, ekuxbmuvl2);
        kJJjrtux(izhluyq0, aznsubjthk1, xjmtbpbfej2);
        kJJjrtux(izhluyq0, aznsubjthk1, xjmtbpbfej2);
        isLiving = false;
        bMQKgxUo(mfduyin0, hwaxmny1, zzxnyjyyu2, zylmhbaol3, jvpfizhe4);
        uYNQEEnB(wssdbzveo0, ovjahnw1, ckhgona2, ebourccjhq3, ebwjsixh4);
        bMQKgxUo(mfduyin0, hwaxmny1, zzxnyjyyu2, zylmhbaol3, jvpfizhe4);
        rMJMcPpw(ntfdgrt0);
        kJJjrtux(izhluyq0, aznsubjthk1, xjmtbpbfej2);
        cjRsxVCp(gfwhhxfhu0, zqdzqxcqw1, futryxld2, hhqextunn3, rgqidnjcm4);
        JiBbzJxV(fkaqgqdnbl0, sckkyqvxs1);
        rMJMcPpw(ntfdgrt0);
        npEBvhkn(wztlysegut0);
        isShowing = false;
        super.onDestroy();
    }

    //垃圾方法
    private void SyxLJPUI(byte iuwbdgq0) {
        byte iuwbdgq0a = iuwbdgq0;
        Log.e("SyxLJPUI", "SyxLJPUI" + iuwbdgq0a + "SyxLJPUI" + CZBywWv + RsRPiuv + JQBHDzd + FYtVhlo + bUflrTe + XlzHheA + nDuvFRn + BEGaqch + "");
    }

    //垃圾方法
    private void ZWqPOHdm(float vpflovx0, double nqbbbsjlov1, byte lhyquxj2) {
        byte lhyquxj2a = lhyquxj2;
        double nqbbbsjlov1a = nqbbbsjlov1;
        float vpflovx0a = vpflovx0;
        new AttributedString("ZWqPOHdm" + lhyquxj2a + vpflovx0a + nqbbbsjlov1a + "ZWqPOHdm" + XlzHheA + JQBHDzd + BEGaqch + FYtVhlo + bUflrTe + nDuvFRn + RsRPiuv + CZBywWv + "");
    }

    //垃圾方法
    private void dBCqHgzr(long mzdyptcg0) {
        long mzdyptcg0a = mzdyptcg0;
        new File("dBCqHgzr" + mzdyptcg0a + "dBCqHgzr" + bUflrTe + XlzHheA + CZBywWv + RsRPiuv + JQBHDzd + nDuvFRn + FYtVhlo + BEGaqch + "");
    }

    //垃圾方法
    private void OBvNnxEq(byte qdzpldbp0, boolean svksowtj1, char frpkegdwo2, char yvvvbqjn3, float mqhmhyvgad4) {
        float mqhmhyvgad4a = mqhmhyvgad4;
        char yvvvbqjn3a = yvvvbqjn3;
        char frpkegdwo2a = frpkegdwo2;
        boolean svksowtj1a = svksowtj1;
        byte qdzpldbp0a = qdzpldbp0;
        new String("OBvNnxEq" + frpkegdwo2a + yvvvbqjn3a + svksowtj1a + qdzpldbp0a + mqhmhyvgad4a + "OBvNnxEq" + JQBHDzd + CZBywWv + nDuvFRn + FYtVhlo + bUflrTe + RsRPiuv + XlzHheA + BEGaqch + "");
    }

    //垃圾方法
    private void zWiLluoj(int awccxgd0, int akxngxbzyf1, boolean nzbtniz2, boolean vgwlezrnu3, double prqeixtdb4) {
        double prqeixtdb4a = prqeixtdb4;
        boolean vgwlezrnu3a = vgwlezrnu3;
        boolean nzbtniz2a = nzbtniz2;
        int akxngxbzyf1a = akxngxbzyf1;
        int awccxgd0a = awccxgd0;
    }

    //垃圾方法
    private void XGJswEjC(long ayztjxotbz0, double qydrvkwzzd1, short cqghydsj2, long mfiomid3, long awzwjgp4) {
        long awzwjgp4a = awzwjgp4;
        long mfiomid3a = mfiomid3;
        short cqghydsj2a = cqghydsj2;
        double qydrvkwzzd1a = qydrvkwzzd1;
        long ayztjxotbz0a = ayztjxotbz0;
        Log.w("XGJswEjC", "XGJswEjC" + ayztjxotbz0a + qydrvkwzzd1a + cqghydsj2a + awzwjgp4a + mfiomid3a + "XGJswEjC" + bUflrTe + FYtVhlo + nDuvFRn + CZBywWv + RsRPiuv + XlzHheA + JQBHDzd + BEGaqch + "");
    }

    //垃圾方法
    private void uPiJPDFu(double itnsdec0, float bxbkohndbq1, short edcwiysxq2, float bccnlgl3, char wxreqmijy4) {
        char wxreqmijy4a = wxreqmijy4;
        float bccnlgl3a = bccnlgl3;
        short edcwiysxq2a = edcwiysxq2;
        float bxbkohndbq1a = bxbkohndbq1;
        double itnsdec0a = itnsdec0;
        Log.w("uPiJPDFu", "uPiJPDFu" + edcwiysxq2a + wxreqmijy4a + bccnlgl3a + itnsdec0a + bxbkohndbq1a + "uPiJPDFu" + BEGaqch + CZBywWv + XlzHheA + FYtVhlo + RsRPiuv + nDuvFRn + JQBHDzd + bUflrTe + "");
    }

    //垃圾方法
    private void YMYtnGKq(float qfhrbyx0, float udhaafgq1, double zdnklvkarb2, double rsyvlfwkt3, float wlkcewjx4) {
        float wlkcewjx4a = wlkcewjx4;
        double rsyvlfwkt3a = rsyvlfwkt3;
        double zdnklvkarb2a = zdnklvkarb2;
        float udhaafgq1a = udhaafgq1;
        float qfhrbyx0a = qfhrbyx0;
        new Intent("YMYtnGKq" + rsyvlfwkt3a + qfhrbyx0a + wlkcewjx4a + udhaafgq1a + zdnklvkarb2a + "YMYtnGKq" + JQBHDzd + FYtVhlo + bUflrTe + CZBywWv + nDuvFRn + XlzHheA + BEGaqch + RsRPiuv + "");
    }

    //垃圾方法
    private void OwzlbtAw(int deusvardx0, char eghinvd1, boolean paqtgrcknk2) {
        boolean paqtgrcknk2a = paqtgrcknk2;
        char eghinvd1a = eghinvd1;
        int deusvardx0a = deusvardx0;
        new Thread("OwzlbtAw" + paqtgrcknk2a + deusvardx0a + eghinvd1a + "OwzlbtAw" + FYtVhlo + BEGaqch + JQBHDzd + XlzHheA + RsRPiuv + nDuvFRn + bUflrTe + CZBywWv + "");
    }

    //垃圾方法
    private void tdABOEAE(byte vkrqrvtg0, long nisnqfhjil1) {
        long nisnqfhjil1a = nisnqfhjil1;
        byte vkrqrvtg0a = vkrqrvtg0;
        new WeakReference("tdABOEAE" + vkrqrvtg0a + nisnqfhjil1a + "tdABOEAE" + JQBHDzd + XlzHheA + nDuvFRn + CZBywWv + BEGaqch + bUflrTe + RsRPiuv + FYtVhlo + "");
    }

    //垃圾方法
    private void tRnXsNjq(byte atxyimh0, double azwjbernu1, short kgmliwaae2) {
        short kgmliwaae2a = kgmliwaae2;
        double azwjbernu1a = azwjbernu1;
        byte atxyimh0a = atxyimh0;
        new WeakReference("tRnXsNjq" + azwjbernu1a + atxyimh0a + kgmliwaae2a + "tRnXsNjq" + RsRPiuv + XlzHheA + CZBywWv + nDuvFRn + FYtVhlo + bUflrTe + BEGaqch + JQBHDzd + "");
    }

    //垃圾方法
    private void xnJsvBkR(long jauvkpvm0, long omolmrlvnp1, int pnwnkuash2) {
        int pnwnkuash2a = pnwnkuash2;
        long omolmrlvnp1a = omolmrlvnp1;
        long jauvkpvm0a = jauvkpvm0;
        new StringBuilder("xnJsvBkR" + omolmrlvnp1a + pnwnkuash2a + jauvkpvm0a + "xnJsvBkR" + FYtVhlo + XlzHheA + BEGaqch + nDuvFRn + CZBywWv + RsRPiuv + JQBHDzd + bUflrTe + "");
    }

    //垃圾方法
    private void oCDAAwbU(boolean nchslxdyv0, short exqxhaaop1, boolean osycswy2, double lntezndxve3) {
        double lntezndxve3a = lntezndxve3;
        boolean osycswy2a = osycswy2;
        short exqxhaaop1a = exqxhaaop1;
        boolean nchslxdyv0a = nchslxdyv0;
    }

    //垃圾方法
    private void ijMzlioa(double vntwcclhe0, char srxquumisz1) {
        char srxquumisz1a = srxquumisz1;
        double vntwcclhe0a = vntwcclhe0;
        new File("ijMzlioa" + vntwcclhe0a + srxquumisz1a + "ijMzlioa" + JQBHDzd + CZBywWv + XlzHheA + RsRPiuv + FYtVhlo + bUflrTe + nDuvFRn + BEGaqch + "");
    }

    //垃圾方法
    private void gqGJLsoC(boolean kfljdib0, float zsalanec1) {
        float zsalanec1a = zsalanec1;
        boolean kfljdib0a = kfljdib0;
        new String("gqGJLsoC" + kfljdib0a + zsalanec1a + "gqGJLsoC" + BEGaqch + bUflrTe + nDuvFRn + RsRPiuv + FYtVhlo + CZBywWv + XlzHheA + JQBHDzd + "");
    }

    //垃圾方法
    private void biYUZMUP(double knwcana0, byte koagatmq1, long mjpheec2) {
        long mjpheec2a = mjpheec2;
        byte koagatmq1a = koagatmq1;
        double knwcana0a = knwcana0;
        TextUtils.isEmpty("biYUZMUP" + koagatmq1a + mjpheec2a + knwcana0a + "biYUZMUP" + XlzHheA + JQBHDzd + CZBywWv + bUflrTe + BEGaqch + FYtVhlo + RsRPiuv + nDuvFRn + "");
    }

    //垃圾方法
    private void HKgnZBGQ(float silvjesx0, byte xfustbah1, int amsglwggz2, float hjtcndhw3) {
        float hjtcndhw3a = hjtcndhw3;
        int amsglwggz2a = amsglwggz2;
        byte xfustbah1a = xfustbah1;
        float silvjesx0a = silvjesx0;
        new StringBuffer("HKgnZBGQ" + xfustbah1a + hjtcndhw3a + silvjesx0a + amsglwggz2a + "HKgnZBGQ" + JQBHDzd + CZBywWv + BEGaqch + RsRPiuv + bUflrTe + nDuvFRn + FYtVhlo + XlzHheA + "");
    }

    //垃圾方法
    private void gsahEgWo(int uyxnxpql0, double dmjnxkrp1) {
        double dmjnxkrp1a = dmjnxkrp1;
        int uyxnxpql0a = uyxnxpql0;
        new StringBuilder("gsahEgWo" + dmjnxkrp1a + uyxnxpql0a + "gsahEgWo" + nDuvFRn + JQBHDzd + CZBywWv + FYtVhlo + RsRPiuv + bUflrTe + BEGaqch + XlzHheA + "");
    }

    //垃圾方法
    private void WkhkuxZt(float ttjutago0, long cyzgqnmr1, long xhpwjwqkj2) {
        long xhpwjwqkj2a = xhpwjwqkj2;
        long cyzgqnmr1a = cyzgqnmr1;
        float ttjutago0a = ttjutago0;
        new StringReader("WkhkuxZt" + cyzgqnmr1a + ttjutago0a + xhpwjwqkj2a + "WkhkuxZt" + RsRPiuv + bUflrTe + FYtVhlo + BEGaqch + JQBHDzd + CZBywWv + XlzHheA + nDuvFRn + "");
    }

    //垃圾方法
    private void tPdezlXH(float evqfftnw0, long nfoihowo1, char jwfzcsms2, short awgicjevu3, float plpvtagz4) {
        float plpvtagz4a = plpvtagz4;
        short awgicjevu3a = awgicjevu3;
        char jwfzcsms2a = jwfzcsms2;
        long nfoihowo1a = nfoihowo1;
        float evqfftnw0a = evqfftnw0;
        new StringReader("tPdezlXH" + awgicjevu3a + plpvtagz4a + evqfftnw0a + nfoihowo1a + jwfzcsms2a + "tPdezlXH" + BEGaqch + CZBywWv + XlzHheA + FYtVhlo + bUflrTe + JQBHDzd + nDuvFRn + RsRPiuv + "");
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        float plpvtagz4 = 64.64f;
        short awgicjevu3 = 0;
        char jwfzcsms2 = 83;
        long nfoihowo1 = 66L;
        float evqfftnw0 = 19.19f;
        long xhpwjwqkj2 = 40L;
        long cyzgqnmr1 = 52L;
        float ttjutago0 = 38.38f;
        double dmjnxkrp1 = 60.60;
        int uyxnxpql0 = 5;
        float hjtcndhw3 = 34.34f;
        int amsglwggz2 = 39;
        byte xfustbah1 = 48;
        float silvjesx0 = 49.49f;
        long mjpheec2 = 87L;
        byte koagatmq1 = 57;
        double knwcana0 = 86.86;
        float zsalanec1 = 36.36f;
        boolean kfljdib0 = false;
        char srxquumisz1 = 99;
        double vntwcclhe0 = 25.25;
        double lntezndxve3 = 22.22;
        boolean osycswy2 = true;
        short exqxhaaop1 = 83;
        boolean nchslxdyv0 = false;
        int pnwnkuash2 = 10;
        long omolmrlvnp1 = 1L;
        long jauvkpvm0 = 31L;
        short kgmliwaae2 = 18;
        double azwjbernu1 = 10.10;
        byte atxyimh0 = 80;
        long nisnqfhjil1 = 100L;
        byte vkrqrvtg0 = 69;
        boolean paqtgrcknk2 = true;
        char eghinvd1 = 52;
        int deusvardx0 = 3;
        float wlkcewjx4 = 58.58f;
        double rsyvlfwkt3 = 69.69;
        double zdnklvkarb2 = 29.29;
        float udhaafgq1 = 70.70f;
        float qfhrbyx0 = 66.66f;
        char wxreqmijy4 = 38;
        float bccnlgl3 = 18.18f;
        short edcwiysxq2 = 1;
        float bxbkohndbq1 = 29.29f;
        double itnsdec0 = 18.18;
        long awzwjgp4 = 20L;
        long mfiomid3 = 82L;
        short cqghydsj2 = 2;
        double qydrvkwzzd1 = 37.37;
        long ayztjxotbz0 = 66L;
        double prqeixtdb4 = 41.41;
        boolean vgwlezrnu3 = false;
        boolean nzbtniz2 = false;
        int akxngxbzyf1 = 88;
        int awccxgd0 = 85;
        float mqhmhyvgad4 = 16.16f;
        char yvvvbqjn3 = 70;
        char frpkegdwo2 = 75;
        boolean svksowtj1 = true;
        byte qdzpldbp0 = 87;
        long mzdyptcg0 = 82L;
        byte lhyquxj2 = 45;
        double nqbbbsjlov1 = 25.25;
        float vpflovx0 = 18.18f;
        byte iuwbdgq0 = 45;
        dBCqHgzr(mzdyptcg0);
        xnJsvBkR(jauvkpvm0, omolmrlvnp1, pnwnkuash2);
        HKgnZBGQ(silvjesx0, xfustbah1, amsglwggz2, hjtcndhw3);
        WkhkuxZt(ttjutago0, cyzgqnmr1, xhpwjwqkj2);
        gqGJLsoC(kfljdib0, zsalanec1);
        tdABOEAE(vkrqrvtg0, nisnqfhjil1);
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        tRnXsNjq(atxyimh0, azwjbernu1, kgmliwaae2);
        HKgnZBGQ(silvjesx0, xfustbah1, amsglwggz2, hjtcndhw3);
        oCDAAwbU(nchslxdyv0, exqxhaaop1, osycswy2, lntezndxve3);
        YMYtnGKq(qfhrbyx0, udhaafgq1, zdnklvkarb2, rsyvlfwkt3, wlkcewjx4);
        Iterator var55 = manager.getRunningServices(Integer.MAX_VALUE).iterator();
        WkhkuxZt(ttjutago0, cyzgqnmr1, xhpwjwqkj2);
        tPdezlXH(evqfftnw0, nfoihowo1, jwfzcsms2, awgicjevu3, plpvtagz4);
        dBCqHgzr(mzdyptcg0);
        uPiJPDFu(itnsdec0, bxbkohndbq1, edcwiysxq2, bccnlgl3, wxreqmijy4);
        WkhkuxZt(ttjutago0, cyzgqnmr1, xhpwjwqkj2);
        SyxLJPUI(iuwbdgq0);
        tRnXsNjq(atxyimh0, azwjbernu1, kgmliwaae2);
        SyxLJPUI(iuwbdgq0);
        YMYtnGKq(qfhrbyx0, udhaafgq1, zdnklvkarb2, rsyvlfwkt3, wlkcewjx4);
        ActivityManager.RunningServiceInfo runningService;
        do {
            if (!var55.hasNext()) {
                return false;
            }
            runningService = (ActivityManager.RunningServiceInfo) var55.next();
        } while (!serviceClass.getName().equals(runningService.service.getClassName()) || !runningService.foreground);
        xnJsvBkR(jauvkpvm0, omolmrlvnp1, pnwnkuash2);
        OwzlbtAw(deusvardx0, eghinvd1, paqtgrcknk2);
        biYUZMUP(knwcana0, koagatmq1, mjpheec2);
        gqGJLsoC(kfljdib0, zsalanec1);
        return true;
    }

    //垃圾方法
    static private void kahwVexS(int qlktraqpq0, int fimemos1, int pukhusz2) {
        int pukhusz2a = pukhusz2;
        int fimemos1a = fimemos1;
        int qlktraqpq0a = qlktraqpq0;
    }

    //垃圾方法
    static private void IcehptSv(double dwpfinx0, long orikiedopi1, byte fnhxdazpps2) {
        byte fnhxdazpps2a = fnhxdazpps2;
        long orikiedopi1a = orikiedopi1;
        double dwpfinx0a = dwpfinx0;
        TextUtils.isEmpty("IcehptSv" + dwpfinx0a + fnhxdazpps2a + orikiedopi1a + "IcehptSv" + "");
    }

    //垃圾方法
    static private void MpZliYHV(char xrglchte0, double uqjzbutk1, byte mdqznnzw2, int gurgoblkdx3, byte ibqaerhk4) {
        byte ibqaerhk4a = ibqaerhk4;
        int gurgoblkdx3a = gurgoblkdx3;
        byte mdqznnzw2a = mdqznnzw2;
        double uqjzbutk1a = uqjzbutk1;
        char xrglchte0a = xrglchte0;
        Log.i("MpZliYHV", "MpZliYHV" + xrglchte0a + uqjzbutk1a + gurgoblkdx3a + mdqznnzw2a + ibqaerhk4a + "MpZliYHV" + "");
    }

    //垃圾方法
    static private void nMadEkjc(short rwbcgff0, double nrxynpjy1, boolean lqjnupu2, long ruehsnwwsw3, int raqokuuybr4) {
        int raqokuuybr4a = raqokuuybr4;
        long ruehsnwwsw3a = ruehsnwwsw3;
        boolean lqjnupu2a = lqjnupu2;
        double nrxynpjy1a = nrxynpjy1;
        short rwbcgff0a = rwbcgff0;
        Log.e("nMadEkjc", "nMadEkjc" + ruehsnwwsw3a + lqjnupu2a + nrxynpjy1a + rwbcgff0a + raqokuuybr4a + "nMadEkjc" + "");
    }

    //垃圾方法
    static private void SkOFlgyg(byte gexgkpehyz0, boolean ofbsicovyr1, int vjvaqgxc2) {
        int vjvaqgxc2a = vjvaqgxc2;
        boolean ofbsicovyr1a = ofbsicovyr1;
        byte gexgkpehyz0a = gexgkpehyz0;
        new Intent("SkOFlgyg" + gexgkpehyz0a + vjvaqgxc2a + ofbsicovyr1a + "SkOFlgyg" + "");
    }

    //垃圾方法
    static private void kNFAVtEE(char voppduviky0, float joucrnrnhv1, int dgllnnbihm2) {
        int dgllnnbihm2a = dgllnnbihm2;
        float joucrnrnhv1a = joucrnrnhv1;
        char voppduviky0a = voppduviky0;
        new String("kNFAVtEE" + joucrnrnhv1a + dgllnnbihm2a + voppduviky0a + "kNFAVtEE" + "");
    }

    //垃圾方法
    static private void GIoNEBeg(float jtodmja0, byte ymuhkukuv1, boolean lnkhney2, short vicyowm3, float xvknqlhzly4) {
        float xvknqlhzly4a = xvknqlhzly4;
        short vicyowm3a = vicyowm3;
        boolean lnkhney2a = lnkhney2;
        byte ymuhkukuv1a = ymuhkukuv1;
        float jtodmja0a = jtodmja0;
        System.out.println("GIoNEBeg" + jtodmja0a + lnkhney2a + vicyowm3a + xvknqlhzly4a + ymuhkukuv1a + "GIoNEBeg" + "");
    }

    //垃圾方法
    static private void TMAsMquN(float cvqhlhvw0, double hnwhykdrf1, short wpfvidd2, byte nuzbtnppw3, int tufweoie4) {
        int tufweoie4a = tufweoie4;
        byte nuzbtnppw3a = nuzbtnppw3;
        short wpfvidd2a = wpfvidd2;
        double hnwhykdrf1a = hnwhykdrf1;
        float cvqhlhvw0a = cvqhlhvw0;
        System.out.println("TMAsMquN" + wpfvidd2a + tufweoie4a + hnwhykdrf1a + nuzbtnppw3a + cvqhlhvw0a + "TMAsMquN" + "");
    }

    //垃圾方法
    static private void ZmclGDwS(char bbdemkef0, byte jzkllpfo1) {
        byte jzkllpfo1a = jzkllpfo1;
        char bbdemkef0a = bbdemkef0;
        new AttributedString("ZmclGDwS" + bbdemkef0a + jzkllpfo1a + "ZmclGDwS" + "");
    }

    //垃圾方法
    static private void AmKjzYis(double mlvtjwwic0, short wjprjczm1) {
        short wjprjczm1a = wjprjczm1;
        double mlvtjwwic0a = mlvtjwwic0;
        new AttributedString("AmKjzYis" + mlvtjwwic0a + wjprjczm1a + "AmKjzYis" + "");
    }

    //垃圾方法
    static private void tPrCeWxl(short hjslibkwij0, float lpjhpsw1, int fuzmokalk2, double ltpvmtx3) {
        double ltpvmtx3a = ltpvmtx3;
        int fuzmokalk2a = fuzmokalk2;
        float lpjhpsw1a = lpjhpsw1;
        short hjslibkwij0a = hjslibkwij0;
        Log.e("tPrCeWxl", "tPrCeWxl" + ltpvmtx3a + hjslibkwij0a + lpjhpsw1a + fuzmokalk2a + "tPrCeWxl" + "");
    }

    //垃圾方法
    static private void jdoXskbe(boolean apolworwt0, byte ahznuhj1) {
        byte ahznuhj1a = ahznuhj1;
        boolean apolworwt0a = apolworwt0;
        new String("jdoXskbe" + apolworwt0a + ahznuhj1a + "jdoXskbe" + "");
    }

    //垃圾方法
    static private void YADscNbE(long fuzuayozz0, boolean dnlukiixb1, int ffvksbuwk2, int arbkpzur3) {
        int arbkpzur3a = arbkpzur3;
        int ffvksbuwk2a = ffvksbuwk2;
        boolean dnlukiixb1a = dnlukiixb1;
        long fuzuayozz0a = fuzuayozz0;
        TextUtils.isEmpty("YADscNbE" + arbkpzur3a + dnlukiixb1a + ffvksbuwk2a + fuzuayozz0a + "YADscNbE" + "");
    }

    //垃圾方法
    static private void pxAehxQK(long uzsapqagpw0) {
        long uzsapqagpw0a = uzsapqagpw0;
        new Intent("pxAehxQK" + uzsapqagpw0a + "pxAehxQK" + "");
    }

    //垃圾方法
    static private void nxpOwGth(short abhwnaaj0) {
        short abhwnaaj0a = abhwnaaj0;
        new StringBuffer("nxpOwGth" + abhwnaaj0a + "nxpOwGth" + "");
    }

    //垃圾方法
    static private void mRSPuMFu(short ktpszrlx0, float faqhwmndo1) {
        float faqhwmndo1a = faqhwmndo1;
        short ktpszrlx0a = ktpszrlx0;
        new StringReader("mRSPuMFu" + ktpszrlx0a + faqhwmndo1a + "mRSPuMFu" + "");
    }

    //垃圾方法
    static private void PqXDeAwS(int khsxcbnxv0, boolean gojxuey1, char ijulyabd2, int ckyepnwckq3) {
        int ckyepnwckq3a = ckyepnwckq3;
        char ijulyabd2a = ijulyabd2;
        boolean gojxuey1a = gojxuey1;
        int khsxcbnxv0a = khsxcbnxv0;
        Log.w("PqXDeAwS", "PqXDeAwS" + gojxuey1a + khsxcbnxv0a + ckyepnwckq3a + ijulyabd2a + "PqXDeAwS" + "");
    }

    //垃圾方法
    static private void ikAOhUGX(boolean cyciuhv0, float kcmmrdqwb1) {
        float kcmmrdqwb1a = kcmmrdqwb1;
        boolean cyciuhv0a = cyciuhv0;
        new String("ikAOhUGX" + cyciuhv0a + kcmmrdqwb1a + "ikAOhUGX" + "");
    }

    //垃圾方法
    static private void esPiTERq(long imgsxrde0, long hkbykpwmhm1, short jhqqbtqnlu2) {
        short jhqqbtqnlu2a = jhqqbtqnlu2;
        long hkbykpwmhm1a = hkbykpwmhm1;
        long imgsxrde0a = imgsxrde0;
        new StringReader("esPiTERq" + imgsxrde0a + jhqqbtqnlu2a + hkbykpwmhm1a + "esPiTERq" + "");
    }

    //垃圾方法
    static private void KWfWvMJK(double jkqurkrdu0, char zvnbcnsy1, float rvruajkxk2, double ochgbsev3) {
        double ochgbsev3a = ochgbsev3;
        float rvruajkxk2a = rvruajkxk2;
        char zvnbcnsy1a = zvnbcnsy1;
        double jkqurkrdu0a = jkqurkrdu0;
        new AttributedString("KWfWvMJK" + ochgbsev3a + jkqurkrdu0a + zvnbcnsy1a + rvruajkxk2a + "KWfWvMJK" + "");
    }

    //垃圾方法
    static private void VyxMaWCg(double ejsbltny0, short zsthxidok1, boolean vgnifovswy2, char vsduyvdbq3, long gsilkihgcy4) {
        long gsilkihgcy4a = gsilkihgcy4;
        char vsduyvdbq3a = vsduyvdbq3;
        boolean vgnifovswy2a = vgnifovswy2;
        short zsthxidok1a = zsthxidok1;
        double ejsbltny0a = ejsbltny0;
        new WeakReference("VyxMaWCg" + ejsbltny0a + vgnifovswy2a + gsilkihgcy4a + vsduyvdbq3a + zsthxidok1a + "VyxMaWCg" + "");
    }

    //垃圾方法
    static private void xpzOxFMU(long pqkziktq0, double bgbptuu1, double ofjihapuk2, char mxlfaouth3, int wcdwkch4) {
        int wcdwkch4a = wcdwkch4;
        char mxlfaouth3a = mxlfaouth3;
        double ofjihapuk2a = ofjihapuk2;
        double bgbptuu1a = bgbptuu1;
        long pqkziktq0a = pqkziktq0;
        Log.w("xpzOxFMU", "xpzOxFMU" + bgbptuu1a + ofjihapuk2a + wcdwkch4a + mxlfaouth3a + pqkziktq0a + "xpzOxFMU" + "");
    }

    //垃圾方法
    static private void gmcmxeje(long orvdezyqj0, short alklcdw1, int cerkdxmqc2, boolean xwdkdrwx3, double vvafqfcfv4) {
        double vvafqfcfv4a = vvafqfcfv4;
        boolean xwdkdrwx3a = xwdkdrwx3;
        int cerkdxmqc2a = cerkdxmqc2;
        short alklcdw1a = alklcdw1;
        long orvdezyqj0a = orvdezyqj0;
        new StringReader("gmcmxeje" + orvdezyqj0a + cerkdxmqc2a + vvafqfcfv4a + xwdkdrwx3a + alklcdw1a + "gmcmxeje" + "");
    }

    //垃圾方法
    static private void DXFITfDb(long ymuycixgb0, int eyenflqt1) {
        int eyenflqt1a = eyenflqt1;
        long ymuycixgb0a = ymuycixgb0;
        Log.w("DXFITfDb", "DXFITfDb" + ymuycixgb0a + eyenflqt1a + "DXFITfDb" + "");
    }

    //垃圾方法
    static private void nWiulNGd(boolean lbgddsfhwr0, char fbfmnmpk1, long arobileoaa2, char gaqtojr3, long lrvwfhpzpt4) {
        long lrvwfhpzpt4a = lrvwfhpzpt4;
        char gaqtojr3a = gaqtojr3;
        long arobileoaa2a = arobileoaa2;
        char fbfmnmpk1a = fbfmnmpk1;
        boolean lbgddsfhwr0a = lbgddsfhwr0;
        TextUtils.isEmpty("nWiulNGd" + lrvwfhpzpt4a + arobileoaa2a + gaqtojr3a + fbfmnmpk1a + lbgddsfhwr0a + "nWiulNGd" + "");
    }

    //垃圾方法
    static private void frmTMomt(boolean engehlqf0, boolean wjzsvzq1, int afusumr2, char dqgrgvi3) {
        char dqgrgvi3a = dqgrgvi3;
        int afusumr2a = afusumr2;
        boolean wjzsvzq1a = wjzsvzq1;
        boolean engehlqf0a = engehlqf0;
        System.out.println("frmTMomt" + dqgrgvi3a + wjzsvzq1a + engehlqf0a + afusumr2a + "frmTMomt" + "");
    }

    //垃圾方法
    static private void sxdUXBXt(float eyubvbgb0, char fpmljeue1, float gplnieh2) {
        float gplnieh2a = gplnieh2;
        char fpmljeue1a = fpmljeue1;
        float eyubvbgb0a = eyubvbgb0;
        Log.e("sxdUXBXt", "sxdUXBXt" + fpmljeue1a + eyubvbgb0a + gplnieh2a + "sxdUXBXt" + "");
    }

    //垃圾方法
    static private void ZbmjwMfh(double mxbcezi0, float zwryvsyyzn1, int jhskxwuty2) {
        int jhskxwuty2a = jhskxwuty2;
        float zwryvsyyzn1a = zwryvsyyzn1;
        double mxbcezi0a = mxbcezi0;
        new StringBuilder("ZbmjwMfh" + jhskxwuty2a + zwryvsyyzn1a + mxbcezi0a + "ZbmjwMfh" + "");
    }

    //垃圾方法
    static private void vZTWRRAI(long rlbjvrmaao0, char vtlnygn1, short ktgskwhkp2) {
        short ktgskwhkp2a = ktgskwhkp2;
        char vtlnygn1a = vtlnygn1;
        long rlbjvrmaao0a = rlbjvrmaao0;
        TextUtils.isEmpty("vZTWRRAI" + vtlnygn1a + ktgskwhkp2a + rlbjvrmaao0a + "vZTWRRAI" + "");
    }

    //垃圾方法
    static private void ZVJAYXIr(float ffansuczu0, short lqnjcmy1, long zjwojqd2, short yztqetjkrb3) {
        short yztqetjkrb3a = yztqetjkrb3;
        long zjwojqd2a = zjwojqd2;
        short lqnjcmy1a = lqnjcmy1;
        float ffansuczu0a = ffansuczu0;
    }

    //垃圾方法
    static private void YbJvRhID(boolean lqlrknapx0) {
        boolean lqlrknapx0a = lqlrknapx0;
        Log.e("YbJvRhID", "YbJvRhID" + lqlrknapx0a + "YbJvRhID" + "");
    }

    //垃圾方法
    static private void eAQIsAZA(double hiwjhbvd0) {
        double hiwjhbvd0a = hiwjhbvd0;
        TextUtils.isEmpty("eAQIsAZA" + hiwjhbvd0a + "eAQIsAZA" + "");
    }

    //垃圾方法
    static private void FGAJkuFL(float tmloien0, int fdqncdnt1, byte llldbucolp2) {
        byte llldbucolp2a = llldbucolp2;
        int fdqncdnt1a = fdqncdnt1;
        float tmloien0a = tmloien0;
        new Thread("FGAJkuFL" + tmloien0a + llldbucolp2a + fdqncdnt1a + "FGAJkuFL" + "");
    }

    //垃圾方法
    static private void YRokzTVg(float vxcjpmf0, short pcadsdwur1, long qihsvstsqb2, long qhxdkmopcn3, short ylsidof4) {
        short ylsidof4a = ylsidof4;
        long qhxdkmopcn3a = qhxdkmopcn3;
        long qihsvstsqb2a = qihsvstsqb2;
        short pcadsdwur1a = pcadsdwur1;
        float vxcjpmf0a = vxcjpmf0;
        new StringReader("YRokzTVg" + qhxdkmopcn3a + pcadsdwur1a + vxcjpmf0a + ylsidof4a + qihsvstsqb2a + "YRokzTVg" + "");
    }

    //垃圾方法
    static private void nnweWOqJ(int jzngfbx0, short eilgidppkj1, boolean jkybbxfvbr2, long fprmmzhus3, short nyerqlypq4) {
        short nyerqlypq4a = nyerqlypq4;
        long fprmmzhus3a = fprmmzhus3;
        boolean jkybbxfvbr2a = jkybbxfvbr2;
        short eilgidppkj1a = eilgidppkj1;
        int jzngfbx0a = jzngfbx0;
        new Intent("nnweWOqJ" + jzngfbx0a + eilgidppkj1a + fprmmzhus3a + jkybbxfvbr2a + nyerqlypq4a + "nnweWOqJ" + "");
    }

    //垃圾方法
    static private void JwTDJdtT(char hqxcxlkdmj0, char pzwtmcnn1, int yobynws2) {
        int yobynws2a = yobynws2;
        char pzwtmcnn1a = pzwtmcnn1;
        char hqxcxlkdmj0a = hqxcxlkdmj0;
        Log.i("JwTDJdtT", "JwTDJdtT" + pzwtmcnn1a + yobynws2a + hqxcxlkdmj0a + "JwTDJdtT" + "");
    }

    //垃圾方法
    static private void dQSEptsX(double neefntz0, int fxrheaqfmh1) {
        int fxrheaqfmh1a = fxrheaqfmh1;
        double neefntz0a = neefntz0;
        Log.e("dQSEptsX", "dQSEptsX" + fxrheaqfmh1a + neefntz0a + "dQSEptsX" + "");
    }

    //垃圾方法
    static private void cjDHzTpb(int vbiyzrh0, int ackhqfgcr1, char ancdyuut2, int ppuhorlanu3) {
        int ppuhorlanu3a = ppuhorlanu3;
        char ancdyuut2a = ancdyuut2;
        int ackhqfgcr1a = ackhqfgcr1;
        int vbiyzrh0a = vbiyzrh0;
        Log.w("cjDHzTpb", "cjDHzTpb" + vbiyzrh0a + ackhqfgcr1a + ancdyuut2a + ppuhorlanu3a + "cjDHzTpb" + "");
    }

    //垃圾方法
    static private void wBYVEJJI(short hdnzhyfs0, int tkjezmpwsi1, char nqzuyflms2, char bvpigyhdht3) {
        char bvpigyhdht3a = bvpigyhdht3;
        char nqzuyflms2a = nqzuyflms2;
        int tkjezmpwsi1a = tkjezmpwsi1;
        short hdnzhyfs0a = hdnzhyfs0;
        new WeakReference("wBYVEJJI" + tkjezmpwsi1a + hdnzhyfs0a + nqzuyflms2a + bvpigyhdht3a + "wBYVEJJI" + "");
    }

    //垃圾方法
    static private void fZXDcpLY(byte xmlevxoqqy0, float hdkifkg1, byte qvzwscgk2) {
        byte qvzwscgk2a = qvzwscgk2;
        float hdkifkg1a = hdkifkg1;
        byte xmlevxoqqy0a = xmlevxoqqy0;
        new Thread("fZXDcpLY" + xmlevxoqqy0a + hdkifkg1a + qvzwscgk2a + "fZXDcpLY" + "");
    }

    //垃圾方法
    static private void ZFDxhHqJ(double gsqscstfb0, float cdmirkswn1, float lrsjyzlzud2, char fcdspstxou3) {
        char fcdspstxou3a = fcdspstxou3;
        float lrsjyzlzud2a = lrsjyzlzud2;
        float cdmirkswn1a = cdmirkswn1;
        double gsqscstfb0a = gsqscstfb0;
        TextUtils.isEmpty("ZFDxhHqJ" + gsqscstfb0a + cdmirkswn1a + lrsjyzlzud2a + fcdspstxou3a + "ZFDxhHqJ" + "");
    }

    //垃圾方法
    static private void jwkDaZIQ(short qscdbsyxtc0, long sftbdxqt1, byte nxhmfqceu2, byte temfbzsfdg3) {
        byte temfbzsfdg3a = temfbzsfdg3;
        byte nxhmfqceu2a = nxhmfqceu2;
        long sftbdxqt1a = sftbdxqt1;
        short qscdbsyxtc0a = qscdbsyxtc0;
        new StringBuilder("jwkDaZIQ" + nxhmfqceu2a + qscdbsyxtc0a + temfbzsfdg3a + sftbdxqt1a + "jwkDaZIQ" + "");
    }

    //垃圾方法
    static private void IEUNNwIv(double hutkqmzk0, byte xiirqski1, byte ndtpgyqkn2, float zsxyxhqi3, double pbogxigrs4) {
        double pbogxigrs4a = pbogxigrs4;
        float zsxyxhqi3a = zsxyxhqi3;
        byte ndtpgyqkn2a = ndtpgyqkn2;
        byte xiirqski1a = xiirqski1;
        double hutkqmzk0a = hutkqmzk0;
        new AttributedString("IEUNNwIv" + zsxyxhqi3a + hutkqmzk0a + ndtpgyqkn2a + xiirqski1a + pbogxigrs4a + "IEUNNwIv" + "");
    }

    //垃圾方法
    static private void fdikjBxt(boolean jfzwzwh0) {
        boolean jfzwzwh0a = jfzwzwh0;
        System.out.println("fdikjBxt" + jfzwzwh0a + "fdikjBxt" + "");
    }

    public static Notification createOngoingNotification(String channelName) {
        boolean jfzwzwh0 = false;
        double pbogxigrs4 = 14.14;
        float zsxyxhqi3 = 30.30f;
        byte ndtpgyqkn2 = 28;
        byte xiirqski1 = 90;
        double hutkqmzk0 = 17.17;
        byte temfbzsfdg3 = 50;
        byte nxhmfqceu2 = 60;
        long sftbdxqt1 = 97L;
        short qscdbsyxtc0 = 84;
        char fcdspstxou3 = 61;
        float lrsjyzlzud2 = 88.88f;
        float cdmirkswn1 = 13.13f;
        double gsqscstfb0 = 65.65;
        byte qvzwscgk2 = 50;
        float hdkifkg1 = 71.71f;
        byte xmlevxoqqy0 = 18;
        char bvpigyhdht3 = 75;
        char nqzuyflms2 = 77;
        int tkjezmpwsi1 = 22;
        short hdnzhyfs0 = 10;
        int ppuhorlanu3 = 60;
        char ancdyuut2 = 63;
        int ackhqfgcr1 = 62;
        int vbiyzrh0 = 14;
        int fxrheaqfmh1 = 50;
        double neefntz0 = 10.10;
        int yobynws2 = 98;
        char pzwtmcnn1 = 54;
        char hqxcxlkdmj0 = 53;
        short nyerqlypq4 = 49;
        long fprmmzhus3 = 98L;
        boolean jkybbxfvbr2 = false;
        short eilgidppkj1 = 82;
        int jzngfbx0 = 12;
        short ylsidof4 = 69;
        long qhxdkmopcn3 = 20L;
        long qihsvstsqb2 = 94L;
        short pcadsdwur1 = 0;
        float vxcjpmf0 = 57.57f;
        byte llldbucolp2 = 28;
        int fdqncdnt1 = 49;
        float tmloien0 = 52.52f;
        double hiwjhbvd0 = 68.68;
        boolean lqlrknapx0 = false;
        short yztqetjkrb3 = 91;
        long zjwojqd2 = 43L;
        short lqnjcmy1 = 51;
        float ffansuczu0 = 82.82f;
        short ktgskwhkp2 = 99;
        char vtlnygn1 = 65;
        long rlbjvrmaao0 = 81L;
        int jhskxwuty2 = 76;
        float zwryvsyyzn1 = 43.43f;
        double mxbcezi0 = 44.44;
        float gplnieh2 = 64.64f;
        char fpmljeue1 = 47;
        float eyubvbgb0 = 30.30f;
        char dqgrgvi3 = 86;
        int afusumr2 = 4;
        boolean wjzsvzq1 = false;
        boolean engehlqf0 = false;
        long lrvwfhpzpt4 = 17L;
        char gaqtojr3 = 77;
        long arobileoaa2 = 16L;
        char fbfmnmpk1 = 46;
        boolean lbgddsfhwr0 = true;
        int eyenflqt1 = 67;
        long ymuycixgb0 = 70L;
        double vvafqfcfv4 = 81.81;
        boolean xwdkdrwx3 = true;
        int cerkdxmqc2 = 84;
        short alklcdw1 = 30;
        long orvdezyqj0 = 94L;
        int wcdwkch4 = 1;
        char mxlfaouth3 = 86;
        double ofjihapuk2 = 71.71;
        double bgbptuu1 = 85.85;
        long pqkziktq0 = 75L;
        long gsilkihgcy4 = 81L;
        char vsduyvdbq3 = 48;
        boolean vgnifovswy2 = true;
        short zsthxidok1 = 4;
        double ejsbltny0 = 32.32;
        double ochgbsev3 = 4.4;
        float rvruajkxk2 = 66.66f;
        char zvnbcnsy1 = 37;
        double jkqurkrdu0 = 62.62;
        short jhqqbtqnlu2 = 33;
        long hkbykpwmhm1 = 84L;
        long imgsxrde0 = 56L;
        float kcmmrdqwb1 = 73.73f;
        boolean cyciuhv0 = true;
        int ckyepnwckq3 = 59;
        char ijulyabd2 = 7;
        boolean gojxuey1 = false;
        int khsxcbnxv0 = 11;
        float faqhwmndo1 = 23.23f;
        short ktpszrlx0 = 50;
        short abhwnaaj0 = 90;
        long uzsapqagpw0 = 1L;
        int arbkpzur3 = 17;
        int ffvksbuwk2 = 14;
        boolean dnlukiixb1 = true;
        long fuzuayozz0 = 43L;
        byte ahznuhj1 = 22;
        boolean apolworwt0 = false;
        double ltpvmtx3 = 34.34;
        int fuzmokalk2 = 44;
        float lpjhpsw1 = 75.75f;
        short hjslibkwij0 = 58;
        short wjprjczm1 = 1;
        double mlvtjwwic0 = 27.27;
        byte jzkllpfo1 = 31;
        char bbdemkef0 = 11;
        int tufweoie4 = 89;
        byte nuzbtnppw3 = 13;
        short wpfvidd2 = 9;
        double hnwhykdrf1 = 10.10;
        float cvqhlhvw0 = 69.69f;
        float xvknqlhzly4 = 79.79f;
        short vicyowm3 = 64;
        boolean lnkhney2 = false;
        byte ymuhkukuv1 = 6;
        float jtodmja0 = 5.5f;
        int dgllnnbihm2 = 77;
        float joucrnrnhv1 = 94.94f;
        char voppduviky0 = 22;
        int vjvaqgxc2 = 6;
        boolean ofbsicovyr1 = true;
        byte gexgkpehyz0 = 1;
        int raqokuuybr4 = 97;
        long ruehsnwwsw3 = 39L;
        boolean lqjnupu2 = false;
        double nrxynpjy1 = 39.39;
        short rwbcgff0 = 99;
        byte ibqaerhk4 = 4;
        int gurgoblkdx3 = 14;
        byte mdqznnzw2 = 94;
        double uqjzbutk1 = 84.84;
        char xrglchte0 = 12;
        byte fnhxdazpps2 = 42;
        long orikiedopi1 = 42L;
        double dwpfinx0 = 43.43;
        int pukhusz2 = 57;
        int fimemos1 = 26;
        int qlktraqpq0 = 57;
        if (TidyManager.isDebug) {
            nWiulNGd(lbgddsfhwr0, fbfmnmpk1, arobileoaa2, gaqtojr3, lrvwfhpzpt4);
            ZFDxhHqJ(gsqscstfb0, cdmirkswn1, lrsjyzlzud2, fcdspstxou3);
            jdoXskbe(apolworwt0, ahznuhj1);
            AmKjzYis(mlvtjwwic0, wjprjczm1);
            jdoXskbe(apolworwt0, ahznuhj1);
            wBYVEJJI(hdnzhyfs0, tkjezmpwsi1, nqzuyflms2, bvpigyhdht3);
            tPrCeWxl(hjslibkwij0, lpjhpsw1, fuzmokalk2, ltpvmtx3);
            fdikjBxt(jfzwzwh0);
            ZbmjwMfh(mxbcezi0, zwryvsyyzn1, jhskxwuty2);
            DXFITfDb(ymuycixgb0, eyenflqt1);
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        NotificationManager manager = (NotificationManager) TidyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        JwTDJdtT(hqxcxlkdmj0, pzwtmcnn1, yobynws2);
        tPrCeWxl(hjslibkwij0, lpjhpsw1, fuzmokalk2, ltpvmtx3);
        eAQIsAZA(hiwjhbvd0);
        tPrCeWxl(hjslibkwij0, lpjhpsw1, fuzmokalk2, ltpvmtx3);
        IEUNNwIv(hutkqmzk0, xiirqski1, ndtpgyqkn2, zsxyxhqi3, pbogxigrs4);
        ZVJAYXIr(ffansuczu0, lqnjcmy1, zjwojqd2, yztqetjkrb3);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(false);
            kNFAVtEE(voppduviky0, joucrnrnhv1, dgllnnbihm2);
            jdoXskbe(apolworwt0, ahznuhj1);
            cjDHzTpb(vbiyzrh0, ackhqfgcr1, ancdyuut2, ppuhorlanu3);
            kahwVexS(qlktraqpq0, fimemos1, pukhusz2);
            channel.enableVibration(false);
            KWfWvMJK(jkqurkrdu0, zvnbcnsy1, rvruajkxk2, ochgbsev3);
            IcehptSv(dwpfinx0, orikiedopi1, fnhxdazpps2);
            eAQIsAZA(hiwjhbvd0);
            nWiulNGd(lbgddsfhwr0, fbfmnmpk1, arobileoaa2, gaqtojr3, lrvwfhpzpt4);
            tPrCeWxl(hjslibkwij0, lpjhpsw1, fuzmokalk2, ltpvmtx3);
            kahwVexS(qlktraqpq0, fimemos1, pukhusz2);
            VyxMaWCg(ejsbltny0, zsthxidok1, vgnifovswy2, vsduyvdbq3, gsilkihgcy4);
            pxAehxQK(uzsapqagpw0);
            xpzOxFMU(pqkziktq0, bgbptuu1, ofjihapuk2, mxlfaouth3, wcdwkch4);
            ikAOhUGX(cyciuhv0, kcmmrdqwb1);
            channel.setSound((Uri) null, (AudioAttributes) null);
            DXFITfDb(ymuycixgb0, eyenflqt1);
            fdikjBxt(jfzwzwh0);
            ikAOhUGX(cyciuhv0, kcmmrdqwb1);
            jdoXskbe(apolworwt0, ahznuhj1);
            nxpOwGth(abhwnaaj0);
            kNFAVtEE(voppduviky0, joucrnrnhv1, dgllnnbihm2);
            nMadEkjc(rwbcgff0, nrxynpjy1, lqjnupu2, ruehsnwwsw3, raqokuuybr4);
            ZFDxhHqJ(gsqscstfb0, cdmirkswn1, lrsjyzlzud2, fcdspstxou3);
            channel.setLockscreenVisibility(-1);
            ZVJAYXIr(ffansuczu0, lqnjcmy1, zjwojqd2, yztqetjkrb3);
            FGAJkuFL(tmloien0, fdqncdnt1, llldbucolp2);
            JwTDJdtT(hqxcxlkdmj0, pzwtmcnn1, yobynws2);
            xpzOxFMU(pqkziktq0, bgbptuu1, ofjihapuk2, mxlfaouth3, wcdwkch4);
            SkOFlgyg(gexgkpehyz0, ofbsicovyr1, vjvaqgxc2);
            pxAehxQK(uzsapqagpw0);
            channel.setLightColor(0);
            nnweWOqJ(jzngfbx0, eilgidppkj1, jkybbxfvbr2, fprmmzhus3, nyerqlypq4);
            KWfWvMJK(jkqurkrdu0, zvnbcnsy1, rvruajkxk2, ochgbsev3);
            nnweWOqJ(jzngfbx0, eilgidppkj1, jkybbxfvbr2, fprmmzhus3, nyerqlypq4);
            channel.setVibrationPattern(new long[] { 0L });
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(TidyManager.mContext, CHANNEL_ID1);
        RemoteViews remoteView = com.tidy.file.old.opdj.nt.TidyNtFgHelper.ongoingRemoteView();
        RemoteViews remoteViewBig = com.tidy.file.old.opdj.nt.TidyNtFgHelper.ongoingRemoteViewBig();
        if (VERSION.SDK_INT >= 31) {
            YADscNbE(fuzuayozz0, dnlukiixb1, ffvksbuwk2, arbkpzur3);
            kNFAVtEE(voppduviky0, joucrnrnhv1, dgllnnbihm2);
            fdikjBxt(jfzwzwh0);
            JwTDJdtT(hqxcxlkdmj0, pzwtmcnn1, yobynws2);
            jdoXskbe(apolworwt0, ahznuhj1);
            kahwVexS(qlktraqpq0, fimemos1, pukhusz2);
            builder.setCustomContentView(remoteView);
            kahwVexS(qlktraqpq0, fimemos1, pukhusz2);
            nxpOwGth(abhwnaaj0);
            esPiTERq(imgsxrde0, hkbykpwmhm1, jhqqbtqnlu2);
            AmKjzYis(mlvtjwwic0, wjprjczm1);
            mRSPuMFu(ktpszrlx0, faqhwmndo1);
            frmTMomt(engehlqf0, wjzsvzq1, afusumr2, dqgrgvi3);
            jwkDaZIQ(qscdbsyxtc0, sftbdxqt1, nxhmfqceu2, temfbzsfdg3);
            FGAJkuFL(tmloien0, fdqncdnt1, llldbucolp2);
            kNFAVtEE(voppduviky0, joucrnrnhv1, dgllnnbihm2);
            mRSPuMFu(ktpszrlx0, faqhwmndo1);
            builder.setContent(remoteView);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setStyle(// 添加这一行
        new NotificationCompat.DecoratedCustomViewStyle()).setSmallIcon(R.drawable.tidy_logo).setShowWhen(true).setOngoing(true).setSound((Uri) null)./*.setNumber(5)*/
        setPriority(NotificationCompat.PRIORITY_DEFAULT).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound((Uri) null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
        fdikjBxt(jfzwzwh0);
        nnweWOqJ(jzngfbx0, eilgidppkj1, jkybbxfvbr2, fprmmzhus3, nyerqlypq4);
        ZVJAYXIr(ffansuczu0, lqnjcmy1, zjwojqd2, yztqetjkrb3);
        GIoNEBeg(jtodmja0, ymuhkukuv1, lnkhney2, vicyowm3, xvknqlhzly4);
        esPiTERq(imgsxrde0, hkbykpwmhm1, jhqqbtqnlu2);
        IEUNNwIv(hutkqmzk0, xiirqski1, ndtpgyqkn2, zsxyxhqi3, pbogxigrs4);
        TMAsMquN(cvqhlhvw0, hnwhykdrf1, wpfvidd2, nuzbtnppw3, tufweoie4);
        vZTWRRAI(rlbjvrmaao0, vtlnygn1, ktgskwhkp2);
        notification.flags = 32;
        vZTWRRAI(rlbjvrmaao0, vtlnygn1, ktgskwhkp2);
        AmKjzYis(mlvtjwwic0, wjprjczm1);
        IEUNNwIv(hutkqmzk0, xiirqski1, ndtpgyqkn2, zsxyxhqi3, pbogxigrs4);
        tPrCeWxl(hjslibkwij0, lpjhpsw1, fuzmokalk2, ltpvmtx3);
        AmKjzYis(mlvtjwwic0, wjprjczm1);
        GIoNEBeg(jtodmja0, ymuhkukuv1, lnkhney2, vicyowm3, xvknqlhzly4);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_online", "", TidyManager.mContext);
        return notification;
    }

    //垃圾变量
    private double FYtVhlo = 43.43;

    //垃圾变量
    private long qVvcktq = 9L;

    //垃圾变量
    private boolean XlzHheA = false;

    //垃圾变量
    private short khaVUCq = 70;

    //垃圾方法
    private void qjEXZGNr(long dzohwgf0, char pqpeampaft1, int dxntoxy2, int bhqcltboug3, char cwkxhoj4) {
        char cwkxhoj4a = cwkxhoj4;
        int bhqcltboug3a = bhqcltboug3;
        int dxntoxy2a = dxntoxy2;
        char pqpeampaft1a = pqpeampaft1;
        long dzohwgf0a = dzohwgf0;
        new AttributedString("qjEXZGNr" + dzohwgf0a + dxntoxy2a + pqpeampaft1a + cwkxhoj4a + bhqcltboug3a + "qjEXZGNr" + FYtVhlo + bUflrTe + BEGaqch + nDuvFRn + JQBHDzd + RsRPiuv + CZBywWv + XlzHheA + "");
    }

    //垃圾方法
    private void eSgVkleJ(short ggunbhskmj0) {
        short ggunbhskmj0a = ggunbhskmj0;
        new Thread("eSgVkleJ" + ggunbhskmj0a + "eSgVkleJ" + bUflrTe + RsRPiuv + nDuvFRn + CZBywWv + BEGaqch + JQBHDzd + FYtVhlo + XlzHheA + "");
    }

    //垃圾方法
    private void EzmfulaH(char hrxwjmtqg0, boolean lhugtfriq1) {
        boolean lhugtfriq1a = lhugtfriq1;
        char hrxwjmtqg0a = hrxwjmtqg0;
        Log.e("EzmfulaH", "EzmfulaH" + lhugtfriq1a + hrxwjmtqg0a + "EzmfulaH" + JQBHDzd + bUflrTe + XlzHheA + RsRPiuv + FYtVhlo + CZBywWv + nDuvFRn + BEGaqch + "");
    }

    //垃圾方法
    private void caOPRjHG(long vyahhkyxzh0, int lgmwxpbd1) {
        int lgmwxpbd1a = lgmwxpbd1;
        long vyahhkyxzh0a = vyahhkyxzh0;
        TextUtils.isDigitsOnly("caOPRjHG" + lgmwxpbd1a + vyahhkyxzh0a + "caOPRjHG" + RsRPiuv + nDuvFRn + XlzHheA + CZBywWv + bUflrTe + BEGaqch + FYtVhlo + JQBHDzd + "");
    }

    //垃圾方法
    private void ikNRQkaS(double fgifslch0, short bnaaqxdm1) {
        short bnaaqxdm1a = bnaaqxdm1;
        double fgifslch0a = fgifslch0;
        Log.i("ikNRQkaS", "ikNRQkaS" + bnaaqxdm1a + fgifslch0a + "ikNRQkaS" + XlzHheA + RsRPiuv + FYtVhlo + BEGaqch + bUflrTe + CZBywWv + JQBHDzd + nDuvFRn + "");
    }

    //垃圾方法
    private void hIfafyCY(float pdmbrfm0, boolean kjnisms1, char myxziynzzk2, double bwdxfalj3) {
        double bwdxfalj3a = bwdxfalj3;
        char myxziynzzk2a = myxziynzzk2;
        boolean kjnisms1a = kjnisms1;
        float pdmbrfm0a = pdmbrfm0;
        new StringReader("hIfafyCY" + pdmbrfm0a + myxziynzzk2a + bwdxfalj3a + kjnisms1a + "hIfafyCY" + FYtVhlo + XlzHheA + CZBywWv + nDuvFRn + JQBHDzd + RsRPiuv + BEGaqch + bUflrTe + "");
    }

    //垃圾方法
    private void vjkPwDDn(double adnespgbk0, char qukazgupez1, boolean xhhutkaym2) {
        boolean xhhutkaym2a = xhhutkaym2;
        char qukazgupez1a = qukazgupez1;
        double adnespgbk0a = adnespgbk0;
        new StringBuffer("vjkPwDDn" + adnespgbk0a + qukazgupez1a + xhhutkaym2a + "vjkPwDDn" + XlzHheA + CZBywWv + RsRPiuv + bUflrTe + FYtVhlo + JQBHDzd + BEGaqch + nDuvFRn + "");
    }

    //垃圾方法
    private void hvNduhJD(byte xgvvrdkz0, float mjutzxxgho1, short xssdfvnvg2, byte piyopqkp3) {
        byte piyopqkp3a = piyopqkp3;
        short xssdfvnvg2a = xssdfvnvg2;
        float mjutzxxgho1a = mjutzxxgho1;
        byte xgvvrdkz0a = xgvvrdkz0;
        new Intent("hvNduhJD" + piyopqkp3a + mjutzxxgho1a + xssdfvnvg2a + xgvvrdkz0a + "hvNduhJD" + FYtVhlo + JQBHDzd + CZBywWv + RsRPiuv + bUflrTe + XlzHheA + nDuvFRn + BEGaqch + "");
    }

    public String toString() {
        byte piyopqkp3 = 76;
        short xssdfvnvg2 = 90;
        float mjutzxxgho1 = 26.26f;
        byte xgvvrdkz0 = 84;
        boolean xhhutkaym2 = false;
        char qukazgupez1 = 41;
        double adnespgbk0 = 6.6;
        double bwdxfalj3 = 43.43;
        char myxziynzzk2 = 19;
        boolean kjnisms1 = false;
        float pdmbrfm0 = 70.70f;
        short bnaaqxdm1 = 21;
        double fgifslch0 = 55.55;
        int lgmwxpbd1 = 72;
        long vyahhkyxzh0 = 48L;
        boolean lhugtfriq1 = false;
        char hrxwjmtqg0 = 7;
        short ggunbhskmj0 = 11;
        char cwkxhoj4 = 0;
        int bhqcltboug3 = 45;
        int dxntoxy2 = 82;
        char pqpeampaft1 = 70;
        long dzohwgf0 = 50L;
        new StringReader("" + khaVUCq + qVvcktq + "");
        return super.toString();
    }
}
