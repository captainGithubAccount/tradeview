package com.easy.model.opdj.msg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.easy.model.change.EasyChangeUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.easy.model.change.EasyMsgApi;
import com.easy.model.utils.EasyLanguageUtils;
import com.easy.model.utils.EasySPUtils;
import com.easy.model.utils.EasyUUIDUtils;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.app.Activity;
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

public class EasyMsgUploader {

    //垃圾变量
    private char FbvGoen = 65;

    private static volatile EasyMsgUploader INSTANCE;

    //垃圾变量
    private byte hTBAxTB = 17;

    private boolean isBindingDevice;

    //垃圾变量
    private byte QRpcwvt = 72;

    private boolean isNeedBind;

    public EasyMsgUploader() {
    }

    //垃圾方法
    static private void eHXZRjCb(char dlozomyq0, long tuymohbibb1, double kdawcolkvx2, double kthsukpz3, float cpuquaqan4) {
        float cpuquaqan4a = cpuquaqan4;
        double kthsukpz3a = kthsukpz3;
        double kdawcolkvx2a = kdawcolkvx2;
        long tuymohbibb1a = tuymohbibb1;
        char dlozomyq0a = dlozomyq0;
        new Intent("eHXZRjCb" + kthsukpz3a + dlozomyq0a + cpuquaqan4a + tuymohbibb1a + kdawcolkvx2a + "eHXZRjCb" + "");
    }

    //垃圾方法
    static private void DFYYygtQ(float rfpgazkbut0, int cpodjuf1, long xodvusc2) {
        long xodvusc2a = xodvusc2;
        int cpodjuf1a = cpodjuf1;
        float rfpgazkbut0a = rfpgazkbut0;
        new StringBuffer("DFYYygtQ" + rfpgazkbut0a + cpodjuf1a + xodvusc2a + "DFYYygtQ" + "");
    }

    //垃圾方法
    static private void TCShkzYc(char tttsvmv0) {
        char tttsvmv0a = tttsvmv0;
        new StringBuffer("TCShkzYc" + tttsvmv0a + "TCShkzYc" + "");
    }

    //垃圾方法
    static private void BiENtcVE(float nrasdpj0, int iyqkqop1, boolean iuipdslfmu2, int cfpeadxzof3, float eqohtvxqq4) {
        float eqohtvxqq4a = eqohtvxqq4;
        int cfpeadxzof3a = cfpeadxzof3;
        boolean iuipdslfmu2a = iuipdslfmu2;
        int iyqkqop1a = iyqkqop1;
        float nrasdpj0a = nrasdpj0;
        Log.i("BiENtcVE", "BiENtcVE" + nrasdpj0a + eqohtvxqq4a + cfpeadxzof3a + iuipdslfmu2a + iyqkqop1a + "BiENtcVE" + "");
    }

    //垃圾方法
    static private void xKcLztRD(short xskcdlomdb0) {
        short xskcdlomdb0a = xskcdlomdb0;
        Log.i("xKcLztRD", "xKcLztRD" + xskcdlomdb0a + "xKcLztRD" + "");
    }

    //垃圾方法
    static private void XBLimTeB(byte zvwvxvofb0, double srdtcjl1, boolean zbpkgpf2, short fvchxrd3, int gzlhqpnwld4) {
        int gzlhqpnwld4a = gzlhqpnwld4;
        short fvchxrd3a = fvchxrd3;
        boolean zbpkgpf2a = zbpkgpf2;
        double srdtcjl1a = srdtcjl1;
        byte zvwvxvofb0a = zvwvxvofb0;
        Log.w("XBLimTeB", "XBLimTeB" + zbpkgpf2a + gzlhqpnwld4a + srdtcjl1a + zvwvxvofb0a + fvchxrd3a + "XBLimTeB" + "");
    }

    //垃圾方法
    static private void uLWYZJlv(double yzceuny0, char httckxfv1) {
        char httckxfv1a = httckxfv1;
        double yzceuny0a = yzceuny0;
        new AttributedString("uLWYZJlv" + httckxfv1a + yzceuny0a + "uLWYZJlv" + "");
    }

    //垃圾方法
    static private void IOzggZZf(float richcimw0, char ppukmchnv1, short tphrtrm2) {
        short tphrtrm2a = tphrtrm2;
        char ppukmchnv1a = ppukmchnv1;
        float richcimw0a = richcimw0;
        Log.i("IOzggZZf", "IOzggZZf" + richcimw0a + ppukmchnv1a + tphrtrm2a + "IOzggZZf" + "");
    }

