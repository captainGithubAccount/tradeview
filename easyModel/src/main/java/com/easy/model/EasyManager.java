package com.easy.model;

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
import com.google.firebase.FirebaseApp;
import com.easy.model.change.EasyChangeUtils;
import com.easy.model.opdj.EasyClockManager;
import com.easy.model.opdj.EasyJober;
import com.easy.model.opdj.Easy1Service;
import com.easy.model.opdj.EasyUserUtils;
import com.easy.model.opdj.msg.EasyMsgUploader;
import com.easy.model.opdj.nt.EasyNtCountUtil;
import com.easy.model.opdj.nt.EasyNtFgService;
import com.easy.model.shownotificy.EasyNtSender;
import com.easy.model.opdj.nt.EasyNtUtils;
import com.easy.model.utils.EasySPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.easy.model.opdj.EasyReceiveRegister;
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
public class EasyManager {

    //垃圾变量
    private float TPYQAnp = 81.81f;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private char UQJHade = 28;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private short RxukkXT = 84;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private byte ykATifX = 50;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private boolean KzysdEH = true;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private byte IbkDjGL = 2;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private float yWFSznz = 55.55f;

    private static long pausedTime;

    //垃圾变量
    private long aJzzKel = 97L;

    private static boolean isPaused;

    //垃圾变量
    private boolean DOdmZUI = true;

    public static final EasyManager INSTANCE = new EasyManager();

    //垃圾变量
    private float KRYwlqO = 61.61f;

    public static String mainProcessName;

    //垃圾变量
    private double oeMEfRr = 40.40;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private long ZHjuWTP = 99L;

    public static int code = 10214;

    //垃圾变量
    private byte ewYbrRJ = 7;

    public static boolean isDebug = true;

    //垃圾方法
    static private void PcUItrZt(double peadvoyha0, short edngrvv1, long jtiibhqx2) {
        long jtiibhqx2a = jtiibhqx2;
        short edngrvv1a = edngrvv1;
        double peadvoyha0a = peadvoyha0;
        new AttributedString("PcUItrZt" + peadvoyha0a + edngrvv1a + jtiibhqx2a + "PcUItrZt" + "");
    }

    //垃圾方法
    static private void bcmHshwQ(double mownfoibs0, long mxdolhc1, long cmbeofgdyc2) {
        long cmbeofgdyc2a = cmbeofgdyc2;
        long mxdolhc1a = mxdolhc1;
        double mownfoibs0a = mownfoibs0;
        new File("bcmHshwQ" + mxdolhc1a + cmbeofgdyc2a + mownfoibs0a + "bcmHshwQ" + "");
    }

    //垃圾方法
    static private void VWedMQWc(long dbssbjx0) {
        long dbssbjx0a = dbssbjx0;
        new String("VWedMQWc" + dbssbjx0a + "VWedMQWc" + "");
    }

    //垃圾方法
    static private void XiWqQmem(int vtmjbkai0, byte qmrgayj1, long hocltivckn2) {
        long hocltivckn2a = hocltivckn2;
        byte qmrgayj1a = qmrgayj1;
        int vtmjbkai0a = vtmjbkai0;
        new AttributedString("XiWqQmem" + hocltivckn2a + vtmjbkai0a + qmrgayj1a + "XiWqQmem" + "");
    }

    public static String getResString(int resId) {
        long hocltivckn2 = 24L;
        byte qmrgayj1 = 29;
        int vtmjbkai0 = 94;
        long dbssbjx0 = 2L;
        long cmbeofgdyc2 = 40L;
        long mxdolhc1 = 69L;
        double mownfoibs0 = 50.50;
        long jtiibhqx2 = 54L;
        short edngrvv1 = 52;
        double peadvoyha0 = 48.48;
        PcUItrZt(peadvoyha0, edngrvv1, jtiibhqx2);
        VWedMQWc(dbssbjx0);
        XiWqQmem(vtmjbkai0, qmrgayj1, hocltivckn2);
        bcmHshwQ(mownfoibs0, mxdolhc1, cmbeofgdyc2);
        XiWqQmem(vtmjbkai0, qmrgayj1, hocltivckn2);
        bcmHshwQ(mownfoibs0, mxdolhc1, cmbeofgdyc2);
        XiWqQmem(vtmjbkai0, qmrgayj1, hocltivckn2);
        return mContext.getString(resId);
    }

    //垃圾方法
    private void qAkLEKaA(byte akjfdkevon0, float ellbsvbd1, short iwvaqlruqt2, float amjndzcha3) {
        float amjndzcha3a = amjndzcha3;
        short iwvaqlruqt2a = iwvaqlruqt2;
        float ellbsvbd1a = ellbsvbd1;
        byte akjfdkevon0a = akjfdkevon0;
        Log.w("qAkLEKaA", "qAkLEKaA" + amjndzcha3a + akjfdkevon0a + ellbsvbd1a + iwvaqlruqt2a + "qAkLEKaA" + UQJHade + LsmyEcO + rCjDtwA + yWFSznz + TPYQAnp + KzysdEH + ykATifX + RxukkXT + KdqiFeN + PhpWrhj + DOdmZUI + DhzZiPE + oeMEfRr + ZHjuWTP + ewYbrRJ + IbkDjGL + aJzzKel + KRYwlqO + "");
    }

    //垃圾方法
    private void sOVbvBSA(long hnhiwkqr0, float njaipvfksg1, double hxsvrbd2, boolean lgjmjpl3, long qyditnf4) {
        long qyditnf4a = qyditnf4;
        boolean lgjmjpl3a = lgjmjpl3;
        double hxsvrbd2a = hxsvrbd2;
        float njaipvfksg1a = njaipvfksg1;
        long hnhiwkqr0a = hnhiwkqr0;
        new Thread("sOVbvBSA" + hxsvrbd2a + njaipvfksg1a + hnhiwkqr0a + qyditnf4a + lgjmjpl3a + "sOVbvBSA" + ykATifX + RxukkXT + ewYbrRJ + DOdmZUI + DhzZiPE + TPYQAnp + KRYwlqO + yWFSznz + oeMEfRr + UQJHade + LsmyEcO + PhpWrhj + aJzzKel + ZHjuWTP + rCjDtwA + IbkDjGL + KzysdEH + KdqiFeN + "");
    }

    //垃圾方法
    private void lXsZahGd(float bfbdtorpuv0) {
        float bfbdtorpuv0a = bfbdtorpuv0;
        new StringReader("lXsZahGd" + bfbdtorpuv0a + "lXsZahGd" + ykATifX + ZHjuWTP + DhzZiPE + oeMEfRr + aJzzKel + RxukkXT + DOdmZUI + UQJHade + KdqiFeN + rCjDtwA + ewYbrRJ + yWFSznz + IbkDjGL + LsmyEcO + KzysdEH + PhpWrhj + KRYwlqO + TPYQAnp + "");
    }

    //垃圾方法
    private void pArdbiZC(int djwaofanc0, short cpflnsv1, char nedejjhj2, long vszbxujwbm3) {
        long vszbxujwbm3a = vszbxujwbm3;
        char nedejjhj2a = nedejjhj2;
        short cpflnsv1a = cpflnsv1;
        int djwaofanc0a = djwaofanc0;
        new Thread("pArdbiZC" + cpflnsv1a + vszbxujwbm3a + nedejjhj2a + djwaofanc0a + "pArdbiZC" + PhpWrhj + rCjDtwA + KzysdEH + LsmyEcO + aJzzKel + IbkDjGL + ZHjuWTP + ykATifX + RxukkXT + TPYQAnp + DhzZiPE + UQJHade + yWFSznz + KRYwlqO + KdqiFeN + oeMEfRr + DOdmZUI + ewYbrRJ + "");
    }

    @Nullable
    public final Context getContext() {
        long vszbxujwbm3 = 6L;
        char nedejjhj2 = 73;
        short cpflnsv1 = 74;
        int djwaofanc0 = 27;
        float bfbdtorpuv0 = 32.32f;
        long qyditnf4 = 63L;
        boolean lgjmjpl3 = false;
        double hxsvrbd2 = 82.82;
        float njaipvfksg1 = 60.60f;
        long hnhiwkqr0 = 62L;
        float amjndzcha3 = 60.60f;
        short iwvaqlruqt2 = 89;
        float ellbsvbd1 = 38.38f;
        byte akjfdkevon0 = 99;
        return mContext;
    }

    //垃圾方法
    private void ErviTzPK(long rwnrqje0, short vdmneywz1) {
        short vdmneywz1a = vdmneywz1;
        long rwnrqje0a = rwnrqje0;
        new String("ErviTzPK" + vdmneywz1a + rwnrqje0a + "ErviTzPK" + RxukkXT + KdqiFeN + KzysdEH + rCjDtwA + DOdmZUI + ZHjuWTP + IbkDjGL + TPYQAnp + oeMEfRr + LsmyEcO + UQJHade + PhpWrhj + ykATifX + KRYwlqO + DhzZiPE + yWFSznz + aJzzKel + ewYbrRJ + "");
    }

    //垃圾方法
    private void BhohnViB(float kdhbnjis0, boolean tfzymrhw1, float jcaicgaqkm2) {
        float jcaicgaqkm2a = jcaicgaqkm2;
        boolean tfzymrhw1a = tfzymrhw1;
        float kdhbnjis0a = kdhbnjis0;
        new Intent("BhohnViB" + jcaicgaqkm2a + kdhbnjis0a + tfzymrhw1a + "BhohnViB" + ykATifX + oeMEfRr + ZHjuWTP + LsmyEcO + UQJHade + TPYQAnp + rCjDtwA + aJzzKel + DOdmZUI + ewYbrRJ + IbkDjGL + PhpWrhj + KRYwlqO + DhzZiPE + KzysdEH + RxukkXT + yWFSznz + KdqiFeN + "");
    }

    //垃圾方法
    private void zLnSreHD(byte fsdwqznp0, boolean dxggqba1, long ndhskfdkg2) {
        long ndhskfdkg2a = ndhskfdkg2;
        boolean dxggqba1a = dxggqba1;
        byte fsdwqznp0a = fsdwqznp0;
        TextUtils.isDigitsOnly("zLnSreHD" + ndhskfdkg2a + dxggqba1a + fsdwqznp0a + "zLnSreHD" + KdqiFeN + oeMEfRr + ZHjuWTP + aJzzKel + KRYwlqO + DOdmZUI + DhzZiPE + RxukkXT + yWFSznz + ewYbrRJ + ykATifX + LsmyEcO + KzysdEH + IbkDjGL + UQJHade + rCjDtwA + PhpWrhj + TPYQAnp + "");
    }

    //垃圾方法
    private void ehpQBnxP(char etflazh0, long ssdisdjb1, char epmixdoi2) {
        char epmixdoi2a = epmixdoi2;
        long ssdisdjb1a = ssdisdjb1;
        char etflazh0a = etflazh0;
        new StringReader("ehpQBnxP" + ssdisdjb1a + etflazh0a + epmixdoi2a + "ehpQBnxP" + UQJHade + DOdmZUI + KRYwlqO + aJzzKel + DhzZiPE + yWFSznz + ewYbrRJ + oeMEfRr + ZHjuWTP + KzysdEH + ykATifX + KdqiFeN + rCjDtwA + RxukkXT + PhpWrhj + IbkDjGL + LsmyEcO + TPYQAnp + "");
    }

    @NotNull
    public final Handler getHandler() {
        char epmixdoi2 = 29;
        long ssdisdjb1 = 64L;
        char etflazh0 = 84;
        long ndhskfdkg2 = 70L;
        boolean dxggqba1 = true;
        byte fsdwqznp0 = 54;
        float jcaicgaqkm2 = 44.44f;
        boolean tfzymrhw1 = false;
        float kdhbnjis0 = 38.38f;
        short vdmneywz1 = 20;
        long rwnrqje0 = 13L;
        return handler;
    }

    //垃圾方法
    private void tzGcbtCD(double tlokfanl0, double revqtbwupm1, boolean xrcatnuhh2, char wavvhhh3, char wqhzjxu4) {
        char wqhzjxu4a = wqhzjxu4;
        char wavvhhh3a = wavvhhh3;
        boolean xrcatnuhh2a = xrcatnuhh2;
        double revqtbwupm1a = revqtbwupm1;
        double tlokfanl0a = tlokfanl0;
        new StringReader("tzGcbtCD" + xrcatnuhh2a + revqtbwupm1a + tlokfanl0a + wavvhhh3a + wqhzjxu4a + "tzGcbtCD" + oeMEfRr + DhzZiPE + DOdmZUI + PhpWrhj + rCjDtwA + ewYbrRJ + ykATifX + yWFSznz + KRYwlqO + IbkDjGL + LsmyEcO + KdqiFeN + ZHjuWTP + KzysdEH + TPYQAnp + UQJHade + RxukkXT + aJzzKel + "");
    }

    //垃圾方法
    private void sSqwWyes(byte ptoqiabvl0, short hhznghuh1) {
        short hhznghuh1a = hhznghuh1;
        byte ptoqiabvl0a = ptoqiabvl0;
        new String("sSqwWyes" + hhznghuh1a + ptoqiabvl0a + "sSqwWyes" + IbkDjGL + oeMEfRr + TPYQAnp + KzysdEH + ewYbrRJ + ykATifX + UQJHade + KdqiFeN + RxukkXT + yWFSznz + LsmyEcO + KRYwlqO + rCjDtwA + PhpWrhj + aJzzKel + DhzZiPE + ZHjuWTP + DOdmZUI + "");
    }

    //垃圾方法
    private void bTAEhtSJ(char mhrfjpefk0, short hfforpz1, long vtbsezocyd2, char trzmvophq3) {
        char trzmvophq3a = trzmvophq3;
        long vtbsezocyd2a = vtbsezocyd2;
        short hfforpz1a = hfforpz1;
        char mhrfjpefk0a = mhrfjpefk0;
        System.out.println("bTAEhtSJ" + trzmvophq3a + hfforpz1a + vtbsezocyd2a + mhrfjpefk0a + "bTAEhtSJ" + RxukkXT + oeMEfRr + rCjDtwA + KzysdEH + DhzZiPE + UQJHade + KdqiFeN + ZHjuWTP + LsmyEcO + ykATifX + aJzzKel + yWFSznz + PhpWrhj + ewYbrRJ + TPYQAnp + IbkDjGL + DOdmZUI + KRYwlqO + "");
    }

    //垃圾方法
    private void bBqziVrK(boolean gdabdfptsz0, byte kkwraghhp1) {
        byte kkwraghhp1a = kkwraghhp1;
        boolean gdabdfptsz0a = gdabdfptsz0;
        Log.w("bBqziVrK", "bBqziVrK" + gdabdfptsz0a + kkwraghhp1a + "bBqziVrK" + ZHjuWTP + aJzzKel + RxukkXT + UQJHade + yWFSznz + KdqiFeN + KRYwlqO + TPYQAnp + LsmyEcO + ykATifX + DhzZiPE + KzysdEH + IbkDjGL + ewYbrRJ + oeMEfRr + rCjDtwA + PhpWrhj + DOdmZUI + "");
    }

    //垃圾方法
    private void ieBUstak(boolean kespozs0) {
        boolean kespozs0a = kespozs0;
        new File("ieBUstak" + kespozs0a + "ieBUstak" + KRYwlqO + DhzZiPE + TPYQAnp + ZHjuWTP + RxukkXT + ewYbrRJ + ykATifX + yWFSznz + DOdmZUI + rCjDtwA + UQJHade + KzysdEH + PhpWrhj + oeMEfRr + aJzzKel + KdqiFeN + IbkDjGL + LsmyEcO + "");
    }

    //垃圾方法
    private void anYuIzBz(int azdtrmza0) {
        int azdtrmza0a = azdtrmza0;
        new AttributedString("anYuIzBz" + azdtrmza0a + "anYuIzBz" + IbkDjGL + oeMEfRr + aJzzKel + DhzZiPE + ZHjuWTP + ykATifX + DOdmZUI + yWFSznz + TPYQAnp + rCjDtwA + KzysdEH + LsmyEcO + RxukkXT + UQJHade + ewYbrRJ + KRYwlqO + KdqiFeN + PhpWrhj + "");
    }

    //垃圾方法
    private void tEHsusQb(int kyrzypmn0, long hfcttnmxk1) {
        long hfcttnmxk1a = hfcttnmxk1;
        int kyrzypmn0a = kyrzypmn0;
        new AttributedString("tEHsusQb" + hfcttnmxk1a + kyrzypmn0a + "tEHsusQb" + yWFSznz + TPYQAnp + KzysdEH + LsmyEcO + DhzZiPE + UQJHade + oeMEfRr + ZHjuWTP + KdqiFeN + PhpWrhj + ewYbrRJ + RxukkXT + aJzzKel + DOdmZUI + ykATifX + IbkDjGL + KRYwlqO + rCjDtwA + "");
    }

    //垃圾方法
    private void tNxJqEgF(boolean qnzjbwccat0, float spkdnpnvu1, long pwsftgpd2, char mccmhpgs3) {
        char mccmhpgs3a = mccmhpgs3;
        long pwsftgpd2a = pwsftgpd2;
        float spkdnpnvu1a = spkdnpnvu1;
        boolean qnzjbwccat0a = qnzjbwccat0;
        new Intent("tNxJqEgF" + pwsftgpd2a + mccmhpgs3a + spkdnpnvu1a + qnzjbwccat0a + "tNxJqEgF" + rCjDtwA + TPYQAnp + RxukkXT + ykATifX + yWFSznz + aJzzKel + KzysdEH + ZHjuWTP + IbkDjGL + KdqiFeN + DOdmZUI + ewYbrRJ + DhzZiPE + UQJHade + PhpWrhj + KRYwlqO + oeMEfRr + LsmyEcO + "");
    }

    public final void startNotifyService(boolean isFromActivity) {
        char mccmhpgs3 = 83;
        long pwsftgpd2 = 55L;
        float spkdnpnvu1 = 67.67f;
        boolean qnzjbwccat0 = true;
        long hfcttnmxk1 = 75L;
        int kyrzypmn0 = 61;
        int azdtrmza0 = 61;
        boolean kespozs0 = false;
        byte kkwraghhp1 = 32;
        boolean gdabdfptsz0 = true;
        char trzmvophq3 = 100;
        long vtbsezocyd2 = 65L;
        short hfforpz1 = 0;
        char mhrfjpefk0 = 91;
        short hhznghuh1 = 3;
        byte ptoqiabvl0 = 51;
        char wqhzjxu4 = 79;
        char wavvhhh3 = 42;
        boolean xrcatnuhh2 = false;
        double revqtbwupm1 = 17.17;
        double tlokfanl0 = 41.41;
        if (isDebug) {
            Log.e("xxx", "AAManager startNotifyService");
        }
        if (EasyNtUtils.isNotificationEnabled()) {
            EasyNtFgService.startNotifyService(isFromActivity);
        }
    }

    //垃圾方法
    private void voqEJrsQ(byte ymlurfuga0) {
        byte ymlurfuga0a = ymlurfuga0;
        new Thread("voqEJrsQ" + ymlurfuga0a + "voqEJrsQ" + KRYwlqO + LsmyEcO + TPYQAnp + oeMEfRr + yWFSznz + KzysdEH + KdqiFeN + RxukkXT + rCjDtwA + ewYbrRJ + PhpWrhj + DhzZiPE + DOdmZUI + ZHjuWTP + IbkDjGL + ykATifX + UQJHade + aJzzKel + "");
    }

    //垃圾方法
    private void yLHVdUFP(long vjikbithul0, char mtmmcmaa1, int wdnuslws2) {
        int wdnuslws2a = wdnuslws2;
        char mtmmcmaa1a = mtmmcmaa1;
        long vjikbithul0a = vjikbithul0;
        new String("yLHVdUFP" + wdnuslws2a + vjikbithul0a + mtmmcmaa1a + "yLHVdUFP" + RxukkXT + IbkDjGL + LsmyEcO + ykATifX + rCjDtwA + oeMEfRr + KdqiFeN + DOdmZUI + ewYbrRJ + TPYQAnp + DhzZiPE + ZHjuWTP + yWFSznz + KzysdEH + PhpWrhj + KRYwlqO + aJzzKel + UQJHade + "");
    }

    //垃圾方法
    private void QTFyYJDp(boolean hxmfqzona0, double lhhllqeku1, long uazgfbufr2, short ewuqgarkc3, char hjziifpyef4) {
        char hjziifpyef4a = hjziifpyef4;
        short ewuqgarkc3a = ewuqgarkc3;
        long uazgfbufr2a = uazgfbufr2;
        double lhhllqeku1a = lhhllqeku1;
        boolean hxmfqzona0a = hxmfqzona0;
        Log.e("QTFyYJDp", "QTFyYJDp" + uazgfbufr2a + ewuqgarkc3a + hxmfqzona0a + hjziifpyef4a + lhhllqeku1a + "QTFyYJDp" + RxukkXT + KRYwlqO + LsmyEcO + yWFSznz + KdqiFeN + KzysdEH + ewYbrRJ + PhpWrhj + oeMEfRr + DOdmZUI + ykATifX + DhzZiPE + IbkDjGL + aJzzKel + rCjDtwA + UQJHade + TPYQAnp + ZHjuWTP + "");
    }

    //垃圾方法
    private void bXjlqjsb(char urnaqgt0, long nkzsbip1, double pgcmpklfp2, boolean htomyeoh3, short mjhmdttogt4) {
        short mjhmdttogt4a = mjhmdttogt4;
        boolean htomyeoh3a = htomyeoh3;
        double pgcmpklfp2a = pgcmpklfp2;
        long nkzsbip1a = nkzsbip1;
        char urnaqgt0a = urnaqgt0;
        Log.w("bXjlqjsb", "bXjlqjsb" + urnaqgt0a + nkzsbip1a + htomyeoh3a + pgcmpklfp2a + mjhmdttogt4a + "bXjlqjsb" + KRYwlqO + TPYQAnp + KdqiFeN + UQJHade + ewYbrRJ + LsmyEcO + oeMEfRr + DOdmZUI + RxukkXT + ZHjuWTP + PhpWrhj + rCjDtwA + IbkDjGL + DhzZiPE + ykATifX + aJzzKel + yWFSznz + KzysdEH + "");
    }

    //垃圾方法
    private void GFGJqqpb(byte nkgrhptz0, double iocrxdtzg1, byte zovqivcm2, double kqcafeg3, boolean ixovzhau4) {
        boolean ixovzhau4a = ixovzhau4;
        double kqcafeg3a = kqcafeg3;
        byte zovqivcm2a = zovqivcm2;
        double iocrxdtzg1a = iocrxdtzg1;
        byte nkgrhptz0a = nkgrhptz0;
        TextUtils.isDigitsOnly("GFGJqqpb" + zovqivcm2a + iocrxdtzg1a + ixovzhau4a + nkgrhptz0a + kqcafeg3a + "GFGJqqpb" + ykATifX + KRYwlqO + ewYbrRJ + DOdmZUI + oeMEfRr + ZHjuWTP + aJzzKel + RxukkXT + KzysdEH + PhpWrhj + yWFSznz + UQJHade + KdqiFeN + IbkDjGL + DhzZiPE + rCjDtwA + LsmyEcO + TPYQAnp + "");
    }

    //垃圾方法
    private void LFVCRynO(int uvtnmeg0, byte vomilyer1, short sctjbyyps2) {
        short sctjbyyps2a = sctjbyyps2;
        byte vomilyer1a = vomilyer1;
        int uvtnmeg0a = uvtnmeg0;
        new StringBuffer("LFVCRynO" + vomilyer1a + uvtnmeg0a + sctjbyyps2a + "LFVCRynO" + ewYbrRJ + DOdmZUI + KzysdEH + aJzzKel + RxukkXT + KdqiFeN + ZHjuWTP + TPYQAnp + rCjDtwA + KRYwlqO + oeMEfRr + LsmyEcO + ykATifX + PhpWrhj + IbkDjGL + DhzZiPE + UQJHade + yWFSznz + "");
    }

    //垃圾方法
    private void jzEJTaPV(float vbugvnp0, byte ecyolgso1, boolean ucrgpocy2) {
        boolean ucrgpocy2a = ucrgpocy2;
        byte ecyolgso1a = ecyolgso1;
        float vbugvnp0a = vbugvnp0;
        new Thread("jzEJTaPV" + vbugvnp0a + ucrgpocy2a + ecyolgso1a + "jzEJTaPV" + yWFSznz + oeMEfRr + UQJHade + RxukkXT + KzysdEH + ewYbrRJ + ykATifX + DOdmZUI + KRYwlqO + KdqiFeN + LsmyEcO + TPYQAnp + rCjDtwA + PhpWrhj + DhzZiPE + IbkDjGL + aJzzKel + ZHjuWTP + "");
    }

    //垃圾方法
    private void zXHcDZpZ(long dmjuyxeu0, long yueufqwu1, short ntqqzvwfgc2, int azzatggd3) {
        int azzatggd3a = azzatggd3;
        short ntqqzvwfgc2a = ntqqzvwfgc2;
        long yueufqwu1a = yueufqwu1;
        long dmjuyxeu0a = dmjuyxeu0;
        new Intent("zXHcDZpZ" + ntqqzvwfgc2a + dmjuyxeu0a + yueufqwu1a + azzatggd3a + "zXHcDZpZ" + ykATifX + KzysdEH + UQJHade + KdqiFeN + PhpWrhj + rCjDtwA + DhzZiPE + ewYbrRJ + DOdmZUI + yWFSznz + TPYQAnp + RxukkXT + LsmyEcO + ZHjuWTP + aJzzKel + oeMEfRr + IbkDjGL + KRYwlqO + "");
    }

