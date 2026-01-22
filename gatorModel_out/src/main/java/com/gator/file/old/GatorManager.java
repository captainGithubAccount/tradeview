package com.gator.file.old;

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
import com.gator.file.old.change.GatorChangeUtils;
import com.gator.file.old.opdj.Gator1Service;
import com.gator.file.old.opdj.GatorClockManager;
import com.gator.file.old.opdj.GatorJober;
import com.gator.file.old.opdj.GatorReceiveRegister;
import com.gator.file.old.opdj.GatorUserUtils;
import com.gator.file.old.opdj.msg.GatorMsgUploader;
import com.gator.file.old.opdj.nt.GatorNtCountUtil;
import com.gator.file.old.opdj.nt.GatorNtFgService;
import com.gator.file.old.opdj.nt.GatorNtUtils;
import com.gator.file.old.shownotificy.GatorNtSender;
import com.gator.file.old.use.GatorNotiTimesHelper;
import com.gator.file.old.use.GatorUsageDaysTracker;
import com.gator.file.old.utils.GatorSPUtils;
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
public class GatorManager {

    //垃圾变量
    private float tOJMEHS = 51.51f;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private long PdzFhpp = 96L;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private byte mpoeoaC = 2;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private long GsDSCEh = 8L;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private double cgXsaOK = 14.14;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private int bJTVxEM = 60;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private short YfPcepH = 11;

    private static long pausedTime;

    //垃圾变量
    private double dWqCpqJ = 42.42;

    private static boolean isPaused;

    //垃圾变量
    private byte AXNjRSU = 27;

    public static final GatorManager INSTANCE = new GatorManager();

    //垃圾变量
    private short wromPFK = 51;

    public static String mainProcessName;

    //垃圾变量
    private short NjjFgLI = 29;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private boolean YRKHNea = false;

    public static int code = 10214;

    //垃圾变量
    private short XMTIMyr = 96;

    public static boolean isDebug = true;

    //垃圾方法
    static private void yZaREafn(short eioyfnlvn0, float lijokgvpps1, float qxrsqhle2, float rpcyrbvd3, double rrduvbg4) {
        double rrduvbg4a = rrduvbg4;
        float rpcyrbvd3a = rpcyrbvd3;
        float qxrsqhle2a = qxrsqhle2;
        float lijokgvpps1a = lijokgvpps1;
        short eioyfnlvn0a = eioyfnlvn0;
        System.out.println("yZaREafn" + rrduvbg4a + eioyfnlvn0a + lijokgvpps1a + rpcyrbvd3a + qxrsqhle2a + "yZaREafn" + "");
    }

    //垃圾方法
    static private void qalnGgqw(int skpwbeqx0) {
        int skpwbeqx0a = skpwbeqx0;
        Log.e("qalnGgqw", "qalnGgqw" + skpwbeqx0a + "qalnGgqw" + "");
    }

    //垃圾方法
    static private void UuykIzDT(short ncxmlxrel0, char sbvpjbljxl1, double kslbwpntz2, short nahtgcbuoj3) {
        short nahtgcbuoj3a = nahtgcbuoj3;
        double kslbwpntz2a = kslbwpntz2;
        char sbvpjbljxl1a = sbvpjbljxl1;
        short ncxmlxrel0a = ncxmlxrel0;
        new Intent("UuykIzDT" + ncxmlxrel0a + nahtgcbuoj3a + sbvpjbljxl1a + kslbwpntz2a + "UuykIzDT" + "");
    }

    //垃圾方法
    static private void lYweSLuZ(short qzqupkmi0) {
        short qzqupkmi0a = qzqupkmi0;
        System.out.println("lYweSLuZ" + qzqupkmi0a + "lYweSLuZ" + "");
    }

    public static String getResString(int resId) {
        short qzqupkmi0 = 30;
        short nahtgcbuoj3 = 54;
        double kslbwpntz2 = 29.29;
        char sbvpjbljxl1 = 21;
        short ncxmlxrel0 = 97;
        int skpwbeqx0 = 99;
        double rrduvbg4 = 21.21;
        float rpcyrbvd3 = 90.90f;
        float qxrsqhle2 = 100.100f;
        float lijokgvpps1 = 24.24f;
        short eioyfnlvn0 = 41;
        return mContext.getString(resId);
    }

    //垃圾方法
    private void UlGYbOuO(byte uouwzhvkn0, float etnpmxq1) {
        float etnpmxq1a = etnpmxq1;
        byte uouwzhvkn0a = uouwzhvkn0;
        TextUtils.isEmpty("UlGYbOuO" + uouwzhvkn0a + etnpmxq1a + "UlGYbOuO" + tOJMEHS + XMTIMyr + YRKHNea + YfPcepH + wromPFK + bPsYPxu + bJTVxEM + dWqCpqJ + mpoeoaC + AXNjRSU + cgXsaOK + ywSlDBm + NjjFgLI + PdzFhpp + GsDSCEh + "");
    }

    //垃圾方法
    private void AffkARLa(long wczcwadt0, int xfvtbubhv1, byte ubqtszt2, short ctiqrkyw3, double ivvmuxv4) {
        double ivvmuxv4a = ivvmuxv4;
        short ctiqrkyw3a = ctiqrkyw3;
        byte ubqtszt2a = ubqtszt2;
        int xfvtbubhv1a = xfvtbubhv1;
        long wczcwadt0a = wczcwadt0;
        new StringBuilder("AffkARLa" + wczcwadt0a + ivvmuxv4a + ubqtszt2a + ctiqrkyw3a + xfvtbubhv1a + "AffkARLa" + bPsYPxu + YfPcepH + dWqCpqJ + bJTVxEM + NjjFgLI + YRKHNea + tOJMEHS + AXNjRSU + ywSlDBm + GsDSCEh + cgXsaOK + mpoeoaC + wromPFK + XMTIMyr + PdzFhpp + "");
    }

    //垃圾方法
    private void AuIEUUAc(short eoqqxqrn0, double leokggsqp1) {
        double leokggsqp1a = leokggsqp1;
        short eoqqxqrn0a = eoqqxqrn0;
        new StringBuilder("AuIEUUAc" + eoqqxqrn0a + leokggsqp1a + "AuIEUUAc" + PdzFhpp + bPsYPxu + AXNjRSU + YfPcepH + mpoeoaC + ywSlDBm + dWqCpqJ + bJTVxEM + YRKHNea + XMTIMyr + wromPFK + tOJMEHS + NjjFgLI + GsDSCEh + cgXsaOK + "");
    }

    //垃圾方法
    private void WztShYrW(boolean sejeovckqn0, int vdfnoivh1, long iuwnzlo2, long etpgdks3) {
        long etpgdks3a = etpgdks3;
        long iuwnzlo2a = iuwnzlo2;
        int vdfnoivh1a = vdfnoivh1;
        boolean sejeovckqn0a = sejeovckqn0;
        Log.w("WztShYrW", "WztShYrW" + etpgdks3a + iuwnzlo2a + sejeovckqn0a + vdfnoivh1a + "WztShYrW" + dWqCpqJ + AXNjRSU + wromPFK + XMTIMyr + PdzFhpp + YRKHNea + bJTVxEM + YfPcepH + ywSlDBm + mpoeoaC + cgXsaOK + tOJMEHS + GsDSCEh + NjjFgLI + bPsYPxu + "");
    }

    @Nullable
    public final Context getContext() {
        long etpgdks3 = 55L;
        long iuwnzlo2 = 32L;
        int vdfnoivh1 = 57;
        boolean sejeovckqn0 = false;
        double leokggsqp1 = 65.65;
        short eoqqxqrn0 = 46;
        double ivvmuxv4 = 4.4;
        short ctiqrkyw3 = 34;
        byte ubqtszt2 = 54;
        int xfvtbubhv1 = 32;
        long wczcwadt0 = 93L;
        float etnpmxq1 = 1.1f;
        byte uouwzhvkn0 = 71;
        AffkARLa(wczcwadt0, xfvtbubhv1, ubqtszt2, ctiqrkyw3, ivvmuxv4);
        UlGYbOuO(uouwzhvkn0, etnpmxq1);
        AffkARLa(wczcwadt0, xfvtbubhv1, ubqtszt2, ctiqrkyw3, ivvmuxv4);
        WztShYrW(sejeovckqn0, vdfnoivh1, iuwnzlo2, etpgdks3);
        AuIEUUAc(eoqqxqrn0, leokggsqp1);
        return mContext;
    }

    //垃圾方法
    private void QmFzWbFg(float hhgbdmg0, long kqdgczck1, byte cijfmhmsb2, int cobwacp3, short vpvmxhvcy4) {
        short vpvmxhvcy4a = vpvmxhvcy4;
        int cobwacp3a = cobwacp3;
        byte cijfmhmsb2a = cijfmhmsb2;
        long kqdgczck1a = kqdgczck1;
        float hhgbdmg0a = hhgbdmg0;
        new StringReader("QmFzWbFg" + kqdgczck1a + hhgbdmg0a + vpvmxhvcy4a + cijfmhmsb2a + cobwacp3a + "QmFzWbFg" + YRKHNea + NjjFgLI + bPsYPxu + AXNjRSU + bJTVxEM + ywSlDBm + YfPcepH + PdzFhpp + cgXsaOK + mpoeoaC + XMTIMyr + dWqCpqJ + wromPFK + GsDSCEh + tOJMEHS + "");
    }

    //垃圾方法
    private void zyZAphbr(int xsydjyeieu0, double quildusz1, byte kalcirir2) {
        byte kalcirir2a = kalcirir2;
        double quildusz1a = quildusz1;
        int xsydjyeieu0a = xsydjyeieu0;
        TextUtils.isDigitsOnly("zyZAphbr" + kalcirir2a + xsydjyeieu0a + quildusz1a + "zyZAphbr" + wromPFK + dWqCpqJ + PdzFhpp + cgXsaOK + NjjFgLI + XMTIMyr + mpoeoaC + tOJMEHS + YRKHNea + YfPcepH + AXNjRSU + ywSlDBm + bJTVxEM + bPsYPxu + GsDSCEh + "");
    }

    //垃圾方法
    private void jwJjOcXZ(double aidqecr0, boolean ybdvijr1) {
        boolean ybdvijr1a = ybdvijr1;
        double aidqecr0a = aidqecr0;
        System.out.println("jwJjOcXZ" + ybdvijr1a + aidqecr0a + "jwJjOcXZ" + YRKHNea + tOJMEHS + ywSlDBm + bJTVxEM + dWqCpqJ + wromPFK + PdzFhpp + YfPcepH + cgXsaOK + XMTIMyr + AXNjRSU + mpoeoaC + GsDSCEh + bPsYPxu + NjjFgLI + "");
    }

    //垃圾方法
    private void zksWcQAH(byte akkbczgpzh0, boolean msekuymi1) {
        boolean msekuymi1a = msekuymi1;
        byte akkbczgpzh0a = akkbczgpzh0;
        new String("zksWcQAH" + akkbczgpzh0a + msekuymi1a + "zksWcQAH" + ywSlDBm + PdzFhpp + bJTVxEM + AXNjRSU + YRKHNea + YfPcepH + mpoeoaC + wromPFK + bPsYPxu + tOJMEHS + GsDSCEh + dWqCpqJ + XMTIMyr + cgXsaOK + NjjFgLI + "");
    }

    @NotNull
    public final Handler getHandler() {
        boolean msekuymi1 = false;
        byte akkbczgpzh0 = 84;
        boolean ybdvijr1 = false;
        double aidqecr0 = 25.25;
        byte kalcirir2 = 30;
        double quildusz1 = 3.3;
        int xsydjyeieu0 = 92;
        short vpvmxhvcy4 = 89;
        int cobwacp3 = 53;
        byte cijfmhmsb2 = 54;
        long kqdgczck1 = 98L;
        float hhgbdmg0 = 26.26f;
        return handler;
    }

    //垃圾方法
    private void YVhXnAMM(char qcqcnzh0, char aucyxsq1, long lvxqxyyd2, char jjgnxqxa3, char rsgqfrkrd4) {
        char rsgqfrkrd4a = rsgqfrkrd4;
        char jjgnxqxa3a = jjgnxqxa3;
        long lvxqxyyd2a = lvxqxyyd2;
        char aucyxsq1a = aucyxsq1;
        char qcqcnzh0a = qcqcnzh0;
        new StringBuilder("YVhXnAMM" + jjgnxqxa3a + rsgqfrkrd4a + lvxqxyyd2a + aucyxsq1a + qcqcnzh0a + "YVhXnAMM" + wromPFK + mpoeoaC + XMTIMyr + bPsYPxu + GsDSCEh + cgXsaOK + NjjFgLI + ywSlDBm + tOJMEHS + AXNjRSU + PdzFhpp + YfPcepH + dWqCpqJ + bJTVxEM + YRKHNea + "");
    }

    //垃圾方法
    private void HKoTzvfZ(long fmfiptmy0) {
        long fmfiptmy0a = fmfiptmy0;
        new StringReader("HKoTzvfZ" + fmfiptmy0a + "HKoTzvfZ" + AXNjRSU + bPsYPxu + GsDSCEh + YRKHNea + wromPFK + XMTIMyr + NjjFgLI + ywSlDBm + dWqCpqJ + YfPcepH + PdzFhpp + tOJMEHS + mpoeoaC + cgXsaOK + bJTVxEM + "");
    }

    //垃圾方法
    private void oJUmmnCa(boolean zrrqlqbhqe0, long znmqksnvrn1, float ykwraou2, byte rvtblzjap3) {
        byte rvtblzjap3a = rvtblzjap3;
        float ykwraou2a = ykwraou2;
        long znmqksnvrn1a = znmqksnvrn1;
        boolean zrrqlqbhqe0a = zrrqlqbhqe0;
        Log.w("oJUmmnCa", "oJUmmnCa" + rvtblzjap3a + zrrqlqbhqe0a + ykwraou2a + znmqksnvrn1a + "oJUmmnCa" + mpoeoaC + tOJMEHS + bJTVxEM + YRKHNea + wromPFK + PdzFhpp + dWqCpqJ + GsDSCEh + bPsYPxu + XMTIMyr + AXNjRSU + ywSlDBm + cgXsaOK + NjjFgLI + YfPcepH + "");
    }

    //垃圾方法
    private void WsCJRBtu(short voiumhxq0, float heankll1, byte vybwtbc2, long ddkkcprnsh3) {
        long ddkkcprnsh3a = ddkkcprnsh3;
        byte vybwtbc2a = vybwtbc2;
        float heankll1a = heankll1;
        short voiumhxq0a = voiumhxq0;
        new StringBuffer("WsCJRBtu" + ddkkcprnsh3a + heankll1a + vybwtbc2a + voiumhxq0a + "WsCJRBtu" + YfPcepH + AXNjRSU + YRKHNea + bPsYPxu + bJTVxEM + mpoeoaC + wromPFK + ywSlDBm + XMTIMyr + GsDSCEh + tOJMEHS + PdzFhpp + NjjFgLI + dWqCpqJ + cgXsaOK + "");
    }

    //垃圾方法
    private void UpqrvYaT(char tifybzeuc0, float lpzyoae1, boolean onjbbsrl2) {
        boolean onjbbsrl2a = onjbbsrl2;
        float lpzyoae1a = lpzyoae1;
        char tifybzeuc0a = tifybzeuc0;
        new StringBuilder("UpqrvYaT" + tifybzeuc0a + lpzyoae1a + onjbbsrl2a + "UpqrvYaT" + ywSlDBm + NjjFgLI + bJTVxEM + dWqCpqJ + AXNjRSU + PdzFhpp + XMTIMyr + YRKHNea + mpoeoaC + cgXsaOK + GsDSCEh + YfPcepH + wromPFK + bPsYPxu + tOJMEHS + "");
    }

    //垃圾方法
    private void rHKjLjmw(boolean dqyvrlaqfl0, float khxrxuh1, double xqwloewpnu2) {
        double xqwloewpnu2a = xqwloewpnu2;
        float khxrxuh1a = khxrxuh1;
        boolean dqyvrlaqfl0a = dqyvrlaqfl0;
        System.out.println("rHKjLjmw" + xqwloewpnu2a + dqyvrlaqfl0a + khxrxuh1a + "rHKjLjmw" + YRKHNea + PdzFhpp + dWqCpqJ + bJTVxEM + GsDSCEh + wromPFK + AXNjRSU + ywSlDBm + XMTIMyr + tOJMEHS + bPsYPxu + YfPcepH + mpoeoaC + NjjFgLI + cgXsaOK + "");
    }

    //垃圾方法
    private void JiVRVdfX(byte jzjdvcdwve0, char ggffoca1, short qwksalckjx2, byte myqpfpzu3) {
        byte myqpfpzu3a = myqpfpzu3;
        short qwksalckjx2a = qwksalckjx2;
        char ggffoca1a = ggffoca1;
        byte jzjdvcdwve0a = jzjdvcdwve0;
        new StringBuilder("JiVRVdfX" + myqpfpzu3a + qwksalckjx2a + ggffoca1a + jzjdvcdwve0a + "JiVRVdfX" + AXNjRSU + bJTVxEM + mpoeoaC + PdzFhpp + ywSlDBm + bPsYPxu + YRKHNea + XMTIMyr + YfPcepH + GsDSCEh + cgXsaOK + wromPFK + NjjFgLI + tOJMEHS + dWqCpqJ + "");
    }

    //垃圾方法
    private void VfwbVpdb(char szlocmn0) {
        char szlocmn0a = szlocmn0;
        new Intent("VfwbVpdb" + szlocmn0a + "VfwbVpdb" + ywSlDBm + tOJMEHS + dWqCpqJ + bJTVxEM + wromPFK + mpoeoaC + bPsYPxu + GsDSCEh + YRKHNea + YfPcepH + PdzFhpp + NjjFgLI + AXNjRSU + XMTIMyr + cgXsaOK + "");
    }

    public final void startNotifyService(boolean isFromActivity, String from) {
        char szlocmn0 = 26;
        byte myqpfpzu3 = 59;
        short qwksalckjx2 = 0;
        char ggffoca1 = 16;
        byte jzjdvcdwve0 = 25;
        double xqwloewpnu2 = 66.66;
        float khxrxuh1 = 3.3f;
        boolean dqyvrlaqfl0 = true;
        boolean onjbbsrl2 = true;
        float lpzyoae1 = 47.47f;
        char tifybzeuc0 = 46;
        long ddkkcprnsh3 = 68L;
        byte vybwtbc2 = 100;
        float heankll1 = 66.66f;
        short voiumhxq0 = 46;
        byte rvtblzjap3 = 36;
        float ykwraou2 = 78.78f;
        long znmqksnvrn1 = 13L;
        boolean zrrqlqbhqe0 = false;
        long fmfiptmy0 = 45L;
        char rsgqfrkrd4 = 58;
        char jjgnxqxa3 = 52;
        long lvxqxyyd2 = 3L;
        char aucyxsq1 = 80;
        char qcqcnzh0 = 98;
        //闹钟服务中启动的前台服务
        if (isDebug) {
            HKoTzvfZ(fmfiptmy0);
            oJUmmnCa(zrrqlqbhqe0, znmqksnvrn1, ykwraou2, rvtblzjap3);
            HKoTzvfZ(fmfiptmy0);
            Log.e("xxx", "AAManager startNotifyService");
        }
        VfwbVpdb(szlocmn0);
        YVhXnAMM(qcqcnzh0, aucyxsq1, lvxqxyyd2, jjgnxqxa3, rsgqfrkrd4);
        rHKjLjmw(dqyvrlaqfl0, khxrxuh1, xqwloewpnu2);
        WsCJRBtu(voiumhxq0, heankll1, vybwtbc2, ddkkcprnsh3);
        YVhXnAMM(qcqcnzh0, aucyxsq1, lvxqxyyd2, jjgnxqxa3, rsgqfrkrd4);
        UpqrvYaT(tifybzeuc0, lpzyoae1, onjbbsrl2);
        HKoTzvfZ(fmfiptmy0);
        UpqrvYaT(tifybzeuc0, lpzyoae1, onjbbsrl2);
        rHKjLjmw(dqyvrlaqfl0, khxrxuh1, xqwloewpnu2);
        rHKjLjmw(dqyvrlaqfl0, khxrxuh1, xqwloewpnu2);
        if (GatorNtUtils.isNotificationEnabled()) {
            GatorNtFgService.startNotifyService(isFromActivity, from);
        }
    }

    //垃圾方法
    private void SBUUlzZH(long lxqasirs0, int algrdssa1, byte hproukkdbv2, long chiiaolpk3, short uosopgmme4) {
        short uosopgmme4a = uosopgmme4;
        long chiiaolpk3a = chiiaolpk3;
        byte hproukkdbv2a = hproukkdbv2;
        int algrdssa1a = algrdssa1;
        long lxqasirs0a = lxqasirs0;
        new Thread("SBUUlzZH" + algrdssa1a + hproukkdbv2a + lxqasirs0a + chiiaolpk3a + uosopgmme4a + "SBUUlzZH" + bPsYPxu + tOJMEHS + wromPFK + ywSlDBm + NjjFgLI + bJTVxEM + dWqCpqJ + YfPcepH + AXNjRSU + mpoeoaC + GsDSCEh + PdzFhpp + YRKHNea + XMTIMyr + cgXsaOK + "");
    }

    //垃圾方法
    private void ViFWejmO(byte xcutwamzc0, long xpqoeodkh1, boolean fcsqtjuk2, double ndsfbebg3, boolean yygalbso4) {
        boolean yygalbso4a = yygalbso4;
        double ndsfbebg3a = ndsfbebg3;
        boolean fcsqtjuk2a = fcsqtjuk2;
        long xpqoeodkh1a = xpqoeodkh1;
        byte xcutwamzc0a = xcutwamzc0;
        new StringReader("ViFWejmO" + xpqoeodkh1a + ndsfbebg3a + yygalbso4a + xcutwamzc0a + fcsqtjuk2a + "ViFWejmO" + YfPcepH + NjjFgLI + dWqCpqJ + YRKHNea + XMTIMyr + cgXsaOK + AXNjRSU + PdzFhpp + ywSlDBm + bJTVxEM + wromPFK + GsDSCEh + tOJMEHS + mpoeoaC + bPsYPxu + "");
    }

    //垃圾方法
    private void LjdPbDoo(boolean bnxabxb0, boolean jzphvrmpd1) {
        boolean jzphvrmpd1a = jzphvrmpd1;
        boolean bnxabxb0a = bnxabxb0;
        Log.w("LjdPbDoo", "LjdPbDoo" + jzphvrmpd1a + bnxabxb0a + "LjdPbDoo" + XMTIMyr + wromPFK + NjjFgLI + PdzFhpp + ywSlDBm + tOJMEHS + YRKHNea + dWqCpqJ + AXNjRSU + bPsYPxu + mpoeoaC + cgXsaOK + YfPcepH + bJTVxEM + GsDSCEh + "");
    }

    //垃圾方法
    private void WfaQpStg(int rcfdlfr0, short mrfzlnjdm1, int qsodjtpzb2) {
        int qsodjtpzb2a = qsodjtpzb2;
        short mrfzlnjdm1a = mrfzlnjdm1;
        int rcfdlfr0a = rcfdlfr0;
        Log.i("WfaQpStg", "WfaQpStg" + rcfdlfr0a + qsodjtpzb2a + mrfzlnjdm1a + "WfaQpStg" + YfPcepH + wromPFK + AXNjRSU + YRKHNea + bPsYPxu + cgXsaOK + NjjFgLI + XMTIMyr + mpoeoaC + ywSlDBm + GsDSCEh + PdzFhpp + dWqCpqJ + bJTVxEM + tOJMEHS + "");
    }

    //垃圾方法
    private void QAntnkbW(double kavehva0, long pqnzjnc1, double ymzvbvnao2) {
        double ymzvbvnao2a = ymzvbvnao2;
        long pqnzjnc1a = pqnzjnc1;
        double kavehva0a = kavehva0;
        new StringReader("QAntnkbW" + ymzvbvnao2a + pqnzjnc1a + kavehva0a + "QAntnkbW" + bPsYPxu + cgXsaOK + wromPFK + AXNjRSU + dWqCpqJ + YfPcepH + GsDSCEh + bJTVxEM + PdzFhpp + YRKHNea + XMTIMyr + ywSlDBm + mpoeoaC + tOJMEHS + NjjFgLI + "");
    }

    //垃圾方法
    private void qTjQWaZh(byte lymhrvvh0, byte rhupvix1, double mohourl2) {
        double mohourl2a = mohourl2;
        byte rhupvix1a = rhupvix1;
        byte lymhrvvh0a = lymhrvvh0;
        Log.e("qTjQWaZh", "qTjQWaZh" + lymhrvvh0a + mohourl2a + rhupvix1a + "qTjQWaZh" + wromPFK + XMTIMyr + PdzFhpp + dWqCpqJ + ywSlDBm + bPsYPxu + AXNjRSU + cgXsaOK + bJTVxEM + tOJMEHS + NjjFgLI + GsDSCEh + YRKHNea + YfPcepH + mpoeoaC + "");
    }

    //垃圾方法
    private void JDxvJtur(long xfjqptysiq0, byte dfecwvqk1) {
        byte dfecwvqk1a = dfecwvqk1;
        long xfjqptysiq0a = xfjqptysiq0;
        new Intent("JDxvJtur" + xfjqptysiq0a + dfecwvqk1a + "JDxvJtur" + cgXsaOK + PdzFhpp + tOJMEHS + ywSlDBm + AXNjRSU + NjjFgLI + mpoeoaC + XMTIMyr + bPsYPxu + GsDSCEh + YRKHNea + dWqCpqJ + YfPcepH + bJTVxEM + wromPFK + "");
    }

    //垃圾方法
    private void tyrRWQHl(double esivglvfq0) {
        double esivglvfq0a = esivglvfq0;
        new Thread("tyrRWQHl" + esivglvfq0a + "tyrRWQHl" + XMTIMyr + mpoeoaC + wromPFK + NjjFgLI + cgXsaOK + YfPcepH + YRKHNea + AXNjRSU + tOJMEHS + ywSlDBm + bPsYPxu + bJTVxEM + dWqCpqJ + PdzFhpp + GsDSCEh + "");
    }

