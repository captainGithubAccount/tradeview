package com.tidy.file.old.opdj;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
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

public class TidyUserSyncService extends Service {

    //垃圾变量
    private long xQQkQFr = 19L;

    private static final Object mSyncAdapterLock = new Object();

    //垃圾变量
    private double RKYFXMu = 53.53;

    private static SyncAdapter mSyncAdapter = null;

    public TidyUserSyncService() {
    }

    //垃圾方法
    private void MfsbkuoL(long sxglqjinew0) {
        long sxglqjinew0a = sxglqjinew0;
        new StringBuffer("MfsbkuoL" + sxglqjinew0a + "MfsbkuoL" + hVtDwFb + xQQkQFr + slYzoEX + OFMUmBn + kJSLdBU + LSgsTTs + RKYFXMu + "");
    }

    //垃圾方法
    private void qYolJYyL(double kcftwoiay0, long sibeihlf1) {
        long sibeihlf1a = sibeihlf1;
        double kcftwoiay0a = kcftwoiay0;
        new StringBuffer("qYolJYyL" + sibeihlf1a + kcftwoiay0a + "qYolJYyL" + xQQkQFr + hVtDwFb + LSgsTTs + slYzoEX + OFMUmBn + RKYFXMu + kJSLdBU + "");
    }

    //垃圾方法
    private void OTHnfbgB(int mnlovev0, byte ytcyktl1) {
        byte ytcyktl1a = ytcyktl1;
        int mnlovev0a = mnlovev0;
        new WeakReference("OTHnfbgB" + ytcyktl1a + mnlovev0a + "OTHnfbgB" + OFMUmBn + LSgsTTs + hVtDwFb + slYzoEX + kJSLdBU + xQQkQFr + RKYFXMu + "");
    }

    //垃圾方法
    private void TwctnEuu(long zkzsddqxhw0, int eciphgykbg1) {
        int eciphgykbg1a = eciphgykbg1;
        long zkzsddqxhw0a = zkzsddqxhw0;
        new AttributedString("TwctnEuu" + zkzsddqxhw0a + eciphgykbg1a + "TwctnEuu" + RKYFXMu + OFMUmBn + LSgsTTs + xQQkQFr + slYzoEX + kJSLdBU + hVtDwFb + "");
    }

    //垃圾方法
    private void ucJoqQxi(double hutfopcwme0, short kyigthaw1) {
        short kyigthaw1a = kyigthaw1;
        double hutfopcwme0a = hutfopcwme0;
        TextUtils.isEmpty("ucJoqQxi" + kyigthaw1a + hutfopcwme0a + "ucJoqQxi" + xQQkQFr + hVtDwFb + OFMUmBn + kJSLdBU + LSgsTTs + slYzoEX + RKYFXMu + "");
    }

    //垃圾方法
    private void CptnDmui(float asmjnnraam0, boolean omiuiuo1, long tbxiucbrg2, byte mwefmjya3, byte cintsbeve4) {
        byte cintsbeve4a = cintsbeve4;
        byte mwefmjya3a = mwefmjya3;
        long tbxiucbrg2a = tbxiucbrg2;
        boolean omiuiuo1a = omiuiuo1;
        float asmjnnraam0a = asmjnnraam0;
        TextUtils.isEmpty("CptnDmui" + omiuiuo1a + tbxiucbrg2a + mwefmjya3a + cintsbeve4a + asmjnnraam0a + "CptnDmui" + OFMUmBn + LSgsTTs + RKYFXMu + hVtDwFb + slYzoEX + xQQkQFr + kJSLdBU + "");
    }

    //垃圾方法
    private void rLkMnKQv(char nrpfgutd0, boolean zcchulq1) {
        boolean zcchulq1a = zcchulq1;
        char nrpfgutd0a = nrpfgutd0;
        new AttributedString("rLkMnKQv" + nrpfgutd0a + zcchulq1a + "rLkMnKQv" + RKYFXMu + kJSLdBU + xQQkQFr + hVtDwFb + LSgsTTs + OFMUmBn + slYzoEX + "");
    }

