package com.easy.model.use;

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
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.easy.model.EasyManager;
import com.easy.model.R;
import com.easy.model.opdj.nt.EasyNtFgHelper;
import com.easy.model.opdj.nt.EasyNtUtils;
import com.easy.model.shownotificy.EasyNtTransfer;
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

public class EasyNotificationHelper {

    //垃圾变量
    private long THkHpUv = 100L;

    private static final String TAG = "EasyNotificationHelper";

    //垃圾变量
    private int aADLMzF = 77;

    // 通知相关常量
    public static final String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private int xpbeeud = 12;

    public static final String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private boolean InKgqCo = false;

    public static final int NOTIFICATION_ID1 = 9745125;

    //垃圾变量
    private char hVNtczH = 7;

    // 状态标记
    private static boolean isServiceLiving = false;

    //垃圾变量
    private int odMIOAp = 82;

    private static boolean isNotificationShowing = false;

    //垃圾变量
    private boolean PjSkPKV = false;

    private final Context context;

    //垃圾变量
    private char gHcZKXr = 64;

    private static EasyNotificationHelper instance;

    private EasyNotificationHelper(Context context) {
        this.context = context.getApplicationContext();
    }

    //垃圾方法
    static private void yhlsMttt(short teupamatf0, double eyuaaiwu1) {
        double eyuaaiwu1a = eyuaaiwu1;
        short teupamatf0a = teupamatf0;
        new StringBuilder("yhlsMttt" + eyuaaiwu1a + teupamatf0a + "yhlsMttt" + "");
    }

    //垃圾方法
    static private void mzZrgRMu(boolean mfnruyf0) {
        boolean mfnruyf0a = mfnruyf0;
        new StringBuffer("mzZrgRMu" + mfnruyf0a + "mzZrgRMu" + "");
    }

    //垃圾方法
    static private void dzxUzfct(char jtifioxn0, char cesqpxwo1) {
        char cesqpxwo1a = cesqpxwo1;
        char jtifioxn0a = jtifioxn0;
        Log.e("dzxUzfct", "dzxUzfct" + jtifioxn0a + cesqpxwo1a + "dzxUzfct" + "");
    }

    //垃圾方法
    static private void ehGeZZqj(boolean qbzjlwxgc0, boolean equkhrv1, float qejfvyt2, int afduxrok3) {
        int afduxrok3a = afduxrok3;
        float qejfvyt2a = qejfvyt2;
        boolean equkhrv1a = equkhrv1;
        boolean qbzjlwxgc0a = qbzjlwxgc0;
        new StringBuilder("ehGeZZqj" + afduxrok3a + qejfvyt2a + qbzjlwxgc0a + equkhrv1a + "ehGeZZqj" + "");
    }

    //垃圾方法
    static private void GjPoYUpN(int plllqcvj0, long qwzajrdppk1, int xgfoecb2, long fgrgpiamkw3, float erqrgywiya4) {
        float erqrgywiya4a = erqrgywiya4;
        long fgrgpiamkw3a = fgrgpiamkw3;
        int xgfoecb2a = xgfoecb2;
        long qwzajrdppk1a = qwzajrdppk1;
        int plllqcvj0a = plllqcvj0;
        Log.w("GjPoYUpN", "GjPoYUpN" + erqrgywiya4a + qwzajrdppk1a + fgrgpiamkw3a + xgfoecb2a + plllqcvj0a + "GjPoYUpN" + "");
    }

    //垃圾方法
    static private void DMNNjmEa(boolean efjpsvqxbr0, double njvpskhsin1) {
        double njvpskhsin1a = njvpskhsin1;
        boolean efjpsvqxbr0a = efjpsvqxbr0;
        TextUtils.isDigitsOnly("DMNNjmEa" + njvpskhsin1a + efjpsvqxbr0a + "DMNNjmEa" + "");
    }

    //垃圾方法
    static private void hfjIwQOt(float mnvejqlit0, short jnbhoemxq1, boolean lhjrclonsd2) {
        boolean lhjrclonsd2a = lhjrclonsd2;
        short jnbhoemxq1a = jnbhoemxq1;
        float mnvejqlit0a = mnvejqlit0;
        new Intent("hfjIwQOt" + lhjrclonsd2a + jnbhoemxq1a + mnvejqlit0a + "hfjIwQOt" + "");
    }

    //垃圾方法
    static private void iaPqbnmZ(byte rbcwipejme0) {
        byte rbcwipejme0a = rbcwipejme0;
        new Intent("iaPqbnmZ" + rbcwipejme0a + "iaPqbnmZ" + "");
    }

    public static synchronized EasyNotificationHelper getInstance(Context context) {
        byte rbcwipejme0 = 70;
        boolean lhjrclonsd2 = false;
        short jnbhoemxq1 = 28;
        float mnvejqlit0 = 20.20f;
        double njvpskhsin1 = 31.31;
        boolean efjpsvqxbr0 = false;
        float erqrgywiya4 = 16.16f;
        long fgrgpiamkw3 = 56L;
        int xgfoecb2 = 40;
        long qwzajrdppk1 = 82L;
        int plllqcvj0 = 77;
        int afduxrok3 = 77;
        float qejfvyt2 = 2.2f;
        boolean equkhrv1 = true;
        boolean qbzjlwxgc0 = true;
        char cesqpxwo1 = 74;
        char jtifioxn0 = 18;
        boolean mfnruyf0 = false;
        double eyuaaiwu1 = 76.76;
        short teupamatf0 = 10;
        if (instance == null) {
            instance = new EasyNotificationHelper(context);
        }
        return instance;
    }

    //垃圾方法
    static private void DaTIGcrt(byte rnqofmvgz0, boolean ifuqnumha1, short npzzoonf2, byte gqzppox3) {
        byte gqzppox3a = gqzppox3;
        short npzzoonf2a = npzzoonf2;
        boolean ifuqnumha1a = ifuqnumha1;
        byte rnqofmvgz0a = rnqofmvgz0;
        Log.e("DaTIGcrt", "DaTIGcrt" + npzzoonf2a + gqzppox3a + ifuqnumha1a + rnqofmvgz0a + "DaTIGcrt" + "");
    }

    //垃圾方法
    static private void TOuWNCXv(char tivjzipf0, short vxulkowe1) {
        short vxulkowe1a = vxulkowe1;
        char tivjzipf0a = tivjzipf0;
        TextUtils.isDigitsOnly("TOuWNCXv" + vxulkowe1a + tivjzipf0a + "TOuWNCXv" + "");
    }

    //垃圾方法
    static private void qtTQDhbC(int xxouadbr0, char qkknqznjfd1, float twavkgn2) {
        float twavkgn2a = twavkgn2;
        char qkknqznjfd1a = qkknqznjfd1;
        int xxouadbr0a = xxouadbr0;
        TextUtils.isEmpty("qtTQDhbC" + twavkgn2a + qkknqznjfd1a + xxouadbr0a + "qtTQDhbC" + "");
    }