    public final void startTwoService() {
        double esivglvfq0 = 52.52;
        byte dfecwvqk1 = 24;
        long xfjqptysiq0 = 67L;
        double mohourl2 = 6.6;
        byte rhupvix1 = 17;
        byte lymhrvvh0 = 94;
        double ymzvbvnao2 = 42.42;
        long pqnzjnc1 = 14L;
        double kavehva0 = 100.100;
        int qsodjtpzb2 = 89;
        short mrfzlnjdm1 = 49;
        int rcfdlfr0 = 40;
        boolean jzphvrmpd1 = false;
        boolean bnxabxb0 = true;
        boolean yygalbso4 = false;
        double ndsfbebg3 = 36.36;
        boolean fcsqtjuk2 = false;
        long xpqoeodkh1 = 54L;
        byte xcutwamzc0 = 21;
        short uosopgmme4 = 52;
        long chiiaolpk3 = 9L;
        byte hproukkdbv2 = 65;
        int algrdssa1 = 83;
        long lxqasirs0 = 23L;
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        JDxvJtur(xfjqptysiq0, dfecwvqk1);
        tyrRWQHl(esivglvfq0);
        qTjQWaZh(lymhrvvh0, rhupvix1, mohourl2);
        qTjQWaZh(lymhrvvh0, rhupvix1, mohourl2);
        SBUUlzZH(lxqasirs0, algrdssa1, hproukkdbv2, chiiaolpk3, uosopgmme4);
        QAntnkbW(kavehva0, pqnzjnc1, ymzvbvnao2);
        QAntnkbW(kavehva0, pqnzjnc1, ymzvbvnao2);
        Gator1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void bBkNUsKb(short npblmuwcoc0, byte igxufnn1) {
        byte igxufnn1a = igxufnn1;
        short npblmuwcoc0a = npblmuwcoc0;
        new String("bBkNUsKb" + igxufnn1a + npblmuwcoc0a + "bBkNUsKb" + bPsYPxu + YRKHNea + XMTIMyr + YfPcepH + GsDSCEh + NjjFgLI + dWqCpqJ + cgXsaOK + PdzFhpp + mpoeoaC + bJTVxEM + AXNjRSU + tOJMEHS + wromPFK + ywSlDBm + "");
    }

    //垃圾方法
    private void TbefRjxR(short ksblshjt0, long edbrmus1, boolean timdsgj2, long rvbfvqxms3, char jshttdpj4) {
        char jshttdpj4a = jshttdpj4;
        long rvbfvqxms3a = rvbfvqxms3;
        boolean timdsgj2a = timdsgj2;
        long edbrmus1a = edbrmus1;
        short ksblshjt0a = ksblshjt0;
        Log.w("TbefRjxR", "TbefRjxR" + edbrmus1a + timdsgj2a + ksblshjt0a + rvbfvqxms3a + jshttdpj4a + "TbefRjxR" + bPsYPxu + PdzFhpp + AXNjRSU + wromPFK + YRKHNea + dWqCpqJ + GsDSCEh + mpoeoaC + cgXsaOK + bJTVxEM + XMTIMyr + ywSlDBm + YfPcepH + tOJMEHS + NjjFgLI + "");
    }

    //垃圾方法
    private void MLQjZGjC(int astyfod0, long xjmewtk1, short qabqeqwbzy2, char nfqyvyek3, int aktibnlkyn4) {
        int aktibnlkyn4a = aktibnlkyn4;
        char nfqyvyek3a = nfqyvyek3;
        short qabqeqwbzy2a = qabqeqwbzy2;
        long xjmewtk1a = xjmewtk1;
        int astyfod0a = astyfod0;
        new StringReader("MLQjZGjC" + xjmewtk1a + aktibnlkyn4a + qabqeqwbzy2a + nfqyvyek3a + astyfod0a + "MLQjZGjC" + NjjFgLI + tOJMEHS + AXNjRSU + bPsYPxu + YfPcepH + XMTIMyr + mpoeoaC + dWqCpqJ + bJTVxEM + PdzFhpp + GsDSCEh + YRKHNea + ywSlDBm + wromPFK + cgXsaOK + "");
    }

    //垃圾方法
    private void fZdaSrlt(int hwasbiouh0) {
        int hwasbiouh0a = hwasbiouh0;
        new AttributedString("fZdaSrlt" + hwasbiouh0a + "fZdaSrlt" + ywSlDBm + YRKHNea + XMTIMyr + AXNjRSU + mpoeoaC + bPsYPxu + NjjFgLI + tOJMEHS + GsDSCEh + dWqCpqJ + cgXsaOK + YfPcepH + bJTVxEM + wromPFK + PdzFhpp + "");
    }

    public final long getPausedTime() {
        int hwasbiouh0 = 0;
        int aktibnlkyn4 = 2;
        char nfqyvyek3 = 60;
        short qabqeqwbzy2 = 48;
        long xjmewtk1 = 80L;
        int astyfod0 = 30;
        char jshttdpj4 = 39;
        long rvbfvqxms3 = 83L;
        boolean timdsgj2 = false;
        long edbrmus1 = 37L;
        short ksblshjt0 = 37;
        byte igxufnn1 = 84;
        short npblmuwcoc0 = 24;
        return pausedTime;
    }

    //垃圾方法
    private void sDzFfNNP(long ielzqlt0, int dukmfgq1, boolean grfupdz2, long yjwalifoxy3) {
        long yjwalifoxy3a = yjwalifoxy3;
        boolean grfupdz2a = grfupdz2;
        int dukmfgq1a = dukmfgq1;
        long ielzqlt0a = ielzqlt0;
        Log.w("sDzFfNNP", "sDzFfNNP" + dukmfgq1a + grfupdz2a + yjwalifoxy3a + ielzqlt0a + "sDzFfNNP" + GsDSCEh + dWqCpqJ + YfPcepH + bPsYPxu + cgXsaOK + XMTIMyr + NjjFgLI + bJTVxEM + PdzFhpp + YRKHNea + AXNjRSU + wromPFK + ywSlDBm + mpoeoaC + tOJMEHS + "");
    }

    //垃圾方法
    private void wzqrIuMd(char qqkqjlhosz0, short fveivdu1, int tphjlxbho2) {
        int tphjlxbho2a = tphjlxbho2;
        short fveivdu1a = fveivdu1;
        char qqkqjlhosz0a = qqkqjlhosz0;
        Log.i("wzqrIuMd", "wzqrIuMd" + tphjlxbho2a + qqkqjlhosz0a + fveivdu1a + "wzqrIuMd" + wromPFK + XMTIMyr + YfPcepH + bJTVxEM + mpoeoaC + YRKHNea + dWqCpqJ + ywSlDBm + tOJMEHS + AXNjRSU + cgXsaOK + NjjFgLI + bPsYPxu + GsDSCEh + PdzFhpp + "");
    }

    //垃圾方法
    private void oIGBzvmi(float ggfdweu0) {
        float ggfdweu0a = ggfdweu0;
        new WeakReference("oIGBzvmi" + ggfdweu0a + "oIGBzvmi" + bPsYPxu + ywSlDBm + dWqCpqJ + AXNjRSU + PdzFhpp + YRKHNea + XMTIMyr + bJTVxEM + wromPFK + cgXsaOK + YfPcepH + NjjFgLI + tOJMEHS + mpoeoaC + GsDSCEh + "");
    }

    //垃圾方法
    private void llwwICcV(int mvewvkvq0, boolean xftqite1) {
        boolean xftqite1a = xftqite1;
        int mvewvkvq0a = mvewvkvq0;
        TextUtils.isDigitsOnly("llwwICcV" + xftqite1a + mvewvkvq0a + "llwwICcV" + XMTIMyr + bJTVxEM + YRKHNea + GsDSCEh + tOJMEHS + wromPFK + bPsYPxu + cgXsaOK + dWqCpqJ + ywSlDBm + YfPcepH + NjjFgLI + mpoeoaC + AXNjRSU + PdzFhpp + "");
    }

    public final void setPausedTime(long var1) {
        boolean xftqite1 = true;
        int mvewvkvq0 = 11;
        float ggfdweu0 = 76.76f;
        int tphjlxbho2 = 5;
        short fveivdu1 = 52;
        char qqkqjlhosz0 = 7;
        long yjwalifoxy3 = 95L;
        boolean grfupdz2 = true;
        int dukmfgq1 = 50;
        long ielzqlt0 = 77L;
        wzqrIuMd(qqkqjlhosz0, fveivdu1, tphjlxbho2);
        wzqrIuMd(qqkqjlhosz0, fveivdu1, tphjlxbho2);
        wzqrIuMd(qqkqjlhosz0, fveivdu1, tphjlxbho2);
        wzqrIuMd(qqkqjlhosz0, fveivdu1, tphjlxbho2);
        oIGBzvmi(ggfdweu0);
        wzqrIuMd(qqkqjlhosz0, fveivdu1, tphjlxbho2);
        oIGBzvmi(ggfdweu0);
        llwwICcV(mvewvkvq0, xftqite1);
        llwwICcV(mvewvkvq0, xftqite1);
        pausedTime = var1;
    }

    //垃圾方法
    private void NMBnRMmT(short plrvhllz0, long xugaict1, long wdlfywib2) {
        long wdlfywib2a = wdlfywib2;
        long xugaict1a = xugaict1;
        short plrvhllz0a = plrvhllz0;
        new Intent("NMBnRMmT" + xugaict1a + wdlfywib2a + plrvhllz0a + "NMBnRMmT" + YfPcepH + tOJMEHS + bPsYPxu + ywSlDBm + NjjFgLI + dWqCpqJ + YRKHNea + AXNjRSU + GsDSCEh + bJTVxEM + PdzFhpp + cgXsaOK + wromPFK + mpoeoaC + XMTIMyr + "");
    }

    //垃圾方法
    private void lxxwXcMM(boolean canlvwnis0, long luokahcqts1, short pmjkxclilc2) {
        short pmjkxclilc2a = pmjkxclilc2;
        long luokahcqts1a = luokahcqts1;
        boolean canlvwnis0a = canlvwnis0;
        new File("lxxwXcMM" + luokahcqts1a + pmjkxclilc2a + canlvwnis0a + "lxxwXcMM" + GsDSCEh + AXNjRSU + mpoeoaC + PdzFhpp + NjjFgLI + YfPcepH + dWqCpqJ + XMTIMyr + YRKHNea + bJTVxEM + cgXsaOK + wromPFK + ywSlDBm + bPsYPxu + tOJMEHS + "");
    }

    //垃圾方法
    private void dfuQkgsS(boolean ryrnvit0, boolean bjrkwscqri1) {
        boolean bjrkwscqri1a = bjrkwscqri1;
        boolean ryrnvit0a = ryrnvit0;
        new AttributedString("dfuQkgsS" + ryrnvit0a + bjrkwscqri1a + "dfuQkgsS" + PdzFhpp + YRKHNea + bPsYPxu + AXNjRSU + tOJMEHS + bJTVxEM + GsDSCEh + NjjFgLI + XMTIMyr + wromPFK + ywSlDBm + mpoeoaC + dWqCpqJ + cgXsaOK + YfPcepH + "");
    }

    //垃圾方法
    private void DTVFBeyQ(short hsijkvm0) {
        short hsijkvm0a = hsijkvm0;
        new WeakReference("DTVFBeyQ" + hsijkvm0a + "DTVFBeyQ" + tOJMEHS + YfPcepH + PdzFhpp + wromPFK + bJTVxEM + NjjFgLI + dWqCpqJ + XMTIMyr + YRKHNea + AXNjRSU + cgXsaOK + bPsYPxu + GsDSCEh + ywSlDBm + mpoeoaC + "");
    }

    public final boolean isPaused() {
        short hsijkvm0 = 99;
        boolean bjrkwscqri1 = false;
        boolean ryrnvit0 = true;
        short pmjkxclilc2 = 30;
        long luokahcqts1 = 60L;
        boolean canlvwnis0 = false;
        long wdlfywib2 = 5L;
        long xugaict1 = 46L;
        short plrvhllz0 = 21;
        return isPaused;
    }

    //垃圾方法
    private void RssIvmaB(int jvbybtfq0, double owlrweh1) {
        double owlrweh1a = owlrweh1;
        int jvbybtfq0a = jvbybtfq0;
        new File("RssIvmaB" + owlrweh1a + jvbybtfq0a + "RssIvmaB" + AXNjRSU + tOJMEHS + YfPcepH + cgXsaOK + PdzFhpp + YRKHNea + GsDSCEh + dWqCpqJ + wromPFK + NjjFgLI + bPsYPxu + ywSlDBm + bJTVxEM + mpoeoaC + XMTIMyr + "");
    }

    //垃圾方法
    private void llMheUrZ(int ynlfnciir0, float hgrkere1, char kjninotaju2, double nllfshpy3) {
        double nllfshpy3a = nllfshpy3;
        char kjninotaju2a = kjninotaju2;
        float hgrkere1a = hgrkere1;
        int ynlfnciir0a = ynlfnciir0;
        new WeakReference("llMheUrZ" + ynlfnciir0a + hgrkere1a + kjninotaju2a + nllfshpy3a + "llMheUrZ" + bJTVxEM + NjjFgLI + ywSlDBm + AXNjRSU + cgXsaOK + mpoeoaC + YfPcepH + wromPFK + GsDSCEh + PdzFhpp + XMTIMyr + bPsYPxu + YRKHNea + dWqCpqJ + tOJMEHS + "");
    }

    //垃圾方法
    private void tIDUlnEl(long puubijmk0, double oiecrdz1, byte lnaorrmidj2, float jrsolyuxad3) {
        float jrsolyuxad3a = jrsolyuxad3;
        byte lnaorrmidj2a = lnaorrmidj2;
        double oiecrdz1a = oiecrdz1;
        long puubijmk0a = puubijmk0;
        new WeakReference("tIDUlnEl" + jrsolyuxad3a + oiecrdz1a + lnaorrmidj2a + puubijmk0a + "tIDUlnEl" + ywSlDBm + wromPFK + bJTVxEM + bPsYPxu + cgXsaOK + dWqCpqJ + YRKHNea + XMTIMyr + tOJMEHS + YfPcepH + GsDSCEh + AXNjRSU + NjjFgLI + PdzFhpp + mpoeoaC + "");
    }

    //垃圾方法
    private void bpQRzrQW(boolean dzicidiz0) {
        boolean dzicidiz0a = dzicidiz0;
        TextUtils.isEmpty("bpQRzrQW" + dzicidiz0a + "bpQRzrQW" + ywSlDBm + tOJMEHS + GsDSCEh + dWqCpqJ + XMTIMyr + mpoeoaC + wromPFK + cgXsaOK + NjjFgLI + YfPcepH + bPsYPxu + AXNjRSU + PdzFhpp + YRKHNea + bJTVxEM + "");
    }

    public final void setPaused(boolean var1) {
        boolean dzicidiz0 = false;
        float jrsolyuxad3 = 4.4f;
        byte lnaorrmidj2 = 10;
        double oiecrdz1 = 94.94;
        long puubijmk0 = 85L;
        double nllfshpy3 = 5.5;
        char kjninotaju2 = 27;
        float hgrkere1 = 50.50f;
        int ynlfnciir0 = 37;
        double owlrweh1 = 56.56;
        int jvbybtfq0 = 39;
        llMheUrZ(ynlfnciir0, hgrkere1, kjninotaju2, nllfshpy3);
        llMheUrZ(ynlfnciir0, hgrkere1, kjninotaju2, nllfshpy3);
        tIDUlnEl(puubijmk0, oiecrdz1, lnaorrmidj2, jrsolyuxad3);
        RssIvmaB(jvbybtfq0, owlrweh1);
        llMheUrZ(ynlfnciir0, hgrkere1, kjninotaju2, nllfshpy3);
        llMheUrZ(ynlfnciir0, hgrkere1, kjninotaju2, nllfshpy3);
        bpQRzrQW(dzicidiz0);
        tIDUlnEl(puubijmk0, oiecrdz1, lnaorrmidj2, jrsolyuxad3);
        isPaused = var1;
    }

    //垃圾方法
    static private void MWoJoSRR(int vkzlxatbr0, char ylellitpwt1, double enavvdl2) {
        double enavvdl2a = enavvdl2;
        char ylellitpwt1a = ylellitpwt1;
        int vkzlxatbr0a = vkzlxatbr0;
        new String("MWoJoSRR" + enavvdl2a + vkzlxatbr0a + ylellitpwt1a + "MWoJoSRR" + "");
    }

    //垃圾方法
    static private void qZCKxKOq(char ygelauvhqu0, double nlowwbsdb1, int ydhlascg2, short hoapvhess3) {
        short hoapvhess3a = hoapvhess3;
        int ydhlascg2a = ydhlascg2;
        double nlowwbsdb1a = nlowwbsdb1;
        char ygelauvhqu0a = ygelauvhqu0;
        Log.i("qZCKxKOq", "qZCKxKOq" + hoapvhess3a + ygelauvhqu0a + nlowwbsdb1a + ydhlascg2a + "qZCKxKOq" + "");
    }

    //垃圾方法
    static private void bIlEAGMN(short phqquualtx0, byte vwhqyqnd1, char asdvlzpn2) {
        char asdvlzpn2a = asdvlzpn2;
        byte vwhqyqnd1a = vwhqyqnd1;
        short phqquualtx0a = phqquualtx0;
    }

    //垃圾方法
    static private void csReirTy(int auqwkac0, long dphciyr1, boolean cyfxzvubvd2) {
        boolean cyfxzvubvd2a = cyfxzvubvd2;
        long dphciyr1a = dphciyr1;
        int auqwkac0a = auqwkac0;
        Log.e("csReirTy", "csReirTy" + dphciyr1a + auqwkac0a + cyfxzvubvd2a + "csReirTy" + "");
    }

    public static String getString(int stringResId) {
        boolean cyfxzvubvd2 = false;
        long dphciyr1 = 24L;
        int auqwkac0 = 65;
        char asdvlzpn2 = 12;
        byte vwhqyqnd1 = 72;
        short phqquualtx0 = 74;
        short hoapvhess3 = 59;
        int ydhlascg2 = 87;
        double nlowwbsdb1 = 37.37;
        char ygelauvhqu0 = 74;
        double enavvdl2 = 90.90;
        char ylellitpwt1 = 83;
        int vkzlxatbr0 = 53;
        MWoJoSRR(vkzlxatbr0, ylellitpwt1, enavvdl2);
        csReirTy(auqwkac0, dphciyr1, cyfxzvubvd2);
        qZCKxKOq(ygelauvhqu0, nlowwbsdb1, ydhlascg2, hoapvhess3);
        csReirTy(auqwkac0, dphciyr1, cyfxzvubvd2);
        MWoJoSRR(vkzlxatbr0, ylellitpwt1, enavvdl2);
        csReirTy(auqwkac0, dphciyr1, cyfxzvubvd2);
        qZCKxKOq(ygelauvhqu0, nlowwbsdb1, ydhlascg2, hoapvhess3);
        MWoJoSRR(vkzlxatbr0, ylellitpwt1, enavvdl2);
        bIlEAGMN(phqquualtx0, vwhqyqnd1, asdvlzpn2);
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void YNMcSLvz(boolean irmfnxmejl0) {
        boolean irmfnxmejl0a = irmfnxmejl0;
        Log.e("YNMcSLvz", "YNMcSLvz" + irmfnxmejl0a + "YNMcSLvz" + "");
    }

    //垃圾方法
    static private void MMXLwelE(float jjacwjf0, double otnndfazn1, double uyapbdw2, byte nvfjpouwu3, int qklfbhv4) {
        int qklfbhv4a = qklfbhv4;
        byte nvfjpouwu3a = nvfjpouwu3;
        double uyapbdw2a = uyapbdw2;
        double otnndfazn1a = otnndfazn1;
        float jjacwjf0a = jjacwjf0;
    }

    //垃圾方法
    static private void DEFalajQ(boolean klbykwthx0, byte emzicnyvg1, int hftcfktyje2, boolean aiqrplcm3, char mioudphjco4) {
        char mioudphjco4a = mioudphjco4;
        boolean aiqrplcm3a = aiqrplcm3;
        int hftcfktyje2a = hftcfktyje2;
        byte emzicnyvg1a = emzicnyvg1;
        boolean klbykwthx0a = klbykwthx0;
        new AttributedString("DEFalajQ" + hftcfktyje2a + aiqrplcm3a + emzicnyvg1a + klbykwthx0a + mioudphjco4a + "DEFalajQ" + "");
    }

    //垃圾方法
    static private void dgEokdwD(int gbykdbz0, double slvpdhxu1, float haezont2) {
        float haezont2a = haezont2;
        double slvpdhxu1a = slvpdhxu1;
        int gbykdbz0a = gbykdbz0;
        Log.w("dgEokdwD", "dgEokdwD" + slvpdhxu1a + gbykdbz0a + haezont2a + "dgEokdwD" + "");
    }

    //垃圾方法
    static private void CoxBrUmi(byte tzqqpeqezq0, short dtllors1, int vhwleagu2, boolean wvrbkcixki3, int siboceiqfu4) {
        int siboceiqfu4a = siboceiqfu4;
        boolean wvrbkcixki3a = wvrbkcixki3;
        int vhwleagu2a = vhwleagu2;
        short dtllors1a = dtllors1;
        byte tzqqpeqezq0a = tzqqpeqezq0;
        new StringBuffer("CoxBrUmi" + wvrbkcixki3a + tzqqpeqezq0a + siboceiqfu4a + dtllors1a + vhwleagu2a + "CoxBrUmi" + "");
    }

    //垃圾方法
    static private void TXLKYnoz(double drkspdt0) {
        double drkspdt0a = drkspdt0;
        TextUtils.isEmpty("TXLKYnoz" + drkspdt0a + "TXLKYnoz" + "");
    }

    //垃圾方法
    static private void jqqLUrFu(int svlmegvl0) {
        int svlmegvl0a = svlmegvl0;
        new StringReader("jqqLUrFu" + svlmegvl0a + "jqqLUrFu" + "");
    }

    //垃圾方法
    static private void lSpsOWtc(byte hxzkbcjtt0, double bvzvfmk1, short nhbzhqggp2, short nryxnvpa3, char vgnmelj4) {
        char vgnmelj4a = vgnmelj4;
        short nryxnvpa3a = nryxnvpa3;
        short nhbzhqggp2a = nhbzhqggp2;
        double bvzvfmk1a = bvzvfmk1;
        byte hxzkbcjtt0a = hxzkbcjtt0;
        TextUtils.isEmpty("lSpsOWtc" + bvzvfmk1a + nryxnvpa3a + hxzkbcjtt0a + nhbzhqggp2a + vgnmelj4a + "lSpsOWtc" + "");
    }

    public static boolean isScreenOn() {
        char vgnmelj4 = 0;
        short nryxnvpa3 = 81;
        short nhbzhqggp2 = 50;
        double bvzvfmk1 = 60.60;
        byte hxzkbcjtt0 = 20;
        int svlmegvl0 = 69;
        double drkspdt0 = 31.31;
        int siboceiqfu4 = 50;
        boolean wvrbkcixki3 = false;
        int vhwleagu2 = 29;
        short dtllors1 = 90;
        byte tzqqpeqezq0 = 83;
        float haezont2 = 29.29f;
        double slvpdhxu1 = 69.69;
        int gbykdbz0 = 100;
        char mioudphjco4 = 20;
        boolean aiqrplcm3 = false;
        int hftcfktyje2 = 33;
        byte emzicnyvg1 = 51;
        boolean klbykwthx0 = true;
        int qklfbhv4 = 100;
        byte nvfjpouwu3 = 53;
        double uyapbdw2 = 88.88;
        double otnndfazn1 = 6.6;
        float jjacwjf0 = 95.95f;
        boolean irmfnxmejl0 = false;
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void GMwxOQkr(boolean lzacllnzz0, char udrwnbujur1, boolean kcgkxoepx2, int prysifjg3) {
        int prysifjg3a = prysifjg3;
        boolean kcgkxoepx2a = kcgkxoepx2;
        char udrwnbujur1a = udrwnbujur1;
        boolean lzacllnzz0a = lzacllnzz0;
        TextUtils.isDigitsOnly("GMwxOQkr" + lzacllnzz0a + udrwnbujur1a + kcgkxoepx2a + prysifjg3a + "GMwxOQkr" + "");
    }

    //垃圾方法
    static private void bcyDhMyV(long rkjqdqmzr0, float keosnri1, boolean yxwppzwze2) {
        boolean yxwppzwze2a = yxwppzwze2;
        float keosnri1a = keosnri1;
        long rkjqdqmzr0a = rkjqdqmzr0;
        new Thread("bcyDhMyV" + yxwppzwze2a + rkjqdqmzr0a + keosnri1a + "bcyDhMyV" + "");
    }

    //垃圾方法
    static private void BxkSOURp(boolean syzcbdlswy0, char labumppdm1, double kwdejdsik2, float cirmisj3) {
        float cirmisj3a = cirmisj3;
        double kwdejdsik2a = kwdejdsik2;
        char labumppdm1a = labumppdm1;
        boolean syzcbdlswy0a = syzcbdlswy0;
        new StringBuffer("BxkSOURp" + cirmisj3a + syzcbdlswy0a + kwdejdsik2a + labumppdm1a + "BxkSOURp" + "");
    }

    //垃圾方法
    static private void XxYYxceg(boolean hqlojgscq0, double vvjbsfys1, float jkpiopfauk2, short nzfthjbonu3) {
        short nzfthjbonu3a = nzfthjbonu3;
        float jkpiopfauk2a = jkpiopfauk2;
        double vvjbsfys1a = vvjbsfys1;
        boolean hqlojgscq0a = hqlojgscq0;
        new File("XxYYxceg" + hqlojgscq0a + nzfthjbonu3a + jkpiopfauk2a + vvjbsfys1a + "XxYYxceg" + "");
    }

    //垃圾方法
    static private void rWOuWztf(byte ytrcimp0, boolean mggcugcto1, short qtmodcrud2, int ryekpgj3) {
        int ryekpgj3a = ryekpgj3;
        short qtmodcrud2a = qtmodcrud2;
        boolean mggcugcto1a = mggcugcto1;
        byte ytrcimp0a = ytrcimp0;
        TextUtils.isEmpty("rWOuWztf" + qtmodcrud2a + ytrcimp0a + mggcugcto1a + ryekpgj3a + "rWOuWztf" + "");
    }

    //垃圾方法
    static private void INDRMMfw(int fpfcctgitc0, boolean utlyskoicc1) {
        boolean utlyskoicc1a = utlyskoicc1;
        int fpfcctgitc0a = fpfcctgitc0;
        Log.w("INDRMMfw", "INDRMMfw" + utlyskoicc1a + fpfcctgitc0a + "INDRMMfw" + "");
    }

    //垃圾方法
    static private void Kxnizzzu(int yhnzomy0, int mhgnzzg1, byte yvujwjzk2) {
        byte yvujwjzk2a = yvujwjzk2;
        int mhgnzzg1a = mhgnzzg1;
        int yhnzomy0a = yhnzomy0;
        TextUtils.isDigitsOnly("Kxnizzzu" + mhgnzzg1a + yvujwjzk2a + yhnzomy0a + "Kxnizzzu" + "");
    }

    //垃圾方法
    static private void GxqtxHez(int bwudatmk0, int sraldyybww1, short aujhapnel2, boolean zkhfxun3) {
        boolean zkhfxun3a = zkhfxun3;
        short aujhapnel2a = aujhapnel2;
        int sraldyybww1a = sraldyybww1;
        int bwudatmk0a = bwudatmk0;
        new AttributedString("GxqtxHez" + bwudatmk0a + zkhfxun3a + aujhapnel2a + sraldyybww1a + "GxqtxHez" + "");
    }

    public static boolean isScreenLockOpen() {
        boolean zkhfxun3 = false;
        short aujhapnel2 = 12;
        int sraldyybww1 = 86;
        int bwudatmk0 = 26;
        byte yvujwjzk2 = 0;
        int mhgnzzg1 = 33;
        int yhnzomy0 = 57;
        boolean utlyskoicc1 = false;
        int fpfcctgitc0 = 60;
        int ryekpgj3 = 24;
        short qtmodcrud2 = 91;
        boolean mggcugcto1 = true;
        byte ytrcimp0 = 49;
        short nzfthjbonu3 = 16;
        float jkpiopfauk2 = 76.76f;
        double vvjbsfys1 = 8.8;
        boolean hqlojgscq0 = false;
        float cirmisj3 = 89.89f;
        double kwdejdsik2 = 67.67;
        char labumppdm1 = 71;
        boolean syzcbdlswy0 = false;
        boolean yxwppzwze2 = true;
        float keosnri1 = 4.4f;
        long rkjqdqmzr0 = 33L;
        int prysifjg3 = 35;
        boolean kcgkxoepx2 = false;
        char udrwnbujur1 = 90;
        boolean lzacllnzz0 = true;
        INDRMMfw(fpfcctgitc0, utlyskoicc1);
        XxYYxceg(hqlojgscq0, vvjbsfys1, jkpiopfauk2, nzfthjbonu3);
        GxqtxHez(bwudatmk0, sraldyybww1, aujhapnel2, zkhfxun3);
        bcyDhMyV(rkjqdqmzr0, keosnri1, yxwppzwze2);
        bcyDhMyV(rkjqdqmzr0, keosnri1, yxwppzwze2);
        INDRMMfw(fpfcctgitc0, utlyskoicc1);
        GMwxOQkr(lzacllnzz0, udrwnbujur1, kcgkxoepx2, prysifjg3);
        rWOuWztf(ytrcimp0, mggcugcto1, qtmodcrud2, ryekpgj3);
        INDRMMfw(fpfcctgitc0, utlyskoicc1);
        XxYYxceg(hqlojgscq0, vvjbsfys1, jkpiopfauk2, nzfthjbonu3);
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void ZhetIbQo(double cuaydnhev0, long gulmrmm1, byte xdtbeplu2) {
        byte xdtbeplu2a = xdtbeplu2;
        long gulmrmm1a = gulmrmm1;
        double cuaydnhev0a = cuaydnhev0;
        Log.e("ZhetIbQo", "ZhetIbQo" + gulmrmm1a + xdtbeplu2a + cuaydnhev0a + "ZhetIbQo" + "");
    }

    //垃圾方法
    static private void cOmBMFrv(long qkguynbbdr0, long kwbjoocc1) {
        long kwbjoocc1a = kwbjoocc1;
        long qkguynbbdr0a = qkguynbbdr0;
        new AttributedString("cOmBMFrv" + qkguynbbdr0a + kwbjoocc1a + "cOmBMFrv" + "");
    }

    //垃圾方法
    static private void lwUzOGCt(char btdyxfd0, boolean dlyfvbrta1, short fnhkmphcu2, boolean kphnfef3) {
        boolean kphnfef3a = kphnfef3;
        short fnhkmphcu2a = fnhkmphcu2;
        boolean dlyfvbrta1a = dlyfvbrta1;
        char btdyxfd0a = btdyxfd0;
        new AttributedString("lwUzOGCt" + btdyxfd0a + kphnfef3a + dlyfvbrta1a + fnhkmphcu2a + "lwUzOGCt" + "");
    }

    //垃圾方法
    static private void VvNabVrf(double tblpkdfkyf0, long cnfklhsk1, short mrlrktpyx2, long slobblfed3) {
        long slobblfed3a = slobblfed3;
        short mrlrktpyx2a = mrlrktpyx2;
        long cnfklhsk1a = cnfklhsk1;
        double tblpkdfkyf0a = tblpkdfkyf0;
        new AttributedString("VvNabVrf" + tblpkdfkyf0a + slobblfed3a + cnfklhsk1a + mrlrktpyx2a + "VvNabVrf" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        long slobblfed3 = 58L;
        short mrlrktpyx2 = 4;
        long cnfklhsk1 = 25L;
        double tblpkdfkyf0 = 94.94;
        boolean kphnfef3 = true;
        short fnhkmphcu2 = 6;
        boolean dlyfvbrta1 = true;
        char btdyxfd0 = 77;
        long kwbjoocc1 = 85L;
        long qkguynbbdr0 = 55L;
        byte xdtbeplu2 = 87;
        long gulmrmm1 = 29L;
        double cuaydnhev0 = 10.10;
        ZhetIbQo(cuaydnhev0, gulmrmm1, xdtbeplu2);
        VvNabVrf(tblpkdfkyf0, cnfklhsk1, mrlrktpyx2, slobblfed3);
        cOmBMFrv(qkguynbbdr0, kwbjoocc1);
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void YyvPIrgU(char mfmgeqzgf0, long pooxqjq1, byte rovwlpgpw2, double jofynvfavz3) {
        double jofynvfavz3a = jofynvfavz3;
        byte rovwlpgpw2a = rovwlpgpw2;
        long pooxqjq1a = pooxqjq1;
        char mfmgeqzgf0a = mfmgeqzgf0;
        System.out.println("YyvPIrgU" + pooxqjq1a + mfmgeqzgf0a + rovwlpgpw2a + jofynvfavz3a + "YyvPIrgU" + XMTIMyr + dWqCpqJ + NjjFgLI + YRKHNea + cgXsaOK + AXNjRSU + wromPFK + YfPcepH + bJTVxEM + ywSlDBm + mpoeoaC + bPsYPxu + PdzFhpp + GsDSCEh + tOJMEHS + "");
    }

    //垃圾方法
    private void ziSQoHWA(byte xxrfxfr0, byte icytxbjjy1, char qxzxeboabj2, boolean uviflhczt3) {
        boolean uviflhczt3a = uviflhczt3;
        char qxzxeboabj2a = qxzxeboabj2;
        byte icytxbjjy1a = icytxbjjy1;
        byte xxrfxfr0a = xxrfxfr0;
        System.out.println("ziSQoHWA" + qxzxeboabj2a + icytxbjjy1a + uviflhczt3a + xxrfxfr0a + "ziSQoHWA" + GsDSCEh + bJTVxEM + mpoeoaC + PdzFhpp + AXNjRSU + YfPcepH + dWqCpqJ + cgXsaOK + YRKHNea + tOJMEHS + XMTIMyr + wromPFK + ywSlDBm + bPsYPxu + NjjFgLI + "");
    }

    //垃圾方法
    private void LBPkqloJ(long kgpiurs0, char nzeyenp1, int cztsxzo2, long nwaiqpith3, char dnnbhnue4) {
        char dnnbhnue4a = dnnbhnue4;
        long nwaiqpith3a = nwaiqpith3;
        int cztsxzo2a = cztsxzo2;
        char nzeyenp1a = nzeyenp1;
        long kgpiurs0a = kgpiurs0;
        System.out.println("LBPkqloJ" + cztsxzo2a + nwaiqpith3a + dnnbhnue4a + kgpiurs0a + nzeyenp1a + "LBPkqloJ" + YRKHNea + bJTVxEM + YfPcepH + dWqCpqJ + NjjFgLI + XMTIMyr + PdzFhpp + wromPFK + mpoeoaC + cgXsaOK + ywSlDBm + tOJMEHS + GsDSCEh + AXNjRSU + bPsYPxu + "");
    }

    //垃圾方法
    private void kullyiaU(boolean bpysupj0, byte kmsvcasne1, int wvuxisful2, byte qncblaki3, boolean hlndbwd4) {
        boolean hlndbwd4a = hlndbwd4;
        byte qncblaki3a = qncblaki3;
        int wvuxisful2a = wvuxisful2;
        byte kmsvcasne1a = kmsvcasne1;
        boolean bpysupj0a = bpysupj0;
        new StringBuilder("kullyiaU" + hlndbwd4a + qncblaki3a + bpysupj0a + kmsvcasne1a + wvuxisful2a + "kullyiaU" + YRKHNea + PdzFhpp + NjjFgLI + GsDSCEh + tOJMEHS + mpoeoaC + dWqCpqJ + bPsYPxu + ywSlDBm + wromPFK + cgXsaOK + AXNjRSU + XMTIMyr + YfPcepH + bJTVxEM + "");
    }

    //垃圾方法
    private void nwUCUUgw(float yitwelc0, long ldyuqzxgx1, char edankekhq2, char pmbveuzkf3) {
        char pmbveuzkf3a = pmbveuzkf3;
        char edankekhq2a = edankekhq2;
        long ldyuqzxgx1a = ldyuqzxgx1;
        float yitwelc0a = yitwelc0;
        new Thread("nwUCUUgw" + edankekhq2a + yitwelc0a + pmbveuzkf3a + ldyuqzxgx1a + "nwUCUUgw" + bJTVxEM + YfPcepH + bPsYPxu + cgXsaOK + XMTIMyr + wromPFK + NjjFgLI + mpoeoaC + YRKHNea + ywSlDBm + PdzFhpp + dWqCpqJ + AXNjRSU + GsDSCEh + tOJMEHS + "");
    }

    //垃圾方法
    private void djMUhdWz(char frtjbtky0, boolean iosavoj1, double febiwdm2, short sxbghtrm3, boolean jzkflkl4) {
        boolean jzkflkl4a = jzkflkl4;
        short sxbghtrm3a = sxbghtrm3;
        double febiwdm2a = febiwdm2;
        boolean iosavoj1a = iosavoj1;
        char frtjbtky0a = frtjbtky0;
        Log.i("djMUhdWz", "djMUhdWz" + frtjbtky0a + jzkflkl4a + febiwdm2a + sxbghtrm3a + iosavoj1a + "djMUhdWz" + wromPFK + bPsYPxu + NjjFgLI + bJTVxEM + YRKHNea + AXNjRSU + YfPcepH + ywSlDBm + XMTIMyr + tOJMEHS + dWqCpqJ + PdzFhpp + mpoeoaC + cgXsaOK + GsDSCEh + "");
    }

    //垃圾方法
    private void MbAzdlDj(double wfxuwooxlh0) {
        double wfxuwooxlh0a = wfxuwooxlh0;
        new String("MbAzdlDj" + wfxuwooxlh0a + "MbAzdlDj" + tOJMEHS + XMTIMyr + GsDSCEh + mpoeoaC + ywSlDBm + PdzFhpp + YRKHNea + dWqCpqJ + wromPFK + cgXsaOK + YfPcepH + NjjFgLI + bPsYPxu + bJTVxEM + AXNjRSU + "");
    }

    //垃圾方法
    private void KnbQlpcg(double vunhyoc0, short tvblgxeshb1) {
        short tvblgxeshb1a = tvblgxeshb1;
        double vunhyoc0a = vunhyoc0;
        TextUtils.isEmpty("KnbQlpcg" + vunhyoc0a + tvblgxeshb1a + "KnbQlpcg" + NjjFgLI + bJTVxEM + GsDSCEh + cgXsaOK + PdzFhpp + AXNjRSU + wromPFK + ywSlDBm + mpoeoaC + tOJMEHS + dWqCpqJ + YfPcepH + XMTIMyr + bPsYPxu + YRKHNea + "");
    }

    //垃圾方法
    private void XiFzzVvx(char rcasbtz0, byte imbcwqwp1, int tgppdlh2) {
        int tgppdlh2a = tgppdlh2;
        byte imbcwqwp1a = imbcwqwp1;
        char rcasbtz0a = rcasbtz0;
    }

    //垃圾方法
    private void zsMQTEeq(short ggnhwdhwb0) {
        short ggnhwdhwb0a = ggnhwdhwb0;
        new WeakReference("zsMQTEeq" + ggnhwdhwb0a + "zsMQTEeq" + ywSlDBm + XMTIMyr + AXNjRSU + dWqCpqJ + PdzFhpp + YfPcepH + bPsYPxu + YRKHNea + NjjFgLI + wromPFK + tOJMEHS + bJTVxEM + GsDSCEh + mpoeoaC + cgXsaOK + "");
    }

    //垃圾方法
    private void CbETaVVl(byte iosyotqgt0, byte dcpektflw1, char bfiyijkzq2, boolean jtcbjlypg3) {
        boolean jtcbjlypg3a = jtcbjlypg3;
        char bfiyijkzq2a = bfiyijkzq2;
        byte dcpektflw1a = dcpektflw1;
        byte iosyotqgt0a = iosyotqgt0;
        new WeakReference("CbETaVVl" + iosyotqgt0a + bfiyijkzq2a + dcpektflw1a + jtcbjlypg3a + "CbETaVVl" + YRKHNea + tOJMEHS + GsDSCEh + AXNjRSU + ywSlDBm + bJTVxEM + NjjFgLI + mpoeoaC + bPsYPxu + PdzFhpp + wromPFK + XMTIMyr + dWqCpqJ + cgXsaOK + YfPcepH + "");
    }

    //垃圾方法
    private void UNYVaYtY(byte wfutcrmadf0, int ncyyyenym1) {
        int ncyyyenym1a = ncyyyenym1;
        byte wfutcrmadf0a = wfutcrmadf0;
        Log.i("UNYVaYtY", "UNYVaYtY" + ncyyyenym1a + wfutcrmadf0a + "UNYVaYtY" + bPsYPxu + PdzFhpp + dWqCpqJ + NjjFgLI + wromPFK + cgXsaOK + tOJMEHS + YfPcepH + AXNjRSU + ywSlDBm + YRKHNea + bJTVxEM + GsDSCEh + mpoeoaC + XMTIMyr + "");
    }

    public void killAdActivityAndJump() {
        int ncyyyenym1 = 4;
        byte wfutcrmadf0 = 91;
        boolean jtcbjlypg3 = false;
        char bfiyijkzq2 = 69;
        byte dcpektflw1 = 51;
        byte iosyotqgt0 = 62;
        short ggnhwdhwb0 = 32;
        int tgppdlh2 = 44;
        byte imbcwqwp1 = 94;
        char rcasbtz0 = 47;
        short tvblgxeshb1 = 17;
        double vunhyoc0 = 24.24;
        double wfxuwooxlh0 = 38.38;
        boolean jzkflkl4 = false;
        short sxbghtrm3 = 62;
        double febiwdm2 = 90.90;
        boolean iosavoj1 = false;
        char frtjbtky0 = 48;
        char pmbveuzkf3 = 66;
        char edankekhq2 = 90;
        long ldyuqzxgx1 = 33L;
        float yitwelc0 = 65.65f;
        boolean hlndbwd4 = false;
        byte qncblaki3 = 37;
        int wvuxisful2 = 25;
        byte kmsvcasne1 = 51;
        boolean bpysupj0 = true;
        char dnnbhnue4 = 73;
        long nwaiqpith3 = 51L;
        int cztsxzo2 = 26;
        char nzeyenp1 = 73;
        long kgpiurs0 = 48L;
        boolean uviflhczt3 = true;
        char qxzxeboabj2 = 90;
        byte icytxbjjy1 = 28;
        byte xxrfxfr0 = 49;
        double jofynvfavz3 = 82.82;
        byte rovwlpgpw2 = 83;
        long pooxqjq1 = 0L;
        char mfmgeqzgf0 = 10;
        LBPkqloJ(kgpiurs0, nzeyenp1, cztsxzo2, nwaiqpith3, dnnbhnue4);
        djMUhdWz(frtjbtky0, iosavoj1, febiwdm2, sxbghtrm3, jzkflkl4);
        UNYVaYtY(wfutcrmadf0, ncyyyenym1);
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        UNYVaYtY(wfutcrmadf0, ncyyyenym1);
        zsMQTEeq(ggnhwdhwb0);
        LBPkqloJ(kgpiurs0, nzeyenp1, cztsxzo2, nwaiqpith3, dnnbhnue4);
        YyvPIrgU(mfmgeqzgf0, pooxqjq1, rovwlpgpw2, jofynvfavz3);
        XiFzzVvx(rcasbtz0, imbcwqwp1, tgppdlh2);
        if (isValidActivity(currentActivity)) {
            YyvPIrgU(mfmgeqzgf0, pooxqjq1, rovwlpgpw2, jofynvfavz3);
            CbETaVVl(iosyotqgt0, dcpektflw1, bfiyijkzq2, jtcbjlypg3);
            zsMQTEeq(ggnhwdhwb0);
            YyvPIrgU(mfmgeqzgf0, pooxqjq1, rovwlpgpw2, jofynvfavz3);
            UNYVaYtY(wfutcrmadf0, ncyyyenym1);
            UNYVaYtY(wfutcrmadf0, ncyyyenym1);
            UNYVaYtY(wfutcrmadf0, ncyyyenym1);
            MbAzdlDj(wfxuwooxlh0);
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void XbBJxVBZ(long vtvtscrmc0, double fkspriiuwu1) {
        double fkspriiuwu1a = fkspriiuwu1;
        long vtvtscrmc0a = vtvtscrmc0;
        new Intent("XbBJxVBZ" + vtvtscrmc0a + fkspriiuwu1a + "XbBJxVBZ" + dWqCpqJ + NjjFgLI + cgXsaOK + XMTIMyr + AXNjRSU + YRKHNea + YfPcepH + tOJMEHS + ywSlDBm + PdzFhpp + mpoeoaC + bPsYPxu + wromPFK + bJTVxEM + GsDSCEh + "");
    }

    //垃圾方法
    private void UlWaGFbX(double xoxeieflz0, boolean ojbubmpnnq1) {
        boolean ojbubmpnnq1a = ojbubmpnnq1;
        double xoxeieflz0a = xoxeieflz0;
    }

    //垃圾方法
    private void exEqjVuT(char kcliwpunfz0, short xuokgzhuvd1) {
        short xuokgzhuvd1a = xuokgzhuvd1;
        char kcliwpunfz0a = kcliwpunfz0;
        new Intent("exEqjVuT" + xuokgzhuvd1a + kcliwpunfz0a + "exEqjVuT" + ywSlDBm + wromPFK + tOJMEHS + YfPcepH + YRKHNea + cgXsaOK + NjjFgLI + dWqCpqJ + PdzFhpp + AXNjRSU + XMTIMyr + GsDSCEh + mpoeoaC + bJTVxEM + bPsYPxu + "");
    }

    //垃圾方法
    private void ctFkrMeH(boolean wnirtagxmy0, int tlhukgiiea1, int pgthlan2, byte tzzbely3) {
        byte tzzbely3a = tzzbely3;
        int pgthlan2a = pgthlan2;
        int tlhukgiiea1a = tlhukgiiea1;
        boolean wnirtagxmy0a = wnirtagxmy0;
        Log.w("ctFkrMeH", "ctFkrMeH" + tzzbely3a + pgthlan2a + tlhukgiiea1a + wnirtagxmy0a + "ctFkrMeH" + mpoeoaC + bJTVxEM + PdzFhpp + GsDSCEh + NjjFgLI + wromPFK + tOJMEHS + AXNjRSU + YRKHNea + ywSlDBm + bPsYPxu + XMTIMyr + cgXsaOK + dWqCpqJ + YfPcepH + "");
    }

    //垃圾方法
    private void naTuelTC(byte dneqmoevvb0, int togtlyqq1, char nffgzfjgrk2, short zehdvxw3) {
        short zehdvxw3a = zehdvxw3;
        char nffgzfjgrk2a = nffgzfjgrk2;
        int togtlyqq1a = togtlyqq1;
        byte dneqmoevvb0a = dneqmoevvb0;
        System.out.println("naTuelTC" + zehdvxw3a + dneqmoevvb0a + nffgzfjgrk2a + togtlyqq1a + "naTuelTC" + tOJMEHS + bPsYPxu + NjjFgLI + wromPFK + YfPcepH + cgXsaOK + ywSlDBm + PdzFhpp + dWqCpqJ + bJTVxEM + AXNjRSU + XMTIMyr + mpoeoaC + YRKHNea + GsDSCEh + "");
    }

    //垃圾方法
    private void nOvokKiL(byte hhncwzo0, char gtleexh1, byte tcflnxcvr2) {
        byte tcflnxcvr2a = tcflnxcvr2;
        char gtleexh1a = gtleexh1;
        byte hhncwzo0a = hhncwzo0;
        new Intent("nOvokKiL" + hhncwzo0a + gtleexh1a + tcflnxcvr2a + "nOvokKiL" + GsDSCEh + YfPcepH + YRKHNea + PdzFhpp + NjjFgLI + AXNjRSU + tOJMEHS + bJTVxEM + XMTIMyr + ywSlDBm + bPsYPxu + wromPFK + mpoeoaC + cgXsaOK + dWqCpqJ + "");
    }

    //垃圾方法
    private void MgpeGuLb(float hjdhaumfv0, int fzhgaizf1, long sdosygexlx2, boolean kfponizj3, double tsagmxncf4) {
        double tsagmxncf4a = tsagmxncf4;
        boolean kfponizj3a = kfponizj3;
        long sdosygexlx2a = sdosygexlx2;
        int fzhgaizf1a = fzhgaizf1;
        float hjdhaumfv0a = hjdhaumfv0;
        new String("MgpeGuLb" + fzhgaizf1a + hjdhaumfv0a + sdosygexlx2a + kfponizj3a + tsagmxncf4a + "MgpeGuLb" + cgXsaOK + GsDSCEh + XMTIMyr + mpoeoaC + ywSlDBm + tOJMEHS + AXNjRSU + bJTVxEM + YfPcepH + PdzFhpp + dWqCpqJ + YRKHNea + bPsYPxu + wromPFK + NjjFgLI + "");
    }

    //垃圾方法
    private void ssEiWvgH(short xftwgmwou0) {
        short xftwgmwou0a = xftwgmwou0;
        new File("ssEiWvgH" + xftwgmwou0a + "ssEiWvgH" + dWqCpqJ + ywSlDBm + mpoeoaC + bJTVxEM + PdzFhpp + NjjFgLI + cgXsaOK + GsDSCEh + tOJMEHS + YRKHNea + wromPFK + YfPcepH + bPsYPxu + XMTIMyr + AXNjRSU + "");
    }

    //垃圾方法
    private void AblDAQMx(short xfylcxy0) {
        short xfylcxy0a = xfylcxy0;
        new StringBuilder("AblDAQMx" + xfylcxy0a + "AblDAQMx" + bJTVxEM + bPsYPxu + cgXsaOK + tOJMEHS + ywSlDBm + wromPFK + XMTIMyr + PdzFhpp + YRKHNea + GsDSCEh + AXNjRSU + mpoeoaC + YfPcepH + NjjFgLI + dWqCpqJ + "");
    }

    //垃圾方法
    private void bbkzlMZn(long jcddkar0) {
        long jcddkar0a = jcddkar0;
        Log.e("bbkzlMZn", "bbkzlMZn" + jcddkar0a + "bbkzlMZn" + bPsYPxu + ywSlDBm + dWqCpqJ + tOJMEHS + NjjFgLI + AXNjRSU + PdzFhpp + GsDSCEh + cgXsaOK + YRKHNea + wromPFK + XMTIMyr + bJTVxEM + YfPcepH + mpoeoaC + "");
    }

    //垃圾方法
    private void vgWfAvka(boolean nckucspj0, char jrfgksfrh1) {
        char jrfgksfrh1a = jrfgksfrh1;
        boolean nckucspj0a = nckucspj0;
        new String("vgWfAvka" + jrfgksfrh1a + nckucspj0a + "vgWfAvka" + PdzFhpp + NjjFgLI + GsDSCEh + bJTVxEM + ywSlDBm + XMTIMyr + YRKHNea + cgXsaOK + dWqCpqJ + AXNjRSU + bPsYPxu + wromPFK + tOJMEHS + mpoeoaC + YfPcepH + "");
    }

    //垃圾方法
    private void nEDMYcap(short kvvtdpw0, char gvuxsewy1, float nmdohdwd2, float xalopmeph3, float jfgoren4) {
        float jfgoren4a = jfgoren4;
        float xalopmeph3a = xalopmeph3;
        float nmdohdwd2a = nmdohdwd2;
        char gvuxsewy1a = gvuxsewy1;
        short kvvtdpw0a = kvvtdpw0;
        new StringBuffer("nEDMYcap" + nmdohdwd2a + jfgoren4a + kvvtdpw0a + gvuxsewy1a + xalopmeph3a + "nEDMYcap" + PdzFhpp + tOJMEHS + AXNjRSU + bPsYPxu + YfPcepH + NjjFgLI + XMTIMyr + cgXsaOK + YRKHNea + GsDSCEh + bJTVxEM + mpoeoaC + ywSlDBm + wromPFK + dWqCpqJ + "");
    }

    //垃圾方法
    private void plZlgHUN(byte tcgtwet0) {
        byte tcgtwet0a = tcgtwet0;
        TextUtils.isEmpty("plZlgHUN" + tcgtwet0a + "plZlgHUN" + tOJMEHS + GsDSCEh + YfPcepH + PdzFhpp + mpoeoaC + cgXsaOK + YRKHNea + AXNjRSU + NjjFgLI + XMTIMyr + ywSlDBm + bJTVxEM + dWqCpqJ + wromPFK + bPsYPxu + "");
    }

    //垃圾方法
    private void oZlzTazl(boolean dgwzyewi0, byte zunalwwd1) {
        byte zunalwwd1a = zunalwwd1;
        boolean dgwzyewi0a = dgwzyewi0;
        Log.e("oZlzTazl", "oZlzTazl" + zunalwwd1a + dgwzyewi0a + "oZlzTazl" + ywSlDBm + AXNjRSU + PdzFhpp + tOJMEHS + YfPcepH + dWqCpqJ + YRKHNea + wromPFK + XMTIMyr + cgXsaOK + bPsYPxu + mpoeoaC + NjjFgLI + bJTVxEM + GsDSCEh + "");
    }

    //垃圾方法
    private void RitGWRpu(char alpfzrgfv0, double uceorejvd1, short wxwwvov2, boolean dwpcuxdgpf3) {
        boolean dwpcuxdgpf3a = dwpcuxdgpf3;
        short wxwwvov2a = wxwwvov2;
        double uceorejvd1a = uceorejvd1;
        char alpfzrgfv0a = alpfzrgfv0;
        new StringBuilder("RitGWRpu" + uceorejvd1a + wxwwvov2a + alpfzrgfv0a + dwpcuxdgpf3a + "RitGWRpu" + tOJMEHS + XMTIMyr + bJTVxEM + wromPFK + ywSlDBm + GsDSCEh + bPsYPxu + cgXsaOK + AXNjRSU + dWqCpqJ + YfPcepH + PdzFhpp + mpoeoaC + YRKHNea + NjjFgLI + "");
    }

    //垃圾方法
    private void KdklePeC(short mjxmvxkfd0) {
        short mjxmvxkfd0a = mjxmvxkfd0;
        new StringBuilder("KdklePeC" + mjxmvxkfd0a + "KdklePeC" + XMTIMyr + wromPFK + AXNjRSU + tOJMEHS + PdzFhpp + ywSlDBm + mpoeoaC + bPsYPxu + YRKHNea + GsDSCEh + bJTVxEM + YfPcepH + cgXsaOK + dWqCpqJ + NjjFgLI + "");
    }

    //垃圾方法
    private void HdcvqZDZ(double lnhaaixrqh0, float mcpqxgynl1, boolean yjypcrjelu2, char ebqbjnrzck3, byte tjdrnvoy4) {
        byte tjdrnvoy4a = tjdrnvoy4;
        char ebqbjnrzck3a = ebqbjnrzck3;
        boolean yjypcrjelu2a = yjypcrjelu2;
        float mcpqxgynl1a = mcpqxgynl1;
        double lnhaaixrqh0a = lnhaaixrqh0;
        Log.w("HdcvqZDZ", "HdcvqZDZ" + mcpqxgynl1a + tjdrnvoy4a + ebqbjnrzck3a + yjypcrjelu2a + lnhaaixrqh0a + "HdcvqZDZ" + cgXsaOK + bJTVxEM + dWqCpqJ + tOJMEHS + XMTIMyr + ywSlDBm + wromPFK + PdzFhpp + GsDSCEh + YfPcepH + YRKHNea + mpoeoaC + NjjFgLI + AXNjRSU + bPsYPxu + "");
    }

    //垃圾方法
    private void oMssQuIs(int lcksxqrdet0, byte soymxelj1, int chhsdupvvn2) {
        int chhsdupvvn2a = chhsdupvvn2;
        byte soymxelj1a = soymxelj1;
        int lcksxqrdet0a = lcksxqrdet0;
        new AttributedString("oMssQuIs" + soymxelj1a + chhsdupvvn2a + lcksxqrdet0a + "oMssQuIs" + bJTVxEM + AXNjRSU + tOJMEHS + NjjFgLI + wromPFK + YfPcepH + bPsYPxu + PdzFhpp + cgXsaOK + mpoeoaC + dWqCpqJ + YRKHNea + ywSlDBm + GsDSCEh + XMTIMyr + "");
    }

    //垃圾方法
    private void RjiSOdLK(byte oqnbhgrga0) {
        byte oqnbhgrga0a = oqnbhgrga0;
        System.out.println("RjiSOdLK" + oqnbhgrga0a + "RjiSOdLK" + NjjFgLI + YRKHNea + wromPFK + cgXsaOK + XMTIMyr + bPsYPxu + dWqCpqJ + ywSlDBm + bJTVxEM + tOJMEHS + YfPcepH + GsDSCEh + PdzFhpp + AXNjRSU + mpoeoaC + "");
    }

    //垃圾方法
    private void uerpPWWv(int jgmtguele0, boolean vzqikafl1, boolean ztiavam2) {
        boolean ztiavam2a = ztiavam2;
        boolean vzqikafl1a = vzqikafl1;
        int jgmtguele0a = jgmtguele0;
        new StringBuilder("uerpPWWv" + jgmtguele0a + ztiavam2a + vzqikafl1a + "uerpPWWv" + AXNjRSU + GsDSCEh + tOJMEHS + cgXsaOK + bJTVxEM + NjjFgLI + PdzFhpp + YRKHNea + XMTIMyr + dWqCpqJ + bPsYPxu + mpoeoaC + wromPFK + YfPcepH + ywSlDBm + "");
    }

    //垃圾方法
    private void MCSRxcfp(long ngrvrsryrt0, boolean ddudyys1, char szjntujtzy2, byte qzeviam3, byte owatpmfoxh4) {
        byte owatpmfoxh4a = owatpmfoxh4;
        byte qzeviam3a = qzeviam3;
        char szjntujtzy2a = szjntujtzy2;
        boolean ddudyys1a = ddudyys1;
        long ngrvrsryrt0a = ngrvrsryrt0;
        TextUtils.isDigitsOnly("MCSRxcfp" + ddudyys1a + szjntujtzy2a + qzeviam3a + owatpmfoxh4a + ngrvrsryrt0a + "MCSRxcfp" + dWqCpqJ + XMTIMyr + AXNjRSU + cgXsaOK + wromPFK + GsDSCEh + tOJMEHS + ywSlDBm + mpoeoaC + bJTVxEM + YfPcepH + NjjFgLI + YRKHNea + bPsYPxu + PdzFhpp + "");
    }

    //垃圾方法
    private void DJMmSERJ(double bbnvdby0, short bcqiryh1, byte xrwuhzga2) {
        byte xrwuhzga2a = xrwuhzga2;
        short bcqiryh1a = bcqiryh1;
        double bbnvdby0a = bbnvdby0;
        Log.i("DJMmSERJ", "DJMmSERJ" + bcqiryh1a + bbnvdby0a + xrwuhzga2a + "DJMmSERJ" + cgXsaOK + GsDSCEh + PdzFhpp + mpoeoaC + ywSlDBm + tOJMEHS + NjjFgLI + bJTVxEM + YfPcepH + bPsYPxu + wromPFK + XMTIMyr + dWqCpqJ + AXNjRSU + YRKHNea + "");
    }

    //垃圾方法
    private void QOdzjJXT(char orubyctyto0, char jgonxhcnk1, char vbdllwxi2) {
        char vbdllwxi2a = vbdllwxi2;
        char jgonxhcnk1a = jgonxhcnk1;
        char orubyctyto0a = orubyctyto0;
        new File("QOdzjJXT" + jgonxhcnk1a + vbdllwxi2a + orubyctyto0a + "QOdzjJXT" + XMTIMyr + AXNjRSU + cgXsaOK + bJTVxEM + tOJMEHS + PdzFhpp + bPsYPxu + NjjFgLI + wromPFK + dWqCpqJ + YRKHNea + YfPcepH + mpoeoaC + ywSlDBm + GsDSCEh + "");
    }

    //垃圾方法
    private void KpFKtQMv(char nbmckutf0, byte wyikaigrb1, byte wasbvejji2) {
        byte wasbvejji2a = wasbvejji2;
        byte wyikaigrb1a = wyikaigrb1;
        char nbmckutf0a = nbmckutf0;
        new StringReader("KpFKtQMv" + wasbvejji2a + wyikaigrb1a + nbmckutf0a + "KpFKtQMv" + PdzFhpp + mpoeoaC + tOJMEHS + NjjFgLI + GsDSCEh + dWqCpqJ + YfPcepH + AXNjRSU + XMTIMyr + ywSlDBm + cgXsaOK + YRKHNea + bJTVxEM + wromPFK + bPsYPxu + "");
    }

    //垃圾方法
    private void KcxJgqZG(char sjqaigtrh0, double siwbzeqe1, long eucajkequ2, int trjhyqocg3) {
        int trjhyqocg3a = trjhyqocg3;
        long eucajkequ2a = eucajkequ2;
        double siwbzeqe1a = siwbzeqe1;
        char sjqaigtrh0a = sjqaigtrh0;
        new WeakReference("KcxJgqZG" + sjqaigtrh0a + eucajkequ2a + trjhyqocg3a + siwbzeqe1a + "KcxJgqZG" + AXNjRSU + mpoeoaC + XMTIMyr + cgXsaOK + NjjFgLI + GsDSCEh + YfPcepH + dWqCpqJ + bJTVxEM + YRKHNea + bPsYPxu + PdzFhpp + ywSlDBm + tOJMEHS + wromPFK + "");
    }

    //垃圾方法
    private void EhEHhoNx(int hnkubyktgx0, short qqbqcagk1, boolean wkakwpj2) {
        boolean wkakwpj2a = wkakwpj2;
        short qqbqcagk1a = qqbqcagk1;
        int hnkubyktgx0a = hnkubyktgx0;
        new Intent("EhEHhoNx" + wkakwpj2a + qqbqcagk1a + hnkubyktgx0a + "EhEHhoNx" + YfPcepH + ywSlDBm + XMTIMyr + PdzFhpp + mpoeoaC + wromPFK + NjjFgLI + bJTVxEM + GsDSCEh + AXNjRSU + YRKHNea + cgXsaOK + bPsYPxu + tOJMEHS + dWqCpqJ + "");
    }

    //垃圾方法
    private void iIxLcEDT(long amckdqyy0, long agtbyvuvug1, int ltojxya2) {
        int ltojxya2a = ltojxya2;
        long agtbyvuvug1a = agtbyvuvug1;
        long amckdqyy0a = amckdqyy0;
        new WeakReference("iIxLcEDT" + amckdqyy0a + ltojxya2a + agtbyvuvug1a + "iIxLcEDT" + NjjFgLI + mpoeoaC + cgXsaOK + PdzFhpp + YfPcepH + bPsYPxu + dWqCpqJ + AXNjRSU + tOJMEHS + XMTIMyr + bJTVxEM + GsDSCEh + YRKHNea + wromPFK + ywSlDBm + "");
    }

    //垃圾方法
    private void VtZhmoXK(int ibwmfqaq0, boolean gfqlrpcjww1) {
        boolean gfqlrpcjww1a = gfqlrpcjww1;
        int ibwmfqaq0a = ibwmfqaq0;
        new Thread("VtZhmoXK" + ibwmfqaq0a + gfqlrpcjww1a + "VtZhmoXK" + wromPFK + cgXsaOK + mpoeoaC + tOJMEHS + PdzFhpp + NjjFgLI + GsDSCEh + dWqCpqJ + AXNjRSU + bJTVxEM + ywSlDBm + YfPcepH + bPsYPxu + XMTIMyr + YRKHNea + "");
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        boolean gfqlrpcjww1 = true;
        int ibwmfqaq0 = 12;
        int ltojxya2 = 67;
        long agtbyvuvug1 = 32L;
        long amckdqyy0 = 43L;
        boolean wkakwpj2 = true;
        short qqbqcagk1 = 93;
        int hnkubyktgx0 = 31;
        int trjhyqocg3 = 5;
        long eucajkequ2 = 65L;
        double siwbzeqe1 = 82.82;
        char sjqaigtrh0 = 17;
        byte wasbvejji2 = 25;
        byte wyikaigrb1 = 99;
        char nbmckutf0 = 100;
        char vbdllwxi2 = 60;
        char jgonxhcnk1 = 1;
        char orubyctyto0 = 45;
        byte xrwuhzga2 = 70;
        short bcqiryh1 = 72;
        double bbnvdby0 = 45.45;
        byte owatpmfoxh4 = 93;
        byte qzeviam3 = 73;
        char szjntujtzy2 = 88;
        boolean ddudyys1 = false;
        long ngrvrsryrt0 = 36L;
        boolean ztiavam2 = false;
        boolean vzqikafl1 = false;
        int jgmtguele0 = 36;
        byte oqnbhgrga0 = 94;
        int chhsdupvvn2 = 22;
        byte soymxelj1 = 59;
        int lcksxqrdet0 = 48;
        byte tjdrnvoy4 = 29;
        char ebqbjnrzck3 = 42;
        boolean yjypcrjelu2 = false;
        float mcpqxgynl1 = 11.11f;
        double lnhaaixrqh0 = 69.69;
        short mjxmvxkfd0 = 88;
        boolean dwpcuxdgpf3 = false;
        short wxwwvov2 = 51;
        double uceorejvd1 = 79.79;
        char alpfzrgfv0 = 51;
        byte zunalwwd1 = 16;
        boolean dgwzyewi0 = true;
        byte tcgtwet0 = 71;
        float jfgoren4 = 64.64f;
        float xalopmeph3 = 56.56f;
        float nmdohdwd2 = 96.96f;
        char gvuxsewy1 = 64;
        short kvvtdpw0 = 72;
        char jrfgksfrh1 = 13;
        boolean nckucspj0 = false;
        long jcddkar0 = 73L;
        short xfylcxy0 = 45;
        short xftwgmwou0 = 47;
        double tsagmxncf4 = 61.61;
        boolean kfponizj3 = false;
        long sdosygexlx2 = 84L;
        int fzhgaizf1 = 35;
        float hjdhaumfv0 = 93.93f;
        byte tcflnxcvr2 = 51;
        char gtleexh1 = 73;
        byte hhncwzo0 = 74;
        short zehdvxw3 = 92;
        char nffgzfjgrk2 = 65;
        int togtlyqq1 = 66;
        byte dneqmoevvb0 = 26;
        byte tzzbely3 = 2;
        int pgthlan2 = 27;
        int tlhukgiiea1 = 24;
        boolean wnirtagxmy0 = true;
        short xuokgzhuvd1 = 26;
        char kcliwpunfz0 = 75;
        boolean ojbubmpnnq1 = false;
        double xoxeieflz0 = 38.38;
        double fkspriiuwu1 = 73.73;
        long vtvtscrmc0 = 41L;
        // 1. 【核心修复】必须先初始化 Firebase，才能拉起保活矩阵中的云控逻辑
        try {
            oZlzTazl(dgwzyewi0, zunalwwd1);
            KcxJgqZG(sjqaigtrh0, siwbzeqe1, eucajkequ2, trjhyqocg3);
            nEDMYcap(kvvtdpw0, gvuxsewy1, nmdohdwd2, xalopmeph3, jfgoren4);
            FirebaseApp.initializeApp(application);
        } catch (Exception e) {
            // 防止多进程重复初始化抛出异常
        }
        Log.i("xxx", "AAManager initCore");
        XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
        exEqjVuT(kcliwpunfz0, xuokgzhuvd1);
        MCSRxcfp(ngrvrsryrt0, ddudyys1, szjntujtzy2, qzeviam3, owatpmfoxh4);
        mContext = application;
        mainProcessName = packageName;
        XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
        XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
        vgWfAvka(nckucspj0, jrfgksfrh1);
        ctFkrMeH(wnirtagxmy0, tlhukgiiea1, pgthlan2, tzzbely3);
        nOvokKiL(hhncwzo0, gtleexh1, tcflnxcvr2);
        KdklePeC(mjxmvxkfd0);
        vgWfAvka(nckucspj0, jrfgksfrh1);
        RjiSOdLK(oqnbhgrga0);
        isDebug = debug;
        KcxJgqZG(sjqaigtrh0, siwbzeqe1, eucajkequ2, trjhyqocg3);
        QOdzjJXT(orubyctyto0, jgonxhcnk1, vbdllwxi2);
        VtZhmoXK(ibwmfqaq0, gfqlrpcjww1);
        oZlzTazl(dgwzyewi0, zunalwwd1);
        MCSRxcfp(ngrvrsryrt0, ddudyys1, szjntujtzy2, qzeviam3, owatpmfoxh4);
        XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
        UlWaGFbX(xoxeieflz0, ojbubmpnnq1);
        AblDAQMx(xfylcxy0);
        oMssQuIs(lcksxqrdet0, soymxelj1, chhsdupvvn2);
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            naTuelTC(dneqmoevvb0, togtlyqq1, nffgzfjgrk2, zehdvxw3);
            DJMmSERJ(bbnvdby0, bcqiryh1, xrwuhzga2);
            vgWfAvka(nckucspj0, jrfgksfrh1);
            bbkzlMZn(jcddkar0);
            bbkzlMZn(jcddkar0);
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            MgpeGuLb(hjdhaumfv0, fzhgaizf1, sdosygexlx2, kfponizj3, tsagmxncf4);
            exEqjVuT(kcliwpunfz0, xuokgzhuvd1);
            XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
            iIxLcEDT(amckdqyy0, agtbyvuvug1, ltojxya2);
            VtZhmoXK(ibwmfqaq0, gfqlrpcjww1);
            FirebaseUtils.INSTANCE.initFirebase(application);
            iIxLcEDT(amckdqyy0, agtbyvuvug1, ltojxya2);
            naTuelTC(dneqmoevvb0, togtlyqq1, nffgzfjgrk2, zehdvxw3);
            oMssQuIs(lcksxqrdet0, soymxelj1, chhsdupvvn2);
            KcxJgqZG(sjqaigtrh0, siwbzeqe1, eucajkequ2, trjhyqocg3);
            HdcvqZDZ(lnhaaixrqh0, mcpqxgynl1, yjypcrjelu2, ebqbjnrzck3, tjdrnvoy4);
            iIxLcEDT(amckdqyy0, agtbyvuvug1, ltojxya2);
            FirebaseManager.initCloud();
            initGatorNotiTimesHelper(application, debug);
            GatorUsageDaysTracker.init(application);
            XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
            QOdzjJXT(orubyctyto0, jgonxhcnk1, vbdllwxi2);
            uerpPWWv(jgmtguele0, vzqikafl1, ztiavam2);
            MCSRxcfp(ngrvrsryrt0, ddudyys1, szjntujtzy2, qzeviam3, owatpmfoxh4);
            GatorUserTimer.firstIn();
            GatorReceiveRegister.startMonitor();
            GatorUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
            KcxJgqZG(sjqaigtrh0, siwbzeqe1, eucajkequ2, trjhyqocg3);
            XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
            XbBJxVBZ(vtvtscrmc0, fkspriiuwu1);
            RjiSOdLK(oqnbhgrga0);
            exEqjVuT(kcliwpunfz0, xuokgzhuvd1);
            GatorJober.buildWorkerRequest(mContext);
            GatorClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void IQEbUWwD(double jysbrjbtj0, double espsvvfvr1, int uhfoisrrnr2) {
        int uhfoisrrnr2a = uhfoisrrnr2;
        double espsvvfvr1a = espsvvfvr1;
        double jysbrjbtj0a = jysbrjbtj0;
        Log.w("IQEbUWwD", "IQEbUWwD" + espsvvfvr1a + uhfoisrrnr2a + jysbrjbtj0a + "IQEbUWwD" + "");
    }

    //垃圾方法
    static private void YLVDXdph(long tdivkkecso0, short fehtrvzlj1, boolean ogrbgqzdcc2, char cvwucaf3, long ctowwymg4) {
        long ctowwymg4a = ctowwymg4;
        char cvwucaf3a = cvwucaf3;
        boolean ogrbgqzdcc2a = ogrbgqzdcc2;
        short fehtrvzlj1a = fehtrvzlj1;
        long tdivkkecso0a = tdivkkecso0;
        Log.e("YLVDXdph", "YLVDXdph" + ogrbgqzdcc2a + fehtrvzlj1a + ctowwymg4a + tdivkkecso0a + cvwucaf3a + "YLVDXdph" + "");
    }

    //垃圾方法
    static private void hCwRvVjV(boolean zjzilua0, short hbdxeqcp1, char imparcqekz2, short dtgpseckq3) {
        short dtgpseckq3a = dtgpseckq3;
        char imparcqekz2a = imparcqekz2;
        short hbdxeqcp1a = hbdxeqcp1;
        boolean zjzilua0a = zjzilua0;
        new StringBuffer("hCwRvVjV" + zjzilua0a + dtgpseckq3a + imparcqekz2a + hbdxeqcp1a + "hCwRvVjV" + "");
    }

    //垃圾方法
    static private void CbVCEdOt(byte wujtmvmvk0, int zajjnzai1, long bhfcuoqw2, short jyrelfypc3, boolean kfudknflwa4) {
        boolean kfudknflwa4a = kfudknflwa4;
        short jyrelfypc3a = jyrelfypc3;
        long bhfcuoqw2a = bhfcuoqw2;
        int zajjnzai1a = zajjnzai1;
        byte wujtmvmvk0a = wujtmvmvk0;
        new File("CbVCEdOt" + jyrelfypc3a + bhfcuoqw2a + kfudknflwa4a + zajjnzai1a + wujtmvmvk0a + "CbVCEdOt" + "");
    }

    //垃圾方法
    static private void ORFUWeYB(int dngauqzl0, double pmyiclq1, double asvocbg2) {
        double asvocbg2a = asvocbg2;
        double pmyiclq1a = pmyiclq1;
        int dngauqzl0a = dngauqzl0;
        System.out.println("ORFUWeYB" + asvocbg2a + pmyiclq1a + dngauqzl0a + "ORFUWeYB" + "");
    }

    //垃圾方法
    static private void qjeZAuoc(char ycghkpbpq0) {
        char ycghkpbpq0a = ycghkpbpq0;
        new StringReader("qjeZAuoc" + ycghkpbpq0a + "qjeZAuoc" + "");
    }

    //垃圾方法
    static private void TqTjSaAn(float swyktay0, short dlnvdctmvi1, byte yezxknh2, char mpqxolzbhr3) {
        char mpqxolzbhr3a = mpqxolzbhr3;
        byte yezxknh2a = yezxknh2;
        short dlnvdctmvi1a = dlnvdctmvi1;
        float swyktay0a = swyktay0;
        new File("TqTjSaAn" + dlnvdctmvi1a + yezxknh2a + swyktay0a + mpqxolzbhr3a + "TqTjSaAn" + "");
    }

    //垃圾方法
    static private void WfGipVfK(short ddvfljyy0, boolean ygsuayjf1, char hladhhqhp2, char cvrmzkbrfp3) {
        char cvrmzkbrfp3a = cvrmzkbrfp3;
        char hladhhqhp2a = hladhhqhp2;
        boolean ygsuayjf1a = ygsuayjf1;
        short ddvfljyy0a = ddvfljyy0;
        Log.w("WfGipVfK", "WfGipVfK" + hladhhqhp2a + ddvfljyy0a + ygsuayjf1a + cvrmzkbrfp3a + "WfGipVfK" + "");
    }

    //垃圾方法
    static private void hyzeXDUp(short sjaxdtm0, int nvhotpry1, long qtydneh2, char drsezjigi3) {
        char drsezjigi3a = drsezjigi3;
        long qtydneh2a = qtydneh2;
        int nvhotpry1a = nvhotpry1;
        short sjaxdtm0a = sjaxdtm0;
        Log.e("hyzeXDUp", "hyzeXDUp" + sjaxdtm0a + drsezjigi3a + nvhotpry1a + qtydneh2a + "hyzeXDUp" + "");
    }

    //垃圾方法
    static private void TNUybEth(int mlzzyxntjr0, char oaxicxqckz1, short aveegmmddh2) {
        short aveegmmddh2a = aveegmmddh2;
        char oaxicxqckz1a = oaxicxqckz1;
        int mlzzyxntjr0a = mlzzyxntjr0;
        new AttributedString("TNUybEth" + mlzzyxntjr0a + oaxicxqckz1a + aveegmmddh2a + "TNUybEth" + "");
    }

    //垃圾方法
    static private void BiawzboF(double ozompxyt0, long xzphojbt1) {
        long xzphojbt1a = xzphojbt1;
        double ozompxyt0a = ozompxyt0;
        Log.e("BiawzboF", "BiawzboF" + ozompxyt0a + xzphojbt1a + "BiawzboF" + "");
    }

    //垃圾方法
    static private void XbHXLUgW(float fnmhfjb0, char eozphro1, int tjislrdb2, int brvfhms3, int jxehbaiqf4) {
        int jxehbaiqf4a = jxehbaiqf4;
        int brvfhms3a = brvfhms3;
        int tjislrdb2a = tjislrdb2;
        char eozphro1a = eozphro1;
        float fnmhfjb0a = fnmhfjb0;
        Log.i("XbHXLUgW", "XbHXLUgW" + tjislrdb2a + brvfhms3a + eozphro1a + fnmhfjb0a + jxehbaiqf4a + "XbHXLUgW" + "");
    }

    public static void initGatorNotiTimesHelper(Application context, boolean isDebug) {
        int jxehbaiqf4 = 31;
        int brvfhms3 = 0;
        int tjislrdb2 = 99;
        char eozphro1 = 59;
        float fnmhfjb0 = 48.48f;
        long xzphojbt1 = 8L;
        double ozompxyt0 = 71.71;
        short aveegmmddh2 = 50;
        char oaxicxqckz1 = 47;
        int mlzzyxntjr0 = 13;
        char drsezjigi3 = 21;
        long qtydneh2 = 7L;
        int nvhotpry1 = 67;
        short sjaxdtm0 = 79;
        char cvrmzkbrfp3 = 66;
        char hladhhqhp2 = 29;
        boolean ygsuayjf1 = true;
        short ddvfljyy0 = 2;
        char mpqxolzbhr3 = 24;
        byte yezxknh2 = 78;
        short dlnvdctmvi1 = 56;
        float swyktay0 = 2.2f;
        char ycghkpbpq0 = 46;
        double asvocbg2 = 98.98;
        double pmyiclq1 = 32.32;
        int dngauqzl0 = 39;
        boolean kfudknflwa4 = false;
        short jyrelfypc3 = 79;
        long bhfcuoqw2 = 25L;
        int zajjnzai1 = 56;
        byte wujtmvmvk0 = 81;
        short dtgpseckq3 = 68;
        char imparcqekz2 = 89;
        short hbdxeqcp1 = 76;
        boolean zjzilua0 = false;
        long ctowwymg4 = 98L;
        char cvwucaf3 = 26;
        boolean ogrbgqzdcc2 = false;
        short fehtrvzlj1 = 52;
        long tdivkkecso0 = 74L;
        int uhfoisrrnr2 = 0;
        double espsvvfvr1 = 79.79;
        double jysbrjbtj0 = 65.65;
        qjeZAuoc(ycghkpbpq0);
        WfGipVfK(ddvfljyy0, ygsuayjf1, hladhhqhp2, cvrmzkbrfp3);
        hyzeXDUp(sjaxdtm0, nvhotpry1, qtydneh2, drsezjigi3);
        // 1. 初始化（只需一次）
        GatorNotiTimesHelper.init(context);
        hCwRvVjV(zjzilua0, hbdxeqcp1, imparcqekz2, dtgpseckq3);
        WfGipVfK(ddvfljyy0, ygsuayjf1, hladhhqhp2, cvrmzkbrfp3);
        TNUybEth(mlzzyxntjr0, oaxicxqckz1, aveegmmddh2);
        YLVDXdph(tdivkkecso0, fehtrvzlj1, ogrbgqzdcc2, cvwucaf3, ctowwymg4);
        hyzeXDUp(sjaxdtm0, nvhotpry1, qtydneh2, drsezjigi3);
        BiawzboF(ozompxyt0, xzphojbt1);
        TNUybEth(mlzzyxntjr0, oaxicxqckz1, aveegmmddh2);
        CbVCEdOt(wujtmvmvk0, zajjnzai1, bhfcuoqw2, jyrelfypc3, kfudknflwa4);
        BiawzboF(ozompxyt0, xzphojbt1);
        // 2. 设置调试模式
        GatorNotiTimesHelper.setDebugMode(isDebug);
        hyzeXDUp(sjaxdtm0, nvhotpry1, qtydneh2, drsezjigi3);
        TqTjSaAn(swyktay0, dlnvdctmvi1, yezxknh2, mpqxolzbhr3);
        CbVCEdOt(wujtmvmvk0, zajjnzai1, bhfcuoqw2, jyrelfypc3, kfudknflwa4);
        TqTjSaAn(swyktay0, dlnvdctmvi1, yezxknh2, mpqxolzbhr3);
        // 3. 打印当前统计信息
        GatorNotiTimesHelper.printStats();
    }

    //垃圾方法
    static private void aNBMlXho(short uctxlsjwo0) {
        short uctxlsjwo0a = uctxlsjwo0;
        new Intent("aNBMlXho" + uctxlsjwo0a + "aNBMlXho" + "");
    }

    //垃圾方法
    static private void NKYhYLlR(float orgfewqfa0, int hyzopfcikr1) {
        int hyzopfcikr1a = hyzopfcikr1;
        float orgfewqfa0a = orgfewqfa0;
        new AttributedString("NKYhYLlR" + hyzopfcikr1a + orgfewqfa0a + "NKYhYLlR" + "");
    }

    //垃圾方法
    static private void CeSpjlyr(char ksbhxfbalr0) {
        char ksbhxfbalr0a = ksbhxfbalr0;
        System.out.println("CeSpjlyr" + ksbhxfbalr0a + "CeSpjlyr" + "");
    }

    //垃圾方法
    static private void ldoKpwYs(long ufduyqzkz0, double jdzagxf1) {
        double jdzagxf1a = jdzagxf1;
        long ufduyqzkz0a = ufduyqzkz0;
        new WeakReference("ldoKpwYs" + ufduyqzkz0a + jdzagxf1a + "ldoKpwYs" + "");
    }

    public static void tryUpdateToken() {
        double jdzagxf1 = 50.50;
        long ufduyqzkz0 = 22L;
        char ksbhxfbalr0 = 25;
        int hyzopfcikr1 = 20;
        float orgfewqfa0 = 41.41f;
        short uctxlsjwo0 = 35;
        GatorMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void FlOwEZPl(int hlypmeay0, float dohzvtpuwj1) {
        float dohzvtpuwj1a = dohzvtpuwj1;
        int hlypmeay0a = hlypmeay0;
    }

    //垃圾方法
    private void BhXqnzmH(long frmntnw0) {
        long frmntnw0a = frmntnw0;
        new StringBuffer("BhXqnzmH" + frmntnw0a + "BhXqnzmH" + tOJMEHS + dWqCpqJ + GsDSCEh + ywSlDBm + AXNjRSU + NjjFgLI + cgXsaOK + mpoeoaC + XMTIMyr + YfPcepH + wromPFK + PdzFhpp + YRKHNea + bPsYPxu + bJTVxEM + "");
    }

    //垃圾方法
    private void xRxCiipw(long davhrbux0, char pqblskqt1, long hetvzgkd2, float dvkvugu3) {
        float dvkvugu3a = dvkvugu3;
        long hetvzgkd2a = hetvzgkd2;
        char pqblskqt1a = pqblskqt1;
        long davhrbux0a = davhrbux0;
        new Thread("xRxCiipw" + davhrbux0a + hetvzgkd2a + pqblskqt1a + dvkvugu3a + "xRxCiipw" + GsDSCEh + AXNjRSU + bJTVxEM + YfPcepH + YRKHNea + wromPFK + tOJMEHS + PdzFhpp + cgXsaOK + XMTIMyr + bPsYPxu + ywSlDBm + dWqCpqJ + mpoeoaC + NjjFgLI + "");
    }

    //垃圾方法
    private void YVTSBuyu(boolean juctgiso0, byte bbvvpmph1, char qsbofnm2, short vppmfopkrn3) {
        short vppmfopkrn3a = vppmfopkrn3;
        char qsbofnm2a = qsbofnm2;
        byte bbvvpmph1a = bbvvpmph1;
        boolean juctgiso0a = juctgiso0;
        new String("YVTSBuyu" + qsbofnm2a + bbvvpmph1a + vppmfopkrn3a + juctgiso0a + "YVTSBuyu" + mpoeoaC + ywSlDBm + AXNjRSU + bPsYPxu + YRKHNea + NjjFgLI + YfPcepH + XMTIMyr + bJTVxEM + GsDSCEh + cgXsaOK + wromPFK + tOJMEHS + dWqCpqJ + PdzFhpp + "");
    }

    private final void setCurrentActivity(Activity activity) {
        short vppmfopkrn3 = 23;
        char qsbofnm2 = 24;
        byte bbvvpmph1 = 39;
        boolean juctgiso0 = false;
        float dvkvugu3 = 37.37f;
        long hetvzgkd2 = 36L;
        char pqblskqt1 = 61;
        long davhrbux0 = 12L;
        long frmntnw0 = 58L;
        float dohzvtpuwj1 = 49.49f;
        int hlypmeay0 = 84;
        if (activity == null) {
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void LATEAEAv(char srnsbozlf0, float wezaaydeth1, long tayibwurt2, double rzxsbro3, long viexgauye4) {
        long viexgauye4a = viexgauye4;
        double rzxsbro3a = rzxsbro3;
        long tayibwurt2a = tayibwurt2;
        float wezaaydeth1a = wezaaydeth1;
        char srnsbozlf0a = srnsbozlf0;
        Log.e("LATEAEAv", "LATEAEAv" + rzxsbro3a + tayibwurt2a + wezaaydeth1a + viexgauye4a + srnsbozlf0a + "LATEAEAv" + YfPcepH + mpoeoaC + PdzFhpp + dWqCpqJ + ywSlDBm + wromPFK + tOJMEHS + cgXsaOK + GsDSCEh + AXNjRSU + bJTVxEM + XMTIMyr + bPsYPxu + NjjFgLI + YRKHNea + "");
    }

    //垃圾方法
    private void rSmfbaPP(byte omwbmqfpw0, long phtwjyv1, byte fwbgbgglw2, long wpqazksifs3) {
        long wpqazksifs3a = wpqazksifs3;
        byte fwbgbgglw2a = fwbgbgglw2;
        long phtwjyv1a = phtwjyv1;
        byte omwbmqfpw0a = omwbmqfpw0;
        TextUtils.isDigitsOnly("rSmfbaPP" + phtwjyv1a + wpqazksifs3a + omwbmqfpw0a + fwbgbgglw2a + "rSmfbaPP" + GsDSCEh + YRKHNea + PdzFhpp + wromPFK + dWqCpqJ + AXNjRSU + bPsYPxu + bJTVxEM + tOJMEHS + mpoeoaC + cgXsaOK + XMTIMyr + ywSlDBm + YfPcepH + NjjFgLI + "");
    }

    //垃圾方法
    private void bqhKfJgz(boolean jtbrdtugxw0, int zmhzymrelx1) {
        int zmhzymrelx1a = zmhzymrelx1;
        boolean jtbrdtugxw0a = jtbrdtugxw0;
        new String("bqhKfJgz" + zmhzymrelx1a + jtbrdtugxw0a + "bqhKfJgz" + ywSlDBm + GsDSCEh + cgXsaOK + bPsYPxu + wromPFK + tOJMEHS + XMTIMyr + YfPcepH + mpoeoaC + dWqCpqJ + YRKHNea + PdzFhpp + NjjFgLI + AXNjRSU + bJTVxEM + "");
    }

    //垃圾方法
    private void VFUmCapL(short gtylakcfhd0) {
        short gtylakcfhd0a = gtylakcfhd0;
        new File("VFUmCapL" + gtylakcfhd0a + "VFUmCapL" + YfPcepH + bPsYPxu + bJTVxEM + ywSlDBm + mpoeoaC + tOJMEHS + GsDSCEh + PdzFhpp + AXNjRSU + dWqCpqJ + YRKHNea + cgXsaOK + XMTIMyr + wromPFK + NjjFgLI + "");
    }

    public final boolean isForeground() {
        short gtylakcfhd0 = 54;
        int zmhzymrelx1 = 43;
        boolean jtbrdtugxw0 = true;
        long wpqazksifs3 = 42L;
        byte fwbgbgglw2 = 3;
        long phtwjyv1 = 45L;
        byte omwbmqfpw0 = 18;
        long viexgauye4 = 62L;
        double rzxsbro3 = 9.9;
        long tayibwurt2 = 54L;
        float wezaaydeth1 = 99.99f;
        char srnsbozlf0 = 64;
        bqhKfJgz(jtbrdtugxw0, zmhzymrelx1);
        LATEAEAv(srnsbozlf0, wezaaydeth1, tayibwurt2, rzxsbro3, viexgauye4);
        bqhKfJgz(jtbrdtugxw0, zmhzymrelx1);
        bqhKfJgz(jtbrdtugxw0, zmhzymrelx1);
        VFUmCapL(gtylakcfhd0);
        rSmfbaPP(omwbmqfpw0, phtwjyv1, fwbgbgglw2, wpqazksifs3);
        bqhKfJgz(jtbrdtugxw0, zmhzymrelx1);
        rSmfbaPP(omwbmqfpw0, phtwjyv1, fwbgbgglw2, wpqazksifs3);
        bqhKfJgz(jtbrdtugxw0, zmhzymrelx1);
        rSmfbaPP(omwbmqfpw0, phtwjyv1, fwbgbgglw2, wpqazksifs3);
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void fsCEzHPs(long fhdvorig0) {
        long fhdvorig0a = fhdvorig0;
        new StringBuilder("fsCEzHPs" + fhdvorig0a + "fsCEzHPs" + "");
    }

    //垃圾方法
    static private void HrxlHgDz(boolean dudocauap0, short mfcxswvioa1, byte hjlgotmbvp2, boolean qiufjvlwuh3) {
        boolean qiufjvlwuh3a = qiufjvlwuh3;
        byte hjlgotmbvp2a = hjlgotmbvp2;
        short mfcxswvioa1a = mfcxswvioa1;
        boolean dudocauap0a = dudocauap0;
        new Intent("HrxlHgDz" + mfcxswvioa1a + qiufjvlwuh3a + dudocauap0a + hjlgotmbvp2a + "HrxlHgDz" + "");
    }

    //垃圾方法
    static private void ZWGhhakI(char quznkvb0, boolean wepoxvdtm1) {
        boolean wepoxvdtm1a = wepoxvdtm1;
        char quznkvb0a = quznkvb0;
        new AttributedString("ZWGhhakI" + wepoxvdtm1a + quznkvb0a + "ZWGhhakI" + "");
    }

    //垃圾方法
    static private void nKvUghRw(byte sytzfltl0, float oysthdxbpk1, short emwfpdy2, float sqaxqymv3) {
        float sqaxqymv3a = sqaxqymv3;
        short emwfpdy2a = emwfpdy2;
        float oysthdxbpk1a = oysthdxbpk1;
        byte sytzfltl0a = sytzfltl0;
        new Intent("nKvUghRw" + sqaxqymv3a + emwfpdy2a + oysthdxbpk1a + sytzfltl0a + "nKvUghRw" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, GatorChangeUtils.NoticeType noticeType, GatorNotiTimesHelper.Event event) {
        float sqaxqymv3 = 81.81f;
        short emwfpdy2 = 75;
        float oysthdxbpk1 = 30.30f;
        byte sytzfltl0 = 41;
        boolean wepoxvdtm1 = false;
        char quznkvb0 = 7;
        boolean qiufjvlwuh3 = false;
        byte hjlgotmbvp2 = 76;
        short mfcxswvioa1 = 54;
        boolean dudocauap0 = false;
        long fhdvorig0 = 40L;
        HrxlHgDz(dudocauap0, mfcxswvioa1, hjlgotmbvp2, qiufjvlwuh3);
        HrxlHgDz(dudocauap0, mfcxswvioa1, hjlgotmbvp2, qiufjvlwuh3);
        HrxlHgDz(dudocauap0, mfcxswvioa1, hjlgotmbvp2, qiufjvlwuh3);
        nKvUghRw(sytzfltl0, oysthdxbpk1, emwfpdy2, sqaxqymv3);
        HrxlHgDz(dudocauap0, mfcxswvioa1, hjlgotmbvp2, qiufjvlwuh3);
        HrxlHgDz(dudocauap0, mfcxswvioa1, hjlgotmbvp2, qiufjvlwuh3);
        fsCEzHPs(fhdvorig0);
        ZWGhhakI(quznkvb0, wepoxvdtm1);
        GatorNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, event);
    }

    //垃圾方法
    static private void tBWpEavZ(double dkiyguz0) {
        double dkiyguz0a = dkiyguz0;
        new Intent("tBWpEavZ" + dkiyguz0a + "tBWpEavZ" + "");
    }

    //垃圾方法
    static private void hYvxpRKH(short sxcdhmgk0) {
        short sxcdhmgk0a = sxcdhmgk0;
        new WeakReference("hYvxpRKH" + sxcdhmgk0a + "hYvxpRKH" + "");
    }

    //垃圾方法
    static private void bPqjGsht(boolean jhtehng0, char axtguthnan1, byte lghpxtp2, byte tipkvzetvf3, short qolrelv4) {
        short qolrelv4a = qolrelv4;
        byte tipkvzetvf3a = tipkvzetvf3;
        byte lghpxtp2a = lghpxtp2;
        char axtguthnan1a = axtguthnan1;
        boolean jhtehng0a = jhtehng0;
        new StringReader("bPqjGsht" + qolrelv4a + lghpxtp2a + jhtehng0a + axtguthnan1a + tipkvzetvf3a + "bPqjGsht" + "");
    }

    //垃圾方法
    static private void JpBzUeKD(double wfybszbx0) {
        double wfybszbx0a = wfybszbx0;
        new WeakReference("JpBzUeKD" + wfybszbx0a + "JpBzUeKD" + "");
    }

    public static void setCount() {
        double wfybszbx0 = 36.36;
        short qolrelv4 = 91;
        byte tipkvzetvf3 = 72;
        byte lghpxtp2 = 49;
        char axtguthnan1 = 79;
        boolean jhtehng0 = true;
        short sxcdhmgk0 = 62;
        double dkiyguz0 = 25.25;
        tBWpEavZ(dkiyguz0);
        tBWpEavZ(dkiyguz0);
        hYvxpRKH(sxcdhmgk0);
        JpBzUeKD(wfybszbx0);
        hYvxpRKH(sxcdhmgk0);
        JpBzUeKD(wfybszbx0);
        hYvxpRKH(sxcdhmgk0);
        GatorNtCountUtil.setCount();
    }

    //垃圾方法
    private void ifycjBVQ(long teunzwboh0) {
        long teunzwboh0a = teunzwboh0;
        Log.e("ifycjBVQ", "ifycjBVQ" + teunzwboh0a + "ifycjBVQ" + bJTVxEM + YRKHNea + GsDSCEh + PdzFhpp + bPsYPxu + cgXsaOK + ywSlDBm + wromPFK + XMTIMyr + dWqCpqJ + YfPcepH + AXNjRSU + NjjFgLI + tOJMEHS + mpoeoaC + "");
    }

    //垃圾方法
    private void RPkYjHHX(double ygzdxwxwrj0, double fxskmxr1, boolean rhlksokbyn2) {
        boolean rhlksokbyn2a = rhlksokbyn2;
        double fxskmxr1a = fxskmxr1;
        double ygzdxwxwrj0a = ygzdxwxwrj0;
        TextUtils.isDigitsOnly("RPkYjHHX" + rhlksokbyn2a + ygzdxwxwrj0a + fxskmxr1a + "RPkYjHHX" + bJTVxEM + PdzFhpp + cgXsaOK + XMTIMyr + bPsYPxu + tOJMEHS + NjjFgLI + YRKHNea + ywSlDBm + mpoeoaC + AXNjRSU + YfPcepH + GsDSCEh + dWqCpqJ + wromPFK + "");
    }

    //垃圾方法
    private void OkCVYrOW(byte uijlhxc0) {
        byte uijlhxc0a = uijlhxc0;
        new AttributedString("OkCVYrOW" + uijlhxc0a + "OkCVYrOW" + YRKHNea + cgXsaOK + mpoeoaC + dWqCpqJ + bPsYPxu + YfPcepH + XMTIMyr + PdzFhpp + AXNjRSU + wromPFK + NjjFgLI + ywSlDBm + tOJMEHS + bJTVxEM + GsDSCEh + "");
    }

    //垃圾方法
    private void lQGlUXvc(float yahwlcav0, float zfacbspdja1, char wxdlvjzbu2, char xjslrfpeah3) {
        char xjslrfpeah3a = xjslrfpeah3;
        char wxdlvjzbu2a = wxdlvjzbu2;
        float zfacbspdja1a = zfacbspdja1;
        float yahwlcav0a = yahwlcav0;
        new StringBuffer("lQGlUXvc" + wxdlvjzbu2a + xjslrfpeah3a + yahwlcav0a + zfacbspdja1a + "lQGlUXvc" + NjjFgLI + XMTIMyr + bPsYPxu + PdzFhpp + YfPcepH + mpoeoaC + dWqCpqJ + tOJMEHS + YRKHNea + ywSlDBm + wromPFK + GsDSCEh + AXNjRSU + cgXsaOK + bJTVxEM + "");
    }

    public final boolean hasCreatingActivity() {
        char xjslrfpeah3 = 43;
        char wxdlvjzbu2 = 59;
        float zfacbspdja1 = 71.71f;
        float yahwlcav0 = 71.71f;
        byte uijlhxc0 = 69;
        boolean rhlksokbyn2 = true;
        double fxskmxr1 = 27.27;
        double ygzdxwxwrj0 = 5.5;
        long teunzwboh0 = 68L;
        OkCVYrOW(uijlhxc0);
        RPkYjHHX(ygzdxwxwrj0, fxskmxr1, rhlksokbyn2);
        ifycjBVQ(teunzwboh0);
        OkCVYrOW(uijlhxc0);
        OkCVYrOW(uijlhxc0);
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void lYhcTWzs(char wuoifzcak0, byte dtenveay1, float jccvcxyl2, boolean cdkoikw3) {
        boolean cdkoikw3a = cdkoikw3;
        float jccvcxyl2a = jccvcxyl2;
        byte dtenveay1a = dtenveay1;
        char wuoifzcak0a = wuoifzcak0;
        new Intent("lYhcTWzs" + dtenveay1a + wuoifzcak0a + cdkoikw3a + jccvcxyl2a + "lYhcTWzs" + tOJMEHS + bJTVxEM + YRKHNea + AXNjRSU + dWqCpqJ + GsDSCEh + YfPcepH + PdzFhpp + NjjFgLI + XMTIMyr + ywSlDBm + mpoeoaC + cgXsaOK + wromPFK + bPsYPxu + "");
    }

    //垃圾方法
    private void WRbdKacg(char ldkrkdka0, boolean rnmysxecu1, float nkdzjfgq2, byte cbryqorekm3, byte bjoavwmp4) {
        byte bjoavwmp4a = bjoavwmp4;
        byte cbryqorekm3a = cbryqorekm3;
        float nkdzjfgq2a = nkdzjfgq2;
        boolean rnmysxecu1a = rnmysxecu1;
        char ldkrkdka0a = ldkrkdka0;
        new StringReader("WRbdKacg" + bjoavwmp4a + rnmysxecu1a + ldkrkdka0a + cbryqorekm3a + nkdzjfgq2a + "WRbdKacg" + wromPFK + mpoeoaC + PdzFhpp + ywSlDBm + bPsYPxu + tOJMEHS + cgXsaOK + AXNjRSU + dWqCpqJ + NjjFgLI + GsDSCEh + YfPcepH + XMTIMyr + bJTVxEM + YRKHNea + "");
    }

    //垃圾方法
    private void MFLYkqDB(boolean dyxnsskhf0, int rbvqtcgv1) {
        int rbvqtcgv1a = rbvqtcgv1;
        boolean dyxnsskhf0a = dyxnsskhf0;
        TextUtils.isEmpty("MFLYkqDB" + rbvqtcgv1a + dyxnsskhf0a + "MFLYkqDB" + AXNjRSU + YRKHNea + tOJMEHS + bJTVxEM + mpoeoaC + NjjFgLI + bPsYPxu + wromPFK + XMTIMyr + GsDSCEh + ywSlDBm + dWqCpqJ + cgXsaOK + YfPcepH + PdzFhpp + "");
    }

    //垃圾方法
    private void uFmBmLKT(boolean hxtqpbi0, double ngvnsow1, byte kjkwyfnh2, short hakojfo3) {
        short hakojfo3a = hakojfo3;
        byte kjkwyfnh2a = kjkwyfnh2;
        double ngvnsow1a = ngvnsow1;
        boolean hxtqpbi0a = hxtqpbi0;
        new StringBuilder("uFmBmLKT" + hakojfo3a + kjkwyfnh2a + hxtqpbi0a + ngvnsow1a + "uFmBmLKT" + ywSlDBm + wromPFK + AXNjRSU + cgXsaOK + YRKHNea + bPsYPxu + YfPcepH + GsDSCEh + dWqCpqJ + mpoeoaC + NjjFgLI + XMTIMyr + bJTVxEM + PdzFhpp + tOJMEHS + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        short hakojfo3 = 24;
        byte kjkwyfnh2 = 25;
        double ngvnsow1 = 85.85;
        boolean hxtqpbi0 = false;
        int rbvqtcgv1 = 85;
        boolean dyxnsskhf0 = true;
        byte bjoavwmp4 = 6;
        byte cbryqorekm3 = 65;
        float nkdzjfgq2 = 96.96f;
        boolean rnmysxecu1 = true;
        char ldkrkdka0 = 4;
        boolean cdkoikw3 = false;
        float jccvcxyl2 = 89.89f;
        byte dtenveay1 = 24;
        char wuoifzcak0 = 95;
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void bKMGABJL(double yojhuvjaxc0) {
        double yojhuvjaxc0a = yojhuvjaxc0;
        new Intent("bKMGABJL" + yojhuvjaxc0a + "bKMGABJL" + "");
    }

    //垃圾方法
    static private void fgNmxosR(short bvphnvhx0, short ukyruijqu1) {
        short ukyruijqu1a = ukyruijqu1;
        short bvphnvhx0a = bvphnvhx0;
        new AttributedString("fgNmxosR" + bvphnvhx0a + ukyruijqu1a + "fgNmxosR" + "");
    }

    //垃圾方法
    static private void cQzvTEke(int obkolwuvd0) {
        int obkolwuvd0a = obkolwuvd0;
        new String("cQzvTEke" + obkolwuvd0a + "cQzvTEke" + "");
    }

    //垃圾方法
    static private void FvyfCPxu(int qnsrexwh0, long jomowiegog1, int ersfypn2, long wnwyjsky3) {
        long wnwyjsky3a = wnwyjsky3;
        int ersfypn2a = ersfypn2;
        long jomowiegog1a = jomowiegog1;
        int qnsrexwh0a = qnsrexwh0;
        System.out.println("FvyfCPxu" + wnwyjsky3a + jomowiegog1a + ersfypn2a + qnsrexwh0a + "FvyfCPxu" + "");
    }

    //垃圾方法
    static private void YBJgILgE(float tvnlejspc0) {
        float tvnlejspc0a = tvnlejspc0;
        TextUtils.isEmpty("YBJgILgE" + tvnlejspc0a + "YBJgILgE" + "");
    }

    //垃圾方法
    static private void FlmIudHI(float fgxckgkb0, long goxporx1, float tcglzjozc2, char dudplrco3, float haqkiyj4) {
        float haqkiyj4a = haqkiyj4;
        char dudplrco3a = dudplrco3;
        float tcglzjozc2a = tcglzjozc2;
        long goxporx1a = goxporx1;
        float fgxckgkb0a = fgxckgkb0;
        new StringReader("FlmIudHI" + dudplrco3a + haqkiyj4a + tcglzjozc2a + fgxckgkb0a + goxporx1a + "FlmIudHI" + "");
    }

    //垃圾方法
    static private void OuFcaHWs(double oymchoqc0) {
        double oymchoqc0a = oymchoqc0;
        new StringBuilder("OuFcaHWs" + oymchoqc0a + "OuFcaHWs" + "");
    }

    //垃圾方法
    static private void YUascxGp(int rbqpkexk0, short lmjpcvlvdf1, boolean lptwenc2) {
        boolean lptwenc2a = lptwenc2;
        short lmjpcvlvdf1a = lmjpcvlvdf1;
        int rbqpkexk0a = rbqpkexk0;
        new WeakReference("YUascxGp" + rbqpkexk0a + lptwenc2a + lmjpcvlvdf1a + "YUascxGp" + "");
    }

    //垃圾方法
    static private void clasGTLt(boolean ckznblom0) {
        boolean ckznblom0a = ckznblom0;
    }

    //垃圾方法
    static private void CPPkufff(double qpkruig0, double cdcryot1, double bwgvjltap2, short aajoewuab3) {
        short aajoewuab3a = aajoewuab3;
        double bwgvjltap2a = bwgvjltap2;
        double cdcryot1a = cdcryot1;
        double qpkruig0a = qpkruig0;
        new String("CPPkufff" + cdcryot1a + aajoewuab3a + bwgvjltap2a + qpkruig0a + "CPPkufff" + "");
    }

    //垃圾方法
    static private void FkvxuXUw(double lwpkecyom0, char qyytluct1) {
        char qyytluct1a = qyytluct1;
        double lwpkecyom0a = lwpkecyom0;
        new AttributedString("FkvxuXUw" + qyytluct1a + lwpkecyom0a + "FkvxuXUw" + "");
    }

    //垃圾方法
    static private void TxzRYFyM(char rodheat0) {
        char rodheat0a = rodheat0;
        new AttributedString("TxzRYFyM" + rodheat0a + "TxzRYFyM" + "");
    }

    public static void saveLastPushTime() {
        char rodheat0 = 32;
        char qyytluct1 = 84;
        double lwpkecyom0 = 61.61;
        short aajoewuab3 = 11;
        double bwgvjltap2 = 21.21;
        double cdcryot1 = 54.54;
        double qpkruig0 = 80.80;
        boolean ckznblom0 = false;
        boolean lptwenc2 = false;
        short lmjpcvlvdf1 = 94;
        int rbqpkexk0 = 84;
        double oymchoqc0 = 83.83;
        float haqkiyj4 = 72.72f;
        char dudplrco3 = 4;
        float tcglzjozc2 = 42.42f;
        long goxporx1 = 90L;
        float fgxckgkb0 = 41.41f;
        float tvnlejspc0 = 56.56f;
        long wnwyjsky3 = 82L;
        int ersfypn2 = 5;
        long jomowiegog1 = 20L;
        int qnsrexwh0 = 41;
        int obkolwuvd0 = 70;
        short ukyruijqu1 = 14;
        short bvphnvhx0 = 24;
        double yojhuvjaxc0 = 51.51;
        CPPkufff(qpkruig0, cdcryot1, bwgvjltap2, aajoewuab3);
        FkvxuXUw(lwpkecyom0, qyytluct1);
        FkvxuXUw(lwpkecyom0, qyytluct1);
        YBJgILgE(tvnlejspc0);
        OuFcaHWs(oymchoqc0);
        OuFcaHWs(oymchoqc0);
        long lastTime = GatorSPUtils.getLong("last_show_scene_time", 0L);
        YUascxGp(rbqpkexk0, lmjpcvlvdf1, lptwenc2);
        YBJgILgE(tvnlejspc0);
        YBJgILgE(tvnlejspc0);
        bKMGABJL(yojhuvjaxc0);
        bKMGABJL(yojhuvjaxc0);
        FlmIudHI(fgxckgkb0, goxporx1, tcglzjozc2, dudplrco3, haqkiyj4);
        cQzvTEke(obkolwuvd0);
        cQzvTEke(obkolwuvd0);
        fgNmxosR(bvphnvhx0, ukyruijqu1);
        if (lastTime != 0L && GatorUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            FvyfCPxu(qnsrexwh0, jomowiegog1, ersfypn2, wnwyjsky3);
            FvyfCPxu(qnsrexwh0, jomowiegog1, ersfypn2, wnwyjsky3);
            FlmIudHI(fgxckgkb0, goxporx1, tcglzjozc2, dudplrco3, haqkiyj4);
            int pushCount = GatorSPUtils.getInt("last_show_scene_time_count", 0);
            GatorSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            GatorSPUtils.putInt("last_show_scene_time_count", 1);
        }
        GatorSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void zpQdVVvm(short atbfxfydy0, long zejumwiihm1, char fwmsrdgf2, int ridekhyk3) {
        int ridekhyk3a = ridekhyk3;
        char fwmsrdgf2a = fwmsrdgf2;
        long zejumwiihm1a = zejumwiihm1;
        short atbfxfydy0a = atbfxfydy0;
    }

    //垃圾方法
    static private void hzNMfWvY(float umlysar0) {
        float umlysar0a = umlysar0;
        TextUtils.isDigitsOnly("hzNMfWvY" + umlysar0a + "hzNMfWvY" + "");
    }

    //垃圾方法
    static private void RJrWxOQD(char pdxvnbbs0, long hbnwtjvxk1, byte fsqbsnal2, byte kqgugvk3, boolean mcgtipuqh4) {
        boolean mcgtipuqh4a = mcgtipuqh4;
        byte kqgugvk3a = kqgugvk3;
        byte fsqbsnal2a = fsqbsnal2;
        long hbnwtjvxk1a = hbnwtjvxk1;
        char pdxvnbbs0a = pdxvnbbs0;
        new File("RJrWxOQD" + kqgugvk3a + hbnwtjvxk1a + pdxvnbbs0a + mcgtipuqh4a + fsqbsnal2a + "RJrWxOQD" + "");
    }

    //垃圾方法
    static private void ILFgOSSb(boolean xpmwpgz0, short pyjljsirp1) {
        short pyjljsirp1a = pyjljsirp1;
        boolean xpmwpgz0a = xpmwpgz0;
        new StringBuilder("ILFgOSSb" + pyjljsirp1a + xpmwpgz0a + "ILFgOSSb" + "");
    }

    public static long getLastShowPushTime() {
        short pyjljsirp1 = 26;
        boolean xpmwpgz0 = true;
        boolean mcgtipuqh4 = false;
        byte kqgugvk3 = 80;
        byte fsqbsnal2 = 35;
        long hbnwtjvxk1 = 100L;
        char pdxvnbbs0 = 8;
        float umlysar0 = 70.70f;
        int ridekhyk3 = 30;
        char fwmsrdgf2 = 56;
        long zejumwiihm1 = 81L;
        short atbfxfydy0 = 13;
        zpQdVVvm(atbfxfydy0, zejumwiihm1, fwmsrdgf2, ridekhyk3);
        zpQdVVvm(atbfxfydy0, zejumwiihm1, fwmsrdgf2, ridekhyk3);
        ILFgOSSb(xpmwpgz0, pyjljsirp1);
        ILFgOSSb(xpmwpgz0, pyjljsirp1);
        return GatorSPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void YiJEOlwR(float hrvdvxgln0, float pcrcztrxa1) {
        float pcrcztrxa1a = pcrcztrxa1;
        float hrvdvxgln0a = hrvdvxgln0;
        new File("YiJEOlwR" + pcrcztrxa1a + hrvdvxgln0a + "YiJEOlwR" + YfPcepH + dWqCpqJ + tOJMEHS + bPsYPxu + YRKHNea + XMTIMyr + cgXsaOK + mpoeoaC + bJTVxEM + GsDSCEh + PdzFhpp + ywSlDBm + wromPFK + AXNjRSU + NjjFgLI + "");
    }

    //垃圾方法
    private void vmwPylLj(float gyrpogstbf0, float lbquavx1) {
        float lbquavx1a = lbquavx1;
        float gyrpogstbf0a = gyrpogstbf0;
        System.out.println("vmwPylLj" + gyrpogstbf0a + lbquavx1a + "vmwPylLj" + ywSlDBm + mpoeoaC + tOJMEHS + PdzFhpp + AXNjRSU + NjjFgLI + bJTVxEM + bPsYPxu + cgXsaOK + XMTIMyr + YfPcepH + dWqCpqJ + wromPFK + GsDSCEh + YRKHNea + "");
    }

    //垃圾方法
    private void SwfqrXdx(double iboinit0, long ggkpgedtla1, double ruvyunnnhe2, byte ocduggvqu3) {
        byte ocduggvqu3a = ocduggvqu3;
        double ruvyunnnhe2a = ruvyunnnhe2;
        long ggkpgedtla1a = ggkpgedtla1;
        double iboinit0a = iboinit0;
        new File("SwfqrXdx" + iboinit0a + ggkpgedtla1a + ruvyunnnhe2a + ocduggvqu3a + "SwfqrXdx" + bPsYPxu + ywSlDBm + PdzFhpp + YRKHNea + YfPcepH + dWqCpqJ + GsDSCEh + AXNjRSU + bJTVxEM + NjjFgLI + cgXsaOK + tOJMEHS + wromPFK + XMTIMyr + mpoeoaC + "");
    }

    //垃圾方法
    private void PCINopMh(char rgxymddsgk0, double npjcbev1, long kzlkbnyuw2, short mqymcnfue3, short oqqfhru4) {
        short oqqfhru4a = oqqfhru4;
        short mqymcnfue3a = mqymcnfue3;
        long kzlkbnyuw2a = kzlkbnyuw2;
        double npjcbev1a = npjcbev1;
        char rgxymddsgk0a = rgxymddsgk0;
        TextUtils.isEmpty("PCINopMh" + mqymcnfue3a + oqqfhru4a + npjcbev1a + rgxymddsgk0a + kzlkbnyuw2a + "PCINopMh" + wromPFK + YfPcepH + bJTVxEM + ywSlDBm + dWqCpqJ + NjjFgLI + cgXsaOK + mpoeoaC + XMTIMyr + tOJMEHS + AXNjRSU + YRKHNea + GsDSCEh + PdzFhpp + bPsYPxu + "");
    }

    @Nullable
    public final Activity getCurrActivity() {
        short oqqfhru4 = 27;
        short mqymcnfue3 = 22;
        long kzlkbnyuw2 = 83L;
        double npjcbev1 = 63.63;
        char rgxymddsgk0 = 7;
        byte ocduggvqu3 = 90;
        double ruvyunnnhe2 = 84.84;
        long ggkpgedtla1 = 87L;
        double iboinit0 = 8.8;
        float lbquavx1 = 15.15f;
        float gyrpogstbf0 = 80.80f;
        float pcrcztrxa1 = 99.99f;
        float hrvdvxgln0 = 92.92f;
        YiJEOlwR(hrvdvxgln0, pcrcztrxa1);
        YiJEOlwR(hrvdvxgln0, pcrcztrxa1);
        vmwPylLj(gyrpogstbf0, lbquavx1);
        PCINopMh(rgxymddsgk0, npjcbev1, kzlkbnyuw2, mqymcnfue3, oqqfhru4);
        vmwPylLj(gyrpogstbf0, lbquavx1);
        vmwPylLj(gyrpogstbf0, lbquavx1);
        SwfqrXdx(iboinit0, ggkpgedtla1, ruvyunnnhe2, ocduggvqu3);
        PCINopMh(rgxymddsgk0, npjcbev1, kzlkbnyuw2, mqymcnfue3, oqqfhru4);
        PCINopMh(rgxymddsgk0, npjcbev1, kzlkbnyuw2, mqymcnfue3, oqqfhru4);
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void LsuhRkTi(byte egvptyat0, float rujqphqjxx1, char xamkbtu2, char rtafxxmv3, char pquzjbtimy4) {
        char pquzjbtimy4a = pquzjbtimy4;
        char rtafxxmv3a = rtafxxmv3;
        char xamkbtu2a = xamkbtu2;
        float rujqphqjxx1a = rujqphqjxx1;
        byte egvptyat0a = egvptyat0;
        new WeakReference("LsuhRkTi" + pquzjbtimy4a + egvptyat0a + rujqphqjxx1a + rtafxxmv3a + xamkbtu2a + "LsuhRkTi" + wromPFK + GsDSCEh + AXNjRSU + mpoeoaC + cgXsaOK + PdzFhpp + tOJMEHS + bPsYPxu + YfPcepH + dWqCpqJ + NjjFgLI + bJTVxEM + XMTIMyr + YRKHNea + ywSlDBm + "");
    }

    //垃圾方法
    private void dNhsHfqz(float jjgjojsvu0, short isnbknb1, char squyknabsb2, byte gxjahcflyk3, char gqtcilpvw4) {
        char gqtcilpvw4a = gqtcilpvw4;
        byte gxjahcflyk3a = gxjahcflyk3;
        char squyknabsb2a = squyknabsb2;
        short isnbknb1a = isnbknb1;
        float jjgjojsvu0a = jjgjojsvu0;
        new StringBuilder("dNhsHfqz" + gxjahcflyk3a + gqtcilpvw4a + squyknabsb2a + jjgjojsvu0a + isnbknb1a + "dNhsHfqz" + tOJMEHS + PdzFhpp + cgXsaOK + dWqCpqJ + YfPcepH + mpoeoaC + YRKHNea + NjjFgLI + wromPFK + ywSlDBm + bPsYPxu + bJTVxEM + XMTIMyr + GsDSCEh + AXNjRSU + "");
    }

    //垃圾方法
    private void ZPrYgJfi(float vyzaajezmo0, byte foivsmlwz1, short ewiysxdnz2) {
        short ewiysxdnz2a = ewiysxdnz2;
        byte foivsmlwz1a = foivsmlwz1;
        float vyzaajezmo0a = vyzaajezmo0;
        System.out.println("ZPrYgJfi" + ewiysxdnz2a + foivsmlwz1a + vyzaajezmo0a + "ZPrYgJfi" + bPsYPxu + bJTVxEM + wromPFK + AXNjRSU + YfPcepH + dWqCpqJ + NjjFgLI + tOJMEHS + XMTIMyr + GsDSCEh + YRKHNea + PdzFhpp + mpoeoaC + cgXsaOK + ywSlDBm + "");
    }

    //垃圾方法
    private void HSsaEzTR(byte agryzuhlbr0, int gpnpiobmvd1, float tqiucrctu2, float yshidymwma3, double azmwouejgj4) {
        double azmwouejgj4a = azmwouejgj4;
        float yshidymwma3a = yshidymwma3;
        float tqiucrctu2a = tqiucrctu2;
        int gpnpiobmvd1a = gpnpiobmvd1;
        byte agryzuhlbr0a = agryzuhlbr0;
        new AttributedString("HSsaEzTR" + yshidymwma3a + tqiucrctu2a + agryzuhlbr0a + gpnpiobmvd1a + azmwouejgj4a + "HSsaEzTR" + mpoeoaC + cgXsaOK + dWqCpqJ + tOJMEHS + bPsYPxu + YRKHNea + YfPcepH + ywSlDBm + XMTIMyr + wromPFK + AXNjRSU + GsDSCEh + PdzFhpp + bJTVxEM + NjjFgLI + "");
    }

    //垃圾方法
    private void sshOXAIC(byte dazlhhpyfy0, int vvxksbrv1, double guzmscaouh2, short qteqfhe3, double bcznkdcsl4) {
        double bcznkdcsl4a = bcznkdcsl4;
        short qteqfhe3a = qteqfhe3;
        double guzmscaouh2a = guzmscaouh2;
        int vvxksbrv1a = vvxksbrv1;
        byte dazlhhpyfy0a = dazlhhpyfy0;
        Log.i("sshOXAIC", "sshOXAIC" + qteqfhe3a + dazlhhpyfy0a + guzmscaouh2a + bcznkdcsl4a + vvxksbrv1a + "sshOXAIC" + YRKHNea + NjjFgLI + wromPFK + XMTIMyr + bPsYPxu + GsDSCEh + ywSlDBm + tOJMEHS + bJTVxEM + PdzFhpp + dWqCpqJ + mpoeoaC + YfPcepH + AXNjRSU + cgXsaOK + "");
    }

    //垃圾方法
    private void QKyhLabs(double wggrrlb0, byte elmdnuc1, double uqtbzlwl2, float gycqqqtvzt3) {
        float gycqqqtvzt3a = gycqqqtvzt3;
        double uqtbzlwl2a = uqtbzlwl2;
        byte elmdnuc1a = elmdnuc1;
        double wggrrlb0a = wggrrlb0;
        new WeakReference("QKyhLabs" + gycqqqtvzt3a + wggrrlb0a + uqtbzlwl2a + elmdnuc1a + "QKyhLabs" + cgXsaOK + ywSlDBm + mpoeoaC + wromPFK + XMTIMyr + NjjFgLI + bPsYPxu + YRKHNea + YfPcepH + PdzFhpp + GsDSCEh + bJTVxEM + tOJMEHS + AXNjRSU + dWqCpqJ + "");
    }

    //垃圾方法
    private void RmRpMnqn(boolean rnyavby0) {
        boolean rnyavby0a = rnyavby0;
        System.out.println("RmRpMnqn" + rnyavby0a + "RmRpMnqn" + bPsYPxu + PdzFhpp + tOJMEHS + YRKHNea + cgXsaOK + XMTIMyr + NjjFgLI + bJTVxEM + wromPFK + YfPcepH + mpoeoaC + GsDSCEh + ywSlDBm + AXNjRSU + dWqCpqJ + "");
    }

    //垃圾方法
    private void pXezJcBO(int jmxvozno0, short avuuvlk1, float xerypnon2, boolean whsotwvcc3) {
        boolean whsotwvcc3a = whsotwvcc3;
        float xerypnon2a = xerypnon2;
        short avuuvlk1a = avuuvlk1;
        int jmxvozno0a = jmxvozno0;
        new AttributedString("pXezJcBO" + xerypnon2a + jmxvozno0a + whsotwvcc3a + avuuvlk1a + "pXezJcBO" + wromPFK + AXNjRSU + PdzFhpp + bJTVxEM + tOJMEHS + YfPcepH + YRKHNea + NjjFgLI + bPsYPxu + cgXsaOK + XMTIMyr + GsDSCEh + mpoeoaC + dWqCpqJ + ywSlDBm + "");
    }

    public final void killAllActivity() {
        boolean whsotwvcc3 = true;
        float xerypnon2 = 64.64f;
        short avuuvlk1 = 27;
        int jmxvozno0 = 25;
        boolean rnyavby0 = true;
        float gycqqqtvzt3 = 78.78f;
        double uqtbzlwl2 = 89.89;
        byte elmdnuc1 = 96;
        double wggrrlb0 = 40.40;
        double bcznkdcsl4 = 77.77;
        short qteqfhe3 = 37;
        double guzmscaouh2 = 59.59;
        int vvxksbrv1 = 4;
        byte dazlhhpyfy0 = 55;
        double azmwouejgj4 = 87.87;
        float yshidymwma3 = 36.36f;
        float tqiucrctu2 = 57.57f;
        int gpnpiobmvd1 = 91;
        byte agryzuhlbr0 = 67;
        short ewiysxdnz2 = 23;
        byte foivsmlwz1 = 33;
        float vyzaajezmo0 = 23.23f;
        char gqtcilpvw4 = 10;
        byte gxjahcflyk3 = 35;
        char squyknabsb2 = 73;
        short isnbknb1 = 0;
        float jjgjojsvu0 = 80.80f;
        char pquzjbtimy4 = 8;
        char rtafxxmv3 = 62;
        char xamkbtu2 = 22;
        float rujqphqjxx1 = 73.73f;
        byte egvptyat0 = 23;
        Iterator<Activity> var3 = livingActivities.iterator();
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private GatorManager() {
    }

    //垃圾方法
    static private void nASTPJOf(long ufkwhiumm0, long ngoujtp1, boolean tqokumszvl2) {
        boolean tqokumszvl2a = tqokumszvl2;
        long ngoujtp1a = ngoujtp1;
        long ufkwhiumm0a = ufkwhiumm0;
        new StringReader("nASTPJOf" + ufkwhiumm0a + tqokumszvl2a + ngoujtp1a + "nASTPJOf" + "");
    }

    //垃圾方法
    static private void WEvqZBCd(float pdpepgsl0, byte hnhdzsvz1) {
        byte hnhdzsvz1a = hnhdzsvz1;
        float pdpepgsl0a = pdpepgsl0;
        new StringBuffer("WEvqZBCd" + hnhdzsvz1a + pdpepgsl0a + "WEvqZBCd" + "");
    }

    //垃圾方法
    static private void qCsLTWcc(byte bnanejwbdv0) {
        byte bnanejwbdv0a = bnanejwbdv0;
        new String("qCsLTWcc" + bnanejwbdv0a + "qCsLTWcc" + "");
    }

    //垃圾方法
    static private void ficyNzft(int muqqershxz0, boolean zvxxwsn1, byte acbtkcnho2, float mivpuiyemp3, short clmtlqyb4) {
        short clmtlqyb4a = clmtlqyb4;
        float mivpuiyemp3a = mivpuiyemp3;
        byte acbtkcnho2a = acbtkcnho2;
        boolean zvxxwsn1a = zvxxwsn1;
        int muqqershxz0a = muqqershxz0;
        new AttributedString("ficyNzft" + muqqershxz0a + acbtkcnho2a + zvxxwsn1a + clmtlqyb4a + mivpuiyemp3a + "ficyNzft" + "");
    }

    public static boolean isNotificationEnabled() {
        short clmtlqyb4 = 39;
        float mivpuiyemp3 = 54.54f;
        byte acbtkcnho2 = 31;
        boolean zvxxwsn1 = false;
        int muqqershxz0 = 38;
        byte bnanejwbdv0 = 65;
        byte hnhdzsvz1 = 7;
        float pdpepgsl0 = 48.48f;
        boolean tqokumszvl2 = true;
        long ngoujtp1 = 43L;
        long ufkwhiumm0 = 72L;
        qCsLTWcc(bnanejwbdv0);
        ficyNzft(muqqershxz0, zvxxwsn1, acbtkcnho2, mivpuiyemp3, clmtlqyb4);
        nASTPJOf(ufkwhiumm0, ngoujtp1, tqokumszvl2);
        qCsLTWcc(bnanejwbdv0);
        qCsLTWcc(bnanejwbdv0);
        return GatorNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void GiMrmMIA(boolean yahcokp0, long creiili1, int lmwcbohxbn2, long eaioxsvluh3) {
        long eaioxsvluh3a = eaioxsvluh3;
        int lmwcbohxbn2a = lmwcbohxbn2;
        long creiili1a = creiili1;
        boolean yahcokp0a = yahcokp0;
        new WeakReference("GiMrmMIA" + yahcokp0a + creiili1a + eaioxsvluh3a + lmwcbohxbn2a + "GiMrmMIA" + "");
    }

    //垃圾方法
    static private void ZfUdNJDL(double wgwhjjeca0, float kkuovlv1, byte thcapmhs2, char yzhdycfovn3, boolean mqdmbigip4) {
        boolean mqdmbigip4a = mqdmbigip4;
        char yzhdycfovn3a = yzhdycfovn3;
        byte thcapmhs2a = thcapmhs2;
        float kkuovlv1a = kkuovlv1;
        double wgwhjjeca0a = wgwhjjeca0;
        new StringBuffer("ZfUdNJDL" + yzhdycfovn3a + mqdmbigip4a + kkuovlv1a + thcapmhs2a + wgwhjjeca0a + "ZfUdNJDL" + "");
    }

    //垃圾方法
    static private void hdNqgfyF(int gdcvdday0, char dhykfdhv1, boolean okbefwi2) {
        boolean okbefwi2a = okbefwi2;
        char dhykfdhv1a = dhykfdhv1;
        int gdcvdday0a = gdcvdday0;
        TextUtils.isEmpty("hdNqgfyF" + gdcvdday0a + okbefwi2a + dhykfdhv1a + "hdNqgfyF" + "");
    }

    //垃圾方法
    static private void EHkBuaae(float mssoqwwq0, boolean bdkiilcji1) {
        boolean bdkiilcji1a = bdkiilcji1;
        float mssoqwwq0a = mssoqwwq0;
        Log.e("EHkBuaae", "EHkBuaae" + mssoqwwq0a + bdkiilcji1a + "EHkBuaae" + "");
    }

    //垃圾方法
    static private void FSYRvQEr(int hohtkwwde0, boolean oqexqtz1) {
        boolean oqexqtz1a = oqexqtz1;
        int hohtkwwde0a = hohtkwwde0;
        new StringBuilder("FSYRvQEr" + oqexqtz1a + hohtkwwde0a + "FSYRvQEr" + "");
    }

    //垃圾方法
    static private void mfAPlKkt(float fogtfwmd0, short jukvpgup1) {
        short jukvpgup1a = jukvpgup1;
        float fogtfwmd0a = fogtfwmd0;
        new AttributedString("mfAPlKkt" + jukvpgup1a + fogtfwmd0a + "mfAPlKkt" + "");
    }

    //垃圾方法
    static private void fkVyDsCO(float adxhwsla0, char umpjgtuajo1, short fbspebgbze2, short opupwpv3) {
        short opupwpv3a = opupwpv3;
        short fbspebgbze2a = fbspebgbze2;
        char umpjgtuajo1a = umpjgtuajo1;
        float adxhwsla0a = adxhwsla0;
        new StringBuffer("fkVyDsCO" + opupwpv3a + umpjgtuajo1a + adxhwsla0a + fbspebgbze2a + "fkVyDsCO" + "");
    }

    //垃圾方法
    static private void xIkeYdeT(char pnaazpvuwu0, char xuoyusoajg1) {
        char xuoyusoajg1a = xuoyusoajg1;
        char pnaazpvuwu0a = pnaazpvuwu0;
        System.out.println("xIkeYdeT" + xuoyusoajg1a + pnaazpvuwu0a + "xIkeYdeT" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        char xuoyusoajg1 = 65;
        char pnaazpvuwu0 = 39;
        short opupwpv3 = 71;
        short fbspebgbze2 = 38;
        char umpjgtuajo1 = 75;
        float adxhwsla0 = 51.51f;
        short jukvpgup1 = 76;
        float fogtfwmd0 = 38.38f;
        boolean oqexqtz1 = true;
        int hohtkwwde0 = 73;
        boolean bdkiilcji1 = false;
        float mssoqwwq0 = 89.89f;
        boolean okbefwi2 = false;
        char dhykfdhv1 = 76;
        int gdcvdday0 = 26;
        boolean mqdmbigip4 = true;
        char yzhdycfovn3 = 54;
        byte thcapmhs2 = 54;
        float kkuovlv1 = 2.2f;
        double wgwhjjeca0 = 79.79;
        long eaioxsvluh3 = 6L;
        int lmwcbohxbn2 = 40;
        long creiili1 = 70L;
        boolean yahcokp0 = true;
        if (VERSION.SDK_INT >= 28) {
            FSYRvQEr(hohtkwwde0, oqexqtz1);
            FSYRvQEr(hohtkwwde0, oqexqtz1);
            fkVyDsCO(adxhwsla0, umpjgtuajo1, fbspebgbze2, opupwpv3);
            FSYRvQEr(hohtkwwde0, oqexqtz1);
            GiMrmMIA(yahcokp0, creiili1, lmwcbohxbn2, eaioxsvluh3);
            EHkBuaae(mssoqwwq0, bdkiilcji1);
            GiMrmMIA(yahcokp0, creiili1, lmwcbohxbn2, eaioxsvluh3);
            Log.e("xxx", "Application.getProcessName()=" + Application.getProcessName());
        }
        ZfUdNJDL(wgwhjjeca0, kkuovlv1, thcapmhs2, yzhdycfovn3, mqdmbigip4);
        ZfUdNJDL(wgwhjjeca0, kkuovlv1, thcapmhs2, yzhdycfovn3, mqdmbigip4);
        hdNqgfyF(gdcvdday0, dhykfdhv1, okbefwi2);
        GiMrmMIA(yahcokp0, creiili1, lmwcbohxbn2, eaioxsvluh3);
        if (VERSION.SDK_INT >= 28) {
            mfAPlKkt(fogtfwmd0, jukvpgup1);
            EHkBuaae(mssoqwwq0, bdkiilcji1);
            xIkeYdeT(pnaazpvuwu0, xuoyusoajg1);
            GiMrmMIA(yahcokp0, creiili1, lmwcbohxbn2, eaioxsvluh3);
            GiMrmMIA(yahcokp0, creiili1, lmwcbohxbn2, eaioxsvluh3);
            fkVyDsCO(adxhwsla0, umpjgtuajo1, fbspebgbze2, opupwpv3);
            fkVyDsCO(adxhwsla0, umpjgtuajo1, fbspebgbze2, opupwpv3);
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
    static private void ecfghbVi(short yxztjlumun0, short wufqdtkyaq1, byte riwolzox2, double fnxrezrhud3, boolean yannpvvatn4) {
        boolean yannpvvatn4a = yannpvvatn4;
        double fnxrezrhud3a = fnxrezrhud3;
        byte riwolzox2a = riwolzox2;
        short wufqdtkyaq1a = wufqdtkyaq1;
        short yxztjlumun0a = yxztjlumun0;
        TextUtils.isEmpty("ecfghbVi" + yannpvvatn4a + fnxrezrhud3a + yxztjlumun0a + riwolzox2a + wufqdtkyaq1a + "ecfghbVi" + "");
    }

    //垃圾方法
    static private void eIKiwMSo(int vofpxcx0) {
        int vofpxcx0a = vofpxcx0;
        new String("eIKiwMSo" + vofpxcx0a + "eIKiwMSo" + "");
    }

    //垃圾方法
    static private void dTmOZlUP(boolean bwttkcbqki0, float mntjhok1, char mcclvjer2, long wfdatzz3, byte lnpfjcw4) {
        byte lnpfjcw4a = lnpfjcw4;
        long wfdatzz3a = wfdatzz3;
        char mcclvjer2a = mcclvjer2;
        float mntjhok1a = mntjhok1;
        boolean bwttkcbqki0a = bwttkcbqki0;
        new StringReader("dTmOZlUP" + wfdatzz3a + bwttkcbqki0a + lnpfjcw4a + mntjhok1a + mcclvjer2a + "dTmOZlUP" + "");
    }

    //垃圾方法
    static private void SuYZKgBB(byte rtrtjpjr0, double dtdfcwrury1, byte fmidreson2) {
        byte fmidreson2a = fmidreson2;
        double dtdfcwrury1a = dtdfcwrury1;
        byte rtrtjpjr0a = rtrtjpjr0;
        TextUtils.isDigitsOnly("SuYZKgBB" + rtrtjpjr0a + fmidreson2a + dtdfcwrury1a + "SuYZKgBB" + "");
    }

    public static void testFcmToken(String token) {
        byte fmidreson2 = 2;
        double dtdfcwrury1 = 51.51;
        byte rtrtjpjr0 = 13;
        byte lnpfjcw4 = 14;
        long wfdatzz3 = 45L;
        char mcclvjer2 = 100;
        float mntjhok1 = 61.61f;
        boolean bwttkcbqki0 = false;
        int vofpxcx0 = 42;
        boolean yannpvvatn4 = true;
        double fnxrezrhud3 = 97.97;
        byte riwolzox2 = 57;
        short wufqdtkyaq1 = 35;
        short yxztjlumun0 = 54;
        dTmOZlUP(bwttkcbqki0, mntjhok1, mcclvjer2, wfdatzz3, lnpfjcw4);
        SuYZKgBB(rtrtjpjr0, dtdfcwrury1, fmidreson2);
        eIKiwMSo(vofpxcx0);
        eIKiwMSo(vofpxcx0);
        SuYZKgBB(rtrtjpjr0, dtdfcwrury1, fmidreson2);
        ecfghbVi(yxztjlumun0, wufqdtkyaq1, riwolzox2, fnxrezrhud3, yannpvvatn4);
        SuYZKgBB(rtrtjpjr0, dtdfcwrury1, fmidreson2);
        eIKiwMSo(vofpxcx0);
        dTmOZlUP(bwttkcbqki0, mntjhok1, mcclvjer2, wfdatzz3, lnpfjcw4);
        GatorMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void FfRYZxvu(double xatodsab0, byte fauslmeajp1, long ohkjagqbak2) {
            long ohkjagqbak2a = ohkjagqbak2;
            byte fauslmeajp1a = fauslmeajp1;
            double xatodsab0a = xatodsab0;
            new StringReader("FfRYZxvu" + fauslmeajp1a + xatodsab0a + ohkjagqbak2a + "FfRYZxvu" + "" + "");
        }

        //垃圾方法
        private void ApELyaUl(long ovrsxiwj0, short iwbhfxdk1) {
            short iwbhfxdk1a = iwbhfxdk1;
            long ovrsxiwj0a = ovrsxiwj0;
            System.out.println("ApELyaUl" + ovrsxiwj0a + iwbhfxdk1a + "ApELyaUl" + "" + "");
        }

        //垃圾方法
        private void szkkqUNt(boolean wtqqehm0) {
            boolean wtqqehm0a = wtqqehm0;
            new String("szkkqUNt" + wtqqehm0a + "szkkqUNt" + "" + "");
        }

        //垃圾方法
        private void qESSJEzT(int xjjceetih0, float zpnqlom1, double ltskwqp2, short tjpefjr3) {
            short tjpefjr3a = tjpefjr3;
            double ltskwqp2a = ltskwqp2;
            float zpnqlom1a = zpnqlom1;
            int xjjceetih0a = xjjceetih0;
            System.out.println("qESSJEzT" + xjjceetih0a + tjpefjr3a + zpnqlom1a + ltskwqp2a + "qESSJEzT" + "" + "");
        }

        //垃圾方法
        private void mfOgaglV(char ynidqsxqf0, char lszfwcvbnx1, short qocxlahs2, boolean jgxtbqaon3, char jfamcyla4) {
            char jfamcyla4a = jfamcyla4;
            boolean jgxtbqaon3a = jgxtbqaon3;
            short qocxlahs2a = qocxlahs2;
            char lszfwcvbnx1a = lszfwcvbnx1;
            char ynidqsxqf0a = ynidqsxqf0;
            new StringBuffer("mfOgaglV" + lszfwcvbnx1a + ynidqsxqf0a + qocxlahs2a + jgxtbqaon3a + jfamcyla4a + "mfOgaglV" + "" + "");
        }

        //垃圾方法
        private void cUlEjLEN(short usmwylh0, boolean rizhqrhv1, int fmrrskbmle2, char dxhvthoo3, char qqezeaai4) {
            char qqezeaai4a = qqezeaai4;
            char dxhvthoo3a = dxhvthoo3;
            int fmrrskbmle2a = fmrrskbmle2;
            boolean rizhqrhv1a = rizhqrhv1;
            short usmwylh0a = usmwylh0;
            Log.i("cUlEjLEN", "cUlEjLEN" + dxhvthoo3a + usmwylh0a + qqezeaai4a + fmrrskbmle2a + rizhqrhv1a + "cUlEjLEN" + "" + "");
        }

        //垃圾方法
        private void GwBukQsa(int rpzzjnyy0, int diamhjccfe1, char syrqtqms2, short wensfqlxii3) {
            short wensfqlxii3a = wensfqlxii3;
            char syrqtqms2a = syrqtqms2;
            int diamhjccfe1a = diamhjccfe1;
            int rpzzjnyy0a = rpzzjnyy0;
            new File("GwBukQsa" + syrqtqms2a + wensfqlxii3a + rpzzjnyy0a + diamhjccfe1a + "GwBukQsa" + "" + "");
        }

        //垃圾方法
        private void wDaUoMsd(boolean mchpbth0, long fgtuymlfqe1) {
            long fgtuymlfqe1a = fgtuymlfqe1;
            boolean mchpbth0a = mchpbth0;
            new File("wDaUoMsd" + mchpbth0a + fgtuymlfqe1a + "wDaUoMsd" + "" + "");
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            long fgtuymlfqe1 = 87L;
            boolean mchpbth0 = true;
            short wensfqlxii3 = 30;
            char syrqtqms2 = 71;
            int diamhjccfe1 = 9;
            int rpzzjnyy0 = 51;
            char qqezeaai4 = 68;
            char dxhvthoo3 = 57;
            int fmrrskbmle2 = 26;
            boolean rizhqrhv1 = true;
            short usmwylh0 = 74;
            char jfamcyla4 = 26;
            boolean jgxtbqaon3 = false;
            short qocxlahs2 = 25;
            char lszfwcvbnx1 = 58;
            char ynidqsxqf0 = 83;
            short tjpefjr3 = 42;
            double ltskwqp2 = 75.75;
            float zpnqlom1 = 40.40f;
            int xjjceetih0 = 1;
            boolean wtqqehm0 = true;
            short iwbhfxdk1 = 60;
            long ovrsxiwj0 = 74L;
            long ohkjagqbak2 = 78L;
            byte fauslmeajp1 = 71;
            double xatodsab0 = 87.87;
            GatorSPUtils.putLong("lastActivityOnPause", 0L);
            FfRYZxvu(xatodsab0, fauslmeajp1, ohkjagqbak2);
            mfOgaglV(ynidqsxqf0, lszfwcvbnx1, qocxlahs2, jgxtbqaon3, jfamcyla4);
            ApELyaUl(ovrsxiwj0, iwbhfxdk1);
            ApELyaUl(ovrsxiwj0, iwbhfxdk1);
            GwBukQsa(rpzzjnyy0, diamhjccfe1, syrqtqms2, wensfqlxii3);
            qESSJEzT(xjjceetih0, zpnqlom1, ltskwqp2, tjpefjr3);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void fjQEFNSm(char ilzkpadix0, int caqcwviu1, byte jnonnqxq2, double oaatmwtna3) {
            double oaatmwtna3a = oaatmwtna3;
            byte jnonnqxq2a = jnonnqxq2;
            int caqcwviu1a = caqcwviu1;
            char ilzkpadix0a = ilzkpadix0;
            Log.e("fjQEFNSm", "fjQEFNSm" + jnonnqxq2a + caqcwviu1a + oaatmwtna3a + ilzkpadix0a + "fjQEFNSm" + "" + "");
        }

        //垃圾方法
        private void LySRvWjm(boolean lrbrburacz0, long rwhglffzhk1, float nuchkfvv2) {
            float nuchkfvv2a = nuchkfvv2;
            long rwhglffzhk1a = rwhglffzhk1;
            boolean lrbrburacz0a = lrbrburacz0;
            new StringBuffer("LySRvWjm" + lrbrburacz0a + rwhglffzhk1a + nuchkfvv2a + "LySRvWjm" + "" + "");
        }

        //垃圾方法
        private void sZDJuCQs(boolean etkfiud0, boolean fserebinjs1, float dtwibubidt2, char hwsevzem3, char arbwktvdi4) {
            char arbwktvdi4a = arbwktvdi4;
            char hwsevzem3a = hwsevzem3;
            float dtwibubidt2a = dtwibubidt2;
            boolean fserebinjs1a = fserebinjs1;
            boolean etkfiud0a = etkfiud0;
            new WeakReference("sZDJuCQs" + arbwktvdi4a + fserebinjs1a + etkfiud0a + dtwibubidt2a + hwsevzem3a + "sZDJuCQs" + "" + "");
        }

        //垃圾方法
        private void gqbxWSBf(double jaoogdmws0, float bqvqwsbmg1, short rrfcrdar2, short uzsojtpexq3, byte lxxdphoqq4) {
            byte lxxdphoqq4a = lxxdphoqq4;
            short uzsojtpexq3a = uzsojtpexq3;
            short rrfcrdar2a = rrfcrdar2;
            float bqvqwsbmg1a = bqvqwsbmg1;
            double jaoogdmws0a = jaoogdmws0;
            System.out.println("gqbxWSBf" + rrfcrdar2a + uzsojtpexq3a + lxxdphoqq4a + jaoogdmws0a + bqvqwsbmg1a + "gqbxWSBf" + "" + "");
        }

        //垃圾方法
        private void MAiMpWbb(char cccqylhi0, byte bmgmkag1, byte txrtvwrr2) {
            byte txrtvwrr2a = txrtvwrr2;
            byte bmgmkag1a = bmgmkag1;
            char cccqylhi0a = cccqylhi0;
            System.out.println("MAiMpWbb" + txrtvwrr2a + cccqylhi0a + bmgmkag1a + "MAiMpWbb" + "" + "");
        }

        //垃圾方法
        private void zxWyVmtk(long kytcbnmb0, float kioydgmti1, boolean yoofxjoon2, short biyzwvznzt3) {
            short biyzwvznzt3a = biyzwvznzt3;
            boolean yoofxjoon2a = yoofxjoon2;
            float kioydgmti1a = kioydgmti1;
            long kytcbnmb0a = kytcbnmb0;
            System.out.println("zxWyVmtk" + kioydgmti1a + kytcbnmb0a + yoofxjoon2a + biyzwvznzt3a + "zxWyVmtk" + "" + "");
        }

        //垃圾方法
        private void EqASuHtv(short nzmlwdcg0) {
            short nzmlwdcg0a = nzmlwdcg0;
            new Thread("EqASuHtv" + nzmlwdcg0a + "EqASuHtv" + "" + "");
        }

        //垃圾方法
        private void sXzNThuR(boolean tbymrycb0) {
            boolean tbymrycb0a = tbymrycb0;
            new Intent("sXzNThuR" + tbymrycb0a + "sXzNThuR" + "" + "");
        }

        //垃圾方法
        private void NoPVOjin(double zrwlkrhdpi0, long pzbhsmoht1) {
            long pzbhsmoht1a = pzbhsmoht1;
            double zrwlkrhdpi0a = zrwlkrhdpi0;
        }

        //垃圾方法
        private void sCpPOZSB(float gzytosp0, float jrdtkwowoa1, byte bidqltp2, char gsciksgw3) {
            char gsciksgw3a = gsciksgw3;
            byte bidqltp2a = bidqltp2;
            float jrdtkwowoa1a = jrdtkwowoa1;
            float gzytosp0a = gzytosp0;
            new WeakReference("sCpPOZSB" + gzytosp0a + gsciksgw3a + bidqltp2a + jrdtkwowoa1a + "sCpPOZSB" + "" + "");
        }

        //垃圾方法
        private void ZhfDqjhR(byte hrnfrvlszj0, short aanoxmkr1) {
            short aanoxmkr1a = aanoxmkr1;
            byte hrnfrvlszj0a = hrnfrvlszj0;
            new Intent("ZhfDqjhR" + aanoxmkr1a + hrnfrvlszj0a + "ZhfDqjhR" + "" + "");
        }

        //垃圾方法
        private void liCRalkh(float nenwlbc0, float ogynebxm1, char irtdunrvlv2, long ycxzjkbn3, long qvinrzlf4) {
            long qvinrzlf4a = qvinrzlf4;
            long ycxzjkbn3a = ycxzjkbn3;
            char irtdunrvlv2a = irtdunrvlv2;
            float ogynebxm1a = ogynebxm1;
            float nenwlbc0a = nenwlbc0;
            new AttributedString("liCRalkh" + ycxzjkbn3a + nenwlbc0a + irtdunrvlv2a + ogynebxm1a + qvinrzlf4a + "liCRalkh" + "" + "");
        }

        //垃圾方法
        private void jukaNKup(short smizdfw0, boolean zphmuuz1) {
            boolean zphmuuz1a = zphmuuz1;
            short smizdfw0a = smizdfw0;
            new WeakReference("jukaNKup" + zphmuuz1a + smizdfw0a + "jukaNKup" + "" + "");
        }

        //垃圾方法
        private void KAeStPFj(byte kknbdirql0, int jzvnixjsx1, char manvscv2, char jjupwjderm3) {
            char jjupwjderm3a = jjupwjderm3;
            char manvscv2a = manvscv2;
            int jzvnixjsx1a = jzvnixjsx1;
            byte kknbdirql0a = kknbdirql0;
            Log.w("KAeStPFj", "KAeStPFj" + manvscv2a + kknbdirql0a + jzvnixjsx1a + jjupwjderm3a + "KAeStPFj" + "" + "");
        }

        //垃圾方法
        private void xKXzhzZf(boolean zgzpend0, boolean mtaeihjbt1, byte fpmmbzm2) {
            byte fpmmbzm2a = fpmmbzm2;
            boolean mtaeihjbt1a = mtaeihjbt1;
            boolean zgzpend0a = zgzpend0;
            new Intent("xKXzhzZf" + fpmmbzm2a + zgzpend0a + mtaeihjbt1a + "xKXzhzZf" + "" + "");
        }

        //垃圾方法
        private void WLjhfRzd(short yqbaolxzu0, double zmrrrot1, char pxeacum2, int xjbilobkgn3, char mxmwlgulz4) {
            char mxmwlgulz4a = mxmwlgulz4;
            int xjbilobkgn3a = xjbilobkgn3;
            char pxeacum2a = pxeacum2;
            double zmrrrot1a = zmrrrot1;
            short yqbaolxzu0a = yqbaolxzu0;
            new File("WLjhfRzd" + xjbilobkgn3a + mxmwlgulz4a + zmrrrot1a + pxeacum2a + yqbaolxzu0a + "WLjhfRzd" + "" + "");
        }

        //垃圾方法
        private void YMRyvwhc(long upendxkjql0, boolean qqoibtps1, double yfdohpkxx2) {
            double yfdohpkxx2a = yfdohpkxx2;
            boolean qqoibtps1a = qqoibtps1;
            long upendxkjql0a = upendxkjql0;
            new StringBuffer("YMRyvwhc" + yfdohpkxx2a + upendxkjql0a + qqoibtps1a + "YMRyvwhc" + "" + "");
        }

        //垃圾方法
        private void tYHVpTgw(long nzflhkklbq0, long agihnfppko1, double ihcocpmd2, boolean orgtlofvgb3, int ivobfum4) {
            int ivobfum4a = ivobfum4;
            boolean orgtlofvgb3a = orgtlofvgb3;
            double ihcocpmd2a = ihcocpmd2;
            long agihnfppko1a = agihnfppko1;
            long nzflhkklbq0a = nzflhkklbq0;
            Log.i("tYHVpTgw", "tYHVpTgw" + ihcocpmd2a + nzflhkklbq0a + orgtlofvgb3a + ivobfum4a + agihnfppko1a + "tYHVpTgw" + "" + "");
        }

        //垃圾方法
        private void hUDLfhfi(float wuzewzcegp0, byte gsaccqilb1, long zearedbpc2, char npejktmqy3, int tpqqxzpsr4) {
            int tpqqxzpsr4a = tpqqxzpsr4;
            char npejktmqy3a = npejktmqy3;
            long zearedbpc2a = zearedbpc2;
            byte gsaccqilb1a = gsaccqilb1;
            float wuzewzcegp0a = wuzewzcegp0;
            new String("hUDLfhfi" + gsaccqilb1a + tpqqxzpsr4a + zearedbpc2a + wuzewzcegp0a + npejktmqy3a + "hUDLfhfi" + "" + "");
        }

        //垃圾方法
        private void wRsleMLv(byte dencwhssh0, byte dxrhsmwski1, short gsswwtsxtj2, byte kwrnsho3, char nbtwrkjwt4) {
            char nbtwrkjwt4a = nbtwrkjwt4;
            byte kwrnsho3a = kwrnsho3;
            short gsswwtsxtj2a = gsswwtsxtj2;
            byte dxrhsmwski1a = dxrhsmwski1;
            byte dencwhssh0a = dencwhssh0;
            new WeakReference("wRsleMLv" + dencwhssh0a + gsswwtsxtj2a + dxrhsmwski1a + nbtwrkjwt4a + kwrnsho3a + "wRsleMLv" + "" + "");
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            char nbtwrkjwt4 = 100;
            byte kwrnsho3 = 43;
            short gsswwtsxtj2 = 59;
            byte dxrhsmwski1 = 84;
            byte dencwhssh0 = 46;
            int tpqqxzpsr4 = 39;
            char npejktmqy3 = 70;
            long zearedbpc2 = 60L;
            byte gsaccqilb1 = 7;
            float wuzewzcegp0 = 81.81f;
            int ivobfum4 = 51;
            boolean orgtlofvgb3 = false;
            double ihcocpmd2 = 93.93;
            long agihnfppko1 = 93L;
            long nzflhkklbq0 = 73L;
            double yfdohpkxx2 = 47.47;
            boolean qqoibtps1 = false;
            long upendxkjql0 = 63L;
            char mxmwlgulz4 = 80;
            int xjbilobkgn3 = 33;
            char pxeacum2 = 89;
            double zmrrrot1 = 80.80;
            short yqbaolxzu0 = 27;
            byte fpmmbzm2 = 62;
            boolean mtaeihjbt1 = false;
            boolean zgzpend0 = true;
            char jjupwjderm3 = 53;
            char manvscv2 = 75;
            int jzvnixjsx1 = 56;
            byte kknbdirql0 = 71;
            boolean zphmuuz1 = true;
            short smizdfw0 = 79;
            long qvinrzlf4 = 31L;
            long ycxzjkbn3 = 8L;
            char irtdunrvlv2 = 18;
            float ogynebxm1 = 99.99f;
            float nenwlbc0 = 5.5f;
            short aanoxmkr1 = 84;
            byte hrnfrvlszj0 = 23;
            char gsciksgw3 = 71;
            byte bidqltp2 = 22;
            float jrdtkwowoa1 = 24.24f;
            float gzytosp0 = 8.8f;
            long pzbhsmoht1 = 84L;
            double zrwlkrhdpi0 = 40.40;
            boolean tbymrycb0 = true;
            short nzmlwdcg0 = 44;
            short biyzwvznzt3 = 91;
            boolean yoofxjoon2 = true;
            float kioydgmti1 = 84.84f;
            long kytcbnmb0 = 41L;
            byte txrtvwrr2 = 3;
            byte bmgmkag1 = 32;
            char cccqylhi0 = 31;
            byte lxxdphoqq4 = 55;
            short uzsojtpexq3 = 50;
            short rrfcrdar2 = 29;
            float bqvqwsbmg1 = 59.59f;
            double jaoogdmws0 = 63.63;
            char arbwktvdi4 = 86;
            char hwsevzem3 = 89;
            float dtwibubidt2 = 53.53f;
            boolean fserebinjs1 = false;
            boolean etkfiud0 = true;
            float nuchkfvv2 = 77.77f;
            long rwhglffzhk1 = 72L;
            boolean lrbrburacz0 = true;
            double oaatmwtna3 = 96.96;
            byte jnonnqxq2 = 83;
            int caqcwviu1 = 23;
            char ilzkpadix0 = 32;
            LySRvWjm(lrbrburacz0, rwhglffzhk1, nuchkfvv2);
            xKXzhzZf(zgzpend0, mtaeihjbt1, fpmmbzm2);
            tYHVpTgw(nzflhkklbq0, agihnfppko1, ihcocpmd2, orgtlofvgb3, ivobfum4);
            sZDJuCQs(etkfiud0, fserebinjs1, dtwibubidt2, hwsevzem3, arbwktvdi4);
            tYHVpTgw(nzflhkklbq0, agihnfppko1, ihcocpmd2, orgtlofvgb3, ivobfum4);
            YMRyvwhc(upendxkjql0, qqoibtps1, yfdohpkxx2);
            GatorSPUtils.putLong("lastActivityOnPause", 0L);
            GatorManager.INSTANCE.setCurrentActivity(activity);
            GatorManager.creatingActivities.add(activity);
            sXzNThuR(tbymrycb0);
            LySRvWjm(lrbrburacz0, rwhglffzhk1, nuchkfvv2);
            MAiMpWbb(cccqylhi0, bmgmkag1, txrtvwrr2);
            YMRyvwhc(upendxkjql0, qqoibtps1, yfdohpkxx2);
            GatorManager.livingActivities.add(activity);
            GatorManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void CVyuTWBA(int wttjivjam0) {
            int wttjivjam0a = wttjivjam0;
        }

        //垃圾方法
        private void QvAIXMAv(long vviyrguue0, float ykgqkbsb1) {
            float ykgqkbsb1a = ykgqkbsb1;
            long vviyrguue0a = vviyrguue0;
            TextUtils.isEmpty("QvAIXMAv" + vviyrguue0a + ykgqkbsb1a + "QvAIXMAv" + "" + "");
        }

        //垃圾方法
        private void cFRzWjXf(byte hlbuivznlf0, char nuakarsgkw1, char iarfxqytl2) {
            char iarfxqytl2a = iarfxqytl2;
            char nuakarsgkw1a = nuakarsgkw1;
            byte hlbuivznlf0a = hlbuivznlf0;
            new WeakReference("cFRzWjXf" + iarfxqytl2a + hlbuivznlf0a + nuakarsgkw1a + "cFRzWjXf" + "" + "");
        }

        //垃圾方法
        private void jLsnmRIC(float dmiyhvhbah0, double sslevwsu1) {
            double sslevwsu1a = sslevwsu1;
            float dmiyhvhbah0a = dmiyhvhbah0;
            new StringBuilder("jLsnmRIC" + dmiyhvhbah0a + sslevwsu1a + "jLsnmRIC" + "" + "");
        }

        public void onActivityStarted(@NotNull Activity activity) {
            double sslevwsu1 = 55.55;
            float dmiyhvhbah0 = 9.9f;
            char iarfxqytl2 = 30;
            char nuakarsgkw1 = 37;
            byte hlbuivznlf0 = 44;
            float ykgqkbsb1 = 65.65f;
            long vviyrguue0 = 6L;
            int wttjivjam0 = 7;
            GatorManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void BLfxQfyi(short tjmggupgn0, int bnkrrqcuo1, char hhzzdsg2, byte nqnhtrq3, char pnulydsv4) {
            char pnulydsv4a = pnulydsv4;
            byte nqnhtrq3a = nqnhtrq3;
            char hhzzdsg2a = hhzzdsg2;
            int bnkrrqcuo1a = bnkrrqcuo1;
            short tjmggupgn0a = tjmggupgn0;
            new String("BLfxQfyi" + nqnhtrq3a + pnulydsv4a + bnkrrqcuo1a + hhzzdsg2a + tjmggupgn0a + "BLfxQfyi" + "" + "");
        }

        //垃圾方法
        private void lxXFGJVU(short gdkzmwedu0) {
            short gdkzmwedu0a = gdkzmwedu0;
            new WeakReference("lxXFGJVU" + gdkzmwedu0a + "lxXFGJVU" + "" + "");
        }

        //垃圾方法
        private void cYzDHbGQ(long pkyfvgwt0, long hexojvflu1, double lwgddeiqcx2) {
            double lwgddeiqcx2a = lwgddeiqcx2;
            long hexojvflu1a = hexojvflu1;
            long pkyfvgwt0a = pkyfvgwt0;
            TextUtils.isDigitsOnly("cYzDHbGQ" + pkyfvgwt0a + hexojvflu1a + lwgddeiqcx2a + "cYzDHbGQ" + "" + "");
        }

        //垃圾方法
        private void NZoFbqyq(boolean ybjeboa0, int vwydpykm1) {
            int vwydpykm1a = vwydpykm1;
            boolean ybjeboa0a = ybjeboa0;
            new StringReader("NZoFbqyq" + ybjeboa0a + vwydpykm1a + "NZoFbqyq" + "" + "");
        }

        //垃圾方法
        private void lLVOPsxP(int zeprlpzrbi0, short knwnjrax1, boolean whqkscx2) {
            boolean whqkscx2a = whqkscx2;
            short knwnjrax1a = knwnjrax1;
            int zeprlpzrbi0a = zeprlpzrbi0;
            Log.e("lLVOPsxP", "lLVOPsxP" + knwnjrax1a + whqkscx2a + zeprlpzrbi0a + "lLVOPsxP" + "" + "");
        }

        //垃圾方法
        private void KvkJPfsU(float sivemnuy0, int khpuoydvkl1, char uerwnhs2, int vxismkqr3, float yuolofkhb4) {
            float yuolofkhb4a = yuolofkhb4;
            int vxismkqr3a = vxismkqr3;
            char uerwnhs2a = uerwnhs2;
            int khpuoydvkl1a = khpuoydvkl1;
            float sivemnuy0a = sivemnuy0;
            Log.i("KvkJPfsU", "KvkJPfsU" + vxismkqr3a + uerwnhs2a + yuolofkhb4a + khpuoydvkl1a + sivemnuy0a + "KvkJPfsU" + "" + "");
        }

        //垃圾方法
        private void VHRVGFMP(char kbpszcn0, boolean acddvukij1, long hrprkcfakd2, long hdlgxjf3) {
            long hdlgxjf3a = hdlgxjf3;
            long hrprkcfakd2a = hrprkcfakd2;
            boolean acddvukij1a = acddvukij1;
            char kbpszcn0a = kbpszcn0;
            new StringBuffer("VHRVGFMP" + hdlgxjf3a + acddvukij1a + kbpszcn0a + hrprkcfakd2a + "VHRVGFMP" + "" + "");
        }

        //垃圾方法
        private void RzdDFLei(boolean ttbmftead0, short lqgluji1, double njeacrqm2, byte wiabbgq3, int mnfzifj4) {
            int mnfzifj4a = mnfzifj4;
            byte wiabbgq3a = wiabbgq3;
            double njeacrqm2a = njeacrqm2;
            short lqgluji1a = lqgluji1;
            boolean ttbmftead0a = ttbmftead0;
            new Intent("RzdDFLei" + wiabbgq3a + ttbmftead0a + njeacrqm2a + mnfzifj4a + lqgluji1a + "RzdDFLei" + "" + "");
        }

        //垃圾方法
        private void QknOObLA(long lzcspeszr0, double kwanitm1) {
            double kwanitm1a = kwanitm1;
            long lzcspeszr0a = lzcspeszr0;
            new StringBuffer("QknOObLA" + kwanitm1a + lzcspeszr0a + "QknOObLA" + "" + "");
        }

        //垃圾方法
        private void rWgYOFGp(int vcevrhdtpc0, int bistwqaua1, char qnrxaphl2) {
            char qnrxaphl2a = qnrxaphl2;
            int bistwqaua1a = bistwqaua1;
            int vcevrhdtpc0a = vcevrhdtpc0;
            new File("rWgYOFGp" + vcevrhdtpc0a + qnrxaphl2a + bistwqaua1a + "rWgYOFGp" + "" + "");
        }

        //垃圾方法
        private void icqgpCgk(char lppcinryr0, int gdjdltsy1, boolean ybnfnor2) {
            boolean ybnfnor2a = ybnfnor2;
            int gdjdltsy1a = gdjdltsy1;
            char lppcinryr0a = lppcinryr0;
            new File("icqgpCgk" + lppcinryr0a + ybnfnor2a + gdjdltsy1a + "icqgpCgk" + "" + "");
        }

        //垃圾方法
        private void loNOSeFB(double lvpgblnxac0, long mwwswsjvmc1, boolean mirgveu2) {
            boolean mirgveu2a = mirgveu2;
            long mwwswsjvmc1a = mwwswsjvmc1;
            double lvpgblnxac0a = lvpgblnxac0;
            TextUtils.isDigitsOnly("loNOSeFB" + mirgveu2a + mwwswsjvmc1a + lvpgblnxac0a + "loNOSeFB" + "" + "");
        }

        //垃圾方法
        private void yURiEkry(double rtkhcgw0, short qlunlncfzu1) {
            short qlunlncfzu1a = qlunlncfzu1;
            double rtkhcgw0a = rtkhcgw0;
            new WeakReference("yURiEkry" + rtkhcgw0a + qlunlncfzu1a + "yURiEkry" + "" + "");
        }

        //垃圾方法
        private void qDPZEIVt(double kbkbvxdas0, boolean tmgpplevxc1, long bdtnhutc2, float wcxolpq3) {
            float wcxolpq3a = wcxolpq3;
            long bdtnhutc2a = bdtnhutc2;
            boolean tmgpplevxc1a = tmgpplevxc1;
            double kbkbvxdas0a = kbkbvxdas0;
            TextUtils.isEmpty("qDPZEIVt" + tmgpplevxc1a + bdtnhutc2a + kbkbvxdas0a + wcxolpq3a + "qDPZEIVt" + "" + "");
        }

        //垃圾方法
        private void FftHTVpW(float jdqnuojzpu0) {
            float jdqnuojzpu0a = jdqnuojzpu0;
            new StringReader("FftHTVpW" + jdqnuojzpu0a + "FftHTVpW" + "" + "");
        }

        //垃圾方法
        private void KwyREEwq(byte nnaulfbnv0, double hkieuxqy1) {
            double hkieuxqy1a = hkieuxqy1;
            byte nnaulfbnv0a = nnaulfbnv0;
            Log.e("KwyREEwq", "KwyREEwq" + nnaulfbnv0a + hkieuxqy1a + "KwyREEwq" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            double hkieuxqy1 = 93.93;
            byte nnaulfbnv0 = 38;
            float jdqnuojzpu0 = 98.98f;
            float wcxolpq3 = 54.54f;
            long bdtnhutc2 = 58L;
            boolean tmgpplevxc1 = false;
            double kbkbvxdas0 = 76.76;
            short qlunlncfzu1 = 57;
            double rtkhcgw0 = 57.57;
            boolean mirgveu2 = false;
            long mwwswsjvmc1 = 10L;
            double lvpgblnxac0 = 75.75;
            boolean ybnfnor2 = true;
            int gdjdltsy1 = 82;
            char lppcinryr0 = 54;
            char qnrxaphl2 = 10;
            int bistwqaua1 = 51;
            int vcevrhdtpc0 = 43;
            double kwanitm1 = 56.56;
            long lzcspeszr0 = 54L;
            int mnfzifj4 = 26;
            byte wiabbgq3 = 95;
            double njeacrqm2 = 10.10;
            short lqgluji1 = 85;
            boolean ttbmftead0 = true;
            long hdlgxjf3 = 48L;
            long hrprkcfakd2 = 2L;
            boolean acddvukij1 = false;
            char kbpszcn0 = 26;
            float yuolofkhb4 = 10.10f;
            int vxismkqr3 = 95;
            char uerwnhs2 = 36;
            int khpuoydvkl1 = 13;
            float sivemnuy0 = 12.12f;
            boolean whqkscx2 = true;
            short knwnjrax1 = 17;
            int zeprlpzrbi0 = 99;
            int vwydpykm1 = 32;
            boolean ybjeboa0 = false;
            double lwgddeiqcx2 = 21.21;
            long hexojvflu1 = 20L;
            long pkyfvgwt0 = 84L;
            short gdkzmwedu0 = 44;
            char pnulydsv4 = 53;
            byte nqnhtrq3 = 100;
            char hhzzdsg2 = 3;
            int bnkrrqcuo1 = 76;
            short tjmggupgn0 = 92;
            GatorSPUtils.putLong("lastActivityOnPause", 0L);
            GatorManager.INSTANCE.setCurrentActivity(activity);
            GatorManager.creatingActivities.remove(activity);
            GatorManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void DEdRqkMD(float adaqmphuqe0, short fnylylqfk1, double bkiextf2) {
            double bkiextf2a = bkiextf2;
            short fnylylqfk1a = fnylylqfk1;
            float adaqmphuqe0a = adaqmphuqe0;
            new WeakReference("DEdRqkMD" + fnylylqfk1a + bkiextf2a + adaqmphuqe0a + "DEdRqkMD" + "" + "");
        }

        //垃圾方法
        private void qofaboiA(int thxqijmr0, float mccjpioak1, double ywgnasjuv2, byte sofydcscaf3, double aiaopgezpe4) {
            double aiaopgezpe4a = aiaopgezpe4;
            byte sofydcscaf3a = sofydcscaf3;
            double ywgnasjuv2a = ywgnasjuv2;
            float mccjpioak1a = mccjpioak1;
            int thxqijmr0a = thxqijmr0;
        }

        //垃圾方法
        private void LlXFTaxX(boolean cpdojdxdc0, boolean khutmiomdu1, float npxyiye2, boolean jboeylzm3) {
            boolean jboeylzm3a = jboeylzm3;
            float npxyiye2a = npxyiye2;
            boolean khutmiomdu1a = khutmiomdu1;
            boolean cpdojdxdc0a = cpdojdxdc0;
            new AttributedString("LlXFTaxX" + khutmiomdu1a + npxyiye2a + jboeylzm3a + cpdojdxdc0a + "LlXFTaxX" + "" + "");
        }

        //垃圾方法
        private void aohpjCFa(boolean ewfqaidx0, float uezoxkq1, char ymzxsvl2, byte fodmbyicp3) {
            byte fodmbyicp3a = fodmbyicp3;
            char ymzxsvl2a = ymzxsvl2;
            float uezoxkq1a = uezoxkq1;
            boolean ewfqaidx0a = ewfqaidx0;
            new File("aohpjCFa" + uezoxkq1a + fodmbyicp3a + ymzxsvl2a + ewfqaidx0a + "aohpjCFa" + "" + "");
        }

        //垃圾方法
        private void JYKHDnUm(long xhnlazal0, char kolfeibv1, short rgmtuqjff2, byte fbiadda3, short odgllfn4) {
            short odgllfn4a = odgllfn4;
            byte fbiadda3a = fbiadda3;
            short rgmtuqjff2a = rgmtuqjff2;
            char kolfeibv1a = kolfeibv1;
            long xhnlazal0a = xhnlazal0;
            new StringBuffer("JYKHDnUm" + fbiadda3a + kolfeibv1a + odgllfn4a + xhnlazal0a + rgmtuqjff2a + "JYKHDnUm" + "" + "");
        }

        //垃圾方法
        private void vrdFDBNo(float lnylmcnlhg0, short rstzyqph1) {
            short rstzyqph1a = rstzyqph1;
            float lnylmcnlhg0a = lnylmcnlhg0;
            new Intent("vrdFDBNo" + lnylmcnlhg0a + rstzyqph1a + "vrdFDBNo" + "" + "");
        }

        //垃圾方法
        private void WYueOtKx(byte hrnvhzmd0, boolean tpfnrdahpe1, char anhjvxsbn2, short pmojfsjffy3, double igyoparj4) {
            double igyoparj4a = igyoparj4;
            short pmojfsjffy3a = pmojfsjffy3;
            char anhjvxsbn2a = anhjvxsbn2;
            boolean tpfnrdahpe1a = tpfnrdahpe1;
            byte hrnvhzmd0a = hrnvhzmd0;
            new Thread("WYueOtKx" + tpfnrdahpe1a + hrnvhzmd0a + igyoparj4a + anhjvxsbn2a + pmojfsjffy3a + "WYueOtKx" + "" + "");
        }

        //垃圾方法
        private void lTSBYymS(short hgavigkx0) {
            short hgavigkx0a = hgavigkx0;
            TextUtils.isDigitsOnly("lTSBYymS" + hgavigkx0a + "lTSBYymS" + "" + "");
        }

        //垃圾方法
        private void QyhgPbCI(byte mquptjfm0) {
            byte mquptjfm0a = mquptjfm0;
            TextUtils.isEmpty("QyhgPbCI" + mquptjfm0a + "QyhgPbCI" + "" + "");
        }

        //垃圾方法
        private void aoFPEevL(char zyiphrzcs0, boolean clbtjgpjj1, long umcfxgmeez2) {
            long umcfxgmeez2a = umcfxgmeez2;
            boolean clbtjgpjj1a = clbtjgpjj1;
            char zyiphrzcs0a = zyiphrzcs0;
            TextUtils.isDigitsOnly("aoFPEevL" + clbtjgpjj1a + umcfxgmeez2a + zyiphrzcs0a + "aoFPEevL" + "" + "");
        }

        //垃圾方法
        private void rEUPubfS(char zfmqzjjh0, double pyyhecihk1, char hscqhqohz2, char hoehglg3, byte pojybvbf4) {
            byte pojybvbf4a = pojybvbf4;
            char hoehglg3a = hoehglg3;
            char hscqhqohz2a = hscqhqohz2;
            double pyyhecihk1a = pyyhecihk1;
            char zfmqzjjh0a = zfmqzjjh0;
            new Intent("rEUPubfS" + hscqhqohz2a + zfmqzjjh0a + hoehglg3a + pojybvbf4a + pyyhecihk1a + "rEUPubfS" + "" + "");
        }

        //垃圾方法
        private void MQOnOqwb(short dygjesyvcp0, float piwicznvi1, short otnzjtgjg2, byte kvnxqykl3) {
            byte kvnxqykl3a = kvnxqykl3;
            short otnzjtgjg2a = otnzjtgjg2;
            float piwicznvi1a = piwicznvi1;
            short dygjesyvcp0a = dygjesyvcp0;
            Log.w("MQOnOqwb", "MQOnOqwb" + piwicznvi1a + kvnxqykl3a + dygjesyvcp0a + otnzjtgjg2a + "MQOnOqwb" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            byte kvnxqykl3 = 40;
            short otnzjtgjg2 = 40;
            float piwicznvi1 = 14.14f;
            short dygjesyvcp0 = 64;
            byte pojybvbf4 = 89;
            char hoehglg3 = 15;
            char hscqhqohz2 = 8;
            double pyyhecihk1 = 95.95;
            char zfmqzjjh0 = 99;
            long umcfxgmeez2 = 83L;
            boolean clbtjgpjj1 = true;
            char zyiphrzcs0 = 43;
            byte mquptjfm0 = 87;
            short hgavigkx0 = 72;
            double igyoparj4 = 87.87;
            short pmojfsjffy3 = 71;
            char anhjvxsbn2 = 39;
            boolean tpfnrdahpe1 = false;
            byte hrnvhzmd0 = 19;
            short rstzyqph1 = 22;
            float lnylmcnlhg0 = 72.72f;
            short odgllfn4 = 38;
            byte fbiadda3 = 39;
            short rgmtuqjff2 = 9;
            char kolfeibv1 = 71;
            long xhnlazal0 = 24L;
            byte fodmbyicp3 = 92;
            char ymzxsvl2 = 47;
            float uezoxkq1 = 90.90f;
            boolean ewfqaidx0 = true;
            boolean jboeylzm3 = true;
            float npxyiye2 = 56.56f;
            boolean khutmiomdu1 = true;
            boolean cpdojdxdc0 = false;
            double aiaopgezpe4 = 41.41;
            byte sofydcscaf3 = 75;
            double ywgnasjuv2 = 50.50;
            float mccjpioak1 = 50.50f;
            int thxqijmr0 = 44;
            double bkiextf2 = 78.78;
            short fnylylqfk1 = 29;
            float adaqmphuqe0 = 86.86f;
            qofaboiA(thxqijmr0, mccjpioak1, ywgnasjuv2, sofydcscaf3, aiaopgezpe4);
            JYKHDnUm(xhnlazal0, kolfeibv1, rgmtuqjff2, fbiadda3, odgllfn4);
            vrdFDBNo(lnylmcnlhg0, rstzyqph1);
            GatorManager.INSTANCE.setPaused(true);
            GatorManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            aoFPEevL(zyiphrzcs0, clbtjgpjj1, umcfxgmeez2);
            DEdRqkMD(adaqmphuqe0, fnylylqfk1, bkiextf2);
            vrdFDBNo(lnylmcnlhg0, rstzyqph1);
            rEUPubfS(zfmqzjjh0, pyyhecihk1, hscqhqohz2, hoehglg3, pojybvbf4);
            JYKHDnUm(xhnlazal0, kolfeibv1, rgmtuqjff2, fbiadda3, odgllfn4);
            vrdFDBNo(lnylmcnlhg0, rstzyqph1);
            JYKHDnUm(xhnlazal0, kolfeibv1, rgmtuqjff2, fbiadda3, odgllfn4);
            MQOnOqwb(dygjesyvcp0, piwicznvi1, otnzjtgjg2, kvnxqykl3);
            LlXFTaxX(cpdojdxdc0, khutmiomdu1, npxyiye2, jboeylzm3);
            rEUPubfS(zfmqzjjh0, pyyhecihk1, hscqhqohz2, hoehglg3, pojybvbf4);
            GatorManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void HYAjEmjP(byte pssqqydsud0, short fejrffif1) {
            short fejrffif1a = fejrffif1;
            byte pssqqydsud0a = pssqqydsud0;
            Log.i("HYAjEmjP", "HYAjEmjP" + pssqqydsud0a + fejrffif1a + "HYAjEmjP" + "" + "");
        }

        //垃圾方法
        private void XFPwcTOv(byte htarjddsn0, int cfisfnzdpv1, int qzfouus2) {
            int qzfouus2a = qzfouus2;
            int cfisfnzdpv1a = cfisfnzdpv1;
            byte htarjddsn0a = htarjddsn0;
            new Thread("XFPwcTOv" + qzfouus2a + cfisfnzdpv1a + htarjddsn0a + "XFPwcTOv" + "" + "");
        }

        //垃圾方法
        private void iGlPTIGy(int jzkrisik0, boolean wuyoppwaqn1) {
            boolean wuyoppwaqn1a = wuyoppwaqn1;
            int jzkrisik0a = jzkrisik0;
            new StringBuffer("iGlPTIGy" + wuyoppwaqn1a + jzkrisik0a + "iGlPTIGy" + "" + "");
        }

        //垃圾方法
        private void YnkNjVzV(float lkcccigf0, long sojiwdljc1) {
            long sojiwdljc1a = sojiwdljc1;
            float lkcccigf0a = lkcccigf0;
            System.out.println("YnkNjVzV" + sojiwdljc1a + lkcccigf0a + "YnkNjVzV" + "" + "");
        }

        //垃圾方法
        private void ddhxIEhh(float abdkrjlval0, char urcszaeyj1, int etpunuwhjd2) {
            int etpunuwhjd2a = etpunuwhjd2;
            char urcszaeyj1a = urcszaeyj1;
            float abdkrjlval0a = abdkrjlval0;
            new StringBuilder("ddhxIEhh" + etpunuwhjd2a + urcszaeyj1a + abdkrjlval0a + "ddhxIEhh" + "" + "");
        }

        //垃圾方法
        private void hpRnaxRu(byte ppjzflb0) {
            byte ppjzflb0a = ppjzflb0;
            new StringBuilder("hpRnaxRu" + ppjzflb0a + "hpRnaxRu" + "" + "");
        }

        //垃圾方法
        private void UhoLhXhE(byte cauxkyq0, byte gdohnnaxl1, byte wdnxevu2) {
            byte wdnxevu2a = wdnxevu2;
            byte gdohnnaxl1a = gdohnnaxl1;
            byte cauxkyq0a = cauxkyq0;
            Log.w("UhoLhXhE", "UhoLhXhE" + cauxkyq0a + gdohnnaxl1a + wdnxevu2a + "UhoLhXhE" + "" + "");
        }

        //垃圾方法
        private void VPFNWNBj(double ysgyqjelxh0, boolean splocgkuq1, boolean mlljhno2) {
            boolean mlljhno2a = mlljhno2;
            boolean splocgkuq1a = splocgkuq1;
            double ysgyqjelxh0a = ysgyqjelxh0;
            new String("VPFNWNBj" + splocgkuq1a + ysgyqjelxh0a + mlljhno2a + "VPFNWNBj" + "" + "");
        }

        public void onActivityStopped(@NotNull Activity activity) {
            boolean mlljhno2 = true;
            boolean splocgkuq1 = true;
            double ysgyqjelxh0 = 14.14;
            byte wdnxevu2 = 10;
            byte gdohnnaxl1 = 12;
            byte cauxkyq0 = 55;
            byte ppjzflb0 = 0;
            int etpunuwhjd2 = 35;
            char urcszaeyj1 = 86;
            float abdkrjlval0 = 88.88f;
            long sojiwdljc1 = 9L;
            float lkcccigf0 = 40.40f;
            boolean wuyoppwaqn1 = true;
            int jzkrisik0 = 37;
            int qzfouus2 = 68;
            int cfisfnzdpv1 = 44;
            byte htarjddsn0 = 13;
            short fejrffif1 = 3;
            byte pssqqydsud0 = 28;
            GatorManager.visibleActivities.remove(activity);
            GatorManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void pjXnbMYj(float owmojom0, double ysiivnskaw1) {
            double ysiivnskaw1a = ysiivnskaw1;
            float owmojom0a = owmojom0;
            new File("pjXnbMYj" + ysiivnskaw1a + owmojom0a + "pjXnbMYj" + "" + "");
        }

        //垃圾方法
        private void wVNsBorq(short zaadcwp0, byte pmsvwpojd1, char szaqnqp2, float xzmidhhnhj3) {
            float xzmidhhnhj3a = xzmidhhnhj3;
            char szaqnqp2a = szaqnqp2;
            byte pmsvwpojd1a = pmsvwpojd1;
            short zaadcwp0a = zaadcwp0;
            new StringReader("wVNsBorq" + xzmidhhnhj3a + pmsvwpojd1a + zaadcwp0a + szaqnqp2a + "wVNsBorq" + "" + "");
        }

        //垃圾方法
        private void DFPfiiwD(long yjnlbhvl0, short urwsspppn1, byte nadtvqf2) {
            byte nadtvqf2a = nadtvqf2;
            short urwsspppn1a = urwsspppn1;
            long yjnlbhvl0a = yjnlbhvl0;
            Log.i("DFPfiiwD", "DFPfiiwD" + nadtvqf2a + yjnlbhvl0a + urwsspppn1a + "DFPfiiwD" + "" + "");
        }

        //垃圾方法
        private void WKhjgRtX(boolean othbbyybz0) {
            boolean othbbyybz0a = othbbyybz0;
            Log.w("WKhjgRtX", "WKhjgRtX" + othbbyybz0a + "WKhjgRtX" + "" + "");
        }

        //垃圾方法
        private void IOhVBDHg(byte oofyigw0) {
            byte oofyigw0a = oofyigw0;
            new StringBuilder("IOhVBDHg" + oofyigw0a + "IOhVBDHg" + "" + "");
        }

        //垃圾方法
        private void iLpwiiAe(byte djwnnkya0, char vajcgyms1) {
            char vajcgyms1a = vajcgyms1;
            byte djwnnkya0a = djwnnkya0;
            new AttributedString("iLpwiiAe" + djwnnkya0a + vajcgyms1a + "iLpwiiAe" + "" + "");
        }

        //垃圾方法
        private void NBgeUBuZ(byte abegial0, int pjxpsweqd1, float zhhtrjcgpv2, byte roifzwnyh3) {
            byte roifzwnyh3a = roifzwnyh3;
            float zhhtrjcgpv2a = zhhtrjcgpv2;
            int pjxpsweqd1a = pjxpsweqd1;
            byte abegial0a = abegial0;
            new WeakReference("NBgeUBuZ" + roifzwnyh3a + abegial0a + zhhtrjcgpv2a + pjxpsweqd1a + "NBgeUBuZ" + "" + "");
        }

        //垃圾方法
        private void FBTqEnPj(byte udvfhed0, byte koypznozyy1, char iqqpdrxlad2) {
            char iqqpdrxlad2a = iqqpdrxlad2;
            byte koypznozyy1a = koypznozyy1;
            byte udvfhed0a = udvfhed0;
            TextUtils.isDigitsOnly("FBTqEnPj" + iqqpdrxlad2a + udvfhed0a + koypznozyy1a + "FBTqEnPj" + "" + "");
        }

        //垃圾方法
        private void lkcOKxwG(char inohzsbml0, double vhjoqkrah1, float tssixwne2, long tqnuqcswt3) {
            long tqnuqcswt3a = tqnuqcswt3;
            float tssixwne2a = tssixwne2;
            double vhjoqkrah1a = vhjoqkrah1;
            char inohzsbml0a = inohzsbml0;
            TextUtils.isDigitsOnly("lkcOKxwG" + tqnuqcswt3a + inohzsbml0a + tssixwne2a + vhjoqkrah1a + "lkcOKxwG" + "" + "");
        }

        //垃圾方法
        private void LartHqsZ(double srjczosz0, byte cnadqvujnz1, float nibagums2, int odhtdexvw3, float tvviqcnyft4) {
            float tvviqcnyft4a = tvviqcnyft4;
            int odhtdexvw3a = odhtdexvw3;
            float nibagums2a = nibagums2;
            byte cnadqvujnz1a = cnadqvujnz1;
            double srjczosz0a = srjczosz0;
            new StringReader("LartHqsZ" + nibagums2a + tvviqcnyft4a + cnadqvujnz1a + odhtdexvw3a + srjczosz0a + "LartHqsZ" + "" + "");
        }

        //垃圾方法
        private void eQZARFhp(int qgsdscteao0, double xanvdcmewf1, byte xcknyylz2, short selnwotj3) {
            short selnwotj3a = selnwotj3;
            byte xcknyylz2a = xcknyylz2;
            double xanvdcmewf1a = xanvdcmewf1;
            int qgsdscteao0a = qgsdscteao0;
            Log.w("eQZARFhp", "eQZARFhp" + xanvdcmewf1a + selnwotj3a + xcknyylz2a + qgsdscteao0a + "eQZARFhp" + "" + "");
        }

        //垃圾方法
        private void lPdkbqUe(byte fqhkoianmr0, byte erjmuatb1, char wrzpusn2) {
            char wrzpusn2a = wrzpusn2;
            byte erjmuatb1a = erjmuatb1;
            byte fqhkoianmr0a = fqhkoianmr0;
            new Thread("lPdkbqUe" + fqhkoianmr0a + wrzpusn2a + erjmuatb1a + "lPdkbqUe" + "" + "");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            char wrzpusn2 = 43;
            byte erjmuatb1 = 25;
            byte fqhkoianmr0 = 54;
            short selnwotj3 = 60;
            byte xcknyylz2 = 8;
            double xanvdcmewf1 = 24.24;
            int qgsdscteao0 = 82;
            float tvviqcnyft4 = 81.81f;
            int odhtdexvw3 = 8;
            float nibagums2 = 36.36f;
            byte cnadqvujnz1 = 89;
            double srjczosz0 = 12.12;
            long tqnuqcswt3 = 21L;
            float tssixwne2 = 83.83f;
            double vhjoqkrah1 = 29.29;
            char inohzsbml0 = 82;
            char iqqpdrxlad2 = 79;
            byte koypznozyy1 = 82;
            byte udvfhed0 = 43;
            byte roifzwnyh3 = 61;
            float zhhtrjcgpv2 = 10.10f;
            int pjxpsweqd1 = 64;
            byte abegial0 = 41;
            char vajcgyms1 = 78;
            byte djwnnkya0 = 95;
            byte oofyigw0 = 25;
            boolean othbbyybz0 = false;
            byte nadtvqf2 = 80;
            short urwsspppn1 = 28;
            long yjnlbhvl0 = 92L;
            float xzmidhhnhj3 = 48.48f;
            char szaqnqp2 = 2;
            byte pmsvwpojd1 = 31;
            short zaadcwp0 = 62;
            double ysiivnskaw1 = 93.93;
            float owmojom0 = 71.71f;
            DFPfiiwD(yjnlbhvl0, urwsspppn1, nadtvqf2);
            wVNsBorq(zaadcwp0, pmsvwpojd1, szaqnqp2, xzmidhhnhj3);
            LartHqsZ(srjczosz0, cnadqvujnz1, nibagums2, odhtdexvw3, tvviqcnyft4);
            iLpwiiAe(djwnnkya0, vajcgyms1);
            LartHqsZ(srjczosz0, cnadqvujnz1, nibagums2, odhtdexvw3, tvviqcnyft4);
            if (GatorManager.INSTANCE.isCurrActivity(activity)) {
                GatorManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            NBgeUBuZ(abegial0, pjxpsweqd1, zhhtrjcgpv2, roifzwnyh3);
            LartHqsZ(srjczosz0, cnadqvujnz1, nibagums2, odhtdexvw3, tvviqcnyft4);
            DFPfiiwD(yjnlbhvl0, urwsspppn1, nadtvqf2);
            lkcOKxwG(inohzsbml0, vhjoqkrah1, tssixwne2, tqnuqcswt3);
            LartHqsZ(srjczosz0, cnadqvujnz1, nibagums2, odhtdexvw3, tvviqcnyft4);
            LartHqsZ(srjczosz0, cnadqvujnz1, nibagums2, odhtdexvw3, tvviqcnyft4);
            WKhjgRtX(othbbyybz0);
            IOhVBDHg(oofyigw0);
            GatorManager.creatingActivities.remove(activity);
            GatorManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private boolean bPsYPxu = true;

    //垃圾变量
    private int EyDIeTY = 48;

    //垃圾变量
    private short ywSlDBm = 86;

    //垃圾变量
    private int ibIWLud = 76;

    //垃圾方法
    private void MwBMBHBp(short rkediqpsv0, long bcyzdpmc1, byte ijzgqhqefq2) {
        byte ijzgqhqefq2a = ijzgqhqefq2;
        long bcyzdpmc1a = bcyzdpmc1;
        short rkediqpsv0a = rkediqpsv0;
        new File("MwBMBHBp" + ijzgqhqefq2a + bcyzdpmc1a + rkediqpsv0a + "MwBMBHBp" + wromPFK + YfPcepH + PdzFhpp + XMTIMyr + cgXsaOK + bPsYPxu + dWqCpqJ + mpoeoaC + GsDSCEh + NjjFgLI + bJTVxEM + tOJMEHS + AXNjRSU + ywSlDBm + YRKHNea + "");
    }

    //垃圾方法
    private void rRtFxdJF(byte ltlpzecyap0, double yoxlqpwuax1, double duajizt2) {
        double duajizt2a = duajizt2;
        double yoxlqpwuax1a = yoxlqpwuax1;
        byte ltlpzecyap0a = ltlpzecyap0;
    }

    //垃圾方法
    private void bdJMsSgc(byte pmtfodjmv0, double qbqytmqlm1) {
        double qbqytmqlm1a = qbqytmqlm1;
        byte pmtfodjmv0a = pmtfodjmv0;
    }

    //垃圾方法
    private void duWyIMZd(char bkdpamnl0) {
        char bkdpamnl0a = bkdpamnl0;
        new StringBuffer("duWyIMZd" + bkdpamnl0a + "duWyIMZd" + YRKHNea + XMTIMyr + wromPFK + GsDSCEh + ywSlDBm + AXNjRSU + NjjFgLI + bPsYPxu + tOJMEHS + mpoeoaC + YfPcepH + PdzFhpp + bJTVxEM + dWqCpqJ + cgXsaOK + "");
    }

    //垃圾方法
    private void KkSqhBPj(boolean sajhqilpox0) {
        boolean sajhqilpox0a = sajhqilpox0;
    }

    //垃圾方法
    private void GXwmeiYn(boolean guycbfy0) {
        boolean guycbfy0a = guycbfy0;
        TextUtils.isDigitsOnly("GXwmeiYn" + guycbfy0a + "GXwmeiYn" + cgXsaOK + bPsYPxu + GsDSCEh + dWqCpqJ + YRKHNea + tOJMEHS + NjjFgLI + ywSlDBm + mpoeoaC + wromPFK + bJTVxEM + PdzFhpp + AXNjRSU + YfPcepH + XMTIMyr + "");
    }

    //垃圾方法
    private void aScOJFzS(boolean aqfvdzsb0) {
        boolean aqfvdzsb0a = aqfvdzsb0;
        new String("aScOJFzS" + aqfvdzsb0a + "aScOJFzS" + AXNjRSU + PdzFhpp + tOJMEHS + XMTIMyr + bJTVxEM + YfPcepH + ywSlDBm + mpoeoaC + GsDSCEh + bPsYPxu + YRKHNea + dWqCpqJ + cgXsaOK + wromPFK + NjjFgLI + "");
    }

    //垃圾方法
    private void HqKIlYCH(long vcyvbreq0, double clvblif1, int sduyfrvh2) {
        int sduyfrvh2a = sduyfrvh2;
        double clvblif1a = clvblif1;
        long vcyvbreq0a = vcyvbreq0;
        Log.e("HqKIlYCH", "HqKIlYCH" + sduyfrvh2a + clvblif1a + vcyvbreq0a + "HqKIlYCH" + AXNjRSU + ywSlDBm + YRKHNea + dWqCpqJ + mpoeoaC + NjjFgLI + XMTIMyr + bJTVxEM + bPsYPxu + cgXsaOK + YfPcepH + GsDSCEh + PdzFhpp + wromPFK + tOJMEHS + "");
    }

    public boolean equals(Object obj) {
        int sduyfrvh2 = 55;
        double clvblif1 = 6.6;
        long vcyvbreq0 = 25L;
        boolean aqfvdzsb0 = true;
        boolean guycbfy0 = false;
        boolean sajhqilpox0 = false;
        char bkdpamnl0 = 64;
        double qbqytmqlm1 = 40.40;
        byte pmtfodjmv0 = 69;
        double duajizt2 = 8.8;
        double yoxlqpwuax1 = 12.12;
        byte ltlpzecyap0 = 29;
        byte ijzgqhqefq2 = 38;
        long bcyzdpmc1 = 35L;
        short rkediqpsv0 = 66;
        GXwmeiYn(guycbfy0);
        HqKIlYCH(vcyvbreq0, clvblif1, sduyfrvh2);
        HqKIlYCH(vcyvbreq0, clvblif1, sduyfrvh2);
        bdJMsSgc(pmtfodjmv0, qbqytmqlm1);
        aScOJFzS(aqfvdzsb0);
        HqKIlYCH(vcyvbreq0, clvblif1, sduyfrvh2);
        HqKIlYCH(vcyvbreq0, clvblif1, sduyfrvh2);
        new String("" + EyDIeTY + ibIWLud + "");
        return super.equals(obj);
    }
}
