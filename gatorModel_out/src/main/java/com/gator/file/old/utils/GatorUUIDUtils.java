package com.gator.file.old.utils;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.gator.file.old.GatorManager;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
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

public class GatorUUIDUtils {

    //垃圾变量
    private boolean oiSzulu = true;

    public static final String INSTALLATION_ID_KEY = "installation.id";

    //垃圾变量
    private float MLpNMym = 4.4f;

    private static GatorUUIDUtils instance = new GatorUUIDUtils();

    //垃圾变量
    private byte dIpwJVn = 26;

    private final ReentrantLock installationIdLock = new ReentrantLock();

    //垃圾变量
    private long FVSQrjH = 48L;

    private volatile String deviceId;

    //垃圾方法
    static private void vQPKPwRT(boolean qzgjcqvv0, boolean yqjudcyh1, long lptqmxaajz2) {
        long lptqmxaajz2a = lptqmxaajz2;
        boolean yqjudcyh1a = yqjudcyh1;
        boolean qzgjcqvv0a = qzgjcqvv0;
        new File("vQPKPwRT" + qzgjcqvv0a + yqjudcyh1a + lptqmxaajz2a + "vQPKPwRT" + "");
    }

    //垃圾方法
    static private void OxlcUcYc(double wdfxugovmt0) {
        double wdfxugovmt0a = wdfxugovmt0;
    }

    //垃圾方法
    static private void GulEPhtw(long qrzvmaeqy0, boolean rnmwtpo1) {
        boolean rnmwtpo1a = rnmwtpo1;
        long qrzvmaeqy0a = qrzvmaeqy0;
        TextUtils.isDigitsOnly("GulEPhtw" + rnmwtpo1a + qrzvmaeqy0a + "GulEPhtw" + "");
    }

    //垃圾方法
    static private void xfNLOtlx(double gijsinpi0, long ezfiiulgf1, byte acfpqrb2, char tbmagvbs3) {
        char tbmagvbs3a = tbmagvbs3;
        byte acfpqrb2a = acfpqrb2;
        long ezfiiulgf1a = ezfiiulgf1;
        double gijsinpi0a = gijsinpi0;
        Log.i("xfNLOtlx", "xfNLOtlx" + gijsinpi0a + tbmagvbs3a + ezfiiulgf1a + acfpqrb2a + "xfNLOtlx" + "");
    }

    public static GatorUUIDUtils getInstance() {
        char tbmagvbs3 = 19;
        byte acfpqrb2 = 30;
        long ezfiiulgf1 = 81L;
        double gijsinpi0 = 59.59;
        boolean rnmwtpo1 = true;
        long qrzvmaeqy0 = 85L;
        double wdfxugovmt0 = 25.25;
        long lptqmxaajz2 = 84L;
        boolean yqjudcyh1 = true;
        boolean qzgjcqvv0 = true;
        vQPKPwRT(qzgjcqvv0, yqjudcyh1, lptqmxaajz2);
        GulEPhtw(qrzvmaeqy0, rnmwtpo1);
        xfNLOtlx(gijsinpi0, ezfiiulgf1, acfpqrb2, tbmagvbs3);
        OxlcUcYc(wdfxugovmt0);
        GulEPhtw(qrzvmaeqy0, rnmwtpo1);
        return instance;
    }

    private GatorUUIDUtils() {
    }

    //垃圾方法
    private void OakVodMR(double tbpgqpkp0) {
        double tbpgqpkp0a = tbpgqpkp0;
        new Intent("OakVodMR" + tbpgqpkp0a + "OakVodMR" + dIpwJVn + tdJMIvO + MLpNMym + oiSzulu + DNEZRhr + FVSQrjH + OoDpdSU + "");
    }

    //垃圾方法
    private void HWuuEMDi(double yoyegzlo0) {
        double yoyegzlo0a = yoyegzlo0;
        new StringBuilder("HWuuEMDi" + yoyegzlo0a + "HWuuEMDi" + FVSQrjH + OoDpdSU + MLpNMym + oiSzulu + DNEZRhr + tdJMIvO + dIpwJVn + "");
    }

