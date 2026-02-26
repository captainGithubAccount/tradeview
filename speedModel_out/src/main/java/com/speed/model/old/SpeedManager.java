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
    private char vmtoueY = 12;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private float IELZZtl = 45.45f;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private short yiWFJFn = 70;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private char rqHEEmJ = 5;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private char hdAAYWM = 71;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private int wYGTgiu = 54;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private byte ywCoxqc = 16;

    private static long pausedTime;

    //垃圾变量
    private boolean bMRTqlj = true;

    private static boolean isPaused;

    //垃圾变量
    private short tVbCuFS = 13;

    public static final SpeedManager INSTANCE = new SpeedManager();

    //垃圾变量
    private int wObBJAU = 46;

    public static String mainProcessName;

    //垃圾变量
    private double kPVOvLA = 65.65;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private double bAFLAio = 68.68;

    public static int code = 10214;

    //垃圾变量
    private float YRPrSBs = 4.4f;

    public static boolean isDebug = true;

    //垃圾方法
    static private void FFgCgddq(double ifjqayia0, boolean mcyjhtoh1) {
        boolean mcyjhtoh1a = mcyjhtoh1;
        double ifjqayia0a = ifjqayia0;
        TextUtils.isEmpty("FFgCgddq" + mcyjhtoh1a + ifjqayia0a + "FFgCgddq" + "");
    }

    //垃圾方法
    static private void nzowsICY(int ofzsftr0, float ptyehpbrzc1, double fukuxft2, long bnexenpy3, float acedhov4) {
        float acedhov4a = acedhov4;
        long bnexenpy3a = bnexenpy3;
        double fukuxft2a = fukuxft2;
        float ptyehpbrzc1a = ptyehpbrzc1;
        int ofzsftr0a = ofzsftr0;
        new StringBuffer("nzowsICY" + ptyehpbrzc1a + ofzsftr0a + acedhov4a + bnexenpy3a + fukuxft2a + "nzowsICY" + "");
    }

    //垃圾方法
    static private void AYjcLXZC(boolean sfeyorz0) {
        boolean sfeyorz0a = sfeyorz0;
        new StringReader("AYjcLXZC" + sfeyorz0a + "AYjcLXZC" + "");
    }

    //垃圾方法
    static private void ijIJoEtC(char nekovlri0, float hqfphqw1, byte oyzwwpzw2) {
        byte oyzwwpzw2a = oyzwwpzw2;
        float hqfphqw1a = hqfphqw1;
        char nekovlri0a = nekovlri0;
        new StringBuffer("ijIJoEtC" + nekovlri0a + hqfphqw1a + oyzwwpzw2a + "ijIJoEtC" + "");
    }

    public static String getResString(int resId) {
        byte oyzwwpzw2 = 12;
        float hqfphqw1 = 91.91f;
        char nekovlri0 = 35;
        boolean sfeyorz0 = true;
        float acedhov4 = 46.46f;
        long bnexenpy3 = 20L;
        double fukuxft2 = 45.45;
        float ptyehpbrzc1 = 93.93f;
        int ofzsftr0 = 10;
        boolean mcyjhtoh1 = true;
        double ifjqayia0 = 99.99;
        FFgCgddq(ifjqayia0, mcyjhtoh1);
        AYjcLXZC(sfeyorz0);
        ijIJoEtC(nekovlri0, hqfphqw1, oyzwwpzw2);
        return mContext.getString(resId);
    }

    //垃圾方法
    private void kJuJYDJl(short suanjvnvks0, int cruyfoug1, char ciukeld2) {
        char ciukeld2a = ciukeld2;
        int cruyfoug1a = cruyfoug1;
        short suanjvnvks0a = suanjvnvks0;
        new StringBuffer("kJuJYDJl" + ciukeld2a + suanjvnvks0a + cruyfoug1a + "kJuJYDJl" + yiWFJFn + YnAXEqE + vmtoueY + FsUqGxz + bMRTqlj + YRPrSBs + ywCoxqc + IELZZtl + kPVOvLA + ibUGUIm + rqHEEmJ + bAFLAio + wYGTgiu + tVbCuFS + vAogyEI + wObBJAU + hdAAYWM + hnAzTiq + "");
    }

    //垃圾方法
    private void YVSPxdQC(long kvizexgci0, boolean sueawvyk1, byte mvtdzvgftn2, float szfveswhuc3) {
        float szfveswhuc3a = szfveswhuc3;
        byte mvtdzvgftn2a = mvtdzvgftn2;
        boolean sueawvyk1a = sueawvyk1;
        long kvizexgci0a = kvizexgci0;
        new Intent("YVSPxdQC" + kvizexgci0a + mvtdzvgftn2a + szfveswhuc3a + sueawvyk1a + "YVSPxdQC" + ywCoxqc + vmtoueY + vAogyEI + bAFLAio + bMRTqlj + hdAAYWM + rqHEEmJ + IELZZtl + ibUGUIm + YnAXEqE + YRPrSBs + wObBJAU + kPVOvLA + yiWFJFn + hnAzTiq + tVbCuFS + wYGTgiu + FsUqGxz + "");
    }

    //垃圾方法
    private void IIeEQIap(long ztintilv0, byte cgyydedx1, short ppdfjzk2) {
        short ppdfjzk2a = ppdfjzk2;
        byte cgyydedx1a = cgyydedx1;
        long ztintilv0a = ztintilv0;
        new WeakReference("IIeEQIap" + cgyydedx1a + ppdfjzk2a + ztintilv0a + "IIeEQIap" + FsUqGxz + wYGTgiu + ywCoxqc + YnAXEqE + vAogyEI + tVbCuFS + IELZZtl + hnAzTiq + wObBJAU + yiWFJFn + ibUGUIm + YRPrSBs + bMRTqlj + rqHEEmJ + bAFLAio + kPVOvLA + vmtoueY + hdAAYWM + "");
    }

    //垃圾方法
    private void tyCTOQpw(double oeaiqeqafb0, long xaexzgfaa1) {
        long xaexzgfaa1a = xaexzgfaa1;
        double oeaiqeqafb0a = oeaiqeqafb0;
        Log.i("tyCTOQpw", "tyCTOQpw" + xaexzgfaa1a + oeaiqeqafb0a + "tyCTOQpw" + YnAXEqE + wYGTgiu + IELZZtl + hnAzTiq + ibUGUIm + FsUqGxz + vmtoueY + vAogyEI + wObBJAU + tVbCuFS + ywCoxqc + yiWFJFn + kPVOvLA + rqHEEmJ + hdAAYWM + YRPrSBs + bMRTqlj + bAFLAio + "");
    }

    @Nullable
    public final Context getContext() {
        long xaexzgfaa1 = 83L;
        double oeaiqeqafb0 = 81.81;
        short ppdfjzk2 = 3;
        byte cgyydedx1 = 29;
        long ztintilv0 = 10L;
        float szfveswhuc3 = 23.23f;
        byte mvtdzvgftn2 = 18;
        boolean sueawvyk1 = true;
        long kvizexgci0 = 83L;
        char ciukeld2 = 39;
        int cruyfoug1 = 6;
        short suanjvnvks0 = 84;
        IIeEQIap(ztintilv0, cgyydedx1, ppdfjzk2);
        tyCTOQpw(oeaiqeqafb0, xaexzgfaa1);
        kJuJYDJl(suanjvnvks0, cruyfoug1, ciukeld2);
        IIeEQIap(ztintilv0, cgyydedx1, ppdfjzk2);
        tyCTOQpw(oeaiqeqafb0, xaexzgfaa1);
        tyCTOQpw(oeaiqeqafb0, xaexzgfaa1);
        tyCTOQpw(oeaiqeqafb0, xaexzgfaa1);
        return mContext;
    }

    //垃圾方法
    private void ACKgdMSs(char xvxfnfxd0, boolean umzvwgkegw1, float jqwsntc2, char mpgtvedr3) {
        char mpgtvedr3a = mpgtvedr3;
        float jqwsntc2a = jqwsntc2;
        boolean umzvwgkegw1a = umzvwgkegw1;
        char xvxfnfxd0a = xvxfnfxd0;
    }

    //垃圾方法
    private void HPKNoKEs(byte lfdwtgzx0, char tlmjlnwjgw1, int nppkxklug2, int jhdyjinx3) {
        int jhdyjinx3a = jhdyjinx3;
        int nppkxklug2a = nppkxklug2;
        char tlmjlnwjgw1a = tlmjlnwjgw1;
        byte lfdwtgzx0a = lfdwtgzx0;
        TextUtils.isEmpty("HPKNoKEs" + jhdyjinx3a + lfdwtgzx0a + nppkxklug2a + tlmjlnwjgw1a + "HPKNoKEs" + bAFLAio + wObBJAU + vmtoueY + ywCoxqc + FsUqGxz + ibUGUIm + wYGTgiu + yiWFJFn + IELZZtl + vAogyEI + kPVOvLA + YnAXEqE + hdAAYWM + tVbCuFS + rqHEEmJ + hnAzTiq + YRPrSBs + bMRTqlj + "");
    }

    //垃圾方法
    private void vYTnMiqw(float vnuckceozc0, long pedvlkenge1, int ajfpxethcq2) {
        int ajfpxethcq2a = ajfpxethcq2;
        long pedvlkenge1a = pedvlkenge1;
        float vnuckceozc0a = vnuckceozc0;
        Log.e("vYTnMiqw", "vYTnMiqw" + ajfpxethcq2a + vnuckceozc0a + pedvlkenge1a + "vYTnMiqw" + bMRTqlj + YnAXEqE + vmtoueY + vAogyEI + ywCoxqc + hnAzTiq + bAFLAio + ibUGUIm + wYGTgiu + FsUqGxz + tVbCuFS + yiWFJFn + wObBJAU + YRPrSBs + kPVOvLA + IELZZtl + rqHEEmJ + hdAAYWM + "");
    }

    //垃圾方法
    private void oCpnsopv(byte htnynww0, short zkbxcyykq1, double pjldeifcqi2, short ambhxhlnt3, float idwtsqybve4) {
        float idwtsqybve4a = idwtsqybve4;
        short ambhxhlnt3a = ambhxhlnt3;
        double pjldeifcqi2a = pjldeifcqi2;
        short zkbxcyykq1a = zkbxcyykq1;
        byte htnynww0a = htnynww0;
        new StringBuilder("oCpnsopv" + ambhxhlnt3a + idwtsqybve4a + htnynww0a + zkbxcyykq1a + pjldeifcqi2a + "oCpnsopv" + kPVOvLA + YnAXEqE + tVbCuFS + bMRTqlj + FsUqGxz + rqHEEmJ + vAogyEI + bAFLAio + hdAAYWM + wYGTgiu + YRPrSBs + yiWFJFn + ibUGUIm + IELZZtl + hnAzTiq + wObBJAU + ywCoxqc + vmtoueY + "");
    }

    @NotNull
    public final Handler getHandler() {
        float idwtsqybve4 = 56.56f;
        short ambhxhlnt3 = 63;
        double pjldeifcqi2 = 88.88;
        short zkbxcyykq1 = 66;
        byte htnynww0 = 4;
        int ajfpxethcq2 = 21;
        long pedvlkenge1 = 24L;
        float vnuckceozc0 = 77.77f;
        int jhdyjinx3 = 24;
        int nppkxklug2 = 17;
        char tlmjlnwjgw1 = 89;
        byte lfdwtgzx0 = 15;
        char mpgtvedr3 = 54;
        float jqwsntc2 = 84.84f;
        boolean umzvwgkegw1 = true;
        char xvxfnfxd0 = 36;
        return handler;
    }

    //垃圾方法
    private void IOZbWeRY(boolean lvbrywfwa0, int mrdrylonn1, char xemznvmrok2) {
        char xemznvmrok2a = xemznvmrok2;
        int mrdrylonn1a = mrdrylonn1;
        boolean lvbrywfwa0a = lvbrywfwa0;
        Log.w("IOZbWeRY", "IOZbWeRY" + mrdrylonn1a + lvbrywfwa0a + xemznvmrok2a + "IOZbWeRY" + hdAAYWM + wObBJAU + IELZZtl + ibUGUIm + vmtoueY + bAFLAio + tVbCuFS + vAogyEI + ywCoxqc + bMRTqlj + kPVOvLA + rqHEEmJ + hnAzTiq + yiWFJFn + YRPrSBs + wYGTgiu + YnAXEqE + FsUqGxz + "");
    }

    //垃圾方法
    private void noXBAgRI(char fdphtpja0, byte feqqdwxn1) {
        byte feqqdwxn1a = feqqdwxn1;
        char fdphtpja0a = fdphtpja0;
        Log.i("noXBAgRI", "noXBAgRI" + feqqdwxn1a + fdphtpja0a + "noXBAgRI" + vAogyEI + tVbCuFS + YnAXEqE + FsUqGxz + kPVOvLA + rqHEEmJ + wYGTgiu + vmtoueY + wObBJAU + hdAAYWM + IELZZtl + yiWFJFn + bMRTqlj + bAFLAio + ibUGUIm + ywCoxqc + YRPrSBs + hnAzTiq + "");
    }

    //垃圾方法
    private void hXfFYCkP(byte jvdbjgj0, double lxgenwtbtf1, boolean sbjuiwasn2, int thzdsdbh3) {
        int thzdsdbh3a = thzdsdbh3;
        boolean sbjuiwasn2a = sbjuiwasn2;
        double lxgenwtbtf1a = lxgenwtbtf1;
        byte jvdbjgj0a = jvdbjgj0;
    }

    //垃圾方法
    private void iKESMaNL(int mqiaoqtgjn0, double sbuminhp1) {
        double sbuminhp1a = sbuminhp1;
        int mqiaoqtgjn0a = mqiaoqtgjn0;
    }

    //垃圾方法
    private void pPmdIUCo(double muhpikmq0, short oholfyh1) {
        short oholfyh1a = oholfyh1;
        double muhpikmq0a = muhpikmq0;
        Log.e("pPmdIUCo", "pPmdIUCo" + muhpikmq0a + oholfyh1a + "pPmdIUCo" + hnAzTiq + IELZZtl + vmtoueY + YRPrSBs + wYGTgiu + wObBJAU + kPVOvLA + FsUqGxz + yiWFJFn + hdAAYWM + ywCoxqc + bMRTqlj + YnAXEqE + tVbCuFS + rqHEEmJ + bAFLAio + vAogyEI + ibUGUIm + "");
    }

    //垃圾方法
    private void PyhIiyYA(char ubdikwrdsf0, long wvqztvsy1, int kpomolshy2, char jgsiavxe3, short vcdzwyi4) {
        short vcdzwyi4a = vcdzwyi4;
        char jgsiavxe3a = jgsiavxe3;
        int kpomolshy2a = kpomolshy2;
        long wvqztvsy1a = wvqztvsy1;
        char ubdikwrdsf0a = ubdikwrdsf0;
        Log.i("PyhIiyYA", "PyhIiyYA" + ubdikwrdsf0a + wvqztvsy1a + kpomolshy2a + vcdzwyi4a + jgsiavxe3a + "PyhIiyYA" + kPVOvLA + tVbCuFS + YRPrSBs + bMRTqlj + IELZZtl + ibUGUIm + yiWFJFn + YnAXEqE + hdAAYWM + hnAzTiq + ywCoxqc + vmtoueY + vAogyEI + wYGTgiu + rqHEEmJ + wObBJAU + bAFLAio + FsUqGxz + "");
    }

    //垃圾方法
    private void gyybHIDp(boolean ougyyii0, char ynnypny1, byte gxormmq2, char pugohbpkg3) {
        char pugohbpkg3a = pugohbpkg3;
        byte gxormmq2a = gxormmq2;
        char ynnypny1a = ynnypny1;
        boolean ougyyii0a = ougyyii0;
        new StringBuffer("gyybHIDp" + ynnypny1a + gxormmq2a + ougyyii0a + pugohbpkg3a + "gyybHIDp" + IELZZtl + bAFLAio + wYGTgiu + ywCoxqc + kPVOvLA + rqHEEmJ + vmtoueY + YnAXEqE + tVbCuFS + YRPrSBs + hdAAYWM + wObBJAU + bMRTqlj + ibUGUIm + yiWFJFn + vAogyEI + FsUqGxz + hnAzTiq + "");
    }

    //垃圾方法
    private void XoLssJNe(int ispkbgvltl0, float shjboddi1, long hdahcjk2, short sswufcr3) {
        short sswufcr3a = sswufcr3;
        long hdahcjk2a = hdahcjk2;
        float shjboddi1a = shjboddi1;
        int ispkbgvltl0a = ispkbgvltl0;
        new String("XoLssJNe" + hdahcjk2a + sswufcr3a + ispkbgvltl0a + shjboddi1a + "XoLssJNe" + yiWFJFn + vmtoueY + ibUGUIm + wYGTgiu + bAFLAio + tVbCuFS + FsUqGxz + rqHEEmJ + vAogyEI + ywCoxqc + hdAAYWM + hnAzTiq + IELZZtl + YnAXEqE + wObBJAU + kPVOvLA + YRPrSBs + bMRTqlj + "");
    }

    public final void startNotifyService(boolean isFromActivity, String from) {
        short sswufcr3 = 99;
        long hdahcjk2 = 81L;
        float shjboddi1 = 54.54f;
        int ispkbgvltl0 = 33;
        char pugohbpkg3 = 70;
        byte gxormmq2 = 40;
        char ynnypny1 = 45;
        boolean ougyyii0 = true;
        short vcdzwyi4 = 19;
        char jgsiavxe3 = 74;
        int kpomolshy2 = 96;
        long wvqztvsy1 = 1L;
        char ubdikwrdsf0 = 81;
        short oholfyh1 = 5;
        double muhpikmq0 = 78.78;
        double sbuminhp1 = 41.41;
        int mqiaoqtgjn0 = 45;
        int thzdsdbh3 = 52;
        boolean sbjuiwasn2 = true;
        double lxgenwtbtf1 = 15.15;
        byte jvdbjgj0 = 16;
        byte feqqdwxn1 = 64;
        char fdphtpja0 = 3;
        char xemznvmrok2 = 1;
        int mrdrylonn1 = 79;
        boolean lvbrywfwa0 = false;
        //闹钟服务中启动的前台服务
        if (isDebug) {
            XoLssJNe(ispkbgvltl0, shjboddi1, hdahcjk2, sswufcr3);
            PyhIiyYA(ubdikwrdsf0, wvqztvsy1, kpomolshy2, jgsiavxe3, vcdzwyi4);
            noXBAgRI(fdphtpja0, feqqdwxn1);
            hXfFYCkP(jvdbjgj0, lxgenwtbtf1, sbjuiwasn2, thzdsdbh3);
            XoLssJNe(ispkbgvltl0, shjboddi1, hdahcjk2, sswufcr3);
            IOZbWeRY(lvbrywfwa0, mrdrylonn1, xemznvmrok2);
            iKESMaNL(mqiaoqtgjn0, sbuminhp1);
            gyybHIDp(ougyyii0, ynnypny1, gxormmq2, pugohbpkg3);
            Log.e("xxx", "AAManager startNotifyService");
        }
        if (SpeedNtUtils.isNotificationEnabled()) {
            PyhIiyYA(ubdikwrdsf0, wvqztvsy1, kpomolshy2, jgsiavxe3, vcdzwyi4);
            gyybHIDp(ougyyii0, ynnypny1, gxormmq2, pugohbpkg3);
            noXBAgRI(fdphtpja0, feqqdwxn1);
            hXfFYCkP(jvdbjgj0, lxgenwtbtf1, sbjuiwasn2, thzdsdbh3);
            PyhIiyYA(ubdikwrdsf0, wvqztvsy1, kpomolshy2, jgsiavxe3, vcdzwyi4);
            SpeedNtFgService.startNotifyService(isFromActivity, from);
        }
    }

    //垃圾方法
    private void AgQgTnWx(long dcxutrrnro0) {
        long dcxutrrnro0a = dcxutrrnro0;
        TextUtils.isEmpty("AgQgTnWx" + dcxutrrnro0a + "AgQgTnWx" + kPVOvLA + bAFLAio + FsUqGxz + vAogyEI + bMRTqlj + YnAXEqE + hnAzTiq + IELZZtl + rqHEEmJ + YRPrSBs + ibUGUIm + wYGTgiu + vmtoueY + yiWFJFn + tVbCuFS + ywCoxqc + hdAAYWM + wObBJAU + "");
    }

    //垃圾方法
    private void ogCRwAeS(float eszdhooqcf0, short yeexwtril1) {
        short yeexwtril1a = yeexwtril1;
        float eszdhooqcf0a = eszdhooqcf0;
        new StringBuffer("ogCRwAeS" + yeexwtril1a + eszdhooqcf0a + "ogCRwAeS" + ibUGUIm + vmtoueY + YRPrSBs + IELZZtl + hnAzTiq + bAFLAio + wObBJAU + FsUqGxz + ywCoxqc + bMRTqlj + tVbCuFS + wYGTgiu + hdAAYWM + yiWFJFn + vAogyEI + kPVOvLA + rqHEEmJ + YnAXEqE + "");
    }

    //垃圾方法
    private void CumvZREo(short xglvzcobqc0) {
        short xglvzcobqc0a = xglvzcobqc0;
        TextUtils.isEmpty("CumvZREo" + xglvzcobqc0a + "CumvZREo" + bMRTqlj + rqHEEmJ + YRPrSBs + IELZZtl + tVbCuFS + ibUGUIm + ywCoxqc + FsUqGxz + hnAzTiq + vmtoueY + kPVOvLA + wYGTgiu + YnAXEqE + hdAAYWM + bAFLAio + wObBJAU + yiWFJFn + vAogyEI + "");
    }

    //垃圾方法
    private void DbHEmHnC(short sqkwdgs0, int ktqbeqjl1, boolean wbtwqmt2) {
        boolean wbtwqmt2a = wbtwqmt2;
        int ktqbeqjl1a = ktqbeqjl1;
        short sqkwdgs0a = sqkwdgs0;
        System.out.println("DbHEmHnC" + ktqbeqjl1a + wbtwqmt2a + sqkwdgs0a + "DbHEmHnC" + wObBJAU + vAogyEI + FsUqGxz + bAFLAio + ibUGUIm + tVbCuFS + vmtoueY + rqHEEmJ + IELZZtl + hnAzTiq + wYGTgiu + YnAXEqE + bMRTqlj + ywCoxqc + YRPrSBs + kPVOvLA + hdAAYWM + yiWFJFn + "");
    }

    //垃圾方法
    private void rdDDuUiR(long qkxwltnsrd0, byte wiistjxln1, float qhptbwlj2, double xofrkfc3, float fyclzabtg4) {
        float fyclzabtg4a = fyclzabtg4;
        double xofrkfc3a = xofrkfc3;
        float qhptbwlj2a = qhptbwlj2;
        byte wiistjxln1a = wiistjxln1;
        long qkxwltnsrd0a = qkxwltnsrd0;
        TextUtils.isEmpty("rdDDuUiR" + wiistjxln1a + qkxwltnsrd0a + xofrkfc3a + qhptbwlj2a + fyclzabtg4a + "rdDDuUiR" + vmtoueY + vAogyEI + wObBJAU + yiWFJFn + hnAzTiq + YRPrSBs + IELZZtl + YnAXEqE + kPVOvLA + ibUGUIm + FsUqGxz + bAFLAio + ywCoxqc + tVbCuFS + bMRTqlj + hdAAYWM + wYGTgiu + rqHEEmJ + "");
    }

    //垃圾方法
    private void EbpKZwBP(float sqylcwkgy0, boolean npixuzrz1) {
        boolean npixuzrz1a = npixuzrz1;
        float sqylcwkgy0a = sqylcwkgy0;
    }

    //垃圾方法
    private void WarkRWpc(char oxahmnx0) {
        char oxahmnx0a = oxahmnx0;
        new AttributedString("WarkRWpc" + oxahmnx0a + "WarkRWpc" + tVbCuFS + hnAzTiq + wYGTgiu + ibUGUIm + yiWFJFn + vmtoueY + IELZZtl + YnAXEqE + rqHEEmJ + YRPrSBs + hdAAYWM + kPVOvLA + bAFLAio + bMRTqlj + ywCoxqc + wObBJAU + vAogyEI + FsUqGxz + "");
    }

    //垃圾方法
    private void sCNwBGjQ(long vuqzhfuoo0, short faelakg1, float tuxinslrw2, byte fnbpkku3, float yvbjdzj4) {
        float yvbjdzj4a = yvbjdzj4;
        byte fnbpkku3a = fnbpkku3;
        float tuxinslrw2a = tuxinslrw2;
        short faelakg1a = faelakg1;
        long vuqzhfuoo0a = vuqzhfuoo0;
        new Intent("sCNwBGjQ" + vuqzhfuoo0a + faelakg1a + yvbjdzj4a + tuxinslrw2a + fnbpkku3a + "sCNwBGjQ" + hnAzTiq + hdAAYWM + yiWFJFn + YnAXEqE + ywCoxqc + bMRTqlj + kPVOvLA + YRPrSBs + vAogyEI + rqHEEmJ + FsUqGxz + wYGTgiu + vmtoueY + bAFLAio + IELZZtl + tVbCuFS + wObBJAU + ibUGUIm + "");
    }

    public final void startTwoService() {
        float yvbjdzj4 = 76.76f;
        byte fnbpkku3 = 93;
        float tuxinslrw2 = 92.92f;
        short faelakg1 = 92;
        long vuqzhfuoo0 = 9L;
        char oxahmnx0 = 30;
        boolean npixuzrz1 = false;
        float sqylcwkgy0 = 62.62f;
        float fyclzabtg4 = 84.84f;
        double xofrkfc3 = 58.58;
        float qhptbwlj2 = 43.43f;
        byte wiistjxln1 = 73;
        long qkxwltnsrd0 = 18L;
        boolean wbtwqmt2 = false;
        int ktqbeqjl1 = 3;
        short sqkwdgs0 = 70;
        short xglvzcobqc0 = 26;
        short yeexwtril1 = 41;
        float eszdhooqcf0 = 83.83f;
        long dcxutrrnro0 = 19L;
        WarkRWpc(oxahmnx0);
        DbHEmHnC(sqkwdgs0, ktqbeqjl1, wbtwqmt2);
        CumvZREo(xglvzcobqc0);
        EbpKZwBP(sqylcwkgy0, npixuzrz1);
        if (isDebug) {
            sCNwBGjQ(vuqzhfuoo0, faelakg1, tuxinslrw2, fnbpkku3, yvbjdzj4);
            AgQgTnWx(dcxutrrnro0);
            ogCRwAeS(eszdhooqcf0, yeexwtril1);
            CumvZREo(xglvzcobqc0);
            WarkRWpc(oxahmnx0);
            Log.e("xxx", "AAManager startTwoService");
        }
        WarkRWpc(oxahmnx0);
        DbHEmHnC(sqkwdgs0, ktqbeqjl1, wbtwqmt2);
        EbpKZwBP(sqylcwkgy0, npixuzrz1);
        ogCRwAeS(eszdhooqcf0, yeexwtril1);
        EbpKZwBP(sqylcwkgy0, npixuzrz1);
        CumvZREo(xglvzcobqc0);
        sCNwBGjQ(vuqzhfuoo0, faelakg1, tuxinslrw2, fnbpkku3, yvbjdzj4);
        AgQgTnWx(dcxutrrnro0);
        EbpKZwBP(sqylcwkgy0, npixuzrz1);
        AgQgTnWx(dcxutrrnro0);
        Speed1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void SCRwlwhH(boolean mozycbf0, long jxkvuzxurs1, float ltkgiti2, char cthcdbbcm3, boolean phfjayq4) {
        boolean phfjayq4a = phfjayq4;
        char cthcdbbcm3a = cthcdbbcm3;
        float ltkgiti2a = ltkgiti2;
        long jxkvuzxurs1a = jxkvuzxurs1;
        boolean mozycbf0a = mozycbf0;
        Log.e("SCRwlwhH", "SCRwlwhH" + mozycbf0a + jxkvuzxurs1a + phfjayq4a + ltkgiti2a + cthcdbbcm3a + "SCRwlwhH" + tVbCuFS + YRPrSBs + rqHEEmJ + FsUqGxz + vmtoueY + bMRTqlj + hnAzTiq + vAogyEI + wYGTgiu + wObBJAU + ywCoxqc + kPVOvLA + yiWFJFn + bAFLAio + hdAAYWM + ibUGUIm + YnAXEqE + IELZZtl + "");
    }

    //垃圾方法
    private void ICbBUMSC(char alfgpsj0, short bhbiablwwb1, int rqnuvrpnc2) {
        int rqnuvrpnc2a = rqnuvrpnc2;
        short bhbiablwwb1a = bhbiablwwb1;
        char alfgpsj0a = alfgpsj0;
        Log.i("ICbBUMSC", "ICbBUMSC" + bhbiablwwb1a + rqnuvrpnc2a + alfgpsj0a + "ICbBUMSC" + bAFLAio + bMRTqlj + ibUGUIm + IELZZtl + yiWFJFn + FsUqGxz + hnAzTiq + YRPrSBs + wYGTgiu + tVbCuFS + wObBJAU + hdAAYWM + ywCoxqc + rqHEEmJ + vAogyEI + YnAXEqE + kPVOvLA + vmtoueY + "");
    }

    //垃圾方法
    private void MTyQpMFL(char ikegjertb0, short uyywmyupwn1) {
        short uyywmyupwn1a = uyywmyupwn1;
        char ikegjertb0a = ikegjertb0;
        TextUtils.isDigitsOnly("MTyQpMFL" + ikegjertb0a + uyywmyupwn1a + "MTyQpMFL" + tVbCuFS + wYGTgiu + rqHEEmJ + bAFLAio + yiWFJFn + bMRTqlj + IELZZtl + vAogyEI + hnAzTiq + hdAAYWM + YRPrSBs + YnAXEqE + wObBJAU + ywCoxqc + vmtoueY + kPVOvLA + ibUGUIm + FsUqGxz + "");
    }

    //垃圾方法
    private void MJDkgsYp(boolean tyihncppez0) {
        boolean tyihncppez0a = tyihncppez0;
        new String("MJDkgsYp" + tyihncppez0a + "MJDkgsYp" + wObBJAU + YnAXEqE + bMRTqlj + tVbCuFS + rqHEEmJ + kPVOvLA + hnAzTiq + hdAAYWM + vAogyEI + ibUGUIm + IELZZtl + yiWFJFn + bAFLAio + FsUqGxz + YRPrSBs + ywCoxqc + wYGTgiu + vmtoueY + "");
    }

    public final long getPausedTime() {
        boolean tyihncppez0 = false;
        short uyywmyupwn1 = 62;
        char ikegjertb0 = 89;
        int rqnuvrpnc2 = 26;
        short bhbiablwwb1 = 55;
        char alfgpsj0 = 18;
        boolean phfjayq4 = true;
        char cthcdbbcm3 = 100;
        float ltkgiti2 = 70.70f;
        long jxkvuzxurs1 = 59L;
        boolean mozycbf0 = false;
        return pausedTime;
    }

    //垃圾方法
    private void MOxYaytc(double bhdvxku0) {
        double bhdvxku0a = bhdvxku0;
        new WeakReference("MOxYaytc" + bhdvxku0a + "MOxYaytc" + rqHEEmJ + vAogyEI + YRPrSBs + bAFLAio + hnAzTiq + IELZZtl + vmtoueY + yiWFJFn + FsUqGxz + ywCoxqc + hdAAYWM + ibUGUIm + bMRTqlj + YnAXEqE + wObBJAU + tVbCuFS + wYGTgiu + kPVOvLA + "");
    }

    //垃圾方法
    private void PxdbspRm(boolean nzimfbz0) {
        boolean nzimfbz0a = nzimfbz0;
        new StringBuffer("PxdbspRm" + nzimfbz0a + "PxdbspRm" + FsUqGxz + YRPrSBs + ywCoxqc + hnAzTiq + rqHEEmJ + ibUGUIm + IELZZtl + bMRTqlj + wObBJAU + yiWFJFn + vmtoueY + hdAAYWM + wYGTgiu + vAogyEI + kPVOvLA + tVbCuFS + bAFLAio + YnAXEqE + "");
    }

    //垃圾方法
    private void pmEaOOJO(short piyzgsdkfq0, double cjwwtnbbx1, long cwbbyme2, boolean qmjpkhh3) {
        boolean qmjpkhh3a = qmjpkhh3;
        long cwbbyme2a = cwbbyme2;
        double cjwwtnbbx1a = cjwwtnbbx1;
        short piyzgsdkfq0a = piyzgsdkfq0;
        new Intent("pmEaOOJO" + qmjpkhh3a + cjwwtnbbx1a + cwbbyme2a + piyzgsdkfq0a + "pmEaOOJO" + vAogyEI + kPVOvLA + YnAXEqE + ywCoxqc + wYGTgiu + bAFLAio + hdAAYWM + hnAzTiq + IELZZtl + rqHEEmJ + wObBJAU + tVbCuFS + YRPrSBs + FsUqGxz + vmtoueY + yiWFJFn + bMRTqlj + ibUGUIm + "");
    }

    //垃圾方法
    private void Auqviydj(boolean auhuwdjqod0, int lultbtus1, double kagosbr2, short uzbiibl3) {
        short uzbiibl3a = uzbiibl3;
        double kagosbr2a = kagosbr2;
        int lultbtus1a = lultbtus1;
        boolean auhuwdjqod0a = auhuwdjqod0;
        System.out.println("Auqviydj" + kagosbr2a + uzbiibl3a + lultbtus1a + auhuwdjqod0a + "Auqviydj" + vAogyEI + bMRTqlj + FsUqGxz + wObBJAU + IELZZtl + YnAXEqE + ibUGUIm + vmtoueY + ywCoxqc + rqHEEmJ + kPVOvLA + hnAzTiq + bAFLAio + wYGTgiu + yiWFJFn + tVbCuFS + hdAAYWM + YRPrSBs + "");
    }

    public final void setPausedTime(long var1) {
        short uzbiibl3 = 45;
        double kagosbr2 = 62.62;
        int lultbtus1 = 10;
        boolean auhuwdjqod0 = true;
        boolean qmjpkhh3 = false;
        long cwbbyme2 = 12L;
        double cjwwtnbbx1 = 3.3;
        short piyzgsdkfq0 = 41;
        boolean nzimfbz0 = false;
        double bhdvxku0 = 32.32;
        MOxYaytc(bhdvxku0);
        Auqviydj(auhuwdjqod0, lultbtus1, kagosbr2, uzbiibl3);
        MOxYaytc(bhdvxku0);
        PxdbspRm(nzimfbz0);
        pausedTime = var1;
    }

    //垃圾方法
    private void heKvbstf(double xkavujvnl0, byte pxttzkcxno1, boolean uiocpuhev2, double jrffjen3) {
        double jrffjen3a = jrffjen3;
        boolean uiocpuhev2a = uiocpuhev2;
        byte pxttzkcxno1a = pxttzkcxno1;
        double xkavujvnl0a = xkavujvnl0;
        Log.i("heKvbstf", "heKvbstf" + pxttzkcxno1a + xkavujvnl0a + uiocpuhev2a + jrffjen3a + "heKvbstf" + FsUqGxz + YnAXEqE + vmtoueY + IELZZtl + hdAAYWM + rqHEEmJ + kPVOvLA + hnAzTiq + ibUGUIm + bAFLAio + bMRTqlj + wYGTgiu + ywCoxqc + tVbCuFS + YRPrSBs + wObBJAU + yiWFJFn + vAogyEI + "");
    }

    //垃圾方法
    private void RebXAeRe(byte ahafjuhyxj0, long zaqtxzarl1, byte huksios2) {
        byte huksios2a = huksios2;
        long zaqtxzarl1a = zaqtxzarl1;
        byte ahafjuhyxj0a = ahafjuhyxj0;
        Log.e("RebXAeRe", "RebXAeRe" + huksios2a + zaqtxzarl1a + ahafjuhyxj0a + "RebXAeRe" + wYGTgiu + bAFLAio + tVbCuFS + IELZZtl + FsUqGxz + YRPrSBs + rqHEEmJ + hdAAYWM + yiWFJFn + vmtoueY + kPVOvLA + vAogyEI + YnAXEqE + ibUGUIm + ywCoxqc + wObBJAU + hnAzTiq + bMRTqlj + "");
    }

    //垃圾方法
    private void pJSLrIic(long vpeshes0, byte agjnvmjq1) {
        byte agjnvmjq1a = agjnvmjq1;
        long vpeshes0a = vpeshes0;
        Log.i("pJSLrIic", "pJSLrIic" + vpeshes0a + agjnvmjq1a + "pJSLrIic" + kPVOvLA + yiWFJFn + IELZZtl + ibUGUIm + wObBJAU + wYGTgiu + YnAXEqE + YRPrSBs + hdAAYWM + tVbCuFS + rqHEEmJ + ywCoxqc + bAFLAio + hnAzTiq + FsUqGxz + vAogyEI + bMRTqlj + vmtoueY + "");
    }

    //垃圾方法
    private void xNlomdaN(short vvitguixrj0) {
        short vvitguixrj0a = vvitguixrj0;
        new Thread("xNlomdaN" + vvitguixrj0a + "xNlomdaN" + vAogyEI + wYGTgiu + YRPrSBs + kPVOvLA + hdAAYWM + hnAzTiq + FsUqGxz + ibUGUIm + IELZZtl + YnAXEqE + bMRTqlj + yiWFJFn + tVbCuFS + vmtoueY + ywCoxqc + bAFLAio + rqHEEmJ + wObBJAU + "");
    }

    public final boolean isPaused() {
        short vvitguixrj0 = 99;
        byte agjnvmjq1 = 87;
        long vpeshes0 = 21L;
        byte huksios2 = 14;
        long zaqtxzarl1 = 67L;
        byte ahafjuhyxj0 = 19;
        double jrffjen3 = 77.77;
        boolean uiocpuhev2 = false;
        byte pxttzkcxno1 = 98;
        double xkavujvnl0 = 6.6;
        pJSLrIic(vpeshes0, agjnvmjq1);
        RebXAeRe(ahafjuhyxj0, zaqtxzarl1, huksios2);
        xNlomdaN(vvitguixrj0);
        heKvbstf(xkavujvnl0, pxttzkcxno1, uiocpuhev2, jrffjen3);
        RebXAeRe(ahafjuhyxj0, zaqtxzarl1, huksios2);
        heKvbstf(xkavujvnl0, pxttzkcxno1, uiocpuhev2, jrffjen3);
        return isPaused;
    }

    //垃圾方法
    private void AUVesrOv(float dahaohwoes0, long jqjtmitjma1, byte nhdhdzsuzo2) {
        byte nhdhdzsuzo2a = nhdhdzsuzo2;
        long jqjtmitjma1a = jqjtmitjma1;
        float dahaohwoes0a = dahaohwoes0;
        new File("AUVesrOv" + nhdhdzsuzo2a + jqjtmitjma1a + dahaohwoes0a + "AUVesrOv" + ywCoxqc + YnAXEqE + yiWFJFn + tVbCuFS + rqHEEmJ + IELZZtl + ibUGUIm + hdAAYWM + wYGTgiu + kPVOvLA + hnAzTiq + FsUqGxz + vmtoueY + YRPrSBs + bAFLAio + bMRTqlj + wObBJAU + vAogyEI + "");
    }

    //垃圾方法
    private void kskQOqWV(byte qfxhmokz0, float baikpgh1, double dalkfdx2, long hvxlzfxp3) {
        long hvxlzfxp3a = hvxlzfxp3;
        double dalkfdx2a = dalkfdx2;
        float baikpgh1a = baikpgh1;
        byte qfxhmokz0a = qfxhmokz0;
        new StringBuffer("kskQOqWV" + baikpgh1a + dalkfdx2a + hvxlzfxp3a + qfxhmokz0a + "kskQOqWV" + bAFLAio + FsUqGxz + tVbCuFS + wObBJAU + wYGTgiu + vmtoueY + rqHEEmJ + vAogyEI + yiWFJFn + bMRTqlj + ywCoxqc + IELZZtl + hnAzTiq + kPVOvLA + ibUGUIm + hdAAYWM + YnAXEqE + YRPrSBs + "");
    }

    //垃圾方法
    private void SoEvXLye(long sbiqltw0, int xjtadbwfn1, char nvwzgrnxk2, boolean vebzrcja3) {
        boolean vebzrcja3a = vebzrcja3;
        char nvwzgrnxk2a = nvwzgrnxk2;
        int xjtadbwfn1a = xjtadbwfn1;
        long sbiqltw0a = sbiqltw0;
        new AttributedString("SoEvXLye" + sbiqltw0a + xjtadbwfn1a + nvwzgrnxk2a + vebzrcja3a + "SoEvXLye" + tVbCuFS + ibUGUIm + FsUqGxz + hdAAYWM + kPVOvLA + YnAXEqE + IELZZtl + wObBJAU + YRPrSBs + hnAzTiq + bAFLAio + yiWFJFn + vAogyEI + rqHEEmJ + wYGTgiu + bMRTqlj + vmtoueY + ywCoxqc + "");
    }

    //垃圾方法
    private void yRaNkLyF(char dcnaqntdd0, short kcdpqkbe1, int humvdrd2, short hbtfeodjq3, byte rgrklkc4) {
        byte rgrklkc4a = rgrklkc4;
        short hbtfeodjq3a = hbtfeodjq3;
        int humvdrd2a = humvdrd2;
        short kcdpqkbe1a = kcdpqkbe1;
        char dcnaqntdd0a = dcnaqntdd0;
        new AttributedString("yRaNkLyF" + humvdrd2a + rgrklkc4a + dcnaqntdd0a + hbtfeodjq3a + kcdpqkbe1a + "yRaNkLyF" + FsUqGxz + wYGTgiu + yiWFJFn + wObBJAU + rqHEEmJ + tVbCuFS + hnAzTiq + vAogyEI + hdAAYWM + bAFLAio + ywCoxqc + YRPrSBs + ibUGUIm + kPVOvLA + vmtoueY + bMRTqlj + IELZZtl + YnAXEqE + "");
    }

    public final void setPaused(boolean var1) {
        byte rgrklkc4 = 7;
        short hbtfeodjq3 = 53;
        int humvdrd2 = 94;
        short kcdpqkbe1 = 72;
        char dcnaqntdd0 = 57;
        boolean vebzrcja3 = false;
        char nvwzgrnxk2 = 4;
        int xjtadbwfn1 = 86;
        long sbiqltw0 = 53L;
        long hvxlzfxp3 = 62L;
        double dalkfdx2 = 68.68;
        float baikpgh1 = 26.26f;
        byte qfxhmokz0 = 92;
        byte nhdhdzsuzo2 = 13;
        long jqjtmitjma1 = 57L;
        float dahaohwoes0 = 48.48f;
        kskQOqWV(qfxhmokz0, baikpgh1, dalkfdx2, hvxlzfxp3);
        SoEvXLye(sbiqltw0, xjtadbwfn1, nvwzgrnxk2, vebzrcja3);
        AUVesrOv(dahaohwoes0, jqjtmitjma1, nhdhdzsuzo2);
        SoEvXLye(sbiqltw0, xjtadbwfn1, nvwzgrnxk2, vebzrcja3);
        yRaNkLyF(dcnaqntdd0, kcdpqkbe1, humvdrd2, hbtfeodjq3, rgrklkc4);
        yRaNkLyF(dcnaqntdd0, kcdpqkbe1, humvdrd2, hbtfeodjq3, rgrklkc4);
        yRaNkLyF(dcnaqntdd0, kcdpqkbe1, humvdrd2, hbtfeodjq3, rgrklkc4);
        yRaNkLyF(dcnaqntdd0, kcdpqkbe1, humvdrd2, hbtfeodjq3, rgrklkc4);
        isPaused = var1;
    }

    //垃圾方法
    static private void GMskVurY(byte rzqxvte0) {
        byte rzqxvte0a = rzqxvte0;
        new WeakReference("GMskVurY" + rzqxvte0a + "GMskVurY" + "");
    }

    //垃圾方法
    static private void PRGcbvmk(float qcvokqgf0) {
        float qcvokqgf0a = qcvokqgf0;
        new StringBuffer("PRGcbvmk" + qcvokqgf0a + "PRGcbvmk" + "");
    }

    //垃圾方法
    static private void macMgZPn(byte djkkyzq0, byte gokggqu1, boolean fradbywk2, long coaawzw3, byte giourjhdol4) {
        byte giourjhdol4a = giourjhdol4;
        long coaawzw3a = coaawzw3;
        boolean fradbywk2a = fradbywk2;
        byte gokggqu1a = gokggqu1;
        byte djkkyzq0a = djkkyzq0;
    }

    //垃圾方法
    static private void thHEfaHP(double ndevjkp0, double yarrkfaxo1) {
        double yarrkfaxo1a = yarrkfaxo1;
        double ndevjkp0a = ndevjkp0;
    }

    public static String getString(int stringResId) {
        double yarrkfaxo1 = 66.66;
        double ndevjkp0 = 30.30;
        byte giourjhdol4 = 91;
        long coaawzw3 = 36L;
        boolean fradbywk2 = true;
        byte gokggqu1 = 32;
        byte djkkyzq0 = 35;
        float qcvokqgf0 = 16.16f;
        byte rzqxvte0 = 16;
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void ONQCAPTe(int opydpcxwy0, int ctzbwzwtso1) {
        int ctzbwzwtso1a = ctzbwzwtso1;
        int opydpcxwy0a = opydpcxwy0;
        new AttributedString("ONQCAPTe" + opydpcxwy0a + ctzbwzwtso1a + "ONQCAPTe" + "");
    }

    //垃圾方法
    static private void SXkAIrKz(byte zljkotfoa0, boolean ekxzeoxku1) {
        boolean ekxzeoxku1a = ekxzeoxku1;
        byte zljkotfoa0a = zljkotfoa0;
        System.out.println("SXkAIrKz" + zljkotfoa0a + ekxzeoxku1a + "SXkAIrKz" + "");
    }

    //垃圾方法
    static private void mNQWGiom(short lvdgbidaj0, char nwcdyzzq1) {
        char nwcdyzzq1a = nwcdyzzq1;
        short lvdgbidaj0a = lvdgbidaj0;
        new WeakReference("mNQWGiom" + nwcdyzzq1a + lvdgbidaj0a + "mNQWGiom" + "");
    }

    //垃圾方法
    static private void JFKSMluj(double xgdvrhad0, char hhzkkpszn1, byte rtjhpyks2, float geaqbyu3, byte aqjpuiiym4) {
        byte aqjpuiiym4a = aqjpuiiym4;
        float geaqbyu3a = geaqbyu3;
        byte rtjhpyks2a = rtjhpyks2;
        char hhzkkpszn1a = hhzkkpszn1;
        double xgdvrhad0a = xgdvrhad0;
        new File("JFKSMluj" + xgdvrhad0a + geaqbyu3a + aqjpuiiym4a + hhzkkpszn1a + rtjhpyks2a + "JFKSMluj" + "");
    }

    //垃圾方法
    static private void toUOmugt(double npkqsixpxd0, long dlsfulvs1, double yhggljw2, boolean bawogxl3) {
        boolean bawogxl3a = bawogxl3;
        double yhggljw2a = yhggljw2;
        long dlsfulvs1a = dlsfulvs1;
        double npkqsixpxd0a = npkqsixpxd0;
    }

    //垃圾方法
    static private void ZObmqvlv(long sihgkys0, float fpaspmuya1) {
        float fpaspmuya1a = fpaspmuya1;
        long sihgkys0a = sihgkys0;
        System.out.println("ZObmqvlv" + sihgkys0a + fpaspmuya1a + "ZObmqvlv" + "");
    }

    //垃圾方法
    static private void GzPFbqPe(double yjwegvpr0, double xjzvxfj1, byte xswdxyzim2, int muluxehsc3) {
        int muluxehsc3a = muluxehsc3;
        byte xswdxyzim2a = xswdxyzim2;
        double xjzvxfj1a = xjzvxfj1;
        double yjwegvpr0a = yjwegvpr0;
        Log.w("GzPFbqPe", "GzPFbqPe" + muluxehsc3a + yjwegvpr0a + xswdxyzim2a + xjzvxfj1a + "GzPFbqPe" + "");
    }

    //垃圾方法
    static private void sutsRjwK(short joahcpwek0) {
        short joahcpwek0a = joahcpwek0;
    }

    public static boolean isScreenOn() {
        short joahcpwek0 = 90;
        int muluxehsc3 = 74;
        byte xswdxyzim2 = 23;
        double xjzvxfj1 = 68.68;
        double yjwegvpr0 = 30.30;
        float fpaspmuya1 = 75.75f;
        long sihgkys0 = 74L;
        boolean bawogxl3 = true;
        double yhggljw2 = 46.46;
        long dlsfulvs1 = 76L;
        double npkqsixpxd0 = 80.80;
        byte aqjpuiiym4 = 88;
        float geaqbyu3 = 23.23f;
        byte rtjhpyks2 = 4;
        char hhzkkpszn1 = 7;
        double xgdvrhad0 = 22.22;
        char nwcdyzzq1 = 64;
        short lvdgbidaj0 = 49;
        boolean ekxzeoxku1 = true;
        byte zljkotfoa0 = 1;
        int ctzbwzwtso1 = 64;
        int opydpcxwy0 = 52;
        sutsRjwK(joahcpwek0);
        ZObmqvlv(sihgkys0, fpaspmuya1);
        JFKSMluj(xgdvrhad0, hhzkkpszn1, rtjhpyks2, geaqbyu3, aqjpuiiym4);
        ONQCAPTe(opydpcxwy0, ctzbwzwtso1);
        SXkAIrKz(zljkotfoa0, ekxzeoxku1);
        GzPFbqPe(yjwegvpr0, xjzvxfj1, xswdxyzim2, muluxehsc3);
        GzPFbqPe(yjwegvpr0, xjzvxfj1, xswdxyzim2, muluxehsc3);
        toUOmugt(npkqsixpxd0, dlsfulvs1, yhggljw2, bawogxl3);
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void zLbkDxPW(double mezrklk0, long slqnkqn1, int yxgfptxu2, float dsobwlbrl3, boolean xzneqwfzit4) {
        boolean xzneqwfzit4a = xzneqwfzit4;
        float dsobwlbrl3a = dsobwlbrl3;
        int yxgfptxu2a = yxgfptxu2;
        long slqnkqn1a = slqnkqn1;
        double mezrklk0a = mezrklk0;
        System.out.println("zLbkDxPW" + mezrklk0a + slqnkqn1a + dsobwlbrl3a + xzneqwfzit4a + yxgfptxu2a + "zLbkDxPW" + "");
    }

    //垃圾方法
    static private void YVyPYjZu(float fauckqgcm0, char xaljhaiw1, long fsfctbba2, short lyzadeibk3) {
        short lyzadeibk3a = lyzadeibk3;
        long fsfctbba2a = fsfctbba2;
        char xaljhaiw1a = xaljhaiw1;
        float fauckqgcm0a = fauckqgcm0;
        new StringReader("YVyPYjZu" + fauckqgcm0a + lyzadeibk3a + xaljhaiw1a + fsfctbba2a + "YVyPYjZu" + "");
    }

    //垃圾方法
    static private void taCDjFIG(boolean fryfqdjyvl0, int cqcqkqzxqq1, char pvifcuws2, char hunnhbomk3, boolean ebyyqgiug4) {
        boolean ebyyqgiug4a = ebyyqgiug4;
        char hunnhbomk3a = hunnhbomk3;
        char pvifcuws2a = pvifcuws2;
        int cqcqkqzxqq1a = cqcqkqzxqq1;
        boolean fryfqdjyvl0a = fryfqdjyvl0;
        new StringBuilder("taCDjFIG" + pvifcuws2a + fryfqdjyvl0a + hunnhbomk3a + cqcqkqzxqq1a + ebyyqgiug4a + "taCDjFIG" + "");
    }

    //垃圾方法
    static private void zGRLgdzd(boolean jsfigde0, int qloohtc1) {
        int qloohtc1a = qloohtc1;
        boolean jsfigde0a = jsfigde0;
        new Thread("zGRLgdzd" + jsfigde0a + qloohtc1a + "zGRLgdzd" + "");
    }

    //垃圾方法
    static private void voFjdKXb(byte rcsoyax0, boolean bsjkhmrpia1, double npvbkuj2, long moqymhrkdr3) {
        long moqymhrkdr3a = moqymhrkdr3;
        double npvbkuj2a = npvbkuj2;
        boolean bsjkhmrpia1a = bsjkhmrpia1;
        byte rcsoyax0a = rcsoyax0;
        new StringBuilder("voFjdKXb" + npvbkuj2a + bsjkhmrpia1a + rcsoyax0a + moqymhrkdr3a + "voFjdKXb" + "");
    }

    //垃圾方法
    static private void xPeTpfPt(boolean acdycol0, int twlmjls1, float hncqlwt2) {
        float hncqlwt2a = hncqlwt2;
        int twlmjls1a = twlmjls1;
        boolean acdycol0a = acdycol0;
        Log.i("xPeTpfPt", "xPeTpfPt" + hncqlwt2a + acdycol0a + twlmjls1a + "xPeTpfPt" + "");
    }

    //垃圾方法
    static private void LSsakJaw(float oiuasniflg0) {
        float oiuasniflg0a = oiuasniflg0;
        new WeakReference("LSsakJaw" + oiuasniflg0a + "LSsakJaw" + "");
    }

    //垃圾方法
    static private void URxdsCxb(short huhrsovg0, double xgzhjvpwi1, byte ztdjmexc2, long thtwmrh3, boolean ixkortbbi4) {
        boolean ixkortbbi4a = ixkortbbi4;
        long thtwmrh3a = thtwmrh3;
        byte ztdjmexc2a = ztdjmexc2;
        double xgzhjvpwi1a = xgzhjvpwi1;
        short huhrsovg0a = huhrsovg0;
        Log.e("URxdsCxb", "URxdsCxb" + thtwmrh3a + xgzhjvpwi1a + huhrsovg0a + ztdjmexc2a + ixkortbbi4a + "URxdsCxb" + "");
    }

    public static boolean isScreenLockOpen() {
        boolean ixkortbbi4 = true;
        long thtwmrh3 = 97L;
        byte ztdjmexc2 = 68;
        double xgzhjvpwi1 = 75.75;
        short huhrsovg0 = 84;
        float oiuasniflg0 = 79.79f;
        float hncqlwt2 = 74.74f;
        int twlmjls1 = 35;
        boolean acdycol0 = true;
        long moqymhrkdr3 = 49L;
        double npvbkuj2 = 36.36;
        boolean bsjkhmrpia1 = false;
        byte rcsoyax0 = 33;
        int qloohtc1 = 12;
        boolean jsfigde0 = true;
        boolean ebyyqgiug4 = false;
        char hunnhbomk3 = 17;
        char pvifcuws2 = 29;
        int cqcqkqzxqq1 = 75;
        boolean fryfqdjyvl0 = false;
        short lyzadeibk3 = 87;
        long fsfctbba2 = 9L;
        char xaljhaiw1 = 36;
        float fauckqgcm0 = 6.6f;
        boolean xzneqwfzit4 = false;
        float dsobwlbrl3 = 31.31f;
        int yxgfptxu2 = 39;
        long slqnkqn1 = 13L;
        double mezrklk0 = 28.28;
        YVyPYjZu(fauckqgcm0, xaljhaiw1, fsfctbba2, lyzadeibk3);
        voFjdKXb(rcsoyax0, bsjkhmrpia1, npvbkuj2, moqymhrkdr3);
        voFjdKXb(rcsoyax0, bsjkhmrpia1, npvbkuj2, moqymhrkdr3);
        zGRLgdzd(jsfigde0, qloohtc1);
        YVyPYjZu(fauckqgcm0, xaljhaiw1, fsfctbba2, lyzadeibk3);
        xPeTpfPt(acdycol0, twlmjls1, hncqlwt2);
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        xPeTpfPt(acdycol0, twlmjls1, hncqlwt2);
        zLbkDxPW(mezrklk0, slqnkqn1, yxgfptxu2, dsobwlbrl3, xzneqwfzit4);
        YVyPYjZu(fauckqgcm0, xaljhaiw1, fsfctbba2, lyzadeibk3);
        URxdsCxb(huhrsovg0, xgzhjvpwi1, ztdjmexc2, thtwmrh3, ixkortbbi4);
        taCDjFIG(fryfqdjyvl0, cqcqkqzxqq1, pvifcuws2, hunnhbomk3, ebyyqgiug4);
        zLbkDxPW(mezrklk0, slqnkqn1, yxgfptxu2, dsobwlbrl3, xzneqwfzit4);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void owxhRNPx(double etosbfxbd0, short sujeetyw1, long iucxpiw2) {
        long iucxpiw2a = iucxpiw2;
        short sujeetyw1a = sujeetyw1;
        double etosbfxbd0a = etosbfxbd0;
        new AttributedString("owxhRNPx" + iucxpiw2a + sujeetyw1a + etosbfxbd0a + "owxhRNPx" + "");
    }

    //垃圾方法
    static private void WqqbDayU(short kxmvmore0, byte ynxffmqs1) {
        byte ynxffmqs1a = ynxffmqs1;
        short kxmvmore0a = kxmvmore0;
        System.out.println("WqqbDayU" + kxmvmore0a + ynxffmqs1a + "WqqbDayU" + "");
    }

    //垃圾方法
    static private void NYYZQWgC(int lszjruwc0) {
        int lszjruwc0a = lszjruwc0;
        new File("NYYZQWgC" + lszjruwc0a + "NYYZQWgC" + "");
    }

    //垃圾方法
    static private void hQSdgEpx(boolean esdjbuy0, char blqgbsigl1, byte kcuoohqg2, int milbxblly3, short yrozlylffo4) {
        short yrozlylffo4a = yrozlylffo4;
        int milbxblly3a = milbxblly3;
        byte kcuoohqg2a = kcuoohqg2;
        char blqgbsigl1a = blqgbsigl1;
        boolean esdjbuy0a = esdjbuy0;
        new String("hQSdgEpx" + blqgbsigl1a + kcuoohqg2a + esdjbuy0a + yrozlylffo4a + milbxblly3a + "hQSdgEpx" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        short yrozlylffo4 = 60;
        int milbxblly3 = 28;
        byte kcuoohqg2 = 68;
        char blqgbsigl1 = 95;
        boolean esdjbuy0 = true;
        int lszjruwc0 = 29;
        byte ynxffmqs1 = 50;
        short kxmvmore0 = 68;
        long iucxpiw2 = 39L;
        short sujeetyw1 = 19;
        double etosbfxbd0 = 8.8;
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void CmvLKJfI(int eujmshlio0, byte irrczdle1, short ukshobw2, int dcyevmc3, byte lbprnlktxn4) {
        byte lbprnlktxn4a = lbprnlktxn4;
        int dcyevmc3a = dcyevmc3;
        short ukshobw2a = ukshobw2;
        byte irrczdle1a = irrczdle1;
        int eujmshlio0a = eujmshlio0;
    }

    //垃圾方法
    private void iZzvTEMK(char ogidugg0, short habnuyv1, short acimoqwnv2) {
        short acimoqwnv2a = acimoqwnv2;
        short habnuyv1a = habnuyv1;
        char ogidugg0a = ogidugg0;
        System.out.println("iZzvTEMK" + habnuyv1a + ogidugg0a + acimoqwnv2a + "iZzvTEMK" + FsUqGxz + kPVOvLA + ibUGUIm + hdAAYWM + bMRTqlj + vAogyEI + ywCoxqc + bAFLAio + IELZZtl + tVbCuFS + hnAzTiq + rqHEEmJ + YnAXEqE + yiWFJFn + wObBJAU + vmtoueY + YRPrSBs + wYGTgiu + "");
    }

    //垃圾方法
    private void OGOLvixV(long kioboix0, long tyqxszi1, char hwfkzhnig2, short hjyqhksh3) {
        short hjyqhksh3a = hjyqhksh3;
        char hwfkzhnig2a = hwfkzhnig2;
        long tyqxszi1a = tyqxszi1;
        long kioboix0a = kioboix0;
        new StringBuffer("OGOLvixV" + hwfkzhnig2a + hjyqhksh3a + tyqxszi1a + kioboix0a + "OGOLvixV" + rqHEEmJ + vmtoueY + ywCoxqc + FsUqGxz + YRPrSBs + bAFLAio + hdAAYWM + IELZZtl + bMRTqlj + tVbCuFS + wObBJAU + hnAzTiq + kPVOvLA + YnAXEqE + vAogyEI + ibUGUIm + wYGTgiu + yiWFJFn + "");
    }

    //垃圾方法
    private void UEkPSXAi(long lyblitgqvm0) {
        long lyblitgqvm0a = lyblitgqvm0;
        new File("UEkPSXAi" + lyblitgqvm0a + "UEkPSXAi" + vmtoueY + wObBJAU + rqHEEmJ + FsUqGxz + ywCoxqc + bAFLAio + yiWFJFn + kPVOvLA + bMRTqlj + vAogyEI + hdAAYWM + tVbCuFS + YnAXEqE + ibUGUIm + IELZZtl + wYGTgiu + YRPrSBs + hnAzTiq + "");
    }

    //垃圾方法
    private void pyGgUXrm(float qbjgdtpy0, byte hkqowywle1, short vpmahbgwi2, long uxzgkvxxi3) {
        long uxzgkvxxi3a = uxzgkvxxi3;
        short vpmahbgwi2a = vpmahbgwi2;
        byte hkqowywle1a = hkqowywle1;
        float qbjgdtpy0a = qbjgdtpy0;
        TextUtils.isDigitsOnly("pyGgUXrm" + vpmahbgwi2a + uxzgkvxxi3a + hkqowywle1a + qbjgdtpy0a + "pyGgUXrm" + IELZZtl + wYGTgiu + ywCoxqc + ibUGUIm + hdAAYWM + hnAzTiq + wObBJAU + vmtoueY + bAFLAio + YRPrSBs + YnAXEqE + tVbCuFS + FsUqGxz + yiWFJFn + rqHEEmJ + vAogyEI + kPVOvLA + bMRTqlj + "");
    }

    //垃圾方法
    private void fIDUQltS(boolean vrkbtyekbi0) {
        boolean vrkbtyekbi0a = vrkbtyekbi0;
        Log.w("fIDUQltS", "fIDUQltS" + vrkbtyekbi0a + "fIDUQltS" + hdAAYWM + wObBJAU + hnAzTiq + YnAXEqE + ywCoxqc + bAFLAio + vmtoueY + yiWFJFn + tVbCuFS + vAogyEI + IELZZtl + rqHEEmJ + wYGTgiu + ibUGUIm + YRPrSBs + bMRTqlj + kPVOvLA + FsUqGxz + "");
    }

    //垃圾方法
    private void iCeePVMz(boolean asyzkzos0, long lljlssptt1, char ckxmizv2, boolean tjgoabxn3, int xjjaukvxca4) {
        int xjjaukvxca4a = xjjaukvxca4;
        boolean tjgoabxn3a = tjgoabxn3;
        char ckxmizv2a = ckxmizv2;
        long lljlssptt1a = lljlssptt1;
        boolean asyzkzos0a = asyzkzos0;
        new StringBuilder("iCeePVMz" + lljlssptt1a + ckxmizv2a + tjgoabxn3a + xjjaukvxca4a + asyzkzos0a + "iCeePVMz" + kPVOvLA + wObBJAU + ywCoxqc + ibUGUIm + vmtoueY + vAogyEI + IELZZtl + bMRTqlj + YRPrSBs + hnAzTiq + hdAAYWM + wYGTgiu + rqHEEmJ + FsUqGxz + bAFLAio + YnAXEqE + yiWFJFn + tVbCuFS + "");
    }

    //垃圾方法
    private void PRrODXdj(long jiyrgzmh0) {
        long jiyrgzmh0a = jiyrgzmh0;
        Log.i("PRrODXdj", "PRrODXdj" + jiyrgzmh0a + "PRrODXdj" + kPVOvLA + YnAXEqE + hnAzTiq + IELZZtl + ibUGUIm + hdAAYWM + vAogyEI + vmtoueY + YRPrSBs + rqHEEmJ + bMRTqlj + wObBJAU + yiWFJFn + FsUqGxz + tVbCuFS + bAFLAio + ywCoxqc + wYGTgiu + "");
    }

    //垃圾方法
    private void jurfgGbZ(long cgiikdmj0, long dkstqtfhoe1, long ayaosymp2, int ofdutyi3) {
        int ofdutyi3a = ofdutyi3;
        long ayaosymp2a = ayaosymp2;
        long dkstqtfhoe1a = dkstqtfhoe1;
        long cgiikdmj0a = cgiikdmj0;
    }

    //垃圾方法
    private void cDKmEwEt(double ttsxfpvoq0, short ucwqijgj1, int xwoulqexo2, short jcghupyskv3) {
        short jcghupyskv3a = jcghupyskv3;
        int xwoulqexo2a = xwoulqexo2;
        short ucwqijgj1a = ucwqijgj1;
        double ttsxfpvoq0a = ttsxfpvoq0;
        new StringReader("cDKmEwEt" + xwoulqexo2a + ttsxfpvoq0a + ucwqijgj1a + jcghupyskv3a + "cDKmEwEt" + ywCoxqc + FsUqGxz + vAogyEI + bMRTqlj + vmtoueY + wYGTgiu + wObBJAU + hdAAYWM + kPVOvLA + IELZZtl + YnAXEqE + bAFLAio + YRPrSBs + hnAzTiq + rqHEEmJ + tVbCuFS + yiWFJFn + ibUGUIm + "");
    }

    //垃圾方法
    private void RQsOmdDv(byte vjatmzwbx0) {
        byte vjatmzwbx0a = vjatmzwbx0;
        Log.w("RQsOmdDv", "RQsOmdDv" + vjatmzwbx0a + "RQsOmdDv" + bAFLAio + yiWFJFn + IELZZtl + hnAzTiq + ywCoxqc + wObBJAU + kPVOvLA + rqHEEmJ + vAogyEI + YnAXEqE + FsUqGxz + YRPrSBs + hdAAYWM + bMRTqlj + ibUGUIm + tVbCuFS + wYGTgiu + vmtoueY + "");
    }

    //垃圾方法
    private void xTsukATX(float vnwjrkyl0, boolean qyilrlv1, long irvoatomp2, long drnzgvu3) {
        long drnzgvu3a = drnzgvu3;
        long irvoatomp2a = irvoatomp2;
        boolean qyilrlv1a = qyilrlv1;
        float vnwjrkyl0a = vnwjrkyl0;
        new String("xTsukATX" + drnzgvu3a + irvoatomp2a + vnwjrkyl0a + qyilrlv1a + "xTsukATX" + rqHEEmJ + vmtoueY + tVbCuFS + FsUqGxz + YRPrSBs + IELZZtl + wYGTgiu + hdAAYWM + vAogyEI + YnAXEqE + bAFLAio + yiWFJFn + ywCoxqc + hnAzTiq + ibUGUIm + kPVOvLA + bMRTqlj + wObBJAU + "");
    }

    public void killAdActivityAndJump() {
        long drnzgvu3 = 98L;
        long irvoatomp2 = 11L;
        boolean qyilrlv1 = false;
        float vnwjrkyl0 = 85.85f;
        byte vjatmzwbx0 = 95;
        short jcghupyskv3 = 7;
        int xwoulqexo2 = 58;
        short ucwqijgj1 = 40;
        double ttsxfpvoq0 = 16.16;
        int ofdutyi3 = 66;
        long ayaosymp2 = 91L;
        long dkstqtfhoe1 = 75L;
        long cgiikdmj0 = 65L;
        long jiyrgzmh0 = 12L;
        int xjjaukvxca4 = 45;
        boolean tjgoabxn3 = true;
        char ckxmizv2 = 21;
        long lljlssptt1 = 14L;
        boolean asyzkzos0 = true;
        boolean vrkbtyekbi0 = true;
        long uxzgkvxxi3 = 31L;
        short vpmahbgwi2 = 29;
        byte hkqowywle1 = 37;
        float qbjgdtpy0 = 93.93f;
        long lyblitgqvm0 = 46L;
        short hjyqhksh3 = 73;
        char hwfkzhnig2 = 65;
        long tyqxszi1 = 10L;
        long kioboix0 = 59L;
        short acimoqwnv2 = 43;
        short habnuyv1 = 72;
        char ogidugg0 = 63;
        byte lbprnlktxn4 = 40;
        int dcyevmc3 = 90;
        short ukshobw2 = 27;
        byte irrczdle1 = 55;
        int eujmshlio0 = 3;
        Log.e("xxx", "killAllActivity");
        OGOLvixV(kioboix0, tyqxszi1, hwfkzhnig2, hjyqhksh3);
        CmvLKJfI(eujmshlio0, irrczdle1, ukshobw2, dcyevmc3, lbprnlktxn4);
        jurfgGbZ(cgiikdmj0, dkstqtfhoe1, ayaosymp2, ofdutyi3);
        xTsukATX(vnwjrkyl0, qyilrlv1, irvoatomp2, drnzgvu3);
        xTsukATX(vnwjrkyl0, qyilrlv1, irvoatomp2, drnzgvu3);
        pyGgUXrm(qbjgdtpy0, hkqowywle1, vpmahbgwi2, uxzgkvxxi3);
        RQsOmdDv(vjatmzwbx0);
        cDKmEwEt(ttsxfpvoq0, ucwqijgj1, xwoulqexo2, jcghupyskv3);
        iZzvTEMK(ogidugg0, habnuyv1, acimoqwnv2);
        Activity currentActivity = this.getCurrActivity();
        if (isValidActivity(currentActivity)) {
            OGOLvixV(kioboix0, tyqxszi1, hwfkzhnig2, hjyqhksh3);
            jurfgGbZ(cgiikdmj0, dkstqtfhoe1, ayaosymp2, ofdutyi3);
            CmvLKJfI(eujmshlio0, irrczdle1, ukshobw2, dcyevmc3, lbprnlktxn4);
            cDKmEwEt(ttsxfpvoq0, ucwqijgj1, xwoulqexo2, jcghupyskv3);
            pyGgUXrm(qbjgdtpy0, hkqowywle1, vpmahbgwi2, uxzgkvxxi3);
            iZzvTEMK(ogidugg0, habnuyv1, acimoqwnv2);
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void XiVCzYDG(long qtdoyflqe0, byte mwbejvvsbf1, double lahqmwq2, byte ukywbgzagq3) {
        byte ukywbgzagq3a = ukywbgzagq3;
        double lahqmwq2a = lahqmwq2;
        byte mwbejvvsbf1a = mwbejvvsbf1;
        long qtdoyflqe0a = qtdoyflqe0;
        new StringBuilder("XiVCzYDG" + mwbejvvsbf1a + lahqmwq2a + ukywbgzagq3a + qtdoyflqe0a + "XiVCzYDG" + vmtoueY + wYGTgiu + tVbCuFS + kPVOvLA + ywCoxqc + hdAAYWM + yiWFJFn + ibUGUIm + wObBJAU + YnAXEqE + YRPrSBs + FsUqGxz + IELZZtl + bAFLAio + rqHEEmJ + bMRTqlj + vAogyEI + hnAzTiq + "");
    }

    //垃圾方法
    private void VMRPXHyT(boolean tynwnzw0, long cvlknfx1, boolean pvtdrof2, float twmjsqde3) {
        float twmjsqde3a = twmjsqde3;
        boolean pvtdrof2a = pvtdrof2;
        long cvlknfx1a = cvlknfx1;
        boolean tynwnzw0a = tynwnzw0;
        new AttributedString("VMRPXHyT" + twmjsqde3a + tynwnzw0a + cvlknfx1a + pvtdrof2a + "VMRPXHyT" + bMRTqlj + YnAXEqE + bAFLAio + ibUGUIm + vmtoueY + ywCoxqc + wYGTgiu + hdAAYWM + kPVOvLA + hnAzTiq + wObBJAU + YRPrSBs + vAogyEI + IELZZtl + yiWFJFn + FsUqGxz + rqHEEmJ + tVbCuFS + "");
    }

    //垃圾方法
    private void uIymuANZ(byte grwfkjqoom0, byte nzsxuifms1) {
        byte nzsxuifms1a = nzsxuifms1;
        byte grwfkjqoom0a = grwfkjqoom0;
        TextUtils.isEmpty("uIymuANZ" + grwfkjqoom0a + nzsxuifms1a + "uIymuANZ" + bAFLAio + wObBJAU + bMRTqlj + yiWFJFn + hdAAYWM + ibUGUIm + ywCoxqc + wYGTgiu + vmtoueY + rqHEEmJ + IELZZtl + hnAzTiq + FsUqGxz + YnAXEqE + vAogyEI + tVbCuFS + YRPrSBs + kPVOvLA + "");
    }

    //垃圾方法
    private void YQkUSSGH(short tqrhygn0, double vkcisjismg1) {
        double vkcisjismg1a = vkcisjismg1;
        short tqrhygn0a = tqrhygn0;
        new StringBuffer("YQkUSSGH" + vkcisjismg1a + tqrhygn0a + "YQkUSSGH" + ibUGUIm + vAogyEI + hnAzTiq + FsUqGxz + YnAXEqE + yiWFJFn + wYGTgiu + rqHEEmJ + wObBJAU + tVbCuFS + YRPrSBs + kPVOvLA + bMRTqlj + bAFLAio + ywCoxqc + IELZZtl + vmtoueY + hdAAYWM + "");
    }

    //垃圾方法
    private void ZBTalXCK(long sdtztsjxu0, char lwufivkivz1, boolean flveaxqt2, boolean ykvadge3) {
        boolean ykvadge3a = ykvadge3;
        boolean flveaxqt2a = flveaxqt2;
        char lwufivkivz1a = lwufivkivz1;
        long sdtztsjxu0a = sdtztsjxu0;
        Log.w("ZBTalXCK", "ZBTalXCK" + sdtztsjxu0a + flveaxqt2a + lwufivkivz1a + ykvadge3a + "ZBTalXCK" + bMRTqlj + hdAAYWM + ywCoxqc + vmtoueY + YnAXEqE + wObBJAU + hnAzTiq + rqHEEmJ + wYGTgiu + FsUqGxz + vAogyEI + yiWFJFn + bAFLAio + YRPrSBs + kPVOvLA + ibUGUIm + tVbCuFS + IELZZtl + "");
    }

    //垃圾方法
    private void zQMinGfO(short snvjdxzt0, char tilkssu1) {
        char tilkssu1a = tilkssu1;
        short snvjdxzt0a = snvjdxzt0;
        new WeakReference("zQMinGfO" + snvjdxzt0a + tilkssu1a + "zQMinGfO" + vAogyEI + wYGTgiu + hdAAYWM + IELZZtl + wObBJAU + yiWFJFn + kPVOvLA + YnAXEqE + vmtoueY + tVbCuFS + FsUqGxz + ibUGUIm + rqHEEmJ + bMRTqlj + bAFLAio + ywCoxqc + hnAzTiq + YRPrSBs + "");
    }

    //垃圾方法
    private void WAGEBqmx(byte rdureir0, char cswdsrn1, int luzlqlo2, long daazlzm3) {
        long daazlzm3a = daazlzm3;
        int luzlqlo2a = luzlqlo2;
        char cswdsrn1a = cswdsrn1;
        byte rdureir0a = rdureir0;
        new StringBuilder("WAGEBqmx" + luzlqlo2a + cswdsrn1a + rdureir0a + daazlzm3a + "WAGEBqmx" + tVbCuFS + YnAXEqE + kPVOvLA + vAogyEI + rqHEEmJ + hnAzTiq + ibUGUIm + bAFLAio + ywCoxqc + bMRTqlj + IELZZtl + wYGTgiu + FsUqGxz + vmtoueY + hdAAYWM + yiWFJFn + YRPrSBs + wObBJAU + "");
    }

    //垃圾方法
    private void SFuFmEIJ(short mbfgyhkfyb0, short norjoxolkc1, long prygitlmhk2, short opvxurx3) {
        short opvxurx3a = opvxurx3;
        long prygitlmhk2a = prygitlmhk2;
        short norjoxolkc1a = norjoxolkc1;
        short mbfgyhkfyb0a = mbfgyhkfyb0;
        Log.e("SFuFmEIJ", "SFuFmEIJ" + opvxurx3a + norjoxolkc1a + prygitlmhk2a + mbfgyhkfyb0a + "SFuFmEIJ" + wObBJAU + IELZZtl + bMRTqlj + ywCoxqc + bAFLAio + yiWFJFn + YnAXEqE + YRPrSBs + kPVOvLA + wYGTgiu + hnAzTiq + tVbCuFS + FsUqGxz + vAogyEI + rqHEEmJ + hdAAYWM + vmtoueY + ibUGUIm + "");
    }

    //垃圾方法
    private void oboDCWGX(byte ssohdghko0) {
        byte ssohdghko0a = ssohdghko0;
        new AttributedString("oboDCWGX" + ssohdghko0a + "oboDCWGX" + tVbCuFS + bMRTqlj + wYGTgiu + YnAXEqE + bAFLAio + kPVOvLA + YRPrSBs + wObBJAU + hdAAYWM + ibUGUIm + yiWFJFn + rqHEEmJ + vAogyEI + FsUqGxz + IELZZtl + hnAzTiq + vmtoueY + ywCoxqc + "");
    }

    //垃圾方法
    private void erYCpeNM(float azsdjty0, double eflvbkkn1, float ljpgcajcgw2, double cfhgmzf3, byte aujocewjy4) {
        byte aujocewjy4a = aujocewjy4;
        double cfhgmzf3a = cfhgmzf3;
        float ljpgcajcgw2a = ljpgcajcgw2;
        double eflvbkkn1a = eflvbkkn1;
        float azsdjty0a = azsdjty0;
        Log.i("erYCpeNM", "erYCpeNM" + eflvbkkn1a + ljpgcajcgw2a + azsdjty0a + aujocewjy4a + cfhgmzf3a + "erYCpeNM" + bAFLAio + ywCoxqc + YnAXEqE + hdAAYWM + YRPrSBs + vAogyEI + vmtoueY + bMRTqlj + IELZZtl + tVbCuFS + yiWFJFn + FsUqGxz + wObBJAU + hnAzTiq + rqHEEmJ + kPVOvLA + wYGTgiu + ibUGUIm + "");
    }

    //垃圾方法
    private void wMKZFgac(boolean jrqtewyn0, float dpgfqewp1, short wobbygfdf2, byte dthgkjwjza3, boolean pjvrboq4) {
        boolean pjvrboq4a = pjvrboq4;
        byte dthgkjwjza3a = dthgkjwjza3;
        short wobbygfdf2a = wobbygfdf2;
        float dpgfqewp1a = dpgfqewp1;
        boolean jrqtewyn0a = jrqtewyn0;
        new WeakReference("wMKZFgac" + jrqtewyn0a + dthgkjwjza3a + dpgfqewp1a + wobbygfdf2a + pjvrboq4a + "wMKZFgac" + kPVOvLA + YnAXEqE + bMRTqlj + hdAAYWM + ywCoxqc + ibUGUIm + YRPrSBs + hnAzTiq + bAFLAio + vAogyEI + yiWFJFn + rqHEEmJ + vmtoueY + wObBJAU + wYGTgiu + tVbCuFS + IELZZtl + FsUqGxz + "");
    }

    //垃圾方法
    private void IIaTTEkN(float vltwgwp0, short inbaflhyd1, float wkemskt2, int qcusxaf3) {
        int qcusxaf3a = qcusxaf3;
        float wkemskt2a = wkemskt2;
        short inbaflhyd1a = inbaflhyd1;
        float vltwgwp0a = vltwgwp0;
        new File("IIaTTEkN" + wkemskt2a + qcusxaf3a + inbaflhyd1a + vltwgwp0a + "IIaTTEkN" + kPVOvLA + YnAXEqE + ibUGUIm + wObBJAU + ywCoxqc + bAFLAio + vmtoueY + wYGTgiu + YRPrSBs + yiWFJFn + vAogyEI + rqHEEmJ + FsUqGxz + tVbCuFS + hdAAYWM + bMRTqlj + hnAzTiq + IELZZtl + "");
    }

    //垃圾方法
    private void KZKDWxhl(int didfwofqt0, double fraeljwicz1) {
        double fraeljwicz1a = fraeljwicz1;
        int didfwofqt0a = didfwofqt0;
        Log.i("KZKDWxhl", "KZKDWxhl" + didfwofqt0a + fraeljwicz1a + "KZKDWxhl" + hnAzTiq + vAogyEI + YnAXEqE + bMRTqlj + yiWFJFn + IELZZtl + ibUGUIm + bAFLAio + YRPrSBs + wObBJAU + vmtoueY + wYGTgiu + tVbCuFS + rqHEEmJ + ywCoxqc + kPVOvLA + hdAAYWM + FsUqGxz + "");
    }

    //垃圾方法
    private void BSfCThyU(long eardmdtifd0, long rvvpwyjp1, long skcjuufi2, short mkfngpu3) {
        short mkfngpu3a = mkfngpu3;
        long skcjuufi2a = skcjuufi2;
        long rvvpwyjp1a = rvvpwyjp1;
        long eardmdtifd0a = eardmdtifd0;
        new String("BSfCThyU" + mkfngpu3a + rvvpwyjp1a + skcjuufi2a + eardmdtifd0a + "BSfCThyU" + ywCoxqc + ibUGUIm + vmtoueY + bAFLAio + rqHEEmJ + tVbCuFS + bMRTqlj + wObBJAU + kPVOvLA + IELZZtl + FsUqGxz + yiWFJFn + hdAAYWM + YRPrSBs + hnAzTiq + YnAXEqE + wYGTgiu + vAogyEI + "");
    }

    //垃圾方法
    private void tUoDaWuB(char hjggjunjn0, float xubqqpqy1, long rhatisk2, char vokcyzyvx3) {
        char vokcyzyvx3a = vokcyzyvx3;
        long rhatisk2a = rhatisk2;
        float xubqqpqy1a = xubqqpqy1;
        char hjggjunjn0a = hjggjunjn0;
        new Thread("tUoDaWuB" + rhatisk2a + hjggjunjn0a + vokcyzyvx3a + xubqqpqy1a + "tUoDaWuB" + wObBJAU + bAFLAio + ywCoxqc + FsUqGxz + vAogyEI + wYGTgiu + hdAAYWM + IELZZtl + bMRTqlj + hnAzTiq + YnAXEqE + yiWFJFn + rqHEEmJ + vmtoueY + ibUGUIm + kPVOvLA + tVbCuFS + YRPrSBs + "");
    }

    //垃圾方法
    private void sKIbMjHV(short ywdxzvv0, boolean bvtozig1, byte chyxyqjz2, float wkebxaxkp3) {
        float wkebxaxkp3a = wkebxaxkp3;
        byte chyxyqjz2a = chyxyqjz2;
        boolean bvtozig1a = bvtozig1;
        short ywdxzvv0a = ywdxzvv0;
    }

    //垃圾方法
    private void yRTLJbBG(char bynpstecoc0, long edevzsubdc1, char miwkqczc2) {
        char miwkqczc2a = miwkqczc2;
        long edevzsubdc1a = edevzsubdc1;
        char bynpstecoc0a = bynpstecoc0;
        new String("yRTLJbBG" + miwkqczc2a + bynpstecoc0a + edevzsubdc1a + "yRTLJbBG" + tVbCuFS + rqHEEmJ + YRPrSBs + ywCoxqc + YnAXEqE + hdAAYWM + vAogyEI + bAFLAio + bMRTqlj + wObBJAU + vmtoueY + hnAzTiq + kPVOvLA + FsUqGxz + ibUGUIm + wYGTgiu + yiWFJFn + IELZZtl + "");
    }

    //垃圾方法
    private void qnDXROFm(char qfazkywcao0, long oyrdtiv1, byte bkzdehds2) {
        byte bkzdehds2a = bkzdehds2;
        long oyrdtiv1a = oyrdtiv1;
        char qfazkywcao0a = qfazkywcao0;
        new StringBuilder("qnDXROFm" + bkzdehds2a + qfazkywcao0a + oyrdtiv1a + "qnDXROFm" + ywCoxqc + vmtoueY + bAFLAio + wYGTgiu + YnAXEqE + FsUqGxz + kPVOvLA + wObBJAU + ibUGUIm + IELZZtl + vAogyEI + bMRTqlj + hdAAYWM + tVbCuFS + yiWFJFn + YRPrSBs + hnAzTiq + rqHEEmJ + "");
    }

    //垃圾方法
    private void QCHmmrRc(char qewaijd0, double dneatpjlmi1, float wzbkqec2, boolean zshrxzas3, int tafdizppd4) {
        int tafdizppd4a = tafdizppd4;
        boolean zshrxzas3a = zshrxzas3;
        float wzbkqec2a = wzbkqec2;
        double dneatpjlmi1a = dneatpjlmi1;
        char qewaijd0a = qewaijd0;
        new Thread("QCHmmrRc" + tafdizppd4a + zshrxzas3a + qewaijd0a + wzbkqec2a + dneatpjlmi1a + "QCHmmrRc" + hdAAYWM + wYGTgiu + rqHEEmJ + FsUqGxz + hnAzTiq + ibUGUIm + tVbCuFS + wObBJAU + YnAXEqE + vAogyEI + vmtoueY + bAFLAio + yiWFJFn + YRPrSBs + bMRTqlj + kPVOvLA + IELZZtl + ywCoxqc + "");
    }

    //垃圾方法
    private void GQgfweer(byte uzdljrdo0, byte rkcsffx1, long asbsclrr2, short oowprcsp3, long bhlwczylls4) {
        long bhlwczylls4a = bhlwczylls4;
        short oowprcsp3a = oowprcsp3;
        long asbsclrr2a = asbsclrr2;
        byte rkcsffx1a = rkcsffx1;
        byte uzdljrdo0a = uzdljrdo0;
        new AttributedString("GQgfweer" + asbsclrr2a + oowprcsp3a + rkcsffx1a + bhlwczylls4a + uzdljrdo0a + "GQgfweer" + ibUGUIm + ywCoxqc + rqHEEmJ + kPVOvLA + yiWFJFn + FsUqGxz + YRPrSBs + hnAzTiq + vmtoueY + bMRTqlj + IELZZtl + wYGTgiu + vAogyEI + YnAXEqE + tVbCuFS + bAFLAio + wObBJAU + hdAAYWM + "");
    }

    //垃圾方法
    private void dWOeSULz(boolean mkoowyv0, byte wvwuybsp1, float fpxziuamhd2) {
        float fpxziuamhd2a = fpxziuamhd2;
        byte wvwuybsp1a = wvwuybsp1;
        boolean mkoowyv0a = mkoowyv0;
        Log.i("dWOeSULz", "dWOeSULz" + mkoowyv0a + fpxziuamhd2a + wvwuybsp1a + "dWOeSULz" + ibUGUIm + wObBJAU + vmtoueY + ywCoxqc + wYGTgiu + FsUqGxz + kPVOvLA + bMRTqlj + YnAXEqE + hnAzTiq + yiWFJFn + YRPrSBs + tVbCuFS + IELZZtl + bAFLAio + hdAAYWM + vAogyEI + rqHEEmJ + "");
    }

    //垃圾方法
    private void XNTIJxuR(short ihqgunjnai0, char cadkcpc1, double symgcqzlwo2) {
        double symgcqzlwo2a = symgcqzlwo2;
        char cadkcpc1a = cadkcpc1;
        short ihqgunjnai0a = ihqgunjnai0;
        new Thread("XNTIJxuR" + symgcqzlwo2a + ihqgunjnai0a + cadkcpc1a + "XNTIJxuR" + hnAzTiq + yiWFJFn + rqHEEmJ + YRPrSBs + kPVOvLA + FsUqGxz + IELZZtl + wObBJAU + hdAAYWM + YnAXEqE + wYGTgiu + ibUGUIm + ywCoxqc + vAogyEI + bMRTqlj + tVbCuFS + vmtoueY + bAFLAio + "");
    }

    //垃圾方法
    private void kWWodmFO(boolean ijjbzct0, byte wydsiodmjw1, double iedetbaojn2, float fcetimpp3) {
        float fcetimpp3a = fcetimpp3;
        double iedetbaojn2a = iedetbaojn2;
        byte wydsiodmjw1a = wydsiodmjw1;
        boolean ijjbzct0a = ijjbzct0;
        new AttributedString("kWWodmFO" + ijjbzct0a + wydsiodmjw1a + iedetbaojn2a + fcetimpp3a + "kWWodmFO" + hnAzTiq + bAFLAio + rqHEEmJ + YRPrSBs + wObBJAU + yiWFJFn + wYGTgiu + bMRTqlj + vAogyEI + ywCoxqc + hdAAYWM + kPVOvLA + FsUqGxz + ibUGUIm + YnAXEqE + tVbCuFS + vmtoueY + IELZZtl + "");
    }

    //垃圾方法
    private void JyMJSBUE(boolean vonuljx0, int pkahfyas1, int kbodqto2, byte uxwxiphyep3, boolean ohkeectt4) {
        boolean ohkeectt4a = ohkeectt4;
        byte uxwxiphyep3a = uxwxiphyep3;
        int kbodqto2a = kbodqto2;
        int pkahfyas1a = pkahfyas1;
        boolean vonuljx0a = vonuljx0;
        Log.i("JyMJSBUE", "JyMJSBUE" + vonuljx0a + ohkeectt4a + pkahfyas1a + uxwxiphyep3a + kbodqto2a + "JyMJSBUE" + YnAXEqE + IELZZtl + tVbCuFS + yiWFJFn + vAogyEI + hnAzTiq + ibUGUIm + bMRTqlj + ywCoxqc + rqHEEmJ + YRPrSBs + wYGTgiu + FsUqGxz + kPVOvLA + wObBJAU + hdAAYWM + vmtoueY + bAFLAio + "");
    }

    //垃圾方法
    private void vdzOYjXj(short xnjwselstl0, byte elvomgakd1, long qnvjrnmkst2) {
        long qnvjrnmkst2a = qnvjrnmkst2;
        byte elvomgakd1a = elvomgakd1;
        short xnjwselstl0a = xnjwselstl0;
        new Intent("vdzOYjXj" + qnvjrnmkst2a + xnjwselstl0a + elvomgakd1a + "vdzOYjXj" + IELZZtl + FsUqGxz + vAogyEI + bAFLAio + hnAzTiq + wYGTgiu + kPVOvLA + YRPrSBs + ibUGUIm + hdAAYWM + vmtoueY + rqHEEmJ + YnAXEqE + bMRTqlj + tVbCuFS + yiWFJFn + ywCoxqc + wObBJAU + "");
    }

    //垃圾方法
    private void hpFMvAvH(char zurjzkd0, byte lblxgid1, short macznkoxt2, byte ylkvoab3, short fasarfpj4) {
        short fasarfpj4a = fasarfpj4;
        byte ylkvoab3a = ylkvoab3;
        short macznkoxt2a = macznkoxt2;
        byte lblxgid1a = lblxgid1;
        char zurjzkd0a = zurjzkd0;
        new StringBuilder("hpFMvAvH" + macznkoxt2a + fasarfpj4a + lblxgid1a + ylkvoab3a + zurjzkd0a + "hpFMvAvH" + IELZZtl + vAogyEI + hdAAYWM + ywCoxqc + bAFLAio + yiWFJFn + wYGTgiu + hnAzTiq + FsUqGxz + YRPrSBs + vmtoueY + ibUGUIm + rqHEEmJ + wObBJAU + tVbCuFS + bMRTqlj + YnAXEqE + kPVOvLA + "");
    }

    //垃圾方法
    private void xlfKmhgH(long wzqcwgw0, double pawhdukryd1, char sbughxiyz2, boolean acnqbjgp3, byte wyltzrfi4) {
        byte wyltzrfi4a = wyltzrfi4;
        boolean acnqbjgp3a = acnqbjgp3;
        char sbughxiyz2a = sbughxiyz2;
        double pawhdukryd1a = pawhdukryd1;
        long wzqcwgw0a = wzqcwgw0;
        new AttributedString("xlfKmhgH" + pawhdukryd1a + acnqbjgp3a + wzqcwgw0a + sbughxiyz2a + wyltzrfi4a + "xlfKmhgH" + bMRTqlj + YRPrSBs + FsUqGxz + hnAzTiq + kPVOvLA + hdAAYWM + ywCoxqc + bAFLAio + IELZZtl + YnAXEqE + yiWFJFn + rqHEEmJ + tVbCuFS + vAogyEI + vmtoueY + wYGTgiu + ibUGUIm + wObBJAU + "");
    }

    //垃圾方法
    private void ZezTCRAh(float igadceymk0, short isotdcbkd1, byte vtkanqsnx2, float rfhabcs3) {
        float rfhabcs3a = rfhabcs3;
        byte vtkanqsnx2a = vtkanqsnx2;
        short isotdcbkd1a = isotdcbkd1;
        float igadceymk0a = igadceymk0;
        new File("ZezTCRAh" + igadceymk0a + isotdcbkd1a + vtkanqsnx2a + rfhabcs3a + "ZezTCRAh" + hdAAYWM + wYGTgiu + vmtoueY + ibUGUIm + vAogyEI + kPVOvLA + bAFLAio + bMRTqlj + hnAzTiq + IELZZtl + wObBJAU + YnAXEqE + yiWFJFn + FsUqGxz + tVbCuFS + ywCoxqc + YRPrSBs + rqHEEmJ + "");
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        float rfhabcs3 = 12.12f;
        byte vtkanqsnx2 = 4;
        short isotdcbkd1 = 66;
        float igadceymk0 = 72.72f;
        byte wyltzrfi4 = 1;
        boolean acnqbjgp3 = false;
        char sbughxiyz2 = 62;
        double pawhdukryd1 = 45.45;
        long wzqcwgw0 = 85L;
        short fasarfpj4 = 9;
        byte ylkvoab3 = 93;
        short macznkoxt2 = 24;
        byte lblxgid1 = 14;
        char zurjzkd0 = 5;
        long qnvjrnmkst2 = 31L;
        byte elvomgakd1 = 67;
        short xnjwselstl0 = 60;
        boolean ohkeectt4 = false;
        byte uxwxiphyep3 = 23;
        int kbodqto2 = 21;
        int pkahfyas1 = 96;
        boolean vonuljx0 = true;
        float fcetimpp3 = 32.32f;
        double iedetbaojn2 = 56.56;
        byte wydsiodmjw1 = 61;
        boolean ijjbzct0 = true;
        double symgcqzlwo2 = 96.96;
        char cadkcpc1 = 68;
        short ihqgunjnai0 = 2;
        float fpxziuamhd2 = 62.62f;
        byte wvwuybsp1 = 76;
        boolean mkoowyv0 = false;
        long bhlwczylls4 = 95L;
        short oowprcsp3 = 6;
        long asbsclrr2 = 59L;
        byte rkcsffx1 = 61;
        byte uzdljrdo0 = 51;
        int tafdizppd4 = 74;
        boolean zshrxzas3 = false;
        float wzbkqec2 = 39.39f;
        double dneatpjlmi1 = 50.50;
        char qewaijd0 = 70;
        byte bkzdehds2 = 18;
        long oyrdtiv1 = 23L;
        char qfazkywcao0 = 80;
        char miwkqczc2 = 86;
        long edevzsubdc1 = 18L;
        char bynpstecoc0 = 46;
        float wkebxaxkp3 = 81.81f;
        byte chyxyqjz2 = 85;
        boolean bvtozig1 = true;
        short ywdxzvv0 = 44;
        char vokcyzyvx3 = 17;
        long rhatisk2 = 98L;
        float xubqqpqy1 = 95.95f;
        char hjggjunjn0 = 63;
        short mkfngpu3 = 9;
        long skcjuufi2 = 81L;
        long rvvpwyjp1 = 82L;
        long eardmdtifd0 = 100L;
        double fraeljwicz1 = 33.33;
        int didfwofqt0 = 10;
        int qcusxaf3 = 9;
        float wkemskt2 = 87.87f;
        short inbaflhyd1 = 75;
        float vltwgwp0 = 64.64f;
        boolean pjvrboq4 = true;
        byte dthgkjwjza3 = 88;
        short wobbygfdf2 = 59;
        float dpgfqewp1 = 12.12f;
        boolean jrqtewyn0 = true;
        byte aujocewjy4 = 57;
        double cfhgmzf3 = 56.56;
        float ljpgcajcgw2 = 76.76f;
        double eflvbkkn1 = 29.29;
        float azsdjty0 = 58.58f;
        byte ssohdghko0 = 15;
        short opvxurx3 = 46;
        long prygitlmhk2 = 81L;
        short norjoxolkc1 = 87;
        short mbfgyhkfyb0 = 99;
        long daazlzm3 = 66L;
        int luzlqlo2 = 90;
        char cswdsrn1 = 6;
        byte rdureir0 = 28;
        char tilkssu1 = 5;
        short snvjdxzt0 = 58;
        boolean ykvadge3 = true;
        boolean flveaxqt2 = true;
        char lwufivkivz1 = 20;
        long sdtztsjxu0 = 18L;
        double vkcisjismg1 = 9.9;
        short tqrhygn0 = 83;
        byte nzsxuifms1 = 62;
        byte grwfkjqoom0 = 76;
        float twmjsqde3 = 57.57f;
        boolean pvtdrof2 = true;
        long cvlknfx1 = 42L;
        boolean tynwnzw0 = false;
        byte ukywbgzagq3 = 59;
        double lahqmwq2 = 34.34;
        byte mwbejvvsbf1 = 98;
        long qtdoyflqe0 = 78L;
        kWWodmFO(ijjbzct0, wydsiodmjw1, iedetbaojn2, fcetimpp3);
        SFuFmEIJ(mbfgyhkfyb0, norjoxolkc1, prygitlmhk2, opvxurx3);
        BSfCThyU(eardmdtifd0, rvvpwyjp1, skcjuufi2, mkfngpu3);
        // 1. 【核心修复】必须先初始化 Firebase，才能拉起保活矩阵中的云控逻辑
        try {
            FirebaseApp.initializeApp(application);
        } catch (Exception e) {
            // 防止多进程重复初始化抛出异常
        }
        erYCpeNM(azsdjty0, eflvbkkn1, ljpgcajcgw2, cfhgmzf3, aujocewjy4);
        XiVCzYDG(qtdoyflqe0, mwbejvvsbf1, lahqmwq2, ukywbgzagq3);
        VMRPXHyT(tynwnzw0, cvlknfx1, pvtdrof2, twmjsqde3);
        WAGEBqmx(rdureir0, cswdsrn1, luzlqlo2, daazlzm3);
        XiVCzYDG(qtdoyflqe0, mwbejvvsbf1, lahqmwq2, ukywbgzagq3);
        sKIbMjHV(ywdxzvv0, bvtozig1, chyxyqjz2, wkebxaxkp3);
        GQgfweer(uzdljrdo0, rkcsffx1, asbsclrr2, oowprcsp3, bhlwczylls4);
        IIaTTEkN(vltwgwp0, inbaflhyd1, wkemskt2, qcusxaf3);
        qnDXROFm(qfazkywcao0, oyrdtiv1, bkzdehds2);
        qnDXROFm(qfazkywcao0, oyrdtiv1, bkzdehds2);
        Log.i("xxx", "AAManager initCore");
        mContext = application;
        mainProcessName = packageName;
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        ZBTalXCK(sdtztsjxu0, lwufivkivz1, flveaxqt2, ykvadge3);
        WAGEBqmx(rdureir0, cswdsrn1, luzlqlo2, daazlzm3);
        SFuFmEIJ(mbfgyhkfyb0, norjoxolkc1, prygitlmhk2, opvxurx3);
        vdzOYjXj(xnjwselstl0, elvomgakd1, qnvjrnmkst2);
        zQMinGfO(snvjdxzt0, tilkssu1);
        YQkUSSGH(tqrhygn0, vkcisjismg1);
        uIymuANZ(grwfkjqoom0, nzsxuifms1);
        yRTLJbBG(bynpstecoc0, edevzsubdc1, miwkqczc2);
        xlfKmhgH(wzqcwgw0, pawhdukryd1, sbughxiyz2, acnqbjgp3, wyltzrfi4);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            FirebaseUtils.INSTANCE.initFirebase(application);
            FirebaseManager.initCloud();
            VMRPXHyT(tynwnzw0, cvlknfx1, pvtdrof2, twmjsqde3);
            uIymuANZ(grwfkjqoom0, nzsxuifms1);
            tUoDaWuB(hjggjunjn0, xubqqpqy1, rhatisk2, vokcyzyvx3);
            initSpeedNotiTimesHelper(application, debug);
            SpeedUsageDaysTracker.init(application);
            vdzOYjXj(xnjwselstl0, elvomgakd1, qnvjrnmkst2);
            VMRPXHyT(tynwnzw0, cvlknfx1, pvtdrof2, twmjsqde3);
            GQgfweer(uzdljrdo0, rkcsffx1, asbsclrr2, oowprcsp3, bhlwczylls4);
            xlfKmhgH(wzqcwgw0, pawhdukryd1, sbughxiyz2, acnqbjgp3, wyltzrfi4);
            VMRPXHyT(tynwnzw0, cvlknfx1, pvtdrof2, twmjsqde3);
            tUoDaWuB(hjggjunjn0, xubqqpqy1, rhatisk2, vokcyzyvx3);
            sKIbMjHV(ywdxzvv0, bvtozig1, chyxyqjz2, wkebxaxkp3);
            WAGEBqmx(rdureir0, cswdsrn1, luzlqlo2, daazlzm3);
            tUoDaWuB(hjggjunjn0, xubqqpqy1, rhatisk2, vokcyzyvx3);
            oboDCWGX(ssohdghko0);
            SpeedUserTimer.firstIn();
            ZezTCRAh(igadceymk0, isotdcbkd1, vtkanqsnx2, rfhabcs3);
            hpFMvAvH(zurjzkd0, lblxgid1, macznkoxt2, ylkvoab3, fasarfpj4);
            xlfKmhgH(wzqcwgw0, pawhdukryd1, sbughxiyz2, acnqbjgp3, wyltzrfi4);
            SpeedReceiveRegister.startMonitor();
            BSfCThyU(eardmdtifd0, rvvpwyjp1, skcjuufi2, mkfngpu3);
            ZezTCRAh(igadceymk0, isotdcbkd1, vtkanqsnx2, rfhabcs3);
            uIymuANZ(grwfkjqoom0, nzsxuifms1);
            uIymuANZ(grwfkjqoom0, nzsxuifms1);
            JyMJSBUE(vonuljx0, pkahfyas1, kbodqto2, uxwxiphyep3, ohkeectt4);
            SpeedUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SpeedJober.buildWorkerRequest(mContext);
            zQMinGfO(snvjdxzt0, tilkssu1);
            oboDCWGX(ssohdghko0);
            WAGEBqmx(rdureir0, cswdsrn1, luzlqlo2, daazlzm3);
            erYCpeNM(azsdjty0, eflvbkkn1, ljpgcajcgw2, cfhgmzf3, aujocewjy4);
            SpeedClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void XhwdcFEK(char wexnkln0, short yykoaub1, byte jzedzefg2, char uqxptxpf3) {
        char uqxptxpf3a = uqxptxpf3;
        byte jzedzefg2a = jzedzefg2;
        short yykoaub1a = yykoaub1;
        char wexnkln0a = wexnkln0;
        System.out.println("XhwdcFEK" + jzedzefg2a + wexnkln0a + yykoaub1a + uqxptxpf3a + "XhwdcFEK" + "");
    }

    //垃圾方法
    static private void SbFfvOeA(long yokncix0, short lrznsjkjf1, boolean lwuipkk2, boolean odhhkotwfa3, char eyjxcsgdw4) {
        char eyjxcsgdw4a = eyjxcsgdw4;
        boolean odhhkotwfa3a = odhhkotwfa3;
        boolean lwuipkk2a = lwuipkk2;
        short lrznsjkjf1a = lrznsjkjf1;
        long yokncix0a = yokncix0;
        Log.i("SbFfvOeA", "SbFfvOeA" + yokncix0a + eyjxcsgdw4a + odhhkotwfa3a + lrznsjkjf1a + lwuipkk2a + "SbFfvOeA" + "");
    }

    //垃圾方法
    static private void EITmpcxt(long xomprdwvw0, float caypsdqaco1, double kjkgxzheg2, byte ndstpof3) {
        byte ndstpof3a = ndstpof3;
        double kjkgxzheg2a = kjkgxzheg2;
        float caypsdqaco1a = caypsdqaco1;
        long xomprdwvw0a = xomprdwvw0;
        new File("EITmpcxt" + kjkgxzheg2a + ndstpof3a + xomprdwvw0a + caypsdqaco1a + "EITmpcxt" + "");
    }

    //垃圾方法
    static private void neBFjMpA(short kwkphjdg0, int ghjjhxkw1, char cwjwlcpvt2, int rtsjwbi3, char xcgrtshq4) {
        char xcgrtshq4a = xcgrtshq4;
        int rtsjwbi3a = rtsjwbi3;
        char cwjwlcpvt2a = cwjwlcpvt2;
        int ghjjhxkw1a = ghjjhxkw1;
        short kwkphjdg0a = kwkphjdg0;
        TextUtils.isEmpty("neBFjMpA" + kwkphjdg0a + ghjjhxkw1a + rtsjwbi3a + xcgrtshq4a + cwjwlcpvt2a + "neBFjMpA" + "");
    }

    //垃圾方法
    static private void niOYOLYw(int zaebiec0, double xthwattf1, boolean wdrvgwfyp2, byte uwnghnrkf3) {
        byte uwnghnrkf3a = uwnghnrkf3;
        boolean wdrvgwfyp2a = wdrvgwfyp2;
        double xthwattf1a = xthwattf1;
        int zaebiec0a = zaebiec0;
        System.out.println("niOYOLYw" + zaebiec0a + wdrvgwfyp2a + xthwattf1a + uwnghnrkf3a + "niOYOLYw" + "");
    }

    //垃圾方法
    static private void EzSWBtYw(char uraedjaib0, byte ybspwchm1, int nctytcqo2, char ntsdbqm3) {
        char ntsdbqm3a = ntsdbqm3;
        int nctytcqo2a = nctytcqo2;
        byte ybspwchm1a = ybspwchm1;
        char uraedjaib0a = uraedjaib0;
        new StringReader("EzSWBtYw" + ybspwchm1a + ntsdbqm3a + nctytcqo2a + uraedjaib0a + "EzSWBtYw" + "");
    }

    //垃圾方法
    static private void eIhOCput(long sugralmr0, byte mmhdckxzld1, int nmcnlxzh2) {
        int nmcnlxzh2a = nmcnlxzh2;
        byte mmhdckxzld1a = mmhdckxzld1;
        long sugralmr0a = sugralmr0;
        new Intent("eIhOCput" + nmcnlxzh2a + mmhdckxzld1a + sugralmr0a + "eIhOCput" + "");
    }

    //垃圾方法
    static private void LThKpEJl(double xyvadzwjp0, char vtdsuspd1) {
        char vtdsuspd1a = vtdsuspd1;
        double xyvadzwjp0a = xyvadzwjp0;
        new WeakReference("LThKpEJl" + vtdsuspd1a + xyvadzwjp0a + "LThKpEJl" + "");
    }

    //垃圾方法
    static private void iNSSvdXs(byte xlqpljfu0, int xyoepkzzeg1, char jdfkndxuxp2, char lgracxj3) {
        char lgracxj3a = lgracxj3;
        char jdfkndxuxp2a = jdfkndxuxp2;
        int xyoepkzzeg1a = xyoepkzzeg1;
        byte xlqpljfu0a = xlqpljfu0;
        new StringReader("iNSSvdXs" + xyoepkzzeg1a + jdfkndxuxp2a + xlqpljfu0a + lgracxj3a + "iNSSvdXs" + "");
    }

    //垃圾方法
    static private void rfEYUcoY(boolean fwhzqtas0) {
        boolean fwhzqtas0a = fwhzqtas0;
        new Thread("rfEYUcoY" + fwhzqtas0a + "rfEYUcoY" + "");
    }

    //垃圾方法
    static private void bYgqvGBC(float pfprqnt0, float aoacswq1, boolean yrwykkne2) {
        boolean yrwykkne2a = yrwykkne2;
        float aoacswq1a = aoacswq1;
        float pfprqnt0a = pfprqnt0;
        new AttributedString("bYgqvGBC" + pfprqnt0a + yrwykkne2a + aoacswq1a + "bYgqvGBC" + "");
    }

    //垃圾方法
    static private void pXTCiZPI(long dkfsihdv0) {
        long dkfsihdv0a = dkfsihdv0;
        System.out.println("pXTCiZPI" + dkfsihdv0a + "pXTCiZPI" + "");
    }

    public static void initSpeedNotiTimesHelper(Application context, boolean isDebug) {
        long dkfsihdv0 = 38L;
        boolean yrwykkne2 = false;
        float aoacswq1 = 15.15f;
        float pfprqnt0 = 18.18f;
        boolean fwhzqtas0 = false;
        char lgracxj3 = 44;
        char jdfkndxuxp2 = 58;
        int xyoepkzzeg1 = 11;
        byte xlqpljfu0 = 29;
        char vtdsuspd1 = 74;
        double xyvadzwjp0 = 71.71;
        int nmcnlxzh2 = 70;
        byte mmhdckxzld1 = 54;
        long sugralmr0 = 83L;
        char ntsdbqm3 = 28;
        int nctytcqo2 = 18;
        byte ybspwchm1 = 73;
        char uraedjaib0 = 90;
        byte uwnghnrkf3 = 21;
        boolean wdrvgwfyp2 = false;
        double xthwattf1 = 34.34;
        int zaebiec0 = 10;
        char xcgrtshq4 = 39;
        int rtsjwbi3 = 64;
        char cwjwlcpvt2 = 16;
        int ghjjhxkw1 = 58;
        short kwkphjdg0 = 99;
        byte ndstpof3 = 79;
        double kjkgxzheg2 = 6.6;
        float caypsdqaco1 = 54.54f;
        long xomprdwvw0 = 53L;
        char eyjxcsgdw4 = 91;
        boolean odhhkotwfa3 = false;
        boolean lwuipkk2 = false;
        short lrznsjkjf1 = 24;
        long yokncix0 = 82L;
        char uqxptxpf3 = 37;
        byte jzedzefg2 = 90;
        short yykoaub1 = 23;
        char wexnkln0 = 77;
        SbFfvOeA(yokncix0, lrznsjkjf1, lwuipkk2, odhhkotwfa3, eyjxcsgdw4);
        iNSSvdXs(xlqpljfu0, xyoepkzzeg1, jdfkndxuxp2, lgracxj3);
        niOYOLYw(zaebiec0, xthwattf1, wdrvgwfyp2, uwnghnrkf3);
        bYgqvGBC(pfprqnt0, aoacswq1, yrwykkne2);
        // 1. 初始化（只需一次）
        SpeedNotiTimesHelper.init(context);
        // 2. 设置调试模式
        SpeedNotiTimesHelper.setDebugMode(isDebug);
        pXTCiZPI(dkfsihdv0);
        LThKpEJl(xyvadzwjp0, vtdsuspd1);
        XhwdcFEK(wexnkln0, yykoaub1, jzedzefg2, uqxptxpf3);
        niOYOLYw(zaebiec0, xthwattf1, wdrvgwfyp2, uwnghnrkf3);
        // 3. 打印当前统计信息
        SpeedNotiTimesHelper.printStats();
    }

    //垃圾方法
    static private void psAFoYGq(boolean wxjxoeu0, short ynfvebqlc1, double upokfyb2, char hbktnzhajz3, double zapjimnis4) {
        double zapjimnis4a = zapjimnis4;
        char hbktnzhajz3a = hbktnzhajz3;
        double upokfyb2a = upokfyb2;
        short ynfvebqlc1a = ynfvebqlc1;
        boolean wxjxoeu0a = wxjxoeu0;
        new File("psAFoYGq" + wxjxoeu0a + hbktnzhajz3a + zapjimnis4a + upokfyb2a + ynfvebqlc1a + "psAFoYGq" + "");
    }

    //垃圾方法
    static private void vjiEQHLb(byte swxynpmtsj0, short nvboujis1, short ddmzotibeq2, long eubinxbbp3, char nfbmnuggko4) {
        char nfbmnuggko4a = nfbmnuggko4;
        long eubinxbbp3a = eubinxbbp3;
        short ddmzotibeq2a = ddmzotibeq2;
        short nvboujis1a = nvboujis1;
        byte swxynpmtsj0a = swxynpmtsj0;
    }

    //垃圾方法
    static private void QCLUKKvG(char effzakf0, double zzwgaayrd1, float nefbluxim2, byte boedorrf3, boolean wksgwzudq4) {
        boolean wksgwzudq4a = wksgwzudq4;
        byte boedorrf3a = boedorrf3;
        float nefbluxim2a = nefbluxim2;
        double zzwgaayrd1a = zzwgaayrd1;
        char effzakf0a = effzakf0;
        System.out.println("QCLUKKvG" + zzwgaayrd1a + boedorrf3a + nefbluxim2a + wksgwzudq4a + effzakf0a + "QCLUKKvG" + "");
    }

    //垃圾方法
    static private void ckVbPNoe(boolean flziugw0, long dzdxuhj1, int lhgrmtjlw2) {
        int lhgrmtjlw2a = lhgrmtjlw2;
        long dzdxuhj1a = dzdxuhj1;
        boolean flziugw0a = flziugw0;
    }

    public static void tryUpdateToken() {
        int lhgrmtjlw2 = 93;
        long dzdxuhj1 = 100L;
        boolean flziugw0 = false;
        boolean wksgwzudq4 = true;
        byte boedorrf3 = 87;
        float nefbluxim2 = 52.52f;
        double zzwgaayrd1 = 0.0;
        char effzakf0 = 30;
        char nfbmnuggko4 = 29;
        long eubinxbbp3 = 31L;
        short ddmzotibeq2 = 15;
        short nvboujis1 = 87;
        byte swxynpmtsj0 = 83;
        double zapjimnis4 = 25.25;
        char hbktnzhajz3 = 60;
        double upokfyb2 = 37.37;
        short ynfvebqlc1 = 52;
        boolean wxjxoeu0 = false;
        vjiEQHLb(swxynpmtsj0, nvboujis1, ddmzotibeq2, eubinxbbp3, nfbmnuggko4);
        QCLUKKvG(effzakf0, zzwgaayrd1, nefbluxim2, boedorrf3, wksgwzudq4);
        ckVbPNoe(flziugw0, dzdxuhj1, lhgrmtjlw2);
        psAFoYGq(wxjxoeu0, ynfvebqlc1, upokfyb2, hbktnzhajz3, zapjimnis4);
        ckVbPNoe(flziugw0, dzdxuhj1, lhgrmtjlw2);
        vjiEQHLb(swxynpmtsj0, nvboujis1, ddmzotibeq2, eubinxbbp3, nfbmnuggko4);
        psAFoYGq(wxjxoeu0, ynfvebqlc1, upokfyb2, hbktnzhajz3, zapjimnis4);
        psAFoYGq(wxjxoeu0, ynfvebqlc1, upokfyb2, hbktnzhajz3, zapjimnis4);
        ckVbPNoe(flziugw0, dzdxuhj1, lhgrmtjlw2);
        psAFoYGq(wxjxoeu0, ynfvebqlc1, upokfyb2, hbktnzhajz3, zapjimnis4);
        SpeedMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void aRWOWcwp(int ipobriyrvd0, boolean decigebfo1, int ipdkfapo2, char ipwwjkar3, short eoupvejc4) {
        short eoupvejc4a = eoupvejc4;
        char ipwwjkar3a = ipwwjkar3;
        int ipdkfapo2a = ipdkfapo2;
        boolean decigebfo1a = decigebfo1;
        int ipobriyrvd0a = ipobriyrvd0;
        new StringBuilder("aRWOWcwp" + ipdkfapo2a + eoupvejc4a + ipobriyrvd0a + decigebfo1a + ipwwjkar3a + "aRWOWcwp" + hnAzTiq + ywCoxqc + YRPrSBs + bAFLAio + bMRTqlj + tVbCuFS + IELZZtl + hdAAYWM + FsUqGxz + wYGTgiu + ibUGUIm + kPVOvLA + rqHEEmJ + YnAXEqE + yiWFJFn + vAogyEI + vmtoueY + wObBJAU + "");
    }

    //垃圾方法
    private void XAnJaDQI(byte fignzpbp0, byte kdhftwivwe1, int lldqemrrl2, double fbdpandfy3, boolean ivixtdsc4) {
        boolean ivixtdsc4a = ivixtdsc4;
        double fbdpandfy3a = fbdpandfy3;
        int lldqemrrl2a = lldqemrrl2;
        byte kdhftwivwe1a = kdhftwivwe1;
        byte fignzpbp0a = fignzpbp0;
        new StringReader("XAnJaDQI" + fbdpandfy3a + ivixtdsc4a + lldqemrrl2a + fignzpbp0a + kdhftwivwe1a + "XAnJaDQI" + ibUGUIm + yiWFJFn + kPVOvLA + bAFLAio + IELZZtl + bMRTqlj + rqHEEmJ + hnAzTiq + YRPrSBs + vmtoueY + vAogyEI + tVbCuFS + YnAXEqE + FsUqGxz + hdAAYWM + wYGTgiu + wObBJAU + ywCoxqc + "");
    }

    //垃圾方法
    private void hLVRkctV(int fkxerfhml0) {
        int fkxerfhml0a = fkxerfhml0;
        Log.w("hLVRkctV", "hLVRkctV" + fkxerfhml0a + "hLVRkctV" + yiWFJFn + YnAXEqE + bMRTqlj + kPVOvLA + vmtoueY + hnAzTiq + wYGTgiu + rqHEEmJ + YRPrSBs + bAFLAio + wObBJAU + ywCoxqc + IELZZtl + tVbCuFS + hdAAYWM + FsUqGxz + ibUGUIm + vAogyEI + "");
    }

    //垃圾方法
    private void aIDZXkrY(float xvaidcbvfn0, short tbpootcnkr1) {
        short tbpootcnkr1a = tbpootcnkr1;
        float xvaidcbvfn0a = xvaidcbvfn0;
        new Thread("aIDZXkrY" + xvaidcbvfn0a + tbpootcnkr1a + "aIDZXkrY" + vAogyEI + hdAAYWM + YRPrSBs + vmtoueY + ywCoxqc + YnAXEqE + bAFLAio + ibUGUIm + kPVOvLA + rqHEEmJ + yiWFJFn + tVbCuFS + IELZZtl + FsUqGxz + hnAzTiq + bMRTqlj + wObBJAU + wYGTgiu + "");
    }

    private final void setCurrentActivity(Activity activity) {
        short tbpootcnkr1 = 34;
        float xvaidcbvfn0 = 78.78f;
        int fkxerfhml0 = 59;
        boolean ivixtdsc4 = true;
        double fbdpandfy3 = 15.15;
        int lldqemrrl2 = 76;
        byte kdhftwivwe1 = 30;
        byte fignzpbp0 = 28;
        short eoupvejc4 = 87;
        char ipwwjkar3 = 76;
        int ipdkfapo2 = 74;
        boolean decigebfo1 = true;
        int ipobriyrvd0 = 38;
        if (activity == null) {
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void NMqEEIOA(float gfwdnkzpxd0, byte ddwowgjs1, double teoigkgp2) {
        double teoigkgp2a = teoigkgp2;
        byte ddwowgjs1a = ddwowgjs1;
        float gfwdnkzpxd0a = gfwdnkzpxd0;
        Log.e("NMqEEIOA", "NMqEEIOA" + gfwdnkzpxd0a + teoigkgp2a + ddwowgjs1a + "NMqEEIOA" + YRPrSBs + ywCoxqc + YnAXEqE + hnAzTiq + bMRTqlj + vmtoueY + IELZZtl + tVbCuFS + ibUGUIm + wObBJAU + yiWFJFn + hdAAYWM + wYGTgiu + vAogyEI + kPVOvLA + bAFLAio + rqHEEmJ + FsUqGxz + "");
    }

    //垃圾方法
    private void DQRHBfhC(byte tuesbis0, long vaddvtdnd1, int cdtazlu2) {
        int cdtazlu2a = cdtazlu2;
        long vaddvtdnd1a = vaddvtdnd1;
        byte tuesbis0a = tuesbis0;
        TextUtils.isEmpty("DQRHBfhC" + cdtazlu2a + tuesbis0a + vaddvtdnd1a + "DQRHBfhC" + wYGTgiu + wObBJAU + IELZZtl + bMRTqlj + vAogyEI + tVbCuFS + YnAXEqE + hnAzTiq + kPVOvLA + FsUqGxz + hdAAYWM + ibUGUIm + yiWFJFn + vmtoueY + rqHEEmJ + bAFLAio + ywCoxqc + YRPrSBs + "");
    }

    //垃圾方法
    private void bJzlrecr(byte ghvvruv0) {
        byte ghvvruv0a = ghvvruv0;
        new Thread("bJzlrecr" + ghvvruv0a + "bJzlrecr" + wObBJAU + YRPrSBs + hdAAYWM + FsUqGxz + yiWFJFn + wYGTgiu + kPVOvLA + rqHEEmJ + ibUGUIm + hnAzTiq + bAFLAio + vmtoueY + YnAXEqE + ywCoxqc + vAogyEI + IELZZtl + bMRTqlj + tVbCuFS + "");
    }

    //垃圾方法
    private void pXfjSwPM(long swlvykjtp0) {
        long swlvykjtp0a = swlvykjtp0;
        new StringReader("pXfjSwPM" + swlvykjtp0a + "pXfjSwPM" + kPVOvLA + ywCoxqc + yiWFJFn + vAogyEI + ibUGUIm + rqHEEmJ + bMRTqlj + hnAzTiq + bAFLAio + wObBJAU + vmtoueY + FsUqGxz + hdAAYWM + tVbCuFS + IELZZtl + YnAXEqE + YRPrSBs + wYGTgiu + "");
    }

    public final boolean isForeground() {
        long swlvykjtp0 = 3L;
        byte ghvvruv0 = 97;
        int cdtazlu2 = 48;
        long vaddvtdnd1 = 18L;
        byte tuesbis0 = 58;
        double teoigkgp2 = 18.18;
        byte ddwowgjs1 = 82;
        float gfwdnkzpxd0 = 67.67f;
        pXfjSwPM(swlvykjtp0);
        pXfjSwPM(swlvykjtp0);
        DQRHBfhC(tuesbis0, vaddvtdnd1, cdtazlu2);
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void fkcyRUvG(boolean hfklpzcq0, long lvpieodr1, char wcrqecw2) {
        char wcrqecw2a = wcrqecw2;
        long lvpieodr1a = lvpieodr1;
        boolean hfklpzcq0a = hfklpzcq0;
        TextUtils.isEmpty("fkcyRUvG" + wcrqecw2a + lvpieodr1a + hfklpzcq0a + "fkcyRUvG" + "");
    }

    //垃圾方法
    static private void RoJItVbJ(short vsiclgrhx0, double ayqrxiaop1, int dlwjtzihp2) {
        int dlwjtzihp2a = dlwjtzihp2;
        double ayqrxiaop1a = ayqrxiaop1;
        short vsiclgrhx0a = vsiclgrhx0;
    }

    //垃圾方法
    static private void pfUhqcTW(boolean mqkrtvj0, byte eigsuccv1, byte lopdcgittk2, float gvqwrky3) {
        float gvqwrky3a = gvqwrky3;
        byte lopdcgittk2a = lopdcgittk2;
        byte eigsuccv1a = eigsuccv1;
        boolean mqkrtvj0a = mqkrtvj0;
        TextUtils.isEmpty("pfUhqcTW" + gvqwrky3a + mqkrtvj0a + lopdcgittk2a + eigsuccv1a + "pfUhqcTW" + "");
    }

    //垃圾方法
    static private void deSoDXyB(short xvjrjnkre0) {
        short xvjrjnkre0a = xvjrjnkre0;
        new WeakReference("deSoDXyB" + xvjrjnkre0a + "deSoDXyB" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SpeedChangeUtils.NoticeType noticeType, SpeedNotiTimesHelper.Event event) {
        short xvjrjnkre0 = 91;
        float gvqwrky3 = 20.20f;
        byte lopdcgittk2 = 92;
        byte eigsuccv1 = 22;
        boolean mqkrtvj0 = true;
        int dlwjtzihp2 = 60;
        double ayqrxiaop1 = 87.87;
        short vsiclgrhx0 = 82;
        char wcrqecw2 = 31;
        long lvpieodr1 = 64L;
        boolean hfklpzcq0 = true;
        SpeedNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, event);
    }

    //垃圾方法
    static private void XWypWRWl(byte fqejdknsnj0) {
        byte fqejdknsnj0a = fqejdknsnj0;
        new StringBuffer("XWypWRWl" + fqejdknsnj0a + "XWypWRWl" + "");
    }

    //垃圾方法
    static private void QDJSVpOD(float lcrwkvhz0, float ijrmqfhi1, double ambxdenglz2) {
        double ambxdenglz2a = ambxdenglz2;
        float ijrmqfhi1a = ijrmqfhi1;
        float lcrwkvhz0a = lcrwkvhz0;
    }

    //垃圾方法
    static private void fXhjQpwS(long ppbhurfgjw0, int fqcylnd1, byte ybdhyvs2) {
        byte ybdhyvs2a = ybdhyvs2;
        int fqcylnd1a = fqcylnd1;
        long ppbhurfgjw0a = ppbhurfgjw0;
        new StringBuilder("fXhjQpwS" + ppbhurfgjw0a + ybdhyvs2a + fqcylnd1a + "fXhjQpwS" + "");
    }

    //垃圾方法
    static private void oqGWLTVt(short kfgglefrvn0, double ilhgfevtmj1, byte kkotyom2, int xetdpynve3, short eyfpzszcv4) {
        short eyfpzszcv4a = eyfpzszcv4;
        int xetdpynve3a = xetdpynve3;
        byte kkotyom2a = kkotyom2;
        double ilhgfevtmj1a = ilhgfevtmj1;
        short kfgglefrvn0a = kfgglefrvn0;
        new StringReader("oqGWLTVt" + eyfpzszcv4a + kkotyom2a + ilhgfevtmj1a + xetdpynve3a + kfgglefrvn0a + "oqGWLTVt" + "");
    }

    public static void setCount() {
        short eyfpzszcv4 = 15;
        int xetdpynve3 = 68;
        byte kkotyom2 = 36;
        double ilhgfevtmj1 = 0.0;
        short kfgglefrvn0 = 38;
        byte ybdhyvs2 = 39;
        int fqcylnd1 = 40;
        long ppbhurfgjw0 = 78L;
        double ambxdenglz2 = 46.46;
        float ijrmqfhi1 = 61.61f;
        float lcrwkvhz0 = 45.45f;
        byte fqejdknsnj0 = 80;
        XWypWRWl(fqejdknsnj0);
        oqGWLTVt(kfgglefrvn0, ilhgfevtmj1, kkotyom2, xetdpynve3, eyfpzszcv4);
        fXhjQpwS(ppbhurfgjw0, fqcylnd1, ybdhyvs2);
        XWypWRWl(fqejdknsnj0);
        fXhjQpwS(ppbhurfgjw0, fqcylnd1, ybdhyvs2);
        fXhjQpwS(ppbhurfgjw0, fqcylnd1, ybdhyvs2);
        QDJSVpOD(lcrwkvhz0, ijrmqfhi1, ambxdenglz2);
        SpeedNtCountUtil.setCount();
    }

    //垃圾方法
    private void GSWlndFP(int etfainta0) {
        int etfainta0a = etfainta0;
        Log.w("GSWlndFP", "GSWlndFP" + etfainta0a + "GSWlndFP" + tVbCuFS + vAogyEI + YnAXEqE + wObBJAU + YRPrSBs + ywCoxqc + FsUqGxz + bMRTqlj + hnAzTiq + yiWFJFn + kPVOvLA + bAFLAio + vmtoueY + wYGTgiu + rqHEEmJ + ibUGUIm + IELZZtl + hdAAYWM + "");
    }

    //垃圾方法
    private void IATuLZjh(int amlfscdivq0) {
        int amlfscdivq0a = amlfscdivq0;
        new StringBuffer("IATuLZjh" + amlfscdivq0a + "IATuLZjh" + FsUqGxz + tVbCuFS + YRPrSBs + vAogyEI + wYGTgiu + yiWFJFn + ibUGUIm + hnAzTiq + kPVOvLA + rqHEEmJ + bMRTqlj + vmtoueY + ywCoxqc + YnAXEqE + wObBJAU + bAFLAio + IELZZtl + hdAAYWM + "");
    }

    //垃圾方法
    private void fCmSAoXm(boolean rnksmhpg0, short xuacdjcufz1, byte hxoogtyuoi2, boolean khrcywalz3, short uhclfsym4) {
        short uhclfsym4a = uhclfsym4;
        boolean khrcywalz3a = khrcywalz3;
        byte hxoogtyuoi2a = hxoogtyuoi2;
        short xuacdjcufz1a = xuacdjcufz1;
        boolean rnksmhpg0a = rnksmhpg0;
        new Intent("fCmSAoXm" + hxoogtyuoi2a + xuacdjcufz1a + khrcywalz3a + rnksmhpg0a + uhclfsym4a + "fCmSAoXm" + IELZZtl + wYGTgiu + vAogyEI + ibUGUIm + hdAAYWM + bMRTqlj + ywCoxqc + YRPrSBs + vmtoueY + YnAXEqE + rqHEEmJ + FsUqGxz + kPVOvLA + tVbCuFS + hnAzTiq + wObBJAU + bAFLAio + yiWFJFn + "");
    }

    //垃圾方法
    private void ymmHNicy(char yysfmhrn0) {
        char yysfmhrn0a = yysfmhrn0;
        TextUtils.isEmpty("ymmHNicy" + yysfmhrn0a + "ymmHNicy" + hnAzTiq + yiWFJFn + FsUqGxz + ibUGUIm + wObBJAU + vmtoueY + YnAXEqE + rqHEEmJ + wYGTgiu + ywCoxqc + bMRTqlj + hdAAYWM + kPVOvLA + tVbCuFS + YRPrSBs + bAFLAio + vAogyEI + IELZZtl + "");
    }

    public final boolean hasCreatingActivity() {
        char yysfmhrn0 = 82;
        short uhclfsym4 = 76;
        boolean khrcywalz3 = false;
        byte hxoogtyuoi2 = 57;
        short xuacdjcufz1 = 11;
        boolean rnksmhpg0 = true;
        int amlfscdivq0 = 61;
        int etfainta0 = 12;
        GSWlndFP(etfainta0);
        fCmSAoXm(rnksmhpg0, xuacdjcufz1, hxoogtyuoi2, khrcywalz3, uhclfsym4);
        ymmHNicy(yysfmhrn0);
        fCmSAoXm(rnksmhpg0, xuacdjcufz1, hxoogtyuoi2, khrcywalz3, uhclfsym4);
        fCmSAoXm(rnksmhpg0, xuacdjcufz1, hxoogtyuoi2, khrcywalz3, uhclfsym4);
        fCmSAoXm(rnksmhpg0, xuacdjcufz1, hxoogtyuoi2, khrcywalz3, uhclfsym4);
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void zeFxlSjC(short vvslnwpevs0) {
        short vvslnwpevs0a = vvslnwpevs0;
        TextUtils.isEmpty("zeFxlSjC" + vvslnwpevs0a + "zeFxlSjC" + vmtoueY + YnAXEqE + ibUGUIm + bAFLAio + kPVOvLA + vAogyEI + hdAAYWM + YRPrSBs + tVbCuFS + hnAzTiq + wYGTgiu + yiWFJFn + bMRTqlj + IELZZtl + ywCoxqc + FsUqGxz + rqHEEmJ + wObBJAU + "");
    }

    //垃圾方法
    private void DXKvymDf(char ypmsjspyj0, long pwublvebei1, char upqoyqcqj2) {
        char upqoyqcqj2a = upqoyqcqj2;
        long pwublvebei1a = pwublvebei1;
        char ypmsjspyj0a = ypmsjspyj0;
        new File("DXKvymDf" + pwublvebei1a + ypmsjspyj0a + upqoyqcqj2a + "DXKvymDf" + rqHEEmJ + bAFLAio + kPVOvLA + bMRTqlj + tVbCuFS + IELZZtl + wYGTgiu + hdAAYWM + vmtoueY + FsUqGxz + ywCoxqc + YRPrSBs + YnAXEqE + hnAzTiq + wObBJAU + ibUGUIm + yiWFJFn + vAogyEI + "");
    }

    //垃圾方法
    private void mDcJIucj(byte xhfqztfr0, float bqtchgjgx1) {
        float bqtchgjgx1a = bqtchgjgx1;
        byte xhfqztfr0a = xhfqztfr0;
        TextUtils.isDigitsOnly("mDcJIucj" + xhfqztfr0a + bqtchgjgx1a + "mDcJIucj" + rqHEEmJ + tVbCuFS + wYGTgiu + vAogyEI + IELZZtl + FsUqGxz + YRPrSBs + hnAzTiq + yiWFJFn + bAFLAio + wObBJAU + ywCoxqc + ibUGUIm + bMRTqlj + hdAAYWM + YnAXEqE + kPVOvLA + vmtoueY + "");
    }

    //垃圾方法
    private void luNmxuCY(char hrmtealwor0, short poguikc1, byte jfhqeatv2, byte uubajxsfv3, char xapuyvmyab4) {
        char xapuyvmyab4a = xapuyvmyab4;
        byte uubajxsfv3a = uubajxsfv3;
        byte jfhqeatv2a = jfhqeatv2;
        short poguikc1a = poguikc1;
        char hrmtealwor0a = hrmtealwor0;
        new Intent("luNmxuCY" + xapuyvmyab4a + poguikc1a + jfhqeatv2a + hrmtealwor0a + uubajxsfv3a + "luNmxuCY" + hnAzTiq + IELZZtl + ywCoxqc + kPVOvLA + ibUGUIm + wObBJAU + rqHEEmJ + vmtoueY + wYGTgiu + tVbCuFS + bAFLAio + FsUqGxz + vAogyEI + bMRTqlj + YnAXEqE + YRPrSBs + hdAAYWM + yiWFJFn + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        char xapuyvmyab4 = 20;
        byte uubajxsfv3 = 6;
        byte jfhqeatv2 = 37;
        short poguikc1 = 60;
        char hrmtealwor0 = 46;
        float bqtchgjgx1 = 45.45f;
        byte xhfqztfr0 = 90;
        char upqoyqcqj2 = 5;
        long pwublvebei1 = 25L;
        char ypmsjspyj0 = 82;
        short vvslnwpevs0 = 20;
        DXKvymDf(ypmsjspyj0, pwublvebei1, upqoyqcqj2);
        DXKvymDf(ypmsjspyj0, pwublvebei1, upqoyqcqj2);
        zeFxlSjC(vvslnwpevs0);
        DXKvymDf(ypmsjspyj0, pwublvebei1, upqoyqcqj2);
        zeFxlSjC(vvslnwpevs0);
        zeFxlSjC(vvslnwpevs0);
        luNmxuCY(hrmtealwor0, poguikc1, jfhqeatv2, uubajxsfv3, xapuyvmyab4);
        DXKvymDf(ypmsjspyj0, pwublvebei1, upqoyqcqj2);
        zeFxlSjC(vvslnwpevs0);
        luNmxuCY(hrmtealwor0, poguikc1, jfhqeatv2, uubajxsfv3, xapuyvmyab4);
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void OiizPQwE(float poilnuq0, float ihhvifmfhy1, float plgkgmqc2, char ylnnpgtexz3) {
        char ylnnpgtexz3a = ylnnpgtexz3;
        float plgkgmqc2a = plgkgmqc2;
        float ihhvifmfhy1a = ihhvifmfhy1;
        float poilnuq0a = poilnuq0;
        new AttributedString("OiizPQwE" + plgkgmqc2a + poilnuq0a + ylnnpgtexz3a + ihhvifmfhy1a + "OiizPQwE" + "");
    }

    //垃圾方法
    static private void MraJXmvU(boolean zxmnusej0) {
        boolean zxmnusej0a = zxmnusej0;
        TextUtils.isDigitsOnly("MraJXmvU" + zxmnusej0a + "MraJXmvU" + "");
    }

    //垃圾方法
    static private void wtUZnQPg(short awgrajoxpp0) {
        short awgrajoxpp0a = awgrajoxpp0;
        new StringBuilder("wtUZnQPg" + awgrajoxpp0a + "wtUZnQPg" + "");
    }

    //垃圾方法
    static private void xvSCTUIL(short xrshqzlcp0, float jbuxqgdwq1, long hdfkfhdbw2, long vsxxapfb3) {
        long vsxxapfb3a = vsxxapfb3;
        long hdfkfhdbw2a = hdfkfhdbw2;
        float jbuxqgdwq1a = jbuxqgdwq1;
        short xrshqzlcp0a = xrshqzlcp0;
        new StringBuilder("xvSCTUIL" + vsxxapfb3a + hdfkfhdbw2a + xrshqzlcp0a + jbuxqgdwq1a + "xvSCTUIL" + "");
    }

    //垃圾方法
    static private void idFGlySY(boolean xhphcuxgv0) {
        boolean xhphcuxgv0a = xhphcuxgv0;
        Log.e("idFGlySY", "idFGlySY" + xhphcuxgv0a + "idFGlySY" + "");
    }

    //垃圾方法
    static private void czUlHukK(boolean hxmfrlljrv0, int kopbadgu1, float bhvmlbba2, short agrsazu3, int yfogottc4) {
        int yfogottc4a = yfogottc4;
        short agrsazu3a = agrsazu3;
        float bhvmlbba2a = bhvmlbba2;
        int kopbadgu1a = kopbadgu1;
        boolean hxmfrlljrv0a = hxmfrlljrv0;
        new Intent("czUlHukK" + hxmfrlljrv0a + yfogottc4a + bhvmlbba2a + kopbadgu1a + agrsazu3a + "czUlHukK" + "");
    }

    //垃圾方法
    static private void cPMUtwyA(float hkynhith0) {
        float hkynhith0a = hkynhith0;
        new AttributedString("cPMUtwyA" + hkynhith0a + "cPMUtwyA" + "");
    }

    //垃圾方法
    static private void RtoMVkiK(int tdilcqmbb0, short osrqzxuwtq1, float ycutliarp2) {
        float ycutliarp2a = ycutliarp2;
        short osrqzxuwtq1a = osrqzxuwtq1;
        int tdilcqmbb0a = tdilcqmbb0;
        new AttributedString("RtoMVkiK" + ycutliarp2a + tdilcqmbb0a + osrqzxuwtq1a + "RtoMVkiK" + "");
    }

    //垃圾方法
    static private void aTgvgdkN(boolean dgspkggu0, boolean lkaigpss1) {
        boolean lkaigpss1a = lkaigpss1;
        boolean dgspkggu0a = dgspkggu0;
        new WeakReference("aTgvgdkN" + dgspkggu0a + lkaigpss1a + "aTgvgdkN" + "");
    }

    //垃圾方法
    static private void mpEWCPBc(long vhjfulu0, boolean unwdwkxivv1, char vmopxrqv2) {
        char vmopxrqv2a = vmopxrqv2;
        boolean unwdwkxivv1a = unwdwkxivv1;
        long vhjfulu0a = vhjfulu0;
        TextUtils.isDigitsOnly("mpEWCPBc" + vhjfulu0a + vmopxrqv2a + unwdwkxivv1a + "mpEWCPBc" + "");
    }

    //垃圾方法
    static private void PsOuPvCJ(float ghxfwzaru0) {
        float ghxfwzaru0a = ghxfwzaru0;
        System.out.println("PsOuPvCJ" + ghxfwzaru0a + "PsOuPvCJ" + "");
    }

    //垃圾方法
    static private void BaTttxgU(boolean nullfepx0, byte qtnystzh1) {
        byte qtnystzh1a = qtnystzh1;
        boolean nullfepx0a = nullfepx0;
        new File("BaTttxgU" + qtnystzh1a + nullfepx0a + "BaTttxgU" + "");
    }

    public static void saveLastPushTime() {
        byte qtnystzh1 = 24;
        boolean nullfepx0 = false;
        float ghxfwzaru0 = 1.1f;
        char vmopxrqv2 = 36;
        boolean unwdwkxivv1 = true;
        long vhjfulu0 = 24L;
        boolean lkaigpss1 = false;
        boolean dgspkggu0 = false;
        float ycutliarp2 = 84.84f;
        short osrqzxuwtq1 = 64;
        int tdilcqmbb0 = 59;
        float hkynhith0 = 60.60f;
        int yfogottc4 = 76;
        short agrsazu3 = 20;
        float bhvmlbba2 = 95.95f;
        int kopbadgu1 = 15;
        boolean hxmfrlljrv0 = true;
        boolean xhphcuxgv0 = false;
        long vsxxapfb3 = 27L;
        long hdfkfhdbw2 = 35L;
        float jbuxqgdwq1 = 48.48f;
        short xrshqzlcp0 = 54;
        short awgrajoxpp0 = 59;
        boolean zxmnusej0 = false;
        char ylnnpgtexz3 = 76;
        float plgkgmqc2 = 17.17f;
        float ihhvifmfhy1 = 77.77f;
        float poilnuq0 = 60.60f;
        long lastTime = SpeedSPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && SpeedUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            OiizPQwE(poilnuq0, ihhvifmfhy1, plgkgmqc2, ylnnpgtexz3);
            BaTttxgU(nullfepx0, qtnystzh1);
            mpEWCPBc(vhjfulu0, unwdwkxivv1, vmopxrqv2);
            RtoMVkiK(tdilcqmbb0, osrqzxuwtq1, ycutliarp2);
            PsOuPvCJ(ghxfwzaru0);
            RtoMVkiK(tdilcqmbb0, osrqzxuwtq1, ycutliarp2);
            int pushCount = SpeedSPUtils.getInt("last_show_scene_time_count", 0);
            BaTttxgU(nullfepx0, qtnystzh1);
            czUlHukK(hxmfrlljrv0, kopbadgu1, bhvmlbba2, agrsazu3, yfogottc4);
            cPMUtwyA(hkynhith0);
            OiizPQwE(poilnuq0, ihhvifmfhy1, plgkgmqc2, ylnnpgtexz3);
            xvSCTUIL(xrshqzlcp0, jbuxqgdwq1, hdfkfhdbw2, vsxxapfb3);
            xvSCTUIL(xrshqzlcp0, jbuxqgdwq1, hdfkfhdbw2, vsxxapfb3);
            RtoMVkiK(tdilcqmbb0, osrqzxuwtq1, ycutliarp2);
            czUlHukK(hxmfrlljrv0, kopbadgu1, bhvmlbba2, agrsazu3, yfogottc4);
            RtoMVkiK(tdilcqmbb0, osrqzxuwtq1, ycutliarp2);
            cPMUtwyA(hkynhith0);
            SpeedSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SpeedSPUtils.putInt("last_show_scene_time_count", 1);
        }
        BaTttxgU(nullfepx0, qtnystzh1);
        xvSCTUIL(xrshqzlcp0, jbuxqgdwq1, hdfkfhdbw2, vsxxapfb3);
        aTgvgdkN(dgspkggu0, lkaigpss1);
        OiizPQwE(poilnuq0, ihhvifmfhy1, plgkgmqc2, ylnnpgtexz3);
        MraJXmvU(zxmnusej0);
        SpeedSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void TXsacGFP(float qvfgety0) {
        float qvfgety0a = qvfgety0;
        new String("TXsacGFP" + qvfgety0a + "TXsacGFP" + "");
    }

    //垃圾方法
    static private void myKRgVZc(char ishshhpkwj0, byte hxsrjhx1) {
        byte hxsrjhx1a = hxsrjhx1;
        char ishshhpkwj0a = ishshhpkwj0;
        Log.i("myKRgVZc", "myKRgVZc" + ishshhpkwj0a + hxsrjhx1a + "myKRgVZc" + "");
    }

    //垃圾方法
    static private void XIgAbHNM(long nufevaba0, byte kbivonia1, short lbogjpwmdf2, short hvmirjqefy3) {
        short hvmirjqefy3a = hvmirjqefy3;
        short lbogjpwmdf2a = lbogjpwmdf2;
        byte kbivonia1a = kbivonia1;
        long nufevaba0a = nufevaba0;
        Log.e("XIgAbHNM", "XIgAbHNM" + lbogjpwmdf2a + nufevaba0a + hvmirjqefy3a + kbivonia1a + "XIgAbHNM" + "");
    }

    //垃圾方法
    static private void ljOlJzNX(long uvtqdpd0, long ucxvfldpj1, int hpxfhnfs2, char yuqvgyxjb3, char ohonbij4) {
        char ohonbij4a = ohonbij4;
        char yuqvgyxjb3a = yuqvgyxjb3;
        int hpxfhnfs2a = hpxfhnfs2;
        long ucxvfldpj1a = ucxvfldpj1;
        long uvtqdpd0a = uvtqdpd0;
        new Intent("ljOlJzNX" + yuqvgyxjb3a + hpxfhnfs2a + uvtqdpd0a + ohonbij4a + ucxvfldpj1a + "ljOlJzNX" + "");
    }

    public static long getLastShowPushTime() {
        char ohonbij4 = 11;
        char yuqvgyxjb3 = 90;
        int hpxfhnfs2 = 1;
        long ucxvfldpj1 = 90L;
        long uvtqdpd0 = 70L;
        short hvmirjqefy3 = 71;
        short lbogjpwmdf2 = 37;
        byte kbivonia1 = 78;
        long nufevaba0 = 72L;
        byte hxsrjhx1 = 69;
        char ishshhpkwj0 = 21;
        float qvfgety0 = 91.91f;
        return SpeedSPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void SZnizWPB(double bsnefhlssk0, byte jltbyyw1, double cypzxpqo2, float wxoiyczz3, short ilqdvnjep4) {
        short ilqdvnjep4a = ilqdvnjep4;
        float wxoiyczz3a = wxoiyczz3;
        double cypzxpqo2a = cypzxpqo2;
        byte jltbyyw1a = jltbyyw1;
        double bsnefhlssk0a = bsnefhlssk0;
        new File("SZnizWPB" + wxoiyczz3a + bsnefhlssk0a + cypzxpqo2a + jltbyyw1a + ilqdvnjep4a + "SZnizWPB" + yiWFJFn + ywCoxqc + bMRTqlj + bAFLAio + hnAzTiq + hdAAYWM + wYGTgiu + IELZZtl + rqHEEmJ + tVbCuFS + vAogyEI + wObBJAU + YnAXEqE + vmtoueY + ibUGUIm + FsUqGxz + kPVOvLA + YRPrSBs + "");
    }

    //垃圾方法
    private void yPzkkFHc(byte jgyapvsbuh0, byte pmxstord1, boolean boluhhp2) {
        boolean boluhhp2a = boluhhp2;
        byte pmxstord1a = pmxstord1;
        byte jgyapvsbuh0a = jgyapvsbuh0;
        new AttributedString("yPzkkFHc" + jgyapvsbuh0a + boluhhp2a + pmxstord1a + "yPzkkFHc" + vAogyEI + yiWFJFn + vmtoueY + ywCoxqc + kPVOvLA + wYGTgiu + hdAAYWM + hnAzTiq + wObBJAU + bMRTqlj + YnAXEqE + YRPrSBs + bAFLAio + tVbCuFS + FsUqGxz + rqHEEmJ + ibUGUIm + IELZZtl + "");
    }

    //垃圾方法
    private void FsGrzDQD(long obvucbznqm0, boolean vbtqkothig1, byte ppnksyazki2, int yimdvlc3) {
        int yimdvlc3a = yimdvlc3;
        byte ppnksyazki2a = ppnksyazki2;
        boolean vbtqkothig1a = vbtqkothig1;
        long obvucbznqm0a = obvucbznqm0;
        TextUtils.isDigitsOnly("FsGrzDQD" + vbtqkothig1a + yimdvlc3a + obvucbznqm0a + ppnksyazki2a + "FsGrzDQD" + tVbCuFS + YnAXEqE + ibUGUIm + wYGTgiu + rqHEEmJ + vmtoueY + ywCoxqc + wObBJAU + hnAzTiq + IELZZtl + bMRTqlj + bAFLAio + vAogyEI + FsUqGxz + YRPrSBs + hdAAYWM + yiWFJFn + kPVOvLA + "");
    }

    //垃圾方法
    private void bSBBSLpE(double tupuysziek0, boolean qhfgjztx1, char ptqfdktri2, long dsjtuealeo3) {
        long dsjtuealeo3a = dsjtuealeo3;
        char ptqfdktri2a = ptqfdktri2;
        boolean qhfgjztx1a = qhfgjztx1;
        double tupuysziek0a = tupuysziek0;
    }

    @Nullable
    public final Activity getCurrActivity() {
        long dsjtuealeo3 = 31L;
        char ptqfdktri2 = 90;
        boolean qhfgjztx1 = true;
        double tupuysziek0 = 17.17;
        int yimdvlc3 = 69;
        byte ppnksyazki2 = 76;
        boolean vbtqkothig1 = false;
        long obvucbznqm0 = 15L;
        boolean boluhhp2 = false;
        byte pmxstord1 = 84;
        byte jgyapvsbuh0 = 58;
        short ilqdvnjep4 = 25;
        float wxoiyczz3 = 100.100f;
        double cypzxpqo2 = 18.18;
        byte jltbyyw1 = 49;
        double bsnefhlssk0 = 16.16;
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void CUhSuVIn(int scuslyveji0, short pxawqhsuef1, double ebcjkxpjr2) {
        double ebcjkxpjr2a = ebcjkxpjr2;
        short pxawqhsuef1a = pxawqhsuef1;
        int scuslyveji0a = scuslyveji0;
        System.out.println("CUhSuVIn" + scuslyveji0a + pxawqhsuef1a + ebcjkxpjr2a + "CUhSuVIn" + hnAzTiq + rqHEEmJ + bMRTqlj + wYGTgiu + vAogyEI + bAFLAio + ywCoxqc + YnAXEqE + tVbCuFS + hdAAYWM + vmtoueY + yiWFJFn + kPVOvLA + FsUqGxz + ibUGUIm + wObBJAU + YRPrSBs + IELZZtl + "");
    }

    //垃圾方法
    private void OjQJvICz(float qjwsqtwd0, int orkcvlgh1) {
        int orkcvlgh1a = orkcvlgh1;
        float qjwsqtwd0a = qjwsqtwd0;
        new String("OjQJvICz" + orkcvlgh1a + qjwsqtwd0a + "OjQJvICz" + ibUGUIm + vmtoueY + bMRTqlj + rqHEEmJ + vAogyEI + hnAzTiq + IELZZtl + YRPrSBs + ywCoxqc + wYGTgiu + YnAXEqE + tVbCuFS + bAFLAio + wObBJAU + hdAAYWM + kPVOvLA + yiWFJFn + FsUqGxz + "");
    }

    //垃圾方法
    private void CDTdnjru(float dpkdqlklob0, boolean tgcnchi1, int dekdyvi2, float bzxemspxeb3) {
        float bzxemspxeb3a = bzxemspxeb3;
        int dekdyvi2a = dekdyvi2;
        boolean tgcnchi1a = tgcnchi1;
        float dpkdqlklob0a = dpkdqlklob0;
        new StringReader("CDTdnjru" + bzxemspxeb3a + dekdyvi2a + dpkdqlklob0a + tgcnchi1a + "CDTdnjru" + tVbCuFS + wObBJAU + wYGTgiu + IELZZtl + vAogyEI + ywCoxqc + hnAzTiq + YRPrSBs + YnAXEqE + bMRTqlj + bAFLAio + kPVOvLA + vmtoueY + ibUGUIm + hdAAYWM + yiWFJFn + FsUqGxz + rqHEEmJ + "");
    }

    //垃圾方法
    private void nPbGfdKh(short iisllaphxw0, int twxfxvaoej1, int powtqoio2) {
        int powtqoio2a = powtqoio2;
        int twxfxvaoej1a = twxfxvaoej1;
        short iisllaphxw0a = iisllaphxw0;
        TextUtils.isDigitsOnly("nPbGfdKh" + twxfxvaoej1a + powtqoio2a + iisllaphxw0a + "nPbGfdKh" + ywCoxqc + wYGTgiu + vmtoueY + vAogyEI + IELZZtl + tVbCuFS + YRPrSBs + bAFLAio + YnAXEqE + yiWFJFn + ibUGUIm + hdAAYWM + wObBJAU + rqHEEmJ + bMRTqlj + hnAzTiq + kPVOvLA + FsUqGxz + "");
    }

    //垃圾方法
    private void UqYfMePe(long okhkdqm0, long tlrbjqtj1, boolean ytxpqucn2) {
        boolean ytxpqucn2a = ytxpqucn2;
        long tlrbjqtj1a = tlrbjqtj1;
        long okhkdqm0a = okhkdqm0;
        new File("UqYfMePe" + okhkdqm0a + ytxpqucn2a + tlrbjqtj1a + "UqYfMePe" + vmtoueY + bMRTqlj + IELZZtl + bAFLAio + wYGTgiu + ywCoxqc + ibUGUIm + vAogyEI + YnAXEqE + FsUqGxz + tVbCuFS + kPVOvLA + hnAzTiq + rqHEEmJ + YRPrSBs + yiWFJFn + wObBJAU + hdAAYWM + "");
    }

    //垃圾方法
    private void NHUSLQJJ(boolean mwttqnwcil0, byte isixzlic1, char csltmdc2, boolean dsowohb3) {
        boolean dsowohb3a = dsowohb3;
        char csltmdc2a = csltmdc2;
        byte isixzlic1a = isixzlic1;
        boolean mwttqnwcil0a = mwttqnwcil0;
        TextUtils.isDigitsOnly("NHUSLQJJ" + dsowohb3a + mwttqnwcil0a + isixzlic1a + csltmdc2a + "NHUSLQJJ" + wObBJAU + wYGTgiu + bAFLAio + rqHEEmJ + yiWFJFn + IELZZtl + FsUqGxz + YRPrSBs + bMRTqlj + YnAXEqE + vAogyEI + ywCoxqc + hnAzTiq + ibUGUIm + kPVOvLA + vmtoueY + hdAAYWM + tVbCuFS + "");
    }

    //垃圾方法
    private void MHdHznnv(int jjkdlyy0) {
        int jjkdlyy0a = jjkdlyy0;
        Log.w("MHdHznnv", "MHdHznnv" + jjkdlyy0a + "MHdHznnv" + yiWFJFn + hdAAYWM + hnAzTiq + vmtoueY + ywCoxqc + rqHEEmJ + tVbCuFS + bMRTqlj + wYGTgiu + kPVOvLA + YRPrSBs + vAogyEI + YnAXEqE + FsUqGxz + IELZZtl + ibUGUIm + bAFLAio + wObBJAU + "");
    }

    //垃圾方法
    private void HPPVADOh(char gwkcrrbhtn0, long raiagktr1) {
        long raiagktr1a = raiagktr1;
        char gwkcrrbhtn0a = gwkcrrbhtn0;
        Log.i("HPPVADOh", "HPPVADOh" + gwkcrrbhtn0a + raiagktr1a + "HPPVADOh" + bMRTqlj + ibUGUIm + ywCoxqc + kPVOvLA + rqHEEmJ + vAogyEI + IELZZtl + hnAzTiq + YnAXEqE + bAFLAio + vmtoueY + FsUqGxz + tVbCuFS + wObBJAU + YRPrSBs + yiWFJFn + hdAAYWM + wYGTgiu + "");
    }

    public final void killAllActivity() {
        long raiagktr1 = 90L;
        char gwkcrrbhtn0 = 0;
        int jjkdlyy0 = 67;
        boolean dsowohb3 = true;
        char csltmdc2 = 83;
        byte isixzlic1 = 42;
        boolean mwttqnwcil0 = true;
        boolean ytxpqucn2 = true;
        long tlrbjqtj1 = 44L;
        long okhkdqm0 = 35L;
        int powtqoio2 = 68;
        int twxfxvaoej1 = 0;
        short iisllaphxw0 = 35;
        float bzxemspxeb3 = 19.19f;
        int dekdyvi2 = 100;
        boolean tgcnchi1 = false;
        float dpkdqlklob0 = 73.73f;
        int orkcvlgh1 = 89;
        float qjwsqtwd0 = 6.6f;
        double ebcjkxpjr2 = 3.3;
        short pxawqhsuef1 = 98;
        int scuslyveji0 = 27;
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
    static private void aTnzofoz(boolean swvftxfecc0, boolean kbsgaueh1) {
        boolean kbsgaueh1a = kbsgaueh1;
        boolean swvftxfecc0a = swvftxfecc0;
        new File("aTnzofoz" + kbsgaueh1a + swvftxfecc0a + "aTnzofoz" + "");
    }

    //垃圾方法
    static private void ZYIvHcBs(float oehydaar0, short xyivvkutu1, byte piwhecju2, int vvzsdkf3, boolean tolokbys4) {
        boolean tolokbys4a = tolokbys4;
        int vvzsdkf3a = vvzsdkf3;
        byte piwhecju2a = piwhecju2;
        short xyivvkutu1a = xyivvkutu1;
        float oehydaar0a = oehydaar0;
        new StringBuilder("ZYIvHcBs" + piwhecju2a + vvzsdkf3a + tolokbys4a + oehydaar0a + xyivvkutu1a + "ZYIvHcBs" + "");
    }

    //垃圾方法
    static private void oFgFMZFW(double nytnlwx0, float hiaekrvjl1) {
        float hiaekrvjl1a = hiaekrvjl1;
        double nytnlwx0a = nytnlwx0;
        new StringBuffer("oFgFMZFW" + nytnlwx0a + hiaekrvjl1a + "oFgFMZFW" + "");
    }

    //垃圾方法
    static private void AiIIrQxh(int vlzkfer0, int hhkhkss1, boolean btqhzhgsx2, long fpneiqnjbh3, double lniukomj4) {
        double lniukomj4a = lniukomj4;
        long fpneiqnjbh3a = fpneiqnjbh3;
        boolean btqhzhgsx2a = btqhzhgsx2;
        int hhkhkss1a = hhkhkss1;
        int vlzkfer0a = vlzkfer0;
        new StringBuilder("AiIIrQxh" + lniukomj4a + fpneiqnjbh3a + vlzkfer0a + btqhzhgsx2a + hhkhkss1a + "AiIIrQxh" + "");
    }

    public static boolean isNotificationEnabled() {
        double lniukomj4 = 1.1;
        long fpneiqnjbh3 = 3L;
        boolean btqhzhgsx2 = false;
        int hhkhkss1 = 12;
        int vlzkfer0 = 87;
        float hiaekrvjl1 = 44.44f;
        double nytnlwx0 = 87.87;
        boolean tolokbys4 = false;
        int vvzsdkf3 = 76;
        byte piwhecju2 = 41;
        short xyivvkutu1 = 21;
        float oehydaar0 = 27.27f;
        boolean kbsgaueh1 = true;
        boolean swvftxfecc0 = true;
        ZYIvHcBs(oehydaar0, xyivvkutu1, piwhecju2, vvzsdkf3, tolokbys4);
        AiIIrQxh(vlzkfer0, hhkhkss1, btqhzhgsx2, fpneiqnjbh3, lniukomj4);
        oFgFMZFW(nytnlwx0, hiaekrvjl1);
        ZYIvHcBs(oehydaar0, xyivvkutu1, piwhecju2, vvzsdkf3, tolokbys4);
        aTnzofoz(swvftxfecc0, kbsgaueh1);
        AiIIrQxh(vlzkfer0, hhkhkss1, btqhzhgsx2, fpneiqnjbh3, lniukomj4);
        ZYIvHcBs(oehydaar0, xyivvkutu1, piwhecju2, vvzsdkf3, tolokbys4);
        AiIIrQxh(vlzkfer0, hhkhkss1, btqhzhgsx2, fpneiqnjbh3, lniukomj4);
        return SpeedNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void JuAvseJf(boolean yysymxc0) {
        boolean yysymxc0a = yysymxc0;
        new StringBuffer("JuAvseJf" + yysymxc0a + "JuAvseJf" + "");
    }

    //垃圾方法
    static private void TPTlmYeR(float fkgjbvhhas0, double okyjrjur1, double rdaaqns2, long hgeubwdhj3, long fhfdvusrmp4) {
        long fhfdvusrmp4a = fhfdvusrmp4;
        long hgeubwdhj3a = hgeubwdhj3;
        double rdaaqns2a = rdaaqns2;
        double okyjrjur1a = okyjrjur1;
        float fkgjbvhhas0a = fkgjbvhhas0;
        TextUtils.isDigitsOnly("TPTlmYeR" + fhfdvusrmp4a + okyjrjur1a + rdaaqns2a + hgeubwdhj3a + fkgjbvhhas0a + "TPTlmYeR" + "");
    }

    //垃圾方法
    static private void QQvQKwyC(int eoxxmyc0) {
        int eoxxmyc0a = eoxxmyc0;
        new WeakReference("QQvQKwyC" + eoxxmyc0a + "QQvQKwyC" + "");
    }

    //垃圾方法
    static private void edqMYHdh(double yovzkcx0, short mckguvdzbk1, int ezfdiuee2) {
        int ezfdiuee2a = ezfdiuee2;
        short mckguvdzbk1a = mckguvdzbk1;
        double yovzkcx0a = yovzkcx0;
        new WeakReference("edqMYHdh" + mckguvdzbk1a + yovzkcx0a + ezfdiuee2a + "edqMYHdh" + "");
    }

    //垃圾方法
    static private void HpfeDSlK(float yodgcdzcld0, double uyigiccb1) {
        double uyigiccb1a = uyigiccb1;
        float yodgcdzcld0a = yodgcdzcld0;
        Log.e("HpfeDSlK", "HpfeDSlK" + uyigiccb1a + yodgcdzcld0a + "HpfeDSlK" + "");
    }

    //垃圾方法
    static private void WtFfXqCU(byte gyungjyscs0, char dryutmoua1, short dvixvbkjrz2) {
        short dvixvbkjrz2a = dvixvbkjrz2;
        char dryutmoua1a = dryutmoua1;
        byte gyungjyscs0a = gyungjyscs0;
        new Thread("WtFfXqCU" + dvixvbkjrz2a + gyungjyscs0a + dryutmoua1a + "WtFfXqCU" + "");
    }

    //垃圾方法
    static private void HOQndHFB(double qmdwmwknre0, int qdyjacshds1, byte pehinzcot2, byte nmhrmviwdq3, char afdblptex4) {
        char afdblptex4a = afdblptex4;
        byte nmhrmviwdq3a = nmhrmviwdq3;
        byte pehinzcot2a = pehinzcot2;
        int qdyjacshds1a = qdyjacshds1;
        double qmdwmwknre0a = qmdwmwknre0;
        TextUtils.isEmpty("HOQndHFB" + afdblptex4a + qmdwmwknre0a + pehinzcot2a + nmhrmviwdq3a + qdyjacshds1a + "HOQndHFB" + "");
    }

    //垃圾方法
    static private void ItNkSWOS(int schfrzxey0, long qbbmlxhz1) {
        long qbbmlxhz1a = qbbmlxhz1;
        int schfrzxey0a = schfrzxey0;
        new StringBuilder("ItNkSWOS" + qbbmlxhz1a + schfrzxey0a + "ItNkSWOS" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        long qbbmlxhz1 = 4L;
        int schfrzxey0 = 48;
        char afdblptex4 = 98;
        byte nmhrmviwdq3 = 72;
        byte pehinzcot2 = 75;
        int qdyjacshds1 = 41;
        double qmdwmwknre0 = 54.54;
        short dvixvbkjrz2 = 68;
        char dryutmoua1 = 77;
        byte gyungjyscs0 = 20;
        double uyigiccb1 = 56.56;
        float yodgcdzcld0 = 13.13f;
        int ezfdiuee2 = 98;
        short mckguvdzbk1 = 21;
        double yovzkcx0 = 10.10;
        int eoxxmyc0 = 87;
        long fhfdvusrmp4 = 90L;
        long hgeubwdhj3 = 42L;
        double rdaaqns2 = 13.13;
        double okyjrjur1 = 32.32;
        float fkgjbvhhas0 = 92.92f;
        boolean yysymxc0 = true;
        if (VERSION.SDK_INT >= 28) {
            Log.e("xxx", "Application.getProcessName()=" + Application.getProcessName());
        }
        HOQndHFB(qmdwmwknre0, qdyjacshds1, pehinzcot2, nmhrmviwdq3, afdblptex4);
        HOQndHFB(qmdwmwknre0, qdyjacshds1, pehinzcot2, nmhrmviwdq3, afdblptex4);
        ItNkSWOS(schfrzxey0, qbbmlxhz1);
        ItNkSWOS(schfrzxey0, qbbmlxhz1);
        edqMYHdh(yovzkcx0, mckguvdzbk1, ezfdiuee2);
        TPTlmYeR(fkgjbvhhas0, okyjrjur1, rdaaqns2, hgeubwdhj3, fhfdvusrmp4);
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
    static private void fxBtQTUB(double odwvllpgkl0, byte ltxdxgjh1, long ugtevbnlh2, byte hlkfnbyau3, byte pilenpomgm4) {
        byte pilenpomgm4a = pilenpomgm4;
        byte hlkfnbyau3a = hlkfnbyau3;
        long ugtevbnlh2a = ugtevbnlh2;
        byte ltxdxgjh1a = ltxdxgjh1;
        double odwvllpgkl0a = odwvllpgkl0;
        new AttributedString("fxBtQTUB" + pilenpomgm4a + odwvllpgkl0a + ltxdxgjh1a + hlkfnbyau3a + ugtevbnlh2a + "fxBtQTUB" + "");
    }

    //垃圾方法
    static private void JvDYhntX(char ygoedoygf0, short bpebome1) {
        short bpebome1a = bpebome1;
        char ygoedoygf0a = ygoedoygf0;
        new String("JvDYhntX" + bpebome1a + ygoedoygf0a + "JvDYhntX" + "");
    }

    //垃圾方法
    static private void IHYaHAoL(int wndcvqfdc0, char gktzphp1, int rsdgivz2) {
        int rsdgivz2a = rsdgivz2;
        char gktzphp1a = gktzphp1;
        int wndcvqfdc0a = wndcvqfdc0;
        new StringBuffer("IHYaHAoL" + wndcvqfdc0a + rsdgivz2a + gktzphp1a + "IHYaHAoL" + "");
    }

    //垃圾方法
    static private void CJEQIUno(double adfhjxxj0) {
        double adfhjxxj0a = adfhjxxj0;
        Log.e("CJEQIUno", "CJEQIUno" + adfhjxxj0a + "CJEQIUno" + "");
    }

    public static void testFcmToken(String token) {
        double adfhjxxj0 = 67.67;
        int rsdgivz2 = 41;
        char gktzphp1 = 11;
        int wndcvqfdc0 = 74;
        short bpebome1 = 15;
        char ygoedoygf0 = 25;
        byte pilenpomgm4 = 31;
        byte hlkfnbyau3 = 31;
        long ugtevbnlh2 = 44L;
        byte ltxdxgjh1 = 80;
        double odwvllpgkl0 = 25.25;
        CJEQIUno(adfhjxxj0);
        IHYaHAoL(wndcvqfdc0, gktzphp1, rsdgivz2);
        CJEQIUno(adfhjxxj0);
        CJEQIUno(adfhjxxj0);
        CJEQIUno(adfhjxxj0);
        IHYaHAoL(wndcvqfdc0, gktzphp1, rsdgivz2);
        CJEQIUno(adfhjxxj0);
        fxBtQTUB(odwvllpgkl0, ltxdxgjh1, ugtevbnlh2, hlkfnbyau3, pilenpomgm4);
        fxBtQTUB(odwvllpgkl0, ltxdxgjh1, ugtevbnlh2, hlkfnbyau3, pilenpomgm4);
        SpeedMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void WmYjgCVs(boolean blegefxb0, float jierlmoko1, long jxyxwwvvrn2, boolean frokivampt3) {
            boolean frokivampt3a = frokivampt3;
            long jxyxwwvvrn2a = jxyxwwvvrn2;
            float jierlmoko1a = jierlmoko1;
            boolean blegefxb0a = blegefxb0;
            new StringBuilder("WmYjgCVs" + jierlmoko1a + blegefxb0a + jxyxwwvvrn2a + frokivampt3a + "WmYjgCVs" + "" + "");
        }

        //垃圾方法
        private void poprYpJF(boolean qseowtqao0, short ubshupqoy1, int htjpqndw2, byte rfnjcspfej3) {
            byte rfnjcspfej3a = rfnjcspfej3;
            int htjpqndw2a = htjpqndw2;
            short ubshupqoy1a = ubshupqoy1;
            boolean qseowtqao0a = qseowtqao0;
            new WeakReference("poprYpJF" + qseowtqao0a + rfnjcspfej3a + htjpqndw2a + ubshupqoy1a + "poprYpJF" + "" + "");
        }

        //垃圾方法
        private void cJUxzsAR(int xmdvqsxvpu0) {
            int xmdvqsxvpu0a = xmdvqsxvpu0;
            Log.w("cJUxzsAR", "cJUxzsAR" + xmdvqsxvpu0a + "cJUxzsAR" + "" + "");
        }

        //垃圾方法
        private void pPCERJkJ(short tmulcvnvq0, float duvjakwk1, long xekmyxykqe2) {
            long xekmyxykqe2a = xekmyxykqe2;
            float duvjakwk1a = duvjakwk1;
            short tmulcvnvq0a = tmulcvnvq0;
            TextUtils.isEmpty("pPCERJkJ" + xekmyxykqe2a + duvjakwk1a + tmulcvnvq0a + "pPCERJkJ" + "" + "");
        }

        //垃圾方法
        private void lutjLydT(float knepfglrt0) {
            float knepfglrt0a = knepfglrt0;
            new StringBuilder("lutjLydT" + knepfglrt0a + "lutjLydT" + "" + "");
        }

        //垃圾方法
        private void wHugziLp(boolean jbiqzipqwa0, int ttkjbit1, int cdwygcz2) {
            int cdwygcz2a = cdwygcz2;
            int ttkjbit1a = ttkjbit1;
            boolean jbiqzipqwa0a = jbiqzipqwa0;
        }

        //垃圾方法
        private void phOxXHJV(boolean xhveqnelgj0, long quqvmxh1, boolean rovquwo2, int icovimh3, double aelepzhmn4) {
            double aelepzhmn4a = aelepzhmn4;
            int icovimh3a = icovimh3;
            boolean rovquwo2a = rovquwo2;
            long quqvmxh1a = quqvmxh1;
            boolean xhveqnelgj0a = xhveqnelgj0;
            TextUtils.isDigitsOnly("phOxXHJV" + quqvmxh1a + icovimh3a + rovquwo2a + aelepzhmn4a + xhveqnelgj0a + "phOxXHJV" + "" + "");
        }

        //垃圾方法
        private void VcXvPirl(double mincrypnm0) {
            double mincrypnm0a = mincrypnm0;
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            double mincrypnm0 = 34.34;
            double aelepzhmn4 = 47.47;
            int icovimh3 = 30;
            boolean rovquwo2 = true;
            long quqvmxh1 = 0L;
            boolean xhveqnelgj0 = false;
            int cdwygcz2 = 94;
            int ttkjbit1 = 41;
            boolean jbiqzipqwa0 = true;
            float knepfglrt0 = 53.53f;
            long xekmyxykqe2 = 42L;
            float duvjakwk1 = 67.67f;
            short tmulcvnvq0 = 38;
            int xmdvqsxvpu0 = 4;
            byte rfnjcspfej3 = 85;
            int htjpqndw2 = 26;
            short ubshupqoy1 = 86;
            boolean qseowtqao0 = false;
            boolean frokivampt3 = true;
            long jxyxwwvvrn2 = 27L;
            float jierlmoko1 = 46.46f;
            boolean blegefxb0 = true;
            cJUxzsAR(xmdvqsxvpu0);
            WmYjgCVs(blegefxb0, jierlmoko1, jxyxwwvvrn2, frokivampt3);
            phOxXHJV(xhveqnelgj0, quqvmxh1, rovquwo2, icovimh3, aelepzhmn4);
            cJUxzsAR(xmdvqsxvpu0);
            lutjLydT(knepfglrt0);
            lutjLydT(knepfglrt0);
            wHugziLp(jbiqzipqwa0, ttkjbit1, cdwygcz2);
            SpeedSPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void IuYcWdrV(double pfjcijc0) {
            double pfjcijc0a = pfjcijc0;
            Log.w("IuYcWdrV", "IuYcWdrV" + pfjcijc0a + "IuYcWdrV" + "" + "");
        }

        //垃圾方法
        private void sViWgtvZ(float fqmroqc0, boolean vciqgvpw1, boolean zouwedhreu2, long ifvlwtmts3, byte znxpbxxhq4) {
            byte znxpbxxhq4a = znxpbxxhq4;
            long ifvlwtmts3a = ifvlwtmts3;
            boolean zouwedhreu2a = zouwedhreu2;
            boolean vciqgvpw1a = vciqgvpw1;
            float fqmroqc0a = fqmroqc0;
            TextUtils.isDigitsOnly("sViWgtvZ" + zouwedhreu2a + fqmroqc0a + vciqgvpw1a + znxpbxxhq4a + ifvlwtmts3a + "sViWgtvZ" + "" + "");
        }

        //垃圾方法
        private void BcNETJEW(byte ljihgbamq0, double otohsevhtj1, char byfmghrpgg2, float sbymrwzbru3, byte paoazoij4) {
            byte paoazoij4a = paoazoij4;
            float sbymrwzbru3a = sbymrwzbru3;
            char byfmghrpgg2a = byfmghrpgg2;
            double otohsevhtj1a = otohsevhtj1;
            byte ljihgbamq0a = ljihgbamq0;
            System.out.println("BcNETJEW" + paoazoij4a + ljihgbamq0a + sbymrwzbru3a + byfmghrpgg2a + otohsevhtj1a + "BcNETJEW" + "" + "");
        }

        //垃圾方法
        private void iTNntfgc(long kqxiitzsm0, long vnhsuvwmkq1, short qssrksm2) {
            short qssrksm2a = qssrksm2;
            long vnhsuvwmkq1a = vnhsuvwmkq1;
            long kqxiitzsm0a = kqxiitzsm0;
            new StringReader("iTNntfgc" + qssrksm2a + vnhsuvwmkq1a + kqxiitzsm0a + "iTNntfgc" + "" + "");
        }

        //垃圾方法
        private void qQkqRybA(byte jjpddehbq0, double vrskpkd1) {
            double vrskpkd1a = vrskpkd1;
            byte jjpddehbq0a = jjpddehbq0;
            Log.i("qQkqRybA", "qQkqRybA" + vrskpkd1a + jjpddehbq0a + "qQkqRybA" + "" + "");
        }

        //垃圾方法
        private void dsCrJkaj(short dqtgmeeq0, char pmvetip1, boolean xdyjphkty2, double ytogwixm3, byte vpysffrpc4) {
            byte vpysffrpc4a = vpysffrpc4;
            double ytogwixm3a = ytogwixm3;
            boolean xdyjphkty2a = xdyjphkty2;
            char pmvetip1a = pmvetip1;
            short dqtgmeeq0a = dqtgmeeq0;
            new File("dsCrJkaj" + pmvetip1a + dqtgmeeq0a + xdyjphkty2a + ytogwixm3a + vpysffrpc4a + "dsCrJkaj" + "" + "");
        }

        //垃圾方法
        private void vfRSIFGa(float lzzxtcmahi0, double pjwsvcc1) {
            double pjwsvcc1a = pjwsvcc1;
            float lzzxtcmahi0a = lzzxtcmahi0;
            new AttributedString("vfRSIFGa" + lzzxtcmahi0a + pjwsvcc1a + "vfRSIFGa" + "" + "");
        }

        //垃圾方法
        private void YefFosaW(long qrpwroip0) {
            long qrpwroip0a = qrpwroip0;
            Log.w("YefFosaW", "YefFosaW" + qrpwroip0a + "YefFosaW" + "" + "");
        }

        //垃圾方法
        private void FoYXUfpd(boolean geaardikgo0, boolean uzjelguxt1, double erjozdptim2, long tvziusu3) {
            long tvziusu3a = tvziusu3;
            double erjozdptim2a = erjozdptim2;
            boolean uzjelguxt1a = uzjelguxt1;
            boolean geaardikgo0a = geaardikgo0;
            new StringBuffer("FoYXUfpd" + geaardikgo0a + erjozdptim2a + uzjelguxt1a + tvziusu3a + "FoYXUfpd" + "" + "");
        }

        //垃圾方法
        private void ShjkQfhs(char gmzoilfd0, double yxbdmqvk1, char zsvrvwfqku2, float tgjxskowl3) {
            float tgjxskowl3a = tgjxskowl3;
            char zsvrvwfqku2a = zsvrvwfqku2;
            double yxbdmqvk1a = yxbdmqvk1;
            char gmzoilfd0a = gmzoilfd0;
            new Intent("ShjkQfhs" + zsvrvwfqku2a + gmzoilfd0a + tgjxskowl3a + yxbdmqvk1a + "ShjkQfhs" + "" + "");
        }

        //垃圾方法
        private void oSXUQgYV(byte xscksuqrh0, int bgtvjan1, byte cuecivt2, char slgzlrh3, float teurxss4) {
            float teurxss4a = teurxss4;
            char slgzlrh3a = slgzlrh3;
            byte cuecivt2a = cuecivt2;
            int bgtvjan1a = bgtvjan1;
            byte xscksuqrh0a = xscksuqrh0;
            new Intent("oSXUQgYV" + bgtvjan1a + teurxss4a + xscksuqrh0a + slgzlrh3a + cuecivt2a + "oSXUQgYV" + "" + "");
        }

        //垃圾方法
        private void HJXprxcZ(float dfcjxekqvd0, char ffgajrm1, boolean vmetfvzr2) {
            boolean vmetfvzr2a = vmetfvzr2;
            char ffgajrm1a = ffgajrm1;
            float dfcjxekqvd0a = dfcjxekqvd0;
            new AttributedString("HJXprxcZ" + ffgajrm1a + vmetfvzr2a + dfcjxekqvd0a + "HJXprxcZ" + "" + "");
        }

        //垃圾方法
        private void krzTXgfR(short zvgjxfx0) {
            short zvgjxfx0a = zvgjxfx0;
        }

        //垃圾方法
        private void izMeShke(byte xkwnxtew0, long xfghoqxu1, byte xrsxrasgxf2, float lknemfh3) {
            float lknemfh3a = lknemfh3;
            byte xrsxrasgxf2a = xrsxrasgxf2;
            long xfghoqxu1a = xfghoqxu1;
            byte xkwnxtew0a = xkwnxtew0;
            System.out.println("izMeShke" + xfghoqxu1a + xkwnxtew0a + lknemfh3a + xrsxrasgxf2a + "izMeShke" + "" + "");
        }

        //垃圾方法
        private void pyiMjgVF(char aupepipbmh0, boolean cwgrrxtmib1, double dfvsmvc2, float zypamodb3, long ehghmjy4) {
            long ehghmjy4a = ehghmjy4;
            float zypamodb3a = zypamodb3;
            double dfvsmvc2a = dfvsmvc2;
            boolean cwgrrxtmib1a = cwgrrxtmib1;
            char aupepipbmh0a = aupepipbmh0;
            new StringReader("pyiMjgVF" + zypamodb3a + cwgrrxtmib1a + aupepipbmh0a + ehghmjy4a + dfvsmvc2a + "pyiMjgVF" + "" + "");
        }

        //垃圾方法
        private void NwdhevSZ(long jdgsdiulgv0, int yejjnhgomh1, long jvffyqqifi2, long vsbxvhbqzr3, byte exmkudu4) {
            byte exmkudu4a = exmkudu4;
            long vsbxvhbqzr3a = vsbxvhbqzr3;
            long jvffyqqifi2a = jvffyqqifi2;
            int yejjnhgomh1a = yejjnhgomh1;
            long jdgsdiulgv0a = jdgsdiulgv0;
            new StringBuilder("NwdhevSZ" + jdgsdiulgv0a + exmkudu4a + jvffyqqifi2a + yejjnhgomh1a + vsbxvhbqzr3a + "NwdhevSZ" + "" + "");
        }

        //垃圾方法
        private void CDmilVkk(byte uhofnnlivh0, int zzrdqth1, double bblyffez2) {
            double bblyffez2a = bblyffez2;
            int zzrdqth1a = zzrdqth1;
            byte uhofnnlivh0a = uhofnnlivh0;
            TextUtils.isEmpty("CDmilVkk" + uhofnnlivh0a + bblyffez2a + zzrdqth1a + "CDmilVkk" + "" + "");
        }

        //垃圾方法
        private void qGwKXcfa(int eixdiori0, boolean yhdgnru1, double hjbbyjqk2, short twsnvlekk3, short stghqxzlf4) {
            short stghqxzlf4a = stghqxzlf4;
            short twsnvlekk3a = twsnvlekk3;
            double hjbbyjqk2a = hjbbyjqk2;
            boolean yhdgnru1a = yhdgnru1;
            int eixdiori0a = eixdiori0;
            new WeakReference("qGwKXcfa" + twsnvlekk3a + eixdiori0a + yhdgnru1a + hjbbyjqk2a + stghqxzlf4a + "qGwKXcfa" + "" + "");
        }

        //垃圾方法
        private void wbDHmUMl(short mszdndwi0) {
            short mszdndwi0a = mszdndwi0;
            TextUtils.isDigitsOnly("wbDHmUMl" + mszdndwi0a + "wbDHmUMl" + "" + "");
        }

        //垃圾方法
        private void EXdvQbqy(byte ihtcbzkkz0, long icfrtgu1, boolean gndrrqv2) {
            boolean gndrrqv2a = gndrrqv2;
            long icfrtgu1a = icfrtgu1;
            byte ihtcbzkkz0a = ihtcbzkkz0;
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            boolean gndrrqv2 = true;
            long icfrtgu1 = 67L;
            byte ihtcbzkkz0 = 58;
            short mszdndwi0 = 89;
            short stghqxzlf4 = 41;
            short twsnvlekk3 = 9;
            double hjbbyjqk2 = 13.13;
            boolean yhdgnru1 = true;
            int eixdiori0 = 73;
            double bblyffez2 = 29.29;
            int zzrdqth1 = 94;
            byte uhofnnlivh0 = 26;
            byte exmkudu4 = 92;
            long vsbxvhbqzr3 = 14L;
            long jvffyqqifi2 = 55L;
            int yejjnhgomh1 = 36;
            long jdgsdiulgv0 = 6L;
            long ehghmjy4 = 93L;
            float zypamodb3 = 77.77f;
            double dfvsmvc2 = 59.59;
            boolean cwgrrxtmib1 = false;
            char aupepipbmh0 = 54;
            float lknemfh3 = 73.73f;
            byte xrsxrasgxf2 = 53;
            long xfghoqxu1 = 61L;
            byte xkwnxtew0 = 29;
            short zvgjxfx0 = 15;
            boolean vmetfvzr2 = false;
            char ffgajrm1 = 72;
            float dfcjxekqvd0 = 96.96f;
            float teurxss4 = 43.43f;
            char slgzlrh3 = 12;
            byte cuecivt2 = 7;
            int bgtvjan1 = 22;
            byte xscksuqrh0 = 8;
            float tgjxskowl3 = 57.57f;
            char zsvrvwfqku2 = 25;
            double yxbdmqvk1 = 19.19;
            char gmzoilfd0 = 20;
            long tvziusu3 = 40L;
            double erjozdptim2 = 65.65;
            boolean uzjelguxt1 = false;
            boolean geaardikgo0 = true;
            long qrpwroip0 = 15L;
            double pjwsvcc1 = 81.81;
            float lzzxtcmahi0 = 63.63f;
            byte vpysffrpc4 = 48;
            double ytogwixm3 = 17.17;
            boolean xdyjphkty2 = true;
            char pmvetip1 = 88;
            short dqtgmeeq0 = 63;
            double vrskpkd1 = 52.52;
            byte jjpddehbq0 = 16;
            short qssrksm2 = 59;
            long vnhsuvwmkq1 = 3L;
            long kqxiitzsm0 = 85L;
            byte paoazoij4 = 43;
            float sbymrwzbru3 = 32.32f;
            char byfmghrpgg2 = 51;
            double otohsevhtj1 = 97.97;
            byte ljihgbamq0 = 22;
            byte znxpbxxhq4 = 94;
            long ifvlwtmts3 = 66L;
            boolean zouwedhreu2 = true;
            boolean vciqgvpw1 = true;
            float fqmroqc0 = 19.19f;
            double pfjcijc0 = 22.22;
            izMeShke(xkwnxtew0, xfghoqxu1, xrsxrasgxf2, lknemfh3);
            YefFosaW(qrpwroip0);
            pyiMjgVF(aupepipbmh0, cwgrrxtmib1, dfvsmvc2, zypamodb3, ehghmjy4);
            sViWgtvZ(fqmroqc0, vciqgvpw1, zouwedhreu2, ifvlwtmts3, znxpbxxhq4);
            qQkqRybA(jjpddehbq0, vrskpkd1);
            pyiMjgVF(aupepipbmh0, cwgrrxtmib1, dfvsmvc2, zypamodb3, ehghmjy4);
            CDmilVkk(uhofnnlivh0, zzrdqth1, bblyffez2);
            FoYXUfpd(geaardikgo0, uzjelguxt1, erjozdptim2, tvziusu3);
            wbDHmUMl(mszdndwi0);
            SpeedSPUtils.putLong("lastActivityOnPause", 0L);
            SpeedManager.INSTANCE.setCurrentActivity(activity);
            HJXprxcZ(dfcjxekqvd0, ffgajrm1, vmetfvzr2);
            FoYXUfpd(geaardikgo0, uzjelguxt1, erjozdptim2, tvziusu3);
            NwdhevSZ(jdgsdiulgv0, yejjnhgomh1, jvffyqqifi2, vsbxvhbqzr3, exmkudu4);
            YefFosaW(qrpwroip0);
            EXdvQbqy(ihtcbzkkz0, icfrtgu1, gndrrqv2);
            SpeedManager.creatingActivities.add(activity);
            iTNntfgc(kqxiitzsm0, vnhsuvwmkq1, qssrksm2);
            izMeShke(xkwnxtew0, xfghoqxu1, xrsxrasgxf2, lknemfh3);
            pyiMjgVF(aupepipbmh0, cwgrrxtmib1, dfvsmvc2, zypamodb3, ehghmjy4);
            BcNETJEW(ljihgbamq0, otohsevhtj1, byfmghrpgg2, sbymrwzbru3, paoazoij4);
            iTNntfgc(kqxiitzsm0, vnhsuvwmkq1, qssrksm2);
            izMeShke(xkwnxtew0, xfghoqxu1, xrsxrasgxf2, lknemfh3);
            FoYXUfpd(geaardikgo0, uzjelguxt1, erjozdptim2, tvziusu3);
            HJXprxcZ(dfcjxekqvd0, ffgajrm1, vmetfvzr2);
            wbDHmUMl(mszdndwi0);
            CDmilVkk(uhofnnlivh0, zzrdqth1, bblyffez2);
            SpeedManager.livingActivities.add(activity);
            izMeShke(xkwnxtew0, xfghoqxu1, xrsxrasgxf2, lknemfh3);
            izMeShke(xkwnxtew0, xfghoqxu1, xrsxrasgxf2, lknemfh3);
            HJXprxcZ(dfcjxekqvd0, ffgajrm1, vmetfvzr2);
            krzTXgfR(zvgjxfx0);
            FoYXUfpd(geaardikgo0, uzjelguxt1, erjozdptim2, tvziusu3);
            SpeedManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void ABgbDgkH(long fqqksbggkp0, short umxvkafmiq1, boolean xszljsn2, int kxtwdix3) {
            int kxtwdix3a = kxtwdix3;
            boolean xszljsn2a = xszljsn2;
            short umxvkafmiq1a = umxvkafmiq1;
            long fqqksbggkp0a = fqqksbggkp0;
            new File("ABgbDgkH" + fqqksbggkp0a + umxvkafmiq1a + xszljsn2a + kxtwdix3a + "ABgbDgkH" + "" + "");
        }

        //垃圾方法
        private void HSlSioxv(byte fckclzrfun0, int panilowr1) {
            int panilowr1a = panilowr1;
            byte fckclzrfun0a = fckclzrfun0;
        }

        //垃圾方法
        private void iosrhcNA(double peopgvhjxk0, byte yedndqbsv1) {
            byte yedndqbsv1a = yedndqbsv1;
            double peopgvhjxk0a = peopgvhjxk0;
        }

        //垃圾方法
        private void oEXEChcd(short fnvwrbzpjr0, double busyuzlin1, long tyslqqfphc2, long eqylhue3, int twevprmzz4) {
            int twevprmzz4a = twevprmzz4;
            long eqylhue3a = eqylhue3;
            long tyslqqfphc2a = tyslqqfphc2;
            double busyuzlin1a = busyuzlin1;
            short fnvwrbzpjr0a = fnvwrbzpjr0;
            new WeakReference("oEXEChcd" + twevprmzz4a + eqylhue3a + tyslqqfphc2a + fnvwrbzpjr0a + busyuzlin1a + "oEXEChcd" + "" + "");
        }

        public void onActivityStarted(@NotNull Activity activity) {
            int twevprmzz4 = 14;
            long eqylhue3 = 13L;
            long tyslqqfphc2 = 63L;
            double busyuzlin1 = 60.60;
            short fnvwrbzpjr0 = 15;
            byte yedndqbsv1 = 74;
            double peopgvhjxk0 = 11.11;
            int panilowr1 = 17;
            byte fckclzrfun0 = 37;
            int kxtwdix3 = 48;
            boolean xszljsn2 = false;
            short umxvkafmiq1 = 100;
            long fqqksbggkp0 = 73L;
            HSlSioxv(fckclzrfun0, panilowr1);
            ABgbDgkH(fqqksbggkp0, umxvkafmiq1, xszljsn2, kxtwdix3);
            oEXEChcd(fnvwrbzpjr0, busyuzlin1, tyslqqfphc2, eqylhue3, twevprmzz4);
            iosrhcNA(peopgvhjxk0, yedndqbsv1);
            HSlSioxv(fckclzrfun0, panilowr1);
            ABgbDgkH(fqqksbggkp0, umxvkafmiq1, xszljsn2, kxtwdix3);
            ABgbDgkH(fqqksbggkp0, umxvkafmiq1, xszljsn2, kxtwdix3);
            HSlSioxv(fckclzrfun0, panilowr1);
            HSlSioxv(fckclzrfun0, panilowr1);
            SpeedManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void lYeZSVYX(int xzqlrhxne0, double lhbhtmrxt1) {
            double lhbhtmrxt1a = lhbhtmrxt1;
            int xzqlrhxne0a = xzqlrhxne0;
            new File("lYeZSVYX" + xzqlrhxne0a + lhbhtmrxt1a + "lYeZSVYX" + "" + "");
        }

        //垃圾方法
        private void IrMDiUvi(float pothdmk0, short egrsunwish1, byte xcqbywz2, int xmjxnkzbm3, byte jsiwroyx4) {
            byte jsiwroyx4a = jsiwroyx4;
            int xmjxnkzbm3a = xmjxnkzbm3;
            byte xcqbywz2a = xcqbywz2;
            short egrsunwish1a = egrsunwish1;
            float pothdmk0a = pothdmk0;
            new String("IrMDiUvi" + jsiwroyx4a + xcqbywz2a + pothdmk0a + egrsunwish1a + xmjxnkzbm3a + "IrMDiUvi" + "" + "");
        }

        //垃圾方法
        private void jnNQtnLz(boolean lkgfdtl0, byte blutmobgf1) {
            byte blutmobgf1a = blutmobgf1;
            boolean lkgfdtl0a = lkgfdtl0;
            new File("jnNQtnLz" + blutmobgf1a + lkgfdtl0a + "jnNQtnLz" + "" + "");
        }

        //垃圾方法
        private void kClLVQjU(boolean scqwdit0, long eegvuhhb1, float houyclcol2, byte lnwcsdwnna3, int szokexteu4) {
            int szokexteu4a = szokexteu4;
            byte lnwcsdwnna3a = lnwcsdwnna3;
            float houyclcol2a = houyclcol2;
            long eegvuhhb1a = eegvuhhb1;
            boolean scqwdit0a = scqwdit0;
            new WeakReference("kClLVQjU" + scqwdit0a + szokexteu4a + houyclcol2a + eegvuhhb1a + lnwcsdwnna3a + "kClLVQjU" + "" + "");
        }

        //垃圾方法
        private void IzGcZrPY(byte uzzxmsp0, short hadjezhdyw1, long jutrbhkjd2) {
            long jutrbhkjd2a = jutrbhkjd2;
            short hadjezhdyw1a = hadjezhdyw1;
            byte uzzxmsp0a = uzzxmsp0;
            new WeakReference("IzGcZrPY" + uzzxmsp0a + hadjezhdyw1a + jutrbhkjd2a + "IzGcZrPY" + "" + "");
        }

        //垃圾方法
        private void CANcjLZq(char bbsggdzon0, float tpqagpyb1) {
            float tpqagpyb1a = tpqagpyb1;
            char bbsggdzon0a = bbsggdzon0;
            new WeakReference("CANcjLZq" + bbsggdzon0a + tpqagpyb1a + "CANcjLZq" + "" + "");
        }

        //垃圾方法
        private void TKAnMLHl(boolean gijvrsb0, short erizgxt1, double pylvcfimoq2, byte sjsfdyqed3) {
            byte sjsfdyqed3a = sjsfdyqed3;
            double pylvcfimoq2a = pylvcfimoq2;
            short erizgxt1a = erizgxt1;
            boolean gijvrsb0a = gijvrsb0;
            new StringReader("TKAnMLHl" + gijvrsb0a + pylvcfimoq2a + sjsfdyqed3a + erizgxt1a + "TKAnMLHl" + "" + "");
        }

        //垃圾方法
        private void ESEozrIL(int unrebtzxd0, int soohfpsxcg1, long iyguooyhs2) {
            long iyguooyhs2a = iyguooyhs2;
            int soohfpsxcg1a = soohfpsxcg1;
            int unrebtzxd0a = unrebtzxd0;
            new StringReader("ESEozrIL" + soohfpsxcg1a + unrebtzxd0a + iyguooyhs2a + "ESEozrIL" + "" + "");
        }

        //垃圾方法
        private void BTwAfyhu(boolean szseoqsz0, short uuerqwr1, double wjxdzikwgf2) {
            double wjxdzikwgf2a = wjxdzikwgf2;
            short uuerqwr1a = uuerqwr1;
            boolean szseoqsz0a = szseoqsz0;
            new File("BTwAfyhu" + uuerqwr1a + wjxdzikwgf2a + szseoqsz0a + "BTwAfyhu" + "" + "");
        }

        //垃圾方法
        private void iaoTMYaS(double pacrzucrrc0) {
            double pacrzucrrc0a = pacrzucrrc0;
            new StringBuffer("iaoTMYaS" + pacrzucrrc0a + "iaoTMYaS" + "" + "");
        }

        //垃圾方法
        private void CjBzycRd(short trqafsx0, short jygjiujltz1, long ggtvqcnqqo2, byte kornifyo3) {
            byte kornifyo3a = kornifyo3;
            long ggtvqcnqqo2a = ggtvqcnqqo2;
            short jygjiujltz1a = jygjiujltz1;
            short trqafsx0a = trqafsx0;
            new StringReader("CjBzycRd" + kornifyo3a + trqafsx0a + ggtvqcnqqo2a + jygjiujltz1a + "CjBzycRd" + "" + "");
        }

        //垃圾方法
        private void WavgOvrd(int lfvfddww0, int gxokikxt1, char sshuvxgk2) {
            char sshuvxgk2a = sshuvxgk2;
            int gxokikxt1a = gxokikxt1;
            int lfvfddww0a = lfvfddww0;
            System.out.println("WavgOvrd" + gxokikxt1a + sshuvxgk2a + lfvfddww0a + "WavgOvrd" + "" + "");
        }

        //垃圾方法
        private void JVZoUbWi(char deeydpi0, int bgephtd1, double xuaoonhn2) {
            double xuaoonhn2a = xuaoonhn2;
            int bgephtd1a = bgephtd1;
            char deeydpi0a = deeydpi0;
            new StringReader("JVZoUbWi" + bgephtd1a + xuaoonhn2a + deeydpi0a + "JVZoUbWi" + "" + "");
        }

        //垃圾方法
        private void uyyixAJU(byte nluseii0, long rceizvdps1) {
            long rceizvdps1a = rceizvdps1;
            byte nluseii0a = nluseii0;
            Log.e("uyyixAJU", "uyyixAJU" + rceizvdps1a + nluseii0a + "uyyixAJU" + "" + "");
        }

        //垃圾方法
        private void xzaDsMAq(boolean hkjnowt0, long vrzqfsbtu1, double drxyaqfdh2) {
            double drxyaqfdh2a = drxyaqfdh2;
            long vrzqfsbtu1a = vrzqfsbtu1;
            boolean hkjnowt0a = hkjnowt0;
            new File("xzaDsMAq" + drxyaqfdh2a + hkjnowt0a + vrzqfsbtu1a + "xzaDsMAq" + "" + "");
        }

        //垃圾方法
        private void qSvCTAyA(boolean kzufjkyqo0) {
            boolean kzufjkyqo0a = kzufjkyqo0;
            new StringReader("qSvCTAyA" + kzufjkyqo0a + "qSvCTAyA" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            boolean kzufjkyqo0 = true;
            double drxyaqfdh2 = 41.41;
            long vrzqfsbtu1 = 81L;
            boolean hkjnowt0 = true;
            long rceizvdps1 = 14L;
            byte nluseii0 = 56;
            double xuaoonhn2 = 96.96;
            int bgephtd1 = 84;
            char deeydpi0 = 78;
            char sshuvxgk2 = 53;
            int gxokikxt1 = 48;
            int lfvfddww0 = 83;
            byte kornifyo3 = 51;
            long ggtvqcnqqo2 = 23L;
            short jygjiujltz1 = 33;
            short trqafsx0 = 93;
            double pacrzucrrc0 = 98.98;
            double wjxdzikwgf2 = 72.72;
            short uuerqwr1 = 46;
            boolean szseoqsz0 = false;
            long iyguooyhs2 = 18L;
            int soohfpsxcg1 = 42;
            int unrebtzxd0 = 92;
            byte sjsfdyqed3 = 38;
            double pylvcfimoq2 = 75.75;
            short erizgxt1 = 27;
            boolean gijvrsb0 = false;
            float tpqagpyb1 = 100.100f;
            char bbsggdzon0 = 2;
            long jutrbhkjd2 = 0L;
            short hadjezhdyw1 = 53;
            byte uzzxmsp0 = 29;
            int szokexteu4 = 98;
            byte lnwcsdwnna3 = 40;
            float houyclcol2 = 44.44f;
            long eegvuhhb1 = 22L;
            boolean scqwdit0 = true;
            byte blutmobgf1 = 19;
            boolean lkgfdtl0 = true;
            byte jsiwroyx4 = 85;
            int xmjxnkzbm3 = 83;
            byte xcqbywz2 = 53;
            short egrsunwish1 = 51;
            float pothdmk0 = 85.85f;
            double lhbhtmrxt1 = 86.86;
            int xzqlrhxne0 = 20;
            uyyixAJU(nluseii0, rceizvdps1);
            kClLVQjU(scqwdit0, eegvuhhb1, houyclcol2, lnwcsdwnna3, szokexteu4);
            iaoTMYaS(pacrzucrrc0);
            kClLVQjU(scqwdit0, eegvuhhb1, houyclcol2, lnwcsdwnna3, szokexteu4);
            WavgOvrd(lfvfddww0, gxokikxt1, sshuvxgk2);
            CANcjLZq(bbsggdzon0, tpqagpyb1);
            CjBzycRd(trqafsx0, jygjiujltz1, ggtvqcnqqo2, kornifyo3);
            TKAnMLHl(gijvrsb0, erizgxt1, pylvcfimoq2, sjsfdyqed3);
            IrMDiUvi(pothdmk0, egrsunwish1, xcqbywz2, xmjxnkzbm3, jsiwroyx4);
            IzGcZrPY(uzzxmsp0, hadjezhdyw1, jutrbhkjd2);
            SpeedSPUtils.putLong("lastActivityOnPause", 0L);
            kClLVQjU(scqwdit0, eegvuhhb1, houyclcol2, lnwcsdwnna3, szokexteu4);
            ESEozrIL(unrebtzxd0, soohfpsxcg1, iyguooyhs2);
            TKAnMLHl(gijvrsb0, erizgxt1, pylvcfimoq2, sjsfdyqed3);
            IzGcZrPY(uzzxmsp0, hadjezhdyw1, jutrbhkjd2);
            kClLVQjU(scqwdit0, eegvuhhb1, houyclcol2, lnwcsdwnna3, szokexteu4);
            JVZoUbWi(deeydpi0, bgephtd1, xuaoonhn2);
            lYeZSVYX(xzqlrhxne0, lhbhtmrxt1);
            SpeedManager.INSTANCE.setCurrentActivity(activity);
            SpeedManager.creatingActivities.remove(activity);
            SpeedManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void DrlUIiDD(boolean nwqpkufvbl0, boolean srjxvjk1, float zcksqoi2) {
            float zcksqoi2a = zcksqoi2;
            boolean srjxvjk1a = srjxvjk1;
            boolean nwqpkufvbl0a = nwqpkufvbl0;
            TextUtils.isEmpty("DrlUIiDD" + zcksqoi2a + nwqpkufvbl0a + srjxvjk1a + "DrlUIiDD" + "" + "");
        }

        //垃圾方法
        private void bTUnLZUz(short nsxwfimyi0, short okkvogbs1, long pjleoneygf2, char lzzcjzp3, char xqvrebezl4) {
            char xqvrebezl4a = xqvrebezl4;
            char lzzcjzp3a = lzzcjzp3;
            long pjleoneygf2a = pjleoneygf2;
            short okkvogbs1a = okkvogbs1;
            short nsxwfimyi0a = nsxwfimyi0;
            new StringBuffer("bTUnLZUz" + xqvrebezl4a + pjleoneygf2a + okkvogbs1a + nsxwfimyi0a + lzzcjzp3a + "bTUnLZUz" + "" + "");
        }

        //垃圾方法
        private void PYxiqfyA(int hbkynbfmc0, double axnivxq1) {
            double axnivxq1a = axnivxq1;
            int hbkynbfmc0a = hbkynbfmc0;
        }

        //垃圾方法
        private void QPkhOrgc(short pexrfip0, int qjwuuzsput1, int ajxcnhew2) {
            int ajxcnhew2a = ajxcnhew2;
            int qjwuuzsput1a = qjwuuzsput1;
            short pexrfip0a = pexrfip0;
            Log.w("QPkhOrgc", "QPkhOrgc" + qjwuuzsput1a + ajxcnhew2a + pexrfip0a + "QPkhOrgc" + "" + "");
        }

        //垃圾方法
        private void Gjbrhcbv(char atzkknb0, char ktwtwjsnvk1, boolean ifnxgoim2, long hcumusev3, byte aotjwhr4) {
            byte aotjwhr4a = aotjwhr4;
            long hcumusev3a = hcumusev3;
            boolean ifnxgoim2a = ifnxgoim2;
            char ktwtwjsnvk1a = ktwtwjsnvk1;
            char atzkknb0a = atzkknb0;
            new Thread("Gjbrhcbv" + aotjwhr4a + ifnxgoim2a + atzkknb0a + ktwtwjsnvk1a + hcumusev3a + "Gjbrhcbv" + "" + "");
        }

        //垃圾方法
        private void fHnIaBvU(boolean kfndnujfer0, int lpynilw1) {
            int lpynilw1a = lpynilw1;
            boolean kfndnujfer0a = kfndnujfer0;
            Log.e("fHnIaBvU", "fHnIaBvU" + lpynilw1a + kfndnujfer0a + "fHnIaBvU" + "" + "");
        }

        //垃圾方法
        private void uftDJdyN(float fthhlxhhzm0, char jhtcpyej1, short qmqmsvjoln2, char heugftwb3, int njasyuxl4) {
            int njasyuxl4a = njasyuxl4;
            char heugftwb3a = heugftwb3;
            short qmqmsvjoln2a = qmqmsvjoln2;
            char jhtcpyej1a = jhtcpyej1;
            float fthhlxhhzm0a = fthhlxhhzm0;
            System.out.println("uftDJdyN" + jhtcpyej1a + njasyuxl4a + heugftwb3a + fthhlxhhzm0a + qmqmsvjoln2a + "uftDJdyN" + "" + "");
        }

        //垃圾方法
        private void fJcrAWlT(int yekegzvlwg0, char pwyiepkbf1, short rbctdotx2, float alxjhtmc3) {
            float alxjhtmc3a = alxjhtmc3;
            short rbctdotx2a = rbctdotx2;
            char pwyiepkbf1a = pwyiepkbf1;
            int yekegzvlwg0a = yekegzvlwg0;
            new String("fJcrAWlT" + alxjhtmc3a + pwyiepkbf1a + yekegzvlwg0a + rbctdotx2a + "fJcrAWlT" + "" + "");
        }

        //垃圾方法
        private void tRnumqXa(byte utauiugi0) {
            byte utauiugi0a = utauiugi0;
            Log.w("tRnumqXa", "tRnumqXa" + utauiugi0a + "tRnumqXa" + "" + "");
        }

        //垃圾方法
        private void zQnorGll(byte rhsmttb0, int uyqhbgajps1, short jmeumsict2, boolean adcleis3) {
            boolean adcleis3a = adcleis3;
            short jmeumsict2a = jmeumsict2;
            int uyqhbgajps1a = uyqhbgajps1;
            byte rhsmttb0a = rhsmttb0;
            new StringBuffer("zQnorGll" + rhsmttb0a + jmeumsict2a + adcleis3a + uyqhbgajps1a + "zQnorGll" + "" + "");
        }

        //垃圾方法
        private void iqBONHBA(int arqgidg0, short tnnurxy1) {
            short tnnurxy1a = tnnurxy1;
            int arqgidg0a = arqgidg0;
            new Thread("iqBONHBA" + tnnurxy1a + arqgidg0a + "iqBONHBA" + "" + "");
        }

        //垃圾方法
        private void YneTAKoP(boolean dkgxkkrj0) {
            boolean dkgxkkrj0a = dkgxkkrj0;
            Log.i("YneTAKoP", "YneTAKoP" + dkgxkkrj0a + "YneTAKoP" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            boolean dkgxkkrj0 = true;
            short tnnurxy1 = 55;
            int arqgidg0 = 14;
            boolean adcleis3 = true;
            short jmeumsict2 = 6;
            int uyqhbgajps1 = 61;
            byte rhsmttb0 = 62;
            byte utauiugi0 = 60;
            float alxjhtmc3 = 94.94f;
            short rbctdotx2 = 91;
            char pwyiepkbf1 = 48;
            int yekegzvlwg0 = 72;
            int njasyuxl4 = 24;
            char heugftwb3 = 30;
            short qmqmsvjoln2 = 99;
            char jhtcpyej1 = 27;
            float fthhlxhhzm0 = 84.84f;
            int lpynilw1 = 44;
            boolean kfndnujfer0 = false;
            byte aotjwhr4 = 24;
            long hcumusev3 = 74L;
            boolean ifnxgoim2 = false;
            char ktwtwjsnvk1 = 17;
            char atzkknb0 = 50;
            int ajxcnhew2 = 50;
            int qjwuuzsput1 = 86;
            short pexrfip0 = 15;
            double axnivxq1 = 19.19;
            int hbkynbfmc0 = 33;
            char xqvrebezl4 = 24;
            char lzzcjzp3 = 96;
            long pjleoneygf2 = 37L;
            short okkvogbs1 = 99;
            short nsxwfimyi0 = 77;
            float zcksqoi2 = 87.87f;
            boolean srjxvjk1 = true;
            boolean nwqpkufvbl0 = true;
            tRnumqXa(utauiugi0);
            PYxiqfyA(hbkynbfmc0, axnivxq1);
            zQnorGll(rhsmttb0, uyqhbgajps1, jmeumsict2, adcleis3);
            SpeedManager.INSTANCE.setPaused(true);
            DrlUIiDD(nwqpkufvbl0, srjxvjk1, zcksqoi2);
            zQnorGll(rhsmttb0, uyqhbgajps1, jmeumsict2, adcleis3);
            Gjbrhcbv(atzkknb0, ktwtwjsnvk1, ifnxgoim2, hcumusev3, aotjwhr4);
            DrlUIiDD(nwqpkufvbl0, srjxvjk1, zcksqoi2);
            SpeedManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            SpeedManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void qpZomfeW(byte mletrwt0, long ocjjzllbvu1, boolean ocpubmsgbp2, int xfjdyepbuu3, float hkyjgepy4) {
            float hkyjgepy4a = hkyjgepy4;
            int xfjdyepbuu3a = xfjdyepbuu3;
            boolean ocpubmsgbp2a = ocpubmsgbp2;
            long ocjjzllbvu1a = ocjjzllbvu1;
            byte mletrwt0a = mletrwt0;
            Log.i("qpZomfeW", "qpZomfeW" + hkyjgepy4a + ocpubmsgbp2a + mletrwt0a + ocjjzllbvu1a + xfjdyepbuu3a + "qpZomfeW" + "" + "");
        }

        //垃圾方法
        private void iKKWPkZy(char eobyeami0, double xcjtuvovtk1) {
            double xcjtuvovtk1a = xcjtuvovtk1;
            char eobyeami0a = eobyeami0;
            new String("iKKWPkZy" + xcjtuvovtk1a + eobyeami0a + "iKKWPkZy" + "" + "");
        }

        //垃圾方法
        private void dIBEeJJY(float mvigqno0, char bwvhhijwv1) {
            char bwvhhijwv1a = bwvhhijwv1;
            float mvigqno0a = mvigqno0;
            new StringBuffer("dIBEeJJY" + mvigqno0a + bwvhhijwv1a + "dIBEeJJY" + "" + "");
        }

        //垃圾方法
        private void sbhoPzxR(long reofguxwf0, short tdycxey1, byte atwywdgs2) {
            byte atwywdgs2a = atwywdgs2;
            short tdycxey1a = tdycxey1;
            long reofguxwf0a = reofguxwf0;
            TextUtils.isEmpty("sbhoPzxR" + reofguxwf0a + atwywdgs2a + tdycxey1a + "sbhoPzxR" + "" + "");
        }

        //垃圾方法
        private void fnsCggoZ(byte kgalzxi0, long bfrjdxqsw1) {
            long bfrjdxqsw1a = bfrjdxqsw1;
            byte kgalzxi0a = kgalzxi0;
            new File("fnsCggoZ" + kgalzxi0a + bfrjdxqsw1a + "fnsCggoZ" + "" + "");
        }

        //垃圾方法
        private void ZvZsYmKZ(int mbvpwbw0, int atpvzajqep1, char ilzkvicu2) {
            char ilzkvicu2a = ilzkvicu2;
            int atpvzajqep1a = atpvzajqep1;
            int mbvpwbw0a = mbvpwbw0;
            new WeakReference("ZvZsYmKZ" + mbvpwbw0a + atpvzajqep1a + ilzkvicu2a + "ZvZsYmKZ" + "" + "");
        }

        //垃圾方法
        private void rvFjyUYx(boolean pwpzmqp0, byte wvdzniqrd1) {
            byte wvdzniqrd1a = wvdzniqrd1;
            boolean pwpzmqp0a = pwpzmqp0;
            Log.w("rvFjyUYx", "rvFjyUYx" + wvdzniqrd1a + pwpzmqp0a + "rvFjyUYx" + "" + "");
        }

        //垃圾方法
        private void zZMQGNsh(int inldyvk0, double nkwcbip1, boolean bighzqndt2) {
            boolean bighzqndt2a = bighzqndt2;
            double nkwcbip1a = nkwcbip1;
            int inldyvk0a = inldyvk0;
            Log.i("zZMQGNsh", "zZMQGNsh" + nkwcbip1a + inldyvk0a + bighzqndt2a + "zZMQGNsh" + "" + "");
        }

        public void onActivityStopped(@NotNull Activity activity) {
            boolean bighzqndt2 = true;
            double nkwcbip1 = 98.98;
            int inldyvk0 = 60;
            byte wvdzniqrd1 = 94;
            boolean pwpzmqp0 = false;
            char ilzkvicu2 = 26;
            int atpvzajqep1 = 56;
            int mbvpwbw0 = 51;
            long bfrjdxqsw1 = 74L;
            byte kgalzxi0 = 88;
            byte atwywdgs2 = 85;
            short tdycxey1 = 33;
            long reofguxwf0 = 25L;
            char bwvhhijwv1 = 98;
            float mvigqno0 = 30.30f;
            double xcjtuvovtk1 = 26.26;
            char eobyeami0 = 43;
            float hkyjgepy4 = 99.99f;
            int xfjdyepbuu3 = 29;
            boolean ocpubmsgbp2 = true;
            long ocjjzllbvu1 = 89L;
            byte mletrwt0 = 42;
            dIBEeJJY(mvigqno0, bwvhhijwv1);
            zZMQGNsh(inldyvk0, nkwcbip1, bighzqndt2);
            rvFjyUYx(pwpzmqp0, wvdzniqrd1);
            iKKWPkZy(eobyeami0, xcjtuvovtk1);
            iKKWPkZy(eobyeami0, xcjtuvovtk1);
            dIBEeJJY(mvigqno0, bwvhhijwv1);
            qpZomfeW(mletrwt0, ocjjzllbvu1, ocpubmsgbp2, xfjdyepbuu3, hkyjgepy4);
            rvFjyUYx(pwpzmqp0, wvdzniqrd1);
            ZvZsYmKZ(mbvpwbw0, atpvzajqep1, ilzkvicu2);
            SpeedManager.visibleActivities.remove(activity);
            dIBEeJJY(mvigqno0, bwvhhijwv1);
            sbhoPzxR(reofguxwf0, tdycxey1, atwywdgs2);
            qpZomfeW(mletrwt0, ocjjzllbvu1, ocpubmsgbp2, xfjdyepbuu3, hkyjgepy4);
            zZMQGNsh(inldyvk0, nkwcbip1, bighzqndt2);
            rvFjyUYx(pwpzmqp0, wvdzniqrd1);
            SpeedManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void PqufFXbW(short ykfdgqlzi0, float oxmhpowbaz1) {
            float oxmhpowbaz1a = oxmhpowbaz1;
            short ykfdgqlzi0a = ykfdgqlzi0;
            new String("PqufFXbW" + ykfdgqlzi0a + oxmhpowbaz1a + "PqufFXbW" + "" + "");
        }

        //垃圾方法
        private void wryfXuNa(long jlndidfm0) {
            long jlndidfm0a = jlndidfm0;
            new Thread("wryfXuNa" + jlndidfm0a + "wryfXuNa" + "" + "");
        }

        //垃圾方法
        private void JSBOpqQj(char uqadnxckn0, boolean kmgnskm1, boolean spfepuib2, long rgqgjsnaty3, boolean baroegk4) {
            boolean baroegk4a = baroegk4;
            long rgqgjsnaty3a = rgqgjsnaty3;
            boolean spfepuib2a = spfepuib2;
            boolean kmgnskm1a = kmgnskm1;
            char uqadnxckn0a = uqadnxckn0;
            new StringBuffer("JSBOpqQj" + baroegk4a + kmgnskm1a + uqadnxckn0a + spfepuib2a + rgqgjsnaty3a + "JSBOpqQj" + "" + "");
        }

        //垃圾方法
        private void qApIYHtU(char qjfhyth0, double qyvvijvxzh1, short jcoruobkkb2) {
            short jcoruobkkb2a = jcoruobkkb2;
            double qyvvijvxzh1a = qyvvijvxzh1;
            char qjfhyth0a = qjfhyth0;
            Log.e("qApIYHtU", "qApIYHtU" + qjfhyth0a + qyvvijvxzh1a + jcoruobkkb2a + "qApIYHtU" + "" + "");
        }

        //垃圾方法
        private void aRQzSMHe(short rshwbkwnw0, boolean ylbqwxjono1, double hvbughsdi2) {
            double hvbughsdi2a = hvbughsdi2;
            boolean ylbqwxjono1a = ylbqwxjono1;
            short rshwbkwnw0a = rshwbkwnw0;
            new String("aRQzSMHe" + ylbqwxjono1a + rshwbkwnw0a + hvbughsdi2a + "aRQzSMHe" + "" + "");
        }

        //垃圾方法
        private void BzHeznIX(char qydtvfpm0) {
            char qydtvfpm0a = qydtvfpm0;
            System.out.println("BzHeznIX" + qydtvfpm0a + "BzHeznIX" + "" + "");
        }

        //垃圾方法
        private void zKqmuffP(long dyqfygkdc0, double noyivmz1, long mssaojnbk2) {
            long mssaojnbk2a = mssaojnbk2;
            double noyivmz1a = noyivmz1;
            long dyqfygkdc0a = dyqfygkdc0;
            TextUtils.isEmpty("zKqmuffP" + dyqfygkdc0a + mssaojnbk2a + noyivmz1a + "zKqmuffP" + "" + "");
        }

        //垃圾方法
        private void LuxKzILX(byte szreyauyc0) {
            byte szreyauyc0a = szreyauyc0;
            new File("LuxKzILX" + szreyauyc0a + "LuxKzILX" + "" + "");
        }

        //垃圾方法
        private void eMamtjmU(char zjvgsfywg0) {
            char zjvgsfywg0a = zjvgsfywg0;
            new File("eMamtjmU" + zjvgsfywg0a + "eMamtjmU" + "" + "");
        }

        //垃圾方法
        private void xnhzxoot(boolean ghqbzhds0) {
            boolean ghqbzhds0a = ghqbzhds0;
            new String("xnhzxoot" + ghqbzhds0a + "xnhzxoot" + "" + "");
        }

        //垃圾方法
        private void HlqGhCjq(byte zvkeqlwpz0, int exzdyifcmh1, long mnqsqojnp2, char tkazmacy3) {
            char tkazmacy3a = tkazmacy3;
            long mnqsqojnp2a = mnqsqojnp2;
            int exzdyifcmh1a = exzdyifcmh1;
            byte zvkeqlwpz0a = zvkeqlwpz0;
            new StringBuilder("HlqGhCjq" + zvkeqlwpz0a + mnqsqojnp2a + exzdyifcmh1a + tkazmacy3a + "HlqGhCjq" + "" + "");
        }

        //垃圾方法
        private void JsONYkMx(long gsxwrwds0, byte fcbxojing1) {
            byte fcbxojing1a = fcbxojing1;
            long gsxwrwds0a = gsxwrwds0;
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            byte fcbxojing1 = 17;
            long gsxwrwds0 = 57L;
            char tkazmacy3 = 59;
            long mnqsqojnp2 = 9L;
            int exzdyifcmh1 = 33;
            byte zvkeqlwpz0 = 18;
            boolean ghqbzhds0 = false;
            char zjvgsfywg0 = 22;
            byte szreyauyc0 = 8;
            long mssaojnbk2 = 46L;
            double noyivmz1 = 87.87;
            long dyqfygkdc0 = 61L;
            char qydtvfpm0 = 86;
            double hvbughsdi2 = 67.67;
            boolean ylbqwxjono1 = false;
            short rshwbkwnw0 = 5;
            short jcoruobkkb2 = 31;
            double qyvvijvxzh1 = 31.31;
            char qjfhyth0 = 80;
            boolean baroegk4 = true;
            long rgqgjsnaty3 = 53L;
            boolean spfepuib2 = true;
            boolean kmgnskm1 = false;
            char uqadnxckn0 = 29;
            long jlndidfm0 = 55L;
            float oxmhpowbaz1 = 94.94f;
            short ykfdgqlzi0 = 57;
            zKqmuffP(dyqfygkdc0, noyivmz1, mssaojnbk2);
            LuxKzILX(szreyauyc0);
            qApIYHtU(qjfhyth0, qyvvijvxzh1, jcoruobkkb2);
            PqufFXbW(ykfdgqlzi0, oxmhpowbaz1);
            xnhzxoot(ghqbzhds0);
            BzHeznIX(qydtvfpm0);
            if (SpeedManager.INSTANCE.isCurrActivity(activity)) {
                SpeedManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            zKqmuffP(dyqfygkdc0, noyivmz1, mssaojnbk2);
            LuxKzILX(szreyauyc0);
            eMamtjmU(zjvgsfywg0);
            zKqmuffP(dyqfygkdc0, noyivmz1, mssaojnbk2);
            BzHeznIX(qydtvfpm0);
            BzHeznIX(qydtvfpm0);
            aRQzSMHe(rshwbkwnw0, ylbqwxjono1, hvbughsdi2);
            SpeedManager.creatingActivities.remove(activity);
            SpeedManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private float YnAXEqE = 20.20f;

    //垃圾变量
    private long QbkUcgQ = 12L;

    //垃圾变量
    private int vAogyEI = 57;

    //垃圾变量
    private char pyJDfeI = 49;

    //垃圾变量
    private long ibUGUIm = 100L;

    //垃圾变量
    private long rYgHsbK = 67L;

    //垃圾变量
    private long hnAzTiq = 87L;

    //垃圾变量
    private char wnvGYUs = 87;

    //垃圾变量
    private float FsUqGxz = 89.89f;

    //垃圾变量
    private double kMPEZAl = 39.39;

    //垃圾方法
    private void OevvOeJT(int egirkmyu0, float kvdqeqv1) {
        float kvdqeqv1a = kvdqeqv1;
        int egirkmyu0a = egirkmyu0;
        new Thread("OevvOeJT" + egirkmyu0a + kvdqeqv1a + "OevvOeJT" + FsUqGxz + hnAzTiq + IELZZtl + bAFLAio + YnAXEqE + wYGTgiu + YRPrSBs + ibUGUIm + hdAAYWM + yiWFJFn + kPVOvLA + ywCoxqc + bMRTqlj + wObBJAU + tVbCuFS + vAogyEI + rqHEEmJ + vmtoueY + "");
    }

    //垃圾方法
    private void zjAkWsBM(boolean znpvsvy0, boolean lxaczkawf1, long pbsrryw2, double jqfzmnopo3, float krcvjof4) {
        float krcvjof4a = krcvjof4;
        double jqfzmnopo3a = jqfzmnopo3;
        long pbsrryw2a = pbsrryw2;
        boolean lxaczkawf1a = lxaczkawf1;
        boolean znpvsvy0a = znpvsvy0;
        Log.w("zjAkWsBM", "zjAkWsBM" + pbsrryw2a + znpvsvy0a + lxaczkawf1a + jqfzmnopo3a + krcvjof4a + "zjAkWsBM" + rqHEEmJ + vAogyEI + ibUGUIm + vmtoueY + hnAzTiq + wYGTgiu + YRPrSBs + ywCoxqc + FsUqGxz + tVbCuFS + wObBJAU + hdAAYWM + kPVOvLA + IELZZtl + YnAXEqE + bAFLAio + bMRTqlj + yiWFJFn + "");
    }

    //垃圾方法
    private void SkVyErLY(byte coaqrczyit0, long swvxzdam1) {
        long swvxzdam1a = swvxzdam1;
        byte coaqrczyit0a = coaqrczyit0;
        new StringBuilder("SkVyErLY" + swvxzdam1a + coaqrczyit0a + "SkVyErLY" + bAFLAio + wObBJAU + vmtoueY + FsUqGxz + IELZZtl + tVbCuFS + wYGTgiu + vAogyEI + yiWFJFn + ibUGUIm + kPVOvLA + ywCoxqc + hdAAYWM + hnAzTiq + YnAXEqE + rqHEEmJ + YRPrSBs + bMRTqlj + "");
    }

    //垃圾方法
    private void oYWuYwBg(long fknrplzm0, int ojfzypxxtf1, boolean zkocgfx2) {
        boolean zkocgfx2a = zkocgfx2;
        int ojfzypxxtf1a = ojfzypxxtf1;
        long fknrplzm0a = fknrplzm0;
        TextUtils.isEmpty("oYWuYwBg" + fknrplzm0a + ojfzypxxtf1a + zkocgfx2a + "oYWuYwBg" + hdAAYWM + FsUqGxz + bAFLAio + wYGTgiu + vAogyEI + YRPrSBs + vmtoueY + bMRTqlj + hnAzTiq + ibUGUIm + rqHEEmJ + IELZZtl + wObBJAU + yiWFJFn + YnAXEqE + kPVOvLA + ywCoxqc + tVbCuFS + "");
    }

    //垃圾方法
    private void yeShlmbM(float zngdjbqiv0, boolean mkrzfsmfv1) {
        boolean mkrzfsmfv1a = mkrzfsmfv1;
        float zngdjbqiv0a = zngdjbqiv0;
        new String("yeShlmbM" + zngdjbqiv0a + mkrzfsmfv1a + "yeShlmbM" + hnAzTiq + wYGTgiu + bAFLAio + vAogyEI + ibUGUIm + vmtoueY + YRPrSBs + wObBJAU + rqHEEmJ + IELZZtl + tVbCuFS + hdAAYWM + kPVOvLA + ywCoxqc + FsUqGxz + yiWFJFn + bMRTqlj + YnAXEqE + "");
    }

    //垃圾方法
    private void fkLMarox(double esvhmsr0, int dvvxxbapd1, long ghpnhlqcxo2, float ballvgab3, short upulrogtn4) {
        short upulrogtn4a = upulrogtn4;
        float ballvgab3a = ballvgab3;
        long ghpnhlqcxo2a = ghpnhlqcxo2;
        int dvvxxbapd1a = dvvxxbapd1;
        double esvhmsr0a = esvhmsr0;
        new StringBuilder("fkLMarox" + upulrogtn4a + dvvxxbapd1a + ghpnhlqcxo2a + esvhmsr0a + ballvgab3a + "fkLMarox" + rqHEEmJ + YRPrSBs + ibUGUIm + hnAzTiq + kPVOvLA + IELZZtl + wObBJAU + ywCoxqc + YnAXEqE + hdAAYWM + bMRTqlj + bAFLAio + vAogyEI + yiWFJFn + tVbCuFS + FsUqGxz + wYGTgiu + vmtoueY + "");
    }

    //垃圾方法
    private void drbNyXUU(long lszmjtrz0, byte vstrkuak1, long zcbxgkt2) {
        long zcbxgkt2a = zcbxgkt2;
        byte vstrkuak1a = vstrkuak1;
        long lszmjtrz0a = lszmjtrz0;
        Log.w("drbNyXUU", "drbNyXUU" + vstrkuak1a + lszmjtrz0a + zcbxgkt2a + "drbNyXUU" + IELZZtl + ywCoxqc + bMRTqlj + wObBJAU + tVbCuFS + FsUqGxz + YRPrSBs + vmtoueY + wYGTgiu + hnAzTiq + bAFLAio + rqHEEmJ + yiWFJFn + kPVOvLA + hdAAYWM + YnAXEqE + vAogyEI + ibUGUIm + "");
    }

    //垃圾方法
    private void ZcIUwLId(int wbigrlibnd0) {
        int wbigrlibnd0a = wbigrlibnd0;
    }

    public boolean equals(Object obj) {
        int wbigrlibnd0 = 82;
        long zcbxgkt2 = 8L;
        byte vstrkuak1 = 73;
        long lszmjtrz0 = 100L;
        short upulrogtn4 = 8;
        float ballvgab3 = 47.47f;
        long ghpnhlqcxo2 = 34L;
        int dvvxxbapd1 = 90;
        double esvhmsr0 = 84.84;
        boolean mkrzfsmfv1 = true;
        float zngdjbqiv0 = 95.95f;
        boolean zkocgfx2 = false;
        int ojfzypxxtf1 = 81;
        long fknrplzm0 = 22L;
        long swvxzdam1 = 26L;
        byte coaqrczyit0 = 69;
        float krcvjof4 = 94.94f;
        double jqfzmnopo3 = 75.75;
        long pbsrryw2 = 88L;
        boolean lxaczkawf1 = false;
        boolean znpvsvy0 = true;
        float kvdqeqv1 = 94.94f;
        int egirkmyu0 = 79;
        Log.e("QbkUcgQ", "" + QbkUcgQ + kMPEZAl + pyJDfeI + rYgHsbK + wnvGYUs + "");
        oYWuYwBg(fknrplzm0, ojfzypxxtf1, zkocgfx2);
        ZcIUwLId(wbigrlibnd0);
        oYWuYwBg(fknrplzm0, ojfzypxxtf1, zkocgfx2);
        fkLMarox(esvhmsr0, dvvxxbapd1, ghpnhlqcxo2, ballvgab3, upulrogtn4);
        return super.equals(obj);
    }
}
