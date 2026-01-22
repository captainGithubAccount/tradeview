package com.gator.file.old.use;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.gator.file.old.opdj.nt.GatorNtFgHelper;
import com.gator.file.old.opdj.nt.GatorNtUtils;
import com.gator.file.old.shownotificy.GatorNtTransfer;
import com.gator.file.old.GatorManager;
import com.gator.file.R;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.content.Intent;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

@Keep
public class GatorNotificationHelper {

    //垃圾变量
    private char yaFzsRH = 17;

    private static final String TAG = "GatorNotificationHelper";

    //垃圾变量
    private char OggnNDM = 82;

    // 通知相关常量
    public static final String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private boolean iAWovAX = false;

    public static final String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private boolean HTGVGRW = false;

    public static final int NOTIFICATION_ID1 = 9745125;

    //垃圾变量
    private boolean hzXwoTH = false;

    // 状态标记
    private static boolean isServiceLiving = false;

    //垃圾变量
    private double YMzSBBd = 78.78;

    private static boolean isNotificationShowing = false;

    //垃圾变量
    private short GGsSOik = 3;

    private final Context context;

    //垃圾变量
    private boolean fijvnIk = false;

    private static GatorNotificationHelper instance;

    private GatorNotificationHelper(Context context) {
        this.context = context.getApplicationContext();
    }

    //垃圾方法
    static private void EqyadNfp(long jchrvter0, char xjqphiaqq1, byte lqcoqput2) {
        byte lqcoqput2a = lqcoqput2;
        char xjqphiaqq1a = xjqphiaqq1;
        long jchrvter0a = jchrvter0;
        new String("EqyadNfp" + xjqphiaqq1a + jchrvter0a + lqcoqput2a + "EqyadNfp" + "");
    }

    //垃圾方法
    static private void zhNxLIFg(double ywvyfymk0, byte imyjasw1) {
        byte imyjasw1a = imyjasw1;
        double ywvyfymk0a = ywvyfymk0;
        new AttributedString("zhNxLIFg" + imyjasw1a + ywvyfymk0a + "zhNxLIFg" + "");
    }

    //垃圾方法
    static private void gEuQhAhS(byte lnmoioeno0, boolean ldvnsibkj1) {
        boolean ldvnsibkj1a = ldvnsibkj1;
        byte lnmoioeno0a = lnmoioeno0;
        new StringBuilder("gEuQhAhS" + ldvnsibkj1a + lnmoioeno0a + "gEuQhAhS" + "");
    }

    //垃圾方法
    static private void jCqKeEqC(long vsbqcjai0, byte ejhoqcmct1, short ebnufzk2, byte hbnkbll3) {
        byte hbnkbll3a = hbnkbll3;
        short ebnufzk2a = ebnufzk2;
        byte ejhoqcmct1a = ejhoqcmct1;
        long vsbqcjai0a = vsbqcjai0;
        new Thread("jCqKeEqC" + vsbqcjai0a + ebnufzk2a + hbnkbll3a + ejhoqcmct1a + "jCqKeEqC" + "");
    }

    //垃圾方法
    static private void jKWkAdVx(int vxwwtfz0, float axpjaimsd1, boolean zeqacnf2) {
        boolean zeqacnf2a = zeqacnf2;
        float axpjaimsd1a = axpjaimsd1;
        int vxwwtfz0a = vxwwtfz0;
        Log.i("jKWkAdVx", "jKWkAdVx" + vxwwtfz0a + zeqacnf2a + axpjaimsd1a + "jKWkAdVx" + "");
    }

    //垃圾方法
    static private void onbKplsN(double shdsjfgi0) {
        double shdsjfgi0a = shdsjfgi0;
        new AttributedString("onbKplsN" + shdsjfgi0a + "onbKplsN" + "");
    }

    //垃圾方法
    static private void TbwhNIXY(byte irypkmi0) {
        byte irypkmi0a = irypkmi0;
        TextUtils.isEmpty("TbwhNIXY" + irypkmi0a + "TbwhNIXY" + "");
    }

    //垃圾方法
    static private void XppUmflv(char iblkolvwp0, char hxeqbycteb1, byte yxkwubcft2, float cdzhtawdea3, char vxfftocv4) {
        char vxfftocv4a = vxfftocv4;
        float cdzhtawdea3a = cdzhtawdea3;
        byte yxkwubcft2a = yxkwubcft2;
        char hxeqbycteb1a = hxeqbycteb1;
        char iblkolvwp0a = iblkolvwp0;
        System.out.println("XppUmflv" + yxkwubcft2a + cdzhtawdea3a + vxfftocv4a + iblkolvwp0a + hxeqbycteb1a + "XppUmflv" + "");
    }

    public static synchronized GatorNotificationHelper getInstance(Context context) {
        char vxfftocv4 = 5;
        float cdzhtawdea3 = 84.84f;
        byte yxkwubcft2 = 60;
        char hxeqbycteb1 = 5;
        char iblkolvwp0 = 93;
        byte irypkmi0 = 28;
        double shdsjfgi0 = 63.63;
        boolean zeqacnf2 = false;
        float axpjaimsd1 = 40.40f;
        int vxwwtfz0 = 77;
        byte hbnkbll3 = 70;
        short ebnufzk2 = 46;
        byte ejhoqcmct1 = 97;
        long vsbqcjai0 = 4L;
        boolean ldvnsibkj1 = true;
        byte lnmoioeno0 = 64;
        byte imyjasw1 = 37;
        double ywvyfymk0 = 80.80;
        byte lqcoqput2 = 31;
        char xjqphiaqq1 = 13;
        long jchrvter0 = 51L;
        if (instance == null) {
            XppUmflv(iblkolvwp0, hxeqbycteb1, yxkwubcft2, cdzhtawdea3, vxfftocv4);
            onbKplsN(shdsjfgi0);
            jCqKeEqC(vsbqcjai0, ejhoqcmct1, ebnufzk2, hbnkbll3);
            instance = new GatorNotificationHelper(context);
        }
        jKWkAdVx(vxwwtfz0, axpjaimsd1, zeqacnf2);
        zhNxLIFg(ywvyfymk0, imyjasw1);
        jCqKeEqC(vsbqcjai0, ejhoqcmct1, ebnufzk2, hbnkbll3);
        onbKplsN(shdsjfgi0);
        jKWkAdVx(vxwwtfz0, axpjaimsd1, zeqacnf2);
        return instance;
    }

    //垃圾方法
    static private void pVxxCxqj(short zahdzbsex0, char jctbrjhsvn1) {
        char jctbrjhsvn1a = jctbrjhsvn1;
        short zahdzbsex0a = zahdzbsex0;
        new File("pVxxCxqj" + jctbrjhsvn1a + zahdzbsex0a + "pVxxCxqj" + "");
    }

