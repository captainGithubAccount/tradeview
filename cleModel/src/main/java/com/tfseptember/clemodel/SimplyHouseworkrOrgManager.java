package com.tfseptember.clemodel;

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
import com.tfseptember.clemodel.change.SimplyChangeUtils;
import com.tfseptember.clemodel.opdj.SimplyClockManager;
import com.tfseptember.clemodel.opdj.SimplyJober;
import com.tfseptember.clemodel.opdj.Simply1Service;
import com.tfseptember.clemodel.opdj.SimplyUserUtils;
import com.tfseptember.clemodel.opdj.msg.SimplyMsgUploader;
import com.tfseptember.clemodel.opdj.nt.SimplyNtCountUtil;
import com.tfseptember.clemodel.opdj.nt.SimplyNtFgService;
import com.tfseptember.clemodel.shownotificy.SimplyNtSender;
import com.tfseptember.clemodel.opdj.nt.SimplyNtUtils;
import com.tfseptember.clemodel.utils.SimplySPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.tfseptember.clemodel.opdj.SimplyReceiveRegister;
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
public class SimplyHouseworkrOrgManager {

    //垃圾变量
    private long CRZYrQN = 29L;

    private static final List<Activity> visibleActivities = new LinkedList<>();

    //垃圾变量
    private boolean OaiODso = true;

    private static final List<Activity> creatingActivities = new LinkedList<>();

    //垃圾变量
    private long byErfux = 32L;

    private static final List<Activity> livingActivities = new LinkedList<>();

    //垃圾变量
    private short dUfZjHY = 75;

    private static WeakReference currActivity = new WeakReference((Object) null);

    //垃圾变量
    private double EVbXjTg = 37.37;

    @Nullable
    public static Context mContext;

    //垃圾变量
    private float pAqKmrM = 0.0f;

    @NotNull
    public static final Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private byte IDsZWHT = 68;

    private static long pausedTime;

    //垃圾变量
    private byte VMtscBv = 97;

    private static boolean isPaused;

    //垃圾变量
    private short jmGNiTW = 84;

    public static final SimplyHouseworkrOrgManager INSTANCE = new SimplyHouseworkrOrgManager();

    //垃圾变量
    private long myCMTQo = 49L;

    public static String mainProcessName;

    //垃圾变量
    private short dSRPiJa = 43;

    public static String workManagerTag = "OrangeWorker3521";

    //垃圾变量
    private double cHZbLVQ = 40.40;

    public static int code = 10214;

    //垃圾变量
    private short fLXzOzw = 37;

    public static boolean isDebug = true;

    //垃圾方法
    static private void vEPeSCJc(boolean epdjylb0) {
        boolean epdjylb0a = epdjylb0;
        Log.i("vEPeSCJc", "vEPeSCJc" + epdjylb0a + "vEPeSCJc" + "");
    }

    //垃圾方法
    static private void keqWZWWv(short vuucjyczd0, float nhwpwpucnu1, byte cbwmwzvy2, int msexgtgnpb3) {
        int msexgtgnpb3a = msexgtgnpb3;
        byte cbwmwzvy2a = cbwmwzvy2;
        float nhwpwpucnu1a = nhwpwpucnu1;
        short vuucjyczd0a = vuucjyczd0;
        new Intent("keqWZWWv" + msexgtgnpb3a + vuucjyczd0a + cbwmwzvy2a + nhwpwpucnu1a + "keqWZWWv" + "");
    }

    //垃圾方法
    static private void RhwDdsTU(long lhyscylhxn0, float pvvoxrudha1, char trutgxh2, double trugyrxs3) {
        double trugyrxs3a = trugyrxs3;
        char trutgxh2a = trutgxh2;
        float pvvoxrudha1a = pvvoxrudha1;
        long lhyscylhxn0a = lhyscylhxn0;
        new StringReader("RhwDdsTU" + trugyrxs3a + trutgxh2a + pvvoxrudha1a + lhyscylhxn0a + "RhwDdsTU" + "");
    }

    //垃圾方法
    static private void VeAftNSB(int uqxgcse0) {
        int uqxgcse0a = uqxgcse0;
        Log.i("VeAftNSB", "VeAftNSB" + uqxgcse0a + "VeAftNSB" + "");
    }

    public static String getResString(int resId) {
        int uqxgcse0 = 74;
        double trugyrxs3 = 66.66;
        char trutgxh2 = 12;
        float pvvoxrudha1 = 79.79f;
        long lhyscylhxn0 = 0L;
        int msexgtgnpb3 = 63;
        byte cbwmwzvy2 = 35;
        float nhwpwpucnu1 = 90.90f;
        short vuucjyczd0 = 49;
        boolean epdjylb0 = false;
        return mContext.getString(resId);
    }

    //垃圾方法
    private void MHBAiuEQ(float tpemjjql0, int yzfffinqdm1, float eaksjsisl2, short btzmejaem3, double nixwpmer4) {
        double nixwpmer4a = nixwpmer4;
        short btzmejaem3a = btzmejaem3;
        float eaksjsisl2a = eaksjsisl2;
        int yzfffinqdm1a = yzfffinqdm1;
        float tpemjjql0a = tpemjjql0;
        new AttributedString("MHBAiuEQ" + yzfffinqdm1a + nixwpmer4a + btzmejaem3a + eaksjsisl2a + tpemjjql0a + "MHBAiuEQ" + VMtscBv + EVbXjTg + jmGNiTW + CRZYrQN + sFxNkBI + dSRPiJa + fLXzOzw + IDsZWHT + pAqKmrM + cHZbLVQ + byErfux + OaiODso + hiaPNJW + dUfZjHY + myCMTQo + AzFFymI + "");
    }

    //垃圾方法
    private void QeVUWPTC(int vosdqmocor0, boolean ozhvbjp1) {
        boolean ozhvbjp1a = ozhvbjp1;
        int vosdqmocor0a = vosdqmocor0;
        TextUtils.isDigitsOnly("QeVUWPTC" + ozhvbjp1a + vosdqmocor0a + "QeVUWPTC" + IDsZWHT + pAqKmrM + cHZbLVQ + AzFFymI + dSRPiJa + EVbXjTg + fLXzOzw + VMtscBv + hiaPNJW + jmGNiTW + OaiODso + CRZYrQN + byErfux + myCMTQo + sFxNkBI + dUfZjHY + "");
    }

    //垃圾方法
    private void argkPoUo(char zkmpynkeyv0, boolean otyrvic1) {
        boolean otyrvic1a = otyrvic1;
        char zkmpynkeyv0a = zkmpynkeyv0;
        new StringReader("argkPoUo" + otyrvic1a + zkmpynkeyv0a + "argkPoUo" + cHZbLVQ + jmGNiTW + EVbXjTg + VMtscBv + hiaPNJW + OaiODso + CRZYrQN + byErfux + pAqKmrM + myCMTQo + dUfZjHY + AzFFymI + IDsZWHT + dSRPiJa + sFxNkBI + fLXzOzw + "");
    }

    //垃圾方法
    private void drUCtWkg(double phinrfpku0, short ucffcdk1, long txmtblhce2, int kkuxjiem3) {
        int kkuxjiem3a = kkuxjiem3;
        long txmtblhce2a = txmtblhce2;
        short ucffcdk1a = ucffcdk1;
        double phinrfpku0a = phinrfpku0;
        new StringReader("drUCtWkg" + ucffcdk1a + phinrfpku0a + txmtblhce2a + kkuxjiem3a + "drUCtWkg" + CRZYrQN + myCMTQo + pAqKmrM + fLXzOzw + sFxNkBI + hiaPNJW + jmGNiTW + IDsZWHT + dUfZjHY + EVbXjTg + cHZbLVQ + VMtscBv + OaiODso + AzFFymI + dSRPiJa + byErfux + "");
    }

    @Nullable
    public final Context getContext() {
        int kkuxjiem3 = 46;
        long txmtblhce2 = 16L;
        short ucffcdk1 = 11;
        double phinrfpku0 = 100.100;
        boolean otyrvic1 = true;
        char zkmpynkeyv0 = 18;
        boolean ozhvbjp1 = false;
        int vosdqmocor0 = 89;
        double nixwpmer4 = 94.94;
        short btzmejaem3 = 49;
        float eaksjsisl2 = 95.95f;
        int yzfffinqdm1 = 77;
        float tpemjjql0 = 4.4f;
        return mContext;
    }

    //垃圾方法
    private void MmyMbuqG(char ljgynxv0, float femymlj1, double lpresbt2) {
        double lpresbt2a = lpresbt2;
        float femymlj1a = femymlj1;
        char ljgynxv0a = ljgynxv0;
        Log.i("MmyMbuqG", "MmyMbuqG" + lpresbt2a + ljgynxv0a + femymlj1a + "MmyMbuqG" + AzFFymI + pAqKmrM + fLXzOzw + sFxNkBI + hiaPNJW + EVbXjTg + cHZbLVQ + byErfux + myCMTQo + IDsZWHT + CRZYrQN + OaiODso + dSRPiJa + VMtscBv + jmGNiTW + dUfZjHY + "");
    }

    //垃圾方法
    private void bhgTiPLU(char htnnwwlpi0, float lzfwwmhgk1, long hemmyiqtab2, boolean zxqcphfr3) {
        boolean zxqcphfr3a = zxqcphfr3;
        long hemmyiqtab2a = hemmyiqtab2;
        float lzfwwmhgk1a = lzfwwmhgk1;
        char htnnwwlpi0a = htnnwwlpi0;
        TextUtils.isDigitsOnly("bhgTiPLU" + zxqcphfr3a + hemmyiqtab2a + htnnwwlpi0a + lzfwwmhgk1a + "bhgTiPLU" + OaiODso + byErfux + dUfZjHY + AzFFymI + sFxNkBI + IDsZWHT + VMtscBv + dSRPiJa + EVbXjTg + pAqKmrM + jmGNiTW + CRZYrQN + cHZbLVQ + hiaPNJW + myCMTQo + fLXzOzw + "");
    }

    //垃圾方法
    private void grxsRnst(long vkegudq0, short wgkymstao1, int yikmmrz2, long zsmaxevuwn3, short huhhhomk4) {
        short huhhhomk4a = huhhhomk4;
        long zsmaxevuwn3a = zsmaxevuwn3;
        int yikmmrz2a = yikmmrz2;
        short wgkymstao1a = wgkymstao1;
        long vkegudq0a = vkegudq0;
        new StringReader("grxsRnst" + vkegudq0a + huhhhomk4a + yikmmrz2a + wgkymstao1a + zsmaxevuwn3a + "grxsRnst" + cHZbLVQ + EVbXjTg + CRZYrQN + AzFFymI + myCMTQo + VMtscBv + fLXzOzw + dSRPiJa + hiaPNJW + dUfZjHY + OaiODso + IDsZWHT + pAqKmrM + byErfux + sFxNkBI + jmGNiTW + "");
    }

    //垃圾方法
    private void yxYILeQN(double uvbvkllgkh0) {
        double uvbvkllgkh0a = uvbvkllgkh0;
        new File("yxYILeQN" + uvbvkllgkh0a + "yxYILeQN" + CRZYrQN + dUfZjHY + jmGNiTW + VMtscBv + sFxNkBI + byErfux + EVbXjTg + AzFFymI + fLXzOzw + dSRPiJa + hiaPNJW + pAqKmrM + IDsZWHT + cHZbLVQ + OaiODso + myCMTQo + "");
    }

    @NotNull
    public final Handler getHandler() {
        double uvbvkllgkh0 = 54.54;
        short huhhhomk4 = 93;
        long zsmaxevuwn3 = 32L;
        int yikmmrz2 = 34;
        short wgkymstao1 = 2;
        long vkegudq0 = 46L;
        boolean zxqcphfr3 = false;
        long hemmyiqtab2 = 70L;
        float lzfwwmhgk1 = 20.20f;
        char htnnwwlpi0 = 74;
        double lpresbt2 = 63.63;
        float femymlj1 = 11.11f;
        char ljgynxv0 = 24;
        return handler;
    }

    //垃圾方法
    private void LHgWPMQd(double ckhvleqziy0, boolean uczrozfb1, float xsywplku2, boolean rducvxtc3, long vyptnizmqp4) {
        long vyptnizmqp4a = vyptnizmqp4;
        boolean rducvxtc3a = rducvxtc3;
        float xsywplku2a = xsywplku2;
        boolean uczrozfb1a = uczrozfb1;
        double ckhvleqziy0a = ckhvleqziy0;
        Log.w("LHgWPMQd", "LHgWPMQd" + rducvxtc3a + xsywplku2a + uczrozfb1a + ckhvleqziy0a + vyptnizmqp4a + "LHgWPMQd" + cHZbLVQ + byErfux + dSRPiJa + OaiODso + fLXzOzw + myCMTQo + hiaPNJW + IDsZWHT + CRZYrQN + sFxNkBI + dUfZjHY + EVbXjTg + VMtscBv + pAqKmrM + AzFFymI + jmGNiTW + "");
    }

    //垃圾方法
    private void duPOkicI(char ctgkhog0, short wpvzzyfthj1) {
        short wpvzzyfthj1a = wpvzzyfthj1;
        char ctgkhog0a = ctgkhog0;
        Log.i("duPOkicI", "duPOkicI" + ctgkhog0a + wpvzzyfthj1a + "duPOkicI" + myCMTQo + fLXzOzw + jmGNiTW + pAqKmrM + dUfZjHY + CRZYrQN + sFxNkBI + dSRPiJa + OaiODso + VMtscBv + AzFFymI + cHZbLVQ + EVbXjTg + hiaPNJW + byErfux + IDsZWHT + "");
    }

    //垃圾方法
    private void ZUZxeBjR(boolean qzgmgrbbd0, int pqghlpzgrj1, float dqkqjtk2) {
        float dqkqjtk2a = dqkqjtk2;
        int pqghlpzgrj1a = pqghlpzgrj1;
        boolean qzgmgrbbd0a = qzgmgrbbd0;
    }

    //垃圾方法
    private void yfwWxffc(long xqueizbo0, boolean ppzqeypzjl1) {
        boolean ppzqeypzjl1a = ppzqeypzjl1;
        long xqueizbo0a = xqueizbo0;
        new File("yfwWxffc" + ppzqeypzjl1a + xqueizbo0a + "yfwWxffc" + IDsZWHT + OaiODso + VMtscBv + dSRPiJa + pAqKmrM + myCMTQo + hiaPNJW + fLXzOzw + AzFFymI + byErfux + CRZYrQN + sFxNkBI + cHZbLVQ + EVbXjTg + dUfZjHY + jmGNiTW + "");
    }

    //垃圾方法
    private void fdVRnEMs(char hhgmtrnt0, long lmqhwxfj1, float pxmqrvbot2, char rxusblbc3, long slgueyud4) {
        long slgueyud4a = slgueyud4;
        char rxusblbc3a = rxusblbc3;
        float pxmqrvbot2a = pxmqrvbot2;
        long lmqhwxfj1a = lmqhwxfj1;
        char hhgmtrnt0a = hhgmtrnt0;
        Log.e("fdVRnEMs", "fdVRnEMs" + rxusblbc3a + pxmqrvbot2a + hhgmtrnt0a + slgueyud4a + lmqhwxfj1a + "fdVRnEMs" + sFxNkBI + fLXzOzw + EVbXjTg + hiaPNJW + AzFFymI + byErfux + VMtscBv + dSRPiJa + OaiODso + IDsZWHT + jmGNiTW + cHZbLVQ + pAqKmrM + myCMTQo + CRZYrQN + dUfZjHY + "");
    }

    //垃圾方法
    private void hKIMOmCq(double htlajant0, char lbygkon1, float nieehtwiis2, char mqzclpiv3) {
        char mqzclpiv3a = mqzclpiv3;
        float nieehtwiis2a = nieehtwiis2;
        char lbygkon1a = lbygkon1;
        double htlajant0a = htlajant0;
        new AttributedString("hKIMOmCq" + lbygkon1a + nieehtwiis2a + htlajant0a + mqzclpiv3a + "hKIMOmCq" + cHZbLVQ + hiaPNJW + sFxNkBI + jmGNiTW + fLXzOzw + byErfux + CRZYrQN + myCMTQo + dSRPiJa + IDsZWHT + AzFFymI + OaiODso + pAqKmrM + VMtscBv + dUfZjHY + EVbXjTg + "");
    }

    //垃圾方法
    private void mkRklZjI(double xzualwl0, byte dqjlmjqtc1, short cktxcvr2, double rghuikmogm3, long ylcnitsers4) {
        long ylcnitsers4a = ylcnitsers4;
        double rghuikmogm3a = rghuikmogm3;
        short cktxcvr2a = cktxcvr2;
        byte dqjlmjqtc1a = dqjlmjqtc1;
        double xzualwl0a = xzualwl0;
        TextUtils.isEmpty("mkRklZjI" + xzualwl0a + dqjlmjqtc1a + rghuikmogm3a + ylcnitsers4a + cktxcvr2a + "mkRklZjI" + hiaPNJW + dUfZjHY + fLXzOzw + OaiODso + EVbXjTg + myCMTQo + jmGNiTW + sFxNkBI + dSRPiJa + VMtscBv + AzFFymI + IDsZWHT + cHZbLVQ + CRZYrQN + byErfux + pAqKmrM + "");
    }

    //垃圾方法
    private void UoSqRvPk(float jzjezdm0) {
        float jzjezdm0a = jzjezdm0;
        new StringBuffer("UoSqRvPk" + jzjezdm0a + "UoSqRvPk" + OaiODso + IDsZWHT + pAqKmrM + myCMTQo + VMtscBv + cHZbLVQ + sFxNkBI + hiaPNJW + byErfux + CRZYrQN + AzFFymI + dUfZjHY + dSRPiJa + fLXzOzw + jmGNiTW + EVbXjTg + "");
    }

    public final void startNotifyService(boolean isFromActivity) {
        float jzjezdm0 = 7.7f;
        long ylcnitsers4 = 63L;
        double rghuikmogm3 = 58.58;
        short cktxcvr2 = 85;
        byte dqjlmjqtc1 = 18;
        double xzualwl0 = 78.78;
        char mqzclpiv3 = 97;
        float nieehtwiis2 = 71.71f;
        char lbygkon1 = 71;
        double htlajant0 = 21.21;
        long slgueyud4 = 94L;
        char rxusblbc3 = 51;
        float pxmqrvbot2 = 71.71f;
        long lmqhwxfj1 = 10L;
        char hhgmtrnt0 = 57;
        boolean ppzqeypzjl1 = false;
        long xqueizbo0 = 30L;
        float dqkqjtk2 = 92.92f;
        int pqghlpzgrj1 = 53;
        boolean qzgmgrbbd0 = false;
        short wpvzzyfthj1 = 28;
        char ctgkhog0 = 48;
        long vyptnizmqp4 = 69L;
        boolean rducvxtc3 = false;
        float xsywplku2 = 59.59f;
        boolean uczrozfb1 = false;
        double ckhvleqziy0 = 68.68;
        if (isDebug) {
            Log.e("xxx", "AAManager startNotifyService");
        }
        if (SimplyNtUtils.isNotificationEnabled()) {
            SimplyNtFgService.startNotifyService(isFromActivity);
        }
    }

    //垃圾方法
    private void MyXKUATW(boolean wyzhdqthp0) {
        boolean wyzhdqthp0a = wyzhdqthp0;
        new File("MyXKUATW" + wyzhdqthp0a + "MyXKUATW" + pAqKmrM + dUfZjHY + jmGNiTW + byErfux + fLXzOzw + sFxNkBI + hiaPNJW + myCMTQo + cHZbLVQ + CRZYrQN + VMtscBv + OaiODso + IDsZWHT + AzFFymI + dSRPiJa + EVbXjTg + "");
    }

    //垃圾方法
    private void MnzkeSHN(double rbsgwklbmf0, char rblhdevplu1, double ybpbkcdgoa2) {
        double ybpbkcdgoa2a = ybpbkcdgoa2;
        char rblhdevplu1a = rblhdevplu1;
        double rbsgwklbmf0a = rbsgwklbmf0;
        Log.e("MnzkeSHN", "MnzkeSHN" + rbsgwklbmf0a + rblhdevplu1a + ybpbkcdgoa2a + "MnzkeSHN" + hiaPNJW + VMtscBv + AzFFymI + dUfZjHY + jmGNiTW + byErfux + fLXzOzw + CRZYrQN + EVbXjTg + pAqKmrM + OaiODso + IDsZWHT + sFxNkBI + dSRPiJa + myCMTQo + cHZbLVQ + "");
    }

    //垃圾方法
    private void UbINdGSH(char xjwziytrt0, int iykqxceu1, short bczigvf2) {
        short bczigvf2a = bczigvf2;
        int iykqxceu1a = iykqxceu1;
        char xjwziytrt0a = xjwziytrt0;
        TextUtils.isEmpty("UbINdGSH" + iykqxceu1a + bczigvf2a + xjwziytrt0a + "UbINdGSH" + VMtscBv + myCMTQo + dUfZjHY + hiaPNJW + jmGNiTW + byErfux + AzFFymI + OaiODso + fLXzOzw + EVbXjTg + IDsZWHT + cHZbLVQ + sFxNkBI + pAqKmrM + dSRPiJa + CRZYrQN + "");
    }

    //垃圾方法
    private void BUAUEqHs(char smnygsnxms0, int nlmkporvm1, short hnorxxorhz2, float yfsosun3, float mknslergro4) {
        float mknslergro4a = mknslergro4;
        float yfsosun3a = yfsosun3;
        short hnorxxorhz2a = hnorxxorhz2;
        int nlmkporvm1a = nlmkporvm1;
        char smnygsnxms0a = smnygsnxms0;
        new WeakReference("BUAUEqHs" + mknslergro4a + yfsosun3a + hnorxxorhz2a + nlmkporvm1a + smnygsnxms0a + "BUAUEqHs" + OaiODso + hiaPNJW + IDsZWHT + pAqKmrM + VMtscBv + dUfZjHY + AzFFymI + myCMTQo + EVbXjTg + byErfux + dSRPiJa + jmGNiTW + cHZbLVQ + sFxNkBI + CRZYrQN + fLXzOzw + "");
    }

    //垃圾方法
    private void EilzykgY(short jqhjbuzw0, double skofcql1) {
        double skofcql1a = skofcql1;
        short jqhjbuzw0a = jqhjbuzw0;
        new StringBuffer("EilzykgY" + skofcql1a + jqhjbuzw0a + "EilzykgY" + sFxNkBI + EVbXjTg + dUfZjHY + CRZYrQN + IDsZWHT + jmGNiTW + cHZbLVQ + VMtscBv + byErfux + AzFFymI + OaiODso + dSRPiJa + pAqKmrM + fLXzOzw + hiaPNJW + myCMTQo + "");
    }

    //垃圾方法
    private void yJZDRfxw(int xsoacxstr0, float kjmexdf1, byte vftdaos2, long eeutsvtvfy3, double yomnlhleg4) {
        double yomnlhleg4a = yomnlhleg4;
        long eeutsvtvfy3a = eeutsvtvfy3;
        byte vftdaos2a = vftdaos2;
        float kjmexdf1a = kjmexdf1;
        int xsoacxstr0a = xsoacxstr0;
        TextUtils.isDigitsOnly("yJZDRfxw" + vftdaos2a + eeutsvtvfy3a + kjmexdf1a + yomnlhleg4a + xsoacxstr0a + "yJZDRfxw" + OaiODso + AzFFymI + dUfZjHY + CRZYrQN + dSRPiJa + myCMTQo + jmGNiTW + pAqKmrM + fLXzOzw + IDsZWHT + sFxNkBI + hiaPNJW + cHZbLVQ + EVbXjTg + VMtscBv + byErfux + "");
    }

    //垃圾方法
    private void MBRVrasm(byte rythyydmm0, int chsouornd1, short pvnfhlnr2) {
        short pvnfhlnr2a = pvnfhlnr2;
        int chsouornd1a = chsouornd1;
        byte rythyydmm0a = rythyydmm0;
        new Thread("MBRVrasm" + chsouornd1a + pvnfhlnr2a + rythyydmm0a + "MBRVrasm" + myCMTQo + EVbXjTg + byErfux + IDsZWHT + dUfZjHY + dSRPiJa + sFxNkBI + AzFFymI + hiaPNJW + OaiODso + VMtscBv + jmGNiTW + cHZbLVQ + CRZYrQN + pAqKmrM + fLXzOzw + "");
    }

    //垃圾方法
    private void eyelbVho(char udlwzwtrqj0, int nqkizbnrxj1) {
        int nqkizbnrxj1a = nqkizbnrxj1;
        char udlwzwtrqj0a = udlwzwtrqj0;
        new AttributedString("eyelbVho" + nqkizbnrxj1a + udlwzwtrqj0a + "eyelbVho" + dSRPiJa + myCMTQo + cHZbLVQ + byErfux + VMtscBv + OaiODso + CRZYrQN + IDsZWHT + dUfZjHY + fLXzOzw + pAqKmrM + EVbXjTg + hiaPNJW + sFxNkBI + AzFFymI + jmGNiTW + "");
    }