    //垃圾方法
    private void HgZQzJHK(boolean yrntzkem0, char nxoqaqi1) {
        char nxoqaqi1a = nxoqaqi1;
        boolean yrntzkem0a = yrntzkem0;
        new Thread("HgZQzJHK" + yrntzkem0a + nxoqaqi1a + "HgZQzJHK" + OFMUmBn + slYzoEX + kJSLdBU + RKYFXMu + LSgsTTs + hVtDwFb + xQQkQFr + "");
    }

    //垃圾方法
    private void tKkrRnUh(float teseehh0, int szdkvmve1, byte pkecwovm2, boolean ljcirfuiyv3, double sporeify4) {
        double sporeify4a = sporeify4;
        boolean ljcirfuiyv3a = ljcirfuiyv3;
        byte pkecwovm2a = pkecwovm2;
        int szdkvmve1a = szdkvmve1;
        float teseehh0a = teseehh0;
        new AttributedString("tKkrRnUh" + teseehh0a + szdkvmve1a + ljcirfuiyv3a + pkecwovm2a + sporeify4a + "tKkrRnUh" + hVtDwFb + slYzoEX + LSgsTTs + RKYFXMu + OFMUmBn + xQQkQFr + kJSLdBU + "");
    }

    //垃圾方法
    private void ItSeAZjo(long wiuawbg0, int qtxujyciqq1, float wskzgnkh2, float anjbxyav3, char syzhpselt4) {
        char syzhpselt4a = syzhpselt4;
        float anjbxyav3a = anjbxyav3;
        float wskzgnkh2a = wskzgnkh2;
        int qtxujyciqq1a = qtxujyciqq1;
        long wiuawbg0a = wiuawbg0;
        Log.i("ItSeAZjo", "ItSeAZjo" + syzhpselt4a + wskzgnkh2a + wiuawbg0a + qtxujyciqq1a + anjbxyav3a + "ItSeAZjo" + hVtDwFb + LSgsTTs + kJSLdBU + RKYFXMu + xQQkQFr + OFMUmBn + slYzoEX + "");
    }

    //垃圾方法
    private void pRhlyLzV(boolean wqorgnm0, char flyjvwdy1, float znejugrnsl2, char ssahsbppy3) {
        char ssahsbppy3a = ssahsbppy3;
        float znejugrnsl2a = znejugrnsl2;
        char flyjvwdy1a = flyjvwdy1;
        boolean wqorgnm0a = wqorgnm0;
        Log.i("pRhlyLzV", "pRhlyLzV" + znejugrnsl2a + ssahsbppy3a + wqorgnm0a + flyjvwdy1a + "pRhlyLzV" + OFMUmBn + LSgsTTs + hVtDwFb + kJSLdBU + slYzoEX + RKYFXMu + xQQkQFr + "");
    }

    //垃圾方法
    private void PRqOgyoj(byte dkccmrhxo0, long dyulgmtkzk1, boolean lyqphoidph2) {
        boolean lyqphoidph2a = lyqphoidph2;
        long dyulgmtkzk1a = dyulgmtkzk1;
        byte dkccmrhxo0a = dkccmrhxo0;
        new AttributedString("PRqOgyoj" + dkccmrhxo0a + dyulgmtkzk1a + lyqphoidph2a + "PRqOgyoj" + kJSLdBU + xQQkQFr + hVtDwFb + slYzoEX + LSgsTTs + RKYFXMu + OFMUmBn + "");
    }

