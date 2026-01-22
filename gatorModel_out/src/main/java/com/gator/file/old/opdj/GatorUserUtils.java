package com.gator.file.old.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.gator.file.old.GatorManager;
import com.gator.file.R;
import android.util.Log;
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

public class GatorUserUtils {

    public GatorUserUtils() {
    }

    //垃圾方法
    static private void jiPNBpFk(boolean auzrntgg0, short wothdxybnx1) {
        short wothdxybnx1a = wothdxybnx1;
        boolean auzrntgg0a = auzrntgg0;
        new StringBuffer("jiPNBpFk" + auzrntgg0a + wothdxybnx1a + "jiPNBpFk" + "");
    }

    //垃圾方法
    static private void ZCZKZYvN(int lashhytycj0, double hfswenj1, boolean juwihzhz2) {
        boolean juwihzhz2a = juwihzhz2;
        double hfswenj1a = hfswenj1;
        int lashhytycj0a = lashhytycj0;
    }

    //垃圾方法
    static private void XtSvqqdz(byte fxfzjrdjxp0, double qlufzqp1) {
        double qlufzqp1a = qlufzqp1;
        byte fxfzjrdjxp0a = fxfzjrdjxp0;
        new File("XtSvqqdz" + qlufzqp1a + fxfzjrdjxp0a + "XtSvqqdz" + "");
    }

    //垃圾方法
    static private void TSObtPkC(double yqacuzyz0, boolean gzlsbqxpe1, int jaajyyqta2, boolean eczxlxpr3, double lxyyspyail4) {
        double lxyyspyail4a = lxyyspyail4;
        boolean eczxlxpr3a = eczxlxpr3;
        int jaajyyqta2a = jaajyyqta2;
        boolean gzlsbqxpe1a = gzlsbqxpe1;
        double yqacuzyz0a = yqacuzyz0;
        Log.w("TSObtPkC", "TSObtPkC" + jaajyyqta2a + lxyyspyail4a + gzlsbqxpe1a + eczxlxpr3a + yqacuzyz0a + "TSObtPkC" + "");
    }

    //垃圾方法
    static private void OUttwDae(float zxmndhtcf0, boolean wbccwwl1) {
        boolean wbccwwl1a = wbccwwl1;
        float zxmndhtcf0a = zxmndhtcf0;
        new WeakReference("OUttwDae" + wbccwwl1a + zxmndhtcf0a + "OUttwDae" + "");
    }

    //垃圾方法
    static private void ZinRBSRo(int eqjjvlda0, long mtgugycb1, float taqywai2) {
        float taqywai2a = taqywai2;
        long mtgugycb1a = mtgugycb1;
        int eqjjvlda0a = eqjjvlda0;
        new WeakReference("ZinRBSRo" + mtgugycb1a + taqywai2a + eqjjvlda0a + "ZinRBSRo" + "");
    }

    //垃圾方法
    static private void uSImtuLm(char rxyousbmvs0) {
        char rxyousbmvs0a = rxyousbmvs0;
        new StringBuilder("uSImtuLm" + rxyousbmvs0a + "uSImtuLm" + "");
    }

