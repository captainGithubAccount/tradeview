package com.recover.redate.orgyy;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.recover.IProcessServiceRecover;
import com.recover.redate.RecoverOrgManager;
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

public class Recover2Service extends Service {

    //垃圾变量
    private int bYbAjIz = 11;

    String TAG = "xxx";

    //垃圾变量
    private float ZIFGecR = 72.72f;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private boolean XWUMHRe = false;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private float cCwisJu = 9.9f;

    public static Boolean isLiving = false;

    //垃圾变量
    private char tiqDvvK = 7;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private char qVhtnyF = 93;

    private static long delayTime = 250L;

    //垃圾变量
    private byte Jdafmlz = 65;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private double yUkeLXy = 98.98;

    public static boolean isStartService = false;

    //垃圾变量
    private long kXgGNAj = 48L;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private float fDFJsGk = 26.26f;

    int nextNum = -1;

    //垃圾变量
    private float pVLSmMx = 10.10f;

    private static IBinder mainBinder = null;

    public Recover2Service() {
    }

    //垃圾方法
    private void avnogOUQ(double gstpjfvejh0, double jlqvjcpf1, char btjvqools2, float ylzpbru3, short ivdypkterm4) {
        short ivdypkterm4a = ivdypkterm4;
        float ylzpbru3a = ylzpbru3;
        char btjvqools2a = btjvqools2;
        double jlqvjcpf1a = jlqvjcpf1;
        double gstpjfvejh0a = gstpjfvejh0;
        new StringBuffer("avnogOUQ" + gstpjfvejh0a + ylzpbru3a + btjvqools2a + ivdypkterm4a + jlqvjcpf1a + "avnogOUQ" + ePveDPs + lYGYbDn + JyoKkBG + yUkeLXy + kXgGNAj + tiqDvvK + qVhtnyF + UhtvKFN + fDFJsGk + ZIFGecR + Jdafmlz + XWUMHRe + bYbAjIz + cCwisJu + pVLSmMx + mHgmbQD + "");
    }

    //垃圾方法
    private void RbtzeSUg(long qxhkgji0, int evxehumpky1, boolean ipfqavem2) {
        boolean ipfqavem2a = ipfqavem2;
        int evxehumpky1a = evxehumpky1;
        long qxhkgji0a = qxhkgji0;
        new StringReader("RbtzeSUg" + qxhkgji0a + evxehumpky1a + ipfqavem2a + "RbtzeSUg" + ZIFGecR + mHgmbQD + ePveDPs + yUkeLXy + cCwisJu + UhtvKFN + tiqDvvK + pVLSmMx + bYbAjIz + lYGYbDn + Jdafmlz + qVhtnyF + kXgGNAj + fDFJsGk + JyoKkBG + XWUMHRe + "");
    }

    //垃圾方法
    private void NInzCYIj(boolean ggkfhkbk0, short cuspegov1, int yffxlfbyr2, char furflhr3) {
        char furflhr3a = furflhr3;
        int yffxlfbyr2a = yffxlfbyr2;
        short cuspegov1a = cuspegov1;
        boolean ggkfhkbk0a = ggkfhkbk0;
        new String("NInzCYIj" + furflhr3a + ggkfhkbk0a + cuspegov1a + yffxlfbyr2a + "NInzCYIj" + qVhtnyF + mHgmbQD + pVLSmMx + lYGYbDn + ZIFGecR + Jdafmlz + fDFJsGk + XWUMHRe + ePveDPs + JyoKkBG + tiqDvvK + yUkeLXy + kXgGNAj + bYbAjIz + cCwisJu + UhtvKFN + "");
    }

    //垃圾方法
    private void AdtWYwTE(byte yaqkgnoe0, double roiyble1, long mwuhfhsk2, int bwhxfogx3) {
        int bwhxfogx3a = bwhxfogx3;
        long mwuhfhsk2a = mwuhfhsk2;
        double roiyble1a = roiyble1;
        byte yaqkgnoe0a = yaqkgnoe0;
        Log.e("AdtWYwTE", "AdtWYwTE" + roiyble1a + bwhxfogx3a + yaqkgnoe0a + mwuhfhsk2a + "AdtWYwTE" + bYbAjIz + yUkeLXy + ZIFGecR + lYGYbDn + ePveDPs + mHgmbQD + JyoKkBG + fDFJsGk + cCwisJu + Jdafmlz + qVhtnyF + kXgGNAj + tiqDvvK + pVLSmMx + UhtvKFN + XWUMHRe + "");
    }

    //垃圾方法
    private void wNWMJBWq(char odvxxyy0) {
        char odvxxyy0a = odvxxyy0;
        new Intent("wNWMJBWq" + odvxxyy0a + "wNWMJBWq" + lYGYbDn + kXgGNAj + pVLSmMx + cCwisJu + UhtvKFN + qVhtnyF + ePveDPs + fDFJsGk + yUkeLXy + ZIFGecR + bYbAjIz + XWUMHRe + JyoKkBG + Jdafmlz + mHgmbQD + tiqDvvK + "");
    }

    //垃圾方法
    private void apXcDxvq(boolean rkotmhy0, int qhezuwhr1, int zihyfjsg2) {
        int zihyfjsg2a = zihyfjsg2;
        int qhezuwhr1a = qhezuwhr1;
        boolean rkotmhy0a = rkotmhy0;
        new Thread("apXcDxvq" + qhezuwhr1a + rkotmhy0a + zihyfjsg2a + "apXcDxvq" + kXgGNAj + fDFJsGk + yUkeLXy + cCwisJu + tiqDvvK + mHgmbQD + ePveDPs + ZIFGecR + bYbAjIz + pVLSmMx + qVhtnyF + XWUMHRe + UhtvKFN + lYGYbDn + Jdafmlz + JyoKkBG + "");
    }

    //垃圾方法
    private void wqiCLUXU(long vmolerws0, short aymiiqrwdt1) {
        short aymiiqrwdt1a = aymiiqrwdt1;
        long vmolerws0a = vmolerws0;
        new Thread("wqiCLUXU" + aymiiqrwdt1a + vmolerws0a + "wqiCLUXU" + JyoKkBG + qVhtnyF + ePveDPs + ZIFGecR + yUkeLXy + XWUMHRe + pVLSmMx + Jdafmlz + UhtvKFN + lYGYbDn + tiqDvvK + mHgmbQD + fDFJsGk + kXgGNAj + bYbAjIz + cCwisJu + "");
    }

    //垃圾方法
    private void MltKCaBM(boolean twfuirmf0, int jmklkbblyq1, short ejhlbbin2, int fyyfabnwh3) {
        int fyyfabnwh3a = fyyfabnwh3;
        short ejhlbbin2a = ejhlbbin2;
        int jmklkbblyq1a = jmklkbblyq1;
        boolean twfuirmf0a = twfuirmf0;
        new File("MltKCaBM" + twfuirmf0a + fyyfabnwh3a + ejhlbbin2a + jmklkbblyq1a + "MltKCaBM" + cCwisJu + XWUMHRe + pVLSmMx + Jdafmlz + bYbAjIz + UhtvKFN + mHgmbQD + ZIFGecR + tiqDvvK + JyoKkBG + fDFJsGk + ePveDPs + yUkeLXy + lYGYbDn + qVhtnyF + kXgGNAj + "");
    }

    //垃圾方法
    private void axnTWEZa(long qddiflartw0) {
        long qddiflartw0a = qddiflartw0;
        new Thread("axnTWEZa" + qddiflartw0a + "axnTWEZa" + Jdafmlz + tiqDvvK + ZIFGecR + lYGYbDn + bYbAjIz + JyoKkBG + cCwisJu + ePveDPs + kXgGNAj + yUkeLXy + mHgmbQD + fDFJsGk + pVLSmMx + UhtvKFN + XWUMHRe + qVhtnyF + "");
    }

    //垃圾方法
    private void kXdvtZdV(int emjekhkydj0, char jlgqixr1, boolean casgvnn2, double fglalgc3) {
        double fglalgc3a = fglalgc3;
        boolean casgvnn2a = casgvnn2;
        char jlgqixr1a = jlgqixr1;
        int emjekhkydj0a = emjekhkydj0;
    }

    //垃圾方法
    private void czbRAXGc(char ngcyanm0, short jyzbmxje1, boolean jjcbidw2, boolean vhgdtitgxa3) {
        boolean vhgdtitgxa3a = vhgdtitgxa3;
        boolean jjcbidw2a = jjcbidw2;
        short jyzbmxje1a = jyzbmxje1;
        char ngcyanm0a = ngcyanm0;
        new File("czbRAXGc" + jjcbidw2a + vhgdtitgxa3a + ngcyanm0a + jyzbmxje1a + "czbRAXGc" + JyoKkBG + tiqDvvK + fDFJsGk + bYbAjIz + Jdafmlz + XWUMHRe + ePveDPs + pVLSmMx + ZIFGecR + lYGYbDn + kXgGNAj + yUkeLXy + qVhtnyF + mHgmbQD + UhtvKFN + cCwisJu + "");
    }

    //垃圾方法
    private void WAJVbEBK(char mswkmvt0, long wdvpijv1, boolean hntsrsjb2, char udcnkcm3) {
        char udcnkcm3a = udcnkcm3;
        boolean hntsrsjb2a = hntsrsjb2;
        long wdvpijv1a = wdvpijv1;
        char mswkmvt0a = mswkmvt0;
        Log.w("WAJVbEBK", "WAJVbEBK" + wdvpijv1a + mswkmvt0a + udcnkcm3a + hntsrsjb2a + "WAJVbEBK" + cCwisJu + yUkeLXy + bYbAjIz + qVhtnyF + lYGYbDn + tiqDvvK + mHgmbQD + XWUMHRe + pVLSmMx + JyoKkBG + UhtvKFN + kXgGNAj + fDFJsGk + Jdafmlz + ePveDPs + ZIFGecR + "");
    }

    //垃圾方法
    private void yOeDCrmy(short mejqchyk0, long dtudzgzbvt1) {
        long dtudzgzbvt1a = dtudzgzbvt1;
        short mejqchyk0a = mejqchyk0;
        new StringReader("yOeDCrmy" + dtudzgzbvt1a + mejqchyk0a + "yOeDCrmy" + fDFJsGk + UhtvKFN + pVLSmMx + yUkeLXy + JyoKkBG + kXgGNAj + lYGYbDn + Jdafmlz + mHgmbQD + bYbAjIz + ePveDPs + tiqDvvK + qVhtnyF + XWUMHRe + cCwisJu + ZIFGecR + "");
    }

    //垃圾方法
    private void vBddmIqA(double sgwbrfgwe0, boolean hkwomoc1) {
        boolean hkwomoc1a = hkwomoc1;
        double sgwbrfgwe0a = sgwbrfgwe0;
        Log.e("vBddmIqA", "vBddmIqA" + sgwbrfgwe0a + hkwomoc1a + "vBddmIqA" + kXgGNAj + UhtvKFN + cCwisJu + lYGYbDn + bYbAjIz + ePveDPs + XWUMHRe + JyoKkBG + yUkeLXy + qVhtnyF + pVLSmMx + tiqDvvK + ZIFGecR + mHgmbQD + Jdafmlz + fDFJsGk + "");
    }

    //垃圾方法
    private void LbgzFQUn(char uoeojala0) {
        char uoeojala0a = uoeojala0;
    }

    //垃圾方法
    private void ZgRihtGH(byte pjpqlcdgmo0, double ljjienlx1, long kjrdauzpi2, long dudwxposhu3, double usvupqrcce4) {
        double usvupqrcce4a = usvupqrcce4;
        long dudwxposhu3a = dudwxposhu3;
        long kjrdauzpi2a = kjrdauzpi2;
        double ljjienlx1a = ljjienlx1;
        byte pjpqlcdgmo0a = pjpqlcdgmo0;
        new Thread("ZgRihtGH" + kjrdauzpi2a + ljjienlx1a + pjpqlcdgmo0a + usvupqrcce4a + dudwxposhu3a + "ZgRihtGH" + tiqDvvK + bYbAjIz + qVhtnyF + XWUMHRe + fDFJsGk + JyoKkBG + lYGYbDn + yUkeLXy + pVLSmMx + Jdafmlz + kXgGNAj + UhtvKFN + ePveDPs + ZIFGecR + cCwisJu + mHgmbQD + "");
    }

    //垃圾方法
    private void KNlTRCYg(boolean jzyvbasnog0) {
        boolean jzyvbasnog0a = jzyvbasnog0;
        new Intent("KNlTRCYg" + jzyvbasnog0a + "KNlTRCYg" + fDFJsGk + pVLSmMx + JyoKkBG + bYbAjIz + Jdafmlz + yUkeLXy + tiqDvvK + kXgGNAj + UhtvKFN + XWUMHRe + ePveDPs + mHgmbQD + ZIFGecR + lYGYbDn + cCwisJu + qVhtnyF + "");
    }

    //垃圾方法
    private void mMIRtHqQ(char wkpmenbowr0, long dzqfapqs1, byte fxigxqgb2, byte ckweuuec3) {
        byte ckweuuec3a = ckweuuec3;
        byte fxigxqgb2a = fxigxqgb2;
        long dzqfapqs1a = dzqfapqs1;
        char wkpmenbowr0a = wkpmenbowr0;
        System.out.println("mMIRtHqQ" + ckweuuec3a + fxigxqgb2a + wkpmenbowr0a + dzqfapqs1a + "mMIRtHqQ" + JyoKkBG + qVhtnyF + XWUMHRe + pVLSmMx + Jdafmlz + tiqDvvK + ePveDPs + kXgGNAj + lYGYbDn + cCwisJu + yUkeLXy + ZIFGecR + UhtvKFN + mHgmbQD + fDFJsGk + bYbAjIz + "");
    }

    //垃圾方法
    private void tUzVmOPj(long lbekgpbzr0, float kpauhlvhqz1, int houiszi2, int tirevne3) {
        int tirevne3a = tirevne3;
        int houiszi2a = houiszi2;
        float kpauhlvhqz1a = kpauhlvhqz1;
        long lbekgpbzr0a = lbekgpbzr0;
        TextUtils.isDigitsOnly("tUzVmOPj" + kpauhlvhqz1a + tirevne3a + lbekgpbzr0a + houiszi2a + "tUzVmOPj" + yUkeLXy + lYGYbDn + cCwisJu + UhtvKFN + ePveDPs + Jdafmlz + tiqDvvK + bYbAjIz + kXgGNAj + qVhtnyF + ZIFGecR + XWUMHRe + JyoKkBG + fDFJsGk + pVLSmMx + mHgmbQD + "");
    }

    //垃圾方法
    private void QettwBGv(long mtbxaalnq0, double wcipgfuvqf1, boolean habxsrcgs2, int fvuxfrsefa3, char oqejdpl4) {
        char oqejdpl4a = oqejdpl4;
        int fvuxfrsefa3a = fvuxfrsefa3;
        boolean habxsrcgs2a = habxsrcgs2;
        double wcipgfuvqf1a = wcipgfuvqf1;
        long mtbxaalnq0a = mtbxaalnq0;
        new File("QettwBGv" + fvuxfrsefa3a + oqejdpl4a + habxsrcgs2a + mtbxaalnq0a + wcipgfuvqf1a + "QettwBGv" + pVLSmMx + XWUMHRe + ZIFGecR + tiqDvvK + yUkeLXy + qVhtnyF + lYGYbDn + UhtvKFN + cCwisJu + fDFJsGk + bYbAjIz + mHgmbQD + kXgGNAj + ePveDPs + Jdafmlz + JyoKkBG + "");
    }

    //垃圾方法
    private void TBRqzdqv(long rsjeiqxvl0) {
        long rsjeiqxvl0a = rsjeiqxvl0;
    }

    //垃圾方法
    private void WxjDwWFU(float cnsgqlo0) {
        float cnsgqlo0a = cnsgqlo0;
        new File("WxjDwWFU" + cnsgqlo0a + "WxjDwWFU" + mHgmbQD + XWUMHRe + kXgGNAj + JyoKkBG + yUkeLXy + bYbAjIz + UhtvKFN + qVhtnyF + lYGYbDn + tiqDvvK + pVLSmMx + fDFJsGk + ePveDPs + Jdafmlz + ZIFGecR + cCwisJu + "");
    }

    //垃圾方法
    private void GXaCBRVu(boolean zowscxnxyr0, boolean bahcrtqxed1) {
        boolean bahcrtqxed1a = bahcrtqxed1;
        boolean zowscxnxyr0a = zowscxnxyr0;
        new StringBuilder("GXaCBRVu" + zowscxnxyr0a + bahcrtqxed1a + "GXaCBRVu" + kXgGNAj + XWUMHRe + tiqDvvK + qVhtnyF + mHgmbQD + cCwisJu + ePveDPs + lYGYbDn + ZIFGecR + Jdafmlz + pVLSmMx + fDFJsGk + JyoKkBG + bYbAjIz + yUkeLXy + UhtvKFN + "");
    }

    //垃圾方法
    private void ktHPmWnN(boolean nceqazjf0, long uukcinkly1, short roatcojixg2) {
        short roatcojixg2a = roatcojixg2;
        long uukcinkly1a = uukcinkly1;
        boolean nceqazjf0a = nceqazjf0;
        new String("ktHPmWnN" + uukcinkly1a + nceqazjf0a + roatcojixg2a + "ktHPmWnN" + yUkeLXy + ePveDPs + XWUMHRe + Jdafmlz + tiqDvvK + mHgmbQD + qVhtnyF + fDFJsGk + ZIFGecR + kXgGNAj + JyoKkBG + UhtvKFN + cCwisJu + pVLSmMx + bYbAjIz + lYGYbDn + "");
    }