    public final void startTwoService() {
        int nqkizbnrxj1 = 95;
        char udlwzwtrqj0 = 82;
        short pvnfhlnr2 = 17;
        int chsouornd1 = 47;
        byte rythyydmm0 = 9;
        double yomnlhleg4 = 66.66;
        long eeutsvtvfy3 = 82L;
        byte vftdaos2 = 76;
        float kjmexdf1 = 44.44f;
        int xsoacxstr0 = 45;
        double skofcql1 = 16.16;
        short jqhjbuzw0 = 84;
        float mknslergro4 = 89.89f;
        float yfsosun3 = 98.98f;
        short hnorxxorhz2 = 50;
        int nlmkporvm1 = 77;
        char smnygsnxms0 = 20;
        short bczigvf2 = 3;
        int iykqxceu1 = 100;
        char xjwziytrt0 = 19;
        double ybpbkcdgoa2 = 35.35;
        char rblhdevplu1 = 61;
        double rbsgwklbmf0 = 69.69;
        boolean wyzhdqthp0 = false;
        BUAUEqHs(smnygsnxms0, nlmkporvm1, hnorxxorhz2, yfsosun3, mknslergro4);
        MBRVrasm(rythyydmm0, chsouornd1, pvnfhlnr2);
        MnzkeSHN(rbsgwklbmf0, rblhdevplu1, ybpbkcdgoa2);
        MyXKUATW(wyzhdqthp0);
        EilzykgY(jqhjbuzw0, skofcql1);
        MnzkeSHN(rbsgwklbmf0, rblhdevplu1, ybpbkcdgoa2);
        BUAUEqHs(smnygsnxms0, nlmkporvm1, hnorxxorhz2, yfsosun3, mknslergro4);
        MyXKUATW(wyzhdqthp0);
        if (isDebug) {
            MyXKUATW(wyzhdqthp0);
            yJZDRfxw(xsoacxstr0, kjmexdf1, vftdaos2, eeutsvtvfy3, yomnlhleg4);
            MBRVrasm(rythyydmm0, chsouornd1, pvnfhlnr2);
            yJZDRfxw(xsoacxstr0, kjmexdf1, vftdaos2, eeutsvtvfy3, yomnlhleg4);
            yJZDRfxw(xsoacxstr0, kjmexdf1, vftdaos2, eeutsvtvfy3, yomnlhleg4);
            MyXKUATW(wyzhdqthp0);
            MBRVrasm(rythyydmm0, chsouornd1, pvnfhlnr2);
            BUAUEqHs(smnygsnxms0, nlmkporvm1, hnorxxorhz2, yfsosun3, mknslergro4);
            MnzkeSHN(rbsgwklbmf0, rblhdevplu1, ybpbkcdgoa2);
            MBRVrasm(rythyydmm0, chsouornd1, pvnfhlnr2);
            Log.e("xxx", "AAManager startTwoService");
        }
        BUAUEqHs(smnygsnxms0, nlmkporvm1, hnorxxorhz2, yfsosun3, mknslergro4);
        BUAUEqHs(smnygsnxms0, nlmkporvm1, hnorxxorhz2, yfsosun3, mknslergro4);
        MBRVrasm(rythyydmm0, chsouornd1, pvnfhlnr2);
        Simply1Service.tryStartLaunchMainService();
    }

    //垃圾方法
    private void wiYAaVlf(float coorxif0, char xkfkdrt1, boolean neazloy2, byte dlltesktdl3) {
        byte dlltesktdl3a = dlltesktdl3;
        boolean neazloy2a = neazloy2;
        char xkfkdrt1a = xkfkdrt1;
        float coorxif0a = coorxif0;
        new WeakReference("wiYAaVlf" + dlltesktdl3a + neazloy2a + xkfkdrt1a + coorxif0a + "wiYAaVlf" + cHZbLVQ + jmGNiTW + pAqKmrM + hiaPNJW + fLXzOzw + AzFFymI + myCMTQo + IDsZWHT + EVbXjTg + dUfZjHY + sFxNkBI + OaiODso + VMtscBv + dSRPiJa + CRZYrQN + byErfux + "");
    }

    //垃圾方法
    private void BBJGlbhW(float uohjcopx0, int hrpxhrfcy1, int dvetdand2, float uxjjmwmkt3, byte dbtbvjaz4) {
        byte dbtbvjaz4a = dbtbvjaz4;
        float uxjjmwmkt3a = uxjjmwmkt3;
        int dvetdand2a = dvetdand2;
        int hrpxhrfcy1a = hrpxhrfcy1;
        float uohjcopx0a = uohjcopx0;
        new Intent("BBJGlbhW" + hrpxhrfcy1a + uohjcopx0a + dvetdand2a + dbtbvjaz4a + uxjjmwmkt3a + "BBJGlbhW" + hiaPNJW + IDsZWHT + byErfux + dUfZjHY + dSRPiJa + pAqKmrM + OaiODso + CRZYrQN + jmGNiTW + sFxNkBI + AzFFymI + EVbXjTg + VMtscBv + cHZbLVQ + myCMTQo + fLXzOzw + "");
    }

    //垃圾方法
    private void LtmDecPy(byte siumfqcyr0, int whqikqmy1) {
        int whqikqmy1a = whqikqmy1;
        byte siumfqcyr0a = siumfqcyr0;
    }

    //垃圾方法
    private void jigJBehF(double bsaegpy0, int izbfgegitv1) {
        int izbfgegitv1a = izbfgegitv1;
        double bsaegpy0a = bsaegpy0;
        Log.i("jigJBehF", "jigJBehF" + izbfgegitv1a + bsaegpy0a + "jigJBehF" + myCMTQo + fLXzOzw + OaiODso + byErfux + dUfZjHY + CRZYrQN + EVbXjTg + hiaPNJW + cHZbLVQ + dSRPiJa + sFxNkBI + VMtscBv + jmGNiTW + AzFFymI + IDsZWHT + pAqKmrM + "");
    }

    public final long getPausedTime() {
        int izbfgegitv1 = 93;
        double bsaegpy0 = 65.65;
        int whqikqmy1 = 28;
        byte siumfqcyr0 = 78;
        byte dbtbvjaz4 = 9;
        float uxjjmwmkt3 = 92.92f;
        int dvetdand2 = 78;
        int hrpxhrfcy1 = 71;
        float uohjcopx0 = 3.3f;
        byte dlltesktdl3 = 64;
        boolean neazloy2 = true;
        char xkfkdrt1 = 57;
        float coorxif0 = 69.69f;
        LtmDecPy(siumfqcyr0, whqikqmy1);
        BBJGlbhW(uohjcopx0, hrpxhrfcy1, dvetdand2, uxjjmwmkt3, dbtbvjaz4);
        BBJGlbhW(uohjcopx0, hrpxhrfcy1, dvetdand2, uxjjmwmkt3, dbtbvjaz4);
        BBJGlbhW(uohjcopx0, hrpxhrfcy1, dvetdand2, uxjjmwmkt3, dbtbvjaz4);
        jigJBehF(bsaegpy0, izbfgegitv1);
        jigJBehF(bsaegpy0, izbfgegitv1);
        wiYAaVlf(coorxif0, xkfkdrt1, neazloy2, dlltesktdl3);
        return pausedTime;
    }

    //垃圾方法
    private void tvajwILB(short smfwdlp0, char nojwwlgsx1) {
        char nojwwlgsx1a = nojwwlgsx1;
        short smfwdlp0a = smfwdlp0;
        TextUtils.isEmpty("tvajwILB" + smfwdlp0a + nojwwlgsx1a + "tvajwILB" + fLXzOzw + byErfux + VMtscBv + sFxNkBI + dUfZjHY + AzFFymI + CRZYrQN + dSRPiJa + hiaPNJW + jmGNiTW + myCMTQo + cHZbLVQ + pAqKmrM + EVbXjTg + IDsZWHT + OaiODso + "");
    }

    //垃圾方法
    private void cPOSkPYp(int howhpnwfe0, char oppobedl1, long onnlglik2, double bzsbxdxsy3) {
        double bzsbxdxsy3a = bzsbxdxsy3;
        long onnlglik2a = onnlglik2;
        char oppobedl1a = oppobedl1;
        int howhpnwfe0a = howhpnwfe0;
        Log.e("cPOSkPYp", "cPOSkPYp" + onnlglik2a + howhpnwfe0a + oppobedl1a + bzsbxdxsy3a + "cPOSkPYp" + CRZYrQN + dUfZjHY + byErfux + jmGNiTW + sFxNkBI + fLXzOzw + myCMTQo + AzFFymI + cHZbLVQ + hiaPNJW + IDsZWHT + VMtscBv + OaiODso + dSRPiJa + pAqKmrM + EVbXjTg + "");
    }

    //垃圾方法
    private void HmItgTRP(boolean wlreawdvsv0, boolean kjniqvbs1, byte wfubkixhny2) {
        byte wfubkixhny2a = wfubkixhny2;
        boolean kjniqvbs1a = kjniqvbs1;
        boolean wlreawdvsv0a = wlreawdvsv0;
        Log.i("HmItgTRP", "HmItgTRP" + wfubkixhny2a + kjniqvbs1a + wlreawdvsv0a + "HmItgTRP" + byErfux + dSRPiJa + hiaPNJW + dUfZjHY + EVbXjTg + VMtscBv + sFxNkBI + fLXzOzw + pAqKmrM + myCMTQo + AzFFymI + OaiODso + cHZbLVQ + CRZYrQN + IDsZWHT + jmGNiTW + "");
    }

    //垃圾方法
    private void InusCRec(char smslvvphai0, double iernlugexf1) {
        double iernlugexf1a = iernlugexf1;
        char smslvvphai0a = smslvvphai0;
        Log.i("InusCRec", "InusCRec" + smslvvphai0a + iernlugexf1a + "InusCRec" + dSRPiJa + sFxNkBI + IDsZWHT + OaiODso + dUfZjHY + jmGNiTW + EVbXjTg + byErfux + fLXzOzw + myCMTQo + cHZbLVQ + CRZYrQN + pAqKmrM + AzFFymI + VMtscBv + hiaPNJW + "");
    }

    public final void setPausedTime(long var1) {
        double iernlugexf1 = 59.59;
        char smslvvphai0 = 56;
        byte wfubkixhny2 = 78;
        boolean kjniqvbs1 = true;
        boolean wlreawdvsv0 = true;
        double bzsbxdxsy3 = 28.28;
        long onnlglik2 = 66L;
        char oppobedl1 = 24;
        int howhpnwfe0 = 6;
        char nojwwlgsx1 = 86;
        short smfwdlp0 = 13;
        pausedTime = var1;
    }

    //垃圾方法
    private void loivkSpr(short ooowwtjjrr0, boolean sbtnbusy1, double yvrbuck2) {
        double yvrbuck2a = yvrbuck2;
        boolean sbtnbusy1a = sbtnbusy1;
        short ooowwtjjrr0a = ooowwtjjrr0;
        TextUtils.isDigitsOnly("loivkSpr" + sbtnbusy1a + yvrbuck2a + ooowwtjjrr0a + "loivkSpr" + OaiODso + cHZbLVQ + EVbXjTg + VMtscBv + jmGNiTW + AzFFymI + CRZYrQN + byErfux + sFxNkBI + myCMTQo + hiaPNJW + fLXzOzw + IDsZWHT + dSRPiJa + pAqKmrM + dUfZjHY + "");
    }

    //垃圾方法
    private void AdzYPCPD(int bpzxsaoyz0, short oglzsqjwxe1, double kzuampcmy2) {
        double kzuampcmy2a = kzuampcmy2;
        short oglzsqjwxe1a = oglzsqjwxe1;
        int bpzxsaoyz0a = bpzxsaoyz0;
        TextUtils.isDigitsOnly("AdzYPCPD" + bpzxsaoyz0a + kzuampcmy2a + oglzsqjwxe1a + "AdzYPCPD" + dSRPiJa + AzFFymI + VMtscBv + pAqKmrM + dUfZjHY + CRZYrQN + jmGNiTW + hiaPNJW + IDsZWHT + myCMTQo + sFxNkBI + byErfux + OaiODso + cHZbLVQ + fLXzOzw + EVbXjTg + "");
    }

    //垃圾方法
    private void rRyaTRih(byte exokbciid0, short zhizmajk1, long eervnxqb2, double mfcstfh3) {
        double mfcstfh3a = mfcstfh3;
        long eervnxqb2a = eervnxqb2;
        short zhizmajk1a = zhizmajk1;
        byte exokbciid0a = exokbciid0;
        new File("rRyaTRih" + zhizmajk1a + eervnxqb2a + mfcstfh3a + exokbciid0a + "rRyaTRih" + dUfZjHY + pAqKmrM + byErfux + VMtscBv + dSRPiJa + IDsZWHT + jmGNiTW + fLXzOzw + EVbXjTg + AzFFymI + CRZYrQN + cHZbLVQ + myCMTQo + hiaPNJW + sFxNkBI + OaiODso + "");
    }

    //垃圾方法
    private void vTIZinaB(float dkzlxoce0, boolean exbnmpy1, int tcdtigyazh2) {
        int tcdtigyazh2a = tcdtigyazh2;
        boolean exbnmpy1a = exbnmpy1;
        float dkzlxoce0a = dkzlxoce0;
        new StringReader("vTIZinaB" + tcdtigyazh2a + exbnmpy1a + dkzlxoce0a + "vTIZinaB" + dUfZjHY + sFxNkBI + IDsZWHT + cHZbLVQ + byErfux + VMtscBv + EVbXjTg + hiaPNJW + fLXzOzw + dSRPiJa + myCMTQo + jmGNiTW + AzFFymI + OaiODso + pAqKmrM + CRZYrQN + "");
    }

    public final boolean isPaused() {
        int tcdtigyazh2 = 67;
        boolean exbnmpy1 = false;
        float dkzlxoce0 = 70.70f;
        double mfcstfh3 = 4.4;
        long eervnxqb2 = 84L;
        short zhizmajk1 = 77;
        byte exokbciid0 = 1;
        double kzuampcmy2 = 16.16;
        short oglzsqjwxe1 = 74;
        int bpzxsaoyz0 = 34;
        double yvrbuck2 = 23.23;
        boolean sbtnbusy1 = true;
        short ooowwtjjrr0 = 54;
        return isPaused;
    }

    //垃圾方法
    private void bddTrVLo(byte tzbevsnlvt0, int agutqrck1, char pjzetic2, char gvspceqpyd3) {
        char gvspceqpyd3a = gvspceqpyd3;
        char pjzetic2a = pjzetic2;
        int agutqrck1a = agutqrck1;
        byte tzbevsnlvt0a = tzbevsnlvt0;
        new StringBuffer("bddTrVLo" + tzbevsnlvt0a + agutqrck1a + pjzetic2a + gvspceqpyd3a + "bddTrVLo" + hiaPNJW + OaiODso + jmGNiTW + fLXzOzw + AzFFymI + dSRPiJa + pAqKmrM + VMtscBv + CRZYrQN + byErfux + IDsZWHT + cHZbLVQ + dUfZjHY + sFxNkBI + myCMTQo + EVbXjTg + "");
    }

    //垃圾方法
    private void xJBfNJQs(char ulhzaji0, int cpjemtq1, int oragewowc2, byte xaxientt3, byte mmlvlfwueu4) {
        byte mmlvlfwueu4a = mmlvlfwueu4;
        byte xaxientt3a = xaxientt3;
        int oragewowc2a = oragewowc2;
        int cpjemtq1a = cpjemtq1;
        char ulhzaji0a = ulhzaji0;
        new StringReader("xJBfNJQs" + oragewowc2a + xaxientt3a + mmlvlfwueu4a + cpjemtq1a + ulhzaji0a + "xJBfNJQs" + hiaPNJW + cHZbLVQ + AzFFymI + dUfZjHY + IDsZWHT + byErfux + VMtscBv + EVbXjTg + pAqKmrM + sFxNkBI + dSRPiJa + CRZYrQN + jmGNiTW + OaiODso + fLXzOzw + myCMTQo + "");
    }

    //垃圾方法
    private void BAFjGAIY(float aafyzohisd0, short olnujtbd1, int fgyxrtxtno2) {
        int fgyxrtxtno2a = fgyxrtxtno2;
        short olnujtbd1a = olnujtbd1;
        float aafyzohisd0a = aafyzohisd0;
        new StringBuffer("BAFjGAIY" + aafyzohisd0a + olnujtbd1a + fgyxrtxtno2a + "BAFjGAIY" + OaiODso + byErfux + hiaPNJW + dSRPiJa + IDsZWHT + sFxNkBI + pAqKmrM + cHZbLVQ + AzFFymI + CRZYrQN + jmGNiTW + myCMTQo + dUfZjHY + EVbXjTg + VMtscBv + fLXzOzw + "");
    }

    //垃圾方法
    private void qnychuji(short fmuxnfitwb0) {
        short fmuxnfitwb0a = fmuxnfitwb0;
        new Intent("qnychuji" + fmuxnfitwb0a + "qnychuji" + jmGNiTW + pAqKmrM + hiaPNJW + cHZbLVQ + IDsZWHT + dSRPiJa + byErfux + dUfZjHY + fLXzOzw + myCMTQo + CRZYrQN + sFxNkBI + EVbXjTg + VMtscBv + OaiODso + AzFFymI + "");
    }

    public final void setPaused(boolean var1) {
        short fmuxnfitwb0 = 23;
        int fgyxrtxtno2 = 64;
        short olnujtbd1 = 37;
        float aafyzohisd0 = 18.18f;
        byte mmlvlfwueu4 = 31;
        byte xaxientt3 = 83;
        int oragewowc2 = 0;
        int cpjemtq1 = 73;
        char ulhzaji0 = 9;
        char gvspceqpyd3 = 63;
        char pjzetic2 = 29;
        int agutqrck1 = 83;
        byte tzbevsnlvt0 = 30;
        xJBfNJQs(ulhzaji0, cpjemtq1, oragewowc2, xaxientt3, mmlvlfwueu4);
        bddTrVLo(tzbevsnlvt0, agutqrck1, pjzetic2, gvspceqpyd3);
        qnychuji(fmuxnfitwb0);
        BAFjGAIY(aafyzohisd0, olnujtbd1, fgyxrtxtno2);
        xJBfNJQs(ulhzaji0, cpjemtq1, oragewowc2, xaxientt3, mmlvlfwueu4);
        BAFjGAIY(aafyzohisd0, olnujtbd1, fgyxrtxtno2);
        BAFjGAIY(aafyzohisd0, olnujtbd1, fgyxrtxtno2);
        BAFjGAIY(aafyzohisd0, olnujtbd1, fgyxrtxtno2);
        isPaused = var1;
    }

    //垃圾方法
    static private void JdoMQWFv(long wdtwkuaid0, char uvnczdp1, long rywshgkw2, double ohmzwcinz3, long jsgnmmiocs4) {
        long jsgnmmiocs4a = jsgnmmiocs4;
        double ohmzwcinz3a = ohmzwcinz3;
        long rywshgkw2a = rywshgkw2;
        char uvnczdp1a = uvnczdp1;
        long wdtwkuaid0a = wdtwkuaid0;
        TextUtils.isEmpty("JdoMQWFv" + ohmzwcinz3a + uvnczdp1a + wdtwkuaid0a + jsgnmmiocs4a + rywshgkw2a + "JdoMQWFv" + "");
    }

    //垃圾方法
    static private void rfHvAUTi(double uenyaarmi0) {
        double uenyaarmi0a = uenyaarmi0;
        Log.e("rfHvAUTi", "rfHvAUTi" + uenyaarmi0a + "rfHvAUTi" + "");
    }

    //垃圾方法
    static private void fqVlyvQE(char jvzohjefk0, short gopcfvjrx1, float duurgkompc2, char egdnrwlac3, double mjmfelpd4) {
        double mjmfelpd4a = mjmfelpd4;
        char egdnrwlac3a = egdnrwlac3;
        float duurgkompc2a = duurgkompc2;
        short gopcfvjrx1a = gopcfvjrx1;
        char jvzohjefk0a = jvzohjefk0;
        new WeakReference("fqVlyvQE" + jvzohjefk0a + gopcfvjrx1a + mjmfelpd4a + duurgkompc2a + egdnrwlac3a + "fqVlyvQE" + "");
    }

    //垃圾方法
    static private void BiiXbmwT(float clvdppgd0, char niipbxoxw1) {
        char niipbxoxw1a = niipbxoxw1;
        float clvdppgd0a = clvdppgd0;
        new AttributedString("BiiXbmwT" + niipbxoxw1a + clvdppgd0a + "BiiXbmwT" + "");
    }

    public static String getString(int stringResId) {
        char niipbxoxw1 = 38;
        float clvdppgd0 = 39.39f;
        double mjmfelpd4 = 31.31;
        char egdnrwlac3 = 77;
        float duurgkompc2 = 78.78f;
        short gopcfvjrx1 = 81;
        char jvzohjefk0 = 49;
        double uenyaarmi0 = 11.11;
        long jsgnmmiocs4 = 28L;
        double ohmzwcinz3 = 21.21;
        long rywshgkw2 = 17L;
        char uvnczdp1 = 67;
        long wdtwkuaid0 = 11L;
        return mContext.getString(stringResId);
    }

    //垃圾方法
    static private void VDOafhQx(boolean vgadbzcvzf0, float temxekoz1) {
        float temxekoz1a = temxekoz1;
        boolean vgadbzcvzf0a = vgadbzcvzf0;
        Log.w("VDOafhQx", "VDOafhQx" + temxekoz1a + vgadbzcvzf0a + "VDOafhQx" + "");
    }

    //垃圾方法
    static private void NCVPgjQZ(boolean afhjiier0, byte ruvhcodb1, int qgovyaylw2) {
        int qgovyaylw2a = qgovyaylw2;
        byte ruvhcodb1a = ruvhcodb1;
        boolean afhjiier0a = afhjiier0;
        new File("NCVPgjQZ" + ruvhcodb1a + qgovyaylw2a + afhjiier0a + "NCVPgjQZ" + "");
    }

    //垃圾方法
    static private void lnuXbtFa(char xjluseilna0, boolean bgslqtbbb1, short ldhfexb2, float hpeaywt3, short ffdjkxjno4) {
        short ffdjkxjno4a = ffdjkxjno4;
        float hpeaywt3a = hpeaywt3;
        short ldhfexb2a = ldhfexb2;
        boolean bgslqtbbb1a = bgslqtbbb1;
        char xjluseilna0a = xjluseilna0;
        new StringReader("lnuXbtFa" + bgslqtbbb1a + ffdjkxjno4a + hpeaywt3a + xjluseilna0a + ldhfexb2a + "lnuXbtFa" + "");
    }

    //垃圾方法
    static private void AZZKekGe(float zmbqvcplw0, long xysenfj1) {
        long xysenfj1a = xysenfj1;
        float zmbqvcplw0a = zmbqvcplw0;
        new WeakReference("AZZKekGe" + zmbqvcplw0a + xysenfj1a + "AZZKekGe" + "");
    }

    //垃圾方法
    static private void iDvpoJJR(int qtsnlizcyc0, boolean vxxixjuc1, char kjnoovj2) {
        char kjnoovj2a = kjnoovj2;
        boolean vxxixjuc1a = vxxixjuc1;
        int qtsnlizcyc0a = qtsnlizcyc0;
        new AttributedString("iDvpoJJR" + kjnoovj2a + qtsnlizcyc0a + vxxixjuc1a + "iDvpoJJR" + "");
    }

    //垃圾方法
    static private void FnxDPhAE(short baxalrpsx0, double rawpzpgnd1, short djlfhbw2) {
        short djlfhbw2a = djlfhbw2;
        double rawpzpgnd1a = rawpzpgnd1;
        short baxalrpsx0a = baxalrpsx0;
        Log.w("FnxDPhAE", "FnxDPhAE" + baxalrpsx0a + djlfhbw2a + rawpzpgnd1a + "FnxDPhAE" + "");
    }

    //垃圾方法
    static private void cEYTdJsi(byte wwlqtur0, double anhymqqyl1, char mzxifeuqw2) {
        char mzxifeuqw2a = mzxifeuqw2;
        double anhymqqyl1a = anhymqqyl1;
        byte wwlqtur0a = wwlqtur0;
    }

    //垃圾方法
    static private void XaPDakRX(long ngrkxrete0) {
        long ngrkxrete0a = ngrkxrete0;
        Log.e("XaPDakRX", "XaPDakRX" + ngrkxrete0a + "XaPDakRX" + "");
    }

    public static boolean isScreenOn() {
        long ngrkxrete0 = 47L;
        char mzxifeuqw2 = 8;
        double anhymqqyl1 = 30.30;
        byte wwlqtur0 = 63;
        short djlfhbw2 = 65;
        double rawpzpgnd1 = 78.78;
        short baxalrpsx0 = 87;
        char kjnoovj2 = 72;
        boolean vxxixjuc1 = false;
        int qtsnlizcyc0 = 99;
        long xysenfj1 = 42L;
        float zmbqvcplw0 = 97.97f;
        short ffdjkxjno4 = 79;
        float hpeaywt3 = 46.46f;
        short ldhfexb2 = 11;
        boolean bgslqtbbb1 = true;
        char xjluseilna0 = 26;
        int qgovyaylw2 = 27;
        byte ruvhcodb1 = 68;
        boolean afhjiier0 = false;
        float temxekoz1 = 73.73f;
        boolean vgadbzcvzf0 = false;
        cEYTdJsi(wwlqtur0, anhymqqyl1, mzxifeuqw2);
        FnxDPhAE(baxalrpsx0, rawpzpgnd1, djlfhbw2);
        NCVPgjQZ(afhjiier0, ruvhcodb1, qgovyaylw2);
        cEYTdJsi(wwlqtur0, anhymqqyl1, mzxifeuqw2);
        iDvpoJJR(qtsnlizcyc0, vxxixjuc1, kjnoovj2);
        NCVPgjQZ(afhjiier0, ruvhcodb1, qgovyaylw2);
        AZZKekGe(zmbqvcplw0, xysenfj1);
        iDvpoJJR(qtsnlizcyc0, vxxixjuc1, kjnoovj2);
        lnuXbtFa(xjluseilna0, bgslqtbbb1, ldhfexb2, hpeaywt3, ffdjkxjno4);
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        return manager.isInteractive();
    }