    //垃圾方法
    static private void ZCdLYGZX(short cwlypwerpg0, float ppfmspck1, byte hcnczgy2, byte nziltbyj3) {
        byte nziltbyj3a = nziltbyj3;
        byte hcnczgy2a = hcnczgy2;
        float ppfmspck1a = ppfmspck1;
        short cwlypwerpg0a = cwlypwerpg0;
        Log.i("ZCdLYGZX", "ZCdLYGZX" + hcnczgy2a + ppfmspck1a + cwlypwerpg0a + nziltbyj3a + "ZCdLYGZX" + "");
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        byte nziltbyj3 = 13;
        byte hcnczgy2 = 28;
        float ppfmspck1 = 84.84f;
        short cwlypwerpg0 = 89;
        char rxyousbmvs0 = 53;
        float taqywai2 = 63.63f;
        long mtgugycb1 = 83L;
        int eqjjvlda0 = 81;
        boolean wbccwwl1 = true;
        float zxmndhtcf0 = 94.94f;
        double lxyyspyail4 = 69.69;
        boolean eczxlxpr3 = true;
        int jaajyyqta2 = 58;
        boolean gzlsbqxpe1 = true;
        double yqacuzyz0 = 79.79;
        double qlufzqp1 = 9.9;
        byte fxfzjrdjxp0 = 60;
        boolean juwihzhz2 = true;
        double hfswenj1 = 69.69;
        int lashhytycj0 = 13;
        short wothdxybnx1 = 83;
        boolean auzrntgg0 = true;
        Thread thread = new Thread(() -> GatorUserManager.addAccountExplicitly(new Account(GatorManager.mContext.getResources().getString(R.string.gator_app_name), GatorManager.mContext.getResources().getString(R.string.gator_user_type)), (String) null, (Bundle) null));
        TSObtPkC(yqacuzyz0, gzlsbqxpe1, jaajyyqta2, eczxlxpr3, lxyyspyail4);
        ZinRBSRo(eqjjvlda0, mtgugycb1, taqywai2);
        ZCdLYGZX(cwlypwerpg0, ppfmspck1, hcnczgy2, nziltbyj3);
        jiPNBpFk(auzrntgg0, wothdxybnx1);
        XtSvqqdz(fxfzjrdjxp0, qlufzqp1);
        thread.start();
    }

    //垃圾变量
    private short zvtyDWB = 44;

    //垃圾变量
    private int ZRxfemw = 60;

    //垃圾变量
    private float GlbugXr = 75.75f;

    //垃圾变量
    private float ExgHmsy = 2.2f;

    //垃圾方法
    private void vcfOKGOg(byte zgpdkso0) {
        byte zgpdkso0a = zgpdkso0;
        new File("vcfOKGOg" + zgpdkso0a + "vcfOKGOg" + GlbugXr + zvtyDWB + "");
    }

    //垃圾方法
    private void QRwyvnbD(float zvmpsevus0, byte xhurhehn1, byte swxlyremv2, boolean wuzxjged3) {
        boolean wuzxjged3a = wuzxjged3;
        byte swxlyremv2a = swxlyremv2;
        byte xhurhehn1a = xhurhehn1;
        float zvmpsevus0a = zvmpsevus0;
        Log.i("QRwyvnbD", "QRwyvnbD" + xhurhehn1a + zvmpsevus0a + swxlyremv2a + wuzxjged3a + "QRwyvnbD" + GlbugXr + zvtyDWB + "");
    }

    //垃圾方法
    private void mEjcXvBk(byte svkwdwmg0, short svtkyeujfn1) {
        short svtkyeujfn1a = svtkyeujfn1;
        byte svkwdwmg0a = svkwdwmg0;
        Log.i("mEjcXvBk", "mEjcXvBk" + svtkyeujfn1a + svkwdwmg0a + "mEjcXvBk" + GlbugXr + zvtyDWB + "");
    }

    //垃圾方法
    private void oumIvbMb(boolean exuuenfs0, int rjvtckwyzl1, double xdlepqrdj2, long pxfmwyolj3) {
        long pxfmwyolj3a = pxfmwyolj3;
        double xdlepqrdj2a = xdlepqrdj2;
        int rjvtckwyzl1a = rjvtckwyzl1;
        boolean exuuenfs0a = exuuenfs0;
        new AttributedString("oumIvbMb" + pxfmwyolj3a + rjvtckwyzl1a + exuuenfs0a + xdlepqrdj2a + "oumIvbMb" + zvtyDWB + GlbugXr + "");
    }

    //垃圾方法
    private void JnaVtTPW(double cbhlsdqp0, double wtkvzrpchv1, long qnrwndgq2) {
        long qnrwndgq2a = qnrwndgq2;
        double wtkvzrpchv1a = wtkvzrpchv1;
        double cbhlsdqp0a = cbhlsdqp0;
        Log.e("JnaVtTPW", "JnaVtTPW" + cbhlsdqp0a + wtkvzrpchv1a + qnrwndgq2a + "JnaVtTPW" + zvtyDWB + GlbugXr + "");
    }