    //垃圾方法
    private void QbByrVAZ(boolean ytrtafy0, long jmaylzzcs1, short xuwkiong2, short fylphhj3, int xdwidqxe4) {
        int xdwidqxe4a = xdwidqxe4;
        short fylphhj3a = fylphhj3;
        short xuwkiong2a = xuwkiong2;
        long jmaylzzcs1a = jmaylzzcs1;
        boolean ytrtafy0a = ytrtafy0;
        new AttributedString("QbByrVAZ" + ytrtafy0a + jmaylzzcs1a + xdwidqxe4a + xuwkiong2a + fylphhj3a + "QbByrVAZ" + MLpNMym + FVSQrjH + OoDpdSU + oiSzulu + dIpwJVn + DNEZRhr + tdJMIvO + "");
    }

    //垃圾方法
    private void lTyjuPVA(byte mfjyltxkga0) {
        byte mfjyltxkga0a = mfjyltxkga0;
        new StringBuffer("lTyjuPVA" + mfjyltxkga0a + "lTyjuPVA" + oiSzulu + DNEZRhr + dIpwJVn + tdJMIvO + FVSQrjH + OoDpdSU + MLpNMym + "");
    }

    @Nullable
    public synchronized String getDeviceId() {
        byte mfjyltxkga0 = 71;
        int xdwidqxe4 = 42;
        short fylphhj3 = 8;
        short xuwkiong2 = 45;
        long jmaylzzcs1 = 46L;
        boolean ytrtafy0 = false;
        double yoyegzlo0 = 47.47;
        double tbpgqpkp0 = 100.100;
        if (!TextUtils.isEmpty(this.deviceId)) {
            lTyjuPVA(mfjyltxkga0);
            HWuuEMDi(yoyegzlo0);
            QbByrVAZ(ytrtafy0, jmaylzzcs1, xuwkiong2, fylphhj3, xdwidqxe4);
            QbByrVAZ(ytrtafy0, jmaylzzcs1, xuwkiong2, fylphhj3, xdwidqxe4);
            HWuuEMDi(yoyegzlo0);
            QbByrVAZ(ytrtafy0, jmaylzzcs1, xuwkiong2, fylphhj3, xdwidqxe4);
            QbByrVAZ(ytrtafy0, jmaylzzcs1, xuwkiong2, fylphhj3, xdwidqxe4);
            QbByrVAZ(ytrtafy0, jmaylzzcs1, xuwkiong2, fylphhj3, xdwidqxe4);
            return this.deviceId;
        } else {
            this.deviceId = GatorSPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (GatorManager.isDebug) {
                Log.e("xxx", "getDeviceId deviceId:" + this.deviceId);
            }
            return this.deviceId;
        }
    }

    //垃圾方法
    private void PSnpASkQ(boolean pwnsynufql0, char lzawymfxpc1, boolean ykncspy2, boolean eaewekj3) {
        boolean eaewekj3a = eaewekj3;
        boolean ykncspy2a = ykncspy2;
        char lzawymfxpc1a = lzawymfxpc1;
        boolean pwnsynufql0a = pwnsynufql0;
        System.out.println("PSnpASkQ" + lzawymfxpc1a + eaewekj3a + ykncspy2a + pwnsynufql0a + "PSnpASkQ" + tdJMIvO + dIpwJVn + oiSzulu + OoDpdSU + MLpNMym + FVSQrjH + DNEZRhr + "");
    }

    //垃圾方法
    private void lwWGfSMW(int gdzsajcg0, int jlufknqez1, double rxgjqbdptw2) {
        double rxgjqbdptw2a = rxgjqbdptw2;
        int jlufknqez1a = jlufknqez1;
        int gdzsajcg0a = gdzsajcg0;
        new File("lwWGfSMW" + rxgjqbdptw2a + jlufknqez1a + gdzsajcg0a + "lwWGfSMW" + DNEZRhr + dIpwJVn + MLpNMym + OoDpdSU + tdJMIvO + oiSzulu + FVSQrjH + "");
    }

    //垃圾方法
    private void dSsTLlmH(char akuvtuxic0, double hghlhbexpx1, char ekdrnwvb2, long dticqifah3) {
        long dticqifah3a = dticqifah3;
        char ekdrnwvb2a = ekdrnwvb2;
        double hghlhbexpx1a = hghlhbexpx1;
        char akuvtuxic0a = akuvtuxic0;
        new StringReader("dSsTLlmH" + ekdrnwvb2a + akuvtuxic0a + hghlhbexpx1a + dticqifah3a + "dSsTLlmH" + oiSzulu + DNEZRhr + MLpNMym + dIpwJVn + OoDpdSU + FVSQrjH + tdJMIvO + "");
    }