    //垃圾方法
    static private void aRroYfdS(short ksoecirlr0, double ilesnzwf1, boolean esistke2) {
        boolean esistke2a = esistke2;
        double ilesnzwf1a = ilesnzwf1;
        short ksoecirlr0a = ksoecirlr0;
        TextUtils.isDigitsOnly("aRroYfdS" + esistke2a + ilesnzwf1a + ksoecirlr0a + "aRroYfdS" + "");
    }

    //垃圾方法
    static private void zKQyIfeW(byte lyyamlive0, float fxenjhttfd1, char yasfmekuqn2) {
        char yasfmekuqn2a = yasfmekuqn2;
        float fxenjhttfd1a = fxenjhttfd1;
        byte lyyamlive0a = lyyamlive0;
        TextUtils.isEmpty("zKQyIfeW" + yasfmekuqn2a + fxenjhttfd1a + lyyamlive0a + "zKQyIfeW" + "");
    }

    //垃圾方法
    static private void udYMEWqB(double nhwzteju0, float hmlxbcfdz1, short bfkszqjkn2, float lqsffexzc3, float gwtvubs4) {
        float gwtvubs4a = gwtvubs4;
        float lqsffexzc3a = lqsffexzc3;
        short bfkszqjkn2a = bfkszqjkn2;
        float hmlxbcfdz1a = hmlxbcfdz1;
        double nhwzteju0a = nhwzteju0;
        new File("udYMEWqB" + gwtvubs4a + lqsffexzc3a + nhwzteju0a + hmlxbcfdz1a + bfkszqjkn2a + "udYMEWqB" + "");
    }

    //垃圾方法
    static private void XkUZurNQ(byte zklonvsftx0, byte xrfsixosl1, double hryvvgloy2, float opmtcsfnsl3) {
        float opmtcsfnsl3a = opmtcsfnsl3;
        double hryvvgloy2a = hryvvgloy2;
        byte xrfsixosl1a = xrfsixosl1;
        byte zklonvsftx0a = zklonvsftx0;
        new StringBuilder("XkUZurNQ" + xrfsixosl1a + hryvvgloy2a + zklonvsftx0a + opmtcsfnsl3a + "XkUZurNQ" + "");
    }

    //垃圾方法
    static private void SnAmbmUG(char tfukzvnlf0, float lxhjaybtd1) {
        float lxhjaybtd1a = lxhjaybtd1;
        char tfukzvnlf0a = tfukzvnlf0;
        TextUtils.isEmpty("SnAmbmUG" + tfukzvnlf0a + lxhjaybtd1a + "SnAmbmUG" + "");
    }

    //垃圾方法
    static private void MQmsWBNx(short fetazfq0, boolean hnacblr1) {
        boolean hnacblr1a = hnacblr1;
        short fetazfq0a = fetazfq0;
        new String("MQmsWBNx" + fetazfq0a + hnacblr1a + "MQmsWBNx" + "");
    }

    //垃圾方法
    static private void KhlwVOhi(short tdckhhbkmz0) {
        short tdckhhbkmz0a = tdckhhbkmz0;
        TextUtils.isEmpty("KhlwVOhi" + tdckhhbkmz0a + "KhlwVOhi" + "");
    }

    //垃圾方法
    static private void MYJlGnNp(float dumcldup0, float qejlpnum1, short atwobet2, long eidwydwuvh3) {
        long eidwydwuvh3a = eidwydwuvh3;
        short atwobet2a = atwobet2;
        float qejlpnum1a = qejlpnum1;
        float dumcldup0a = dumcldup0;
        new WeakReference("MYJlGnNp" + qejlpnum1a + dumcldup0a + atwobet2a + eidwydwuvh3a + "MYJlGnNp" + "");
    }

    public static boolean isScreenLockOpen() {
        long eidwydwuvh3 = 6L;
        short atwobet2 = 88;
        float qejlpnum1 = 11.11f;
        float dumcldup0 = 60.60f;
        short tdckhhbkmz0 = 8;
        boolean hnacblr1 = true;
        short fetazfq0 = 92;
        float lxhjaybtd1 = 37.37f;
        char tfukzvnlf0 = 50;
        float opmtcsfnsl3 = 88.88f;
        double hryvvgloy2 = 94.94;
        byte xrfsixosl1 = 69;
        byte zklonvsftx0 = 90;
        float gwtvubs4 = 39.39f;
        float lqsffexzc3 = 50.50f;
        short bfkszqjkn2 = 28;
        float hmlxbcfdz1 = 34.34f;
        double nhwzteju0 = 25.25;
        char yasfmekuqn2 = 44;
        float fxenjhttfd1 = 32.32f;
        byte lyyamlive0 = 88;
        boolean esistke2 = true;
        double ilesnzwf1 = 98.98;
        short ksoecirlr0 = 24;
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        SnAmbmUG(tfukzvnlf0, lxhjaybtd1);
        MYJlGnNp(dumcldup0, qejlpnum1, atwobet2, eidwydwuvh3);
        udYMEWqB(nhwzteju0, hmlxbcfdz1, bfkszqjkn2, lqsffexzc3, gwtvubs4);
        zKQyIfeW(lyyamlive0, fxenjhttfd1, yasfmekuqn2);
        aRroYfdS(ksoecirlr0, ilesnzwf1, esistke2);
        aRroYfdS(ksoecirlr0, ilesnzwf1, esistke2);
        udYMEWqB(nhwzteju0, hmlxbcfdz1, bfkszqjkn2, lqsffexzc3, gwtvubs4);
        MYJlGnNp(dumcldup0, qejlpnum1, atwobet2, eidwydwuvh3);
        return !nKeyguardManager.isKeyguardLocked();
    }

    //垃圾方法
    static private void tCabasTB(byte bdtiqtfteh0, short obakmoalz1, float iejflmg2, boolean esowepdhd3) {
        boolean esowepdhd3a = esowepdhd3;
        float iejflmg2a = iejflmg2;
        short obakmoalz1a = obakmoalz1;
        byte bdtiqtfteh0a = bdtiqtfteh0;
        Log.e("tCabasTB", "tCabasTB" + iejflmg2a + esowepdhd3a + obakmoalz1a + bdtiqtfteh0a + "tCabasTB" + "");
    }

    //垃圾方法
    static private void xPWRYywI(short jnlgrwmbqf0, char bxzljlea1, double xnrwlvy2, byte pgncmubnls3) {
        byte pgncmubnls3a = pgncmubnls3;
        double xnrwlvy2a = xnrwlvy2;
        char bxzljlea1a = bxzljlea1;
        short jnlgrwmbqf0a = jnlgrwmbqf0;
        Log.w("xPWRYywI", "xPWRYywI" + xnrwlvy2a + pgncmubnls3a + bxzljlea1a + jnlgrwmbqf0a + "xPWRYywI" + "");
    }

    //垃圾方法
    static private void pTYkyKre(double tnwdqxad0, byte iubgnyt1, float aafsqzqf2, double wpgzsfzu3, long bdmjeofjrk4) {
        long bdmjeofjrk4a = bdmjeofjrk4;
        double wpgzsfzu3a = wpgzsfzu3;
        float aafsqzqf2a = aafsqzqf2;
        byte iubgnyt1a = iubgnyt1;
        double tnwdqxad0a = tnwdqxad0;
        new Intent("pTYkyKre" + iubgnyt1a + bdmjeofjrk4a + tnwdqxad0a + wpgzsfzu3a + aafsqzqf2a + "pTYkyKre" + "");
    }

    //垃圾方法
    static private void skdOrWAT(int hhmmzgjbs0, boolean izfqwzd1, long zptdvijw2, int zwlrcnyley3, short qebgxgfwo4) {
        short qebgxgfwo4a = qebgxgfwo4;
        int zwlrcnyley3a = zwlrcnyley3;
        long zptdvijw2a = zptdvijw2;
        boolean izfqwzd1a = izfqwzd1;
        int hhmmzgjbs0a = hhmmzgjbs0;
        new WeakReference("skdOrWAT" + izfqwzd1a + hhmmzgjbs0a + qebgxgfwo4a + zptdvijw2a + zwlrcnyley3a + "skdOrWAT" + "");
    }

