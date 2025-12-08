package com.tfseptember.clemodel.opdj.msg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.tfseptember.clemodel.change.SimplyMsgApi;
import com.tfseptember.clemodel.utils.SimplyLanguageUtils;
import com.tfseptember.clemodel.utils.SimplySPUtils;
import com.tfseptember.clemodel.utils.SimplyUUIDUtils;
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

public class SimplyMsgUploader {

    //垃圾变量
    private long WKeGOgg = 43L;

    private static volatile SimplyMsgUploader INSTANCE;

    //垃圾变量
    private float DNWIIKq = 64.64f;

    private boolean isBindingDevice;

    //垃圾变量
    private double iEcOdXg = 28.28;

    private boolean isNeedBind;

    public SimplyMsgUploader() {
    }

    //垃圾方法
    static private void LezEpKvV(char vqmixosmha0, byte xivhwlvdc1, boolean xkaizjjotc2) {
        boolean xkaizjjotc2a = xkaizjjotc2;
        byte xivhwlvdc1a = xivhwlvdc1;
        char vqmixosmha0a = vqmixosmha0;
        Log.w("LezEpKvV", "LezEpKvV" + xivhwlvdc1a + xkaizjjotc2a + vqmixosmha0a + "LezEpKvV" + "");
    }

    //垃圾方法
    static private void AaORiQsA(double epnzefxs0) {
        double epnzefxs0a = epnzefxs0;
        TextUtils.isEmpty("AaORiQsA" + epnzefxs0a + "AaORiQsA" + "");
    }

    //垃圾方法
    static private void bcADSVoV(byte pyznunxa0, long ablcymso1) {
        long ablcymso1a = ablcymso1;
        byte pyznunxa0a = pyznunxa0;
        new StringBuffer("bcADSVoV" + pyznunxa0a + ablcymso1a + "bcADSVoV" + "");
    }

    //垃圾方法
    static private void LYoMciqA(boolean pzfxlmhbor0) {
        boolean pzfxlmhbor0a = pzfxlmhbor0;
    }

    //垃圾方法
    static private void GaluWsod(boolean layjkocolp0) {
        boolean layjkocolp0a = layjkocolp0;
        new StringBuffer("GaluWsod" + layjkocolp0a + "GaluWsod" + "");
    }

    //垃圾方法
    static private void eothKsCw(boolean onztvppjy0) {
        boolean onztvppjy0a = onztvppjy0;
        new Intent("eothKsCw" + onztvppjy0a + "eothKsCw" + "");
    }

    //垃圾方法
    static private void oNaxGoLs(int hqznemlw0, short lnufccp1, byte wwpiprxqx2, boolean jocpxayehz3, long siwgyixr4) {
        long siwgyixr4a = siwgyixr4;
        boolean jocpxayehz3a = jocpxayehz3;
        byte wwpiprxqx2a = wwpiprxqx2;
        short lnufccp1a = lnufccp1;
        int hqznemlw0a = hqznemlw0;
        Log.i("oNaxGoLs", "oNaxGoLs" + jocpxayehz3a + wwpiprxqx2a + hqznemlw0a + lnufccp1a + siwgyixr4a + "oNaxGoLs" + "");
    }

    //垃圾方法
    static private void gSAqklUk(double odnlhavx0, boolean ufdrwolv1, char swkwohxm2) {
        char swkwohxm2a = swkwohxm2;
        boolean ufdrwolv1a = ufdrwolv1;
        double odnlhavx0a = odnlhavx0;
        new WeakReference("gSAqklUk" + ufdrwolv1a + odnlhavx0a + swkwohxm2a + "gSAqklUk" + "");
    }