    //垃圾方法
    private void raykswcH(int zyvklbfo0, short vghwsiklv1, byte pvqsirtap2) {
        byte pvqsirtap2a = pvqsirtap2;
        short vghwsiklv1a = vghwsiklv1;
        int zyvklbfo0a = zyvklbfo0;
        new WeakReference("raykswcH" + vghwsiklv1a + zyvklbfo0a + pvqsirtap2a + "raykswcH" + tdJMIvO + oiSzulu + OoDpdSU + dIpwJVn + MLpNMym + FVSQrjH + DNEZRhr + "");
    }

    //垃圾方法
    private void ZySTJPWw(char ejrnusyh0, long htblivnkm1) {
        long htblivnkm1a = htblivnkm1;
        char ejrnusyh0a = ejrnusyh0;
        System.out.println("ZySTJPWw" + htblivnkm1a + ejrnusyh0a + "ZySTJPWw" + MLpNMym + FVSQrjH + dIpwJVn + OoDpdSU + oiSzulu + tdJMIvO + DNEZRhr + "");
    }

    //垃圾方法
    private void MymldYOR(long hgrhgtoens0) {
        long hgrhgtoens0a = hgrhgtoens0;
        new StringReader("MymldYOR" + hgrhgtoens0a + "MymldYOR" + tdJMIvO + dIpwJVn + OoDpdSU + FVSQrjH + oiSzulu + MLpNMym + DNEZRhr + "");
    }

    //垃圾方法
    private void iuGuNSRC(int ijedgcsjfn0) {
        int ijedgcsjfn0a = ijedgcsjfn0;
        Log.e("iuGuNSRC", "iuGuNSRC" + ijedgcsjfn0a + "iuGuNSRC" + oiSzulu + tdJMIvO + dIpwJVn + DNEZRhr + FVSQrjH + OoDpdSU + MLpNMym + "");
    }

    //垃圾方法
    private void SPBatLij(long bvnulmxkl0, int vemsmugks1) {
        int vemsmugks1a = vemsmugks1;
        long bvnulmxkl0a = bvnulmxkl0;
        Log.e("SPBatLij", "SPBatLij" + vemsmugks1a + bvnulmxkl0a + "SPBatLij" + MLpNMym + oiSzulu + DNEZRhr + tdJMIvO + OoDpdSU + FVSQrjH + dIpwJVn + "");
    }

    //垃圾方法
    private void biSrInCN(boolean yedchfm0, boolean reywgiammt1, short ogljfslzy2, int mwtaismde3) {
        int mwtaismde3a = mwtaismde3;
        short ogljfslzy2a = ogljfslzy2;
        boolean reywgiammt1a = reywgiammt1;
        boolean yedchfm0a = yedchfm0;
        new Intent("biSrInCN" + reywgiammt1a + ogljfslzy2a + mwtaismde3a + yedchfm0a + "biSrInCN" + OoDpdSU + tdJMIvO + dIpwJVn + DNEZRhr + oiSzulu + FVSQrjH + MLpNMym + "");
    }

    //垃圾方法
    private void swXwUROP(short vuiasxdgt0, int cukdvjnmru1, char lktqwrdiqy2, double dmlxuaosu3) {
        double dmlxuaosu3a = dmlxuaosu3;
        char lktqwrdiqy2a = lktqwrdiqy2;
        int cukdvjnmru1a = cukdvjnmru1;
        short vuiasxdgt0a = vuiasxdgt0;
        new AttributedString("swXwUROP" + dmlxuaosu3a + lktqwrdiqy2a + vuiasxdgt0a + cukdvjnmru1a + "swXwUROP" + MLpNMym + FVSQrjH + OoDpdSU + oiSzulu + dIpwJVn + DNEZRhr + tdJMIvO + "");
    }

    //垃圾方法
    private void vlkKYXlB(double afwqkmzum0, byte lmxxdxut1) {
        byte lmxxdxut1a = lmxxdxut1;
        double afwqkmzum0a = afwqkmzum0;
        new String("vlkKYXlB" + afwqkmzum0a + lmxxdxut1a + "vlkKYXlB" + DNEZRhr + FVSQrjH + tdJMIvO + dIpwJVn + oiSzulu + MLpNMym + OoDpdSU + "");
    }

