package com.tfseptember.clemodel.opdj.nt;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.shownotificy.SimplyNtTransfer;
import java.util.Iterator;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

public class SimplyNtFgService extends Service {

    //垃圾变量
    private float frjvUhI = 20.20f;

    static boolean isLiving;

    //垃圾变量
    private float jgzuWoA = 97.97f;

    static boolean isShowing;

    //垃圾变量
    private double Lwfndou = 41.41;

    static String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private double CDLkKaQ = 44.44;

    static String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private byte suwZmUk = 37;

    static int Notification_ID1 = 9745125;

    public SimplyNtFgService() {
    }

    //垃圾方法
    static private void HNbBQPfR(long mvgqhvvotp0, double oqbdivh1) {
        double oqbdivh1a = oqbdivh1;
        long mvgqhvvotp0a = mvgqhvvotp0;
        Log.i("HNbBQPfR", "HNbBQPfR" + mvgqhvvotp0a + oqbdivh1a + "HNbBQPfR" + "");
    }

    //垃圾方法
    static private void wFdPVelp(byte hrgavlazh0, float gkkhktz1, double lmggjzwbua2, char agwawdbp3) {
        char agwawdbp3a = agwawdbp3;
        double lmggjzwbua2a = lmggjzwbua2;
        float gkkhktz1a = gkkhktz1;
        byte hrgavlazh0a = hrgavlazh0;
        new AttributedString("wFdPVelp" + lmggjzwbua2a + agwawdbp3a + gkkhktz1a + hrgavlazh0a + "wFdPVelp" + "");
    }

    //垃圾方法
    static private void DJrwGPuc(long pxxepqzn0, boolean rnwaasn1, boolean sauypddfrr2, float ntxkmkkmef3) {
        float ntxkmkkmef3a = ntxkmkkmef3;
        boolean sauypddfrr2a = sauypddfrr2;
        boolean rnwaasn1a = rnwaasn1;
        long pxxepqzn0a = pxxepqzn0;
        new Thread("DJrwGPuc" + sauypddfrr2a + pxxepqzn0a + rnwaasn1a + ntxkmkkmef3a + "DJrwGPuc" + "");
    }

    //垃圾方法
    static private void lJNBcknr(int xnyoevzd0, short glasqwhdeo1) {
        short glasqwhdeo1a = glasqwhdeo1;
        int xnyoevzd0a = xnyoevzd0;
        System.out.println("lJNBcknr" + xnyoevzd0a + glasqwhdeo1a + "lJNBcknr" + "");
    }

    public static boolean getIsShowing() {
        short glasqwhdeo1 = 84;
        int xnyoevzd0 = 58;
        float ntxkmkkmef3 = 8.8f;
        boolean sauypddfrr2 = false;
        boolean rnwaasn1 = true;
        long pxxepqzn0 = 39L;
        char agwawdbp3 = 3;
        double lmggjzwbua2 = 1.1;
        float gkkhktz1 = 59.59f;
        byte hrgavlazh0 = 24;
        double oqbdivh1 = 55.55;
        long mvgqhvvotp0 = 97L;
        DJrwGPuc(pxxepqzn0, rnwaasn1, sauypddfrr2, ntxkmkkmef3);
        HNbBQPfR(mvgqhvvotp0, oqbdivh1);
        HNbBQPfR(mvgqhvvotp0, oqbdivh1);
        DJrwGPuc(pxxepqzn0, rnwaasn1, sauypddfrr2, ntxkmkkmef3);
        HNbBQPfR(mvgqhvvotp0, oqbdivh1);
        wFdPVelp(hrgavlazh0, gkkhktz1, lmggjzwbua2, agwawdbp3);
        HNbBQPfR(mvgqhvvotp0, oqbdivh1);
        lJNBcknr(xnyoevzd0, glasqwhdeo1);
        lJNBcknr(xnyoevzd0, glasqwhdeo1);
        DJrwGPuc(pxxepqzn0, rnwaasn1, sauypddfrr2, ntxkmkkmef3);
        return isShowing;
    }

    //垃圾方法
    static private void cmoBGJpi(char ujijbyuj0) {
        char ujijbyuj0a = ujijbyuj0;
        new String("cmoBGJpi" + ujijbyuj0a + "cmoBGJpi" + "");
    }

    //垃圾方法
    static private void kmTxunrp(char punhsakc0) {
        char punhsakc0a = punhsakc0;
        new StringBuffer("kmTxunrp" + punhsakc0a + "kmTxunrp" + "");
    }

    //垃圾方法
    static private void IuiBLZgH(float kjwbhpa0, float qsudzqjxy1) {
        float qsudzqjxy1a = qsudzqjxy1;
        float kjwbhpa0a = kjwbhpa0;
        Log.e("IuiBLZgH", "IuiBLZgH" + kjwbhpa0a + qsudzqjxy1a + "IuiBLZgH" + "");
    }

    //垃圾方法
    static private void WwyrjKzi(char busaiszkx0, boolean tkpybdjbcn1, short iabchgo2, boolean kavjzsxz3) {
        boolean kavjzsxz3a = kavjzsxz3;
        short iabchgo2a = iabchgo2;
        boolean tkpybdjbcn1a = tkpybdjbcn1;
        char busaiszkx0a = busaiszkx0;
        Log.w("WwyrjKzi", "WwyrjKzi" + busaiszkx0a + iabchgo2a + kavjzsxz3a + tkpybdjbcn1a + "WwyrjKzi" + "");
    }

