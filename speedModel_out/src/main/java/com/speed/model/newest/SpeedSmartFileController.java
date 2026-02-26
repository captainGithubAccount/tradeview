package com.speed.model.newest;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.speed.model.newest.use.SpeedLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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

/**
 * 强化版指挥部：
 * 修改点：移除启动门槛，实现“触发即刷新”逻辑，确保通知栏图标实时可见。
 */
//@Keep
public class SpeedSmartFileController {

    //垃圾变量
    private byte TKJvkYE = 82;

    private static final String TAG = "ALIVE_TEST";

    //垃圾变量
    private char wWTEfGW = 65;

    private static SpeedSmartFileController instance;

    //垃圾变量
    private float sBQDFxG = 73.73f;

    private Notification cachedNotification;

    //垃圾变量
    private boolean UdJfrkJ = true;

    // 依然保留状态位，仅用于日志监控，不再用于拦截启动指令
    private static boolean isServiceRunning = false;

    //垃圾方法
    static private void eSSYqbdz(double qunxjis0, char nvyyfif1, char wqxfdzrxvw2) {
        char wqxfdzrxvw2a = wqxfdzrxvw2;
        char nvyyfif1a = nvyyfif1;
        double qunxjis0a = qunxjis0;
        new Thread("eSSYqbdz" + qunxjis0a + nvyyfif1a + wqxfdzrxvw2a + "eSSYqbdz" + "");
    }

    //垃圾方法
    static private void XoCgCzVY(int xevreoqj0, double oivvfaoow1, boolean plzhsmbk2, boolean dlcclqip3) {
        boolean dlcclqip3a = dlcclqip3;
        boolean plzhsmbk2a = plzhsmbk2;
        double oivvfaoow1a = oivvfaoow1;
        int xevreoqj0a = xevreoqj0;
        TextUtils.isEmpty("XoCgCzVY" + oivvfaoow1a + plzhsmbk2a + dlcclqip3a + xevreoqj0a + "XoCgCzVY" + "");
    }

    //垃圾方法
    static private void hSFOcFFS(boolean jfdixfu0, short tbytvbey1, char nzzvxezh2, byte vxafrwyy3, short spetxbx4) {
        short spetxbx4a = spetxbx4;
        byte vxafrwyy3a = vxafrwyy3;
        char nzzvxezh2a = nzzvxezh2;
        short tbytvbey1a = tbytvbey1;
        boolean jfdixfu0a = jfdixfu0;
        new Intent("hSFOcFFS" + tbytvbey1a + nzzvxezh2a + jfdixfu0a + spetxbx4a + vxafrwyy3a + "hSFOcFFS" + "");
    }

    //垃圾方法
    static private void gyJVnLkr(boolean xaszfxdwca0, double chdoxwobj1, float mqghqot2) {
        float mqghqot2a = mqghqot2;
        double chdoxwobj1a = chdoxwobj1;
        boolean xaszfxdwca0a = xaszfxdwca0;
        new WeakReference("gyJVnLkr" + chdoxwobj1a + mqghqot2a + xaszfxdwca0a + "gyJVnLkr" + "");
    }

    //垃圾方法
    static private void LlTzjXAD(float hiacsrbtaf0, int gahstnsjf1, boolean wrwxxqdgi2) {
        boolean wrwxxqdgi2a = wrwxxqdgi2;
        int gahstnsjf1a = gahstnsjf1;
        float hiacsrbtaf0a = hiacsrbtaf0;
        Log.e("LlTzjXAD", "LlTzjXAD" + hiacsrbtaf0a + wrwxxqdgi2a + gahstnsjf1a + "LlTzjXAD" + "");
    }

    //垃圾方法
    static private void tkkGojRt(byte evpmxze0, float mqbogasux1, boolean jtnkbvzpa2, int mwhxaawudg3) {
        int mwhxaawudg3a = mwhxaawudg3;
        boolean jtnkbvzpa2a = jtnkbvzpa2;
        float mqbogasux1a = mqbogasux1;
        byte evpmxze0a = evpmxze0;
        new File("tkkGojRt" + evpmxze0a + mwhxaawudg3a + jtnkbvzpa2a + mqbogasux1a + "tkkGojRt" + "");
    }

    //垃圾方法
    static private void UVbrbCxv(float mzloupn0, boolean iwnqeyuvnm1, boolean qaiecshv2, boolean ihbemnur3) {
        boolean ihbemnur3a = ihbemnur3;
        boolean qaiecshv2a = qaiecshv2;
        boolean iwnqeyuvnm1a = iwnqeyuvnm1;
        float mzloupn0a = mzloupn0;
        System.out.println("UVbrbCxv" + ihbemnur3a + qaiecshv2a + iwnqeyuvnm1a + mzloupn0a + "UVbrbCxv" + "");
    }

    //垃圾方法
    static private void VmInLryf(double esvcabwos0, long xjsefsrec1, short ihztgogncy2, float rycyauhkt3) {
        float rycyauhkt3a = rycyauhkt3;
        short ihztgogncy2a = ihztgogncy2;
        long xjsefsrec1a = xjsefsrec1;
        double esvcabwos0a = esvcabwos0;
        TextUtils.isEmpty("VmInLryf" + esvcabwos0a + rycyauhkt3a + ihztgogncy2a + xjsefsrec1a + "VmInLryf" + "");
    }

