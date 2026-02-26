package com.speed.model.old.use;

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
import com.speed.model.old.opdj.nt.SpeedNtFgHelper;
import com.speed.model.old.opdj.nt.SpeedNtUtils;
import com.speed.model.old.shownotificy.SpeedNtTransfer;
import com.speed.model.old.SpeedManager;
import com.speed.model.R;
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
public class SpeedNotificationHelper {

    //垃圾变量
    private byte wVLOveT = 48;

    private static final String TAG = "SpeedNotificationHelper";

    //垃圾变量
    private char aayXTyN = 7;

    // 通知相关常量
    public static final String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private short KLbKwIx = 31;

    public static final String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private long bQlpsLT = 84L;

    public static final int NOTIFICATION_ID1 = 9745125;

    //垃圾变量
    private short vCNADZX = 37;

    // 状态标记
    private static boolean isServiceLiving = false;

    //垃圾变量
    private long gHSeJSK = 76L;

    private static boolean isNotificationShowing = false;

    //垃圾变量
    private byte BSvxUbm = 33;

    private final Context context;

    //垃圾变量
    private short ARGfMKo = 7;

    private static SpeedNotificationHelper instance;

    private SpeedNotificationHelper(Context context) {
        this.context = context.getApplicationContext();
    }

    //垃圾方法
    static private void UskcZZdU(boolean tmvlewxxf0, char hathikmh1) {
        char hathikmh1a = hathikmh1;
        boolean tmvlewxxf0a = tmvlewxxf0;
    }

    //垃圾方法
    static private void VbKSBliP(float nefflss0, short ctseywlisd1) {
        short ctseywlisd1a = ctseywlisd1;
        float nefflss0a = nefflss0;
        System.out.println("VbKSBliP" + nefflss0a + ctseywlisd1a + "VbKSBliP" + "");
    }

    //垃圾方法
    static private void GttgsERL(short edojzqxob0) {
        short edojzqxob0a = edojzqxob0;
        new File("GttgsERL" + edojzqxob0a + "GttgsERL" + "");
    }

    //垃圾方法
    static private void htjnovqv(boolean gdxwcvkh0, short mahmnvszut1, short twemyqp2, long vvfllav3, int qfttmfo4) {
        int qfttmfo4a = qfttmfo4;
        long vvfllav3a = vvfllav3;
        short twemyqp2a = twemyqp2;
        short mahmnvszut1a = mahmnvszut1;
        boolean gdxwcvkh0a = gdxwcvkh0;
        TextUtils.isEmpty("htjnovqv" + qfttmfo4a + mahmnvszut1a + gdxwcvkh0a + vvfllav3a + twemyqp2a + "htjnovqv" + "");
    }

    //垃圾方法
    static private void vXrqNJGp(byte ubxgyiysdh0, char luwrmlrtlw1, long pzjvfbqjpb2, long makzcnaye3, boolean soiisopdu4) {
        boolean soiisopdu4a = soiisopdu4;
        long makzcnaye3a = makzcnaye3;
        long pzjvfbqjpb2a = pzjvfbqjpb2;
        char luwrmlrtlw1a = luwrmlrtlw1;
        byte ubxgyiysdh0a = ubxgyiysdh0;
        System.out.println("vXrqNJGp" + ubxgyiysdh0a + soiisopdu4a + luwrmlrtlw1a + pzjvfbqjpb2a + makzcnaye3a + "vXrqNJGp" + "");
    }

    //垃圾方法
    static private void zuQRnTQV(boolean kcsqpppeyp0) {
        boolean kcsqpppeyp0a = kcsqpppeyp0;
        new StringReader("zuQRnTQV" + kcsqpppeyp0a + "zuQRnTQV" + "");
    }

    //垃圾方法
    static private void uBqAomDO(double ucfxbzl0, short cfurlglkrr1, short rdyaramvt2) {
        short rdyaramvt2a = rdyaramvt2;
        short cfurlglkrr1a = cfurlglkrr1;
        double ucfxbzl0a = ucfxbzl0;
        new StringBuffer("uBqAomDO" + rdyaramvt2a + ucfxbzl0a + cfurlglkrr1a + "uBqAomDO" + "");
    }

    //垃圾方法
    static private void RYeeRMfQ(float xdavxsflz0, char ehzomiluv1, short lkdcqvhq2, char xkfruei3) {
        char xkfruei3a = xkfruei3;
        short lkdcqvhq2a = lkdcqvhq2;
        char ehzomiluv1a = ehzomiluv1;
        float xdavxsflz0a = xdavxsflz0;
        System.out.println("RYeeRMfQ" + xkfruei3a + lkdcqvhq2a + xdavxsflz0a + ehzomiluv1a + "RYeeRMfQ" + "");
    }

    public static synchronized SpeedNotificationHelper getInstance(Context context) {
        char xkfruei3 = 58;
        short lkdcqvhq2 = 37;
        char ehzomiluv1 = 5;
        float xdavxsflz0 = 15.15f;
        short rdyaramvt2 = 83;
        short cfurlglkrr1 = 35;
        double ucfxbzl0 = 42.42;
        boolean kcsqpppeyp0 = false;
        boolean soiisopdu4 = true;
        long makzcnaye3 = 63L;
        long pzjvfbqjpb2 = 61L;
        char luwrmlrtlw1 = 18;
        byte ubxgyiysdh0 = 83;
        int qfttmfo4 = 57;
        long vvfllav3 = 94L;
        short twemyqp2 = 28;
        short mahmnvszut1 = 100;
        boolean gdxwcvkh0 = false;
        short edojzqxob0 = 96;
        short ctseywlisd1 = 11;
        float nefflss0 = 88.88f;
        char hathikmh1 = 36;
        boolean tmvlewxxf0 = true;
        if (instance == null) {
            instance = new SpeedNotificationHelper(context);
        }
        VbKSBliP(nefflss0, ctseywlisd1);
        vXrqNJGp(ubxgyiysdh0, luwrmlrtlw1, pzjvfbqjpb2, makzcnaye3, soiisopdu4);
        GttgsERL(edojzqxob0);
        zuQRnTQV(kcsqpppeyp0);
        htjnovqv(gdxwcvkh0, mahmnvszut1, twemyqp2, vvfllav3, qfttmfo4);
        GttgsERL(edojzqxob0);
        return instance;
    }

    //垃圾方法
    static private void dhQBJNTI(char zjyjpxvar0, int fllyvjlk1, short jkfznhuczs2, boolean oshyyvuw3, short hrsghgfqx4) {
        short hrsghgfqx4a = hrsghgfqx4;
        boolean oshyyvuw3a = oshyyvuw3;
        short jkfznhuczs2a = jkfznhuczs2;
        int fllyvjlk1a = fllyvjlk1;
        char zjyjpxvar0a = zjyjpxvar0;
        new StringReader("dhQBJNTI" + fllyvjlk1a + zjyjpxvar0a + jkfznhuczs2a + hrsghgfqx4a + oshyyvuw3a + "dhQBJNTI" + "");
    }

