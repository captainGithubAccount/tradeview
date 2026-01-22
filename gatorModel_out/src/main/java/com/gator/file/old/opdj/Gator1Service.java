package com.gator.file.old.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.gator.IProcessServiceGator;
import com.gator.file.old.GatorManager;
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

public class Gator1Service extends Service {

    //垃圾变量
    private char QqbhKNL = 48;

    public static long lastTime = 0L;

    //垃圾变量
    private double jKyxWve = 36.36;

    private static String TAG = "xxx";

    //垃圾变量
    private long IMYcGDJ = 55L;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private byte UlMskSY = 63;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private short PifTqjz = 61;

    public static Boolean isLiving = false;

    //垃圾变量
    private double osNgwJt = 19.19;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private byte EFVBcUw = 5;

    private static long delayTime = 250L;

    //垃圾变量
    private short xzwNnoL = 26;

    public static boolean isStartService = false;

    //垃圾变量
    private byte dCwqzRU = 20;

    private IBinder subBinder = null;

    //垃圾变量
    private short dLuhrFC = 35;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private byte BmlIrCa = 89;

    int nextNum = -1;

    public Gator1Service() {
    }

    //垃圾方法
    static private void zNxmHipB(int hvxfdsbeim0, int hpvbwrkgd1, float duunlgqumf2, byte pzxqcnh3, char ojannwslt4) {
        char ojannwslt4a = ojannwslt4;
        byte pzxqcnh3a = pzxqcnh3;
        float duunlgqumf2a = duunlgqumf2;
        int hpvbwrkgd1a = hpvbwrkgd1;
        int hvxfdsbeim0a = hvxfdsbeim0;
    }

    //垃圾方法
    static private void wgXEoMGG(char icvwyizoo0) {
        char icvwyizoo0a = icvwyizoo0;
        new String("wgXEoMGG" + icvwyizoo0a + "wgXEoMGG" + "");
    }

    //垃圾方法
    static private void PFhUVBYE(double zxotgon0, double ruqytgvm1, double nyrfyzkt2, double wssrevh3, byte szggcofvw4) {
        byte szggcofvw4a = szggcofvw4;
        double wssrevh3a = wssrevh3;
        double nyrfyzkt2a = nyrfyzkt2;
        double ruqytgvm1a = ruqytgvm1;
        double zxotgon0a = zxotgon0;
        new File("PFhUVBYE" + szggcofvw4a + zxotgon0a + nyrfyzkt2a + ruqytgvm1a + wssrevh3a + "PFhUVBYE" + "");
    }

    //垃圾方法
    static private void pBEotDcp(short szjzfse0, double bsffmdh1, char lorjpspbq2, short oewzafvc3, double zjpnsayhz4) {
        double zjpnsayhz4a = zjpnsayhz4;
        short oewzafvc3a = oewzafvc3;
        char lorjpspbq2a = lorjpspbq2;
        double bsffmdh1a = bsffmdh1;
        short szjzfse0a = szjzfse0;
        new AttributedString("pBEotDcp" + zjpnsayhz4a + oewzafvc3a + szjzfse0a + bsffmdh1a + lorjpspbq2a + "pBEotDcp" + "");
    }

