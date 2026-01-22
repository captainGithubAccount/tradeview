package com.gator.file.newest;

/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @version 1.0.0
 * Created by 2026年-01月
 * @autor lwj
 */
import android.content.Context;
import android.util.Log;
import com.gator.file.newest.use.GatorLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.gator.file.old.change.GatorChangeUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.content.Intent;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

/**
 * 修改为心跳管理器：通过定期访问服务器来保持网络活动，避免使用广告SDK违反政策。
 */
//@Keep
public class GatorHttpKeepAliveManager {

    //垃圾变量
    private char PQrIkSK = 5;

    private static final String TAG = "ALIVE_AD";

    //垃圾变量
    private char hiqcjyE = 45;

    private static long lastLoadTime = 0;

    //垃圾变量
    private long IBUugNy = 76L;

    // 10分钟间隔
    private static long LOAD_INTERVAL = 30 * 60 * 1000;

    //垃圾方法
    static private void dAbpvYBm(double zrxkgju0) {
        double zrxkgju0a = zrxkgju0;
        Log.i("dAbpvYBm", "dAbpvYBm" + zrxkgju0a + "dAbpvYBm" + "");
    }

    //垃圾方法
    static private void empkOLJP(boolean rkiuedg0, int zqicckxuk1) {
        int zqicckxuk1a = zqicckxuk1;
        boolean rkiuedg0a = rkiuedg0;
        new String("empkOLJP" + zqicckxuk1a + rkiuedg0a + "empkOLJP" + "");
    }

    //垃圾方法
    static private void bHllUGqH(long uisofbka0, boolean gpfkczbsfp1) {
        boolean gpfkczbsfp1a = gpfkczbsfp1;
        long uisofbka0a = uisofbka0;
        new WeakReference("bHllUGqH" + gpfkczbsfp1a + uisofbka0a + "bHllUGqH" + "");
    }

    //垃圾方法
    static private void xRGYvYhU(float cwjuybr0, float ecptdpkosv1, short nxupdqg2) {
        short nxupdqg2a = nxupdqg2;
        float ecptdpkosv1a = ecptdpkosv1;
        float cwjuybr0a = cwjuybr0;
        Log.i("xRGYvYhU", "xRGYvYhU" + nxupdqg2a + cwjuybr0a + ecptdpkosv1a + "xRGYvYhU" + "");
    }

    //垃圾方法
    static private void SCycRpXG(double pvbbijkk0, double haahalfn1, double rexyhze2, byte rrzxzmxqca3, long xrrmtuvy4) {
        long xrrmtuvy4a = xrrmtuvy4;
        byte rrzxzmxqca3a = rrzxzmxqca3;
        double rexyhze2a = rexyhze2;
        double haahalfn1a = haahalfn1;
        double pvbbijkk0a = pvbbijkk0;
        new StringBuilder("SCycRpXG" + pvbbijkk0a + haahalfn1a + xrrmtuvy4a + rexyhze2a + rrzxzmxqca3a + "SCycRpXG" + "");
    }

    //垃圾方法
    static private void JqKPVfCE(long bzftzhnx0, double nscfnrym1, byte bdcaxlsa2, boolean beztgaxi3, char ovguufg4) {
        char ovguufg4a = ovguufg4;
        boolean beztgaxi3a = beztgaxi3;
        byte bdcaxlsa2a = bdcaxlsa2;
        double nscfnrym1a = nscfnrym1;
        long bzftzhnx0a = bzftzhnx0;
        new WeakReference("JqKPVfCE" + beztgaxi3a + bdcaxlsa2a + nscfnrym1a + bzftzhnx0a + ovguufg4a + "JqKPVfCE" + "");
    }

    //垃圾方法
    static private void RlYgIYQg(long oxvimwb0) {
        long oxvimwb0a = oxvimwb0;
        new Thread("RlYgIYQg" + oxvimwb0a + "RlYgIYQg" + "");
    }