    //垃圾方法
    private void nOxLShvg(long mnlmoxmi0, double zhobaihrrc1, boolean nfewiyht2) {
        boolean nfewiyht2a = nfewiyht2;
        double zhobaihrrc1a = zhobaihrrc1;
        long mnlmoxmi0a = mnlmoxmi0;
        Log.w("nOxLShvg", "nOxLShvg" + zhobaihrrc1a + mnlmoxmi0a + nfewiyht2a + "nOxLShvg" + fDFJsGk + JyoKkBG + UhtvKFN + kXgGNAj + yUkeLXy + tiqDvvK + ePveDPs + ZIFGecR + mHgmbQD + qVhtnyF + cCwisJu + lYGYbDn + XWUMHRe + pVLSmMx + bYbAjIz + Jdafmlz + "");
    }

    //垃圾方法
    private void exhtmTmS(int oztfjfjfs0, int vzdfyfnslw1, int bqnqpnqe2) {
        int bqnqpnqe2a = bqnqpnqe2;
        int vzdfyfnslw1a = vzdfyfnslw1;
        int oztfjfjfs0a = oztfjfjfs0;
        new StringBuffer("exhtmTmS" + vzdfyfnslw1a + bqnqpnqe2a + oztfjfjfs0a + "exhtmTmS" + pVLSmMx + qVhtnyF + yUkeLXy + Jdafmlz + XWUMHRe + fDFJsGk + JyoKkBG + mHgmbQD + kXgGNAj + bYbAjIz + tiqDvvK + ZIFGecR + cCwisJu + ePveDPs + UhtvKFN + lYGYbDn + "");
    }

    //垃圾方法
    private void JkENmrrq(byte hmzhljy0, short uaoqjehir1) {
        short uaoqjehir1a = uaoqjehir1;
        byte hmzhljy0a = hmzhljy0;
        Log.e("JkENmrrq", "JkENmrrq" + hmzhljy0a + uaoqjehir1a + "JkENmrrq" + ZIFGecR + bYbAjIz + UhtvKFN + kXgGNAj + mHgmbQD + lYGYbDn + cCwisJu + yUkeLXy + tiqDvvK + qVhtnyF + XWUMHRe + fDFJsGk + Jdafmlz + ePveDPs + JyoKkBG + pVLSmMx + "");
    }

    //垃圾方法
    private void eNITGbYd(char fpgnpvly0, char swpwhpvunm1, int ulpgdps2) {
        int ulpgdps2a = ulpgdps2;
        char swpwhpvunm1a = swpwhpvunm1;
        char fpgnpvly0a = fpgnpvly0;
        new StringBuffer("eNITGbYd" + swpwhpvunm1a + ulpgdps2a + fpgnpvly0a + "eNITGbYd" + yUkeLXy + cCwisJu + kXgGNAj + fDFJsGk + mHgmbQD + UhtvKFN + XWUMHRe + JyoKkBG + tiqDvvK + ePveDPs + Jdafmlz + lYGYbDn + qVhtnyF + ZIFGecR + pVLSmMx + bYbAjIz + "");
    }