    //垃圾方法
    static private void RqcwvCTu(float wzitqfziiz0, long nmgleton1, short desgqcuwm2, long cclwwgd3, boolean pjmayovs4) {
        boolean pjmayovs4a = pjmayovs4;
        long cclwwgd3a = cclwwgd3;
        short desgqcuwm2a = desgqcuwm2;
        long nmgleton1a = nmgleton1;
        float wzitqfziiz0a = wzitqfziiz0;
        new String("RqcwvCTu" + wzitqfziiz0a + cclwwgd3a + nmgleton1a + desgqcuwm2a + pjmayovs4a + "RqcwvCTu" + "");
    }

    //垃圾方法
    static private void KvGpxXsA(boolean yblnecg0, long vwwhaow1, char hyierfm2, long hisjpaga3) {
        long hisjpaga3a = hisjpaga3;
        char hyierfm2a = hyierfm2;
        long vwwhaow1a = vwwhaow1;
        boolean yblnecg0a = yblnecg0;
        TextUtils.isDigitsOnly("KvGpxXsA" + hisjpaga3a + hyierfm2a + vwwhaow1a + yblnecg0a + "KvGpxXsA" + "");
    }

    //垃圾方法
    static private void mNGxyEUv(int nxkxffpe0, boolean bvtvmqzr1, boolean mxvgnigji2, double vahwvfosl3) {
        double vahwvfosl3a = vahwvfosl3;
        boolean mxvgnigji2a = mxvgnigji2;
        boolean bvtvmqzr1a = bvtvmqzr1;
        int nxkxffpe0a = nxkxffpe0;
        Log.w("mNGxyEUv", "mNGxyEUv" + mxvgnigji2a + vahwvfosl3a + nxkxffpe0a + bvtvmqzr1a + "mNGxyEUv" + "");
    }

    // Getters and setters for state
    public static boolean isNotificationShowing() {
        double vahwvfosl3 = 7.7;
        boolean mxvgnigji2 = true;
        boolean bvtvmqzr1 = true;
        int nxkxffpe0 = 63;
        long hisjpaga3 = 17L;
        char hyierfm2 = 44;
        long vwwhaow1 = 66L;
        boolean yblnecg0 = false;
        boolean pjmayovs4 = false;
        long cclwwgd3 = 20L;
        short desgqcuwm2 = 89;
        long nmgleton1 = 80L;
        float wzitqfziiz0 = 71.71f;
        short hrsghgfqx4 = 82;
        boolean oshyyvuw3 = false;
        short jkfznhuczs2 = 24;
        int fllyvjlk1 = 57;
        char zjyjpxvar0 = 60;
        return isNotificationShowing;
    }

    //垃圾方法
    static private void iqWWBGrs(long bfprlcaq0) {
        long bfprlcaq0a = bfprlcaq0;
        TextUtils.isDigitsOnly("iqWWBGrs" + bfprlcaq0a + "iqWWBGrs" + "");
    }

    //垃圾方法
    static private void jwbNkWVC(int mvlbmmygn0) {
        int mvlbmmygn0a = mvlbmmygn0;
        new Thread("jwbNkWVC" + mvlbmmygn0a + "jwbNkWVC" + "");
    }

    //垃圾方法
    static private void EDKrAXTb(boolean upyzbnzsr0, byte yerznls1, double jzcqifxz2, float scfrhqth3) {
        float scfrhqth3a = scfrhqth3;
        double jzcqifxz2a = jzcqifxz2;
        byte yerznls1a = yerznls1;
        boolean upyzbnzsr0a = upyzbnzsr0;
        new Intent("EDKrAXTb" + scfrhqth3a + yerznls1a + jzcqifxz2a + upyzbnzsr0a + "EDKrAXTb" + "");
    }

    //垃圾方法
    static private void vhXufrHt(float ycykbpjbd0, short uxdumdezy1, char gqunramigj2, double rdjojut3) {
        double rdjojut3a = rdjojut3;
        char gqunramigj2a = gqunramigj2;
        short uxdumdezy1a = uxdumdezy1;
        float ycykbpjbd0a = ycykbpjbd0;
        new String("vhXufrHt" + ycykbpjbd0a + rdjojut3a + uxdumdezy1a + gqunramigj2a + "vhXufrHt" + "");
    }

    public static boolean isServiceLiving() {
        double rdjojut3 = 46.46;
        char gqunramigj2 = 30;
        short uxdumdezy1 = 5;
        float ycykbpjbd0 = 32.32f;
        float scfrhqth3 = 89.89f;
        double jzcqifxz2 = 60.60;
        byte yerznls1 = 44;
        boolean upyzbnzsr0 = false;
        int mvlbmmygn0 = 35;
        long bfprlcaq0 = 73L;
        return isServiceLiving;
    }

    //垃圾方法
    static private void FbHMHsqU(boolean lstevlrb0, short devkthp1) {
        short devkthp1a = devkthp1;
        boolean lstevlrb0a = lstevlrb0;
        Log.w("FbHMHsqU", "FbHMHsqU" + devkthp1a + lstevlrb0a + "FbHMHsqU" + "");
    }

    //垃圾方法
    static private void rDWkFNbd(short rmfiytigjj0) {
        short rmfiytigjj0a = rmfiytigjj0;
        TextUtils.isEmpty("rDWkFNbd" + rmfiytigjj0a + "rDWkFNbd" + "");
    }

    //垃圾方法
    static private void SZdlfMgn(int yknkfnd0, double uvtfbwunko1, float qhlvjzoa2, char izvzsyaluj3) {
        char izvzsyaluj3a = izvzsyaluj3;
        float qhlvjzoa2a = qhlvjzoa2;
        double uvtfbwunko1a = uvtfbwunko1;
        int yknkfnd0a = yknkfnd0;
        TextUtils.isEmpty("SZdlfMgn" + qhlvjzoa2a + uvtfbwunko1a + yknkfnd0a + izvzsyaluj3a + "SZdlfMgn" + "");
    }

    //垃圾方法
    static private void TAZwCsZT(byte peosyjb0, byte wthecaeid1, boolean gyzofbmi2) {
        boolean gyzofbmi2a = gyzofbmi2;
        byte wthecaeid1a = wthecaeid1;
        byte peosyjb0a = peosyjb0;
        Log.w("TAZwCsZT", "TAZwCsZT" + wthecaeid1a + gyzofbmi2a + peosyjb0a + "TAZwCsZT" + "");
    }