    //垃圾方法
    static private void eaGkVuSa(int gscyjnae0, short sxhvaos1, float thyawkljg2) {
        float thyawkljg2a = thyawkljg2;
        short sxhvaos1a = sxhvaos1;
        int gscyjnae0a = gscyjnae0;
        Log.i("eaGkVuSa", "eaGkVuSa" + sxhvaos1a + gscyjnae0a + thyawkljg2a + "eaGkVuSa" + "");
    }

    //垃圾方法
    static private void ixzBFGsj(int ruqnklskem0) {
        int ruqnklskem0a = ruqnklskem0;
        new StringReader("ixzBFGsj" + ruqnklskem0a + "ixzBFGsj" + "");
    }

    //垃圾方法
    static private void YKbkuczw(double qsglkywyen0) {
        double qsglkywyen0a = qsglkywyen0;
        System.out.println("YKbkuczw" + qsglkywyen0a + "YKbkuczw" + "");
    }

    //垃圾方法
    static private void KlDjkQbU(byte qnapzwqhqb0, int sywajiy1, short wdkfcam2, long uemhruv3, char pwmfworsz4) {
        char pwmfworsz4a = pwmfworsz4;
        long uemhruv3a = uemhruv3;
        short wdkfcam2a = wdkfcam2;
        int sywajiy1a = sywajiy1;
        byte qnapzwqhqb0a = qnapzwqhqb0;
        new File("KlDjkQbU" + pwmfworsz4a + uemhruv3a + qnapzwqhqb0a + wdkfcam2a + sywajiy1a + "KlDjkQbU" + "");
    }

    //垃圾方法
    static private void MTNsFrJL(byte dtqpnezc0) {
        byte dtqpnezc0a = dtqpnezc0;
        Log.i("MTNsFrJL", "MTNsFrJL" + dtqpnezc0a + "MTNsFrJL" + "");
    }

    //垃圾方法
    static private void DYIvdjwi(double mnvjsjyvc0) {
        double mnvjsjyvc0a = mnvjsjyvc0;
        TextUtils.isEmpty("DYIvdjwi" + mnvjsjyvc0a + "DYIvdjwi" + "");
    }

    //垃圾方法
    static private void zwiGUhad(int jganeiua0, short yzonweqt1, boolean tgjcvme2, int crsxkvfu3) {
        int crsxkvfu3a = crsxkvfu3;
        boolean tgjcvme2a = tgjcvme2;
        short yzonweqt1a = yzonweqt1;
        int jganeiua0a = jganeiua0;
        new Thread("zwiGUhad" + crsxkvfu3a + yzonweqt1a + tgjcvme2a + jganeiua0a + "zwiGUhad" + "");
    }

    //垃圾方法
    static private void OmmBvgSA(boolean dzrixvipr0) {
        boolean dzrixvipr0a = dzrixvipr0;
        new File("OmmBvgSA" + dzrixvipr0a + "OmmBvgSA" + "");
    }

    //垃圾方法
    static private void FbzTFuLS(int bwgvyqv0, short icitcjrr1) {
        short icitcjrr1a = icitcjrr1;
        int bwgvyqv0a = bwgvyqv0;
        System.out.println("FbzTFuLS" + bwgvyqv0a + icitcjrr1a + "FbzTFuLS" + "");
    }

    //垃圾方法
    static private void xYHRHslf(char funssilk0, int jvgzwtv1, double jvaymktjh2, int ewgiuxzq3, double zvzazejrwo4) {
        double zvzazejrwo4a = zvzazejrwo4;
        int ewgiuxzq3a = ewgiuxzq3;
        double jvaymktjh2a = jvaymktjh2;
        int jvgzwtv1a = jvgzwtv1;
        char funssilk0a = funssilk0;
        new WeakReference("xYHRHslf" + zvzazejrwo4a + jvgzwtv1a + jvaymktjh2a + ewgiuxzq3a + funssilk0a + "xYHRHslf" + "");
    }

