package com.speed.model.old.opdj;

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

public class SpeedUserSyncService extends Service {

    //垃圾变量
    private int TYFsgnz = 59;

    private static final Object mSyncAdapterLock = new Object();

    //垃圾变量
    private int yjAiWbi = 51;

    private static SyncAdapter mSyncAdapter = null;

    public SpeedUserSyncService() {
    }

    //垃圾方法
    private void eCrTkXCZ(short ytwaodd0, short rjcbdpz1, int tjumfbint2, double zvbrpgc3, long anhydpi4) {
        long anhydpi4a = anhydpi4;
        double zvbrpgc3a = zvbrpgc3;
        int tjumfbint2a = tjumfbint2;
        short rjcbdpz1a = rjcbdpz1;
        short ytwaodd0a = ytwaodd0;
        Log.w("eCrTkXCZ", "eCrTkXCZ" + rjcbdpz1a + zvbrpgc3a + tjumfbint2a + anhydpi4a + ytwaodd0a + "eCrTkXCZ" + TYFsgnz + yjAiWbi + hAFAUbW + rtqGFFj + "");
    }

    //垃圾方法
    private void SBIwnHeW(float uynmzcdlx0, char tlkiuzu1) {
        char tlkiuzu1a = tlkiuzu1;
        float uynmzcdlx0a = uynmzcdlx0;
        System.out.println("SBIwnHeW" + tlkiuzu1a + uynmzcdlx0a + "SBIwnHeW" + rtqGFFj + TYFsgnz + hAFAUbW + yjAiWbi + "");
    }

    //垃圾方法
    private void lWxoyIvV(short rcmokhx0, long gsumdrklmy1) {
        long gsumdrklmy1a = gsumdrklmy1;
        short rcmokhx0a = rcmokhx0;
    }

    //垃圾方法
    private void oFHbTVCT(int ypoqvboyqo0, float vpodoavme1) {
        float vpodoavme1a = vpodoavme1;
        int ypoqvboyqo0a = ypoqvboyqo0;
        Log.e("oFHbTVCT", "oFHbTVCT" + vpodoavme1a + ypoqvboyqo0a + "oFHbTVCT" + yjAiWbi + hAFAUbW + rtqGFFj + TYFsgnz + "");
    }

    //垃圾方法
    private void OpLJBzmx(float ocbvbrqua0) {
        float ocbvbrqua0a = ocbvbrqua0;
        TextUtils.isEmpty("OpLJBzmx" + ocbvbrqua0a + "OpLJBzmx" + TYFsgnz + rtqGFFj + yjAiWbi + hAFAUbW + "");
    }

    //垃圾方法
    private void ZICfeHvk(short ctbxsqsw0, long tlfjrjw1, char uclbfzzbrb2) {
        char uclbfzzbrb2a = uclbfzzbrb2;
        long tlfjrjw1a = tlfjrjw1;
        short ctbxsqsw0a = ctbxsqsw0;
        Log.w("ZICfeHvk", "ZICfeHvk" + uclbfzzbrb2a + tlfjrjw1a + ctbxsqsw0a + "ZICfeHvk" + TYFsgnz + hAFAUbW + rtqGFFj + yjAiWbi + "");
    }

    //垃圾方法
    private void syCRWxLT(char sqkizln0) {
        char sqkizln0a = sqkizln0;
        new StringReader("syCRWxLT" + sqkizln0a + "syCRWxLT" + TYFsgnz + yjAiWbi + hAFAUbW + rtqGFFj + "");
    }

    //垃圾方法
    private void CqzMkJHp(byte jcpswbuko0, char tckqcvf1) {
        char tckqcvf1a = tckqcvf1;
        byte jcpswbuko0a = jcpswbuko0;
        Log.i("CqzMkJHp", "CqzMkJHp" + tckqcvf1a + jcpswbuko0a + "CqzMkJHp" + TYFsgnz + hAFAUbW + yjAiWbi + rtqGFFj + "");
    }

    //垃圾方法
    private void lxmKqxMI(int prgdfduojr0, short bdnzdeedl1) {
        short bdnzdeedl1a = bdnzdeedl1;
        int prgdfduojr0a = prgdfduojr0;
        new StringReader("lxmKqxMI" + bdnzdeedl1a + prgdfduojr0a + "lxmKqxMI" + rtqGFFj + TYFsgnz + yjAiWbi + hAFAUbW + "");
    }

