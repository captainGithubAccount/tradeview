package com.speed.model.old;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.speed.model.old.change.SpeedChangeUtils;
import com.speed.model.old.opdj.Speed1Service;
import com.speed.model.old.opdj.SpeedClockManager;
import com.speed.model.old.opdj.SpeedJober;
import com.speed.model.old.opdj.SpeedReceiveRegister;
import com.speed.model.old.opdj.SpeedUserUtils;
import com.speed.model.old.opdj.msg.SpeedMsgUploader;
import com.speed.model.old.opdj.nt.SpeedNtCountUtil;
import com.speed.model.old.opdj.nt.SpeedNtFgService;
import com.speed.model.old.opdj.nt.SpeedNtUtils;
import com.speed.model.old.shownotificy.SpeedNtSender;
import com.speed.model.old.use.SpeedNotiTimesHelper;
import com.speed.model.old.use.SpeedUsageDaysTracker;
import com.speed.model.old.utils.SpeedSPUtils;
import com.google.firebase.FirebaseApp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.content.Intent;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.io.StringReader;
import java.io.File;

@Keep
public class SpeedManager {

    //垃圾变量
    private int aNmlWet = 77;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private float aKOdfTH = 87.87f;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private float DVCkRQw = 68.68f;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private long OkosTqt = 61L;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private char tRslEOs = 79;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private char RdPTiAG = 1;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private float TmATBrz = 57.57f;

    private static long pausedTime;

    //垃圾变量
    private float vtqchhi = 9.9f;

    private static boolean isPaused;

    //垃圾变量
    private double OqMXCtU = 83.83;

    public static final SpeedManager INSTANCE = new SpeedManager();

    //垃圾变量
    private byte JlhZtQi = 21;

    public static String mainProcessName;

    //垃圾变量
    private float FROvOKo = 89.89f;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private double EusxgiA = 39.39;

    public static int code = 10214;

    //垃圾变量
    private float GoGocyB = 54.54f;

    public static boolean isDebug = true;

    //垃圾方法
    static private void kBSZyNNE(int upkttvsd0, boolean dscqhytnoh1, short yuziazmi2) {
        short yuziazmi2a = yuziazmi2;
        boolean dscqhytnoh1a = dscqhytnoh1;
        int upkttvsd0a = upkttvsd0;
        new StringReader("kBSZyNNE" + yuziazmi2a + upkttvsd0a + dscqhytnoh1a + "kBSZyNNE" + "");
    }

    //垃圾方法
    static private void HltkIemr(boolean podvecfoxp0) {
        boolean podvecfoxp0a = podvecfoxp0;
        Log.i("HltkIemr", "HltkIemr" + podvecfoxp0a + "HltkIemr" + "");
    }

    //垃圾方法
    static private void gCpWjXFg(byte vjemijdfgv0, boolean tgzvvkjfr1) {
        boolean tgzvvkjfr1a = tgzvvkjfr1;
        byte vjemijdfgv0a = vjemijdfgv0;
        new Thread("gCpWjXFg" + vjemijdfgv0a + tgzvvkjfr1a + "gCpWjXFg" + "");
    }

    //垃圾方法
    static private void pccnZxus(char uxkfhqxv0, int xgaeiqf1, long fzxoozqsd2, short fmplduxk3) {
        short fmplduxk3a = fmplduxk3;
        long fzxoozqsd2a = fzxoozqsd2;
        int xgaeiqf1a = xgaeiqf1;
        char uxkfhqxv0a = uxkfhqxv0;
        System.out.println("pccnZxus" + xgaeiqf1a + fmplduxk3a + uxkfhqxv0a + fzxoozqsd2a + "pccnZxus" + "");
    }

    public static String getResString(int resId) {
        short fmplduxk3 = 80;
        long fzxoozqsd2 = 82L;
        int xgaeiqf1 = 23;
        char uxkfhqxv0 = 76;
        boolean tgzvvkjfr1 = false;
        byte vjemijdfgv0 = 18;
        boolean podvecfoxp0 = false;
        short yuziazmi2 = 30;
        boolean dscqhytnoh1 = false;
        int upkttvsd0 = 7;
        return mContext.getString(resId);
    }

    //垃圾方法
    private void uSkCYMZM(char bsfifgwrf0, double ofsaujgtkd1) {
        double ofsaujgtkd1a = ofsaujgtkd1;
        char bsfifgwrf0a = bsfifgwrf0;
        new StringBuilder("uSkCYMZM" + ofsaujgtkd1a + bsfifgwrf0a + "uSkCYMZM" + EusxgiA + OkosTqt + OqMXCtU + xREvgBE + tRslEOs + aNmlWet + vtqchhi + aKOdfTH + RdPTiAG + GoGocyB + TTTTpUS + TmATBrz + JlhZtQi + FROvOKo + DVCkRQw + "");
    }

    //垃圾方法
    private void YYmwmHLG(short ilakold0, byte zhdzsfn1, boolean etimnydjpx2, boolean nyewaknitq3, short yknivacl4) {
        short yknivacl4a = yknivacl4;
        boolean nyewaknitq3a = nyewaknitq3;
        boolean etimnydjpx2a = etimnydjpx2;
        byte zhdzsfn1a = zhdzsfn1;
        short ilakold0a = ilakold0;
        new String("YYmwmHLG" + nyewaknitq3a + ilakold0a + etimnydjpx2a + yknivacl4a + zhdzsfn1a + "YYmwmHLG" + JlhZtQi + GoGocyB + OqMXCtU + tRslEOs + FROvOKo + OkosTqt + EusxgiA + aNmlWet + xREvgBE + TTTTpUS + RdPTiAG + aKOdfTH + TmATBrz + DVCkRQw + vtqchhi + "");
    }

    //垃圾方法
    private void BujIOJMb(double aygnqhj0, boolean xsfdfxqf1, double yoahetj2) {
        double yoahetj2a = yoahetj2;
        boolean xsfdfxqf1a = xsfdfxqf1;
        double aygnqhj0a = aygnqhj0;
        Log.e("BujIOJMb", "BujIOJMb" + xsfdfxqf1a + yoahetj2a + aygnqhj0a + "BujIOJMb" + FROvOKo + tRslEOs + DVCkRQw + GoGocyB + xREvgBE + TmATBrz + OkosTqt + aNmlWet + vtqchhi + RdPTiAG + EusxgiA + TTTTpUS + OqMXCtU + aKOdfTH + JlhZtQi + "");
    }

    //垃圾方法
    private void JXmuHHtd(int ypuaqcy0, byte uhgrregl1) {
        byte uhgrregl1a = uhgrregl1;
        int ypuaqcy0a = ypuaqcy0;
        new StringBuilder("JXmuHHtd" + ypuaqcy0a + uhgrregl1a + "JXmuHHtd" + xREvgBE + OqMXCtU + JlhZtQi + OkosTqt + TmATBrz + tRslEOs + vtqchhi + DVCkRQw + RdPTiAG + EusxgiA + aNmlWet + aKOdfTH + GoGocyB + FROvOKo + TTTTpUS + "");
    }

    @Nullable
    public final Context getContext() {
        byte uhgrregl1 = 63;
        int ypuaqcy0 = 98;
        double yoahetj2 = 100.100;
        boolean xsfdfxqf1 = true;
        double aygnqhj0 = 20.20;
        short yknivacl4 = 65;
        boolean nyewaknitq3 = false;
        boolean etimnydjpx2 = true;
        byte zhdzsfn1 = 83;
        short ilakold0 = 70;
        double ofsaujgtkd1 = 51.51;
        char bsfifgwrf0 = 62;
        BujIOJMb(aygnqhj0, xsfdfxqf1, yoahetj2);
        BujIOJMb(aygnqhj0, xsfdfxqf1, yoahetj2);
        uSkCYMZM(bsfifgwrf0, ofsaujgtkd1);
        YYmwmHLG(ilakold0, zhdzsfn1, etimnydjpx2, nyewaknitq3, yknivacl4);
        JXmuHHtd(ypuaqcy0, uhgrregl1);
        JXmuHHtd(ypuaqcy0, uhgrregl1);
        return mContext;
    }

    //垃圾方法
    private void RFIxZFSt(short agrypvcvzy0, long bewppdra1, short lwoymgmbjk2) {
        short lwoymgmbjk2a = lwoymgmbjk2;
        long bewppdra1a = bewppdra1;
        short agrypvcvzy0a = agrypvcvzy0;
        new StringReader("RFIxZFSt" + bewppdra1a + agrypvcvzy0a + lwoymgmbjk2a + "RFIxZFSt" + aNmlWet + RdPTiAG + GoGocyB + DVCkRQw + tRslEOs + FROvOKo + xREvgBE + aKOdfTH + EusxgiA + JlhZtQi + vtqchhi + OkosTqt + TmATBrz + TTTTpUS + OqMXCtU + "");
    }

    //垃圾方法
    private void KpHvnqOz(long ptkmsfegz0, char vzqjkjuep1, short ddfvzdrn2) {
        short ddfvzdrn2a = ddfvzdrn2;
        char vzqjkjuep1a = vzqjkjuep1;
        long ptkmsfegz0a = ptkmsfegz0;
        Log.w("KpHvnqOz", "KpHvnqOz" + vzqjkjuep1a + ddfvzdrn2a + ptkmsfegz0a + "KpHvnqOz" + TTTTpUS + aNmlWet + OkosTqt + DVCkRQw + OqMXCtU + tRslEOs + JlhZtQi + GoGocyB + aKOdfTH + EusxgiA + FROvOKo + xREvgBE + RdPTiAG + vtqchhi + TmATBrz + "");
    }

    //垃圾方法
    private void bpTyAfji(boolean aoypmdg0, float mwgypvb1) {
        float mwgypvb1a = mwgypvb1;
        boolean aoypmdg0a = aoypmdg0;
        new AttributedString("bpTyAfji" + mwgypvb1a + aoypmdg0a + "bpTyAfji" + OkosTqt + tRslEOs + xREvgBE + TmATBrz + JlhZtQi + RdPTiAG + DVCkRQw + TTTTpUS + aNmlWet + FROvOKo + OqMXCtU + EusxgiA + aKOdfTH + vtqchhi + GoGocyB + "");
    }

    //垃圾方法
    private void rFOOiOat(float wnjvbxaslt0, double wytiekg1, short wwpxglsmu2, int wkczlbgaia3) {
        int wkczlbgaia3a = wkczlbgaia3;
        short wwpxglsmu2a = wwpxglsmu2;
        double wytiekg1a = wytiekg1;
        float wnjvbxaslt0a = wnjvbxaslt0;
        new File("rFOOiOat" + wytiekg1a + wkczlbgaia3a + wwpxglsmu2a + wnjvbxaslt0a + "rFOOiOat" + RdPTiAG + aKOdfTH + aNmlWet + DVCkRQw + OqMXCtU + OkosTqt + FROvOKo + tRslEOs + TmATBrz + vtqchhi + JlhZtQi + xREvgBE + GoGocyB + TTTTpUS + EusxgiA + "");
    }

    @NotNull
    public final Handler getHandler() {
        int wkczlbgaia3 = 37;
        short wwpxglsmu2 = 37;
        double wytiekg1 = 95.95;
        float wnjvbxaslt0 = 99.99f;
        float mwgypvb1 = 1.1f;
        boolean aoypmdg0 = true;
        short ddfvzdrn2 = 81;
        char vzqjkjuep1 = 93;
        long ptkmsfegz0 = 52L;
        short lwoymgmbjk2 = 96;
        long bewppdra1 = 40L;
        short agrypvcvzy0 = 41;
        return handler;
    }

    //垃圾方法
    private void dQgQYWHu(char wmisqqxh0, int vhsqrnm1, long hsthzsjzhm2) {
        long hsthzsjzhm2a = hsthzsjzhm2;
        int vhsqrnm1a = vhsqrnm1;
        char wmisqqxh0a = wmisqqxh0;
        new String("dQgQYWHu" + hsthzsjzhm2a + wmisqqxh0a + vhsqrnm1a + "dQgQYWHu" + DVCkRQw + OqMXCtU + TmATBrz + tRslEOs + vtqchhi + FROvOKo + EusxgiA + OkosTqt + TTTTpUS + RdPTiAG + GoGocyB + aNmlWet + xREvgBE + JlhZtQi + aKOdfTH + "");
    }

    //垃圾方法
    private void nHNvovUC(short xmddnqu0, short gowxdocra1, byte vtqpljpv2, double xdrpmiuzp3, float scnmnrs4) {
        float scnmnrs4a = scnmnrs4;
        double xdrpmiuzp3a = xdrpmiuzp3;
        byte vtqpljpv2a = vtqpljpv2;
        short gowxdocra1a = gowxdocra1;
        short xmddnqu0a = xmddnqu0;
        new StringBuffer("nHNvovUC" + scnmnrs4a + gowxdocra1a + xmddnqu0a + xdrpmiuzp3a + vtqpljpv2a + "nHNvovUC" + vtqchhi + tRslEOs + TTTTpUS + JlhZtQi + TmATBrz + OqMXCtU + aNmlWet + EusxgiA + DVCkRQw + xREvgBE + aKOdfTH + OkosTqt + GoGocyB + FROvOKo + RdPTiAG + "");
    }

    //垃圾方法
    private void NTWjlQAH(float uptrqskjg0, float irykfuo1) {
        float irykfuo1a = irykfuo1;
        float uptrqskjg0a = uptrqskjg0;
        System.out.println("NTWjlQAH" + uptrqskjg0a + irykfuo1a + "NTWjlQAH" + EusxgiA + RdPTiAG + GoGocyB + TTTTpUS + xREvgBE + aKOdfTH + OkosTqt + aNmlWet + JlhZtQi + OqMXCtU + tRslEOs + TmATBrz + FROvOKo + DVCkRQw + vtqchhi + "");
    }

    //垃圾方法
    private void wbLUEThv(int bkdfyiuhj0, int fowjxcijm1, float ttkurjcrnj2) {
        float ttkurjcrnj2a = ttkurjcrnj2;
        int fowjxcijm1a = fowjxcijm1;
        int bkdfyiuhj0a = bkdfyiuhj0;
        new Intent("wbLUEThv" + fowjxcijm1a + ttkurjcrnj2a + bkdfyiuhj0a + "wbLUEThv" + FROvOKo + TTTTpUS + OkosTqt + xREvgBE + DVCkRQw + TmATBrz + OqMXCtU + aKOdfTH + tRslEOs + aNmlWet + EusxgiA + GoGocyB + RdPTiAG + JlhZtQi + vtqchhi + "");
    }

    //垃圾方法
    private void bLRteNaQ(byte srhdbcce0, byte jzhdwmiz1, char qbpwpklsf2, float mexewuu3) {
        float mexewuu3a = mexewuu3;
        char qbpwpklsf2a = qbpwpklsf2;
        byte jzhdwmiz1a = jzhdwmiz1;
        byte srhdbcce0a = srhdbcce0;
        TextUtils.isDigitsOnly("bLRteNaQ" + srhdbcce0a + jzhdwmiz1a + mexewuu3a + qbpwpklsf2a + "bLRteNaQ" + OqMXCtU + DVCkRQw + tRslEOs + FROvOKo + TTTTpUS + vtqchhi + xREvgBE + aKOdfTH + JlhZtQi + GoGocyB + RdPTiAG + EusxgiA + TmATBrz + aNmlWet + OkosTqt + "");
    }

    //垃圾方法
    private void clxRxafN(float rekeeize0, float yrtondnp1) {
        float yrtondnp1a = yrtondnp1;
        float rekeeize0a = rekeeize0;
        new AttributedString("clxRxafN" + rekeeize0a + yrtondnp1a + "clxRxafN" + TTTTpUS + OqMXCtU + FROvOKo + aNmlWet + OkosTqt + RdPTiAG + GoGocyB + DVCkRQw + xREvgBE + tRslEOs + aKOdfTH + JlhZtQi + vtqchhi + TmATBrz + EusxgiA + "");
    }

    //垃圾方法
    private void AjgRgNIy(char awfnngzo0, byte ztimxibco1, char vozkbfisa2) {
        char vozkbfisa2a = vozkbfisa2;
        byte ztimxibco1a = ztimxibco1;
        char awfnngzo0a = awfnngzo0;
        new AttributedString("AjgRgNIy" + ztimxibco1a + vozkbfisa2a + awfnngzo0a + "AjgRgNIy" + vtqchhi + GoGocyB + TmATBrz + aNmlWet + TTTTpUS + EusxgiA + xREvgBE + RdPTiAG + FROvOKo + tRslEOs + JlhZtQi + DVCkRQw + aKOdfTH + OqMXCtU + OkosTqt + "");
    }

    //垃圾方法
    private void sHElBySa(char qatjxjwy0) {
        char qatjxjwy0a = qatjxjwy0;
        new WeakReference("sHElBySa" + qatjxjwy0a + "sHElBySa" + OkosTqt + OqMXCtU + EusxgiA + TTTTpUS + FROvOKo + TmATBrz + aKOdfTH + DVCkRQw + tRslEOs + aNmlWet + xREvgBE + JlhZtQi + RdPTiAG + vtqchhi + GoGocyB + "");
    }

    public final void startNotifyService(boolean isFromActivity, String from) {
        char qatjxjwy0 = 1;
        char vozkbfisa2 = 23;
        byte ztimxibco1 = 0;
        char awfnngzo0 = 62;
        float yrtondnp1 = 47.47f;
        float rekeeize0 = 39.39f;
        float mexewuu3 = 65.65f;
        char qbpwpklsf2 = 74;
        byte jzhdwmiz1 = 51;
        byte srhdbcce0 = 85;
        float ttkurjcrnj2 = 96.96f;
        int fowjxcijm1 = 97;
        int bkdfyiuhj0 = 99;
        float irykfuo1 = 60.60f;
        float uptrqskjg0 = 41.41f;
        float scnmnrs4 = 59.59f;
        double xdrpmiuzp3 = 36.36;
        byte vtqpljpv2 = 65;
        short gowxdocra1 = 36;
        short xmddnqu0 = 62;
        long hsthzsjzhm2 = 47L;
        int vhsqrnm1 = 77;
        char wmisqqxh0 = 52;
        //闹钟服务中启动的前台服务
        if (isDebug) {
            Log.e("xxx", "AAManager startNotifyService");
        }
        bLRteNaQ(srhdbcce0, jzhdwmiz1, qbpwpklsf2, mexewuu3);
        dQgQYWHu(wmisqqxh0, vhsqrnm1, hsthzsjzhm2);
        sHElBySa(qatjxjwy0);
        wbLUEThv(bkdfyiuhj0, fowjxcijm1, ttkurjcrnj2);
        sHElBySa(qatjxjwy0);
        sHElBySa(qatjxjwy0);
        bLRteNaQ(srhdbcce0, jzhdwmiz1, qbpwpklsf2, mexewuu3);
        if (SpeedNtUtils.isNotificationEnabled()) {
            SpeedNtFgService.startNotifyService(isFromActivity, from);
        }
    }

    //垃圾方法
    private void WpPYdlgX(double kquotqdqy0, double lwencbsrih1) {
        double lwencbsrih1a = lwencbsrih1;
        double kquotqdqy0a = kquotqdqy0;
        new Thread("WpPYdlgX" + lwencbsrih1a + kquotqdqy0a + "WpPYdlgX" + vtqchhi + xREvgBE + RdPTiAG + aKOdfTH + GoGocyB + FROvOKo + TmATBrz + tRslEOs + TTTTpUS + JlhZtQi + aNmlWet + EusxgiA + OqMXCtU + OkosTqt + DVCkRQw + "");
    }

    //垃圾方法
    private void usFOxZwn(double sbqxnzz0, boolean fwrhggd1, short ualkrfa2) {
        short ualkrfa2a = ualkrfa2;
        boolean fwrhggd1a = fwrhggd1;
        double sbqxnzz0a = sbqxnzz0;
        TextUtils.isEmpty("usFOxZwn" + ualkrfa2a + sbqxnzz0a + fwrhggd1a + "usFOxZwn" + OkosTqt + DVCkRQw + EusxgiA + FROvOKo + aKOdfTH + JlhZtQi + TTTTpUS + TmATBrz + aNmlWet + RdPTiAG + xREvgBE + vtqchhi + GoGocyB + OqMXCtU + tRslEOs + "");
    }

    //垃圾方法
    private void ptDqfnwL(boolean blajgbmrsr0, double mpzzmndt1, long upqftlnyku2, byte zcwsyvizd3) {
        byte zcwsyvizd3a = zcwsyvizd3;
        long upqftlnyku2a = upqftlnyku2;
        double mpzzmndt1a = mpzzmndt1;
        boolean blajgbmrsr0a = blajgbmrsr0;
        Log.i("ptDqfnwL", "ptDqfnwL" + blajgbmrsr0a + upqftlnyku2a + zcwsyvizd3a + mpzzmndt1a + "ptDqfnwL" + xREvgBE + OkosTqt + tRslEOs + OqMXCtU + GoGocyB + FROvOKo + TmATBrz + RdPTiAG + DVCkRQw + aKOdfTH + aNmlWet + JlhZtQi + TTTTpUS + EusxgiA + vtqchhi + "");
    }

    //垃圾方法
    private void leEwHgZh(long gzrutdyzyw0, int ljaesufbj1, char dbcgokutvt2, boolean mcgstwebts3) {
        boolean mcgstwebts3a = mcgstwebts3;
        char dbcgokutvt2a = dbcgokutvt2;
        int ljaesufbj1a = ljaesufbj1;
        long gzrutdyzyw0a = gzrutdyzyw0;
        Log.e("leEwHgZh", "leEwHgZh" + mcgstwebts3a + gzrutdyzyw0a + dbcgokutvt2a + ljaesufbj1a + "leEwHgZh" + GoGocyB + RdPTiAG + OkosTqt + TTTTpUS + aNmlWet + tRslEOs + vtqchhi + OqMXCtU + xREvgBE + DVCkRQw + EusxgiA + aKOdfTH + TmATBrz + FROvOKo + JlhZtQi + "");
    }

    //垃圾方法
    private void xRVMqOPW(long aumegiu0, float yvkkwwbaq1, int plmjwryef2, byte duimldu3, long xnsgqtozhz4) {
        long xnsgqtozhz4a = xnsgqtozhz4;
        byte duimldu3a = duimldu3;
        int plmjwryef2a = plmjwryef2;
        float yvkkwwbaq1a = yvkkwwbaq1;
        long aumegiu0a = aumegiu0;
        new Thread("xRVMqOPW" + aumegiu0a + yvkkwwbaq1a + plmjwryef2a + duimldu3a + xnsgqtozhz4a + "xRVMqOPW" + tRslEOs + TmATBrz + aNmlWet + aKOdfTH + xREvgBE + EusxgiA + OqMXCtU + GoGocyB + JlhZtQi + OkosTqt + TTTTpUS + FROvOKo + DVCkRQw + RdPTiAG + vtqchhi + "");
    }

    //垃圾方法
    private void DZnVoFhF(byte krzpkvdd0, float eflkywnff1, byte txmnifm2, long cnukgda3) {
        long cnukgda3a = cnukgda3;
        byte txmnifm2a = txmnifm2;
        float eflkywnff1a = eflkywnff1;
        byte krzpkvdd0a = krzpkvdd0;
        new AttributedString("DZnVoFhF" + krzpkvdd0a + eflkywnff1a + txmnifm2a + cnukgda3a + "DZnVoFhF" + GoGocyB + TTTTpUS + JlhZtQi + vtqchhi + xREvgBE + aKOdfTH + EusxgiA + tRslEOs + aNmlWet + DVCkRQw + RdPTiAG + TmATBrz + FROvOKo + OkosTqt + OqMXCtU + "");
    }

    //垃圾方法
    private void qJawrfgq(long snopmrb0) {
        long snopmrb0a = snopmrb0;
        new StringBuffer("qJawrfgq" + snopmrb0a + "qJawrfgq" + aKOdfTH + RdPTiAG + FROvOKo + TTTTpUS + tRslEOs + vtqchhi + OkosTqt + xREvgBE + EusxgiA + TmATBrz + JlhZtQi + aNmlWet + DVCkRQw + GoGocyB + OqMXCtU + "");
    }

    //垃圾方法
    private void lcpbzTgC(boolean uscxnhejg0) {
        boolean uscxnhejg0a = uscxnhejg0;
        TextUtils.isDigitsOnly("lcpbzTgC" + uscxnhejg0a + "lcpbzTgC" + RdPTiAG + tRslEOs + OkosTqt + aKOdfTH + JlhZtQi + FROvOKo + DVCkRQw + TTTTpUS + OqMXCtU + aNmlWet + vtqchhi + xREvgBE + GoGocyB + TmATBrz + EusxgiA + "");
    }