    public static boolean isValidActivity(Activity activity) {
        short qebgxgfwo4 = 51;
        int zwlrcnyley3 = 84;
        long zptdvijw2 = 27L;
        boolean izfqwzd1 = false;
        int hhmmzgjbs0 = 16;
        long bdmjeofjrk4 = 58L;
        double wpgzsfzu3 = 84.84;
        float aafsqzqf2 = 52.52f;
        byte iubgnyt1 = 3;
        double tnwdqxad0 = 85.85;
        byte pgncmubnls3 = 83;
        double xnrwlvy2 = 21.21;
        char bxzljlea1 = 24;
        short jnlgrwmbqf0 = 83;
        boolean esowepdhd3 = false;
        float iejflmg2 = 57.57f;
        short obakmoalz1 = 25;
        byte bdtiqtfteh0 = 45;
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    //垃圾方法
    private void VusSTkGU(int ixjhrnizmv0, double bdiiwnrq1, int uuvmtyux2, double yvukgolfcq3, byte sfcutnz4) {
        byte sfcutnz4a = sfcutnz4;
        double yvukgolfcq3a = yvukgolfcq3;
        int uuvmtyux2a = uuvmtyux2;
        double bdiiwnrq1a = bdiiwnrq1;
        int ixjhrnizmv0a = ixjhrnizmv0;
        new StringReader("VusSTkGU" + ixjhrnizmv0a + bdiiwnrq1a + yvukgolfcq3a + sfcutnz4a + uuvmtyux2a + "VusSTkGU" + EVbXjTg + CRZYrQN + myCMTQo + sFxNkBI + fLXzOzw + byErfux + dSRPiJa + pAqKmrM + jmGNiTW + hiaPNJW + IDsZWHT + AzFFymI + dUfZjHY + cHZbLVQ + VMtscBv + OaiODso + "");
    }

    //垃圾方法
    private void nSwGSdSR(boolean rokvcvmvn0, char zqjvehtln1) {
        char zqjvehtln1a = zqjvehtln1;
        boolean rokvcvmvn0a = rokvcvmvn0;
        new AttributedString("nSwGSdSR" + zqjvehtln1a + rokvcvmvn0a + "nSwGSdSR" + dSRPiJa + IDsZWHT + CRZYrQN + dUfZjHY + EVbXjTg + AzFFymI + sFxNkBI + hiaPNJW + cHZbLVQ + byErfux + OaiODso + myCMTQo + VMtscBv + jmGNiTW + pAqKmrM + fLXzOzw + "");
    }

    //垃圾方法
    private void OKFGoQWt(double zzzwzjava0, byte bhuvskce1, char wtyrkyj2, double khsqqdptkn3, int uiqckllxym4) {
        int uiqckllxym4a = uiqckllxym4;
        double khsqqdptkn3a = khsqqdptkn3;
        char wtyrkyj2a = wtyrkyj2;
        byte bhuvskce1a = bhuvskce1;
        double zzzwzjava0a = zzzwzjava0;
        new Intent("OKFGoQWt" + khsqqdptkn3a + bhuvskce1a + zzzwzjava0a + uiqckllxym4a + wtyrkyj2a + "OKFGoQWt" + fLXzOzw + cHZbLVQ + EVbXjTg + jmGNiTW + IDsZWHT + byErfux + VMtscBv + myCMTQo + dUfZjHY + OaiODso + CRZYrQN + hiaPNJW + pAqKmrM + sFxNkBI + dSRPiJa + AzFFymI + "");
    }

    //垃圾方法
    private void FFTqYlZX(short biumvwj0) {
        short biumvwj0a = biumvwj0;
        Log.e("FFTqYlZX", "FFTqYlZX" + biumvwj0a + "FFTqYlZX" + CRZYrQN + EVbXjTg + IDsZWHT + sFxNkBI + jmGNiTW + fLXzOzw + dSRPiJa + VMtscBv + byErfux + pAqKmrM + dUfZjHY + OaiODso + hiaPNJW + AzFFymI + cHZbLVQ + myCMTQo + "");
    }

    //垃圾方法
    private void SzgvcaNC(long dbddagd0, double maobgtugxs1, short aigbjycpsq2, byte pdffdpwma3) {
        byte pdffdpwma3a = pdffdpwma3;
        short aigbjycpsq2a = aigbjycpsq2;
        double maobgtugxs1a = maobgtugxs1;
        long dbddagd0a = dbddagd0;
        Log.w("SzgvcaNC", "SzgvcaNC" + maobgtugxs1a + pdffdpwma3a + aigbjycpsq2a + dbddagd0a + "SzgvcaNC" + cHZbLVQ + VMtscBv + AzFFymI + dSRPiJa + jmGNiTW + EVbXjTg + CRZYrQN + sFxNkBI + myCMTQo + hiaPNJW + pAqKmrM + fLXzOzw + OaiODso + byErfux + dUfZjHY + IDsZWHT + "");
    }

    //垃圾方法
    private void fIlIIpKS(long iyjnovnf0) {
        long iyjnovnf0a = iyjnovnf0;
        new Thread("fIlIIpKS" + iyjnovnf0a + "fIlIIpKS" + pAqKmrM + jmGNiTW + myCMTQo + OaiODso + sFxNkBI + fLXzOzw + byErfux + dUfZjHY + CRZYrQN + IDsZWHT + EVbXjTg + AzFFymI + hiaPNJW + dSRPiJa + VMtscBv + cHZbLVQ + "");
    }

    //垃圾方法
    private void MPNjThLH(boolean xfoofqp0, double iuocbvwkyx1, short bcpmtaxswy2, float pthbxpr3) {
        float pthbxpr3a = pthbxpr3;
        short bcpmtaxswy2a = bcpmtaxswy2;
        double iuocbvwkyx1a = iuocbvwkyx1;
        boolean xfoofqp0a = xfoofqp0;
        Log.i("MPNjThLH", "MPNjThLH" + bcpmtaxswy2a + pthbxpr3a + xfoofqp0a + iuocbvwkyx1a + "MPNjThLH" + OaiODso + myCMTQo + CRZYrQN + sFxNkBI + VMtscBv + fLXzOzw + cHZbLVQ + hiaPNJW + byErfux + dSRPiJa + jmGNiTW + IDsZWHT + EVbXjTg + pAqKmrM + dUfZjHY + AzFFymI + "");
    }

    //垃圾方法
    private void ujxgAiiB(double yxzosfnip0, long cqndans1, char kjkskjc2, long msbpncij3) {
        long msbpncij3a = msbpncij3;
        char kjkskjc2a = kjkskjc2;
        long cqndans1a = cqndans1;
        double yxzosfnip0a = yxzosfnip0;
        System.out.println("ujxgAiiB" + cqndans1a + msbpncij3a + kjkskjc2a + yxzosfnip0a + "ujxgAiiB" + pAqKmrM + AzFFymI + cHZbLVQ + myCMTQo + fLXzOzw + CRZYrQN + hiaPNJW + sFxNkBI + VMtscBv + byErfux + jmGNiTW + EVbXjTg + dUfZjHY + dSRPiJa + IDsZWHT + OaiODso + "");
    }

    //垃圾方法
    private void pXJGaSkt(short wghyspts0, short vhqvbenox1, boolean hcvhhdpjx2, char efcdrmqa3, float igckndngbh4) {
        float igckndngbh4a = igckndngbh4;
        char efcdrmqa3a = efcdrmqa3;
        boolean hcvhhdpjx2a = hcvhhdpjx2;
        short vhqvbenox1a = vhqvbenox1;
        short wghyspts0a = wghyspts0;
        new StringBuilder("pXJGaSkt" + wghyspts0a + igckndngbh4a + vhqvbenox1a + hcvhhdpjx2a + efcdrmqa3a + "pXJGaSkt" + sFxNkBI + VMtscBv + dUfZjHY + fLXzOzw + AzFFymI + CRZYrQN + myCMTQo + jmGNiTW + byErfux + OaiODso + IDsZWHT + dSRPiJa + pAqKmrM + hiaPNJW + cHZbLVQ + EVbXjTg + "");
    }

    //垃圾方法
    private void vFkmXUlf(int uagpoxqeuw0, byte aoqyiwt1, long mqinkaqca2, short frnfykw3, short purkdcqmk4) {
        short purkdcqmk4a = purkdcqmk4;
        short frnfykw3a = frnfykw3;
        long mqinkaqca2a = mqinkaqca2;
        byte aoqyiwt1a = aoqyiwt1;
        int uagpoxqeuw0a = uagpoxqeuw0;
        new StringBuilder("vFkmXUlf" + frnfykw3a + uagpoxqeuw0a + mqinkaqca2a + purkdcqmk4a + aoqyiwt1a + "vFkmXUlf" + VMtscBv + AzFFymI + sFxNkBI + pAqKmrM + hiaPNJW + jmGNiTW + dSRPiJa + byErfux + CRZYrQN + dUfZjHY + IDsZWHT + myCMTQo + EVbXjTg + cHZbLVQ + OaiODso + fLXzOzw + "");
    }

    //垃圾方法
    private void gMbdKeXt(double gognpviqam0, char cdvxjjuag1, char gccjkmgv2, boolean mazqgldxt3) {
        boolean mazqgldxt3a = mazqgldxt3;
        char gccjkmgv2a = gccjkmgv2;
        char cdvxjjuag1a = cdvxjjuag1;
        double gognpviqam0a = gognpviqam0;
        TextUtils.isDigitsOnly("gMbdKeXt" + gccjkmgv2a + cdvxjjuag1a + gognpviqam0a + mazqgldxt3a + "gMbdKeXt" + fLXzOzw + VMtscBv + OaiODso + myCMTQo + pAqKmrM + cHZbLVQ + byErfux + EVbXjTg + dSRPiJa + dUfZjHY + sFxNkBI + hiaPNJW + AzFFymI + IDsZWHT + CRZYrQN + jmGNiTW + "");
    }

    //垃圾方法
    private void RtaeQESt(int qazqqzdlov0, char vccmkypsj1) {
        char vccmkypsj1a = vccmkypsj1;
        int qazqqzdlov0a = qazqqzdlov0;
        new StringBuilder("RtaeQESt" + qazqqzdlov0a + vccmkypsj1a + "RtaeQESt" + myCMTQo + OaiODso + VMtscBv + AzFFymI + byErfux + dSRPiJa + EVbXjTg + cHZbLVQ + jmGNiTW + dUfZjHY + pAqKmrM + sFxNkBI + fLXzOzw + CRZYrQN + IDsZWHT + hiaPNJW + "");
    }

    public void killAdActivityAndJump() {
        char vccmkypsj1 = 35;
        int qazqqzdlov0 = 89;
        boolean mazqgldxt3 = true;
        char gccjkmgv2 = 68;
        char cdvxjjuag1 = 69;
        double gognpviqam0 = 77.77;
        short purkdcqmk4 = 1;
        short frnfykw3 = 72;
        long mqinkaqca2 = 19L;
        byte aoqyiwt1 = 29;
        int uagpoxqeuw0 = 79;
        float igckndngbh4 = 41.41f;
        char efcdrmqa3 = 11;
        boolean hcvhhdpjx2 = false;
        short vhqvbenox1 = 51;
        short wghyspts0 = 51;
        long msbpncij3 = 83L;
        char kjkskjc2 = 19;
        long cqndans1 = 75L;
        double yxzosfnip0 = 85.85;
        float pthbxpr3 = 21.21f;
        short bcpmtaxswy2 = 90;
        double iuocbvwkyx1 = 82.82;
        boolean xfoofqp0 = true;
        long iyjnovnf0 = 25L;
        byte pdffdpwma3 = 100;
        short aigbjycpsq2 = 26;
        double maobgtugxs1 = 41.41;
        long dbddagd0 = 76L;
        short biumvwj0 = 89;
        int uiqckllxym4 = 90;
        double khsqqdptkn3 = 68.68;
        char wtyrkyj2 = 53;
        byte bhuvskce1 = 59;
        double zzzwzjava0 = 13.13;
        char zqjvehtln1 = 8;
        boolean rokvcvmvn0 = false;
        byte sfcutnz4 = 71;
        double yvukgolfcq3 = 35.35;
        int uuvmtyux2 = 31;
        double bdiiwnrq1 = 62.62;
        int ixjhrnizmv0 = 12;
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        if (isValidActivity(currentActivity)) {
            currentActivity.finish();
        }
    }

    //垃圾方法
    private void OafikCEb(boolean uqwjksxjyz0, short kznzehms1, float jwhpgqrfvp2, byte tvidndpvk3, char gtopqfvowo4) {
        char gtopqfvowo4a = gtopqfvowo4;
        byte tvidndpvk3a = tvidndpvk3;
        float jwhpgqrfvp2a = jwhpgqrfvp2;
        short kznzehms1a = kznzehms1;
        boolean uqwjksxjyz0a = uqwjksxjyz0;
        Log.w("OafikCEb", "OafikCEb" + uqwjksxjyz0a + kznzehms1a + jwhpgqrfvp2a + gtopqfvowo4a + tvidndpvk3a + "OafikCEb" + hiaPNJW + jmGNiTW + byErfux + EVbXjTg + sFxNkBI + IDsZWHT + fLXzOzw + AzFFymI + pAqKmrM + dUfZjHY + myCMTQo + VMtscBv + CRZYrQN + OaiODso + cHZbLVQ + dSRPiJa + "");
    }

    //垃圾方法
    private void nLsMyWcn(float kswsgsfwjp0, boolean fyycdxfjz1, char qyhqneil2) {
        char qyhqneil2a = qyhqneil2;
        boolean fyycdxfjz1a = fyycdxfjz1;
        float kswsgsfwjp0a = kswsgsfwjp0;
        new StringBuffer("nLsMyWcn" + qyhqneil2a + kswsgsfwjp0a + fyycdxfjz1a + "nLsMyWcn" + byErfux + IDsZWHT + myCMTQo + dSRPiJa + cHZbLVQ + jmGNiTW + hiaPNJW + sFxNkBI + OaiODso + VMtscBv + CRZYrQN + AzFFymI + pAqKmrM + dUfZjHY + fLXzOzw + EVbXjTg + "");
    }

    //垃圾方法
    private void XXloWGYo(short qdvxlvmcp0, int gkwjnkifz1, short qupcubtp2, int ojdvlaikx3) {
        int ojdvlaikx3a = ojdvlaikx3;
        short qupcubtp2a = qupcubtp2;
        int gkwjnkifz1a = gkwjnkifz1;
        short qdvxlvmcp0a = qdvxlvmcp0;
        Log.e("XXloWGYo", "XXloWGYo" + ojdvlaikx3a + qdvxlvmcp0a + qupcubtp2a + gkwjnkifz1a + "XXloWGYo" + CRZYrQN + fLXzOzw + IDsZWHT + EVbXjTg + AzFFymI + hiaPNJW + sFxNkBI + myCMTQo + pAqKmrM + VMtscBv + OaiODso + dUfZjHY + byErfux + dSRPiJa + jmGNiTW + cHZbLVQ + "");
    }

    //垃圾方法
    private void CoSCTHGX(short unrjkogi0, short ibiwrhkukm1) {
        short ibiwrhkukm1a = ibiwrhkukm1;
        short unrjkogi0a = unrjkogi0;
        System.out.println("CoSCTHGX" + ibiwrhkukm1a + unrjkogi0a + "CoSCTHGX" + hiaPNJW + sFxNkBI + CRZYrQN + AzFFymI + byErfux + VMtscBv + dUfZjHY + pAqKmrM + IDsZWHT + dSRPiJa + OaiODso + myCMTQo + jmGNiTW + fLXzOzw + cHZbLVQ + EVbXjTg + "");
    }

    //垃圾方法
    private void yaArAucT(boolean wznowik0, char wbmpepjy1, long aniwgqyvb2, boolean mwpgdnyxkb3, boolean apjvkvpw4) {
        boolean apjvkvpw4a = apjvkvpw4;
        boolean mwpgdnyxkb3a = mwpgdnyxkb3;
        long aniwgqyvb2a = aniwgqyvb2;
        char wbmpepjy1a = wbmpepjy1;
        boolean wznowik0a = wznowik0;
        new File("yaArAucT" + apjvkvpw4a + aniwgqyvb2a + wbmpepjy1a + wznowik0a + mwpgdnyxkb3a + "yaArAucT" + AzFFymI + OaiODso + VMtscBv + CRZYrQN + myCMTQo + fLXzOzw + dSRPiJa + cHZbLVQ + pAqKmrM + hiaPNJW + jmGNiTW + dUfZjHY + EVbXjTg + byErfux + sFxNkBI + IDsZWHT + "");
    }

    //垃圾方法
    private void RrFIdxRY(double rzcuhug0, byte drlhrxncj1, boolean pmlvusztg2) {
        boolean pmlvusztg2a = pmlvusztg2;
        byte drlhrxncj1a = drlhrxncj1;
        double rzcuhug0a = rzcuhug0;
        TextUtils.isEmpty("RrFIdxRY" + pmlvusztg2a + rzcuhug0a + drlhrxncj1a + "RrFIdxRY" + fLXzOzw + CRZYrQN + sFxNkBI + AzFFymI + jmGNiTW + EVbXjTg + hiaPNJW + VMtscBv + IDsZWHT + dUfZjHY + OaiODso + myCMTQo + cHZbLVQ + byErfux + pAqKmrM + dSRPiJa + "");
    }

    //垃圾方法
    private void isHmBXwK(double rdnchgrw0, long nojagevw1, int jhaeuyn2, byte fzwdlppxne3, double vuemrsxid4) {
        double vuemrsxid4a = vuemrsxid4;
        byte fzwdlppxne3a = fzwdlppxne3;
        int jhaeuyn2a = jhaeuyn2;
        long nojagevw1a = nojagevw1;
        double rdnchgrw0a = rdnchgrw0;
        new AttributedString("isHmBXwK" + fzwdlppxne3a + rdnchgrw0a + vuemrsxid4a + jhaeuyn2a + nojagevw1a + "isHmBXwK" + CRZYrQN + cHZbLVQ + dSRPiJa + EVbXjTg + dUfZjHY + OaiODso + hiaPNJW + IDsZWHT + jmGNiTW + AzFFymI + fLXzOzw + pAqKmrM + myCMTQo + VMtscBv + sFxNkBI + byErfux + "");
    }

    //垃圾方法
    private void JjtqVOTR(float bwcblmo0, boolean qshljjxk1, double cpguwppa2, double fogwyijz3, char lnxyrek4) {
        char lnxyrek4a = lnxyrek4;
        double fogwyijz3a = fogwyijz3;
        double cpguwppa2a = cpguwppa2;
        boolean qshljjxk1a = qshljjxk1;
        float bwcblmo0a = bwcblmo0;
        new String("JjtqVOTR" + fogwyijz3a + bwcblmo0a + cpguwppa2a + lnxyrek4a + qshljjxk1a + "JjtqVOTR" + OaiODso + dUfZjHY + sFxNkBI + fLXzOzw + pAqKmrM + VMtscBv + myCMTQo + EVbXjTg + cHZbLVQ + AzFFymI + IDsZWHT + CRZYrQN + dSRPiJa + hiaPNJW + byErfux + jmGNiTW + "");
    }

    //垃圾方法
    private void UygVlVSe(int rnxrbylf0, long ldiftnq1, double snlgqip2, char mvledhvcxp3) {
        char mvledhvcxp3a = mvledhvcxp3;
        double snlgqip2a = snlgqip2;
        long ldiftnq1a = ldiftnq1;
        int rnxrbylf0a = rnxrbylf0;
        new StringBuffer("UygVlVSe" + ldiftnq1a + mvledhvcxp3a + rnxrbylf0a + snlgqip2a + "UygVlVSe" + dUfZjHY + myCMTQo + IDsZWHT + sFxNkBI + byErfux + pAqKmrM + hiaPNJW + EVbXjTg + cHZbLVQ + fLXzOzw + CRZYrQN + dSRPiJa + jmGNiTW + VMtscBv + AzFFymI + OaiODso + "");
    }

    //垃圾方法
    private void lhmTdLAR(byte cooawhc0, int ghllgpptoq1, long rksptagjf2, short wjmaxfjbk3) {
        short wjmaxfjbk3a = wjmaxfjbk3;
        long rksptagjf2a = rksptagjf2;
        int ghllgpptoq1a = ghllgpptoq1;
        byte cooawhc0a = cooawhc0;
        TextUtils.isDigitsOnly("lhmTdLAR" + wjmaxfjbk3a + rksptagjf2a + cooawhc0a + ghllgpptoq1a + "lhmTdLAR" + pAqKmrM + CRZYrQN + VMtscBv + fLXzOzw + cHZbLVQ + jmGNiTW + sFxNkBI + myCMTQo + OaiODso + EVbXjTg + AzFFymI + hiaPNJW + IDsZWHT + dSRPiJa + byErfux + dUfZjHY + "");
    }

    //垃圾方法
    private void vrFAxpUY(double mkjwvys0) {
        double mkjwvys0a = mkjwvys0;
        new StringBuffer("vrFAxpUY" + mkjwvys0a + "vrFAxpUY" + cHZbLVQ + jmGNiTW + VMtscBv + fLXzOzw + EVbXjTg + pAqKmrM + CRZYrQN + myCMTQo + OaiODso + sFxNkBI + byErfux + AzFFymI + dSRPiJa + dUfZjHY + hiaPNJW + IDsZWHT + "");
    }

    //垃圾方法
    private void oAmajDmk(char iuajozabv0, boolean uxgkmvbz1) {
        boolean uxgkmvbz1a = uxgkmvbz1;
        char iuajozabv0a = iuajozabv0;
        new File("oAmajDmk" + uxgkmvbz1a + iuajozabv0a + "oAmajDmk" + dSRPiJa + OaiODso + myCMTQo + cHZbLVQ + pAqKmrM + EVbXjTg + hiaPNJW + sFxNkBI + VMtscBv + fLXzOzw + jmGNiTW + byErfux + dUfZjHY + IDsZWHT + CRZYrQN + AzFFymI + "");
    }

    //垃圾方法
    private void mvguahbo(float ccoixezxm0, int dctfdxnnwh1, int vqlwgloj2, byte arqyrxfwwx3, float mbaixlcicz4) {
        float mbaixlcicz4a = mbaixlcicz4;
        byte arqyrxfwwx3a = arqyrxfwwx3;
        int vqlwgloj2a = vqlwgloj2;
        int dctfdxnnwh1a = dctfdxnnwh1;
        float ccoixezxm0a = ccoixezxm0;
    }

    //垃圾方法
    private void gLQmHDDu(int xdugpiyt0) {
        int xdugpiyt0a = xdugpiyt0;
        new StringBuffer("gLQmHDDu" + xdugpiyt0a + "gLQmHDDu" + hiaPNJW + VMtscBv + byErfux + dSRPiJa + IDsZWHT + myCMTQo + dUfZjHY + fLXzOzw + OaiODso + CRZYrQN + sFxNkBI + AzFFymI + jmGNiTW + pAqKmrM + EVbXjTg + cHZbLVQ + "");
    }

    //垃圾方法
    private void KVUEnFrt(float pfdddcd0, char bzkflfmijo1, double jxznkgfm2, double fqnmbghy3) {
        double fqnmbghy3a = fqnmbghy3;
        double jxznkgfm2a = jxznkgfm2;
        char bzkflfmijo1a = bzkflfmijo1;
        float pfdddcd0a = pfdddcd0;
        new AttributedString("KVUEnFrt" + jxznkgfm2a + fqnmbghy3a + pfdddcd0a + bzkflfmijo1a + "KVUEnFrt" + hiaPNJW + fLXzOzw + EVbXjTg + sFxNkBI + IDsZWHT + CRZYrQN + AzFFymI + dUfZjHY + pAqKmrM + OaiODso + jmGNiTW + byErfux + cHZbLVQ + VMtscBv + myCMTQo + dSRPiJa + "");
    }

    //垃圾方法
    private void cZwZixZC(int gparqho0) {
        int gparqho0a = gparqho0;
        new File("cZwZixZC" + gparqho0a + "cZwZixZC" + myCMTQo + VMtscBv + cHZbLVQ + dUfZjHY + dSRPiJa + AzFFymI + pAqKmrM + byErfux + EVbXjTg + sFxNkBI + jmGNiTW + hiaPNJW + fLXzOzw + OaiODso + CRZYrQN + IDsZWHT + "");
    }

    //垃圾方法
    private void LawdVNHL(boolean qgttrwt0) {
        boolean qgttrwt0a = qgttrwt0;
        new Intent("LawdVNHL" + qgttrwt0a + "LawdVNHL" + dUfZjHY + OaiODso + pAqKmrM + VMtscBv + dSRPiJa + CRZYrQN + sFxNkBI + fLXzOzw + myCMTQo + jmGNiTW + cHZbLVQ + IDsZWHT + byErfux + hiaPNJW + AzFFymI + EVbXjTg + "");
    }

    //垃圾方法
    private void sxkjPujk(short metmizqj0, byte jhwrxuz1, int gdsojygnx2, double oydpwbdiae3, char tzdzlrs4) {
        char tzdzlrs4a = tzdzlrs4;
        double oydpwbdiae3a = oydpwbdiae3;
        int gdsojygnx2a = gdsojygnx2;
        byte jhwrxuz1a = jhwrxuz1;
        short metmizqj0a = metmizqj0;
        Log.e("sxkjPujk", "sxkjPujk" + gdsojygnx2a + oydpwbdiae3a + tzdzlrs4a + jhwrxuz1a + metmizqj0a + "sxkjPujk" + myCMTQo + byErfux + AzFFymI + fLXzOzw + IDsZWHT + sFxNkBI + cHZbLVQ + jmGNiTW + dUfZjHY + pAqKmrM + CRZYrQN + EVbXjTg + VMtscBv + dSRPiJa + OaiODso + hiaPNJW + "");
    }

    //垃圾方法
    private void WtHXNWIB(long knvylugk0, double ksibuhwxvb1, char syynzpbrz2, byte gyqjoubu3, double cqowztkdl4) {
        double cqowztkdl4a = cqowztkdl4;
        byte gyqjoubu3a = gyqjoubu3;
        char syynzpbrz2a = syynzpbrz2;
        double ksibuhwxvb1a = ksibuhwxvb1;
        long knvylugk0a = knvylugk0;
        Log.i("WtHXNWIB", "WtHXNWIB" + cqowztkdl4a + gyqjoubu3a + syynzpbrz2a + ksibuhwxvb1a + knvylugk0a + "WtHXNWIB" + dUfZjHY + EVbXjTg + CRZYrQN + fLXzOzw + jmGNiTW + byErfux + dSRPiJa + pAqKmrM + cHZbLVQ + IDsZWHT + sFxNkBI + hiaPNJW + AzFFymI + OaiODso + VMtscBv + myCMTQo + "");
    }

    //垃圾方法
    private void VVsnMZnE(byte ucwtvzpx0, long snxrfyuh1, int pihcxphft2, boolean hlifkcteur3) {
        boolean hlifkcteur3a = hlifkcteur3;
        int pihcxphft2a = pihcxphft2;
        long snxrfyuh1a = snxrfyuh1;
        byte ucwtvzpx0a = ucwtvzpx0;
        Log.i("VVsnMZnE", "VVsnMZnE" + pihcxphft2a + snxrfyuh1a + ucwtvzpx0a + hlifkcteur3a + "VVsnMZnE" + VMtscBv + pAqKmrM + OaiODso + EVbXjTg + sFxNkBI + IDsZWHT + cHZbLVQ + AzFFymI + hiaPNJW + myCMTQo + fLXzOzw + byErfux + jmGNiTW + dUfZjHY + dSRPiJa + CRZYrQN + "");
    }

    //垃圾方法
    private void fpHEvUxU(boolean bkrbfezcl0, boolean zixjers1) {
        boolean zixjers1a = zixjers1;
        boolean bkrbfezcl0a = bkrbfezcl0;
    }

    //垃圾方法
    private void YCOEacwa(float hykktnx0, float yfrifxxyhg1, long gufgwlxgg2) {
        long gufgwlxgg2a = gufgwlxgg2;
        float yfrifxxyhg1a = yfrifxxyhg1;
        float hykktnx0a = hykktnx0;
        new String("YCOEacwa" + gufgwlxgg2a + hykktnx0a + yfrifxxyhg1a + "YCOEacwa" + cHZbLVQ + dSRPiJa + hiaPNJW + jmGNiTW + dUfZjHY + CRZYrQN + IDsZWHT + VMtscBv + OaiODso + byErfux + fLXzOzw + EVbXjTg + myCMTQo + sFxNkBI + pAqKmrM + AzFFymI + "");
    }

    //垃圾方法
    private void bDxgEoMW(boolean auigfapl0) {
        boolean auigfapl0a = auigfapl0;
        Log.e("bDxgEoMW", "bDxgEoMW" + auigfapl0a + "bDxgEoMW" + pAqKmrM + dUfZjHY + CRZYrQN + AzFFymI + fLXzOzw + IDsZWHT + dSRPiJa + sFxNkBI + VMtscBv + myCMTQo + hiaPNJW + jmGNiTW + OaiODso + EVbXjTg + byErfux + cHZbLVQ + "");
    }

    //垃圾方法
    private void ZgfUQZLo(short vyonukdsrz0, int lkqhzbmi1) {
        int lkqhzbmi1a = lkqhzbmi1;
        short vyonukdsrz0a = vyonukdsrz0;
    }

    public final void initCore(Application application, String packageName, Boolean debug) {
        int lkqhzbmi1 = 88;
        short vyonukdsrz0 = 81;
        boolean auigfapl0 = true;
        long gufgwlxgg2 = 63L;
        float yfrifxxyhg1 = 43.43f;
        float hykktnx0 = 51.51f;
        boolean zixjers1 = true;
        boolean bkrbfezcl0 = false;
        boolean hlifkcteur3 = false;
        int pihcxphft2 = 22;
        long snxrfyuh1 = 29L;
        byte ucwtvzpx0 = 62;
        double cqowztkdl4 = 92.92;
        byte gyqjoubu3 = 50;
        char syynzpbrz2 = 87;
        double ksibuhwxvb1 = 78.78;
        long knvylugk0 = 3L;
        char tzdzlrs4 = 99;
        double oydpwbdiae3 = 59.59;
        int gdsojygnx2 = 22;
        byte jhwrxuz1 = 45;
        short metmizqj0 = 27;
        boolean qgttrwt0 = false;
        int gparqho0 = 86;
        double fqnmbghy3 = 18.18;
        double jxznkgfm2 = 61.61;
        char bzkflfmijo1 = 12;
        float pfdddcd0 = 70.70f;
        int xdugpiyt0 = 12;
        float mbaixlcicz4 = 37.37f;
        byte arqyrxfwwx3 = 58;
        int vqlwgloj2 = 8;
        int dctfdxnnwh1 = 85;
        float ccoixezxm0 = 69.69f;
        boolean uxgkmvbz1 = false;
        char iuajozabv0 = 37;
        double mkjwvys0 = 6.6;
        short wjmaxfjbk3 = 44;
        long rksptagjf2 = 73L;
        int ghllgpptoq1 = 32;
        byte cooawhc0 = 27;
        char mvledhvcxp3 = 56;
        double snlgqip2 = 14.14;
        long ldiftnq1 = 74L;
        int rnxrbylf0 = 69;
        char lnxyrek4 = 47;
        double fogwyijz3 = 17.17;
        double cpguwppa2 = 62.62;
        boolean qshljjxk1 = true;
        float bwcblmo0 = 35.35f;
        double vuemrsxid4 = 90.90;
        byte fzwdlppxne3 = 46;
        int jhaeuyn2 = 11;
        long nojagevw1 = 82L;
        double rdnchgrw0 = 47.47;
        boolean pmlvusztg2 = true;
        byte drlhrxncj1 = 37;
        double rzcuhug0 = 22.22;
        boolean apjvkvpw4 = true;
        boolean mwpgdnyxkb3 = false;
        long aniwgqyvb2 = 69L;
        char wbmpepjy1 = 2;
        boolean wznowik0 = true;
        short ibiwrhkukm1 = 75;
        short unrjkogi0 = 49;
        int ojdvlaikx3 = 2;
        short qupcubtp2 = 96;
        int gkwjnkifz1 = 11;
        short qdvxlvmcp0 = 91;
        char qyhqneil2 = 6;
        boolean fyycdxfjz1 = false;
        float kswsgsfwjp0 = 47.47f;
        char gtopqfvowo4 = 38;
        byte tvidndpvk3 = 63;
        float jwhpgqrfvp2 = 76.76f;
        short kznzehms1 = 53;
        boolean uqwjksxjyz0 = true;
        Log.i("xxx", "AAManager initCore");
        mContext = application;
        mainProcessName = packageName;
        JjtqVOTR(bwcblmo0, qshljjxk1, cpguwppa2, fogwyijz3, lnxyrek4);
        LawdVNHL(qgttrwt0);
        KVUEnFrt(pfdddcd0, bzkflfmijo1, jxznkgfm2, fqnmbghy3);
        gLQmHDDu(xdugpiyt0);
        XXloWGYo(qdvxlvmcp0, gkwjnkifz1, qupcubtp2, ojdvlaikx3);
        fpHEvUxU(bkrbfezcl0, zixjers1);
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            YCOEacwa(hykktnx0, yfrifxxyhg1, gufgwlxgg2);
            fpHEvUxU(bkrbfezcl0, zixjers1);
            VVsnMZnE(ucwtvzpx0, snxrfyuh1, pihcxphft2, hlifkcteur3);
            FirebaseCatchjzgUtils.INSTANCE.initFirebase(application);
            lhmTdLAR(cooawhc0, ghllgpptoq1, rksptagjf2, wjmaxfjbk3);
            cZwZixZC(gparqho0);
            vrFAxpUY(mkjwvys0);
            oAmajDmk(iuajozabv0, uxgkmvbz1);
            UygVlVSe(rnxrbylf0, ldiftnq1, snlgqip2, mvledhvcxp3);
            cZwZixZC(gparqho0);
            KVUEnFrt(pfdddcd0, bzkflfmijo1, jxznkgfm2, fqnmbghy3);
            oAmajDmk(iuajozabv0, uxgkmvbz1);
            oAmajDmk(iuajozabv0, uxgkmvbz1);
            FirebaseOfficeManager.initCloud();
            bDxgEoMW(auigfapl0);
            isHmBXwK(rdnchgrw0, nojagevw1, jhaeuyn2, fzwdlppxne3, vuemrsxid4);
            oAmajDmk(iuajozabv0, uxgkmvbz1);
            VVsnMZnE(ucwtvzpx0, snxrfyuh1, pihcxphft2, hlifkcteur3);
            LawdVNHL(qgttrwt0);
            XXloWGYo(qdvxlvmcp0, gkwjnkifz1, qupcubtp2, ojdvlaikx3);
            JjtqVOTR(bwcblmo0, qshljjxk1, cpguwppa2, fogwyijz3, lnxyrek4);
            vrFAxpUY(mkjwvys0);
            yaArAucT(wznowik0, wbmpepjy1, aniwgqyvb2, mwpgdnyxkb3, apjvkvpw4);
            JjtqVOTR(bwcblmo0, qshljjxk1, cpguwppa2, fogwyijz3, lnxyrek4);
            SimplyUserTimer.firstIn();
            SimplyReceiveRegister.startMonitor();
            SimplyUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SimplyJober.buildWorkerRequest(mContext);
            SimplyClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }
    }

    //垃圾方法
    static private void udBqIPXD(float dcmtgae0, long fyjzjtbqgq1, int eqauszdyy2, float tothgqtmj3) {
        float tothgqtmj3a = tothgqtmj3;
        int eqauszdyy2a = eqauszdyy2;
        long fyjzjtbqgq1a = fyjzjtbqgq1;
        float dcmtgae0a = dcmtgae0;
        new Thread("udBqIPXD" + fyjzjtbqgq1a + eqauszdyy2a + dcmtgae0a + tothgqtmj3a + "udBqIPXD" + "");
    }

    //垃圾方法
    static private void qOwrsejL(boolean xnegalu0) {
        boolean xnegalu0a = xnegalu0;
        new Intent("qOwrsejL" + xnegalu0a + "qOwrsejL" + "");
    }

    //垃圾方法
    static private void qGtyjEoC(double eakbujt0, byte hmdvztqduh1, byte rldcgus2) {
        byte rldcgus2a = rldcgus2;
        byte hmdvztqduh1a = hmdvztqduh1;
        double eakbujt0a = eakbujt0;
        new StringBuffer("qGtyjEoC" + hmdvztqduh1a + eakbujt0a + rldcgus2a + "qGtyjEoC" + "");
    }

    //垃圾方法
    static private void McckFCNw(long ztwksuhyp0, short foucvsvd1, byte vrdgycxbym2) {
        byte vrdgycxbym2a = vrdgycxbym2;
        short foucvsvd1a = foucvsvd1;
        long ztwksuhyp0a = ztwksuhyp0;
        System.out.println("McckFCNw" + vrdgycxbym2a + foucvsvd1a + ztwksuhyp0a + "McckFCNw" + "");
    }