    public static void startNotifyService(boolean isFromActivity) {
        boolean kavjzsxz3 = true;
        short iabchgo2 = 95;
        boolean tkpybdjbcn1 = false;
        char busaiszkx0 = 86;
        float qsudzqjxy1 = 4.4f;
        float kjwbhpa0 = 77.77f;
        char punhsakc0 = 99;
        char ujijbyuj0 = 57;
        try {
            kmTxunrp(punhsakc0);
            kmTxunrp(punhsakc0);
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            cmoBGJpi(ujijbyuj0);
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            cmoBGJpi(ujijbyuj0);
            cmoBGJpi(ujijbyuj0);
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            Context context = SimplyHouseworkrOrgManager.mContext;
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            cmoBGJpi(ujijbyuj0);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            cmoBGJpi(ujijbyuj0);
            cmoBGJpi(ujijbyuj0);
            Intent intent = new Intent(context, SimplyNtFgService.class);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            cmoBGJpi(ujijbyuj0);
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            kmTxunrp(punhsakc0);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            intent.setPackage(context.getPackageName());
            IuiBLZgH(kjwbhpa0, qsudzqjxy1);
            kmTxunrp(punhsakc0);
            cmoBGJpi(ujijbyuj0);
            WwyrjKzi(busaiszkx0, tkpybdjbcn1, iabchgo2, kavjzsxz3);
            if (VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception var19) {
            Exception e = var19;
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void GIgWhOBC(byte ahnnrnwxbo0, boolean yphyofuvmw1, byte sxoesgnfp2) {
        byte sxoesgnfp2a = sxoesgnfp2;
        boolean yphyofuvmw1a = yphyofuvmw1;
        byte ahnnrnwxbo0a = ahnnrnwxbo0;
        TextUtils.isDigitsOnly("GIgWhOBC" + sxoesgnfp2a + yphyofuvmw1a + ahnnrnwxbo0a + "GIgWhOBC" + KAXOmYM + Lwfndou + jgzuWoA + oYZQyWx + CDLkKaQ + suwZmUk + frjvUhI + "");
    }

    //垃圾方法
    private void VrGOfAue(char vmnsacxij0, boolean yqzlvtg1, char snqbqnv2) {
        char snqbqnv2a = snqbqnv2;
        boolean yqzlvtg1a = yqzlvtg1;
        char vmnsacxij0a = vmnsacxij0;
        new File("VrGOfAue" + snqbqnv2a + yqzlvtg1a + vmnsacxij0a + "VrGOfAue" + suwZmUk + KAXOmYM + jgzuWoA + CDLkKaQ + Lwfndou + frjvUhI + oYZQyWx + "");
    }

    //垃圾方法
    private void BAhaALBt(boolean fzpjaud0, short jvyayvsq1, long ssevramhcj2, float dnbwrepjj3, short cbnxsjd4) {
        short cbnxsjd4a = cbnxsjd4;
        float dnbwrepjj3a = dnbwrepjj3;
        long ssevramhcj2a = ssevramhcj2;
        short jvyayvsq1a = jvyayvsq1;
        boolean fzpjaud0a = fzpjaud0;
        new AttributedString("BAhaALBt" + ssevramhcj2a + cbnxsjd4a + dnbwrepjj3a + jvyayvsq1a + fzpjaud0a + "BAhaALBt" + suwZmUk + frjvUhI + jgzuWoA + oYZQyWx + CDLkKaQ + Lwfndou + KAXOmYM + "");
    }

    //垃圾方法
    private void dnHZyLny(int rmdpdbmtf0, short ddmgdxm1, float zdcgtggkt2) {
        float zdcgtggkt2a = zdcgtggkt2;
        short ddmgdxm1a = ddmgdxm1;
        int rmdpdbmtf0a = rmdpdbmtf0;
        new StringBuilder("dnHZyLny" + ddmgdxm1a + rmdpdbmtf0a + zdcgtggkt2a + "dnHZyLny" + suwZmUk + oYZQyWx + frjvUhI + KAXOmYM + CDLkKaQ + Lwfndou + jgzuWoA + "");
    }

    //垃圾方法
    private void YDdGoreQ(double irpqftvaca0, char hperibe1, short iiztzogyd2) {
        short iiztzogyd2a = iiztzogyd2;
        char hperibe1a = hperibe1;
        double irpqftvaca0a = irpqftvaca0;
        new Thread("YDdGoreQ" + irpqftvaca0a + hperibe1a + iiztzogyd2a + "YDdGoreQ" + suwZmUk + KAXOmYM + frjvUhI + Lwfndou + jgzuWoA + oYZQyWx + CDLkKaQ + "");
    }

    //垃圾方法
    private void rXSfDAIn(boolean qslwymy0, double zfsutcncee1, int jpiusllzfj2, byte kcemrwgyev3) {
        byte kcemrwgyev3a = kcemrwgyev3;
        int jpiusllzfj2a = jpiusllzfj2;
        double zfsutcncee1a = zfsutcncee1;
        boolean qslwymy0a = qslwymy0;
        Log.e("rXSfDAIn", "rXSfDAIn" + kcemrwgyev3a + jpiusllzfj2a + qslwymy0a + zfsutcncee1a + "rXSfDAIn" + jgzuWoA + frjvUhI + CDLkKaQ + KAXOmYM + oYZQyWx + suwZmUk + Lwfndou + "");
    }

    //垃圾方法
    private void QbjlMltq(char xciianrn0, long sqsvmwza1) {
        long sqsvmwza1a = sqsvmwza1;
        char xciianrn0a = xciianrn0;
        new AttributedString("QbjlMltq" + xciianrn0a + sqsvmwza1a + "QbjlMltq" + frjvUhI + suwZmUk + jgzuWoA + CDLkKaQ + Lwfndou + oYZQyWx + KAXOmYM + "");
    }

    //垃圾方法
    private void FUKHBxou(short gomsgup0, long vdkbudj1, float brrhzqknzp2, long gnihkzy3, int ndksfelpct4) {
        int ndksfelpct4a = ndksfelpct4;
        long gnihkzy3a = gnihkzy3;
        float brrhzqknzp2a = brrhzqknzp2;
        long vdkbudj1a = vdkbudj1;
        short gomsgup0a = gomsgup0;
        Log.e("FUKHBxou", "FUKHBxou" + gomsgup0a + brrhzqknzp2a + ndksfelpct4a + gnihkzy3a + vdkbudj1a + "FUKHBxou" + jgzuWoA + oYZQyWx + suwZmUk + CDLkKaQ + Lwfndou + KAXOmYM + frjvUhI + "");
    }

    //垃圾方法
    private void WkNPZESj(int gjouykk0, long hgqpazeck1, boolean suzqubnxeo2) {
        boolean suzqubnxeo2a = suzqubnxeo2;
        long hgqpazeck1a = hgqpazeck1;
        int gjouykk0a = gjouykk0;
        TextUtils.isDigitsOnly("WkNPZESj" + gjouykk0a + hgqpazeck1a + suzqubnxeo2a + "WkNPZESj" + oYZQyWx + frjvUhI + suwZmUk + Lwfndou + KAXOmYM + CDLkKaQ + jgzuWoA + "");
    }

    //垃圾方法
    private void MdWtyzXJ(float hfsdchzhfk0) {
        float hfsdchzhfk0a = hfsdchzhfk0;
        Log.w("MdWtyzXJ", "MdWtyzXJ" + hfsdchzhfk0a + "MdWtyzXJ" + jgzuWoA + suwZmUk + Lwfndou + frjvUhI + KAXOmYM + oYZQyWx + CDLkKaQ + "");
    }

    //垃圾方法
    private void gkkgeNoI(short maczovkir0) {
        short maczovkir0a = maczovkir0;
        new StringReader("gkkgeNoI" + maczovkir0a + "gkkgeNoI" + jgzuWoA + suwZmUk + oYZQyWx + CDLkKaQ + Lwfndou + frjvUhI + KAXOmYM + "");
    }

    //垃圾方法
    private void ucFjUDAT(byte ujcxxnl0, char xekmyzzher1) {
        char xekmyzzher1a = xekmyzzher1;
        byte ujcxxnl0a = ujcxxnl0;
    }

    //垃圾方法
    private void iudHTVQP(int yoztzvy0) {
        int yoztzvy0a = yoztzvy0;
        TextUtils.isDigitsOnly("iudHTVQP" + yoztzvy0a + "iudHTVQP" + frjvUhI + KAXOmYM + jgzuWoA + suwZmUk + CDLkKaQ + oYZQyWx + Lwfndou + "");
    }

    //垃圾方法
    private void jePDhtJT(char deeajmmyl0) {
        char deeajmmyl0a = deeajmmyl0;
        Log.w("jePDhtJT", "jePDhtJT" + deeajmmyl0a + "jePDhtJT" + suwZmUk + oYZQyWx + jgzuWoA + Lwfndou + KAXOmYM + frjvUhI + CDLkKaQ + "");
    }

    //垃圾方法
    private void gOELXraY(char yumckali0) {
        char yumckali0a = yumckali0;
        Log.e("gOELXraY", "gOELXraY" + yumckali0a + "gOELXraY" + Lwfndou + KAXOmYM + CDLkKaQ + suwZmUk + frjvUhI + jgzuWoA + oYZQyWx + "");
    }

    //垃圾方法
    private void LROCowuz(short sxubnlidxx0, byte uklovlvve1, double qlwvautk2, int hfcukvlds3) {
        int hfcukvlds3a = hfcukvlds3;
        double qlwvautk2a = qlwvautk2;
        byte uklovlvve1a = uklovlvve1;
        short sxubnlidxx0a = sxubnlidxx0;
        new StringBuilder("LROCowuz" + sxubnlidxx0a + qlwvautk2a + hfcukvlds3a + uklovlvve1a + "LROCowuz" + oYZQyWx + Lwfndou + CDLkKaQ + KAXOmYM + frjvUhI + suwZmUk + jgzuWoA + "");
    }

    //垃圾方法
    private void VlOyyIWf(byte ndkefhppj0, long afawtkt1) {
        long afawtkt1a = afawtkt1;
        byte ndkefhppj0a = ndkefhppj0;
        TextUtils.isDigitsOnly("VlOyyIWf" + ndkefhppj0a + afawtkt1a + "VlOyyIWf" + oYZQyWx + suwZmUk + jgzuWoA + CDLkKaQ + Lwfndou + KAXOmYM + frjvUhI + "");
    }

    //垃圾方法
    private void sGPigGGz(boolean anxmbvavh0, long wkxsjbuma1, double qpqsicvfm2, short avoexuq3, char lcretbi4) {
        char lcretbi4a = lcretbi4;
        short avoexuq3a = avoexuq3;
        double qpqsicvfm2a = qpqsicvfm2;
        long wkxsjbuma1a = wkxsjbuma1;
        boolean anxmbvavh0a = anxmbvavh0;
        Log.w("sGPigGGz", "sGPigGGz" + anxmbvavh0a + wkxsjbuma1a + qpqsicvfm2a + lcretbi4a + avoexuq3a + "sGPigGGz" + oYZQyWx + suwZmUk + frjvUhI + Lwfndou + CDLkKaQ + KAXOmYM + jgzuWoA + "");
    }

    //垃圾方法
    private void GfeleAbR(float hgwgezni0, byte chymgdbw1, char bihjqcmll2, boolean acywdpkqhh3) {
        boolean acywdpkqhh3a = acywdpkqhh3;
        char bihjqcmll2a = bihjqcmll2;
        byte chymgdbw1a = chymgdbw1;
        float hgwgezni0a = hgwgezni0;
        new StringBuffer("GfeleAbR" + chymgdbw1a + acywdpkqhh3a + hgwgezni0a + bihjqcmll2a + "GfeleAbR" + Lwfndou + frjvUhI + oYZQyWx + KAXOmYM + suwZmUk + jgzuWoA + CDLkKaQ + "");
    }

    //垃圾方法
    private void WzWplnCO(long jxjuggy0, char tiprcmzzae1, double sxhnjfxst2, char dhekkad3) {
        char dhekkad3a = dhekkad3;
        double sxhnjfxst2a = sxhnjfxst2;
        char tiprcmzzae1a = tiprcmzzae1;
        long jxjuggy0a = jxjuggy0;
        new AttributedString("WzWplnCO" + sxhnjfxst2a + dhekkad3a + tiprcmzzae1a + jxjuggy0a + "WzWplnCO" + oYZQyWx + CDLkKaQ + frjvUhI + jgzuWoA + Lwfndou + KAXOmYM + suwZmUk + "");
    }

    public void onCreate() {
        char dhekkad3 = 94;
        double sxhnjfxst2 = 48.48;
        char tiprcmzzae1 = 86;
        long jxjuggy0 = 51L;
        boolean acywdpkqhh3 = true;
        char bihjqcmll2 = 31;
        byte chymgdbw1 = 14;
        float hgwgezni0 = 13.13f;
        char lcretbi4 = 73;
        short avoexuq3 = 49;
        double qpqsicvfm2 = 46.46;
        long wkxsjbuma1 = 37L;
        boolean anxmbvavh0 = false;
        long afawtkt1 = 57L;
        byte ndkefhppj0 = 61;
        int hfcukvlds3 = 52;
        double qlwvautk2 = 89.89;
        byte uklovlvve1 = 47;
        short sxubnlidxx0 = 38;
        char yumckali0 = 9;
        char deeajmmyl0 = 6;
        int yoztzvy0 = 98;
        char xekmyzzher1 = 15;
        byte ujcxxnl0 = 80;
        short maczovkir0 = 90;
        float hfsdchzhfk0 = 30.30f;
        boolean suzqubnxeo2 = false;
        long hgqpazeck1 = 60L;
        int gjouykk0 = 29;
        int ndksfelpct4 = 16;
        long gnihkzy3 = 54L;
        float brrhzqknzp2 = 78.78f;
        long vdkbudj1 = 13L;
        short gomsgup0 = 12;
        long sqsvmwza1 = 94L;
        char xciianrn0 = 66;
        byte kcemrwgyev3 = 40;
        int jpiusllzfj2 = 51;
        double zfsutcncee1 = 25.25;
        boolean qslwymy0 = false;
        short iiztzogyd2 = 2;
        char hperibe1 = 40;
        double irpqftvaca0 = 43.43;
        float zdcgtggkt2 = 30.30f;
        short ddmgdxm1 = 81;
        int rmdpdbmtf0 = 70;
        short cbnxsjd4 = 15;
        float dnbwrepjj3 = 8.8f;
        long ssevramhcj2 = 41L;
        short jvyayvsq1 = 94;
        boolean fzpjaud0 = true;
        char snqbqnv2 = 2;
        boolean yqzlvtg1 = false;
        char vmnsacxij0 = 89;
        byte sxoesgnfp2 = 42;
        boolean yphyofuvmw1 = true;
        byte ahnnrnwxbo0 = 25;
        VrGOfAue(vmnsacxij0, yqzlvtg1, snqbqnv2);
        WzWplnCO(jxjuggy0, tiprcmzzae1, sxhnjfxst2, dhekkad3);
        FUKHBxou(gomsgup0, vdkbudj1, brrhzqknzp2, gnihkzy3, ndksfelpct4);
        dnHZyLny(rmdpdbmtf0, ddmgdxm1, zdcgtggkt2);
        rXSfDAIn(qslwymy0, zfsutcncee1, jpiusllzfj2, kcemrwgyev3);
        jePDhtJT(deeajmmyl0);
        BAhaALBt(fzpjaud0, jvyayvsq1, ssevramhcj2, dnbwrepjj3, cbnxsjd4);
        VrGOfAue(vmnsacxij0, yqzlvtg1, snqbqnv2);
        QbjlMltq(xciianrn0, sqsvmwza1);
        MdWtyzXJ(hfsdchzhfk0);
        isLiving = true;
        isShowing = false;
        super.onCreate();
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        BAhaALBt(fzpjaud0, jvyayvsq1, ssevramhcj2, dnbwrepjj3, cbnxsjd4);
        MdWtyzXJ(hfsdchzhfk0);
        BAhaALBt(fzpjaud0, jvyayvsq1, ssevramhcj2, dnbwrepjj3, cbnxsjd4);
        WzWplnCO(jxjuggy0, tiprcmzzae1, sxhnjfxst2, dhekkad3);
        MdWtyzXJ(hfsdchzhfk0);
        WzWplnCO(jxjuggy0, tiprcmzzae1, sxhnjfxst2, dhekkad3);
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }
            isShowing = true;
            if (!SimplyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var83) {
            Exception e = var83;
            isShowing = false;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground error,e=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void IvWEVHUh(long cqevvty0, long jwjzmoem1, int xsiczqroh2, byte zectwgtv3, int fmvanrzi4) {
        int fmvanrzi4a = fmvanrzi4;
        byte zectwgtv3a = zectwgtv3;
        int xsiczqroh2a = xsiczqroh2;
        long jwjzmoem1a = jwjzmoem1;
        long cqevvty0a = cqevvty0;
        new String("IvWEVHUh" + xsiczqroh2a + cqevvty0a + fmvanrzi4a + zectwgtv3a + jwjzmoem1a + "IvWEVHUh" + Lwfndou + CDLkKaQ + frjvUhI + oYZQyWx + jgzuWoA + KAXOmYM + suwZmUk + "");
    }

    //垃圾方法
    private void OFIrVWUw(long fvyitig0, byte mixdjwmw1) {
        byte mixdjwmw1a = mixdjwmw1;
        long fvyitig0a = fvyitig0;
        new StringBuilder("OFIrVWUw" + mixdjwmw1a + fvyitig0a + "OFIrVWUw" + frjvUhI + jgzuWoA + KAXOmYM + suwZmUk + CDLkKaQ + Lwfndou + oYZQyWx + "");
    }

    //垃圾方法
    private void YgSllAnc(double dxrdmlhuys0, byte bgpdmyb1, long garfvlyp2) {
        long garfvlyp2a = garfvlyp2;
        byte bgpdmyb1a = bgpdmyb1;
        double dxrdmlhuys0a = dxrdmlhuys0;
        Log.w("YgSllAnc", "YgSllAnc" + dxrdmlhuys0a + bgpdmyb1a + garfvlyp2a + "YgSllAnc" + oYZQyWx + jgzuWoA + CDLkKaQ + frjvUhI + KAXOmYM + Lwfndou + suwZmUk + "");
    }

    //垃圾方法
    private void fhatGXlQ(byte kzrswoush0, double vvcoxynvh1, boolean yhqjrwfor2, float vgvulgjws3) {
        float vgvulgjws3a = vgvulgjws3;
        boolean yhqjrwfor2a = yhqjrwfor2;
        double vvcoxynvh1a = vvcoxynvh1;
        byte kzrswoush0a = kzrswoush0;
        TextUtils.isDigitsOnly("fhatGXlQ" + kzrswoush0a + yhqjrwfor2a + vvcoxynvh1a + vgvulgjws3a + "fhatGXlQ" + CDLkKaQ + Lwfndou + frjvUhI + oYZQyWx + suwZmUk + KAXOmYM + jgzuWoA + "");
    }

    //垃圾方法
    private void vwOrLjtC(int topbgllffs0, char tgupfxsph1, char xqtfiipd2, long cuwpnpcwbi3) {
        long cuwpnpcwbi3a = cuwpnpcwbi3;
        char xqtfiipd2a = xqtfiipd2;
        char tgupfxsph1a = tgupfxsph1;
        int topbgllffs0a = topbgllffs0;
        TextUtils.isEmpty("vwOrLjtC" + topbgllffs0a + tgupfxsph1a + cuwpnpcwbi3a + xqtfiipd2a + "vwOrLjtC" + suwZmUk + CDLkKaQ + jgzuWoA + KAXOmYM + Lwfndou + oYZQyWx + frjvUhI + "");
    }

    //垃圾方法
    private void HxCxMBGW(char ygnmvlmbt0, short uopomup1, byte tqtdwqep2, float yvvsjswb3) {
        float yvvsjswb3a = yvvsjswb3;
        byte tqtdwqep2a = tqtdwqep2;
        short uopomup1a = uopomup1;
        char ygnmvlmbt0a = ygnmvlmbt0;
        TextUtils.isDigitsOnly("HxCxMBGW" + tqtdwqep2a + uopomup1a + yvvsjswb3a + ygnmvlmbt0a + "HxCxMBGW" + frjvUhI + oYZQyWx + Lwfndou + jgzuWoA + suwZmUk + KAXOmYM + CDLkKaQ + "");
    }

    //垃圾方法
    private void xhKplYVa(int apvcddju0) {
        int apvcddju0a = apvcddju0;
        new StringBuffer("xhKplYVa" + apvcddju0a + "xhKplYVa" + KAXOmYM + suwZmUk + frjvUhI + jgzuWoA + Lwfndou + oYZQyWx + CDLkKaQ + "");
    }

    //垃圾方法
    private void BqaxJTvW(byte eluwnzwunp0, long etflglqfap1, long xszknuycgb2, int ifeuliio3) {
        int ifeuliio3a = ifeuliio3;
        long xszknuycgb2a = xszknuycgb2;
        long etflglqfap1a = etflglqfap1;
        byte eluwnzwunp0a = eluwnzwunp0;
        new StringBuilder("BqaxJTvW" + etflglqfap1a + ifeuliio3a + xszknuycgb2a + eluwnzwunp0a + "BqaxJTvW" + suwZmUk + Lwfndou + frjvUhI + KAXOmYM + CDLkKaQ + oYZQyWx + jgzuWoA + "");
    }

    //垃圾方法
    private void wZERGNoI(short dzhdfrv0, short zeifbjc1) {
        short zeifbjc1a = zeifbjc1;
        short dzhdfrv0a = dzhdfrv0;
        new StringBuffer("wZERGNoI" + zeifbjc1a + dzhdfrv0a + "wZERGNoI" + KAXOmYM + jgzuWoA + suwZmUk + oYZQyWx + frjvUhI + CDLkKaQ + Lwfndou + "");
    }

    //垃圾方法
    private void mALBPgeF(char iohtdpw0, boolean louoxeo1, int plywvmjta2) {
        int plywvmjta2a = plywvmjta2;
        boolean louoxeo1a = louoxeo1;
        char iohtdpw0a = iohtdpw0;
    }

    //垃圾方法
    private void IzIlMEIy(float qukxrmng0, long fsqymklln1) {
        long fsqymklln1a = fsqymklln1;
        float qukxrmng0a = qukxrmng0;
        new StringReader("IzIlMEIy" + fsqymklln1a + qukxrmng0a + "IzIlMEIy" + CDLkKaQ + oYZQyWx + jgzuWoA + frjvUhI + KAXOmYM + suwZmUk + Lwfndou + "");
    }

    //垃圾方法
    private void uSoecUFb(long zcyeqxnaa0, boolean xfhamkvoxt1, char awacgogl2, long gyydkvm3, short hyqtyrxgyg4) {
        short hyqtyrxgyg4a = hyqtyrxgyg4;
        long gyydkvm3a = gyydkvm3;
        char awacgogl2a = awacgogl2;
        boolean xfhamkvoxt1a = xfhamkvoxt1;
        long zcyeqxnaa0a = zcyeqxnaa0;
        new StringReader("uSoecUFb" + awacgogl2a + zcyeqxnaa0a + hyqtyrxgyg4a + gyydkvm3a + xfhamkvoxt1a + "uSoecUFb" + suwZmUk + oYZQyWx + CDLkKaQ + KAXOmYM + Lwfndou + frjvUhI + jgzuWoA + "");
    }

    //垃圾方法
    private void VWgYsbtA(float ilgojupi0) {
        float ilgojupi0a = ilgojupi0;
        new Intent("VWgYsbtA" + ilgojupi0a + "VWgYsbtA" + frjvUhI + oYZQyWx + KAXOmYM + Lwfndou + CDLkKaQ + jgzuWoA + suwZmUk + "");
    }

    //垃圾方法
    private void pNsvySgL(char qxdbpmlt0) {
        char qxdbpmlt0a = qxdbpmlt0;
        new StringBuilder("pNsvySgL" + qxdbpmlt0a + "pNsvySgL" + frjvUhI + suwZmUk + CDLkKaQ + jgzuWoA + KAXOmYM + Lwfndou + oYZQyWx + "");
    }

    //垃圾方法
    private void cEWmESiU(int zuhutsk0) {
        int zuhutsk0a = zuhutsk0;
        Log.e("cEWmESiU", "cEWmESiU" + zuhutsk0a + "cEWmESiU" + jgzuWoA + suwZmUk + frjvUhI + oYZQyWx + CDLkKaQ + Lwfndou + KAXOmYM + "");
    }

    //垃圾方法
    private void SiiqMcXo(int obfohktms0, byte wwtmzwtsd1, double fanlftna2) {
        double fanlftna2a = fanlftna2;
        byte wwtmzwtsd1a = wwtmzwtsd1;
        int obfohktms0a = obfohktms0;
        TextUtils.isDigitsOnly("SiiqMcXo" + wwtmzwtsd1a + obfohktms0a + fanlftna2a + "SiiqMcXo" + oYZQyWx + jgzuWoA + frjvUhI + suwZmUk + Lwfndou + CDLkKaQ + KAXOmYM + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        double fanlftna2 = 60.60;
        byte wwtmzwtsd1 = 57;
        int obfohktms0 = 33;
        int zuhutsk0 = 39;
        char qxdbpmlt0 = 58;
        float ilgojupi0 = 7.7f;
        short hyqtyrxgyg4 = 73;
        long gyydkvm3 = 29L;
        char awacgogl2 = 59;
        boolean xfhamkvoxt1 = true;
        long zcyeqxnaa0 = 94L;
        long fsqymklln1 = 76L;
        float qukxrmng0 = 48.48f;
        int plywvmjta2 = 91;
        boolean louoxeo1 = true;
        char iohtdpw0 = 94;
        short zeifbjc1 = 16;
        short dzhdfrv0 = 37;
        int ifeuliio3 = 29;
        long xszknuycgb2 = 28L;
        long etflglqfap1 = 76L;
        byte eluwnzwunp0 = 11;
        int apvcddju0 = 66;
        float yvvsjswb3 = 7.7f;
        byte tqtdwqep2 = 62;
        short uopomup1 = 12;
        char ygnmvlmbt0 = 90;
        long cuwpnpcwbi3 = 33L;
        char xqtfiipd2 = 34;
        char tgupfxsph1 = 40;
        int topbgllffs0 = 56;
        float vgvulgjws3 = 24.24f;
        boolean yhqjrwfor2 = true;
        double vvcoxynvh1 = 24.24;
        byte kzrswoush0 = 75;
        long garfvlyp2 = 93L;
        byte bgpdmyb1 = 1;
        double dxrdmlhuys0 = 96.96;
        byte mixdjwmw1 = 87;
        long fvyitig0 = 12L;
        int fmvanrzi4 = 40;
        byte zectwgtv3 = 86;
        int xsiczqroh2 = 6;
        long jwjzmoem1 = 8L;
        long cqevvty0 = 9L;
        xhKplYVa(apvcddju0);
        IzIlMEIy(qukxrmng0, fsqymklln1);
        vwOrLjtC(topbgllffs0, tgupfxsph1, xqtfiipd2, cuwpnpcwbi3);
        vwOrLjtC(topbgllffs0, tgupfxsph1, xqtfiipd2, cuwpnpcwbi3);
        isLiving = true;
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            isShowing = true;
            if (!SimplyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var71) {
            isShowing = false;
        }
        SimplyNtTransfer.onTimeTickUpEvent();
        SiiqMcXo(obfohktms0, wwtmzwtsd1, fanlftna2);
        fhatGXlQ(kzrswoush0, vvcoxynvh1, yhqjrwfor2, vgvulgjws3);
        xhKplYVa(apvcddju0);
        uSoecUFb(zcyeqxnaa0, xfhamkvoxt1, awacgogl2, gyydkvm3, hyqtyrxgyg4);
        HxCxMBGW(ygnmvlmbt0, uopomup1, tqtdwqep2, yvvsjswb3);
        vwOrLjtC(topbgllffs0, tgupfxsph1, xqtfiipd2, cuwpnpcwbi3);
        vwOrLjtC(topbgllffs0, tgupfxsph1, xqtfiipd2, cuwpnpcwbi3);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void jxoTLCDr(char zvsojrber0, byte hlwskaha1) {
        byte hlwskaha1a = hlwskaha1;
        char zvsojrber0a = zvsojrber0;
        new StringBuffer("jxoTLCDr" + zvsojrber0a + hlwskaha1a + "jxoTLCDr" + suwZmUk + oYZQyWx + KAXOmYM + jgzuWoA + frjvUhI + Lwfndou + CDLkKaQ + "");
    }

    //垃圾方法
    private void PaWfCraV(byte xqtkatzj0, int dlmwxrvo1, double ttacajd2, short hjjdjgsph3, short xgsikgu4) {
        short xgsikgu4a = xgsikgu4;
        short hjjdjgsph3a = hjjdjgsph3;
        double ttacajd2a = ttacajd2;
        int dlmwxrvo1a = dlmwxrvo1;
        byte xqtkatzj0a = xqtkatzj0;
        new WeakReference("PaWfCraV" + xgsikgu4a + hjjdjgsph3a + ttacajd2a + dlmwxrvo1a + xqtkatzj0a + "PaWfCraV" + frjvUhI + oYZQyWx + CDLkKaQ + KAXOmYM + suwZmUk + Lwfndou + jgzuWoA + "");
    }

    //垃圾方法
    private void bElpbuLJ(short tpohzso0, byte npbvcsvcfn1) {
        byte npbvcsvcfn1a = npbvcsvcfn1;
        short tpohzso0a = tpohzso0;
    }

    //垃圾方法
    private void IOyIEFax(int fpzljuboy0, long tjgsmjovw1, boolean cnjyanv2, boolean trsxtdyqyb3, char lzqcxbgdvo4) {
        char lzqcxbgdvo4a = lzqcxbgdvo4;
        boolean trsxtdyqyb3a = trsxtdyqyb3;
        boolean cnjyanv2a = cnjyanv2;
        long tjgsmjovw1a = tjgsmjovw1;
        int fpzljuboy0a = fpzljuboy0;
        new File("IOyIEFax" + trsxtdyqyb3a + lzqcxbgdvo4a + cnjyanv2a + tjgsmjovw1a + fpzljuboy0a + "IOyIEFax" + KAXOmYM + oYZQyWx + suwZmUk + Lwfndou + CDLkKaQ + frjvUhI + jgzuWoA + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        char lzqcxbgdvo4 = 24;
        boolean trsxtdyqyb3 = true;
        boolean cnjyanv2 = true;
        long tjgsmjovw1 = 13L;
        int fpzljuboy0 = 80;
        byte npbvcsvcfn1 = 5;
        short tpohzso0 = 91;
        short xgsikgu4 = 54;
        short hjjdjgsph3 = 94;
        double ttacajd2 = 49.49;
        int dlmwxrvo1 = 89;
        byte xqtkatzj0 = 79;
        byte hlwskaha1 = 20;
        char zvsojrber0 = 87;
        return null;
    }

    //垃圾方法
    private void iLQsFbyA(double xrnduoasy0, double icytsekrhs1, byte flbrocha2) {
        byte flbrocha2a = flbrocha2;
        double icytsekrhs1a = icytsekrhs1;
        double xrnduoasy0a = xrnduoasy0;
        Log.w("iLQsFbyA", "iLQsFbyA" + icytsekrhs1a + xrnduoasy0a + flbrocha2a + "iLQsFbyA" + frjvUhI + suwZmUk + oYZQyWx + CDLkKaQ + jgzuWoA + KAXOmYM + Lwfndou + "");
    }

    //垃圾方法
    private void JSUetxqT(char vaqmlgwafn0, boolean rhkvqws1, float femdksqwxw2) {
        float femdksqwxw2a = femdksqwxw2;
        boolean rhkvqws1a = rhkvqws1;
        char vaqmlgwafn0a = vaqmlgwafn0;
        new AttributedString("JSUetxqT" + femdksqwxw2a + vaqmlgwafn0a + rhkvqws1a + "JSUetxqT" + Lwfndou + KAXOmYM + suwZmUk + frjvUhI + jgzuWoA + CDLkKaQ + oYZQyWx + "");
    }

    //垃圾方法
    private void AlARlrfN(byte swetnvenn0, float ubepumxfsj1) {
        float ubepumxfsj1a = ubepumxfsj1;
        byte swetnvenn0a = swetnvenn0;
        new String("AlARlrfN" + ubepumxfsj1a + swetnvenn0a + "AlARlrfN" + oYZQyWx + Lwfndou + KAXOmYM + CDLkKaQ + jgzuWoA + frjvUhI + suwZmUk + "");
    }

    //垃圾方法
    private void axmoBPKi(short uuzgopkjs0, long dtszkieiri1) {
        long dtszkieiri1a = dtszkieiri1;
        short uuzgopkjs0a = uuzgopkjs0;
        new AttributedString("axmoBPKi" + dtszkieiri1a + uuzgopkjs0a + "axmoBPKi" + CDLkKaQ + Lwfndou + jgzuWoA + suwZmUk + oYZQyWx + KAXOmYM + frjvUhI + "");
    }

    //垃圾方法
    private void ygQeWfIJ(long oovbejq0, short gvtxtur1, float qvwccdhzja2, long azyjkmfrr3, double ovyednjuc4) {
        double ovyednjuc4a = ovyednjuc4;
        long azyjkmfrr3a = azyjkmfrr3;
        float qvwccdhzja2a = qvwccdhzja2;
        short gvtxtur1a = gvtxtur1;
        long oovbejq0a = oovbejq0;
        Log.e("ygQeWfIJ", "ygQeWfIJ" + gvtxtur1a + qvwccdhzja2a + azyjkmfrr3a + oovbejq0a + ovyednjuc4a + "ygQeWfIJ" + Lwfndou + frjvUhI + CDLkKaQ + suwZmUk + jgzuWoA + KAXOmYM + oYZQyWx + "");
    }

    //垃圾方法
    private void lctxOcNc(double tfvchbugwh0) {
        double tfvchbugwh0a = tfvchbugwh0;
        new StringBuffer("lctxOcNc" + tfvchbugwh0a + "lctxOcNc" + Lwfndou + frjvUhI + oYZQyWx + KAXOmYM + CDLkKaQ + jgzuWoA + suwZmUk + "");
    }

    //垃圾方法
    private void xaubOQjJ(byte sjqfqqcpk0, char zrkikos1, byte eigxozkzv2) {
        byte eigxozkzv2a = eigxozkzv2;
        char zrkikos1a = zrkikos1;
        byte sjqfqqcpk0a = sjqfqqcpk0;
        new StringBuilder("xaubOQjJ" + zrkikos1a + eigxozkzv2a + sjqfqqcpk0a + "xaubOQjJ" + suwZmUk + oYZQyWx + CDLkKaQ + KAXOmYM + frjvUhI + Lwfndou + jgzuWoA + "");
    }

    //垃圾方法
    private void NaRvIkto(short yvhicnbbx0, long delqcvqg1, int xbocimvvi2) {
        int xbocimvvi2a = xbocimvvi2;
        long delqcvqg1a = delqcvqg1;
        short yvhicnbbx0a = yvhicnbbx0;
        new StringReader("NaRvIkto" + xbocimvvi2a + yvhicnbbx0a + delqcvqg1a + "NaRvIkto" + frjvUhI + CDLkKaQ + suwZmUk + oYZQyWx + jgzuWoA + Lwfndou + KAXOmYM + "");
    }

    //垃圾方法
    private void HXWgysrN(byte zdolohk0, boolean qgivqcwsbz1, char fieevzvjf2, byte heucsnjvv3) {
        byte heucsnjvv3a = heucsnjvv3;
        char fieevzvjf2a = fieevzvjf2;
        boolean qgivqcwsbz1a = qgivqcwsbz1;
        byte zdolohk0a = zdolohk0;
        Log.i("HXWgysrN", "HXWgysrN" + fieevzvjf2a + zdolohk0a + heucsnjvv3a + qgivqcwsbz1a + "HXWgysrN" + CDLkKaQ + KAXOmYM + Lwfndou + frjvUhI + suwZmUk + jgzuWoA + oYZQyWx + "");
    }

    //垃圾方法
    private void ExBBcPJi(char xpkmcti0, byte ugsbwrywnl1, float jpspubswn2) {
        float jpspubswn2a = jpspubswn2;
        byte ugsbwrywnl1a = ugsbwrywnl1;
        char xpkmcti0a = xpkmcti0;
        new StringBuffer("ExBBcPJi" + jpspubswn2a + ugsbwrywnl1a + xpkmcti0a + "ExBBcPJi" + KAXOmYM + frjvUhI + suwZmUk + Lwfndou + CDLkKaQ + oYZQyWx + jgzuWoA + "");
    }

    //垃圾方法
    private void eYJeFfSy(char pqpduya0, double dvelmnypks1, long kyxfogzt2, boolean hieojdj3, boolean gsmxzntk4) {
        boolean gsmxzntk4a = gsmxzntk4;
        boolean hieojdj3a = hieojdj3;
        long kyxfogzt2a = kyxfogzt2;
        double dvelmnypks1a = dvelmnypks1;
        char pqpduya0a = pqpduya0;
        Log.e("eYJeFfSy", "eYJeFfSy" + gsmxzntk4a + pqpduya0a + dvelmnypks1a + kyxfogzt2a + hieojdj3a + "eYJeFfSy" + frjvUhI + KAXOmYM + Lwfndou + suwZmUk + oYZQyWx + CDLkKaQ + jgzuWoA + "");
    }

    //垃圾方法
    private void VozXcTeV(boolean iovycyf0, char acahhcliyg1, boolean lzwsrlqbft2, char cmzllrbah3) {
        char cmzllrbah3a = cmzllrbah3;
        boolean lzwsrlqbft2a = lzwsrlqbft2;
        char acahhcliyg1a = acahhcliyg1;
        boolean iovycyf0a = iovycyf0;
        new Thread("VozXcTeV" + iovycyf0a + cmzllrbah3a + acahhcliyg1a + lzwsrlqbft2a + "VozXcTeV" + jgzuWoA + suwZmUk + frjvUhI + CDLkKaQ + oYZQyWx + Lwfndou + KAXOmYM + "");
    }

    public void onDestroy() {
        char cmzllrbah3 = 35;
        boolean lzwsrlqbft2 = true;
        char acahhcliyg1 = 98;
        boolean iovycyf0 = false;
        boolean gsmxzntk4 = true;
        boolean hieojdj3 = false;
        long kyxfogzt2 = 25L;
        double dvelmnypks1 = 73.73;
        char pqpduya0 = 65;
        float jpspubswn2 = 6.6f;
        byte ugsbwrywnl1 = 48;
        char xpkmcti0 = 65;
        byte heucsnjvv3 = 33;
        char fieevzvjf2 = 35;
        boolean qgivqcwsbz1 = false;
        byte zdolohk0 = 18;
        int xbocimvvi2 = 13;
        long delqcvqg1 = 76L;
        short yvhicnbbx0 = 91;
        byte eigxozkzv2 = 65;
        char zrkikos1 = 50;
        byte sjqfqqcpk0 = 99;
        double tfvchbugwh0 = 83.83;
        double ovyednjuc4 = 86.86;
        long azyjkmfrr3 = 74L;
        float qvwccdhzja2 = 71.71f;
        short gvtxtur1 = 63;
        long oovbejq0 = 73L;
        long dtszkieiri1 = 54L;
        short uuzgopkjs0 = 57;
        float ubepumxfsj1 = 41.41f;
        byte swetnvenn0 = 16;
        float femdksqwxw2 = 29.29f;
        boolean rhkvqws1 = false;
        char vaqmlgwafn0 = 34;
        byte flbrocha2 = 59;
        double icytsekrhs1 = 56.56;
        double xrnduoasy0 = 61.61;
        isLiving = false;
        isShowing = false;
        super.onDestroy();
    }

    //垃圾方法
    private void hKyYsbhu(byte oqnwrnkvj0) {
        byte oqnwrnkvj0a = oqnwrnkvj0;
        Log.w("hKyYsbhu", "hKyYsbhu" + oqnwrnkvj0a + "hKyYsbhu" + jgzuWoA + suwZmUk + oYZQyWx + Lwfndou + KAXOmYM + CDLkKaQ + frjvUhI + "");
    }

    //垃圾方法
    private void JDUUeiTY(short pxdzhrgosx0, char ehufbzx1, int hwitoaebc2, double hqirqxzc3, char rjazczir4) {
        char rjazczir4a = rjazczir4;
        double hqirqxzc3a = hqirqxzc3;
        int hwitoaebc2a = hwitoaebc2;
        char ehufbzx1a = ehufbzx1;
        short pxdzhrgosx0a = pxdzhrgosx0;
        new StringBuilder("JDUUeiTY" + hwitoaebc2a + pxdzhrgosx0a + ehufbzx1a + rjazczir4a + hqirqxzc3a + "JDUUeiTY" + KAXOmYM + suwZmUk + jgzuWoA + oYZQyWx + frjvUhI + CDLkKaQ + Lwfndou + "");
    }

    //垃圾方法
    private void pMcoVTWc(boolean xndjesk0, byte ijkuowjod1) {
        byte ijkuowjod1a = ijkuowjod1;
        boolean xndjesk0a = xndjesk0;
        new StringBuilder("pMcoVTWc" + xndjesk0a + ijkuowjod1a + "pMcoVTWc" + frjvUhI + oYZQyWx + CDLkKaQ + Lwfndou + suwZmUk + KAXOmYM + jgzuWoA + "");
    }

    //垃圾方法
    private void JLbaijhq(short twzvrblfdx0, short hcdfhviax1) {
        short hcdfhviax1a = hcdfhviax1;
        short twzvrblfdx0a = twzvrblfdx0;
        new StringBuilder("JLbaijhq" + twzvrblfdx0a + hcdfhviax1a + "JLbaijhq" + Lwfndou + frjvUhI + oYZQyWx + jgzuWoA + CDLkKaQ + suwZmUk + KAXOmYM + "");
    }

    //垃圾方法
    private void iwaxOHZB(boolean gmtyxffmmw0, byte pyyhmdh1, long eubvkpv2, char efsbbdbi3) {
        char efsbbdbi3a = efsbbdbi3;
        long eubvkpv2a = eubvkpv2;
        byte pyyhmdh1a = pyyhmdh1;
        boolean gmtyxffmmw0a = gmtyxffmmw0;
    }

    //垃圾方法
    private void bvHvmUjC(float zkqtmmnwcb0, double mktbzga1, int jkkdmfovxb2) {
        int jkkdmfovxb2a = jkkdmfovxb2;
        double mktbzga1a = mktbzga1;
        float zkqtmmnwcb0a = zkqtmmnwcb0;
        Log.w("bvHvmUjC", "bvHvmUjC" + jkkdmfovxb2a + zkqtmmnwcb0a + mktbzga1a + "bvHvmUjC" + oYZQyWx + jgzuWoA + frjvUhI + suwZmUk + Lwfndou + KAXOmYM + CDLkKaQ + "");
    }

    //垃圾方法
    private void vKOPOScT(int mlxnssbgbv0) {
        int mlxnssbgbv0a = mlxnssbgbv0;
        new File("vKOPOScT" + mlxnssbgbv0a + "vKOPOScT" + KAXOmYM + CDLkKaQ + suwZmUk + jgzuWoA + oYZQyWx + Lwfndou + frjvUhI + "");
    }

    //垃圾方法
    private void TWiakbvj(byte cgspmbk0, long ovzgdys1) {
        long ovzgdys1a = ovzgdys1;
        byte cgspmbk0a = cgspmbk0;
        new StringBuffer("TWiakbvj" + cgspmbk0a + ovzgdys1a + "TWiakbvj" + KAXOmYM + oYZQyWx + jgzuWoA + frjvUhI + Lwfndou + CDLkKaQ + suwZmUk + "");
    }

    //垃圾方法
    private void lFGmLquy(byte djbxfoeob0, byte qttulqxyz1, boolean jxrnwjc2) {
        boolean jxrnwjc2a = jxrnwjc2;
        byte qttulqxyz1a = qttulqxyz1;
        byte djbxfoeob0a = djbxfoeob0;
        new Thread("lFGmLquy" + djbxfoeob0a + qttulqxyz1a + jxrnwjc2a + "lFGmLquy" + jgzuWoA + Lwfndou + frjvUhI + suwZmUk + oYZQyWx + KAXOmYM + CDLkKaQ + "");
    }

    //垃圾方法
    private void esTfuOAF(char yhnsersw0) {
        char yhnsersw0a = yhnsersw0;
        new StringBuffer("esTfuOAF" + yhnsersw0a + "esTfuOAF" + KAXOmYM + CDLkKaQ + suwZmUk + jgzuWoA + Lwfndou + frjvUhI + oYZQyWx + "");
    }

    //垃圾方法
    private void bnUeXblV(short sjbayehj0) {
        short sjbayehj0a = sjbayehj0;
        new StringBuilder("bnUeXblV" + sjbayehj0a + "bnUeXblV" + CDLkKaQ + Lwfndou + jgzuWoA + suwZmUk + oYZQyWx + frjvUhI + KAXOmYM + "");
    }

    //垃圾方法
    private void efPSVSzE(long fydwijbd0, long quctrvelu1) {
        long quctrvelu1a = quctrvelu1;
        long fydwijbd0a = fydwijbd0;
        new StringBuffer("efPSVSzE" + fydwijbd0a + quctrvelu1a + "efPSVSzE" + jgzuWoA + Lwfndou + oYZQyWx + frjvUhI + suwZmUk + CDLkKaQ + KAXOmYM + "");
    }

    //垃圾方法
    private void OetdmWiN(long hejvcmtb0) {
        long hejvcmtb0a = hejvcmtb0;
        new StringBuilder("OetdmWiN" + hejvcmtb0a + "OetdmWiN" + CDLkKaQ + Lwfndou + frjvUhI + oYZQyWx + suwZmUk + KAXOmYM + jgzuWoA + "");
    }

    //垃圾方法
    private void BAtlllpN(char lcknkwr0, char rpniyoq1, long cdbbphk2) {
        long cdbbphk2a = cdbbphk2;
        char rpniyoq1a = rpniyoq1;
        char lcknkwr0a = lcknkwr0;
        Log.i("BAtlllpN", "BAtlllpN" + cdbbphk2a + lcknkwr0a + rpniyoq1a + "BAtlllpN" + oYZQyWx + suwZmUk + jgzuWoA + frjvUhI + KAXOmYM + CDLkKaQ + Lwfndou + "");
    }

    //垃圾方法
    private void SKCeXWJI(double zjewcixgz0, double mboeuzlmm1) {
        double mboeuzlmm1a = mboeuzlmm1;
        double zjewcixgz0a = zjewcixgz0;
        new AttributedString("SKCeXWJI" + zjewcixgz0a + mboeuzlmm1a + "SKCeXWJI" + frjvUhI + KAXOmYM + CDLkKaQ + oYZQyWx + suwZmUk + Lwfndou + jgzuWoA + "");
    }

    //垃圾方法
    private void MpEzsqnx(int qfmtckbhw0, float gcqcxdbevz1, byte uixlxwd2) {
        byte uixlxwd2a = uixlxwd2;
        float gcqcxdbevz1a = gcqcxdbevz1;
        int qfmtckbhw0a = qfmtckbhw0;
        new String("MpEzsqnx" + qfmtckbhw0a + gcqcxdbevz1a + uixlxwd2a + "MpEzsqnx" + oYZQyWx + frjvUhI + Lwfndou + CDLkKaQ + KAXOmYM + jgzuWoA + suwZmUk + "");
    }

    //垃圾方法
    private void WuVfGpdE(double koqyarv0, double lmordtv1) {
        double lmordtv1a = lmordtv1;
        double koqyarv0a = koqyarv0;
        System.out.println("WuVfGpdE" + koqyarv0a + lmordtv1a + "WuVfGpdE" + Lwfndou + jgzuWoA + KAXOmYM + frjvUhI + CDLkKaQ + oYZQyWx + suwZmUk + "");
    }

    //垃圾方法
    private void LpeIlLdI(long ecqrgpn0) {
        long ecqrgpn0a = ecqrgpn0;
        TextUtils.isEmpty("LpeIlLdI" + ecqrgpn0a + "LpeIlLdI" + KAXOmYM + jgzuWoA + suwZmUk + oYZQyWx + Lwfndou + CDLkKaQ + frjvUhI + "");
    }

    //垃圾方法
    private void joLbYYqL(byte lzaxdztsgg0, long bfwtpcf1, short yovsisak2) {
        short yovsisak2a = yovsisak2;
        long bfwtpcf1a = bfwtpcf1;
        byte lzaxdztsgg0a = lzaxdztsgg0;
        new Thread("joLbYYqL" + bfwtpcf1a + yovsisak2a + lzaxdztsgg0a + "joLbYYqL" + jgzuWoA + KAXOmYM + suwZmUk + oYZQyWx + Lwfndou + CDLkKaQ + frjvUhI + "");
    }

    //垃圾方法
    private void IQQsIbNM(double zeuypfccr0, byte skwtdgj1) {
        byte skwtdgj1a = skwtdgj1;
        double zeuypfccr0a = zeuypfccr0;
        new File("IQQsIbNM" + skwtdgj1a + zeuypfccr0a + "IQQsIbNM" + Lwfndou + frjvUhI + jgzuWoA + CDLkKaQ + KAXOmYM + oYZQyWx + suwZmUk + "");
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        byte skwtdgj1 = 22;
        double zeuypfccr0 = 68.68;
        short yovsisak2 = 97;
        long bfwtpcf1 = 34L;
        byte lzaxdztsgg0 = 62;
        long ecqrgpn0 = 17L;
        double lmordtv1 = 61.61;
        double koqyarv0 = 82.82;
        byte uixlxwd2 = 51;
        float gcqcxdbevz1 = 93.93f;
        int qfmtckbhw0 = 57;
        double mboeuzlmm1 = 49.49;
        double zjewcixgz0 = 85.85;
        long cdbbphk2 = 2L;
        char rpniyoq1 = 34;
        char lcknkwr0 = 75;
        long hejvcmtb0 = 64L;
        long quctrvelu1 = 48L;
        long fydwijbd0 = 75L;
        short sjbayehj0 = 48;
        char yhnsersw0 = 93;
        boolean jxrnwjc2 = false;
        byte qttulqxyz1 = 37;
        byte djbxfoeob0 = 70;
        long ovzgdys1 = 51L;
        byte cgspmbk0 = 54;
        int mlxnssbgbv0 = 13;
        int jkkdmfovxb2 = 22;
        double mktbzga1 = 86.86;
        float zkqtmmnwcb0 = 57.57f;
        char efsbbdbi3 = 0;
        long eubvkpv2 = 92L;
        byte pyyhmdh1 = 100;
        boolean gmtyxffmmw0 = true;
        short hcdfhviax1 = 40;
        short twzvrblfdx0 = 64;
        byte ijkuowjod1 = 16;
        boolean xndjesk0 = true;
        char rjazczir4 = 28;
        double hqirqxzc3 = 78.78;
        int hwitoaebc2 = 7;
        char ehufbzx1 = 74;
        short pxdzhrgosx0 = 34;
        byte oqnwrnkvj0 = 72;
        MpEzsqnx(qfmtckbhw0, gcqcxdbevz1, uixlxwd2);
        MpEzsqnx(qfmtckbhw0, gcqcxdbevz1, uixlxwd2);
        BAtlllpN(lcknkwr0, rpniyoq1, cdbbphk2);
        SKCeXWJI(zjewcixgz0, mboeuzlmm1);
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        Iterator var55 = manager.getRunningServices(Integer.MAX_VALUE).iterator();
        ActivityManager.RunningServiceInfo runningService;
        do {
            if (!var55.hasNext()) {
                return false;
            }
            runningService = (ActivityManager.RunningServiceInfo) var55.next();
        } while (!serviceClass.getName().equals(runningService.service.getClassName()) || !runningService.foreground);
        return true;
    }

    //垃圾方法
    static private void UKlyMiXQ(char uwqlcdxul0, byte wlenivbll1, short gazvtxxhw2) {
        short gazvtxxhw2a = gazvtxxhw2;
        byte wlenivbll1a = wlenivbll1;
        char uwqlcdxul0a = uwqlcdxul0;
        new String("UKlyMiXQ" + uwqlcdxul0a + wlenivbll1a + gazvtxxhw2a + "UKlyMiXQ" + "");
    }

    //垃圾方法
    static private void LxAkGzIN(float mcdafigv0, byte vyaycxljgb1, float icdpmfamis2, float euxrwud3, long ycxltbdp4) {
        long ycxltbdp4a = ycxltbdp4;
        float euxrwud3a = euxrwud3;
        float icdpmfamis2a = icdpmfamis2;
        byte vyaycxljgb1a = vyaycxljgb1;
        float mcdafigv0a = mcdafigv0;
        Log.w("LxAkGzIN", "LxAkGzIN" + ycxltbdp4a + euxrwud3a + icdpmfamis2a + mcdafigv0a + vyaycxljgb1a + "LxAkGzIN" + "");
    }

    //垃圾方法
    static private void BQqlykpv(int rbejrlnsk0, boolean zyycopb1, short uqkxxefohw2) {
        short uqkxxefohw2a = uqkxxefohw2;
        boolean zyycopb1a = zyycopb1;
        int rbejrlnsk0a = rbejrlnsk0;
        new Thread("BQqlykpv" + zyycopb1a + uqkxxefohw2a + rbejrlnsk0a + "BQqlykpv" + "");
    }

    //垃圾方法
    static private void hbPCWEqx(byte xciemqqo0, int ethtjtmlth1, char rdmaytcy2, char qdgrdsg3, int jqgiecsxx4) {
        int jqgiecsxx4a = jqgiecsxx4;
        char qdgrdsg3a = qdgrdsg3;
        char rdmaytcy2a = rdmaytcy2;
        int ethtjtmlth1a = ethtjtmlth1;
        byte xciemqqo0a = xciemqqo0;
        new AttributedString("hbPCWEqx" + ethtjtmlth1a + jqgiecsxx4a + qdgrdsg3a + rdmaytcy2a + xciemqqo0a + "hbPCWEqx" + "");
    }

    //垃圾方法
    static private void hFwwfLYs(short lqswaageu0, long atmvxkoy1, short qgikpki2) {
        short qgikpki2a = qgikpki2;
        long atmvxkoy1a = atmvxkoy1;
        short lqswaageu0a = lqswaageu0;
        Log.i("hFwwfLYs", "hFwwfLYs" + qgikpki2a + atmvxkoy1a + lqswaageu0a + "hFwwfLYs" + "");
    }

    //垃圾方法
    static private void zrjuYndm(short dcutqxyb0, int nzyopkeo1, float borryew2, short bjjrubdy3, short faifytwhz4) {
        short faifytwhz4a = faifytwhz4;
        short bjjrubdy3a = bjjrubdy3;
        float borryew2a = borryew2;
        int nzyopkeo1a = nzyopkeo1;
        short dcutqxyb0a = dcutqxyb0;
        new AttributedString("zrjuYndm" + faifytwhz4a + bjjrubdy3a + dcutqxyb0a + nzyopkeo1a + borryew2a + "zrjuYndm" + "");
    }

    //垃圾方法
    static private void fHUItdMe(char oghngken0, boolean hwicqwpcm1, int tjbgdfcvfr2) {
        int tjbgdfcvfr2a = tjbgdfcvfr2;
        boolean hwicqwpcm1a = hwicqwpcm1;
        char oghngken0a = oghngken0;
        Log.e("fHUItdMe", "fHUItdMe" + tjbgdfcvfr2a + hwicqwpcm1a + oghngken0a + "fHUItdMe" + "");
    }

    //垃圾方法
    static private void wOWqHLiE(byte zrntsmqv0, double ipuoaean1, double vgttbpus2, int gkbcvdyq3) {
        int gkbcvdyq3a = gkbcvdyq3;
        double vgttbpus2a = vgttbpus2;
        double ipuoaean1a = ipuoaean1;
        byte zrntsmqv0a = zrntsmqv0;
        new Thread("wOWqHLiE" + gkbcvdyq3a + ipuoaean1a + vgttbpus2a + zrntsmqv0a + "wOWqHLiE" + "");
    }

    //垃圾方法
    static private void xqSmOXjN(char lbxldown0, long qcmdncxw1) {
        long qcmdncxw1a = qcmdncxw1;
        char lbxldown0a = lbxldown0;
    }

    //垃圾方法
    static private void estniXwb(byte qmfnvnytii0, double tntiyha1) {
        double tntiyha1a = tntiyha1;
        byte qmfnvnytii0a = qmfnvnytii0;
        new Thread("estniXwb" + qmfnvnytii0a + tntiyha1a + "estniXwb" + "");
    }

    //垃圾方法
    static private void GyMZhqVE(byte nhekwlc0) {
        byte nhekwlc0a = nhekwlc0;
        TextUtils.isDigitsOnly("GyMZhqVE" + nhekwlc0a + "GyMZhqVE" + "");
    }

    //垃圾方法
    static private void xZdTYbLC(double hciknwejei0, int mzpdtrpg1) {
        int mzpdtrpg1a = mzpdtrpg1;
        double hciknwejei0a = hciknwejei0;
    }

    //垃圾方法
    static private void mNnPvyKi(int pvkevvtx0, double gcanvzme1, boolean qrjvgtwmlz2) {
        boolean qrjvgtwmlz2a = qrjvgtwmlz2;
        double gcanvzme1a = gcanvzme1;
        int pvkevvtx0a = pvkevvtx0;
        new String("mNnPvyKi" + qrjvgtwmlz2a + pvkevvtx0a + gcanvzme1a + "mNnPvyKi" + "");
    }

    //垃圾方法
    static private void jPuWMuei(int qfqgrkbpki0, short eirgxif1, float rqdiotp2, char nxhdzwn3) {
        char nxhdzwn3a = nxhdzwn3;
        float rqdiotp2a = rqdiotp2;
        short eirgxif1a = eirgxif1;
        int qfqgrkbpki0a = qfqgrkbpki0;
        System.out.println("jPuWMuei" + qfqgrkbpki0a + rqdiotp2a + nxhdzwn3a + eirgxif1a + "jPuWMuei" + "");
    }

    //垃圾方法
    static private void PZWYVWUL(long pgjilnltd0, long xscxktpnoa1, boolean jtxyhwhc2) {
        boolean jtxyhwhc2a = jtxyhwhc2;
        long xscxktpnoa1a = xscxktpnoa1;
        long pgjilnltd0a = pgjilnltd0;
        new WeakReference("PZWYVWUL" + jtxyhwhc2a + pgjilnltd0a + xscxktpnoa1a + "PZWYVWUL" + "");
    }

    //垃圾方法
    static private void oCFdWgls(char uvvmsggd0, double zmobglgbis1) {
        double zmobglgbis1a = zmobglgbis1;
        char uvvmsggd0a = uvvmsggd0;
        new Thread("oCFdWgls" + zmobglgbis1a + uvvmsggd0a + "oCFdWgls" + "");
    }

    //垃圾方法
    static private void WzifEDaw(byte lizabpxqrp0, byte mahlizyxuv1, boolean zafzmjxinu2, boolean akfflnq3) {
        boolean akfflnq3a = akfflnq3;
        boolean zafzmjxinu2a = zafzmjxinu2;
        byte mahlizyxuv1a = mahlizyxuv1;
        byte lizabpxqrp0a = lizabpxqrp0;
        new AttributedString("WzifEDaw" + lizabpxqrp0a + akfflnq3a + zafzmjxinu2a + mahlizyxuv1a + "WzifEDaw" + "");
    }

    //垃圾方法
    static private void XdWsIzSP(float pqyctzjh0, short wzbbhpu1) {
        short wzbbhpu1a = wzbbhpu1;
        float pqyctzjh0a = pqyctzjh0;
        TextUtils.isEmpty("XdWsIzSP" + wzbbhpu1a + pqyctzjh0a + "XdWsIzSP" + "");
    }

    //垃圾方法
    static private void ojUbWSUB(double iufyjsjusn0) {
        double iufyjsjusn0a = iufyjsjusn0;
        new File("ojUbWSUB" + iufyjsjusn0a + "ojUbWSUB" + "");
    }

    //垃圾方法
    static private void knltjdeK(float avkiqfkx0, boolean orklsepnlu1, long isbehlz2, boolean qrqtmvx3) {
        boolean qrqtmvx3a = qrqtmvx3;
        long isbehlz2a = isbehlz2;
        boolean orklsepnlu1a = orklsepnlu1;
        float avkiqfkx0a = avkiqfkx0;
        new WeakReference("knltjdeK" + orklsepnlu1a + isbehlz2a + qrqtmvx3a + avkiqfkx0a + "knltjdeK" + "");
    }

    //垃圾方法
    static private void WGatsFIZ(short usrfzspp0, byte shasclqw1, int erytudbar2, boolean tcnntlwc3) {
        boolean tcnntlwc3a = tcnntlwc3;
        int erytudbar2a = erytudbar2;
        byte shasclqw1a = shasclqw1;
        short usrfzspp0a = usrfzspp0;
        Log.w("WGatsFIZ", "WGatsFIZ" + usrfzspp0a + tcnntlwc3a + shasclqw1a + erytudbar2a + "WGatsFIZ" + "");
    }

    //垃圾方法
    static private void DFCrfRut(short ikqpqqo0, int mbuvdntiu1, byte fwrfnnix2, float cvpqqgv3, short bdmgnyjg4) {
        short bdmgnyjg4a = bdmgnyjg4;
        float cvpqqgv3a = cvpqqgv3;
        byte fwrfnnix2a = fwrfnnix2;
        int mbuvdntiu1a = mbuvdntiu1;
        short ikqpqqo0a = ikqpqqo0;
        new StringBuilder("DFCrfRut" + cvpqqgv3a + ikqpqqo0a + bdmgnyjg4a + fwrfnnix2a + mbuvdntiu1a + "DFCrfRut" + "");
    }

    //垃圾方法
    static private void zNMddjKo(float msbrinf0, int mnzgafqqi1, double bcfsoytke2, byte glakykht3, float kqlkdrfst4) {
        float kqlkdrfst4a = kqlkdrfst4;
        byte glakykht3a = glakykht3;
        double bcfsoytke2a = bcfsoytke2;
        int mnzgafqqi1a = mnzgafqqi1;
        float msbrinf0a = msbrinf0;
        new StringBuilder("zNMddjKo" + kqlkdrfst4a + msbrinf0a + mnzgafqqi1a + glakykht3a + bcfsoytke2a + "zNMddjKo" + "");
    }

    //垃圾方法
    static private void UgsYKJyU(float jpbabivhk0, boolean ovshasmtb1, short ldeigbm2, long ujuudgedwm3, float duybcohdd4) {
        float duybcohdd4a = duybcohdd4;
        long ujuudgedwm3a = ujuudgedwm3;
        short ldeigbm2a = ldeigbm2;
        boolean ovshasmtb1a = ovshasmtb1;
        float jpbabivhk0a = jpbabivhk0;
        System.out.println("UgsYKJyU" + jpbabivhk0a + ovshasmtb1a + duybcohdd4a + ldeigbm2a + ujuudgedwm3a + "UgsYKJyU" + "");
    }

    //垃圾方法
    static private void tkujeeVo(double wqmepghgqm0, short zbfjywkd1) {
        short zbfjywkd1a = zbfjywkd1;
        double wqmepghgqm0a = wqmepghgqm0;
        new Thread("tkujeeVo" + wqmepghgqm0a + zbfjywkd1a + "tkujeeVo" + "");
    }

    //垃圾方法
    static private void RbpTCnNv(double xqugava0, char bqlmfoke1, short mublejpxau2, byte rjcbucxx3) {
        byte rjcbucxx3a = rjcbucxx3;
        short mublejpxau2a = mublejpxau2;
        char bqlmfoke1a = bqlmfoke1;
        double xqugava0a = xqugava0;
        new File("RbpTCnNv" + mublejpxau2a + bqlmfoke1a + xqugava0a + rjcbucxx3a + "RbpTCnNv" + "");
    }

    //垃圾方法
    static private void KyLYImOw(char ndasnln0) {
        char ndasnln0a = ndasnln0;
        new StringBuffer("KyLYImOw" + ndasnln0a + "KyLYImOw" + "");
    }

    //垃圾方法
    static private void ZMDOJBgU(char lppuyxn0, double ubeqcbnfvt1, boolean skttvait2, boolean zsbgyyw3, byte jbahzbupyf4) {
        byte jbahzbupyf4a = jbahzbupyf4;
        boolean zsbgyyw3a = zsbgyyw3;
        boolean skttvait2a = skttvait2;
        double ubeqcbnfvt1a = ubeqcbnfvt1;
        char lppuyxn0a = lppuyxn0;
        TextUtils.isEmpty("ZMDOJBgU" + zsbgyyw3a + ubeqcbnfvt1a + jbahzbupyf4a + skttvait2a + lppuyxn0a + "ZMDOJBgU" + "");
    }

    //垃圾方法
    static private void ZvIWNUaJ(float eypmdwhqx0) {
        float eypmdwhqx0a = eypmdwhqx0;
        new StringReader("ZvIWNUaJ" + eypmdwhqx0a + "ZvIWNUaJ" + "");
    }

    //垃圾方法
    static private void fNWclpYt(int wgaeehpqz0, int qfxuivood1, long snoumuncy2, double eflefxyoxf3) {
        double eflefxyoxf3a = eflefxyoxf3;
        long snoumuncy2a = snoumuncy2;
        int qfxuivood1a = qfxuivood1;
        int wgaeehpqz0a = wgaeehpqz0;
        Log.w("fNWclpYt", "fNWclpYt" + eflefxyoxf3a + wgaeehpqz0a + qfxuivood1a + snoumuncy2a + "fNWclpYt" + "");
    }

    //垃圾方法
    static private void wQszBjEQ(long albovtbilc0, short valnwfl1) {
        short valnwfl1a = valnwfl1;
        long albovtbilc0a = albovtbilc0;
        new Thread("wQszBjEQ" + albovtbilc0a + valnwfl1a + "wQszBjEQ" + "");
    }

    //垃圾方法
    static private void QZbHpkLg(long ydwriybkz0, boolean gcvdvyagdj1, byte hbnhoywozo2) {
        byte hbnhoywozo2a = hbnhoywozo2;
        boolean gcvdvyagdj1a = gcvdvyagdj1;
        long ydwriybkz0a = ydwriybkz0;
        new AttributedString("QZbHpkLg" + ydwriybkz0a + gcvdvyagdj1a + hbnhoywozo2a + "QZbHpkLg" + "");
    }

    //垃圾方法
    static private void luCiFWor(short khkdlnr0, char joqmfxdq1) {
        char joqmfxdq1a = joqmfxdq1;
        short khkdlnr0a = khkdlnr0;
        Log.e("luCiFWor", "luCiFWor" + joqmfxdq1a + khkdlnr0a + "luCiFWor" + "");
    }

    //垃圾方法
    static private void EPJIwNOr(char vzsvbwfver0, byte esobnwuscz1) {
        byte esobnwuscz1a = esobnwuscz1;
        char vzsvbwfver0a = vzsvbwfver0;
        TextUtils.isDigitsOnly("EPJIwNOr" + esobnwuscz1a + vzsvbwfver0a + "EPJIwNOr" + "");
    }

    //垃圾方法
    static private void iQwArbXi(boolean zhixlkui0, char zstugalpp1, byte yiglyxajel2, short akqkcxxn3) {
        short akqkcxxn3a = akqkcxxn3;
        byte yiglyxajel2a = yiglyxajel2;
        char zstugalpp1a = zstugalpp1;
        boolean zhixlkui0a = zhixlkui0;
        System.out.println("iQwArbXi" + akqkcxxn3a + zstugalpp1a + zhixlkui0a + yiglyxajel2a + "iQwArbXi" + "");
    }

    //垃圾方法
    static private void JOBlGxbk(boolean xogbcupsk0, byte fvzekdj1) {
        byte fvzekdj1a = fvzekdj1;
        boolean xogbcupsk0a = xogbcupsk0;
        new File("JOBlGxbk" + xogbcupsk0a + fvzekdj1a + "JOBlGxbk" + "");
    }

    //垃圾方法
    static private void UdEVtHqC(long rprcgxk0) {
        long rprcgxk0a = rprcgxk0;
        new Thread("UdEVtHqC" + rprcgxk0a + "UdEVtHqC" + "");
    }

    //垃圾方法
    static private void ndgnMIUE(int rfsfcdtie0, short dthzsenehe1, long hefhwib2, long mpmkpulm3, int zjlzedyn4) {
        int zjlzedyn4a = zjlzedyn4;
        long mpmkpulm3a = mpmkpulm3;
        long hefhwib2a = hefhwib2;
        short dthzsenehe1a = dthzsenehe1;
        int rfsfcdtie0a = rfsfcdtie0;
        new StringReader("ndgnMIUE" + zjlzedyn4a + hefhwib2a + rfsfcdtie0a + mpmkpulm3a + dthzsenehe1a + "ndgnMIUE" + "");
    }

    //垃圾方法
    static private void SGNiMNkG(long nkxcacv0, float kmkeduntlw1, char olireumir2, long etcxeywdw3, float wateltsowy4) {
        float wateltsowy4a = wateltsowy4;
        long etcxeywdw3a = etcxeywdw3;
        char olireumir2a = olireumir2;
        float kmkeduntlw1a = kmkeduntlw1;
        long nkxcacv0a = nkxcacv0;
        new Thread("SGNiMNkG" + etcxeywdw3a + wateltsowy4a + olireumir2a + nkxcacv0a + kmkeduntlw1a + "SGNiMNkG" + "");
    }

    //垃圾方法
    static private void nOMuPERl(long cmanoqmrl0, char xyxstqoef1) {
        char xyxstqoef1a = xyxstqoef1;
        long cmanoqmrl0a = cmanoqmrl0;
        new StringReader("nOMuPERl" + cmanoqmrl0a + xyxstqoef1a + "nOMuPERl" + "");
    }

    public static Notification createOngoingNotification(String channelName) {
        char xyxstqoef1 = 83;
        long cmanoqmrl0 = 13L;
        float wateltsowy4 = 24.24f;
        long etcxeywdw3 = 98L;
        char olireumir2 = 95;
        float kmkeduntlw1 = 88.88f;
        long nkxcacv0 = 15L;
        int zjlzedyn4 = 64;
        long mpmkpulm3 = 73L;
        long hefhwib2 = 4L;
        short dthzsenehe1 = 86;
        int rfsfcdtie0 = 83;
        long rprcgxk0 = 71L;
        byte fvzekdj1 = 13;
        boolean xogbcupsk0 = false;
        short akqkcxxn3 = 68;
        byte yiglyxajel2 = 78;
        char zstugalpp1 = 83;
        boolean zhixlkui0 = false;
        byte esobnwuscz1 = 95;
        char vzsvbwfver0 = 17;
        char joqmfxdq1 = 89;
        short khkdlnr0 = 57;
        byte hbnhoywozo2 = 71;
        boolean gcvdvyagdj1 = false;
        long ydwriybkz0 = 49L;
        short valnwfl1 = 82;
        long albovtbilc0 = 66L;
        double eflefxyoxf3 = 66.66;
        long snoumuncy2 = 2L;
        int qfxuivood1 = 74;
        int wgaeehpqz0 = 4;
        float eypmdwhqx0 = 43.43f;
        byte jbahzbupyf4 = 97;
        boolean zsbgyyw3 = true;
        boolean skttvait2 = true;
        double ubeqcbnfvt1 = 65.65;
        char lppuyxn0 = 62;
        char ndasnln0 = 19;
        byte rjcbucxx3 = 7;
        short mublejpxau2 = 43;
        char bqlmfoke1 = 85;
        double xqugava0 = 93.93;
        short zbfjywkd1 = 99;
        double wqmepghgqm0 = 96.96;
        float duybcohdd4 = 18.18f;
        long ujuudgedwm3 = 30L;
        short ldeigbm2 = 29;
        boolean ovshasmtb1 = true;
        float jpbabivhk0 = 29.29f;
        float kqlkdrfst4 = 31.31f;
        byte glakykht3 = 29;
        double bcfsoytke2 = 11.11;
        int mnzgafqqi1 = 84;
        float msbrinf0 = 69.69f;
        short bdmgnyjg4 = 55;
        float cvpqqgv3 = 16.16f;
        byte fwrfnnix2 = 60;
        int mbuvdntiu1 = 12;
        short ikqpqqo0 = 71;
        boolean tcnntlwc3 = false;
        int erytudbar2 = 18;
        byte shasclqw1 = 68;
        short usrfzspp0 = 88;
        boolean qrqtmvx3 = false;
        long isbehlz2 = 39L;
        boolean orklsepnlu1 = false;
        float avkiqfkx0 = 23.23f;
        double iufyjsjusn0 = 39.39;
        short wzbbhpu1 = 56;
        float pqyctzjh0 = 24.24f;
        boolean akfflnq3 = false;
        boolean zafzmjxinu2 = false;
        byte mahlizyxuv1 = 4;
        byte lizabpxqrp0 = 0;
        double zmobglgbis1 = 63.63;
        char uvvmsggd0 = 95;
        boolean jtxyhwhc2 = true;
        long xscxktpnoa1 = 70L;
        long pgjilnltd0 = 21L;
        char nxhdzwn3 = 43;
        float rqdiotp2 = 37.37f;
        short eirgxif1 = 71;
        int qfqgrkbpki0 = 36;
        boolean qrjvgtwmlz2 = true;
        double gcanvzme1 = 73.73;
        int pvkevvtx0 = 50;
        int mzpdtrpg1 = 0;
        double hciknwejei0 = 100.100;
        byte nhekwlc0 = 22;
        double tntiyha1 = 13.13;
        byte qmfnvnytii0 = 11;
        long qcmdncxw1 = 23L;
        char lbxldown0 = 57;
        int gkbcvdyq3 = 47;
        double vgttbpus2 = 6.6;
        double ipuoaean1 = 85.85;
        byte zrntsmqv0 = 50;
        int tjbgdfcvfr2 = 78;
        boolean hwicqwpcm1 = false;
        char oghngken0 = 60;
        short faifytwhz4 = 78;
        short bjjrubdy3 = 15;
        float borryew2 = 30.30f;
        int nzyopkeo1 = 71;
        short dcutqxyb0 = 24;
        short qgikpki2 = 30;
        long atmvxkoy1 = 9L;
        short lqswaageu0 = 100;
        int jqgiecsxx4 = 84;
        char qdgrdsg3 = 96;
        char rdmaytcy2 = 28;
        int ethtjtmlth1 = 63;
        byte xciemqqo0 = 23;
        short uqkxxefohw2 = 45;
        boolean zyycopb1 = true;
        int rbejrlnsk0 = 44;
        long ycxltbdp4 = 74L;
        float euxrwud3 = 21.21f;
        float icdpmfamis2 = 23.23f;
        byte vyaycxljgb1 = 37;
        float mcdafigv0 = 57.57f;
        short gazvtxxhw2 = 42;
        byte wlenivbll1 = 29;
        char uwqlcdxul0 = 10;
        if (SimplyHouseworkrOrgManager.isDebug) {
            RbpTCnNv(xqugava0, bqlmfoke1, mublejpxau2, rjcbucxx3);
            ZvIWNUaJ(eypmdwhqx0);
            GyMZhqVE(nhekwlc0);
            xZdTYbLC(hciknwejei0, mzpdtrpg1);
            knltjdeK(avkiqfkx0, orklsepnlu1, isbehlz2, qrqtmvx3);
            fHUItdMe(oghngken0, hwicqwpcm1, tjbgdfcvfr2);
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        XdWsIzSP(pqyctzjh0, wzbbhpu1);
        BQqlykpv(rbejrlnsk0, zyycopb1, uqkxxefohw2);
        zrjuYndm(dcutqxyb0, nzyopkeo1, borryew2, bjjrubdy3, faifytwhz4);
        LxAkGzIN(mcdafigv0, vyaycxljgb1, icdpmfamis2, euxrwud3, ycxltbdp4);
        ZvIWNUaJ(eypmdwhqx0);
        UdEVtHqC(rprcgxk0);
        NotificationManager manager = (NotificationManager) SimplyHouseworkrOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(false);
            channel.enableVibration(false);
            channel.setSound((Uri) null, (AudioAttributes) null);
            ojUbWSUB(iufyjsjusn0);
            luCiFWor(khkdlnr0, joqmfxdq1);
            hbPCWEqx(xciemqqo0, ethtjtmlth1, rdmaytcy2, qdgrdsg3, jqgiecsxx4);
            RbpTCnNv(xqugava0, bqlmfoke1, mublejpxau2, rjcbucxx3);
            QZbHpkLg(ydwriybkz0, gcvdvyagdj1, hbnhoywozo2);
            RbpTCnNv(xqugava0, bqlmfoke1, mublejpxau2, rjcbucxx3);
            channel.setLockscreenVisibility(-1);
            WGatsFIZ(usrfzspp0, shasclqw1, erytudbar2, tcnntlwc3);
            DFCrfRut(ikqpqqo0, mbuvdntiu1, fwrfnnix2, cvpqqgv3, bdmgnyjg4);
            fNWclpYt(wgaeehpqz0, qfxuivood1, snoumuncy2, eflefxyoxf3);
            ndgnMIUE(rfsfcdtie0, dthzsenehe1, hefhwib2, mpmkpulm3, zjlzedyn4);
            xqSmOXjN(lbxldown0, qcmdncxw1);
            UgsYKJyU(jpbabivhk0, ovshasmtb1, ldeigbm2, ujuudgedwm3, duybcohdd4);
            ndgnMIUE(rfsfcdtie0, dthzsenehe1, hefhwib2, mpmkpulm3, zjlzedyn4);
            ndgnMIUE(rfsfcdtie0, dthzsenehe1, hefhwib2, mpmkpulm3, zjlzedyn4);
            jPuWMuei(qfqgrkbpki0, eirgxif1, rqdiotp2, nxhdzwn3);
            xqSmOXjN(lbxldown0, qcmdncxw1);
            channel.setLightColor(0);
            channel.setVibrationPattern(new long[] { 0L });
            ZMDOJBgU(lppuyxn0, ubeqcbnfvt1, skttvait2, zsbgyyw3, jbahzbupyf4);
            zNMddjKo(msbrinf0, mnzgafqqi1, bcfsoytke2, glakykht3, kqlkdrfst4);
            EPJIwNOr(vzsvbwfver0, esobnwuscz1);
            XdWsIzSP(pqyctzjh0, wzbbhpu1);
            UgsYKJyU(jpbabivhk0, ovshasmtb1, ldeigbm2, ujuudgedwm3, duybcohdd4);
            oCFdWgls(uvvmsggd0, zmobglgbis1);
            WGatsFIZ(usrfzspp0, shasclqw1, erytudbar2, tcnntlwc3);
            manager.createNotificationChannel(channel);
        }
        tkujeeVo(wqmepghgqm0, zbfjywkd1);
        ndgnMIUE(rfsfcdtie0, dthzsenehe1, hefhwib2, mpmkpulm3, zjlzedyn4);
        WzifEDaw(lizabpxqrp0, mahlizyxuv1, zafzmjxinu2, akfflnq3);
        ZMDOJBgU(lppuyxn0, ubeqcbnfvt1, skttvait2, zsbgyyw3, jbahzbupyf4);
        EPJIwNOr(vzsvbwfver0, esobnwuscz1);
        estniXwb(qmfnvnytii0, tntiyha1);
        EPJIwNOr(vzsvbwfver0, esobnwuscz1);
        WGatsFIZ(usrfzspp0, shasclqw1, erytudbar2, tcnntlwc3);
        WzifEDaw(lizabpxqrp0, mahlizyxuv1, zafzmjxinu2, akfflnq3);
        hFwwfLYs(lqswaageu0, atmvxkoy1, qgikpki2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(SimplyHouseworkrOrgManager.mContext, CHANNEL_ID1);
        RemoteViews remoteView = SimplyNtFgHelper.ongoingRemoteView();
        RemoteViews remoteViewBig = SimplyNtFgHelper.ongoingRemoteViewBig();
        if (VERSION.SDK_INT >= 31) {
            builder.setCustomContentView(remoteView);
            fNWclpYt(wgaeehpqz0, qfxuivood1, snoumuncy2, eflefxyoxf3);
            zNMddjKo(msbrinf0, mnzgafqqi1, bcfsoytke2, glakykht3, kqlkdrfst4);
            EPJIwNOr(vzsvbwfver0, esobnwuscz1);
            hbPCWEqx(xciemqqo0, ethtjtmlth1, rdmaytcy2, qdgrdsg3, jqgiecsxx4);
            xZdTYbLC(hciknwejei0, mzpdtrpg1);
            knltjdeK(avkiqfkx0, orklsepnlu1, isbehlz2, qrqtmvx3);
            wOWqHLiE(zrntsmqv0, ipuoaean1, vgttbpus2, gkbcvdyq3);
            UKlyMiXQ(uwqlcdxul0, wlenivbll1, gazvtxxhw2);
            builder.setContent(remoteView);
            wQszBjEQ(albovtbilc0, valnwfl1);
            KyLYImOw(ndasnln0);
            EPJIwNOr(vzsvbwfver0, esobnwuscz1);
            SGNiMNkG(nkxcacv0, kmkeduntlw1, olireumir2, etcxeywdw3, wateltsowy4);
            tkujeeVo(wqmepghgqm0, zbfjywkd1);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        UKlyMiXQ(uwqlcdxul0, wlenivbll1, gazvtxxhw2);
        wOWqHLiE(zrntsmqv0, ipuoaean1, vgttbpus2, gkbcvdyq3);
        zrjuYndm(dcutqxyb0, nzyopkeo1, borryew2, bjjrubdy3, faifytwhz4);
        RbpTCnNv(xqugava0, bqlmfoke1, mublejpxau2, rjcbucxx3);
        ZvIWNUaJ(eypmdwhqx0);
        jPuWMuei(qfqgrkbpki0, eirgxif1, rqdiotp2, nxhdzwn3);
        GyMZhqVE(nhekwlc0);
        Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setSmallIcon(R.mipmap.simply_logo).setShowWhen(true).setOngoing(true).setSound((Uri) null).setNumber(5).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound((Uri) null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
        zNMddjKo(msbrinf0, mnzgafqqi1, bcfsoytke2, glakykht3, kqlkdrfst4);
        UgsYKJyU(jpbabivhk0, ovshasmtb1, ldeigbm2, ujuudgedwm3, duybcohdd4);
        ojUbWSUB(iufyjsjusn0);
        notification.flags = 32;
        QZbHpkLg(ydwriybkz0, gcvdvyagdj1, hbnhoywozo2);
        UgsYKJyU(jpbabivhk0, ovshasmtb1, ldeigbm2, ujuudgedwm3, duybcohdd4);
        hFwwfLYs(lqswaageu0, atmvxkoy1, qgikpki2);
        zrjuYndm(dcutqxyb0, nzyopkeo1, borryew2, bjjrubdy3, faifytwhz4);
        estniXwb(qmfnvnytii0, tntiyha1);
        xZdTYbLC(hciknwejei0, mzpdtrpg1);
        jPuWMuei(qfqgrkbpki0, eirgxif1, rqdiotp2, nxhdzwn3);
        zNMddjKo(msbrinf0, mnzgafqqi1, bcfsoytke2, glakykht3, kqlkdrfst4);
        wOWqHLiE(zrntsmqv0, ipuoaean1, vgttbpus2, gkbcvdyq3);
        return notification;
    }

    //垃圾变量
    private long oYZQyWx = 80L;

    //垃圾变量
    private boolean eKEGaZf = true;

    //垃圾变量
    private char KAXOmYM = 98;

    //垃圾变量
    private boolean hoZUavs = true;

    //垃圾方法
    private void bcIWwyvR(char fadkizpe0) {
        char fadkizpe0a = fadkizpe0;
        System.out.println("bcIWwyvR" + fadkizpe0a + "bcIWwyvR" + Lwfndou + KAXOmYM + suwZmUk + jgzuWoA + frjvUhI + oYZQyWx + CDLkKaQ + "");
    }

    //垃圾方法
    private void ObXXBwKT(boolean tkelhjv0, short kgdmqkj1, double isuevltdu2, int jrdbuke3, short hxtmvlw4) {
        short hxtmvlw4a = hxtmvlw4;
        int jrdbuke3a = jrdbuke3;
        double isuevltdu2a = isuevltdu2;
        short kgdmqkj1a = kgdmqkj1;
        boolean tkelhjv0a = tkelhjv0;
        new StringReader("ObXXBwKT" + tkelhjv0a + jrdbuke3a + kgdmqkj1a + hxtmvlw4a + isuevltdu2a + "ObXXBwKT" + oYZQyWx + jgzuWoA + KAXOmYM + CDLkKaQ + suwZmUk + frjvUhI + Lwfndou + "");
    }

    //垃圾方法
    private void rgMQLwaK(double lbtowgp0) {
        double lbtowgp0a = lbtowgp0;
        TextUtils.isEmpty("rgMQLwaK" + lbtowgp0a + "rgMQLwaK" + Lwfndou + jgzuWoA + CDLkKaQ + KAXOmYM + oYZQyWx + frjvUhI + suwZmUk + "");
    }

    //垃圾方法
    private void QSKmSgfv(double awimppivg0, byte rqixopyizf1) {
        byte rqixopyizf1a = rqixopyizf1;
        double awimppivg0a = awimppivg0;
        TextUtils.isEmpty("QSKmSgfv" + rqixopyizf1a + awimppivg0a + "QSKmSgfv" + Lwfndou + frjvUhI + CDLkKaQ + KAXOmYM + oYZQyWx + suwZmUk + jgzuWoA + "");
    }

    //垃圾方法
    private void GNUFxyyZ(short edvdkaspbg0, double vwqsgexu1) {
        double vwqsgexu1a = vwqsgexu1;
        short edvdkaspbg0a = edvdkaspbg0;
        Log.e("GNUFxyyZ", "GNUFxyyZ" + edvdkaspbg0a + vwqsgexu1a + "GNUFxyyZ" + Lwfndou + KAXOmYM + jgzuWoA + frjvUhI + CDLkKaQ + suwZmUk + oYZQyWx + "");
    }

    //垃圾方法
    private void tuYvDUYE(char enyymuinm0, short dytjxjj1) {
        short dytjxjj1a = dytjxjj1;
        char enyymuinm0a = enyymuinm0;
        TextUtils.isDigitsOnly("tuYvDUYE" + enyymuinm0a + dytjxjj1a + "tuYvDUYE" + CDLkKaQ + suwZmUk + Lwfndou + oYZQyWx + KAXOmYM + frjvUhI + jgzuWoA + "");
    }

    //垃圾方法
    private void WdvrlJlO(boolean lnkbgjclr0, boolean kandexi1, int bcmczoigr2, byte gnywvjpx3, int jdmunome4) {
        int jdmunome4a = jdmunome4;
        byte gnywvjpx3a = gnywvjpx3;
        int bcmczoigr2a = bcmczoigr2;
        boolean kandexi1a = kandexi1;
        boolean lnkbgjclr0a = lnkbgjclr0;
        TextUtils.isEmpty("WdvrlJlO" + bcmczoigr2a + gnywvjpx3a + kandexi1a + jdmunome4a + lnkbgjclr0a + "WdvrlJlO" + suwZmUk + KAXOmYM + oYZQyWx + Lwfndou + CDLkKaQ + jgzuWoA + frjvUhI + "");
    }

    //垃圾方法
    private void wWIClICa(double qfukbsl0, char cruytdro1) {
        char cruytdro1a = cruytdro1;
        double qfukbsl0a = qfukbsl0;
        new StringBuilder("wWIClICa" + cruytdro1a + qfukbsl0a + "wWIClICa" + suwZmUk + frjvUhI + oYZQyWx + CDLkKaQ + jgzuWoA + Lwfndou + KAXOmYM + "");
    }

    public boolean equals(Object obj) {
        char cruytdro1 = 40;
        double qfukbsl0 = 75.75;
        int jdmunome4 = 62;
        byte gnywvjpx3 = 50;
        int bcmczoigr2 = 85;
        boolean kandexi1 = false;
        boolean lnkbgjclr0 = true;
        short dytjxjj1 = 7;
        char enyymuinm0 = 47;
        double vwqsgexu1 = 39.39;
        short edvdkaspbg0 = 60;
        byte rqixopyizf1 = 44;
        double awimppivg0 = 99.99;
        double lbtowgp0 = 18.18;
        short hxtmvlw4 = 19;
        int jrdbuke3 = 14;
        double isuevltdu2 = 26.26;
        short kgdmqkj1 = 38;
        boolean tkelhjv0 = false;
        char fadkizpe0 = 97;
        new String("" + hoZUavs + eKEGaZf + "");
        tuYvDUYE(enyymuinm0, dytjxjj1);
        tuYvDUYE(enyymuinm0, dytjxjj1);
        rgMQLwaK(lbtowgp0);
        bcIWwyvR(fadkizpe0);
        tuYvDUYE(enyymuinm0, dytjxjj1);
        wWIClICa(qfukbsl0, cruytdro1);
        wWIClICa(qfukbsl0, cruytdro1);
        WdvrlJlO(lnkbgjclr0, kandexi1, bcmczoigr2, gnywvjpx3, jdmunome4);
        wWIClICa(qfukbsl0, cruytdro1);
        return super.equals(obj);
    }
}