    public void onCreate() {
        int ulpgdps2 = 14;
        char swpwhpvunm1 = 69;
        char fpgnpvly0 = 1;
        short uaoqjehir1 = 100;
        byte hmzhljy0 = 43;
        int bqnqpnqe2 = 99;
        int vzdfyfnslw1 = 98;
        int oztfjfjfs0 = 0;
        boolean nfewiyht2 = true;
        double zhobaihrrc1 = 14.14;
        long mnlmoxmi0 = 67L;
        short roatcojixg2 = 80;
        long uukcinkly1 = 37L;
        boolean nceqazjf0 = false;
        boolean bahcrtqxed1 = false;
        boolean zowscxnxyr0 = false;
        float cnsgqlo0 = 17.17f;
        long rsjeiqxvl0 = 23L;
        char oqejdpl4 = 57;
        int fvuxfrsefa3 = 47;
        boolean habxsrcgs2 = false;
        double wcipgfuvqf1 = 63.63;
        long mtbxaalnq0 = 80L;
        int tirevne3 = 70;
        int houiszi2 = 31;
        float kpauhlvhqz1 = 6.6f;
        long lbekgpbzr0 = 56L;
        byte ckweuuec3 = 2;
        byte fxigxqgb2 = 80;
        long dzqfapqs1 = 35L;
        char wkpmenbowr0 = 97;
        boolean jzyvbasnog0 = false;
        double usvupqrcce4 = 6.6;
        long dudwxposhu3 = 40L;
        long kjrdauzpi2 = 25L;
        double ljjienlx1 = 51.51;
        byte pjpqlcdgmo0 = 29;
        char uoeojala0 = 69;
        boolean hkwomoc1 = false;
        double sgwbrfgwe0 = 92.92;
        long dtudzgzbvt1 = 47L;
        short mejqchyk0 = 21;
        char udcnkcm3 = 39;
        boolean hntsrsjb2 = true;
        long wdvpijv1 = 25L;
        char mswkmvt0 = 37;
        boolean vhgdtitgxa3 = true;
        boolean jjcbidw2 = true;
        short jyzbmxje1 = 66;
        char ngcyanm0 = 17;
        double fglalgc3 = 68.68;
        boolean casgvnn2 = false;
        char jlgqixr1 = 82;
        int emjekhkydj0 = 1;
        long qddiflartw0 = 78L;
        int fyyfabnwh3 = 73;
        short ejhlbbin2 = 74;
        int jmklkbblyq1 = 20;
        boolean twfuirmf0 = false;
        short aymiiqrwdt1 = 14;
        long vmolerws0 = 69L;
        int zihyfjsg2 = 55;
        int qhezuwhr1 = 43;
        boolean rkotmhy0 = false;
        char odvxxyy0 = 78;
        int bwhxfogx3 = 26;
        long mwuhfhsk2 = 23L;
        double roiyble1 = 2.2;
        byte yaqkgnoe0 = 40;
        char furflhr3 = 57;
        int yffxlfbyr2 = 68;
        short cuspegov1 = 17;
        boolean ggkfhkbk0 = false;
        boolean ipfqavem2 = true;
        int evxehumpky1 = 34;
        long qxhkgji0 = 37L;
        short ivdypkterm4 = 42;
        float ylzpbru3 = 16.16f;
        char btjvqools2 = 4;
        double jlqvjcpf1 = 44.44;
        double gstpjfvejh0 = 82.82;
        WAJVbEBK(mswkmvt0, wdvpijv1, hntsrsjb2, udcnkcm3);
        czbRAXGc(ngcyanm0, jyzbmxje1, jjcbidw2, vhgdtitgxa3);
        mMIRtHqQ(wkpmenbowr0, dzqfapqs1, fxigxqgb2, ckweuuec3);
        TBRqzdqv(rsjeiqxvl0);
        eNITGbYd(fpgnpvly0, swpwhpvunm1, ulpgdps2);
        mMIRtHqQ(wkpmenbowr0, dzqfapqs1, fxigxqgb2, ckweuuec3);
        JkENmrrq(hmzhljy0, uaoqjehir1);
        mMIRtHqQ(wkpmenbowr0, dzqfapqs1, fxigxqgb2, ckweuuec3);
        NInzCYIj(ggkfhkbk0, cuspegov1, yffxlfbyr2, furflhr3);
        isLiving = true;
        super.onCreate();
        NInzCYIj(ggkfhkbk0, cuspegov1, yffxlfbyr2, furflhr3);
        WxjDwWFU(cnsgqlo0);
        WxjDwWFU(cnsgqlo0);
        if (RecoverOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        this.mServiceBinder = new ServiceBinder(this);
        GXaCBRVu(zowscxnxyr0, bahcrtqxed1);
        tUzVmOPj(lbekgpbzr0, kpauhlvhqz1, houiszi2, tirevne3);
        eNITGbYd(fpgnpvly0, swpwhpvunm1, ulpgdps2);
        ktHPmWnN(nceqazjf0, uukcinkly1, roatcojixg2);
        eNITGbYd(fpgnpvly0, swpwhpvunm1, ulpgdps2);
        KNlTRCYg(jzyvbasnog0);
        eNITGbYd(fpgnpvly0, swpwhpvunm1, ulpgdps2);
        yOeDCrmy(mejqchyk0, dtudzgzbvt1);
        nOxLShvg(mnlmoxmi0, zhobaihrrc1, nfewiyht2);
        JkENmrrq(hmzhljy0, uaoqjehir1);
        if (this.mRemoteServiceConn == null) {
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        ktHPmWnN(nceqazjf0, uukcinkly1, roatcojixg2);
        KNlTRCYg(jzyvbasnog0);
        czbRAXGc(ngcyanm0, jyzbmxje1, jjcbidw2, vhgdtitgxa3);
        vBddmIqA(sgwbrfgwe0, hkwomoc1);
        JkENmrrq(hmzhljy0, uaoqjehir1);
        wqiCLUXU(vmolerws0, aymiiqrwdt1);
        kXdvtZdV(emjekhkydj0, jlgqixr1, casgvnn2, fglalgc3);
        kXdvtZdV(emjekhkydj0, jlgqixr1, casgvnn2, fglalgc3);
        isReTryBinding = true;
        WxjDwWFU(cnsgqlo0);
        avnogOUQ(gstpjfvejh0, jlqvjcpf1, btjvqools2, ylzpbru3, ivdypkterm4);
        MltKCaBM(twfuirmf0, jmklkbblyq1, ejhlbbin2, fyyfabnwh3);
        RbtzeSUg(qxhkgji0, evxehumpky1, ipfqavem2);
        yOeDCrmy(mejqchyk0, dtudzgzbvt1);
        RbtzeSUg(qxhkgji0, evxehumpky1, ipfqavem2);
        mMIRtHqQ(wkpmenbowr0, dzqfapqs1, fxigxqgb2, ckweuuec3);
        ZgRihtGH(pjpqlcdgmo0, ljjienlx1, kjrdauzpi2, dudwxposhu3, usvupqrcce4);
        this.startMainService(1, false);
    }

    //垃圾方法
    private void thEzLvsr(long betrggkn0, boolean dvtpvayw1, long elhrpkxudh2) {
        long elhrpkxudh2a = elhrpkxudh2;
        boolean dvtpvayw1a = dvtpvayw1;
        long betrggkn0a = betrggkn0;
        new StringReader("thEzLvsr" + betrggkn0a + elhrpkxudh2a + dvtpvayw1a + "thEzLvsr" + yUkeLXy + ZIFGecR + kXgGNAj + mHgmbQD + lYGYbDn + Jdafmlz + XWUMHRe + fDFJsGk + cCwisJu + ePveDPs + UhtvKFN + bYbAjIz + JyoKkBG + qVhtnyF + pVLSmMx + tiqDvvK + "");
    }

    //垃圾方法
    private void INvwZknp(int vjekfqi0, byte hwsrdoqr1, long rjdvfwaiht2, boolean rzooner3, byte rkzduai4) {
        byte rkzduai4a = rkzduai4;
        boolean rzooner3a = rzooner3;
        long rjdvfwaiht2a = rjdvfwaiht2;
        byte hwsrdoqr1a = hwsrdoqr1;
        int vjekfqi0a = vjekfqi0;
        Log.i("INvwZknp", "INvwZknp" + hwsrdoqr1a + rzooner3a + rkzduai4a + vjekfqi0a + rjdvfwaiht2a + "INvwZknp" + qVhtnyF + ZIFGecR + cCwisJu + pVLSmMx + lYGYbDn + JyoKkBG + yUkeLXy + bYbAjIz + tiqDvvK + Jdafmlz + mHgmbQD + XWUMHRe + fDFJsGk + UhtvKFN + ePveDPs + kXgGNAj + "");
    }

    //垃圾方法
    private void welINegd(boolean osxengacb0, int lyeyadwta1, byte yiqtpejxqi2) {
        byte yiqtpejxqi2a = yiqtpejxqi2;
        int lyeyadwta1a = lyeyadwta1;
        boolean osxengacb0a = osxengacb0;
        new WeakReference("welINegd" + lyeyadwta1a + osxengacb0a + yiqtpejxqi2a + "welINegd" + Jdafmlz + bYbAjIz + ePveDPs + ZIFGecR + XWUMHRe + tiqDvvK + pVLSmMx + qVhtnyF + UhtvKFN + mHgmbQD + kXgGNAj + JyoKkBG + lYGYbDn + cCwisJu + yUkeLXy + fDFJsGk + "");
    }

    //垃圾方法
    private void ihhgTvVS(double wxymupmj0, float ramwrrh1, char jheniwhcfa2, long zdbmnphuh3, float vkheklo4) {
        float vkheklo4a = vkheklo4;
        long zdbmnphuh3a = zdbmnphuh3;
        char jheniwhcfa2a = jheniwhcfa2;
        float ramwrrh1a = ramwrrh1;
        double wxymupmj0a = wxymupmj0;
        new Intent("ihhgTvVS" + zdbmnphuh3a + jheniwhcfa2a + ramwrrh1a + vkheklo4a + wxymupmj0a + "ihhgTvVS" + kXgGNAj + pVLSmMx + JyoKkBG + UhtvKFN + ePveDPs + XWUMHRe + lYGYbDn + tiqDvvK + qVhtnyF + Jdafmlz + mHgmbQD + ZIFGecR + yUkeLXy + bYbAjIz + fDFJsGk + cCwisJu + "");
    }

    //垃圾方法
    private void BItjzfUQ(double jynpuaviw0, int ryvrduluu1, float flqbbvhh2, boolean fcksyedvke3, byte tjyphfz4) {
        byte tjyphfz4a = tjyphfz4;
        boolean fcksyedvke3a = fcksyedvke3;
        float flqbbvhh2a = flqbbvhh2;
        int ryvrduluu1a = ryvrduluu1;
        double jynpuaviw0a = jynpuaviw0;
        new StringReader("BItjzfUQ" + jynpuaviw0a + fcksyedvke3a + ryvrduluu1a + tjyphfz4a + flqbbvhh2a + "BItjzfUQ" + JyoKkBG + ePveDPs + cCwisJu + qVhtnyF + tiqDvvK + kXgGNAj + mHgmbQD + XWUMHRe + lYGYbDn + UhtvKFN + bYbAjIz + ZIFGecR + yUkeLXy + fDFJsGk + Jdafmlz + pVLSmMx + "");
    }

    //垃圾方法
    private void JUoEvJey(char hwqtwgfyz0) {
        char hwqtwgfyz0a = hwqtwgfyz0;
    }

    //垃圾方法
    private void hFWMSwbR(float bwsrxwzbtm0, int ogsaozcs1, double vngurrwn2, boolean wqkmbiptd3) {
        boolean wqkmbiptd3a = wqkmbiptd3;
        double vngurrwn2a = vngurrwn2;
        int ogsaozcs1a = ogsaozcs1;
        float bwsrxwzbtm0a = bwsrxwzbtm0;
        new WeakReference("hFWMSwbR" + ogsaozcs1a + vngurrwn2a + wqkmbiptd3a + bwsrxwzbtm0a + "hFWMSwbR" + lYGYbDn + JyoKkBG + bYbAjIz + XWUMHRe + tiqDvvK + yUkeLXy + kXgGNAj + ePveDPs + mHgmbQD + qVhtnyF + cCwisJu + pVLSmMx + UhtvKFN + ZIFGecR + fDFJsGk + Jdafmlz + "");
    }

    //垃圾方法
    private void uszBySqE(char hzxifyfneb0, char yhxqhef1, short dzbfbfpy2, char eemsowkul3) {
        char eemsowkul3a = eemsowkul3;
        short dzbfbfpy2a = dzbfbfpy2;
        char yhxqhef1a = yhxqhef1;
        char hzxifyfneb0a = hzxifyfneb0;
        Log.w("uszBySqE", "uszBySqE" + hzxifyfneb0a + dzbfbfpy2a + eemsowkul3a + yhxqhef1a + "uszBySqE" + ePveDPs + lYGYbDn + Jdafmlz + yUkeLXy + JyoKkBG + mHgmbQD + fDFJsGk + pVLSmMx + tiqDvvK + ZIFGecR + kXgGNAj + bYbAjIz + UhtvKFN + qVhtnyF + cCwisJu + XWUMHRe + "");
    }

    //垃圾方法
    private void ArYxNPen(float rbklvdcjpr0, boolean iihlxwkab1, int douvdbyyk2, char srqnibcbcl3) {
        char srqnibcbcl3a = srqnibcbcl3;
        int douvdbyyk2a = douvdbyyk2;
        boolean iihlxwkab1a = iihlxwkab1;
        float rbklvdcjpr0a = rbklvdcjpr0;
        new String("ArYxNPen" + iihlxwkab1a + douvdbyyk2a + srqnibcbcl3a + rbklvdcjpr0a + "ArYxNPen" + ZIFGecR + ePveDPs + Jdafmlz + cCwisJu + fDFJsGk + JyoKkBG + pVLSmMx + kXgGNAj + qVhtnyF + tiqDvvK + UhtvKFN + yUkeLXy + XWUMHRe + bYbAjIz + lYGYbDn + mHgmbQD + "");
    }

    //垃圾方法
    private void kfHudWIW(int qkazfne0, byte uhrujuha1, long qgapoptk2) {
        long qgapoptk2a = qgapoptk2;
        byte uhrujuha1a = uhrujuha1;
        int qkazfne0a = qkazfne0;
        System.out.println("kfHudWIW" + qkazfne0a + qgapoptk2a + uhrujuha1a + "kfHudWIW" + fDFJsGk + bYbAjIz + JyoKkBG + lYGYbDn + UhtvKFN + yUkeLXy + kXgGNAj + cCwisJu + tiqDvvK + ePveDPs + XWUMHRe + mHgmbQD + qVhtnyF + ZIFGecR + Jdafmlz + pVLSmMx + "");
    }

    //垃圾方法
    private void URrksqby(int ucburqnbqz0, byte fkfqehh1, short ycsuaft2, byte xvculanszu3, double hvnqgmyqap4) {
        double hvnqgmyqap4a = hvnqgmyqap4;
        byte xvculanszu3a = xvculanszu3;
        short ycsuaft2a = ycsuaft2;
        byte fkfqehh1a = fkfqehh1;
        int ucburqnbqz0a = ucburqnbqz0;
        TextUtils.isEmpty("URrksqby" + ucburqnbqz0a + hvnqgmyqap4a + xvculanszu3a + ycsuaft2a + fkfqehh1a + "URrksqby" + UhtvKFN + qVhtnyF + pVLSmMx + fDFJsGk + Jdafmlz + ZIFGecR + JyoKkBG + XWUMHRe + mHgmbQD + bYbAjIz + kXgGNAj + lYGYbDn + ePveDPs + tiqDvvK + yUkeLXy + cCwisJu + "");
    }

    //垃圾方法
    private void gNhdycdx(char lfqggbstm0, float cnwjinql1) {
        float cnwjinql1a = cnwjinql1;
        char lfqggbstm0a = lfqggbstm0;
        Log.i("gNhdycdx", "gNhdycdx" + cnwjinql1a + lfqggbstm0a + "gNhdycdx" + mHgmbQD + ePveDPs + bYbAjIz + ZIFGecR + qVhtnyF + cCwisJu + lYGYbDn + pVLSmMx + yUkeLXy + tiqDvvK + UhtvKFN + kXgGNAj + XWUMHRe + fDFJsGk + Jdafmlz + JyoKkBG + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        float cnwjinql1 = 8.8f;
        char lfqggbstm0 = 14;
        double hvnqgmyqap4 = 42.42;
        byte xvculanszu3 = 90;
        short ycsuaft2 = 39;
        byte fkfqehh1 = 39;
        int ucburqnbqz0 = 88;
        long qgapoptk2 = 94L;
        byte uhrujuha1 = 35;
        int qkazfne0 = 47;
        char srqnibcbcl3 = 18;
        int douvdbyyk2 = 69;
        boolean iihlxwkab1 = true;
        float rbklvdcjpr0 = 64.64f;
        char eemsowkul3 = 47;
        short dzbfbfpy2 = 17;
        char yhxqhef1 = 78;
        char hzxifyfneb0 = 43;
        boolean wqkmbiptd3 = false;
        double vngurrwn2 = 80.80;
        int ogsaozcs1 = 4;
        float bwsrxwzbtm0 = 51.51f;
        char hwqtwgfyz0 = 8;
        byte tjyphfz4 = 32;
        boolean fcksyedvke3 = false;
        float flqbbvhh2 = 63.63f;
        int ryvrduluu1 = 66;
        double jynpuaviw0 = 3.3;
        float vkheklo4 = 63.63f;
        long zdbmnphuh3 = 5L;
        char jheniwhcfa2 = 44;
        float ramwrrh1 = 25.25f;
        double wxymupmj0 = 82.82;
        byte yiqtpejxqi2 = 28;
        int lyeyadwta1 = 55;
        boolean osxengacb0 = true;
        byte rkzduai4 = 6;
        boolean rzooner3 = true;
        long rjdvfwaiht2 = 58L;
        byte hwsrdoqr1 = 36;
        int vjekfqi0 = 72;
        long elhrpkxudh2 = 44L;
        boolean dvtpvayw1 = false;
        long betrggkn0 = 67L;
        ArYxNPen(rbklvdcjpr0, iihlxwkab1, douvdbyyk2, srqnibcbcl3);
        BItjzfUQ(jynpuaviw0, ryvrduluu1, flqbbvhh2, fcksyedvke3, tjyphfz4);
        uszBySqE(hzxifyfneb0, yhxqhef1, dzbfbfpy2, eemsowkul3);
        hFWMSwbR(bwsrxwzbtm0, ogsaozcs1, vngurrwn2, wqkmbiptd3);
        if (intent != null) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (RecoverOrgManager.isDebug) {
            kfHudWIW(qkazfne0, uhrujuha1, qgapoptk2);
            JUoEvJey(hwqtwgfyz0);
            INvwZknp(vjekfqi0, hwsrdoqr1, rjdvfwaiht2, rzooner3, rkzduai4);
            uszBySqE(hzxifyfneb0, yhxqhef1, dzbfbfpy2, eemsowkul3);
            JUoEvJey(hwqtwgfyz0);
            kfHudWIW(qkazfne0, uhrujuha1, qgapoptk2);
            BItjzfUQ(jynpuaviw0, ryvrduluu1, flqbbvhh2, fcksyedvke3, tjyphfz4);
            BItjzfUQ(jynpuaviw0, ryvrduluu1, flqbbvhh2, fcksyedvke3, tjyphfz4);
            INvwZknp(vjekfqi0, hwsrdoqr1, rjdvfwaiht2, rzooner3, rkzduai4);
            URrksqby(ucburqnbqz0, fkfqehh1, ycsuaft2, xvculanszu3, hvnqgmyqap4);
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void xfIRugHy(char qqnyoflqun0) {
        char qqnyoflqun0a = qqnyoflqun0;
        new AttributedString("xfIRugHy" + qqnyoflqun0a + "xfIRugHy" + mHgmbQD + ZIFGecR + pVLSmMx + cCwisJu + XWUMHRe + UhtvKFN + JyoKkBG + yUkeLXy + tiqDvvK + kXgGNAj + Jdafmlz + bYbAjIz + ePveDPs + qVhtnyF + fDFJsGk + lYGYbDn + "");
    }

    //垃圾方法
    private void uHuajkhA(int apdvszhrjf0, float jtdddpvdez1, boolean poyoojhysl2, char yrwjqgvi3, byte hqkypczb4) {
        byte hqkypczb4a = hqkypczb4;
        char yrwjqgvi3a = yrwjqgvi3;
        boolean poyoojhysl2a = poyoojhysl2;
        float jtdddpvdez1a = jtdddpvdez1;
        int apdvszhrjf0a = apdvszhrjf0;
        new String("uHuajkhA" + poyoojhysl2a + apdvszhrjf0a + hqkypczb4a + jtdddpvdez1a + yrwjqgvi3a + "uHuajkhA" + XWUMHRe + ePveDPs + cCwisJu + ZIFGecR + yUkeLXy + qVhtnyF + fDFJsGk + kXgGNAj + UhtvKFN + bYbAjIz + Jdafmlz + lYGYbDn + tiqDvvK + mHgmbQD + JyoKkBG + pVLSmMx + "");
    }

    //垃圾方法
    private void LJCJgSdT(char bzzmofvodz0, byte zskboaaswm1, int dvtmsgspzz2) {
        int dvtmsgspzz2a = dvtmsgspzz2;
        byte zskboaaswm1a = zskboaaswm1;
        char bzzmofvodz0a = bzzmofvodz0;
        TextUtils.isDigitsOnly("LJCJgSdT" + zskboaaswm1a + dvtmsgspzz2a + bzzmofvodz0a + "LJCJgSdT" + qVhtnyF + UhtvKFN + ePveDPs + bYbAjIz + yUkeLXy + fDFJsGk + kXgGNAj + JyoKkBG + Jdafmlz + mHgmbQD + XWUMHRe + cCwisJu + tiqDvvK + lYGYbDn + ZIFGecR + pVLSmMx + "");
    }

    //垃圾方法
    private void crnUqLcZ(short dqeikfndrn0, float mrdjtmpynb1, int zdocdiuv2, int jfwzdtylb3) {
        int jfwzdtylb3a = jfwzdtylb3;
        int zdocdiuv2a = zdocdiuv2;
        float mrdjtmpynb1a = mrdjtmpynb1;
        short dqeikfndrn0a = dqeikfndrn0;
        TextUtils.isDigitsOnly("crnUqLcZ" + jfwzdtylb3a + zdocdiuv2a + dqeikfndrn0a + mrdjtmpynb1a + "crnUqLcZ" + ZIFGecR + ePveDPs + bYbAjIz + Jdafmlz + JyoKkBG + cCwisJu + UhtvKFN + yUkeLXy + XWUMHRe + lYGYbDn + qVhtnyF + pVLSmMx + tiqDvvK + fDFJsGk + kXgGNAj + mHgmbQD + "");
    }

    //垃圾方法
    private void XHPIWCtS(double qdtvsxbxc0, boolean qiivwxz1, char lipmuehurd2, boolean ozszfkomvj3) {
        boolean ozszfkomvj3a = ozszfkomvj3;
        char lipmuehurd2a = lipmuehurd2;
        boolean qiivwxz1a = qiivwxz1;
        double qdtvsxbxc0a = qdtvsxbxc0;
        new File("XHPIWCtS" + qdtvsxbxc0a + qiivwxz1a + ozszfkomvj3a + lipmuehurd2a + "XHPIWCtS" + tiqDvvK + lYGYbDn + kXgGNAj + ePveDPs + XWUMHRe + pVLSmMx + JyoKkBG + mHgmbQD + fDFJsGk + bYbAjIz + qVhtnyF + Jdafmlz + ZIFGecR + yUkeLXy + UhtvKFN + cCwisJu + "");
    }

    //垃圾方法
    private void UzpdQlra(boolean jdgtldnt0, char dtwfydhb1, boolean csvczkac2, float ozwfdwl3) {
        float ozwfdwl3a = ozwfdwl3;
        boolean csvczkac2a = csvczkac2;
        char dtwfydhb1a = dtwfydhb1;
        boolean jdgtldnt0a = jdgtldnt0;
        new StringBuffer("UzpdQlra" + dtwfydhb1a + csvczkac2a + ozwfdwl3a + jdgtldnt0a + "UzpdQlra" + XWUMHRe + mHgmbQD + qVhtnyF + cCwisJu + pVLSmMx + bYbAjIz + kXgGNAj + lYGYbDn + fDFJsGk + JyoKkBG + tiqDvvK + yUkeLXy + UhtvKFN + ZIFGecR + Jdafmlz + ePveDPs + "");
    }

    //垃圾方法
    private void NxUQJKEI(char dcevwafsrg0, float qjnjfskhs1, short rlfqytieao2) {
        short rlfqytieao2a = rlfqytieao2;
        float qjnjfskhs1a = qjnjfskhs1;
        char dcevwafsrg0a = dcevwafsrg0;
        new Intent("NxUQJKEI" + dcevwafsrg0a + qjnjfskhs1a + rlfqytieao2a + "NxUQJKEI" + mHgmbQD + kXgGNAj + JyoKkBG + bYbAjIz + Jdafmlz + qVhtnyF + ZIFGecR + fDFJsGk + tiqDvvK + XWUMHRe + UhtvKFN + lYGYbDn + ePveDPs + yUkeLXy + pVLSmMx + cCwisJu + "");
    }

    //垃圾方法
    private void YhLZeUyO(float gxuzlnb0, float avdgmikjk1, byte wtkifeqqtl2) {
        byte wtkifeqqtl2a = wtkifeqqtl2;
        float avdgmikjk1a = avdgmikjk1;
        float gxuzlnb0a = gxuzlnb0;
        new StringBuilder("YhLZeUyO" + avdgmikjk1a + wtkifeqqtl2a + gxuzlnb0a + "YhLZeUyO" + ePveDPs + bYbAjIz + ZIFGecR + pVLSmMx + XWUMHRe + fDFJsGk + kXgGNAj + cCwisJu + qVhtnyF + mHgmbQD + lYGYbDn + yUkeLXy + tiqDvvK + JyoKkBG + Jdafmlz + UhtvKFN + "");
    }

    public boolean onUnbind(Intent intent) {
        byte wtkifeqqtl2 = 65;
        float avdgmikjk1 = 90.90f;
        float gxuzlnb0 = 21.21f;
        short rlfqytieao2 = 16;
        float qjnjfskhs1 = 35.35f;
        char dcevwafsrg0 = 35;
        float ozwfdwl3 = 17.17f;
        boolean csvczkac2 = false;
        char dtwfydhb1 = 69;
        boolean jdgtldnt0 = true;
        boolean ozszfkomvj3 = true;
        char lipmuehurd2 = 61;
        boolean qiivwxz1 = true;
        double qdtvsxbxc0 = 19.19;
        int jfwzdtylb3 = 100;
        int zdocdiuv2 = 59;
        float mrdjtmpynb1 = 41.41f;
        short dqeikfndrn0 = 7;
        int dvtmsgspzz2 = 32;
        byte zskboaaswm1 = 81;
        char bzzmofvodz0 = 70;
        byte hqkypczb4 = 2;
        char yrwjqgvi3 = 10;
        boolean poyoojhysl2 = false;
        float jtdddpvdez1 = 16.16f;
        int apdvszhrjf0 = 49;
        char qqnyoflqun0 = 6;
        XHPIWCtS(qdtvsxbxc0, qiivwxz1, lipmuehurd2, ozszfkomvj3);
        UzpdQlra(jdgtldnt0, dtwfydhb1, csvczkac2, ozwfdwl3);
        xfIRugHy(qqnyoflqun0);
        NxUQJKEI(dcevwafsrg0, qjnjfskhs1, rlfqytieao2);
        crnUqLcZ(dqeikfndrn0, mrdjtmpynb1, zdocdiuv2, jfwzdtylb3);
        YhLZeUyO(gxuzlnb0, avdgmikjk1, wtkifeqqtl2);
        uHuajkhA(apdvszhrjf0, jtdddpvdez1, poyoojhysl2, yrwjqgvi3, hqkypczb4);
        xfIRugHy(qqnyoflqun0);
        if (RecoverOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void vIbIuAwu(short awbhsqeby0, byte ppczhivvk1) {
        byte ppczhivvk1a = ppczhivvk1;
        short awbhsqeby0a = awbhsqeby0;
        new Intent("vIbIuAwu" + ppczhivvk1a + awbhsqeby0a + "vIbIuAwu" + JyoKkBG + ePveDPs + lYGYbDn + UhtvKFN + yUkeLXy + tiqDvvK + fDFJsGk + XWUMHRe + qVhtnyF + ZIFGecR + pVLSmMx + Jdafmlz + bYbAjIz + cCwisJu + mHgmbQD + kXgGNAj + "");
    }

    //垃圾方法
    private void jxtOrjrD(int qqdxtzai0, long wgmnudzuk1, boolean qsyonyal2) {
        boolean qsyonyal2a = qsyonyal2;
        long wgmnudzuk1a = wgmnudzuk1;
        int qqdxtzai0a = qqdxtzai0;
        new Intent("jxtOrjrD" + wgmnudzuk1a + qsyonyal2a + qqdxtzai0a + "jxtOrjrD" + ZIFGecR + cCwisJu + kXgGNAj + UhtvKFN + qVhtnyF + JyoKkBG + pVLSmMx + fDFJsGk + mHgmbQD + ePveDPs + bYbAjIz + XWUMHRe + lYGYbDn + yUkeLXy + tiqDvvK + Jdafmlz + "");
    }

    //垃圾方法
    private void VPFqEmUa(byte bfphaerwr0, byte pzzodbcn1) {
        byte pzzodbcn1a = pzzodbcn1;
        byte bfphaerwr0a = bfphaerwr0;
        Log.w("VPFqEmUa", "VPFqEmUa" + bfphaerwr0a + pzzodbcn1a + "VPFqEmUa" + ZIFGecR + cCwisJu + ePveDPs + UhtvKFN + XWUMHRe + mHgmbQD + yUkeLXy + kXgGNAj + qVhtnyF + tiqDvvK + pVLSmMx + Jdafmlz + bYbAjIz + lYGYbDn + JyoKkBG + fDFJsGk + "");
    }

    //垃圾方法
    private void bpLOsacQ(long esqqqswhy0, double exrrndg1) {
        double exrrndg1a = exrrndg1;
        long esqqqswhy0a = esqqqswhy0;
        System.out.println("bpLOsacQ" + esqqqswhy0a + exrrndg1a + "bpLOsacQ" + ZIFGecR + ePveDPs + cCwisJu + bYbAjIz + kXgGNAj + XWUMHRe + Jdafmlz + fDFJsGk + tiqDvvK + qVhtnyF + yUkeLXy + pVLSmMx + mHgmbQD + JyoKkBG + UhtvKFN + lYGYbDn + "");
    }

    //垃圾方法
    private void HRmOMKVh(char vgwmhjgpte0, byte upngzqgceb1, double ttqxohpvi2, float ulpokzq3, float yzqncrfna4) {
        float yzqncrfna4a = yzqncrfna4;
        float ulpokzq3a = ulpokzq3;
        double ttqxohpvi2a = ttqxohpvi2;
        byte upngzqgceb1a = upngzqgceb1;
        char vgwmhjgpte0a = vgwmhjgpte0;
        new File("HRmOMKVh" + ttqxohpvi2a + upngzqgceb1a + yzqncrfna4a + ulpokzq3a + vgwmhjgpte0a + "HRmOMKVh" + yUkeLXy + lYGYbDn + kXgGNAj + ZIFGecR + JyoKkBG + UhtvKFN + tiqDvvK + cCwisJu + XWUMHRe + mHgmbQD + ePveDPs + bYbAjIz + fDFJsGk + Jdafmlz + qVhtnyF + pVLSmMx + "");
    }

    //垃圾方法
    private void TTUmEPqU(boolean rlyflfixr0, double ompkxdflvy1) {
        double ompkxdflvy1a = ompkxdflvy1;
        boolean rlyflfixr0a = rlyflfixr0;
        new File("TTUmEPqU" + ompkxdflvy1a + rlyflfixr0a + "TTUmEPqU" + ePveDPs + XWUMHRe + tiqDvvK + cCwisJu + qVhtnyF + fDFJsGk + yUkeLXy + ZIFGecR + lYGYbDn + bYbAjIz + mHgmbQD + kXgGNAj + pVLSmMx + JyoKkBG + Jdafmlz + UhtvKFN + "");
    }

    //垃圾方法
    private void DENHmDOo(boolean yinbvmv0, boolean jfgihrw1, byte uacbpyosg2, byte kkxebzz3, byte iigrbzqab4) {
        byte iigrbzqab4a = iigrbzqab4;
        byte kkxebzz3a = kkxebzz3;
        byte uacbpyosg2a = uacbpyosg2;
        boolean jfgihrw1a = jfgihrw1;
        boolean yinbvmv0a = yinbvmv0;
        new AttributedString("DENHmDOo" + uacbpyosg2a + jfgihrw1a + kkxebzz3a + yinbvmv0a + iigrbzqab4a + "DENHmDOo" + Jdafmlz + tiqDvvK + XWUMHRe + JyoKkBG + qVhtnyF + ePveDPs + cCwisJu + pVLSmMx + mHgmbQD + kXgGNAj + bYbAjIz + ZIFGecR + UhtvKFN + lYGYbDn + fDFJsGk + yUkeLXy + "");
    }

    //垃圾方法
    private void GIbFWMGe(double pczlvjzv0, double vlhhgne1, boolean cnolfaxj2, float gypxyfm3, long deyykzcslq4) {
        long deyykzcslq4a = deyykzcslq4;
        float gypxyfm3a = gypxyfm3;
        boolean cnolfaxj2a = cnolfaxj2;
        double vlhhgne1a = vlhhgne1;
        double pczlvjzv0a = pczlvjzv0;
        Log.w("GIbFWMGe", "GIbFWMGe" + gypxyfm3a + pczlvjzv0a + vlhhgne1a + deyykzcslq4a + cnolfaxj2a + "GIbFWMGe" + bYbAjIz + lYGYbDn + UhtvKFN + XWUMHRe + ZIFGecR + pVLSmMx + ePveDPs + qVhtnyF + tiqDvvK + Jdafmlz + cCwisJu + fDFJsGk + mHgmbQD + yUkeLXy + JyoKkBG + kXgGNAj + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        long deyykzcslq4 = 82L;
        float gypxyfm3 = 23.23f;
        boolean cnolfaxj2 = true;
        double vlhhgne1 = 19.19;
        double pczlvjzv0 = 100.100;
        byte iigrbzqab4 = 87;
        byte kkxebzz3 = 49;
        byte uacbpyosg2 = 89;
        boolean jfgihrw1 = true;
        boolean yinbvmv0 = false;
        double ompkxdflvy1 = 61.61;
        boolean rlyflfixr0 = false;
        float yzqncrfna4 = 0.0f;
        float ulpokzq3 = 97.97f;
        double ttqxohpvi2 = 50.50;
        byte upngzqgceb1 = 34;
        char vgwmhjgpte0 = 41;
        double exrrndg1 = 9.9;
        long esqqqswhy0 = 58L;
        byte pzzodbcn1 = 71;
        byte bfphaerwr0 = 66;
        boolean qsyonyal2 = true;
        long wgmnudzuk1 = 97L;
        int qqdxtzai0 = 5;
        byte ppczhivvk1 = 84;
        short awbhsqeby0 = 71;
        if (RecoverOrgManager.isDebug) {
            DENHmDOo(yinbvmv0, jfgihrw1, uacbpyosg2, kkxebzz3, iigrbzqab4);
            GIbFWMGe(pczlvjzv0, vlhhgne1, cnolfaxj2, gypxyfm3, deyykzcslq4);
            HRmOMKVh(vgwmhjgpte0, upngzqgceb1, ttqxohpvi2, ulpokzq3, yzqncrfna4);
            bpLOsacQ(esqqqswhy0, exrrndg1);
            jxtOrjrD(qqdxtzai0, wgmnudzuk1, qsyonyal2);
            VPFqEmUa(bfphaerwr0, pzzodbcn1);
            GIbFWMGe(pczlvjzv0, vlhhgne1, cnolfaxj2, gypxyfm3, deyykzcslq4);
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        DENHmDOo(yinbvmv0, jfgihrw1, uacbpyosg2, kkxebzz3, iigrbzqab4);
        VPFqEmUa(bfphaerwr0, pzzodbcn1);
        DENHmDOo(yinbvmv0, jfgihrw1, uacbpyosg2, kkxebzz3, iigrbzqab4);
        HRmOMKVh(vgwmhjgpte0, upngzqgceb1, ttqxohpvi2, ulpokzq3, yzqncrfna4);
        vIbIuAwu(awbhsqeby0, ppczhivvk1);
        return this.mServiceBinder;
    }

    //垃圾方法
    private void DafEyIxr(int yhuqtvgzps0, int ustpwrj1) {
        int ustpwrj1a = ustpwrj1;
        int yhuqtvgzps0a = yhuqtvgzps0;
        new WeakReference("DafEyIxr" + yhuqtvgzps0a + ustpwrj1a + "DafEyIxr" + pVLSmMx + tiqDvvK + qVhtnyF + ZIFGecR + JyoKkBG + bYbAjIz + fDFJsGk + lYGYbDn + cCwisJu + Jdafmlz + UhtvKFN + mHgmbQD + yUkeLXy + ePveDPs + kXgGNAj + XWUMHRe + "");
    }

    //垃圾方法
    private void qXzbLJiA(byte szqpogrc0, short bclvmseh1, double cxjvhrpkrb2) {
        double cxjvhrpkrb2a = cxjvhrpkrb2;
        short bclvmseh1a = bclvmseh1;
        byte szqpogrc0a = szqpogrc0;
        new StringBuffer("qXzbLJiA" + szqpogrc0a + bclvmseh1a + cxjvhrpkrb2a + "qXzbLJiA" + XWUMHRe + qVhtnyF + mHgmbQD + lYGYbDn + yUkeLXy + ZIFGecR + kXgGNAj + fDFJsGk + cCwisJu + JyoKkBG + pVLSmMx + Jdafmlz + bYbAjIz + tiqDvvK + ePveDPs + UhtvKFN + "");
    }

    //垃圾方法
    private void mxZMSckD(byte qozkrui0, double kgzeucy1, double tqfzbnl2, boolean tkkiioaqec3, long dugzgucxsh4) {
        long dugzgucxsh4a = dugzgucxsh4;
        boolean tkkiioaqec3a = tkkiioaqec3;
        double tqfzbnl2a = tqfzbnl2;
        double kgzeucy1a = kgzeucy1;
        byte qozkrui0a = qozkrui0;
        new StringReader("mxZMSckD" + qozkrui0a + dugzgucxsh4a + tqfzbnl2a + kgzeucy1a + tkkiioaqec3a + "mxZMSckD" + mHgmbQD + JyoKkBG + cCwisJu + tiqDvvK + fDFJsGk + lYGYbDn + ePveDPs + pVLSmMx + ZIFGecR + XWUMHRe + UhtvKFN + kXgGNAj + qVhtnyF + yUkeLXy + bYbAjIz + Jdafmlz + "");
    }

    //垃圾方法
    private void VVLoyKTF(long kqyldosomg0, byte gaspvao1, boolean wwutkcqn2, short ijvablutq3) {
        short ijvablutq3a = ijvablutq3;
        boolean wwutkcqn2a = wwutkcqn2;
        byte gaspvao1a = gaspvao1;
        long kqyldosomg0a = kqyldosomg0;
        new StringBuilder("VVLoyKTF" + gaspvao1a + wwutkcqn2a + ijvablutq3a + kqyldosomg0a + "VVLoyKTF" + pVLSmMx + yUkeLXy + cCwisJu + lYGYbDn + JyoKkBG + ePveDPs + tiqDvvK + bYbAjIz + UhtvKFN + fDFJsGk + qVhtnyF + XWUMHRe + Jdafmlz + kXgGNAj + ZIFGecR + mHgmbQD + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        short ijvablutq3 = 19;
        boolean wwutkcqn2 = false;
        byte gaspvao1 = 95;
        long kqyldosomg0 = 85L;
        long dugzgucxsh4 = 42L;
        boolean tkkiioaqec3 = false;
        double tqfzbnl2 = 71.71;
        double kgzeucy1 = 56.56;
        byte qozkrui0 = 97;
        double cxjvhrpkrb2 = 80.80;
        short bclvmseh1 = 18;
        byte szqpogrc0 = 38;
        int ustpwrj1 = 30;
        int yhuqtvgzps0 = 16;
        DafEyIxr(yhuqtvgzps0, ustpwrj1);
        mxZMSckD(qozkrui0, kgzeucy1, tqfzbnl2, tkkiioaqec3, dugzgucxsh4);
        qXzbLJiA(szqpogrc0, bclvmseh1, cxjvhrpkrb2);
        mxZMSckD(qozkrui0, kgzeucy1, tqfzbnl2, tkkiioaqec3, dugzgucxsh4);
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            if (RecoverOrgManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            this.doStartMainService();
            this.doBindMainService();
            VVLoyKTF(kqyldosomg0, gaspvao1, wwutkcqn2, ijvablutq3);
            DafEyIxr(yhuqtvgzps0, ustpwrj1);
            VVLoyKTF(kqyldosomg0, gaspvao1, wwutkcqn2, ijvablutq3);
            DafEyIxr(yhuqtvgzps0, ustpwrj1);
            mxZMSckD(qozkrui0, kgzeucy1, tqfzbnl2, tkkiioaqec3, dugzgucxsh4);
            VVLoyKTF(kqyldosomg0, gaspvao1, wwutkcqn2, ijvablutq3);
            mxZMSckD(qozkrui0, kgzeucy1, tqfzbnl2, tkkiioaqec3, dugzgucxsh4);
            qXzbLJiA(szqpogrc0, bclvmseh1, cxjvhrpkrb2);
            mxZMSckD(qozkrui0, kgzeucy1, tqfzbnl2, tkkiioaqec3, dugzgucxsh4);
            mxZMSckD(qozkrui0, kgzeucy1, tqfzbnl2, tkkiioaqec3, dugzgucxsh4);
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                if (RecoverOrgManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void rQMhaitp(long eebeyzcgmg0, float ephvockui1) {
        float ephvockui1a = ephvockui1;
        long eebeyzcgmg0a = eebeyzcgmg0;
        System.out.println("rQMhaitp" + ephvockui1a + eebeyzcgmg0a + "rQMhaitp" + tiqDvvK + XWUMHRe + cCwisJu + ZIFGecR + yUkeLXy + qVhtnyF + JyoKkBG + fDFJsGk + lYGYbDn + Jdafmlz + UhtvKFN + kXgGNAj + bYbAjIz + ePveDPs + mHgmbQD + pVLSmMx + "");
    }

    //垃圾方法
    private void kiQjliug(char tgjeqslar0, char oklyghpfc1, double wulircw2, double htdkbhqu3) {
        double htdkbhqu3a = htdkbhqu3;
        double wulircw2a = wulircw2;
        char oklyghpfc1a = oklyghpfc1;
        char tgjeqslar0a = tgjeqslar0;
        TextUtils.isDigitsOnly("kiQjliug" + htdkbhqu3a + tgjeqslar0a + wulircw2a + oklyghpfc1a + "kiQjliug" + UhtvKFN + ZIFGecR + XWUMHRe + cCwisJu + kXgGNAj + JyoKkBG + fDFJsGk + Jdafmlz + bYbAjIz + mHgmbQD + tiqDvvK + lYGYbDn + ePveDPs + pVLSmMx + yUkeLXy + qVhtnyF + "");
    }

    //垃圾方法
    private void wvHAtXcY(byte trcrltsqc0, long gzyhjfhujn1, double avwmfehpk2, char pdxavvxcv3) {
        char pdxavvxcv3a = pdxavvxcv3;
        double avwmfehpk2a = avwmfehpk2;
        long gzyhjfhujn1a = gzyhjfhujn1;
        byte trcrltsqc0a = trcrltsqc0;
        new String("wvHAtXcY" + gzyhjfhujn1a + trcrltsqc0a + pdxavvxcv3a + avwmfehpk2a + "wvHAtXcY" + ZIFGecR + yUkeLXy + JyoKkBG + Jdafmlz + kXgGNAj + cCwisJu + bYbAjIz + ePveDPs + XWUMHRe + qVhtnyF + pVLSmMx + mHgmbQD + tiqDvvK + UhtvKFN + fDFJsGk + lYGYbDn + "");
    }

    //垃圾方法
    private void UGZzpyHH(double rssbiyqfv0, int vimwbrocp1, float gluxovaap2, int zciaeet3, int ojkoybvyd4) {
        int ojkoybvyd4a = ojkoybvyd4;
        int zciaeet3a = zciaeet3;
        float gluxovaap2a = gluxovaap2;
        int vimwbrocp1a = vimwbrocp1;
        double rssbiyqfv0a = rssbiyqfv0;
        new File("UGZzpyHH" + vimwbrocp1a + gluxovaap2a + ojkoybvyd4a + zciaeet3a + rssbiyqfv0a + "UGZzpyHH" + mHgmbQD + ZIFGecR + cCwisJu + yUkeLXy + kXgGNAj + Jdafmlz + ePveDPs + JyoKkBG + pVLSmMx + XWUMHRe + lYGYbDn + tiqDvvK + bYbAjIz + qVhtnyF + UhtvKFN + fDFJsGk + "");
    }

    private void doStartMainService() {
        int ojkoybvyd4 = 10;
        int zciaeet3 = 38;
        float gluxovaap2 = 77.77f;
        int vimwbrocp1 = 39;
        double rssbiyqfv0 = 16.16;
        char pdxavvxcv3 = 32;
        double avwmfehpk2 = 50.50;
        long gzyhjfhujn1 = 39L;
        byte trcrltsqc0 = 61;
        double htdkbhqu3 = 100.100;
        double wulircw2 = 37.37;
        char oklyghpfc1 = 100;
        char tgjeqslar0 = 50;
        float ephvockui1 = 32.32f;
        long eebeyzcgmg0 = 94L;
        try {
            Intent intent = new Intent(this, Recover1Service.class);
            wvHAtXcY(trcrltsqc0, gzyhjfhujn1, avwmfehpk2, pdxavvxcv3);
            kiQjliug(tgjeqslar0, oklyghpfc1, wulircw2, htdkbhqu3);
            kiQjliug(tgjeqslar0, oklyghpfc1, wulircw2, htdkbhqu3);
            intent.putExtra("isStartService", true);
            rQMhaitp(eebeyzcgmg0, ephvockui1);
            kiQjliug(tgjeqslar0, oklyghpfc1, wulircw2, htdkbhqu3);
            rQMhaitp(eebeyzcgmg0, ephvockui1);
            kiQjliug(tgjeqslar0, oklyghpfc1, wulircw2, htdkbhqu3);
            UGZzpyHH(rssbiyqfv0, vimwbrocp1, gluxovaap2, zciaeet3, ojkoybvyd4);
            UGZzpyHH(rssbiyqfv0, vimwbrocp1, gluxovaap2, zciaeet3, ojkoybvyd4);
            rQMhaitp(eebeyzcgmg0, ephvockui1);
            UGZzpyHH(rssbiyqfv0, vimwbrocp1, gluxovaap2, zciaeet3, ojkoybvyd4);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (RecoverOrgManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void zWIInFkC(byte pejdocjh0, double ckmsessx1, short wvsblqz2, byte rmlnzcu3, long ajtfabbzbo4) {
        long ajtfabbzbo4a = ajtfabbzbo4;
        byte rmlnzcu3a = rmlnzcu3;
        short wvsblqz2a = wvsblqz2;
        double ckmsessx1a = ckmsessx1;
        byte pejdocjh0a = pejdocjh0;
        Log.e("zWIInFkC", "zWIInFkC" + rmlnzcu3a + ckmsessx1a + ajtfabbzbo4a + pejdocjh0a + wvsblqz2a + "zWIInFkC" + lYGYbDn + XWUMHRe + ePveDPs + pVLSmMx + mHgmbQD + ZIFGecR + bYbAjIz + tiqDvvK + yUkeLXy + Jdafmlz + kXgGNAj + JyoKkBG + fDFJsGk + UhtvKFN + qVhtnyF + cCwisJu + "");
    }

    //垃圾方法
    private void yrlhtFOt(short vklknwugv0, long rdmpqoqmad1, float agszjnzu2) {
        float agszjnzu2a = agszjnzu2;
        long rdmpqoqmad1a = rdmpqoqmad1;
        short vklknwugv0a = vklknwugv0;
        System.out.println("yrlhtFOt" + rdmpqoqmad1a + vklknwugv0a + agszjnzu2a + "yrlhtFOt" + Jdafmlz + kXgGNAj + yUkeLXy + cCwisJu + fDFJsGk + bYbAjIz + ZIFGecR + tiqDvvK + XWUMHRe + JyoKkBG + lYGYbDn + ePveDPs + qVhtnyF + pVLSmMx + mHgmbQD + UhtvKFN + "");
    }

    //垃圾方法
    private void kSUrKssM(int pyohxplopi0) {
        int pyohxplopi0a = pyohxplopi0;
        Log.w("kSUrKssM", "kSUrKssM" + pyohxplopi0a + "kSUrKssM" + pVLSmMx + UhtvKFN + XWUMHRe + JyoKkBG + lYGYbDn + cCwisJu + Jdafmlz + qVhtnyF + mHgmbQD + ZIFGecR + bYbAjIz + yUkeLXy + fDFJsGk + ePveDPs + tiqDvvK + kXgGNAj + "");
    }

    //垃圾方法
    private void DHBbHiqQ(short ldvelusmfu0, long qbqfnocf1, float zingmclihs2, char unipmxgg3, byte oecytpb4) {
        byte oecytpb4a = oecytpb4;
        char unipmxgg3a = unipmxgg3;
        float zingmclihs2a = zingmclihs2;
        long qbqfnocf1a = qbqfnocf1;
        short ldvelusmfu0a = ldvelusmfu0;
        new Thread("DHBbHiqQ" + ldvelusmfu0a + zingmclihs2a + unipmxgg3a + oecytpb4a + qbqfnocf1a + "DHBbHiqQ" + tiqDvvK + JyoKkBG + UhtvKFN + XWUMHRe + lYGYbDn + kXgGNAj + bYbAjIz + Jdafmlz + pVLSmMx + ZIFGecR + mHgmbQD + qVhtnyF + fDFJsGk + yUkeLXy + ePveDPs + cCwisJu + "");
    }

    //垃圾方法
    private void bNwVNFFL(long ohcincdqwa0, short skhgxdnmu1) {
        short skhgxdnmu1a = skhgxdnmu1;
        long ohcincdqwa0a = ohcincdqwa0;
        Log.e("bNwVNFFL", "bNwVNFFL" + skhgxdnmu1a + ohcincdqwa0a + "bNwVNFFL" + cCwisJu + kXgGNAj + ZIFGecR + yUkeLXy + pVLSmMx + ePveDPs + mHgmbQD + JyoKkBG + tiqDvvK + lYGYbDn + Jdafmlz + qVhtnyF + XWUMHRe + bYbAjIz + UhtvKFN + fDFJsGk + "");
    }

    //垃圾方法
    private void FRBegbDg(long soerzspd0, float ckhctbpyt1) {
        float ckhctbpyt1a = ckhctbpyt1;
        long soerzspd0a = soerzspd0;
        new StringReader("FRBegbDg" + soerzspd0a + ckhctbpyt1a + "FRBegbDg" + pVLSmMx + Jdafmlz + ZIFGecR + qVhtnyF + mHgmbQD + yUkeLXy + XWUMHRe + lYGYbDn + fDFJsGk + UhtvKFN + JyoKkBG + cCwisJu + kXgGNAj + ePveDPs + tiqDvvK + bYbAjIz + "");
    }

    //垃圾方法
    private void ylotcWBo(long ahlqrmbrzu0, float bsybfzoci1, int gcyvrcjvbb2) {
        int gcyvrcjvbb2a = gcyvrcjvbb2;
        float bsybfzoci1a = bsybfzoci1;
        long ahlqrmbrzu0a = ahlqrmbrzu0;
        new StringBuilder("ylotcWBo" + gcyvrcjvbb2a + ahlqrmbrzu0a + bsybfzoci1a + "ylotcWBo" + lYGYbDn + UhtvKFN + qVhtnyF + ePveDPs + mHgmbQD + bYbAjIz + kXgGNAj + XWUMHRe + JyoKkBG + tiqDvvK + pVLSmMx + cCwisJu + Jdafmlz + yUkeLXy + ZIFGecR + fDFJsGk + "");
    }

    //垃圾方法
    private void nZDtBuyH(float jrqwxfsjlt0, int uyoezhv1, int infpylqra2) {
        int infpylqra2a = infpylqra2;
        int uyoezhv1a = uyoezhv1;
        float jrqwxfsjlt0a = jrqwxfsjlt0;
    }

    private void doBindMainService() {
        int infpylqra2 = 69;
        int uyoezhv1 = 72;
        float jrqwxfsjlt0 = 2.2f;
        int gcyvrcjvbb2 = 39;
        float bsybfzoci1 = 61.61f;
        long ahlqrmbrzu0 = 46L;
        float ckhctbpyt1 = 15.15f;
        long soerzspd0 = 55L;
        short skhgxdnmu1 = 84;
        long ohcincdqwa0 = 91L;
        byte oecytpb4 = 68;
        char unipmxgg3 = 77;
        float zingmclihs2 = 94.94f;
        long qbqfnocf1 = 20L;
        short ldvelusmfu0 = 47;
        int pyohxplopi0 = 94;
        float agszjnzu2 = 32.32f;
        long rdmpqoqmad1 = 0L;
        short vklknwugv0 = 47;
        long ajtfabbzbo4 = 87L;
        byte rmlnzcu3 = 12;
        short wvsblqz2 = 83;
        double ckmsessx1 = 81.81;
        byte pejdocjh0 = 87;
        FRBegbDg(soerzspd0, ckhctbpyt1);
        yrlhtFOt(vklknwugv0, rdmpqoqmad1, agszjnzu2);
        nZDtBuyH(jrqwxfsjlt0, uyoezhv1, infpylqra2);
        FRBegbDg(soerzspd0, ckhctbpyt1);
        nZDtBuyH(jrqwxfsjlt0, uyoezhv1, infpylqra2);
        yrlhtFOt(vklknwugv0, rdmpqoqmad1, agszjnzu2);
        nZDtBuyH(jrqwxfsjlt0, uyoezhv1, infpylqra2);
        bNwVNFFL(ohcincdqwa0, skhgxdnmu1);
        if (RecoverOrgManager.isDebug) {
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        zWIInFkC(pejdocjh0, ckmsessx1, wvsblqz2, rmlnzcu3, ajtfabbzbo4);
        FRBegbDg(soerzspd0, ckhctbpyt1);
        kSUrKssM(pyohxplopi0);
        FRBegbDg(soerzspd0, ckhctbpyt1);
        bNwVNFFL(ohcincdqwa0, skhgxdnmu1);
        DHBbHiqQ(ldvelusmfu0, qbqfnocf1, zingmclihs2, unipmxgg3, oecytpb4);
        try {
            this.bindService(new Intent(this, Recover1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (RecoverOrgManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void oOorOfJO(long zeadbewbje0, int hhgmabuc1) {
        int hhgmabuc1a = hhgmabuc1;
        long zeadbewbje0a = zeadbewbje0;
        Log.w("oOorOfJO", "oOorOfJO" + hhgmabuc1a + zeadbewbje0a + "oOorOfJO" + kXgGNAj + cCwisJu + qVhtnyF + tiqDvvK + fDFJsGk + mHgmbQD + lYGYbDn + XWUMHRe + JyoKkBG + pVLSmMx + Jdafmlz + UhtvKFN + yUkeLXy + bYbAjIz + ZIFGecR + ePveDPs + "");
    }

    //垃圾方法
    private void hgDuZeCU(long xefdlnjfjn0, short gdampkt1) {
        short gdampkt1a = gdampkt1;
        long xefdlnjfjn0a = xefdlnjfjn0;
        new StringBuffer("hgDuZeCU" + gdampkt1a + xefdlnjfjn0a + "hgDuZeCU" + UhtvKFN + lYGYbDn + ZIFGecR + JyoKkBG + qVhtnyF + tiqDvvK + kXgGNAj + cCwisJu + XWUMHRe + pVLSmMx + fDFJsGk + ePveDPs + yUkeLXy + mHgmbQD + Jdafmlz + bYbAjIz + "");
    }

    //垃圾方法
    private void kXfLtWwm(int yzwziupi0, byte kslfvnm1, float gigdlwnda2, double ofwfigwbxf3) {
        double ofwfigwbxf3a = ofwfigwbxf3;
        float gigdlwnda2a = gigdlwnda2;
        byte kslfvnm1a = kslfvnm1;
        int yzwziupi0a = yzwziupi0;
        new Thread("kXfLtWwm" + kslfvnm1a + ofwfigwbxf3a + yzwziupi0a + gigdlwnda2a + "kXfLtWwm" + mHgmbQD + yUkeLXy + XWUMHRe + kXgGNAj + Jdafmlz + tiqDvvK + ZIFGecR + bYbAjIz + lYGYbDn + fDFJsGk + pVLSmMx + UhtvKFN + ePveDPs + JyoKkBG + qVhtnyF + cCwisJu + "");
    }

    //垃圾方法
    private void tHrOBHpk(char ttppdtgio0, short skuwvsssl1, char hqwatcm2, char hpibolbng3, int dmbwuqomnw4) {
        int dmbwuqomnw4a = dmbwuqomnw4;
        char hpibolbng3a = hpibolbng3;
        char hqwatcm2a = hqwatcm2;
        short skuwvsssl1a = skuwvsssl1;
        char ttppdtgio0a = ttppdtgio0;
        TextUtils.isDigitsOnly("tHrOBHpk" + dmbwuqomnw4a + ttppdtgio0a + hpibolbng3a + hqwatcm2a + skuwvsssl1a + "tHrOBHpk" + ZIFGecR + qVhtnyF + UhtvKFN + kXgGNAj + cCwisJu + ePveDPs + mHgmbQD + JyoKkBG + Jdafmlz + XWUMHRe + pVLSmMx + yUkeLXy + tiqDvvK + fDFJsGk + bYbAjIz + lYGYbDn + "");
    }

    //垃圾方法
    private void hHgAYtHC(long vqxvfft0, float qxhdtqpej1) {
        float qxhdtqpej1a = qxhdtqpej1;
        long vqxvfft0a = vqxvfft0;
    }

    //垃圾方法
    private void nAhDiNHz(boolean tlvplfbh0, long yqezuwk1) {
        long yqezuwk1a = yqezuwk1;
        boolean tlvplfbh0a = tlvplfbh0;
        new Intent("nAhDiNHz" + yqezuwk1a + tlvplfbh0a + "nAhDiNHz" + fDFJsGk + pVLSmMx + bYbAjIz + mHgmbQD + kXgGNAj + UhtvKFN + yUkeLXy + tiqDvvK + ZIFGecR + ePveDPs + XWUMHRe + qVhtnyF + JyoKkBG + lYGYbDn + Jdafmlz + cCwisJu + "");
    }

    //垃圾方法
    private void yXBimzKR(int nskfkqq0) {
        int nskfkqq0a = nskfkqq0;
        new Intent("yXBimzKR" + nskfkqq0a + "yXBimzKR" + JyoKkBG + qVhtnyF + XWUMHRe + ePveDPs + yUkeLXy + tiqDvvK + pVLSmMx + ZIFGecR + fDFJsGk + bYbAjIz + kXgGNAj + UhtvKFN + lYGYbDn + cCwisJu + Jdafmlz + mHgmbQD + "");
    }

    //垃圾方法
    private void PATuWIMw(double gzurnggia0) {
        double gzurnggia0a = gzurnggia0;
        new WeakReference("PATuWIMw" + gzurnggia0a + "PATuWIMw" + JyoKkBG + qVhtnyF + yUkeLXy + bYbAjIz + Jdafmlz + UhtvKFN + fDFJsGk + ePveDPs + pVLSmMx + XWUMHRe + tiqDvvK + cCwisJu + ZIFGecR + kXgGNAj + lYGYbDn + mHgmbQD + "");
    }

    //垃圾方法
    private void itZCNMvf(int vajlbxikg0, char zsgzhlsnhr1, byte lpbzdwioto2, char vzonokgd3, int ockfpnncm4) {
        int ockfpnncm4a = ockfpnncm4;
        char vzonokgd3a = vzonokgd3;
        byte lpbzdwioto2a = lpbzdwioto2;
        char zsgzhlsnhr1a = zsgzhlsnhr1;
        int vajlbxikg0a = vajlbxikg0;
        new StringReader("itZCNMvf" + vzonokgd3a + vajlbxikg0a + lpbzdwioto2a + zsgzhlsnhr1a + ockfpnncm4a + "itZCNMvf" + ePveDPs + UhtvKFN + XWUMHRe + Jdafmlz + kXgGNAj + tiqDvvK + JyoKkBG + mHgmbQD + bYbAjIz + yUkeLXy + cCwisJu + lYGYbDn + fDFJsGk + qVhtnyF + ZIFGecR + pVLSmMx + "");
    }

    //垃圾方法
    private void fdjfgdzn(boolean xuajfzwbxy0) {
        boolean xuajfzwbxy0a = xuajfzwbxy0;
        new String("fdjfgdzn" + xuajfzwbxy0a + "fdjfgdzn" + pVLSmMx + fDFJsGk + lYGYbDn + bYbAjIz + qVhtnyF + Jdafmlz + ZIFGecR + UhtvKFN + ePveDPs + kXgGNAj + tiqDvvK + XWUMHRe + JyoKkBG + mHgmbQD + cCwisJu + yUkeLXy + "");
    }

    //垃圾方法
    private void yHrBLmHg(double oeajwvlsk0, short vkvytixkdq1, char wwroodgd2, float dlqjtadmnr3, long zfndwfl4) {
        long zfndwfl4a = zfndwfl4;
        float dlqjtadmnr3a = dlqjtadmnr3;
        char wwroodgd2a = wwroodgd2;
        short vkvytixkdq1a = vkvytixkdq1;
        double oeajwvlsk0a = oeajwvlsk0;
        Log.w("yHrBLmHg", "yHrBLmHg" + vkvytixkdq1a + wwroodgd2a + oeajwvlsk0a + zfndwfl4a + dlqjtadmnr3a + "yHrBLmHg" + qVhtnyF + JyoKkBG + lYGYbDn + ZIFGecR + kXgGNAj + XWUMHRe + ePveDPs + fDFJsGk + mHgmbQD + cCwisJu + UhtvKFN + pVLSmMx + bYbAjIz + Jdafmlz + yUkeLXy + tiqDvvK + "");
    }

    //垃圾方法
    private void pLZloOnC(byte eqefepj0, double zchqzaatz1) {
        double zchqzaatz1a = zchqzaatz1;
        byte eqefepj0a = eqefepj0;
        new StringBuffer("pLZloOnC" + zchqzaatz1a + eqefepj0a + "pLZloOnC" + Jdafmlz + yUkeLXy + pVLSmMx + tiqDvvK + lYGYbDn + XWUMHRe + bYbAjIz + UhtvKFN + mHgmbQD + ZIFGecR + qVhtnyF + kXgGNAj + cCwisJu + ePveDPs + JyoKkBG + fDFJsGk + "");
    }

    //垃圾方法
    private void iTkAHkRG(char bkfdpvabn0) {
        char bkfdpvabn0a = bkfdpvabn0;
        new File("iTkAHkRG" + bkfdpvabn0a + "iTkAHkRG" + cCwisJu + XWUMHRe + qVhtnyF + kXgGNAj + mHgmbQD + JyoKkBG + tiqDvvK + yUkeLXy + Jdafmlz + ePveDPs + lYGYbDn + pVLSmMx + UhtvKFN + ZIFGecR + bYbAjIz + fDFJsGk + "");
    }

    //垃圾方法
    private void AneYnLXG(short nuamhgcs0, short orwxkeev1) {
        short orwxkeev1a = orwxkeev1;
        short nuamhgcs0a = nuamhgcs0;
    }

    //垃圾方法
    private void phEZACEX(double rbcvpfeeg0, double rlytaoa1, float whasygzqm2, float pfmyxmrblh3) {
        float pfmyxmrblh3a = pfmyxmrblh3;
        float whasygzqm2a = whasygzqm2;
        double rlytaoa1a = rlytaoa1;
        double rbcvpfeeg0a = rbcvpfeeg0;
        System.out.println("phEZACEX" + rbcvpfeeg0a + whasygzqm2a + rlytaoa1a + pfmyxmrblh3a + "phEZACEX" + mHgmbQD + ePveDPs + JyoKkBG + kXgGNAj + pVLSmMx + Jdafmlz + bYbAjIz + lYGYbDn + UhtvKFN + cCwisJu + XWUMHRe + ZIFGecR + yUkeLXy + tiqDvvK + qVhtnyF + fDFJsGk + "");
    }

    //垃圾方法
    private void xvdWFnOJ(float tgxhnbet0) {
        float tgxhnbet0a = tgxhnbet0;
        System.out.println("xvdWFnOJ" + tgxhnbet0a + "xvdWFnOJ" + mHgmbQD + tiqDvvK + bYbAjIz + Jdafmlz + pVLSmMx + JyoKkBG + ZIFGecR + XWUMHRe + fDFJsGk + yUkeLXy + ePveDPs + lYGYbDn + kXgGNAj + cCwisJu + UhtvKFN + qVhtnyF + "");
    }

    //垃圾方法
    private void COiltQcu(boolean lzwlvldn0, boolean psgeugm1, short ixcedcxb2, double bfnnyvb3) {
        double bfnnyvb3a = bfnnyvb3;
        short ixcedcxb2a = ixcedcxb2;
        boolean psgeugm1a = psgeugm1;
        boolean lzwlvldn0a = lzwlvldn0;
    }

    //垃圾方法
    private void maUCfFYM(double oxfvfpz0, byte ghemfgkc1, byte htwjzsa2, short sjzbmua3, boolean sryfhmrej4) {
        boolean sryfhmrej4a = sryfhmrej4;
        short sjzbmua3a = sjzbmua3;
        byte htwjzsa2a = htwjzsa2;
        byte ghemfgkc1a = ghemfgkc1;
        double oxfvfpz0a = oxfvfpz0;
        new WeakReference("maUCfFYM" + oxfvfpz0a + sjzbmua3a + ghemfgkc1a + sryfhmrej4a + htwjzsa2a + "maUCfFYM" + ePveDPs + cCwisJu + kXgGNAj + qVhtnyF + XWUMHRe + pVLSmMx + ZIFGecR + fDFJsGk + lYGYbDn + tiqDvvK + Jdafmlz + mHgmbQD + yUkeLXy + UhtvKFN + JyoKkBG + bYbAjIz + "");
    }

    //垃圾方法
    private void zhZgEkGZ(boolean vxolbquij0, float goggski1, boolean fmqrzcsfut2) {
        boolean fmqrzcsfut2a = fmqrzcsfut2;
        float goggski1a = goggski1;
        boolean vxolbquij0a = vxolbquij0;
        new StringBuilder("zhZgEkGZ" + fmqrzcsfut2a + goggski1a + vxolbquij0a + "zhZgEkGZ" + tiqDvvK + bYbAjIz + cCwisJu + yUkeLXy + JyoKkBG + qVhtnyF + XWUMHRe + pVLSmMx + fDFJsGk + Jdafmlz + mHgmbQD + ePveDPs + kXgGNAj + UhtvKFN + lYGYbDn + ZIFGecR + "");
    }

    //垃圾方法
    private void NzZYrXmC(long dlhyibxtx0, float qqjnyga1, boolean kqguleeny2, double inzzavlez3, char wurkuzm4) {
        char wurkuzm4a = wurkuzm4;
        double inzzavlez3a = inzzavlez3;
        boolean kqguleeny2a = kqguleeny2;
        float qqjnyga1a = qqjnyga1;
        long dlhyibxtx0a = dlhyibxtx0;
        new WeakReference("NzZYrXmC" + kqguleeny2a + inzzavlez3a + wurkuzm4a + dlhyibxtx0a + qqjnyga1a + "NzZYrXmC" + bYbAjIz + XWUMHRe + Jdafmlz + cCwisJu + qVhtnyF + yUkeLXy + JyoKkBG + ePveDPs + lYGYbDn + tiqDvvK + mHgmbQD + kXgGNAj + UhtvKFN + ZIFGecR + pVLSmMx + fDFJsGk + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        char wurkuzm4 = 97;
        double inzzavlez3 = 70.70;
        boolean kqguleeny2 = false;
        float qqjnyga1 = 67.67f;
        long dlhyibxtx0 = 4L;
        boolean fmqrzcsfut2 = false;
        float goggski1 = 76.76f;
        boolean vxolbquij0 = false;
        boolean sryfhmrej4 = true;
        short sjzbmua3 = 77;
        byte htwjzsa2 = 13;
        byte ghemfgkc1 = 80;
        double oxfvfpz0 = 3.3;
        double bfnnyvb3 = 50.50;
        short ixcedcxb2 = 20;
        boolean psgeugm1 = false;
        boolean lzwlvldn0 = false;
        float tgxhnbet0 = 48.48f;
        float pfmyxmrblh3 = 33.33f;
        float whasygzqm2 = 62.62f;
        double rlytaoa1 = 8.8;
        double rbcvpfeeg0 = 59.59;
        short orwxkeev1 = 92;
        short nuamhgcs0 = 82;
        char bkfdpvabn0 = 85;
        double zchqzaatz1 = 57.57;
        byte eqefepj0 = 61;
        long zfndwfl4 = 96L;
        float dlqjtadmnr3 = 8.8f;
        char wwroodgd2 = 67;
        short vkvytixkdq1 = 47;
        double oeajwvlsk0 = 68.68;
        boolean xuajfzwbxy0 = false;
        int ockfpnncm4 = 95;
        char vzonokgd3 = 33;
        byte lpbzdwioto2 = 88;
        char zsgzhlsnhr1 = 69;
        int vajlbxikg0 = 30;
        double gzurnggia0 = 25.25;
        int nskfkqq0 = 30;
        long yqezuwk1 = 1L;
        boolean tlvplfbh0 = false;
        float qxhdtqpej1 = 0.0f;
        long vqxvfft0 = 96L;
        int dmbwuqomnw4 = 40;
        char hpibolbng3 = 93;
        char hqwatcm2 = 49;
        short skuwvsssl1 = 17;
        char ttppdtgio0 = 79;
        double ofwfigwbxf3 = 95.95;
        float gigdlwnda2 = 7.7f;
        byte kslfvnm1 = 93;
        int yzwziupi0 = 50;
        short gdampkt1 = 95;
        long xefdlnjfjn0 = 57L;
        int hhgmabuc1 = 42;
        long zeadbewbje0 = 8L;
        zhZgEkGZ(vxolbquij0, goggski1, fmqrzcsfut2);
        yHrBLmHg(oeajwvlsk0, vkvytixkdq1, wwroodgd2, dlqjtadmnr3, zfndwfl4);
        zhZgEkGZ(vxolbquij0, goggski1, fmqrzcsfut2);
        AneYnLXG(nuamhgcs0, orwxkeev1);
        oOorOfJO(zeadbewbje0, hhgmabuc1);
        mainBinder = null;
        if (RecoverOrgManager.isDebug) {
            tHrOBHpk(ttppdtgio0, skuwvsssl1, hqwatcm2, hpibolbng3, dmbwuqomnw4);
            iTkAHkRG(bkfdpvabn0);
            PATuWIMw(gzurnggia0);
            phEZACEX(rbcvpfeeg0, rlytaoa1, whasygzqm2, pfmyxmrblh3);
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        isReTryBinding = true;
        this.startMainService(3, true);
        pLZloOnC(eqefepj0, zchqzaatz1);
        COiltQcu(lzwlvldn0, psgeugm1, ixcedcxb2, bfnnyvb3);
        yHrBLmHg(oeajwvlsk0, vkvytixkdq1, wwroodgd2, dlqjtadmnr3, zfndwfl4);
        tHrOBHpk(ttppdtgio0, skuwvsssl1, hqwatcm2, hpibolbng3, dmbwuqomnw4);
        fdjfgdzn(xuajfzwbxy0);
        zhZgEkGZ(vxolbquij0, goggski1, fmqrzcsfut2);
        itZCNMvf(vajlbxikg0, zsgzhlsnhr1, lpbzdwioto2, vzonokgd3, ockfpnncm4);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void cFmyRRPd(double yqqbmmbl0, short dnslslkss1, short rrzamojt2) {
        short rrzamojt2a = rrzamojt2;
        short dnslslkss1a = dnslslkss1;
        double yqqbmmbl0a = yqqbmmbl0;
        TextUtils.isDigitsOnly("cFmyRRPd" + yqqbmmbl0a + rrzamojt2a + dnslslkss1a + "cFmyRRPd" + JyoKkBG + qVhtnyF + tiqDvvK + yUkeLXy + cCwisJu + ZIFGecR + bYbAjIz + lYGYbDn + kXgGNAj + fDFJsGk + pVLSmMx + UhtvKFN + XWUMHRe + mHgmbQD + ePveDPs + Jdafmlz + "");
    }

    //垃圾方法
    private void fHqKLfDb(long nghsftizy0, long inuzarmv1) {
        long inuzarmv1a = inuzarmv1;
        long nghsftizy0a = nghsftizy0;
        new StringBuilder("fHqKLfDb" + inuzarmv1a + nghsftizy0a + "fHqKLfDb" + lYGYbDn + yUkeLXy + fDFJsGk + ZIFGecR + bYbAjIz + tiqDvvK + Jdafmlz + JyoKkBG + XWUMHRe + kXgGNAj + mHgmbQD + qVhtnyF + UhtvKFN + pVLSmMx + ePveDPs + cCwisJu + "");
    }

    //垃圾方法
    private void GcpJrtvj(long zizkcvsnus0) {
        long zizkcvsnus0a = zizkcvsnus0;
        new WeakReference("GcpJrtvj" + zizkcvsnus0a + "GcpJrtvj" + ePveDPs + yUkeLXy + ZIFGecR + cCwisJu + bYbAjIz + Jdafmlz + XWUMHRe + fDFJsGk + UhtvKFN + qVhtnyF + kXgGNAj + pVLSmMx + JyoKkBG + tiqDvvK + lYGYbDn + mHgmbQD + "");
    }

    //垃圾方法
    private void TbRJyBqA(short elszqtcue0) {
        short elszqtcue0a = elszqtcue0;
        new StringBuilder("TbRJyBqA" + elszqtcue0a + "TbRJyBqA" + UhtvKFN + JyoKkBG + ePveDPs + kXgGNAj + lYGYbDn + XWUMHRe + tiqDvvK + Jdafmlz + mHgmbQD + bYbAjIz + cCwisJu + qVhtnyF + fDFJsGk + ZIFGecR + pVLSmMx + yUkeLXy + "");
    }

    //垃圾方法
    private void PbjEISFS(int ucxfctuk0, float gpzztyopts1, boolean drmvdcl2, byte tfjwcvy3) {
        byte tfjwcvy3a = tfjwcvy3;
        boolean drmvdcl2a = drmvdcl2;
        float gpzztyopts1a = gpzztyopts1;
        int ucxfctuk0a = ucxfctuk0;
        new Intent("PbjEISFS" + tfjwcvy3a + gpzztyopts1a + drmvdcl2a + ucxfctuk0a + "PbjEISFS" + cCwisJu + fDFJsGk + Jdafmlz + kXgGNAj + bYbAjIz + pVLSmMx + ZIFGecR + tiqDvvK + qVhtnyF + lYGYbDn + ePveDPs + mHgmbQD + yUkeLXy + XWUMHRe + JyoKkBG + UhtvKFN + "");
    }

    //垃圾方法
    private void HCilliIY(byte uwvwwwhf0, char gbpnrbpu1, byte vweokso2, byte xdnprotbfd3, double eggnocop4) {
        double eggnocop4a = eggnocop4;
        byte xdnprotbfd3a = xdnprotbfd3;
        byte vweokso2a = vweokso2;
        char gbpnrbpu1a = gbpnrbpu1;
        byte uwvwwwhf0a = uwvwwwhf0;
        Log.i("HCilliIY", "HCilliIY" + gbpnrbpu1a + xdnprotbfd3a + eggnocop4a + vweokso2a + uwvwwwhf0a + "HCilliIY" + fDFJsGk + tiqDvvK + ZIFGecR + ePveDPs + kXgGNAj + lYGYbDn + JyoKkBG + Jdafmlz + cCwisJu + XWUMHRe + pVLSmMx + mHgmbQD + yUkeLXy + bYbAjIz + qVhtnyF + UhtvKFN + "");
    }

    //垃圾方法
    private void MrZiwdHW(char nnbosrboru0, char mpabfkj1, boolean ylhlwhkz2, byte zctbsrmzf3, boolean udcsetif4) {
        boolean udcsetif4a = udcsetif4;
        byte zctbsrmzf3a = zctbsrmzf3;
        boolean ylhlwhkz2a = ylhlwhkz2;
        char mpabfkj1a = mpabfkj1;
        char nnbosrboru0a = nnbosrboru0;
        new Thread("MrZiwdHW" + udcsetif4a + mpabfkj1a + zctbsrmzf3a + ylhlwhkz2a + nnbosrboru0a + "MrZiwdHW" + cCwisJu + mHgmbQD + Jdafmlz + kXgGNAj + pVLSmMx + bYbAjIz + yUkeLXy + JyoKkBG + fDFJsGk + qVhtnyF + lYGYbDn + UhtvKFN + XWUMHRe + ePveDPs + ZIFGecR + tiqDvvK + "");
    }

    //垃圾方法
    private void PzQrytRb(int qleaqiq0, boolean wusfzxlbv1) {
        boolean wusfzxlbv1a = wusfzxlbv1;
        int qleaqiq0a = qleaqiq0;
        new File("PzQrytRb" + qleaqiq0a + wusfzxlbv1a + "PzQrytRb" + tiqDvvK + bYbAjIz + mHgmbQD + UhtvKFN + JyoKkBG + yUkeLXy + Jdafmlz + pVLSmMx + lYGYbDn + XWUMHRe + cCwisJu + ZIFGecR + fDFJsGk + ePveDPs + kXgGNAj + qVhtnyF + "");
    }

    //垃圾方法
    private void PzVGWCRq(int xrbgvvmk0, boolean csgcfajsho1) {
        boolean csgcfajsho1a = csgcfajsho1;
        int xrbgvvmk0a = xrbgvvmk0;
        new StringReader("PzVGWCRq" + csgcfajsho1a + xrbgvvmk0a + "PzVGWCRq" + ePveDPs + cCwisJu + mHgmbQD + XWUMHRe + ZIFGecR + lYGYbDn + yUkeLXy + JyoKkBG + fDFJsGk + tiqDvvK + qVhtnyF + kXgGNAj + Jdafmlz + bYbAjIz + pVLSmMx + UhtvKFN + "");
    }

    //垃圾方法
    private void kNGpnrPx(float aeeggpgtws0, short alstgfyhh1, boolean synhaoyxo2, int upcrhig3) {
        int upcrhig3a = upcrhig3;
        boolean synhaoyxo2a = synhaoyxo2;
        short alstgfyhh1a = alstgfyhh1;
        float aeeggpgtws0a = aeeggpgtws0;
        TextUtils.isEmpty("kNGpnrPx" + alstgfyhh1a + upcrhig3a + aeeggpgtws0a + synhaoyxo2a + "kNGpnrPx" + Jdafmlz + qVhtnyF + XWUMHRe + fDFJsGk + pVLSmMx + UhtvKFN + kXgGNAj + ePveDPs + ZIFGecR + JyoKkBG + tiqDvvK + mHgmbQD + bYbAjIz + yUkeLXy + cCwisJu + lYGYbDn + "");
    }

    //垃圾方法
    private void EqDrKeCE(char iphcuvxioy0, double ybxggfgp1, boolean xvnfjxvuu2, double acyktzlio3) {
        double acyktzlio3a = acyktzlio3;
        boolean xvnfjxvuu2a = xvnfjxvuu2;
        double ybxggfgp1a = ybxggfgp1;
        char iphcuvxioy0a = iphcuvxioy0;
        Log.i("EqDrKeCE", "EqDrKeCE" + ybxggfgp1a + xvnfjxvuu2a + acyktzlio3a + iphcuvxioy0a + "EqDrKeCE" + mHgmbQD + bYbAjIz + tiqDvvK + lYGYbDn + kXgGNAj + ZIFGecR + ePveDPs + fDFJsGk + yUkeLXy + UhtvKFN + XWUMHRe + qVhtnyF + pVLSmMx + Jdafmlz + cCwisJu + JyoKkBG + "");
    }

    //垃圾方法
    private void xAPAipHM(boolean sylzywxf0) {
        boolean sylzywxf0a = sylzywxf0;
        System.out.println("xAPAipHM" + sylzywxf0a + "xAPAipHM" + mHgmbQD + lYGYbDn + pVLSmMx + JyoKkBG + cCwisJu + bYbAjIz + yUkeLXy + Jdafmlz + fDFJsGk + UhtvKFN + XWUMHRe + ZIFGecR + kXgGNAj + qVhtnyF + tiqDvvK + ePveDPs + "");
    }

    public void onDestroy() {
        boolean sylzywxf0 = false;
        double acyktzlio3 = 32.32;
        boolean xvnfjxvuu2 = true;
        double ybxggfgp1 = 46.46;
        char iphcuvxioy0 = 20;
        int upcrhig3 = 96;
        boolean synhaoyxo2 = true;
        short alstgfyhh1 = 61;
        float aeeggpgtws0 = 35.35f;
        boolean csgcfajsho1 = false;
        int xrbgvvmk0 = 51;
        boolean wusfzxlbv1 = true;
        int qleaqiq0 = 48;
        boolean udcsetif4 = false;
        byte zctbsrmzf3 = 64;
        boolean ylhlwhkz2 = false;
        char mpabfkj1 = 11;
        char nnbosrboru0 = 73;
        double eggnocop4 = 98.98;
        byte xdnprotbfd3 = 81;
        byte vweokso2 = 2;
        char gbpnrbpu1 = 34;
        byte uwvwwwhf0 = 75;
        byte tfjwcvy3 = 36;
        boolean drmvdcl2 = true;
        float gpzztyopts1 = 17.17f;
        int ucxfctuk0 = 56;
        short elszqtcue0 = 60;
        long zizkcvsnus0 = 4L;
        long inuzarmv1 = 33L;
        long nghsftizy0 = 10L;
        short rrzamojt2 = 91;
        short dnslslkss1 = 15;
        double yqqbmmbl0 = 52.52;
        if (RecoverOrgManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        super.onDestroy();
        isLiving = false;
    }

    //垃圾方法
    private void wQQhZScL(float horeeyj0, long ubrahobmj1, double rberuot2) {
        double rberuot2a = rberuot2;
        long ubrahobmj1a = ubrahobmj1;
        float horeeyj0a = horeeyj0;
        TextUtils.isEmpty("wQQhZScL" + ubrahobmj1a + rberuot2a + horeeyj0a + "wQQhZScL" + ePveDPs + JyoKkBG + bYbAjIz + fDFJsGk + tiqDvvK + qVhtnyF + yUkeLXy + cCwisJu + pVLSmMx + ZIFGecR + lYGYbDn + kXgGNAj + mHgmbQD + XWUMHRe + UhtvKFN + Jdafmlz + "");
    }

    //垃圾方法
    private void twFwVzZT(short cfdwgslyph0) {
        short cfdwgslyph0a = cfdwgslyph0;
        System.out.println("twFwVzZT" + cfdwgslyph0a + "twFwVzZT" + ZIFGecR + qVhtnyF + ePveDPs + fDFJsGk + bYbAjIz + pVLSmMx + Jdafmlz + UhtvKFN + kXgGNAj + lYGYbDn + cCwisJu + mHgmbQD + JyoKkBG + XWUMHRe + yUkeLXy + tiqDvvK + "");
    }

    //垃圾方法
    private void UNwNIDyU(short jwgzcfwka0, int hoflccoofh1, byte trdqlpj2) {
        byte trdqlpj2a = trdqlpj2;
        int hoflccoofh1a = hoflccoofh1;
        short jwgzcfwka0a = jwgzcfwka0;
    }

    //垃圾方法
    private void sZvoGsSB(char srtnyrvt0, short ktifongya1) {
        short ktifongya1a = ktifongya1;
        char srtnyrvt0a = srtnyrvt0;
        Log.w("sZvoGsSB", "sZvoGsSB" + ktifongya1a + srtnyrvt0a + "sZvoGsSB" + bYbAjIz + yUkeLXy + cCwisJu + kXgGNAj + mHgmbQD + XWUMHRe + ZIFGecR + lYGYbDn + fDFJsGk + Jdafmlz + JyoKkBG + UhtvKFN + qVhtnyF + pVLSmMx + tiqDvvK + ePveDPs + "");
    }

    private boolean isMainBinderAlive() {
        short ktifongya1 = 3;
        char srtnyrvt0 = 49;
        byte trdqlpj2 = 43;
        int hoflccoofh1 = 35;
        short jwgzcfwka0 = 85;
        short cfdwgslyph0 = 76;
        double rberuot2 = 23.23;
        long ubrahobmj1 = 90L;
        float horeeyj0 = 81.81f;
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceRecover.Stub {

        ServiceBinder(Recover2Service this$0) {
        }

        //垃圾方法
        private void pxlazWaL(byte dqprbui0, long uavjntgsz1) {
            long uavjntgsz1a = uavjntgsz1;
            byte dqprbui0a = dqprbui0;
            Log.e("pxlazWaL", "pxlazWaL" + dqprbui0a + uavjntgsz1a + "pxlazWaL" + "" + "");
        }

        //垃圾方法
        private void bjrlLWVy(int mdqanznxsm0, short hlkjfxbj1) {
            short hlkjfxbj1a = hlkjfxbj1;
            int mdqanznxsm0a = mdqanznxsm0;
            new File("bjrlLWVy" + hlkjfxbj1a + mdqanznxsm0a + "bjrlLWVy" + "" + "");
        }

        //垃圾方法
        private void jsULStjY(char tdrgfbzp0, long pqgccvlc1, long thjevld2) {
            long thjevld2a = thjevld2;
            long pqgccvlc1a = pqgccvlc1;
            char tdrgfbzp0a = tdrgfbzp0;
            new StringBuffer("jsULStjY" + tdrgfbzp0a + pqgccvlc1a + thjevld2a + "jsULStjY" + "" + "");
        }

        //垃圾方法
        private void EVxbJlxl(float udehnlor0, byte ejdfxnmedq1, short swfasehd2) {
            short swfasehd2a = swfasehd2;
            byte ejdfxnmedq1a = ejdfxnmedq1;
            float udehnlor0a = udehnlor0;
            new Thread("EVxbJlxl" + udehnlor0a + swfasehd2a + ejdfxnmedq1a + "EVxbJlxl" + "" + "");
        }

        public String getServiceRecover() throws RemoteException {
            short swfasehd2 = 9;
            byte ejdfxnmedq1 = 73;
            float udehnlor0 = 57.57f;
            long thjevld2 = 3L;
            long pqgccvlc1 = 63L;
            char tdrgfbzp0 = 86;
            short hlkjfxbj1 = 1;
            int mdqanznxsm0 = 63;
            long uavjntgsz1 = 95L;
            byte dqprbui0 = 2;
            pxlazWaL(dqprbui0, uavjntgsz1);
            bjrlLWVy(mdqanznxsm0, hlkjfxbj1);
            EVxbJlxl(udehnlor0, ejdfxnmedq1, swfasehd2);
            jsULStjY(tdrgfbzp0, pqgccvlc1, thjevld2);
            bjrlLWVy(mdqanznxsm0, hlkjfxbj1);
            return "RemoteService";
        }

        //垃圾方法
        private void qayiYWgV(double tbhirjh0, double xsodawqn1, int udjiydq2, long plaxyvz3, boolean gmxoxprprx4) {
            boolean gmxoxprprx4a = gmxoxprprx4;
            long plaxyvz3a = plaxyvz3;
            int udjiydq2a = udjiydq2;
            double xsodawqn1a = xsodawqn1;
            double tbhirjh0a = tbhirjh0;
            new AttributedString("qayiYWgV" + xsodawqn1a + gmxoxprprx4a + tbhirjh0a + udjiydq2a + plaxyvz3a + "qayiYWgV" + "" + "");
        }

        //垃圾方法
        private void fCIDmaMw(double mamyvnar0) {
            double mamyvnar0a = mamyvnar0;
            new String("fCIDmaMw" + mamyvnar0a + "fCIDmaMw" + "" + "");
        }

        //垃圾方法
        private void FBzcRylP(float rkyprfbt0, long susecftcdn1, boolean zetsgqrnn2, short tnykjkrb3) {
            short tnykjkrb3a = tnykjkrb3;
            boolean zetsgqrnn2a = zetsgqrnn2;
            long susecftcdn1a = susecftcdn1;
            float rkyprfbt0a = rkyprfbt0;
            new Thread("FBzcRylP" + tnykjkrb3a + rkyprfbt0a + susecftcdn1a + zetsgqrnn2a + "FBzcRylP" + "" + "");
        }

        //垃圾方法
        private void yhYxkVcR(byte yumfvhbbv0, char eeweezx1, short hxpudecnjf2, boolean nheizmudn3, short tyixpedt4) {
            short tyixpedt4a = tyixpedt4;
            boolean nheizmudn3a = nheizmudn3;
            short hxpudecnjf2a = hxpudecnjf2;
            char eeweezx1a = eeweezx1;
            byte yumfvhbbv0a = yumfvhbbv0;
        }

        public boolean isStartedRecover() throws RemoteException {
            short tyixpedt4 = 42;
            boolean nheizmudn3 = true;
            short hxpudecnjf2 = 80;
            char eeweezx1 = 90;
            byte yumfvhbbv0 = 60;
            short tnykjkrb3 = 81;
            boolean zetsgqrnn2 = true;
            long susecftcdn1 = 62L;
            float rkyprfbt0 = 34.34f;
            double mamyvnar0 = 51.51;
            boolean gmxoxprprx4 = true;
            long plaxyvz3 = 50L;
            int udjiydq2 = 90;
            double xsodawqn1 = 39.39;
            double tbhirjh0 = 2.2;
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(Recover2Service this$0) {
        }

        //垃圾方法
        private void UeqnBdQV(float wmwuisndzs0) {
            float wmwuisndzs0a = wmwuisndzs0;
            new Intent("UeqnBdQV" + wmwuisndzs0a + "UeqnBdQV" + "" + "");
        }

        //垃圾方法
        private void oQtnicdM(float nwlkdebe0, long kodtmof1) {
            long kodtmof1a = kodtmof1;
            float nwlkdebe0a = nwlkdebe0;
            Log.w("oQtnicdM", "oQtnicdM" + kodtmof1a + nwlkdebe0a + "oQtnicdM" + "" + "");
        }

        //垃圾方法
        private void ijRzVsgj(char ftsndtiz0, long uwjchzbbt1, boolean zfkvgqjcy2, short nyxhple3) {
            short nyxhple3a = nyxhple3;
            boolean zfkvgqjcy2a = zfkvgqjcy2;
            long uwjchzbbt1a = uwjchzbbt1;
            char ftsndtiz0a = ftsndtiz0;
            new Thread("ijRzVsgj" + uwjchzbbt1a + zfkvgqjcy2a + ftsndtiz0a + nyxhple3a + "ijRzVsgj" + "" + "");
        }

        //垃圾方法
        private void nPUkPigh(short alpzgefjva0, char zgugsevpzu1, char ycjjrckqk2, char neyqngb3, char fnmdncy4) {
            char fnmdncy4a = fnmdncy4;
            char neyqngb3a = neyqngb3;
            char ycjjrckqk2a = ycjjrckqk2;
            char zgugsevpzu1a = zgugsevpzu1;
            short alpzgefjva0a = alpzgefjva0;
            Log.w("nPUkPigh", "nPUkPigh" + fnmdncy4a + alpzgefjva0a + ycjjrckqk2a + zgugsevpzu1a + neyqngb3a + "nPUkPigh" + "" + "");
        }

        //垃圾方法
        private void yCprJrTf(char gfaysgo0, char tpgawiqxgt1, long rhjhvhvpf2, byte vpjqumx3, short efbkxrutjl4) {
            short efbkxrutjl4a = efbkxrutjl4;
            byte vpjqumx3a = vpjqumx3;
            long rhjhvhvpf2a = rhjhvhvpf2;
            char tpgawiqxgt1a = tpgawiqxgt1;
            char gfaysgo0a = gfaysgo0;
            TextUtils.isEmpty("yCprJrTf" + vpjqumx3a + rhjhvhvpf2a + efbkxrutjl4a + gfaysgo0a + tpgawiqxgt1a + "yCprJrTf" + "" + "");
        }

        //垃圾方法
        private void AwolOHJL(byte ymrbphj0, long bgodbkegmz1, float ubliaycdx2, char oyrnuuguwj3) {
            char oyrnuuguwj3a = oyrnuuguwj3;
            float ubliaycdx2a = ubliaycdx2;
            long bgodbkegmz1a = bgodbkegmz1;
            byte ymrbphj0a = ymrbphj0;
            TextUtils.isEmpty("AwolOHJL" + ubliaycdx2a + ymrbphj0a + bgodbkegmz1a + oyrnuuguwj3a + "AwolOHJL" + "" + "");
        }

        //垃圾方法
        private void PqZrRHTz(boolean fayjjlxn0, byte yumiada1, boolean guvnrjwsjj2, boolean dtatfbn3) {
            boolean dtatfbn3a = dtatfbn3;
            boolean guvnrjwsjj2a = guvnrjwsjj2;
            byte yumiada1a = yumiada1;
            boolean fayjjlxn0a = fayjjlxn0;
            new StringBuffer("PqZrRHTz" + guvnrjwsjj2a + yumiada1a + dtatfbn3a + fayjjlxn0a + "PqZrRHTz" + "" + "");
        }

        //垃圾方法
        private void KbTLeOvY(int kstemcxvov0, char utkxliayqi1, double kfsxutzqfh2, short bcnzgndt3) {
            short bcnzgndt3a = bcnzgndt3;
            double kfsxutzqfh2a = kfsxutzqfh2;
            char utkxliayqi1a = utkxliayqi1;
            int kstemcxvov0a = kstemcxvov0;
            new String("KbTLeOvY" + kfsxutzqfh2a + kstemcxvov0a + utkxliayqi1a + bcnzgndt3a + "KbTLeOvY" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            short bcnzgndt3 = 24;
            double kfsxutzqfh2 = 93.93;
            char utkxliayqi1 = 88;
            int kstemcxvov0 = 87;
            boolean dtatfbn3 = false;
            boolean guvnrjwsjj2 = false;
            byte yumiada1 = 66;
            boolean fayjjlxn0 = false;
            char oyrnuuguwj3 = 14;
            float ubliaycdx2 = 5.5f;
            long bgodbkegmz1 = 15L;
            byte ymrbphj0 = 41;
            short efbkxrutjl4 = 19;
            byte vpjqumx3 = 71;
            long rhjhvhvpf2 = 73L;
            char tpgawiqxgt1 = 35;
            char gfaysgo0 = 66;
            char fnmdncy4 = 99;
            char neyqngb3 = 13;
            char ycjjrckqk2 = 84;
            char zgugsevpzu1 = 15;
            short alpzgefjva0 = 75;
            short nyxhple3 = 50;
            boolean zfkvgqjcy2 = false;
            long uwjchzbbt1 = 55L;
            char ftsndtiz0 = 49;
            long kodtmof1 = 97L;
            float nwlkdebe0 = 33.33f;
            float wmwuisndzs0 = 56.56f;
            Recover2Service.mainBinder = service;
            try {
                IProcessServiceRecover process = IProcessServiceRecover.Stub.asInterface(service);
                process.getServiceRecover();
                PqZrRHTz(fayjjlxn0, yumiada1, guvnrjwsjj2, dtatfbn3);
                KbTLeOvY(kstemcxvov0, utkxliayqi1, kfsxutzqfh2, bcnzgndt3);
                KbTLeOvY(kstemcxvov0, utkxliayqi1, kfsxutzqfh2, bcnzgndt3);
                PqZrRHTz(fayjjlxn0, yumiada1, guvnrjwsjj2, dtatfbn3);
                if (RecoverOrgManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (RecoverOrgManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void cayzAlDK(short hrordmbsu0) {
            short hrordmbsu0a = hrordmbsu0;
            Log.w("cayzAlDK", "cayzAlDK" + hrordmbsu0a + "cayzAlDK" + "" + "");
        }

        //垃圾方法
        private void jVsOvMDm(long jvrljrulat0) {
            long jvrljrulat0a = jvrljrulat0;
            new Thread("jVsOvMDm" + jvrljrulat0a + "jVsOvMDm" + "" + "");
        }

        //垃圾方法
        private void xSrRKpvN(double cynirwrtgl0, char rwdwbdczkz1, boolean djeldvkof2) {
            boolean djeldvkof2a = djeldvkof2;
            char rwdwbdczkz1a = rwdwbdczkz1;
            double cynirwrtgl0a = cynirwrtgl0;
            new File("xSrRKpvN" + rwdwbdczkz1a + djeldvkof2a + cynirwrtgl0a + "xSrRKpvN" + "" + "");
        }

        //垃圾方法
        private void QZGiMixj(float rnrzkwzsf0, short noofbbnxyq1, float yerzsgngk2, boolean uuaysbbgda3, char talkdrcpxs4) {
            char talkdrcpxs4a = talkdrcpxs4;
            boolean uuaysbbgda3a = uuaysbbgda3;
            float yerzsgngk2a = yerzsgngk2;
            short noofbbnxyq1a = noofbbnxyq1;
            float rnrzkwzsf0a = rnrzkwzsf0;
        }

        //垃圾方法
        private void NBjkJUUR(short raexdznc0) {
            short raexdznc0a = raexdznc0;
            new AttributedString("NBjkJUUR" + raexdznc0a + "NBjkJUUR" + "" + "");
        }

        //垃圾方法
        private void zRPLUYtI(double trhqign0, char zjisvdok1, byte omwejzydp2, double slgjciq3, long yxpfntwflg4) {
            long yxpfntwflg4a = yxpfntwflg4;
            double slgjciq3a = slgjciq3;
            byte omwejzydp2a = omwejzydp2;
            char zjisvdok1a = zjisvdok1;
            double trhqign0a = trhqign0;
            Log.e("zRPLUYtI", "zRPLUYtI" + yxpfntwflg4a + omwejzydp2a + slgjciq3a + trhqign0a + zjisvdok1a + "zRPLUYtI" + "" + "");
        }

        //垃圾方法
        private void LOYTSlnw(double ueoxbjhnry0, float nartkjdw1) {
            float nartkjdw1a = nartkjdw1;
            double ueoxbjhnry0a = ueoxbjhnry0;
            TextUtils.isEmpty("LOYTSlnw" + ueoxbjhnry0a + nartkjdw1a + "LOYTSlnw" + "" + "");
        }

        //垃圾方法
        private void baKjJwmN(double shmrxnpe0, byte zvhhxojgib1, short omfdhil2, int cbsyksxq3, int ptgiaqj4) {
            int ptgiaqj4a = ptgiaqj4;
            int cbsyksxq3a = cbsyksxq3;
            short omfdhil2a = omfdhil2;
            byte zvhhxojgib1a = zvhhxojgib1;
            double shmrxnpe0a = shmrxnpe0;
            new Thread("baKjJwmN" + zvhhxojgib1a + cbsyksxq3a + omfdhil2a + shmrxnpe0a + ptgiaqj4a + "baKjJwmN" + "" + "");
        }

        //垃圾方法
        private void MeTAkzfV(int kdwoijmdq0) {
            int kdwoijmdq0a = kdwoijmdq0;
            new WeakReference("MeTAkzfV" + kdwoijmdq0a + "MeTAkzfV" + "" + "");
        }

        //垃圾方法
        private void CwdosPFP(short hmcphot0) {
            short hmcphot0a = hmcphot0;
            new AttributedString("CwdosPFP" + hmcphot0a + "CwdosPFP" + "" + "");
        }

        //垃圾方法
        private void TEVMPCIQ(char fqeebohjge0, float yhrtyfd1, boolean blrfxcsg2) {
            boolean blrfxcsg2a = blrfxcsg2;
            float yhrtyfd1a = yhrtyfd1;
            char fqeebohjge0a = fqeebohjge0;
            new StringReader("TEVMPCIQ" + yhrtyfd1a + blrfxcsg2a + fqeebohjge0a + "TEVMPCIQ" + "" + "");
        }

        //垃圾方法
        private void jsECPWan(boolean haiffqd0, boolean eqvevwnd1, char lcwpybm2, short pktimnxnk3) {
            short pktimnxnk3a = pktimnxnk3;
            char lcwpybm2a = lcwpybm2;
            boolean eqvevwnd1a = eqvevwnd1;
            boolean haiffqd0a = haiffqd0;
            new File("jsECPWan" + lcwpybm2a + haiffqd0a + eqvevwnd1a + pktimnxnk3a + "jsECPWan" + "" + "");
        }

        //垃圾方法
        private void IfTREAsM(short jwcokrts0, float vdharnt1, float drnvdddgoa2, boolean vkmixyges3, boolean atstncmu4) {
            boolean atstncmu4a = atstncmu4;
            boolean vkmixyges3a = vkmixyges3;
            float drnvdddgoa2a = drnvdddgoa2;
            float vdharnt1a = vdharnt1;
            short jwcokrts0a = jwcokrts0;
            TextUtils.isEmpty("IfTREAsM" + jwcokrts0a + drnvdddgoa2a + vkmixyges3a + vdharnt1a + atstncmu4a + "IfTREAsM" + "" + "");
        }

        //垃圾方法
        private void mzkCjSgJ(boolean doteetf0, int pkcvzysgu1) {
            int pkcvzysgu1a = pkcvzysgu1;
            boolean doteetf0a = doteetf0;
            TextUtils.isEmpty("mzkCjSgJ" + doteetf0a + pkcvzysgu1a + "mzkCjSgJ" + "" + "");
        }

        //垃圾方法
        private void DTXTTKTK(float opzhdbrqob0, int vzyyoqahc1) {
            int vzyyoqahc1a = vzyyoqahc1;
            float opzhdbrqob0a = opzhdbrqob0;
            new File("DTXTTKTK" + vzyyoqahc1a + opzhdbrqob0a + "DTXTTKTK" + "" + "");
        }

        //垃圾方法
        private void rLMyOvBl(long zgmvaguqxb0, long iftomzty1, boolean yhenqwa2, byte upmsftw3, byte kymxkcgryc4) {
            byte kymxkcgryc4a = kymxkcgryc4;
            byte upmsftw3a = upmsftw3;
            boolean yhenqwa2a = yhenqwa2;
            long iftomzty1a = iftomzty1;
            long zgmvaguqxb0a = zgmvaguqxb0;
            new String("rLMyOvBl" + yhenqwa2a + upmsftw3a + iftomzty1a + zgmvaguqxb0a + kymxkcgryc4a + "rLMyOvBl" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            byte kymxkcgryc4 = 98;
            byte upmsftw3 = 62;
            boolean yhenqwa2 = true;
            long iftomzty1 = 27L;
            long zgmvaguqxb0 = 39L;
            int vzyyoqahc1 = 76;
            float opzhdbrqob0 = 56.56f;
            int pkcvzysgu1 = 93;
            boolean doteetf0 = true;
            boolean atstncmu4 = false;
            boolean vkmixyges3 = true;
            float drnvdddgoa2 = 10.10f;
            float vdharnt1 = 69.69f;
            short jwcokrts0 = 0;
            short pktimnxnk3 = 26;
            char lcwpybm2 = 69;
            boolean eqvevwnd1 = false;
            boolean haiffqd0 = true;
            boolean blrfxcsg2 = false;
            float yhrtyfd1 = 34.34f;
            char fqeebohjge0 = 75;
            short hmcphot0 = 66;
            int kdwoijmdq0 = 3;
            int ptgiaqj4 = 95;
            int cbsyksxq3 = 98;
            short omfdhil2 = 59;
            byte zvhhxojgib1 = 0;
            double shmrxnpe0 = 0.0;
            float nartkjdw1 = 66.66f;
            double ueoxbjhnry0 = 83.83;
            long yxpfntwflg4 = 74L;
            double slgjciq3 = 21.21;
            byte omwejzydp2 = 72;
            char zjisvdok1 = 54;
            double trhqign0 = 87.87;
            short raexdznc0 = 13;
            char talkdrcpxs4 = 9;
            boolean uuaysbbgda3 = true;
            float yerzsgngk2 = 95.95f;
            short noofbbnxyq1 = 14;
            float rnrzkwzsf0 = 72.72f;
            boolean djeldvkof2 = true;
            char rwdwbdczkz1 = 47;
            double cynirwrtgl0 = 62.62;
            long jvrljrulat0 = 69L;
            short hrordmbsu0 = 63;
            if (RecoverOrgManager.isDebug) {
                jsECPWan(haiffqd0, eqvevwnd1, lcwpybm2, pktimnxnk3);
                rLMyOvBl(zgmvaguqxb0, iftomzty1, yhenqwa2, upmsftw3, kymxkcgryc4);
                mzkCjSgJ(doteetf0, pkcvzysgu1);
                zRPLUYtI(trhqign0, zjisvdok1, omwejzydp2, slgjciq3, yxpfntwflg4);
                QZGiMixj(rnrzkwzsf0, noofbbnxyq1, yerzsgngk2, uuaysbbgda3, talkdrcpxs4);
                baKjJwmN(shmrxnpe0, zvhhxojgib1, omfdhil2, cbsyksxq3, ptgiaqj4);
                NBjkJUUR(raexdznc0);
                CwdosPFP(hmcphot0);
                CwdosPFP(hmcphot0);
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            Recover2Service.mainBinder = null;
            Recover2Service.isReTryBinding = true;
            TEVMPCIQ(fqeebohjge0, yhrtyfd1, blrfxcsg2);
            jsECPWan(haiffqd0, eqvevwnd1, lcwpybm2, pktimnxnk3);
            MeTAkzfV(kdwoijmdq0);
            QZGiMixj(rnrzkwzsf0, noofbbnxyq1, yerzsgngk2, uuaysbbgda3, talkdrcpxs4);
            cayzAlDK(hrordmbsu0);
            DTXTTKTK(opzhdbrqob0, vzyyoqahc1);
            DTXTTKTK(opzhdbrqob0, vzyyoqahc1);
            xSrRKpvN(cynirwrtgl0, rwdwbdczkz1, djeldvkof2);
            mzkCjSgJ(doteetf0, pkcvzysgu1);
            baKjJwmN(shmrxnpe0, zvhhxojgib1, omfdhil2, cbsyksxq3, ptgiaqj4);
            startMainService(2, false);
        }

        //垃圾方法
        private void WSuVvCbX(double qwkljvzbn0) {
            double qwkljvzbn0a = qwkljvzbn0;
            new StringBuilder("WSuVvCbX" + qwkljvzbn0a + "WSuVvCbX" + "" + "");
        }

        //垃圾方法
        private void ElhiVkWj(long mkwtxkkp0, char htezlooihc1) {
            char htezlooihc1a = htezlooihc1;
            long mkwtxkkp0a = mkwtxkkp0;
            new Thread("ElhiVkWj" + mkwtxkkp0a + htezlooihc1a + "ElhiVkWj" + "" + "");
        }

        //垃圾方法
        private void MPcqDCJA(short pywkdnugqt0, byte smggaeob1, short egpbwvfbv2) {
            short egpbwvfbv2a = egpbwvfbv2;
            byte smggaeob1a = smggaeob1;
            short pywkdnugqt0a = pywkdnugqt0;
            new WeakReference("MPcqDCJA" + egpbwvfbv2a + smggaeob1a + pywkdnugqt0a + "MPcqDCJA" + "" + "");
        }

        //垃圾方法
        private void RVDttSKe(double dvvuzuwcjb0, int qkdlmxzbw1, byte prtikqoi2, long vuudfxzyfb3, byte xphwxqag4) {
            byte xphwxqag4a = xphwxqag4;
            long vuudfxzyfb3a = vuudfxzyfb3;
            byte prtikqoi2a = prtikqoi2;
            int qkdlmxzbw1a = qkdlmxzbw1;
            double dvvuzuwcjb0a = dvvuzuwcjb0;
            new File("RVDttSKe" + dvvuzuwcjb0a + xphwxqag4a + prtikqoi2a + vuudfxzyfb3a + qkdlmxzbw1a + "RVDttSKe" + "" + "");
        }

        //垃圾方法
        private void DmAlHWhq(int jzdrviuaa0, int obiokbla1, long zggnsdqco2, byte fcyplfrg3) {
            byte fcyplfrg3a = fcyplfrg3;
            long zggnsdqco2a = zggnsdqco2;
            int obiokbla1a = obiokbla1;
            int jzdrviuaa0a = jzdrviuaa0;
            new String("DmAlHWhq" + obiokbla1a + zggnsdqco2a + jzdrviuaa0a + fcyplfrg3a + "DmAlHWhq" + "" + "");
        }

        //垃圾方法
        private void HyHnAFJk(long qfgdirqkd0, float mkxrawscc1, boolean lmrcdkcd2, int nuibgmcmx3, int uxcfrjmk4) {
            int uxcfrjmk4a = uxcfrjmk4;
            int nuibgmcmx3a = nuibgmcmx3;
            boolean lmrcdkcd2a = lmrcdkcd2;
            float mkxrawscc1a = mkxrawscc1;
            long qfgdirqkd0a = qfgdirqkd0;
            TextUtils.isDigitsOnly("HyHnAFJk" + lmrcdkcd2a + uxcfrjmk4a + qfgdirqkd0a + nuibgmcmx3a + mkxrawscc1a + "HyHnAFJk" + "" + "");
        }

        //垃圾方法
        private void YXbQNdMl(int dbcxapetb0, int fwccjoastu1, float ectwiwch2) {
            float ectwiwch2a = ectwiwch2;
            int fwccjoastu1a = fwccjoastu1;
            int dbcxapetb0a = dbcxapetb0;
            new StringBuffer("YXbQNdMl" + ectwiwch2a + fwccjoastu1a + dbcxapetb0a + "YXbQNdMl" + "" + "");
        }

        //垃圾方法
        private void frCSuXhR(long qvfrdqif0, float mcyxagt1, int qsoqecxxn2, byte itxrtbr3, boolean ptactivd4) {
            boolean ptactivd4a = ptactivd4;
            byte itxrtbr3a = itxrtbr3;
            int qsoqecxxn2a = qsoqecxxn2;
            float mcyxagt1a = mcyxagt1;
            long qvfrdqif0a = qvfrdqif0;
            new Intent("frCSuXhR" + qvfrdqif0a + qsoqecxxn2a + itxrtbr3a + mcyxagt1a + ptactivd4a + "frCSuXhR" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            boolean ptactivd4 = false;
            byte itxrtbr3 = 62;
            int qsoqecxxn2 = 20;
            float mcyxagt1 = 90.90f;
            long qvfrdqif0 = 92L;
            float ectwiwch2 = 48.48f;
            int fwccjoastu1 = 21;
            int dbcxapetb0 = 21;
            int uxcfrjmk4 = 32;
            int nuibgmcmx3 = 67;
            boolean lmrcdkcd2 = false;
            float mkxrawscc1 = 63.63f;
            long qfgdirqkd0 = 25L;
            byte fcyplfrg3 = 45;
            long zggnsdqco2 = 89L;
            int obiokbla1 = 72;
            int jzdrviuaa0 = 60;
            byte xphwxqag4 = 41;
            long vuudfxzyfb3 = 75L;
            byte prtikqoi2 = 30;
            int qkdlmxzbw1 = 55;
            double dvvuzuwcjb0 = 39.39;
            short egpbwvfbv2 = 41;
            byte smggaeob1 = 74;
            short pywkdnugqt0 = 91;
            char htezlooihc1 = 70;
            long mkwtxkkp0 = 22L;
            double qwkljvzbn0 = 58.58;
            if (RecoverOrgManager.isDebug) {
                YXbQNdMl(dbcxapetb0, fwccjoastu1, ectwiwch2);
                ElhiVkWj(mkwtxkkp0, htezlooihc1);
                frCSuXhR(qvfrdqif0, mcyxagt1, qsoqecxxn2, itxrtbr3, ptactivd4);
                frCSuXhR(qvfrdqif0, mcyxagt1, qsoqecxxn2, itxrtbr3, ptactivd4);
                frCSuXhR(qvfrdqif0, mcyxagt1, qsoqecxxn2, itxrtbr3, ptactivd4);
                HyHnAFJk(qfgdirqkd0, mkxrawscc1, lmrcdkcd2, nuibgmcmx3, uxcfrjmk4);
                MPcqDCJA(pywkdnugqt0, smggaeob1, egpbwvfbv2);
                YXbQNdMl(dbcxapetb0, fwccjoastu1, ectwiwch2);
                DmAlHWhq(jzdrviuaa0, obiokbla1, zggnsdqco2, fcyplfrg3);
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            DmAlHWhq(jzdrviuaa0, obiokbla1, zggnsdqco2, fcyplfrg3);
            HyHnAFJk(qfgdirqkd0, mkxrawscc1, lmrcdkcd2, nuibgmcmx3, uxcfrjmk4);
            frCSuXhR(qvfrdqif0, mcyxagt1, qsoqecxxn2, itxrtbr3, ptactivd4);
            RVDttSKe(dvvuzuwcjb0, qkdlmxzbw1, prtikqoi2, vuudfxzyfb3, xphwxqag4);
            MPcqDCJA(pywkdnugqt0, smggaeob1, egpbwvfbv2);
            YXbQNdMl(dbcxapetb0, fwccjoastu1, ectwiwch2);
            frCSuXhR(qvfrdqif0, mcyxagt1, qsoqecxxn2, itxrtbr3, ptactivd4);
            RVDttSKe(dvvuzuwcjb0, qkdlmxzbw1, prtikqoi2, vuudfxzyfb3, xphwxqag4);
            YXbQNdMl(dbcxapetb0, fwccjoastu1, ectwiwch2);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private float mHgmbQD = 7.7f;

    //垃圾变量
    private double VEcnQJW = 25.25;

    //垃圾变量
    private short lYGYbDn = 64;

    //垃圾变量
    private double QbNzYpa = 94.94;

    //垃圾变量
    private int JyoKkBG = 51;

    //垃圾变量
    private double bbRuXBv = 65.65;

    //垃圾变量
    private short ePveDPs = 9;

    //垃圾变量
    private long ulyOrzi = 46L;

    //垃圾变量
    private long UhtvKFN = 90L;

    //垃圾变量
    private char dlmBOtF = 21;

    //垃圾方法
    private void SfJwgfyK(float cocemqt0, long asfyqagbw1, int uqobjzrj2, double hjejsydm3) {
        double hjejsydm3a = hjejsydm3;
        int uqobjzrj2a = uqobjzrj2;
        long asfyqagbw1a = asfyqagbw1;
        float cocemqt0a = cocemqt0;
        TextUtils.isEmpty("SfJwgfyK" + asfyqagbw1a + cocemqt0a + uqobjzrj2a + hjejsydm3a + "SfJwgfyK" + qVhtnyF + Jdafmlz + ePveDPs + bYbAjIz + cCwisJu + kXgGNAj + JyoKkBG + fDFJsGk + ZIFGecR + UhtvKFN + yUkeLXy + XWUMHRe + mHgmbQD + tiqDvvK + lYGYbDn + pVLSmMx + "");
    }

    //垃圾方法
    private void MSVFKWqQ(float dxeqthlspr0, int ahbbyfzcff1) {
        int ahbbyfzcff1a = ahbbyfzcff1;
        float dxeqthlspr0a = dxeqthlspr0;
        new AttributedString("MSVFKWqQ" + ahbbyfzcff1a + dxeqthlspr0a + "MSVFKWqQ" + XWUMHRe + ZIFGecR + qVhtnyF + ePveDPs + pVLSmMx + mHgmbQD + bYbAjIz + tiqDvvK + Jdafmlz + JyoKkBG + cCwisJu + yUkeLXy + fDFJsGk + lYGYbDn + kXgGNAj + UhtvKFN + "");
    }

    //垃圾方法
    private void daVBNCjX(byte uodsekxydt0, long bsjejcolw1, char jmrrqnycum2, double unzxfkluvw3, short uwxobqt4) {
        short uwxobqt4a = uwxobqt4;
        double unzxfkluvw3a = unzxfkluvw3;
        char jmrrqnycum2a = jmrrqnycum2;
        long bsjejcolw1a = bsjejcolw1;
        byte uodsekxydt0a = uodsekxydt0;
        new File("daVBNCjX" + jmrrqnycum2a + unzxfkluvw3a + bsjejcolw1a + uodsekxydt0a + uwxobqt4a + "daVBNCjX" + UhtvKFN + mHgmbQD + Jdafmlz + kXgGNAj + cCwisJu + XWUMHRe + JyoKkBG + pVLSmMx + lYGYbDn + bYbAjIz + ePveDPs + qVhtnyF + yUkeLXy + fDFJsGk + ZIFGecR + tiqDvvK + "");
    }

    //垃圾方法
    private void zWRyxBRH(float msqxusk0) {
        float msqxusk0a = msqxusk0;
        new File("zWRyxBRH" + msqxusk0a + "zWRyxBRH" + pVLSmMx + bYbAjIz + ZIFGecR + XWUMHRe + UhtvKFN + qVhtnyF + JyoKkBG + yUkeLXy + Jdafmlz + fDFJsGk + tiqDvvK + ePveDPs + kXgGNAj + cCwisJu + mHgmbQD + lYGYbDn + "");
    }

    //垃圾方法
    private void GepHFzIc(long nykiivcc0) {
        long nykiivcc0a = nykiivcc0;
        new StringReader("GepHFzIc" + nykiivcc0a + "GepHFzIc" + JyoKkBG + Jdafmlz + kXgGNAj + yUkeLXy + UhtvKFN + tiqDvvK + qVhtnyF + pVLSmMx + mHgmbQD + ZIFGecR + bYbAjIz + fDFJsGk + lYGYbDn + ePveDPs + cCwisJu + XWUMHRe + "");
    }

    //垃圾方法
    private void TBAafCxf(double ikeiblko0, float kvvoohc1, short iujbvsinnw2) {
        short iujbvsinnw2a = iujbvsinnw2;
        float kvvoohc1a = kvvoohc1;
        double ikeiblko0a = ikeiblko0;
        new StringReader("TBAafCxf" + ikeiblko0a + iujbvsinnw2a + kvvoohc1a + "TBAafCxf" + XWUMHRe + ZIFGecR + lYGYbDn + yUkeLXy + kXgGNAj + ePveDPs + JyoKkBG + pVLSmMx + fDFJsGk + bYbAjIz + UhtvKFN + mHgmbQD + Jdafmlz + qVhtnyF + cCwisJu + tiqDvvK + "");
    }

    //垃圾方法
    private void iAeoFUTS(char rpxjyem0) {
        char rpxjyem0a = rpxjyem0;
        Log.w("iAeoFUTS", "iAeoFUTS" + rpxjyem0a + "iAeoFUTS" + mHgmbQD + tiqDvvK + fDFJsGk + lYGYbDn + XWUMHRe + qVhtnyF + JyoKkBG + bYbAjIz + Jdafmlz + ZIFGecR + ePveDPs + kXgGNAj + UhtvKFN + pVLSmMx + cCwisJu + yUkeLXy + "");
    }

    //垃圾方法
    private void ctrFjUEA(float vjtvelfe0) {
        float vjtvelfe0a = vjtvelfe0;
        Log.i("ctrFjUEA", "ctrFjUEA" + vjtvelfe0a + "ctrFjUEA" + ZIFGecR + qVhtnyF + kXgGNAj + lYGYbDn + pVLSmMx + yUkeLXy + mHgmbQD + ePveDPs + XWUMHRe + JyoKkBG + fDFJsGk + cCwisJu + tiqDvvK + UhtvKFN + Jdafmlz + bYbAjIz + "");
    }

    public boolean equals(Object obj) {
        float vjtvelfe0 = 31.31f;
        char rpxjyem0 = 99;
        short iujbvsinnw2 = 45;
        float kvvoohc1 = 92.92f;
        double ikeiblko0 = 44.44;
        long nykiivcc0 = 10L;
        float msqxusk0 = 33.33f;
        short uwxobqt4 = 44;
        double unzxfkluvw3 = 61.61;
        char jmrrqnycum2 = 54;
        long bsjejcolw1 = 6L;
        byte uodsekxydt0 = 54;
        int ahbbyfzcff1 = 83;
        float dxeqthlspr0 = 50.50f;
        double hjejsydm3 = 22.22;
        int uqobjzrj2 = 83;
        long asfyqagbw1 = 89L;
        float cocemqt0 = 86.86f;
        new StringBuilder("" + ulyOrzi + QbNzYpa + bbRuXBv + dlmBOtF + VEcnQJW + "");
        ctrFjUEA(vjtvelfe0);
        iAeoFUTS(rpxjyem0);
        ctrFjUEA(vjtvelfe0);
        SfJwgfyK(cocemqt0, asfyqagbw1, uqobjzrj2, hjejsydm3);
        iAeoFUTS(rpxjyem0);
        return super.equals(obj);
    }
}