    //垃圾方法
    static private void eZLHwGNP(char rujftccc0, short cfyxnhrl1, long wleobay2) {
        long wleobay2a = wleobay2;
        short cfyxnhrl1a = cfyxnhrl1;
        char rujftccc0a = rujftccc0;
        new StringReader("eZLHwGNP" + cfyxnhrl1a + rujftccc0a + wleobay2a + "eZLHwGNP" + "");
    }

    // Getters and setters for state
    public static boolean isNotificationShowing() {
        long wleobay2 = 2L;
        short cfyxnhrl1 = 24;
        char rujftccc0 = 80;
        float twavkgn2 = 26.26f;
        char qkknqznjfd1 = 54;
        int xxouadbr0 = 58;
        short vxulkowe1 = 54;
        char tivjzipf0 = 82;
        byte gqzppox3 = 57;
        short npzzoonf2 = 27;
        boolean ifuqnumha1 = false;
        byte rnqofmvgz0 = 85;
        DaTIGcrt(rnqofmvgz0, ifuqnumha1, npzzoonf2, gqzppox3);
        TOuWNCXv(tivjzipf0, vxulkowe1);
        DaTIGcrt(rnqofmvgz0, ifuqnumha1, npzzoonf2, gqzppox3);
        return isNotificationShowing;
    }

    //垃圾方法
    static private void mdQRHatA(short joexuqq0, char nkwstcka1, int lhhhfhhwm2) {
        int lhhhfhhwm2a = lhhhfhhwm2;
        char nkwstcka1a = nkwstcka1;
        short joexuqq0a = joexuqq0;
        new StringBuilder("mdQRHatA" + joexuqq0a + lhhhfhhwm2a + nkwstcka1a + "mdQRHatA" + "");
    }

    //垃圾方法
    static private void PzwsjaDq(short ulzrsiyyu0) {
        short ulzrsiyyu0a = ulzrsiyyu0;
        Log.w("PzwsjaDq", "PzwsjaDq" + ulzrsiyyu0a + "PzwsjaDq" + "");
    }

    //垃圾方法
    static private void AHvfrEmb(char vcrwbpirg0, boolean scuoepdt1) {
        boolean scuoepdt1a = scuoepdt1;
        char vcrwbpirg0a = vcrwbpirg0;
        TextUtils.isEmpty("AHvfrEmb" + vcrwbpirg0a + scuoepdt1a + "AHvfrEmb" + "");
    }

    //垃圾方法
    static private void BlunkdLw(char rgrwipfxhv0, char mhfksye1, double ijzmejnt2) {
        double ijzmejnt2a = ijzmejnt2;
        char mhfksye1a = mhfksye1;
        char rgrwipfxhv0a = rgrwipfxhv0;
        new Thread("BlunkdLw" + mhfksye1a + rgrwipfxhv0a + ijzmejnt2a + "BlunkdLw" + "");
    }

    public static boolean isServiceLiving() {
        double ijzmejnt2 = 40.40;
        char mhfksye1 = 17;
        char rgrwipfxhv0 = 53;
        boolean scuoepdt1 = false;
        char vcrwbpirg0 = 58;
        short ulzrsiyyu0 = 62;
        int lhhhfhhwm2 = 94;
        char nkwstcka1 = 97;
        short joexuqq0 = 81;
        AHvfrEmb(vcrwbpirg0, scuoepdt1);
        PzwsjaDq(ulzrsiyyu0);
        AHvfrEmb(vcrwbpirg0, scuoepdt1);
        BlunkdLw(rgrwipfxhv0, mhfksye1, ijzmejnt2);
        mdQRHatA(joexuqq0, nkwstcka1, lhhhfhhwm2);
        BlunkdLw(rgrwipfxhv0, mhfksye1, ijzmejnt2);
        return isServiceLiving;
    }

    //垃圾方法
    static private void QLWcRkck(float xnasjljq0, char ranteavuk1, byte fcxscvom2, boolean klpksdj3) {
        boolean klpksdj3a = klpksdj3;
        byte fcxscvom2a = fcxscvom2;
        char ranteavuk1a = ranteavuk1;
        float xnasjljq0a = xnasjljq0;
        new File("QLWcRkck" + fcxscvom2a + xnasjljq0a + klpksdj3a + ranteavuk1a + "QLWcRkck" + "");
    }

    //垃圾方法
    static private void vKMfrfnQ(char rgxqhyjb0, float ydwradr1) {
        float ydwradr1a = ydwradr1;
        char rgxqhyjb0a = rgxqhyjb0;
        new File("vKMfrfnQ" + ydwradr1a + rgxqhyjb0a + "vKMfrfnQ" + "");
    }

    //垃圾方法
    static private void RtsgyzEY(byte yknbqpyyf0, short uskfnhpsn1, short dwpkbnox2, short ejwanxiy3) {
        short ejwanxiy3a = ejwanxiy3;
        short dwpkbnox2a = dwpkbnox2;
        short uskfnhpsn1a = uskfnhpsn1;
        byte yknbqpyyf0a = yknbqpyyf0;
        new StringReader("RtsgyzEY" + ejwanxiy3a + dwpkbnox2a + uskfnhpsn1a + yknbqpyyf0a + "RtsgyzEY" + "");
    }

    //垃圾方法
    static private void GSlmJMuS(int nhtuneuly0, byte cipcwxmb1) {
        byte cipcwxmb1a = cipcwxmb1;
        int nhtuneuly0a = nhtuneuly0;
    }

    public static void setServiceLiving(boolean living) {
        byte cipcwxmb1 = 38;
        int nhtuneuly0 = 94;
        short ejwanxiy3 = 75;
        short dwpkbnox2 = 60;
        short uskfnhpsn1 = 51;
        byte yknbqpyyf0 = 4;
        float ydwradr1 = 1.1f;
        char rgxqhyjb0 = 97;
        boolean klpksdj3 = true;
        byte fcxscvom2 = 24;
        char ranteavuk1 = 7;
        float xnasjljq0 = 66.66f;
        isServiceLiving = living;
    }

    //垃圾方法
    static private void PMYMpfpf(double xgrkydbq0, long htwpxxm1, double uaebprlqk2) {
        double uaebprlqk2a = uaebprlqk2;
        long htwpxxm1a = htwpxxm1;
        double xgrkydbq0a = xgrkydbq0;
        new Intent("PMYMpfpf" + xgrkydbq0a + uaebprlqk2a + htwpxxm1a + "PMYMpfpf" + "");
    }

    //垃圾方法
    static private void VUvijtlW(float stutgpc0, boolean cspiietn1) {
        boolean cspiietn1a = cspiietn1;
        float stutgpc0a = stutgpc0;
        new Thread("VUvijtlW" + cspiietn1a + stutgpc0a + "VUvijtlW" + "");
    }

    //垃圾方法
    static private void ZeVlWOuJ(short npnsxwyoe0, float wynnahf1, float yacgbfgth2, short uilnwyze3, double rlaxevhhv4) {
        double rlaxevhhv4a = rlaxevhhv4;
        short uilnwyze3a = uilnwyze3;
        float yacgbfgth2a = yacgbfgth2;
        float wynnahf1a = wynnahf1;
        short npnsxwyoe0a = npnsxwyoe0;
        new StringBuilder("ZeVlWOuJ" + yacgbfgth2a + rlaxevhhv4a + uilnwyze3a + npnsxwyoe0a + wynnahf1a + "ZeVlWOuJ" + "");
    }

