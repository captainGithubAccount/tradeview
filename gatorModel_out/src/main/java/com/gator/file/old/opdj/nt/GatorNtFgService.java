package com.gator.file.old.opdj.nt;

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
import com.gator.file.old.FirebaseUtils;
import com.gator.file.old.GatorManager;
import com.gator.file.R;
import com.gator.file.old.shownotificy.GatorNtTransfer;
import com.gator.file.old.use.GatorNotiTimesHelper;
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

public class GatorNtFgService extends Service {

    //垃圾变量
    private boolean luKSvhd = true;

    static boolean isLiving;

    //垃圾变量
    private boolean vCMymuh = true;

    static boolean isShowing;

    //垃圾变量
    private float sZiBjOV = 79.79f;

    static String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private short sxSAqgy = 78;

    static String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private int DVcODMQ = 89;

    static int Notification_ID1 = 9745125;

    //垃圾变量
    private long bjXLhiN = 44L;

    //clock  job  launchapp  everytime_show_notify(每次通知展示的时候)
    static String from = "action_from";

    public GatorNtFgService() {
    }

    //垃圾方法
    static private void rPmLvRlc(float ukyqsscb0, float vfsqzvtve1) {
        float vfsqzvtve1a = vfsqzvtve1;
        float ukyqsscb0a = ukyqsscb0;
        Log.e("rPmLvRlc", "rPmLvRlc" + ukyqsscb0a + vfsqzvtve1a + "rPmLvRlc" + "");
    }

    //垃圾方法
    static private void pxuWqxrr(byte roklfuv0, float xyiaplk1) {
        float xyiaplk1a = xyiaplk1;
        byte roklfuv0a = roklfuv0;
    }

    //垃圾方法
    static private void xcuzjpqw(double jxnfngsnn0, int qsptndh1, boolean cdtalijnt2) {
        boolean cdtalijnt2a = cdtalijnt2;
        int qsptndh1a = qsptndh1;
        double jxnfngsnn0a = jxnfngsnn0;
        Log.e("xcuzjpqw", "xcuzjpqw" + qsptndh1a + jxnfngsnn0a + cdtalijnt2a + "xcuzjpqw" + "");
    }

    //垃圾方法
    static private void NZHhzFRx(double qdhsfxacl0, boolean qrbylixfdc1, double nqusnwbwms2, float sdtaxpvqo3) {
        float sdtaxpvqo3a = sdtaxpvqo3;
        double nqusnwbwms2a = nqusnwbwms2;
        boolean qrbylixfdc1a = qrbylixfdc1;
        double qdhsfxacl0a = qdhsfxacl0;
        Log.i("NZHhzFRx", "NZHhzFRx" + nqusnwbwms2a + qrbylixfdc1a + sdtaxpvqo3a + qdhsfxacl0a + "NZHhzFRx" + "");
    }

    public static boolean getIsShowing() {
        float sdtaxpvqo3 = 58.58f;
        double nqusnwbwms2 = 42.42;
        boolean qrbylixfdc1 = true;
        double qdhsfxacl0 = 29.29;
        boolean cdtalijnt2 = false;
        int qsptndh1 = 68;
        double jxnfngsnn0 = 18.18;
        float xyiaplk1 = 49.49f;
        byte roklfuv0 = 19;
        float vfsqzvtve1 = 48.48f;
        float ukyqsscb0 = 32.32f;
        return isShowing;
    }

    //垃圾方法
    static private void qkqFojGV(float vtexaapy0, int tfazrcg1, boolean aikjeob2) {
        boolean aikjeob2a = aikjeob2;
        int tfazrcg1a = tfazrcg1;
        float vtexaapy0a = vtexaapy0;
        TextUtils.isEmpty("qkqFojGV" + tfazrcg1a + vtexaapy0a + aikjeob2a + "qkqFojGV" + "");
    }

    //垃圾方法
    static private void uGRkAuCg(float crjppbofdu0, int jldwouj1, float xnsbicce2, byte glqoekqerf3) {
        byte glqoekqerf3a = glqoekqerf3;
        float xnsbicce2a = xnsbicce2;
        int jldwouj1a = jldwouj1;
        float crjppbofdu0a = crjppbofdu0;
        new StringBuilder("uGRkAuCg" + xnsbicce2a + jldwouj1a + crjppbofdu0a + glqoekqerf3a + "uGRkAuCg" + "");
    }

    //垃圾方法
    static private void sHkDbvIw(boolean auvsfnxwbp0, int ewmhxox1) {
        int ewmhxox1a = ewmhxox1;
        boolean auvsfnxwbp0a = auvsfnxwbp0;
        new File("sHkDbvIw" + ewmhxox1a + auvsfnxwbp0a + "sHkDbvIw" + "");
    }

    //垃圾方法
    static private void tXbItQWe(short vfoupjfye0) {
        short vfoupjfye0a = vfoupjfye0;
        new AttributedString("tXbItQWe" + vfoupjfye0a + "tXbItQWe" + "");
    }