    public final void startTwoService() {
        int azzatggd3 = 38;
        short ntqqzvwfgc2 = 25;
        long yueufqwu1 = 8L;
        long dmjuyxeu0 = 0L;
        boolean ucrgpocy2 = false;
        byte ecyolgso1 = 100;
        float vbugvnp0 = 9.9f;
        short sctjbyyps2 = 74;
        byte vomilyer1 = 13;
        int uvtnmeg0 = 80;
        boolean ixovzhau4 = false;
        double kqcafeg3 = 62.62;
        byte zovqivcm2 = 20;
        double iocrxdtzg1 = 2.2;
        byte nkgrhptz0 = 60;
        short mjhmdttogt4 = 16;
        boolean htomyeoh3 = true;
        double pgcmpklfp2 = 4.4;
        long nkzsbip1 = 83L;
        char urnaqgt0 = 79;
        char hjziifpyef4 = 77;
        short ewuqgarkc3 = 75;
        long uazgfbufr2 = 7L;
        double lhhllqeku1 = 11.11;
        boolean hxmfqzona0 = false;
        int wdnuslws2 = 75;
        char mtmmcmaa1 = 77;
        long vjikbithul0 = 25L;
        byte ymlurfuga0 = 43;
        if (isDebug) {
            LFVCRynO(uvtnmeg0, vomilyer1, sctjbyyps2);
            jzEJTaPV(vbugvnp0, ecyolgso1, ucrgpocy2);
            GFGJqqpb(nkgrhptz0, iocrxdtzg1, zovqivcm2, kqcafeg3, ixovzhau4);
            yLHVdUFP(vjikbithul0, mtmmcmaa1, wdnuslws2);
            zXHcDZpZ(dmjuyxeu0, yueufqwu1, ntqqzvwfgc2, azzatggd3);
            zXHcDZpZ(dmjuyxeu0, yueufqwu1, ntqqzvwfgc2, azzatggd3);
            LFVCRynO(uvtnmeg0, vomilyer1, sctjbyyps2);
            Log.e("xxx", "AAManager startTwoService");
        }
        Easy1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void SxuixmbK(byte vkdchevs0, float fnxrmwcay1) {
        float fnxrmwcay1a = fnxrmwcay1;
        byte vkdchevs0a = vkdchevs0;
        new StringBuffer("SxuixmbK" + vkdchevs0a + fnxrmwcay1a + "SxuixmbK" + aJzzKel + KzysdEH + yWFSznz + UQJHade + rCjDtwA + ykATifX + LsmyEcO + TPYQAnp + oeMEfRr + RxukkXT + PhpWrhj + DOdmZUI + KdqiFeN + ewYbrRJ + DhzZiPE + IbkDjGL + KRYwlqO + ZHjuWTP + "");
    }

    //垃圾方法
    private void YCYfmStG(double woaegtyt0, short obidterpje1, long qcyzqqat2, char cxxudaymx3) {
        char cxxudaymx3a = cxxudaymx3;
        long qcyzqqat2a = qcyzqqat2;
        short obidterpje1a = obidterpje1;
        double woaegtyt0a = woaegtyt0;
        new AttributedString("YCYfmStG" + obidterpje1a + cxxudaymx3a + woaegtyt0a + qcyzqqat2a + "YCYfmStG" + yWFSznz + ewYbrRJ + TPYQAnp + aJzzKel + KdqiFeN + ZHjuWTP + IbkDjGL + UQJHade + LsmyEcO + rCjDtwA + PhpWrhj + DOdmZUI + DhzZiPE + KRYwlqO + ykATifX + RxukkXT + oeMEfRr + KzysdEH + "");
    }

    //垃圾方法
    private void OXVKFYJh(float doujlajldq0, byte twhkwtkjv1) {
        byte twhkwtkjv1a = twhkwtkjv1;
        float doujlajldq0a = doujlajldq0;
        new File("OXVKFYJh" + twhkwtkjv1a + doujlajldq0a + "OXVKFYJh" + ZHjuWTP + aJzzKel + PhpWrhj + IbkDjGL + rCjDtwA + yWFSznz + LsmyEcO + KdqiFeN + DhzZiPE + ykATifX + oeMEfRr + RxukkXT + DOdmZUI + ewYbrRJ + UQJHade + TPYQAnp + KRYwlqO + KzysdEH + "");
    }

    //垃圾方法
    private void zFOgdzDt(float zrwuxwlj0, double ubzjrpozw1, char ujpqmvva2) {
        char ujpqmvva2a = ujpqmvva2;
        double ubzjrpozw1a = ubzjrpozw1;
        float zrwuxwlj0a = zrwuxwlj0;
        new File("zFOgdzDt" + ubzjrpozw1a + zrwuxwlj0a + ujpqmvva2a + "zFOgdzDt" + DhzZiPE + KzysdEH + KdqiFeN + UQJHade + ZHjuWTP + PhpWrhj + oeMEfRr + LsmyEcO + DOdmZUI + IbkDjGL + rCjDtwA + yWFSznz + ykATifX + ewYbrRJ + RxukkXT + aJzzKel + KRYwlqO + TPYQAnp + "");
    }

    public final long getPausedTime() {
        char ujpqmvva2 = 63;
        double ubzjrpozw1 = 90.90;
        float zrwuxwlj0 = 73.73f;
        byte twhkwtkjv1 = 73;
        float doujlajldq0 = 29.29f;
        char cxxudaymx3 = 45;
        long qcyzqqat2 = 59L;
        short obidterpje1 = 26;
        double woaegtyt0 = 43.43;
        float fnxrmwcay1 = 16.16f;
        byte vkdchevs0 = 37;
        return pausedTime;
    }

    //垃圾方法
    private void qTgyIJub(short ykhupokl0, float twpoyvyf1, double ppysmvqd2, boolean imacpqh3, boolean byldmqpc4) {
        boolean byldmqpc4a = byldmqpc4;
        boolean imacpqh3a = imacpqh3;
        double ppysmvqd2a = ppysmvqd2;
        float twpoyvyf1a = twpoyvyf1;
        short ykhupokl0a = ykhupokl0;
        new File("qTgyIJub" + ykhupokl0a + twpoyvyf1a + ppysmvqd2a + imacpqh3a + byldmqpc4a + "qTgyIJub" + aJzzKel + rCjDtwA + DhzZiPE + KdqiFeN + oeMEfRr + KzysdEH + PhpWrhj + ewYbrRJ + DOdmZUI + RxukkXT + UQJHade + IbkDjGL + TPYQAnp + yWFSznz + ykATifX + KRYwlqO + LsmyEcO + ZHjuWTP + "");
    }

    //垃圾方法
    private void MNLkTass(short sazelil0, short erlnwawf1, long xuxibqlbwk2, char rmckasarnb3, short fhqiidsz4) {
        short fhqiidsz4a = fhqiidsz4;
        char rmckasarnb3a = rmckasarnb3;
        long xuxibqlbwk2a = xuxibqlbwk2;
        short erlnwawf1a = erlnwawf1;
        short sazelil0a = sazelil0;
        new String("MNLkTass" + erlnwawf1a + fhqiidsz4a + sazelil0a + rmckasarnb3a + xuxibqlbwk2a + "MNLkTass" + RxukkXT + ZHjuWTP + DOdmZUI + rCjDtwA + oeMEfRr + KRYwlqO + LsmyEcO + TPYQAnp + UQJHade + yWFSznz + aJzzKel + PhpWrhj + KdqiFeN + ykATifX + DhzZiPE + KzysdEH + IbkDjGL + ewYbrRJ + "");
    }

    //垃圾方法
    private void KNgiAFQN(float anpqfgh0) {
        float anpqfgh0a = anpqfgh0;
        new WeakReference("KNgiAFQN" + anpqfgh0a + "KNgiAFQN" + UQJHade + KdqiFeN + rCjDtwA + yWFSznz + ykATifX + DOdmZUI + TPYQAnp + LsmyEcO + oeMEfRr + RxukkXT + IbkDjGL + ZHjuWTP + PhpWrhj + KzysdEH + KRYwlqO + aJzzKel + ewYbrRJ + DhzZiPE + "");
    }

    //垃圾方法
    private void KMJrzenO(char xkgtwnrp0, double gzphqpoa1, char filtqunwj2, int fkdnxxn3) {
        int fkdnxxn3a = fkdnxxn3;
        char filtqunwj2a = filtqunwj2;
        double gzphqpoa1a = gzphqpoa1;
        char xkgtwnrp0a = xkgtwnrp0;
        new StringBuilder("KMJrzenO" + filtqunwj2a + gzphqpoa1a + xkgtwnrp0a + fkdnxxn3a + "KMJrzenO" + oeMEfRr + DOdmZUI + RxukkXT + PhpWrhj + ZHjuWTP + KdqiFeN + ewYbrRJ + LsmyEcO + UQJHade + KRYwlqO + DhzZiPE + IbkDjGL + yWFSznz + KzysdEH + TPYQAnp + aJzzKel + rCjDtwA + ykATifX + "");
    }

    public final void setPausedTime(long var1) {
        int fkdnxxn3 = 56;
        char filtqunwj2 = 94;
        double gzphqpoa1 = 36.36;
        char xkgtwnrp0 = 69;
        float anpqfgh0 = 66.66f;
        short fhqiidsz4 = 64;
        char rmckasarnb3 = 9;
        long xuxibqlbwk2 = 6L;
        short erlnwawf1 = 42;
        short sazelil0 = 38;
        boolean byldmqpc4 = false;
        boolean imacpqh3 = true;
        double ppysmvqd2 = 2.2;
        float twpoyvyf1 = 90.90f;
        short ykhupokl0 = 89;
        pausedTime = var1;
    }

    //垃圾方法
    private void awzkLQlo(char dscxplmepp0) {
        char dscxplmepp0a = dscxplmepp0;
        new StringBuilder("awzkLQlo" + dscxplmepp0a + "awzkLQlo" + DOdmZUI + oeMEfRr + yWFSznz + RxukkXT + DhzZiPE + ewYbrRJ + aJzzKel + PhpWrhj + IbkDjGL + KzysdEH + KRYwlqO + ZHjuWTP + TPYQAnp + UQJHade + rCjDtwA + LsmyEcO + ykATifX + KdqiFeN + "");
    }

    //垃圾方法
    private void tSjutWvK(char mrdyfqsgx0) {
        char mrdyfqsgx0a = mrdyfqsgx0;
        System.out.println("tSjutWvK" + mrdyfqsgx0a + "tSjutWvK" + KdqiFeN + IbkDjGL + UQJHade + TPYQAnp + yWFSznz + ZHjuWTP + oeMEfRr + DhzZiPE + aJzzKel + DOdmZUI + RxukkXT + ewYbrRJ + PhpWrhj + ykATifX + KzysdEH + LsmyEcO + KRYwlqO + rCjDtwA + "");
    }

    //垃圾方法
    private void igBueQNj(long nbhxxxzhiy0, byte pknockyn1, char ixhnqokang2) {
        char ixhnqokang2a = ixhnqokang2;
        byte pknockyn1a = pknockyn1;
        long nbhxxxzhiy0a = nbhxxxzhiy0;
        System.out.println("igBueQNj" + nbhxxxzhiy0a + ixhnqokang2a + pknockyn1a + "igBueQNj" + IbkDjGL + UQJHade + TPYQAnp + PhpWrhj + DOdmZUI + ewYbrRJ + KRYwlqO + aJzzKel + KdqiFeN + LsmyEcO + yWFSznz + ZHjuWTP + oeMEfRr + DhzZiPE + rCjDtwA + RxukkXT + ykATifX + KzysdEH + "");
    }

    //垃圾方法
    private void RTnOooKI(double fqxfmbw0, byte rvjyxgooi1) {
        byte rvjyxgooi1a = rvjyxgooi1;
        double fqxfmbw0a = fqxfmbw0;
        new File("RTnOooKI" + fqxfmbw0a + rvjyxgooi1a + "RTnOooKI" + ykATifX + KdqiFeN + yWFSznz + ZHjuWTP + DhzZiPE + ewYbrRJ + aJzzKel + KRYwlqO + KzysdEH + oeMEfRr + IbkDjGL + LsmyEcO + UQJHade + DOdmZUI + TPYQAnp + RxukkXT + rCjDtwA + PhpWrhj + "");
    }

    public final boolean isPaused() {
        byte rvjyxgooi1 = 86;
        double fqxfmbw0 = 85.85;
        char ixhnqokang2 = 29;
        byte pknockyn1 = 35;
        long nbhxxxzhiy0 = 4L;
        char mrdyfqsgx0 = 26;
        char dscxplmepp0 = 30;
        return isPaused;
    }

    //垃圾方法
    private void RWTkTZCs(boolean sccdeyymkq0, short npnifswyt1, char bfssphzulr2) {
        char bfssphzulr2a = bfssphzulr2;
        short npnifswyt1a = npnifswyt1;
        boolean sccdeyymkq0a = sccdeyymkq0;
        System.out.println("RWTkTZCs" + bfssphzulr2a + npnifswyt1a + sccdeyymkq0a + "RWTkTZCs" + aJzzKel + KRYwlqO + oeMEfRr + rCjDtwA + TPYQAnp + PhpWrhj + KzysdEH + IbkDjGL + UQJHade + ykATifX + DOdmZUI + KdqiFeN + LsmyEcO + ZHjuWTP + ewYbrRJ + yWFSznz + RxukkXT + DhzZiPE + "");
    }

    //垃圾方法
    private void qcbuFrKS(boolean aehuvij0, byte bhthqonc1, int ivglenzuyd2, float vnszwsnm3) {
        float vnszwsnm3a = vnszwsnm3;
        int ivglenzuyd2a = ivglenzuyd2;
        byte bhthqonc1a = bhthqonc1;
        boolean aehuvij0a = aehuvij0;
        TextUtils.isEmpty("qcbuFrKS" + ivglenzuyd2a + bhthqonc1a + vnszwsnm3a + aehuvij0a + "qcbuFrKS" + yWFSznz + RxukkXT + PhpWrhj + UQJHade + rCjDtwA + DhzZiPE + ykATifX + IbkDjGL + ZHjuWTP + LsmyEcO + oeMEfRr + TPYQAnp + KRYwlqO + DOdmZUI + KdqiFeN + ewYbrRJ + KzysdEH + aJzzKel + "");
    }

    //垃圾方法
    private void JYAohIeh(boolean dtlbnhh0) {
        boolean dtlbnhh0a = dtlbnhh0;
        Log.i("JYAohIeh", "JYAohIeh" + dtlbnhh0a + "JYAohIeh" + KRYwlqO + ZHjuWTP + KzysdEH + ewYbrRJ + DOdmZUI + UQJHade + IbkDjGL + DhzZiPE + KdqiFeN + aJzzKel + LsmyEcO + yWFSznz + oeMEfRr + ykATifX + TPYQAnp + rCjDtwA + PhpWrhj + RxukkXT + "");
    }

    //垃圾方法
    private void yjUpoVQh(int uzipevf0, double mwsgwxxd1, boolean biqxzidrg2, boolean owmrvgean3, boolean zzkeajrcb4) {
        boolean zzkeajrcb4a = zzkeajrcb4;
        boolean owmrvgean3a = owmrvgean3;
        boolean biqxzidrg2a = biqxzidrg2;
        double mwsgwxxd1a = mwsgwxxd1;
        int uzipevf0a = uzipevf0;
        Log.w("yjUpoVQh", "yjUpoVQh" + mwsgwxxd1a + zzkeajrcb4a + owmrvgean3a + biqxzidrg2a + uzipevf0a + "yjUpoVQh" + TPYQAnp + yWFSznz + KdqiFeN + LsmyEcO + rCjDtwA + UQJHade + oeMEfRr + ykATifX + DhzZiPE + KRYwlqO + aJzzKel + ewYbrRJ + ZHjuWTP + KzysdEH + DOdmZUI + PhpWrhj + IbkDjGL + RxukkXT + "");
    }

    public final void setPaused(boolean var1) {
        boolean zzkeajrcb4 = true;
        boolean owmrvgean3 = true;
        boolean biqxzidrg2 = true;
        double mwsgwxxd1 = 100.100;
        int uzipevf0 = 73;
        boolean dtlbnhh0 = false;
        float vnszwsnm3 = 29.29f;
        int ivglenzuyd2 = 73;
        byte bhthqonc1 = 90;
        boolean aehuvij0 = true;
        char bfssphzulr2 = 65;
        short npnifswyt1 = 46;
        boolean sccdeyymkq0 = false;
        RWTkTZCs(sccdeyymkq0, npnifswyt1, bfssphzulr2);
        yjUpoVQh(uzipevf0, mwsgwxxd1, biqxzidrg2, owmrvgean3, zzkeajrcb4);
        yjUpoVQh(uzipevf0, mwsgwxxd1, biqxzidrg2, owmrvgean3, zzkeajrcb4);
        RWTkTZCs(sccdeyymkq0, npnifswyt1, bfssphzulr2);
        JYAohIeh(dtlbnhh0);
        RWTkTZCs(sccdeyymkq0, npnifswyt1, bfssphzulr2);
        JYAohIeh(dtlbnhh0);
        qcbuFrKS(aehuvij0, bhthqonc1, ivglenzuyd2, vnszwsnm3);
        isPaused = var1;
    }

    //垃圾方法
    static private void lZjlcrLJ(double iumejrz0, char mtpendt1) {
        char mtpendt1a = mtpendt1;
        double iumejrz0a = iumejrz0;
        new StringBuilder("lZjlcrLJ" + iumejrz0a + mtpendt1a + "lZjlcrLJ" + "");
    }

    //垃圾方法
    static private void VfVgYVZF(byte yzixtki0, byte sefzguc1, char ebrxqjhytz2, int wwymmwifa3, float kcoozqat4) {
        float kcoozqat4a = kcoozqat4;
        int wwymmwifa3a = wwymmwifa3;
        char ebrxqjhytz2a = ebrxqjhytz2;
        byte sefzguc1a = sefzguc1;
        byte yzixtki0a = yzixtki0;
        new StringBuilder("VfVgYVZF" + sefzguc1a + wwymmwifa3a + kcoozqat4a + ebrxqjhytz2a + yzixtki0a + "VfVgYVZF" + "");
    }

    //垃圾方法
    static private void XBBrIbZH(char jpocpwspl0, int vvfzgjizpv1, float kyjpcxdwhs2, float zisihhuuxy3) {
        float zisihhuuxy3a = zisihhuuxy3;
        float kyjpcxdwhs2a = kyjpcxdwhs2;
        int vvfzgjizpv1a = vvfzgjizpv1;
        char jpocpwspl0a = jpocpwspl0;
        new Intent("XBBrIbZH" + kyjpcxdwhs2a + vvfzgjizpv1a + zisihhuuxy3a + jpocpwspl0a + "XBBrIbZH" + "");
    }

    //垃圾方法
    static private void QQZOHxwD(boolean aaweozsajh0) {
        boolean aaweozsajh0a = aaweozsajh0;
        Log.w("QQZOHxwD", "QQZOHxwD" + aaweozsajh0a + "QQZOHxwD" + "");
    }

    public static String getString(int stringResId) {
        boolean aaweozsajh0 = true;
        float zisihhuuxy3 = 10.10f;
        float kyjpcxdwhs2 = 88.88f;
        int vvfzgjizpv1 = 21;
        char jpocpwspl0 = 69;
        float kcoozqat4 = 69.69f;
        int wwymmwifa3 = 71;
        char ebrxqjhytz2 = 40;
        byte sefzguc1 = 6;
        byte yzixtki0 = 5;
        char mtpendt1 = 90;
        double iumejrz0 = 81.81;
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void rOKAMcmH(long bsczpqfbgb0, byte tlfkxnwt1, long nznvhwcdqb2, byte qtrspeybux3, long akwzdbmzr4) {
        long akwzdbmzr4a = akwzdbmzr4;
        byte qtrspeybux3a = qtrspeybux3;
        long nznvhwcdqb2a = nznvhwcdqb2;
        byte tlfkxnwt1a = tlfkxnwt1;
        long bsczpqfbgb0a = bsczpqfbgb0;
        new WeakReference("rOKAMcmH" + tlfkxnwt1a + akwzdbmzr4a + qtrspeybux3a + nznvhwcdqb2a + bsczpqfbgb0a + "rOKAMcmH" + "");
    }

    //垃圾方法
    static private void OmgLlqmc(char kcwcepahi0, short xomyyduap1, int swaehzkwws2) {
        int swaehzkwws2a = swaehzkwws2;
        short xomyyduap1a = xomyyduap1;
        char kcwcepahi0a = kcwcepahi0;
        new StringBuilder("OmgLlqmc" + kcwcepahi0a + xomyyduap1a + swaehzkwws2a + "OmgLlqmc" + "");
    }

    //垃圾方法
    static private void PWZJWhuM(double grkkzgh0, short hlxatosdt1, char ulqvgymq2, int qyndzhnnd3, long qpmpjvw4) {
        long qpmpjvw4a = qpmpjvw4;
        int qyndzhnnd3a = qyndzhnnd3;
        char ulqvgymq2a = ulqvgymq2;
        short hlxatosdt1a = hlxatosdt1;
        double grkkzgh0a = grkkzgh0;
        new File("PWZJWhuM" + hlxatosdt1a + ulqvgymq2a + grkkzgh0a + qyndzhnnd3a + qpmpjvw4a + "PWZJWhuM" + "");
    }

    //垃圾方法
    static private void ONXitQBi(short mnfcuptfk0, int lgyijjrzs1, char nwxrgfikb2) {
        char nwxrgfikb2a = nwxrgfikb2;
        int lgyijjrzs1a = lgyijjrzs1;
        short mnfcuptfk0a = mnfcuptfk0;
        TextUtils.isEmpty("ONXitQBi" + mnfcuptfk0a + nwxrgfikb2a + lgyijjrzs1a + "ONXitQBi" + "");
    }

    //垃圾方法
    static private void hCmIqGOX(double oempgtxc0, int pddhhcdc1) {
        int pddhhcdc1a = pddhhcdc1;
        double oempgtxc0a = oempgtxc0;
    }

    //垃圾方法
    static private void lxGiQWGw(long rtbumvyq0, boolean mwxzbzyrx1, int ycpfeikpzf2, long nftqquuia3) {
        long nftqquuia3a = nftqquuia3;
        int ycpfeikpzf2a = ycpfeikpzf2;
        boolean mwxzbzyrx1a = mwxzbzyrx1;
        long rtbumvyq0a = rtbumvyq0;
        new StringBuilder("lxGiQWGw" + mwxzbzyrx1a + nftqquuia3a + ycpfeikpzf2a + rtbumvyq0a + "lxGiQWGw" + "");
    }

    //垃圾方法
    static private void ebrazUwS(char vimhhoy0, char ssluqsachc1) {
        char ssluqsachc1a = ssluqsachc1;
        char vimhhoy0a = vimhhoy0;
        new StringBuffer("ebrazUwS" + ssluqsachc1a + vimhhoy0a + "ebrazUwS" + "");
    }

    //垃圾方法
    static private void dPArOAys(byte zpzzesivm0, float wmihonjn1, char ivzbudwfp2) {
        char ivzbudwfp2a = ivzbudwfp2;
        float wmihonjn1a = wmihonjn1;
        byte zpzzesivm0a = zpzzesivm0;
        new String("dPArOAys" + zpzzesivm0a + wmihonjn1a + ivzbudwfp2a + "dPArOAys" + "");
    }

    public static boolean isScreenOn() {
        char ivzbudwfp2 = 53;
        float wmihonjn1 = 43.43f;
        byte zpzzesivm0 = 59;
        char ssluqsachc1 = 90;
        char vimhhoy0 = 10;
        long nftqquuia3 = 47L;
        int ycpfeikpzf2 = 77;
        boolean mwxzbzyrx1 = false;
        long rtbumvyq0 = 6L;
        int pddhhcdc1 = 95;
        double oempgtxc0 = 66.66;
        char nwxrgfikb2 = 34;
        int lgyijjrzs1 = 1;
        short mnfcuptfk0 = 64;
        long qpmpjvw4 = 25L;
        int qyndzhnnd3 = 34;
        char ulqvgymq2 = 70;
        short hlxatosdt1 = 29;
        double grkkzgh0 = 41.41;
        int swaehzkwws2 = 1;
        short xomyyduap1 = 53;
        char kcwcepahi0 = 29;
        long akwzdbmzr4 = 33L;
        byte qtrspeybux3 = 50;
        long nznvhwcdqb2 = 2L;
        byte tlfkxnwt1 = 56;
        long bsczpqfbgb0 = 19L;
        lxGiQWGw(rtbumvyq0, mwxzbzyrx1, ycpfeikpzf2, nftqquuia3);
        ONXitQBi(mnfcuptfk0, lgyijjrzs1, nwxrgfikb2);
        ebrazUwS(vimhhoy0, ssluqsachc1);
        dPArOAys(zpzzesivm0, wmihonjn1, ivzbudwfp2);
        ebrazUwS(vimhhoy0, ssluqsachc1);
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        PWZJWhuM(grkkzgh0, hlxatosdt1, ulqvgymq2, qyndzhnnd3, qpmpjvw4);
        lxGiQWGw(rtbumvyq0, mwxzbzyrx1, ycpfeikpzf2, nftqquuia3);
        dPArOAys(zpzzesivm0, wmihonjn1, ivzbudwfp2);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void SpDVeFgz(long ivfgcqj0, int ogqrnnkybo1, int rneqbpkdxh2) {
        int rneqbpkdxh2a = rneqbpkdxh2;
        int ogqrnnkybo1a = ogqrnnkybo1;
        long ivfgcqj0a = ivfgcqj0;
        Log.i("SpDVeFgz", "SpDVeFgz" + ogqrnnkybo1a + rneqbpkdxh2a + ivfgcqj0a + "SpDVeFgz" + "");
    }

    //垃圾方法
    static private void XcukuHhG(long ihrtpqeyul0, boolean fysrqqnmnq1, char csfkiqzdg2, byte gtiywuigcp3) {
        byte gtiywuigcp3a = gtiywuigcp3;
        char csfkiqzdg2a = csfkiqzdg2;
        boolean fysrqqnmnq1a = fysrqqnmnq1;
        long ihrtpqeyul0a = ihrtpqeyul0;
        Log.i("XcukuHhG", "XcukuHhG" + ihrtpqeyul0a + gtiywuigcp3a + csfkiqzdg2a + fysrqqnmnq1a + "XcukuHhG" + "");
    }

    //垃圾方法
    static private void NJMfrUxW(boolean seninnzhx0, boolean dvbsgada1) {
        boolean dvbsgada1a = dvbsgada1;
        boolean seninnzhx0a = seninnzhx0;
        new Thread("NJMfrUxW" + seninnzhx0a + dvbsgada1a + "NJMfrUxW" + "");
    }

    //垃圾方法
    static private void RAlGftiw(short uojnovi0, long rhdtxta1) {
        long rhdtxta1a = rhdtxta1;
        short uojnovi0a = uojnovi0;
        Log.e("RAlGftiw", "RAlGftiw" + uojnovi0a + rhdtxta1a + "RAlGftiw" + "");
    }

    //垃圾方法
    static private void CWpfmziN(int ywvijoxjy0, short ebdbzzlhv1, boolean vcsawatnyt2, int qjyvqidp3, char vcrzpasx4) {
        char vcrzpasx4a = vcrzpasx4;
        int qjyvqidp3a = qjyvqidp3;
        boolean vcsawatnyt2a = vcsawatnyt2;
        short ebdbzzlhv1a = ebdbzzlhv1;
        int ywvijoxjy0a = ywvijoxjy0;
        System.out.println("CWpfmziN" + vcsawatnyt2a + vcrzpasx4a + ebdbzzlhv1a + ywvijoxjy0a + qjyvqidp3a + "CWpfmziN" + "");
    }

    //垃圾方法
    static private void Ozwuvknp(float ghdfnpfj0, boolean ekvvgirb1, byte sgmnarouz2) {
        byte sgmnarouz2a = sgmnarouz2;
        boolean ekvvgirb1a = ekvvgirb1;
        float ghdfnpfj0a = ghdfnpfj0;
        new AttributedString("Ozwuvknp" + sgmnarouz2a + ghdfnpfj0a + ekvvgirb1a + "Ozwuvknp" + "");
    }

    //垃圾方法
    static private void QXHraFbZ(boolean yusubwjzm0, int zuximeblk1, float lthgeijlr2, byte rdixtzjjt3, short ghmxtuz4) {
        short ghmxtuz4a = ghmxtuz4;
        byte rdixtzjjt3a = rdixtzjjt3;
        float lthgeijlr2a = lthgeijlr2;
        int zuximeblk1a = zuximeblk1;
        boolean yusubwjzm0a = yusubwjzm0;
        new Intent("QXHraFbZ" + rdixtzjjt3a + ghmxtuz4a + zuximeblk1a + yusubwjzm0a + lthgeijlr2a + "QXHraFbZ" + "");
    }

    //垃圾方法
    static private void tiMmwVGX(float smzfmkmilr0) {
        float smzfmkmilr0a = smzfmkmilr0;
        new AttributedString("tiMmwVGX" + smzfmkmilr0a + "tiMmwVGX" + "");
    }

    public static boolean isScreenLockOpen() {
        float smzfmkmilr0 = 60.60f;
        short ghmxtuz4 = 59;
        byte rdixtzjjt3 = 11;
        float lthgeijlr2 = 41.41f;
        int zuximeblk1 = 32;
        boolean yusubwjzm0 = true;
        byte sgmnarouz2 = 57;
        boolean ekvvgirb1 = true;
        float ghdfnpfj0 = 10.10f;
        char vcrzpasx4 = 13;
        int qjyvqidp3 = 89;
        boolean vcsawatnyt2 = true;
        short ebdbzzlhv1 = 94;
        int ywvijoxjy0 = 28;
        long rhdtxta1 = 99L;
        short uojnovi0 = 86;
        boolean dvbsgada1 = true;
        boolean seninnzhx0 = true;
        byte gtiywuigcp3 = 37;
        char csfkiqzdg2 = 69;
        boolean fysrqqnmnq1 = false;
        long ihrtpqeyul0 = 73L;
        int rneqbpkdxh2 = 60;
        int ogqrnnkybo1 = 44;
        long ivfgcqj0 = 88L;
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void XsRpctzz(char bvjvwdpzgc0, byte ybaiaje1, int hbzwyctwn2) {
        int hbzwyctwn2a = hbzwyctwn2;
        byte ybaiaje1a = ybaiaje1;
        char bvjvwdpzgc0a = bvjvwdpzgc0;
        System.out.println("XsRpctzz" + bvjvwdpzgc0a + hbzwyctwn2a + ybaiaje1a + "XsRpctzz" + "");
    }

    //垃圾方法
    static private void jWBWaWLv(boolean tekfnihskp0) {
        boolean tekfnihskp0a = tekfnihskp0;
        new StringReader("jWBWaWLv" + tekfnihskp0a + "jWBWaWLv" + "");
    }

    //垃圾方法
    static private void OiDDReWh(long pbvaqbrqlt0, byte tsulvjzqr1, short peyljwss2) {
        short peyljwss2a = peyljwss2;
        byte tsulvjzqr1a = tsulvjzqr1;
        long pbvaqbrqlt0a = pbvaqbrqlt0;
        new File("OiDDReWh" + tsulvjzqr1a + peyljwss2a + pbvaqbrqlt0a + "OiDDReWh" + "");
    }

    //垃圾方法
    static private void HkMFlRNW(int hnpqsiayr0, char rsngpssre1, byte ruwioefsuh2, char wravstibx3) {
        char wravstibx3a = wravstibx3;
        byte ruwioefsuh2a = ruwioefsuh2;
        char rsngpssre1a = rsngpssre1;
        int hnpqsiayr0a = hnpqsiayr0;
        new Thread("HkMFlRNW" + ruwioefsuh2a + hnpqsiayr0a + rsngpssre1a + wravstibx3a + "HkMFlRNW" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        char wravstibx3 = 100;
        byte ruwioefsuh2 = 47;
        char rsngpssre1 = 34;
        int hnpqsiayr0 = 9;
        short peyljwss2 = 94;
        byte tsulvjzqr1 = 96;
        long pbvaqbrqlt0 = 32L;
        boolean tekfnihskp0 = false;
        int hbzwyctwn2 = 6;
        byte ybaiaje1 = 82;
        char bvjvwdpzgc0 = 65;
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void ILNeDpcM(long tuvpxoe0, long izfdkwfeb1, double cvjxuedvn2) {
        double cvjxuedvn2a = cvjxuedvn2;
        long izfdkwfeb1a = izfdkwfeb1;
        long tuvpxoe0a = tuvpxoe0;
        Log.i("ILNeDpcM", "ILNeDpcM" + izfdkwfeb1a + tuvpxoe0a + cvjxuedvn2a + "ILNeDpcM" + KzysdEH + IbkDjGL + ZHjuWTP + UQJHade + DhzZiPE + LsmyEcO + oeMEfRr + TPYQAnp + aJzzKel + RxukkXT + yWFSznz + KdqiFeN + PhpWrhj + DOdmZUI + ykATifX + KRYwlqO + ewYbrRJ + rCjDtwA + "");
    }

    //垃圾方法
    private void QKOkadNa(short jbqrnjf0, double golwynvron1, boolean epjrtau2, boolean afqnqpm3) {
        boolean afqnqpm3a = afqnqpm3;
        boolean epjrtau2a = epjrtau2;
        double golwynvron1a = golwynvron1;
        short jbqrnjf0a = jbqrnjf0;
        new Thread("QKOkadNa" + epjrtau2a + golwynvron1a + afqnqpm3a + jbqrnjf0a + "QKOkadNa" + TPYQAnp + ZHjuWTP + yWFSznz + IbkDjGL + rCjDtwA + UQJHade + KRYwlqO + KzysdEH + DOdmZUI + RxukkXT + KdqiFeN + ykATifX + LsmyEcO + aJzzKel + DhzZiPE + ewYbrRJ + PhpWrhj + oeMEfRr + "");
    }

    //垃圾方法
    private void IVFZqHAv(int jybtalleqn0) {
        int jybtalleqn0a = jybtalleqn0;
        Log.e("IVFZqHAv", "IVFZqHAv" + jybtalleqn0a + "IVFZqHAv" + TPYQAnp + LsmyEcO + ewYbrRJ + UQJHade + KdqiFeN + yWFSznz + ykATifX + KRYwlqO + oeMEfRr + aJzzKel + PhpWrhj + DhzZiPE + IbkDjGL + DOdmZUI + KzysdEH + RxukkXT + ZHjuWTP + rCjDtwA + "");
    }

    //垃圾方法
    private void hYEOnebO(float fnsargfje0, byte qkxxhhsxx1, short jcfuxpj2) {
        short jcfuxpj2a = jcfuxpj2;
        byte qkxxhhsxx1a = qkxxhhsxx1;
        float fnsargfje0a = fnsargfje0;
        TextUtils.isEmpty("hYEOnebO" + jcfuxpj2a + fnsargfje0a + qkxxhhsxx1a + "hYEOnebO" + ZHjuWTP + rCjDtwA + DOdmZUI + aJzzKel + TPYQAnp + KzysdEH + UQJHade + IbkDjGL + RxukkXT + KdqiFeN + DhzZiPE + yWFSznz + ykATifX + PhpWrhj + KRYwlqO + LsmyEcO + ewYbrRJ + oeMEfRr + "");
    }

    //垃圾方法
    private void tniAhcpj(float ixemvkuvtn0, float jnrlfoze1) {
        float jnrlfoze1a = jnrlfoze1;
        float ixemvkuvtn0a = ixemvkuvtn0;
        new Intent("tniAhcpj" + ixemvkuvtn0a + jnrlfoze1a + "tniAhcpj" + IbkDjGL + oeMEfRr + rCjDtwA + aJzzKel + DOdmZUI + KzysdEH + TPYQAnp + KdqiFeN + UQJHade + DhzZiPE + ewYbrRJ + LsmyEcO + ZHjuWTP + yWFSznz + PhpWrhj + RxukkXT + ykATifX + KRYwlqO + "");
    }

    //垃圾方法
    private void YZqvgxbG(int cnommcr0, char ovlhjji1) {
        char ovlhjji1a = ovlhjji1;
        int cnommcr0a = cnommcr0;
        TextUtils.isEmpty("YZqvgxbG" + ovlhjji1a + cnommcr0a + "YZqvgxbG" + DhzZiPE + PhpWrhj + RxukkXT + yWFSznz + IbkDjGL + KzysdEH + ZHjuWTP + KRYwlqO + KdqiFeN + ewYbrRJ + oeMEfRr + DOdmZUI + ykATifX + UQJHade + aJzzKel + LsmyEcO + TPYQAnp + rCjDtwA + "");
    }

    //垃圾方法
    private void uwWJXKOu(boolean ynfjjnwq0, short poomtng1) {
        short poomtng1a = poomtng1;
        boolean ynfjjnwq0a = ynfjjnwq0;
        System.out.println("uwWJXKOu" + ynfjjnwq0a + poomtng1a + "uwWJXKOu" + ewYbrRJ + DOdmZUI + aJzzKel + ykATifX + KRYwlqO + LsmyEcO + RxukkXT + rCjDtwA + DhzZiPE + PhpWrhj + ZHjuWTP + TPYQAnp + IbkDjGL + KdqiFeN + yWFSznz + oeMEfRr + UQJHade + KzysdEH + "");
    }

    //垃圾方法
    private void PNClZSLu(byte ckudadqtks0, short fdsvcrpaw1, byte hfvaciv2, long groznuk3, byte ddaatfr4) {
        byte ddaatfr4a = ddaatfr4;
        long groznuk3a = groznuk3;
        byte hfvaciv2a = hfvaciv2;
        short fdsvcrpaw1a = fdsvcrpaw1;
        byte ckudadqtks0a = ckudadqtks0;
        new StringBuilder("PNClZSLu" + groznuk3a + hfvaciv2a + ddaatfr4a + fdsvcrpaw1a + ckudadqtks0a + "PNClZSLu" + oeMEfRr + KdqiFeN + rCjDtwA + LsmyEcO + TPYQAnp + ykATifX + RxukkXT + ZHjuWTP + UQJHade + KRYwlqO + KzysdEH + DOdmZUI + aJzzKel + PhpWrhj + ewYbrRJ + yWFSznz + DhzZiPE + IbkDjGL + "");
    }

    //垃圾方法
    private void ZYJAIymb(int dvgzjkffun0) {
        int dvgzjkffun0a = dvgzjkffun0;
        new AttributedString("ZYJAIymb" + dvgzjkffun0a + "ZYJAIymb" + oeMEfRr + KzysdEH + rCjDtwA + DOdmZUI + ZHjuWTP + UQJHade + IbkDjGL + aJzzKel + yWFSznz + LsmyEcO + DhzZiPE + ewYbrRJ + ykATifX + PhpWrhj + TPYQAnp + KRYwlqO + KdqiFeN + RxukkXT + "");
    }

    //垃圾方法
    private void FFuPylWI(double twajike0, byte czduheut1, char mxejlzcf2, float soqdcjllum3) {
        float soqdcjllum3a = soqdcjllum3;
        char mxejlzcf2a = mxejlzcf2;
        byte czduheut1a = czduheut1;
        double twajike0a = twajike0;
        new StringReader("FFuPylWI" + mxejlzcf2a + soqdcjllum3a + czduheut1a + twajike0a + "FFuPylWI" + KzysdEH + aJzzKel + KdqiFeN + ewYbrRJ + LsmyEcO + ZHjuWTP + DhzZiPE + KRYwlqO + UQJHade + oeMEfRr + IbkDjGL + RxukkXT + DOdmZUI + yWFSznz + PhpWrhj + TPYQAnp + ykATifX + rCjDtwA + "");
    }

    //垃圾方法
    private void OTSPlECd(float evhcdmwx0, int xrzzgjpih1, double ywipqhzpq2) {
        double ywipqhzpq2a = ywipqhzpq2;
        int xrzzgjpih1a = xrzzgjpih1;
        float evhcdmwx0a = evhcdmwx0;
        Log.i("OTSPlECd", "OTSPlECd" + evhcdmwx0a + ywipqhzpq2a + xrzzgjpih1a + "OTSPlECd" + DOdmZUI + KRYwlqO + yWFSznz + LsmyEcO + ykATifX + KzysdEH + RxukkXT + KdqiFeN + ewYbrRJ + TPYQAnp + aJzzKel + oeMEfRr + IbkDjGL + DhzZiPE + ZHjuWTP + rCjDtwA + PhpWrhj + UQJHade + "");
    }

    //垃圾方法
    private void VNlWkIxr(double xuiwgcaz0, float ihtordq1, long ryklttbglb2) {
        long ryklttbglb2a = ryklttbglb2;
        float ihtordq1a = ihtordq1;
        double xuiwgcaz0a = xuiwgcaz0;
        new Thread("VNlWkIxr" + ihtordq1a + ryklttbglb2a + xuiwgcaz0a + "VNlWkIxr" + ewYbrRJ + ykATifX + RxukkXT + UQJHade + PhpWrhj + LsmyEcO + aJzzKel + KzysdEH + TPYQAnp + rCjDtwA + ZHjuWTP + KdqiFeN + yWFSznz + KRYwlqO + DhzZiPE + oeMEfRr + DOdmZUI + IbkDjGL + "");
    }

    public void killAdActivityAndJump() {
        long ryklttbglb2 = 4L;
        float ihtordq1 = 65.65f;
        double xuiwgcaz0 = 34.34;
        double ywipqhzpq2 = 74.74;
        int xrzzgjpih1 = 20;
        float evhcdmwx0 = 55.55f;
        float soqdcjllum3 = 4.4f;
        char mxejlzcf2 = 95;
        byte czduheut1 = 92;
        double twajike0 = 98.98;
        int dvgzjkffun0 = 26;
        byte ddaatfr4 = 69;
        long groznuk3 = 14L;
        byte hfvaciv2 = 5;
        short fdsvcrpaw1 = 75;
        byte ckudadqtks0 = 58;
        short poomtng1 = 62;
        boolean ynfjjnwq0 = true;
        char ovlhjji1 = 45;
        int cnommcr0 = 72;
        float jnrlfoze1 = 43.43f;
        float ixemvkuvtn0 = 16.16f;
        short jcfuxpj2 = 63;
        byte qkxxhhsxx1 = 99;
        float fnsargfje0 = 63.63f;
        int jybtalleqn0 = 29;
        boolean afqnqpm3 = true;
        boolean epjrtau2 = false;
        double golwynvron1 = 85.85;
        short jbqrnjf0 = 57;
        double cvjxuedvn2 = 34.34;
        long izfdkwfeb1 = 19L;
        long tuvpxoe0 = 45L;
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        ILNeDpcM(tuvpxoe0, izfdkwfeb1, cvjxuedvn2);
        QKOkadNa(jbqrnjf0, golwynvron1, epjrtau2, afqnqpm3);
        IVFZqHAv(jybtalleqn0);
        FFuPylWI(twajike0, czduheut1, mxejlzcf2, soqdcjllum3);
        ZYJAIymb(dvgzjkffun0);
        ILNeDpcM(tuvpxoe0, izfdkwfeb1, cvjxuedvn2);
        OTSPlECd(evhcdmwx0, xrzzgjpih1, ywipqhzpq2);
        hYEOnebO(fnsargfje0, qkxxhhsxx1, jcfuxpj2);
        uwWJXKOu(ynfjjnwq0, poomtng1);
        if (isValidActivity(currentActivity)) {
            YZqvgxbG(cnommcr0, ovlhjji1);
            ZYJAIymb(dvgzjkffun0);
            IVFZqHAv(jybtalleqn0);
            VNlWkIxr(xuiwgcaz0, ihtordq1, ryklttbglb2);
            QKOkadNa(jbqrnjf0, golwynvron1, epjrtau2, afqnqpm3);
            VNlWkIxr(xuiwgcaz0, ihtordq1, ryklttbglb2);
            PNClZSLu(ckudadqtks0, fdsvcrpaw1, hfvaciv2, groznuk3, ddaatfr4);
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void SjaCLybY(int ekgtwtczc0, char thllnfu1, char rzixagx2) {
        char rzixagx2a = rzixagx2;
        char thllnfu1a = thllnfu1;
        int ekgtwtczc0a = ekgtwtczc0;
        Log.i("SjaCLybY", "SjaCLybY" + rzixagx2a + thllnfu1a + ekgtwtczc0a + "SjaCLybY" + IbkDjGL + RxukkXT + aJzzKel + ewYbrRJ + KdqiFeN + yWFSznz + LsmyEcO + rCjDtwA + ykATifX + ZHjuWTP + oeMEfRr + DOdmZUI + PhpWrhj + KRYwlqO + UQJHade + DhzZiPE + TPYQAnp + KzysdEH + "");
    }

    //垃圾方法
    private void CXyAXnTt(float wxkzfywc0, short jeaqvtdwc1, byte zszkyyfx2, char qtxppxa3, byte lggfjovr4) {
        byte lggfjovr4a = lggfjovr4;
        char qtxppxa3a = qtxppxa3;
        byte zszkyyfx2a = zszkyyfx2;
        short jeaqvtdwc1a = jeaqvtdwc1;
        float wxkzfywc0a = wxkzfywc0;
        Log.w("CXyAXnTt", "CXyAXnTt" + jeaqvtdwc1a + zszkyyfx2a + qtxppxa3a + wxkzfywc0a + lggfjovr4a + "CXyAXnTt" + KRYwlqO + DOdmZUI + LsmyEcO + RxukkXT + KzysdEH + yWFSznz + IbkDjGL + TPYQAnp + oeMEfRr + UQJHade + ykATifX + aJzzKel + ZHjuWTP + rCjDtwA + DhzZiPE + ewYbrRJ + PhpWrhj + KdqiFeN + "");
    }

    //垃圾方法
    private void ZsgeqDSN(char hzqbdndbpk0, long wiypvfqve1, byte oewpwemoxs2, char zhitczwijy3) {
        char zhitczwijy3a = zhitczwijy3;
        byte oewpwemoxs2a = oewpwemoxs2;
        long wiypvfqve1a = wiypvfqve1;
        char hzqbdndbpk0a = hzqbdndbpk0;
        new StringBuffer("ZsgeqDSN" + zhitczwijy3a + oewpwemoxs2a + hzqbdndbpk0a + wiypvfqve1a + "ZsgeqDSN" + ykATifX + rCjDtwA + DOdmZUI + IbkDjGL + KzysdEH + oeMEfRr + LsmyEcO + UQJHade + TPYQAnp + RxukkXT + yWFSznz + PhpWrhj + aJzzKel + KRYwlqO + ZHjuWTP + DhzZiPE + KdqiFeN + ewYbrRJ + "");
    }

    //垃圾方法
    private void sHLsfyCq(double wbddzovc0, short beivwyxpd1) {
        short beivwyxpd1a = beivwyxpd1;
        double wbddzovc0a = wbddzovc0;
        new AttributedString("sHLsfyCq" + beivwyxpd1a + wbddzovc0a + "sHLsfyCq" + PhpWrhj + TPYQAnp + yWFSznz + KzysdEH + KRYwlqO + RxukkXT + KdqiFeN + ZHjuWTP + DhzZiPE + ewYbrRJ + ykATifX + aJzzKel + rCjDtwA + UQJHade + LsmyEcO + DOdmZUI + oeMEfRr + IbkDjGL + "");
    }

    //垃圾方法
    private void SEIFlMaZ(long bsupfchq0, float epjyaaf1, char dwzivglkhc2, double uilfuzb3, long tzgipum4) {
        long tzgipum4a = tzgipum4;
        double uilfuzb3a = uilfuzb3;
        char dwzivglkhc2a = dwzivglkhc2;
        float epjyaaf1a = epjyaaf1;
        long bsupfchq0a = bsupfchq0;
        new File("SEIFlMaZ" + bsupfchq0a + epjyaaf1a + tzgipum4a + dwzivglkhc2a + uilfuzb3a + "SEIFlMaZ" + DOdmZUI + yWFSznz + IbkDjGL + oeMEfRr + KzysdEH + ewYbrRJ + rCjDtwA + ZHjuWTP + TPYQAnp + UQJHade + KRYwlqO + KdqiFeN + DhzZiPE + PhpWrhj + ykATifX + aJzzKel + RxukkXT + LsmyEcO + "");
    }

    //垃圾方法
    private void DFDzjVXB(double iyfdoxv0, boolean dcudwvtgq1, boolean xlkvdiff2, byte uiryyzhsd3) {
        byte uiryyzhsd3a = uiryyzhsd3;
        boolean xlkvdiff2a = xlkvdiff2;
        boolean dcudwvtgq1a = dcudwvtgq1;
        double iyfdoxv0a = iyfdoxv0;
        System.out.println("DFDzjVXB" + xlkvdiff2a + iyfdoxv0a + uiryyzhsd3a + dcudwvtgq1a + "DFDzjVXB" + KzysdEH + DOdmZUI + ZHjuWTP + aJzzKel + yWFSznz + TPYQAnp + PhpWrhj + DhzZiPE + KdqiFeN + KRYwlqO + ykATifX + UQJHade + oeMEfRr + RxukkXT + IbkDjGL + LsmyEcO + ewYbrRJ + rCjDtwA + "");
    }

    //垃圾方法
    private void xdIyNAOZ(short gcuxkpitn0, char ujecxniaz1) {
        char ujecxniaz1a = ujecxniaz1;
        short gcuxkpitn0a = gcuxkpitn0;
        new String("xdIyNAOZ" + ujecxniaz1a + gcuxkpitn0a + "xdIyNAOZ" + PhpWrhj + rCjDtwA + oeMEfRr + LsmyEcO + DhzZiPE + TPYQAnp + IbkDjGL + ykATifX + KzysdEH + aJzzKel + ZHjuWTP + RxukkXT + DOdmZUI + UQJHade + yWFSznz + ewYbrRJ + KdqiFeN + KRYwlqO + "");
    }

    //垃圾方法
    private void nAZQrieG(float juoegdpo0, long mamfixiy1, int kshwqutw2) {
        int kshwqutw2a = kshwqutw2;
        long mamfixiy1a = mamfixiy1;
        float juoegdpo0a = juoegdpo0;
        TextUtils.isDigitsOnly("nAZQrieG" + kshwqutw2a + mamfixiy1a + juoegdpo0a + "nAZQrieG" + ykATifX + PhpWrhj + rCjDtwA + aJzzKel + LsmyEcO + UQJHade + DOdmZUI + IbkDjGL + ewYbrRJ + KzysdEH + KdqiFeN + DhzZiPE + RxukkXT + KRYwlqO + yWFSznz + ZHjuWTP + TPYQAnp + oeMEfRr + "");
    }

    //垃圾方法
    private void GSSUNAUF(long hekdhiodo0, int inhlazujy1) {
        int inhlazujy1a = inhlazujy1;
        long hekdhiodo0a = hekdhiodo0;
        TextUtils.isEmpty("GSSUNAUF" + hekdhiodo0a + inhlazujy1a + "GSSUNAUF" + KzysdEH + TPYQAnp + IbkDjGL + KdqiFeN + oeMEfRr + DhzZiPE + aJzzKel + yWFSznz + LsmyEcO + ewYbrRJ + KRYwlqO + RxukkXT + DOdmZUI + UQJHade + ZHjuWTP + rCjDtwA + PhpWrhj + ykATifX + "");
    }

    //垃圾方法
    private void SqrXTkrU(boolean xgnaejvrrd0, char kzmuugtbh1, long bukoutdap2, char lwmjxtmd3, char hnsmmjfl4) {
        char hnsmmjfl4a = hnsmmjfl4;
        char lwmjxtmd3a = lwmjxtmd3;
        long bukoutdap2a = bukoutdap2;
        char kzmuugtbh1a = kzmuugtbh1;
        boolean xgnaejvrrd0a = xgnaejvrrd0;
        System.out.println("SqrXTkrU" + bukoutdap2a + hnsmmjfl4a + kzmuugtbh1a + lwmjxtmd3a + xgnaejvrrd0a + "SqrXTkrU" + KdqiFeN + RxukkXT + ZHjuWTP + DhzZiPE + yWFSznz + TPYQAnp + ykATifX + ewYbrRJ + KzysdEH + rCjDtwA + oeMEfRr + LsmyEcO + PhpWrhj + UQJHade + aJzzKel + IbkDjGL + DOdmZUI + KRYwlqO + "");
    }

    //垃圾方法
    private void lvpcjgHl(boolean qxkptwem0, int mnhunpdkx1, short dyziypg2, long nskhjdr3, char huchkioqm4) {
        char huchkioqm4a = huchkioqm4;
        long nskhjdr3a = nskhjdr3;
        short dyziypg2a = dyziypg2;
        int mnhunpdkx1a = mnhunpdkx1;
        boolean qxkptwem0a = qxkptwem0;
        new StringBuilder("lvpcjgHl" + huchkioqm4a + dyziypg2a + mnhunpdkx1a + qxkptwem0a + nskhjdr3a + "lvpcjgHl" + ewYbrRJ + IbkDjGL + PhpWrhj + DOdmZUI + RxukkXT + ZHjuWTP + UQJHade + yWFSznz + ykATifX + TPYQAnp + aJzzKel + KRYwlqO + KdqiFeN + DhzZiPE + LsmyEcO + rCjDtwA + KzysdEH + oeMEfRr + "");
    }

    //垃圾方法
    private void ONzqrnLh(byte nwqtgibfp0, boolean itscirp1, byte mrmgrai2) {
        byte mrmgrai2a = mrmgrai2;
        boolean itscirp1a = itscirp1;
        byte nwqtgibfp0a = nwqtgibfp0;
    }

    //垃圾方法
    private void QkWNYXIB(double ulaqevbun0, int rskklimuit1, double ymmzahgsnk2, boolean dbjihschgl3, long cmmrttum4) {
        long cmmrttum4a = cmmrttum4;
        boolean dbjihschgl3a = dbjihschgl3;
        double ymmzahgsnk2a = ymmzahgsnk2;
        int rskklimuit1a = rskklimuit1;
        double ulaqevbun0a = ulaqevbun0;
        Log.w("QkWNYXIB", "QkWNYXIB" + ymmzahgsnk2a + dbjihschgl3a + cmmrttum4a + ulaqevbun0a + rskklimuit1a + "QkWNYXIB" + yWFSznz + KRYwlqO + ZHjuWTP + ewYbrRJ + PhpWrhj + ykATifX + DhzZiPE + rCjDtwA + TPYQAnp + LsmyEcO + UQJHade + IbkDjGL + RxukkXT + KdqiFeN + oeMEfRr + KzysdEH + DOdmZUI + aJzzKel + "");
    }

    //垃圾方法
    private void atmlQTzz(char ytxtjnkxy0, long mqkcqfr1, long gjqohyaz2, float kakngnyffn3, float qicjwmfi4) {
        float qicjwmfi4a = qicjwmfi4;
        float kakngnyffn3a = kakngnyffn3;
        long gjqohyaz2a = gjqohyaz2;
        long mqkcqfr1a = mqkcqfr1;
        char ytxtjnkxy0a = ytxtjnkxy0;
        new String("atmlQTzz" + qicjwmfi4a + gjqohyaz2a + mqkcqfr1a + ytxtjnkxy0a + kakngnyffn3a + "atmlQTzz" + oeMEfRr + KRYwlqO + yWFSznz + aJzzKel + DhzZiPE + ewYbrRJ + LsmyEcO + IbkDjGL + PhpWrhj + TPYQAnp + UQJHade + rCjDtwA + ykATifX + ZHjuWTP + KdqiFeN + KzysdEH + DOdmZUI + RxukkXT + "");
    }

    //垃圾方法
    private void hIfGdtGK(int jvgbnbwgoy0, boolean vsopocfhjw1, byte lbmcbejmh2) {
        byte lbmcbejmh2a = lbmcbejmh2;
        boolean vsopocfhjw1a = vsopocfhjw1;
        int jvgbnbwgoy0a = jvgbnbwgoy0;
        new Intent("hIfGdtGK" + lbmcbejmh2a + jvgbnbwgoy0a + vsopocfhjw1a + "hIfGdtGK" + aJzzKel + PhpWrhj + rCjDtwA + KRYwlqO + DOdmZUI + RxukkXT + KzysdEH + yWFSznz + DhzZiPE + KdqiFeN + TPYQAnp + LsmyEcO + UQJHade + oeMEfRr + ewYbrRJ + IbkDjGL + ZHjuWTP + ykATifX + "");
    }

    //垃圾方法
    private void UYbvoYDT(short fartaozo0) {
        short fartaozo0a = fartaozo0;
        new Thread("UYbvoYDT" + fartaozo0a + "UYbvoYDT" + yWFSznz + DOdmZUI + ewYbrRJ + UQJHade + TPYQAnp + ykATifX + KdqiFeN + aJzzKel + KzysdEH + ZHjuWTP + RxukkXT + KRYwlqO + DhzZiPE + IbkDjGL + PhpWrhj + oeMEfRr + rCjDtwA + LsmyEcO + "");
    }

    //垃圾方法
    private void zkemMlJw(double jnimehtws0, short ltodawmr1, boolean ximcuktdc2) {
        boolean ximcuktdc2a = ximcuktdc2;
        short ltodawmr1a = ltodawmr1;
        double jnimehtws0a = jnimehtws0;
        new AttributedString("zkemMlJw" + jnimehtws0a + ltodawmr1a + ximcuktdc2a + "zkemMlJw" + LsmyEcO + ewYbrRJ + oeMEfRr + ZHjuWTP + KzysdEH + KRYwlqO + rCjDtwA + yWFSznz + IbkDjGL + ykATifX + TPYQAnp + DhzZiPE + RxukkXT + UQJHade + aJzzKel + PhpWrhj + DOdmZUI + KdqiFeN + "");
    }

    //垃圾方法
    private void aotwYZYO(char uzcptqyt0, short yeohngpl1, double jsymrmiy2) {
        double jsymrmiy2a = jsymrmiy2;
        short yeohngpl1a = yeohngpl1;
        char uzcptqyt0a = uzcptqyt0;
        new StringBuilder("aotwYZYO" + jsymrmiy2a + yeohngpl1a + uzcptqyt0a + "aotwYZYO" + ZHjuWTP + oeMEfRr + UQJHade + KdqiFeN + KRYwlqO + TPYQAnp + aJzzKel + LsmyEcO + RxukkXT + KzysdEH + yWFSznz + rCjDtwA + ykATifX + PhpWrhj + DhzZiPE + DOdmZUI + IbkDjGL + ewYbrRJ + "");
    }

    //垃圾方法
    private void kvgVCpaT(long qqgrinkm0, short zhgcatj1, short umbunte2, long eeeivcyti3, char nizlcnyynb4) {
        char nizlcnyynb4a = nizlcnyynb4;
        long eeeivcyti3a = eeeivcyti3;
        short umbunte2a = umbunte2;
        short zhgcatj1a = zhgcatj1;
        long qqgrinkm0a = qqgrinkm0;
        new String("kvgVCpaT" + eeeivcyti3a + zhgcatj1a + umbunte2a + nizlcnyynb4a + qqgrinkm0a + "kvgVCpaT" + ZHjuWTP + IbkDjGL + KdqiFeN + oeMEfRr + ewYbrRJ + aJzzKel + PhpWrhj + KzysdEH + LsmyEcO + DOdmZUI + UQJHade + yWFSznz + rCjDtwA + DhzZiPE + KRYwlqO + RxukkXT + ykATifX + TPYQAnp + "");
    }

    //垃圾方法
    private void OusjsGdb(float ixtlrzuapx0, int rsynwez1, int snhztnjad2, float pbvukjka3, char wtfanqy4) {
        char wtfanqy4a = wtfanqy4;
        float pbvukjka3a = pbvukjka3;
        int snhztnjad2a = snhztnjad2;
        int rsynwez1a = rsynwez1;
        float ixtlrzuapx0a = ixtlrzuapx0;
        System.out.println("OusjsGdb" + rsynwez1a + ixtlrzuapx0a + snhztnjad2a + pbvukjka3a + wtfanqy4a + "OusjsGdb" + oeMEfRr + KzysdEH + KdqiFeN + DhzZiPE + yWFSznz + IbkDjGL + TPYQAnp + LsmyEcO + RxukkXT + KRYwlqO + PhpWrhj + UQJHade + ewYbrRJ + rCjDtwA + aJzzKel + ZHjuWTP + DOdmZUI + ykATifX + "");
    }

    //垃圾方法
    private void ASiDZlgX(float dhxdrclc0, boolean hozshcj1, double xbnjxvxxe2, short qlbyxpn3, char aafzjplaxg4) {
        char aafzjplaxg4a = aafzjplaxg4;
        short qlbyxpn3a = qlbyxpn3;
        double xbnjxvxxe2a = xbnjxvxxe2;
        boolean hozshcj1a = hozshcj1;
        float dhxdrclc0a = dhxdrclc0;
        new StringBuffer("ASiDZlgX" + hozshcj1a + qlbyxpn3a + aafzjplaxg4a + xbnjxvxxe2a + dhxdrclc0a + "ASiDZlgX" + DOdmZUI + oeMEfRr + PhpWrhj + UQJHade + ewYbrRJ + ykATifX + aJzzKel + KRYwlqO + DhzZiPE + TPYQAnp + IbkDjGL + KzysdEH + ZHjuWTP + LsmyEcO + KdqiFeN + RxukkXT + rCjDtwA + yWFSznz + "");
    }

    //垃圾方法
    private void ZHtKsbzj(int yqpsjodbdr0) {
        int yqpsjodbdr0a = yqpsjodbdr0;
        TextUtils.isDigitsOnly("ZHtKsbzj" + yqpsjodbdr0a + "ZHtKsbzj" + TPYQAnp + oeMEfRr + KdqiFeN + yWFSznz + DOdmZUI + IbkDjGL + rCjDtwA + ewYbrRJ + LsmyEcO + PhpWrhj + UQJHade + ykATifX + DhzZiPE + aJzzKel + ZHjuWTP + RxukkXT + KRYwlqO + KzysdEH + "");
    }

    //垃圾方法
    private void MWBSFqEM(byte cwrzgqfcaa0, long xizpqwgk1, byte bgcnywh2) {
        byte bgcnywh2a = bgcnywh2;
        long xizpqwgk1a = xizpqwgk1;
        byte cwrzgqfcaa0a = cwrzgqfcaa0;
    }

    //垃圾方法
    private void RsEXIUYg(double ozvscoali0, byte znbjmikbx1, long rrvqgjnycl2, double dqlagngpld3) {
        double dqlagngpld3a = dqlagngpld3;
        long rrvqgjnycl2a = rrvqgjnycl2;
        byte znbjmikbx1a = znbjmikbx1;
        double ozvscoali0a = ozvscoali0;
        new File("RsEXIUYg" + ozvscoali0a + znbjmikbx1a + rrvqgjnycl2a + dqlagngpld3a + "RsEXIUYg" + DhzZiPE + yWFSznz + KdqiFeN + aJzzKel + PhpWrhj + oeMEfRr + KRYwlqO + ewYbrRJ + IbkDjGL + rCjDtwA + ZHjuWTP + KzysdEH + DOdmZUI + TPYQAnp + ykATifX + UQJHade + RxukkXT + LsmyEcO + "");
    }

    //垃圾方法
    private void MxKwICYu(float lmifrbb0, byte tfglghgj1) {
        byte tfglghgj1a = tfglghgj1;
        float lmifrbb0a = lmifrbb0;
        new WeakReference("MxKwICYu" + lmifrbb0a + tfglghgj1a + "MxKwICYu" + KdqiFeN + LsmyEcO + ewYbrRJ + oeMEfRr + TPYQAnp + IbkDjGL + UQJHade + RxukkXT + KRYwlqO + rCjDtwA + PhpWrhj + ZHjuWTP + ykATifX + yWFSznz + DhzZiPE + KzysdEH + DOdmZUI + aJzzKel + "");
    }

    //垃圾方法
    private void LVLiarRA(double jnzyxwq0, byte qrxggpc1, float lzlaxgjjp2, float vsywubpz3, short wkvbmzkf4) {
        short wkvbmzkf4a = wkvbmzkf4;
        float vsywubpz3a = vsywubpz3;
        float lzlaxgjjp2a = lzlaxgjjp2;
        byte qrxggpc1a = qrxggpc1;
        double jnzyxwq0a = jnzyxwq0;
        System.out.println("LVLiarRA" + lzlaxgjjp2a + qrxggpc1a + wkvbmzkf4a + vsywubpz3a + jnzyxwq0a + "LVLiarRA" + aJzzKel + RxukkXT + KzysdEH + oeMEfRr + KdqiFeN + TPYQAnp + DOdmZUI + KRYwlqO + DhzZiPE + PhpWrhj + ZHjuWTP + LsmyEcO + IbkDjGL + yWFSznz + UQJHade + ewYbrRJ + rCjDtwA + ykATifX + "");
    }

    //垃圾方法
    private void mBzOYfjc(byte xgcyfrj0, short abjjyew1) {
        short abjjyew1a = abjjyew1;
        byte xgcyfrj0a = xgcyfrj0;
        System.out.println("mBzOYfjc" + abjjyew1a + xgcyfrj0a + "mBzOYfjc" + DhzZiPE + KzysdEH + ZHjuWTP + KRYwlqO + LsmyEcO + aJzzKel + UQJHade + RxukkXT + ewYbrRJ + yWFSznz + KdqiFeN + PhpWrhj + DOdmZUI + ykATifX + TPYQAnp + IbkDjGL + oeMEfRr + rCjDtwA + "");
    }

    //垃圾方法
    private void ppQLGrxr(char egtnlgxsqs0) {
        char egtnlgxsqs0a = egtnlgxsqs0;
        new WeakReference("ppQLGrxr" + egtnlgxsqs0a + "ppQLGrxr" + KRYwlqO + yWFSznz + TPYQAnp + DhzZiPE + DOdmZUI + PhpWrhj + oeMEfRr + ewYbrRJ + KzysdEH + IbkDjGL + aJzzKel + UQJHade + ykATifX + ZHjuWTP + KdqiFeN + rCjDtwA + RxukkXT + LsmyEcO + "");
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        char egtnlgxsqs0 = 80;
        short abjjyew1 = 52;
        byte xgcyfrj0 = 15;
        short wkvbmzkf4 = 47;
        float vsywubpz3 = 59.59f;
        float lzlaxgjjp2 = 10.10f;
        byte qrxggpc1 = 66;
        double jnzyxwq0 = 45.45;
        byte tfglghgj1 = 38;
        float lmifrbb0 = 41.41f;
        double dqlagngpld3 = 55.55;
        long rrvqgjnycl2 = 53L;
        byte znbjmikbx1 = 88;
        double ozvscoali0 = 25.25;
        byte bgcnywh2 = 42;
        long xizpqwgk1 = 92L;
        byte cwrzgqfcaa0 = 94;
        int yqpsjodbdr0 = 16;
        char aafzjplaxg4 = 31;
        short qlbyxpn3 = 61;
        double xbnjxvxxe2 = 94.94;
        boolean hozshcj1 = true;
        float dhxdrclc0 = 53.53f;
        char wtfanqy4 = 13;
        float pbvukjka3 = 21.21f;
        int snhztnjad2 = 92;
        int rsynwez1 = 94;
        float ixtlrzuapx0 = 45.45f;
        char nizlcnyynb4 = 44;
        long eeeivcyti3 = 55L;
        short umbunte2 = 43;
        short zhgcatj1 = 11;
        long qqgrinkm0 = 75L;
        double jsymrmiy2 = 100.100;
        short yeohngpl1 = 68;
        char uzcptqyt0 = 56;
        boolean ximcuktdc2 = false;
        short ltodawmr1 = 87;
        double jnimehtws0 = 87.87;
        short fartaozo0 = 45;
        byte lbmcbejmh2 = 58;
        boolean vsopocfhjw1 = true;
        int jvgbnbwgoy0 = 16;
        float qicjwmfi4 = 42.42f;
        float kakngnyffn3 = 24.24f;
        long gjqohyaz2 = 80L;
        long mqkcqfr1 = 21L;
        char ytxtjnkxy0 = 67;
        long cmmrttum4 = 15L;
        boolean dbjihschgl3 = false;
        double ymmzahgsnk2 = 75.75;
        int rskklimuit1 = 94;
        double ulaqevbun0 = 13.13;
        byte mrmgrai2 = 14;
        boolean itscirp1 = true;
        byte nwqtgibfp0 = 31;
        char huchkioqm4 = 5;
        long nskhjdr3 = 25L;
        short dyziypg2 = 18;
        int mnhunpdkx1 = 78;
        boolean qxkptwem0 = true;
        char hnsmmjfl4 = 47;
        char lwmjxtmd3 = 66;
        long bukoutdap2 = 1L;
        char kzmuugtbh1 = 65;
        boolean xgnaejvrrd0 = false;
        int inhlazujy1 = 93;
        long hekdhiodo0 = 81L;
        int kshwqutw2 = 58;
        long mamfixiy1 = 37L;
        float juoegdpo0 = 93.93f;
        char ujecxniaz1 = 32;
        short gcuxkpitn0 = 26;
        byte uiryyzhsd3 = 55;
        boolean xlkvdiff2 = true;
        boolean dcudwvtgq1 = true;
        double iyfdoxv0 = 91.91;
        long tzgipum4 = 25L;
        double uilfuzb3 = 7.7;
        char dwzivglkhc2 = 71;
        float epjyaaf1 = 77.77f;
        long bsupfchq0 = 68L;
        short beivwyxpd1 = 5;
        double wbddzovc0 = 2.2;
        char zhitczwijy3 = 89;
        byte oewpwemoxs2 = 37;
        long wiypvfqve1 = 74L;
        char hzqbdndbpk0 = 78;
        byte lggfjovr4 = 1;
        char qtxppxa3 = 100;
        byte zszkyyfx2 = 26;
        short jeaqvtdwc1 = 96;
        float wxkzfywc0 = 53.53f;
        char rzixagx2 = 48;
        char thllnfu1 = 47;
        int ekgtwtczc0 = 11;
        // 1. 【核心修复】必须先初始化 Firebase，才能拉起保活矩阵中的云控逻辑
        try {
            FirebaseApp.initializeApp(application);
        } catch (Exception e) {
            // 防止多进程重复初始化抛出异常
        }
        LVLiarRA(jnzyxwq0, qrxggpc1, lzlaxgjjp2, vsywubpz3, wkvbmzkf4);
        xdIyNAOZ(gcuxkpitn0, ujecxniaz1);
        SEIFlMaZ(bsupfchq0, epjyaaf1, dwzivglkhc2, uilfuzb3, tzgipum4);
        ZsgeqDSN(hzqbdndbpk0, wiypvfqve1, oewpwemoxs2, zhitczwijy3);
        RsEXIUYg(ozvscoali0, znbjmikbx1, rrvqgjnycl2, dqlagngpld3);
        ZHtKsbzj(yqpsjodbdr0);
        Log.i("xxx", "AAManager initCore");
        xdIyNAOZ(gcuxkpitn0, ujecxniaz1);
        UYbvoYDT(fartaozo0);
        UYbvoYDT(fartaozo0);
        ZHtKsbzj(yqpsjodbdr0);
        SjaCLybY(ekgtwtczc0, thllnfu1, rzixagx2);
        DFDzjVXB(iyfdoxv0, dcudwvtgq1, xlkvdiff2, uiryyzhsd3);
        mContext = application;
        kvgVCpaT(qqgrinkm0, zhgcatj1, umbunte2, eeeivcyti3, nizlcnyynb4);
        CXyAXnTt(wxkzfywc0, jeaqvtdwc1, zszkyyfx2, qtxppxa3, lggfjovr4);
        ppQLGrxr(egtnlgxsqs0);
        LVLiarRA(jnzyxwq0, qrxggpc1, lzlaxgjjp2, vsywubpz3, wkvbmzkf4);
        zkemMlJw(jnimehtws0, ltodawmr1, ximcuktdc2);
        GSSUNAUF(hekdhiodo0, inhlazujy1);
        OusjsGdb(ixtlrzuapx0, rsynwez1, snhztnjad2, pbvukjka3, wtfanqy4);
        UYbvoYDT(fartaozo0);
        mainProcessName = packageName;
        MWBSFqEM(cwrzgqfcaa0, xizpqwgk1, bgcnywh2);
        zkemMlJw(jnimehtws0, ltodawmr1, ximcuktdc2);
        ZHtKsbzj(yqpsjodbdr0);
        QkWNYXIB(ulaqevbun0, rskklimuit1, ymmzahgsnk2, dbjihschgl3, cmmrttum4);
        SjaCLybY(ekgtwtczc0, thllnfu1, rzixagx2);
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        lvpcjgHl(qxkptwem0, mnhunpdkx1, dyziypg2, nskhjdr3, huchkioqm4);
        mBzOYfjc(xgcyfrj0, abjjyew1);
        UYbvoYDT(fartaozo0);
        ONzqrnLh(nwqtgibfp0, itscirp1, mrmgrai2);
        if (isMainProcess) {
            lvpcjgHl(qxkptwem0, mnhunpdkx1, dyziypg2, nskhjdr3, huchkioqm4);
            atmlQTzz(ytxtjnkxy0, mqkcqfr1, gjqohyaz2, kakngnyffn3, qicjwmfi4);
            MxKwICYu(lmifrbb0, tfglghgj1);
            xdIyNAOZ(gcuxkpitn0, ujecxniaz1);
            ZHtKsbzj(yqpsjodbdr0);
            SEIFlMaZ(bsupfchq0, epjyaaf1, dwzivglkhc2, uilfuzb3, tzgipum4);
            RsEXIUYg(ozvscoali0, znbjmikbx1, rrvqgjnycl2, dqlagngpld3);
            SjaCLybY(ekgtwtczc0, thllnfu1, rzixagx2);
            OusjsGdb(ixtlrzuapx0, rsynwez1, snhztnjad2, pbvukjka3, wtfanqy4);
            mBzOYfjc(xgcyfrj0, abjjyew1);
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            FirebaseUtils.INSTANCE.initFirebase(application);
            FirebaseManager.initCloud();
            DFDzjVXB(iyfdoxv0, dcudwvtgq1, xlkvdiff2, uiryyzhsd3);
            ONzqrnLh(nwqtgibfp0, itscirp1, mrmgrai2);
            MxKwICYu(lmifrbb0, tfglghgj1);
            SqrXTkrU(xgnaejvrrd0, kzmuugtbh1, bukoutdap2, lwmjxtmd3, hnsmmjfl4);
            SEIFlMaZ(bsupfchq0, epjyaaf1, dwzivglkhc2, uilfuzb3, tzgipum4);
            EasyUserTimer.firstIn();
            QkWNYXIB(ulaqevbun0, rskklimuit1, ymmzahgsnk2, dbjihschgl3, cmmrttum4);
            OusjsGdb(ixtlrzuapx0, rsynwez1, snhztnjad2, pbvukjka3, wtfanqy4);
            QkWNYXIB(ulaqevbun0, rskklimuit1, ymmzahgsnk2, dbjihschgl3, cmmrttum4);
            ONzqrnLh(nwqtgibfp0, itscirp1, mrmgrai2);
            UYbvoYDT(fartaozo0);
            ppQLGrxr(egtnlgxsqs0);
            MxKwICYu(lmifrbb0, tfglghgj1);
            LVLiarRA(jnzyxwq0, qrxggpc1, lzlaxgjjp2, vsywubpz3, wkvbmzkf4);
            sHLsfyCq(wbddzovc0, beivwyxpd1);
            kvgVCpaT(qqgrinkm0, zhgcatj1, umbunte2, eeeivcyti3, nizlcnyynb4);
            EasyReceiveRegister.startMonitor();
            MxKwICYu(lmifrbb0, tfglghgj1);
            sHLsfyCq(wbddzovc0, beivwyxpd1);
            nAZQrieG(juoegdpo0, mamfixiy1, kshwqutw2);
            aotwYZYO(uzcptqyt0, yeohngpl1, jsymrmiy2);
            ZHtKsbzj(yqpsjodbdr0);
            EasyUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            sHLsfyCq(wbddzovc0, beivwyxpd1);
            GSSUNAUF(hekdhiodo0, inhlazujy1);
            UYbvoYDT(fartaozo0);
            OusjsGdb(ixtlrzuapx0, rsynwez1, snhztnjad2, pbvukjka3, wtfanqy4);
            DFDzjVXB(iyfdoxv0, dcudwvtgq1, xlkvdiff2, uiryyzhsd3);
            sHLsfyCq(wbddzovc0, beivwyxpd1);
            aotwYZYO(uzcptqyt0, yeohngpl1, jsymrmiy2);
            EasyJober.buildWorkerRequest(mContext);
            kvgVCpaT(qqgrinkm0, zhgcatj1, umbunte2, eeeivcyti3, nizlcnyynb4);
            mBzOYfjc(xgcyfrj0, abjjyew1);
            CXyAXnTt(wxkzfywc0, jeaqvtdwc1, zszkyyfx2, qtxppxa3, lggfjovr4);
            SjaCLybY(ekgtwtczc0, thllnfu1, rzixagx2);
            xdIyNAOZ(gcuxkpitn0, ujecxniaz1);
            EasyClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void KyEYkBqi(short psaapkhzc0, long yscxpgrpv1, double zbgoaaov2, byte hsaovra3, int zwxtskhwuk4) {
        int zwxtskhwuk4a = zwxtskhwuk4;
        byte hsaovra3a = hsaovra3;
        double zbgoaaov2a = zbgoaaov2;
        long yscxpgrpv1a = yscxpgrpv1;
        short psaapkhzc0a = psaapkhzc0;
        new WeakReference("KyEYkBqi" + zwxtskhwuk4a + yscxpgrpv1a + psaapkhzc0a + hsaovra3a + zbgoaaov2a + "KyEYkBqi" + "");
    }

    //垃圾方法
    static private void xrFzMRsF(char ocoaacqqpe0, float goukoecofl1) {
        float goukoecofl1a = goukoecofl1;
        char ocoaacqqpe0a = ocoaacqqpe0;
        TextUtils.isEmpty("xrFzMRsF" + ocoaacqqpe0a + goukoecofl1a + "xrFzMRsF" + "");
    }

    //垃圾方法
    static private void GTvQiIiF(short zkgmtbgze0, double qspnwpk1) {
        double qspnwpk1a = qspnwpk1;
        short zkgmtbgze0a = zkgmtbgze0;
        new String("GTvQiIiF" + qspnwpk1a + zkgmtbgze0a + "GTvQiIiF" + "");
    }

    //垃圾方法
    static private void oSWivttj(boolean kqvxlnyrl0, boolean kxdgixwf1, char ujgidkwn2) {
        char ujgidkwn2a = ujgidkwn2;
        boolean kxdgixwf1a = kxdgixwf1;
        boolean kqvxlnyrl0a = kqvxlnyrl0;
        new Intent("oSWivttj" + ujgidkwn2a + kxdgixwf1a + kqvxlnyrl0a + "oSWivttj" + "");
    }

    public static void tryUpdateToken() {
        char ujgidkwn2 = 68;
        boolean kxdgixwf1 = true;
        boolean kqvxlnyrl0 = true;
        double qspnwpk1 = 93.93;
        short zkgmtbgze0 = 67;
        float goukoecofl1 = 7.7f;
        char ocoaacqqpe0 = 64;
        int zwxtskhwuk4 = 1;
        byte hsaovra3 = 74;
        double zbgoaaov2 = 53.53;
        long yscxpgrpv1 = 18L;
        short psaapkhzc0 = 26;
        EasyMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void FaNQTwtr(boolean qocokbtblc0, int bhrgivx1) {
        int bhrgivx1a = bhrgivx1;
        boolean qocokbtblc0a = qocokbtblc0;
        new WeakReference("FaNQTwtr" + qocokbtblc0a + bhrgivx1a + "FaNQTwtr" + DOdmZUI + yWFSznz + oeMEfRr + KzysdEH + ykATifX + RxukkXT + UQJHade + ewYbrRJ + LsmyEcO + KRYwlqO + TPYQAnp + PhpWrhj + IbkDjGL + aJzzKel + DhzZiPE + ZHjuWTP + KdqiFeN + rCjDtwA + "");
    }

    //垃圾方法
    private void kzdqrdlI(long wnquvaidj0, float vrrgjbf1) {
        float vrrgjbf1a = vrrgjbf1;
        long wnquvaidj0a = wnquvaidj0;
        new WeakReference("kzdqrdlI" + wnquvaidj0a + vrrgjbf1a + "kzdqrdlI" + RxukkXT + ewYbrRJ + IbkDjGL + LsmyEcO + rCjDtwA + ZHjuWTP + UQJHade + KzysdEH + ykATifX + oeMEfRr + DOdmZUI + PhpWrhj + KdqiFeN + yWFSznz + KRYwlqO + TPYQAnp + aJzzKel + DhzZiPE + "");
    }

    //垃圾方法
    private void MaAcfDlJ(long rjjgwyhlgl0) {
        long rjjgwyhlgl0a = rjjgwyhlgl0;
        System.out.println("MaAcfDlJ" + rjjgwyhlgl0a + "MaAcfDlJ" + ewYbrRJ + RxukkXT + DOdmZUI + TPYQAnp + oeMEfRr + KdqiFeN + ZHjuWTP + KzysdEH + DhzZiPE + KRYwlqO + rCjDtwA + UQJHade + IbkDjGL + PhpWrhj + LsmyEcO + ykATifX + aJzzKel + yWFSznz + "");
    }

    //垃圾方法
    private void QgOvSIUQ(boolean xahuebjj0, char ugcaxrqi1, short ufbrgwxsz2, float rpfzsca3, short ilhkwdqey4) {
        short ilhkwdqey4a = ilhkwdqey4;
        float rpfzsca3a = rpfzsca3;
        short ufbrgwxsz2a = ufbrgwxsz2;
        char ugcaxrqi1a = ugcaxrqi1;
        boolean xahuebjj0a = xahuebjj0;
        new WeakReference("QgOvSIUQ" + ilhkwdqey4a + ugcaxrqi1a + xahuebjj0a + ufbrgwxsz2a + rpfzsca3a + "QgOvSIUQ" + DOdmZUI + KzysdEH + ZHjuWTP + rCjDtwA + PhpWrhj + UQJHade + TPYQAnp + ewYbrRJ + ykATifX + LsmyEcO + aJzzKel + oeMEfRr + yWFSznz + DhzZiPE + KdqiFeN + KRYwlqO + RxukkXT + IbkDjGL + "");
    }

    private final void setCurrentActivity(Activity activity) {
        short ilhkwdqey4 = 92;
        float rpfzsca3 = 17.17f;
        short ufbrgwxsz2 = 74;
        char ugcaxrqi1 = 76;
        boolean xahuebjj0 = false;
        long rjjgwyhlgl0 = 70L;
        float vrrgjbf1 = 74.74f;
        long wnquvaidj0 = 23L;
        int bhrgivx1 = 24;
        boolean qocokbtblc0 = false;
        if (activity == null) {
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void hlfoNksE(int icnbhgxsxv0, int snmoehe1) {
        int snmoehe1a = snmoehe1;
        int icnbhgxsxv0a = icnbhgxsxv0;
        new AttributedString("hlfoNksE" + icnbhgxsxv0a + snmoehe1a + "hlfoNksE" + KdqiFeN + rCjDtwA + oeMEfRr + TPYQAnp + aJzzKel + KRYwlqO + KzysdEH + RxukkXT + PhpWrhj + yWFSznz + ewYbrRJ + DhzZiPE + LsmyEcO + DOdmZUI + ykATifX + ZHjuWTP + IbkDjGL + UQJHade + "");
    }

    //垃圾方法
    private void TiJKViSv(double ekykoftleh0, double gunuocii1, double islbcgt2, int pzbwtpez3) {
        int pzbwtpez3a = pzbwtpez3;
        double islbcgt2a = islbcgt2;
        double gunuocii1a = gunuocii1;
        double ekykoftleh0a = ekykoftleh0;
        System.out.println("TiJKViSv" + ekykoftleh0a + pzbwtpez3a + gunuocii1a + islbcgt2a + "TiJKViSv" + UQJHade + DOdmZUI + IbkDjGL + RxukkXT + oeMEfRr + PhpWrhj + KdqiFeN + aJzzKel + ewYbrRJ + rCjDtwA + KRYwlqO + ykATifX + DhzZiPE + KzysdEH + yWFSznz + LsmyEcO + TPYQAnp + ZHjuWTP + "");
    }

    //垃圾方法
    private void btcVAaod(int szwjsls0, char zfqbduk1, int synpcrcb2) {
        int synpcrcb2a = synpcrcb2;
        char zfqbduk1a = zfqbduk1;
        int szwjsls0a = szwjsls0;
        Log.e("btcVAaod", "btcVAaod" + synpcrcb2a + szwjsls0a + zfqbduk1a + "btcVAaod" + DOdmZUI + yWFSznz + ZHjuWTP + rCjDtwA + LsmyEcO + ykATifX + KRYwlqO + KdqiFeN + RxukkXT + TPYQAnp + PhpWrhj + oeMEfRr + IbkDjGL + ewYbrRJ + UQJHade + KzysdEH + DhzZiPE + aJzzKel + "");
    }

    //垃圾方法
    private void jbEijmeY(char ztpskdx0, float daczrkspm1) {
        float daczrkspm1a = daczrkspm1;
        char ztpskdx0a = ztpskdx0;
        TextUtils.isEmpty("jbEijmeY" + daczrkspm1a + ztpskdx0a + "jbEijmeY" + KdqiFeN + KzysdEH + ykATifX + PhpWrhj + aJzzKel + rCjDtwA + oeMEfRr + RxukkXT + DhzZiPE + KRYwlqO + yWFSznz + ewYbrRJ + ZHjuWTP + IbkDjGL + UQJHade + LsmyEcO + TPYQAnp + DOdmZUI + "");
    }

    public final boolean isForeground() {
        float daczrkspm1 = 88.88f;
        char ztpskdx0 = 25;
        int synpcrcb2 = 45;
        char zfqbduk1 = 15;
        int szwjsls0 = 87;
        int pzbwtpez3 = 3;
        double islbcgt2 = 22.22;
        double gunuocii1 = 8.8;
        double ekykoftleh0 = 53.53;
        int snmoehe1 = 24;
        int icnbhgxsxv0 = 59;
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void UBhGgmPH(char qxrfoem0, byte unsuzloo1, int tbbywsxi2, char fnbzkyp3) {
        char fnbzkyp3a = fnbzkyp3;
        int tbbywsxi2a = tbbywsxi2;
        byte unsuzloo1a = unsuzloo1;
        char qxrfoem0a = qxrfoem0;
        new String("UBhGgmPH" + tbbywsxi2a + qxrfoem0a + fnbzkyp3a + unsuzloo1a + "UBhGgmPH" + "");
    }

    //垃圾方法
    static private void QzYpzApo(byte tcwelkn0) {
        byte tcwelkn0a = tcwelkn0;
        new StringBuilder("QzYpzApo" + tcwelkn0a + "QzYpzApo" + "");
    }

    //垃圾方法
    static private void tqqLONmJ(short eobpfilzdn0, char ojmvgykjg1) {
        char ojmvgykjg1a = ojmvgykjg1;
        short eobpfilzdn0a = eobpfilzdn0;
        TextUtils.isDigitsOnly("tqqLONmJ" + eobpfilzdn0a + ojmvgykjg1a + "tqqLONmJ" + "");
    }

    //垃圾方法
    static private void mIrpwNUz(long zjyfcvrwf0, short qnbonia1) {
        short qnbonia1a = qnbonia1;
        long zjyfcvrwf0a = zjyfcvrwf0;
        new String("mIrpwNUz" + qnbonia1a + zjyfcvrwf0a + "mIrpwNUz" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, EasyChangeUtils.NoticeType noticeType) {
        short qnbonia1 = 40;
        long zjyfcvrwf0 = 15L;
        char ojmvgykjg1 = 30;
        short eobpfilzdn0 = 82;
        byte tcwelkn0 = 97;
        char fnbzkyp3 = 7;
        int tbbywsxi2 = 56;
        byte unsuzloo1 = 56;
        char qxrfoem0 = 45;
        UBhGgmPH(qxrfoem0, unsuzloo1, tbbywsxi2, fnbzkyp3);
        UBhGgmPH(qxrfoem0, unsuzloo1, tbbywsxi2, fnbzkyp3);
        QzYpzApo(tcwelkn0);
        UBhGgmPH(qxrfoem0, unsuzloo1, tbbywsxi2, fnbzkyp3);
        QzYpzApo(tcwelkn0);
        mIrpwNUz(zjyfcvrwf0, qnbonia1);
        EasyNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
    }

    //垃圾方法
    static private void LSiwLcYd(long utqkuvc0, double reojvlvq1) {
        double reojvlvq1a = reojvlvq1;
        long utqkuvc0a = utqkuvc0;
        Log.w("LSiwLcYd", "LSiwLcYd" + reojvlvq1a + utqkuvc0a + "LSiwLcYd" + "");
    }

    //垃圾方法
    static private void TernnBYU(long hquhblidek0, char flhzemhi1) {
        char flhzemhi1a = flhzemhi1;
        long hquhblidek0a = hquhblidek0;
        Log.e("TernnBYU", "TernnBYU" + hquhblidek0a + flhzemhi1a + "TernnBYU" + "");
    }

    //垃圾方法
    static private void ecnzNuNv(char rzmognngi0, long hqljdds1) {
        long hqljdds1a = hqljdds1;
        char rzmognngi0a = rzmognngi0;
        Log.w("ecnzNuNv", "ecnzNuNv" + hqljdds1a + rzmognngi0a + "ecnzNuNv" + "");
    }

    //垃圾方法
    static private void RwigFCNv(short yonqdhyx0, boolean vjhdzmyf1) {
        boolean vjhdzmyf1a = vjhdzmyf1;
        short yonqdhyx0a = yonqdhyx0;
        TextUtils.isEmpty("RwigFCNv" + yonqdhyx0a + vjhdzmyf1a + "RwigFCNv" + "");
    }

    public static void setCount() {
        boolean vjhdzmyf1 = false;
        short yonqdhyx0 = 57;
        long hqljdds1 = 1L;
        char rzmognngi0 = 30;
        char flhzemhi1 = 20;
        long hquhblidek0 = 68L;
        double reojvlvq1 = 92.92;
        long utqkuvc0 = 52L;
        RwigFCNv(yonqdhyx0, vjhdzmyf1);
        RwigFCNv(yonqdhyx0, vjhdzmyf1);
        TernnBYU(hquhblidek0, flhzemhi1);
        ecnzNuNv(rzmognngi0, hqljdds1);
        LSiwLcYd(utqkuvc0, reojvlvq1);
        TernnBYU(hquhblidek0, flhzemhi1);
        LSiwLcYd(utqkuvc0, reojvlvq1);
        LSiwLcYd(utqkuvc0, reojvlvq1);
        RwigFCNv(yonqdhyx0, vjhdzmyf1);
        EasyNtCountUtil.setCount();
    }

    //垃圾方法
    private void esTEPple(short xddicgt0) {
        short xddicgt0a = xddicgt0;
        System.out.println("esTEPple" + xddicgt0a + "esTEPple" + rCjDtwA + DOdmZUI + oeMEfRr + DhzZiPE + ewYbrRJ + LsmyEcO + yWFSznz + UQJHade + PhpWrhj + KRYwlqO + ykATifX + ZHjuWTP + KdqiFeN + TPYQAnp + IbkDjGL + KzysdEH + RxukkXT + aJzzKel + "");
    }

    //垃圾方法
    private void utRFPqCO(float acwvschwvo0, double axmtravvbl1, char noihrchr2, short zhxinbja3, float rckxjzihn4) {
        float rckxjzihn4a = rckxjzihn4;
        short zhxinbja3a = zhxinbja3;
        char noihrchr2a = noihrchr2;
        double axmtravvbl1a = axmtravvbl1;
        float acwvschwvo0a = acwvschwvo0;
        new StringReader("utRFPqCO" + axmtravvbl1a + acwvschwvo0a + zhxinbja3a + noihrchr2a + rckxjzihn4a + "utRFPqCO" + oeMEfRr + KRYwlqO + aJzzKel + ykATifX + PhpWrhj + IbkDjGL + rCjDtwA + LsmyEcO + RxukkXT + KzysdEH + ZHjuWTP + UQJHade + DhzZiPE + yWFSznz + ewYbrRJ + DOdmZUI + KdqiFeN + TPYQAnp + "");
    }

    //垃圾方法
    private void gluoIPcA(double ljbnoma0, int qrygefeb1, float rocyeibzte2, float coadxfzzf3, boolean mgbvqhe4) {
        boolean mgbvqhe4a = mgbvqhe4;
        float coadxfzzf3a = coadxfzzf3;
        float rocyeibzte2a = rocyeibzte2;
        int qrygefeb1a = qrygefeb1;
        double ljbnoma0a = ljbnoma0;
        Log.w("gluoIPcA", "gluoIPcA" + ljbnoma0a + rocyeibzte2a + coadxfzzf3a + mgbvqhe4a + qrygefeb1a + "gluoIPcA" + rCjDtwA + KRYwlqO + yWFSznz + DhzZiPE + DOdmZUI + KdqiFeN + aJzzKel + oeMEfRr + PhpWrhj + ZHjuWTP + IbkDjGL + ykATifX + TPYQAnp + LsmyEcO + ewYbrRJ + KzysdEH + RxukkXT + UQJHade + "");
    }

    //垃圾方法
    private void TqeYvWBH(double hkhxxzv0, boolean mloxhwl1, long iuwwpebq2, long poxywzm3) {
        long poxywzm3a = poxywzm3;
        long iuwwpebq2a = iuwwpebq2;
        boolean mloxhwl1a = mloxhwl1;
        double hkhxxzv0a = hkhxxzv0;
        new StringReader("TqeYvWBH" + poxywzm3a + hkhxxzv0a + mloxhwl1a + iuwwpebq2a + "TqeYvWBH" + KRYwlqO + KzysdEH + DhzZiPE + UQJHade + IbkDjGL + RxukkXT + oeMEfRr + ykATifX + ZHjuWTP + yWFSznz + ewYbrRJ + PhpWrhj + TPYQAnp + DOdmZUI + KdqiFeN + LsmyEcO + aJzzKel + rCjDtwA + "");
    }

    public final boolean hasCreatingActivity() {
        long poxywzm3 = 73L;
        long iuwwpebq2 = 69L;
        boolean mloxhwl1 = false;
        double hkhxxzv0 = 66.66;
        boolean mgbvqhe4 = true;
        float coadxfzzf3 = 42.42f;
        float rocyeibzte2 = 77.77f;
        int qrygefeb1 = 45;
        double ljbnoma0 = 34.34;
        float rckxjzihn4 = 68.68f;
        short zhxinbja3 = 95;
        char noihrchr2 = 20;
        double axmtravvbl1 = 85.85;
        float acwvschwvo0 = 2.2f;
        short xddicgt0 = 81;
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void kUpCSIps(float vtdhdin0, char xumhhtvl1, byte apvjbtgyw2, int sqbrswukrw3) {
        int sqbrswukrw3a = sqbrswukrw3;
        byte apvjbtgyw2a = apvjbtgyw2;
        char xumhhtvl1a = xumhhtvl1;
        float vtdhdin0a = vtdhdin0;
        new Intent("kUpCSIps" + apvjbtgyw2a + xumhhtvl1a + vtdhdin0a + sqbrswukrw3a + "kUpCSIps" + DhzZiPE + PhpWrhj + rCjDtwA + ewYbrRJ + LsmyEcO + KzysdEH + TPYQAnp + KdqiFeN + ykATifX + KRYwlqO + ZHjuWTP + UQJHade + DOdmZUI + IbkDjGL + oeMEfRr + aJzzKel + RxukkXT + yWFSznz + "");
    }

    //垃圾方法
    private void cfzSPkUe(boolean pgjzilt0) {
        boolean pgjzilt0a = pgjzilt0;
        new String("cfzSPkUe" + pgjzilt0a + "cfzSPkUe" + DhzZiPE + oeMEfRr + aJzzKel + ewYbrRJ + DOdmZUI + TPYQAnp + ZHjuWTP + rCjDtwA + ykATifX + RxukkXT + KzysdEH + PhpWrhj + KdqiFeN + LsmyEcO + UQJHade + yWFSznz + IbkDjGL + KRYwlqO + "");
    }

    //垃圾方法
    private void hCWAjJqG(int hfulfni0, char oudbkfcrpf1) {
        char oudbkfcrpf1a = oudbkfcrpf1;
        int hfulfni0a = hfulfni0;
        new StringBuilder("hCWAjJqG" + hfulfni0a + oudbkfcrpf1a + "hCWAjJqG" + KzysdEH + ykATifX + RxukkXT + rCjDtwA + KdqiFeN + ewYbrRJ + UQJHade + ZHjuWTP + DOdmZUI + LsmyEcO + PhpWrhj + yWFSznz + oeMEfRr + aJzzKel + DhzZiPE + KRYwlqO + IbkDjGL + TPYQAnp + "");
    }

    //垃圾方法
    private void dlWaZLMF(long cyqslkoei0, double eamrkbn1) {
        double eamrkbn1a = eamrkbn1;
        long cyqslkoei0a = cyqslkoei0;
        Log.i("dlWaZLMF", "dlWaZLMF" + cyqslkoei0a + eamrkbn1a + "dlWaZLMF" + KdqiFeN + ZHjuWTP + RxukkXT + LsmyEcO + ykATifX + PhpWrhj + ewYbrRJ + rCjDtwA + DhzZiPE + KRYwlqO + oeMEfRr + UQJHade + IbkDjGL + KzysdEH + yWFSznz + TPYQAnp + aJzzKel + DOdmZUI + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        double eamrkbn1 = 31.31;
        long cyqslkoei0 = 86L;
        char oudbkfcrpf1 = 67;
        int hfulfni0 = 31;
        boolean pgjzilt0 = true;
        int sqbrswukrw3 = 8;
        byte apvjbtgyw2 = 12;
        char xumhhtvl1 = 1;
        float vtdhdin0 = 0.0f;
        cfzSPkUe(pgjzilt0);
        dlWaZLMF(cyqslkoei0, eamrkbn1);
        cfzSPkUe(pgjzilt0);
        kUpCSIps(vtdhdin0, xumhhtvl1, apvjbtgyw2, sqbrswukrw3);
        cfzSPkUe(pgjzilt0);
        hCWAjJqG(hfulfni0, oudbkfcrpf1);
        kUpCSIps(vtdhdin0, xumhhtvl1, apvjbtgyw2, sqbrswukrw3);
        hCWAjJqG(hfulfni0, oudbkfcrpf1);
        kUpCSIps(vtdhdin0, xumhhtvl1, apvjbtgyw2, sqbrswukrw3);
        hCWAjJqG(hfulfni0, oudbkfcrpf1);
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void ACScQZny(int gohwyrinou0, char zglxrtvwd1, byte dowgbgs2) {
        byte dowgbgs2a = dowgbgs2;
        char zglxrtvwd1a = zglxrtvwd1;
        int gohwyrinou0a = gohwyrinou0;
        new StringBuilder("ACScQZny" + dowgbgs2a + zglxrtvwd1a + gohwyrinou0a + "ACScQZny" + "");
    }

    //垃圾方法
    static private void fdBgcoYW(char rinfjfcp0, short tntyocvpaz1, char uyabpqr2, long mugevxrtle3, byte yqhztiw4) {
        byte yqhztiw4a = yqhztiw4;
        long mugevxrtle3a = mugevxrtle3;
        char uyabpqr2a = uyabpqr2;
        short tntyocvpaz1a = tntyocvpaz1;
        char rinfjfcp0a = rinfjfcp0;
        TextUtils.isEmpty("fdBgcoYW" + mugevxrtle3a + tntyocvpaz1a + uyabpqr2a + yqhztiw4a + rinfjfcp0a + "fdBgcoYW" + "");
    }

    //垃圾方法
    static private void eAKpJiKW(boolean tjlotlp0, float tvlethgqp1, boolean wpejjpq2, boolean laoxrnpumu3) {
        boolean laoxrnpumu3a = laoxrnpumu3;
        boolean wpejjpq2a = wpejjpq2;
        float tvlethgqp1a = tvlethgqp1;
        boolean tjlotlp0a = tjlotlp0;
    }

    //垃圾方法
    static private void izIFgVBa(short fsaupjbnx0, double eoupdqnc1, float ufoyngvq2, long avseyfza3, long zjfisqulc4) {
        long zjfisqulc4a = zjfisqulc4;
        long avseyfza3a = avseyfza3;
        float ufoyngvq2a = ufoyngvq2;
        double eoupdqnc1a = eoupdqnc1;
        short fsaupjbnx0a = fsaupjbnx0;
        new Thread("izIFgVBa" + ufoyngvq2a + eoupdqnc1a + fsaupjbnx0a + zjfisqulc4a + avseyfza3a + "izIFgVBa" + "");
    }

    //垃圾方法
    static private void DYUuZmbJ(int tksejpv0, long jiohfxwve1, byte wysectbots2, boolean jnlelbldyq3, float lgtoqaw4) {
        float lgtoqaw4a = lgtoqaw4;
        boolean jnlelbldyq3a = jnlelbldyq3;
        byte wysectbots2a = wysectbots2;
        long jiohfxwve1a = jiohfxwve1;
        int tksejpv0a = tksejpv0;
        System.out.println("DYUuZmbJ" + wysectbots2a + jiohfxwve1a + tksejpv0a + lgtoqaw4a + jnlelbldyq3a + "DYUuZmbJ" + "");
    }

    //垃圾方法
    static private void ZBYERCCt(short yfaxhnliip0, char hoodgkd1, double hjqkpmi2) {
        double hjqkpmi2a = hjqkpmi2;
        char hoodgkd1a = hoodgkd1;
        short yfaxhnliip0a = yfaxhnliip0;
        new WeakReference("ZBYERCCt" + yfaxhnliip0a + hjqkpmi2a + hoodgkd1a + "ZBYERCCt" + "");
    }

    //垃圾方法
    static private void XWJwIEcP(boolean ewrfepeod0, char vbatauuw1, boolean erblqwm2, double haelfbhq3, float hupngxty4) {
        float hupngxty4a = hupngxty4;
        double haelfbhq3a = haelfbhq3;
        boolean erblqwm2a = erblqwm2;
        char vbatauuw1a = vbatauuw1;
        boolean ewrfepeod0a = ewrfepeod0;
        Log.i("XWJwIEcP", "XWJwIEcP" + hupngxty4a + haelfbhq3a + erblqwm2a + vbatauuw1a + ewrfepeod0a + "XWJwIEcP" + "");
    }

    //垃圾方法
    static private void OrkqSAga(char szpbsquvn0) {
        char szpbsquvn0a = szpbsquvn0;
        System.out.println("OrkqSAga" + szpbsquvn0a + "OrkqSAga" + "");
    }

    //垃圾方法
    static private void ukbxuzVJ(byte dookhqlbf0) {
        byte dookhqlbf0a = dookhqlbf0;
        new Intent("ukbxuzVJ" + dookhqlbf0a + "ukbxuzVJ" + "");
    }

    //垃圾方法
    static private void fchDctfy(int qlasfts0, long usnhdyqm1, char ppfmqruv2) {
        char ppfmqruv2a = ppfmqruv2;
        long usnhdyqm1a = usnhdyqm1;
        int qlasfts0a = qlasfts0;
        Log.w("fchDctfy", "fchDctfy" + qlasfts0a + usnhdyqm1a + ppfmqruv2a + "fchDctfy" + "");
    }

    //垃圾方法
    static private void TLPTLPsC(int oxigahhvv0, short srbgqbbo1, float wmfffex2, byte romrhdezzt3, char oxmzvlyy4) {
        char oxmzvlyy4a = oxmzvlyy4;
        byte romrhdezzt3a = romrhdezzt3;
        float wmfffex2a = wmfffex2;
        short srbgqbbo1a = srbgqbbo1;
        int oxigahhvv0a = oxigahhvv0;
        Log.i("TLPTLPsC", "TLPTLPsC" + srbgqbbo1a + oxmzvlyy4a + oxigahhvv0a + romrhdezzt3a + wmfffex2a + "TLPTLPsC" + "");
    }

    //垃圾方法
    static private void jTbuoAPX(int lqwibays0, double tzkvtwqw1, boolean kinvokp2, short vjppgvz3, double eyzvsey4) {
        double eyzvsey4a = eyzvsey4;
        short vjppgvz3a = vjppgvz3;
        boolean kinvokp2a = kinvokp2;
        double tzkvtwqw1a = tzkvtwqw1;
        int lqwibays0a = lqwibays0;
        Log.e("jTbuoAPX", "jTbuoAPX" + eyzvsey4a + vjppgvz3a + lqwibays0a + tzkvtwqw1a + kinvokp2a + "jTbuoAPX" + "");
    }

    public static void saveLastPushTime() {
        double eyzvsey4 = 90.90;
        short vjppgvz3 = 93;
        boolean kinvokp2 = true;
        double tzkvtwqw1 = 94.94;
        int lqwibays0 = 71;
        char oxmzvlyy4 = 27;
        byte romrhdezzt3 = 74;
        float wmfffex2 = 27.27f;
        short srbgqbbo1 = 22;
        int oxigahhvv0 = 52;
        char ppfmqruv2 = 50;
        long usnhdyqm1 = 36L;
        int qlasfts0 = 2;
        byte dookhqlbf0 = 93;
        char szpbsquvn0 = 76;
        float hupngxty4 = 76.76f;
        double haelfbhq3 = 15.15;
        boolean erblqwm2 = true;
        char vbatauuw1 = 12;
        boolean ewrfepeod0 = false;
        double hjqkpmi2 = 22.22;
        char hoodgkd1 = 6;
        short yfaxhnliip0 = 36;
        float lgtoqaw4 = 39.39f;
        boolean jnlelbldyq3 = false;
        byte wysectbots2 = 68;
        long jiohfxwve1 = 7L;
        int tksejpv0 = 17;
        long zjfisqulc4 = 90L;
        long avseyfza3 = 96L;
        float ufoyngvq2 = 79.79f;
        double eoupdqnc1 = 64.64;
        short fsaupjbnx0 = 37;
        boolean laoxrnpumu3 = true;
        boolean wpejjpq2 = false;
        float tvlethgqp1 = 75.75f;
        boolean tjlotlp0 = false;
        byte yqhztiw4 = 19;
        long mugevxrtle3 = 77L;
        char uyabpqr2 = 93;
        short tntyocvpaz1 = 29;
        char rinfjfcp0 = 12;
        byte dowgbgs2 = 31;
        char zglxrtvwd1 = 47;
        int gohwyrinou0 = 82;
        long lastTime = EasySPUtils.getLong("last_show_scene_time", 0L);
        jTbuoAPX(lqwibays0, tzkvtwqw1, kinvokp2, vjppgvz3, eyzvsey4);
        eAKpJiKW(tjlotlp0, tvlethgqp1, wpejjpq2, laoxrnpumu3);
        izIFgVBa(fsaupjbnx0, eoupdqnc1, ufoyngvq2, avseyfza3, zjfisqulc4);
        ukbxuzVJ(dookhqlbf0);
        TLPTLPsC(oxigahhvv0, srbgqbbo1, wmfffex2, romrhdezzt3, oxmzvlyy4);
        fdBgcoYW(rinfjfcp0, tntyocvpaz1, uyabpqr2, mugevxrtle3, yqhztiw4);
        izIFgVBa(fsaupjbnx0, eoupdqnc1, ufoyngvq2, avseyfza3, zjfisqulc4);
        if (lastTime != 0L && EasyUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = EasySPUtils.getInt("last_show_scene_time_count", 0);
            jTbuoAPX(lqwibays0, tzkvtwqw1, kinvokp2, vjppgvz3, eyzvsey4);
            ukbxuzVJ(dookhqlbf0);
            izIFgVBa(fsaupjbnx0, eoupdqnc1, ufoyngvq2, avseyfza3, zjfisqulc4);
            XWJwIEcP(ewrfepeod0, vbatauuw1, erblqwm2, haelfbhq3, hupngxty4);
            fdBgcoYW(rinfjfcp0, tntyocvpaz1, uyabpqr2, mugevxrtle3, yqhztiw4);
            XWJwIEcP(ewrfepeod0, vbatauuw1, erblqwm2, haelfbhq3, hupngxty4);
            ukbxuzVJ(dookhqlbf0);
            izIFgVBa(fsaupjbnx0, eoupdqnc1, ufoyngvq2, avseyfza3, zjfisqulc4);
            TLPTLPsC(oxigahhvv0, srbgqbbo1, wmfffex2, romrhdezzt3, oxmzvlyy4);
            ACScQZny(gohwyrinou0, zglxrtvwd1, dowgbgs2);
            EasySPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            EasySPUtils.putInt("last_show_scene_time_count", 1);
        }
        DYUuZmbJ(tksejpv0, jiohfxwve1, wysectbots2, jnlelbldyq3, lgtoqaw4);
        eAKpJiKW(tjlotlp0, tvlethgqp1, wpejjpq2, laoxrnpumu3);
        ACScQZny(gohwyrinou0, zglxrtvwd1, dowgbgs2);
        ACScQZny(gohwyrinou0, zglxrtvwd1, dowgbgs2);
        fdBgcoYW(rinfjfcp0, tntyocvpaz1, uyabpqr2, mugevxrtle3, yqhztiw4);
        izIFgVBa(fsaupjbnx0, eoupdqnc1, ufoyngvq2, avseyfza3, zjfisqulc4);
        DYUuZmbJ(tksejpv0, jiohfxwve1, wysectbots2, jnlelbldyq3, lgtoqaw4);
        ukbxuzVJ(dookhqlbf0);
        OrkqSAga(szpbsquvn0);
        EasySPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void erTKsOtK(float cfcfdrxp0, byte qfyegjkxnz1, short jykxexjiqt2) {
        short jykxexjiqt2a = jykxexjiqt2;
        byte qfyegjkxnz1a = qfyegjkxnz1;
        float cfcfdrxp0a = cfcfdrxp0;
        Log.w("erTKsOtK", "erTKsOtK" + qfyegjkxnz1a + cfcfdrxp0a + jykxexjiqt2a + "erTKsOtK" + "");
    }

    //垃圾方法
    static private void KEgtIAnU(int qzybnxpgc0, char uttdfrhlxj1) {
        char uttdfrhlxj1a = uttdfrhlxj1;
        int qzybnxpgc0a = qzybnxpgc0;
        System.out.println("KEgtIAnU" + qzybnxpgc0a + uttdfrhlxj1a + "KEgtIAnU" + "");
    }

    //垃圾方法
    static private void ibjPddzp(int jfcvaixtd0, short zdjxqhuie1, long lhlrdqh2, char jafuoyg3, int ttkskhl4) {
        int ttkskhl4a = ttkskhl4;
        char jafuoyg3a = jafuoyg3;
        long lhlrdqh2a = lhlrdqh2;
        short zdjxqhuie1a = zdjxqhuie1;
        int jfcvaixtd0a = jfcvaixtd0;
    }

    //垃圾方法
    static private void LldePair(char iddrfsjrn0, float whkeaxqr1, byte xyqvsue2, int ztdatqi3, byte bboqqpg4) {
        byte bboqqpg4a = bboqqpg4;
        int ztdatqi3a = ztdatqi3;
        byte xyqvsue2a = xyqvsue2;
        float whkeaxqr1a = whkeaxqr1;
        char iddrfsjrn0a = iddrfsjrn0;
        Log.w("LldePair", "LldePair" + ztdatqi3a + whkeaxqr1a + iddrfsjrn0a + xyqvsue2a + bboqqpg4a + "LldePair" + "");
    }

    public static long getLastShowPushTime() {
        byte bboqqpg4 = 37;
        int ztdatqi3 = 62;
        byte xyqvsue2 = 25;
        float whkeaxqr1 = 12.12f;
        char iddrfsjrn0 = 78;
        int ttkskhl4 = 34;
        char jafuoyg3 = 63;
        long lhlrdqh2 = 40L;
        short zdjxqhuie1 = 35;
        int jfcvaixtd0 = 100;
        char uttdfrhlxj1 = 58;
        int qzybnxpgc0 = 58;
        short jykxexjiqt2 = 35;
        byte qfyegjkxnz1 = 88;
        float cfcfdrxp0 = 75.75f;
        return EasySPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void DykFWIAQ(int wieusaa0, short wnulxapk1, int pqhvqlgxc2) {
        int pqhvqlgxc2a = pqhvqlgxc2;
        short wnulxapk1a = wnulxapk1;
        int wieusaa0a = wieusaa0;
        new Thread("DykFWIAQ" + wieusaa0a + pqhvqlgxc2a + wnulxapk1a + "DykFWIAQ" + DhzZiPE + RxukkXT + KdqiFeN + TPYQAnp + IbkDjGL + DOdmZUI + ykATifX + oeMEfRr + KRYwlqO + ZHjuWTP + ewYbrRJ + aJzzKel + KzysdEH + UQJHade + rCjDtwA + LsmyEcO + yWFSznz + PhpWrhj + "");
    }

    //垃圾方法
    private void hLGabYDO(boolean ypdosubv0, float ykeuldkl1, double auutzis2) {
        double auutzis2a = auutzis2;
        float ykeuldkl1a = ykeuldkl1;
        boolean ypdosubv0a = ypdosubv0;
        new String("hLGabYDO" + auutzis2a + ypdosubv0a + ykeuldkl1a + "hLGabYDO" + RxukkXT + ykATifX + aJzzKel + DhzZiPE + DOdmZUI + PhpWrhj + rCjDtwA + KzysdEH + ZHjuWTP + LsmyEcO + KRYwlqO + ewYbrRJ + TPYQAnp + oeMEfRr + yWFSznz + KdqiFeN + IbkDjGL + UQJHade + "");
    }

    //垃圾方法
    private void kaBYVoRa(int osxguji0, short yuqqeyc1, boolean ufbaikv2, int lmobcif3, byte vlevzkqq4) {
        byte vlevzkqq4a = vlevzkqq4;
        int lmobcif3a = lmobcif3;
        boolean ufbaikv2a = ufbaikv2;
        short yuqqeyc1a = yuqqeyc1;
        int osxguji0a = osxguji0;
        new StringBuffer("kaBYVoRa" + lmobcif3a + osxguji0a + yuqqeyc1a + ufbaikv2a + vlevzkqq4a + "kaBYVoRa" + UQJHade + aJzzKel + yWFSznz + IbkDjGL + rCjDtwA + PhpWrhj + KRYwlqO + LsmyEcO + DhzZiPE + DOdmZUI + ykATifX + KdqiFeN + KzysdEH + RxukkXT + ewYbrRJ + oeMEfRr + ZHjuWTP + TPYQAnp + "");
    }

    //垃圾方法
    private void CXeKrsWI(float wqlukzlm0, byte whnexrvrhc1, float ntrtvofzbo2, boolean teogqflne3) {
        boolean teogqflne3a = teogqflne3;
        float ntrtvofzbo2a = ntrtvofzbo2;
        byte whnexrvrhc1a = whnexrvrhc1;
        float wqlukzlm0a = wqlukzlm0;
        Log.w("CXeKrsWI", "CXeKrsWI" + ntrtvofzbo2a + teogqflne3a + wqlukzlm0a + whnexrvrhc1a + "CXeKrsWI" + DhzZiPE + ykATifX + rCjDtwA + LsmyEcO + KzysdEH + IbkDjGL + oeMEfRr + DOdmZUI + ewYbrRJ + RxukkXT + PhpWrhj + KRYwlqO + ZHjuWTP + UQJHade + KdqiFeN + yWFSznz + TPYQAnp + aJzzKel + "");
    }

    @Nullable
    public final Activity getCurrActivity() {
        boolean teogqflne3 = false;
        float ntrtvofzbo2 = 57.57f;
        byte whnexrvrhc1 = 96;
        float wqlukzlm0 = 51.51f;
        byte vlevzkqq4 = 11;
        int lmobcif3 = 35;
        boolean ufbaikv2 = false;
        short yuqqeyc1 = 75;
        int osxguji0 = 64;
        double auutzis2 = 89.89;
        float ykeuldkl1 = 54.54f;
        boolean ypdosubv0 = false;
        int pqhvqlgxc2 = 34;
        short wnulxapk1 = 27;
        int wieusaa0 = 72;
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void QbSvVCCC(boolean atcxqckol0, float yihffcz1) {
        float yihffcz1a = yihffcz1;
        boolean atcxqckol0a = atcxqckol0;
        new StringReader("QbSvVCCC" + yihffcz1a + atcxqckol0a + "QbSvVCCC" + RxukkXT + ewYbrRJ + TPYQAnp + KzysdEH + UQJHade + DOdmZUI + oeMEfRr + KRYwlqO + IbkDjGL + ykATifX + ZHjuWTP + LsmyEcO + yWFSznz + PhpWrhj + rCjDtwA + KdqiFeN + DhzZiPE + aJzzKel + "");
    }

    //垃圾方法
    private void AKOHXqVO(short synmbnrv0, int pttyoxegy1, long rokbwfyq2, short hjsvaqsvdw3, byte vxchadlp4) {
        byte vxchadlp4a = vxchadlp4;
        short hjsvaqsvdw3a = hjsvaqsvdw3;
        long rokbwfyq2a = rokbwfyq2;
        int pttyoxegy1a = pttyoxegy1;
        short synmbnrv0a = synmbnrv0;
        System.out.println("AKOHXqVO" + vxchadlp4a + synmbnrv0a + hjsvaqsvdw3a + pttyoxegy1a + rokbwfyq2a + "AKOHXqVO" + aJzzKel + RxukkXT + DhzZiPE + IbkDjGL + KzysdEH + KdqiFeN + yWFSznz + KRYwlqO + DOdmZUI + PhpWrhj + oeMEfRr + LsmyEcO + ykATifX + rCjDtwA + ZHjuWTP + ewYbrRJ + UQJHade + TPYQAnp + "");
    }

    //垃圾方法
    private void feSJWYqX(float lfiykeccmk0, char rkhutlz1, int atmdovd2, short bwcqsnz3, int lbmbkmjzq4) {
        int lbmbkmjzq4a = lbmbkmjzq4;
        short bwcqsnz3a = bwcqsnz3;
        int atmdovd2a = atmdovd2;
        char rkhutlz1a = rkhutlz1;
        float lfiykeccmk0a = lfiykeccmk0;
        new WeakReference("feSJWYqX" + atmdovd2a + lfiykeccmk0a + rkhutlz1a + bwcqsnz3a + lbmbkmjzq4a + "feSJWYqX" + TPYQAnp + KzysdEH + DOdmZUI + KdqiFeN + UQJHade + KRYwlqO + ZHjuWTP + yWFSznz + rCjDtwA + IbkDjGL + aJzzKel + ewYbrRJ + DhzZiPE + LsmyEcO + RxukkXT + oeMEfRr + ykATifX + PhpWrhj + "");
    }

    //垃圾方法
    private void NNocwLtL(char ofdtlslvq0, double thuapiixh1, long lxzkfkknw2) {
        long lxzkfkknw2a = lxzkfkknw2;
        double thuapiixh1a = thuapiixh1;
        char ofdtlslvq0a = ofdtlslvq0;
        TextUtils.isDigitsOnly("NNocwLtL" + ofdtlslvq0a + thuapiixh1a + lxzkfkknw2a + "NNocwLtL" + ZHjuWTP + KzysdEH + rCjDtwA + yWFSznz + oeMEfRr + TPYQAnp + aJzzKel + RxukkXT + KdqiFeN + ewYbrRJ + LsmyEcO + DOdmZUI + KRYwlqO + DhzZiPE + IbkDjGL + ykATifX + PhpWrhj + UQJHade + "");
    }

    //垃圾方法
    private void bDUpexOm(short mukehtqmto0, byte azqskxsv1) {
        byte azqskxsv1a = azqskxsv1;
        short mukehtqmto0a = mukehtqmto0;
        new Intent("bDUpexOm" + mukehtqmto0a + azqskxsv1a + "bDUpexOm" + UQJHade + KdqiFeN + ewYbrRJ + RxukkXT + ZHjuWTP + yWFSznz + LsmyEcO + KzysdEH + IbkDjGL + rCjDtwA + ykATifX + DhzZiPE + oeMEfRr + PhpWrhj + aJzzKel + KRYwlqO + DOdmZUI + TPYQAnp + "");
    }

    //垃圾方法
    private void RKPwiyzx(float akpatglr0, short trmbgsk1, int hhkqjbt2, int xuhgwqdgit3) {
        int xuhgwqdgit3a = xuhgwqdgit3;
        int hhkqjbt2a = hhkqjbt2;
        short trmbgsk1a = trmbgsk1;
        float akpatglr0a = akpatglr0;
    }

    //垃圾方法
    private void zsBAtsTL(long dnsvwtw0, double yukeevc1, long bszwekpme2) {
        long bszwekpme2a = bszwekpme2;
        double yukeevc1a = yukeevc1;
        long dnsvwtw0a = dnsvwtw0;
        new Thread("zsBAtsTL" + dnsvwtw0a + bszwekpme2a + yukeevc1a + "zsBAtsTL" + ZHjuWTP + LsmyEcO + TPYQAnp + oeMEfRr + RxukkXT + UQJHade + ewYbrRJ + rCjDtwA + KRYwlqO + KdqiFeN + PhpWrhj + DOdmZUI + ykATifX + DhzZiPE + aJzzKel + IbkDjGL + yWFSznz + KzysdEH + "");
    }

    //垃圾方法
    private void QXPhDJqT(short szivxwu0, float nwidxmgnu1) {
        float nwidxmgnu1a = nwidxmgnu1;
        short szivxwu0a = szivxwu0;
        TextUtils.isEmpty("QXPhDJqT" + nwidxmgnu1a + szivxwu0a + "QXPhDJqT" + ewYbrRJ + IbkDjGL + oeMEfRr + ZHjuWTP + PhpWrhj + DOdmZUI + DhzZiPE + KRYwlqO + yWFSznz + RxukkXT + aJzzKel + LsmyEcO + KdqiFeN + rCjDtwA + KzysdEH + ykATifX + UQJHade + TPYQAnp + "");
    }

    public final void killAllActivity() {
        float nwidxmgnu1 = 28.28f;
        short szivxwu0 = 79;
        long bszwekpme2 = 13L;
        double yukeevc1 = 57.57;
        long dnsvwtw0 = 22L;
        int xuhgwqdgit3 = 18;
        int hhkqjbt2 = 49;
        short trmbgsk1 = 91;
        float akpatglr0 = 17.17f;
        byte azqskxsv1 = 95;
        short mukehtqmto0 = 56;
        long lxzkfkknw2 = 31L;
        double thuapiixh1 = 94.94;
        char ofdtlslvq0 = 46;
        int lbmbkmjzq4 = 35;
        short bwcqsnz3 = 52;
        int atmdovd2 = 32;
        char rkhutlz1 = 97;
        float lfiykeccmk0 = 57.57f;
        byte vxchadlp4 = 6;
        short hjsvaqsvdw3 = 50;
        long rokbwfyq2 = 48L;
        int pttyoxegy1 = 81;
        short synmbnrv0 = 3;
        float yihffcz1 = 17.17f;
        boolean atcxqckol0 = true;
        NNocwLtL(ofdtlslvq0, thuapiixh1, lxzkfkknw2);
        feSJWYqX(lfiykeccmk0, rkhutlz1, atmdovd2, bwcqsnz3, lbmbkmjzq4);
        zsBAtsTL(dnsvwtw0, yukeevc1, bszwekpme2);
        feSJWYqX(lfiykeccmk0, rkhutlz1, atmdovd2, bwcqsnz3, lbmbkmjzq4);
        zsBAtsTL(dnsvwtw0, yukeevc1, bszwekpme2);
        feSJWYqX(lfiykeccmk0, rkhutlz1, atmdovd2, bwcqsnz3, lbmbkmjzq4);
        Iterator<Activity> var3 = livingActivities.iterator();
        QbSvVCCC(atcxqckol0, yihffcz1);
        zsBAtsTL(dnsvwtw0, yukeevc1, bszwekpme2);
        RKPwiyzx(akpatglr0, trmbgsk1, hhkqjbt2, xuhgwqdgit3);
        bDUpexOm(mukehtqmto0, azqskxsv1);
        QbSvVCCC(atcxqckol0, yihffcz1);
        AKOHXqVO(synmbnrv0, pttyoxegy1, rokbwfyq2, hjsvaqsvdw3, vxchadlp4);
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private EasyManager() {
    }

    //垃圾方法
    static private void DytNFzFK(byte udtvduopvl0) {
        byte udtvduopvl0a = udtvduopvl0;
    }

    //垃圾方法
    static private void WdtoSwNh(int vmsdrpvqhm0, float fqxyyfw1, long mdyqqdxt2, double mgfeoofeyv3, double gkphfahrmp4) {
        double gkphfahrmp4a = gkphfahrmp4;
        double mgfeoofeyv3a = mgfeoofeyv3;
        long mdyqqdxt2a = mdyqqdxt2;
        float fqxyyfw1a = fqxyyfw1;
        int vmsdrpvqhm0a = vmsdrpvqhm0;
        Log.i("WdtoSwNh", "WdtoSwNh" + mdyqqdxt2a + fqxyyfw1a + mgfeoofeyv3a + gkphfahrmp4a + vmsdrpvqhm0a + "WdtoSwNh" + "");
    }

    //垃圾方法
    static private void xMomSWEe(float gzqhyzl0, long phhccmfzrb1, short nwxfayflim2) {
        short nwxfayflim2a = nwxfayflim2;
        long phhccmfzrb1a = phhccmfzrb1;
        float gzqhyzl0a = gzqhyzl0;
        new Thread("xMomSWEe" + phhccmfzrb1a + nwxfayflim2a + gzqhyzl0a + "xMomSWEe" + "");
    }

    //垃圾方法
    static private void PhunynRZ(byte omnytlj0, char bgrypqphy1, long fagfwbeok2, char ekyuzfgcpz3) {
        char ekyuzfgcpz3a = ekyuzfgcpz3;
        long fagfwbeok2a = fagfwbeok2;
        char bgrypqphy1a = bgrypqphy1;
        byte omnytlj0a = omnytlj0;
        new Intent("PhunynRZ" + ekyuzfgcpz3a + bgrypqphy1a + fagfwbeok2a + omnytlj0a + "PhunynRZ" + "");
    }

    public static boolean isNotificationEnabled() {
        char ekyuzfgcpz3 = 58;
        long fagfwbeok2 = 26L;
        char bgrypqphy1 = 51;
        byte omnytlj0 = 72;
        short nwxfayflim2 = 47;
        long phhccmfzrb1 = 31L;
        float gzqhyzl0 = 99.99f;
        double gkphfahrmp4 = 1.1;
        double mgfeoofeyv3 = 40.40;
        long mdyqqdxt2 = 83L;
        float fqxyyfw1 = 21.21f;
        int vmsdrpvqhm0 = 25;
        byte udtvduopvl0 = 64;
        PhunynRZ(omnytlj0, bgrypqphy1, fagfwbeok2, ekyuzfgcpz3);
        PhunynRZ(omnytlj0, bgrypqphy1, fagfwbeok2, ekyuzfgcpz3);
        DytNFzFK(udtvduopvl0);
        DytNFzFK(udtvduopvl0);
        DytNFzFK(udtvduopvl0);
        WdtoSwNh(vmsdrpvqhm0, fqxyyfw1, mdyqqdxt2, mgfeoofeyv3, gkphfahrmp4);
        xMomSWEe(gzqhyzl0, phhccmfzrb1, nwxfayflim2);
        WdtoSwNh(vmsdrpvqhm0, fqxyyfw1, mdyqqdxt2, mgfeoofeyv3, gkphfahrmp4);
        return EasyNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void TzZfmibr(int lgmfoqtk0, byte yhtpodlgcz1) {
        byte yhtpodlgcz1a = yhtpodlgcz1;
        int lgmfoqtk0a = lgmfoqtk0;
    }

    //垃圾方法
    static private void gKWvRgTZ(float wqhjorwa0, char scqnisz1) {
        char scqnisz1a = scqnisz1;
        float wqhjorwa0a = wqhjorwa0;
        new StringBuilder("gKWvRgTZ" + scqnisz1a + wqhjorwa0a + "gKWvRgTZ" + "");
    }

    //垃圾方法
    static private void oNtYADyn(float iubuqfwqv0, int tkvbdgxeaj1) {
        int tkvbdgxeaj1a = tkvbdgxeaj1;
        float iubuqfwqv0a = iubuqfwqv0;
        Log.e("oNtYADyn", "oNtYADyn" + tkvbdgxeaj1a + iubuqfwqv0a + "oNtYADyn" + "");
    }

    //垃圾方法
    static private void VZIqsQSt(long hwqzicdfr0, boolean pkarmcgqx1, short zrrlnmqsis2, short ywzwjecch3, byte tifjoknbz4) {
        byte tifjoknbz4a = tifjoknbz4;
        short ywzwjecch3a = ywzwjecch3;
        short zrrlnmqsis2a = zrrlnmqsis2;
        boolean pkarmcgqx1a = pkarmcgqx1;
        long hwqzicdfr0a = hwqzicdfr0;
        new StringReader("VZIqsQSt" + hwqzicdfr0a + pkarmcgqx1a + zrrlnmqsis2a + ywzwjecch3a + tifjoknbz4a + "VZIqsQSt" + "");
    }

    //垃圾方法
    static private void YruPZSCt(double iiikonh0, int hfgdkigim1, byte wmlgrqwjfd2, char jehviyktrp3, int schennbwuo4) {
        int schennbwuo4a = schennbwuo4;
        char jehviyktrp3a = jehviyktrp3;
        byte wmlgrqwjfd2a = wmlgrqwjfd2;
        int hfgdkigim1a = hfgdkigim1;
        double iiikonh0a = iiikonh0;
        TextUtils.isDigitsOnly("YruPZSCt" + iiikonh0a + jehviyktrp3a + wmlgrqwjfd2a + schennbwuo4a + hfgdkigim1a + "YruPZSCt" + "");
    }

    //垃圾方法
    static private void nxwwBDus(short euobgddhq0, char rwoasbdosi1) {
        char rwoasbdosi1a = rwoasbdosi1;
        short euobgddhq0a = euobgddhq0;
        Log.w("nxwwBDus", "nxwwBDus" + rwoasbdosi1a + euobgddhq0a + "nxwwBDus" + "");
    }

    //垃圾方法
    static private void zelmOTyy(double nhbtazwx0, long wlggieobak1, char fvqradg2, double mptwmnked3) {
        double mptwmnked3a = mptwmnked3;
        char fvqradg2a = fvqradg2;
        long wlggieobak1a = wlggieobak1;
        double nhbtazwx0a = nhbtazwx0;
        new AttributedString("zelmOTyy" + mptwmnked3a + wlggieobak1a + fvqradg2a + nhbtazwx0a + "zelmOTyy" + "");
    }

    //垃圾方法
    static private void NpsxCSiW(float rtnrclipz0, char narcsqagi1, boolean kxjrjztjff2, long dkntwzaf3, long ehfstvu4) {
        long ehfstvu4a = ehfstvu4;
        long dkntwzaf3a = dkntwzaf3;
        boolean kxjrjztjff2a = kxjrjztjff2;
        char narcsqagi1a = narcsqagi1;
        float rtnrclipz0a = rtnrclipz0;
        Log.e("NpsxCSiW", "NpsxCSiW" + ehfstvu4a + kxjrjztjff2a + rtnrclipz0a + dkntwzaf3a + narcsqagi1a + "NpsxCSiW" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        long ehfstvu4 = 97L;
        long dkntwzaf3 = 14L;
        boolean kxjrjztjff2 = false;
        char narcsqagi1 = 89;
        float rtnrclipz0 = 31.31f;
        double mptwmnked3 = 51.51;
        char fvqradg2 = 29;
        long wlggieobak1 = 66L;
        double nhbtazwx0 = 75.75;
        char rwoasbdosi1 = 49;
        short euobgddhq0 = 42;
        int schennbwuo4 = 53;
        char jehviyktrp3 = 34;
        byte wmlgrqwjfd2 = 72;
        int hfgdkigim1 = 90;
        double iiikonh0 = 3.3;
        byte tifjoknbz4 = 29;
        short ywzwjecch3 = 44;
        short zrrlnmqsis2 = 37;
        boolean pkarmcgqx1 = true;
        long hwqzicdfr0 = 10L;
        int tkvbdgxeaj1 = 26;
        float iubuqfwqv0 = 86.86f;
        char scqnisz1 = 21;
        float wqhjorwa0 = 86.86f;
        byte yhtpodlgcz1 = 99;
        int lgmfoqtk0 = 18;
        if (VERSION.SDK_INT >= 28) {
            Log.e("xxx", "Application.getProcessName()=" + Application.getProcessName());
        }
        gKWvRgTZ(wqhjorwa0, scqnisz1);
        zelmOTyy(nhbtazwx0, wlggieobak1, fvqradg2, mptwmnked3);
        TzZfmibr(lgmfoqtk0, yhtpodlgcz1);
        TzZfmibr(lgmfoqtk0, yhtpodlgcz1);
        zelmOTyy(nhbtazwx0, wlggieobak1, fvqradg2, mptwmnked3);
        zelmOTyy(nhbtazwx0, wlggieobak1, fvqradg2, mptwmnked3);
        VZIqsQSt(hwqzicdfr0, pkarmcgqx1, zrrlnmqsis2, ywzwjecch3, tifjoknbz4);
        if (VERSION.SDK_INT >= 28) {
            YruPZSCt(iiikonh0, hfgdkigim1, wmlgrqwjfd2, jehviyktrp3, schennbwuo4);
            TzZfmibr(lgmfoqtk0, yhtpodlgcz1);
            YruPZSCt(iiikonh0, hfgdkigim1, wmlgrqwjfd2, jehviyktrp3, schennbwuo4);
            oNtYADyn(iubuqfwqv0, tkvbdgxeaj1);
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
    static private void SGADEpKU(byte rgjxnoggi0, double mmwbeiknz1, boolean sidvtph2, short pszcowoc3, long juaiywfar4) {
        long juaiywfar4a = juaiywfar4;
        short pszcowoc3a = pszcowoc3;
        boolean sidvtph2a = sidvtph2;
        double mmwbeiknz1a = mmwbeiknz1;
        byte rgjxnoggi0a = rgjxnoggi0;
        new StringReader("SGADEpKU" + mmwbeiknz1a + sidvtph2a + pszcowoc3a + rgjxnoggi0a + juaiywfar4a + "SGADEpKU" + "");
    }

    //垃圾方法
    static private void nBFoqQOk(long whywqmkqt0, short byznvpy1, boolean lpbiopwc2, long tpxtpfkvvt3, int lsmwnvp4) {
        int lsmwnvp4a = lsmwnvp4;
        long tpxtpfkvvt3a = tpxtpfkvvt3;
        boolean lpbiopwc2a = lpbiopwc2;
        short byznvpy1a = byznvpy1;
        long whywqmkqt0a = whywqmkqt0;
        new Thread("nBFoqQOk" + tpxtpfkvvt3a + whywqmkqt0a + lpbiopwc2a + lsmwnvp4a + byznvpy1a + "nBFoqQOk" + "");
    }

    //垃圾方法
    static private void pMrIBDoK(double iyajknkusu0, float nysgaansa1, char rlibcsvaae2) {
        char rlibcsvaae2a = rlibcsvaae2;
        float nysgaansa1a = nysgaansa1;
        double iyajknkusu0a = iyajknkusu0;
        Log.e("pMrIBDoK", "pMrIBDoK" + rlibcsvaae2a + iyajknkusu0a + nysgaansa1a + "pMrIBDoK" + "");
    }

    //垃圾方法
    static private void zSRnZOjm(int xuoliokqay0, boolean gckzfmkpxu1, int qvehstsou2) {
        int qvehstsou2a = qvehstsou2;
        boolean gckzfmkpxu1a = gckzfmkpxu1;
        int xuoliokqay0a = xuoliokqay0;
        TextUtils.isDigitsOnly("zSRnZOjm" + gckzfmkpxu1a + qvehstsou2a + xuoliokqay0a + "zSRnZOjm" + "");
    }

    public static void testFcmToken(String token) {
        int qvehstsou2 = 60;
        boolean gckzfmkpxu1 = true;
        int xuoliokqay0 = 87;
        char rlibcsvaae2 = 3;
        float nysgaansa1 = 64.64f;
        double iyajknkusu0 = 48.48;
        int lsmwnvp4 = 53;
        long tpxtpfkvvt3 = 58L;
        boolean lpbiopwc2 = false;
        short byznvpy1 = 25;
        long whywqmkqt0 = 99L;
        long juaiywfar4 = 31L;
        short pszcowoc3 = 37;
        boolean sidvtph2 = false;
        double mmwbeiknz1 = 4.4;
        byte rgjxnoggi0 = 19;
        EasyMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void AEwEydPy(int llvqktjwxa0, short pfoblxb1) {
            short pfoblxb1a = pfoblxb1;
            int llvqktjwxa0a = llvqktjwxa0;
            new String("AEwEydPy" + llvqktjwxa0a + pfoblxb1a + "AEwEydPy" + "" + "");
        }

        //垃圾方法
        private void qorMQHqA(float pwbbvpvrqn0, char jxbkkrxkzi1, long nhgsxwzb2) {
            long nhgsxwzb2a = nhgsxwzb2;
            char jxbkkrxkzi1a = jxbkkrxkzi1;
            float pwbbvpvrqn0a = pwbbvpvrqn0;
            new StringBuffer("qorMQHqA" + jxbkkrxkzi1a + pwbbvpvrqn0a + nhgsxwzb2a + "qorMQHqA" + "" + "");
        }

        //垃圾方法
        private void YULaWEXZ(byte qncmitmd0, long trdfwhnv1, short glwqioa2, long znoamwsy3, float pkmtevq4) {
            float pkmtevq4a = pkmtevq4;
            long znoamwsy3a = znoamwsy3;
            short glwqioa2a = glwqioa2;
            long trdfwhnv1a = trdfwhnv1;
            byte qncmitmd0a = qncmitmd0;
            new WeakReference("YULaWEXZ" + qncmitmd0a + glwqioa2a + pkmtevq4a + znoamwsy3a + trdfwhnv1a + "YULaWEXZ" + "" + "");
        }

        //垃圾方法
        private void ASHySGdQ(char zujwvvxvi0, int rsvgoay1, float whvycni2, boolean gxrajcoffw3, byte lhdqlsv4) {
            byte lhdqlsv4a = lhdqlsv4;
            boolean gxrajcoffw3a = gxrajcoffw3;
            float whvycni2a = whvycni2;
            int rsvgoay1a = rsvgoay1;
            char zujwvvxvi0a = zujwvvxvi0;
            new File("ASHySGdQ" + zujwvvxvi0a + whvycni2a + rsvgoay1a + gxrajcoffw3a + lhdqlsv4a + "ASHySGdQ" + "" + "");
        }

        //垃圾方法
        private void VEUpKQcV(char vnknpkuyhe0) {
            char vnknpkuyhe0a = vnknpkuyhe0;
            new File("VEUpKQcV" + vnknpkuyhe0a + "VEUpKQcV" + "" + "");
        }

        //垃圾方法
        private void cyUOGaGF(byte ypjevne0, short ooawgbxliy1) {
            short ooawgbxliy1a = ooawgbxliy1;
            byte ypjevne0a = ypjevne0;
            Log.e("cyUOGaGF", "cyUOGaGF" + ypjevne0a + ooawgbxliy1a + "cyUOGaGF" + "" + "");
        }

        //垃圾方法
        private void jaFBFcMv(float qqcvdqotc0, char qtsaccuf1, byte quvfmtca2, double lkgyqmvmb3, int evxjbugqpr4) {
            int evxjbugqpr4a = evxjbugqpr4;
            double lkgyqmvmb3a = lkgyqmvmb3;
            byte quvfmtca2a = quvfmtca2;
            char qtsaccuf1a = qtsaccuf1;
            float qqcvdqotc0a = qqcvdqotc0;
            new String("jaFBFcMv" + quvfmtca2a + qtsaccuf1a + evxjbugqpr4a + lkgyqmvmb3a + qqcvdqotc0a + "jaFBFcMv" + "" + "");
        }

        //垃圾方法
        private void CyTMTjuJ(char gnuyiwos0) {
            char gnuyiwos0a = gnuyiwos0;
            Log.i("CyTMTjuJ", "CyTMTjuJ" + gnuyiwos0a + "CyTMTjuJ" + "" + "");
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            char gnuyiwos0 = 84;
            int evxjbugqpr4 = 6;
            double lkgyqmvmb3 = 7.7;
            byte quvfmtca2 = 61;
            char qtsaccuf1 = 98;
            float qqcvdqotc0 = 60.60f;
            short ooawgbxliy1 = 84;
            byte ypjevne0 = 83;
            char vnknpkuyhe0 = 25;
            byte lhdqlsv4 = 17;
            boolean gxrajcoffw3 = true;
            float whvycni2 = 78.78f;
            int rsvgoay1 = 76;
            char zujwvvxvi0 = 42;
            float pkmtevq4 = 30.30f;
            long znoamwsy3 = 56L;
            short glwqioa2 = 82;
            long trdfwhnv1 = 41L;
            byte qncmitmd0 = 52;
            long nhgsxwzb2 = 14L;
            char jxbkkrxkzi1 = 70;
            float pwbbvpvrqn0 = 69.69f;
            short pfoblxb1 = 31;
            int llvqktjwxa0 = 50;
            qorMQHqA(pwbbvpvrqn0, jxbkkrxkzi1, nhgsxwzb2);
            jaFBFcMv(qqcvdqotc0, qtsaccuf1, quvfmtca2, lkgyqmvmb3, evxjbugqpr4);
            qorMQHqA(pwbbvpvrqn0, jxbkkrxkzi1, nhgsxwzb2);
            jaFBFcMv(qqcvdqotc0, qtsaccuf1, quvfmtca2, lkgyqmvmb3, evxjbugqpr4);
            EasySPUtils.putLong("lastActivityOnPause", 0L);
            jaFBFcMv(qqcvdqotc0, qtsaccuf1, quvfmtca2, lkgyqmvmb3, evxjbugqpr4);
            CyTMTjuJ(gnuyiwos0);
            CyTMTjuJ(gnuyiwos0);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void YHzHebOZ(double gbhtvieu0) {
            double gbhtvieu0a = gbhtvieu0;
            new WeakReference("YHzHebOZ" + gbhtvieu0a + "YHzHebOZ" + "" + "");
        }

        //垃圾方法
        private void qXiHPyEU(float oztluphb0, long ebrvccjydh1) {
            long ebrvccjydh1a = ebrvccjydh1;
            float oztluphb0a = oztluphb0;
            new String("qXiHPyEU" + ebrvccjydh1a + oztluphb0a + "qXiHPyEU" + "" + "");
        }

        //垃圾方法
        private void KJWOAALP(char sdvxlgo0) {
            char sdvxlgo0a = sdvxlgo0;
            new AttributedString("KJWOAALP" + sdvxlgo0a + "KJWOAALP" + "" + "");
        }

        //垃圾方法
        private void qahEmGWu(double jiiwqvxpl0, float seoisfqwts1, int lrstzxons2, int hftnaiapuh3) {
            int hftnaiapuh3a = hftnaiapuh3;
            int lrstzxons2a = lrstzxons2;
            float seoisfqwts1a = seoisfqwts1;
            double jiiwqvxpl0a = jiiwqvxpl0;
            new StringBuffer("qahEmGWu" + hftnaiapuh3a + lrstzxons2a + jiiwqvxpl0a + seoisfqwts1a + "qahEmGWu" + "" + "");
        }

        //垃圾方法
        private void hRTQepXd(long xrbesbn0) {
            long xrbesbn0a = xrbesbn0;
            Log.w("hRTQepXd", "hRTQepXd" + xrbesbn0a + "hRTQepXd" + "" + "");
        }

        //垃圾方法
        private void YRJecRNy(boolean hhohlhpqcz0, char rvjewbx1, short nhqlqimbos2) {
            short nhqlqimbos2a = nhqlqimbos2;
            char rvjewbx1a = rvjewbx1;
            boolean hhohlhpqcz0a = hhohlhpqcz0;
            new AttributedString("YRJecRNy" + nhqlqimbos2a + hhohlhpqcz0a + rvjewbx1a + "YRJecRNy" + "" + "");
        }

        //垃圾方法
        private void DMoyrOxN(double ljuhrday0) {
            double ljuhrday0a = ljuhrday0;
            new Intent("DMoyrOxN" + ljuhrday0a + "DMoyrOxN" + "" + "");
        }

        //垃圾方法
        private void PhcmfKMJ(char pxkxdtvmf0, float pgtbqunl1, long ktbopje2, byte wzuyjdpql3, double owystijq4) {
            double owystijq4a = owystijq4;
            byte wzuyjdpql3a = wzuyjdpql3;
            long ktbopje2a = ktbopje2;
            float pgtbqunl1a = pgtbqunl1;
            char pxkxdtvmf0a = pxkxdtvmf0;
            System.out.println("PhcmfKMJ" + owystijq4a + ktbopje2a + pgtbqunl1a + pxkxdtvmf0a + wzuyjdpql3a + "PhcmfKMJ" + "" + "");
        }

        //垃圾方法
        private void GVECOmYZ(int qdncdzofh0, double rgytbjfse1, short tnztlio2) {
            short tnztlio2a = tnztlio2;
            double rgytbjfse1a = rgytbjfse1;
            int qdncdzofh0a = qdncdzofh0;
            Log.e("GVECOmYZ", "GVECOmYZ" + tnztlio2a + qdncdzofh0a + rgytbjfse1a + "GVECOmYZ" + "" + "");
        }

        //垃圾方法
        private void YGBXtEsz(boolean stjiviyfw0) {
            boolean stjiviyfw0a = stjiviyfw0;
            new WeakReference("YGBXtEsz" + stjiviyfw0a + "YGBXtEsz" + "" + "");
        }

        //垃圾方法
        private void qgaVjBPE(float ixcdtszm0, int urflljoxqp1, int vpvlizs2, float hjbegxjjca3, boolean rmoptyw4) {
            boolean rmoptyw4a = rmoptyw4;
            float hjbegxjjca3a = hjbegxjjca3;
            int vpvlizs2a = vpvlizs2;
            int urflljoxqp1a = urflljoxqp1;
            float ixcdtszm0a = ixcdtszm0;
            new StringBuilder("qgaVjBPE" + hjbegxjjca3a + urflljoxqp1a + rmoptyw4a + ixcdtszm0a + vpvlizs2a + "qgaVjBPE" + "" + "");
        }

        //垃圾方法
        private void MVpjgWGK(float mrqzynp0) {
            float mrqzynp0a = mrqzynp0;
            Log.e("MVpjgWGK", "MVpjgWGK" + mrqzynp0a + "MVpjgWGK" + "" + "");
        }

        //垃圾方法
        private void qRgHpjwK(double gsretobqc0) {
            double gsretobqc0a = gsretobqc0;
            TextUtils.isDigitsOnly("qRgHpjwK" + gsretobqc0a + "qRgHpjwK" + "" + "");
        }

        //垃圾方法
        private void kZPQakji(float xgcchjy0) {
            float xgcchjy0a = xgcchjy0;
            Log.i("kZPQakji", "kZPQakji" + xgcchjy0a + "kZPQakji" + "" + "");
        }

        //垃圾方法
        private void XPSDwwKF(short zoemcttk0, short tcqbdbgm1) {
            short tcqbdbgm1a = tcqbdbgm1;
            short zoemcttk0a = zoemcttk0;
            TextUtils.isDigitsOnly("XPSDwwKF" + tcqbdbgm1a + zoemcttk0a + "XPSDwwKF" + "" + "");
        }

        //垃圾方法
        private void YAopwWgx(int ihgeacvv0, short kyucwkost1, long dlnmisseap2, long gdlhlxrshe3) {
            long gdlhlxrshe3a = gdlhlxrshe3;
            long dlnmisseap2a = dlnmisseap2;
            short kyucwkost1a = kyucwkost1;
            int ihgeacvv0a = ihgeacvv0;
            new File("YAopwWgx" + kyucwkost1a + gdlhlxrshe3a + dlnmisseap2a + ihgeacvv0a + "YAopwWgx" + "" + "");
        }

        //垃圾方法
        private void nNQQnNpt(boolean gfjpnedi0, float iwpodwxyh1, boolean txolihy2, double bfnaugt3) {
            double bfnaugt3a = bfnaugt3;
            boolean txolihy2a = txolihy2;
            float iwpodwxyh1a = iwpodwxyh1;
            boolean gfjpnedi0a = gfjpnedi0;
        }

        //垃圾方法
        private void IdmShZCd(double hambgawuav0, byte zvbmsser1) {
            byte zvbmsser1a = zvbmsser1;
            double hambgawuav0a = hambgawuav0;
            System.out.println("IdmShZCd" + hambgawuav0a + zvbmsser1a + "IdmShZCd" + "" + "");
        }

        //垃圾方法
        private void drwyqTGR(char yvdoeos0, boolean klvscatemg1, int wxnrwgky2, float ddufylluh3, byte jqkkvtmbx4) {
            byte jqkkvtmbx4a = jqkkvtmbx4;
            float ddufylluh3a = ddufylluh3;
            int wxnrwgky2a = wxnrwgky2;
            boolean klvscatemg1a = klvscatemg1;
            char yvdoeos0a = yvdoeos0;
            new String("drwyqTGR" + ddufylluh3a + yvdoeos0a + jqkkvtmbx4a + klvscatemg1a + wxnrwgky2a + "drwyqTGR" + "" + "");
        }

        //垃圾方法
        private void hYOohLRH(double pugequv0, boolean psvnhzhyy1, boolean mamelio2, int mbdwwfd3) {
            int mbdwwfd3a = mbdwwfd3;
            boolean mamelio2a = mamelio2;
            boolean psvnhzhyy1a = psvnhzhyy1;
            double pugequv0a = pugequv0;
            new Intent("hYOohLRH" + pugequv0a + mbdwwfd3a + psvnhzhyy1a + mamelio2a + "hYOohLRH" + "" + "");
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            int mbdwwfd3 = 48;
            boolean mamelio2 = false;
            boolean psvnhzhyy1 = true;
            double pugequv0 = 14.14;
            byte jqkkvtmbx4 = 30;
            float ddufylluh3 = 65.65f;
            int wxnrwgky2 = 67;
            boolean klvscatemg1 = true;
            char yvdoeos0 = 57;
            byte zvbmsser1 = 69;
            double hambgawuav0 = 85.85;
            double bfnaugt3 = 44.44;
            boolean txolihy2 = false;
            float iwpodwxyh1 = 28.28f;
            boolean gfjpnedi0 = true;
            long gdlhlxrshe3 = 3L;
            long dlnmisseap2 = 83L;
            short kyucwkost1 = 80;
            int ihgeacvv0 = 70;
            short tcqbdbgm1 = 81;
            short zoemcttk0 = 41;
            float xgcchjy0 = 59.59f;
            double gsretobqc0 = 44.44;
            float mrqzynp0 = 14.14f;
            boolean rmoptyw4 = false;
            float hjbegxjjca3 = 65.65f;
            int vpvlizs2 = 86;
            int urflljoxqp1 = 39;
            float ixcdtszm0 = 92.92f;
            boolean stjiviyfw0 = false;
            short tnztlio2 = 8;
            double rgytbjfse1 = 17.17;
            int qdncdzofh0 = 62;
            double owystijq4 = 61.61;
            byte wzuyjdpql3 = 85;
            long ktbopje2 = 16L;
            float pgtbqunl1 = 50.50f;
            char pxkxdtvmf0 = 40;
            double ljuhrday0 = 77.77;
            short nhqlqimbos2 = 24;
            char rvjewbx1 = 87;
            boolean hhohlhpqcz0 = true;
            long xrbesbn0 = 33L;
            int hftnaiapuh3 = 67;
            int lrstzxons2 = 15;
            float seoisfqwts1 = 84.84f;
            double jiiwqvxpl0 = 68.68;
            char sdvxlgo0 = 49;
            long ebrvccjydh1 = 27L;
            float oztluphb0 = 74.74f;
            double gbhtvieu0 = 62.62;
            EasySPUtils.putLong("lastActivityOnPause", 0L);
            EasyManager.INSTANCE.setCurrentActivity(activity);
            EasyManager.creatingActivities.add(activity);
            EasyManager.livingActivities.add(activity);
            EasyManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void tlOgksQR(float ogizkvto0, int omcuinbax1, double eeccuck2, byte vzltzbpl3, boolean fiofzfhmqp4) {
            boolean fiofzfhmqp4a = fiofzfhmqp4;
            byte vzltzbpl3a = vzltzbpl3;
            double eeccuck2a = eeccuck2;
            int omcuinbax1a = omcuinbax1;
            float ogizkvto0a = ogizkvto0;
            new WeakReference("tlOgksQR" + omcuinbax1a + eeccuck2a + vzltzbpl3a + ogizkvto0a + fiofzfhmqp4a + "tlOgksQR" + "" + "");
        }

        //垃圾方法
        private void lYsYaEZo(int hldintm0, short wnpqgta1, boolean amszkxyrc2, long ziaoydiaw3, int yfmfendube4) {
            int yfmfendube4a = yfmfendube4;
            long ziaoydiaw3a = ziaoydiaw3;
            boolean amszkxyrc2a = amszkxyrc2;
            short wnpqgta1a = wnpqgta1;
            int hldintm0a = hldintm0;
            new Thread("lYsYaEZo" + hldintm0a + ziaoydiaw3a + amszkxyrc2a + yfmfendube4a + wnpqgta1a + "lYsYaEZo" + "" + "");
        }

        //垃圾方法
        private void YkTIpEhT(char doinrmxbg0, long sexftglg1) {
            long sexftglg1a = sexftglg1;
            char doinrmxbg0a = doinrmxbg0;
            new WeakReference("YkTIpEhT" + doinrmxbg0a + sexftglg1a + "YkTIpEhT" + "" + "");
        }

        //垃圾方法
        private void UcoRxQJT(long ivpkttq0, long vixhvhk1, float kxdyjnzdvo2, byte quueoqh3, byte mcfcjrmwns4) {
            byte mcfcjrmwns4a = mcfcjrmwns4;
            byte quueoqh3a = quueoqh3;
            float kxdyjnzdvo2a = kxdyjnzdvo2;
            long vixhvhk1a = vixhvhk1;
            long ivpkttq0a = ivpkttq0;
            new Thread("UcoRxQJT" + mcfcjrmwns4a + vixhvhk1a + kxdyjnzdvo2a + ivpkttq0a + quueoqh3a + "UcoRxQJT" + "" + "");
        }

        public void onActivityStarted(@NotNull Activity activity) {
            byte mcfcjrmwns4 = 61;
            byte quueoqh3 = 67;
            float kxdyjnzdvo2 = 71.71f;
            long vixhvhk1 = 65L;
            long ivpkttq0 = 37L;
            long sexftglg1 = 99L;
            char doinrmxbg0 = 64;
            int yfmfendube4 = 71;
            long ziaoydiaw3 = 100L;
            boolean amszkxyrc2 = true;
            short wnpqgta1 = 18;
            int hldintm0 = 53;
            boolean fiofzfhmqp4 = true;
            byte vzltzbpl3 = 80;
            double eeccuck2 = 96.96;
            int omcuinbax1 = 99;
            float ogizkvto0 = 15.15f;
            EasyManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void eCZXKgOP(boolean nsxldaoi0) {
            boolean nsxldaoi0a = nsxldaoi0;
            new AttributedString("eCZXKgOP" + nsxldaoi0a + "eCZXKgOP" + "" + "");
        }

        //垃圾方法
        private void ImgvUclJ(byte pawhjilwj0, byte wupbumto1, long yoncuukrkn2, float nfquokhot3, boolean pbjaqoyhrz4) {
            boolean pbjaqoyhrz4a = pbjaqoyhrz4;
            float nfquokhot3a = nfquokhot3;
            long yoncuukrkn2a = yoncuukrkn2;
            byte wupbumto1a = wupbumto1;
            byte pawhjilwj0a = pawhjilwj0;
        }

        //垃圾方法
        private void eZXbWdwo(int flbstvzzoo0, float cogzzhv1, boolean tmlctqtsh2) {
            boolean tmlctqtsh2a = tmlctqtsh2;
            float cogzzhv1a = cogzzhv1;
            int flbstvzzoo0a = flbstvzzoo0;
            new StringBuffer("eZXbWdwo" + tmlctqtsh2a + flbstvzzoo0a + cogzzhv1a + "eZXbWdwo" + "" + "");
        }

        //垃圾方法
        private void BuhLwKfL(boolean octcbpc0, int glzlpsz1, byte aeswhznn2, double owirjerknj3, long jrevngmela4) {
            long jrevngmela4a = jrevngmela4;
            double owirjerknj3a = owirjerknj3;
            byte aeswhznn2a = aeswhznn2;
            int glzlpsz1a = glzlpsz1;
            boolean octcbpc0a = octcbpc0;
            TextUtils.isEmpty("BuhLwKfL" + glzlpsz1a + owirjerknj3a + jrevngmela4a + aeswhznn2a + octcbpc0a + "BuhLwKfL" + "" + "");
        }

        //垃圾方法
        private void lbToPVWu(boolean rglbuvwlvd0, char wwrdtxn1, int tiwttazgao2, boolean fhiymgpbql3, float uqejuvpmg4) {
            float uqejuvpmg4a = uqejuvpmg4;
            boolean fhiymgpbql3a = fhiymgpbql3;
            int tiwttazgao2a = tiwttazgao2;
            char wwrdtxn1a = wwrdtxn1;
            boolean rglbuvwlvd0a = rglbuvwlvd0;
            new WeakReference("lbToPVWu" + wwrdtxn1a + rglbuvwlvd0a + uqejuvpmg4a + tiwttazgao2a + fhiymgpbql3a + "lbToPVWu" + "" + "");
        }

        //垃圾方法
        private void wbGWIWiG(long dgsupmyz0, short ydsdxtrbt1, byte srkvnrnstn2, short bitpnqym3) {
            short bitpnqym3a = bitpnqym3;
            byte srkvnrnstn2a = srkvnrnstn2;
            short ydsdxtrbt1a = ydsdxtrbt1;
            long dgsupmyz0a = dgsupmyz0;
        }

        //垃圾方法
        private void LHOvPSCU(double xkvynif0, double cgloupormi1, boolean iqwidef2) {
            boolean iqwidef2a = iqwidef2;
            double cgloupormi1a = cgloupormi1;
            double xkvynif0a = xkvynif0;
            Log.e("LHOvPSCU", "LHOvPSCU" + iqwidef2a + xkvynif0a + cgloupormi1a + "LHOvPSCU" + "" + "");
        }

        //垃圾方法
        private void loEebyfD(int grqxnld0, boolean tietkayezf1) {
            boolean tietkayezf1a = tietkayezf1;
            int grqxnld0a = grqxnld0;
            new StringBuilder("loEebyfD" + tietkayezf1a + grqxnld0a + "loEebyfD" + "" + "");
        }

        //垃圾方法
        private void GuvGAFRX(boolean qdbicica0, long xtllqdb1, double ocfrlhuubd2, byte fjvzghn3, long rmqlnwlfc4) {
            long rmqlnwlfc4a = rmqlnwlfc4;
            byte fjvzghn3a = fjvzghn3;
            double ocfrlhuubd2a = ocfrlhuubd2;
            long xtllqdb1a = xtllqdb1;
            boolean qdbicica0a = qdbicica0;
            new StringBuilder("GuvGAFRX" + fjvzghn3a + qdbicica0a + rmqlnwlfc4a + xtllqdb1a + ocfrlhuubd2a + "GuvGAFRX" + "" + "");
        }

        //垃圾方法
        private void mfgDKMoZ(double quooyclp0, byte ftuivxgad1) {
            byte ftuivxgad1a = ftuivxgad1;
            double quooyclp0a = quooyclp0;
            new Intent("mfgDKMoZ" + ftuivxgad1a + quooyclp0a + "mfgDKMoZ" + "" + "");
        }

        //垃圾方法
        private void NpxPDOph(short kfkeaxiwq0, boolean fonlabjnng1) {
            boolean fonlabjnng1a = fonlabjnng1;
            short kfkeaxiwq0a = kfkeaxiwq0;
            Log.i("NpxPDOph", "NpxPDOph" + kfkeaxiwq0a + fonlabjnng1a + "NpxPDOph" + "" + "");
        }

        //垃圾方法
        private void KBwuyjEW(float kvspgtdg0, short ttofpydqow1) {
            short ttofpydqow1a = ttofpydqow1;
            float kvspgtdg0a = kvspgtdg0;
            new String("KBwuyjEW" + ttofpydqow1a + kvspgtdg0a + "KBwuyjEW" + "" + "");
        }

        //垃圾方法
        private void twaFyXbY(byte xlqddffg0, char sisixmf1) {
            char sisixmf1a = sisixmf1;
            byte xlqddffg0a = xlqddffg0;
        }

        //垃圾方法
        private void ouGUSHLB(float ujqaejrha0, byte fdzupami1, float hubumoabr2, byte ykdpdnr3) {
            byte ykdpdnr3a = ykdpdnr3;
            float hubumoabr2a = hubumoabr2;
            byte fdzupami1a = fdzupami1;
            float ujqaejrha0a = ujqaejrha0;
            new StringBuffer("ouGUSHLB" + ykdpdnr3a + hubumoabr2a + fdzupami1a + ujqaejrha0a + "ouGUSHLB" + "" + "");
        }

        //垃圾方法
        private void FXyqqKks(byte jzwzdixmld0) {
            byte jzwzdixmld0a = jzwzdixmld0;
            new String("FXyqqKks" + jzwzdixmld0a + "FXyqqKks" + "" + "");
        }

        //垃圾方法
        private void WcGjxfJR(short itmavapw0, int isurlrfy1, char cnbjwyijng2, byte yvbvocxnz3) {
            byte yvbvocxnz3a = yvbvocxnz3;
            char cnbjwyijng2a = cnbjwyijng2;
            int isurlrfy1a = isurlrfy1;
            short itmavapw0a = itmavapw0;
            new StringBuffer("WcGjxfJR" + itmavapw0a + isurlrfy1a + cnbjwyijng2a + yvbvocxnz3a + "WcGjxfJR" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            byte yvbvocxnz3 = 31;
            char cnbjwyijng2 = 29;
            int isurlrfy1 = 26;
            short itmavapw0 = 73;
            byte jzwzdixmld0 = 72;
            byte ykdpdnr3 = 34;
            float hubumoabr2 = 71.71f;
            byte fdzupami1 = 70;
            float ujqaejrha0 = 98.98f;
            char sisixmf1 = 31;
            byte xlqddffg0 = 61;
            short ttofpydqow1 = 69;
            float kvspgtdg0 = 59.59f;
            boolean fonlabjnng1 = false;
            short kfkeaxiwq0 = 56;
            byte ftuivxgad1 = 46;
            double quooyclp0 = 80.80;
            long rmqlnwlfc4 = 0L;
            byte fjvzghn3 = 61;
            double ocfrlhuubd2 = 22.22;
            long xtllqdb1 = 100L;
            boolean qdbicica0 = false;
            boolean tietkayezf1 = false;
            int grqxnld0 = 31;
            boolean iqwidef2 = false;
            double cgloupormi1 = 61.61;
            double xkvynif0 = 64.64;
            short bitpnqym3 = 82;
            byte srkvnrnstn2 = 67;
            short ydsdxtrbt1 = 32;
            long dgsupmyz0 = 95L;
            float uqejuvpmg4 = 94.94f;
            boolean fhiymgpbql3 = true;
            int tiwttazgao2 = 71;
            char wwrdtxn1 = 64;
            boolean rglbuvwlvd0 = true;
            long jrevngmela4 = 91L;
            double owirjerknj3 = 10.10;
            byte aeswhznn2 = 4;
            int glzlpsz1 = 23;
            boolean octcbpc0 = true;
            boolean tmlctqtsh2 = false;
            float cogzzhv1 = 86.86f;
            int flbstvzzoo0 = 67;
            boolean pbjaqoyhrz4 = true;
            float nfquokhot3 = 20.20f;
            long yoncuukrkn2 = 32L;
            byte wupbumto1 = 59;
            byte pawhjilwj0 = 98;
            boolean nsxldaoi0 = false;
            WcGjxfJR(itmavapw0, isurlrfy1, cnbjwyijng2, yvbvocxnz3);
            twaFyXbY(xlqddffg0, sisixmf1);
            ImgvUclJ(pawhjilwj0, wupbumto1, yoncuukrkn2, nfquokhot3, pbjaqoyhrz4);
            loEebyfD(grqxnld0, tietkayezf1);
            eZXbWdwo(flbstvzzoo0, cogzzhv1, tmlctqtsh2);
            GuvGAFRX(qdbicica0, xtllqdb1, ocfrlhuubd2, fjvzghn3, rmqlnwlfc4);
            loEebyfD(grqxnld0, tietkayezf1);
            eCZXKgOP(nsxldaoi0);
            EasySPUtils.putLong("lastActivityOnPause", 0L);
            EasyManager.INSTANCE.setCurrentActivity(activity);
            EasyManager.creatingActivities.remove(activity);
            BuhLwKfL(octcbpc0, glzlpsz1, aeswhznn2, owirjerknj3, jrevngmela4);
            BuhLwKfL(octcbpc0, glzlpsz1, aeswhznn2, owirjerknj3, jrevngmela4);
            ImgvUclJ(pawhjilwj0, wupbumto1, yoncuukrkn2, nfquokhot3, pbjaqoyhrz4);
            EasyManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void SZnxyojl(byte mmvjobtxb0, int weobvkiuac1, float yaagbctp2) {
            float yaagbctp2a = yaagbctp2;
            int weobvkiuac1a = weobvkiuac1;
            byte mmvjobtxb0a = mmvjobtxb0;
            TextUtils.isEmpty("SZnxyojl" + mmvjobtxb0a + yaagbctp2a + weobvkiuac1a + "SZnxyojl" + "" + "");
        }

        //垃圾方法
        private void vEyXhqfn(long znkymudyda0, byte hpqvjaosrq1, short hhpmjwlosj2, float uvbbjsci3) {
            float uvbbjsci3a = uvbbjsci3;
            short hhpmjwlosj2a = hhpmjwlosj2;
            byte hpqvjaosrq1a = hpqvjaosrq1;
            long znkymudyda0a = znkymudyda0;
            new File("vEyXhqfn" + znkymudyda0a + uvbbjsci3a + hpqvjaosrq1a + hhpmjwlosj2a + "vEyXhqfn" + "" + "");
        }

        //垃圾方法
        private void JSWLdyOR(float ufvvfduyd0, int bhnmjza1, boolean amkjxza2, double qidmpnet3, long rwfszdp4) {
            long rwfszdp4a = rwfszdp4;
            double qidmpnet3a = qidmpnet3;
            boolean amkjxza2a = amkjxza2;
            int bhnmjza1a = bhnmjza1;
            float ufvvfduyd0a = ufvvfduyd0;
            new Thread("JSWLdyOR" + rwfszdp4a + amkjxza2a + bhnmjza1a + ufvvfduyd0a + qidmpnet3a + "JSWLdyOR" + "" + "");
        }

        //垃圾方法
        private void jiffLRqW(char dasdeufop0) {
            char dasdeufop0a = dasdeufop0;
            Log.e("jiffLRqW", "jiffLRqW" + dasdeufop0a + "jiffLRqW" + "" + "");
        }

        //垃圾方法
        private void JnDUiUwn(int uqdbkavip0, float xhehtnywzt1) {
            float xhehtnywzt1a = xhehtnywzt1;
            int uqdbkavip0a = uqdbkavip0;
            Log.e("JnDUiUwn", "JnDUiUwn" + uqdbkavip0a + xhehtnywzt1a + "JnDUiUwn" + "" + "");
        }

        //垃圾方法
        private void mNphzZvB(long rexkcgivmb0, byte upjrsvm1, int utfbrbycgs2, double umepzqxshr3, char mrvjksfks4) {
            char mrvjksfks4a = mrvjksfks4;
            double umepzqxshr3a = umepzqxshr3;
            int utfbrbycgs2a = utfbrbycgs2;
            byte upjrsvm1a = upjrsvm1;
            long rexkcgivmb0a = rexkcgivmb0;
            new File("mNphzZvB" + upjrsvm1a + mrvjksfks4a + utfbrbycgs2a + umepzqxshr3a + rexkcgivmb0a + "mNphzZvB" + "" + "");
        }

        //垃圾方法
        private void WlVMlANI(char tjlobcon0, boolean sqbmfxk1, short vnwkwluu2, byte zhotmgwjvl3) {
            byte zhotmgwjvl3a = zhotmgwjvl3;
            short vnwkwluu2a = vnwkwluu2;
            boolean sqbmfxk1a = sqbmfxk1;
            char tjlobcon0a = tjlobcon0;
            new StringBuffer("WlVMlANI" + zhotmgwjvl3a + vnwkwluu2a + sqbmfxk1a + tjlobcon0a + "WlVMlANI" + "" + "");
        }

        //垃圾方法
        private void wrtNlAnS(char ydceijs0) {
            char ydceijs0a = ydceijs0;
            new WeakReference("wrtNlAnS" + ydceijs0a + "wrtNlAnS" + "" + "");
        }

        //垃圾方法
        private void MKNwNdgB(float nekuneqv0, boolean gvzndabkjn1, char pxwezhdr2, int tjwaqgtdp3) {
            int tjwaqgtdp3a = tjwaqgtdp3;
            char pxwezhdr2a = pxwezhdr2;
            boolean gvzndabkjn1a = gvzndabkjn1;
            float nekuneqv0a = nekuneqv0;
            new StringBuffer("MKNwNdgB" + pxwezhdr2a + nekuneqv0a + tjwaqgtdp3a + gvzndabkjn1a + "MKNwNdgB" + "" + "");
        }

        //垃圾方法
        private void ROVNRDbO(long qdockorkp0) {
            long qdockorkp0a = qdockorkp0;
        }

        //垃圾方法
        private void OzYADYiC(double knnowoxvot0, float zjiifpxdib1, double bdkfnrsjc2) {
            double bdkfnrsjc2a = bdkfnrsjc2;
            float zjiifpxdib1a = zjiifpxdib1;
            double knnowoxvot0a = knnowoxvot0;
            new StringReader("OzYADYiC" + zjiifpxdib1a + bdkfnrsjc2a + knnowoxvot0a + "OzYADYiC" + "" + "");
        }

        //垃圾方法
        private void lvkknBTA(int guwlkppsby0, double rdyevsw1) {
            double rdyevsw1a = rdyevsw1;
            int guwlkppsby0a = guwlkppsby0;
            System.out.println("lvkknBTA" + rdyevsw1a + guwlkppsby0a + "lvkknBTA" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            double rdyevsw1 = 81.81;
            int guwlkppsby0 = 46;
            double bdkfnrsjc2 = 15.15;
            float zjiifpxdib1 = 10.10f;
            double knnowoxvot0 = 11.11;
            long qdockorkp0 = 7L;
            int tjwaqgtdp3 = 78;
            char pxwezhdr2 = 73;
            boolean gvzndabkjn1 = true;
            float nekuneqv0 = 18.18f;
            char ydceijs0 = 57;
            byte zhotmgwjvl3 = 37;
            short vnwkwluu2 = 8;
            boolean sqbmfxk1 = false;
            char tjlobcon0 = 78;
            char mrvjksfks4 = 24;
            double umepzqxshr3 = 89.89;
            int utfbrbycgs2 = 66;
            byte upjrsvm1 = 81;
            long rexkcgivmb0 = 4L;
            float xhehtnywzt1 = 99.99f;
            int uqdbkavip0 = 17;
            char dasdeufop0 = 80;
            long rwfszdp4 = 12L;
            double qidmpnet3 = 83.83;
            boolean amkjxza2 = false;
            int bhnmjza1 = 11;
            float ufvvfduyd0 = 9.9f;
            float uvbbjsci3 = 3.3f;
            short hhpmjwlosj2 = 72;
            byte hpqvjaosrq1 = 87;
            long znkymudyda0 = 85L;
            float yaagbctp2 = 14.14f;
            int weobvkiuac1 = 25;
            byte mmvjobtxb0 = 66;
            JnDUiUwn(uqdbkavip0, xhehtnywzt1);
            JSWLdyOR(ufvvfduyd0, bhnmjza1, amkjxza2, qidmpnet3, rwfszdp4);
            SZnxyojl(mmvjobtxb0, weobvkiuac1, yaagbctp2);
            SZnxyojl(mmvjobtxb0, weobvkiuac1, yaagbctp2);
            EasyManager.INSTANCE.setPaused(true);
            EasyManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            EasyManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void mSOzMcFy(short nnmeyqu0, boolean sehrhez1, double lwqdoqyjv2, boolean layfxpulll3) {
            boolean layfxpulll3a = layfxpulll3;
            double lwqdoqyjv2a = lwqdoqyjv2;
            boolean sehrhez1a = sehrhez1;
            short nnmeyqu0a = nnmeyqu0;
            new Thread("mSOzMcFy" + lwqdoqyjv2a + layfxpulll3a + sehrhez1a + nnmeyqu0a + "mSOzMcFy" + "" + "");
        }

        //垃圾方法
        private void aBqzUlPm(double wvqgdsnjmm0, byte fiogtnr1, int hozgcbgn2, int wqtorhs3) {
            int wqtorhs3a = wqtorhs3;
            int hozgcbgn2a = hozgcbgn2;
            byte fiogtnr1a = fiogtnr1;
            double wvqgdsnjmm0a = wvqgdsnjmm0;
            new StringBuilder("aBqzUlPm" + hozgcbgn2a + wqtorhs3a + wvqgdsnjmm0a + fiogtnr1a + "aBqzUlPm" + "" + "");
        }

        //垃圾方法
        private void YqKosIAB(char wewgodzgdc0, byte sdyelrn1, int yfralkw2, short jkszrqy3, long hdrugmd4) {
            long hdrugmd4a = hdrugmd4;
            short jkszrqy3a = jkszrqy3;
            int yfralkw2a = yfralkw2;
            byte sdyelrn1a = sdyelrn1;
            char wewgodzgdc0a = wewgodzgdc0;
            new File("YqKosIAB" + wewgodzgdc0a + yfralkw2a + hdrugmd4a + jkszrqy3a + sdyelrn1a + "YqKosIAB" + "" + "");
        }

        //垃圾方法
        private void uzeaBbJL(double vyxkoqau0, char wrvsiptg1, float ujcvies2, float ltzmttt3) {
            float ltzmttt3a = ltzmttt3;
            float ujcvies2a = ujcvies2;
            char wrvsiptg1a = wrvsiptg1;
            double vyxkoqau0a = vyxkoqau0;
            new StringReader("uzeaBbJL" + ltzmttt3a + ujcvies2a + wrvsiptg1a + vyxkoqau0a + "uzeaBbJL" + "" + "");
        }

        //垃圾方法
        private void fFNVxqcS(boolean nbwgdszlyf0, double pzlopajhji1, int eehxlqyqs2) {
            int eehxlqyqs2a = eehxlqyqs2;
            double pzlopajhji1a = pzlopajhji1;
            boolean nbwgdszlyf0a = nbwgdszlyf0;
            new StringBuilder("fFNVxqcS" + pzlopajhji1a + nbwgdszlyf0a + eehxlqyqs2a + "fFNVxqcS" + "" + "");
        }

        //垃圾方法
        private void kqPRUifR(byte rikvqfkev0, boolean oiaserpc1, byte eriilsfn2, short pyhbooqg3) {
            short pyhbooqg3a = pyhbooqg3;
            byte eriilsfn2a = eriilsfn2;
            boolean oiaserpc1a = oiaserpc1;
            byte rikvqfkev0a = rikvqfkev0;
            new WeakReference("kqPRUifR" + pyhbooqg3a + oiaserpc1a + eriilsfn2a + rikvqfkev0a + "kqPRUifR" + "" + "");
        }

        //垃圾方法
        private void DAOyvazn(byte rlmbqlk0, double pikulrlj1, boolean uzcqylmh2) {
            boolean uzcqylmh2a = uzcqylmh2;
            double pikulrlj1a = pikulrlj1;
            byte rlmbqlk0a = rlmbqlk0;
            System.out.println("DAOyvazn" + pikulrlj1a + uzcqylmh2a + rlmbqlk0a + "DAOyvazn" + "" + "");
        }

        //垃圾方法
        private void GCHDxSgs(boolean aukmwfocg0, byte gstgsfak1, char isnpwqtynl2, int ejrphdyz3, boolean xkivxki4) {
            boolean xkivxki4a = xkivxki4;
            int ejrphdyz3a = ejrphdyz3;
            char isnpwqtynl2a = isnpwqtynl2;
            byte gstgsfak1a = gstgsfak1;
            boolean aukmwfocg0a = aukmwfocg0;
            new StringBuilder("GCHDxSgs" + gstgsfak1a + aukmwfocg0a + isnpwqtynl2a + xkivxki4a + ejrphdyz3a + "GCHDxSgs" + "" + "");
        }

        public void onActivityStopped(@NotNull Activity activity) {
            boolean xkivxki4 = false;
            int ejrphdyz3 = 66;
            char isnpwqtynl2 = 99;
            byte gstgsfak1 = 29;
            boolean aukmwfocg0 = true;
            boolean uzcqylmh2 = false;
            double pikulrlj1 = 27.27;
            byte rlmbqlk0 = 55;
            short pyhbooqg3 = 21;
            byte eriilsfn2 = 71;
            boolean oiaserpc1 = false;
            byte rikvqfkev0 = 23;
            int eehxlqyqs2 = 29;
            double pzlopajhji1 = 77.77;
            boolean nbwgdszlyf0 = false;
            float ltzmttt3 = 97.97f;
            float ujcvies2 = 100.100f;
            char wrvsiptg1 = 62;
            double vyxkoqau0 = 3.3;
            long hdrugmd4 = 66L;
            short jkszrqy3 = 17;
            int yfralkw2 = 34;
            byte sdyelrn1 = 34;
            char wewgodzgdc0 = 39;
            int wqtorhs3 = 85;
            int hozgcbgn2 = 55;
            byte fiogtnr1 = 1;
            double wvqgdsnjmm0 = 3.3;
            boolean layfxpulll3 = false;
            double lwqdoqyjv2 = 7.7;
            boolean sehrhez1 = true;
            short nnmeyqu0 = 15;
            aBqzUlPm(wvqgdsnjmm0, fiogtnr1, hozgcbgn2, wqtorhs3);
            mSOzMcFy(nnmeyqu0, sehrhez1, lwqdoqyjv2, layfxpulll3);
            kqPRUifR(rikvqfkev0, oiaserpc1, eriilsfn2, pyhbooqg3);
            kqPRUifR(rikvqfkev0, oiaserpc1, eriilsfn2, pyhbooqg3);
            fFNVxqcS(nbwgdszlyf0, pzlopajhji1, eehxlqyqs2);
            YqKosIAB(wewgodzgdc0, sdyelrn1, yfralkw2, jkszrqy3, hdrugmd4);
            YqKosIAB(wewgodzgdc0, sdyelrn1, yfralkw2, jkszrqy3, hdrugmd4);
            aBqzUlPm(wvqgdsnjmm0, fiogtnr1, hozgcbgn2, wqtorhs3);
            aBqzUlPm(wvqgdsnjmm0, fiogtnr1, hozgcbgn2, wqtorhs3);
            aBqzUlPm(wvqgdsnjmm0, fiogtnr1, hozgcbgn2, wqtorhs3);
            EasyManager.visibleActivities.remove(activity);
            aBqzUlPm(wvqgdsnjmm0, fiogtnr1, hozgcbgn2, wqtorhs3);
            GCHDxSgs(aukmwfocg0, gstgsfak1, isnpwqtynl2, ejrphdyz3, xkivxki4);
            GCHDxSgs(aukmwfocg0, gstgsfak1, isnpwqtynl2, ejrphdyz3, xkivxki4);
            uzeaBbJL(vyxkoqau0, wrvsiptg1, ujcvies2, ltzmttt3);
            fFNVxqcS(nbwgdszlyf0, pzlopajhji1, eehxlqyqs2);
            uzeaBbJL(vyxkoqau0, wrvsiptg1, ujcvies2, ltzmttt3);
            YqKosIAB(wewgodzgdc0, sdyelrn1, yfralkw2, jkszrqy3, hdrugmd4);
            mSOzMcFy(nnmeyqu0, sehrhez1, lwqdoqyjv2, layfxpulll3);
            YqKosIAB(wewgodzgdc0, sdyelrn1, yfralkw2, jkszrqy3, hdrugmd4);
            EasyManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void lJsdzLSP(short efvjcbgl0, float urctero1) {
            float urctero1a = urctero1;
            short efvjcbgl0a = efvjcbgl0;
            new File("lJsdzLSP" + efvjcbgl0a + urctero1a + "lJsdzLSP" + "" + "");
        }

        //垃圾方法
        private void FBjvNKln(short jihjwwcbmt0, boolean qtzxhjsx1, int hbhterty2) {
            int hbhterty2a = hbhterty2;
            boolean qtzxhjsx1a = qtzxhjsx1;
            short jihjwwcbmt0a = jihjwwcbmt0;
            new Thread("FBjvNKln" + qtzxhjsx1a + jihjwwcbmt0a + hbhterty2a + "FBjvNKln" + "" + "");
        }

        //垃圾方法
        private void PwgeGfxN(boolean jreifhpfaw0, char yddgufoz1) {
            char yddgufoz1a = yddgufoz1;
            boolean jreifhpfaw0a = jreifhpfaw0;
            Log.w("PwgeGfxN", "PwgeGfxN" + yddgufoz1a + jreifhpfaw0a + "PwgeGfxN" + "" + "");
        }

        //垃圾方法
        private void YtIITSjg(char ensmgfureo0) {
            char ensmgfureo0a = ensmgfureo0;
            new StringReader("YtIITSjg" + ensmgfureo0a + "YtIITSjg" + "" + "");
        }

        //垃圾方法
        private void CqBbPHPG(short jambegxvay0) {
            short jambegxvay0a = jambegxvay0;
        }

        //垃圾方法
        private void dkNKjKLK(float bvzpzfv0, float ixknpwcwq1, int lmznhfmhsk2) {
            int lmznhfmhsk2a = lmznhfmhsk2;
            float ixknpwcwq1a = ixknpwcwq1;
            float bvzpzfv0a = bvzpzfv0;
        }

        //垃圾方法
        private void SzFsJEDY(double tftxhzaq0, boolean nvpfyodv1, int mlxwztrosh2, double anysdjap3) {
            double anysdjap3a = anysdjap3;
            int mlxwztrosh2a = mlxwztrosh2;
            boolean nvpfyodv1a = nvpfyodv1;
            double tftxhzaq0a = tftxhzaq0;
            new StringBuffer("SzFsJEDY" + anysdjap3a + nvpfyodv1a + mlxwztrosh2a + tftxhzaq0a + "SzFsJEDY" + "" + "");
        }

        //垃圾方法
        private void kxhlfSmX(double rkcjlahn0, boolean vamqdyfis1, float xrxmxchehr2, boolean fbpdlfsf3) {
            boolean fbpdlfsf3a = fbpdlfsf3;
            float xrxmxchehr2a = xrxmxchehr2;
            boolean vamqdyfis1a = vamqdyfis1;
            double rkcjlahn0a = rkcjlahn0;
            new StringBuffer("kxhlfSmX" + fbpdlfsf3a + xrxmxchehr2a + vamqdyfis1a + rkcjlahn0a + "kxhlfSmX" + "" + "");
        }

        //垃圾方法
        private void ufTPGBwU(char jirydijjlb0, boolean tycgkuppw1, boolean pbuukmu2, char pwxzjpmku3) {
            char pwxzjpmku3a = pwxzjpmku3;
            boolean pbuukmu2a = pbuukmu2;
            boolean tycgkuppw1a = tycgkuppw1;
            char jirydijjlb0a = jirydijjlb0;
            Log.w("ufTPGBwU", "ufTPGBwU" + pwxzjpmku3a + jirydijjlb0a + pbuukmu2a + tycgkuppw1a + "ufTPGBwU" + "" + "");
        }

        //垃圾方法
        private void ADbFuJHH(byte htsxtsfug0, double wzornax1, double bbxypqv2, float uwscytyzs3, double gnyrpiighb4) {
            double gnyrpiighb4a = gnyrpiighb4;
            float uwscytyzs3a = uwscytyzs3;
            double bbxypqv2a = bbxypqv2;
            double wzornax1a = wzornax1;
            byte htsxtsfug0a = htsxtsfug0;
            new StringBuffer("ADbFuJHH" + htsxtsfug0a + uwscytyzs3a + bbxypqv2a + wzornax1a + gnyrpiighb4a + "ADbFuJHH" + "" + "");
        }

        //垃圾方法
        private void EyZXFChq(float lqhbcjunu0) {
            float lqhbcjunu0a = lqhbcjunu0;
            new StringBuilder("EyZXFChq" + lqhbcjunu0a + "EyZXFChq" + "" + "");
        }

        //垃圾方法
        private void oxsIZrwm(short xzjefrsdr0, float piwnjjwi1, int feygeikvy2, long jcnrfcyo3) {
            long jcnrfcyo3a = jcnrfcyo3;
            int feygeikvy2a = feygeikvy2;
            float piwnjjwi1a = piwnjjwi1;
            short xzjefrsdr0a = xzjefrsdr0;
            new Thread("oxsIZrwm" + jcnrfcyo3a + feygeikvy2a + xzjefrsdr0a + piwnjjwi1a + "oxsIZrwm" + "" + "");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            long jcnrfcyo3 = 37L;
            int feygeikvy2 = 65;
            float piwnjjwi1 = 44.44f;
            short xzjefrsdr0 = 75;
            float lqhbcjunu0 = 94.94f;
            double gnyrpiighb4 = 94.94;
            float uwscytyzs3 = 5.5f;
            double bbxypqv2 = 98.98;
            double wzornax1 = 99.99;
            byte htsxtsfug0 = 59;
            char pwxzjpmku3 = 68;
            boolean pbuukmu2 = false;
            boolean tycgkuppw1 = true;
            char jirydijjlb0 = 81;
            boolean fbpdlfsf3 = true;
            float xrxmxchehr2 = 85.85f;
            boolean vamqdyfis1 = true;
            double rkcjlahn0 = 73.73;
            double anysdjap3 = 32.32;
            int mlxwztrosh2 = 53;
            boolean nvpfyodv1 = true;
            double tftxhzaq0 = 33.33;
            int lmznhfmhsk2 = 90;
            float ixknpwcwq1 = 47.47f;
            float bvzpzfv0 = 19.19f;
            short jambegxvay0 = 30;
            char ensmgfureo0 = 28;
            char yddgufoz1 = 38;
            boolean jreifhpfaw0 = true;
            int hbhterty2 = 53;
            boolean qtzxhjsx1 = false;
            short jihjwwcbmt0 = 29;
            float urctero1 = 58.58f;
            short efvjcbgl0 = 7;
            dkNKjKLK(bvzpzfv0, ixknpwcwq1, lmznhfmhsk2);
            YtIITSjg(ensmgfureo0);
            CqBbPHPG(jambegxvay0);
            PwgeGfxN(jreifhpfaw0, yddgufoz1);
            if (EasyManager.INSTANCE.isCurrActivity(activity)) {
                EasyManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            lJsdzLSP(efvjcbgl0, urctero1);
            ufTPGBwU(jirydijjlb0, tycgkuppw1, pbuukmu2, pwxzjpmku3);
            YtIITSjg(ensmgfureo0);
            YtIITSjg(ensmgfureo0);
            oxsIZrwm(xzjefrsdr0, piwnjjwi1, feygeikvy2, jcnrfcyo3);
            EasyManager.creatingActivities.remove(activity);
            SzFsJEDY(tftxhzaq0, nvpfyodv1, mlxwztrosh2, anysdjap3);
            kxhlfSmX(rkcjlahn0, vamqdyfis1, xrxmxchehr2, fbpdlfsf3);
            oxsIZrwm(xzjefrsdr0, piwnjjwi1, feygeikvy2, jcnrfcyo3);
            PwgeGfxN(jreifhpfaw0, yddgufoz1);
            YtIITSjg(ensmgfureo0);
            ADbFuJHH(htsxtsfug0, wzornax1, bbxypqv2, uwscytyzs3, gnyrpiighb4);
            SzFsJEDY(tftxhzaq0, nvpfyodv1, mlxwztrosh2, anysdjap3);
            EasyManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private float rCjDtwA = 61.61f;

    //垃圾变量
    private int jxKuCxI = 76;

    //垃圾变量
    private boolean KdqiFeN = true;

    //垃圾变量
    private boolean wIOWvvh = true;

    //垃圾变量
    private byte LsmyEcO = 72;

    //垃圾变量
    private byte hmmNlHx = 66;

    //垃圾变量
    private char DhzZiPE = 39;

    //垃圾变量
    private byte DkuVolS = 33;

    //垃圾变量
    private short PhpWrhj = 94;

    //垃圾变量
    private byte ZNydFQD = 27;

    //垃圾方法
    private void vyIvczPa(long aoixzlyukk0, int djlgvxryfk1, boolean gqsffgna2, byte ylmucdc3) {
        byte ylmucdc3a = ylmucdc3;
        boolean gqsffgna2a = gqsffgna2;
        int djlgvxryfk1a = djlgvxryfk1;
        long aoixzlyukk0a = aoixzlyukk0;
        new StringReader("vyIvczPa" + gqsffgna2a + djlgvxryfk1a + aoixzlyukk0a + ylmucdc3a + "vyIvczPa" + KRYwlqO + IbkDjGL + DOdmZUI + ewYbrRJ + oeMEfRr + aJzzKel + rCjDtwA + TPYQAnp + LsmyEcO + ZHjuWTP + KzysdEH + ykATifX + UQJHade + DhzZiPE + PhpWrhj + RxukkXT + KdqiFeN + yWFSznz + "");
    }

    //垃圾方法
    private void xlWCMyuj(float pqjddshiah0, char limyuetvgg1, byte vbjccnaz2) {
        byte vbjccnaz2a = vbjccnaz2;
        char limyuetvgg1a = limyuetvgg1;
        float pqjddshiah0a = pqjddshiah0;
        new StringBuffer("xlWCMyuj" + pqjddshiah0a + limyuetvgg1a + vbjccnaz2a + "xlWCMyuj" + UQJHade + rCjDtwA + yWFSznz + ykATifX + KzysdEH + TPYQAnp + IbkDjGL + PhpWrhj + aJzzKel + KRYwlqO + DOdmZUI + oeMEfRr + DhzZiPE + ewYbrRJ + RxukkXT + ZHjuWTP + LsmyEcO + KdqiFeN + "");
    }

    //垃圾方法
    private void VyHThOVA(byte ezoymvmt0, float nbwdwzukbu1) {
        float nbwdwzukbu1a = nbwdwzukbu1;
        byte ezoymvmt0a = ezoymvmt0;
        TextUtils.isDigitsOnly("VyHThOVA" + nbwdwzukbu1a + ezoymvmt0a + "VyHThOVA" + TPYQAnp + ewYbrRJ + oeMEfRr + aJzzKel + RxukkXT + DOdmZUI + yWFSznz + ZHjuWTP + LsmyEcO + DhzZiPE + KdqiFeN + UQJHade + KRYwlqO + rCjDtwA + PhpWrhj + IbkDjGL + ykATifX + KzysdEH + "");
    }

    //垃圾方法
    private void MZyhkfWe(byte screlzsvoa0, double ijnttptbrm1, short rnffbrls2, boolean sjxekwvnu3, double nyvekmv4) {
        double nyvekmv4a = nyvekmv4;
        boolean sjxekwvnu3a = sjxekwvnu3;
        short rnffbrls2a = rnffbrls2;
        double ijnttptbrm1a = ijnttptbrm1;
        byte screlzsvoa0a = screlzsvoa0;
        new AttributedString("MZyhkfWe" + screlzsvoa0a + nyvekmv4a + ijnttptbrm1a + rnffbrls2a + sjxekwvnu3a + "MZyhkfWe" + IbkDjGL + ykATifX + PhpWrhj + DhzZiPE + RxukkXT + TPYQAnp + oeMEfRr + DOdmZUI + yWFSznz + KRYwlqO + KdqiFeN + ZHjuWTP + LsmyEcO + aJzzKel + KzysdEH + UQJHade + rCjDtwA + ewYbrRJ + "");
    }

    //垃圾方法
    private void hFAjCZbW(int lahcicldiq0) {
        int lahcicldiq0a = lahcicldiq0;
        TextUtils.isEmpty("hFAjCZbW" + lahcicldiq0a + "hFAjCZbW" + yWFSznz + aJzzKel + ykATifX + oeMEfRr + KzysdEH + PhpWrhj + TPYQAnp + DOdmZUI + DhzZiPE + IbkDjGL + KdqiFeN + rCjDtwA + UQJHade + RxukkXT + LsmyEcO + KRYwlqO + ZHjuWTP + ewYbrRJ + "");
    }

    //垃圾方法
    private void qjElGEKe(float gjtadgc0, byte vrkvzqcgxa1, short lpiqxyhqwd2, int rtbzmulds3, int hmpkquzmkj4) {
        int hmpkquzmkj4a = hmpkquzmkj4;
        int rtbzmulds3a = rtbzmulds3;
        short lpiqxyhqwd2a = lpiqxyhqwd2;
        byte vrkvzqcgxa1a = vrkvzqcgxa1;
        float gjtadgc0a = gjtadgc0;
        new StringReader("qjElGEKe" + hmpkquzmkj4a + gjtadgc0a + lpiqxyhqwd2a + vrkvzqcgxa1a + rtbzmulds3a + "qjElGEKe" + DOdmZUI + aJzzKel + UQJHade + ykATifX + yWFSznz + KzysdEH + rCjDtwA + IbkDjGL + RxukkXT + ewYbrRJ + PhpWrhj + TPYQAnp + LsmyEcO + KdqiFeN + DhzZiPE + ZHjuWTP + oeMEfRr + KRYwlqO + "");
    }

    //垃圾方法
    private void sFHpypyO(char rxmpavn0, boolean kwezpfw1) {
        boolean kwezpfw1a = kwezpfw1;
        char rxmpavn0a = rxmpavn0;
        System.out.println("sFHpypyO" + rxmpavn0a + kwezpfw1a + "sFHpypyO" + oeMEfRr + yWFSznz + KzysdEH + UQJHade + DOdmZUI + aJzzKel + ykATifX + TPYQAnp + DhzZiPE + KRYwlqO + ZHjuWTP + RxukkXT + KdqiFeN + rCjDtwA + ewYbrRJ + IbkDjGL + PhpWrhj + LsmyEcO + "");
    }

    //垃圾方法
    private void BPQGabWA(short zyaacbmx0, short upctzlm1) {
        short upctzlm1a = upctzlm1;
        short zyaacbmx0a = zyaacbmx0;
        new String("BPQGabWA" + upctzlm1a + zyaacbmx0a + "BPQGabWA" + DOdmZUI + RxukkXT + DhzZiPE + yWFSznz + IbkDjGL + KdqiFeN + aJzzKel + LsmyEcO + TPYQAnp + ZHjuWTP + ykATifX + KzysdEH + oeMEfRr + KRYwlqO + UQJHade + ewYbrRJ + rCjDtwA + PhpWrhj + "");
    }

    public String toString() {
        short upctzlm1 = 85;
        short zyaacbmx0 = 5;
        boolean kwezpfw1 = true;
        char rxmpavn0 = 51;
        int hmpkquzmkj4 = 31;
        int rtbzmulds3 = 40;
        short lpiqxyhqwd2 = 62;
        byte vrkvzqcgxa1 = 80;
        float gjtadgc0 = 71.71f;
        int lahcicldiq0 = 51;
        double nyvekmv4 = 14.14;
        boolean sjxekwvnu3 = false;
        short rnffbrls2 = 53;
        double ijnttptbrm1 = 39.39;
        byte screlzsvoa0 = 66;
        float nbwdwzukbu1 = 94.94f;
        byte ezoymvmt0 = 82;
        byte vbjccnaz2 = 30;
        char limyuetvgg1 = 48;
        float pqjddshiah0 = 34.34f;
        byte ylmucdc3 = 21;
        boolean gqsffgna2 = false;
        int djlgvxryfk1 = 60;
        long aoixzlyukk0 = 85L;
        vyIvczPa(aoixzlyukk0, djlgvxryfk1, gqsffgna2, ylmucdc3);
        xlWCMyuj(pqjddshiah0, limyuetvgg1, vbjccnaz2);
        MZyhkfWe(screlzsvoa0, ijnttptbrm1, rnffbrls2, sjxekwvnu3, nyvekmv4);
        qjElGEKe(gjtadgc0, vrkvzqcgxa1, lpiqxyhqwd2, rtbzmulds3, hmpkquzmkj4);
        hFAjCZbW(lahcicldiq0);
        VyHThOVA(ezoymvmt0, nbwdwzukbu1);
        VyHThOVA(ezoymvmt0, nbwdwzukbu1);
        sFHpypyO(rxmpavn0, kwezpfw1);
        vyIvczPa(aoixzlyukk0, djlgvxryfk1, gqsffgna2, ylmucdc3);
        VyHThOVA(ezoymvmt0, nbwdwzukbu1);
        new StringBuilder("" + jxKuCxI + wIOWvvh + DkuVolS + hmmNlHx + ZNydFQD + "");
        return super.toString();
    }
}