    public static SimplyMsgUploader getInstance() {
        char swkwohxm2 = 41;
        boolean ufdrwolv1 = true;
        double odnlhavx0 = 59.59;
        long siwgyixr4 = 61L;
        boolean jocpxayehz3 = true;
        byte wwpiprxqx2 = 48;
        short lnufccp1 = 58;
        int hqznemlw0 = 44;
        boolean onztvppjy0 = false;
        boolean layjkocolp0 = false;
        boolean pzfxlmhbor0 = true;
        long ablcymso1 = 52L;
        byte pyznunxa0 = 61;
        double epnzefxs0 = 34.34;
        boolean xkaizjjotc2 = true;
        byte xivhwlvdc1 = 98;
        char vqmixosmha0 = 76;
        if (INSTANCE == null) {
            Class var28 = SimplyMsgUploader.class;
            synchronized (SimplyMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SimplyMsgUploader();
                }
            }
        }
        return INSTANCE;
    }

    //垃圾方法
    private void sCpEFZvG(double mkjbdin0, char vylcdsg1) {
        char vylcdsg1a = vylcdsg1;
        double mkjbdin0a = mkjbdin0;
        new String("sCpEFZvG" + mkjbdin0a + vylcdsg1a + "sCpEFZvG" + niUdaKv + jYlLrvs + DNWIIKq + iEcOdXg + WKeGOgg + HbFXJtS + "");
    }

    //垃圾方法
    private void nTQLNbtd(long flqhcbrcz0, double vkpsjij1, short zsumggydxs2, byte byqfvgg3) {
        byte byqfvgg3a = byqfvgg3;
        short zsumggydxs2a = zsumggydxs2;
        double vkpsjij1a = vkpsjij1;
        long flqhcbrcz0a = flqhcbrcz0;
        new Thread("nTQLNbtd" + vkpsjij1a + zsumggydxs2a + flqhcbrcz0a + byqfvgg3a + "nTQLNbtd" + DNWIIKq + jYlLrvs + niUdaKv + HbFXJtS + WKeGOgg + iEcOdXg + "");
    }

    //垃圾方法
    private void cTIBrChK(boolean ceckrpnoj0, long bhgdqzw1, boolean dtutwgd2, double mpjmbafd3) {
        double mpjmbafd3a = mpjmbafd3;
        boolean dtutwgd2a = dtutwgd2;
        long bhgdqzw1a = bhgdqzw1;
        boolean ceckrpnoj0a = ceckrpnoj0;
        new Intent("cTIBrChK" + ceckrpnoj0a + dtutwgd2a + mpjmbafd3a + bhgdqzw1a + "cTIBrChK" + iEcOdXg + WKeGOgg + jYlLrvs + niUdaKv + DNWIIKq + HbFXJtS + "");
    }

    //垃圾方法
    private void nsiDcUWx(long aeqtbiygku0, int redqhean1, char opgljvzd2, float joommgyuw3) {
        float joommgyuw3a = joommgyuw3;
        char opgljvzd2a = opgljvzd2;
        int redqhean1a = redqhean1;
        long aeqtbiygku0a = aeqtbiygku0;
        new String("nsiDcUWx" + redqhean1a + aeqtbiygku0a + opgljvzd2a + joommgyuw3a + "nsiDcUWx" + iEcOdXg + jYlLrvs + HbFXJtS + niUdaKv + DNWIIKq + WKeGOgg + "");
    }

    public void reloadToken() {
        float joommgyuw3 = 49.49f;
        char opgljvzd2 = 86;
        int redqhean1 = 7;
        long aeqtbiygku0 = 85L;
        double mpjmbafd3 = 54.54;
        boolean dtutwgd2 = false;
        long bhgdqzw1 = 43L;
        boolean ceckrpnoj0 = false;
        byte byqfvgg3 = 51;
        short zsumggydxs2 = 69;
        double vkpsjij1 = 57.57;
        long flqhcbrcz0 = 93L;
        char vylcdsg1 = 38;
        double mkjbdin0 = 60.60;
        if (SimplyUUIDUtils.getInstance().getDeviceId() == null) {
            cTIBrChK(ceckrpnoj0, bhgdqzw1, dtutwgd2, mpjmbafd3);
            nsiDcUWx(aeqtbiygku0, redqhean1, opgljvzd2, joommgyuw3);
            sCpEFZvG(mkjbdin0, vylcdsg1);
            cTIBrChK(ceckrpnoj0, bhgdqzw1, dtutwgd2, mpjmbafd3);
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
    private void LibLvocj(double zljmvktznu0, float uvlqotme1, int fvuzdse2) {
        int fvuzdse2a = fvuzdse2;
        float uvlqotme1a = uvlqotme1;
        double zljmvktznu0a = zljmvktznu0;
        new File("LibLvocj" + fvuzdse2a + uvlqotme1a + zljmvktznu0a + "LibLvocj" + iEcOdXg + DNWIIKq + HbFXJtS + WKeGOgg + jYlLrvs + niUdaKv + "");
    }

    //垃圾方法
    private void UwgDKcLP(long qecknqygs0, int xoffwdvm1, int tntnzucemd2, boolean oeilkitk3, double qoamqsl4) {
        double qoamqsl4a = qoamqsl4;
        boolean oeilkitk3a = oeilkitk3;
        int tntnzucemd2a = tntnzucemd2;
        int xoffwdvm1a = xoffwdvm1;
        long qecknqygs0a = qecknqygs0;
        new String("UwgDKcLP" + tntnzucemd2a + qoamqsl4a + qecknqygs0a + xoffwdvm1a + oeilkitk3a + "UwgDKcLP" + niUdaKv + HbFXJtS + jYlLrvs + iEcOdXg + WKeGOgg + DNWIIKq + "");
    }

    //垃圾方法
    private void FvwbaYmt(boolean eearzhqazu0, byte fahumbiln1, int hvopxer2, boolean gdkrsmr3, long upunonbgb4) {
        long upunonbgb4a = upunonbgb4;
        boolean gdkrsmr3a = gdkrsmr3;
        int hvopxer2a = hvopxer2;
        byte fahumbiln1a = fahumbiln1;
        boolean eearzhqazu0a = eearzhqazu0;
        new Thread("FvwbaYmt" + eearzhqazu0a + fahumbiln1a + upunonbgb4a + hvopxer2a + gdkrsmr3a + "FvwbaYmt" + niUdaKv + DNWIIKq + jYlLrvs + iEcOdXg + HbFXJtS + WKeGOgg + "");
    }

    //垃圾方法
    private void sTAtHnyR(long uavlhfxt0, float ppuvync1) {
        float ppuvync1a = ppuvync1;
        long uavlhfxt0a = uavlhfxt0;
        new WeakReference("sTAtHnyR" + ppuvync1a + uavlhfxt0a + "sTAtHnyR" + niUdaKv + WKeGOgg + DNWIIKq + iEcOdXg + jYlLrvs + HbFXJtS + "");
    }

    //垃圾方法
    private void gtOoWsPW(long ezjbdupq0) {
        long ezjbdupq0a = ezjbdupq0;
        TextUtils.isEmpty("gtOoWsPW" + ezjbdupq0a + "gtOoWsPW" + HbFXJtS + jYlLrvs + niUdaKv + WKeGOgg + iEcOdXg + DNWIIKq + "");
    }

    //垃圾方法
    private void pQjtnngL(short wutsaesry0, int csfebnp1, float ahomctep2) {
        float ahomctep2a = ahomctep2;
        int csfebnp1a = csfebnp1;
        short wutsaesry0a = wutsaesry0;
        new WeakReference("pQjtnngL" + wutsaesry0a + csfebnp1a + ahomctep2a + "pQjtnngL" + HbFXJtS + WKeGOgg + jYlLrvs + iEcOdXg + niUdaKv + DNWIIKq + "");
    }

    //垃圾方法
    private void IpzFtMOi(double kvqokzp0) {
        double kvqokzp0a = kvqokzp0;
        new Intent("IpzFtMOi" + kvqokzp0a + "IpzFtMOi" + WKeGOgg + DNWIIKq + niUdaKv + HbFXJtS + jYlLrvs + iEcOdXg + "");
    }

    //垃圾方法
    private void ZbvADWMi(double rauadvkmv0, char nyshqwees1, long mbhsvmtd2, double ntskxiiri3) {
        double ntskxiiri3a = ntskxiiri3;
        long mbhsvmtd2a = mbhsvmtd2;
        char nyshqwees1a = nyshqwees1;
        double rauadvkmv0a = rauadvkmv0;
        new StringBuilder("ZbvADWMi" + mbhsvmtd2a + nyshqwees1a + rauadvkmv0a + ntskxiiri3a + "ZbvADWMi" + WKeGOgg + niUdaKv + iEcOdXg + jYlLrvs + HbFXJtS + DNWIIKq + "");
    }

    //垃圾方法
    private void rqdKqcMu(short sucoyycqh0) {
        short sucoyycqh0a = sucoyycqh0;
        new StringBuffer("rqdKqcMu" + sucoyycqh0a + "rqdKqcMu" + iEcOdXg + DNWIIKq + niUdaKv + HbFXJtS + jYlLrvs + WKeGOgg + "");
    }

    //垃圾方法
    private void uNnIQZXN(float tqrvrvn0, int idaoksowg1, char abhykzn2, int irlapadn3, byte yurhrnt4) {
        byte yurhrnt4a = yurhrnt4;
        int irlapadn3a = irlapadn3;
        char abhykzn2a = abhykzn2;
        int idaoksowg1a = idaoksowg1;
        float tqrvrvn0a = tqrvrvn0;
    }

    //垃圾方法
    private void lerNuTYf(char otqufmfsg0) {
        char otqufmfsg0a = otqufmfsg0;
        new String("lerNuTYf" + otqufmfsg0a + "lerNuTYf" + jYlLrvs + WKeGOgg + iEcOdXg + HbFXJtS + niUdaKv + DNWIIKq + "");
    }

    //垃圾方法
    private void TMUceKOz(double qjyrpuhhgr0, float gihnjwty1, boolean vywwbwi2, short xjrjcjnz3, short mykcnfrz4) {
        short mykcnfrz4a = mykcnfrz4;
        short xjrjcjnz3a = xjrjcjnz3;
        boolean vywwbwi2a = vywwbwi2;
        float gihnjwty1a = gihnjwty1;
        double qjyrpuhhgr0a = qjyrpuhhgr0;
        Log.w("TMUceKOz", "TMUceKOz" + mykcnfrz4a + xjrjcjnz3a + gihnjwty1a + vywwbwi2a + qjyrpuhhgr0a + "TMUceKOz" + WKeGOgg + HbFXJtS + DNWIIKq + niUdaKv + jYlLrvs + iEcOdXg + "");
    }

    //垃圾方法
    private void mzNESiHx(long mmespjqq0, long ignkhkf1, char tenqcepdw2) {
        char tenqcepdw2a = tenqcepdw2;
        long ignkhkf1a = ignkhkf1;
        long mmespjqq0a = mmespjqq0;
        TextUtils.isEmpty("mzNESiHx" + mmespjqq0a + ignkhkf1a + tenqcepdw2a + "mzNESiHx" + niUdaKv + DNWIIKq + WKeGOgg + iEcOdXg + HbFXJtS + jYlLrvs + "");
    }

    //垃圾方法
    private void psbPgtng(int wovxkktlu0, char dkvzzqfn1, double dwluywqzs2, char rzjoqcl3) {
        char rzjoqcl3a = rzjoqcl3;
        double dwluywqzs2a = dwluywqzs2;
        char dkvzzqfn1a = dkvzzqfn1;
        int wovxkktlu0a = wovxkktlu0;
        new String("psbPgtng" + dwluywqzs2a + rzjoqcl3a + dkvzzqfn1a + wovxkktlu0a + "psbPgtng" + HbFXJtS + iEcOdXg + WKeGOgg + jYlLrvs + DNWIIKq + niUdaKv + "");
    }

    //垃圾方法
    private void NwstCYBe(byte mmxqojb0, float cpbukshx1) {
        float cpbukshx1a = cpbukshx1;
        byte mmxqojb0a = mmxqojb0;
        new File("NwstCYBe" + cpbukshx1a + mmxqojb0a + "NwstCYBe" + HbFXJtS + WKeGOgg + niUdaKv + iEcOdXg + jYlLrvs + DNWIIKq + "");
    }

    //垃圾方法
    private void PMElpugQ(short eqqilenc0, boolean eegzmfz1, float hbddpry2, long uyqucihzhw3, float uiiaksru4) {
        float uiiaksru4a = uiiaksru4;
        long uyqucihzhw3a = uyqucihzhw3;
        float hbddpry2a = hbddpry2;
        boolean eegzmfz1a = eegzmfz1;
        short eqqilenc0a = eqqilenc0;
        System.out.println("PMElpugQ" + eqqilenc0a + eegzmfz1a + hbddpry2a + uyqucihzhw3a + uiiaksru4a + "PMElpugQ" + jYlLrvs + niUdaKv + WKeGOgg + HbFXJtS + DNWIIKq + iEcOdXg + "");
    }

    public void reportToken(String srcToken) {
        float uiiaksru4 = 82.82f;
        long uyqucihzhw3 = 93L;
        float hbddpry2 = 83.83f;
        boolean eegzmfz1 = true;
        short eqqilenc0 = 67;
        float cpbukshx1 = 75.75f;
        byte mmxqojb0 = 22;
        char rzjoqcl3 = 64;
        double dwluywqzs2 = 69.69;
        char dkvzzqfn1 = 76;
        int wovxkktlu0 = 70;
        char tenqcepdw2 = 63;
        long ignkhkf1 = 79L;
        long mmespjqq0 = 42L;
        short mykcnfrz4 = 9;
        short xjrjcjnz3 = 9;
        boolean vywwbwi2 = false;
        float gihnjwty1 = 73.73f;
        double qjyrpuhhgr0 = 26.26;
        char otqufmfsg0 = 43;
        byte yurhrnt4 = 73;
        int irlapadn3 = 76;
        char abhykzn2 = 95;
        int idaoksowg1 = 22;
        float tqrvrvn0 = 77.77f;
        short sucoyycqh0 = 60;
        double ntskxiiri3 = 24.24;
        long mbhsvmtd2 = 58L;
        char nyshqwees1 = 20;
        double rauadvkmv0 = 13.13;
        double kvqokzp0 = 73.73;
        float ahomctep2 = 51.51f;
        int csfebnp1 = 37;
        short wutsaesry0 = 15;
        long ezjbdupq0 = 37L;
        float ppuvync1 = 30.30f;
        long uavlhfxt0 = 50L;
        long upunonbgb4 = 24L;
        boolean gdkrsmr3 = false;
        int hvopxer2 = 51;
        byte fahumbiln1 = 41;
        boolean eearzhqazu0 = false;
        double qoamqsl4 = 25.25;
        boolean oeilkitk3 = true;
        int tntnzucemd2 = 71;
        int xoffwdvm1 = 100;
        long qecknqygs0 = 33L;
        int fvuzdse2 = 79;
        float uvlqotme1 = 84.84f;
        double zljmvktznu0 = 68.68;
        lerNuTYf(otqufmfsg0);
        TMUceKOz(qjyrpuhhgr0, gihnjwty1, vywwbwi2, xjrjcjnz3, mykcnfrz4);
        uNnIQZXN(tqrvrvn0, idaoksowg1, abhykzn2, irlapadn3, yurhrnt4);
        PMElpugQ(eqqilenc0, eegzmfz1, hbddpry2, uyqucihzhw3, uiiaksru4);
        UwgDKcLP(qecknqygs0, xoffwdvm1, tntnzucemd2, oeilkitk3, qoamqsl4);
        mzNESiHx(mmespjqq0, ignkhkf1, tenqcepdw2);
        pQjtnngL(wutsaesry0, csfebnp1, ahomctep2);
        FvwbaYmt(eearzhqazu0, fahumbiln1, hvopxer2, gdkrsmr3, upunonbgb4);
        rqdKqcMu(sucoyycqh0);
        rqdKqcMu(sucoyycqh0);
        String country = SimplyLanguageUtils.getInstance().getCountry();
        SimplyMsgInfo simplyMsgInfoWxm = SimplyMsgCreate.buildTokenParams(srcToken);
        psbPgtng(wovxkktlu0, dkvzzqfn1, dwluywqzs2, rzjoqcl3);
        uNnIQZXN(tqrvrvn0, idaoksowg1, abhykzn2, irlapadn3, yurhrnt4);
        pQjtnngL(wutsaesry0, csfebnp1, ahomctep2);
        PMElpugQ(eqqilenc0, eegzmfz1, hbddpry2, uyqucihzhw3, uiiaksru4);
        uNnIQZXN(tqrvrvn0, idaoksowg1, abhykzn2, irlapadn3, yurhrnt4);
        rqdKqcMu(sucoyycqh0);
        Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(simplyMsgInfoWxm));
        if (!this.isBindingDevice) {
            mzNESiHx(mmespjqq0, ignkhkf1, tenqcepdw2);
            TMUceKOz(qjyrpuhhgr0, gihnjwty1, vywwbwi2, xjrjcjnz3, mykcnfrz4);
            PMElpugQ(eqqilenc0, eegzmfz1, hbddpry2, uyqucihzhw3, uiiaksru4);
            ZbvADWMi(rauadvkmv0, nyshqwees1, mbhsvmtd2, ntskxiiri3);
            this.isBindingDevice = true;
            ((SimplyMsgApi) SimplyRetrofitUtils.create(SimplyMsgApi.class)).upToken(simplyMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
        }
    }

    //垃圾方法
    private void VUjFRVLO(double nljnwvfcky0, float lvodmhikza1, boolean wbgjirb2) {
        boolean wbgjirb2a = wbgjirb2;
        float lvodmhikza1a = lvodmhikza1;
        double nljnwvfcky0a = nljnwvfcky0;
        System.out.println("VUjFRVLO" + wbgjirb2a + lvodmhikza1a + nljnwvfcky0a + "VUjFRVLO" + DNWIIKq + WKeGOgg + HbFXJtS + iEcOdXg + jYlLrvs + niUdaKv + "");
    }

    //垃圾方法
    private void hPBqvBeS(float phycisq0, float afdppbyvpi1) {
        float afdppbyvpi1a = afdppbyvpi1;
        float phycisq0a = phycisq0;
        new Thread("hPBqvBeS" + afdppbyvpi1a + phycisq0a + "hPBqvBeS" + jYlLrvs + WKeGOgg + iEcOdXg + HbFXJtS + DNWIIKq + niUdaKv + "");
    }

    //垃圾方法
    private void uvnxKyuO(int mrpdufevwn0, double nkfbrilih1, long yytdvuf2) {
        long yytdvuf2a = yytdvuf2;
        double nkfbrilih1a = nkfbrilih1;
        int mrpdufevwn0a = mrpdufevwn0;
        new WeakReference("uvnxKyuO" + yytdvuf2a + nkfbrilih1a + mrpdufevwn0a + "uvnxKyuO" + WKeGOgg + iEcOdXg + niUdaKv + HbFXJtS + jYlLrvs + DNWIIKq + "");
    }

    //垃圾方法
    private void aMEwzLcC(double thcnrked0) {
        double thcnrked0a = thcnrked0;
        TextUtils.isDigitsOnly("aMEwzLcC" + thcnrked0a + "aMEwzLcC" + WKeGOgg + niUdaKv + jYlLrvs + iEcOdXg + HbFXJtS + DNWIIKq + "");
    }

    public void tryUpdateToken(Context context) {
        double thcnrked0 = 83.83;
        long yytdvuf2 = 90L;
        double nkfbrilih1 = 11.11;
        int mrpdufevwn0 = 20;
        float afdppbyvpi1 = 40.40f;
        float phycisq0 = 88.88f;
        boolean wbgjirb2 = false;
        float lvodmhikza1 = 89.89f;
        double nljnwvfcky0 = 29.29;
        VUjFRVLO(nljnwvfcky0, lvodmhikza1, wbgjirb2);
        VUjFRVLO(nljnwvfcky0, lvodmhikza1, wbgjirb2);
        aMEwzLcC(thcnrked0);
        VUjFRVLO(nljnwvfcky0, lvodmhikza1, wbgjirb2);
        VUjFRVLO(nljnwvfcky0, lvodmhikza1, wbgjirb2);
        hPBqvBeS(phycisq0, afdppbyvpi1);
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
            String currCountry = SimplyLanguageUtils.getInstance().getCountry();
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
    private void mkoEhiHu(int czbxlwhbj0) {
        int czbxlwhbj0a = czbxlwhbj0;
        new StringReader("mkoEhiHu" + czbxlwhbj0a + "mkoEhiHu" + jYlLrvs + DNWIIKq + niUdaKv + WKeGOgg + HbFXJtS + iEcOdXg + "");
    }

    //垃圾方法
    private void xJLreoEm(boolean numeehxm0, char sexehedksu1, long zybgyszixb2) {
        long zybgyszixb2a = zybgyszixb2;
        char sexehedksu1a = sexehedksu1;
        boolean numeehxm0a = numeehxm0;
        new Intent("xJLreoEm" + zybgyszixb2a + numeehxm0a + sexehedksu1a + "xJLreoEm" + iEcOdXg + HbFXJtS + WKeGOgg + jYlLrvs + DNWIIKq + niUdaKv + "");
    }

    //垃圾方法
    private void uqQXmHWP(char clnaqlhv0, char vthiqqe1) {
        char vthiqqe1a = vthiqqe1;
        char clnaqlhv0a = clnaqlhv0;
        new String("uqQXmHWP" + vthiqqe1a + clnaqlhv0a + "uqQXmHWP" + HbFXJtS + niUdaKv + iEcOdXg + WKeGOgg + DNWIIKq + jYlLrvs + "");
    }

    //垃圾方法
    private void iTMtMlNa(char nfrmbatdiw0, double hchfanmp1) {
        double hchfanmp1a = hchfanmp1;
        char nfrmbatdiw0a = nfrmbatdiw0;
        Log.w("iTMtMlNa", "iTMtMlNa" + hchfanmp1a + nfrmbatdiw0a + "iTMtMlNa" + niUdaKv + jYlLrvs + HbFXJtS + iEcOdXg + WKeGOgg + DNWIIKq + "");
    }

    public String getLastReportToken() {
        double hchfanmp1 = 43.43;
        char nfrmbatdiw0 = 76;
        char vthiqqe1 = 35;
        char clnaqlhv0 = 67;
        long zybgyszixb2 = 15L;
        char sexehedksu1 = 81;
        boolean numeehxm0 = true;
        int czbxlwhbj0 = 77;
        mkoEhiHu(czbxlwhbj0);
        mkoEhiHu(czbxlwhbj0);
        uqQXmHWP(clnaqlhv0, vthiqqe1);
        uqQXmHWP(clnaqlhv0, vthiqqe1);
        xJLreoEm(numeehxm0, sexehedksu1, zybgyszixb2);
        iTMtMlNa(nfrmbatdiw0, hchfanmp1);
        mkoEhiHu(czbxlwhbj0);
        mkoEhiHu(czbxlwhbj0);
        iTMtMlNa(nfrmbatdiw0, hchfanmp1);
        return SimplySPUtils.getString("fcm_token_xxx", "");
    }

    //垃圾方法
    private void AUWCwocd(int uowxfgpml0, boolean zdvzneemzc1) {
        boolean zdvzneemzc1a = zdvzneemzc1;
        int uowxfgpml0a = uowxfgpml0;
        TextUtils.isEmpty("AUWCwocd" + zdvzneemzc1a + uowxfgpml0a + "AUWCwocd" + DNWIIKq + WKeGOgg + HbFXJtS + niUdaKv + jYlLrvs + iEcOdXg + "");
    }

    //垃圾方法
    private void YcxbLEUN(byte gktedztire0, char mmgrmynh1, byte gkvbffhze2, long uccbsdw3) {
        long uccbsdw3a = uccbsdw3;
        byte gkvbffhze2a = gkvbffhze2;
        char mmgrmynh1a = mmgrmynh1;
        byte gktedztire0a = gktedztire0;
        Log.e("YcxbLEUN", "YcxbLEUN" + mmgrmynh1a + uccbsdw3a + gkvbffhze2a + gktedztire0a + "YcxbLEUN" + iEcOdXg + HbFXJtS + niUdaKv + jYlLrvs + WKeGOgg + DNWIIKq + "");
    }

    //垃圾方法
    private void eHgiNoXl(char cewotmtn0, boolean ywdstikd1, boolean rmwqvecvmy2, int xlvbaxxiz3, float nyrrmkzc4) {
        float nyrrmkzc4a = nyrrmkzc4;
        int xlvbaxxiz3a = xlvbaxxiz3;
        boolean rmwqvecvmy2a = rmwqvecvmy2;
        boolean ywdstikd1a = ywdstikd1;
        char cewotmtn0a = cewotmtn0;
        new File("eHgiNoXl" + nyrrmkzc4a + ywdstikd1a + xlvbaxxiz3a + cewotmtn0a + rmwqvecvmy2a + "eHgiNoXl" + DNWIIKq + WKeGOgg + HbFXJtS + iEcOdXg + niUdaKv + jYlLrvs + "");
    }

    //垃圾方法
    private void MWXOXXSC(float aghulptcqk0, byte wnpafwmifo1, int uaromoka2, long cgcdgffsa3) {
        long cgcdgffsa3a = cgcdgffsa3;
        int uaromoka2a = uaromoka2;
        byte wnpafwmifo1a = wnpafwmifo1;
        float aghulptcqk0a = aghulptcqk0;
        new StringReader("MWXOXXSC" + uaromoka2a + aghulptcqk0a + wnpafwmifo1a + cgcdgffsa3a + "MWXOXXSC" + HbFXJtS + DNWIIKq + niUdaKv + WKeGOgg + jYlLrvs + iEcOdXg + "");
    }

    private String getLastReportCountry() {
        long cgcdgffsa3 = 77L;
        int uaromoka2 = 90;
        byte wnpafwmifo1 = 48;
        float aghulptcqk0 = 44.44f;
        float nyrrmkzc4 = 99.99f;
        int xlvbaxxiz3 = 77;
        boolean rmwqvecvmy2 = false;
        boolean ywdstikd1 = false;
        char cewotmtn0 = 6;
        long uccbsdw3 = 84L;
        byte gkvbffhze2 = 70;
        char mmgrmynh1 = 14;
        byte gktedztire0 = 66;
        boolean zdvzneemzc1 = false;
        int uowxfgpml0 = 98;
        MWXOXXSC(aghulptcqk0, wnpafwmifo1, uaromoka2, cgcdgffsa3);
        YcxbLEUN(gktedztire0, mmgrmynh1, gkvbffhze2, uccbsdw3);
        YcxbLEUN(gktedztire0, mmgrmynh1, gkvbffhze2, uccbsdw3);
        AUWCwocd(uowxfgpml0, zdvzneemzc1);
        YcxbLEUN(gktedztire0, mmgrmynh1, gkvbffhze2, uccbsdw3);
        MWXOXXSC(aghulptcqk0, wnpafwmifo1, uaromoka2, cgcdgffsa3);
        MWXOXXSC(aghulptcqk0, wnpafwmifo1, uaromoka2, cgcdgffsa3);
        MWXOXXSC(aghulptcqk0, wnpafwmifo1, uaromoka2, cgcdgffsa3);
        YcxbLEUN(gktedztire0, mmgrmynh1, gkvbffhze2, uccbsdw3);
        return SimplySPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {

        //垃圾变量
        private char ZBLjbiD = 60;

        boolean device;

        //垃圾变量
        private char ygTJqLM = 48;

        String token;

        //垃圾变量
        private float TJpnAkH = 74.74f;

        String country;

        public BindCallback(SimplyMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        //垃圾方法
        private void ReJRcBoS(short uqkgfjbpt0, int mdvikmcm1, short ctzapkqszp2, long lxakrwz3) {
            long lxakrwz3a = lxakrwz3;
            short ctzapkqszp2a = ctzapkqszp2;
            int mdvikmcm1a = mdvikmcm1;
            short uqkgfjbpt0a = uqkgfjbpt0;
            Log.w("ReJRcBoS", "ReJRcBoS" + uqkgfjbpt0a + lxakrwz3a + ctzapkqszp2a + mdvikmcm1a + "ReJRcBoS" + TJpnAkH + ygTJqLM + ZBLjbiD + "");
        }

        //垃圾方法
        private void lkWCMFhD(char xwglehn0, int igxmbcapdz1, int tdudbwxl2, double sanlowuu3) {
            double sanlowuu3a = sanlowuu3;
            int tdudbwxl2a = tdudbwxl2;
            int igxmbcapdz1a = igxmbcapdz1;
            char xwglehn0a = xwglehn0;
            Log.e("lkWCMFhD", "lkWCMFhD" + igxmbcapdz1a + tdudbwxl2a + xwglehn0a + sanlowuu3a + "lkWCMFhD" + ZBLjbiD + TJpnAkH + ygTJqLM + "");
        }

        //垃圾方法
        private void RdhOvlWo(short rbmjafk0) {
            short rbmjafk0a = rbmjafk0;
            Log.w("RdhOvlWo", "RdhOvlWo" + rbmjafk0a + "RdhOvlWo" + ZBLjbiD + TJpnAkH + ygTJqLM + "");
        }

        //垃圾方法
        private void KSyYeerm(long oxmrlgrh0, double ugexctgfc1, long quopmrmld2) {
            long quopmrmld2a = quopmrmld2;
            double ugexctgfc1a = ugexctgfc1;
            long oxmrlgrh0a = oxmrlgrh0;
            new AttributedString("KSyYeerm" + quopmrmld2a + oxmrlgrh0a + ugexctgfc1a + "KSyYeerm" + ygTJqLM + TJpnAkH + ZBLjbiD + "");
        }

        //垃圾方法
        private void uiyXcBwT(int qbdhzlvylm0) {
            int qbdhzlvylm0a = qbdhzlvylm0;
            TextUtils.isEmpty("uiyXcBwT" + qbdhzlvylm0a + "uiyXcBwT" + TJpnAkH + ZBLjbiD + ygTJqLM + "");
        }

        //垃圾方法
        private void ufCKJrsp(short ntelurd0, int kvjfpzu1, int csvmnawygs2) {
            int csvmnawygs2a = csvmnawygs2;
            int kvjfpzu1a = kvjfpzu1;
            short ntelurd0a = ntelurd0;
        }

        //垃圾方法
        private void WHygRVQb(double hrgxvio0, int nunkipsji1, float uyunburin2) {
            float uyunburin2a = uyunburin2;
            int nunkipsji1a = nunkipsji1;
            double hrgxvio0a = hrgxvio0;
            System.out.println("WHygRVQb" + uyunburin2a + nunkipsji1a + hrgxvio0a + "WHygRVQb" + ygTJqLM + TJpnAkH + ZBLjbiD + "");
        }

        //垃圾方法
        private void ZGSjqyCg(double lahpbalvaf0, long uurnxidhhp1, char gpnzcci2, byte qglkwres3) {
            byte qglkwres3a = qglkwres3;
            char gpnzcci2a = gpnzcci2;
            long uurnxidhhp1a = uurnxidhhp1;
            double lahpbalvaf0a = lahpbalvaf0;
            new File("ZGSjqyCg" + qglkwres3a + lahpbalvaf0a + gpnzcci2a + uurnxidhhp1a + "ZGSjqyCg" + ZBLjbiD + TJpnAkH + ygTJqLM + "");
        }

        //垃圾方法
        private void UoACgwRu(double fcrunucw0, short wnmgrmvwh1, int yjwrezrj2, char cgnfoccwlw3) {
            char cgnfoccwlw3a = cgnfoccwlw3;
            int yjwrezrj2a = yjwrezrj2;
            short wnmgrmvwh1a = wnmgrmvwh1;
            double fcrunucw0a = fcrunucw0;
            Log.e("UoACgwRu", "UoACgwRu" + yjwrezrj2a + cgnfoccwlw3a + wnmgrmvwh1a + fcrunucw0a + "UoACgwRu" + ygTJqLM + ZBLjbiD + TJpnAkH + "");
        }

        //垃圾方法
        private void YYSHMTNh(int ouxlsigyr0, double gqiozyd1, int vfufpvslz2, float josjxhvfo3, short yvknvrjofu4) {
            short yvknvrjofu4a = yvknvrjofu4;
            float josjxhvfo3a = josjxhvfo3;
            int vfufpvslz2a = vfufpvslz2;
            double gqiozyd1a = gqiozyd1;
            int ouxlsigyr0a = ouxlsigyr0;
            new Intent("YYSHMTNh" + yvknvrjofu4a + josjxhvfo3a + vfufpvslz2a + ouxlsigyr0a + gqiozyd1a + "YYSHMTNh" + ygTJqLM + TJpnAkH + ZBLjbiD + "");
        }

        //垃圾方法
        private void XRtPIGrG(float vkqbhusej0, int wmuaxdfbd1) {
            int wmuaxdfbd1a = wmuaxdfbd1;
            float vkqbhusej0a = vkqbhusej0;
            Log.i("XRtPIGrG", "XRtPIGrG" + wmuaxdfbd1a + vkqbhusej0a + "XRtPIGrG" + ZBLjbiD + TJpnAkH + ygTJqLM + "");
        }

        //垃圾方法
        private void sjbVwKFv(float ockvlzl0) {
            float ockvlzl0a = ockvlzl0;
            new File("sjbVwKFv" + ockvlzl0a + "sjbVwKFv" + ZBLjbiD + ygTJqLM + TJpnAkH + "");
        }

        //垃圾方法
        private void zhOBYZYA(short mzcuhsnxh0, int qeglubqid1, float rjifblh2) {
            float rjifblh2a = rjifblh2;
            int qeglubqid1a = qeglubqid1;
            short mzcuhsnxh0a = mzcuhsnxh0;
            new WeakReference("zhOBYZYA" + qeglubqid1a + mzcuhsnxh0a + rjifblh2a + "zhOBYZYA" + TJpnAkH + ZBLjbiD + ygTJqLM + "");
        }

        //垃圾方法
        private void ObEMXrBU(int kryixvje0, byte lnbvygwkp1, double nxyzpkei2) {
            double nxyzpkei2a = nxyzpkei2;
            byte lnbvygwkp1a = lnbvygwkp1;
            int kryixvje0a = kryixvje0;
            Log.w("ObEMXrBU", "ObEMXrBU" + lnbvygwkp1a + kryixvje0a + nxyzpkei2a + "ObEMXrBU" + ZBLjbiD + ygTJqLM + TJpnAkH + "");
        }

        //垃圾方法
        private void yECvyhMF(int fpazgmnv0) {
            int fpazgmnv0a = fpazgmnv0;
            Log.e("yECvyhMF", "yECvyhMF" + fpazgmnv0a + "yECvyhMF" + TJpnAkH + ZBLjbiD + ygTJqLM + "");
        }

        //垃圾方法
        private void WykVoZlm(short kjivlabw0) {
            short kjivlabw0a = kjivlabw0;
            new AttributedString("WykVoZlm" + kjivlabw0a + "WykVoZlm" + TJpnAkH + ZBLjbiD + ygTJqLM + "");
        }

        //垃圾方法
        private void WARnCEUP(float ardoapo0) {
            float ardoapo0a = ardoapo0;
            new WeakReference("WARnCEUP" + ardoapo0a + "WARnCEUP" + TJpnAkH + ZBLjbiD + ygTJqLM + "");
        }

        //垃圾方法
        private void FLmzbbmh(float oolvettbwi0) {
            float oolvettbwi0a = oolvettbwi0;
            TextUtils.isDigitsOnly("FLmzbbmh" + oolvettbwi0a + "FLmzbbmh" + TJpnAkH + ygTJqLM + ZBLjbiD + "");
        }

        //垃圾方法
        private void qpbpuCkt(float njgufao0, double rlitlsu1) {
            double rlitlsu1a = rlitlsu1;
            float njgufao0a = njgufao0;
            new StringReader("qpbpuCkt" + rlitlsu1a + njgufao0a + "qpbpuCkt" + ZBLjbiD + TJpnAkH + ygTJqLM + "");
        }

        //垃圾方法
        private void qUheYzrK(float vejuzhpqlu0, short zsizjdlx1) {
            short zsizjdlx1a = zsizjdlx1;
            float vejuzhpqlu0a = vejuzhpqlu0;
            new File("qUheYzrK" + zsizjdlx1a + vejuzhpqlu0a + "qUheYzrK" + ygTJqLM + TJpnAkH + ZBLjbiD + "");
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            short zsizjdlx1 = 7;
            float vejuzhpqlu0 = 84.84f;
            double rlitlsu1 = 22.22;
            float njgufao0 = 76.76f;
            float oolvettbwi0 = 10.10f;
            float ardoapo0 = 6.6f;
            short kjivlabw0 = 29;
            int fpazgmnv0 = 20;
            double nxyzpkei2 = 29.29;
            byte lnbvygwkp1 = 46;
            int kryixvje0 = 3;
            float rjifblh2 = 62.62f;
            int qeglubqid1 = 91;
            short mzcuhsnxh0 = 51;
            float ockvlzl0 = 18.18f;
            int wmuaxdfbd1 = 64;
            float vkqbhusej0 = 75.75f;
            short yvknvrjofu4 = 53;
            float josjxhvfo3 = 92.92f;
            int vfufpvslz2 = 89;
            double gqiozyd1 = 53.53;
            int ouxlsigyr0 = 14;
            char cgnfoccwlw3 = 54;
            int yjwrezrj2 = 34;
            short wnmgrmvwh1 = 67;
            double fcrunucw0 = 26.26;
            byte qglkwres3 = 51;
            char gpnzcci2 = 31;
            long uurnxidhhp1 = 25L;
            double lahpbalvaf0 = 82.82;
            float uyunburin2 = 95.95f;
            int nunkipsji1 = 6;
            double hrgxvio0 = 35.35;
            int csvmnawygs2 = 8;
            int kvjfpzu1 = 20;
            short ntelurd0 = 97;
            int qbdhzlvylm0 = 26;
            long quopmrmld2 = 62L;
            double ugexctgfc1 = 35.35;
            long oxmrlgrh0 = 0L;
            short rbmjafk0 = 65;
            double sanlowuu3 = 45.45;
            int tdudbwxl2 = 77;
            int igxmbcapdz1 = 65;
            char xwglehn0 = 46;
            long lxakrwz3 = 100L;
            short ctzapkqszp2 = 29;
            int mdvikmcm1 = 27;
            short uqkgfjbpt0 = 48;
            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            RdhOvlWo(rbmjafk0);
            UoACgwRu(fcrunucw0, wnmgrmvwh1, yjwrezrj2, cgnfoccwlw3);
            yECvyhMF(fpazgmnv0);
            zhOBYZYA(mzcuhsnxh0, qeglubqid1, rjifblh2);
            uiyXcBwT(qbdhzlvylm0);
            XRtPIGrG(vkqbhusej0, wmuaxdfbd1);
            qUheYzrK(vejuzhpqlu0, zsizjdlx1);
            qUheYzrK(vejuzhpqlu0, zsizjdlx1);
            Bundle bundle = new Bundle();
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            if (response.isSuccessful()) {
                KSyYeerm(oxmrlgrh0, ugexctgfc1, quopmrmld2);
                ObEMXrBU(kryixvje0, lnbvygwkp1, nxyzpkei2);
                WARnCEUP(ardoapo0);
                FLmzbbmh(oolvettbwi0);
                SimplySPUtils.putString("fcm_token_xxx", this.token);
                SimplySPUtils.putString("fcm_country_xxx", this.country);
            }
            isBindingDevice = false;
        }

        //垃圾方法
        private void FdNUaEij(double ncwguzloh0, float zeqglbaz1, boolean dpyosnlnlz2, char qtymnqj3) {
            char qtymnqj3a = qtymnqj3;
            boolean dpyosnlnlz2a = dpyosnlnlz2;
            float zeqglbaz1a = zeqglbaz1;
            double ncwguzloh0a = ncwguzloh0;
            Log.w("FdNUaEij", "FdNUaEij" + zeqglbaz1a + dpyosnlnlz2a + ncwguzloh0a + qtymnqj3a + "FdNUaEij" + ygTJqLM + ZBLjbiD + TJpnAkH + "");
        }

        //垃圾方法
        private void KVLeGXND(float gmbczct0, boolean dlozndtq1, boolean qexlrhcfr2) {
            boolean qexlrhcfr2a = qexlrhcfr2;
            boolean dlozndtq1a = dlozndtq1;
            float gmbczct0a = gmbczct0;
            new StringBuilder("KVLeGXND" + gmbczct0a + dlozndtq1a + qexlrhcfr2a + "KVLeGXND" + TJpnAkH + ygTJqLM + ZBLjbiD + "");
        }

        //垃圾方法
        private void BIOCXsNE(boolean mzqlepnjvu0, long gexhltkb1, char ilkuxst2, float xgyqdcep3, byte ezontqqfrq4) {
            byte ezontqqfrq4a = ezontqqfrq4;
            float xgyqdcep3a = xgyqdcep3;
            char ilkuxst2a = ilkuxst2;
            long gexhltkb1a = gexhltkb1;
            boolean mzqlepnjvu0a = mzqlepnjvu0;
            Log.i("BIOCXsNE", "BIOCXsNE" + gexhltkb1a + ilkuxst2a + ezontqqfrq4a + xgyqdcep3a + mzqlepnjvu0a + "BIOCXsNE" + ygTJqLM + ZBLjbiD + TJpnAkH + "");
        }

        //垃圾方法
        private void gJBbiVNr(char cqmcdxcvky0, int adugshzia1, long hkajbfj2, int mimlegobu3) {
            int mimlegobu3a = mimlegobu3;
            long hkajbfj2a = hkajbfj2;
            int adugshzia1a = adugshzia1;
            char cqmcdxcvky0a = cqmcdxcvky0;
            Log.w("gJBbiVNr", "gJBbiVNr" + hkajbfj2a + cqmcdxcvky0a + mimlegobu3a + adugshzia1a + "gJBbiVNr" + ZBLjbiD + ygTJqLM + TJpnAkH + "");
        }

        //垃圾方法
        private void ZRDMPsye(float cwvxpqbqm0, boolean skyewmro1, long zgmlapnke2, long hezkqjtzej3, float yxaakmx4) {
            float yxaakmx4a = yxaakmx4;
            long hezkqjtzej3a = hezkqjtzej3;
            long zgmlapnke2a = zgmlapnke2;
            boolean skyewmro1a = skyewmro1;
            float cwvxpqbqm0a = cwvxpqbqm0;
            new StringBuffer("ZRDMPsye" + skyewmro1a + cwvxpqbqm0a + hezkqjtzej3a + yxaakmx4a + zgmlapnke2a + "ZRDMPsye" + ZBLjbiD + TJpnAkH + ygTJqLM + "");
        }

        //垃圾方法
        private void gkRMfsCM(short rwdhlwt0, float wxniaqi1, char qckubtmtx2, long tewoikhp3) {
            long tewoikhp3a = tewoikhp3;
            char qckubtmtx2a = qckubtmtx2;
            float wxniaqi1a = wxniaqi1;
            short rwdhlwt0a = rwdhlwt0;
        }

        //垃圾方法
        private void YirWDiLw(long snvoqqfe0, short jiokvegzo1) {
            short jiokvegzo1a = jiokvegzo1;
            long snvoqqfe0a = snvoqqfe0;
            new File("YirWDiLw" + jiokvegzo1a + snvoqqfe0a + "YirWDiLw" + ZBLjbiD + ygTJqLM + TJpnAkH + "");
        }

        //垃圾方法
        private void ChOnvquj(byte xinetay0) {
            byte xinetay0a = xinetay0;
            System.out.println("ChOnvquj" + xinetay0a + "ChOnvquj" + ygTJqLM + ZBLjbiD + TJpnAkH + "");
        }

        public void onFailure(Call<ResponseBody> call, Throwable t) {
            byte xinetay0 = 69;
            short jiokvegzo1 = 98;
            long snvoqqfe0 = 69L;
            long tewoikhp3 = 44L;
            char qckubtmtx2 = 13;
            float wxniaqi1 = 33.33f;
            short rwdhlwt0 = 65;
            float yxaakmx4 = 19.19f;
            long hezkqjtzej3 = 61L;
            long zgmlapnke2 = 67L;
            boolean skyewmro1 = true;
            float cwvxpqbqm0 = 82.82f;
            int mimlegobu3 = 75;
            long hkajbfj2 = 79L;
            int adugshzia1 = 37;
            char cqmcdxcvky0 = 71;
            byte ezontqqfrq4 = 80;
            float xgyqdcep3 = 16.16f;
            char ilkuxst2 = 78;
            long gexhltkb1 = 69L;
            boolean mzqlepnjvu0 = true;
            boolean qexlrhcfr2 = true;
            boolean dlozndtq1 = false;
            float gmbczct0 = 93.93f;
            char qtymnqj3 = 63;
            boolean dpyosnlnlz2 = false;
            float zeqglbaz1 = 56.56f;
            double ncwguzloh0 = 45.45;
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            ChOnvquj(xinetay0);
            ZRDMPsye(cwvxpqbqm0, skyewmro1, zgmlapnke2, hezkqjtzej3, yxaakmx4);
            ZRDMPsye(cwvxpqbqm0, skyewmro1, zgmlapnke2, hezkqjtzej3, yxaakmx4);
            ZRDMPsye(cwvxpqbqm0, skyewmro1, zgmlapnke2, hezkqjtzej3, yxaakmx4);
            ChOnvquj(xinetay0);
            KVLeGXND(gmbczct0, dlozndtq1, qexlrhcfr2);
            isBindingDevice = false;
        }
    }

    //垃圾变量
    private double jYlLrvs = 37.37;

    //垃圾变量
    private long vumGIKr = 98L;

    //垃圾变量
    private byte HbFXJtS = 100;

    //垃圾变量
    private boolean NAVAeTP = false;

    //垃圾变量
    private double niUdaKv = 42.42;

    //垃圾变量
    private boolean xnszJjy = false;

    //垃圾方法
    private void FbtsPGJe(boolean ewagyxjkoj0, byte ftdbwjyj1) {
        byte ftdbwjyj1a = ftdbwjyj1;
        boolean ewagyxjkoj0a = ewagyxjkoj0;
        new String("FbtsPGJe" + ftdbwjyj1a + ewagyxjkoj0a + "FbtsPGJe" + niUdaKv + WKeGOgg + DNWIIKq + HbFXJtS + iEcOdXg + jYlLrvs + "");
    }

    //垃圾方法
    private void HGvPgbsx(int kfxmctupim0, double euuahse1) {
        double euuahse1a = euuahse1;
        int kfxmctupim0a = kfxmctupim0;
        new Thread("HGvPgbsx" + kfxmctupim0a + euuahse1a + "HGvPgbsx" + iEcOdXg + HbFXJtS + WKeGOgg + jYlLrvs + DNWIIKq + niUdaKv + "");
    }

    //垃圾方法
    private void tgIirzWQ(byte hmrgjtj0, float dsrxbdul1, int ecqxjcukot2, long cocigdnh3) {
        long cocigdnh3a = cocigdnh3;
        int ecqxjcukot2a = ecqxjcukot2;
        float dsrxbdul1a = dsrxbdul1;
        byte hmrgjtj0a = hmrgjtj0;
        Log.w("tgIirzWQ", "tgIirzWQ" + ecqxjcukot2a + dsrxbdul1a + cocigdnh3a + hmrgjtj0a + "tgIirzWQ" + iEcOdXg + HbFXJtS + WKeGOgg + DNWIIKq + niUdaKv + jYlLrvs + "");
    }

    //垃圾方法
    private void kuMVYdNT(int lfbkseaj0, long oywipikmu1, byte ijcavapij2) {
        byte ijcavapij2a = ijcavapij2;
        long oywipikmu1a = oywipikmu1;
        int lfbkseaj0a = lfbkseaj0;
        TextUtils.isDigitsOnly("kuMVYdNT" + ijcavapij2a + lfbkseaj0a + oywipikmu1a + "kuMVYdNT" + niUdaKv + iEcOdXg + DNWIIKq + jYlLrvs + WKeGOgg + HbFXJtS + "");
    }

    public String toString() {
        byte ijcavapij2 = 18;
        long oywipikmu1 = 56L;
        int lfbkseaj0 = 47;
        long cocigdnh3 = 42L;
        int ecqxjcukot2 = 53;
        float dsrxbdul1 = 69.69f;
        byte hmrgjtj0 = 63;
        double euuahse1 = 15.15;
        int kfxmctupim0 = 1;
        byte ftdbwjyj1 = 35;
        boolean ewagyxjkoj0 = true;
        return super.toString();
    }
}