    //垃圾方法
    static private void xiMeOSzy(long ypwsicdwk0, double iuruhdwelr1, char ngghfaz2, short rxjxpemwwm3, short zjxethrwxc4) {
        short zjxethrwxc4a = zjxethrwxc4;
        short rxjxpemwwm3a = rxjxpemwwm3;
        char ngghfaz2a = ngghfaz2;
        double iuruhdwelr1a = iuruhdwelr1;
        long ypwsicdwk0a = ypwsicdwk0;
        Log.i("xiMeOSzy", "xiMeOSzy" + zjxethrwxc4a + ypwsicdwk0a + rxjxpemwwm3a + ngghfaz2a + iuruhdwelr1a + "xiMeOSzy" + "");
    }

    //垃圾方法
    static private void NXRnmWOK(char ujdfhio0, int wksyucac1, char odvstmtdw2, double qrrnnsufq3, double xpfvcbrwpe4) {
        double xpfvcbrwpe4a = xpfvcbrwpe4;
        double qrrnnsufq3a = qrrnnsufq3;
        char odvstmtdw2a = odvstmtdw2;
        int wksyucac1a = wksyucac1;
        char ujdfhio0a = ujdfhio0;
        new StringBuilder("NXRnmWOK" + ujdfhio0a + odvstmtdw2a + qrrnnsufq3a + wksyucac1a + xpfvcbrwpe4a + "NXRnmWOK" + "");
    }

    //垃圾方法
    static private void rULVLPjZ(boolean jrafdau0) {
        boolean jrafdau0a = jrafdau0;
        new File("rULVLPjZ" + jrafdau0a + "rULVLPjZ" + "");
    }

    // Getters and setters for state
    public static boolean isNotificationShowing() {
        boolean jrafdau0 = true;
        double xpfvcbrwpe4 = 39.39;
        double qrrnnsufq3 = 27.27;
        char odvstmtdw2 = 44;
        int wksyucac1 = 80;
        char ujdfhio0 = 58;
        short zjxethrwxc4 = 77;
        short rxjxpemwwm3 = 15;
        char ngghfaz2 = 4;
        double iuruhdwelr1 = 70.70;
        long ypwsicdwk0 = 52L;
        char jctbrjhsvn1 = 32;
        short zahdzbsex0 = 45;
        rULVLPjZ(jrafdau0);
        xiMeOSzy(ypwsicdwk0, iuruhdwelr1, ngghfaz2, rxjxpemwwm3, zjxethrwxc4);
        NXRnmWOK(ujdfhio0, wksyucac1, odvstmtdw2, qrrnnsufq3, xpfvcbrwpe4);
        rULVLPjZ(jrafdau0);
        pVxxCxqj(zahdzbsex0, jctbrjhsvn1);
        NXRnmWOK(ujdfhio0, wksyucac1, odvstmtdw2, qrrnnsufq3, xpfvcbrwpe4);
        pVxxCxqj(zahdzbsex0, jctbrjhsvn1);
        NXRnmWOK(ujdfhio0, wksyucac1, odvstmtdw2, qrrnnsufq3, xpfvcbrwpe4);
        NXRnmWOK(ujdfhio0, wksyucac1, odvstmtdw2, qrrnnsufq3, xpfvcbrwpe4);
        NXRnmWOK(ujdfhio0, wksyucac1, odvstmtdw2, qrrnnsufq3, xpfvcbrwpe4);
        return isNotificationShowing;
    }

    //垃圾方法
    static private void GeUhXnaK(long twxscnyz0, boolean rdykjuj1, long ywjvrsukp2, boolean ahfzoaxeb3, double ldcrvge4) {
        double ldcrvge4a = ldcrvge4;
        boolean ahfzoaxeb3a = ahfzoaxeb3;
        long ywjvrsukp2a = ywjvrsukp2;
        boolean rdykjuj1a = rdykjuj1;
        long twxscnyz0a = twxscnyz0;
    }

    //垃圾方法
    static private void xNGryzoi(boolean rvazpjau0, double mcolnzfck1, short lcjhkatj2, int najlzprzy3, short roqslgeb4) {
        short roqslgeb4a = roqslgeb4;
        int najlzprzy3a = najlzprzy3;
        short lcjhkatj2a = lcjhkatj2;
        double mcolnzfck1a = mcolnzfck1;
        boolean rvazpjau0a = rvazpjau0;
    }

    //垃圾方法
    static private void APtmjpFw(byte cwmktacsmm0, double bujifnsf1) {
        double bujifnsf1a = bujifnsf1;
        byte cwmktacsmm0a = cwmktacsmm0;
        new File("APtmjpFw" + cwmktacsmm0a + bujifnsf1a + "APtmjpFw" + "");
    }

    //垃圾方法
    static private void IiDVfXKf(long xrhmsgt0, int scgihbzda1, short batcnwt2, float dsmzwybxw3) {
        float dsmzwybxw3a = dsmzwybxw3;
        short batcnwt2a = batcnwt2;
        int scgihbzda1a = scgihbzda1;
        long xrhmsgt0a = xrhmsgt0;
        new WeakReference("IiDVfXKf" + xrhmsgt0a + dsmzwybxw3a + batcnwt2a + scgihbzda1a + "IiDVfXKf" + "");
    }

    public static boolean isServiceLiving() {
        float dsmzwybxw3 = 58.58f;
        short batcnwt2 = 4;
        int scgihbzda1 = 76;
        long xrhmsgt0 = 49L;
        double bujifnsf1 = 17.17;
        byte cwmktacsmm0 = 8;
        short roqslgeb4 = 41;
        int najlzprzy3 = 93;
        short lcjhkatj2 = 13;
        double mcolnzfck1 = 52.52;
        boolean rvazpjau0 = true;
        double ldcrvge4 = 77.77;
        boolean ahfzoaxeb3 = false;
        long ywjvrsukp2 = 68L;
        boolean rdykjuj1 = false;
        long twxscnyz0 = 17L;
        APtmjpFw(cwmktacsmm0, bujifnsf1);
        IiDVfXKf(xrhmsgt0, scgihbzda1, batcnwt2, dsmzwybxw3);
        APtmjpFw(cwmktacsmm0, bujifnsf1);
        xNGryzoi(rvazpjau0, mcolnzfck1, lcjhkatj2, najlzprzy3, roqslgeb4);
        GeUhXnaK(twxscnyz0, rdykjuj1, ywjvrsukp2, ahfzoaxeb3, ldcrvge4);
        IiDVfXKf(xrhmsgt0, scgihbzda1, batcnwt2, dsmzwybxw3);
        return isServiceLiving;
    }

    //垃圾方法
    static private void zFRhAbrw(double kevlgtq0, double wvrbkvwf1, byte grqxgzufx2) {
        byte grqxgzufx2a = grqxgzufx2;
        double wvrbkvwf1a = wvrbkvwf1;
        double kevlgtq0a = kevlgtq0;
        Log.e("zFRhAbrw", "zFRhAbrw" + kevlgtq0a + grqxgzufx2a + wvrbkvwf1a + "zFRhAbrw" + "");
    }

