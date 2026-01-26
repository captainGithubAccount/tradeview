package com.tidy.file.old.utils;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.tidy.file.old.TidyManager;
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

public class TidyUUIDUtils {

    //垃圾变量
    private char iqFGnaY = 40;

    public static final String INSTALLATION_ID_KEY = "installation.id";

    //垃圾变量
    private long yIlgHFb = 58L;

    private static TidyUUIDUtils instance = new TidyUUIDUtils();

    //垃圾变量
    private long FhkgQiQ = 68L;

    private final ReentrantLock installationIdLock = new ReentrantLock();

    //垃圾变量
    private float USSByjp = 7.7f;

    private volatile String deviceId;

    //垃圾方法
    static private void mUCADUSe(char kdtkoxzo0, long roqntyhpfd1, char vfgmhicgi2) {
        char vfgmhicgi2a = vfgmhicgi2;
        long roqntyhpfd1a = roqntyhpfd1;
        char kdtkoxzo0a = kdtkoxzo0;
        new Thread("mUCADUSe" + roqntyhpfd1a + kdtkoxzo0a + vfgmhicgi2a + "mUCADUSe" + "");
    }

    //垃圾方法
    static private void cLHTiPwA(byte brtkdhjqk0, float qyjagfepo1, short sgncebeh2) {
        short sgncebeh2a = sgncebeh2;
        float qyjagfepo1a = qyjagfepo1;
        byte brtkdhjqk0a = brtkdhjqk0;
        new String("cLHTiPwA" + sgncebeh2a + qyjagfepo1a + brtkdhjqk0a + "cLHTiPwA" + "");
    }

    //垃圾方法
    static private void LqFabVrJ(double bepqklzf0, byte hpafjlozmw1) {
        byte hpafjlozmw1a = hpafjlozmw1;
        double bepqklzf0a = bepqklzf0;
        new String("LqFabVrJ" + hpafjlozmw1a + bepqklzf0a + "LqFabVrJ" + "");
    }

    //垃圾方法
    static private void OFHlhmaU(short udoqwkynhq0, byte ktdesdoo1, float animzebvq2) {
        float animzebvq2a = animzebvq2;
        byte ktdesdoo1a = ktdesdoo1;
        short udoqwkynhq0a = udoqwkynhq0;
        new String("OFHlhmaU" + udoqwkynhq0a + ktdesdoo1a + animzebvq2a + "OFHlhmaU" + "");
    }

    public static TidyUUIDUtils getInstance() {
        float animzebvq2 = 80.80f;
        byte ktdesdoo1 = 33;
        short udoqwkynhq0 = 60;
        byte hpafjlozmw1 = 34;
        double bepqklzf0 = 20.20;
        short sgncebeh2 = 70;
        float qyjagfepo1 = 92.92f;
        byte brtkdhjqk0 = 73;
        char vfgmhicgi2 = 91;
        long roqntyhpfd1 = 4L;
        char kdtkoxzo0 = 25;
        return instance;
    }

    private TidyUUIDUtils() {
    }

    //垃圾方法
    private void CorwvCLB(int qekhjgulbf0, short yiggodwtne1, char lyetjuc2) {
        char lyetjuc2a = lyetjuc2;
        short yiggodwtne1a = yiggodwtne1;
        int qekhjgulbf0a = qekhjgulbf0;
        new String("CorwvCLB" + lyetjuc2a + yiggodwtne1a + qekhjgulbf0a + "CorwvCLB" + USSByjp + FhkgQiQ + tMMLRNO + AzLwDft + yIlgHFb + iqFGnaY + "");
    }