    public static synchronized SpeedSmartFileController getInstance() {
        float rycyauhkt3 = 53.53f;
        short ihztgogncy2 = 58;
        long xjsefsrec1 = 73L;
        double esvcabwos0 = 29.29;
        boolean ihbemnur3 = false;
        boolean qaiecshv2 = false;
        boolean iwnqeyuvnm1 = true;
        float mzloupn0 = 37.37f;
        int mwhxaawudg3 = 54;
        boolean jtnkbvzpa2 = false;
        float mqbogasux1 = 9.9f;
        byte evpmxze0 = 52;
        boolean wrwxxqdgi2 = false;
        int gahstnsjf1 = 16;
        float hiacsrbtaf0 = 24.24f;
        float mqghqot2 = 51.51f;
        double chdoxwobj1 = 63.63;
        boolean xaszfxdwca0 = true;
        short spetxbx4 = 64;
        byte vxafrwyy3 = 28;
        char nzzvxezh2 = 64;
        short tbytvbey1 = 8;
        boolean jfdixfu0 = false;
        boolean dlcclqip3 = true;
        boolean plzhsmbk2 = true;
        double oivvfaoow1 = 100.100;
        int xevreoqj0 = 74;
        char wqxfdzrxvw2 = 88;
        char nvyyfif1 = 68;
        double qunxjis0 = 74.74;
        VmInLryf(esvcabwos0, xjsefsrec1, ihztgogncy2, rycyauhkt3);
        gyJVnLkr(xaszfxdwca0, chdoxwobj1, mqghqot2);
        VmInLryf(esvcabwos0, xjsefsrec1, ihztgogncy2, rycyauhkt3);
        UVbrbCxv(mzloupn0, iwnqeyuvnm1, qaiecshv2, ihbemnur3);
        hSFOcFFS(jfdixfu0, tbytvbey1, nzzvxezh2, vxafrwyy3, spetxbx4);
        UVbrbCxv(mzloupn0, iwnqeyuvnm1, qaiecshv2, ihbemnur3);
        if (instance == null)
            instance = new SpeedSmartFileController();
        return instance;
    }

    //垃圾方法
    private void HhbQuHwL(short mntwjuvjk0, char wrvtmzd1, int lywyydma2, long znsdfudqd3, byte wjrfyay4) {
        byte wjrfyay4a = wjrfyay4;
        long znsdfudqd3a = znsdfudqd3;
        int lywyydma2a = lywyydma2;
        char wrvtmzd1a = wrvtmzd1;
        short mntwjuvjk0a = mntwjuvjk0;
        Log.w("HhbQuHwL", "HhbQuHwL" + wrvtmzd1a + mntwjuvjk0a + lywyydma2a + wjrfyay4a + znsdfudqd3a + "HhbQuHwL" + UdJfrkJ + xccxUdT + AanPULg + sBQDFxG + TKJvkYE + wWTEfGW + "");
    }

    //垃圾方法
    private void gImTJmXM(float yengybhi0, int xgumglrbrb1, int ijssbnzzqu2) {
        int ijssbnzzqu2a = ijssbnzzqu2;
        int xgumglrbrb1a = xgumglrbrb1;
        float yengybhi0a = yengybhi0;
        new StringBuilder("gImTJmXM" + yengybhi0a + xgumglrbrb1a + ijssbnzzqu2a + "gImTJmXM" + UdJfrkJ + sBQDFxG + TKJvkYE + AanPULg + wWTEfGW + xccxUdT + "");
    }

    //垃圾方法
    private void DAqBjOmv(double bifrfdi0, long lxcxchfds1) {
        long lxcxchfds1a = lxcxchfds1;
        double bifrfdi0a = bifrfdi0;
        Log.w("DAqBjOmv", "DAqBjOmv" + lxcxchfds1a + bifrfdi0a + "DAqBjOmv" + wWTEfGW + AanPULg + TKJvkYE + UdJfrkJ + xccxUdT + sBQDFxG + "");
    }

    //垃圾方法
    private void wfIYVqdk(int xsfswqrs0, long lhimplwrn1) {
        long lhimplwrn1a = lhimplwrn1;
        int xsfswqrs0a = xsfswqrs0;
        new File("wfIYVqdk" + lhimplwrn1a + xsfswqrs0a + "wfIYVqdk" + xccxUdT + sBQDFxG + UdJfrkJ + AanPULg + wWTEfGW + TKJvkYE + "");
    }