    public static void tryStartLaunchMainService() {
        double zjpnsayhz4 = 53.53;
        short oewzafvc3 = 83;
        char lorjpspbq2 = 69;
        double bsffmdh1 = 10.10;
        short szjzfse0 = 18;
        byte szggcofvw4 = 26;
        double wssrevh3 = 92.92;
        double nyrfyzkt2 = 50.50;
        double ruqytgvm1 = 92.92;
        double zxotgon0 = 9.9;
        char icvwyizoo0 = 8;
        char ojannwslt4 = 29;
        byte pzxqcnh3 = 62;
        float duunlgqumf2 = 88.88f;
        int hpvbwrkgd1 = 46;
        int hvxfdsbeim0 = 87;
        if (isLiving) {
            wgXEoMGG(icvwyizoo0);
            zNxmHipB(hvxfdsbeim0, hpvbwrkgd1, duunlgqumf2, pzxqcnh3, ojannwslt4);
            wgXEoMGG(icvwyizoo0);
            zNxmHipB(hvxfdsbeim0, hpvbwrkgd1, duunlgqumf2, pzxqcnh3, ojannwslt4);
            wgXEoMGG(icvwyizoo0);
            PFhUVBYE(zxotgon0, ruqytgvm1, nyrfyzkt2, wssrevh3, szggcofvw4);
            pBEotDcp(szjzfse0, bsffmdh1, lorjpspbq2, oewzafvc3, zjpnsayhz4);
            PFhUVBYE(zxotgon0, ruqytgvm1, nyrfyzkt2, wssrevh3, szggcofvw4);
            if (GatorManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (GatorManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(GatorManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void myONHUII(int bopxseco0) {
        int bopxseco0a = bopxseco0;
        TextUtils.isDigitsOnly("myONHUII" + bopxseco0a + "myONHUII" + "");
    }

    //垃圾方法
    static private void JJzoEKQN(int kdaplxkihy0, long ksvnvfqw1, double kfmxcyxbc2) {
        double kfmxcyxbc2a = kfmxcyxbc2;
        long ksvnvfqw1a = ksvnvfqw1;
        int kdaplxkihy0a = kdaplxkihy0;
        new File("JJzoEKQN" + kfmxcyxbc2a + ksvnvfqw1a + kdaplxkihy0a + "JJzoEKQN" + "");
    }

    //垃圾方法
    static private void OzmrMmQg(byte ukcgsyttt0, char mfhbkpjqb1, boolean ogmsvrh2, char rvsgsca3) {
        char rvsgsca3a = rvsgsca3;
        boolean ogmsvrh2a = ogmsvrh2;
        char mfhbkpjqb1a = mfhbkpjqb1;
        byte ukcgsyttt0a = ukcgsyttt0;
        Log.w("OzmrMmQg", "OzmrMmQg" + rvsgsca3a + ukcgsyttt0a + mfhbkpjqb1a + ogmsvrh2a + "OzmrMmQg" + "");
    }

    //垃圾方法
    static private void CrJwXgNO(long nlonuhd0) {
        long nlonuhd0a = nlonuhd0;
        new String("CrJwXgNO" + nlonuhd0a + "CrJwXgNO" + "");
    }

    //垃圾方法
    static private void HGqyZJfm(int dsoidchisn0) {
        int dsoidchisn0a = dsoidchisn0;
        TextUtils.isDigitsOnly("HGqyZJfm" + dsoidchisn0a + "HGqyZJfm" + "");
    }

    //垃圾方法
    static private void YvlUjouy(float opwgqdflk0, short xjzzzgqvi1, float zmlhioecx2, double rurdsjsgy3, double spfctkpfug4) {
        double spfctkpfug4a = spfctkpfug4;
        double rurdsjsgy3a = rurdsjsgy3;
        float zmlhioecx2a = zmlhioecx2;
        short xjzzzgqvi1a = xjzzzgqvi1;
        float opwgqdflk0a = opwgqdflk0;
        new File("YvlUjouy" + opwgqdflk0a + rurdsjsgy3a + spfctkpfug4a + xjzzzgqvi1a + zmlhioecx2a + "YvlUjouy" + "");
    }

    //垃圾方法
    static private void lwtxKiBL(boolean fwwwgzy0, boolean btzfvtktj1) {
        boolean btzfvtktj1a = btzfvtktj1;
        boolean fwwwgzy0a = fwwwgzy0;
        new AttributedString("lwtxKiBL" + fwwwgzy0a + btzfvtktj1a + "lwtxKiBL" + "");
    }

    //垃圾方法
    static private void EafiyUGh(char oxaltdr0, short svscyie1, double qexceljgy2) {
        double qexceljgy2a = qexceljgy2;
        short svscyie1a = svscyie1;
        char oxaltdr0a = oxaltdr0;
        new StringReader("EafiyUGh" + qexceljgy2a + oxaltdr0a + svscyie1a + "EafiyUGh" + "");
    }

    private static void startService(Context context) {
        double qexceljgy2 = 99.99;
        short svscyie1 = 49;
        char oxaltdr0 = 51;
        boolean btzfvtktj1 = false;
        boolean fwwwgzy0 = false;
        double spfctkpfug4 = 33.33;
        double rurdsjsgy3 = 65.65;
        float zmlhioecx2 = 15.15f;
        short xjzzzgqvi1 = 92;
        float opwgqdflk0 = 17.17f;
        int dsoidchisn0 = 97;
        long nlonuhd0 = 37L;
        char rvsgsca3 = 31;
        boolean ogmsvrh2 = false;
        char mfhbkpjqb1 = 39;
        byte ukcgsyttt0 = 50;
        double kfmxcyxbc2 = 4.4;
        long ksvnvfqw1 = 90L;
        int kdaplxkihy0 = 53;
        int bopxseco0 = 65;
        if (GatorManager.isDebug) {
            Log.i(TAG, "LocalService startService5");
        }
        if (!doStartMainService(context)) {
            JJzoEKQN(kdaplxkihy0, ksvnvfqw1, kfmxcyxbc2);
            YvlUjouy(opwgqdflk0, xjzzzgqvi1, zmlhioecx2, rurdsjsgy3, spfctkpfug4);
            HGqyZJfm(dsoidchisn0);
            OzmrMmQg(ukcgsyttt0, mfhbkpjqb1, ogmsvrh2, rvsgsca3);
            myONHUII(bopxseco0);
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void HcxlWOoY(long hrdwxqp0, float xkzcitzwc1) {
        float xkzcitzwc1a = xkzcitzwc1;
        long hrdwxqp0a = hrdwxqp0;
        new StringBuilder("HcxlWOoY" + xkzcitzwc1a + hrdwxqp0a + "HcxlWOoY" + QqbhKNL + IMYcGDJ + jKyxWve + EFVBcUw + osNgwJt + dLuhrFC + UlMskSY + dCwqzRU + VXwKqYa + mOUnidq + HvgMaOm + BmlIrCa + pOrKmYJ + JwUdBAv + PifTqjz + xzwNnoL + "");
    }

    //垃圾方法
    private void FwkUoSLA(char njjgyehwij0, boolean hjbtzdn1, short sgdkjxza2, byte ttzkijz3, long pxmjwxnez4) {
        long pxmjwxnez4a = pxmjwxnez4;
        byte ttzkijz3a = ttzkijz3;
        short sgdkjxza2a = sgdkjxza2;
        boolean hjbtzdn1a = hjbtzdn1;
        char njjgyehwij0a = njjgyehwij0;
    }

    //垃圾方法
    private void Mttpqgqy(boolean rcaklhhsg0, long mlymscwsis1, char ivfjyxq2, char pucedud3, long vkwxwvn4) {
        long vkwxwvn4a = vkwxwvn4;
        char pucedud3a = pucedud3;
        char ivfjyxq2a = ivfjyxq2;
        long mlymscwsis1a = mlymscwsis1;
        boolean rcaklhhsg0a = rcaklhhsg0;
        Log.e("Mttpqgqy", "Mttpqgqy" + mlymscwsis1a + rcaklhhsg0a + vkwxwvn4a + ivfjyxq2a + pucedud3a + "Mttpqgqy" + UlMskSY + mOUnidq + dLuhrFC + jKyxWve + pOrKmYJ + HvgMaOm + IMYcGDJ + osNgwJt + QqbhKNL + dCwqzRU + VXwKqYa + PifTqjz + EFVBcUw + JwUdBAv + BmlIrCa + xzwNnoL + "");
    }

    //垃圾方法
    private void GNpMQsMD(byte bgcvnilgc0, boolean mqfwgxjfo1, boolean wnemhvnbpt2, boolean uodwwluuh3) {
        boolean uodwwluuh3a = uodwwluuh3;
        boolean wnemhvnbpt2a = wnemhvnbpt2;
        boolean mqfwgxjfo1a = mqfwgxjfo1;
        byte bgcvnilgc0a = bgcvnilgc0;
        TextUtils.isDigitsOnly("GNpMQsMD" + bgcvnilgc0a + wnemhvnbpt2a + uodwwluuh3a + mqfwgxjfo1a + "GNpMQsMD" + IMYcGDJ + xzwNnoL + EFVBcUw + dLuhrFC + UlMskSY + mOUnidq + QqbhKNL + dCwqzRU + pOrKmYJ + BmlIrCa + osNgwJt + HvgMaOm + VXwKqYa + PifTqjz + jKyxWve + JwUdBAv + "");
    }

    //垃圾方法
    private void CVHrgtpD(double xwxebxf0) {
        double xwxebxf0a = xwxebxf0;
        new WeakReference("CVHrgtpD" + xwxebxf0a + "CVHrgtpD" + QqbhKNL + xzwNnoL + osNgwJt + HvgMaOm + VXwKqYa + UlMskSY + dCwqzRU + pOrKmYJ + EFVBcUw + mOUnidq + PifTqjz + BmlIrCa + dLuhrFC + IMYcGDJ + JwUdBAv + jKyxWve + "");
    }

    //垃圾方法
    private void HIkgDDJN(double gramzzptzv0, float fzwyfozfr1, boolean crhsxxdg2) {
        boolean crhsxxdg2a = crhsxxdg2;
        float fzwyfozfr1a = fzwyfozfr1;
        double gramzzptzv0a = gramzzptzv0;
        new StringBuilder("HIkgDDJN" + crhsxxdg2a + gramzzptzv0a + fzwyfozfr1a + "HIkgDDJN" + dCwqzRU + IMYcGDJ + jKyxWve + UlMskSY + PifTqjz + EFVBcUw + VXwKqYa + pOrKmYJ + HvgMaOm + QqbhKNL + xzwNnoL + JwUdBAv + BmlIrCa + mOUnidq + osNgwJt + dLuhrFC + "");
    }

    //垃圾方法
    private void NeZlRDkE(double greslfvo0) {
        double greslfvo0a = greslfvo0;
        Log.e("NeZlRDkE", "NeZlRDkE" + greslfvo0a + "NeZlRDkE" + BmlIrCa + IMYcGDJ + osNgwJt + JwUdBAv + VXwKqYa + pOrKmYJ + xzwNnoL + jKyxWve + UlMskSY + HvgMaOm + PifTqjz + mOUnidq + EFVBcUw + dCwqzRU + QqbhKNL + dLuhrFC + "");
    }

    //垃圾方法
    private void vrCyPmfd(double obnsnhdxkp0) {
        double obnsnhdxkp0a = obnsnhdxkp0;
        new StringBuilder("vrCyPmfd" + obnsnhdxkp0a + "vrCyPmfd" + EFVBcUw + JwUdBAv + VXwKqYa + HvgMaOm + jKyxWve + xzwNnoL + IMYcGDJ + PifTqjz + osNgwJt + dCwqzRU + dLuhrFC + mOUnidq + QqbhKNL + pOrKmYJ + BmlIrCa + UlMskSY + "");
    }

    //垃圾方法
    private void UxPjoofC(char sehkhoirw0, int dwjjstatr1, double ptbhtyvff2, short sobcrcsrbq3) {
        short sobcrcsrbq3a = sobcrcsrbq3;
        double ptbhtyvff2a = ptbhtyvff2;
        int dwjjstatr1a = dwjjstatr1;
        char sehkhoirw0a = sehkhoirw0;
    }

    //垃圾方法
    private void vtmQhGDf(int onzlfzwsu0, boolean kdeufbnzm1, char sgspbonzkd2, int rhwtkzzzor3) {
        int rhwtkzzzor3a = rhwtkzzzor3;
        char sgspbonzkd2a = sgspbonzkd2;
        boolean kdeufbnzm1a = kdeufbnzm1;
        int onzlfzwsu0a = onzlfzwsu0;
        new StringBuilder("vtmQhGDf" + rhwtkzzzor3a + onzlfzwsu0a + kdeufbnzm1a + sgspbonzkd2a + "vtmQhGDf" + PifTqjz + QqbhKNL + IMYcGDJ + pOrKmYJ + HvgMaOm + UlMskSY + dLuhrFC + BmlIrCa + xzwNnoL + JwUdBAv + jKyxWve + VXwKqYa + EFVBcUw + dCwqzRU + mOUnidq + osNgwJt + "");
    }

    //垃圾方法
    private void BDSISzXD(char bnksejjnv0, byte oqbyahir1, float ssegzvwavd2) {
        float ssegzvwavd2a = ssegzvwavd2;
        byte oqbyahir1a = oqbyahir1;
        char bnksejjnv0a = bnksejjnv0;
        new AttributedString("BDSISzXD" + oqbyahir1a + bnksejjnv0a + ssegzvwavd2a + "BDSISzXD" + IMYcGDJ + pOrKmYJ + osNgwJt + PifTqjz + EFVBcUw + dLuhrFC + BmlIrCa + dCwqzRU + HvgMaOm + mOUnidq + UlMskSY + QqbhKNL + VXwKqYa + xzwNnoL + jKyxWve + JwUdBAv + "");
    }

    //垃圾方法
    private void Zbpoddaa(long mldqsnfcj0, int djjrsjjhz1, int suljgfv2, float fnpafwxx3, short hyqsrwgstd4) {
        short hyqsrwgstd4a = hyqsrwgstd4;
        float fnpafwxx3a = fnpafwxx3;
        int suljgfv2a = suljgfv2;
        int djjrsjjhz1a = djjrsjjhz1;
        long mldqsnfcj0a = mldqsnfcj0;
        new StringBuffer("Zbpoddaa" + djjrsjjhz1a + fnpafwxx3a + hyqsrwgstd4a + mldqsnfcj0a + suljgfv2a + "Zbpoddaa" + BmlIrCa + xzwNnoL + pOrKmYJ + dLuhrFC + PifTqjz + jKyxWve + QqbhKNL + osNgwJt + dCwqzRU + EFVBcUw + JwUdBAv + UlMskSY + VXwKqYa + HvgMaOm + IMYcGDJ + mOUnidq + "");
    }

    //垃圾方法
    private void wbwvANYZ(short qafrsiq0, boolean ifcgjhyagj1) {
        boolean ifcgjhyagj1a = ifcgjhyagj1;
        short qafrsiq0a = qafrsiq0;
        new String("wbwvANYZ" + qafrsiq0a + ifcgjhyagj1a + "wbwvANYZ" + QqbhKNL + xzwNnoL + VXwKqYa + PifTqjz + dCwqzRU + UlMskSY + IMYcGDJ + EFVBcUw + HvgMaOm + dLuhrFC + mOUnidq + JwUdBAv + BmlIrCa + jKyxWve + pOrKmYJ + osNgwJt + "");
    }

    //垃圾方法
    private void wxMolpnj(char rzleuzvyh0, short oplvxwhikk1, int jtcaeie2) {
        int jtcaeie2a = jtcaeie2;
        short oplvxwhikk1a = oplvxwhikk1;
        char rzleuzvyh0a = rzleuzvyh0;
        new AttributedString("wxMolpnj" + oplvxwhikk1a + rzleuzvyh0a + jtcaeie2a + "wxMolpnj" + osNgwJt + mOUnidq + UlMskSY + VXwKqYa + JwUdBAv + xzwNnoL + PifTqjz + BmlIrCa + dLuhrFC + jKyxWve + IMYcGDJ + QqbhKNL + dCwqzRU + pOrKmYJ + HvgMaOm + EFVBcUw + "");
    }

    //垃圾方法
    private void kUtqVLpK(long fdvbhpmsy0, float ezkzfmj1, short exohpge2) {
        short exohpge2a = exohpge2;
        float ezkzfmj1a = ezkzfmj1;
        long fdvbhpmsy0a = fdvbhpmsy0;
        new String("kUtqVLpK" + fdvbhpmsy0a + ezkzfmj1a + exohpge2a + "kUtqVLpK" + mOUnidq + xzwNnoL + IMYcGDJ + pOrKmYJ + UlMskSY + osNgwJt + JwUdBAv + VXwKqYa + BmlIrCa + dLuhrFC + EFVBcUw + PifTqjz + HvgMaOm + dCwqzRU + QqbhKNL + jKyxWve + "");
    }

    //垃圾方法
    private void ODkstWJK(byte xldxpivcra0, double bjawfbp1, byte kdbzdbkwk2, char froagsanbu3) {
        char froagsanbu3a = froagsanbu3;
        byte kdbzdbkwk2a = kdbzdbkwk2;
        double bjawfbp1a = bjawfbp1;
        byte xldxpivcra0a = xldxpivcra0;
        TextUtils.isEmpty("ODkstWJK" + bjawfbp1a + froagsanbu3a + kdbzdbkwk2a + xldxpivcra0a + "ODkstWJK" + UlMskSY + jKyxWve + JwUdBAv + VXwKqYa + mOUnidq + BmlIrCa + dCwqzRU + EFVBcUw + HvgMaOm + xzwNnoL + PifTqjz + pOrKmYJ + osNgwJt + dLuhrFC + QqbhKNL + IMYcGDJ + "");
    }

    //垃圾方法
    private void GsSoqedF(float pmxbeeyr0, long iftnugyquf1, short yfmkcsvbu2) {
        short yfmkcsvbu2a = yfmkcsvbu2;
        long iftnugyquf1a = iftnugyquf1;
        float pmxbeeyr0a = pmxbeeyr0;
        new StringReader("GsSoqedF" + iftnugyquf1a + yfmkcsvbu2a + pmxbeeyr0a + "GsSoqedF" + UlMskSY + HvgMaOm + IMYcGDJ + EFVBcUw + VXwKqYa + JwUdBAv + dCwqzRU + pOrKmYJ + dLuhrFC + PifTqjz + QqbhKNL + BmlIrCa + xzwNnoL + osNgwJt + mOUnidq + jKyxWve + "");
    }

    //垃圾方法
    private void bRdSPvWM(double bvjmkmxsf0, int srbidzeist1, boolean vfzgbnlp2) {
        boolean vfzgbnlp2a = vfzgbnlp2;
        int srbidzeist1a = srbidzeist1;
        double bvjmkmxsf0a = bvjmkmxsf0;
    }

    //垃圾方法
    private void IPVBhyQT(short klfsfoaeie0, double xejxyxujsy1, short ibhpbihpv2) {
        short ibhpbihpv2a = ibhpbihpv2;
        double xejxyxujsy1a = xejxyxujsy1;
        short klfsfoaeie0a = klfsfoaeie0;
        TextUtils.isDigitsOnly("IPVBhyQT" + xejxyxujsy1a + ibhpbihpv2a + klfsfoaeie0a + "IPVBhyQT" + mOUnidq + UlMskSY + PifTqjz + IMYcGDJ + BmlIrCa + pOrKmYJ + osNgwJt + HvgMaOm + jKyxWve + EFVBcUw + xzwNnoL + QqbhKNL + dCwqzRU + JwUdBAv + VXwKqYa + dLuhrFC + "");
    }

    //垃圾方法
    private void AjPofTTu(boolean mhdusmeuhq0, byte mrrdqws1, long xvvvbbggpv2, long xdzgxwqlaa3, float fwdaxrtlpj4) {
        float fwdaxrtlpj4a = fwdaxrtlpj4;
        long xdzgxwqlaa3a = xdzgxwqlaa3;
        long xvvvbbggpv2a = xvvvbbggpv2;
        byte mrrdqws1a = mrrdqws1;
        boolean mhdusmeuhq0a = mhdusmeuhq0;
        new AttributedString("AjPofTTu" + xdzgxwqlaa3a + mhdusmeuhq0a + mrrdqws1a + fwdaxrtlpj4a + xvvvbbggpv2a + "AjPofTTu" + VXwKqYa + IMYcGDJ + PifTqjz + BmlIrCa + jKyxWve + osNgwJt + xzwNnoL + JwUdBAv + pOrKmYJ + mOUnidq + UlMskSY + QqbhKNL + HvgMaOm + EFVBcUw + dCwqzRU + dLuhrFC + "");
    }

    //垃圾方法
    private void YgmFLOVs(char bxxwzjmtgy0) {
        char bxxwzjmtgy0a = bxxwzjmtgy0;
        new WeakReference("YgmFLOVs" + bxxwzjmtgy0a + "YgmFLOVs" + xzwNnoL + HvgMaOm + PifTqjz + mOUnidq + osNgwJt + BmlIrCa + pOrKmYJ + QqbhKNL + JwUdBAv + jKyxWve + dLuhrFC + dCwqzRU + EFVBcUw + UlMskSY + VXwKqYa + IMYcGDJ + "");
    }

    //垃圾方法
    private void pAYWWyrA(char yqzoknjto0, byte ushdsbl1, char tdntkffh2, short tuybpyl3) {
        short tuybpyl3a = tuybpyl3;
        char tdntkffh2a = tdntkffh2;
        byte ushdsbl1a = ushdsbl1;
        char yqzoknjto0a = yqzoknjto0;
        new Thread("pAYWWyrA" + tdntkffh2a + tuybpyl3a + yqzoknjto0a + ushdsbl1a + "pAYWWyrA" + pOrKmYJ + UlMskSY + PifTqjz + IMYcGDJ + VXwKqYa + HvgMaOm + EFVBcUw + jKyxWve + dLuhrFC + xzwNnoL + mOUnidq + dCwqzRU + JwUdBAv + QqbhKNL + BmlIrCa + osNgwJt + "");
    }

    //垃圾方法
    private void RRgGFhkh(long xlzhxyy0, float tgcjtoblrw1) {
        float tgcjtoblrw1a = tgcjtoblrw1;
        long xlzhxyy0a = xlzhxyy0;
        new StringReader("RRgGFhkh" + xlzhxyy0a + tgcjtoblrw1a + "RRgGFhkh" + jKyxWve + JwUdBAv + dLuhrFC + pOrKmYJ + IMYcGDJ + dCwqzRU + mOUnidq + HvgMaOm + PifTqjz + osNgwJt + QqbhKNL + VXwKqYa + EFVBcUw + xzwNnoL + UlMskSY + BmlIrCa + "");
    }

    //垃圾方法
    private void deIiKOey(double dgjiyazqkf0, char caqxcjkt1, long wmdxrrllfu2, float nvrrdfcc3) {
        float nvrrdfcc3a = nvrrdfcc3;
        long wmdxrrllfu2a = wmdxrrllfu2;
        char caqxcjkt1a = caqxcjkt1;
        double dgjiyazqkf0a = dgjiyazqkf0;
        TextUtils.isEmpty("deIiKOey" + wmdxrrllfu2a + dgjiyazqkf0a + caqxcjkt1a + nvrrdfcc3a + "deIiKOey" + HvgMaOm + VXwKqYa + jKyxWve + mOUnidq + xzwNnoL + BmlIrCa + PifTqjz + QqbhKNL + IMYcGDJ + pOrKmYJ + JwUdBAv + dCwqzRU + UlMskSY + osNgwJt + EFVBcUw + dLuhrFC + "");
    }

    //垃圾方法
    private void HcJZQhxL(double tawqanvcan0) {
        double tawqanvcan0a = tawqanvcan0;
        Log.i("HcJZQhxL", "HcJZQhxL" + tawqanvcan0a + "HcJZQhxL" + PifTqjz + QqbhKNL + dCwqzRU + pOrKmYJ + dLuhrFC + HvgMaOm + EFVBcUw + JwUdBAv + UlMskSY + BmlIrCa + xzwNnoL + jKyxWve + osNgwJt + VXwKqYa + mOUnidq + IMYcGDJ + "");
    }

    //垃圾方法
    private void RVmTcrlt(long zdrmqvsmms0, long zljkhge1) {
        long zljkhge1a = zljkhge1;
        long zdrmqvsmms0a = zdrmqvsmms0;
    }

    //垃圾方法
    private void VtfOMXAA(boolean ivdmyru0, short kujejbbgz1, float sslghzxq2, byte axfwbjx3, double hvojluizz4) {
        double hvojluizz4a = hvojluizz4;
        byte axfwbjx3a = axfwbjx3;
        float sslghzxq2a = sslghzxq2;
        short kujejbbgz1a = kujejbbgz1;
        boolean ivdmyru0a = ivdmyru0;
        Log.w("VtfOMXAA", "VtfOMXAA" + ivdmyru0a + kujejbbgz1a + hvojluizz4a + sslghzxq2a + axfwbjx3a + "VtfOMXAA" + EFVBcUw + pOrKmYJ + jKyxWve + dLuhrFC + osNgwJt + UlMskSY + xzwNnoL + HvgMaOm + VXwKqYa + PifTqjz + BmlIrCa + JwUdBAv + mOUnidq + dCwqzRU + IMYcGDJ + QqbhKNL + "");
    }

    //垃圾方法
    private void UpWNqzWr(int bngtqcn0) {
        int bngtqcn0a = bngtqcn0;
    }

    public void onCreate() {
        int bngtqcn0 = 79;
        double hvojluizz4 = 94.94;
        byte axfwbjx3 = 55;
        float sslghzxq2 = 43.43f;
        short kujejbbgz1 = 77;
        boolean ivdmyru0 = false;
        long zljkhge1 = 47L;
        long zdrmqvsmms0 = 85L;
        double tawqanvcan0 = 1.1;
        float nvrrdfcc3 = 91.91f;
        long wmdxrrllfu2 = 72L;
        char caqxcjkt1 = 78;
        double dgjiyazqkf0 = 12.12;
        float tgcjtoblrw1 = 77.77f;
        long xlzhxyy0 = 90L;
        short tuybpyl3 = 64;
        char tdntkffh2 = 6;
        byte ushdsbl1 = 44;
        char yqzoknjto0 = 20;
        char bxxwzjmtgy0 = 11;
        float fwdaxrtlpj4 = 74.74f;
        long xdzgxwqlaa3 = 23L;
        long xvvvbbggpv2 = 46L;
        byte mrrdqws1 = 17;
        boolean mhdusmeuhq0 = false;
        short ibhpbihpv2 = 69;
        double xejxyxujsy1 = 75.75;
        short klfsfoaeie0 = 86;
        boolean vfzgbnlp2 = true;
        int srbidzeist1 = 5;
        double bvjmkmxsf0 = 69.69;
        short yfmkcsvbu2 = 96;
        long iftnugyquf1 = 58L;
        float pmxbeeyr0 = 55.55f;
        char froagsanbu3 = 22;
        byte kdbzdbkwk2 = 44;
        double bjawfbp1 = 25.25;
        byte xldxpivcra0 = 59;
        short exohpge2 = 82;
        float ezkzfmj1 = 42.42f;
        long fdvbhpmsy0 = 59L;
        int jtcaeie2 = 32;
        short oplvxwhikk1 = 77;
        char rzleuzvyh0 = 92;
        boolean ifcgjhyagj1 = true;
        short qafrsiq0 = 54;
        short hyqsrwgstd4 = 18;
        float fnpafwxx3 = 30.30f;
        int suljgfv2 = 88;
        int djjrsjjhz1 = 24;
        long mldqsnfcj0 = 6L;
        float ssegzvwavd2 = 35.35f;
        byte oqbyahir1 = 22;
        char bnksejjnv0 = 9;
        int rhwtkzzzor3 = 42;
        char sgspbonzkd2 = 80;
        boolean kdeufbnzm1 = false;
        int onzlfzwsu0 = 6;
        short sobcrcsrbq3 = 11;
        double ptbhtyvff2 = 32.32;
        int dwjjstatr1 = 65;
        char sehkhoirw0 = 79;
        double obnsnhdxkp0 = 58.58;
        double greslfvo0 = 95.95;
        boolean crhsxxdg2 = true;
        float fzwyfozfr1 = 43.43f;
        double gramzzptzv0 = 83.83;
        double xwxebxf0 = 34.34;
        boolean uodwwluuh3 = false;
        boolean wnemhvnbpt2 = true;
        boolean mqfwgxjfo1 = false;
        byte bgcvnilgc0 = 98;
        long vkwxwvn4 = 30L;
        char pucedud3 = 62;
        char ivfjyxq2 = 50;
        long mlymscwsis1 = 21L;
        boolean rcaklhhsg0 = true;
        long pxmjwxnez4 = 35L;
        byte ttzkijz3 = 13;
        short sgdkjxza2 = 34;
        boolean hjbtzdn1 = false;
        char njjgyehwij0 = 41;
        float xkzcitzwc1 = 37.37f;
        long hrdwxqp0 = 17L;
        YgmFLOVs(bxxwzjmtgy0);
        UxPjoofC(sehkhoirw0, dwjjstatr1, ptbhtyvff2, sobcrcsrbq3);
        IPVBhyQT(klfsfoaeie0, xejxyxujsy1, ibhpbihpv2);
        IPVBhyQT(klfsfoaeie0, xejxyxujsy1, ibhpbihpv2);
        YgmFLOVs(bxxwzjmtgy0);
        HcJZQhxL(tawqanvcan0);
        BDSISzXD(bnksejjnv0, oqbyahir1, ssegzvwavd2);
        IPVBhyQT(klfsfoaeie0, xejxyxujsy1, ibhpbihpv2);
        GNpMQsMD(bgcvnilgc0, mqfwgxjfo1, wnemhvnbpt2, uodwwluuh3);
        FwkUoSLA(njjgyehwij0, hjbtzdn1, sgdkjxza2, ttzkijz3, pxmjwxnez4);
        isLiving = true;
        super.onCreate();
        HIkgDDJN(gramzzptzv0, fzwyfozfr1, crhsxxdg2);
        YgmFLOVs(bxxwzjmtgy0);
        AjPofTTu(mhdusmeuhq0, mrrdqws1, xvvvbbggpv2, xdzgxwqlaa3, fwdaxrtlpj4);
        HIkgDDJN(gramzzptzv0, fzwyfozfr1, crhsxxdg2);
        NeZlRDkE(greslfvo0);
        AjPofTTu(mhdusmeuhq0, mrrdqws1, xvvvbbggpv2, xdzgxwqlaa3, fwdaxrtlpj4);
        NeZlRDkE(greslfvo0);
        HcJZQhxL(tawqanvcan0);
        HIkgDDJN(gramzzptzv0, fzwyfozfr1, crhsxxdg2);
        if (GatorManager.isDebug) {
            bRdSPvWM(bvjmkmxsf0, srbidzeist1, vfzgbnlp2);
            VtfOMXAA(ivdmyru0, kujejbbgz1, sslghzxq2, axfwbjx3, hvojluizz4);
            HcxlWOoY(hrdwxqp0, xkzcitzwc1);
            GsSoqedF(pmxbeeyr0, iftnugyquf1, yfmkcsvbu2);
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        this.mLocalBinder = new LocalBinder(this);
        deIiKOey(dgjiyazqkf0, caqxcjkt1, wmdxrrllfu2, nvrrdfcc3);
        bRdSPvWM(bvjmkmxsf0, srbidzeist1, vfzgbnlp2);
        wxMolpnj(rzleuzvyh0, oplvxwhikk1, jtcaeie2);
        kUtqVLpK(fdvbhpmsy0, ezkzfmj1, exohpge2);
        Mttpqgqy(rcaklhhsg0, mlymscwsis1, ivfjyxq2, pucedud3, vkwxwvn4);
        if (this.mLocalServiceConn == null) {
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        vtmQhGDf(onzlfzwsu0, kdeufbnzm1, sgspbonzkd2, rhwtkzzzor3);
        wbwvANYZ(qafrsiq0, ifcgjhyagj1);
        GNpMQsMD(bgcvnilgc0, mqfwgxjfo1, wnemhvnbpt2, uodwwluuh3);
        YgmFLOVs(bxxwzjmtgy0);
        isReTryBinding = true;
        this.startSubService(1, false);
    }

    //垃圾方法
    private void wzOgAlEz(char ymtnfyfzs0, int cfprpldybo1, boolean fjnyeoydh2, boolean kdyhfrjj3, char tzximjohrb4) {
        char tzximjohrb4a = tzximjohrb4;
        boolean kdyhfrjj3a = kdyhfrjj3;
        boolean fjnyeoydh2a = fjnyeoydh2;
        int cfprpldybo1a = cfprpldybo1;
        char ymtnfyfzs0a = ymtnfyfzs0;
    }

    //垃圾方法
    private void kDtgURvV(long yfkcojjrt0) {
        long yfkcojjrt0a = yfkcojjrt0;
        TextUtils.isDigitsOnly("kDtgURvV" + yfkcojjrt0a + "kDtgURvV" + pOrKmYJ + HvgMaOm + osNgwJt + VXwKqYa + QqbhKNL + JwUdBAv + UlMskSY + jKyxWve + mOUnidq + dCwqzRU + IMYcGDJ + EFVBcUw + dLuhrFC + PifTqjz + xzwNnoL + BmlIrCa + "");
    }

    //垃圾方法
    private void PDtUgdGX(short tfczbxe0, long yxkeqmk1, short uctpswxlhv2, byte fdamjhg3, float edyqyzx4) {
        float edyqyzx4a = edyqyzx4;
        byte fdamjhg3a = fdamjhg3;
        short uctpswxlhv2a = uctpswxlhv2;
        long yxkeqmk1a = yxkeqmk1;
        short tfczbxe0a = tfczbxe0;
        Log.e("PDtUgdGX", "PDtUgdGX" + tfczbxe0a + fdamjhg3a + uctpswxlhv2a + edyqyzx4a + yxkeqmk1a + "PDtUgdGX" + IMYcGDJ + VXwKqYa + BmlIrCa + jKyxWve + QqbhKNL + xzwNnoL + PifTqjz + mOUnidq + EFVBcUw + osNgwJt + UlMskSY + dCwqzRU + dLuhrFC + HvgMaOm + pOrKmYJ + JwUdBAv + "");
    }

    //垃圾方法
    private void TYxepCOv(byte mtrwlquvg0, long bdmrnple1, short synueinv2, int tpgejlsyi3) {
        int tpgejlsyi3a = tpgejlsyi3;
        short synueinv2a = synueinv2;
        long bdmrnple1a = bdmrnple1;
        byte mtrwlquvg0a = mtrwlquvg0;
        new String("TYxepCOv" + bdmrnple1a + tpgejlsyi3a + synueinv2a + mtrwlquvg0a + "TYxepCOv" + HvgMaOm + pOrKmYJ + PifTqjz + IMYcGDJ + JwUdBAv + dLuhrFC + VXwKqYa + UlMskSY + QqbhKNL + jKyxWve + dCwqzRU + osNgwJt + EFVBcUw + xzwNnoL + BmlIrCa + mOUnidq + "");
    }

    public void onRebind(Intent intent) {
        int tpgejlsyi3 = 80;
        short synueinv2 = 40;
        long bdmrnple1 = 76L;
        byte mtrwlquvg0 = 49;
        float edyqyzx4 = 27.27f;
        byte fdamjhg3 = 49;
        short uctpswxlhv2 = 80;
        long yxkeqmk1 = 62L;
        short tfczbxe0 = 95;
        long yfkcojjrt0 = 67L;
        char tzximjohrb4 = 34;
        boolean kdyhfrjj3 = false;
        boolean fjnyeoydh2 = false;
        int cfprpldybo1 = 38;
        char ymtnfyfzs0 = 6;
        super.onRebind(intent);
    }

    //垃圾方法
    private void aVTbvOjc(int ywrkthjb0, char qjkfsqp1, int zcgmupymdq2) {
        int zcgmupymdq2a = zcgmupymdq2;
        char qjkfsqp1a = qjkfsqp1;
        int ywrkthjb0a = ywrkthjb0;
        new StringBuilder("aVTbvOjc" + ywrkthjb0a + qjkfsqp1a + zcgmupymdq2a + "aVTbvOjc" + xzwNnoL + JwUdBAv + EFVBcUw + dCwqzRU + dLuhrFC + UlMskSY + HvgMaOm + osNgwJt + QqbhKNL + PifTqjz + jKyxWve + BmlIrCa + IMYcGDJ + VXwKqYa + mOUnidq + pOrKmYJ + "");
    }

    //垃圾方法
    private void cVlCdRqT(byte jfkilhzn0, boolean xuugrgpik1, short nfqmccij2, short rvdyrhavow3, char fafyrbwm4) {
        char fafyrbwm4a = fafyrbwm4;
        short rvdyrhavow3a = rvdyrhavow3;
        short nfqmccij2a = nfqmccij2;
        boolean xuugrgpik1a = xuugrgpik1;
        byte jfkilhzn0a = jfkilhzn0;
        System.out.println("cVlCdRqT" + nfqmccij2a + jfkilhzn0a + fafyrbwm4a + rvdyrhavow3a + xuugrgpik1a + "cVlCdRqT" + BmlIrCa + osNgwJt + HvgMaOm + UlMskSY + pOrKmYJ + QqbhKNL + VXwKqYa + dLuhrFC + xzwNnoL + IMYcGDJ + PifTqjz + jKyxWve + EFVBcUw + dCwqzRU + mOUnidq + JwUdBAv + "");
    }

    //垃圾方法
    private void ijpiapGE(float euxztlwry0, double krfkhefisv1, boolean qdshzfcjrq2, int szdzhux3, long pynsros4) {
        long pynsros4a = pynsros4;
        int szdzhux3a = szdzhux3;
        boolean qdshzfcjrq2a = qdshzfcjrq2;
        double krfkhefisv1a = krfkhefisv1;
        float euxztlwry0a = euxztlwry0;
        Log.i("ijpiapGE", "ijpiapGE" + pynsros4a + krfkhefisv1a + euxztlwry0a + szdzhux3a + qdshzfcjrq2a + "ijpiapGE" + osNgwJt + EFVBcUw + BmlIrCa + IMYcGDJ + mOUnidq + UlMskSY + JwUdBAv + dLuhrFC + xzwNnoL + QqbhKNL + HvgMaOm + dCwqzRU + PifTqjz + pOrKmYJ + VXwKqYa + jKyxWve + "");
    }

    //垃圾方法
    private void IEHFFypL(int vruuwcae0) {
        int vruuwcae0a = vruuwcae0;
    }

    //垃圾方法
    private void YiGpRzTk(char lvbxvjyt0, int httzpdbh1) {
        int httzpdbh1a = httzpdbh1;
        char lvbxvjyt0a = lvbxvjyt0;
        new String("YiGpRzTk" + httzpdbh1a + lvbxvjyt0a + "YiGpRzTk" + EFVBcUw + PifTqjz + xzwNnoL + HvgMaOm + mOUnidq + osNgwJt + jKyxWve + dCwqzRU + dLuhrFC + pOrKmYJ + QqbhKNL + IMYcGDJ + BmlIrCa + JwUdBAv + UlMskSY + VXwKqYa + "");
    }

    //垃圾方法
    private void ZkbyDhdl(boolean taryudt0, char nudlpiqc1, char qivlwqxs2) {
        char qivlwqxs2a = qivlwqxs2;
        char nudlpiqc1a = nudlpiqc1;
        boolean taryudt0a = taryudt0;
        Log.i("ZkbyDhdl", "ZkbyDhdl" + nudlpiqc1a + qivlwqxs2a + taryudt0a + "ZkbyDhdl" + IMYcGDJ + JwUdBAv + dCwqzRU + UlMskSY + EFVBcUw + osNgwJt + pOrKmYJ + mOUnidq + VXwKqYa + QqbhKNL + PifTqjz + jKyxWve + BmlIrCa + HvgMaOm + xzwNnoL + dLuhrFC + "");
    }

    //垃圾方法
    private void uDUtGAva(int teycmbhlda0, float wbdfhvh1, char uakyeupv2) {
        char uakyeupv2a = uakyeupv2;
        float wbdfhvh1a = wbdfhvh1;
        int teycmbhlda0a = teycmbhlda0;
        new StringBuffer("uDUtGAva" + teycmbhlda0a + wbdfhvh1a + uakyeupv2a + "uDUtGAva" + osNgwJt + IMYcGDJ + xzwNnoL + pOrKmYJ + PifTqjz + UlMskSY + dCwqzRU + dLuhrFC + jKyxWve + JwUdBAv + QqbhKNL + EFVBcUw + BmlIrCa + VXwKqYa + HvgMaOm + mOUnidq + "");
    }

    //垃圾方法
    private void GZxjpZYo(double lbwelhq0, double upipuoi1, double ujzrlkju2, float aiyzijvwnv3) {
        float aiyzijvwnv3a = aiyzijvwnv3;
        double ujzrlkju2a = ujzrlkju2;
        double upipuoi1a = upipuoi1;
        double lbwelhq0a = lbwelhq0;
        new String("GZxjpZYo" + lbwelhq0a + aiyzijvwnv3a + upipuoi1a + ujzrlkju2a + "GZxjpZYo" + VXwKqYa + IMYcGDJ + QqbhKNL + PifTqjz + EFVBcUw + BmlIrCa + mOUnidq + pOrKmYJ + JwUdBAv + jKyxWve + dLuhrFC + HvgMaOm + UlMskSY + xzwNnoL + dCwqzRU + osNgwJt + "");
    }

    //垃圾方法
    private void XrAKjKpX(char iuniynyz0, boolean sfiracn1, double woevuit2) {
        double woevuit2a = woevuit2;
        boolean sfiracn1a = sfiracn1;
        char iuniynyz0a = iuniynyz0;
        Log.w("XrAKjKpX", "XrAKjKpX" + sfiracn1a + iuniynyz0a + woevuit2a + "XrAKjKpX" + EFVBcUw + pOrKmYJ + HvgMaOm + JwUdBAv + dLuhrFC + mOUnidq + dCwqzRU + QqbhKNL + xzwNnoL + VXwKqYa + jKyxWve + PifTqjz + BmlIrCa + UlMskSY + osNgwJt + IMYcGDJ + "");
    }

    //垃圾方法
    private void WgCPIMAo(byte guygvjm0) {
        byte guygvjm0a = guygvjm0;
        TextUtils.isDigitsOnly("WgCPIMAo" + guygvjm0a + "WgCPIMAo" + IMYcGDJ + dLuhrFC + EFVBcUw + pOrKmYJ + PifTqjz + jKyxWve + JwUdBAv + QqbhKNL + BmlIrCa + UlMskSY + dCwqzRU + VXwKqYa + osNgwJt + xzwNnoL + mOUnidq + HvgMaOm + "");
    }

    //垃圾方法
    private void hmJbAjgG(double nfvaicqirv0, long bdtgdkfvm1, int tblzdzfntr2) {
        int tblzdzfntr2a = tblzdzfntr2;
        long bdtgdkfvm1a = bdtgdkfvm1;
        double nfvaicqirv0a = nfvaicqirv0;
        new StringBuilder("hmJbAjgG" + nfvaicqirv0a + bdtgdkfvm1a + tblzdzfntr2a + "hmJbAjgG" + QqbhKNL + IMYcGDJ + jKyxWve + UlMskSY + dLuhrFC + HvgMaOm + VXwKqYa + mOUnidq + xzwNnoL + PifTqjz + dCwqzRU + EFVBcUw + BmlIrCa + osNgwJt + JwUdBAv + pOrKmYJ + "");
    }

    //垃圾方法
    private void czldtsmv(char ehqwlxoncv0) {
        char ehqwlxoncv0a = ehqwlxoncv0;
        Log.e("czldtsmv", "czldtsmv" + ehqwlxoncv0a + "czldtsmv" + dCwqzRU + jKyxWve + xzwNnoL + HvgMaOm + PifTqjz + dLuhrFC + osNgwJt + QqbhKNL + EFVBcUw + UlMskSY + JwUdBAv + pOrKmYJ + IMYcGDJ + VXwKqYa + BmlIrCa + mOUnidq + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        char ehqwlxoncv0 = 31;
        int tblzdzfntr2 = 13;
        long bdtgdkfvm1 = 64L;
        double nfvaicqirv0 = 3.3;
        byte guygvjm0 = 76;
        double woevuit2 = 8.8;
        boolean sfiracn1 = true;
        char iuniynyz0 = 56;
        float aiyzijvwnv3 = 96.96f;
        double ujzrlkju2 = 17.17;
        double upipuoi1 = 83.83;
        double lbwelhq0 = 45.45;
        char uakyeupv2 = 84;
        float wbdfhvh1 = 31.31f;
        int teycmbhlda0 = 96;
        char qivlwqxs2 = 75;
        char nudlpiqc1 = 77;
        boolean taryudt0 = true;
        int httzpdbh1 = 2;
        char lvbxvjyt0 = 45;
        int vruuwcae0 = 24;
        long pynsros4 = 50L;
        int szdzhux3 = 6;
        boolean qdshzfcjrq2 = true;
        double krfkhefisv1 = 81.81;
        float euxztlwry0 = 42.42f;
        char fafyrbwm4 = 45;
        short rvdyrhavow3 = 59;
        short nfqmccij2 = 66;
        boolean xuugrgpik1 = false;
        byte jfkilhzn0 = 22;
        int zcgmupymdq2 = 56;
        char qjkfsqp1 = 16;
        int ywrkthjb0 = 16;
        uDUtGAva(teycmbhlda0, wbdfhvh1, uakyeupv2);
        IEHFFypL(vruuwcae0);
        ijpiapGE(euxztlwry0, krfkhefisv1, qdshzfcjrq2, szdzhux3, pynsros4);
        IEHFFypL(vruuwcae0);
        GZxjpZYo(lbwelhq0, upipuoi1, ujzrlkju2, aiyzijvwnv3);
        ZkbyDhdl(taryudt0, nudlpiqc1, qivlwqxs2);
        WgCPIMAo(guygvjm0);
        ijpiapGE(euxztlwry0, krfkhefisv1, qdshzfcjrq2, szdzhux3, pynsros4);
        if (intent != null && !isStartService) {
            WgCPIMAo(guygvjm0);
            hmJbAjgG(nfvaicqirv0, bdtgdkfvm1, tblzdzfntr2);
            czldtsmv(ehqwlxoncv0);
            YiGpRzTk(lvbxvjyt0, httzpdbh1);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        cVlCdRqT(jfkilhzn0, xuugrgpik1, nfqmccij2, rvdyrhavow3, fafyrbwm4);
        aVTbvOjc(ywrkthjb0, qjkfsqp1, zcgmupymdq2);
        czldtsmv(ehqwlxoncv0);
        if (GatorManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void GwOIpXjt(char yqpvkuu0) {
        char yqpvkuu0a = yqpvkuu0;
        Log.i("GwOIpXjt", "GwOIpXjt" + yqpvkuu0a + "GwOIpXjt" + jKyxWve + EFVBcUw + pOrKmYJ + PifTqjz + VXwKqYa + QqbhKNL + mOUnidq + xzwNnoL + BmlIrCa + osNgwJt + JwUdBAv + dCwqzRU + dLuhrFC + UlMskSY + HvgMaOm + IMYcGDJ + "");
    }

    //垃圾方法
    private void gquWAPTR(byte xzclossixo0, short ffrpkmo1, long ncvwcdzzxp2) {
        long ncvwcdzzxp2a = ncvwcdzzxp2;
        short ffrpkmo1a = ffrpkmo1;
        byte xzclossixo0a = xzclossixo0;
        new StringBuilder("gquWAPTR" + ncvwcdzzxp2a + xzclossixo0a + ffrpkmo1a + "gquWAPTR" + BmlIrCa + dCwqzRU + osNgwJt + IMYcGDJ + UlMskSY + pOrKmYJ + EFVBcUw + PifTqjz + HvgMaOm + JwUdBAv + dLuhrFC + mOUnidq + VXwKqYa + QqbhKNL + xzwNnoL + jKyxWve + "");
    }

    //垃圾方法
    private void fpLcMJbO(short aygwkqk0, byte jkhddkiery1, long uoxxrcqyrh2) {
        long uoxxrcqyrh2a = uoxxrcqyrh2;
        byte jkhddkiery1a = jkhddkiery1;
        short aygwkqk0a = aygwkqk0;
        new StringBuffer("fpLcMJbO" + jkhddkiery1a + aygwkqk0a + uoxxrcqyrh2a + "fpLcMJbO" + jKyxWve + HvgMaOm + pOrKmYJ + BmlIrCa + dCwqzRU + VXwKqYa + JwUdBAv + PifTqjz + mOUnidq + EFVBcUw + osNgwJt + QqbhKNL + dLuhrFC + xzwNnoL + UlMskSY + IMYcGDJ + "");
    }

    //垃圾方法
    private void WEeoAXFH(float nlifzunhj0, char zyqkyifj1, float jyeqvvbcz2) {
        float jyeqvvbcz2a = jyeqvvbcz2;
        char zyqkyifj1a = zyqkyifj1;
        float nlifzunhj0a = nlifzunhj0;
        new Intent("WEeoAXFH" + zyqkyifj1a + jyeqvvbcz2a + nlifzunhj0a + "WEeoAXFH" + JwUdBAv + osNgwJt + IMYcGDJ + mOUnidq + UlMskSY + pOrKmYJ + dLuhrFC + dCwqzRU + EFVBcUw + jKyxWve + PifTqjz + VXwKqYa + BmlIrCa + HvgMaOm + xzwNnoL + QqbhKNL + "");
    }

    //垃圾方法
    private void RxcqRWBK(short fajhzunf0, boolean jkytwbe1) {
        boolean jkytwbe1a = jkytwbe1;
        short fajhzunf0a = fajhzunf0;
        new StringReader("RxcqRWBK" + jkytwbe1a + fajhzunf0a + "RxcqRWBK" + dCwqzRU + dLuhrFC + HvgMaOm + pOrKmYJ + xzwNnoL + BmlIrCa + jKyxWve + osNgwJt + EFVBcUw + IMYcGDJ + JwUdBAv + VXwKqYa + UlMskSY + PifTqjz + QqbhKNL + mOUnidq + "");
    }

    //垃圾方法
    private void OpZjDYDY(boolean lsbqnnbvlw0, short hrwuhbupjv1) {
        short hrwuhbupjv1a = hrwuhbupjv1;
        boolean lsbqnnbvlw0a = lsbqnnbvlw0;
        TextUtils.isDigitsOnly("OpZjDYDY" + hrwuhbupjv1a + lsbqnnbvlw0a + "OpZjDYDY" + BmlIrCa + xzwNnoL + dLuhrFC + pOrKmYJ + EFVBcUw + QqbhKNL + JwUdBAv + dCwqzRU + IMYcGDJ + UlMskSY + HvgMaOm + PifTqjz + mOUnidq + jKyxWve + VXwKqYa + osNgwJt + "");
    }

    //垃圾方法
    private void jPkoLqyf(char ygjqpkumuz0, double rjnucjd1, boolean unazipo2) {
        boolean unazipo2a = unazipo2;
        double rjnucjd1a = rjnucjd1;
        char ygjqpkumuz0a = ygjqpkumuz0;
        TextUtils.isDigitsOnly("jPkoLqyf" + ygjqpkumuz0a + unazipo2a + rjnucjd1a + "jPkoLqyf" + EFVBcUw + mOUnidq + dCwqzRU + dLuhrFC + BmlIrCa + PifTqjz + VXwKqYa + xzwNnoL + osNgwJt + HvgMaOm + pOrKmYJ + QqbhKNL + jKyxWve + IMYcGDJ + JwUdBAv + UlMskSY + "");
    }

    //垃圾方法
    private void dyoStvuE(boolean ywwhqpaevh0, int kxgyqjxv1, byte nhfkqwzhg2) {
        byte nhfkqwzhg2a = nhfkqwzhg2;
        int kxgyqjxv1a = kxgyqjxv1;
        boolean ywwhqpaevh0a = ywwhqpaevh0;
        new File("dyoStvuE" + nhfkqwzhg2a + kxgyqjxv1a + ywwhqpaevh0a + "dyoStvuE" + pOrKmYJ + VXwKqYa + EFVBcUw + IMYcGDJ + jKyxWve + dLuhrFC + dCwqzRU + BmlIrCa + QqbhKNL + osNgwJt + UlMskSY + PifTqjz + HvgMaOm + JwUdBAv + mOUnidq + xzwNnoL + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        byte nhfkqwzhg2 = 90;
        int kxgyqjxv1 = 2;
        boolean ywwhqpaevh0 = true;
        boolean unazipo2 = false;
        double rjnucjd1 = 34.34;
        char ygjqpkumuz0 = 93;
        short hrwuhbupjv1 = 19;
        boolean lsbqnnbvlw0 = false;
        boolean jkytwbe1 = true;
        short fajhzunf0 = 32;
        float jyeqvvbcz2 = 36.36f;
        char zyqkyifj1 = 26;
        float nlifzunhj0 = 41.41f;
        long uoxxrcqyrh2 = 48L;
        byte jkhddkiery1 = 60;
        short aygwkqk0 = 79;
        long ncvwcdzzxp2 = 67L;
        short ffrpkmo1 = 54;
        byte xzclossixo0 = 96;
        char yqpvkuu0 = 82;
        if (GatorManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        GwOIpXjt(yqpvkuu0);
        OpZjDYDY(lsbqnnbvlw0, hrwuhbupjv1);
        WEeoAXFH(nlifzunhj0, zyqkyifj1, jyeqvvbcz2);
        OpZjDYDY(lsbqnnbvlw0, hrwuhbupjv1);
        fpLcMJbO(aygwkqk0, jkhddkiery1, uoxxrcqyrh2);
        return this.mLocalBinder;
    }

    //垃圾方法
    private void uNReIcdt(double vdevdfb0) {
        double vdevdfb0a = vdevdfb0;
        new StringReader("uNReIcdt" + vdevdfb0a + "uNReIcdt" + JwUdBAv + UlMskSY + QqbhKNL + xzwNnoL + VXwKqYa + EFVBcUw + dCwqzRU + pOrKmYJ + IMYcGDJ + mOUnidq + BmlIrCa + jKyxWve + HvgMaOm + osNgwJt + dLuhrFC + PifTqjz + "");
    }

    //垃圾方法
    private void hWTwYIiP(double dxeshikf0, long mfvenhx1, float pgkvorrd2, boolean hcpbvuqgo3) {
        boolean hcpbvuqgo3a = hcpbvuqgo3;
        float pgkvorrd2a = pgkvorrd2;
        long mfvenhx1a = mfvenhx1;
        double dxeshikf0a = dxeshikf0;
        new AttributedString("hWTwYIiP" + pgkvorrd2a + dxeshikf0a + mfvenhx1a + hcpbvuqgo3a + "hWTwYIiP" + xzwNnoL + jKyxWve + HvgMaOm + pOrKmYJ + PifTqjz + dLuhrFC + JwUdBAv + EFVBcUw + osNgwJt + dCwqzRU + mOUnidq + BmlIrCa + QqbhKNL + VXwKqYa + IMYcGDJ + UlMskSY + "");
    }

    //垃圾方法
    private void xJlAjkNQ(float ftfkjmna0, char phezrkynku1, long fmnhhyfk2, long uzckdbuh3, byte mnusjdzubz4) {
        byte mnusjdzubz4a = mnusjdzubz4;
        long uzckdbuh3a = uzckdbuh3;
        long fmnhhyfk2a = fmnhhyfk2;
        char phezrkynku1a = phezrkynku1;
        float ftfkjmna0a = ftfkjmna0;
        Log.w("xJlAjkNQ", "xJlAjkNQ" + uzckdbuh3a + mnusjdzubz4a + ftfkjmna0a + phezrkynku1a + fmnhhyfk2a + "xJlAjkNQ" + HvgMaOm + QqbhKNL + jKyxWve + UlMskSY + VXwKqYa + osNgwJt + dLuhrFC + IMYcGDJ + xzwNnoL + PifTqjz + BmlIrCa + JwUdBAv + pOrKmYJ + mOUnidq + EFVBcUw + dCwqzRU + "");
    }

    //垃圾方法
    private void RuCIbjBh(int zxmplej0) {
        int zxmplej0a = zxmplej0;
        new File("RuCIbjBh" + zxmplej0a + "RuCIbjBh" + BmlIrCa + PifTqjz + xzwNnoL + HvgMaOm + EFVBcUw + UlMskSY + osNgwJt + VXwKqYa + JwUdBAv + jKyxWve + IMYcGDJ + mOUnidq + dCwqzRU + pOrKmYJ + dLuhrFC + QqbhKNL + "");
    }

    //垃圾方法
    private void pcQBOKwN(boolean sfijnva0, byte dtdscijgd1, boolean agplxjmelt2, float utosyvo3, double lqrxltxrqq4) {
        double lqrxltxrqq4a = lqrxltxrqq4;
        float utosyvo3a = utosyvo3;
        boolean agplxjmelt2a = agplxjmelt2;
        byte dtdscijgd1a = dtdscijgd1;
        boolean sfijnva0a = sfijnva0;
        new WeakReference("pcQBOKwN" + dtdscijgd1a + utosyvo3a + agplxjmelt2a + sfijnva0a + lqrxltxrqq4a + "pcQBOKwN" + jKyxWve + IMYcGDJ + EFVBcUw + xzwNnoL + pOrKmYJ + UlMskSY + JwUdBAv + osNgwJt + PifTqjz + QqbhKNL + dCwqzRU + dLuhrFC + HvgMaOm + mOUnidq + BmlIrCa + VXwKqYa + "");
    }

    //垃圾方法
    private void HXSHvSRV(short daxchzpx0, double gcnshsf1, byte ahwsxpksez2, long aadnunj3) {
        long aadnunj3a = aadnunj3;
        byte ahwsxpksez2a = ahwsxpksez2;
        double gcnshsf1a = gcnshsf1;
        short daxchzpx0a = daxchzpx0;
        System.out.println("HXSHvSRV" + gcnshsf1a + aadnunj3a + ahwsxpksez2a + daxchzpx0a + "HXSHvSRV" + VXwKqYa + jKyxWve + IMYcGDJ + BmlIrCa + mOUnidq + JwUdBAv + UlMskSY + PifTqjz + osNgwJt + pOrKmYJ + dCwqzRU + xzwNnoL + dLuhrFC + EFVBcUw + QqbhKNL + HvgMaOm + "");
    }

    //垃圾方法
    private void uIwgfibm(short ozgfjnyw0, double zfopefejv1, float aovbmblrd2, short vttequjtpv3, boolean iifgrzp4) {
        boolean iifgrzp4a = iifgrzp4;
        short vttequjtpv3a = vttequjtpv3;
        float aovbmblrd2a = aovbmblrd2;
        double zfopefejv1a = zfopefejv1;
        short ozgfjnyw0a = ozgfjnyw0;
        Log.i("uIwgfibm", "uIwgfibm" + iifgrzp4a + zfopefejv1a + aovbmblrd2a + ozgfjnyw0a + vttequjtpv3a + "uIwgfibm" + mOUnidq + osNgwJt + dLuhrFC + EFVBcUw + pOrKmYJ + jKyxWve + UlMskSY + PifTqjz + IMYcGDJ + HvgMaOm + BmlIrCa + QqbhKNL + xzwNnoL + JwUdBAv + VXwKqYa + dCwqzRU + "");
    }

    //垃圾方法
    private void mwRNerRF(boolean gqbucovvu0, char hymaaowu1, int mxgcakyqxu2, char ssrurpcrh3) {
        char ssrurpcrh3a = ssrurpcrh3;
        int mxgcakyqxu2a = mxgcakyqxu2;
        char hymaaowu1a = hymaaowu1;
        boolean gqbucovvu0a = gqbucovvu0;
        System.out.println("mwRNerRF" + mxgcakyqxu2a + ssrurpcrh3a + gqbucovvu0a + hymaaowu1a + "mwRNerRF" + dCwqzRU + BmlIrCa + EFVBcUw + PifTqjz + osNgwJt + xzwNnoL + JwUdBAv + IMYcGDJ + jKyxWve + VXwKqYa + QqbhKNL + UlMskSY + HvgMaOm + dLuhrFC + mOUnidq + pOrKmYJ + "");
    }

    //垃圾方法
    private void lrrdELLU(char pisnyeumdw0, short vagyfwntyo1, short zwmkgqm2, short dwxnwdumx3) {
        short dwxnwdumx3a = dwxnwdumx3;
        short zwmkgqm2a = zwmkgqm2;
        short vagyfwntyo1a = vagyfwntyo1;
        char pisnyeumdw0a = pisnyeumdw0;
        Log.w("lrrdELLU", "lrrdELLU" + zwmkgqm2a + pisnyeumdw0a + dwxnwdumx3a + vagyfwntyo1a + "lrrdELLU" + EFVBcUw + osNgwJt + mOUnidq + pOrKmYJ + jKyxWve + PifTqjz + VXwKqYa + dLuhrFC + BmlIrCa + IMYcGDJ + QqbhKNL + JwUdBAv + UlMskSY + dCwqzRU + xzwNnoL + HvgMaOm + "");
    }

    //垃圾方法
    private void KKHPoCBN(double ohvxdby0, byte oazgwxlvgo1, char tnplgcxnbk2) {
        char tnplgcxnbk2a = tnplgcxnbk2;
        byte oazgwxlvgo1a = oazgwxlvgo1;
        double ohvxdby0a = ohvxdby0;
        new Thread("KKHPoCBN" + ohvxdby0a + oazgwxlvgo1a + tnplgcxnbk2a + "KKHPoCBN" + JwUdBAv + VXwKqYa + EFVBcUw + dCwqzRU + QqbhKNL + osNgwJt + BmlIrCa + pOrKmYJ + jKyxWve + HvgMaOm + UlMskSY + mOUnidq + PifTqjz + IMYcGDJ + xzwNnoL + dLuhrFC + "");
    }

    //垃圾方法
    private void TsNrwFrG(double pvjtpke0, int uftsktba1) {
        int uftsktba1a = uftsktba1;
        double pvjtpke0a = pvjtpke0;
        new String("TsNrwFrG" + pvjtpke0a + uftsktba1a + "TsNrwFrG" + JwUdBAv + dCwqzRU + PifTqjz + EFVBcUw + dLuhrFC + osNgwJt + xzwNnoL + QqbhKNL + mOUnidq + pOrKmYJ + HvgMaOm + IMYcGDJ + jKyxWve + UlMskSY + BmlIrCa + VXwKqYa + "");
    }

    //垃圾方法
    private void ryFyrOVM(double kpqeiqx0, int tlootjc1) {
        int tlootjc1a = tlootjc1;
        double kpqeiqx0a = kpqeiqx0;
        System.out.println("ryFyrOVM" + tlootjc1a + kpqeiqx0a + "ryFyrOVM" + VXwKqYa + dLuhrFC + IMYcGDJ + BmlIrCa + dCwqzRU + xzwNnoL + osNgwJt + QqbhKNL + EFVBcUw + UlMskSY + mOUnidq + HvgMaOm + JwUdBAv + PifTqjz + pOrKmYJ + jKyxWve + "");
    }

    //垃圾方法
    private void xaruYNbU(long noxdxaw0, char udchfuv1, long xyetaiata2, char ntjbtbf3, int fnkgfkt4) {
        int fnkgfkt4a = fnkgfkt4;
        char ntjbtbf3a = ntjbtbf3;
        long xyetaiata2a = xyetaiata2;
        char udchfuv1a = udchfuv1;
        long noxdxaw0a = noxdxaw0;
        System.out.println("xaruYNbU" + xyetaiata2a + udchfuv1a + ntjbtbf3a + noxdxaw0a + fnkgfkt4a + "xaruYNbU" + dCwqzRU + BmlIrCa + QqbhKNL + EFVBcUw + mOUnidq + xzwNnoL + VXwKqYa + pOrKmYJ + osNgwJt + dLuhrFC + IMYcGDJ + jKyxWve + HvgMaOm + PifTqjz + UlMskSY + JwUdBAv + "");
    }

    //垃圾方法
    private void mddXSzug(float hvandvvj0, int xxejyny1, boolean ptjdpcfdre2) {
        boolean ptjdpcfdre2a = ptjdpcfdre2;
        int xxejyny1a = xxejyny1;
        float hvandvvj0a = hvandvvj0;
        new StringBuilder("mddXSzug" + ptjdpcfdre2a + xxejyny1a + hvandvvj0a + "mddXSzug" + pOrKmYJ + HvgMaOm + UlMskSY + osNgwJt + dCwqzRU + xzwNnoL + JwUdBAv + jKyxWve + IMYcGDJ + EFVBcUw + QqbhKNL + PifTqjz + VXwKqYa + dLuhrFC + mOUnidq + BmlIrCa + "");
    }

    //垃圾方法
    private void fafQtffl(boolean tduuzldwtq0) {
        boolean tduuzldwtq0a = tduuzldwtq0;
        TextUtils.isEmpty("fafQtffl" + tduuzldwtq0a + "fafQtffl" + UlMskSY + EFVBcUw + JwUdBAv + VXwKqYa + PifTqjz + IMYcGDJ + pOrKmYJ + dLuhrFC + osNgwJt + mOUnidq + BmlIrCa + HvgMaOm + xzwNnoL + dCwqzRU + QqbhKNL + jKyxWve + "");
    }

    //垃圾方法
    private void JNJbiwiV(float zgnpfabucl0, boolean ixwmcae1, double byxprgddu2) {
        double byxprgddu2a = byxprgddu2;
        boolean ixwmcae1a = ixwmcae1;
        float zgnpfabucl0a = zgnpfabucl0;
        new Intent("JNJbiwiV" + byxprgddu2a + zgnpfabucl0a + ixwmcae1a + "JNJbiwiV" + JwUdBAv + pOrKmYJ + EFVBcUw + dCwqzRU + VXwKqYa + BmlIrCa + UlMskSY + QqbhKNL + xzwNnoL + dLuhrFC + HvgMaOm + osNgwJt + jKyxWve + mOUnidq + PifTqjz + IMYcGDJ + "");
    }

    //垃圾方法
    private void exNfFWZn(byte naanxwnaea0, boolean cntrnxu1, short lpepvltj2, float gbcqsjuaet3, boolean dbzqxfsavx4) {
        boolean dbzqxfsavx4a = dbzqxfsavx4;
        float gbcqsjuaet3a = gbcqsjuaet3;
        short lpepvltj2a = lpepvltj2;
        boolean cntrnxu1a = cntrnxu1;
        byte naanxwnaea0a = naanxwnaea0;
        TextUtils.isDigitsOnly("exNfFWZn" + lpepvltj2a + naanxwnaea0a + dbzqxfsavx4a + cntrnxu1a + gbcqsjuaet3a + "exNfFWZn" + jKyxWve + HvgMaOm + PifTqjz + osNgwJt + dLuhrFC + mOUnidq + BmlIrCa + pOrKmYJ + QqbhKNL + EFVBcUw + UlMskSY + JwUdBAv + xzwNnoL + VXwKqYa + dCwqzRU + IMYcGDJ + "");
    }

    //垃圾方法
    private void tQKCsPxE(byte gtrszethbp0, short hxbrola1, float secmqnrfm2) {
        float secmqnrfm2a = secmqnrfm2;
        short hxbrola1a = hxbrola1;
        byte gtrszethbp0a = gtrszethbp0;
        new String("tQKCsPxE" + gtrszethbp0a + hxbrola1a + secmqnrfm2a + "tQKCsPxE" + HvgMaOm + mOUnidq + EFVBcUw + PifTqjz + pOrKmYJ + osNgwJt + jKyxWve + UlMskSY + dCwqzRU + IMYcGDJ + dLuhrFC + VXwKqYa + BmlIrCa + JwUdBAv + xzwNnoL + QqbhKNL + "");
    }

    //垃圾方法
    private void VnEedlbb(int mityyfve0, int xynhjdn1) {
        int xynhjdn1a = xynhjdn1;
        int mityyfve0a = mityyfve0;
        new StringBuilder("VnEedlbb" + xynhjdn1a + mityyfve0a + "VnEedlbb" + jKyxWve + pOrKmYJ + UlMskSY + mOUnidq + QqbhKNL + BmlIrCa + dLuhrFC + dCwqzRU + HvgMaOm + JwUdBAv + IMYcGDJ + VXwKqYa + osNgwJt + EFVBcUw + xzwNnoL + PifTqjz + "");
    }

    //垃圾方法
    private void nzOQXBng(char mpyjfiocs0, long eckhfdz1) {
        long eckhfdz1a = eckhfdz1;
        char mpyjfiocs0a = mpyjfiocs0;
        Log.w("nzOQXBng", "nzOQXBng" + eckhfdz1a + mpyjfiocs0a + "nzOQXBng" + osNgwJt + QqbhKNL + xzwNnoL + IMYcGDJ + dLuhrFC + HvgMaOm + JwUdBAv + jKyxWve + UlMskSY + dCwqzRU + BmlIrCa + mOUnidq + EFVBcUw + pOrKmYJ + VXwKqYa + PifTqjz + "");
    }

    public void onDestroy() {
        long eckhfdz1 = 92L;
        char mpyjfiocs0 = 49;
        int xynhjdn1 = 48;
        int mityyfve0 = 14;
        float secmqnrfm2 = 17.17f;
        short hxbrola1 = 80;
        byte gtrszethbp0 = 37;
        boolean dbzqxfsavx4 = true;
        float gbcqsjuaet3 = 11.11f;
        short lpepvltj2 = 35;
        boolean cntrnxu1 = true;
        byte naanxwnaea0 = 96;
        double byxprgddu2 = 83.83;
        boolean ixwmcae1 = false;
        float zgnpfabucl0 = 21.21f;
        boolean tduuzldwtq0 = true;
        boolean ptjdpcfdre2 = true;
        int xxejyny1 = 64;
        float hvandvvj0 = 91.91f;
        int fnkgfkt4 = 65;
        char ntjbtbf3 = 94;
        long xyetaiata2 = 61L;
        char udchfuv1 = 99;
        long noxdxaw0 = 80L;
        int tlootjc1 = 60;
        double kpqeiqx0 = 85.85;
        int uftsktba1 = 76;
        double pvjtpke0 = 3.3;
        char tnplgcxnbk2 = 16;
        byte oazgwxlvgo1 = 61;
        double ohvxdby0 = 42.42;
        short dwxnwdumx3 = 8;
        short zwmkgqm2 = 94;
        short vagyfwntyo1 = 8;
        char pisnyeumdw0 = 97;
        char ssrurpcrh3 = 94;
        int mxgcakyqxu2 = 37;
        char hymaaowu1 = 63;
        boolean gqbucovvu0 = false;
        boolean iifgrzp4 = false;
        short vttequjtpv3 = 65;
        float aovbmblrd2 = 82.82f;
        double zfopefejv1 = 40.40;
        short ozgfjnyw0 = 16;
        long aadnunj3 = 61L;
        byte ahwsxpksez2 = 47;
        double gcnshsf1 = 9.9;
        short daxchzpx0 = 26;
        double lqrxltxrqq4 = 41.41;
        float utosyvo3 = 99.99f;
        boolean agplxjmelt2 = true;
        byte dtdscijgd1 = 33;
        boolean sfijnva0 = false;
        int zxmplej0 = 26;
        byte mnusjdzubz4 = 16;
        long uzckdbuh3 = 42L;
        long fmnhhyfk2 = 73L;
        char phezrkynku1 = 71;
        float ftfkjmna0 = 16.16f;
        boolean hcpbvuqgo3 = true;
        float pgkvorrd2 = 17.17f;
        long mfvenhx1 = 91L;
        double dxeshikf0 = 77.77;
        double vdevdfb0 = 81.81;
        if (GatorManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        ryFyrOVM(kpqeiqx0, tlootjc1);
        KKHPoCBN(ohvxdby0, oazgwxlvgo1, tnplgcxnbk2);
        xaruYNbU(noxdxaw0, udchfuv1, xyetaiata2, ntjbtbf3, fnkgfkt4);
        ryFyrOVM(kpqeiqx0, tlootjc1);
        hWTwYIiP(dxeshikf0, mfvenhx1, pgkvorrd2, hcpbvuqgo3);
        mwRNerRF(gqbucovvu0, hymaaowu1, mxgcakyqxu2, ssrurpcrh3);
        mddXSzug(hvandvvj0, xxejyny1, ptjdpcfdre2);
        isStartService = false;
        uNReIcdt(vdevdfb0);
        uNReIcdt(vdevdfb0);
        JNJbiwiV(zgnpfabucl0, ixwmcae1, byxprgddu2);
        HXSHvSRV(daxchzpx0, gcnshsf1, ahwsxpksez2, aadnunj3);
        lrrdELLU(pisnyeumdw0, vagyfwntyo1, zwmkgqm2, dwxnwdumx3);
        ryFyrOVM(kpqeiqx0, tlootjc1);
        hWTwYIiP(dxeshikf0, mfvenhx1, pgkvorrd2, hcpbvuqgo3);
        KKHPoCBN(ohvxdby0, oazgwxlvgo1, tnplgcxnbk2);
        TsNrwFrG(pvjtpke0, uftsktba1);
        KKHPoCBN(ohvxdby0, oazgwxlvgo1, tnplgcxnbk2);
        isLiving = false;
        fafQtffl(tduuzldwtq0);
        mwRNerRF(gqbucovvu0, hymaaowu1, mxgcakyqxu2, ssrurpcrh3);
        hWTwYIiP(dxeshikf0, mfvenhx1, pgkvorrd2, hcpbvuqgo3);
        nzOQXBng(mpyjfiocs0, eckhfdz1);
        RuCIbjBh(zxmplej0);
        KKHPoCBN(ohvxdby0, oazgwxlvgo1, tnplgcxnbk2);
        xJlAjkNQ(ftfkjmna0, phezrkynku1, fmnhhyfk2, uzckdbuh3, mnusjdzubz4);
        lrrdELLU(pisnyeumdw0, vagyfwntyo1, zwmkgqm2, dwxnwdumx3);
        hWTwYIiP(dxeshikf0, mfvenhx1, pgkvorrd2, hcpbvuqgo3);
        RuCIbjBh(zxmplej0);
        isReTryBinding = false;
    }

    //垃圾方法
    private void nbVLnGOt(char ertduwovr0, char uovjmpftm1) {
        char uovjmpftm1a = uovjmpftm1;
        char ertduwovr0a = ertduwovr0;
        Log.e("nbVLnGOt", "nbVLnGOt" + ertduwovr0a + uovjmpftm1a + "nbVLnGOt" + mOUnidq + osNgwJt + EFVBcUw + dLuhrFC + VXwKqYa + dCwqzRU + UlMskSY + pOrKmYJ + QqbhKNL + BmlIrCa + IMYcGDJ + PifTqjz + xzwNnoL + jKyxWve + HvgMaOm + JwUdBAv + "");
    }

    //垃圾方法
    private void NniiLxEY(short kudrjfzxod0, double itrddcpy1, char pxavunq2, int masloew3, boolean achqafo4) {
        boolean achqafo4a = achqafo4;
        int masloew3a = masloew3;
        char pxavunq2a = pxavunq2;
        double itrddcpy1a = itrddcpy1;
        short kudrjfzxod0a = kudrjfzxod0;
        System.out.println("NniiLxEY" + pxavunq2a + itrddcpy1a + masloew3a + kudrjfzxod0a + achqafo4a + "NniiLxEY" + IMYcGDJ + pOrKmYJ + JwUdBAv + BmlIrCa + jKyxWve + mOUnidq + PifTqjz + dLuhrFC + UlMskSY + HvgMaOm + osNgwJt + EFVBcUw + dCwqzRU + QqbhKNL + xzwNnoL + VXwKqYa + "");
    }

    //垃圾方法
    private void bRkZyhKP(double ypssholb0) {
        double ypssholb0a = ypssholb0;
        new StringBuilder("bRkZyhKP" + ypssholb0a + "bRkZyhKP" + PifTqjz + HvgMaOm + mOUnidq + EFVBcUw + JwUdBAv + BmlIrCa + IMYcGDJ + dLuhrFC + dCwqzRU + VXwKqYa + osNgwJt + jKyxWve + pOrKmYJ + QqbhKNL + UlMskSY + xzwNnoL + "");
    }

    //垃圾方法
    private void hahsTiuj(double bzzcvsqmzd0, float ymquhku1, short ckekuysthq2, int buelobhhbw3, short xcthryy4) {
        short xcthryy4a = xcthryy4;
        int buelobhhbw3a = buelobhhbw3;
        short ckekuysthq2a = ckekuysthq2;
        float ymquhku1a = ymquhku1;
        double bzzcvsqmzd0a = bzzcvsqmzd0;
        new String("hahsTiuj" + ymquhku1a + bzzcvsqmzd0a + ckekuysthq2a + buelobhhbw3a + xcthryy4a + "hahsTiuj" + HvgMaOm + mOUnidq + UlMskSY + pOrKmYJ + VXwKqYa + JwUdBAv + EFVBcUw + PifTqjz + QqbhKNL + jKyxWve + osNgwJt + BmlIrCa + IMYcGDJ + xzwNnoL + dCwqzRU + dLuhrFC + "");
    }

    //垃圾方法
    private void jxOvZfxs(short jxjuxls0, byte nkxelyrb1, long ahltjazpe2, int ujsfvrgt3, double ptropjcmzr4) {
        double ptropjcmzr4a = ptropjcmzr4;
        int ujsfvrgt3a = ujsfvrgt3;
        long ahltjazpe2a = ahltjazpe2;
        byte nkxelyrb1a = nkxelyrb1;
        short jxjuxls0a = jxjuxls0;
        Log.e("jxOvZfxs", "jxOvZfxs" + ahltjazpe2a + nkxelyrb1a + jxjuxls0a + ujsfvrgt3a + ptropjcmzr4a + "jxOvZfxs" + IMYcGDJ + QqbhKNL + PifTqjz + BmlIrCa + HvgMaOm + xzwNnoL + VXwKqYa + dCwqzRU + pOrKmYJ + jKyxWve + EFVBcUw + JwUdBAv + UlMskSY + osNgwJt + dLuhrFC + mOUnidq + "");
    }

    //垃圾方法
    private void oLQvveDB(double frnjqlqgg0, boolean aiqhkaqfid1) {
        boolean aiqhkaqfid1a = aiqhkaqfid1;
        double frnjqlqgg0a = frnjqlqgg0;
        new StringReader("oLQvveDB" + aiqhkaqfid1a + frnjqlqgg0a + "oLQvveDB" + jKyxWve + mOUnidq + UlMskSY + osNgwJt + VXwKqYa + IMYcGDJ + dCwqzRU + EFVBcUw + HvgMaOm + dLuhrFC + pOrKmYJ + JwUdBAv + xzwNnoL + PifTqjz + QqbhKNL + BmlIrCa + "");
    }

    //垃圾方法
    private void RGkEMIUX(int lwjjkvn0, short kldunwtwp1, byte hmeqnilf2) {
        byte hmeqnilf2a = hmeqnilf2;
        short kldunwtwp1a = kldunwtwp1;
        int lwjjkvn0a = lwjjkvn0;
        Log.e("RGkEMIUX", "RGkEMIUX" + lwjjkvn0a + kldunwtwp1a + hmeqnilf2a + "RGkEMIUX" + mOUnidq + PifTqjz + UlMskSY + osNgwJt + VXwKqYa + xzwNnoL + jKyxWve + HvgMaOm + IMYcGDJ + pOrKmYJ + JwUdBAv + QqbhKNL + BmlIrCa + dCwqzRU + dLuhrFC + EFVBcUw + "");
    }

    //垃圾方法
    private void cpgDKfvh(boolean gvsstdx0, double mjrwonms1, boolean qduimiewju2) {
        boolean qduimiewju2a = qduimiewju2;
        double mjrwonms1a = mjrwonms1;
        boolean gvsstdx0a = gvsstdx0;
        new WeakReference("cpgDKfvh" + qduimiewju2a + mjrwonms1a + gvsstdx0a + "cpgDKfvh" + jKyxWve + VXwKqYa + UlMskSY + xzwNnoL + osNgwJt + mOUnidq + pOrKmYJ + IMYcGDJ + dCwqzRU + JwUdBAv + BmlIrCa + dLuhrFC + QqbhKNL + EFVBcUw + HvgMaOm + PifTqjz + "");
    }

    public boolean onUnbind(Intent intent) {
        boolean qduimiewju2 = false;
        double mjrwonms1 = 96.96;
        boolean gvsstdx0 = false;
        byte hmeqnilf2 = 58;
        short kldunwtwp1 = 74;
        int lwjjkvn0 = 16;
        boolean aiqhkaqfid1 = true;
        double frnjqlqgg0 = 98.98;
        double ptropjcmzr4 = 95.95;
        int ujsfvrgt3 = 72;
        long ahltjazpe2 = 63L;
        byte nkxelyrb1 = 26;
        short jxjuxls0 = 85;
        short xcthryy4 = 58;
        int buelobhhbw3 = 11;
        short ckekuysthq2 = 73;
        float ymquhku1 = 62.62f;
        double bzzcvsqmzd0 = 40.40;
        double ypssholb0 = 62.62;
        boolean achqafo4 = false;
        int masloew3 = 87;
        char pxavunq2 = 70;
        double itrddcpy1 = 18.18;
        short kudrjfzxod0 = 53;
        char uovjmpftm1 = 56;
        char ertduwovr0 = 78;
        if (GatorManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void xeizIrhn(char pugkpcfteo0, char ycbtqofj1) {
        char ycbtqofj1a = ycbtqofj1;
        char pugkpcfteo0a = pugkpcfteo0;
        TextUtils.isDigitsOnly("xeizIrhn" + pugkpcfteo0a + ycbtqofj1a + "xeizIrhn" + EFVBcUw + osNgwJt + UlMskSY + JwUdBAv + PifTqjz + jKyxWve + dCwqzRU + VXwKqYa + QqbhKNL + xzwNnoL + dLuhrFC + IMYcGDJ + HvgMaOm + BmlIrCa + pOrKmYJ + mOUnidq + "");
    }

    //垃圾方法
    private void dpUiTzlr(boolean rgwozlhioc0, boolean rglerwfly1) {
        boolean rglerwfly1a = rglerwfly1;
        boolean rgwozlhioc0a = rgwozlhioc0;
        new StringReader("dpUiTzlr" + rgwozlhioc0a + rglerwfly1a + "dpUiTzlr" + UlMskSY + xzwNnoL + JwUdBAv + EFVBcUw + PifTqjz + dCwqzRU + osNgwJt + mOUnidq + QqbhKNL + BmlIrCa + VXwKqYa + dLuhrFC + pOrKmYJ + IMYcGDJ + HvgMaOm + jKyxWve + "");
    }

    //垃圾方法
    private void kPSxuNpy(int xrwnhhndkz0, char mgnrigqd1, short phukcjwev2, boolean qqeioezbyb3) {
        boolean qqeioezbyb3a = qqeioezbyb3;
        short phukcjwev2a = phukcjwev2;
        char mgnrigqd1a = mgnrigqd1;
        int xrwnhhndkz0a = xrwnhhndkz0;
        System.out.println("kPSxuNpy" + mgnrigqd1a + xrwnhhndkz0a + phukcjwev2a + qqeioezbyb3a + "kPSxuNpy" + mOUnidq + QqbhKNL + osNgwJt + IMYcGDJ + dCwqzRU + EFVBcUw + dLuhrFC + VXwKqYa + HvgMaOm + JwUdBAv + pOrKmYJ + UlMskSY + xzwNnoL + BmlIrCa + jKyxWve + PifTqjz + "");
    }

    //垃圾方法
    private void PgwPwzai(float blvluude0, short ebbhzrfe1, boolean jefyivck2, char tiscmwxer3) {
        char tiscmwxer3a = tiscmwxer3;
        boolean jefyivck2a = jefyivck2;
        short ebbhzrfe1a = ebbhzrfe1;
        float blvluude0a = blvluude0;
        new WeakReference("PgwPwzai" + jefyivck2a + tiscmwxer3a + ebbhzrfe1a + blvluude0a + "PgwPwzai" + dCwqzRU + dLuhrFC + PifTqjz + xzwNnoL + HvgMaOm + BmlIrCa + IMYcGDJ + UlMskSY + pOrKmYJ + QqbhKNL + VXwKqYa + mOUnidq + EFVBcUw + osNgwJt + JwUdBAv + jKyxWve + "");
    }

    private boolean isSubBinderAlive() {
        char tiscmwxer3 = 3;
        boolean jefyivck2 = true;
        short ebbhzrfe1 = 52;
        float blvluude0 = 46.46f;
        boolean qqeioezbyb3 = false;
        short phukcjwev2 = 34;
        char mgnrigqd1 = 10;
        int xrwnhhndkz0 = 96;
        boolean rglerwfly1 = true;
        boolean rgwozlhioc0 = false;
        char ycbtqofj1 = 30;
        char pugkpcfteo0 = 66;
        dpUiTzlr(rgwozlhioc0, rglerwfly1);
        kPSxuNpy(xrwnhhndkz0, mgnrigqd1, phukcjwev2, qqeioezbyb3);
        PgwPwzai(blvluude0, ebbhzrfe1, jefyivck2, tiscmwxer3);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void IDFPVIuI(double kdoyrrr0, double kblgnpuu1, boolean wjbvramsx2, char zvghnuhg3, float pdplzkwm4) {
        float pdplzkwm4a = pdplzkwm4;
        char zvghnuhg3a = zvghnuhg3;
        boolean wjbvramsx2a = wjbvramsx2;
        double kblgnpuu1a = kblgnpuu1;
        double kdoyrrr0a = kdoyrrr0;
        new String("IDFPVIuI" + zvghnuhg3a + kblgnpuu1a + wjbvramsx2a + kdoyrrr0a + pdplzkwm4a + "IDFPVIuI" + IMYcGDJ + mOUnidq + osNgwJt + QqbhKNL + BmlIrCa + xzwNnoL + HvgMaOm + VXwKqYa + PifTqjz + EFVBcUw + dCwqzRU + UlMskSY + jKyxWve + dLuhrFC + pOrKmYJ + JwUdBAv + "");
    }

    //垃圾方法
    private void vnhhTLwp(boolean arjccnypoe0, boolean wfmozqf1) {
        boolean wfmozqf1a = wfmozqf1;
        boolean arjccnypoe0a = arjccnypoe0;
        new Intent("vnhhTLwp" + wfmozqf1a + arjccnypoe0a + "vnhhTLwp" + IMYcGDJ + UlMskSY + VXwKqYa + dCwqzRU + dLuhrFC + PifTqjz + JwUdBAv + HvgMaOm + jKyxWve + EFVBcUw + QqbhKNL + osNgwJt + BmlIrCa + mOUnidq + xzwNnoL + pOrKmYJ + "");
    }

    //垃圾方法
    private void DTkQYjPd(double ixramvumop0, short sobqkbgvfj1, int xkzshwkguz2, int xcpdynylgu3) {
        int xcpdynylgu3a = xcpdynylgu3;
        int xkzshwkguz2a = xkzshwkguz2;
        short sobqkbgvfj1a = sobqkbgvfj1;
        double ixramvumop0a = ixramvumop0;
        Log.w("DTkQYjPd", "DTkQYjPd" + ixramvumop0a + xkzshwkguz2a + xcpdynylgu3a + sobqkbgvfj1a + "DTkQYjPd" + osNgwJt + pOrKmYJ + JwUdBAv + IMYcGDJ + mOUnidq + EFVBcUw + PifTqjz + dCwqzRU + jKyxWve + VXwKqYa + HvgMaOm + QqbhKNL + dLuhrFC + UlMskSY + BmlIrCa + xzwNnoL + "");
    }

    //垃圾方法
    private void JjIGjYkZ(short rvvjhhqco0, double umosfxy1, boolean vijfknxg2) {
        boolean vijfknxg2a = vijfknxg2;
        double umosfxy1a = umosfxy1;
        short rvvjhhqco0a = rvvjhhqco0;
        new StringBuilder("JjIGjYkZ" + rvvjhhqco0a + vijfknxg2a + umosfxy1a + "JjIGjYkZ" + JwUdBAv + PifTqjz + dLuhrFC + EFVBcUw + dCwqzRU + HvgMaOm + VXwKqYa + QqbhKNL + UlMskSY + jKyxWve + BmlIrCa + pOrKmYJ + IMYcGDJ + mOUnidq + xzwNnoL + osNgwJt + "");
    }

    //垃圾方法
    private void XWckwKVd(int pluzmqu0, char jbdpnsvhaj1, double xqdbakmjl2, short amkudyupr3, short belstbxc4) {
        short belstbxc4a = belstbxc4;
        short amkudyupr3a = amkudyupr3;
        double xqdbakmjl2a = xqdbakmjl2;
        char jbdpnsvhaj1a = jbdpnsvhaj1;
        int pluzmqu0a = pluzmqu0;
        System.out.println("XWckwKVd" + amkudyupr3a + xqdbakmjl2a + jbdpnsvhaj1a + belstbxc4a + pluzmqu0a + "XWckwKVd" + pOrKmYJ + HvgMaOm + mOUnidq + osNgwJt + EFVBcUw + IMYcGDJ + dLuhrFC + BmlIrCa + jKyxWve + xzwNnoL + JwUdBAv + UlMskSY + dCwqzRU + PifTqjz + VXwKqYa + QqbhKNL + "");
    }

    //垃圾方法
    private void RHFXAEWM(char xhyzlxniqv0) {
        char xhyzlxniqv0a = xhyzlxniqv0;
        TextUtils.isEmpty("RHFXAEWM" + xhyzlxniqv0a + "RHFXAEWM" + VXwKqYa + osNgwJt + EFVBcUw + IMYcGDJ + UlMskSY + jKyxWve + dCwqzRU + xzwNnoL + JwUdBAv + mOUnidq + QqbhKNL + PifTqjz + BmlIrCa + pOrKmYJ + dLuhrFC + HvgMaOm + "");
    }

    //垃圾方法
    private void WrQZqqrM(boolean wzqokivheo0, float luhwfkcab1, boolean vetcxojhx2, long sinrcwu3, long zpacrmbmaj4) {
        long zpacrmbmaj4a = zpacrmbmaj4;
        long sinrcwu3a = sinrcwu3;
        boolean vetcxojhx2a = vetcxojhx2;
        float luhwfkcab1a = luhwfkcab1;
        boolean wzqokivheo0a = wzqokivheo0;
        new WeakReference("WrQZqqrM" + luhwfkcab1a + vetcxojhx2a + wzqokivheo0a + zpacrmbmaj4a + sinrcwu3a + "WrQZqqrM" + PifTqjz + osNgwJt + UlMskSY + dLuhrFC + mOUnidq + HvgMaOm + xzwNnoL + JwUdBAv + VXwKqYa + BmlIrCa + dCwqzRU + IMYcGDJ + EFVBcUw + QqbhKNL + pOrKmYJ + jKyxWve + "");
    }

    //垃圾方法
    private void mXwkrbnR(short srtafdrkwl0, short ylugtkbjr1, byte xsrakhhyiu2, byte acqchdjyh3, byte emrqrphg4) {
        byte emrqrphg4a = emrqrphg4;
        byte acqchdjyh3a = acqchdjyh3;
        byte xsrakhhyiu2a = xsrakhhyiu2;
        short ylugtkbjr1a = ylugtkbjr1;
        short srtafdrkwl0a = srtafdrkwl0;
        new String("mXwkrbnR" + srtafdrkwl0a + emrqrphg4a + ylugtkbjr1a + acqchdjyh3a + xsrakhhyiu2a + "mXwkrbnR" + VXwKqYa + xzwNnoL + dCwqzRU + dLuhrFC + UlMskSY + mOUnidq + IMYcGDJ + HvgMaOm + osNgwJt + pOrKmYJ + EFVBcUw + jKyxWve + QqbhKNL + BmlIrCa + JwUdBAv + PifTqjz + "");
    }

    //垃圾方法
    private void UooWZKMR(char cdstlpw0, char jpvhftjpx1, boolean ndziumzwol2, byte fsuzuulv3) {
        byte fsuzuulv3a = fsuzuulv3;
        boolean ndziumzwol2a = ndziumzwol2;
        char jpvhftjpx1a = jpvhftjpx1;
        char cdstlpw0a = cdstlpw0;
        new StringBuffer("UooWZKMR" + fsuzuulv3a + ndziumzwol2a + jpvhftjpx1a + cdstlpw0a + "UooWZKMR" + IMYcGDJ + VXwKqYa + HvgMaOm + jKyxWve + dLuhrFC + UlMskSY + PifTqjz + osNgwJt + QqbhKNL + EFVBcUw + JwUdBAv + dCwqzRU + mOUnidq + xzwNnoL + pOrKmYJ + BmlIrCa + "");
    }

    //垃圾方法
    private void vbzusFyg(double vxtlozyp0, long iqbkrzxjrf1, double sqccebr2, int bklnwwhf3, char xxsyudeojh4) {
        char xxsyudeojh4a = xxsyudeojh4;
        int bklnwwhf3a = bklnwwhf3;
        double sqccebr2a = sqccebr2;
        long iqbkrzxjrf1a = iqbkrzxjrf1;
        double vxtlozyp0a = vxtlozyp0;
        new File("vbzusFyg" + iqbkrzxjrf1a + vxtlozyp0a + sqccebr2a + xxsyudeojh4a + bklnwwhf3a + "vbzusFyg" + QqbhKNL + mOUnidq + JwUdBAv + IMYcGDJ + dLuhrFC + osNgwJt + dCwqzRU + PifTqjz + VXwKqYa + jKyxWve + UlMskSY + pOrKmYJ + EFVBcUw + xzwNnoL + HvgMaOm + BmlIrCa + "");
    }

    //垃圾方法
    private void fChbllEo(float whejswjm0, double tifyzkkucb1, float cvjfciwh2, boolean pfghiuk3, float yniyvba4) {
        float yniyvba4a = yniyvba4;
        boolean pfghiuk3a = pfghiuk3;
        float cvjfciwh2a = cvjfciwh2;
        double tifyzkkucb1a = tifyzkkucb1;
        float whejswjm0a = whejswjm0;
        new Intent("fChbllEo" + tifyzkkucb1a + whejswjm0a + yniyvba4a + pfghiuk3a + cvjfciwh2a + "fChbllEo" + dLuhrFC + jKyxWve + QqbhKNL + mOUnidq + dCwqzRU + xzwNnoL + VXwKqYa + PifTqjz + pOrKmYJ + JwUdBAv + osNgwJt + UlMskSY + EFVBcUw + HvgMaOm + IMYcGDJ + BmlIrCa + "");
    }

    //垃圾方法
    private void GWIPvHBl(byte cjnevsk0, boolean rpxlsyhmrf1, boolean hlfldkp2, long lkebtljb3, double vfccodvzj4) {
        double vfccodvzj4a = vfccodvzj4;
        long lkebtljb3a = lkebtljb3;
        boolean hlfldkp2a = hlfldkp2;
        boolean rpxlsyhmrf1a = rpxlsyhmrf1;
        byte cjnevsk0a = cjnevsk0;
        TextUtils.isDigitsOnly("GWIPvHBl" + rpxlsyhmrf1a + vfccodvzj4a + lkebtljb3a + cjnevsk0a + hlfldkp2a + "GWIPvHBl" + jKyxWve + PifTqjz + EFVBcUw + QqbhKNL + BmlIrCa + osNgwJt + JwUdBAv + dLuhrFC + dCwqzRU + UlMskSY + pOrKmYJ + IMYcGDJ + mOUnidq + HvgMaOm + VXwKqYa + xzwNnoL + "");
    }

    //垃圾方法
    private void eksRunoV(long kljfjrlepp0, short lgynqzh1) {
        short lgynqzh1a = lgynqzh1;
        long kljfjrlepp0a = kljfjrlepp0;
        Log.e("eksRunoV", "eksRunoV" + lgynqzh1a + kljfjrlepp0a + "eksRunoV" + jKyxWve + mOUnidq + dLuhrFC + xzwNnoL + QqbhKNL + osNgwJt + VXwKqYa + UlMskSY + JwUdBAv + pOrKmYJ + BmlIrCa + PifTqjz + EFVBcUw + dCwqzRU + IMYcGDJ + HvgMaOm + "");
    }

    //垃圾方法
    private void mTJjkRVF(char opxdjqz0, long sgvsgfsox1, short fgmrjtuiy2, long qrhocsiler3) {
        long qrhocsiler3a = qrhocsiler3;
        short fgmrjtuiy2a = fgmrjtuiy2;
        long sgvsgfsox1a = sgvsgfsox1;
        char opxdjqz0a = opxdjqz0;
        new StringReader("mTJjkRVF" + qrhocsiler3a + opxdjqz0a + sgvsgfsox1a + fgmrjtuiy2a + "mTJjkRVF" + IMYcGDJ + xzwNnoL + QqbhKNL + HvgMaOm + osNgwJt + pOrKmYJ + mOUnidq + PifTqjz + BmlIrCa + dCwqzRU + JwUdBAv + EFVBcUw + jKyxWve + VXwKqYa + UlMskSY + dLuhrFC + "");
    }

    //垃圾方法
    private void AMRZkTOv(char mssivbe0, char yjtypydm1, short qlumltgp2) {
        short qlumltgp2a = qlumltgp2;
        char yjtypydm1a = yjtypydm1;
        char mssivbe0a = mssivbe0;
        System.out.println("AMRZkTOv" + mssivbe0a + yjtypydm1a + qlumltgp2a + "AMRZkTOv" + mOUnidq + UlMskSY + PifTqjz + xzwNnoL + JwUdBAv + dLuhrFC + jKyxWve + HvgMaOm + QqbhKNL + IMYcGDJ + pOrKmYJ + EFVBcUw + BmlIrCa + VXwKqYa + osNgwJt + dCwqzRU + "");
    }

    //垃圾方法
    private void DNlNIbxT(int qbspzwvws0, float plwtkzdsjp1, long rhcniopjy2, long mioawaxe3, double btrodrpu4) {
        double btrodrpu4a = btrodrpu4;
        long mioawaxe3a = mioawaxe3;
        long rhcniopjy2a = rhcniopjy2;
        float plwtkzdsjp1a = plwtkzdsjp1;
        int qbspzwvws0a = qbspzwvws0;
        new StringBuilder("DNlNIbxT" + mioawaxe3a + btrodrpu4a + rhcniopjy2a + qbspzwvws0a + plwtkzdsjp1a + "DNlNIbxT" + UlMskSY + xzwNnoL + pOrKmYJ + VXwKqYa + JwUdBAv + BmlIrCa + EFVBcUw + QqbhKNL + osNgwJt + HvgMaOm + mOUnidq + dLuhrFC + jKyxWve + IMYcGDJ + dCwqzRU + PifTqjz + "");
    }

    //垃圾方法
    private void KhxVoiMa(float ofhbpckk0, short aexzkolile1) {
        short aexzkolile1a = aexzkolile1;
        float ofhbpckk0a = ofhbpckk0;
        Log.e("KhxVoiMa", "KhxVoiMa" + ofhbpckk0a + aexzkolile1a + "KhxVoiMa" + jKyxWve + QqbhKNL + dCwqzRU + BmlIrCa + EFVBcUw + HvgMaOm + JwUdBAv + mOUnidq + VXwKqYa + IMYcGDJ + PifTqjz + dLuhrFC + UlMskSY + osNgwJt + xzwNnoL + pOrKmYJ + "");
    }

    //垃圾方法
    private void hioGtCep(float suimqag0) {
        float suimqag0a = suimqag0;
        new StringBuffer("hioGtCep" + suimqag0a + "hioGtCep" + BmlIrCa + xzwNnoL + HvgMaOm + pOrKmYJ + VXwKqYa + jKyxWve + dCwqzRU + UlMskSY + IMYcGDJ + JwUdBAv + mOUnidq + PifTqjz + QqbhKNL + osNgwJt + dLuhrFC + EFVBcUw + "");
    }

    //垃圾方法
    private void OIIlGIpk(float jsfczijqh0, boolean uvvepya1, boolean qaakpffu2) {
        boolean qaakpffu2a = qaakpffu2;
        boolean uvvepya1a = uvvepya1;
        float jsfczijqh0a = jsfczijqh0;
        new StringReader("OIIlGIpk" + jsfczijqh0a + qaakpffu2a + uvvepya1a + "OIIlGIpk" + jKyxWve + dCwqzRU + HvgMaOm + IMYcGDJ + EFVBcUw + mOUnidq + JwUdBAv + BmlIrCa + pOrKmYJ + QqbhKNL + PifTqjz + UlMskSY + xzwNnoL + osNgwJt + dLuhrFC + VXwKqYa + "");
    }

    //垃圾方法
    private void WSezBOPm(char lfgcefvb0, float qvponic1, short llabeeglq2, byte cnsafdpijf3) {
        byte cnsafdpijf3a = cnsafdpijf3;
        short llabeeglq2a = llabeeglq2;
        float qvponic1a = qvponic1;
        char lfgcefvb0a = lfgcefvb0;
        new StringBuilder("WSezBOPm" + lfgcefvb0a + qvponic1a + cnsafdpijf3a + llabeeglq2a + "WSezBOPm" + pOrKmYJ + dLuhrFC + xzwNnoL + dCwqzRU + JwUdBAv + jKyxWve + osNgwJt + mOUnidq + EFVBcUw + IMYcGDJ + QqbhKNL + UlMskSY + HvgMaOm + PifTqjz + BmlIrCa + VXwKqYa + "");
    }

    //垃圾方法
    private void SOgSQsug(float winzjxqoyk0, byte ytluskshem1, int ivpabpqdb2, float yctscok3) {
        float yctscok3a = yctscok3;
        int ivpabpqdb2a = ivpabpqdb2;
        byte ytluskshem1a = ytluskshem1;
        float winzjxqoyk0a = winzjxqoyk0;
        Log.w("SOgSQsug", "SOgSQsug" + yctscok3a + ytluskshem1a + winzjxqoyk0a + ivpabpqdb2a + "SOgSQsug" + mOUnidq + HvgMaOm + dLuhrFC + PifTqjz + JwUdBAv + osNgwJt + UlMskSY + BmlIrCa + VXwKqYa + dCwqzRU + IMYcGDJ + jKyxWve + EFVBcUw + QqbhKNL + xzwNnoL + pOrKmYJ + "");
    }

    //垃圾方法
    private void uWivxdzP(char uucmqmujz0, short gnmevgmsan1) {
        short gnmevgmsan1a = gnmevgmsan1;
        char uucmqmujz0a = uucmqmujz0;
        new StringBuilder("uWivxdzP" + gnmevgmsan1a + uucmqmujz0a + "uWivxdzP" + VXwKqYa + UlMskSY + dCwqzRU + xzwNnoL + HvgMaOm + dLuhrFC + QqbhKNL + jKyxWve + EFVBcUw + IMYcGDJ + PifTqjz + JwUdBAv + mOUnidq + osNgwJt + pOrKmYJ + BmlIrCa + "");
    }

    //垃圾方法
    private void PehxMhgf(char kjwvgshr0, short dhinula1) {
        short dhinula1a = dhinula1;
        char kjwvgshr0a = kjwvgshr0;
        Log.w("PehxMhgf", "PehxMhgf" + dhinula1a + kjwvgshr0a + "PehxMhgf" + dCwqzRU + JwUdBAv + pOrKmYJ + QqbhKNL + BmlIrCa + VXwKqYa + dLuhrFC + PifTqjz + xzwNnoL + jKyxWve + HvgMaOm + IMYcGDJ + mOUnidq + UlMskSY + osNgwJt + EFVBcUw + "");
    }

    //垃圾方法
    private void QwNpjGId(byte tkyfgsmhts0, byte cjwyhiny1) {
        byte cjwyhiny1a = cjwyhiny1;
        byte tkyfgsmhts0a = tkyfgsmhts0;
        new WeakReference("QwNpjGId" + tkyfgsmhts0a + cjwyhiny1a + "QwNpjGId" + QqbhKNL + BmlIrCa + pOrKmYJ + dCwqzRU + VXwKqYa + PifTqjz + jKyxWve + osNgwJt + JwUdBAv + dLuhrFC + xzwNnoL + IMYcGDJ + mOUnidq + HvgMaOm + UlMskSY + EFVBcUw + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        byte cjwyhiny1 = 43;
        byte tkyfgsmhts0 = 84;
        short dhinula1 = 22;
        char kjwvgshr0 = 35;
        short gnmevgmsan1 = 52;
        char uucmqmujz0 = 47;
        float yctscok3 = 37.37f;
        int ivpabpqdb2 = 25;
        byte ytluskshem1 = 5;
        float winzjxqoyk0 = 44.44f;
        byte cnsafdpijf3 = 99;
        short llabeeglq2 = 19;
        float qvponic1 = 67.67f;
        char lfgcefvb0 = 54;
        boolean qaakpffu2 = false;
        boolean uvvepya1 = false;
        float jsfczijqh0 = 45.45f;
        float suimqag0 = 39.39f;
        short aexzkolile1 = 94;
        float ofhbpckk0 = 45.45f;
        double btrodrpu4 = 43.43;
        long mioawaxe3 = 20L;
        long rhcniopjy2 = 33L;
        float plwtkzdsjp1 = 29.29f;
        int qbspzwvws0 = 7;
        short qlumltgp2 = 99;
        char yjtypydm1 = 31;
        char mssivbe0 = 23;
        long qrhocsiler3 = 26L;
        short fgmrjtuiy2 = 86;
        long sgvsgfsox1 = 72L;
        char opxdjqz0 = 97;
        short lgynqzh1 = 31;
        long kljfjrlepp0 = 72L;
        double vfccodvzj4 = 83.83;
        long lkebtljb3 = 72L;
        boolean hlfldkp2 = true;
        boolean rpxlsyhmrf1 = false;
        byte cjnevsk0 = 81;
        float yniyvba4 = 98.98f;
        boolean pfghiuk3 = true;
        float cvjfciwh2 = 94.94f;
        double tifyzkkucb1 = 73.73;
        float whejswjm0 = 64.64f;
        char xxsyudeojh4 = 87;
        int bklnwwhf3 = 49;
        double sqccebr2 = 3.3;
        long iqbkrzxjrf1 = 22L;
        double vxtlozyp0 = 82.82;
        byte fsuzuulv3 = 22;
        boolean ndziumzwol2 = true;
        char jpvhftjpx1 = 23;
        char cdstlpw0 = 95;
        byte emrqrphg4 = 29;
        byte acqchdjyh3 = 54;
        byte xsrakhhyiu2 = 92;
        short ylugtkbjr1 = 88;
        short srtafdrkwl0 = 92;
        long zpacrmbmaj4 = 19L;
        long sinrcwu3 = 73L;
        boolean vetcxojhx2 = true;
        float luhwfkcab1 = 28.28f;
        boolean wzqokivheo0 = true;
        char xhyzlxniqv0 = 39;
        short belstbxc4 = 77;
        short amkudyupr3 = 57;
        double xqdbakmjl2 = 17.17;
        char jbdpnsvhaj1 = 14;
        int pluzmqu0 = 79;
        boolean vijfknxg2 = false;
        double umosfxy1 = 78.78;
        short rvvjhhqco0 = 82;
        int xcpdynylgu3 = 71;
        int xkzshwkguz2 = 49;
        short sobqkbgvfj1 = 63;
        double ixramvumop0 = 19.19;
        boolean wfmozqf1 = false;
        boolean arjccnypoe0 = false;
        float pdplzkwm4 = 22.22f;
        char zvghnuhg3 = 40;
        boolean wjbvramsx2 = false;
        double kblgnpuu1 = 44.44;
        double kdoyrrr0 = 56.56;
        if (GatorManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        fChbllEo(whejswjm0, tifyzkkucb1, cvjfciwh2, pfghiuk3, yniyvba4);
        PehxMhgf(kjwvgshr0, dhinula1);
        OIIlGIpk(jsfczijqh0, uvvepya1, qaakpffu2);
        UooWZKMR(cdstlpw0, jpvhftjpx1, ndziumzwol2, fsuzuulv3);
        DTkQYjPd(ixramvumop0, sobqkbgvfj1, xkzshwkguz2, xcpdynylgu3);
        PehxMhgf(kjwvgshr0, dhinula1);
        WSezBOPm(lfgcefvb0, qvponic1, llabeeglq2, cnsafdpijf3);
        isStartService = false;
        isLiving = false;
        XWckwKVd(pluzmqu0, jbdpnsvhaj1, xqdbakmjl2, amkudyupr3, belstbxc4);
        eksRunoV(kljfjrlepp0, lgynqzh1);
        mXwkrbnR(srtafdrkwl0, ylugtkbjr1, xsrakhhyiu2, acqchdjyh3, emrqrphg4);
        DNlNIbxT(qbspzwvws0, plwtkzdsjp1, rhcniopjy2, mioawaxe3, btrodrpu4);
        PehxMhgf(kjwvgshr0, dhinula1);
        SOgSQsug(winzjxqoyk0, ytluskshem1, ivpabpqdb2, yctscok3);
        isReTryBinding = false;
        this.startSubService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void KSCveIYA(short myqclorz0, short olcszedgn1, float bdnbbqfuso2, double mgksvoqf3, byte vhrcmqn4) {
        byte vhrcmqn4a = vhrcmqn4;
        double mgksvoqf3a = mgksvoqf3;
        float bdnbbqfuso2a = bdnbbqfuso2;
        short olcszedgn1a = olcszedgn1;
        short myqclorz0a = myqclorz0;
        TextUtils.isDigitsOnly("KSCveIYA" + vhrcmqn4a + mgksvoqf3a + olcszedgn1a + bdnbbqfuso2a + myqclorz0a + "KSCveIYA" + dLuhrFC + xzwNnoL + VXwKqYa + IMYcGDJ + BmlIrCa + pOrKmYJ + jKyxWve + UlMskSY + EFVBcUw + HvgMaOm + mOUnidq + JwUdBAv + dCwqzRU + QqbhKNL + PifTqjz + osNgwJt + "");
    }

    //垃圾方法
    private void sDzJRLPZ(int xmtazjczps0, byte wsjmhrsh1, boolean npjtnspe2, int mcsgvegzsy3) {
        int mcsgvegzsy3a = mcsgvegzsy3;
        boolean npjtnspe2a = npjtnspe2;
        byte wsjmhrsh1a = wsjmhrsh1;
        int xmtazjczps0a = xmtazjczps0;
        new Thread("sDzJRLPZ" + mcsgvegzsy3a + wsjmhrsh1a + xmtazjczps0a + npjtnspe2a + "sDzJRLPZ" + pOrKmYJ + PifTqjz + jKyxWve + osNgwJt + IMYcGDJ + VXwKqYa + dCwqzRU + BmlIrCa + QqbhKNL + HvgMaOm + xzwNnoL + dLuhrFC + EFVBcUw + JwUdBAv + mOUnidq + UlMskSY + "");
    }

    //垃圾方法
    private void WVZgQqSb(float fyfytuxtgx0, boolean vsyzxuqu1, int qqktvkgb2, short frmahcmtog3, long qcjniqb4) {
        long qcjniqb4a = qcjniqb4;
        short frmahcmtog3a = frmahcmtog3;
        int qqktvkgb2a = qqktvkgb2;
        boolean vsyzxuqu1a = vsyzxuqu1;
        float fyfytuxtgx0a = fyfytuxtgx0;
        new Thread("WVZgQqSb" + qcjniqb4a + fyfytuxtgx0a + vsyzxuqu1a + qqktvkgb2a + frmahcmtog3a + "WVZgQqSb" + QqbhKNL + BmlIrCa + dLuhrFC + HvgMaOm + jKyxWve + VXwKqYa + IMYcGDJ + pOrKmYJ + mOUnidq + dCwqzRU + UlMskSY + EFVBcUw + PifTqjz + JwUdBAv + osNgwJt + xzwNnoL + "");
    }

    //垃圾方法
    private void drkryhUR(long pciwbaxuif0) {
        long pciwbaxuif0a = pciwbaxuif0;
        new Intent("drkryhUR" + pciwbaxuif0a + "drkryhUR" + BmlIrCa + dLuhrFC + dCwqzRU + HvgMaOm + xzwNnoL + IMYcGDJ + mOUnidq + JwUdBAv + UlMskSY + PifTqjz + EFVBcUw + jKyxWve + QqbhKNL + pOrKmYJ + osNgwJt + VXwKqYa + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        long pciwbaxuif0 = 83L;
        long qcjniqb4 = 65L;
        short frmahcmtog3 = 59;
        int qqktvkgb2 = 20;
        boolean vsyzxuqu1 = false;
        float fyfytuxtgx0 = 26.26f;
        int mcsgvegzsy3 = 30;
        boolean npjtnspe2 = false;
        byte wsjmhrsh1 = 35;
        int xmtazjczps0 = 73;
        byte vhrcmqn4 = 49;
        double mgksvoqf3 = 35.35;
        float bdnbbqfuso2 = 48.48f;
        short olcszedgn1 = 93;
        short myqclorz0 = 7;
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            drkryhUR(pciwbaxuif0);
            KSCveIYA(myqclorz0, olcszedgn1, bdnbbqfuso2, mgksvoqf3, vhrcmqn4);
            KSCveIYA(myqclorz0, olcszedgn1, bdnbbqfuso2, mgksvoqf3, vhrcmqn4);
            WVZgQqSb(fyfytuxtgx0, vsyzxuqu1, qqktvkgb2, frmahcmtog3, qcjniqb4);
            isReTryBinding = false;
        } else {
            if (GatorManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                GatorManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void yGyJIszo(long vvivmqe0) {
        long vvivmqe0a = vvivmqe0;
        TextUtils.isDigitsOnly("yGyJIszo" + vvivmqe0a + "yGyJIszo" + mOUnidq + xzwNnoL + BmlIrCa + UlMskSY + HvgMaOm + osNgwJt + VXwKqYa + PifTqjz + dCwqzRU + QqbhKNL + jKyxWve + EFVBcUw + IMYcGDJ + pOrKmYJ + JwUdBAv + dLuhrFC + "");
    }

    //垃圾方法
    private void QEXzEbJk(int zcdjoieg0, float ftqiyvqs1) {
        float ftqiyvqs1a = ftqiyvqs1;
        int zcdjoieg0a = zcdjoieg0;
        new String("QEXzEbJk" + zcdjoieg0a + ftqiyvqs1a + "QEXzEbJk" + IMYcGDJ + pOrKmYJ + xzwNnoL + jKyxWve + HvgMaOm + EFVBcUw + QqbhKNL + VXwKqYa + dCwqzRU + osNgwJt + PifTqjz + BmlIrCa + dLuhrFC + UlMskSY + JwUdBAv + mOUnidq + "");
    }

    //垃圾方法
    private void BQUwBwbp(double ajcgkkldc0, int drtkjqhd1) {
        int drtkjqhd1a = drtkjqhd1;
        double ajcgkkldc0a = ajcgkkldc0;
        Log.i("BQUwBwbp", "BQUwBwbp" + drtkjqhd1a + ajcgkkldc0a + "BQUwBwbp" + dCwqzRU + xzwNnoL + pOrKmYJ + IMYcGDJ + mOUnidq + UlMskSY + BmlIrCa + jKyxWve + osNgwJt + PifTqjz + EFVBcUw + HvgMaOm + dLuhrFC + JwUdBAv + QqbhKNL + VXwKqYa + "");
    }

    //垃圾方法
    private void EySBxYdd(char zadcmdx0) {
        char zadcmdx0a = zadcmdx0;
        Log.e("EySBxYdd", "EySBxYdd" + zadcmdx0a + "EySBxYdd" + osNgwJt + IMYcGDJ + pOrKmYJ + UlMskSY + dLuhrFC + QqbhKNL + JwUdBAv + HvgMaOm + VXwKqYa + EFVBcUw + jKyxWve + mOUnidq + PifTqjz + dCwqzRU + BmlIrCa + xzwNnoL + "");
    }

    //垃圾方法
    private void lBGXnKbr(boolean wfojzio0, boolean vekwivt1, boolean uarvevjljc2, long nbtyqtdg3) {
        long nbtyqtdg3a = nbtyqtdg3;
        boolean uarvevjljc2a = uarvevjljc2;
        boolean vekwivt1a = vekwivt1;
        boolean wfojzio0a = wfojzio0;
        new StringBuffer("lBGXnKbr" + nbtyqtdg3a + wfojzio0a + vekwivt1a + uarvevjljc2a + "lBGXnKbr" + osNgwJt + IMYcGDJ + BmlIrCa + QqbhKNL + mOUnidq + VXwKqYa + dCwqzRU + xzwNnoL + PifTqjz + HvgMaOm + UlMskSY + jKyxWve + JwUdBAv + pOrKmYJ + dLuhrFC + EFVBcUw + "");
    }

    //垃圾方法
    private void EMliZlVB(char aybgnrc0, char ammkvxw1, int gtxqazs2) {
        int gtxqazs2a = gtxqazs2;
        char ammkvxw1a = ammkvxw1;
        char aybgnrc0a = aybgnrc0;
        new StringBuffer("EMliZlVB" + ammkvxw1a + gtxqazs2a + aybgnrc0a + "EMliZlVB" + IMYcGDJ + UlMskSY + jKyxWve + VXwKqYa + JwUdBAv + HvgMaOm + QqbhKNL + PifTqjz + dCwqzRU + xzwNnoL + pOrKmYJ + dLuhrFC + osNgwJt + mOUnidq + BmlIrCa + EFVBcUw + "");
    }

    //垃圾方法
    private void CtyUCvaP(int yrkxpkuf0, double fvxgdxjwga1) {
        double fvxgdxjwga1a = fvxgdxjwga1;
        int yrkxpkuf0a = yrkxpkuf0;
        new StringReader("CtyUCvaP" + yrkxpkuf0a + fvxgdxjwga1a + "CtyUCvaP" + VXwKqYa + IMYcGDJ + PifTqjz + dLuhrFC + HvgMaOm + dCwqzRU + xzwNnoL + osNgwJt + UlMskSY + pOrKmYJ + JwUdBAv + mOUnidq + EFVBcUw + jKyxWve + QqbhKNL + BmlIrCa + "");
    }

    //垃圾方法
    private void hCbbXLqI(float hwpbnltwq0, int pdgnzkau1) {
        int pdgnzkau1a = pdgnzkau1;
        float hwpbnltwq0a = hwpbnltwq0;
        System.out.println("hCbbXLqI" + hwpbnltwq0a + pdgnzkau1a + "hCbbXLqI" + HvgMaOm + QqbhKNL + xzwNnoL + UlMskSY + osNgwJt + dLuhrFC + JwUdBAv + PifTqjz + BmlIrCa + IMYcGDJ + pOrKmYJ + EFVBcUw + dCwqzRU + mOUnidq + VXwKqYa + jKyxWve + "");
    }

    private void doStartSubService() {
        int pdgnzkau1 = 1;
        float hwpbnltwq0 = 21.21f;
        double fvxgdxjwga1 = 51.51;
        int yrkxpkuf0 = 100;
        int gtxqazs2 = 78;
        char ammkvxw1 = 63;
        char aybgnrc0 = 65;
        long nbtyqtdg3 = 55L;
        boolean uarvevjljc2 = false;
        boolean vekwivt1 = false;
        boolean wfojzio0 = true;
        char zadcmdx0 = 54;
        int drtkjqhd1 = 69;
        double ajcgkkldc0 = 35.35;
        float ftqiyvqs1 = 93.93f;
        int zcdjoieg0 = 51;
        long vvivmqe0 = 2L;
        lBGXnKbr(wfojzio0, vekwivt1, uarvevjljc2, nbtyqtdg3);
        hCbbXLqI(hwpbnltwq0, pdgnzkau1);
        yGyJIszo(vvivmqe0);
        hCbbXLqI(hwpbnltwq0, pdgnzkau1);
        CtyUCvaP(yrkxpkuf0, fvxgdxjwga1);
        BQUwBwbp(ajcgkkldc0, drtkjqhd1);
        QEXzEbJk(zcdjoieg0, ftqiyvqs1);
        EySBxYdd(zadcmdx0);
        if (GatorManager.isDebug) {
            Log.i(TAG, "主进程 doStartSubService5");
        }
        try {
            yGyJIszo(vvivmqe0);
            EMliZlVB(aybgnrc0, ammkvxw1, gtxqazs2);
            hCbbXLqI(hwpbnltwq0, pdgnzkau1);
            EySBxYdd(zadcmdx0);
            hCbbXLqI(hwpbnltwq0, pdgnzkau1);
            yGyJIszo(vvivmqe0);
            BQUwBwbp(ajcgkkldc0, drtkjqhd1);
            Intent intent = new Intent(this, Gator2Service.class);
            EMliZlVB(aybgnrc0, ammkvxw1, gtxqazs2);
            EMliZlVB(aybgnrc0, ammkvxw1, gtxqazs2);
            yGyJIszo(vvivmqe0);
            QEXzEbJk(zcdjoieg0, ftqiyvqs1);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            hCbbXLqI(hwpbnltwq0, pdgnzkau1);
            BQUwBwbp(ajcgkkldc0, drtkjqhd1);
            BQUwBwbp(ajcgkkldc0, drtkjqhd1);
            EySBxYdd(zadcmdx0);
            lBGXnKbr(wfojzio0, vekwivt1, uarvevjljc2, nbtyqtdg3);
            EySBxYdd(zadcmdx0);
            QEXzEbJk(zcdjoieg0, ftqiyvqs1);
            CtyUCvaP(yrkxpkuf0, fvxgdxjwga1);
            hCbbXLqI(hwpbnltwq0, pdgnzkau1);
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (GatorManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void zjaWVfnL(boolean afynyxlrzn0, short qyxzvoo1) {
        short qyxzvoo1a = qyxzvoo1;
        boolean afynyxlrzn0a = afynyxlrzn0;
        new String("zjaWVfnL" + afynyxlrzn0a + qyxzvoo1a + "zjaWVfnL" + jKyxWve + UlMskSY + osNgwJt + pOrKmYJ + PifTqjz + mOUnidq + BmlIrCa + xzwNnoL + IMYcGDJ + dCwqzRU + JwUdBAv + dLuhrFC + QqbhKNL + HvgMaOm + EFVBcUw + VXwKqYa + "");
    }

    //垃圾方法
    private void bTVSiFtK(double lgnetdioyq0, double alekgqw1) {
        double alekgqw1a = alekgqw1;
        double lgnetdioyq0a = lgnetdioyq0;
        new Thread("bTVSiFtK" + alekgqw1a + lgnetdioyq0a + "bTVSiFtK" + mOUnidq + jKyxWve + QqbhKNL + JwUdBAv + xzwNnoL + UlMskSY + osNgwJt + dLuhrFC + dCwqzRU + BmlIrCa + IMYcGDJ + VXwKqYa + pOrKmYJ + HvgMaOm + PifTqjz + EFVBcUw + "");
    }

    //垃圾方法
    private void AZuzyiiM(int bhebbdrt0, boolean rwkwifryzx1, short uzuvloaxxw2, byte bwfwrlb3, double tdwoxpgui4) {
        double tdwoxpgui4a = tdwoxpgui4;
        byte bwfwrlb3a = bwfwrlb3;
        short uzuvloaxxw2a = uzuvloaxxw2;
        boolean rwkwifryzx1a = rwkwifryzx1;
        int bhebbdrt0a = bhebbdrt0;
        Log.i("AZuzyiiM", "AZuzyiiM" + uzuvloaxxw2a + bhebbdrt0a + tdwoxpgui4a + bwfwrlb3a + rwkwifryzx1a + "AZuzyiiM" + IMYcGDJ + HvgMaOm + pOrKmYJ + VXwKqYa + dCwqzRU + BmlIrCa + xzwNnoL + QqbhKNL + PifTqjz + JwUdBAv + EFVBcUw + mOUnidq + UlMskSY + dLuhrFC + jKyxWve + osNgwJt + "");
    }

    //垃圾方法
    private void MOxMiZyf(boolean whvhxiekh0, float odaniwka1, char ziljtbsb2, short zferpjkdgl3) {
        short zferpjkdgl3a = zferpjkdgl3;
        char ziljtbsb2a = ziljtbsb2;
        float odaniwka1a = odaniwka1;
        boolean whvhxiekh0a = whvhxiekh0;
        new WeakReference("MOxMiZyf" + whvhxiekh0a + ziljtbsb2a + zferpjkdgl3a + odaniwka1a + "MOxMiZyf" + HvgMaOm + dCwqzRU + QqbhKNL + BmlIrCa + xzwNnoL + JwUdBAv + UlMskSY + IMYcGDJ + pOrKmYJ + VXwKqYa + dLuhrFC + PifTqjz + jKyxWve + osNgwJt + mOUnidq + EFVBcUw + "");
    }

    private void bindSubService() {
        short zferpjkdgl3 = 51;
        char ziljtbsb2 = 81;
        float odaniwka1 = 66.66f;
        boolean whvhxiekh0 = false;
        double tdwoxpgui4 = 70.70;
        byte bwfwrlb3 = 8;
        short uzuvloaxxw2 = 97;
        boolean rwkwifryzx1 = false;
        int bhebbdrt0 = 33;
        double alekgqw1 = 58.58;
        double lgnetdioyq0 = 35.35;
        short qyxzvoo1 = 4;
        boolean afynyxlrzn0 = false;
        try {
            this.bindService(new Intent(this, Gator2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (GatorManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void sCUUymyf(float itvliqunia0, double taieoqly1, double gyfjaddui2, double aiqqxgj3, char vjddecpzy4) {
        char vjddecpzy4a = vjddecpzy4;
        double aiqqxgj3a = aiqqxgj3;
        double gyfjaddui2a = gyfjaddui2;
        double taieoqly1a = taieoqly1;
        float itvliqunia0a = itvliqunia0;
        TextUtils.isDigitsOnly("sCUUymyf" + aiqqxgj3a + gyfjaddui2a + vjddecpzy4a + itvliqunia0a + taieoqly1a + "sCUUymyf" + "");
    }

    //垃圾方法
    static private void YblArthn(boolean yvhyctaj0) {
        boolean yvhyctaj0a = yvhyctaj0;
        Log.e("YblArthn", "YblArthn" + yvhyctaj0a + "YblArthn" + "");
    }

    //垃圾方法
    static private void GGRCbCUF(short bbahjkjhr0, short uztcsqoc1, float nmhdvgpaul2, short caxlpzwzks3, byte lgtlwtceyv4) {
        byte lgtlwtceyv4a = lgtlwtceyv4;
        short caxlpzwzks3a = caxlpzwzks3;
        float nmhdvgpaul2a = nmhdvgpaul2;
        short uztcsqoc1a = uztcsqoc1;
        short bbahjkjhr0a = bbahjkjhr0;
        Log.e("GGRCbCUF", "GGRCbCUF" + caxlpzwzks3a + nmhdvgpaul2a + lgtlwtceyv4a + uztcsqoc1a + bbahjkjhr0a + "GGRCbCUF" + "");
    }

    //垃圾方法
    static private void aDdODXxe(int qmfcbtg0, short uowmlhvhhu1, double svfwywrkr2, long qetxgml3, boolean iogmbdux4) {
        boolean iogmbdux4a = iogmbdux4;
        long qetxgml3a = qetxgml3;
        double svfwywrkr2a = svfwywrkr2;
        short uowmlhvhhu1a = uowmlhvhhu1;
        int qmfcbtg0a = qmfcbtg0;
        Log.w("aDdODXxe", "aDdODXxe" + qmfcbtg0a + iogmbdux4a + uowmlhvhhu1a + svfwywrkr2a + qetxgml3a + "aDdODXxe" + "");
    }

    private static boolean doStartMainService(Context context) {
        boolean iogmbdux4 = true;
        long qetxgml3 = 86L;
        double svfwywrkr2 = 76.76;
        short uowmlhvhhu1 = 5;
        int qmfcbtg0 = 12;
        byte lgtlwtceyv4 = 100;
        short caxlpzwzks3 = 54;
        float nmhdvgpaul2 = 86.86f;
        short uztcsqoc1 = 84;
        short bbahjkjhr0 = 3;
        boolean yvhyctaj0 = true;
        char vjddecpzy4 = 39;
        double aiqqxgj3 = 86.86;
        double gyfjaddui2 = 70.70;
        double taieoqly1 = 13.13;
        float itvliqunia0 = 53.53f;
        sCUUymyf(itvliqunia0, taieoqly1, gyfjaddui2, aiqqxgj3, vjddecpzy4);
        YblArthn(yvhyctaj0);
        sCUUymyf(itvliqunia0, taieoqly1, gyfjaddui2, aiqqxgj3, vjddecpzy4);
        GGRCbCUF(bbahjkjhr0, uztcsqoc1, nmhdvgpaul2, caxlpzwzks3, lgtlwtceyv4);
        sCUUymyf(itvliqunia0, taieoqly1, gyfjaddui2, aiqqxgj3, vjddecpzy4);
        GGRCbCUF(bbahjkjhr0, uztcsqoc1, nmhdvgpaul2, caxlpzwzks3, lgtlwtceyv4);
        YblArthn(yvhyctaj0);
        try {
            aDdODXxe(qmfcbtg0, uowmlhvhhu1, svfwywrkr2, qetxgml3, iogmbdux4);
            GGRCbCUF(bbahjkjhr0, uztcsqoc1, nmhdvgpaul2, caxlpzwzks3, lgtlwtceyv4);
            aDdODXxe(qmfcbtg0, uowmlhvhhu1, svfwywrkr2, qetxgml3, iogmbdux4);
            YblArthn(yvhyctaj0);
            YblArthn(yvhyctaj0);
            YblArthn(yvhyctaj0);
            GGRCbCUF(bbahjkjhr0, uztcsqoc1, nmhdvgpaul2, caxlpzwzks3, lgtlwtceyv4);
            YblArthn(yvhyctaj0);
            Intent intent = new Intent(context, Gator1Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(context.getPackageName());
            YblArthn(yvhyctaj0);
            YblArthn(yvhyctaj0);
            sCUUymyf(itvliqunia0, taieoqly1, gyfjaddui2, aiqqxgj3, vjddecpzy4);
            YblArthn(yvhyctaj0);
            sCUUymyf(itvliqunia0, taieoqly1, gyfjaddui2, aiqqxgj3, vjddecpzy4);
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (GatorManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void nGjTIYlR(short dkjuxlq0) {
        short dkjuxlq0a = dkjuxlq0;
        new WeakReference("nGjTIYlR" + dkjuxlq0a + "nGjTIYlR" + "");
    }

    //垃圾方法
    static private void zJHsUXjI(byte gwzqrqmavm0, short vhkttvvq1, boolean vrrbmzdqx2) {
        boolean vrrbmzdqx2a = vrrbmzdqx2;
        short vhkttvvq1a = vhkttvvq1;
        byte gwzqrqmavm0a = gwzqrqmavm0;
    }

    //垃圾方法
    static private void XILKrRnu(long tdnonbfynq0) {
        long tdnonbfynq0a = tdnonbfynq0;
        new StringReader("XILKrRnu" + tdnonbfynq0a + "XILKrRnu" + "");
    }

    //垃圾方法
    static private void WtbPTYWS(double veyzjtbk0, long tkxvivhml1) {
        long tkxvivhml1a = tkxvivhml1;
        double veyzjtbk0a = veyzjtbk0;
        new String("WtbPTYWS" + veyzjtbk0a + tkxvivhml1a + "WtbPTYWS" + "");
    }

    //垃圾方法
    static private void FnveuZgG(byte dxfeygfgxb0) {
        byte dxfeygfgxb0a = dxfeygfgxb0;
        new StringBuilder("FnveuZgG" + dxfeygfgxb0a + "FnveuZgG" + "");
    }

    //垃圾方法
    static private void SZqVvBtl(float pasblikdco0, float xcdxwiuvo1, char ipevtaft2) {
        char ipevtaft2a = ipevtaft2;
        float xcdxwiuvo1a = xcdxwiuvo1;
        float pasblikdco0a = pasblikdco0;
    }

    //垃圾方法
    static private void nieEHBQt(float xbkgmcgrbl0, long pdwusvrnh1, double nislcpwwec2, long rmytpodycw3) {
        long rmytpodycw3a = rmytpodycw3;
        double nislcpwwec2a = nislcpwwec2;
        long pdwusvrnh1a = pdwusvrnh1;
        float xbkgmcgrbl0a = xbkgmcgrbl0;
        new Thread("nieEHBQt" + nislcpwwec2a + xbkgmcgrbl0a + rmytpodycw3a + pdwusvrnh1a + "nieEHBQt" + "");
    }

    //垃圾方法
    static private void WdwtnzQX(long yclmrjyn0, boolean mciwqnrpv1, short ittfzvysu2, char ittbdavw3) {
        char ittbdavw3a = ittbdavw3;
        short ittfzvysu2a = ittfzvysu2;
        boolean mciwqnrpv1a = mciwqnrpv1;
        long yclmrjyn0a = yclmrjyn0;
        TextUtils.isDigitsOnly("WdwtnzQX" + mciwqnrpv1a + ittbdavw3a + ittfzvysu2a + yclmrjyn0a + "WdwtnzQX" + "");
    }

    private static void doBindMainService(Context context) {
        char ittbdavw3 = 90;
        short ittfzvysu2 = 47;
        boolean mciwqnrpv1 = false;
        long yclmrjyn0 = 81L;
        long rmytpodycw3 = 83L;
        double nislcpwwec2 = 31.31;
        long pdwusvrnh1 = 72L;
        float xbkgmcgrbl0 = 63.63f;
        char ipevtaft2 = 79;
        float xcdxwiuvo1 = 78.78f;
        float pasblikdco0 = 98.98f;
        byte dxfeygfgxb0 = 61;
        long tkxvivhml1 = 25L;
        double veyzjtbk0 = 7.7;
        long tdnonbfynq0 = 3L;
        boolean vrrbmzdqx2 = true;
        short vhkttvvq1 = 88;
        byte gwzqrqmavm0 = 4;
        short dkjuxlq0 = 1;
        WdwtnzQX(yclmrjyn0, mciwqnrpv1, ittfzvysu2, ittbdavw3);
        zJHsUXjI(gwzqrqmavm0, vhkttvvq1, vrrbmzdqx2);
        SZqVvBtl(pasblikdco0, xcdxwiuvo1, ipevtaft2);
        if (GatorManager.isDebug) {
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            nieEHBQt(xbkgmcgrbl0, pdwusvrnh1, nislcpwwec2, rmytpodycw3);
            FnveuZgG(dxfeygfgxb0);
            FnveuZgG(dxfeygfgxb0);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            XILKrRnu(tdnonbfynq0);
            WdwtnzQX(yclmrjyn0, mciwqnrpv1, ittfzvysu2, ittbdavw3);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            XILKrRnu(tdnonbfynq0);
            Log.i(TAG, "bindMainService5");
        }
        try {
            Intent intent = new Intent(context, Gator1Service.class);
            nGjTIYlR(dkjuxlq0);
            zJHsUXjI(gwzqrqmavm0, vhkttvvq1, vrrbmzdqx2);
            FnveuZgG(dxfeygfgxb0);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            nieEHBQt(xbkgmcgrbl0, pdwusvrnh1, nislcpwwec2, rmytpodycw3);
            SZqVvBtl(pasblikdco0, xcdxwiuvo1, ipevtaft2);
            zJHsUXjI(gwzqrqmavm0, vhkttvvq1, vrrbmzdqx2);
            nGjTIYlR(dkjuxlq0);
            intent.putExtra("isStartService", false);
            FnveuZgG(dxfeygfgxb0);
            zJHsUXjI(gwzqrqmavm0, vhkttvvq1, vrrbmzdqx2);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            WdwtnzQX(yclmrjyn0, mciwqnrpv1, ittfzvysu2, ittbdavw3);
            nGjTIYlR(dkjuxlq0);
            nieEHBQt(xbkgmcgrbl0, pdwusvrnh1, nislcpwwec2, rmytpodycw3);
            nGjTIYlR(dkjuxlq0);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            intent.setPackage(context.getPackageName());
            zJHsUXjI(gwzqrqmavm0, vhkttvvq1, vrrbmzdqx2);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            XILKrRnu(tdnonbfynq0);
            SZqVvBtl(pasblikdco0, xcdxwiuvo1, ipevtaft2);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            nieEHBQt(xbkgmcgrbl0, pdwusvrnh1, nislcpwwec2, rmytpodycw3);
            WtbPTYWS(veyzjtbk0, tkxvivhml1);
            context.bindService(intent, new ServiceConnection() {

                @Override
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                }

                @Override
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
        } catch (Exception var36) {
            Exception e2 = var36;
            if (GatorManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceGator.Stub {

        LocalBinder(Gator1Service this$0) {
        }

        //垃圾方法
        private void ucVuDdjW(char ddpaifs0, float xgxwexru1) {
            float xgxwexru1a = xgxwexru1;
            char ddpaifs0a = ddpaifs0;
            new StringReader("ucVuDdjW" + xgxwexru1a + ddpaifs0a + "ucVuDdjW" + "" + "");
        }

        //垃圾方法
        private void viAbmEvJ(byte jnqfcwmfh0, double dbzypev1, int lzyxyrldwm2) {
            int lzyxyrldwm2a = lzyxyrldwm2;
            double dbzypev1a = dbzypev1;
            byte jnqfcwmfh0a = jnqfcwmfh0;
            Log.e("viAbmEvJ", "viAbmEvJ" + dbzypev1a + jnqfcwmfh0a + lzyxyrldwm2a + "viAbmEvJ" + "" + "");
        }

        //垃圾方法
        private void chvZShKK(int thebotznb0, long rmnmokur1) {
            long rmnmokur1a = rmnmokur1;
            int thebotznb0a = thebotznb0;
            System.out.println("chvZShKK" + thebotznb0a + rmnmokur1a + "chvZShKK" + "" + "");
        }

        //垃圾方法
        private void CpPaAQIb(char gcfjklxrq0, byte vmdyfsv1) {
            byte vmdyfsv1a = vmdyfsv1;
            char gcfjklxrq0a = gcfjklxrq0;
            System.out.println("CpPaAQIb" + gcfjklxrq0a + vmdyfsv1a + "CpPaAQIb" + "" + "");
        }

        public String getServiceGator() throws RemoteException {
            byte vmdyfsv1 = 72;
            char gcfjklxrq0 = 13;
            long rmnmokur1 = 43L;
            int thebotznb0 = 80;
            int lzyxyrldwm2 = 5;
            double dbzypev1 = 54.54;
            byte jnqfcwmfh0 = 30;
            float xgxwexru1 = 56.56f;
            char ddpaifs0 = 5;
            return "LocalService";
        }

        //垃圾方法
        private void QpPpEWxa(double fbgqreb0, int cqogmql1, short nnspwdcxpy2, float jgviazcd3, char awvdsmxq4) {
            char awvdsmxq4a = awvdsmxq4;
            float jgviazcd3a = jgviazcd3;
            short nnspwdcxpy2a = nnspwdcxpy2;
            int cqogmql1a = cqogmql1;
            double fbgqreb0a = fbgqreb0;
            TextUtils.isEmpty("QpPpEWxa" + jgviazcd3a + nnspwdcxpy2a + fbgqreb0a + cqogmql1a + awvdsmxq4a + "QpPpEWxa" + "" + "");
        }

        //垃圾方法
        private void UGberCVE(double iktyyfafia0, double nhnhytsxm1, boolean iscgqpdxp2, long cpivcykmml3, double ntokjyde4) {
            double ntokjyde4a = ntokjyde4;
            long cpivcykmml3a = cpivcykmml3;
            boolean iscgqpdxp2a = iscgqpdxp2;
            double nhnhytsxm1a = nhnhytsxm1;
            double iktyyfafia0a = iktyyfafia0;
            new StringBuffer("UGberCVE" + cpivcykmml3a + ntokjyde4a + iscgqpdxp2a + nhnhytsxm1a + iktyyfafia0a + "UGberCVE" + "" + "");
        }

        //垃圾方法
        private void fvlzHxXW(float nthuefhn0, short hnmnnkv1, short uqxikkfc2) {
            short uqxikkfc2a = uqxikkfc2;
            short hnmnnkv1a = hnmnnkv1;
            float nthuefhn0a = nthuefhn0;
            new WeakReference("fvlzHxXW" + hnmnnkv1a + uqxikkfc2a + nthuefhn0a + "fvlzHxXW" + "" + "");
        }

        //垃圾方法
        private void mYXXpGWQ(byte lzaucfxvam0, char wcicebtqkf1) {
            char wcicebtqkf1a = wcicebtqkf1;
            byte lzaucfxvam0a = lzaucfxvam0;
            new StringBuffer("mYXXpGWQ" + lzaucfxvam0a + wcicebtqkf1a + "mYXXpGWQ" + "" + "");
        }

        public boolean isStartedGator() throws RemoteException {
            char wcicebtqkf1 = 76;
            byte lzaucfxvam0 = 35;
            short uqxikkfc2 = 8;
            short hnmnnkv1 = 29;
            float nthuefhn0 = 16.16f;
            double ntokjyde4 = 21.21;
            long cpivcykmml3 = 76L;
            boolean iscgqpdxp2 = false;
            double nhnhytsxm1 = 87.87;
            double iktyyfafia0 = 18.18;
            char awvdsmxq4 = 82;
            float jgviazcd3 = 13.13f;
            short nnspwdcxpy2 = 16;
            int cqogmql1 = 2;
            double fbgqreb0 = 80.80;
            return Gator1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Gator1Service this$0) {
        }

        //垃圾方法
        private void ajGXctkV(float ywjdobqd0, double jyfnzuferi1, int rjugqfqph2, char gvvkiodzao3) {
            char gvvkiodzao3a = gvvkiodzao3;
            int rjugqfqph2a = rjugqfqph2;
            double jyfnzuferi1a = jyfnzuferi1;
            float ywjdobqd0a = ywjdobqd0;
        }

        //垃圾方法
        private void rhDQJwlB(char fwqejsf0, char kopfethjox1) {
            char kopfethjox1a = kopfethjox1;
            char fwqejsf0a = fwqejsf0;
            Log.i("rhDQJwlB", "rhDQJwlB" + kopfethjox1a + fwqejsf0a + "rhDQJwlB" + "" + "");
        }

        //垃圾方法
        private void wKaXhbfk(long upomdjdc0, float xparfpcg1, long kuecdzi2, short loihykd3) {
            short loihykd3a = loihykd3;
            long kuecdzi2a = kuecdzi2;
            float xparfpcg1a = xparfpcg1;
            long upomdjdc0a = upomdjdc0;
            Log.i("wKaXhbfk", "wKaXhbfk" + xparfpcg1a + loihykd3a + kuecdzi2a + upomdjdc0a + "wKaXhbfk" + "" + "");
        }

        //垃圾方法
        private void EcckHbLc(char aincrijjdu0, long trcenafc1, boolean kcvymuydxj2, short wlcnffcj3, byte ckfeagkqgl4) {
            byte ckfeagkqgl4a = ckfeagkqgl4;
            short wlcnffcj3a = wlcnffcj3;
            boolean kcvymuydxj2a = kcvymuydxj2;
            long trcenafc1a = trcenafc1;
            char aincrijjdu0a = aincrijjdu0;
        }

        //垃圾方法
        private void NAYbfvir(byte wlbmrmiry0, long arjarndqu1) {
            long arjarndqu1a = arjarndqu1;
            byte wlbmrmiry0a = wlbmrmiry0;
            System.out.println("NAYbfvir" + wlbmrmiry0a + arjarndqu1a + "NAYbfvir" + "" + "");
        }

        //垃圾方法
        private void IqFcPXhL(byte ttfrfbc0, double bfycklk1) {
            double bfycklk1a = bfycklk1;
            byte ttfrfbc0a = ttfrfbc0;
            new String("IqFcPXhL" + bfycklk1a + ttfrfbc0a + "IqFcPXhL" + "" + "");
        }

        //垃圾方法
        private void OgvzXudd(int flrmiwu0, char vleigfj1, long adjvmun2) {
            long adjvmun2a = adjvmun2;
            char vleigfj1a = vleigfj1;
            int flrmiwu0a = flrmiwu0;
            new WeakReference("OgvzXudd" + vleigfj1a + adjvmun2a + flrmiwu0a + "OgvzXudd" + "" + "");
        }

        //垃圾方法
        private void gYnvaaAn(byte lgflwlfa0, boolean wtphxyxjk1, double whpzhgaeby2, boolean pjshlnhrg3, byte coepzjflz4) {
            byte coepzjflz4a = coepzjflz4;
            boolean pjshlnhrg3a = pjshlnhrg3;
            double whpzhgaeby2a = whpzhgaeby2;
            boolean wtphxyxjk1a = wtphxyxjk1;
            byte lgflwlfa0a = lgflwlfa0;
            new WeakReference("gYnvaaAn" + wtphxyxjk1a + lgflwlfa0a + whpzhgaeby2a + pjshlnhrg3a + coepzjflz4a + "gYnvaaAn" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            byte coepzjflz4 = 97;
            boolean pjshlnhrg3 = false;
            double whpzhgaeby2 = 78.78;
            boolean wtphxyxjk1 = true;
            byte lgflwlfa0 = 29;
            long adjvmun2 = 90L;
            char vleigfj1 = 1;
            int flrmiwu0 = 12;
            double bfycklk1 = 9.9;
            byte ttfrfbc0 = 71;
            long arjarndqu1 = 18L;
            byte wlbmrmiry0 = 4;
            byte ckfeagkqgl4 = 45;
            short wlcnffcj3 = 27;
            boolean kcvymuydxj2 = true;
            long trcenafc1 = 55L;
            char aincrijjdu0 = 74;
            short loihykd3 = 96;
            long kuecdzi2 = 61L;
            float xparfpcg1 = 7.7f;
            long upomdjdc0 = 79L;
            char kopfethjox1 = 94;
            char fwqejsf0 = 93;
            char gvvkiodzao3 = 90;
            int rjugqfqph2 = 94;
            double jyfnzuferi1 = 5.5;
            float ywjdobqd0 = 3.3f;
            gYnvaaAn(lgflwlfa0, wtphxyxjk1, whpzhgaeby2, pjshlnhrg3, coepzjflz4);
            wKaXhbfk(upomdjdc0, xparfpcg1, kuecdzi2, loihykd3);
            ajGXctkV(ywjdobqd0, jyfnzuferi1, rjugqfqph2, gvvkiodzao3);
            if (GatorManager.isDebug) {
                Log.i(Gator1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            try {
                IProcessServiceGator process = IProcessServiceGator.Stub.asInterface(service);
                process.getServiceGator();
            } catch (Exception var25) {
                Exception e = var25;
                if (GatorManager.isDebug) {
                    Log.e(Gator1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void nXReowbW(int hdioszjkd0, byte wfjdwfd1, int uebuwimqo2) {
            int uebuwimqo2a = uebuwimqo2;
            byte wfjdwfd1a = wfjdwfd1;
            int hdioszjkd0a = hdioszjkd0;
            Log.i("nXReowbW", "nXReowbW" + uebuwimqo2a + wfjdwfd1a + hdioszjkd0a + "nXReowbW" + "" + "");
        }

        //垃圾方法
        private void IaRalMJi(int qdinluisha0, double issmbjn1) {
            double issmbjn1a = issmbjn1;
            int qdinluisha0a = qdinluisha0;
            new StringBuffer("IaRalMJi" + issmbjn1a + qdinluisha0a + "IaRalMJi" + "" + "");
        }

        //垃圾方法
        private void XKYPnQBP(int ehgzortpce0) {
            int ehgzortpce0a = ehgzortpce0;
            new String("XKYPnQBP" + ehgzortpce0a + "XKYPnQBP" + "" + "");
        }

        //垃圾方法
        private void qOPpIxNC(float vpekopgbmg0, long vagealjq1, double ojiqvlh2, float ezxbepiprk3, char kiieilcx4) {
            char kiieilcx4a = kiieilcx4;
            float ezxbepiprk3a = ezxbepiprk3;
            double ojiqvlh2a = ojiqvlh2;
            long vagealjq1a = vagealjq1;
            float vpekopgbmg0a = vpekopgbmg0;
            new StringBuffer("qOPpIxNC" + vagealjq1a + ojiqvlh2a + kiieilcx4a + ezxbepiprk3a + vpekopgbmg0a + "qOPpIxNC" + "" + "");
        }

        //垃圾方法
        private void fhhJrIkg(char rojttiyi0, char pdhjhca1, double tjysmedk2) {
            double tjysmedk2a = tjysmedk2;
            char pdhjhca1a = pdhjhca1;
            char rojttiyi0a = rojttiyi0;
            new StringBuffer("fhhJrIkg" + tjysmedk2a + rojttiyi0a + pdhjhca1a + "fhhJrIkg" + "" + "");
        }

        //垃圾方法
        private void TcCuEAYZ(float dhdpkqgcm0, float qeaqnqlbaf1, short pjevjef2, char lsmnqnq3, long pmfvcco4) {
            long pmfvcco4a = pmfvcco4;
            char lsmnqnq3a = lsmnqnq3;
            short pjevjef2a = pjevjef2;
            float qeaqnqlbaf1a = qeaqnqlbaf1;
            float dhdpkqgcm0a = dhdpkqgcm0;
            new WeakReference("TcCuEAYZ" + lsmnqnq3a + dhdpkqgcm0a + pjevjef2a + qeaqnqlbaf1a + pmfvcco4a + "TcCuEAYZ" + "" + "");
        }

        //垃圾方法
        private void GhKeKRRR(int chxvhap0, short dbgujvtx1) {
            short dbgujvtx1a = dbgujvtx1;
            int chxvhap0a = chxvhap0;
        }

        //垃圾方法
        private void EtXkvahH(double hbgboauhcb0) {
            double hbgboauhcb0a = hbgboauhcb0;
            new StringReader("EtXkvahH" + hbgboauhcb0a + "EtXkvahH" + "" + "");
        }

        //垃圾方法
        private void XeKqNsuW(boolean ehylgxp0, long ugliodi1, double jjvrondwkt2, int sqtigom3, byte tvuuggj4) {
            byte tvuuggj4a = tvuuggj4;
            int sqtigom3a = sqtigom3;
            double jjvrondwkt2a = jjvrondwkt2;
            long ugliodi1a = ugliodi1;
            boolean ehylgxp0a = ehylgxp0;
            new Thread("XeKqNsuW" + tvuuggj4a + ehylgxp0a + sqtigom3a + jjvrondwkt2a + ugliodi1a + "XeKqNsuW" + "" + "");
        }

        //垃圾方法
        private void GLnAZvrr(byte tvulstd0, char lgjgrobz1, boolean wtxyyrugs2) {
            boolean wtxyyrugs2a = wtxyyrugs2;
            char lgjgrobz1a = lgjgrobz1;
            byte tvulstd0a = tvulstd0;
            Log.i("GLnAZvrr", "GLnAZvrr" + lgjgrobz1a + wtxyyrugs2a + tvulstd0a + "GLnAZvrr" + "" + "");
        }

        //垃圾方法
        private void DBdsYBPu(short digcknlwoc0, boolean dnxkmfbtcz1, long fqluptc2, boolean dsgisdach3) {
            boolean dsgisdach3a = dsgisdach3;
            long fqluptc2a = fqluptc2;
            boolean dnxkmfbtcz1a = dnxkmfbtcz1;
            short digcknlwoc0a = digcknlwoc0;
            new Thread("DBdsYBPu" + dnxkmfbtcz1a + digcknlwoc0a + dsgisdach3a + fqluptc2a + "DBdsYBPu" + "" + "");
        }

        //垃圾方法
        private void yMdZcihv(char aosuqmd0) {
            char aosuqmd0a = aosuqmd0;
            Log.i("yMdZcihv", "yMdZcihv" + aosuqmd0a + "yMdZcihv" + "" + "");
        }

        //垃圾方法
        private void kknyntqf(short yxdlfkpqt0, char zhgmmphgtf1) {
            char zhgmmphgtf1a = zhgmmphgtf1;
            short yxdlfkpqt0a = yxdlfkpqt0;
            Log.w("kknyntqf", "kknyntqf" + yxdlfkpqt0a + zhgmmphgtf1a + "kknyntqf" + "" + "");
        }

        //垃圾方法
        private void bZgnczNJ(long nyhwvwod0, double zsewzliaj1, byte noqqixlzbb2, float nurxdvpf3, byte vnewbona4) {
            byte vnewbona4a = vnewbona4;
            float nurxdvpf3a = nurxdvpf3;
            byte noqqixlzbb2a = noqqixlzbb2;
            double zsewzliaj1a = zsewzliaj1;
            long nyhwvwod0a = nyhwvwod0;
            new String("bZgnczNJ" + nurxdvpf3a + nyhwvwod0a + zsewzliaj1a + vnewbona4a + noqqixlzbb2a + "bZgnczNJ" + "" + "");
        }

        //垃圾方法
        private void dShvYgsm(long qmeeazjezx0, int klsauta1, char dzgphhp2, double qaqbdblm3, long omzrxivdwb4) {
            long omzrxivdwb4a = omzrxivdwb4;
            double qaqbdblm3a = qaqbdblm3;
            char dzgphhp2a = dzgphhp2;
            int klsauta1a = klsauta1;
            long qmeeazjezx0a = qmeeazjezx0;
            new WeakReference("dShvYgsm" + omzrxivdwb4a + qaqbdblm3a + dzgphhp2a + klsauta1a + qmeeazjezx0a + "dShvYgsm" + "" + "");
        }

        //垃圾方法
        private void qanZqFrz(short tqbfhhiygi0, float lboynyf1) {
            float lboynyf1a = lboynyf1;
            short tqbfhhiygi0a = tqbfhhiygi0;
            TextUtils.isEmpty("qanZqFrz" + tqbfhhiygi0a + lboynyf1a + "qanZqFrz" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            float lboynyf1 = 21.21f;
            short tqbfhhiygi0 = 53;
            long omzrxivdwb4 = 74L;
            double qaqbdblm3 = 50.50;
            char dzgphhp2 = 29;
            int klsauta1 = 77;
            long qmeeazjezx0 = 26L;
            byte vnewbona4 = 82;
            float nurxdvpf3 = 23.23f;
            byte noqqixlzbb2 = 15;
            double zsewzliaj1 = 76.76;
            long nyhwvwod0 = 14L;
            char zhgmmphgtf1 = 33;
            short yxdlfkpqt0 = 43;
            char aosuqmd0 = 9;
            boolean dsgisdach3 = false;
            long fqluptc2 = 31L;
            boolean dnxkmfbtcz1 = false;
            short digcknlwoc0 = 70;
            boolean wtxyyrugs2 = true;
            char lgjgrobz1 = 81;
            byte tvulstd0 = 8;
            byte tvuuggj4 = 42;
            int sqtigom3 = 65;
            double jjvrondwkt2 = 26.26;
            long ugliodi1 = 26L;
            boolean ehylgxp0 = true;
            double hbgboauhcb0 = 34.34;
            short dbgujvtx1 = 52;
            int chxvhap0 = 71;
            long pmfvcco4 = 7L;
            char lsmnqnq3 = 20;
            short pjevjef2 = 46;
            float qeaqnqlbaf1 = 87.87f;
            float dhdpkqgcm0 = 2.2f;
            double tjysmedk2 = 66.66;
            char pdhjhca1 = 67;
            char rojttiyi0 = 54;
            char kiieilcx4 = 59;
            float ezxbepiprk3 = 54.54f;
            double ojiqvlh2 = 15.15;
            long vagealjq1 = 10L;
            float vpekopgbmg0 = 46.46f;
            int ehgzortpce0 = 14;
            double issmbjn1 = 91.91;
            int qdinluisha0 = 81;
            int uebuwimqo2 = 35;
            byte wfjdwfd1 = 52;
            int hdioszjkd0 = 80;
            if (GatorManager.isDebug) {
                Log.e(Gator1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            subBinder = null;
            Gator1Service.isReTryBinding = true;
            GLnAZvrr(tvulstd0, lgjgrobz1, wtxyyrugs2);
            yMdZcihv(aosuqmd0);
            IaRalMJi(qdinluisha0, issmbjn1);
            bZgnczNJ(nyhwvwod0, zsewzliaj1, noqqixlzbb2, nurxdvpf3, vnewbona4);
            startSubService(2, false);
        }

        //垃圾方法
        private void YsJWfVTt(int nyvzwwmb0, long hewuruvx1, int sclendmfx2) {
            int sclendmfx2a = sclendmfx2;
            long hewuruvx1a = hewuruvx1;
            int nyvzwwmb0a = nyvzwwmb0;
            new String("YsJWfVTt" + sclendmfx2a + nyvzwwmb0a + hewuruvx1a + "YsJWfVTt" + "" + "");
        }

        //垃圾方法
        private void htWARsbF(int xdqcfda0) {
            int xdqcfda0a = xdqcfda0;
            Log.e("htWARsbF", "htWARsbF" + xdqcfda0a + "htWARsbF" + "" + "");
        }

        //垃圾方法
        private void sKnpvMfT(double eyzlzktg0, byte etiknnv1) {
            byte etiknnv1a = etiknnv1;
            double eyzlzktg0a = eyzlzktg0;
        }

        //垃圾方法
        private void joeRSozy(short lbfscuse0, long wawwdic1, short xtdfyiaoce2) {
            short xtdfyiaoce2a = xtdfyiaoce2;
            long wawwdic1a = wawwdic1;
            short lbfscuse0a = lbfscuse0;
            TextUtils.isEmpty("joeRSozy" + xtdfyiaoce2a + wawwdic1a + lbfscuse0a + "joeRSozy" + "" + "");
        }

        //垃圾方法
        private void PnPbSPFs(double hpmtfcxb0) {
            double hpmtfcxb0a = hpmtfcxb0;
            new Intent("PnPbSPFs" + hpmtfcxb0a + "PnPbSPFs" + "" + "");
        }

        //垃圾方法
        private void GsbmPDXI(byte qczgmjdw0, short nuzykupon1, float xwhaoqz2, double uqtngcgkes3, short cdnlmea4) {
            short cdnlmea4a = cdnlmea4;
            double uqtngcgkes3a = uqtngcgkes3;
            float xwhaoqz2a = xwhaoqz2;
            short nuzykupon1a = nuzykupon1;
            byte qczgmjdw0a = qczgmjdw0;
            Log.w("GsbmPDXI", "GsbmPDXI" + nuzykupon1a + qczgmjdw0a + uqtngcgkes3a + cdnlmea4a + xwhaoqz2a + "GsbmPDXI" + "" + "");
        }

        //垃圾方法
        private void vUHjpOfJ(long piyzgdhlfj0, short xoogzscd1, long vdvpvbj2, long gtdhrev3, int inwqroca4) {
            int inwqroca4a = inwqroca4;
            long gtdhrev3a = gtdhrev3;
            long vdvpvbj2a = vdvpvbj2;
            short xoogzscd1a = xoogzscd1;
            long piyzgdhlfj0a = piyzgdhlfj0;
            TextUtils.isDigitsOnly("vUHjpOfJ" + xoogzscd1a + gtdhrev3a + inwqroca4a + piyzgdhlfj0a + vdvpvbj2a + "vUHjpOfJ" + "" + "");
        }

        //垃圾方法
        private void TOaaYMuL(float hwctusch0, boolean xdlozdiw1, float ktwywrtgj2) {
            float ktwywrtgj2a = ktwywrtgj2;
            boolean xdlozdiw1a = xdlozdiw1;
            float hwctusch0a = hwctusch0;
            new Intent("TOaaYMuL" + ktwywrtgj2a + hwctusch0a + xdlozdiw1a + "TOaaYMuL" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            float ktwywrtgj2 = 5.5f;
            boolean xdlozdiw1 = false;
            float hwctusch0 = 63.63f;
            int inwqroca4 = 7;
            long gtdhrev3 = 40L;
            long vdvpvbj2 = 78L;
            short xoogzscd1 = 25;
            long piyzgdhlfj0 = 42L;
            short cdnlmea4 = 97;
            double uqtngcgkes3 = 18.18;
            float xwhaoqz2 = 77.77f;
            short nuzykupon1 = 65;
            byte qczgmjdw0 = 73;
            double hpmtfcxb0 = 89.89;
            short xtdfyiaoce2 = 45;
            long wawwdic1 = 63L;
            short lbfscuse0 = 59;
            byte etiknnv1 = 94;
            double eyzlzktg0 = 27.27;
            int xdqcfda0 = 3;
            int sclendmfx2 = 68;
            long hewuruvx1 = 41L;
            int nyvzwwmb0 = 39;
            joeRSozy(lbfscuse0, wawwdic1, xtdfyiaoce2);
            htWARsbF(xdqcfda0);
            htWARsbF(xdqcfda0);
            joeRSozy(lbfscuse0, wawwdic1, xtdfyiaoce2);
            vUHjpOfJ(piyzgdhlfj0, xoogzscd1, vdvpvbj2, gtdhrev3, inwqroca4);
            vUHjpOfJ(piyzgdhlfj0, xoogzscd1, vdvpvbj2, gtdhrev3, inwqroca4);
            vUHjpOfJ(piyzgdhlfj0, xoogzscd1, vdvpvbj2, gtdhrev3, inwqroca4);
            YsJWfVTt(nyvzwwmb0, hewuruvx1, sclendmfx2);
            if (GatorManager.isDebug) {
                Log.e(Gator1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            joeRSozy(lbfscuse0, wawwdic1, xtdfyiaoce2);
            htWARsbF(xdqcfda0);
            GsbmPDXI(qczgmjdw0, nuzykupon1, xwhaoqz2, uqtngcgkes3, cdnlmea4);
            htWARsbF(xdqcfda0);
            GsbmPDXI(qczgmjdw0, nuzykupon1, xwhaoqz2, uqtngcgkes3, cdnlmea4);
            vUHjpOfJ(piyzgdhlfj0, xoogzscd1, vdvpvbj2, gtdhrev3, inwqroca4);
            GsbmPDXI(qczgmjdw0, nuzykupon1, xwhaoqz2, uqtngcgkes3, cdnlmea4);
            joeRSozy(lbfscuse0, wawwdic1, xtdfyiaoce2);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private int JwUdBAv = 90;

    //垃圾变量
    private short RnXlsyj = 95;

    //垃圾变量
    private byte HvgMaOm = 60;

    //垃圾变量
    private short iRJegjF = 33;

    //垃圾变量
    private long VXwKqYa = 88L;

    //垃圾变量
    private char lJZQhwH = 80;

    //垃圾变量
    private boolean mOUnidq = true;

    //垃圾变量
    private long DSkrzvM = 9L;

    //垃圾变量
    private double pOrKmYJ = 76.76;

    //垃圾变量
    private short aGWostu = 69;

    //垃圾方法
    private void YRzNXeYo(char dohdcwtt0, byte rvqpkty1, boolean yipugqj2) {
        boolean yipugqj2a = yipugqj2;
        byte rvqpkty1a = rvqpkty1;
        char dohdcwtt0a = dohdcwtt0;
        new Intent("YRzNXeYo" + yipugqj2a + dohdcwtt0a + rvqpkty1a + "YRzNXeYo" + HvgMaOm + QqbhKNL + osNgwJt + pOrKmYJ + dCwqzRU + mOUnidq + JwUdBAv + IMYcGDJ + xzwNnoL + VXwKqYa + PifTqjz + EFVBcUw + jKyxWve + dLuhrFC + UlMskSY + BmlIrCa + "");
    }

    //垃圾方法
    private void lkuOPLKe(boolean xllvkcn0, int wblnposcy1, int vlmxjmtmg2, float ojbeodqu3) {
        float ojbeodqu3a = ojbeodqu3;
        int vlmxjmtmg2a = vlmxjmtmg2;
        int wblnposcy1a = wblnposcy1;
        boolean xllvkcn0a = xllvkcn0;
        new File("lkuOPLKe" + ojbeodqu3a + wblnposcy1a + vlmxjmtmg2a + xllvkcn0a + "lkuOPLKe" + IMYcGDJ + dCwqzRU + jKyxWve + QqbhKNL + osNgwJt + JwUdBAv + VXwKqYa + pOrKmYJ + BmlIrCa + HvgMaOm + UlMskSY + PifTqjz + xzwNnoL + dLuhrFC + EFVBcUw + mOUnidq + "");
    }

    //垃圾方法
    private void MKrSqRlM(double wknnrhc0) {
        double wknnrhc0a = wknnrhc0;
        new WeakReference("MKrSqRlM" + wknnrhc0a + "MKrSqRlM" + BmlIrCa + mOUnidq + osNgwJt + IMYcGDJ + QqbhKNL + EFVBcUw + dCwqzRU + jKyxWve + PifTqjz + JwUdBAv + VXwKqYa + dLuhrFC + xzwNnoL + UlMskSY + HvgMaOm + pOrKmYJ + "");
    }

    //垃圾方法
    private void MSyFKdrr(int krpzkcuvvd0) {
        int krpzkcuvvd0a = krpzkcuvvd0;
        new Thread("MSyFKdrr" + krpzkcuvvd0a + "MSyFKdrr" + JwUdBAv + IMYcGDJ + jKyxWve + PifTqjz + xzwNnoL + VXwKqYa + EFVBcUw + mOUnidq + dCwqzRU + UlMskSY + QqbhKNL + HvgMaOm + BmlIrCa + dLuhrFC + osNgwJt + pOrKmYJ + "");
    }

    //垃圾方法
    private void vfKwwcam(byte kcnaevzj0, long suxddhln1) {
        long suxddhln1a = suxddhln1;
        byte kcnaevzj0a = kcnaevzj0;
        new StringReader("vfKwwcam" + suxddhln1a + kcnaevzj0a + "vfKwwcam" + xzwNnoL + EFVBcUw + UlMskSY + osNgwJt + VXwKqYa + HvgMaOm + PifTqjz + dCwqzRU + mOUnidq + BmlIrCa + QqbhKNL + dLuhrFC + IMYcGDJ + pOrKmYJ + jKyxWve + JwUdBAv + "");
    }

    //垃圾方法
    private void SbVmImtu(short awdwlbabua0, char exlacbya1) {
        char exlacbya1a = exlacbya1;
        short awdwlbabua0a = awdwlbabua0;
        Log.w("SbVmImtu", "SbVmImtu" + exlacbya1a + awdwlbabua0a + "SbVmImtu" + QqbhKNL + BmlIrCa + JwUdBAv + EFVBcUw + xzwNnoL + dCwqzRU + mOUnidq + UlMskSY + osNgwJt + IMYcGDJ + dLuhrFC + VXwKqYa + pOrKmYJ + PifTqjz + jKyxWve + HvgMaOm + "");
    }

    //垃圾方法
    private void fUbjhVZU(boolean uinsbwae0) {
        boolean uinsbwae0a = uinsbwae0;
        new String("fUbjhVZU" + uinsbwae0a + "fUbjhVZU" + PifTqjz + mOUnidq + UlMskSY + pOrKmYJ + dCwqzRU + JwUdBAv + dLuhrFC + IMYcGDJ + xzwNnoL + VXwKqYa + osNgwJt + HvgMaOm + BmlIrCa + QqbhKNL + jKyxWve + EFVBcUw + "");
    }

    //垃圾方法
    private void lYzyhjOO(boolean hkkujzd0, byte ccqxwvye1, long gpzwzctv2, char taxfswiet3) {
        char taxfswiet3a = taxfswiet3;
        long gpzwzctv2a = gpzwzctv2;
        byte ccqxwvye1a = ccqxwvye1;
        boolean hkkujzd0a = hkkujzd0;
        TextUtils.isDigitsOnly("lYzyhjOO" + taxfswiet3a + gpzwzctv2a + hkkujzd0a + ccqxwvye1a + "lYzyhjOO" + BmlIrCa + JwUdBAv + dCwqzRU + IMYcGDJ + mOUnidq + UlMskSY + QqbhKNL + dLuhrFC + VXwKqYa + HvgMaOm + pOrKmYJ + osNgwJt + xzwNnoL + EFVBcUw + jKyxWve + PifTqjz + "");
    }

    public boolean equals(Object obj) {
        char taxfswiet3 = 61;
        long gpzwzctv2 = 32L;
        byte ccqxwvye1 = 7;
        boolean hkkujzd0 = true;
        boolean uinsbwae0 = false;
        char exlacbya1 = 13;
        short awdwlbabua0 = 71;
        long suxddhln1 = 2L;
        byte kcnaevzj0 = 80;
        int krpzkcuvvd0 = 85;
        double wknnrhc0 = 45.45;
        float ojbeodqu3 = 20.20f;
        int vlmxjmtmg2 = 0;
        int wblnposcy1 = 86;
        boolean xllvkcn0 = false;
        boolean yipugqj2 = false;
        byte rvqpkty1 = 68;
        char dohdcwtt0 = 39;
        MSyFKdrr(krpzkcuvvd0);
        MSyFKdrr(krpzkcuvvd0);
        vfKwwcam(kcnaevzj0, suxddhln1);
        Log.w("RnXlsyj", "" + DSkrzvM + aGWostu + iRJegjF + lJZQhwH + RnXlsyj + "");
        fUbjhVZU(uinsbwae0);
        fUbjhVZU(uinsbwae0);
        YRzNXeYo(dohdcwtt0, rvqpkty1, yipugqj2);
        lYzyhjOO(hkkujzd0, ccqxwvye1, gpzwzctv2, taxfswiet3);
        MSyFKdrr(krpzkcuvvd0);
        vfKwwcam(kcnaevzj0, suxddhln1);
        MSyFKdrr(krpzkcuvvd0);
        return super.equals(obj);
    }
}