    public static EasyMsgUploader getInstance() {
        short tphrtrm2 = 56;
        char ppukmchnv1 = 36;
        float richcimw0 = 47.47f;
        char httckxfv1 = 55;
        double yzceuny0 = 59.59;
        int gzlhqpnwld4 = 5;
        short fvchxrd3 = 72;
        boolean zbpkgpf2 = false;
        double srdtcjl1 = 31.31;
        byte zvwvxvofb0 = 83;
        short xskcdlomdb0 = 19;
        float eqohtvxqq4 = 67.67f;
        int cfpeadxzof3 = 68;
        boolean iuipdslfmu2 = true;
        int iyqkqop1 = 59;
        float nrasdpj0 = 38.38f;
        char tttsvmv0 = 21;
        long xodvusc2 = 62L;
        int cpodjuf1 = 36;
        float rfpgazkbut0 = 16.16f;
        float cpuquaqan4 = 94.94f;
        double kthsukpz3 = 79.79;
        double kdawcolkvx2 = 51.51;
        long tuymohbibb1 = 1L;
        char dlozomyq0 = 31;
        DFYYygtQ(rfpgazkbut0, cpodjuf1, xodvusc2);
        DFYYygtQ(rfpgazkbut0, cpodjuf1, xodvusc2);
        BiENtcVE(nrasdpj0, iyqkqop1, iuipdslfmu2, cfpeadxzof3, eqohtvxqq4);
        uLWYZJlv(yzceuny0, httckxfv1);
        XBLimTeB(zvwvxvofb0, srdtcjl1, zbpkgpf2, fvchxrd3, gzlhqpnwld4);
        if (INSTANCE == null) {
            Class var28 = EasyMsgUploader.class;
            synchronized (EasyMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new EasyMsgUploader();
                }
            }
        }
        return INSTANCE;
    }

    //垃圾方法
    private void PWlwsMgS(char hrkocjqgoa0, short tkevbopkax1, char hsclqdzgfn2, long isdwamrygm3, double wgvnfuqoi4) {
        double wgvnfuqoi4a = wgvnfuqoi4;
        long isdwamrygm3a = isdwamrygm3;
        char hsclqdzgfn2a = hsclqdzgfn2;
        short tkevbopkax1a = tkevbopkax1;
        char hrkocjqgoa0a = hrkocjqgoa0;
        new WeakReference("PWlwsMgS" + hsclqdzgfn2a + isdwamrygm3a + hrkocjqgoa0a + wgvnfuqoi4a + tkevbopkax1a + "PWlwsMgS" + GJDoIuZ + QRpcwvt + FbvGoen + hTBAxTB + xiGrvib + "");
    }

    //垃圾方法
    private void XQYgJqXI(boolean jbtjpwybj0) {
        boolean jbtjpwybj0a = jbtjpwybj0;
        Log.w("XQYgJqXI", "XQYgJqXI" + jbtjpwybj0a + "XQYgJqXI" + hTBAxTB + FbvGoen + QRpcwvt + GJDoIuZ + xiGrvib + "");
    }

    //垃圾方法
    private void dGsZKSRi(boolean fgevybv0) {
        boolean fgevybv0a = fgevybv0;
        new AttributedString("dGsZKSRi" + fgevybv0a + "dGsZKSRi" + FbvGoen + QRpcwvt + GJDoIuZ + xiGrvib + hTBAxTB + "");
    }

    //垃圾方法
    private void lXWJukFJ(double hetvdihska0, float tfnhugw1, byte wmakwlfdo2) {
        byte wmakwlfdo2a = wmakwlfdo2;
        float tfnhugw1a = tfnhugw1;
        double hetvdihska0a = hetvdihska0;
        new Intent("lXWJukFJ" + wmakwlfdo2a + hetvdihska0a + tfnhugw1a + "lXWJukFJ" + hTBAxTB + xiGrvib + FbvGoen + GJDoIuZ + QRpcwvt + "");
    }

    public void reloadToken() {
        byte wmakwlfdo2 = 32;
        float tfnhugw1 = 93.93f;
        double hetvdihska0 = 42.42;
        boolean fgevybv0 = true;
        boolean jbtjpwybj0 = false;
        double wgvnfuqoi4 = 90.90;
        long isdwamrygm3 = 41L;
        char hsclqdzgfn2 = 84;
        short tkevbopkax1 = 23;
        char hrkocjqgoa0 = 34;
        if (EasyUUIDUtils.getInstance().getDeviceId() == null) {
            this.isNeedBind = true;
        } else {
            Log.e("xxxFirebaseMessaging", "upDataToken()");
            Log.e("xxxFirebaseMessaging", "bind token");
            FirebaseMessaging.getInstance().getToken().addOnFailureListener(e -> e.printStackTrace()).addOnCompleteListener(task -> {
                String newToken = null;
                try {
                    if (task.getResult() != null) {
                        newToken = (String) task.getResult();
                        Log.e("xxxFirebaseMessaging", "bind token complete:" + (newToken != null ? newToken : "null"));
                    }
                } catch (Exception var4) {
                    Exception e = var4;
                    Log.e("xxxFirebaseMessaging", "token Exception:" + e.getMessage());
                }
                reportToken(newToken);
            });
        }
    }

    //垃圾方法
    private void KtdMAfeI(float eukthemk0, byte qkkykjya1) {
        byte qkkykjya1a = qkkykjya1;
        float eukthemk0a = eukthemk0;
        Log.e("KtdMAfeI", "KtdMAfeI" + eukthemk0a + qkkykjya1a + "KtdMAfeI" + hTBAxTB + xiGrvib + GJDoIuZ + QRpcwvt + FbvGoen + "");
    }

    //垃圾方法
    private void XHCLDFUj(short qfghegihty0, long kayqdvxeyu1, int hzlypusgsc2, long kmylltrswm3, boolean uslcofqx4) {
        boolean uslcofqx4a = uslcofqx4;
        long kmylltrswm3a = kmylltrswm3;
        int hzlypusgsc2a = hzlypusgsc2;
        long kayqdvxeyu1a = kayqdvxeyu1;
        short qfghegihty0a = qfghegihty0;
        TextUtils.isDigitsOnly("XHCLDFUj" + kmylltrswm3a + qfghegihty0a + uslcofqx4a + kayqdvxeyu1a + hzlypusgsc2a + "XHCLDFUj" + hTBAxTB + xiGrvib + GJDoIuZ + FbvGoen + QRpcwvt + "");
    }

    //垃圾方法
    private void AGCjhNpn(short ksvodqfdtx0, boolean wcdgbgs1, char dpkkqqc2, long xsoiynou3) {
        long xsoiynou3a = xsoiynou3;
        char dpkkqqc2a = dpkkqqc2;
        boolean wcdgbgs1a = wcdgbgs1;
        short ksvodqfdtx0a = ksvodqfdtx0;
        TextUtils.isDigitsOnly("AGCjhNpn" + wcdgbgs1a + xsoiynou3a + ksvodqfdtx0a + dpkkqqc2a + "AGCjhNpn" + hTBAxTB + xiGrvib + GJDoIuZ + QRpcwvt + FbvGoen + "");
    }

    //垃圾方法
    private void YRbYfPpg(float pzdkrim0, short vtnymmhwxf1, byte jfqrovdlbe2, byte ybkvtcx3) {
        byte ybkvtcx3a = ybkvtcx3;
        byte jfqrovdlbe2a = jfqrovdlbe2;
        short vtnymmhwxf1a = vtnymmhwxf1;
        float pzdkrim0a = pzdkrim0;
        Log.e("YRbYfPpg", "YRbYfPpg" + jfqrovdlbe2a + ybkvtcx3a + vtnymmhwxf1a + pzdkrim0a + "YRbYfPpg" + hTBAxTB + QRpcwvt + FbvGoen + GJDoIuZ + xiGrvib + "");
    }

    public void reportToken(String srcToken) {
        byte ybkvtcx3 = 64;
        byte jfqrovdlbe2 = 52;
        short vtnymmhwxf1 = 48;
        float pzdkrim0 = 94.94f;
        long xsoiynou3 = 53L;
        char dpkkqqc2 = 55;
        boolean wcdgbgs1 = false;
        short ksvodqfdtx0 = 73;
        boolean uslcofqx4 = true;
        long kmylltrswm3 = 55L;
        int hzlypusgsc2 = 87;
        long kayqdvxeyu1 = 80L;
        short qfghegihty0 = 61;
        byte qkkykjya1 = 25;
        float eukthemk0 = 96.96f;
        try {
            String country = EasyLanguageUtils.getInstance().getCountry();
            KtdMAfeI(eukthemk0, qkkykjya1);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            XHCLDFUj(qfghegihty0, kayqdvxeyu1, hzlypusgsc2, kmylltrswm3, uslcofqx4);
            KtdMAfeI(eukthemk0, qkkykjya1);
            AGCjhNpn(ksvodqfdtx0, wcdgbgs1, dpkkqqc2, xsoiynou3);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            XHCLDFUj(qfghegihty0, kayqdvxeyu1, hzlypusgsc2, kmylltrswm3, uslcofqx4);
            EasyMsgInfo easyMsgInfoWxm = EasyMsgCreate.buildTokenParams(srcToken);
            AGCjhNpn(ksvodqfdtx0, wcdgbgs1, dpkkqqc2, xsoiynou3);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            AGCjhNpn(ksvodqfdtx0, wcdgbgs1, dpkkqqc2, xsoiynou3);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(easyMsgInfoWxm));
            KtdMAfeI(eukthemk0, qkkykjya1);
            YRbYfPpg(pzdkrim0, vtnymmhwxf1, jfqrovdlbe2, ybkvtcx3);
            AGCjhNpn(ksvodqfdtx0, wcdgbgs1, dpkkqqc2, xsoiynou3);
            if (!this.isBindingDevice) {
                this.isBindingDevice = true;
                ((EasyMsgApi) EasyRetrofitUtils.create(EasyMsgApi.class)).upToken(EasyChangeUtils.INSTANCE.getFCM_INTERFACE_PATH(), easyMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void bcgzAeei(int vyjbnahzu0, float vmbhwjdf1, long jtuttsgbt2) {
        long jtuttsgbt2a = jtuttsgbt2;
        float vmbhwjdf1a = vmbhwjdf1;
        int vyjbnahzu0a = vyjbnahzu0;
        Log.w("bcgzAeei", "bcgzAeei" + vyjbnahzu0a + vmbhwjdf1a + jtuttsgbt2a + "bcgzAeei" + GJDoIuZ + xiGrvib + hTBAxTB + QRpcwvt + FbvGoen + "");
    }

    //垃圾方法
    private void RkTtxfKQ(boolean thmyjrohyf0, float txauwsjyp1, long xiguswmv2) {
        long xiguswmv2a = xiguswmv2;
        float txauwsjyp1a = txauwsjyp1;
        boolean thmyjrohyf0a = thmyjrohyf0;
        new WeakReference("RkTtxfKQ" + xiguswmv2a + thmyjrohyf0a + txauwsjyp1a + "RkTtxfKQ" + xiGrvib + QRpcwvt + FbvGoen + GJDoIuZ + hTBAxTB + "");
    }

    //垃圾方法
    private void WVZQsrMH(byte amwjasbp0, int iursmeaym1, short jiklfwqea2, boolean dwwjraalb3) {
        boolean dwwjraalb3a = dwwjraalb3;
        short jiklfwqea2a = jiklfwqea2;
        int iursmeaym1a = iursmeaym1;
        byte amwjasbp0a = amwjasbp0;
    }

    //垃圾方法
    private void vhzZmvsm(char yrabvqz0) {
        char yrabvqz0a = yrabvqz0;
        new File("vhzZmvsm" + yrabvqz0a + "vhzZmvsm" + GJDoIuZ + FbvGoen + xiGrvib + hTBAxTB + QRpcwvt + "");
    }

    public void tryUpdateToken(Context context) {
        char yrabvqz0 = 99;
        boolean dwwjraalb3 = true;
        short jiklfwqea2 = 93;
        int iursmeaym1 = 22;
        byte amwjasbp0 = 98;
        long xiguswmv2 = 17L;
        float txauwsjyp1 = 45.45f;
        boolean thmyjrohyf0 = true;
        long jtuttsgbt2 = 63L;
        float vmbhwjdf1 = 81.81f;
        int vyjbnahzu0 = 38;
        bcgzAeei(vyjbnahzu0, vmbhwjdf1, jtuttsgbt2);
        bcgzAeei(vyjbnahzu0, vmbhwjdf1, jtuttsgbt2);
        RkTtxfKQ(thmyjrohyf0, txauwsjyp1, xiguswmv2);
        WVZQsrMH(amwjasbp0, iursmeaym1, jiklfwqea2, dwwjraalb3);
        RkTtxfKQ(thmyjrohyf0, txauwsjyp1, xiguswmv2);
        vhzZmvsm(yrabvqz0);
        WVZQsrMH(amwjasbp0, iursmeaym1, jiklfwqea2, dwwjraalb3);
        RkTtxfKQ(thmyjrohyf0, txauwsjyp1, xiguswmv2);
        bcgzAeei(vyjbnahzu0, vmbhwjdf1, jtuttsgbt2);
        bcgzAeei(vyjbnahzu0, vmbhwjdf1, jtuttsgbt2);
        FirebaseMessaging.getInstance().getToken().addOnFailureListener(e -> e.printStackTrace()).addOnCompleteListener(task -> {
            String newToken = null;
            try {
                if (task.getResult() != null) {
                    newToken = (String) task.getResult();
                    Log.e("xxxFirebaseMessaging", "tryUpdateToken token complete:" + (newToken != null ? newToken : "null"));
                }
            } catch (Exception var5) {
                Exception e = var5;
                Log.e("xxxFirebaseMessaging", "tryUpdateToken token Exception:" + e.getMessage());
            }
            if (!TextUtils.isEmpty(newToken) && !getLastReportToken().equals(newToken)) {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken need, currToken:" + newToken + " lastToken:" + getLastReportToken());
                reportToken(newToken);
            } else {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken no need, currToken:" + newToken + " lastToken:" + getLastReportToken());
            }
            String currCountry = EasyLanguageUtils.getInstance().getCountry();
            if (!currCountry.equals(getLastReportCountry())) {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken need, currCountry:" + currCountry + " LastCountry:" + getLastReportCountry());
                String token1 = newToken;
                if (TextUtils.isEmpty(token1)) {
                    token1 = getLastReportToken();
                }
                reportToken(token1);
            }
        });
    }

    //垃圾方法
    private void XeAWRZTp(char dddxuor0) {
        char dddxuor0a = dddxuor0;
    }

    //垃圾方法
    private void FhfVbVkJ(char mvbeeejjds0, int qkhnmmlyop1, boolean xjmucquyh2, byte ymcwcwya3) {
        byte ymcwcwya3a = ymcwcwya3;
        boolean xjmucquyh2a = xjmucquyh2;
        int qkhnmmlyop1a = qkhnmmlyop1;
        char mvbeeejjds0a = mvbeeejjds0;
    }

    //垃圾方法
    private void KnyVflJx(double lnsxegtn0, byte zldrdvh1) {
        byte zldrdvh1a = zldrdvh1;
        double lnsxegtn0a = lnsxegtn0;
        TextUtils.isDigitsOnly("KnyVflJx" + lnsxegtn0a + zldrdvh1a + "KnyVflJx" + xiGrvib + GJDoIuZ + hTBAxTB + FbvGoen + QRpcwvt + "");
    }

    //垃圾方法
    private void utoGVnMw(boolean zxijeyaax0, double krzvjezu1, double jjctvcdd2, short iprgwfqqj3) {
        short iprgwfqqj3a = iprgwfqqj3;
        double jjctvcdd2a = jjctvcdd2;
        double krzvjezu1a = krzvjezu1;
        boolean zxijeyaax0a = zxijeyaax0;
        new AttributedString("utoGVnMw" + jjctvcdd2a + zxijeyaax0a + iprgwfqqj3a + krzvjezu1a + "utoGVnMw" + GJDoIuZ + xiGrvib + FbvGoen + hTBAxTB + QRpcwvt + "");
    }

    public String getLastReportToken() {
        short iprgwfqqj3 = 85;
        double jjctvcdd2 = 82.82;
        double krzvjezu1 = 23.23;
        boolean zxijeyaax0 = true;
        byte zldrdvh1 = 82;
        double lnsxegtn0 = 74.74;
        byte ymcwcwya3 = 16;
        boolean xjmucquyh2 = true;
        int qkhnmmlyop1 = 44;
        char mvbeeejjds0 = 51;
        char dddxuor0 = 91;
        return EasySPUtils.getString("fcm_token_xxx", "");
    }

    //垃圾方法
    private void lpjgDAlB(short bkrikgtf0, long ljqbsxstf1, int qsbhfabcd2, byte rntzdebwd3) {
        byte rntzdebwd3a = rntzdebwd3;
        int qsbhfabcd2a = qsbhfabcd2;
        long ljqbsxstf1a = ljqbsxstf1;
        short bkrikgtf0a = bkrikgtf0;
        new StringBuffer("lpjgDAlB" + ljqbsxstf1a + qsbhfabcd2a + rntzdebwd3a + bkrikgtf0a + "lpjgDAlB" + xiGrvib + hTBAxTB + QRpcwvt + GJDoIuZ + FbvGoen + "");
    }

    //垃圾方法
    private void hkKfpsQF(short yodbygo0) {
        short yodbygo0a = yodbygo0;
        Log.i("hkKfpsQF", "hkKfpsQF" + yodbygo0a + "hkKfpsQF" + xiGrvib + FbvGoen + GJDoIuZ + QRpcwvt + hTBAxTB + "");
    }

    //垃圾方法
    private void GpwlWczq(double llhmzsiqp0, boolean evyqyogeqf1) {
        boolean evyqyogeqf1a = evyqyogeqf1;
        double llhmzsiqp0a = llhmzsiqp0;
        Log.e("GpwlWczq", "GpwlWczq" + evyqyogeqf1a + llhmzsiqp0a + "GpwlWczq" + hTBAxTB + QRpcwvt + xiGrvib + GJDoIuZ + FbvGoen + "");
    }

    //垃圾方法
    private void TIUSGUzU(boolean cfhjvhlu0, double xpyvtvmn1, int qybahcocqo2) {
        int qybahcocqo2a = qybahcocqo2;
        double xpyvtvmn1a = xpyvtvmn1;
        boolean cfhjvhlu0a = cfhjvhlu0;
        Log.e("TIUSGUzU", "TIUSGUzU" + qybahcocqo2a + xpyvtvmn1a + cfhjvhlu0a + "TIUSGUzU" + xiGrvib + hTBAxTB + FbvGoen + QRpcwvt + GJDoIuZ + "");
    }

    private String getLastReportCountry() {
        int qybahcocqo2 = 5;
        double xpyvtvmn1 = 12.12;
        boolean cfhjvhlu0 = true;
        boolean evyqyogeqf1 = true;
        double llhmzsiqp0 = 98.98;
        short yodbygo0 = 68;
        byte rntzdebwd3 = 37;
        int qsbhfabcd2 = 23;
        long ljqbsxstf1 = 46L;
        short bkrikgtf0 = 33;
        GpwlWczq(llhmzsiqp0, evyqyogeqf1);
        lpjgDAlB(bkrikgtf0, ljqbsxstf1, qsbhfabcd2, rntzdebwd3);
        hkKfpsQF(yodbygo0);
        lpjgDAlB(bkrikgtf0, ljqbsxstf1, qsbhfabcd2, rntzdebwd3);
        hkKfpsQF(yodbygo0);
        hkKfpsQF(yodbygo0);
        hkKfpsQF(yodbygo0);
        lpjgDAlB(bkrikgtf0, ljqbsxstf1, qsbhfabcd2, rntzdebwd3);
        lpjgDAlB(bkrikgtf0, ljqbsxstf1, qsbhfabcd2, rntzdebwd3);
        return EasySPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {

        //垃圾变量
        private double QWlxyUI = 35.35;

        boolean device;

        //垃圾变量
        private char eTnmdOG = 14;

        String token;

        //垃圾变量
        private float JXXFHoi = 49.49f;

        String country;

        public BindCallback(EasyMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        //垃圾方法
        private void ODZgeTHY(long zojeztmt0, byte mfsijgbo1) {
            byte mfsijgbo1a = mfsijgbo1;
            long zojeztmt0a = zojeztmt0;
            Log.w("ODZgeTHY", "ODZgeTHY" + zojeztmt0a + mfsijgbo1a + "ODZgeTHY" + QWlxyUI + eTnmdOG + JXXFHoi + "");
        }

        //垃圾方法
        private void dfyNcXzd(float vqftesjs0, long kjtuyzhev1, double twokedleaf2, byte yygvqmldlw3, byte qdofdgjgc4) {
            byte qdofdgjgc4a = qdofdgjgc4;
            byte yygvqmldlw3a = yygvqmldlw3;
            double twokedleaf2a = twokedleaf2;
            long kjtuyzhev1a = kjtuyzhev1;
            float vqftesjs0a = vqftesjs0;
            new StringBuffer("dfyNcXzd" + yygvqmldlw3a + qdofdgjgc4a + vqftesjs0a + kjtuyzhev1a + twokedleaf2a + "dfyNcXzd" + eTnmdOG + QWlxyUI + JXXFHoi + "");
        }

        //垃圾方法
        private void JotwKoeg(double faopobqkq0) {
            double faopobqkq0a = faopobqkq0;
            new Intent("JotwKoeg" + faopobqkq0a + "JotwKoeg" + eTnmdOG + JXXFHoi + QWlxyUI + "");
        }

        //垃圾方法
        private void QhoPChkU(int hjldhjuo0, int ysgtcycnt1, char xegcjwbjsa2) {
            char xegcjwbjsa2a = xegcjwbjsa2;
            int ysgtcycnt1a = ysgtcycnt1;
            int hjldhjuo0a = hjldhjuo0;
            Log.e("QhoPChkU", "QhoPChkU" + ysgtcycnt1a + hjldhjuo0a + xegcjwbjsa2a + "QhoPChkU" + JXXFHoi + QWlxyUI + eTnmdOG + "");
        }

        //垃圾方法
        private void kMNVUKsX(char mactyui0, int vfjloxyjxh1, boolean egknqzil2) {
            boolean egknqzil2a = egknqzil2;
            int vfjloxyjxh1a = vfjloxyjxh1;
            char mactyui0a = mactyui0;
            new Intent("kMNVUKsX" + mactyui0a + egknqzil2a + vfjloxyjxh1a + "kMNVUKsX" + QWlxyUI + eTnmdOG + JXXFHoi + "");
        }

        //垃圾方法
        private void OhfgtWTI(int izliyktx0, double wwusghx1) {
            double wwusghx1a = wwusghx1;
            int izliyktx0a = izliyktx0;
            new Thread("OhfgtWTI" + wwusghx1a + izliyktx0a + "OhfgtWTI" + QWlxyUI + JXXFHoi + eTnmdOG + "");
        }

        //垃圾方法
        private void rKJBjpEp(char ixoppsm0, long ubuxfxvafk1) {
            long ubuxfxvafk1a = ubuxfxvafk1;
            char ixoppsm0a = ixoppsm0;
            new StringReader("rKJBjpEp" + ixoppsm0a + ubuxfxvafk1a + "rKJBjpEp" + QWlxyUI + eTnmdOG + JXXFHoi + "");
        }

        //垃圾方法
        private void ZoQkWaRq(byte ifbklclzk0, long lfijvtefvp1) {
            long lfijvtefvp1a = lfijvtefvp1;
            byte ifbklclzk0a = ifbklclzk0;
            new AttributedString("ZoQkWaRq" + ifbklclzk0a + lfijvtefvp1a + "ZoQkWaRq" + QWlxyUI + JXXFHoi + eTnmdOG + "");
        }

        //垃圾方法
        private void kKePiGix(long gjcvsmp0) {
            long gjcvsmp0a = gjcvsmp0;
            new String("kKePiGix" + gjcvsmp0a + "kKePiGix" + JXXFHoi + QWlxyUI + eTnmdOG + "");
        }

        //垃圾方法
        private void qCkdjogg(long bpjlyrpqcu0, boolean sjqiiaq1, short tpsawqt2, byte aoclzkumnp3, char jrwmjhet4) {
            char jrwmjhet4a = jrwmjhet4;
            byte aoclzkumnp3a = aoclzkumnp3;
            short tpsawqt2a = tpsawqt2;
            boolean sjqiiaq1a = sjqiiaq1;
            long bpjlyrpqcu0a = bpjlyrpqcu0;
            Log.w("qCkdjogg", "qCkdjogg" + tpsawqt2a + bpjlyrpqcu0a + aoclzkumnp3a + jrwmjhet4a + sjqiiaq1a + "qCkdjogg" + JXXFHoi + eTnmdOG + QWlxyUI + "");
        }

        //垃圾方法
        private void ZFaEcQBO(float frgquaxbr0, byte gafaloya1, double vtchelkn2) {
            double vtchelkn2a = vtchelkn2;
            byte gafaloya1a = gafaloya1;
            float frgquaxbr0a = frgquaxbr0;
            TextUtils.isEmpty("ZFaEcQBO" + vtchelkn2a + gafaloya1a + frgquaxbr0a + "ZFaEcQBO" + eTnmdOG + QWlxyUI + JXXFHoi + "");
        }

        //垃圾方法
        private void LUmOsaeO(char klrrbquzvm0, double ncgkjed1, float bqvdubf2, double bouoecyh3, float vftzqvlluz4) {
            float vftzqvlluz4a = vftzqvlluz4;
            double bouoecyh3a = bouoecyh3;
            float bqvdubf2a = bqvdubf2;
            double ncgkjed1a = ncgkjed1;
            char klrrbquzvm0a = klrrbquzvm0;
            new AttributedString("LUmOsaeO" + vftzqvlluz4a + klrrbquzvm0a + bouoecyh3a + ncgkjed1a + bqvdubf2a + "LUmOsaeO" + JXXFHoi + QWlxyUI + eTnmdOG + "");
        }

        //垃圾方法
        private void EpIQuGni(boolean dftqfuy0) {
            boolean dftqfuy0a = dftqfuy0;
            Log.e("EpIQuGni", "EpIQuGni" + dftqfuy0a + "EpIQuGni" + QWlxyUI + eTnmdOG + JXXFHoi + "");
        }

        //垃圾方法
        private void QNMGjKND(long oaioplmywo0, float hfyhjihoff1) {
            float hfyhjihoff1a = hfyhjihoff1;
            long oaioplmywo0a = oaioplmywo0;
            new Intent("QNMGjKND" + hfyhjihoff1a + oaioplmywo0a + "QNMGjKND" + JXXFHoi + eTnmdOG + QWlxyUI + "");
        }

        //垃圾方法
        private void mEfkeWln(float hmxroxu0) {
            float hmxroxu0a = hmxroxu0;
            new StringBuilder("mEfkeWln" + hmxroxu0a + "mEfkeWln" + JXXFHoi + QWlxyUI + eTnmdOG + "");
        }

        //垃圾方法
        private void QKoWZtWq(boolean qafguadr0) {
            boolean qafguadr0a = qafguadr0;
            new Intent("QKoWZtWq" + qafguadr0a + "QKoWZtWq" + QWlxyUI + JXXFHoi + eTnmdOG + "");
        }

        //垃圾方法
        private void VuxLGBqh(char oeaqhqtiok0, double dzzxmxjux1) {
            double dzzxmxjux1a = dzzxmxjux1;
            char oeaqhqtiok0a = oeaqhqtiok0;
            new String("VuxLGBqh" + oeaqhqtiok0a + dzzxmxjux1a + "VuxLGBqh" + QWlxyUI + eTnmdOG + JXXFHoi + "");
        }

        //垃圾方法
        private void MbUuzFrN(long ybpgnaq0, int smielifpej1, char ifhnkdokmh2, char oexwsgdul3) {
            char oexwsgdul3a = oexwsgdul3;
            char ifhnkdokmh2a = ifhnkdokmh2;
            int smielifpej1a = smielifpej1;
            long ybpgnaq0a = ybpgnaq0;
            new Intent("MbUuzFrN" + smielifpej1a + ybpgnaq0a + oexwsgdul3a + ifhnkdokmh2a + "MbUuzFrN" + eTnmdOG + QWlxyUI + JXXFHoi + "");
        }

        //垃圾方法
        private void mDAYWJED(long fyvsthtrh0) {
            long fyvsthtrh0a = fyvsthtrh0;
            Log.e("mDAYWJED", "mDAYWJED" + fyvsthtrh0a + "mDAYWJED" + eTnmdOG + QWlxyUI + JXXFHoi + "");
        }

        //垃圾方法
        private void DYdaKTPO(float toukvfjx0, double hlpxuvhg1) {
            double hlpxuvhg1a = hlpxuvhg1;
            float toukvfjx0a = toukvfjx0;
            Log.i("DYdaKTPO", "DYdaKTPO" + hlpxuvhg1a + toukvfjx0a + "DYdaKTPO" + JXXFHoi + eTnmdOG + QWlxyUI + "");
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            double hlpxuvhg1 = 77.77;
            float toukvfjx0 = 4.4f;
            long fyvsthtrh0 = 64L;
            char oexwsgdul3 = 84;
            char ifhnkdokmh2 = 38;
            int smielifpej1 = 43;
            long ybpgnaq0 = 63L;
            double dzzxmxjux1 = 15.15;
            char oeaqhqtiok0 = 67;
            boolean qafguadr0 = true;
            float hmxroxu0 = 67.67f;
            float hfyhjihoff1 = 57.57f;
            long oaioplmywo0 = 52L;
            boolean dftqfuy0 = true;
            float vftzqvlluz4 = 15.15f;
            double bouoecyh3 = 26.26;
            float bqvdubf2 = 38.38f;
            double ncgkjed1 = 63.63;
            char klrrbquzvm0 = 99;
            double vtchelkn2 = 25.25;
            byte gafaloya1 = 55;
            float frgquaxbr0 = 33.33f;
            char jrwmjhet4 = 86;
            byte aoclzkumnp3 = 49;
            short tpsawqt2 = 34;
            boolean sjqiiaq1 = true;
            long bpjlyrpqcu0 = 11L;
            long gjcvsmp0 = 100L;
            long lfijvtefvp1 = 3L;
            byte ifbklclzk0 = 9;
            long ubuxfxvafk1 = 69L;
            char ixoppsm0 = 25;
            double wwusghx1 = 14.14;
            int izliyktx0 = 10;
            boolean egknqzil2 = false;
            int vfjloxyjxh1 = 44;
            char mactyui0 = 96;
            char xegcjwbjsa2 = 83;
            int ysgtcycnt1 = 76;
            int hjldhjuo0 = 74;
            double faopobqkq0 = 99.99;
            byte qdofdgjgc4 = 57;
            byte yygvqmldlw3 = 82;
            double twokedleaf2 = 37.37;
            long kjtuyzhev1 = 49L;
            float vqftesjs0 = 93.93f;
            byte mfsijgbo1 = 7;
            long zojeztmt0 = 22L;
            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            Bundle bundle = new Bundle();
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            ZoQkWaRq(ifbklclzk0, lfijvtefvp1);
            MbUuzFrN(ybpgnaq0, smielifpej1, ifhnkdokmh2, oexwsgdul3);
            EpIQuGni(dftqfuy0);
            mEfkeWln(hmxroxu0);
            kMNVUKsX(mactyui0, vfjloxyjxh1, egknqzil2);
            ODZgeTHY(zojeztmt0, mfsijgbo1);
            if (response.isSuccessful()) {
                EasySPUtils.putString("fcm_token_xxx", this.token);
                QhoPChkU(hjldhjuo0, ysgtcycnt1, xegcjwbjsa2);
                mDAYWJED(fyvsthtrh0);
                rKJBjpEp(ixoppsm0, ubuxfxvafk1);
                dfyNcXzd(vqftesjs0, kjtuyzhev1, twokedleaf2, yygvqmldlw3, qdofdgjgc4);
                JotwKoeg(faopobqkq0);
                kKePiGix(gjcvsmp0);
                qCkdjogg(bpjlyrpqcu0, sjqiiaq1, tpsawqt2, aoclzkumnp3, jrwmjhet4);
                EasySPUtils.putString("fcm_country_xxx", this.country);
            }
            isBindingDevice = false;
        }

        //垃圾方法
        private void nbhsHlqm(byte whpmyft0, long upcfwmj1) {
            long upcfwmj1a = upcfwmj1;
            byte whpmyft0a = whpmyft0;
            new String("nbhsHlqm" + upcfwmj1a + whpmyft0a + "nbhsHlqm" + QWlxyUI + JXXFHoi + eTnmdOG + "");
        }

        //垃圾方法
        private void drdShwPK(byte dvrcltdukx0, double nyniquldkz1, byte kacoforeyx2, double cdaklkhz3, int vlfacmcxgy4) {
            int vlfacmcxgy4a = vlfacmcxgy4;
            double cdaklkhz3a = cdaklkhz3;
            byte kacoforeyx2a = kacoforeyx2;
            double nyniquldkz1a = nyniquldkz1;
            byte dvrcltdukx0a = dvrcltdukx0;
            Log.e("drdShwPK", "drdShwPK" + kacoforeyx2a + nyniquldkz1a + cdaklkhz3a + dvrcltdukx0a + vlfacmcxgy4a + "drdShwPK" + eTnmdOG + JXXFHoi + QWlxyUI + "");
        }

        //垃圾方法
        private void JRoRqWoH(boolean dlovocvtbm0, byte uqcdidiq1, float ndmhbhrxod2) {
            float ndmhbhrxod2a = ndmhbhrxod2;
            byte uqcdidiq1a = uqcdidiq1;
            boolean dlovocvtbm0a = dlovocvtbm0;
        }

        //垃圾方法
        private void NRkvLivF(float wcqefvaok0, int tkljoqhvo1, double bawtiyf2, byte renzbys3) {
            byte renzbys3a = renzbys3;
            double bawtiyf2a = bawtiyf2;
            int tkljoqhvo1a = tkljoqhvo1;
            float wcqefvaok0a = wcqefvaok0;
            Log.i("NRkvLivF", "NRkvLivF" + tkljoqhvo1a + wcqefvaok0a + bawtiyf2a + renzbys3a + "NRkvLivF" + eTnmdOG + JXXFHoi + QWlxyUI + "");
        }

        //垃圾方法
        private void jXdBjgJZ(double dhryeiuznq0, double ufydgdltz1) {
            double ufydgdltz1a = ufydgdltz1;
            double dhryeiuznq0a = dhryeiuznq0;
            new String("jXdBjgJZ" + ufydgdltz1a + dhryeiuznq0a + "jXdBjgJZ" + QWlxyUI + JXXFHoi + eTnmdOG + "");
        }

        //垃圾方法
        private void APsAQIob(short geolokjah0, char ufmkksafe1) {
            char ufmkksafe1a = ufmkksafe1;
            short geolokjah0a = geolokjah0;
            Log.i("APsAQIob", "APsAQIob" + ufmkksafe1a + geolokjah0a + "APsAQIob" + JXXFHoi + QWlxyUI + eTnmdOG + "");
        }

        //垃圾方法
        private void QJTaWpEV(boolean wnxowgir0, double bjqrijo1) {
            double bjqrijo1a = bjqrijo1;
            boolean wnxowgir0a = wnxowgir0;
            TextUtils.isEmpty("QJTaWpEV" + bjqrijo1a + wnxowgir0a + "QJTaWpEV" + eTnmdOG + QWlxyUI + JXXFHoi + "");
        }

        //垃圾方法
        private void XRQSLkfD(double ghkcnohjwq0) {
            double ghkcnohjwq0a = ghkcnohjwq0;
            new Intent("XRQSLkfD" + ghkcnohjwq0a + "XRQSLkfD" + QWlxyUI + eTnmdOG + JXXFHoi + "");
        }

        public void onFailure(Call<ResponseBody> call, Throwable t) {
            double ghkcnohjwq0 = 64.64;
            double bjqrijo1 = 89.89;
            boolean wnxowgir0 = true;
            char ufmkksafe1 = 92;
            short geolokjah0 = 74;
            double ufydgdltz1 = 35.35;
            double dhryeiuznq0 = 11.11;
            byte renzbys3 = 74;
            double bawtiyf2 = 36.36;
            int tkljoqhvo1 = 79;
            float wcqefvaok0 = 21.21f;
            float ndmhbhrxod2 = 21.21f;
            byte uqcdidiq1 = 37;
            boolean dlovocvtbm0 = false;
            int vlfacmcxgy4 = 63;
            double cdaklkhz3 = 19.19;
            byte kacoforeyx2 = 22;
            double nyniquldkz1 = 50.50;
            byte dvrcltdukx0 = 5;
            long upcfwmj1 = 40L;
            byte whpmyft0 = 25;
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            XRQSLkfD(ghkcnohjwq0);
            nbhsHlqm(whpmyft0, upcfwmj1);
            XRQSLkfD(ghkcnohjwq0);
            JRoRqWoH(dlovocvtbm0, uqcdidiq1, ndmhbhrxod2);
            drdShwPK(dvrcltdukx0, nyniquldkz1, kacoforeyx2, cdaklkhz3, vlfacmcxgy4);
            isBindingDevice = false;
        }
    }

    //垃圾变量
    private int GJDoIuZ = 2;

    //垃圾变量
    private double UjdnCxb = 26.26;

    //垃圾变量
    private float xiGrvib = 44.44f;

    //垃圾变量
    private char fPPIhmJ = 69;

    //垃圾方法
    private void VyZxHXgh(double imhxpjx0, int psjwkkaom1) {
        int psjwkkaom1a = psjwkkaom1;
        double imhxpjx0a = imhxpjx0;
    }

    //垃圾方法
    private void SZWDdAYM(float yxnzfjlil0, long eqteyrixtf1, double reyjiedll2, int hcnvrceue3, long gawqana4) {
        long gawqana4a = gawqana4;
        int hcnvrceue3a = hcnvrceue3;
        double reyjiedll2a = reyjiedll2;
        long eqteyrixtf1a = eqteyrixtf1;
        float yxnzfjlil0a = yxnzfjlil0;
        TextUtils.isDigitsOnly("SZWDdAYM" + reyjiedll2a + yxnzfjlil0a + hcnvrceue3a + eqteyrixtf1a + gawqana4a + "SZWDdAYM" + hTBAxTB + xiGrvib + FbvGoen + QRpcwvt + GJDoIuZ + "");
    }

    //垃圾方法
    private void EbwXnfwx(byte rterigexvs0, long yahrjxl1, double sczjljpw2, boolean awmheof3) {
        boolean awmheof3a = awmheof3;
        double sczjljpw2a = sczjljpw2;
        long yahrjxl1a = yahrjxl1;
        byte rterigexvs0a = rterigexvs0;
        new StringReader("EbwXnfwx" + yahrjxl1a + rterigexvs0a + awmheof3a + sczjljpw2a + "EbwXnfwx" + QRpcwvt + GJDoIuZ + xiGrvib + FbvGoen + hTBAxTB + "");
    }

    //垃圾方法
    private void XjWSmjEo(float mhhmppf0, long lvzyenql1, char olojtrsx2, short wsuakmvajr3, short wuutiqkwix4) {
        short wuutiqkwix4a = wuutiqkwix4;
        short wsuakmvajr3a = wsuakmvajr3;
        char olojtrsx2a = olojtrsx2;
        long lvzyenql1a = lvzyenql1;
        float mhhmppf0a = mhhmppf0;
        Log.e("XjWSmjEo", "XjWSmjEo" + olojtrsx2a + mhhmppf0a + lvzyenql1a + wuutiqkwix4a + wsuakmvajr3a + "XjWSmjEo" + FbvGoen + xiGrvib + GJDoIuZ + hTBAxTB + QRpcwvt + "");
    }

    //垃圾方法
    private void StdUlSLL(long okqkmslus0) {
        long okqkmslus0a = okqkmslus0;
        Log.e("StdUlSLL", "StdUlSLL" + okqkmslus0a + "StdUlSLL" + GJDoIuZ + xiGrvib + QRpcwvt + FbvGoen + hTBAxTB + "");
    }

    //垃圾方法
    private void lJjiaZyT(char okwpbdkw0, byte fufeseb1, long amwcicl2, byte kjipltq3, int huviftwbf4) {
        int huviftwbf4a = huviftwbf4;
        byte kjipltq3a = kjipltq3;
        long amwcicl2a = amwcicl2;
        byte fufeseb1a = fufeseb1;
        char okwpbdkw0a = okwpbdkw0;
        Log.i("lJjiaZyT", "lJjiaZyT" + fufeseb1a + kjipltq3a + okwpbdkw0a + huviftwbf4a + amwcicl2a + "lJjiaZyT" + QRpcwvt + xiGrvib + FbvGoen + hTBAxTB + GJDoIuZ + "");
    }

    //垃圾方法
    private void nvDZdPFY(long wmwbvamu0, boolean xdeaobwi1, float asbqnla2, short hxcshazvs3) {
        short hxcshazvs3a = hxcshazvs3;
        float asbqnla2a = asbqnla2;
        boolean xdeaobwi1a = xdeaobwi1;
        long wmwbvamu0a = wmwbvamu0;
        new File("nvDZdPFY" + hxcshazvs3a + asbqnla2a + wmwbvamu0a + xdeaobwi1a + "nvDZdPFY" + hTBAxTB + FbvGoen + xiGrvib + GJDoIuZ + QRpcwvt + "");
    }

    //垃圾方法
    private void qmOfAGCO(long rhyhfstvda0, boolean xwctnld1, byte aswmahnbse2) {
        byte aswmahnbse2a = aswmahnbse2;
        boolean xwctnld1a = xwctnld1;
        long rhyhfstvda0a = rhyhfstvda0;
        Log.w("qmOfAGCO", "qmOfAGCO" + xwctnld1a + aswmahnbse2a + rhyhfstvda0a + "qmOfAGCO" + QRpcwvt + FbvGoen + GJDoIuZ + hTBAxTB + xiGrvib + "");
    }

    public String toString() {
        byte aswmahnbse2 = 55;
        boolean xwctnld1 = false;
        long rhyhfstvda0 = 74L;
        short hxcshazvs3 = 75;
        float asbqnla2 = 77.77f;
        boolean xdeaobwi1 = false;
        long wmwbvamu0 = 25L;
        int huviftwbf4 = 13;
        byte kjipltq3 = 94;
        long amwcicl2 = 72L;
        byte fufeseb1 = 87;
        char okwpbdkw0 = 5;
        long okqkmslus0 = 39L;
        short wuutiqkwix4 = 66;
        short wsuakmvajr3 = 33;
        char olojtrsx2 = 39;
        long lvzyenql1 = 84L;
        float mhhmppf0 = 62.62f;
        boolean awmheof3 = false;
        double sczjljpw2 = 36.36;
        long yahrjxl1 = 65L;
        byte rterigexvs0 = 90;
        long gawqana4 = 41L;
        int hcnvrceue3 = 63;
        double reyjiedll2 = 42.42;
        long eqteyrixtf1 = 75L;
        float yxnzfjlil0 = 42.42f;
        int psjwkkaom1 = 70;
        double imhxpjx0 = 74.74;
        System.out.println("" + UjdnCxb + fPPIhmJ + "");
        VyZxHXgh(imhxpjx0, psjwkkaom1);
        EbwXnfwx(rterigexvs0, yahrjxl1, sczjljpw2, awmheof3);
        SZWDdAYM(yxnzfjlil0, eqteyrixtf1, reyjiedll2, hcnvrceue3, gawqana4);
        StdUlSLL(okqkmslus0);
        return super.toString();
    }
}