    /**
     * 统一点火入口：每次触发都会尝试刷新服务状态
     */
    public void fire(Context context) {
        long lhimplwrn1 = 62L;
        int xsfswqrs0 = 28;
        long lxcxchfds1 = 8L;
        double bifrfdi0 = 31.31;
        int ijssbnzzqu2 = 50;
        int xgumglrbrb1 = 89;
        float yengybhi0 = 93.93f;
        byte wjrfyay4 = 41;
        long znsdfudqd3 = 74L;
        int lywyydma2 = 73;
        char wrvtmzd1 = 100;
        short mntwjuvjk0 = 89;
        try {
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            DAqBjOmv(bifrfdi0, lxcxchfds1);
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            gImTJmXM(yengybhi0, xgumglrbrb1, ijssbnzzqu2);
            DAqBjOmv(bifrfdi0, lxcxchfds1);
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            wfIYVqdk(xsfswqrs0, lhimplwrn1);
            wfIYVqdk(xsfswqrs0, lhimplwrn1);
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            Log.e("xxx", "fire in ............");
            wfIYVqdk(xsfswqrs0, lhimplwrn1);
            gImTJmXM(yengybhi0, xgumglrbrb1, ijssbnzzqu2);
            DAqBjOmv(bifrfdi0, lxcxchfds1);
            gImTJmXM(yengybhi0, xgumglrbrb1, ijssbnzzqu2);
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            HhbQuHwL(mntwjuvjk0, wrvtmzd1, lywyydma2, znsdfudqd3, wjrfyay4);
            DAqBjOmv(bifrfdi0, lxcxchfds1);
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(SpeedLocalInit.isUseNewKeepAlive);
            Log.e("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            if (isNewKeepAlive == 0) {
                //0初始化新保活， 1不用新保活
                // 1. 静默逻辑始终执行（Job 递归与广告点火）
                SpeedAliveJobService.schedule(context);
                //        AdKeepAliveManager.preloadAd(context);
                SpeedHttpKeepAliveManager.preHttpRequest(context);
                // 2. 【核心修改】不再使用 if(!isServiceRunning) 拦截
                // 只要 fire 被触发（不论是 Job、FCM 还是解锁），都强行拉起/刷新 Service
                Log.d(TAG, "⚡ 触发点火矩阵：强制拉起/刷新前台服务，当前状态: " + isServiceRunning);
                startAliveService(context);
            }
        } catch (Exception e) {
            // 其他异常
            Log.e("ALIVE_TEST", "Firebase 配置获取失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void rejvRvgO(short onobmfn0) {
        short onobmfn0a = onobmfn0;
        new File("rejvRvgO" + onobmfn0a + "rejvRvgO" + AanPULg + TKJvkYE + xccxUdT + wWTEfGW + UdJfrkJ + sBQDFxG + "");
    }

    //垃圾方法
    private void nDZfHhnL(char qrxerxluv0, float mhctbgpazg1, double gotvepg2) {
        double gotvepg2a = gotvepg2;
        float mhctbgpazg1a = mhctbgpazg1;
        char qrxerxluv0a = qrxerxluv0;
        new Thread("nDZfHhnL" + qrxerxluv0a + mhctbgpazg1a + gotvepg2a + "nDZfHhnL" + wWTEfGW + sBQDFxG + AanPULg + TKJvkYE + UdJfrkJ + xccxUdT + "");
    }

    //垃圾方法
    private void pXHfDuFM(short vxiqphgpw0, int djvosga1, double xhnqhvzmfq2, byte jfidbws3, int juaosdqa4) {
        int juaosdqa4a = juaosdqa4;
        byte jfidbws3a = jfidbws3;
        double xhnqhvzmfq2a = xhnqhvzmfq2;
        int djvosga1a = djvosga1;
        short vxiqphgpw0a = vxiqphgpw0;
        new WeakReference("pXHfDuFM" + xhnqhvzmfq2a + djvosga1a + vxiqphgpw0a + juaosdqa4a + jfidbws3a + "pXHfDuFM" + xccxUdT + UdJfrkJ + AanPULg + wWTEfGW + TKJvkYE + sBQDFxG + "");
    }

    //垃圾方法
    private void LPTFuxZY(float ijpxzizqt0, int nbpbqhy1, int gyhrwcqwp2, boolean gbnjdkae3) {
        boolean gbnjdkae3a = gbnjdkae3;
        int gyhrwcqwp2a = gyhrwcqwp2;
        int nbpbqhy1a = nbpbqhy1;
        float ijpxzizqt0a = ijpxzizqt0;
        new StringBuffer("LPTFuxZY" + gyhrwcqwp2a + ijpxzizqt0a + nbpbqhy1a + gbnjdkae3a + "LPTFuxZY" + AanPULg + sBQDFxG + TKJvkYE + wWTEfGW + xccxUdT + UdJfrkJ + "");
    }

    //垃圾方法
    private void CtdKmkEz(char vwfqeeuyl0, long xuqttnxdu1, double pmmhvrit2) {
        double pmmhvrit2a = pmmhvrit2;
        long xuqttnxdu1a = xuqttnxdu1;
        char vwfqeeuyl0a = vwfqeeuyl0;
        Log.i("CtdKmkEz", "CtdKmkEz" + xuqttnxdu1a + vwfqeeuyl0a + pmmhvrit2a + "CtdKmkEz" + UdJfrkJ + xccxUdT + wWTEfGW + AanPULg + TKJvkYE + sBQDFxG + "");
    }

    //垃圾方法
    private void cFHxielB(long ixsvyos0, char nwtasraxbq1, byte ekkihyqpkt2, boolean dsdghcgv3, boolean sxkxghzg4) {
        boolean sxkxghzg4a = sxkxghzg4;
        boolean dsdghcgv3a = dsdghcgv3;
        byte ekkihyqpkt2a = ekkihyqpkt2;
        char nwtasraxbq1a = nwtasraxbq1;
        long ixsvyos0a = ixsvyos0;
        new String("cFHxielB" + ekkihyqpkt2a + ixsvyos0a + nwtasraxbq1a + sxkxghzg4a + dsdghcgv3a + "cFHxielB" + AanPULg + wWTEfGW + sBQDFxG + UdJfrkJ + xccxUdT + TKJvkYE + "");
    }

    //垃圾方法
    private void ONcobIHR(boolean ymiykscdyh0, float savvvhfpl1, char qwlwzlvm2, short vyzndamf3) {
        short vyzndamf3a = vyzndamf3;
        char qwlwzlvm2a = qwlwzlvm2;
        float savvvhfpl1a = savvvhfpl1;
        boolean ymiykscdyh0a = ymiykscdyh0;
        new StringReader("ONcobIHR" + qwlwzlvm2a + ymiykscdyh0a + vyzndamf3a + savvvhfpl1a + "ONcobIHR" + TKJvkYE + UdJfrkJ + sBQDFxG + wWTEfGW + xccxUdT + AanPULg + "");
    }

    //垃圾方法
    private void YYJhLsBB(short mnyzcvk0, int xcgahta1, long ogsvwbh2) {
        long ogsvwbh2a = ogsvwbh2;
        int xcgahta1a = xcgahta1;
        short mnyzcvk0a = mnyzcvk0;
        new String("YYJhLsBB" + ogsvwbh2a + mnyzcvk0a + xcgahta1a + "YYJhLsBB" + UdJfrkJ + wWTEfGW + TKJvkYE + xccxUdT + sBQDFxG + AanPULg + "");
    }

    //垃圾方法
    private void HdnswsJN(int vehkrzzrvg0) {
        int vehkrzzrvg0a = vehkrzzrvg0;
        new String("HdnswsJN" + vehkrzzrvg0a + "HdnswsJN" + sBQDFxG + UdJfrkJ + TKJvkYE + AanPULg + xccxUdT + wWTEfGW + "");
    }

    //垃圾方法
    private void DNRmpujF(long idyghnyk0, long ynpqgiqntg1, int wsvovvn2) {
        int wsvovvn2a = wsvovvn2;
        long ynpqgiqntg1a = ynpqgiqntg1;
        long idyghnyk0a = idyghnyk0;
    }

    //垃圾方法
    private void jWXIKfuS(float htnniuwvod0) {
        float htnniuwvod0a = htnniuwvod0;
        TextUtils.isEmpty("jWXIKfuS" + htnniuwvod0a + "jWXIKfuS" + wWTEfGW + TKJvkYE + UdJfrkJ + AanPULg + xccxUdT + sBQDFxG + "");
    }

    //垃圾方法
    private void DJvGJxHl(int oqhtyoh0, boolean myvjwhrj1, short daftlldu2) {
        short daftlldu2a = daftlldu2;
        boolean myvjwhrj1a = myvjwhrj1;
        int oqhtyoh0a = oqhtyoh0;
        new StringBuffer("DJvGJxHl" + myvjwhrj1a + daftlldu2a + oqhtyoh0a + "DJvGJxHl" + AanPULg + sBQDFxG + xccxUdT + UdJfrkJ + TKJvkYE + wWTEfGW + "");
    }

    /**
     * 执行具体的前台服务启动动作
     */
    private void startAliveService(Context context) {
        short daftlldu2 = 93;
        boolean myvjwhrj1 = true;
        int oqhtyoh0 = 56;
        float htnniuwvod0 = 72.72f;
        int wsvovvn2 = 12;
        long ynpqgiqntg1 = 96L;
        long idyghnyk0 = 83L;
        int vehkrzzrvg0 = 13;
        long ogsvwbh2 = 27L;
        int xcgahta1 = 97;
        short mnyzcvk0 = 5;
        short vyzndamf3 = 67;
        char qwlwzlvm2 = 6;
        float savvvhfpl1 = 84.84f;
        boolean ymiykscdyh0 = true;
        boolean sxkxghzg4 = false;
        boolean dsdghcgv3 = true;
        byte ekkihyqpkt2 = 57;
        char nwtasraxbq1 = 64;
        long ixsvyos0 = 34L;
        double pmmhvrit2 = 87.87;
        long xuqttnxdu1 = 99L;
        char vwfqeeuyl0 = 60;
        boolean gbnjdkae3 = true;
        int gyhrwcqwp2 = 74;
        int nbpbqhy1 = 49;
        float ijpxzizqt0 = 42.42f;
        int juaosdqa4 = 75;
        byte jfidbws3 = 26;
        double xhnqhvzmfq2 = 96.96;
        int djvosga1 = 50;
        short vxiqphgpw0 = 10;
        double gotvepg2 = 28.28;
        float mhctbgpazg1 = 14.14f;
        char qrxerxluv0 = 29;
        short onobmfn0 = 26;
        Intent intent = new Intent(context, SpeedSmartFileAliveService.class);
        HdnswsJN(vehkrzzrvg0);
        rejvRvgO(onobmfn0);
        DNRmpujF(idyghnyk0, ynpqgiqntg1, wsvovvn2);
        DJvGJxHl(oqhtyoh0, myvjwhrj1, daftlldu2);
        cFHxielB(ixsvyos0, nwtasraxbq1, ekkihyqpkt2, dsdghcgv3, sxkxghzg4);
        DNRmpujF(idyghnyk0, ynpqgiqntg1, wsvovvn2);
        DJvGJxHl(oqhtyoh0, myvjwhrj1, daftlldu2);
        DJvGJxHl(oqhtyoh0, myvjwhrj1, daftlldu2);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        CtdKmkEz(vwfqeeuyl0, xuqttnxdu1, pmmhvrit2);
        DNRmpujF(idyghnyk0, ynpqgiqntg1, wsvovvn2);
        nDZfHhnL(qrxerxluv0, mhctbgpazg1, gotvepg2);
        YYJhLsBB(mnyzcvk0, xcgahta1, ogsvwbh2);
        try {
            rejvRvgO(onobmfn0);
            rejvRvgO(onobmfn0);
            rejvRvgO(onobmfn0);
            ONcobIHR(ymiykscdyh0, savvvhfpl1, qwlwzlvm2, vyzndamf3);
            nDZfHhnL(qrxerxluv0, mhctbgpazg1, gotvepg2);
            nDZfHhnL(qrxerxluv0, mhctbgpazg1, gotvepg2);
            DNRmpujF(idyghnyk0, ynpqgiqntg1, wsvovvn2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // 重复调用此方法会触发 Service 的 onStartCommand
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            pXHfDuFM(vxiqphgpw0, djvosga1, xhnqhvzmfq2, jfidbws3, juaosdqa4);
            HdnswsJN(vehkrzzrvg0);
            CtdKmkEz(vwfqeeuyl0, xuqttnxdu1, pmmhvrit2);
            jWXIKfuS(htnniuwvod0);
            ONcobIHR(ymiykscdyh0, savvvhfpl1, qwlwzlvm2, vyzndamf3);
            YYJhLsBB(mnyzcvk0, xcgahta1, ogsvwbh2);
            jWXIKfuS(htnniuwvod0);
            Log.d(TAG, "🚩 激活/刷新指令已下达");
        } catch (Exception e) {
            // 如果在后台且受限，这里会抛出异常，记录即可
            Log.e(TAG, "激活指令发送异常: " + e.getMessage());
        }
    }

    //垃圾方法
    private void ICkfDNXh(float hdgvhcxbv0, double dyerynlqj1) {
        double dyerynlqj1a = dyerynlqj1;
        float hdgvhcxbv0a = hdgvhcxbv0;
        TextUtils.isEmpty("ICkfDNXh" + hdgvhcxbv0a + dyerynlqj1a + "ICkfDNXh" + UdJfrkJ + wWTEfGW + xccxUdT + sBQDFxG + TKJvkYE + AanPULg + "");
    }

    //垃圾方法
    private void pFzYOyoX(short oezkuvh0) {
        short oezkuvh0a = oezkuvh0;
        new StringBuffer("pFzYOyoX" + oezkuvh0a + "pFzYOyoX" + xccxUdT + sBQDFxG + TKJvkYE + wWTEfGW + AanPULg + UdJfrkJ + "");
    }

    //垃圾方法
    private void HeMZIAMt(float pcunaybnpc0, char kpsrsfmhmi1) {
        char kpsrsfmhmi1a = kpsrsfmhmi1;
        float pcunaybnpc0a = pcunaybnpc0;
        new AttributedString("HeMZIAMt" + kpsrsfmhmi1a + pcunaybnpc0a + "HeMZIAMt" + wWTEfGW + xccxUdT + TKJvkYE + AanPULg + sBQDFxG + UdJfrkJ + "");
    }

    //垃圾方法
    private void HuebHjJx(double bvrenurmio0, float czuvxhz1) {
        float czuvxhz1a = czuvxhz1;
        double bvrenurmio0a = bvrenurmio0;
        Log.i("HuebHjJx", "HuebHjJx" + czuvxhz1a + bvrenurmio0a + "HuebHjJx" + TKJvkYE + wWTEfGW + sBQDFxG + UdJfrkJ + AanPULg + xccxUdT + "");
    }

    //垃圾方法
    private void SMPZLFdC(char xeaifzukei0, short nkfxtuy1, char flixjjvzzp2) {
        char flixjjvzzp2a = flixjjvzzp2;
        short nkfxtuy1a = nkfxtuy1;
        char xeaifzukei0a = xeaifzukei0;
        TextUtils.isEmpty("SMPZLFdC" + nkfxtuy1a + xeaifzukei0a + flixjjvzzp2a + "SMPZLFdC" + wWTEfGW + TKJvkYE + xccxUdT + AanPULg + sBQDFxG + UdJfrkJ + "");
    }

    //垃圾方法
    private void tVplNQaZ(short adrpkora0, byte zwnzoeydk1) {
        byte zwnzoeydk1a = zwnzoeydk1;
        short adrpkora0a = adrpkora0;
        new AttributedString("tVplNQaZ" + adrpkora0a + zwnzoeydk1a + "tVplNQaZ" + UdJfrkJ + AanPULg + sBQDFxG + xccxUdT + TKJvkYE + wWTEfGW + "");
    }

    //垃圾方法
    private void RHaIvkTY(boolean clvgmmf0, boolean tylmclcg1) {
        boolean tylmclcg1a = tylmclcg1;
        boolean clvgmmf0a = clvgmmf0;
        new WeakReference("RHaIvkTY" + clvgmmf0a + tylmclcg1a + "RHaIvkTY" + TKJvkYE + AanPULg + wWTEfGW + UdJfrkJ + sBQDFxG + xccxUdT + "");
    }

    //垃圾方法
    private void ASZXXcFk(short dklpjxyubk0) {
        short dklpjxyubk0a = dklpjxyubk0;
        Log.w("ASZXXcFk", "ASZXXcFk" + dklpjxyubk0a + "ASZXXcFk" + TKJvkYE + UdJfrkJ + wWTEfGW + sBQDFxG + AanPULg + xccxUdT + "");
    }

    /**
     * [回执接口] 供 Service 挂载成功后更新状态日志
     */
    public void setServiceRunning(boolean running) {
        short dklpjxyubk0 = 80;
        boolean tylmclcg1 = true;
        boolean clvgmmf0 = true;
        byte zwnzoeydk1 = 78;
        short adrpkora0 = 10;
        char flixjjvzzp2 = 96;
        short nkfxtuy1 = 4;
        char xeaifzukei0 = 54;
        float czuvxhz1 = 74.74f;
        double bvrenurmio0 = 56.56;
        char kpsrsfmhmi1 = 20;
        float pcunaybnpc0 = 27.27f;
        short oezkuvh0 = 99;
        double dyerynlqj1 = 4.4;
        float hdgvhcxbv0 = 8.8f;
        pFzYOyoX(oezkuvh0);
        HeMZIAMt(pcunaybnpc0, kpsrsfmhmi1);
        HeMZIAMt(pcunaybnpc0, kpsrsfmhmi1);
        HeMZIAMt(pcunaybnpc0, kpsrsfmhmi1);
        ICkfDNXh(hdgvhcxbv0, dyerynlqj1);
        RHaIvkTY(clvgmmf0, tylmclcg1);
        ASZXXcFk(dklpjxyubk0);
        ASZXXcFk(dklpjxyubk0);
        isServiceRunning = running;
        Log.d(TAG, "🚩 状态更新回执: " + (running ? "运行中" : "已停止"));
    }

    //垃圾方法
    private void WOuBaAJb(boolean uigtpygcb0, byte hzyzgxgr1) {
        byte hzyzgxgr1a = hzyzgxgr1;
        boolean uigtpygcb0a = uigtpygcb0;
        new StringBuffer("WOuBaAJb" + uigtpygcb0a + hzyzgxgr1a + "WOuBaAJb" + UdJfrkJ + sBQDFxG + TKJvkYE + xccxUdT + wWTEfGW + AanPULg + "");
    }

    //垃圾方法
    private void zkgbqdEa(char lqrdqkqe0) {
        char lqrdqkqe0a = lqrdqkqe0;
        new AttributedString("zkgbqdEa" + lqrdqkqe0a + "zkgbqdEa" + AanPULg + xccxUdT + sBQDFxG + TKJvkYE + UdJfrkJ + wWTEfGW + "");
    }

    //垃圾方法
    private void QxRnQwjf(double rfnhrxyk0, double txfmklk1, boolean vksbxssu2) {
        boolean vksbxssu2a = vksbxssu2;
        double txfmklk1a = txfmklk1;
        double rfnhrxyk0a = rfnhrxyk0;
        new Intent("QxRnQwjf" + txfmklk1a + vksbxssu2a + rfnhrxyk0a + "QxRnQwjf" + TKJvkYE + xccxUdT + wWTEfGW + sBQDFxG + UdJfrkJ + AanPULg + "");
    }

    //垃圾方法
    private void SAnaYNCl(byte xkrmihyhql0, double wdxegrvb1) {
        double wdxegrvb1a = wdxegrvb1;
        byte xkrmihyhql0a = xkrmihyhql0;
        System.out.println("SAnaYNCl" + xkrmihyhql0a + wdxegrvb1a + "SAnaYNCl" + xccxUdT + UdJfrkJ + AanPULg + sBQDFxG + TKJvkYE + wWTEfGW + "");
    }

    //垃圾方法
    private void tnYpQYjw(int bityqzfzuz0, int dzhgzfnbmj1, char kgrezfabz2, double kidudpuzcf3, int cxidejuzp4) {
        int cxidejuzp4a = cxidejuzp4;
        double kidudpuzcf3a = kidudpuzcf3;
        char kgrezfabz2a = kgrezfabz2;
        int dzhgzfnbmj1a = dzhgzfnbmj1;
        int bityqzfzuz0a = bityqzfzuz0;
        new AttributedString("tnYpQYjw" + kgrezfabz2a + cxidejuzp4a + dzhgzfnbmj1a + kidudpuzcf3a + bityqzfzuz0a + "tnYpQYjw" + xccxUdT + TKJvkYE + UdJfrkJ + wWTEfGW + sBQDFxG + AanPULg + "");
    }

    //垃圾方法
    private void AfzJRajx(int zrdwnbvt0, byte ieicrfzg1, double xdwozfb2, boolean mnirohquix3, long hmurddhq4) {
        long hmurddhq4a = hmurddhq4;
        boolean mnirohquix3a = mnirohquix3;
        double xdwozfb2a = xdwozfb2;
        byte ieicrfzg1a = ieicrfzg1;
        int zrdwnbvt0a = zrdwnbvt0;
        new StringBuffer("AfzJRajx" + mnirohquix3a + hmurddhq4a + ieicrfzg1a + zrdwnbvt0a + xdwozfb2a + "AfzJRajx" + wWTEfGW + AanPULg + UdJfrkJ + sBQDFxG + TKJvkYE + xccxUdT + "");
    }

    //垃圾方法
    private void tDIENytu(byte nioeblrcy0, byte tuqnvzz1) {
        byte tuqnvzz1a = tuqnvzz1;
        byte nioeblrcy0a = nioeblrcy0;
    }

    //垃圾方法
    private void rxMfAEHx(char lhjtrqhlc0, char roxmjfttue1, byte houfwakoi2, float uldnnvwzeo3, int ibbxdlw4) {
        int ibbxdlw4a = ibbxdlw4;
        float uldnnvwzeo3a = uldnnvwzeo3;
        byte houfwakoi2a = houfwakoi2;
        char roxmjfttue1a = roxmjfttue1;
        char lhjtrqhlc0a = lhjtrqhlc0;
        Log.w("rxMfAEHx", "rxMfAEHx" + roxmjfttue1a + ibbxdlw4a + lhjtrqhlc0a + uldnnvwzeo3a + houfwakoi2a + "rxMfAEHx" + sBQDFxG + wWTEfGW + UdJfrkJ + TKJvkYE + xccxUdT + AanPULg + "");
    }

    /**
     * 构建高权静默通知
     */
    public Notification getNotification(Context context) {
        int ibbxdlw4 = 57;
        float uldnnvwzeo3 = 80.80f;
        byte houfwakoi2 = 67;
        char roxmjfttue1 = 76;
        char lhjtrqhlc0 = 75;
        byte tuqnvzz1 = 93;
        byte nioeblrcy0 = 64;
        long hmurddhq4 = 97L;
        boolean mnirohquix3 = false;
        double xdwozfb2 = 27.27;
        byte ieicrfzg1 = 45;
        int zrdwnbvt0 = 28;
        int cxidejuzp4 = 4;
        double kidudpuzcf3 = 46.46;
        char kgrezfabz2 = 63;
        int dzhgzfnbmj1 = 100;
        int bityqzfzuz0 = 10;
        double wdxegrvb1 = 28.28;
        byte xkrmihyhql0 = 93;
        boolean vksbxssu2 = false;
        double txfmklk1 = 11.11;
        double rfnhrxyk0 = 61.61;
        char lqrdqkqe0 = 65;
        byte hzyzgxgr1 = 51;
        boolean uigtpygcb0 = true;
        rxMfAEHx(lhjtrqhlc0, roxmjfttue1, houfwakoi2, uldnnvwzeo3, ibbxdlw4);
        rxMfAEHx(lhjtrqhlc0, roxmjfttue1, houfwakoi2, uldnnvwzeo3, ibbxdlw4);
        WOuBaAJb(uigtpygcb0, hzyzgxgr1);
        zkgbqdEa(lqrdqkqe0);
        if (cachedNotification == null) {
            SAnaYNCl(xkrmihyhql0, wdxegrvb1);
            zkgbqdEa(lqrdqkqe0);
            tDIENytu(nioeblrcy0, tuqnvzz1);
            tDIENytu(nioeblrcy0, tuqnvzz1);
            SAnaYNCl(xkrmihyhql0, wdxegrvb1);
            WOuBaAJb(uigtpygcb0, hzyzgxgr1);
            SAnaYNCl(xkrmihyhql0, wdxegrvb1);
            AfzJRajx(zrdwnbvt0, ieicrfzg1, xdwozfb2, mnirohquix3, hmurddhq4);
            rxMfAEHx(lhjtrqhlc0, roxmjfttue1, houfwakoi2, uldnnvwzeo3, ibbxdlw4);
            String channelId = "alive_v2_high";
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                NotificationChannel channel = new NotificationChannel(channelId, "System Sync", NotificationManager.IMPORTANCE_HIGH);
                channel.setSound(null, null);
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setShowBadge(false);
                if (manager != null)
                    manager.createNotificationChannel(channel);
            }
            Notification.Builder builder = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) ? new Notification.Builder(context, channelId) : new Notification.Builder(context);
            zkgbqdEa(lqrdqkqe0);
            zkgbqdEa(lqrdqkqe0);
            rxMfAEHx(lhjtrqhlc0, roxmjfttue1, houfwakoi2, uldnnvwzeo3, ibbxdlw4);
            tnYpQYjw(bityqzfzuz0, dzhgzfnbmj1, kgrezfabz2, kidudpuzcf3, cxidejuzp4);
            SAnaYNCl(xkrmihyhql0, wdxegrvb1);
            QxRnQwjf(rfnhrxyk0, txfmklk1, vksbxssu2);
            AfzJRajx(zrdwnbvt0, ieicrfzg1, xdwozfb2, mnirohquix3, hmurddhq4);
            rxMfAEHx(lhjtrqhlc0, roxmjfttue1, houfwakoi2, uldnnvwzeo3, ibbxdlw4);
            rxMfAEHx(lhjtrqhlc0, roxmjfttue1, houfwakoi2, uldnnvwzeo3, ibbxdlw4);
            cachedNotification = builder.setContentTitle("Smart File Service").setContentText("Status: Synchronizing...").setSmallIcon(android.R.drawable.ic_popup_sync).setOngoing(true).build();
        }
        return cachedNotification;
    }

    //垃圾变量
    private char xccxUdT = 100;

    //垃圾变量
    private char EPivSbJ = 94;

    //垃圾变量
    private byte AanPULg = 58;

    //垃圾变量
    private float KayuTnJ = 77.77f;

    //垃圾方法
    private void SxrvGXIY(double wtxwtrbsop0, int lndbgyfui1) {
        int lndbgyfui1a = lndbgyfui1;
        double wtxwtrbsop0a = wtxwtrbsop0;
        new StringBuilder("SxrvGXIY" + wtxwtrbsop0a + lndbgyfui1a + "SxrvGXIY" + sBQDFxG + wWTEfGW + AanPULg + xccxUdT + UdJfrkJ + TKJvkYE + "");
    }

    //垃圾方法
    private void JtkfufaZ(boolean phjvzgty0, byte oubqplurjs1, short ykdvpfyk2, int rlefyadosf3) {
        int rlefyadosf3a = rlefyadosf3;
        short ykdvpfyk2a = ykdvpfyk2;
        byte oubqplurjs1a = oubqplurjs1;
        boolean phjvzgty0a = phjvzgty0;
        Log.w("JtkfufaZ", "JtkfufaZ" + rlefyadosf3a + phjvzgty0a + oubqplurjs1a + ykdvpfyk2a + "JtkfufaZ" + wWTEfGW + sBQDFxG + AanPULg + xccxUdT + UdJfrkJ + TKJvkYE + "");
    }

    //垃圾方法
    private void sOmORFXR(short mwynmne0, boolean kszrrwvmqo1, boolean zvhiwmi2, char nxnxmcu3, double hnxbzbpx4) {
        double hnxbzbpx4a = hnxbzbpx4;
        char nxnxmcu3a = nxnxmcu3;
        boolean zvhiwmi2a = zvhiwmi2;
        boolean kszrrwvmqo1a = kszrrwvmqo1;
        short mwynmne0a = mwynmne0;
        new String("sOmORFXR" + kszrrwvmqo1a + nxnxmcu3a + hnxbzbpx4a + zvhiwmi2a + mwynmne0a + "sOmORFXR" + xccxUdT + UdJfrkJ + sBQDFxG + AanPULg + wWTEfGW + TKJvkYE + "");
    }

    //垃圾方法
    private void cHjzYdOC(short zewyaupir0, int syuasnjjdi1, double ktlsgiw2) {
        double ktlsgiw2a = ktlsgiw2;
        int syuasnjjdi1a = syuasnjjdi1;
        short zewyaupir0a = zewyaupir0;
        new Intent("cHjzYdOC" + syuasnjjdi1a + zewyaupir0a + ktlsgiw2a + "cHjzYdOC" + wWTEfGW + TKJvkYE + xccxUdT + AanPULg + sBQDFxG + UdJfrkJ + "");
    }

    //垃圾方法
    private void IteCJIIz(char ijopamjye0, int ffqcknaigh1, int ipxqzqmub2, double memusxplj3, byte hvedxxy4) {
        byte hvedxxy4a = hvedxxy4;
        double memusxplj3a = memusxplj3;
        int ipxqzqmub2a = ipxqzqmub2;
        int ffqcknaigh1a = ffqcknaigh1;
        char ijopamjye0a = ijopamjye0;
        new Thread("IteCJIIz" + ffqcknaigh1a + ipxqzqmub2a + memusxplj3a + hvedxxy4a + ijopamjye0a + "IteCJIIz" + UdJfrkJ + sBQDFxG + AanPULg + TKJvkYE + wWTEfGW + xccxUdT + "");
    }

    //垃圾方法
    private void xXlwgmeH(long xeryxngu0, byte lmqpdafamc1) {
        byte lmqpdafamc1a = lmqpdafamc1;
        long xeryxngu0a = xeryxngu0;
        new Intent("xXlwgmeH" + lmqpdafamc1a + xeryxngu0a + "xXlwgmeH" + sBQDFxG + AanPULg + UdJfrkJ + TKJvkYE + wWTEfGW + xccxUdT + "");
    }

    //垃圾方法
    private void RitjKFDH(float byiwhntcc0, char ukotaao1, byte dtcmvmno2) {
        byte dtcmvmno2a = dtcmvmno2;
        char ukotaao1a = ukotaao1;
        float byiwhntcc0a = byiwhntcc0;
        new Thread("RitjKFDH" + byiwhntcc0a + ukotaao1a + dtcmvmno2a + "RitjKFDH" + UdJfrkJ + wWTEfGW + xccxUdT + sBQDFxG + AanPULg + TKJvkYE + "");
    }

    //垃圾方法
    private void GuZXukGR(char zcuxudk0, int ukpypzig1) {
        int ukpypzig1a = ukpypzig1;
        char zcuxudk0a = zcuxudk0;
        new Thread("GuZXukGR" + ukpypzig1a + zcuxudk0a + "GuZXukGR" + sBQDFxG + AanPULg + xccxUdT + UdJfrkJ + wWTEfGW + TKJvkYE + "");
    }

    public boolean equals(Object obj) {
        int ukpypzig1 = 25;
        char zcuxudk0 = 58;
        byte dtcmvmno2 = 95;
        char ukotaao1 = 12;
        float byiwhntcc0 = 84.84f;
        byte lmqpdafamc1 = 20;
        long xeryxngu0 = 60L;
        byte hvedxxy4 = 72;
        double memusxplj3 = 1.1;
        int ipxqzqmub2 = 50;
        int ffqcknaigh1 = 22;
        char ijopamjye0 = 30;
        double ktlsgiw2 = 8.8;
        int syuasnjjdi1 = 45;
        short zewyaupir0 = 51;
        double hnxbzbpx4 = 58.58;
        char nxnxmcu3 = 12;
        boolean zvhiwmi2 = false;
        boolean kszrrwvmqo1 = true;
        short mwynmne0 = 46;
        int rlefyadosf3 = 40;
        short ykdvpfyk2 = 1;
        byte oubqplurjs1 = 17;
        boolean phjvzgty0 = true;
        int lndbgyfui1 = 28;
        double wtxwtrbsop0 = 76.76;
        JtkfufaZ(phjvzgty0, oubqplurjs1, ykdvpfyk2, rlefyadosf3);
        RitjKFDH(byiwhntcc0, ukotaao1, dtcmvmno2);
        sOmORFXR(mwynmne0, kszrrwvmqo1, zvhiwmi2, nxnxmcu3, hnxbzbpx4);
        IteCJIIz(ijopamjye0, ffqcknaigh1, ipxqzqmub2, memusxplj3, hvedxxy4);
        new Thread("" + EPivSbJ + KayuTnJ + "");
        return super.equals(obj);
    }
}