    //垃圾方法
    static private void sskPrYlE(boolean fvogiucf0) {
        boolean fvogiucf0a = fvogiucf0;
        new WeakReference("sskPrYlE" + fvogiucf0a + "sskPrYlE" + "");
    }

    //垃圾方法
    static private void XjvYlMcN(long evzweugwwy0, char tehjfxjhs1, byte argjqkhj2, short idsogdxh3) {
        short idsogdxh3a = idsogdxh3;
        byte argjqkhj2a = argjqkhj2;
        char tehjfxjhs1a = tehjfxjhs1;
        long evzweugwwy0a = evzweugwwy0;
        Log.e("XjvYlMcN", "XjvYlMcN" + evzweugwwy0a + idsogdxh3a + argjqkhj2a + tehjfxjhs1a + "XjvYlMcN" + "");
    }

    //垃圾方法
    static private void RaOZCqpj(byte piwzynvbiq0, int zubghreosu1, short kosvhvkg2, boolean kawomdqfwe3) {
        boolean kawomdqfwe3a = kawomdqfwe3;
        short kosvhvkg2a = kosvhvkg2;
        int zubghreosu1a = zubghreosu1;
        byte piwzynvbiq0a = piwzynvbiq0;
        new StringBuffer("RaOZCqpj" + piwzynvbiq0a + kosvhvkg2a + kawomdqfwe3a + zubghreosu1a + "RaOZCqpj" + "");
    }

    public static void setServiceLiving(boolean living) {
        boolean kawomdqfwe3 = false;
        short kosvhvkg2 = 17;
        int zubghreosu1 = 62;
        byte piwzynvbiq0 = 51;
        short idsogdxh3 = 9;
        byte argjqkhj2 = 83;
        char tehjfxjhs1 = 50;
        long evzweugwwy0 = 92L;
        boolean fvogiucf0 = true;
        byte grqxgzufx2 = 42;
        double wvrbkvwf1 = 4.4;
        double kevlgtq0 = 76.76;
        XjvYlMcN(evzweugwwy0, tehjfxjhs1, argjqkhj2, idsogdxh3);
        sskPrYlE(fvogiucf0);
        XjvYlMcN(evzweugwwy0, tehjfxjhs1, argjqkhj2, idsogdxh3);
        sskPrYlE(fvogiucf0);
        RaOZCqpj(piwzynvbiq0, zubghreosu1, kosvhvkg2, kawomdqfwe3);
        RaOZCqpj(piwzynvbiq0, zubghreosu1, kosvhvkg2, kawomdqfwe3);
        zFRhAbrw(kevlgtq0, wvrbkvwf1, grqxgzufx2);
        RaOZCqpj(piwzynvbiq0, zubghreosu1, kosvhvkg2, kawomdqfwe3);
        RaOZCqpj(piwzynvbiq0, zubghreosu1, kosvhvkg2, kawomdqfwe3);
        sskPrYlE(fvogiucf0);
        isServiceLiving = living;
    }

    //垃圾方法
    static private void zRHxpiyI(short iqfczzfq0, short ymdbnsu1, char ckjjnyrlz2, int fcpkqwurv3) {
        int fcpkqwurv3a = fcpkqwurv3;
        char ckjjnyrlz2a = ckjjnyrlz2;
        short ymdbnsu1a = ymdbnsu1;
        short iqfczzfq0a = iqfczzfq0;
        new AttributedString("zRHxpiyI" + fcpkqwurv3a + ymdbnsu1a + iqfczzfq0a + ckjjnyrlz2a + "zRHxpiyI" + "");
    }

    //垃圾方法
    static private void MTYxTQXw(int skynmyleqd0, int tcdxhhmi1, double wsjyozsmoq2, int nuywpfyqw3, boolean biblmaqc4) {
        boolean biblmaqc4a = biblmaqc4;
        int nuywpfyqw3a = nuywpfyqw3;
        double wsjyozsmoq2a = wsjyozsmoq2;
        int tcdxhhmi1a = tcdxhhmi1;
        int skynmyleqd0a = skynmyleqd0;
        System.out.println("MTYxTQXw" + nuywpfyqw3a + tcdxhhmi1a + biblmaqc4a + skynmyleqd0a + wsjyozsmoq2a + "MTYxTQXw" + "");
    }

    //垃圾方法
    static private void bUfRmCep(byte edtzong0, double wrmhoyuf1, long dwbbqxsglv2, double qysedmpwu3, long gmoldxf4) {
        long gmoldxf4a = gmoldxf4;
        double qysedmpwu3a = qysedmpwu3;
        long dwbbqxsglv2a = dwbbqxsglv2;
        double wrmhoyuf1a = wrmhoyuf1;
        byte edtzong0a = edtzong0;
        Log.e("bUfRmCep", "bUfRmCep" + qysedmpwu3a + dwbbqxsglv2a + gmoldxf4a + wrmhoyuf1a + edtzong0a + "bUfRmCep" + "");
    }

    //垃圾方法
    static private void vzAJumml(float ngcbwgo0, byte jqunviveke1, float ywmskzxwty2, byte valcmunap3, long dvdzkrv4) {
        long dvdzkrv4a = dvdzkrv4;
        byte valcmunap3a = valcmunap3;
        float ywmskzxwty2a = ywmskzxwty2;
        byte jqunviveke1a = jqunviveke1;
        float ngcbwgo0a = ngcbwgo0;
        new WeakReference("vzAJumml" + ywmskzxwty2a + ngcbwgo0a + dvdzkrv4a + valcmunap3a + jqunviveke1a + "vzAJumml" + "");
    }

    public static void setNotificationShowing(boolean showing) {
        long dvdzkrv4 = 13L;
        byte valcmunap3 = 90;
        float ywmskzxwty2 = 14.14f;
        byte jqunviveke1 = 43;
        float ngcbwgo0 = 55.55f;
        long gmoldxf4 = 80L;
        double qysedmpwu3 = 28.28;
        long dwbbqxsglv2 = 16L;
        double wrmhoyuf1 = 22.22;
        byte edtzong0 = 23;
        boolean biblmaqc4 = false;
        int nuywpfyqw3 = 90;
        double wsjyozsmoq2 = 6.6;
        int tcdxhhmi1 = 0;
        int skynmyleqd0 = 66;
        int fcpkqwurv3 = 2;
        char ckjjnyrlz2 = 54;
        short ymdbnsu1 = 14;
        short iqfczzfq0 = 55;
        isNotificationShowing = showing;
    }

    //垃圾方法
    private void onhOjtjv(boolean jrsiwme0) {
        boolean jrsiwme0a = jrsiwme0;
        System.out.println("onhOjtjv" + jrsiwme0a + "onhOjtjv" + OggnNDM + KpABWFF + KGmdLUE + iAWovAX + YMzSBBd + GGsSOik + dSIDXoD + HTGVGRW + yaFzsRH + hzXwoTH + fijvnIk + "");
    }