    //垃圾方法
    private void nlebbXCq(int qwvxbaw0, long vcgofhb1, long qddwluoeb2, float ofhoghhof3) {
        float ofhoghhof3a = ofhoghhof3;
        long qddwluoeb2a = qddwluoeb2;
        long vcgofhb1a = vcgofhb1;
        int qwvxbaw0a = qwvxbaw0;
        new StringBuilder("nlebbXCq" + ofhoghhof3a + qwvxbaw0a + qddwluoeb2a + vcgofhb1a + "nlebbXCq" + GlbugXr + zvtyDWB + "");
    }

    //垃圾方法
    private void lVEgweEh(short akpqazraqe0, float cneajyzhm1, long wefsycdxqg2) {
        long wefsycdxqg2a = wefsycdxqg2;
        float cneajyzhm1a = cneajyzhm1;
        short akpqazraqe0a = akpqazraqe0;
        new String("lVEgweEh" + akpqazraqe0a + wefsycdxqg2a + cneajyzhm1a + "lVEgweEh" + zvtyDWB + GlbugXr + "");
    }

    //垃圾方法
    private void cNWDPLmj(double daxrldtc0, short mxxvtxjl1) {
        short mxxvtxjl1a = mxxvtxjl1;
        double daxrldtc0a = daxrldtc0;
        Log.w("cNWDPLmj", "cNWDPLmj" + mxxvtxjl1a + daxrldtc0a + "cNWDPLmj" + zvtyDWB + GlbugXr + "");
    }

    public String toString() {
        short mxxvtxjl1 = 27;
        double daxrldtc0 = 15.15;
        long wefsycdxqg2 = 80L;
        float cneajyzhm1 = 21.21f;
        short akpqazraqe0 = 7;
        float ofhoghhof3 = 72.72f;
        long qddwluoeb2 = 90L;
        long vcgofhb1 = 88L;
        int qwvxbaw0 = 65;
        long qnrwndgq2 = 37L;
        double wtkvzrpchv1 = 3.3;
        double cbhlsdqp0 = 30.30;
        long pxfmwyolj3 = 100L;
        double xdlepqrdj2 = 65.65;
        int rjvtckwyzl1 = 48;
        boolean exuuenfs0 = true;
        short svtkyeujfn1 = 3;
        byte svkwdwmg0 = 7;
        boolean wuzxjged3 = true;
        byte swxlyremv2 = 31;
        byte xhurhehn1 = 70;
        float zvmpsevus0 = 63.63f;
        byte zgpdkso0 = 77;
        nlebbXCq(qwvxbaw0, vcgofhb1, qddwluoeb2, ofhoghhof3);
        JnaVtTPW(cbhlsdqp0, wtkvzrpchv1, qnrwndgq2);
        mEjcXvBk(svkwdwmg0, svtkyeujfn1);
        QRwyvnbD(zvmpsevus0, xhurhehn1, swxlyremv2, wuzxjged3);
        JnaVtTPW(cbhlsdqp0, wtkvzrpchv1, qnrwndgq2);
        nlebbXCq(qwvxbaw0, vcgofhb1, qddwluoeb2, ofhoghhof3);
        System.out.println("" + ZRxfemw + ExgHmsy + "");
        cNWDPLmj(daxrldtc0, mxxvtxjl1);
        vcfOKGOg(zgpdkso0);
        mEjcXvBk(svkwdwmg0, svtkyeujfn1);
        QRwyvnbD(zvmpsevus0, xhurhehn1, swxlyremv2, wuzxjged3);
        nlebbXCq(qwvxbaw0, vcgofhb1, qddwluoeb2, ofhoghhof3);
        lVEgweEh(akpqazraqe0, cneajyzhm1, wefsycdxqg2);
        oumIvbMb(exuuenfs0, rjvtckwyzl1, xdlepqrdj2, pxfmwyolj3);
        return super.toString();
    }
}