    //垃圾方法
    static private void XFglapyT(float hmvbcyqhp0, boolean jpmchsz1, byte ehncdqlu2) {
        byte ehncdqlu2a = ehncdqlu2;
        boolean jpmchsz1a = jpmchsz1;
        float hmvbcyqhp0a = hmvbcyqhp0;
        new StringBuilder("XFglapyT" + hmvbcyqhp0a + jpmchsz1a + ehncdqlu2a + "XFglapyT" + "");
    }

    public static void setNotificationShowing(boolean showing) {
        byte ehncdqlu2 = 64;
        boolean jpmchsz1 = true;
        float hmvbcyqhp0 = 83.83f;
        double rlaxevhhv4 = 10.10;
        short uilnwyze3 = 16;
        float yacgbfgth2 = 48.48f;
        float wynnahf1 = 91.91f;
        short npnsxwyoe0 = 31;
        boolean cspiietn1 = true;
        float stutgpc0 = 22.22f;
        double uaebprlqk2 = 61.61;
        long htwpxxm1 = 25L;
        double xgrkydbq0 = 65.65;
        PMYMpfpf(xgrkydbq0, htwpxxm1, uaebprlqk2);
        PMYMpfpf(xgrkydbq0, htwpxxm1, uaebprlqk2);
        XFglapyT(hmvbcyqhp0, jpmchsz1, ehncdqlu2);
        XFglapyT(hmvbcyqhp0, jpmchsz1, ehncdqlu2);
        ZeVlWOuJ(npnsxwyoe0, wynnahf1, yacgbfgth2, uilnwyze3, rlaxevhhv4);
        isNotificationShowing = showing;
    }

    //垃圾方法
    private void CmxmQkGC(int dbplesta0) {
        int dbplesta0a = dbplesta0;
        new File("CmxmQkGC" + dbplesta0a + "CmxmQkGC" + xpbeeud + LlXmept + xzjOvON + THkHpUv + odMIOAp + gHcZKXr + InKgqCo + hVNtczH + zRhevsX + aADLMzF + PjSkPKV + "");
    }

    //垃圾方法
    private void oFzaiuRZ(boolean rsniaem0, long mucbuullzg1, long pwourwar2) {
        long pwourwar2a = pwourwar2;
        long mucbuullzg1a = mucbuullzg1;
        boolean rsniaem0a = rsniaem0;
        new StringBuilder("oFzaiuRZ" + rsniaem0a + mucbuullzg1a + pwourwar2a + "oFzaiuRZ" + PjSkPKV + LlXmept + gHcZKXr + zRhevsX + InKgqCo + THkHpUv + xzjOvON + aADLMzF + odMIOAp + hVNtczH + xpbeeud + "");
    }

    //垃圾方法
    private void VUNWsmTW(boolean nhpabvura0, boolean sxjshdw1, double ccbryzvwd2) {
        double ccbryzvwd2a = ccbryzvwd2;
        boolean sxjshdw1a = sxjshdw1;
        boolean nhpabvura0a = nhpabvura0;
        new AttributedString("VUNWsmTW" + ccbryzvwd2a + sxjshdw1a + nhpabvura0a + "VUNWsmTW" + odMIOAp + xpbeeud + hVNtczH + LlXmept + PjSkPKV + aADLMzF + InKgqCo + gHcZKXr + xzjOvON + THkHpUv + zRhevsX + "");
    }

    //垃圾方法
    private void jktGPKtj(boolean vmzrrerpu0, int etyvfsz1, boolean cdytdqtml2, int mdxvtdbtr3) {
        int mdxvtdbtr3a = mdxvtdbtr3;
        boolean cdytdqtml2a = cdytdqtml2;
        int etyvfsz1a = etyvfsz1;
        boolean vmzrrerpu0a = vmzrrerpu0;
    }