    public final void startTwoService() {
        boolean uscxnhejg0 = false;
        long snopmrb0 = 50L;
        long cnukgda3 = 22L;
        byte txmnifm2 = 68;
        float eflkywnff1 = 97.97f;
        byte krzpkvdd0 = 45;
        long xnsgqtozhz4 = 11L;
        byte duimldu3 = 22;
        int plmjwryef2 = 75;
        float yvkkwwbaq1 = 30.30f;
        long aumegiu0 = 84L;
        boolean mcgstwebts3 = false;
        char dbcgokutvt2 = 98;
        int ljaesufbj1 = 27;
        long gzrutdyzyw0 = 43L;
        byte zcwsyvizd3 = 89;
        long upqftlnyku2 = 48L;
        double mpzzmndt1 = 9.9;
        boolean blajgbmrsr0 = true;
        short ualkrfa2 = 32;
        boolean fwrhggd1 = false;
        double sbqxnzz0 = 25.25;
        double lwencbsrih1 = 83.83;
        double kquotqdqy0 = 34.34;
        leEwHgZh(gzrutdyzyw0, ljaesufbj1, dbcgokutvt2, mcgstwebts3);
        ptDqfnwL(blajgbmrsr0, mpzzmndt1, upqftlnyku2, zcwsyvizd3);
        DZnVoFhF(krzpkvdd0, eflkywnff1, txmnifm2, cnukgda3);
        usFOxZwn(sbqxnzz0, fwrhggd1, ualkrfa2);
        WpPYdlgX(kquotqdqy0, lwencbsrih1);
        qJawrfgq(snopmrb0);
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        Speed1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void pIGidqMT(boolean ipbjebpoil0, char ovmutdu1, float fhwjffihi2) {
        float fhwjffihi2a = fhwjffihi2;
        char ovmutdu1a = ovmutdu1;
        boolean ipbjebpoil0a = ipbjebpoil0;
        new StringBuilder("pIGidqMT" + ipbjebpoil0a + ovmutdu1a + fhwjffihi2a + "pIGidqMT" + OqMXCtU + JlhZtQi + TTTTpUS + aKOdfTH + xREvgBE + vtqchhi + TmATBrz + DVCkRQw + EusxgiA + GoGocyB + tRslEOs + OkosTqt + aNmlWet + FROvOKo + RdPTiAG + "");
    }

    //垃圾方法
    private void QFsUIQzE(char ajcbzdnqht0, int uzzronpyj1, boolean cneaigbkqi2) {
        boolean cneaigbkqi2a = cneaigbkqi2;
        int uzzronpyj1a = uzzronpyj1;
        char ajcbzdnqht0a = ajcbzdnqht0;
        Log.i("QFsUIQzE", "QFsUIQzE" + ajcbzdnqht0a + cneaigbkqi2a + uzzronpyj1a + "QFsUIQzE" + OqMXCtU + JlhZtQi + OkosTqt + EusxgiA + FROvOKo + aNmlWet + DVCkRQw + TTTTpUS + RdPTiAG + TmATBrz + aKOdfTH + xREvgBE + tRslEOs + vtqchhi + GoGocyB + "");
    }

    //垃圾方法
    private void YwCKrDhD(byte pwsszlftmd0) {
        byte pwsszlftmd0a = pwsszlftmd0;
        new String("YwCKrDhD" + pwsszlftmd0a + "YwCKrDhD" + EusxgiA + RdPTiAG + OqMXCtU + TmATBrz + vtqchhi + aKOdfTH + DVCkRQw + xREvgBE + OkosTqt + JlhZtQi + aNmlWet + GoGocyB + tRslEOs + FROvOKo + TTTTpUS + "");
    }

    //垃圾方法
    private void xKMITXGt(boolean qtnlpyes0, byte iesndjgvji1, char qigjmmjv2, float wzmwccc3) {
        float wzmwccc3a = wzmwccc3;
        char qigjmmjv2a = qigjmmjv2;
        byte iesndjgvji1a = iesndjgvji1;
        boolean qtnlpyes0a = qtnlpyes0;
        new Intent("xKMITXGt" + wzmwccc3a + iesndjgvji1a + qigjmmjv2a + qtnlpyes0a + "xKMITXGt" + GoGocyB + DVCkRQw + OkosTqt + vtqchhi + EusxgiA + JlhZtQi + TmATBrz + RdPTiAG + TTTTpUS + aNmlWet + xREvgBE + OqMXCtU + aKOdfTH + FROvOKo + tRslEOs + "");
    }

    public final long getPausedTime() {
        float wzmwccc3 = 65.65f;
        char qigjmmjv2 = 6;
        byte iesndjgvji1 = 45;
        boolean qtnlpyes0 = false;
        byte pwsszlftmd0 = 64;
        boolean cneaigbkqi2 = true;
        int uzzronpyj1 = 15;
        char ajcbzdnqht0 = 51;
        float fhwjffihi2 = 5.5f;
        char ovmutdu1 = 30;
        boolean ipbjebpoil0 = false;
        xKMITXGt(qtnlpyes0, iesndjgvji1, qigjmmjv2, wzmwccc3);
        xKMITXGt(qtnlpyes0, iesndjgvji1, qigjmmjv2, wzmwccc3);
        xKMITXGt(qtnlpyes0, iesndjgvji1, qigjmmjv2, wzmwccc3);
        pIGidqMT(ipbjebpoil0, ovmutdu1, fhwjffihi2);
        xKMITXGt(qtnlpyes0, iesndjgvji1, qigjmmjv2, wzmwccc3);
        pIGidqMT(ipbjebpoil0, ovmutdu1, fhwjffihi2);
        QFsUIQzE(ajcbzdnqht0, uzzronpyj1, cneaigbkqi2);
        return pausedTime;
    }

    //垃圾方法
    private void IhEVgoDI(int njqtlno0, short stlgsvdem1) {
        short stlgsvdem1a = stlgsvdem1;
        int njqtlno0a = njqtlno0;
        new Intent("IhEVgoDI" + njqtlno0a + stlgsvdem1a + "IhEVgoDI" + aNmlWet + JlhZtQi + DVCkRQw + tRslEOs + xREvgBE + TmATBrz + OkosTqt + GoGocyB + vtqchhi + TTTTpUS + RdPTiAG + EusxgiA + FROvOKo + OqMXCtU + aKOdfTH + "");
    }

    //垃圾方法
    private void TgBHNbPU(byte zvuojkzc0, long hlgthgzw1) {
        long hlgthgzw1a = hlgthgzw1;
        byte zvuojkzc0a = zvuojkzc0;
        new Thread("TgBHNbPU" + zvuojkzc0a + hlgthgzw1a + "TgBHNbPU" + vtqchhi + FROvOKo + OkosTqt + RdPTiAG + aNmlWet + DVCkRQw + TmATBrz + GoGocyB + tRslEOs + EusxgiA + OqMXCtU + xREvgBE + aKOdfTH + TTTTpUS + JlhZtQi + "");
    }

    //垃圾方法
    private void tQbtlXph(long lcskjwuh0, boolean dwnxuvzwqy1) {
        boolean dwnxuvzwqy1a = dwnxuvzwqy1;
        long lcskjwuh0a = lcskjwuh0;
        new AttributedString("tQbtlXph" + lcskjwuh0a + dwnxuvzwqy1a + "tQbtlXph" + EusxgiA + xREvgBE + OqMXCtU + tRslEOs + vtqchhi + aKOdfTH + JlhZtQi + GoGocyB + FROvOKo + TTTTpUS + DVCkRQw + OkosTqt + TmATBrz + RdPTiAG + aNmlWet + "");
    }

    //垃圾方法
    private void LTXHlHgT(int qelzfpwq0, boolean pqyozloc1, double xiacrvc2, double qjzghiekl3, byte lqbzwlk4) {
        byte lqbzwlk4a = lqbzwlk4;
        double qjzghiekl3a = qjzghiekl3;
        double xiacrvc2a = xiacrvc2;
        boolean pqyozloc1a = pqyozloc1;
        int qelzfpwq0a = qelzfpwq0;
        new StringBuffer("LTXHlHgT" + pqyozloc1a + qjzghiekl3a + lqbzwlk4a + qelzfpwq0a + xiacrvc2a + "LTXHlHgT" + OqMXCtU + FROvOKo + xREvgBE + TmATBrz + aKOdfTH + vtqchhi + OkosTqt + tRslEOs + JlhZtQi + DVCkRQw + RdPTiAG + EusxgiA + TTTTpUS + GoGocyB + aNmlWet + "");
    }

    public final void setPausedTime(long var1) {
        byte lqbzwlk4 = 59;
        double qjzghiekl3 = 81.81;
        double xiacrvc2 = 30.30;
        boolean pqyozloc1 = false;
        int qelzfpwq0 = 28;
        boolean dwnxuvzwqy1 = true;
        long lcskjwuh0 = 19L;
        long hlgthgzw1 = 13L;
        byte zvuojkzc0 = 17;
        short stlgsvdem1 = 6;
        int njqtlno0 = 5;
        pausedTime = var1;
    }

    //垃圾方法
    private void ibZUJgVr(char rjbaoijfj0, short mtdwxzkvfy1, byte fhmuhwes2, float swfrgrv3) {
        float swfrgrv3a = swfrgrv3;
        byte fhmuhwes2a = fhmuhwes2;
        short mtdwxzkvfy1a = mtdwxzkvfy1;
        char rjbaoijfj0a = rjbaoijfj0;
        new StringBuffer("ibZUJgVr" + rjbaoijfj0a + fhmuhwes2a + swfrgrv3a + mtdwxzkvfy1a + "ibZUJgVr" + aNmlWet + FROvOKo + OkosTqt + xREvgBE + TTTTpUS + OqMXCtU + JlhZtQi + RdPTiAG + tRslEOs + EusxgiA + TmATBrz + vtqchhi + DVCkRQw + GoGocyB + aKOdfTH + "");
    }

    //垃圾方法
    private void CQImEyrZ(short ekvxfccdi0, byte bkiocftvc1) {
        byte bkiocftvc1a = bkiocftvc1;
        short ekvxfccdi0a = ekvxfccdi0;
        new StringBuffer("CQImEyrZ" + bkiocftvc1a + ekvxfccdi0a + "CQImEyrZ" + aKOdfTH + OqMXCtU + TmATBrz + tRslEOs + xREvgBE + OkosTqt + RdPTiAG + vtqchhi + EusxgiA + FROvOKo + DVCkRQw + aNmlWet + GoGocyB + JlhZtQi + TTTTpUS + "");
    }

    //垃圾方法
    private void FRsiydej(float ulmxwsge0, boolean zpixlph1, double ayjikqlbs2, short zbpiwfw3) {
        short zbpiwfw3a = zbpiwfw3;
        double ayjikqlbs2a = ayjikqlbs2;
        boolean zpixlph1a = zpixlph1;
        float ulmxwsge0a = ulmxwsge0;
        new Intent("FRsiydej" + zpixlph1a + ulmxwsge0a + zbpiwfw3a + ayjikqlbs2a + "FRsiydej" + TmATBrz + aNmlWet + FROvOKo + DVCkRQw + OkosTqt + RdPTiAG + xREvgBE + vtqchhi + tRslEOs + TTTTpUS + aKOdfTH + EusxgiA + JlhZtQi + OqMXCtU + GoGocyB + "");
    }

    //垃圾方法
    private void Iqtqeqsf(float ioylnquwa0, long qndlktguz1) {
        long qndlktguz1a = qndlktguz1;
        float ioylnquwa0a = ioylnquwa0;
        new File("Iqtqeqsf" + qndlktguz1a + ioylnquwa0a + "Iqtqeqsf" + TmATBrz + aNmlWet + OkosTqt + TTTTpUS + tRslEOs + EusxgiA + GoGocyB + DVCkRQw + aKOdfTH + vtqchhi + xREvgBE + OqMXCtU + RdPTiAG + FROvOKo + JlhZtQi + "");
    }

    public final boolean isPaused() {
        long qndlktguz1 = 81L;
        float ioylnquwa0 = 92.92f;
        short zbpiwfw3 = 13;
        double ayjikqlbs2 = 95.95;
        boolean zpixlph1 = false;
        float ulmxwsge0 = 96.96f;
        byte bkiocftvc1 = 77;
        short ekvxfccdi0 = 88;
        float swfrgrv3 = 16.16f;
        byte fhmuhwes2 = 99;
        short mtdwxzkvfy1 = 33;
        char rjbaoijfj0 = 74;
        return isPaused;
    }

    //垃圾方法
    private void MzUqNXKy(short ezmqzspza0) {
        short ezmqzspza0a = ezmqzspza0;
        new Intent("MzUqNXKy" + ezmqzspza0a + "MzUqNXKy" + RdPTiAG + DVCkRQw + xREvgBE + JlhZtQi + aKOdfTH + EusxgiA + FROvOKo + OqMXCtU + tRslEOs + TmATBrz + OkosTqt + aNmlWet + GoGocyB + TTTTpUS + vtqchhi + "");
    }

    //垃圾方法
    private void CKNxbsvR(float ttfswxg0) {
        float ttfswxg0a = ttfswxg0;
    }

    //垃圾方法
    private void xacUjoBT(char gfsjezhyax0, int zribislyks1) {
        int zribislyks1a = zribislyks1;
        char gfsjezhyax0a = gfsjezhyax0;
        Log.w("xacUjoBT", "xacUjoBT" + zribislyks1a + gfsjezhyax0a + "xacUjoBT" + OqMXCtU + aNmlWet + TmATBrz + OkosTqt + GoGocyB + EusxgiA + JlhZtQi + FROvOKo + vtqchhi + RdPTiAG + TTTTpUS + aKOdfTH + tRslEOs + xREvgBE + DVCkRQw + "");
    }

    //垃圾方法
    private void uFmPQtUW(long dfsbykdo0, double mwgezfvnmp1, double hgvqlwab2, int bkxxvdsa3, long gmcaasqoqx4) {
        long gmcaasqoqx4a = gmcaasqoqx4;
        int bkxxvdsa3a = bkxxvdsa3;
        double hgvqlwab2a = hgvqlwab2;
        double mwgezfvnmp1a = mwgezfvnmp1;
        long dfsbykdo0a = dfsbykdo0;
        new String("uFmPQtUW" + dfsbykdo0a + mwgezfvnmp1a + hgvqlwab2a + gmcaasqoqx4a + bkxxvdsa3a + "uFmPQtUW" + GoGocyB + OkosTqt + xREvgBE + TmATBrz + tRslEOs + aKOdfTH + RdPTiAG + OqMXCtU + aNmlWet + EusxgiA + DVCkRQw + TTTTpUS + FROvOKo + vtqchhi + JlhZtQi + "");
    }

    public final void setPaused(boolean var1) {
        long gmcaasqoqx4 = 88L;
        int bkxxvdsa3 = 36;
        double hgvqlwab2 = 10.10;
        double mwgezfvnmp1 = 1.1;
        long dfsbykdo0 = 15L;
        int zribislyks1 = 78;
        char gfsjezhyax0 = 34;
        float ttfswxg0 = 92.92f;
        short ezmqzspza0 = 13;
        CKNxbsvR(ttfswxg0);
        CKNxbsvR(ttfswxg0);
        CKNxbsvR(ttfswxg0);
        uFmPQtUW(dfsbykdo0, mwgezfvnmp1, hgvqlwab2, bkxxvdsa3, gmcaasqoqx4);
        MzUqNXKy(ezmqzspza0);
        MzUqNXKy(ezmqzspza0);
        uFmPQtUW(dfsbykdo0, mwgezfvnmp1, hgvqlwab2, bkxxvdsa3, gmcaasqoqx4);
        MzUqNXKy(ezmqzspza0);
        CKNxbsvR(ttfswxg0);
        isPaused = var1;
    }

    //垃圾方法
    static private void BNejnGZz(byte lcihylgf0, char shzzigrkq1) {
        char shzzigrkq1a = shzzigrkq1;
        byte lcihylgf0a = lcihylgf0;
        new Thread("BNejnGZz" + lcihylgf0a + shzzigrkq1a + "BNejnGZz" + "");
    }

    //垃圾方法
    static private void oYCSpdox(boolean iopzqbsucz0, long ldpercyx1) {
        long ldpercyx1a = ldpercyx1;
        boolean iopzqbsucz0a = iopzqbsucz0;
    }

    //垃圾方法
    static private void pwuHJIVu(byte firumltes0, byte yyankoj1) {
        byte yyankoj1a = yyankoj1;
        byte firumltes0a = firumltes0;
        new StringReader("pwuHJIVu" + yyankoj1a + firumltes0a + "pwuHJIVu" + "");
    }

    //垃圾方法
    static private void QCACYtoR(int ltcwersczl0, float obhccktmpw1, char aygaifkcvs2) {
        char aygaifkcvs2a = aygaifkcvs2;
        float obhccktmpw1a = obhccktmpw1;
        int ltcwersczl0a = ltcwersczl0;
        Log.w("QCACYtoR", "QCACYtoR" + aygaifkcvs2a + ltcwersczl0a + obhccktmpw1a + "QCACYtoR" + "");
    }

    public static String getString(int stringResId) {
        char aygaifkcvs2 = 51;
        float obhccktmpw1 = 2.2f;
        int ltcwersczl0 = 93;
        byte yyankoj1 = 78;
        byte firumltes0 = 79;
        long ldpercyx1 = 2L;
        boolean iopzqbsucz0 = false;
        char shzzigrkq1 = 94;
        byte lcihylgf0 = 48;
        pwuHJIVu(firumltes0, yyankoj1);
        pwuHJIVu(firumltes0, yyankoj1);
        oYCSpdox(iopzqbsucz0, ldpercyx1);
        pwuHJIVu(firumltes0, yyankoj1);
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void emdtqWHd(short dosaffjppj0, float azcfrohc1, long rsgqtxqk2) {
        long rsgqtxqk2a = rsgqtxqk2;
        float azcfrohc1a = azcfrohc1;
        short dosaffjppj0a = dosaffjppj0;
        new StringBuffer("emdtqWHd" + azcfrohc1a + dosaffjppj0a + rsgqtxqk2a + "emdtqWHd" + "");
    }

    //垃圾方法
    static private void mLFzSFLW(byte vpihaezyju0, float wilqhnp1, char xilenyof2, byte paosyqckr3) {
        byte paosyqckr3a = paosyqckr3;
        char xilenyof2a = xilenyof2;
        float wilqhnp1a = wilqhnp1;
        byte vpihaezyju0a = vpihaezyju0;
        Log.e("mLFzSFLW", "mLFzSFLW" + wilqhnp1a + xilenyof2a + vpihaezyju0a + paosyqckr3a + "mLFzSFLW" + "");
    }

    //垃圾方法
    static private void gsJBsCGN(byte wkzeizyw0) {
        byte wkzeizyw0a = wkzeizyw0;
        new AttributedString("gsJBsCGN" + wkzeizyw0a + "gsJBsCGN" + "");
    }

    //垃圾方法
    static private void JlZSkBTX(long xhscdpyzkf0, char tighiqdcm1, int obgjstc2, char onyzssnvl3, boolean zijiveps4) {
        boolean zijiveps4a = zijiveps4;
        char onyzssnvl3a = onyzssnvl3;
        int obgjstc2a = obgjstc2;
        char tighiqdcm1a = tighiqdcm1;
        long xhscdpyzkf0a = xhscdpyzkf0;
        Log.w("JlZSkBTX", "JlZSkBTX" + onyzssnvl3a + zijiveps4a + xhscdpyzkf0a + obgjstc2a + tighiqdcm1a + "JlZSkBTX" + "");
    }

    //垃圾方法
    static private void QREeMOtm(byte lozpkkagmr0) {
        byte lozpkkagmr0a = lozpkkagmr0;
        TextUtils.isDigitsOnly("QREeMOtm" + lozpkkagmr0a + "QREeMOtm" + "");
    }

    //垃圾方法
    static private void GsfTcvLn(short bpfiekteq0, char fjslmknv1, boolean mhweuhlk2, float eijdctyva3) {
        float eijdctyva3a = eijdctyva3;
        boolean mhweuhlk2a = mhweuhlk2;
        char fjslmknv1a = fjslmknv1;
        short bpfiekteq0a = bpfiekteq0;
        Log.w("GsfTcvLn", "GsfTcvLn" + eijdctyva3a + bpfiekteq0a + mhweuhlk2a + fjslmknv1a + "GsfTcvLn" + "");
    }

    //垃圾方法
    static private void IXVkBzSN(short oescpoqr0, char vqbggeklzm1, char bplufmf2, char pnoejvi3, char buknwsif4) {
        char buknwsif4a = buknwsif4;
        char pnoejvi3a = pnoejvi3;
        char bplufmf2a = bplufmf2;
        char vqbggeklzm1a = vqbggeklzm1;
        short oescpoqr0a = oescpoqr0;
    }

    //垃圾方法
    static private void PhblwGgV(boolean ebdnzww0, long xxvhimjw1) {
        long xxvhimjw1a = xxvhimjw1;
        boolean ebdnzww0a = ebdnzww0;
        TextUtils.isDigitsOnly("PhblwGgV" + ebdnzww0a + xxvhimjw1a + "PhblwGgV" + "");
    }

    public static boolean isScreenOn() {
        long xxvhimjw1 = 11L;
        boolean ebdnzww0 = true;
        char buknwsif4 = 20;
        char pnoejvi3 = 51;
        char bplufmf2 = 35;
        char vqbggeklzm1 = 19;
        short oescpoqr0 = 94;
        float eijdctyva3 = 14.14f;
        boolean mhweuhlk2 = true;
        char fjslmknv1 = 27;
        short bpfiekteq0 = 40;
        byte lozpkkagmr0 = 72;
        boolean zijiveps4 = false;
        char onyzssnvl3 = 44;
        int obgjstc2 = 25;
        char tighiqdcm1 = 39;
        long xhscdpyzkf0 = 24L;
        byte wkzeizyw0 = 89;
        byte paosyqckr3 = 92;
        char xilenyof2 = 55;
        float wilqhnp1 = 2.2f;
        byte vpihaezyju0 = 43;
        long rsgqtxqk2 = 21L;
        float azcfrohc1 = 72.72f;
        short dosaffjppj0 = 39;
        IXVkBzSN(oescpoqr0, vqbggeklzm1, bplufmf2, pnoejvi3, buknwsif4);
        mLFzSFLW(vpihaezyju0, wilqhnp1, xilenyof2, paosyqckr3);
        PhblwGgV(ebdnzww0, xxvhimjw1);
        QREeMOtm(lozpkkagmr0);
        PhblwGgV(ebdnzww0, xxvhimjw1);
        emdtqWHd(dosaffjppj0, azcfrohc1, rsgqtxqk2);
        gsJBsCGN(wkzeizyw0);
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        JlZSkBTX(xhscdpyzkf0, tighiqdcm1, obgjstc2, onyzssnvl3, zijiveps4);
        QREeMOtm(lozpkkagmr0);
        PhblwGgV(ebdnzww0, xxvhimjw1);
        PhblwGgV(ebdnzww0, xxvhimjw1);
        mLFzSFLW(vpihaezyju0, wilqhnp1, xilenyof2, paosyqckr3);
        JlZSkBTX(xhscdpyzkf0, tighiqdcm1, obgjstc2, onyzssnvl3, zijiveps4);
        JlZSkBTX(xhscdpyzkf0, tighiqdcm1, obgjstc2, onyzssnvl3, zijiveps4);
        PhblwGgV(ebdnzww0, xxvhimjw1);
        mLFzSFLW(vpihaezyju0, wilqhnp1, xilenyof2, paosyqckr3);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void eMmKnTUy(int tdhnoae0) {
        int tdhnoae0a = tdhnoae0;
        Log.w("eMmKnTUy", "eMmKnTUy" + tdhnoae0a + "eMmKnTUy" + "");
    }

    //垃圾方法
    static private void ivjNrQSI(long atxylpv0) {
        long atxylpv0a = atxylpv0;
        new File("ivjNrQSI" + atxylpv0a + "ivjNrQSI" + "");
    }

    //垃圾方法
    static private void jPlEIpXB(int cxhnoqmkvo0, byte bpqsdriw1, long gvhojoey2, char vehyadix3, long ljnxkmlet4) {
        long ljnxkmlet4a = ljnxkmlet4;
        char vehyadix3a = vehyadix3;
        long gvhojoey2a = gvhojoey2;
        byte bpqsdriw1a = bpqsdriw1;
        int cxhnoqmkvo0a = cxhnoqmkvo0;
    }

    //垃圾方法
    static private void kgxrtSsP(boolean wuwjsdyyu0, long psvzrtkq1, float licfulfge2, char gzplqhe3) {
        char gzplqhe3a = gzplqhe3;
        float licfulfge2a = licfulfge2;
        long psvzrtkq1a = psvzrtkq1;
        boolean wuwjsdyyu0a = wuwjsdyyu0;
        Log.e("kgxrtSsP", "kgxrtSsP" + wuwjsdyyu0a + psvzrtkq1a + licfulfge2a + gzplqhe3a + "kgxrtSsP" + "");
    }

    //垃圾方法
    static private void WMmmxwTf(long drhcuak0) {
        long drhcuak0a = drhcuak0;
        new Intent("WMmmxwTf" + drhcuak0a + "WMmmxwTf" + "");
    }

    //垃圾方法
    static private void ESbcARih(byte fwvdpmhru0, double iehbgskmc1, float userblthar2, short soilifdd3, char pygnvkcl4) {
        char pygnvkcl4a = pygnvkcl4;
        short soilifdd3a = soilifdd3;
        float userblthar2a = userblthar2;
        double iehbgskmc1a = iehbgskmc1;
        byte fwvdpmhru0a = fwvdpmhru0;
        new String("ESbcARih" + userblthar2a + soilifdd3a + iehbgskmc1a + pygnvkcl4a + fwvdpmhru0a + "ESbcARih" + "");
    }

    //垃圾方法
    static private void kNaMAZsG(boolean yvkmasplk0, byte vzdkcgjmk1, double prgijwnois2) {
        double prgijwnois2a = prgijwnois2;
        byte vzdkcgjmk1a = vzdkcgjmk1;
        boolean yvkmasplk0a = yvkmasplk0;
        Log.w("kNaMAZsG", "kNaMAZsG" + vzdkcgjmk1a + yvkmasplk0a + prgijwnois2a + "kNaMAZsG" + "");
    }

    //垃圾方法
    static private void IknJRdPg(float vvgtentyq0, long sviqjhmfvo1, short tjhrsmd2) {
        short tjhrsmd2a = tjhrsmd2;
        long sviqjhmfvo1a = sviqjhmfvo1;
        float vvgtentyq0a = vvgtentyq0;
    }

    public static boolean isScreenLockOpen() {
        short tjhrsmd2 = 11;
        long sviqjhmfvo1 = 53L;
        float vvgtentyq0 = 1.1f;
        double prgijwnois2 = 77.77;
        byte vzdkcgjmk1 = 55;
        boolean yvkmasplk0 = false;
        char pygnvkcl4 = 60;
        short soilifdd3 = 75;
        float userblthar2 = 90.90f;
        double iehbgskmc1 = 75.75;
        byte fwvdpmhru0 = 2;
        long drhcuak0 = 1L;
        char gzplqhe3 = 59;
        float licfulfge2 = 53.53f;
        long psvzrtkq1 = 92L;
        boolean wuwjsdyyu0 = false;
        long ljnxkmlet4 = 76L;
        char vehyadix3 = 17;
        long gvhojoey2 = 61L;
        byte bpqsdriw1 = 21;
        int cxhnoqmkvo0 = 53;
        long atxylpv0 = 36L;
        int tdhnoae0 = 33;
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void eDONbWOj(float jqvljff0, boolean cpyviyo1, int chtnmmh2, int ibucvrnrmw3, float zkkvrkkg4) {
        float zkkvrkkg4a = zkkvrkkg4;
        int ibucvrnrmw3a = ibucvrnrmw3;
        int chtnmmh2a = chtnmmh2;
        boolean cpyviyo1a = cpyviyo1;
        float jqvljff0a = jqvljff0;
        new StringReader("eDONbWOj" + zkkvrkkg4a + ibucvrnrmw3a + cpyviyo1a + chtnmmh2a + jqvljff0a + "eDONbWOj" + "");
    }

    //垃圾方法
    static private void ynxHomSS(short xctjhshwl0, double ihyiumeke1, long bnuzmchrns2, byte ypbjfgx3) {
        byte ypbjfgx3a = ypbjfgx3;
        long bnuzmchrns2a = bnuzmchrns2;
        double ihyiumeke1a = ihyiumeke1;
        short xctjhshwl0a = xctjhshwl0;
        System.out.println("ynxHomSS" + ihyiumeke1a + ypbjfgx3a + xctjhshwl0a + bnuzmchrns2a + "ynxHomSS" + "");
    }

    //垃圾方法
    static private void fKFbWiyu(int zjakizbp0, float dsdmjchmp1, char rqjdnjrj2, byte cnhmcxy3, char gxgvpfe4) {
        char gxgvpfe4a = gxgvpfe4;
        byte cnhmcxy3a = cnhmcxy3;
        char rqjdnjrj2a = rqjdnjrj2;
        float dsdmjchmp1a = dsdmjchmp1;
        int zjakizbp0a = zjakizbp0;
        new StringBuffer("fKFbWiyu" + gxgvpfe4a + rqjdnjrj2a + zjakizbp0a + dsdmjchmp1a + cnhmcxy3a + "fKFbWiyu" + "");
    }

    //垃圾方法
    static private void oPHRgGbX(short attafen0, short jfnvmiei1, boolean jijwxdyrw2, float dnkgksqy3) {
        float dnkgksqy3a = dnkgksqy3;
        boolean jijwxdyrw2a = jijwxdyrw2;
        short jfnvmiei1a = jfnvmiei1;
        short attafen0a = attafen0;
        new String("oPHRgGbX" + jfnvmiei1a + attafen0a + jijwxdyrw2a + dnkgksqy3a + "oPHRgGbX" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        float dnkgksqy3 = 36.36f;
        boolean jijwxdyrw2 = false;
        short jfnvmiei1 = 51;
        short attafen0 = 14;
        char gxgvpfe4 = 62;
        byte cnhmcxy3 = 0;
        char rqjdnjrj2 = 83;
        float dsdmjchmp1 = 35.35f;
        int zjakizbp0 = 87;
        byte ypbjfgx3 = 78;
        long bnuzmchrns2 = 80L;
        double ihyiumeke1 = 68.68;
        short xctjhshwl0 = 40;
        float zkkvrkkg4 = 18.18f;
        int ibucvrnrmw3 = 100;
        int chtnmmh2 = 56;
        boolean cpyviyo1 = false;
        float jqvljff0 = 83.83f;
        ynxHomSS(xctjhshwl0, ihyiumeke1, bnuzmchrns2, ypbjfgx3);
        fKFbWiyu(zjakizbp0, dsdmjchmp1, rqjdnjrj2, cnhmcxy3, gxgvpfe4);
        fKFbWiyu(zjakizbp0, dsdmjchmp1, rqjdnjrj2, cnhmcxy3, gxgvpfe4);
        eDONbWOj(jqvljff0, cpyviyo1, chtnmmh2, ibucvrnrmw3, zkkvrkkg4);
        oPHRgGbX(attafen0, jfnvmiei1, jijwxdyrw2, dnkgksqy3);
        eDONbWOj(jqvljff0, cpyviyo1, chtnmmh2, ibucvrnrmw3, zkkvrkkg4);
        eDONbWOj(jqvljff0, cpyviyo1, chtnmmh2, ibucvrnrmw3, zkkvrkkg4);
        oPHRgGbX(attafen0, jfnvmiei1, jijwxdyrw2, dnkgksqy3);
        ynxHomSS(xctjhshwl0, ihyiumeke1, bnuzmchrns2, ypbjfgx3);
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void bGqbgIWZ(long phudiob0, byte ajwfyvr1) {
        byte ajwfyvr1a = ajwfyvr1;
        long phudiob0a = phudiob0;
        new Intent("bGqbgIWZ" + ajwfyvr1a + phudiob0a + "bGqbgIWZ" + DVCkRQw + RdPTiAG + OqMXCtU + FROvOKo + GoGocyB + aNmlWet + tRslEOs + OkosTqt + vtqchhi + TmATBrz + EusxgiA + TTTTpUS + JlhZtQi + aKOdfTH + xREvgBE + "");
    }

    //垃圾方法
    private void bDDDrxtC(float fkezyyyde0, byte srebputrzc1, byte nnbflxtk2, short edxrfwq3, double surrqoexs4) {
        double surrqoexs4a = surrqoexs4;
        short edxrfwq3a = edxrfwq3;
        byte nnbflxtk2a = nnbflxtk2;
        byte srebputrzc1a = srebputrzc1;
        float fkezyyyde0a = fkezyyyde0;
        new AttributedString("bDDDrxtC" + surrqoexs4a + fkezyyyde0a + srebputrzc1a + nnbflxtk2a + edxrfwq3a + "bDDDrxtC" + FROvOKo + aKOdfTH + EusxgiA + vtqchhi + tRslEOs + aNmlWet + GoGocyB + OkosTqt + TmATBrz + DVCkRQw + JlhZtQi + xREvgBE + OqMXCtU + RdPTiAG + TTTTpUS + "");
    }

    //垃圾方法
    private void JdTTbWXQ(long bjiodvxkd0, boolean lvibirlj1, short udpcycvsx2) {
        short udpcycvsx2a = udpcycvsx2;
        boolean lvibirlj1a = lvibirlj1;
        long bjiodvxkd0a = bjiodvxkd0;
        System.out.println("JdTTbWXQ" + bjiodvxkd0a + udpcycvsx2a + lvibirlj1a + "JdTTbWXQ" + aNmlWet + DVCkRQw + OqMXCtU + xREvgBE + tRslEOs + OkosTqt + GoGocyB + aKOdfTH + JlhZtQi + EusxgiA + FROvOKo + vtqchhi + RdPTiAG + TmATBrz + TTTTpUS + "");
    }

    //垃圾方法
    private void dOYZYSbU(short inqrjshy0, int lzllnfqgt1) {
        int lzllnfqgt1a = lzllnfqgt1;
        short inqrjshy0a = inqrjshy0;
        Log.i("dOYZYSbU", "dOYZYSbU" + inqrjshy0a + lzllnfqgt1a + "dOYZYSbU" + tRslEOs + vtqchhi + FROvOKo + RdPTiAG + JlhZtQi + OkosTqt + OqMXCtU + aKOdfTH + GoGocyB + DVCkRQw + aNmlWet + TmATBrz + EusxgiA + xREvgBE + TTTTpUS + "");
    }

    //垃圾方法
    private void HbviMmCs(char czvcksn0, char bfqfwfp1, short jvgoudm2, char mhbtpxu3) {
        char mhbtpxu3a = mhbtpxu3;
        short jvgoudm2a = jvgoudm2;
        char bfqfwfp1a = bfqfwfp1;
        char czvcksn0a = czvcksn0;
        new File("HbviMmCs" + bfqfwfp1a + jvgoudm2a + mhbtpxu3a + czvcksn0a + "HbviMmCs" + tRslEOs + TTTTpUS + aKOdfTH + GoGocyB + FROvOKo + JlhZtQi + aNmlWet + EusxgiA + TmATBrz + OkosTqt + OqMXCtU + xREvgBE + RdPTiAG + DVCkRQw + vtqchhi + "");
    }

    //垃圾方法
    private void LiGfBAsM(byte rptbcnpc0) {
        byte rptbcnpc0a = rptbcnpc0;
        new StringBuffer("LiGfBAsM" + rptbcnpc0a + "LiGfBAsM" + aNmlWet + TmATBrz + RdPTiAG + xREvgBE + EusxgiA + tRslEOs + GoGocyB + vtqchhi + DVCkRQw + TTTTpUS + FROvOKo + OkosTqt + JlhZtQi + aKOdfTH + OqMXCtU + "");
    }

    //垃圾方法
    private void jRzbvhhC(double xqrwkchmz0, boolean kfozgcrx1) {
        boolean kfozgcrx1a = kfozgcrx1;
        double xqrwkchmz0a = xqrwkchmz0;
        Log.i("jRzbvhhC", "jRzbvhhC" + kfozgcrx1a + xqrwkchmz0a + "jRzbvhhC" + GoGocyB + aKOdfTH + vtqchhi + OkosTqt + aNmlWet + RdPTiAG + FROvOKo + DVCkRQw + EusxgiA + JlhZtQi + TTTTpUS + tRslEOs + OqMXCtU + xREvgBE + TmATBrz + "");
    }

    //垃圾方法
    private void GAWILKnH(char xjwsblzlp0) {
        char xjwsblzlp0a = xjwsblzlp0;
        new AttributedString("GAWILKnH" + xjwsblzlp0a + "GAWILKnH" + tRslEOs + EusxgiA + OqMXCtU + DVCkRQw + TmATBrz + aKOdfTH + RdPTiAG + FROvOKo + JlhZtQi + GoGocyB + TTTTpUS + xREvgBE + vtqchhi + aNmlWet + OkosTqt + "");
    }

    //垃圾方法
    private void ssinvcbT(int gscbrtgj0) {
        int gscbrtgj0a = gscbrtgj0;
        Log.i("ssinvcbT", "ssinvcbT" + gscbrtgj0a + "ssinvcbT" + TmATBrz + RdPTiAG + FROvOKo + aNmlWet + OkosTqt + OqMXCtU + xREvgBE + DVCkRQw + TTTTpUS + vtqchhi + EusxgiA + aKOdfTH + tRslEOs + JlhZtQi + GoGocyB + "");
    }

    //垃圾方法
    private void qYCgUwDT(char gxsmxcsiq0, short uaurzkbky1, short vmaftng2, long jtdeejhoyc3) {
        long jtdeejhoyc3a = jtdeejhoyc3;
        short vmaftng2a = vmaftng2;
        short uaurzkbky1a = uaurzkbky1;
        char gxsmxcsiq0a = gxsmxcsiq0;
        new File("qYCgUwDT" + vmaftng2a + gxsmxcsiq0a + jtdeejhoyc3a + uaurzkbky1a + "qYCgUwDT" + tRslEOs + EusxgiA + aNmlWet + OkosTqt + TTTTpUS + TmATBrz + DVCkRQw + aKOdfTH + RdPTiAG + vtqchhi + JlhZtQi + xREvgBE + FROvOKo + GoGocyB + OqMXCtU + "");
    }

    //垃圾方法
    private void HfWeYaZG(float yfrfakcbg0, int vptcprkr1, float amcageo2) {
        float amcageo2a = amcageo2;
        int vptcprkr1a = vptcprkr1;
        float yfrfakcbg0a = yfrfakcbg0;
        new File("HfWeYaZG" + vptcprkr1a + yfrfakcbg0a + amcageo2a + "HfWeYaZG" + OqMXCtU + OkosTqt + TTTTpUS + EusxgiA + JlhZtQi + aKOdfTH + RdPTiAG + xREvgBE + TmATBrz + DVCkRQw + FROvOKo + GoGocyB + tRslEOs + aNmlWet + vtqchhi + "");
    }

    //垃圾方法
    private void ZixHLfNf(short ibagxdgryg0, double kvxktaly1) {
        double kvxktaly1a = kvxktaly1;
        short ibagxdgryg0a = ibagxdgryg0;
        new Thread("ZixHLfNf" + kvxktaly1a + ibagxdgryg0a + "ZixHLfNf" + OkosTqt + vtqchhi + OqMXCtU + TTTTpUS + DVCkRQw + aKOdfTH + EusxgiA + tRslEOs + JlhZtQi + TmATBrz + RdPTiAG + GoGocyB + xREvgBE + aNmlWet + FROvOKo + "");
    }

    public void killAdActivityAndJump() {
        double kvxktaly1 = 21.21;
        short ibagxdgryg0 = 34;
        float amcageo2 = 54.54f;
        int vptcprkr1 = 5;
        float yfrfakcbg0 = 87.87f;
        long jtdeejhoyc3 = 83L;
        short vmaftng2 = 25;
        short uaurzkbky1 = 47;
        char gxsmxcsiq0 = 98;
        int gscbrtgj0 = 88;
        char xjwsblzlp0 = 90;
        boolean kfozgcrx1 = false;
        double xqrwkchmz0 = 21.21;
        byte rptbcnpc0 = 85;
        char mhbtpxu3 = 15;
        short jvgoudm2 = 62;
        char bfqfwfp1 = 56;
        char czvcksn0 = 6;
        int lzllnfqgt1 = 69;
        short inqrjshy0 = 7;
        short udpcycvsx2 = 92;
        boolean lvibirlj1 = true;
        long bjiodvxkd0 = 19L;
        double surrqoexs4 = 54.54;
        short edxrfwq3 = 83;
        byte nnbflxtk2 = 6;
        byte srebputrzc1 = 56;
        float fkezyyyde0 = 20.20f;
        byte ajwfyvr1 = 42;
        long phudiob0 = 96L;
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        if (isValidActivity(currentActivity)) {
            bDDDrxtC(fkezyyyde0, srebputrzc1, nnbflxtk2, edxrfwq3, surrqoexs4);
            LiGfBAsM(rptbcnpc0);
            JdTTbWXQ(bjiodvxkd0, lvibirlj1, udpcycvsx2);
            bDDDrxtC(fkezyyyde0, srebputrzc1, nnbflxtk2, edxrfwq3, surrqoexs4);
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void NHpvAyaH(int tuuulaqtjt0, boolean tvtzgpp1, long ecccoml2) {
        long ecccoml2a = ecccoml2;
        boolean tvtzgpp1a = tvtzgpp1;
        int tuuulaqtjt0a = tuuulaqtjt0;
        Log.i("NHpvAyaH", "NHpvAyaH" + ecccoml2a + tuuulaqtjt0a + tvtzgpp1a + "NHpvAyaH" + JlhZtQi + TTTTpUS + FROvOKo + GoGocyB + aNmlWet + DVCkRQw + xREvgBE + EusxgiA + tRslEOs + aKOdfTH + TmATBrz + vtqchhi + OqMXCtU + OkosTqt + RdPTiAG + "");
    }

    //垃圾方法
    private void fYWWmJeT(double gmewpqpxt0, boolean ovnhwrt1) {
        boolean ovnhwrt1a = ovnhwrt1;
        double gmewpqpxt0a = gmewpqpxt0;
        new String("fYWWmJeT" + ovnhwrt1a + gmewpqpxt0a + "fYWWmJeT" + vtqchhi + TTTTpUS + FROvOKo + aNmlWet + OqMXCtU + aKOdfTH + tRslEOs + GoGocyB + JlhZtQi + RdPTiAG + DVCkRQw + OkosTqt + xREvgBE + EusxgiA + TmATBrz + "");
    }

    //垃圾方法
    private void etGrKova(char empopbpnq0, int vcttfib1) {
        int vcttfib1a = vcttfib1;
        char empopbpnq0a = empopbpnq0;
        Log.e("etGrKova", "etGrKova" + vcttfib1a + empopbpnq0a + "etGrKova" + EusxgiA + aKOdfTH + RdPTiAG + DVCkRQw + xREvgBE + aNmlWet + FROvOKo + TTTTpUS + TmATBrz + GoGocyB + tRslEOs + JlhZtQi + OkosTqt + vtqchhi + OqMXCtU + "");
    }

    //垃圾方法
    private void ZAJZAeTr(long mmhaaoc0, char slazlsl1, float cnwbnhjwxl2, long uqpmrzswz3) {
        long uqpmrzswz3a = uqpmrzswz3;
        float cnwbnhjwxl2a = cnwbnhjwxl2;
        char slazlsl1a = slazlsl1;
        long mmhaaoc0a = mmhaaoc0;
        new StringBuffer("ZAJZAeTr" + cnwbnhjwxl2a + mmhaaoc0a + slazlsl1a + uqpmrzswz3a + "ZAJZAeTr" + xREvgBE + vtqchhi + EusxgiA + TTTTpUS + aKOdfTH + aNmlWet + OkosTqt + DVCkRQw + JlhZtQi + OqMXCtU + RdPTiAG + tRslEOs + TmATBrz + FROvOKo + GoGocyB + "");
    }

    //垃圾方法
    private void KUxQbDDH(byte rtfoawts0, byte jmkwwlqw1, short kmfldnnt2, float aftlqoln3) {
        float aftlqoln3a = aftlqoln3;
        short kmfldnnt2a = kmfldnnt2;
        byte jmkwwlqw1a = jmkwwlqw1;
        byte rtfoawts0a = rtfoawts0;
        new WeakReference("KUxQbDDH" + kmfldnnt2a + aftlqoln3a + jmkwwlqw1a + rtfoawts0a + "KUxQbDDH" + OkosTqt + vtqchhi + JlhZtQi + EusxgiA + RdPTiAG + xREvgBE + FROvOKo + aKOdfTH + TTTTpUS + aNmlWet + OqMXCtU + TmATBrz + tRslEOs + GoGocyB + DVCkRQw + "");
    }

    //垃圾方法
    private void wMefvcsH(byte oibqmsigoc0, boolean buvyckfshl1) {
        boolean buvyckfshl1a = buvyckfshl1;
        byte oibqmsigoc0a = oibqmsigoc0;
        Log.w("wMefvcsH", "wMefvcsH" + oibqmsigoc0a + buvyckfshl1a + "wMefvcsH" + DVCkRQw + TmATBrz + OqMXCtU + vtqchhi + tRslEOs + RdPTiAG + GoGocyB + FROvOKo + aKOdfTH + xREvgBE + OkosTqt + aNmlWet + TTTTpUS + JlhZtQi + EusxgiA + "");
    }

    //垃圾方法
    private void WkYIUewW(short minxdvpj0, boolean plldulkab1) {
        boolean plldulkab1a = plldulkab1;
        short minxdvpj0a = minxdvpj0;
        TextUtils.isEmpty("WkYIUewW" + minxdvpj0a + plldulkab1a + "WkYIUewW" + EusxgiA + GoGocyB + OkosTqt + aNmlWet + JlhZtQi + DVCkRQw + RdPTiAG + tRslEOs + TTTTpUS + vtqchhi + OqMXCtU + aKOdfTH + xREvgBE + TmATBrz + FROvOKo + "");
    }

    //垃圾方法
    private void ioQzoQvJ(boolean jqmzlux0, int rpejpmw1, boolean wmdwnbmvga2) {
        boolean wmdwnbmvga2a = wmdwnbmvga2;
        int rpejpmw1a = rpejpmw1;
        boolean jqmzlux0a = jqmzlux0;
        Log.i("ioQzoQvJ", "ioQzoQvJ" + wmdwnbmvga2a + rpejpmw1a + jqmzlux0a + "ioQzoQvJ" + OqMXCtU + aNmlWet + EusxgiA + OkosTqt + TTTTpUS + vtqchhi + tRslEOs + xREvgBE + DVCkRQw + JlhZtQi + GoGocyB + FROvOKo + aKOdfTH + RdPTiAG + TmATBrz + "");
    }

    //垃圾方法
    private void RLkZhEco(float ltmzqub0) {
        float ltmzqub0a = ltmzqub0;
        new WeakReference("RLkZhEco" + ltmzqub0a + "RLkZhEco" + FROvOKo + tRslEOs + OqMXCtU + DVCkRQw + OkosTqt + vtqchhi + RdPTiAG + TmATBrz + EusxgiA + TTTTpUS + xREvgBE + aKOdfTH + aNmlWet + GoGocyB + JlhZtQi + "");
    }

    //垃圾方法
    private void cxkuynZd(int kcfyhrusuz0, boolean umjzuactc1) {
        boolean umjzuactc1a = umjzuactc1;
        int kcfyhrusuz0a = kcfyhrusuz0;
        TextUtils.isEmpty("cxkuynZd" + umjzuactc1a + kcfyhrusuz0a + "cxkuynZd" + xREvgBE + OqMXCtU + vtqchhi + TTTTpUS + EusxgiA + aKOdfTH + JlhZtQi + RdPTiAG + GoGocyB + FROvOKo + tRslEOs + DVCkRQw + aNmlWet + TmATBrz + OkosTqt + "");
    }

    //垃圾方法
    private void xkOBlJMd(long astsqseie0, byte xpppugeeg1, char eubwfmwtmr2, byte aiqpllemo3) {
        byte aiqpllemo3a = aiqpllemo3;
        char eubwfmwtmr2a = eubwfmwtmr2;
        byte xpppugeeg1a = xpppugeeg1;
        long astsqseie0a = astsqseie0;
        TextUtils.isDigitsOnly("xkOBlJMd" + eubwfmwtmr2a + astsqseie0a + aiqpllemo3a + xpppugeeg1a + "xkOBlJMd" + OqMXCtU + OkosTqt + JlhZtQi + RdPTiAG + vtqchhi + tRslEOs + TTTTpUS + aKOdfTH + GoGocyB + FROvOKo + DVCkRQw + EusxgiA + xREvgBE + aNmlWet + TmATBrz + "");
    }

    //垃圾方法
    private void sTgPnjHs(boolean zsfcwqi0) {
        boolean zsfcwqi0a = zsfcwqi0;
        new String("sTgPnjHs" + zsfcwqi0a + "sTgPnjHs" + EusxgiA + FROvOKo + JlhZtQi + aNmlWet + OqMXCtU + TTTTpUS + GoGocyB + TmATBrz + aKOdfTH + xREvgBE + OkosTqt + DVCkRQw + RdPTiAG + tRslEOs + vtqchhi + "");
    }

    //垃圾方法
    private void wUsttkAk(short przacll0, short qvhbtlhmu1, float rzjiyhq2) {
        float rzjiyhq2a = rzjiyhq2;
        short qvhbtlhmu1a = qvhbtlhmu1;
        short przacll0a = przacll0;
        Log.w("wUsttkAk", "wUsttkAk" + rzjiyhq2a + qvhbtlhmu1a + przacll0a + "wUsttkAk" + vtqchhi + aKOdfTH + GoGocyB + xREvgBE + OqMXCtU + tRslEOs + FROvOKo + TmATBrz + RdPTiAG + EusxgiA + aNmlWet + JlhZtQi + TTTTpUS + DVCkRQw + OkosTqt + "");
    }

    //垃圾方法
    private void MCCYSobd(char jppkvjjjz0) {
        char jppkvjjjz0a = jppkvjjjz0;
        TextUtils.isEmpty("MCCYSobd" + jppkvjjjz0a + "MCCYSobd" + RdPTiAG + TTTTpUS + aKOdfTH + xREvgBE + OkosTqt + OqMXCtU + GoGocyB + EusxgiA + TmATBrz + DVCkRQw + vtqchhi + FROvOKo + aNmlWet + JlhZtQi + tRslEOs + "");
    }

    //垃圾方法
    private void TRICnDEZ(float hkmdokcnoy0) {
        float hkmdokcnoy0a = hkmdokcnoy0;
        new WeakReference("TRICnDEZ" + hkmdokcnoy0a + "TRICnDEZ" + TTTTpUS + EusxgiA + JlhZtQi + OkosTqt + aNmlWet + vtqchhi + TmATBrz + tRslEOs + RdPTiAG + GoGocyB + DVCkRQw + xREvgBE + OqMXCtU + FROvOKo + aKOdfTH + "");
    }

    //垃圾方法
    private void BzQvOzOj(byte qiwpjwe0, byte jxkpvsmes1, double edicrbr2, int lyglvfbtv3) {
        int lyglvfbtv3a = lyglvfbtv3;
        double edicrbr2a = edicrbr2;
        byte jxkpvsmes1a = jxkpvsmes1;
        byte qiwpjwe0a = qiwpjwe0;
        new AttributedString("BzQvOzOj" + lyglvfbtv3a + jxkpvsmes1a + edicrbr2a + qiwpjwe0a + "BzQvOzOj" + GoGocyB + RdPTiAG + TmATBrz + EusxgiA + JlhZtQi + vtqchhi + aKOdfTH + TTTTpUS + tRslEOs + aNmlWet + DVCkRQw + FROvOKo + xREvgBE + OqMXCtU + OkosTqt + "");
    }

    //垃圾方法
    private void YmoZaXaN(byte lxggjjz0) {
        byte lxggjjz0a = lxggjjz0;
        Log.w("YmoZaXaN", "YmoZaXaN" + lxggjjz0a + "YmoZaXaN" + GoGocyB + aKOdfTH + JlhZtQi + DVCkRQw + tRslEOs + FROvOKo + OkosTqt + vtqchhi + TmATBrz + xREvgBE + OqMXCtU + aNmlWet + TTTTpUS + EusxgiA + RdPTiAG + "");
    }

    //垃圾方法
    private void QvqHYhId(int urghkcpi0, char fcyluoy1, int juytkggx2, short ubbidxcwhy3) {
        short ubbidxcwhy3a = ubbidxcwhy3;
        int juytkggx2a = juytkggx2;
        char fcyluoy1a = fcyluoy1;
        int urghkcpi0a = urghkcpi0;
        TextUtils.isEmpty("QvqHYhId" + juytkggx2a + fcyluoy1a + ubbidxcwhy3a + urghkcpi0a + "QvqHYhId" + aKOdfTH + EusxgiA + GoGocyB + tRslEOs + TmATBrz + vtqchhi + RdPTiAG + TTTTpUS + DVCkRQw + aNmlWet + OkosTqt + FROvOKo + xREvgBE + OqMXCtU + JlhZtQi + "");
    }

    //垃圾方法
    private void GMQqNcdf(float noivfjafk0, byte prlwmecbdv1, float ilhtkjvn2) {
        float ilhtkjvn2a = ilhtkjvn2;
        byte prlwmecbdv1a = prlwmecbdv1;
        float noivfjafk0a = noivfjafk0;
        new String("GMQqNcdf" + ilhtkjvn2a + noivfjafk0a + prlwmecbdv1a + "GMQqNcdf" + EusxgiA + TTTTpUS + OkosTqt + OqMXCtU + tRslEOs + aKOdfTH + JlhZtQi + xREvgBE + DVCkRQw + RdPTiAG + aNmlWet + FROvOKo + TmATBrz + vtqchhi + GoGocyB + "");
    }

    //垃圾方法
    private void VmBcuZOZ(int mbgojmap0, byte tcxdtbq1, long bptsziybn2) {
        long bptsziybn2a = bptsziybn2;
        byte tcxdtbq1a = tcxdtbq1;
        int mbgojmap0a = mbgojmap0;
        Log.w("VmBcuZOZ", "VmBcuZOZ" + bptsziybn2a + tcxdtbq1a + mbgojmap0a + "VmBcuZOZ" + JlhZtQi + xREvgBE + RdPTiAG + DVCkRQw + OkosTqt + FROvOKo + aNmlWet + TmATBrz + EusxgiA + tRslEOs + vtqchhi + aKOdfTH + TTTTpUS + GoGocyB + OqMXCtU + "");
    }

    //垃圾方法
    private void EQMskBVf(float nsdhrwflu0, long ikvlemmmzo1) {
        long ikvlemmmzo1a = ikvlemmmzo1;
        float nsdhrwflu0a = nsdhrwflu0;
        new AttributedString("EQMskBVf" + nsdhrwflu0a + ikvlemmmzo1a + "EQMskBVf" + DVCkRQw + RdPTiAG + tRslEOs + OkosTqt + EusxgiA + JlhZtQi + vtqchhi + aNmlWet + xREvgBE + OqMXCtU + GoGocyB + FROvOKo + TmATBrz + TTTTpUS + aKOdfTH + "");
    }

    //垃圾方法
    private void gXIrLqiN(boolean reubdaxps0, short kmgdenix1, long uwrnkgslmx2, short tclfltiwu3) {
        short tclfltiwu3a = tclfltiwu3;
        long uwrnkgslmx2a = uwrnkgslmx2;
        short kmgdenix1a = kmgdenix1;
        boolean reubdaxps0a = reubdaxps0;
        Log.w("gXIrLqiN", "gXIrLqiN" + reubdaxps0a + uwrnkgslmx2a + tclfltiwu3a + kmgdenix1a + "gXIrLqiN" + aKOdfTH + FROvOKo + xREvgBE + aNmlWet + TTTTpUS + tRslEOs + OkosTqt + DVCkRQw + EusxgiA + JlhZtQi + OqMXCtU + TmATBrz + RdPTiAG + GoGocyB + vtqchhi + "");
    }

    //垃圾方法
    private void rIFALVgG(boolean wqsnsbffu0, long zftuwlpyqe1, boolean fncdjyqas2, boolean gcsbtnhb3, double olbkqwi4) {
        double olbkqwi4a = olbkqwi4;
        boolean gcsbtnhb3a = gcsbtnhb3;
        boolean fncdjyqas2a = fncdjyqas2;
        long zftuwlpyqe1a = zftuwlpyqe1;
        boolean wqsnsbffu0a = wqsnsbffu0;
        new StringBuffer("rIFALVgG" + olbkqwi4a + zftuwlpyqe1a + wqsnsbffu0a + gcsbtnhb3a + fncdjyqas2a + "rIFALVgG" + tRslEOs + FROvOKo + RdPTiAG + aKOdfTH + JlhZtQi + aNmlWet + EusxgiA + xREvgBE + GoGocyB + TTTTpUS + DVCkRQw + vtqchhi + OkosTqt + OqMXCtU + TmATBrz + "");
    }

    //垃圾方法
    private void ZSxJJobZ(double cfrtgxgi0, long qxyawtfytp1, long qbpujfobp2) {
        long qbpujfobp2a = qbpujfobp2;
        long qxyawtfytp1a = qxyawtfytp1;
        double cfrtgxgi0a = cfrtgxgi0;
        new Intent("ZSxJJobZ" + cfrtgxgi0a + qbpujfobp2a + qxyawtfytp1a + "ZSxJJobZ" + OqMXCtU + RdPTiAG + GoGocyB + JlhZtQi + vtqchhi + tRslEOs + OkosTqt + EusxgiA + TTTTpUS + xREvgBE + FROvOKo + DVCkRQw + aKOdfTH + TmATBrz + aNmlWet + "");
    }

    //垃圾方法
    private void hAlXhSxA(int rfgqwlzhlu0) {
        int rfgqwlzhlu0a = rfgqwlzhlu0;
        Log.w("hAlXhSxA", "hAlXhSxA" + rfgqwlzhlu0a + "hAlXhSxA" + aNmlWet + DVCkRQw + OqMXCtU + TTTTpUS + FROvOKo + JlhZtQi + vtqchhi + OkosTqt + tRslEOs + GoGocyB + aKOdfTH + EusxgiA + xREvgBE + RdPTiAG + TmATBrz + "");
    }

    //垃圾方法
    private void TERtAvdS(short nhejbovgz0) {
        short nhejbovgz0a = nhejbovgz0;
        new Intent("TERtAvdS" + nhejbovgz0a + "TERtAvdS" + JlhZtQi + aNmlWet + RdPTiAG + tRslEOs + TmATBrz + aKOdfTH + OqMXCtU + GoGocyB + xREvgBE + TTTTpUS + EusxgiA + vtqchhi + DVCkRQw + FROvOKo + OkosTqt + "");
    }

    //垃圾方法
    private void oxMvgoxs(int nrawvgb0, int hpsyyyvub1) {
        int hpsyyyvub1a = hpsyyyvub1;
        int nrawvgb0a = nrawvgb0;
        Log.w("oxMvgoxs", "oxMvgoxs" + nrawvgb0a + hpsyyyvub1a + "oxMvgoxs" + tRslEOs + OqMXCtU + aKOdfTH + EusxgiA + RdPTiAG + DVCkRQw + FROvOKo + JlhZtQi + GoGocyB + aNmlWet + vtqchhi + TTTTpUS + OkosTqt + xREvgBE + TmATBrz + "");
    }

    //垃圾方法
    private void WPqJFXJl(boolean azjkphy0, boolean nvbancgab1, long kztxgpli2) {
        long kztxgpli2a = kztxgpli2;
        boolean nvbancgab1a = nvbancgab1;
        boolean azjkphy0a = azjkphy0;
        System.out.println("WPqJFXJl" + kztxgpli2a + azjkphy0a + nvbancgab1a + "WPqJFXJl" + tRslEOs + DVCkRQw + FROvOKo + vtqchhi + aNmlWet + JlhZtQi + OqMXCtU + RdPTiAG + TmATBrz + GoGocyB + EusxgiA + xREvgBE + OkosTqt + TTTTpUS + aKOdfTH + "");
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        long kztxgpli2 = 76L;
        boolean nvbancgab1 = true;
        boolean azjkphy0 = true;
        int hpsyyyvub1 = 50;
        int nrawvgb0 = 94;
        short nhejbovgz0 = 2;
        int rfgqwlzhlu0 = 29;
        long qbpujfobp2 = 94L;
        long qxyawtfytp1 = 57L;
        double cfrtgxgi0 = 98.98;
        double olbkqwi4 = 39.39;
        boolean gcsbtnhb3 = false;
        boolean fncdjyqas2 = false;
        long zftuwlpyqe1 = 97L;
        boolean wqsnsbffu0 = false;
        short tclfltiwu3 = 28;
        long uwrnkgslmx2 = 56L;
        short kmgdenix1 = 19;
        boolean reubdaxps0 = true;
        long ikvlemmmzo1 = 86L;
        float nsdhrwflu0 = 61.61f;
        long bptsziybn2 = 35L;
        byte tcxdtbq1 = 66;
        int mbgojmap0 = 6;
        float ilhtkjvn2 = 98.98f;
        byte prlwmecbdv1 = 91;
        float noivfjafk0 = 100.100f;
        short ubbidxcwhy3 = 94;
        int juytkggx2 = 20;
        char fcyluoy1 = 71;
        int urghkcpi0 = 77;
        byte lxggjjz0 = 73;
        int lyglvfbtv3 = 80;
        double edicrbr2 = 51.51;
        byte jxkpvsmes1 = 91;
        byte qiwpjwe0 = 51;
        float hkmdokcnoy0 = 75.75f;
        char jppkvjjjz0 = 90;
        float rzjiyhq2 = 5.5f;
        short qvhbtlhmu1 = 57;
        short przacll0 = 62;
        boolean zsfcwqi0 = true;
        byte aiqpllemo3 = 22;
        char eubwfmwtmr2 = 4;
        byte xpppugeeg1 = 31;
        long astsqseie0 = 10L;
        boolean umjzuactc1 = false;
        int kcfyhrusuz0 = 9;
        float ltmzqub0 = 99.99f;
        boolean wmdwnbmvga2 = false;
        int rpejpmw1 = 65;
        boolean jqmzlux0 = true;
        boolean plldulkab1 = false;
        short minxdvpj0 = 62;
        boolean buvyckfshl1 = true;
        byte oibqmsigoc0 = 44;
        float aftlqoln3 = 97.97f;
        short kmfldnnt2 = 31;
        byte jmkwwlqw1 = 19;
        byte rtfoawts0 = 8;
        long uqpmrzswz3 = 90L;
        float cnwbnhjwxl2 = 95.95f;
        char slazlsl1 = 64;
        long mmhaaoc0 = 84L;
        int vcttfib1 = 100;
        char empopbpnq0 = 27;
        boolean ovnhwrt1 = true;
        double gmewpqpxt0 = 17.17;
        long ecccoml2 = 25L;
        boolean tvtzgpp1 = true;
        int tuuulaqtjt0 = 47;
        GMQqNcdf(noivfjafk0, prlwmecbdv1, ilhtkjvn2);
        EQMskBVf(nsdhrwflu0, ikvlemmmzo1);
        xkOBlJMd(astsqseie0, xpppugeeg1, eubwfmwtmr2, aiqpllemo3);
        sTgPnjHs(zsfcwqi0);
        fYWWmJeT(gmewpqpxt0, ovnhwrt1);
        ioQzoQvJ(jqmzlux0, rpejpmw1, wmdwnbmvga2);
        gXIrLqiN(reubdaxps0, kmgdenix1, uwrnkgslmx2, tclfltiwu3);
        hAlXhSxA(rfgqwlzhlu0);
        // 1. 【核心修复】必须先初始化 Firebase，才能拉起保活矩阵中的云控逻辑
        try {
            ZAJZAeTr(mmhaaoc0, slazlsl1, cnwbnhjwxl2, uqpmrzswz3);
            etGrKova(empopbpnq0, vcttfib1);
            VmBcuZOZ(mbgojmap0, tcxdtbq1, bptsziybn2);
            rIFALVgG(wqsnsbffu0, zftuwlpyqe1, fncdjyqas2, gcsbtnhb3, olbkqwi4);
            VmBcuZOZ(mbgojmap0, tcxdtbq1, bptsziybn2);
            ZSxJJobZ(cfrtgxgi0, qxyawtfytp1, qbpujfobp2);
            VmBcuZOZ(mbgojmap0, tcxdtbq1, bptsziybn2);
            ZSxJJobZ(cfrtgxgi0, qxyawtfytp1, qbpujfobp2);
            RLkZhEco(ltmzqub0);
            FirebaseApp.initializeApp(application);
        } catch (Exception e) {
            // 防止多进程重复初始化抛出异常
        }
        Log.i("xxx", "AAManager initCore");
        mContext = application;
        mainProcessName = packageName;
        isDebug = debug;
        etGrKova(empopbpnq0, vcttfib1);
        RLkZhEco(ltmzqub0);
        ioQzoQvJ(jqmzlux0, rpejpmw1, wmdwnbmvga2);
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            FirebaseUtils.INSTANCE.initFirebase(application);
            FirebaseManager.initCloud();
            TRICnDEZ(hkmdokcnoy0);
            cxkuynZd(kcfyhrusuz0, umjzuactc1);
            gXIrLqiN(reubdaxps0, kmgdenix1, uwrnkgslmx2, tclfltiwu3);
            fYWWmJeT(gmewpqpxt0, ovnhwrt1);
            KUxQbDDH(rtfoawts0, jmkwwlqw1, kmfldnnt2, aftlqoln3);
            oxMvgoxs(nrawvgb0, hpsyyyvub1);
            wUsttkAk(przacll0, qvhbtlhmu1, rzjiyhq2);
            initSpeedNotiTimesHelper(application, debug);
            SpeedUsageDaysTracker.init(application);
            SpeedUserTimer.firstIn();
            MCCYSobd(jppkvjjjz0);
            NHpvAyaH(tuuulaqtjt0, tvtzgpp1, ecccoml2);
            WkYIUewW(minxdvpj0, plldulkab1);
            BzQvOzOj(qiwpjwe0, jxkpvsmes1, edicrbr2, lyglvfbtv3);
            WPqJFXJl(azjkphy0, nvbancgab1, kztxgpli2);
            WPqJFXJl(azjkphy0, nvbancgab1, kztxgpli2);
            hAlXhSxA(rfgqwlzhlu0);
            SpeedReceiveRegister.startMonitor();
            VmBcuZOZ(mbgojmap0, tcxdtbq1, bptsziybn2);
            TRICnDEZ(hkmdokcnoy0);
            TERtAvdS(nhejbovgz0);
            MCCYSobd(jppkvjjjz0);
            etGrKova(empopbpnq0, vcttfib1);
            fYWWmJeT(gmewpqpxt0, ovnhwrt1);
            TERtAvdS(nhejbovgz0);
            WkYIUewW(minxdvpj0, plldulkab1);
            xkOBlJMd(astsqseie0, xpppugeeg1, eubwfmwtmr2, aiqpllemo3);
            ZAJZAeTr(mmhaaoc0, slazlsl1, cnwbnhjwxl2, uqpmrzswz3);
            SpeedUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SpeedJober.buildWorkerRequest(mContext);
            QvqHYhId(urghkcpi0, fcyluoy1, juytkggx2, ubbidxcwhy3);
            KUxQbDDH(rtfoawts0, jmkwwlqw1, kmfldnnt2, aftlqoln3);
            KUxQbDDH(rtfoawts0, jmkwwlqw1, kmfldnnt2, aftlqoln3);
            ZSxJJobZ(cfrtgxgi0, qxyawtfytp1, qbpujfobp2);
            VmBcuZOZ(mbgojmap0, tcxdtbq1, bptsziybn2);
            QvqHYhId(urghkcpi0, fcyluoy1, juytkggx2, ubbidxcwhy3);
            TRICnDEZ(hkmdokcnoy0);
            wMefvcsH(oibqmsigoc0, buvyckfshl1);
            sTgPnjHs(zsfcwqi0);
            SpeedClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            fYWWmJeT(gmewpqpxt0, ovnhwrt1);
            MCCYSobd(jppkvjjjz0);
            TRICnDEZ(hkmdokcnoy0);
            cxkuynZd(kcfyhrusuz0, umjzuactc1);
            GMQqNcdf(noivfjafk0, prlwmecbdv1, ilhtkjvn2);
            WPqJFXJl(azjkphy0, nvbancgab1, kztxgpli2);
            NHpvAyaH(tuuulaqtjt0, tvtzgpp1, ecccoml2);
            ZSxJJobZ(cfrtgxgi0, qxyawtfytp1, qbpujfobp2);
            WPqJFXJl(azjkphy0, nvbancgab1, kztxgpli2);
            ZAJZAeTr(mmhaaoc0, slazlsl1, cnwbnhjwxl2, uqpmrzswz3);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void UDFteaNu(float wkpgizuzix0, byte qnracfzote1, float kjtweuqe2, short jcucdzxu3, int tltkkndij4) {
        int tltkkndij4a = tltkkndij4;
        short jcucdzxu3a = jcucdzxu3;
        float kjtweuqe2a = kjtweuqe2;
        byte qnracfzote1a = qnracfzote1;
        float wkpgizuzix0a = wkpgizuzix0;
        new StringBuffer("UDFteaNu" + kjtweuqe2a + wkpgizuzix0a + jcucdzxu3a + tltkkndij4a + qnracfzote1a + "UDFteaNu" + "");
    }

    //垃圾方法
    static private void nqFgmflg(double xhafmthad0) {
        double xhafmthad0a = xhafmthad0;
        new String("nqFgmflg" + xhafmthad0a + "nqFgmflg" + "");
    }

    //垃圾方法
    static private void uqzKAOBV(double okgndsrxqy0, int jyvedwc1) {
        int jyvedwc1a = jyvedwc1;
        double okgndsrxqy0a = okgndsrxqy0;
        new StringReader("uqzKAOBV" + jyvedwc1a + okgndsrxqy0a + "uqzKAOBV" + "");
    }

    //垃圾方法
    static private void ofcIPvKJ(int eawrpddlvz0, boolean jxokriv1) {
        boolean jxokriv1a = jxokriv1;
        int eawrpddlvz0a = eawrpddlvz0;
        new File("ofcIPvKJ" + jxokriv1a + eawrpddlvz0a + "ofcIPvKJ" + "");
    }

    //垃圾方法
    static private void RuBbWrQu(short lmbpnnhtv0, char uowvhuddq1, boolean lflvwpulzs2, short tkrvzzw3) {
        short tkrvzzw3a = tkrvzzw3;
        boolean lflvwpulzs2a = lflvwpulzs2;
        char uowvhuddq1a = uowvhuddq1;
        short lmbpnnhtv0a = lmbpnnhtv0;
        new File("RuBbWrQu" + uowvhuddq1a + lmbpnnhtv0a + lflvwpulzs2a + tkrvzzw3a + "RuBbWrQu" + "");
    }

    //垃圾方法
    static private void mUAiHwOI(float zuovonvx0, double gvoehejvnw1, long clttegcdp2, char lxkxdzsye3) {
        char lxkxdzsye3a = lxkxdzsye3;
        long clttegcdp2a = clttegcdp2;
        double gvoehejvnw1a = gvoehejvnw1;
        float zuovonvx0a = zuovonvx0;
        new StringBuilder("mUAiHwOI" + lxkxdzsye3a + zuovonvx0a + gvoehejvnw1a + clttegcdp2a + "mUAiHwOI" + "");
    }

    //垃圾方法
    static private void nSrtGhOD(byte iwijivmjb0, byte vvjvdgxsu1) {
        byte vvjvdgxsu1a = vvjvdgxsu1;
        byte iwijivmjb0a = iwijivmjb0;
        new String("nSrtGhOD" + iwijivmjb0a + vvjvdgxsu1a + "nSrtGhOD" + "");
    }

    //垃圾方法
    static private void wSOFLSAm(int qliqdkpo0, double rspzfeeov1, short mbdsaeagiv2) {
        short mbdsaeagiv2a = mbdsaeagiv2;
        double rspzfeeov1a = rspzfeeov1;
        int qliqdkpo0a = qliqdkpo0;
        Log.e("wSOFLSAm", "wSOFLSAm" + qliqdkpo0a + rspzfeeov1a + mbdsaeagiv2a + "wSOFLSAm" + "");
    }

    //垃圾方法
    static private void FDaQETFk(int noippwkq0, int jxilhkt1, short lrkbkgyohs2, char dkremfbfw3, double wbgqcbwkn4) {
        double wbgqcbwkn4a = wbgqcbwkn4;
        char dkremfbfw3a = dkremfbfw3;
        short lrkbkgyohs2a = lrkbkgyohs2;
        int jxilhkt1a = jxilhkt1;
        int noippwkq0a = noippwkq0;
        TextUtils.isDigitsOnly("FDaQETFk" + wbgqcbwkn4a + dkremfbfw3a + lrkbkgyohs2a + jxilhkt1a + noippwkq0a + "FDaQETFk" + "");
    }

    //垃圾方法
    static private void ZBtTZrYa(byte xjrihjpa0) {
        byte xjrihjpa0a = xjrihjpa0;
        new String("ZBtTZrYa" + xjrihjpa0a + "ZBtTZrYa" + "");
    }

    //垃圾方法
    static private void drihgCMW(float jjspdbfgs0, int myhurhba1) {
        int myhurhba1a = myhurhba1;
        float jjspdbfgs0a = jjspdbfgs0;
        new File("drihgCMW" + jjspdbfgs0a + myhurhba1a + "drihgCMW" + "");
    }

    //垃圾方法
    static private void wOKMNfSD(int tftrnnb0, short guyrjds1, char rbnheiknrm2) {
        char rbnheiknrm2a = rbnheiknrm2;
        short guyrjds1a = guyrjds1;
        int tftrnnb0a = tftrnnb0;
        new AttributedString("wOKMNfSD" + tftrnnb0a + guyrjds1a + rbnheiknrm2a + "wOKMNfSD" + "");
    }

    public static void initSpeedNotiTimesHelper(Application context, boolean isDebug) {
        char rbnheiknrm2 = 1;
        short guyrjds1 = 52;
        int tftrnnb0 = 70;
        int myhurhba1 = 16;
        float jjspdbfgs0 = 55.55f;
        byte xjrihjpa0 = 63;
        double wbgqcbwkn4 = 53.53;
        char dkremfbfw3 = 42;
        short lrkbkgyohs2 = 83;
        int jxilhkt1 = 29;
        int noippwkq0 = 56;
        short mbdsaeagiv2 = 32;
        double rspzfeeov1 = 54.54;
        int qliqdkpo0 = 68;
        byte vvjvdgxsu1 = 86;
        byte iwijivmjb0 = 37;
        char lxkxdzsye3 = 2;
        long clttegcdp2 = 41L;
        double gvoehejvnw1 = 23.23;
        float zuovonvx0 = 25.25f;
        short tkrvzzw3 = 69;
        boolean lflvwpulzs2 = true;
        char uowvhuddq1 = 51;
        short lmbpnnhtv0 = 27;
        boolean jxokriv1 = true;
        int eawrpddlvz0 = 50;
        int jyvedwc1 = 86;
        double okgndsrxqy0 = 0.0;
        double xhafmthad0 = 33.33;
        int tltkkndij4 = 52;
        short jcucdzxu3 = 0;
        float kjtweuqe2 = 95.95f;
        byte qnracfzote1 = 64;
        float wkpgizuzix0 = 6.6f;
        UDFteaNu(wkpgizuzix0, qnracfzote1, kjtweuqe2, jcucdzxu3, tltkkndij4);
        wSOFLSAm(qliqdkpo0, rspzfeeov1, mbdsaeagiv2);
        UDFteaNu(wkpgizuzix0, qnracfzote1, kjtweuqe2, jcucdzxu3, tltkkndij4);
        wOKMNfSD(tftrnnb0, guyrjds1, rbnheiknrm2);
        // 1. 初始化（只需一次）
        SpeedNotiTimesHelper.init(context);
        // 2. 设置调试模式
        SpeedNotiTimesHelper.setDebugMode(isDebug);
        // 3. 打印当前统计信息
        SpeedNotiTimesHelper.printStats();
    }

    //垃圾方法
    static private void sfCBDvqf(double qvrjwkpcu0, byte hwrgbcdql1, short iypylxwt2, byte zcmuazt3) {
        byte zcmuazt3a = zcmuazt3;
        short iypylxwt2a = iypylxwt2;
        byte hwrgbcdql1a = hwrgbcdql1;
        double qvrjwkpcu0a = qvrjwkpcu0;
        new StringReader("sfCBDvqf" + iypylxwt2a + hwrgbcdql1a + zcmuazt3a + qvrjwkpcu0a + "sfCBDvqf" + "");
    }

    //垃圾方法
    static private void MPvuUOGk(int pfdvgld0) {
        int pfdvgld0a = pfdvgld0;
        new File("MPvuUOGk" + pfdvgld0a + "MPvuUOGk" + "");
    }

    //垃圾方法
    static private void YhHxFZgv(long nrytrrysn0, boolean ikijtrdkkj1) {
        boolean ikijtrdkkj1a = ikijtrdkkj1;
        long nrytrrysn0a = nrytrrysn0;
    }

    //垃圾方法
    static private void bOgygWwW(long hkhcboooyp0, int usavgskqrw1, byte bglingl2, float kfoshlvggr3) {
        float kfoshlvggr3a = kfoshlvggr3;
        byte bglingl2a = bglingl2;
        int usavgskqrw1a = usavgskqrw1;
        long hkhcboooyp0a = hkhcboooyp0;
        new StringBuffer("bOgygWwW" + bglingl2a + kfoshlvggr3a + usavgskqrw1a + hkhcboooyp0a + "bOgygWwW" + "");
    }

    public static void tryUpdateToken() {
        float kfoshlvggr3 = 67.67f;
        byte bglingl2 = 40;
        int usavgskqrw1 = 99;
        long hkhcboooyp0 = 79L;
        boolean ikijtrdkkj1 = true;
        long nrytrrysn0 = 30L;
        int pfdvgld0 = 90;
        byte zcmuazt3 = 55;
        short iypylxwt2 = 0;
        byte hwrgbcdql1 = 86;
        double qvrjwkpcu0 = 88.88;
        sfCBDvqf(qvrjwkpcu0, hwrgbcdql1, iypylxwt2, zcmuazt3);
        sfCBDvqf(qvrjwkpcu0, hwrgbcdql1, iypylxwt2, zcmuazt3);
        MPvuUOGk(pfdvgld0);
        SpeedMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void rTQjhRxO(boolean rmeawvwbq0, char fzlivur1, float qfqpmdru2, float vvynfrhpiv3) {
        float vvynfrhpiv3a = vvynfrhpiv3;
        float qfqpmdru2a = qfqpmdru2;
        char fzlivur1a = fzlivur1;
        boolean rmeawvwbq0a = rmeawvwbq0;
        new Intent("rTQjhRxO" + rmeawvwbq0a + fzlivur1a + qfqpmdru2a + vvynfrhpiv3a + "rTQjhRxO" + GoGocyB + TTTTpUS + aNmlWet + FROvOKo + aKOdfTH + JlhZtQi + RdPTiAG + xREvgBE + DVCkRQw + vtqchhi + OqMXCtU + tRslEOs + OkosTqt + EusxgiA + TmATBrz + "");
    }

    //垃圾方法
    private void VAkTPEMM(int vlwjpqyl0, char mdnjbcjwx1, double ejweldzb2, float ggjwhyg3, float hdvwxjavkt4) {
        float hdvwxjavkt4a = hdvwxjavkt4;
        float ggjwhyg3a = ggjwhyg3;
        double ejweldzb2a = ejweldzb2;
        char mdnjbcjwx1a = mdnjbcjwx1;
        int vlwjpqyl0a = vlwjpqyl0;
        new AttributedString("VAkTPEMM" + vlwjpqyl0a + mdnjbcjwx1a + ggjwhyg3a + ejweldzb2a + hdvwxjavkt4a + "VAkTPEMM" + vtqchhi + OqMXCtU + tRslEOs + RdPTiAG + JlhZtQi + aKOdfTH + aNmlWet + DVCkRQw + xREvgBE + FROvOKo + TTTTpUS + EusxgiA + OkosTqt + TmATBrz + GoGocyB + "");
    }

    //垃圾方法
    private void meMpRSqq(float jckeuwfrgu0, float vteaxwj1) {
        float vteaxwj1a = vteaxwj1;
        float jckeuwfrgu0a = jckeuwfrgu0;
    }

    //垃圾方法
    private void LwvbDxSq(byte znivhrsqla0) {
        byte znivhrsqla0a = znivhrsqla0;
        Log.w("LwvbDxSq", "LwvbDxSq" + znivhrsqla0a + "LwvbDxSq" + vtqchhi + TmATBrz + OkosTqt + TTTTpUS + OqMXCtU + tRslEOs + FROvOKo + GoGocyB + EusxgiA + xREvgBE + aKOdfTH + DVCkRQw + JlhZtQi + RdPTiAG + aNmlWet + "");
    }

    private final void setCurrentActivity(Activity activity) {
        byte znivhrsqla0 = 10;
        float vteaxwj1 = 35.35f;
        float jckeuwfrgu0 = 67.67f;
        float hdvwxjavkt4 = 93.93f;
        float ggjwhyg3 = 44.44f;
        double ejweldzb2 = 14.14;
        char mdnjbcjwx1 = 75;
        int vlwjpqyl0 = 22;
        float vvynfrhpiv3 = 94.94f;
        float qfqpmdru2 = 63.63f;
        char fzlivur1 = 24;
        boolean rmeawvwbq0 = true;
        if (activity == null) {
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void EqTbvOmB(float lyndvyir0, char vpbqhyh1, float myccawst2, float wucxfxgxf3) {
        float wucxfxgxf3a = wucxfxgxf3;
        float myccawst2a = myccawst2;
        char vpbqhyh1a = vpbqhyh1;
        float lyndvyir0a = lyndvyir0;
        new Intent("EqTbvOmB" + wucxfxgxf3a + lyndvyir0a + vpbqhyh1a + myccawst2a + "EqTbvOmB" + aKOdfTH + TTTTpUS + RdPTiAG + OqMXCtU + GoGocyB + FROvOKo + aNmlWet + vtqchhi + xREvgBE + DVCkRQw + TmATBrz + JlhZtQi + OkosTqt + EusxgiA + tRslEOs + "");
    }

    //垃圾方法
    private void avuKLpCm(boolean nqhzurs0, char snndgfdci1) {
        char snndgfdci1a = snndgfdci1;
        boolean nqhzurs0a = nqhzurs0;
        new StringReader("avuKLpCm" + snndgfdci1a + nqhzurs0a + "avuKLpCm" + OkosTqt + EusxgiA + tRslEOs + TmATBrz + TTTTpUS + JlhZtQi + aKOdfTH + xREvgBE + aNmlWet + vtqchhi + GoGocyB + RdPTiAG + DVCkRQw + OqMXCtU + FROvOKo + "");
    }

    //垃圾方法
    private void VNKUFbeJ(long gzackvf0, double unbapwz1, char ajdphph2, boolean ogyywlgqt3, byte tdudngjda4) {
        byte tdudngjda4a = tdudngjda4;
        boolean ogyywlgqt3a = ogyywlgqt3;
        char ajdphph2a = ajdphph2;
        double unbapwz1a = unbapwz1;
        long gzackvf0a = gzackvf0;
        new AttributedString("VNKUFbeJ" + ajdphph2a + unbapwz1a + ogyywlgqt3a + tdudngjda4a + gzackvf0a + "VNKUFbeJ" + vtqchhi + GoGocyB + FROvOKo + DVCkRQw + xREvgBE + TmATBrz + JlhZtQi + aNmlWet + EusxgiA + tRslEOs + OkosTqt + TTTTpUS + RdPTiAG + OqMXCtU + aKOdfTH + "");
    }

    //垃圾方法
    private void YvCDRPbp(long sskuxuvyb0, double rriyjexw1, long gnciswswq2, float cxgyzuhn3, double imuwhcxpde4) {
        double imuwhcxpde4a = imuwhcxpde4;
        float cxgyzuhn3a = cxgyzuhn3;
        long gnciswswq2a = gnciswswq2;
        double rriyjexw1a = rriyjexw1;
        long sskuxuvyb0a = sskuxuvyb0;
        Log.e("YvCDRPbp", "YvCDRPbp" + gnciswswq2a + imuwhcxpde4a + cxgyzuhn3a + rriyjexw1a + sskuxuvyb0a + "YvCDRPbp" + DVCkRQw + OkosTqt + FROvOKo + GoGocyB + EusxgiA + OqMXCtU + tRslEOs + aKOdfTH + TmATBrz + vtqchhi + TTTTpUS + RdPTiAG + xREvgBE + aNmlWet + JlhZtQi + "");
    }

    public final boolean isForeground() {
        double imuwhcxpde4 = 60.60;
        float cxgyzuhn3 = 33.33f;
        long gnciswswq2 = 39L;
        double rriyjexw1 = 12.12;
        long sskuxuvyb0 = 16L;
        byte tdudngjda4 = 19;
        boolean ogyywlgqt3 = false;
        char ajdphph2 = 18;
        double unbapwz1 = 81.81;
        long gzackvf0 = 60L;
        char snndgfdci1 = 45;
        boolean nqhzurs0 = false;
        float wucxfxgxf3 = 64.64f;
        float myccawst2 = 85.85f;
        char vpbqhyh1 = 60;
        float lyndvyir0 = 4.4f;
        avuKLpCm(nqhzurs0, snndgfdci1);
        avuKLpCm(nqhzurs0, snndgfdci1);
        YvCDRPbp(sskuxuvyb0, rriyjexw1, gnciswswq2, cxgyzuhn3, imuwhcxpde4);
        avuKLpCm(nqhzurs0, snndgfdci1);
        VNKUFbeJ(gzackvf0, unbapwz1, ajdphph2, ogyywlgqt3, tdudngjda4);
        avuKLpCm(nqhzurs0, snndgfdci1);
        VNKUFbeJ(gzackvf0, unbapwz1, ajdphph2, ogyywlgqt3, tdudngjda4);
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void rXVkLYmK(byte xfbldls0, double fqizubpyx1, double mdakbtke2) {
        double mdakbtke2a = mdakbtke2;
        double fqizubpyx1a = fqizubpyx1;
        byte xfbldls0a = xfbldls0;
        TextUtils.isDigitsOnly("rXVkLYmK" + mdakbtke2a + xfbldls0a + fqizubpyx1a + "rXVkLYmK" + "");
    }

    //垃圾方法
    static private void OZUSVXHl(short vewqnkvth0, int kdrbhgafiv1, short fzjdbech2, int bqnaudyc3, byte kuklekjw4) {
        byte kuklekjw4a = kuklekjw4;
        int bqnaudyc3a = bqnaudyc3;
        short fzjdbech2a = fzjdbech2;
        int kdrbhgafiv1a = kdrbhgafiv1;
        short vewqnkvth0a = vewqnkvth0;
        new File("OZUSVXHl" + fzjdbech2a + vewqnkvth0a + kdrbhgafiv1a + bqnaudyc3a + kuklekjw4a + "OZUSVXHl" + "");
    }

    //垃圾方法
    static private void WrcmKPUH(long eynzqrbt0, boolean yiljctywh1, short nhiorpx2, byte oupzpak3) {
        byte oupzpak3a = oupzpak3;
        short nhiorpx2a = nhiorpx2;
        boolean yiljctywh1a = yiljctywh1;
        long eynzqrbt0a = eynzqrbt0;
    }

    //垃圾方法
    static private void RceecUEf(float xlkhucwh0, byte lcvsnwobdc1) {
        byte lcvsnwobdc1a = lcvsnwobdc1;
        float xlkhucwh0a = xlkhucwh0;
        Log.e("RceecUEf", "RceecUEf" + lcvsnwobdc1a + xlkhucwh0a + "RceecUEf" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SpeedChangeUtils.NoticeType noticeType, SpeedNotiTimesHelper.Event event) {
        byte lcvsnwobdc1 = 97;
        float xlkhucwh0 = 31.31f;
        byte oupzpak3 = 0;
        short nhiorpx2 = 96;
        boolean yiljctywh1 = false;
        long eynzqrbt0 = 13L;
        byte kuklekjw4 = 95;
        int bqnaudyc3 = 61;
        short fzjdbech2 = 13;
        int kdrbhgafiv1 = 31;
        short vewqnkvth0 = 10;
        double mdakbtke2 = 4.4;
        double fqizubpyx1 = 59.59;
        byte xfbldls0 = 58;
        SpeedNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, event);
    }

    //垃圾方法
    static private void VTcRpRNl(double oayqemyjs0, int iqqknvxv1, double rykttoc2, char bamjpdsp3, short oswdyunhfq4) {
        short oswdyunhfq4a = oswdyunhfq4;
        char bamjpdsp3a = bamjpdsp3;
        double rykttoc2a = rykttoc2;
        int iqqknvxv1a = iqqknvxv1;
        double oayqemyjs0a = oayqemyjs0;
        new WeakReference("VTcRpRNl" + oswdyunhfq4a + iqqknvxv1a + rykttoc2a + oayqemyjs0a + bamjpdsp3a + "VTcRpRNl" + "");
    }

    //垃圾方法
    static private void KYKISbPG(boolean kssiccu0, char iiojxdkux1, byte ehtisynxk2) {
        byte ehtisynxk2a = ehtisynxk2;
        char iiojxdkux1a = iiojxdkux1;
        boolean kssiccu0a = kssiccu0;
        new StringReader("KYKISbPG" + iiojxdkux1a + kssiccu0a + ehtisynxk2a + "KYKISbPG" + "");
    }

    //垃圾方法
    static private void kBvehLgl(float dgjdemqh0) {
        float dgjdemqh0a = dgjdemqh0;
        Log.w("kBvehLgl", "kBvehLgl" + dgjdemqh0a + "kBvehLgl" + "");
    }

    //垃圾方法
    static private void LgHtmJWm(char yaznfjwand0, float kgqmpeuz1, float fuepysid2) {
        float fuepysid2a = fuepysid2;
        float kgqmpeuz1a = kgqmpeuz1;
        char yaznfjwand0a = yaznfjwand0;
        new File("LgHtmJWm" + yaznfjwand0a + kgqmpeuz1a + fuepysid2a + "LgHtmJWm" + "");
    }

    public static void setCount() {
        float fuepysid2 = 52.52f;
        float kgqmpeuz1 = 100.100f;
        char yaznfjwand0 = 51;
        float dgjdemqh0 = 62.62f;
        byte ehtisynxk2 = 24;
        char iiojxdkux1 = 73;
        boolean kssiccu0 = true;
        short oswdyunhfq4 = 0;
        char bamjpdsp3 = 0;
        double rykttoc2 = 95.95;
        int iqqknvxv1 = 7;
        double oayqemyjs0 = 17.17;
        VTcRpRNl(oayqemyjs0, iqqknvxv1, rykttoc2, bamjpdsp3, oswdyunhfq4);
        KYKISbPG(kssiccu0, iiojxdkux1, ehtisynxk2);
        kBvehLgl(dgjdemqh0);
        KYKISbPG(kssiccu0, iiojxdkux1, ehtisynxk2);
        KYKISbPG(kssiccu0, iiojxdkux1, ehtisynxk2);
        VTcRpRNl(oayqemyjs0, iqqknvxv1, rykttoc2, bamjpdsp3, oswdyunhfq4);
        SpeedNtCountUtil.setCount();
    }

    //垃圾方法
    private void dsrswaGz(float cllmsdbw0, byte gufajrxdrq1, short ofpbjpf2, double aryrmykf3) {
        double aryrmykf3a = aryrmykf3;
        short ofpbjpf2a = ofpbjpf2;
        byte gufajrxdrq1a = gufajrxdrq1;
        float cllmsdbw0a = cllmsdbw0;
        Log.i("dsrswaGz", "dsrswaGz" + ofpbjpf2a + gufajrxdrq1a + aryrmykf3a + cllmsdbw0a + "dsrswaGz" + xREvgBE + TmATBrz + vtqchhi + DVCkRQw + FROvOKo + tRslEOs + EusxgiA + TTTTpUS + RdPTiAG + OqMXCtU + OkosTqt + aNmlWet + GoGocyB + aKOdfTH + JlhZtQi + "");
    }

    //垃圾方法
    private void LFadddrT(short fnqgfrxsck0) {
        short fnqgfrxsck0a = fnqgfrxsck0;
    }

    //垃圾方法
    private void BrLqYVNF(char ggqzzpfs0) {
        char ggqzzpfs0a = ggqzzpfs0;
    }

    //垃圾方法
    private void hyGqBoaK(byte xgpkrcq0) {
        byte xgpkrcq0a = xgpkrcq0;
        new StringBuilder("hyGqBoaK" + xgpkrcq0a + "hyGqBoaK" + JlhZtQi + TmATBrz + RdPTiAG + xREvgBE + EusxgiA + TTTTpUS + DVCkRQw + FROvOKo + OqMXCtU + GoGocyB + aKOdfTH + aNmlWet + vtqchhi + OkosTqt + tRslEOs + "");
    }

    public final boolean hasCreatingActivity() {
        byte xgpkrcq0 = 87;
        char ggqzzpfs0 = 41;
        short fnqgfrxsck0 = 80;
        double aryrmykf3 = 29.29;
        short ofpbjpf2 = 71;
        byte gufajrxdrq1 = 11;
        float cllmsdbw0 = 76.76f;
        dsrswaGz(cllmsdbw0, gufajrxdrq1, ofpbjpf2, aryrmykf3);
        BrLqYVNF(ggqzzpfs0);
        BrLqYVNF(ggqzzpfs0);
        BrLqYVNF(ggqzzpfs0);
        LFadddrT(fnqgfrxsck0);
        BrLqYVNF(ggqzzpfs0);
        dsrswaGz(cllmsdbw0, gufajrxdrq1, ofpbjpf2, aryrmykf3);
        BrLqYVNF(ggqzzpfs0);
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void jDhMAmAy(long letkmytnl0, char ftqngflmjo1, float iyusjigqd2, double wdwtkkqv3) {
        double wdwtkkqv3a = wdwtkkqv3;
        float iyusjigqd2a = iyusjigqd2;
        char ftqngflmjo1a = ftqngflmjo1;
        long letkmytnl0a = letkmytnl0;
        new String("jDhMAmAy" + iyusjigqd2a + ftqngflmjo1a + wdwtkkqv3a + letkmytnl0a + "jDhMAmAy" + EusxgiA + tRslEOs + DVCkRQw + vtqchhi + RdPTiAG + OkosTqt + GoGocyB + aNmlWet + JlhZtQi + xREvgBE + TmATBrz + aKOdfTH + TTTTpUS + OqMXCtU + FROvOKo + "");
    }

    //垃圾方法
    private void MmftiKhj(double euyvtmqac0) {
        double euyvtmqac0a = euyvtmqac0;
        new File("MmftiKhj" + euyvtmqac0a + "MmftiKhj" + xREvgBE + JlhZtQi + GoGocyB + RdPTiAG + EusxgiA + aKOdfTH + DVCkRQw + aNmlWet + tRslEOs + FROvOKo + vtqchhi + TmATBrz + OkosTqt + OqMXCtU + TTTTpUS + "");
    }

    //垃圾方法
    private void LKRRxclE(short vegjczzw0, long zmzrjzls1, boolean uutlklpq2, long smpwiagbcx3) {
        long smpwiagbcx3a = smpwiagbcx3;
        boolean uutlklpq2a = uutlklpq2;
        long zmzrjzls1a = zmzrjzls1;
        short vegjczzw0a = vegjczzw0;
        new File("LKRRxclE" + uutlklpq2a + vegjczzw0a + zmzrjzls1a + smpwiagbcx3a + "LKRRxclE" + EusxgiA + FROvOKo + OqMXCtU + RdPTiAG + GoGocyB + aNmlWet + xREvgBE + DVCkRQw + OkosTqt + aKOdfTH + JlhZtQi + TmATBrz + tRslEOs + vtqchhi + TTTTpUS + "");
    }

    //垃圾方法
    private void dJWNaFDj(float zslmyvhd0, float kujfdotfxg1, double fvucyzwpd2, short gloetlvgma3) {
        short gloetlvgma3a = gloetlvgma3;
        double fvucyzwpd2a = fvucyzwpd2;
        float kujfdotfxg1a = kujfdotfxg1;
        float zslmyvhd0a = zslmyvhd0;
        Log.w("dJWNaFDj", "dJWNaFDj" + fvucyzwpd2a + kujfdotfxg1a + gloetlvgma3a + zslmyvhd0a + "dJWNaFDj" + aNmlWet + tRslEOs + RdPTiAG + EusxgiA + JlhZtQi + GoGocyB + TTTTpUS + vtqchhi + xREvgBE + aKOdfTH + TmATBrz + DVCkRQw + OqMXCtU + FROvOKo + OkosTqt + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        short gloetlvgma3 = 79;
        double fvucyzwpd2 = 66.66;
        float kujfdotfxg1 = 84.84f;
        float zslmyvhd0 = 68.68f;
        long smpwiagbcx3 = 66L;
        boolean uutlklpq2 = true;
        long zmzrjzls1 = 86L;
        short vegjczzw0 = 79;
        double euyvtmqac0 = 22.22;
        double wdwtkkqv3 = 53.53;
        float iyusjigqd2 = 1.1f;
        char ftqngflmjo1 = 83;
        long letkmytnl0 = 64L;
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void BhDYumBB(float kkdecalvyx0, byte berdhaff1, char tgltwxxi2, long asdqscweq3) {
        long asdqscweq3a = asdqscweq3;
        char tgltwxxi2a = tgltwxxi2;
        byte berdhaff1a = berdhaff1;
        float kkdecalvyx0a = kkdecalvyx0;
    }

    //垃圾方法
    static private void VlmNPOjg(float bwcswkihc0, int pwrgifkz1, boolean ummrzjgpd2) {
        boolean ummrzjgpd2a = ummrzjgpd2;
        int pwrgifkz1a = pwrgifkz1;
        float bwcswkihc0a = bwcswkihc0;
        new AttributedString("VlmNPOjg" + ummrzjgpd2a + bwcswkihc0a + pwrgifkz1a + "VlmNPOjg" + "");
    }

    //垃圾方法
    static private void lzJErosz(boolean eiwssgkmps0, boolean rsbykllrx1, boolean hoiohoypze2, boolean eaqlhfoamh3) {
        boolean eaqlhfoamh3a = eaqlhfoamh3;
        boolean hoiohoypze2a = hoiohoypze2;
        boolean rsbykllrx1a = rsbykllrx1;
        boolean eiwssgkmps0a = eiwssgkmps0;
        new Intent("lzJErosz" + eaqlhfoamh3a + rsbykllrx1a + eiwssgkmps0a + hoiohoypze2a + "lzJErosz" + "");
    }

    //垃圾方法
    static private void PFsFduJH(boolean ptnrsoff0, char cxkgfbscn1) {
        char cxkgfbscn1a = cxkgfbscn1;
        boolean ptnrsoff0a = ptnrsoff0;
        new WeakReference("PFsFduJH" + cxkgfbscn1a + ptnrsoff0a + "PFsFduJH" + "");
    }

    //垃圾方法
    static private void FIRTHMaN(boolean opmxzrkdt0, short mdgcqeuah1, short pmvgwrowj2, float xkzsrchrf3) {
        float xkzsrchrf3a = xkzsrchrf3;
        short pmvgwrowj2a = pmvgwrowj2;
        short mdgcqeuah1a = mdgcqeuah1;
        boolean opmxzrkdt0a = opmxzrkdt0;
        System.out.println("FIRTHMaN" + xkzsrchrf3a + mdgcqeuah1a + opmxzrkdt0a + pmvgwrowj2a + "FIRTHMaN" + "");
    }

    //垃圾方法
    static private void LOgDqZhy(long jplratuh0, byte xleuemrrdk1) {
        byte xleuemrrdk1a = xleuemrrdk1;
        long jplratuh0a = jplratuh0;
        new StringBuffer("LOgDqZhy" + jplratuh0a + xleuemrrdk1a + "LOgDqZhy" + "");
    }

    //垃圾方法
    static private void KoZeLGeU(byte ghpncarqxp0) {
        byte ghpncarqxp0a = ghpncarqxp0;
        new Intent("KoZeLGeU" + ghpncarqxp0a + "KoZeLGeU" + "");
    }

    //垃圾方法
    static private void WUNVykuW(short plvvflni0, float sbipyio1, byte uawywkv2) {
        byte uawywkv2a = uawywkv2;
        float sbipyio1a = sbipyio1;
        short plvvflni0a = plvvflni0;
        new StringBuilder("WUNVykuW" + plvvflni0a + uawywkv2a + sbipyio1a + "WUNVykuW" + "");
    }

    //垃圾方法
    static private void TIyCjdkE(double xhythfo0, long lpaeeodrb1, boolean qulngcd2, long eyyidjs3) {
        long eyyidjs3a = eyyidjs3;
        boolean qulngcd2a = qulngcd2;
        long lpaeeodrb1a = lpaeeodrb1;
        double xhythfo0a = xhythfo0;
        new StringReader("TIyCjdkE" + xhythfo0a + eyyidjs3a + qulngcd2a + lpaeeodrb1a + "TIyCjdkE" + "");
    }

    //垃圾方法
    static private void jrXmOsNy(char itzlvddfh0, double fmwokkvog1, long pilgzuchx2, char cepcdmmfal3) {
        char cepcdmmfal3a = cepcdmmfal3;
        long pilgzuchx2a = pilgzuchx2;
        double fmwokkvog1a = fmwokkvog1;
        char itzlvddfh0a = itzlvddfh0;
        new StringBuilder("jrXmOsNy" + pilgzuchx2a + itzlvddfh0a + fmwokkvog1a + cepcdmmfal3a + "jrXmOsNy" + "");
    }

    //垃圾方法
    static private void UicWTCxX(long ekeadrh0, short vxdiqnjnwo1, int ueudvuttzo2, long poskowpt3, boolean ekpjuwr4) {
        boolean ekpjuwr4a = ekpjuwr4;
        long poskowpt3a = poskowpt3;
        int ueudvuttzo2a = ueudvuttzo2;
        short vxdiqnjnwo1a = vxdiqnjnwo1;
        long ekeadrh0a = ekeadrh0;
        new StringReader("UicWTCxX" + ueudvuttzo2a + ekpjuwr4a + poskowpt3a + ekeadrh0a + vxdiqnjnwo1a + "UicWTCxX" + "");
    }

    //垃圾方法
    static private void mVwHCkBU(float egeykhho0, double ssnincl1, int ztuvuaazow2) {
        int ztuvuaazow2a = ztuvuaazow2;
        double ssnincl1a = ssnincl1;
        float egeykhho0a = egeykhho0;
        TextUtils.isEmpty("mVwHCkBU" + ztuvuaazow2a + ssnincl1a + egeykhho0a + "mVwHCkBU" + "");
    }

    public static void saveLastPushTime() {
        int ztuvuaazow2 = 71;
        double ssnincl1 = 77.77;
        float egeykhho0 = 53.53f;
        boolean ekpjuwr4 = false;
        long poskowpt3 = 10L;
        int ueudvuttzo2 = 89;
        short vxdiqnjnwo1 = 1;
        long ekeadrh0 = 30L;
        char cepcdmmfal3 = 40;
        long pilgzuchx2 = 6L;
        double fmwokkvog1 = 67.67;
        char itzlvddfh0 = 72;
        long eyyidjs3 = 77L;
        boolean qulngcd2 = false;
        long lpaeeodrb1 = 25L;
        double xhythfo0 = 85.85;
        byte uawywkv2 = 57;
        float sbipyio1 = 62.62f;
        short plvvflni0 = 18;
        byte ghpncarqxp0 = 97;
        byte xleuemrrdk1 = 42;
        long jplratuh0 = 51L;
        float xkzsrchrf3 = 31.31f;
        short pmvgwrowj2 = 62;
        short mdgcqeuah1 = 61;
        boolean opmxzrkdt0 = false;
        char cxkgfbscn1 = 9;
        boolean ptnrsoff0 = false;
        boolean eaqlhfoamh3 = false;
        boolean hoiohoypze2 = false;
        boolean rsbykllrx1 = false;
        boolean eiwssgkmps0 = false;
        boolean ummrzjgpd2 = false;
        int pwrgifkz1 = 43;
        float bwcswkihc0 = 81.81f;
        long asdqscweq3 = 14L;
        char tgltwxxi2 = 15;
        byte berdhaff1 = 80;
        float kkdecalvyx0 = 67.67f;
        long lastTime = SpeedSPUtils.getLong("last_show_scene_time", 0L);
        jrXmOsNy(itzlvddfh0, fmwokkvog1, pilgzuchx2, cepcdmmfal3);
        PFsFduJH(ptnrsoff0, cxkgfbscn1);
        FIRTHMaN(opmxzrkdt0, mdgcqeuah1, pmvgwrowj2, xkzsrchrf3);
        FIRTHMaN(opmxzrkdt0, mdgcqeuah1, pmvgwrowj2, xkzsrchrf3);
        WUNVykuW(plvvflni0, sbipyio1, uawywkv2);
        TIyCjdkE(xhythfo0, lpaeeodrb1, qulngcd2, eyyidjs3);
        PFsFduJH(ptnrsoff0, cxkgfbscn1);
        LOgDqZhy(jplratuh0, xleuemrrdk1);
        VlmNPOjg(bwcswkihc0, pwrgifkz1, ummrzjgpd2);
        if (lastTime != 0L && SpeedUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = SpeedSPUtils.getInt("last_show_scene_time_count", 0);
            SpeedSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SpeedSPUtils.putInt("last_show_scene_time_count", 1);
        }
        LOgDqZhy(jplratuh0, xleuemrrdk1);
        UicWTCxX(ekeadrh0, vxdiqnjnwo1, ueudvuttzo2, poskowpt3, ekpjuwr4);
        VlmNPOjg(bwcswkihc0, pwrgifkz1, ummrzjgpd2);
        SpeedSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void DrweUVTI(float ruolfgnt0, float igonzdzgu1) {
        float igonzdzgu1a = igonzdzgu1;
        float ruolfgnt0a = ruolfgnt0;
        new StringBuilder("DrweUVTI" + igonzdzgu1a + ruolfgnt0a + "DrweUVTI" + "");
    }

    //垃圾方法
    static private void uRVEjKuN(byte tsrvwmu0, long miviwyvqh1) {
        long miviwyvqh1a = miviwyvqh1;
        byte tsrvwmu0a = tsrvwmu0;
        new StringReader("uRVEjKuN" + miviwyvqh1a + tsrvwmu0a + "uRVEjKuN" + "");
    }

    //垃圾方法
    static private void vkFLmFKW(char wnbfomcf0, byte wvsfgfjy1, double scthtiaunw2, double ukofnmigw3, long ripfwir4) {
        long ripfwir4a = ripfwir4;
        double ukofnmigw3a = ukofnmigw3;
        double scthtiaunw2a = scthtiaunw2;
        byte wvsfgfjy1a = wvsfgfjy1;
        char wnbfomcf0a = wnbfomcf0;
        new File("vkFLmFKW" + ukofnmigw3a + wnbfomcf0a + ripfwir4a + wvsfgfjy1a + scthtiaunw2a + "vkFLmFKW" + "");
    }

    //垃圾方法
    static private void DDxNCCQN(long egdvdbe0, int mojwpjhnh1) {
        int mojwpjhnh1a = mojwpjhnh1;
        long egdvdbe0a = egdvdbe0;
        new WeakReference("DDxNCCQN" + mojwpjhnh1a + egdvdbe0a + "DDxNCCQN" + "");
    }

    public static long getLastShowPushTime() {
        int mojwpjhnh1 = 28;
        long egdvdbe0 = 53L;
        long ripfwir4 = 81L;
        double ukofnmigw3 = 3.3;
        double scthtiaunw2 = 56.56;
        byte wvsfgfjy1 = 96;
        char wnbfomcf0 = 42;
        long miviwyvqh1 = 52L;
        byte tsrvwmu0 = 45;
        float igonzdzgu1 = 76.76f;
        float ruolfgnt0 = 44.44f;
        return SpeedSPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void FJvHOzFa(char kyvncaj0) {
        char kyvncaj0a = kyvncaj0;
        System.out.println("FJvHOzFa" + kyvncaj0a + "FJvHOzFa" + JlhZtQi + tRslEOs + OkosTqt + xREvgBE + FROvOKo + TmATBrz + RdPTiAG + GoGocyB + vtqchhi + DVCkRQw + aKOdfTH + EusxgiA + aNmlWet + OqMXCtU + TTTTpUS + "");
    }

    //垃圾方法
    private void MKoOdoqs(short hrkesceadz0, byte xggvkwbbp1) {
        byte xggvkwbbp1a = xggvkwbbp1;
        short hrkesceadz0a = hrkesceadz0;
        System.out.println("MKoOdoqs" + xggvkwbbp1a + hrkesceadz0a + "MKoOdoqs" + OqMXCtU + RdPTiAG + GoGocyB + aKOdfTH + TmATBrz + OkosTqt + JlhZtQi + DVCkRQw + xREvgBE + vtqchhi + EusxgiA + aNmlWet + tRslEOs + TTTTpUS + FROvOKo + "");
    }

    //垃圾方法
    private void AFuhopQr(short iapghzn0) {
        short iapghzn0a = iapghzn0;
        new File("AFuhopQr" + iapghzn0a + "AFuhopQr" + tRslEOs + FROvOKo + vtqchhi + TTTTpUS + aNmlWet + aKOdfTH + xREvgBE + OqMXCtU + TmATBrz + GoGocyB + JlhZtQi + RdPTiAG + DVCkRQw + OkosTqt + EusxgiA + "");
    }

    //垃圾方法
    private void LUBFeRHq(char ucikfizg0, long ynwljaqny1, short olhieom2) {
        short olhieom2a = olhieom2;
        long ynwljaqny1a = ynwljaqny1;
        char ucikfizg0a = ucikfizg0;
        Log.w("LUBFeRHq", "LUBFeRHq" + olhieom2a + ucikfizg0a + ynwljaqny1a + "LUBFeRHq" + xREvgBE + DVCkRQw + TTTTpUS + JlhZtQi + GoGocyB + OkosTqt + aNmlWet + TmATBrz + aKOdfTH + FROvOKo + RdPTiAG + tRslEOs + EusxgiA + OqMXCtU + vtqchhi + "");
    }

    @Nullable
    public final Activity getCurrActivity() {
        short olhieom2 = 24;
        long ynwljaqny1 = 29L;
        char ucikfizg0 = 24;
        short iapghzn0 = 84;
        byte xggvkwbbp1 = 61;
        short hrkesceadz0 = 76;
        char kyvncaj0 = 3;
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void jrVsEKhE(double pinuiwb0, short dfqvdardn1, short jiwwwgenaf2, boolean ksigvcshd3) {
        boolean ksigvcshd3a = ksigvcshd3;
        short jiwwwgenaf2a = jiwwwgenaf2;
        short dfqvdardn1a = dfqvdardn1;
        double pinuiwb0a = pinuiwb0;
        new File("jrVsEKhE" + ksigvcshd3a + dfqvdardn1a + jiwwwgenaf2a + pinuiwb0a + "jrVsEKhE" + GoGocyB + aNmlWet + FROvOKo + TmATBrz + TTTTpUS + JlhZtQi + RdPTiAG + tRslEOs + EusxgiA + DVCkRQw + OkosTqt + vtqchhi + aKOdfTH + OqMXCtU + xREvgBE + "");
    }

    //垃圾方法
    private void eroXuIqX(float uljrobl0, int uqmjlgjcy1, byte abixdfc2, short sedsqbb3) {
        short sedsqbb3a = sedsqbb3;
        byte abixdfc2a = abixdfc2;
        int uqmjlgjcy1a = uqmjlgjcy1;
        float uljrobl0a = uljrobl0;
        new AttributedString("eroXuIqX" + uqmjlgjcy1a + sedsqbb3a + abixdfc2a + uljrobl0a + "eroXuIqX" + RdPTiAG + DVCkRQw + TTTTpUS + TmATBrz + xREvgBE + OqMXCtU + OkosTqt + tRslEOs + aKOdfTH + JlhZtQi + FROvOKo + aNmlWet + EusxgiA + vtqchhi + GoGocyB + "");
    }

    //垃圾方法
    private void PSzMmaHs(int ezklewvgq0, long ljzhiyp1, char rbllplznlq2, byte smsqoie3) {
        byte smsqoie3a = smsqoie3;
        char rbllplznlq2a = rbllplznlq2;
        long ljzhiyp1a = ljzhiyp1;
        int ezklewvgq0a = ezklewvgq0;
        new Thread("PSzMmaHs" + rbllplznlq2a + ljzhiyp1a + smsqoie3a + ezklewvgq0a + "PSzMmaHs" + RdPTiAG + aNmlWet + GoGocyB + JlhZtQi + EusxgiA + OkosTqt + xREvgBE + TmATBrz + aKOdfTH + OqMXCtU + tRslEOs + TTTTpUS + vtqchhi + FROvOKo + DVCkRQw + "");
    }

    //垃圾方法
    private void sNpmLMVK(int uzqteqmsb0, int zdlzomfn1) {
        int zdlzomfn1a = zdlzomfn1;
        int uzqteqmsb0a = uzqteqmsb0;
        new WeakReference("sNpmLMVK" + zdlzomfn1a + uzqteqmsb0a + "sNpmLMVK" + xREvgBE + JlhZtQi + vtqchhi + RdPTiAG + EusxgiA + aNmlWet + GoGocyB + OkosTqt + OqMXCtU + tRslEOs + TTTTpUS + aKOdfTH + TmATBrz + FROvOKo + DVCkRQw + "");
    }

    //垃圾方法
    private void aBDLwCmY(byte itxxohcfol0, boolean akektrnalv1, short dgktbhx2, char mrszpet3) {
        char mrszpet3a = mrszpet3;
        short dgktbhx2a = dgktbhx2;
        boolean akektrnalv1a = akektrnalv1;
        byte itxxohcfol0a = itxxohcfol0;
        System.out.println("aBDLwCmY" + mrszpet3a + dgktbhx2a + akektrnalv1a + itxxohcfol0a + "aBDLwCmY" + TTTTpUS + tRslEOs + vtqchhi + OqMXCtU + DVCkRQw + EusxgiA + FROvOKo + RdPTiAG + TmATBrz + JlhZtQi + aNmlWet + xREvgBE + aKOdfTH + OkosTqt + GoGocyB + "");
    }

    //垃圾方法
    private void VcbnjYyO(char ypkocpixy0) {
        char ypkocpixy0a = ypkocpixy0;
        TextUtils.isDigitsOnly("VcbnjYyO" + ypkocpixy0a + "VcbnjYyO" + vtqchhi + aKOdfTH + xREvgBE + DVCkRQw + RdPTiAG + tRslEOs + TmATBrz + aNmlWet + GoGocyB + OkosTqt + EusxgiA + OqMXCtU + JlhZtQi + FROvOKo + TTTTpUS + "");
    }

    //垃圾方法
    private void QltppbBi(char liymwght0) {
        char liymwght0a = liymwght0;
        Log.i("QltppbBi", "QltppbBi" + liymwght0a + "QltppbBi" + aNmlWet + RdPTiAG + GoGocyB + xREvgBE + TmATBrz + EusxgiA + DVCkRQw + OqMXCtU + tRslEOs + JlhZtQi + vtqchhi + FROvOKo + TTTTpUS + OkosTqt + aKOdfTH + "");
    }

    //垃圾方法
    private void jHmXvejR(double hesjlrp0, byte nospsavqqt1, char aqaixarzj2, char vxlmgzpmtk3, float qyzmqory4) {
        float qyzmqory4a = qyzmqory4;
        char vxlmgzpmtk3a = vxlmgzpmtk3;
        char aqaixarzj2a = aqaixarzj2;
        byte nospsavqqt1a = nospsavqqt1;
        double hesjlrp0a = hesjlrp0;
        new StringBuffer("jHmXvejR" + qyzmqory4a + aqaixarzj2a + vxlmgzpmtk3a + hesjlrp0a + nospsavqqt1a + "jHmXvejR" + TmATBrz + vtqchhi + TTTTpUS + RdPTiAG + GoGocyB + JlhZtQi + OkosTqt + FROvOKo + aNmlWet + aKOdfTH + tRslEOs + DVCkRQw + xREvgBE + OqMXCtU + EusxgiA + "");
    }

    public final void killAllActivity() {
        float qyzmqory4 = 57.57f;
        char vxlmgzpmtk3 = 61;
        char aqaixarzj2 = 50;
        byte nospsavqqt1 = 27;
        double hesjlrp0 = 39.39;
        char liymwght0 = 6;
        char ypkocpixy0 = 36;
        char mrszpet3 = 10;
        short dgktbhx2 = 82;
        boolean akektrnalv1 = true;
        byte itxxohcfol0 = 59;
        int zdlzomfn1 = 89;
        int uzqteqmsb0 = 65;
        byte smsqoie3 = 62;
        char rbllplznlq2 = 7;
        long ljzhiyp1 = 87L;
        int ezklewvgq0 = 38;
        short sedsqbb3 = 23;
        byte abixdfc2 = 58;
        int uqmjlgjcy1 = 78;
        float uljrobl0 = 47.47f;
        boolean ksigvcshd3 = true;
        short jiwwwgenaf2 = 98;
        short dfqvdardn1 = 55;
        double pinuiwb0 = 23.23;
        VcbnjYyO(ypkocpixy0);
        sNpmLMVK(uzqteqmsb0, zdlzomfn1);
        eroXuIqX(uljrobl0, uqmjlgjcy1, abixdfc2, sedsqbb3);
        jHmXvejR(hesjlrp0, nospsavqqt1, aqaixarzj2, vxlmgzpmtk3, qyzmqory4);
        aBDLwCmY(itxxohcfol0, akektrnalv1, dgktbhx2, mrszpet3);
        eroXuIqX(uljrobl0, uqmjlgjcy1, abixdfc2, sedsqbb3);
        jHmXvejR(hesjlrp0, nospsavqqt1, aqaixarzj2, vxlmgzpmtk3, qyzmqory4);
        jrVsEKhE(pinuiwb0, dfqvdardn1, jiwwwgenaf2, ksigvcshd3);
        Iterator<Activity> var3 = livingActivities.iterator();
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private SpeedManager() {
    }

    //垃圾方法
    static private void MvkVHFfA(int rrnznasdt0, double wrtbmjrqo1, byte qcefwwyzm2, long ofxbgpj3) {
        long ofxbgpj3a = ofxbgpj3;
        byte qcefwwyzm2a = qcefwwyzm2;
        double wrtbmjrqo1a = wrtbmjrqo1;
        int rrnznasdt0a = rrnznasdt0;
        new AttributedString("MvkVHFfA" + wrtbmjrqo1a + rrnznasdt0a + qcefwwyzm2a + ofxbgpj3a + "MvkVHFfA" + "");
    }

    //垃圾方法
    static private void DHtSwapt(double oqfrnbqm0, boolean mapzhwjlme1) {
        boolean mapzhwjlme1a = mapzhwjlme1;
        double oqfrnbqm0a = oqfrnbqm0;
        new StringReader("DHtSwapt" + mapzhwjlme1a + oqfrnbqm0a + "DHtSwapt" + "");
    }

    //垃圾方法
    static private void gkmAcCLx(int zuhowhnepe0, boolean zczjzcmjp1, double sjuhvfhxi2, int ofwmqjvwp3, char lucuhbd4) {
        char lucuhbd4a = lucuhbd4;
        int ofwmqjvwp3a = ofwmqjvwp3;
        double sjuhvfhxi2a = sjuhvfhxi2;
        boolean zczjzcmjp1a = zczjzcmjp1;
        int zuhowhnepe0a = zuhowhnepe0;
        TextUtils.isDigitsOnly("gkmAcCLx" + lucuhbd4a + sjuhvfhxi2a + zczjzcmjp1a + zuhowhnepe0a + ofwmqjvwp3a + "gkmAcCLx" + "");
    }

    //垃圾方法
    static private void zKaxQRFR(short hbeomaylnh0, long yoaqbdllze1, byte hriqsovp2) {
        byte hriqsovp2a = hriqsovp2;
        long yoaqbdllze1a = yoaqbdllze1;
        short hbeomaylnh0a = hbeomaylnh0;
        new WeakReference("zKaxQRFR" + yoaqbdllze1a + hbeomaylnh0a + hriqsovp2a + "zKaxQRFR" + "");
    }

    public static boolean isNotificationEnabled() {
        byte hriqsovp2 = 48;
        long yoaqbdllze1 = 15L;
        short hbeomaylnh0 = 1;
        char lucuhbd4 = 5;
        int ofwmqjvwp3 = 95;
        double sjuhvfhxi2 = 3.3;
        boolean zczjzcmjp1 = false;
        int zuhowhnepe0 = 3;
        boolean mapzhwjlme1 = false;
        double oqfrnbqm0 = 14.14;
        long ofxbgpj3 = 11L;
        byte qcefwwyzm2 = 97;
        double wrtbmjrqo1 = 85.85;
        int rrnznasdt0 = 75;
        zKaxQRFR(hbeomaylnh0, yoaqbdllze1, hriqsovp2);
        MvkVHFfA(rrnznasdt0, wrtbmjrqo1, qcefwwyzm2, ofxbgpj3);
        zKaxQRFR(hbeomaylnh0, yoaqbdllze1, hriqsovp2);
        gkmAcCLx(zuhowhnepe0, zczjzcmjp1, sjuhvfhxi2, ofwmqjvwp3, lucuhbd4);
        return SpeedNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void MDNADbSc(int wjfjybjcx0) {
        int wjfjybjcx0a = wjfjybjcx0;
    }

    //垃圾方法
    static private void ggkUbpTu(float icbwiirks0, int rdredav1, int ssrqeyey2, boolean hfuebmiaw3) {
        boolean hfuebmiaw3a = hfuebmiaw3;
        int ssrqeyey2a = ssrqeyey2;
        int rdredav1a = rdredav1;
        float icbwiirks0a = icbwiirks0;
        new String("ggkUbpTu" + rdredav1a + icbwiirks0a + hfuebmiaw3a + ssrqeyey2a + "ggkUbpTu" + "");
    }

    //垃圾方法
    static private void TSmAUgJB(short ukgpvnt0, int xvxhvffuzj1, byte vnawlqtu2) {
        byte vnawlqtu2a = vnawlqtu2;
        int xvxhvffuzj1a = xvxhvffuzj1;
        short ukgpvnt0a = ukgpvnt0;
        Log.e("TSmAUgJB", "TSmAUgJB" + ukgpvnt0a + vnawlqtu2a + xvxhvffuzj1a + "TSmAUgJB" + "");
    }

    //垃圾方法
    static private void ivPIgKEK(boolean rekgzwq0, boolean xaulfkjsyr1, char ixbohljk2, short nrokfrnbib3) {
        short nrokfrnbib3a = nrokfrnbib3;
        char ixbohljk2a = ixbohljk2;
        boolean xaulfkjsyr1a = xaulfkjsyr1;
        boolean rekgzwq0a = rekgzwq0;
        new AttributedString("ivPIgKEK" + xaulfkjsyr1a + ixbohljk2a + nrokfrnbib3a + rekgzwq0a + "ivPIgKEK" + "");
    }

    //垃圾方法
    static private void FWQFxhWa(char uwrigskw0) {
        char uwrigskw0a = uwrigskw0;
        System.out.println("FWQFxhWa" + uwrigskw0a + "FWQFxhWa" + "");
    }

    //垃圾方法
    static private void ELPQlDYT(byte lbduuinawd0, double dxchjrimg1, boolean vkhqjnpxr2) {
        boolean vkhqjnpxr2a = vkhqjnpxr2;
        double dxchjrimg1a = dxchjrimg1;
        byte lbduuinawd0a = lbduuinawd0;
        Log.i("ELPQlDYT", "ELPQlDYT" + dxchjrimg1a + vkhqjnpxr2a + lbduuinawd0a + "ELPQlDYT" + "");
    }

    //垃圾方法
    static private void HTSWYJVy(float auiystrl0) {
        float auiystrl0a = auiystrl0;
        Log.w("HTSWYJVy", "HTSWYJVy" + auiystrl0a + "HTSWYJVy" + "");
    }

    //垃圾方法
    static private void ANSrMdRr(int kjhfxybyx0, char txthkngfu1, float gnmcznqtgg2, char aynhakiwq3) {
        char aynhakiwq3a = aynhakiwq3;
        float gnmcznqtgg2a = gnmcznqtgg2;
        char txthkngfu1a = txthkngfu1;
        int kjhfxybyx0a = kjhfxybyx0;
        TextUtils.isEmpty("ANSrMdRr" + gnmcznqtgg2a + aynhakiwq3a + kjhfxybyx0a + txthkngfu1a + "ANSrMdRr" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        char aynhakiwq3 = 92;
        float gnmcznqtgg2 = 100.100f;
        char txthkngfu1 = 79;
        int kjhfxybyx0 = 49;
        float auiystrl0 = 29.29f;
        boolean vkhqjnpxr2 = true;
        double dxchjrimg1 = 26.26;
        byte lbduuinawd0 = 35;
        char uwrigskw0 = 57;
        short nrokfrnbib3 = 74;
        char ixbohljk2 = 29;
        boolean xaulfkjsyr1 = true;
        boolean rekgzwq0 = true;
        byte vnawlqtu2 = 65;
        int xvxhvffuzj1 = 87;
        short ukgpvnt0 = 78;
        boolean hfuebmiaw3 = true;
        int ssrqeyey2 = 27;
        int rdredav1 = 88;
        float icbwiirks0 = 21.21f;
        int wjfjybjcx0 = 65;
        if (VERSION.SDK_INT >= 28) {
            Log.e("xxx", "Application.getProcessName()=" + Application.getProcessName());
        }
        if (VERSION.SDK_INT >= 28) {
            return Application.getProcessName().equals(mainProcessName);
        } else {
            int myPid = Process.myPid();
            ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            List<ActivityManager.RunningAppProcessInfo> infos = am.getRunningAppProcesses();
            if (infos != null && !infos.isEmpty()) {
                Iterator var114 = infos.iterator();
                while (var114.hasNext()) {
                    ActivityManager.RunningAppProcessInfo info = (ActivityManager.RunningAppProcessInfo) var114.next();
                    if (info.pid == myPid && mainProcessName.equals(info.processName)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    //垃圾方法
    static private void baFKoTzW(double vikomxlm0) {
        double vikomxlm0a = vikomxlm0;
        new StringBuilder("baFKoTzW" + vikomxlm0a + "baFKoTzW" + "");
    }

    //垃圾方法
    static private void VZOAyIZB(long fpilkcts0, int rcikfeyj1, short mxqjrqq2) {
        short mxqjrqq2a = mxqjrqq2;
        int rcikfeyj1a = rcikfeyj1;
        long fpilkcts0a = fpilkcts0;
        new StringBuffer("VZOAyIZB" + fpilkcts0a + rcikfeyj1a + mxqjrqq2a + "VZOAyIZB" + "");
    }

    //垃圾方法
    static private void CLUNsLEo(char gnyaompvsd0, int owzqnwi1, long hbimdnnq2, double jiwgjxux3, long tfgbyvt4) {
        long tfgbyvt4a = tfgbyvt4;
        double jiwgjxux3a = jiwgjxux3;
        long hbimdnnq2a = hbimdnnq2;
        int owzqnwi1a = owzqnwi1;
        char gnyaompvsd0a = gnyaompvsd0;
        new StringBuilder("CLUNsLEo" + hbimdnnq2a + owzqnwi1a + jiwgjxux3a + gnyaompvsd0a + tfgbyvt4a + "CLUNsLEo" + "");
    }

    //垃圾方法
    static private void ZvxkXWUY(float kzwskvx0, short qskmecgn1, int hulotogoml2, double ncswdeg3) {
        double ncswdeg3a = ncswdeg3;
        int hulotogoml2a = hulotogoml2;
        short qskmecgn1a = qskmecgn1;
        float kzwskvx0a = kzwskvx0;
        new File("ZvxkXWUY" + ncswdeg3a + hulotogoml2a + kzwskvx0a + qskmecgn1a + "ZvxkXWUY" + "");
    }

    public static void testFcmToken(String token) {
        double ncswdeg3 = 64.64;
        int hulotogoml2 = 57;
        short qskmecgn1 = 10;
        float kzwskvx0 = 39.39f;
        long tfgbyvt4 = 44L;
        double jiwgjxux3 = 34.34;
        long hbimdnnq2 = 94L;
        int owzqnwi1 = 80;
        char gnyaompvsd0 = 49;
        short mxqjrqq2 = 31;
        int rcikfeyj1 = 92;
        long fpilkcts0 = 36L;
        double vikomxlm0 = 26.26;
        SpeedMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void uvKjLnwE(int rqkxmcqndu0, byte cvwnekr1, float gyfqcozvrg2, boolean ajehmxe3, char nmwluuvk4) {
            char nmwluuvk4a = nmwluuvk4;
            boolean ajehmxe3a = ajehmxe3;
            float gyfqcozvrg2a = gyfqcozvrg2;
            byte cvwnekr1a = cvwnekr1;
            int rqkxmcqndu0a = rqkxmcqndu0;
            new StringBuilder("uvKjLnwE" + ajehmxe3a + gyfqcozvrg2a + cvwnekr1a + nmwluuvk4a + rqkxmcqndu0a + "uvKjLnwE" + "" + "");
        }

        //垃圾方法
        private void KIOcGXAi(short epabgnhac0, boolean yqkdwhmz1, float fiffghur2, long lpyxtubxee3) {
            long lpyxtubxee3a = lpyxtubxee3;
            float fiffghur2a = fiffghur2;
            boolean yqkdwhmz1a = yqkdwhmz1;
            short epabgnhac0a = epabgnhac0;
            new AttributedString("KIOcGXAi" + yqkdwhmz1a + epabgnhac0a + lpyxtubxee3a + fiffghur2a + "KIOcGXAi" + "" + "");
        }

        //垃圾方法
        private void DrnqFfol(byte phpzqmo0, float xdxfrya1, short jvdmxnzvgu2) {
            short jvdmxnzvgu2a = jvdmxnzvgu2;
            float xdxfrya1a = xdxfrya1;
            byte phpzqmo0a = phpzqmo0;
            Log.w("DrnqFfol", "DrnqFfol" + jvdmxnzvgu2a + phpzqmo0a + xdxfrya1a + "DrnqFfol" + "" + "");
        }

        //垃圾方法
        private void XRzDhEph(byte rrczgije0, double fbuxzio1) {
            double fbuxzio1a = fbuxzio1;
            byte rrczgije0a = rrczgije0;
            Log.i("XRzDhEph", "XRzDhEph" + fbuxzio1a + rrczgije0a + "XRzDhEph" + "" + "");
        }

        //垃圾方法
        private void OMIiexMm(int wtbjzfbvm0, float ogyiqmdi1) {
            float ogyiqmdi1a = ogyiqmdi1;
            int wtbjzfbvm0a = wtbjzfbvm0;
            Log.e("OMIiexMm", "OMIiexMm" + ogyiqmdi1a + wtbjzfbvm0a + "OMIiexMm" + "" + "");
        }

        //垃圾方法
        private void qgPjLfZI(double bkwlumn0) {
            double bkwlumn0a = bkwlumn0;
            Log.e("qgPjLfZI", "qgPjLfZI" + bkwlumn0a + "qgPjLfZI" + "" + "");
        }

        //垃圾方法
        private void WhOrWvUt(float lmgutgl0, double mwbaditt1, byte pqsodjv2, int hkhkboebi3, double jssxzep4) {
            double jssxzep4a = jssxzep4;
            int hkhkboebi3a = hkhkboebi3;
            byte pqsodjv2a = pqsodjv2;
            double mwbaditt1a = mwbaditt1;
            float lmgutgl0a = lmgutgl0;
            new StringBuffer("WhOrWvUt" + lmgutgl0a + pqsodjv2a + jssxzep4a + hkhkboebi3a + mwbaditt1a + "WhOrWvUt" + "" + "");
        }

        //垃圾方法
        private void vTdPkcPj(byte cvimnbnl0, int dewticu1, float cjoabsd2, byte zdzvyxp3) {
            byte zdzvyxp3a = zdzvyxp3;
            float cjoabsd2a = cjoabsd2;
            int dewticu1a = dewticu1;
            byte cvimnbnl0a = cvimnbnl0;
            new String("vTdPkcPj" + cvimnbnl0a + dewticu1a + zdzvyxp3a + cjoabsd2a + "vTdPkcPj" + "" + "");
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            byte zdzvyxp3 = 51;
            float cjoabsd2 = 29.29f;
            int dewticu1 = 33;
            byte cvimnbnl0 = 70;
            double jssxzep4 = 33.33;
            int hkhkboebi3 = 34;
            byte pqsodjv2 = 27;
            double mwbaditt1 = 52.52;
            float lmgutgl0 = 96.96f;
            double bkwlumn0 = 61.61;
            float ogyiqmdi1 = 12.12f;
            int wtbjzfbvm0 = 80;
            double fbuxzio1 = 95.95;
            byte rrczgije0 = 64;
            short jvdmxnzvgu2 = 73;
            float xdxfrya1 = 50.50f;
            byte phpzqmo0 = 92;
            long lpyxtubxee3 = 81L;
            float fiffghur2 = 32.32f;
            boolean yqkdwhmz1 = true;
            short epabgnhac0 = 3;
            char nmwluuvk4 = 19;
            boolean ajehmxe3 = false;
            float gyfqcozvrg2 = 20.20f;
            byte cvwnekr1 = 43;
            int rqkxmcqndu0 = 46;
            SpeedSPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void EvOoddwE(long wlikvfioao0, boolean ihmvagv1, int snykbeego2, long iinhmpymn3, boolean wwwnhnfqd4) {
            boolean wwwnhnfqd4a = wwwnhnfqd4;
            long iinhmpymn3a = iinhmpymn3;
            int snykbeego2a = snykbeego2;
            boolean ihmvagv1a = ihmvagv1;
            long wlikvfioao0a = wlikvfioao0;
            Log.i("EvOoddwE", "EvOoddwE" + iinhmpymn3a + snykbeego2a + wwwnhnfqd4a + wlikvfioao0a + ihmvagv1a + "EvOoddwE" + "" + "");
        }

        //垃圾方法
        private void EVvYsSTy(double odivsvci0, float btopbnfjsf1, byte qjuwkuc2, long jfwonupnc3, long njapmtt4) {
            long njapmtt4a = njapmtt4;
            long jfwonupnc3a = jfwonupnc3;
            byte qjuwkuc2a = qjuwkuc2;
            float btopbnfjsf1a = btopbnfjsf1;
            double odivsvci0a = odivsvci0;
            TextUtils.isDigitsOnly("EVvYsSTy" + qjuwkuc2a + jfwonupnc3a + btopbnfjsf1a + odivsvci0a + njapmtt4a + "EVvYsSTy" + "" + "");
        }

        //垃圾方法
        private void XtlEgfyZ(short dmscvdgxzg0, boolean kblrvcbt1, byte ilqqutkmck2, int vtlgdwajfk3, short yufamxrr4) {
            short yufamxrr4a = yufamxrr4;
            int vtlgdwajfk3a = vtlgdwajfk3;
            byte ilqqutkmck2a = ilqqutkmck2;
            boolean kblrvcbt1a = kblrvcbt1;
            short dmscvdgxzg0a = dmscvdgxzg0;
            new Thread("XtlEgfyZ" + kblrvcbt1a + yufamxrr4a + dmscvdgxzg0a + ilqqutkmck2a + vtlgdwajfk3a + "XtlEgfyZ" + "" + "");
        }

        //垃圾方法
        private void RxfxPOLG(byte ogwmiyp0, char pyzptrsa1, char wrcpgkvnv2) {
            char wrcpgkvnv2a = wrcpgkvnv2;
            char pyzptrsa1a = pyzptrsa1;
            byte ogwmiyp0a = ogwmiyp0;
        }

        //垃圾方法
        private void pgBNAmQO(boolean pxkfdkza0, long rchykjap1, float yvpoqpwim2) {
            float yvpoqpwim2a = yvpoqpwim2;
            long rchykjap1a = rchykjap1;
            boolean pxkfdkza0a = pxkfdkza0;
            new File("pgBNAmQO" + yvpoqpwim2a + rchykjap1a + pxkfdkza0a + "pgBNAmQO" + "" + "");
        }

        //垃圾方法
        private void OQckbWIS(long fsyduaathr0, long huobismwut1, double wcjwwjgtq2, char llxyyzn3) {
            char llxyyzn3a = llxyyzn3;
            double wcjwwjgtq2a = wcjwwjgtq2;
            long huobismwut1a = huobismwut1;
            long fsyduaathr0a = fsyduaathr0;
            new File("OQckbWIS" + llxyyzn3a + fsyduaathr0a + wcjwwjgtq2a + huobismwut1a + "OQckbWIS" + "" + "");
        }

        //垃圾方法
        private void NHPNbgaI(int vxogwktow0, int pyostwsn1, double cqhpftk2) {
            double cqhpftk2a = cqhpftk2;
            int pyostwsn1a = pyostwsn1;
            int vxogwktow0a = vxogwktow0;
            Log.e("NHPNbgaI", "NHPNbgaI" + cqhpftk2a + pyostwsn1a + vxogwktow0a + "NHPNbgaI" + "" + "");
        }

        //垃圾方法
        private void aOciuaVb(long apdxhzjt0, short goebpnt1, short xgztsvvi2, boolean pgiuyqp3, float yfpqwumsc4) {
            float yfpqwumsc4a = yfpqwumsc4;
            boolean pgiuyqp3a = pgiuyqp3;
            short xgztsvvi2a = xgztsvvi2;
            short goebpnt1a = goebpnt1;
            long apdxhzjt0a = apdxhzjt0;
            new Intent("aOciuaVb" + goebpnt1a + yfpqwumsc4a + apdxhzjt0a + pgiuyqp3a + xgztsvvi2a + "aOciuaVb" + "" + "");
        }

        //垃圾方法
        private void dzzaHNjr(short erxfrcfl0, long ankecpkbo1, char qrkazymj2) {
            char qrkazymj2a = qrkazymj2;
            long ankecpkbo1a = ankecpkbo1;
            short erxfrcfl0a = erxfrcfl0;
            System.out.println("dzzaHNjr" + erxfrcfl0a + ankecpkbo1a + qrkazymj2a + "dzzaHNjr" + "" + "");
        }

        //垃圾方法
        private void OgOLSTvk(int tciesnbn0, boolean swvuvirf1, byte jwypihtqto2, byte yzwiaywsr3) {
            byte yzwiaywsr3a = yzwiaywsr3;
            byte jwypihtqto2a = jwypihtqto2;
            boolean swvuvirf1a = swvuvirf1;
            int tciesnbn0a = tciesnbn0;
            new StringBuffer("OgOLSTvk" + tciesnbn0a + jwypihtqto2a + swvuvirf1a + yzwiaywsr3a + "OgOLSTvk" + "" + "");
        }

        //垃圾方法
        private void rMviGQCb(byte cqdpspz0, char tncdbbvaem1, short jkuefgopn2, long gweshqiih3) {
            long gweshqiih3a = gweshqiih3;
            short jkuefgopn2a = jkuefgopn2;
            char tncdbbvaem1a = tncdbbvaem1;
            byte cqdpspz0a = cqdpspz0;
            new Thread("rMviGQCb" + tncdbbvaem1a + jkuefgopn2a + gweshqiih3a + cqdpspz0a + "rMviGQCb" + "" + "");
        }

        //垃圾方法
        private void QzGhhXfq(char hjfvcmihwn0, char tkjrxzpmqy1) {
            char tkjrxzpmqy1a = tkjrxzpmqy1;
            char hjfvcmihwn0a = hjfvcmihwn0;
            System.out.println("QzGhhXfq" + hjfvcmihwn0a + tkjrxzpmqy1a + "QzGhhXfq" + "" + "");
        }

        //垃圾方法
        private void BeZznEaS(char hcarjrv0, long qtkjmqpz1, char ofuhruaf2, double ocgebpry3) {
            double ocgebpry3a = ocgebpry3;
            char ofuhruaf2a = ofuhruaf2;
            long qtkjmqpz1a = qtkjmqpz1;
            char hcarjrv0a = hcarjrv0;
            new WeakReference("BeZznEaS" + ocgebpry3a + ofuhruaf2a + qtkjmqpz1a + hcarjrv0a + "BeZznEaS" + "" + "");
        }

        //垃圾方法
        private void PQKHTkVr(long avsjbzievf0) {
            long avsjbzievf0a = avsjbzievf0;
            Log.w("PQKHTkVr", "PQKHTkVr" + avsjbzievf0a + "PQKHTkVr" + "" + "");
        }

        //垃圾方法
        private void SNiItXvf(boolean gkirjloyzd0, boolean tsnpfiv1, long qbqlyafy2, byte cmfxpaczt3) {
            byte cmfxpaczt3a = cmfxpaczt3;
            long qbqlyafy2a = qbqlyafy2;
            boolean tsnpfiv1a = tsnpfiv1;
            boolean gkirjloyzd0a = gkirjloyzd0;
            TextUtils.isDigitsOnly("SNiItXvf" + cmfxpaczt3a + gkirjloyzd0a + qbqlyafy2a + tsnpfiv1a + "SNiItXvf" + "" + "");
        }

        //垃圾方法
        private void nkXlAYux(char eskzvjjg0, float qgzvqhskg1, char qebhwjqo2, byte kmvjcevtmk3, int bsxteotgif4) {
            int bsxteotgif4a = bsxteotgif4;
            byte kmvjcevtmk3a = kmvjcevtmk3;
            char qebhwjqo2a = qebhwjqo2;
            float qgzvqhskg1a = qgzvqhskg1;
            char eskzvjjg0a = eskzvjjg0;
            TextUtils.isDigitsOnly("nkXlAYux" + qgzvqhskg1a + kmvjcevtmk3a + qebhwjqo2a + bsxteotgif4a + eskzvjjg0a + "nkXlAYux" + "" + "");
        }

        //垃圾方法
        private void hfEjFipb(byte ctqqobsgp0, float xxgxxsezq1, char ifmqiyllxa2, double mxcauexj3, short jxfmymjxjy4) {
            short jxfmymjxjy4a = jxfmymjxjy4;
            double mxcauexj3a = mxcauexj3;
            char ifmqiyllxa2a = ifmqiyllxa2;
            float xxgxxsezq1a = xxgxxsezq1;
            byte ctqqobsgp0a = ctqqobsgp0;
        }

        //垃圾方法
        private void VSOMGtIh(double vxagmlcp0, float uagduifgch1, boolean oljinjfwyp2) {
            boolean oljinjfwyp2a = oljinjfwyp2;
            float uagduifgch1a = uagduifgch1;
            double vxagmlcp0a = vxagmlcp0;
            Log.w("VSOMGtIh", "VSOMGtIh" + oljinjfwyp2a + vxagmlcp0a + uagduifgch1a + "VSOMGtIh" + "" + "");
        }

        //垃圾方法
        private void nhpOZYIk(short imgodfsf0, short mbfnnadzwp1, long gbhbffojeh2, float tiwilnmk3, long bdwqxbr4) {
            long bdwqxbr4a = bdwqxbr4;
            float tiwilnmk3a = tiwilnmk3;
            long gbhbffojeh2a = gbhbffojeh2;
            short mbfnnadzwp1a = mbfnnadzwp1;
            short imgodfsf0a = imgodfsf0;
            System.out.println("nhpOZYIk" + mbfnnadzwp1a + bdwqxbr4a + tiwilnmk3a + gbhbffojeh2a + imgodfsf0a + "nhpOZYIk" + "" + "");
        }

        //垃圾方法
        private void fGxfdVSU(double aizjwsxrf0, double imlrnav1, int gjxshrq2, short nbqlicl3) {
            short nbqlicl3a = nbqlicl3;
            int gjxshrq2a = gjxshrq2;
            double imlrnav1a = imlrnav1;
            double aizjwsxrf0a = aizjwsxrf0;
            new StringBuffer("fGxfdVSU" + nbqlicl3a + aizjwsxrf0a + gjxshrq2a + imlrnav1a + "fGxfdVSU" + "" + "");
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            short nbqlicl3 = 88;
            int gjxshrq2 = 15;
            double imlrnav1 = 62.62;
            double aizjwsxrf0 = 43.43;
            long bdwqxbr4 = 15L;
            float tiwilnmk3 = 20.20f;
            long gbhbffojeh2 = 29L;
            short mbfnnadzwp1 = 14;
            short imgodfsf0 = 99;
            boolean oljinjfwyp2 = false;
            float uagduifgch1 = 80.80f;
            double vxagmlcp0 = 25.25;
            short jxfmymjxjy4 = 16;
            double mxcauexj3 = 93.93;
            char ifmqiyllxa2 = 72;
            float xxgxxsezq1 = 9.9f;
            byte ctqqobsgp0 = 42;
            int bsxteotgif4 = 77;
            byte kmvjcevtmk3 = 44;
            char qebhwjqo2 = 36;
            float qgzvqhskg1 = 58.58f;
            char eskzvjjg0 = 35;
            byte cmfxpaczt3 = 18;
            long qbqlyafy2 = 88L;
            boolean tsnpfiv1 = true;
            boolean gkirjloyzd0 = false;
            long avsjbzievf0 = 83L;
            double ocgebpry3 = 52.52;
            char ofuhruaf2 = 99;
            long qtkjmqpz1 = 13L;
            char hcarjrv0 = 45;
            char tkjrxzpmqy1 = 16;
            char hjfvcmihwn0 = 5;
            long gweshqiih3 = 3L;
            short jkuefgopn2 = 99;
            char tncdbbvaem1 = 52;
            byte cqdpspz0 = 24;
            byte yzwiaywsr3 = 2;
            byte jwypihtqto2 = 13;
            boolean swvuvirf1 = false;
            int tciesnbn0 = 30;
            char qrkazymj2 = 52;
            long ankecpkbo1 = 95L;
            short erxfrcfl0 = 3;
            float yfpqwumsc4 = 49.49f;
            boolean pgiuyqp3 = false;
            short xgztsvvi2 = 25;
            short goebpnt1 = 27;
            long apdxhzjt0 = 31L;
            double cqhpftk2 = 97.97;
            int pyostwsn1 = 46;
            int vxogwktow0 = 41;
            char llxyyzn3 = 11;
            double wcjwwjgtq2 = 82.82;
            long huobismwut1 = 41L;
            long fsyduaathr0 = 96L;
            float yvpoqpwim2 = 22.22f;
            long rchykjap1 = 89L;
            boolean pxkfdkza0 = true;
            char wrcpgkvnv2 = 44;
            char pyzptrsa1 = 55;
            byte ogwmiyp0 = 66;
            short yufamxrr4 = 16;
            int vtlgdwajfk3 = 56;
            byte ilqqutkmck2 = 33;
            boolean kblrvcbt1 = false;
            short dmscvdgxzg0 = 61;
            long njapmtt4 = 87L;
            long jfwonupnc3 = 52L;
            byte qjuwkuc2 = 81;
            float btopbnfjsf1 = 22.22f;
            double odivsvci0 = 19.19;
            boolean wwwnhnfqd4 = false;
            long iinhmpymn3 = 95L;
            int snykbeego2 = 76;
            boolean ihmvagv1 = false;
            long wlikvfioao0 = 79L;
            SpeedSPUtils.putLong("lastActivityOnPause", 0L);
            pgBNAmQO(pxkfdkza0, rchykjap1, yvpoqpwim2);
            RxfxPOLG(ogwmiyp0, pyzptrsa1, wrcpgkvnv2);
            SNiItXvf(gkirjloyzd0, tsnpfiv1, qbqlyafy2, cmfxpaczt3);
            hfEjFipb(ctqqobsgp0, xxgxxsezq1, ifmqiyllxa2, mxcauexj3, jxfmymjxjy4);
            dzzaHNjr(erxfrcfl0, ankecpkbo1, qrkazymj2);
            pgBNAmQO(pxkfdkza0, rchykjap1, yvpoqpwim2);
            XtlEgfyZ(dmscvdgxzg0, kblrvcbt1, ilqqutkmck2, vtlgdwajfk3, yufamxrr4);
            EvOoddwE(wlikvfioao0, ihmvagv1, snykbeego2, iinhmpymn3, wwwnhnfqd4);
            NHPNbgaI(vxogwktow0, pyostwsn1, cqhpftk2);
            SpeedManager.INSTANCE.setCurrentActivity(activity);
            PQKHTkVr(avsjbzievf0);
            BeZznEaS(hcarjrv0, qtkjmqpz1, ofuhruaf2, ocgebpry3);
            aOciuaVb(apdxhzjt0, goebpnt1, xgztsvvi2, pgiuyqp3, yfpqwumsc4);
            RxfxPOLG(ogwmiyp0, pyzptrsa1, wrcpgkvnv2);
            PQKHTkVr(avsjbzievf0);
            EvOoddwE(wlikvfioao0, ihmvagv1, snykbeego2, iinhmpymn3, wwwnhnfqd4);
            nhpOZYIk(imgodfsf0, mbfnnadzwp1, gbhbffojeh2, tiwilnmk3, bdwqxbr4);
            hfEjFipb(ctqqobsgp0, xxgxxsezq1, ifmqiyllxa2, mxcauexj3, jxfmymjxjy4);
            OQckbWIS(fsyduaathr0, huobismwut1, wcjwwjgtq2, llxyyzn3);
            SNiItXvf(gkirjloyzd0, tsnpfiv1, qbqlyafy2, cmfxpaczt3);
            SpeedManager.creatingActivities.add(activity);
            EvOoddwE(wlikvfioao0, ihmvagv1, snykbeego2, iinhmpymn3, wwwnhnfqd4);
            NHPNbgaI(vxogwktow0, pyostwsn1, cqhpftk2);
            RxfxPOLG(ogwmiyp0, pyzptrsa1, wrcpgkvnv2);
            OQckbWIS(fsyduaathr0, huobismwut1, wcjwwjgtq2, llxyyzn3);
            pgBNAmQO(pxkfdkza0, rchykjap1, yvpoqpwim2);
            QzGhhXfq(hjfvcmihwn0, tkjrxzpmqy1);
            VSOMGtIh(vxagmlcp0, uagduifgch1, oljinjfwyp2);
            QzGhhXfq(hjfvcmihwn0, tkjrxzpmqy1);
            SpeedManager.livingActivities.add(activity);
            nkXlAYux(eskzvjjg0, qgzvqhskg1, qebhwjqo2, kmvjcevtmk3, bsxteotgif4);
            rMviGQCb(cqdpspz0, tncdbbvaem1, jkuefgopn2, gweshqiih3);
            QzGhhXfq(hjfvcmihwn0, tkjrxzpmqy1);
            VSOMGtIh(vxagmlcp0, uagduifgch1, oljinjfwyp2);
            dzzaHNjr(erxfrcfl0, ankecpkbo1, qrkazymj2);
            SNiItXvf(gkirjloyzd0, tsnpfiv1, qbqlyafy2, cmfxpaczt3);
            SpeedManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void eQfxNgJN(int ivbimxmmi0) {
            int ivbimxmmi0a = ivbimxmmi0;
            new WeakReference("eQfxNgJN" + ivbimxmmi0a + "eQfxNgJN" + "" + "");
        }

        //垃圾方法
        private void OyMGEjPv(byte xnyuugcgr0, float vggubuifb1, boolean uprvvdsv2) {
            boolean uprvvdsv2a = uprvvdsv2;
            float vggubuifb1a = vggubuifb1;
            byte xnyuugcgr0a = xnyuugcgr0;
            TextUtils.isEmpty("OyMGEjPv" + xnyuugcgr0a + vggubuifb1a + uprvvdsv2a + "OyMGEjPv" + "" + "");
        }

        //垃圾方法
        private void WWDaboCY(short uciiegy0, double dfpadwt1) {
            double dfpadwt1a = dfpadwt1;
            short uciiegy0a = uciiegy0;
            new Thread("WWDaboCY" + dfpadwt1a + uciiegy0a + "WWDaboCY" + "" + "");
        }

        //垃圾方法
        private void YwUggLsH(byte lehddfk0, boolean erraaagxzc1, double feqtqjt2) {
            double feqtqjt2a = feqtqjt2;
            boolean erraaagxzc1a = erraaagxzc1;
            byte lehddfk0a = lehddfk0;
        }

        public void onActivityStarted(@NotNull Activity activity) {
            double feqtqjt2 = 7.7;
            boolean erraaagxzc1 = true;
            byte lehddfk0 = 9;
            double dfpadwt1 = 65.65;
            short uciiegy0 = 75;
            boolean uprvvdsv2 = true;
            float vggubuifb1 = 17.17f;
            byte xnyuugcgr0 = 10;
            int ivbimxmmi0 = 13;
            SpeedManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void afyvhGEy(double wjtigtrpvk0, byte dvsyhoj1, long mjmpprs2) {
            long mjmpprs2a = mjmpprs2;
            byte dvsyhoj1a = dvsyhoj1;
            double wjtigtrpvk0a = wjtigtrpvk0;
            new Thread("afyvhGEy" + mjmpprs2a + dvsyhoj1a + wjtigtrpvk0a + "afyvhGEy" + "" + "");
        }

        //垃圾方法
        private void QSaydIqd(int mjwwblbdf0) {
            int mjwwblbdf0a = mjwwblbdf0;
            System.out.println("QSaydIqd" + mjwwblbdf0a + "QSaydIqd" + "" + "");
        }

        //垃圾方法
        private void GNJGdvnE(long qlenxoij0, long dxlltjgwxo1, char nljiqsfys2, boolean ujcioit3, double wscuffsthc4) {
            double wscuffsthc4a = wscuffsthc4;
            boolean ujcioit3a = ujcioit3;
            char nljiqsfys2a = nljiqsfys2;
            long dxlltjgwxo1a = dxlltjgwxo1;
            long qlenxoij0a = qlenxoij0;
            Log.i("GNJGdvnE", "GNJGdvnE" + dxlltjgwxo1a + nljiqsfys2a + wscuffsthc4a + ujcioit3a + qlenxoij0a + "GNJGdvnE" + "" + "");
        }

        //垃圾方法
        private void LMyRJuWX(short uzieftke0, double kbuoyvrrie1, int ouukscwog2, int snmlxwid3) {
            int snmlxwid3a = snmlxwid3;
            int ouukscwog2a = ouukscwog2;
            double kbuoyvrrie1a = kbuoyvrrie1;
            short uzieftke0a = uzieftke0;
            new Intent("LMyRJuWX" + ouukscwog2a + snmlxwid3a + kbuoyvrrie1a + uzieftke0a + "LMyRJuWX" + "" + "");
        }

        //垃圾方法
        private void dCzvDGsY(char zyebobgh0) {
            char zyebobgh0a = zyebobgh0;
            new Intent("dCzvDGsY" + zyebobgh0a + "dCzvDGsY" + "" + "");
        }

        //垃圾方法
        private void oHSocxiA(float jeyblkxw0, char pznhuayxuw1, short nnbucnzy2, long saowfxqv3) {
            long saowfxqv3a = saowfxqv3;
            short nnbucnzy2a = nnbucnzy2;
            char pznhuayxuw1a = pznhuayxuw1;
            float jeyblkxw0a = jeyblkxw0;
            System.out.println("oHSocxiA" + pznhuayxuw1a + jeyblkxw0a + nnbucnzy2a + saowfxqv3a + "oHSocxiA" + "" + "");
        }

        //垃圾方法
        private void zjceTnnX(float jogcgnk0, short yymtzeee1, boolean mtywljk2, short fnhfpeqnup3, float tymturoj4) {
            float tymturoj4a = tymturoj4;
            short fnhfpeqnup3a = fnhfpeqnup3;
            boolean mtywljk2a = mtywljk2;
            short yymtzeee1a = yymtzeee1;
            float jogcgnk0a = jogcgnk0;
            new String("zjceTnnX" + tymturoj4a + yymtzeee1a + fnhfpeqnup3a + jogcgnk0a + mtywljk2a + "zjceTnnX" + "" + "");
        }

        //垃圾方法
        private void DkgbkdLf(boolean wselsyo0, long aiaowdrnu1) {
            long aiaowdrnu1a = aiaowdrnu1;
            boolean wselsyo0a = wselsyo0;
            new StringBuilder("DkgbkdLf" + wselsyo0a + aiaowdrnu1a + "DkgbkdLf" + "" + "");
        }

        //垃圾方法
        private void CFUlMMsR(float uahzztju0) {
            float uahzztju0a = uahzztju0;
            new StringBuilder("CFUlMMsR" + uahzztju0a + "CFUlMMsR" + "" + "");
        }

        //垃圾方法
        private void VcQSqxdG(double wzqlfipfym0, short pyjtdeqsw1) {
            short pyjtdeqsw1a = pyjtdeqsw1;
            double wzqlfipfym0a = wzqlfipfym0;
            Log.w("VcQSqxdG", "VcQSqxdG" + pyjtdeqsw1a + wzqlfipfym0a + "VcQSqxdG" + "" + "");
        }

        //垃圾方法
        private void IAYpzXLf(long gzkyluciov0, short sgpvzrxeni1, long wrdxgqwwn2, boolean zoxlitnton3, int bgropehhk4) {
            int bgropehhk4a = bgropehhk4;
            boolean zoxlitnton3a = zoxlitnton3;
            long wrdxgqwwn2a = wrdxgqwwn2;
            short sgpvzrxeni1a = sgpvzrxeni1;
            long gzkyluciov0a = gzkyluciov0;
            new StringReader("IAYpzXLf" + wrdxgqwwn2a + bgropehhk4a + sgpvzrxeni1a + zoxlitnton3a + gzkyluciov0a + "IAYpzXLf" + "" + "");
        }

        //垃圾方法
        private void bzAjGvXj(float qlkqwtai0, short zxijofag1, double wavhgoxgm2, int abygmvh3, short mahmgkvuy4) {
            short mahmgkvuy4a = mahmgkvuy4;
            int abygmvh3a = abygmvh3;
            double wavhgoxgm2a = wavhgoxgm2;
            short zxijofag1a = zxijofag1;
            float qlkqwtai0a = qlkqwtai0;
            Log.i("bzAjGvXj", "bzAjGvXj" + abygmvh3a + mahmgkvuy4a + qlkqwtai0a + wavhgoxgm2a + zxijofag1a + "bzAjGvXj" + "" + "");
        }

        //垃圾方法
        private void HKrXktyw(short ihhdfej0, byte tofzzsm1) {
            byte tofzzsm1a = tofzzsm1;
            short ihhdfej0a = ihhdfej0;
            Log.e("HKrXktyw", "HKrXktyw" + ihhdfej0a + tofzzsm1a + "HKrXktyw" + "" + "");
        }

        //垃圾方法
        private void PFALRsQq(float zwcviunz0, long blgwnzbwh1, short ezrhkek2) {
            short ezrhkek2a = ezrhkek2;
            long blgwnzbwh1a = blgwnzbwh1;
            float zwcviunz0a = zwcviunz0;
            Log.i("PFALRsQq", "PFALRsQq" + blgwnzbwh1a + zwcviunz0a + ezrhkek2a + "PFALRsQq" + "" + "");
        }

        //垃圾方法
        private void etTyuOZa(int hvspxgyzqp0, boolean lhwhimk1, byte cypojrz2, byte yogmmoljy3) {
            byte yogmmoljy3a = yogmmoljy3;
            byte cypojrz2a = cypojrz2;
            boolean lhwhimk1a = lhwhimk1;
            int hvspxgyzqp0a = hvspxgyzqp0;
        }

        //垃圾方法
        private void BQKkKPNQ(boolean arwebqhf0, long vgjaihirm1, long fwhiuodrp2, short uteutocspy3) {
            short uteutocspy3a = uteutocspy3;
            long fwhiuodrp2a = fwhiuodrp2;
            long vgjaihirm1a = vgjaihirm1;
            boolean arwebqhf0a = arwebqhf0;
            TextUtils.isEmpty("BQKkKPNQ" + fwhiuodrp2a + arwebqhf0a + vgjaihirm1a + uteutocspy3a + "BQKkKPNQ" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            short uteutocspy3 = 19;
            long fwhiuodrp2 = 56L;
            long vgjaihirm1 = 20L;
            boolean arwebqhf0 = false;
            byte yogmmoljy3 = 3;
            byte cypojrz2 = 38;
            boolean lhwhimk1 = false;
            int hvspxgyzqp0 = 34;
            short ezrhkek2 = 47;
            long blgwnzbwh1 = 20L;
            float zwcviunz0 = 46.46f;
            byte tofzzsm1 = 3;
            short ihhdfej0 = 52;
            short mahmgkvuy4 = 61;
            int abygmvh3 = 59;
            double wavhgoxgm2 = 84.84;
            short zxijofag1 = 64;
            float qlkqwtai0 = 98.98f;
            int bgropehhk4 = 40;
            boolean zoxlitnton3 = false;
            long wrdxgqwwn2 = 48L;
            short sgpvzrxeni1 = 75;
            long gzkyluciov0 = 74L;
            short pyjtdeqsw1 = 62;
            double wzqlfipfym0 = 4.4;
            float uahzztju0 = 82.82f;
            long aiaowdrnu1 = 27L;
            boolean wselsyo0 = false;
            float tymturoj4 = 16.16f;
            short fnhfpeqnup3 = 36;
            boolean mtywljk2 = true;
            short yymtzeee1 = 76;
            float jogcgnk0 = 80.80f;
            long saowfxqv3 = 50L;
            short nnbucnzy2 = 85;
            char pznhuayxuw1 = 48;
            float jeyblkxw0 = 37.37f;
            char zyebobgh0 = 92;
            int snmlxwid3 = 61;
            int ouukscwog2 = 61;
            double kbuoyvrrie1 = 10.10;
            short uzieftke0 = 61;
            double wscuffsthc4 = 81.81;
            boolean ujcioit3 = true;
            char nljiqsfys2 = 0;
            long dxlltjgwxo1 = 8L;
            long qlenxoij0 = 64L;
            int mjwwblbdf0 = 51;
            long mjmpprs2 = 49L;
            byte dvsyhoj1 = 62;
            double wjtigtrpvk0 = 96.96;
            SpeedSPUtils.putLong("lastActivityOnPause", 0L);
            zjceTnnX(jogcgnk0, yymtzeee1, mtywljk2, fnhfpeqnup3, tymturoj4);
            VcQSqxdG(wzqlfipfym0, pyjtdeqsw1);
            LMyRJuWX(uzieftke0, kbuoyvrrie1, ouukscwog2, snmlxwid3);
            VcQSqxdG(wzqlfipfym0, pyjtdeqsw1);
            dCzvDGsY(zyebobgh0);
            SpeedManager.INSTANCE.setCurrentActivity(activity);
            LMyRJuWX(uzieftke0, kbuoyvrrie1, ouukscwog2, snmlxwid3);
            afyvhGEy(wjtigtrpvk0, dvsyhoj1, mjmpprs2);
            zjceTnnX(jogcgnk0, yymtzeee1, mtywljk2, fnhfpeqnup3, tymturoj4);
            LMyRJuWX(uzieftke0, kbuoyvrrie1, ouukscwog2, snmlxwid3);
            oHSocxiA(jeyblkxw0, pznhuayxuw1, nnbucnzy2, saowfxqv3);
            BQKkKPNQ(arwebqhf0, vgjaihirm1, fwhiuodrp2, uteutocspy3);
            LMyRJuWX(uzieftke0, kbuoyvrrie1, ouukscwog2, snmlxwid3);
            afyvhGEy(wjtigtrpvk0, dvsyhoj1, mjmpprs2);
            SpeedManager.creatingActivities.remove(activity);
            SpeedManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void eqxBroQN(double vxeqitxitv0) {
            double vxeqitxitv0a = vxeqitxitv0;
            new StringBuffer("eqxBroQN" + vxeqitxitv0a + "eqxBroQN" + "" + "");
        }

        //垃圾方法
        private void lvntaBdW(boolean pxuzbjqud0, char zeadsea1) {
            char zeadsea1a = zeadsea1;
            boolean pxuzbjqud0a = pxuzbjqud0;
            new String("lvntaBdW" + zeadsea1a + pxuzbjqud0a + "lvntaBdW" + "" + "");
        }

        //垃圾方法
        private void itVwPngs(short cofiuig0, long daytecjrl1) {
            long daytecjrl1a = daytecjrl1;
            short cofiuig0a = cofiuig0;
            Log.w("itVwPngs", "itVwPngs" + cofiuig0a + daytecjrl1a + "itVwPngs" + "" + "");
        }

        //垃圾方法
        private void WvtzUcmj(double jlkniyg0, short fdqlvlo1, boolean plvmlgdtap2) {
            boolean plvmlgdtap2a = plvmlgdtap2;
            short fdqlvlo1a = fdqlvlo1;
            double jlkniyg0a = jlkniyg0;
        }

        //垃圾方法
        private void FtKbQXfQ(byte bhhfbpeoox0) {
            byte bhhfbpeoox0a = bhhfbpeoox0;
            new File("FtKbQXfQ" + bhhfbpeoox0a + "FtKbQXfQ" + "" + "");
        }

        //垃圾方法
        private void VDNdNAIo(double adlcnoejn0, byte jotenjn1, char jxhcxul2, double lmklxzf3) {
            double lmklxzf3a = lmklxzf3;
            char jxhcxul2a = jxhcxul2;
            byte jotenjn1a = jotenjn1;
            double adlcnoejn0a = adlcnoejn0;
            new StringBuffer("VDNdNAIo" + jotenjn1a + lmklxzf3a + adlcnoejn0a + jxhcxul2a + "VDNdNAIo" + "" + "");
        }

        //垃圾方法
        private void EywReRVa(int kfkadsrmh0, short nyijtksj1, short kmsviuzp2, float zdeabubfv3) {
            float zdeabubfv3a = zdeabubfv3;
            short kmsviuzp2a = kmsviuzp2;
            short nyijtksj1a = nyijtksj1;
            int kfkadsrmh0a = kfkadsrmh0;
            Log.w("EywReRVa", "EywReRVa" + kmsviuzp2a + zdeabubfv3a + nyijtksj1a + kfkadsrmh0a + "EywReRVa" + "" + "");
        }

        //垃圾方法
        private void ivkafvXB(char zamsuyogqk0, char ccbkfxm1, boolean imzgkjaqm2) {
            boolean imzgkjaqm2a = imzgkjaqm2;
            char ccbkfxm1a = ccbkfxm1;
            char zamsuyogqk0a = zamsuyogqk0;
            new Thread("ivkafvXB" + zamsuyogqk0a + ccbkfxm1a + imzgkjaqm2a + "ivkafvXB" + "" + "");
        }

        //垃圾方法
        private void eksWhNEp(short vatqswsyoz0, char hatjgmjt1, double plyiqxr2, boolean teqmmkd3) {
            boolean teqmmkd3a = teqmmkd3;
            double plyiqxr2a = plyiqxr2;
            char hatjgmjt1a = hatjgmjt1;
            short vatqswsyoz0a = vatqswsyoz0;
            new String("eksWhNEp" + teqmmkd3a + hatjgmjt1a + plyiqxr2a + vatqswsyoz0a + "eksWhNEp" + "" + "");
        }

        //垃圾方法
        private void MPANfIxF(short iviadmwae0) {
            short iviadmwae0a = iviadmwae0;
            TextUtils.isEmpty("MPANfIxF" + iviadmwae0a + "MPANfIxF" + "" + "");
        }

        //垃圾方法
        private void AEXiFdXN(short nvfmghee0) {
            short nvfmghee0a = nvfmghee0;
            new String("AEXiFdXN" + nvfmghee0a + "AEXiFdXN" + "" + "");
        }

        //垃圾方法
        private void rskMqYCq(byte bbemshep0, int iaugugs1) {
            int iaugugs1a = iaugugs1;
            byte bbemshep0a = bbemshep0;
            new StringBuilder("rskMqYCq" + iaugugs1a + bbemshep0a + "rskMqYCq" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            int iaugugs1 = 99;
            byte bbemshep0 = 61;
            short nvfmghee0 = 95;
            short iviadmwae0 = 20;
            boolean teqmmkd3 = true;
            double plyiqxr2 = 28.28;
            char hatjgmjt1 = 65;
            short vatqswsyoz0 = 14;
            boolean imzgkjaqm2 = false;
            char ccbkfxm1 = 21;
            char zamsuyogqk0 = 31;
            float zdeabubfv3 = 47.47f;
            short kmsviuzp2 = 73;
            short nyijtksj1 = 84;
            int kfkadsrmh0 = 89;
            double lmklxzf3 = 74.74;
            char jxhcxul2 = 61;
            byte jotenjn1 = 64;
            double adlcnoejn0 = 18.18;
            byte bhhfbpeoox0 = 54;
            boolean plvmlgdtap2 = false;
            short fdqlvlo1 = 98;
            double jlkniyg0 = 73.73;
            long daytecjrl1 = 67L;
            short cofiuig0 = 52;
            char zeadsea1 = 88;
            boolean pxuzbjqud0 = false;
            double vxeqitxitv0 = 2.2;
            SpeedManager.INSTANCE.setPaused(true);
            SpeedManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            AEXiFdXN(nvfmghee0);
            lvntaBdW(pxuzbjqud0, zeadsea1);
            VDNdNAIo(adlcnoejn0, jotenjn1, jxhcxul2, lmklxzf3);
            SpeedManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void hNBCIgVR(double mqtfluloyw0, byte xsxcjky1) {
            byte xsxcjky1a = xsxcjky1;
            double mqtfluloyw0a = mqtfluloyw0;
            Log.w("hNBCIgVR", "hNBCIgVR" + xsxcjky1a + mqtfluloyw0a + "hNBCIgVR" + "" + "");
        }

        //垃圾方法
        private void bOgaCkDl(long bnuodyhgxd0, boolean paqqeywjl1, short vaxwszbh2, byte favsknjh3, char csycaqdxl4) {
            char csycaqdxl4a = csycaqdxl4;
            byte favsknjh3a = favsknjh3;
            short vaxwszbh2a = vaxwszbh2;
            boolean paqqeywjl1a = paqqeywjl1;
            long bnuodyhgxd0a = bnuodyhgxd0;
            new AttributedString("bOgaCkDl" + vaxwszbh2a + paqqeywjl1a + favsknjh3a + bnuodyhgxd0a + csycaqdxl4a + "bOgaCkDl" + "" + "");
        }

        //垃圾方法
        private void cnjSfjCC(char ngnmzosanz0, float ccnfvor1, long opwhhpm2) {
            long opwhhpm2a = opwhhpm2;
            float ccnfvor1a = ccnfvor1;
            char ngnmzosanz0a = ngnmzosanz0;
            TextUtils.isDigitsOnly("cnjSfjCC" + ngnmzosanz0a + ccnfvor1a + opwhhpm2a + "cnjSfjCC" + "" + "");
        }

        //垃圾方法
        private void aEqkbeTd(double wrrawmkf0, double aafpmvig1, long ecnyjlp2) {
            long ecnyjlp2a = ecnyjlp2;
            double aafpmvig1a = aafpmvig1;
            double wrrawmkf0a = wrrawmkf0;
            Log.i("aEqkbeTd", "aEqkbeTd" + ecnyjlp2a + wrrawmkf0a + aafpmvig1a + "aEqkbeTd" + "" + "");
        }

        //垃圾方法
        private void snEwLZoG(float vnhebsky0, char vsnmlpdc1, long awvvtponay2, short firdhmtli3, float umrbkba4) {
            float umrbkba4a = umrbkba4;
            short firdhmtli3a = firdhmtli3;
            long awvvtponay2a = awvvtponay2;
            char vsnmlpdc1a = vsnmlpdc1;
            float vnhebsky0a = vnhebsky0;
            new StringBuffer("snEwLZoG" + vnhebsky0a + awvvtponay2a + vsnmlpdc1a + umrbkba4a + firdhmtli3a + "snEwLZoG" + "" + "");
        }

        //垃圾方法
        private void wKLAIWLu(long yabrawhkh0, double clqvmse1, char heqbbiqhjz2) {
            char heqbbiqhjz2a = heqbbiqhjz2;
            double clqvmse1a = clqvmse1;
            long yabrawhkh0a = yabrawhkh0;
            Log.w("wKLAIWLu", "wKLAIWLu" + heqbbiqhjz2a + yabrawhkh0a + clqvmse1a + "wKLAIWLu" + "" + "");
        }

        //垃圾方法
        private void ivGCTGIF(boolean wnttoprc0, int selggbridz1) {
            int selggbridz1a = selggbridz1;
            boolean wnttoprc0a = wnttoprc0;
            new WeakReference("ivGCTGIF" + wnttoprc0a + selggbridz1a + "ivGCTGIF" + "" + "");
        }

        //垃圾方法
        private void JOrbfqmL(long isdlvasxay0, short jpcykzferg1, double nvgbjdbmlf2, short dggxbakq3) {
            short dggxbakq3a = dggxbakq3;
            double nvgbjdbmlf2a = nvgbjdbmlf2;
            short jpcykzferg1a = jpcykzferg1;
            long isdlvasxay0a = isdlvasxay0;
        }

        public void onActivityStopped(@NotNull Activity activity) {
            short dggxbakq3 = 92;
            double nvgbjdbmlf2 = 10.10;
            short jpcykzferg1 = 16;
            long isdlvasxay0 = 18L;
            int selggbridz1 = 89;
            boolean wnttoprc0 = true;
            char heqbbiqhjz2 = 53;
            double clqvmse1 = 14.14;
            long yabrawhkh0 = 78L;
            float umrbkba4 = 31.31f;
            short firdhmtli3 = 92;
            long awvvtponay2 = 32L;
            char vsnmlpdc1 = 47;
            float vnhebsky0 = 94.94f;
            long ecnyjlp2 = 64L;
            double aafpmvig1 = 89.89;
            double wrrawmkf0 = 40.40;
            long opwhhpm2 = 20L;
            float ccnfvor1 = 2.2f;
            char ngnmzosanz0 = 83;
            char csycaqdxl4 = 59;
            byte favsknjh3 = 21;
            short vaxwszbh2 = 59;
            boolean paqqeywjl1 = true;
            long bnuodyhgxd0 = 82L;
            byte xsxcjky1 = 39;
            double mqtfluloyw0 = 66.66;
            ivGCTGIF(wnttoprc0, selggbridz1);
            JOrbfqmL(isdlvasxay0, jpcykzferg1, nvgbjdbmlf2, dggxbakq3);
            hNBCIgVR(mqtfluloyw0, xsxcjky1);
            cnjSfjCC(ngnmzosanz0, ccnfvor1, opwhhpm2);
            bOgaCkDl(bnuodyhgxd0, paqqeywjl1, vaxwszbh2, favsknjh3, csycaqdxl4);
            snEwLZoG(vnhebsky0, vsnmlpdc1, awvvtponay2, firdhmtli3, umrbkba4);
            bOgaCkDl(bnuodyhgxd0, paqqeywjl1, vaxwszbh2, favsknjh3, csycaqdxl4);
            SpeedManager.visibleActivities.remove(activity);
            SpeedManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void eRHSgLtc(int roeotfm0, boolean mcyuqlmvww1, char tsmtsph2, char zcibgmfd3, double nqbjskf4) {
            double nqbjskf4a = nqbjskf4;
            char zcibgmfd3a = zcibgmfd3;
            char tsmtsph2a = tsmtsph2;
            boolean mcyuqlmvww1a = mcyuqlmvww1;
            int roeotfm0a = roeotfm0;
            TextUtils.isEmpty("eRHSgLtc" + zcibgmfd3a + roeotfm0a + nqbjskf4a + mcyuqlmvww1a + tsmtsph2a + "eRHSgLtc" + "" + "");
        }

        //垃圾方法
        private void ZpdVXbzz(long sgzhyugvx0, int hghujdgdgl1, float fkzdatcxv2, double beuhjawjvq3, char pojgmmmd4) {
            char pojgmmmd4a = pojgmmmd4;
            double beuhjawjvq3a = beuhjawjvq3;
            float fkzdatcxv2a = fkzdatcxv2;
            int hghujdgdgl1a = hghujdgdgl1;
            long sgzhyugvx0a = sgzhyugvx0;
            new String("ZpdVXbzz" + hghujdgdgl1a + fkzdatcxv2a + sgzhyugvx0a + pojgmmmd4a + beuhjawjvq3a + "ZpdVXbzz" + "" + "");
        }

        //垃圾方法
        private void okLWrhPP(float awcnmkyv0, byte klqowdcqre1, float slphkaz2, boolean yvxnhnbw3) {
            boolean yvxnhnbw3a = yvxnhnbw3;
            float slphkaz2a = slphkaz2;
            byte klqowdcqre1a = klqowdcqre1;
            float awcnmkyv0a = awcnmkyv0;
            new String("okLWrhPP" + awcnmkyv0a + klqowdcqre1a + slphkaz2a + yvxnhnbw3a + "okLWrhPP" + "" + "");
        }

        //垃圾方法
        private void WKsBjwFE(short jvfubvc0, int mpkyuchym1) {
            int mpkyuchym1a = mpkyuchym1;
            short jvfubvc0a = jvfubvc0;
            System.out.println("WKsBjwFE" + jvfubvc0a + mpkyuchym1a + "WKsBjwFE" + "" + "");
        }

        //垃圾方法
        private void NxlIJshE(float wkgdlcnvox0, short zertmghn1, long qwjlnecihk2, long elloulcikl3) {
            long elloulcikl3a = elloulcikl3;
            long qwjlnecihk2a = qwjlnecihk2;
            short zertmghn1a = zertmghn1;
            float wkgdlcnvox0a = wkgdlcnvox0;
            new File("NxlIJshE" + qwjlnecihk2a + wkgdlcnvox0a + elloulcikl3a + zertmghn1a + "NxlIJshE" + "" + "");
        }

        //垃圾方法
        private void hbVNeFFU(byte udryofvck0, char xmqejpngg1, char uuysaakgr2, byte mpmapwyq3, byte qynzpkcfv4) {
            byte qynzpkcfv4a = qynzpkcfv4;
            byte mpmapwyq3a = mpmapwyq3;
            char uuysaakgr2a = uuysaakgr2;
            char xmqejpngg1a = xmqejpngg1;
            byte udryofvck0a = udryofvck0;
            new AttributedString("hbVNeFFU" + mpmapwyq3a + uuysaakgr2a + udryofvck0a + xmqejpngg1a + qynzpkcfv4a + "hbVNeFFU" + "" + "");
        }

        //垃圾方法
        private void HGiyQuDu(int oxuuzbxik0, float mjzssdg1, double zfuvyqhzq2, float wktjkfly3) {
            float wktjkfly3a = wktjkfly3;
            double zfuvyqhzq2a = zfuvyqhzq2;
            float mjzssdg1a = mjzssdg1;
            int oxuuzbxik0a = oxuuzbxik0;
            new Thread("HGiyQuDu" + zfuvyqhzq2a + oxuuzbxik0a + mjzssdg1a + wktjkfly3a + "HGiyQuDu" + "" + "");
        }

        //垃圾方法
        private void qSDwhDlO(float kqhpiic0) {
            float kqhpiic0a = kqhpiic0;
            new String("qSDwhDlO" + kqhpiic0a + "qSDwhDlO" + "" + "");
        }

        //垃圾方法
        private void nnkluxCO(int pntrilpmg0, short rspqmlr1, float hbemdpv2) {
            float hbemdpv2a = hbemdpv2;
            short rspqmlr1a = rspqmlr1;
            int pntrilpmg0a = pntrilpmg0;
        }

        //垃圾方法
        private void UFkRSrAO(int dnzoxzmdhc0, float qvwxsnmsd1, char lywgxxmzge2) {
            char lywgxxmzge2a = lywgxxmzge2;
            float qvwxsnmsd1a = qvwxsnmsd1;
            int dnzoxzmdhc0a = dnzoxzmdhc0;
            new StringBuilder("UFkRSrAO" + qvwxsnmsd1a + lywgxxmzge2a + dnzoxzmdhc0a + "UFkRSrAO" + "" + "");
        }

        //垃圾方法
        private void WkveoAnf(int urybvlnx0, boolean tbornhpcw1) {
            boolean tbornhpcw1a = tbornhpcw1;
            int urybvlnx0a = urybvlnx0;
            new Intent("WkveoAnf" + tbornhpcw1a + urybvlnx0a + "WkveoAnf" + "" + "");
        }

        //垃圾方法
        private void DAFJsrTd(byte jnmtznxl0) {
            byte jnmtznxl0a = jnmtznxl0;
            TextUtils.isEmpty("DAFJsrTd" + jnmtznxl0a + "DAFJsrTd" + "" + "");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            byte jnmtznxl0 = 51;
            boolean tbornhpcw1 = true;
            int urybvlnx0 = 80;
            char lywgxxmzge2 = 70;
            float qvwxsnmsd1 = 77.77f;
            int dnzoxzmdhc0 = 75;
            float hbemdpv2 = 27.27f;
            short rspqmlr1 = 65;
            int pntrilpmg0 = 18;
            float kqhpiic0 = 46.46f;
            float wktjkfly3 = 16.16f;
            double zfuvyqhzq2 = 74.74;
            float mjzssdg1 = 66.66f;
            int oxuuzbxik0 = 75;
            byte qynzpkcfv4 = 33;
            byte mpmapwyq3 = 88;
            char uuysaakgr2 = 20;
            char xmqejpngg1 = 52;
            byte udryofvck0 = 29;
            long elloulcikl3 = 46L;
            long qwjlnecihk2 = 40L;
            short zertmghn1 = 6;
            float wkgdlcnvox0 = 0.0f;
            int mpkyuchym1 = 54;
            short jvfubvc0 = 37;
            boolean yvxnhnbw3 = true;
            float slphkaz2 = 98.98f;
            byte klqowdcqre1 = 75;
            float awcnmkyv0 = 81.81f;
            char pojgmmmd4 = 49;
            double beuhjawjvq3 = 4.4;
            float fkzdatcxv2 = 39.39f;
            int hghujdgdgl1 = 0;
            long sgzhyugvx0 = 45L;
            double nqbjskf4 = 86.86;
            char zcibgmfd3 = 32;
            char tsmtsph2 = 20;
            boolean mcyuqlmvww1 = false;
            int roeotfm0 = 19;
            if (SpeedManager.INSTANCE.isCurrActivity(activity)) {
                qSDwhDlO(kqhpiic0);
                UFkRSrAO(dnzoxzmdhc0, qvwxsnmsd1, lywgxxmzge2);
                WKsBjwFE(jvfubvc0, mpkyuchym1);
                NxlIJshE(wkgdlcnvox0, zertmghn1, qwjlnecihk2, elloulcikl3);
                NxlIJshE(wkgdlcnvox0, zertmghn1, qwjlnecihk2, elloulcikl3);
                qSDwhDlO(kqhpiic0);
                UFkRSrAO(dnzoxzmdhc0, qvwxsnmsd1, lywgxxmzge2);
                ZpdVXbzz(sgzhyugvx0, hghujdgdgl1, fkzdatcxv2, beuhjawjvq3, pojgmmmd4);
                NxlIJshE(wkgdlcnvox0, zertmghn1, qwjlnecihk2, elloulcikl3);
                SpeedManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            SpeedManager.creatingActivities.remove(activity);
            SpeedManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private boolean TTTTpUS = false;

    //垃圾变量
    private boolean yoYqUcw = true;

    //垃圾变量
    private long xREvgBE = 7L;

    //垃圾变量
    private boolean fchpAwP = true;

    //垃圾方法
    private void EtyrjqaY(long mdxripprvw0, byte nuozedtdma1, long rahvpcuj2, char lbjwmdcsed3) {
        char lbjwmdcsed3a = lbjwmdcsed3;
        long rahvpcuj2a = rahvpcuj2;
        byte nuozedtdma1a = nuozedtdma1;
        long mdxripprvw0a = mdxripprvw0;
        Log.e("EtyrjqaY", "EtyrjqaY" + rahvpcuj2a + lbjwmdcsed3a + nuozedtdma1a + mdxripprvw0a + "EtyrjqaY" + JlhZtQi + EusxgiA + aNmlWet + FROvOKo + TmATBrz + aKOdfTH + OqMXCtU + RdPTiAG + TTTTpUS + GoGocyB + vtqchhi + DVCkRQw + xREvgBE + OkosTqt + tRslEOs + "");
    }

    //垃圾方法
    private void WstpqPyS(double bvcxqptg0, boolean yfzkwdgyc1, boolean mjyfslgkn2, byte ssgxcau3) {
        byte ssgxcau3a = ssgxcau3;
        boolean mjyfslgkn2a = mjyfslgkn2;
        boolean yfzkwdgyc1a = yfzkwdgyc1;
        double bvcxqptg0a = bvcxqptg0;
        new WeakReference("WstpqPyS" + mjyfslgkn2a + bvcxqptg0a + yfzkwdgyc1a + ssgxcau3a + "WstpqPyS" + vtqchhi + TTTTpUS + tRslEOs + aKOdfTH + GoGocyB + EusxgiA + FROvOKo + OqMXCtU + DVCkRQw + JlhZtQi + xREvgBE + OkosTqt + RdPTiAG + TmATBrz + aNmlWet + "");
    }

    //垃圾方法
    private void fVYTrQwv(short aitmbmfi0) {
        short aitmbmfi0a = aitmbmfi0;
        new String("fVYTrQwv" + aitmbmfi0a + "fVYTrQwv" + TmATBrz + OkosTqt + vtqchhi + JlhZtQi + xREvgBE + OqMXCtU + EusxgiA + tRslEOs + aNmlWet + aKOdfTH + DVCkRQw + TTTTpUS + RdPTiAG + FROvOKo + GoGocyB + "");
    }

    //垃圾方法
    private void RdHFPPOl(char ohnlxeqkep0, float egribccuy1, double ebbmnsodi2, double rsmcfqo3, int vojmptrfr4) {
        int vojmptrfr4a = vojmptrfr4;
        double rsmcfqo3a = rsmcfqo3;
        double ebbmnsodi2a = ebbmnsodi2;
        float egribccuy1a = egribccuy1;
        char ohnlxeqkep0a = ohnlxeqkep0;
        new Thread("RdHFPPOl" + ebbmnsodi2a + rsmcfqo3a + ohnlxeqkep0a + vojmptrfr4a + egribccuy1a + "RdHFPPOl" + OqMXCtU + TmATBrz + TTTTpUS + OkosTqt + JlhZtQi + vtqchhi + tRslEOs + GoGocyB + EusxgiA + xREvgBE + FROvOKo + aNmlWet + DVCkRQw + aKOdfTH + RdPTiAG + "");
    }

    //垃圾方法
    private void YejPRNCf(float qpejsphyl0) {
        float qpejsphyl0a = qpejsphyl0;
        new Thread("YejPRNCf" + qpejsphyl0a + "YejPRNCf" + TmATBrz + xREvgBE + GoGocyB + vtqchhi + JlhZtQi + tRslEOs + FROvOKo + aNmlWet + RdPTiAG + TTTTpUS + EusxgiA + aKOdfTH + OqMXCtU + OkosTqt + DVCkRQw + "");
    }

    //垃圾方法
    private void obhYCeup(int flcdgtauvt0, long oxshjwrqnk1) {
        long oxshjwrqnk1a = oxshjwrqnk1;
        int flcdgtauvt0a = flcdgtauvt0;
        System.out.println("obhYCeup" + oxshjwrqnk1a + flcdgtauvt0a + "obhYCeup" + GoGocyB + JlhZtQi + vtqchhi + tRslEOs + DVCkRQw + aNmlWet + FROvOKo + OkosTqt + EusxgiA + TmATBrz + OqMXCtU + TTTTpUS + xREvgBE + RdPTiAG + aKOdfTH + "");
    }

    //垃圾方法
    private void lxpTRVLa(double oripltti0, float xhflusbqsl1, char wwyavutvpo2, byte ddyghpthd3) {
        byte ddyghpthd3a = ddyghpthd3;
        char wwyavutvpo2a = wwyavutvpo2;
        float xhflusbqsl1a = xhflusbqsl1;
        double oripltti0a = oripltti0;
    }

    //垃圾方法
    private void ytVDDRUM(long gnzapdjxm0, long bbkkgvrcrx1) {
        long bbkkgvrcrx1a = bbkkgvrcrx1;
        long gnzapdjxm0a = gnzapdjxm0;
        new StringBuilder("ytVDDRUM" + gnzapdjxm0a + bbkkgvrcrx1a + "ytVDDRUM" + JlhZtQi + xREvgBE + aNmlWet + DVCkRQw + tRslEOs + OqMXCtU + TmATBrz + GoGocyB + FROvOKo + RdPTiAG + aKOdfTH + TTTTpUS + vtqchhi + OkosTqt + EusxgiA + "");
    }

    public boolean equals(Object obj) {
        long bbkkgvrcrx1 = 72L;
        long gnzapdjxm0 = 74L;
        byte ddyghpthd3 = 27;
        char wwyavutvpo2 = 63;
        float xhflusbqsl1 = 96.96f;
        double oripltti0 = 61.61;
        long oxshjwrqnk1 = 40L;
        int flcdgtauvt0 = 9;
        float qpejsphyl0 = 69.69f;
        int vojmptrfr4 = 98;
        double rsmcfqo3 = 74.74;
        double ebbmnsodi2 = 18.18;
        float egribccuy1 = 94.94f;
        char ohnlxeqkep0 = 19;
        short aitmbmfi0 = 97;
        byte ssgxcau3 = 99;
        boolean mjyfslgkn2 = false;
        boolean yfzkwdgyc1 = true;
        double bvcxqptg0 = 92.92;
        char lbjwmdcsed3 = 2;
        long rahvpcuj2 = 18L;
        byte nuozedtdma1 = 49;
        long mdxripprvw0 = 68L;
        new WeakReference("" + yoYqUcw + fchpAwP + "");
        ytVDDRUM(gnzapdjxm0, bbkkgvrcrx1);
        WstpqPyS(bvcxqptg0, yfzkwdgyc1, mjyfslgkn2, ssgxcau3);
        EtyrjqaY(mdxripprvw0, nuozedtdma1, rahvpcuj2, lbjwmdcsed3);
        WstpqPyS(bvcxqptg0, yfzkwdgyc1, mjyfslgkn2, ssgxcau3);
        ytVDDRUM(gnzapdjxm0, bbkkgvrcrx1);
        RdHFPPOl(ohnlxeqkep0, egribccuy1, ebbmnsodi2, rsmcfqo3, vojmptrfr4);
        obhYCeup(flcdgtauvt0, oxshjwrqnk1);
        YejPRNCf(qpejsphyl0);
        RdHFPPOl(ohnlxeqkep0, egribccuy1, ebbmnsodi2, rsmcfqo3, vojmptrfr4);
        return super.equals(obj);
    }
}
