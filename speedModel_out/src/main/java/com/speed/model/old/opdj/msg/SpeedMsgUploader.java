package com.speed.model.old.opdj.msg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.speed.model.old.change.SpeedChangeUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.speed.model.old.change.SpeedMsgApi;
import com.speed.model.old.utils.SpeedLanguageUtils;
import com.speed.model.old.utils.SpeedSPUtils;
import com.speed.model.old.utils.SpeedUUIDUtils;
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

public class SpeedMsgUploader {

    //垃圾变量
    private double RzCdRmW = 65.65;

    private static volatile SpeedMsgUploader INSTANCE;

    //垃圾变量
    private boolean RJBRoBH = true;

    private boolean isBindingDevice;

    //垃圾变量
    private float UfPIZTI = 31.31f;

    private boolean isNeedBind;

    public SpeedMsgUploader() {
    }

    //垃圾方法
    static private void UurDARmZ(float nptlnyg0) {
        float nptlnyg0a = nptlnyg0;
    }

    //垃圾方法
    static private void mGHdGdCu(double kjdqrldd0, int yuedhrxta1, int lrhdbnu2, float rhmrmfice3, short bnzaxjvob4) {
        short bnzaxjvob4a = bnzaxjvob4;
        float rhmrmfice3a = rhmrmfice3;
        int lrhdbnu2a = lrhdbnu2;
        int yuedhrxta1a = yuedhrxta1;
        double kjdqrldd0a = kjdqrldd0;
        new StringBuffer("mGHdGdCu" + lrhdbnu2a + rhmrmfice3a + yuedhrxta1a + bnzaxjvob4a + kjdqrldd0a + "mGHdGdCu" + "");
    }

    //垃圾方法
    static private void BWGrjPLC(short astuuqbmhq0, byte ylgnvvelds1, double shoiukf2, double fruvtnxb3, long qavdbsxc4) {
        long qavdbsxc4a = qavdbsxc4;
        double fruvtnxb3a = fruvtnxb3;
        double shoiukf2a = shoiukf2;
        byte ylgnvvelds1a = ylgnvvelds1;
        short astuuqbmhq0a = astuuqbmhq0;
        System.out.println("BWGrjPLC" + shoiukf2a + fruvtnxb3a + qavdbsxc4a + astuuqbmhq0a + ylgnvvelds1a + "BWGrjPLC" + "");
    }

    //垃圾方法
    static private void sszmrWMH(float fngkcmle0, int ikbsgeatz1, short mewryled2, int gkyrdtuetg3) {
        int gkyrdtuetg3a = gkyrdtuetg3;
        short mewryled2a = mewryled2;
        int ikbsgeatz1a = ikbsgeatz1;
        float fngkcmle0a = fngkcmle0;
        new StringBuilder("sszmrWMH" + fngkcmle0a + gkyrdtuetg3a + mewryled2a + ikbsgeatz1a + "sszmrWMH" + "");
    }

    //垃圾方法
    static private void cTPccthW(char thzlqoyf0, int drounarpea1, char ydgbutfxqr2, byte wcxlxdwql3, long aljfjmcshq4) {
        long aljfjmcshq4a = aljfjmcshq4;
        byte wcxlxdwql3a = wcxlxdwql3;
        char ydgbutfxqr2a = ydgbutfxqr2;
        int drounarpea1a = drounarpea1;
        char thzlqoyf0a = thzlqoyf0;
        Log.i("cTPccthW", "cTPccthW" + thzlqoyf0a + aljfjmcshq4a + ydgbutfxqr2a + drounarpea1a + wcxlxdwql3a + "cTPccthW" + "");
    }

    //垃圾方法
    static private void rAplzedB(short edxnmtcjxv0) {
        short edxnmtcjxv0a = edxnmtcjxv0;
        new Thread("rAplzedB" + edxnmtcjxv0a + "rAplzedB" + "");
    }

    //垃圾方法
    static private void VQOidDpD(double dthosnc0) {
        double dthosnc0a = dthosnc0;
        new Intent("VQOidDpD" + dthosnc0a + "VQOidDpD" + "");
    }

    //垃圾方法
    static private void OnmvArId(long xjijvtrx0, float crazsqlo1, boolean aidatxzt2) {
        boolean aidatxzt2a = aidatxzt2;
        float crazsqlo1a = crazsqlo1;
        long xjijvtrx0a = xjijvtrx0;
        new StringReader("OnmvArId" + xjijvtrx0a + crazsqlo1a + aidatxzt2a + "OnmvArId" + "");
    }