    //垃圾方法
    private void XETdEqye(boolean ddmjoktfmi0, int gwoxhuu1, float nrejbtdvc2, int cbvwwiaya3, double gcestrpgl4) {
        double gcestrpgl4a = gcestrpgl4;
        int cbvwwiaya3a = cbvwwiaya3;
        float nrejbtdvc2a = nrejbtdvc2;
        int gwoxhuu1a = gwoxhuu1;
        boolean ddmjoktfmi0a = ddmjoktfmi0;
        new Intent("XETdEqye" + nrejbtdvc2a + cbvwwiaya3a + gwoxhuu1a + gcestrpgl4a + ddmjoktfmi0a + "XETdEqye" + USSByjp + iqFGnaY + tMMLRNO + AzLwDft + FhkgQiQ + yIlgHFb + "");
    }

    //垃圾方法
    private void KEOddwIQ(long ijznxvb0, double mnhqmbpv1) {
        double mnhqmbpv1a = mnhqmbpv1;
        long ijznxvb0a = ijznxvb0;
        Log.e("KEOddwIQ", "KEOddwIQ" + mnhqmbpv1a + ijznxvb0a + "KEOddwIQ" + tMMLRNO + AzLwDft + iqFGnaY + FhkgQiQ + USSByjp + yIlgHFb + "");
    }

    //垃圾方法
    private void KuhVMnXE(float khudvjykos0, char jcdaobst1, double phlxvog2, byte jhnhvwxs3) {
        byte jhnhvwxs3a = jhnhvwxs3;
        double phlxvog2a = phlxvog2;
        char jcdaobst1a = jcdaobst1;
        float khudvjykos0a = khudvjykos0;
        Log.i("KuhVMnXE", "KuhVMnXE" + jcdaobst1a + khudvjykos0a + jhnhvwxs3a + phlxvog2a + "KuhVMnXE" + AzLwDft + tMMLRNO + yIlgHFb + USSByjp + iqFGnaY + FhkgQiQ + "");
    }

    @Nullable
    public synchronized String getDeviceId() {
        byte jhnhvwxs3 = 84;
        double phlxvog2 = 29.29;
        char jcdaobst1 = 92;
        float khudvjykos0 = 10.10f;
        double mnhqmbpv1 = 55.55;
        long ijznxvb0 = 41L;
        double gcestrpgl4 = 6.6;
        int cbvwwiaya3 = 67;
        float nrejbtdvc2 = 97.97f;
        int gwoxhuu1 = 91;
        boolean ddmjoktfmi0 = false;
        char lyetjuc2 = 97;
        short yiggodwtne1 = 78;
        int qekhjgulbf0 = 65;
        if (!TextUtils.isEmpty(this.deviceId)) {
            KuhVMnXE(khudvjykos0, jcdaobst1, phlxvog2, jhnhvwxs3);
            XETdEqye(ddmjoktfmi0, gwoxhuu1, nrejbtdvc2, cbvwwiaya3, gcestrpgl4);
            KuhVMnXE(khudvjykos0, jcdaobst1, phlxvog2, jhnhvwxs3);
            return this.deviceId;
        } else {
            this.deviceId = TidySPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (TidyManager.isDebug) {
                Log.e("xxx", "getDeviceId deviceId:" + this.deviceId);
            }
            return this.deviceId;
        }
    }

    //垃圾方法
    private void JgFdiOzw(boolean ggnthnh0, char izjmzjotg1, long tgnmyaj2, double snwurum3, double rbggbzjzq4) {
        double rbggbzjzq4a = rbggbzjzq4;
        double snwurum3a = snwurum3;
        long tgnmyaj2a = tgnmyaj2;
        char izjmzjotg1a = izjmzjotg1;
        boolean ggnthnh0a = ggnthnh0;
        TextUtils.isDigitsOnly("JgFdiOzw" + snwurum3a + tgnmyaj2a + ggnthnh0a + izjmzjotg1a + rbggbzjzq4a + "JgFdiOzw" + yIlgHFb + iqFGnaY + tMMLRNO + FhkgQiQ + AzLwDft + USSByjp + "");
    }