    public static void startNotifyService(boolean isFromActivity, String from) {
        short vfoupjfye0 = 87;
        int ewmhxox1 = 52;
        boolean auvsfnxwbp0 = false;
        byte glqoekqerf3 = 67;
        float xnsbicce2 = 20.20f;
        int jldwouj1 = 77;
        float crjppbofdu0 = 91.91f;
        boolean aikjeob2 = true;
        int tfazrcg1 = 61;
        float vtexaapy0 = 90.90f;
        try {
            Context context = GatorManager.mContext;
            Intent intent = new Intent(context, GatorNtFgService.class);
            intent.putExtra(GatorNtFgService.from, from);
            intent.setPackage(context.getPackageName());
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
    private void wONtksWo(int uqnymyd0, long aodgpzaab1, float eajxegz2) {
        float eajxegz2a = eajxegz2;
        long aodgpzaab1a = aodgpzaab1;
        int uqnymyd0a = uqnymyd0;
        new AttributedString("wONtksWo" + aodgpzaab1a + uqnymyd0a + eajxegz2a + "wONtksWo" + luKSvhd + bjXLhiN + DVcODMQ + sxSAqgy + XuOPPDQ + sZiBjOV + LiBsPvH + yTiKOZY + BmxgBKF + vCMymuh + "");
    }

    //垃圾方法
    private void KwmznTKR(char ofaowir0, boolean juckihfosw1) {
        boolean juckihfosw1a = juckihfosw1;
        char ofaowir0a = ofaowir0;
        new Thread("KwmznTKR" + juckihfosw1a + ofaowir0a + "KwmznTKR" + LiBsPvH + DVcODMQ + XuOPPDQ + sxSAqgy + sZiBjOV + bjXLhiN + luKSvhd + BmxgBKF + vCMymuh + yTiKOZY + "");
    }

    //垃圾方法
    private void VrbzWXSE(float qnikazgqbx0, double rtrpupfpxa1) {
        double rtrpupfpxa1a = rtrpupfpxa1;
        float qnikazgqbx0a = qnikazgqbx0;
        new File("VrbzWXSE" + qnikazgqbx0a + rtrpupfpxa1a + "VrbzWXSE" + sZiBjOV + sxSAqgy + DVcODMQ + BmxgBKF + XuOPPDQ + bjXLhiN + luKSvhd + LiBsPvH + yTiKOZY + vCMymuh + "");
    }

    //垃圾方法
    private void lSTuTUcS(float befrnlyo0, char tzinwhxssz1, short xughpmorsf2, float bipmdih3, long pyzaxmxlv4) {
        long pyzaxmxlv4a = pyzaxmxlv4;
        float bipmdih3a = bipmdih3;
        short xughpmorsf2a = xughpmorsf2;
        char tzinwhxssz1a = tzinwhxssz1;
        float befrnlyo0a = befrnlyo0;
        new Thread("lSTuTUcS" + befrnlyo0a + bipmdih3a + pyzaxmxlv4a + xughpmorsf2a + tzinwhxssz1a + "lSTuTUcS" + yTiKOZY + bjXLhiN + BmxgBKF + luKSvhd + DVcODMQ + LiBsPvH + XuOPPDQ + vCMymuh + sZiBjOV + sxSAqgy + "");
    }

    //垃圾方法
    private void lCanCklk(byte piyntxsbzs0, long agnpwdg1, double meuxuohehv2, boolean nqnddsrmcr3, int fgmmvvlhpe4) {
        int fgmmvvlhpe4a = fgmmvvlhpe4;
        boolean nqnddsrmcr3a = nqnddsrmcr3;
        double meuxuohehv2a = meuxuohehv2;
        long agnpwdg1a = agnpwdg1;
        byte piyntxsbzs0a = piyntxsbzs0;
        Log.w("lCanCklk", "lCanCklk" + nqnddsrmcr3a + piyntxsbzs0a + fgmmvvlhpe4a + meuxuohehv2a + agnpwdg1a + "lCanCklk" + DVcODMQ + bjXLhiN + luKSvhd + sZiBjOV + LiBsPvH + yTiKOZY + XuOPPDQ + sxSAqgy + vCMymuh + BmxgBKF + "");
    }

    //垃圾方法
    private void QKQUbLLv(boolean bdonqopkk0) {
        boolean bdonqopkk0a = bdonqopkk0;
        new StringReader("QKQUbLLv" + bdonqopkk0a + "QKQUbLLv" + sZiBjOV + luKSvhd + DVcODMQ + vCMymuh + LiBsPvH + yTiKOZY + BmxgBKF + sxSAqgy + bjXLhiN + XuOPPDQ + "");
    }

    //垃圾方法
    private void MDKOfBsE(boolean bfcikfscu0, double uqgzfrri1, float pipqlwk2) {
        float pipqlwk2a = pipqlwk2;
        double uqgzfrri1a = uqgzfrri1;
        boolean bfcikfscu0a = bfcikfscu0;
        new String("MDKOfBsE" + bfcikfscu0a + uqgzfrri1a + pipqlwk2a + "MDKOfBsE" + vCMymuh + LiBsPvH + luKSvhd + XuOPPDQ + sxSAqgy + bjXLhiN + yTiKOZY + sZiBjOV + BmxgBKF + DVcODMQ + "");
    }

    //垃圾方法
    private void Nuzdalrt(double wnyvbtrb0) {
        double wnyvbtrb0a = wnyvbtrb0;
        new Intent("Nuzdalrt" + wnyvbtrb0a + "Nuzdalrt" + luKSvhd + DVcODMQ + LiBsPvH + BmxgBKF + bjXLhiN + sxSAqgy + yTiKOZY + vCMymuh + sZiBjOV + XuOPPDQ + "");
    }

    //垃圾方法
    private void dOwLbAtm(double pyewkddnto0, double eywdlficoi1, short slvvovqs2) {
        short slvvovqs2a = slvvovqs2;
        double eywdlficoi1a = eywdlficoi1;
        double pyewkddnto0a = pyewkddnto0;
        System.out.println("dOwLbAtm" + slvvovqs2a + eywdlficoi1a + pyewkddnto0a + "dOwLbAtm" + bjXLhiN + BmxgBKF + sZiBjOV + LiBsPvH + sxSAqgy + DVcODMQ + vCMymuh + yTiKOZY + XuOPPDQ + luKSvhd + "");
    }

    //垃圾方法
    private void nnSXexrV(int fknqaqi0, boolean cnzdeccmw1, int ltyzhlr2, short ookscgeux3) {
        short ookscgeux3a = ookscgeux3;
        int ltyzhlr2a = ltyzhlr2;
        boolean cnzdeccmw1a = cnzdeccmw1;
        int fknqaqi0a = fknqaqi0;
        new StringBuilder("nnSXexrV" + ltyzhlr2a + fknqaqi0a + ookscgeux3a + cnzdeccmw1a + "nnSXexrV" + LiBsPvH + bjXLhiN + sxSAqgy + sZiBjOV + DVcODMQ + BmxgBKF + vCMymuh + luKSvhd + yTiKOZY + XuOPPDQ + "");
    }

    //垃圾方法
    private void aEVTiJrL(byte dtluayqzi0, long sevuqrqqzv1, int plvlwcji2, short jtlkqcj3) {
        short jtlkqcj3a = jtlkqcj3;
        int plvlwcji2a = plvlwcji2;
        long sevuqrqqzv1a = sevuqrqqzv1;
        byte dtluayqzi0a = dtluayqzi0;
        Log.w("aEVTiJrL", "aEVTiJrL" + sevuqrqqzv1a + plvlwcji2a + dtluayqzi0a + jtlkqcj3a + "aEVTiJrL" + bjXLhiN + DVcODMQ + yTiKOZY + BmxgBKF + LiBsPvH + sZiBjOV + XuOPPDQ + luKSvhd + vCMymuh + sxSAqgy + "");
    }

    //垃圾方法
    private void wPlXQnsc(boolean ovxcbvvi0, short ljrvlkinf1, long apkdkaoadd2, float xiofgxxoyz3, int aqizqlqt4) {
        int aqizqlqt4a = aqizqlqt4;
        float xiofgxxoyz3a = xiofgxxoyz3;
        long apkdkaoadd2a = apkdkaoadd2;
        short ljrvlkinf1a = ljrvlkinf1;
        boolean ovxcbvvi0a = ovxcbvvi0;
        System.out.println("wPlXQnsc" + apkdkaoadd2a + ovxcbvvi0a + ljrvlkinf1a + xiofgxxoyz3a + aqizqlqt4a + "wPlXQnsc" + DVcODMQ + vCMymuh + BmxgBKF + sZiBjOV + luKSvhd + XuOPPDQ + bjXLhiN + yTiKOZY + LiBsPvH + sxSAqgy + "");
    }

    //垃圾方法
    private void TUGFHxUj(char ctdvcaqzt0, double yksdtfnmzp1, char ysbknmb2, char anvqrrtj3) {
        char anvqrrtj3a = anvqrrtj3;
        char ysbknmb2a = ysbknmb2;
        double yksdtfnmzp1a = yksdtfnmzp1;
        char ctdvcaqzt0a = ctdvcaqzt0;
        new File("TUGFHxUj" + ysbknmb2a + anvqrrtj3a + yksdtfnmzp1a + ctdvcaqzt0a + "TUGFHxUj" + DVcODMQ + vCMymuh + luKSvhd + LiBsPvH + sZiBjOV + BmxgBKF + yTiKOZY + XuOPPDQ + bjXLhiN + sxSAqgy + "");
    }

    //垃圾方法
    private void RYBDZujl(double bvcwryagzw0, byte jxlvmugfpn1) {
        byte jxlvmugfpn1a = jxlvmugfpn1;
        double bvcwryagzw0a = bvcwryagzw0;
        new Thread("RYBDZujl" + jxlvmugfpn1a + bvcwryagzw0a + "RYBDZujl" + bjXLhiN + vCMymuh + sxSAqgy + sZiBjOV + LiBsPvH + DVcODMQ + luKSvhd + BmxgBKF + XuOPPDQ + yTiKOZY + "");
    }

    //垃圾方法
    private void aPPgpzJy(long ubbgenmqhf0, int tohxigx1, byte jucklqa2, byte kniwqcs3, int csyubyyqf4) {
        int csyubyyqf4a = csyubyyqf4;
        byte kniwqcs3a = kniwqcs3;
        byte jucklqa2a = jucklqa2;
        int tohxigx1a = tohxigx1;
        long ubbgenmqhf0a = ubbgenmqhf0;
        new Thread("aPPgpzJy" + kniwqcs3a + ubbgenmqhf0a + jucklqa2a + csyubyyqf4a + tohxigx1a + "aPPgpzJy" + luKSvhd + yTiKOZY + DVcODMQ + bjXLhiN + sxSAqgy + XuOPPDQ + BmxgBKF + sZiBjOV + vCMymuh + LiBsPvH + "");
    }

    //垃圾方法
    private void FbsDrceI(byte drbbgnh0, long ykraybofm1, byte jycfnytffq2, int grzdelba3, byte xqwscutsq4) {
        byte xqwscutsq4a = xqwscutsq4;
        int grzdelba3a = grzdelba3;
        byte jycfnytffq2a = jycfnytffq2;
        long ykraybofm1a = ykraybofm1;
        byte drbbgnh0a = drbbgnh0;
        new Intent("FbsDrceI" + ykraybofm1a + grzdelba3a + xqwscutsq4a + drbbgnh0a + jycfnytffq2a + "FbsDrceI" + LiBsPvH + BmxgBKF + sxSAqgy + sZiBjOV + XuOPPDQ + luKSvhd + yTiKOZY + bjXLhiN + DVcODMQ + vCMymuh + "");
    }

    //垃圾方法
    private void aJWGTXVF(int bweomut0, long ooxbyei1) {
        long ooxbyei1a = ooxbyei1;
        int bweomut0a = bweomut0;
        TextUtils.isEmpty("aJWGTXVF" + ooxbyei1a + bweomut0a + "aJWGTXVF" + bjXLhiN + sZiBjOV + sxSAqgy + LiBsPvH + XuOPPDQ + luKSvhd + BmxgBKF + vCMymuh + yTiKOZY + DVcODMQ + "");
    }

    //垃圾方法
    private void ZvXunzbK(float csnjyxcphn0, float ixahwdmye1, byte yjvtiovua2, short qiqbfnrtk3, byte vfljetc4) {
        byte vfljetc4a = vfljetc4;
        short qiqbfnrtk3a = qiqbfnrtk3;
        byte yjvtiovua2a = yjvtiovua2;
        float ixahwdmye1a = ixahwdmye1;
        float csnjyxcphn0a = csnjyxcphn0;
        new StringBuilder("ZvXunzbK" + ixahwdmye1a + qiqbfnrtk3a + yjvtiovua2a + csnjyxcphn0a + vfljetc4a + "ZvXunzbK" + BmxgBKF + DVcODMQ + yTiKOZY + vCMymuh + XuOPPDQ + sxSAqgy + LiBsPvH + bjXLhiN + luKSvhd + sZiBjOV + "");
    }

    //垃圾方法
    private void QjWMimAf(byte byozoamd0, int gjzzrpgvq1, int wrpsjcgtsz2, double cqkhqxtllo3) {
        double cqkhqxtllo3a = cqkhqxtllo3;
        int wrpsjcgtsz2a = wrpsjcgtsz2;
        int gjzzrpgvq1a = gjzzrpgvq1;
        byte byozoamd0a = byozoamd0;
        new StringReader("QjWMimAf" + gjzzrpgvq1a + cqkhqxtllo3a + wrpsjcgtsz2a + byozoamd0a + "QjWMimAf" + sxSAqgy + LiBsPvH + luKSvhd + XuOPPDQ + BmxgBKF + yTiKOZY + sZiBjOV + vCMymuh + bjXLhiN + DVcODMQ + "");
    }

    //垃圾方法
    private void zDCfGHzj(boolean qruswxe0) {
        boolean qruswxe0a = qruswxe0;
        new StringBuffer("zDCfGHzj" + qruswxe0a + "zDCfGHzj" + XuOPPDQ + yTiKOZY + BmxgBKF + DVcODMQ + vCMymuh + LiBsPvH + bjXLhiN + sxSAqgy + luKSvhd + sZiBjOV + "");
    }

    public void onCreate() {
        boolean qruswxe0 = false;
        double cqkhqxtllo3 = 19.19;
        int wrpsjcgtsz2 = 61;
        int gjzzrpgvq1 = 96;
        byte byozoamd0 = 9;
        byte vfljetc4 = 72;
        short qiqbfnrtk3 = 10;
        byte yjvtiovua2 = 71;
        float ixahwdmye1 = 66.66f;
        float csnjyxcphn0 = 27.27f;
        long ooxbyei1 = 38L;
        int bweomut0 = 30;
        byte xqwscutsq4 = 54;
        int grzdelba3 = 38;
        byte jycfnytffq2 = 61;
        long ykraybofm1 = 92L;
        byte drbbgnh0 = 16;
        int csyubyyqf4 = 97;
        byte kniwqcs3 = 87;
        byte jucklqa2 = 65;
        int tohxigx1 = 39;
        long ubbgenmqhf0 = 47L;
        byte jxlvmugfpn1 = 18;
        double bvcwryagzw0 = 36.36;
        char anvqrrtj3 = 92;
        char ysbknmb2 = 88;
        double yksdtfnmzp1 = 91.91;
        char ctdvcaqzt0 = 76;
        int aqizqlqt4 = 69;
        float xiofgxxoyz3 = 8.8f;
        long apkdkaoadd2 = 17L;
        short ljrvlkinf1 = 89;
        boolean ovxcbvvi0 = true;
        short jtlkqcj3 = 93;
        int plvlwcji2 = 73;
        long sevuqrqqzv1 = 64L;
        byte dtluayqzi0 = 8;
        short ookscgeux3 = 25;
        int ltyzhlr2 = 88;
        boolean cnzdeccmw1 = true;
        int fknqaqi0 = 40;
        short slvvovqs2 = 87;
        double eywdlficoi1 = 66.66;
        double pyewkddnto0 = 23.23;
        double wnyvbtrb0 = 5.5;
        float pipqlwk2 = 28.28f;
        double uqgzfrri1 = 30.30;
        boolean bfcikfscu0 = true;
        boolean bdonqopkk0 = false;
        int fgmmvvlhpe4 = 26;
        boolean nqnddsrmcr3 = true;
        double meuxuohehv2 = 69.69;
        long agnpwdg1 = 21L;
        byte piyntxsbzs0 = 10;
        long pyzaxmxlv4 = 37L;
        float bipmdih3 = 100.100f;
        short xughpmorsf2 = 68;
        char tzinwhxssz1 = 71;
        float befrnlyo0 = 11.11f;
        double rtrpupfpxa1 = 69.69;
        float qnikazgqbx0 = 99.99f;
        boolean juckihfosw1 = true;
        char ofaowir0 = 32;
        float eajxegz2 = 8.8f;
        long aodgpzaab1 = 66L;
        int uqnymyd0 = 93;
        isLiving = true;
        isShowing = false;
        KwmznTKR(ofaowir0, juckihfosw1);
        VrbzWXSE(qnikazgqbx0, rtrpupfpxa1);
        lSTuTUcS(befrnlyo0, tzinwhxssz1, xughpmorsf2, bipmdih3, pyzaxmxlv4);
        FbsDrceI(drbbgnh0, ykraybofm1, jycfnytffq2, grzdelba3, xqwscutsq4);
        ZvXunzbK(csnjyxcphn0, ixahwdmye1, yjvtiovua2, qiqbfnrtk3, vfljetc4);
        RYBDZujl(bvcwryagzw0, jxlvmugfpn1);
        FbsDrceI(drbbgnh0, ykraybofm1, jycfnytffq2, grzdelba3, xqwscutsq4);
        nnSXexrV(fknqaqi0, cnzdeccmw1, ltyzhlr2, ookscgeux3);
        TUGFHxUj(ctdvcaqzt0, yksdtfnmzp1, ysbknmb2, anvqrrtj3);
        super.onCreate();
        if (GatorManager.isDebug) {
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        try {
            dOwLbAtm(pyewkddnto0, eywdlficoi1, slvvovqs2);
            lCanCklk(piyntxsbzs0, agnpwdg1, meuxuohehv2, nqnddsrmcr3, fgmmvvlhpe4);
            zDCfGHzj(qruswxe0);
            aPPgpzJy(ubbgenmqhf0, tohxigx1, jucklqa2, kniwqcs3, csyubyyqf4);
            zDCfGHzj(qruswxe0);
            lSTuTUcS(befrnlyo0, tzinwhxssz1, xughpmorsf2, bipmdih3, pyzaxmxlv4);
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            FbsDrceI(drbbgnh0, ykraybofm1, jycfnytffq2, grzdelba3, xqwscutsq4);
            lSTuTUcS(befrnlyo0, tzinwhxssz1, xughpmorsf2, bipmdih3, pyzaxmxlv4);
            FbsDrceI(drbbgnh0, ykraybofm1, jycfnytffq2, grzdelba3, xqwscutsq4);
            MDKOfBsE(bfcikfscu0, uqgzfrri1, pipqlwk2);
            lSTuTUcS(befrnlyo0, tzinwhxssz1, xughpmorsf2, bipmdih3, pyzaxmxlv4);
            if (GatorManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }
            isShowing = true;
            if (!GatorNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var83) {
            Exception e = var83;
            isShowing = false;
            if (GatorManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground error,e=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void WdQDgERl(long brsygdc0, int oophxmq1, byte tslrjjug2) {
        byte tslrjjug2a = tslrjjug2;
        int oophxmq1a = oophxmq1;
        long brsygdc0a = brsygdc0;
        TextUtils.isEmpty("WdQDgERl" + brsygdc0a + tslrjjug2a + oophxmq1a + "WdQDgERl" + luKSvhd + BmxgBKF + bjXLhiN + LiBsPvH + sxSAqgy + XuOPPDQ + sZiBjOV + yTiKOZY + DVcODMQ + vCMymuh + "");
    }

    //垃圾方法
    private void QoKWRDiO(int cpylmler0, short fpyqequldg1, boolean jtqgvxg2) {
        boolean jtqgvxg2a = jtqgvxg2;
        short fpyqequldg1a = fpyqequldg1;
        int cpylmler0a = cpylmler0;
        TextUtils.isDigitsOnly("QoKWRDiO" + fpyqequldg1a + cpylmler0a + jtqgvxg2a + "QoKWRDiO" + sZiBjOV + vCMymuh + XuOPPDQ + luKSvhd + DVcODMQ + sxSAqgy + bjXLhiN + LiBsPvH + BmxgBKF + yTiKOZY + "");
    }

    //垃圾方法
    private void TruJNmxP(long afbtwfpq0, int iromydgv1, float psrkasp2, float pmxtfnmem3) {
        float pmxtfnmem3a = pmxtfnmem3;
        float psrkasp2a = psrkasp2;
        int iromydgv1a = iromydgv1;
        long afbtwfpq0a = afbtwfpq0;
        new AttributedString("TruJNmxP" + pmxtfnmem3a + iromydgv1a + psrkasp2a + afbtwfpq0a + "TruJNmxP" + BmxgBKF + DVcODMQ + sxSAqgy + vCMymuh + yTiKOZY + luKSvhd + XuOPPDQ + bjXLhiN + LiBsPvH + sZiBjOV + "");
    }

    //垃圾方法
    private void HZxaYReG(long dqpywnbli0, long gepkakcnqj1) {
        long gepkakcnqj1a = gepkakcnqj1;
        long dqpywnbli0a = dqpywnbli0;
        new Intent("HZxaYReG" + dqpywnbli0a + gepkakcnqj1a + "HZxaYReG" + sxSAqgy + BmxgBKF + XuOPPDQ + bjXLhiN + yTiKOZY + luKSvhd + sZiBjOV + vCMymuh + LiBsPvH + DVcODMQ + "");
    }

    //垃圾方法
    private void xaSFPWYp(short soweqsxel0, boolean arjsyzr1, double eqhychtun2, float ieowyfywox3, long wqmrrlg4) {
        long wqmrrlg4a = wqmrrlg4;
        float ieowyfywox3a = ieowyfywox3;
        double eqhychtun2a = eqhychtun2;
        boolean arjsyzr1a = arjsyzr1;
        short soweqsxel0a = soweqsxel0;
        new StringReader("xaSFPWYp" + eqhychtun2a + ieowyfywox3a + arjsyzr1a + wqmrrlg4a + soweqsxel0a + "xaSFPWYp" + DVcODMQ + XuOPPDQ + sZiBjOV + bjXLhiN + luKSvhd + yTiKOZY + BmxgBKF + sxSAqgy + vCMymuh + LiBsPvH + "");
    }

    //垃圾方法
    private void nMOyHPZv(byte heaefdw0, short fmvlbkvzs1, boolean fegjljd2) {
        boolean fegjljd2a = fegjljd2;
        short fmvlbkvzs1a = fmvlbkvzs1;
        byte heaefdw0a = heaefdw0;
        Log.i("nMOyHPZv", "nMOyHPZv" + fmvlbkvzs1a + heaefdw0a + fegjljd2a + "nMOyHPZv" + sxSAqgy + yTiKOZY + XuOPPDQ + BmxgBKF + bjXLhiN + luKSvhd + vCMymuh + sZiBjOV + LiBsPvH + DVcODMQ + "");
    }

    //垃圾方法
    private void wKtIYGBK(int xxweedlnzs0, int rngizdg1, short hevignxtg2, long dtuezwmzf3) {
        long dtuezwmzf3a = dtuezwmzf3;
        short hevignxtg2a = hevignxtg2;
        int rngizdg1a = rngizdg1;
        int xxweedlnzs0a = xxweedlnzs0;
        new Intent("wKtIYGBK" + hevignxtg2a + rngizdg1a + xxweedlnzs0a + dtuezwmzf3a + "wKtIYGBK" + luKSvhd + bjXLhiN + XuOPPDQ + yTiKOZY + sxSAqgy + DVcODMQ + LiBsPvH + sZiBjOV + vCMymuh + BmxgBKF + "");
    }

    //垃圾方法
    private void eJwALsJa(short oisuwsfdbf0, float omugaqh1, long lyzhzjinz2, short fejidody3, boolean zsbpzzy4) {
        boolean zsbpzzy4a = zsbpzzy4;
        short fejidody3a = fejidody3;
        long lyzhzjinz2a = lyzhzjinz2;
        float omugaqh1a = omugaqh1;
        short oisuwsfdbf0a = oisuwsfdbf0;
        Log.e("eJwALsJa", "eJwALsJa" + lyzhzjinz2a + zsbpzzy4a + fejidody3a + omugaqh1a + oisuwsfdbf0a + "eJwALsJa" + BmxgBKF + XuOPPDQ + sZiBjOV + vCMymuh + DVcODMQ + LiBsPvH + luKSvhd + sxSAqgy + bjXLhiN + yTiKOZY + "");
    }

    //垃圾方法
    private void TSOcuvSv(int jfrthbjn0, long zytihfp1, int twypgnvwus2, short nqbtocknw3) {
        short nqbtocknw3a = nqbtocknw3;
        int twypgnvwus2a = twypgnvwus2;
        long zytihfp1a = zytihfp1;
        int jfrthbjn0a = jfrthbjn0;
        TextUtils.isDigitsOnly("TSOcuvSv" + zytihfp1a + jfrthbjn0a + twypgnvwus2a + nqbtocknw3a + "TSOcuvSv" + luKSvhd + BmxgBKF + bjXLhiN + XuOPPDQ + sZiBjOV + sxSAqgy + DVcODMQ + vCMymuh + yTiKOZY + LiBsPvH + "");
    }

    //垃圾方法
    private void ZmKljgMl(short gkmqntliw0, byte phdrkrs1, double oftwpjy2, int fniixskyc3, int eactihcdjt4) {
        int eactihcdjt4a = eactihcdjt4;
        int fniixskyc3a = fniixskyc3;
        double oftwpjy2a = oftwpjy2;
        byte phdrkrs1a = phdrkrs1;
        short gkmqntliw0a = gkmqntliw0;
        new Thread("ZmKljgMl" + fniixskyc3a + oftwpjy2a + gkmqntliw0a + phdrkrs1a + eactihcdjt4a + "ZmKljgMl" + DVcODMQ + vCMymuh + luKSvhd + XuOPPDQ + yTiKOZY + BmxgBKF + LiBsPvH + bjXLhiN + sxSAqgy + sZiBjOV + "");
    }

    //垃圾方法
    private void aTiocNwg(int quupkre0) {
        int quupkre0a = quupkre0;
        new StringReader("aTiocNwg" + quupkre0a + "aTiocNwg" + yTiKOZY + XuOPPDQ + luKSvhd + sxSAqgy + DVcODMQ + vCMymuh + BmxgBKF + bjXLhiN + sZiBjOV + LiBsPvH + "");
    }

    //垃圾方法
    private void PqZbBqBh(short sxndquibp0, char zgzefgibuw1, double tydsrou2) {
        double tydsrou2a = tydsrou2;
        char zgzefgibuw1a = zgzefgibuw1;
        short sxndquibp0a = sxndquibp0;
        Log.w("PqZbBqBh", "PqZbBqBh" + sxndquibp0a + zgzefgibuw1a + tydsrou2a + "PqZbBqBh" + sxSAqgy + sZiBjOV + LiBsPvH + vCMymuh + XuOPPDQ + luKSvhd + DVcODMQ + bjXLhiN + yTiKOZY + BmxgBKF + "");
    }

    //垃圾方法
    private void VhPdEInH(int antncsyuw0, int uypblqu1) {
        int uypblqu1a = uypblqu1;
        int antncsyuw0a = antncsyuw0;
        new Intent("VhPdEInH" + antncsyuw0a + uypblqu1a + "VhPdEInH" + XuOPPDQ + BmxgBKF + DVcODMQ + vCMymuh + LiBsPvH + luKSvhd + bjXLhiN + yTiKOZY + sxSAqgy + sZiBjOV + "");
    }

    //垃圾方法
    private void XPEEsXtb(boolean ibaskeiff0, long xvowgvxl1) {
        long xvowgvxl1a = xvowgvxl1;
        boolean ibaskeiff0a = ibaskeiff0;
        new WeakReference("XPEEsXtb" + ibaskeiff0a + xvowgvxl1a + "XPEEsXtb" + yTiKOZY + bjXLhiN + BmxgBKF + XuOPPDQ + vCMymuh + DVcODMQ + sZiBjOV + luKSvhd + sxSAqgy + LiBsPvH + "");
    }

    //垃圾方法
    private void wVuoZChY(byte cthriqj0) {
        byte cthriqj0a = cthriqj0;
        new Intent("wVuoZChY" + cthriqj0a + "wVuoZChY" + DVcODMQ + luKSvhd + XuOPPDQ + sZiBjOV + bjXLhiN + LiBsPvH + yTiKOZY + sxSAqgy + BmxgBKF + vCMymuh + "");
    }

    //垃圾方法
    private void uJZuskDa(short xvxpjiyru0, double nphwlrkpp1, char kuphcak2, boolean ngsmsxzs3, float urrgdvjxq4) {
        float urrgdvjxq4a = urrgdvjxq4;
        boolean ngsmsxzs3a = ngsmsxzs3;
        char kuphcak2a = kuphcak2;
        double nphwlrkpp1a = nphwlrkpp1;
        short xvxpjiyru0a = xvxpjiyru0;
        new AttributedString("uJZuskDa" + urrgdvjxq4a + ngsmsxzs3a + kuphcak2a + nphwlrkpp1a + xvxpjiyru0a + "uJZuskDa" + sxSAqgy + yTiKOZY + bjXLhiN + DVcODMQ + XuOPPDQ + luKSvhd + sZiBjOV + BmxgBKF + vCMymuh + LiBsPvH + "");
    }

    //垃圾方法
    private void RDFUSTNe(char yndylpoctx0, char onuhmckpo1) {
        char onuhmckpo1a = onuhmckpo1;
        char yndylpoctx0a = yndylpoctx0;
    }

    //垃圾方法
    private void TcSHrrfB(byte whondyif0, short zwhgmanmrv1) {
        short zwhgmanmrv1a = zwhgmanmrv1;
        byte whondyif0a = whondyif0;
        TextUtils.isEmpty("TcSHrrfB" + zwhgmanmrv1a + whondyif0a + "TcSHrrfB" + yTiKOZY + DVcODMQ + LiBsPvH + sZiBjOV + sxSAqgy + luKSvhd + bjXLhiN + XuOPPDQ + vCMymuh + BmxgBKF + "");
    }

    //垃圾方法
    private void ZICRVCly(char zzsmsewkqv0) {
        char zzsmsewkqv0a = zzsmsewkqv0;
        new WeakReference("ZICRVCly" + zzsmsewkqv0a + "ZICRVCly" + sxSAqgy + vCMymuh + DVcODMQ + LiBsPvH + yTiKOZY + bjXLhiN + luKSvhd + BmxgBKF + sZiBjOV + XuOPPDQ + "");
    }

    //垃圾方法
    private void xbtuEfww(long gpzvtuzfwd0, boolean kzhkuqu1, long nzhkpvvcin2, short tlmzmlmnm3, double uuiblwfu4) {
        double uuiblwfu4a = uuiblwfu4;
        short tlmzmlmnm3a = tlmzmlmnm3;
        long nzhkpvvcin2a = nzhkpvvcin2;
        boolean kzhkuqu1a = kzhkuqu1;
        long gpzvtuzfwd0a = gpzvtuzfwd0;
        TextUtils.isEmpty("xbtuEfww" + uuiblwfu4a + nzhkpvvcin2a + gpzvtuzfwd0a + kzhkuqu1a + tlmzmlmnm3a + "xbtuEfww" + LiBsPvH + sZiBjOV + BmxgBKF + DVcODMQ + luKSvhd + sxSAqgy + XuOPPDQ + vCMymuh + yTiKOZY + bjXLhiN + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        double uuiblwfu4 = 10.10;
        short tlmzmlmnm3 = 57;
        long nzhkpvvcin2 = 8L;
        boolean kzhkuqu1 = true;
        long gpzvtuzfwd0 = 66L;
        char zzsmsewkqv0 = 88;
        short zwhgmanmrv1 = 14;
        byte whondyif0 = 70;
        char onuhmckpo1 = 28;
        char yndylpoctx0 = 91;
        float urrgdvjxq4 = 75.75f;
        boolean ngsmsxzs3 = true;
        char kuphcak2 = 74;
        double nphwlrkpp1 = 3.3;
        short xvxpjiyru0 = 68;
        byte cthriqj0 = 97;
        long xvowgvxl1 = 23L;
        boolean ibaskeiff0 = true;
        int uypblqu1 = 23;
        int antncsyuw0 = 77;
        double tydsrou2 = 61.61;
        char zgzefgibuw1 = 70;
        short sxndquibp0 = 50;
        int quupkre0 = 26;
        int eactihcdjt4 = 25;
        int fniixskyc3 = 86;
        double oftwpjy2 = 12.12;
        byte phdrkrs1 = 25;
        short gkmqntliw0 = 54;
        short nqbtocknw3 = 86;
        int twypgnvwus2 = 96;
        long zytihfp1 = 95L;
        int jfrthbjn0 = 83;
        boolean zsbpzzy4 = false;
        short fejidody3 = 57;
        long lyzhzjinz2 = 26L;
        float omugaqh1 = 58.58f;
        short oisuwsfdbf0 = 71;
        long dtuezwmzf3 = 90L;
        short hevignxtg2 = 54;
        int rngizdg1 = 23;
        int xxweedlnzs0 = 49;
        boolean fegjljd2 = true;
        short fmvlbkvzs1 = 40;
        byte heaefdw0 = 15;
        long wqmrrlg4 = 43L;
        float ieowyfywox3 = 76.76f;
        double eqhychtun2 = 60.60;
        boolean arjsyzr1 = false;
        short soweqsxel0 = 41;
        long gepkakcnqj1 = 46L;
        long dqpywnbli0 = 45L;
        float pmxtfnmem3 = 83.83f;
        float psrkasp2 = 85.85f;
        int iromydgv1 = 39;
        long afbtwfpq0 = 46L;
        boolean jtqgvxg2 = true;
        short fpyqequldg1 = 21;
        int cpylmler0 = 87;
        byte tslrjjug2 = 12;
        int oophxmq1 = 16;
        long brsygdc0 = 62L;
        String from_action = intent.getStringExtra(from);
        isLiving = true;
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            wKtIYGBK(xxweedlnzs0, rngizdg1, hevignxtg2, dtuezwmzf3);
            TruJNmxP(afbtwfpq0, iromydgv1, psrkasp2, pmxtfnmem3);
            HZxaYReG(dqpywnbli0, gepkakcnqj1);
            wVuoZChY(cthriqj0);
            uJZuskDa(xvxpjiyru0, nphwlrkpp1, kuphcak2, ngsmsxzs3, urrgdvjxq4);
            TruJNmxP(afbtwfpq0, iromydgv1, psrkasp2, pmxtfnmem3);
            ZICRVCly(zzsmsewkqv0);
            TcSHrrfB(whondyif0, zwhgmanmrv1);
            XPEEsXtb(ibaskeiff0, xvowgvxl1);
            isShowing = true;
            RDFUSTNe(yndylpoctx0, onuhmckpo1);
            wKtIYGBK(xxweedlnzs0, rngizdg1, hevignxtg2, dtuezwmzf3);
            aTiocNwg(quupkre0);
            TruJNmxP(afbtwfpq0, iromydgv1, psrkasp2, pmxtfnmem3);
            xbtuEfww(gpzvtuzfwd0, kzhkuqu1, nzhkpvvcin2, tlmzmlmnm3, uuiblwfu4);
            VhPdEInH(antncsyuw0, uypblqu1);
            ZICRVCly(zzsmsewkqv0);
            xaSFPWYp(soweqsxel0, arjsyzr1, eqhychtun2, ieowyfywox3, wqmrrlg4);
            if (!GatorNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var71) {
            isShowing = false;
        }
        if (Objects.equals(from_action, "clock")) {
            GatorNtTransfer.onTimeTickUpEvent(GatorNotiTimesHelper.Event.ALARM);
        } else if (Objects.equals(from_action, "job")) {
            GatorNtTransfer.onTimeTickUpEvent(GatorNotiTimesHelper.Event.JOB_POLLING);
        } else if (Objects.equals(from_action, "everytime_show_notify")) {
            GatorNtTransfer.onTimeTickUpEvent(GatorNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY);
        } else if (Objects.equals(from_action, "launchapp")) {
            GatorNtTransfer.onTimeTickUpEvent(GatorNotiTimesHelper.Event.LAUNCH_APP);
        }
        eJwALsJa(oisuwsfdbf0, omugaqh1, lyzhzjinz2, fejidody3, zsbpzzy4);
        wKtIYGBK(xxweedlnzs0, rngizdg1, hevignxtg2, dtuezwmzf3);
        TruJNmxP(afbtwfpq0, iromydgv1, psrkasp2, pmxtfnmem3);
        TcSHrrfB(whondyif0, zwhgmanmrv1);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void SoXPGqmw(byte ksmuowoqot0) {
        byte ksmuowoqot0a = ksmuowoqot0;
        new StringBuffer("SoXPGqmw" + ksmuowoqot0a + "SoXPGqmw" + DVcODMQ + luKSvhd + vCMymuh + yTiKOZY + BmxgBKF + bjXLhiN + sxSAqgy + XuOPPDQ + sZiBjOV + LiBsPvH + "");
    }

    //垃圾方法
    private void qqCSzegB(double wpwzqcya0, char klnyefozb1) {
        char klnyefozb1a = klnyefozb1;
        double wpwzqcya0a = wpwzqcya0;
        Log.i("qqCSzegB", "qqCSzegB" + klnyefozb1a + wpwzqcya0a + "qqCSzegB" + BmxgBKF + bjXLhiN + DVcODMQ + yTiKOZY + sZiBjOV + LiBsPvH + vCMymuh + luKSvhd + XuOPPDQ + sxSAqgy + "");
    }

    //垃圾方法
    private void USOXMHCn(long lqvleyx0, byte oybqlthhzd1, byte trppbwvpf2) {
        byte trppbwvpf2a = trppbwvpf2;
        byte oybqlthhzd1a = oybqlthhzd1;
        long lqvleyx0a = lqvleyx0;
        Log.i("USOXMHCn", "USOXMHCn" + lqvleyx0a + oybqlthhzd1a + trppbwvpf2a + "USOXMHCn" + sxSAqgy + XuOPPDQ + vCMymuh + BmxgBKF + bjXLhiN + luKSvhd + sZiBjOV + LiBsPvH + yTiKOZY + DVcODMQ + "");
    }

    //垃圾方法
    private void YmIhlLDp(long qgsrtnpfgs0, char eyhpihkg1) {
        char eyhpihkg1a = eyhpihkg1;
        long qgsrtnpfgs0a = qgsrtnpfgs0;
        new Thread("YmIhlLDp" + eyhpihkg1a + qgsrtnpfgs0a + "YmIhlLDp" + yTiKOZY + sZiBjOV + DVcODMQ + luKSvhd + LiBsPvH + XuOPPDQ + sxSAqgy + BmxgBKF + bjXLhiN + vCMymuh + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        char eyhpihkg1 = 8;
        long qgsrtnpfgs0 = 33L;
        byte trppbwvpf2 = 91;
        byte oybqlthhzd1 = 59;
        long lqvleyx0 = 32L;
        char klnyefozb1 = 37;
        double wpwzqcya0 = 16.16;
        byte ksmuowoqot0 = 78;
        return null;
    }

    //垃圾方法
    private void nhNuOnFz(byte xfdvujwtgf0) {
        byte xfdvujwtgf0a = xfdvujwtgf0;
        new String("nhNuOnFz" + xfdvujwtgf0a + "nhNuOnFz" + vCMymuh + bjXLhiN + LiBsPvH + yTiKOZY + DVcODMQ + XuOPPDQ + sZiBjOV + BmxgBKF + sxSAqgy + luKSvhd + "");
    }

    //垃圾方法
    private void IFGkycsl(boolean xbosyjz0) {
        boolean xbosyjz0a = xbosyjz0;
        System.out.println("IFGkycsl" + xbosyjz0a + "IFGkycsl" + BmxgBKF + vCMymuh + sxSAqgy + yTiKOZY + sZiBjOV + bjXLhiN + luKSvhd + DVcODMQ + LiBsPvH + XuOPPDQ + "");
    }

    //垃圾方法
    private void zYoadqHK(float qsiqdyg0) {
        float qsiqdyg0a = qsiqdyg0;
        TextUtils.isDigitsOnly("zYoadqHK" + qsiqdyg0a + "zYoadqHK" + sZiBjOV + LiBsPvH + sxSAqgy + bjXLhiN + yTiKOZY + XuOPPDQ + vCMymuh + DVcODMQ + BmxgBKF + luKSvhd + "");
    }

    //垃圾方法
    private void zPUesqNp(double shjjglwka0, byte azdvsauobe1, boolean vevzcjur2) {
        boolean vevzcjur2a = vevzcjur2;
        byte azdvsauobe1a = azdvsauobe1;
        double shjjglwka0a = shjjglwka0;
        new File("zPUesqNp" + vevzcjur2a + azdvsauobe1a + shjjglwka0a + "zPUesqNp" + yTiKOZY + BmxgBKF + sZiBjOV + LiBsPvH + bjXLhiN + luKSvhd + DVcODMQ + vCMymuh + sxSAqgy + XuOPPDQ + "");
    }

    //垃圾方法
    private void YnpdtskH(byte dszgiszvq0, long xbcfnsb1, float gqmztcyn2, short cfdixjbiti3, float mlhxpajw4) {
        float mlhxpajw4a = mlhxpajw4;
        short cfdixjbiti3a = cfdixjbiti3;
        float gqmztcyn2a = gqmztcyn2;
        long xbcfnsb1a = xbcfnsb1;
        byte dszgiszvq0a = dszgiszvq0;
        TextUtils.isDigitsOnly("YnpdtskH" + xbcfnsb1a + mlhxpajw4a + cfdixjbiti3a + gqmztcyn2a + dszgiszvq0a + "YnpdtskH" + LiBsPvH + luKSvhd + vCMymuh + sZiBjOV + bjXLhiN + XuOPPDQ + DVcODMQ + sxSAqgy + BmxgBKF + yTiKOZY + "");
    }

    //垃圾方法
    private void hMFStGXR(int ujdrnotkmp0, byte krrugmlm1, boolean xlmnitf2, boolean nkpicamto3) {
        boolean nkpicamto3a = nkpicamto3;
        boolean xlmnitf2a = xlmnitf2;
        byte krrugmlm1a = krrugmlm1;
        int ujdrnotkmp0a = ujdrnotkmp0;
        new Intent("hMFStGXR" + ujdrnotkmp0a + xlmnitf2a + krrugmlm1a + nkpicamto3a + "hMFStGXR" + XuOPPDQ + DVcODMQ + LiBsPvH + sZiBjOV + yTiKOZY + vCMymuh + luKSvhd + BmxgBKF + bjXLhiN + sxSAqgy + "");
    }

    //垃圾方法
    private void cwsQsSVs(byte cmmmavbad0, float wvipcvb1) {
        float wvipcvb1a = wvipcvb1;
        byte cmmmavbad0a = cmmmavbad0;
        new StringReader("cwsQsSVs" + cmmmavbad0a + wvipcvb1a + "cwsQsSVs" + XuOPPDQ + bjXLhiN + LiBsPvH + sxSAqgy + DVcODMQ + luKSvhd + vCMymuh + BmxgBKF + yTiKOZY + sZiBjOV + "");
    }

    //垃圾方法
    private void ddxfJXWu(char esjynefet0, char jdbsgjnq1, boolean njqgdtrzja2) {
        boolean njqgdtrzja2a = njqgdtrzja2;
        char jdbsgjnq1a = jdbsgjnq1;
        char esjynefet0a = esjynefet0;
        new File("ddxfJXWu" + esjynefet0a + jdbsgjnq1a + njqgdtrzja2a + "ddxfJXWu" + bjXLhiN + LiBsPvH + BmxgBKF + yTiKOZY + sxSAqgy + sZiBjOV + vCMymuh + XuOPPDQ + luKSvhd + DVcODMQ + "");
    }

    //垃圾方法
    private void KhoCDQQF(int sbwequqppb0, long xmkbhxki1, short zpvwxdixw2) {
        short zpvwxdixw2a = zpvwxdixw2;
        long xmkbhxki1a = xmkbhxki1;
        int sbwequqppb0a = sbwequqppb0;
        TextUtils.isDigitsOnly("KhoCDQQF" + sbwequqppb0a + zpvwxdixw2a + xmkbhxki1a + "KhoCDQQF" + sxSAqgy + DVcODMQ + BmxgBKF + yTiKOZY + luKSvhd + sZiBjOV + bjXLhiN + vCMymuh + XuOPPDQ + LiBsPvH + "");
    }

    //垃圾方法
    private void crhRbnpn(float gddrapvfi0, short njqyyar1, short vdmmrzha2, float doikwhs3, int qwtebamhx4) {
        int qwtebamhx4a = qwtebamhx4;
        float doikwhs3a = doikwhs3;
        short vdmmrzha2a = vdmmrzha2;
        short njqyyar1a = njqyyar1;
        float gddrapvfi0a = gddrapvfi0;
        Log.i("crhRbnpn", "crhRbnpn" + doikwhs3a + njqyyar1a + qwtebamhx4a + gddrapvfi0a + vdmmrzha2a + "crhRbnpn" + sZiBjOV + XuOPPDQ + bjXLhiN + vCMymuh + BmxgBKF + luKSvhd + LiBsPvH + yTiKOZY + sxSAqgy + DVcODMQ + "");
    }

    //垃圾方法
    private void lBdTokvU(char dogebgm0, short gygvcyvtr1, short kmtcfgctol2, char nsvmbmtje3) {
        char nsvmbmtje3a = nsvmbmtje3;
        short kmtcfgctol2a = kmtcfgctol2;
        short gygvcyvtr1a = gygvcyvtr1;
        char dogebgm0a = dogebgm0;
        TextUtils.isEmpty("lBdTokvU" + nsvmbmtje3a + gygvcyvtr1a + dogebgm0a + kmtcfgctol2a + "lBdTokvU" + sxSAqgy + XuOPPDQ + yTiKOZY + sZiBjOV + bjXLhiN + BmxgBKF + vCMymuh + luKSvhd + DVcODMQ + LiBsPvH + "");
    }

    //垃圾方法
    private void YhYDPMmX(int erpwzqeoni0, boolean wppxtepca1) {
        boolean wppxtepca1a = wppxtepca1;
        int erpwzqeoni0a = erpwzqeoni0;
        new Intent("YhYDPMmX" + erpwzqeoni0a + wppxtepca1a + "YhYDPMmX" + yTiKOZY + sZiBjOV + sxSAqgy + DVcODMQ + luKSvhd + vCMymuh + XuOPPDQ + LiBsPvH + BmxgBKF + bjXLhiN + "");
    }

    public void onDestroy() {
        boolean wppxtepca1 = true;
        int erpwzqeoni0 = 52;
        char nsvmbmtje3 = 70;
        short kmtcfgctol2 = 26;
        short gygvcyvtr1 = 43;
        char dogebgm0 = 37;
        int qwtebamhx4 = 35;
        float doikwhs3 = 48.48f;
        short vdmmrzha2 = 55;
        short njqyyar1 = 37;
        float gddrapvfi0 = 36.36f;
        short zpvwxdixw2 = 93;
        long xmkbhxki1 = 19L;
        int sbwequqppb0 = 42;
        boolean njqgdtrzja2 = true;
        char jdbsgjnq1 = 92;
        char esjynefet0 = 81;
        float wvipcvb1 = 84.84f;
        byte cmmmavbad0 = 89;
        boolean nkpicamto3 = false;
        boolean xlmnitf2 = false;
        byte krrugmlm1 = 45;
        int ujdrnotkmp0 = 49;
        float mlhxpajw4 = 81.81f;
        short cfdixjbiti3 = 15;
        float gqmztcyn2 = 47.47f;
        long xbcfnsb1 = 6L;
        byte dszgiszvq0 = 59;
        boolean vevzcjur2 = true;
        byte azdvsauobe1 = 21;
        double shjjglwka0 = 30.30;
        float qsiqdyg0 = 99.99f;
        boolean xbosyjz0 = false;
        byte xfdvujwtgf0 = 64;
        YnpdtskH(dszgiszvq0, xbcfnsb1, gqmztcyn2, cfdixjbiti3, mlhxpajw4);
        zPUesqNp(shjjglwka0, azdvsauobe1, vevzcjur2);
        YhYDPMmX(erpwzqeoni0, wppxtepca1);
        isLiving = false;
        isShowing = false;
        super.onDestroy();
    }

    //垃圾方法
    private void UmrfEJUa(double eipqdbx0) {
        double eipqdbx0a = eipqdbx0;
        new AttributedString("UmrfEJUa" + eipqdbx0a + "UmrfEJUa" + vCMymuh + sxSAqgy + sZiBjOV + XuOPPDQ + LiBsPvH + luKSvhd + DVcODMQ + BmxgBKF + bjXLhiN + yTiKOZY + "");
    }

    //垃圾方法
    private void ZbpRwJmE(byte zwqhmxt0, boolean etcteksau1, int jkymikue2, short pkoomjch3) {
        short pkoomjch3a = pkoomjch3;
        int jkymikue2a = jkymikue2;
        boolean etcteksau1a = etcteksau1;
        byte zwqhmxt0a = zwqhmxt0;
        System.out.println("ZbpRwJmE" + zwqhmxt0a + etcteksau1a + pkoomjch3a + jkymikue2a + "ZbpRwJmE" + luKSvhd + vCMymuh + sxSAqgy + bjXLhiN + LiBsPvH + DVcODMQ + sZiBjOV + yTiKOZY + BmxgBKF + XuOPPDQ + "");
    }

    //垃圾方法
    private void JgYaefWU(short npzmjtcecu0, byte vvsigeh1, float rkyhbhyfvj2, double lyspecvez3, long janmmoh4) {
        long janmmoh4a = janmmoh4;
        double lyspecvez3a = lyspecvez3;
        float rkyhbhyfvj2a = rkyhbhyfvj2;
        byte vvsigeh1a = vvsigeh1;
        short npzmjtcecu0a = npzmjtcecu0;
        TextUtils.isDigitsOnly("JgYaefWU" + rkyhbhyfvj2a + vvsigeh1a + lyspecvez3a + npzmjtcecu0a + janmmoh4a + "JgYaefWU" + XuOPPDQ + luKSvhd + bjXLhiN + DVcODMQ + vCMymuh + sZiBjOV + sxSAqgy + yTiKOZY + LiBsPvH + BmxgBKF + "");
    }

    //垃圾方法
    private void cCDpuwIJ(float mzpgtlxw0) {
        float mzpgtlxw0a = mzpgtlxw0;
        new String("cCDpuwIJ" + mzpgtlxw0a + "cCDpuwIJ" + BmxgBKF + sxSAqgy + DVcODMQ + vCMymuh + sZiBjOV + yTiKOZY + luKSvhd + XuOPPDQ + LiBsPvH + bjXLhiN + "");
    }

    //垃圾方法
    private void aEAHpWiw(float cwkiiqxk0) {
        float cwkiiqxk0a = cwkiiqxk0;
        new AttributedString("aEAHpWiw" + cwkiiqxk0a + "aEAHpWiw" + DVcODMQ + sxSAqgy + luKSvhd + yTiKOZY + sZiBjOV + LiBsPvH + bjXLhiN + vCMymuh + XuOPPDQ + BmxgBKF + "");
    }

    //垃圾方法
    private void ierbdcMS(long ywgudypnki0, boolean bwuhxrehh1, long bnrjspinn2, float yjoakcz3) {
        float yjoakcz3a = yjoakcz3;
        long bnrjspinn2a = bnrjspinn2;
        boolean bwuhxrehh1a = bwuhxrehh1;
        long ywgudypnki0a = ywgudypnki0;
        System.out.println("ierbdcMS" + bwuhxrehh1a + bnrjspinn2a + yjoakcz3a + ywgudypnki0a + "ierbdcMS" + DVcODMQ + sZiBjOV + BmxgBKF + bjXLhiN + yTiKOZY + luKSvhd + XuOPPDQ + vCMymuh + LiBsPvH + sxSAqgy + "");
    }

    //垃圾方法
    private void JmwdyJAZ(float pjtzcdbdk0, boolean xrpcibl1) {
        boolean xrpcibl1a = xrpcibl1;
        float pjtzcdbdk0a = pjtzcdbdk0;
        new WeakReference("JmwdyJAZ" + pjtzcdbdk0a + xrpcibl1a + "JmwdyJAZ" + luKSvhd + sxSAqgy + BmxgBKF + sZiBjOV + bjXLhiN + yTiKOZY + DVcODMQ + LiBsPvH + XuOPPDQ + vCMymuh + "");
    }

    //垃圾方法
    private void uHSZcCye(char xtdghzzwt0, long dujzhfxzy1, double ixkrsemdfa2) {
        double ixkrsemdfa2a = ixkrsemdfa2;
        long dujzhfxzy1a = dujzhfxzy1;
        char xtdghzzwt0a = xtdghzzwt0;
        new AttributedString("uHSZcCye" + ixkrsemdfa2a + dujzhfxzy1a + xtdghzzwt0a + "uHSZcCye" + XuOPPDQ + yTiKOZY + luKSvhd + bjXLhiN + sZiBjOV + DVcODMQ + sxSAqgy + vCMymuh + BmxgBKF + LiBsPvH + "");
    }

    //垃圾方法
    private void MjwbiSjR(double fiawmqpyi0) {
        double fiawmqpyi0a = fiawmqpyi0;
        TextUtils.isDigitsOnly("MjwbiSjR" + fiawmqpyi0a + "MjwbiSjR" + DVcODMQ + LiBsPvH + bjXLhiN + XuOPPDQ + BmxgBKF + vCMymuh + sxSAqgy + sZiBjOV + yTiKOZY + luKSvhd + "");
    }

    //垃圾方法
    private void dPMMMTqd(long qmtkwnm0, byte nvioaxu1, char bmesdted2, short mvkdawvf3) {
        short mvkdawvf3a = mvkdawvf3;
        char bmesdted2a = bmesdted2;
        byte nvioaxu1a = nvioaxu1;
        long qmtkwnm0a = qmtkwnm0;
        System.out.println("dPMMMTqd" + bmesdted2a + mvkdawvf3a + nvioaxu1a + qmtkwnm0a + "dPMMMTqd" + yTiKOZY + XuOPPDQ + LiBsPvH + DVcODMQ + vCMymuh + luKSvhd + BmxgBKF + sxSAqgy + bjXLhiN + sZiBjOV + "");
    }

    //垃圾方法
    private void oxMzLLNj(double nccqoiae0, double uvktmcb1, float wufopdlpf2, char jahjlgz3, int bviivdc4) {
        int bviivdc4a = bviivdc4;
        char jahjlgz3a = jahjlgz3;
        float wufopdlpf2a = wufopdlpf2;
        double uvktmcb1a = uvktmcb1;
        double nccqoiae0a = nccqoiae0;
        new StringReader("oxMzLLNj" + wufopdlpf2a + bviivdc4a + uvktmcb1a + jahjlgz3a + nccqoiae0a + "oxMzLLNj" + yTiKOZY + DVcODMQ + LiBsPvH + bjXLhiN + luKSvhd + sxSAqgy + BmxgBKF + vCMymuh + sZiBjOV + XuOPPDQ + "");
    }

    //垃圾方法
    private void cXGTpCyW(int hjyuiynhnq0, short gqhbzgrrje1, boolean bpbwntq2, char qcyousczoe3, long xttrlpn4) {
        long xttrlpn4a = xttrlpn4;
        char qcyousczoe3a = qcyousczoe3;
        boolean bpbwntq2a = bpbwntq2;
        short gqhbzgrrje1a = gqhbzgrrje1;
        int hjyuiynhnq0a = hjyuiynhnq0;
        new StringReader("cXGTpCyW" + hjyuiynhnq0a + gqhbzgrrje1a + qcyousczoe3a + xttrlpn4a + bpbwntq2a + "cXGTpCyW" + sZiBjOV + sxSAqgy + DVcODMQ + bjXLhiN + yTiKOZY + LiBsPvH + XuOPPDQ + BmxgBKF + vCMymuh + luKSvhd + "");
    }

    //垃圾方法
    private void zunWdsHH(int phhuygwkf0, char fcpkkjxnr1, boolean esmbfhz2) {
        boolean esmbfhz2a = esmbfhz2;
        char fcpkkjxnr1a = fcpkkjxnr1;
        int phhuygwkf0a = phhuygwkf0;
        System.out.println("zunWdsHH" + fcpkkjxnr1a + phhuygwkf0a + esmbfhz2a + "zunWdsHH" + yTiKOZY + XuOPPDQ + bjXLhiN + LiBsPvH + sxSAqgy + sZiBjOV + DVcODMQ + vCMymuh + BmxgBKF + luKSvhd + "");
    }

    //垃圾方法
    private void WtueEoNn(boolean bcumcrceop0) {
        boolean bcumcrceop0a = bcumcrceop0;
        new WeakReference("WtueEoNn" + bcumcrceop0a + "WtueEoNn" + vCMymuh + luKSvhd + yTiKOZY + sZiBjOV + LiBsPvH + BmxgBKF + DVcODMQ + bjXLhiN + XuOPPDQ + sxSAqgy + "");
    }

    //垃圾方法
    private void liUOosnP(long zxjysbwl0, char mryxzqcrvm1) {
        char mryxzqcrvm1a = mryxzqcrvm1;
        long zxjysbwl0a = zxjysbwl0;
        Log.i("liUOosnP", "liUOosnP" + zxjysbwl0a + mryxzqcrvm1a + "liUOosnP" + LiBsPvH + vCMymuh + luKSvhd + BmxgBKF + yTiKOZY + DVcODMQ + sxSAqgy + sZiBjOV + bjXLhiN + XuOPPDQ + "");
    }

    //垃圾方法
    private void THFGgDUt(byte dychrwg0) {
        byte dychrwg0a = dychrwg0;
        new Thread("THFGgDUt" + dychrwg0a + "THFGgDUt" + LiBsPvH + BmxgBKF + yTiKOZY + bjXLhiN + DVcODMQ + sxSAqgy + vCMymuh + sZiBjOV + XuOPPDQ + luKSvhd + "");
    }

    //垃圾方法
    private void EseEKjDn(long admjhqiu0) {
        long admjhqiu0a = admjhqiu0;
        new StringReader("EseEKjDn" + admjhqiu0a + "EseEKjDn" + bjXLhiN + luKSvhd + sZiBjOV + vCMymuh + BmxgBKF + LiBsPvH + yTiKOZY + DVcODMQ + XuOPPDQ + sxSAqgy + "");
    }

    //垃圾方法
    private void HZtMzfRO(boolean liewyayore0, short wdgjgpynqs1, short axmbnwhs2, byte xuupdvctg3) {
        byte xuupdvctg3a = xuupdvctg3;
        short axmbnwhs2a = axmbnwhs2;
        short wdgjgpynqs1a = wdgjgpynqs1;
        boolean liewyayore0a = liewyayore0;
        TextUtils.isDigitsOnly("HZtMzfRO" + xuupdvctg3a + axmbnwhs2a + wdgjgpynqs1a + liewyayore0a + "HZtMzfRO" + yTiKOZY + sxSAqgy + vCMymuh + BmxgBKF + LiBsPvH + bjXLhiN + DVcODMQ + luKSvhd + sZiBjOV + XuOPPDQ + "");
    }

    //垃圾方法
    private void MnvIHZdB(boolean xmocikfj0, boolean yigukkfbbc1, char fdytbzeww2, char sxijlkfg3) {
        char sxijlkfg3a = sxijlkfg3;
        char fdytbzeww2a = fdytbzeww2;
        boolean yigukkfbbc1a = yigukkfbbc1;
        boolean xmocikfj0a = xmocikfj0;
        TextUtils.isEmpty("MnvIHZdB" + fdytbzeww2a + sxijlkfg3a + xmocikfj0a + yigukkfbbc1a + "MnvIHZdB" + DVcODMQ + LiBsPvH + bjXLhiN + sZiBjOV + sxSAqgy + vCMymuh + XuOPPDQ + BmxgBKF + yTiKOZY + luKSvhd + "");
    }

    //垃圾方法
    private void zTHfdVEE(char qcfcffjrjq0, short zgeftfsn1, boolean hlnjxvfsys2) {
        boolean hlnjxvfsys2a = hlnjxvfsys2;
        short zgeftfsn1a = zgeftfsn1;
        char qcfcffjrjq0a = qcfcffjrjq0;
        Log.w("zTHfdVEE", "zTHfdVEE" + zgeftfsn1a + qcfcffjrjq0a + hlnjxvfsys2a + "zTHfdVEE" + BmxgBKF + yTiKOZY + LiBsPvH + luKSvhd + sxSAqgy + XuOPPDQ + vCMymuh + sZiBjOV + bjXLhiN + DVcODMQ + "");
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        boolean hlnjxvfsys2 = true;
        short zgeftfsn1 = 51;
        char qcfcffjrjq0 = 7;
        char sxijlkfg3 = 5;
        char fdytbzeww2 = 48;
        boolean yigukkfbbc1 = false;
        boolean xmocikfj0 = true;
        byte xuupdvctg3 = 42;
        short axmbnwhs2 = 53;
        short wdgjgpynqs1 = 41;
        boolean liewyayore0 = true;
        long admjhqiu0 = 19L;
        byte dychrwg0 = 22;
        char mryxzqcrvm1 = 61;
        long zxjysbwl0 = 38L;
        boolean bcumcrceop0 = false;
        boolean esmbfhz2 = false;
        char fcpkkjxnr1 = 51;
        int phhuygwkf0 = 46;
        long xttrlpn4 = 8L;
        char qcyousczoe3 = 73;
        boolean bpbwntq2 = true;
        short gqhbzgrrje1 = 45;
        int hjyuiynhnq0 = 66;
        int bviivdc4 = 15;
        char jahjlgz3 = 92;
        float wufopdlpf2 = 96.96f;
        double uvktmcb1 = 84.84;
        double nccqoiae0 = 30.30;
        short mvkdawvf3 = 68;
        char bmesdted2 = 35;
        byte nvioaxu1 = 10;
        long qmtkwnm0 = 90L;
        double fiawmqpyi0 = 78.78;
        double ixkrsemdfa2 = 72.72;
        long dujzhfxzy1 = 92L;
        char xtdghzzwt0 = 47;
        boolean xrpcibl1 = true;
        float pjtzcdbdk0 = 41.41f;
        float yjoakcz3 = 46.46f;
        long bnrjspinn2 = 51L;
        boolean bwuhxrehh1 = true;
        long ywgudypnki0 = 19L;
        float cwkiiqxk0 = 70.70f;
        float mzpgtlxw0 = 52.52f;
        long janmmoh4 = 30L;
        double lyspecvez3 = 94.94;
        float rkyhbhyfvj2 = 10.10f;
        byte vvsigeh1 = 17;
        short npzmjtcecu0 = 14;
        short pkoomjch3 = 96;
        int jkymikue2 = 10;
        boolean etcteksau1 = false;
        byte zwqhmxt0 = 10;
        double eipqdbx0 = 53.53;
        ierbdcMS(ywgudypnki0, bwuhxrehh1, bnrjspinn2, yjoakcz3);
        MnvIHZdB(xmocikfj0, yigukkfbbc1, fdytbzeww2, sxijlkfg3);
        EseEKjDn(admjhqiu0);
        UmrfEJUa(eipqdbx0);
        MjwbiSjR(fiawmqpyi0);
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        Iterator var55 = manager.getRunningServices(Integer.MAX_VALUE).iterator();
        aEAHpWiw(cwkiiqxk0);
        dPMMMTqd(qmtkwnm0, nvioaxu1, bmesdted2, mvkdawvf3);
        cCDpuwIJ(mzpgtlxw0);
        EseEKjDn(admjhqiu0);
        MjwbiSjR(fiawmqpyi0);
        WtueEoNn(bcumcrceop0);
        cCDpuwIJ(mzpgtlxw0);
        zunWdsHH(phhuygwkf0, fcpkkjxnr1, esmbfhz2);
        EseEKjDn(admjhqiu0);
        ActivityManager.RunningServiceInfo runningService;
        MnvIHZdB(xmocikfj0, yigukkfbbc1, fdytbzeww2, sxijlkfg3);
        aEAHpWiw(cwkiiqxk0);
        JgYaefWU(npzmjtcecu0, vvsigeh1, rkyhbhyfvj2, lyspecvez3, janmmoh4);
        liUOosnP(zxjysbwl0, mryxzqcrvm1);
        JgYaefWU(npzmjtcecu0, vvsigeh1, rkyhbhyfvj2, lyspecvez3, janmmoh4);
        zunWdsHH(phhuygwkf0, fcpkkjxnr1, esmbfhz2);
        EseEKjDn(admjhqiu0);
        oxMzLLNj(nccqoiae0, uvktmcb1, wufopdlpf2, jahjlgz3, bviivdc4);
        cXGTpCyW(hjyuiynhnq0, gqhbzgrrje1, bpbwntq2, qcyousczoe3, xttrlpn4);
        do {
            if (!var55.hasNext()) {
                return false;
            }
            runningService = (ActivityManager.RunningServiceInfo) var55.next();
        } while (!serviceClass.getName().equals(runningService.service.getClassName()) || !runningService.foreground);
        ZbpRwJmE(zwqhmxt0, etcteksau1, jkymikue2, pkoomjch3);
        liUOosnP(zxjysbwl0, mryxzqcrvm1);
        cCDpuwIJ(mzpgtlxw0);
        WtueEoNn(bcumcrceop0);
        return true;
    }

    //垃圾方法
    static private void VVrxyvPn(byte rpovzmje0, byte xcvfrzklgh1) {
        byte xcvfrzklgh1a = xcvfrzklgh1;
        byte rpovzmje0a = rpovzmje0;
        new AttributedString("VVrxyvPn" + xcvfrzklgh1a + rpovzmje0a + "VVrxyvPn" + "");
    }

    //垃圾方法
    static private void xldsBozo(byte pvijlshh0, double bvnpuimlb1) {
        double bvnpuimlb1a = bvnpuimlb1;
        byte pvijlshh0a = pvijlshh0;
        Log.w("xldsBozo", "xldsBozo" + pvijlshh0a + bvnpuimlb1a + "xldsBozo" + "");
    }

    //垃圾方法
    static private void IvQoFtGd(char qedltzkdbe0, long tjgktka1, boolean uwkopvnly2, short xwjijmj3) {
        short xwjijmj3a = xwjijmj3;
        boolean uwkopvnly2a = uwkopvnly2;
        long tjgktka1a = tjgktka1;
        char qedltzkdbe0a = qedltzkdbe0;
        TextUtils.isDigitsOnly("IvQoFtGd" + tjgktka1a + xwjijmj3a + qedltzkdbe0a + uwkopvnly2a + "IvQoFtGd" + "");
    }

    //垃圾方法
    static private void kCOiSJGN(double pzleotvb0, boolean wcqgrcs1, double pztzkpigpt2) {
        double pztzkpigpt2a = pztzkpigpt2;
        boolean wcqgrcs1a = wcqgrcs1;
        double pzleotvb0a = pzleotvb0;
        new Thread("kCOiSJGN" + wcqgrcs1a + pzleotvb0a + pztzkpigpt2a + "kCOiSJGN" + "");
    }

    //垃圾方法
    static private void qayZEsIF(int qggbujmfu0, float sfzzdgkzl1) {
        float sfzzdgkzl1a = sfzzdgkzl1;
        int qggbujmfu0a = qggbujmfu0;
        new StringBuilder("qayZEsIF" + sfzzdgkzl1a + qggbujmfu0a + "qayZEsIF" + "");
    }

    //垃圾方法
    static private void CvDLKFWY(double acdkqxc0, double joczyff1, byte kbwdvwfvgs2, char aneawssprs3, int xlgsfmdwa4) {
        int xlgsfmdwa4a = xlgsfmdwa4;
        char aneawssprs3a = aneawssprs3;
        byte kbwdvwfvgs2a = kbwdvwfvgs2;
        double joczyff1a = joczyff1;
        double acdkqxc0a = acdkqxc0;
    }

    //垃圾方法
    static private void FaVqIsSa(short ndjofewptq0) {
        short ndjofewptq0a = ndjofewptq0;
        new File("FaVqIsSa" + ndjofewptq0a + "FaVqIsSa" + "");
    }

    //垃圾方法
    static private void CUsnJVyY(double ilaynyhzg0) {
        double ilaynyhzg0a = ilaynyhzg0;
        Log.w("CUsnJVyY", "CUsnJVyY" + ilaynyhzg0a + "CUsnJVyY" + "");
    }

    //垃圾方法
    static private void XQfyEpLj(char djhruwp0, byte gyeezwracn1, int xgbrzyeuo2) {
        int xgbrzyeuo2a = xgbrzyeuo2;
        byte gyeezwracn1a = gyeezwracn1;
        char djhruwp0a = djhruwp0;
        new String("XQfyEpLj" + xgbrzyeuo2a + gyeezwracn1a + djhruwp0a + "XQfyEpLj" + "");
    }

    //垃圾方法
    static private void vEqZDqbV(boolean znvxxtpxoj0) {
        boolean znvxxtpxoj0a = znvxxtpxoj0;
        new StringBuilder("vEqZDqbV" + znvxxtpxoj0a + "vEqZDqbV" + "");
    }

    //垃圾方法
    static private void NitVMZYt(double uhrfajit0, float wgkfaoy1, int tdilifwsae2, long ypaftnw3) {
        long ypaftnw3a = ypaftnw3;
        int tdilifwsae2a = tdilifwsae2;
        float wgkfaoy1a = wgkfaoy1;
        double uhrfajit0a = uhrfajit0;
        Log.i("NitVMZYt", "NitVMZYt" + uhrfajit0a + tdilifwsae2a + ypaftnw3a + wgkfaoy1a + "NitVMZYt" + "");
    }

    //垃圾方法
    static private void qRIqXKMD(double pvpnxzsr0, boolean rrhtkquop1, char kveylcut2, char rvaebibc3) {
        char rvaebibc3a = rvaebibc3;
        char kveylcut2a = kveylcut2;
        boolean rrhtkquop1a = rrhtkquop1;
        double pvpnxzsr0a = pvpnxzsr0;
        TextUtils.isDigitsOnly("qRIqXKMD" + rvaebibc3a + kveylcut2a + rrhtkquop1a + pvpnxzsr0a + "qRIqXKMD" + "");
    }

    //垃圾方法
    static private void QFmvelJi(long dckayypgtu0, byte kvqbacnqpr1, float infvjgdjrn2, double qihtldkapr3, long vzbcfqxu4) {
        long vzbcfqxu4a = vzbcfqxu4;
        double qihtldkapr3a = qihtldkapr3;
        float infvjgdjrn2a = infvjgdjrn2;
        byte kvqbacnqpr1a = kvqbacnqpr1;
        long dckayypgtu0a = dckayypgtu0;
        new AttributedString("QFmvelJi" + dckayypgtu0a + kvqbacnqpr1a + qihtldkapr3a + vzbcfqxu4a + infvjgdjrn2a + "QFmvelJi" + "");
    }

    //垃圾方法
    static private void AJqijOGg(char nyyqubduvl0, short tyqjjenfcb1, long amupkexrxp2, char lrdpvqib3) {
        char lrdpvqib3a = lrdpvqib3;
        long amupkexrxp2a = amupkexrxp2;
        short tyqjjenfcb1a = tyqjjenfcb1;
        char nyyqubduvl0a = nyyqubduvl0;
    }

    //垃圾方法
    static private void KzLbVoCf(boolean ctngagfib0, byte uqqtwlvx1, boolean kfmfiaq2, double fqenbzeor3) {
        double fqenbzeor3a = fqenbzeor3;
        boolean kfmfiaq2a = kfmfiaq2;
        byte uqqtwlvx1a = uqqtwlvx1;
        boolean ctngagfib0a = ctngagfib0;
        new StringBuilder("KzLbVoCf" + ctngagfib0a + uqqtwlvx1a + fqenbzeor3a + kfmfiaq2a + "KzLbVoCf" + "");
    }

    //垃圾方法
    static private void EWsdZgzl(byte oxysqgfio0) {
        byte oxysqgfio0a = oxysqgfio0;
        new Intent("EWsdZgzl" + oxysqgfio0a + "EWsdZgzl" + "");
    }

    //垃圾方法
    static private void gjzvbcqY(short iazssmwwvp0, char lyvhzdjgfs1) {
        char lyvhzdjgfs1a = lyvhzdjgfs1;
        short iazssmwwvp0a = iazssmwwvp0;
        Log.e("gjzvbcqY", "gjzvbcqY" + iazssmwwvp0a + lyvhzdjgfs1a + "gjzvbcqY" + "");
    }

    //垃圾方法
    static private void cijRKZtu(int yoamhsdsxp0, char fozmdns1, boolean subbhcybk2) {
        boolean subbhcybk2a = subbhcybk2;
        char fozmdns1a = fozmdns1;
        int yoamhsdsxp0a = yoamhsdsxp0;
        new WeakReference("cijRKZtu" + subbhcybk2a + yoamhsdsxp0a + fozmdns1a + "cijRKZtu" + "");
    }

    //垃圾方法
    static private void jMRsPxri(boolean gublrwdvd0, char lqclyfu1, long smoupmdnhw2, float slmssvj3) {
        float slmssvj3a = slmssvj3;
        long smoupmdnhw2a = smoupmdnhw2;
        char lqclyfu1a = lqclyfu1;
        boolean gublrwdvd0a = gublrwdvd0;
        new Thread("jMRsPxri" + slmssvj3a + lqclyfu1a + gublrwdvd0a + smoupmdnhw2a + "jMRsPxri" + "");
    }

    //垃圾方法
    static private void gWzrMZZg(double mmqgjtn0, short uttmblibt1, byte eppwjyss2, float owyrrypqa3, float nncdylq4) {
        float nncdylq4a = nncdylq4;
        float owyrrypqa3a = owyrrypqa3;
        byte eppwjyss2a = eppwjyss2;
        short uttmblibt1a = uttmblibt1;
        double mmqgjtn0a = mmqgjtn0;
        System.out.println("gWzrMZZg" + mmqgjtn0a + uttmblibt1a + eppwjyss2a + nncdylq4a + owyrrypqa3a + "gWzrMZZg" + "");
    }

    //垃圾方法
    static private void LuLbxxNz(byte xsudiocux0, byte dtmdsfji1, short lwnugjc2, char xrgwlgayn3) {
        char xrgwlgayn3a = xrgwlgayn3;
        short lwnugjc2a = lwnugjc2;
        byte dtmdsfji1a = dtmdsfji1;
        byte xsudiocux0a = xsudiocux0;
        new AttributedString("LuLbxxNz" + dtmdsfji1a + xsudiocux0a + lwnugjc2a + xrgwlgayn3a + "LuLbxxNz" + "");
    }

    //垃圾方法
    static private void ohXgvwmG(boolean wmlvlknwlm0, boolean hslxxlunq1, char spenmsd2) {
        char spenmsd2a = spenmsd2;
        boolean hslxxlunq1a = hslxxlunq1;
        boolean wmlvlknwlm0a = wmlvlknwlm0;
        new WeakReference("ohXgvwmG" + hslxxlunq1a + wmlvlknwlm0a + spenmsd2a + "ohXgvwmG" + "");
    }

    //垃圾方法
    static private void pVWSIYMO(char elwebkbeh0, char sprcpkp1, long zcysbjzvf2, byte yoblnyye3) {
        byte yoblnyye3a = yoblnyye3;
        long zcysbjzvf2a = zcysbjzvf2;
        char sprcpkp1a = sprcpkp1;
        char elwebkbeh0a = elwebkbeh0;
        System.out.println("pVWSIYMO" + elwebkbeh0a + yoblnyye3a + zcysbjzvf2a + sprcpkp1a + "pVWSIYMO" + "");
    }

    //垃圾方法
    static private void uljkEQEj(boolean rqqfkgxpm0, short omvvunemln1, short jmjjpuy2, boolean yopjnpcrbl3) {
        boolean yopjnpcrbl3a = yopjnpcrbl3;
        short jmjjpuy2a = jmjjpuy2;
        short omvvunemln1a = omvvunemln1;
        boolean rqqfkgxpm0a = rqqfkgxpm0;
        new File("uljkEQEj" + yopjnpcrbl3a + omvvunemln1a + jmjjpuy2a + rqqfkgxpm0a + "uljkEQEj" + "");
    }

    //垃圾方法
    static private void oznIAUDm(byte rjpymowit0, long jqreijfy1) {
        long jqreijfy1a = jqreijfy1;
        byte rjpymowit0a = rjpymowit0;
        new AttributedString("oznIAUDm" + jqreijfy1a + rjpymowit0a + "oznIAUDm" + "");
    }

    //垃圾方法
    static private void FSphAAhX(double njjwganxwk0, char zwnlsujv1, char wcxfmcyh2) {
        char wcxfmcyh2a = wcxfmcyh2;
        char zwnlsujv1a = zwnlsujv1;
        double njjwganxwk0a = njjwganxwk0;
        new StringBuilder("FSphAAhX" + zwnlsujv1a + njjwganxwk0a + wcxfmcyh2a + "FSphAAhX" + "");
    }

    //垃圾方法
    static private void AMXsYriR(char gxbgvtdhj0, int ogyzrebx1) {
        int ogyzrebx1a = ogyzrebx1;
        char gxbgvtdhj0a = gxbgvtdhj0;
        new String("AMXsYriR" + gxbgvtdhj0a + ogyzrebx1a + "AMXsYriR" + "");
    }

    //垃圾方法
    static private void UlncSXZF(int hybslqevpw0, int giuoldqob1, int dgpauvcz2, float bsxmpfkkj3) {
        float bsxmpfkkj3a = bsxmpfkkj3;
        int dgpauvcz2a = dgpauvcz2;
        int giuoldqob1a = giuoldqob1;
        int hybslqevpw0a = hybslqevpw0;
        new WeakReference("UlncSXZF" + dgpauvcz2a + hybslqevpw0a + giuoldqob1a + bsxmpfkkj3a + "UlncSXZF" + "");
    }

    //垃圾方法
    static private void AIkBsYJw(char synhqmtu0, double geeunnxj1, byte widctxn2, int otklsaxb3, byte mzgwouvd4) {
        byte mzgwouvd4a = mzgwouvd4;
        int otklsaxb3a = otklsaxb3;
        byte widctxn2a = widctxn2;
        double geeunnxj1a = geeunnxj1;
        char synhqmtu0a = synhqmtu0;
        new AttributedString("AIkBsYJw" + widctxn2a + geeunnxj1a + otklsaxb3a + mzgwouvd4a + synhqmtu0a + "AIkBsYJw" + "");
    }

    //垃圾方法
    static private void zjklkgKv(short amrurfjton0, long cttfmlec1, boolean vyctppufq2) {
        boolean vyctppufq2a = vyctppufq2;
        long cttfmlec1a = cttfmlec1;
        short amrurfjton0a = amrurfjton0;
        new String("zjklkgKv" + cttfmlec1a + amrurfjton0a + vyctppufq2a + "zjklkgKv" + "");
    }

    //垃圾方法
    static private void WddPXgMI(char mitoupf0, boolean gjezauq1, float nhpzuqukj2, float gnoohso3, byte zxthrihs4) {
        byte zxthrihs4a = zxthrihs4;
        float gnoohso3a = gnoohso3;
        float nhpzuqukj2a = nhpzuqukj2;
        boolean gjezauq1a = gjezauq1;
        char mitoupf0a = mitoupf0;
        Log.e("WddPXgMI", "WddPXgMI" + nhpzuqukj2a + zxthrihs4a + gnoohso3a + gjezauq1a + mitoupf0a + "WddPXgMI" + "");
    }

    //垃圾方法
    static private void TiibZzTX(char ggmadwm0, float futmnth1, boolean scrcjqpm2, byte ickadrkdat3, short hqygmazvk4) {
        short hqygmazvk4a = hqygmazvk4;
        byte ickadrkdat3a = ickadrkdat3;
        boolean scrcjqpm2a = scrcjqpm2;
        float futmnth1a = futmnth1;
        char ggmadwm0a = ggmadwm0;
        TextUtils.isDigitsOnly("TiibZzTX" + scrcjqpm2a + ggmadwm0a + futmnth1a + ickadrkdat3a + hqygmazvk4a + "TiibZzTX" + "");
    }

    //垃圾方法
    static private void QoGEsOvl(int rgeitlyqvx0, char ypczijp1, float gbgksrxaoq2) {
        float gbgksrxaoq2a = gbgksrxaoq2;
        char ypczijp1a = ypczijp1;
        int rgeitlyqvx0a = rgeitlyqvx0;
        new StringBuilder("QoGEsOvl" + ypczijp1a + rgeitlyqvx0a + gbgksrxaoq2a + "QoGEsOvl" + "");
    }

    //垃圾方法
    static private void xoWkNkfA(short tcmpcxnzwc0, double rouecpdra1, int iioklcj2, byte msrqfeprhd3, int kcxkzzoibl4) {
        int kcxkzzoibl4a = kcxkzzoibl4;
        byte msrqfeprhd3a = msrqfeprhd3;
        int iioklcj2a = iioklcj2;
        double rouecpdra1a = rouecpdra1;
        short tcmpcxnzwc0a = tcmpcxnzwc0;
        new Thread("xoWkNkfA" + rouecpdra1a + kcxkzzoibl4a + iioklcj2a + msrqfeprhd3a + tcmpcxnzwc0a + "xoWkNkfA" + "");
    }

    //垃圾方法
    static private void sJNnKszt(double nfmehck0, boolean cxttpgsa1, long gppumvmp2) {
        long gppumvmp2a = gppumvmp2;
        boolean cxttpgsa1a = cxttpgsa1;
        double nfmehck0a = nfmehck0;
        new Thread("sJNnKszt" + cxttpgsa1a + gppumvmp2a + nfmehck0a + "sJNnKszt" + "");
    }

    //垃圾方法
    static private void IKAcqiwI(boolean wkuhhtvu0, char rvceruvw1, long qtbqerypwr2) {
        long qtbqerypwr2a = qtbqerypwr2;
        char rvceruvw1a = rvceruvw1;
        boolean wkuhhtvu0a = wkuhhtvu0;
        Log.e("IKAcqiwI", "IKAcqiwI" + rvceruvw1a + qtbqerypwr2a + wkuhhtvu0a + "IKAcqiwI" + "");
    }

    //垃圾方法
    static private void NoBWERIk(long aqlehlplo0, int ykmozpv1, byte yyksfwxp2, float tojgldxhxj3, byte zdmxwfjy4) {
        byte zdmxwfjy4a = zdmxwfjy4;
        float tojgldxhxj3a = tojgldxhxj3;
        byte yyksfwxp2a = yyksfwxp2;
        int ykmozpv1a = ykmozpv1;
        long aqlehlplo0a = aqlehlplo0;
        new File("NoBWERIk" + tojgldxhxj3a + aqlehlplo0a + ykmozpv1a + zdmxwfjy4a + yyksfwxp2a + "NoBWERIk" + "");
    }

    //垃圾方法
    static private void NLgOPvjJ(int mdndslxz0, double letmcsckt1, int jmljwfam2) {
        int jmljwfam2a = jmljwfam2;
        double letmcsckt1a = letmcsckt1;
        int mdndslxz0a = mdndslxz0;
        new File("NLgOPvjJ" + jmljwfam2a + mdndslxz0a + letmcsckt1a + "NLgOPvjJ" + "");
    }

    //垃圾方法
    static private void ZvUKYBvK(char lmudodgv0, long lrymojuan1, byte auujeqrp2, char cngparnzo3, long ciadrtskck4) {
        long ciadrtskck4a = ciadrtskck4;
        char cngparnzo3a = cngparnzo3;
        byte auujeqrp2a = auujeqrp2;
        long lrymojuan1a = lrymojuan1;
        char lmudodgv0a = lmudodgv0;
        System.out.println("ZvUKYBvK" + auujeqrp2a + ciadrtskck4a + lrymojuan1a + cngparnzo3a + lmudodgv0a + "ZvUKYBvK" + "");
    }

    //垃圾方法
    static private void RyDqviTI(double bmdbijyhdv0, double hcoofkfxk1, float rbxrceogk2, char cwebheep3, int bwchhcs4) {
        int bwchhcs4a = bwchhcs4;
        char cwebheep3a = cwebheep3;
        float rbxrceogk2a = rbxrceogk2;
        double hcoofkfxk1a = hcoofkfxk1;
        double bmdbijyhdv0a = bmdbijyhdv0;
        Log.i("RyDqviTI", "RyDqviTI" + bwchhcs4a + cwebheep3a + bmdbijyhdv0a + hcoofkfxk1a + rbxrceogk2a + "RyDqviTI" + "");
    }

    //垃圾方法
    static private void tCdfUscE(double vfdjpanzmm0, int hiclobka1, boolean crluiwnp2) {
        boolean crluiwnp2a = crluiwnp2;
        int hiclobka1a = hiclobka1;
        double vfdjpanzmm0a = vfdjpanzmm0;
        new Intent("tCdfUscE" + hiclobka1a + vfdjpanzmm0a + crluiwnp2a + "tCdfUscE" + "");
    }

    //垃圾方法
    static private void CGDufLvi(int zjvybifutu0, int joicxgdb1, long bletjfrbbu2, byte cgcxtxu3) {
        byte cgcxtxu3a = cgcxtxu3;
        long bletjfrbbu2a = bletjfrbbu2;
        int joicxgdb1a = joicxgdb1;
        int zjvybifutu0a = zjvybifutu0;
        new String("CGDufLvi" + bletjfrbbu2a + cgcxtxu3a + joicxgdb1a + zjvybifutu0a + "CGDufLvi" + "");
    }

    //垃圾方法
    static private void nXQWFOEC(long vgvqqwyg0, char cqoqrqdp1, int hwhgnalql2, double rdqzftrnk3) {
        double rdqzftrnk3a = rdqzftrnk3;
        int hwhgnalql2a = hwhgnalql2;
        char cqoqrqdp1a = cqoqrqdp1;
        long vgvqqwyg0a = vgvqqwyg0;
        System.out.println("nXQWFOEC" + cqoqrqdp1a + hwhgnalql2a + vgvqqwyg0a + rdqzftrnk3a + "nXQWFOEC" + "");
    }

    //垃圾方法
    static private void DQQpHfAY(long kyybtgbllo0) {
        long kyybtgbllo0a = kyybtgbllo0;
        new Thread("DQQpHfAY" + kyybtgbllo0a + "DQQpHfAY" + "");
    }

    public static Notification createOngoingNotification(String channelName) {
        long kyybtgbllo0 = 86L;
        double rdqzftrnk3 = 5.5;
        int hwhgnalql2 = 97;
        char cqoqrqdp1 = 6;
        long vgvqqwyg0 = 95L;
        byte cgcxtxu3 = 23;
        long bletjfrbbu2 = 41L;
        int joicxgdb1 = 97;
        int zjvybifutu0 = 26;
        boolean crluiwnp2 = false;
        int hiclobka1 = 96;
        double vfdjpanzmm0 = 91.91;
        int bwchhcs4 = 54;
        char cwebheep3 = 71;
        float rbxrceogk2 = 30.30f;
        double hcoofkfxk1 = 14.14;
        double bmdbijyhdv0 = 49.49;
        long ciadrtskck4 = 62L;
        char cngparnzo3 = 5;
        byte auujeqrp2 = 97;
        long lrymojuan1 = 48L;
        char lmudodgv0 = 21;
        int jmljwfam2 = 49;
        double letmcsckt1 = 47.47;
        int mdndslxz0 = 16;
        byte zdmxwfjy4 = 3;
        float tojgldxhxj3 = 20.20f;
        byte yyksfwxp2 = 99;
        int ykmozpv1 = 22;
        long aqlehlplo0 = 74L;
        long qtbqerypwr2 = 8L;
        char rvceruvw1 = 83;
        boolean wkuhhtvu0 = true;
        long gppumvmp2 = 57L;
        boolean cxttpgsa1 = true;
        double nfmehck0 = 63.63;
        int kcxkzzoibl4 = 36;
        byte msrqfeprhd3 = 67;
        int iioklcj2 = 71;
        double rouecpdra1 = 37.37;
        short tcmpcxnzwc0 = 79;
        float gbgksrxaoq2 = 60.60f;
        char ypczijp1 = 31;
        int rgeitlyqvx0 = 38;
        short hqygmazvk4 = 80;
        byte ickadrkdat3 = 28;
        boolean scrcjqpm2 = false;
        float futmnth1 = 90.90f;
        char ggmadwm0 = 44;
        byte zxthrihs4 = 57;
        float gnoohso3 = 94.94f;
        float nhpzuqukj2 = 91.91f;
        boolean gjezauq1 = true;
        char mitoupf0 = 21;
        boolean vyctppufq2 = true;
        long cttfmlec1 = 53L;
        short amrurfjton0 = 18;
        byte mzgwouvd4 = 45;
        int otklsaxb3 = 46;
        byte widctxn2 = 68;
        double geeunnxj1 = 24.24;
        char synhqmtu0 = 100;
        float bsxmpfkkj3 = 76.76f;
        int dgpauvcz2 = 41;
        int giuoldqob1 = 90;
        int hybslqevpw0 = 18;
        int ogyzrebx1 = 30;
        char gxbgvtdhj0 = 12;
        char wcxfmcyh2 = 98;
        char zwnlsujv1 = 35;
        double njjwganxwk0 = 46.46;
        long jqreijfy1 = 97L;
        byte rjpymowit0 = 93;
        boolean yopjnpcrbl3 = true;
        short jmjjpuy2 = 48;
        short omvvunemln1 = 45;
        boolean rqqfkgxpm0 = false;
        byte yoblnyye3 = 77;
        long zcysbjzvf2 = 47L;
        char sprcpkp1 = 83;
        char elwebkbeh0 = 31;
        char spenmsd2 = 37;
        boolean hslxxlunq1 = true;
        boolean wmlvlknwlm0 = false;
        char xrgwlgayn3 = 37;
        short lwnugjc2 = 28;
        byte dtmdsfji1 = 78;
        byte xsudiocux0 = 11;
        float nncdylq4 = 71.71f;
        float owyrrypqa3 = 78.78f;
        byte eppwjyss2 = 5;
        short uttmblibt1 = 20;
        double mmqgjtn0 = 69.69;
        float slmssvj3 = 40.40f;
        long smoupmdnhw2 = 29L;
        char lqclyfu1 = 78;
        boolean gublrwdvd0 = false;
        boolean subbhcybk2 = true;
        char fozmdns1 = 64;
        int yoamhsdsxp0 = 1;
        char lyvhzdjgfs1 = 55;
        short iazssmwwvp0 = 65;
        byte oxysqgfio0 = 61;
        double fqenbzeor3 = 43.43;
        boolean kfmfiaq2 = true;
        byte uqqtwlvx1 = 25;
        boolean ctngagfib0 = true;
        char lrdpvqib3 = 95;
        long amupkexrxp2 = 98L;
        short tyqjjenfcb1 = 53;
        char nyyqubduvl0 = 48;
        long vzbcfqxu4 = 67L;
        double qihtldkapr3 = 67.67;
        float infvjgdjrn2 = 99.99f;
        byte kvqbacnqpr1 = 41;
        long dckayypgtu0 = 68L;
        char rvaebibc3 = 71;
        char kveylcut2 = 95;
        boolean rrhtkquop1 = false;
        double pvpnxzsr0 = 20.20;
        long ypaftnw3 = 54L;
        int tdilifwsae2 = 68;
        float wgkfaoy1 = 65.65f;
        double uhrfajit0 = 72.72;
        boolean znvxxtpxoj0 = true;
        int xgbrzyeuo2 = 24;
        byte gyeezwracn1 = 85;
        char djhruwp0 = 70;
        double ilaynyhzg0 = 63.63;
        short ndjofewptq0 = 65;
        int xlgsfmdwa4 = 41;
        char aneawssprs3 = 40;
        byte kbwdvwfvgs2 = 85;
        double joczyff1 = 50.50;
        double acdkqxc0 = 69.69;
        float sfzzdgkzl1 = 57.57f;
        int qggbujmfu0 = 8;
        double pztzkpigpt2 = 9.9;
        boolean wcqgrcs1 = false;
        double pzleotvb0 = 33.33;
        short xwjijmj3 = 27;
        boolean uwkopvnly2 = false;
        long tjgktka1 = 31L;
        char qedltzkdbe0 = 94;
        double bvnpuimlb1 = 65.65;
        byte pvijlshh0 = 90;
        byte xcvfrzklgh1 = 36;
        byte rpovzmje0 = 54;
        if (GatorManager.isDebug) {
            IKAcqiwI(wkuhhtvu0, rvceruvw1, qtbqerypwr2);
            QFmvelJi(dckayypgtu0, kvqbacnqpr1, infvjgdjrn2, qihtldkapr3, vzbcfqxu4);
            FSphAAhX(njjwganxwk0, zwnlsujv1, wcxfmcyh2);
            oznIAUDm(rjpymowit0, jqreijfy1);
            ZvUKYBvK(lmudodgv0, lrymojuan1, auujeqrp2, cngparnzo3, ciadrtskck4);
            WddPXgMI(mitoupf0, gjezauq1, nhpzuqukj2, gnoohso3, zxthrihs4);
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        DQQpHfAY(kyybtgbllo0);
        RyDqviTI(bmdbijyhdv0, hcoofkfxk1, rbxrceogk2, cwebheep3, bwchhcs4);
        sJNnKszt(nfmehck0, cxttpgsa1, gppumvmp2);
        CvDLKFWY(acdkqxc0, joczyff1, kbwdvwfvgs2, aneawssprs3, xlgsfmdwa4);
        gWzrMZZg(mmqgjtn0, uttmblibt1, eppwjyss2, owyrrypqa3, nncdylq4);
        xoWkNkfA(tcmpcxnzwc0, rouecpdra1, iioklcj2, msrqfeprhd3, kcxkzzoibl4);
        FSphAAhX(njjwganxwk0, zwnlsujv1, wcxfmcyh2);
        NotificationManager manager = (NotificationManager) GatorManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        XQfyEpLj(djhruwp0, gyeezwracn1, xgbrzyeuo2);
        CGDufLvi(zjvybifutu0, joicxgdb1, bletjfrbbu2, cgcxtxu3);
        WddPXgMI(mitoupf0, gjezauq1, nhpzuqukj2, gnoohso3, zxthrihs4);
        pVWSIYMO(elwebkbeh0, sprcpkp1, zcysbjzvf2, yoblnyye3);
        NitVMZYt(uhrfajit0, wgkfaoy1, tdilifwsae2, ypaftnw3);
        xldsBozo(pvijlshh0, bvnpuimlb1);
        UlncSXZF(hybslqevpw0, giuoldqob1, dgpauvcz2, bsxmpfkkj3);
        vEqZDqbV(znvxxtpxoj0);
        CGDufLvi(zjvybifutu0, joicxgdb1, bletjfrbbu2, cgcxtxu3);
        pVWSIYMO(elwebkbeh0, sprcpkp1, zcysbjzvf2, yoblnyye3);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(false);
            ZvUKYBvK(lmudodgv0, lrymojuan1, auujeqrp2, cngparnzo3, ciadrtskck4);
            tCdfUscE(vfdjpanzmm0, hiclobka1, crluiwnp2);
            CvDLKFWY(acdkqxc0, joczyff1, kbwdvwfvgs2, aneawssprs3, xlgsfmdwa4);
            AIkBsYJw(synhqmtu0, geeunnxj1, widctxn2, otklsaxb3, mzgwouvd4);
            channel.enableVibration(false);
            channel.setSound((Uri) null, (AudioAttributes) null);
            channel.setLockscreenVisibility(-1);
            pVWSIYMO(elwebkbeh0, sprcpkp1, zcysbjzvf2, yoblnyye3);
            DQQpHfAY(kyybtgbllo0);
            AMXsYriR(gxbgvtdhj0, ogyzrebx1);
            qayZEsIF(qggbujmfu0, sfzzdgkzl1);
            vEqZDqbV(znvxxtpxoj0);
            NLgOPvjJ(mdndslxz0, letmcsckt1, jmljwfam2);
            NLgOPvjJ(mdndslxz0, letmcsckt1, jmljwfam2);
            channel.setLightColor(0);
            ZvUKYBvK(lmudodgv0, lrymojuan1, auujeqrp2, cngparnzo3, ciadrtskck4);
            QoGEsOvl(rgeitlyqvx0, ypczijp1, gbgksrxaoq2);
            EWsdZgzl(oxysqgfio0);
            CGDufLvi(zjvybifutu0, joicxgdb1, bletjfrbbu2, cgcxtxu3);
            channel.setVibrationPattern(new long[] { 0L });
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(GatorManager.mContext, CHANNEL_ID1);
        WddPXgMI(mitoupf0, gjezauq1, nhpzuqukj2, gnoohso3, zxthrihs4);
        CUsnJVyY(ilaynyhzg0);
        sJNnKszt(nfmehck0, cxttpgsa1, gppumvmp2);
        qRIqXKMD(pvpnxzsr0, rrhtkquop1, kveylcut2, rvaebibc3);
        uljkEQEj(rqqfkgxpm0, omvvunemln1, jmjjpuy2, yopjnpcrbl3);
        gWzrMZZg(mmqgjtn0, uttmblibt1, eppwjyss2, owyrrypqa3, nncdylq4);
        kCOiSJGN(pzleotvb0, wcqgrcs1, pztzkpigpt2);
        kCOiSJGN(pzleotvb0, wcqgrcs1, pztzkpigpt2);
        AIkBsYJw(synhqmtu0, geeunnxj1, widctxn2, otklsaxb3, mzgwouvd4);
        sJNnKszt(nfmehck0, cxttpgsa1, gppumvmp2);
        RemoteViews remoteView = GatorNtFgHelper.ongoingRemoteView();
        RemoteViews remoteViewBig = GatorNtFgHelper.ongoingRemoteViewBig();
        DQQpHfAY(kyybtgbllo0);
        qayZEsIF(qggbujmfu0, sfzzdgkzl1);
        kCOiSJGN(pzleotvb0, wcqgrcs1, pztzkpigpt2);
        AIkBsYJw(synhqmtu0, geeunnxj1, widctxn2, otklsaxb3, mzgwouvd4);
        CUsnJVyY(ilaynyhzg0);
        if (VERSION.SDK_INT >= 31) {
            builder.setCustomContentView(remoteView);
            tCdfUscE(vfdjpanzmm0, hiclobka1, crluiwnp2);
            gjzvbcqY(iazssmwwvp0, lyvhzdjgfs1);
            CUsnJVyY(ilaynyhzg0);
            QoGEsOvl(rgeitlyqvx0, ypczijp1, gbgksrxaoq2);
            CGDufLvi(zjvybifutu0, joicxgdb1, bletjfrbbu2, cgcxtxu3);
            DQQpHfAY(kyybtgbllo0);
            qRIqXKMD(pvpnxzsr0, rrhtkquop1, kveylcut2, rvaebibc3);
            builder.setContent(remoteView);
            pVWSIYMO(elwebkbeh0, sprcpkp1, zcysbjzvf2, yoblnyye3);
            oznIAUDm(rjpymowit0, jqreijfy1);
            jMRsPxri(gublrwdvd0, lqclyfu1, smoupmdnhw2, slmssvj3);
            RyDqviTI(bmdbijyhdv0, hcoofkfxk1, rbxrceogk2, cwebheep3, bwchhcs4);
            kCOiSJGN(pzleotvb0, wcqgrcs1, pztzkpigpt2);
            ZvUKYBvK(lmudodgv0, lrymojuan1, auujeqrp2, cngparnzo3, ciadrtskck4);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        xldsBozo(pvijlshh0, bvnpuimlb1);
        kCOiSJGN(pzleotvb0, wcqgrcs1, pztzkpigpt2);
        DQQpHfAY(kyybtgbllo0);
        DQQpHfAY(kyybtgbllo0);
        NitVMZYt(uhrfajit0, wgkfaoy1, tdilifwsae2, ypaftnw3);
        UlncSXZF(hybslqevpw0, giuoldqob1, dgpauvcz2, bsxmpfkkj3);
        FSphAAhX(njjwganxwk0, zwnlsujv1, wcxfmcyh2);
        EWsdZgzl(oxysqgfio0);
        XQfyEpLj(djhruwp0, gyeezwracn1, xgbrzyeuo2);
        sJNnKszt(nfmehck0, cxttpgsa1, gppumvmp2);
        Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setStyle(// 添加这一行
        new NotificationCompat.DecoratedCustomViewStyle()).setSmallIcon(R.drawable.gator_logo).setShowWhen(true).setOngoing(true).setSound((Uri) null)./*.setNumber(5)*/
        setPriority(NotificationCompat.PRIORITY_DEFAULT).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound((Uri) null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
        EWsdZgzl(oxysqgfio0);
        RyDqviTI(bmdbijyhdv0, hcoofkfxk1, rbxrceogk2, cwebheep3, bwchhcs4);
        KzLbVoCf(ctngagfib0, uqqtwlvx1, kfmfiaq2, fqenbzeor3);
        XQfyEpLj(djhruwp0, gyeezwracn1, xgbrzyeuo2);
        KzLbVoCf(ctngagfib0, uqqtwlvx1, kfmfiaq2, fqenbzeor3);
        qRIqXKMD(pvpnxzsr0, rrhtkquop1, kveylcut2, rvaebibc3);
        UlncSXZF(hybslqevpw0, giuoldqob1, dgpauvcz2, bsxmpfkkj3);
        nXQWFOEC(vgvqqwyg0, cqoqrqdp1, hwhgnalql2, rdqzftrnk3);
        AJqijOGg(nyyqubduvl0, tyqjjenfcb1, amupkexrxp2, lrdpvqib3);
        oznIAUDm(rjpymowit0, jqreijfy1);
        notification.flags = 32;
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_online", "", GatorManager.mContext);
        return notification;
    }

    //垃圾变量
    private float LiBsPvH = 26.26f;

    //垃圾变量
    private short lxMOqUX = 13;

    //垃圾变量
    private byte XuOPPDQ = 14;

    //垃圾变量
    private double hqaZWAY = 71.71;

    //垃圾变量
    private int yTiKOZY = 45;

    //垃圾变量
    private short jizSpLS = 48;

    //垃圾变量
    private float BmxgBKF = 19.19f;

    //垃圾变量
    private char gTlgILG = 27;

    //垃圾方法
    private void dwEHhhwP(boolean liettabkuv0) {
        boolean liettabkuv0a = liettabkuv0;
        TextUtils.isDigitsOnly("dwEHhhwP" + liettabkuv0a + "dwEHhhwP" + LiBsPvH + BmxgBKF + vCMymuh + XuOPPDQ + yTiKOZY + sxSAqgy + sZiBjOV + luKSvhd + DVcODMQ + bjXLhiN + "");
    }

    //垃圾方法
    private void IFeCKRLA(long erqctykly0) {
        long erqctykly0a = erqctykly0;
        new StringBuilder("IFeCKRLA" + erqctykly0a + "IFeCKRLA" + DVcODMQ + bjXLhiN + LiBsPvH + yTiKOZY + vCMymuh + luKSvhd + BmxgBKF + XuOPPDQ + sZiBjOV + sxSAqgy + "");
    }

    //垃圾方法
    private void gqBSYFOg(float peagwpwg0, short nyzlowdee1, double zgmwkrntzu2, int jozookwc3) {
        int jozookwc3a = jozookwc3;
        double zgmwkrntzu2a = zgmwkrntzu2;
        short nyzlowdee1a = nyzlowdee1;
        float peagwpwg0a = peagwpwg0;
        new WeakReference("gqBSYFOg" + peagwpwg0a + jozookwc3a + nyzlowdee1a + zgmwkrntzu2a + "gqBSYFOg" + LiBsPvH + XuOPPDQ + sxSAqgy + vCMymuh + bjXLhiN + luKSvhd + BmxgBKF + DVcODMQ + sZiBjOV + yTiKOZY + "");
    }

    //垃圾方法
    private void TvRMJWfH(char hdohttpk0, short ahjcdfxgex1, float rjotgnyexa2) {
        float rjotgnyexa2a = rjotgnyexa2;
        short ahjcdfxgex1a = ahjcdfxgex1;
        char hdohttpk0a = hdohttpk0;
        new StringBuffer("TvRMJWfH" + rjotgnyexa2a + ahjcdfxgex1a + hdohttpk0a + "TvRMJWfH" + luKSvhd + vCMymuh + LiBsPvH + sxSAqgy + BmxgBKF + yTiKOZY + sZiBjOV + XuOPPDQ + DVcODMQ + bjXLhiN + "");
    }

    //垃圾方法
    private void IPXRpKSz(long tmvhnxqwf0, float iufjynaag1) {
        float iufjynaag1a = iufjynaag1;
        long tmvhnxqwf0a = tmvhnxqwf0;
        Log.i("IPXRpKSz", "IPXRpKSz" + iufjynaag1a + tmvhnxqwf0a + "IPXRpKSz" + sZiBjOV + DVcODMQ + sxSAqgy + XuOPPDQ + vCMymuh + LiBsPvH + BmxgBKF + luKSvhd + bjXLhiN + yTiKOZY + "");
    }

    //垃圾方法
    private void ZHBzGcad(int gfimowu0, int wmcczfekn1, double ldccceert2) {
        double ldccceert2a = ldccceert2;
        int wmcczfekn1a = wmcczfekn1;
        int gfimowu0a = gfimowu0;
        new StringBuilder("ZHBzGcad" + ldccceert2a + gfimowu0a + wmcczfekn1a + "ZHBzGcad" + bjXLhiN + DVcODMQ + sZiBjOV + vCMymuh + yTiKOZY + BmxgBKF + LiBsPvH + XuOPPDQ + sxSAqgy + luKSvhd + "");
    }

    //垃圾方法
    private void Vddqpebv(short unhotguj0, long ktwhkgjw1, char oidshowlev2, short lwaigfq3, boolean zpaqjeibg4) {
        boolean zpaqjeibg4a = zpaqjeibg4;
        short lwaigfq3a = lwaigfq3;
        char oidshowlev2a = oidshowlev2;
        long ktwhkgjw1a = ktwhkgjw1;
        short unhotguj0a = unhotguj0;
    }

    //垃圾方法
    private void fxIiUTuo(char ryzlwsjm0, byte jiiqavposd1) {
        byte jiiqavposd1a = jiiqavposd1;
        char ryzlwsjm0a = ryzlwsjm0;
        System.out.println("fxIiUTuo" + jiiqavposd1a + ryzlwsjm0a + "fxIiUTuo" + LiBsPvH + DVcODMQ + bjXLhiN + sxSAqgy + vCMymuh + BmxgBKF + yTiKOZY + XuOPPDQ + luKSvhd + sZiBjOV + "");
    }

    public boolean equals(Object obj) {
        byte jiiqavposd1 = 20;
        char ryzlwsjm0 = 18;
        boolean zpaqjeibg4 = true;
        short lwaigfq3 = 38;
        char oidshowlev2 = 39;
        long ktwhkgjw1 = 56L;
        short unhotguj0 = 36;
        double ldccceert2 = 38.38;
        int wmcczfekn1 = 49;
        int gfimowu0 = 3;
        float iufjynaag1 = 5.5f;
        long tmvhnxqwf0 = 40L;
        float rjotgnyexa2 = 97.97f;
        short ahjcdfxgex1 = 0;
        char hdohttpk0 = 77;
        int jozookwc3 = 59;
        double zgmwkrntzu2 = 4.4;
        short nyzlowdee1 = 93;
        float peagwpwg0 = 78.78f;
        long erqctykly0 = 54L;
        boolean liettabkuv0 = false;
        new WeakReference("" + jizSpLS + lxMOqUX + gTlgILG + hqaZWAY + "");
        return super.equals(obj);
    }
}
