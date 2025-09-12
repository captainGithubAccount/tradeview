package com.tfseptember.clemodel.orgyy;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.simply.IProcessServiceSimply;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

public class SimplyLoudspeakergp1Service extends Service {

    //垃圾变量
    private byte sNamkAS = 15;

    public static long lastTime = 0L;

    //垃圾变量
    private boolean XuhekqI = false;

    private static String TAG = "xxx";

    //垃圾变量
    private char cYXetCp = 11;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private long HaLPdbX = 87L;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private short KJTtfmC = 48;

    public static Boolean isLiving = false;

    //垃圾变量
    private double CiQYlPy = 26.26;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private short pEoZdet = 99;

    private static long delayTime = 250L;

    //垃圾变量
    private byte XvAScyV = 56;

    public static boolean isStartService = false;

    //垃圾变量
    private char yYcKnFQ = 12;

    private IBinder subBinder = null;

    //垃圾变量
    private char zVASPhO = 29;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private byte fBCfFVK = 21;

    int nextNum = -1;

    public SimplyLoudspeakergp1Service() {
    }

    //垃圾方法
    static private void hwKYoMNq(long jjishdxapz0, byte yurfbcrcjo1, long ufowkeid2, char wydmqiw3, int rnzrnvhf4) {
        int rnzrnvhf4a = rnzrnvhf4;
        char wydmqiw3a = wydmqiw3;
        long ufowkeid2a = ufowkeid2;
        byte yurfbcrcjo1a = yurfbcrcjo1;
        long jjishdxapz0a = jjishdxapz0;
        new StringBuilder("hwKYoMNq" + wydmqiw3a + ufowkeid2a + jjishdxapz0a + rnzrnvhf4a + yurfbcrcjo1a + "hwKYoMNq" + "");
    }

    //垃圾方法
    static private void XgfCKKZm(short ffihnirw0, boolean erkpwkmiuq1, short bgstqntytw2, short zwctmpy3, double vhktaprk4) {
        double vhktaprk4a = vhktaprk4;
        short zwctmpy3a = zwctmpy3;
        short bgstqntytw2a = bgstqntytw2;
        boolean erkpwkmiuq1a = erkpwkmiuq1;
        short ffihnirw0a = ffihnirw0;
        new Thread("XgfCKKZm" + erkpwkmiuq1a + vhktaprk4a + zwctmpy3a + ffihnirw0a + bgstqntytw2a + "XgfCKKZm" + "");
    }

    //垃圾方法
    static private void PpQPNTGB(float watksgyul0) {
        float watksgyul0a = watksgyul0;
        Log.w("PpQPNTGB", "PpQPNTGB" + watksgyul0a + "PpQPNTGB" + "");
    }

    //垃圾方法
    static private void WdUOtHlt(int zaxlrvif0, int lqnsndgaw1, byte wlssnykxjz2, short tclkofi3) {
        short tclkofi3a = tclkofi3;
        byte wlssnykxjz2a = wlssnykxjz2;
        int lqnsndgaw1a = lqnsndgaw1;
        int zaxlrvif0a = zaxlrvif0;
        System.out.println("WdUOtHlt" + zaxlrvif0a + wlssnykxjz2a + tclkofi3a + lqnsndgaw1a + "WdUOtHlt" + "");
    }