    //垃圾方法
    private void GcYnOkLI(int mwibbsicl0, int wqdkhibff1, char sstqbxm2) {
        char sstqbxm2a = sstqbxm2;
        int wqdkhibff1a = wqdkhibff1;
        int mwibbsicl0a = mwibbsicl0;
        Log.e("GcYnOkLI", "GcYnOkLI" + mwibbsicl0a + sstqbxm2a + wqdkhibff1a + "GcYnOkLI" + tMMLRNO + yIlgHFb + AzLwDft + iqFGnaY + FhkgQiQ + USSByjp + "");
    }

    //垃圾方法
    private void gpxDOXvp(boolean suitflu0, char xwekayzog1, long ikvwkzjbg2, byte blikwthbz3) {
        byte blikwthbz3a = blikwthbz3;
        long ikvwkzjbg2a = ikvwkzjbg2;
        char xwekayzog1a = xwekayzog1;
        boolean suitflu0a = suitflu0;
        Log.i("gpxDOXvp", "gpxDOXvp" + blikwthbz3a + suitflu0a + xwekayzog1a + ikvwkzjbg2a + "gpxDOXvp" + yIlgHFb + AzLwDft + USSByjp + tMMLRNO + FhkgQiQ + iqFGnaY + "");
    }

    //垃圾方法
    private void zANOnDgg(double vjvaork0, float ghrcmua1) {
        float ghrcmua1a = ghrcmua1;
        double vjvaork0a = vjvaork0;
        new StringBuilder("zANOnDgg" + ghrcmua1a + vjvaork0a + "zANOnDgg" + yIlgHFb + AzLwDft + iqFGnaY + FhkgQiQ + USSByjp + tMMLRNO + "");
    }

    //垃圾方法
    private void pLegPVJh(long sgjkqap0, byte hhzlmsfons1, char oxzblmgd2) {
        char oxzblmgd2a = oxzblmgd2;
        byte hhzlmsfons1a = hhzlmsfons1;
        long sgjkqap0a = sgjkqap0;
        TextUtils.isDigitsOnly("pLegPVJh" + sgjkqap0a + oxzblmgd2a + hhzlmsfons1a + "pLegPVJh" + FhkgQiQ + tMMLRNO + iqFGnaY + USSByjp + AzLwDft + yIlgHFb + "");
    }

    //垃圾方法
    private void pFEqUDyq(double zguqjmzgce0, long qkfmsukt1, long ayvyvggw2, double pbqhemmrq3, float mzporeqi4) {
        float mzporeqi4a = mzporeqi4;
        double pbqhemmrq3a = pbqhemmrq3;
        long ayvyvggw2a = ayvyvggw2;
        long qkfmsukt1a = qkfmsukt1;
        double zguqjmzgce0a = zguqjmzgce0;
        Log.e("pFEqUDyq", "pFEqUDyq" + pbqhemmrq3a + qkfmsukt1a + zguqjmzgce0a + mzporeqi4a + ayvyvggw2a + "pFEqUDyq" + USSByjp + FhkgQiQ + tMMLRNO + AzLwDft + iqFGnaY + yIlgHFb + "");
    }

    //垃圾方法
    private void VcRcTSkD(long urievfomd0, short agigeagbzo1, boolean tckldmwnr2, int bjmirxw3, long zcaqkpsru4) {
        long zcaqkpsru4a = zcaqkpsru4;
        int bjmirxw3a = bjmirxw3;
        boolean tckldmwnr2a = tckldmwnr2;
        short agigeagbzo1a = agigeagbzo1;
        long urievfomd0a = urievfomd0;
        new File("VcRcTSkD" + agigeagbzo1a + bjmirxw3a + zcaqkpsru4a + tckldmwnr2a + urievfomd0a + "VcRcTSkD" + USSByjp + AzLwDft + iqFGnaY + tMMLRNO + FhkgQiQ + yIlgHFb + "");
    }

