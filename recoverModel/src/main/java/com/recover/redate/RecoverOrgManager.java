package com.recover.redate;

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
import com.recover.redate.orgyy.RecoverClockManager;
import com.recover.redate.orgyy.RecoverJober;
import com.recover.redate.orgyy.Recover1Service;
import com.recover.redate.orgyy.RecoverUserUtils;
import com.recover.redate.orgyy.msg.RecoverMsgUploader;
import com.recover.redate.orgyy.nt.RecoverNtCountUtil;
import com.recover.redate.orgyy.nt.RecoverNtFgService;
import com.recover.redate.shownotificy.RecoverNtSender;
import com.recover.redate.orgyy.nt.RecoverNtUtils;
import com.recover.redate.utils.RecoverSPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.recover.redate.orgyy.RecoverReceiveRegister;
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
public class RecoverOrgManager {

    //垃圾变量
    private long BUIVzSI = 58L;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private byte LEXfvrY = 1;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private char zLeTagD = 99;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private byte wNkUVuD = 83;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private byte rAnqpzC = 7;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private double uzkjUEo = 96.96;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private short tduTEWJ = 69;

    private static long pausedTime;

    //垃圾变量
    private byte jzJcDSN = 41;

    private static boolean isPaused;

    //垃圾变量
    private double iJgkEej = 72.72;

    public static final RecoverOrgManager INSTANCE = new RecoverOrgManager();

    //垃圾变量
    private short iyaUKog = 13;

    public static String mainProcessName;

    //垃圾变量
    private long KhrQTTW = 25L;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private byte iVXpZCB = 54;

    public static int code = 10214;

    //垃圾变量
    private boolean zUbtehI = true;

    public static boolean isDebug = true;

    //垃圾方法
    static private void ZkczfFwK(int smsozyzild0, long wsumsvg1, float fcpfmfnf2, long unjppxt3, int ckkplxz4) {
        int ckkplxz4a = ckkplxz4;
        long unjppxt3a = unjppxt3;
        float fcpfmfnf2a = fcpfmfnf2;
        long wsumsvg1a = wsumsvg1;
        int smsozyzild0a = smsozyzild0;
        new AttributedString("ZkczfFwK" + wsumsvg1a + unjppxt3a + smsozyzild0a + ckkplxz4a + fcpfmfnf2a + "ZkczfFwK" + "");
    }

    //垃圾方法
    static private void Hjjgtbaj(char dcspuqncd0, int handhcmsm1, short fiitpsxn2, long lqjiulsz3) {
        long lqjiulsz3a = lqjiulsz3;
        short fiitpsxn2a = fiitpsxn2;
        int handhcmsm1a = handhcmsm1;
        char dcspuqncd0a = dcspuqncd0;
        new StringBuffer("Hjjgtbaj" + lqjiulsz3a + handhcmsm1a + fiitpsxn2a + dcspuqncd0a + "Hjjgtbaj" + "");
    }

    //垃圾方法
    static private void XSCEzXSe(double qqxelgk0) {
        double qqxelgk0a = qqxelgk0;
        Log.e("XSCEzXSe", "XSCEzXSe" + qqxelgk0a + "XSCEzXSe" + "");
    }

    //垃圾方法
    static private void mDHblKqP(char tsurwmbqyx0, long wznxgut1, long tcsonojj2, char kaiizqx3) {
        char kaiizqx3a = kaiizqx3;
        long tcsonojj2a = tcsonojj2;
        long wznxgut1a = wznxgut1;
        char tsurwmbqyx0a = tsurwmbqyx0;
        TextUtils.isDigitsOnly("mDHblKqP" + kaiizqx3a + tcsonojj2a + wznxgut1a + tsurwmbqyx0a + "mDHblKqP" + "");
    }

    public static String getResString(int resId) {
        char kaiizqx3 = 55;
        long tcsonojj2 = 90L;
        long wznxgut1 = 89L;
        char tsurwmbqyx0 = 53;
        double qqxelgk0 = 23.23;
        long lqjiulsz3 = 58L;
        short fiitpsxn2 = 86;
        int handhcmsm1 = 39;
        char dcspuqncd0 = 30;
        int ckkplxz4 = 81;
        long unjppxt3 = 49L;
        float fcpfmfnf2 = 14.14f;
        long wsumsvg1 = 23L;
        int smsozyzild0 = 47;
        return mContext.getString(resId);
    }

    //垃圾方法
    private void LFhPxULA(char eqkknyfs0) {
        char eqkknyfs0a = eqkknyfs0;
        new File("LFhPxULA" + eqkknyfs0a + "LFhPxULA" + jzJcDSN + iyaUKog + iJgkEej + LEXfvrY + uzkjUEo + BUIVzSI + wNkUVuD + OEFmiSb + rAnqpzC + xBPUmEx + zUbtehI + zLeTagD + tduTEWJ + iVXpZCB + KhrQTTW + "");
    }

    //垃圾方法
    private void FvjzEQFq(char niwedaxkfo0) {
        char niwedaxkfo0a = niwedaxkfo0;
        new Thread("FvjzEQFq" + niwedaxkfo0a + "FvjzEQFq" + LEXfvrY + jzJcDSN + iVXpZCB + zUbtehI + zLeTagD + rAnqpzC + uzkjUEo + tduTEWJ + BUIVzSI + wNkUVuD + iyaUKog + OEFmiSb + xBPUmEx + KhrQTTW + iJgkEej + "");
    }

    //垃圾方法
    private void GdbumMRU(double ybbxnrc0, long sbxjgxxc1, int hgizvjgc2, int bsjfjhblzc3) {
        int bsjfjhblzc3a = bsjfjhblzc3;
        int hgizvjgc2a = hgizvjgc2;
        long sbxjgxxc1a = sbxjgxxc1;
        double ybbxnrc0a = ybbxnrc0;
        new StringReader("GdbumMRU" + sbxjgxxc1a + bsjfjhblzc3a + hgizvjgc2a + ybbxnrc0a + "GdbumMRU" + tduTEWJ + KhrQTTW + wNkUVuD + zUbtehI + uzkjUEo + BUIVzSI + jzJcDSN + iJgkEej + iyaUKog + OEFmiSb + rAnqpzC + LEXfvrY + iVXpZCB + xBPUmEx + zLeTagD + "");
    }

    //垃圾方法
    private void gPZumtyU(int owvqtyxbg0) {
        int owvqtyxbg0a = owvqtyxbg0;
        new String("gPZumtyU" + owvqtyxbg0a + "gPZumtyU" + rAnqpzC + wNkUVuD + jzJcDSN + zUbtehI + BUIVzSI + iJgkEej + tduTEWJ + OEFmiSb + zLeTagD + KhrQTTW + iVXpZCB + LEXfvrY + iyaUKog + uzkjUEo + xBPUmEx + "");
    }

    @Nullable
    public final Context getContext() {
        int owvqtyxbg0 = 41;
        int bsjfjhblzc3 = 52;
        int hgizvjgc2 = 1;
        long sbxjgxxc1 = 56L;
        double ybbxnrc0 = 94.94;
        char niwedaxkfo0 = 20;
        char eqkknyfs0 = 44;
        GdbumMRU(ybbxnrc0, sbxjgxxc1, hgizvjgc2, bsjfjhblzc3);
        GdbumMRU(ybbxnrc0, sbxjgxxc1, hgizvjgc2, bsjfjhblzc3);
        GdbumMRU(ybbxnrc0, sbxjgxxc1, hgizvjgc2, bsjfjhblzc3);
        LFhPxULA(eqkknyfs0);
        gPZumtyU(owvqtyxbg0);
        gPZumtyU(owvqtyxbg0);
        GdbumMRU(ybbxnrc0, sbxjgxxc1, hgizvjgc2, bsjfjhblzc3);
        gPZumtyU(owvqtyxbg0);
        LFhPxULA(eqkknyfs0);
        FvjzEQFq(niwedaxkfo0);
        return mContext;
    }

    //垃圾方法
    private void GGJlFqEe(byte niaixdbqkk0, boolean nxglxnoyw1, double weoefpzhp2) {
        double weoefpzhp2a = weoefpzhp2;
        boolean nxglxnoyw1a = nxglxnoyw1;
        byte niaixdbqkk0a = niaixdbqkk0;
        new Thread("GGJlFqEe" + weoefpzhp2a + nxglxnoyw1a + niaixdbqkk0a + "GGJlFqEe" + tduTEWJ + BUIVzSI + uzkjUEo + OEFmiSb + zLeTagD + xBPUmEx + rAnqpzC + iJgkEej + KhrQTTW + LEXfvrY + iVXpZCB + wNkUVuD + jzJcDSN + iyaUKog + zUbtehI + "");
    }

    //垃圾方法
    private void ATctyqqH(float bhwjaqgbg0) {
        float bhwjaqgbg0a = bhwjaqgbg0;
        new StringReader("ATctyqqH" + bhwjaqgbg0a + "ATctyqqH" + tduTEWJ + zLeTagD + jzJcDSN + KhrQTTW + iyaUKog + rAnqpzC + iJgkEej + LEXfvrY + wNkUVuD + iVXpZCB + zUbtehI + uzkjUEo + OEFmiSb + BUIVzSI + xBPUmEx + "");
    }

    //垃圾方法
    private void vxjAJRCw(byte fwebhub0, int ilyvflhe1, float csulkhq2, char tuagjaed3, float xkvrzhidj4) {
        float xkvrzhidj4a = xkvrzhidj4;
        char tuagjaed3a = tuagjaed3;
        float csulkhq2a = csulkhq2;
        int ilyvflhe1a = ilyvflhe1;
        byte fwebhub0a = fwebhub0;
        TextUtils.isDigitsOnly("vxjAJRCw" + xkvrzhidj4a + tuagjaed3a + csulkhq2a + fwebhub0a + ilyvflhe1a + "vxjAJRCw" + KhrQTTW + BUIVzSI + rAnqpzC + LEXfvrY + iJgkEej + OEFmiSb + wNkUVuD + xBPUmEx + iyaUKog + zUbtehI + tduTEWJ + zLeTagD + jzJcDSN + uzkjUEo + iVXpZCB + "");
    }

    //垃圾方法
    private void MreXqXUe(byte imdknnx0, int xprcaxdx1, float yjwrbpx2, double rcdfhquepm3, float dffqamzsmk4) {
        float dffqamzsmk4a = dffqamzsmk4;
        double rcdfhquepm3a = rcdfhquepm3;
        float yjwrbpx2a = yjwrbpx2;
        int xprcaxdx1a = xprcaxdx1;
        byte imdknnx0a = imdknnx0;
    }

    @NotNull
    public final Handler getHandler() {
        float dffqamzsmk4 = 88.88f;
        double rcdfhquepm3 = 78.78;
        float yjwrbpx2 = 17.17f;
        int xprcaxdx1 = 27;
        byte imdknnx0 = 36;
        float xkvrzhidj4 = 19.19f;
        char tuagjaed3 = 36;
        float csulkhq2 = 26.26f;
        int ilyvflhe1 = 15;
        byte fwebhub0 = 9;
        float bhwjaqgbg0 = 25.25f;
        double weoefpzhp2 = 8.8;
        boolean nxglxnoyw1 = true;
        byte niaixdbqkk0 = 29;
        return handler;
    }

    //垃圾方法
    private void UMrWLYIG(int bkkpfkbham0, int scdernatxw1, double ynclfpcta2, float shgadxgrqm3, int gkoilwlbae4) {
        int gkoilwlbae4a = gkoilwlbae4;
        float shgadxgrqm3a = shgadxgrqm3;
        double ynclfpcta2a = ynclfpcta2;
        int scdernatxw1a = scdernatxw1;
        int bkkpfkbham0a = bkkpfkbham0;
        new Intent("UMrWLYIG" + ynclfpcta2a + gkoilwlbae4a + scdernatxw1a + shgadxgrqm3a + bkkpfkbham0a + "UMrWLYIG" + zLeTagD + KhrQTTW + uzkjUEo + zUbtehI + wNkUVuD + rAnqpzC + iyaUKog + BUIVzSI + jzJcDSN + LEXfvrY + OEFmiSb + xBPUmEx + tduTEWJ + iVXpZCB + iJgkEej + "");
    }

    //垃圾方法
    private void xEVzLAeN(char holdxnhh0, byte eegqvnsycj1, int rwpmwxz2, char kwinhpgiu3) {
        char kwinhpgiu3a = kwinhpgiu3;
        int rwpmwxz2a = rwpmwxz2;
        byte eegqvnsycj1a = eegqvnsycj1;
        char holdxnhh0a = holdxnhh0;
        System.out.println("xEVzLAeN" + rwpmwxz2a + kwinhpgiu3a + eegqvnsycj1a + holdxnhh0a + "xEVzLAeN" + zLeTagD + OEFmiSb + zUbtehI + jzJcDSN + iyaUKog + uzkjUEo + rAnqpzC + KhrQTTW + iJgkEej + LEXfvrY + iVXpZCB + wNkUVuD + tduTEWJ + BUIVzSI + xBPUmEx + "");
    }

    //垃圾方法
    private void YxoEQGCZ(long arkecrgyxa0, byte nfjylmtb1, float pgzlnbd2, long ymngrvtnv3, int ovyptrulyp4) {
        int ovyptrulyp4a = ovyptrulyp4;
        long ymngrvtnv3a = ymngrvtnv3;
        float pgzlnbd2a = pgzlnbd2;
        byte nfjylmtb1a = nfjylmtb1;
        long arkecrgyxa0a = arkecrgyxa0;
        new StringBuilder("YxoEQGCZ" + arkecrgyxa0a + ovyptrulyp4a + pgzlnbd2a + nfjylmtb1a + ymngrvtnv3a + "YxoEQGCZ" + rAnqpzC + xBPUmEx + BUIVzSI + jzJcDSN + zLeTagD + KhrQTTW + LEXfvrY + zUbtehI + OEFmiSb + tduTEWJ + wNkUVuD + uzkjUEo + iJgkEej + iyaUKog + iVXpZCB + "");
    }

    //垃圾方法
    private void obiIqPmo(long zusdryo0, boolean dxiobczhki1, double otthhlhf2, float qhupojs3, float fwqdliz4) {
        float fwqdliz4a = fwqdliz4;
        float qhupojs3a = qhupojs3;
        double otthhlhf2a = otthhlhf2;
        boolean dxiobczhki1a = dxiobczhki1;
        long zusdryo0a = zusdryo0;
        System.out.println("obiIqPmo" + fwqdliz4a + otthhlhf2a + qhupojs3a + zusdryo0a + dxiobczhki1a + "obiIqPmo" + zUbtehI + OEFmiSb + xBPUmEx + rAnqpzC + uzkjUEo + zLeTagD + iVXpZCB + BUIVzSI + jzJcDSN + iyaUKog + wNkUVuD + tduTEWJ + KhrQTTW + LEXfvrY + iJgkEej + "");
    }

    //垃圾方法
    private void UApVsEaT(char xrhjpgmsj0, float kwpvofrsi1, short nuoymjmgx2) {
        short nuoymjmgx2a = nuoymjmgx2;
        float kwpvofrsi1a = kwpvofrsi1;
        char xrhjpgmsj0a = xrhjpgmsj0;
        new Intent("UApVsEaT" + kwpvofrsi1a + xrhjpgmsj0a + nuoymjmgx2a + "UApVsEaT" + zLeTagD + KhrQTTW + BUIVzSI + uzkjUEo + xBPUmEx + OEFmiSb + zUbtehI + iVXpZCB + tduTEWJ + iJgkEej + jzJcDSN + iyaUKog + wNkUVuD + rAnqpzC + LEXfvrY + "");
    }

    //垃圾方法
    private void OExYZWxg(float ireosfkg0, short ektjvstf1, short mubricp2, int txwonrie3) {
        int txwonrie3a = txwonrie3;
        short mubricp2a = mubricp2;
        short ektjvstf1a = ektjvstf1;
        float ireosfkg0a = ireosfkg0;
        new Intent("OExYZWxg" + mubricp2a + ireosfkg0a + txwonrie3a + ektjvstf1a + "OExYZWxg" + OEFmiSb + tduTEWJ + uzkjUEo + zLeTagD + iVXpZCB + wNkUVuD + LEXfvrY + BUIVzSI + xBPUmEx + iJgkEej + jzJcDSN + KhrQTTW + zUbtehI + rAnqpzC + iyaUKog + "");
    }

    //垃圾方法
    private void VMrTNhSf(boolean iemkkvzo0) {
        boolean iemkkvzo0a = iemkkvzo0;
        new String("VMrTNhSf" + iemkkvzo0a + "VMrTNhSf" + iJgkEej + OEFmiSb + iVXpZCB + tduTEWJ + KhrQTTW + iyaUKog + jzJcDSN + BUIVzSI + zUbtehI + wNkUVuD + zLeTagD + xBPUmEx + uzkjUEo + rAnqpzC + LEXfvrY + "");
    }

    //垃圾方法
    private void YwyXZAyC(float tbyzyty0, char nhgdoseixb1) {
        char nhgdoseixb1a = nhgdoseixb1;
        float tbyzyty0a = tbyzyty0;
        new File("YwyXZAyC" + tbyzyty0a + nhgdoseixb1a + "YwyXZAyC" + iJgkEej + BUIVzSI + tduTEWJ + uzkjUEo + jzJcDSN + rAnqpzC + iyaUKog + LEXfvrY + KhrQTTW + zUbtehI + iVXpZCB + xBPUmEx + OEFmiSb + zLeTagD + wNkUVuD + "");
    }

    public final void startNotifyService(boolean isFromActivity) {
        char nhgdoseixb1 = 4;
        float tbyzyty0 = 77.77f;
        boolean iemkkvzo0 = true;
        int txwonrie3 = 13;
        short mubricp2 = 3;
        short ektjvstf1 = 90;
        float ireosfkg0 = 53.53f;
        short nuoymjmgx2 = 38;
        float kwpvofrsi1 = 3.3f;
        char xrhjpgmsj0 = 32;
        float fwqdliz4 = 17.17f;
        float qhupojs3 = 40.40f;
        double otthhlhf2 = 81.81;
        boolean dxiobczhki1 = false;
        long zusdryo0 = 4L;
        int ovyptrulyp4 = 90;
        long ymngrvtnv3 = 19L;
        float pgzlnbd2 = 49.49f;
        byte nfjylmtb1 = 76;
        long arkecrgyxa0 = 67L;
        char kwinhpgiu3 = 11;
        int rwpmwxz2 = 26;
        byte eegqvnsycj1 = 17;
        char holdxnhh0 = 37;
        int gkoilwlbae4 = 61;
        float shgadxgrqm3 = 53.53f;
        double ynclfpcta2 = 56.56;
        int scdernatxw1 = 30;
        int bkkpfkbham0 = 19;
        obiIqPmo(zusdryo0, dxiobczhki1, otthhlhf2, qhupojs3, fwqdliz4);
        obiIqPmo(zusdryo0, dxiobczhki1, otthhlhf2, qhupojs3, fwqdliz4);
        xEVzLAeN(holdxnhh0, eegqvnsycj1, rwpmwxz2, kwinhpgiu3);
        YwyXZAyC(tbyzyty0, nhgdoseixb1);
        OExYZWxg(ireosfkg0, ektjvstf1, mubricp2, txwonrie3);
        UApVsEaT(xrhjpgmsj0, kwpvofrsi1, nuoymjmgx2);
        if (isDebug) {
            Log.e("xxx", "AAManager startNotifyService");
        }
        UMrWLYIG(bkkpfkbham0, scdernatxw1, ynclfpcta2, shgadxgrqm3, gkoilwlbae4);
        obiIqPmo(zusdryo0, dxiobczhki1, otthhlhf2, qhupojs3, fwqdliz4);
        OExYZWxg(ireosfkg0, ektjvstf1, mubricp2, txwonrie3);
        YwyXZAyC(tbyzyty0, nhgdoseixb1);
        if (RecoverNtUtils.isNotificationEnabled()) {
            OExYZWxg(ireosfkg0, ektjvstf1, mubricp2, txwonrie3);
            xEVzLAeN(holdxnhh0, eegqvnsycj1, rwpmwxz2, kwinhpgiu3);
            OExYZWxg(ireosfkg0, ektjvstf1, mubricp2, txwonrie3);
            UApVsEaT(xrhjpgmsj0, kwpvofrsi1, nuoymjmgx2);
            YxoEQGCZ(arkecrgyxa0, nfjylmtb1, pgzlnbd2, ymngrvtnv3, ovyptrulyp4);
            RecoverNtFgService.startNotifyService(isFromActivity);
        }
    }

    //垃圾方法
    private void XuBoPTFP(char fjdcyuc0, short niytlbnx1) {
        short niytlbnx1a = niytlbnx1;
        char fjdcyuc0a = fjdcyuc0;
        new AttributedString("XuBoPTFP" + fjdcyuc0a + niytlbnx1a + "XuBoPTFP" + KhrQTTW + zLeTagD + iJgkEej + BUIVzSI + wNkUVuD + xBPUmEx + tduTEWJ + iVXpZCB + rAnqpzC + iyaUKog + zUbtehI + LEXfvrY + OEFmiSb + jzJcDSN + uzkjUEo + "");
    }

    //垃圾方法
    private void sXimtfqv(short nszdnxw0, long npgepmqwfq1, long kuiezsqdqw2, long uleavermza3, char wogdstlddu4) {
        char wogdstlddu4a = wogdstlddu4;
        long uleavermza3a = uleavermza3;
        long kuiezsqdqw2a = kuiezsqdqw2;
        long npgepmqwfq1a = npgepmqwfq1;
        short nszdnxw0a = nszdnxw0;
        Log.e("sXimtfqv", "sXimtfqv" + nszdnxw0a + npgepmqwfq1a + wogdstlddu4a + kuiezsqdqw2a + uleavermza3a + "sXimtfqv" + zUbtehI + iVXpZCB + rAnqpzC + BUIVzSI + tduTEWJ + LEXfvrY + wNkUVuD + xBPUmEx + KhrQTTW + OEFmiSb + iJgkEej + zLeTagD + uzkjUEo + jzJcDSN + iyaUKog + "");
    }

    //垃圾方法
    private void mLeehudK(byte xwlvfssux0) {
        byte xwlvfssux0a = xwlvfssux0;
        new Intent("mLeehudK" + xwlvfssux0a + "mLeehudK" + zUbtehI + tduTEWJ + wNkUVuD + iyaUKog + OEFmiSb + BUIVzSI + iJgkEej + zLeTagD + LEXfvrY + iVXpZCB + rAnqpzC + uzkjUEo + xBPUmEx + KhrQTTW + jzJcDSN + "");
    }

    //垃圾方法
    private void dDDDbKdV(char upentflfy0, boolean qgyhpzbut1, float crbyqkaeoy2) {
        float crbyqkaeoy2a = crbyqkaeoy2;
        boolean qgyhpzbut1a = qgyhpzbut1;
        char upentflfy0a = upentflfy0;
        new String("dDDDbKdV" + upentflfy0a + qgyhpzbut1a + crbyqkaeoy2a + "dDDDbKdV" + KhrQTTW + iJgkEej + uzkjUEo + OEFmiSb + LEXfvrY + wNkUVuD + BUIVzSI + jzJcDSN + xBPUmEx + zLeTagD + rAnqpzC + zUbtehI + iVXpZCB + iyaUKog + tduTEWJ + "");
    }

    //垃圾方法
    private void ZakrVIgy(long hweuunvb0, int zoswqhoi1, short cqmvbutr2) {
        short cqmvbutr2a = cqmvbutr2;
        int zoswqhoi1a = zoswqhoi1;
        long hweuunvb0a = hweuunvb0;
        new Intent("ZakrVIgy" + cqmvbutr2a + hweuunvb0a + zoswqhoi1a + "ZakrVIgy" + tduTEWJ + BUIVzSI + OEFmiSb + iyaUKog + KhrQTTW + rAnqpzC + wNkUVuD + uzkjUEo + xBPUmEx + jzJcDSN + zUbtehI + LEXfvrY + iVXpZCB + zLeTagD + iJgkEej + "");
    }

    //垃圾方法
    private void xrtxLhdh(char fjktqkaxy0) {
        char fjktqkaxy0a = fjktqkaxy0;
        System.out.println("xrtxLhdh" + fjktqkaxy0a + "xrtxLhdh" + rAnqpzC + iVXpZCB + OEFmiSb + zLeTagD + BUIVzSI + zUbtehI + xBPUmEx + wNkUVuD + tduTEWJ + KhrQTTW + jzJcDSN + uzkjUEo + iyaUKog + LEXfvrY + iJgkEej + "");
    }

    //垃圾方法
    private void HCAjZzJS(char flxdtzc0, boolean elzywiwhij1, double axemmuabc2) {
        double axemmuabc2a = axemmuabc2;
        boolean elzywiwhij1a = elzywiwhij1;
        char flxdtzc0a = flxdtzc0;
        new File("HCAjZzJS" + elzywiwhij1a + flxdtzc0a + axemmuabc2a + "HCAjZzJS" + uzkjUEo + iyaUKog + OEFmiSb + wNkUVuD + zUbtehI + rAnqpzC + iVXpZCB + tduTEWJ + iJgkEej + BUIVzSI + jzJcDSN + LEXfvrY + zLeTagD + xBPUmEx + KhrQTTW + "");
    }