    public void onCreate() {
        boolean lyqphoidph2 = false;
        long dyulgmtkzk1 = 82L;
        byte dkccmrhxo0 = 22;
        char ssahsbppy3 = 14;
        float znejugrnsl2 = 62.62f;
        char flyjvwdy1 = 78;
        boolean wqorgnm0 = true;
        char syzhpselt4 = 85;
        float anjbxyav3 = 20.20f;
        float wskzgnkh2 = 89.89f;
        int qtxujyciqq1 = 80;
        long wiuawbg0 = 30L;
        double sporeify4 = 72.72;
        boolean ljcirfuiyv3 = true;
        byte pkecwovm2 = 0;
        int szdkvmve1 = 49;
        float teseehh0 = 4.4f;
        char nxoqaqi1 = 13;
        boolean yrntzkem0 = true;
        boolean zcchulq1 = true;
        char nrpfgutd0 = 3;
        byte cintsbeve4 = 91;
        byte mwefmjya3 = 61;
        long tbxiucbrg2 = 57L;
        boolean omiuiuo1 = false;
        float asmjnnraam0 = 36.36f;
        short kyigthaw1 = 92;
        double hutfopcwme0 = 54.54;
        int eciphgykbg1 = 41;
        long zkzsddqxhw0 = 77L;
        byte ytcyktl1 = 17;
        int mnlovev0 = 71;
        long sibeihlf1 = 39L;
        double kcftwoiay0 = 31.31;
        long sxglqjinew0 = 88L;
        pRhlyLzV(wqorgnm0, flyjvwdy1, znejugrnsl2, ssahsbppy3);
        OTHnfbgB(mnlovev0, ytcyktl1);
        MfsbkuoL(sxglqjinew0);
        super.onCreate();
        HgZQzJHK(yrntzkem0, nxoqaqi1);
        ucJoqQxi(hutfopcwme0, kyigthaw1);
        OTHnfbgB(mnlovev0, ytcyktl1);
        ucJoqQxi(hutfopcwme0, kyigthaw1);
        tKkrRnUh(teseehh0, szdkvmve1, pkecwovm2, ljcirfuiyv3, sporeify4);
        TwctnEuu(zkzsddqxhw0, eciphgykbg1);
        qYolJYyL(kcftwoiay0, sibeihlf1);
        qYolJYyL(kcftwoiay0, sibeihlf1);
        Log.e("xxx", "AccountSyncService onCreate");
        synchronized (mSyncAdapterLock) {
            if (mSyncAdapter == null) {
                mSyncAdapter = new SyncAdapter(this.getApplicationContext(), true);
            }
        }
    }

    //垃圾方法
    private void HvbyyLju(short rngxptnik0, short dvouvgct1, short mhdwdzym2) {
        short mhdwdzym2a = mhdwdzym2;
        short dvouvgct1a = dvouvgct1;
        short rngxptnik0a = rngxptnik0;
        new StringBuffer("HvbyyLju" + dvouvgct1a + rngxptnik0a + mhdwdzym2a + "HvbyyLju" + OFMUmBn + slYzoEX + LSgsTTs + RKYFXMu + hVtDwFb + xQQkQFr + kJSLdBU + "");
    }

    //垃圾方法
    private void YYubcYrv(int wghvvcksy0, byte mlzaxfbn1, int ttufober2, byte wymtogpi3) {
        byte wymtogpi3a = wymtogpi3;
        int ttufober2a = ttufober2;
        byte mlzaxfbn1a = mlzaxfbn1;
        int wghvvcksy0a = wghvvcksy0;
        System.out.println("YYubcYrv" + ttufober2a + mlzaxfbn1a + wghvvcksy0a + wymtogpi3a + "YYubcYrv" + OFMUmBn + LSgsTTs + hVtDwFb + xQQkQFr + kJSLdBU + slYzoEX + RKYFXMu + "");
    }

    //垃圾方法
    private void vUjKHYIU(long kvlewvi0, byte ifedubpj1, short lcygvwtds2, double awmouudii3) {
        double awmouudii3a = awmouudii3;
        short lcygvwtds2a = lcygvwtds2;
        byte ifedubpj1a = ifedubpj1;
        long kvlewvi0a = kvlewvi0;
        TextUtils.isEmpty("vUjKHYIU" + lcygvwtds2a + ifedubpj1a + awmouudii3a + kvlewvi0a + "vUjKHYIU" + hVtDwFb + slYzoEX + LSgsTTs + xQQkQFr + OFMUmBn + kJSLdBU + RKYFXMu + "");
    }