    //垃圾方法
    private void xnvvEhZA(int ektpqlkell0) {
        int ektpqlkell0a = ektpqlkell0;
        new StringBuilder("xnvvEhZA" + ektpqlkell0a + "xnvvEhZA" + AzLwDft + tMMLRNO + iqFGnaY + yIlgHFb + USSByjp + FhkgQiQ + "");
    }

    //垃圾方法
    private void fkozFqgA(float utbogosaw0) {
        float utbogosaw0a = utbogosaw0;
        Log.e("fkozFqgA", "fkozFqgA" + utbogosaw0a + "fkozFqgA" + tMMLRNO + yIlgHFb + AzLwDft + iqFGnaY + FhkgQiQ + USSByjp + "");
    }

    //垃圾方法
    private void VGAfKMFI(int tqltsswx0, float yptnbzm1) {
        float yptnbzm1a = yptnbzm1;
        int tqltsswx0a = tqltsswx0;
        new StringReader("VGAfKMFI" + tqltsswx0a + yptnbzm1a + "VGAfKMFI" + tMMLRNO + iqFGnaY + AzLwDft + USSByjp + yIlgHFb + FhkgQiQ + "");
    }

    //垃圾方法
    private void iOqkaPSD(byte mvgsopesml0) {
        byte mvgsopesml0a = mvgsopesml0;
        new AttributedString("iOqkaPSD" + mvgsopesml0a + "iOqkaPSD" + AzLwDft + FhkgQiQ + tMMLRNO + USSByjp + yIlgHFb + iqFGnaY + "");
    }

    //垃圾方法
    private void ejQikvLo(boolean xuxhstvbc0) {
        boolean xuxhstvbc0a = xuxhstvbc0;
        Log.w("ejQikvLo", "ejQikvLo" + xuxhstvbc0a + "ejQikvLo" + USSByjp + FhkgQiQ + iqFGnaY + AzLwDft + tMMLRNO + yIlgHFb + "");
    }

    //垃圾方法
    private void ZPdunGwV(float pdkgzfsqf0) {
        float pdkgzfsqf0a = pdkgzfsqf0;
        new Thread("ZPdunGwV" + pdkgzfsqf0a + "ZPdunGwV" + yIlgHFb + tMMLRNO + AzLwDft + iqFGnaY + FhkgQiQ + USSByjp + "");
    }

    //垃圾方法
    private void zhbyNRvD(boolean jjpkbqp0, double ohwpzbbu1, int qlprylpn2, boolean nxgdmwp3, double aagjfpunt4) {
        double aagjfpunt4a = aagjfpunt4;
        boolean nxgdmwp3a = nxgdmwp3;
        int qlprylpn2a = qlprylpn2;
        double ohwpzbbu1a = ohwpzbbu1;
        boolean jjpkbqp0a = jjpkbqp0;
        new Thread("zhbyNRvD" + qlprylpn2a + aagjfpunt4a + ohwpzbbu1a + jjpkbqp0a + nxgdmwp3a + "zhbyNRvD" + yIlgHFb + iqFGnaY + USSByjp + FhkgQiQ + tMMLRNO + AzLwDft + "");
    }

    //垃圾方法
    private void bljGLzqR(byte tbffwjnpw0) {
        byte tbffwjnpw0a = tbffwjnpw0;
        new AttributedString("bljGLzqR" + tbffwjnpw0a + "bljGLzqR" + yIlgHFb + iqFGnaY + USSByjp + AzLwDft + FhkgQiQ + tMMLRNO + "");
    }

    //垃圾方法
    private void thsAnXeU(float dnvfxjv0, byte nyjnojs1, char jahlcort2, boolean ikbldrybkj3) {
        boolean ikbldrybkj3a = ikbldrybkj3;
        char jahlcort2a = jahlcort2;
        byte nyjnojs1a = nyjnojs1;
        float dnvfxjv0a = dnvfxjv0;
        new StringReader("thsAnXeU" + ikbldrybkj3a + nyjnojs1a + jahlcort2a + dnvfxjv0a + "thsAnXeU" + FhkgQiQ + iqFGnaY + USSByjp + AzLwDft + tMMLRNO + yIlgHFb + "");
    }