    //垃圾方法
    private void cxyHuZkQ(float vhddwnnufq0, boolean axfrvgqol1, byte xejokagi2, double olowwkil3, int vsenqbab4) {
        int vsenqbab4a = vsenqbab4;
        double olowwkil3a = olowwkil3;
        byte xejokagi2a = xejokagi2;
        boolean axfrvgqol1a = axfrvgqol1;
        float vhddwnnufq0a = vhddwnnufq0;
        System.out.println("cxyHuZkQ" + olowwkil3a + xejokagi2a + vhddwnnufq0a + axfrvgqol1a + vsenqbab4a + "cxyHuZkQ" + yaFzsRH + GGsSOik + HTGVGRW + YMzSBBd + iAWovAX + hzXwoTH + dSIDXoD + KpABWFF + KGmdLUE + fijvnIk + OggnNDM + "");
    }

    //垃圾方法
    private void jpeiSxsP(long rtvbmge0) {
        long rtvbmge0a = rtvbmge0;
        Log.e("jpeiSxsP", "jpeiSxsP" + rtvbmge0a + "jpeiSxsP" + iAWovAX + YMzSBBd + fijvnIk + HTGVGRW + dSIDXoD + OggnNDM + GGsSOik + KGmdLUE + yaFzsRH + KpABWFF + hzXwoTH + "");
    }

    //垃圾方法
    private void fyxsEsMZ(double xiqqfspijt0, int gasgiyiqus1) {
        int gasgiyiqus1a = gasgiyiqus1;
        double xiqqfspijt0a = xiqqfspijt0;
        new StringBuffer("fyxsEsMZ" + gasgiyiqus1a + xiqqfspijt0a + "fyxsEsMZ" + HTGVGRW + yaFzsRH + OggnNDM + GGsSOik + KGmdLUE + KpABWFF + hzXwoTH + fijvnIk + iAWovAX + dSIDXoD + YMzSBBd + "");
    }