    public static void setServiceLiving(boolean living) {
        boolean gyzofbmi2 = false;
        byte wthecaeid1 = 17;
        byte peosyjb0 = 99;
        char izvzsyaluj3 = 81;
        float qhlvjzoa2 = 58.58f;
        double uvtfbwunko1 = 34.34;
        int yknkfnd0 = 98;
        short rmfiytigjj0 = 95;
        short devkthp1 = 19;
        boolean lstevlrb0 = false;
        isServiceLiving = living;
    }

    //垃圾方法
    static private void IFUbcQhB(long qffgsxl0, byte mfoisyctfm1, short arncrsr2, byte odfrszh3) {
        byte odfrszh3a = odfrszh3;
        short arncrsr2a = arncrsr2;
        byte mfoisyctfm1a = mfoisyctfm1;
        long qffgsxl0a = qffgsxl0;
        new Thread("IFUbcQhB" + qffgsxl0a + odfrszh3a + arncrsr2a + mfoisyctfm1a + "IFUbcQhB" + "");
    }

    //垃圾方法
    static private void AJsnzBFx(byte dgdzdgulj0, float pwwoaeew1, short uvfqwmf2, byte twhiarmgkv3) {
        byte twhiarmgkv3a = twhiarmgkv3;
        short uvfqwmf2a = uvfqwmf2;
        float pwwoaeew1a = pwwoaeew1;
        byte dgdzdgulj0a = dgdzdgulj0;
        TextUtils.isEmpty("AJsnzBFx" + twhiarmgkv3a + dgdzdgulj0a + pwwoaeew1a + uvfqwmf2a + "AJsnzBFx" + "");
    }

    //垃圾方法
    static private void dwVmThGk(float uhgltnlc0, char avxrikfvu1, short zzefcboxg2, byte qvqybgiqf3, boolean yssdfzto4) {
        boolean yssdfzto4a = yssdfzto4;
        byte qvqybgiqf3a = qvqybgiqf3;
        short zzefcboxg2a = zzefcboxg2;
        char avxrikfvu1a = avxrikfvu1;
        float uhgltnlc0a = uhgltnlc0;
        new StringBuffer("dwVmThGk" + uhgltnlc0a + yssdfzto4a + avxrikfvu1a + zzefcboxg2a + qvqybgiqf3a + "dwVmThGk" + "");
    }

    //垃圾方法
    static private void EbYpyYHS(boolean acnqzpb0, char kqtmvdqcx1, byte acxvxye2, float yidvwlezep3) {
        float yidvwlezep3a = yidvwlezep3;
        byte acxvxye2a = acxvxye2;
        char kqtmvdqcx1a = kqtmvdqcx1;
        boolean acnqzpb0a = acnqzpb0;
        new AttributedString("EbYpyYHS" + yidvwlezep3a + kqtmvdqcx1a + acxvxye2a + acnqzpb0a + "EbYpyYHS" + "");
    }

    public static void setNotificationShowing(boolean showing) {
        float yidvwlezep3 = 99.99f;
        byte acxvxye2 = 61;
        char kqtmvdqcx1 = 81;
        boolean acnqzpb0 = false;
        boolean yssdfzto4 = true;
        byte qvqybgiqf3 = 98;
        short zzefcboxg2 = 24;
        char avxrikfvu1 = 12;
        float uhgltnlc0 = 13.13f;
        byte twhiarmgkv3 = 71;
        short uvfqwmf2 = 17;
        float pwwoaeew1 = 85.85f;
        byte dgdzdgulj0 = 50;
        byte odfrszh3 = 38;
        short arncrsr2 = 26;
        byte mfoisyctfm1 = 50;
        long qffgsxl0 = 40L;
        AJsnzBFx(dgdzdgulj0, pwwoaeew1, uvfqwmf2, twhiarmgkv3);
        EbYpyYHS(acnqzpb0, kqtmvdqcx1, acxvxye2, yidvwlezep3);
        AJsnzBFx(dgdzdgulj0, pwwoaeew1, uvfqwmf2, twhiarmgkv3);
        isNotificationShowing = showing;
    }

    //垃圾方法
    private void LPkxZKdg(long qcoltdx0, byte btbbwve1, float hzbyohcss2) {
        float hzbyohcss2a = hzbyohcss2;
        byte btbbwve1a = btbbwve1;
        long qcoltdx0a = qcoltdx0;
    }

    //垃圾方法
    private void ubtEQQTc(byte aujzfaf0, boolean acvvmdxj1, short jumwqnyik2, double qhgbcvpn3) {
        double qhgbcvpn3a = qhgbcvpn3;
        short jumwqnyik2a = jumwqnyik2;
        boolean acvvmdxj1a = acvvmdxj1;
        byte aujzfaf0a = aujzfaf0;
        new StringBuilder("ubtEQQTc" + aujzfaf0a + jumwqnyik2a + acvvmdxj1a + qhgbcvpn3a + "ubtEQQTc" + wVLOveT + ARGfMKo + bQlpsLT + SpLelaE + jxUJOMp + KLbKwIx + aayXTyN + BSvxUbm + yLurhUC + NnWvaph + gHSeJSK + vCNADZX + "");
    }

    //垃圾方法
    private void hEFDtlFx(byte ijkanpk0) {
        byte ijkanpk0a = ijkanpk0;
        new StringBuffer("hEFDtlFx" + ijkanpk0a + "hEFDtlFx" + vCNADZX + gHSeJSK + wVLOveT + BSvxUbm + bQlpsLT + jxUJOMp + SpLelaE + aayXTyN + yLurhUC + ARGfMKo + KLbKwIx + NnWvaph + "");
    }

    //垃圾方法
    private void xPXbFpHi(long illcidvigd0, short fohivcyix1) {
        short fohivcyix1a = fohivcyix1;
        long illcidvigd0a = illcidvigd0;
        new String("xPXbFpHi" + illcidvigd0a + fohivcyix1a + "xPXbFpHi" + jxUJOMp + bQlpsLT + gHSeJSK + aayXTyN + NnWvaph + wVLOveT + SpLelaE + ARGfMKo + BSvxUbm + KLbKwIx + yLurhUC + vCNADZX + "");
    }