    public static void tryStartLaunchMainService() {
        short tclkofi3 = 39;
        byte wlssnykxjz2 = 15;
        int lqnsndgaw1 = 24;
        int zaxlrvif0 = 51;
        float watksgyul0 = 33.33f;
        double vhktaprk4 = 81.81;
        short zwctmpy3 = 98;
        short bgstqntytw2 = 63;
        boolean erkpwkmiuq1 = false;
        short ffihnirw0 = 80;
        int rnzrnvhf4 = 52;
        char wydmqiw3 = 87;
        long ufowkeid2 = 45L;
        byte yurfbcrcjo1 = 11;
        long jjishdxapz0 = 11L;
        if (isLiving) {
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(SimplyHouseworkrOrgManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void drbxpnsz(int qwqkfyety0, char elkxdwgk1, byte wubkadnpi2) {
        byte wubkadnpi2a = wubkadnpi2;
        char elkxdwgk1a = elkxdwgk1;
        int qwqkfyety0a = qwqkfyety0;
        new Intent("drbxpnsz" + qwqkfyety0a + wubkadnpi2a + elkxdwgk1a + "drbxpnsz" + "");
    }

    //垃圾方法
    static private void iFCgJkER(boolean mzxryou0, char toqnhfjqls1) {
        char toqnhfjqls1a = toqnhfjqls1;
        boolean mzxryou0a = mzxryou0;
        new StringBuffer("iFCgJkER" + toqnhfjqls1a + mzxryou0a + "iFCgJkER" + "");
    }

    //垃圾方法
    static private void rPkuKpSs(short oqopgjhz0, boolean pnesoluxu1, byte fyeezsvmpm2) {
        byte fyeezsvmpm2a = fyeezsvmpm2;
        boolean pnesoluxu1a = pnesoluxu1;
        short oqopgjhz0a = oqopgjhz0;
        Log.i("rPkuKpSs", "rPkuKpSs" + pnesoluxu1a + fyeezsvmpm2a + oqopgjhz0a + "rPkuKpSs" + "");
    }

    //垃圾方法
    static private void qJBsmXRo(double xmulshpny0, long owniiniz1, float bacudgdiom2, boolean tyjnvvxmzb3) {
        boolean tyjnvvxmzb3a = tyjnvvxmzb3;
        float bacudgdiom2a = bacudgdiom2;
        long owniiniz1a = owniiniz1;
        double xmulshpny0a = xmulshpny0;
        new Thread("qJBsmXRo" + bacudgdiom2a + tyjnvvxmzb3a + owniiniz1a + xmulshpny0a + "qJBsmXRo" + "");
    }

    //垃圾方法
    static private void mpjTqJdf(char fxvchar0) {
        char fxvchar0a = fxvchar0;
        Log.i("mpjTqJdf", "mpjTqJdf" + fxvchar0a + "mpjTqJdf" + "");
    }

    //垃圾方法
    static private void LmTpgbLp(short buymhqoye0) {
        short buymhqoye0a = buymhqoye0;
        new StringBuffer("LmTpgbLp" + buymhqoye0a + "LmTpgbLp" + "");
    }

    //垃圾方法
    static private void ZJGkAOHt(long lsdvjhdu0, short pcwolyug1, int tofqiljvzd2) {
        int tofqiljvzd2a = tofqiljvzd2;
        short pcwolyug1a = pcwolyug1;
        long lsdvjhdu0a = lsdvjhdu0;
        new StringReader("ZJGkAOHt" + tofqiljvzd2a + pcwolyug1a + lsdvjhdu0a + "ZJGkAOHt" + "");
    }

    //垃圾方法
    static private void eyRJSuMU(float zvhuiqvbf0, long rclbupxzg1) {
        long rclbupxzg1a = rclbupxzg1;
        float zvhuiqvbf0a = zvhuiqvbf0;
        System.out.println("eyRJSuMU" + rclbupxzg1a + zvhuiqvbf0a + "eyRJSuMU" + "");
    }

    private static void startService(Context context) {
        long rclbupxzg1 = 2L;
        float zvhuiqvbf0 = 40.40f;
        int tofqiljvzd2 = 55;
        short pcwolyug1 = 33;
        long lsdvjhdu0 = 15L;
        short buymhqoye0 = 18;
        char fxvchar0 = 13;
        boolean tyjnvvxmzb3 = false;
        float bacudgdiom2 = 66.66f;
        long owniiniz1 = 73L;
        double xmulshpny0 = 81.81;
        byte fyeezsvmpm2 = 43;
        boolean pnesoluxu1 = false;
        short oqopgjhz0 = 46;
        char toqnhfjqls1 = 23;
        boolean mzxryou0 = false;
        byte wubkadnpi2 = 88;
        char elkxdwgk1 = 8;
        int qwqkfyety0 = 22;
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(TAG, "LocalService startService5");
        }
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void YnbGKKug(boolean rybpzqbm0) {
        boolean rybpzqbm0a = rybpzqbm0;
        System.out.println("YnbGKKug" + rybpzqbm0a + "YnbGKKug" + CiQYlPy + sNamkAS + pEoZdet + hZyEKvv + XvAScyV + KJTtfmC + yYcKnFQ + XuhekqI + fBCfFVK + gqJohzZ + HaLPdbX + zVASPhO + cYXetCp + "");
    }

    //垃圾方法
    private void mqHGIDwh(int syjjilqfhj0, double vhcqhpmzc1, long wgzcfqx2, float zbfprvyfm3) {
        float zbfprvyfm3a = zbfprvyfm3;
        long wgzcfqx2a = wgzcfqx2;
        double vhcqhpmzc1a = vhcqhpmzc1;
        int syjjilqfhj0a = syjjilqfhj0;
        Log.w("mqHGIDwh", "mqHGIDwh" + syjjilqfhj0a + wgzcfqx2a + vhcqhpmzc1a + zbfprvyfm3a + "mqHGIDwh" + yYcKnFQ + pEoZdet + XuhekqI + gqJohzZ + sNamkAS + cYXetCp + zVASPhO + fBCfFVK + CiQYlPy + KJTtfmC + hZyEKvv + XvAScyV + HaLPdbX + "");
    }

    //垃圾方法
    private void bgvSNQIH(long bkhfcsbki0, short gvvdjtbxh1, int lwpnftw2, double hxmvhapni3) {
        double hxmvhapni3a = hxmvhapni3;
        int lwpnftw2a = lwpnftw2;
        short gvvdjtbxh1a = gvvdjtbxh1;
        long bkhfcsbki0a = bkhfcsbki0;
        new Thread("bgvSNQIH" + gvvdjtbxh1a + bkhfcsbki0a + hxmvhapni3a + lwpnftw2a + "bgvSNQIH" + XvAScyV + cYXetCp + sNamkAS + fBCfFVK + HaLPdbX + pEoZdet + gqJohzZ + XuhekqI + KJTtfmC + zVASPhO + CiQYlPy + yYcKnFQ + hZyEKvv + "");
    }

    //垃圾方法
    private void IBcTHXNk(double vrrvsxrl0, byte ojtlwcstrz1, float oucrjrtv2) {
        float oucrjrtv2a = oucrjrtv2;
        byte ojtlwcstrz1a = ojtlwcstrz1;
        double vrrvsxrl0a = vrrvsxrl0;
        Log.i("IBcTHXNk", "IBcTHXNk" + ojtlwcstrz1a + vrrvsxrl0a + oucrjrtv2a + "IBcTHXNk" + hZyEKvv + zVASPhO + yYcKnFQ + XvAScyV + HaLPdbX + sNamkAS + fBCfFVK + pEoZdet + cYXetCp + XuhekqI + gqJohzZ + CiQYlPy + KJTtfmC + "");
    }

    //垃圾方法
    private void zqvnowTd(long adssskf0, float hzawtolqn1) {
        float hzawtolqn1a = hzawtolqn1;
        long adssskf0a = adssskf0;
        new Intent("zqvnowTd" + adssskf0a + hzawtolqn1a + "zqvnowTd" + zVASPhO + hZyEKvv + gqJohzZ + XvAScyV + XuhekqI + KJTtfmC + pEoZdet + yYcKnFQ + cYXetCp + fBCfFVK + sNamkAS + CiQYlPy + HaLPdbX + "");
    }

    //垃圾方法
    private void vWiiCgDS(char tkfnrkl0) {
        char tkfnrkl0a = tkfnrkl0;
        new String("vWiiCgDS" + tkfnrkl0a + "vWiiCgDS" + CiQYlPy + zVASPhO + hZyEKvv + pEoZdet + yYcKnFQ + gqJohzZ + KJTtfmC + sNamkAS + XvAScyV + fBCfFVK + cYXetCp + HaLPdbX + XuhekqI + "");
    }

    //垃圾方法
    private void bKwwBdWT(double idymefrlgl0, float cbtakqtr1, long juttrju2) {
        long juttrju2a = juttrju2;
        float cbtakqtr1a = cbtakqtr1;
        double idymefrlgl0a = idymefrlgl0;
        new StringBuffer("bKwwBdWT" + juttrju2a + cbtakqtr1a + idymefrlgl0a + "bKwwBdWT" + yYcKnFQ + sNamkAS + hZyEKvv + fBCfFVK + HaLPdbX + XuhekqI + XvAScyV + gqJohzZ + KJTtfmC + zVASPhO + pEoZdet + cYXetCp + CiQYlPy + "");
    }

    //垃圾方法
    private void REiyhLVL(long sxuapjeytk0, short gvgtqdnbjo1, long gjenoad2, char yjsxdmld3) {
        char yjsxdmld3a = yjsxdmld3;
        long gjenoad2a = gjenoad2;
        short gvgtqdnbjo1a = gvgtqdnbjo1;
        long sxuapjeytk0a = sxuapjeytk0;
        new StringBuilder("REiyhLVL" + sxuapjeytk0a + gvgtqdnbjo1a + yjsxdmld3a + gjenoad2a + "REiyhLVL" + pEoZdet + CiQYlPy + gqJohzZ + XuhekqI + cYXetCp + fBCfFVK + zVASPhO + hZyEKvv + HaLPdbX + sNamkAS + KJTtfmC + XvAScyV + yYcKnFQ + "");
    }

    //垃圾方法
    private void xgSNPvIH(long hoxccjy0, float omwlgjzbip1, char debntzemhx2, byte kogdxvralw3) {
        byte kogdxvralw3a = kogdxvralw3;
        char debntzemhx2a = debntzemhx2;
        float omwlgjzbip1a = omwlgjzbip1;
        long hoxccjy0a = hoxccjy0;
        Log.e("xgSNPvIH", "xgSNPvIH" + kogdxvralw3a + hoxccjy0a + debntzemhx2a + omwlgjzbip1a + "xgSNPvIH" + KJTtfmC + pEoZdet + XvAScyV + gqJohzZ + hZyEKvv + XuhekqI + cYXetCp + CiQYlPy + HaLPdbX + zVASPhO + sNamkAS + yYcKnFQ + fBCfFVK + "");
    }

    //垃圾方法
    private void XBCfppYV(int imrszozrc0, int hzeudkjwx1) {
        int hzeudkjwx1a = hzeudkjwx1;
        int imrszozrc0a = imrszozrc0;
        new StringBuffer("XBCfppYV" + hzeudkjwx1a + imrszozrc0a + "XBCfppYV" + XuhekqI + KJTtfmC + sNamkAS + zVASPhO + pEoZdet + gqJohzZ + yYcKnFQ + cYXetCp + fBCfFVK + XvAScyV + hZyEKvv + HaLPdbX + CiQYlPy + "");
    }

    //垃圾方法
    private void FSVZPcor(char fpiphqmcgf0, char vrxfgus1) {
        char vrxfgus1a = vrxfgus1;
        char fpiphqmcgf0a = fpiphqmcgf0;
        Log.i("FSVZPcor", "FSVZPcor" + vrxfgus1a + fpiphqmcgf0a + "FSVZPcor" + sNamkAS + HaLPdbX + fBCfFVK + XuhekqI + gqJohzZ + KJTtfmC + zVASPhO + cYXetCp + XvAScyV + hZyEKvv + yYcKnFQ + CiQYlPy + pEoZdet + "");
    }

    //垃圾方法
    private void tzNcydmC(short kchbvftreu0, byte yxqedxn1, char ifyscjbzz2, char alvygeoadm3) {
        char alvygeoadm3a = alvygeoadm3;
        char ifyscjbzz2a = ifyscjbzz2;
        byte yxqedxn1a = yxqedxn1;
        short kchbvftreu0a = kchbvftreu0;
        new StringBuffer("tzNcydmC" + ifyscjbzz2a + kchbvftreu0a + yxqedxn1a + alvygeoadm3a + "tzNcydmC" + zVASPhO + pEoZdet + gqJohzZ + CiQYlPy + yYcKnFQ + XuhekqI + fBCfFVK + hZyEKvv + XvAScyV + sNamkAS + cYXetCp + HaLPdbX + KJTtfmC + "");
    }

    //垃圾方法
    private void ZuyElXjk(float vzosjni0, char xgdzqwbjpo1) {
        char xgdzqwbjpo1a = xgdzqwbjpo1;
        float vzosjni0a = vzosjni0;
        Log.w("ZuyElXjk", "ZuyElXjk" + xgdzqwbjpo1a + vzosjni0a + "ZuyElXjk" + HaLPdbX + yYcKnFQ + cYXetCp + KJTtfmC + XvAScyV + zVASPhO + hZyEKvv + pEoZdet + XuhekqI + sNamkAS + CiQYlPy + fBCfFVK + gqJohzZ + "");
    }

    //垃圾方法
    private void yJaqiHhB(float nfydgqvcw0, boolean hxuwhphno1, long xbrnwwgp2, boolean yrbwdkh3, long hhglbimace4) {
        long hhglbimace4a = hhglbimace4;
        boolean yrbwdkh3a = yrbwdkh3;
        long xbrnwwgp2a = xbrnwwgp2;
        boolean hxuwhphno1a = hxuwhphno1;
        float nfydgqvcw0a = nfydgqvcw0;
        Log.e("yJaqiHhB", "yJaqiHhB" + nfydgqvcw0a + xbrnwwgp2a + yrbwdkh3a + hxuwhphno1a + hhglbimace4a + "yJaqiHhB" + KJTtfmC + gqJohzZ + fBCfFVK + zVASPhO + yYcKnFQ + hZyEKvv + XuhekqI + pEoZdet + HaLPdbX + cYXetCp + sNamkAS + XvAScyV + CiQYlPy + "");
    }

    //垃圾方法
    private void hlaTVtJf(double ebrrmbaxtd0) {
        double ebrrmbaxtd0a = ebrrmbaxtd0;
        new WeakReference("hlaTVtJf" + ebrrmbaxtd0a + "hlaTVtJf" + HaLPdbX + yYcKnFQ + XvAScyV + CiQYlPy + hZyEKvv + XuhekqI + fBCfFVK + sNamkAS + pEoZdet + zVASPhO + KJTtfmC + cYXetCp + gqJohzZ + "");
    }

    //垃圾方法
    private void BOHDXYnA(long vdtesgg0) {
        long vdtesgg0a = vdtesgg0;
        new AttributedString("BOHDXYnA" + vdtesgg0a + "BOHDXYnA" + HaLPdbX + gqJohzZ + pEoZdet + XuhekqI + KJTtfmC + XvAScyV + hZyEKvv + zVASPhO + sNamkAS + yYcKnFQ + cYXetCp + CiQYlPy + fBCfFVK + "");
    }

    //垃圾方法
    private void kWpAzwek(double sqzibaihuo0, short gufccczs1, byte ydwbbopntx2, byte rohffwy3, int jxogcweci4) {
        int jxogcweci4a = jxogcweci4;
        byte rohffwy3a = rohffwy3;
        byte ydwbbopntx2a = ydwbbopntx2;
        short gufccczs1a = gufccczs1;
        double sqzibaihuo0a = sqzibaihuo0;
        new Intent("kWpAzwek" + rohffwy3a + jxogcweci4a + sqzibaihuo0a + gufccczs1a + ydwbbopntx2a + "kWpAzwek" + CiQYlPy + HaLPdbX + hZyEKvv + XvAScyV + gqJohzZ + XuhekqI + cYXetCp + yYcKnFQ + zVASPhO + pEoZdet + sNamkAS + fBCfFVK + KJTtfmC + "");
    }

    //垃圾方法
    private void QoJdqRMI(float xdyigkrpyk0, long rawrnusk1) {
        long rawrnusk1a = rawrnusk1;
        float xdyigkrpyk0a = xdyigkrpyk0;
        System.out.println("QoJdqRMI" + rawrnusk1a + xdyigkrpyk0a + "QoJdqRMI" + CiQYlPy + HaLPdbX + fBCfFVK + gqJohzZ + hZyEKvv + yYcKnFQ + XvAScyV + zVASPhO + sNamkAS + pEoZdet + XuhekqI + cYXetCp + KJTtfmC + "");
    }

    //垃圾方法
    private void nJAWjqnu(short vdhgbyf0, float mjpkprwrd1, double jfdvcdhurw2, byte iwgnfqxtzn3) {
        byte iwgnfqxtzn3a = iwgnfqxtzn3;
        double jfdvcdhurw2a = jfdvcdhurw2;
        float mjpkprwrd1a = mjpkprwrd1;
        short vdhgbyf0a = vdhgbyf0;
        new AttributedString("nJAWjqnu" + jfdvcdhurw2a + vdhgbyf0a + iwgnfqxtzn3a + mjpkprwrd1a + "nJAWjqnu" + zVASPhO + sNamkAS + XvAScyV + fBCfFVK + HaLPdbX + KJTtfmC + XuhekqI + hZyEKvv + gqJohzZ + pEoZdet + cYXetCp + CiQYlPy + yYcKnFQ + "");
    }

    //垃圾方法
    private void SBppFgwn(byte eshgwvh0, float sqclkfieb1) {
        float sqclkfieb1a = sqclkfieb1;
        byte eshgwvh0a = eshgwvh0;
        new WeakReference("SBppFgwn" + sqclkfieb1a + eshgwvh0a + "SBppFgwn" + pEoZdet + HaLPdbX + zVASPhO + KJTtfmC + XuhekqI + gqJohzZ + fBCfFVK + hZyEKvv + XvAScyV + cYXetCp + sNamkAS + yYcKnFQ + CiQYlPy + "");
    }

    //垃圾方法
    private void wmcXlQkI(byte txctnqjsl0) {
        byte txctnqjsl0a = txctnqjsl0;
        new String("wmcXlQkI" + txctnqjsl0a + "wmcXlQkI" + sNamkAS + pEoZdet + fBCfFVK + XuhekqI + zVASPhO + cYXetCp + hZyEKvv + yYcKnFQ + HaLPdbX + CiQYlPy + gqJohzZ + KJTtfmC + XvAScyV + "");
    }

    //垃圾方法
    private void OOBnZuUT(short mwaleuw0, long uappufvfs1, int xxvteog2) {
        int xxvteog2a = xxvteog2;
        long uappufvfs1a = uappufvfs1;
        short mwaleuw0a = mwaleuw0;
        System.out.println("OOBnZuUT" + uappufvfs1a + mwaleuw0a + xxvteog2a + "OOBnZuUT" + KJTtfmC + yYcKnFQ + XuhekqI + hZyEKvv + cYXetCp + gqJohzZ + XvAScyV + pEoZdet + HaLPdbX + fBCfFVK + zVASPhO + sNamkAS + CiQYlPy + "");
    }

    //垃圾方法
    private void nfQMkkql(int khaiifepbj0) {
        int khaiifepbj0a = khaiifepbj0;
        new Intent("nfQMkkql" + khaiifepbj0a + "nfQMkkql" + HaLPdbX + KJTtfmC + XvAScyV + pEoZdet + sNamkAS + fBCfFVK + XuhekqI + hZyEKvv + cYXetCp + gqJohzZ + yYcKnFQ + CiQYlPy + zVASPhO + "");
    }

    //垃圾方法
    private void bfVehrtk(char pezhfced0, float jdtnchzlkn1) {
        float jdtnchzlkn1a = jdtnchzlkn1;
        char pezhfced0a = pezhfced0;
        Log.e("bfVehrtk", "bfVehrtk" + jdtnchzlkn1a + pezhfced0a + "bfVehrtk" + fBCfFVK + XuhekqI + cYXetCp + hZyEKvv + KJTtfmC + zVASPhO + sNamkAS + pEoZdet + HaLPdbX + gqJohzZ + CiQYlPy + yYcKnFQ + XvAScyV + "");
    }

    //垃圾方法
    private void EtemlSDq(int dgqpffiqm0, double fxrnxinh1, double kwkfeyjx2) {
        double kwkfeyjx2a = kwkfeyjx2;
        double fxrnxinh1a = fxrnxinh1;
        int dgqpffiqm0a = dgqpffiqm0;
        Log.i("EtemlSDq", "EtemlSDq" + dgqpffiqm0a + fxrnxinh1a + kwkfeyjx2a + "EtemlSDq" + XuhekqI + zVASPhO + pEoZdet + XvAScyV + sNamkAS + yYcKnFQ + CiQYlPy + cYXetCp + fBCfFVK + KJTtfmC + HaLPdbX + gqJohzZ + hZyEKvv + "");
    }

    //垃圾方法
    private void UppnYJga(float yhafxqzon0, byte ifpwkeewf1, int efkmgslu2, long iyqwdcijc3, short bixvnqausc4) {
        short bixvnqausc4a = bixvnqausc4;
        long iyqwdcijc3a = iyqwdcijc3;
        int efkmgslu2a = efkmgslu2;
        byte ifpwkeewf1a = ifpwkeewf1;
        float yhafxqzon0a = yhafxqzon0;
        new StringBuilder("UppnYJga" + ifpwkeewf1a + bixvnqausc4a + yhafxqzon0a + iyqwdcijc3a + efkmgslu2a + "UppnYJga" + yYcKnFQ + pEoZdet + hZyEKvv + HaLPdbX + zVASPhO + XvAScyV + sNamkAS + KJTtfmC + gqJohzZ + XuhekqI + cYXetCp + fBCfFVK + CiQYlPy + "");
    }

    //垃圾方法
    private void vSZqQlhh(short tbgsddfyo0, float nbrdprvf1, boolean ignzabumkx2, byte qpsxfahk3, float vgoazbdv4) {
        float vgoazbdv4a = vgoazbdv4;
        byte qpsxfahk3a = qpsxfahk3;
        boolean ignzabumkx2a = ignzabumkx2;
        float nbrdprvf1a = nbrdprvf1;
        short tbgsddfyo0a = tbgsddfyo0;
        new String("vSZqQlhh" + tbgsddfyo0a + ignzabumkx2a + nbrdprvf1a + vgoazbdv4a + qpsxfahk3a + "vSZqQlhh" + XvAScyV + CiQYlPy + zVASPhO + sNamkAS + hZyEKvv + KJTtfmC + gqJohzZ + fBCfFVK + pEoZdet + cYXetCp + HaLPdbX + yYcKnFQ + XuhekqI + "");
    }

    //垃圾方法
    private void IrgOyjwk(boolean yuilhfti0, short uvjfaqo1) {
        short uvjfaqo1a = uvjfaqo1;
        boolean yuilhfti0a = yuilhfti0;
        new StringBuffer("IrgOyjwk" + uvjfaqo1a + yuilhfti0a + "IrgOyjwk" + KJTtfmC + yYcKnFQ + fBCfFVK + pEoZdet + HaLPdbX + XuhekqI + XvAScyV + sNamkAS + hZyEKvv + cYXetCp + CiQYlPy + zVASPhO + gqJohzZ + "");
    }

    public void onCreate() {
        short uvjfaqo1 = 65;
        boolean yuilhfti0 = true;
        float vgoazbdv4 = 15.15f;
        byte qpsxfahk3 = 98;
        boolean ignzabumkx2 = false;
        float nbrdprvf1 = 3.3f;
        short tbgsddfyo0 = 20;
        short bixvnqausc4 = 1;
        long iyqwdcijc3 = 85L;
        int efkmgslu2 = 67;
        byte ifpwkeewf1 = 34;
        float yhafxqzon0 = 65.65f;
        double kwkfeyjx2 = 60.60;
        double fxrnxinh1 = 74.74;
        int dgqpffiqm0 = 9;
        float jdtnchzlkn1 = 50.50f;
        char pezhfced0 = 90;
        int khaiifepbj0 = 37;
        int xxvteog2 = 63;
        long uappufvfs1 = 92L;
        short mwaleuw0 = 4;
        byte txctnqjsl0 = 22;
        float sqclkfieb1 = 39.39f;
        byte eshgwvh0 = 66;
        byte iwgnfqxtzn3 = 24;
        double jfdvcdhurw2 = 18.18;
        float mjpkprwrd1 = 81.81f;
        short vdhgbyf0 = 54;
        long rawrnusk1 = 1L;
        float xdyigkrpyk0 = 9.9f;
        int jxogcweci4 = 28;
        byte rohffwy3 = 52;
        byte ydwbbopntx2 = 17;
        short gufccczs1 = 20;
        double sqzibaihuo0 = 28.28;
        long vdtesgg0 = 23L;
        double ebrrmbaxtd0 = 52.52;
        long hhglbimace4 = 86L;
        boolean yrbwdkh3 = true;
        long xbrnwwgp2 = 50L;
        boolean hxuwhphno1 = false;
        float nfydgqvcw0 = 53.53f;
        char xgdzqwbjpo1 = 14;
        float vzosjni0 = 90.90f;
        char alvygeoadm3 = 49;
        char ifyscjbzz2 = 99;
        byte yxqedxn1 = 68;
        short kchbvftreu0 = 48;
        char vrxfgus1 = 71;
        char fpiphqmcgf0 = 14;
        int hzeudkjwx1 = 25;
        int imrszozrc0 = 51;
        byte kogdxvralw3 = 68;
        char debntzemhx2 = 99;
        float omwlgjzbip1 = 40.40f;
        long hoxccjy0 = 66L;
        char yjsxdmld3 = 92;
        long gjenoad2 = 32L;
        short gvgtqdnbjo1 = 43;
        long sxuapjeytk0 = 99L;
        long juttrju2 = 45L;
        float cbtakqtr1 = 74.74f;
        double idymefrlgl0 = 92.92;
        char tkfnrkl0 = 22;
        float hzawtolqn1 = 12.12f;
        long adssskf0 = 80L;
        float oucrjrtv2 = 4.4f;
        byte ojtlwcstrz1 = 54;
        double vrrvsxrl0 = 61.61;
        double hxmvhapni3 = 93.93;
        int lwpnftw2 = 25;
        short gvvdjtbxh1 = 47;
        long bkhfcsbki0 = 40L;
        float zbfprvyfm3 = 16.16f;
        long wgzcfqx2 = 7L;
        double vhcqhpmzc1 = 57.57;
        int syjjilqfhj0 = 42;
        boolean rybpzqbm0 = false;
        isLiving = true;
        super.onCreate();
        if (SimplyHouseworkrOrgManager.isDebug) {
            vSZqQlhh(tbgsddfyo0, nbrdprvf1, ignzabumkx2, qpsxfahk3, vgoazbdv4);
            bKwwBdWT(idymefrlgl0, cbtakqtr1, juttrju2);
            EtemlSDq(dgqpffiqm0, fxrnxinh1, kwkfeyjx2);
            vWiiCgDS(tkfnrkl0);
            IrgOyjwk(yuilhfti0, uvjfaqo1);
            IBcTHXNk(vrrvsxrl0, ojtlwcstrz1, oucrjrtv2);
            SBppFgwn(eshgwvh0, sqclkfieb1);
            XBCfppYV(imrszozrc0, hzeudkjwx1);
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        this.mLocalBinder = new LocalBinder(this);
        if (this.mLocalServiceConn == null) {
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        this.startSubService(1, false);
    }

    //垃圾方法
    private void NCLHyWCX(float bamauqt0, char imlgbhqzsa1) {
        char imlgbhqzsa1a = imlgbhqzsa1;
        float bamauqt0a = bamauqt0;
        TextUtils.isEmpty("NCLHyWCX" + bamauqt0a + imlgbhqzsa1a + "NCLHyWCX" + cYXetCp + hZyEKvv + fBCfFVK + KJTtfmC + XuhekqI + gqJohzZ + HaLPdbX + yYcKnFQ + pEoZdet + sNamkAS + XvAScyV + CiQYlPy + zVASPhO + "");
    }

    //垃圾方法
    private void FKsiXPgv(long avwdrty0, boolean awpbsjb1, short ucmbqsmtmk2) {
        short ucmbqsmtmk2a = ucmbqsmtmk2;
        boolean awpbsjb1a = awpbsjb1;
        long avwdrty0a = avwdrty0;
        new String("FKsiXPgv" + awpbsjb1a + avwdrty0a + ucmbqsmtmk2a + "FKsiXPgv" + zVASPhO + sNamkAS + hZyEKvv + pEoZdet + cYXetCp + KJTtfmC + yYcKnFQ + CiQYlPy + XvAScyV + HaLPdbX + fBCfFVK + XuhekqI + gqJohzZ + "");
    }

    //垃圾方法
    private void bBKgkejv(byte omiboguj0, float zemdkxqeny1, double dpcuiar2, float asxavmpx3, double ynjxrbteg4) {
        double ynjxrbteg4a = ynjxrbteg4;
        float asxavmpx3a = asxavmpx3;
        double dpcuiar2a = dpcuiar2;
        float zemdkxqeny1a = zemdkxqeny1;
        byte omiboguj0a = omiboguj0;
    }

    //垃圾方法
    private void AtaGlnMz(int qtrkecojvj0, byte upheaxhs1, char bysssjt2, float eplqkckqs3) {
        float eplqkckqs3a = eplqkckqs3;
        char bysssjt2a = bysssjt2;
        byte upheaxhs1a = upheaxhs1;
        int qtrkecojvj0a = qtrkecojvj0;
        Log.e("AtaGlnMz", "AtaGlnMz" + eplqkckqs3a + upheaxhs1a + qtrkecojvj0a + bysssjt2a + "AtaGlnMz" + sNamkAS + XuhekqI + XvAScyV + gqJohzZ + fBCfFVK + zVASPhO + pEoZdet + cYXetCp + CiQYlPy + HaLPdbX + hZyEKvv + KJTtfmC + yYcKnFQ + "");
    }

    public void onRebind(Intent intent) {
        float eplqkckqs3 = 35.35f;
        char bysssjt2 = 10;
        byte upheaxhs1 = 55;
        int qtrkecojvj0 = 50;
        double ynjxrbteg4 = 58.58;
        float asxavmpx3 = 26.26f;
        double dpcuiar2 = 3.3;
        float zemdkxqeny1 = 6.6f;
        byte omiboguj0 = 70;
        short ucmbqsmtmk2 = 15;
        boolean awpbsjb1 = true;
        long avwdrty0 = 13L;
        char imlgbhqzsa1 = 24;
        float bamauqt0 = 36.36f;
        super.onRebind(intent);
    }

    //垃圾方法
    private void NAJrHsQI(double eipbgivgdw0, short juzzapul1) {
        short juzzapul1a = juzzapul1;
        double eipbgivgdw0a = eipbgivgdw0;
        new StringBuffer("NAJrHsQI" + juzzapul1a + eipbgivgdw0a + "NAJrHsQI" + XvAScyV + sNamkAS + HaLPdbX + yYcKnFQ + cYXetCp + gqJohzZ + XuhekqI + CiQYlPy + hZyEKvv + KJTtfmC + zVASPhO + pEoZdet + fBCfFVK + "");
    }

    //垃圾方法
    private void EAhqWcFt(short fccyztk0, byte xnqotcxiil1) {
        byte xnqotcxiil1a = xnqotcxiil1;
        short fccyztk0a = fccyztk0;
        new StringBuilder("EAhqWcFt" + fccyztk0a + xnqotcxiil1a + "EAhqWcFt" + zVASPhO + XuhekqI + cYXetCp + yYcKnFQ + HaLPdbX + pEoZdet + KJTtfmC + sNamkAS + XvAScyV + CiQYlPy + fBCfFVK + hZyEKvv + gqJohzZ + "");
    }

    //垃圾方法
    private void uobuGoxX(float bjxabnfkc0, boolean zoehtpi1) {
        boolean zoehtpi1a = zoehtpi1;
        float bjxabnfkc0a = bjxabnfkc0;
        new WeakReference("uobuGoxX" + bjxabnfkc0a + zoehtpi1a + "uobuGoxX" + XvAScyV + HaLPdbX + hZyEKvv + pEoZdet + XuhekqI + zVASPhO + CiQYlPy + gqJohzZ + yYcKnFQ + KJTtfmC + cYXetCp + sNamkAS + fBCfFVK + "");
    }

    //垃圾方法
    private void gdXssvdu(int omjhaklvi0) {
        int omjhaklvi0a = omjhaklvi0;
        new Intent("gdXssvdu" + omjhaklvi0a + "gdXssvdu" + yYcKnFQ + sNamkAS + pEoZdet + zVASPhO + gqJohzZ + KJTtfmC + HaLPdbX + CiQYlPy + XvAScyV + fBCfFVK + hZyEKvv + XuhekqI + cYXetCp + "");
    }

    //垃圾方法
    private void OeFDOQgM(char fryercyx0, char ogxvkzbptt1, char jatwxsewm2, byte wnrxbslx3, byte hklwbtn4) {
        byte hklwbtn4a = hklwbtn4;
        byte wnrxbslx3a = wnrxbslx3;
        char jatwxsewm2a = jatwxsewm2;
        char ogxvkzbptt1a = ogxvkzbptt1;
        char fryercyx0a = fryercyx0;
        TextUtils.isDigitsOnly("OeFDOQgM" + hklwbtn4a + jatwxsewm2a + wnrxbslx3a + ogxvkzbptt1a + fryercyx0a + "OeFDOQgM" + sNamkAS + yYcKnFQ + XuhekqI + pEoZdet + KJTtfmC + CiQYlPy + fBCfFVK + XvAScyV + hZyEKvv + gqJohzZ + zVASPhO + HaLPdbX + cYXetCp + "");
    }

    //垃圾方法
    private void aiPngvcY(short mfsluvhki0, int cspibhzsws1, char rcpqeauo2, short hzhrdjkm3) {
        short hzhrdjkm3a = hzhrdjkm3;
        char rcpqeauo2a = rcpqeauo2;
        int cspibhzsws1a = cspibhzsws1;
        short mfsluvhki0a = mfsluvhki0;
        new Intent("aiPngvcY" + hzhrdjkm3a + rcpqeauo2a + mfsluvhki0a + cspibhzsws1a + "aiPngvcY" + gqJohzZ + fBCfFVK + XuhekqI + pEoZdet + XvAScyV + sNamkAS + hZyEKvv + CiQYlPy + KJTtfmC + zVASPhO + HaLPdbX + yYcKnFQ + cYXetCp + "");
    }

    //垃圾方法
    private void CFdYaTho(float ubhqnwf0, char jctqjpadp1, long bajaures2, float dhbitgxxro3) {
        float dhbitgxxro3a = dhbitgxxro3;
        long bajaures2a = bajaures2;
        char jctqjpadp1a = jctqjpadp1;
        float ubhqnwf0a = ubhqnwf0;
        new String("CFdYaTho" + jctqjpadp1a + bajaures2a + ubhqnwf0a + dhbitgxxro3a + "CFdYaTho" + KJTtfmC + gqJohzZ + CiQYlPy + XvAScyV + fBCfFVK + cYXetCp + zVASPhO + XuhekqI + HaLPdbX + pEoZdet + hZyEKvv + yYcKnFQ + sNamkAS + "");
    }

    //垃圾方法
    private void njOeAQvu(float ffwaztpv0) {
        float ffwaztpv0a = ffwaztpv0;
        new StringBuilder("njOeAQvu" + ffwaztpv0a + "njOeAQvu" + XvAScyV + CiQYlPy + KJTtfmC + HaLPdbX + hZyEKvv + pEoZdet + sNamkAS + cYXetCp + fBCfFVK + XuhekqI + zVASPhO + gqJohzZ + yYcKnFQ + "");
    }

    //垃圾方法
    private void RcWEriEw(char ckzdxgcoi0, short cywwvgq1, long wybbxtargb2) {
        long wybbxtargb2a = wybbxtargb2;
        short cywwvgq1a = cywwvgq1;
        char ckzdxgcoi0a = ckzdxgcoi0;
        System.out.println("RcWEriEw" + ckzdxgcoi0a + wybbxtargb2a + cywwvgq1a + "RcWEriEw" + zVASPhO + KJTtfmC + XvAScyV + yYcKnFQ + hZyEKvv + cYXetCp + gqJohzZ + fBCfFVK + HaLPdbX + CiQYlPy + sNamkAS + pEoZdet + XuhekqI + "");
    }

    //垃圾方法
    private void iiguCgbt(int luvnppuar0, char ndowrjbi1, byte dskfzbnku2, int scdljzgzz3, int qfaawsbmwr4) {
        int qfaawsbmwr4a = qfaawsbmwr4;
        int scdljzgzz3a = scdljzgzz3;
        byte dskfzbnku2a = dskfzbnku2;
        char ndowrjbi1a = ndowrjbi1;
        int luvnppuar0a = luvnppuar0;
        new String("iiguCgbt" + luvnppuar0a + scdljzgzz3a + dskfzbnku2a + qfaawsbmwr4a + ndowrjbi1a + "iiguCgbt" + cYXetCp + hZyEKvv + CiQYlPy + fBCfFVK + zVASPhO + gqJohzZ + sNamkAS + pEoZdet + HaLPdbX + KJTtfmC + XvAScyV + XuhekqI + yYcKnFQ + "");
    }

    //垃圾方法
    private void AmerSFMz(float ecpjjtwo0, char inngipnrgf1) {
        char inngipnrgf1a = inngipnrgf1;
        float ecpjjtwo0a = ecpjjtwo0;
        System.out.println("AmerSFMz" + inngipnrgf1a + ecpjjtwo0a + "AmerSFMz" + fBCfFVK + gqJohzZ + KJTtfmC + CiQYlPy + XvAScyV + pEoZdet + HaLPdbX + hZyEKvv + XuhekqI + sNamkAS + yYcKnFQ + cYXetCp + zVASPhO + "");
    }

    //垃圾方法
    private void MFQKLfyD(float igxhyiem0, char wcnxbfws1) {
        char wcnxbfws1a = wcnxbfws1;
        float igxhyiem0a = igxhyiem0;
        new String("MFQKLfyD" + wcnxbfws1a + igxhyiem0a + "MFQKLfyD" + pEoZdet + HaLPdbX + CiQYlPy + yYcKnFQ + gqJohzZ + cYXetCp + KJTtfmC + sNamkAS + hZyEKvv + XvAScyV + XuhekqI + fBCfFVK + zVASPhO + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        char wcnxbfws1 = 76;
        float igxhyiem0 = 98.98f;
        char inngipnrgf1 = 36;
        float ecpjjtwo0 = 53.53f;
        int qfaawsbmwr4 = 20;
        int scdljzgzz3 = 84;
        byte dskfzbnku2 = 32;
        char ndowrjbi1 = 70;
        int luvnppuar0 = 89;
        long wybbxtargb2 = 49L;
        short cywwvgq1 = 15;
        char ckzdxgcoi0 = 12;
        float ffwaztpv0 = 89.89f;
        float dhbitgxxro3 = 3.3f;
        long bajaures2 = 29L;
        char jctqjpadp1 = 93;
        float ubhqnwf0 = 28.28f;
        short hzhrdjkm3 = 1;
        char rcpqeauo2 = 19;
        int cspibhzsws1 = 93;
        short mfsluvhki0 = 50;
        byte hklwbtn4 = 8;
        byte wnrxbslx3 = 43;
        char jatwxsewm2 = 73;
        char ogxvkzbptt1 = 2;
        char fryercyx0 = 38;
        int omjhaklvi0 = 54;
        boolean zoehtpi1 = false;
        float bjxabnfkc0 = 23.23f;
        byte xnqotcxiil1 = 35;
        short fccyztk0 = 23;
        short juzzapul1 = 56;
        double eipbgivgdw0 = 73.73;
        if (intent != null && !isStartService) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        AmerSFMz(ecpjjtwo0, inngipnrgf1);
        njOeAQvu(ffwaztpv0);
        iiguCgbt(luvnppuar0, ndowrjbi1, dskfzbnku2, scdljzgzz3, qfaawsbmwr4);
        NAJrHsQI(eipbgivgdw0, juzzapul1);
        AmerSFMz(ecpjjtwo0, inngipnrgf1);
        if (SimplyHouseworkrOrgManager.isDebug) {
            RcWEriEw(ckzdxgcoi0, cywwvgq1, wybbxtargb2);
            aiPngvcY(mfsluvhki0, cspibhzsws1, rcpqeauo2, hzhrdjkm3);
            uobuGoxX(bjxabnfkc0, zoehtpi1);
            CFdYaTho(ubhqnwf0, jctqjpadp1, bajaures2, dhbitgxxro3);
            MFQKLfyD(igxhyiem0, wcnxbfws1);
            MFQKLfyD(igxhyiem0, wcnxbfws1);
            iiguCgbt(luvnppuar0, ndowrjbi1, dskfzbnku2, scdljzgzz3, qfaawsbmwr4);
            aiPngvcY(mfsluvhki0, cspibhzsws1, rcpqeauo2, hzhrdjkm3);
            njOeAQvu(ffwaztpv0);
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        njOeAQvu(ffwaztpv0);
        aiPngvcY(mfsluvhki0, cspibhzsws1, rcpqeauo2, hzhrdjkm3);
        njOeAQvu(ffwaztpv0);
        njOeAQvu(ffwaztpv0);
        uobuGoxX(bjxabnfkc0, zoehtpi1);
        njOeAQvu(ffwaztpv0);
        iiguCgbt(luvnppuar0, ndowrjbi1, dskfzbnku2, scdljzgzz3, qfaawsbmwr4);
        RcWEriEw(ckzdxgcoi0, cywwvgq1, wybbxtargb2);
        aiPngvcY(mfsluvhki0, cspibhzsws1, rcpqeauo2, hzhrdjkm3);
        aiPngvcY(mfsluvhki0, cspibhzsws1, rcpqeauo2, hzhrdjkm3);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void SoKXipSN(double jlxskwdpqb0, long dltgath1, long lsfhxrxjiy2) {
        long lsfhxrxjiy2a = lsfhxrxjiy2;
        long dltgath1a = dltgath1;
        double jlxskwdpqb0a = jlxskwdpqb0;
        new Thread("SoKXipSN" + lsfhxrxjiy2a + dltgath1a + jlxskwdpqb0a + "SoKXipSN" + gqJohzZ + CiQYlPy + fBCfFVK + KJTtfmC + yYcKnFQ + pEoZdet + XvAScyV + sNamkAS + XuhekqI + hZyEKvv + HaLPdbX + cYXetCp + zVASPhO + "");
    }

    //垃圾方法
    private void IZuCUwyR(double zolkoul0, byte ulchsjondz1, int wjirfnt2, float bbukcuvcqs3) {
        float bbukcuvcqs3a = bbukcuvcqs3;
        int wjirfnt2a = wjirfnt2;
        byte ulchsjondz1a = ulchsjondz1;
        double zolkoul0a = zolkoul0;
        TextUtils.isDigitsOnly("IZuCUwyR" + ulchsjondz1a + bbukcuvcqs3a + zolkoul0a + wjirfnt2a + "IZuCUwyR" + CiQYlPy + sNamkAS + hZyEKvv + gqJohzZ + yYcKnFQ + zVASPhO + KJTtfmC + fBCfFVK + XuhekqI + cYXetCp + pEoZdet + HaLPdbX + XvAScyV + "");
    }

    //垃圾方法
    private void pjgvVmiw(short dnqziwevd0, double fksyadffo1) {
        double fksyadffo1a = fksyadffo1;
        short dnqziwevd0a = dnqziwevd0;
        new Intent("pjgvVmiw" + dnqziwevd0a + fksyadffo1a + "pjgvVmiw" + CiQYlPy + sNamkAS + gqJohzZ + cYXetCp + XuhekqI + KJTtfmC + pEoZdet + XvAScyV + hZyEKvv + yYcKnFQ + zVASPhO + HaLPdbX + fBCfFVK + "");
    }

    //垃圾方法
    private void tvFAtdlL(int fbnxzrvy0, boolean kxfezvymz1, long ktbzascyrq2) {
        long ktbzascyrq2a = ktbzascyrq2;
        boolean kxfezvymz1a = kxfezvymz1;
        int fbnxzrvy0a = fbnxzrvy0;
        TextUtils.isDigitsOnly("tvFAtdlL" + fbnxzrvy0a + kxfezvymz1a + ktbzascyrq2a + "tvFAtdlL" + zVASPhO + KJTtfmC + XuhekqI + HaLPdbX + sNamkAS + pEoZdet + yYcKnFQ + hZyEKvv + fBCfFVK + gqJohzZ + XvAScyV + cYXetCp + CiQYlPy + "");
    }

    //垃圾方法
    private void GpkwstGi(long nwxoufzwft0, short efzlearfja1, short lmcottd2, boolean bezynvdnek3, char blewdos4) {
        char blewdos4a = blewdos4;
        boolean bezynvdnek3a = bezynvdnek3;
        short lmcottd2a = lmcottd2;
        short efzlearfja1a = efzlearfja1;
        long nwxoufzwft0a = nwxoufzwft0;
        TextUtils.isEmpty("GpkwstGi" + nwxoufzwft0a + lmcottd2a + efzlearfja1a + blewdos4a + bezynvdnek3a + "GpkwstGi" + KJTtfmC + fBCfFVK + zVASPhO + gqJohzZ + XvAScyV + XuhekqI + hZyEKvv + yYcKnFQ + cYXetCp + pEoZdet + HaLPdbX + CiQYlPy + sNamkAS + "");
    }

    //垃圾方法
    private void DdNmKzta(int ljagouox0) {
        int ljagouox0a = ljagouox0;
        TextUtils.isEmpty("DdNmKzta" + ljagouox0a + "DdNmKzta" + hZyEKvv + CiQYlPy + HaLPdbX + XuhekqI + pEoZdet + XvAScyV + yYcKnFQ + cYXetCp + sNamkAS + KJTtfmC + gqJohzZ + fBCfFVK + zVASPhO + "");
    }

    //垃圾方法
    private void vOiRAlXT(long zjzlbemwx0, float wpclqbqsec1, char ikprgzjh2, int vuxyogun3) {
        int vuxyogun3a = vuxyogun3;
        char ikprgzjh2a = ikprgzjh2;
        float wpclqbqsec1a = wpclqbqsec1;
        long zjzlbemwx0a = zjzlbemwx0;
        Log.i("vOiRAlXT", "vOiRAlXT" + ikprgzjh2a + wpclqbqsec1a + zjzlbemwx0a + vuxyogun3a + "vOiRAlXT" + HaLPdbX + gqJohzZ + CiQYlPy + fBCfFVK + yYcKnFQ + pEoZdet + XvAScyV + XuhekqI + cYXetCp + KJTtfmC + zVASPhO + sNamkAS + hZyEKvv + "");
    }

    //垃圾方法
    private void GxcLveuV(float pfvagqmt0, double sduszums1, byte pyjqcpk2, char sdzhgcpmnq3) {
        char sdzhgcpmnq3a = sdzhgcpmnq3;
        byte pyjqcpk2a = pyjqcpk2;
        double sduszums1a = sduszums1;
        float pfvagqmt0a = pfvagqmt0;
        TextUtils.isEmpty("GxcLveuV" + pyjqcpk2a + sduszums1a + pfvagqmt0a + sdzhgcpmnq3a + "GxcLveuV" + fBCfFVK + cYXetCp + zVASPhO + yYcKnFQ + HaLPdbX + sNamkAS + KJTtfmC + gqJohzZ + pEoZdet + XvAScyV + CiQYlPy + hZyEKvv + XuhekqI + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        char sdzhgcpmnq3 = 26;
        byte pyjqcpk2 = 32;
        double sduszums1 = 66.66;
        float pfvagqmt0 = 100.100f;
        int vuxyogun3 = 10;
        char ikprgzjh2 = 67;
        float wpclqbqsec1 = 54.54f;
        long zjzlbemwx0 = 1L;
        int ljagouox0 = 72;
        char blewdos4 = 94;
        boolean bezynvdnek3 = true;
        short lmcottd2 = 71;
        short efzlearfja1 = 93;
        long nwxoufzwft0 = 45L;
        long ktbzascyrq2 = 63L;
        boolean kxfezvymz1 = false;
        int fbnxzrvy0 = 51;
        double fksyadffo1 = 8.8;
        short dnqziwevd0 = 79;
        float bbukcuvcqs3 = 64.64f;
        int wjirfnt2 = 52;
        byte ulchsjondz1 = 27;
        double zolkoul0 = 31.31;
        long lsfhxrxjiy2 = 45L;
        long dltgath1 = 81L;
        double jlxskwdpqb0 = 78.78;
        DdNmKzta(ljagouox0);
        SoKXipSN(jlxskwdpqb0, dltgath1, lsfhxrxjiy2);
        vOiRAlXT(zjzlbemwx0, wpclqbqsec1, ikprgzjh2, vuxyogun3);
        IZuCUwyR(zolkoul0, ulchsjondz1, wjirfnt2, bbukcuvcqs3);
        if (SimplyHouseworkrOrgManager.isDebug) {
            IZuCUwyR(zolkoul0, ulchsjondz1, wjirfnt2, bbukcuvcqs3);
            GpkwstGi(nwxoufzwft0, efzlearfja1, lmcottd2, bezynvdnek3, blewdos4);
            pjgvVmiw(dnqziwevd0, fksyadffo1);
            DdNmKzta(ljagouox0);
            tvFAtdlL(fbnxzrvy0, kxfezvymz1, ktbzascyrq2);
            vOiRAlXT(zjzlbemwx0, wpclqbqsec1, ikprgzjh2, vuxyogun3);
            SoKXipSN(jlxskwdpqb0, dltgath1, lsfhxrxjiy2);
            GpkwstGi(nwxoufzwft0, efzlearfja1, lmcottd2, bezynvdnek3, blewdos4);
            tvFAtdlL(fbnxzrvy0, kxfezvymz1, ktbzascyrq2);
            pjgvVmiw(dnqziwevd0, fksyadffo1);
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        return this.mLocalBinder;
    }

    //垃圾方法
    private void kxJDXWvh(float mhuinisu0, char bxgeeklrv1, short mbpaaemsc2) {
        short mbpaaemsc2a = mbpaaemsc2;
        char bxgeeklrv1a = bxgeeklrv1;
        float mhuinisu0a = mhuinisu0;
        Log.w("kxJDXWvh", "kxJDXWvh" + mhuinisu0a + bxgeeklrv1a + mbpaaemsc2a + "kxJDXWvh" + fBCfFVK + KJTtfmC + XuhekqI + hZyEKvv + CiQYlPy + yYcKnFQ + HaLPdbX + pEoZdet + XvAScyV + zVASPhO + cYXetCp + gqJohzZ + sNamkAS + "");
    }

    //垃圾方法
    private void gXelRsQF(long tdkfpay0) {
        long tdkfpay0a = tdkfpay0;
        new Thread("gXelRsQF" + tdkfpay0a + "gXelRsQF" + CiQYlPy + yYcKnFQ + pEoZdet + cYXetCp + sNamkAS + XuhekqI + hZyEKvv + fBCfFVK + zVASPhO + KJTtfmC + HaLPdbX + gqJohzZ + XvAScyV + "");
    }

    //垃圾方法
    private void VwQnveUz(float vderycjxeq0) {
        float vderycjxeq0a = vderycjxeq0;
        new Intent("VwQnveUz" + vderycjxeq0a + "VwQnveUz" + gqJohzZ + zVASPhO + XvAScyV + HaLPdbX + CiQYlPy + hZyEKvv + pEoZdet + fBCfFVK + cYXetCp + yYcKnFQ + XuhekqI + KJTtfmC + sNamkAS + "");
    }

    //垃圾方法
    private void CRZLIxRW(boolean nzbjlijgt0, short tnfrzsp1) {
        short tnfrzsp1a = tnfrzsp1;
        boolean nzbjlijgt0a = nzbjlijgt0;
        new WeakReference("CRZLIxRW" + nzbjlijgt0a + tnfrzsp1a + "CRZLIxRW" + KJTtfmC + hZyEKvv + zVASPhO + XuhekqI + pEoZdet + CiQYlPy + gqJohzZ + XvAScyV + fBCfFVK + HaLPdbX + yYcKnFQ + cYXetCp + sNamkAS + "");
    }

    //垃圾方法
    private void eBbkfkFr(char qlcrhee0, int xmtdxck1, byte wfvpovazp2) {
        byte wfvpovazp2a = wfvpovazp2;
        int xmtdxck1a = xmtdxck1;
        char qlcrhee0a = qlcrhee0;
        new StringBuffer("eBbkfkFr" + wfvpovazp2a + qlcrhee0a + xmtdxck1a + "eBbkfkFr" + cYXetCp + fBCfFVK + pEoZdet + HaLPdbX + hZyEKvv + gqJohzZ + CiQYlPy + zVASPhO + XvAScyV + yYcKnFQ + XuhekqI + sNamkAS + KJTtfmC + "");
    }

    //垃圾方法
    private void SnsWQIMH(byte mdcrsma0, int utpjujuka1, char fnyxzpo2) {
        char fnyxzpo2a = fnyxzpo2;
        int utpjujuka1a = utpjujuka1;
        byte mdcrsma0a = mdcrsma0;
        new Thread("SnsWQIMH" + mdcrsma0a + fnyxzpo2a + utpjujuka1a + "SnsWQIMH" + XvAScyV + KJTtfmC + XuhekqI + zVASPhO + yYcKnFQ + pEoZdet + fBCfFVK + sNamkAS + HaLPdbX + gqJohzZ + hZyEKvv + CiQYlPy + cYXetCp + "");
    }

    //垃圾方法
    private void FRwBhvhs(long vopszkjkmv0, short ugyjqlv1, boolean qoqwqydff2) {
        boolean qoqwqydff2a = qoqwqydff2;
        short ugyjqlv1a = ugyjqlv1;
        long vopszkjkmv0a = vopszkjkmv0;
        new StringBuilder("FRwBhvhs" + vopszkjkmv0a + ugyjqlv1a + qoqwqydff2a + "FRwBhvhs" + pEoZdet + yYcKnFQ + fBCfFVK + cYXetCp + zVASPhO + KJTtfmC + XvAScyV + sNamkAS + gqJohzZ + HaLPdbX + XuhekqI + hZyEKvv + CiQYlPy + "");
    }

    //垃圾方法
    private void dfDGHReL(float gfibkcojoq0, char zvkrwgnv1) {
        char zvkrwgnv1a = zvkrwgnv1;
        float gfibkcojoq0a = gfibkcojoq0;
        System.out.println("dfDGHReL" + zvkrwgnv1a + gfibkcojoq0a + "dfDGHReL" + cYXetCp + hZyEKvv + XvAScyV + XuhekqI + fBCfFVK + HaLPdbX + yYcKnFQ + CiQYlPy + sNamkAS + gqJohzZ + KJTtfmC + pEoZdet + zVASPhO + "");
    }

    //垃圾方法
    private void VqQafoNd(double euyysvcrp0, int nhaskcxx1, float mjoddvml2) {
        float mjoddvml2a = mjoddvml2;
        int nhaskcxx1a = nhaskcxx1;
        double euyysvcrp0a = euyysvcrp0;
        System.out.println("VqQafoNd" + mjoddvml2a + nhaskcxx1a + euyysvcrp0a + "VqQafoNd" + yYcKnFQ + KJTtfmC + fBCfFVK + hZyEKvv + XuhekqI + sNamkAS + zVASPhO + cYXetCp + CiQYlPy + pEoZdet + gqJohzZ + XvAScyV + HaLPdbX + "");
    }

    //垃圾方法
    private void MNSraxCd(char xqvrqkvnp0, int vfznygmz1) {
        int vfznygmz1a = vfznygmz1;
        char xqvrqkvnp0a = xqvrqkvnp0;
        Log.w("MNSraxCd", "MNSraxCd" + xqvrqkvnp0a + vfznygmz1a + "MNSraxCd" + yYcKnFQ + XuhekqI + cYXetCp + XvAScyV + zVASPhO + fBCfFVK + HaLPdbX + sNamkAS + CiQYlPy + hZyEKvv + KJTtfmC + gqJohzZ + pEoZdet + "");
    }

    //垃圾方法
    private void JfJzsuQC(float vrupfyk0, float ulbnydppcs1, char foaymsg2, double grqicvqvou3) {
        double grqicvqvou3a = grqicvqvou3;
        char foaymsg2a = foaymsg2;
        float ulbnydppcs1a = ulbnydppcs1;
        float vrupfyk0a = vrupfyk0;
        TextUtils.isEmpty("JfJzsuQC" + vrupfyk0a + ulbnydppcs1a + foaymsg2a + grqicvqvou3a + "JfJzsuQC" + gqJohzZ + XvAScyV + HaLPdbX + hZyEKvv + cYXetCp + zVASPhO + fBCfFVK + sNamkAS + yYcKnFQ + CiQYlPy + XuhekqI + KJTtfmC + pEoZdet + "");
    }

    //垃圾方法
    private void mKHejMUB(double quzlobm0) {
        double quzlobm0a = quzlobm0;
        new AttributedString("mKHejMUB" + quzlobm0a + "mKHejMUB" + XuhekqI + fBCfFVK + XvAScyV + cYXetCp + KJTtfmC + zVASPhO + pEoZdet + HaLPdbX + gqJohzZ + hZyEKvv + CiQYlPy + yYcKnFQ + sNamkAS + "");
    }

    //垃圾方法
    private void sZWkcIsV(short sgwaeyqrfx0) {
        short sgwaeyqrfx0a = sgwaeyqrfx0;
        new StringBuilder("sZWkcIsV" + sgwaeyqrfx0a + "sZWkcIsV" + hZyEKvv + gqJohzZ + CiQYlPy + HaLPdbX + KJTtfmC + XvAScyV + XuhekqI + zVASPhO + cYXetCp + pEoZdet + yYcKnFQ + sNamkAS + fBCfFVK + "");
    }

    //垃圾方法
    private void BljcVlxu(float jixoaysyr0, float nquftmo1, long gmocjyi2) {
        long gmocjyi2a = gmocjyi2;
        float nquftmo1a = nquftmo1;
        float jixoaysyr0a = jixoaysyr0;
        System.out.println("BljcVlxu" + gmocjyi2a + jixoaysyr0a + nquftmo1a + "BljcVlxu" + pEoZdet + CiQYlPy + XvAScyV + sNamkAS + fBCfFVK + hZyEKvv + KJTtfmC + gqJohzZ + yYcKnFQ + zVASPhO + HaLPdbX + cYXetCp + XuhekqI + "");
    }

    //垃圾方法
    private void QyRRAQpP(long cgxxhmq0, short olcrwhnf1, float vzjsxwee2) {
        float vzjsxwee2a = vzjsxwee2;
        short olcrwhnf1a = olcrwhnf1;
        long cgxxhmq0a = cgxxhmq0;
        new AttributedString("QyRRAQpP" + cgxxhmq0a + vzjsxwee2a + olcrwhnf1a + "QyRRAQpP" + sNamkAS + hZyEKvv + gqJohzZ + yYcKnFQ + HaLPdbX + pEoZdet + zVASPhO + cYXetCp + fBCfFVK + KJTtfmC + CiQYlPy + XvAScyV + XuhekqI + "");
    }

    //垃圾方法
    private void iycpOfwW(double bzyrxpl0, long jfvxcwqjg1) {
        long jfvxcwqjg1a = jfvxcwqjg1;
        double bzyrxpl0a = bzyrxpl0;
        TextUtils.isEmpty("iycpOfwW" + bzyrxpl0a + jfvxcwqjg1a + "iycpOfwW" + zVASPhO + HaLPdbX + CiQYlPy + fBCfFVK + gqJohzZ + KJTtfmC + hZyEKvv + pEoZdet + cYXetCp + XvAScyV + XuhekqI + sNamkAS + yYcKnFQ + "");
    }

    //垃圾方法
    private void nURKlnFS(short tzextgc0, char ucjnhuimft1, double pixkqogu2, boolean axeuyftamh3) {
        boolean axeuyftamh3a = axeuyftamh3;
        double pixkqogu2a = pixkqogu2;
        char ucjnhuimft1a = ucjnhuimft1;
        short tzextgc0a = tzextgc0;
        Log.w("nURKlnFS", "nURKlnFS" + ucjnhuimft1a + pixkqogu2a + tzextgc0a + axeuyftamh3a + "nURKlnFS" + yYcKnFQ + XvAScyV + gqJohzZ + fBCfFVK + XuhekqI + CiQYlPy + sNamkAS + zVASPhO + pEoZdet + hZyEKvv + cYXetCp + KJTtfmC + HaLPdbX + "");
    }

    //垃圾方法
    private void edoRjUfO(byte gtpxctfnl0, byte plddugwpuv1, boolean rdkogsbchq2) {
        boolean rdkogsbchq2a = rdkogsbchq2;
        byte plddugwpuv1a = plddugwpuv1;
        byte gtpxctfnl0a = gtpxctfnl0;
        new WeakReference("edoRjUfO" + rdkogsbchq2a + gtpxctfnl0a + plddugwpuv1a + "edoRjUfO" + XvAScyV + yYcKnFQ + cYXetCp + hZyEKvv + gqJohzZ + pEoZdet + HaLPdbX + KJTtfmC + fBCfFVK + zVASPhO + sNamkAS + CiQYlPy + XuhekqI + "");
    }

    //垃圾方法
    private void zvpceSfg(boolean yoamfetkm0, short pzgfyzqbw1, byte sdcdxkw2, boolean wdfoevziw3, char cetnxuze4) {
        char cetnxuze4a = cetnxuze4;
        boolean wdfoevziw3a = wdfoevziw3;
        byte sdcdxkw2a = sdcdxkw2;
        short pzgfyzqbw1a = pzgfyzqbw1;
        boolean yoamfetkm0a = yoamfetkm0;
        new File("zvpceSfg" + cetnxuze4a + yoamfetkm0a + sdcdxkw2a + wdfoevziw3a + pzgfyzqbw1a + "zvpceSfg" + CiQYlPy + gqJohzZ + hZyEKvv + zVASPhO + yYcKnFQ + HaLPdbX + XvAScyV + sNamkAS + cYXetCp + pEoZdet + XuhekqI + KJTtfmC + fBCfFVK + "");
    }

    //垃圾方法
    private void pTtXBCug(byte hapwqng0, boolean kgyzljq1, byte fwgxavwqfk2) {
        byte fwgxavwqfk2a = fwgxavwqfk2;
        boolean kgyzljq1a = kgyzljq1;
        byte hapwqng0a = hapwqng0;
        new String("pTtXBCug" + hapwqng0a + kgyzljq1a + fwgxavwqfk2a + "pTtXBCug" + cYXetCp + zVASPhO + fBCfFVK + yYcKnFQ + sNamkAS + hZyEKvv + CiQYlPy + KJTtfmC + XvAScyV + gqJohzZ + HaLPdbX + pEoZdet + XuhekqI + "");
    }

    public void onDestroy() {
        byte fwgxavwqfk2 = 4;
        boolean kgyzljq1 = false;
        byte hapwqng0 = 60;
        char cetnxuze4 = 61;
        boolean wdfoevziw3 = false;
        byte sdcdxkw2 = 93;
        short pzgfyzqbw1 = 99;
        boolean yoamfetkm0 = false;
        boolean rdkogsbchq2 = true;
        byte plddugwpuv1 = 36;
        byte gtpxctfnl0 = 77;
        boolean axeuyftamh3 = false;
        double pixkqogu2 = 0.0;
        char ucjnhuimft1 = 55;
        short tzextgc0 = 34;
        long jfvxcwqjg1 = 41L;
        double bzyrxpl0 = 66.66;
        float vzjsxwee2 = 100.100f;
        short olcrwhnf1 = 52;
        long cgxxhmq0 = 23L;
        long gmocjyi2 = 16L;
        float nquftmo1 = 77.77f;
        float jixoaysyr0 = 61.61f;
        short sgwaeyqrfx0 = 5;
        double quzlobm0 = 16.16;
        double grqicvqvou3 = 43.43;
        char foaymsg2 = 54;
        float ulbnydppcs1 = 47.47f;
        float vrupfyk0 = 43.43f;
        int vfznygmz1 = 15;
        char xqvrqkvnp0 = 8;
        float mjoddvml2 = 85.85f;
        int nhaskcxx1 = 96;
        double euyysvcrp0 = 54.54;
        char zvkrwgnv1 = 55;
        float gfibkcojoq0 = 45.45f;
        boolean qoqwqydff2 = false;
        short ugyjqlv1 = 3;
        long vopszkjkmv0 = 21L;
        char fnyxzpo2 = 98;
        int utpjujuka1 = 63;
        byte mdcrsma0 = 24;
        byte wfvpovazp2 = 89;
        int xmtdxck1 = 36;
        char qlcrhee0 = 18;
        short tnfrzsp1 = 83;
        boolean nzbjlijgt0 = true;
        float vderycjxeq0 = 33.33f;
        long tdkfpay0 = 72L;
        short mbpaaemsc2 = 12;
        char bxgeeklrv1 = 33;
        float mhuinisu0 = 50.50f;
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        isStartService = false;
        isLiving = false;
        isReTryBinding = false;
    }

    //垃圾方法
    private void zbuJqtlj(byte njpdubxfho0, short endrcmrzz1) {
        short endrcmrzz1a = endrcmrzz1;
        byte njpdubxfho0a = njpdubxfho0;
        new AttributedString("zbuJqtlj" + endrcmrzz1a + njpdubxfho0a + "zbuJqtlj" + zVASPhO + HaLPdbX + cYXetCp + yYcKnFQ + fBCfFVK + CiQYlPy + KJTtfmC + hZyEKvv + pEoZdet + sNamkAS + XuhekqI + XvAScyV + gqJohzZ + "");
    }

    //垃圾方法
    private void WyLwQeDd(long nhlkbbk0, int ujtpvkxqef1, boolean kefmfuzvym2, boolean phiilqyis3, byte ovmtdgz4) {
        byte ovmtdgz4a = ovmtdgz4;
        boolean phiilqyis3a = phiilqyis3;
        boolean kefmfuzvym2a = kefmfuzvym2;
        int ujtpvkxqef1a = ujtpvkxqef1;
        long nhlkbbk0a = nhlkbbk0;
        new Intent("WyLwQeDd" + ujtpvkxqef1a + phiilqyis3a + ovmtdgz4a + nhlkbbk0a + kefmfuzvym2a + "WyLwQeDd" + CiQYlPy + pEoZdet + KJTtfmC + HaLPdbX + hZyEKvv + cYXetCp + zVASPhO + yYcKnFQ + gqJohzZ + XvAScyV + sNamkAS + XuhekqI + fBCfFVK + "");
    }

    //垃圾方法
    private void QflPsSjT(byte rzpebfdofu0, byte xmwuxszm1) {
        byte xmwuxszm1a = xmwuxszm1;
        byte rzpebfdofu0a = rzpebfdofu0;
        new Thread("QflPsSjT" + xmwuxszm1a + rzpebfdofu0a + "QflPsSjT" + XvAScyV + zVASPhO + CiQYlPy + XuhekqI + KJTtfmC + pEoZdet + yYcKnFQ + sNamkAS + HaLPdbX + fBCfFVK + gqJohzZ + cYXetCp + hZyEKvv + "");
    }

    //垃圾方法
    private void cWsNepnM(char ptptssv0, float owxsqurth1) {
        float owxsqurth1a = owxsqurth1;
        char ptptssv0a = ptptssv0;
        new WeakReference("cWsNepnM" + owxsqurth1a + ptptssv0a + "cWsNepnM" + XvAScyV + HaLPdbX + gqJohzZ + XuhekqI + cYXetCp + sNamkAS + CiQYlPy + KJTtfmC + fBCfFVK + pEoZdet + yYcKnFQ + zVASPhO + hZyEKvv + "");
    }

    //垃圾方法
    private void bijjIoZz(long ezncahhfq0, long sqepcldk1, float adypvrt2, char kxuwiamly3) {
        char kxuwiamly3a = kxuwiamly3;
        float adypvrt2a = adypvrt2;
        long sqepcldk1a = sqepcldk1;
        long ezncahhfq0a = ezncahhfq0;
        System.out.println("bijjIoZz" + adypvrt2a + kxuwiamly3a + sqepcldk1a + ezncahhfq0a + "bijjIoZz" + CiQYlPy + zVASPhO + pEoZdet + cYXetCp + KJTtfmC + fBCfFVK + yYcKnFQ + hZyEKvv + XvAScyV + HaLPdbX + gqJohzZ + sNamkAS + XuhekqI + "");
    }

    //垃圾方法
    private void JLgZEeTL(float yatlujfreq0, boolean cupuomy1, char acssrhuyn2, short gvtyohdxq3, long fthcvyxdlc4) {
        long fthcvyxdlc4a = fthcvyxdlc4;
        short gvtyohdxq3a = gvtyohdxq3;
        char acssrhuyn2a = acssrhuyn2;
        boolean cupuomy1a = cupuomy1;
        float yatlujfreq0a = yatlujfreq0;
    }

    //垃圾方法
    private void OIZlDMNB(int ddptzhu0) {
        int ddptzhu0a = ddptzhu0;
        new String("OIZlDMNB" + ddptzhu0a + "OIZlDMNB" + XuhekqI + zVASPhO + pEoZdet + HaLPdbX + fBCfFVK + CiQYlPy + XvAScyV + sNamkAS + hZyEKvv + gqJohzZ + KJTtfmC + cYXetCp + yYcKnFQ + "");
    }

    //垃圾方法
    private void EZpuruKw(float dsxwnkv0, byte iaoyhcpicv1, float crwdaswrak2) {
        float crwdaswrak2a = crwdaswrak2;
        byte iaoyhcpicv1a = iaoyhcpicv1;
        float dsxwnkv0a = dsxwnkv0;
    }

    public boolean onUnbind(Intent intent) {
        float crwdaswrak2 = 51.51f;
        byte iaoyhcpicv1 = 22;
        float dsxwnkv0 = 15.15f;
        int ddptzhu0 = 47;
        long fthcvyxdlc4 = 2L;
        short gvtyohdxq3 = 52;
        char acssrhuyn2 = 63;
        boolean cupuomy1 = false;
        float yatlujfreq0 = 18.18f;
        char kxuwiamly3 = 93;
        float adypvrt2 = 62.62f;
        long sqepcldk1 = 26L;
        long ezncahhfq0 = 9L;
        float owxsqurth1 = 37.37f;
        char ptptssv0 = 95;
        byte xmwuxszm1 = 2;
        byte rzpebfdofu0 = 30;
        byte ovmtdgz4 = 62;
        boolean phiilqyis3 = true;
        boolean kefmfuzvym2 = true;
        int ujtpvkxqef1 = 12;
        long nhlkbbk0 = 6L;
        short endrcmrzz1 = 33;
        byte njpdubxfho0 = 32;
        zbuJqtlj(njpdubxfho0, endrcmrzz1);
        zbuJqtlj(njpdubxfho0, endrcmrzz1);
        JLgZEeTL(yatlujfreq0, cupuomy1, acssrhuyn2, gvtyohdxq3, fthcvyxdlc4);
        WyLwQeDd(nhlkbbk0, ujtpvkxqef1, kefmfuzvym2, phiilqyis3, ovmtdgz4);
        cWsNepnM(ptptssv0, owxsqurth1);
        QflPsSjT(rzpebfdofu0, xmwuxszm1);
        if (SimplyHouseworkrOrgManager.isDebug) {
            bijjIoZz(ezncahhfq0, sqepcldk1, adypvrt2, kxuwiamly3);
            cWsNepnM(ptptssv0, owxsqurth1);
            bijjIoZz(ezncahhfq0, sqepcldk1, adypvrt2, kxuwiamly3);
            OIZlDMNB(ddptzhu0);
            OIZlDMNB(ddptzhu0);
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void gtnRjlNA(boolean czvxgrojx0, byte qcartrrvw1, float xyavsqakp2, double pfhepliwyy3) {
        double pfhepliwyy3a = pfhepliwyy3;
        float xyavsqakp2a = xyavsqakp2;
        byte qcartrrvw1a = qcartrrvw1;
        boolean czvxgrojx0a = czvxgrojx0;
        new Thread("gtnRjlNA" + czvxgrojx0a + pfhepliwyy3a + xyavsqakp2a + qcartrrvw1a + "gtnRjlNA" + CiQYlPy + fBCfFVK + XvAScyV + sNamkAS + cYXetCp + yYcKnFQ + pEoZdet + gqJohzZ + zVASPhO + KJTtfmC + hZyEKvv + HaLPdbX + XuhekqI + "");
    }

    //垃圾方法
    private void kLPmtGIU(short ofzumyya0, float sguasfwbe1, char kjhjtqey2, int obhmbpmv3) {
        int obhmbpmv3a = obhmbpmv3;
        char kjhjtqey2a = kjhjtqey2;
        float sguasfwbe1a = sguasfwbe1;
        short ofzumyya0a = ofzumyya0;
        Log.w("kLPmtGIU", "kLPmtGIU" + obhmbpmv3a + ofzumyya0a + kjhjtqey2a + sguasfwbe1a + "kLPmtGIU" + KJTtfmC + HaLPdbX + sNamkAS + gqJohzZ + XvAScyV + XuhekqI + fBCfFVK + zVASPhO + pEoZdet + cYXetCp + yYcKnFQ + CiQYlPy + hZyEKvv + "");
    }

    //垃圾方法
    private void KNmnkzTP(byte qvtfdrs0, short xsgfuhhgod1, int yoevxscnq2, byte fnjbkzspq3, double pnsflikoo4) {
        double pnsflikoo4a = pnsflikoo4;
        byte fnjbkzspq3a = fnjbkzspq3;
        int yoevxscnq2a = yoevxscnq2;
        short xsgfuhhgod1a = xsgfuhhgod1;
        byte qvtfdrs0a = qvtfdrs0;
        Log.w("KNmnkzTP", "KNmnkzTP" + xsgfuhhgod1a + fnjbkzspq3a + qvtfdrs0a + yoevxscnq2a + pnsflikoo4a + "KNmnkzTP" + zVASPhO + XvAScyV + fBCfFVK + CiQYlPy + cYXetCp + pEoZdet + XuhekqI + gqJohzZ + yYcKnFQ + HaLPdbX + hZyEKvv + sNamkAS + KJTtfmC + "");
    }

    //垃圾方法
    private void pMmdHOpj(double ykirjzrojn0, byte cxhqbyw1, long zxicyjs2, boolean mcwjxvq3) {
        boolean mcwjxvq3a = mcwjxvq3;
        long zxicyjs2a = zxicyjs2;
        byte cxhqbyw1a = cxhqbyw1;
        double ykirjzrojn0a = ykirjzrojn0;
        Log.e("pMmdHOpj", "pMmdHOpj" + zxicyjs2a + cxhqbyw1a + ykirjzrojn0a + mcwjxvq3a + "pMmdHOpj" + XvAScyV + hZyEKvv + sNamkAS + fBCfFVK + pEoZdet + yYcKnFQ + HaLPdbX + CiQYlPy + gqJohzZ + XuhekqI + cYXetCp + KJTtfmC + zVASPhO + "");
    }

    private boolean isSubBinderAlive() {
        boolean mcwjxvq3 = false;
        long zxicyjs2 = 36L;
        byte cxhqbyw1 = 63;
        double ykirjzrojn0 = 5.5;
        double pnsflikoo4 = 83.83;
        byte fnjbkzspq3 = 5;
        int yoevxscnq2 = 89;
        short xsgfuhhgod1 = 83;
        byte qvtfdrs0 = 92;
        int obhmbpmv3 = 80;
        char kjhjtqey2 = 14;
        float sguasfwbe1 = 55.55f;
        short ofzumyya0 = 28;
        double pfhepliwyy3 = 41.41;
        float xyavsqakp2 = 91.91f;
        byte qcartrrvw1 = 47;
        boolean czvxgrojx0 = true;
        KNmnkzTP(qvtfdrs0, xsgfuhhgod1, yoevxscnq2, fnjbkzspq3, pnsflikoo4);
        pMmdHOpj(ykirjzrojn0, cxhqbyw1, zxicyjs2, mcwjxvq3);
        pMmdHOpj(ykirjzrojn0, cxhqbyw1, zxicyjs2, mcwjxvq3);
        kLPmtGIU(ofzumyya0, sguasfwbe1, kjhjtqey2, obhmbpmv3);
        kLPmtGIU(ofzumyya0, sguasfwbe1, kjhjtqey2, obhmbpmv3);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void TlQNKvne(float jpzolfmzl0) {
        float jpzolfmzl0a = jpzolfmzl0;
        new StringReader("TlQNKvne" + jpzolfmzl0a + "TlQNKvne" + HaLPdbX + pEoZdet + zVASPhO + fBCfFVK + XvAScyV + KJTtfmC + gqJohzZ + sNamkAS + yYcKnFQ + CiQYlPy + hZyEKvv + cYXetCp + XuhekqI + "");
    }

    //垃圾方法
    private void VfDcdDYy(char bqfnhyrg0, double tprvjdchia1, short fbtpetlmkj2) {
        short fbtpetlmkj2a = fbtpetlmkj2;
        double tprvjdchia1a = tprvjdchia1;
        char bqfnhyrg0a = bqfnhyrg0;
        new AttributedString("VfDcdDYy" + fbtpetlmkj2a + bqfnhyrg0a + tprvjdchia1a + "VfDcdDYy" + cYXetCp + HaLPdbX + fBCfFVK + gqJohzZ + CiQYlPy + KJTtfmC + hZyEKvv + sNamkAS + yYcKnFQ + XuhekqI + pEoZdet + zVASPhO + XvAScyV + "");
    }

    //垃圾方法
    private void sQTyGiSH(int iheabuqjv0, short bznmaspsq1, char nimmvkv2) {
        char nimmvkv2a = nimmvkv2;
        short bznmaspsq1a = bznmaspsq1;
        int iheabuqjv0a = iheabuqjv0;
        new AttributedString("sQTyGiSH" + iheabuqjv0a + nimmvkv2a + bznmaspsq1a + "sQTyGiSH" + cYXetCp + gqJohzZ + KJTtfmC + zVASPhO + fBCfFVK + XuhekqI + CiQYlPy + HaLPdbX + hZyEKvv + pEoZdet + XvAScyV + yYcKnFQ + sNamkAS + "");
    }

    //垃圾方法
    private void CoayhjVw(boolean vvgziztov0, long gmtgmodrcd1, int bgpoqhj2) {
        int bgpoqhj2a = bgpoqhj2;
        long gmtgmodrcd1a = gmtgmodrcd1;
        boolean vvgziztov0a = vvgziztov0;
        TextUtils.isEmpty("CoayhjVw" + vvgziztov0a + gmtgmodrcd1a + bgpoqhj2a + "CoayhjVw" + pEoZdet + XvAScyV + HaLPdbX + zVASPhO + fBCfFVK + KJTtfmC + XuhekqI + cYXetCp + hZyEKvv + gqJohzZ + sNamkAS + CiQYlPy + yYcKnFQ + "");
    }

    //垃圾方法
    private void iKkBgDql(char qctwxmnr0, boolean ptqsipbtyb1, double gmuxjlrtq2, boolean alhbjpe3, int uqjsoud4) {
        int uqjsoud4a = uqjsoud4;
        boolean alhbjpe3a = alhbjpe3;
        double gmuxjlrtq2a = gmuxjlrtq2;
        boolean ptqsipbtyb1a = ptqsipbtyb1;
        char qctwxmnr0a = qctwxmnr0;
        System.out.println("iKkBgDql" + qctwxmnr0a + alhbjpe3a + ptqsipbtyb1a + uqjsoud4a + gmuxjlrtq2a + "iKkBgDql" + cYXetCp + fBCfFVK + XvAScyV + yYcKnFQ + sNamkAS + XuhekqI + hZyEKvv + zVASPhO + HaLPdbX + KJTtfmC + CiQYlPy + gqJohzZ + pEoZdet + "");
    }

    //垃圾方法
    private void bkREfQoH(double krajyur0, int dijtnhdtue1, char zvrmqcc2) {
        char zvrmqcc2a = zvrmqcc2;
        int dijtnhdtue1a = dijtnhdtue1;
        double krajyur0a = krajyur0;
        new AttributedString("bkREfQoH" + zvrmqcc2a + krajyur0a + dijtnhdtue1a + "bkREfQoH" + XvAScyV + yYcKnFQ + CiQYlPy + XuhekqI + HaLPdbX + fBCfFVK + zVASPhO + hZyEKvv + cYXetCp + gqJohzZ + sNamkAS + KJTtfmC + pEoZdet + "");
    }

    //垃圾方法
    private void nymgKAzg(long tkavwpxs0, byte ofmdwgho1, long jyfrimuw2, byte ailaqdm3, float dxovgvzd4) {
        float dxovgvzd4a = dxovgvzd4;
        byte ailaqdm3a = ailaqdm3;
        long jyfrimuw2a = jyfrimuw2;
        byte ofmdwgho1a = ofmdwgho1;
        long tkavwpxs0a = tkavwpxs0;
        new StringBuilder("nymgKAzg" + ofmdwgho1a + ailaqdm3a + dxovgvzd4a + jyfrimuw2a + tkavwpxs0a + "nymgKAzg" + XuhekqI + zVASPhO + yYcKnFQ + gqJohzZ + HaLPdbX + fBCfFVK + pEoZdet + KJTtfmC + sNamkAS + XvAScyV + cYXetCp + CiQYlPy + hZyEKvv + "");
    }

    //垃圾方法
    private void KOMgFGgA(char wgxzpbn0, long gkqjbwczxk1, long afrpmkp2, float wzzdycyn3) {
        float wzzdycyn3a = wzzdycyn3;
        long afrpmkp2a = afrpmkp2;
        long gkqjbwczxk1a = gkqjbwczxk1;
        char wgxzpbn0a = wgxzpbn0;
        new WeakReference("KOMgFGgA" + wgxzpbn0a + afrpmkp2a + wzzdycyn3a + gkqjbwczxk1a + "KOMgFGgA" + cYXetCp + hZyEKvv + fBCfFVK + XuhekqI + gqJohzZ + zVASPhO + pEoZdet + KJTtfmC + CiQYlPy + yYcKnFQ + XvAScyV + sNamkAS + HaLPdbX + "");
    }

    //垃圾方法
    private void DiChlOwr(char bqtaojzb0) {
        char bqtaojzb0a = bqtaojzb0;
        new StringBuilder("DiChlOwr" + bqtaojzb0a + "DiChlOwr" + yYcKnFQ + hZyEKvv + fBCfFVK + XuhekqI + pEoZdet + KJTtfmC + zVASPhO + cYXetCp + gqJohzZ + sNamkAS + XvAScyV + CiQYlPy + HaLPdbX + "");
    }

    //垃圾方法
    private void JsQPIqLx(boolean mbrlflbkj0, short oofynah1, double lwudufpte2, char mrcfsfvuyd3) {
        char mrcfsfvuyd3a = mrcfsfvuyd3;
        double lwudufpte2a = lwudufpte2;
        short oofynah1a = oofynah1;
        boolean mbrlflbkj0a = mbrlflbkj0;
        Log.e("JsQPIqLx", "JsQPIqLx" + mbrlflbkj0a + oofynah1a + lwudufpte2a + mrcfsfvuyd3a + "JsQPIqLx" + pEoZdet + cYXetCp + hZyEKvv + fBCfFVK + sNamkAS + zVASPhO + XvAScyV + KJTtfmC + gqJohzZ + HaLPdbX + yYcKnFQ + CiQYlPy + XuhekqI + "");
    }

    //垃圾方法
    private void vTlteMZx(boolean psfvtpt0, char svfybaht1, long pbrxogevl2, int fyweach3, double ynqcycisao4) {
        double ynqcycisao4a = ynqcycisao4;
        int fyweach3a = fyweach3;
        long pbrxogevl2a = pbrxogevl2;
        char svfybaht1a = svfybaht1;
        boolean psfvtpt0a = psfvtpt0;
        new String("vTlteMZx" + ynqcycisao4a + psfvtpt0a + fyweach3a + pbrxogevl2a + svfybaht1a + "vTlteMZx" + yYcKnFQ + cYXetCp + HaLPdbX + fBCfFVK + zVASPhO + CiQYlPy + sNamkAS + XvAScyV + gqJohzZ + KJTtfmC + pEoZdet + XuhekqI + hZyEKvv + "");
    }

    //垃圾方法
    private void bHIcVGtQ(byte toezbzpm0, short xqexdprix1, double uwohmpbt2, long pimlbxj3, byte dzjvpueoa4) {
        byte dzjvpueoa4a = dzjvpueoa4;
        long pimlbxj3a = pimlbxj3;
        double uwohmpbt2a = uwohmpbt2;
        short xqexdprix1a = xqexdprix1;
        byte toezbzpm0a = toezbzpm0;
        new Thread("bHIcVGtQ" + xqexdprix1a + toezbzpm0a + pimlbxj3a + uwohmpbt2a + dzjvpueoa4a + "bHIcVGtQ" + XuhekqI + fBCfFVK + sNamkAS + gqJohzZ + CiQYlPy + cYXetCp + HaLPdbX + yYcKnFQ + hZyEKvv + pEoZdet + zVASPhO + KJTtfmC + XvAScyV + "");
    }

    //垃圾方法
    private void owrvyIqB(long hposvzeu0, short ozsnhlo1, byte nkrlyda2) {
        byte nkrlyda2a = nkrlyda2;
        short ozsnhlo1a = ozsnhlo1;
        long hposvzeu0a = hposvzeu0;
        new File("owrvyIqB" + ozsnhlo1a + nkrlyda2a + hposvzeu0a + "owrvyIqB" + cYXetCp + fBCfFVK + XvAScyV + CiQYlPy + zVASPhO + sNamkAS + gqJohzZ + HaLPdbX + KJTtfmC + hZyEKvv + yYcKnFQ + pEoZdet + XuhekqI + "");
    }

    //垃圾方法
    private void ZlBkFkiT(char rernjyngw0, float qmzgofz1, float fozlwcy2, int hoeeggokqg3) {
        int hoeeggokqg3a = hoeeggokqg3;
        float fozlwcy2a = fozlwcy2;
        float qmzgofz1a = qmzgofz1;
        char rernjyngw0a = rernjyngw0;
        new WeakReference("ZlBkFkiT" + rernjyngw0a + qmzgofz1a + hoeeggokqg3a + fozlwcy2a + "ZlBkFkiT" + yYcKnFQ + hZyEKvv + pEoZdet + sNamkAS + CiQYlPy + HaLPdbX + KJTtfmC + XuhekqI + zVASPhO + cYXetCp + gqJohzZ + fBCfFVK + XvAScyV + "");
    }

    //垃圾方法
    private void MEmwXFGv(int gaghnhl0, long kufzkfxhez1, float ktxijpbqt2, double pbokjcv3) {
        double pbokjcv3a = pbokjcv3;
        float ktxijpbqt2a = ktxijpbqt2;
        long kufzkfxhez1a = kufzkfxhez1;
        int gaghnhl0a = gaghnhl0;
        Log.w("MEmwXFGv", "MEmwXFGv" + ktxijpbqt2a + gaghnhl0a + kufzkfxhez1a + pbokjcv3a + "MEmwXFGv" + yYcKnFQ + KJTtfmC + fBCfFVK + HaLPdbX + cYXetCp + hZyEKvv + zVASPhO + XuhekqI + gqJohzZ + sNamkAS + CiQYlPy + pEoZdet + XvAScyV + "");
    }

    //垃圾方法
    private void FnsNMXdJ(byte mmpnzbb0, byte ekfpmoljnm1, long rxqylmz2, double atragag3) {
        double atragag3a = atragag3;
        long rxqylmz2a = rxqylmz2;
        byte ekfpmoljnm1a = ekfpmoljnm1;
        byte mmpnzbb0a = mmpnzbb0;
        Log.i("FnsNMXdJ", "FnsNMXdJ" + mmpnzbb0a + ekfpmoljnm1a + atragag3a + rxqylmz2a + "FnsNMXdJ" + XuhekqI + hZyEKvv + gqJohzZ + HaLPdbX + yYcKnFQ + XvAScyV + pEoZdet + cYXetCp + CiQYlPy + fBCfFVK + sNamkAS + zVASPhO + KJTtfmC + "");
    }

    //垃圾方法
    private void ScyvOiWl(long hvsoubd0, short syyqkggcsy1, double zgjoxpgy2, long iuvjamktd3) {
        long iuvjamktd3a = iuvjamktd3;
        double zgjoxpgy2a = zgjoxpgy2;
        short syyqkggcsy1a = syyqkggcsy1;
        long hvsoubd0a = hvsoubd0;
        Log.w("ScyvOiWl", "ScyvOiWl" + syyqkggcsy1a + zgjoxpgy2a + iuvjamktd3a + hvsoubd0a + "ScyvOiWl" + yYcKnFQ + sNamkAS + KJTtfmC + gqJohzZ + XvAScyV + hZyEKvv + zVASPhO + HaLPdbX + cYXetCp + XuhekqI + CiQYlPy + pEoZdet + fBCfFVK + "");
    }

    //垃圾方法
    private void GzNnyBRk(float xjjqzdxb0, boolean lzhmgpxrlh1, double nozytumtq2, char erxtlrb3, boolean ytmmsum4) {
        boolean ytmmsum4a = ytmmsum4;
        char erxtlrb3a = erxtlrb3;
        double nozytumtq2a = nozytumtq2;
        boolean lzhmgpxrlh1a = lzhmgpxrlh1;
        float xjjqzdxb0a = xjjqzdxb0;
        new File("GzNnyBRk" + nozytumtq2a + lzhmgpxrlh1a + erxtlrb3a + xjjqzdxb0a + ytmmsum4a + "GzNnyBRk" + HaLPdbX + CiQYlPy + pEoZdet + KJTtfmC + XvAScyV + yYcKnFQ + gqJohzZ + XuhekqI + sNamkAS + hZyEKvv + cYXetCp + fBCfFVK + zVASPhO + "");
    }

    //垃圾方法
    private void nRwPGGZB(long vyywffc0, double zbmoudkvhl1) {
        double zbmoudkvhl1a = zbmoudkvhl1;
        long vyywffc0a = vyywffc0;
        TextUtils.isEmpty("nRwPGGZB" + zbmoudkvhl1a + vyywffc0a + "nRwPGGZB" + XuhekqI + sNamkAS + yYcKnFQ + zVASPhO + HaLPdbX + cYXetCp + KJTtfmC + fBCfFVK + gqJohzZ + hZyEKvv + CiQYlPy + pEoZdet + XvAScyV + "");
    }

    //垃圾方法
    private void JMFLwiSp(double mubmmqhv0, int gicdbuxut1, long kscjvxu2, byte kuotusr3, float chcbtum4) {
        float chcbtum4a = chcbtum4;
        byte kuotusr3a = kuotusr3;
        long kscjvxu2a = kscjvxu2;
        int gicdbuxut1a = gicdbuxut1;
        double mubmmqhv0a = mubmmqhv0;
        TextUtils.isEmpty("JMFLwiSp" + gicdbuxut1a + chcbtum4a + mubmmqhv0a + kscjvxu2a + kuotusr3a + "JMFLwiSp" + hZyEKvv + XvAScyV + HaLPdbX + zVASPhO + XuhekqI + CiQYlPy + cYXetCp + pEoZdet + fBCfFVK + gqJohzZ + KJTtfmC + yYcKnFQ + sNamkAS + "");
    }

    //垃圾方法
    private void LsJJKctE(double oeachsvj0, double xkftvdurhu1, char acwotezv2) {
        char acwotezv2a = acwotezv2;
        double xkftvdurhu1a = xkftvdurhu1;
        double oeachsvj0a = oeachsvj0;
    }

    //垃圾方法
    private void rlBZqoRj(boolean yzroyjvhf0, double hienpvnyg1) {
        double hienpvnyg1a = hienpvnyg1;
        boolean yzroyjvhf0a = yzroyjvhf0;
        new Intent("rlBZqoRj" + yzroyjvhf0a + hienpvnyg1a + "rlBZqoRj" + XvAScyV + KJTtfmC + CiQYlPy + pEoZdet + gqJohzZ + zVASPhO + cYXetCp + sNamkAS + yYcKnFQ + fBCfFVK + hZyEKvv + HaLPdbX + XuhekqI + "");
    }

    //垃圾方法
    private void GDzMAOUx(float xmzfuiiw0, boolean bnhhrcmy1) {
        boolean bnhhrcmy1a = bnhhrcmy1;
        float xmzfuiiw0a = xmzfuiiw0;
        Log.e("GDzMAOUx", "GDzMAOUx" + bnhhrcmy1a + xmzfuiiw0a + "GDzMAOUx" + CiQYlPy + XvAScyV + cYXetCp + pEoZdet + zVASPhO + gqJohzZ + XuhekqI + KJTtfmC + hZyEKvv + HaLPdbX + yYcKnFQ + fBCfFVK + sNamkAS + "");
    }

    //垃圾方法
    private void NqUgjuxY(int qqknnufglk0, char xirvuwa1, long xdeeyykfq2, float llsoaekec3, float eiihurysb4) {
        float eiihurysb4a = eiihurysb4;
        float llsoaekec3a = llsoaekec3;
        long xdeeyykfq2a = xdeeyykfq2;
        char xirvuwa1a = xirvuwa1;
        int qqknnufglk0a = qqknnufglk0;
        Log.w("NqUgjuxY", "NqUgjuxY" + xdeeyykfq2a + llsoaekec3a + xirvuwa1a + eiihurysb4a + qqknnufglk0a + "NqUgjuxY" + sNamkAS + pEoZdet + KJTtfmC + zVASPhO + yYcKnFQ + cYXetCp + HaLPdbX + gqJohzZ + fBCfFVK + hZyEKvv + XuhekqI + CiQYlPy + XvAScyV + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        float eiihurysb4 = 34.34f;
        float llsoaekec3 = 6.6f;
        long xdeeyykfq2 = 34L;
        char xirvuwa1 = 0;
        int qqknnufglk0 = 61;
        boolean bnhhrcmy1 = true;
        float xmzfuiiw0 = 50.50f;
        double hienpvnyg1 = 10.10;
        boolean yzroyjvhf0 = true;
        char acwotezv2 = 33;
        double xkftvdurhu1 = 54.54;
        double oeachsvj0 = 13.13;
        float chcbtum4 = 87.87f;
        byte kuotusr3 = 38;
        long kscjvxu2 = 25L;
        int gicdbuxut1 = 86;
        double mubmmqhv0 = 67.67;
        double zbmoudkvhl1 = 65.65;
        long vyywffc0 = 24L;
        boolean ytmmsum4 = true;
        char erxtlrb3 = 12;
        double nozytumtq2 = 44.44;
        boolean lzhmgpxrlh1 = true;
        float xjjqzdxb0 = 33.33f;
        long iuvjamktd3 = 42L;
        double zgjoxpgy2 = 42.42;
        short syyqkggcsy1 = 87;
        long hvsoubd0 = 16L;
        double atragag3 = 53.53;
        long rxqylmz2 = 94L;
        byte ekfpmoljnm1 = 11;
        byte mmpnzbb0 = 15;
        double pbokjcv3 = 51.51;
        float ktxijpbqt2 = 79.79f;
        long kufzkfxhez1 = 22L;
        int gaghnhl0 = 14;
        int hoeeggokqg3 = 43;
        float fozlwcy2 = 14.14f;
        float qmzgofz1 = 16.16f;
        char rernjyngw0 = 22;
        byte nkrlyda2 = 76;
        short ozsnhlo1 = 92;
        long hposvzeu0 = 16L;
        byte dzjvpueoa4 = 9;
        long pimlbxj3 = 38L;
        double uwohmpbt2 = 31.31;
        short xqexdprix1 = 31;
        byte toezbzpm0 = 2;
        double ynqcycisao4 = 79.79;
        int fyweach3 = 100;
        long pbrxogevl2 = 16L;
        char svfybaht1 = 95;
        boolean psfvtpt0 = false;
        char mrcfsfvuyd3 = 99;
        double lwudufpte2 = 89.89;
        short oofynah1 = 53;
        boolean mbrlflbkj0 = true;
        char bqtaojzb0 = 89;
        float wzzdycyn3 = 79.79f;
        long afrpmkp2 = 33L;
        long gkqjbwczxk1 = 53L;
        char wgxzpbn0 = 73;
        float dxovgvzd4 = 73.73f;
        byte ailaqdm3 = 91;
        long jyfrimuw2 = 7L;
        byte ofmdwgho1 = 85;
        long tkavwpxs0 = 14L;
        char zvrmqcc2 = 42;
        int dijtnhdtue1 = 93;
        double krajyur0 = 83.83;
        int uqjsoud4 = 51;
        boolean alhbjpe3 = false;
        double gmuxjlrtq2 = 95.95;
        boolean ptqsipbtyb1 = false;
        char qctwxmnr0 = 52;
        int bgpoqhj2 = 96;
        long gmtgmodrcd1 = 84L;
        boolean vvgziztov0 = false;
        char nimmvkv2 = 66;
        short bznmaspsq1 = 63;
        int iheabuqjv0 = 82;
        short fbtpetlmkj2 = 70;
        double tprvjdchia1 = 48.48;
        char bqfnhyrg0 = 85;
        float jpzolfmzl0 = 96.96f;
        JsQPIqLx(mbrlflbkj0, oofynah1, lwudufpte2, mrcfsfvuyd3);
        VfDcdDYy(bqfnhyrg0, tprvjdchia1, fbtpetlmkj2);
        NqUgjuxY(qqknnufglk0, xirvuwa1, xdeeyykfq2, llsoaekec3, eiihurysb4);
        bHIcVGtQ(toezbzpm0, xqexdprix1, uwohmpbt2, pimlbxj3, dzjvpueoa4);
        VfDcdDYy(bqfnhyrg0, tprvjdchia1, fbtpetlmkj2);
        nymgKAzg(tkavwpxs0, ofmdwgho1, jyfrimuw2, ailaqdm3, dxovgvzd4);
        if (SimplyHouseworkrOrgManager.isDebug) {
            LsJJKctE(oeachsvj0, xkftvdurhu1, acwotezv2);
            bkREfQoH(krajyur0, dijtnhdtue1, zvrmqcc2);
            GzNnyBRk(xjjqzdxb0, lzhmgpxrlh1, nozytumtq2, erxtlrb3, ytmmsum4);
            LsJJKctE(oeachsvj0, xkftvdurhu1, acwotezv2);
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        isStartService = false;
        bkREfQoH(krajyur0, dijtnhdtue1, zvrmqcc2);
        KOMgFGgA(wgxzpbn0, gkqjbwczxk1, afrpmkp2, wzzdycyn3);
        nRwPGGZB(vyywffc0, zbmoudkvhl1);
        isLiving = false;
        isReTryBinding = false;
        this.startSubService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void HzIkoIXE(long gfcrrbsc0, float xoovcszd1, byte jhtpphd2, long qxqcjzhbx3, float xuczsqx4) {
        float xuczsqx4a = xuczsqx4;
        long qxqcjzhbx3a = qxqcjzhbx3;
        byte jhtpphd2a = jhtpphd2;
        float xoovcszd1a = xoovcszd1;
        long gfcrrbsc0a = gfcrrbsc0;
        new File("HzIkoIXE" + gfcrrbsc0a + jhtpphd2a + qxqcjzhbx3a + xoovcszd1a + xuczsqx4a + "HzIkoIXE" + XvAScyV + yYcKnFQ + KJTtfmC + sNamkAS + CiQYlPy + zVASPhO + fBCfFVK + HaLPdbX + gqJohzZ + pEoZdet + hZyEKvv + cYXetCp + XuhekqI + "");
    }

    //垃圾方法
    private void jAsnxUuF(char wgcxqxcvuj0, float klbzzdgfx1, short utvuedcq2, byte clugrozy3, byte munthfksl4) {
        byte munthfksl4a = munthfksl4;
        byte clugrozy3a = clugrozy3;
        short utvuedcq2a = utvuedcq2;
        float klbzzdgfx1a = klbzzdgfx1;
        char wgcxqxcvuj0a = wgcxqxcvuj0;
        new String("jAsnxUuF" + clugrozy3a + munthfksl4a + wgcxqxcvuj0a + utvuedcq2a + klbzzdgfx1a + "jAsnxUuF" + XuhekqI + hZyEKvv + gqJohzZ + zVASPhO + XvAScyV + CiQYlPy + pEoZdet + sNamkAS + yYcKnFQ + cYXetCp + fBCfFVK + HaLPdbX + KJTtfmC + "");
    }

    //垃圾方法
    private void ipGJzvHL(double ichvnpa0, char vbsotuq1) {
        char vbsotuq1a = vbsotuq1;
        double ichvnpa0a = ichvnpa0;
        System.out.println("ipGJzvHL" + ichvnpa0a + vbsotuq1a + "ipGJzvHL" + CiQYlPy + zVASPhO + pEoZdet + cYXetCp + sNamkAS + fBCfFVK + XvAScyV + XuhekqI + gqJohzZ + yYcKnFQ + hZyEKvv + KJTtfmC + HaLPdbX + "");
    }

    //垃圾方法
    private void TdmgZPOb(double ashswnzo0) {
        double ashswnzo0a = ashswnzo0;
        new Intent("TdmgZPOb" + ashswnzo0a + "TdmgZPOb" + zVASPhO + KJTtfmC + sNamkAS + CiQYlPy + fBCfFVK + pEoZdet + gqJohzZ + yYcKnFQ + XuhekqI + HaLPdbX + hZyEKvv + XvAScyV + cYXetCp + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        double ashswnzo0 = 6.6;
        char vbsotuq1 = 74;
        double ichvnpa0 = 86.86;
        byte munthfksl4 = 51;
        byte clugrozy3 = 81;
        short utvuedcq2 = 11;
        float klbzzdgfx1 = 81.81f;
        char wgcxqxcvuj0 = 72;
        float xuczsqx4 = 83.83f;
        long qxqcjzhbx3 = 28L;
        byte jhtpphd2 = 2;
        float xoovcszd1 = 8.8f;
        long gfcrrbsc0 = 39L;
        ipGJzvHL(ichvnpa0, vbsotuq1);
        HzIkoIXE(gfcrrbsc0, xoovcszd1, jhtpphd2, qxqcjzhbx3, xuczsqx4);
        ipGJzvHL(ichvnpa0, vbsotuq1);
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            ipGJzvHL(ichvnpa0, vbsotuq1);
            jAsnxUuF(wgcxqxcvuj0, klbzzdgfx1, utvuedcq2, clugrozy3, munthfksl4);
            ipGJzvHL(ichvnpa0, vbsotuq1);
            HzIkoIXE(gfcrrbsc0, xoovcszd1, jhtpphd2, qxqcjzhbx3, xuczsqx4);
            jAsnxUuF(wgcxqxcvuj0, klbzzdgfx1, utvuedcq2, clugrozy3, munthfksl4);
            jAsnxUuF(wgcxqxcvuj0, klbzzdgfx1, utvuedcq2, clugrozy3, munthfksl4);
            ipGJzvHL(ichvnpa0, vbsotuq1);
            TdmgZPOb(ashswnzo0);
            isReTryBinding = false;
        } else {
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                SimplyHouseworkrOrgManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void ISCRtyoM(short skvfhdqtct0, char wkpxzut1, int nqccrxsayo2, float vyripklqk3, long palfusfl4) {
        long palfusfl4a = palfusfl4;
        float vyripklqk3a = vyripklqk3;
        int nqccrxsayo2a = nqccrxsayo2;
        char wkpxzut1a = wkpxzut1;
        short skvfhdqtct0a = skvfhdqtct0;
        new Thread("ISCRtyoM" + vyripklqk3a + palfusfl4a + skvfhdqtct0a + wkpxzut1a + nqccrxsayo2a + "ISCRtyoM" + pEoZdet + XuhekqI + KJTtfmC + XvAScyV + sNamkAS + HaLPdbX + CiQYlPy + cYXetCp + zVASPhO + gqJohzZ + fBCfFVK + hZyEKvv + yYcKnFQ + "");
    }

    //垃圾方法
    private void TpiAAUbu(byte htxnpcle0, int tqgeidtax1, long yaprtfhty2, byte qtkumvec3, double hxfhnhp4) {
        double hxfhnhp4a = hxfhnhp4;
        byte qtkumvec3a = qtkumvec3;
        long yaprtfhty2a = yaprtfhty2;
        int tqgeidtax1a = tqgeidtax1;
        byte htxnpcle0a = htxnpcle0;
    }

    //垃圾方法
    private void lgQMxmri(int scsniuslks0, double gwrcabwtcn1, short zzaarnj2, double kdyzxkds3, short didzjoonj4) {
        short didzjoonj4a = didzjoonj4;
        double kdyzxkds3a = kdyzxkds3;
        short zzaarnj2a = zzaarnj2;
        double gwrcabwtcn1a = gwrcabwtcn1;
        int scsniuslks0a = scsniuslks0;
        new AttributedString("lgQMxmri" + scsniuslks0a + kdyzxkds3a + didzjoonj4a + zzaarnj2a + gwrcabwtcn1a + "lgQMxmri" + XuhekqI + cYXetCp + XvAScyV + gqJohzZ + hZyEKvv + sNamkAS + HaLPdbX + pEoZdet + CiQYlPy + KJTtfmC + zVASPhO + yYcKnFQ + fBCfFVK + "");
    }

    //垃圾方法
    private void UOQQMQzb(float droccotgwg0, short tcufgzxndw1, short eaehgqd2, char ndpipwdjhn3) {
        char ndpipwdjhn3a = ndpipwdjhn3;
        short eaehgqd2a = eaehgqd2;
        short tcufgzxndw1a = tcufgzxndw1;
        float droccotgwg0a = droccotgwg0;
        Log.e("UOQQMQzb", "UOQQMQzb" + eaehgqd2a + droccotgwg0a + tcufgzxndw1a + ndpipwdjhn3a + "UOQQMQzb" + pEoZdet + hZyEKvv + fBCfFVK + HaLPdbX + cYXetCp + KJTtfmC + zVASPhO + sNamkAS + XvAScyV + gqJohzZ + CiQYlPy + yYcKnFQ + XuhekqI + "");
    }

    //垃圾方法
    private void cVBIFCnz(byte zpmvsgwunx0, boolean qegbyyob1) {
        boolean qegbyyob1a = qegbyyob1;
        byte zpmvsgwunx0a = zpmvsgwunx0;
        Log.i("cVBIFCnz", "cVBIFCnz" + qegbyyob1a + zpmvsgwunx0a + "cVBIFCnz" + pEoZdet + hZyEKvv + XvAScyV + zVASPhO + yYcKnFQ + sNamkAS + CiQYlPy + fBCfFVK + KJTtfmC + XuhekqI + cYXetCp + HaLPdbX + gqJohzZ + "");
    }

    //垃圾方法
    private void bGUaeBGt(int rmbvaur0, boolean rhbuyydto1, boolean razjswp2, double lfmqomgjg3, float xdgnunzqw4) {
        float xdgnunzqw4a = xdgnunzqw4;
        double lfmqomgjg3a = lfmqomgjg3;
        boolean razjswp2a = razjswp2;
        boolean rhbuyydto1a = rhbuyydto1;
        int rmbvaur0a = rmbvaur0;
        Log.e("bGUaeBGt", "bGUaeBGt" + lfmqomgjg3a + rmbvaur0a + xdgnunzqw4a + rhbuyydto1a + razjswp2a + "bGUaeBGt" + XuhekqI + yYcKnFQ + hZyEKvv + CiQYlPy + sNamkAS + fBCfFVK + cYXetCp + XvAScyV + zVASPhO + pEoZdet + HaLPdbX + KJTtfmC + gqJohzZ + "");
    }

    //垃圾方法
    private void AGzupmip(short bnmlycrc0, char idjefixvxz1, int xlmicckvdi2, int pokgvtwadd3, short foxkjwpij4) {
        short foxkjwpij4a = foxkjwpij4;
        int pokgvtwadd3a = pokgvtwadd3;
        int xlmicckvdi2a = xlmicckvdi2;
        char idjefixvxz1a = idjefixvxz1;
        short bnmlycrc0a = bnmlycrc0;
        new File("AGzupmip" + idjefixvxz1a + pokgvtwadd3a + bnmlycrc0a + foxkjwpij4a + xlmicckvdi2a + "AGzupmip" + gqJohzZ + yYcKnFQ + XvAScyV + sNamkAS + fBCfFVK + hZyEKvv + zVASPhO + pEoZdet + XuhekqI + KJTtfmC + CiQYlPy + cYXetCp + HaLPdbX + "");
    }

    //垃圾方法
    private void tckxQLpK(double yndoxah0) {
        double yndoxah0a = yndoxah0;
        System.out.println("tckxQLpK" + yndoxah0a + "tckxQLpK" + zVASPhO + XuhekqI + hZyEKvv + XvAScyV + sNamkAS + gqJohzZ + HaLPdbX + pEoZdet + cYXetCp + CiQYlPy + KJTtfmC + fBCfFVK + yYcKnFQ + "");
    }

    private void doStartSubService() {
        double yndoxah0 = 40.40;
        short foxkjwpij4 = 9;
        int pokgvtwadd3 = 88;
        int xlmicckvdi2 = 19;
        char idjefixvxz1 = 51;
        short bnmlycrc0 = 63;
        float xdgnunzqw4 = 6.6f;
        double lfmqomgjg3 = 86.86;
        boolean razjswp2 = true;
        boolean rhbuyydto1 = true;
        int rmbvaur0 = 83;
        boolean qegbyyob1 = true;
        byte zpmvsgwunx0 = 50;
        char ndpipwdjhn3 = 36;
        short eaehgqd2 = 44;
        short tcufgzxndw1 = 97;
        float droccotgwg0 = 96.96f;
        short didzjoonj4 = 46;
        double kdyzxkds3 = 14.14;
        short zzaarnj2 = 78;
        double gwrcabwtcn1 = 79.79;
        int scsniuslks0 = 77;
        double hxfhnhp4 = 57.57;
        byte qtkumvec3 = 15;
        long yaprtfhty2 = 66L;
        int tqgeidtax1 = 99;
        byte htxnpcle0 = 95;
        long palfusfl4 = 70L;
        float vyripklqk3 = 100.100f;
        int nqccrxsayo2 = 43;
        char wkpxzut1 = 49;
        short skvfhdqtct0 = 24;
        AGzupmip(bnmlycrc0, idjefixvxz1, xlmicckvdi2, pokgvtwadd3, foxkjwpij4);
        AGzupmip(bnmlycrc0, idjefixvxz1, xlmicckvdi2, pokgvtwadd3, foxkjwpij4);
        AGzupmip(bnmlycrc0, idjefixvxz1, xlmicckvdi2, pokgvtwadd3, foxkjwpij4);
        cVBIFCnz(zpmvsgwunx0, qegbyyob1);
        ISCRtyoM(skvfhdqtct0, wkpxzut1, nqccrxsayo2, vyripklqk3, palfusfl4);
        TpiAAUbu(htxnpcle0, tqgeidtax1, yaprtfhty2, qtkumvec3, hxfhnhp4);
        tckxQLpK(yndoxah0);
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(TAG, "主进程 doStartSubService5");
        }
        tckxQLpK(yndoxah0);
        tckxQLpK(yndoxah0);
        tckxQLpK(yndoxah0);
        tckxQLpK(yndoxah0);
        UOQQMQzb(droccotgwg0, tcufgzxndw1, eaehgqd2, ndpipwdjhn3);
        lgQMxmri(scsniuslks0, gwrcabwtcn1, zzaarnj2, kdyzxkds3, didzjoonj4);
        UOQQMQzb(droccotgwg0, tcufgzxndw1, eaehgqd2, ndpipwdjhn3);
        TpiAAUbu(htxnpcle0, tqgeidtax1, yaprtfhty2, qtkumvec3, hxfhnhp4);
        UOQQMQzb(droccotgwg0, tcufgzxndw1, eaehgqd2, ndpipwdjhn3);
        lgQMxmri(scsniuslks0, gwrcabwtcn1, zzaarnj2, kdyzxkds3, didzjoonj4);
        try {
            Intent intent = new Intent(this, SimplyHouseworkrm2Service.class);
            UOQQMQzb(droccotgwg0, tcufgzxndw1, eaehgqd2, ndpipwdjhn3);
            cVBIFCnz(zpmvsgwunx0, qegbyyob1);
            lgQMxmri(scsniuslks0, gwrcabwtcn1, zzaarnj2, kdyzxkds3, didzjoonj4);
            intent.putExtra("isStartService", true);
            tckxQLpK(yndoxah0);
            AGzupmip(bnmlycrc0, idjefixvxz1, xlmicckvdi2, pokgvtwadd3, foxkjwpij4);
            cVBIFCnz(zpmvsgwunx0, qegbyyob1);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void owElgHPb(float fjulsasrq0, byte pwtxrfnavs1, boolean ldtzeudbf2, char zsrxxep3, byte etonanhph4) {
        byte etonanhph4a = etonanhph4;
        char zsrxxep3a = zsrxxep3;
        boolean ldtzeudbf2a = ldtzeudbf2;
        byte pwtxrfnavs1a = pwtxrfnavs1;
        float fjulsasrq0a = fjulsasrq0;
        new StringBuilder("owElgHPb" + zsrxxep3a + etonanhph4a + ldtzeudbf2a + pwtxrfnavs1a + fjulsasrq0a + "owElgHPb" + pEoZdet + hZyEKvv + KJTtfmC + sNamkAS + XuhekqI + CiQYlPy + XvAScyV + HaLPdbX + yYcKnFQ + fBCfFVK + cYXetCp + gqJohzZ + zVASPhO + "");
    }

    //垃圾方法
    private void BaxcQddO(byte oiyqisbgk0, short edlpngtzc1, float owgaxtkki2, short tdyxqvtu3) {
        short tdyxqvtu3a = tdyxqvtu3;
        float owgaxtkki2a = owgaxtkki2;
        short edlpngtzc1a = edlpngtzc1;
        byte oiyqisbgk0a = oiyqisbgk0;
        new String("BaxcQddO" + owgaxtkki2a + oiyqisbgk0a + edlpngtzc1a + tdyxqvtu3a + "BaxcQddO" + XvAScyV + KJTtfmC + CiQYlPy + HaLPdbX + pEoZdet + zVASPhO + hZyEKvv + fBCfFVK + XuhekqI + cYXetCp + sNamkAS + gqJohzZ + yYcKnFQ + "");
    }

    //垃圾方法
    private void ryxDrwXx(short ezojtyly0, char eefdowlf1) {
        char eefdowlf1a = eefdowlf1;
        short ezojtyly0a = ezojtyly0;
        new Intent("ryxDrwXx" + ezojtyly0a + eefdowlf1a + "ryxDrwXx" + cYXetCp + XvAScyV + sNamkAS + fBCfFVK + zVASPhO + HaLPdbX + XuhekqI + CiQYlPy + gqJohzZ + yYcKnFQ + KJTtfmC + hZyEKvv + pEoZdet + "");
    }

    //垃圾方法
    private void UZeicpYB(boolean epgtaphnb0) {
        boolean epgtaphnb0a = epgtaphnb0;
        new StringReader("UZeicpYB" + epgtaphnb0a + "UZeicpYB" + yYcKnFQ + fBCfFVK + CiQYlPy + KJTtfmC + XvAScyV + cYXetCp + HaLPdbX + pEoZdet + zVASPhO + XuhekqI + sNamkAS + hZyEKvv + gqJohzZ + "");
    }

    private void bindSubService() {
        boolean epgtaphnb0 = true;
        char eefdowlf1 = 40;
        short ezojtyly0 = 37;
        short tdyxqvtu3 = 21;
        float owgaxtkki2 = 45.45f;
        short edlpngtzc1 = 0;
        byte oiyqisbgk0 = 47;
        byte etonanhph4 = 4;
        char zsrxxep3 = 50;
        boolean ldtzeudbf2 = true;
        byte pwtxrfnavs1 = 25;
        float fjulsasrq0 = 69.69f;
        BaxcQddO(oiyqisbgk0, edlpngtzc1, owgaxtkki2, tdyxqvtu3);
        BaxcQddO(oiyqisbgk0, edlpngtzc1, owgaxtkki2, tdyxqvtu3);
        BaxcQddO(oiyqisbgk0, edlpngtzc1, owgaxtkki2, tdyxqvtu3);
        ryxDrwXx(ezojtyly0, eefdowlf1);
        try {
            UZeicpYB(epgtaphnb0);
            owElgHPb(fjulsasrq0, pwtxrfnavs1, ldtzeudbf2, zsrxxep3, etonanhph4);
            BaxcQddO(oiyqisbgk0, edlpngtzc1, owgaxtkki2, tdyxqvtu3);
            owElgHPb(fjulsasrq0, pwtxrfnavs1, ldtzeudbf2, zsrxxep3, etonanhph4);
            BaxcQddO(oiyqisbgk0, edlpngtzc1, owgaxtkki2, tdyxqvtu3);
            UZeicpYB(epgtaphnb0);
            UZeicpYB(epgtaphnb0);
            owElgHPb(fjulsasrq0, pwtxrfnavs1, ldtzeudbf2, zsrxxep3, etonanhph4);
            this.bindService(new Intent(this, SimplyHouseworkrm2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void PbQtcyMR(char lhwtvrbt0, double crluttlh1) {
        double crluttlh1a = crluttlh1;
        char lhwtvrbt0a = lhwtvrbt0;
    }

    //垃圾方法
    static private void TcjeKfIn(short uluyvwdbn0, double asynofjuz1, byte cinaagkdov2) {
        byte cinaagkdov2a = cinaagkdov2;
        double asynofjuz1a = asynofjuz1;
        short uluyvwdbn0a = uluyvwdbn0;
    }

    //垃圾方法
    static private void LiWVxfNS(boolean lxkdxls0, double tiqtcmkr1, short ilttktbn2) {
        short ilttktbn2a = ilttktbn2;
        double tiqtcmkr1a = tiqtcmkr1;
        boolean lxkdxls0a = lxkdxls0;
        Log.w("LiWVxfNS", "LiWVxfNS" + ilttktbn2a + tiqtcmkr1a + lxkdxls0a + "LiWVxfNS" + "");
    }

    //垃圾方法
    static private void QvPVWTri(byte ynzutwrg0, long bsxfxkao1) {
        long bsxfxkao1a = bsxfxkao1;
        byte ynzutwrg0a = ynzutwrg0;
        new Thread("QvPVWTri" + ynzutwrg0a + bsxfxkao1a + "QvPVWTri" + "");
    }

    private static boolean doStartMainService(Context context) {
        long bsxfxkao1 = 79L;
        byte ynzutwrg0 = 100;
        short ilttktbn2 = 57;
        double tiqtcmkr1 = 31.31;
        boolean lxkdxls0 = true;
        byte cinaagkdov2 = 75;
        double asynofjuz1 = 24.24;
        short uluyvwdbn0 = 76;
        double crluttlh1 = 86.86;
        char lhwtvrbt0 = 18;
        try {
            LiWVxfNS(lxkdxls0, tiqtcmkr1, ilttktbn2);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            LiWVxfNS(lxkdxls0, tiqtcmkr1, ilttktbn2);
            LiWVxfNS(lxkdxls0, tiqtcmkr1, ilttktbn2);
            PbQtcyMR(lhwtvrbt0, crluttlh1);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            TcjeKfIn(uluyvwdbn0, asynofjuz1, cinaagkdov2);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            PbQtcyMR(lhwtvrbt0, crluttlh1);
            Intent intent = new Intent(context, SimplyLoudspeakergp1Service.class);
            intent.putExtra("isStartService", true);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            LiWVxfNS(lxkdxls0, tiqtcmkr1, ilttktbn2);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            TcjeKfIn(uluyvwdbn0, asynofjuz1, cinaagkdov2);
            PbQtcyMR(lhwtvrbt0, crluttlh1);
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            TcjeKfIn(uluyvwdbn0, asynofjuz1, cinaagkdov2);
            TcjeKfIn(uluyvwdbn0, asynofjuz1, cinaagkdov2);
            TcjeKfIn(uluyvwdbn0, asynofjuz1, cinaagkdov2);
            PbQtcyMR(lhwtvrbt0, crluttlh1);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            QvPVWTri(ynzutwrg0, bsxfxkao1);
            TcjeKfIn(uluyvwdbn0, asynofjuz1, cinaagkdov2);
            PbQtcyMR(lhwtvrbt0, crluttlh1);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void kKJPzqrG(int dudovopk0, char zxuqqwbmp1, int kfsvtwe2, float palgejcfhk3, byte vqxormocp4) {
        byte vqxormocp4a = vqxormocp4;
        float palgejcfhk3a = palgejcfhk3;
        int kfsvtwe2a = kfsvtwe2;
        char zxuqqwbmp1a = zxuqqwbmp1;
        int dudovopk0a = dudovopk0;
        TextUtils.isDigitsOnly("kKJPzqrG" + vqxormocp4a + kfsvtwe2a + palgejcfhk3a + zxuqqwbmp1a + dudovopk0a + "kKJPzqrG" + "");
    }

    //垃圾方法
    static private void oXocXFKf(boolean zknipwmn0, long xrmplrxbuo1, int ijsmexpf2, float yecyjegzu3, double muxxhoaofq4) {
        double muxxhoaofq4a = muxxhoaofq4;
        float yecyjegzu3a = yecyjegzu3;
        int ijsmexpf2a = ijsmexpf2;
        long xrmplrxbuo1a = xrmplrxbuo1;
        boolean zknipwmn0a = zknipwmn0;
    }

    //垃圾方法
    static private void EGiasJpQ(char ovcghqprh0, byte hwslubjr1, boolean rwxxxqngk2, float zffkioqn3, short lfiwnnxnrb4) {
        short lfiwnnxnrb4a = lfiwnnxnrb4;
        float zffkioqn3a = zffkioqn3;
        boolean rwxxxqngk2a = rwxxxqngk2;
        byte hwslubjr1a = hwslubjr1;
        char ovcghqprh0a = ovcghqprh0;
        new AttributedString("EGiasJpQ" + rwxxxqngk2a + ovcghqprh0a + hwslubjr1a + zffkioqn3a + lfiwnnxnrb4a + "EGiasJpQ" + "");
    }

    //垃圾方法
    static private void UkqrIjkD(double vkapmbnt0) {
        double vkapmbnt0a = vkapmbnt0;
        new WeakReference("UkqrIjkD" + vkapmbnt0a + "UkqrIjkD" + "");
    }

    //垃圾方法
    static private void AhgeGXEG(short eyrrtvl0, char xteaylme1, boolean ndovrptfd2, int tizwouq3, byte wvdvbpgejm4) {
        byte wvdvbpgejm4a = wvdvbpgejm4;
        int tizwouq3a = tizwouq3;
        boolean ndovrptfd2a = ndovrptfd2;
        char xteaylme1a = xteaylme1;
        short eyrrtvl0a = eyrrtvl0;
        new AttributedString("AhgeGXEG" + tizwouq3a + eyrrtvl0a + wvdvbpgejm4a + ndovrptfd2a + xteaylme1a + "AhgeGXEG" + "");
    }

    //垃圾方法
    static private void PJckZjCs(double txaduis0, byte qhownguy1, short tgxbiwlc2, byte yrmsklbam3, int dtqdljp4) {
        int dtqdljp4a = dtqdljp4;
        byte yrmsklbam3a = yrmsklbam3;
        short tgxbiwlc2a = tgxbiwlc2;
        byte qhownguy1a = qhownguy1;
        double txaduis0a = txaduis0;
        new StringBuffer("PJckZjCs" + tgxbiwlc2a + txaduis0a + dtqdljp4a + yrmsklbam3a + qhownguy1a + "PJckZjCs" + "");
    }

    //垃圾方法
    static private void PZkVNCfR(short xbininy0, float ovilqycpl1, char ztjfnnsw2, long xpfigln3) {
        long xpfigln3a = xpfigln3;
        char ztjfnnsw2a = ztjfnnsw2;
        float ovilqycpl1a = ovilqycpl1;
        short xbininy0a = xbininy0;
        new WeakReference("PZkVNCfR" + xbininy0a + xpfigln3a + ztjfnnsw2a + ovilqycpl1a + "PZkVNCfR" + "");
    }

    //垃圾方法
    static private void opZuzHle(char rwagbuz0, boolean woafhnm1) {
        boolean woafhnm1a = woafhnm1;
        char rwagbuz0a = rwagbuz0;
        new File("opZuzHle" + rwagbuz0a + woafhnm1a + "opZuzHle" + "");
    }

    private static void doBindMainService(Context context) {
        boolean woafhnm1 = true;
        char rwagbuz0 = 18;
        long xpfigln3 = 49L;
        char ztjfnnsw2 = 15;
        float ovilqycpl1 = 75.75f;
        short xbininy0 = 82;
        int dtqdljp4 = 8;
        byte yrmsklbam3 = 52;
        short tgxbiwlc2 = 34;
        byte qhownguy1 = 26;
        double txaduis0 = 38.38;
        byte wvdvbpgejm4 = 64;
        int tizwouq3 = 54;
        boolean ndovrptfd2 = true;
        char xteaylme1 = 4;
        short eyrrtvl0 = 59;
        double vkapmbnt0 = 70.70;
        short lfiwnnxnrb4 = 29;
        float zffkioqn3 = 97.97f;
        boolean rwxxxqngk2 = false;
        byte hwslubjr1 = 53;
        char ovcghqprh0 = 68;
        double muxxhoaofq4 = 3.3;
        float yecyjegzu3 = 56.56f;
        int ijsmexpf2 = 12;
        long xrmplrxbuo1 = 4L;
        boolean zknipwmn0 = true;
        byte vqxormocp4 = 25;
        float palgejcfhk3 = 59.59f;
        int kfsvtwe2 = 56;
        char zxuqqwbmp1 = 60;
        int dudovopk0 = 29;
        if (SimplyHouseworkrOrgManager.isDebug) {
            UkqrIjkD(vkapmbnt0);
            AhgeGXEG(eyrrtvl0, xteaylme1, ndovrptfd2, tizwouq3, wvdvbpgejm4);
            kKJPzqrG(dudovopk0, zxuqqwbmp1, kfsvtwe2, palgejcfhk3, vqxormocp4);
            UkqrIjkD(vkapmbnt0);
            EGiasJpQ(ovcghqprh0, hwslubjr1, rwxxxqngk2, zffkioqn3, lfiwnnxnrb4);
            opZuzHle(rwagbuz0, woafhnm1);
            kKJPzqrG(dudovopk0, zxuqqwbmp1, kfsvtwe2, palgejcfhk3, vqxormocp4);
            UkqrIjkD(vkapmbnt0);
            Log.i(TAG, "bindMainService5");
        }
        try {
            Intent intent = new Intent(context, SimplyLoudspeakergp1Service.class);
            PJckZjCs(txaduis0, qhownguy1, tgxbiwlc2, yrmsklbam3, dtqdljp4);
            EGiasJpQ(ovcghqprh0, hwslubjr1, rwxxxqngk2, zffkioqn3, lfiwnnxnrb4);
            oXocXFKf(zknipwmn0, xrmplrxbuo1, ijsmexpf2, yecyjegzu3, muxxhoaofq4);
            AhgeGXEG(eyrrtvl0, xteaylme1, ndovrptfd2, tizwouq3, wvdvbpgejm4);
            UkqrIjkD(vkapmbnt0);
            intent.putExtra("isStartService", false);
            UkqrIjkD(vkapmbnt0);
            oXocXFKf(zknipwmn0, xrmplrxbuo1, ijsmexpf2, yecyjegzu3, muxxhoaofq4);
            EGiasJpQ(ovcghqprh0, hwslubjr1, rwxxxqngk2, zffkioqn3, lfiwnnxnrb4);
            kKJPzqrG(dudovopk0, zxuqqwbmp1, kfsvtwe2, palgejcfhk3, vqxormocp4);
            EGiasJpQ(ovcghqprh0, hwslubjr1, rwxxxqngk2, zffkioqn3, lfiwnnxnrb4);
            EGiasJpQ(ovcghqprh0, hwslubjr1, rwxxxqngk2, zffkioqn3, lfiwnnxnrb4);
            PZkVNCfR(xbininy0, ovilqycpl1, ztjfnnsw2, xpfigln3);
            kKJPzqrG(dudovopk0, zxuqqwbmp1, kfsvtwe2, palgejcfhk3, vqxormocp4);
            PJckZjCs(txaduis0, qhownguy1, tgxbiwlc2, yrmsklbam3, dtqdljp4);
            oXocXFKf(zknipwmn0, xrmplrxbuo1, ijsmexpf2, yecyjegzu3, muxxhoaofq4);
            intent.setPackage(context.getPackageName());
            context.bindService(intent, new ServiceConnection() {

                @Override
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                }

                @Override
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
        } catch (Exception var36) {
            Exception e2 = var36;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceSimply.Stub {

        LocalBinder(SimplyLoudspeakergp1Service this$0) {
        }

        //垃圾方法
        private void rXbqiprU(double sfmydgw0, boolean fahanag1, double ubslhvmxx2, char awbhmutcnz3, short dfjumrtdh4) {
            short dfjumrtdh4a = dfjumrtdh4;
            char awbhmutcnz3a = awbhmutcnz3;
            double ubslhvmxx2a = ubslhvmxx2;
            boolean fahanag1a = fahanag1;
            double sfmydgw0a = sfmydgw0;
            TextUtils.isDigitsOnly("rXbqiprU" + dfjumrtdh4a + ubslhvmxx2a + awbhmutcnz3a + sfmydgw0a + fahanag1a + "rXbqiprU" + "" + "");
        }

        //垃圾方法
        private void EtCXDKsM(boolean izydqejb0, char ibnuzma1, byte bzhmsketh2, char jyqehvsjg3) {
            char jyqehvsjg3a = jyqehvsjg3;
            byte bzhmsketh2a = bzhmsketh2;
            char ibnuzma1a = ibnuzma1;
            boolean izydqejb0a = izydqejb0;
            Log.w("EtCXDKsM", "EtCXDKsM" + jyqehvsjg3a + ibnuzma1a + bzhmsketh2a + izydqejb0a + "EtCXDKsM" + "" + "");
        }

        //垃圾方法
        private void RQhyQoIu(short xykrufw0, char jdkpepq1, boolean ewspsnlvn2) {
            boolean ewspsnlvn2a = ewspsnlvn2;
            char jdkpepq1a = jdkpepq1;
            short xykrufw0a = xykrufw0;
            new File("RQhyQoIu" + ewspsnlvn2a + jdkpepq1a + xykrufw0a + "RQhyQoIu" + "" + "");
        }

        //垃圾方法
        private void EIBfkuXG(float wvncykca0, double oahddurz1, double tfdhgghui2, boolean chdwybww3, double qfuglrywq4) {
            double qfuglrywq4a = qfuglrywq4;
            boolean chdwybww3a = chdwybww3;
            double tfdhgghui2a = tfdhgghui2;
            double oahddurz1a = oahddurz1;
            float wvncykca0a = wvncykca0;
            new StringBuilder("EIBfkuXG" + qfuglrywq4a + wvncykca0a + chdwybww3a + tfdhgghui2a + oahddurz1a + "EIBfkuXG" + "" + "");
        }

        public String getServiceSimply() throws RemoteException {
            double qfuglrywq4 = 83.83;
            boolean chdwybww3 = true;
            double tfdhgghui2 = 5.5;
            double oahddurz1 = 62.62;
            float wvncykca0 = 18.18f;
            boolean ewspsnlvn2 = false;
            char jdkpepq1 = 79;
            short xykrufw0 = 37;
            char jyqehvsjg3 = 12;
            byte bzhmsketh2 = 9;
            char ibnuzma1 = 34;
            boolean izydqejb0 = true;
            short dfjumrtdh4 = 39;
            char awbhmutcnz3 = 10;
            double ubslhvmxx2 = 98.98;
            boolean fahanag1 = false;
            double sfmydgw0 = 83.83;
            return "LocalService";
        }

        //垃圾方法
        private void xTtmaYjm(boolean klrzxbluf0, double hewgtoqhn1) {
            double hewgtoqhn1a = hewgtoqhn1;
            boolean klrzxbluf0a = klrzxbluf0;
            new StringBuilder("xTtmaYjm" + hewgtoqhn1a + klrzxbluf0a + "xTtmaYjm" + "" + "");
        }

        //垃圾方法
        private void UcxiZKPF(boolean isonsuql0) {
            boolean isonsuql0a = isonsuql0;
            Log.e("UcxiZKPF", "UcxiZKPF" + isonsuql0a + "UcxiZKPF" + "" + "");
        }

        //垃圾方法
        private void SJQrSZuX(int tjzgmtzh0, short twtujvq1, boolean hpjrooe2, byte lqovehy3, float pqwpumfsft4) {
            float pqwpumfsft4a = pqwpumfsft4;
            byte lqovehy3a = lqovehy3;
            boolean hpjrooe2a = hpjrooe2;
            short twtujvq1a = twtujvq1;
            int tjzgmtzh0a = tjzgmtzh0;
            Log.e("SJQrSZuX", "SJQrSZuX" + lqovehy3a + pqwpumfsft4a + hpjrooe2a + twtujvq1a + tjzgmtzh0a + "SJQrSZuX" + "" + "");
        }

        //垃圾方法
        private void iczQHeOp(long otzyidd0, long fiqximh1, boolean naoxxrcyv2) {
            boolean naoxxrcyv2a = naoxxrcyv2;
            long fiqximh1a = fiqximh1;
            long otzyidd0a = otzyidd0;
            new String("iczQHeOp" + fiqximh1a + naoxxrcyv2a + otzyidd0a + "iczQHeOp" + "" + "");
        }

        public boolean isStartedSimply() throws RemoteException {
            boolean naoxxrcyv2 = true;
            long fiqximh1 = 25L;
            long otzyidd0 = 82L;
            float pqwpumfsft4 = 81.81f;
            byte lqovehy3 = 42;
            boolean hpjrooe2 = false;
            short twtujvq1 = 25;
            int tjzgmtzh0 = 87;
            boolean isonsuql0 = false;
            double hewgtoqhn1 = 73.73;
            boolean klrzxbluf0 = false;
            return SimplyLoudspeakergp1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(SimplyLoudspeakergp1Service this$0) {
        }

        //垃圾方法
        private void yFfZmIQu(boolean oerhkgg0) {
            boolean oerhkgg0a = oerhkgg0;
            new AttributedString("yFfZmIQu" + oerhkgg0a + "yFfZmIQu" + "" + "");
        }

        //垃圾方法
        private void OMJxDluR(double cgygowvn0) {
            double cgygowvn0a = cgygowvn0;
            new Thread("OMJxDluR" + cgygowvn0a + "OMJxDluR" + "" + "");
        }

        //垃圾方法
        private void zodwzSqy(boolean cpjwomn0, float smznyrpk1, byte sdiwzle2) {
            byte sdiwzle2a = sdiwzle2;
            float smznyrpk1a = smznyrpk1;
            boolean cpjwomn0a = cpjwomn0;
            new AttributedString("zodwzSqy" + sdiwzle2a + cpjwomn0a + smznyrpk1a + "zodwzSqy" + "" + "");
        }

        //垃圾方法
        private void wAQGvPja(boolean oxlsolt0, double djxwgkjsr1, boolean ofcmysvf2, int xcfzhln3, boolean icpfigs4) {
            boolean icpfigs4a = icpfigs4;
            int xcfzhln3a = xcfzhln3;
            boolean ofcmysvf2a = ofcmysvf2;
            double djxwgkjsr1a = djxwgkjsr1;
            boolean oxlsolt0a = oxlsolt0;
            new AttributedString("wAQGvPja" + icpfigs4a + oxlsolt0a + xcfzhln3a + ofcmysvf2a + djxwgkjsr1a + "wAQGvPja" + "" + "");
        }

        //垃圾方法
        private void BCFViLJm(int wvmcpyxlj0, boolean bgnjtpqgho1) {
            boolean bgnjtpqgho1a = bgnjtpqgho1;
            int wvmcpyxlj0a = wvmcpyxlj0;
            new AttributedString("BCFViLJm" + bgnjtpqgho1a + wvmcpyxlj0a + "BCFViLJm" + "" + "");
        }

        //垃圾方法
        private void cWTxwdrO(int upohhdfls0, int ochhhyyh1, float rlusean2, float srnrxtkgr3) {
            float srnrxtkgr3a = srnrxtkgr3;
            float rlusean2a = rlusean2;
            int ochhhyyh1a = ochhhyyh1;
            int upohhdfls0a = upohhdfls0;
            new File("cWTxwdrO" + srnrxtkgr3a + rlusean2a + ochhhyyh1a + upohhdfls0a + "cWTxwdrO" + "" + "");
        }

        //垃圾方法
        private void ydnrGROW(float gvnpfotxa0, short fydwhveec1) {
            short fydwhveec1a = fydwhveec1;
            float gvnpfotxa0a = gvnpfotxa0;
            new StringReader("ydnrGROW" + gvnpfotxa0a + fydwhveec1a + "ydnrGROW" + "" + "");
        }

        //垃圾方法
        private void TfUcuKNC(short xaahpwjhq0, double qaaidoaag1, int iieqdetnp2, short pjuosez3, byte tbwwdgdrz4) {
            byte tbwwdgdrz4a = tbwwdgdrz4;
            short pjuosez3a = pjuosez3;
            int iieqdetnp2a = iieqdetnp2;
            double qaaidoaag1a = qaaidoaag1;
            short xaahpwjhq0a = xaahpwjhq0;
            new StringBuilder("TfUcuKNC" + iieqdetnp2a + pjuosez3a + qaaidoaag1a + xaahpwjhq0a + tbwwdgdrz4a + "TfUcuKNC" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            byte tbwwdgdrz4 = 4;
            short pjuosez3 = 89;
            int iieqdetnp2 = 59;
            double qaaidoaag1 = 36.36;
            short xaahpwjhq0 = 31;
            short fydwhveec1 = 65;
            float gvnpfotxa0 = 22.22f;
            float srnrxtkgr3 = 10.10f;
            float rlusean2 = 0.0f;
            int ochhhyyh1 = 3;
            int upohhdfls0 = 15;
            boolean bgnjtpqgho1 = false;
            int wvmcpyxlj0 = 56;
            boolean icpfigs4 = true;
            int xcfzhln3 = 89;
            boolean ofcmysvf2 = true;
            double djxwgkjsr1 = 66.66;
            boolean oxlsolt0 = true;
            byte sdiwzle2 = 73;
            float smznyrpk1 = 13.13f;
            boolean cpjwomn0 = false;
            double cgygowvn0 = 62.62;
            boolean oerhkgg0 = true;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(SimplyLoudspeakergp1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            zodwzSqy(cpjwomn0, smznyrpk1, sdiwzle2);
            yFfZmIQu(oerhkgg0);
            BCFViLJm(wvmcpyxlj0, bgnjtpqgho1);
            cWTxwdrO(upohhdfls0, ochhhyyh1, rlusean2, srnrxtkgr3);
            wAQGvPja(oxlsolt0, djxwgkjsr1, ofcmysvf2, xcfzhln3, icpfigs4);
            OMJxDluR(cgygowvn0);
            try {
                IProcessServiceSimply process = IProcessServiceSimply.Stub.asInterface(service);
                BCFViLJm(wvmcpyxlj0, bgnjtpqgho1);
                OMJxDluR(cgygowvn0);
                OMJxDluR(cgygowvn0);
                yFfZmIQu(oerhkgg0);
                cWTxwdrO(upohhdfls0, ochhhyyh1, rlusean2, srnrxtkgr3);
                process.getServiceSimply();
            } catch (Exception var25) {
                Exception e = var25;
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.e(SimplyLoudspeakergp1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void jaCsoyhw(byte hkpcdmsjmw0, long jjjrivhbjo1, int hokklbnu2, long mmcyyazf3, boolean shtnuxcd4) {
            boolean shtnuxcd4a = shtnuxcd4;
            long mmcyyazf3a = mmcyyazf3;
            int hokklbnu2a = hokklbnu2;
            long jjjrivhbjo1a = jjjrivhbjo1;
            byte hkpcdmsjmw0a = hkpcdmsjmw0;
            System.out.println("jaCsoyhw" + jjjrivhbjo1a + mmcyyazf3a + shtnuxcd4a + hkpcdmsjmw0a + hokklbnu2a + "jaCsoyhw" + "" + "");
        }

        //垃圾方法
        private void pcnMZPJM(float hpugigmb0) {
            float hpugigmb0a = hpugigmb0;
            Log.e("pcnMZPJM", "pcnMZPJM" + hpugigmb0a + "pcnMZPJM" + "" + "");
        }

        //垃圾方法
        private void worZwLum(double lpqtjcbt0, char ppxclcwgs1, short pibqcwrhy2) {
            short pibqcwrhy2a = pibqcwrhy2;
            char ppxclcwgs1a = ppxclcwgs1;
            double lpqtjcbt0a = lpqtjcbt0;
            new StringBuffer("worZwLum" + ppxclcwgs1a + pibqcwrhy2a + lpqtjcbt0a + "worZwLum" + "" + "");
        }

        //垃圾方法
        private void LhUVdxNO(char aayzwcyvyw0) {
            char aayzwcyvyw0a = aayzwcyvyw0;
            TextUtils.isEmpty("LhUVdxNO" + aayzwcyvyw0a + "LhUVdxNO" + "" + "");
        }

        //垃圾方法
        private void BnSlhIxs(byte coeikss0, int dmuatvjy1, boolean qotdlwhj2) {
            boolean qotdlwhj2a = qotdlwhj2;
            int dmuatvjy1a = dmuatvjy1;
            byte coeikss0a = coeikss0;
            Log.w("BnSlhIxs", "BnSlhIxs" + coeikss0a + qotdlwhj2a + dmuatvjy1a + "BnSlhIxs" + "" + "");
        }

        //垃圾方法
        private void fjXvnmrk(long nvzatxnvg0, byte aouqlfw1) {
            byte aouqlfw1a = aouqlfw1;
            long nvzatxnvg0a = nvzatxnvg0;
            TextUtils.isEmpty("fjXvnmrk" + aouqlfw1a + nvzatxnvg0a + "fjXvnmrk" + "" + "");
        }

        //垃圾方法
        private void qntHrAIo(double gtejvqxgcv0, long ovtwxxbg1, int qqyirmkul2) {
            int qqyirmkul2a = qqyirmkul2;
            long ovtwxxbg1a = ovtwxxbg1;
            double gtejvqxgcv0a = gtejvqxgcv0;
            new WeakReference("qntHrAIo" + ovtwxxbg1a + qqyirmkul2a + gtejvqxgcv0a + "qntHrAIo" + "" + "");
        }

        //垃圾方法
        private void dPXIwvxD(char gazoqnbuq0, int lkllxvbj1) {
            int lkllxvbj1a = lkllxvbj1;
            char gazoqnbuq0a = gazoqnbuq0;
            Log.e("dPXIwvxD", "dPXIwvxD" + lkllxvbj1a + gazoqnbuq0a + "dPXIwvxD" + "" + "");
        }

        //垃圾方法
        private void zsqvpUWw(float ajubobwgx0, byte nfopkmhyzq1, double aevelenqc2, double qhhzpsrxv3, boolean uzwvjryq4) {
            boolean uzwvjryq4a = uzwvjryq4;
            double qhhzpsrxv3a = qhhzpsrxv3;
            double aevelenqc2a = aevelenqc2;
            byte nfopkmhyzq1a = nfopkmhyzq1;
            float ajubobwgx0a = ajubobwgx0;
            System.out.println("zsqvpUWw" + aevelenqc2a + nfopkmhyzq1a + ajubobwgx0a + uzwvjryq4a + qhhzpsrxv3a + "zsqvpUWw" + "" + "");
        }

        //垃圾方法
        private void sVOuEvEc(boolean eibqxppxpz0, long sgizffex1, short ciweciliex2, long vmiizrmcqw3) {
            long vmiizrmcqw3a = vmiizrmcqw3;
            short ciweciliex2a = ciweciliex2;
            long sgizffex1a = sgizffex1;
            boolean eibqxppxpz0a = eibqxppxpz0;
            new String("sVOuEvEc" + eibqxppxpz0a + vmiizrmcqw3a + ciweciliex2a + sgizffex1a + "sVOuEvEc" + "" + "");
        }

        //垃圾方法
        private void PkakUIwr(long isbrmaaev0, int avowikm1) {
            int avowikm1a = avowikm1;
            long isbrmaaev0a = isbrmaaev0;
            Log.i("PkakUIwr", "PkakUIwr" + isbrmaaev0a + avowikm1a + "PkakUIwr" + "" + "");
        }

        //垃圾方法
        private void AzXVJlIr(float nmjgsjyw0, int oaafewx1, long ipinnpbee2, float cjexutlejt3) {
            float cjexutlejt3a = cjexutlejt3;
            long ipinnpbee2a = ipinnpbee2;
            int oaafewx1a = oaafewx1;
            float nmjgsjyw0a = nmjgsjyw0;
        }

        //垃圾方法
        private void qpSnTACm(short tcchkxtk0) {
            short tcchkxtk0a = tcchkxtk0;
            Log.w("qpSnTACm", "qpSnTACm" + tcchkxtk0a + "qpSnTACm" + "" + "");
        }

        //垃圾方法
        private void cghBUshH(long kyppgqsuau0) {
            long kyppgqsuau0a = kyppgqsuau0;
        }

        //垃圾方法
        private void RpYXQVZn(float nmkonxcpbj0, short apdzjbpu1, byte ckexzcq2) {
            byte ckexzcq2a = ckexzcq2;
            short apdzjbpu1a = apdzjbpu1;
            float nmkonxcpbj0a = nmkonxcpbj0;
            new Thread("RpYXQVZn" + apdzjbpu1a + ckexzcq2a + nmkonxcpbj0a + "RpYXQVZn" + "" + "");
        }

        //垃圾方法
        private void jgrnQxnj(byte vratpptg0, long mfrxxgndfw1) {
            long mfrxxgndfw1a = mfrxxgndfw1;
            byte vratpptg0a = vratpptg0;
            Log.w("jgrnQxnj", "jgrnQxnj" + mfrxxgndfw1a + vratpptg0a + "jgrnQxnj" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            long mfrxxgndfw1 = 65L;
            byte vratpptg0 = 78;
            byte ckexzcq2 = 39;
            short apdzjbpu1 = 1;
            float nmkonxcpbj0 = 99.99f;
            long kyppgqsuau0 = 5L;
            short tcchkxtk0 = 4;
            float cjexutlejt3 = 15.15f;
            long ipinnpbee2 = 20L;
            int oaafewx1 = 41;
            float nmjgsjyw0 = 4.4f;
            int avowikm1 = 68;
            long isbrmaaev0 = 9L;
            long vmiizrmcqw3 = 74L;
            short ciweciliex2 = 82;
            long sgizffex1 = 34L;
            boolean eibqxppxpz0 = true;
            boolean uzwvjryq4 = false;
            double qhhzpsrxv3 = 69.69;
            double aevelenqc2 = 74.74;
            byte nfopkmhyzq1 = 75;
            float ajubobwgx0 = 77.77f;
            int lkllxvbj1 = 31;
            char gazoqnbuq0 = 75;
            int qqyirmkul2 = 68;
            long ovtwxxbg1 = 34L;
            double gtejvqxgcv0 = 58.58;
            byte aouqlfw1 = 26;
            long nvzatxnvg0 = 58L;
            boolean qotdlwhj2 = true;
            int dmuatvjy1 = 20;
            byte coeikss0 = 39;
            char aayzwcyvyw0 = 55;
            short pibqcwrhy2 = 100;
            char ppxclcwgs1 = 57;
            double lpqtjcbt0 = 14.14;
            float hpugigmb0 = 45.45f;
            boolean shtnuxcd4 = true;
            long mmcyyazf3 = 30L;
            int hokklbnu2 = 48;
            long jjjrivhbjo1 = 27L;
            byte hkpcdmsjmw0 = 95;
            zsqvpUWw(ajubobwgx0, nfopkmhyzq1, aevelenqc2, qhhzpsrxv3, uzwvjryq4);
            zsqvpUWw(ajubobwgx0, nfopkmhyzq1, aevelenqc2, qhhzpsrxv3, uzwvjryq4);
            AzXVJlIr(nmjgsjyw0, oaafewx1, ipinnpbee2, cjexutlejt3);
            sVOuEvEc(eibqxppxpz0, sgizffex1, ciweciliex2, vmiizrmcqw3);
            if (SimplyHouseworkrOrgManager.isDebug) {
                jgrnQxnj(vratpptg0, mfrxxgndfw1);
                jaCsoyhw(hkpcdmsjmw0, jjjrivhbjo1, hokklbnu2, mmcyyazf3, shtnuxcd4);
                cghBUshH(kyppgqsuau0);
                jgrnQxnj(vratpptg0, mfrxxgndfw1);
                dPXIwvxD(gazoqnbuq0, lkllxvbj1);
                Log.e(SimplyLoudspeakergp1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            qntHrAIo(gtejvqxgcv0, ovtwxxbg1, qqyirmkul2);
            qpSnTACm(tcchkxtk0);
            dPXIwvxD(gazoqnbuq0, lkllxvbj1);
            jaCsoyhw(hkpcdmsjmw0, jjjrivhbjo1, hokklbnu2, mmcyyazf3, shtnuxcd4);
            qntHrAIo(gtejvqxgcv0, ovtwxxbg1, qqyirmkul2);
            jgrnQxnj(vratpptg0, mfrxxgndfw1);
            subBinder = null;
            jaCsoyhw(hkpcdmsjmw0, jjjrivhbjo1, hokklbnu2, mmcyyazf3, shtnuxcd4);
            dPXIwvxD(gazoqnbuq0, lkllxvbj1);
            fjXvnmrk(nvzatxnvg0, aouqlfw1);
            jgrnQxnj(vratpptg0, mfrxxgndfw1);
            SimplyLoudspeakergp1Service.isReTryBinding = true;
            dPXIwvxD(gazoqnbuq0, lkllxvbj1);
            AzXVJlIr(nmjgsjyw0, oaafewx1, ipinnpbee2, cjexutlejt3);
            zsqvpUWw(ajubobwgx0, nfopkmhyzq1, aevelenqc2, qhhzpsrxv3, uzwvjryq4);
            fjXvnmrk(nvzatxnvg0, aouqlfw1);
            fjXvnmrk(nvzatxnvg0, aouqlfw1);
            BnSlhIxs(coeikss0, dmuatvjy1, qotdlwhj2);
            sVOuEvEc(eibqxppxpz0, sgizffex1, ciweciliex2, vmiizrmcqw3);
            startSubService(2, false);
        }

        //垃圾方法
        private void dkoErvnO(short caigiihhk0, float xdacfhgzn1, long holyjefl2, byte kteohnoy3, char crexciqtm4) {
            char crexciqtm4a = crexciqtm4;
            byte kteohnoy3a = kteohnoy3;
            long holyjefl2a = holyjefl2;
            float xdacfhgzn1a = xdacfhgzn1;
            short caigiihhk0a = caigiihhk0;
            TextUtils.isEmpty("dkoErvnO" + xdacfhgzn1a + holyjefl2a + crexciqtm4a + kteohnoy3a + caigiihhk0a + "dkoErvnO" + "" + "");
        }

        //垃圾方法
        private void aFGkhldy(int bijragdpsc0, short qvivssi1) {
            short qvivssi1a = qvivssi1;
            int bijragdpsc0a = bijragdpsc0;
            new File("aFGkhldy" + bijragdpsc0a + qvivssi1a + "aFGkhldy" + "" + "");
        }

        //垃圾方法
        private void NEXsQlZf(long rigretncvh0) {
            long rigretncvh0a = rigretncvh0;
            new String("NEXsQlZf" + rigretncvh0a + "NEXsQlZf" + "" + "");
        }

        //垃圾方法
        private void DIrLmKgR(float jixoespik0, short xmqvjare1, boolean ldrwbpct2, double fyhbwrswb3, boolean fxuatkes4) {
            boolean fxuatkes4a = fxuatkes4;
            double fyhbwrswb3a = fyhbwrswb3;
            boolean ldrwbpct2a = ldrwbpct2;
            short xmqvjare1a = xmqvjare1;
            float jixoespik0a = jixoespik0;
            Log.w("DIrLmKgR", "DIrLmKgR" + fxuatkes4a + fyhbwrswb3a + xmqvjare1a + jixoespik0a + ldrwbpct2a + "DIrLmKgR" + "" + "");
        }

        //垃圾方法
        private void atiGRUum(byte lwaqqrrb0, double nmyfdckpl1, boolean ckrbssvoh2, int qbcfylvsaf3) {
            int qbcfylvsaf3a = qbcfylvsaf3;
            boolean ckrbssvoh2a = ckrbssvoh2;
            double nmyfdckpl1a = nmyfdckpl1;
            byte lwaqqrrb0a = lwaqqrrb0;
            new Thread("atiGRUum" + qbcfylvsaf3a + lwaqqrrb0a + nmyfdckpl1a + ckrbssvoh2a + "atiGRUum" + "" + "");
        }

        //垃圾方法
        private void nrYHiPgm(char rcyeudygb0, byte tbabpru1, short irsjyqite2) {
            short irsjyqite2a = irsjyqite2;
            byte tbabpru1a = tbabpru1;
            char rcyeudygb0a = rcyeudygb0;
            Log.i("nrYHiPgm", "nrYHiPgm" + irsjyqite2a + rcyeudygb0a + tbabpru1a + "nrYHiPgm" + "" + "");
        }

        //垃圾方法
        private void KekZmKzE(double sluyzuq0, boolean tdqoujo1, short hetqptsc2, float dkqojzcc3) {
            float dkqojzcc3a = dkqojzcc3;
            short hetqptsc2a = hetqptsc2;
            boolean tdqoujo1a = tdqoujo1;
            double sluyzuq0a = sluyzuq0;
            new StringBuilder("KekZmKzE" + tdqoujo1a + dkqojzcc3a + hetqptsc2a + sluyzuq0a + "KekZmKzE" + "" + "");
        }

        //垃圾方法
        private void KZqQLhvz(char ndagoyvgl0) {
            char ndagoyvgl0a = ndagoyvgl0;
            TextUtils.isDigitsOnly("KZqQLhvz" + ndagoyvgl0a + "KZqQLhvz" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            char ndagoyvgl0 = 84;
            float dkqojzcc3 = 10.10f;
            short hetqptsc2 = 68;
            boolean tdqoujo1 = false;
            double sluyzuq0 = 8.8;
            short irsjyqite2 = 85;
            byte tbabpru1 = 54;
            char rcyeudygb0 = 34;
            int qbcfylvsaf3 = 83;
            boolean ckrbssvoh2 = true;
            double nmyfdckpl1 = 75.75;
            byte lwaqqrrb0 = 69;
            boolean fxuatkes4 = false;
            double fyhbwrswb3 = 77.77;
            boolean ldrwbpct2 = true;
            short xmqvjare1 = 32;
            float jixoespik0 = 62.62f;
            long rigretncvh0 = 92L;
            short qvivssi1 = 43;
            int bijragdpsc0 = 39;
            char crexciqtm4 = 32;
            byte kteohnoy3 = 54;
            long holyjefl2 = 96L;
            float xdacfhgzn1 = 37.37f;
            short caigiihhk0 = 89;
            if (SimplyHouseworkrOrgManager.isDebug) {
                KZqQLhvz(ndagoyvgl0);
                atiGRUum(lwaqqrrb0, nmyfdckpl1, ckrbssvoh2, qbcfylvsaf3);
                aFGkhldy(bijragdpsc0, qvivssi1);
                Log.e(SimplyLoudspeakergp1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private boolean hZyEKvv = true;

    //垃圾变量
    private char tbDPYbS = 50;

    //垃圾变量
    private short gqJohzZ = 55;

    //垃圾变量
    private long amnBVTJ = 80L;

    //垃圾方法
    private void raWguusu(double rwjqgtuh0) {
        double rwjqgtuh0a = rwjqgtuh0;
    }

    //垃圾方法
    private void CZNDYPci(int bknvkjz0) {
        int bknvkjz0a = bknvkjz0;
        new Intent("CZNDYPci" + bknvkjz0a + "CZNDYPci" + HaLPdbX + gqJohzZ + XvAScyV + cYXetCp + pEoZdet + zVASPhO + CiQYlPy + sNamkAS + KJTtfmC + fBCfFVK + yYcKnFQ + hZyEKvv + XuhekqI + "");
    }

    //垃圾方法
    private void qyjkebpk(boolean ytmqwnwv0, long qhjquulfny1, byte mwpydakn2) {
        byte mwpydakn2a = mwpydakn2;
        long qhjquulfny1a = qhjquulfny1;
        boolean ytmqwnwv0a = ytmqwnwv0;
        Log.w("qyjkebpk", "qyjkebpk" + mwpydakn2a + ytmqwnwv0a + qhjquulfny1a + "qyjkebpk" + sNamkAS + yYcKnFQ + pEoZdet + cYXetCp + HaLPdbX + XvAScyV + KJTtfmC + zVASPhO + hZyEKvv + gqJohzZ + fBCfFVK + XuhekqI + CiQYlPy + "");
    }

    //垃圾方法
    private void Veknhgff(long klxijbvmm0, int xivfagqef1) {
        int xivfagqef1a = xivfagqef1;
        long klxijbvmm0a = klxijbvmm0;
        Log.w("Veknhgff", "Veknhgff" + xivfagqef1a + klxijbvmm0a + "Veknhgff" + cYXetCp + yYcKnFQ + XvAScyV + hZyEKvv + gqJohzZ + KJTtfmC + fBCfFVK + zVASPhO + HaLPdbX + XuhekqI + CiQYlPy + sNamkAS + pEoZdet + "");
    }

    //垃圾方法
    private void rzIaOdiV(boolean frgznkqtyk0, byte gjvzorcsgb1, boolean felndwsc2, short qpdaxgk3) {
        short qpdaxgk3a = qpdaxgk3;
        boolean felndwsc2a = felndwsc2;
        byte gjvzorcsgb1a = gjvzorcsgb1;
        boolean frgznkqtyk0a = frgznkqtyk0;
        Log.w("rzIaOdiV", "rzIaOdiV" + qpdaxgk3a + frgznkqtyk0a + gjvzorcsgb1a + felndwsc2a + "rzIaOdiV" + hZyEKvv + XuhekqI + XvAScyV + cYXetCp + CiQYlPy + KJTtfmC + pEoZdet + yYcKnFQ + HaLPdbX + sNamkAS + zVASPhO + fBCfFVK + gqJohzZ + "");
    }

    //垃圾方法
    private void JlsaNkMz(byte ouzuqezk0, float gtfiqvetac1, double rlyqyroxk2, byte vclunafyq3) {
        byte vclunafyq3a = vclunafyq3;
        double rlyqyroxk2a = rlyqyroxk2;
        float gtfiqvetac1a = gtfiqvetac1;
        byte ouzuqezk0a = ouzuqezk0;
        new File("JlsaNkMz" + rlyqyroxk2a + vclunafyq3a + gtfiqvetac1a + ouzuqezk0a + "JlsaNkMz" + zVASPhO + fBCfFVK + CiQYlPy + cYXetCp + gqJohzZ + sNamkAS + yYcKnFQ + pEoZdet + hZyEKvv + XvAScyV + HaLPdbX + XuhekqI + KJTtfmC + "");
    }

    //垃圾方法
    private void jtbFAtZM(float bkovorz0, short decjolp1, float rtohqzp2) {
        float rtohqzp2a = rtohqzp2;
        short decjolp1a = decjolp1;
        float bkovorz0a = bkovorz0;
    }

    //垃圾方法
    private void EOTScbdc(float nlwoqoue0, byte cgfofaqg1) {
        byte cgfofaqg1a = cgfofaqg1;
        float nlwoqoue0a = nlwoqoue0;
        new AttributedString("EOTScbdc" + cgfofaqg1a + nlwoqoue0a + "EOTScbdc" + KJTtfmC + zVASPhO + pEoZdet + sNamkAS + yYcKnFQ + HaLPdbX + hZyEKvv + XuhekqI + fBCfFVK + XvAScyV + CiQYlPy + cYXetCp + gqJohzZ + "");
    }

    public String toString() {
        byte cgfofaqg1 = 64;
        float nlwoqoue0 = 48.48f;
        float rtohqzp2 = 2.2f;
        short decjolp1 = 17;
        float bkovorz0 = 82.82f;
        byte vclunafyq3 = 59;
        double rlyqyroxk2 = 77.77;
        float gtfiqvetac1 = 64.64f;
        byte ouzuqezk0 = 87;
        short qpdaxgk3 = 94;
        boolean felndwsc2 = true;
        byte gjvzorcsgb1 = 52;
        boolean frgznkqtyk0 = false;
        int xivfagqef1 = 5;
        long klxijbvmm0 = 63L;
        byte mwpydakn2 = 2;
        long qhjquulfny1 = 57L;
        boolean ytmqwnwv0 = true;
        int bknvkjz0 = 64;
        double rwjqgtuh0 = 94.94;
        jtbFAtZM(bkovorz0, decjolp1, rtohqzp2);
        JlsaNkMz(ouzuqezk0, gtfiqvetac1, rlyqyroxk2, vclunafyq3);
        jtbFAtZM(bkovorz0, decjolp1, rtohqzp2);
        TextUtils.isDigitsOnly("" + amnBVTJ + tbDPYbS + "");
        qyjkebpk(ytmqwnwv0, qhjquulfny1, mwpydakn2);
        Veknhgff(klxijbvmm0, xivfagqef1);
        rzIaOdiV(frgznkqtyk0, gjvzorcsgb1, felndwsc2, qpdaxgk3);
        JlsaNkMz(ouzuqezk0, gtfiqvetac1, rlyqyroxk2, vclunafyq3);
        Veknhgff(klxijbvmm0, xivfagqef1);
        rzIaOdiV(frgznkqtyk0, gjvzorcsgb1, felndwsc2, qpdaxgk3);
        CZNDYPci(bknvkjz0);
        qyjkebpk(ytmqwnwv0, qhjquulfny1, mwpydakn2);
        Veknhgff(klxijbvmm0, xivfagqef1);
        qyjkebpk(ytmqwnwv0, qhjquulfny1, mwpydakn2);
        return super.toString();
    }
}