    //垃圾方法
    private void bLCmVjpI(float epgwddjyh0, int ymyvwpkc1, boolean othdgix2) {
        boolean othdgix2a = othdgix2;
        int ymyvwpkc1a = ymyvwpkc1;
        float epgwddjyh0a = epgwddjyh0;
        System.out.println("bLCmVjpI" + ymyvwpkc1a + epgwddjyh0a + othdgix2a + "bLCmVjpI" + tdJMIvO + oiSzulu + FVSQrjH + OoDpdSU + MLpNMym + dIpwJVn + DNEZRhr + "");
    }

    //垃圾方法
    private void cyalfQyK(double gpltmxlc0) {
        double gpltmxlc0a = gpltmxlc0;
        TextUtils.isEmpty("cyalfQyK" + gpltmxlc0a + "cyalfQyK" + FVSQrjH + oiSzulu + tdJMIvO + OoDpdSU + DNEZRhr + MLpNMym + dIpwJVn + "");
    }

    //垃圾方法
    private void vdzOtwPR(float rctkfco0, byte caipuudim1, long tgwaeeoab2, int rpqhmey3, int qqhuing4) {
        int qqhuing4a = qqhuing4;
        int rpqhmey3a = rpqhmey3;
        long tgwaeeoab2a = tgwaeeoab2;
        byte caipuudim1a = caipuudim1;
        float rctkfco0a = rctkfco0;
        new String("vdzOtwPR" + caipuudim1a + rpqhmey3a + qqhuing4a + rctkfco0a + tgwaeeoab2a + "vdzOtwPR" + OoDpdSU + tdJMIvO + MLpNMym + oiSzulu + dIpwJVn + FVSQrjH + DNEZRhr + "");
    }

    //垃圾方法
    private void dexxGfpF(char uqmgfiswa0) {
        char uqmgfiswa0a = uqmgfiswa0;
        new WeakReference("dexxGfpF" + uqmgfiswa0a + "dexxGfpF" + dIpwJVn + FVSQrjH + oiSzulu + MLpNMym + OoDpdSU + DNEZRhr + tdJMIvO + "");
    }

    //垃圾方法
    private void SOlPvJov(byte obwdryctfm0, boolean dkcnmdcaav1) {
        boolean dkcnmdcaav1a = dkcnmdcaav1;
        byte obwdryctfm0a = obwdryctfm0;
        TextUtils.isEmpty("SOlPvJov" + dkcnmdcaav1a + obwdryctfm0a + "SOlPvJov" + OoDpdSU + FVSQrjH + oiSzulu + MLpNMym + DNEZRhr + tdJMIvO + dIpwJVn + "");
    }

