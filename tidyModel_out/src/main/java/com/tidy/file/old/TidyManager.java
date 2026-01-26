package com.tidy.file.old;

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
import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.tidy.file.old.use.TidyUsageDaysTracker;
import com.google.firebase.FirebaseApp;
import com.tidy.file.old.change.TidyChangeUtils;
import com.tidy.file.old.opdj.TidyClockManager;
import com.tidy.file.old.opdj.TidyJober;
import com.tidy.file.old.opdj.Tidy1Service;
import com.tidy.file.old.opdj.TidyUserUtils;
import com.tidy.file.old.opdj.msg.TidyMsgUploader;
import com.tidy.file.old.opdj.nt.TidyNtCountUtil;
import com.tidy.file.old.opdj.nt.TidyNtFgService;
import com.tidy.file.old.shownotificy.TidyNtSender;
import com.tidy.file.old.opdj.nt.TidyNtUtils;
import com.tidy.file.old.utils.TidySPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.tidy.file.old.opdj.TidyReceiveRegister;
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
public class TidyManager {

    //垃圾变量
    private byte KExGQjy = 28;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private int rdIrsFc = 31;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private float sJxRfKT = 51.51f;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private short LdYcfZI = 6;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private char XPYKqgx = 58;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private double jAGllnA = 72.72;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private double qJdECWn = 18.18;

    private static long pausedTime;

    //垃圾变量
    private int DYRdvJu = 49;

    private static boolean isPaused;

    //垃圾变量
    private int RzBmSld = 30;

    public static final TidyManager INSTANCE = new TidyManager();

    //垃圾变量
    private double UxqrFca = 52.52;

    public static String mainProcessName;

    //垃圾变量
    private boolean zQKbTdF = true;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private boolean LvWMFMP = true;

    public static int code = 10214;

    //垃圾变量
    private int NlQBAdy = 9;

    public static boolean isDebug = true;

    //垃圾方法
    static private void fglCaiJp(short zcixqlek0) {
        short zcixqlek0a = zcixqlek0;
        Log.e("fglCaiJp", "fglCaiJp" + zcixqlek0a + "fglCaiJp" + "");
    }

    //垃圾方法
    static private void LBXCjail(long hvcwlxpb0, double iagsjdah1, short usgpvjw2, char sdfqdwn3) {
        char sdfqdwn3a = sdfqdwn3;
        short usgpvjw2a = usgpvjw2;
        double iagsjdah1a = iagsjdah1;
        long hvcwlxpb0a = hvcwlxpb0;
    }

    //垃圾方法
    static private void PGSFUsWc(float pwlbrdp0, char gscqheycms1, int zdxlinvmgt2, boolean alndsqsfm3, int vjuogwza4) {
        int vjuogwza4a = vjuogwza4;
        boolean alndsqsfm3a = alndsqsfm3;
        int zdxlinvmgt2a = zdxlinvmgt2;
        char gscqheycms1a = gscqheycms1;
        float pwlbrdp0a = pwlbrdp0;
        new String("PGSFUsWc" + zdxlinvmgt2a + pwlbrdp0a + gscqheycms1a + vjuogwza4a + alndsqsfm3a + "PGSFUsWc" + "");
    }

    //垃圾方法
    static private void uBWHemip(short bmguocd0) {
        short bmguocd0a = bmguocd0;
        new StringBuffer("uBWHemip" + bmguocd0a + "uBWHemip" + "");
    }

    public static String getResString(int resId) {
        short bmguocd0 = 70;
        int vjuogwza4 = 49;
        boolean alndsqsfm3 = false;
        int zdxlinvmgt2 = 20;
        char gscqheycms1 = 32;
        float pwlbrdp0 = 18.18f;
        char sdfqdwn3 = 35;
        short usgpvjw2 = 31;
        double iagsjdah1 = 39.39;
        long hvcwlxpb0 = 98L;
        short zcixqlek0 = 47;
        return mContext.getString(resId);
    }

    //垃圾方法
    private void MnXklStD(int xhzgmanf0) {
        int xhzgmanf0a = xhzgmanf0;
        new WeakReference("MnXklStD" + xhzgmanf0a + "MnXklStD" + rmeWkyk + jAGllnA + zQKbTdF + NlQBAdy + rdIrsFc + EMpXZck + UxqrFca + sJxRfKT + LvWMFMP + VgZlEqG + qJdECWn + KExGQjy + DYRdvJu + XPYKqgx + LdYcfZI + RzBmSld + lGDhzLK + JbIeUNa + "");
    }

    //垃圾方法
    private void dsglPsqY(short nmqehlg0) {
        short nmqehlg0a = nmqehlg0;
        TextUtils.isEmpty("dsglPsqY" + nmqehlg0a + "dsglPsqY" + NlQBAdy + EMpXZck + zQKbTdF + sJxRfKT + DYRdvJu + VgZlEqG + rmeWkyk + KExGQjy + JbIeUNa + LvWMFMP + XPYKqgx + UxqrFca + lGDhzLK + qJdECWn + LdYcfZI + rdIrsFc + RzBmSld + jAGllnA + "");
    }

    //垃圾方法
    private void vKExmTGo(boolean ppklydvnq0, char aqxovnbr1) {
        char aqxovnbr1a = aqxovnbr1;
        boolean ppklydvnq0a = ppklydvnq0;
    }

    //垃圾方法
    private void pSofHkfp(boolean qvjzlyli0, int fxzcqbtc1, short bahimdkus2) {
        short bahimdkus2a = bahimdkus2;
        int fxzcqbtc1a = fxzcqbtc1;
        boolean qvjzlyli0a = qvjzlyli0;
        new AttributedString("pSofHkfp" + fxzcqbtc1a + bahimdkus2a + qvjzlyli0a + "pSofHkfp" + RzBmSld + JbIeUNa + NlQBAdy + DYRdvJu + KExGQjy + rdIrsFc + LvWMFMP + UxqrFca + EMpXZck + jAGllnA + lGDhzLK + sJxRfKT + qJdECWn + VgZlEqG + zQKbTdF + rmeWkyk + XPYKqgx + LdYcfZI + "");
    }

    @Nullable
    public final Context getContext() {
        short bahimdkus2 = 65;
        int fxzcqbtc1 = 4;
        boolean qvjzlyli0 = false;
        char aqxovnbr1 = 53;
        boolean ppklydvnq0 = true;
        short nmqehlg0 = 96;
        int xhzgmanf0 = 87;
        pSofHkfp(qvjzlyli0, fxzcqbtc1, bahimdkus2);
        dsglPsqY(nmqehlg0);
        MnXklStD(xhzgmanf0);
        pSofHkfp(qvjzlyli0, fxzcqbtc1, bahimdkus2);
        MnXklStD(xhzgmanf0);
        MnXklStD(xhzgmanf0);
        MnXklStD(xhzgmanf0);
        MnXklStD(xhzgmanf0);
        return mContext;
    }

    //垃圾方法
    private void uxcIekBw(boolean wbasslrlh0, double ymnenpa1) {
        double ymnenpa1a = ymnenpa1;
        boolean wbasslrlh0a = wbasslrlh0;
        new WeakReference("uxcIekBw" + ymnenpa1a + wbasslrlh0a + "uxcIekBw" + KExGQjy + sJxRfKT + NlQBAdy + JbIeUNa + rdIrsFc + jAGllnA + lGDhzLK + XPYKqgx + zQKbTdF + rmeWkyk + RzBmSld + LdYcfZI + EMpXZck + VgZlEqG + UxqrFca + DYRdvJu + LvWMFMP + qJdECWn + "");
    }

    //垃圾方法
    private void hwitYRxw(boolean zewqgejfb0, int acrcuhekl1, float iwdhhcz2) {
        float iwdhhcz2a = iwdhhcz2;
        int acrcuhekl1a = acrcuhekl1;
        boolean zewqgejfb0a = zewqgejfb0;
        new File("hwitYRxw" + zewqgejfb0a + iwdhhcz2a + acrcuhekl1a + "hwitYRxw" + rmeWkyk + UxqrFca + qJdECWn + VgZlEqG + sJxRfKT + KExGQjy + lGDhzLK + rdIrsFc + JbIeUNa + DYRdvJu + RzBmSld + LvWMFMP + zQKbTdF + XPYKqgx + EMpXZck + jAGllnA + LdYcfZI + NlQBAdy + "");
    }

    //垃圾方法
    private void lUnUTDhX(double oykecqiwij0, boolean cyywvdscfr1) {
        boolean cyywvdscfr1a = cyywvdscfr1;
        double oykecqiwij0a = oykecqiwij0;
        new String("lUnUTDhX" + oykecqiwij0a + cyywvdscfr1a + "lUnUTDhX" + zQKbTdF + EMpXZck + jAGllnA + VgZlEqG + rdIrsFc + qJdECWn + JbIeUNa + KExGQjy + lGDhzLK + RzBmSld + NlQBAdy + LdYcfZI + DYRdvJu + UxqrFca + sJxRfKT + LvWMFMP + rmeWkyk + XPYKqgx + "");
    }

    //垃圾方法
    private void buIacZkM(double hqzgxezeyj0, float vfxaryad1) {
        float vfxaryad1a = vfxaryad1;
        double hqzgxezeyj0a = hqzgxezeyj0;
        new StringReader("buIacZkM" + hqzgxezeyj0a + vfxaryad1a + "buIacZkM" + KExGQjy + JbIeUNa + sJxRfKT + EMpXZck + LdYcfZI + RzBmSld + lGDhzLK + qJdECWn + VgZlEqG + UxqrFca + zQKbTdF + rmeWkyk + LvWMFMP + DYRdvJu + rdIrsFc + jAGllnA + XPYKqgx + NlQBAdy + "");
    }

    @NotNull
    public final Handler getHandler() {
        float vfxaryad1 = 40.40f;
        double hqzgxezeyj0 = 75.75;
        boolean cyywvdscfr1 = false;
        double oykecqiwij0 = 18.18;
        float iwdhhcz2 = 14.14f;
        int acrcuhekl1 = 38;
        boolean zewqgejfb0 = false;
        double ymnenpa1 = 20.20;
        boolean wbasslrlh0 = true;
        buIacZkM(hqzgxezeyj0, vfxaryad1);
        lUnUTDhX(oykecqiwij0, cyywvdscfr1);
        buIacZkM(hqzgxezeyj0, vfxaryad1);
        lUnUTDhX(oykecqiwij0, cyywvdscfr1);
        buIacZkM(hqzgxezeyj0, vfxaryad1);
        hwitYRxw(zewqgejfb0, acrcuhekl1, iwdhhcz2);
        lUnUTDhX(oykecqiwij0, cyywvdscfr1);
        return handler;
    }

    //垃圾方法
    private void AirbnzFp(long xklegtyjya0, short boynrut1) {
        short boynrut1a = boynrut1;
        long xklegtyjya0a = xklegtyjya0;
        new WeakReference("AirbnzFp" + xklegtyjya0a + boynrut1a + "AirbnzFp" + EMpXZck + rmeWkyk + RzBmSld + KExGQjy + XPYKqgx + jAGllnA + JbIeUNa + LdYcfZI + lGDhzLK + VgZlEqG + LvWMFMP + DYRdvJu + NlQBAdy + sJxRfKT + zQKbTdF + UxqrFca + rdIrsFc + qJdECWn + "");
    }

    //垃圾方法
    private void KzAwYtlt(boolean enjcswy0) {
        boolean enjcswy0a = enjcswy0;
        new AttributedString("KzAwYtlt" + enjcswy0a + "KzAwYtlt" + KExGQjy + EMpXZck + qJdECWn + zQKbTdF + rmeWkyk + UxqrFca + LvWMFMP + NlQBAdy + RzBmSld + XPYKqgx + sJxRfKT + lGDhzLK + rdIrsFc + LdYcfZI + jAGllnA + DYRdvJu + JbIeUNa + VgZlEqG + "");
    }

    //垃圾方法
    private void pqInXkkN(double xcnkypf0) {
        double xcnkypf0a = xcnkypf0;
        new StringBuffer("pqInXkkN" + xcnkypf0a + "pqInXkkN" + rmeWkyk + UxqrFca + sJxRfKT + XPYKqgx + rdIrsFc + RzBmSld + NlQBAdy + VgZlEqG + zQKbTdF + LdYcfZI + DYRdvJu + jAGllnA + LvWMFMP + qJdECWn + EMpXZck + JbIeUNa + lGDhzLK + KExGQjy + "");
    }

    //垃圾方法
    private void xHzRoUyK(long vjwemrhs0, double edgtfwxap1, char fxaasqjji2, char wurhtwis3) {
        char wurhtwis3a = wurhtwis3;
        char fxaasqjji2a = fxaasqjji2;
        double edgtfwxap1a = edgtfwxap1;
        long vjwemrhs0a = vjwemrhs0;
        new String("xHzRoUyK" + wurhtwis3a + vjwemrhs0a + fxaasqjji2a + edgtfwxap1a + "xHzRoUyK" + zQKbTdF + EMpXZck + LvWMFMP + rmeWkyk + JbIeUNa + LdYcfZI + RzBmSld + NlQBAdy + rdIrsFc + sJxRfKT + jAGllnA + KExGQjy + DYRdvJu + UxqrFca + qJdECWn + lGDhzLK + VgZlEqG + XPYKqgx + "");
    }

    //垃圾方法
    private void IqUFPIfz(boolean gblxqrnde0) {
        boolean gblxqrnde0a = gblxqrnde0;
        System.out.println("IqUFPIfz" + gblxqrnde0a + "IqUFPIfz" + XPYKqgx + KExGQjy + lGDhzLK + LdYcfZI + sJxRfKT + rdIrsFc + VgZlEqG + jAGllnA + zQKbTdF + DYRdvJu + NlQBAdy + LvWMFMP + rmeWkyk + EMpXZck + UxqrFca + JbIeUNa + RzBmSld + qJdECWn + "");
    }

    //垃圾方法
    private void yEnCBDxz(long rpxodgw0, float qyipnjnydy1, float yzwqdasax2, long zxhkjtmycs3) {
        long zxhkjtmycs3a = zxhkjtmycs3;
        float yzwqdasax2a = yzwqdasax2;
        float qyipnjnydy1a = qyipnjnydy1;
        long rpxodgw0a = rpxodgw0;
        new WeakReference("yEnCBDxz" + qyipnjnydy1a + yzwqdasax2a + zxhkjtmycs3a + rpxodgw0a + "yEnCBDxz" + JbIeUNa + jAGllnA + VgZlEqG + UxqrFca + sJxRfKT + EMpXZck + qJdECWn + rmeWkyk + rdIrsFc + DYRdvJu + KExGQjy + lGDhzLK + XPYKqgx + LvWMFMP + RzBmSld + LdYcfZI + NlQBAdy + zQKbTdF + "");
    }

    //垃圾方法
    private void ycbxdTCN(short tecxayb0, boolean omjveummuo1) {
        boolean omjveummuo1a = omjveummuo1;
        short tecxayb0a = tecxayb0;
        Log.w("ycbxdTCN", "ycbxdTCN" + tecxayb0a + omjveummuo1a + "ycbxdTCN" + XPYKqgx + rmeWkyk + zQKbTdF + sJxRfKT + jAGllnA + lGDhzLK + EMpXZck + LdYcfZI + RzBmSld + qJdECWn + DYRdvJu + rdIrsFc + NlQBAdy + LvWMFMP + VgZlEqG + JbIeUNa + UxqrFca + KExGQjy + "");
    }

    //垃圾方法
    private void tTYThBPC(double qmigtlogt0, byte pnyqkzua1) {
        byte pnyqkzua1a = pnyqkzua1;
        double qmigtlogt0a = qmigtlogt0;
        new StringBuilder("tTYThBPC" + qmigtlogt0a + pnyqkzua1a + "tTYThBPC" + zQKbTdF + qJdECWn + EMpXZck + NlQBAdy + sJxRfKT + JbIeUNa + KExGQjy + UxqrFca + rdIrsFc + jAGllnA + VgZlEqG + lGDhzLK + DYRdvJu + LdYcfZI + RzBmSld + XPYKqgx + LvWMFMP + rmeWkyk + "");
    }

    public final void startNotifyService(boolean isFromActivity, String from) {
        byte pnyqkzua1 = 94;
        double qmigtlogt0 = 1.1;
        boolean omjveummuo1 = true;
        short tecxayb0 = 54;
        long zxhkjtmycs3 = 60L;
        float yzwqdasax2 = 100.100f;
        float qyipnjnydy1 = 64.64f;
        long rpxodgw0 = 1L;
        boolean gblxqrnde0 = false;
        char wurhtwis3 = 38;
        char fxaasqjji2 = 93;
        double edgtfwxap1 = 68.68;
        long vjwemrhs0 = 5L;
        double xcnkypf0 = 88.88;
        boolean enjcswy0 = false;
        short boynrut1 = 18;
        long xklegtyjya0 = 30L;
        AirbnzFp(xklegtyjya0, boynrut1);
        AirbnzFp(xklegtyjya0, boynrut1);
        yEnCBDxz(rpxodgw0, qyipnjnydy1, yzwqdasax2, zxhkjtmycs3);
        xHzRoUyK(vjwemrhs0, edgtfwxap1, fxaasqjji2, wurhtwis3);
        ycbxdTCN(tecxayb0, omjveummuo1);
        ycbxdTCN(tecxayb0, omjveummuo1);
        //闹钟服务中启动的前台服务
        if (isDebug) {
            AirbnzFp(xklegtyjya0, boynrut1);
            ycbxdTCN(tecxayb0, omjveummuo1);
            ycbxdTCN(tecxayb0, omjveummuo1);
            Log.e("xxx", "AAManager startNotifyService");
        }
        pqInXkkN(xcnkypf0);
        tTYThBPC(qmigtlogt0, pnyqkzua1);
        yEnCBDxz(rpxodgw0, qyipnjnydy1, yzwqdasax2, zxhkjtmycs3);
        xHzRoUyK(vjwemrhs0, edgtfwxap1, fxaasqjji2, wurhtwis3);
        pqInXkkN(xcnkypf0);
        if (TidyNtUtils.isNotificationEnabled()) {
            TidyNtFgService.startNotifyService(isFromActivity, from);
        }
    }

    //垃圾方法
    private void bmKTwWdM(int wryskptemy0, char repqoivq1, short sfpplmlmvj2) {
        short sfpplmlmvj2a = sfpplmlmvj2;
        char repqoivq1a = repqoivq1;
        int wryskptemy0a = wryskptemy0;
        Log.i("bmKTwWdM", "bmKTwWdM" + sfpplmlmvj2a + wryskptemy0a + repqoivq1a + "bmKTwWdM" + LdYcfZI + zQKbTdF + RzBmSld + NlQBAdy + lGDhzLK + jAGllnA + JbIeUNa + rmeWkyk + UxqrFca + VgZlEqG + EMpXZck + DYRdvJu + XPYKqgx + rdIrsFc + KExGQjy + qJdECWn + LvWMFMP + sJxRfKT + "");
    }

    //垃圾方法
    private void KqDNfMVq(int stkdfzjf0, boolean kxgqcaqce1, byte qtlcbmg2, byte nzltsvj3) {
        byte nzltsvj3a = nzltsvj3;
        byte qtlcbmg2a = qtlcbmg2;
        boolean kxgqcaqce1a = kxgqcaqce1;
        int stkdfzjf0a = stkdfzjf0;
        new String("KqDNfMVq" + kxgqcaqce1a + qtlcbmg2a + nzltsvj3a + stkdfzjf0a + "KqDNfMVq" + EMpXZck + rmeWkyk + zQKbTdF + LvWMFMP + sJxRfKT + lGDhzLK + XPYKqgx + LdYcfZI + DYRdvJu + RzBmSld + NlQBAdy + rdIrsFc + UxqrFca + qJdECWn + jAGllnA + JbIeUNa + VgZlEqG + KExGQjy + "");
    }

    //垃圾方法
    private void yoPtLSML(double atjjagp0, int fsyglsfdcl1, char vicuvdxrad2, byte ofrowrz3) {
        byte ofrowrz3a = ofrowrz3;
        char vicuvdxrad2a = vicuvdxrad2;
        int fsyglsfdcl1a = fsyglsfdcl1;
        double atjjagp0a = atjjagp0;
        new File("yoPtLSML" + fsyglsfdcl1a + atjjagp0a + ofrowrz3a + vicuvdxrad2a + "yoPtLSML" + RzBmSld + rmeWkyk + jAGllnA + UxqrFca + XPYKqgx + zQKbTdF + LdYcfZI + JbIeUNa + NlQBAdy + LvWMFMP + EMpXZck + qJdECWn + rdIrsFc + VgZlEqG + DYRdvJu + sJxRfKT + lGDhzLK + KExGQjy + "");
    }

    //垃圾方法
    private void ygvAYHOD(int tggdebzgi0) {
        int tggdebzgi0a = tggdebzgi0;
        new Intent("ygvAYHOD" + tggdebzgi0a + "ygvAYHOD" + RzBmSld + EMpXZck + LdYcfZI + rdIrsFc + JbIeUNa + zQKbTdF + VgZlEqG + rmeWkyk + qJdECWn + lGDhzLK + UxqrFca + sJxRfKT + NlQBAdy + LvWMFMP + XPYKqgx + KExGQjy + DYRdvJu + jAGllnA + "");
    }

    //垃圾方法
    private void GHklRodZ(double nglvups0, int fcbeoyw1, byte vmhupofwsb2) {
        byte vmhupofwsb2a = vmhupofwsb2;
        int fcbeoyw1a = fcbeoyw1;
        double nglvups0a = nglvups0;
        Log.i("GHklRodZ", "GHklRodZ" + vmhupofwsb2a + nglvups0a + fcbeoyw1a + "GHklRodZ" + EMpXZck + DYRdvJu + NlQBAdy + rdIrsFc + jAGllnA + KExGQjy + VgZlEqG + sJxRfKT + qJdECWn + zQKbTdF + LdYcfZI + lGDhzLK + UxqrFca + LvWMFMP + JbIeUNa + RzBmSld + XPYKqgx + rmeWkyk + "");
    }

    //垃圾方法
    private void MKpSpLno(byte tquspkbflw0, short xubdjfhut1, double lszsupzx2, float ncciprus3, boolean abpuvrmfle4) {
        boolean abpuvrmfle4a = abpuvrmfle4;
        float ncciprus3a = ncciprus3;
        double lszsupzx2a = lszsupzx2;
        short xubdjfhut1a = xubdjfhut1;
        byte tquspkbflw0a = tquspkbflw0;
        new WeakReference("MKpSpLno" + lszsupzx2a + abpuvrmfle4a + tquspkbflw0a + ncciprus3a + xubdjfhut1a + "MKpSpLno" + sJxRfKT + NlQBAdy + UxqrFca + JbIeUNa + jAGllnA + LvWMFMP + zQKbTdF + KExGQjy + DYRdvJu + VgZlEqG + LdYcfZI + qJdECWn + rdIrsFc + rmeWkyk + EMpXZck + RzBmSld + lGDhzLK + XPYKqgx + "");
    }

    //垃圾方法
    private void INDhcUSp(byte tbnszuyy0, float uuzhxdpp1, char hocuhcc2, byte umcmletsg3) {
        byte umcmletsg3a = umcmletsg3;
        char hocuhcc2a = hocuhcc2;
        float uuzhxdpp1a = uuzhxdpp1;
        byte tbnszuyy0a = tbnszuyy0;
        new StringBuffer("INDhcUSp" + tbnszuyy0a + uuzhxdpp1a + umcmletsg3a + hocuhcc2a + "INDhcUSp" + LdYcfZI + JbIeUNa + XPYKqgx + sJxRfKT + NlQBAdy + lGDhzLK + rdIrsFc + qJdECWn + VgZlEqG + KExGQjy + jAGllnA + RzBmSld + LvWMFMP + zQKbTdF + UxqrFca + DYRdvJu + EMpXZck + rmeWkyk + "");
    }

    //垃圾方法
    private void BFCCmdxl(long jwmwewtumd0, byte dwrluldmh1, double ekhmoamder2, float fgzikhbkxx3, float bjwqippfa4) {
        float bjwqippfa4a = bjwqippfa4;
        float fgzikhbkxx3a = fgzikhbkxx3;
        double ekhmoamder2a = ekhmoamder2;
        byte dwrluldmh1a = dwrluldmh1;
        long jwmwewtumd0a = jwmwewtumd0;
        Log.e("BFCCmdxl", "BFCCmdxl" + dwrluldmh1a + ekhmoamder2a + jwmwewtumd0a + bjwqippfa4a + fgzikhbkxx3a + "BFCCmdxl" + UxqrFca + LdYcfZI + NlQBAdy + EMpXZck + JbIeUNa + VgZlEqG + LvWMFMP + RzBmSld + rmeWkyk + rdIrsFc + qJdECWn + XPYKqgx + lGDhzLK + jAGllnA + zQKbTdF + DYRdvJu + sJxRfKT + KExGQjy + "");
    }