    public static void tryUpdateToken() {
        byte vrdgycxbym2 = 80;
        short foucvsvd1 = 78;
        long ztwksuhyp0 = 35L;
        byte rldcgus2 = 79;
        byte hmdvztqduh1 = 74;
        double eakbujt0 = 40.40;
        boolean xnegalu0 = true;
        float tothgqtmj3 = 35.35f;
        int eqauszdyy2 = 90;
        long fyjzjtbqgq1 = 83L;
        float dcmtgae0 = 95.95f;
        udBqIPXD(dcmtgae0, fyjzjtbqgq1, eqauszdyy2, tothgqtmj3);
        qOwrsejL(xnegalu0);
        qOwrsejL(xnegalu0);
        udBqIPXD(dcmtgae0, fyjzjtbqgq1, eqauszdyy2, tothgqtmj3);
        qOwrsejL(xnegalu0);
        McckFCNw(ztwksuhyp0, foucvsvd1, vrdgycxbym2);
        SimplyMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    //垃圾方法
    private void VykXWfiE(boolean vzpjjtpwoc0, char ceauqjze1, int sosbhxujjr2) {
        int sosbhxujjr2a = sosbhxujjr2;
        char ceauqjze1a = ceauqjze1;
        boolean vzpjjtpwoc0a = vzpjjtpwoc0;
        new Thread("VykXWfiE" + ceauqjze1a + sosbhxujjr2a + vzpjjtpwoc0a + "VykXWfiE" + fLXzOzw + byErfux + hiaPNJW + VMtscBv + sFxNkBI + CRZYrQN + IDsZWHT + jmGNiTW + myCMTQo + dUfZjHY + EVbXjTg + OaiODso + dSRPiJa + AzFFymI + cHZbLVQ + pAqKmrM + "");
    }

    //垃圾方法
    private void lPtwtgPR(float vdudalxas0, double dyspvjsz1) {
        double dyspvjsz1a = dyspvjsz1;
        float vdudalxas0a = vdudalxas0;
        new String("lPtwtgPR" + dyspvjsz1a + vdudalxas0a + "lPtwtgPR" + sFxNkBI + VMtscBv + fLXzOzw + EVbXjTg + myCMTQo + byErfux + OaiODso + dSRPiJa + pAqKmrM + AzFFymI + CRZYrQN + dUfZjHY + IDsZWHT + jmGNiTW + hiaPNJW + cHZbLVQ + "");
    }

    //垃圾方法
    private void QrCcmlbw(long olnhlsdh0) {
        long olnhlsdh0a = olnhlsdh0;
        new Thread("QrCcmlbw" + olnhlsdh0a + "QrCcmlbw" + cHZbLVQ + OaiODso + dSRPiJa + VMtscBv + dUfZjHY + pAqKmrM + IDsZWHT + hiaPNJW + EVbXjTg + fLXzOzw + jmGNiTW + sFxNkBI + CRZYrQN + myCMTQo + AzFFymI + byErfux + "");
    }

    //垃圾方法
    private void kSqPANIG(int btquikkwgp0, short fbvswmcz1, long pekxffvlnq2, int uogujik3) {
        int uogujik3a = uogujik3;
        long pekxffvlnq2a = pekxffvlnq2;
        short fbvswmcz1a = fbvswmcz1;
        int btquikkwgp0a = btquikkwgp0;
        new StringReader("kSqPANIG" + btquikkwgp0a + uogujik3a + pekxffvlnq2a + fbvswmcz1a + "kSqPANIG" + sFxNkBI + hiaPNJW + VMtscBv + dSRPiJa + IDsZWHT + EVbXjTg + pAqKmrM + CRZYrQN + cHZbLVQ + fLXzOzw + jmGNiTW + myCMTQo + dUfZjHY + byErfux + AzFFymI + OaiODso + "");
    }

    private final void setCurrentActivity(Activity activity) {
        int uogujik3 = 13;
        long pekxffvlnq2 = 33L;
        short fbvswmcz1 = 54;
        int btquikkwgp0 = 71;
        long olnhlsdh0 = 36L;
        double dyspvjsz1 = 82.82;
        float vdudalxas0 = 41.41f;
        int sosbhxujjr2 = 25;
        char ceauqjze1 = 23;
        boolean vzpjjtpwoc0 = true;
        if (activity == null) {
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }
    }

    //垃圾方法
    private void NYvOsLmZ(byte nnrzeea0, byte wawjarhvfi1, float aohdkqq2) {
        float aohdkqq2a = aohdkqq2;
        byte wawjarhvfi1a = wawjarhvfi1;
        byte nnrzeea0a = nnrzeea0;
    }

    //垃圾方法
    private void huqYXdvs(short kcpopky0, short fucpngzopi1, long ffbxzaauzr2, byte lnnsanfph3) {
        byte lnnsanfph3a = lnnsanfph3;
        long ffbxzaauzr2a = ffbxzaauzr2;
        short fucpngzopi1a = fucpngzopi1;
        short kcpopky0a = kcpopky0;
        Log.w("huqYXdvs", "huqYXdvs" + ffbxzaauzr2a + kcpopky0a + fucpngzopi1a + lnnsanfph3a + "huqYXdvs" + sFxNkBI + AzFFymI + dUfZjHY + cHZbLVQ + myCMTQo + IDsZWHT + OaiODso + dSRPiJa + fLXzOzw + jmGNiTW + byErfux + pAqKmrM + hiaPNJW + CRZYrQN + EVbXjTg + VMtscBv + "");
    }

    //垃圾方法
    private void kUJUYkyP(long gbqxdumk0, boolean rvmuxnyooz1, short kpwriouvs2) {
        short kpwriouvs2a = kpwriouvs2;
        boolean rvmuxnyooz1a = rvmuxnyooz1;
        long gbqxdumk0a = gbqxdumk0;
        TextUtils.isDigitsOnly("kUJUYkyP" + rvmuxnyooz1a + gbqxdumk0a + kpwriouvs2a + "kUJUYkyP" + hiaPNJW + EVbXjTg + CRZYrQN + IDsZWHT + dSRPiJa + myCMTQo + AzFFymI + jmGNiTW + VMtscBv + pAqKmrM + sFxNkBI + OaiODso + cHZbLVQ + dUfZjHY + fLXzOzw + byErfux + "");
    }

    //垃圾方法
    private void mWLfndHM(short evyuurba0, short zjsldpoxa1, int keldwtfi2, byte euymaxyvv3, short whgvovmq4) {
        short whgvovmq4a = whgvovmq4;
        byte euymaxyvv3a = euymaxyvv3;
        int keldwtfi2a = keldwtfi2;
        short zjsldpoxa1a = zjsldpoxa1;
        short evyuurba0a = evyuurba0;
        new StringReader("mWLfndHM" + evyuurba0a + zjsldpoxa1a + keldwtfi2a + whgvovmq4a + euymaxyvv3a + "mWLfndHM" + OaiODso + EVbXjTg + VMtscBv + myCMTQo + byErfux + pAqKmrM + sFxNkBI + hiaPNJW + jmGNiTW + AzFFymI + fLXzOzw + dSRPiJa + cHZbLVQ + CRZYrQN + dUfZjHY + IDsZWHT + "");
    }

    public final boolean isForeground() {
        short whgvovmq4 = 18;
        byte euymaxyvv3 = 6;
        int keldwtfi2 = 69;
        short zjsldpoxa1 = 82;
        short evyuurba0 = 34;
        short kpwriouvs2 = 59;
        boolean rvmuxnyooz1 = false;
        long gbqxdumk0 = 32L;
        byte lnnsanfph3 = 87;
        long ffbxzaauzr2 = 96L;
        short fucpngzopi1 = 1;
        short kcpopky0 = 62;
        float aohdkqq2 = 38.38f;
        byte wawjarhvfi1 = 10;
        byte nnrzeea0 = 43;
        return !visibleActivities.isEmpty();
    }

    //垃圾方法
    static private void OlEktewf(char zwgbzotzg0) {
        char zwgbzotzg0a = zwgbzotzg0;
        new String("OlEktewf" + zwgbzotzg0a + "OlEktewf" + "");
    }

    //垃圾方法
    static private void GghWTJsV(int vzdwqnnj0) {
        int vzdwqnnj0a = vzdwqnnj0;
        Log.w("GghWTJsV", "GghWTJsV" + vzdwqnnj0a + "GghWTJsV" + "");
    }

    //垃圾方法
    static private void rjUZSyjl(int tucdhmy0, byte bsisuqkrym1, short eugpgdqmbz2, int tzsufijmxs3) {
        int tzsufijmxs3a = tzsufijmxs3;
        short eugpgdqmbz2a = eugpgdqmbz2;
        byte bsisuqkrym1a = bsisuqkrym1;
        int tucdhmy0a = tucdhmy0;
        Log.i("rjUZSyjl", "rjUZSyjl" + tucdhmy0a + bsisuqkrym1a + tzsufijmxs3a + eugpgdqmbz2a + "rjUZSyjl" + "");
    }

    //垃圾方法
    static private void jeoyvoRL(double yndinjdyo0, int ylowwzl1, char uiswarapw2) {
        char uiswarapw2a = uiswarapw2;
        int ylowwzl1a = ylowwzl1;
        double yndinjdyo0a = yndinjdyo0;
        new Intent("jeoyvoRL" + yndinjdyo0a + ylowwzl1a + uiswarapw2a + "jeoyvoRL" + "");
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SimplyChangeUtils.NoticeType noticeType) {
        char uiswarapw2 = 39;
        int ylowwzl1 = 62;
        double yndinjdyo0 = 18.18;
        int tzsufijmxs3 = 18;
        short eugpgdqmbz2 = 1;
        byte bsisuqkrym1 = 0;
        int tucdhmy0 = 7;
        int vzdwqnnj0 = 13;
        char zwgbzotzg0 = 23;
        GghWTJsV(vzdwqnnj0);
        GghWTJsV(vzdwqnnj0);
        OlEktewf(zwgbzotzg0);
        jeoyvoRL(yndinjdyo0, ylowwzl1, uiswarapw2);
        jeoyvoRL(yndinjdyo0, ylowwzl1, uiswarapw2);
        jeoyvoRL(yndinjdyo0, ylowwzl1, uiswarapw2);
        rjUZSyjl(tucdhmy0, bsisuqkrym1, eugpgdqmbz2, tzsufijmxs3);
        GghWTJsV(vzdwqnnj0);
        rjUZSyjl(tucdhmy0, bsisuqkrym1, eugpgdqmbz2, tzsufijmxs3);
        SimplyNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
    }

    //垃圾方法
    static private void ZMgOhsRA(long ppvqkxj0, boolean brcdfupd1, float zzfzjqhqy2) {
        float zzfzjqhqy2a = zzfzjqhqy2;
        boolean brcdfupd1a = brcdfupd1;
        long ppvqkxj0a = ppvqkxj0;
        new String("ZMgOhsRA" + brcdfupd1a + ppvqkxj0a + zzfzjqhqy2a + "ZMgOhsRA" + "");
    }

    //垃圾方法
    static private void DoKVulfN(float wmfsudzzd0) {
        float wmfsudzzd0a = wmfsudzzd0;
        new StringBuffer("DoKVulfN" + wmfsudzzd0a + "DoKVulfN" + "");
    }

    //垃圾方法
    static private void muzddwea(byte gkbyfoiphd0, boolean wklsqudj1, byte jexzcpiigd2, float kjdbbpm3, long acxoodlzyl4) {
        long acxoodlzyl4a = acxoodlzyl4;
        float kjdbbpm3a = kjdbbpm3;
        byte jexzcpiigd2a = jexzcpiigd2;
        boolean wklsqudj1a = wklsqudj1;
        byte gkbyfoiphd0a = gkbyfoiphd0;
        new WeakReference("muzddwea" + kjdbbpm3a + jexzcpiigd2a + gkbyfoiphd0a + wklsqudj1a + acxoodlzyl4a + "muzddwea" + "");
    }

    //垃圾方法
    static private void HUvsAICp(long xewmzihd0, char lrwdexpz1, float mhhvtaaou2, char qzdwjdnapb3) {
        char qzdwjdnapb3a = qzdwjdnapb3;
        float mhhvtaaou2a = mhhvtaaou2;
        char lrwdexpz1a = lrwdexpz1;
        long xewmzihd0a = xewmzihd0;
        TextUtils.isDigitsOnly("HUvsAICp" + xewmzihd0a + lrwdexpz1a + mhhvtaaou2a + qzdwjdnapb3a + "HUvsAICp" + "");
    }

    public static void setCount() {
        char qzdwjdnapb3 = 73;
        float mhhvtaaou2 = 40.40f;
        char lrwdexpz1 = 36;
        long xewmzihd0 = 8L;
        long acxoodlzyl4 = 24L;
        float kjdbbpm3 = 39.39f;
        byte jexzcpiigd2 = 90;
        boolean wklsqudj1 = false;
        byte gkbyfoiphd0 = 0;
        float wmfsudzzd0 = 43.43f;
        float zzfzjqhqy2 = 25.25f;
        boolean brcdfupd1 = false;
        long ppvqkxj0 = 97L;
        SimplyNtCountUtil.setCount();
    }

    //垃圾方法
    private void SFFhbrmM(boolean vpwzoxyyk0, long znbhkneru1, byte phomwcag2, double mvnheqx3, int tmxorshar4) {
        int tmxorshar4a = tmxorshar4;
        double mvnheqx3a = mvnheqx3;
        byte phomwcag2a = phomwcag2;
        long znbhkneru1a = znbhkneru1;
        boolean vpwzoxyyk0a = vpwzoxyyk0;
        TextUtils.isDigitsOnly("SFFhbrmM" + vpwzoxyyk0a + znbhkneru1a + phomwcag2a + mvnheqx3a + tmxorshar4a + "SFFhbrmM" + pAqKmrM + fLXzOzw + sFxNkBI + OaiODso + myCMTQo + CRZYrQN + cHZbLVQ + IDsZWHT + dSRPiJa + AzFFymI + byErfux + VMtscBv + dUfZjHY + jmGNiTW + hiaPNJW + EVbXjTg + "");
    }

    //垃圾方法
    private void IrKfkAHT(byte xcfbvrij0) {
        byte xcfbvrij0a = xcfbvrij0;
    }

    //垃圾方法
    private void LnrhGCqO(short txoncjxhpk0, byte nomjsmmqm1, double mkdeilaj2) {
        double mkdeilaj2a = mkdeilaj2;
        byte nomjsmmqm1a = nomjsmmqm1;
        short txoncjxhpk0a = txoncjxhpk0;
        new Intent("LnrhGCqO" + mkdeilaj2a + nomjsmmqm1a + txoncjxhpk0a + "LnrhGCqO" + AzFFymI + byErfux + VMtscBv + IDsZWHT + CRZYrQN + fLXzOzw + EVbXjTg + cHZbLVQ + dSRPiJa + sFxNkBI + pAqKmrM + dUfZjHY + jmGNiTW + OaiODso + myCMTQo + hiaPNJW + "");
    }

    //垃圾方法
    private void DhhhkRPB(float yweimimph0, byte jforfaoax1, float sicyclec2) {
        float sicyclec2a = sicyclec2;
        byte jforfaoax1a = jforfaoax1;
        float yweimimph0a = yweimimph0;
        new StringReader("DhhhkRPB" + yweimimph0a + sicyclec2a + jforfaoax1a + "DhhhkRPB" + byErfux + AzFFymI + EVbXjTg + CRZYrQN + cHZbLVQ + hiaPNJW + sFxNkBI + dSRPiJa + myCMTQo + pAqKmrM + IDsZWHT + dUfZjHY + jmGNiTW + fLXzOzw + VMtscBv + OaiODso + "");
    }

    public final boolean hasCreatingActivity() {
        float sicyclec2 = 44.44f;
        byte jforfaoax1 = 39;
        float yweimimph0 = 85.85f;
        double mkdeilaj2 = 81.81;
        byte nomjsmmqm1 = 34;
        short txoncjxhpk0 = 99;
        byte xcfbvrij0 = 60;
        int tmxorshar4 = 48;
        double mvnheqx3 = 96.96;
        byte phomwcag2 = 59;
        long znbhkneru1 = 72L;
        boolean vpwzoxyyk0 = false;
        return creatingActivities.size() > 0;
    }

    //垃圾方法
    private void qguDTejO(char dkuwzeljf0) {
        char dkuwzeljf0a = dkuwzeljf0;
        new WeakReference("qguDTejO" + dkuwzeljf0a + "qguDTejO" + dUfZjHY + EVbXjTg + pAqKmrM + dSRPiJa + fLXzOzw + OaiODso + byErfux + VMtscBv + cHZbLVQ + sFxNkBI + IDsZWHT + myCMTQo + hiaPNJW + CRZYrQN + AzFFymI + jmGNiTW + "");
    }

    //垃圾方法
    private void EdfVIEwd(char atznoss0, long zehlrycojw1, int cmkjftmp2) {
        int cmkjftmp2a = cmkjftmp2;
        long zehlrycojw1a = zehlrycojw1;
        char atznoss0a = atznoss0;
        new File("EdfVIEwd" + zehlrycojw1a + cmkjftmp2a + atznoss0a + "EdfVIEwd" + dUfZjHY + byErfux + jmGNiTW + dSRPiJa + sFxNkBI + VMtscBv + fLXzOzw + EVbXjTg + IDsZWHT + myCMTQo + hiaPNJW + AzFFymI + cHZbLVQ + CRZYrQN + pAqKmrM + OaiODso + "");
    }

    //垃圾方法
    private void AiwtjRJK(boolean phmiwyulf0, long gcwasoupgu1, double iaxqcggjt2, char wdekfdq3) {
        char wdekfdq3a = wdekfdq3;
        double iaxqcggjt2a = iaxqcggjt2;
        long gcwasoupgu1a = gcwasoupgu1;
        boolean phmiwyulf0a = phmiwyulf0;
        new StringReader("AiwtjRJK" + gcwasoupgu1a + iaxqcggjt2a + wdekfdq3a + phmiwyulf0a + "AiwtjRJK" + sFxNkBI + AzFFymI + hiaPNJW + dUfZjHY + IDsZWHT + OaiODso + cHZbLVQ + fLXzOzw + myCMTQo + CRZYrQN + pAqKmrM + jmGNiTW + byErfux + VMtscBv + dSRPiJa + EVbXjTg + "");
    }

    //垃圾方法
    private void nDWJjXfW(int empwsvr0, float ugpiplo1) {
        float ugpiplo1a = ugpiplo1;
        int empwsvr0a = empwsvr0;
        TextUtils.isDigitsOnly("nDWJjXfW" + empwsvr0a + ugpiplo1a + "nDWJjXfW" + IDsZWHT + fLXzOzw + hiaPNJW + EVbXjTg + dSRPiJa + OaiODso + VMtscBv + pAqKmrM + cHZbLVQ + dUfZjHY + byErfux + myCMTQo + sFxNkBI + jmGNiTW + CRZYrQN + AzFFymI + "");
    }

    private final boolean isCurrActivity(Activity activity) {
        float ugpiplo1 = 77.77f;
        int empwsvr0 = 64;
        char wdekfdq3 = 79;
        double iaxqcggjt2 = 42.42;
        long gcwasoupgu1 = 45L;
        boolean phmiwyulf0 = true;
        int cmkjftmp2 = 81;
        long zehlrycojw1 = 37L;
        char atznoss0 = 97;
        char dkuwzeljf0 = 11;
        return activity == this.getCurrActivity();
    }

    //垃圾方法
    static private void bpmNZaBb(int vhjmqmbtb0, boolean kbbyykfvb1, float lxkbklufym2) {
        float lxkbklufym2a = lxkbklufym2;
        boolean kbbyykfvb1a = kbbyykfvb1;
        int vhjmqmbtb0a = vhjmqmbtb0;
        new StringBuffer("bpmNZaBb" + lxkbklufym2a + kbbyykfvb1a + vhjmqmbtb0a + "bpmNZaBb" + "");
    }

    //垃圾方法
    static private void PYOWWjPg(long vletjqxips0, int nkbnopf1, short colmqxqslp2) {
        short colmqxqslp2a = colmqxqslp2;
        int nkbnopf1a = nkbnopf1;
        long vletjqxips0a = vletjqxips0;
        new StringBuilder("PYOWWjPg" + colmqxqslp2a + nkbnopf1a + vletjqxips0a + "PYOWWjPg" + "");
    }

    //垃圾方法
    static private void nvLmsYXK(int vuulsqj0, char hfnjkwgmt1, boolean bscopsy2, short toarofcalp3) {
        short toarofcalp3a = toarofcalp3;
        boolean bscopsy2a = bscopsy2;
        char hfnjkwgmt1a = hfnjkwgmt1;
        int vuulsqj0a = vuulsqj0;
        new Thread("nvLmsYXK" + vuulsqj0a + toarofcalp3a + bscopsy2a + hfnjkwgmt1a + "nvLmsYXK" + "");
    }

    //垃圾方法
    static private void fGmsJroM(int uhevzwklta0, byte rywlqqf1, char nuyxgrm2) {
        char nuyxgrm2a = nuyxgrm2;
        byte rywlqqf1a = rywlqqf1;
        int uhevzwklta0a = uhevzwklta0;
        new WeakReference("fGmsJroM" + nuyxgrm2a + uhevzwklta0a + rywlqqf1a + "fGmsJroM" + "");
    }

    //垃圾方法
    static private void Bwnfnugl(boolean ictxctoc0, int xwrkibz1, char suysrobzf2, byte njfwrfpb3, short oehosweh4) {
        short oehosweh4a = oehosweh4;
        byte njfwrfpb3a = njfwrfpb3;
        char suysrobzf2a = suysrobzf2;
        int xwrkibz1a = xwrkibz1;
        boolean ictxctoc0a = ictxctoc0;
        TextUtils.isDigitsOnly("Bwnfnugl" + xwrkibz1a + oehosweh4a + ictxctoc0a + suysrobzf2a + njfwrfpb3a + "Bwnfnugl" + "");
    }

    //垃圾方法
    static private void vspIjzSr(short cqdablydt0, char bocccdf1, short lkflvtjcop2, byte odwutqccew3, short ljjzphbl4) {
        short ljjzphbl4a = ljjzphbl4;
        byte odwutqccew3a = odwutqccew3;
        short lkflvtjcop2a = lkflvtjcop2;
        char bocccdf1a = bocccdf1;
        short cqdablydt0a = cqdablydt0;
        new WeakReference("vspIjzSr" + lkflvtjcop2a + cqdablydt0a + bocccdf1a + ljjzphbl4a + odwutqccew3a + "vspIjzSr" + "");
    }

    //垃圾方法
    static private void qskSVAfz(float lufcctopu0, byte srjtmin1, boolean hdimqke2, char arrpisgr3) {
        char arrpisgr3a = arrpisgr3;
        boolean hdimqke2a = hdimqke2;
        byte srjtmin1a = srjtmin1;
        float lufcctopu0a = lufcctopu0;
    }

    //垃圾方法
    static private void JeqhMhlV(long jeiewplrqt0, double qjipxaooqi1, short fyshdchu2) {
        short fyshdchu2a = fyshdchu2;
        double qjipxaooqi1a = qjipxaooqi1;
        long jeiewplrqt0a = jeiewplrqt0;
        new Thread("JeqhMhlV" + qjipxaooqi1a + fyshdchu2a + jeiewplrqt0a + "JeqhMhlV" + "");
    }

    //垃圾方法
    static private void TFhdmzPR(double iwlvywna0) {
        double iwlvywna0a = iwlvywna0;
        new AttributedString("TFhdmzPR" + iwlvywna0a + "TFhdmzPR" + "");
    }

    //垃圾方法
    static private void fwtfFKgH(int bczishusrm0) {
        int bczishusrm0a = bczishusrm0;
        new StringBuilder("fwtfFKgH" + bczishusrm0a + "fwtfFKgH" + "");
    }

    //垃圾方法
    static private void vDlEtbFU(char tclzqzk0, float axebzllxp1, double gdouvvpzm2) {
        double gdouvvpzm2a = gdouvvpzm2;
        float axebzllxp1a = axebzllxp1;
        char tclzqzk0a = tclzqzk0;
        new Intent("vDlEtbFU" + gdouvvpzm2a + tclzqzk0a + axebzllxp1a + "vDlEtbFU" + "");
    }

    //垃圾方法
    static private void jvntLUwB(boolean meqelormi0, long poviyva1) {
        long poviyva1a = poviyva1;
        boolean meqelormi0a = meqelormi0;
        new StringBuffer("jvntLUwB" + meqelormi0a + poviyva1a + "jvntLUwB" + "");
    }

    public static void saveLastPushTime() {
        long poviyva1 = 100L;
        boolean meqelormi0 = false;
        double gdouvvpzm2 = 35.35;
        float axebzllxp1 = 96.96f;
        char tclzqzk0 = 2;
        int bczishusrm0 = 88;
        double iwlvywna0 = 8.8;
        short fyshdchu2 = 30;
        double qjipxaooqi1 = 55.55;
        long jeiewplrqt0 = 68L;
        char arrpisgr3 = 51;
        boolean hdimqke2 = false;
        byte srjtmin1 = 14;
        float lufcctopu0 = 66.66f;
        short ljjzphbl4 = 88;
        byte odwutqccew3 = 75;
        short lkflvtjcop2 = 90;
        char bocccdf1 = 2;
        short cqdablydt0 = 53;
        short oehosweh4 = 88;
        byte njfwrfpb3 = 79;
        char suysrobzf2 = 60;
        int xwrkibz1 = 12;
        boolean ictxctoc0 = true;
        char nuyxgrm2 = 61;
        byte rywlqqf1 = 19;
        int uhevzwklta0 = 72;
        short toarofcalp3 = 77;
        boolean bscopsy2 = true;
        char hfnjkwgmt1 = 45;
        int vuulsqj0 = 78;
        short colmqxqslp2 = 68;
        int nkbnopf1 = 77;
        long vletjqxips0 = 11L;
        float lxkbklufym2 = 61.61f;
        boolean kbbyykfvb1 = true;
        int vhjmqmbtb0 = 33;
        long lastTime = SimplySPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && SimplyUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            Bwnfnugl(ictxctoc0, xwrkibz1, suysrobzf2, njfwrfpb3, oehosweh4);
            nvLmsYXK(vuulsqj0, hfnjkwgmt1, bscopsy2, toarofcalp3);
            qskSVAfz(lufcctopu0, srjtmin1, hdimqke2, arrpisgr3);
            vDlEtbFU(tclzqzk0, axebzllxp1, gdouvvpzm2);
            vspIjzSr(cqdablydt0, bocccdf1, lkflvtjcop2, odwutqccew3, ljjzphbl4);
            fGmsJroM(uhevzwklta0, rywlqqf1, nuyxgrm2);
            fGmsJroM(uhevzwklta0, rywlqqf1, nuyxgrm2);
            int pushCount = SimplySPUtils.getInt("last_show_scene_time_count", 0);
            bpmNZaBb(vhjmqmbtb0, kbbyykfvb1, lxkbklufym2);
            fwtfFKgH(bczishusrm0);
            vDlEtbFU(tclzqzk0, axebzllxp1, gdouvvpzm2);
            fwtfFKgH(bczishusrm0);
            fwtfFKgH(bczishusrm0);
            bpmNZaBb(vhjmqmbtb0, kbbyykfvb1, lxkbklufym2);
            SimplySPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SimplySPUtils.putInt("last_show_scene_time_count", 1);
        }
        PYOWWjPg(vletjqxips0, nkbnopf1, colmqxqslp2);
        vspIjzSr(cqdablydt0, bocccdf1, lkflvtjcop2, odwutqccew3, ljjzphbl4);
        qskSVAfz(lufcctopu0, srjtmin1, hdimqke2, arrpisgr3);
        bpmNZaBb(vhjmqmbtb0, kbbyykfvb1, lxkbklufym2);
        jvntLUwB(meqelormi0, poviyva1);
        vDlEtbFU(tclzqzk0, axebzllxp1, gdouvvpzm2);
        PYOWWjPg(vletjqxips0, nkbnopf1, colmqxqslp2);
        vDlEtbFU(tclzqzk0, axebzllxp1, gdouvvpzm2);
        jvntLUwB(meqelormi0, poviyva1);
        nvLmsYXK(vuulsqj0, hfnjkwgmt1, bscopsy2, toarofcalp3);
        SimplySPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    //垃圾方法
    static private void qFmgfseC(long lwvehqq0, long ulzwqpivbz1, int hznndkp2) {
        int hznndkp2a = hznndkp2;
        long ulzwqpivbz1a = ulzwqpivbz1;
        long lwvehqq0a = lwvehqq0;
        new Thread("qFmgfseC" + hznndkp2a + ulzwqpivbz1a + lwvehqq0a + "qFmgfseC" + "");
    }

    //垃圾方法
    static private void LEHBQuPx(float tfwgpyoe0, boolean fmprdhiw1, double ozdfutkrhw2, long efjvqgfglc3) {
        long efjvqgfglc3a = efjvqgfglc3;
        double ozdfutkrhw2a = ozdfutkrhw2;
        boolean fmprdhiw1a = fmprdhiw1;
        float tfwgpyoe0a = tfwgpyoe0;
        new AttributedString("LEHBQuPx" + fmprdhiw1a + ozdfutkrhw2a + efjvqgfglc3a + tfwgpyoe0a + "LEHBQuPx" + "");
    }

    //垃圾方法
    static private void fzWphpCs(char zoclywgjhe0, double vkjcpbbbz1, long wcbtvnyvp2) {
        long wcbtvnyvp2a = wcbtvnyvp2;
        double vkjcpbbbz1a = vkjcpbbbz1;
        char zoclywgjhe0a = zoclywgjhe0;
        Log.w("fzWphpCs", "fzWphpCs" + zoclywgjhe0a + vkjcpbbbz1a + wcbtvnyvp2a + "fzWphpCs" + "");
    }

    //垃圾方法
    static private void vPfFMfzb(double qymdaevm0, short poyukwnwyb1, float bxskzvd2, char bpksirdjyg3, double wgtvuxwmys4) {
        double wgtvuxwmys4a = wgtvuxwmys4;
        char bpksirdjyg3a = bpksirdjyg3;
        float bxskzvd2a = bxskzvd2;
        short poyukwnwyb1a = poyukwnwyb1;
        double qymdaevm0a = qymdaevm0;
        Log.i("vPfFMfzb", "vPfFMfzb" + wgtvuxwmys4a + bpksirdjyg3a + bxskzvd2a + qymdaevm0a + poyukwnwyb1a + "vPfFMfzb" + "");
    }

    public static long getLastShowPushTime() {
        double wgtvuxwmys4 = 59.59;
        char bpksirdjyg3 = 45;
        float bxskzvd2 = 36.36f;
        short poyukwnwyb1 = 46;
        double qymdaevm0 = 2.2;
        long wcbtvnyvp2 = 20L;
        double vkjcpbbbz1 = 70.70;
        char zoclywgjhe0 = 85;
        long efjvqgfglc3 = 16L;
        double ozdfutkrhw2 = 64.64;
        boolean fmprdhiw1 = true;
        float tfwgpyoe0 = 89.89f;
        int hznndkp2 = 16;
        long ulzwqpivbz1 = 3L;
        long lwvehqq0 = 90L;
        qFmgfseC(lwvehqq0, ulzwqpivbz1, hznndkp2);
        qFmgfseC(lwvehqq0, ulzwqpivbz1, hznndkp2);
        vPfFMfzb(qymdaevm0, poyukwnwyb1, bxskzvd2, bpksirdjyg3, wgtvuxwmys4);
        return SimplySPUtils.getLong("last_show_scene_time", 0L);
    }

    //垃圾方法
    private void ADYhYplC(boolean xfotjspan0) {
        boolean xfotjspan0a = xfotjspan0;
        TextUtils.isDigitsOnly("ADYhYplC" + xfotjspan0a + "ADYhYplC" + sFxNkBI + EVbXjTg + fLXzOzw + IDsZWHT + byErfux + hiaPNJW + dSRPiJa + pAqKmrM + OaiODso + AzFFymI + cHZbLVQ + dUfZjHY + VMtscBv + myCMTQo + jmGNiTW + CRZYrQN + "");
    }

    //垃圾方法
    private void EfArlTTh(long enohmuwu0, short ubytawoe1, char fbrtnbaokb2) {
        char fbrtnbaokb2a = fbrtnbaokb2;
        short ubytawoe1a = ubytawoe1;
        long enohmuwu0a = enohmuwu0;
        Log.w("EfArlTTh", "EfArlTTh" + fbrtnbaokb2a + enohmuwu0a + ubytawoe1a + "EfArlTTh" + EVbXjTg + dUfZjHY + AzFFymI + CRZYrQN + fLXzOzw + byErfux + OaiODso + pAqKmrM + cHZbLVQ + dSRPiJa + sFxNkBI + hiaPNJW + myCMTQo + IDsZWHT + jmGNiTW + VMtscBv + "");
    }

    //垃圾方法
    private void ZmEYowMG(long dtbehdyiso0, boolean vrnkubigdr1, int xmzzbldg2) {
        int xmzzbldg2a = xmzzbldg2;
        boolean vrnkubigdr1a = vrnkubigdr1;
        long dtbehdyiso0a = dtbehdyiso0;
        new String("ZmEYowMG" + xmzzbldg2a + dtbehdyiso0a + vrnkubigdr1a + "ZmEYowMG" + sFxNkBI + cHZbLVQ + myCMTQo + hiaPNJW + VMtscBv + jmGNiTW + IDsZWHT + byErfux + dUfZjHY + AzFFymI + EVbXjTg + CRZYrQN + OaiODso + pAqKmrM + fLXzOzw + dSRPiJa + "");
    }

    //垃圾方法
    private void VUhWpWOZ(double rhpfweeu0) {
        double rhpfweeu0a = rhpfweeu0;
        new AttributedString("VUhWpWOZ" + rhpfweeu0a + "VUhWpWOZ" + hiaPNJW + myCMTQo + sFxNkBI + jmGNiTW + pAqKmrM + EVbXjTg + IDsZWHT + CRZYrQN + byErfux + dUfZjHY + fLXzOzw + VMtscBv + cHZbLVQ + AzFFymI + dSRPiJa + OaiODso + "");
    }

    @Nullable
    public final Activity getCurrActivity() {
        double rhpfweeu0 = 36.36;
        int xmzzbldg2 = 68;
        boolean vrnkubigdr1 = true;
        long dtbehdyiso0 = 51L;
        char fbrtnbaokb2 = 50;
        short ubytawoe1 = 28;
        long enohmuwu0 = 52L;
        boolean xfotjspan0 = false;
        EfArlTTh(enohmuwu0, ubytawoe1, fbrtnbaokb2);
        EfArlTTh(enohmuwu0, ubytawoe1, fbrtnbaokb2);
        VUhWpWOZ(rhpfweeu0);
        VUhWpWOZ(rhpfweeu0);
        EfArlTTh(enohmuwu0, ubytawoe1, fbrtnbaokb2);
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    //垃圾方法
    private void DhrpTrnR(char wieawuxm0, short edifknpdmk1, int wehjanj2, float nhhwnxms3, long nossngxfl4) {
        long nossngxfl4a = nossngxfl4;
        float nhhwnxms3a = nhhwnxms3;
        int wehjanj2a = wehjanj2;
        short edifknpdmk1a = edifknpdmk1;
        char wieawuxm0a = wieawuxm0;
        new StringReader("DhrpTrnR" + nhhwnxms3a + wehjanj2a + nossngxfl4a + wieawuxm0a + edifknpdmk1a + "DhrpTrnR" + dUfZjHY + EVbXjTg + myCMTQo + hiaPNJW + dSRPiJa + pAqKmrM + sFxNkBI + AzFFymI + fLXzOzw + VMtscBv + IDsZWHT + jmGNiTW + OaiODso + CRZYrQN + cHZbLVQ + byErfux + "");
    }

    //垃圾方法
    private void BAnoMIfp(long cvrgfifqqv0, char wkwyjtjzm1, short lsldbftc2, double unbdyqca3) {
        double unbdyqca3a = unbdyqca3;
        short lsldbftc2a = lsldbftc2;
        char wkwyjtjzm1a = wkwyjtjzm1;
        long cvrgfifqqv0a = cvrgfifqqv0;
        Log.i("BAnoMIfp", "BAnoMIfp" + unbdyqca3a + cvrgfifqqv0a + wkwyjtjzm1a + lsldbftc2a + "BAnoMIfp" + pAqKmrM + cHZbLVQ + IDsZWHT + dUfZjHY + dSRPiJa + OaiODso + AzFFymI + myCMTQo + fLXzOzw + EVbXjTg + byErfux + sFxNkBI + hiaPNJW + VMtscBv + jmGNiTW + CRZYrQN + "");
    }

    //垃圾方法
    private void YBuXaBDj(long jefvqaa0, char cxafklhhe1, double pgywjkf2) {
        double pgywjkf2a = pgywjkf2;
        char cxafklhhe1a = cxafklhhe1;
        long jefvqaa0a = jefvqaa0;
        new WeakReference("YBuXaBDj" + cxafklhhe1a + pgywjkf2a + jefvqaa0a + "YBuXaBDj" + sFxNkBI + EVbXjTg + CRZYrQN + AzFFymI + byErfux + dUfZjHY + cHZbLVQ + myCMTQo + jmGNiTW + OaiODso + hiaPNJW + dSRPiJa + pAqKmrM + fLXzOzw + VMtscBv + IDsZWHT + "");
    }

    //垃圾方法
    private void OklKdIVn(short jsrameolbi0, short vxpfhyvl1, double jvdiniuj2) {
        double jvdiniuj2a = jvdiniuj2;
        short vxpfhyvl1a = vxpfhyvl1;
        short jsrameolbi0a = jsrameolbi0;
        new File("OklKdIVn" + jvdiniuj2a + jsrameolbi0a + vxpfhyvl1a + "OklKdIVn" + sFxNkBI + dUfZjHY + cHZbLVQ + dSRPiJa + AzFFymI + fLXzOzw + byErfux + CRZYrQN + OaiODso + jmGNiTW + VMtscBv + pAqKmrM + hiaPNJW + EVbXjTg + myCMTQo + IDsZWHT + "");
    }

    //垃圾方法
    private void BPpYhAPy(short hhuibhglvd0, short zyuaydzkgd1, double lzvchlfg2, double tqclwvhdg3, char jgabbhyzg4) {
        char jgabbhyzg4a = jgabbhyzg4;
        double tqclwvhdg3a = tqclwvhdg3;
        double lzvchlfg2a = lzvchlfg2;
        short zyuaydzkgd1a = zyuaydzkgd1;
        short hhuibhglvd0a = hhuibhglvd0;
        new WeakReference("BPpYhAPy" + lzvchlfg2a + zyuaydzkgd1a + hhuibhglvd0a + tqclwvhdg3a + jgabbhyzg4a + "BPpYhAPy" + fLXzOzw + dUfZjHY + byErfux + OaiODso + CRZYrQN + cHZbLVQ + VMtscBv + EVbXjTg + hiaPNJW + pAqKmrM + sFxNkBI + dSRPiJa + myCMTQo + jmGNiTW + AzFFymI + IDsZWHT + "");
    }

    //垃圾方法
    private void fOsHNcGL(byte nrqyoif0, float ayxxwhkou1, byte zppzugzmxn2, short wfqnqdmqfm3) {
        short wfqnqdmqfm3a = wfqnqdmqfm3;
        byte zppzugzmxn2a = zppzugzmxn2;
        float ayxxwhkou1a = ayxxwhkou1;
        byte nrqyoif0a = nrqyoif0;
        new AttributedString("fOsHNcGL" + ayxxwhkou1a + nrqyoif0a + wfqnqdmqfm3a + zppzugzmxn2a + "fOsHNcGL" + myCMTQo + dUfZjHY + pAqKmrM + cHZbLVQ + AzFFymI + hiaPNJW + OaiODso + IDsZWHT + dSRPiJa + byErfux + fLXzOzw + jmGNiTW + CRZYrQN + EVbXjTg + sFxNkBI + VMtscBv + "");
    }

    //垃圾方法
    private void fiZeZrvN(int zhwpojodn0, char juenygv1, double fflfhwppe2, short tnafpxu3) {
        short tnafpxu3a = tnafpxu3;
        double fflfhwppe2a = fflfhwppe2;
        char juenygv1a = juenygv1;
        int zhwpojodn0a = zhwpojodn0;
        new Thread("fiZeZrvN" + zhwpojodn0a + juenygv1a + fflfhwppe2a + tnafpxu3a + "fiZeZrvN" + fLXzOzw + VMtscBv + pAqKmrM + IDsZWHT + OaiODso + EVbXjTg + hiaPNJW + dSRPiJa + jmGNiTW + myCMTQo + CRZYrQN + AzFFymI + sFxNkBI + byErfux + dUfZjHY + cHZbLVQ + "");
    }

    //垃圾方法
    private void TifJqyUM(boolean fkxjdjj0, double fxlvvawd1, float kgoyehtfo2) {
        float kgoyehtfo2a = kgoyehtfo2;
        double fxlvvawd1a = fxlvvawd1;
        boolean fkxjdjj0a = fkxjdjj0;
        new StringBuffer("TifJqyUM" + fxlvvawd1a + fkxjdjj0a + kgoyehtfo2a + "TifJqyUM" + IDsZWHT + dUfZjHY + EVbXjTg + OaiODso + byErfux + hiaPNJW + VMtscBv + sFxNkBI + pAqKmrM + myCMTQo + CRZYrQN + AzFFymI + cHZbLVQ + fLXzOzw + dSRPiJa + jmGNiTW + "");
    }

    public final void killAllActivity() {
        float kgoyehtfo2 = 87.87f;
        double fxlvvawd1 = 19.19;
        boolean fkxjdjj0 = true;
        short tnafpxu3 = 75;
        double fflfhwppe2 = 59.59;
        char juenygv1 = 68;
        int zhwpojodn0 = 52;
        short wfqnqdmqfm3 = 74;
        byte zppzugzmxn2 = 17;
        float ayxxwhkou1 = 81.81f;
        byte nrqyoif0 = 4;
        char jgabbhyzg4 = 82;
        double tqclwvhdg3 = 5.5;
        double lzvchlfg2 = 25.25;
        short zyuaydzkgd1 = 50;
        short hhuibhglvd0 = 48;
        double jvdiniuj2 = 84.84;
        short vxpfhyvl1 = 92;
        short jsrameolbi0 = 86;
        double pgywjkf2 = 52.52;
        char cxafklhhe1 = 10;
        long jefvqaa0 = 50L;
        double unbdyqca3 = 36.36;
        short lsldbftc2 = 71;
        char wkwyjtjzm1 = 82;
        long cvrgfifqqv0 = 3L;
        long nossngxfl4 = 73L;
        float nhhwnxms3 = 72.72f;
        int wehjanj2 = 79;
        short edifknpdmk1 = 24;
        char wieawuxm0 = 19;
        Iterator<Activity> var3 = livingActivities.iterator();
        fiZeZrvN(zhwpojodn0, juenygv1, fflfhwppe2, tnafpxu3);
        BAnoMIfp(cvrgfifqqv0, wkwyjtjzm1, lsldbftc2, unbdyqca3);
        fOsHNcGL(nrqyoif0, ayxxwhkou1, zppzugzmxn2, wfqnqdmqfm3);
        YBuXaBDj(jefvqaa0, cxafklhhe1, pgywjkf2);
        TifJqyUM(fkxjdjj0, fxlvvawd1, kgoyehtfo2);
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private SimplyHouseworkrOrgManager() {
    }

    //垃圾方法
    static private void TnMcDlrD(long ltmdbugs0) {
        long ltmdbugs0a = ltmdbugs0;
        new WeakReference("TnMcDlrD" + ltmdbugs0a + "TnMcDlrD" + "");
    }

    //垃圾方法
    static private void lLmMQYPa(char jhlowfopz0) {
        char jhlowfopz0a = jhlowfopz0;
        TextUtils.isEmpty("lLmMQYPa" + jhlowfopz0a + "lLmMQYPa" + "");
    }

    //垃圾方法
    static private void ODbIKhis(short fyitrlvyhf0, boolean vnmyjdovm1) {
        boolean vnmyjdovm1a = vnmyjdovm1;
        short fyitrlvyhf0a = fyitrlvyhf0;
        new String("ODbIKhis" + fyitrlvyhf0a + vnmyjdovm1a + "ODbIKhis" + "");
    }

    //垃圾方法
    static private void oqNssglr(int kgqwveti0) {
        int kgqwveti0a = kgqwveti0;
        new StringReader("oqNssglr" + kgqwveti0a + "oqNssglr" + "");
    }

    public static boolean isNotificationEnabled() {
        int kgqwveti0 = 49;
        boolean vnmyjdovm1 = true;
        short fyitrlvyhf0 = 91;
        char jhlowfopz0 = 89;
        long ltmdbugs0 = 7L;
        oqNssglr(kgqwveti0);
        TnMcDlrD(ltmdbugs0);
        lLmMQYPa(jhlowfopz0);
        TnMcDlrD(ltmdbugs0);
        TnMcDlrD(ltmdbugs0);
        oqNssglr(kgqwveti0);
        TnMcDlrD(ltmdbugs0);
        ODbIKhis(fyitrlvyhf0, vnmyjdovm1);
        TnMcDlrD(ltmdbugs0);
        TnMcDlrD(ltmdbugs0);
        return SimplyNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    static private void fGWCyIqY(char ramkzzhcv0) {
        char ramkzzhcv0a = ramkzzhcv0;
        new Intent("fGWCyIqY" + ramkzzhcv0a + "fGWCyIqY" + "");
    }

    //垃圾方法
    static private void ZHQRMxhl(long jtiualhfxy0, byte sutlsxnz1, long amgrefo2) {
        long amgrefo2a = amgrefo2;
        byte sutlsxnz1a = sutlsxnz1;
        long jtiualhfxy0a = jtiualhfxy0;
    }

    //垃圾方法
    static private void aPEGftHP(boolean prmupgmn0) {
        boolean prmupgmn0a = prmupgmn0;
        new String("aPEGftHP" + prmupgmn0a + "aPEGftHP" + "");
    }

    //垃圾方法
    static private void rDUTyanA(short cnkvjincnb0, int smyvfeqiw1, char imgrvlklk2) {
        char imgrvlklk2a = imgrvlklk2;
        int smyvfeqiw1a = smyvfeqiw1;
        short cnkvjincnb0a = cnkvjincnb0;
        TextUtils.isEmpty("rDUTyanA" + smyvfeqiw1a + cnkvjincnb0a + imgrvlklk2a + "rDUTyanA" + "");
    }

    //垃圾方法
    static private void gtBAiikB(byte yhlrbno0, double puajmnr1, float yzhzeij2, short ylnebhsjik3, int ilvcmqcm4) {
        int ilvcmqcm4a = ilvcmqcm4;
        short ylnebhsjik3a = ylnebhsjik3;
        float yzhzeij2a = yzhzeij2;
        double puajmnr1a = puajmnr1;
        byte yhlrbno0a = yhlrbno0;
        new Thread("gtBAiikB" + ilvcmqcm4a + yzhzeij2a + ylnebhsjik3a + puajmnr1a + yhlrbno0a + "gtBAiikB" + "");
    }

    //垃圾方法
    static private void CgREarzK(double dkjogbsghu0) {
        double dkjogbsghu0a = dkjogbsghu0;
        System.out.println("CgREarzK" + dkjogbsghu0a + "CgREarzK" + "");
    }

    //垃圾方法
    static private void wNgBmxmX(int hjbpwnj0) {
        int hjbpwnj0a = hjbpwnj0;
        new StringReader("wNgBmxmX" + hjbpwnj0a + "wNgBmxmX" + "");
    }

    //垃圾方法
    static private void oQnEYijv(float sgstpujpk0, float jyexkdike1, long kmotstrm2, boolean yuuotosf3) {
        boolean yuuotosf3a = yuuotosf3;
        long kmotstrm2a = kmotstrm2;
        float jyexkdike1a = jyexkdike1;
        float sgstpujpk0a = sgstpujpk0;
        new StringReader("oQnEYijv" + jyexkdike1a + yuuotosf3a + kmotstrm2a + sgstpujpk0a + "oQnEYijv" + "");
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        boolean yuuotosf3 = false;
        long kmotstrm2 = 38L;
        float jyexkdike1 = 32.32f;
        float sgstpujpk0 = 76.76f;
        int hjbpwnj0 = 88;
        double dkjogbsghu0 = 71.71;
        int ilvcmqcm4 = 4;
        short ylnebhsjik3 = 74;
        float yzhzeij2 = 8.8f;
        double puajmnr1 = 25.25;
        byte yhlrbno0 = 62;
        char imgrvlklk2 = 97;
        int smyvfeqiw1 = 99;
        short cnkvjincnb0 = 91;
        boolean prmupgmn0 = false;
        long amgrefo2 = 89L;
        byte sutlsxnz1 = 40;
        long jtiualhfxy0 = 68L;
        char ramkzzhcv0 = 62;
        wNgBmxmX(hjbpwnj0);
        oQnEYijv(sgstpujpk0, jyexkdike1, kmotstrm2, yuuotosf3);
        fGWCyIqY(ramkzzhcv0);
        wNgBmxmX(hjbpwnj0);
        CgREarzK(dkjogbsghu0);
        gtBAiikB(yhlrbno0, puajmnr1, yzhzeij2, ylnebhsjik3, ilvcmqcm4);
        aPEGftHP(prmupgmn0);
        aPEGftHP(prmupgmn0);
        gtBAiikB(yhlrbno0, puajmnr1, yzhzeij2, ylnebhsjik3, ilvcmqcm4);
        CgREarzK(dkjogbsghu0);
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
    static private void iJyMDHsW(boolean xcqztdhoq0) {
        boolean xcqztdhoq0a = xcqztdhoq0;
        TextUtils.isEmpty("iJyMDHsW" + xcqztdhoq0a + "iJyMDHsW" + "");
    }

    //垃圾方法
    static private void HdCjtgsz(char nzrxeyexrq0, char wcaidat1) {
        char wcaidat1a = wcaidat1;
        char nzrxeyexrq0a = nzrxeyexrq0;
        new AttributedString("HdCjtgsz" + nzrxeyexrq0a + wcaidat1a + "HdCjtgsz" + "");
    }

    //垃圾方法
    static private void WYkbcftR(boolean zxgzslxejs0) {
        boolean zxgzslxejs0a = zxgzslxejs0;
        Log.w("WYkbcftR", "WYkbcftR" + zxgzslxejs0a + "WYkbcftR" + "");
    }

    //垃圾方法
    static private void meYCATym(int aesfkqp0, short kmmzogvk1, int ofpossrh2) {
        int ofpossrh2a = ofpossrh2;
        short kmmzogvk1a = kmmzogvk1;
        int aesfkqp0a = aesfkqp0;
        Log.e("meYCATym", "meYCATym" + kmmzogvk1a + ofpossrh2a + aesfkqp0a + "meYCATym" + "");
    }

    public static void testFcmToken(String token) {
        int ofpossrh2 = 15;
        short kmmzogvk1 = 62;
        int aesfkqp0 = 12;
        boolean zxgzslxejs0 = false;
        char wcaidat1 = 53;
        char nzrxeyexrq0 = 65;
        boolean xcqztdhoq0 = false;
        iJyMDHsW(xcqztdhoq0);
        iJyMDHsW(xcqztdhoq0);
        meYCATym(aesfkqp0, kmmzogvk1, ofpossrh2);
        WYkbcftR(zxgzslxejs0);
        WYkbcftR(zxgzslxejs0);
        SimplyMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        //垃圾方法
        private void FnDUlMrh(short fkovzbwbg0, double dvtxnyfj1, double whfmbqtrk2) {
            double whfmbqtrk2a = whfmbqtrk2;
            double dvtxnyfj1a = dvtxnyfj1;
            short fkovzbwbg0a = fkovzbwbg0;
        }

        //垃圾方法
        private void Jnnxdnuh(short vftqugtl0, double rqsonufuh1) {
            double rqsonufuh1a = rqsonufuh1;
            short vftqugtl0a = vftqugtl0;
            new String("Jnnxdnuh" + rqsonufuh1a + vftqugtl0a + "Jnnxdnuh" + "" + "");
        }

        //垃圾方法
        private void QEufHycB(char wymudibow0, char usiaqwakq1, short ghorccwv2) {
            short ghorccwv2a = ghorccwv2;
            char usiaqwakq1a = usiaqwakq1;
            char wymudibow0a = wymudibow0;
            new StringBuffer("QEufHycB" + usiaqwakq1a + wymudibow0a + ghorccwv2a + "QEufHycB" + "" + "");
        }

        //垃圾方法
        private void XSwqxOOn(char ephidvtgte0) {
            char ephidvtgte0a = ephidvtgte0;
            new Intent("XSwqxOOn" + ephidvtgte0a + "XSwqxOOn" + "" + "");
        }

        //垃圾方法
        private void QtrhZCls(boolean bfchavsrm0, float qafrsqw1, long dbwoacofc2) {
            long dbwoacofc2a = dbwoacofc2;
            float qafrsqw1a = qafrsqw1;
            boolean bfchavsrm0a = bfchavsrm0;
            TextUtils.isEmpty("QtrhZCls" + qafrsqw1a + dbwoacofc2a + bfchavsrm0a + "QtrhZCls" + "" + "");
        }

        //垃圾方法
        private void EIOLuxRi(byte krxowptvmd0, char oknmdfqkji1, short dzreedaxj2, float wlbevvj3, boolean wtoeduc4) {
            boolean wtoeduc4a = wtoeduc4;
            float wlbevvj3a = wlbevvj3;
            short dzreedaxj2a = dzreedaxj2;
            char oknmdfqkji1a = oknmdfqkji1;
            byte krxowptvmd0a = krxowptvmd0;
        }

        //垃圾方法
        private void carLPQFC(int sfjxngrr0) {
            int sfjxngrr0a = sfjxngrr0;
            new Thread("carLPQFC" + sfjxngrr0a + "carLPQFC" + "" + "");
        }

        //垃圾方法
        private void eEYtahFf(int yizrlxa0, short ajwscldz1) {
            short ajwscldz1a = ajwscldz1;
            int yizrlxa0a = yizrlxa0;
            Log.w("eEYtahFf", "eEYtahFf" + yizrlxa0a + ajwscldz1a + "eEYtahFf" + "" + "");
        }

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            short ajwscldz1 = 24;
            int yizrlxa0 = 90;
            int sfjxngrr0 = 74;
            boolean wtoeduc4 = false;
            float wlbevvj3 = 96.96f;
            short dzreedaxj2 = 91;
            char oknmdfqkji1 = 80;
            byte krxowptvmd0 = 77;
            long dbwoacofc2 = 98L;
            float qafrsqw1 = 100.100f;
            boolean bfchavsrm0 = false;
            char ephidvtgte0 = 58;
            short ghorccwv2 = 100;
            char usiaqwakq1 = 74;
            char wymudibow0 = 12;
            double rqsonufuh1 = 48.48;
            short vftqugtl0 = 53;
            double whfmbqtrk2 = 54.54;
            double dvtxnyfj1 = 45.45;
            short fkovzbwbg0 = 100;
            SimplySPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        //垃圾方法
        private void aItEWXJz(float jzkfiwwd0, char skddzjcemn1, long kplgkfl2, short knnqwigt3) {
            short knnqwigt3a = knnqwigt3;
            long kplgkfl2a = kplgkfl2;
            char skddzjcemn1a = skddzjcemn1;
            float jzkfiwwd0a = jzkfiwwd0;
            new Thread("aItEWXJz" + kplgkfl2a + skddzjcemn1a + knnqwigt3a + jzkfiwwd0a + "aItEWXJz" + "" + "");
        }

        //垃圾方法
        private void XdDyOEWz(double tdwefbl0, boolean ufmsafnko1, long jnccjuw2, int qqozwuvcd3) {
            int qqozwuvcd3a = qqozwuvcd3;
            long jnccjuw2a = jnccjuw2;
            boolean ufmsafnko1a = ufmsafnko1;
            double tdwefbl0a = tdwefbl0;
            new WeakReference("XdDyOEWz" + qqozwuvcd3a + jnccjuw2a + ufmsafnko1a + tdwefbl0a + "XdDyOEWz" + "" + "");
        }

        //垃圾方法
        private void uqdYzqdC(short xptufzutf0, short vgikrpffy1, float bejnxcu2) {
            float bejnxcu2a = bejnxcu2;
            short vgikrpffy1a = vgikrpffy1;
            short xptufzutf0a = xptufzutf0;
            TextUtils.isDigitsOnly("uqdYzqdC" + xptufzutf0a + bejnxcu2a + vgikrpffy1a + "uqdYzqdC" + "" + "");
        }

        //垃圾方法
        private void gcuzYCrF(float gvmafqy0, byte gijfqobsu1) {
            byte gijfqobsu1a = gijfqobsu1;
            float gvmafqy0a = gvmafqy0;
            Log.w("gcuzYCrF", "gcuzYCrF" + gvmafqy0a + gijfqobsu1a + "gcuzYCrF" + "" + "");
        }

        //垃圾方法
        private void jhrfVzlu(int ubzkoovd0) {
            int ubzkoovd0a = ubzkoovd0;
            new String("jhrfVzlu" + ubzkoovd0a + "jhrfVzlu" + "" + "");
        }

        //垃圾方法
        private void zdoLtRvq(long nyoqpyxch0, short vektney1) {
            short vektney1a = vektney1;
            long nyoqpyxch0a = nyoqpyxch0;
            System.out.println("zdoLtRvq" + nyoqpyxch0a + vektney1a + "zdoLtRvq" + "" + "");
        }

        //垃圾方法
        private void ICFjJIaJ(short zvbabdf0, int kmnntqpr1, char fpsgyng2, short ovzszeuzk3) {
            short ovzszeuzk3a = ovzszeuzk3;
            char fpsgyng2a = fpsgyng2;
            int kmnntqpr1a = kmnntqpr1;
            short zvbabdf0a = zvbabdf0;
            TextUtils.isEmpty("ICFjJIaJ" + zvbabdf0a + kmnntqpr1a + fpsgyng2a + ovzszeuzk3a + "ICFjJIaJ" + "" + "");
        }

        //垃圾方法
        private void qGaExVPr(double viqarsda0, boolean xzsitwovbs1) {
            boolean xzsitwovbs1a = xzsitwovbs1;
            double viqarsda0a = viqarsda0;
        }

        //垃圾方法
        private void xfIHMtNm(float jlehvskm0, char zcnipdut1, short urwvphfhea2) {
            short urwvphfhea2a = urwvphfhea2;
            char zcnipdut1a = zcnipdut1;
            float jlehvskm0a = jlehvskm0;
            new AttributedString("xfIHMtNm" + zcnipdut1a + jlehvskm0a + urwvphfhea2a + "xfIHMtNm" + "" + "");
        }

        //垃圾方法
        private void EOkGcmOL(byte hnyaiht0) {
            byte hnyaiht0a = hnyaiht0;
            new WeakReference("EOkGcmOL" + hnyaiht0a + "EOkGcmOL" + "" + "");
        }

        //垃圾方法
        private void YCsFRlsu(long qrzhyxsja0, float bxyhtsb1, float vieauwleg2, double kwlmwrif3) {
            double kwlmwrif3a = kwlmwrif3;
            float vieauwleg2a = vieauwleg2;
            float bxyhtsb1a = bxyhtsb1;
            long qrzhyxsja0a = qrzhyxsja0;
            Log.w("YCsFRlsu", "YCsFRlsu" + vieauwleg2a + bxyhtsb1a + qrzhyxsja0a + kwlmwrif3a + "YCsFRlsu" + "" + "");
        }

        //垃圾方法
        private void lwlFBqDY(int usxmmuywz0, long ygfcapbwk1, char adcxjbha2, char yvjegelgon3, double piejthq4) {
            double piejthq4a = piejthq4;
            char yvjegelgon3a = yvjegelgon3;
            char adcxjbha2a = adcxjbha2;
            long ygfcapbwk1a = ygfcapbwk1;
            int usxmmuywz0a = usxmmuywz0;
            new AttributedString("lwlFBqDY" + piejthq4a + yvjegelgon3a + usxmmuywz0a + adcxjbha2a + ygfcapbwk1a + "lwlFBqDY" + "" + "");
        }

        //垃圾方法
        private void qEGBWYjD(long ebokrwlh0, long ecyovnldr1, short jthuevqpj2, char guklfjavcv3, int kagwaapdx4) {
            int kagwaapdx4a = kagwaapdx4;
            char guklfjavcv3a = guklfjavcv3;
            short jthuevqpj2a = jthuevqpj2;
            long ecyovnldr1a = ecyovnldr1;
            long ebokrwlh0a = ebokrwlh0;
            new StringReader("qEGBWYjD" + jthuevqpj2a + ebokrwlh0a + guklfjavcv3a + ecyovnldr1a + kagwaapdx4a + "qEGBWYjD" + "" + "");
        }

        //垃圾方法
        private void jkiogGJZ(float hifojwsb0, short oihdmgqi1) {
            short oihdmgqi1a = oihdmgqi1;
            float hifojwsb0a = hifojwsb0;
            new String("jkiogGJZ" + hifojwsb0a + oihdmgqi1a + "jkiogGJZ" + "" + "");
        }

        //垃圾方法
        private void hpTBYfRM(char jwjkvlucm0, double uksekiidlm1, double eterysauj2, byte bwcfqkma3) {
            byte bwcfqkma3a = bwcfqkma3;
            double eterysauj2a = eterysauj2;
            double uksekiidlm1a = uksekiidlm1;
            char jwjkvlucm0a = jwjkvlucm0;
            Log.i("hpTBYfRM", "hpTBYfRM" + jwjkvlucm0a + uksekiidlm1a + bwcfqkma3a + eterysauj2a + "hpTBYfRM" + "" + "");
        }

        //垃圾方法
        private void NDOjNRvk(char wowvbjmyx0, char zymaezgf1) {
            char zymaezgf1a = zymaezgf1;
            char wowvbjmyx0a = wowvbjmyx0;
            TextUtils.isDigitsOnly("NDOjNRvk" + wowvbjmyx0a + zymaezgf1a + "NDOjNRvk" + "" + "");
        }

        //垃圾方法
        private void xZURweNb(float aqexyyx0, short wdtzirt1) {
            short wdtzirt1a = wdtzirt1;
            float aqexyyx0a = aqexyyx0;
            new File("xZURweNb" + aqexyyx0a + wdtzirt1a + "xZURweNb" + "" + "");
        }

        //垃圾方法
        private void XcBpXOqP(double nxbhhdc0, boolean mghlqdf1, double umeqbojd2, double rzzlqzt3) {
            double rzzlqzt3a = rzzlqzt3;
            double umeqbojd2a = umeqbojd2;
            boolean mghlqdf1a = mghlqdf1;
            double nxbhhdc0a = nxbhhdc0;
            new AttributedString("XcBpXOqP" + mghlqdf1a + umeqbojd2a + nxbhhdc0a + rzzlqzt3a + "XcBpXOqP" + "" + "");
        }

        //垃圾方法
        private void HsWSruyZ(long lqgufuwuyz0) {
            long lqgufuwuyz0a = lqgufuwuyz0;
            new WeakReference("HsWSruyZ" + lqgufuwuyz0a + "HsWSruyZ" + "" + "");
        }

        //垃圾方法
        private void kEXkOyvX(long xraqvisf0, double ckzxqwx1, int wbzmfcyr2) {
            int wbzmfcyr2a = wbzmfcyr2;
            double ckzxqwx1a = ckzxqwx1;
            long xraqvisf0a = xraqvisf0;
            new StringBuffer("kEXkOyvX" + wbzmfcyr2a + xraqvisf0a + ckzxqwx1a + "kEXkOyvX" + "" + "");
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            int wbzmfcyr2 = 100;
            double ckzxqwx1 = 40.40;
            long xraqvisf0 = 80L;
            long lqgufuwuyz0 = 35L;
            double rzzlqzt3 = 57.57;
            double umeqbojd2 = 68.68;
            boolean mghlqdf1 = true;
            double nxbhhdc0 = 13.13;
            short wdtzirt1 = 93;
            float aqexyyx0 = 74.74f;
            char zymaezgf1 = 77;
            char wowvbjmyx0 = 47;
            byte bwcfqkma3 = 89;
            double eterysauj2 = 1.1;
            double uksekiidlm1 = 23.23;
            char jwjkvlucm0 = 2;
            short oihdmgqi1 = 96;
            float hifojwsb0 = 68.68f;
            int kagwaapdx4 = 98;
            char guklfjavcv3 = 61;
            short jthuevqpj2 = 23;
            long ecyovnldr1 = 84L;
            long ebokrwlh0 = 35L;
            double piejthq4 = 26.26;
            char yvjegelgon3 = 75;
            char adcxjbha2 = 37;
            long ygfcapbwk1 = 57L;
            int usxmmuywz0 = 25;
            double kwlmwrif3 = 76.76;
            float vieauwleg2 = 43.43f;
            float bxyhtsb1 = 1.1f;
            long qrzhyxsja0 = 55L;
            byte hnyaiht0 = 92;
            short urwvphfhea2 = 91;
            char zcnipdut1 = 6;
            float jlehvskm0 = 81.81f;
            boolean xzsitwovbs1 = true;
            double viqarsda0 = 59.59;
            short ovzszeuzk3 = 12;
            char fpsgyng2 = 34;
            int kmnntqpr1 = 61;
            short zvbabdf0 = 63;
            short vektney1 = 51;
            long nyoqpyxch0 = 20L;
            int ubzkoovd0 = 39;
            byte gijfqobsu1 = 72;
            float gvmafqy0 = 17.17f;
            float bejnxcu2 = 12.12f;
            short vgikrpffy1 = 19;
            short xptufzutf0 = 31;
            int qqozwuvcd3 = 22;
            long jnccjuw2 = 39L;
            boolean ufmsafnko1 = false;
            double tdwefbl0 = 89.89;
            short knnqwigt3 = 36;
            long kplgkfl2 = 44L;
            char skddzjcemn1 = 37;
            float jzkfiwwd0 = 58.58f;
            SimplySPUtils.putLong("lastActivityOnPause", 0L);
            kEXkOyvX(xraqvisf0, ckzxqwx1, wbzmfcyr2);
            aItEWXJz(jzkfiwwd0, skddzjcemn1, kplgkfl2, knnqwigt3);
            EOkGcmOL(hnyaiht0);
            uqdYzqdC(xptufzutf0, vgikrpffy1, bejnxcu2);
            NDOjNRvk(wowvbjmyx0, zymaezgf1);
            SimplyHouseworkrOrgManager.INSTANCE.setCurrentActivity(activity);
            hpTBYfRM(jwjkvlucm0, uksekiidlm1, eterysauj2, bwcfqkma3);
            kEXkOyvX(xraqvisf0, ckzxqwx1, wbzmfcyr2);
            qGaExVPr(viqarsda0, xzsitwovbs1);
            SimplyHouseworkrOrgManager.creatingActivities.add(activity);
            hpTBYfRM(jwjkvlucm0, uksekiidlm1, eterysauj2, bwcfqkma3);
            NDOjNRvk(wowvbjmyx0, zymaezgf1);
            uqdYzqdC(xptufzutf0, vgikrpffy1, bejnxcu2);
            jhrfVzlu(ubzkoovd0);
            aItEWXJz(jzkfiwwd0, skddzjcemn1, kplgkfl2, knnqwigt3);
            aItEWXJz(jzkfiwwd0, skddzjcemn1, kplgkfl2, knnqwigt3);
            SimplyHouseworkrOrgManager.livingActivities.add(activity);
            qGaExVPr(viqarsda0, xzsitwovbs1);
            EOkGcmOL(hnyaiht0);
            NDOjNRvk(wowvbjmyx0, zymaezgf1);
            xfIHMtNm(jlehvskm0, zcnipdut1, urwvphfhea2);
            aItEWXJz(jzkfiwwd0, skddzjcemn1, kplgkfl2, knnqwigt3);
            uqdYzqdC(xptufzutf0, vgikrpffy1, bejnxcu2);
            lwlFBqDY(usxmmuywz0, ygfcapbwk1, adcxjbha2, yvjegelgon3, piejthq4);
            EOkGcmOL(hnyaiht0);
            YCsFRlsu(qrzhyxsja0, bxyhtsb1, vieauwleg2, kwlmwrif3);
            SimplyHouseworkrOrgManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void QAgmEjUJ(boolean dmfzlaxqg0) {
            boolean dmfzlaxqg0a = dmfzlaxqg0;
            new Intent("QAgmEjUJ" + dmfzlaxqg0a + "QAgmEjUJ" + "" + "");
        }

        //垃圾方法
        private void gbZvSQZU(byte fiktpykx0, float clnjltlfk1, float mgupzceno2) {
            float mgupzceno2a = mgupzceno2;
            float clnjltlfk1a = clnjltlfk1;
            byte fiktpykx0a = fiktpykx0;
            Log.w("gbZvSQZU", "gbZvSQZU" + clnjltlfk1a + fiktpykx0a + mgupzceno2a + "gbZvSQZU" + "" + "");
        }

        //垃圾方法
        private void fktkBBwO(int sjssbcwscc0, byte zicgzkp1, byte uwptxzsob2, byte lawxmwqt3) {
            byte lawxmwqt3a = lawxmwqt3;
            byte uwptxzsob2a = uwptxzsob2;
            byte zicgzkp1a = zicgzkp1;
            int sjssbcwscc0a = sjssbcwscc0;
            new Intent("fktkBBwO" + lawxmwqt3a + uwptxzsob2a + zicgzkp1a + sjssbcwscc0a + "fktkBBwO" + "" + "");
        }

        //垃圾方法
        private void xJzNwRJX(int lvgnyfeorh0, char iyfgennm1) {
            char iyfgennm1a = iyfgennm1;
            int lvgnyfeorh0a = lvgnyfeorh0;
            new AttributedString("xJzNwRJX" + lvgnyfeorh0a + iyfgennm1a + "xJzNwRJX" + "" + "");
        }

        public void onActivityStarted(@NotNull Activity activity) {
            char iyfgennm1 = 40;
            int lvgnyfeorh0 = 22;
            byte lawxmwqt3 = 12;
            byte uwptxzsob2 = 52;
            byte zicgzkp1 = 87;
            int sjssbcwscc0 = 20;
            float mgupzceno2 = 29.29f;
            float clnjltlfk1 = 75.75f;
            byte fiktpykx0 = 6;
            boolean dmfzlaxqg0 = true;
            fktkBBwO(sjssbcwscc0, zicgzkp1, uwptxzsob2, lawxmwqt3);
            gbZvSQZU(fiktpykx0, clnjltlfk1, mgupzceno2);
            QAgmEjUJ(dmfzlaxqg0);
            gbZvSQZU(fiktpykx0, clnjltlfk1, mgupzceno2);
            QAgmEjUJ(dmfzlaxqg0);
            fktkBBwO(sjssbcwscc0, zicgzkp1, uwptxzsob2, lawxmwqt3);
            gbZvSQZU(fiktpykx0, clnjltlfk1, mgupzceno2);
            fktkBBwO(sjssbcwscc0, zicgzkp1, uwptxzsob2, lawxmwqt3);
            QAgmEjUJ(dmfzlaxqg0);
            SimplyHouseworkrOrgManager.visibleActivities.add(activity);
        }

        //垃圾方法
        private void lmYLRTjL(short mesbxiy0) {
            short mesbxiy0a = mesbxiy0;
        }

        //垃圾方法
        private void rYGobZFj(short tvfpqji0, char sfukesugzh1, float muhsspw2, boolean ichwwdp3) {
            boolean ichwwdp3a = ichwwdp3;
            float muhsspw2a = muhsspw2;
            char sfukesugzh1a = sfukesugzh1;
            short tvfpqji0a = tvfpqji0;
            new File("rYGobZFj" + muhsspw2a + tvfpqji0a + ichwwdp3a + sfukesugzh1a + "rYGobZFj" + "" + "");
        }

        //垃圾方法
        private void ErFOBayj(boolean jhrnlusd0, float iabzhhse1) {
            float iabzhhse1a = iabzhhse1;
            boolean jhrnlusd0a = jhrnlusd0;
            new StringBuffer("ErFOBayj" + iabzhhse1a + jhrnlusd0a + "ErFOBayj" + "" + "");
        }

        //垃圾方法
        private void Kaphixxj(float ytwadac0, char fhjbhzpqa1, float abcrckxhvo2, long yxllcux3, char sjteyxhqw4) {
            char sjteyxhqw4a = sjteyxhqw4;
            long yxllcux3a = yxllcux3;
            float abcrckxhvo2a = abcrckxhvo2;
            char fhjbhzpqa1a = fhjbhzpqa1;
            float ytwadac0a = ytwadac0;
        }

        //垃圾方法
        private void GkbZcMdk(boolean wcbjvkrjd0, double gmejhlaurz1, byte zpnsbpfp2, int zdrxpopb3, long ttbgarz4) {
            long ttbgarz4a = ttbgarz4;
            int zdrxpopb3a = zdrxpopb3;
            byte zpnsbpfp2a = zpnsbpfp2;
            double gmejhlaurz1a = gmejhlaurz1;
            boolean wcbjvkrjd0a = wcbjvkrjd0;
            Log.w("GkbZcMdk", "GkbZcMdk" + ttbgarz4a + zpnsbpfp2a + zdrxpopb3a + wcbjvkrjd0a + gmejhlaurz1a + "GkbZcMdk" + "" + "");
        }

        //垃圾方法
        private void GUxwnlko(short jqvjylm0) {
            short jqvjylm0a = jqvjylm0;
            Log.w("GUxwnlko", "GUxwnlko" + jqvjylm0a + "GUxwnlko" + "" + "");
        }

        //垃圾方法
        private void uUZEGRBa(int nxwqzjua0) {
            int nxwqzjua0a = nxwqzjua0;
            new Intent("uUZEGRBa" + nxwqzjua0a + "uUZEGRBa" + "" + "");
        }

        //垃圾方法
        private void zADqimiK(double qxnwxia0, int chnwgabeiu1) {
            int chnwgabeiu1a = chnwgabeiu1;
            double qxnwxia0a = qxnwxia0;
            System.out.println("zADqimiK" + chnwgabeiu1a + qxnwxia0a + "zADqimiK" + "" + "");
        }

        //垃圾方法
        private void JuHxVxaX(char rixqgax0, short vvsivexqo1) {
            short vvsivexqo1a = vvsivexqo1;
            char rixqgax0a = rixqgax0;
            Log.i("JuHxVxaX", "JuHxVxaX" + rixqgax0a + vvsivexqo1a + "JuHxVxaX" + "" + "");
        }

        //垃圾方法
        private void GVLtEGZk(double gkpeqlj0, byte jgqejkmj1, short gncxnac2) {
            short gncxnac2a = gncxnac2;
            byte jgqejkmj1a = jgqejkmj1;
            double gkpeqlj0a = gkpeqlj0;
            new String("GVLtEGZk" + gncxnac2a + jgqejkmj1a + gkpeqlj0a + "GVLtEGZk" + "" + "");
        }

        //垃圾方法
        private void SrqtjRnu(double zyzqejszd0, long cahaaomu1, long xcgovxbaa2, float nsiqdwkftw3) {
            float nsiqdwkftw3a = nsiqdwkftw3;
            long xcgovxbaa2a = xcgovxbaa2;
            long cahaaomu1a = cahaaomu1;
            double zyzqejszd0a = zyzqejszd0;
            new AttributedString("SrqtjRnu" + zyzqejszd0a + cahaaomu1a + xcgovxbaa2a + nsiqdwkftw3a + "SrqtjRnu" + "" + "");
        }

        //垃圾方法
        private void XYwgsnpv(char uuldgbgfv0, char ncearju1) {
            char ncearju1a = ncearju1;
            char uuldgbgfv0a = uuldgbgfv0;
            new WeakReference("XYwgsnpv" + ncearju1a + uuldgbgfv0a + "XYwgsnpv" + "" + "");
        }

        //垃圾方法
        private void YhYrnsYG(double zjqszzk0, byte zobhrnbvep1, char ururbyriyl2, float rxxpxflmd3) {
            float rxxpxflmd3a = rxxpxflmd3;
            char ururbyriyl2a = ururbyriyl2;
            byte zobhrnbvep1a = zobhrnbvep1;
            double zjqszzk0a = zjqszzk0;
            Log.w("YhYrnsYG", "YhYrnsYG" + zjqszzk0a + zobhrnbvep1a + ururbyriyl2a + rxxpxflmd3a + "YhYrnsYG" + "" + "");
        }

        //垃圾方法
        private void uSvHgFHN(short uegwkeyqt0, boolean opcruruinr1, int cizvcyrc2, int awalvatauv3, double xsixuywtfi4) {
            double xsixuywtfi4a = xsixuywtfi4;
            int awalvatauv3a = awalvatauv3;
            int cizvcyrc2a = cizvcyrc2;
            boolean opcruruinr1a = opcruruinr1;
            short uegwkeyqt0a = uegwkeyqt0;
            new WeakReference("uSvHgFHN" + cizvcyrc2a + awalvatauv3a + xsixuywtfi4a + uegwkeyqt0a + opcruruinr1a + "uSvHgFHN" + "" + "");
        }

        //垃圾方法
        private void wGpeUFub(char bkbazke0, int fzyahjcyzh1, byte crwdkifla2, long gtxvmmqz3) {
            long gtxvmmqz3a = gtxvmmqz3;
            byte crwdkifla2a = crwdkifla2;
            int fzyahjcyzh1a = fzyahjcyzh1;
            char bkbazke0a = bkbazke0;
            TextUtils.isEmpty("wGpeUFub" + gtxvmmqz3a + fzyahjcyzh1a + bkbazke0a + crwdkifla2a + "wGpeUFub" + "" + "");
        }

        //垃圾方法
        private void BPzzzAia(long qubvrrdoc0, short bnpkicsf1, double mrzvsny2, boolean oziilejyl3, int pbpvxiikqj4) {
            int pbpvxiikqj4a = pbpvxiikqj4;
            boolean oziilejyl3a = oziilejyl3;
            double mrzvsny2a = mrzvsny2;
            short bnpkicsf1a = bnpkicsf1;
            long qubvrrdoc0a = qubvrrdoc0;
            new String("BPzzzAia" + qubvrrdoc0a + mrzvsny2a + pbpvxiikqj4a + bnpkicsf1a + oziilejyl3a + "BPzzzAia" + "" + "");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            int pbpvxiikqj4 = 35;
            boolean oziilejyl3 = false;
            double mrzvsny2 = 80.80;
            short bnpkicsf1 = 70;
            long qubvrrdoc0 = 84L;
            long gtxvmmqz3 = 25L;
            byte crwdkifla2 = 89;
            int fzyahjcyzh1 = 40;
            char bkbazke0 = 67;
            double xsixuywtfi4 = 26.26;
            int awalvatauv3 = 4;
            int cizvcyrc2 = 18;
            boolean opcruruinr1 = false;
            short uegwkeyqt0 = 29;
            float rxxpxflmd3 = 91.91f;
            char ururbyriyl2 = 70;
            byte zobhrnbvep1 = 76;
            double zjqszzk0 = 76.76;
            char ncearju1 = 12;
            char uuldgbgfv0 = 82;
            float nsiqdwkftw3 = 67.67f;
            long xcgovxbaa2 = 22L;
            long cahaaomu1 = 72L;
            double zyzqejszd0 = 96.96;
            short gncxnac2 = 34;
            byte jgqejkmj1 = 72;
            double gkpeqlj0 = 24.24;
            short vvsivexqo1 = 24;
            char rixqgax0 = 24;
            int chnwgabeiu1 = 14;
            double qxnwxia0 = 98.98;
            int nxwqzjua0 = 28;
            short jqvjylm0 = 17;
            long ttbgarz4 = 36L;
            int zdrxpopb3 = 10;
            byte zpnsbpfp2 = 80;
            double gmejhlaurz1 = 25.25;
            boolean wcbjvkrjd0 = true;
            char sjteyxhqw4 = 5;
            long yxllcux3 = 60L;
            float abcrckxhvo2 = 52.52f;
            char fhjbhzpqa1 = 4;
            float ytwadac0 = 38.38f;
            float iabzhhse1 = 50.50f;
            boolean jhrnlusd0 = false;
            boolean ichwwdp3 = false;
            float muhsspw2 = 22.22f;
            char sfukesugzh1 = 59;
            short tvfpqji0 = 22;
            short mesbxiy0 = 18;
            SimplySPUtils.putLong("lastActivityOnPause", 0L);
            uUZEGRBa(nxwqzjua0);
            GkbZcMdk(wcbjvkrjd0, gmejhlaurz1, zpnsbpfp2, zdrxpopb3, ttbgarz4);
            rYGobZFj(tvfpqji0, sfukesugzh1, muhsspw2, ichwwdp3);
            uSvHgFHN(uegwkeyqt0, opcruruinr1, cizvcyrc2, awalvatauv3, xsixuywtfi4);
            SimplyHouseworkrOrgManager.INSTANCE.setCurrentActivity(activity);
            GkbZcMdk(wcbjvkrjd0, gmejhlaurz1, zpnsbpfp2, zdrxpopb3, ttbgarz4);
            BPzzzAia(qubvrrdoc0, bnpkicsf1, mrzvsny2, oziilejyl3, pbpvxiikqj4);
            SrqtjRnu(zyzqejszd0, cahaaomu1, xcgovxbaa2, nsiqdwkftw3);
            Kaphixxj(ytwadac0, fhjbhzpqa1, abcrckxhvo2, yxllcux3, sjteyxhqw4);
            ErFOBayj(jhrnlusd0, iabzhhse1);
            Kaphixxj(ytwadac0, fhjbhzpqa1, abcrckxhvo2, yxllcux3, sjteyxhqw4);
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
            XYwgsnpv(uuldgbgfv0, ncearju1);
            YhYrnsYG(zjqszzk0, zobhrnbvep1, ururbyriyl2, rxxpxflmd3);
            YhYrnsYG(zjqszzk0, zobhrnbvep1, ururbyriyl2, rxxpxflmd3);
            uUZEGRBa(nxwqzjua0);
            YhYrnsYG(zjqszzk0, zobhrnbvep1, ururbyriyl2, rxxpxflmd3);
            YhYrnsYG(zjqszzk0, zobhrnbvep1, ururbyriyl2, rxxpxflmd3);
            Kaphixxj(ytwadac0, fhjbhzpqa1, abcrckxhvo2, yxllcux3, sjteyxhqw4);
            rYGobZFj(tvfpqji0, sfukesugzh1, muhsspw2, ichwwdp3);
            uSvHgFHN(uegwkeyqt0, opcruruinr1, cizvcyrc2, awalvatauv3, xsixuywtfi4);
            SimplyHouseworkrOrgManager.INSTANCE.setPaused(false);
        }

        //垃圾方法
        private void QMbNOMxH(char srtruncsxc0, double poopxxgw1, double zaeeunzk2, double kufdlbddi3) {
            double kufdlbddi3a = kufdlbddi3;
            double zaeeunzk2a = zaeeunzk2;
            double poopxxgw1a = poopxxgw1;
            char srtruncsxc0a = srtruncsxc0;
            new WeakReference("QMbNOMxH" + zaeeunzk2a + srtruncsxc0a + poopxxgw1a + kufdlbddi3a + "QMbNOMxH" + "" + "");
        }

        //垃圾方法
        private void NcVCAXmL(char cekdxnnu0, byte hdkftdypz1, short wuaclpdjz2, short wfjumoimy3) {
            short wfjumoimy3a = wfjumoimy3;
            short wuaclpdjz2a = wuaclpdjz2;
            byte hdkftdypz1a = hdkftdypz1;
            char cekdxnnu0a = cekdxnnu0;
            System.out.println("NcVCAXmL" + cekdxnnu0a + wfjumoimy3a + hdkftdypz1a + wuaclpdjz2a + "NcVCAXmL" + "" + "");
        }

        //垃圾方法
        private void dzkXhrAf(int pocrkvkq0) {
            int pocrkvkq0a = pocrkvkq0;
            new StringBuffer("dzkXhrAf" + pocrkvkq0a + "dzkXhrAf" + "" + "");
        }

        //垃圾方法
        private void LWhkEisH(double loomfxe0, boolean nzculmtm1) {
            boolean nzculmtm1a = nzculmtm1;
            double loomfxe0a = loomfxe0;
            new String("LWhkEisH" + nzculmtm1a + loomfxe0a + "LWhkEisH" + "" + "");
        }

        //垃圾方法
        private void xORPyHQI(float bldxihsh0, char saoxfsd1, byte rslixyach2, double kmjhcrniah3) {
            double kmjhcrniah3a = kmjhcrniah3;
            byte rslixyach2a = rslixyach2;
            char saoxfsd1a = saoxfsd1;
            float bldxihsh0a = bldxihsh0;
            new WeakReference("xORPyHQI" + rslixyach2a + saoxfsd1a + kmjhcrniah3a + bldxihsh0a + "xORPyHQI" + "" + "");
        }

        //垃圾方法
        private void vIIZzpoh(float xhwwscobto0, int jiqncnatd1, int ooiqypwx2) {
            int ooiqypwx2a = ooiqypwx2;
            int jiqncnatd1a = jiqncnatd1;
            float xhwwscobto0a = xhwwscobto0;
            Log.w("vIIZzpoh", "vIIZzpoh" + jiqncnatd1a + xhwwscobto0a + ooiqypwx2a + "vIIZzpoh" + "" + "");
        }

        //垃圾方法
        private void zOBXSibS(boolean vziybokpp0) {
            boolean vziybokpp0a = vziybokpp0;
            TextUtils.isEmpty("zOBXSibS" + vziybokpp0a + "zOBXSibS" + "" + "");
        }

        //垃圾方法
        private void HVvAfHMu(boolean ysvlgxduia0, byte zhenwbfca1) {
            byte zhenwbfca1a = zhenwbfca1;
            boolean ysvlgxduia0a = ysvlgxduia0;
        }

        //垃圾方法
        private void UqKTbnKS(float wxrghjhbhb0, float cxsvsubk1) {
            float cxsvsubk1a = cxsvsubk1;
            float wxrghjhbhb0a = wxrghjhbhb0;
            new String("UqKTbnKS" + wxrghjhbhb0a + cxsvsubk1a + "UqKTbnKS" + "" + "");
        }

        //垃圾方法
        private void GkHnwZbB(int ckvhojlid0, short vdfqdetqlh1) {
            short vdfqdetqlh1a = vdfqdetqlh1;
            int ckvhojlid0a = ckvhojlid0;
            new String("GkHnwZbB" + vdfqdetqlh1a + ckvhojlid0a + "GkHnwZbB" + "" + "");
        }

        //垃圾方法
        private void KelJsNMe(int yfhpbdt0) {
            int yfhpbdt0a = yfhpbdt0;
            new File("KelJsNMe" + yfhpbdt0a + "KelJsNMe" + "" + "");
        }

        //垃圾方法
        private void xcfhxNAs(long uuqsancs0, long vwujyume1, byte paxmekaf2, byte frfxvrlyc3, boolean msldqvgf4) {
            boolean msldqvgf4a = msldqvgf4;
            byte frfxvrlyc3a = frfxvrlyc3;
            byte paxmekaf2a = paxmekaf2;
            long vwujyume1a = vwujyume1;
            long uuqsancs0a = uuqsancs0;
            Log.e("xcfhxNAs", "xcfhxNAs" + uuqsancs0a + msldqvgf4a + paxmekaf2a + vwujyume1a + frfxvrlyc3a + "xcfhxNAs" + "" + "");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            boolean msldqvgf4 = true;
            byte frfxvrlyc3 = 71;
            byte paxmekaf2 = 61;
            long vwujyume1 = 42L;
            long uuqsancs0 = 91L;
            int yfhpbdt0 = 62;
            short vdfqdetqlh1 = 5;
            int ckvhojlid0 = 52;
            float cxsvsubk1 = 36.36f;
            float wxrghjhbhb0 = 84.84f;
            byte zhenwbfca1 = 60;
            boolean ysvlgxduia0 = false;
            boolean vziybokpp0 = false;
            int ooiqypwx2 = 57;
            int jiqncnatd1 = 58;
            float xhwwscobto0 = 39.39f;
            double kmjhcrniah3 = 5.5;
            byte rslixyach2 = 32;
            char saoxfsd1 = 91;
            float bldxihsh0 = 51.51f;
            boolean nzculmtm1 = true;
            double loomfxe0 = 93.93;
            int pocrkvkq0 = 54;
            short wfjumoimy3 = 86;
            short wuaclpdjz2 = 72;
            byte hdkftdypz1 = 92;
            char cekdxnnu0 = 90;
            double kufdlbddi3 = 62.62;
            double zaeeunzk2 = 43.43;
            double poopxxgw1 = 96.96;
            char srtruncsxc0 = 40;
            SimplyHouseworkrOrgManager.INSTANCE.setPaused(true);
            SimplyHouseworkrOrgManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void bYYWJwTM(int synyzfewss0, long cgszljmid1, long nmovxrsbsy2) {
            long nmovxrsbsy2a = nmovxrsbsy2;
            long cgszljmid1a = cgszljmid1;
            int synyzfewss0a = synyzfewss0;
            Log.i("bYYWJwTM", "bYYWJwTM" + cgszljmid1a + synyzfewss0a + nmovxrsbsy2a + "bYYWJwTM" + "" + "");
        }

        //垃圾方法
        private void wWBAUTWh(long vpakdxjpx0, double rmnwmizy1) {
            double rmnwmizy1a = rmnwmizy1;
            long vpakdxjpx0a = vpakdxjpx0;
            new File("wWBAUTWh" + rmnwmizy1a + vpakdxjpx0a + "wWBAUTWh" + "" + "");
        }

        //垃圾方法
        private void MqBmOMNV(double eggmejyg0, long fgkgitgah1) {
            long fgkgitgah1a = fgkgitgah1;
            double eggmejyg0a = eggmejyg0;
            System.out.println("MqBmOMNV" + fgkgitgah1a + eggmejyg0a + "MqBmOMNV" + "" + "");
        }

        //垃圾方法
        private void nBciyrLt(short hddnesahd0, byte fdhnbbri1) {
            byte fdhnbbri1a = fdhnbbri1;
            short hddnesahd0a = hddnesahd0;
            new Intent("nBciyrLt" + hddnesahd0a + fdhnbbri1a + "nBciyrLt" + "" + "");
        }

        //垃圾方法
        private void YAnBloIg(double nxskjksx0, byte urylfkek1, long aasbnddivy2, int wcjjptf3) {
            int wcjjptf3a = wcjjptf3;
            long aasbnddivy2a = aasbnddivy2;
            byte urylfkek1a = urylfkek1;
            double nxskjksx0a = nxskjksx0;
            new AttributedString("YAnBloIg" + wcjjptf3a + aasbnddivy2a + urylfkek1a + nxskjksx0a + "YAnBloIg" + "" + "");
        }

        //垃圾方法
        private void TKaDvdQs(byte fiiyihclex0) {
            byte fiiyihclex0a = fiiyihclex0;
            new String("TKaDvdQs" + fiiyihclex0a + "TKaDvdQs" + "" + "");
        }

        //垃圾方法
        private void JsuCxFnu(byte tpkiujond0) {
            byte tpkiujond0a = tpkiujond0;
            Log.w("JsuCxFnu", "JsuCxFnu" + tpkiujond0a + "JsuCxFnu" + "" + "");
        }

        //垃圾方法
        private void HuTTYLvo(boolean uhfkjwkxsf0, long qohvsegz1, byte rmyxjiwxtw2, byte fgahsafqvk3) {
            byte fgahsafqvk3a = fgahsafqvk3;
            byte rmyxjiwxtw2a = rmyxjiwxtw2;
            long qohvsegz1a = qohvsegz1;
            boolean uhfkjwkxsf0a = uhfkjwkxsf0;
            Log.i("HuTTYLvo", "HuTTYLvo" + uhfkjwkxsf0a + rmyxjiwxtw2a + fgahsafqvk3a + qohvsegz1a + "HuTTYLvo" + "" + "");
        }

        public void onActivityStopped(@NotNull Activity activity) {
            byte fgahsafqvk3 = 43;
            byte rmyxjiwxtw2 = 87;
            long qohvsegz1 = 88L;
            boolean uhfkjwkxsf0 = false;
            byte tpkiujond0 = 88;
            byte fiiyihclex0 = 70;
            int wcjjptf3 = 34;
            long aasbnddivy2 = 58L;
            byte urylfkek1 = 87;
            double nxskjksx0 = 8.8;
            byte fdhnbbri1 = 28;
            short hddnesahd0 = 78;
            long fgkgitgah1 = 68L;
            double eggmejyg0 = 22.22;
            double rmnwmizy1 = 41.41;
            long vpakdxjpx0 = 41L;
            long nmovxrsbsy2 = 25L;
            long cgszljmid1 = 15L;
            int synyzfewss0 = 21;
            JsuCxFnu(tpkiujond0);
            nBciyrLt(hddnesahd0, fdhnbbri1);
            nBciyrLt(hddnesahd0, fdhnbbri1);
            JsuCxFnu(tpkiujond0);
            JsuCxFnu(tpkiujond0);
            MqBmOMNV(eggmejyg0, fgkgitgah1);
            TKaDvdQs(fiiyihclex0);
            YAnBloIg(nxskjksx0, urylfkek1, aasbnddivy2, wcjjptf3);
            SimplyHouseworkrOrgManager.visibleActivities.remove(activity);
            wWBAUTWh(vpakdxjpx0, rmnwmizy1);
            MqBmOMNV(eggmejyg0, fgkgitgah1);
            wWBAUTWh(vpakdxjpx0, rmnwmizy1);
            bYYWJwTM(synyzfewss0, cgszljmid1, nmovxrsbsy2);
            nBciyrLt(hddnesahd0, fdhnbbri1);
            bYYWJwTM(synyzfewss0, cgszljmid1, nmovxrsbsy2);
            nBciyrLt(hddnesahd0, fdhnbbri1);
            JsuCxFnu(tpkiujond0);
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
        }

        //垃圾方法
        private void kqZoNcok(long yftgjnrym0, long hqvjilhee1, long nzymaqjqs2) {
            long nzymaqjqs2a = nzymaqjqs2;
            long hqvjilhee1a = hqvjilhee1;
            long yftgjnrym0a = yftgjnrym0;
            TextUtils.isDigitsOnly("kqZoNcok" + yftgjnrym0a + hqvjilhee1a + nzymaqjqs2a + "kqZoNcok" + "" + "");
        }

        //垃圾方法
        private void TUTzIBST(double cgggjruj0) {
            double cgggjruj0a = cgggjruj0;
            Log.i("TUTzIBST", "TUTzIBST" + cgggjruj0a + "TUTzIBST" + "" + "");
        }

        //垃圾方法
        private void BfPzOhaa(boolean aevuetcw0, short oyimuroaq1) {
            short oyimuroaq1a = oyimuroaq1;
            boolean aevuetcw0a = aevuetcw0;
            new File("BfPzOhaa" + aevuetcw0a + oyimuroaq1a + "BfPzOhaa" + "" + "");
        }

        //垃圾方法
        private void xULkZXEL(long pufuzqhic0) {
            long pufuzqhic0a = pufuzqhic0;
            new String("xULkZXEL" + pufuzqhic0a + "xULkZXEL" + "" + "");
        }

        //垃圾方法
        private void LkvnKKyb(byte asgcnyx0, float gxwqjnd1, double xjfzvbryrx2, boolean mrccexle3) {
            boolean mrccexle3a = mrccexle3;
            double xjfzvbryrx2a = xjfzvbryrx2;
            float gxwqjnd1a = gxwqjnd1;
            byte asgcnyx0a = asgcnyx0;
            new Intent("LkvnKKyb" + asgcnyx0a + mrccexle3a + xjfzvbryrx2a + gxwqjnd1a + "LkvnKKyb" + "" + "");
        }

        //垃圾方法
        private void EQIkOJSN(byte ymxqilmh0, char vltxrsh1, long nxreqfxm2) {
            long nxreqfxm2a = nxreqfxm2;
            char vltxrsh1a = vltxrsh1;
            byte ymxqilmh0a = ymxqilmh0;
            new AttributedString("EQIkOJSN" + vltxrsh1a + ymxqilmh0a + nxreqfxm2a + "EQIkOJSN" + "" + "");
        }

        //垃圾方法
        private void aWoaYmwg(boolean hzegpkwz0, byte cjusgekh1) {
            byte cjusgekh1a = cjusgekh1;
            boolean hzegpkwz0a = hzegpkwz0;
            TextUtils.isDigitsOnly("aWoaYmwg" + cjusgekh1a + hzegpkwz0a + "aWoaYmwg" + "" + "");
        }

        //垃圾方法
        private void DGsRkgZG(short oqbooeazil0, boolean pakakyiwr1, float dcwqvrvaoc2, boolean qdtwfaowd3) {
            boolean qdtwfaowd3a = qdtwfaowd3;
            float dcwqvrvaoc2a = dcwqvrvaoc2;
            boolean pakakyiwr1a = pakakyiwr1;
            short oqbooeazil0a = oqbooeazil0;
            System.out.println("DGsRkgZG" + qdtwfaowd3a + oqbooeazil0a + dcwqvrvaoc2a + pakakyiwr1a + "DGsRkgZG" + "" + "");
        }

        //垃圾方法
        private void UOlZUSew(short ufkjuwpbb0) {
            short ufkjuwpbb0a = ufkjuwpbb0;
            new File("UOlZUSew" + ufkjuwpbb0a + "UOlZUSew" + "" + "");
        }

        //垃圾方法
        private void eMvIMWkM(long sbafwvtuxr0) {
            long sbafwvtuxr0a = sbafwvtuxr0;
            Log.w("eMvIMWkM", "eMvIMWkM" + sbafwvtuxr0a + "eMvIMWkM" + "" + "");
        }

        //垃圾方法
        private void AzoPQLrB(long wtzlpnqfep0, float nsmxbvcts1) {
            float nsmxbvcts1a = nsmxbvcts1;
            long wtzlpnqfep0a = wtzlpnqfep0;
            new String("AzoPQLrB" + wtzlpnqfep0a + nsmxbvcts1a + "AzoPQLrB" + "" + "");
        }

        //垃圾方法
        private void aXGbmCAX(short qkqzgsw0) {
            short qkqzgsw0a = qkqzgsw0;
            new StringBuilder("aXGbmCAX" + qkqzgsw0a + "aXGbmCAX" + "" + "");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            short qkqzgsw0 = 23;
            float nsmxbvcts1 = 14.14f;
            long wtzlpnqfep0 = 46L;
            long sbafwvtuxr0 = 22L;
            short ufkjuwpbb0 = 71;
            boolean qdtwfaowd3 = true;
            float dcwqvrvaoc2 = 69.69f;
            boolean pakakyiwr1 = true;
            short oqbooeazil0 = 38;
            byte cjusgekh1 = 90;
            boolean hzegpkwz0 = false;
            long nxreqfxm2 = 2L;
            char vltxrsh1 = 13;
            byte ymxqilmh0 = 8;
            boolean mrccexle3 = false;
            double xjfzvbryrx2 = 26.26;
            float gxwqjnd1 = 56.56f;
            byte asgcnyx0 = 34;
            long pufuzqhic0 = 4L;
            short oyimuroaq1 = 46;
            boolean aevuetcw0 = true;
            double cgggjruj0 = 92.92;
            long nzymaqjqs2 = 34L;
            long hqvjilhee1 = 32L;
            long yftgjnrym0 = 51L;
            if (SimplyHouseworkrOrgManager.INSTANCE.isCurrActivity(activity)) {
                eMvIMWkM(sbafwvtuxr0);
                DGsRkgZG(oqbooeazil0, pakakyiwr1, dcwqvrvaoc2, qdtwfaowd3);
                kqZoNcok(yftgjnrym0, hqvjilhee1, nzymaqjqs2);
                UOlZUSew(ufkjuwpbb0);
                AzoPQLrB(wtzlpnqfep0, nsmxbvcts1);
                aXGbmCAX(qkqzgsw0);
                EQIkOJSN(ymxqilmh0, vltxrsh1, nxreqfxm2);
                xULkZXEL(pufuzqhic0);
                DGsRkgZG(oqbooeazil0, pakakyiwr1, dcwqvrvaoc2, qdtwfaowd3);
                SimplyHouseworkrOrgManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            BfPzOhaa(aevuetcw0, oyimuroaq1);
            EQIkOJSN(ymxqilmh0, vltxrsh1, nxreqfxm2);
            DGsRkgZG(oqbooeazil0, pakakyiwr1, dcwqvrvaoc2, qdtwfaowd3);
            xULkZXEL(pufuzqhic0);
            eMvIMWkM(sbafwvtuxr0);
            aWoaYmwg(hzegpkwz0, cjusgekh1);
            DGsRkgZG(oqbooeazil0, pakakyiwr1, dcwqvrvaoc2, qdtwfaowd3);
            UOlZUSew(ufkjuwpbb0);
            AzoPQLrB(wtzlpnqfep0, nsmxbvcts1);
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
            SimplyHouseworkrOrgManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }

    //垃圾变量
    private boolean hiaPNJW = true;

    //垃圾变量
    private double BEMQzKg = 70.70;

    //垃圾变量
    private double sFxNkBI = 42.42;

    //垃圾变量
    private float HpylkCl = 23.23f;

    //垃圾变量
    private float AzFFymI = 70.70f;

    //垃圾变量
    private char ZiRBfdu = 1;

    //垃圾方法
    private void pUtzdRYo(int uzoslxut0, float tftlttgpby1, short xxncbrm2) {
        short xxncbrm2a = xxncbrm2;
        float tftlttgpby1a = tftlttgpby1;
        int uzoslxut0a = uzoslxut0;
    }

    //垃圾方法
    private void ZyzptBXN(long xyvizhur0, int disfiosex1, int lnnmyidily2, boolean dehgdfzvmj3, double hdrlpqlozt4) {
        double hdrlpqlozt4a = hdrlpqlozt4;
        boolean dehgdfzvmj3a = dehgdfzvmj3;
        int lnnmyidily2a = lnnmyidily2;
        int disfiosex1a = disfiosex1;
        long xyvizhur0a = xyvizhur0;
        TextUtils.isDigitsOnly("ZyzptBXN" + disfiosex1a + lnnmyidily2a + hdrlpqlozt4a + xyvizhur0a + dehgdfzvmj3a + "ZyzptBXN" + AzFFymI + fLXzOzw + CRZYrQN + IDsZWHT + EVbXjTg + cHZbLVQ + hiaPNJW + pAqKmrM + myCMTQo + sFxNkBI + dUfZjHY + OaiODso + dSRPiJa + VMtscBv + jmGNiTW + byErfux + "");
    }

    //垃圾方法
    private void fUygqxEZ(short ieegdalqft0, float bxmfxiztsr1) {
        float bxmfxiztsr1a = bxmfxiztsr1;
        short ieegdalqft0a = ieegdalqft0;
        new Thread("fUygqxEZ" + bxmfxiztsr1a + ieegdalqft0a + "fUygqxEZ" + cHZbLVQ + fLXzOzw + jmGNiTW + CRZYrQN + pAqKmrM + VMtscBv + hiaPNJW + OaiODso + byErfux + EVbXjTg + sFxNkBI + IDsZWHT + dSRPiJa + AzFFymI + dUfZjHY + myCMTQo + "");
    }

    //垃圾方法
    private void qjSLbWNA(short bpjdqaiyh0, long mctyvqjeeb1, double dinwhisu2) {
        double dinwhisu2a = dinwhisu2;
        long mctyvqjeeb1a = mctyvqjeeb1;
        short bpjdqaiyh0a = bpjdqaiyh0;
        new StringBuffer("qjSLbWNA" + bpjdqaiyh0a + dinwhisu2a + mctyvqjeeb1a + "qjSLbWNA" + hiaPNJW + sFxNkBI + AzFFymI + jmGNiTW + dSRPiJa + CRZYrQN + myCMTQo + byErfux + OaiODso + IDsZWHT + EVbXjTg + dUfZjHY + cHZbLVQ + VMtscBv + fLXzOzw + pAqKmrM + "");
    }

    //垃圾方法
    private void nHSnFpyz(long nedbxnzdwr0) {
        long nedbxnzdwr0a = nedbxnzdwr0;
        new StringReader("nHSnFpyz" + nedbxnzdwr0a + "nHSnFpyz" + myCMTQo + dUfZjHY + sFxNkBI + cHZbLVQ + byErfux + fLXzOzw + CRZYrQN + jmGNiTW + hiaPNJW + VMtscBv + AzFFymI + OaiODso + dSRPiJa + EVbXjTg + pAqKmrM + IDsZWHT + "");
    }

    //垃圾方法
    private void ercbwxrH(boolean ykmyajil0) {
        boolean ykmyajil0a = ykmyajil0;
        new StringBuffer("ercbwxrH" + ykmyajil0a + "ercbwxrH" + EVbXjTg + cHZbLVQ + hiaPNJW + dUfZjHY + IDsZWHT + AzFFymI + sFxNkBI + jmGNiTW + myCMTQo + CRZYrQN + OaiODso + fLXzOzw + pAqKmrM + VMtscBv + dSRPiJa + byErfux + "");
    }

    //垃圾方法
    private void uUBCFWyG(int fxpymda0) {
        int fxpymda0a = fxpymda0;
        new StringBuffer("uUBCFWyG" + fxpymda0a + "uUBCFWyG" + OaiODso + VMtscBv + dUfZjHY + hiaPNJW + fLXzOzw + sFxNkBI + CRZYrQN + pAqKmrM + IDsZWHT + cHZbLVQ + myCMTQo + AzFFymI + EVbXjTg + byErfux + jmGNiTW + dSRPiJa + "");
    }

    //垃圾方法
    private void SacpXiHT(char wpgzxqefzh0, byte kogrzebdvk1) {
        byte kogrzebdvk1a = kogrzebdvk1;
        char wpgzxqefzh0a = wpgzxqefzh0;
        new AttributedString("SacpXiHT" + kogrzebdvk1a + wpgzxqefzh0a + "SacpXiHT" + IDsZWHT + CRZYrQN + EVbXjTg + fLXzOzw + dSRPiJa + myCMTQo + VMtscBv + AzFFymI + byErfux + jmGNiTW + pAqKmrM + sFxNkBI + cHZbLVQ + dUfZjHY + hiaPNJW + OaiODso + "");
    }

    public String toString() {
        byte kogrzebdvk1 = 2;
        char wpgzxqefzh0 = 17;
        int fxpymda0 = 86;
        boolean ykmyajil0 = false;
        long nedbxnzdwr0 = 26L;
        double dinwhisu2 = 54.54;
        long mctyvqjeeb1 = 10L;
        short bpjdqaiyh0 = 72;
        float bxmfxiztsr1 = 59.59f;
        short ieegdalqft0 = 22;
        double hdrlpqlozt4 = 31.31;
        boolean dehgdfzvmj3 = true;
        int lnnmyidily2 = 11;
        int disfiosex1 = 29;
        long xyvizhur0 = 80L;
        short xxncbrm2 = 21;
        float tftlttgpby1 = 88.88f;
        int uzoslxut0 = 27;
        new StringReader("" + HpylkCl + ZiRBfdu + BEMQzKg + "");
        return super.toString();
    }
}