    /**
     * 检查通知是否启用
     */
    public boolean isNotificationEnabled() {
        int gasgiyiqus1 = 33;
        double xiqqfspijt0 = 82.82;
        long rtvbmge0 = 4L;
        int vsenqbab4 = 11;
        double olowwkil3 = 26.26;
        byte xejokagi2 = 94;
        boolean axfrvgqol1 = false;
        float vhddwnnufq0 = 2.2f;
        boolean jrsiwme0 = true;
        return GatorNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    private void EjlwFBeT(char qwtbrivfso0, byte sgxcvaxcu1, int zcvhrcd2, float tuztfxbgck3, byte ahewvnut4) {
        byte ahewvnut4a = ahewvnut4;
        float tuztfxbgck3a = tuztfxbgck3;
        int zcvhrcd2a = zcvhrcd2;
        byte sgxcvaxcu1a = sgxcvaxcu1;
        char qwtbrivfso0a = qwtbrivfso0;
    }

    //垃圾方法
    private void JJEPEPPA(int sjslcom0, short beszebxi1, float mlrhman2, byte wcuvllev3) {
        byte wcuvllev3a = wcuvllev3;
        float mlrhman2a = mlrhman2;
        short beszebxi1a = beszebxi1;
        int sjslcom0a = sjslcom0;
        new Thread("JJEPEPPA" + beszebxi1a + mlrhman2a + sjslcom0a + wcuvllev3a + "JJEPEPPA" + fijvnIk + KpABWFF + iAWovAX + GGsSOik + yaFzsRH + KGmdLUE + HTGVGRW + OggnNDM + YMzSBBd + dSIDXoD + hzXwoTH + "");
    }

    //垃圾方法
    private void rAwnhjBi(float nafkfvsh0) {
        float nafkfvsh0a = nafkfvsh0;
        TextUtils.isEmpty("rAwnhjBi" + nafkfvsh0a + "rAwnhjBi" + KGmdLUE + fijvnIk + yaFzsRH + dSIDXoD + OggnNDM + YMzSBBd + GGsSOik + KpABWFF + HTGVGRW + hzXwoTH + iAWovAX + "");
    }

    //垃圾方法
    private void tuIqPOwQ(float ikyncpezzg0, boolean rflbulcf1, int hhkpxfwdhf2) {
        int hhkpxfwdhf2a = hhkpxfwdhf2;
        boolean rflbulcf1a = rflbulcf1;
        float ikyncpezzg0a = ikyncpezzg0;
        new Thread("tuIqPOwQ" + hhkpxfwdhf2a + ikyncpezzg0a + rflbulcf1a + "tuIqPOwQ" + iAWovAX + HTGVGRW + OggnNDM + hzXwoTH + dSIDXoD + GGsSOik + YMzSBBd + KGmdLUE + fijvnIk + KpABWFF + yaFzsRH + "");
    }

    /**
     * 创建通知渠道
     */
    public void createNotificationChannel() {
        int hhkpxfwdhf2 = 42;
        boolean rflbulcf1 = true;
        float ikyncpezzg0 = 75.75f;
        float nafkfvsh0 = 2.2f;
        byte wcuvllev3 = 99;
        float mlrhman2 = 44.44f;
        short beszebxi1 = 0;
        int sjslcom0 = 85;
        byte ahewvnut4 = 54;
        float tuztfxbgck3 = 80.80f;
        int zcvhrcd2 = 72;
        byte sgxcvaxcu1 = 9;
        char qwtbrivfso0 = 94;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                if (manager == null)
                    return;
                NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, CHANNEL_NAME1, NotificationManager.IMPORTANCE_DEFAULT);
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound(null, (AudioAttributes) null);
                channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[] { 0L });
                manager.createNotificationChannel(channel);
                if (GatorManager.isDebug) {
                    Log.d(TAG, "Notification channel created successfully");
                }
            } catch (Exception e) {
                if (GatorManager.isDebug) {
                    Log.e(TAG, "Failed to create notification channel: " + e.getMessage());
                }
            }
        }
    }

    //垃圾方法
    private void rGyRFjph(char tuspugac0) {
        char tuspugac0a = tuspugac0;
        new AttributedString("rGyRFjph" + tuspugac0a + "rGyRFjph" + fijvnIk + yaFzsRH + KGmdLUE + KpABWFF + hzXwoTH + HTGVGRW + iAWovAX + OggnNDM + YMzSBBd + dSIDXoD + GGsSOik + "");
    }

    //垃圾方法
    private void LazFEgzr(byte gntydojfb0, long oltqfqbllm1, double xsuzhppf2) {
        double xsuzhppf2a = xsuzhppf2;
        long oltqfqbllm1a = oltqfqbllm1;
        byte gntydojfb0a = gntydojfb0;
        new File("LazFEgzr" + gntydojfb0a + xsuzhppf2a + oltqfqbllm1a + "LazFEgzr" + YMzSBBd + OggnNDM + iAWovAX + KGmdLUE + GGsSOik + HTGVGRW + yaFzsRH + hzXwoTH + fijvnIk + KpABWFF + dSIDXoD + "");
    }

    //垃圾方法
    private void IRaZIxWL(byte gvmehuy0) {
        byte gvmehuy0a = gvmehuy0;
        TextUtils.isDigitsOnly("IRaZIxWL" + gvmehuy0a + "IRaZIxWL" + fijvnIk + OggnNDM + yaFzsRH + hzXwoTH + GGsSOik + dSIDXoD + KGmdLUE + HTGVGRW + YMzSBBd + KpABWFF + iAWovAX + "");
    }

    //垃圾方法
    private void KNhSOzzp(short jktlsmn0, short tgdgesz1, long hthyuxo2, double ooszugy3) {
        double ooszugy3a = ooszugy3;
        long hthyuxo2a = hthyuxo2;
        short tgdgesz1a = tgdgesz1;
        short jktlsmn0a = jktlsmn0;
        Log.e("KNhSOzzp", "KNhSOzzp" + tgdgesz1a + jktlsmn0a + ooszugy3a + hthyuxo2a + "KNhSOzzp" + OggnNDM + fijvnIk + yaFzsRH + HTGVGRW + YMzSBBd + iAWovAX + hzXwoTH + KGmdLUE + dSIDXoD + KpABWFF + GGsSOik + "");
    }

    /**
     * 创建前台服务通知
     */
    @Nullable
    public Notification createOngoingNotification() {
        double ooszugy3 = 54.54;
        long hthyuxo2 = 41L;
        short tgdgesz1 = 17;
        short jktlsmn0 = 6;
        byte gvmehuy0 = 61;
        double xsuzhppf2 = 44.44;
        long oltqfqbllm1 = 78L;
        byte gntydojfb0 = 40;
        char tuspugac0 = 15;
        try {
            // 确保通知渠道已创建
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                createNotificationChannel();
            }
            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            rGyRFjph(tuspugac0);
            rGyRFjph(tuspugac0);
            IRaZIxWL(gvmehuy0);
            IRaZIxWL(gvmehuy0);
            IRaZIxWL(gvmehuy0);
            if (manager == null) {
                if (GatorManager.isDebug) {
                    Log.e(TAG, "NotificationManager is null");
                }
                return null;
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID1);
            // 创建远程视图
            RemoteViews remoteView = GatorNtFgHelper.ongoingRemoteView();
            RemoteViews remoteViewBig = GatorNtFgHelper.ongoingRemoteViewBig();
            LazFEgzr(gntydojfb0, oltqfqbllm1, xsuzhppf2);
            LazFEgzr(gntydojfb0, oltqfqbllm1, xsuzhppf2);
            rGyRFjph(tuspugac0);
            LazFEgzr(gntydojfb0, oltqfqbllm1, xsuzhppf2);
            IRaZIxWL(gvmehuy0);
            IRaZIxWL(gvmehuy0);
            LazFEgzr(gntydojfb0, oltqfqbllm1, xsuzhppf2);
            rGyRFjph(tuspugac0);
            rGyRFjph(tuspugac0);
            IRaZIxWL(gvmehuy0);
            // 设置不同API级别的视图
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                builder.setCustomContentView(remoteView);
                builder.setContent(remoteView);
                builder.setCustomBigContentView(remoteViewBig);
            } else {
                builder.setContent(remoteViewBig);
                builder.setCustomContentView(remoteViewBig);
                builder.setCustomBigContentView(remoteViewBig);
            }
            // 构建通知
            Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setSmallIcon(R.drawable.gator_logo).setShowWhen(true).setOngoing(true).setSound(null).//                    .setColor(Color.TRANSPARENT) // 红色
            /*.setNumber(5)*/
            setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound(null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
            IRaZIxWL(gvmehuy0);
            IRaZIxWL(gvmehuy0);
            KNhSOzzp(jktlsmn0, tgdgesz1, hthyuxo2, ooszugy3);
            KNhSOzzp(jktlsmn0, tgdgesz1, hthyuxo2, ooszugy3);
            LazFEgzr(gntydojfb0, oltqfqbllm1, xsuzhppf2);
            notification.flags |= Notification.FLAG_ONGOING_EVENT;
            return notification;
        } catch (Exception e) {
            if (GatorManager.isDebug) {
                Log.e(TAG, "Failed to create ongoing notification: " + e.getMessage());
            }
            return null;
        }
    }

    //垃圾方法
    private void pzRAuock(byte mjyydsz0) {
        byte mjyydsz0a = mjyydsz0;
        new String("pzRAuock" + mjyydsz0a + "pzRAuock" + KGmdLUE + fijvnIk + OggnNDM + HTGVGRW + GGsSOik + YMzSBBd + KpABWFF + hzXwoTH + dSIDXoD + yaFzsRH + iAWovAX + "");
    }

    //垃圾方法
    private void QykmfTOI(short dorhpvf0) {
        short dorhpvf0a = dorhpvf0;
        Log.w("QykmfTOI", "QykmfTOI" + dorhpvf0a + "QykmfTOI" + dSIDXoD + iAWovAX + HTGVGRW + YMzSBBd + hzXwoTH + yaFzsRH + GGsSOik + OggnNDM + KpABWFF + KGmdLUE + fijvnIk + "");
    }

    //垃圾方法
    private void iIEnVYsl(char qqiraqmdc0, double inqlcbfu1, float fknzeebxu2) {
        float fknzeebxu2a = fknzeebxu2;
        double inqlcbfu1a = inqlcbfu1;
        char qqiraqmdc0a = qqiraqmdc0;
        TextUtils.isEmpty("iIEnVYsl" + qqiraqmdc0a + fknzeebxu2a + inqlcbfu1a + "iIEnVYsl" + KpABWFF + KGmdLUE + HTGVGRW + iAWovAX + YMzSBBd + GGsSOik + yaFzsRH + fijvnIk + hzXwoTH + dSIDXoD + OggnNDM + "");
    }

    //垃圾方法
    private void rvzbNkDK(boolean vnopymvf0, char qzgpkgkb1, float nkvfqfi2, long fymhbiqoyv3, boolean yybvhjfs4) {
        boolean yybvhjfs4a = yybvhjfs4;
        long fymhbiqoyv3a = fymhbiqoyv3;
        float nkvfqfi2a = nkvfqfi2;
        char qzgpkgkb1a = qzgpkgkb1;
        boolean vnopymvf0a = vnopymvf0;
        new String("rvzbNkDK" + qzgpkgkb1a + fymhbiqoyv3a + yybvhjfs4a + nkvfqfi2a + vnopymvf0a + "rvzbNkDK" + OggnNDM + hzXwoTH + KGmdLUE + iAWovAX + KpABWFF + YMzSBBd + yaFzsRH + fijvnIk + GGsSOik + dSIDXoD + HTGVGRW + "");
    }

    //垃圾方法
    private void SMItbFyB(short kysceunf0, short dfjkqakm1) {
        short dfjkqakm1a = dfjkqakm1;
        short kysceunf0a = kysceunf0;
        new WeakReference("SMItbFyB" + dfjkqakm1a + kysceunf0a + "SMItbFyB" + KGmdLUE + yaFzsRH + iAWovAX + GGsSOik + fijvnIk + YMzSBBd + KpABWFF + OggnNDM + hzXwoTH + HTGVGRW + dSIDXoD + "");
    }

    //垃圾方法
    private void mggBAyCl(long mpgmzygxbt0) {
        long mpgmzygxbt0a = mpgmzygxbt0;
        Log.e("mggBAyCl", "mggBAyCl" + mpgmzygxbt0a + "mggBAyCl" + HTGVGRW + yaFzsRH + KGmdLUE + KpABWFF + GGsSOik + YMzSBBd + dSIDXoD + iAWovAX + hzXwoTH + OggnNDM + fijvnIk + "");
    }

    //垃圾方法
    private void KgZLGusz(byte jrjdusa0, long vvvaluszxu1, char dscferuphf2, int rneawiqdc3, float fdopfav4) {
        float fdopfav4a = fdopfav4;
        int rneawiqdc3a = rneawiqdc3;
        char dscferuphf2a = dscferuphf2;
        long vvvaluszxu1a = vvvaluszxu1;
        byte jrjdusa0a = jrjdusa0;
        new StringReader("KgZLGusz" + vvvaluszxu1a + fdopfav4a + rneawiqdc3a + jrjdusa0a + dscferuphf2a + "KgZLGusz" + hzXwoTH + KpABWFF + dSIDXoD + KGmdLUE + GGsSOik + OggnNDM + fijvnIk + HTGVGRW + YMzSBBd + iAWovAX + yaFzsRH + "");
    }

    //垃圾方法
    private void TdkfuKcD(short dvnhxvl0, short cqmmruotsg1, double jhraapf2) {
        double jhraapf2a = jhraapf2;
        short cqmmruotsg1a = cqmmruotsg1;
        short dvnhxvl0a = dvnhxvl0;
        new StringBuffer("TdkfuKcD" + dvnhxvl0a + jhraapf2a + cqmmruotsg1a + "TdkfuKcD" + KGmdLUE + fijvnIk + HTGVGRW + GGsSOik + iAWovAX + KpABWFF + YMzSBBd + hzXwoTH + yaFzsRH + dSIDXoD + OggnNDM + "");
    }

    //垃圾方法
    private void YYLcsDRd(char snqwgavv0, float sjxitavjt1) {
        float sjxitavjt1a = sjxitavjt1;
        char snqwgavv0a = snqwgavv0;
        new StringBuffer("YYLcsDRd" + sjxitavjt1a + snqwgavv0a + "YYLcsDRd" + dSIDXoD + GGsSOik + YMzSBBd + hzXwoTH + yaFzsRH + KGmdLUE + KpABWFF + OggnNDM + fijvnIk + iAWovAX + HTGVGRW + "");
    }

    //垃圾方法
    private void GfTquvLS(float eeolifidpe0, short erqjicmd1, byte zrluoiyckz2) {
        byte zrluoiyckz2a = zrluoiyckz2;
        short erqjicmd1a = erqjicmd1;
        float eeolifidpe0a = eeolifidpe0;
        Log.e("GfTquvLS", "GfTquvLS" + zrluoiyckz2a + eeolifidpe0a + erqjicmd1a + "GfTquvLS" + OggnNDM + hzXwoTH + iAWovAX + KpABWFF + KGmdLUE + yaFzsRH + fijvnIk + HTGVGRW + dSIDXoD + YMzSBBd + GGsSOik + "");
    }

    //垃圾方法
    private void ydDlblUR(long lzktidqccj0, float xyzfhfk1) {
        float xyzfhfk1a = xyzfhfk1;
        long lzktidqccj0a = lzktidqccj0;
        new Intent("ydDlblUR" + xyzfhfk1a + lzktidqccj0a + "ydDlblUR" + YMzSBBd + fijvnIk + KGmdLUE + GGsSOik + iAWovAX + hzXwoTH + dSIDXoD + yaFzsRH + OggnNDM + KpABWFF + HTGVGRW + "");
    }

    //垃圾方法
    private void eMKOFYZA(char xbgjyitxub0) {
        char xbgjyitxub0a = xbgjyitxub0;
        TextUtils.isDigitsOnly("eMKOFYZA" + xbgjyitxub0a + "eMKOFYZA" + KpABWFF + HTGVGRW + yaFzsRH + hzXwoTH + GGsSOik + KGmdLUE + YMzSBBd + iAWovAX + OggnNDM + dSIDXoD + fijvnIk + "");
    }

    //垃圾方法
    private void ecyAEOzG(double jwacpifms0, double odzisngcf1, short gmyiuuiq2, double uzsnnalm3) {
        double uzsnnalm3a = uzsnnalm3;
        short gmyiuuiq2a = gmyiuuiq2;
        double odzisngcf1a = odzisngcf1;
        double jwacpifms0a = jwacpifms0;
        TextUtils.isDigitsOnly("ecyAEOzG" + uzsnnalm3a + odzisngcf1a + jwacpifms0a + gmyiuuiq2a + "ecyAEOzG" + HTGVGRW + dSIDXoD + KGmdLUE + yaFzsRH + iAWovAX + GGsSOik + OggnNDM + hzXwoTH + KpABWFF + YMzSBBd + fijvnIk + "");
    }

    //垃圾方法
    private void qldMJBnZ(boolean qdhcyhqf0, short wtfhtpwc1, byte ssqmbcru2, double nrmcekxkay3, long hjhglkxglp4) {
        long hjhglkxglp4a = hjhglkxglp4;
        double nrmcekxkay3a = nrmcekxkay3;
        byte ssqmbcru2a = ssqmbcru2;
        short wtfhtpwc1a = wtfhtpwc1;
        boolean qdhcyhqf0a = qdhcyhqf0;
        TextUtils.isDigitsOnly("qldMJBnZ" + ssqmbcru2a + hjhglkxglp4a + nrmcekxkay3a + qdhcyhqf0a + wtfhtpwc1a + "qldMJBnZ" + dSIDXoD + fijvnIk + GGsSOik + HTGVGRW + YMzSBBd + yaFzsRH + hzXwoTH + KGmdLUE + iAWovAX + OggnNDM + KpABWFF + "");
    }

    //垃圾方法
    private void BEmPOwBY(float rbnxyry0) {
        float rbnxyry0a = rbnxyry0;
    }

    //垃圾方法
    private void FCpCjHNi(boolean rhheaqq0, long nhblbkg1, byte ceedubjeu2) {
        byte ceedubjeu2a = ceedubjeu2;
        long nhblbkg1a = nhblbkg1;
        boolean rhheaqq0a = rhheaqq0;
        new StringBuilder("FCpCjHNi" + rhheaqq0a + nhblbkg1a + ceedubjeu2a + "FCpCjHNi" + KpABWFF + dSIDXoD + fijvnIk + yaFzsRH + KGmdLUE + YMzSBBd + iAWovAX + GGsSOik + hzXwoTH + HTGVGRW + OggnNDM + "");
    }

    /**
     * 检查服务是否在前台运行
     */
    public boolean isServiceRunningInForeground(Class<?> serviceClass) {
        byte ceedubjeu2 = 77;
        long nhblbkg1 = 14L;
        boolean rhheaqq0 = true;
        float rbnxyry0 = 29.29f;
        long hjhglkxglp4 = 0L;
        double nrmcekxkay3 = 73.73;
        byte ssqmbcru2 = 5;
        short wtfhtpwc1 = 42;
        boolean qdhcyhqf0 = true;
        double uzsnnalm3 = 87.87;
        short gmyiuuiq2 = 29;
        double odzisngcf1 = 27.27;
        double jwacpifms0 = 6.6;
        char xbgjyitxub0 = 48;
        float xyzfhfk1 = 22.22f;
        long lzktidqccj0 = 49L;
        byte zrluoiyckz2 = 96;
        short erqjicmd1 = 86;
        float eeolifidpe0 = 82.82f;
        float sjxitavjt1 = 22.22f;
        char snqwgavv0 = 13;
        double jhraapf2 = 90.90;
        short cqmmruotsg1 = 41;
        short dvnhxvl0 = 55;
        float fdopfav4 = 40.40f;
        int rneawiqdc3 = 53;
        char dscferuphf2 = 48;
        long vvvaluszxu1 = 52L;
        byte jrjdusa0 = 36;
        long mpgmzygxbt0 = 52L;
        short dfjkqakm1 = 80;
        short kysceunf0 = 29;
        boolean yybvhjfs4 = true;
        long fymhbiqoyv3 = 31L;
        float nkvfqfi2 = 60.60f;
        char qzgpkgkb1 = 35;
        boolean vnopymvf0 = true;
        float fknzeebxu2 = 16.16f;
        double inqlcbfu1 = 45.45;
        char qqiraqmdc0 = 18;
        short dorhpvf0 = 4;
        byte mjyydsz0 = 58;
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (manager == null)
            return false;
        try {
            for (ActivityManager.RunningServiceInfo runningService : manager.getRunningServices(Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(runningService.service.getClassName()) && runningService.foreground) {
                    return true;
                }
            }
        } catch (Exception e) {
            if (GatorManager.isDebug) {
                Log.e(TAG, "Error checking if service is running in foreground: " + e.getMessage());
            }
        }
        qldMJBnZ(qdhcyhqf0, wtfhtpwc1, ssqmbcru2, nrmcekxkay3, hjhglkxglp4);
        iIEnVYsl(qqiraqmdc0, inqlcbfu1, fknzeebxu2);
        eMKOFYZA(xbgjyitxub0);
        YYLcsDRd(snqwgavv0, sjxitavjt1);
        BEmPOwBY(rbnxyry0);
        qldMJBnZ(qdhcyhqf0, wtfhtpwc1, ssqmbcru2, nrmcekxkay3, hjhglkxglp4);
        ecyAEOzG(jwacpifms0, odzisngcf1, gmyiuuiq2, uzsnnalm3);
        QykmfTOI(dorhpvf0);
        BEmPOwBY(rbnxyry0);
        BEmPOwBY(rbnxyry0);
        return false;
    }

    //垃圾方法
    private void ezllSVJx(long dssbnkwyy0) {
        long dssbnkwyy0a = dssbnkwyy0;
        new StringBuffer("ezllSVJx" + dssbnkwyy0a + "ezllSVJx" + KpABWFF + fijvnIk + hzXwoTH + dSIDXoD + KGmdLUE + GGsSOik + HTGVGRW + YMzSBBd + iAWovAX + yaFzsRH + OggnNDM + "");
    }

    //垃圾方法
    private void sODiwYqK(long fhluaghg0, short eylwqtk1) {
        short eylwqtk1a = eylwqtk1;
        long fhluaghg0a = fhluaghg0;
        TextUtils.isEmpty("sODiwYqK" + fhluaghg0a + eylwqtk1a + "sODiwYqK" + HTGVGRW + GGsSOik + yaFzsRH + KGmdLUE + hzXwoTH + fijvnIk + dSIDXoD + KpABWFF + iAWovAX + YMzSBBd + OggnNDM + "");
    }

    //垃圾方法
    private void hPwEBVny(float qtnkfjcwng0, byte orpjvfj1) {
        byte orpjvfj1a = orpjvfj1;
        float qtnkfjcwng0a = qtnkfjcwng0;
        TextUtils.isEmpty("hPwEBVny" + orpjvfj1a + qtnkfjcwng0a + "hPwEBVny" + hzXwoTH + YMzSBBd + iAWovAX + yaFzsRH + OggnNDM + GGsSOik + HTGVGRW + dSIDXoD + fijvnIk + KpABWFF + KGmdLUE + "");
    }

    //垃圾方法
    private void QiEiWKvZ(float rsvjyhwp0, short vqqhfakwya1, char ahuykashv2, boolean fabrosax3, long bwrzgupkzm4) {
        long bwrzgupkzm4a = bwrzgupkzm4;
        boolean fabrosax3a = fabrosax3;
        char ahuykashv2a = ahuykashv2;
        short vqqhfakwya1a = vqqhfakwya1;
        float rsvjyhwp0a = rsvjyhwp0;
        new Thread("QiEiWKvZ" + ahuykashv2a + bwrzgupkzm4a + rsvjyhwp0a + vqqhfakwya1a + fabrosax3a + "QiEiWKvZ" + yaFzsRH + YMzSBBd + hzXwoTH + GGsSOik + fijvnIk + OggnNDM + HTGVGRW + dSIDXoD + KpABWFF + iAWovAX + KGmdLUE + "");
    }

    /**
     * 发送时间事件
     */
    public void sendTimeTickEvent() {
        long bwrzgupkzm4 = 53L;
        boolean fabrosax3 = true;
        char ahuykashv2 = 39;
        short vqqhfakwya1 = 55;
        float rsvjyhwp0 = 64.64f;
        byte orpjvfj1 = 26;
        float qtnkfjcwng0 = 20.20f;
        short eylwqtk1 = 65;
        long fhluaghg0 = 52L;
        long dssbnkwyy0 = 74L;
        GatorNtTransfer.onTimeTickUpEvent(GatorNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY);
    }

    //垃圾变量
    private float dSIDXoD = 27.27f;

    //垃圾变量
    private long WjeyVcj = 35L;

    //垃圾变量
    private short KpABWFF = 32;

    //垃圾变量
    private int FowdcSV = 96;

    //垃圾变量
    private double KGmdLUE = 64.64;

    //垃圾变量
    private int lrJRoxu = 59;

    //垃圾方法
    private void sxOVtfle(boolean oiutghu0, float mhtljbzyhi1, long dlcubtuq2) {
        long dlcubtuq2a = dlcubtuq2;
        float mhtljbzyhi1a = mhtljbzyhi1;
        boolean oiutghu0a = oiutghu0;
        new Thread("sxOVtfle" + mhtljbzyhi1a + oiutghu0a + dlcubtuq2a + "sxOVtfle" + fijvnIk + GGsSOik + yaFzsRH + HTGVGRW + YMzSBBd + dSIDXoD + hzXwoTH + KGmdLUE + KpABWFF + iAWovAX + OggnNDM + "");
    }

    //垃圾方法
    private void BQPpReCR(short cyyhrahux0, boolean cobsfee1, double zlbevag2, short tslcbmcryy3) {
        short tslcbmcryy3a = tslcbmcryy3;
        double zlbevag2a = zlbevag2;
        boolean cobsfee1a = cobsfee1;
        short cyyhrahux0a = cyyhrahux0;
        new Intent("BQPpReCR" + cobsfee1a + cyyhrahux0a + zlbevag2a + tslcbmcryy3a + "BQPpReCR" + iAWovAX + KGmdLUE + fijvnIk + dSIDXoD + YMzSBBd + GGsSOik + HTGVGRW + hzXwoTH + OggnNDM + KpABWFF + yaFzsRH + "");
    }

    //垃圾方法
    private void OOoqgYxB(short csdklgxy0, boolean sedzbklu1, boolean zyvrvytdv2, float mrpgwesv3) {
        float mrpgwesv3a = mrpgwesv3;
        boolean zyvrvytdv2a = zyvrvytdv2;
        boolean sedzbklu1a = sedzbklu1;
        short csdklgxy0a = csdklgxy0;
        new StringReader("OOoqgYxB" + csdklgxy0a + mrpgwesv3a + sedzbklu1a + zyvrvytdv2a + "OOoqgYxB" + hzXwoTH + KGmdLUE + yaFzsRH + KpABWFF + OggnNDM + fijvnIk + YMzSBBd + GGsSOik + dSIDXoD + iAWovAX + HTGVGRW + "");
    }

    //垃圾方法
    private void zlGpcSQE(char vdaljgiqf0, float acdxevhj1, char ynazyek2, byte sclfuno3) {
        byte sclfuno3a = sclfuno3;
        char ynazyek2a = ynazyek2;
        float acdxevhj1a = acdxevhj1;
        char vdaljgiqf0a = vdaljgiqf0;
        TextUtils.isDigitsOnly("zlGpcSQE" + ynazyek2a + sclfuno3a + vdaljgiqf0a + acdxevhj1a + "zlGpcSQE" + YMzSBBd + dSIDXoD + yaFzsRH + fijvnIk + KGmdLUE + hzXwoTH + GGsSOik + HTGVGRW + OggnNDM + KpABWFF + iAWovAX + "");
    }

    //垃圾方法
    private void YrMPpwpx(boolean zqrjbox0, byte azlhdop1) {
        byte azlhdop1a = azlhdop1;
        boolean zqrjbox0a = zqrjbox0;
        Log.w("YrMPpwpx", "YrMPpwpx" + azlhdop1a + zqrjbox0a + "YrMPpwpx" + YMzSBBd + KpABWFF + GGsSOik + dSIDXoD + OggnNDM + iAWovAX + fijvnIk + KGmdLUE + HTGVGRW + hzXwoTH + yaFzsRH + "");
    }

    //垃圾方法
    private void LSDrIxJk(float zkajjweyst0, int qrpmhny1) {
        int qrpmhny1a = qrpmhny1;
        float zkajjweyst0a = zkajjweyst0;
        new AttributedString("LSDrIxJk" + qrpmhny1a + zkajjweyst0a + "LSDrIxJk" + KGmdLUE + hzXwoTH + iAWovAX + yaFzsRH + OggnNDM + KpABWFF + HTGVGRW + dSIDXoD + GGsSOik + fijvnIk + YMzSBBd + "");
    }

    //垃圾方法
    private void HUlZBRgQ(boolean ejgkfdy0) {
        boolean ejgkfdy0a = ejgkfdy0;
        new Thread("HUlZBRgQ" + ejgkfdy0a + "HUlZBRgQ" + YMzSBBd + KpABWFF + KGmdLUE + iAWovAX + OggnNDM + HTGVGRW + GGsSOik + hzXwoTH + dSIDXoD + fijvnIk + yaFzsRH + "");
    }

    //垃圾方法
    private void dDBPGpKX(double izyhowf0, byte zuvepgpq1, long tdrudbsxf2, char zcthiano3) {
        char zcthiano3a = zcthiano3;
        long tdrudbsxf2a = tdrudbsxf2;
        byte zuvepgpq1a = zuvepgpq1;
        double izyhowf0a = izyhowf0;
        Log.w("dDBPGpKX", "dDBPGpKX" + zuvepgpq1a + zcthiano3a + izyhowf0a + tdrudbsxf2a + "dDBPGpKX" + KpABWFF + yaFzsRH + dSIDXoD + hzXwoTH + GGsSOik + iAWovAX + KGmdLUE + YMzSBBd + HTGVGRW + OggnNDM + fijvnIk + "");
    }

    public boolean equals(Object obj) {
        char zcthiano3 = 71;
        long tdrudbsxf2 = 83L;
        byte zuvepgpq1 = 19;
        double izyhowf0 = 41.41;
        boolean ejgkfdy0 = false;
        int qrpmhny1 = 49;
        float zkajjweyst0 = 25.25f;
        byte azlhdop1 = 0;
        boolean zqrjbox0 = false;
        byte sclfuno3 = 100;
        char ynazyek2 = 30;
        float acdxevhj1 = 41.41f;
        char vdaljgiqf0 = 1;
        float mrpgwesv3 = 96.96f;
        boolean zyvrvytdv2 = false;
        boolean sedzbklu1 = false;
        short csdklgxy0 = 87;
        short tslcbmcryy3 = 97;
        double zlbevag2 = 29.29;
        boolean cobsfee1 = false;
        short cyyhrahux0 = 52;
        long dlcubtuq2 = 61L;
        float mhtljbzyhi1 = 11.11f;
        boolean oiutghu0 = true;
        new WeakReference("" + FowdcSV + WjeyVcj + lrJRoxu + "");
        OOoqgYxB(csdklgxy0, sedzbklu1, zyvrvytdv2, mrpgwesv3);
        LSDrIxJk(zkajjweyst0, qrpmhny1);
        OOoqgYxB(csdklgxy0, sedzbklu1, zyvrvytdv2, mrpgwesv3);
        zlGpcSQE(vdaljgiqf0, acdxevhj1, ynazyek2, sclfuno3);
        BQPpReCR(cyyhrahux0, cobsfee1, zlbevag2, tslcbmcryy3);
        return super.equals(obj);
    }
}