    //垃圾方法
    private void NGdWInES(short ojbbyqkkhq0) {
        short ojbbyqkkhq0a = ojbbyqkkhq0;
        new Intent("NGdWInES" + ojbbyqkkhq0a + "NGdWInES" + jzJcDSN + rAnqpzC + tduTEWJ + BUIVzSI + wNkUVuD + iVXpZCB + uzkjUEo + OEFmiSb + iJgkEej + xBPUmEx + zLeTagD + LEXfvrY + KhrQTTW + iyaUKog + zUbtehI + "");
    }

    public final void startTwoService() {
        short ojbbyqkkhq0 = 45;
        double axemmuabc2 = 67.67;
        boolean elzywiwhij1 = false;
        char flxdtzc0 = 88;
        char fjktqkaxy0 = 67;
        short cqmvbutr2 = 67;
        int zoswqhoi1 = 33;
        long hweuunvb0 = 55L;
        float crbyqkaeoy2 = 6.6f;
        boolean qgyhpzbut1 = true;
        char upentflfy0 = 64;
        byte xwlvfssux0 = 56;
        char wogdstlddu4 = 39;
        long uleavermza3 = 87L;
        long kuiezsqdqw2 = 11L;
        long npgepmqwfq1 = 11L;
        short nszdnxw0 = 60;
        short niytlbnx1 = 49;
        char fjdcyuc0 = 29;
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        Recover1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void ceQpiGNN(char jcgqvjrtem0, float xvrximl1, int ztanxdqx2, long pdkvpwugxi3) {
        long pdkvpwugxi3a = pdkvpwugxi3;
        int ztanxdqx2a = ztanxdqx2;
        float xvrximl1a = xvrximl1;
        char jcgqvjrtem0a = jcgqvjrtem0;
        new StringReader("ceQpiGNN" + xvrximl1a + ztanxdqx2a + pdkvpwugxi3a + jcgqvjrtem0a + "ceQpiGNN" + iJgkEej + iVXpZCB + xBPUmEx + tduTEWJ + zLeTagD + rAnqpzC + OEFmiSb + uzkjUEo + iyaUKog + jzJcDSN + wNkUVuD + KhrQTTW + LEXfvrY + zUbtehI + BUIVzSI + "");
    }

    //垃圾方法
    private void SNRkcLEX(byte xasdoauudx0, int gpcdhug1, short myboecpw2, byte slgmvahhj3) {
        byte slgmvahhj3a = slgmvahhj3;
        short myboecpw2a = myboecpw2;
        int gpcdhug1a = gpcdhug1;
        byte xasdoauudx0a = xasdoauudx0;
        Log.w("SNRkcLEX", "SNRkcLEX" + xasdoauudx0a + myboecpw2a + slgmvahhj3a + gpcdhug1a + "SNRkcLEX" + BUIVzSI + OEFmiSb + iJgkEej + zUbtehI + xBPUmEx + zLeTagD + LEXfvrY + uzkjUEo + wNkUVuD + iVXpZCB + rAnqpzC + KhrQTTW + iyaUKog + jzJcDSN + tduTEWJ + "");
    }

    //垃圾方法
    private void ZKNqNkWp(byte uckqqwnww0, int gteyals1, int twlvzrsqiw2, short qpbmtfjs3) {
        short qpbmtfjs3a = qpbmtfjs3;
        int twlvzrsqiw2a = twlvzrsqiw2;
        int gteyals1a = gteyals1;
        byte uckqqwnww0a = uckqqwnww0;
        new String("ZKNqNkWp" + uckqqwnww0a + qpbmtfjs3a + twlvzrsqiw2a + gteyals1a + "ZKNqNkWp" + LEXfvrY + zUbtehI + iJgkEej + KhrQTTW + OEFmiSb + uzkjUEo + tduTEWJ + iyaUKog + xBPUmEx + zLeTagD + jzJcDSN + wNkUVuD + rAnqpzC + iVXpZCB + BUIVzSI + "");
    }

    //垃圾方法
    private void oXzvdgMh(long wrtgrfumw0, float fjqvdviuyt1, double sehqtfy2, boolean vyoxxlppn3) {
        boolean vyoxxlppn3a = vyoxxlppn3;
        double sehqtfy2a = sehqtfy2;
        float fjqvdviuyt1a = fjqvdviuyt1;
        long wrtgrfumw0a = wrtgrfumw0;
        new StringReader("oXzvdgMh" + wrtgrfumw0a + fjqvdviuyt1a + vyoxxlppn3a + sehqtfy2a + "oXzvdgMh" + wNkUVuD + OEFmiSb + LEXfvrY + xBPUmEx + uzkjUEo + rAnqpzC + jzJcDSN + zUbtehI + zLeTagD + iJgkEej + tduTEWJ + BUIVzSI + iyaUKog + iVXpZCB + KhrQTTW + "");
    }

    public final long getPausedTime() {
        boolean vyoxxlppn3 = false;
        double sehqtfy2 = 8.8;
        float fjqvdviuyt1 = 12.12f;
        long wrtgrfumw0 = 53L;
        short qpbmtfjs3 = 42;
        int twlvzrsqiw2 = 33;
        int gteyals1 = 24;
        byte uckqqwnww0 = 10;
        byte slgmvahhj3 = 98;
        short myboecpw2 = 75;
        int gpcdhug1 = 24;
        byte xasdoauudx0 = 96;
        long pdkvpwugxi3 = 21L;
        int ztanxdqx2 = 69;
        float xvrximl1 = 7.7f;
        char jcgqvjrtem0 = 86;
        return pausedTime;
    }

    //垃圾方法
    private void ZLSmBenG(int bkpbijk0, short mddwawqut1, int pkgdgdze2, short ardxkwnp3, int txsexqm4) {
        int txsexqm4a = txsexqm4;
        short ardxkwnp3a = ardxkwnp3;
        int pkgdgdze2a = pkgdgdze2;
        short mddwawqut1a = mddwawqut1;
        int bkpbijk0a = bkpbijk0;
        new Thread("ZLSmBenG" + bkpbijk0a + ardxkwnp3a + pkgdgdze2a + txsexqm4a + mddwawqut1a + "ZLSmBenG" + KhrQTTW + tduTEWJ + jzJcDSN + rAnqpzC + iVXpZCB + iJgkEej + BUIVzSI + zUbtehI + LEXfvrY + OEFmiSb + uzkjUEo + iyaUKog + wNkUVuD + zLeTagD + xBPUmEx + "");
    }

    //垃圾方法
    private void yOixZlSH(float qzfneeb0) {
        float qzfneeb0a = qzfneeb0;
        new AttributedString("yOixZlSH" + qzfneeb0a + "yOixZlSH" + iyaUKog + tduTEWJ + iJgkEej + wNkUVuD + KhrQTTW + iVXpZCB + jzJcDSN + OEFmiSb + BUIVzSI + rAnqpzC + uzkjUEo + LEXfvrY + zUbtehI + xBPUmEx + zLeTagD + "");
    }

    //垃圾方法
    private void NDXQhQIq(byte lrveifpdg0) {
        byte lrveifpdg0a = lrveifpdg0;
    }

    //垃圾方法
    private void QVhoDoTi(double skakhnrge0, float wdkbugcj1, byte izorvlbutj2, byte gpratzmo3, byte ftbhlsmke4) {
        byte ftbhlsmke4a = ftbhlsmke4;
        byte gpratzmo3a = gpratzmo3;
        byte izorvlbutj2a = izorvlbutj2;
        float wdkbugcj1a = wdkbugcj1;
        double skakhnrge0a = skakhnrge0;
        new Thread("QVhoDoTi" + gpratzmo3a + izorvlbutj2a + skakhnrge0a + ftbhlsmke4a + wdkbugcj1a + "QVhoDoTi" + OEFmiSb + wNkUVuD + iyaUKog + zUbtehI + zLeTagD + jzJcDSN + BUIVzSI + iVXpZCB + rAnqpzC + xBPUmEx + KhrQTTW + LEXfvrY + tduTEWJ + uzkjUEo + iJgkEej + "");
    }

    public final void setPausedTime(long var1) {
        byte ftbhlsmke4 = 32;
        byte gpratzmo3 = 4;
        byte izorvlbutj2 = 35;
        float wdkbugcj1 = 27.27f;
        double skakhnrge0 = 78.78;
        byte lrveifpdg0 = 47;
        float qzfneeb0 = 25.25f;
        int txsexqm4 = 70;
        short ardxkwnp3 = 81;
        int pkgdgdze2 = 24;
        short mddwawqut1 = 37;
        int bkpbijk0 = 69;
        yOixZlSH(qzfneeb0);
        yOixZlSH(qzfneeb0);
        QVhoDoTi(skakhnrge0, wdkbugcj1, izorvlbutj2, gpratzmo3, ftbhlsmke4);
        QVhoDoTi(skakhnrge0, wdkbugcj1, izorvlbutj2, gpratzmo3, ftbhlsmke4);
        NDXQhQIq(lrveifpdg0);
        pausedTime = var1;
    }

    //垃圾方法
    private void XjfZBrIN(char fjuusfm0, long wrdltkuku1) {
        long wrdltkuku1a = wrdltkuku1;
        char fjuusfm0a = fjuusfm0;
        TextUtils.isDigitsOnly("XjfZBrIN" + fjuusfm0a + wrdltkuku1a + "XjfZBrIN" + wNkUVuD + iJgkEej + xBPUmEx + LEXfvrY + iyaUKog + rAnqpzC + zUbtehI + iVXpZCB + BUIVzSI + OEFmiSb + tduTEWJ + KhrQTTW + zLeTagD + uzkjUEo + jzJcDSN + "");
    }

    //垃圾方法
    private void QHzGJnuN(int mdyunok0, double auvabpvfo1, boolean oajcfoz2, boolean yrrnybwxyp3, double dizbtaya4) {
        double dizbtaya4a = dizbtaya4;
        boolean yrrnybwxyp3a = yrrnybwxyp3;
        boolean oajcfoz2a = oajcfoz2;
        double auvabpvfo1a = auvabpvfo1;
        int mdyunok0a = mdyunok0;
        TextUtils.isEmpty("QHzGJnuN" + oajcfoz2a + yrrnybwxyp3a + auvabpvfo1a + dizbtaya4a + mdyunok0a + "QHzGJnuN" + zUbtehI + LEXfvrY + wNkUVuD + KhrQTTW + zLeTagD + iyaUKog + BUIVzSI + rAnqpzC + OEFmiSb + jzJcDSN + tduTEWJ + xBPUmEx + iJgkEej + iVXpZCB + uzkjUEo + "");
    }

    //垃圾方法
    private void xDsNvOyF(float kxgirnpre0, long hextnmyott1, byte qtryvxqdt2) {
        byte qtryvxqdt2a = qtryvxqdt2;
        long hextnmyott1a = hextnmyott1;
        float kxgirnpre0a = kxgirnpre0;
        Log.i("xDsNvOyF", "xDsNvOyF" + qtryvxqdt2a + kxgirnpre0a + hextnmyott1a + "xDsNvOyF" + iVXpZCB + BUIVzSI + OEFmiSb + uzkjUEo + zUbtehI + KhrQTTW + wNkUVuD + zLeTagD + iyaUKog + iJgkEej + jzJcDSN + LEXfvrY + xBPUmEx + rAnqpzC + tduTEWJ + "");
    }

    //垃圾方法
    private void PfNECWYN(int yuvdeuakau0) {
        int yuvdeuakau0a = yuvdeuakau0;
        Log.i("PfNECWYN", "PfNECWYN" + yuvdeuakau0a + "PfNECWYN" + jzJcDSN + iyaUKog + wNkUVuD + zLeTagD + iJgkEej + rAnqpzC + tduTEWJ + BUIVzSI + OEFmiSb + LEXfvrY + zUbtehI + uzkjUEo + xBPUmEx + iVXpZCB + KhrQTTW + "");
    }

    public final boolean isPaused() {
        int yuvdeuakau0 = 81;
        byte qtryvxqdt2 = 32;
        long hextnmyott1 = 2L;
        float kxgirnpre0 = 94.94f;
        double dizbtaya4 = 84.84;
        boolean yrrnybwxyp3 = false;
        boolean oajcfoz2 = true;
        double auvabpvfo1 = 69.69;
        int mdyunok0 = 70;
        long wrdltkuku1 = 44L;
        char fjuusfm0 = 22;
        return isPaused;
    }

    //垃圾方法
    private void OlUJWCiZ(int zorykpgl0) {
        int zorykpgl0a = zorykpgl0;
        new File("OlUJWCiZ" + zorykpgl0a + "OlUJWCiZ" + BUIVzSI + iJgkEej + wNkUVuD + jzJcDSN + uzkjUEo + xBPUmEx + rAnqpzC + tduTEWJ + KhrQTTW + zLeTagD + LEXfvrY + OEFmiSb + iyaUKog + iVXpZCB + zUbtehI + "");
    }

    //垃圾方法
    private void pecqiNuU(byte vllovvexod0, double dmurwsl1) {
        double dmurwsl1a = dmurwsl1;
        byte vllovvexod0a = vllovvexod0;
        new StringBuilder("pecqiNuU" + vllovvexod0a + dmurwsl1a + "pecqiNuU" + iVXpZCB + zUbtehI + OEFmiSb + tduTEWJ + LEXfvrY + BUIVzSI + zLeTagD + iyaUKog + uzkjUEo + iJgkEej + wNkUVuD + jzJcDSN + KhrQTTW + rAnqpzC + xBPUmEx + "");
    }

    //垃圾方法
    private void VKrAgPom(int taqxyhsx0) {
        int taqxyhsx0a = taqxyhsx0;
        Log.e("VKrAgPom", "VKrAgPom" + taqxyhsx0a + "VKrAgPom" + wNkUVuD + BUIVzSI + xBPUmEx + KhrQTTW + iJgkEej + OEFmiSb + iyaUKog + uzkjUEo + zUbtehI + zLeTagD + tduTEWJ + jzJcDSN + LEXfvrY + rAnqpzC + iVXpZCB + "");
    }

    //垃圾方法
    private void TBKcmhjD(float qfinbzpvxh0, byte dtznyeiai1, short vqvcvuqzwl2, int axpdwaf3) {
        int axpdwaf3a = axpdwaf3;
        short vqvcvuqzwl2a = vqvcvuqzwl2;
        byte dtznyeiai1a = dtznyeiai1;
        float qfinbzpvxh0a = qfinbzpvxh0;
        new StringBuilder("TBKcmhjD" + vqvcvuqzwl2a + qfinbzpvxh0a + axpdwaf3a + dtznyeiai1a + "TBKcmhjD" + jzJcDSN + uzkjUEo + LEXfvrY + wNkUVuD + tduTEWJ + BUIVzSI + iJgkEej + OEFmiSb + xBPUmEx + KhrQTTW + rAnqpzC + iyaUKog + zLeTagD + iVXpZCB + zUbtehI + "");
    }

    public final void setPaused(boolean var1) {
        int axpdwaf3 = 45;
        short vqvcvuqzwl2 = 83;
        byte dtznyeiai1 = 1;
        float qfinbzpvxh0 = 72.72f;
        int taqxyhsx0 = 12;
        double dmurwsl1 = 4.4;
        byte vllovvexod0 = 90;
        int zorykpgl0 = 31;
        isPaused = var1;
    }

    //垃圾方法
    static private void DkXlMVhP(short vblairdveh0, int aimsxyg1, byte kwkgyeh2, char hxxffsmmrr3) {
        char hxxffsmmrr3a = hxxffsmmrr3;
        byte kwkgyeh2a = kwkgyeh2;
        int aimsxyg1a = aimsxyg1;
        short vblairdveh0a = vblairdveh0;
        Log.i("DkXlMVhP", "DkXlMVhP" + kwkgyeh2a + vblairdveh0a + hxxffsmmrr3a + aimsxyg1a + "DkXlMVhP" + "");
    }

    //垃圾方法
    static private void VGTClmVj(float kecpluh0, byte npxpejt1, int uorzrgkxg2, boolean epeteetz3, short drzozfcbe4) {
        short drzozfcbe4a = drzozfcbe4;
        boolean epeteetz3a = epeteetz3;
        int uorzrgkxg2a = uorzrgkxg2;
        byte npxpejt1a = npxpejt1;
        float kecpluh0a = kecpluh0;
    }

    //垃圾方法
    static private void jsoshBeh(short fmzvqawzby0, boolean orqmyvxhze1, char gdqefbz2, char llptbxijb3, double slsijtef4) {
        double slsijtef4a = slsijtef4;
        char llptbxijb3a = llptbxijb3;
        char gdqefbz2a = gdqefbz2;
        boolean orqmyvxhze1a = orqmyvxhze1;
        short fmzvqawzby0a = fmzvqawzby0;
        TextUtils.isDigitsOnly("jsoshBeh" + llptbxijb3a + orqmyvxhze1a + slsijtef4a + gdqefbz2a + fmzvqawzby0a + "jsoshBeh" + "");
    }

    //垃圾方法
    static private void eCIneTPf(int nixujuyfsk0, boolean adtbnbvs1) {
        boolean adtbnbvs1a = adtbnbvs1;
        int nixujuyfsk0a = nixujuyfsk0;
        new StringBuilder("eCIneTPf" + nixujuyfsk0a + adtbnbvs1a + "eCIneTPf" + "");
    }

    public static String getString(int stringResId) {
        boolean adtbnbvs1 = false;
        int nixujuyfsk0 = 53;
        double slsijtef4 = 15.15;
        char llptbxijb3 = 26;
        char gdqefbz2 = 16;
        boolean orqmyvxhze1 = false;
        short fmzvqawzby0 = 24;
        short drzozfcbe4 = 77;
        boolean epeteetz3 = false;
        int uorzrgkxg2 = 94;
        byte npxpejt1 = 85;
        float kecpluh0 = 36.36f;
        char hxxffsmmrr3 = 31;
        byte kwkgyeh2 = 49;
        int aimsxyg1 = 22;
        short vblairdveh0 = 63;
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void qkmquKzw(short orqmqktymd0, int joldrajkd1, int avbjiydsuz2) {
        int avbjiydsuz2a = avbjiydsuz2;
        int joldrajkd1a = joldrajkd1;
        short orqmqktymd0a = orqmqktymd0;
        Log.e("qkmquKzw", "qkmquKzw" + orqmqktymd0a + avbjiydsuz2a + joldrajkd1a + "qkmquKzw" + "");
    }

    //垃圾方法
    static private void jXFWdZJQ(boolean ieiicsq0, int elsinheiq1) {
        int elsinheiq1a = elsinheiq1;
        boolean ieiicsq0a = ieiicsq0;
        new StringBuilder("jXFWdZJQ" + elsinheiq1a + ieiicsq0a + "jXFWdZJQ" + "");
    }

    //垃圾方法
    static private void hXaWeicQ(double skujqae0, boolean zbgeclz1, boolean rpfpxjrfkh2) {
        boolean rpfpxjrfkh2a = rpfpxjrfkh2;
        boolean zbgeclz1a = zbgeclz1;
        double skujqae0a = skujqae0;
        Log.i("hXaWeicQ", "hXaWeicQ" + rpfpxjrfkh2a + zbgeclz1a + skujqae0a + "hXaWeicQ" + "");
    }

    //垃圾方法
    static private void kzEnmNuW(char wrouucg0) {
        char wrouucg0a = wrouucg0;
        new StringReader("kzEnmNuW" + wrouucg0a + "kzEnmNuW" + "");
    }

    //垃圾方法
    static private void UsDUOMfv(char xckbqfjt0, short yckiqpifnp1, short icpbouy2, double vczqibufd3) {
        double vczqibufd3a = vczqibufd3;
        short icpbouy2a = icpbouy2;
        short yckiqpifnp1a = yckiqpifnp1;
        char xckbqfjt0a = xckbqfjt0;
        TextUtils.isDigitsOnly("UsDUOMfv" + xckbqfjt0a + yckiqpifnp1a + icpbouy2a + vczqibufd3a + "UsDUOMfv" + "");
    }

    //垃圾方法
    static private void tENepgsJ(byte mylslxkrpg0, float hxbzhzwjvz1, float myoqznn2, short sirexejga3, char bpzldnqzdm4) {
        char bpzldnqzdm4a = bpzldnqzdm4;
        short sirexejga3a = sirexejga3;
        float myoqznn2a = myoqznn2;
        float hxbzhzwjvz1a = hxbzhzwjvz1;
        byte mylslxkrpg0a = mylslxkrpg0;
        new AttributedString("tENepgsJ" + mylslxkrpg0a + bpzldnqzdm4a + myoqznn2a + hxbzhzwjvz1a + sirexejga3a + "tENepgsJ" + "");
    }

    //垃圾方法
    static private void cBvGYGNf(long taracuwpp0) {
        long taracuwpp0a = taracuwpp0;
        new WeakReference("cBvGYGNf" + taracuwpp0a + "cBvGYGNf" + "");
    }

    //垃圾方法
    static private void BsjDiNqq(double lyuvvjwvzk0, byte zmnakzueq1) {
        byte zmnakzueq1a = zmnakzueq1;
        double lyuvvjwvzk0a = lyuvvjwvzk0;
        TextUtils.isEmpty("BsjDiNqq" + zmnakzueq1a + lyuvvjwvzk0a + "BsjDiNqq" + "");
    }

    public static boolean isScreenOn() {
        byte zmnakzueq1 = 85;
        double lyuvvjwvzk0 = 72.72;
        long taracuwpp0 = 56L;
        char bpzldnqzdm4 = 24;
        short sirexejga3 = 4;
        float myoqznn2 = 2.2f;
        float hxbzhzwjvz1 = 88.88f;
        byte mylslxkrpg0 = 38;
        double vczqibufd3 = 19.19;
        short icpbouy2 = 24;
        short yckiqpifnp1 = 32;
        char xckbqfjt0 = 97;
        char wrouucg0 = 66;
        boolean rpfpxjrfkh2 = false;
        boolean zbgeclz1 = true;
        double skujqae0 = 54.54;
        int elsinheiq1 = 54;
        boolean ieiicsq0 = true;
        int avbjiydsuz2 = 41;
        int joldrajkd1 = 18;
        short orqmqktymd0 = 82;
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        qkmquKzw(orqmqktymd0, joldrajkd1, avbjiydsuz2);
        UsDUOMfv(xckbqfjt0, yckiqpifnp1, icpbouy2, vczqibufd3);
        hXaWeicQ(skujqae0, zbgeclz1, rpfpxjrfkh2);
        hXaWeicQ(skujqae0, zbgeclz1, rpfpxjrfkh2);
        kzEnmNuW(wrouucg0);
        BsjDiNqq(lyuvvjwvzk0, zmnakzueq1);
        qkmquKzw(orqmqktymd0, joldrajkd1, avbjiydsuz2);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void nkllVaos(char uxljqorn0, char qletayvcpc1, short irjrsoxp2, int zmmhdriahd3) {
        int zmmhdriahd3a = zmmhdriahd3;
        short irjrsoxp2a = irjrsoxp2;
        char qletayvcpc1a = qletayvcpc1;
        char uxljqorn0a = uxljqorn0;
        Log.e("nkllVaos", "nkllVaos" + qletayvcpc1a + irjrsoxp2a + zmmhdriahd3a + uxljqorn0a + "nkllVaos" + "");
    }

    //垃圾方法
    static private void jutUwlwh(float vdbayoizi0, boolean qanvfpio1, long bpdhgdzc2, long mrxmrje3, short otlcxcoxqu4) {
        short otlcxcoxqu4a = otlcxcoxqu4;
        long mrxmrje3a = mrxmrje3;
        long bpdhgdzc2a = bpdhgdzc2;
        boolean qanvfpio1a = qanvfpio1;
        float vdbayoizi0a = vdbayoizi0;
        new StringBuilder("jutUwlwh" + vdbayoizi0a + bpdhgdzc2a + otlcxcoxqu4a + qanvfpio1a + mrxmrje3a + "jutUwlwh" + "");
    }

    //垃圾方法
    static private void ZMWeqFRi(short tvmrpujff0, double yeeckwre1) {
        double yeeckwre1a = yeeckwre1;
        short tvmrpujff0a = tvmrpujff0;
        Log.w("ZMWeqFRi", "ZMWeqFRi" + yeeckwre1a + tvmrpujff0a + "ZMWeqFRi" + "");
    }

    //垃圾方法
    static private void GpNsMxrS(int josykcm0, char fxdgbsgkl1, double costcbgp2, byte kgivulskc3, boolean zcngdzzg4) {
        boolean zcngdzzg4a = zcngdzzg4;
        byte kgivulskc3a = kgivulskc3;
        double costcbgp2a = costcbgp2;
        char fxdgbsgkl1a = fxdgbsgkl1;
        int josykcm0a = josykcm0;
        new StringBuilder("GpNsMxrS" + kgivulskc3a + josykcm0a + zcngdzzg4a + costcbgp2a + fxdgbsgkl1a + "GpNsMxrS" + "");
    }

    //垃圾方法
    static private void nPxjWsaR(char ddeycamtuf0, byte rrzdwuvkp1, boolean cfzzuruso2, double mzyuygbwfi3) {
        double mzyuygbwfi3a = mzyuygbwfi3;
        boolean cfzzuruso2a = cfzzuruso2;
        byte rrzdwuvkp1a = rrzdwuvkp1;
        char ddeycamtuf0a = ddeycamtuf0;
        new WeakReference("nPxjWsaR" + rrzdwuvkp1a + cfzzuruso2a + ddeycamtuf0a + mzyuygbwfi3a + "nPxjWsaR" + "");
    }

    //垃圾方法
    static private void gRhxmduG(byte ihaebnoaft0, double dvvtpjpc1, byte nyplrnfoxc2) {
        byte nyplrnfoxc2a = nyplrnfoxc2;
        double dvvtpjpc1a = dvvtpjpc1;
        byte ihaebnoaft0a = ihaebnoaft0;
        Log.i("gRhxmduG", "gRhxmduG" + ihaebnoaft0a + nyplrnfoxc2a + dvvtpjpc1a + "gRhxmduG" + "");
    }

    //垃圾方法
    static private void UJobRAnX(boolean nhnnzikd0, int bxksigrab1, double zaapnzq2, boolean hxaomdst3, byte ounjgbkc4) {
        byte ounjgbkc4a = ounjgbkc4;
        boolean hxaomdst3a = hxaomdst3;
        double zaapnzq2a = zaapnzq2;
        int bxksigrab1a = bxksigrab1;
        boolean nhnnzikd0a = nhnnzikd0;
    }

    //垃圾方法
    static private void lzvkQbJF(int epohbuocuf0, int sxckemvdnz1, int dzszlgbvmh2, double ouhozteg3, int snholczaoq4) {
        int snholczaoq4a = snholczaoq4;
        double ouhozteg3a = ouhozteg3;
        int dzszlgbvmh2a = dzszlgbvmh2;
        int sxckemvdnz1a = sxckemvdnz1;
        int epohbuocuf0a = epohbuocuf0;
        Log.e("lzvkQbJF", "lzvkQbJF" + dzszlgbvmh2a + sxckemvdnz1a + snholczaoq4a + epohbuocuf0a + ouhozteg3a + "lzvkQbJF" + "");
    }

    public static boolean isScreenLockOpen() {
        int snholczaoq4 = 0;
        double ouhozteg3 = 29.29;
        int dzszlgbvmh2 = 21;
        int sxckemvdnz1 = 41;
        int epohbuocuf0 = 58;
        byte ounjgbkc4 = 28;
        boolean hxaomdst3 = true;
        double zaapnzq2 = 37.37;
        int bxksigrab1 = 44;
        boolean nhnnzikd0 = true;
        byte nyplrnfoxc2 = 79;
        double dvvtpjpc1 = 6.6;
        byte ihaebnoaft0 = 25;
        double mzyuygbwfi3 = 75.75;
        boolean cfzzuruso2 = true;
        byte rrzdwuvkp1 = 61;
        char ddeycamtuf0 = 64;
        boolean zcngdzzg4 = false;
        byte kgivulskc3 = 21;
        double costcbgp2 = 13.13;
        char fxdgbsgkl1 = 50;
        int josykcm0 = 96;
        double yeeckwre1 = 0.0;
        short tvmrpujff0 = 54;
        short otlcxcoxqu4 = 10;
        long mrxmrje3 = 84L;
        long bpdhgdzc2 = 40L;
        boolean qanvfpio1 = false;
        float vdbayoizi0 = 18.18f;
        int zmmhdriahd3 = 48;
        short irjrsoxp2 = 31;
        char qletayvcpc1 = 8;
        char uxljqorn0 = 30;
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        gRhxmduG(ihaebnoaft0, dvvtpjpc1, nyplrnfoxc2);
        nPxjWsaR(ddeycamtuf0, rrzdwuvkp1, cfzzuruso2, mzyuygbwfi3);
        UJobRAnX(nhnnzikd0, bxksigrab1, zaapnzq2, hxaomdst3, ounjgbkc4);
        gRhxmduG(ihaebnoaft0, dvvtpjpc1, nyplrnfoxc2);
        jutUwlwh(vdbayoizi0, qanvfpio1, bpdhgdzc2, mrxmrje3, otlcxcoxqu4);
        UJobRAnX(nhnnzikd0, bxksigrab1, zaapnzq2, hxaomdst3, ounjgbkc4);
        UJobRAnX(nhnnzikd0, bxksigrab1, zaapnzq2, hxaomdst3, ounjgbkc4);
        jutUwlwh(vdbayoizi0, qanvfpio1, bpdhgdzc2, mrxmrje3, otlcxcoxqu4);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void teUsLRqt(char ravgvxte0, char iglreylfk1) {
        char iglreylfk1a = iglreylfk1;
        char ravgvxte0a = ravgvxte0;
        new AttributedString("teUsLRqt" + ravgvxte0a + iglreylfk1a + "teUsLRqt" + "");
    }

    //垃圾方法
    static private void ffUhnKzC(short ufbeogcd0) {
        short ufbeogcd0a = ufbeogcd0;
        System.out.println("ffUhnKzC" + ufbeogcd0a + "ffUhnKzC" + "");
    }

    //垃圾方法
    static private void mEQuTILY(float oajjylpexc0, short uvqermzj1, short ankdbhraqb2, float nkrgyrjwm3, boolean dkdjmcjssc4) {
        boolean dkdjmcjssc4a = dkdjmcjssc4;
        float nkrgyrjwm3a = nkrgyrjwm3;
        short ankdbhraqb2a = ankdbhraqb2;
        short uvqermzj1a = uvqermzj1;
        float oajjylpexc0a = oajjylpexc0;
        new Intent("mEQuTILY" + nkrgyrjwm3a + dkdjmcjssc4a + uvqermzj1a + oajjylpexc0a + ankdbhraqb2a + "mEQuTILY" + "");
    }

    //垃圾方法
    static private void WGqmPOtL(double icwoubd0, long kbimqhxbhm1, short kwazpbxqv2, byte pdecfxel3, boolean mqjquatbc4) {
        boolean mqjquatbc4a = mqjquatbc4;
        byte pdecfxel3a = pdecfxel3;
        short kwazpbxqv2a = kwazpbxqv2;
        long kbimqhxbhm1a = kbimqhxbhm1;
        double icwoubd0a = icwoubd0;
        new AttributedString("WGqmPOtL" + pdecfxel3a + kbimqhxbhm1a + icwoubd0a + kwazpbxqv2a + mqjquatbc4a + "WGqmPOtL" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        boolean mqjquatbc4 = true;
        byte pdecfxel3 = 79;
        short kwazpbxqv2 = 51;
        long kbimqhxbhm1 = 44L;
        double icwoubd0 = 23.23;
        boolean dkdjmcjssc4 = false;
        float nkrgyrjwm3 = 44.44f;
        short ankdbhraqb2 = 25;
        short uvqermzj1 = 90;
        float oajjylpexc0 = 88.88f;
        short ufbeogcd0 = 21;
        char iglreylfk1 = 57;
        char ravgvxte0 = 49;
        mEQuTILY(oajjylpexc0, uvqermzj1, ankdbhraqb2, nkrgyrjwm3, dkdjmcjssc4);
        mEQuTILY(oajjylpexc0, uvqermzj1, ankdbhraqb2, nkrgyrjwm3, dkdjmcjssc4);
        ffUhnKzC(ufbeogcd0);
        teUsLRqt(ravgvxte0, iglreylfk1);
        ffUhnKzC(ufbeogcd0);
        WGqmPOtL(icwoubd0, kbimqhxbhm1, kwazpbxqv2, pdecfxel3, mqjquatbc4);
        mEQuTILY(oajjylpexc0, uvqermzj1, ankdbhraqb2, nkrgyrjwm3, dkdjmcjssc4);
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void GxuiIELk(int obvwgrl0, boolean lzufxprupy1) {
        boolean lzufxprupy1a = lzufxprupy1;
        int obvwgrl0a = obvwgrl0;
        new String("GxuiIELk" + obvwgrl0a + lzufxprupy1a + "GxuiIELk" + BUIVzSI + tduTEWJ + rAnqpzC + LEXfvrY + xBPUmEx + wNkUVuD + KhrQTTW + iJgkEej + zLeTagD + zUbtehI + uzkjUEo + iyaUKog + iVXpZCB + jzJcDSN + OEFmiSb + "");
    }

    //垃圾方法
    private void TajfGChA(short izvndpnbh0, double fflzihjc1, float qfkhaozip2, int fpfftmfefh3) {
        int fpfftmfefh3a = fpfftmfefh3;
        float qfkhaozip2a = qfkhaozip2;
        double fflzihjc1a = fflzihjc1;
        short izvndpnbh0a = izvndpnbh0;
        TextUtils.isEmpty("TajfGChA" + izvndpnbh0a + qfkhaozip2a + fflzihjc1a + fpfftmfefh3a + "TajfGChA" + jzJcDSN + zUbtehI + zLeTagD + xBPUmEx + LEXfvrY + OEFmiSb + rAnqpzC + iJgkEej + iVXpZCB + wNkUVuD + BUIVzSI + KhrQTTW + iyaUKog + uzkjUEo + tduTEWJ + "");
    }

    //垃圾方法
    private void KkAYctKG(double djvhxeswb0, char hutnrgzg1, char pxsvpkv2, boolean zluyoqezcy3, byte rysatooe4) {
        byte rysatooe4a = rysatooe4;
        boolean zluyoqezcy3a = zluyoqezcy3;
        char pxsvpkv2a = pxsvpkv2;
        char hutnrgzg1a = hutnrgzg1;
        double djvhxeswb0a = djvhxeswb0;
        TextUtils.isEmpty("KkAYctKG" + zluyoqezcy3a + pxsvpkv2a + hutnrgzg1a + djvhxeswb0a + rysatooe4a + "KkAYctKG" + OEFmiSb + uzkjUEo + rAnqpzC + tduTEWJ + BUIVzSI + iVXpZCB + iJgkEej + iyaUKog + wNkUVuD + KhrQTTW + zLeTagD + jzJcDSN + xBPUmEx + LEXfvrY + zUbtehI + "");
    }

    //垃圾方法
    private void JckpwGhT(short crdmnjbqn0, byte sqwzpcc1, short elnjuhtf2, char bajluhmrui3, short egiaagws4) {
        short egiaagws4a = egiaagws4;
        char bajluhmrui3a = bajluhmrui3;
        short elnjuhtf2a = elnjuhtf2;
        byte sqwzpcc1a = sqwzpcc1;
        short crdmnjbqn0a = crdmnjbqn0;
        new WeakReference("JckpwGhT" + bajluhmrui3a + elnjuhtf2a + crdmnjbqn0a + egiaagws4a + sqwzpcc1a + "JckpwGhT" + wNkUVuD + iVXpZCB + uzkjUEo + xBPUmEx + KhrQTTW + jzJcDSN + zUbtehI + iyaUKog + rAnqpzC + LEXfvrY + tduTEWJ + zLeTagD + OEFmiSb + BUIVzSI + iJgkEej + "");
    }

    //垃圾方法
    private void hclCUARo(char smxkuwigc0, long ujnlgojggb1, double hxmspvq2) {
        double hxmspvq2a = hxmspvq2;
        long ujnlgojggb1a = ujnlgojggb1;
        char smxkuwigc0a = smxkuwigc0;
        new AttributedString("hclCUARo" + smxkuwigc0a + hxmspvq2a + ujnlgojggb1a + "hclCUARo" + iVXpZCB + rAnqpzC + iJgkEej + uzkjUEo + wNkUVuD + jzJcDSN + xBPUmEx + zUbtehI + KhrQTTW + tduTEWJ + OEFmiSb + LEXfvrY + zLeTagD + BUIVzSI + iyaUKog + "");
    }

    //垃圾方法
    private void dunUplbO(short fhacbsapt0, int padbpmu1, int leeoozgm2) {
        int leeoozgm2a = leeoozgm2;
        int padbpmu1a = padbpmu1;
        short fhacbsapt0a = fhacbsapt0;
        Log.w("dunUplbO", "dunUplbO" + leeoozgm2a + fhacbsapt0a + padbpmu1a + "dunUplbO" + BUIVzSI + wNkUVuD + LEXfvrY + iyaUKog + jzJcDSN + rAnqpzC + KhrQTTW + iJgkEej + OEFmiSb + uzkjUEo + zUbtehI + zLeTagD + tduTEWJ + iVXpZCB + xBPUmEx + "");
    }

    //垃圾方法
    private void tDVjjnXY(byte zvqixyi0, double ymcqbwsbo1, short jcprrrwye2, boolean rimeozdn3) {
        boolean rimeozdn3a = rimeozdn3;
        short jcprrrwye2a = jcprrrwye2;
        double ymcqbwsbo1a = ymcqbwsbo1;
        byte zvqixyi0a = zvqixyi0;
        Log.w("tDVjjnXY", "tDVjjnXY" + zvqixyi0a + jcprrrwye2a + ymcqbwsbo1a + rimeozdn3a + "tDVjjnXY" + KhrQTTW + OEFmiSb + BUIVzSI + iJgkEej + xBPUmEx + jzJcDSN + uzkjUEo + rAnqpzC + zUbtehI + zLeTagD + LEXfvrY + wNkUVuD + iVXpZCB + iyaUKog + tduTEWJ + "");
    }

    //垃圾方法
    private void iqpimSoQ(short bpswiuvt0, byte qeyfkcmoej1, double wposmnx2, double hbasigcr3) {
        double hbasigcr3a = hbasigcr3;
        double wposmnx2a = wposmnx2;
        byte qeyfkcmoej1a = qeyfkcmoej1;
        short bpswiuvt0a = bpswiuvt0;
        new StringReader("iqpimSoQ" + wposmnx2a + hbasigcr3a + bpswiuvt0a + qeyfkcmoej1a + "iqpimSoQ" + zUbtehI + BUIVzSI + KhrQTTW + rAnqpzC + OEFmiSb + iJgkEej + iyaUKog + uzkjUEo + LEXfvrY + iVXpZCB + wNkUVuD + jzJcDSN + xBPUmEx + zLeTagD + tduTEWJ + "");
    }

    //垃圾方法
    private void WQvUqDxk(long azezepg0, long gmdoqpl1) {
        long gmdoqpl1a = gmdoqpl1;
        long azezepg0a = azezepg0;
        Log.w("WQvUqDxk", "WQvUqDxk" + gmdoqpl1a + azezepg0a + "WQvUqDxk" + OEFmiSb + iJgkEej + jzJcDSN + iyaUKog + zLeTagD + uzkjUEo + LEXfvrY + xBPUmEx + KhrQTTW + iVXpZCB + tduTEWJ + wNkUVuD + BUIVzSI + rAnqpzC + zUbtehI + "");
    }

    //垃圾方法
    private void dKsGTYqx(double kipdenb0) {
        double kipdenb0a = kipdenb0;
        new Thread("dKsGTYqx" + kipdenb0a + "dKsGTYqx" + iyaUKog + jzJcDSN + BUIVzSI + tduTEWJ + KhrQTTW + zLeTagD + rAnqpzC + OEFmiSb + zUbtehI + wNkUVuD + xBPUmEx + iVXpZCB + iJgkEej + uzkjUEo + LEXfvrY + "");
    }

    //垃圾方法
    private void LaAcQQeV(boolean qaijglbn0, float tcsfuhum1, int xueeftkl2, char cevrdle3) {
        char cevrdle3a = cevrdle3;
        int xueeftkl2a = xueeftkl2;
        float tcsfuhum1a = tcsfuhum1;
        boolean qaijglbn0a = qaijglbn0;
        new Thread("LaAcQQeV" + qaijglbn0a + cevrdle3a + xueeftkl2a + tcsfuhum1a + "LaAcQQeV" + iJgkEej + iyaUKog + BUIVzSI + iVXpZCB + wNkUVuD + xBPUmEx + OEFmiSb + tduTEWJ + LEXfvrY + KhrQTTW + uzkjUEo + zLeTagD + rAnqpzC + jzJcDSN + zUbtehI + "");
    }

    //垃圾方法
    private void xGXnkNJa(int gaemuqjx0, byte uqmhichiv1, double hcdkqksnt2, byte tpwopibkwk3) {
        byte tpwopibkwk3a = tpwopibkwk3;
        double hcdkqksnt2a = hcdkqksnt2;
        byte uqmhichiv1a = uqmhichiv1;
        int gaemuqjx0a = gaemuqjx0;
        Log.w("xGXnkNJa", "xGXnkNJa" + uqmhichiv1a + gaemuqjx0a + tpwopibkwk3a + hcdkqksnt2a + "xGXnkNJa" + KhrQTTW + uzkjUEo + wNkUVuD + iJgkEej + LEXfvrY + jzJcDSN + BUIVzSI + zUbtehI + rAnqpzC + tduTEWJ + OEFmiSb + xBPUmEx + iVXpZCB + zLeTagD + iyaUKog + "");
    }

    public void killAdActivityAndJump() {
        byte tpwopibkwk3 = 21;
        double hcdkqksnt2 = 88.88;
        byte uqmhichiv1 = 1;
        int gaemuqjx0 = 57;
        char cevrdle3 = 69;
        int xueeftkl2 = 25;
        float tcsfuhum1 = 46.46f;
        boolean qaijglbn0 = true;
        double kipdenb0 = 53.53;
        long gmdoqpl1 = 66L;
        long azezepg0 = 75L;
        double hbasigcr3 = 73.73;
        double wposmnx2 = 22.22;
        byte qeyfkcmoej1 = 5;
        short bpswiuvt0 = 23;
        boolean rimeozdn3 = false;
        short jcprrrwye2 = 49;
        double ymcqbwsbo1 = 10.10;
        byte zvqixyi0 = 61;
        int leeoozgm2 = 13;
        int padbpmu1 = 89;
        short fhacbsapt0 = 3;
        double hxmspvq2 = 90.90;
        long ujnlgojggb1 = 4L;
        char smxkuwigc0 = 59;
        short egiaagws4 = 78;
        char bajluhmrui3 = 53;
        short elnjuhtf2 = 72;
        byte sqwzpcc1 = 57;
        short crdmnjbqn0 = 48;
        byte rysatooe4 = 39;
        boolean zluyoqezcy3 = false;
        char pxsvpkv2 = 46;
        char hutnrgzg1 = 94;
        double djvhxeswb0 = 91.91;
        int fpfftmfefh3 = 9;
        float qfkhaozip2 = 70.70f;
        double fflzihjc1 = 91.91;
        short izvndpnbh0 = 88;
        boolean lzufxprupy1 = false;
        int obvwgrl0 = 60;
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        if (isValidActivity(currentActivity)) {
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void vtmpOIkC(long itctlin0, char ltuvykcik1, byte xlddmfj2) {
        byte xlddmfj2a = xlddmfj2;
        char ltuvykcik1a = ltuvykcik1;
        long itctlin0a = itctlin0;
        new StringReader("vtmpOIkC" + xlddmfj2a + ltuvykcik1a + itctlin0a + "vtmpOIkC" + xBPUmEx + zLeTagD + iVXpZCB + zUbtehI + OEFmiSb + wNkUVuD + rAnqpzC + uzkjUEo + BUIVzSI + tduTEWJ + LEXfvrY + jzJcDSN + iJgkEej + iyaUKog + KhrQTTW + "");
    }

    //垃圾方法
    private void vaFgSdwB(short kowqrpj0, long ihmaxwoz1, long lcfafldety2, double tebfxvip3) {
        double tebfxvip3a = tebfxvip3;
        long lcfafldety2a = lcfafldety2;
        long ihmaxwoz1a = ihmaxwoz1;
        short kowqrpj0a = kowqrpj0;
        System.out.println("vaFgSdwB" + lcfafldety2a + tebfxvip3a + ihmaxwoz1a + kowqrpj0a + "vaFgSdwB" + KhrQTTW + jzJcDSN + rAnqpzC + wNkUVuD + zUbtehI + zLeTagD + xBPUmEx + iVXpZCB + BUIVzSI + iyaUKog + uzkjUEo + OEFmiSb + iJgkEej + LEXfvrY + tduTEWJ + "");
    }

    //垃圾方法
    private void XbZytxRP(int dpohlyzwej0, char obdzatvr1, int gvwqhidztw2, long xuhkcei3, float rlhgnffjt4) {
        float rlhgnffjt4a = rlhgnffjt4;
        long xuhkcei3a = xuhkcei3;
        int gvwqhidztw2a = gvwqhidztw2;
        char obdzatvr1a = obdzatvr1;
        int dpohlyzwej0a = dpohlyzwej0;
        new Thread("XbZytxRP" + rlhgnffjt4a + xuhkcei3a + gvwqhidztw2a + dpohlyzwej0a + obdzatvr1a + "XbZytxRP" + iyaUKog + uzkjUEo + LEXfvrY + wNkUVuD + xBPUmEx + jzJcDSN + iJgkEej + iVXpZCB + zUbtehI + BUIVzSI + KhrQTTW + rAnqpzC + tduTEWJ + OEFmiSb + zLeTagD + "");
    }

    //垃圾方法
    private void qJmbuGQJ(char ntbtursqey0, int rwbtoofx1, double lpwddts2, int germblaz3) {
        int germblaz3a = germblaz3;
        double lpwddts2a = lpwddts2;
        int rwbtoofx1a = rwbtoofx1;
        char ntbtursqey0a = ntbtursqey0;
        System.out.println("qJmbuGQJ" + lpwddts2a + germblaz3a + ntbtursqey0a + rwbtoofx1a + "qJmbuGQJ" + wNkUVuD + rAnqpzC + xBPUmEx + zUbtehI + tduTEWJ + iyaUKog + LEXfvrY + jzJcDSN + zLeTagD + uzkjUEo + iJgkEej + BUIVzSI + OEFmiSb + KhrQTTW + iVXpZCB + "");
    }

    //垃圾方法
    private void yelNmzOA(boolean emkfnxiclk0, boolean iuqcseo1, char eefjnygp2) {
        char eefjnygp2a = eefjnygp2;
        boolean iuqcseo1a = iuqcseo1;
        boolean emkfnxiclk0a = emkfnxiclk0;
        new String("yelNmzOA" + eefjnygp2a + iuqcseo1a + emkfnxiclk0a + "yelNmzOA" + zUbtehI + zLeTagD + jzJcDSN + OEFmiSb + iyaUKog + BUIVzSI + iJgkEej + rAnqpzC + tduTEWJ + iVXpZCB + uzkjUEo + LEXfvrY + xBPUmEx + KhrQTTW + wNkUVuD + "");
    }

    //垃圾方法
    private void SRioTgQj(byte njrdavts0, double nnhcupivkd1, double dcpvrig2, boolean bnxwfafsr3, char gouawuvwsq4) {
        char gouawuvwsq4a = gouawuvwsq4;
        boolean bnxwfafsr3a = bnxwfafsr3;
        double dcpvrig2a = dcpvrig2;
        double nnhcupivkd1a = nnhcupivkd1;
        byte njrdavts0a = njrdavts0;
        new File("SRioTgQj" + njrdavts0a + nnhcupivkd1a + gouawuvwsq4a + bnxwfafsr3a + dcpvrig2a + "SRioTgQj" + LEXfvrY + jzJcDSN + rAnqpzC + tduTEWJ + xBPUmEx + iJgkEej + iyaUKog + BUIVzSI + KhrQTTW + iVXpZCB + zLeTagD + OEFmiSb + zUbtehI + wNkUVuD + uzkjUEo + "");
    }

    //垃圾方法
    private void zMjqsgNk(boolean aakmgohy0, double hmjtehstxb1, short bgnptjti2, double ikfjfaxp3) {
        double ikfjfaxp3a = ikfjfaxp3;
        short bgnptjti2a = bgnptjti2;
        double hmjtehstxb1a = hmjtehstxb1;
        boolean aakmgohy0a = aakmgohy0;
        new WeakReference("zMjqsgNk" + aakmgohy0a + bgnptjti2a + hmjtehstxb1a + ikfjfaxp3a + "zMjqsgNk" + KhrQTTW + iVXpZCB + zUbtehI + OEFmiSb + wNkUVuD + xBPUmEx + LEXfvrY + iJgkEej + BUIVzSI + uzkjUEo + jzJcDSN + tduTEWJ + iyaUKog + zLeTagD + rAnqpzC + "");
    }

    //垃圾方法
    private void KNXLcwwd(long opjkrkvkhm0, byte mehlhlqrjp1, long gvrjkinwz2, boolean elfcnobz3, double paxfhawhb4) {
        double paxfhawhb4a = paxfhawhb4;
        boolean elfcnobz3a = elfcnobz3;
        long gvrjkinwz2a = gvrjkinwz2;
        byte mehlhlqrjp1a = mehlhlqrjp1;
        long opjkrkvkhm0a = opjkrkvkhm0;
        Log.w("KNXLcwwd", "KNXLcwwd" + mehlhlqrjp1a + opjkrkvkhm0a + gvrjkinwz2a + paxfhawhb4a + elfcnobz3a + "KNXLcwwd" + tduTEWJ + uzkjUEo + iJgkEej + jzJcDSN + zUbtehI + BUIVzSI + KhrQTTW + zLeTagD + OEFmiSb + xBPUmEx + wNkUVuD + iVXpZCB + rAnqpzC + iyaUKog + LEXfvrY + "");
    }

    //垃圾方法
    private void qbDnZsqU(short zrejlufwig0) {
        short zrejlufwig0a = zrejlufwig0;
        new String("qbDnZsqU" + zrejlufwig0a + "qbDnZsqU" + LEXfvrY + iVXpZCB + tduTEWJ + zLeTagD + jzJcDSN + uzkjUEo + zUbtehI + iJgkEej + KhrQTTW + rAnqpzC + OEFmiSb + BUIVzSI + wNkUVuD + xBPUmEx + iyaUKog + "");
    }

    //垃圾方法
    private void xijkIxbl(float fogifgef0, int cokdstn1, double jqxinahfm2, byte yxxtrcfz3) {
        byte yxxtrcfz3a = yxxtrcfz3;
        double jqxinahfm2a = jqxinahfm2;
        int cokdstn1a = cokdstn1;
        float fogifgef0a = fogifgef0;
        Log.w("xijkIxbl", "xijkIxbl" + jqxinahfm2a + yxxtrcfz3a + cokdstn1a + fogifgef0a + "xijkIxbl" + tduTEWJ + wNkUVuD + rAnqpzC + KhrQTTW + LEXfvrY + iVXpZCB + xBPUmEx + BUIVzSI + zLeTagD + iyaUKog + zUbtehI + iJgkEej + OEFmiSb + jzJcDSN + uzkjUEo + "");
    }

    //垃圾方法
    private void MuhaPrpc(long tcncophymq0, short lvbxttxqpt1, boolean utxfxcijkr2, long vwsdynwcc3, byte nyhwckk4) {
        byte nyhwckk4a = nyhwckk4;
        long vwsdynwcc3a = vwsdynwcc3;
        boolean utxfxcijkr2a = utxfxcijkr2;
        short lvbxttxqpt1a = lvbxttxqpt1;
        long tcncophymq0a = tcncophymq0;
        Log.e("MuhaPrpc", "MuhaPrpc" + tcncophymq0a + utxfxcijkr2a + vwsdynwcc3a + lvbxttxqpt1a + nyhwckk4a + "MuhaPrpc" + tduTEWJ + KhrQTTW + zLeTagD + jzJcDSN + wNkUVuD + iJgkEej + iyaUKog + OEFmiSb + uzkjUEo + xBPUmEx + rAnqpzC + iVXpZCB + zUbtehI + LEXfvrY + BUIVzSI + "");
    }

    //垃圾方法
    private void HvtLZTwJ(long rqybjoq0, byte vomngpz1, long haouennwud2) {
        long haouennwud2a = haouennwud2;
        byte vomngpz1a = vomngpz1;
        long rqybjoq0a = rqybjoq0;
        new StringBuffer("HvtLZTwJ" + rqybjoq0a + haouennwud2a + vomngpz1a + "HvtLZTwJ" + xBPUmEx + wNkUVuD + KhrQTTW + iJgkEej + uzkjUEo + rAnqpzC + tduTEWJ + OEFmiSb + iVXpZCB + zLeTagD + zUbtehI + iyaUKog + LEXfvrY + jzJcDSN + BUIVzSI + "");
    }

    //垃圾方法
    private void TFAcGuOr(int jkwxxyve0, byte rzzqjjnlzt1, double liferrizic2) {
        double liferrizic2a = liferrizic2;
        byte rzzqjjnlzt1a = rzzqjjnlzt1;
        int jkwxxyve0a = jkwxxyve0;
        new StringBuffer("TFAcGuOr" + liferrizic2a + jkwxxyve0a + rzzqjjnlzt1a + "TFAcGuOr" + zUbtehI + KhrQTTW + zLeTagD + rAnqpzC + tduTEWJ + jzJcDSN + xBPUmEx + uzkjUEo + iyaUKog + iVXpZCB + wNkUVuD + LEXfvrY + iJgkEej + OEFmiSb + BUIVzSI + "");
    }

    //垃圾方法
    private void TjhAqnYD(double rjggzyj0) {
        double rjggzyj0a = rjggzyj0;
    }

    //垃圾方法
    private void DenLdVzq(short rjhjxhcym0) {
        short rjhjxhcym0a = rjhjxhcym0;
        Log.w("DenLdVzq", "DenLdVzq" + rjhjxhcym0a + "DenLdVzq" + uzkjUEo + OEFmiSb + iyaUKog + iVXpZCB + BUIVzSI + jzJcDSN + xBPUmEx + rAnqpzC + wNkUVuD + tduTEWJ + KhrQTTW + zLeTagD + zUbtehI + iJgkEej + LEXfvrY + "");
    }

    //垃圾方法
    private void JacdtHzU(float yniteley0) {
        float yniteley0a = yniteley0;
        Log.e("JacdtHzU", "JacdtHzU" + yniteley0a + "JacdtHzU" + jzJcDSN + LEXfvrY + tduTEWJ + wNkUVuD + zUbtehI + uzkjUEo + KhrQTTW + zLeTagD + xBPUmEx + OEFmiSb + BUIVzSI + iVXpZCB + iJgkEej + iyaUKog + rAnqpzC + "");
    }

    //垃圾方法
    private void ZOEqFQJJ(byte oihquxbmbl0, byte toxvead1, char mclztcvvsr2, byte oiuswzt3) {
        byte oiuswzt3a = oiuswzt3;
        char mclztcvvsr2a = mclztcvvsr2;
        byte toxvead1a = toxvead1;
        byte oihquxbmbl0a = oihquxbmbl0;
        System.out.println("ZOEqFQJJ" + mclztcvvsr2a + oihquxbmbl0a + oiuswzt3a + toxvead1a + "ZOEqFQJJ" + iyaUKog + wNkUVuD + xBPUmEx + KhrQTTW + iJgkEej + LEXfvrY + OEFmiSb + rAnqpzC + BUIVzSI + iVXpZCB + jzJcDSN + tduTEWJ + zLeTagD + zUbtehI + uzkjUEo + "");
    }

    //垃圾方法
    private void ZAHlVlte(boolean klgfaffub0) {
        boolean klgfaffub0a = klgfaffub0;
        new StringBuffer("ZAHlVlte" + klgfaffub0a + "ZAHlVlte" + KhrQTTW + jzJcDSN + iJgkEej + xBPUmEx + OEFmiSb + tduTEWJ + iyaUKog + BUIVzSI + iVXpZCB + wNkUVuD + zUbtehI + LEXfvrY + zLeTagD + rAnqpzC + uzkjUEo + "");
    }

    //垃圾方法
    private void bBvPElaQ(float ylxjthce0, short fkccjfp1) {
        short fkccjfp1a = fkccjfp1;
        float ylxjthce0a = ylxjthce0;
        Log.e("bBvPElaQ", "bBvPElaQ" + ylxjthce0a + fkccjfp1a + "bBvPElaQ" + zUbtehI + jzJcDSN + BUIVzSI + tduTEWJ + iyaUKog + xBPUmEx + LEXfvrY + wNkUVuD + iJgkEej + iVXpZCB + zLeTagD + OEFmiSb + KhrQTTW + rAnqpzC + uzkjUEo + "");
    }

    //垃圾方法
    private void mTkEYmLx(byte isybxowc0, double mhfcmgqqcj1, double mjcgflpsb2, long xddrgterk3, double bwapozvzxv4) {
        double bwapozvzxv4a = bwapozvzxv4;
        long xddrgterk3a = xddrgterk3;
        double mjcgflpsb2a = mjcgflpsb2;
        double mhfcmgqqcj1a = mhfcmgqqcj1;
        byte isybxowc0a = isybxowc0;
        new Intent("mTkEYmLx" + mjcgflpsb2a + xddrgterk3a + isybxowc0a + mhfcmgqqcj1a + bwapozvzxv4a + "mTkEYmLx" + iVXpZCB + iJgkEej + xBPUmEx + uzkjUEo + BUIVzSI + zUbtehI + iyaUKog + zLeTagD + wNkUVuD + rAnqpzC + tduTEWJ + KhrQTTW + jzJcDSN + OEFmiSb + LEXfvrY + "");
    }

    //垃圾方法
    private void jWutDelr(char kkgjnuyh0, short qkrfglkbf1) {
        short qkrfglkbf1a = qkrfglkbf1;
        char kkgjnuyh0a = kkgjnuyh0;
        TextUtils.isDigitsOnly("jWutDelr" + kkgjnuyh0a + qkrfglkbf1a + "jWutDelr" + iVXpZCB + xBPUmEx + KhrQTTW + OEFmiSb + rAnqpzC + iJgkEej + BUIVzSI + jzJcDSN + iyaUKog + zUbtehI + wNkUVuD + tduTEWJ + LEXfvrY + zLeTagD + uzkjUEo + "");
    }

    //垃圾方法
    private void JTFRnoSZ(byte wuwgngltv0, byte yklofsg1, long xsojwoohdr2, short deojqhanzq3, char hibeazu4) {
        char hibeazu4a = hibeazu4;
        short deojqhanzq3a = deojqhanzq3;
        long xsojwoohdr2a = xsojwoohdr2;
        byte yklofsg1a = yklofsg1;
        byte wuwgngltv0a = wuwgngltv0;
        new AttributedString("JTFRnoSZ" + yklofsg1a + xsojwoohdr2a + deojqhanzq3a + hibeazu4a + wuwgngltv0a + "JTFRnoSZ" + wNkUVuD + iJgkEej + OEFmiSb + xBPUmEx + iVXpZCB + rAnqpzC + zLeTagD + zUbtehI + BUIVzSI + tduTEWJ + uzkjUEo + iyaUKog + KhrQTTW + LEXfvrY + jzJcDSN + "");
    }

    //垃圾方法
    private void LbUUevOr(short lefcfzaqlr0) {
        short lefcfzaqlr0a = lefcfzaqlr0;
        System.out.println("LbUUevOr" + lefcfzaqlr0a + "LbUUevOr" + tduTEWJ + BUIVzSI + xBPUmEx + zUbtehI + LEXfvrY + iyaUKog + wNkUVuD + zLeTagD + KhrQTTW + OEFmiSb + iJgkEej + rAnqpzC + uzkjUEo + jzJcDSN + iVXpZCB + "");
    }

    //垃圾方法
    private void FgwqfcmM(int pekmvggh0, char qgjbffbis1) {
        char qgjbffbis1a = qgjbffbis1;
        int pekmvggh0a = pekmvggh0;
        new StringBuilder("FgwqfcmM" + qgjbffbis1a + pekmvggh0a + "FgwqfcmM" + iVXpZCB + zLeTagD + uzkjUEo + iyaUKog + tduTEWJ + wNkUVuD + LEXfvrY + KhrQTTW + BUIVzSI + OEFmiSb + zUbtehI + iJgkEej + jzJcDSN + xBPUmEx + rAnqpzC + "");
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        char qgjbffbis1 = 4;
        int pekmvggh0 = 47;
        short lefcfzaqlr0 = 9;
        char hibeazu4 = 8;
        short deojqhanzq3 = 4;
        long xsojwoohdr2 = 85L;
        byte yklofsg1 = 99;
        byte wuwgngltv0 = 5;
        short qkrfglkbf1 = 18;
        char kkgjnuyh0 = 91;
        double bwapozvzxv4 = 84.84;
        long xddrgterk3 = 34L;
        double mjcgflpsb2 = 25.25;
        double mhfcmgqqcj1 = 7.7;
        byte isybxowc0 = 6;
        short fkccjfp1 = 56;
        float ylxjthce0 = 21.21f;
        boolean klgfaffub0 = true;
        byte oiuswzt3 = 67;
        char mclztcvvsr2 = 75;
        byte toxvead1 = 15;
        byte oihquxbmbl0 = 71;
        float yniteley0 = 38.38f;
        short rjhjxhcym0 = 46;
        double rjggzyj0 = 36.36;
        double liferrizic2 = 65.65;
        byte rzzqjjnlzt1 = 95;
        int jkwxxyve0 = 19;
        long haouennwud2 = 40L;
        byte vomngpz1 = 4;
        long rqybjoq0 = 0L;
        byte nyhwckk4 = 80;
        long vwsdynwcc3 = 41L;
        boolean utxfxcijkr2 = false;
        short lvbxttxqpt1 = 74;
        long tcncophymq0 = 41L;
        byte yxxtrcfz3 = 75;
        double jqxinahfm2 = 4.4;
        int cokdstn1 = 83;
        float fogifgef0 = 29.29f;
        short zrejlufwig0 = 38;
        double paxfhawhb4 = 60.60;
        boolean elfcnobz3 = false;
        long gvrjkinwz2 = 86L;
        byte mehlhlqrjp1 = 58;
        long opjkrkvkhm0 = 34L;
        double ikfjfaxp3 = 19.19;
        short bgnptjti2 = 51;
        double hmjtehstxb1 = 96.96;
        boolean aakmgohy0 = true;
        char gouawuvwsq4 = 27;
        boolean bnxwfafsr3 = true;
        double dcpvrig2 = 45.45;
        double nnhcupivkd1 = 46.46;
        byte njrdavts0 = 65;
        char eefjnygp2 = 60;
        boolean iuqcseo1 = true;
        boolean emkfnxiclk0 = true;
        int germblaz3 = 1;
        double lpwddts2 = 50.50;
        int rwbtoofx1 = 65;
        char ntbtursqey0 = 80;
        float rlhgnffjt4 = 72.72f;
        long xuhkcei3 = 34L;
        int gvwqhidztw2 = 70;
        char obdzatvr1 = 18;
        int dpohlyzwej0 = 81;
        double tebfxvip3 = 63.63;
        long lcfafldety2 = 82L;
        long ihmaxwoz1 = 71L;
        short kowqrpj0 = 75;
        byte xlddmfj2 = 42;
        char ltuvykcik1 = 26;
        long itctlin0 = 87L;
        Log.i("xxx", "AAManager initCore");
        mContext = application;
        mainProcessName = packageName;
        isDebug = debug;
        bBvPElaQ(ylxjthce0, fkccjfp1);
        TFAcGuOr(jkwxxyve0, rzzqjjnlzt1, liferrizic2);
        HvtLZTwJ(rqybjoq0, vomngpz1, haouennwud2);
        SRioTgQj(njrdavts0, nnhcupivkd1, dcpvrig2, bnxwfafsr3, gouawuvwsq4);
        bBvPElaQ(ylxjthce0, fkccjfp1);
        JacdtHzU(yniteley0);
        boolean isMainProcess = isMainProcess(application, packageName);
        qbDnZsqU(zrejlufwig0);
        TFAcGuOr(jkwxxyve0, rzzqjjnlzt1, liferrizic2);
        LbUUevOr(lefcfzaqlr0);
        JacdtHzU(yniteley0);
        qJmbuGQJ(ntbtursqey0, rwbtoofx1, lpwddts2, germblaz3);
        yelNmzOA(emkfnxiclk0, iuqcseo1, eefjnygp2);
        vaFgSdwB(kowqrpj0, ihmaxwoz1, lcfafldety2, tebfxvip3);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            RecoverFirebaseEventUtils.INSTANCE.initFirebase(application);
            xijkIxbl(fogifgef0, cokdstn1, jqxinahfm2, yxxtrcfz3);
            TFAcGuOr(jkwxxyve0, rzzqjjnlzt1, liferrizic2);
            bBvPElaQ(ylxjthce0, fkccjfp1);
            vaFgSdwB(kowqrpj0, ihmaxwoz1, lcfafldety2, tebfxvip3);
            KNXLcwwd(opjkrkvkhm0, mehlhlqrjp1, gvrjkinwz2, elfcnobz3, paxfhawhb4);
            RecoverFirebaseCloudManager.initCloud();
            RecoverUserTimer.firstIn();
            RecoverReceiveRegister.startMonitor();
            RecoverUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            XbZytxRP(dpohlyzwej0, obdzatvr1, gvwqhidztw2, xuhkcei3, rlhgnffjt4);
            SRioTgQj(njrdavts0, nnhcupivkd1, dcpvrig2, bnxwfafsr3, gouawuvwsq4);
            qJmbuGQJ(ntbtursqey0, rwbtoofx1, lpwddts2, germblaz3);
            xijkIxbl(fogifgef0, cokdstn1, jqxinahfm2, yxxtrcfz3);
            DenLdVzq(rjhjxhcym0);
            vaFgSdwB(kowqrpj0, ihmaxwoz1, lcfafldety2, tebfxvip3);
            FgwqfcmM(pekmvggh0, qgjbffbis1);
            LbUUevOr(lefcfzaqlr0);
            RecoverJober.buildWorkerRequest(mContext);
            qJmbuGQJ(ntbtursqey0, rwbtoofx1, lpwddts2, germblaz3);
            vtmpOIkC(itctlin0, ltuvykcik1, xlddmfj2);
            zMjqsgNk(aakmgohy0, hmjtehstxb1, bgnptjti2, ikfjfaxp3);
            zMjqsgNk(aakmgohy0, hmjtehstxb1, bgnptjti2, ikfjfaxp3);
            vtmpOIkC(itctlin0, ltuvykcik1, xlddmfj2);
            LbUUevOr(lefcfzaqlr0);
            JacdtHzU(yniteley0);
            DenLdVzq(rjhjxhcym0);
            ZAHlVlte(klgfaffub0);
            RecoverClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void oLNlHdnT(boolean dlywicwy0, boolean vovminkp1, byte iefyygoj2) {
        byte iefyygoj2a = iefyygoj2;
        boolean vovminkp1a = vovminkp1;
        boolean dlywicwy0a = dlywicwy0;
        new StringBuilder("oLNlHdnT" + iefyygoj2a + dlywicwy0a + vovminkp1a + "oLNlHdnT" + "");
    }

    //垃圾方法
    static private void CbIKJzDa(double ohokcfv0, char wyfubtg1) {
        char wyfubtg1a = wyfubtg1;
        double ohokcfv0a = ohokcfv0;
        new String("CbIKJzDa" + wyfubtg1a + ohokcfv0a + "CbIKJzDa" + "");
    }

    //垃圾方法
    static private void fmxWrQJg(float jfjzfakm0, byte wacxjbxccm1, long emmzrvhgar2, boolean clmmmphpd3) {
        boolean clmmmphpd3a = clmmmphpd3;
        long emmzrvhgar2a = emmzrvhgar2;
        byte wacxjbxccm1a = wacxjbxccm1;
        float jfjzfakm0a = jfjzfakm0;
        new AttributedString("fmxWrQJg" + jfjzfakm0a + wacxjbxccm1a + clmmmphpd3a + emmzrvhgar2a + "fmxWrQJg" + "");
    }

    //垃圾方法
    static private void EQJzyghS(int wfvywkz0, float ivmpdvuzk1, long vkgtjhg2, boolean zmlzszqfw3) {
        boolean zmlzszqfw3a = zmlzszqfw3;
        long vkgtjhg2a = vkgtjhg2;
        float ivmpdvuzk1a = ivmpdvuzk1;
        int wfvywkz0a = wfvywkz0;
        new StringBuilder("EQJzyghS" + ivmpdvuzk1a + zmlzszqfw3a + wfvywkz0a + vkgtjhg2a + "EQJzyghS" + "");
    }

    public static void tryUpdateToken() {
        boolean zmlzszqfw3 = true;
        long vkgtjhg2 = 16L;
        float ivmpdvuzk1 = 17.17f;
        int wfvywkz0 = 76;
        boolean clmmmphpd3 = true;
        long emmzrvhgar2 = 10L;
        byte wacxjbxccm1 = 37;
        float jfjzfakm0 = 79.79f;
        char wyfubtg1 = 38;
        double ohokcfv0 = 81.81;
        byte iefyygoj2 = 54;
        boolean vovminkp1 = true;
        boolean dlywicwy0 = true;
        RecoverMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void ANGybjDr(byte wzxaoltrzi0, short skzycyiqn1, int nupepqact2, byte cakbbdwnxs3, int gnfgyfzmx4) {
        int gnfgyfzmx4a = gnfgyfzmx4;
        byte cakbbdwnxs3a = cakbbdwnxs3;
        int nupepqact2a = nupepqact2;
        short skzycyiqn1a = skzycyiqn1;
        byte wzxaoltrzi0a = wzxaoltrzi0;
        new WeakReference("ANGybjDr" + gnfgyfzmx4a + skzycyiqn1a + wzxaoltrzi0a + nupepqact2a + cakbbdwnxs3a + "ANGybjDr" + zLeTagD + rAnqpzC + xBPUmEx + iVXpZCB + zUbtehI + iJgkEej + OEFmiSb + iyaUKog + jzJcDSN + KhrQTTW + LEXfvrY + uzkjUEo + tduTEWJ + wNkUVuD + BUIVzSI + "");
    }

    //垃圾方法
    private void zcCiPbMv(long ktjtqrqo0, float knirrkvao1, long ltbofqy2, char xspfxcupiy3) {
        char xspfxcupiy3a = xspfxcupiy3;
        long ltbofqy2a = ltbofqy2;
        float knirrkvao1a = knirrkvao1;
        long ktjtqrqo0a = ktjtqrqo0;
        new Intent("zcCiPbMv" + knirrkvao1a + ltbofqy2a + ktjtqrqo0a + xspfxcupiy3a + "zcCiPbMv" + xBPUmEx + OEFmiSb + zUbtehI + iJgkEej + zLeTagD + BUIVzSI + uzkjUEo + iyaUKog + LEXfvrY + jzJcDSN + tduTEWJ + rAnqpzC + wNkUVuD + iVXpZCB + KhrQTTW + "");
    }

    //垃圾方法
    private void cejaatvt(byte nelrxxq0, float hpjgflm1, long zqcjktt2, float rowvxvjrh3, boolean dfghirk4) {
        boolean dfghirk4a = dfghirk4;
        float rowvxvjrh3a = rowvxvjrh3;
        long zqcjktt2a = zqcjktt2;
        float hpjgflm1a = hpjgflm1;
        byte nelrxxq0a = nelrxxq0;
        new WeakReference("cejaatvt" + rowvxvjrh3a + dfghirk4a + nelrxxq0a + hpjgflm1a + zqcjktt2a + "cejaatvt" + BUIVzSI + uzkjUEo + LEXfvrY + rAnqpzC + wNkUVuD + zUbtehI + jzJcDSN + iJgkEej + KhrQTTW + tduTEWJ + zLeTagD + iVXpZCB + xBPUmEx + OEFmiSb + iyaUKog + "");
    }

    //垃圾方法
    private void ZsGYsniw(double cemprrla0, int gwbqmkuj1, float nhgtfokscn2, double cxtwdynzq3, char pbhfwxbv4) {
        char pbhfwxbv4a = pbhfwxbv4;
        double cxtwdynzq3a = cxtwdynzq3;
        float nhgtfokscn2a = nhgtfokscn2;
        int gwbqmkuj1a = gwbqmkuj1;
        double cemprrla0a = cemprrla0;
        new StringBuilder("ZsGYsniw" + gwbqmkuj1a + pbhfwxbv4a + nhgtfokscn2a + cemprrla0a + cxtwdynzq3a + "ZsGYsniw" + KhrQTTW + OEFmiSb + xBPUmEx + LEXfvrY + wNkUVuD + uzkjUEo + iJgkEej + iVXpZCB + zLeTagD + rAnqpzC + tduTEWJ + zUbtehI + jzJcDSN + iyaUKog + BUIVzSI + "");
    }

    private final void setCurrentActivity(Activity activity) {
        char pbhfwxbv4 = 68;
        double cxtwdynzq3 = 51.51;
        float nhgtfokscn2 = 28.28f;
        int gwbqmkuj1 = 88;
        double cemprrla0 = 8.8;
        boolean dfghirk4 = true;
        float rowvxvjrh3 = 12.12f;
        long zqcjktt2 = 100L;
        float hpjgflm1 = 99.99f;
        byte nelrxxq0 = 10;
        char xspfxcupiy3 = 71;
        long ltbofqy2 = 12L;
        float knirrkvao1 = 50.50f;
        long ktjtqrqo0 = 54L;
        int gnfgyfzmx4 = 81;
        byte cakbbdwnxs3 = 19;
        int nupepqact2 = 53;
        short skzycyiqn1 = 18;
        byte wzxaoltrzi0 = 96;
        if (activity == null) {
            ANGybjDr(wzxaoltrzi0, skzycyiqn1, nupepqact2, cakbbdwnxs3, gnfgyfzmx4);
            cejaatvt(nelrxxq0, hpjgflm1, zqcjktt2, rowvxvjrh3, dfghirk4);
            cejaatvt(nelrxxq0, hpjgflm1, zqcjktt2, rowvxvjrh3, dfghirk4);
            ANGybjDr(wzxaoltrzi0, skzycyiqn1, nupepqact2, cakbbdwnxs3, gnfgyfzmx4);
            ANGybjDr(wzxaoltrzi0, skzycyiqn1, nupepqact2, cakbbdwnxs3, gnfgyfzmx4);
            cejaatvt(nelrxxq0, hpjgflm1, zqcjktt2, rowvxvjrh3, dfghirk4);
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void KETyUzYt(boolean otrppjbjuc0, boolean citvmfbu1, char juesidxtkr2) {
        char juesidxtkr2a = juesidxtkr2;
        boolean citvmfbu1a = citvmfbu1;
        boolean otrppjbjuc0a = otrppjbjuc0;
        TextUtils.isDigitsOnly("KETyUzYt" + citvmfbu1a + otrppjbjuc0a + juesidxtkr2a + "KETyUzYt" + KhrQTTW + rAnqpzC + zLeTagD + OEFmiSb + LEXfvrY + jzJcDSN + iVXpZCB + zUbtehI + uzkjUEo + wNkUVuD + BUIVzSI + tduTEWJ + iyaUKog + xBPUmEx + iJgkEej + "");
    }

    //垃圾方法
    private void HdwvidSy(int yrvetjh0, boolean uyqoplvbae1, long qqaaduwhey2, long tupfzfgk3) {
        long tupfzfgk3a = tupfzfgk3;
        long qqaaduwhey2a = qqaaduwhey2;
        boolean uyqoplvbae1a = uyqoplvbae1;
        int yrvetjh0a = yrvetjh0;
        new String("HdwvidSy" + yrvetjh0a + uyqoplvbae1a + qqaaduwhey2a + tupfzfgk3a + "HdwvidSy" + rAnqpzC + wNkUVuD + tduTEWJ + iyaUKog + zLeTagD + iJgkEej + zUbtehI + uzkjUEo + BUIVzSI + iVXpZCB + xBPUmEx + OEFmiSb + jzJcDSN + KhrQTTW + LEXfvrY + "");
    }

    //垃圾方法
    private void QhzAlAge(float ekanmkjscc0, int xwigcghld1, int asfahae2, boolean gbxvrbgsgu3) {
        boolean gbxvrbgsgu3a = gbxvrbgsgu3;
        int asfahae2a = asfahae2;
        int xwigcghld1a = xwigcghld1;
        float ekanmkjscc0a = ekanmkjscc0;
        Log.i("QhzAlAge", "QhzAlAge" + asfahae2a + ekanmkjscc0a + xwigcghld1a + gbxvrbgsgu3a + "QhzAlAge" + iVXpZCB + jzJcDSN + LEXfvrY + xBPUmEx + zUbtehI + tduTEWJ + iJgkEej + iyaUKog + BUIVzSI + KhrQTTW + uzkjUEo + rAnqpzC + wNkUVuD + OEFmiSb + zLeTagD + "");
    }

    //垃圾方法
    private void XuSWBvRV(short zibcbrbpm0, short xtjfmhui1, long vtvzrsqrrs2, short qodtqlxzp3, boolean tjqbsydqyp4) {
        boolean tjqbsydqyp4a = tjqbsydqyp4;
        short qodtqlxzp3a = qodtqlxzp3;
        long vtvzrsqrrs2a = vtvzrsqrrs2;
        short xtjfmhui1a = xtjfmhui1;
        short zibcbrbpm0a = zibcbrbpm0;
        new Intent("XuSWBvRV" + vtvzrsqrrs2a + zibcbrbpm0a + xtjfmhui1a + tjqbsydqyp4a + qodtqlxzp3a + "XuSWBvRV" + xBPUmEx + KhrQTTW + BUIVzSI + iyaUKog + LEXfvrY + jzJcDSN + wNkUVuD + iJgkEej + rAnqpzC + zLeTagD + zUbtehI + iVXpZCB + uzkjUEo + OEFmiSb + tduTEWJ + "");
    }

    public final boolean isForeground() {
        boolean tjqbsydqyp4 = false;
        short qodtqlxzp3 = 96;
        long vtvzrsqrrs2 = 65L;
        short xtjfmhui1 = 21;
        short zibcbrbpm0 = 65;
        boolean gbxvrbgsgu3 = true;
        int asfahae2 = 41;
        int xwigcghld1 = 13;
        float ekanmkjscc0 = 40.40f;
        long tupfzfgk3 = 33L;
        long qqaaduwhey2 = 82L;
        boolean uyqoplvbae1 = false;
        int yrvetjh0 = 44;
        char juesidxtkr2 = 70;
        boolean citvmfbu1 = true;
        boolean otrppjbjuc0 = false;
        QhzAlAge(ekanmkjscc0, xwigcghld1, asfahae2, gbxvrbgsgu3);
        XuSWBvRV(zibcbrbpm0, xtjfmhui1, vtvzrsqrrs2, qodtqlxzp3, tjqbsydqyp4);
        XuSWBvRV(zibcbrbpm0, xtjfmhui1, vtvzrsqrrs2, qodtqlxzp3, tjqbsydqyp4);
        XuSWBvRV(zibcbrbpm0, xtjfmhui1, vtvzrsqrrs2, qodtqlxzp3, tjqbsydqyp4);
        KETyUzYt(otrppjbjuc0, citvmfbu1, juesidxtkr2);
        QhzAlAge(ekanmkjscc0, xwigcghld1, asfahae2, gbxvrbgsgu3);
        QhzAlAge(ekanmkjscc0, xwigcghld1, asfahae2, gbxvrbgsgu3);
        QhzAlAge(ekanmkjscc0, xwigcghld1, asfahae2, gbxvrbgsgu3);
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void PuLgRuNF(long pqkcihoyv0, byte qgzyvptja1, char ekorojioe2, boolean zuxhrhllyg3) {
        boolean zuxhrhllyg3a = zuxhrhllyg3;
        char ekorojioe2a = ekorojioe2;
        byte qgzyvptja1a = qgzyvptja1;
        long pqkcihoyv0a = pqkcihoyv0;
        new String("PuLgRuNF" + zuxhrhllyg3a + pqkcihoyv0a + ekorojioe2a + qgzyvptja1a + "PuLgRuNF" + "");
    }

    //垃圾方法
    static private void vJulzgDV(short brmwdjyce0, float dgbqmxb1) {
        float dgbqmxb1a = dgbqmxb1;
        short brmwdjyce0a = brmwdjyce0;
        new File("vJulzgDV" + brmwdjyce0a + dgbqmxb1a + "vJulzgDV" + "");
    }

    //垃圾方法
    static private void fsAJMrPW(byte zsbstyfzge0, char rumcyhoomq1, char bxyuegtpb2) {
        char bxyuegtpb2a = bxyuegtpb2;
        char rumcyhoomq1a = rumcyhoomq1;
        byte zsbstyfzge0a = zsbstyfzge0;
        new String("fsAJMrPW" + rumcyhoomq1a + bxyuegtpb2a + zsbstyfzge0a + "fsAJMrPW" + "");
    }

    //垃圾方法
    static private void JDytPKMb(char jdkxsrm0, float xiwxfjuo1, long digoikpyl2, float oamluqh3, float wmikklceuu4) {
        float wmikklceuu4a = wmikklceuu4;
        float oamluqh3a = oamluqh3;
        long digoikpyl2a = digoikpyl2;
        float xiwxfjuo1a = xiwxfjuo1;
        char jdkxsrm0a = jdkxsrm0;
        new String("JDytPKMb" + digoikpyl2a + jdkxsrm0a + xiwxfjuo1a + oamluqh3a + wmikklceuu4a + "JDytPKMb" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime) {
        float wmikklceuu4 = 3.3f;
        float oamluqh3 = 24.24f;
        long digoikpyl2 = 82L;
        float xiwxfjuo1 = 57.57f;
        char jdkxsrm0 = 26;
        char bxyuegtpb2 = 90;
        char rumcyhoomq1 = 33;
        byte zsbstyfzge0 = 64;
        float dgbqmxb1 = 96.96f;
        short brmwdjyce0 = 16;
        boolean zuxhrhllyg3 = false;
        char ekorojioe2 = 49;
        byte qgzyvptja1 = 45;
        long pqkcihoyv0 = 10L;
        RecoverNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime);
    }

    //垃圾方法
    static private void ihwrryjS(double loetuezpy0) {
        double loetuezpy0a = loetuezpy0;
        new String("ihwrryjS" + loetuezpy0a + "ihwrryjS" + "");
    }

    //垃圾方法
    static private void vsLAkyga(double uorbpclbnr0, char ljwtbkcz1, long crrwzkfyez2, double lthicsfuk3) {
        double lthicsfuk3a = lthicsfuk3;
        long crrwzkfyez2a = crrwzkfyez2;
        char ljwtbkcz1a = ljwtbkcz1;
        double uorbpclbnr0a = uorbpclbnr0;
        new WeakReference("vsLAkyga" + crrwzkfyez2a + ljwtbkcz1a + uorbpclbnr0a + lthicsfuk3a + "vsLAkyga" + "");
    }

    //垃圾方法
    static private void uQNeDJKG(byte cabgkiueot0) {
        byte cabgkiueot0a = cabgkiueot0;
        Log.w("uQNeDJKG", "uQNeDJKG" + cabgkiueot0a + "uQNeDJKG" + "");
    }

    //垃圾方法
    static private void DBBhzkHw(boolean shllgfycqk0) {
        boolean shllgfycqk0a = shllgfycqk0;
    }

    public static void setCount() {
        boolean shllgfycqk0 = true;
        byte cabgkiueot0 = 71;
        double lthicsfuk3 = 66.66;
        long crrwzkfyez2 = 89L;
        char ljwtbkcz1 = 88;
        double uorbpclbnr0 = 57.57;
        double loetuezpy0 = 84.84;
        RecoverNtCountUtil.setCount();
    }

    //垃圾方法
    private void bgEeIBMj(double irsvwxfv0, short wliozztkk1, boolean zsaiebistc2, long ypkbbzjddy3) {
        long ypkbbzjddy3a = ypkbbzjddy3;
        boolean zsaiebistc2a = zsaiebistc2;
        short wliozztkk1a = wliozztkk1;
        double irsvwxfv0a = irsvwxfv0;
        System.out.println("bgEeIBMj" + zsaiebistc2a + wliozztkk1a + ypkbbzjddy3a + irsvwxfv0a + "bgEeIBMj" + jzJcDSN + rAnqpzC + zLeTagD + iVXpZCB + zUbtehI + tduTEWJ + uzkjUEo + LEXfvrY + KhrQTTW + BUIVzSI + iJgkEej + iyaUKog + wNkUVuD + xBPUmEx + OEFmiSb + "");
    }

    //垃圾方法
    private void KVzSbYzF(char djbayot0, int psszvcr1) {
        int psszvcr1a = psszvcr1;
        char djbayot0a = djbayot0;
        Log.e("KVzSbYzF", "KVzSbYzF" + psszvcr1a + djbayot0a + "KVzSbYzF" + OEFmiSb + zLeTagD + iJgkEej + LEXfvrY + KhrQTTW + rAnqpzC + iyaUKog + jzJcDSN + uzkjUEo + tduTEWJ + wNkUVuD + iVXpZCB + zUbtehI + xBPUmEx + BUIVzSI + "");
    }

    //垃圾方法
    private void RIbIfEhF(float ftfqtfxgar0, double zfpjgskql1, short pnsbpsc2) {
        short pnsbpsc2a = pnsbpsc2;
        double zfpjgskql1a = zfpjgskql1;
        float ftfqtfxgar0a = ftfqtfxgar0;
        System.out.println("RIbIfEhF" + zfpjgskql1a + pnsbpsc2a + ftfqtfxgar0a + "RIbIfEhF" + tduTEWJ + iyaUKog + iJgkEej + LEXfvrY + BUIVzSI + zUbtehI + wNkUVuD + iVXpZCB + rAnqpzC + KhrQTTW + zLeTagD + OEFmiSb + uzkjUEo + jzJcDSN + xBPUmEx + "");
    }

    //垃圾方法
    private void HZHVFRSH(int ljothsztwv0, char ptqsqnmqgg1, char muoyxzc2, double pajlfhv3, int hyywbafwc4) {
        int hyywbafwc4a = hyywbafwc4;
        double pajlfhv3a = pajlfhv3;
        char muoyxzc2a = muoyxzc2;
        char ptqsqnmqgg1a = ptqsqnmqgg1;
        int ljothsztwv0a = ljothsztwv0;
        new WeakReference("HZHVFRSH" + ljothsztwv0a + ptqsqnmqgg1a + pajlfhv3a + muoyxzc2a + hyywbafwc4a + "HZHVFRSH" + KhrQTTW + OEFmiSb + wNkUVuD + rAnqpzC + iyaUKog + xBPUmEx + uzkjUEo + iJgkEej + zLeTagD + tduTEWJ + BUIVzSI + iVXpZCB + jzJcDSN + LEXfvrY + zUbtehI + "");
    }

    public final boolean hasCreatingActivity() {
        int hyywbafwc4 = 15;
        double pajlfhv3 = 68.68;
        char muoyxzc2 = 92;
        char ptqsqnmqgg1 = 19;
        int ljothsztwv0 = 70;
        short pnsbpsc2 = 61;
        double zfpjgskql1 = 84.84;
        float ftfqtfxgar0 = 19.19f;
        int psszvcr1 = 14;
        char djbayot0 = 76;
        long ypkbbzjddy3 = 99L;
        boolean zsaiebistc2 = false;
        short wliozztkk1 = 28;
        double irsvwxfv0 = 25.25;
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void VoNtpERq(short tutvszsgdi0, float jnvwapau1, int pzipgfwwd2) {
        int pzipgfwwd2a = pzipgfwwd2;
        float jnvwapau1a = jnvwapau1;
        short tutvszsgdi0a = tutvszsgdi0;
        new StringReader("VoNtpERq" + jnvwapau1a + pzipgfwwd2a + tutvszsgdi0a + "VoNtpERq" + LEXfvrY + OEFmiSb + zUbtehI + uzkjUEo + KhrQTTW + zLeTagD + iyaUKog + iVXpZCB + wNkUVuD + rAnqpzC + tduTEWJ + BUIVzSI + jzJcDSN + xBPUmEx + iJgkEej + "");
    }

    //垃圾方法
    private void itMyzlAh(int snrxltneg0, double xsetoyq1, float fbcvdlstq2) {
        float fbcvdlstq2a = fbcvdlstq2;
        double xsetoyq1a = xsetoyq1;
        int snrxltneg0a = snrxltneg0;
        Log.i("itMyzlAh", "itMyzlAh" + fbcvdlstq2a + snrxltneg0a + xsetoyq1a + "itMyzlAh" + iVXpZCB + rAnqpzC + OEFmiSb + tduTEWJ + iyaUKog + uzkjUEo + KhrQTTW + BUIVzSI + zLeTagD + jzJcDSN + iJgkEej + wNkUVuD + xBPUmEx + zUbtehI + LEXfvrY + "");
    }

    //垃圾方法
    private void LztEeMmp(byte ujrlxhux0, boolean fpihyhbf1) {
        boolean fpihyhbf1a = fpihyhbf1;
        byte ujrlxhux0a = ujrlxhux0;
        Log.e("LztEeMmp", "LztEeMmp" + fpihyhbf1a + ujrlxhux0a + "LztEeMmp" + uzkjUEo + iJgkEej + KhrQTTW + iyaUKog + wNkUVuD + zUbtehI + BUIVzSI + zLeTagD + rAnqpzC + xBPUmEx + LEXfvrY + jzJcDSN + OEFmiSb + tduTEWJ + iVXpZCB + "");
    }

    //垃圾方法
    private void RfllMzRp(byte ykbotzku0, float aprkyzr1, int mdhhwkduvw2, char xtrrqirkyl3) {
        char xtrrqirkyl3a = xtrrqirkyl3;
        int mdhhwkduvw2a = mdhhwkduvw2;
        float aprkyzr1a = aprkyzr1;
        byte ykbotzku0a = ykbotzku0;
        TextUtils.isEmpty("RfllMzRp" + aprkyzr1a + ykbotzku0a + xtrrqirkyl3a + mdhhwkduvw2a + "RfllMzRp" + wNkUVuD + jzJcDSN + tduTEWJ + zLeTagD + iVXpZCB + BUIVzSI + KhrQTTW + OEFmiSb + uzkjUEo + iJgkEej + rAnqpzC + zUbtehI + LEXfvrY + iyaUKog + xBPUmEx + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        char xtrrqirkyl3 = 55;
        int mdhhwkduvw2 = 57;
        float aprkyzr1 = 31.31f;
        byte ykbotzku0 = 49;
        boolean fpihyhbf1 = false;
        byte ujrlxhux0 = 62;
        float fbcvdlstq2 = 3.3f;
        double xsetoyq1 = 3.3;
        int snrxltneg0 = 83;
        int pzipgfwwd2 = 4;
        float jnvwapau1 = 25.25f;
        short tutvszsgdi0 = 100;
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void vkjPWGuR(char igigftbmq0, short imiawqic1, long wlwvhkljk2, float okbkxltsu3) {
        float okbkxltsu3a = okbkxltsu3;
        long wlwvhkljk2a = wlwvhkljk2;
        short imiawqic1a = imiawqic1;
        char igigftbmq0a = igigftbmq0;
        System.out.println("vkjPWGuR" + igigftbmq0a + wlwvhkljk2a + okbkxltsu3a + imiawqic1a + "vkjPWGuR" + "");
    }

    //垃圾方法
    static private void wNslsuXO(byte dtnblndza0, double vliqyhi1, byte ievbpee2, char gqjjvzr3) {
        char gqjjvzr3a = gqjjvzr3;
        byte ievbpee2a = ievbpee2;
        double vliqyhi1a = vliqyhi1;
        byte dtnblndza0a = dtnblndza0;
        System.out.println("wNslsuXO" + dtnblndza0a + gqjjvzr3a + ievbpee2a + vliqyhi1a + "wNslsuXO" + "");
    }

    //垃圾方法
    static private void EqXVbrlQ(char gfwqlsr0, boolean tiqmrbivf1, boolean cvlvamfeet2) {
        boolean cvlvamfeet2a = cvlvamfeet2;
        boolean tiqmrbivf1a = tiqmrbivf1;
        char gfwqlsr0a = gfwqlsr0;
        new Intent("EqXVbrlQ" + cvlvamfeet2a + tiqmrbivf1a + gfwqlsr0a + "EqXVbrlQ" + "");
    }

    //垃圾方法
    static private void cvfunjil(float gjrntvcifa0, double qzvsvbghum1, boolean ewzxuofpq2, short osxywjoja3, int hfkbxxzp4) {
        int hfkbxxzp4a = hfkbxxzp4;
        short osxywjoja3a = osxywjoja3;
        boolean ewzxuofpq2a = ewzxuofpq2;
        double qzvsvbghum1a = qzvsvbghum1;
        float gjrntvcifa0a = gjrntvcifa0;
        System.out.println("cvfunjil" + qzvsvbghum1a + osxywjoja3a + hfkbxxzp4a + ewzxuofpq2a + gjrntvcifa0a + "cvfunjil" + "");
    }

    //垃圾方法
    static private void vBAnfSfc(char kdvoosxpgf0, char pljhtsv1) {
        char pljhtsv1a = pljhtsv1;
        char kdvoosxpgf0a = kdvoosxpgf0;
        new WeakReference("vBAnfSfc" + kdvoosxpgf0a + pljhtsv1a + "vBAnfSfc" + "");
    }

    //垃圾方法
    static private void MWEXNyna(byte ojwtnxn0, double geozyvib1, boolean rompujxvox2, float xgoglynuxh3) {
        float xgoglynuxh3a = xgoglynuxh3;
        boolean rompujxvox2a = rompujxvox2;
        double geozyvib1a = geozyvib1;
        byte ojwtnxn0a = ojwtnxn0;
        Log.w("MWEXNyna", "MWEXNyna" + rompujxvox2a + ojwtnxn0a + geozyvib1a + xgoglynuxh3a + "MWEXNyna" + "");
    }

    //垃圾方法
    static private void QnqjgBIL(float xotsnye0, long aqzjvulg1, int jwwvbnozm2, boolean sgcyexigc3, long fvdbsxw4) {
        long fvdbsxw4a = fvdbsxw4;
        boolean sgcyexigc3a = sgcyexigc3;
        int jwwvbnozm2a = jwwvbnozm2;
        long aqzjvulg1a = aqzjvulg1;
        float xotsnye0a = xotsnye0;
    }

    //垃圾方法
    static private void lBNwIbWz(short jvwhworxfb0, double ltawtplrmt1) {
        double ltawtplrmt1a = ltawtplrmt1;
        short jvwhworxfb0a = jvwhworxfb0;
        new File("lBNwIbWz" + jvwhworxfb0a + ltawtplrmt1a + "lBNwIbWz" + "");
    }

    //垃圾方法
    static private void AbosvOwZ(boolean tqoxkvz0, char ldaagymc1, short lanmrguttl2) {
        short lanmrguttl2a = lanmrguttl2;
        char ldaagymc1a = ldaagymc1;
        boolean tqoxkvz0a = tqoxkvz0;
        new File("AbosvOwZ" + ldaagymc1a + lanmrguttl2a + tqoxkvz0a + "AbosvOwZ" + "");
    }

    //垃圾方法
    static private void ibpepiRn(long sqczefe0) {
        long sqczefe0a = sqczefe0;
        System.out.println("ibpepiRn" + sqczefe0a + "ibpepiRn" + "");
    }

    //垃圾方法
    static private void KIVozvSs(boolean kyvzolsb0, int tykentaaod1, boolean yehojassck2, short gosmjuqxm3) {
        short gosmjuqxm3a = gosmjuqxm3;
        boolean yehojassck2a = yehojassck2;
        int tykentaaod1a = tykentaaod1;
        boolean kyvzolsb0a = kyvzolsb0;
    }

    //垃圾方法
    static private void gHPLbVmQ(int tlkalwt0, double wxpwzlacqg1, byte gdcmmfdihs2) {
        byte gdcmmfdihs2a = gdcmmfdihs2;
        double wxpwzlacqg1a = wxpwzlacqg1;
        int tlkalwt0a = tlkalwt0;
        new Intent("gHPLbVmQ" + wxpwzlacqg1a + tlkalwt0a + gdcmmfdihs2a + "gHPLbVmQ" + "");
    }

    public static void saveLastPushTime() {
        byte gdcmmfdihs2 = 83;
        double wxpwzlacqg1 = 48.48;
        int tlkalwt0 = 11;
        short gosmjuqxm3 = 91;
        boolean yehojassck2 = true;
        int tykentaaod1 = 35;
        boolean kyvzolsb0 = true;
        long sqczefe0 = 80L;
        short lanmrguttl2 = 78;
        char ldaagymc1 = 76;
        boolean tqoxkvz0 = true;
        double ltawtplrmt1 = 83.83;
        short jvwhworxfb0 = 26;
        long fvdbsxw4 = 35L;
        boolean sgcyexigc3 = false;
        int jwwvbnozm2 = 84;
        long aqzjvulg1 = 60L;
        float xotsnye0 = 45.45f;
        float xgoglynuxh3 = 19.19f;
        boolean rompujxvox2 = false;
        double geozyvib1 = 10.10;
        byte ojwtnxn0 = 60;
        char pljhtsv1 = 62;
        char kdvoosxpgf0 = 1;
        int hfkbxxzp4 = 85;
        short osxywjoja3 = 19;
        boolean ewzxuofpq2 = false;
        double qzvsvbghum1 = 21.21;
        float gjrntvcifa0 = 35.35f;
        boolean cvlvamfeet2 = false;
        boolean tiqmrbivf1 = false;
        char gfwqlsr0 = 61;
        char gqjjvzr3 = 79;
        byte ievbpee2 = 45;
        double vliqyhi1 = 64.64;
        byte dtnblndza0 = 49;
        float okbkxltsu3 = 6.6f;
        long wlwvhkljk2 = 84L;
        short imiawqic1 = 91;
        char igigftbmq0 = 61;
        wNslsuXO(dtnblndza0, vliqyhi1, ievbpee2, gqjjvzr3);
        AbosvOwZ(tqoxkvz0, ldaagymc1, lanmrguttl2);
        QnqjgBIL(xotsnye0, aqzjvulg1, jwwvbnozm2, sgcyexigc3, fvdbsxw4);
        KIVozvSs(kyvzolsb0, tykentaaod1, yehojassck2, gosmjuqxm3);
        gHPLbVmQ(tlkalwt0, wxpwzlacqg1, gdcmmfdihs2);
        QnqjgBIL(xotsnye0, aqzjvulg1, jwwvbnozm2, sgcyexigc3, fvdbsxw4);
        AbosvOwZ(tqoxkvz0, ldaagymc1, lanmrguttl2);
        lBNwIbWz(jvwhworxfb0, ltawtplrmt1);
        wNslsuXO(dtnblndza0, vliqyhi1, ievbpee2, gqjjvzr3);
        long lastTime = RecoverSPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && RecoverUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            QnqjgBIL(xotsnye0, aqzjvulg1, jwwvbnozm2, sgcyexigc3, fvdbsxw4);
            cvfunjil(gjrntvcifa0, qzvsvbghum1, ewzxuofpq2, osxywjoja3, hfkbxxzp4);
            KIVozvSs(kyvzolsb0, tykentaaod1, yehojassck2, gosmjuqxm3);
            ibpepiRn(sqczefe0);
            int pushCount = RecoverSPUtils.getInt("last_show_scene_time_count", 0);
            gHPLbVmQ(tlkalwt0, wxpwzlacqg1, gdcmmfdihs2);
            QnqjgBIL(xotsnye0, aqzjvulg1, jwwvbnozm2, sgcyexigc3, fvdbsxw4);
            wNslsuXO(dtnblndza0, vliqyhi1, ievbpee2, gqjjvzr3);
            cvfunjil(gjrntvcifa0, qzvsvbghum1, ewzxuofpq2, osxywjoja3, hfkbxxzp4);
            EqXVbrlQ(gfwqlsr0, tiqmrbivf1, cvlvamfeet2);
            RecoverSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            RecoverSPUtils.putInt("last_show_scene_time_count", 1);
        }
        MWEXNyna(ojwtnxn0, geozyvib1, rompujxvox2, xgoglynuxh3);
        ibpepiRn(sqczefe0);
        gHPLbVmQ(tlkalwt0, wxpwzlacqg1, gdcmmfdihs2);
        KIVozvSs(kyvzolsb0, tykentaaod1, yehojassck2, gosmjuqxm3);
        cvfunjil(gjrntvcifa0, qzvsvbghum1, ewzxuofpq2, osxywjoja3, hfkbxxzp4);
        ibpepiRn(sqczefe0);
        RecoverSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void EOfdaGqs(short rfhowvnrid0, float tiifgqifah1, short nzkjpmyfxk2, long xlnegja3) {
        long xlnegja3a = xlnegja3;
        short nzkjpmyfxk2a = nzkjpmyfxk2;
        float tiifgqifah1a = tiifgqifah1;
        short rfhowvnrid0a = rfhowvnrid0;
        new AttributedString("EOfdaGqs" + tiifgqifah1a + xlnegja3a + rfhowvnrid0a + nzkjpmyfxk2a + "EOfdaGqs" + "");
    }

    //垃圾方法
    static private void lHVXYANb(byte sucutwsex0, double spanqwps1, long kenuarg2, float sbjnnrx3, char swuxpze4) {
        char swuxpze4a = swuxpze4;
        float sbjnnrx3a = sbjnnrx3;
        long kenuarg2a = kenuarg2;
        double spanqwps1a = spanqwps1;
        byte sucutwsex0a = sucutwsex0;
        System.out.println("lHVXYANb" + swuxpze4a + kenuarg2a + sbjnnrx3a + spanqwps1a + sucutwsex0a + "lHVXYANb" + "");
    }

    //垃圾方法
    static private void WmowwveU(boolean czecfvklow0, char anizqsfi1) {
        char anizqsfi1a = anizqsfi1;
        boolean czecfvklow0a = czecfvklow0;
        TextUtils.isDigitsOnly("WmowwveU" + czecfvklow0a + anizqsfi1a + "WmowwveU" + "");
    }

    //垃圾方法
    static private void fMEjfJjm(double bqsyngu0, byte mxkzpcbsx1, char mxmspoijr2) {
        char mxmspoijr2a = mxmspoijr2;
        byte mxkzpcbsx1a = mxkzpcbsx1;
        double bqsyngu0a = bqsyngu0;
        TextUtils.isEmpty("fMEjfJjm" + mxmspoijr2a + mxkzpcbsx1a + bqsyngu0a + "fMEjfJjm" + "");
    }

    public static long getLastShowPushTime() {
        char mxmspoijr2 = 90;
        byte mxkzpcbsx1 = 87;
        double bqsyngu0 = 50.50;
        char anizqsfi1 = 62;
        boolean czecfvklow0 = true;
        char swuxpze4 = 11;
        float sbjnnrx3 = 97.97f;
        long kenuarg2 = 100L;
        double spanqwps1 = 34.34;
        byte sucutwsex0 = 72;
        long xlnegja3 = 94L;
        short nzkjpmyfxk2 = 32;
        float tiifgqifah1 = 5.5f;
        short rfhowvnrid0 = 32;
        WmowwveU(czecfvklow0, anizqsfi1);
        EOfdaGqs(rfhowvnrid0, tiifgqifah1, nzkjpmyfxk2, xlnegja3);
        lHVXYANb(sucutwsex0, spanqwps1, kenuarg2, sbjnnrx3, swuxpze4);
        return RecoverSPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void POvJLpOo(float oxnsrkz0, byte ufpvjmxms1, char wugfuyk2, char uvaboqkqoe3, short znhmaesa4) {
        short znhmaesa4a = znhmaesa4;
        char uvaboqkqoe3a = uvaboqkqoe3;
        char wugfuyk2a = wugfuyk2;
        byte ufpvjmxms1a = ufpvjmxms1;
        float oxnsrkz0a = oxnsrkz0;
        new StringBuilder("POvJLpOo" + ufpvjmxms1a + wugfuyk2a + uvaboqkqoe3a + oxnsrkz0a + znhmaesa4a + "POvJLpOo" + jzJcDSN + iVXpZCB + wNkUVuD + uzkjUEo + KhrQTTW + iJgkEej + OEFmiSb + rAnqpzC + zUbtehI + zLeTagD + iyaUKog + tduTEWJ + BUIVzSI + xBPUmEx + LEXfvrY + "");
    }

    //垃圾方法
    private void CeCyIKUZ(int pxwnhncts0, float jybxyiri1) {
        float jybxyiri1a = jybxyiri1;
        int pxwnhncts0a = pxwnhncts0;
        TextUtils.isEmpty("CeCyIKUZ" + jybxyiri1a + pxwnhncts0a + "CeCyIKUZ" + LEXfvrY + KhrQTTW + OEFmiSb + wNkUVuD + iJgkEej + iyaUKog + xBPUmEx + zLeTagD + uzkjUEo + BUIVzSI + rAnqpzC + jzJcDSN + zUbtehI + tduTEWJ + iVXpZCB + "");
    }

    //垃圾方法
    private void EaBFbKjU(float txniudja0, short payzcoq1) {
        short payzcoq1a = payzcoq1;
        float txniudja0a = txniudja0;
        TextUtils.isDigitsOnly("EaBFbKjU" + payzcoq1a + txniudja0a + "EaBFbKjU" + jzJcDSN + zLeTagD + zUbtehI + BUIVzSI + OEFmiSb + iVXpZCB + rAnqpzC + xBPUmEx + LEXfvrY + KhrQTTW + iJgkEej + iyaUKog + wNkUVuD + uzkjUEo + tduTEWJ + "");
    }

    //垃圾方法
    private void yzeSOdKH(long mkaebkuc0, double vutuuph1) {
        double vutuuph1a = vutuuph1;
        long mkaebkuc0a = mkaebkuc0;
        new Thread("yzeSOdKH" + vutuuph1a + mkaebkuc0a + "yzeSOdKH" + tduTEWJ + OEFmiSb + iJgkEej + rAnqpzC + iVXpZCB + uzkjUEo + LEXfvrY + KhrQTTW + zUbtehI + iyaUKog + zLeTagD + xBPUmEx + wNkUVuD + jzJcDSN + BUIVzSI + "");
    }

    @Nullable
    public final Activity getCurrActivity() {
        double vutuuph1 = 74.74;
        long mkaebkuc0 = 44L;
        short payzcoq1 = 85;
        float txniudja0 = 61.61f;
        float jybxyiri1 = 6.6f;
        int pxwnhncts0 = 49;
        short znhmaesa4 = 24;
        char uvaboqkqoe3 = 36;
        char wugfuyk2 = 14;
        byte ufpvjmxms1 = 94;
        float oxnsrkz0 = 54.54f;
        yzeSOdKH(mkaebkuc0, vutuuph1);
        CeCyIKUZ(pxwnhncts0, jybxyiri1);
        CeCyIKUZ(pxwnhncts0, jybxyiri1);
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void GKyTqZhi(byte bwmwtubts0, int vnfzmnr1, int ablmthen2) {
        int ablmthen2a = ablmthen2;
        int vnfzmnr1a = vnfzmnr1;
        byte bwmwtubts0a = bwmwtubts0;
        TextUtils.isDigitsOnly("GKyTqZhi" + vnfzmnr1a + bwmwtubts0a + ablmthen2a + "GKyTqZhi" + rAnqpzC + uzkjUEo + BUIVzSI + iJgkEej + iVXpZCB + iyaUKog + jzJcDSN + LEXfvrY + zUbtehI + OEFmiSb + zLeTagD + KhrQTTW + tduTEWJ + xBPUmEx + wNkUVuD + "");
    }

    //垃圾方法
    private void kvFQlsrg(double igmyumvci0) {
        double igmyumvci0a = igmyumvci0;
        new AttributedString("kvFQlsrg" + igmyumvci0a + "kvFQlsrg" + KhrQTTW + rAnqpzC + LEXfvrY + iJgkEej + iVXpZCB + jzJcDSN + uzkjUEo + OEFmiSb + wNkUVuD + tduTEWJ + BUIVzSI + zUbtehI + zLeTagD + xBPUmEx + iyaUKog + "");
    }

    //垃圾方法
    private void zSPyOfha(byte vcskiean0, double hylwjygsu1, int udhdssoe2, char nxevnxj3) {
        char nxevnxj3a = nxevnxj3;
        int udhdssoe2a = udhdssoe2;
        double hylwjygsu1a = hylwjygsu1;
        byte vcskiean0a = vcskiean0;
        new AttributedString("zSPyOfha" + hylwjygsu1a + nxevnxj3a + vcskiean0a + udhdssoe2a + "zSPyOfha" + OEFmiSb + jzJcDSN + KhrQTTW + rAnqpzC + xBPUmEx + zLeTagD + zUbtehI + wNkUVuD + tduTEWJ + iVXpZCB + uzkjUEo + iJgkEej + LEXfvrY + iyaUKog + BUIVzSI + "");
    }

    //垃圾方法
    private void vkhIwsZB(int gbgijurx0, char yvpmzswj1, float cxegugs2, boolean kawtnrqgve3) {
        boolean kawtnrqgve3a = kawtnrqgve3;
        float cxegugs2a = cxegugs2;
        char yvpmzswj1a = yvpmzswj1;
        int gbgijurx0a = gbgijurx0;
        TextUtils.isEmpty("vkhIwsZB" + kawtnrqgve3a + cxegugs2a + yvpmzswj1a + gbgijurx0a + "vkhIwsZB" + LEXfvrY + KhrQTTW + zUbtehI + rAnqpzC + iJgkEej + uzkjUEo + iVXpZCB + jzJcDSN + tduTEWJ + zLeTagD + xBPUmEx + BUIVzSI + iyaUKog + OEFmiSb + wNkUVuD + "");
    }

    //垃圾方法
    private void IFHuVUIl(long aqcqhsi0) {
        long aqcqhsi0a = aqcqhsi0;
        TextUtils.isDigitsOnly("IFHuVUIl" + aqcqhsi0a + "IFHuVUIl" + iyaUKog + iVXpZCB + jzJcDSN + rAnqpzC + KhrQTTW + wNkUVuD + tduTEWJ + zLeTagD + uzkjUEo + zUbtehI + xBPUmEx + BUIVzSI + OEFmiSb + LEXfvrY + iJgkEej + "");
    }

    //垃圾方法
    private void iAdhayDR(int erqjaxjsyp0, int eteeuhgxsz1, char ancjnrly2, char rkmyjdh3) {
        char rkmyjdh3a = rkmyjdh3;
        char ancjnrly2a = ancjnrly2;
        int eteeuhgxsz1a = eteeuhgxsz1;
        int erqjaxjsyp0a = erqjaxjsyp0;
        new StringReader("iAdhayDR" + eteeuhgxsz1a + erqjaxjsyp0a + rkmyjdh3a + ancjnrly2a + "iAdhayDR" + wNkUVuD + iVXpZCB + xBPUmEx + zLeTagD + jzJcDSN + zUbtehI + LEXfvrY + OEFmiSb + rAnqpzC + BUIVzSI + iJgkEej + KhrQTTW + tduTEWJ + iyaUKog + uzkjUEo + "");
    }

    //垃圾方法
    private void iWnEhmrM(boolean siemlalfkz0, double xbtzjpox1, byte efquzgh2, byte dffusyy3) {
        byte dffusyy3a = dffusyy3;
        byte efquzgh2a = efquzgh2;
        double xbtzjpox1a = xbtzjpox1;
        boolean siemlalfkz0a = siemlalfkz0;
        new Intent("iWnEhmrM" + efquzgh2a + xbtzjpox1a + siemlalfkz0a + dffusyy3a + "iWnEhmrM" + zLeTagD + KhrQTTW + OEFmiSb + iVXpZCB + BUIVzSI + uzkjUEo + jzJcDSN + iJgkEej + xBPUmEx + tduTEWJ + iyaUKog + wNkUVuD + rAnqpzC + LEXfvrY + zUbtehI + "");
    }

    //垃圾方法
    private void jjoCgoxx(boolean xaduublyl0, long alnrufmrei1) {
        long alnrufmrei1a = alnrufmrei1;
        boolean xaduublyl0a = xaduublyl0;
        Log.w("jjoCgoxx", "jjoCgoxx" + xaduublyl0a + alnrufmrei1a + "jjoCgoxx" + zLeTagD + iVXpZCB + BUIVzSI + tduTEWJ + rAnqpzC + jzJcDSN + iJgkEej + KhrQTTW + zUbtehI + iyaUKog + xBPUmEx + LEXfvrY + uzkjUEo + OEFmiSb + wNkUVuD + "");
    }

    public final void killAllActivity() {
        long alnrufmrei1 = 3L;
        boolean xaduublyl0 = true;
        byte dffusyy3 = 58;
        byte efquzgh2 = 53;
        double xbtzjpox1 = 18.18;
        boolean siemlalfkz0 = true;
        char rkmyjdh3 = 17;
        char ancjnrly2 = 72;
        int eteeuhgxsz1 = 98;
        int erqjaxjsyp0 = 98;
        long aqcqhsi0 = 98L;
        boolean kawtnrqgve3 = true;
        float cxegugs2 = 75.75f;
        char yvpmzswj1 = 21;
        int gbgijurx0 = 14;
        char nxevnxj3 = 37;
        int udhdssoe2 = 69;
        double hylwjygsu1 = 69.69;
        byte vcskiean0 = 1;
        double igmyumvci0 = 33.33;
        int ablmthen2 = 68;
        int vnfzmnr1 = 76;
        byte bwmwtubts0 = 64;
        kvFQlsrg(igmyumvci0);
        jjoCgoxx(xaduublyl0, alnrufmrei1);
        zSPyOfha(vcskiean0, hylwjygsu1, udhdssoe2, nxevnxj3);
        Iterator<Activity> var3 = livingActivities.iterator();
        IFHuVUIl(aqcqhsi0);
        iAdhayDR(erqjaxjsyp0, eteeuhgxsz1, ancjnrly2, rkmyjdh3);
        iAdhayDR(erqjaxjsyp0, eteeuhgxsz1, ancjnrly2, rkmyjdh3);
        IFHuVUIl(aqcqhsi0);
        IFHuVUIl(aqcqhsi0);
        kvFQlsrg(igmyumvci0);
        iWnEhmrM(siemlalfkz0, xbtzjpox1, efquzgh2, dffusyy3);
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private RecoverOrgManager() {
    }

    //垃圾方法
    static private void AJSbowvG(int zmgqkdsf0, byte vpwyjpib1) {
        byte vpwyjpib1a = vpwyjpib1;
        int zmgqkdsf0a = zmgqkdsf0;
        new File("AJSbowvG" + zmgqkdsf0a + vpwyjpib1a + "AJSbowvG" + "");
    }

    //垃圾方法
    static private void vgEwbJkJ(int plbjtxo0, float zsfcxrt1, float koqytwtg2, long kfjvyqfnq3) {
        long kfjvyqfnq3a = kfjvyqfnq3;
        float koqytwtg2a = koqytwtg2;
        float zsfcxrt1a = zsfcxrt1;
        int plbjtxo0a = plbjtxo0;
        TextUtils.isEmpty("vgEwbJkJ" + zsfcxrt1a + plbjtxo0a + kfjvyqfnq3a + koqytwtg2a + "vgEwbJkJ" + "");
    }

    //垃圾方法
    static private void eGmaDIzs(long iwtlkzry0, double qtdmucknny1, short vprgfayto2) {
        short vprgfayto2a = vprgfayto2;
        double qtdmucknny1a = qtdmucknny1;
        long iwtlkzry0a = iwtlkzry0;
        new AttributedString("eGmaDIzs" + vprgfayto2a + iwtlkzry0a + qtdmucknny1a + "eGmaDIzs" + "");
    }

    //垃圾方法
    static private void jXbEVUbO(float esyhenjqum0, byte foznknrb1, long lecxalb2, boolean bwudjvsrt3) {
        boolean bwudjvsrt3a = bwudjvsrt3;
        long lecxalb2a = lecxalb2;
        byte foznknrb1a = foznknrb1;
        float esyhenjqum0a = esyhenjqum0;
        new WeakReference("jXbEVUbO" + lecxalb2a + bwudjvsrt3a + foznknrb1a + esyhenjqum0a + "jXbEVUbO" + "");
    }

    public static boolean isNotificationEnabled() {
        boolean bwudjvsrt3 = true;
        long lecxalb2 = 32L;
        byte foznknrb1 = 74;
        float esyhenjqum0 = 66.66f;
        short vprgfayto2 = 55;
        double qtdmucknny1 = 28.28;
        long iwtlkzry0 = 17L;
        long kfjvyqfnq3 = 55L;
        float koqytwtg2 = 24.24f;
        float zsfcxrt1 = 23.23f;
        int plbjtxo0 = 21;
        byte vpwyjpib1 = 10;
        int zmgqkdsf0 = 1;
        AJSbowvG(zmgqkdsf0, vpwyjpib1);
        AJSbowvG(zmgqkdsf0, vpwyjpib1);
        jXbEVUbO(esyhenjqum0, foznknrb1, lecxalb2, bwudjvsrt3);
        vgEwbJkJ(plbjtxo0, zsfcxrt1, koqytwtg2, kfjvyqfnq3);
        return RecoverNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void PSjVicyq(char avpzvrxjmw0) {
        char avpzvrxjmw0a = avpzvrxjmw0;
        Log.e("PSjVicyq", "PSjVicyq" + avpzvrxjmw0a + "PSjVicyq" + "");
    }

    //垃圾方法
    static private void uDHfBzJH(boolean qagbjdl0, short tzhmvfuljl1, byte lbwerpbg2, byte mbytebkg3, short hgqlotiiha4) {
        short hgqlotiiha4a = hgqlotiiha4;
        byte mbytebkg3a = mbytebkg3;
        byte lbwerpbg2a = lbwerpbg2;
        short tzhmvfuljl1a = tzhmvfuljl1;
        boolean qagbjdl0a = qagbjdl0;
        System.out.println("uDHfBzJH" + mbytebkg3a + qagbjdl0a + tzhmvfuljl1a + lbwerpbg2a + hgqlotiiha4a + "uDHfBzJH" + "");
    }

    //垃圾方法
    static private void ubuUoceB(char xuyszvyowu0, short trwkopw1, float fncjbhnx2) {
        float fncjbhnx2a = fncjbhnx2;
        short trwkopw1a = trwkopw1;
        char xuyszvyowu0a = xuyszvyowu0;
        TextUtils.isEmpty("ubuUoceB" + xuyszvyowu0a + fncjbhnx2a + trwkopw1a + "ubuUoceB" + "");
    }

    //垃圾方法
    static private void JJivjzpm(float qaldekb0, float miblrbmbpj1, boolean cycnnqlj2, float gejfjxn3, boolean rlmqjlod4) {
        boolean rlmqjlod4a = rlmqjlod4;
        float gejfjxn3a = gejfjxn3;
        boolean cycnnqlj2a = cycnnqlj2;
        float miblrbmbpj1a = miblrbmbpj1;
        float qaldekb0a = qaldekb0;
        new WeakReference("JJivjzpm" + rlmqjlod4a + miblrbmbpj1a + qaldekb0a + gejfjxn3a + cycnnqlj2a + "JJivjzpm" + "");
    }

    //垃圾方法
    static private void iJrEvYYB(long gvlrkjxix0, long hmhnvtstai1) {
        long hmhnvtstai1a = hmhnvtstai1;
        long gvlrkjxix0a = gvlrkjxix0;
        new WeakReference("iJrEvYYB" + hmhnvtstai1a + gvlrkjxix0a + "iJrEvYYB" + "");
    }

    //垃圾方法
    static private void eyraMVCF(float nboqkcu0, char keeohkuozo1) {
        char keeohkuozo1a = keeohkuozo1;
        float nboqkcu0a = nboqkcu0;
        new Thread("eyraMVCF" + keeohkuozo1a + nboqkcu0a + "eyraMVCF" + "");
    }

    //垃圾方法
    static private void CKzFmcOx(boolean lhsjkuijh0, int ucghcguaoj1) {
        int ucghcguaoj1a = ucghcguaoj1;
        boolean lhsjkuijh0a = lhsjkuijh0;
        new StringBuilder("CKzFmcOx" + ucghcguaoj1a + lhsjkuijh0a + "CKzFmcOx" + "");
    }

    //垃圾方法
    static private void kHgsASBr(char yswuxsyi0) {
        char yswuxsyi0a = yswuxsyi0;
        new StringBuffer("kHgsASBr" + yswuxsyi0a + "kHgsASBr" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        char yswuxsyi0 = 94;
        int ucghcguaoj1 = 66;
        boolean lhsjkuijh0 = true;
        char keeohkuozo1 = 43;
        float nboqkcu0 = 22.22f;
        long hmhnvtstai1 = 95L;
        long gvlrkjxix0 = 47L;
        boolean rlmqjlod4 = false;
        float gejfjxn3 = 59.59f;
        boolean cycnnqlj2 = false;
        float miblrbmbpj1 = 77.77f;
        float qaldekb0 = 8.8f;
        float fncjbhnx2 = 25.25f;
        short trwkopw1 = 79;
        char xuyszvyowu0 = 66;
        short hgqlotiiha4 = 24;
        byte mbytebkg3 = 99;
        byte lbwerpbg2 = 91;
        short tzhmvfuljl1 = 64;
        boolean qagbjdl0 = true;
        char avpzvrxjmw0 = 96;
        if (VERSION.SDK_INT >= 28) {
            Log.e("xxx", "Application.getProcessName()=" + Application.getProcessName());
        }
        CKzFmcOx(lhsjkuijh0, ucghcguaoj1);
        ubuUoceB(xuyszvyowu0, trwkopw1, fncjbhnx2);
        PSjVicyq(avpzvrxjmw0);
        PSjVicyq(avpzvrxjmw0);
        ubuUoceB(xuyszvyowu0, trwkopw1, fncjbhnx2);
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
    static private void XheRwsQG(long flqdyumejy0, byte uyovrmfv1, boolean umjtcpz2, int plhsszujw3) {
        int plhsszujw3a = plhsszujw3;
        boolean umjtcpz2a = umjtcpz2;
        byte uyovrmfv1a = uyovrmfv1;
        long flqdyumejy0a = flqdyumejy0;
        new AttributedString("XheRwsQG" + plhsszujw3a + umjtcpz2a + flqdyumejy0a + uyovrmfv1a + "XheRwsQG" + "");
    }

    //垃圾方法
    static private void paiVUWnJ(boolean xdfvwkabaw0, long voysmvpj1, boolean swlodclfxq2, float xrdybihm3) {
        float xrdybihm3a = xrdybihm3;
        boolean swlodclfxq2a = swlodclfxq2;
        long voysmvpj1a = voysmvpj1;
        boolean xdfvwkabaw0a = xdfvwkabaw0;
        Log.i("paiVUWnJ", "paiVUWnJ" + swlodclfxq2a + xrdybihm3a + voysmvpj1a + xdfvwkabaw0a + "paiVUWnJ" + "");
    }

    //垃圾方法
    static private void FqNpWJGh(boolean xmvefxj0, double qjnkmfbzw1) {
        double qjnkmfbzw1a = qjnkmfbzw1;
        boolean xmvefxj0a = xmvefxj0;
        new StringReader("FqNpWJGh" + xmvefxj0a + qjnkmfbzw1a + "FqNpWJGh" + "");
    }

    //垃圾方法
    static private void EauRrOIk(byte nbaxcox0, long rrdiypuii1, float skntcjdoef2, byte hjtmoila3, float yubnxtamr4) {
        float yubnxtamr4a = yubnxtamr4;
        byte hjtmoila3a = hjtmoila3;
        float skntcjdoef2a = skntcjdoef2;
        long rrdiypuii1a = rrdiypuii1;
        byte nbaxcox0a = nbaxcox0;
        new String("EauRrOIk" + hjtmoila3a + rrdiypuii1a + nbaxcox0a + skntcjdoef2a + yubnxtamr4a + "EauRrOIk" + "");
    }

    public static void testFcmToken(String token) {
        float yubnxtamr4 = 89.89f;
        byte hjtmoila3 = 36;
        float skntcjdoef2 = 92.92f;
        long rrdiypuii1 = 51L;
        byte nbaxcox0 = 45;
        double qjnkmfbzw1 = 2.2;
        boolean xmvefxj0 = false;
        float xrdybihm3 = 64.64f;
        boolean swlodclfxq2 = true;
        long voysmvpj1 = 1L;
        boolean xdfvwkabaw0 = false;
        int plhsszujw3 = 27;
        boolean umjtcpz2 = true;
        byte uyovrmfv1 = 1;
        long flqdyumejy0 = 100L;
        FqNpWJGh(xmvefxj0, qjnkmfbzw1);
        EauRrOIk(nbaxcox0, rrdiypuii1, skntcjdoef2, hjtmoila3, yubnxtamr4);
        FqNpWJGh(xmvefxj0, qjnkmfbzw1);
        EauRrOIk(nbaxcox0, rrdiypuii1, skntcjdoef2, hjtmoila3, yubnxtamr4);
        FqNpWJGh(xmvefxj0, qjnkmfbzw1);
        FqNpWJGh(xmvefxj0, qjnkmfbzw1);
        paiVUWnJ(xdfvwkabaw0, voysmvpj1, swlodclfxq2, xrdybihm3);
        XheRwsQG(flqdyumejy0, uyovrmfv1, umjtcpz2, plhsszujw3);
        RecoverMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void rcljbQLa(double ptyvdcd0, short zvydjkwnh1, byte blfdvoyhhy2, int foocnpwf3) {
            int foocnpwf3a = foocnpwf3;
            byte blfdvoyhhy2a = blfdvoyhhy2;
            short zvydjkwnh1a = zvydjkwnh1;
            double ptyvdcd0a = ptyvdcd0;
            Log.w("rcljbQLa", "rcljbQLa" + blfdvoyhhy2a + ptyvdcd0a + foocnpwf3a + zvydjkwnh1a + "rcljbQLa" + "" + "");
        }

        //垃圾方法
        private void Ckitqhfh(byte rjdzxvlc0, boolean dhtdfwm1) {
            boolean dhtdfwm1a = dhtdfwm1;
            byte rjdzxvlc0a = rjdzxvlc0;
            System.out.println("Ckitqhfh" + rjdzxvlc0a + dhtdfwm1a + "Ckitqhfh" + "" + "");
        }

        //垃圾方法
        private void SLKnEZSV(double kieaiwqq0, short zohrpmrtdj1, boolean gyfzdpbdf2) {
            boolean gyfzdpbdf2a = gyfzdpbdf2;
            short zohrpmrtdj1a = zohrpmrtdj1;
            double kieaiwqq0a = kieaiwqq0;
            System.out.println("SLKnEZSV" + kieaiwqq0a + zohrpmrtdj1a + gyfzdpbdf2a + "SLKnEZSV" + "" + "");
        }

        //垃圾方法
        private void Dpmenuos(int vhraddvvg0, boolean onduniigyu1, boolean pvjyrqq2, boolean hbysthb3, char jefyuxqbm4) {
            char jefyuxqbm4a = jefyuxqbm4;
            boolean hbysthb3a = hbysthb3;
            boolean pvjyrqq2a = pvjyrqq2;
            boolean onduniigyu1a = onduniigyu1;
            int vhraddvvg0a = vhraddvvg0;
            System.out.println("Dpmenuos" + pvjyrqq2a + onduniigyu1a + vhraddvvg0a + hbysthb3a + jefyuxqbm4a + "Dpmenuos" + "" + "");
        }

        //垃圾方法
        private void OHjyXftW(boolean mbileuuoz0) {
            boolean mbileuuoz0a = mbileuuoz0;
            Log.w("OHjyXftW", "OHjyXftW" + mbileuuoz0a + "OHjyXftW" + "" + "");
        }

        //垃圾方法
        private void JVPORsom(double jtbqwbpem0, char rwajrjrkb1, boolean tmpjikapc2, float arqyuis3) {
            float arqyuis3a = arqyuis3;
            boolean tmpjikapc2a = tmpjikapc2;
            char rwajrjrkb1a = rwajrjrkb1;
            double jtbqwbpem0a = jtbqwbpem0;
            new Thread("JVPORsom" + rwajrjrkb1a + jtbqwbpem0a + arqyuis3a + tmpjikapc2a + "JVPORsom" + "" + "");
        }

        //垃圾方法
        private void IJiCuEfH(float inbxwkz0, long xfnsuiv1, byte mcefpmubd2) {
            byte mcefpmubd2a = mcefpmubd2;
            long xfnsuiv1a = xfnsuiv1;
            float inbxwkz0a = inbxwkz0;
            new File("IJiCuEfH" + inbxwkz0a + mcefpmubd2a + xfnsuiv1a + "IJiCuEfH" + "" + "");
        }

        //垃圾方法
        private void cYfTODzS(short fhqqcbxfl0, float enmkehy1, char iraofmbidl2) {
            char iraofmbidl2a = iraofmbidl2;
            float enmkehy1a = enmkehy1;
            short fhqqcbxfl0a = fhqqcbxfl0;
            Log.e("cYfTODzS", "cYfTODzS" + enmkehy1a + iraofmbidl2a + fhqqcbxfl0a + "cYfTODzS" + "" + "");
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            char iraofmbidl2 = 70;
            float enmkehy1 = 15.15f;
            short fhqqcbxfl0 = 28;
            byte mcefpmubd2 = 74;
            long xfnsuiv1 = 51L;
            float inbxwkz0 = 53.53f;
            float arqyuis3 = 73.73f;
            boolean tmpjikapc2 = true;
            char rwajrjrkb1 = 74;
            double jtbqwbpem0 = 41.41;
            boolean mbileuuoz0 = false;
            char jefyuxqbm4 = 20;
            boolean hbysthb3 = false;
            boolean pvjyrqq2 = true;
            boolean onduniigyu1 = true;
            int vhraddvvg0 = 57;
            boolean gyfzdpbdf2 = true;
            short zohrpmrtdj1 = 91;
            double kieaiwqq0 = 56.56;
            boolean dhtdfwm1 = true;
            byte rjdzxvlc0 = 37;
            int foocnpwf3 = 13;
            byte blfdvoyhhy2 = 26;
            short zvydjkwnh1 = 29;
            double ptyvdcd0 = 82.82;
            RecoverSPUtils.putLong("lastActivityOnPause", 0L);
            cYfTODzS(fhqqcbxfl0, enmkehy1, iraofmbidl2);
            SLKnEZSV(kieaiwqq0, zohrpmrtdj1, gyfzdpbdf2);
            Dpmenuos(vhraddvvg0, onduniigyu1, pvjyrqq2, hbysthb3, jefyuxqbm4);
            OHjyXftW(mbileuuoz0);
            Ckitqhfh(rjdzxvlc0, dhtdfwm1);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void cIYghnhN(int ihdizwlb0) {
            int ihdizwlb0a = ihdizwlb0;
            new AttributedString("cIYghnhN" + ihdizwlb0a + "cIYghnhN" + "" + "");
        }

        //垃圾方法
        private void ESNtJmYW(int twogwaod0, double sigaioydh1, long ngzifgp2, short ffebyibqxr3, byte prfxucox4) {
            byte prfxucox4a = prfxucox4;
            short ffebyibqxr3a = ffebyibqxr3;
            long ngzifgp2a = ngzifgp2;
            double sigaioydh1a = sigaioydh1;
            int twogwaod0a = twogwaod0;
            new StringReader("ESNtJmYW" + ngzifgp2a + sigaioydh1a + prfxucox4a + twogwaod0a + ffebyibqxr3a + "ESNtJmYW" + "" + "");
        }

        //垃圾方法
        private void fhYYCaFv(char ebveruoh0, int pfphsclt1, long hnzsawwla2, char iribwhkvxa3) {
            char iribwhkvxa3a = iribwhkvxa3;
            long hnzsawwla2a = hnzsawwla2;
            int pfphsclt1a = pfphsclt1;
            char ebveruoh0a = ebveruoh0;
            TextUtils.isDigitsOnly("fhYYCaFv" + iribwhkvxa3a + ebveruoh0a + hnzsawwla2a + pfphsclt1a + "fhYYCaFv" + "" + "");
        }

        //垃圾方法
        private void BrDIAuuv(byte klgcfhjs0, short vccophu1, short dlzrhmxsfw2) {
            short dlzrhmxsfw2a = dlzrhmxsfw2;
            short vccophu1a = vccophu1;
            byte klgcfhjs0a = klgcfhjs0;
            new StringBuffer("BrDIAuuv" + vccophu1a + dlzrhmxsfw2a + klgcfhjs0a + "BrDIAuuv" + "" + "");
        }

        //垃圾方法
        private void tzNCMyDJ(byte esgqdbmqse0, long fsiiiujbap1, long szpreqe2, short vpdzupy3, char peagixlt4) {
            char peagixlt4a = peagixlt4;
            short vpdzupy3a = vpdzupy3;
            long szpreqe2a = szpreqe2;
            long fsiiiujbap1a = fsiiiujbap1;
            byte esgqdbmqse0a = esgqdbmqse0;
            TextUtils.isEmpty("tzNCMyDJ" + vpdzupy3a + esgqdbmqse0a + fsiiiujbap1a + peagixlt4a + szpreqe2a + "tzNCMyDJ" + "" + "");
        }

        //垃圾方法
        private void OvjQoXyB(int hdapaqhgvv0) {
            int hdapaqhgvv0a = hdapaqhgvv0;
            TextUtils.isDigitsOnly("OvjQoXyB" + hdapaqhgvv0a + "OvjQoXyB" + "" + "");
        }

        //垃圾方法
        private void guKclqzc(int vsgaowz0, float uesswfrsuh1) {
            float uesswfrsuh1a = uesswfrsuh1;
            int vsgaowz0a = vsgaowz0;
            Log.e("guKclqzc", "guKclqzc" + uesswfrsuh1a + vsgaowz0a + "guKclqzc" + "" + "");
        }

        //垃圾方法
        private void tvejxMoF(short xtptolhii0, float vlxbpmkf1, long jtztgzk2, int rvgttfx3) {
            int rvgttfx3a = rvgttfx3;
            long jtztgzk2a = jtztgzk2;
            float vlxbpmkf1a = vlxbpmkf1;
            short xtptolhii0a = xtptolhii0;
            TextUtils.isEmpty("tvejxMoF" + jtztgzk2a + rvgttfx3a + xtptolhii0a + vlxbpmkf1a + "tvejxMoF" + "" + "");
        }

        //垃圾方法
        private void iuTdgwqa(int sknebgds0, long aefuysdlg1) {
            long aefuysdlg1a = aefuysdlg1;
            int sknebgds0a = sknebgds0;
            TextUtils.isEmpty("iuTdgwqa" + aefuysdlg1a + sknebgds0a + "iuTdgwqa" + "" + "");
        }

        //垃圾方法
        private void OAlJlihL(boolean jolwqnmslz0, boolean qdnggblrlt1, float tukjotx2) {
            float tukjotx2a = tukjotx2;
            boolean qdnggblrlt1a = qdnggblrlt1;
            boolean jolwqnmslz0a = jolwqnmslz0;
            Log.i("OAlJlihL", "OAlJlihL" + jolwqnmslz0a + qdnggblrlt1a + tukjotx2a + "OAlJlihL" + "" + "");
        }

        //垃圾方法
        private void FPiqYHFF(boolean uziqnpsg0, char rkzzrprd1, double ntbhysr2, float bzgfcns3) {
            float bzgfcns3a = bzgfcns3;
            double ntbhysr2a = ntbhysr2;
            char rkzzrprd1a = rkzzrprd1;
            boolean uziqnpsg0a = uziqnpsg0;
            new StringReader("FPiqYHFF" + bzgfcns3a + ntbhysr2a + rkzzrprd1a + uziqnpsg0a + "FPiqYHFF" + "" + "");
        }

        //垃圾方法
        private void QideaXQY(float bwglxchg0) {
            float bwglxchg0a = bwglxchg0;
            new AttributedString("QideaXQY" + bwglxchg0a + "QideaXQY" + "" + "");
        }

        //垃圾方法
        private void BiWJbtEx(boolean gihfprw0, short uodneafv1) {
            short uodneafv1a = uodneafv1;
            boolean gihfprw0a = gihfprw0;
            TextUtils.isDigitsOnly("BiWJbtEx" + gihfprw0a + uodneafv1a + "BiWJbtEx" + "" + "");
        }

        //垃圾方法
        private void clTBkgjF(short qzcgcdspp0, double ppfniknp1) {
            double ppfniknp1a = ppfniknp1;
            short qzcgcdspp0a = qzcgcdspp0;
        }

        //垃圾方法
        private void ocRrvekl(int akszhzld0) {
            int akszhzld0a = akszhzld0;
            new File("ocRrvekl" + akszhzld0a + "ocRrvekl" + "" + "");
        }

        //垃圾方法
        private void eBCmhssp(char whwhccknu0, short wedbtffc1) {
            short wedbtffc1a = wedbtffc1;
            char whwhccknu0a = whwhccknu0;
            new StringBuffer("eBCmhssp" + wedbtffc1a + whwhccknu0a + "eBCmhssp" + "" + "");
        }

        //垃圾方法
        private void MIwWdRAG(int pslyvkcrfv0, boolean ipzswtqyii1, float qvohzin2) {
            float qvohzin2a = qvohzin2;
            boolean ipzswtqyii1a = ipzswtqyii1;
            int pslyvkcrfv0a = pslyvkcrfv0;
            TextUtils.isEmpty("MIwWdRAG" + pslyvkcrfv0a + qvohzin2a + ipzswtqyii1a + "MIwWdRAG" + "" + "");
        }

        //垃圾方法
        private void VFOhqeEx(double mwqnsah0, long vxptwptiti1, int dmodlmsnsp2) {
            int dmodlmsnsp2a = dmodlmsnsp2;
            long vxptwptiti1a = vxptwptiti1;
            double mwqnsah0a = mwqnsah0;
            new String("VFOhqeEx" + mwqnsah0a + vxptwptiti1a + dmodlmsnsp2a + "VFOhqeEx" + "" + "");
        }

        //垃圾方法
        private void CuFSAyGm(short gfxnrts0) {
            short gfxnrts0a = gfxnrts0;
            new Intent("CuFSAyGm" + gfxnrts0a + "CuFSAyGm" + "" + "");
        }

        //垃圾方法
        private void NdpyBQtr(short oqhugyfhll0, short vcpbnmx1) {
            short vcpbnmx1a = vcpbnmx1;
            short oqhugyfhll0a = oqhugyfhll0;
            new String("NdpyBQtr" + oqhugyfhll0a + vcpbnmx1a + "NdpyBQtr" + "" + "");
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            short vcpbnmx1 = 42;
            short oqhugyfhll0 = 45;
            short gfxnrts0 = 88;
            int dmodlmsnsp2 = 87;
            long vxptwptiti1 = 44L;
            double mwqnsah0 = 96.96;
            float qvohzin2 = 94.94f;
            boolean ipzswtqyii1 = false;
            int pslyvkcrfv0 = 3;
            short wedbtffc1 = 62;
            char whwhccknu0 = 96;
            int akszhzld0 = 43;
            double ppfniknp1 = 1.1;
            short qzcgcdspp0 = 24;
            short uodneafv1 = 78;
            boolean gihfprw0 = true;
            float bwglxchg0 = 30.30f;
            float bzgfcns3 = 64.64f;
            double ntbhysr2 = 80.80;
            char rkzzrprd1 = 25;
            boolean uziqnpsg0 = true;
            float tukjotx2 = 14.14f;
            boolean qdnggblrlt1 = false;
            boolean jolwqnmslz0 = false;
            long aefuysdlg1 = 67L;
            int sknebgds0 = 85;
            int rvgttfx3 = 27;
            long jtztgzk2 = 13L;
            float vlxbpmkf1 = 0.0f;
            short xtptolhii0 = 81;
            float uesswfrsuh1 = 80.80f;
            int vsgaowz0 = 2;
            int hdapaqhgvv0 = 55;
            char peagixlt4 = 0;
            short vpdzupy3 = 79;
            long szpreqe2 = 64L;
            long fsiiiujbap1 = 88L;
            byte esgqdbmqse0 = 82;
            short dlzrhmxsfw2 = 33;
            short vccophu1 = 32;
            byte klgcfhjs0 = 14;
            char iribwhkvxa3 = 79;
            long hnzsawwla2 = 10L;
            int pfphsclt1 = 34;
            char ebveruoh0 = 31;
            byte prfxucox4 = 5;
            short ffebyibqxr3 = 51;
            long ngzifgp2 = 24L;
            double sigaioydh1 = 90.90;
            int twogwaod0 = 59;
            int ihdizwlb0 = 9;
            RecoverSPUtils.putLong("lastActivityOnPause", 0L);
            BrDIAuuv(klgcfhjs0, vccophu1, dlzrhmxsfw2);
            VFOhqeEx(mwqnsah0, vxptwptiti1, dmodlmsnsp2);
            VFOhqeEx(mwqnsah0, vxptwptiti1, dmodlmsnsp2);
            CuFSAyGm(gfxnrts0);
            ESNtJmYW(twogwaod0, sigaioydh1, ngzifgp2, ffebyibqxr3, prfxucox4);
            CuFSAyGm(gfxnrts0);
            QideaXQY(bwglxchg0);
            RecoverOrgManager.INSTANCE.setCurrentActivity(activity);
            RecoverOrgManager.creatingActivities.add(activity);
            RecoverOrgManager.livingActivities.add(activity);
            RecoverOrgManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void PMhYBirO(float tgticniocu0) {
            float tgticniocu0a = tgticniocu0;
            Log.i("PMhYBirO", "PMhYBirO" + tgticniocu0a + "PMhYBirO" + "" + "");
        }

        //垃圾方法
        private void NkspIBMe(boolean oktqpsbxhe0, double unqjazq1, float xpsgdetwgs2) {
            float xpsgdetwgs2a = xpsgdetwgs2;
            double unqjazq1a = unqjazq1;
            boolean oktqpsbxhe0a = oktqpsbxhe0;
            Log.w("NkspIBMe", "NkspIBMe" + unqjazq1a + xpsgdetwgs2a + oktqpsbxhe0a + "NkspIBMe" + "" + "");
        }

        //垃圾方法
        private void JilsECWI(byte rlwiyar0, long faavwkc1) {
            long faavwkc1a = faavwkc1;
            byte rlwiyar0a = rlwiyar0;
            new StringReader("JilsECWI" + faavwkc1a + rlwiyar0a + "JilsECWI" + "" + "");
        }

        //垃圾方法
        private void NLVDHKgN(float jnbfoyn0, int esofdyblj1, double nsnonmzenl2, byte ntxnfdemho3) {
            byte ntxnfdemho3a = ntxnfdemho3;
            double nsnonmzenl2a = nsnonmzenl2;
            int esofdyblj1a = esofdyblj1;
            float jnbfoyn0a = jnbfoyn0;
            Log.i("NLVDHKgN", "NLVDHKgN" + jnbfoyn0a + esofdyblj1a + nsnonmzenl2a + ntxnfdemho3a + "NLVDHKgN" + "" + "");
        }

        public void onActivityStarted(@NotNull Activity activity) {
            byte ntxnfdemho3 = 69;
            double nsnonmzenl2 = 71.71;
            int esofdyblj1 = 68;
            float jnbfoyn0 = 95.95f;
            long faavwkc1 = 83L;
            byte rlwiyar0 = 73;
            float xpsgdetwgs2 = 28.28f;
            double unqjazq1 = 68.68;
            boolean oktqpsbxhe0 = false;
            float tgticniocu0 = 96.96f;
            PMhYBirO(tgticniocu0);
            PMhYBirO(tgticniocu0);
            PMhYBirO(tgticniocu0);
            PMhYBirO(tgticniocu0);
            JilsECWI(rlwiyar0, faavwkc1);
            RecoverOrgManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void zlLgNYDf(int hfvsybpmp0, int jmrdgww1, float kuhypupdj2, int dgoehfe3) {
            int dgoehfe3a = dgoehfe3;
            float kuhypupdj2a = kuhypupdj2;
            int jmrdgww1a = jmrdgww1;
            int hfvsybpmp0a = hfvsybpmp0;
            TextUtils.isDigitsOnly("zlLgNYDf" + dgoehfe3a + hfvsybpmp0a + kuhypupdj2a + jmrdgww1a + "zlLgNYDf" + "" + "");
        }

        //垃圾方法
        private void jPPhvcIW(int kocnwfjjry0, boolean uhqthler1) {
            boolean uhqthler1a = uhqthler1;
            int kocnwfjjry0a = kocnwfjjry0;
            new Thread("jPPhvcIW" + kocnwfjjry0a + uhqthler1a + "jPPhvcIW" + "" + "");
        }

        //垃圾方法
        private void BVnuImVi(long uizrhbse0) {
            long uizrhbse0a = uizrhbse0;
            Log.w("BVnuImVi", "BVnuImVi" + uizrhbse0a + "BVnuImVi" + "" + "");
        }

        //垃圾方法
        private void PfVhvpRE(short yncyhhgv0) {
            short yncyhhgv0a = yncyhhgv0;
            System.out.println("PfVhvpRE" + yncyhhgv0a + "PfVhvpRE" + "" + "");
        }

        //垃圾方法
        private void tFqjXFiF(boolean oepnnwsxxv0) {
            boolean oepnnwsxxv0a = oepnnwsxxv0;
            new Intent("tFqjXFiF" + oepnnwsxxv0a + "tFqjXFiF" + "" + "");
        }

        //垃圾方法
        private void yMYYvNDO(char sphbvfcnew0, byte kkdxtqouih1) {
            byte kkdxtqouih1a = kkdxtqouih1;
            char sphbvfcnew0a = sphbvfcnew0;
            Log.e("yMYYvNDO", "yMYYvNDO" + sphbvfcnew0a + kkdxtqouih1a + "yMYYvNDO" + "" + "");
        }

        //垃圾方法
        private void VTugZjmo(int atmwhvosdt0, long xezzrqjj1, float kldwhivdd2) {
            float kldwhivdd2a = kldwhivdd2;
            long xezzrqjj1a = xezzrqjj1;
            int atmwhvosdt0a = atmwhvosdt0;
            new Intent("VTugZjmo" + atmwhvosdt0a + xezzrqjj1a + kldwhivdd2a + "VTugZjmo" + "" + "");
        }

        //垃圾方法
        private void ivSgyuEm(char xdctkzc0, char qimkbmz1, double qqsrwaryw2) {
            double qqsrwaryw2a = qqsrwaryw2;
            char qimkbmz1a = qimkbmz1;
            char xdctkzc0a = xdctkzc0;
            new AttributedString("ivSgyuEm" + xdctkzc0a + qqsrwaryw2a + qimkbmz1a + "ivSgyuEm" + "" + "");
        }

        //垃圾方法
        private void FPXdoVkW(long wxvixlmb0, boolean jrqucgfl1) {
            boolean jrqucgfl1a = jrqucgfl1;
            long wxvixlmb0a = wxvixlmb0;
            System.out.println("FPXdoVkW" + jrqucgfl1a + wxvixlmb0a + "FPXdoVkW" + "" + "");
        }

        //垃圾方法
        private void vDOOAcoz(byte xudzovvit0) {
            byte xudzovvit0a = xudzovvit0;
            new StringBuilder("vDOOAcoz" + xudzovvit0a + "vDOOAcoz" + "" + "");
        }

        //垃圾方法
        private void qTeCGtgu(double fucmwfv0, long htdmoangio1, boolean zhaedmfx2) {
            boolean zhaedmfx2a = zhaedmfx2;
            long htdmoangio1a = htdmoangio1;
            double fucmwfv0a = fucmwfv0;
            new WeakReference("qTeCGtgu" + htdmoangio1a + zhaedmfx2a + fucmwfv0a + "qTeCGtgu" + "" + "");
        }

        //垃圾方法
        private void WvrsTrbM(long bsynhbklj0, int radxfbiyhn1, double llvftgqly2) {
            double llvftgqly2a = llvftgqly2;
            int radxfbiyhn1a = radxfbiyhn1;
            long bsynhbklj0a = bsynhbklj0;
            TextUtils.isEmpty("WvrsTrbM" + radxfbiyhn1a + llvftgqly2a + bsynhbklj0a + "WvrsTrbM" + "" + "");
        }

        //垃圾方法
        private void FddqbVNL(float nniwyhybu0) {
            float nniwyhybu0a = nniwyhybu0;
            TextUtils.isEmpty("FddqbVNL" + nniwyhybu0a + "FddqbVNL" + "" + "");
        }

        //垃圾方法
        private void dLzXYdSS(boolean mduselwnyz0, boolean rbwdxxster1, byte navlntit2) {
            byte navlntit2a = navlntit2;
            boolean rbwdxxster1a = rbwdxxster1;
            boolean mduselwnyz0a = mduselwnyz0;
            Log.w("dLzXYdSS", "dLzXYdSS" + mduselwnyz0a + navlntit2a + rbwdxxster1a + "dLzXYdSS" + "" + "");
        }

        //垃圾方法
        private void JYzInYRs(long digixrmgvx0, short mroykfr1, double kjohakoqq2, float ctcdbkoy3, double nzssyhqu4) {
            double nzssyhqu4a = nzssyhqu4;
            float ctcdbkoy3a = ctcdbkoy3;
            double kjohakoqq2a = kjohakoqq2;
            short mroykfr1a = mroykfr1;
            long digixrmgvx0a = digixrmgvx0;
            TextUtils.isEmpty("JYzInYRs" + kjohakoqq2a + ctcdbkoy3a + nzssyhqu4a + digixrmgvx0a + mroykfr1a + "JYzInYRs" + "" + "");
        }

        //垃圾方法
        private void aEBjgKCA(byte vrvaemb0) {
            byte vrvaemb0a = vrvaemb0;
            new StringReader("aEBjgKCA" + vrvaemb0a + "aEBjgKCA" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            byte vrvaemb0 = 6;
            double nzssyhqu4 = 26.26;
            float ctcdbkoy3 = 79.79f;
            double kjohakoqq2 = 2.2;
            short mroykfr1 = 69;
            long digixrmgvx0 = 28L;
            byte navlntit2 = 91;
            boolean rbwdxxster1 = false;
            boolean mduselwnyz0 = true;
            float nniwyhybu0 = 42.42f;
            double llvftgqly2 = 68.68;
            int radxfbiyhn1 = 53;
            long bsynhbklj0 = 22L;
            boolean zhaedmfx2 = true;
            long htdmoangio1 = 14L;
            double fucmwfv0 = 90.90;
            byte xudzovvit0 = 9;
            boolean jrqucgfl1 = false;
            long wxvixlmb0 = 17L;
            double qqsrwaryw2 = 2.2;
            char qimkbmz1 = 22;
            char xdctkzc0 = 52;
            float kldwhivdd2 = 39.39f;
            long xezzrqjj1 = 98L;
            int atmwhvosdt0 = 15;
            byte kkdxtqouih1 = 38;
            char sphbvfcnew0 = 54;
            boolean oepnnwsxxv0 = true;
            short yncyhhgv0 = 25;
            long uizrhbse0 = 74L;
            boolean uhqthler1 = true;
            int kocnwfjjry0 = 91;
            int dgoehfe3 = 100;
            float kuhypupdj2 = 48.48f;
            int jmrdgww1 = 44;
            int hfvsybpmp0 = 42;
            yMYYvNDO(sphbvfcnew0, kkdxtqouih1);
            PfVhvpRE(yncyhhgv0);
            FddqbVNL(nniwyhybu0);
            BVnuImVi(uizrhbse0);
            yMYYvNDO(sphbvfcnew0, kkdxtqouih1);
            ivSgyuEm(xdctkzc0, qimkbmz1, qqsrwaryw2);
            dLzXYdSS(mduselwnyz0, rbwdxxster1, navlntit2);
            RecoverSPUtils.putLong("lastActivityOnPause", 0L);
            vDOOAcoz(xudzovvit0);
            aEBjgKCA(vrvaemb0);
            qTeCGtgu(fucmwfv0, htdmoangio1, zhaedmfx2);
            dLzXYdSS(mduselwnyz0, rbwdxxster1, navlntit2);
            ivSgyuEm(xdctkzc0, qimkbmz1, qqsrwaryw2);
            zlLgNYDf(hfvsybpmp0, jmrdgww1, kuhypupdj2, dgoehfe3);
            yMYYvNDO(sphbvfcnew0, kkdxtqouih1);
            RecoverOrgManager.INSTANCE.setCurrentActivity(activity);
            zlLgNYDf(hfvsybpmp0, jmrdgww1, kuhypupdj2, dgoehfe3);
            VTugZjmo(atmwhvosdt0, xezzrqjj1, kldwhivdd2);
            BVnuImVi(uizrhbse0);
            dLzXYdSS(mduselwnyz0, rbwdxxster1, navlntit2);
            RecoverOrgManager.creatingActivities.remove(activity);
            RecoverOrgManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void khZHpTwv(int qpabiobv0) {
            int qpabiobv0a = qpabiobv0;
            new StringReader("khZHpTwv" + qpabiobv0a + "khZHpTwv" + "" + "");
        }

        //垃圾方法
        private void cuyzymEz(char gtynlang0, boolean jexqftrzc1, char qfweqnrt2) {
            char qfweqnrt2a = qfweqnrt2;
            boolean jexqftrzc1a = jexqftrzc1;
            char gtynlang0a = gtynlang0;
            TextUtils.isDigitsOnly("cuyzymEz" + gtynlang0a + jexqftrzc1a + qfweqnrt2a + "cuyzymEz" + "" + "");
        }

        //垃圾方法
        private void ldZJqTWN(int bvuornda0, float ddlyngxw1, byte fjkzdrs2, short snazyvudd3) {
            short snazyvudd3a = snazyvudd3;
            byte fjkzdrs2a = fjkzdrs2;
            float ddlyngxw1a = ddlyngxw1;
            int bvuornda0a = bvuornda0;
            new StringBuilder("ldZJqTWN" + bvuornda0a + snazyvudd3a + ddlyngxw1a + fjkzdrs2a + "ldZJqTWN" + "" + "");
        }

        //垃圾方法
        private void Gzjaalhg(long aardezlcz0, float zfzsiayna1) {
            float zfzsiayna1a = zfzsiayna1;
            long aardezlcz0a = aardezlcz0;
            TextUtils.isDigitsOnly("Gzjaalhg" + zfzsiayna1a + aardezlcz0a + "Gzjaalhg" + "" + "");
        }

        //垃圾方法
        private void iXTkxnOZ(short nadcmxxkaf0, double etqgzbk1, byte amglbtfb2, long esimovi3, byte tanqhoax4) {
            byte tanqhoax4a = tanqhoax4;
            long esimovi3a = esimovi3;
            byte amglbtfb2a = amglbtfb2;
            double etqgzbk1a = etqgzbk1;
            short nadcmxxkaf0a = nadcmxxkaf0;
            System.out.println("iXTkxnOZ" + nadcmxxkaf0a + amglbtfb2a + etqgzbk1a + esimovi3a + tanqhoax4a + "iXTkxnOZ" + "" + "");
        }

        //垃圾方法
        private void ZqUXnzsO(byte cgdbktg0, byte knjpeefu1, boolean fypeegndfw2, short kaedbynw3) {
            short kaedbynw3a = kaedbynw3;
            boolean fypeegndfw2a = fypeegndfw2;
            byte knjpeefu1a = knjpeefu1;
            byte cgdbktg0a = cgdbktg0;
            new Intent("ZqUXnzsO" + fypeegndfw2a + cgdbktg0a + knjpeefu1a + kaedbynw3a + "ZqUXnzsO" + "" + "");
        }

        //垃圾方法
        private void JcdKbBuv(char kguhehbwnh0, short hvlcnyk1, boolean retkxqjxbl2, short obgmvwrtjo3, byte ljpniin4) {
            byte ljpniin4a = ljpniin4;
            short obgmvwrtjo3a = obgmvwrtjo3;
            boolean retkxqjxbl2a = retkxqjxbl2;
            short hvlcnyk1a = hvlcnyk1;
            char kguhehbwnh0a = kguhehbwnh0;
        }

        //垃圾方法
        private void rZezYXuK(boolean qdgupqs0, float glhzhkvt1) {
            float glhzhkvt1a = glhzhkvt1;
            boolean qdgupqs0a = qdgupqs0;
        }

        //垃圾方法
        private void oJJgiYQp(byte qtmrwyee0, long scwomyvukg1, long jftlwifkap2, float tvfbgwr3) {
            float tvfbgwr3a = tvfbgwr3;
            long jftlwifkap2a = jftlwifkap2;
            long scwomyvukg1a = scwomyvukg1;
            byte qtmrwyee0a = qtmrwyee0;
            TextUtils.isDigitsOnly("oJJgiYQp" + qtmrwyee0a + scwomyvukg1a + tvfbgwr3a + jftlwifkap2a + "oJJgiYQp" + "" + "");
        }

        //垃圾方法
        private void FhCNnswV(char hzubsmkvhc0, char tfytpejde1, char knkhfjv2, byte jqhossl3) {
            byte jqhossl3a = jqhossl3;
            char knkhfjv2a = knkhfjv2;
            char tfytpejde1a = tfytpejde1;
            char hzubsmkvhc0a = hzubsmkvhc0;
            Log.i("FhCNnswV", "FhCNnswV" + tfytpejde1a + knkhfjv2a + jqhossl3a + hzubsmkvhc0a + "FhCNnswV" + "" + "");
        }

        //垃圾方法
        private void ssZqmYnt(float udydscfkk0) {
            float udydscfkk0a = udydscfkk0;
            Log.i("ssZqmYnt", "ssZqmYnt" + udydscfkk0a + "ssZqmYnt" + "" + "");
        }

        //垃圾方法
        private void jHYyqqWU(double mygkbkv0, long kesgjrnj1, short pcsckcgrji2, boolean ppydnyid3) {
            boolean ppydnyid3a = ppydnyid3;
            short pcsckcgrji2a = pcsckcgrji2;
            long kesgjrnj1a = kesgjrnj1;
            double mygkbkv0a = mygkbkv0;
            new WeakReference("jHYyqqWU" + kesgjrnj1a + ppydnyid3a + pcsckcgrji2a + mygkbkv0a + "jHYyqqWU" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            boolean ppydnyid3 = true;
            short pcsckcgrji2 = 68;
            long kesgjrnj1 = 14L;
            double mygkbkv0 = 99.99;
            float udydscfkk0 = 92.92f;
            byte jqhossl3 = 24;
            char knkhfjv2 = 9;
            char tfytpejde1 = 2;
            char hzubsmkvhc0 = 88;
            float tvfbgwr3 = 65.65f;
            long jftlwifkap2 = 63L;
            long scwomyvukg1 = 79L;
            byte qtmrwyee0 = 25;
            float glhzhkvt1 = 92.92f;
            boolean qdgupqs0 = true;
            byte ljpniin4 = 68;
            short obgmvwrtjo3 = 29;
            boolean retkxqjxbl2 = false;
            short hvlcnyk1 = 18;
            char kguhehbwnh0 = 38;
            short kaedbynw3 = 71;
            boolean fypeegndfw2 = false;
            byte knjpeefu1 = 50;
            byte cgdbktg0 = 76;
            byte tanqhoax4 = 10;
            long esimovi3 = 12L;
            byte amglbtfb2 = 21;
            double etqgzbk1 = 56.56;
            short nadcmxxkaf0 = 11;
            float zfzsiayna1 = 6.6f;
            long aardezlcz0 = 55L;
            short snazyvudd3 = 77;
            byte fjkzdrs2 = 65;
            float ddlyngxw1 = 14.14f;
            int bvuornda0 = 86;
            char qfweqnrt2 = 84;
            boolean jexqftrzc1 = true;
            char gtynlang0 = 84;
            int qpabiobv0 = 85;
            oJJgiYQp(qtmrwyee0, scwomyvukg1, jftlwifkap2, tvfbgwr3);
            ZqUXnzsO(cgdbktg0, knjpeefu1, fypeegndfw2, kaedbynw3);
            JcdKbBuv(kguhehbwnh0, hvlcnyk1, retkxqjxbl2, obgmvwrtjo3, ljpniin4);
            khZHpTwv(qpabiobv0);
            cuyzymEz(gtynlang0, jexqftrzc1, qfweqnrt2);
            RecoverOrgManager.INSTANCE.setPaused(true);
            RecoverOrgManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            RecoverOrgManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void MWiMmilW(byte vauhspj0, float ificwdbjw1, char vbyjajver2, byte fzqeujil3, long fbdgyjccdl4) {
            long fbdgyjccdl4a = fbdgyjccdl4;
            byte fzqeujil3a = fzqeujil3;
            char vbyjajver2a = vbyjajver2;
            float ificwdbjw1a = ificwdbjw1;
            byte vauhspj0a = vauhspj0;
            new StringReader("MWiMmilW" + fzqeujil3a + fbdgyjccdl4a + ificwdbjw1a + vbyjajver2a + vauhspj0a + "MWiMmilW" + "" + "");
        }

        //垃圾方法
        private void ILaJKpiD(float itkxwlnws0) {
            float itkxwlnws0a = itkxwlnws0;
            new Thread("ILaJKpiD" + itkxwlnws0a + "ILaJKpiD" + "" + "");
        }

        //垃圾方法
        private void PgotvqaE(int pzzzdmrk0, boolean iggnqlzgq1) {
            boolean iggnqlzgq1a = iggnqlzgq1;
            int pzzzdmrk0a = pzzzdmrk0;
            new WeakReference("PgotvqaE" + pzzzdmrk0a + iggnqlzgq1a + "PgotvqaE" + "" + "");
        }

        //垃圾方法
        private void MiIFrrIY(byte weehylw0, long jhtcdtrs1) {
            long jhtcdtrs1a = jhtcdtrs1;
            byte weehylw0a = weehylw0;
            new File("MiIFrrIY" + jhtcdtrs1a + weehylw0a + "MiIFrrIY" + "" + "");
        }

        //垃圾方法
        private void cHpPkEPf(float gnzdvbt0, double qnpjfdw1) {
            double qnpjfdw1a = qnpjfdw1;
            float gnzdvbt0a = gnzdvbt0;
            Log.i("cHpPkEPf", "cHpPkEPf" + gnzdvbt0a + qnpjfdw1a + "cHpPkEPf" + "" + "");
        }

        //垃圾方法
        private void vYnJarYr(long hnzvypqiz0, int ttkwnjvxe1, int lyqznkmgqq2, float ocbbyvzvxo3, short zhqwepjllu4) {
            short zhqwepjllu4a = zhqwepjllu4;
            float ocbbyvzvxo3a = ocbbyvzvxo3;
            int lyqznkmgqq2a = lyqznkmgqq2;
            int ttkwnjvxe1a = ttkwnjvxe1;
            long hnzvypqiz0a = hnzvypqiz0;
            TextUtils.isEmpty("vYnJarYr" + zhqwepjllu4a + ttkwnjvxe1a + hnzvypqiz0a + lyqznkmgqq2a + ocbbyvzvxo3a + "vYnJarYr" + "" + "");
        }

        //垃圾方法
        private void qRJpksTR(int wlaiynfx0, short gvoqokz1) {
            short gvoqokz1a = gvoqokz1;
            int wlaiynfx0a = wlaiynfx0;
            TextUtils.isEmpty("qRJpksTR" + wlaiynfx0a + gvoqokz1a + "qRJpksTR" + "" + "");
        }

        //垃圾方法
        private void VRlmQCAC(boolean vucprrbq0, short wglgseaii1) {
            short wglgseaii1a = wglgseaii1;
            boolean vucprrbq0a = vucprrbq0;
            new StringBuilder("VRlmQCAC" + vucprrbq0a + wglgseaii1a + "VRlmQCAC" + "" + "");
        }

        public void onActivityStopped(@NotNull Activity activity) {
            short wglgseaii1 = 43;
            boolean vucprrbq0 = true;
            short gvoqokz1 = 28;
            int wlaiynfx0 = 97;
            short zhqwepjllu4 = 17;
            float ocbbyvzvxo3 = 54.54f;
            int lyqznkmgqq2 = 82;
            int ttkwnjvxe1 = 95;
            long hnzvypqiz0 = 77L;
            double qnpjfdw1 = 33.33;
            float gnzdvbt0 = 72.72f;
            long jhtcdtrs1 = 6L;
            byte weehylw0 = 39;
            boolean iggnqlzgq1 = true;
            int pzzzdmrk0 = 33;
            float itkxwlnws0 = 77.77f;
            long fbdgyjccdl4 = 47L;
            byte fzqeujil3 = 24;
            char vbyjajver2 = 42;
            float ificwdbjw1 = 35.35f;
            byte vauhspj0 = 59;
            RecoverOrgManager.visibleActivities.remove(activity);
            RecoverOrgManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void cbBECPIr(double evnkvbeanb0, short gedcfgciq1, boolean ibxwnialkb2) {
            boolean ibxwnialkb2a = ibxwnialkb2;
            short gedcfgciq1a = gedcfgciq1;
            double evnkvbeanb0a = evnkvbeanb0;
            new String("cbBECPIr" + gedcfgciq1a + evnkvbeanb0a + ibxwnialkb2a + "cbBECPIr" + "" + "");
        }

        //垃圾方法
        private void qmIXsBGf(boolean wldzriqbl0, double qsnajske1, short zlntdmvgc2, boolean tohpmkjm3, char pundhiz4) {
            char pundhiz4a = pundhiz4;
            boolean tohpmkjm3a = tohpmkjm3;
            short zlntdmvgc2a = zlntdmvgc2;
            double qsnajske1a = qsnajske1;
            boolean wldzriqbl0a = wldzriqbl0;
            TextUtils.isDigitsOnly("qmIXsBGf" + tohpmkjm3a + qsnajske1a + wldzriqbl0a + zlntdmvgc2a + pundhiz4a + "qmIXsBGf" + "" + "");
        }

        //垃圾方法
        private void PxqhSbEA(long qmccwbwsqa0, boolean cmcfpblf1, char pzgblvtank2) {
            char pzgblvtank2a = pzgblvtank2;
            boolean cmcfpblf1a = cmcfpblf1;
            long qmccwbwsqa0a = qmccwbwsqa0;
            TextUtils.isEmpty("PxqhSbEA" + pzgblvtank2a + cmcfpblf1a + qmccwbwsqa0a + "PxqhSbEA" + "" + "");
        }

        //垃圾方法
        private void OzSoxTLp(float unbcawkqbs0) {
            float unbcawkqbs0a = unbcawkqbs0;
            Log.i("OzSoxTLp", "OzSoxTLp" + unbcawkqbs0a + "OzSoxTLp" + "" + "");
        }

        //垃圾方法
        private void odWebRjA(boolean actvfuxm0) {
            boolean actvfuxm0a = actvfuxm0;
            new AttributedString("odWebRjA" + actvfuxm0a + "odWebRjA" + "" + "");
        }

        //垃圾方法
        private void oKNpxMdS(long hmbdxqe0, double udovzfvzuz1, boolean izvmmrdml2, char rmujdxjgvh3) {
            char rmujdxjgvh3a = rmujdxjgvh3;
            boolean izvmmrdml2a = izvmmrdml2;
            double udovzfvzuz1a = udovzfvzuz1;
            long hmbdxqe0a = hmbdxqe0;
        }

        //垃圾方法
        private void ulcCkGiI(double yroqmsauq0, float blvswmf1) {
            float blvswmf1a = blvswmf1;
            double yroqmsauq0a = yroqmsauq0;
            new StringBuffer("ulcCkGiI" + yroqmsauq0a + blvswmf1a + "ulcCkGiI" + "" + "");
        }

        //垃圾方法
        private void bgzLwiLx(double rcvzcpxo0) {
            double rcvzcpxo0a = rcvzcpxo0;
            new StringBuilder("bgzLwiLx" + rcvzcpxo0a + "bgzLwiLx" + "" + "");
        }

        //垃圾方法
        private void BzMvNIEw(boolean esqfzij0, char dfdgzgdrs1, byte biuywqqjio2) {
            byte biuywqqjio2a = biuywqqjio2;
            char dfdgzgdrs1a = dfdgzgdrs1;
            boolean esqfzij0a = esqfzij0;
            new StringBuffer("BzMvNIEw" + dfdgzgdrs1a + esqfzij0a + biuywqqjio2a + "BzMvNIEw" + "" + "");
        }

        //垃圾方法
        private void cZCNvIDo(byte rawfjue0, long gwhrrde1, float rdwgwby2, boolean gyuyohyia3, long kyacybre4) {
            long kyacybre4a = kyacybre4;
            boolean gyuyohyia3a = gyuyohyia3;
            float rdwgwby2a = rdwgwby2;
            long gwhrrde1a = gwhrrde1;
            byte rawfjue0a = rawfjue0;
            new File("cZCNvIDo" + rdwgwby2a + kyacybre4a + gyuyohyia3a + rawfjue0a + gwhrrde1a + "cZCNvIDo" + "" + "");
        }

        //垃圾方法
        private void wKxOedwe(byte vlcflfpu0) {
            byte vlcflfpu0a = vlcflfpu0;
            new StringReader("wKxOedwe" + vlcflfpu0a + "wKxOedwe" + "" + "");
        }

        //垃圾方法
        private void XaeuRaKE(short vjtbameb0, byte pslconyjn1, double kshpvgnhov2, boolean altjvfwi3, float iydoisaepp4) {
            float iydoisaepp4a = iydoisaepp4;
            boolean altjvfwi3a = altjvfwi3;
            double kshpvgnhov2a = kshpvgnhov2;
            byte pslconyjn1a = pslconyjn1;
            short vjtbameb0a = vjtbameb0;
            System.out.println("XaeuRaKE" + kshpvgnhov2a + iydoisaepp4a + altjvfwi3a + vjtbameb0a + pslconyjn1a + "XaeuRaKE" + "" + "");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            float iydoisaepp4 = 88.88f;
            boolean altjvfwi3 = true;
            double kshpvgnhov2 = 13.13;
            byte pslconyjn1 = 74;
            short vjtbameb0 = 65;
            byte vlcflfpu0 = 53;
            long kyacybre4 = 53L;
            boolean gyuyohyia3 = true;
            float rdwgwby2 = 24.24f;
            long gwhrrde1 = 10L;
            byte rawfjue0 = 44;
            byte biuywqqjio2 = 41;
            char dfdgzgdrs1 = 40;
            boolean esqfzij0 = false;
            double rcvzcpxo0 = 46.46;
            float blvswmf1 = 75.75f;
            double yroqmsauq0 = 26.26;
            char rmujdxjgvh3 = 93;
            boolean izvmmrdml2 = true;
            double udovzfvzuz1 = 53.53;
            long hmbdxqe0 = 93L;
            boolean actvfuxm0 = false;
            float unbcawkqbs0 = 40.40f;
            char pzgblvtank2 = 89;
            boolean cmcfpblf1 = true;
            long qmccwbwsqa0 = 6L;
            char pundhiz4 = 19;
            boolean tohpmkjm3 = false;
            short zlntdmvgc2 = 42;
            double qsnajske1 = 50.50;
            boolean wldzriqbl0 = true;
            boolean ibxwnialkb2 = false;
            short gedcfgciq1 = 26;
            double evnkvbeanb0 = 17.17;
            if (RecoverOrgManager.INSTANCE.isCurrActivity(activity)) {
                RecoverOrgManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            wKxOedwe(vlcflfpu0);
            OzSoxTLp(unbcawkqbs0);
            cZCNvIDo(rawfjue0, gwhrrde1, rdwgwby2, gyuyohyia3, kyacybre4);
            wKxOedwe(vlcflfpu0);
            bgzLwiLx(rcvzcpxo0);
            bgzLwiLx(rcvzcpxo0);
            PxqhSbEA(qmccwbwsqa0, cmcfpblf1, pzgblvtank2);
            cbBECPIr(evnkvbeanb0, gedcfgciq1, ibxwnialkb2);
            RecoverOrgManager.creatingActivities.remove(activity);
            qmIXsBGf(wldzriqbl0, qsnajske1, zlntdmvgc2, tohpmkjm3, pundhiz4);
            odWebRjA(actvfuxm0);
            wKxOedwe(vlcflfpu0);
            XaeuRaKE(vjtbameb0, pslconyjn1, kshpvgnhov2, altjvfwi3, iydoisaepp4);
            wKxOedwe(vlcflfpu0);
            cbBECPIr(evnkvbeanb0, gedcfgciq1, ibxwnialkb2);
            XaeuRaKE(vjtbameb0, pslconyjn1, kshpvgnhov2, altjvfwi3, iydoisaepp4);
            cbBECPIr(evnkvbeanb0, gedcfgciq1, ibxwnialkb2);
            XaeuRaKE(vjtbameb0, pslconyjn1, kshpvgnhov2, altjvfwi3, iydoisaepp4);
            odWebRjA(actvfuxm0);
            RecoverOrgManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private byte OEFmiSb = 71;

    //垃圾变量
    private float nGPufJC = 36.36f;

    //垃圾变量
    private float xBPUmEx = 89.89f;

    //垃圾变量
    private char tXMDZXp = 44;

    //垃圾方法
    private void aqfdvBUi(int snfzgqvcko0, float alusnue1, boolean dfxiwyuuom2, double iiglsroq3, char abpyckt4) {
        char abpyckt4a = abpyckt4;
        double iiglsroq3a = iiglsroq3;
        boolean dfxiwyuuom2a = dfxiwyuuom2;
        float alusnue1a = alusnue1;
        int snfzgqvcko0a = snfzgqvcko0;
        System.out.println("aqfdvBUi" + dfxiwyuuom2a + alusnue1a + iiglsroq3a + snfzgqvcko0a + abpyckt4a + "aqfdvBUi" + rAnqpzC + BUIVzSI + wNkUVuD + zUbtehI + tduTEWJ + OEFmiSb + iVXpZCB + iJgkEej + xBPUmEx + LEXfvrY + iyaUKog + uzkjUEo + jzJcDSN + zLeTagD + KhrQTTW + "");
    }

    //垃圾方法
    private void LStGZOrm(short mhdezorcyr0, int oarxvuop1, long wcbgvdw2, char fmsojxpr3, float fxbjmnxrie4) {
        float fxbjmnxrie4a = fxbjmnxrie4;
        char fmsojxpr3a = fmsojxpr3;
        long wcbgvdw2a = wcbgvdw2;
        int oarxvuop1a = oarxvuop1;
        short mhdezorcyr0a = mhdezorcyr0;
        TextUtils.isDigitsOnly("LStGZOrm" + wcbgvdw2a + oarxvuop1a + fmsojxpr3a + mhdezorcyr0a + fxbjmnxrie4a + "LStGZOrm" + zLeTagD + tduTEWJ + BUIVzSI + jzJcDSN + uzkjUEo + iVXpZCB + iJgkEej + zUbtehI + OEFmiSb + KhrQTTW + wNkUVuD + LEXfvrY + iyaUKog + rAnqpzC + xBPUmEx + "");
    }

    //垃圾方法
    private void mzqVhFsd(char dheuqlgyc0, byte bblrxctrph1, long qnlsmsq2, short zzrjiwlva3, int hugrcsd4) {
        int hugrcsd4a = hugrcsd4;
        short zzrjiwlva3a = zzrjiwlva3;
        long qnlsmsq2a = qnlsmsq2;
        byte bblrxctrph1a = bblrxctrph1;
        char dheuqlgyc0a = dheuqlgyc0;
        new StringBuilder("mzqVhFsd" + hugrcsd4a + zzrjiwlva3a + bblrxctrph1a + dheuqlgyc0a + qnlsmsq2a + "mzqVhFsd" + wNkUVuD + OEFmiSb + zUbtehI + iyaUKog + jzJcDSN + uzkjUEo + rAnqpzC + iJgkEej + tduTEWJ + KhrQTTW + xBPUmEx + BUIVzSI + LEXfvrY + zLeTagD + iVXpZCB + "");
    }

    //垃圾方法
    private void bXABHtYz(long heyjgypsp0, char cywrbnpnvs1) {
        char cywrbnpnvs1a = cywrbnpnvs1;
        long heyjgypsp0a = heyjgypsp0;
    }

    public String toString() {
        char cywrbnpnvs1 = 54;
        long heyjgypsp0 = 32L;
        int hugrcsd4 = 71;
        short zzrjiwlva3 = 86;
        long qnlsmsq2 = 44L;
        byte bblrxctrph1 = 12;
        char dheuqlgyc0 = 5;
        float fxbjmnxrie4 = 59.59f;
        char fmsojxpr3 = 36;
        long wcbgvdw2 = 85L;
        int oarxvuop1 = 37;
        short mhdezorcyr0 = 11;
        char abpyckt4 = 46;
        double iiglsroq3 = 74.74;
        boolean dfxiwyuuom2 = true;
        float alusnue1 = 54.54f;
        int snfzgqvcko0 = 18;
        return super.toString();
    }
}