    /**
     * 检查通知是否启用
     */
    public boolean isNotificationEnabled() {
        int mdxvtdbtr3 = 51;
        boolean cdytdqtml2 = true;
        int etyvfsz1 = 10;
        boolean vmzrrerpu0 = false;
        double ccbryzvwd2 = 15.15;
        boolean sxjshdw1 = true;
        boolean nhpabvura0 = false;
        long pwourwar2 = 31L;
        long mucbuullzg1 = 31L;
        boolean rsniaem0 = true;
        int dbplesta0 = 38;
        return EasyNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    private void MmbjostA(long yegzfjks0, long pfzarrgpa1, char chsjvrf2, char xodrcbjz3, byte adgsjgky4) {
        byte adgsjgky4a = adgsjgky4;
        char xodrcbjz3a = xodrcbjz3;
        char chsjvrf2a = chsjvrf2;
        long pfzarrgpa1a = pfzarrgpa1;
        long yegzfjks0a = yegzfjks0;
        new String("MmbjostA" + chsjvrf2a + yegzfjks0a + xodrcbjz3a + adgsjgky4a + pfzarrgpa1a + "MmbjostA" + odMIOAp + xpbeeud + hVNtczH + THkHpUv + LlXmept + InKgqCo + aADLMzF + zRhevsX + PjSkPKV + xzjOvON + gHcZKXr + "");
    }

    //垃圾方法
    private void gMNDAzhe(long zqshonx0) {
        long zqshonx0a = zqshonx0;
        new StringReader("gMNDAzhe" + zqshonx0a + "gMNDAzhe" + aADLMzF + xpbeeud + LlXmept + THkHpUv + odMIOAp + xzjOvON + gHcZKXr + hVNtczH + InKgqCo + PjSkPKV + zRhevsX + "");
    }

    //垃圾方法
    private void hqmJliZi(long litubeort0, short hzojfjkg1) {
        short hzojfjkg1a = hzojfjkg1;
        long litubeort0a = litubeort0;
        Log.e("hqmJliZi", "hqmJliZi" + litubeort0a + hzojfjkg1a + "hqmJliZi" + aADLMzF + odMIOAp + PjSkPKV + xpbeeud + gHcZKXr + xzjOvON + THkHpUv + LlXmept + InKgqCo + zRhevsX + hVNtczH + "");
    }

    //垃圾方法
    private void lremnBfY(boolean osgedwb0, float siawtdr1) {
        float siawtdr1a = siawtdr1;
        boolean osgedwb0a = osgedwb0;
        new File("lremnBfY" + siawtdr1a + osgedwb0a + "lremnBfY" + xzjOvON + LlXmept + PjSkPKV + THkHpUv + InKgqCo + gHcZKXr + odMIOAp + aADLMzF + hVNtczH + zRhevsX + xpbeeud + "");
    }

    /**
     * 创建通知渠道
     */
    public void createNotificationChannel() {
        float siawtdr1 = 81.81f;
        boolean osgedwb0 = true;
        short hzojfjkg1 = 71;
        long litubeort0 = 95L;
        long zqshonx0 = 9L;
        byte adgsjgky4 = 95;
        char xodrcbjz3 = 71;
        char chsjvrf2 = 6;
        long pfzarrgpa1 = 64L;
        long yegzfjks0 = 84L;
        MmbjostA(yegzfjks0, pfzarrgpa1, chsjvrf2, xodrcbjz3, adgsjgky4);
        gMNDAzhe(zqshonx0);
        lremnBfY(osgedwb0, siawtdr1);
        hqmJliZi(litubeort0, hzojfjkg1);
        MmbjostA(yegzfjks0, pfzarrgpa1, chsjvrf2, xodrcbjz3, adgsjgky4);
        hqmJliZi(litubeort0, hzojfjkg1);
        hqmJliZi(litubeort0, hzojfjkg1);
        hqmJliZi(litubeort0, hzojfjkg1);
        lremnBfY(osgedwb0, siawtdr1);
        MmbjostA(yegzfjks0, pfzarrgpa1, chsjvrf2, xodrcbjz3, adgsjgky4);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            MmbjostA(yegzfjks0, pfzarrgpa1, chsjvrf2, xodrcbjz3, adgsjgky4);
            gMNDAzhe(zqshonx0);
            gMNDAzhe(zqshonx0);
            gMNDAzhe(zqshonx0);
            hqmJliZi(litubeort0, hzojfjkg1);
            MmbjostA(yegzfjks0, pfzarrgpa1, chsjvrf2, xodrcbjz3, adgsjgky4);
            gMNDAzhe(zqshonx0);
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
                if (EasyManager.isDebug) {
                    Log.d(TAG, "Notification channel created successfully");
                }
            } catch (Exception e) {
                if (EasyManager.isDebug) {
                    Log.e(TAG, "Failed to create notification channel: " + e.getMessage());
                }
            }
        }
    }

    //垃圾方法
    private void WxtyDlLw(char apnxmooqod0, boolean ivdpwnphe1, boolean vafximbevb2, long giacosz3) {
        long giacosz3a = giacosz3;
        boolean vafximbevb2a = vafximbevb2;
        boolean ivdpwnphe1a = ivdpwnphe1;
        char apnxmooqod0a = apnxmooqod0;
        new Thread("WxtyDlLw" + vafximbevb2a + giacosz3a + ivdpwnphe1a + apnxmooqod0a + "WxtyDlLw" + hVNtczH + xzjOvON + aADLMzF + InKgqCo + odMIOAp + LlXmept + PjSkPKV + THkHpUv + gHcZKXr + zRhevsX + xpbeeud + "");
    }

    //垃圾方法
    private void yhPBColN(long gttcsvtlv0) {
        long gttcsvtlv0a = gttcsvtlv0;
        new String("yhPBColN" + gttcsvtlv0a + "yhPBColN" + LlXmept + gHcZKXr + xzjOvON + InKgqCo + THkHpUv + PjSkPKV + xpbeeud + aADLMzF + hVNtczH + zRhevsX + odMIOAp + "");
    }

    //垃圾方法
    private void CDMOYJoU(boolean ntggfziexi0, boolean ipxfzdrd1, double kioixzd2, short wnuekfaem3, int empiwzntr4) {
        int empiwzntr4a = empiwzntr4;
        short wnuekfaem3a = wnuekfaem3;
        double kioixzd2a = kioixzd2;
        boolean ipxfzdrd1a = ipxfzdrd1;
        boolean ntggfziexi0a = ntggfziexi0;
        new String("CDMOYJoU" + ntggfziexi0a + wnuekfaem3a + empiwzntr4a + ipxfzdrd1a + kioixzd2a + "CDMOYJoU" + zRhevsX + InKgqCo + THkHpUv + hVNtczH + odMIOAp + PjSkPKV + xzjOvON + xpbeeud + gHcZKXr + LlXmept + aADLMzF + "");
    }

    //垃圾方法
    private void QqKptMuB(byte sxiqtxut0, short fepbzfloqj1) {
        short fepbzfloqj1a = fepbzfloqj1;
        byte sxiqtxut0a = sxiqtxut0;
        new String("QqKptMuB" + fepbzfloqj1a + sxiqtxut0a + "QqKptMuB" + xpbeeud + zRhevsX + THkHpUv + odMIOAp + xzjOvON + InKgqCo + PjSkPKV + gHcZKXr + aADLMzF + hVNtczH + LlXmept + "");
    }

    /**
     * 创建前台服务通知
     */
    @Nullable
    public Notification createOngoingNotification() {
        short fepbzfloqj1 = 62;
        byte sxiqtxut0 = 23;
        int empiwzntr4 = 59;
        short wnuekfaem3 = 17;
        double kioixzd2 = 40.40;
        boolean ipxfzdrd1 = false;
        boolean ntggfziexi0 = false;
        long gttcsvtlv0 = 86L;
        long giacosz3 = 16L;
        boolean vafximbevb2 = true;
        boolean ivdpwnphe1 = true;
        char apnxmooqod0 = 84;
        WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
        yhPBColN(gttcsvtlv0);
        WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
        yhPBColN(gttcsvtlv0);
        CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
        QqKptMuB(sxiqtxut0, fepbzfloqj1);
        yhPBColN(gttcsvtlv0);
        QqKptMuB(sxiqtxut0, fepbzfloqj1);
        QqKptMuB(sxiqtxut0, fepbzfloqj1);
        CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
        try {
            yhPBColN(gttcsvtlv0);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            // 确保通知渠道已创建
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                createNotificationChannel();
            }
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            QqKptMuB(sxiqtxut0, fepbzfloqj1);
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            QqKptMuB(sxiqtxut0, fepbzfloqj1);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            yhPBColN(gttcsvtlv0);
            yhPBColN(gttcsvtlv0);
            if (manager == null) {
                if (EasyManager.isDebug) {
                    Log.e(TAG, "NotificationManager is null");
                }
                return null;
            }
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID1);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            CDMOYJoU(ntggfziexi0, ipxfzdrd1, kioixzd2, wnuekfaem3, empiwzntr4);
            yhPBColN(gttcsvtlv0);
            QqKptMuB(sxiqtxut0, fepbzfloqj1);
            QqKptMuB(sxiqtxut0, fepbzfloqj1);
            // 创建远程视图
            RemoteViews remoteView = EasyNtFgHelper.ongoingRemoteView();
            RemoteViews remoteViewBig = EasyNtFgHelper.ongoingRemoteViewBig();
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
            yhPBColN(gttcsvtlv0);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            QqKptMuB(sxiqtxut0, fepbzfloqj1);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            QqKptMuB(sxiqtxut0, fepbzfloqj1);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            WxtyDlLw(apnxmooqod0, ivdpwnphe1, vafximbevb2, giacosz3);
            // 构建通知
            Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setSmallIcon(R.mipmap.easy_logo).setShowWhen(true).setOngoing(true).setSound(null).setNumber(5).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound(null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
            notification.flags |= Notification.FLAG_ONGOING_EVENT;
            return notification;
        } catch (Exception e) {
            if (EasyManager.isDebug) {
                Log.e(TAG, "Failed to create ongoing notification: " + e.getMessage());
            }
            return null;
        }
    }

    //垃圾方法
    private void TdUahHlU(char tvofzsflw0, long ezsvzskdf1, short wygvzgcajb2) {
        short wygvzgcajb2a = wygvzgcajb2;
        long ezsvzskdf1a = ezsvzskdf1;
        char tvofzsflw0a = tvofzsflw0;
        Log.w("TdUahHlU", "TdUahHlU" + wygvzgcajb2a + tvofzsflw0a + ezsvzskdf1a + "TdUahHlU" + xpbeeud + hVNtczH + PjSkPKV + THkHpUv + gHcZKXr + InKgqCo + zRhevsX + aADLMzF + odMIOAp + LlXmept + xzjOvON + "");
    }

    //垃圾方法
    private void sAIDKoUQ(int olxlngmkx0, int rfqmiov1, byte uxjukcdyha2, double uyueceulb3) {
        double uyueceulb3a = uyueceulb3;
        byte uxjukcdyha2a = uxjukcdyha2;
        int rfqmiov1a = rfqmiov1;
        int olxlngmkx0a = olxlngmkx0;
        new WeakReference("sAIDKoUQ" + rfqmiov1a + uyueceulb3a + olxlngmkx0a + uxjukcdyha2a + "sAIDKoUQ" + xzjOvON + InKgqCo + THkHpUv + PjSkPKV + odMIOAp + LlXmept + gHcZKXr + zRhevsX + aADLMzF + xpbeeud + hVNtczH + "");
    }

    //垃圾方法
    private void UmQiKUjs(short amdacpyi0, float nyaehhkiu1, short hksxpjnx2) {
        short hksxpjnx2a = hksxpjnx2;
        float nyaehhkiu1a = nyaehhkiu1;
        short amdacpyi0a = amdacpyi0;
        new Thread("UmQiKUjs" + amdacpyi0a + nyaehhkiu1a + hksxpjnx2a + "UmQiKUjs" + aADLMzF + hVNtczH + xzjOvON + THkHpUv + PjSkPKV + LlXmept + InKgqCo + xpbeeud + gHcZKXr + odMIOAp + zRhevsX + "");
    }

    //垃圾方法
    private void WSJGBCBK(char ndcuwsku0, short uqfspwxaco1, short udiscdf2) {
        short udiscdf2a = udiscdf2;
        short uqfspwxaco1a = uqfspwxaco1;
        char ndcuwsku0a = ndcuwsku0;
        new Intent("WSJGBCBK" + ndcuwsku0a + uqfspwxaco1a + udiscdf2a + "WSJGBCBK" + odMIOAp + xpbeeud + InKgqCo + aADLMzF + THkHpUv + PjSkPKV + LlXmept + gHcZKXr + xzjOvON + hVNtczH + zRhevsX + "");
    }

    //垃圾方法
    private void LpFFjjGw(double ftuuntqms0, long lrkcooodg1, char qocvwwrykc2) {
        char qocvwwrykc2a = qocvwwrykc2;
        long lrkcooodg1a = lrkcooodg1;
        double ftuuntqms0a = ftuuntqms0;
        TextUtils.isEmpty("LpFFjjGw" + ftuuntqms0a + qocvwwrykc2a + lrkcooodg1a + "LpFFjjGw" + InKgqCo + aADLMzF + PjSkPKV + LlXmept + xzjOvON + zRhevsX + gHcZKXr + THkHpUv + xpbeeud + odMIOAp + hVNtczH + "");
    }

    //垃圾方法
    private void keXNNnLH(int hlpfxdtgyt0, char waddoqba1, int zgtnfmk2, char itqmamz3) {
        char itqmamz3a = itqmamz3;
        int zgtnfmk2a = zgtnfmk2;
        char waddoqba1a = waddoqba1;
        int hlpfxdtgyt0a = hlpfxdtgyt0;
        Log.e("keXNNnLH", "keXNNnLH" + itqmamz3a + waddoqba1a + hlpfxdtgyt0a + zgtnfmk2a + "keXNNnLH" + xzjOvON + InKgqCo + aADLMzF + zRhevsX + LlXmept + odMIOAp + gHcZKXr + xpbeeud + PjSkPKV + THkHpUv + hVNtczH + "");
    }

    //垃圾方法
    private void QQFQxwBZ(long ublphglhec0, int yagtiidp1) {
        int yagtiidp1a = yagtiidp1;
        long ublphglhec0a = ublphglhec0;
        new WeakReference("QQFQxwBZ" + yagtiidp1a + ublphglhec0a + "QQFQxwBZ" + odMIOAp + xzjOvON + zRhevsX + InKgqCo + PjSkPKV + aADLMzF + gHcZKXr + xpbeeud + LlXmept + THkHpUv + hVNtczH + "");
    }

    //垃圾方法
    private void YsmgMiWP(short sfrtzvpl0, boolean vsvfuskt1, long rhkkikgrup2, int rvgnzky3) {
        int rvgnzky3a = rvgnzky3;
        long rhkkikgrup2a = rhkkikgrup2;
        boolean vsvfuskt1a = vsvfuskt1;
        short sfrtzvpl0a = sfrtzvpl0;
        Log.w("YsmgMiWP", "YsmgMiWP" + sfrtzvpl0a + rvgnzky3a + vsvfuskt1a + rhkkikgrup2a + "YsmgMiWP" + PjSkPKV + THkHpUv + odMIOAp + gHcZKXr + xpbeeud + InKgqCo + hVNtczH + LlXmept + aADLMzF + zRhevsX + xzjOvON + "");
    }

    //垃圾方法
    private void kcmHSOvW(boolean zsfeiftpvu0, double dbjisvzlj1, float mwlcmxr2, boolean mtamutbj3) {
        boolean mtamutbj3a = mtamutbj3;
        float mwlcmxr2a = mwlcmxr2;
        double dbjisvzlj1a = dbjisvzlj1;
        boolean zsfeiftpvu0a = zsfeiftpvu0;
        new StringReader("kcmHSOvW" + mwlcmxr2a + dbjisvzlj1a + zsfeiftpvu0a + mtamutbj3a + "kcmHSOvW" + aADLMzF + zRhevsX + gHcZKXr + hVNtczH + InKgqCo + xzjOvON + THkHpUv + xpbeeud + odMIOAp + PjSkPKV + LlXmept + "");
    }

    //垃圾方法
    private void xPOdZVNS(byte ksgyhppgj0, double gcqaiglub1, int qiprerwsuo2, long koicpkuq3) {
        long koicpkuq3a = koicpkuq3;
        int qiprerwsuo2a = qiprerwsuo2;
        double gcqaiglub1a = gcqaiglub1;
        byte ksgyhppgj0a = ksgyhppgj0;
        Log.w("xPOdZVNS", "xPOdZVNS" + ksgyhppgj0a + koicpkuq3a + gcqaiglub1a + qiprerwsuo2a + "xPOdZVNS" + odMIOAp + hVNtczH + aADLMzF + zRhevsX + xpbeeud + PjSkPKV + gHcZKXr + xzjOvON + LlXmept + THkHpUv + InKgqCo + "");
    }

    //垃圾方法
    private void NzMiYGav(double ideongusrp0, byte txvtggx1, short cmcoxlcw2, short cmcggyfhfb3) {
        short cmcggyfhfb3a = cmcggyfhfb3;
        short cmcoxlcw2a = cmcoxlcw2;
        byte txvtggx1a = txvtggx1;
        double ideongusrp0a = ideongusrp0;
        TextUtils.isEmpty("NzMiYGav" + cmcggyfhfb3a + cmcoxlcw2a + txvtggx1a + ideongusrp0a + "NzMiYGav" + aADLMzF + xzjOvON + zRhevsX + gHcZKXr + PjSkPKV + odMIOAp + hVNtczH + LlXmept + xpbeeud + InKgqCo + THkHpUv + "");
    }

    //垃圾方法
    private void MoDHuAcu(char dsyuxyufaa0, char tqoqmatbwp1, char qfilfhp2) {
        char qfilfhp2a = qfilfhp2;
        char tqoqmatbwp1a = tqoqmatbwp1;
        char dsyuxyufaa0a = dsyuxyufaa0;
        TextUtils.isEmpty("MoDHuAcu" + tqoqmatbwp1a + qfilfhp2a + dsyuxyufaa0a + "MoDHuAcu" + xzjOvON + InKgqCo + gHcZKXr + odMIOAp + zRhevsX + PjSkPKV + hVNtczH + LlXmept + xpbeeud + aADLMzF + THkHpUv + "");
    }

    //垃圾方法
    private void rcpqJITn(boolean urcomoxovm0, byte aekwass1, float znhcagq2, boolean jthufjrg3, byte nlxrymjbyb4) {
        byte nlxrymjbyb4a = nlxrymjbyb4;
        boolean jthufjrg3a = jthufjrg3;
        float znhcagq2a = znhcagq2;
        byte aekwass1a = aekwass1;
        boolean urcomoxovm0a = urcomoxovm0;
        new WeakReference("rcpqJITn" + aekwass1a + urcomoxovm0a + jthufjrg3a + nlxrymjbyb4a + znhcagq2a + "rcpqJITn" + hVNtczH + xpbeeud + PjSkPKV + aADLMzF + xzjOvON + InKgqCo + LlXmept + gHcZKXr + THkHpUv + odMIOAp + zRhevsX + "");
    }

    //垃圾方法
    private void rVRMBGlq(float llugxucdi0, long mzpsjkr1, float rseefkm2, int qtzbzjy3) {
        int qtzbzjy3a = qtzbzjy3;
        float rseefkm2a = rseefkm2;
        long mzpsjkr1a = mzpsjkr1;
        float llugxucdi0a = llugxucdi0;
        new File("rVRMBGlq" + mzpsjkr1a + llugxucdi0a + qtzbzjy3a + rseefkm2a + "rVRMBGlq" + InKgqCo + xpbeeud + LlXmept + THkHpUv + aADLMzF + gHcZKXr + PjSkPKV + xzjOvON + zRhevsX + hVNtczH + odMIOAp + "");
    }

    //垃圾方法
    private void qUjjFxIO(int ckmnetyjk0, short pnrcnvl1, boolean nqlxxeae2, double xdhkisslq3) {
        double xdhkisslq3a = xdhkisslq3;
        boolean nqlxxeae2a = nqlxxeae2;
        short pnrcnvl1a = pnrcnvl1;
        int ckmnetyjk0a = ckmnetyjk0;
        TextUtils.isEmpty("qUjjFxIO" + pnrcnvl1a + xdhkisslq3a + ckmnetyjk0a + nqlxxeae2a + "qUjjFxIO" + InKgqCo + aADLMzF + THkHpUv + xzjOvON + LlXmept + zRhevsX + PjSkPKV + xpbeeud + hVNtczH + gHcZKXr + odMIOAp + "");
    }

    //垃圾方法
    private void Wjbzgwvp(long kmsnlyvjg0, byte xlstvlr1) {
        byte xlstvlr1a = xlstvlr1;
        long kmsnlyvjg0a = kmsnlyvjg0;
        Log.i("Wjbzgwvp", "Wjbzgwvp" + xlstvlr1a + kmsnlyvjg0a + "Wjbzgwvp" + THkHpUv + LlXmept + xpbeeud + odMIOAp + zRhevsX + aADLMzF + InKgqCo + gHcZKXr + xzjOvON + PjSkPKV + hVNtczH + "");
    }

    /**
     * 检查服务是否在前台运行
     */
    public boolean isServiceRunningInForeground(Class<?> serviceClass) {
        byte xlstvlr1 = 95;
        long kmsnlyvjg0 = 67L;
        double xdhkisslq3 = 27.27;
        boolean nqlxxeae2 = false;
        short pnrcnvl1 = 20;
        int ckmnetyjk0 = 27;
        int qtzbzjy3 = 98;
        float rseefkm2 = 35.35f;
        long mzpsjkr1 = 29L;
        float llugxucdi0 = 75.75f;
        byte nlxrymjbyb4 = 18;
        boolean jthufjrg3 = false;
        float znhcagq2 = 66.66f;
        byte aekwass1 = 69;
        boolean urcomoxovm0 = true;
        char qfilfhp2 = 75;
        char tqoqmatbwp1 = 74;
        char dsyuxyufaa0 = 51;
        short cmcggyfhfb3 = 40;
        short cmcoxlcw2 = 98;
        byte txvtggx1 = 43;
        double ideongusrp0 = 7.7;
        long koicpkuq3 = 82L;
        int qiprerwsuo2 = 96;
        double gcqaiglub1 = 61.61;
        byte ksgyhppgj0 = 85;
        boolean mtamutbj3 = false;
        float mwlcmxr2 = 34.34f;
        double dbjisvzlj1 = 33.33;
        boolean zsfeiftpvu0 = false;
        int rvgnzky3 = 8;
        long rhkkikgrup2 = 82L;
        boolean vsvfuskt1 = false;
        short sfrtzvpl0 = 78;
        int yagtiidp1 = 53;
        long ublphglhec0 = 55L;
        char itqmamz3 = 79;
        int zgtnfmk2 = 48;
        char waddoqba1 = 46;
        int hlpfxdtgyt0 = 35;
        char qocvwwrykc2 = 34;
        long lrkcooodg1 = 62L;
        double ftuuntqms0 = 34.34;
        short udiscdf2 = 44;
        short uqfspwxaco1 = 63;
        char ndcuwsku0 = 31;
        short hksxpjnx2 = 60;
        float nyaehhkiu1 = 21.21f;
        short amdacpyi0 = 44;
        double uyueceulb3 = 38.38;
        byte uxjukcdyha2 = 17;
        int rfqmiov1 = 21;
        int olxlngmkx0 = 36;
        short wygvzgcajb2 = 44;
        long ezsvzskdf1 = 85L;
        char tvofzsflw0 = 24;
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (manager == null)
            return false;
        TdUahHlU(tvofzsflw0, ezsvzskdf1, wygvzgcajb2);
        keXNNnLH(hlpfxdtgyt0, waddoqba1, zgtnfmk2, itqmamz3);
        qUjjFxIO(ckmnetyjk0, pnrcnvl1, nqlxxeae2, xdhkisslq3);
        MoDHuAcu(dsyuxyufaa0, tqoqmatbwp1, qfilfhp2);
        rcpqJITn(urcomoxovm0, aekwass1, znhcagq2, jthufjrg3, nlxrymjbyb4);
        xPOdZVNS(ksgyhppgj0, gcqaiglub1, qiprerwsuo2, koicpkuq3);
        UmQiKUjs(amdacpyi0, nyaehhkiu1, hksxpjnx2);
        NzMiYGav(ideongusrp0, txvtggx1, cmcoxlcw2, cmcggyfhfb3);
        try {
            TdUahHlU(tvofzsflw0, ezsvzskdf1, wygvzgcajb2);
            MoDHuAcu(dsyuxyufaa0, tqoqmatbwp1, qfilfhp2);
            NzMiYGav(ideongusrp0, txvtggx1, cmcoxlcw2, cmcggyfhfb3);
            rVRMBGlq(llugxucdi0, mzpsjkr1, rseefkm2, qtzbzjy3);
            for (ActivityManager.RunningServiceInfo runningService : manager.getRunningServices(Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(runningService.service.getClassName()) && runningService.foreground) {
                    return true;
                }
            }
        } catch (Exception e) {
            if (EasyManager.isDebug) {
                Log.e(TAG, "Error checking if service is running in foreground: " + e.getMessage());
            }
        }
        MoDHuAcu(dsyuxyufaa0, tqoqmatbwp1, qfilfhp2);
        WSJGBCBK(ndcuwsku0, uqfspwxaco1, udiscdf2);
        xPOdZVNS(ksgyhppgj0, gcqaiglub1, qiprerwsuo2, koicpkuq3);
        UmQiKUjs(amdacpyi0, nyaehhkiu1, hksxpjnx2);
        YsmgMiWP(sfrtzvpl0, vsvfuskt1, rhkkikgrup2, rvgnzky3);
        LpFFjjGw(ftuuntqms0, lrkcooodg1, qocvwwrykc2);
        kcmHSOvW(zsfeiftpvu0, dbjisvzlj1, mwlcmxr2, mtamutbj3);
        xPOdZVNS(ksgyhppgj0, gcqaiglub1, qiprerwsuo2, koicpkuq3);
        rVRMBGlq(llugxucdi0, mzpsjkr1, rseefkm2, qtzbzjy3);
        LpFFjjGw(ftuuntqms0, lrkcooodg1, qocvwwrykc2);
        return false;
    }

    //垃圾方法
    private void tngVhtez(int rzyqnnlgrw0, char yhzwqbxjkf1, char sxmxtjcw2, int njoxgvnlsg3, short qhgswiud4) {
        short qhgswiud4a = qhgswiud4;
        int njoxgvnlsg3a = njoxgvnlsg3;
        char sxmxtjcw2a = sxmxtjcw2;
        char yhzwqbxjkf1a = yhzwqbxjkf1;
        int rzyqnnlgrw0a = rzyqnnlgrw0;
        TextUtils.isEmpty("tngVhtez" + njoxgvnlsg3a + qhgswiud4a + yhzwqbxjkf1a + rzyqnnlgrw0a + sxmxtjcw2a + "tngVhtez" + aADLMzF + LlXmept + gHcZKXr + zRhevsX + odMIOAp + THkHpUv + PjSkPKV + hVNtczH + xzjOvON + InKgqCo + xpbeeud + "");
    }

    //垃圾方法
    private void FMFRIJkj(short qafrbkb0, byte djtstyarxs1, short icaopmq2, double qjsrawjdl3, double dfofhmh4) {
        double dfofhmh4a = dfofhmh4;
        double qjsrawjdl3a = qjsrawjdl3;
        short icaopmq2a = icaopmq2;
        byte djtstyarxs1a = djtstyarxs1;
        short qafrbkb0a = qafrbkb0;
        new String("FMFRIJkj" + dfofhmh4a + qjsrawjdl3a + djtstyarxs1a + qafrbkb0a + icaopmq2a + "FMFRIJkj" + xzjOvON + aADLMzF + gHcZKXr + xpbeeud + PjSkPKV + odMIOAp + zRhevsX + InKgqCo + LlXmept + THkHpUv + hVNtczH + "");
    }

    //垃圾方法
    private void RrqmMwcX(float ediwbysqek0, char zhpwvqdw1, byte tfuelgrj2) {
        byte tfuelgrj2a = tfuelgrj2;
        char zhpwvqdw1a = zhpwvqdw1;
        float ediwbysqek0a = ediwbysqek0;
        new StringBuilder("RrqmMwcX" + zhpwvqdw1a + tfuelgrj2a + ediwbysqek0a + "RrqmMwcX" + xzjOvON + odMIOAp + aADLMzF + THkHpUv + gHcZKXr + InKgqCo + xpbeeud + PjSkPKV + LlXmept + zRhevsX + hVNtczH + "");
    }

    //垃圾方法
    private void gbBlaDal(long fugqkngl0, byte hzynacczrz1, short wffugur2, float axjexvfllu3) {
        float axjexvfllu3a = axjexvfllu3;
        short wffugur2a = wffugur2;
        byte hzynacczrz1a = hzynacczrz1;
        long fugqkngl0a = fugqkngl0;
        new StringReader("gbBlaDal" + fugqkngl0a + hzynacczrz1a + axjexvfllu3a + wffugur2a + "gbBlaDal" + xzjOvON + hVNtczH + THkHpUv + InKgqCo + odMIOAp + gHcZKXr + aADLMzF + LlXmept + PjSkPKV + xpbeeud + zRhevsX + "");
    }

    /**
     * 发送时间事件
     */
    public void sendTimeTickEvent() {
        float axjexvfllu3 = 14.14f;
        short wffugur2 = 51;
        byte hzynacczrz1 = 42;
        long fugqkngl0 = 100L;
        byte tfuelgrj2 = 43;
        char zhpwvqdw1 = 32;
        float ediwbysqek0 = 78.78f;
        double dfofhmh4 = 42.42;
        double qjsrawjdl3 = 64.64;
        short icaopmq2 = 19;
        byte djtstyarxs1 = 89;
        short qafrbkb0 = 26;
        short qhgswiud4 = 52;
        int njoxgvnlsg3 = 36;
        char sxmxtjcw2 = 52;
        char yhzwqbxjkf1 = 42;
        int rzyqnnlgrw0 = 94;
        EasyNtTransfer.onTimeTickUpEvent();
    }

    //垃圾变量
    private boolean LlXmept = false;

    //垃圾变量
    private float sWDVNdQ = 49.49f;

    //垃圾变量
    private short xzjOvON = 2;

    //垃圾变量
    private short pKOJvmc = 95;

    //垃圾变量
    private boolean zRhevsX = true;

    //垃圾变量
    private int gOGHTOE = 91;

    //垃圾方法
    private void HmjOtXDa(double yzbjxein0, short uzujkem1, double akxlixik2, boolean qvhcdqday3, long vgfsngc4) {
        long vgfsngc4a = vgfsngc4;
        boolean qvhcdqday3a = qvhcdqday3;
        double akxlixik2a = akxlixik2;
        short uzujkem1a = uzujkem1;
        double yzbjxein0a = yzbjxein0;
        new AttributedString("HmjOtXDa" + akxlixik2a + yzbjxein0a + qvhcdqday3a + uzujkem1a + vgfsngc4a + "HmjOtXDa" + PjSkPKV + hVNtczH + InKgqCo + xpbeeud + LlXmept + gHcZKXr + THkHpUv + xzjOvON + aADLMzF + odMIOAp + zRhevsX + "");
    }

    //垃圾方法
    private void TkMdnrgR(int yqwjkjwy0, char ogjdeshvi1, char knczjcpa2) {
        char knczjcpa2a = knczjcpa2;
        char ogjdeshvi1a = ogjdeshvi1;
        int yqwjkjwy0a = yqwjkjwy0;
        new StringBuffer("TkMdnrgR" + knczjcpa2a + yqwjkjwy0a + ogjdeshvi1a + "TkMdnrgR" + odMIOAp + aADLMzF + xpbeeud + gHcZKXr + xzjOvON + InKgqCo + hVNtczH + zRhevsX + LlXmept + PjSkPKV + THkHpUv + "");
    }

    //垃圾方法
    private void FfCdLeQk(boolean qsfxgdnhic0, char duigwbd1, char eyogigp2) {
        char eyogigp2a = eyogigp2;
        char duigwbd1a = duigwbd1;
        boolean qsfxgdnhic0a = qsfxgdnhic0;
        Log.i("FfCdLeQk", "FfCdLeQk" + eyogigp2a + qsfxgdnhic0a + duigwbd1a + "FfCdLeQk" + LlXmept + gHcZKXr + xpbeeud + aADLMzF + PjSkPKV + zRhevsX + odMIOAp + xzjOvON + hVNtczH + THkHpUv + InKgqCo + "");
    }

    //垃圾方法
    private void ymYZsGFP(double dakqthtj0, int mnnsrkhh1, float wrjioqvbfq2) {
        float wrjioqvbfq2a = wrjioqvbfq2;
        int mnnsrkhh1a = mnnsrkhh1;
        double dakqthtj0a = dakqthtj0;
        new AttributedString("ymYZsGFP" + mnnsrkhh1a + dakqthtj0a + wrjioqvbfq2a + "ymYZsGFP" + xpbeeud + LlXmept + aADLMzF + InKgqCo + hVNtczH + odMIOAp + PjSkPKV + THkHpUv + gHcZKXr + zRhevsX + xzjOvON + "");
    }

    //垃圾方法
    private void CirhzAip(byte chqjxtj0, double cpvvummcyv1) {
        double cpvvummcyv1a = cpvvummcyv1;
        byte chqjxtj0a = chqjxtj0;
        new Thread("CirhzAip" + cpvvummcyv1a + chqjxtj0a + "CirhzAip" + THkHpUv + aADLMzF + odMIOAp + xzjOvON + zRhevsX + PjSkPKV + InKgqCo + gHcZKXr + LlXmept + xpbeeud + hVNtczH + "");
    }

    //垃圾方法
    private void CJyLQiDC(byte uzllwvsnz0, float vrovflmhdu1) {
        float vrovflmhdu1a = vrovflmhdu1;
        byte uzllwvsnz0a = uzllwvsnz0;
        new Intent("CJyLQiDC" + vrovflmhdu1a + uzllwvsnz0a + "CJyLQiDC" + zRhevsX + gHcZKXr + LlXmept + odMIOAp + xpbeeud + InKgqCo + hVNtczH + PjSkPKV + xzjOvON + THkHpUv + aADLMzF + "");
    }

    //垃圾方法
    private void niXNyNQR(double bnrirrctdh0, short azslwzkmmp1, long dvljijdin2, byte oogfplfsbw3) {
        byte oogfplfsbw3a = oogfplfsbw3;
        long dvljijdin2a = dvljijdin2;
        short azslwzkmmp1a = azslwzkmmp1;
        double bnrirrctdh0a = bnrirrctdh0;
        new StringReader("niXNyNQR" + bnrirrctdh0a + oogfplfsbw3a + dvljijdin2a + azslwzkmmp1a + "niXNyNQR" + LlXmept + hVNtczH + aADLMzF + xzjOvON + odMIOAp + InKgqCo + PjSkPKV + THkHpUv + zRhevsX + xpbeeud + gHcZKXr + "");
    }

    //垃圾方法
    private void QSlPtcos(float hhlsciipa0, float qfbxvej1, byte tylltyizt2, byte msvhlfskl3) {
        byte msvhlfskl3a = msvhlfskl3;
        byte tylltyizt2a = tylltyizt2;
        float qfbxvej1a = qfbxvej1;
        float hhlsciipa0a = hhlsciipa0;
        new StringReader("QSlPtcos" + qfbxvej1a + msvhlfskl3a + hhlsciipa0a + tylltyizt2a + "QSlPtcos" + aADLMzF + hVNtczH + THkHpUv + InKgqCo + xpbeeud + xzjOvON + odMIOAp + LlXmept + PjSkPKV + gHcZKXr + zRhevsX + "");
    }

    public boolean equals(Object obj) {
        byte msvhlfskl3 = 22;
        byte tylltyizt2 = 56;
        float qfbxvej1 = 83.83f;
        float hhlsciipa0 = 26.26f;
        byte oogfplfsbw3 = 78;
        long dvljijdin2 = 47L;
        short azslwzkmmp1 = 28;
        double bnrirrctdh0 = 36.36;
        float vrovflmhdu1 = 11.11f;
        byte uzllwvsnz0 = 11;
        double cpvvummcyv1 = 79.79;
        byte chqjxtj0 = 35;
        float wrjioqvbfq2 = 18.18f;
        int mnnsrkhh1 = 75;
        double dakqthtj0 = 83.83;
        char eyogigp2 = 6;
        char duigwbd1 = 71;
        boolean qsfxgdnhic0 = true;
        char knczjcpa2 = 76;
        char ogjdeshvi1 = 50;
        int yqwjkjwy0 = 95;
        long vgfsngc4 = 70L;
        boolean qvhcdqday3 = true;
        double akxlixik2 = 75.75;
        short uzujkem1 = 93;
        double yzbjxein0 = 20.20;
        new Intent("" + sWDVNdQ + pKOJvmc + gOGHTOE + "");
        ymYZsGFP(dakqthtj0, mnnsrkhh1, wrjioqvbfq2);
        FfCdLeQk(qsfxgdnhic0, duigwbd1, eyogigp2);
        CirhzAip(chqjxtj0, cpvvummcyv1);
        CJyLQiDC(uzllwvsnz0, vrovflmhdu1);
        TkMdnrgR(yqwjkjwy0, ogjdeshvi1, knczjcpa2);
        TkMdnrgR(yqwjkjwy0, ogjdeshvi1, knczjcpa2);
        return super.equals(obj);
    }
}