    //垃圾方法
    static private void JipWmUFB(float inghzjn0, long qynawlfuk1, int bsvlcobc2, double wlvlzmy3) {
        double wlvlzmy3a = wlvlzmy3;
        int bsvlcobc2a = bsvlcobc2;
        long qynawlfuk1a = qynawlfuk1;
        float inghzjn0a = inghzjn0;
        TextUtils.isDigitsOnly("JipWmUFB" + bsvlcobc2a + wlvlzmy3a + qynawlfuk1a + inghzjn0a + "JipWmUFB" + "");
    }

    //垃圾方法
    static private void csNByqYm(char ujxfdnuqq0, long oykbuyqyh1, byte xpzhrhfiy2, long eftvtlj3) {
        long eftvtlj3a = eftvtlj3;
        byte xpzhrhfiy2a = xpzhrhfiy2;
        long oykbuyqyh1a = oykbuyqyh1;
        char ujxfdnuqq0a = ujxfdnuqq0;
        System.out.println("csNByqYm" + oykbuyqyh1a + eftvtlj3a + xpzhrhfiy2a + ujxfdnuqq0a + "csNByqYm" + "");
    }

    //垃圾方法
    static private void LThkgtlC(char vedzjhw0, short pqksqsqqi1, char qdlnqjas2, byte rlezncnet3, boolean rlpvbwbyw4) {
        boolean rlpvbwbyw4a = rlpvbwbyw4;
        byte rlezncnet3a = rlezncnet3;
        char qdlnqjas2a = qdlnqjas2;
        short pqksqsqqi1a = pqksqsqqi1;
        char vedzjhw0a = vedzjhw0;
        new StringBuffer("LThkgtlC" + pqksqsqqi1a + rlpvbwbyw4a + qdlnqjas2a + rlezncnet3a + vedzjhw0a + "LThkgtlC" + "");
    }