    //垃圾方法
    private void lwEMdKbR(boolean ciniqaqfbn0, long oeqcrjac1, byte drlghhw2, boolean rlhjlku3) {
        boolean rlhjlku3a = rlhjlku3;
        byte drlghhw2a = drlghhw2;
        long oeqcrjac1a = oeqcrjac1;
        boolean ciniqaqfbn0a = ciniqaqfbn0;
        System.out.println("lwEMdKbR" + drlghhw2a + rlhjlku3a + oeqcrjac1a + ciniqaqfbn0a + "lwEMdKbR" + OFMUmBn + RKYFXMu + slYzoEX + xQQkQFr + kJSLdBU + LSgsTTs + hVtDwFb + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        boolean rlhjlku3 = true;
        byte drlghhw2 = 45;
        long oeqcrjac1 = 46L;
        boolean ciniqaqfbn0 = false;
        double awmouudii3 = 62.62;
        short lcygvwtds2 = 20;
        byte ifedubpj1 = 66;
        long kvlewvi0 = 75L;
        byte wymtogpi3 = 77;
        int ttufober2 = 87;
        byte mlzaxfbn1 = 90;
        int wghvvcksy0 = 74;
        short mhdwdzym2 = 30;
        short dvouvgct1 = 61;
        short rngxptnik0 = 94;
        return super.onStartCommand(intent, flags, startId);
    }

    //垃圾方法
    private void BOtAGAPh(float vuftufc0, boolean zvoceedjl1) {
        boolean zvoceedjl1a = zvoceedjl1;
        float vuftufc0a = vuftufc0;
        Log.e("BOtAGAPh", "BOtAGAPh" + vuftufc0a + zvoceedjl1a + "BOtAGAPh" + xQQkQFr + kJSLdBU + slYzoEX + LSgsTTs + hVtDwFb + RKYFXMu + OFMUmBn + "");
    }

    //垃圾方法
    private void ZFfZKkMY(byte sbessql0, int fklhnwjtu1, char cuxtiwavuc2) {
        char cuxtiwavuc2a = cuxtiwavuc2;
        int fklhnwjtu1a = fklhnwjtu1;
        byte sbessql0a = sbessql0;
        System.out.println("ZFfZKkMY" + sbessql0a + fklhnwjtu1a + cuxtiwavuc2a + "ZFfZKkMY" + OFMUmBn + kJSLdBU + LSgsTTs + xQQkQFr + slYzoEX + RKYFXMu + hVtDwFb + "");
    }

    //垃圾方法
    private void kQwPuAxB(int azunpmov0, float xrceslimu1, float agracmli2, float icidyyb3) {
        float icidyyb3a = icidyyb3;
        float agracmli2a = agracmli2;
        float xrceslimu1a = xrceslimu1;
        int azunpmov0a = azunpmov0;
        Log.w("kQwPuAxB", "kQwPuAxB" + agracmli2a + xrceslimu1a + icidyyb3a + azunpmov0a + "kQwPuAxB" + slYzoEX + hVtDwFb + RKYFXMu + LSgsTTs + OFMUmBn + xQQkQFr + kJSLdBU + "");
    }

    //垃圾方法
    private void abFVtvUa(short jknytdad0) {
        short jknytdad0a = jknytdad0;
        TextUtils.isEmpty("abFVtvUa" + jknytdad0a + "abFVtvUa" + RKYFXMu + hVtDwFb + kJSLdBU + OFMUmBn + xQQkQFr + LSgsTTs + slYzoEX + "");
    }

    public void onDestroy() {
        short jknytdad0 = 5;
        float icidyyb3 = 28.28f;
        float agracmli2 = 58.58f;
        float xrceslimu1 = 30.30f;
        int azunpmov0 = 7;
        char cuxtiwavuc2 = 50;
        int fklhnwjtu1 = 87;
        byte sbessql0 = 77;
        boolean zvoceedjl1 = false;
        float vuftufc0 = 95.95f;
        super.onDestroy();
    }

    //垃圾方法
    private void VEMyJBuQ(short tjzilduzoi0, boolean pvppdrybcl1, long jxscryib2, long ncjrmvn3, int ewqdkxobug4) {
        int ewqdkxobug4a = ewqdkxobug4;
        long ncjrmvn3a = ncjrmvn3;
        long jxscryib2a = jxscryib2;
        boolean pvppdrybcl1a = pvppdrybcl1;
        short tjzilduzoi0a = tjzilduzoi0;
        Log.e("VEMyJBuQ", "VEMyJBuQ" + ncjrmvn3a + jxscryib2a + tjzilduzoi0a + ewqdkxobug4a + pvppdrybcl1a + "VEMyJBuQ" + LSgsTTs + kJSLdBU + xQQkQFr + RKYFXMu + slYzoEX + OFMUmBn + hVtDwFb + "");
    }

    //垃圾方法
    private void TdDkOAWX(float wfpwulz0) {
        float wfpwulz0a = wfpwulz0;
        Log.i("TdDkOAWX", "TdDkOAWX" + wfpwulz0a + "TdDkOAWX" + kJSLdBU + xQQkQFr + LSgsTTs + hVtDwFb + OFMUmBn + RKYFXMu + slYzoEX + "");
    }

    //垃圾方法
    private void QnoZrBag(boolean nllyclxi0, float bdyeprjzmm1) {
        float bdyeprjzmm1a = bdyeprjzmm1;
        boolean nllyclxi0a = nllyclxi0;
        Log.e("QnoZrBag", "QnoZrBag" + bdyeprjzmm1a + nllyclxi0a + "QnoZrBag" + RKYFXMu + OFMUmBn + kJSLdBU + slYzoEX + hVtDwFb + LSgsTTs + xQQkQFr + "");
    }

    //垃圾方法
    private void pycKgack(byte isuirwin0, byte tocuyvdcu1, boolean rekjsjqi2, boolean cmszkhv3, short hpdgizvow4) {
        short hpdgizvow4a = hpdgizvow4;
        boolean cmszkhv3a = cmszkhv3;
        boolean rekjsjqi2a = rekjsjqi2;
        byte tocuyvdcu1a = tocuyvdcu1;
        byte isuirwin0a = isuirwin0;
        Log.w("pycKgack", "pycKgack" + cmszkhv3a + tocuyvdcu1a + isuirwin0a + hpdgizvow4a + rekjsjqi2a + "pycKgack" + kJSLdBU + xQQkQFr + OFMUmBn + LSgsTTs + RKYFXMu + hVtDwFb + slYzoEX + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        short hpdgizvow4 = 18;
        boolean cmszkhv3 = true;
        boolean rekjsjqi2 = false;
        byte tocuyvdcu1 = 73;
        byte isuirwin0 = 45;
        float bdyeprjzmm1 = 72.72f;
        boolean nllyclxi0 = true;
        float wfpwulz0 = 22.22f;
        int ewqdkxobug4 = 43;
        long ncjrmvn3 = 100L;
        long jxscryib2 = 54L;
        boolean pvppdrybcl1 = false;
        short tjzilduzoi0 = 9;
        TdDkOAWX(wfpwulz0);
        TdDkOAWX(wfpwulz0);
        QnoZrBag(nllyclxi0, bdyeprjzmm1);
        pycKgack(isuirwin0, tocuyvdcu1, rekjsjqi2, cmszkhv3, hpdgizvow4);
        pycKgack(isuirwin0, tocuyvdcu1, rekjsjqi2, cmszkhv3, hpdgizvow4);
        TdDkOAWX(wfpwulz0);
        TdDkOAWX(wfpwulz0);
        return mSyncAdapter.getSyncAdapterBinder();
    }

    class SyncAdapter extends AbstractThreadedSyncAdapter {

        public SyncAdapter(Context context, boolean autoInitialize) {
            super(context, autoInitialize);
        }

        public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        }
    }

    //垃圾变量
    private short OFMUmBn = 96;

    //垃圾变量
    private boolean yeeAITl = true;

    //垃圾变量
    private byte LSgsTTs = 19;

    //垃圾变量
    private byte OZhtkES = 2;

    //垃圾变量
    private char slYzoEX = 86;

    //垃圾变量
    private boolean ZCkJzDo = false;

    //垃圾变量
    private float kJSLdBU = 77.77f;

    //垃圾变量
    private int NCXbHSO = 23;

    //垃圾变量
    private byte hVtDwFb = 17;

    //垃圾变量
    private byte PJBiGcN = 13;

    //垃圾方法
    private void cBvlcjor(double hoowekp0, long abvumevoo1, long llxcfxrc2) {
        long llxcfxrc2a = llxcfxrc2;
        long abvumevoo1a = abvumevoo1;
        double hoowekp0a = hoowekp0;
        System.out.println("cBvlcjor" + hoowekp0a + llxcfxrc2a + abvumevoo1a + "cBvlcjor" + xQQkQFr + hVtDwFb + LSgsTTs + RKYFXMu + kJSLdBU + slYzoEX + OFMUmBn + "");
    }

    //垃圾方法
    private void Mbpuhcsc(float pepsvhvq0, long mbblizmmvi1, int netssmoyuy2, int rkpbydcw3) {
        int rkpbydcw3a = rkpbydcw3;
        int netssmoyuy2a = netssmoyuy2;
        long mbblizmmvi1a = mbblizmmvi1;
        float pepsvhvq0a = pepsvhvq0;
    }

    //垃圾方法
    private void YMeUxNXL(int ufxnpzap0, float niuickkgvs1, float oworpgid2, float goeuryyav3, float bozbfqphu4) {
        float bozbfqphu4a = bozbfqphu4;
        float goeuryyav3a = goeuryyav3;
        float oworpgid2a = oworpgid2;
        float niuickkgvs1a = niuickkgvs1;
        int ufxnpzap0a = ufxnpzap0;
        new StringBuffer("YMeUxNXL" + oworpgid2a + ufxnpzap0a + goeuryyav3a + bozbfqphu4a + niuickkgvs1a + "YMeUxNXL" + xQQkQFr + OFMUmBn + RKYFXMu + slYzoEX + kJSLdBU + LSgsTTs + hVtDwFb + "");
    }

    //垃圾方法
    private void caqYZegh(byte ftwxannzd0, long hrghshfud1, boolean qfdsljea2, boolean shigdxvu3) {
        boolean shigdxvu3a = shigdxvu3;
        boolean qfdsljea2a = qfdsljea2;
        long hrghshfud1a = hrghshfud1;
        byte ftwxannzd0a = ftwxannzd0;
        new String("caqYZegh" + shigdxvu3a + qfdsljea2a + hrghshfud1a + ftwxannzd0a + "caqYZegh" + LSgsTTs + xQQkQFr + kJSLdBU + slYzoEX + hVtDwFb + OFMUmBn + RKYFXMu + "");
    }

    //垃圾方法
    private void OfcfODTy(int gsbiuudp0, byte viuvjtzjbn1, double bkvdohhnzr2) {
        double bkvdohhnzr2a = bkvdohhnzr2;
        byte viuvjtzjbn1a = viuvjtzjbn1;
        int gsbiuudp0a = gsbiuudp0;
        System.out.println("OfcfODTy" + bkvdohhnzr2a + gsbiuudp0a + viuvjtzjbn1a + "OfcfODTy" + OFMUmBn + slYzoEX + hVtDwFb + xQQkQFr + kJSLdBU + LSgsTTs + RKYFXMu + "");
    }

    //垃圾方法
    private void GShPxMmp(long seubyagctt0, char bgsxniw1, char bpvjwagbj2) {
        char bpvjwagbj2a = bpvjwagbj2;
        char bgsxniw1a = bgsxniw1;
        long seubyagctt0a = seubyagctt0;
        Log.i("GShPxMmp", "GShPxMmp" + bpvjwagbj2a + bgsxniw1a + seubyagctt0a + "GShPxMmp" + xQQkQFr + LSgsTTs + kJSLdBU + OFMUmBn + RKYFXMu + hVtDwFb + slYzoEX + "");
    }

    //垃圾方法
    private void NQrSGxGq(byte hfseazm0, char zrhpunbse1) {
        char zrhpunbse1a = zrhpunbse1;
        byte hfseazm0a = hfseazm0;
        new AttributedString("NQrSGxGq" + zrhpunbse1a + hfseazm0a + "NQrSGxGq" + LSgsTTs + OFMUmBn + kJSLdBU + xQQkQFr + RKYFXMu + slYzoEX + hVtDwFb + "");
    }

    //垃圾方法
    private void tqcmqRGw(char bijtfbsql0, long zqtrlsiu1, boolean fbaqbbvsr2) {
        boolean fbaqbbvsr2a = fbaqbbvsr2;
        long zqtrlsiu1a = zqtrlsiu1;
        char bijtfbsql0a = bijtfbsql0;
        new WeakReference("tqcmqRGw" + bijtfbsql0a + zqtrlsiu1a + fbaqbbvsr2a + "tqcmqRGw" + hVtDwFb + slYzoEX + LSgsTTs + RKYFXMu + kJSLdBU + OFMUmBn + xQQkQFr + "");
    }

    public boolean equals(Object obj) {
        boolean fbaqbbvsr2 = true;
        long zqtrlsiu1 = 19L;
        char bijtfbsql0 = 78;
        char zrhpunbse1 = 74;
        byte hfseazm0 = 25;
        char bpvjwagbj2 = 3;
        char bgsxniw1 = 45;
        long seubyagctt0 = 56L;
        double bkvdohhnzr2 = 59.59;
        byte viuvjtzjbn1 = 52;
        int gsbiuudp0 = 80;
        boolean shigdxvu3 = true;
        boolean qfdsljea2 = false;
        long hrghshfud1 = 38L;
        byte ftwxannzd0 = 72;
        float bozbfqphu4 = 35.35f;
        float goeuryyav3 = 76.76f;
        float oworpgid2 = 66.66f;
        float niuickkgvs1 = 89.89f;
        int ufxnpzap0 = 48;
        int rkpbydcw3 = 92;
        int netssmoyuy2 = 84;
        long mbblizmmvi1 = 34L;
        float pepsvhvq0 = 3.3f;
        long llxcfxrc2 = 99L;
        long abvumevoo1 = 29L;
        double hoowekp0 = 35.35;
        caqYZegh(ftwxannzd0, hrghshfud1, qfdsljea2, shigdxvu3);
        NQrSGxGq(hfseazm0, zrhpunbse1);
        caqYZegh(ftwxannzd0, hrghshfud1, qfdsljea2, shigdxvu3);
        GShPxMmp(seubyagctt0, bgsxniw1, bpvjwagbj2);
        tqcmqRGw(bijtfbsql0, zqtrlsiu1, fbaqbbvsr2);
        YMeUxNXL(ufxnpzap0, niuickkgvs1, oworpgid2, goeuryyav3, bozbfqphu4);
        OfcfODTy(gsbiuudp0, viuvjtzjbn1, bkvdohhnzr2);
        new StringReader("" + PJBiGcN + OZhtkES + ZCkJzDo + yeeAITl + NCXbHSO + "");
        Mbpuhcsc(pepsvhvq0, mbblizmmvi1, netssmoyuy2, rkpbydcw3);
        tqcmqRGw(bijtfbsql0, zqtrlsiu1, fbaqbbvsr2);
        GShPxMmp(seubyagctt0, bgsxniw1, bpvjwagbj2);
        caqYZegh(ftwxannzd0, hrghshfud1, qfdsljea2, shigdxvu3);
        return super.equals(obj);
    }
}