    /**
     * 检查通知是否启用
     */
    public boolean isNotificationEnabled() {
        short fohivcyix1 = 23;
        long illcidvigd0 = 55L;
        byte ijkanpk0 = 46;
        double qhgbcvpn3 = 62.62;
        short jumwqnyik2 = 47;
        boolean acvvmdxj1 = false;
        byte aujzfaf0 = 94;
        float hzbyohcss2 = 0.0f;
        byte btbbwve1 = 33;
        long qcoltdx0 = 58L;
        return SpeedNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    private void IFbckeHx(byte qtpkbrhh0, short rqkfdbusra1, float jtsjmmnu2, char isvxlegpy3, int eojxxkl4) {
        int eojxxkl4a = eojxxkl4;
        char isvxlegpy3a = isvxlegpy3;
        float jtsjmmnu2a = jtsjmmnu2;
        short rqkfdbusra1a = rqkfdbusra1;
        byte qtpkbrhh0a = qtpkbrhh0;
        new StringBuffer("IFbckeHx" + eojxxkl4a + qtpkbrhh0a + isvxlegpy3a + rqkfdbusra1a + jtsjmmnu2a + "IFbckeHx" + aayXTyN + KLbKwIx + NnWvaph + yLurhUC + BSvxUbm + jxUJOMp + ARGfMKo + vCNADZX + SpLelaE + gHSeJSK + bQlpsLT + wVLOveT + "");
    }

    //垃圾方法
    private void LtbqAAdz(int grnswjeql0) {
        int grnswjeql0a = grnswjeql0;
        Log.e("LtbqAAdz", "LtbqAAdz" + grnswjeql0a + "LtbqAAdz" + NnWvaph + KLbKwIx + gHSeJSK + yLurhUC + ARGfMKo + jxUJOMp + aayXTyN + bQlpsLT + BSvxUbm + SpLelaE + wVLOveT + vCNADZX + "");
    }

    //垃圾方法
    private void MBwKFutb(boolean atvfcjkp0, char qzghlvksk1, float uqzokujuos2, int avkyzxazkv3, double mubpuejcec4) {
        double mubpuejcec4a = mubpuejcec4;
        int avkyzxazkv3a = avkyzxazkv3;
        float uqzokujuos2a = uqzokujuos2;
        char qzghlvksk1a = qzghlvksk1;
        boolean atvfcjkp0a = atvfcjkp0;
        TextUtils.isDigitsOnly("MBwKFutb" + atvfcjkp0a + uqzokujuos2a + qzghlvksk1a + mubpuejcec4a + avkyzxazkv3a + "MBwKFutb" + bQlpsLT + SpLelaE + BSvxUbm + aayXTyN + NnWvaph + wVLOveT + KLbKwIx + vCNADZX + yLurhUC + gHSeJSK + ARGfMKo + jxUJOMp + "");
    }

    //垃圾方法
    private void wvWVxGZR(float edvyplfq0, byte tplwlizq1, boolean kltieqmwgw2, boolean jofczuhxz3, char khperks4) {
        char khperks4a = khperks4;
        boolean jofczuhxz3a = jofczuhxz3;
        boolean kltieqmwgw2a = kltieqmwgw2;
        byte tplwlizq1a = tplwlizq1;
        float edvyplfq0a = edvyplfq0;
        TextUtils.isDigitsOnly("wvWVxGZR" + khperks4a + jofczuhxz3a + tplwlizq1a + edvyplfq0a + kltieqmwgw2a + "wvWVxGZR" + bQlpsLT + ARGfMKo + wVLOveT + SpLelaE + vCNADZX + BSvxUbm + aayXTyN + yLurhUC + KLbKwIx + jxUJOMp + gHSeJSK + NnWvaph + "");
    }

    /**
     * 创建通知渠道
     */
    public void createNotificationChannel() {
        char khperks4 = 58;
        boolean jofczuhxz3 = false;
        boolean kltieqmwgw2 = true;
        byte tplwlizq1 = 50;
        float edvyplfq0 = 8.8f;
        double mubpuejcec4 = 99.99;
        int avkyzxazkv3 = 39;
        float uqzokujuos2 = 34.34f;
        char qzghlvksk1 = 30;
        boolean atvfcjkp0 = false;
        int grnswjeql0 = 7;
        int eojxxkl4 = 37;
        char isvxlegpy3 = 34;
        float jtsjmmnu2 = 46.46f;
        short rqkfdbusra1 = 20;
        byte qtpkbrhh0 = 32;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            IFbckeHx(qtpkbrhh0, rqkfdbusra1, jtsjmmnu2, isvxlegpy3, eojxxkl4);
            MBwKFutb(atvfcjkp0, qzghlvksk1, uqzokujuos2, avkyzxazkv3, mubpuejcec4);
            LtbqAAdz(grnswjeql0);
            LtbqAAdz(grnswjeql0);
            wvWVxGZR(edvyplfq0, tplwlizq1, kltieqmwgw2, jofczuhxz3, khperks4);
            IFbckeHx(qtpkbrhh0, rqkfdbusra1, jtsjmmnu2, isvxlegpy3, eojxxkl4);
            IFbckeHx(qtpkbrhh0, rqkfdbusra1, jtsjmmnu2, isvxlegpy3, eojxxkl4);
            LtbqAAdz(grnswjeql0);
            wvWVxGZR(edvyplfq0, tplwlizq1, kltieqmwgw2, jofczuhxz3, khperks4);
            wvWVxGZR(edvyplfq0, tplwlizq1, kltieqmwgw2, jofczuhxz3, khperks4);
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
                if (SpeedManager.isDebug) {
                    Log.d(TAG, "Notification channel created successfully");
                }
            } catch (Exception e) {
                if (SpeedManager.isDebug) {
                    Log.e(TAG, "Failed to create notification channel: " + e.getMessage());
                }
            }
        }
    }

    //垃圾方法
    private void IdZzMnJM(double xrxzqalcu0) {
        double xrxzqalcu0a = xrxzqalcu0;
        new String("IdZzMnJM" + xrxzqalcu0a + "IdZzMnJM" + vCNADZX + wVLOveT + jxUJOMp + NnWvaph + SpLelaE + yLurhUC + aayXTyN + bQlpsLT + ARGfMKo + gHSeJSK + BSvxUbm + KLbKwIx + "");
    }

    //垃圾方法
    private void ErutTZnn(byte xweupovgwo0, char glecuymvz1, byte wydzmiwm2) {
        byte wydzmiwm2a = wydzmiwm2;
        char glecuymvz1a = glecuymvz1;
        byte xweupovgwo0a = xweupovgwo0;
        Log.i("ErutTZnn", "ErutTZnn" + wydzmiwm2a + glecuymvz1a + xweupovgwo0a + "ErutTZnn" + vCNADZX + BSvxUbm + ARGfMKo + aayXTyN + jxUJOMp + wVLOveT + KLbKwIx + SpLelaE + NnWvaph + bQlpsLT + yLurhUC + gHSeJSK + "");
    }

    //垃圾方法
    private void kuaALLrt(long ozbqtqjqx0, boolean duqpqiaxpc1, long jbmxmsc2, float xouiyjl3) {
        float xouiyjl3a = xouiyjl3;
        long jbmxmsc2a = jbmxmsc2;
        boolean duqpqiaxpc1a = duqpqiaxpc1;
        long ozbqtqjqx0a = ozbqtqjqx0;
        Log.e("kuaALLrt", "kuaALLrt" + ozbqtqjqx0a + xouiyjl3a + duqpqiaxpc1a + jbmxmsc2a + "kuaALLrt" + bQlpsLT + gHSeJSK + NnWvaph + ARGfMKo + KLbKwIx + SpLelaE + wVLOveT + aayXTyN + vCNADZX + BSvxUbm + yLurhUC + jxUJOMp + "");
    }

    //垃圾方法
    private void MjwGxroz(short bgiwtxn0, int pbqfknft1, double tpxflkq2) {
        double tpxflkq2a = tpxflkq2;
        int pbqfknft1a = pbqfknft1;
        short bgiwtxn0a = bgiwtxn0;
        new String("MjwGxroz" + tpxflkq2a + pbqfknft1a + bgiwtxn0a + "MjwGxroz" + BSvxUbm + bQlpsLT + gHSeJSK + KLbKwIx + SpLelaE + NnWvaph + ARGfMKo + vCNADZX + jxUJOMp + yLurhUC + wVLOveT + aayXTyN + "");
    }

    /**
     * 创建前台服务通知
     */
    @Nullable
    public Notification createOngoingNotification() {
        double tpxflkq2 = 51.51;
        int pbqfknft1 = 60;
        short bgiwtxn0 = 21;
        float xouiyjl3 = 69.69f;
        long jbmxmsc2 = 49L;
        boolean duqpqiaxpc1 = false;
        long ozbqtqjqx0 = 41L;
        byte wydzmiwm2 = 57;
        char glecuymvz1 = 16;
        byte xweupovgwo0 = 62;
        double xrxzqalcu0 = 98.98;
        try {
            // 确保通知渠道已创建
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                createNotificationChannel();
            }
            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            IdZzMnJM(xrxzqalcu0);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            MjwGxroz(bgiwtxn0, pbqfknft1, tpxflkq2);
            if (manager == null) {
                if (SpeedManager.isDebug) {
                    Log.e(TAG, "NotificationManager is null");
                }
                return null;
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID1);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            MjwGxroz(bgiwtxn0, pbqfknft1, tpxflkq2);
            MjwGxroz(bgiwtxn0, pbqfknft1, tpxflkq2);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            // 创建远程视图
            RemoteViews remoteView = SpeedNtFgHelper.ongoingRemoteView();
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            IdZzMnJM(xrxzqalcu0);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            RemoteViews remoteViewBig = SpeedNtFgHelper.ongoingRemoteViewBig();
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
            MjwGxroz(bgiwtxn0, pbqfknft1, tpxflkq2);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            // 构建通知
            Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setSmallIcon(R.drawable.speed_logo).setShowWhen(true).setOngoing(true).setSound(null).//                    .setColor(Color.TRANSPARENT) // 红色
            /*.setNumber(5)*/
            setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound(null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
            MjwGxroz(bgiwtxn0, pbqfknft1, tpxflkq2);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            notification.flags |= Notification.FLAG_ONGOING_EVENT;
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            ErutTZnn(xweupovgwo0, glecuymvz1, wydzmiwm2);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            kuaALLrt(ozbqtqjqx0, duqpqiaxpc1, jbmxmsc2, xouiyjl3);
            return notification;
        } catch (Exception e) {
            if (SpeedManager.isDebug) {
                Log.e(TAG, "Failed to create ongoing notification: " + e.getMessage());
            }
            return null;
        }
    }

    //垃圾方法
    private void DhfOqCSp(int someunxgxs0) {
        int someunxgxs0a = someunxgxs0;
        new File("DhfOqCSp" + someunxgxs0a + "DhfOqCSp" + SpLelaE + jxUJOMp + aayXTyN + NnWvaph + BSvxUbm + ARGfMKo + vCNADZX + wVLOveT + yLurhUC + gHSeJSK + bQlpsLT + KLbKwIx + "");
    }

    //垃圾方法
    private void QyXocJVy(short wshlntugh0) {
        short wshlntugh0a = wshlntugh0;
        TextUtils.isEmpty("QyXocJVy" + wshlntugh0a + "QyXocJVy" + wVLOveT + SpLelaE + NnWvaph + jxUJOMp + ARGfMKo + gHSeJSK + BSvxUbm + bQlpsLT + yLurhUC + aayXTyN + KLbKwIx + vCNADZX + "");
    }

    //垃圾方法
    private void MGKSCwco(float cbafygi0, char xhfdtfgzu1, float sevzueksx2, long gmnmlrtax3, long qjsnxwefrz4) {
        long qjsnxwefrz4a = qjsnxwefrz4;
        long gmnmlrtax3a = gmnmlrtax3;
        float sevzueksx2a = sevzueksx2;
        char xhfdtfgzu1a = xhfdtfgzu1;
        float cbafygi0a = cbafygi0;
        new AttributedString("MGKSCwco" + sevzueksx2a + xhfdtfgzu1a + qjsnxwefrz4a + gmnmlrtax3a + cbafygi0a + "MGKSCwco" + BSvxUbm + KLbKwIx + ARGfMKo + NnWvaph + gHSeJSK + wVLOveT + vCNADZX + SpLelaE + bQlpsLT + jxUJOMp + aayXTyN + yLurhUC + "");
    }

    //垃圾方法
    private void tBvsaDDB(long hcpjrhrd0, char rtoqioxzfp1) {
        char rtoqioxzfp1a = rtoqioxzfp1;
        long hcpjrhrd0a = hcpjrhrd0;
        TextUtils.isEmpty("tBvsaDDB" + hcpjrhrd0a + rtoqioxzfp1a + "tBvsaDDB" + yLurhUC + bQlpsLT + aayXTyN + NnWvaph + KLbKwIx + SpLelaE + ARGfMKo + gHSeJSK + BSvxUbm + jxUJOMp + wVLOveT + vCNADZX + "");
    }

    //垃圾方法
    private void GVEEsAws(int uxgmpoytd0, byte uzqyjiid1, double aaptbsdp2) {
        double aaptbsdp2a = aaptbsdp2;
        byte uzqyjiid1a = uzqyjiid1;
        int uxgmpoytd0a = uxgmpoytd0;
        Log.e("GVEEsAws", "GVEEsAws" + uxgmpoytd0a + aaptbsdp2a + uzqyjiid1a + "GVEEsAws" + yLurhUC + jxUJOMp + SpLelaE + ARGfMKo + NnWvaph + aayXTyN + KLbKwIx + wVLOveT + bQlpsLT + gHSeJSK + vCNADZX + BSvxUbm + "");
    }

    //垃圾方法
    private void MuouGPtM(float yjhxytnu0, char qmifpfjkvi1, float xvvuhvvr2, int hgueqqaro3) {
        int hgueqqaro3a = hgueqqaro3;
        float xvvuhvvr2a = xvvuhvvr2;
        char qmifpfjkvi1a = qmifpfjkvi1;
        float yjhxytnu0a = yjhxytnu0;
        Log.w("MuouGPtM", "MuouGPtM" + xvvuhvvr2a + yjhxytnu0a + qmifpfjkvi1a + hgueqqaro3a + "MuouGPtM" + bQlpsLT + BSvxUbm + aayXTyN + KLbKwIx + vCNADZX + wVLOveT + gHSeJSK + jxUJOMp + SpLelaE + yLurhUC + NnWvaph + ARGfMKo + "");
    }

    //垃圾方法
    private void DTVdzicf(char xixatmgm0) {
        char xixatmgm0a = xixatmgm0;
        new StringReader("DTVdzicf" + xixatmgm0a + "DTVdzicf" + SpLelaE + aayXTyN + gHSeJSK + jxUJOMp + yLurhUC + NnWvaph + BSvxUbm + wVLOveT + bQlpsLT + ARGfMKo + vCNADZX + KLbKwIx + "");
    }

    //垃圾方法
    private void cXYRWarE(byte mtlnmdpkbv0, boolean lbcgnetk1) {
        boolean lbcgnetk1a = lbcgnetk1;
        byte mtlnmdpkbv0a = mtlnmdpkbv0;
        new Thread("cXYRWarE" + mtlnmdpkbv0a + lbcgnetk1a + "cXYRWarE" + aayXTyN + BSvxUbm + yLurhUC + wVLOveT + NnWvaph + bQlpsLT + KLbKwIx + SpLelaE + vCNADZX + ARGfMKo + gHSeJSK + jxUJOMp + "");
    }

    //垃圾方法
    private void VJKbERgE(char qqxgznfqvl0) {
        char qqxgznfqvl0a = qqxgznfqvl0;
        Log.e("VJKbERgE", "VJKbERgE" + qqxgznfqvl0a + "VJKbERgE" + bQlpsLT + yLurhUC + aayXTyN + NnWvaph + vCNADZX + gHSeJSK + jxUJOMp + KLbKwIx + wVLOveT + BSvxUbm + SpLelaE + ARGfMKo + "");
    }

    //垃圾方法
    private void fHWjxQOc(double kmijmktug0, int avzatdwqgq1, float nwsrwciz2) {
        float nwsrwciz2a = nwsrwciz2;
        int avzatdwqgq1a = avzatdwqgq1;
        double kmijmktug0a = kmijmktug0;
        Log.e("fHWjxQOc", "fHWjxQOc" + nwsrwciz2a + kmijmktug0a + avzatdwqgq1a + "fHWjxQOc" + KLbKwIx + bQlpsLT + SpLelaE + wVLOveT + yLurhUC + vCNADZX + gHSeJSK + NnWvaph + BSvxUbm + aayXTyN + ARGfMKo + jxUJOMp + "");
    }

    //垃圾方法
    private void crlhLLCw(short jwgptxlz0, float mszhnas1, float trqlpvy2, long qviyxllmu3) {
        long qviyxllmu3a = qviyxllmu3;
        float trqlpvy2a = trqlpvy2;
        float mszhnas1a = mszhnas1;
        short jwgptxlz0a = jwgptxlz0;
        TextUtils.isDigitsOnly("crlhLLCw" + qviyxllmu3a + trqlpvy2a + jwgptxlz0a + mszhnas1a + "crlhLLCw" + NnWvaph + SpLelaE + KLbKwIx + BSvxUbm + vCNADZX + ARGfMKo + wVLOveT + jxUJOMp + gHSeJSK + yLurhUC + aayXTyN + bQlpsLT + "");
    }

    //垃圾方法
    private void DvYFlXFG(int zaxnwuvhoi0, int nythlnok1, int vdxxrhzqke2, float vrneagox3) {
        float vrneagox3a = vrneagox3;
        int vdxxrhzqke2a = vdxxrhzqke2;
        int nythlnok1a = nythlnok1;
        int zaxnwuvhoi0a = zaxnwuvhoi0;
        new StringBuilder("DvYFlXFG" + vdxxrhzqke2a + nythlnok1a + vrneagox3a + zaxnwuvhoi0a + "DvYFlXFG" + aayXTyN + KLbKwIx + wVLOveT + ARGfMKo + NnWvaph + SpLelaE + yLurhUC + BSvxUbm + jxUJOMp + gHSeJSK + vCNADZX + bQlpsLT + "");
    }

    //垃圾方法
    private void ukRwkyOH(char yjvvrcf0, byte eydhvdy1, double okgnhsjh2, double dtebdkyp3, byte txkbljfln4) {
        byte txkbljfln4a = txkbljfln4;
        double dtebdkyp3a = dtebdkyp3;
        double okgnhsjh2a = okgnhsjh2;
        byte eydhvdy1a = eydhvdy1;
        char yjvvrcf0a = yjvvrcf0;
        new String("ukRwkyOH" + yjvvrcf0a + dtebdkyp3a + okgnhsjh2a + eydhvdy1a + txkbljfln4a + "ukRwkyOH" + SpLelaE + yLurhUC + BSvxUbm + NnWvaph + bQlpsLT + jxUJOMp + aayXTyN + vCNADZX + gHSeJSK + KLbKwIx + ARGfMKo + wVLOveT + "");
    }

    //垃圾方法
    private void Tcluxoji(char peeuzowuh0, boolean mhotppfawl1, short necweuyrd2, float hmvrexzsp3) {
        float hmvrexzsp3a = hmvrexzsp3;
        short necweuyrd2a = necweuyrd2;
        boolean mhotppfawl1a = mhotppfawl1;
        char peeuzowuh0a = peeuzowuh0;
        Log.w("Tcluxoji", "Tcluxoji" + peeuzowuh0a + hmvrexzsp3a + mhotppfawl1a + necweuyrd2a + "Tcluxoji" + aayXTyN + gHSeJSK + jxUJOMp + ARGfMKo + vCNADZX + BSvxUbm + SpLelaE + wVLOveT + NnWvaph + KLbKwIx + bQlpsLT + yLurhUC + "");
    }

    //垃圾方法
    private void hhMESzQp(boolean twgsvhlya0, long njxnxiqxsf1, byte tkadwne2, long hfppblp3) {
        long hfppblp3a = hfppblp3;
        byte tkadwne2a = tkadwne2;
        long njxnxiqxsf1a = njxnxiqxsf1;
        boolean twgsvhlya0a = twgsvhlya0;
        Log.e("hhMESzQp", "hhMESzQp" + hfppblp3a + tkadwne2a + njxnxiqxsf1a + twgsvhlya0a + "hhMESzQp" + bQlpsLT + KLbKwIx + SpLelaE + ARGfMKo + wVLOveT + BSvxUbm + jxUJOMp + aayXTyN + vCNADZX + gHSeJSK + yLurhUC + NnWvaph + "");
    }

    //垃圾方法
    private void WqbmNSkQ(float dhgjhdz0, int xbjxrjsw1) {
        int xbjxrjsw1a = xbjxrjsw1;
        float dhgjhdz0a = dhgjhdz0;
        new Thread("WqbmNSkQ" + dhgjhdz0a + xbjxrjsw1a + "WqbmNSkQ" + wVLOveT + yLurhUC + BSvxUbm + gHSeJSK + vCNADZX + NnWvaph + bQlpsLT + aayXTyN + jxUJOMp + KLbKwIx + SpLelaE + ARGfMKo + "");
    }

    /**
     * 检查服务是否在前台运行
     */
    public boolean isServiceRunningInForeground(Class<?> serviceClass) {
        int xbjxrjsw1 = 14;
        float dhgjhdz0 = 5.5f;
        long hfppblp3 = 18L;
        byte tkadwne2 = 61;
        long njxnxiqxsf1 = 52L;
        boolean twgsvhlya0 = false;
        float hmvrexzsp3 = 91.91f;
        short necweuyrd2 = 45;
        boolean mhotppfawl1 = true;
        char peeuzowuh0 = 13;
        byte txkbljfln4 = 71;
        double dtebdkyp3 = 36.36;
        double okgnhsjh2 = 52.52;
        byte eydhvdy1 = 58;
        char yjvvrcf0 = 84;
        float vrneagox3 = 43.43f;
        int vdxxrhzqke2 = 19;
        int nythlnok1 = 63;
        int zaxnwuvhoi0 = 15;
        long qviyxllmu3 = 21L;
        float trqlpvy2 = 83.83f;
        float mszhnas1 = 61.61f;
        short jwgptxlz0 = 81;
        float nwsrwciz2 = 79.79f;
        int avzatdwqgq1 = 1;
        double kmijmktug0 = 37.37;
        char qqxgznfqvl0 = 37;
        boolean lbcgnetk1 = false;
        byte mtlnmdpkbv0 = 97;
        char xixatmgm0 = 35;
        int hgueqqaro3 = 42;
        float xvvuhvvr2 = 41.41f;
        char qmifpfjkvi1 = 58;
        float yjhxytnu0 = 31.31f;
        double aaptbsdp2 = 76.76;
        byte uzqyjiid1 = 88;
        int uxgmpoytd0 = 51;
        char rtoqioxzfp1 = 2;
        long hcpjrhrd0 = 40L;
        long qjsnxwefrz4 = 92L;
        long gmnmlrtax3 = 68L;
        float sevzueksx2 = 18.18f;
        char xhfdtfgzu1 = 27;
        float cbafygi0 = 57.57f;
        short wshlntugh0 = 8;
        int someunxgxs0 = 33;
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        MuouGPtM(yjhxytnu0, qmifpfjkvi1, xvvuhvvr2, hgueqqaro3);
        QyXocJVy(wshlntugh0);
        hhMESzQp(twgsvhlya0, njxnxiqxsf1, tkadwne2, hfppblp3);
        cXYRWarE(mtlnmdpkbv0, lbcgnetk1);
        WqbmNSkQ(dhgjhdz0, xbjxrjsw1);
        QyXocJVy(wshlntugh0);
        if (manager == null)
            return false;
        cXYRWarE(mtlnmdpkbv0, lbcgnetk1);
        ukRwkyOH(yjvvrcf0, eydhvdy1, okgnhsjh2, dtebdkyp3, txkbljfln4);
        cXYRWarE(mtlnmdpkbv0, lbcgnetk1);
        DvYFlXFG(zaxnwuvhoi0, nythlnok1, vdxxrhzqke2, vrneagox3);
        try {
            for (ActivityManager.RunningServiceInfo runningService : manager.getRunningServices(Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(runningService.service.getClassName()) && runningService.foreground) {
                    return true;
                }
            }
        } catch (Exception e) {
            if (SpeedManager.isDebug) {
                Log.e(TAG, "Error checking if service is running in foreground: " + e.getMessage());
            }
        }
        return false;
    }

    //垃圾方法
    private void WaDyvYLz(boolean lxjcppdkrc0, byte etrpwue1) {
        byte etrpwue1a = etrpwue1;
        boolean lxjcppdkrc0a = lxjcppdkrc0;
        new String("WaDyvYLz" + etrpwue1a + lxjcppdkrc0a + "WaDyvYLz" + aayXTyN + wVLOveT + jxUJOMp + KLbKwIx + SpLelaE + bQlpsLT + BSvxUbm + vCNADZX + NnWvaph + yLurhUC + gHSeJSK + ARGfMKo + "");
    }

    //垃圾方法
    private void OISGnwcb(char xzehrdu0) {
        char xzehrdu0a = xzehrdu0;
        Log.w("OISGnwcb", "OISGnwcb" + xzehrdu0a + "OISGnwcb" + KLbKwIx + wVLOveT + bQlpsLT + SpLelaE + aayXTyN + vCNADZX + yLurhUC + gHSeJSK + jxUJOMp + ARGfMKo + NnWvaph + BSvxUbm + "");
    }

    //垃圾方法
    private void zYUeglvC(boolean pqskuwwq0, boolean lfsnbzrddy1, int ixpgzxl2, boolean kccrzaltr3) {
        boolean kccrzaltr3a = kccrzaltr3;
        int ixpgzxl2a = ixpgzxl2;
        boolean lfsnbzrddy1a = lfsnbzrddy1;
        boolean pqskuwwq0a = pqskuwwq0;
        new File("zYUeglvC" + kccrzaltr3a + pqskuwwq0a + ixpgzxl2a + lfsnbzrddy1a + "zYUeglvC" + KLbKwIx + gHSeJSK + BSvxUbm + bQlpsLT + ARGfMKo + NnWvaph + wVLOveT + jxUJOMp + vCNADZX + SpLelaE + yLurhUC + aayXTyN + "");
    }

    //垃圾方法
    private void tsognkwB(byte skzjfab0, char yzvjjzgx1, int bxrafrqn2, float rqfwbmuoqj3, byte nkqxfgldty4) {
        byte nkqxfgldty4a = nkqxfgldty4;
        float rqfwbmuoqj3a = rqfwbmuoqj3;
        int bxrafrqn2a = bxrafrqn2;
        char yzvjjzgx1a = yzvjjzgx1;
        byte skzjfab0a = skzjfab0;
        TextUtils.isDigitsOnly("tsognkwB" + bxrafrqn2a + rqfwbmuoqj3a + yzvjjzgx1a + nkqxfgldty4a + skzjfab0a + "tsognkwB" + jxUJOMp + yLurhUC + bQlpsLT + aayXTyN + ARGfMKo + gHSeJSK + BSvxUbm + KLbKwIx + NnWvaph + wVLOveT + vCNADZX + SpLelaE + "");
    }

    /**
     * 发送时间事件
     */
    public void sendTimeTickEvent() {
        byte nkqxfgldty4 = 97;
        float rqfwbmuoqj3 = 3.3f;
        int bxrafrqn2 = 35;
        char yzvjjzgx1 = 16;
        byte skzjfab0 = 82;
        boolean kccrzaltr3 = true;
        int ixpgzxl2 = 97;
        boolean lfsnbzrddy1 = false;
        boolean pqskuwwq0 = true;
        char xzehrdu0 = 14;
        byte etrpwue1 = 28;
        boolean lxjcppdkrc0 = true;
        SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY);
    }

    //垃圾变量
    private int SpLelaE = 59;

    //垃圾变量
    private int JuBJcbT = 49;

    //垃圾变量
    private byte NnWvaph = 44;

    //垃圾变量
    private float BPEtKRm = 92.92f;

    //垃圾变量
    private char yLurhUC = 35;

    //垃圾变量
    private char pJwwGaa = 58;

    //垃圾变量
    private double jxUJOMp = 97.97;

    //垃圾变量
    private float rZDrIFI = 30.30f;

    //垃圾方法
    private void nrTEzXMU(boolean dxgxrzvbjb0, short hgsauebsh1, boolean eizatya2) {
        boolean eizatya2a = eizatya2;
        short hgsauebsh1a = hgsauebsh1;
        boolean dxgxrzvbjb0a = dxgxrzvbjb0;
    }

    //垃圾方法
    private void XvqApSaa(byte ykiuexpcna0, double fspvwmaaw1, short uxdqokz2) {
        short uxdqokz2a = uxdqokz2;
        double fspvwmaaw1a = fspvwmaaw1;
        byte ykiuexpcna0a = ykiuexpcna0;
        new String("XvqApSaa" + fspvwmaaw1a + ykiuexpcna0a + uxdqokz2a + "XvqApSaa" + aayXTyN + bQlpsLT + wVLOveT + KLbKwIx + BSvxUbm + vCNADZX + jxUJOMp + ARGfMKo + SpLelaE + yLurhUC + gHSeJSK + NnWvaph + "");
    }

    //垃圾方法
    private void JOkbPdpY(char ozbqqqfzm0, double aqevpeb1, int owelhugd2, boolean avdusnyrnl3, int pmndlndef4) {
        int pmndlndef4a = pmndlndef4;
        boolean avdusnyrnl3a = avdusnyrnl3;
        int owelhugd2a = owelhugd2;
        double aqevpeb1a = aqevpeb1;
        char ozbqqqfzm0a = ozbqqqfzm0;
        TextUtils.isDigitsOnly("JOkbPdpY" + owelhugd2a + pmndlndef4a + aqevpeb1a + ozbqqqfzm0a + avdusnyrnl3a + "JOkbPdpY" + bQlpsLT + jxUJOMp + KLbKwIx + NnWvaph + SpLelaE + gHSeJSK + wVLOveT + ARGfMKo + BSvxUbm + vCNADZX + aayXTyN + yLurhUC + "");
    }

    //垃圾方法
    private void fhJXflCv(double vethnnlow0) {
        double vethnnlow0a = vethnnlow0;
        Log.e("fhJXflCv", "fhJXflCv" + vethnnlow0a + "fhJXflCv" + NnWvaph + aayXTyN + wVLOveT + jxUJOMp + yLurhUC + KLbKwIx + gHSeJSK + bQlpsLT + vCNADZX + BSvxUbm + SpLelaE + ARGfMKo + "");
    }

    //垃圾方法
    private void iLVOfebI(float kqxsltn0, char jtmgnkgey1) {
        char jtmgnkgey1a = jtmgnkgey1;
        float kqxsltn0a = kqxsltn0;
        Log.w("iLVOfebI", "iLVOfebI" + jtmgnkgey1a + kqxsltn0a + "iLVOfebI" + jxUJOMp + KLbKwIx + bQlpsLT + ARGfMKo + SpLelaE + wVLOveT + vCNADZX + gHSeJSK + NnWvaph + aayXTyN + yLurhUC + BSvxUbm + "");
    }

    //垃圾方法
    private void UYJziRws(double avwycccb0, char prjnbvki1, int jnybvof2, boolean jlscsisub3) {
        boolean jlscsisub3a = jlscsisub3;
        int jnybvof2a = jnybvof2;
        char prjnbvki1a = prjnbvki1;
        double avwycccb0a = avwycccb0;
    }

    //垃圾方法
    private void vdAvXkfL(long utiqervbed0, double dnklctm1, int oigydpup2) {
        int oigydpup2a = oigydpup2;
        double dnklctm1a = dnklctm1;
        long utiqervbed0a = utiqervbed0;
        new AttributedString("vdAvXkfL" + dnklctm1a + oigydpup2a + utiqervbed0a + "vdAvXkfL" + KLbKwIx + BSvxUbm + aayXTyN + wVLOveT + gHSeJSK + ARGfMKo + yLurhUC + SpLelaE + NnWvaph + vCNADZX + jxUJOMp + bQlpsLT + "");
    }

    //垃圾方法
    private void ETXjLdhH(char mdablbvz0) {
        char mdablbvz0a = mdablbvz0;
        Log.i("ETXjLdhH", "ETXjLdhH" + mdablbvz0a + "ETXjLdhH" + gHSeJSK + bQlpsLT + KLbKwIx + jxUJOMp + ARGfMKo + aayXTyN + vCNADZX + NnWvaph + BSvxUbm + yLurhUC + SpLelaE + wVLOveT + "");
    }

    public String toString() {
        char mdablbvz0 = 15;
        int oigydpup2 = 24;
        double dnklctm1 = 43.43;
        long utiqervbed0 = 21L;
        boolean jlscsisub3 = true;
        int jnybvof2 = 23;
        char prjnbvki1 = 14;
        double avwycccb0 = 47.47;
        char jtmgnkgey1 = 15;
        float kqxsltn0 = 14.14f;
        double vethnnlow0 = 70.70;
        int pmndlndef4 = 95;
        boolean avdusnyrnl3 = true;
        int owelhugd2 = 35;
        double aqevpeb1 = 15.15;
        char ozbqqqfzm0 = 6;
        short uxdqokz2 = 86;
        double fspvwmaaw1 = 29.29;
        byte ykiuexpcna0 = 28;
        boolean eizatya2 = true;
        short hgsauebsh1 = 95;
        boolean dxgxrzvbjb0 = false;
        ETXjLdhH(mdablbvz0);
        fhJXflCv(vethnnlow0);
        ETXjLdhH(mdablbvz0);
        XvqApSaa(ykiuexpcna0, fspvwmaaw1, uxdqokz2);
        nrTEzXMU(dxgxrzvbjb0, hgsauebsh1, eizatya2);
        JOkbPdpY(ozbqqqfzm0, aqevpeb1, owelhugd2, avdusnyrnl3, pmndlndef4);
        nrTEzXMU(dxgxrzvbjb0, hgsauebsh1, eizatya2);
        System.out.println("" + pJwwGaa + rZDrIFI + JuBJcbT + BPEtKRm + "");
        return super.toString();
    }
}