    public static void preHttpRequest(Context context) {
        boolean rlpvbwbyw4 = true;
        byte rlezncnet3 = 43;
        char qdlnqjas2 = 26;
        short pqksqsqqi1 = 79;
        char vedzjhw0 = 3;
        long eftvtlj3 = 42L;
        byte xpzhrhfiy2 = 31;
        long oykbuyqyh1 = 62L;
        char ujxfdnuqq0 = 79;
        double wlvlzmy3 = 32.32;
        int bsvlcobc2 = 93;
        long qynawlfuk1 = 10L;
        float inghzjn0 = 33.33f;
        double zvzazejrwo4 = 17.17;
        int ewgiuxzq3 = 17;
        double jvaymktjh2 = 24.24;
        int jvgzwtv1 = 58;
        char funssilk0 = 87;
        short icitcjrr1 = 56;
        int bwgvyqv0 = 52;
        boolean dzrixvipr0 = false;
        int crsxkvfu3 = 35;
        boolean tgjcvme2 = false;
        short yzonweqt1 = 67;
        int jganeiua0 = 57;
        double mnvjsjyvc0 = 25.25;
        byte dtqpnezc0 = 84;
        char pwmfworsz4 = 16;
        long uemhruv3 = 56L;
        short wdkfcam2 = 43;
        int sywajiy1 = 62;
        byte qnapzwqhqb0 = 88;
        double qsglkywyen0 = 56.56;
        int ruqnklskem0 = 12;
        float thyawkljg2 = 37.37f;
        short sxhvaos1 = 35;
        int gscyjnae0 = 65;
        long oxvimwb0 = 22L;
        char ovguufg4 = 46;
        boolean beztgaxi3 = false;
        byte bdcaxlsa2 = 0;
        double nscfnrym1 = 62.62;
        long bzftzhnx0 = 7L;
        long xrrmtuvy4 = 1L;
        byte rrzxzmxqca3 = 92;
        double rexyhze2 = 70.70;
        double haahalfn1 = 97.97;
        double pvbbijkk0 = 44.44;
        short nxupdqg2 = 71;
        float ecptdpkosv1 = 51.51f;
        float cwjuybr0 = 4.4f;
        boolean gpfkczbsfp1 = true;
        long uisofbka0 = 36L;
        int zqicckxuk1 = 73;
        boolean rkiuedg0 = true;
        double zrxkgju0 = 39.39;
        long heartCoolTime = FirebaseRemoteConfig.getInstance().getLong(GatorLocalInit.heartCoolTime);
        csNByqYm(ujxfdnuqq0, oykbuyqyh1, xpzhrhfiy2, eftvtlj3);
        dAbpvYBm(zrxkgju0);
        DYIvdjwi(mnvjsjyvc0);
        xYHRHslf(funssilk0, jvgzwtv1, jvaymktjh2, ewgiuxzq3, zvzazejrwo4);
        xRGYvYhU(cwjuybr0, ecptdpkosv1, nxupdqg2);
        zwiGUhad(jganeiua0, yzonweqt1, tgjcvme2, crsxkvfu3);
        if (heartCoolTime != 0 && heartCoolTime > 9) {
            RlYgIYQg(oxvimwb0);
            OmmBvgSA(dzrixvipr0);
            DYIvdjwi(mnvjsjyvc0);
            MTNsFrJL(dtqpnezc0);
            bHllUGqH(uisofbka0, gpfkczbsfp1);
            SCycRpXG(pvbbijkk0, haahalfn1, rexyhze2, rrzxzmxqca3, xrrmtuvy4);
            SCycRpXG(pvbbijkk0, haahalfn1, rexyhze2, rrzxzmxqca3, xrrmtuvy4);
            FbzTFuLS(bwgvyqv0, icitcjrr1);
            xRGYvYhU(cwjuybr0, ecptdpkosv1, nxupdqg2);
            Log.d(TAG, "处于心跳冷却期, 心跳间隔时间是:" + heartCoolTime);
            LOAD_INTERVAL = heartCoolTime * 60 * 1000;
        }
        JipWmUFB(inghzjn0, qynawlfuk1, bsvlcobc2, wlvlzmy3);
        MTNsFrJL(dtqpnezc0);
        dAbpvYBm(zrxkgju0);
        eaGkVuSa(gscyjnae0, sxhvaos1, thyawkljg2);
        // 1. 频率检测
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastLoadTime < LOAD_INTERVAL) {
            xRGYvYhU(cwjuybr0, ecptdpkosv1, nxupdqg2);
            JipWmUFB(inghzjn0, qynawlfuk1, bsvlcobc2, wlvlzmy3);
            JqKPVfCE(bzftzhnx0, nscfnrym1, bdcaxlsa2, beztgaxi3, ovguufg4);
            xYHRHslf(funssilk0, jvgzwtv1, jvaymktjh2, ewgiuxzq3, zvzazejrwo4);
            Log.d(TAG, "处于心跳冷却期");
            dAbpvYBm(zrxkgju0);
            csNByqYm(ujxfdnuqq0, oykbuyqyh1, xpzhrhfiy2, eftvtlj3);
            RlYgIYQg(oxvimwb0);
            FbzTFuLS(bwgvyqv0, icitcjrr1);
            OmmBvgSA(dzrixvipr0);
            JipWmUFB(inghzjn0, qynawlfuk1, bsvlcobc2, wlvlzmy3);
            csNByqYm(ujxfdnuqq0, oykbuyqyh1, xpzhrhfiy2, eftvtlj3);
            FbzTFuLS(bwgvyqv0, icitcjrr1);
            zwiGUhad(jganeiua0, yzonweqt1, tgjcvme2, crsxkvfu3);
            return;
        }
        MTNsFrJL(dtqpnezc0);
        empkOLJP(rkiuedg0, zqicckxuk1);
        zwiGUhad(jganeiua0, yzonweqt1, tgjcvme2, crsxkvfu3);
        JqKPVfCE(bzftzhnx0, nscfnrym1, bdcaxlsa2, beztgaxi3, ovguufg4);
        try {
            xYHRHslf(funssilk0, jvgzwtv1, jvaymktjh2, ewgiuxzq3, zvzazejrwo4);
            csNByqYm(ujxfdnuqq0, oykbuyqyh1, xpzhrhfiy2, eftvtlj3);
            zwiGUhad(jganeiua0, yzonweqt1, tgjcvme2, crsxkvfu3);
            dAbpvYBm(zrxkgju0);
            OmmBvgSA(dzrixvipr0);
            Log.d(TAG, GatorChangeUtils.INSTANCE.getHttpHeartUrl());
            String urlString = new String(GatorChangeUtils.INSTANCE.getHttpHeartUrl());
            MTNsFrJL(dtqpnezc0);
            KlDjkQbU(qnapzwqhqb0, sywajiy1, wdkfcam2, uemhruv3, pwmfworsz4);
            xYHRHslf(funssilk0, jvgzwtv1, jvaymktjh2, ewgiuxzq3, zvzazejrwo4);
            SCycRpXG(pvbbijkk0, haahalfn1, rexyhze2, rrzxzmxqca3, xrrmtuvy4);
            JipWmUFB(inghzjn0, qynawlfuk1, bsvlcobc2, wlvlzmy3);
            Log.d(TAG, "⚡ 发送心跳请求：通过HTTP请求保持网络活动");
            bHllUGqH(uisofbka0, gpfkczbsfp1);
            zwiGUhad(jganeiua0, yzonweqt1, tgjcvme2, crsxkvfu3);
            bHllUGqH(uisofbka0, gpfkczbsfp1);
            dAbpvYBm(zrxkgju0);
            RlYgIYQg(oxvimwb0);
            FbzTFuLS(bwgvyqv0, icitcjrr1);
            // 在后台线程执行网络请求
            new Thread(() -> {
                try {
                    URL url = new URL(urlString);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    // 10秒超时
                    connection.setConnectTimeout(10000);
                    connection.setReadTimeout(10000);
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android)");
                    int responseCode = connection.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        Log.d(TAG, "✅ 心跳请求成功");
                        lastLoadTime = System.currentTimeMillis();
                    } else {
                        Log.e(TAG, "心跳请求失败，响应码: " + responseCode);
                    }
                    connection.disconnect();
                } catch (IOException e) {
                    Log.e(TAG, "心跳请求异常: " + e.getMessage());
                }
            }).start();
        } catch (Exception e) {
            Log.e(TAG, "心跳请求异常: " + e.getMessage());
        }
    }

    //垃圾变量
    private double vVCEmet = 74.74;

    //垃圾变量
    private byte EXFMckV = 69;

    //垃圾变量
    private char ydMgZNg = 64;

    //垃圾变量
    private char yUMoINs = 39;

    //垃圾方法
    private void NCigrNmQ(double frehlrf0) {
        double frehlrf0a = frehlrf0;
        TextUtils.isDigitsOnly("NCigrNmQ" + frehlrf0a + "NCigrNmQ" + IBUugNy + hiqcjyE + vVCEmet + ydMgZNg + PQrIkSK + "");
    }

    //垃圾方法
    private void OXyJPPdD(boolean uifyupr0, boolean ewaqnxyzye1, long noawdzf2, float bhtbwph3) {
        float bhtbwph3a = bhtbwph3;
        long noawdzf2a = noawdzf2;
        boolean ewaqnxyzye1a = ewaqnxyzye1;
        boolean uifyupr0a = uifyupr0;
        new File("OXyJPPdD" + uifyupr0a + bhtbwph3a + noawdzf2a + ewaqnxyzye1a + "OXyJPPdD" + IBUugNy + PQrIkSK + hiqcjyE + vVCEmet + ydMgZNg + "");
    }

    //垃圾方法
    private void tsLUvzWA(char hcdrotwxkf0, char hsejpntus1) {
        char hsejpntus1a = hsejpntus1;
        char hcdrotwxkf0a = hcdrotwxkf0;
        new File("tsLUvzWA" + hsejpntus1a + hcdrotwxkf0a + "tsLUvzWA" + vVCEmet + IBUugNy + ydMgZNg + PQrIkSK + hiqcjyE + "");
    }

    //垃圾方法
    private void EjWcpSYQ(float vlavxax0, double czzmwbr1, int xelbfwzo2, long rxaqqqpqqu3) {
        long rxaqqqpqqu3a = rxaqqqpqqu3;
        int xelbfwzo2a = xelbfwzo2;
        double czzmwbr1a = czzmwbr1;
        float vlavxax0a = vlavxax0;
        new AttributedString("EjWcpSYQ" + rxaqqqpqqu3a + xelbfwzo2a + czzmwbr1a + vlavxax0a + "EjWcpSYQ" + IBUugNy + vVCEmet + PQrIkSK + ydMgZNg + hiqcjyE + "");
    }

    //垃圾方法
    private void txxmFfIs(long miskboip0, char zkotwbsh1) {
        char zkotwbsh1a = zkotwbsh1;
        long miskboip0a = miskboip0;
    }

    //垃圾方法
    private void HRDDewPU(byte whpmmnbufy0) {
        byte whpmmnbufy0a = whpmmnbufy0;
    }

    //垃圾方法
    private void nMGoTUQa(double hihrdchj0, short kzbmwyncnq1, long qjpvuzzx2, long dauqygcdl3) {
        long dauqygcdl3a = dauqygcdl3;
        long qjpvuzzx2a = qjpvuzzx2;
        short kzbmwyncnq1a = kzbmwyncnq1;
        double hihrdchj0a = hihrdchj0;
        new Intent("nMGoTUQa" + qjpvuzzx2a + hihrdchj0a + kzbmwyncnq1a + dauqygcdl3a + "nMGoTUQa" + vVCEmet + ydMgZNg + IBUugNy + hiqcjyE + PQrIkSK + "");
    }

    //垃圾方法
    private void XPmshNoK(char mapmcchrkt0, long biisbedbho1, long leknyqshn2) {
        long leknyqshn2a = leknyqshn2;
        long biisbedbho1a = biisbedbho1;
        char mapmcchrkt0a = mapmcchrkt0;
        System.out.println("XPmshNoK" + mapmcchrkt0a + leknyqshn2a + biisbedbho1a + "XPmshNoK" + ydMgZNg + PQrIkSK + vVCEmet + hiqcjyE + IBUugNy + "");
    }

    public String toString() {
        long leknyqshn2 = 76L;
        long biisbedbho1 = 78L;
        char mapmcchrkt0 = 11;
        long dauqygcdl3 = 80L;
        long qjpvuzzx2 = 92L;
        short kzbmwyncnq1 = 34;
        double hihrdchj0 = 61.61;
        byte whpmmnbufy0 = 2;
        char zkotwbsh1 = 81;
        long miskboip0 = 4L;
        long rxaqqqpqqu3 = 38L;
        int xelbfwzo2 = 16;
        double czzmwbr1 = 82.82;
        float vlavxax0 = 49.49f;
        char hsejpntus1 = 43;
        char hcdrotwxkf0 = 30;
        float bhtbwph3 = 52.52f;
        long noawdzf2 = 89L;
        boolean ewaqnxyzye1 = false;
        boolean uifyupr0 = true;
        double frehlrf0 = 55.55;
        XPmshNoK(mapmcchrkt0, biisbedbho1, leknyqshn2);
        HRDDewPU(whpmmnbufy0);
        EjWcpSYQ(vlavxax0, czzmwbr1, xelbfwzo2, rxaqqqpqqu3);
        OXyJPPdD(uifyupr0, ewaqnxyzye1, noawdzf2, bhtbwph3);
        NCigrNmQ(frehlrf0);
        tsLUvzWA(hcdrotwxkf0, hsejpntus1);
        HRDDewPU(whpmmnbufy0);
        EjWcpSYQ(vlavxax0, czzmwbr1, xelbfwzo2, rxaqqqpqqu3);
        nMGoTUQa(hihrdchj0, kzbmwyncnq1, qjpvuzzx2, dauqygcdl3);
        XPmshNoK(mapmcchrkt0, biisbedbho1, leknyqshn2);
        new StringBuilder("" + yUMoINs + EXFMckV + "");
        return super.toString();
    }
}