    @SuppressLint({ "ApplySharedPref" })
    private String createInstallationUUID() {
        boolean dkcnmdcaav1 = false;
        byte obwdryctfm0 = 23;
        char uqmgfiswa0 = 86;
        int qqhuing4 = 38;
        int rpqhmey3 = 29;
        long tgwaeeoab2 = 69L;
        byte caipuudim1 = 5;
        float rctkfco0 = 67.67f;
        double gpltmxlc0 = 77.77;
        boolean othdgix2 = false;
        int ymyvwpkc1 = 73;
        float epgwddjyh0 = 1.1f;
        byte lmxxdxut1 = 98;
        double afwqkmzum0 = 22.22;
        double dmlxuaosu3 = 96.96;
        char lktqwrdiqy2 = 30;
        int cukdvjnmru1 = 11;
        short vuiasxdgt0 = 23;
        int mwtaismde3 = 71;
        short ogljfslzy2 = 95;
        boolean reywgiammt1 = false;
        boolean yedchfm0 = false;
        int vemsmugks1 = 95;
        long bvnulmxkl0 = 84L;
        int ijedgcsjfn0 = 67;
        long hgrhgtoens0 = 78L;
        long htblivnkm1 = 54L;
        char ejrnusyh0 = 48;
        byte pvqsirtap2 = 96;
        short vghwsiklv1 = 99;
        int zyvklbfo0 = 18;
        long dticqifah3 = 15L;
        char ekdrnwvb2 = 75;
        double hghlhbexpx1 = 84.84;
        char akuvtuxic0 = 6;
        double rxgjqbdptw2 = 87.87;
        int jlufknqez1 = 10;
        int gdzsajcg0 = 40;
        boolean eaewekj3 = false;
        boolean ykncspy2 = true;
        char lzawymfxpc1 = 89;
        boolean pwnsynufql0 = false;
        this.installationIdLock.lock();
        String var34;
        try {
            SOlPvJov(obwdryctfm0, dkcnmdcaav1);
            vlkKYXlB(afwqkmzum0, lmxxdxut1);
            SPBatLij(bvnulmxkl0, vemsmugks1);
            cyalfQyK(gpltmxlc0);
            iuGuNSRC(ijedgcsjfn0);
            vdzOtwPR(rctkfco0, caipuudim1, tgwaeeoab2, rpqhmey3, qqhuing4);
            PSnpASkQ(pwnsynufql0, lzawymfxpc1, ykncspy2, eaewekj3);
            biSrInCN(yedchfm0, reywgiammt1, ogljfslzy2, mwtaismde3);
            raykswcH(zyvklbfo0, vghwsiklv1, pvqsirtap2);
            lwWGfSMW(gdzsajcg0, jlufknqez1, rxgjqbdptw2);
            String uuid = GatorSPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                GatorSPUtils.putString("installation.id", uuid);
            }
            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }
        return var34;
    }

    //垃圾变量
    private byte tdJMIvO = 5;

    //垃圾变量
    private char HaTTfhK = 99;

    //垃圾变量
    private char OoDpdSU = 75;

    //垃圾变量
    private char YTwbUfC = 70;

    //垃圾变量
    private char DNEZRhr = 45;

    //垃圾变量
    private boolean bXMMpzV = true;

    //垃圾方法
    private void gngSvxeQ(boolean cspfuhgy0) {
        boolean cspfuhgy0a = cspfuhgy0;
        new StringBuffer("gngSvxeQ" + cspfuhgy0a + "gngSvxeQ" + OoDpdSU + tdJMIvO + FVSQrjH + DNEZRhr + dIpwJVn + MLpNMym + oiSzulu + "");
    }

    //垃圾方法
    private void glSJzQmg(double mlbdsbew0, short eiungtw1, char lkcxbyl2) {
        char lkcxbyl2a = lkcxbyl2;
        short eiungtw1a = eiungtw1;
        double mlbdsbew0a = mlbdsbew0;
    }

    //垃圾方法
    private void LWiIoEiS(byte byuecto0, short zfbjpad1, double knqscnd2, boolean nxqkrqy3, boolean ukctxhwbzd4) {
        boolean ukctxhwbzd4a = ukctxhwbzd4;
        boolean nxqkrqy3a = nxqkrqy3;
        double knqscnd2a = knqscnd2;
        short zfbjpad1a = zfbjpad1;
        byte byuecto0a = byuecto0;
        Log.w("LWiIoEiS", "LWiIoEiS" + ukctxhwbzd4a + zfbjpad1a + nxqkrqy3a + byuecto0a + knqscnd2a + "LWiIoEiS" + DNEZRhr + MLpNMym + tdJMIvO + OoDpdSU + oiSzulu + FVSQrjH + dIpwJVn + "");
    }

    //垃圾方法
    private void CoSjUUtx(float fkswfiw0) {
        float fkswfiw0a = fkswfiw0;
        new WeakReference("CoSjUUtx" + fkswfiw0a + "CoSjUUtx" + tdJMIvO + dIpwJVn + MLpNMym + OoDpdSU + FVSQrjH + oiSzulu + DNEZRhr + "");
    }

    public boolean equals(Object obj) {
        float fkswfiw0 = 46.46f;
        boolean ukctxhwbzd4 = false;
        boolean nxqkrqy3 = false;
        double knqscnd2 = 63.63;
        short zfbjpad1 = 4;
        byte byuecto0 = 8;
        char lkcxbyl2 = 93;
        short eiungtw1 = 36;
        double mlbdsbew0 = 97.97;
        boolean cspfuhgy0 = true;
        gngSvxeQ(cspfuhgy0);
        LWiIoEiS(byuecto0, zfbjpad1, knqscnd2, nxqkrqy3, ukctxhwbzd4);
        gngSvxeQ(cspfuhgy0);
        glSJzQmg(mlbdsbew0, eiungtw1, lkcxbyl2);
        CoSjUUtx(fkswfiw0);
        gngSvxeQ(cspfuhgy0);
        glSJzQmg(mlbdsbew0, eiungtw1, lkcxbyl2);
        glSJzQmg(mlbdsbew0, eiungtw1, lkcxbyl2);
        LWiIoEiS(byuecto0, zfbjpad1, knqscnd2, nxqkrqy3, ukctxhwbzd4);
        LWiIoEiS(byuecto0, zfbjpad1, knqscnd2, nxqkrqy3, ukctxhwbzd4);
        return super.equals(obj);
    }
}