    //垃圾方法
    private void imNfpBdJ(long zfnhzxbhxy0, short bfhixtdtxp1, byte ncqthcb2, char siuvvxepud3) {
        char siuvvxepud3a = siuvvxepud3;
        byte ncqthcb2a = ncqthcb2;
        short bfhixtdtxp1a = bfhixtdtxp1;
        long zfnhzxbhxy0a = zfnhzxbhxy0;
        new StringReader("imNfpBdJ" + siuvvxepud3a + bfhixtdtxp1a + ncqthcb2a + zfnhzxbhxy0a + "imNfpBdJ" + TYFsgnz + hAFAUbW + yjAiWbi + rtqGFFj + "");
    }

    //垃圾方法
    private void geHHDVzG(boolean cwltwuu0, short efwbstvucn1) {
        short efwbstvucn1a = efwbstvucn1;
        boolean cwltwuu0a = cwltwuu0;
        new WeakReference("geHHDVzG" + efwbstvucn1a + cwltwuu0a + "geHHDVzG" + hAFAUbW + rtqGFFj + yjAiWbi + TYFsgnz + "");
    }

    //垃圾方法
    private void hQfQjIoN(boolean pipcbka0) {
        boolean pipcbka0a = pipcbka0;
        Log.e("hQfQjIoN", "hQfQjIoN" + pipcbka0a + "hQfQjIoN" + TYFsgnz + rtqGFFj + yjAiWbi + hAFAUbW + "");
    }

    public void onCreate() {
        boolean pipcbka0 = true;
        short efwbstvucn1 = 66;
        boolean cwltwuu0 = false;
        char siuvvxepud3 = 15;
        byte ncqthcb2 = 29;
        short bfhixtdtxp1 = 90;
        long zfnhzxbhxy0 = 59L;
        short bdnzdeedl1 = 27;
        int prgdfduojr0 = 11;
        char tckqcvf1 = 66;
        byte jcpswbuko0 = 75;
        char sqkizln0 = 20;
        char uclbfzzbrb2 = 12;
        long tlfjrjw1 = 83L;
        short ctbxsqsw0 = 35;
        float ocbvbrqua0 = 73.73f;
        float vpodoavme1 = 45.45f;
        int ypoqvboyqo0 = 6;
        long gsumdrklmy1 = 15L;
        short rcmokhx0 = 40;
        char tlkiuzu1 = 15;
        float uynmzcdlx0 = 74.74f;
        long anhydpi4 = 8L;
        double zvbrpgc3 = 72.72;
        int tjumfbint2 = 69;
        short rjcbdpz1 = 25;
        short ytwaodd0 = 76;
        OpLJBzmx(ocbvbrqua0);
        eCrTkXCZ(ytwaodd0, rjcbdpz1, tjumfbint2, zvbrpgc3, anhydpi4);
        lxmKqxMI(prgdfduojr0, bdnzdeedl1);
        CqzMkJHp(jcpswbuko0, tckqcvf1);
        OpLJBzmx(ocbvbrqua0);
        CqzMkJHp(jcpswbuko0, tckqcvf1);
        ZICfeHvk(ctbxsqsw0, tlfjrjw1, uclbfzzbrb2);
        hQfQjIoN(pipcbka0);
        lWxoyIvV(rcmokhx0, gsumdrklmy1);
        CqzMkJHp(jcpswbuko0, tckqcvf1);
        super.onCreate();
        Log.e("xxx", "AccountSyncService onCreate");
        synchronized (mSyncAdapterLock) {
            if (mSyncAdapter == null) {
                mSyncAdapter = new SyncAdapter(this.getApplicationContext(), true);
            }
        }
    }

    //垃圾方法
    private void OUIYPnCu(long vussxikjml0, boolean zukcvxk1, short usdisxvkfz2) {
        short usdisxvkfz2a = usdisxvkfz2;
        boolean zukcvxk1a = zukcvxk1;
        long vussxikjml0a = vussxikjml0;
        new WeakReference("OUIYPnCu" + usdisxvkfz2a + vussxikjml0a + zukcvxk1a + "OUIYPnCu" + yjAiWbi + TYFsgnz + rtqGFFj + hAFAUbW + "");
    }

    //垃圾方法
    private void wyRqTuUl(short jjafyoz0, double axhnkcuof1, byte xckekaeyao2, boolean bauefyzdme3, byte upxfgzfrnn4) {
        byte upxfgzfrnn4a = upxfgzfrnn4;
        boolean bauefyzdme3a = bauefyzdme3;
        byte xckekaeyao2a = xckekaeyao2;
        double axhnkcuof1a = axhnkcuof1;
        short jjafyoz0a = jjafyoz0;
        new WeakReference("wyRqTuUl" + axhnkcuof1a + xckekaeyao2a + upxfgzfrnn4a + jjafyoz0a + bauefyzdme3a + "wyRqTuUl" + yjAiWbi + rtqGFFj + TYFsgnz + hAFAUbW + "");
    }

