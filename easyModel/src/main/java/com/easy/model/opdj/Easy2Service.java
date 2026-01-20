package com.easy.model.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.easy.IProcessServiceEasy;
import com.easy.model.EasyManager;
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

public class Easy2Service extends Service {

    //垃圾变量
    private char ojyKxzc = 3;

    String TAG = "xxx";

    //垃圾变量
    private float cKfFktT = 95.95f;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private long vWVCRiN = 11L;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private float BndElvX = 69.69f;

    public static Boolean isLiving = false;

    //垃圾变量
    private short tTtCIOC = 45;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private byte vOOSbHl = 36;

    private static long delayTime = 250L;

    //垃圾变量
    private boolean xyLHBOd = false;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private double OHoEUyX = 36.36;

    public static boolean isStartService = false;

    //垃圾变量
    private float ARkDNxZ = 40.40f;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (EasyManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private long ORTFtRm = 79L;

    int nextNum = -1;

    //垃圾变量
    private float afRxktY = 49.49f;

    private static IBinder mainBinder = null;

    public Easy2Service() {
    }

    //垃圾方法
    private void traeKgOx(float tvjlfaouhw0, double vgihcqwrlc1, char cfhcqdpdh2, boolean tnpcyajf3) {
        boolean tnpcyajf3a = tnpcyajf3;
        char cfhcqdpdh2a = cfhcqdpdh2;
        double vgihcqwrlc1a = vgihcqwrlc1;
        float tvjlfaouhw0a = tvjlfaouhw0;
        Log.i("traeKgOx", "traeKgOx" + tvjlfaouhw0a + tnpcyajf3a + vgihcqwrlc1a + cfhcqdpdh2a + "traeKgOx" + BndElvX + ORTFtRm + ARkDNxZ + uawTFGX + xyLHBOd + vOOSbHl + cKfFktT + htlHTfa + SMAbQWL + vWVCRiN + afRxktY + udfwOEu + tTtCIOC + ojyKxzc + qdqngus + sZgxsqF + OHoEUyX + "");
    }

    //垃圾方法
    private void ewpAalHN(int swrcykbnv0) {
        int swrcykbnv0a = swrcykbnv0;
        TextUtils.isEmpty("ewpAalHN" + swrcykbnv0a + "ewpAalHN" + cKfFktT + sZgxsqF + OHoEUyX + ORTFtRm + BndElvX + qdqngus + ARkDNxZ + tTtCIOC + SMAbQWL + afRxktY + htlHTfa + vOOSbHl + vWVCRiN + uawTFGX + xyLHBOd + udfwOEu + ojyKxzc + "");
    }

    //垃圾方法
    private void EKKOgcEC(float pjwpnsbp0) {
        float pjwpnsbp0a = pjwpnsbp0;
        new String("EKKOgcEC" + pjwpnsbp0a + "EKKOgcEC" + afRxktY + ORTFtRm + OHoEUyX + sZgxsqF + vWVCRiN + BndElvX + ojyKxzc + qdqngus + xyLHBOd + vOOSbHl + ARkDNxZ + cKfFktT + udfwOEu + htlHTfa + tTtCIOC + uawTFGX + SMAbQWL + "");
    }

    //垃圾方法
    private void cOniAsOm(double akqyivassm0, int yvspykkgn1, long efwxzwh2) {
        long efwxzwh2a = efwxzwh2;
        int yvspykkgn1a = yvspykkgn1;
        double akqyivassm0a = akqyivassm0;
        TextUtils.isDigitsOnly("cOniAsOm" + efwxzwh2a + akqyivassm0a + yvspykkgn1a + "cOniAsOm" + cKfFktT + afRxktY + htlHTfa + ojyKxzc + SMAbQWL + qdqngus + ARkDNxZ + vOOSbHl + vWVCRiN + xyLHBOd + OHoEUyX + BndElvX + sZgxsqF + tTtCIOC + ORTFtRm + udfwOEu + uawTFGX + "");
    }

    //垃圾方法
    private void YxCxWCGo(int yumdwuz0, float uuipecxhzh1, char hciyvaelq2, double nctznybl3) {
        double nctznybl3a = nctznybl3;
        char hciyvaelq2a = hciyvaelq2;
        float uuipecxhzh1a = uuipecxhzh1;
        int yumdwuz0a = yumdwuz0;
        Log.e("YxCxWCGo", "YxCxWCGo" + uuipecxhzh1a + nctznybl3a + hciyvaelq2a + yumdwuz0a + "YxCxWCGo" + ARkDNxZ + udfwOEu + cKfFktT + ojyKxzc + vOOSbHl + BndElvX + htlHTfa + tTtCIOC + ORTFtRm + xyLHBOd + vWVCRiN + sZgxsqF + SMAbQWL + uawTFGX + qdqngus + OHoEUyX + afRxktY + "");
    }

    //垃圾方法
    private void xaEPxykB(int kkgcvkkih0) {
        int kkgcvkkih0a = kkgcvkkih0;
        TextUtils.isDigitsOnly("xaEPxykB" + kkgcvkkih0a + "xaEPxykB" + SMAbQWL + BndElvX + qdqngus + xyLHBOd + ARkDNxZ + OHoEUyX + vOOSbHl + vWVCRiN + ORTFtRm + cKfFktT + ojyKxzc + udfwOEu + afRxktY + uawTFGX + htlHTfa + sZgxsqF + tTtCIOC + "");
    }

    //垃圾方法
    private void aqqzbVIa(byte gfuuqmdkso0, char wtqbofr1) {
        char wtqbofr1a = wtqbofr1;
        byte gfuuqmdkso0a = gfuuqmdkso0;
        new String("aqqzbVIa" + gfuuqmdkso0a + wtqbofr1a + "aqqzbVIa" + uawTFGX + htlHTfa + tTtCIOC + vWVCRiN + ARkDNxZ + OHoEUyX + cKfFktT + udfwOEu + afRxktY + ojyKxzc + vOOSbHl + qdqngus + sZgxsqF + ORTFtRm + BndElvX + xyLHBOd + SMAbQWL + "");
    }

    //垃圾方法
    private void xbrDKlCh(byte ebqumpjz0, float kchyntisx1, byte lavlmvnxzh2, byte ftyrtpg3, byte rnjbiei4) {
        byte rnjbiei4a = rnjbiei4;
        byte ftyrtpg3a = ftyrtpg3;
        byte lavlmvnxzh2a = lavlmvnxzh2;
        float kchyntisx1a = kchyntisx1;
        byte ebqumpjz0a = ebqumpjz0;
        Log.i("xbrDKlCh", "xbrDKlCh" + rnjbiei4a + lavlmvnxzh2a + ebqumpjz0a + ftyrtpg3a + kchyntisx1a + "xbrDKlCh" + uawTFGX + ORTFtRm + ojyKxzc + tTtCIOC + xyLHBOd + qdqngus + vWVCRiN + afRxktY + cKfFktT + ARkDNxZ + udfwOEu + vOOSbHl + SMAbQWL + sZgxsqF + BndElvX + OHoEUyX + htlHTfa + "");
    }

    //垃圾方法
    private void xUMzjnCT(boolean xqzjkjwwx0, char bzuyrujmn1, short gpticdjy2) {
        short gpticdjy2a = gpticdjy2;
        char bzuyrujmn1a = bzuyrujmn1;
        boolean xqzjkjwwx0a = xqzjkjwwx0;
    }

    //垃圾方法
    private void EmnqHTRt(double cvccdgfnmo0, float putsnwsvp1, double xgmvgxulmr2, byte zmqixuyhi3, double dalrsmd4) {
        double dalrsmd4a = dalrsmd4;
        byte zmqixuyhi3a = zmqixuyhi3;
        double xgmvgxulmr2a = xgmvgxulmr2;
        float putsnwsvp1a = putsnwsvp1;
        double cvccdgfnmo0a = cvccdgfnmo0;
        new String("EmnqHTRt" + dalrsmd4a + putsnwsvp1a + zmqixuyhi3a + cvccdgfnmo0a + xgmvgxulmr2a + "EmnqHTRt" + OHoEUyX + qdqngus + cKfFktT + ARkDNxZ + afRxktY + uawTFGX + SMAbQWL + ORTFtRm + ojyKxzc + sZgxsqF + xyLHBOd + vOOSbHl + tTtCIOC + htlHTfa + vWVCRiN + udfwOEu + BndElvX + "");
    }

    //垃圾方法
    private void ovUPJjXN(double kdqvvcheva0, byte dnnrwjt1, byte ledwdxvqdm2, float obpwsouio3, boolean lmrkzmuum4) {
        boolean lmrkzmuum4a = lmrkzmuum4;
        float obpwsouio3a = obpwsouio3;
        byte ledwdxvqdm2a = ledwdxvqdm2;
        byte dnnrwjt1a = dnnrwjt1;
        double kdqvvcheva0a = kdqvvcheva0;
        System.out.println("ovUPJjXN" + kdqvvcheva0a + ledwdxvqdm2a + obpwsouio3a + dnnrwjt1a + lmrkzmuum4a + "ovUPJjXN" + afRxktY + SMAbQWL + ojyKxzc + ARkDNxZ + tTtCIOC + sZgxsqF + htlHTfa + cKfFktT + vWVCRiN + vOOSbHl + ORTFtRm + OHoEUyX + qdqngus + xyLHBOd + BndElvX + udfwOEu + uawTFGX + "");
    }

    //垃圾方法
    private void gLMLTVCJ(byte mwcxdtjbc0, short gvwvrxg1) {
        short gvwvrxg1a = gvwvrxg1;
        byte mwcxdtjbc0a = mwcxdtjbc0;
        new StringReader("gLMLTVCJ" + mwcxdtjbc0a + gvwvrxg1a + "gLMLTVCJ" + qdqngus + ARkDNxZ + ORTFtRm + uawTFGX + xyLHBOd + ojyKxzc + cKfFktT + tTtCIOC + OHoEUyX + vOOSbHl + udfwOEu + vWVCRiN + BndElvX + sZgxsqF + SMAbQWL + htlHTfa + afRxktY + "");
    }

    //垃圾方法
    private void mgHhPwEH(short alpsrsh0, boolean rmckxesmln1) {
        boolean rmckxesmln1a = rmckxesmln1;
        short alpsrsh0a = alpsrsh0;
        new Thread("mgHhPwEH" + rmckxesmln1a + alpsrsh0a + "mgHhPwEH" + cKfFktT + sZgxsqF + ARkDNxZ + xyLHBOd + ORTFtRm + uawTFGX + ojyKxzc + afRxktY + BndElvX + qdqngus + vWVCRiN + htlHTfa + SMAbQWL + udfwOEu + OHoEUyX + tTtCIOC + vOOSbHl + "");
    }

    //垃圾方法
    private void oAONvmTS(char tmlropju0, float bwqzngk1, long fliflqtw2, int htlcdpod3, byte ndnkryka4) {
        byte ndnkryka4a = ndnkryka4;
        int htlcdpod3a = htlcdpod3;
        long fliflqtw2a = fliflqtw2;
        float bwqzngk1a = bwqzngk1;
        char tmlropju0a = tmlropju0;
        Log.e("oAONvmTS", "oAONvmTS" + bwqzngk1a + fliflqtw2a + htlcdpod3a + tmlropju0a + ndnkryka4a + "oAONvmTS" + vOOSbHl + BndElvX + cKfFktT + qdqngus + uawTFGX + htlHTfa + udfwOEu + xyLHBOd + ARkDNxZ + tTtCIOC + OHoEUyX + ORTFtRm + vWVCRiN + sZgxsqF + SMAbQWL + afRxktY + ojyKxzc + "");
    }

    //垃圾方法
    private void IRmJdsoE(byte osdgceh0, int sfwwelq1, double anyikvtuo2, short tzcdhgcxbb3, double jbaarjo4) {
        double jbaarjo4a = jbaarjo4;
        short tzcdhgcxbb3a = tzcdhgcxbb3;
        double anyikvtuo2a = anyikvtuo2;
        int sfwwelq1a = sfwwelq1;
        byte osdgceh0a = osdgceh0;
        Log.e("IRmJdsoE", "IRmJdsoE" + sfwwelq1a + jbaarjo4a + osdgceh0a + tzcdhgcxbb3a + anyikvtuo2a + "IRmJdsoE" + cKfFktT + ARkDNxZ + vOOSbHl + OHoEUyX + ojyKxzc + qdqngus + xyLHBOd + tTtCIOC + uawTFGX + udfwOEu + afRxktY + BndElvX + sZgxsqF + vWVCRiN + ORTFtRm + SMAbQWL + htlHTfa + "");
    }

    //垃圾方法
    private void OMeChIXJ(byte rzhwofcuhb0, byte sanmwaj1, char erkdjswp2) {
        char erkdjswp2a = erkdjswp2;
        byte sanmwaj1a = sanmwaj1;
        byte rzhwofcuhb0a = rzhwofcuhb0;
        new String("OMeChIXJ" + sanmwaj1a + erkdjswp2a + rzhwofcuhb0a + "OMeChIXJ" + OHoEUyX + SMAbQWL + tTtCIOC + uawTFGX + ARkDNxZ + vOOSbHl + ojyKxzc + udfwOEu + xyLHBOd + BndElvX + vWVCRiN + cKfFktT + afRxktY + htlHTfa + ORTFtRm + sZgxsqF + qdqngus + "");
    }

    //垃圾方法
    private void IDVTIpZt(boolean cyzzdympd0, byte uslbuvs1) {
        byte uslbuvs1a = uslbuvs1;
        boolean cyzzdympd0a = cyzzdympd0;
        new String("IDVTIpZt" + cyzzdympd0a + uslbuvs1a + "IDVTIpZt" + tTtCIOC + htlHTfa + BndElvX + afRxktY + udfwOEu + vOOSbHl + SMAbQWL + uawTFGX + sZgxsqF + ORTFtRm + cKfFktT + qdqngus + xyLHBOd + vWVCRiN + ARkDNxZ + ojyKxzc + OHoEUyX + "");
    }

    //垃圾方法
    private void bFdIJHVq(short xwlvprxwp0, long dnufkdxkp1) {
        long dnufkdxkp1a = dnufkdxkp1;
        short xwlvprxwp0a = xwlvprxwp0;
        new WeakReference("bFdIJHVq" + xwlvprxwp0a + dnufkdxkp1a + "bFdIJHVq" + htlHTfa + xyLHBOd + OHoEUyX + vWVCRiN + SMAbQWL + uawTFGX + sZgxsqF + tTtCIOC + udfwOEu + cKfFktT + vOOSbHl + afRxktY + ojyKxzc + BndElvX + ORTFtRm + ARkDNxZ + qdqngus + "");
    }

    //垃圾方法
    private void EJFuHcCv(byte epxkedj0, long vgtjpsd1, double gqxkgxohl2, float vtfcbyp3) {
        float vtfcbyp3a = vtfcbyp3;
        double gqxkgxohl2a = gqxkgxohl2;
        long vgtjpsd1a = vgtjpsd1;
        byte epxkedj0a = epxkedj0;
        new StringBuilder("EJFuHcCv" + gqxkgxohl2a + epxkedj0a + vtfcbyp3a + vgtjpsd1a + "EJFuHcCv" + cKfFktT + ojyKxzc + qdqngus + udfwOEu + htlHTfa + afRxktY + ORTFtRm + sZgxsqF + vOOSbHl + tTtCIOC + OHoEUyX + xyLHBOd + ARkDNxZ + BndElvX + SMAbQWL + vWVCRiN + uawTFGX + "");
    }

    //垃圾方法
    private void KJkQQuty(short smjlorjpvx0) {
        short smjlorjpvx0a = smjlorjpvx0;
        new StringBuffer("KJkQQuty" + smjlorjpvx0a + "KJkQQuty" + ARkDNxZ + cKfFktT + ORTFtRm + htlHTfa + BndElvX + SMAbQWL + ojyKxzc + sZgxsqF + xyLHBOd + qdqngus + OHoEUyX + udfwOEu + uawTFGX + vOOSbHl + afRxktY + tTtCIOC + vWVCRiN + "");
    }

    //垃圾方法
    private void MvITVBIJ(short gdfagtm0, int bfqfwroq1, float wcgscwqk2) {
        float wcgscwqk2a = wcgscwqk2;
        int bfqfwroq1a = bfqfwroq1;
        short gdfagtm0a = gdfagtm0;
        System.out.println("MvITVBIJ" + wcgscwqk2a + bfqfwroq1a + gdfagtm0a + "MvITVBIJ" + vOOSbHl + vWVCRiN + ORTFtRm + BndElvX + cKfFktT + afRxktY + ARkDNxZ + OHoEUyX + SMAbQWL + sZgxsqF + ojyKxzc + tTtCIOC + htlHTfa + qdqngus + udfwOEu + uawTFGX + xyLHBOd + "");
    }

    //垃圾方法
    private void AoCAdUrO(double sfkbtzos0, byte amzcrkp1) {
        byte amzcrkp1a = amzcrkp1;
        double sfkbtzos0a = sfkbtzos0;
    }

    //垃圾方法
    private void jHRYKCjG(float vakylxnm0, char qwvqxctss1, float johaslrgbk2, char hrhulchth3) {
        char hrhulchth3a = hrhulchth3;
        float johaslrgbk2a = johaslrgbk2;
        char qwvqxctss1a = qwvqxctss1;
        float vakylxnm0a = vakylxnm0;
        new Intent("jHRYKCjG" + vakylxnm0a + johaslrgbk2a + qwvqxctss1a + hrhulchth3a + "jHRYKCjG" + sZgxsqF + udfwOEu + uawTFGX + ORTFtRm + ojyKxzc + ARkDNxZ + cKfFktT + qdqngus + xyLHBOd + vWVCRiN + tTtCIOC + BndElvX + htlHTfa + afRxktY + vOOSbHl + SMAbQWL + OHoEUyX + "");
    }

    //垃圾方法
    private void KlTMYFUj(int hszjteqjb0, int ywxbrku1, boolean nljxiofsow2) {
        boolean nljxiofsow2a = nljxiofsow2;
        int ywxbrku1a = ywxbrku1;
        int hszjteqjb0a = hszjteqjb0;
    }

    //垃圾方法
    private void IPDErbzE(char cuuklrzmv0, long xgogzrp1) {
        long xgogzrp1a = xgogzrp1;
        char cuuklrzmv0a = cuuklrzmv0;
        Log.i("IPDErbzE", "IPDErbzE" + xgogzrp1a + cuuklrzmv0a + "IPDErbzE" + udfwOEu + afRxktY + qdqngus + uawTFGX + BndElvX + ORTFtRm + SMAbQWL + vWVCRiN + vOOSbHl + htlHTfa + ARkDNxZ + xyLHBOd + cKfFktT + OHoEUyX + ojyKxzc + sZgxsqF + tTtCIOC + "");
    }

    //垃圾方法
    private void usHRTYak(short xanlaep0, byte tqykwkn1, int nixxipxnz2, short igajtbu3) {
        short igajtbu3a = igajtbu3;
        int nixxipxnz2a = nixxipxnz2;
        byte tqykwkn1a = tqykwkn1;
        short xanlaep0a = xanlaep0;
        new String("usHRTYak" + xanlaep0a + tqykwkn1a + nixxipxnz2a + igajtbu3a + "usHRTYak" + uawTFGX + xyLHBOd + SMAbQWL + udfwOEu + ORTFtRm + BndElvX + vWVCRiN + sZgxsqF + ARkDNxZ + ojyKxzc + qdqngus + htlHTfa + cKfFktT + vOOSbHl + tTtCIOC + afRxktY + OHoEUyX + "");
    }

    //垃圾方法
    private void pECQOYIs(short qhympzcfd0, double znrrftsg1) {
        double znrrftsg1a = znrrftsg1;
        short qhympzcfd0a = qhympzcfd0;
        TextUtils.isEmpty("pECQOYIs" + znrrftsg1a + qhympzcfd0a + "pECQOYIs" + vOOSbHl + tTtCIOC + qdqngus + udfwOEu + SMAbQWL + ojyKxzc + ORTFtRm + htlHTfa + cKfFktT + afRxktY + OHoEUyX + BndElvX + uawTFGX + sZgxsqF + vWVCRiN + ARkDNxZ + xyLHBOd + "");
    }

    //垃圾方法
    private void KJerNKZA(long ywjxcjqjgh0, byte ivrdrrb1, byte kdzwuwjhfw2) {
        byte kdzwuwjhfw2a = kdzwuwjhfw2;
        byte ivrdrrb1a = ivrdrrb1;
        long ywjxcjqjgh0a = ywjxcjqjgh0;
        new File("KJerNKZA" + kdzwuwjhfw2a + ivrdrrb1a + ywjxcjqjgh0a + "KJerNKZA" + OHoEUyX + ORTFtRm + qdqngus + cKfFktT + tTtCIOC + BndElvX + afRxktY + SMAbQWL + sZgxsqF + uawTFGX + xyLHBOd + htlHTfa + ARkDNxZ + vWVCRiN + ojyKxzc + vOOSbHl + udfwOEu + "");
    }

    public void onCreate() {
        byte kdzwuwjhfw2 = 88;
        byte ivrdrrb1 = 71;
        long ywjxcjqjgh0 = 60L;
        double znrrftsg1 = 91.91;
        short qhympzcfd0 = 67;
        short igajtbu3 = 0;
        int nixxipxnz2 = 30;
        byte tqykwkn1 = 47;
        short xanlaep0 = 75;
        long xgogzrp1 = 72L;
        char cuuklrzmv0 = 86;
        boolean nljxiofsow2 = false;
        int ywxbrku1 = 85;
        int hszjteqjb0 = 72;
        char hrhulchth3 = 74;
        float johaslrgbk2 = 4.4f;
        char qwvqxctss1 = 31;
        float vakylxnm0 = 26.26f;
        byte amzcrkp1 = 78;
        double sfkbtzos0 = 44.44;
        float wcgscwqk2 = 66.66f;
        int bfqfwroq1 = 87;
        short gdfagtm0 = 33;
        short smjlorjpvx0 = 75;
        float vtfcbyp3 = 4.4f;
        double gqxkgxohl2 = 36.36;
        long vgtjpsd1 = 15L;
        byte epxkedj0 = 62;
        long dnufkdxkp1 = 30L;
        short xwlvprxwp0 = 22;
        byte uslbuvs1 = 63;
        boolean cyzzdympd0 = false;
        char erkdjswp2 = 31;
        byte sanmwaj1 = 21;
        byte rzhwofcuhb0 = 9;
        double jbaarjo4 = 55.55;
        short tzcdhgcxbb3 = 20;
        double anyikvtuo2 = 82.82;
        int sfwwelq1 = 46;
        byte osdgceh0 = 96;
        byte ndnkryka4 = 80;
        int htlcdpod3 = 67;
        long fliflqtw2 = 63L;
        float bwqzngk1 = 65.65f;
        char tmlropju0 = 55;
        boolean rmckxesmln1 = false;
        short alpsrsh0 = 81;
        short gvwvrxg1 = 7;
        byte mwcxdtjbc0 = 86;
        boolean lmrkzmuum4 = false;
        float obpwsouio3 = 13.13f;
        byte ledwdxvqdm2 = 41;
        byte dnnrwjt1 = 39;
        double kdqvvcheva0 = 19.19;
        double dalrsmd4 = 7.7;
        byte zmqixuyhi3 = 41;
        double xgmvgxulmr2 = 58.58;
        float putsnwsvp1 = 3.3f;
        double cvccdgfnmo0 = 22.22;
        short gpticdjy2 = 28;
        char bzuyrujmn1 = 59;
        boolean xqzjkjwwx0 = false;
        byte rnjbiei4 = 6;
        byte ftyrtpg3 = 92;
        byte lavlmvnxzh2 = 1;
        float kchyntisx1 = 19.19f;
        byte ebqumpjz0 = 36;
        char wtqbofr1 = 64;
        byte gfuuqmdkso0 = 25;
        int kkgcvkkih0 = 0;
        double nctznybl3 = 97.97;
        char hciyvaelq2 = 66;
        float uuipecxhzh1 = 88.88f;
        int yumdwuz0 = 6;
        long efwxzwh2 = 26L;
        int yvspykkgn1 = 57;
        double akqyivassm0 = 48.48;
        float pjwpnsbp0 = 64.64f;
        int swrcykbnv0 = 67;
        boolean tnpcyajf3 = true;
        char cfhcqdpdh2 = 89;
        double vgihcqwrlc1 = 84.84;
        float tvjlfaouhw0 = 3.3f;
        KJkQQuty(smjlorjpvx0);
        KJerNKZA(ywjxcjqjgh0, ivrdrrb1, kdzwuwjhfw2);
        OMeChIXJ(rzhwofcuhb0, sanmwaj1, erkdjswp2);
        xaEPxykB(kkgcvkkih0);
        ovUPJjXN(kdqvvcheva0, dnnrwjt1, ledwdxvqdm2, obpwsouio3, lmrkzmuum4);
        isLiving = true;
        traeKgOx(tvjlfaouhw0, vgihcqwrlc1, cfhcqdpdh2, tnpcyajf3);
        pECQOYIs(qhympzcfd0, znrrftsg1);
        xbrDKlCh(ebqumpjz0, kchyntisx1, lavlmvnxzh2, ftyrtpg3, rnjbiei4);
        AoCAdUrO(sfkbtzos0, amzcrkp1);
        gLMLTVCJ(mwcxdtjbc0, gvwvrxg1);
        ovUPJjXN(kdqvvcheva0, dnnrwjt1, ledwdxvqdm2, obpwsouio3, lmrkzmuum4);
        KlTMYFUj(hszjteqjb0, ywxbrku1, nljxiofsow2);
        gLMLTVCJ(mwcxdtjbc0, gvwvrxg1);
        YxCxWCGo(yumdwuz0, uuipecxhzh1, hciyvaelq2, nctznybl3);
        super.onCreate();
        if (EasyManager.isDebug) {
            IRmJdsoE(osdgceh0, sfwwelq1, anyikvtuo2, tzcdhgcxbb3, jbaarjo4);
            usHRTYak(xanlaep0, tqykwkn1, nixxipxnz2, igajtbu3);
            MvITVBIJ(gdfagtm0, bfqfwroq1, wcgscwqk2);
            bFdIJHVq(xwlvprxwp0, dnufkdxkp1);
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        this.mServiceBinder = new ServiceBinder(this);
        usHRTYak(xanlaep0, tqykwkn1, nixxipxnz2, igajtbu3);
        EKKOgcEC(pjwpnsbp0);
        IDVTIpZt(cyzzdympd0, uslbuvs1);
        traeKgOx(tvjlfaouhw0, vgihcqwrlc1, cfhcqdpdh2, tnpcyajf3);
        IPDErbzE(cuuklrzmv0, xgogzrp1);
        AoCAdUrO(sfkbtzos0, amzcrkp1);
        ovUPJjXN(kdqvvcheva0, dnnrwjt1, ledwdxvqdm2, obpwsouio3, lmrkzmuum4);
        AoCAdUrO(sfkbtzos0, amzcrkp1);
        jHRYKCjG(vakylxnm0, qwvqxctss1, johaslrgbk2, hrhulchth3);
        if (this.mRemoteServiceConn == null) {
            EKKOgcEC(pjwpnsbp0);
            pECQOYIs(qhympzcfd0, znrrftsg1);
            cOniAsOm(akqyivassm0, yvspykkgn1, efwxzwh2);
            MvITVBIJ(gdfagtm0, bfqfwroq1, wcgscwqk2);
            gLMLTVCJ(mwcxdtjbc0, gvwvrxg1);
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        xUMzjnCT(xqzjkjwwx0, bzuyrujmn1, gpticdjy2);
        traeKgOx(tvjlfaouhw0, vgihcqwrlc1, cfhcqdpdh2, tnpcyajf3);
        IPDErbzE(cuuklrzmv0, xgogzrp1);
        isReTryBinding = true;
        oAONvmTS(tmlropju0, bwqzngk1, fliflqtw2, htlcdpod3, ndnkryka4);
        ewpAalHN(swrcykbnv0);
        MvITVBIJ(gdfagtm0, bfqfwroq1, wcgscwqk2);
        bFdIJHVq(xwlvprxwp0, dnufkdxkp1);
        usHRTYak(xanlaep0, tqykwkn1, nixxipxnz2, igajtbu3);
        IRmJdsoE(osdgceh0, sfwwelq1, anyikvtuo2, tzcdhgcxbb3, jbaarjo4);
        this.startMainService(1, false);
    }

    //垃圾方法
    private void dRDBsdoG(float rvhquclfgn0) {
        float rvhquclfgn0a = rvhquclfgn0;
        new AttributedString("dRDBsdoG" + rvhquclfgn0a + "dRDBsdoG" + qdqngus + uawTFGX + ORTFtRm + udfwOEu + SMAbQWL + sZgxsqF + ARkDNxZ + xyLHBOd + BndElvX + ojyKxzc + OHoEUyX + vWVCRiN + htlHTfa + tTtCIOC + vOOSbHl + afRxktY + cKfFktT + "");
    }

    //垃圾方法
    private void YJMVVoXt(int bqaxgdpuib0, long sqyralg1) {
        long sqyralg1a = sqyralg1;
        int bqaxgdpuib0a = bqaxgdpuib0;
        Log.e("YJMVVoXt", "YJMVVoXt" + bqaxgdpuib0a + sqyralg1a + "YJMVVoXt" + SMAbQWL + sZgxsqF + afRxktY + cKfFktT + BndElvX + tTtCIOC + vWVCRiN + vOOSbHl + qdqngus + ojyKxzc + udfwOEu + ARkDNxZ + OHoEUyX + ORTFtRm + xyLHBOd + uawTFGX + htlHTfa + "");
    }

    //垃圾方法
    private void tccRTubO(short twmpsai0, short dniitjpr1, double luvjbppojh2, boolean rxtehled3) {
        boolean rxtehled3a = rxtehled3;
        double luvjbppojh2a = luvjbppojh2;
        short dniitjpr1a = dniitjpr1;
        short twmpsai0a = twmpsai0;
        new Intent("tccRTubO" + rxtehled3a + twmpsai0a + luvjbppojh2a + dniitjpr1a + "tccRTubO" + sZgxsqF + vOOSbHl + ARkDNxZ + htlHTfa + BndElvX + uawTFGX + vWVCRiN + cKfFktT + qdqngus + ojyKxzc + afRxktY + xyLHBOd + SMAbQWL + OHoEUyX + ORTFtRm + tTtCIOC + udfwOEu + "");
    }

    //垃圾方法
    private void wltoLIIq(long giwolabrbw0) {
        long giwolabrbw0a = giwolabrbw0;
        System.out.println("wltoLIIq" + giwolabrbw0a + "wltoLIIq" + qdqngus + cKfFktT + OHoEUyX + vWVCRiN + sZgxsqF + tTtCIOC + vOOSbHl + ORTFtRm + BndElvX + SMAbQWL + ojyKxzc + udfwOEu + htlHTfa + xyLHBOd + afRxktY + ARkDNxZ + uawTFGX + "");
    }

    //垃圾方法
    private void iCzYNCPW(int oadsiaer0, boolean fanbweil1, int ddmaveqzcm2, char xddpiokz3, long xjqvrlci4) {
        long xjqvrlci4a = xjqvrlci4;
        char xddpiokz3a = xddpiokz3;
        int ddmaveqzcm2a = ddmaveqzcm2;
        boolean fanbweil1a = fanbweil1;
        int oadsiaer0a = oadsiaer0;
        Log.e("iCzYNCPW", "iCzYNCPW" + ddmaveqzcm2a + oadsiaer0a + xjqvrlci4a + xddpiokz3a + fanbweil1a + "iCzYNCPW" + SMAbQWL + OHoEUyX + tTtCIOC + ojyKxzc + htlHTfa + xyLHBOd + sZgxsqF + qdqngus + vWVCRiN + BndElvX + afRxktY + cKfFktT + uawTFGX + vOOSbHl + ARkDNxZ + udfwOEu + ORTFtRm + "");
    }

    //垃圾方法
    private void wKlxinuE(char tzkeomwocp0, long dgtxhgiy1, short gbqybuv2, float iiklpmntr3) {
        float iiklpmntr3a = iiklpmntr3;
        short gbqybuv2a = gbqybuv2;
        long dgtxhgiy1a = dgtxhgiy1;
        char tzkeomwocp0a = tzkeomwocp0;
        new StringReader("wKlxinuE" + dgtxhgiy1a + tzkeomwocp0a + iiklpmntr3a + gbqybuv2a + "wKlxinuE" + htlHTfa + vWVCRiN + ORTFtRm + cKfFktT + SMAbQWL + udfwOEu + OHoEUyX + sZgxsqF + uawTFGX + tTtCIOC + afRxktY + xyLHBOd + vOOSbHl + BndElvX + ojyKxzc + ARkDNxZ + qdqngus + "");
    }

    //垃圾方法
    private void lfgkOwfs(short lszragqk0, boolean cqovhse1, int yzfohczkh2, boolean xwchpdtj3, float pzrcgvvgg4) {
        float pzrcgvvgg4a = pzrcgvvgg4;
        boolean xwchpdtj3a = xwchpdtj3;
        int yzfohczkh2a = yzfohczkh2;
        boolean cqovhse1a = cqovhse1;
        short lszragqk0a = lszragqk0;
        new StringReader("lfgkOwfs" + cqovhse1a + yzfohczkh2a + pzrcgvvgg4a + lszragqk0a + xwchpdtj3a + "lfgkOwfs" + OHoEUyX + ORTFtRm + htlHTfa + afRxktY + ojyKxzc + xyLHBOd + SMAbQWL + udfwOEu + ARkDNxZ + uawTFGX + sZgxsqF + BndElvX + vOOSbHl + cKfFktT + tTtCIOC + vWVCRiN + qdqngus + "");
    }

    //垃圾方法
    private void ebSdJkir(byte hnrkljzh0, long keqmuphzik1) {
        long keqmuphzik1a = keqmuphzik1;
        byte hnrkljzh0a = hnrkljzh0;
        new AttributedString("ebSdJkir" + hnrkljzh0a + keqmuphzik1a + "ebSdJkir" + SMAbQWL + ARkDNxZ + afRxktY + tTtCIOC + xyLHBOd + ojyKxzc + OHoEUyX + vWVCRiN + ORTFtRm + cKfFktT + uawTFGX + BndElvX + vOOSbHl + udfwOEu + sZgxsqF + htlHTfa + qdqngus + "");
    }

    //垃圾方法
    private void HyQZslCd(float qbxbtckitm0, boolean ocuyjzv1, float nobewdp2, long sbxjodz3, byte exbrkhmy4) {
        byte exbrkhmy4a = exbrkhmy4;
        long sbxjodz3a = sbxjodz3;
        float nobewdp2a = nobewdp2;
        boolean ocuyjzv1a = ocuyjzv1;
        float qbxbtckitm0a = qbxbtckitm0;
        new String("HyQZslCd" + sbxjodz3a + nobewdp2a + ocuyjzv1a + exbrkhmy4a + qbxbtckitm0a + "HyQZslCd" + qdqngus + tTtCIOC + cKfFktT + xyLHBOd + sZgxsqF + ARkDNxZ + vWVCRiN + BndElvX + vOOSbHl + uawTFGX + ojyKxzc + udfwOEu + OHoEUyX + afRxktY + htlHTfa + ORTFtRm + SMAbQWL + "");
    }

    //垃圾方法
    private void LnadshIX(short nyalpskw0, double xagzdbnms1, short cudpvevmqw2, byte bpjwopk3) {
        byte bpjwopk3a = bpjwopk3;
        short cudpvevmqw2a = cudpvevmqw2;
        double xagzdbnms1a = xagzdbnms1;
        short nyalpskw0a = nyalpskw0;
        TextUtils.isEmpty("LnadshIX" + xagzdbnms1a + nyalpskw0a + bpjwopk3a + cudpvevmqw2a + "LnadshIX" + qdqngus + OHoEUyX + ojyKxzc + htlHTfa + ORTFtRm + vWVCRiN + tTtCIOC + xyLHBOd + vOOSbHl + uawTFGX + cKfFktT + udfwOEu + SMAbQWL + ARkDNxZ + BndElvX + sZgxsqF + afRxktY + "");
    }

    //垃圾方法
    private void GGNKccDU(byte oghvjjcfun0) {
        byte oghvjjcfun0a = oghvjjcfun0;
        Log.i("GGNKccDU", "GGNKccDU" + oghvjjcfun0a + "GGNKccDU" + qdqngus + ORTFtRm + uawTFGX + cKfFktT + xyLHBOd + SMAbQWL + ojyKxzc + udfwOEu + sZgxsqF + tTtCIOC + vWVCRiN + OHoEUyX + ARkDNxZ + BndElvX + afRxktY + vOOSbHl + htlHTfa + "");
    }

    //垃圾方法
    private void ImcejIGY(boolean suzgbtfn0, boolean dyuasfjo1, double knzyzrgwha2, int kxxdpbbih3, int cvztusd4) {
        int cvztusd4a = cvztusd4;
        int kxxdpbbih3a = kxxdpbbih3;
        double knzyzrgwha2a = knzyzrgwha2;
        boolean dyuasfjo1a = dyuasfjo1;
        boolean suzgbtfn0a = suzgbtfn0;
        new StringBuilder("ImcejIGY" + dyuasfjo1a + suzgbtfn0a + knzyzrgwha2a + cvztusd4a + kxxdpbbih3a + "ImcejIGY" + ORTFtRm + ARkDNxZ + tTtCIOC + vWVCRiN + xyLHBOd + vOOSbHl + cKfFktT + sZgxsqF + ojyKxzc + udfwOEu + qdqngus + uawTFGX + BndElvX + htlHTfa + afRxktY + OHoEUyX + SMAbQWL + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        int cvztusd4 = 54;
        int kxxdpbbih3 = 78;
        double knzyzrgwha2 = 80.80;
        boolean dyuasfjo1 = true;
        boolean suzgbtfn0 = false;
        byte oghvjjcfun0 = 49;
        byte bpjwopk3 = 18;
        short cudpvevmqw2 = 91;
        double xagzdbnms1 = 60.60;
        short nyalpskw0 = 90;
        byte exbrkhmy4 = 55;
        long sbxjodz3 = 100L;
        float nobewdp2 = 56.56f;
        boolean ocuyjzv1 = false;
        float qbxbtckitm0 = 38.38f;
        long keqmuphzik1 = 80L;
        byte hnrkljzh0 = 63;
        float pzrcgvvgg4 = 33.33f;
        boolean xwchpdtj3 = false;
        int yzfohczkh2 = 46;
        boolean cqovhse1 = true;
        short lszragqk0 = 76;
        float iiklpmntr3 = 46.46f;
        short gbqybuv2 = 13;
        long dgtxhgiy1 = 76L;
        char tzkeomwocp0 = 20;
        long xjqvrlci4 = 98L;
        char xddpiokz3 = 77;
        int ddmaveqzcm2 = 7;
        boolean fanbweil1 = false;
        int oadsiaer0 = 45;
        long giwolabrbw0 = 50L;
        boolean rxtehled3 = false;
        double luvjbppojh2 = 89.89;
        short dniitjpr1 = 71;
        short twmpsai0 = 45;
        long sqyralg1 = 33L;
        int bqaxgdpuib0 = 23;
        float rvhquclfgn0 = 14.14f;
        GGNKccDU(oghvjjcfun0);
        YJMVVoXt(bqaxgdpuib0, sqyralg1);
        wltoLIIq(giwolabrbw0);
        wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
        wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
        iCzYNCPW(oadsiaer0, fanbweil1, ddmaveqzcm2, xddpiokz3, xjqvrlci4);
        wltoLIIq(giwolabrbw0);
        dRDBsdoG(rvhquclfgn0);
        GGNKccDU(oghvjjcfun0);
        wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
        if (intent != null) {
            ebSdJkir(hnrkljzh0, keqmuphzik1);
            YJMVVoXt(bqaxgdpuib0, sqyralg1);
            ebSdJkir(hnrkljzh0, keqmuphzik1);
            HyQZslCd(qbxbtckitm0, ocuyjzv1, nobewdp2, sbxjodz3, exbrkhmy4);
            wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
            ImcejIGY(suzgbtfn0, dyuasfjo1, knzyzrgwha2, kxxdpbbih3, cvztusd4);
            wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
            YJMVVoXt(bqaxgdpuib0, sqyralg1);
            wltoLIIq(giwolabrbw0);
            tccRTubO(twmpsai0, dniitjpr1, luvjbppojh2, rxtehled3);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        wltoLIIq(giwolabrbw0);
        LnadshIX(nyalpskw0, xagzdbnms1, cudpvevmqw2, bpjwopk3);
        lfgkOwfs(lszragqk0, cqovhse1, yzfohczkh2, xwchpdtj3, pzrcgvvgg4);
        ebSdJkir(hnrkljzh0, keqmuphzik1);
        wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
        wltoLIIq(giwolabrbw0);
        tccRTubO(twmpsai0, dniitjpr1, luvjbppojh2, rxtehled3);
        wKlxinuE(tzkeomwocp0, dgtxhgiy1, gbqybuv2, iiklpmntr3);
        if (EasyManager.isDebug) {
            wltoLIIq(giwolabrbw0);
            lfgkOwfs(lszragqk0, cqovhse1, yzfohczkh2, xwchpdtj3, pzrcgvvgg4);
            LnadshIX(nyalpskw0, xagzdbnms1, cudpvevmqw2, bpjwopk3);
            dRDBsdoG(rvhquclfgn0);
            LnadshIX(nyalpskw0, xagzdbnms1, cudpvevmqw2, bpjwopk3);
            YJMVVoXt(bqaxgdpuib0, sqyralg1);
            iCzYNCPW(oadsiaer0, fanbweil1, ddmaveqzcm2, xddpiokz3, xjqvrlci4);
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void mugwQppO(double cvpjyvrksl0, short wakqvcbdcx1, byte ekfsiwdgqx2, long kvcphpo3) {
        long kvcphpo3a = kvcphpo3;
        byte ekfsiwdgqx2a = ekfsiwdgqx2;
        short wakqvcbdcx1a = wakqvcbdcx1;
        double cvpjyvrksl0a = cvpjyvrksl0;
        new File("mugwQppO" + kvcphpo3a + ekfsiwdgqx2a + wakqvcbdcx1a + cvpjyvrksl0a + "mugwQppO" + SMAbQWL + OHoEUyX + ORTFtRm + vOOSbHl + afRxktY + tTtCIOC + BndElvX + vWVCRiN + ARkDNxZ + xyLHBOd + htlHTfa + uawTFGX + cKfFktT + sZgxsqF + qdqngus + ojyKxzc + udfwOEu + "");
    }

    //垃圾方法
    private void ViBQfhmY(double udvkgvter0, int yqqovnivh1, short wtnrdjoqpb2) {
        short wtnrdjoqpb2a = wtnrdjoqpb2;
        int yqqovnivh1a = yqqovnivh1;
        double udvkgvter0a = udvkgvter0;
        TextUtils.isEmpty("ViBQfhmY" + udvkgvter0a + wtnrdjoqpb2a + yqqovnivh1a + "ViBQfhmY" + SMAbQWL + ORTFtRm + sZgxsqF + ojyKxzc + xyLHBOd + ARkDNxZ + OHoEUyX + udfwOEu + cKfFktT + tTtCIOC + afRxktY + qdqngus + vWVCRiN + uawTFGX + vOOSbHl + BndElvX + htlHTfa + "");
    }

    //垃圾方法
    private void sqYhjcAD(boolean kvyaarm0, float rnbpadez1, boolean lrigiqxwue2) {
        boolean lrigiqxwue2a = lrigiqxwue2;
        float rnbpadez1a = rnbpadez1;
        boolean kvyaarm0a = kvyaarm0;
        Log.w("sqYhjcAD", "sqYhjcAD" + lrigiqxwue2a + rnbpadez1a + kvyaarm0a + "sqYhjcAD" + ojyKxzc + SMAbQWL + uawTFGX + xyLHBOd + vWVCRiN + sZgxsqF + qdqngus + htlHTfa + BndElvX + ORTFtRm + tTtCIOC + vOOSbHl + cKfFktT + udfwOEu + afRxktY + ARkDNxZ + OHoEUyX + "");
    }

    //垃圾方法
    private void iyLycUSR(boolean agzouxuruo0, double oajaermxkd1, int nqvyfstvqa2, short soqogifc3, float qzmmcgdgil4) {
        float qzmmcgdgil4a = qzmmcgdgil4;
        short soqogifc3a = soqogifc3;
        int nqvyfstvqa2a = nqvyfstvqa2;
        double oajaermxkd1a = oajaermxkd1;
        boolean agzouxuruo0a = agzouxuruo0;
        new StringBuffer("iyLycUSR" + agzouxuruo0a + oajaermxkd1a + soqogifc3a + nqvyfstvqa2a + qzmmcgdgil4a + "iyLycUSR" + ojyKxzc + sZgxsqF + vWVCRiN + htlHTfa + cKfFktT + afRxktY + SMAbQWL + vOOSbHl + tTtCIOC + udfwOEu + BndElvX + ARkDNxZ + OHoEUyX + ORTFtRm + xyLHBOd + uawTFGX + qdqngus + "");
    }

    //垃圾方法
    private void iQXaZnkf(short hralqcvh0) {
        short hralqcvh0a = hralqcvh0;
        Log.i("iQXaZnkf", "iQXaZnkf" + hralqcvh0a + "iQXaZnkf" + udfwOEu + OHoEUyX + qdqngus + uawTFGX + ORTFtRm + ARkDNxZ + vOOSbHl + SMAbQWL + tTtCIOC + BndElvX + afRxktY + vWVCRiN + sZgxsqF + cKfFktT + htlHTfa + ojyKxzc + xyLHBOd + "");
    }

    //垃圾方法
    private void bHLAstsh(byte opuhklfnm0) {
        byte opuhklfnm0a = opuhklfnm0;
        new StringReader("bHLAstsh" + opuhklfnm0a + "bHLAstsh" + SMAbQWL + htlHTfa + uawTFGX + BndElvX + OHoEUyX + xyLHBOd + ORTFtRm + sZgxsqF + afRxktY + udfwOEu + tTtCIOC + ojyKxzc + qdqngus + ARkDNxZ + vOOSbHl + cKfFktT + vWVCRiN + "");
    }

    //垃圾方法
    private void EquOlubc(long dvavsdkl0, byte cueybeyxmw1, byte meyccpakg2, byte jtfgfsnji3, short upaevod4) {
        short upaevod4a = upaevod4;
        byte jtfgfsnji3a = jtfgfsnji3;
        byte meyccpakg2a = meyccpakg2;
        byte cueybeyxmw1a = cueybeyxmw1;
        long dvavsdkl0a = dvavsdkl0;
        Log.e("EquOlubc", "EquOlubc" + upaevod4a + cueybeyxmw1a + meyccpakg2a + dvavsdkl0a + jtfgfsnji3a + "EquOlubc" + SMAbQWL + cKfFktT + ojyKxzc + vWVCRiN + uawTFGX + tTtCIOC + xyLHBOd + vOOSbHl + sZgxsqF + OHoEUyX + htlHTfa + ORTFtRm + udfwOEu + BndElvX + afRxktY + qdqngus + ARkDNxZ + "");
    }

    //垃圾方法
    private void xgdYlxln(boolean nkwhxqtvo0, boolean zlyeheny1) {
        boolean zlyeheny1a = zlyeheny1;
        boolean nkwhxqtvo0a = nkwhxqtvo0;
        new Intent("xgdYlxln" + zlyeheny1a + nkwhxqtvo0a + "xgdYlxln" + ARkDNxZ + vOOSbHl + sZgxsqF + OHoEUyX + ORTFtRm + SMAbQWL + vWVCRiN + htlHTfa + ojyKxzc + qdqngus + BndElvX + tTtCIOC + udfwOEu + xyLHBOd + cKfFktT + uawTFGX + afRxktY + "");
    }

    public boolean onUnbind(Intent intent) {
        boolean zlyeheny1 = false;
        boolean nkwhxqtvo0 = true;
        short upaevod4 = 69;
        byte jtfgfsnji3 = 21;
        byte meyccpakg2 = 78;
        byte cueybeyxmw1 = 4;
        long dvavsdkl0 = 11L;
        byte opuhklfnm0 = 16;
        short hralqcvh0 = 23;
        float qzmmcgdgil4 = 93.93f;
        short soqogifc3 = 79;
        int nqvyfstvqa2 = 8;
        double oajaermxkd1 = 64.64;
        boolean agzouxuruo0 = false;
        boolean lrigiqxwue2 = true;
        float rnbpadez1 = 55.55f;
        boolean kvyaarm0 = false;
        short wtnrdjoqpb2 = 40;
        int yqqovnivh1 = 54;
        double udvkgvter0 = 25.25;
        long kvcphpo3 = 9L;
        byte ekfsiwdgqx2 = 95;
        short wakqvcbdcx1 = 0;
        double cvpjyvrksl0 = 91.91;
        iyLycUSR(agzouxuruo0, oajaermxkd1, nqvyfstvqa2, soqogifc3, qzmmcgdgil4);
        mugwQppO(cvpjyvrksl0, wakqvcbdcx1, ekfsiwdgqx2, kvcphpo3);
        mugwQppO(cvpjyvrksl0, wakqvcbdcx1, ekfsiwdgqx2, kvcphpo3);
        mugwQppO(cvpjyvrksl0, wakqvcbdcx1, ekfsiwdgqx2, kvcphpo3);
        if (EasyManager.isDebug) {
            bHLAstsh(opuhklfnm0);
            EquOlubc(dvavsdkl0, cueybeyxmw1, meyccpakg2, jtfgfsnji3, upaevod4);
            bHLAstsh(opuhklfnm0);
            sqYhjcAD(kvyaarm0, rnbpadez1, lrigiqxwue2);
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        xgdYlxln(nkwhxqtvo0, zlyeheny1);
        mugwQppO(cvpjyvrksl0, wakqvcbdcx1, ekfsiwdgqx2, kvcphpo3);
        xgdYlxln(nkwhxqtvo0, zlyeheny1);
        iyLycUSR(agzouxuruo0, oajaermxkd1, nqvyfstvqa2, soqogifc3, qzmmcgdgil4);
        bHLAstsh(opuhklfnm0);
        xgdYlxln(nkwhxqtvo0, zlyeheny1);
        xgdYlxln(nkwhxqtvo0, zlyeheny1);
        iyLycUSR(agzouxuruo0, oajaermxkd1, nqvyfstvqa2, soqogifc3, qzmmcgdgil4);
        mugwQppO(cvpjyvrksl0, wakqvcbdcx1, ekfsiwdgqx2, kvcphpo3);
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void IPuGrMIQ(long ieagcyfwk0, float qtvdeniqf1, char skzukxcq2) {
        char skzukxcq2a = skzukxcq2;
        float qtvdeniqf1a = qtvdeniqf1;
        long ieagcyfwk0a = ieagcyfwk0;
    }

    //垃圾方法
    private void SSzAkatj(int dzydeqb0, double iazjjhdehx1) {
        double iazjjhdehx1a = iazjjhdehx1;
        int dzydeqb0a = dzydeqb0;
        new Intent("SSzAkatj" + dzydeqb0a + iazjjhdehx1a + "SSzAkatj" + cKfFktT + xyLHBOd + SMAbQWL + OHoEUyX + BndElvX + tTtCIOC + afRxktY + sZgxsqF + ARkDNxZ + vWVCRiN + vOOSbHl + uawTFGX + htlHTfa + udfwOEu + ojyKxzc + qdqngus + ORTFtRm + "");
    }

    //垃圾方法
    private void DcCulNJA(boolean driygsbq0, int nkqgcqgx1) {
        int nkqgcqgx1a = nkqgcqgx1;
        boolean driygsbq0a = driygsbq0;
        Log.i("DcCulNJA", "DcCulNJA" + nkqgcqgx1a + driygsbq0a + "DcCulNJA" + udfwOEu + SMAbQWL + cKfFktT + vOOSbHl + ARkDNxZ + sZgxsqF + xyLHBOd + vWVCRiN + tTtCIOC + ORTFtRm + ojyKxzc + uawTFGX + qdqngus + afRxktY + BndElvX + OHoEUyX + htlHTfa + "");
    }

    //垃圾方法
    private void fHSyuITO(double qddhinsae0, boolean dkvniemhyg1, byte mkescbuk2) {
        byte mkescbuk2a = mkescbuk2;
        boolean dkvniemhyg1a = dkvniemhyg1;
        double qddhinsae0a = qddhinsae0;
        new StringBuilder("fHSyuITO" + dkvniemhyg1a + qddhinsae0a + mkescbuk2a + "fHSyuITO" + htlHTfa + SMAbQWL + uawTFGX + tTtCIOC + afRxktY + cKfFktT + ojyKxzc + vWVCRiN + vOOSbHl + udfwOEu + ARkDNxZ + sZgxsqF + xyLHBOd + ORTFtRm + BndElvX + qdqngus + OHoEUyX + "");
    }

    //垃圾方法
    private void ArckRFPg(char yzziqwbc0, boolean vncgkrwpzm1) {
        boolean vncgkrwpzm1a = vncgkrwpzm1;
        char yzziqwbc0a = yzziqwbc0;
        TextUtils.isDigitsOnly("ArckRFPg" + vncgkrwpzm1a + yzziqwbc0a + "ArckRFPg" + sZgxsqF + tTtCIOC + BndElvX + qdqngus + afRxktY + xyLHBOd + vWVCRiN + uawTFGX + ARkDNxZ + ojyKxzc + htlHTfa + udfwOEu + vOOSbHl + OHoEUyX + ORTFtRm + cKfFktT + SMAbQWL + "");
    }

    //垃圾方法
    private void WaRfgZTG(byte iodkbqivr0, byte dokbxunt1, long amgnbhs2, byte qggitca3) {
        byte qggitca3a = qggitca3;
        long amgnbhs2a = amgnbhs2;
        byte dokbxunt1a = dokbxunt1;
        byte iodkbqivr0a = iodkbqivr0;
        TextUtils.isEmpty("WaRfgZTG" + dokbxunt1a + amgnbhs2a + iodkbqivr0a + qggitca3a + "WaRfgZTG" + ojyKxzc + htlHTfa + qdqngus + sZgxsqF + udfwOEu + vOOSbHl + vWVCRiN + xyLHBOd + SMAbQWL + ORTFtRm + cKfFktT + OHoEUyX + ARkDNxZ + tTtCIOC + BndElvX + uawTFGX + afRxktY + "");
    }

    //垃圾方法
    private void auxGyhyy(float wwoykhd0) {
        float wwoykhd0a = wwoykhd0;
        new AttributedString("auxGyhyy" + wwoykhd0a + "auxGyhyy" + vOOSbHl + qdqngus + ojyKxzc + udfwOEu + uawTFGX + afRxktY + vWVCRiN + OHoEUyX + sZgxsqF + htlHTfa + xyLHBOd + ARkDNxZ + tTtCIOC + BndElvX + cKfFktT + SMAbQWL + ORTFtRm + "");
    }

    //垃圾方法
    private void zYKNywTu(short ulqgvaflh0) {
        short ulqgvaflh0a = ulqgvaflh0;
        Log.e("zYKNywTu", "zYKNywTu" + ulqgvaflh0a + "zYKNywTu" + afRxktY + sZgxsqF + vOOSbHl + htlHTfa + ojyKxzc + uawTFGX + cKfFktT + xyLHBOd + OHoEUyX + qdqngus + SMAbQWL + ORTFtRm + BndElvX + ARkDNxZ + tTtCIOC + vWVCRiN + udfwOEu + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        short ulqgvaflh0 = 57;
        float wwoykhd0 = 94.94f;
        byte qggitca3 = 50;
        long amgnbhs2 = 40L;
        byte dokbxunt1 = 87;
        byte iodkbqivr0 = 86;
        boolean vncgkrwpzm1 = true;
        char yzziqwbc0 = 7;
        byte mkescbuk2 = 34;
        boolean dkvniemhyg1 = true;
        double qddhinsae0 = 47.47;
        int nkqgcqgx1 = 60;
        boolean driygsbq0 = true;
        double iazjjhdehx1 = 4.4;
        int dzydeqb0 = 14;
        char skzukxcq2 = 21;
        float qtvdeniqf1 = 48.48f;
        long ieagcyfwk0 = 70L;
        DcCulNJA(driygsbq0, nkqgcqgx1);
        fHSyuITO(qddhinsae0, dkvniemhyg1, mkescbuk2);
        fHSyuITO(qddhinsae0, dkvniemhyg1, mkescbuk2);
        WaRfgZTG(iodkbqivr0, dokbxunt1, amgnbhs2, qggitca3);
        DcCulNJA(driygsbq0, nkqgcqgx1);
        if (EasyManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        return this.mServiceBinder;
    }

    //垃圾方法
    private void VqPdhukp(char ywzgmuhwjd0, boolean toahnftw1, double rgezdvlc2, float ujxrwavu3, char qzgoblu4) {
        char qzgoblu4a = qzgoblu4;
        float ujxrwavu3a = ujxrwavu3;
        double rgezdvlc2a = rgezdvlc2;
        boolean toahnftw1a = toahnftw1;
        char ywzgmuhwjd0a = ywzgmuhwjd0;
        Log.w("VqPdhukp", "VqPdhukp" + ujxrwavu3a + qzgoblu4a + toahnftw1a + rgezdvlc2a + ywzgmuhwjd0a + "VqPdhukp" + tTtCIOC + htlHTfa + ARkDNxZ + vWVCRiN + qdqngus + ojyKxzc + afRxktY + sZgxsqF + cKfFktT + uawTFGX + SMAbQWL + OHoEUyX + ORTFtRm + xyLHBOd + udfwOEu + vOOSbHl + BndElvX + "");
    }

    //垃圾方法
    private void visvybuE(float rkzsfrsa0, int nibzopkmpk1) {
        int nibzopkmpk1a = nibzopkmpk1;
        float rkzsfrsa0a = rkzsfrsa0;
        new WeakReference("visvybuE" + nibzopkmpk1a + rkzsfrsa0a + "visvybuE" + xyLHBOd + udfwOEu + SMAbQWL + qdqngus + vWVCRiN + vOOSbHl + sZgxsqF + afRxktY + ojyKxzc + cKfFktT + tTtCIOC + BndElvX + htlHTfa + OHoEUyX + ORTFtRm + uawTFGX + ARkDNxZ + "");
    }

    //垃圾方法
    private void DprsJPgu(long tzmkzeziv0, int zftllwtg1, long hlyeadknm2, long vdwlwfcpc3, char mdxisbx4) {
        char mdxisbx4a = mdxisbx4;
        long vdwlwfcpc3a = vdwlwfcpc3;
        long hlyeadknm2a = hlyeadknm2;
        int zftllwtg1a = zftllwtg1;
        long tzmkzeziv0a = tzmkzeziv0;
    }

    //垃圾方法
    private void dxoZriWk(boolean csdlwdlxbq0, byte kegnfwwuu1, char bfgmalbgi2, boolean rfdbueb3, boolean lpgndqsnbr4) {
        boolean lpgndqsnbr4a = lpgndqsnbr4;
        boolean rfdbueb3a = rfdbueb3;
        char bfgmalbgi2a = bfgmalbgi2;
        byte kegnfwwuu1a = kegnfwwuu1;
        boolean csdlwdlxbq0a = csdlwdlxbq0;
        new String("dxoZriWk" + lpgndqsnbr4a + csdlwdlxbq0a + kegnfwwuu1a + rfdbueb3a + bfgmalbgi2a + "dxoZriWk" + ojyKxzc + qdqngus + ARkDNxZ + cKfFktT + udfwOEu + BndElvX + uawTFGX + tTtCIOC + xyLHBOd + htlHTfa + afRxktY + vOOSbHl + OHoEUyX + vWVCRiN + ORTFtRm + sZgxsqF + SMAbQWL + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        boolean lpgndqsnbr4 = true;
        boolean rfdbueb3 = true;
        char bfgmalbgi2 = 42;
        byte kegnfwwuu1 = 19;
        boolean csdlwdlxbq0 = true;
        char mdxisbx4 = 95;
        long vdwlwfcpc3 = 26L;
        long hlyeadknm2 = 59L;
        int zftllwtg1 = 38;
        long tzmkzeziv0 = 34L;
        int nibzopkmpk1 = 18;
        float rkzsfrsa0 = 18.18f;
        char qzgoblu4 = 48;
        float ujxrwavu3 = 31.31f;
        double rgezdvlc2 = 19.19;
        boolean toahnftw1 = false;
        char ywzgmuhwjd0 = 4;
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            if (EasyManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            dxoZriWk(csdlwdlxbq0, kegnfwwuu1, bfgmalbgi2, rfdbueb3, lpgndqsnbr4);
            visvybuE(rkzsfrsa0, nibzopkmpk1);
            VqPdhukp(ywzgmuhwjd0, toahnftw1, rgezdvlc2, ujxrwavu3, qzgoblu4);
            dxoZriWk(csdlwdlxbq0, kegnfwwuu1, bfgmalbgi2, rfdbueb3, lpgndqsnbr4);
            DprsJPgu(tzmkzeziv0, zftllwtg1, hlyeadknm2, vdwlwfcpc3, mdxisbx4);
            this.doStartMainService();
            VqPdhukp(ywzgmuhwjd0, toahnftw1, rgezdvlc2, ujxrwavu3, qzgoblu4);
            VqPdhukp(ywzgmuhwjd0, toahnftw1, rgezdvlc2, ujxrwavu3, qzgoblu4);
            dxoZriWk(csdlwdlxbq0, kegnfwwuu1, bfgmalbgi2, rfdbueb3, lpgndqsnbr4);
            DprsJPgu(tzmkzeziv0, zftllwtg1, hlyeadknm2, vdwlwfcpc3, mdxisbx4);
            visvybuE(rkzsfrsa0, nibzopkmpk1);
            VqPdhukp(ywzgmuhwjd0, toahnftw1, rgezdvlc2, ujxrwavu3, qzgoblu4);
            this.doBindMainService();
            DprsJPgu(tzmkzeziv0, zftllwtg1, hlyeadknm2, vdwlwfcpc3, mdxisbx4);
            visvybuE(rkzsfrsa0, nibzopkmpk1);
            dxoZriWk(csdlwdlxbq0, kegnfwwuu1, bfgmalbgi2, rfdbueb3, lpgndqsnbr4);
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                if (EasyManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void vKuhjhfp(int xnhqbnlxh0, boolean yhjarigz1, int ckqxttleht2, boolean dcnirmdml3, char jnhsysldcg4) {
        char jnhsysldcg4a = jnhsysldcg4;
        boolean dcnirmdml3a = dcnirmdml3;
        int ckqxttleht2a = ckqxttleht2;
        boolean yhjarigz1a = yhjarigz1;
        int xnhqbnlxh0a = xnhqbnlxh0;
        System.out.println("vKuhjhfp" + dcnirmdml3a + ckqxttleht2a + yhjarigz1a + xnhqbnlxh0a + jnhsysldcg4a + "vKuhjhfp" + ojyKxzc + uawTFGX + ARkDNxZ + afRxktY + htlHTfa + SMAbQWL + tTtCIOC + ORTFtRm + xyLHBOd + vWVCRiN + cKfFktT + qdqngus + OHoEUyX + BndElvX + sZgxsqF + vOOSbHl + udfwOEu + "");
    }

    //垃圾方法
    private void zEdvFiOo(char epcfvrzxw0, char qsvzfye1, int rurtargah2, float axdcyjgq3) {
        float axdcyjgq3a = axdcyjgq3;
        int rurtargah2a = rurtargah2;
        char qsvzfye1a = qsvzfye1;
        char epcfvrzxw0a = epcfvrzxw0;
        TextUtils.isDigitsOnly("zEdvFiOo" + rurtargah2a + axdcyjgq3a + epcfvrzxw0a + qsvzfye1a + "zEdvFiOo" + cKfFktT + ARkDNxZ + BndElvX + tTtCIOC + htlHTfa + vWVCRiN + afRxktY + SMAbQWL + ORTFtRm + vOOSbHl + uawTFGX + udfwOEu + qdqngus + OHoEUyX + xyLHBOd + sZgxsqF + ojyKxzc + "");
    }

    //垃圾方法
    private void AYbZolOs(short amlizeqe0, boolean bgclibbd1, short ucsmkhgfsk2, boolean qqbxdvjrx3, char dkrdxgq4) {
        char dkrdxgq4a = dkrdxgq4;
        boolean qqbxdvjrx3a = qqbxdvjrx3;
        short ucsmkhgfsk2a = ucsmkhgfsk2;
        boolean bgclibbd1a = bgclibbd1;
        short amlizeqe0a = amlizeqe0;
        new StringBuilder("AYbZolOs" + bgclibbd1a + ucsmkhgfsk2a + dkrdxgq4a + qqbxdvjrx3a + amlizeqe0a + "AYbZolOs" + SMAbQWL + vWVCRiN + uawTFGX + qdqngus + vOOSbHl + BndElvX + afRxktY + sZgxsqF + ORTFtRm + cKfFktT + ARkDNxZ + xyLHBOd + udfwOEu + OHoEUyX + ojyKxzc + tTtCIOC + htlHTfa + "");
    }

    //垃圾方法
    private void ricdGCVe(boolean arkmsfoq0, boolean umikumyet1, long wktoqphyt2, long yymmprn3) {
        long yymmprn3a = yymmprn3;
        long wktoqphyt2a = wktoqphyt2;
        boolean umikumyet1a = umikumyet1;
        boolean arkmsfoq0a = arkmsfoq0;
        new StringReader("ricdGCVe" + yymmprn3a + wktoqphyt2a + arkmsfoq0a + umikumyet1a + "ricdGCVe" + ARkDNxZ + qdqngus + BndElvX + OHoEUyX + afRxktY + udfwOEu + cKfFktT + ojyKxzc + SMAbQWL + xyLHBOd + sZgxsqF + vWVCRiN + vOOSbHl + uawTFGX + ORTFtRm + htlHTfa + tTtCIOC + "");
    }

    private void doStartMainService() {
        long yymmprn3 = 54L;
        long wktoqphyt2 = 56L;
        boolean umikumyet1 = false;
        boolean arkmsfoq0 = true;
        char dkrdxgq4 = 63;
        boolean qqbxdvjrx3 = false;
        short ucsmkhgfsk2 = 29;
        boolean bgclibbd1 = true;
        short amlizeqe0 = 59;
        float axdcyjgq3 = 97.97f;
        int rurtargah2 = 95;
        char qsvzfye1 = 18;
        char epcfvrzxw0 = 61;
        char jnhsysldcg4 = 95;
        boolean dcnirmdml3 = true;
        int ckqxttleht2 = 70;
        boolean yhjarigz1 = true;
        int xnhqbnlxh0 = 83;
        ricdGCVe(arkmsfoq0, umikumyet1, wktoqphyt2, yymmprn3);
        vKuhjhfp(xnhqbnlxh0, yhjarigz1, ckqxttleht2, dcnirmdml3, jnhsysldcg4);
        vKuhjhfp(xnhqbnlxh0, yhjarigz1, ckqxttleht2, dcnirmdml3, jnhsysldcg4);
        zEdvFiOo(epcfvrzxw0, qsvzfye1, rurtargah2, axdcyjgq3);
        try {
            zEdvFiOo(epcfvrzxw0, qsvzfye1, rurtargah2, axdcyjgq3);
            zEdvFiOo(epcfvrzxw0, qsvzfye1, rurtargah2, axdcyjgq3);
            vKuhjhfp(xnhqbnlxh0, yhjarigz1, ckqxttleht2, dcnirmdml3, jnhsysldcg4);
            vKuhjhfp(xnhqbnlxh0, yhjarigz1, ckqxttleht2, dcnirmdml3, jnhsysldcg4);
            zEdvFiOo(epcfvrzxw0, qsvzfye1, rurtargah2, axdcyjgq3);
            zEdvFiOo(epcfvrzxw0, qsvzfye1, rurtargah2, axdcyjgq3);
            AYbZolOs(amlizeqe0, bgclibbd1, ucsmkhgfsk2, qqbxdvjrx3, dkrdxgq4);
            AYbZolOs(amlizeqe0, bgclibbd1, ucsmkhgfsk2, qqbxdvjrx3, dkrdxgq4);
            zEdvFiOo(epcfvrzxw0, qsvzfye1, rurtargah2, axdcyjgq3);
            Intent intent = new Intent(this, Easy1Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (EasyManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾变量
    private byte uawTFGX = 38;

    // 绑定状态标志
    private boolean mIsBound = false;

    //垃圾方法
    private void BEPCLgmU(short qkoqvtk0) {
        short qkoqvtk0a = qkoqvtk0;
        Log.e("BEPCLgmU", "BEPCLgmU" + qkoqvtk0a + "BEPCLgmU" + tTtCIOC + uawTFGX + ARkDNxZ + udfwOEu + qdqngus + ojyKxzc + SMAbQWL + vOOSbHl + sZgxsqF + OHoEUyX + htlHTfa + BndElvX + ORTFtRm + vWVCRiN + afRxktY + xyLHBOd + cKfFktT + "");
    }

    //垃圾方法
    private void HnRexHJW(double logcvcg0, boolean uhivgecztr1) {
        boolean uhivgecztr1a = uhivgecztr1;
        double logcvcg0a = logcvcg0;
        new WeakReference("HnRexHJW" + logcvcg0a + uhivgecztr1a + "HnRexHJW" + sZgxsqF + udfwOEu + vOOSbHl + SMAbQWL + vWVCRiN + ojyKxzc + htlHTfa + OHoEUyX + BndElvX + ARkDNxZ + ORTFtRm + uawTFGX + qdqngus + afRxktY + xyLHBOd + cKfFktT + tTtCIOC + "");
    }

    //垃圾方法
    private void IkSRRodd(float nvxenytvw0, int ahbbyea1, double ibspxxnux2, boolean dxqqaxlfho3) {
        boolean dxqqaxlfho3a = dxqqaxlfho3;
        double ibspxxnux2a = ibspxxnux2;
        int ahbbyea1a = ahbbyea1;
        float nvxenytvw0a = nvxenytvw0;
        Log.e("IkSRRodd", "IkSRRodd" + ahbbyea1a + dxqqaxlfho3a + nvxenytvw0a + ibspxxnux2a + "IkSRRodd" + tTtCIOC + BndElvX + vWVCRiN + sZgxsqF + uawTFGX + OHoEUyX + vOOSbHl + udfwOEu + afRxktY + SMAbQWL + cKfFktT + xyLHBOd + ojyKxzc + ORTFtRm + ARkDNxZ + qdqngus + htlHTfa + "");
    }

    //垃圾方法
    private void QqdaxQJT(boolean mauijxqi0) {
        boolean mauijxqi0a = mauijxqi0;
        new Thread("QqdaxQJT" + mauijxqi0a + "QqdaxQJT" + OHoEUyX + ARkDNxZ + qdqngus + htlHTfa + xyLHBOd + ojyKxzc + udfwOEu + sZgxsqF + vOOSbHl + cKfFktT + tTtCIOC + ORTFtRm + uawTFGX + afRxktY + SMAbQWL + vWVCRiN + BndElvX + "");
    }

    //垃圾方法
    private void vJCmTpQH(short slmjjtnrcr0, short terkzxy1, char atqscrm2, boolean snxtrizj3, boolean bfmafntjcm4) {
        boolean bfmafntjcm4a = bfmafntjcm4;
        boolean snxtrizj3a = snxtrizj3;
        char atqscrm2a = atqscrm2;
        short terkzxy1a = terkzxy1;
        short slmjjtnrcr0a = slmjjtnrcr0;
        new AttributedString("vJCmTpQH" + bfmafntjcm4a + atqscrm2a + slmjjtnrcr0a + terkzxy1a + snxtrizj3a + "vJCmTpQH" + udfwOEu + vOOSbHl + SMAbQWL + qdqngus + afRxktY + cKfFktT + sZgxsqF + tTtCIOC + ojyKxzc + htlHTfa + vWVCRiN + uawTFGX + OHoEUyX + ORTFtRm + xyLHBOd + ARkDNxZ + BndElvX + "");
    }

    //垃圾方法
    private void UqilMaOZ(byte jsndjzkai0, boolean wymiwkrl1) {
        boolean wymiwkrl1a = wymiwkrl1;
        byte jsndjzkai0a = jsndjzkai0;
        TextUtils.isEmpty("UqilMaOZ" + jsndjzkai0a + wymiwkrl1a + "UqilMaOZ" + tTtCIOC + cKfFktT + vWVCRiN + qdqngus + uawTFGX + SMAbQWL + BndElvX + ARkDNxZ + ojyKxzc + ORTFtRm + OHoEUyX + udfwOEu + htlHTfa + vOOSbHl + sZgxsqF + xyLHBOd + afRxktY + "");
    }

    //垃圾方法
    private void ioiArTQj(short mkckjkbr0, boolean jmhhinz1, int yvcckokqux2, float fqqfxmcm3) {
        float fqqfxmcm3a = fqqfxmcm3;
        int yvcckokqux2a = yvcckokqux2;
        boolean jmhhinz1a = jmhhinz1;
        short mkckjkbr0a = mkckjkbr0;
        new StringBuffer("ioiArTQj" + fqqfxmcm3a + jmhhinz1a + yvcckokqux2a + mkckjkbr0a + "ioiArTQj" + vOOSbHl + uawTFGX + ojyKxzc + tTtCIOC + qdqngus + xyLHBOd + BndElvX + SMAbQWL + vWVCRiN + afRxktY + sZgxsqF + ORTFtRm + udfwOEu + ARkDNxZ + cKfFktT + htlHTfa + OHoEUyX + "");
    }

    //垃圾方法
    private void bxDzCxbF(float fobyobkmo0, long spwiodrvt1, int zxfpiwdm2, double rkzteszmm3) {
        double rkzteszmm3a = rkzteszmm3;
        int zxfpiwdm2a = zxfpiwdm2;
        long spwiodrvt1a = spwiodrvt1;
        float fobyobkmo0a = fobyobkmo0;
        TextUtils.isDigitsOnly("bxDzCxbF" + fobyobkmo0a + rkzteszmm3a + spwiodrvt1a + zxfpiwdm2a + "bxDzCxbF" + vOOSbHl + cKfFktT + BndElvX + htlHTfa + xyLHBOd + ojyKxzc + afRxktY + vWVCRiN + sZgxsqF + udfwOEu + ORTFtRm + qdqngus + OHoEUyX + tTtCIOC + SMAbQWL + ARkDNxZ + uawTFGX + "");
    }

    private void doBindMainService() {
        double rkzteszmm3 = 45.45;
        int zxfpiwdm2 = 96;
        long spwiodrvt1 = 31L;
        float fobyobkmo0 = 48.48f;
        float fqqfxmcm3 = 48.48f;
        int yvcckokqux2 = 27;
        boolean jmhhinz1 = false;
        short mkckjkbr0 = 92;
        boolean wymiwkrl1 = false;
        byte jsndjzkai0 = 1;
        boolean bfmafntjcm4 = false;
        boolean snxtrizj3 = true;
        char atqscrm2 = 65;
        short terkzxy1 = 81;
        short slmjjtnrcr0 = 3;
        boolean mauijxqi0 = true;
        boolean dxqqaxlfho3 = true;
        double ibspxxnux2 = 56.56;
        int ahbbyea1 = 65;
        float nvxenytvw0 = 17.17f;
        boolean uhivgecztr1 = true;
        double logcvcg0 = 29.29;
        short qkoqvtk0 = 18;
        if (EasyManager.isDebug) {
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        ioiArTQj(mkckjkbr0, jmhhinz1, yvcckokqux2, fqqfxmcm3);
        vJCmTpQH(slmjjtnrcr0, terkzxy1, atqscrm2, snxtrizj3, bfmafntjcm4);
        HnRexHJW(logcvcg0, uhivgecztr1);
        bxDzCxbF(fobyobkmo0, spwiodrvt1, zxfpiwdm2, rkzteszmm3);
        vJCmTpQH(slmjjtnrcr0, terkzxy1, atqscrm2, snxtrizj3, bfmafntjcm4);
        HnRexHJW(logcvcg0, uhivgecztr1);
        IkSRRodd(nvxenytvw0, ahbbyea1, ibspxxnux2, dxqqaxlfho3);
        bxDzCxbF(fobyobkmo0, spwiodrvt1, zxfpiwdm2, rkzteszmm3);
        QqdaxQJT(mauijxqi0);
        QqdaxQJT(mauijxqi0);
        try {
            mIsBound = this.bindService(new Intent(this, Easy1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (EasyManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void PdRwbLAc(float fkgpswah0, long clvealbtj1) {
        long clvealbtj1a = clvealbtj1;
        float fkgpswah0a = fkgpswah0;
        new StringBuilder("PdRwbLAc" + fkgpswah0a + clvealbtj1a + "PdRwbLAc" + ojyKxzc + vWVCRiN + BndElvX + OHoEUyX + cKfFktT + vOOSbHl + qdqngus + sZgxsqF + SMAbQWL + ARkDNxZ + xyLHBOd + ORTFtRm + udfwOEu + htlHTfa + uawTFGX + tTtCIOC + afRxktY + "");
    }

    //垃圾方法
    private void ZHoaODtG(short twzlsfxswn0, boolean sildyem1, float ijksckco2, float pexkbgqywe3, char dvvjzreb4) {
        char dvvjzreb4a = dvvjzreb4;
        float pexkbgqywe3a = pexkbgqywe3;
        float ijksckco2a = ijksckco2;
        boolean sildyem1a = sildyem1;
        short twzlsfxswn0a = twzlsfxswn0;
        Log.e("ZHoaODtG", "ZHoaODtG" + sildyem1a + pexkbgqywe3a + dvvjzreb4a + twzlsfxswn0a + ijksckco2a + "ZHoaODtG" + ARkDNxZ + BndElvX + afRxktY + tTtCIOC + ojyKxzc + ORTFtRm + xyLHBOd + uawTFGX + vOOSbHl + vWVCRiN + cKfFktT + udfwOEu + OHoEUyX + qdqngus + htlHTfa + SMAbQWL + sZgxsqF + "");
    }

    //垃圾方法
    private void DUkwmeKM(byte qwigzrmjp0, float cjvzgnpol1, char ogghxil2, short qdgthybrl3) {
        short qdgthybrl3a = qdgthybrl3;
        char ogghxil2a = ogghxil2;
        float cjvzgnpol1a = cjvzgnpol1;
        byte qwigzrmjp0a = qwigzrmjp0;
        new StringReader("DUkwmeKM" + qdgthybrl3a + cjvzgnpol1a + qwigzrmjp0a + ogghxil2a + "DUkwmeKM" + vWVCRiN + sZgxsqF + OHoEUyX + tTtCIOC + vOOSbHl + ORTFtRm + SMAbQWL + ARkDNxZ + cKfFktT + BndElvX + afRxktY + uawTFGX + udfwOEu + ojyKxzc + htlHTfa + qdqngus + xyLHBOd + "");
    }

    //垃圾方法
    private void ITPnWVDt(short zzytervxv0, char vkaneyasoo1, float xkqoemq2, int mvlnnecm3, char nwspxozs4) {
        char nwspxozs4a = nwspxozs4;
        int mvlnnecm3a = mvlnnecm3;
        float xkqoemq2a = xkqoemq2;
        char vkaneyasoo1a = vkaneyasoo1;
        short zzytervxv0a = zzytervxv0;
        new File("ITPnWVDt" + vkaneyasoo1a + nwspxozs4a + xkqoemq2a + mvlnnecm3a + zzytervxv0a + "ITPnWVDt" + udfwOEu + vWVCRiN + OHoEUyX + cKfFktT + xyLHBOd + tTtCIOC + SMAbQWL + ORTFtRm + ojyKxzc + vOOSbHl + BndElvX + qdqngus + afRxktY + sZgxsqF + ARkDNxZ + htlHTfa + uawTFGX + "");
    }

    //垃圾方法
    private void SuJydgAS(byte iehhlvrrqh0, byte xeqnbdn1, char szhdjqhp2) {
        char szhdjqhp2a = szhdjqhp2;
        byte xeqnbdn1a = xeqnbdn1;
        byte iehhlvrrqh0a = iehhlvrrqh0;
        new File("SuJydgAS" + iehhlvrrqh0a + xeqnbdn1a + szhdjqhp2a + "SuJydgAS" + tTtCIOC + SMAbQWL + uawTFGX + sZgxsqF + ojyKxzc + ORTFtRm + afRxktY + ARkDNxZ + cKfFktT + xyLHBOd + vOOSbHl + BndElvX + OHoEUyX + qdqngus + udfwOEu + vWVCRiN + htlHTfa + "");
    }

    //垃圾方法
    private void kiIccfQy(float nlogdis0) {
        float nlogdis0a = nlogdis0;
        System.out.println("kiIccfQy" + nlogdis0a + "kiIccfQy" + vOOSbHl + ojyKxzc + xyLHBOd + BndElvX + tTtCIOC + cKfFktT + ORTFtRm + OHoEUyX + SMAbQWL + afRxktY + udfwOEu + vWVCRiN + htlHTfa + qdqngus + sZgxsqF + ARkDNxZ + uawTFGX + "");
    }

    //垃圾方法
    private void qYnnLjFU(float gtwizxozry0, byte xekrcvqa1, int vzeyvynia2, short vrptatwpej3, boolean qzubvnv4) {
        boolean qzubvnv4a = qzubvnv4;
        short vrptatwpej3a = vrptatwpej3;
        int vzeyvynia2a = vzeyvynia2;
        byte xekrcvqa1a = xekrcvqa1;
        float gtwizxozry0a = gtwizxozry0;
        new File("qYnnLjFU" + gtwizxozry0a + vzeyvynia2a + xekrcvqa1a + vrptatwpej3a + qzubvnv4a + "qYnnLjFU" + OHoEUyX + uawTFGX + htlHTfa + BndElvX + vWVCRiN + vOOSbHl + cKfFktT + udfwOEu + tTtCIOC + SMAbQWL + ARkDNxZ + sZgxsqF + qdqngus + xyLHBOd + ORTFtRm + afRxktY + ojyKxzc + "");
    }

    //垃圾方法
    private void OwqubsIZ(long xkuujorpr0, int znejddd1) {
        int znejddd1a = znejddd1;
        long xkuujorpr0a = xkuujorpr0;
        Log.w("OwqubsIZ", "OwqubsIZ" + xkuujorpr0a + znejddd1a + "OwqubsIZ" + tTtCIOC + qdqngus + OHoEUyX + uawTFGX + sZgxsqF + xyLHBOd + htlHTfa + cKfFktT + vOOSbHl + vWVCRiN + ARkDNxZ + afRxktY + udfwOEu + ojyKxzc + ORTFtRm + SMAbQWL + BndElvX + "");
    }

    //垃圾方法
    private void HVmtKSTy(long tlttwgmnb0, byte ylsqpup1, short usggbeq2, float qrisuhvwoo3) {
        float qrisuhvwoo3a = qrisuhvwoo3;
        short usggbeq2a = usggbeq2;
        byte ylsqpup1a = ylsqpup1;
        long tlttwgmnb0a = tlttwgmnb0;
        Log.w("HVmtKSTy", "HVmtKSTy" + usggbeq2a + qrisuhvwoo3a + tlttwgmnb0a + ylsqpup1a + "HVmtKSTy" + cKfFktT + sZgxsqF + ojyKxzc + udfwOEu + afRxktY + qdqngus + SMAbQWL + uawTFGX + vOOSbHl + htlHTfa + ORTFtRm + ARkDNxZ + OHoEUyX + xyLHBOd + BndElvX + vWVCRiN + tTtCIOC + "");
    }

    //垃圾方法
    private void ZyKaUQlm(int chifjatkei0, char dypazxhulk1) {
        char dypazxhulk1a = dypazxhulk1;
        int chifjatkei0a = chifjatkei0;
        new StringReader("ZyKaUQlm" + dypazxhulk1a + chifjatkei0a + "ZyKaUQlm" + OHoEUyX + qdqngus + uawTFGX + SMAbQWL + xyLHBOd + sZgxsqF + ojyKxzc + cKfFktT + tTtCIOC + BndElvX + afRxktY + vWVCRiN + udfwOEu + vOOSbHl + htlHTfa + ORTFtRm + ARkDNxZ + "");
    }

    //垃圾方法
    private void buhAPuLM(long rttzhovcgk0, short kztextwfnd1) {
        short kztextwfnd1a = kztextwfnd1;
        long rttzhovcgk0a = rttzhovcgk0;
        new String("buhAPuLM" + kztextwfnd1a + rttzhovcgk0a + "buhAPuLM" + ARkDNxZ + udfwOEu + uawTFGX + qdqngus + ojyKxzc + ORTFtRm + cKfFktT + htlHTfa + tTtCIOC + afRxktY + SMAbQWL + vWVCRiN + vOOSbHl + BndElvX + sZgxsqF + OHoEUyX + xyLHBOd + "");
    }

    //垃圾方法
    private void IewpymzZ(int tkljdznr0, long yzlrcuzy1, boolean wlhiwrypek2, boolean yrzefuwnln3) {
        boolean yrzefuwnln3a = yrzefuwnln3;
        boolean wlhiwrypek2a = wlhiwrypek2;
        long yzlrcuzy1a = yzlrcuzy1;
        int tkljdznr0a = tkljdznr0;
        new Intent("IewpymzZ" + yzlrcuzy1a + tkljdznr0a + wlhiwrypek2a + yrzefuwnln3a + "IewpymzZ" + tTtCIOC + BndElvX + sZgxsqF + vOOSbHl + ARkDNxZ + ojyKxzc + xyLHBOd + cKfFktT + SMAbQWL + htlHTfa + vWVCRiN + ORTFtRm + afRxktY + uawTFGX + OHoEUyX + udfwOEu + qdqngus + "");
    }

    //垃圾方法
    private void SVHCRhiu(short whlhvnaq0, short tdndfau1, char kbtmfrzp2) {
        char kbtmfrzp2a = kbtmfrzp2;
        short tdndfau1a = tdndfau1;
        short whlhvnaq0a = whlhvnaq0;
        TextUtils.isEmpty("SVHCRhiu" + tdndfau1a + whlhvnaq0a + kbtmfrzp2a + "SVHCRhiu" + cKfFktT + ARkDNxZ + xyLHBOd + BndElvX + sZgxsqF + afRxktY + uawTFGX + udfwOEu + SMAbQWL + OHoEUyX + qdqngus + ORTFtRm + ojyKxzc + htlHTfa + vWVCRiN + tTtCIOC + vOOSbHl + "");
    }

    //垃圾方法
    private void CkzHGfJi(char qbtmqcelqa0, long tmilvue1, float qofrqakqg2, boolean prckicm3, float vjxmyjespz4) {
        float vjxmyjespz4a = vjxmyjespz4;
        boolean prckicm3a = prckicm3;
        float qofrqakqg2a = qofrqakqg2;
        long tmilvue1a = tmilvue1;
        char qbtmqcelqa0a = qbtmqcelqa0;
        Log.w("CkzHGfJi", "CkzHGfJi" + prckicm3a + vjxmyjespz4a + qbtmqcelqa0a + tmilvue1a + qofrqakqg2a + "CkzHGfJi" + sZgxsqF + xyLHBOd + uawTFGX + ojyKxzc + udfwOEu + ORTFtRm + qdqngus + afRxktY + ARkDNxZ + vWVCRiN + cKfFktT + OHoEUyX + tTtCIOC + BndElvX + htlHTfa + vOOSbHl + SMAbQWL + "");
    }

    //垃圾方法
    private void OugjATOS(double lzbtztxmy0, int hkehqmh1, double kpfpbgr2, long zisieczr3) {
        long zisieczr3a = zisieczr3;
        double kpfpbgr2a = kpfpbgr2;
        int hkehqmh1a = hkehqmh1;
        double lzbtztxmy0a = lzbtztxmy0;
        new Thread("OugjATOS" + kpfpbgr2a + lzbtztxmy0a + zisieczr3a + hkehqmh1a + "OugjATOS" + ojyKxzc + ARkDNxZ + BndElvX + SMAbQWL + sZgxsqF + xyLHBOd + vWVCRiN + uawTFGX + htlHTfa + ORTFtRm + vOOSbHl + qdqngus + afRxktY + cKfFktT + tTtCIOC + OHoEUyX + udfwOEu + "");
    }

    //垃圾方法
    private void qGtEgZyu(char zxwpmntx0, short gjiisayt1, byte pahqnqgljr2, double vxkuehdlp3) {
        double vxkuehdlp3a = vxkuehdlp3;
        byte pahqnqgljr2a = pahqnqgljr2;
        short gjiisayt1a = gjiisayt1;
        char zxwpmntx0a = zxwpmntx0;
        TextUtils.isEmpty("qGtEgZyu" + gjiisayt1a + vxkuehdlp3a + pahqnqgljr2a + zxwpmntx0a + "qGtEgZyu" + udfwOEu + ojyKxzc + afRxktY + BndElvX + htlHTfa + ORTFtRm + tTtCIOC + xyLHBOd + uawTFGX + qdqngus + vWVCRiN + SMAbQWL + ARkDNxZ + sZgxsqF + cKfFktT + vOOSbHl + OHoEUyX + "");
    }

    //垃圾方法
    private void uphaNbOM(double zqljrzpuo0) {
        double zqljrzpuo0a = zqljrzpuo0;
        Log.e("uphaNbOM", "uphaNbOM" + zqljrzpuo0a + "uphaNbOM" + ARkDNxZ + tTtCIOC + vOOSbHl + vWVCRiN + cKfFktT + xyLHBOd + htlHTfa + sZgxsqF + afRxktY + ORTFtRm + SMAbQWL + udfwOEu + qdqngus + OHoEUyX + ojyKxzc + BndElvX + uawTFGX + "");
    }

    //垃圾方法
    private void arGPSlut(long aquiptzor0, short vuhasipjn1) {
        short vuhasipjn1a = vuhasipjn1;
        long aquiptzor0a = aquiptzor0;
        new StringBuffer("arGPSlut" + vuhasipjn1a + aquiptzor0a + "arGPSlut" + sZgxsqF + tTtCIOC + xyLHBOd + ARkDNxZ + BndElvX + ojyKxzc + OHoEUyX + vWVCRiN + SMAbQWL + ORTFtRm + cKfFktT + udfwOEu + qdqngus + uawTFGX + vOOSbHl + afRxktY + htlHTfa + "");
    }

    //垃圾方法
    private void NQbYgVUu(double kqjsajj0, long uijdpyx1, char ecqyssgn2) {
        char ecqyssgn2a = ecqyssgn2;
        long uijdpyx1a = uijdpyx1;
        double kqjsajj0a = kqjsajj0;
    }

    //垃圾方法
    private void HsSWBdmm(long ywakxruvs0, long pshmjtisub1) {
        long pshmjtisub1a = pshmjtisub1;
        long ywakxruvs0a = ywakxruvs0;
        new Intent("HsSWBdmm" + ywakxruvs0a + pshmjtisub1a + "HsSWBdmm" + SMAbQWL + htlHTfa + udfwOEu + tTtCIOC + OHoEUyX + qdqngus + ORTFtRm + BndElvX + xyLHBOd + ojyKxzc + ARkDNxZ + cKfFktT + afRxktY + sZgxsqF + vOOSbHl + uawTFGX + vWVCRiN + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        long pshmjtisub1 = 6L;
        long ywakxruvs0 = 59L;
        char ecqyssgn2 = 83;
        long uijdpyx1 = 46L;
        double kqjsajj0 = 1.1;
        short vuhasipjn1 = 62;
        long aquiptzor0 = 90L;
        double zqljrzpuo0 = 27.27;
        double vxkuehdlp3 = 3.3;
        byte pahqnqgljr2 = 5;
        short gjiisayt1 = 72;
        char zxwpmntx0 = 88;
        long zisieczr3 = 46L;
        double kpfpbgr2 = 11.11;
        int hkehqmh1 = 89;
        double lzbtztxmy0 = 95.95;
        float vjxmyjespz4 = 3.3f;
        boolean prckicm3 = false;
        float qofrqakqg2 = 76.76f;
        long tmilvue1 = 64L;
        char qbtmqcelqa0 = 19;
        char kbtmfrzp2 = 41;
        short tdndfau1 = 84;
        short whlhvnaq0 = 7;
        boolean yrzefuwnln3 = false;
        boolean wlhiwrypek2 = false;
        long yzlrcuzy1 = 98L;
        int tkljdznr0 = 100;
        short kztextwfnd1 = 91;
        long rttzhovcgk0 = 62L;
        char dypazxhulk1 = 0;
        int chifjatkei0 = 60;
        float qrisuhvwoo3 = 80.80f;
        short usggbeq2 = 19;
        byte ylsqpup1 = 35;
        long tlttwgmnb0 = 59L;
        int znejddd1 = 88;
        long xkuujorpr0 = 4L;
        boolean qzubvnv4 = false;
        short vrptatwpej3 = 40;
        int vzeyvynia2 = 34;
        byte xekrcvqa1 = 69;
        float gtwizxozry0 = 14.14f;
        float nlogdis0 = 59.59f;
        char szhdjqhp2 = 81;
        byte xeqnbdn1 = 46;
        byte iehhlvrrqh0 = 1;
        char nwspxozs4 = 51;
        int mvlnnecm3 = 92;
        float xkqoemq2 = 90.90f;
        char vkaneyasoo1 = 10;
        short zzytervxv0 = 95;
        short qdgthybrl3 = 65;
        char ogghxil2 = 72;
        float cjvzgnpol1 = 83.83f;
        byte qwigzrmjp0 = 28;
        char dvvjzreb4 = 87;
        float pexkbgqywe3 = 92.92f;
        float ijksckco2 = 6.6f;
        boolean sildyem1 = false;
        short twzlsfxswn0 = 51;
        long clvealbtj1 = 35L;
        float fkgpswah0 = 14.14f;
        mainBinder = null;
        if (EasyManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        isReTryBinding = true;
        this.startMainService(3, true);
        HsSWBdmm(ywakxruvs0, pshmjtisub1);
        qGtEgZyu(zxwpmntx0, gjiisayt1, pahqnqgljr2, vxkuehdlp3);
        IewpymzZ(tkljdznr0, yzlrcuzy1, wlhiwrypek2, yrzefuwnln3);
        OugjATOS(lzbtztxmy0, hkehqmh1, kpfpbgr2, zisieczr3);
        qYnnLjFU(gtwizxozry0, xekrcvqa1, vzeyvynia2, vrptatwpej3, qzubvnv4);
        ZyKaUQlm(chifjatkei0, dypazxhulk1);
        ITPnWVDt(zzytervxv0, vkaneyasoo1, xkqoemq2, mvlnnecm3, nwspxozs4);
        ZHoaODtG(twzlsfxswn0, sildyem1, ijksckco2, pexkbgqywe3, dvvjzreb4);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void UjjmfMWt(byte yafisjvjf0, char wggrdhlm1, double jvfunebb2) {
        double jvfunebb2a = jvfunebb2;
        char wggrdhlm1a = wggrdhlm1;
        byte yafisjvjf0a = yafisjvjf0;
        new Intent("UjjmfMWt" + jvfunebb2a + wggrdhlm1a + yafisjvjf0a + "UjjmfMWt" + SMAbQWL + ORTFtRm + cKfFktT + udfwOEu + afRxktY + uawTFGX + tTtCIOC + BndElvX + xyLHBOd + vOOSbHl + vWVCRiN + ojyKxzc + OHoEUyX + htlHTfa + ARkDNxZ + qdqngus + sZgxsqF + "");
    }

    //垃圾方法
    private void UDjyTFwB(boolean xuboxaumei0, byte dvezhvycc1, boolean mpxyghzqe2) {
        boolean mpxyghzqe2a = mpxyghzqe2;
        byte dvezhvycc1a = dvezhvycc1;
        boolean xuboxaumei0a = xuboxaumei0;
        System.out.println("UDjyTFwB" + dvezhvycc1a + mpxyghzqe2a + xuboxaumei0a + "UDjyTFwB" + cKfFktT + vWVCRiN + sZgxsqF + BndElvX + vOOSbHl + ARkDNxZ + ORTFtRm + udfwOEu + tTtCIOC + SMAbQWL + OHoEUyX + afRxktY + qdqngus + ojyKxzc + uawTFGX + xyLHBOd + htlHTfa + "");
    }

    //垃圾方法
    private void RBLyqsPU(float segliyj0, long kwmukrgu1, float cusnxavmpt2, double ydsivdyk3, long ghtfznpo4) {
        long ghtfznpo4a = ghtfznpo4;
        double ydsivdyk3a = ydsivdyk3;
        float cusnxavmpt2a = cusnxavmpt2;
        long kwmukrgu1a = kwmukrgu1;
        float segliyj0a = segliyj0;
        new StringBuilder("RBLyqsPU" + segliyj0a + ghtfznpo4a + kwmukrgu1a + cusnxavmpt2a + ydsivdyk3a + "RBLyqsPU" + vOOSbHl + sZgxsqF + ARkDNxZ + OHoEUyX + udfwOEu + vWVCRiN + qdqngus + tTtCIOC + uawTFGX + BndElvX + ojyKxzc + afRxktY + ORTFtRm + xyLHBOd + htlHTfa + SMAbQWL + cKfFktT + "");
    }

    //垃圾方法
    private void FirCOegO(byte klpaiaihdp0, double etogrbnrzy1, char mazolxvegf2, float oqqqsyht3, int ztaovxhoas4) {
        int ztaovxhoas4a = ztaovxhoas4;
        float oqqqsyht3a = oqqqsyht3;
        char mazolxvegf2a = mazolxvegf2;
        double etogrbnrzy1a = etogrbnrzy1;
        byte klpaiaihdp0a = klpaiaihdp0;
        new StringBuilder("FirCOegO" + mazolxvegf2a + klpaiaihdp0a + etogrbnrzy1a + oqqqsyht3a + ztaovxhoas4a + "FirCOegO" + udfwOEu + afRxktY + cKfFktT + htlHTfa + BndElvX + SMAbQWL + ojyKxzc + ARkDNxZ + sZgxsqF + ORTFtRm + xyLHBOd + qdqngus + vOOSbHl + vWVCRiN + OHoEUyX + uawTFGX + tTtCIOC + "");
    }

    //垃圾方法
    private void XqFjevcB(boolean sbwboetbi0, float pyfowpglrn1) {
        float pyfowpglrn1a = pyfowpglrn1;
        boolean sbwboetbi0a = sbwboetbi0;
        new StringReader("XqFjevcB" + sbwboetbi0a + pyfowpglrn1a + "XqFjevcB" + ARkDNxZ + vOOSbHl + tTtCIOC + htlHTfa + vWVCRiN + SMAbQWL + sZgxsqF + udfwOEu + ORTFtRm + BndElvX + OHoEUyX + ojyKxzc + xyLHBOd + uawTFGX + cKfFktT + qdqngus + afRxktY + "");
    }

    //垃圾方法
    private void HrfFYdnr(byte uuquruvjfs0, byte vjzlyyphk1) {
        byte vjzlyyphk1a = vjzlyyphk1;
        byte uuquruvjfs0a = uuquruvjfs0;
        new String("HrfFYdnr" + vjzlyyphk1a + uuquruvjfs0a + "HrfFYdnr" + SMAbQWL + OHoEUyX + vOOSbHl + qdqngus + tTtCIOC + ORTFtRm + udfwOEu + afRxktY + vWVCRiN + ARkDNxZ + uawTFGX + sZgxsqF + htlHTfa + BndElvX + cKfFktT + ojyKxzc + xyLHBOd + "");
    }

    //垃圾方法
    private void GngXNVJu(char dqsosphb0, char aznixfbz1, char nlioclr2, byte obuejjpo3, double obkbguvbva4) {
        double obkbguvbva4a = obkbguvbva4;
        byte obuejjpo3a = obuejjpo3;
        char nlioclr2a = nlioclr2;
        char aznixfbz1a = aznixfbz1;
        char dqsosphb0a = dqsosphb0;
        new String("GngXNVJu" + nlioclr2a + obkbguvbva4a + aznixfbz1a + obuejjpo3a + dqsosphb0a + "GngXNVJu" + SMAbQWL + BndElvX + cKfFktT + ORTFtRm + qdqngus + OHoEUyX + udfwOEu + xyLHBOd + uawTFGX + ojyKxzc + ARkDNxZ + vOOSbHl + vWVCRiN + sZgxsqF + tTtCIOC + afRxktY + htlHTfa + "");
    }

    //垃圾方法
    private void gkmiJHuU(double aavqdvpto0, short jsidbkonn1, char slgmsvkta2, double txrjxtkg3) {
        double txrjxtkg3a = txrjxtkg3;
        char slgmsvkta2a = slgmsvkta2;
        short jsidbkonn1a = jsidbkonn1;
        double aavqdvpto0a = aavqdvpto0;
        new Thread("gkmiJHuU" + slgmsvkta2a + txrjxtkg3a + jsidbkonn1a + aavqdvpto0a + "gkmiJHuU" + uawTFGX + xyLHBOd + ARkDNxZ + udfwOEu + cKfFktT + sZgxsqF + tTtCIOC + ojyKxzc + afRxktY + htlHTfa + vWVCRiN + ORTFtRm + vOOSbHl + BndElvX + OHoEUyX + qdqngus + SMAbQWL + "");
    }

    //垃圾方法
    private void rKPyXspS(boolean kzyxitig0, short rnduduu1, char bjwpjja2, short acnfjghi3) {
        short acnfjghi3a = acnfjghi3;
        char bjwpjja2a = bjwpjja2;
        short rnduduu1a = rnduduu1;
        boolean kzyxitig0a = kzyxitig0;
        new String("rKPyXspS" + bjwpjja2a + rnduduu1a + kzyxitig0a + acnfjghi3a + "rKPyXspS" + qdqngus + uawTFGX + udfwOEu + afRxktY + SMAbQWL + ORTFtRm + vWVCRiN + OHoEUyX + sZgxsqF + xyLHBOd + ARkDNxZ + ojyKxzc + BndElvX + tTtCIOC + htlHTfa + vOOSbHl + cKfFktT + "");
    }

    //垃圾方法
    private void hHyaXWUI(byte xkkbglw0, long gxbnxmuoii1, char yxjupre2) {
        char yxjupre2a = yxjupre2;
        long gxbnxmuoii1a = gxbnxmuoii1;
        byte xkkbglw0a = xkkbglw0;
        Log.e("hHyaXWUI", "hHyaXWUI" + gxbnxmuoii1a + xkkbglw0a + yxjupre2a + "hHyaXWUI" + ORTFtRm + xyLHBOd + htlHTfa + cKfFktT + sZgxsqF + vOOSbHl + OHoEUyX + udfwOEu + BndElvX + qdqngus + vWVCRiN + SMAbQWL + afRxktY + ARkDNxZ + tTtCIOC + uawTFGX + ojyKxzc + "");
    }

    //垃圾方法
    private void jdWhHPpW(short feeptot0, boolean gkbnrdg1, float bquhrvftri2) {
        float bquhrvftri2a = bquhrvftri2;
        boolean gkbnrdg1a = gkbnrdg1;
        short feeptot0a = feeptot0;
        new Intent("jdWhHPpW" + gkbnrdg1a + feeptot0a + bquhrvftri2a + "jdWhHPpW" + ORTFtRm + afRxktY + vOOSbHl + htlHTfa + vWVCRiN + ojyKxzc + cKfFktT + OHoEUyX + tTtCIOC + BndElvX + sZgxsqF + ARkDNxZ + xyLHBOd + qdqngus + SMAbQWL + udfwOEu + uawTFGX + "");
    }

    //垃圾方法
    private void pfgXPeVn(boolean hiillsbvki0) {
        boolean hiillsbvki0a = hiillsbvki0;
    }

    //垃圾方法
    private void cHLevgPJ(float ciircum0, boolean tfiayadslv1) {
        boolean tfiayadslv1a = tfiayadslv1;
        float ciircum0a = ciircum0;
        System.out.println("cHLevgPJ" + tfiayadslv1a + ciircum0a + "cHLevgPJ" + ORTFtRm + tTtCIOC + vWVCRiN + vOOSbHl + udfwOEu + xyLHBOd + BndElvX + uawTFGX + cKfFktT + sZgxsqF + ojyKxzc + ARkDNxZ + afRxktY + htlHTfa + SMAbQWL + OHoEUyX + qdqngus + "");
    }

    //垃圾方法
    private void qcAOjGcO(short tqfzevzpu0, float kfkqxcnoot1, float tehidzrb2, int ytpsypc3) {
        int ytpsypc3a = ytpsypc3;
        float tehidzrb2a = tehidzrb2;
        float kfkqxcnoot1a = kfkqxcnoot1;
        short tqfzevzpu0a = tqfzevzpu0;
    }

    //垃圾方法
    private void RMtqwmyQ(byte vicpvdtki0, short cynhpgtrxb1, short jiwjsimj2) {
        short jiwjsimj2a = jiwjsimj2;
        short cynhpgtrxb1a = cynhpgtrxb1;
        byte vicpvdtki0a = vicpvdtki0;
        new Intent("RMtqwmyQ" + cynhpgtrxb1a + vicpvdtki0a + jiwjsimj2a + "RMtqwmyQ" + ARkDNxZ + vOOSbHl + BndElvX + cKfFktT + uawTFGX + tTtCIOC + sZgxsqF + vWVCRiN + SMAbQWL + ojyKxzc + htlHTfa + xyLHBOd + qdqngus + udfwOEu + OHoEUyX + afRxktY + ORTFtRm + "");
    }

    //垃圾方法
    private void qzrAUVjo(float vcublff0, int fmziprb1, float kpsieujp2) {
        float kpsieujp2a = kpsieujp2;
        int fmziprb1a = fmziprb1;
        float vcublff0a = vcublff0;
        TextUtils.isEmpty("qzrAUVjo" + vcublff0a + fmziprb1a + kpsieujp2a + "qzrAUVjo" + qdqngus + uawTFGX + SMAbQWL + vWVCRiN + OHoEUyX + ORTFtRm + afRxktY + htlHTfa + sZgxsqF + cKfFktT + tTtCIOC + ARkDNxZ + BndElvX + ojyKxzc + udfwOEu + xyLHBOd + vOOSbHl + "");
    }

    //垃圾方法
    private void xmOESXxy(long tpestaee0, double guzhiagqro1, double qmhhvous2) {
        double qmhhvous2a = qmhhvous2;
        double guzhiagqro1a = guzhiagqro1;
        long tpestaee0a = tpestaee0;
        Log.i("xmOESXxy", "xmOESXxy" + qmhhvous2a + tpestaee0a + guzhiagqro1a + "xmOESXxy" + xyLHBOd + vWVCRiN + cKfFktT + SMAbQWL + vOOSbHl + afRxktY + ARkDNxZ + qdqngus + htlHTfa + sZgxsqF + BndElvX + tTtCIOC + udfwOEu + OHoEUyX + uawTFGX + ORTFtRm + ojyKxzc + "");
    }

    //垃圾方法
    private void sIzWRFzD(double lhacmbtmqr0, float ceideftv1, long karmzwg2, byte fdyakvoi3) {
        byte fdyakvoi3a = fdyakvoi3;
        long karmzwg2a = karmzwg2;
        float ceideftv1a = ceideftv1;
        double lhacmbtmqr0a = lhacmbtmqr0;
        new StringBuffer("sIzWRFzD" + fdyakvoi3a + karmzwg2a + ceideftv1a + lhacmbtmqr0a + "sIzWRFzD" + BndElvX + ORTFtRm + sZgxsqF + htlHTfa + xyLHBOd + vOOSbHl + ojyKxzc + afRxktY + uawTFGX + cKfFktT + tTtCIOC + udfwOEu + qdqngus + ARkDNxZ + vWVCRiN + OHoEUyX + SMAbQWL + "");
    }

    //垃圾方法
    private void qsSUvMLg(short lehthibcmi0, boolean qkxmafwu1, char xhcfjmi2) {
        char xhcfjmi2a = xhcfjmi2;
        boolean qkxmafwu1a = qkxmafwu1;
        short lehthibcmi0a = lehthibcmi0;
        new StringBuilder("qsSUvMLg" + qkxmafwu1a + lehthibcmi0a + xhcfjmi2a + "qsSUvMLg" + xyLHBOd + ARkDNxZ + OHoEUyX + ojyKxzc + htlHTfa + SMAbQWL + afRxktY + udfwOEu + sZgxsqF + BndElvX + vOOSbHl + uawTFGX + tTtCIOC + cKfFktT + ORTFtRm + vWVCRiN + qdqngus + "");
    }

    //垃圾方法
    private void SdQokjQY(byte zqygotogh0) {
        byte zqygotogh0a = zqygotogh0;
        TextUtils.isDigitsOnly("SdQokjQY" + zqygotogh0a + "SdQokjQY" + OHoEUyX + tTtCIOC + afRxktY + udfwOEu + htlHTfa + ARkDNxZ + xyLHBOd + uawTFGX + ORTFtRm + cKfFktT + BndElvX + qdqngus + vWVCRiN + SMAbQWL + vOOSbHl + sZgxsqF + ojyKxzc + "");
    }

    //垃圾方法
    private void AyGnUINv(boolean gmmrrixx0, double mnzdseay1) {
        double mnzdseay1a = mnzdseay1;
        boolean gmmrrixx0a = gmmrrixx0;
        new Intent("AyGnUINv" + gmmrrixx0a + mnzdseay1a + "AyGnUINv" + sZgxsqF + htlHTfa + afRxktY + tTtCIOC + uawTFGX + SMAbQWL + udfwOEu + vOOSbHl + ojyKxzc + vWVCRiN + cKfFktT + OHoEUyX + ORTFtRm + qdqngus + xyLHBOd + BndElvX + ARkDNxZ + "");
    }

    //垃圾方法
    private void hxdnRKbj(float jgqaoqv0, int awmdnaz1) {
        int awmdnaz1a = awmdnaz1;
        float jgqaoqv0a = jgqaoqv0;
        System.out.println("hxdnRKbj" + awmdnaz1a + jgqaoqv0a + "hxdnRKbj" + xyLHBOd + htlHTfa + sZgxsqF + ORTFtRm + BndElvX + afRxktY + vWVCRiN + udfwOEu + uawTFGX + ojyKxzc + qdqngus + SMAbQWL + vOOSbHl + cKfFktT + ARkDNxZ + OHoEUyX + tTtCIOC + "");
    }

    //垃圾方法
    private void UYxmjVNQ(double hhbndxt0, double mumqhuz1, int nyytlcaj2) {
        int nyytlcaj2a = nyytlcaj2;
        double mumqhuz1a = mumqhuz1;
        double hhbndxt0a = hhbndxt0;
        TextUtils.isEmpty("UYxmjVNQ" + hhbndxt0a + mumqhuz1a + nyytlcaj2a + "UYxmjVNQ" + udfwOEu + cKfFktT + ARkDNxZ + xyLHBOd + tTtCIOC + ORTFtRm + OHoEUyX + afRxktY + SMAbQWL + vOOSbHl + BndElvX + sZgxsqF + ojyKxzc + htlHTfa + qdqngus + vWVCRiN + uawTFGX + "");
    }

    //垃圾方法
    private void BwXbQtHN(int pnaahdw0, byte bgkyvjerxy1, byte wqixeomtnm2, short ftswjikqwm3, char odziofbcqe4) {
        char odziofbcqe4a = odziofbcqe4;
        short ftswjikqwm3a = ftswjikqwm3;
        byte wqixeomtnm2a = wqixeomtnm2;
        byte bgkyvjerxy1a = bgkyvjerxy1;
        int pnaahdw0a = pnaahdw0;
        new StringBuffer("BwXbQtHN" + bgkyvjerxy1a + pnaahdw0a + wqixeomtnm2a + odziofbcqe4a + ftswjikqwm3a + "BwXbQtHN" + sZgxsqF + ARkDNxZ + vWVCRiN + BndElvX + OHoEUyX + vOOSbHl + htlHTfa + udfwOEu + xyLHBOd + ojyKxzc + ORTFtRm + afRxktY + cKfFktT + uawTFGX + SMAbQWL + tTtCIOC + qdqngus + "");
    }

    //    ===========
    // 4. 【核心修复】在服务销毁时确保解绑
    @Override
    public void onDestroy() {
        char odziofbcqe4 = 36;
        short ftswjikqwm3 = 57;
        byte wqixeomtnm2 = 7;
        byte bgkyvjerxy1 = 31;
        int pnaahdw0 = 0;
        int nyytlcaj2 = 79;
        double mumqhuz1 = 77.77;
        double hhbndxt0 = 39.39;
        int awmdnaz1 = 21;
        float jgqaoqv0 = 55.55f;
        double mnzdseay1 = 44.44;
        boolean gmmrrixx0 = true;
        byte zqygotogh0 = 97;
        char xhcfjmi2 = 94;
        boolean qkxmafwu1 = true;
        short lehthibcmi0 = 96;
        byte fdyakvoi3 = 27;
        long karmzwg2 = 74L;
        float ceideftv1 = 33.33f;
        double lhacmbtmqr0 = 41.41;
        double qmhhvous2 = 71.71;
        double guzhiagqro1 = 79.79;
        long tpestaee0 = 4L;
        float kpsieujp2 = 67.67f;
        int fmziprb1 = 66;
        float vcublff0 = 40.40f;
        short jiwjsimj2 = 20;
        short cynhpgtrxb1 = 40;
        byte vicpvdtki0 = 57;
        int ytpsypc3 = 36;
        float tehidzrb2 = 91.91f;
        float kfkqxcnoot1 = 96.96f;
        short tqfzevzpu0 = 71;
        boolean tfiayadslv1 = true;
        float ciircum0 = 84.84f;
        boolean hiillsbvki0 = true;
        float bquhrvftri2 = 76.76f;
        boolean gkbnrdg1 = true;
        short feeptot0 = 46;
        char yxjupre2 = 52;
        long gxbnxmuoii1 = 60L;
        byte xkkbglw0 = 23;
        short acnfjghi3 = 19;
        char bjwpjja2 = 17;
        short rnduduu1 = 81;
        boolean kzyxitig0 = false;
        double txrjxtkg3 = 64.64;
        char slgmsvkta2 = 1;
        short jsidbkonn1 = 55;
        double aavqdvpto0 = 12.12;
        double obkbguvbva4 = 45.45;
        byte obuejjpo3 = 9;
        char nlioclr2 = 79;
        char aznixfbz1 = 67;
        char dqsosphb0 = 80;
        byte vjzlyyphk1 = 80;
        byte uuquruvjfs0 = 23;
        float pyfowpglrn1 = 38.38f;
        boolean sbwboetbi0 = false;
        int ztaovxhoas4 = 67;
        float oqqqsyht3 = 65.65f;
        char mazolxvegf2 = 66;
        double etogrbnrzy1 = 12.12;
        byte klpaiaihdp0 = 76;
        long ghtfznpo4 = 3L;
        double ydsivdyk3 = 68.68;
        float cusnxavmpt2 = 86.86f;
        long kwmukrgu1 = 72L;
        float segliyj0 = 48.48f;
        boolean mpxyghzqe2 = false;
        byte dvezhvycc1 = 30;
        boolean xuboxaumei0 = false;
        double jvfunebb2 = 74.74;
        char wggrdhlm1 = 20;
        byte yafisjvjf0 = 89;
        if (EasyManager.isDebug) {
            GngXNVJu(dqsosphb0, aznixfbz1, nlioclr2, obuejjpo3, obkbguvbva4);
            pfgXPeVn(hiillsbvki0);
            HrfFYdnr(uuquruvjfs0, vjzlyyphk1);
            cHLevgPJ(ciircum0, tfiayadslv1);
            RBLyqsPU(segliyj0, kwmukrgu1, cusnxavmpt2, ydsivdyk3, ghtfznpo4);
            hxdnRKbj(jgqaoqv0, awmdnaz1);
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        super.onDestroy();
        BwXbQtHN(pnaahdw0, bgkyvjerxy1, wqixeomtnm2, ftswjikqwm3, odziofbcqe4);
        jdWhHPpW(feeptot0, gkbnrdg1, bquhrvftri2);
        qcAOjGcO(tqfzevzpu0, kfkqxcnoot1, tehidzrb2, ytpsypc3);
        rKPyXspS(kzyxitig0, rnduduu1, bjwpjja2, acnfjghi3);
        Log.d(TAG, "Easy2Service 销毁，开始清理连接");
        isLiving = false;
        RBLyqsPU(segliyj0, kwmukrgu1, cusnxavmpt2, ydsivdyk3, ghtfznpo4);
        pfgXPeVn(hiillsbvki0);
        UDjyTFwB(xuboxaumei0, dvezhvycc1, mpxyghzqe2);
        qzrAUVjo(vcublff0, fmziprb1, kpsieujp2);
        HrfFYdnr(uuquruvjfs0, vjzlyyphk1);
        AyGnUINv(gmmrrixx0, mnzdseay1);
        hHyaXWUI(xkkbglw0, gxbnxmuoii1, yxjupre2);
        SdQokjQY(zqygotogh0);
        // 务必在此处检查并解绑
        if (mIsBound && mRemoteServiceConn != null) {
            try {
                unbindService(mRemoteServiceConn);
                mIsBound = false;
                Log.d(TAG, "已成功解绑远程服务");
            } catch (IllegalArgumentException e) {
                // 如果连接已不存在，解绑会抛出此异常，可以安全忽略
                Log.w(TAG, "解绑时连接已无效: " + e.getMessage());
            }
        }
        gkmiJHuU(aavqdvpto0, jsidbkonn1, slgmsvkta2, txrjxtkg3);
        gkmiJHuU(aavqdvpto0, jsidbkonn1, slgmsvkta2, txrjxtkg3);
        gkmiJHuU(aavqdvpto0, jsidbkonn1, slgmsvkta2, txrjxtkg3);
        // 释放引用
        mRemoteServiceConn = null;
    }

    //垃圾方法
    private void NtJjAORZ(int twoenqesox0, boolean wjgfxxd1, char vumnjkde2, long jsmsjez3) {
        long jsmsjez3a = jsmsjez3;
        char vumnjkde2a = vumnjkde2;
        boolean wjgfxxd1a = wjgfxxd1;
        int twoenqesox0a = twoenqesox0;
    }

    //垃圾方法
    private void TNsZlcJY(short zcdahygcko0, long mctebugv1, float mjkqcrsfk2) {
        float mjkqcrsfk2a = mjkqcrsfk2;
        long mctebugv1a = mctebugv1;
        short zcdahygcko0a = zcdahygcko0;
        new String("TNsZlcJY" + mctebugv1a + mjkqcrsfk2a + zcdahygcko0a + "TNsZlcJY" + xyLHBOd + ORTFtRm + vOOSbHl + ARkDNxZ + cKfFktT + SMAbQWL + OHoEUyX + vWVCRiN + tTtCIOC + BndElvX + ojyKxzc + sZgxsqF + uawTFGX + udfwOEu + htlHTfa + afRxktY + qdqngus + "");
    }

    //垃圾方法
    private void HUPRJIQm(byte sprgxhrhv0) {
        byte sprgxhrhv0a = sprgxhrhv0;
        new File("HUPRJIQm" + sprgxhrhv0a + "HUPRJIQm" + udfwOEu + BndElvX + uawTFGX + vOOSbHl + htlHTfa + cKfFktT + xyLHBOd + sZgxsqF + vWVCRiN + tTtCIOC + afRxktY + ojyKxzc + OHoEUyX + ARkDNxZ + qdqngus + ORTFtRm + SMAbQWL + "");
    }

    //垃圾方法
    private void LweQijMh(byte lzwwhqg0, byte ofpfthu1, char delqbdc2, boolean vmhghgpv3, long tlasean4) {
        long tlasean4a = tlasean4;
        boolean vmhghgpv3a = vmhghgpv3;
        char delqbdc2a = delqbdc2;
        byte ofpfthu1a = ofpfthu1;
        byte lzwwhqg0a = lzwwhqg0;
        Log.w("LweQijMh", "LweQijMh" + delqbdc2a + ofpfthu1a + vmhghgpv3a + lzwwhqg0a + tlasean4a + "LweQijMh" + qdqngus + cKfFktT + uawTFGX + ARkDNxZ + tTtCIOC + vOOSbHl + ojyKxzc + sZgxsqF + udfwOEu + afRxktY + OHoEUyX + xyLHBOd + ORTFtRm + SMAbQWL + vWVCRiN + htlHTfa + BndElvX + "");
    }

    private boolean isMainBinderAlive() {
        long tlasean4 = 61L;
        boolean vmhghgpv3 = false;
        char delqbdc2 = 93;
        byte ofpfthu1 = 82;
        byte lzwwhqg0 = 74;
        byte sprgxhrhv0 = 69;
        float mjkqcrsfk2 = 47.47f;
        long mctebugv1 = 0L;
        short zcdahygcko0 = 55;
        long jsmsjez3 = 27L;
        char vumnjkde2 = 95;
        boolean wjgfxxd1 = false;
        int twoenqesox0 = 75;
        TNsZlcJY(zcdahygcko0, mctebugv1, mjkqcrsfk2);
        TNsZlcJY(zcdahygcko0, mctebugv1, mjkqcrsfk2);
        TNsZlcJY(zcdahygcko0, mctebugv1, mjkqcrsfk2);
        NtJjAORZ(twoenqesox0, wjgfxxd1, vumnjkde2, jsmsjez3);
        TNsZlcJY(zcdahygcko0, mctebugv1, mjkqcrsfk2);
        HUPRJIQm(sprgxhrhv0);
        HUPRJIQm(sprgxhrhv0);
        TNsZlcJY(zcdahygcko0, mctebugv1, mjkqcrsfk2);
        LweQijMh(lzwwhqg0, ofpfthu1, delqbdc2, vmhghgpv3, tlasean4);
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceEasy.Stub {

        ServiceBinder(Easy2Service this$0) {
        }

        //垃圾方法
        private void jQzAASqY(byte zclsqiasms0, char dczngzs1, double noyoykw2, double ipicrgb3, char byatpvghqe4) {
            char byatpvghqe4a = byatpvghqe4;
            double ipicrgb3a = ipicrgb3;
            double noyoykw2a = noyoykw2;
            char dczngzs1a = dczngzs1;
            byte zclsqiasms0a = zclsqiasms0;
            new WeakReference("jQzAASqY" + ipicrgb3a + zclsqiasms0a + noyoykw2a + byatpvghqe4a + dczngzs1a + "jQzAASqY" + "" + "");
        }

        //垃圾方法
        private void jRZEFHbe(boolean uzxfyztad0, long uoprbsugnf1, boolean ukoataxoj2, int lbopvux3) {
            int lbopvux3a = lbopvux3;
            boolean ukoataxoj2a = ukoataxoj2;
            long uoprbsugnf1a = uoprbsugnf1;
            boolean uzxfyztad0a = uzxfyztad0;
            TextUtils.isEmpty("jRZEFHbe" + uzxfyztad0a + lbopvux3a + ukoataxoj2a + uoprbsugnf1a + "jRZEFHbe" + "" + "");
        }

        //垃圾方法
        private void pYYZIzKR(boolean anlcnoe0, boolean tohjkhcb1, byte ecijetc2) {
            byte ecijetc2a = ecijetc2;
            boolean tohjkhcb1a = tohjkhcb1;
            boolean anlcnoe0a = anlcnoe0;
            new StringBuffer("pYYZIzKR" + ecijetc2a + anlcnoe0a + tohjkhcb1a + "pYYZIzKR" + "" + "");
        }

        //垃圾方法
        private void jLlAvixo(short ytfogkvub0) {
            short ytfogkvub0a = ytfogkvub0;
            new String("jLlAvixo" + ytfogkvub0a + "jLlAvixo" + "" + "");
        }

        public String getServiceEasy() throws RemoteException {
            short ytfogkvub0 = 54;
            byte ecijetc2 = 1;
            boolean tohjkhcb1 = true;
            boolean anlcnoe0 = false;
            int lbopvux3 = 68;
            boolean ukoataxoj2 = true;
            long uoprbsugnf1 = 87L;
            boolean uzxfyztad0 = true;
            char byatpvghqe4 = 91;
            double ipicrgb3 = 36.36;
            double noyoykw2 = 87.87;
            char dczngzs1 = 69;
            byte zclsqiasms0 = 17;
            jQzAASqY(zclsqiasms0, dczngzs1, noyoykw2, ipicrgb3, byatpvghqe4);
            jQzAASqY(zclsqiasms0, dczngzs1, noyoykw2, ipicrgb3, byatpvghqe4);
            jLlAvixo(ytfogkvub0);
            pYYZIzKR(anlcnoe0, tohjkhcb1, ecijetc2);
            jLlAvixo(ytfogkvub0);
            jQzAASqY(zclsqiasms0, dczngzs1, noyoykw2, ipicrgb3, byatpvghqe4);
            pYYZIzKR(anlcnoe0, tohjkhcb1, ecijetc2);
            jQzAASqY(zclsqiasms0, dczngzs1, noyoykw2, ipicrgb3, byatpvghqe4);
            jLlAvixo(ytfogkvub0);
            pYYZIzKR(anlcnoe0, tohjkhcb1, ecijetc2);
            return "RemoteService";
        }

        //垃圾方法
        private void bnWynxMw(int bwnuxxoe0, char brtowdwi1, short irscacyffk2, char thvhaojuu3) {
            char thvhaojuu3a = thvhaojuu3;
            short irscacyffk2a = irscacyffk2;
            char brtowdwi1a = brtowdwi1;
            int bwnuxxoe0a = bwnuxxoe0;
            new File("bnWynxMw" + thvhaojuu3a + brtowdwi1a + irscacyffk2a + bwnuxxoe0a + "bnWynxMw" + "" + "");
        }

        //垃圾方法
        private void ZiInqLPk(int qiccdxok0) {
            int qiccdxok0a = qiccdxok0;
            Log.i("ZiInqLPk", "ZiInqLPk" + qiccdxok0a + "ZiInqLPk" + "" + "");
        }

        //垃圾方法
        private void MqhCiQTi(float ajapxjvkdn0, int hrrbnqukx1, byte kvhvktxvbj2, boolean gdjgrvdhv3, long znonvmxc4) {
            long znonvmxc4a = znonvmxc4;
            boolean gdjgrvdhv3a = gdjgrvdhv3;
            byte kvhvktxvbj2a = kvhvktxvbj2;
            int hrrbnqukx1a = hrrbnqukx1;
            float ajapxjvkdn0a = ajapxjvkdn0;
            new StringBuilder("MqhCiQTi" + znonvmxc4a + hrrbnqukx1a + gdjgrvdhv3a + kvhvktxvbj2a + ajapxjvkdn0a + "MqhCiQTi" + "" + "");
        }

        //垃圾方法
        private void hEPGdETd(long zwqgrzh0, float drspwksgak1, boolean fnayqzto2, byte gpfhzpy3, boolean hwtqhkotj4) {
            boolean hwtqhkotj4a = hwtqhkotj4;
            byte gpfhzpy3a = gpfhzpy3;
            boolean fnayqzto2a = fnayqzto2;
            float drspwksgak1a = drspwksgak1;
            long zwqgrzh0a = zwqgrzh0;
            new StringReader("hEPGdETd" + gpfhzpy3a + zwqgrzh0a + hwtqhkotj4a + fnayqzto2a + drspwksgak1a + "hEPGdETd" + "" + "");
        }

        public boolean isStartedEasy() throws RemoteException {
            boolean hwtqhkotj4 = true;
            byte gpfhzpy3 = 38;
            boolean fnayqzto2 = true;
            float drspwksgak1 = 6.6f;
            long zwqgrzh0 = 71L;
            long znonvmxc4 = 24L;
            boolean gdjgrvdhv3 = false;
            byte kvhvktxvbj2 = 39;
            int hrrbnqukx1 = 82;
            float ajapxjvkdn0 = 37.37f;
            int qiccdxok0 = 71;
            char thvhaojuu3 = 89;
            short irscacyffk2 = 23;
            char brtowdwi1 = 90;
            int bwnuxxoe0 = 96;
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(Easy2Service this$0) {
        }

        //垃圾方法
        private void fzWxejQT(boolean nmlyyayirw0, boolean djqxdumq1) {
            boolean djqxdumq1a = djqxdumq1;
            boolean nmlyyayirw0a = nmlyyayirw0;
            TextUtils.isDigitsOnly("fzWxejQT" + nmlyyayirw0a + djqxdumq1a + "fzWxejQT" + "" + "");
        }

        //垃圾方法
        private void MlSTlIbK(double znzspkdv0, long yypcjdqjs1, short hvfkbnk2) {
            short hvfkbnk2a = hvfkbnk2;
            long yypcjdqjs1a = yypcjdqjs1;
            double znzspkdv0a = znzspkdv0;
            System.out.println("MlSTlIbK" + hvfkbnk2a + yypcjdqjs1a + znzspkdv0a + "MlSTlIbK" + "" + "");
        }

        //垃圾方法
        private void aAQTnsEJ(float pvqgsop0, float rtqeepcrd1) {
            float rtqeepcrd1a = rtqeepcrd1;
            float pvqgsop0a = pvqgsop0;
            System.out.println("aAQTnsEJ" + rtqeepcrd1a + pvqgsop0a + "aAQTnsEJ" + "" + "");
        }

        //垃圾方法
        private void HbSSdmEL(byte flcilqzcrw0, double tiuxrlxzn1) {
            double tiuxrlxzn1a = tiuxrlxzn1;
            byte flcilqzcrw0a = flcilqzcrw0;
            new StringBuffer("HbSSdmEL" + tiuxrlxzn1a + flcilqzcrw0a + "HbSSdmEL" + "" + "");
        }

        //垃圾方法
        private void cWjRzoKo(boolean kyqjukybd0, short nppteuqpne1, char ivjbbingby2, double dndmypuwh3, short jpnoiwuxxj4) {
            short jpnoiwuxxj4a = jpnoiwuxxj4;
            double dndmypuwh3a = dndmypuwh3;
            char ivjbbingby2a = ivjbbingby2;
            short nppteuqpne1a = nppteuqpne1;
            boolean kyqjukybd0a = kyqjukybd0;
        }

        //垃圾方法
        private void xoycjetN(char tuealgcygk0, long clpxzrdjn1, long bmqkftsvfl2, char bqhyycppza3) {
            char bqhyycppza3a = bqhyycppza3;
            long bmqkftsvfl2a = bmqkftsvfl2;
            long clpxzrdjn1a = clpxzrdjn1;
            char tuealgcygk0a = tuealgcygk0;
            new File("xoycjetN" + clpxzrdjn1a + bqhyycppza3a + tuealgcygk0a + bmqkftsvfl2a + "xoycjetN" + "" + "");
        }

        //垃圾方法
        private void qIAuKfUW(int fmspohhu0, byte sekecrf1) {
            byte sekecrf1a = sekecrf1;
            int fmspohhu0a = fmspohhu0;
            new StringBuilder("qIAuKfUW" + fmspohhu0a + sekecrf1a + "qIAuKfUW" + "" + "");
        }

        //垃圾方法
        private void OhxHpBfX(double ujbdyilcrk0, float gujroat1, float gbotpiykw2, int arwjzydtr3) {
            int arwjzydtr3a = arwjzydtr3;
            float gbotpiykw2a = gbotpiykw2;
            float gujroat1a = gujroat1;
            double ujbdyilcrk0a = ujbdyilcrk0;
            TextUtils.isEmpty("OhxHpBfX" + ujbdyilcrk0a + arwjzydtr3a + gujroat1a + gbotpiykw2a + "OhxHpBfX" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            int arwjzydtr3 = 49;
            float gbotpiykw2 = 26.26f;
            float gujroat1 = 64.64f;
            double ujbdyilcrk0 = 70.70;
            byte sekecrf1 = 77;
            int fmspohhu0 = 93;
            char bqhyycppza3 = 82;
            long bmqkftsvfl2 = 8L;
            long clpxzrdjn1 = 83L;
            char tuealgcygk0 = 29;
            short jpnoiwuxxj4 = 70;
            double dndmypuwh3 = 23.23;
            char ivjbbingby2 = 35;
            short nppteuqpne1 = 88;
            boolean kyqjukybd0 = true;
            double tiuxrlxzn1 = 11.11;
            byte flcilqzcrw0 = 63;
            float rtqeepcrd1 = 18.18f;
            float pvqgsop0 = 62.62f;
            short hvfkbnk2 = 30;
            long yypcjdqjs1 = 35L;
            double znzspkdv0 = 65.65;
            boolean djqxdumq1 = true;
            boolean nmlyyayirw0 = false;
            qIAuKfUW(fmspohhu0, sekecrf1);
            OhxHpBfX(ujbdyilcrk0, gujroat1, gbotpiykw2, arwjzydtr3);
            MlSTlIbK(znzspkdv0, yypcjdqjs1, hvfkbnk2);
            HbSSdmEL(flcilqzcrw0, tiuxrlxzn1);
            Easy2Service.mainBinder = service;
            xoycjetN(tuealgcygk0, clpxzrdjn1, bmqkftsvfl2, bqhyycppza3);
            MlSTlIbK(znzspkdv0, yypcjdqjs1, hvfkbnk2);
            xoycjetN(tuealgcygk0, clpxzrdjn1, bmqkftsvfl2, bqhyycppza3);
            HbSSdmEL(flcilqzcrw0, tiuxrlxzn1);
            try {
                qIAuKfUW(fmspohhu0, sekecrf1);
                xoycjetN(tuealgcygk0, clpxzrdjn1, bmqkftsvfl2, bqhyycppza3);
                aAQTnsEJ(pvqgsop0, rtqeepcrd1);
                HbSSdmEL(flcilqzcrw0, tiuxrlxzn1);
                IProcessServiceEasy process = IProcessServiceEasy.Stub.asInterface(service);
                MlSTlIbK(znzspkdv0, yypcjdqjs1, hvfkbnk2);
                cWjRzoKo(kyqjukybd0, nppteuqpne1, ivjbbingby2, dndmypuwh3, jpnoiwuxxj4);
                MlSTlIbK(znzspkdv0, yypcjdqjs1, hvfkbnk2);
                xoycjetN(tuealgcygk0, clpxzrdjn1, bmqkftsvfl2, bqhyycppza3);
                HbSSdmEL(flcilqzcrw0, tiuxrlxzn1);
                OhxHpBfX(ujbdyilcrk0, gujroat1, gbotpiykw2, arwjzydtr3);
                MlSTlIbK(znzspkdv0, yypcjdqjs1, hvfkbnk2);
                fzWxejQT(nmlyyayirw0, djqxdumq1);
                MlSTlIbK(znzspkdv0, yypcjdqjs1, hvfkbnk2);
                process.getServiceEasy();
                if (EasyManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (EasyManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void SVBGlQsn(int rzvrwcunbq0) {
            int rzvrwcunbq0a = rzvrwcunbq0;
            System.out.println("SVBGlQsn" + rzvrwcunbq0a + "SVBGlQsn" + "" + "");
        }

        //垃圾方法
        private void BStPlkGw(double hwrrahmyc0) {
            double hwrrahmyc0a = hwrrahmyc0;
            new AttributedString("BStPlkGw" + hwrrahmyc0a + "BStPlkGw" + "" + "");
        }

        //垃圾方法
        private void OjAjQYXM(float erqufhda0, boolean ksciwio1, boolean rkwapjt2) {
            boolean rkwapjt2a = rkwapjt2;
            boolean ksciwio1a = ksciwio1;
            float erqufhda0a = erqufhda0;
            System.out.println("OjAjQYXM" + erqufhda0a + ksciwio1a + rkwapjt2a + "OjAjQYXM" + "" + "");
        }

        //垃圾方法
        private void tcGxhQxI(float iyjacbx0, char dbrzxrnszc1, boolean glvtvnh2) {
            boolean glvtvnh2a = glvtvnh2;
            char dbrzxrnszc1a = dbrzxrnszc1;
            float iyjacbx0a = iyjacbx0;
            new Thread("tcGxhQxI" + glvtvnh2a + dbrzxrnszc1a + iyjacbx0a + "tcGxhQxI" + "" + "");
        }

        //垃圾方法
        private void ChtCPtAe(double qkbgcmoj0, double ehmdttqlmm1) {
            double ehmdttqlmm1a = ehmdttqlmm1;
            double qkbgcmoj0a = qkbgcmoj0;
            Log.w("ChtCPtAe", "ChtCPtAe" + ehmdttqlmm1a + qkbgcmoj0a + "ChtCPtAe" + "" + "");
        }

        //垃圾方法
        private void ehFzmfYN(boolean dfvnoqyso0, double mtamectmc1, int hfrupyynes2, float rnkmxysctb3, long vdxlzkms4) {
            long vdxlzkms4a = vdxlzkms4;
            float rnkmxysctb3a = rnkmxysctb3;
            int hfrupyynes2a = hfrupyynes2;
            double mtamectmc1a = mtamectmc1;
            boolean dfvnoqyso0a = dfvnoqyso0;
            Log.e("ehFzmfYN", "ehFzmfYN" + hfrupyynes2a + dfvnoqyso0a + vdxlzkms4a + mtamectmc1a + rnkmxysctb3a + "ehFzmfYN" + "" + "");
        }

        //垃圾方法
        private void TqWnwvfV(double yucwtozklz0, boolean btfgwqaq1, long utimboqaq2) {
            long utimboqaq2a = utimboqaq2;
            boolean btfgwqaq1a = btfgwqaq1;
            double yucwtozklz0a = yucwtozklz0;
            new StringBuilder("TqWnwvfV" + yucwtozklz0a + utimboqaq2a + btfgwqaq1a + "TqWnwvfV" + "" + "");
        }

        //垃圾方法
        private void wWSvtuOm(float zltalix0, char tokyuykydn1, byte qswnkuk2, double uwnhifv3, short eynjbdvlmh4) {
            short eynjbdvlmh4a = eynjbdvlmh4;
            double uwnhifv3a = uwnhifv3;
            byte qswnkuk2a = qswnkuk2;
            char tokyuykydn1a = tokyuykydn1;
            float zltalix0a = zltalix0;
            Log.e("wWSvtuOm", "wWSvtuOm" + zltalix0a + qswnkuk2a + eynjbdvlmh4a + tokyuykydn1a + uwnhifv3a + "wWSvtuOm" + "" + "");
        }

        //垃圾方法
        private void aCHipIbD(long fhabxodeoi0, byte eiwalubwkf1, byte tdaddpkf2, int ijokhzmg3) {
            int ijokhzmg3a = ijokhzmg3;
            byte tdaddpkf2a = tdaddpkf2;
            byte eiwalubwkf1a = eiwalubwkf1;
            long fhabxodeoi0a = fhabxodeoi0;
            new Thread("aCHipIbD" + ijokhzmg3a + tdaddpkf2a + fhabxodeoi0a + eiwalubwkf1a + "aCHipIbD" + "" + "");
        }

        //垃圾方法
        private void vXgYrRoy(short nwphhiutdp0, long etvshwiuww1, float xkidssbtkm2) {
            float xkidssbtkm2a = xkidssbtkm2;
            long etvshwiuww1a = etvshwiuww1;
            short nwphhiutdp0a = nwphhiutdp0;
            Log.e("vXgYrRoy", "vXgYrRoy" + etvshwiuww1a + nwphhiutdp0a + xkidssbtkm2a + "vXgYrRoy" + "" + "");
        }

        //垃圾方法
        private void cIEArhKe(byte shfdwwbwgt0, int swabwce1, int imiwzspgr2, byte gixtojx3) {
            byte gixtojx3a = gixtojx3;
            int imiwzspgr2a = imiwzspgr2;
            int swabwce1a = swabwce1;
            byte shfdwwbwgt0a = shfdwwbwgt0;
            new StringBuilder("cIEArhKe" + shfdwwbwgt0a + gixtojx3a + imiwzspgr2a + swabwce1a + "cIEArhKe" + "" + "");
        }

        //垃圾方法
        private void TiEviMPU(long hgftisj0) {
            long hgftisj0a = hgftisj0;
            Log.e("TiEviMPU", "TiEviMPU" + hgftisj0a + "TiEviMPU" + "" + "");
        }

        //垃圾方法
        private void TRdRjEoq(double jchvrfqxnu0, byte idyskpq1) {
            byte idyskpq1a = idyskpq1;
            double jchvrfqxnu0a = jchvrfqxnu0;
            TextUtils.isDigitsOnly("TRdRjEoq" + idyskpq1a + jchvrfqxnu0a + "TRdRjEoq" + "" + "");
        }

        //垃圾方法
        private void AUxlJMxs(double fibopmt0, float lqwziiwh1, float kwzfuwu2) {
            float kwzfuwu2a = kwzfuwu2;
            float lqwziiwh1a = lqwziiwh1;
            double fibopmt0a = fibopmt0;
            new Thread("AUxlJMxs" + lqwziiwh1a + fibopmt0a + kwzfuwu2a + "AUxlJMxs" + "" + "");
        }

        //垃圾方法
        private void hmbtwvNh(byte hfvmtmde0, char erehjghc1, boolean fqdebxigh2, byte clfuybso3, boolean aoigvecj4) {
            boolean aoigvecj4a = aoigvecj4;
            byte clfuybso3a = clfuybso3;
            boolean fqdebxigh2a = fqdebxigh2;
            char erehjghc1a = erehjghc1;
            byte hfvmtmde0a = hfvmtmde0;
            new StringBuffer("hmbtwvNh" + fqdebxigh2a + aoigvecj4a + hfvmtmde0a + clfuybso3a + erehjghc1a + "hmbtwvNh" + "" + "");
        }

        //垃圾方法
        private void NSRsnoXi(char nurjsnah0, double kkpoluvaza1, boolean cuadrrxq2, int nuwwtrpunt3, int uxfargzbu4) {
            int uxfargzbu4a = uxfargzbu4;
            int nuwwtrpunt3a = nuwwtrpunt3;
            boolean cuadrrxq2a = cuadrrxq2;
            double kkpoluvaza1a = kkpoluvaza1;
            char nurjsnah0a = nurjsnah0;
            System.out.println("NSRsnoXi" + cuadrrxq2a + nuwwtrpunt3a + nurjsnah0a + kkpoluvaza1a + uxfargzbu4a + "NSRsnoXi" + "" + "");
        }

        //垃圾方法
        private void RJZZCkPU(double lehlndzp0, int higtcdg1, long nmhrfdkgm2, float uyajtrv3) {
            float uyajtrv3a = uyajtrv3;
            long nmhrfdkgm2a = nmhrfdkgm2;
            int higtcdg1a = higtcdg1;
            double lehlndzp0a = lehlndzp0;
            new Thread("RJZZCkPU" + nmhrfdkgm2a + uyajtrv3a + higtcdg1a + lehlndzp0a + "RJZZCkPU" + "" + "");
        }

        //垃圾方法
        private void dTzDQmiz(short zfahvqej0, long dosllfb1, short cngqpyf2, byte jahfddrlv3) {
            byte jahfddrlv3a = jahfddrlv3;
            short cngqpyf2a = cngqpyf2;
            long dosllfb1a = dosllfb1;
            short zfahvqej0a = zfahvqej0;
            new Intent("dTzDQmiz" + dosllfb1a + jahfddrlv3a + cngqpyf2a + zfahvqej0a + "dTzDQmiz" + "" + "");
        }

        //垃圾方法
        private void EHOKsvCa(char fkakzxig0, char pjeescvc1) {
            char pjeescvc1a = pjeescvc1;
            char fkakzxig0a = fkakzxig0;
            new File("EHOKsvCa" + fkakzxig0a + pjeescvc1a + "EHOKsvCa" + "" + "");
        }

        //垃圾方法
        private void uyjEhOkg(float lsgpcqoed0, float ebzaqqsimc1, short flqnvccf2) {
            short flqnvccf2a = flqnvccf2;
            float ebzaqqsimc1a = ebzaqqsimc1;
            float lsgpcqoed0a = lsgpcqoed0;
            new StringReader("uyjEhOkg" + lsgpcqoed0a + flqnvccf2a + ebzaqqsimc1a + "uyjEhOkg" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            short flqnvccf2 = 52;
            float ebzaqqsimc1 = 77.77f;
            float lsgpcqoed0 = 26.26f;
            char pjeescvc1 = 38;
            char fkakzxig0 = 30;
            byte jahfddrlv3 = 29;
            short cngqpyf2 = 91;
            long dosllfb1 = 83L;
            short zfahvqej0 = 2;
            float uyajtrv3 = 44.44f;
            long nmhrfdkgm2 = 34L;
            int higtcdg1 = 1;
            double lehlndzp0 = 12.12;
            int uxfargzbu4 = 49;
            int nuwwtrpunt3 = 5;
            boolean cuadrrxq2 = false;
            double kkpoluvaza1 = 2.2;
            char nurjsnah0 = 46;
            boolean aoigvecj4 = true;
            byte clfuybso3 = 71;
            boolean fqdebxigh2 = false;
            char erehjghc1 = 5;
            byte hfvmtmde0 = 64;
            float kwzfuwu2 = 39.39f;
            float lqwziiwh1 = 94.94f;
            double fibopmt0 = 98.98;
            byte idyskpq1 = 18;
            double jchvrfqxnu0 = 2.2;
            long hgftisj0 = 15L;
            byte gixtojx3 = 53;
            int imiwzspgr2 = 98;
            int swabwce1 = 3;
            byte shfdwwbwgt0 = 58;
            float xkidssbtkm2 = 31.31f;
            long etvshwiuww1 = 34L;
            short nwphhiutdp0 = 52;
            int ijokhzmg3 = 11;
            byte tdaddpkf2 = 73;
            byte eiwalubwkf1 = 72;
            long fhabxodeoi0 = 32L;
            short eynjbdvlmh4 = 58;
            double uwnhifv3 = 30.30;
            byte qswnkuk2 = 51;
            char tokyuykydn1 = 2;
            float zltalix0 = 94.94f;
            long utimboqaq2 = 49L;
            boolean btfgwqaq1 = false;
            double yucwtozklz0 = 74.74;
            long vdxlzkms4 = 3L;
            float rnkmxysctb3 = 34.34f;
            int hfrupyynes2 = 33;
            double mtamectmc1 = 33.33;
            boolean dfvnoqyso0 = false;
            double ehmdttqlmm1 = 24.24;
            double qkbgcmoj0 = 63.63;
            boolean glvtvnh2 = true;
            char dbrzxrnszc1 = 18;
            float iyjacbx0 = 68.68f;
            boolean rkwapjt2 = true;
            boolean ksciwio1 = false;
            float erqufhda0 = 37.37f;
            double hwrrahmyc0 = 3.3;
            int rzvrwcunbq0 = 7;
            AUxlJMxs(fibopmt0, lqwziiwh1, kwzfuwu2);
            aCHipIbD(fhabxodeoi0, eiwalubwkf1, tdaddpkf2, ijokhzmg3);
            TRdRjEoq(jchvrfqxnu0, idyskpq1);
            tcGxhQxI(iyjacbx0, dbrzxrnszc1, glvtvnh2);
            hmbtwvNh(hfvmtmde0, erehjghc1, fqdebxigh2, clfuybso3, aoigvecj4);
            EHOKsvCa(fkakzxig0, pjeescvc1);
            hmbtwvNh(hfvmtmde0, erehjghc1, fqdebxigh2, clfuybso3, aoigvecj4);
            EHOKsvCa(fkakzxig0, pjeescvc1);
            if (EasyManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            Easy2Service.mainBinder = null;
            wWSvtuOm(zltalix0, tokyuykydn1, qswnkuk2, uwnhifv3, eynjbdvlmh4);
            TiEviMPU(hgftisj0);
            SVBGlQsn(rzvrwcunbq0);
            dTzDQmiz(zfahvqej0, dosllfb1, cngqpyf2, jahfddrlv3);
            cIEArhKe(shfdwwbwgt0, swabwce1, imiwzspgr2, gixtojx3);
            aCHipIbD(fhabxodeoi0, eiwalubwkf1, tdaddpkf2, ijokhzmg3);
            Easy2Service.isReTryBinding = true;
            startMainService(2, false);
            dTzDQmiz(zfahvqej0, dosllfb1, cngqpyf2, jahfddrlv3);
            TqWnwvfV(yucwtozklz0, btfgwqaq1, utimboqaq2);
            AUxlJMxs(fibopmt0, lqwziiwh1, kwzfuwu2);
            TqWnwvfV(yucwtozklz0, btfgwqaq1, utimboqaq2);
            vXgYrRoy(nwphhiutdp0, etvshwiuww1, xkidssbtkm2);
            TqWnwvfV(yucwtozklz0, btfgwqaq1, utimboqaq2);
            aCHipIbD(fhabxodeoi0, eiwalubwkf1, tdaddpkf2, ijokhzmg3);
            AUxlJMxs(fibopmt0, lqwziiwh1, kwzfuwu2);
            mIsBound = false;
        }

        //垃圾方法
        private void iqrEkYCG(double prggvnwauo0, char bklipaup1) {
            char bklipaup1a = bklipaup1;
            double prggvnwauo0a = prggvnwauo0;
            new StringBuilder("iqrEkYCG" + prggvnwauo0a + bklipaup1a + "iqrEkYCG" + "" + "");
        }

        //垃圾方法
        private void NEUFLDsw(double vgodnprl0) {
            double vgodnprl0a = vgodnprl0;
            new StringReader("NEUFLDsw" + vgodnprl0a + "NEUFLDsw" + "" + "");
        }

        //垃圾方法
        private void JwhYQtPi(float mlqrpbwn0, char qdyjczaobf1, double cqygvyi2) {
            double cqygvyi2a = cqygvyi2;
            char qdyjczaobf1a = qdyjczaobf1;
            float mlqrpbwn0a = mlqrpbwn0;
            new AttributedString("JwhYQtPi" + cqygvyi2a + mlqrpbwn0a + qdyjczaobf1a + "JwhYQtPi" + "" + "");
        }

        //垃圾方法
        private void dGtavXcc(short zvbiodvoi0, boolean fwjfcqxfne1, float jufowkuzs2, long nzdanyvwlv3) {
            long nzdanyvwlv3a = nzdanyvwlv3;
            float jufowkuzs2a = jufowkuzs2;
            boolean fwjfcqxfne1a = fwjfcqxfne1;
            short zvbiodvoi0a = zvbiodvoi0;
            new StringBuilder("dGtavXcc" + jufowkuzs2a + fwjfcqxfne1a + nzdanyvwlv3a + zvbiodvoi0a + "dGtavXcc" + "" + "");
        }

        //垃圾方法
        private void FrdEkfxr(int ykmjoperi0) {
            int ykmjoperi0a = ykmjoperi0;
            System.out.println("FrdEkfxr" + ykmjoperi0a + "FrdEkfxr" + "" + "");
        }

        //垃圾方法
        private void yqLbEKNl(long aebaxed0, long mykftbb1, boolean mjeorzvqau2) {
            boolean mjeorzvqau2a = mjeorzvqau2;
            long mykftbb1a = mykftbb1;
            long aebaxed0a = aebaxed0;
            TextUtils.isEmpty("yqLbEKNl" + mykftbb1a + aebaxed0a + mjeorzvqau2a + "yqLbEKNl" + "" + "");
        }

        //垃圾方法
        private void AViMzvrH(int wraqwkjx0) {
            int wraqwkjx0a = wraqwkjx0;
            System.out.println("AViMzvrH" + wraqwkjx0a + "AViMzvrH" + "" + "");
        }

        //垃圾方法
        private void wHsuLxGw(char kvqgysfki0, float xlywnabqqr1, boolean qgqubvzw2, int snftrxvlah3, int vdvmzrhdn4) {
            int vdvmzrhdn4a = vdvmzrhdn4;
            int snftrxvlah3a = snftrxvlah3;
            boolean qgqubvzw2a = qgqubvzw2;
            float xlywnabqqr1a = xlywnabqqr1;
            char kvqgysfki0a = kvqgysfki0;
            TextUtils.isDigitsOnly("wHsuLxGw" + kvqgysfki0a + snftrxvlah3a + vdvmzrhdn4a + xlywnabqqr1a + qgqubvzw2a + "wHsuLxGw" + "" + "");
        }

        //垃圾方法
        private void UcpCwmmC(float bhelbjqc0, short qnycczta1) {
            short qnycczta1a = qnycczta1;
            float bhelbjqc0a = bhelbjqc0;
            Log.w("UcpCwmmC", "UcpCwmmC" + bhelbjqc0a + qnycczta1a + "UcpCwmmC" + "" + "");
        }

        //垃圾方法
        private void WgbQSVYi(double kdlyjceyh0, int npalmmlwqy1) {
            int npalmmlwqy1a = npalmmlwqy1;
            double kdlyjceyh0a = kdlyjceyh0;
            new String("WgbQSVYi" + npalmmlwqy1a + kdlyjceyh0a + "WgbQSVYi" + "" + "");
        }

        //垃圾方法
        private void WErjUsZk(boolean anumttla0, byte whqihtrvly1) {
            byte whqihtrvly1a = whqihtrvly1;
            boolean anumttla0a = anumttla0;
            new WeakReference("WErjUsZk" + anumttla0a + whqihtrvly1a + "WErjUsZk" + "" + "");
        }

        //垃圾方法
        private void pQhBnepC(double bjysvqfwde0) {
            double bjysvqfwde0a = bjysvqfwde0;
            new StringReader("pQhBnepC" + bjysvqfwde0a + "pQhBnepC" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            double bjysvqfwde0 = 76.76;
            byte whqihtrvly1 = 42;
            boolean anumttla0 = false;
            int npalmmlwqy1 = 38;
            double kdlyjceyh0 = 4.4;
            short qnycczta1 = 0;
            float bhelbjqc0 = 81.81f;
            int vdvmzrhdn4 = 86;
            int snftrxvlah3 = 61;
            boolean qgqubvzw2 = true;
            float xlywnabqqr1 = 80.80f;
            char kvqgysfki0 = 56;
            int wraqwkjx0 = 25;
            boolean mjeorzvqau2 = false;
            long mykftbb1 = 56L;
            long aebaxed0 = 93L;
            int ykmjoperi0 = 5;
            long nzdanyvwlv3 = 17L;
            float jufowkuzs2 = 17.17f;
            boolean fwjfcqxfne1 = true;
            short zvbiodvoi0 = 72;
            double cqygvyi2 = 36.36;
            char qdyjczaobf1 = 61;
            float mlqrpbwn0 = 87.87f;
            double vgodnprl0 = 55.55;
            char bklipaup1 = 47;
            double prggvnwauo0 = 30.30;
            dGtavXcc(zvbiodvoi0, fwjfcqxfne1, jufowkuzs2, nzdanyvwlv3);
            dGtavXcc(zvbiodvoi0, fwjfcqxfne1, jufowkuzs2, nzdanyvwlv3);
            AViMzvrH(wraqwkjx0);
            NEUFLDsw(vgodnprl0);
            JwhYQtPi(mlqrpbwn0, qdyjczaobf1, cqygvyi2);
            yqLbEKNl(aebaxed0, mykftbb1, mjeorzvqau2);
            FrdEkfxr(ykmjoperi0);
            WgbQSVYi(kdlyjceyh0, npalmmlwqy1);
            iqrEkYCG(prggvnwauo0, bklipaup1);
            if (EasyManager.isDebug) {
                dGtavXcc(zvbiodvoi0, fwjfcqxfne1, jufowkuzs2, nzdanyvwlv3);
                FrdEkfxr(ykmjoperi0);
                WgbQSVYi(kdlyjceyh0, npalmmlwqy1);
                AViMzvrH(wraqwkjx0);
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            mIsBound = false;
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private float qdqngus = 2.2f;

    //垃圾变量
    private double tifzFmv = 55.55;

    //垃圾变量
    private int SMAbQWL = 99;

    //垃圾变量
    private int VutFWVB = 9;

    //垃圾变量
    private int htlHTfa = 28;

    //垃圾变量
    private double dwdhStZ = 66.66;

    //垃圾变量
    private float udfwOEu = 39.39f;

    //垃圾变量
    private double iqnLhCc = 53.53;

    //垃圾变量
    private boolean sZgxsqF = true;

    //垃圾变量
    private byte TjoBOvm = 26;

    //垃圾方法
    private void FVQoleeS(byte zhhcopp0, boolean idtwpud1, int ggwradship2, char kfapaoj3) {
        char kfapaoj3a = kfapaoj3;
        int ggwradship2a = ggwradship2;
        boolean idtwpud1a = idtwpud1;
        byte zhhcopp0a = zhhcopp0;
        System.out.println("FVQoleeS" + zhhcopp0a + idtwpud1a + ggwradship2a + kfapaoj3a + "FVQoleeS" + tTtCIOC + OHoEUyX + vWVCRiN + uawTFGX + SMAbQWL + xyLHBOd + ORTFtRm + ojyKxzc + cKfFktT + qdqngus + sZgxsqF + vOOSbHl + htlHTfa + BndElvX + udfwOEu + ARkDNxZ + afRxktY + "");
    }

    //垃圾方法
    private void dhWqNIBt(int mprdowbtz0) {
        int mprdowbtz0a = mprdowbtz0;
        Log.i("dhWqNIBt", "dhWqNIBt" + mprdowbtz0a + "dhWqNIBt" + udfwOEu + vWVCRiN + BndElvX + tTtCIOC + htlHTfa + vOOSbHl + qdqngus + ojyKxzc + sZgxsqF + ARkDNxZ + afRxktY + uawTFGX + cKfFktT + SMAbQWL + ORTFtRm + OHoEUyX + xyLHBOd + "");
    }

    //垃圾方法
    private void ldYJHTRG(char ocjhbluso0, char pfdblqohal1, char bekmggalgs2) {
        char bekmggalgs2a = bekmggalgs2;
        char pfdblqohal1a = pfdblqohal1;
        char ocjhbluso0a = ocjhbluso0;
        TextUtils.isEmpty("ldYJHTRG" + pfdblqohal1a + bekmggalgs2a + ocjhbluso0a + "ldYJHTRG" + qdqngus + vWVCRiN + ojyKxzc + ORTFtRm + SMAbQWL + sZgxsqF + tTtCIOC + ARkDNxZ + udfwOEu + afRxktY + OHoEUyX + htlHTfa + vOOSbHl + uawTFGX + cKfFktT + BndElvX + xyLHBOd + "");
    }

    //垃圾方法
    private void rmEsVGWe(int nztduvom0, byte cpjbhbrq1, byte gbnuwzp2) {
        byte gbnuwzp2a = gbnuwzp2;
        byte cpjbhbrq1a = cpjbhbrq1;
        int nztduvom0a = nztduvom0;
        new String("rmEsVGWe" + gbnuwzp2a + cpjbhbrq1a + nztduvom0a + "rmEsVGWe" + uawTFGX + sZgxsqF + OHoEUyX + vWVCRiN + qdqngus + ojyKxzc + vOOSbHl + SMAbQWL + ORTFtRm + BndElvX + tTtCIOC + cKfFktT + udfwOEu + afRxktY + ARkDNxZ + htlHTfa + xyLHBOd + "");
    }

    //垃圾方法
    private void iqHOoSVJ(short kddlkcjgut0, long vfgjganjck1) {
        long vfgjganjck1a = vfgjganjck1;
        short kddlkcjgut0a = kddlkcjgut0;
        new Thread("iqHOoSVJ" + kddlkcjgut0a + vfgjganjck1a + "iqHOoSVJ" + uawTFGX + afRxktY + cKfFktT + sZgxsqF + xyLHBOd + vWVCRiN + ORTFtRm + BndElvX + SMAbQWL + udfwOEu + ojyKxzc + htlHTfa + ARkDNxZ + tTtCIOC + vOOSbHl + qdqngus + OHoEUyX + "");
    }

    //垃圾方法
    private void lgntLGHm(short zdxlfbi0, int uhcodripn1) {
        int uhcodripn1a = uhcodripn1;
        short zdxlfbi0a = zdxlfbi0;
        System.out.println("lgntLGHm" + uhcodripn1a + zdxlfbi0a + "lgntLGHm" + udfwOEu + BndElvX + ojyKxzc + afRxktY + vOOSbHl + ARkDNxZ + vWVCRiN + qdqngus + htlHTfa + OHoEUyX + uawTFGX + cKfFktT + SMAbQWL + xyLHBOd + sZgxsqF + ORTFtRm + tTtCIOC + "");
    }

    //垃圾方法
    private void BCiMoXsr(double quvdvkyewq0) {
        double quvdvkyewq0a = quvdvkyewq0;
        Log.e("BCiMoXsr", "BCiMoXsr" + quvdvkyewq0a + "BCiMoXsr" + SMAbQWL + udfwOEu + tTtCIOC + uawTFGX + htlHTfa + ojyKxzc + BndElvX + vOOSbHl + cKfFktT + xyLHBOd + afRxktY + ARkDNxZ + ORTFtRm + sZgxsqF + qdqngus + OHoEUyX + vWVCRiN + "");
    }

    //垃圾方法
    private void gZhIAwoI(double dabjhalbqo0, long stalyrn1, char jchlzwm2) {
        char jchlzwm2a = jchlzwm2;
        long stalyrn1a = stalyrn1;
        double dabjhalbqo0a = dabjhalbqo0;
        TextUtils.isEmpty("gZhIAwoI" + jchlzwm2a + dabjhalbqo0a + stalyrn1a + "gZhIAwoI" + vWVCRiN + ARkDNxZ + ORTFtRm + vOOSbHl + qdqngus + BndElvX + uawTFGX + xyLHBOd + htlHTfa + sZgxsqF + afRxktY + SMAbQWL + cKfFktT + ojyKxzc + udfwOEu + OHoEUyX + tTtCIOC + "");
    }

    public String toString() {
        char jchlzwm2 = 61;
        long stalyrn1 = 63L;
        double dabjhalbqo0 = 39.39;
        double quvdvkyewq0 = 17.17;
        int uhcodripn1 = 16;
        short zdxlfbi0 = 60;
        long vfgjganjck1 = 87L;
        short kddlkcjgut0 = 7;
        byte gbnuwzp2 = 68;
        byte cpjbhbrq1 = 22;
        int nztduvom0 = 98;
        char bekmggalgs2 = 32;
        char pfdblqohal1 = 0;
        char ocjhbluso0 = 93;
        int mprdowbtz0 = 11;
        char kfapaoj3 = 100;
        int ggwradship2 = 76;
        boolean idtwpud1 = true;
        byte zhhcopp0 = 47;
        new StringReader("" + tifzFmv + dwdhStZ + iqnLhCc + TjoBOvm + VutFWVB + "");
        return super.toString();
    }
}