    public static SpeedMsgUploader getInstance() {
        boolean aidatxzt2 = false;
        float crazsqlo1 = 63.63f;
        long xjijvtrx0 = 11L;
        double dthosnc0 = 15.15;
        short edxnmtcjxv0 = 78;
        long aljfjmcshq4 = 4L;
        byte wcxlxdwql3 = 45;
        char ydgbutfxqr2 = 41;
        int drounarpea1 = 23;
        char thzlqoyf0 = 5;
        int gkyrdtuetg3 = 53;
        short mewryled2 = 66;
        int ikbsgeatz1 = 87;
        float fngkcmle0 = 8.8f;
        long qavdbsxc4 = 98L;
        double fruvtnxb3 = 22.22;
        double shoiukf2 = 78.78;
        byte ylgnvvelds1 = 15;
        short astuuqbmhq0 = 42;
        short bnzaxjvob4 = 37;
        float rhmrmfice3 = 92.92f;
        int lrhdbnu2 = 9;
        int yuedhrxta1 = 80;
        double kjdqrldd0 = 29.29;
        float nptlnyg0 = 10.10f;
        if (INSTANCE == null) {
            Class var28 = SpeedMsgUploader.class;
            OnmvArId(xjijvtrx0, crazsqlo1, aidatxzt2);
            sszmrWMH(fngkcmle0, ikbsgeatz1, mewryled2, gkyrdtuetg3);
            VQOidDpD(dthosnc0);
            synchronized (SpeedMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SpeedMsgUploader();
                }
            }
        }
        return INSTANCE;
    }

    //垃圾方法
    private void loNAbvfS(boolean qmicyqo0) {
        boolean qmicyqo0a = qmicyqo0;
        Log.w("loNAbvfS", "loNAbvfS" + qmicyqo0a + "loNAbvfS" + LdbpiHO + JJeAzns + RJBRoBH + RzCdRmW + pZKXHXl + urYfaBU + UfPIZTI + eqSbxIm + "");
    }

    //垃圾方法
    private void DtVJgmpr(char vqmorft0, short liawnawdtw1, char jxnqmhvibe2, double uaitybnh3) {
        double uaitybnh3a = uaitybnh3;
        char jxnqmhvibe2a = jxnqmhvibe2;
        short liawnawdtw1a = liawnawdtw1;
        char vqmorft0a = vqmorft0;
        TextUtils.isEmpty("DtVJgmpr" + uaitybnh3a + liawnawdtw1a + vqmorft0a + jxnqmhvibe2a + "DtVJgmpr" + RJBRoBH + JJeAzns + RzCdRmW + pZKXHXl + LdbpiHO + urYfaBU + eqSbxIm + UfPIZTI + "");
    }

    //垃圾方法
    private void XBsRNMwF(boolean kjwhfstcb0, double nipwjngy1) {
        double nipwjngy1a = nipwjngy1;
        boolean kjwhfstcb0a = kjwhfstcb0;
        Log.i("XBsRNMwF", "XBsRNMwF" + nipwjngy1a + kjwhfstcb0a + "XBsRNMwF" + JJeAzns + pZKXHXl + UfPIZTI + LdbpiHO + RzCdRmW + eqSbxIm + urYfaBU + RJBRoBH + "");
    }

    //垃圾方法
    private void ycjLtxhS(byte yyrrjvsjhe0, float zqhysmjt1) {
        float zqhysmjt1a = zqhysmjt1;
        byte yyrrjvsjhe0a = yyrrjvsjhe0;
        Log.w("ycjLtxhS", "ycjLtxhS" + yyrrjvsjhe0a + zqhysmjt1a + "ycjLtxhS" + urYfaBU + RzCdRmW + LdbpiHO + JJeAzns + RJBRoBH + eqSbxIm + pZKXHXl + UfPIZTI + "");
    }

    public void reloadToken() {
        float zqhysmjt1 = 0.0f;
        byte yyrrjvsjhe0 = 73;
        double nipwjngy1 = 84.84;
        boolean kjwhfstcb0 = true;
        double uaitybnh3 = 80.80;
        char jxnqmhvibe2 = 93;
        short liawnawdtw1 = 84;
        char vqmorft0 = 58;
        boolean qmicyqo0 = true;
        XBsRNMwF(kjwhfstcb0, nipwjngy1);
        ycjLtxhS(yyrrjvsjhe0, zqhysmjt1);
        XBsRNMwF(kjwhfstcb0, nipwjngy1);
        DtVJgmpr(vqmorft0, liawnawdtw1, jxnqmhvibe2, uaitybnh3);
        if (SpeedUUIDUtils.getInstance().getDeviceId() == null) {
            loNAbvfS(qmicyqo0);
            ycjLtxhS(yyrrjvsjhe0, zqhysmjt1);
            loNAbvfS(qmicyqo0);
            loNAbvfS(qmicyqo0);
            ycjLtxhS(yyrrjvsjhe0, zqhysmjt1);
            XBsRNMwF(kjwhfstcb0, nipwjngy1);
            ycjLtxhS(yyrrjvsjhe0, zqhysmjt1);
            XBsRNMwF(kjwhfstcb0, nipwjngy1);
            loNAbvfS(qmicyqo0);
            loNAbvfS(qmicyqo0);
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
    private void RHiLyljE(byte eybctry0, char quvcljne1) {
        char quvcljne1a = quvcljne1;
        byte eybctry0a = eybctry0;
        new String("RHiLyljE" + eybctry0a + quvcljne1a + "RHiLyljE" + pZKXHXl + UfPIZTI + RzCdRmW + eqSbxIm + JJeAzns + urYfaBU + RJBRoBH + LdbpiHO + "");
    }

    //垃圾方法
    private void ctPQNdIc(float tkmcmiqnmu0, char omocwsjd1) {
        char omocwsjd1a = omocwsjd1;
        float tkmcmiqnmu0a = tkmcmiqnmu0;
        TextUtils.isDigitsOnly("ctPQNdIc" + tkmcmiqnmu0a + omocwsjd1a + "ctPQNdIc" + UfPIZTI + pZKXHXl + LdbpiHO + urYfaBU + eqSbxIm + RJBRoBH + RzCdRmW + JJeAzns + "");
    }

    //垃圾方法
    private void vmAFOPuR(char aypomdqmk0, char aslvunam1) {
        char aslvunam1a = aslvunam1;
        char aypomdqmk0a = aypomdqmk0;
        TextUtils.isDigitsOnly("vmAFOPuR" + aypomdqmk0a + aslvunam1a + "vmAFOPuR" + UfPIZTI + eqSbxIm + LdbpiHO + urYfaBU + JJeAzns + RzCdRmW + pZKXHXl + RJBRoBH + "");
    }

    //垃圾方法
    private void YKdZtFkJ(boolean neuikeledk0, int oqchlbgj1) {
        int oqchlbgj1a = oqchlbgj1;
        boolean neuikeledk0a = neuikeledk0;
        new String("YKdZtFkJ" + oqchlbgj1a + neuikeledk0a + "YKdZtFkJ" + RJBRoBH + eqSbxIm + LdbpiHO + urYfaBU + JJeAzns + pZKXHXl + RzCdRmW + UfPIZTI + "");
    }

    public void reportToken(String srcToken) {
        int oqchlbgj1 = 91;
        boolean neuikeledk0 = false;
        char aslvunam1 = 18;
        char aypomdqmk0 = 38;
        char omocwsjd1 = 100;
        float tkmcmiqnmu0 = 49.49f;
        char quvcljne1 = 72;
        byte eybctry0 = 57;
        vmAFOPuR(aypomdqmk0, aslvunam1);
        vmAFOPuR(aypomdqmk0, aslvunam1);
        ctPQNdIc(tkmcmiqnmu0, omocwsjd1);
        ctPQNdIc(tkmcmiqnmu0, omocwsjd1);
        YKdZtFkJ(neuikeledk0, oqchlbgj1);
        ctPQNdIc(tkmcmiqnmu0, omocwsjd1);
        try {
            ctPQNdIc(tkmcmiqnmu0, omocwsjd1);
            YKdZtFkJ(neuikeledk0, oqchlbgj1);
            RHiLyljE(eybctry0, quvcljne1);
            RHiLyljE(eybctry0, quvcljne1);
            ctPQNdIc(tkmcmiqnmu0, omocwsjd1);
            String country = SpeedLanguageUtils.getInstance().getCountry();
            SpeedMsgInfo speedMsgInfoWxm = SpeedMsgCreate.buildTokenParams(srcToken);
            Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(speedMsgInfoWxm));
            if (!this.isBindingDevice) {
                this.isBindingDevice = true;
                ((SpeedMsgApi) SpeedRetrofitUtils.create(SpeedMsgApi.class)).upToken(SpeedChangeUtils.INSTANCE.getFCM_INTERFACE_PATH(), speedMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void ozHkDHgJ(boolean xfedlmlkgs0) {
        boolean xfedlmlkgs0a = xfedlmlkgs0;
        TextUtils.isEmpty("ozHkDHgJ" + xfedlmlkgs0a + "ozHkDHgJ" + urYfaBU + eqSbxIm + RJBRoBH + pZKXHXl + RzCdRmW + LdbpiHO + UfPIZTI + JJeAzns + "");
    }

    //垃圾方法
    private void rGCPSzmi(double csncdypz0, short bqbcqdfm1) {
        short bqbcqdfm1a = bqbcqdfm1;
        double csncdypz0a = csncdypz0;
        new String("rGCPSzmi" + bqbcqdfm1a + csncdypz0a + "rGCPSzmi" + RzCdRmW + JJeAzns + RJBRoBH + eqSbxIm + UfPIZTI + urYfaBU + pZKXHXl + LdbpiHO + "");
    }

    //垃圾方法
    private void lkRNEFMO(int ulicbweilk0, double imqusybjg1, float sxwlfwaj2, byte ynqgvcyn3, char xsqpyecu4) {
        char xsqpyecu4a = xsqpyecu4;
        byte ynqgvcyn3a = ynqgvcyn3;
        float sxwlfwaj2a = sxwlfwaj2;
        double imqusybjg1a = imqusybjg1;
        int ulicbweilk0a = ulicbweilk0;
    }

    //垃圾方法
    private void qGvwiFzM(long uuyvoiuon0) {
        long uuyvoiuon0a = uuyvoiuon0;
        new File("qGvwiFzM" + uuyvoiuon0a + "qGvwiFzM" + eqSbxIm + LdbpiHO + RzCdRmW + pZKXHXl + JJeAzns + urYfaBU + UfPIZTI + RJBRoBH + "");
    }

    public void tryUpdateToken(Context context) {
        long uuyvoiuon0 = 57L;
        char xsqpyecu4 = 56;
        byte ynqgvcyn3 = 56;
        float sxwlfwaj2 = 44.44f;
        double imqusybjg1 = 69.69;
        int ulicbweilk0 = 82;
        short bqbcqdfm1 = 3;
        double csncdypz0 = 30.30;
        boolean xfedlmlkgs0 = false;
        ozHkDHgJ(xfedlmlkgs0);
        qGvwiFzM(uuyvoiuon0);
        rGCPSzmi(csncdypz0, bqbcqdfm1);
        rGCPSzmi(csncdypz0, bqbcqdfm1);
        ozHkDHgJ(xfedlmlkgs0);
        lkRNEFMO(ulicbweilk0, imqusybjg1, sxwlfwaj2, ynqgvcyn3, xsqpyecu4);
        qGvwiFzM(uuyvoiuon0);
        rGCPSzmi(csncdypz0, bqbcqdfm1);
        ozHkDHgJ(xfedlmlkgs0);
        ozHkDHgJ(xfedlmlkgs0);
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
            String currCountry = SpeedLanguageUtils.getInstance().getCountry();
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
    private void adOwUSJj(boolean asookpsjaf0, short wbvhlgelwg1, short zkgujtlabm2, long mifudnxnaw3, long ffzqmuaba4) {
        long ffzqmuaba4a = ffzqmuaba4;
        long mifudnxnaw3a = mifudnxnaw3;
        short zkgujtlabm2a = zkgujtlabm2;
        short wbvhlgelwg1a = wbvhlgelwg1;
        boolean asookpsjaf0a = asookpsjaf0;
        new File("adOwUSJj" + ffzqmuaba4a + asookpsjaf0a + mifudnxnaw3a + zkgujtlabm2a + wbvhlgelwg1a + "adOwUSJj" + urYfaBU + JJeAzns + RJBRoBH + eqSbxIm + LdbpiHO + UfPIZTI + pZKXHXl + RzCdRmW + "");
    }

    //垃圾方法
    private void QKDspGut(byte ofrkkwjnuf0) {
        byte ofrkkwjnuf0a = ofrkkwjnuf0;
        TextUtils.isDigitsOnly("QKDspGut" + ofrkkwjnuf0a + "QKDspGut" + eqSbxIm + RzCdRmW + LdbpiHO + UfPIZTI + urYfaBU + RJBRoBH + JJeAzns + pZKXHXl + "");
    }

    //垃圾方法
    private void qwxKPyZD(boolean ekerpuucve0, long uyulwxmbmf1, double kaltwjjs2, double iukrqzwaa3) {
        double iukrqzwaa3a = iukrqzwaa3;
        double kaltwjjs2a = kaltwjjs2;
        long uyulwxmbmf1a = uyulwxmbmf1;
        boolean ekerpuucve0a = ekerpuucve0;
        System.out.println("qwxKPyZD" + iukrqzwaa3a + ekerpuucve0a + kaltwjjs2a + uyulwxmbmf1a + "qwxKPyZD" + eqSbxIm + urYfaBU + RzCdRmW + LdbpiHO + UfPIZTI + JJeAzns + pZKXHXl + RJBRoBH + "");
    }

    //垃圾方法
    private void AVKNcdtQ(boolean zwnfdhhu0, byte xxnrnrq1, float bvnzkhlcq2) {
        float bvnzkhlcq2a = bvnzkhlcq2;
        byte xxnrnrq1a = xxnrnrq1;
        boolean zwnfdhhu0a = zwnfdhhu0;
        new WeakReference("AVKNcdtQ" + zwnfdhhu0a + xxnrnrq1a + bvnzkhlcq2a + "AVKNcdtQ" + urYfaBU + UfPIZTI + RzCdRmW + eqSbxIm + LdbpiHO + RJBRoBH + JJeAzns + pZKXHXl + "");
    }

    public String getLastReportToken() {
        float bvnzkhlcq2 = 38.38f;
        byte xxnrnrq1 = 74;
        boolean zwnfdhhu0 = true;
        double iukrqzwaa3 = 66.66;
        double kaltwjjs2 = 44.44;
        long uyulwxmbmf1 = 80L;
        boolean ekerpuucve0 = false;
        byte ofrkkwjnuf0 = 3;
        long ffzqmuaba4 = 55L;
        long mifudnxnaw3 = 87L;
        short zkgujtlabm2 = 43;
        short wbvhlgelwg1 = 49;
        boolean asookpsjaf0 = false;
        qwxKPyZD(ekerpuucve0, uyulwxmbmf1, kaltwjjs2, iukrqzwaa3);
        QKDspGut(ofrkkwjnuf0);
        adOwUSJj(asookpsjaf0, wbvhlgelwg1, zkgujtlabm2, mifudnxnaw3, ffzqmuaba4);
        AVKNcdtQ(zwnfdhhu0, xxnrnrq1, bvnzkhlcq2);
        AVKNcdtQ(zwnfdhhu0, xxnrnrq1, bvnzkhlcq2);
        qwxKPyZD(ekerpuucve0, uyulwxmbmf1, kaltwjjs2, iukrqzwaa3);
        qwxKPyZD(ekerpuucve0, uyulwxmbmf1, kaltwjjs2, iukrqzwaa3);
        AVKNcdtQ(zwnfdhhu0, xxnrnrq1, bvnzkhlcq2);
        return SpeedSPUtils.getString("fcm_token_xxx", "");
    }

    //垃圾方法
    private void CQdLlJsY(long ivghfap0, float lgalgxsr1, boolean twsghxin2, boolean jxfviedor3) {
        boolean jxfviedor3a = jxfviedor3;
        boolean twsghxin2a = twsghxin2;
        float lgalgxsr1a = lgalgxsr1;
        long ivghfap0a = ivghfap0;
        new StringBuffer("CQdLlJsY" + lgalgxsr1a + twsghxin2a + ivghfap0a + jxfviedor3a + "CQdLlJsY" + LdbpiHO + urYfaBU + pZKXHXl + JJeAzns + RJBRoBH + UfPIZTI + RzCdRmW + eqSbxIm + "");
    }

    //垃圾方法
    private void DGkbuiac(boolean fculllxagg0, double yoavpqva1, float gpiqxdbxx2, long tkavoqsfp3) {
        long tkavoqsfp3a = tkavoqsfp3;
        float gpiqxdbxx2a = gpiqxdbxx2;
        double yoavpqva1a = yoavpqva1;
        boolean fculllxagg0a = fculllxagg0;
        new String("DGkbuiac" + tkavoqsfp3a + fculllxagg0a + gpiqxdbxx2a + yoavpqva1a + "DGkbuiac" + RzCdRmW + LdbpiHO + JJeAzns + pZKXHXl + eqSbxIm + UfPIZTI + RJBRoBH + urYfaBU + "");
    }

    //垃圾方法
    private void znVGmpbt(int frunrbynqs0, short eqqqrbqge1, double wfhyvtao2, double iulgbkafnw3) {
        double iulgbkafnw3a = iulgbkafnw3;
        double wfhyvtao2a = wfhyvtao2;
        short eqqqrbqge1a = eqqqrbqge1;
        int frunrbynqs0a = frunrbynqs0;
        new String("znVGmpbt" + eqqqrbqge1a + iulgbkafnw3a + frunrbynqs0a + wfhyvtao2a + "znVGmpbt" + JJeAzns + pZKXHXl + RzCdRmW + RJBRoBH + urYfaBU + eqSbxIm + LdbpiHO + UfPIZTI + "");
    }

    //垃圾方法
    private void VaPKLShS(char qytczwvnzl0, double sncmnkd1, boolean ojmhftxtpa2) {
        boolean ojmhftxtpa2a = ojmhftxtpa2;
        double sncmnkd1a = sncmnkd1;
        char qytczwvnzl0a = qytczwvnzl0;
    }

    private String getLastReportCountry() {
        boolean ojmhftxtpa2 = true;
        double sncmnkd1 = 28.28;
        char qytczwvnzl0 = 0;
        double iulgbkafnw3 = 68.68;
        double wfhyvtao2 = 31.31;
        short eqqqrbqge1 = 37;
        int frunrbynqs0 = 42;
        long tkavoqsfp3 = 23L;
        float gpiqxdbxx2 = 84.84f;
        double yoavpqva1 = 46.46;
        boolean fculllxagg0 = true;
        boolean jxfviedor3 = true;
        boolean twsghxin2 = true;
        float lgalgxsr1 = 40.40f;
        long ivghfap0 = 12L;
        DGkbuiac(fculllxagg0, yoavpqva1, gpiqxdbxx2, tkavoqsfp3);
        DGkbuiac(fculllxagg0, yoavpqva1, gpiqxdbxx2, tkavoqsfp3);
        CQdLlJsY(ivghfap0, lgalgxsr1, twsghxin2, jxfviedor3);
        return SpeedSPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {

        //垃圾变量
        private int EjpTVaF = 94;

        boolean device;

        //垃圾变量
        private char YaYluvP = 82;

        String token;

        //垃圾变量
        private int kwNExsT = 62;

        String country;

        public BindCallback(SpeedMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        //垃圾方法
        private void BsYloRBp(short lmhxfql0, int ldugcmks1) {
            int ldugcmks1a = ldugcmks1;
            short lmhxfql0a = lmhxfql0;
            Log.i("BsYloRBp", "BsYloRBp" + lmhxfql0a + ldugcmks1a + "BsYloRBp" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void gDztWmqS(byte bsynyuvb0, int fhbxgbisn1, boolean ujsxdgu2, char bucmkeiw3, byte lynngsylvs4) {
            byte lynngsylvs4a = lynngsylvs4;
            char bucmkeiw3a = bucmkeiw3;
            boolean ujsxdgu2a = ujsxdgu2;
            int fhbxgbisn1a = fhbxgbisn1;
            byte bsynyuvb0a = bsynyuvb0;
            new Intent("gDztWmqS" + bsynyuvb0a + fhbxgbisn1a + lynngsylvs4a + bucmkeiw3a + ujsxdgu2a + "gDztWmqS" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void yOAJSdcL(float mgiydif0, double dtblmeu1) {
            double dtblmeu1a = dtblmeu1;
            float mgiydif0a = mgiydif0;
            new WeakReference("yOAJSdcL" + mgiydif0a + dtblmeu1a + "yOAJSdcL" + EjpTVaF + kwNExsT + YaYluvP + "");
        }

        //垃圾方法
        private void fdbiXrOi(short cbviqsiv0, double qowybjqh1, long fwogyuzx2, int xmrjvyop3) {
            int xmrjvyop3a = xmrjvyop3;
            long fwogyuzx2a = fwogyuzx2;
            double qowybjqh1a = qowybjqh1;
            short cbviqsiv0a = cbviqsiv0;
            Log.i("fdbiXrOi", "fdbiXrOi" + qowybjqh1a + fwogyuzx2a + cbviqsiv0a + xmrjvyop3a + "fdbiXrOi" + kwNExsT + YaYluvP + EjpTVaF + "");
        }

        //垃圾方法
        private void dLkUnPyG(double aimntlruy0) {
            double aimntlruy0a = aimntlruy0;
            TextUtils.isEmpty("dLkUnPyG" + aimntlruy0a + "dLkUnPyG" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void muYGQmrn(float cvsqcgqin0, char wyxzypm1, byte ilkpfmt2, boolean kzeyiwyknm3) {
            boolean kzeyiwyknm3a = kzeyiwyknm3;
            byte ilkpfmt2a = ilkpfmt2;
            char wyxzypm1a = wyxzypm1;
            float cvsqcgqin0a = cvsqcgqin0;
            Log.i("muYGQmrn", "muYGQmrn" + ilkpfmt2a + wyxzypm1a + kzeyiwyknm3a + cvsqcgqin0a + "muYGQmrn" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void ncMABjsN(boolean sqbqzddt0, char npkoycyn1) {
            char npkoycyn1a = npkoycyn1;
            boolean sqbqzddt0a = sqbqzddt0;
            new Intent("ncMABjsN" + sqbqzddt0a + npkoycyn1a + "ncMABjsN" + kwNExsT + EjpTVaF + YaYluvP + "");
        }

        //垃圾方法
        private void vHvWpoRs(short sygwjawarp0, byte cubbosl1) {
            byte cubbosl1a = cubbosl1;
            short sygwjawarp0a = sygwjawarp0;
            new Thread("vHvWpoRs" + cubbosl1a + sygwjawarp0a + "vHvWpoRs" + EjpTVaF + kwNExsT + YaYluvP + "");
        }

        //垃圾方法
        private void HwzplptZ(char gxpndvbk0, long eeidknrw1, long mgnopmsz2, byte cdbrbsaf3) {
            byte cdbrbsaf3a = cdbrbsaf3;
            long mgnopmsz2a = mgnopmsz2;
            long eeidknrw1a = eeidknrw1;
            char gxpndvbk0a = gxpndvbk0;
            TextUtils.isEmpty("HwzplptZ" + mgnopmsz2a + eeidknrw1a + gxpndvbk0a + cdbrbsaf3a + "HwzplptZ" + kwNExsT + YaYluvP + EjpTVaF + "");
        }

        //垃圾方法
        private void RPHDkPgW(byte qhesqhxt0, double ucjhexvdtu1) {
            double ucjhexvdtu1a = ucjhexvdtu1;
            byte qhesqhxt0a = qhesqhxt0;
            new File("RPHDkPgW" + qhesqhxt0a + ucjhexvdtu1a + "RPHDkPgW" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void UTOGeNtL(double ifaiaqrzso0, short nkjrgflkh1, int hzfoghw2, long jootzkxz3) {
            long jootzkxz3a = jootzkxz3;
            int hzfoghw2a = hzfoghw2;
            short nkjrgflkh1a = nkjrgflkh1;
            double ifaiaqrzso0a = ifaiaqrzso0;
            new Intent("UTOGeNtL" + jootzkxz3a + nkjrgflkh1a + ifaiaqrzso0a + hzfoghw2a + "UTOGeNtL" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void qumLbKgI(long skiafelb0, double htmhxgyoe1) {
            double htmhxgyoe1a = htmhxgyoe1;
            long skiafelb0a = skiafelb0;
            new String("qumLbKgI" + skiafelb0a + htmhxgyoe1a + "qumLbKgI" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void gpilBZrC(float egqyprpygl0, int kklonrsyj1, short otuyeehpz2, boolean nqtrkkbm3) {
            boolean nqtrkkbm3a = nqtrkkbm3;
            short otuyeehpz2a = otuyeehpz2;
            int kklonrsyj1a = kklonrsyj1;
            float egqyprpygl0a = egqyprpygl0;
            new StringReader("gpilBZrC" + nqtrkkbm3a + egqyprpygl0a + otuyeehpz2a + kklonrsyj1a + "gpilBZrC" + EjpTVaF + kwNExsT + YaYluvP + "");
        }

        //垃圾方法
        private void ENYQHzoU(short lxevnqfg0, char hufxpmap1) {
            char hufxpmap1a = hufxpmap1;
            short lxevnqfg0a = lxevnqfg0;
            Log.i("ENYQHzoU", "ENYQHzoU" + lxevnqfg0a + hufxpmap1a + "ENYQHzoU" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void RVXAsGyD(short jyzkhfwi0, boolean zdncjdtl1, char qheoarpc2, byte qtgtcfk3, int nrqcwtao4) {
            int nrqcwtao4a = nrqcwtao4;
            byte qtgtcfk3a = qtgtcfk3;
            char qheoarpc2a = qheoarpc2;
            boolean zdncjdtl1a = zdncjdtl1;
            short jyzkhfwi0a = jyzkhfwi0;
        }

        //垃圾方法
        private void keXDryAi(char miejouxo0, byte xvvjetg1) {
            byte xvvjetg1a = xvvjetg1;
            char miejouxo0a = miejouxo0;
            new StringBuffer("keXDryAi" + xvvjetg1a + miejouxo0a + "keXDryAi" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void UsylispQ(long ftheuhkk0, double wxkwhju1, double qocafcazue2) {
            double qocafcazue2a = qocafcazue2;
            double wxkwhju1a = wxkwhju1;
            long ftheuhkk0a = ftheuhkk0;
            new StringBuilder("UsylispQ" + qocafcazue2a + ftheuhkk0a + wxkwhju1a + "UsylispQ" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void EjaxZMTH(double plobuhotg0, short vibwqbkf1, int yjwwmon2) {
            int yjwwmon2a = yjwwmon2;
            short vibwqbkf1a = vibwqbkf1;
            double plobuhotg0a = plobuhotg0;
            new AttributedString("EjaxZMTH" + yjwwmon2a + vibwqbkf1a + plobuhotg0a + "EjaxZMTH" + kwNExsT + EjpTVaF + YaYluvP + "");
        }

        //垃圾方法
        private void FskrmBJh(short vjggmzcw0, char pnwjhsnxb1, float gtllcfcw2, float fchtvaqq3) {
            float fchtvaqq3a = fchtvaqq3;
            float gtllcfcw2a = gtllcfcw2;
            char pnwjhsnxb1a = pnwjhsnxb1;
            short vjggmzcw0a = vjggmzcw0;
            new StringBuilder("FskrmBJh" + vjggmzcw0a + pnwjhsnxb1a + gtllcfcw2a + fchtvaqq3a + "FskrmBJh" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void BKCFXUhp(byte mcrclfw0) {
            byte mcrclfw0a = mcrclfw0;
            new Intent("BKCFXUhp" + mcrclfw0a + "BKCFXUhp" + EjpTVaF + kwNExsT + YaYluvP + "");
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            byte mcrclfw0 = 31;
            float fchtvaqq3 = 84.84f;
            float gtllcfcw2 = 93.93f;
            char pnwjhsnxb1 = 60;
            short vjggmzcw0 = 1;
            int yjwwmon2 = 4;
            short vibwqbkf1 = 81;
            double plobuhotg0 = 32.32;
            double qocafcazue2 = 91.91;
            double wxkwhju1 = 100.100;
            long ftheuhkk0 = 14L;
            byte xvvjetg1 = 71;
            char miejouxo0 = 65;
            int nrqcwtao4 = 2;
            byte qtgtcfk3 = 4;
            char qheoarpc2 = 57;
            boolean zdncjdtl1 = false;
            short jyzkhfwi0 = 76;
            char hufxpmap1 = 86;
            short lxevnqfg0 = 43;
            boolean nqtrkkbm3 = true;
            short otuyeehpz2 = 37;
            int kklonrsyj1 = 3;
            float egqyprpygl0 = 8.8f;
            double htmhxgyoe1 = 27.27;
            long skiafelb0 = 46L;
            long jootzkxz3 = 75L;
            int hzfoghw2 = 42;
            short nkjrgflkh1 = 47;
            double ifaiaqrzso0 = 81.81;
            double ucjhexvdtu1 = 27.27;
            byte qhesqhxt0 = 49;
            byte cdbrbsaf3 = 67;
            long mgnopmsz2 = 45L;
            long eeidknrw1 = 26L;
            char gxpndvbk0 = 18;
            byte cubbosl1 = 29;
            short sygwjawarp0 = 55;
            char npkoycyn1 = 59;
            boolean sqbqzddt0 = false;
            boolean kzeyiwyknm3 = true;
            byte ilkpfmt2 = 4;
            char wyxzypm1 = 43;
            float cvsqcgqin0 = 44.44f;
            double aimntlruy0 = 52.52;
            int xmrjvyop3 = 96;
            long fwogyuzx2 = 69L;
            double qowybjqh1 = 0.0;
            short cbviqsiv0 = 87;
            double dtblmeu1 = 20.20;
            float mgiydif0 = 90.90f;
            byte lynngsylvs4 = 43;
            char bucmkeiw3 = 23;
            boolean ujsxdgu2 = true;
            int fhbxgbisn1 = 25;
            byte bsynyuvb0 = 90;
            int ldugcmks1 = 55;
            short lmhxfql0 = 21;
            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            EjaxZMTH(plobuhotg0, vibwqbkf1, yjwwmon2);
            HwzplptZ(gxpndvbk0, eeidknrw1, mgnopmsz2, cdbrbsaf3);
            ncMABjsN(sqbqzddt0, npkoycyn1);
            HwzplptZ(gxpndvbk0, eeidknrw1, mgnopmsz2, cdbrbsaf3);
            EjaxZMTH(plobuhotg0, vibwqbkf1, yjwwmon2);
            Bundle bundle = new Bundle();
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            vHvWpoRs(sygwjawarp0, cubbosl1);
            muYGQmrn(cvsqcgqin0, wyxzypm1, ilkpfmt2, kzeyiwyknm3);
            yOAJSdcL(mgiydif0, dtblmeu1);
            RPHDkPgW(qhesqhxt0, ucjhexvdtu1);
            ncMABjsN(sqbqzddt0, npkoycyn1);
            HwzplptZ(gxpndvbk0, eeidknrw1, mgnopmsz2, cdbrbsaf3);
            keXDryAi(miejouxo0, xvvjetg1);
            UTOGeNtL(ifaiaqrzso0, nkjrgflkh1, hzfoghw2, jootzkxz3);
            if (response.isSuccessful()) {
                SpeedSPUtils.putString("fcm_token_xxx", this.token);
                SpeedSPUtils.putString("fcm_country_xxx", this.country);
            }
            isBindingDevice = false;
        }

        //垃圾方法
        private void raImAUih(int whdmnofg0, short imdupva1) {
            short imdupva1a = imdupva1;
            int whdmnofg0a = whdmnofg0;
            new StringReader("raImAUih" + whdmnofg0a + imdupva1a + "raImAUih" + kwNExsT + YaYluvP + EjpTVaF + "");
        }

        //垃圾方法
        private void bJnIWlWM(byte wvutmioiyv0, byte dtdkfydiax1, int gjcoxdrm2) {
            int gjcoxdrm2a = gjcoxdrm2;
            byte dtdkfydiax1a = dtdkfydiax1;
            byte wvutmioiyv0a = wvutmioiyv0;
            new Intent("bJnIWlWM" + wvutmioiyv0a + dtdkfydiax1a + gjcoxdrm2a + "bJnIWlWM" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void pMnrESqb(boolean fgbjqigrrn0, short lgzwewyuc1, float wajsuck2) {
            float wajsuck2a = wajsuck2;
            short lgzwewyuc1a = lgzwewyuc1;
            boolean fgbjqigrrn0a = fgbjqigrrn0;
            new Thread("pMnrESqb" + lgzwewyuc1a + fgbjqigrrn0a + wajsuck2a + "pMnrESqb" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void HkwVPozD(byte tswcxraju0, double jrwkcmmgsj1) {
            double jrwkcmmgsj1a = jrwkcmmgsj1;
            byte tswcxraju0a = tswcxraju0;
            new StringBuffer("HkwVPozD" + jrwkcmmgsj1a + tswcxraju0a + "HkwVPozD" + YaYluvP + EjpTVaF + kwNExsT + "");
        }

        //垃圾方法
        private void TmDrXIcC(char knzqmzzdz0, byte ygpcnltnh1, short umthrwx2, byte mkdemmi3) {
            byte mkdemmi3a = mkdemmi3;
            short umthrwx2a = umthrwx2;
            byte ygpcnltnh1a = ygpcnltnh1;
            char knzqmzzdz0a = knzqmzzdz0;
            TextUtils.isDigitsOnly("TmDrXIcC" + knzqmzzdz0a + ygpcnltnh1a + mkdemmi3a + umthrwx2a + "TmDrXIcC" + EjpTVaF + YaYluvP + kwNExsT + "");
        }

        //垃圾方法
        private void wVhyfrOL(byte fjqzpdlo0, long mnozrlve1, long fibrmed2, byte cqognvgyh3, float njxioinxk4) {
            float njxioinxk4a = njxioinxk4;
            byte cqognvgyh3a = cqognvgyh3;
            long fibrmed2a = fibrmed2;
            long mnozrlve1a = mnozrlve1;
            byte fjqzpdlo0a = fjqzpdlo0;
            new Thread("wVhyfrOL" + mnozrlve1a + fjqzpdlo0a + njxioinxk4a + fibrmed2a + cqognvgyh3a + "wVhyfrOL" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        //垃圾方法
        private void VJCsHNni(boolean yzsqjnny0, byte fguqdqh1) {
            byte fguqdqh1a = fguqdqh1;
            boolean yzsqjnny0a = yzsqjnny0;
            new StringBuffer("VJCsHNni" + yzsqjnny0a + fguqdqh1a + "VJCsHNni" + kwNExsT + YaYluvP + EjpTVaF + "");
        }

        //垃圾方法
        private void rDonWcQg(int prxxyqdn0) {
            int prxxyqdn0a = prxxyqdn0;
            new String("rDonWcQg" + prxxyqdn0a + "rDonWcQg" + YaYluvP + kwNExsT + EjpTVaF + "");
        }

        public void onFailure(Call<ResponseBody> call, Throwable t) {
            int prxxyqdn0 = 43;
            byte fguqdqh1 = 25;
            boolean yzsqjnny0 = false;
            float njxioinxk4 = 41.41f;
            byte cqognvgyh3 = 39;
            long fibrmed2 = 87L;
            long mnozrlve1 = 6L;
            byte fjqzpdlo0 = 18;
            byte mkdemmi3 = 63;
            short umthrwx2 = 30;
            byte ygpcnltnh1 = 5;
            char knzqmzzdz0 = 36;
            double jrwkcmmgsj1 = 52.52;
            byte tswcxraju0 = 61;
            float wajsuck2 = 94.94f;
            short lgzwewyuc1 = 50;
            boolean fgbjqigrrn0 = false;
            int gjcoxdrm2 = 100;
            byte dtdkfydiax1 = 41;
            byte wvutmioiyv0 = 23;
            short imdupva1 = 99;
            int whdmnofg0 = 35;
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            isBindingDevice = false;
        }
    }

    //垃圾变量
    private boolean LdbpiHO = true;

    //垃圾变量
    private float fuzzbcD = 13.13f;

    //垃圾变量
    private boolean urYfaBU = false;

    //垃圾变量
    private byte NRzJYJv = 79;

    //垃圾变量
    private char JJeAzns = 48;

    //垃圾变量
    private long NaePRAs = 39L;

    //垃圾变量
    private double pZKXHXl = 85.85;

    //垃圾变量
    private float EOFVrQq = 80.80f;

    //垃圾变量
    private boolean eqSbxIm = false;

    //垃圾变量
    private int uFlWWRw = 46;

    //垃圾方法
    private void GyvqcqhK(long drrbcigdfs0) {
        long drrbcigdfs0a = drrbcigdfs0;
        System.out.println("GyvqcqhK" + drrbcigdfs0a + "GyvqcqhK" + JJeAzns + LdbpiHO + RzCdRmW + UfPIZTI + urYfaBU + pZKXHXl + RJBRoBH + eqSbxIm + "");
    }

    //垃圾方法
    private void LchBdvly(short ibgxshar0, char opgzrtgoqg1, double xnmqtufsn2, char cioxvwvu3) {
        char cioxvwvu3a = cioxvwvu3;
        double xnmqtufsn2a = xnmqtufsn2;
        char opgzrtgoqg1a = opgzrtgoqg1;
        short ibgxshar0a = ibgxshar0;
        System.out.println("LchBdvly" + xnmqtufsn2a + ibgxshar0a + opgzrtgoqg1a + cioxvwvu3a + "LchBdvly" + LdbpiHO + JJeAzns + pZKXHXl + eqSbxIm + urYfaBU + RzCdRmW + RJBRoBH + UfPIZTI + "");
    }

    //垃圾方法
    private void AMdDmyGA(boolean rignnmgrqf0, double fsoejen1) {
        double fsoejen1a = fsoejen1;
        boolean rignnmgrqf0a = rignnmgrqf0;
        new File("AMdDmyGA" + rignnmgrqf0a + fsoejen1a + "AMdDmyGA" + LdbpiHO + eqSbxIm + JJeAzns + RJBRoBH + urYfaBU + UfPIZTI + RzCdRmW + pZKXHXl + "");
    }

    //垃圾方法
    private void yvmUbDTo(double houpgljy0, double obhqasbgt1) {
        double obhqasbgt1a = obhqasbgt1;
        double houpgljy0a = houpgljy0;
        System.out.println("yvmUbDTo" + obhqasbgt1a + houpgljy0a + "yvmUbDTo" + RJBRoBH + eqSbxIm + pZKXHXl + JJeAzns + UfPIZTI + urYfaBU + LdbpiHO + RzCdRmW + "");
    }

    //垃圾方法
    private void fuuHPAiK(char idunrir0, boolean bybdban1) {
        boolean bybdban1a = bybdban1;
        char idunrir0a = idunrir0;
        Log.i("fuuHPAiK", "fuuHPAiK" + bybdban1a + idunrir0a + "fuuHPAiK" + pZKXHXl + UfPIZTI + RJBRoBH + RzCdRmW + eqSbxIm + LdbpiHO + JJeAzns + urYfaBU + "");
    }

    //垃圾方法
    private void mqeXTJZD(long efzwxbl0, double pnexnmbm1, long pjjujcxfl2) {
        long pjjujcxfl2a = pjjujcxfl2;
        double pnexnmbm1a = pnexnmbm1;
        long efzwxbl0a = efzwxbl0;
        Log.e("mqeXTJZD", "mqeXTJZD" + pnexnmbm1a + efzwxbl0a + pjjujcxfl2a + "mqeXTJZD" + UfPIZTI + pZKXHXl + JJeAzns + RzCdRmW + LdbpiHO + urYfaBU + RJBRoBH + eqSbxIm + "");
    }

    //垃圾方法
    private void UxlqEXyX(char ymqupdis0, short bboopoynv1, float pcubzkmo2, boolean fquyaveasz3) {
        boolean fquyaveasz3a = fquyaveasz3;
        float pcubzkmo2a = pcubzkmo2;
        short bboopoynv1a = bboopoynv1;
        char ymqupdis0a = ymqupdis0;
        Log.w("UxlqEXyX", "UxlqEXyX" + pcubzkmo2a + bboopoynv1a + ymqupdis0a + fquyaveasz3a + "UxlqEXyX" + RJBRoBH + UfPIZTI + RzCdRmW + pZKXHXl + eqSbxIm + LdbpiHO + urYfaBU + JJeAzns + "");
    }

    //垃圾方法
    private void FJChdDfr(int lkhepukjbr0) {
        int lkhepukjbr0a = lkhepukjbr0;
        TextUtils.isEmpty("FJChdDfr" + lkhepukjbr0a + "FJChdDfr" + RzCdRmW + urYfaBU + LdbpiHO + eqSbxIm + pZKXHXl + UfPIZTI + JJeAzns + RJBRoBH + "");
    }

    public String toString() {
        int lkhepukjbr0 = 2;
        boolean fquyaveasz3 = true;
        float pcubzkmo2 = 82.82f;
        short bboopoynv1 = 67;
        char ymqupdis0 = 82;
        long pjjujcxfl2 = 86L;
        double pnexnmbm1 = 68.68;
        long efzwxbl0 = 69L;
        boolean bybdban1 = true;
        char idunrir0 = 50;
        double obhqasbgt1 = 84.84;
        double houpgljy0 = 99.99;
        double fsoejen1 = 62.62;
        boolean rignnmgrqf0 = true;
        char cioxvwvu3 = 67;
        double xnmqtufsn2 = 45.45;
        char opgzrtgoqg1 = 33;
        short ibgxshar0 = 37;
        long drrbcigdfs0 = 30L;
        GyvqcqhK(drrbcigdfs0);
        yvmUbDTo(houpgljy0, obhqasbgt1);
        yvmUbDTo(houpgljy0, obhqasbgt1);
        LchBdvly(ibgxshar0, opgzrtgoqg1, xnmqtufsn2, cioxvwvu3);
        mqeXTJZD(efzwxbl0, pnexnmbm1, pjjujcxfl2);
        fuuHPAiK(idunrir0, bybdban1);
        mqeXTJZD(efzwxbl0, pnexnmbm1, pjjujcxfl2);
        yvmUbDTo(houpgljy0, obhqasbgt1);
        yvmUbDTo(houpgljy0, obhqasbgt1);
        mqeXTJZD(efzwxbl0, pnexnmbm1, pjjujcxfl2);
        TextUtils.isDigitsOnly("" + NRzJYJv + EOFVrQq + uFlWWRw + NaePRAs + fuzzbcD + "");
        return super.toString();
    }
}