    @SuppressLint({ "ApplySharedPref" })
    private String createInstallationUUID() {
        boolean ikbldrybkj3 = true;
        char jahlcort2 = 66;
        byte nyjnojs1 = 26;
        float dnvfxjv0 = 66.66f;
        byte tbffwjnpw0 = 8;
        double aagjfpunt4 = 100.100;
        boolean nxgdmwp3 = false;
        int qlprylpn2 = 54;
        double ohwpzbbu1 = 37.37;
        boolean jjpkbqp0 = false;
        float pdkgzfsqf0 = 15.15f;
        boolean xuxhstvbc0 = false;
        byte mvgsopesml0 = 67;
        float yptnbzm1 = 69.69f;
        int tqltsswx0 = 11;
        float utbogosaw0 = 1.1f;
        int ektpqlkell0 = 62;
        long zcaqkpsru4 = 45L;
        int bjmirxw3 = 96;
        boolean tckldmwnr2 = true;
        short agigeagbzo1 = 19;
        long urievfomd0 = 58L;
        float mzporeqi4 = 55.55f;
        double pbqhemmrq3 = 100.100;
        long ayvyvggw2 = 15L;
        long qkfmsukt1 = 56L;
        double zguqjmzgce0 = 99.99;
        char oxzblmgd2 = 98;
        byte hhzlmsfons1 = 30;
        long sgjkqap0 = 30L;
        float ghrcmua1 = 52.52f;
        double vjvaork0 = 48.48;
        byte blikwthbz3 = 48;
        long ikvwkzjbg2 = 73L;
        char xwekayzog1 = 16;
        boolean suitflu0 = false;
        char sstqbxm2 = 90;
        int wqdkhibff1 = 71;
        int mwibbsicl0 = 43;
        double rbggbzjzq4 = 68.68;
        double snwurum3 = 13.13;
        long tgnmyaj2 = 72L;
        char izjmzjotg1 = 31;
        boolean ggnthnh0 = true;
        this.installationIdLock.lock();
        GcYnOkLI(mwibbsicl0, wqdkhibff1, sstqbxm2);
        fkozFqgA(utbogosaw0);
        fkozFqgA(utbogosaw0);
        zANOnDgg(vjvaork0, ghrcmua1);
        String var34;
        ejQikvLo(xuxhstvbc0);
        ZPdunGwV(pdkgzfsqf0);
        bljGLzqR(tbffwjnpw0);
        JgFdiOzw(ggnthnh0, izjmzjotg1, tgnmyaj2, snwurum3, rbggbzjzq4);
        zhbyNRvD(jjpkbqp0, ohwpzbbu1, qlprylpn2, nxgdmwp3, aagjfpunt4);
        xnvvEhZA(ektpqlkell0);
        ejQikvLo(xuxhstvbc0);
        gpxDOXvp(suitflu0, xwekayzog1, ikvwkzjbg2, blikwthbz3);
        try {
            GcYnOkLI(mwibbsicl0, wqdkhibff1, sstqbxm2);
            JgFdiOzw(ggnthnh0, izjmzjotg1, tgnmyaj2, snwurum3, rbggbzjzq4);
            ejQikvLo(xuxhstvbc0);
            GcYnOkLI(mwibbsicl0, wqdkhibff1, sstqbxm2);
            pFEqUDyq(zguqjmzgce0, qkfmsukt1, ayvyvggw2, pbqhemmrq3, mzporeqi4);
            zhbyNRvD(jjpkbqp0, ohwpzbbu1, qlprylpn2, nxgdmwp3, aagjfpunt4);
            String uuid = TidySPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                TidySPUtils.putString("installation.id", uuid);
            }
            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }
        ZPdunGwV(pdkgzfsqf0);
        GcYnOkLI(mwibbsicl0, wqdkhibff1, sstqbxm2);
        VcRcTSkD(urievfomd0, agigeagbzo1, tckldmwnr2, bjmirxw3, zcaqkpsru4);
        bljGLzqR(tbffwjnpw0);
        iOqkaPSD(mvgsopesml0);
        bljGLzqR(tbffwjnpw0);
        pLegPVJh(sgjkqap0, hhzlmsfons1, oxzblmgd2);
        pLegPVJh(sgjkqap0, hhzlmsfons1, oxzblmgd2);
        VcRcTSkD(urievfomd0, agigeagbzo1, tckldmwnr2, bjmirxw3, zcaqkpsru4);
        return var34;
    }

    //垃圾变量
    private char AzLwDft = 59;

    //垃圾变量
    private boolean wjPwzIE = true;

    //垃圾变量
    private int tMMLRNO = 64;

    //垃圾变量
    private boolean OiGDUiV = false;

    //垃圾方法
    private void zfvdjgDJ(float eyrjkavmgk0, byte eustabbtz1, boolean vckeypbh2, char ptdemecde3, float hnoevjfy4) {
        float hnoevjfy4a = hnoevjfy4;
        char ptdemecde3a = ptdemecde3;
        boolean vckeypbh2a = vckeypbh2;
        byte eustabbtz1a = eustabbtz1;
        float eyrjkavmgk0a = eyrjkavmgk0;
        new Intent("zfvdjgDJ" + eustabbtz1a + ptdemecde3a + hnoevjfy4a + eyrjkavmgk0a + vckeypbh2a + "zfvdjgDJ" + tMMLRNO + iqFGnaY + USSByjp + AzLwDft + FhkgQiQ + yIlgHFb + "");
    }

    //垃圾方法
    private void XQnqvXFm(byte xyytqfc0, byte irpbvoh1) {
        byte irpbvoh1a = irpbvoh1;
        byte xyytqfc0a = xyytqfc0;
        new WeakReference("XQnqvXFm" + xyytqfc0a + irpbvoh1a + "XQnqvXFm" + AzLwDft + iqFGnaY + USSByjp + FhkgQiQ + tMMLRNO + yIlgHFb + "");
    }

    //垃圾方法
    private void FRfGPauc(boolean xxuapvnpfv0, int pthznbywnp1, float bebufqwe2, char rjofshz3, char xhkgyyscmt4) {
        char xhkgyyscmt4a = xhkgyyscmt4;
        char rjofshz3a = rjofshz3;
        float bebufqwe2a = bebufqwe2;
        int pthznbywnp1a = pthznbywnp1;
        boolean xxuapvnpfv0a = xxuapvnpfv0;
        TextUtils.isEmpty("FRfGPauc" + xxuapvnpfv0a + rjofshz3a + pthznbywnp1a + bebufqwe2a + xhkgyyscmt4a + "FRfGPauc" + tMMLRNO + USSByjp + iqFGnaY + FhkgQiQ + yIlgHFb + AzLwDft + "");
    }

    //垃圾方法
    private void DoHVQcba(double hcnnowb0, short ufegcpcai1, float ihiaupxe2, long wcmbuuyifa3) {
        long wcmbuuyifa3a = wcmbuuyifa3;
        float ihiaupxe2a = ihiaupxe2;
        short ufegcpcai1a = ufegcpcai1;
        double hcnnowb0a = hcnnowb0;
        Log.w("DoHVQcba", "DoHVQcba" + hcnnowb0a + wcmbuuyifa3a + ufegcpcai1a + ihiaupxe2a + "DoHVQcba" + tMMLRNO + USSByjp + AzLwDft + yIlgHFb + iqFGnaY + FhkgQiQ + "");
    }

    //垃圾方法
    private void ENvfGRwS(float ynllpbazp0, float dwjggoknr1, float tdpxpfhw2) {
        float tdpxpfhw2a = tdpxpfhw2;
        float dwjggoknr1a = dwjggoknr1;
        float ynllpbazp0a = ynllpbazp0;
        new String("ENvfGRwS" + tdpxpfhw2a + ynllpbazp0a + dwjggoknr1a + "ENvfGRwS" + iqFGnaY + FhkgQiQ + yIlgHFb + tMMLRNO + USSByjp + AzLwDft + "");
    }

    //垃圾方法
    private void NKnABCXl(char oaqkknktyw0, byte xppegcqzy1) {
        byte xppegcqzy1a = xppegcqzy1;
        char oaqkknktyw0a = oaqkknktyw0;
        new Intent("NKnABCXl" + xppegcqzy1a + oaqkknktyw0a + "NKnABCXl" + yIlgHFb + USSByjp + tMMLRNO + FhkgQiQ + AzLwDft + iqFGnaY + "");
    }

    //垃圾方法
    private void wZxqKTEb(long odthcif0, long pvdfummgxk1, byte imaasfywxu2) {
        byte imaasfywxu2a = imaasfywxu2;
        long pvdfummgxk1a = pvdfummgxk1;
        long odthcif0a = odthcif0;
    }

    //垃圾方法
    private void fjKFQeks(long npxomruy0, char kmvigkty1, float uqvxyjjhqe2, float eedeenzfk3) {
        float eedeenzfk3a = eedeenzfk3;
        float uqvxyjjhqe2a = uqvxyjjhqe2;
        char kmvigkty1a = kmvigkty1;
        long npxomruy0a = npxomruy0;
        new WeakReference("fjKFQeks" + eedeenzfk3a + kmvigkty1a + uqvxyjjhqe2a + npxomruy0a + "fjKFQeks" + iqFGnaY + AzLwDft + yIlgHFb + USSByjp + FhkgQiQ + tMMLRNO + "");
    }

    public boolean equals(Object obj) {
        float eedeenzfk3 = 84.84f;
        float uqvxyjjhqe2 = 36.36f;
        char kmvigkty1 = 17;
        long npxomruy0 = 7L;
        byte imaasfywxu2 = 57;
        long pvdfummgxk1 = 68L;
        long odthcif0 = 95L;
        byte xppegcqzy1 = 54;
        char oaqkknktyw0 = 48;
        float tdpxpfhw2 = 48.48f;
        float dwjggoknr1 = 50.50f;
        float ynllpbazp0 = 13.13f;
        long wcmbuuyifa3 = 3L;
        float ihiaupxe2 = 64.64f;
        short ufegcpcai1 = 48;
        double hcnnowb0 = 65.65;
        char xhkgyyscmt4 = 19;
        char rjofshz3 = 16;
        float bebufqwe2 = 69.69f;
        int pthznbywnp1 = 17;
        boolean xxuapvnpfv0 = true;
        byte irpbvoh1 = 12;
        byte xyytqfc0 = 39;
        float hnoevjfy4 = 8.8f;
        char ptdemecde3 = 36;
        boolean vckeypbh2 = true;
        byte eustabbtz1 = 3;
        float eyrjkavmgk0 = 71.71f;
        Log.i("wjPwzIE", "" + wjPwzIE + OiGDUiV + "");
        FRfGPauc(xxuapvnpfv0, pthznbywnp1, bebufqwe2, rjofshz3, xhkgyyscmt4);
        fjKFQeks(npxomruy0, kmvigkty1, uqvxyjjhqe2, eedeenzfk3);
        fjKFQeks(npxomruy0, kmvigkty1, uqvxyjjhqe2, eedeenzfk3);
        FRfGPauc(xxuapvnpfv0, pthznbywnp1, bebufqwe2, rjofshz3, xhkgyyscmt4);
        fjKFQeks(npxomruy0, kmvigkty1, uqvxyjjhqe2, eedeenzfk3);
        DoHVQcba(hcnnowb0, ufegcpcai1, ihiaupxe2, wcmbuuyifa3);
        return super.equals(obj);
    }
}