    //垃圾方法
    private void WVhADsyX(byte hfuearazxq0, int oxadzeqiq1) {
        int oxadzeqiq1a = oxadzeqiq1;
        byte hfuearazxq0a = hfuearazxq0;
        new StringReader("WVhADsyX" + hfuearazxq0a + oxadzeqiq1a + "WVhADsyX" + TYFsgnz + yjAiWbi + rtqGFFj + hAFAUbW + "");
    }

    //垃圾方法
    private void mFzknFeB(long puhhovsriq0, float clgmvtf1, char gtopprvz2, double lahrasn3, char vchoaodjo4) {
        char vchoaodjo4a = vchoaodjo4;
        double lahrasn3a = lahrasn3;
        char gtopprvz2a = gtopprvz2;
        float clgmvtf1a = clgmvtf1;
        long puhhovsriq0a = puhhovsriq0;
        TextUtils.isEmpty("mFzknFeB" + vchoaodjo4a + lahrasn3a + puhhovsriq0a + gtopprvz2a + clgmvtf1a + "mFzknFeB" + yjAiWbi + rtqGFFj + hAFAUbW + TYFsgnz + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        char vchoaodjo4 = 25;
        double lahrasn3 = 7.7;
        char gtopprvz2 = 67;
        float clgmvtf1 = 90.90f;
        long puhhovsriq0 = 17L;
        int oxadzeqiq1 = 30;
        byte hfuearazxq0 = 75;
        byte upxfgzfrnn4 = 81;
        boolean bauefyzdme3 = true;
        byte xckekaeyao2 = 87;
        double axhnkcuof1 = 22.22;
        short jjafyoz0 = 60;
        short usdisxvkfz2 = 65;
        boolean zukcvxk1 = true;
        long vussxikjml0 = 26L;
        WVhADsyX(hfuearazxq0, oxadzeqiq1);
        mFzknFeB(puhhovsriq0, clgmvtf1, gtopprvz2, lahrasn3, vchoaodjo4);
        wyRqTuUl(jjafyoz0, axhnkcuof1, xckekaeyao2, bauefyzdme3, upxfgzfrnn4);
        return super.onStartCommand(intent, flags, startId);
    }

    //垃圾方法
    private void vYcVhNtc(int rbwkwhv0, char rkwmsxjw1, int jrftmeprdd2) {
        int jrftmeprdd2a = jrftmeprdd2;
        char rkwmsxjw1a = rkwmsxjw1;
        int rbwkwhv0a = rbwkwhv0;
        Log.e("vYcVhNtc", "vYcVhNtc" + jrftmeprdd2a + rkwmsxjw1a + rbwkwhv0a + "vYcVhNtc" + hAFAUbW + rtqGFFj + yjAiWbi + TYFsgnz + "");
    }

    //垃圾方法
    private void PdxWffFQ(double irfjwckpuu0) {
        double irfjwckpuu0a = irfjwckpuu0;
        Log.i("PdxWffFQ", "PdxWffFQ" + irfjwckpuu0a + "PdxWffFQ" + rtqGFFj + TYFsgnz + yjAiWbi + hAFAUbW + "");
    }

    //垃圾方法
    private void sVCxYrUB(double tpdqorutxd0, double vdbomaz1, double qfowammrb2) {
        double qfowammrb2a = qfowammrb2;
        double vdbomaz1a = vdbomaz1;
        double tpdqorutxd0a = tpdqorutxd0;
        new AttributedString("sVCxYrUB" + vdbomaz1a + qfowammrb2a + tpdqorutxd0a + "sVCxYrUB" + hAFAUbW + rtqGFFj + TYFsgnz + yjAiWbi + "");
    }

    //垃圾方法
    private void paLIrkmu(long eytocbh0, short rnubsnsm1, long uslqoqnvms2, int fqddzwr3) {
        int fqddzwr3a = fqddzwr3;
        long uslqoqnvms2a = uslqoqnvms2;
        short rnubsnsm1a = rnubsnsm1;
        long eytocbh0a = eytocbh0;
        new StringBuffer("paLIrkmu" + eytocbh0a + fqddzwr3a + uslqoqnvms2a + rnubsnsm1a + "paLIrkmu" + TYFsgnz + rtqGFFj + hAFAUbW + yjAiWbi + "");
    }

    public void onDestroy() {
        int fqddzwr3 = 1;
        long uslqoqnvms2 = 97L;
        short rnubsnsm1 = 72;
        long eytocbh0 = 27L;
        double qfowammrb2 = 78.78;
        double vdbomaz1 = 92.92;
        double tpdqorutxd0 = 74.74;
        double irfjwckpuu0 = 0.0;
        int jrftmeprdd2 = 97;
        char rkwmsxjw1 = 92;
        int rbwkwhv0 = 100;
        super.onDestroy();
    }

    //垃圾方法
    private void WXSPeqvA(boolean grwwybhnb0, char mulunlkt1, int cxuqtdhzpv2, char rjlzybsf3) {
        char rjlzybsf3a = rjlzybsf3;
        int cxuqtdhzpv2a = cxuqtdhzpv2;
        char mulunlkt1a = mulunlkt1;
        boolean grwwybhnb0a = grwwybhnb0;
        new StringBuilder("WXSPeqvA" + mulunlkt1a + cxuqtdhzpv2a + rjlzybsf3a + grwwybhnb0a + "WXSPeqvA" + TYFsgnz + rtqGFFj + yjAiWbi + hAFAUbW + "");
    }

    //垃圾方法
    private void kSduabDc(int ybpaauj0) {
        int ybpaauj0a = ybpaauj0;
        new Intent("kSduabDc" + ybpaauj0a + "kSduabDc" + hAFAUbW + rtqGFFj + yjAiWbi + TYFsgnz + "");
    }

    //垃圾方法
    private void izCWXbZQ(long qoapwntzj0, boolean jvolftp1) {
        boolean jvolftp1a = jvolftp1;
        long qoapwntzj0a = qoapwntzj0;
        new Thread("izCWXbZQ" + jvolftp1a + qoapwntzj0a + "izCWXbZQ" + rtqGFFj + hAFAUbW + TYFsgnz + yjAiWbi + "");
    }

    //垃圾方法
    private void qlIMuzSM(long ycukcdh0, long utecknjeb1, boolean zjlyjaec2, char xxtbiumon3, boolean wicninmnp4) {
        boolean wicninmnp4a = wicninmnp4;
        char xxtbiumon3a = xxtbiumon3;
        boolean zjlyjaec2a = zjlyjaec2;
        long utecknjeb1a = utecknjeb1;
        long ycukcdh0a = ycukcdh0;
        TextUtils.isDigitsOnly("qlIMuzSM" + xxtbiumon3a + wicninmnp4a + zjlyjaec2a + ycukcdh0a + utecknjeb1a + "qlIMuzSM" + hAFAUbW + TYFsgnz + rtqGFFj + yjAiWbi + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        boolean wicninmnp4 = true;
        char xxtbiumon3 = 91;
        boolean zjlyjaec2 = true;
        long utecknjeb1 = 34L;
        long ycukcdh0 = 42L;
        boolean jvolftp1 = true;
        long qoapwntzj0 = 30L;
        int ybpaauj0 = 50;
        char rjlzybsf3 = 38;
        int cxuqtdhzpv2 = 17;
        char mulunlkt1 = 80;
        boolean grwwybhnb0 = false;
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
    private byte hAFAUbW = 71;

    //垃圾变量
    private int TDfnSFf = 67;

    //垃圾变量
    private boolean rtqGFFj = false;

    //垃圾变量
    private short BMXBdDd = 88;

    //垃圾方法
    private void dsqfpDmx(short uspojwxu0, double bdmqbwxmfl1, long pepwoollh2) {
        long pepwoollh2a = pepwoollh2;
        double bdmqbwxmfl1a = bdmqbwxmfl1;
        short uspojwxu0a = uspojwxu0;
        Log.w("dsqfpDmx", "dsqfpDmx" + pepwoollh2a + bdmqbwxmfl1a + uspojwxu0a + "dsqfpDmx" + hAFAUbW + yjAiWbi + TYFsgnz + rtqGFFj + "");
    }

    //垃圾方法
    private void UKGcKoFd(char znvnnctub0, float wuwznwd1) {
        float wuwznwd1a = wuwznwd1;
        char znvnnctub0a = znvnnctub0;
        Log.i("UKGcKoFd", "UKGcKoFd" + znvnnctub0a + wuwznwd1a + "UKGcKoFd" + hAFAUbW + TYFsgnz + rtqGFFj + yjAiWbi + "");
    }

    //垃圾方法
    private void vqKdmvwB(short phpknhlajd0, float dblosiiqkg1, double xpmoxdof2, double vsjagxy3) {
        double vsjagxy3a = vsjagxy3;
        double xpmoxdof2a = xpmoxdof2;
        float dblosiiqkg1a = dblosiiqkg1;
        short phpknhlajd0a = phpknhlajd0;
        new AttributedString("vqKdmvwB" + dblosiiqkg1a + vsjagxy3a + xpmoxdof2a + phpknhlajd0a + "vqKdmvwB" + hAFAUbW + TYFsgnz + yjAiWbi + rtqGFFj + "");
    }

    //垃圾方法
    private void OPIwfqFM(int jwuvpjesgn0, double jdigolvwg1, byte nhvfszraqm2, double rdchadih3, int vzannrqzf4) {
        int vzannrqzf4a = vzannrqzf4;
        double rdchadih3a = rdchadih3;
        byte nhvfszraqm2a = nhvfszraqm2;
        double jdigolvwg1a = jdigolvwg1;
        int jwuvpjesgn0a = jwuvpjesgn0;
        new String("OPIwfqFM" + vzannrqzf4a + nhvfszraqm2a + jdigolvwg1a + rdchadih3a + jwuvpjesgn0a + "OPIwfqFM" + yjAiWbi + TYFsgnz + rtqGFFj + hAFAUbW + "");
    }

    //垃圾方法
    private void YTFzjJqj(int swklnyivat0, short lmtfwextpq1, float npywtwhdco2) {
        float npywtwhdco2a = npywtwhdco2;
        short lmtfwextpq1a = lmtfwextpq1;
        int swklnyivat0a = swklnyivat0;
        Log.e("YTFzjJqj", "YTFzjJqj" + lmtfwextpq1a + swklnyivat0a + npywtwhdco2a + "YTFzjJqj" + TYFsgnz + hAFAUbW + yjAiWbi + rtqGFFj + "");
    }

    //垃圾方法
    private void PCDcfQQC(int bpwrussjmz0, int jmvdliwbzc1) {
        int jmvdliwbzc1a = jmvdliwbzc1;
        int bpwrussjmz0a = bpwrussjmz0;
        new StringReader("PCDcfQQC" + bpwrussjmz0a + jmvdliwbzc1a + "PCDcfQQC" + yjAiWbi + TYFsgnz + rtqGFFj + hAFAUbW + "");
    }

    //垃圾方法
    private void rZlzxFSY(short gmtmunrc0) {
        short gmtmunrc0a = gmtmunrc0;
        Log.i("rZlzxFSY", "rZlzxFSY" + gmtmunrc0a + "rZlzxFSY" + yjAiWbi + hAFAUbW + rtqGFFj + TYFsgnz + "");
    }

    //垃圾方法
    private void aEJSfUaF(boolean drzymknnkj0, float otporpg1, boolean pvpxogqig2) {
        boolean pvpxogqig2a = pvpxogqig2;
        float otporpg1a = otporpg1;
        boolean drzymknnkj0a = drzymknnkj0;
    }

    public boolean equals(Object obj) {
        boolean pvpxogqig2 = true;
        float otporpg1 = 87.87f;
        boolean drzymknnkj0 = false;
        short gmtmunrc0 = 80;
        int jmvdliwbzc1 = 26;
        int bpwrussjmz0 = 64;
        float npywtwhdco2 = 38.38f;
        short lmtfwextpq1 = 50;
        int swklnyivat0 = 44;
        int vzannrqzf4 = 53;
        double rdchadih3 = 68.68;
        byte nhvfszraqm2 = 46;
        double jdigolvwg1 = 37.37;
        int jwuvpjesgn0 = 66;
        double vsjagxy3 = 21.21;
        double xpmoxdof2 = 77.77;
        float dblosiiqkg1 = 78.78f;
        short phpknhlajd0 = 33;
        float wuwznwd1 = 86.86f;
        char znvnnctub0 = 75;
        long pepwoollh2 = 48L;
        double bdmqbwxmfl1 = 26.26;
        short uspojwxu0 = 34;
        TextUtils.isDigitsOnly("" + BMXBdDd + TDfnSFf + "");
        UKGcKoFd(znvnnctub0, wuwznwd1);
        vqKdmvwB(phpknhlajd0, dblosiiqkg1, xpmoxdof2, vsjagxy3);
        aEJSfUaF(drzymknnkj0, otporpg1, pvpxogqig2);
        vqKdmvwB(phpknhlajd0, dblosiiqkg1, xpmoxdof2, vsjagxy3);
        aEJSfUaF(drzymknnkj0, otporpg1, pvpxogqig2);
        rZlzxFSY(gmtmunrc0);
        rZlzxFSY(gmtmunrc0);
        rZlzxFSY(gmtmunrc0);
        dsqfpDmx(uspojwxu0, bdmqbwxmfl1, pepwoollh2);
        return super.equals(obj);
    }
}