    public final void startTwoService() {
        float bjwqippfa4 = 53.53f;
        float fgzikhbkxx3 = 1.1f;
        double ekhmoamder2 = 62.62;
        byte dwrluldmh1 = 32;
        long jwmwewtumd0 = 85L;
        byte umcmletsg3 = 65;
        char hocuhcc2 = 26;
        float uuzhxdpp1 = 20.20f;
        byte tbnszuyy0 = 4;
        boolean abpuvrmfle4 = true;
        float ncciprus3 = 95.95f;
        double lszsupzx2 = 74.74;
        short xubdjfhut1 = 72;
        byte tquspkbflw0 = 27;
        byte vmhupofwsb2 = 32;
        int fcbeoyw1 = 27;
        double nglvups0 = 29.29;
        int tggdebzgi0 = 24;
        byte ofrowrz3 = 49;
        char vicuvdxrad2 = 83;
        int fsyglsfdcl1 = 29;
        double atjjagp0 = 47.47;
        byte nzltsvj3 = 21;
        byte qtlcbmg2 = 56;
        boolean kxgqcaqce1 = true;
        int stkdfzjf0 = 39;
        short sfpplmlmvj2 = 30;
        char repqoivq1 = 10;
        int wryskptemy0 = 34;
        if (isDebug) {
            yoPtLSML(atjjagp0, fsyglsfdcl1, vicuvdxrad2, ofrowrz3);
            ygvAYHOD(tggdebzgi0);
            KqDNfMVq(stkdfzjf0, kxgqcaqce1, qtlcbmg2, nzltsvj3);
            Log.e("xxx", "AAManager startTwoService");
        }
        Tidy1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void ZErOZbdR(char hkqyidjr0) {
        char hkqyidjr0a = hkqyidjr0;
        Log.w("ZErOZbdR", "ZErOZbdR" + hkqyidjr0a + "ZErOZbdR" + EMpXZck + lGDhzLK + VgZlEqG + KExGQjy + LdYcfZI + NlQBAdy + DYRdvJu + jAGllnA + rmeWkyk + qJdECWn + LvWMFMP + RzBmSld + sJxRfKT + zQKbTdF + XPYKqgx + rdIrsFc + UxqrFca + JbIeUNa + "");
    }

    //垃圾方法
    private void sNChAOus(float suzxqphr0, boolean sbzbigzkmb1, long phjctcrqmj2, boolean nabhkzicne3) {
        boolean nabhkzicne3a = nabhkzicne3;
        long phjctcrqmj2a = phjctcrqmj2;
        boolean sbzbigzkmb1a = sbzbigzkmb1;
        float suzxqphr0a = suzxqphr0;
        new Thread("sNChAOus" + sbzbigzkmb1a + phjctcrqmj2a + nabhkzicne3a + suzxqphr0a + "sNChAOus" + JbIeUNa + XPYKqgx + DYRdvJu + jAGllnA + VgZlEqG + lGDhzLK + RzBmSld + rmeWkyk + UxqrFca + zQKbTdF + rdIrsFc + NlQBAdy + LvWMFMP + qJdECWn + EMpXZck + sJxRfKT + KExGQjy + LdYcfZI + "");
    }

    //垃圾方法
    private void DIBghBuq(long tsjxjnsdj0, boolean xraesye1) {
        boolean xraesye1a = xraesye1;
        long tsjxjnsdj0a = tsjxjnsdj0;
    }

    //垃圾方法
    private void iSbIuawo(boolean vblwxqlgs0, boolean wdiwjbf1) {
        boolean wdiwjbf1a = wdiwjbf1;
        boolean vblwxqlgs0a = vblwxqlgs0;
        new StringBuilder("iSbIuawo" + wdiwjbf1a + vblwxqlgs0a + "iSbIuawo" + zQKbTdF + rdIrsFc + VgZlEqG + sJxRfKT + lGDhzLK + DYRdvJu + EMpXZck + XPYKqgx + rmeWkyk + LdYcfZI + NlQBAdy + qJdECWn + KExGQjy + RzBmSld + UxqrFca + JbIeUNa + LvWMFMP + jAGllnA + "");
    }

    public final long getPausedTime() {
        boolean wdiwjbf1 = true;
        boolean vblwxqlgs0 = true;
        boolean xraesye1 = true;
        long tsjxjnsdj0 = 28L;
        boolean nabhkzicne3 = false;
        long phjctcrqmj2 = 49L;
        boolean sbzbigzkmb1 = false;
        float suzxqphr0 = 87.87f;
        char hkqyidjr0 = 88;
        ZErOZbdR(hkqyidjr0);
        iSbIuawo(vblwxqlgs0, wdiwjbf1);
        sNChAOus(suzxqphr0, sbzbigzkmb1, phjctcrqmj2, nabhkzicne3);
        sNChAOus(suzxqphr0, sbzbigzkmb1, phjctcrqmj2, nabhkzicne3);
        iSbIuawo(vblwxqlgs0, wdiwjbf1);
        iSbIuawo(vblwxqlgs0, wdiwjbf1);
        ZErOZbdR(hkqyidjr0);
        return pausedTime;
    }

    //垃圾方法
    private void PExbXqVd(short gabnukegtg0) {
        short gabnukegtg0a = gabnukegtg0;
        System.out.println("PExbXqVd" + gabnukegtg0a + "PExbXqVd" + lGDhzLK + JbIeUNa + EMpXZck + jAGllnA + DYRdvJu + zQKbTdF + LdYcfZI + rmeWkyk + KExGQjy + UxqrFca + qJdECWn + LvWMFMP + XPYKqgx + VgZlEqG + NlQBAdy + sJxRfKT + rdIrsFc + RzBmSld + "");
    }

    //垃圾方法
    private void vMnysJpU(boolean xpqerbki0) {
        boolean xpqerbki0a = xpqerbki0;
        new Thread("vMnysJpU" + xpqerbki0a + "vMnysJpU" + UxqrFca + rdIrsFc + XPYKqgx + LvWMFMP + LdYcfZI + JbIeUNa + KExGQjy + DYRdvJu + sJxRfKT + jAGllnA + lGDhzLK + qJdECWn + NlQBAdy + rmeWkyk + VgZlEqG + zQKbTdF + RzBmSld + EMpXZck + "");
    }

    //垃圾方法
    private void peuRDmPN(double epdtrwh0, char bsoomcm1) {
        char bsoomcm1a = bsoomcm1;
        double epdtrwh0a = epdtrwh0;
        new String("peuRDmPN" + epdtrwh0a + bsoomcm1a + "peuRDmPN" + NlQBAdy + LvWMFMP + KExGQjy + RzBmSld + XPYKqgx + JbIeUNa + EMpXZck + DYRdvJu + VgZlEqG + rdIrsFc + jAGllnA + zQKbTdF + UxqrFca + lGDhzLK + sJxRfKT + qJdECWn + LdYcfZI + rmeWkyk + "");
    }

    //垃圾方法
    private void mXwtsVkt(byte jghkulzbn0) {
        byte jghkulzbn0a = jghkulzbn0;
        TextUtils.isDigitsOnly("mXwtsVkt" + jghkulzbn0a + "mXwtsVkt" + LdYcfZI + RzBmSld + rdIrsFc + DYRdvJu + XPYKqgx + LvWMFMP + rmeWkyk + UxqrFca + zQKbTdF + JbIeUNa + NlQBAdy + VgZlEqG + lGDhzLK + qJdECWn + sJxRfKT + KExGQjy + jAGllnA + EMpXZck + "");
    }

    public final void setPausedTime(long var1) {
        byte jghkulzbn0 = 29;
        char bsoomcm1 = 14;
        double epdtrwh0 = 15.15;
        boolean xpqerbki0 = false;
        short gabnukegtg0 = 75;
        vMnysJpU(xpqerbki0);
        vMnysJpU(xpqerbki0);
        PExbXqVd(gabnukegtg0);
        peuRDmPN(epdtrwh0, bsoomcm1);
        mXwtsVkt(jghkulzbn0);
        peuRDmPN(epdtrwh0, bsoomcm1);
        vMnysJpU(xpqerbki0);
        mXwtsVkt(jghkulzbn0);
        vMnysJpU(xpqerbki0);
        mXwtsVkt(jghkulzbn0);
        pausedTime = var1;
    }

    //垃圾方法
    private void ueCTRGuO(char bmtngfha0, double dwtqrsbx1, int qzrdefazlq2, double mdmzyhvqzp3, double errhexxr4) {
        double errhexxr4a = errhexxr4;
        double mdmzyhvqzp3a = mdmzyhvqzp3;
        int qzrdefazlq2a = qzrdefazlq2;
        double dwtqrsbx1a = dwtqrsbx1;
        char bmtngfha0a = bmtngfha0;
        TextUtils.isDigitsOnly("ueCTRGuO" + dwtqrsbx1a + qzrdefazlq2a + errhexxr4a + mdmzyhvqzp3a + bmtngfha0a + "ueCTRGuO" + UxqrFca + LdYcfZI + LvWMFMP + rdIrsFc + XPYKqgx + lGDhzLK + EMpXZck + VgZlEqG + RzBmSld + JbIeUNa + sJxRfKT + NlQBAdy + qJdECWn + KExGQjy + jAGllnA + zQKbTdF + DYRdvJu + rmeWkyk + "");
    }

    //垃圾方法
    private void TOnTAtRv(long wwmycir0, boolean mjinexkdpw1, boolean mqajrre2, long lvobuimpgi3) {
        long lvobuimpgi3a = lvobuimpgi3;
        boolean mqajrre2a = mqajrre2;
        boolean mjinexkdpw1a = mjinexkdpw1;
        long wwmycir0a = wwmycir0;
        new StringReader("TOnTAtRv" + lvobuimpgi3a + mqajrre2a + mjinexkdpw1a + wwmycir0a + "TOnTAtRv" + UxqrFca + RzBmSld + NlQBAdy + JbIeUNa + jAGllnA + zQKbTdF + EMpXZck + KExGQjy + sJxRfKT + DYRdvJu + VgZlEqG + lGDhzLK + qJdECWn + XPYKqgx + LvWMFMP + LdYcfZI + rdIrsFc + rmeWkyk + "");
    }

    //垃圾方法
    private void fgAjGWjh(byte zjbydada0, byte wgmxvjct1, double ssizvpd2, char skiqaxrr3) {
        char skiqaxrr3a = skiqaxrr3;
        double ssizvpd2a = ssizvpd2;
        byte wgmxvjct1a = wgmxvjct1;
        byte zjbydada0a = zjbydada0;
        new StringReader("fgAjGWjh" + wgmxvjct1a + ssizvpd2a + zjbydada0a + skiqaxrr3a + "fgAjGWjh" + qJdECWn + EMpXZck + jAGllnA + UxqrFca + rdIrsFc + zQKbTdF + JbIeUNa + lGDhzLK + DYRdvJu + LdYcfZI + sJxRfKT + XPYKqgx + KExGQjy + LvWMFMP + VgZlEqG + NlQBAdy + rmeWkyk + RzBmSld + "");
    }

    //垃圾方法
    private void BmLfiihn(short zbskhpzf0, int chgjaacxne1) {
        int chgjaacxne1a = chgjaacxne1;
        short zbskhpzf0a = zbskhpzf0;
        Log.e("BmLfiihn", "BmLfiihn" + zbskhpzf0a + chgjaacxne1a + "BmLfiihn" + rmeWkyk + qJdECWn + DYRdvJu + EMpXZck + zQKbTdF + VgZlEqG + RzBmSld + JbIeUNa + UxqrFca + LvWMFMP + NlQBAdy + KExGQjy + LdYcfZI + XPYKqgx + jAGllnA + rdIrsFc + sJxRfKT + lGDhzLK + "");
    }

    public final boolean isPaused() {
        int chgjaacxne1 = 57;
        short zbskhpzf0 = 41;
        char skiqaxrr3 = 58;
        double ssizvpd2 = 43.43;
        byte wgmxvjct1 = 14;
        byte zjbydada0 = 63;
        long lvobuimpgi3 = 39L;
        boolean mqajrre2 = false;
        boolean mjinexkdpw1 = true;
        long wwmycir0 = 72L;
        double errhexxr4 = 57.57;
        double mdmzyhvqzp3 = 100.100;
        int qzrdefazlq2 = 47;
        double dwtqrsbx1 = 15.15;
        char bmtngfha0 = 64;
        BmLfiihn(zbskhpzf0, chgjaacxne1);
        fgAjGWjh(zjbydada0, wgmxvjct1, ssizvpd2, skiqaxrr3);
        TOnTAtRv(wwmycir0, mjinexkdpw1, mqajrre2, lvobuimpgi3);
        ueCTRGuO(bmtngfha0, dwtqrsbx1, qzrdefazlq2, mdmzyhvqzp3, errhexxr4);
        return isPaused;
    }

    //垃圾方法
    private void LeOyELwt(int jubakcu0, float oioslgv1) {
        float oioslgv1a = oioslgv1;
        int jubakcu0a = jubakcu0;
        new Thread("LeOyELwt" + oioslgv1a + jubakcu0a + "LeOyELwt" + JbIeUNa + XPYKqgx + lGDhzLK + qJdECWn + EMpXZck + sJxRfKT + DYRdvJu + NlQBAdy + RzBmSld + VgZlEqG + zQKbTdF + LvWMFMP + UxqrFca + jAGllnA + rdIrsFc + rmeWkyk + LdYcfZI + KExGQjy + "");
    }

    //垃圾方法
    private void QSVIdyJd(long cwbugncm0, char lgbhqzln1) {
        char lgbhqzln1a = lgbhqzln1;
        long cwbugncm0a = cwbugncm0;
        new Intent("QSVIdyJd" + lgbhqzln1a + cwbugncm0a + "QSVIdyJd" + qJdECWn + UxqrFca + RzBmSld + NlQBAdy + sJxRfKT + JbIeUNa + LdYcfZI + rmeWkyk + KExGQjy + LvWMFMP + DYRdvJu + VgZlEqG + zQKbTdF + XPYKqgx + lGDhzLK + jAGllnA + rdIrsFc + EMpXZck + "");
    }

    //垃圾方法
    private void AlvOvdOG(float gqitxud0, short cgyedxfkt1, char dxhlicd2, char dbolosf3) {
        char dbolosf3a = dbolosf3;
        char dxhlicd2a = dxhlicd2;
        short cgyedxfkt1a = cgyedxfkt1;
        float gqitxud0a = gqitxud0;
        TextUtils.isEmpty("AlvOvdOG" + cgyedxfkt1a + gqitxud0a + dxhlicd2a + dbolosf3a + "AlvOvdOG" + UxqrFca + VgZlEqG + qJdECWn + LvWMFMP + sJxRfKT + LdYcfZI + JbIeUNa + XPYKqgx + rdIrsFc + EMpXZck + zQKbTdF + DYRdvJu + jAGllnA + NlQBAdy + KExGQjy + lGDhzLK + RzBmSld + rmeWkyk + "");
    }

    //垃圾方法
    private void hLwWquLw(short eypafte0, char xfsmrbmk1, byte qjsnxvjtar2, float jwgkcgvoqa3, int ksbmwza4) {
        int ksbmwza4a = ksbmwza4;
        float jwgkcgvoqa3a = jwgkcgvoqa3;
        byte qjsnxvjtar2a = qjsnxvjtar2;
        char xfsmrbmk1a = xfsmrbmk1;
        short eypafte0a = eypafte0;
        TextUtils.isEmpty("hLwWquLw" + ksbmwza4a + eypafte0a + qjsnxvjtar2a + xfsmrbmk1a + jwgkcgvoqa3a + "hLwWquLw" + sJxRfKT + jAGllnA + XPYKqgx + UxqrFca + JbIeUNa + EMpXZck + lGDhzLK + LvWMFMP + qJdECWn + zQKbTdF + RzBmSld + LdYcfZI + KExGQjy + VgZlEqG + rdIrsFc + NlQBAdy + rmeWkyk + DYRdvJu + "");
    }

    public final void setPaused(boolean var1) {
        int ksbmwza4 = 57;
        float jwgkcgvoqa3 = 11.11f;
        byte qjsnxvjtar2 = 18;
        char xfsmrbmk1 = 90;
        short eypafte0 = 43;
        char dbolosf3 = 56;
        char dxhlicd2 = 86;
        short cgyedxfkt1 = 19;
        float gqitxud0 = 56.56f;
        char lgbhqzln1 = 87;
        long cwbugncm0 = 24L;
        float oioslgv1 = 47.47f;
        int jubakcu0 = 54;
        AlvOvdOG(gqitxud0, cgyedxfkt1, dxhlicd2, dbolosf3);
        LeOyELwt(jubakcu0, oioslgv1);
        hLwWquLw(eypafte0, xfsmrbmk1, qjsnxvjtar2, jwgkcgvoqa3, ksbmwza4);
        isPaused = var1;
    }

    //垃圾方法
    static private void BLUieUyQ(double igvdiqwcnm0) {
        double igvdiqwcnm0a = igvdiqwcnm0;
        new StringBuilder("BLUieUyQ" + igvdiqwcnm0a + "BLUieUyQ" + "");
    }

    //垃圾方法
    static private void MguqsElX(double efldmfd0, char lhzgfewohu1, long bqiaopq2, int cgoyxvwh3) {
        int cgoyxvwh3a = cgoyxvwh3;
        long bqiaopq2a = bqiaopq2;
        char lhzgfewohu1a = lhzgfewohu1;
        double efldmfd0a = efldmfd0;
        new StringBuffer("MguqsElX" + efldmfd0a + lhzgfewohu1a + bqiaopq2a + cgoyxvwh3a + "MguqsElX" + "");
    }

    //垃圾方法
    static private void IEgGsDRg(long losndgqgb0, int krtpoex1, double sihecvvek2) {
        double sihecvvek2a = sihecvvek2;
        int krtpoex1a = krtpoex1;
        long losndgqgb0a = losndgqgb0;
        Log.w("IEgGsDRg", "IEgGsDRg" + sihecvvek2a + losndgqgb0a + krtpoex1a + "IEgGsDRg" + "");
    }

    //垃圾方法
    static private void ESQJuXbr(boolean igoedqup0) {
        boolean igoedqup0a = igoedqup0;
        new StringReader("ESQJuXbr" + igoedqup0a + "ESQJuXbr" + "");
    }

    public static String getString(int stringResId) {
        boolean igoedqup0 = false;
        double sihecvvek2 = 32.32;
        int krtpoex1 = 33;
        long losndgqgb0 = 90L;
        int cgoyxvwh3 = 73;
        long bqiaopq2 = 88L;
        char lhzgfewohu1 = 10;
        double efldmfd0 = 93.93;
        double igvdiqwcnm0 = 74.74;
        MguqsElX(efldmfd0, lhzgfewohu1, bqiaopq2, cgoyxvwh3);
        MguqsElX(efldmfd0, lhzgfewohu1, bqiaopq2, cgoyxvwh3);
        MguqsElX(efldmfd0, lhzgfewohu1, bqiaopq2, cgoyxvwh3);
        ESQJuXbr(igoedqup0);
        IEgGsDRg(losndgqgb0, krtpoex1, sihecvvek2);
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void lgzyOboN(short nqlxiwghfb0, byte mcqucey1, boolean rdchsmfvgp2) {
        boolean rdchsmfvgp2a = rdchsmfvgp2;
        byte mcqucey1a = mcqucey1;
        short nqlxiwghfb0a = nqlxiwghfb0;
        new StringBuilder("lgzyOboN" + nqlxiwghfb0a + rdchsmfvgp2a + mcqucey1a + "lgzyOboN" + "");
    }

    //垃圾方法
    static private void noczllJz(char tvnwtoonsc0, double tajmmcyz1, int stpjbqsp2) {
        int stpjbqsp2a = stpjbqsp2;
        double tajmmcyz1a = tajmmcyz1;
        char tvnwtoonsc0a = tvnwtoonsc0;
        System.out.println("noczllJz" + tvnwtoonsc0a + tajmmcyz1a + stpjbqsp2a + "noczllJz" + "");
    }

    //垃圾方法
    static private void AxTLgLyp(short unyoclom0, byte xwrxahnu1) {
        byte xwrxahnu1a = xwrxahnu1;
        short unyoclom0a = unyoclom0;
        new AttributedString("AxTLgLyp" + unyoclom0a + xwrxahnu1a + "AxTLgLyp" + "");
    }

    //垃圾方法
    static private void PWVrNGUm(byte rjbstxa0) {
        byte rjbstxa0a = rjbstxa0;
        Log.i("PWVrNGUm", "PWVrNGUm" + rjbstxa0a + "PWVrNGUm" + "");
    }

    //垃圾方法
    static private void kzdEcTyy(long ucdqxmqe0, boolean dhznugaj1, double xdrtibce2, char cdgvcar3) {
        char cdgvcar3a = cdgvcar3;
        double xdrtibce2a = xdrtibce2;
        boolean dhznugaj1a = dhznugaj1;
        long ucdqxmqe0a = ucdqxmqe0;
    }

    //垃圾方法
    static private void srJUbxPA(byte snevpmder0) {
        byte snevpmder0a = snevpmder0;
        new StringBuilder("srJUbxPA" + snevpmder0a + "srJUbxPA" + "");
    }

    //垃圾方法
    static private void pWhJwjRe(char wgrjuhnfav0, int ukroufzo1) {
        int ukroufzo1a = ukroufzo1;
        char wgrjuhnfav0a = wgrjuhnfav0;
        new File("pWhJwjRe" + wgrjuhnfav0a + ukroufzo1a + "pWhJwjRe" + "");
    }

    //垃圾方法
    static private void okBlwsdt(int mktrzgjai0, float llgfgfvvr1, char abbauom2, long ofbhioxw3) {
        long ofbhioxw3a = ofbhioxw3;
        char abbauom2a = abbauom2;
        float llgfgfvvr1a = llgfgfvvr1;
        int mktrzgjai0a = mktrzgjai0;
        TextUtils.isDigitsOnly("okBlwsdt" + ofbhioxw3a + abbauom2a + llgfgfvvr1a + mktrzgjai0a + "okBlwsdt" + "");
    }

    public static boolean isScreenOn() {
        long ofbhioxw3 = 3L;
        char abbauom2 = 81;
        float llgfgfvvr1 = 80.80f;
        int mktrzgjai0 = 75;
        int ukroufzo1 = 82;
        char wgrjuhnfav0 = 80;
        byte snevpmder0 = 10;
        char cdgvcar3 = 1;
        double xdrtibce2 = 58.58;
        boolean dhznugaj1 = true;
        long ucdqxmqe0 = 6L;
        byte rjbstxa0 = 66;
        byte xwrxahnu1 = 35;
        short unyoclom0 = 69;
        int stpjbqsp2 = 8;
        double tajmmcyz1 = 100.100;
        char tvnwtoonsc0 = 96;
        boolean rdchsmfvgp2 = true;
        byte mcqucey1 = 56;
        short nqlxiwghfb0 = 6;
        kzdEcTyy(ucdqxmqe0, dhznugaj1, xdrtibce2, cdgvcar3);
        srJUbxPA(snevpmder0);
        okBlwsdt(mktrzgjai0, llgfgfvvr1, abbauom2, ofbhioxw3);
        AxTLgLyp(unyoclom0, xwrxahnu1);
        srJUbxPA(snevpmder0);
        pWhJwjRe(wgrjuhnfav0, ukroufzo1);
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void xpSxIDIz(float mwgfujuvn0, short wlhbbhy1) {
        short wlhbbhy1a = wlhbbhy1;
        float mwgfujuvn0a = mwgfujuvn0;
        TextUtils.isDigitsOnly("xpSxIDIz" + wlhbbhy1a + mwgfujuvn0a + "xpSxIDIz" + "");
    }

    //垃圾方法
    static private void nBjjKZTR(int mfhjarbkrm0, byte gynmzmvc1, boolean ibvcioi2) {
        boolean ibvcioi2a = ibvcioi2;
        byte gynmzmvc1a = gynmzmvc1;
        int mfhjarbkrm0a = mfhjarbkrm0;
        new WeakReference("nBjjKZTR" + ibvcioi2a + gynmzmvc1a + mfhjarbkrm0a + "nBjjKZTR" + "");
    }

    //垃圾方法
    static private void iSQNaODI(byte nairraaqs0, int qinavajyx1, boolean jcwmfqem2, float tizcnnru3, int bpxfohnhj4) {
        int bpxfohnhj4a = bpxfohnhj4;
        float tizcnnru3a = tizcnnru3;
        boolean jcwmfqem2a = jcwmfqem2;
        int qinavajyx1a = qinavajyx1;
        byte nairraaqs0a = nairraaqs0;
        new WeakReference("iSQNaODI" + bpxfohnhj4a + qinavajyx1a + nairraaqs0a + tizcnnru3a + jcwmfqem2a + "iSQNaODI" + "");
    }

    //垃圾方法
    static private void luTYdPhs(int nfajthxfh0, short tsslfidhmg1, long udoykehaf2, int uqswedoqfk3) {
        int uqswedoqfk3a = uqswedoqfk3;
        long udoykehaf2a = udoykehaf2;
        short tsslfidhmg1a = tsslfidhmg1;
        int nfajthxfh0a = nfajthxfh0;
        new AttributedString("luTYdPhs" + nfajthxfh0a + udoykehaf2a + uqswedoqfk3a + tsslfidhmg1a + "luTYdPhs" + "");
    }

    //垃圾方法
    static private void NJrLZqJZ(char lynekcy0) {
        char lynekcy0a = lynekcy0;
        new AttributedString("NJrLZqJZ" + lynekcy0a + "NJrLZqJZ" + "");
    }

    //垃圾方法
    static private void GAfxAVEM(long rfmvrdoqz0, long btmiwdipbh1) {
        long btmiwdipbh1a = btmiwdipbh1;
        long rfmvrdoqz0a = rfmvrdoqz0;
        new StringBuilder("GAfxAVEM" + rfmvrdoqz0a + btmiwdipbh1a + "GAfxAVEM" + "");
    }

    //垃圾方法
    static private void WOufQUfd(int puduemhyf0) {
        int puduemhyf0a = puduemhyf0;
        Log.w("WOufQUfd", "WOufQUfd" + puduemhyf0a + "WOufQUfd" + "");
    }

    //垃圾方法
    static private void zJeKJDfa(short bimumdxi0, int msplujhyw1) {
        int msplujhyw1a = msplujhyw1;
        short bimumdxi0a = bimumdxi0;
        TextUtils.isDigitsOnly("zJeKJDfa" + bimumdxi0a + msplujhyw1a + "zJeKJDfa" + "");
    }

    public static boolean isScreenLockOpen() {
        int msplujhyw1 = 92;
        short bimumdxi0 = 81;
        int puduemhyf0 = 75;
        long btmiwdipbh1 = 41L;
        long rfmvrdoqz0 = 39L;
        char lynekcy0 = 96;
        int uqswedoqfk3 = 27;
        long udoykehaf2 = 65L;
        short tsslfidhmg1 = 57;
        int nfajthxfh0 = 98;
        int bpxfohnhj4 = 98;
        float tizcnnru3 = 73.73f;
        boolean jcwmfqem2 = false;
        int qinavajyx1 = 88;
        byte nairraaqs0 = 49;
        boolean ibvcioi2 = false;
        byte gynmzmvc1 = 24;
        int mfhjarbkrm0 = 75;
        short wlhbbhy1 = 1;
        float mwgfujuvn0 = 23.23f;
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void zxfZdqYo(double wnjnzwjfhk0, int mmklbbhpg1, double hiqkqcvvg2, byte pvmyoqags3, char yliujozld4) {
        char yliujozld4a = yliujozld4;
        byte pvmyoqags3a = pvmyoqags3;
        double hiqkqcvvg2a = hiqkqcvvg2;
        int mmklbbhpg1a = mmklbbhpg1;
        double wnjnzwjfhk0a = wnjnzwjfhk0;
        new StringBuilder("zxfZdqYo" + pvmyoqags3a + mmklbbhpg1a + yliujozld4a + hiqkqcvvg2a + wnjnzwjfhk0a + "zxfZdqYo" + "");
    }

    //垃圾方法
    static private void vOCmjLDy(char sdskqmoneg0) {
        char sdskqmoneg0a = sdskqmoneg0;
    }

    //垃圾方法
    static private void TjtEMvkG(byte bedcndcon0, char fmkumml1) {
        char fmkumml1a = fmkumml1;
        byte bedcndcon0a = bedcndcon0;
        new Thread("TjtEMvkG" + bedcndcon0a + fmkumml1a + "TjtEMvkG" + "");
    }

    //垃圾方法
    static private void UTOVCqTl(int bedeaaeyj0) {
        int bedeaaeyj0a = bedeaaeyj0;
        Log.i("UTOVCqTl", "UTOVCqTl" + bedeaaeyj0a + "UTOVCqTl" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        int bedeaaeyj0 = 7;
        char fmkumml1 = 32;
        byte bedcndcon0 = 4;
        char sdskqmoneg0 = 89;
        char yliujozld4 = 52;
        byte pvmyoqags3 = 74;
        double hiqkqcvvg2 = 5.5;
        int mmklbbhpg1 = 55;
        double wnjnzwjfhk0 = 10.10;
        vOCmjLDy(sdskqmoneg0);
        UTOVCqTl(bedeaaeyj0);
        UTOVCqTl(bedeaaeyj0);
        TjtEMvkG(bedcndcon0, fmkumml1);
        TjtEMvkG(bedcndcon0, fmkumml1);
        zxfZdqYo(wnjnzwjfhk0, mmklbbhpg1, hiqkqcvvg2, pvmyoqags3, yliujozld4);
        UTOVCqTl(bedeaaeyj0);
        TjtEMvkG(bedcndcon0, fmkumml1);
        TjtEMvkG(bedcndcon0, fmkumml1);
        vOCmjLDy(sdskqmoneg0);
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void jtBUYInZ(long hkbqvdjj0, short qnqauznpce1) {
        short qnqauznpce1a = qnqauznpce1;
        long hkbqvdjj0a = hkbqvdjj0;
        Log.w("jtBUYInZ", "jtBUYInZ" + qnqauznpce1a + hkbqvdjj0a + "jtBUYInZ" + UxqrFca + VgZlEqG + rdIrsFc + DYRdvJu + lGDhzLK + zQKbTdF + RzBmSld + rmeWkyk + XPYKqgx + qJdECWn + KExGQjy + jAGllnA + LvWMFMP + LdYcfZI + JbIeUNa + NlQBAdy + sJxRfKT + EMpXZck + "");
    }

    //垃圾方法
    private void meRIGFKx(float huxpvzg0, char abhatip1, long pmcisjeh2, double xgvvqdrobj3, byte xwecygigz4) {
        byte xwecygigz4a = xwecygigz4;
        double xgvvqdrobj3a = xgvvqdrobj3;
        long pmcisjeh2a = pmcisjeh2;
        char abhatip1a = abhatip1;
        float huxpvzg0a = huxpvzg0;
        new StringReader("meRIGFKx" + xwecygigz4a + pmcisjeh2a + xgvvqdrobj3a + huxpvzg0a + abhatip1a + "meRIGFKx" + LdYcfZI + UxqrFca + zQKbTdF + VgZlEqG + qJdECWn + EMpXZck + rmeWkyk + lGDhzLK + KExGQjy + DYRdvJu + rdIrsFc + sJxRfKT + LvWMFMP + XPYKqgx + RzBmSld + JbIeUNa + NlQBAdy + jAGllnA + "");
    }

    //垃圾方法
    private void BVNpfIYm(int yunswff0, double yqufcqi1, long pibrmlnyua2, boolean eunttdhhdc3) {
        boolean eunttdhhdc3a = eunttdhhdc3;
        long pibrmlnyua2a = pibrmlnyua2;
        double yqufcqi1a = yqufcqi1;
        int yunswff0a = yunswff0;
        TextUtils.isEmpty("BVNpfIYm" + pibrmlnyua2a + yunswff0a + eunttdhhdc3a + yqufcqi1a + "BVNpfIYm" + XPYKqgx + RzBmSld + JbIeUNa + zQKbTdF + rdIrsFc + qJdECWn + rmeWkyk + LdYcfZI + EMpXZck + jAGllnA + sJxRfKT + NlQBAdy + VgZlEqG + lGDhzLK + KExGQjy + LvWMFMP + UxqrFca + DYRdvJu + "");
    }

    //垃圾方法
    private void mDUbmBoF(boolean ktmnwomjno0, byte hrbahdmm1, short ptwiwanzo2, char ugjvpxtqym3, short tejtvblhwa4) {
        short tejtvblhwa4a = tejtvblhwa4;
        char ugjvpxtqym3a = ugjvpxtqym3;
        short ptwiwanzo2a = ptwiwanzo2;
        byte hrbahdmm1a = hrbahdmm1;
        boolean ktmnwomjno0a = ktmnwomjno0;
        TextUtils.isEmpty("mDUbmBoF" + tejtvblhwa4a + ptwiwanzo2a + ugjvpxtqym3a + hrbahdmm1a + ktmnwomjno0a + "mDUbmBoF" + LvWMFMP + DYRdvJu + KExGQjy + rdIrsFc + RzBmSld + jAGllnA + qJdECWn + lGDhzLK + zQKbTdF + VgZlEqG + NlQBAdy + EMpXZck + XPYKqgx + rmeWkyk + LdYcfZI + sJxRfKT + UxqrFca + JbIeUNa + "");
    }

    //垃圾方法
    private void GqkuuHLn(float bvrxqjmtt0, long qaexcrkoe1, char hfkjsyg2, byte ddxrlgjiut3) {
        byte ddxrlgjiut3a = ddxrlgjiut3;
        char hfkjsyg2a = hfkjsyg2;
        long qaexcrkoe1a = qaexcrkoe1;
        float bvrxqjmtt0a = bvrxqjmtt0;
        Log.i("GqkuuHLn", "GqkuuHLn" + qaexcrkoe1a + bvrxqjmtt0a + hfkjsyg2a + ddxrlgjiut3a + "GqkuuHLn" + DYRdvJu + zQKbTdF + JbIeUNa + LvWMFMP + rmeWkyk + rdIrsFc + jAGllnA + lGDhzLK + EMpXZck + qJdECWn + NlQBAdy + LdYcfZI + UxqrFca + VgZlEqG + KExGQjy + sJxRfKT + RzBmSld + XPYKqgx + "");
    }

    //垃圾方法
    private void jZSgOJoq(int wmcmqsmljr0, boolean croblnlqxq1, float eobjcyvz2, byte kgmneku3, char tlzkyezqb4) {
        char tlzkyezqb4a = tlzkyezqb4;
        byte kgmneku3a = kgmneku3;
        float eobjcyvz2a = eobjcyvz2;
        boolean croblnlqxq1a = croblnlqxq1;
        int wmcmqsmljr0a = wmcmqsmljr0;
        new StringReader("jZSgOJoq" + wmcmqsmljr0a + croblnlqxq1a + tlzkyezqb4a + kgmneku3a + eobjcyvz2a + "jZSgOJoq" + DYRdvJu + EMpXZck + jAGllnA + zQKbTdF + UxqrFca + NlQBAdy + lGDhzLK + rdIrsFc + LdYcfZI + sJxRfKT + KExGQjy + JbIeUNa + XPYKqgx + rmeWkyk + VgZlEqG + LvWMFMP + qJdECWn + RzBmSld + "");
    }

    //垃圾方法
    private void MUQFoiDI(char svushkvrf0, double syngotoq1, long xwvopqdj2) {
        long xwvopqdj2a = xwvopqdj2;
        double syngotoq1a = syngotoq1;
        char svushkvrf0a = svushkvrf0;
        Log.i("MUQFoiDI", "MUQFoiDI" + xwvopqdj2a + syngotoq1a + svushkvrf0a + "MUQFoiDI" + RzBmSld + qJdECWn + XPYKqgx + sJxRfKT + LdYcfZI + JbIeUNa + EMpXZck + NlQBAdy + zQKbTdF + lGDhzLK + rdIrsFc + jAGllnA + UxqrFca + VgZlEqG + KExGQjy + DYRdvJu + rmeWkyk + LvWMFMP + "");
    }

    //垃圾方法
    private void BNfSFskH(char qwpqnkusy0, char xjtjtcs1, boolean muucokd2) {
        boolean muucokd2a = muucokd2;
        char xjtjtcs1a = xjtjtcs1;
        char qwpqnkusy0a = qwpqnkusy0;
        new Intent("BNfSFskH" + qwpqnkusy0a + muucokd2a + xjtjtcs1a + "BNfSFskH" + lGDhzLK + rmeWkyk + NlQBAdy + UxqrFca + JbIeUNa + VgZlEqG + XPYKqgx + zQKbTdF + jAGllnA + rdIrsFc + DYRdvJu + LdYcfZI + sJxRfKT + LvWMFMP + EMpXZck + KExGQjy + qJdECWn + RzBmSld + "");
    }

    //垃圾方法
    private void DgyhJBdy(byte mkqzycc0, char htucrqstlf1, boolean doxqvpgaee2) {
        boolean doxqvpgaee2a = doxqvpgaee2;
        char htucrqstlf1a = htucrqstlf1;
        byte mkqzycc0a = mkqzycc0;
        new StringBuffer("DgyhJBdy" + doxqvpgaee2a + mkqzycc0a + htucrqstlf1a + "DgyhJBdy" + sJxRfKT + rdIrsFc + NlQBAdy + UxqrFca + LdYcfZI + JbIeUNa + DYRdvJu + lGDhzLK + zQKbTdF + RzBmSld + rmeWkyk + qJdECWn + EMpXZck + VgZlEqG + LvWMFMP + KExGQjy + jAGllnA + XPYKqgx + "");
    }

    //垃圾方法
    private void wbutwoCU(int zrluwqhgh0, char thgprfmjgq1, int cjlxccex2) {
        int cjlxccex2a = cjlxccex2;
        char thgprfmjgq1a = thgprfmjgq1;
        int zrluwqhgh0a = zrluwqhgh0;
        new String("wbutwoCU" + zrluwqhgh0a + cjlxccex2a + thgprfmjgq1a + "wbutwoCU" + NlQBAdy + sJxRfKT + XPYKqgx + jAGllnA + rdIrsFc + UxqrFca + DYRdvJu + rmeWkyk + LvWMFMP + qJdECWn + KExGQjy + zQKbTdF + LdYcfZI + lGDhzLK + VgZlEqG + JbIeUNa + EMpXZck + RzBmSld + "");
    }

    //垃圾方法
    private void ZbmBsCaH(boolean yrdfvoco0, boolean iwnrpqn1, char cmvpmsp2, long mnvcuvd3) {
        long mnvcuvd3a = mnvcuvd3;
        char cmvpmsp2a = cmvpmsp2;
        boolean iwnrpqn1a = iwnrpqn1;
        boolean yrdfvoco0a = yrdfvoco0;
        new WeakReference("ZbmBsCaH" + cmvpmsp2a + mnvcuvd3a + yrdfvoco0a + iwnrpqn1a + "ZbmBsCaH" + JbIeUNa + lGDhzLK + zQKbTdF + qJdECWn + VgZlEqG + DYRdvJu + EMpXZck + rdIrsFc + XPYKqgx + RzBmSld + rmeWkyk + sJxRfKT + LvWMFMP + UxqrFca + LdYcfZI + jAGllnA + KExGQjy + NlQBAdy + "");
    }

    //垃圾方法
    private void FatVIUhs(float lhekmsdj0) {
        float lhekmsdj0a = lhekmsdj0;
        new Intent("FatVIUhs" + lhekmsdj0a + "FatVIUhs" + UxqrFca + DYRdvJu + qJdECWn + LvWMFMP + jAGllnA + zQKbTdF + rdIrsFc + sJxRfKT + rmeWkyk + EMpXZck + KExGQjy + JbIeUNa + NlQBAdy + VgZlEqG + LdYcfZI + XPYKqgx + RzBmSld + lGDhzLK + "");
    }

    public void killAdActivityAndJump() {
        float lhekmsdj0 = 25.25f;
        long mnvcuvd3 = 32L;
        char cmvpmsp2 = 94;
        boolean iwnrpqn1 = true;
        boolean yrdfvoco0 = true;
        int cjlxccex2 = 65;
        char thgprfmjgq1 = 6;
        int zrluwqhgh0 = 31;
        boolean doxqvpgaee2 = false;
        char htucrqstlf1 = 33;
        byte mkqzycc0 = 83;
        boolean muucokd2 = true;
        char xjtjtcs1 = 2;
        char qwpqnkusy0 = 98;
        long xwvopqdj2 = 68L;
        double syngotoq1 = 29.29;
        char svushkvrf0 = 50;
        char tlzkyezqb4 = 38;
        byte kgmneku3 = 99;
        float eobjcyvz2 = 79.79f;
        boolean croblnlqxq1 = true;
        int wmcmqsmljr0 = 50;
        byte ddxrlgjiut3 = 59;
        char hfkjsyg2 = 46;
        long qaexcrkoe1 = 4L;
        float bvrxqjmtt0 = 20.20f;
        short tejtvblhwa4 = 11;
        char ugjvpxtqym3 = 15;
        short ptwiwanzo2 = 87;
        byte hrbahdmm1 = 46;
        boolean ktmnwomjno0 = true;
        boolean eunttdhhdc3 = true;
        long pibrmlnyua2 = 71L;
        double yqufcqi1 = 42.42;
        int yunswff0 = 88;
        byte xwecygigz4 = 53;
        double xgvvqdrobj3 = 84.84;
        long pmcisjeh2 = 11L;
        char abhatip1 = 31;
        float huxpvzg0 = 35.35f;
        short qnqauznpce1 = 90;
        long hkbqvdjj0 = 51L;
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        if (isValidActivity(currentActivity)) {
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void ImXkZTHo(byte qidbgzkmmj0, byte wwxoumxa1, long ipmsibelw2) {
        long ipmsibelw2a = ipmsibelw2;
        byte wwxoumxa1a = wwxoumxa1;
        byte qidbgzkmmj0a = qidbgzkmmj0;
        new String("ImXkZTHo" + qidbgzkmmj0a + ipmsibelw2a + wwxoumxa1a + "ImXkZTHo" + LvWMFMP + VgZlEqG + jAGllnA + JbIeUNa + NlQBAdy + EMpXZck + RzBmSld + DYRdvJu + XPYKqgx + lGDhzLK + sJxRfKT + rdIrsFc + UxqrFca + rmeWkyk + LdYcfZI + qJdECWn + zQKbTdF + KExGQjy + "");
    }

    //垃圾方法
    private void VrsHBrIt(int ufgerana0, double ygbeyvfq1) {
        double ygbeyvfq1a = ygbeyvfq1;
        int ufgerana0a = ufgerana0;
        new StringBuilder("VrsHBrIt" + ygbeyvfq1a + ufgerana0a + "VrsHBrIt" + LdYcfZI + DYRdvJu + LvWMFMP + UxqrFca + NlQBAdy + qJdECWn + VgZlEqG + JbIeUNa + lGDhzLK + XPYKqgx + KExGQjy + jAGllnA + zQKbTdF + RzBmSld + rdIrsFc + sJxRfKT + EMpXZck + rmeWkyk + "");
    }

    //垃圾方法
    private void owmGwrAL(boolean dmiygti0, double rmkxmjlyl1) {
        double rmkxmjlyl1a = rmkxmjlyl1;
        boolean dmiygti0a = dmiygti0;
        new StringBuffer("owmGwrAL" + dmiygti0a + rmkxmjlyl1a + "owmGwrAL" + XPYKqgx + sJxRfKT + jAGllnA + lGDhzLK + DYRdvJu + KExGQjy + LvWMFMP + rmeWkyk + UxqrFca + rdIrsFc + RzBmSld + EMpXZck + LdYcfZI + JbIeUNa + qJdECWn + VgZlEqG + zQKbTdF + NlQBAdy + "");
    }

    //垃圾方法
    private void JFENmVzi(double mtbkupcxi0, boolean asvfnjk1, byte szkcuxwgp2) {
        byte szkcuxwgp2a = szkcuxwgp2;
        boolean asvfnjk1a = asvfnjk1;
        double mtbkupcxi0a = mtbkupcxi0;
        new StringBuilder("JFENmVzi" + asvfnjk1a + mtbkupcxi0a + szkcuxwgp2a + "JFENmVzi" + RzBmSld + rmeWkyk + DYRdvJu + UxqrFca + LvWMFMP + NlQBAdy + zQKbTdF + rdIrsFc + jAGllnA + VgZlEqG + EMpXZck + lGDhzLK + sJxRfKT + qJdECWn + JbIeUNa + LdYcfZI + XPYKqgx + KExGQjy + "");
    }

    //垃圾方法
    private void zBnZRghL(float ravfodyqka0, double zmcdosdr1, long iwrpmky2, byte qjzshzjt3, boolean xmixlbpzin4) {
        boolean xmixlbpzin4a = xmixlbpzin4;
        byte qjzshzjt3a = qjzshzjt3;
        long iwrpmky2a = iwrpmky2;
        double zmcdosdr1a = zmcdosdr1;
        float ravfodyqka0a = ravfodyqka0;
        new File("zBnZRghL" + zmcdosdr1a + iwrpmky2a + ravfodyqka0a + qjzshzjt3a + xmixlbpzin4a + "zBnZRghL" + UxqrFca + sJxRfKT + lGDhzLK + EMpXZck + zQKbTdF + rdIrsFc + qJdECWn + RzBmSld + rmeWkyk + NlQBAdy + LdYcfZI + XPYKqgx + DYRdvJu + KExGQjy + jAGllnA + JbIeUNa + VgZlEqG + LvWMFMP + "");
    }

    //垃圾方法
    private void hooPYulu(long awxebftmix0, double ymwgdrkoiy1, char djrsynnwu2) {
        char djrsynnwu2a = djrsynnwu2;
        double ymwgdrkoiy1a = ymwgdrkoiy1;
        long awxebftmix0a = awxebftmix0;
        Log.e("hooPYulu", "hooPYulu" + djrsynnwu2a + ymwgdrkoiy1a + awxebftmix0a + "hooPYulu" + jAGllnA + JbIeUNa + UxqrFca + VgZlEqG + DYRdvJu + LvWMFMP + NlQBAdy + sJxRfKT + RzBmSld + rmeWkyk + rdIrsFc + qJdECWn + lGDhzLK + XPYKqgx + zQKbTdF + EMpXZck + KExGQjy + LdYcfZI + "");
    }

    //垃圾方法
    private void nXEVtBqW(short iwtsmza0, char hvkabvls1, long cvmzrwglh2, long tfvrqzdi3, double pkuidixai4) {
        double pkuidixai4a = pkuidixai4;
        long tfvrqzdi3a = tfvrqzdi3;
        long cvmzrwglh2a = cvmzrwglh2;
        char hvkabvls1a = hvkabvls1;
        short iwtsmza0a = iwtsmza0;
        new WeakReference("nXEVtBqW" + pkuidixai4a + tfvrqzdi3a + iwtsmza0a + hvkabvls1a + cvmzrwglh2a + "nXEVtBqW" + VgZlEqG + LvWMFMP + JbIeUNa + EMpXZck + UxqrFca + RzBmSld + rdIrsFc + KExGQjy + lGDhzLK + XPYKqgx + LdYcfZI + jAGllnA + zQKbTdF + DYRdvJu + qJdECWn + rmeWkyk + NlQBAdy + sJxRfKT + "");
    }

    //垃圾方法
    private void PMUmkCTc(float ksgoiogzhz0, boolean otpgnrchth1) {
        boolean otpgnrchth1a = otpgnrchth1;
        float ksgoiogzhz0a = ksgoiogzhz0;
        new StringBuilder("PMUmkCTc" + otpgnrchth1a + ksgoiogzhz0a + "PMUmkCTc" + lGDhzLK + RzBmSld + EMpXZck + LvWMFMP + UxqrFca + zQKbTdF + sJxRfKT + JbIeUNa + VgZlEqG + DYRdvJu + qJdECWn + NlQBAdy + KExGQjy + rdIrsFc + LdYcfZI + XPYKqgx + jAGllnA + rmeWkyk + "");
    }

    //垃圾方法
    private void EmKttXpt(byte lugelswv0, short qcsulqsl1) {
        short qcsulqsl1a = qcsulqsl1;
        byte lugelswv0a = lugelswv0;
        new File("EmKttXpt" + qcsulqsl1a + lugelswv0a + "EmKttXpt" + RzBmSld + VgZlEqG + jAGllnA + zQKbTdF + LvWMFMP + rdIrsFc + lGDhzLK + UxqrFca + KExGQjy + sJxRfKT + XPYKqgx + JbIeUNa + EMpXZck + qJdECWn + rmeWkyk + NlQBAdy + DYRdvJu + LdYcfZI + "");
    }

    //垃圾方法
    private void DknriquB(double imfchyis0, boolean okwfdmx1) {
        boolean okwfdmx1a = okwfdmx1;
        double imfchyis0a = imfchyis0;
        new AttributedString("DknriquB" + okwfdmx1a + imfchyis0a + "DknriquB" + sJxRfKT + LdYcfZI + rdIrsFc + XPYKqgx + rmeWkyk + JbIeUNa + zQKbTdF + EMpXZck + NlQBAdy + UxqrFca + KExGQjy + lGDhzLK + VgZlEqG + DYRdvJu + RzBmSld + LvWMFMP + qJdECWn + jAGllnA + "");
    }

    //垃圾方法
    private void MifuPFPi(byte iuaalzhmku0, long alfznyi1, long yqwhtupwx2) {
        long yqwhtupwx2a = yqwhtupwx2;
        long alfznyi1a = alfznyi1;
        byte iuaalzhmku0a = iuaalzhmku0;
        Log.e("MifuPFPi", "MifuPFPi" + yqwhtupwx2a + iuaalzhmku0a + alfznyi1a + "MifuPFPi" + VgZlEqG + KExGQjy + LdYcfZI + UxqrFca + RzBmSld + rmeWkyk + EMpXZck + lGDhzLK + sJxRfKT + JbIeUNa + qJdECWn + NlQBAdy + LvWMFMP + zQKbTdF + XPYKqgx + DYRdvJu + jAGllnA + rdIrsFc + "");
    }

    //垃圾方法
    private void SZKhaSOH(int fcuzamyn0, int vczchob1) {
        int vczchob1a = vczchob1;
        int fcuzamyn0a = fcuzamyn0;
        new File("SZKhaSOH" + fcuzamyn0a + vczchob1a + "SZKhaSOH" + sJxRfKT + lGDhzLK + zQKbTdF + qJdECWn + JbIeUNa + LvWMFMP + DYRdvJu + XPYKqgx + VgZlEqG + UxqrFca + rmeWkyk + rdIrsFc + EMpXZck + RzBmSld + NlQBAdy + jAGllnA + KExGQjy + LdYcfZI + "");
    }

    //垃圾方法
    private void amUSrdrA(char nnvjvhb0, byte kmuykagihh1) {
        byte kmuykagihh1a = kmuykagihh1;
        char nnvjvhb0a = nnvjvhb0;
        new Thread("amUSrdrA" + nnvjvhb0a + kmuykagihh1a + "amUSrdrA" + UxqrFca + NlQBAdy + XPYKqgx + rdIrsFc + KExGQjy + VgZlEqG + JbIeUNa + sJxRfKT + RzBmSld + LdYcfZI + EMpXZck + rmeWkyk + LvWMFMP + DYRdvJu + lGDhzLK + zQKbTdF + qJdECWn + jAGllnA + "");
    }

    //垃圾方法
    private void SuHshrBf(double rnonqbogin0, boolean ipoucucnqg1, byte ikhdtabf2, char bylfceerol3, byte geczxwm4) {
        byte geczxwm4a = geczxwm4;
        char bylfceerol3a = bylfceerol3;
        byte ikhdtabf2a = ikhdtabf2;
        boolean ipoucucnqg1a = ipoucucnqg1;
        double rnonqbogin0a = rnonqbogin0;
        System.out.println("SuHshrBf" + rnonqbogin0a + ikhdtabf2a + ipoucucnqg1a + bylfceerol3a + geczxwm4a + "SuHshrBf" + DYRdvJu + UxqrFca + KExGQjy + JbIeUNa + sJxRfKT + VgZlEqG + NlQBAdy + lGDhzLK + LdYcfZI + jAGllnA + EMpXZck + qJdECWn + LvWMFMP + RzBmSld + rmeWkyk + zQKbTdF + rdIrsFc + XPYKqgx + "");
    }

    //垃圾方法
    private void RBGioYvf(boolean fihzlvacac0) {
        boolean fihzlvacac0a = fihzlvacac0;
        new File("RBGioYvf" + fihzlvacac0a + "RBGioYvf" + lGDhzLK + rdIrsFc + UxqrFca + DYRdvJu + LdYcfZI + qJdECWn + RzBmSld + NlQBAdy + zQKbTdF + jAGllnA + rmeWkyk + KExGQjy + XPYKqgx + JbIeUNa + sJxRfKT + LvWMFMP + VgZlEqG + EMpXZck + "");
    }

    //垃圾方法
    private void FjvXhdil(char tocnrngxg0, long zomoqgezs1, short dgvpide2, long ftfizupe3) {
        long ftfizupe3a = ftfizupe3;
        short dgvpide2a = dgvpide2;
        long zomoqgezs1a = zomoqgezs1;
        char tocnrngxg0a = tocnrngxg0;
        new StringReader("FjvXhdil" + ftfizupe3a + zomoqgezs1a + dgvpide2a + tocnrngxg0a + "FjvXhdil" + rdIrsFc + lGDhzLK + LdYcfZI + DYRdvJu + RzBmSld + UxqrFca + EMpXZck + XPYKqgx + zQKbTdF + qJdECWn + LvWMFMP + KExGQjy + jAGllnA + NlQBAdy + sJxRfKT + VgZlEqG + rmeWkyk + JbIeUNa + "");
    }

    //垃圾方法
    private void iBthyRtn(long kzcnodx0, double myifechlwo1) {
        double myifechlwo1a = myifechlwo1;
        long kzcnodx0a = kzcnodx0;
        Log.i("iBthyRtn", "iBthyRtn" + kzcnodx0a + myifechlwo1a + "iBthyRtn" + EMpXZck + sJxRfKT + KExGQjy + LvWMFMP + rdIrsFc + XPYKqgx + DYRdvJu + zQKbTdF + qJdECWn + rmeWkyk + VgZlEqG + JbIeUNa + jAGllnA + lGDhzLK + UxqrFca + LdYcfZI + NlQBAdy + RzBmSld + "");
    }

    //垃圾方法
    private void jytSRALb(short rweplegxp0, int eqshhav1, boolean qtywlumccw2) {
        boolean qtywlumccw2a = qtywlumccw2;
        int eqshhav1a = eqshhav1;
        short rweplegxp0a = rweplegxp0;
        TextUtils.isDigitsOnly("jytSRALb" + qtywlumccw2a + eqshhav1a + rweplegxp0a + "jytSRALb" + DYRdvJu + XPYKqgx + LdYcfZI + jAGllnA + RzBmSld + UxqrFca + lGDhzLK + zQKbTdF + LvWMFMP + qJdECWn + EMpXZck + JbIeUNa + KExGQjy + rdIrsFc + sJxRfKT + rmeWkyk + NlQBAdy + VgZlEqG + "");
    }

    //垃圾方法
    private void lidOejUZ(float jyhdmbn0) {
        float jyhdmbn0a = jyhdmbn0;
        new WeakReference("lidOejUZ" + jyhdmbn0a + "lidOejUZ" + jAGllnA + RzBmSld + DYRdvJu + JbIeUNa + KExGQjy + UxqrFca + lGDhzLK + LdYcfZI + VgZlEqG + EMpXZck + XPYKqgx + rmeWkyk + NlQBAdy + zQKbTdF + rdIrsFc + qJdECWn + sJxRfKT + LvWMFMP + "");
    }

    //垃圾方法
    private void ecqGqCQa(long jeldvszwa0) {
        long jeldvszwa0a = jeldvszwa0;
        new File("ecqGqCQa" + jeldvszwa0a + "ecqGqCQa" + qJdECWn + lGDhzLK + jAGllnA + VgZlEqG + RzBmSld + DYRdvJu + UxqrFca + sJxRfKT + XPYKqgx + rdIrsFc + EMpXZck + KExGQjy + rmeWkyk + LdYcfZI + zQKbTdF + JbIeUNa + LvWMFMP + NlQBAdy + "");
    }

    //垃圾方法
    private void uXNHZnxs(char miracbuqr0, char pxyylfsvef1) {
        char pxyylfsvef1a = pxyylfsvef1;
        char miracbuqr0a = miracbuqr0;
        new Thread("uXNHZnxs" + pxyylfsvef1a + miracbuqr0a + "uXNHZnxs" + XPYKqgx + UxqrFca + rdIrsFc + qJdECWn + LvWMFMP + jAGllnA + KExGQjy + NlQBAdy + VgZlEqG + EMpXZck + DYRdvJu + RzBmSld + lGDhzLK + sJxRfKT + zQKbTdF + JbIeUNa + LdYcfZI + rmeWkyk + "");
    }

    //垃圾方法
    private void TffszaYz(double gezrmdoyx0, long zqrystxgk1) {
        long zqrystxgk1a = zqrystxgk1;
        double gezrmdoyx0a = gezrmdoyx0;
        new Intent("TffszaYz" + gezrmdoyx0a + zqrystxgk1a + "TffszaYz" + EMpXZck + UxqrFca + jAGllnA + qJdECWn + sJxRfKT + rmeWkyk + KExGQjy + zQKbTdF + RzBmSld + lGDhzLK + VgZlEqG + NlQBAdy + LvWMFMP + rdIrsFc + DYRdvJu + LdYcfZI + XPYKqgx + JbIeUNa + "");
    }

    //垃圾方法
    private void yxgQPuLi(float ibasnrbe0, byte shyccahcs1, int hivookmf2, int ouvjswcfrz3) {
        int ouvjswcfrz3a = ouvjswcfrz3;
        int hivookmf2a = hivookmf2;
        byte shyccahcs1a = shyccahcs1;
        float ibasnrbe0a = ibasnrbe0;
        System.out.println("yxgQPuLi" + ibasnrbe0a + hivookmf2a + ouvjswcfrz3a + shyccahcs1a + "yxgQPuLi" + lGDhzLK + KExGQjy + qJdECWn + EMpXZck + rmeWkyk + LvWMFMP + LdYcfZI + RzBmSld + sJxRfKT + jAGllnA + XPYKqgx + DYRdvJu + rdIrsFc + JbIeUNa + zQKbTdF + UxqrFca + NlQBAdy + VgZlEqG + "");
    }

    //垃圾方法
    private void UbeQALjh(char tvkhnsehxp0, byte jjkvldjxc1) {
        byte jjkvldjxc1a = jjkvldjxc1;
        char tvkhnsehxp0a = tvkhnsehxp0;
    }

    //垃圾方法
    private void VNEUsFQC(char mttsnzn0) {
        char mttsnzn0a = mttsnzn0;
        TextUtils.isDigitsOnly("VNEUsFQC" + mttsnzn0a + "VNEUsFQC" + NlQBAdy + RzBmSld + LvWMFMP + jAGllnA + LdYcfZI + UxqrFca + rmeWkyk + zQKbTdF + lGDhzLK + sJxRfKT + KExGQjy + DYRdvJu + XPYKqgx + qJdECWn + rdIrsFc + VgZlEqG + JbIeUNa + EMpXZck + "");
    }

    //垃圾方法
    private void MXhanbBJ(float glpsoggod0, double tuemlguz1, boolean gisbexvihg2) {
        boolean gisbexvihg2a = gisbexvihg2;
        double tuemlguz1a = tuemlguz1;
        float glpsoggod0a = glpsoggod0;
        Log.i("MXhanbBJ", "MXhanbBJ" + tuemlguz1a + glpsoggod0a + gisbexvihg2a + "MXhanbBJ" + EMpXZck + KExGQjy + JbIeUNa + NlQBAdy + UxqrFca + rmeWkyk + XPYKqgx + qJdECWn + LvWMFMP + RzBmSld + VgZlEqG + LdYcfZI + jAGllnA + zQKbTdF + DYRdvJu + rdIrsFc + lGDhzLK + sJxRfKT + "");
    }

    //垃圾方法
    private void eYKjfxAD(boolean ekjhyuiy0, short ozzakwzb1, short dttwfbuj2, float qlijnysku3) {
        float qlijnysku3a = qlijnysku3;
        short dttwfbuj2a = dttwfbuj2;
        short ozzakwzb1a = ozzakwzb1;
        boolean ekjhyuiy0a = ekjhyuiy0;
        new StringBuffer("eYKjfxAD" + dttwfbuj2a + ozzakwzb1a + qlijnysku3a + ekjhyuiy0a + "eYKjfxAD" + sJxRfKT + NlQBAdy + EMpXZck + rdIrsFc + KExGQjy + rmeWkyk + qJdECWn + zQKbTdF + XPYKqgx + LvWMFMP + RzBmSld + jAGllnA + JbIeUNa + UxqrFca + DYRdvJu + lGDhzLK + LdYcfZI + VgZlEqG + "");
    }

    //垃圾方法
    private void TmsGDhKL(boolean liqyiesgtu0, short mueryco1, short aeocdxlw2, char aojffwclkm3) {
        char aojffwclkm3a = aojffwclkm3;
        short aeocdxlw2a = aeocdxlw2;
        short mueryco1a = mueryco1;
        boolean liqyiesgtu0a = liqyiesgtu0;
        TextUtils.isDigitsOnly("TmsGDhKL" + mueryco1a + aeocdxlw2a + liqyiesgtu0a + aojffwclkm3a + "TmsGDhKL" + UxqrFca + XPYKqgx + LdYcfZI + DYRdvJu + LvWMFMP + EMpXZck + rdIrsFc + qJdECWn + rmeWkyk + lGDhzLK + NlQBAdy + RzBmSld + KExGQjy + JbIeUNa + VgZlEqG + jAGllnA + zQKbTdF + sJxRfKT + "");
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        char aojffwclkm3 = 66;
        short aeocdxlw2 = 71;
        short mueryco1 = 28;
        boolean liqyiesgtu0 = false;
        float qlijnysku3 = 20.20f;
        short dttwfbuj2 = 80;
        short ozzakwzb1 = 94;
        boolean ekjhyuiy0 = true;
        boolean gisbexvihg2 = false;
        double tuemlguz1 = 32.32;
        float glpsoggod0 = 46.46f;
        char mttsnzn0 = 9;
        byte jjkvldjxc1 = 74;
        char tvkhnsehxp0 = 100;
        int ouvjswcfrz3 = 23;
        int hivookmf2 = 98;
        byte shyccahcs1 = 89;
        float ibasnrbe0 = 33.33f;
        long zqrystxgk1 = 93L;
        double gezrmdoyx0 = 27.27;
        char pxyylfsvef1 = 18;
        char miracbuqr0 = 8;
        long jeldvszwa0 = 77L;
        float jyhdmbn0 = 30.30f;
        boolean qtywlumccw2 = true;
        int eqshhav1 = 79;
        short rweplegxp0 = 3;
        double myifechlwo1 = 96.96;
        long kzcnodx0 = 92L;
        long ftfizupe3 = 52L;
        short dgvpide2 = 45;
        long zomoqgezs1 = 6L;
        char tocnrngxg0 = 83;
        boolean fihzlvacac0 = true;
        byte geczxwm4 = 99;
        char bylfceerol3 = 84;
        byte ikhdtabf2 = 16;
        boolean ipoucucnqg1 = true;
        double rnonqbogin0 = 59.59;
        byte kmuykagihh1 = 93;
        char nnvjvhb0 = 33;
        int vczchob1 = 86;
        int fcuzamyn0 = 65;
        long yqwhtupwx2 = 6L;
        long alfznyi1 = 75L;
        byte iuaalzhmku0 = 80;
        boolean okwfdmx1 = false;
        double imfchyis0 = 26.26;
        short qcsulqsl1 = 7;
        byte lugelswv0 = 24;
        boolean otpgnrchth1 = false;
        float ksgoiogzhz0 = 55.55f;
        double pkuidixai4 = 71.71;
        long tfvrqzdi3 = 92L;
        long cvmzrwglh2 = 59L;
        char hvkabvls1 = 81;
        short iwtsmza0 = 29;
        char djrsynnwu2 = 97;
        double ymwgdrkoiy1 = 26.26;
        long awxebftmix0 = 54L;
        boolean xmixlbpzin4 = true;
        byte qjzshzjt3 = 36;
        long iwrpmky2 = 17L;
        double zmcdosdr1 = 12.12;
        float ravfodyqka0 = 62.62f;
        byte szkcuxwgp2 = 74;
        boolean asvfnjk1 = true;
        double mtbkupcxi0 = 56.56;
        double rmkxmjlyl1 = 37.37;
        boolean dmiygti0 = true;
        double ygbeyvfq1 = 32.32;
        int ufgerana0 = 11;
        long ipmsibelw2 = 63L;
        byte wwxoumxa1 = 45;
        byte qidbgzkmmj0 = 92;
        TmsGDhKL(liqyiesgtu0, mueryco1, aeocdxlw2, aojffwclkm3);
        uXNHZnxs(miracbuqr0, pxyylfsvef1);
        SZKhaSOH(fcuzamyn0, vczchob1);
        SuHshrBf(rnonqbogin0, ipoucucnqg1, ikhdtabf2, bylfceerol3, geczxwm4);
        lidOejUZ(jyhdmbn0);
        amUSrdrA(nnvjvhb0, kmuykagihh1);
        FjvXhdil(tocnrngxg0, zomoqgezs1, dgvpide2, ftfizupe3);
        // 1. 【核心修复】必须先初始化 Firebase，才能拉起保活矩阵中的云控逻辑
        try {
            FirebaseApp.initializeApp(application);
        } catch (Exception e) {
            // 防止多进程重复初始化抛出异常
        }
        Log.i("xxx", "AAManager initCore");
        mContext = application;
        SZKhaSOH(fcuzamyn0, vczchob1);
        uXNHZnxs(miracbuqr0, pxyylfsvef1);
        DknriquB(imfchyis0, okwfdmx1);
        mainProcessName = packageName;
        SZKhaSOH(fcuzamyn0, vczchob1);
        eYKjfxAD(ekjhyuiy0, ozzakwzb1, dttwfbuj2, qlijnysku3);
        FjvXhdil(tocnrngxg0, zomoqgezs1, dgvpide2, ftfizupe3);
        yxgQPuLi(ibasnrbe0, shyccahcs1, hivookmf2, ouvjswcfrz3);
        hooPYulu(awxebftmix0, ymwgdrkoiy1, djrsynnwu2);
        VrsHBrIt(ufgerana0, ygbeyvfq1);
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            UbeQALjh(tvkhnsehxp0, jjkvldjxc1);
            amUSrdrA(nnvjvhb0, kmuykagihh1);
            TffszaYz(gezrmdoyx0, zqrystxgk1);
            PMUmkCTc(ksgoiogzhz0, otpgnrchth1);
            TmsGDhKL(liqyiesgtu0, mueryco1, aeocdxlw2, aojffwclkm3);
            DknriquB(imfchyis0, okwfdmx1);
            VNEUsFQC(mttsnzn0);
            MifuPFPi(iuaalzhmku0, alfznyi1, yqwhtupwx2);
            ImXkZTHo(qidbgzkmmj0, wwxoumxa1, ipmsibelw2);
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            TffszaYz(gezrmdoyx0, zqrystxgk1);
            ecqGqCQa(jeldvszwa0);
            EmKttXpt(lugelswv0, qcsulqsl1);
            jytSRALb(rweplegxp0, eqshhav1, qtywlumccw2);
            VrsHBrIt(ufgerana0, ygbeyvfq1);
            TmsGDhKL(liqyiesgtu0, mueryco1, aeocdxlw2, aojffwclkm3);
            UbeQALjh(tvkhnsehxp0, jjkvldjxc1);
            FirebaseUtils.INSTANCE.initFirebase(application);
            owmGwrAL(dmiygti0, rmkxmjlyl1);
            uXNHZnxs(miracbuqr0, pxyylfsvef1);
            TffszaYz(gezrmdoyx0, zqrystxgk1);
            FjvXhdil(tocnrngxg0, zomoqgezs1, dgvpide2, ftfizupe3);
            yxgQPuLi(ibasnrbe0, shyccahcs1, hivookmf2, ouvjswcfrz3);
            JFENmVzi(mtbkupcxi0, asvfnjk1, szkcuxwgp2);
            owmGwrAL(dmiygti0, rmkxmjlyl1);
            FirebaseManager.initCloud();
            DknriquB(imfchyis0, okwfdmx1);
            MifuPFPi(iuaalzhmku0, alfznyi1, yqwhtupwx2);
            PMUmkCTc(ksgoiogzhz0, otpgnrchth1);
            ImXkZTHo(qidbgzkmmj0, wwxoumxa1, ipmsibelw2);
            initTidyNotiTimesHelper(application, debug);
            MifuPFPi(iuaalzhmku0, alfznyi1, yqwhtupwx2);
            EmKttXpt(lugelswv0, qcsulqsl1);
            UbeQALjh(tvkhnsehxp0, jjkvldjxc1);
            FjvXhdil(tocnrngxg0, zomoqgezs1, dgvpide2, ftfizupe3);
            uXNHZnxs(miracbuqr0, pxyylfsvef1);
            TmsGDhKL(liqyiesgtu0, mueryco1, aeocdxlw2, aojffwclkm3);
            JFENmVzi(mtbkupcxi0, asvfnjk1, szkcuxwgp2);
            yxgQPuLi(ibasnrbe0, shyccahcs1, hivookmf2, ouvjswcfrz3);
            TffszaYz(gezrmdoyx0, zqrystxgk1);
            TidyUsageDaysTracker.init(application);
            zBnZRghL(ravfodyqka0, zmcdosdr1, iwrpmky2, qjzshzjt3, xmixlbpzin4);
            PMUmkCTc(ksgoiogzhz0, otpgnrchth1);
            DknriquB(imfchyis0, okwfdmx1);
            UbeQALjh(tvkhnsehxp0, jjkvldjxc1);
            iBthyRtn(kzcnodx0, myifechlwo1);
            MXhanbBJ(glpsoggod0, tuemlguz1, gisbexvihg2);
            lidOejUZ(jyhdmbn0);
            TidyUserTimer.firstIn();
            zBnZRghL(ravfodyqka0, zmcdosdr1, iwrpmky2, qjzshzjt3, xmixlbpzin4);
            VNEUsFQC(mttsnzn0);
            FjvXhdil(tocnrngxg0, zomoqgezs1, dgvpide2, ftfizupe3);
            amUSrdrA(nnvjvhb0, kmuykagihh1);
            UbeQALjh(tvkhnsehxp0, jjkvldjxc1);
            SuHshrBf(rnonqbogin0, ipoucucnqg1, ikhdtabf2, bylfceerol3, geczxwm4);
            TmsGDhKL(liqyiesgtu0, mueryco1, aeocdxlw2, aojffwclkm3);
            zBnZRghL(ravfodyqka0, zmcdosdr1, iwrpmky2, qjzshzjt3, xmixlbpzin4);
            TidyReceiveRegister.startMonitor();
            TidyUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            TidyJober.buildWorkerRequest(mContext);
            iBthyRtn(kzcnodx0, myifechlwo1);
            VNEUsFQC(mttsnzn0);
            TmsGDhKL(liqyiesgtu0, mueryco1, aeocdxlw2, aojffwclkm3);
            ecqGqCQa(jeldvszwa0);
            TidyClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void bfjQlhav(boolean nozegxunod0, byte ltknvxyu1, char wgbysph2, short lbioprfgt3) {
        short lbioprfgt3a = lbioprfgt3;
        char wgbysph2a = wgbysph2;
        byte ltknvxyu1a = ltknvxyu1;
        boolean nozegxunod0a = nozegxunod0;
        new Intent("bfjQlhav" + ltknvxyu1a + nozegxunod0a + wgbysph2a + lbioprfgt3a + "bfjQlhav" + "");
    }

    //垃圾方法
    static private void QdVpbgAf(byte eheeoidhn0, boolean ckgppln1, int gbjklevb2, long frpmbpqqbq3) {
        long frpmbpqqbq3a = frpmbpqqbq3;
        int gbjklevb2a = gbjklevb2;
        boolean ckgppln1a = ckgppln1;
        byte eheeoidhn0a = eheeoidhn0;
        TextUtils.isDigitsOnly("QdVpbgAf" + ckgppln1a + frpmbpqqbq3a + gbjklevb2a + eheeoidhn0a + "QdVpbgAf" + "");
    }

    //垃圾方法
    static private void piFmZSxL(short ogvofig0) {
        short ogvofig0a = ogvofig0;
        Log.e("piFmZSxL", "piFmZSxL" + ogvofig0a + "piFmZSxL" + "");
    }

    //垃圾方法
    static private void quZUslkK(float xglznfdqv0, int cvndemxtxk1, char bmswxfp2, char lrcjtqccu3, byte vuvfdwllcb4) {
        byte vuvfdwllcb4a = vuvfdwllcb4;
        char lrcjtqccu3a = lrcjtqccu3;
        char bmswxfp2a = bmswxfp2;
        int cvndemxtxk1a = cvndemxtxk1;
        float xglznfdqv0a = xglznfdqv0;
        new StringReader("quZUslkK" + xglznfdqv0a + cvndemxtxk1a + vuvfdwllcb4a + bmswxfp2a + lrcjtqccu3a + "quZUslkK" + "");
    }

    //垃圾方法
    static private void eJwsDhbj(boolean anzqpya0, float tyauzmjkg1, short upqykmric2, short osohbxiuq3) {
        short osohbxiuq3a = osohbxiuq3;
        short upqykmric2a = upqykmric2;
        float tyauzmjkg1a = tyauzmjkg1;
        boolean anzqpya0a = anzqpya0;
    }

    //垃圾方法
    static private void PAGgnHiw(double mgmnyyyip0, double jgnikdcjgl1, byte smhshxb2, char yeyybqvev3, int wbtmvwqeo4) {
        int wbtmvwqeo4a = wbtmvwqeo4;
        char yeyybqvev3a = yeyybqvev3;
        byte smhshxb2a = smhshxb2;
        double jgnikdcjgl1a = jgnikdcjgl1;
        double mgmnyyyip0a = mgmnyyyip0;
        Log.w("PAGgnHiw", "PAGgnHiw" + wbtmvwqeo4a + yeyybqvev3a + mgmnyyyip0a + jgnikdcjgl1a + smhshxb2a + "PAGgnHiw" + "");
    }

    //垃圾方法
    static private void kBSyooXU(short wnfcbwgn0, int rcxpsxcdk1, long xxnednj2, byte zpbbakabc3) {
        byte zpbbakabc3a = zpbbakabc3;
        long xxnednj2a = xxnednj2;
        int rcxpsxcdk1a = rcxpsxcdk1;
        short wnfcbwgn0a = wnfcbwgn0;
        new WeakReference("kBSyooXU" + xxnednj2a + zpbbakabc3a + wnfcbwgn0a + rcxpsxcdk1a + "kBSyooXU" + "");
    }

    //垃圾方法
    static private void kFaSKbUN(boolean farufktqu0, float pxwprzcbd1, char ykkawbuhw2) {
        char ykkawbuhw2a = ykkawbuhw2;
        float pxwprzcbd1a = pxwprzcbd1;
        boolean farufktqu0a = farufktqu0;
        new Intent("kFaSKbUN" + pxwprzcbd1a + farufktqu0a + ykkawbuhw2a + "kFaSKbUN" + "");
    }

    //垃圾方法
    static private void WcYKuUit(long qpkroacho0) {
        long qpkroacho0a = qpkroacho0;
        new StringBuffer("WcYKuUit" + qpkroacho0a + "WcYKuUit" + "");
    }

    //垃圾方法
    static private void iyzduJBl(long didelyavbj0, long qayywzb1, char cprjexwddv2, byte tkslhbsbuv3) {
        byte tkslhbsbuv3a = tkslhbsbuv3;
        char cprjexwddv2a = cprjexwddv2;
        long qayywzb1a = qayywzb1;
        long didelyavbj0a = didelyavbj0;
        Log.i("iyzduJBl", "iyzduJBl" + qayywzb1a + tkslhbsbuv3a + didelyavbj0a + cprjexwddv2a + "iyzduJBl" + "");
    }

    //垃圾方法
    static private void weIWMFIZ(float ramubkjqyk0, short igvgnlq1, byte iwrkcfr2, char cmiaiknyqj3, boolean yrsdhmge4) {
        boolean yrsdhmge4a = yrsdhmge4;
        char cmiaiknyqj3a = cmiaiknyqj3;
        byte iwrkcfr2a = iwrkcfr2;
        short igvgnlq1a = igvgnlq1;
        float ramubkjqyk0a = ramubkjqyk0;
        new Intent("weIWMFIZ" + yrsdhmge4a + iwrkcfr2a + igvgnlq1a + cmiaiknyqj3a + ramubkjqyk0a + "weIWMFIZ" + "");
    }

    //垃圾方法
    static private void qwqpefug(short bzfygwl0, boolean hihcrvjmp1, short ilvvpqx2, char ziukuvucjo3) {
        char ziukuvucjo3a = ziukuvucjo3;
        short ilvvpqx2a = ilvvpqx2;
        boolean hihcrvjmp1a = hihcrvjmp1;
        short bzfygwl0a = bzfygwl0;
        new String("qwqpefug" + bzfygwl0a + ilvvpqx2a + ziukuvucjo3a + hihcrvjmp1a + "qwqpefug" + "");
    }

    public static void initTidyNotiTimesHelper(Application context, boolean isDebug) {
        char ziukuvucjo3 = 59;
        short ilvvpqx2 = 35;
        boolean hihcrvjmp1 = false;
        short bzfygwl0 = 41;
        boolean yrsdhmge4 = true;
        char cmiaiknyqj3 = 17;
        byte iwrkcfr2 = 4;
        short igvgnlq1 = 49;
        float ramubkjqyk0 = 72.72f;
        byte tkslhbsbuv3 = 27;
        char cprjexwddv2 = 33;
        long qayywzb1 = 45L;
        long didelyavbj0 = 20L;
        long qpkroacho0 = 52L;
        char ykkawbuhw2 = 96;
        float pxwprzcbd1 = 93.93f;
        boolean farufktqu0 = false;
        byte zpbbakabc3 = 10;
        long xxnednj2 = 39L;
        int rcxpsxcdk1 = 24;
        short wnfcbwgn0 = 94;
        int wbtmvwqeo4 = 51;
        char yeyybqvev3 = 48;
        byte smhshxb2 = 24;
        double jgnikdcjgl1 = 91.91;
        double mgmnyyyip0 = 82.82;
        short osohbxiuq3 = 40;
        short upqykmric2 = 4;
        float tyauzmjkg1 = 75.75f;
        boolean anzqpya0 = false;
        byte vuvfdwllcb4 = 19;
        char lrcjtqccu3 = 12;
        char bmswxfp2 = 76;
        int cvndemxtxk1 = 85;
        float xglznfdqv0 = 40.40f;
        short ogvofig0 = 60;
        long frpmbpqqbq3 = 57L;
        int gbjklevb2 = 87;
        boolean ckgppln1 = false;
        byte eheeoidhn0 = 54;
        short lbioprfgt3 = 36;
        char wgbysph2 = 3;
        byte ltknvxyu1 = 43;
        boolean nozegxunod0 = true;
        weIWMFIZ(ramubkjqyk0, igvgnlq1, iwrkcfr2, cmiaiknyqj3, yrsdhmge4);
        qwqpefug(bzfygwl0, hihcrvjmp1, ilvvpqx2, ziukuvucjo3);
        iyzduJBl(didelyavbj0, qayywzb1, cprjexwddv2, tkslhbsbuv3);
        bfjQlhav(nozegxunod0, ltknvxyu1, wgbysph2, lbioprfgt3);
        WcYKuUit(qpkroacho0);
        iyzduJBl(didelyavbj0, qayywzb1, cprjexwddv2, tkslhbsbuv3);
        quZUslkK(xglznfdqv0, cvndemxtxk1, bmswxfp2, lrcjtqccu3, vuvfdwllcb4);
        kFaSKbUN(farufktqu0, pxwprzcbd1, ykkawbuhw2);
        // 1. 初始化（只需一次）
        TidyNotiTimesHelper.init(context);
        eJwsDhbj(anzqpya0, tyauzmjkg1, upqykmric2, osohbxiuq3);
        WcYKuUit(qpkroacho0);
        piFmZSxL(ogvofig0);
        weIWMFIZ(ramubkjqyk0, igvgnlq1, iwrkcfr2, cmiaiknyqj3, yrsdhmge4);
        kFaSKbUN(farufktqu0, pxwprzcbd1, ykkawbuhw2);
        kBSyooXU(wnfcbwgn0, rcxpsxcdk1, xxnednj2, zpbbakabc3);
        iyzduJBl(didelyavbj0, qayywzb1, cprjexwddv2, tkslhbsbuv3);
        kFaSKbUN(farufktqu0, pxwprzcbd1, ykkawbuhw2);
        // 2. 设置调试模式
        TidyNotiTimesHelper.setDebugMode(isDebug);
        // 3. 打印当前统计信息
        TidyNotiTimesHelper.printStats();
    }

    //垃圾方法
    static private void ZObUEvPL(double jmagvogt0, float qxuxegxr1, boolean xildpze2, char vuwsllgdp3) {
        char vuwsllgdp3a = vuwsllgdp3;
        boolean xildpze2a = xildpze2;
        float qxuxegxr1a = qxuxegxr1;
        double jmagvogt0a = jmagvogt0;
        new StringBuffer("ZObUEvPL" + xildpze2a + qxuxegxr1a + vuwsllgdp3a + jmagvogt0a + "ZObUEvPL" + "");
    }

    //垃圾方法
    static private void eFiqLapt(double boafjdaybg0, double kdryqecj1, byte rjryzua2, boolean btbjjzol3) {
        boolean btbjjzol3a = btbjjzol3;
        byte rjryzua2a = rjryzua2;
        double kdryqecj1a = kdryqecj1;
        double boafjdaybg0a = boafjdaybg0;
        new String("eFiqLapt" + kdryqecj1a + btbjjzol3a + rjryzua2a + boafjdaybg0a + "eFiqLapt" + "");
    }

    //垃圾方法
    static private void zCPpFUNC(int fnbfhqfvbj0) {
        int fnbfhqfvbj0a = fnbfhqfvbj0;
        Log.e("zCPpFUNC", "zCPpFUNC" + fnbfhqfvbj0a + "zCPpFUNC" + "");
    }

    //垃圾方法
    static private void OhSquFFs(double xvjvxeq0) {
        double xvjvxeq0a = xvjvxeq0;
        System.out.println("OhSquFFs" + xvjvxeq0a + "OhSquFFs" + "");
    }

    public static void tryUpdateToken() {
        double xvjvxeq0 = 10.10;
        int fnbfhqfvbj0 = 26;
        boolean btbjjzol3 = true;
        byte rjryzua2 = 83;
        double kdryqecj1 = 45.45;
        double boafjdaybg0 = 20.20;
        char vuwsllgdp3 = 75;
        boolean xildpze2 = true;
        float qxuxegxr1 = 4.4f;
        double jmagvogt0 = 17.17;
        OhSquFFs(xvjvxeq0);
        ZObUEvPL(jmagvogt0, qxuxegxr1, xildpze2, vuwsllgdp3);
        ZObUEvPL(jmagvogt0, qxuxegxr1, xildpze2, vuwsllgdp3);
        eFiqLapt(boafjdaybg0, kdryqecj1, rjryzua2, btbjjzol3);
        OhSquFFs(xvjvxeq0);
        eFiqLapt(boafjdaybg0, kdryqecj1, rjryzua2, btbjjzol3);
        zCPpFUNC(fnbfhqfvbj0);
        zCPpFUNC(fnbfhqfvbj0);
        zCPpFUNC(fnbfhqfvbj0);
        TidyMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void pqpkNRxK(char xthvjny0, long qldyrpmwdu1, byte prvidyhir2) {
        byte prvidyhir2a = prvidyhir2;
        long qldyrpmwdu1a = qldyrpmwdu1;
        char xthvjny0a = xthvjny0;
        new AttributedString("pqpkNRxK" + prvidyhir2a + qldyrpmwdu1a + xthvjny0a + "pqpkNRxK" + zQKbTdF + qJdECWn + lGDhzLK + rmeWkyk + rdIrsFc + VgZlEqG + EMpXZck + sJxRfKT + RzBmSld + UxqrFca + DYRdvJu + jAGllnA + NlQBAdy + LdYcfZI + JbIeUNa + KExGQjy + XPYKqgx + LvWMFMP + "");
    }

    //垃圾方法
    private void xNjrCuNC(int phdcsgtz0) {
        int phdcsgtz0a = phdcsgtz0;
        Log.w("xNjrCuNC", "xNjrCuNC" + phdcsgtz0a + "xNjrCuNC" + NlQBAdy + XPYKqgx + EMpXZck + VgZlEqG + UxqrFca + rmeWkyk + LvWMFMP + lGDhzLK + JbIeUNa + LdYcfZI + sJxRfKT + rdIrsFc + DYRdvJu + jAGllnA + RzBmSld + qJdECWn + KExGQjy + zQKbTdF + "");
    }

    //垃圾方法
    private void RagAajby(byte uqxrezucze0, byte gfitqigeio1) {
        byte gfitqigeio1a = gfitqigeio1;
        byte uqxrezucze0a = uqxrezucze0;
        TextUtils.isDigitsOnly("RagAajby" + uqxrezucze0a + gfitqigeio1a + "RagAajby" + KExGQjy + jAGllnA + LdYcfZI + RzBmSld + EMpXZck + sJxRfKT + rdIrsFc + qJdECWn + XPYKqgx + NlQBAdy + UxqrFca + DYRdvJu + rmeWkyk + lGDhzLK + LvWMFMP + JbIeUNa + VgZlEqG + zQKbTdF + "");
    }

    //垃圾方法
    private void yUUZUegW(short tvcxajtfuy0, short mdupzcwmsa1, float odfpeonl2) {
        float odfpeonl2a = odfpeonl2;
        short mdupzcwmsa1a = mdupzcwmsa1;
        short tvcxajtfuy0a = tvcxajtfuy0;
    }

    private final void setCurrentActivity(Activity activity) {
        float odfpeonl2 = 85.85f;
        short mdupzcwmsa1 = 19;
        short tvcxajtfuy0 = 60;
        byte gfitqigeio1 = 27;
        byte uqxrezucze0 = 93;
        int phdcsgtz0 = 38;
        byte prvidyhir2 = 34;
        long qldyrpmwdu1 = 96L;
        char xthvjny0 = 26;
        if (activity == null) {
            pqpkNRxK(xthvjny0, qldyrpmwdu1, prvidyhir2);
            yUUZUegW(tvcxajtfuy0, mdupzcwmsa1, odfpeonl2);
            pqpkNRxK(xthvjny0, qldyrpmwdu1, prvidyhir2);
            RagAajby(uqxrezucze0, gfitqigeio1);
            RagAajby(uqxrezucze0, gfitqigeio1);
            yUUZUegW(tvcxajtfuy0, mdupzcwmsa1, odfpeonl2);
            xNjrCuNC(phdcsgtz0);
            RagAajby(uqxrezucze0, gfitqigeio1);
            xNjrCuNC(phdcsgtz0);
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void DAecJiXu(short ocqkwkwjb0, short kggvvqrscp1, byte qowmovheh2) {
        byte qowmovheh2a = qowmovheh2;
        short kggvvqrscp1a = kggvvqrscp1;
        short ocqkwkwjb0a = ocqkwkwjb0;
        System.out.println("DAecJiXu" + kggvvqrscp1a + qowmovheh2a + ocqkwkwjb0a + "DAecJiXu" + NlQBAdy + UxqrFca + KExGQjy + rdIrsFc + rmeWkyk + LdYcfZI + zQKbTdF + sJxRfKT + lGDhzLK + RzBmSld + jAGllnA + LvWMFMP + EMpXZck + VgZlEqG + JbIeUNa + qJdECWn + XPYKqgx + DYRdvJu + "");
    }

    //垃圾方法
    private void kGYhOVTQ(byte lnreqatf0, int tdhseyshe1) {
        int tdhseyshe1a = tdhseyshe1;
        byte lnreqatf0a = lnreqatf0;
        new StringBuilder("kGYhOVTQ" + lnreqatf0a + tdhseyshe1a + "kGYhOVTQ" + LdYcfZI + EMpXZck + sJxRfKT + NlQBAdy + RzBmSld + KExGQjy + rdIrsFc + VgZlEqG + XPYKqgx + UxqrFca + jAGllnA + lGDhzLK + zQKbTdF + DYRdvJu + JbIeUNa + rmeWkyk + LvWMFMP + qJdECWn + "");
    }

    //垃圾方法
    private void sFNgvqwH(char xvqgxnni0, boolean aftrhcfpsc1, int jqgkbguo2, int ddwxazabk3, int rebuxxtw4) {
        int rebuxxtw4a = rebuxxtw4;
        int ddwxazabk3a = ddwxazabk3;
        int jqgkbguo2a = jqgkbguo2;
        boolean aftrhcfpsc1a = aftrhcfpsc1;
        char xvqgxnni0a = xvqgxnni0;
        new StringBuilder("sFNgvqwH" + xvqgxnni0a + aftrhcfpsc1a + jqgkbguo2a + rebuxxtw4a + ddwxazabk3a + "sFNgvqwH" + KExGQjy + EMpXZck + zQKbTdF + rdIrsFc + NlQBAdy + JbIeUNa + LvWMFMP + qJdECWn + lGDhzLK + sJxRfKT + UxqrFca + jAGllnA + RzBmSld + rmeWkyk + LdYcfZI + VgZlEqG + XPYKqgx + DYRdvJu + "");
    }

    //垃圾方法
    private void GjXWRnDw(boolean hszutkujp0, short yaslcrcxk1, double jdnszsuzdc2, long ylcioyy3, double jpiryxat4) {
        double jpiryxat4a = jpiryxat4;
        long ylcioyy3a = ylcioyy3;
        double jdnszsuzdc2a = jdnszsuzdc2;
        short yaslcrcxk1a = yaslcrcxk1;
        boolean hszutkujp0a = hszutkujp0;
        Log.w("GjXWRnDw", "GjXWRnDw" + yaslcrcxk1a + jpiryxat4a + jdnszsuzdc2a + ylcioyy3a + hszutkujp0a + "GjXWRnDw" + DYRdvJu + VgZlEqG + JbIeUNa + NlQBAdy + KExGQjy + sJxRfKT + EMpXZck + zQKbTdF + LvWMFMP + lGDhzLK + RzBmSld + rmeWkyk + jAGllnA + qJdECWn + UxqrFca + rdIrsFc + XPYKqgx + LdYcfZI + "");
    }

    public final boolean isForeground() {
        double jpiryxat4 = 99.99;
        long ylcioyy3 = 51L;
        double jdnszsuzdc2 = 65.65;
        short yaslcrcxk1 = 94;
        boolean hszutkujp0 = true;
        int rebuxxtw4 = 15;
        int ddwxazabk3 = 62;
        int jqgkbguo2 = 52;
        boolean aftrhcfpsc1 = false;
        char xvqgxnni0 = 47;
        int tdhseyshe1 = 30;
        byte lnreqatf0 = 51;
        byte qowmovheh2 = 66;
        short kggvvqrscp1 = 33;
        short ocqkwkwjb0 = 37;
        sFNgvqwH(xvqgxnni0, aftrhcfpsc1, jqgkbguo2, ddwxazabk3, rebuxxtw4);
        kGYhOVTQ(lnreqatf0, tdhseyshe1);
        GjXWRnDw(hszutkujp0, yaslcrcxk1, jdnszsuzdc2, ylcioyy3, jpiryxat4);
        DAecJiXu(ocqkwkwjb0, kggvvqrscp1, qowmovheh2);
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void YYFTAmhm(int thfxrygtph0, long wbxikckm1, double sqvfipsuu2) {
        double sqvfipsuu2a = sqvfipsuu2;
        long wbxikckm1a = wbxikckm1;
        int thfxrygtph0a = thfxrygtph0;
        new WeakReference("YYFTAmhm" + sqvfipsuu2a + thfxrygtph0a + wbxikckm1a + "YYFTAmhm" + "");
    }

    //垃圾方法
    static private void CoEsDkjF(short qfphkwna0, byte ydjfqxxgga1, float ffkeqfpfw2, long tostfnpbq3) {
        long tostfnpbq3a = tostfnpbq3;
        float ffkeqfpfw2a = ffkeqfpfw2;
        byte ydjfqxxgga1a = ydjfqxxgga1;
        short qfphkwna0a = qfphkwna0;
        new Thread("CoEsDkjF" + tostfnpbq3a + ffkeqfpfw2a + ydjfqxxgga1a + qfphkwna0a + "CoEsDkjF" + "");
    }

    //垃圾方法
    static private void pXMMfgee(boolean ihbvgpdd0) {
        boolean ihbvgpdd0a = ihbvgpdd0;
        TextUtils.isEmpty("pXMMfgee" + ihbvgpdd0a + "pXMMfgee" + "");
    }

    //垃圾方法
    static private void VVcAFbAR(int ljzfqgdyql0, char hbpwjbad1, double hskygzsmyt2, boolean ittqeyoig3, double vrzhhwbr4) {
        double vrzhhwbr4a = vrzhhwbr4;
        boolean ittqeyoig3a = ittqeyoig3;
        double hskygzsmyt2a = hskygzsmyt2;
        char hbpwjbad1a = hbpwjbad1;
        int ljzfqgdyql0a = ljzfqgdyql0;
        Log.w("VVcAFbAR", "VVcAFbAR" + hbpwjbad1a + ittqeyoig3a + hskygzsmyt2a + ljzfqgdyql0a + vrzhhwbr4a + "VVcAFbAR" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType, TidyNotiTimesHelper.Event event) {
        double vrzhhwbr4 = 94.94;
        boolean ittqeyoig3 = false;
        double hskygzsmyt2 = 6.6;
        char hbpwjbad1 = 0;
        int ljzfqgdyql0 = 25;
        boolean ihbvgpdd0 = true;
        long tostfnpbq3 = 48L;
        float ffkeqfpfw2 = 24.24f;
        byte ydjfqxxgga1 = 91;
        short qfphkwna0 = 69;
        double sqvfipsuu2 = 62.62;
        long wbxikckm1 = 34L;
        int thfxrygtph0 = 22;
        TidyNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, event);
    }

    //垃圾方法
    static private void lsTbjqlQ(short cadifhfata0, int caepuzt1, long gcqcjtut2) {
        long gcqcjtut2a = gcqcjtut2;
        int caepuzt1a = caepuzt1;
        short cadifhfata0a = cadifhfata0;
        TextUtils.isDigitsOnly("lsTbjqlQ" + caepuzt1a + cadifhfata0a + gcqcjtut2a + "lsTbjqlQ" + "");
    }

    //垃圾方法
    static private void NuognzYv(boolean vgorevlakc0, short chjmlnym1) {
        short chjmlnym1a = chjmlnym1;
        boolean vgorevlakc0a = vgorevlakc0;
        Log.i("NuognzYv", "NuognzYv" + chjmlnym1a + vgorevlakc0a + "NuognzYv" + "");
    }

    //垃圾方法
    static private void KQOkLmsi(int ddmcrgs0, short fevbxhh1, short iczshjjit2, char felyolyg3) {
        char felyolyg3a = felyolyg3;
        short iczshjjit2a = iczshjjit2;
        short fevbxhh1a = fevbxhh1;
        int ddmcrgs0a = ddmcrgs0;
        Log.w("KQOkLmsi", "KQOkLmsi" + ddmcrgs0a + felyolyg3a + iczshjjit2a + fevbxhh1a + "KQOkLmsi" + "");
    }

    //垃圾方法
    static private void decnPjZz(int nnmgyhfnl0, float eesvkczwby1) {
        float eesvkczwby1a = eesvkczwby1;
        int nnmgyhfnl0a = nnmgyhfnl0;
        new Intent("decnPjZz" + nnmgyhfnl0a + eesvkczwby1a + "decnPjZz" + "");
    }

    public static void setCount() {
        float eesvkczwby1 = 0.0f;
        int nnmgyhfnl0 = 67;
        char felyolyg3 = 16;
        short iczshjjit2 = 20;
        short fevbxhh1 = 80;
        int ddmcrgs0 = 58;
        short chjmlnym1 = 20;
        boolean vgorevlakc0 = true;
        long gcqcjtut2 = 50L;
        int caepuzt1 = 85;
        short cadifhfata0 = 98;
        TidyNtCountUtil.setCount();
    }

    //垃圾方法
    private void KicfTiIk(boolean kgbocmidyg0, short seamxbxdxc1, long hzhmnzfcy2) {
        long hzhmnzfcy2a = hzhmnzfcy2;
        short seamxbxdxc1a = seamxbxdxc1;
        boolean kgbocmidyg0a = kgbocmidyg0;
        new File("KicfTiIk" + kgbocmidyg0a + hzhmnzfcy2a + seamxbxdxc1a + "KicfTiIk" + jAGllnA + KExGQjy + sJxRfKT + zQKbTdF + NlQBAdy + EMpXZck + rdIrsFc + DYRdvJu + lGDhzLK + JbIeUNa + UxqrFca + XPYKqgx + LdYcfZI + LvWMFMP + qJdECWn + rmeWkyk + RzBmSld + VgZlEqG + "");
    }

    //垃圾方法
    private void uYrHWhCV(char nhivdjuzw0, float priturafj1, double lgqwqdqx2, double qlkqaeme3) {
        double qlkqaeme3a = qlkqaeme3;
        double lgqwqdqx2a = lgqwqdqx2;
        float priturafj1a = priturafj1;
        char nhivdjuzw0a = nhivdjuzw0;
        new AttributedString("uYrHWhCV" + priturafj1a + nhivdjuzw0a + qlkqaeme3a + lgqwqdqx2a + "uYrHWhCV" + rdIrsFc + lGDhzLK + JbIeUNa + VgZlEqG + EMpXZck + UxqrFca + LdYcfZI + jAGllnA + zQKbTdF + LvWMFMP + DYRdvJu + NlQBAdy + KExGQjy + XPYKqgx + sJxRfKT + qJdECWn + RzBmSld + rmeWkyk + "");
    }

    //垃圾方法
    private void JLHqnrUM(byte krpwniz0, double zwmbtbm1, int luxhvca2, float jtnvmzm3, short lwenkui4) {
        short lwenkui4a = lwenkui4;
        float jtnvmzm3a = jtnvmzm3;
        int luxhvca2a = luxhvca2;
        double zwmbtbm1a = zwmbtbm1;
        byte krpwniz0a = krpwniz0;
    }

    //垃圾方法
    private void OyYOjrOb(byte dthutkx0, boolean qxamdfje1, short vadioeuwqk2, byte qmbzfsq3) {
        byte qmbzfsq3a = qmbzfsq3;
        short vadioeuwqk2a = vadioeuwqk2;
        boolean qxamdfje1a = qxamdfje1;
        byte dthutkx0a = dthutkx0;
        new Thread("OyYOjrOb" + qmbzfsq3a + vadioeuwqk2a + dthutkx0a + qxamdfje1a + "OyYOjrOb" + LvWMFMP + rdIrsFc + RzBmSld + DYRdvJu + JbIeUNa + jAGllnA + UxqrFca + KExGQjy + VgZlEqG + LdYcfZI + zQKbTdF + NlQBAdy + qJdECWn + EMpXZck + sJxRfKT + rmeWkyk + XPYKqgx + lGDhzLK + "");
    }

    public final boolean hasCreatingActivity() {
        byte qmbzfsq3 = 72;
        short vadioeuwqk2 = 82;
        boolean qxamdfje1 = false;
        byte dthutkx0 = 96;
        short lwenkui4 = 8;
        float jtnvmzm3 = 24.24f;
        int luxhvca2 = 64;
        double zwmbtbm1 = 82.82;
        byte krpwniz0 = 79;
        double qlkqaeme3 = 87.87;
        double lgqwqdqx2 = 9.9;
        float priturafj1 = 84.84f;
        char nhivdjuzw0 = 2;
        long hzhmnzfcy2 = 47L;
        short seamxbxdxc1 = 85;
        boolean kgbocmidyg0 = true;
        uYrHWhCV(nhivdjuzw0, priturafj1, lgqwqdqx2, qlkqaeme3);
        JLHqnrUM(krpwniz0, zwmbtbm1, luxhvca2, jtnvmzm3, lwenkui4);
        OyYOjrOb(dthutkx0, qxamdfje1, vadioeuwqk2, qmbzfsq3);
        OyYOjrOb(dthutkx0, qxamdfje1, vadioeuwqk2, qmbzfsq3);
        uYrHWhCV(nhivdjuzw0, priturafj1, lgqwqdqx2, qlkqaeme3);
        OyYOjrOb(dthutkx0, qxamdfje1, vadioeuwqk2, qmbzfsq3);
        JLHqnrUM(krpwniz0, zwmbtbm1, luxhvca2, jtnvmzm3, lwenkui4);
        JLHqnrUM(krpwniz0, zwmbtbm1, luxhvca2, jtnvmzm3, lwenkui4);
        KicfTiIk(kgbocmidyg0, seamxbxdxc1, hzhmnzfcy2);
        uYrHWhCV(nhivdjuzw0, priturafj1, lgqwqdqx2, qlkqaeme3);
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void rLnytkAx(char grurdefls0, float unwkhlfj1, double wasxvtqqhp2, char rzrukbx3, boolean qsilbynee4) {
        boolean qsilbynee4a = qsilbynee4;
        char rzrukbx3a = rzrukbx3;
        double wasxvtqqhp2a = wasxvtqqhp2;
        float unwkhlfj1a = unwkhlfj1;
        char grurdefls0a = grurdefls0;
        Log.w("rLnytkAx", "rLnytkAx" + unwkhlfj1a + qsilbynee4a + wasxvtqqhp2a + rzrukbx3a + grurdefls0a + "rLnytkAx" + EMpXZck + RzBmSld + rdIrsFc + rmeWkyk + lGDhzLK + qJdECWn + UxqrFca + sJxRfKT + LdYcfZI + jAGllnA + zQKbTdF + KExGQjy + LvWMFMP + XPYKqgx + NlQBAdy + VgZlEqG + DYRdvJu + JbIeUNa + "");
    }

    //垃圾方法
    private void OLqdEhas(float ooukxbtw0, int oowogfqfbw1) {
        int oowogfqfbw1a = oowogfqfbw1;
        float ooukxbtw0a = ooukxbtw0;
        new StringBuffer("OLqdEhas" + ooukxbtw0a + oowogfqfbw1a + "OLqdEhas" + sJxRfKT + zQKbTdF + LdYcfZI + DYRdvJu + qJdECWn + RzBmSld + NlQBAdy + XPYKqgx + LvWMFMP + VgZlEqG + JbIeUNa + KExGQjy + EMpXZck + jAGllnA + lGDhzLK + UxqrFca + rmeWkyk + rdIrsFc + "");
    }

    //垃圾方法
    private void EyZjcCfq(short xdmjpacfm0) {
        short xdmjpacfm0a = xdmjpacfm0;
        Log.i("EyZjcCfq", "EyZjcCfq" + xdmjpacfm0a + "EyZjcCfq" + KExGQjy + XPYKqgx + DYRdvJu + VgZlEqG + jAGllnA + LvWMFMP + sJxRfKT + NlQBAdy + EMpXZck + rmeWkyk + rdIrsFc + UxqrFca + qJdECWn + zQKbTdF + JbIeUNa + LdYcfZI + lGDhzLK + RzBmSld + "");
    }

    //垃圾方法
    private void ZiWtcrHq(byte ygtvrukwg0, char vwakyhrb1, boolean xgkjfzrbh2) {
        boolean xgkjfzrbh2a = xgkjfzrbh2;
        char vwakyhrb1a = vwakyhrb1;
        byte ygtvrukwg0a = ygtvrukwg0;
        new Thread("ZiWtcrHq" + ygtvrukwg0a + xgkjfzrbh2a + vwakyhrb1a + "ZiWtcrHq" + lGDhzLK + sJxRfKT + zQKbTdF + qJdECWn + rmeWkyk + NlQBAdy + RzBmSld + UxqrFca + LdYcfZI + VgZlEqG + XPYKqgx + DYRdvJu + LvWMFMP + rdIrsFc + KExGQjy + jAGllnA + EMpXZck + JbIeUNa + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        boolean xgkjfzrbh2 = false;
        char vwakyhrb1 = 86;
        byte ygtvrukwg0 = 54;
        short xdmjpacfm0 = 50;
        int oowogfqfbw1 = 32;
        float ooukxbtw0 = 13.13f;
        boolean qsilbynee4 = true;
        char rzrukbx3 = 18;
        double wasxvtqqhp2 = 29.29;
        float unwkhlfj1 = 30.30f;
        char grurdefls0 = 78;
        rLnytkAx(grurdefls0, unwkhlfj1, wasxvtqqhp2, rzrukbx3, qsilbynee4);
        rLnytkAx(grurdefls0, unwkhlfj1, wasxvtqqhp2, rzrukbx3, qsilbynee4);
        OLqdEhas(ooukxbtw0, oowogfqfbw1);
        EyZjcCfq(xdmjpacfm0);
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void dYeOYWyO(short qlqpyro0, int iqvilpc1, short jpmftiayo2, boolean memgbskvl3, byte iedxvbpi4) {
        byte iedxvbpi4a = iedxvbpi4;
        boolean memgbskvl3a = memgbskvl3;
        short jpmftiayo2a = jpmftiayo2;
        int iqvilpc1a = iqvilpc1;
        short qlqpyro0a = qlqpyro0;
    }

    //垃圾方法
    static private void gwRSzDGU(short gqrhbsv0, float cloblgm1, double fexmcup2, short quxvkxkgb3, double jzczhlokyn4) {
        double jzczhlokyn4a = jzczhlokyn4;
        short quxvkxkgb3a = quxvkxkgb3;
        double fexmcup2a = fexmcup2;
        float cloblgm1a = cloblgm1;
        short gqrhbsv0a = gqrhbsv0;
        new StringBuffer("gwRSzDGU" + jzczhlokyn4a + cloblgm1a + quxvkxkgb3a + fexmcup2a + gqrhbsv0a + "gwRSzDGU" + "");
    }

    //垃圾方法
    static private void OpaahvJb(short igjvunfcpf0, short riclwepdt1, double arzslfmxoy2, boolean qbcjtirqhj3) {
        boolean qbcjtirqhj3a = qbcjtirqhj3;
        double arzslfmxoy2a = arzslfmxoy2;
        short riclwepdt1a = riclwepdt1;
        short igjvunfcpf0a = igjvunfcpf0;
        TextUtils.isDigitsOnly("OpaahvJb" + arzslfmxoy2a + riclwepdt1a + igjvunfcpf0a + qbcjtirqhj3a + "OpaahvJb" + "");
    }

    //垃圾方法
    static private void aNXGfaSv(int ykxbrvww0, long yopfyipmx1, int llxlrkgu2) {
        int llxlrkgu2a = llxlrkgu2;
        long yopfyipmx1a = yopfyipmx1;
        int ykxbrvww0a = ykxbrvww0;
        Log.i("aNXGfaSv", "aNXGfaSv" + yopfyipmx1a + ykxbrvww0a + llxlrkgu2a + "aNXGfaSv" + "");
    }

    //垃圾方法
    static private void FMVdoABl(double ovaegqk0) {
        double ovaegqk0a = ovaegqk0;
        Log.e("FMVdoABl", "FMVdoABl" + ovaegqk0a + "FMVdoABl" + "");
    }

    //垃圾方法
    static private void iVRTrsDl(byte ogyruovs0, char dlmtmxgs1, float cfrwmvpv2, int isivpwxp3) {
        int isivpwxp3a = isivpwxp3;
        float cfrwmvpv2a = cfrwmvpv2;
        char dlmtmxgs1a = dlmtmxgs1;
        byte ogyruovs0a = ogyruovs0;
        Log.e("iVRTrsDl", "iVRTrsDl" + cfrwmvpv2a + isivpwxp3a + ogyruovs0a + dlmtmxgs1a + "iVRTrsDl" + "");
    }

    //垃圾方法
    static private void jiYogFwO(boolean wxddplypbq0, float okgbdwaei1, short nbwwcidpdw2, boolean dsaeruazd3, double hzfoskhtm4) {
        double hzfoskhtm4a = hzfoskhtm4;
        boolean dsaeruazd3a = dsaeruazd3;
        short nbwwcidpdw2a = nbwwcidpdw2;
        float okgbdwaei1a = okgbdwaei1;
        boolean wxddplypbq0a = wxddplypbq0;
    }

    //垃圾方法
    static private void WQQBFjii(byte mocehyqkg0, int kgdibgqbjj1, long zbmrkebajn2) {
        long zbmrkebajn2a = zbmrkebajn2;
        int kgdibgqbjj1a = kgdibgqbjj1;
        byte mocehyqkg0a = mocehyqkg0;
        new File("WQQBFjii" + kgdibgqbjj1a + zbmrkebajn2a + mocehyqkg0a + "WQQBFjii" + "");
    }

    //垃圾方法
    static private void djAlkSRW(long vxwngcna0, short ihmbzdn1, short ckxxnqe2, int ncbrhbhdzu3, int qmmjvruh4) {
        int qmmjvruh4a = qmmjvruh4;
        int ncbrhbhdzu3a = ncbrhbhdzu3;
        short ckxxnqe2a = ckxxnqe2;
        short ihmbzdn1a = ihmbzdn1;
        long vxwngcna0a = vxwngcna0;
        new StringBuffer("djAlkSRW" + qmmjvruh4a + ihmbzdn1a + ckxxnqe2a + ncbrhbhdzu3a + vxwngcna0a + "djAlkSRW" + "");
    }

    //垃圾方法
    static private void bRaejhQf(byte aidfnaeijt0, short axtlzyo1, short hynbajntvh2, long urwzyotcc3) {
        long urwzyotcc3a = urwzyotcc3;
        short hynbajntvh2a = hynbajntvh2;
        short axtlzyo1a = axtlzyo1;
        byte aidfnaeijt0a = aidfnaeijt0;
        new StringBuffer("bRaejhQf" + urwzyotcc3a + axtlzyo1a + aidfnaeijt0a + hynbajntvh2a + "bRaejhQf" + "");
    }

    //垃圾方法
    static private void vlLVSCEo(int weigdnwxqg0, byte womginkldm1, byte ftnnoms2, short nxjvtwwafg3, char anygqwx4) {
        char anygqwx4a = anygqwx4;
        short nxjvtwwafg3a = nxjvtwwafg3;
        byte ftnnoms2a = ftnnoms2;
        byte womginkldm1a = womginkldm1;
        int weigdnwxqg0a = weigdnwxqg0;
        new StringBuilder("vlLVSCEo" + weigdnwxqg0a + womginkldm1a + anygqwx4a + ftnnoms2a + nxjvtwwafg3a + "vlLVSCEo" + "");
    }

    //垃圾方法
    static private void LAsDpQQD(long vhxwvlluk0, char bhvoktf1, double qifrktxnfh2, short gnxzhcdt3) {
        short gnxzhcdt3a = gnxzhcdt3;
        double qifrktxnfh2a = qifrktxnfh2;
        char bhvoktf1a = bhvoktf1;
        long vhxwvlluk0a = vhxwvlluk0;
        new String("LAsDpQQD" + gnxzhcdt3a + vhxwvlluk0a + qifrktxnfh2a + bhvoktf1a + "LAsDpQQD" + "");
    }

    public static void saveLastPushTime() {
        short gnxzhcdt3 = 53;
        double qifrktxnfh2 = 2.2;
        char bhvoktf1 = 75;
        long vhxwvlluk0 = 100L;
        char anygqwx4 = 51;
        short nxjvtwwafg3 = 77;
        byte ftnnoms2 = 53;
        byte womginkldm1 = 87;
        int weigdnwxqg0 = 27;
        long urwzyotcc3 = 36L;
        short hynbajntvh2 = 15;
        short axtlzyo1 = 37;
        byte aidfnaeijt0 = 20;
        int qmmjvruh4 = 18;
        int ncbrhbhdzu3 = 77;
        short ckxxnqe2 = 94;
        short ihmbzdn1 = 17;
        long vxwngcna0 = 16L;
        long zbmrkebajn2 = 88L;
        int kgdibgqbjj1 = 41;
        byte mocehyqkg0 = 98;
        double hzfoskhtm4 = 78.78;
        boolean dsaeruazd3 = true;
        short nbwwcidpdw2 = 29;
        float okgbdwaei1 = 20.20f;
        boolean wxddplypbq0 = false;
        int isivpwxp3 = 48;
        float cfrwmvpv2 = 85.85f;
        char dlmtmxgs1 = 6;
        byte ogyruovs0 = 8;
        double ovaegqk0 = 80.80;
        int llxlrkgu2 = 12;
        long yopfyipmx1 = 46L;
        int ykxbrvww0 = 88;
        boolean qbcjtirqhj3 = false;
        double arzslfmxoy2 = 48.48;
        short riclwepdt1 = 2;
        short igjvunfcpf0 = 11;
        double jzczhlokyn4 = 94.94;
        short quxvkxkgb3 = 82;
        double fexmcup2 = 55.55;
        float cloblgm1 = 18.18f;
        short gqrhbsv0 = 18;
        byte iedxvbpi4 = 82;
        boolean memgbskvl3 = false;
        short jpmftiayo2 = 7;
        int iqvilpc1 = 47;
        short qlqpyro0 = 85;
        jiYogFwO(wxddplypbq0, okgbdwaei1, nbwwcidpdw2, dsaeruazd3, hzfoskhtm4);
        gwRSzDGU(gqrhbsv0, cloblgm1, fexmcup2, quxvkxkgb3, jzczhlokyn4);
        OpaahvJb(igjvunfcpf0, riclwepdt1, arzslfmxoy2, qbcjtirqhj3);
        OpaahvJb(igjvunfcpf0, riclwepdt1, arzslfmxoy2, qbcjtirqhj3);
        WQQBFjii(mocehyqkg0, kgdibgqbjj1, zbmrkebajn2);
        djAlkSRW(vxwngcna0, ihmbzdn1, ckxxnqe2, ncbrhbhdzu3, qmmjvruh4);
        jiYogFwO(wxddplypbq0, okgbdwaei1, nbwwcidpdw2, dsaeruazd3, hzfoskhtm4);
        dYeOYWyO(qlqpyro0, iqvilpc1, jpmftiayo2, memgbskvl3, iedxvbpi4);
        LAsDpQQD(vhxwvlluk0, bhvoktf1, qifrktxnfh2, gnxzhcdt3);
        long lastTime = TidySPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && TidyUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = TidySPUtils.getInt("last_show_scene_time_count", 0);
            TidySPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            TidySPUtils.putInt("last_show_scene_time_count", 1);
        }
        gwRSzDGU(gqrhbsv0, cloblgm1, fexmcup2, quxvkxkgb3, jzczhlokyn4);
        iVRTrsDl(ogyruovs0, dlmtmxgs1, cfrwmvpv2, isivpwxp3);
        LAsDpQQD(vhxwvlluk0, bhvoktf1, qifrktxnfh2, gnxzhcdt3);
        vlLVSCEo(weigdnwxqg0, womginkldm1, ftnnoms2, nxjvtwwafg3, anygqwx4);
        LAsDpQQD(vhxwvlluk0, bhvoktf1, qifrktxnfh2, gnxzhcdt3);
        jiYogFwO(wxddplypbq0, okgbdwaei1, nbwwcidpdw2, dsaeruazd3, hzfoskhtm4);
        dYeOYWyO(qlqpyro0, iqvilpc1, jpmftiayo2, memgbskvl3, iedxvbpi4);
        bRaejhQf(aidfnaeijt0, axtlzyo1, hynbajntvh2, urwzyotcc3);
        OpaahvJb(igjvunfcpf0, riclwepdt1, arzslfmxoy2, qbcjtirqhj3);
        TidySPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void XKDmyxKt(long pylwjbn0, char oqxfpgzbcc1, double misyghk2, float sygfczlk3) {
        float sygfczlk3a = sygfczlk3;
        double misyghk2a = misyghk2;
        char oqxfpgzbcc1a = oqxfpgzbcc1;
        long pylwjbn0a = pylwjbn0;
        Log.i("XKDmyxKt", "XKDmyxKt" + oqxfpgzbcc1a + misyghk2a + sygfczlk3a + pylwjbn0a + "XKDmyxKt" + "");
    }

    //垃圾方法
    static private void QRrJhqLu(char mhvmojwyy0, int kgjplsxb1) {
        int kgjplsxb1a = kgjplsxb1;
        char mhvmojwyy0a = mhvmojwyy0;
        new File("QRrJhqLu" + mhvmojwyy0a + kgjplsxb1a + "QRrJhqLu" + "");
    }

    //垃圾方法
    static private void EZvDsnqK(float heptbeox0, char nhektpiaqm1, float bohrihrqo2, boolean palbltcyy3, float gtgilbnmne4) {
        float gtgilbnmne4a = gtgilbnmne4;
        boolean palbltcyy3a = palbltcyy3;
        float bohrihrqo2a = bohrihrqo2;
        char nhektpiaqm1a = nhektpiaqm1;
        float heptbeox0a = heptbeox0;
        new Thread("EZvDsnqK" + heptbeox0a + palbltcyy3a + bohrihrqo2a + nhektpiaqm1a + gtgilbnmne4a + "EZvDsnqK" + "");
    }

    //垃圾方法
    static private void QpauzuIA(int xanjpkryqb0, double vtrkimgr1, float rlzimwxw2, byte xcmapfk3) {
        byte xcmapfk3a = xcmapfk3;
        float rlzimwxw2a = rlzimwxw2;
        double vtrkimgr1a = vtrkimgr1;
        int xanjpkryqb0a = xanjpkryqb0;
        new String("QpauzuIA" + xanjpkryqb0a + xcmapfk3a + vtrkimgr1a + rlzimwxw2a + "QpauzuIA" + "");
    }

    public static long getLastShowPushTime() {
        byte xcmapfk3 = 28;
        float rlzimwxw2 = 69.69f;
        double vtrkimgr1 = 39.39;
        int xanjpkryqb0 = 38;
        float gtgilbnmne4 = 74.74f;
        boolean palbltcyy3 = false;
        float bohrihrqo2 = 18.18f;
        char nhektpiaqm1 = 42;
        float heptbeox0 = 70.70f;
        int kgjplsxb1 = 96;
        char mhvmojwyy0 = 95;
        float sygfczlk3 = 13.13f;
        double misyghk2 = 60.60;
        char oqxfpgzbcc1 = 8;
        long pylwjbn0 = 37L;
        return TidySPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void FsFgykaB(double wutwrdw0) {
        double wutwrdw0a = wutwrdw0;
        Log.e("FsFgykaB", "FsFgykaB" + wutwrdw0a + "FsFgykaB" + LdYcfZI + zQKbTdF + UxqrFca + LvWMFMP + KExGQjy + XPYKqgx + sJxRfKT + RzBmSld + rmeWkyk + VgZlEqG + DYRdvJu + lGDhzLK + rdIrsFc + qJdECWn + JbIeUNa + NlQBAdy + EMpXZck + jAGllnA + "");
    }

    //垃圾方法
    private void WaAABsiE(int vecaduuc0, char fhulyqmm1) {
        char fhulyqmm1a = fhulyqmm1;
        int vecaduuc0a = vecaduuc0;
        new WeakReference("WaAABsiE" + fhulyqmm1a + vecaduuc0a + "WaAABsiE" + NlQBAdy + KExGQjy + RzBmSld + zQKbTdF + rmeWkyk + jAGllnA + DYRdvJu + VgZlEqG + UxqrFca + LdYcfZI + LvWMFMP + XPYKqgx + lGDhzLK + JbIeUNa + qJdECWn + sJxRfKT + EMpXZck + rdIrsFc + "");
    }

    //垃圾方法
    private void bqivHkRN(double kworuba0) {
        double kworuba0a = kworuba0;
        new Intent("bqivHkRN" + kworuba0a + "bqivHkRN" + RzBmSld + jAGllnA + XPYKqgx + qJdECWn + rdIrsFc + DYRdvJu + JbIeUNa + UxqrFca + rmeWkyk + zQKbTdF + LdYcfZI + VgZlEqG + lGDhzLK + LvWMFMP + EMpXZck + KExGQjy + sJxRfKT + NlQBAdy + "");
    }

    //垃圾方法
    private void wryzaNyD(short hjbuyrdofb0, char sensxlnmih1, short twujzgj2, float xzhuodwvh3) {
        float xzhuodwvh3a = xzhuodwvh3;
        short twujzgj2a = twujzgj2;
        char sensxlnmih1a = sensxlnmih1;
        short hjbuyrdofb0a = hjbuyrdofb0;
        new File("wryzaNyD" + sensxlnmih1a + xzhuodwvh3a + twujzgj2a + hjbuyrdofb0a + "wryzaNyD" + rdIrsFc + RzBmSld + qJdECWn + LdYcfZI + jAGllnA + KExGQjy + DYRdvJu + XPYKqgx + JbIeUNa + EMpXZck + rmeWkyk + NlQBAdy + LvWMFMP + VgZlEqG + lGDhzLK + UxqrFca + zQKbTdF + sJxRfKT + "");
    }

    @Nullable
    public final Activity getCurrActivity() {
        float xzhuodwvh3 = 80.80f;
        short twujzgj2 = 44;
        char sensxlnmih1 = 86;
        short hjbuyrdofb0 = 47;
        double kworuba0 = 21.21;
        char fhulyqmm1 = 76;
        int vecaduuc0 = 90;
        double wutwrdw0 = 95.95;
        WaAABsiE(vecaduuc0, fhulyqmm1);
        wryzaNyD(hjbuyrdofb0, sensxlnmih1, twujzgj2, xzhuodwvh3);
        FsFgykaB(wutwrdw0);
        WaAABsiE(vecaduuc0, fhulyqmm1);
        wryzaNyD(hjbuyrdofb0, sensxlnmih1, twujzgj2, xzhuodwvh3);
        WaAABsiE(vecaduuc0, fhulyqmm1);
        wryzaNyD(hjbuyrdofb0, sensxlnmih1, twujzgj2, xzhuodwvh3);
        bqivHkRN(kworuba0);
        WaAABsiE(vecaduuc0, fhulyqmm1);
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void eKgKaDfU(double efdwfiauga0, short dbwjfxr1, boolean yximhdcpql2) {
        boolean yximhdcpql2a = yximhdcpql2;
        short dbwjfxr1a = dbwjfxr1;
        double efdwfiauga0a = efdwfiauga0;
        Log.e("eKgKaDfU", "eKgKaDfU" + dbwjfxr1a + efdwfiauga0a + yximhdcpql2a + "eKgKaDfU" + zQKbTdF + DYRdvJu + sJxRfKT + rdIrsFc + XPYKqgx + qJdECWn + UxqrFca + jAGllnA + VgZlEqG + LdYcfZI + KExGQjy + EMpXZck + rmeWkyk + JbIeUNa + LvWMFMP + NlQBAdy + lGDhzLK + RzBmSld + "");
    }

    //垃圾方法
    private void lAnXMalv(boolean snehzjkek0) {
        boolean snehzjkek0a = snehzjkek0;
        new AttributedString("lAnXMalv" + snehzjkek0a + "lAnXMalv" + EMpXZck + UxqrFca + zQKbTdF + rmeWkyk + LvWMFMP + VgZlEqG + jAGllnA + sJxRfKT + rdIrsFc + DYRdvJu + KExGQjy + JbIeUNa + lGDhzLK + RzBmSld + XPYKqgx + LdYcfZI + NlQBAdy + qJdECWn + "");
    }

    //垃圾方法
    private void QBoPpvOu(short vclatsjn0) {
        short vclatsjn0a = vclatsjn0;
        new Intent("QBoPpvOu" + vclatsjn0a + "QBoPpvOu" + UxqrFca + XPYKqgx + LdYcfZI + NlQBAdy + jAGllnA + KExGQjy + rdIrsFc + EMpXZck + JbIeUNa + qJdECWn + LvWMFMP + zQKbTdF + VgZlEqG + lGDhzLK + RzBmSld + rmeWkyk + sJxRfKT + DYRdvJu + "");
    }

    //垃圾方法
    private void wikAwbaV(float upqyfrzb0, float pxctskijni1, boolean amuyscbj2, boolean ugvpxfp3) {
        boolean ugvpxfp3a = ugvpxfp3;
        boolean amuyscbj2a = amuyscbj2;
        float pxctskijni1a = pxctskijni1;
        float upqyfrzb0a = upqyfrzb0;
        TextUtils.isDigitsOnly("wikAwbaV" + ugvpxfp3a + amuyscbj2a + pxctskijni1a + upqyfrzb0a + "wikAwbaV" + JbIeUNa + sJxRfKT + VgZlEqG + zQKbTdF + XPYKqgx + KExGQjy + rdIrsFc + EMpXZck + qJdECWn + NlQBAdy + DYRdvJu + UxqrFca + jAGllnA + RzBmSld + LdYcfZI + lGDhzLK + rmeWkyk + LvWMFMP + "");
    }

    //垃圾方法
    private void TsqNkgWZ(double redhhlw0, long qswesbxi1) {
        long qswesbxi1a = qswesbxi1;
        double redhhlw0a = redhhlw0;
        new StringBuilder("TsqNkgWZ" + qswesbxi1a + redhhlw0a + "TsqNkgWZ" + XPYKqgx + NlQBAdy + rdIrsFc + RzBmSld + DYRdvJu + LvWMFMP + sJxRfKT + rmeWkyk + UxqrFca + jAGllnA + JbIeUNa + zQKbTdF + lGDhzLK + EMpXZck + qJdECWn + VgZlEqG + LdYcfZI + KExGQjy + "");
    }

    //垃圾方法
    private void lfoljtbJ(long ksbvoksai0) {
        long ksbvoksai0a = ksbvoksai0;
        new Intent("lfoljtbJ" + ksbvoksai0a + "lfoljtbJ" + UxqrFca + XPYKqgx + jAGllnA + NlQBAdy + zQKbTdF + rdIrsFc + sJxRfKT + lGDhzLK + qJdECWn + LdYcfZI + rmeWkyk + VgZlEqG + LvWMFMP + KExGQjy + DYRdvJu + RzBmSld + JbIeUNa + EMpXZck + "");
    }

    //垃圾方法
    private void NsWBVhmi(boolean xmcylaln0) {
        boolean xmcylaln0a = xmcylaln0;
        new AttributedString("NsWBVhmi" + xmcylaln0a + "NsWBVhmi" + rdIrsFc + sJxRfKT + lGDhzLK + LvWMFMP + qJdECWn + XPYKqgx + zQKbTdF + DYRdvJu + UxqrFca + KExGQjy + EMpXZck + JbIeUNa + rmeWkyk + VgZlEqG + NlQBAdy + LdYcfZI + RzBmSld + jAGllnA + "");
    }

    //垃圾方法
    private void hKgvxynZ(short equgpzzi0, int gqtcilr1, short xixrrxazo2) {
        short xixrrxazo2a = xixrrxazo2;
        int gqtcilr1a = gqtcilr1;
        short equgpzzi0a = equgpzzi0;
        new WeakReference("hKgvxynZ" + gqtcilr1a + equgpzzi0a + xixrrxazo2a + "hKgvxynZ" + jAGllnA + lGDhzLK + qJdECWn + rdIrsFc + KExGQjy + rmeWkyk + zQKbTdF + DYRdvJu + EMpXZck + LvWMFMP + UxqrFca + LdYcfZI + RzBmSld + NlQBAdy + VgZlEqG + XPYKqgx + sJxRfKT + JbIeUNa + "");
    }

    public final void killAllActivity() {
        short xixrrxazo2 = 13;
        int gqtcilr1 = 87;
        short equgpzzi0 = 42;
        boolean xmcylaln0 = true;
        long ksbvoksai0 = 67L;
        long qswesbxi1 = 79L;
        double redhhlw0 = 14.14;
        boolean ugvpxfp3 = true;
        boolean amuyscbj2 = false;
        float pxctskijni1 = 44.44f;
        float upqyfrzb0 = 8.8f;
        short vclatsjn0 = 5;
        boolean snehzjkek0 = false;
        boolean yximhdcpql2 = false;
        short dbwjfxr1 = 74;
        double efdwfiauga0 = 91.91;
        lAnXMalv(snehzjkek0);
        hKgvxynZ(equgpzzi0, gqtcilr1, xixrrxazo2);
        lfoljtbJ(ksbvoksai0);
        wikAwbaV(upqyfrzb0, pxctskijni1, amuyscbj2, ugvpxfp3);
        Iterator<Activity> var3 = livingActivities.iterator();
        wikAwbaV(upqyfrzb0, pxctskijni1, amuyscbj2, ugvpxfp3);
        wikAwbaV(upqyfrzb0, pxctskijni1, amuyscbj2, ugvpxfp3);
        hKgvxynZ(equgpzzi0, gqtcilr1, xixrrxazo2);
        lAnXMalv(snehzjkek0);
        QBoPpvOu(vclatsjn0);
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private TidyManager() {
    }

    //垃圾方法
    static private void TrwpurRX(double qcawvvb0) {
        double qcawvvb0a = qcawvvb0;
    }

    //垃圾方法
    static private void DKHvaUGy(char xiecvai0, short knexfbeiqx1, short mohqiuagr2) {
        short mohqiuagr2a = mohqiuagr2;
        short knexfbeiqx1a = knexfbeiqx1;
        char xiecvai0a = xiecvai0;
        TextUtils.isDigitsOnly("DKHvaUGy" + knexfbeiqx1a + mohqiuagr2a + xiecvai0a + "DKHvaUGy" + "");
    }

    //垃圾方法
    static private void LExVkYpI(long vqerioqbdj0, double wneakavo1, int lgtxzud2) {
        int lgtxzud2a = lgtxzud2;
        double wneakavo1a = wneakavo1;
        long vqerioqbdj0a = vqerioqbdj0;
        new StringBuilder("LExVkYpI" + vqerioqbdj0a + wneakavo1a + lgtxzud2a + "LExVkYpI" + "");
    }

    //垃圾方法
    static private void UDTGixvC(short zfhwguba0) {
        short zfhwguba0a = zfhwguba0;
        Log.i("UDTGixvC", "UDTGixvC" + zfhwguba0a + "UDTGixvC" + "");
    }

    public static boolean isNotificationEnabled() {
        short zfhwguba0 = 97;
        int lgtxzud2 = 43;
        double wneakavo1 = 81.81;
        long vqerioqbdj0 = 53L;
        short mohqiuagr2 = 88;
        short knexfbeiqx1 = 52;
        char xiecvai0 = 72;
        double qcawvvb0 = 31.31;
        return TidyNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void nRYauGCx(int tbpbyjk0, boolean hbnehxaf1, long sooxwgfl2, int cyosvflk3) {
        int cyosvflk3a = cyosvflk3;
        long sooxwgfl2a = sooxwgfl2;
        boolean hbnehxaf1a = hbnehxaf1;
        int tbpbyjk0a = tbpbyjk0;
        TextUtils.isEmpty("nRYauGCx" + hbnehxaf1a + cyosvflk3a + sooxwgfl2a + tbpbyjk0a + "nRYauGCx" + "");
    }

    //垃圾方法
    static private void aAXWrzPl(short pcuemvven0, boolean zvgagmkpl1) {
        boolean zvgagmkpl1a = zvgagmkpl1;
        short pcuemvven0a = pcuemvven0;
        Log.e("aAXWrzPl", "aAXWrzPl" + zvgagmkpl1a + pcuemvven0a + "aAXWrzPl" + "");
    }

    //垃圾方法
    static private void rAvzWENa(float xgzkhruyn0) {
        float xgzkhruyn0a = xgzkhruyn0;
        System.out.println("rAvzWENa" + xgzkhruyn0a + "rAvzWENa" + "");
    }

    //垃圾方法
    static private void enHtqVLh(float ubpqnjbx0, float zkfkijqdhz1) {
        float zkfkijqdhz1a = zkfkijqdhz1;
        float ubpqnjbx0a = ubpqnjbx0;
        System.out.println("enHtqVLh" + ubpqnjbx0a + zkfkijqdhz1a + "enHtqVLh" + "");
    }

    //垃圾方法
    static private void fqNonPRr(char efvckozwyi0, int hxrfekb1, int ldrsnudf2) {
        int ldrsnudf2a = ldrsnudf2;
        int hxrfekb1a = hxrfekb1;
        char efvckozwyi0a = efvckozwyi0;
        TextUtils.isEmpty("fqNonPRr" + hxrfekb1a + ldrsnudf2a + efvckozwyi0a + "fqNonPRr" + "");
    }

    //垃圾方法
    static private void zqHUGUgo(double peniwesowb0, long gsnrqazfvo1, byte yaurptit2, byte jknombz3) {
        byte jknombz3a = jknombz3;
        byte yaurptit2a = yaurptit2;
        long gsnrqazfvo1a = gsnrqazfvo1;
        double peniwesowb0a = peniwesowb0;
        new Thread("zqHUGUgo" + peniwesowb0a + jknombz3a + yaurptit2a + gsnrqazfvo1a + "zqHUGUgo" + "");
    }

    //垃圾方法
    static private void MkSGVcQB(int ynjkoqccs0, boolean yqiygvel1, byte ktpkqfmren2, boolean xmlrgrkqqv3, short iqgxobo4) {
        short iqgxobo4a = iqgxobo4;
        boolean xmlrgrkqqv3a = xmlrgrkqqv3;
        byte ktpkqfmren2a = ktpkqfmren2;
        boolean yqiygvel1a = yqiygvel1;
        int ynjkoqccs0a = ynjkoqccs0;
        System.out.println("MkSGVcQB" + ktpkqfmren2a + xmlrgrkqqv3a + iqgxobo4a + yqiygvel1a + ynjkoqccs0a + "MkSGVcQB" + "");
    }

    //垃圾方法
    static private void kdylGkbC(byte zakdtmpk0) {
        byte zakdtmpk0a = zakdtmpk0;
        new AttributedString("kdylGkbC" + zakdtmpk0a + "kdylGkbC" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        byte zakdtmpk0 = 24;
        short iqgxobo4 = 100;
        boolean xmlrgrkqqv3 = false;
        byte ktpkqfmren2 = 21;
        boolean yqiygvel1 = false;
        int ynjkoqccs0 = 0;
        byte jknombz3 = 59;
        byte yaurptit2 = 32;
        long gsnrqazfvo1 = 13L;
        double peniwesowb0 = 74.74;
        int ldrsnudf2 = 51;
        int hxrfekb1 = 59;
        char efvckozwyi0 = 43;
        float zkfkijqdhz1 = 18.18f;
        float ubpqnjbx0 = 85.85f;
        float xgzkhruyn0 = 72.72f;
        boolean zvgagmkpl1 = false;
        short pcuemvven0 = 11;
        int cyosvflk3 = 62;
        long sooxwgfl2 = 28L;
        boolean hbnehxaf1 = false;
        int tbpbyjk0 = 6;
        zqHUGUgo(peniwesowb0, gsnrqazfvo1, yaurptit2, jknombz3);
        kdylGkbC(zakdtmpk0);
        nRYauGCx(tbpbyjk0, hbnehxaf1, sooxwgfl2, cyosvflk3);
        kdylGkbC(zakdtmpk0);
        enHtqVLh(ubpqnjbx0, zkfkijqdhz1);
        rAvzWENa(xgzkhruyn0);
        zqHUGUgo(peniwesowb0, gsnrqazfvo1, yaurptit2, jknombz3);
        if (VERSION.SDK_INT >= 28) {
            enHtqVLh(ubpqnjbx0, zkfkijqdhz1);
            nRYauGCx(tbpbyjk0, hbnehxaf1, sooxwgfl2, cyosvflk3);
            fqNonPRr(efvckozwyi0, hxrfekb1, ldrsnudf2);
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
    static private void PwBZltmM(float ihwemejke0, int yacxzek1, float dmvkitnyrx2, char vzivptglwy3, double vdbttfo4) {
        double vdbttfo4a = vdbttfo4;
        char vzivptglwy3a = vzivptglwy3;
        float dmvkitnyrx2a = dmvkitnyrx2;
        int yacxzek1a = yacxzek1;
        float ihwemejke0a = ihwemejke0;
        new AttributedString("PwBZltmM" + vzivptglwy3a + vdbttfo4a + yacxzek1a + dmvkitnyrx2a + ihwemejke0a + "PwBZltmM" + "");
    }

    //垃圾方法
    static private void zyOsUBjK(boolean cjzfuozps0, int vbvocym1, int zsvmkeajjw2, float ektyhuh3, byte rbtjpbdb4) {
        byte rbtjpbdb4a = rbtjpbdb4;
        float ektyhuh3a = ektyhuh3;
        int zsvmkeajjw2a = zsvmkeajjw2;
        int vbvocym1a = vbvocym1;
        boolean cjzfuozps0a = cjzfuozps0;
        System.out.println("zyOsUBjK" + vbvocym1a + ektyhuh3a + rbtjpbdb4a + cjzfuozps0a + zsvmkeajjw2a + "zyOsUBjK" + "");
    }

    //垃圾方法
    static private void otBQMfZU(boolean piqoydzgf0, int zrklnbu1, float yejtjpevw2, byte abquzeg3, int ztqhamdx4) {
        int ztqhamdx4a = ztqhamdx4;
        byte abquzeg3a = abquzeg3;
        float yejtjpevw2a = yejtjpevw2;
        int zrklnbu1a = zrklnbu1;
        boolean piqoydzgf0a = piqoydzgf0;
        Log.i("otBQMfZU", "otBQMfZU" + yejtjpevw2a + abquzeg3a + ztqhamdx4a + piqoydzgf0a + zrklnbu1a + "otBQMfZU" + "");
    }

    //垃圾方法
    static private void GirvccSP(char nokvrdaq0, short eloszwe1, double rqxlcwwajf2, double vlmztexy3, int caayaghtq4) {
        int caayaghtq4a = caayaghtq4;
        double vlmztexy3a = vlmztexy3;
        double rqxlcwwajf2a = rqxlcwwajf2;
        short eloszwe1a = eloszwe1;
        char nokvrdaq0a = nokvrdaq0;
        new StringReader("GirvccSP" + caayaghtq4a + vlmztexy3a + rqxlcwwajf2a + eloszwe1a + nokvrdaq0a + "GirvccSP" + "");
    }

    public static void testFcmToken(String token) {
        int caayaghtq4 = 30;
        double vlmztexy3 = 13.13;
        double rqxlcwwajf2 = 5.5;
        short eloszwe1 = 51;
        char nokvrdaq0 = 80;
        int ztqhamdx4 = 99;
        byte abquzeg3 = 69;
        float yejtjpevw2 = 99.99f;
        int zrklnbu1 = 27;
        boolean piqoydzgf0 = false;
        byte rbtjpbdb4 = 56;
        float ektyhuh3 = 73.73f;
        int zsvmkeajjw2 = 5;
        int vbvocym1 = 45;
        boolean cjzfuozps0 = false;
        double vdbttfo4 = 50.50;
        char vzivptglwy3 = 6;
        float dmvkitnyrx2 = 38.38f;
        int yacxzek1 = 20;
        float ihwemejke0 = 83.83f;
        TidyMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void zQZeoAtz(long vodahgysur0, float mnkxrgtogz1, byte yziytaf2) {
            byte yziytaf2a = yziytaf2;
            float mnkxrgtogz1a = mnkxrgtogz1;
            long vodahgysur0a = vodahgysur0;
        }

        //垃圾方法
        private void WQLFaSqw(short ylaecyzwwm0, boolean lvntecwj1, char ixdwpxtq2, float vcwbqao3, boolean fwvkizrup4) {
            boolean fwvkizrup4a = fwvkizrup4;
            float vcwbqao3a = vcwbqao3;
            char ixdwpxtq2a = ixdwpxtq2;
            boolean lvntecwj1a = lvntecwj1;
            short ylaecyzwwm0a = ylaecyzwwm0;
            TextUtils.isEmpty("WQLFaSqw" + vcwbqao3a + ylaecyzwwm0a + fwvkizrup4a + ixdwpxtq2a + lvntecwj1a + "WQLFaSqw" + "" + "");
        }

        //垃圾方法
        private void rbZrvrrr(short ilkxyywo0, char yzyfuxy1, short xafacvbxv2) {
            short xafacvbxv2a = xafacvbxv2;
            char yzyfuxy1a = yzyfuxy1;
            short ilkxyywo0a = ilkxyywo0;
            Log.e("rbZrvrrr", "rbZrvrrr" + yzyfuxy1a + ilkxyywo0a + xafacvbxv2a + "rbZrvrrr" + "" + "");
        }

        //垃圾方法
        private void lJRstJwH(int mchhtrm0, float hlhaxayi1) {
            float hlhaxayi1a = hlhaxayi1;
            int mchhtrm0a = mchhtrm0;
            new StringReader("lJRstJwH" + mchhtrm0a + hlhaxayi1a + "lJRstJwH" + "" + "");
        }

        //垃圾方法
        private void jVTxQWOE(boolean dsrejges0) {
            boolean dsrejges0a = dsrejges0;
            new Intent("jVTxQWOE" + dsrejges0a + "jVTxQWOE" + "" + "");
        }

        //垃圾方法
        private void JDWywfQe(short csvqdnfx0) {
            short csvqdnfx0a = csvqdnfx0;
            Log.e("JDWywfQe", "JDWywfQe" + csvqdnfx0a + "JDWywfQe" + "" + "");
        }

        //垃圾方法
        private void WZWrZKEa(short xcptzhsiy0, float wdeiziekug1) {
            float wdeiziekug1a = wdeiziekug1;
            short xcptzhsiy0a = xcptzhsiy0;
            new File("WZWrZKEa" + xcptzhsiy0a + wdeiziekug1a + "WZWrZKEa" + "" + "");
        }

        //垃圾方法
        private void YguGcNRs(double lnkwgmbiq0, long wonbjnhwh1, double ktowmuvoj2, short yszgckpv3, short hspuqnc4) {
            short hspuqnc4a = hspuqnc4;
            short yszgckpv3a = yszgckpv3;
            double ktowmuvoj2a = ktowmuvoj2;
            long wonbjnhwh1a = wonbjnhwh1;
            double lnkwgmbiq0a = lnkwgmbiq0;
            new StringBuffer("YguGcNRs" + lnkwgmbiq0a + hspuqnc4a + yszgckpv3a + wonbjnhwh1a + ktowmuvoj2a + "YguGcNRs" + "" + "");
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            short hspuqnc4 = 55;
            short yszgckpv3 = 8;
            double ktowmuvoj2 = 20.20;
            long wonbjnhwh1 = 67L;
            double lnkwgmbiq0 = 62.62;
            float wdeiziekug1 = 28.28f;
            short xcptzhsiy0 = 20;
            short csvqdnfx0 = 68;
            boolean dsrejges0 = true;
            float hlhaxayi1 = 66.66f;
            int mchhtrm0 = 80;
            short xafacvbxv2 = 7;
            char yzyfuxy1 = 92;
            short ilkxyywo0 = 35;
            boolean fwvkizrup4 = true;
            float vcwbqao3 = 25.25f;
            char ixdwpxtq2 = 25;
            boolean lvntecwj1 = true;
            short ylaecyzwwm0 = 34;
            byte yziytaf2 = 3;
            float mnkxrgtogz1 = 37.37f;
            long vodahgysur0 = 70L;
            JDWywfQe(csvqdnfx0);
            lJRstJwH(mchhtrm0, hlhaxayi1);
            jVTxQWOE(dsrejges0);
            WZWrZKEa(xcptzhsiy0, wdeiziekug1);
            WZWrZKEa(xcptzhsiy0, wdeiziekug1);
            JDWywfQe(csvqdnfx0);
            TidySPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void PjkufHyI(float mijpkeyrh0) {
            float mijpkeyrh0a = mijpkeyrh0;
            new String("PjkufHyI" + mijpkeyrh0a + "PjkufHyI" + "" + "");
        }

        //垃圾方法
        private void TeSwHpJa(long skhlcbv0) {
            long skhlcbv0a = skhlcbv0;
            new StringBuilder("TeSwHpJa" + skhlcbv0a + "TeSwHpJa" + "" + "");
        }

        //垃圾方法
        private void wfCuWNBu(byte owvinmyzu0, float wpfbiuwj1, long jgaoorvd2, boolean qpuiijsfqk3, short ynaydnl4) {
            short ynaydnl4a = ynaydnl4;
            boolean qpuiijsfqk3a = qpuiijsfqk3;
            long jgaoorvd2a = jgaoorvd2;
            float wpfbiuwj1a = wpfbiuwj1;
            byte owvinmyzu0a = owvinmyzu0;
            new AttributedString("wfCuWNBu" + wpfbiuwj1a + jgaoorvd2a + ynaydnl4a + owvinmyzu0a + qpuiijsfqk3a + "wfCuWNBu" + "" + "");
        }

        //垃圾方法
        private void ryKgPXSz(char qshvupdanp0, int vlbsacom1, char ubtcazvpk2, byte ksbcfsjn3, float mteetdvm4) {
            float mteetdvm4a = mteetdvm4;
            byte ksbcfsjn3a = ksbcfsjn3;
            char ubtcazvpk2a = ubtcazvpk2;
            int vlbsacom1a = vlbsacom1;
            char qshvupdanp0a = qshvupdanp0;
            Log.i("ryKgPXSz", "ryKgPXSz" + vlbsacom1a + qshvupdanp0a + ubtcazvpk2a + ksbcfsjn3a + mteetdvm4a + "ryKgPXSz" + "" + "");
        }

        //垃圾方法
        private void KXlnjRWy(boolean eqmbbdy0, char hidcvjo1, double wsxhshto2, char lgathhys3, float pnujcrobs4) {
            float pnujcrobs4a = pnujcrobs4;
            char lgathhys3a = lgathhys3;
            double wsxhshto2a = wsxhshto2;
            char hidcvjo1a = hidcvjo1;
            boolean eqmbbdy0a = eqmbbdy0;
            TextUtils.isEmpty("KXlnjRWy" + hidcvjo1a + lgathhys3a + eqmbbdy0a + wsxhshto2a + pnujcrobs4a + "KXlnjRWy" + "" + "");
        }

        //垃圾方法
        private void EtryNCFe(char jaynqmsbn0, long xlxsyav1, char pjubafsepd2) {
            char pjubafsepd2a = pjubafsepd2;
            long xlxsyav1a = xlxsyav1;
            char jaynqmsbn0a = jaynqmsbn0;
            Log.e("EtryNCFe", "EtryNCFe" + pjubafsepd2a + jaynqmsbn0a + xlxsyav1a + "EtryNCFe" + "" + "");
        }

        //垃圾方法
        private void heaxIMTG(int vvaqqhsu0, double giyzmjcmu1, boolean grqnmldz2) {
            boolean grqnmldz2a = grqnmldz2;
            double giyzmjcmu1a = giyzmjcmu1;
            int vvaqqhsu0a = vvaqqhsu0;
            TextUtils.isDigitsOnly("heaxIMTG" + vvaqqhsu0a + grqnmldz2a + giyzmjcmu1a + "heaxIMTG" + "" + "");
        }

        //垃圾方法
        private void UvGfavbo(short bkwxcjjjuc0, char eoiboupffj1, int mihayyux2) {
            int mihayyux2a = mihayyux2;
            char eoiboupffj1a = eoiboupffj1;
            short bkwxcjjjuc0a = bkwxcjjjuc0;
            TextUtils.isEmpty("UvGfavbo" + mihayyux2a + bkwxcjjjuc0a + eoiboupffj1a + "UvGfavbo" + "" + "");
        }

        //垃圾方法
        private void UQWlmdIW(short nglojng0, char rvedkwn1) {
            char rvedkwn1a = rvedkwn1;
            short nglojng0a = nglojng0;
            new StringBuffer("UQWlmdIW" + nglojng0a + rvedkwn1a + "UQWlmdIW" + "" + "");
        }

        //垃圾方法
        private void MvHaNwoE(short iurgcvz0) {
            short iurgcvz0a = iurgcvz0;
            new StringReader("MvHaNwoE" + iurgcvz0a + "MvHaNwoE" + "" + "");
        }

        //垃圾方法
        private void LKNSBgkx(char uaxtwchfo0, int dylflwua1, char ldahwhzqhb2) {
            char ldahwhzqhb2a = ldahwhzqhb2;
            int dylflwua1a = dylflwua1;
            char uaxtwchfo0a = uaxtwchfo0;
            new File("LKNSBgkx" + ldahwhzqhb2a + uaxtwchfo0a + dylflwua1a + "LKNSBgkx" + "" + "");
        }

        //垃圾方法
        private void uwrFVsNT(long tvyhszgxa0, int snnblkw1) {
            int snnblkw1a = snnblkw1;
            long tvyhszgxa0a = tvyhszgxa0;
            new WeakReference("uwrFVsNT" + snnblkw1a + tvyhszgxa0a + "uwrFVsNT" + "" + "");
        }

        //垃圾方法
        private void yYQsdbaT(char ttvmmbnovs0, int nrpslya1, char njpdvaugz2, short ozsbfseog3) {
            short ozsbfseog3a = ozsbfseog3;
            char njpdvaugz2a = njpdvaugz2;
            int nrpslya1a = nrpslya1;
            char ttvmmbnovs0a = ttvmmbnovs0;
            new File("yYQsdbaT" + ozsbfseog3a + nrpslya1a + ttvmmbnovs0a + njpdvaugz2a + "yYQsdbaT" + "" + "");
        }

        //垃圾方法
        private void jpZCUUnF(float thtgbajg0, short jkmebti1, byte cmdplesv2) {
            byte cmdplesv2a = cmdplesv2;
            short jkmebti1a = jkmebti1;
            float thtgbajg0a = thtgbajg0;
            TextUtils.isEmpty("jpZCUUnF" + thtgbajg0a + jkmebti1a + cmdplesv2a + "jpZCUUnF" + "" + "");
        }

        //垃圾方法
        private void JuhVvdNJ(float rkbbonnw0) {
            float rkbbonnw0a = rkbbonnw0;
            new StringBuffer("JuhVvdNJ" + rkbbonnw0a + "JuhVvdNJ" + "" + "");
        }

        //垃圾方法
        private void GYzAPPcb(double ckddtqwefa0, float xwyfcafrs1, int rvbifzx2, double geamqdsyz3, byte kdmexduvv4) {
            byte kdmexduvv4a = kdmexduvv4;
            double geamqdsyz3a = geamqdsyz3;
            int rvbifzx2a = rvbifzx2;
            float xwyfcafrs1a = xwyfcafrs1;
            double ckddtqwefa0a = ckddtqwefa0;
            TextUtils.isEmpty("GYzAPPcb" + ckddtqwefa0a + rvbifzx2a + xwyfcafrs1a + kdmexduvv4a + geamqdsyz3a + "GYzAPPcb" + "" + "");
        }

        //垃圾方法
        private void GkCjeBUq(long acxjnob0, boolean jiwscvymx1, double cklcothzqa2, char otcynzkspm3, char jdekvnzg4) {
            char jdekvnzg4a = jdekvnzg4;
            char otcynzkspm3a = otcynzkspm3;
            double cklcothzqa2a = cklcothzqa2;
            boolean jiwscvymx1a = jiwscvymx1;
            long acxjnob0a = acxjnob0;
            Log.w("GkCjeBUq", "GkCjeBUq" + jiwscvymx1a + otcynzkspm3a + cklcothzqa2a + acxjnob0a + jdekvnzg4a + "GkCjeBUq" + "" + "");
        }

        //垃圾方法
        private void VGdVroZF(int qnamkrdzh0, short ywxcyaa1) {
            short ywxcyaa1a = ywxcyaa1;
            int qnamkrdzh0a = qnamkrdzh0;
            new StringReader("VGdVroZF" + qnamkrdzh0a + ywxcyaa1a + "VGdVroZF" + "" + "");
        }

        //垃圾方法
        private void ZQlEkdEN(short sfjfvpnqmz0, double dlcwcnwe1, double xkqtwfmkl2) {
            double xkqtwfmkl2a = xkqtwfmkl2;
            double dlcwcnwe1a = dlcwcnwe1;
            short sfjfvpnqmz0a = sfjfvpnqmz0;
            Log.e("ZQlEkdEN", "ZQlEkdEN" + sfjfvpnqmz0a + xkqtwfmkl2a + dlcwcnwe1a + "ZQlEkdEN" + "" + "");
        }

        //垃圾方法
        private void QVWdbMbn(int adiiixe0, char ivwsainz1) {
            char ivwsainz1a = ivwsainz1;
            int adiiixe0a = adiiixe0;
            Log.e("QVWdbMbn", "QVWdbMbn" + ivwsainz1a + adiiixe0a + "QVWdbMbn" + "" + "");
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            char ivwsainz1 = 97;
            int adiiixe0 = 96;
            double xkqtwfmkl2 = 61.61;
            double dlcwcnwe1 = 33.33;
            short sfjfvpnqmz0 = 42;
            short ywxcyaa1 = 58;
            int qnamkrdzh0 = 69;
            char jdekvnzg4 = 12;
            char otcynzkspm3 = 0;
            double cklcothzqa2 = 9.9;
            boolean jiwscvymx1 = true;
            long acxjnob0 = 24L;
            byte kdmexduvv4 = 26;
            double geamqdsyz3 = 10.10;
            int rvbifzx2 = 63;
            float xwyfcafrs1 = 80.80f;
            double ckddtqwefa0 = 66.66;
            float rkbbonnw0 = 56.56f;
            byte cmdplesv2 = 53;
            short jkmebti1 = 8;
            float thtgbajg0 = 58.58f;
            short ozsbfseog3 = 6;
            char njpdvaugz2 = 77;
            int nrpslya1 = 8;
            char ttvmmbnovs0 = 11;
            int snnblkw1 = 85;
            long tvyhszgxa0 = 1L;
            char ldahwhzqhb2 = 42;
            int dylflwua1 = 40;
            char uaxtwchfo0 = 33;
            short iurgcvz0 = 69;
            char rvedkwn1 = 29;
            short nglojng0 = 100;
            int mihayyux2 = 28;
            char eoiboupffj1 = 10;
            short bkwxcjjjuc0 = 98;
            boolean grqnmldz2 = false;
            double giyzmjcmu1 = 71.71;
            int vvaqqhsu0 = 15;
            char pjubafsepd2 = 26;
            long xlxsyav1 = 3L;
            char jaynqmsbn0 = 47;
            float pnujcrobs4 = 77.77f;
            char lgathhys3 = 60;
            double wsxhshto2 = 82.82;
            char hidcvjo1 = 0;
            boolean eqmbbdy0 = false;
            float mteetdvm4 = 73.73f;
            byte ksbcfsjn3 = 17;
            char ubtcazvpk2 = 94;
            int vlbsacom1 = 94;
            char qshvupdanp0 = 20;
            short ynaydnl4 = 17;
            boolean qpuiijsfqk3 = false;
            long jgaoorvd2 = 87L;
            float wpfbiuwj1 = 79.79f;
            byte owvinmyzu0 = 10;
            long skhlcbv0 = 49L;
            float mijpkeyrh0 = 44.44f;
            LKNSBgkx(uaxtwchfo0, dylflwua1, ldahwhzqhb2);
            LKNSBgkx(uaxtwchfo0, dylflwua1, ldahwhzqhb2);
            wfCuWNBu(owvinmyzu0, wpfbiuwj1, jgaoorvd2, qpuiijsfqk3, ynaydnl4);
            jpZCUUnF(thtgbajg0, jkmebti1, cmdplesv2);
            EtryNCFe(jaynqmsbn0, xlxsyav1, pjubafsepd2);
            TeSwHpJa(skhlcbv0);
            VGdVroZF(qnamkrdzh0, ywxcyaa1);
            yYQsdbaT(ttvmmbnovs0, nrpslya1, njpdvaugz2, ozsbfseog3);
            KXlnjRWy(eqmbbdy0, hidcvjo1, wsxhshto2, lgathhys3, pnujcrobs4);
            jpZCUUnF(thtgbajg0, jkmebti1, cmdplesv2);
            TidySPUtils.putLong("lastActivityOnPause", 0L);
            TidyManager.INSTANCE.setCurrentActivity(activity);
            ZQlEkdEN(sfjfvpnqmz0, dlcwcnwe1, xkqtwfmkl2);
            heaxIMTG(vvaqqhsu0, giyzmjcmu1, grqnmldz2);
            UQWlmdIW(nglojng0, rvedkwn1);
            UvGfavbo(bkwxcjjjuc0, eoiboupffj1, mihayyux2);
            EtryNCFe(jaynqmsbn0, xlxsyav1, pjubafsepd2);
            TidyManager.creatingActivities.add(activity);
            jpZCUUnF(thtgbajg0, jkmebti1, cmdplesv2);
            QVWdbMbn(adiiixe0, ivwsainz1);
            JuhVvdNJ(rkbbonnw0);
            VGdVroZF(qnamkrdzh0, ywxcyaa1);
            TidyManager.livingActivities.add(activity);
            jpZCUUnF(thtgbajg0, jkmebti1, cmdplesv2);
            EtryNCFe(jaynqmsbn0, xlxsyav1, pjubafsepd2);
            uwrFVsNT(tvyhszgxa0, snnblkw1);
            MvHaNwoE(iurgcvz0);
            GYzAPPcb(ckddtqwefa0, xwyfcafrs1, rvbifzx2, geamqdsyz3, kdmexduvv4);
            PjkufHyI(mijpkeyrh0);
            wfCuWNBu(owvinmyzu0, wpfbiuwj1, jgaoorvd2, qpuiijsfqk3, ynaydnl4);
            wfCuWNBu(owvinmyzu0, wpfbiuwj1, jgaoorvd2, qpuiijsfqk3, ynaydnl4);
            yYQsdbaT(ttvmmbnovs0, nrpslya1, njpdvaugz2, ozsbfseog3);
            TidyManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void bsiLOSdo(long wfjafmj0, byte fitlbfcs1, short rravdhvug2) {
            short rravdhvug2a = rravdhvug2;
            byte fitlbfcs1a = fitlbfcs1;
            long wfjafmj0a = wfjafmj0;
            new Intent("bsiLOSdo" + wfjafmj0a + fitlbfcs1a + rravdhvug2a + "bsiLOSdo" + "" + "");
        }

        //垃圾方法
        private void CcaOxbIG(short nrkhpuve0, long kbxtbzq1, int uwdgbyr2) {
            int uwdgbyr2a = uwdgbyr2;
            long kbxtbzq1a = kbxtbzq1;
            short nrkhpuve0a = nrkhpuve0;
            System.out.println("CcaOxbIG" + kbxtbzq1a + uwdgbyr2a + nrkhpuve0a + "CcaOxbIG" + "" + "");
        }

        //垃圾方法
        private void Zwjugmix(char dgasqehb0, int jdwyxmlh1, boolean iwkeouzuwn2) {
            boolean iwkeouzuwn2a = iwkeouzuwn2;
            int jdwyxmlh1a = jdwyxmlh1;
            char dgasqehb0a = dgasqehb0;
            Log.e("Zwjugmix", "Zwjugmix" + iwkeouzuwn2a + dgasqehb0a + jdwyxmlh1a + "Zwjugmix" + "" + "");
        }

        //垃圾方法
        private void zksvKZES(int ahnilzpmo0, boolean chntvenvc1, int euulxypmbv2) {
            int euulxypmbv2a = euulxypmbv2;
            boolean chntvenvc1a = chntvenvc1;
            int ahnilzpmo0a = ahnilzpmo0;
            new Thread("zksvKZES" + euulxypmbv2a + chntvenvc1a + ahnilzpmo0a + "zksvKZES" + "" + "");
        }

        public void onActivityStarted(@NotNull Activity activity) {
            int euulxypmbv2 = 8;
            boolean chntvenvc1 = false;
            int ahnilzpmo0 = 74;
            boolean iwkeouzuwn2 = true;
            int jdwyxmlh1 = 57;
            char dgasqehb0 = 64;
            int uwdgbyr2 = 45;
            long kbxtbzq1 = 89L;
            short nrkhpuve0 = 98;
            short rravdhvug2 = 17;
            byte fitlbfcs1 = 56;
            long wfjafmj0 = 83L;
            zksvKZES(ahnilzpmo0, chntvenvc1, euulxypmbv2);
            CcaOxbIG(nrkhpuve0, kbxtbzq1, uwdgbyr2);
            CcaOxbIG(nrkhpuve0, kbxtbzq1, uwdgbyr2);
            CcaOxbIG(nrkhpuve0, kbxtbzq1, uwdgbyr2);
            zksvKZES(ahnilzpmo0, chntvenvc1, euulxypmbv2);
            TidyManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void GmVVYBBw(float tshzsspg0, boolean mialoae1, int hxleqws2) {
            int hxleqws2a = hxleqws2;
            boolean mialoae1a = mialoae1;
            float tshzsspg0a = tshzsspg0;
            new StringBuffer("GmVVYBBw" + tshzsspg0a + hxleqws2a + mialoae1a + "GmVVYBBw" + "" + "");
        }

        //垃圾方法
        private void OPqYrFxf(float lgexdidq0, int vilqhwsia1, long qfbdfymx2, boolean aiknthudxo3, byte dxprdtuzh4) {
            byte dxprdtuzh4a = dxprdtuzh4;
            boolean aiknthudxo3a = aiknthudxo3;
            long qfbdfymx2a = qfbdfymx2;
            int vilqhwsia1a = vilqhwsia1;
            float lgexdidq0a = lgexdidq0;
            new StringBuffer("OPqYrFxf" + lgexdidq0a + dxprdtuzh4a + vilqhwsia1a + qfbdfymx2a + aiknthudxo3a + "OPqYrFxf" + "" + "");
        }

        //垃圾方法
        private void eJchDgbL(double xqucyicozf0, boolean rvwqrvbn1, int smcztlxij2, boolean dmshettio3) {
            boolean dmshettio3a = dmshettio3;
            int smcztlxij2a = smcztlxij2;
            boolean rvwqrvbn1a = rvwqrvbn1;
            double xqucyicozf0a = xqucyicozf0;
            TextUtils.isDigitsOnly("eJchDgbL" + dmshettio3a + xqucyicozf0a + smcztlxij2a + rvwqrvbn1a + "eJchDgbL" + "" + "");
        }

        //垃圾方法
        private void yZVHonJt(char djtxgpnffv0, short gjketqwqs1, byte dobzcdeqq2, short hqzfstcb3, char mnhphyfh4) {
            char mnhphyfh4a = mnhphyfh4;
            short hqzfstcb3a = hqzfstcb3;
            byte dobzcdeqq2a = dobzcdeqq2;
            short gjketqwqs1a = gjketqwqs1;
            char djtxgpnffv0a = djtxgpnffv0;
            new StringBuffer("yZVHonJt" + dobzcdeqq2a + djtxgpnffv0a + hqzfstcb3a + mnhphyfh4a + gjketqwqs1a + "yZVHonJt" + "" + "");
        }

        //垃圾方法
        private void AQpKLjcK(double aqbgxbxg0, long cywltxa1) {
            long cywltxa1a = cywltxa1;
            double aqbgxbxg0a = aqbgxbxg0;
            Log.e("AQpKLjcK", "AQpKLjcK" + aqbgxbxg0a + cywltxa1a + "AQpKLjcK" + "" + "");
        }

        //垃圾方法
        private void pEntifDy(short emnuaiz0, short inknozrduy1) {
            short inknozrduy1a = inknozrduy1;
            short emnuaiz0a = emnuaiz0;
            new AttributedString("pEntifDy" + emnuaiz0a + inknozrduy1a + "pEntifDy" + "" + "");
        }

        //垃圾方法
        private void TyqLAqyr(boolean yjnbfdacvk0, long ysyvvaapc1, long ydhsilaeat2, char usfnmtirmv3, float pqaiohmnf4) {
            float pqaiohmnf4a = pqaiohmnf4;
            char usfnmtirmv3a = usfnmtirmv3;
            long ydhsilaeat2a = ydhsilaeat2;
            long ysyvvaapc1a = ysyvvaapc1;
            boolean yjnbfdacvk0a = yjnbfdacvk0;
            new File("TyqLAqyr" + pqaiohmnf4a + ysyvvaapc1a + usfnmtirmv3a + ydhsilaeat2a + yjnbfdacvk0a + "TyqLAqyr" + "" + "");
        }

        //垃圾方法
        private void dyEZBbkH(float hyennbncfk0, short zrzefwsnhd1, int ccyzvjfoc2, int ufyyvvxm3) {
            int ufyyvvxm3a = ufyyvvxm3;
            int ccyzvjfoc2a = ccyzvjfoc2;
            short zrzefwsnhd1a = zrzefwsnhd1;
            float hyennbncfk0a = hyennbncfk0;
            Log.i("dyEZBbkH", "dyEZBbkH" + zrzefwsnhd1a + ccyzvjfoc2a + hyennbncfk0a + ufyyvvxm3a + "dyEZBbkH" + "" + "");
        }

        //垃圾方法
        private void cZbhWIFo(byte xdvxnhc0, float zqyutwjhih1, short yqmpkizyl2, boolean lflmknb3, short lwuegwd4) {
            short lwuegwd4a = lwuegwd4;
            boolean lflmknb3a = lflmknb3;
            short yqmpkizyl2a = yqmpkizyl2;
            float zqyutwjhih1a = zqyutwjhih1;
            byte xdvxnhc0a = xdvxnhc0;
            Log.w("cZbhWIFo", "cZbhWIFo" + zqyutwjhih1a + lflmknb3a + yqmpkizyl2a + lwuegwd4a + xdvxnhc0a + "cZbhWIFo" + "" + "");
        }

        //垃圾方法
        private void NyfqBqKf(long mfnlrlyjmp0, boolean mpvxzkg1) {
            boolean mpvxzkg1a = mpvxzkg1;
            long mfnlrlyjmp0a = mfnlrlyjmp0;
            new StringBuilder("NyfqBqKf" + mfnlrlyjmp0a + mpvxzkg1a + "NyfqBqKf" + "" + "");
        }

        //垃圾方法
        private void EfUqbWjB(byte sairdsl0) {
            byte sairdsl0a = sairdsl0;
            Log.i("EfUqbWjB", "EfUqbWjB" + sairdsl0a + "EfUqbWjB" + "" + "");
        }

        //垃圾方法
        private void pfUAKKSZ(byte wkyhqvrr0, byte ompvrnhdp1) {
            byte ompvrnhdp1a = ompvrnhdp1;
            byte wkyhqvrr0a = wkyhqvrr0;
            new AttributedString("pfUAKKSZ" + ompvrnhdp1a + wkyhqvrr0a + "pfUAKKSZ" + "" + "");
        }

        //垃圾方法
        private void esIGqNfR(byte ezhdqosc0, boolean rxaoldkb1, double tjhfrkgh2, boolean dgwuzcibs3, long onsknmsrpu4) {
            long onsknmsrpu4a = onsknmsrpu4;
            boolean dgwuzcibs3a = dgwuzcibs3;
            double tjhfrkgh2a = tjhfrkgh2;
            boolean rxaoldkb1a = rxaoldkb1;
            byte ezhdqosc0a = ezhdqosc0;
            new File("esIGqNfR" + ezhdqosc0a + onsknmsrpu4a + rxaoldkb1a + tjhfrkgh2a + dgwuzcibs3a + "esIGqNfR" + "" + "");
        }

        //垃圾方法
        private void WqvYKsqA(byte qpkpjex0, float smuelcpikt1) {
            float smuelcpikt1a = smuelcpikt1;
            byte qpkpjex0a = qpkpjex0;
            new StringBuffer("WqvYKsqA" + smuelcpikt1a + qpkpjex0a + "WqvYKsqA" + "" + "");
        }

        //垃圾方法
        private void rBsKVytP(long hadhtfurs0, char gmmnucqwyu1, byte odmeqzbd2) {
            byte odmeqzbd2a = odmeqzbd2;
            char gmmnucqwyu1a = gmmnucqwyu1;
            long hadhtfurs0a = hadhtfurs0;
            TextUtils.isEmpty("rBsKVytP" + gmmnucqwyu1a + odmeqzbd2a + hadhtfurs0a + "rBsKVytP" + "" + "");
        }

        //垃圾方法
        private void ZdiAsDfF(int tikknufzfo0, int bkeirfq1) {
            int bkeirfq1a = bkeirfq1;
            int tikknufzfo0a = tikknufzfo0;
            new AttributedString("ZdiAsDfF" + bkeirfq1a + tikknufzfo0a + "ZdiAsDfF" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            int bkeirfq1 = 43;
            int tikknufzfo0 = 70;
            byte odmeqzbd2 = 60;
            char gmmnucqwyu1 = 1;
            long hadhtfurs0 = 88L;
            float smuelcpikt1 = 23.23f;
            byte qpkpjex0 = 59;
            long onsknmsrpu4 = 50L;
            boolean dgwuzcibs3 = true;
            double tjhfrkgh2 = 43.43;
            boolean rxaoldkb1 = true;
            byte ezhdqosc0 = 46;
            byte ompvrnhdp1 = 26;
            byte wkyhqvrr0 = 67;
            byte sairdsl0 = 63;
            boolean mpvxzkg1 = false;
            long mfnlrlyjmp0 = 58L;
            short lwuegwd4 = 12;
            boolean lflmknb3 = false;
            short yqmpkizyl2 = 60;
            float zqyutwjhih1 = 99.99f;
            byte xdvxnhc0 = 80;
            int ufyyvvxm3 = 88;
            int ccyzvjfoc2 = 96;
            short zrzefwsnhd1 = 4;
            float hyennbncfk0 = 35.35f;
            float pqaiohmnf4 = 86.86f;
            char usfnmtirmv3 = 13;
            long ydhsilaeat2 = 74L;
            long ysyvvaapc1 = 27L;
            boolean yjnbfdacvk0 = true;
            short inknozrduy1 = 96;
            short emnuaiz0 = 96;
            long cywltxa1 = 5L;
            double aqbgxbxg0 = 85.85;
            char mnhphyfh4 = 87;
            short hqzfstcb3 = 25;
            byte dobzcdeqq2 = 70;
            short gjketqwqs1 = 29;
            char djtxgpnffv0 = 4;
            boolean dmshettio3 = true;
            int smcztlxij2 = 99;
            boolean rvwqrvbn1 = true;
            double xqucyicozf0 = 47.47;
            byte dxprdtuzh4 = 28;
            boolean aiknthudxo3 = false;
            long qfbdfymx2 = 55L;
            int vilqhwsia1 = 1;
            float lgexdidq0 = 14.14f;
            int hxleqws2 = 99;
            boolean mialoae1 = false;
            float tshzsspg0 = 87.87f;
            EfUqbWjB(sairdsl0);
            ZdiAsDfF(tikknufzfo0, bkeirfq1);
            cZbhWIFo(xdvxnhc0, zqyutwjhih1, yqmpkizyl2, lflmknb3, lwuegwd4);
            WqvYKsqA(qpkpjex0, smuelcpikt1);
            TyqLAqyr(yjnbfdacvk0, ysyvvaapc1, ydhsilaeat2, usfnmtirmv3, pqaiohmnf4);
            rBsKVytP(hadhtfurs0, gmmnucqwyu1, odmeqzbd2);
            TidySPUtils.putLong("lastActivityOnPause", 0L);
            esIGqNfR(ezhdqosc0, rxaoldkb1, tjhfrkgh2, dgwuzcibs3, onsknmsrpu4);
            rBsKVytP(hadhtfurs0, gmmnucqwyu1, odmeqzbd2);
            rBsKVytP(hadhtfurs0, gmmnucqwyu1, odmeqzbd2);
            rBsKVytP(hadhtfurs0, gmmnucqwyu1, odmeqzbd2);
            TyqLAqyr(yjnbfdacvk0, ysyvvaapc1, ydhsilaeat2, usfnmtirmv3, pqaiohmnf4);
            cZbhWIFo(xdvxnhc0, zqyutwjhih1, yqmpkizyl2, lflmknb3, lwuegwd4);
            TidyManager.INSTANCE.setCurrentActivity(activity);
            dyEZBbkH(hyennbncfk0, zrzefwsnhd1, ccyzvjfoc2, ufyyvvxm3);
            OPqYrFxf(lgexdidq0, vilqhwsia1, qfbdfymx2, aiknthudxo3, dxprdtuzh4);
            pEntifDy(emnuaiz0, inknozrduy1);
            NyfqBqKf(mfnlrlyjmp0, mpvxzkg1);
            TidyManager.creatingActivities.remove(activity);
            pfUAKKSZ(wkyhqvrr0, ompvrnhdp1);
            OPqYrFxf(lgexdidq0, vilqhwsia1, qfbdfymx2, aiknthudxo3, dxprdtuzh4);
            dyEZBbkH(hyennbncfk0, zrzefwsnhd1, ccyzvjfoc2, ufyyvvxm3);
            TidyManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void pPLJqKQw(byte iebikicrra0, long htxkwha1, float dpfshowdst2) {
            float dpfshowdst2a = dpfshowdst2;
            long htxkwha1a = htxkwha1;
            byte iebikicrra0a = iebikicrra0;
            Log.i("pPLJqKQw", "pPLJqKQw" + dpfshowdst2a + iebikicrra0a + htxkwha1a + "pPLJqKQw" + "" + "");
        }

        //垃圾方法
        private void HQKnXmRE(short idcfaxif0, boolean oqpgvjvt1) {
            boolean oqpgvjvt1a = oqpgvjvt1;
            short idcfaxif0a = idcfaxif0;
            TextUtils.isEmpty("HQKnXmRE" + oqpgvjvt1a + idcfaxif0a + "HQKnXmRE" + "" + "");
        }

        //垃圾方法
        private void SzTMrmTj(long ftajxolz0, short gpmoepad1) {
            short gpmoepad1a = gpmoepad1;
            long ftajxolz0a = ftajxolz0;
            new File("SzTMrmTj" + gpmoepad1a + ftajxolz0a + "SzTMrmTj" + "" + "");
        }

        //垃圾方法
        private void CQPtQeve(double verfssm0, long gtqtjzji1) {
            long gtqtjzji1a = gtqtjzji1;
            double verfssm0a = verfssm0;
            new String("CQPtQeve" + verfssm0a + gtqtjzji1a + "CQPtQeve" + "" + "");
        }

        //垃圾方法
        private void ZOfOIXjK(float eweiolztez0, short jwxkulcpl1, short uphsxmubgq2) {
            short uphsxmubgq2a = uphsxmubgq2;
            short jwxkulcpl1a = jwxkulcpl1;
            float eweiolztez0a = eweiolztez0;
            new Thread("ZOfOIXjK" + jwxkulcpl1a + eweiolztez0a + uphsxmubgq2a + "ZOfOIXjK" + "" + "");
        }

        //垃圾方法
        private void jymfrHcg(boolean xcvowhaiey0, long xewuiyeuyl1, float burzsyf2, double qtjnmhezl3) {
            double qtjnmhezl3a = qtjnmhezl3;
            float burzsyf2a = burzsyf2;
            long xewuiyeuyl1a = xewuiyeuyl1;
            boolean xcvowhaiey0a = xcvowhaiey0;
            new WeakReference("jymfrHcg" + qtjnmhezl3a + xcvowhaiey0a + xewuiyeuyl1a + burzsyf2a + "jymfrHcg" + "" + "");
        }

        //垃圾方法
        private void gXMphWjO(long zzjsylow0, char ngqjkkjre1, int xjfnayacs2) {
            int xjfnayacs2a = xjfnayacs2;
            char ngqjkkjre1a = ngqjkkjre1;
            long zzjsylow0a = zzjsylow0;
            new File("gXMphWjO" + xjfnayacs2a + ngqjkkjre1a + zzjsylow0a + "gXMphWjO" + "" + "");
        }

        //垃圾方法
        private void JhtnasDQ(int cilbomtdd0, float sddbugdpku1, double ggxfsupdy2) {
            double ggxfsupdy2a = ggxfsupdy2;
            float sddbugdpku1a = sddbugdpku1;
            int cilbomtdd0a = cilbomtdd0;
            new Intent("JhtnasDQ" + sddbugdpku1a + cilbomtdd0a + ggxfsupdy2a + "JhtnasDQ" + "" + "");
        }

        //垃圾方法
        private void rzlsxseY(byte vcahgzazo0, char fibuxva1, byte orfxvsl2) {
            byte orfxvsl2a = orfxvsl2;
            char fibuxva1a = fibuxva1;
            byte vcahgzazo0a = vcahgzazo0;
            new WeakReference("rzlsxseY" + vcahgzazo0a + fibuxva1a + orfxvsl2a + "rzlsxseY" + "" + "");
        }

        //垃圾方法
        private void hjDdzXWm(char zewqnxwn0, long hqqepju1) {
            long hqqepju1a = hqqepju1;
            char zewqnxwn0a = zewqnxwn0;
            new WeakReference("hjDdzXWm" + hqqepju1a + zewqnxwn0a + "hjDdzXWm" + "" + "");
        }

        //垃圾方法
        private void tiDWonPL(int nshjnhzcu0, double lhddbtds1, float quyzvdr2, long fignivai3, byte eehielbo4) {
            byte eehielbo4a = eehielbo4;
            long fignivai3a = fignivai3;
            float quyzvdr2a = quyzvdr2;
            double lhddbtds1a = lhddbtds1;
            int nshjnhzcu0a = nshjnhzcu0;
            System.out.println("tiDWonPL" + lhddbtds1a + quyzvdr2a + eehielbo4a + fignivai3a + nshjnhzcu0a + "tiDWonPL" + "" + "");
        }

        //垃圾方法
        private void YQjKlCbm(int eysuxcaa0) {
            int eysuxcaa0a = eysuxcaa0;
            new Thread("YQjKlCbm" + eysuxcaa0a + "YQjKlCbm" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            int eysuxcaa0 = 10;
            byte eehielbo4 = 5;
            long fignivai3 = 92L;
            float quyzvdr2 = 72.72f;
            double lhddbtds1 = 28.28;
            int nshjnhzcu0 = 18;
            long hqqepju1 = 35L;
            char zewqnxwn0 = 6;
            byte orfxvsl2 = 83;
            char fibuxva1 = 21;
            byte vcahgzazo0 = 65;
            double ggxfsupdy2 = 36.36;
            float sddbugdpku1 = 81.81f;
            int cilbomtdd0 = 89;
            int xjfnayacs2 = 7;
            char ngqjkkjre1 = 53;
            long zzjsylow0 = 56L;
            double qtjnmhezl3 = 56.56;
            float burzsyf2 = 46.46f;
            long xewuiyeuyl1 = 3L;
            boolean xcvowhaiey0 = true;
            short uphsxmubgq2 = 76;
            short jwxkulcpl1 = 77;
            float eweiolztez0 = 8.8f;
            long gtqtjzji1 = 50L;
            double verfssm0 = 79.79;
            short gpmoepad1 = 54;
            long ftajxolz0 = 65L;
            boolean oqpgvjvt1 = false;
            short idcfaxif0 = 17;
            float dpfshowdst2 = 86.86f;
            long htxkwha1 = 76L;
            byte iebikicrra0 = 29;
            CQPtQeve(verfssm0, gtqtjzji1);
            CQPtQeve(verfssm0, gtqtjzji1);
            HQKnXmRE(idcfaxif0, oqpgvjvt1);
            TidyManager.INSTANCE.setPaused(true);
            rzlsxseY(vcahgzazo0, fibuxva1, orfxvsl2);
            pPLJqKQw(iebikicrra0, htxkwha1, dpfshowdst2);
            ZOfOIXjK(eweiolztez0, jwxkulcpl1, uphsxmubgq2);
            YQjKlCbm(eysuxcaa0);
            pPLJqKQw(iebikicrra0, htxkwha1, dpfshowdst2);
            HQKnXmRE(idcfaxif0, oqpgvjvt1);
            CQPtQeve(verfssm0, gtqtjzji1);
            tiDWonPL(nshjnhzcu0, lhddbtds1, quyzvdr2, fignivai3, eehielbo4);
            hjDdzXWm(zewqnxwn0, hqqepju1);
            TidyManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            TidyManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void wUbcKyks(short ezfplxt0) {
            short ezfplxt0a = ezfplxt0;
            new Intent("wUbcKyks" + ezfplxt0a + "wUbcKyks" + "" + "");
        }

        //垃圾方法
        private void FgmVtHFw(boolean ngliqztwu0, float iirctqcrg1) {
            float iirctqcrg1a = iirctqcrg1;
            boolean ngliqztwu0a = ngliqztwu0;
            Log.w("FgmVtHFw", "FgmVtHFw" + ngliqztwu0a + iirctqcrg1a + "FgmVtHFw" + "" + "");
        }

        //垃圾方法
        private void kflbYBCg(char lbptfhpe0, float hfzbmfkoa1, byte ltmkopln2, byte keaemctiv3, float lfjbqfue4) {
            float lfjbqfue4a = lfjbqfue4;
            byte keaemctiv3a = keaemctiv3;
            byte ltmkopln2a = ltmkopln2;
            float hfzbmfkoa1a = hfzbmfkoa1;
            char lbptfhpe0a = lbptfhpe0;
            TextUtils.isDigitsOnly("kflbYBCg" + lbptfhpe0a + lfjbqfue4a + hfzbmfkoa1a + ltmkopln2a + keaemctiv3a + "kflbYBCg" + "" + "");
        }

        //垃圾方法
        private void VKoUhNGb(char wogthaiak0, short pmzzhgan1, int yplebixstb2, byte vndjpliqs3) {
            byte vndjpliqs3a = vndjpliqs3;
            int yplebixstb2a = yplebixstb2;
            short pmzzhgan1a = pmzzhgan1;
            char wogthaiak0a = wogthaiak0;
            new StringBuffer("VKoUhNGb" + vndjpliqs3a + yplebixstb2a + wogthaiak0a + pmzzhgan1a + "VKoUhNGb" + "" + "");
        }

        //垃圾方法
        private void cqaYMYvv(int cqmysgxi0, boolean glvfaju1) {
            boolean glvfaju1a = glvfaju1;
            int cqmysgxi0a = cqmysgxi0;
            System.out.println("cqaYMYvv" + glvfaju1a + cqmysgxi0a + "cqaYMYvv" + "" + "");
        }

        //垃圾方法
        private void yYPknlNh(double ltkitmx0, short zdsstho1) {
            short zdsstho1a = zdsstho1;
            double ltkitmx0a = ltkitmx0;
            new File("yYPknlNh" + zdsstho1a + ltkitmx0a + "yYPknlNh" + "" + "");
        }

        //垃圾方法
        private void UrlPXLQC(char dfcwgdnm0, double gpnqszgpf1, double huyuhymvcg2, int wlamqtz3) {
            int wlamqtz3a = wlamqtz3;
            double huyuhymvcg2a = huyuhymvcg2;
            double gpnqszgpf1a = gpnqszgpf1;
            char dfcwgdnm0a = dfcwgdnm0;
            new StringBuilder("UrlPXLQC" + huyuhymvcg2a + dfcwgdnm0a + gpnqszgpf1a + wlamqtz3a + "UrlPXLQC" + "" + "");
        }

        //垃圾方法
        private void zmszFGyk(boolean gugoytwo0, int zamufbfh1, boolean aoiohrfsng2, int qciotiuqe3, int grtrown4) {
            int grtrown4a = grtrown4;
            int qciotiuqe3a = qciotiuqe3;
            boolean aoiohrfsng2a = aoiohrfsng2;
            int zamufbfh1a = zamufbfh1;
            boolean gugoytwo0a = gugoytwo0;
        }

        public void onActivityStopped(@NotNull Activity activity) {
            int grtrown4 = 19;
            int qciotiuqe3 = 41;
            boolean aoiohrfsng2 = true;
            int zamufbfh1 = 77;
            boolean gugoytwo0 = true;
            int wlamqtz3 = 84;
            double huyuhymvcg2 = 73.73;
            double gpnqszgpf1 = 37.37;
            char dfcwgdnm0 = 25;
            short zdsstho1 = 96;
            double ltkitmx0 = 21.21;
            boolean glvfaju1 = true;
            int cqmysgxi0 = 92;
            byte vndjpliqs3 = 41;
            int yplebixstb2 = 99;
            short pmzzhgan1 = 32;
            char wogthaiak0 = 9;
            float lfjbqfue4 = 80.80f;
            byte keaemctiv3 = 61;
            byte ltmkopln2 = 39;
            float hfzbmfkoa1 = 10.10f;
            char lbptfhpe0 = 46;
            float iirctqcrg1 = 83.83f;
            boolean ngliqztwu0 = false;
            short ezfplxt0 = 31;
            zmszFGyk(gugoytwo0, zamufbfh1, aoiohrfsng2, qciotiuqe3, grtrown4);
            FgmVtHFw(ngliqztwu0, iirctqcrg1);
            VKoUhNGb(wogthaiak0, pmzzhgan1, yplebixstb2, vndjpliqs3);
            TidyManager.visibleActivities.remove(activity);
            TidyManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void xKqaNYeV(long lujyyfatvh0) {
            long lujyyfatvh0a = lujyyfatvh0;
            new StringBuffer("xKqaNYeV" + lujyyfatvh0a + "xKqaNYeV" + "" + "");
        }

        //垃圾方法
        private void OKXauBGt(int jbflsgh0) {
            int jbflsgh0a = jbflsgh0;
            new Thread("OKXauBGt" + jbflsgh0a + "OKXauBGt" + "" + "");
        }

        //垃圾方法
        private void iZuwpgII(byte yvudbwr0, byte qwozgehdph1, int bzzafmochc2) {
            int bzzafmochc2a = bzzafmochc2;
            byte qwozgehdph1a = qwozgehdph1;
            byte yvudbwr0a = yvudbwr0;
        }

        //垃圾方法
        private void rxOmzVNZ(char rhoioecf0, float phbkslof1, byte sfwgtos2, byte sliyntkbmw3) {
            byte sliyntkbmw3a = sliyntkbmw3;
            byte sfwgtos2a = sfwgtos2;
            float phbkslof1a = phbkslof1;
            char rhoioecf0a = rhoioecf0;
        }

        //垃圾方法
        private void SoKtyuFa(char lznphvuv0, short unvypayhn1) {
            short unvypayhn1a = unvypayhn1;
            char lznphvuv0a = lznphvuv0;
            new StringReader("SoKtyuFa" + lznphvuv0a + unvypayhn1a + "SoKtyuFa" + "" + "");
        }

        //垃圾方法
        private void DQnnfeXT(char qlyjtcucp0, float hdvavip1, short xjetzwaetc2, float lgnrydlon3, short jvfdtttto4) {
            short jvfdtttto4a = jvfdtttto4;
            float lgnrydlon3a = lgnrydlon3;
            short xjetzwaetc2a = xjetzwaetc2;
            float hdvavip1a = hdvavip1;
            char qlyjtcucp0a = qlyjtcucp0;
            new Intent("DQnnfeXT" + hdvavip1a + lgnrydlon3a + xjetzwaetc2a + qlyjtcucp0a + jvfdtttto4a + "DQnnfeXT" + "" + "");
        }

        //垃圾方法
        private void uYrYhSqH(long qoukvwxtj0, short onpnhvkk1) {
            short onpnhvkk1a = onpnhvkk1;
            long qoukvwxtj0a = qoukvwxtj0;
            new WeakReference("uYrYhSqH" + qoukvwxtj0a + onpnhvkk1a + "uYrYhSqH" + "" + "");
        }

        //垃圾方法
        private void MqiQiQKX(int gfrdulhroh0, byte munlipzea1, short twiaeqokga2, byte pgwapny3) {
            byte pgwapny3a = pgwapny3;
            short twiaeqokga2a = twiaeqokga2;
            byte munlipzea1a = munlipzea1;
            int gfrdulhroh0a = gfrdulhroh0;
            new Intent("MqiQiQKX" + munlipzea1a + pgwapny3a + twiaeqokga2a + gfrdulhroh0a + "MqiQiQKX" + "" + "");
        }

        //垃圾方法
        private void bGIrsXdO(boolean pgiqcti0) {
            boolean pgiqcti0a = pgiqcti0;
            new AttributedString("bGIrsXdO" + pgiqcti0a + "bGIrsXdO" + "" + "");
        }

        //垃圾方法
        private void mvpYGImq(short mdbyipvipp0, double nynkwma1, short tfevbijve2, char nfvttodsx3) {
            char nfvttodsx3a = nfvttodsx3;
            short tfevbijve2a = tfevbijve2;
            double nynkwma1a = nynkwma1;
            short mdbyipvipp0a = mdbyipvipp0;
            new Thread("mvpYGImq" + mdbyipvipp0a + tfevbijve2a + nfvttodsx3a + nynkwma1a + "mvpYGImq" + "" + "");
        }

        //垃圾方法
        private void vmEmZiBO(boolean ytmrxue0, int sjrbiai1, boolean pirdncoke2, char kniekwccv3, char kdjsiulnd4) {
            char kdjsiulnd4a = kdjsiulnd4;
            char kniekwccv3a = kniekwccv3;
            boolean pirdncoke2a = pirdncoke2;
            int sjrbiai1a = sjrbiai1;
            boolean ytmrxue0a = ytmrxue0;
        }

        //垃圾方法
        private void iVRPwPae(short ashiowcmsh0, double xsvkeiitg1, byte ouedxkkowm2) {
            byte ouedxkkowm2a = ouedxkkowm2;
            double xsvkeiitg1a = xsvkeiitg1;
            short ashiowcmsh0a = ashiowcmsh0;
            new AttributedString("iVRPwPae" + ashiowcmsh0a + xsvkeiitg1a + ouedxkkowm2a + "iVRPwPae" + "" + "");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            byte ouedxkkowm2 = 35;
            double xsvkeiitg1 = 18.18;
            short ashiowcmsh0 = 52;
            char kdjsiulnd4 = 57;
            char kniekwccv3 = 23;
            boolean pirdncoke2 = true;
            int sjrbiai1 = 28;
            boolean ytmrxue0 = true;
            char nfvttodsx3 = 84;
            short tfevbijve2 = 46;
            double nynkwma1 = 1.1;
            short mdbyipvipp0 = 45;
            boolean pgiqcti0 = true;
            byte pgwapny3 = 88;
            short twiaeqokga2 = 84;
            byte munlipzea1 = 64;
            int gfrdulhroh0 = 43;
            short onpnhvkk1 = 61;
            long qoukvwxtj0 = 57L;
            short jvfdtttto4 = 65;
            float lgnrydlon3 = 15.15f;
            short xjetzwaetc2 = 10;
            float hdvavip1 = 3.3f;
            char qlyjtcucp0 = 32;
            short unvypayhn1 = 71;
            char lznphvuv0 = 14;
            byte sliyntkbmw3 = 98;
            byte sfwgtos2 = 33;
            float phbkslof1 = 53.53f;
            char rhoioecf0 = 92;
            int bzzafmochc2 = 86;
            byte qwozgehdph1 = 83;
            byte yvudbwr0 = 36;
            int jbflsgh0 = 49;
            long lujyyfatvh0 = 32L;
            iVRPwPae(ashiowcmsh0, xsvkeiitg1, ouedxkkowm2);
            vmEmZiBO(ytmrxue0, sjrbiai1, pirdncoke2, kniekwccv3, kdjsiulnd4);
            iZuwpgII(yvudbwr0, qwozgehdph1, bzzafmochc2);
            rxOmzVNZ(rhoioecf0, phbkslof1, sfwgtos2, sliyntkbmw3);
            rxOmzVNZ(rhoioecf0, phbkslof1, sfwgtos2, sliyntkbmw3);
            iVRPwPae(ashiowcmsh0, xsvkeiitg1, ouedxkkowm2);
            OKXauBGt(jbflsgh0);
            vmEmZiBO(ytmrxue0, sjrbiai1, pirdncoke2, kniekwccv3, kdjsiulnd4);
            OKXauBGt(jbflsgh0);
            if (TidyManager.INSTANCE.isCurrActivity(activity)) {
                TidyManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            TidyManager.creatingActivities.remove(activity);
            iVRPwPae(ashiowcmsh0, xsvkeiitg1, ouedxkkowm2);
            xKqaNYeV(lujyyfatvh0);
            OKXauBGt(jbflsgh0);
            TidyManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private int lGDhzLK = 52;

    //垃圾变量
    private char bAmWyvQ = 57;

    //垃圾变量
    private long rmeWkyk = 63L;

    //垃圾变量
    private short qOUQHlK = 52;

    //垃圾变量
    private double VgZlEqG = 56.56;

    //垃圾变量
    private int QsGuSFw = 89;

    //垃圾变量
    private long EMpXZck = 27L;

    //垃圾变量
    private boolean OMCUctX = false;

    //垃圾变量
    private boolean JbIeUNa = false;

    //垃圾变量
    private long yKTpBrj = 18L;

    //垃圾方法
    private void alYUnQoX(short pwdaycpkd0, double doaehjebff1, double gukhpijb2) {
        double gukhpijb2a = gukhpijb2;
        double doaehjebff1a = doaehjebff1;
        short pwdaycpkd0a = pwdaycpkd0;
        new AttributedString("alYUnQoX" + pwdaycpkd0a + doaehjebff1a + gukhpijb2a + "alYUnQoX" + jAGllnA + JbIeUNa + rdIrsFc + rmeWkyk + qJdECWn + NlQBAdy + RzBmSld + zQKbTdF + UxqrFca + LdYcfZI + DYRdvJu + sJxRfKT + KExGQjy + lGDhzLK + EMpXZck + VgZlEqG + XPYKqgx + LvWMFMP + "");
    }

    //垃圾方法
    private void fKsAZbUU(boolean xabdzzmxyb0, char jpgzvubfh1, int sjuybmp2, byte xyfciwjo3) {
        byte xyfciwjo3a = xyfciwjo3;
        int sjuybmp2a = sjuybmp2;
        char jpgzvubfh1a = jpgzvubfh1;
        boolean xabdzzmxyb0a = xabdzzmxyb0;
        TextUtils.isDigitsOnly("fKsAZbUU" + jpgzvubfh1a + xabdzzmxyb0a + sjuybmp2a + xyfciwjo3a + "fKsAZbUU" + lGDhzLK + sJxRfKT + zQKbTdF + LdYcfZI + qJdECWn + rdIrsFc + VgZlEqG + KExGQjy + jAGllnA + UxqrFca + XPYKqgx + LvWMFMP + RzBmSld + NlQBAdy + JbIeUNa + DYRdvJu + EMpXZck + rmeWkyk + "");
    }

    //垃圾方法
    private void edNVqADB(short powtyudj0, int hsprjkd1, char ttqzfuuvxn2, long jukbifvol3, double gwesckftrk4) {
        double gwesckftrk4a = gwesckftrk4;
        long jukbifvol3a = jukbifvol3;
        char ttqzfuuvxn2a = ttqzfuuvxn2;
        int hsprjkd1a = hsprjkd1;
        short powtyudj0a = powtyudj0;
        new Thread("edNVqADB" + powtyudj0a + hsprjkd1a + gwesckftrk4a + ttqzfuuvxn2a + jukbifvol3a + "edNVqADB" + KExGQjy + lGDhzLK + DYRdvJu + zQKbTdF + sJxRfKT + UxqrFca + jAGllnA + XPYKqgx + rdIrsFc + EMpXZck + NlQBAdy + LvWMFMP + RzBmSld + rmeWkyk + JbIeUNa + LdYcfZI + qJdECWn + VgZlEqG + "");
    }

    //垃圾方法
    private void TBCUmhkl(long gxtglifns0, short oaxtkiwc1) {
        short oaxtkiwc1a = oaxtkiwc1;
        long gxtglifns0a = gxtglifns0;
        new String("TBCUmhkl" + oaxtkiwc1a + gxtglifns0a + "TBCUmhkl" + XPYKqgx + RzBmSld + JbIeUNa + VgZlEqG + sJxRfKT + LdYcfZI + lGDhzLK + jAGllnA + NlQBAdy + LvWMFMP + qJdECWn + zQKbTdF + EMpXZck + UxqrFca + rmeWkyk + DYRdvJu + KExGQjy + rdIrsFc + "");
    }

    //垃圾方法
    private void njLwoZoH(long nvpbofbkgx0, byte ovoyfzv1, boolean gqxjwhqjqt2, float vvfnftzl3) {
        float vvfnftzl3a = vvfnftzl3;
        boolean gqxjwhqjqt2a = gqxjwhqjqt2;
        byte ovoyfzv1a = ovoyfzv1;
        long nvpbofbkgx0a = nvpbofbkgx0;
        new StringBuffer("njLwoZoH" + nvpbofbkgx0a + ovoyfzv1a + vvfnftzl3a + gqxjwhqjqt2a + "njLwoZoH" + KExGQjy + JbIeUNa + jAGllnA + LvWMFMP + UxqrFca + EMpXZck + lGDhzLK + LdYcfZI + sJxRfKT + qJdECWn + RzBmSld + XPYKqgx + NlQBAdy + zQKbTdF + rdIrsFc + rmeWkyk + DYRdvJu + VgZlEqG + "");
    }

    //垃圾方法
    private void jrfeGrKp(float hflfjmttcc0, short sgtkaiw1) {
        short sgtkaiw1a = sgtkaiw1;
        float hflfjmttcc0a = hflfjmttcc0;
        new StringReader("jrfeGrKp" + sgtkaiw1a + hflfjmttcc0a + "jrfeGrKp" + rmeWkyk + LvWMFMP + NlQBAdy + JbIeUNa + RzBmSld + XPYKqgx + EMpXZck + KExGQjy + rdIrsFc + zQKbTdF + DYRdvJu + sJxRfKT + VgZlEqG + LdYcfZI + lGDhzLK + UxqrFca + qJdECWn + jAGllnA + "");
    }

    //垃圾方法
    private void JqGHFSpd(short vyykwwjl0, int qccimre1, float hytxehehfd2, short mahnypm3, boolean bodyvojecj4) {
        boolean bodyvojecj4a = bodyvojecj4;
        short mahnypm3a = mahnypm3;
        float hytxehehfd2a = hytxehehfd2;
        int qccimre1a = qccimre1;
        short vyykwwjl0a = vyykwwjl0;
        TextUtils.isDigitsOnly("JqGHFSpd" + mahnypm3a + bodyvojecj4a + vyykwwjl0a + hytxehehfd2a + qccimre1a + "JqGHFSpd" + rmeWkyk + LvWMFMP + DYRdvJu + rdIrsFc + XPYKqgx + RzBmSld + jAGllnA + JbIeUNa + lGDhzLK + zQKbTdF + sJxRfKT + LdYcfZI + qJdECWn + VgZlEqG + EMpXZck + KExGQjy + NlQBAdy + UxqrFca + "");
    }

    //垃圾方法
    private void SfksxnVN(short lgupzig0, int eytlalx1) {
        int eytlalx1a = eytlalx1;
        short lgupzig0a = lgupzig0;
        new Thread("SfksxnVN" + lgupzig0a + eytlalx1a + "SfksxnVN" + JbIeUNa + UxqrFca + rdIrsFc + RzBmSld + DYRdvJu + KExGQjy + VgZlEqG + LvWMFMP + zQKbTdF + EMpXZck + lGDhzLK + qJdECWn + NlQBAdy + jAGllnA + LdYcfZI + XPYKqgx + sJxRfKT + rmeWkyk + "");
    }

    public String toString() {
        int eytlalx1 = 92;
        short lgupzig0 = 86;
        boolean bodyvojecj4 = false;
        short mahnypm3 = 81;
        float hytxehehfd2 = 8.8f;
        int qccimre1 = 8;
        short vyykwwjl0 = 56;
        short sgtkaiw1 = 25;
        float hflfjmttcc0 = 78.78f;
        float vvfnftzl3 = 61.61f;
        boolean gqxjwhqjqt2 = false;
        byte ovoyfzv1 = 36;
        long nvpbofbkgx0 = 31L;
        short oaxtkiwc1 = 44;
        long gxtglifns0 = 44L;
        double gwesckftrk4 = 53.53;
        long jukbifvol3 = 4L;
        char ttqzfuuvxn2 = 89;
        int hsprjkd1 = 26;
        short powtyudj0 = 97;
        byte xyfciwjo3 = 42;
        int sjuybmp2 = 98;
        char jpgzvubfh1 = 41;
        boolean xabdzzmxyb0 = false;
        double gukhpijb2 = 26.26;
        double doaehjebff1 = 41.41;
        short pwdaycpkd0 = 54;
        JqGHFSpd(vyykwwjl0, qccimre1, hytxehehfd2, mahnypm3, bodyvojecj4);
        JqGHFSpd(vyykwwjl0, qccimre1, hytxehehfd2, mahnypm3, bodyvojecj4);
        JqGHFSpd(vyykwwjl0, qccimre1, hytxehehfd2, mahnypm3, bodyvojecj4);
        edNVqADB(powtyudj0, hsprjkd1, ttqzfuuvxn2, jukbifvol3, gwesckftrk4);
        alYUnQoX(pwdaycpkd0, doaehjebff1, gukhpijb2);
        jrfeGrKp(hflfjmttcc0, sgtkaiw1);
        SfksxnVN(lgupzig0, eytlalx1);
        JqGHFSpd(vyykwwjl0, qccimre1, hytxehehfd2, mahnypm3, bodyvojecj4);
        edNVqADB(powtyudj0, hsprjkd1, ttqzfuuvxn2, jukbifvol3, gwesckftrk4);
        alYUnQoX(pwdaycpkd0, doaehjebff1, gukhpijb2);
        new WeakReference("" + yKTpBrj + bAmWyvQ + QsGuSFw + OMCUctX + qOUQHlK + "");
        return super.toString();
    }
}
