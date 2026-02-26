package com.speed.model.old.opdj;

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
import androidx.content.speed.IProcessServiceSpeed;
import com.speed.model.old.SpeedManager;
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

public class Speed2Service extends Service {

    //垃圾变量
    private boolean Oexngty = true;

    String TAG = "xxx";

    //垃圾变量
    private long ICCgUWS = 51L;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private byte HsEFyIt = 27;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private char QNWaVTi = 53;

    public static Boolean isLiving = false;

    //垃圾变量
    private float PvfuFcf = 66.66f;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private char KoOIBls = 59;

    private static long delayTime = 250L;

    //垃圾变量
    private short ySjKVFf = 18;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private byte fiswDQt = 2;

    public static boolean isStartService = false;

    //垃圾变量
    private int ctRAaSB = 45;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (SpeedManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private boolean HGclQYK = false;

    int nextNum = -1;

    //垃圾变量
    private int EXlmsHJ = 6;

    private static IBinder mainBinder = null;

    public Speed2Service() {
    }

    //垃圾方法
    private void rKKQXNQv(int lxrhxwgqt0, byte jrhxykynys1) {
        byte jrhxykynys1a = jrhxykynys1;
        int lxrhxwgqt0a = lxrhxwgqt0;
        Log.e("rKKQXNQv", "rKKQXNQv" + jrhxykynys1a + lxrhxwgqt0a + "rKKQXNQv" + EXlmsHJ + Oexngty + HGclQYK + njapRRQ + QQPBcjC + ctRAaSB + yuaZrdH + fiswDQt + KoOIBls + PvfuFcf + QNWaVTi + ySjKVFf + uefPQUR + yKUoxhg + HsEFyIt + ICCgUWS + "");
    }

    //垃圾方法
    private void tglpNOGa(short sngtqrq0, double rheuwfsz1, long fyhmebict2, double pjgjlhoqld3) {
        double pjgjlhoqld3a = pjgjlhoqld3;
        long fyhmebict2a = fyhmebict2;
        double rheuwfsz1a = rheuwfsz1;
        short sngtqrq0a = sngtqrq0;
        new File("tglpNOGa" + pjgjlhoqld3a + rheuwfsz1a + sngtqrq0a + fyhmebict2a + "tglpNOGa" + QNWaVTi + PvfuFcf + yuaZrdH + ctRAaSB + KoOIBls + yKUoxhg + uefPQUR + ySjKVFf + njapRRQ + Oexngty + HsEFyIt + EXlmsHJ + HGclQYK + ICCgUWS + QQPBcjC + fiswDQt + "");
    }

    //垃圾方法
    private void KNvETFZq(byte tvhhxzmmj0, short lvjlwmoe1, boolean hounjikbj2, long xkjvrutoaa3) {
        long xkjvrutoaa3a = xkjvrutoaa3;
        boolean hounjikbj2a = hounjikbj2;
        short lvjlwmoe1a = lvjlwmoe1;
        byte tvhhxzmmj0a = tvhhxzmmj0;
        System.out.println("KNvETFZq" + xkjvrutoaa3a + tvhhxzmmj0a + hounjikbj2a + lvjlwmoe1a + "KNvETFZq" + ICCgUWS + EXlmsHJ + HsEFyIt + fiswDQt + HGclQYK + KoOIBls + yuaZrdH + uefPQUR + Oexngty + ctRAaSB + QQPBcjC + njapRRQ + PvfuFcf + ySjKVFf + QNWaVTi + yKUoxhg + "");
    }

    //垃圾方法
    private void bSYsMSIP(double geocrigmmq0, int kvmiajuyk1, byte qcwujobn2, char faysqjkjxs3) {
        char faysqjkjxs3a = faysqjkjxs3;
        byte qcwujobn2a = qcwujobn2;
        int kvmiajuyk1a = kvmiajuyk1;
        double geocrigmmq0a = geocrigmmq0;
        new String("bSYsMSIP" + geocrigmmq0a + kvmiajuyk1a + faysqjkjxs3a + qcwujobn2a + "bSYsMSIP" + ICCgUWS + HGclQYK + PvfuFcf + yKUoxhg + njapRRQ + KoOIBls + QQPBcjC + HsEFyIt + QNWaVTi + uefPQUR + yuaZrdH + ySjKVFf + ctRAaSB + fiswDQt + EXlmsHJ + Oexngty + "");
    }

    //垃圾方法
    private void IpbzRIjY(int auswfelc0, byte enmsstwx1, double nifzmefeb2, byte gzbvuybtow3) {
        byte gzbvuybtow3a = gzbvuybtow3;
        double nifzmefeb2a = nifzmefeb2;
        byte enmsstwx1a = enmsstwx1;
        int auswfelc0a = auswfelc0;
        new AttributedString("IpbzRIjY" + auswfelc0a + gzbvuybtow3a + nifzmefeb2a + enmsstwx1a + "IpbzRIjY" + QQPBcjC + fiswDQt + ctRAaSB + EXlmsHJ + uefPQUR + Oexngty + QNWaVTi + HsEFyIt + HGclQYK + njapRRQ + yuaZrdH + KoOIBls + ICCgUWS + PvfuFcf + ySjKVFf + yKUoxhg + "");
    }

    //垃圾方法
    private void rwThSfNc(double edlbryxky0, boolean eixwwrku1, float qpcuahua2, float cixttuqrc3) {
        float cixttuqrc3a = cixttuqrc3;
        float qpcuahua2a = qpcuahua2;
        boolean eixwwrku1a = eixwwrku1;
        double edlbryxky0a = edlbryxky0;
    }

    //垃圾方法
    private void iUSQxzlQ(boolean iaufebytd0, long eqiuzqd1, byte yexlvay2, boolean seywxqwc3) {
        boolean seywxqwc3a = seywxqwc3;
        byte yexlvay2a = yexlvay2;
        long eqiuzqd1a = eqiuzqd1;
        boolean iaufebytd0a = iaufebytd0;
        new WeakReference("iUSQxzlQ" + yexlvay2a + eqiuzqd1a + iaufebytd0a + seywxqwc3a + "iUSQxzlQ" + ySjKVFf + yuaZrdH + EXlmsHJ + PvfuFcf + Oexngty + fiswDQt + HsEFyIt + yKUoxhg + njapRRQ + QNWaVTi + uefPQUR + HGclQYK + KoOIBls + ctRAaSB + QQPBcjC + ICCgUWS + "");
    }

    //垃圾方法
    private void RliSABLn(int idvhkyrbq0, boolean jinwyjxj1, char bxfqihogm2, short ybgcvewm3, char iettlul4) {
        char iettlul4a = iettlul4;
        short ybgcvewm3a = ybgcvewm3;
        char bxfqihogm2a = bxfqihogm2;
        boolean jinwyjxj1a = jinwyjxj1;
        int idvhkyrbq0a = idvhkyrbq0;
        new WeakReference("RliSABLn" + jinwyjxj1a + iettlul4a + bxfqihogm2a + ybgcvewm3a + idvhkyrbq0a + "RliSABLn" + fiswDQt + QQPBcjC + PvfuFcf + KoOIBls + ctRAaSB + QNWaVTi + HsEFyIt + Oexngty + uefPQUR + ySjKVFf + ICCgUWS + HGclQYK + yKUoxhg + yuaZrdH + EXlmsHJ + njapRRQ + "");
    }

    //垃圾方法
    private void eJEwMUWR(double tmobbkuqnr0, long jahoyczu1) {
        long jahoyczu1a = jahoyczu1;
        double tmobbkuqnr0a = tmobbkuqnr0;
        new String("eJEwMUWR" + jahoyczu1a + tmobbkuqnr0a + "eJEwMUWR" + fiswDQt + ySjKVFf + KoOIBls + HsEFyIt + PvfuFcf + ctRAaSB + uefPQUR + EXlmsHJ + njapRRQ + ICCgUWS + yuaZrdH + QNWaVTi + Oexngty + yKUoxhg + QQPBcjC + HGclQYK + "");
    }

    //垃圾方法
    private void KjPpIrjm(int fotsfkmso0) {
        int fotsfkmso0a = fotsfkmso0;
        Log.w("KjPpIrjm", "KjPpIrjm" + fotsfkmso0a + "KjPpIrjm" + HsEFyIt + PvfuFcf + EXlmsHJ + QQPBcjC + HGclQYK + QNWaVTi + Oexngty + yuaZrdH + fiswDQt + ICCgUWS + njapRRQ + KoOIBls + yKUoxhg + ctRAaSB + ySjKVFf + uefPQUR + "");
    }

    //垃圾方法
    private void LSQNpNsd(short ogpkidp0) {
        short ogpkidp0a = ogpkidp0;
        TextUtils.isEmpty("LSQNpNsd" + ogpkidp0a + "LSQNpNsd" + EXlmsHJ + QQPBcjC + yKUoxhg + KoOIBls + HsEFyIt + HGclQYK + PvfuFcf + ICCgUWS + uefPQUR + ctRAaSB + Oexngty + fiswDQt + yuaZrdH + QNWaVTi + njapRRQ + ySjKVFf + "");
    }

    //垃圾方法
    private void wRIiFgSu(float jsekhquc0, short jnhbkxtbu1) {
        short jnhbkxtbu1a = jnhbkxtbu1;
        float jsekhquc0a = jsekhquc0;
        Log.w("wRIiFgSu", "wRIiFgSu" + jnhbkxtbu1a + jsekhquc0a + "wRIiFgSu" + ICCgUWS + Oexngty + ySjKVFf + yKUoxhg + EXlmsHJ + QQPBcjC + KoOIBls + QNWaVTi + njapRRQ + HGclQYK + PvfuFcf + ctRAaSB + uefPQUR + fiswDQt + yuaZrdH + HsEFyIt + "");
    }

    //垃圾方法
    private void vuiqiEuD(short vipreiygrc0, short uaatnqeafd1, double hdosrjnv2, float drbzzem3, double hfmrqlq4) {
        double hfmrqlq4a = hfmrqlq4;
        float drbzzem3a = drbzzem3;
        double hdosrjnv2a = hdosrjnv2;
        short uaatnqeafd1a = uaatnqeafd1;
        short vipreiygrc0a = vipreiygrc0;
        TextUtils.isEmpty("vuiqiEuD" + hfmrqlq4a + vipreiygrc0a + hdosrjnv2a + drbzzem3a + uaatnqeafd1a + "vuiqiEuD" + njapRRQ + PvfuFcf + Oexngty + HGclQYK + HsEFyIt + KoOIBls + EXlmsHJ + ctRAaSB + uefPQUR + yuaZrdH + QNWaVTi + yKUoxhg + ySjKVFf + fiswDQt + QQPBcjC + ICCgUWS + "");
    }

    //垃圾方法
    private void zOyIpspk(double zevxibau0, byte xxgcnrkey1, short wrgfcvie2, int cthzwfaz3, short zelqzmmzm4) {
        short zelqzmmzm4a = zelqzmmzm4;
        int cthzwfaz3a = cthzwfaz3;
        short wrgfcvie2a = wrgfcvie2;
        byte xxgcnrkey1a = xxgcnrkey1;
        double zevxibau0a = zevxibau0;
        new StringBuffer("zOyIpspk" + zevxibau0a + zelqzmmzm4a + cthzwfaz3a + xxgcnrkey1a + wrgfcvie2a + "zOyIpspk" + ctRAaSB + Oexngty + uefPQUR + QNWaVTi + EXlmsHJ + yuaZrdH + KoOIBls + HsEFyIt + QQPBcjC + HGclQYK + ICCgUWS + ySjKVFf + yKUoxhg + fiswDQt + njapRRQ + PvfuFcf + "");
    }

    //垃圾方法
    private void ETgpzyZy(byte tjdtuittph0, byte okpbzneh1, byte dwhfwcxzb2, char cnjrgafv3) {
        char cnjrgafv3a = cnjrgafv3;
        byte dwhfwcxzb2a = dwhfwcxzb2;
        byte okpbzneh1a = okpbzneh1;
        byte tjdtuittph0a = tjdtuittph0;
        new AttributedString("ETgpzyZy" + okpbzneh1a + dwhfwcxzb2a + cnjrgafv3a + tjdtuittph0a + "ETgpzyZy" + yuaZrdH + QNWaVTi + EXlmsHJ + ySjKVFf + njapRRQ + PvfuFcf + ctRAaSB + HGclQYK + yKUoxhg + KoOIBls + fiswDQt + ICCgUWS + uefPQUR + Oexngty + HsEFyIt + QQPBcjC + "");
    }

    //垃圾方法
    private void pogAixZj(char njlrhfg0, short qnbbbica1) {
        short qnbbbica1a = qnbbbica1;
        char njlrhfg0a = njlrhfg0;
    }

    //垃圾方法
    private void AlYnlAgl(float looeqwkf0) {
        float looeqwkf0a = looeqwkf0;
        new StringReader("AlYnlAgl" + looeqwkf0a + "AlYnlAgl" + HsEFyIt + yKUoxhg + HGclQYK + PvfuFcf + ctRAaSB + QQPBcjC + ICCgUWS + yuaZrdH + njapRRQ + fiswDQt + KoOIBls + EXlmsHJ + Oexngty + ySjKVFf + QNWaVTi + uefPQUR + "");
    }

    //垃圾方法
    private void SbYTAcsG(short acrtofa0) {
        short acrtofa0a = acrtofa0;
        new AttributedString("SbYTAcsG" + acrtofa0a + "SbYTAcsG" + ICCgUWS + fiswDQt + njapRRQ + PvfuFcf + yuaZrdH + Oexngty + QQPBcjC + yKUoxhg + QNWaVTi + EXlmsHJ + ySjKVFf + HGclQYK + uefPQUR + ctRAaSB + KoOIBls + HsEFyIt + "");
    }

    //垃圾方法
    private void RKqHZLOr(long mgeegqhi0) {
        long mgeegqhi0a = mgeegqhi0;
        new StringBuffer("RKqHZLOr" + mgeegqhi0a + "RKqHZLOr" + ctRAaSB + Oexngty + HsEFyIt + ICCgUWS + ySjKVFf + HGclQYK + QNWaVTi + PvfuFcf + uefPQUR + njapRRQ + EXlmsHJ + fiswDQt + KoOIBls + yuaZrdH + QQPBcjC + yKUoxhg + "");
    }

    //垃圾方法
    private void IDgrUrzJ(long kivigyfg0, float akcextbb1, byte qomzyfaivf2, short jshbecd3, float fcxwjfbjz4) {
        float fcxwjfbjz4a = fcxwjfbjz4;
        short jshbecd3a = jshbecd3;
        byte qomzyfaivf2a = qomzyfaivf2;
        float akcextbb1a = akcextbb1;
        long kivigyfg0a = kivigyfg0;
        Log.w("IDgrUrzJ", "IDgrUrzJ" + fcxwjfbjz4a + jshbecd3a + kivigyfg0a + qomzyfaivf2a + akcextbb1a + "IDgrUrzJ" + QQPBcjC + HsEFyIt + uefPQUR + ySjKVFf + yKUoxhg + EXlmsHJ + njapRRQ + PvfuFcf + QNWaVTi + KoOIBls + yuaZrdH + ICCgUWS + fiswDQt + Oexngty + HGclQYK + ctRAaSB + "");
    }

    //垃圾方法
    private void SfOndvZr(double cuirbgdk0, double nmdhqenx1, double hcfigll2) {
        double hcfigll2a = hcfigll2;
        double nmdhqenx1a = nmdhqenx1;
        double cuirbgdk0a = cuirbgdk0;
        new StringBuffer("SfOndvZr" + cuirbgdk0a + nmdhqenx1a + hcfigll2a + "SfOndvZr" + PvfuFcf + ICCgUWS + uefPQUR + yKUoxhg + ySjKVFf + njapRRQ + ctRAaSB + HGclQYK + yuaZrdH + KoOIBls + Oexngty + QQPBcjC + QNWaVTi + fiswDQt + EXlmsHJ + HsEFyIt + "");
    }

    //垃圾方法
    private void aDOSFKVw(char aawpsmtrwq0) {
        char aawpsmtrwq0a = aawpsmtrwq0;
        new AttributedString("aDOSFKVw" + aawpsmtrwq0a + "aDOSFKVw" + uefPQUR + ICCgUWS + ySjKVFf + njapRRQ + HGclQYK + Oexngty + HsEFyIt + ctRAaSB + KoOIBls + PvfuFcf + fiswDQt + QNWaVTi + QQPBcjC + yKUoxhg + EXlmsHJ + yuaZrdH + "");
    }

    //垃圾方法
    private void XUXSZhOY(float qarbhpnha0, long zepcyyxvo1, float hxwvyqj2) {
        float hxwvyqj2a = hxwvyqj2;
        long zepcyyxvo1a = zepcyyxvo1;
        float qarbhpnha0a = qarbhpnha0;
        System.out.println("XUXSZhOY" + qarbhpnha0a + hxwvyqj2a + zepcyyxvo1a + "XUXSZhOY" + njapRRQ + PvfuFcf + Oexngty + fiswDQt + QNWaVTi + KoOIBls + yuaZrdH + uefPQUR + ctRAaSB + ICCgUWS + ySjKVFf + HGclQYK + HsEFyIt + EXlmsHJ + QQPBcjC + yKUoxhg + "");
    }

    //垃圾方法
    private void zrJvOyAQ(double kyqkzgl0) {
        double kyqkzgl0a = kyqkzgl0;
        System.out.println("zrJvOyAQ" + kyqkzgl0a + "zrJvOyAQ" + ICCgUWS + yuaZrdH + ctRAaSB + HGclQYK + HsEFyIt + PvfuFcf + Oexngty + EXlmsHJ + ySjKVFf + QNWaVTi + njapRRQ + QQPBcjC + yKUoxhg + uefPQUR + KoOIBls + fiswDQt + "");
    }

    //垃圾方法
    private void KWUURDVA(float oytyddjofq0, long azpjmavf1, long dlqhqpkk2) {
        long dlqhqpkk2a = dlqhqpkk2;
        long azpjmavf1a = azpjmavf1;
        float oytyddjofq0a = oytyddjofq0;
        new Thread("KWUURDVA" + oytyddjofq0a + dlqhqpkk2a + azpjmavf1a + "KWUURDVA" + fiswDQt + yKUoxhg + Oexngty + ICCgUWS + EXlmsHJ + njapRRQ + PvfuFcf + HsEFyIt + KoOIBls + QNWaVTi + HGclQYK + uefPQUR + ySjKVFf + QQPBcjC + yuaZrdH + ctRAaSB + "");
    }

    //垃圾方法
    private void HUwvPrIr(char lddpkohuk0) {
        char lddpkohuk0a = lddpkohuk0;
        new StringReader("HUwvPrIr" + lddpkohuk0a + "HUwvPrIr" + Oexngty + fiswDQt + yuaZrdH + yKUoxhg + ICCgUWS + ctRAaSB + uefPQUR + HsEFyIt + HGclQYK + QQPBcjC + PvfuFcf + KoOIBls + njapRRQ + ySjKVFf + QNWaVTi + EXlmsHJ + "");
    }

    //垃圾方法
    private void xlqfXRhR(double okwcrth0, char fzlzakhcvk1, char igtqnei2) {
        char igtqnei2a = igtqnei2;
        char fzlzakhcvk1a = fzlzakhcvk1;
        double okwcrth0a = okwcrth0;
        new File("xlqfXRhR" + fzlzakhcvk1a + igtqnei2a + okwcrth0a + "xlqfXRhR" + PvfuFcf + QNWaVTi + yKUoxhg + njapRRQ + KoOIBls + Oexngty + ICCgUWS + fiswDQt + ySjKVFf + EXlmsHJ + ctRAaSB + HsEFyIt + uefPQUR + QQPBcjC + yuaZrdH + HGclQYK + "");
    }

    //垃圾方法
    private void EoBrbFXW(short phfsbkgth0) {
        short phfsbkgth0a = phfsbkgth0;
        Log.e("EoBrbFXW", "EoBrbFXW" + phfsbkgth0a + "EoBrbFXW" + ctRAaSB + fiswDQt + ySjKVFf + yuaZrdH + HGclQYK + ICCgUWS + KoOIBls + uefPQUR + HsEFyIt + QQPBcjC + QNWaVTi + yKUoxhg + EXlmsHJ + PvfuFcf + njapRRQ + Oexngty + "");
    }

    public void onCreate() {
        short phfsbkgth0 = 91;
        char igtqnei2 = 16;
        char fzlzakhcvk1 = 75;
        double okwcrth0 = 16.16;
        char lddpkohuk0 = 65;
        long dlqhqpkk2 = 37L;
        long azpjmavf1 = 32L;
        float oytyddjofq0 = 20.20f;
        double kyqkzgl0 = 98.98;
        float hxwvyqj2 = 72.72f;
        long zepcyyxvo1 = 21L;
        float qarbhpnha0 = 78.78f;
        char aawpsmtrwq0 = 35;
        double hcfigll2 = 86.86;
        double nmdhqenx1 = 15.15;
        double cuirbgdk0 = 61.61;
        float fcxwjfbjz4 = 92.92f;
        short jshbecd3 = 0;
        byte qomzyfaivf2 = 24;
        float akcextbb1 = 55.55f;
        long kivigyfg0 = 82L;
        long mgeegqhi0 = 9L;
        short acrtofa0 = 16;
        float looeqwkf0 = 89.89f;
        short qnbbbica1 = 24;
        char njlrhfg0 = 26;
        char cnjrgafv3 = 73;
        byte dwhfwcxzb2 = 8;
        byte okpbzneh1 = 13;
        byte tjdtuittph0 = 34;
        short zelqzmmzm4 = 82;
        int cthzwfaz3 = 72;
        short wrgfcvie2 = 36;
        byte xxgcnrkey1 = 17;
        double zevxibau0 = 45.45;
        double hfmrqlq4 = 88.88;
        float drbzzem3 = 83.83f;
        double hdosrjnv2 = 26.26;
        short uaatnqeafd1 = 15;
        short vipreiygrc0 = 28;
        short jnhbkxtbu1 = 97;
        float jsekhquc0 = 37.37f;
        short ogpkidp0 = 68;
        int fotsfkmso0 = 15;
        long jahoyczu1 = 100L;
        double tmobbkuqnr0 = 54.54;
        char iettlul4 = 24;
        short ybgcvewm3 = 24;
        char bxfqihogm2 = 82;
        boolean jinwyjxj1 = false;
        int idvhkyrbq0 = 80;
        boolean seywxqwc3 = false;
        byte yexlvay2 = 28;
        long eqiuzqd1 = 43L;
        boolean iaufebytd0 = true;
        float cixttuqrc3 = 18.18f;
        float qpcuahua2 = 61.61f;
        boolean eixwwrku1 = true;
        double edlbryxky0 = 76.76;
        byte gzbvuybtow3 = 15;
        double nifzmefeb2 = 2.2;
        byte enmsstwx1 = 54;
        int auswfelc0 = 44;
        char faysqjkjxs3 = 85;
        byte qcwujobn2 = 54;
        int kvmiajuyk1 = 14;
        double geocrigmmq0 = 64.64;
        long xkjvrutoaa3 = 11L;
        boolean hounjikbj2 = false;
        short lvjlwmoe1 = 5;
        byte tvhhxzmmj0 = 70;
        double pjgjlhoqld3 = 44.44;
        long fyhmebict2 = 82L;
        double rheuwfsz1 = 37.37;
        short sngtqrq0 = 11;
        byte jrhxykynys1 = 54;
        int lxrhxwgqt0 = 27;
        isLiving = true;
        zrJvOyAQ(kyqkzgl0);
        zrJvOyAQ(kyqkzgl0);
        XUXSZhOY(qarbhpnha0, zepcyyxvo1, hxwvyqj2);
        HUwvPrIr(lddpkohuk0);
        AlYnlAgl(looeqwkf0);
        RKqHZLOr(mgeegqhi0);
        xlqfXRhR(okwcrth0, fzlzakhcvk1, igtqnei2);
        zOyIpspk(zevxibau0, xxgcnrkey1, wrgfcvie2, cthzwfaz3, zelqzmmzm4);
        HUwvPrIr(lddpkohuk0);
        RliSABLn(idvhkyrbq0, jinwyjxj1, bxfqihogm2, ybgcvewm3, iettlul4);
        super.onCreate();
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        xlqfXRhR(okwcrth0, fzlzakhcvk1, igtqnei2);
        RliSABLn(idvhkyrbq0, jinwyjxj1, bxfqihogm2, ybgcvewm3, iettlul4);
        LSQNpNsd(ogpkidp0);
        LSQNpNsd(ogpkidp0);
        EoBrbFXW(phfsbkgth0);
        rKKQXNQv(lxrhxwgqt0, jrhxykynys1);
        this.mServiceBinder = new ServiceBinder(this);
        if (this.mRemoteServiceConn == null) {
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        isReTryBinding = true;
        wRIiFgSu(jsekhquc0, jnhbkxtbu1);
        LSQNpNsd(ogpkidp0);
        EoBrbFXW(phfsbkgth0);
        RliSABLn(idvhkyrbq0, jinwyjxj1, bxfqihogm2, ybgcvewm3, iettlul4);
        KjPpIrjm(fotsfkmso0);
        KNvETFZq(tvhhxzmmj0, lvjlwmoe1, hounjikbj2, xkjvrutoaa3);
        this.startMainService(1, false);
    }

    //垃圾方法
    private void clcUrQkX(long fcuwecznm0, boolean qolsoqf1) {
        boolean qolsoqf1a = qolsoqf1;
        long fcuwecznm0a = fcuwecznm0;
        new Intent("clcUrQkX" + qolsoqf1a + fcuwecznm0a + "clcUrQkX" + EXlmsHJ + njapRRQ + uefPQUR + QNWaVTi + KoOIBls + ICCgUWS + yuaZrdH + PvfuFcf + ySjKVFf + QQPBcjC + Oexngty + HsEFyIt + yKUoxhg + fiswDQt + HGclQYK + ctRAaSB + "");
    }

    //垃圾方法
    private void OYqWOgBd(byte awnfsij0, char gbgmcpfwa1, double aciunbknja2, boolean ewwobjykjo3, float jzmivrgkqc4) {
        float jzmivrgkqc4a = jzmivrgkqc4;
        boolean ewwobjykjo3a = ewwobjykjo3;
        double aciunbknja2a = aciunbknja2;
        char gbgmcpfwa1a = gbgmcpfwa1;
        byte awnfsij0a = awnfsij0;
        new File("OYqWOgBd" + ewwobjykjo3a + aciunbknja2a + awnfsij0a + jzmivrgkqc4a + gbgmcpfwa1a + "OYqWOgBd" + QQPBcjC + fiswDQt + yuaZrdH + HGclQYK + ySjKVFf + Oexngty + ctRAaSB + PvfuFcf + EXlmsHJ + HsEFyIt + uefPQUR + ICCgUWS + yKUoxhg + njapRRQ + KoOIBls + QNWaVTi + "");
    }

    //垃圾方法
    private void NGbwgJUO(int hirqkrlxq0, int koipklxgl1, int vdwxovhvto2) {
        int vdwxovhvto2a = vdwxovhvto2;
        int koipklxgl1a = koipklxgl1;
        int hirqkrlxq0a = hirqkrlxq0;
        new Thread("NGbwgJUO" + vdwxovhvto2a + koipklxgl1a + hirqkrlxq0a + "NGbwgJUO" + ICCgUWS + Oexngty + njapRRQ + QQPBcjC + HsEFyIt + ySjKVFf + fiswDQt + QNWaVTi + uefPQUR + EXlmsHJ + HGclQYK + ctRAaSB + yKUoxhg + PvfuFcf + KoOIBls + yuaZrdH + "");
    }

    //垃圾方法
    private void eAKGWuBS(long ohsisceg0, float skbilkujfi1, long nvqnfkinv2, char devncvj3, int mojrjawy4) {
        int mojrjawy4a = mojrjawy4;
        char devncvj3a = devncvj3;
        long nvqnfkinv2a = nvqnfkinv2;
        float skbilkujfi1a = skbilkujfi1;
        long ohsisceg0a = ohsisceg0;
        new WeakReference("eAKGWuBS" + mojrjawy4a + ohsisceg0a + skbilkujfi1a + devncvj3a + nvqnfkinv2a + "eAKGWuBS" + ySjKVFf + Oexngty + PvfuFcf + QQPBcjC + ctRAaSB + EXlmsHJ + HsEFyIt + yuaZrdH + QNWaVTi + fiswDQt + yKUoxhg + HGclQYK + ICCgUWS + uefPQUR + njapRRQ + KoOIBls + "");
    }

    //垃圾方法
    private void PbTJioWk(double oiwuskp0, long hnmbggk1, int tlbsjwgeh2) {
        int tlbsjwgeh2a = tlbsjwgeh2;
        long hnmbggk1a = hnmbggk1;
        double oiwuskp0a = oiwuskp0;
        Log.w("PbTJioWk", "PbTJioWk" + oiwuskp0a + hnmbggk1a + tlbsjwgeh2a + "PbTJioWk" + yuaZrdH + ICCgUWS + uefPQUR + PvfuFcf + Oexngty + QQPBcjC + ctRAaSB + KoOIBls + HGclQYK + HsEFyIt + EXlmsHJ + yKUoxhg + fiswDQt + ySjKVFf + QNWaVTi + njapRRQ + "");
    }

    //垃圾方法
    private void AfEKwNbj(short tbyzmyfqh0, short vmzltwkyos1) {
        short vmzltwkyos1a = vmzltwkyos1;
        short tbyzmyfqh0a = tbyzmyfqh0;
        TextUtils.isDigitsOnly("AfEKwNbj" + tbyzmyfqh0a + vmzltwkyos1a + "AfEKwNbj" + Oexngty + yKUoxhg + uefPQUR + ySjKVFf + ctRAaSB + ICCgUWS + yuaZrdH + PvfuFcf + HsEFyIt + fiswDQt + KoOIBls + HGclQYK + njapRRQ + EXlmsHJ + QQPBcjC + QNWaVTi + "");
    }

    //垃圾方法
    private void gNWTkgxf(float gupqzjppov0, char cwwmfsjpu1, long efiixfzp2, double lcctqniyy3, short adgpfgs4) {
        short adgpfgs4a = adgpfgs4;
        double lcctqniyy3a = lcctqniyy3;
        long efiixfzp2a = efiixfzp2;
        char cwwmfsjpu1a = cwwmfsjpu1;
        float gupqzjppov0a = gupqzjppov0;
        System.out.println("gNWTkgxf" + cwwmfsjpu1a + adgpfgs4a + lcctqniyy3a + efiixfzp2a + gupqzjppov0a + "gNWTkgxf" + ICCgUWS + uefPQUR + QNWaVTi + ySjKVFf + HGclQYK + ctRAaSB + yKUoxhg + njapRRQ + HsEFyIt + KoOIBls + yuaZrdH + QQPBcjC + EXlmsHJ + PvfuFcf + fiswDQt + Oexngty + "");
    }

    //垃圾方法
    private void LKAwUZMf(int gljjtffj0, byte whkkhiki1, long nybwrby2, long imjueoj3, char ucdilwzh4) {
        char ucdilwzh4a = ucdilwzh4;
        long imjueoj3a = imjueoj3;
        long nybwrby2a = nybwrby2;
        byte whkkhiki1a = whkkhiki1;
        int gljjtffj0a = gljjtffj0;
    }

    //垃圾方法
    private void XRbuStZe(byte gzfzrmve0, boolean vzwbqmdrml1, float txagxjoh2, double rkxprwspx3, boolean qtsazjwig4) {
        boolean qtsazjwig4a = qtsazjwig4;
        double rkxprwspx3a = rkxprwspx3;
        float txagxjoh2a = txagxjoh2;
        boolean vzwbqmdrml1a = vzwbqmdrml1;
        byte gzfzrmve0a = gzfzrmve0;
        new AttributedString("XRbuStZe" + txagxjoh2a + gzfzrmve0a + vzwbqmdrml1a + qtsazjwig4a + rkxprwspx3a + "XRbuStZe" + yuaZrdH + Oexngty + ySjKVFf + KoOIBls + EXlmsHJ + QQPBcjC + HsEFyIt + HGclQYK + QNWaVTi + uefPQUR + ctRAaSB + fiswDQt + yKUoxhg + ICCgUWS + njapRRQ + PvfuFcf + "");
    }

    //垃圾方法
    private void iNBdYlps(short hehqwswvrx0, long jofxwesoj1, boolean ptrqatuhv2, double zdfwtlh3) {
        double zdfwtlh3a = zdfwtlh3;
        boolean ptrqatuhv2a = ptrqatuhv2;
        long jofxwesoj1a = jofxwesoj1;
        short hehqwswvrx0a = hehqwswvrx0;
        new AttributedString("iNBdYlps" + jofxwesoj1a + ptrqatuhv2a + zdfwtlh3a + hehqwswvrx0a + "iNBdYlps" + Oexngty + ICCgUWS + uefPQUR + ySjKVFf + yKUoxhg + fiswDQt + ctRAaSB + QNWaVTi + KoOIBls + njapRRQ + EXlmsHJ + PvfuFcf + HsEFyIt + HGclQYK + yuaZrdH + QQPBcjC + "");
    }

    //垃圾方法
    private void QqIzsFPl(char jmvnjfee0) {
        char jmvnjfee0a = jmvnjfee0;
        Log.w("QqIzsFPl", "QqIzsFPl" + jmvnjfee0a + "QqIzsFPl" + KoOIBls + njapRRQ + PvfuFcf + HGclQYK + yKUoxhg + QNWaVTi + fiswDQt + HsEFyIt + uefPQUR + ICCgUWS + Oexngty + QQPBcjC + yuaZrdH + ySjKVFf + ctRAaSB + EXlmsHJ + "");
    }

    //垃圾方法
    private void UdLOJODm(char ednrijo0, short oonsejh1) {
        short oonsejh1a = oonsejh1;
        char ednrijo0a = ednrijo0;
        TextUtils.isEmpty("UdLOJODm" + oonsejh1a + ednrijo0a + "UdLOJODm" + ctRAaSB + QNWaVTi + ySjKVFf + ICCgUWS + HGclQYK + uefPQUR + QQPBcjC + njapRRQ + HsEFyIt + EXlmsHJ + fiswDQt + PvfuFcf + Oexngty + yuaZrdH + KoOIBls + yKUoxhg + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        short oonsejh1 = 100;
        char ednrijo0 = 92;
        char jmvnjfee0 = 56;
        double zdfwtlh3 = 29.29;
        boolean ptrqatuhv2 = false;
        long jofxwesoj1 = 77L;
        short hehqwswvrx0 = 14;
        boolean qtsazjwig4 = true;
        double rkxprwspx3 = 89.89;
        float txagxjoh2 = 57.57f;
        boolean vzwbqmdrml1 = true;
        byte gzfzrmve0 = 3;
        char ucdilwzh4 = 67;
        long imjueoj3 = 34L;
        long nybwrby2 = 56L;
        byte whkkhiki1 = 83;
        int gljjtffj0 = 96;
        short adgpfgs4 = 85;
        double lcctqniyy3 = 12.12;
        long efiixfzp2 = 46L;
        char cwwmfsjpu1 = 4;
        float gupqzjppov0 = 77.77f;
        short vmzltwkyos1 = 11;
        short tbyzmyfqh0 = 76;
        int tlbsjwgeh2 = 45;
        long hnmbggk1 = 21L;
        double oiwuskp0 = 99.99;
        int mojrjawy4 = 99;
        char devncvj3 = 98;
        long nvqnfkinv2 = 39L;
        float skbilkujfi1 = 66.66f;
        long ohsisceg0 = 57L;
        int vdwxovhvto2 = 87;
        int koipklxgl1 = 67;
        int hirqkrlxq0 = 1;
        float jzmivrgkqc4 = 100.100f;
        boolean ewwobjykjo3 = false;
        double aciunbknja2 = 46.46;
        char gbgmcpfwa1 = 82;
        byte awnfsij0 = 18;
        boolean qolsoqf1 = true;
        long fcuwecznm0 = 14L;
        if (intent != null) {
            UdLOJODm(ednrijo0, oonsejh1);
            iNBdYlps(hehqwswvrx0, jofxwesoj1, ptrqatuhv2, zdfwtlh3);
            LKAwUZMf(gljjtffj0, whkkhiki1, nybwrby2, imjueoj3, ucdilwzh4);
            eAKGWuBS(ohsisceg0, skbilkujfi1, nvqnfkinv2, devncvj3, mojrjawy4);
            iNBdYlps(hehqwswvrx0, jofxwesoj1, ptrqatuhv2, zdfwtlh3);
            gNWTkgxf(gupqzjppov0, cwwmfsjpu1, efiixfzp2, lcctqniyy3, adgpfgs4);
            gNWTkgxf(gupqzjppov0, cwwmfsjpu1, efiixfzp2, lcctqniyy3, adgpfgs4);
            gNWTkgxf(gupqzjppov0, cwwmfsjpu1, efiixfzp2, lcctqniyy3, adgpfgs4);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        UdLOJODm(ednrijo0, oonsejh1);
        NGbwgJUO(hirqkrlxq0, koipklxgl1, vdwxovhvto2);
        AfEKwNbj(tbyzmyfqh0, vmzltwkyos1);
        UdLOJODm(ednrijo0, oonsejh1);
        QqIzsFPl(jmvnjfee0);
        PbTJioWk(oiwuskp0, hnmbggk1, tlbsjwgeh2);
        UdLOJODm(ednrijo0, oonsejh1);
        eAKGWuBS(ohsisceg0, skbilkujfi1, nvqnfkinv2, devncvj3, mojrjawy4);
        XRbuStZe(gzfzrmve0, vzwbqmdrml1, txagxjoh2, rkxprwspx3, qtsazjwig4);
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void cuqzgsdX(double jrzxwchhr0, float tjtpbjtip1, int gydzkfq2, int ufmcfxw3) {
        int ufmcfxw3a = ufmcfxw3;
        int gydzkfq2a = gydzkfq2;
        float tjtpbjtip1a = tjtpbjtip1;
        double jrzxwchhr0a = jrzxwchhr0;
    }

    //垃圾方法
    private void QCZIdFZj(byte tuqksmzh0, boolean exvwvri1, float qvpnbdtaav2) {
        float qvpnbdtaav2a = qvpnbdtaav2;
        boolean exvwvri1a = exvwvri1;
        byte tuqksmzh0a = tuqksmzh0;
        new WeakReference("QCZIdFZj" + tuqksmzh0a + exvwvri1a + qvpnbdtaav2a + "QCZIdFZj" + Oexngty + QQPBcjC + QNWaVTi + PvfuFcf + HsEFyIt + yuaZrdH + EXlmsHJ + fiswDQt + HGclQYK + KoOIBls + ySjKVFf + ICCgUWS + uefPQUR + njapRRQ + ctRAaSB + yKUoxhg + "");
    }

    //垃圾方法
    private void vSYJbrLD(long xissbgkqi0) {
        long xissbgkqi0a = xissbgkqi0;
        Log.w("vSYJbrLD", "vSYJbrLD" + xissbgkqi0a + "vSYJbrLD" + HGclQYK + ctRAaSB + PvfuFcf + uefPQUR + EXlmsHJ + QQPBcjC + KoOIBls + HsEFyIt + ICCgUWS + fiswDQt + Oexngty + yuaZrdH + QNWaVTi + yKUoxhg + njapRRQ + ySjKVFf + "");
    }

    //垃圾方法
    private void GxpbqByA(boolean pnufajvhd0) {
        boolean pnufajvhd0a = pnufajvhd0;
        new Thread("GxpbqByA" + pnufajvhd0a + "GxpbqByA" + HGclQYK + ySjKVFf + yuaZrdH + njapRRQ + fiswDQt + EXlmsHJ + QNWaVTi + ctRAaSB + ICCgUWS + KoOIBls + uefPQUR + yKUoxhg + Oexngty + PvfuFcf + HsEFyIt + QQPBcjC + "");
    }

    //垃圾方法
    private void lCsbhRNx(char lnuqdnt0, boolean rlfdmitpx1, short rnhgveojxy2, int sdmtiou3, double frgvpostzf4) {
        double frgvpostzf4a = frgvpostzf4;
        int sdmtiou3a = sdmtiou3;
        short rnhgveojxy2a = rnhgveojxy2;
        boolean rlfdmitpx1a = rlfdmitpx1;
        char lnuqdnt0a = lnuqdnt0;
        Log.i("lCsbhRNx", "lCsbhRNx" + frgvpostzf4a + rlfdmitpx1a + lnuqdnt0a + rnhgveojxy2a + sdmtiou3a + "lCsbhRNx" + Oexngty + HsEFyIt + HGclQYK + njapRRQ + uefPQUR + EXlmsHJ + PvfuFcf + yKUoxhg + QNWaVTi + yuaZrdH + fiswDQt + ySjKVFf + ICCgUWS + QQPBcjC + ctRAaSB + KoOIBls + "");
    }

    //垃圾方法
    private void NtJIbqBJ(char nmkvjxevus0, byte cjnqahqwrm1, short neiyphi2) {
        short neiyphi2a = neiyphi2;
        byte cjnqahqwrm1a = cjnqahqwrm1;
        char nmkvjxevus0a = nmkvjxevus0;
        new File("NtJIbqBJ" + nmkvjxevus0a + cjnqahqwrm1a + neiyphi2a + "NtJIbqBJ" + ctRAaSB + QQPBcjC + yuaZrdH + ICCgUWS + HsEFyIt + yKUoxhg + QNWaVTi + HGclQYK + PvfuFcf + njapRRQ + ySjKVFf + uefPQUR + EXlmsHJ + fiswDQt + KoOIBls + Oexngty + "");
    }

    //垃圾方法
    private void shHqtLJC(char ujbtgbwdsz0, char druzfcrag1, int fnizmxbyi2) {
        int fnizmxbyi2a = fnizmxbyi2;
        char druzfcrag1a = druzfcrag1;
        char ujbtgbwdsz0a = ujbtgbwdsz0;
        new Intent("shHqtLJC" + druzfcrag1a + ujbtgbwdsz0a + fnizmxbyi2a + "shHqtLJC" + njapRRQ + ySjKVFf + yKUoxhg + yuaZrdH + QNWaVTi + uefPQUR + fiswDQt + ctRAaSB + HsEFyIt + QQPBcjC + HGclQYK + Oexngty + EXlmsHJ + PvfuFcf + ICCgUWS + KoOIBls + "");
    }

    //垃圾方法
    private void XpMZppwa(long uecvmzn0, int zrithhftb1, int ymkzzgahim2) {
        int ymkzzgahim2a = ymkzzgahim2;
        int zrithhftb1a = zrithhftb1;
        long uecvmzn0a = uecvmzn0;
        Log.e("XpMZppwa", "XpMZppwa" + uecvmzn0a + zrithhftb1a + ymkzzgahim2a + "XpMZppwa" + HsEFyIt + njapRRQ + uefPQUR + EXlmsHJ + yKUoxhg + QQPBcjC + PvfuFcf + HGclQYK + yuaZrdH + QNWaVTi + ySjKVFf + fiswDQt + Oexngty + ICCgUWS + KoOIBls + ctRAaSB + "");
    }

    public boolean onUnbind(Intent intent) {
        int ymkzzgahim2 = 30;
        int zrithhftb1 = 82;
        long uecvmzn0 = 38L;
        int fnizmxbyi2 = 58;
        char druzfcrag1 = 77;
        char ujbtgbwdsz0 = 95;
        short neiyphi2 = 73;
        byte cjnqahqwrm1 = 74;
        char nmkvjxevus0 = 87;
        double frgvpostzf4 = 69.69;
        int sdmtiou3 = 95;
        short rnhgveojxy2 = 70;
        boolean rlfdmitpx1 = true;
        char lnuqdnt0 = 0;
        boolean pnufajvhd0 = false;
        long xissbgkqi0 = 81L;
        float qvpnbdtaav2 = 38.38f;
        boolean exvwvri1 = true;
        byte tuqksmzh0 = 65;
        int ufmcfxw3 = 1;
        int gydzkfq2 = 14;
        float tjtpbjtip1 = 10.10f;
        double jrzxwchhr0 = 44.44;
        vSYJbrLD(xissbgkqi0);
        QCZIdFZj(tuqksmzh0, exvwvri1, qvpnbdtaav2);
        cuqzgsdX(jrzxwchhr0, tjtpbjtip1, gydzkfq2, ufmcfxw3);
        XpMZppwa(uecvmzn0, zrithhftb1, ymkzzgahim2);
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void RXQwPIdm(float kftqcbds0, boolean uhwsxxnp1, short olkwgufyjj2) {
        short olkwgufyjj2a = olkwgufyjj2;
        boolean uhwsxxnp1a = uhwsxxnp1;
        float kftqcbds0a = kftqcbds0;
        new Thread("RXQwPIdm" + kftqcbds0a + olkwgufyjj2a + uhwsxxnp1a + "RXQwPIdm" + yKUoxhg + fiswDQt + KoOIBls + QQPBcjC + ySjKVFf + ICCgUWS + QNWaVTi + yuaZrdH + Oexngty + HsEFyIt + uefPQUR + PvfuFcf + njapRRQ + ctRAaSB + EXlmsHJ + HGclQYK + "");
    }

    //垃圾方法
    private void EQCdgYUs(byte elqarex0, float jqvgimxd1, float zvyhqsinrj2, byte cjvbpehs3) {
        byte cjvbpehs3a = cjvbpehs3;
        float zvyhqsinrj2a = zvyhqsinrj2;
        float jqvgimxd1a = jqvgimxd1;
        byte elqarex0a = elqarex0;
        new Thread("EQCdgYUs" + jqvgimxd1a + zvyhqsinrj2a + elqarex0a + cjvbpehs3a + "EQCdgYUs" + QNWaVTi + ICCgUWS + HGclQYK + yKUoxhg + yuaZrdH + KoOIBls + njapRRQ + QQPBcjC + HsEFyIt + ySjKVFf + ctRAaSB + uefPQUR + fiswDQt + EXlmsHJ + PvfuFcf + Oexngty + "");
    }

    //垃圾方法
    private void fMjqYfRT(boolean wsczgxy0, short hghfxocivu1, int ricchxr2) {
        int ricchxr2a = ricchxr2;
        short hghfxocivu1a = hghfxocivu1;
        boolean wsczgxy0a = wsczgxy0;
        System.out.println("fMjqYfRT" + wsczgxy0a + hghfxocivu1a + ricchxr2a + "fMjqYfRT" + njapRRQ + HGclQYK + HsEFyIt + EXlmsHJ + Oexngty + QQPBcjC + QNWaVTi + ctRAaSB + PvfuFcf + yKUoxhg + ICCgUWS + ySjKVFf + KoOIBls + uefPQUR + yuaZrdH + fiswDQt + "");
    }

    //垃圾方法
    private void NoFSrYVH(double gizehex0, short kosjjznqk1) {
        short kosjjznqk1a = kosjjznqk1;
        double gizehex0a = gizehex0;
        new Intent("NoFSrYVH" + kosjjznqk1a + gizehex0a + "NoFSrYVH" + njapRRQ + PvfuFcf + EXlmsHJ + yuaZrdH + ctRAaSB + yKUoxhg + uefPQUR + ySjKVFf + HsEFyIt + ICCgUWS + QNWaVTi + Oexngty + fiswDQt + KoOIBls + HGclQYK + QQPBcjC + "");
    }

    //垃圾方法
    private void xHAbqMvb(char wzzxbkpvpf0, float mzlvynvn1) {
        float mzlvynvn1a = mzlvynvn1;
        char wzzxbkpvpf0a = wzzxbkpvpf0;
        Log.w("xHAbqMvb", "xHAbqMvb" + mzlvynvn1a + wzzxbkpvpf0a + "xHAbqMvb" + QNWaVTi + Oexngty + yuaZrdH + KoOIBls + HsEFyIt + ctRAaSB + QQPBcjC + njapRRQ + fiswDQt + yKUoxhg + ySjKVFf + PvfuFcf + HGclQYK + ICCgUWS + EXlmsHJ + uefPQUR + "");
    }

    //垃圾方法
    private void JDQanYpo(byte tkvpldmeh0, char emmpqvdznc1) {
        char emmpqvdznc1a = emmpqvdznc1;
        byte tkvpldmeh0a = tkvpldmeh0;
        new Intent("JDQanYpo" + emmpqvdznc1a + tkvpldmeh0a + "JDQanYpo" + njapRRQ + EXlmsHJ + HGclQYK + PvfuFcf + QNWaVTi + yKUoxhg + HsEFyIt + ctRAaSB + ICCgUWS + QQPBcjC + fiswDQt + ySjKVFf + KoOIBls + yuaZrdH + uefPQUR + Oexngty + "");
    }

    //垃圾方法
    private void gDzCxuKR(boolean oqtuctpkvs0, float xsdqnnxdd1, double jgrebad2) {
        double jgrebad2a = jgrebad2;
        float xsdqnnxdd1a = xsdqnnxdd1;
        boolean oqtuctpkvs0a = oqtuctpkvs0;
        Log.e("gDzCxuKR", "gDzCxuKR" + jgrebad2a + xsdqnnxdd1a + oqtuctpkvs0a + "gDzCxuKR" + PvfuFcf + QNWaVTi + HsEFyIt + ICCgUWS + QQPBcjC + ySjKVFf + EXlmsHJ + HGclQYK + ctRAaSB + Oexngty + yKUoxhg + KoOIBls + fiswDQt + uefPQUR + yuaZrdH + njapRRQ + "");
    }

    //垃圾方法
    private void CpOfwQcE(float knpsyjvtp0) {
        float knpsyjvtp0a = knpsyjvtp0;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        float knpsyjvtp0 = 73.73f;
        double jgrebad2 = 71.71;
        float xsdqnnxdd1 = 69.69f;
        boolean oqtuctpkvs0 = true;
        char emmpqvdznc1 = 39;
        byte tkvpldmeh0 = 62;
        float mzlvynvn1 = 32.32f;
        char wzzxbkpvpf0 = 69;
        short kosjjznqk1 = 2;
        double gizehex0 = 56.56;
        int ricchxr2 = 73;
        short hghfxocivu1 = 97;
        boolean wsczgxy0 = true;
        byte cjvbpehs3 = 67;
        float zvyhqsinrj2 = 17.17f;
        float jqvgimxd1 = 8.8f;
        byte elqarex0 = 42;
        short olkwgufyjj2 = 26;
        boolean uhwsxxnp1 = false;
        float kftqcbds0 = 31.31f;
        if (SpeedManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        return this.mServiceBinder;
    }

    //垃圾方法
    private void JJbaHoiz(double cxfsndfei0, boolean gdkxwxviaf1, char zmnxobozob2, char jnaxmmn3, byte fverfarpe4) {
        byte fverfarpe4a = fverfarpe4;
        char jnaxmmn3a = jnaxmmn3;
        char zmnxobozob2a = zmnxobozob2;
        boolean gdkxwxviaf1a = gdkxwxviaf1;
        double cxfsndfei0a = cxfsndfei0;
        Log.w("JJbaHoiz", "JJbaHoiz" + zmnxobozob2a + fverfarpe4a + cxfsndfei0a + gdkxwxviaf1a + jnaxmmn3a + "JJbaHoiz" + HsEFyIt + uefPQUR + EXlmsHJ + njapRRQ + yuaZrdH + KoOIBls + QQPBcjC + ICCgUWS + QNWaVTi + HGclQYK + fiswDQt + yKUoxhg + PvfuFcf + ySjKVFf + Oexngty + ctRAaSB + "");
    }

    //垃圾方法
    private void tREJmVrq(float qjlnuun0, boolean ideyece1, long unsanag2) {
        long unsanag2a = unsanag2;
        boolean ideyece1a = ideyece1;
        float qjlnuun0a = qjlnuun0;
        new File("tREJmVrq" + ideyece1a + qjlnuun0a + unsanag2a + "tREJmVrq" + KoOIBls + ICCgUWS + QQPBcjC + HsEFyIt + PvfuFcf + Oexngty + EXlmsHJ + yuaZrdH + ctRAaSB + fiswDQt + ySjKVFf + QNWaVTi + HGclQYK + yKUoxhg + uefPQUR + njapRRQ + "");
    }

    //垃圾方法
    private void pWPxuLrf(short blivwhkmqe0, long mxfbhcasi1, int odxhyqreo2) {
        int odxhyqreo2a = odxhyqreo2;
        long mxfbhcasi1a = mxfbhcasi1;
        short blivwhkmqe0a = blivwhkmqe0;
    }

    //垃圾方法
    private void rvKAwDdx(boolean xrmcowr0, byte fersgfuiq1, float wbxcyohzd2) {
        float wbxcyohzd2a = wbxcyohzd2;
        byte fersgfuiq1a = fersgfuiq1;
        boolean xrmcowr0a = xrmcowr0;
        System.out.println("rvKAwDdx" + fersgfuiq1a + xrmcowr0a + wbxcyohzd2a + "rvKAwDdx" + Oexngty + ySjKVFf + fiswDQt + QNWaVTi + yuaZrdH + QQPBcjC + KoOIBls + njapRRQ + ICCgUWS + HGclQYK + HsEFyIt + PvfuFcf + yKUoxhg + EXlmsHJ + ctRAaSB + uefPQUR + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        float wbxcyohzd2 = 29.29f;
        byte fersgfuiq1 = 76;
        boolean xrmcowr0 = false;
        int odxhyqreo2 = 25;
        long mxfbhcasi1 = 8L;
        short blivwhkmqe0 = 59;
        long unsanag2 = 17L;
        boolean ideyece1 = true;
        float qjlnuun0 = 18.18f;
        byte fverfarpe4 = 91;
        char jnaxmmn3 = 0;
        char zmnxobozob2 = 59;
        boolean gdkxwxviaf1 = false;
        double cxfsndfei0 = 13.13;
        tREJmVrq(qjlnuun0, ideyece1, unsanag2);
        rvKAwDdx(xrmcowr0, fersgfuiq1, wbxcyohzd2);
        tREJmVrq(qjlnuun0, ideyece1, unsanag2);
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            pWPxuLrf(blivwhkmqe0, mxfbhcasi1, odxhyqreo2);
            rvKAwDdx(xrmcowr0, fersgfuiq1, wbxcyohzd2);
            tREJmVrq(qjlnuun0, ideyece1, unsanag2);
            JJbaHoiz(cxfsndfei0, gdkxwxviaf1, zmnxobozob2, jnaxmmn3, fverfarpe4);
            tREJmVrq(qjlnuun0, ideyece1, unsanag2);
            pWPxuLrf(blivwhkmqe0, mxfbhcasi1, odxhyqreo2);
            pWPxuLrf(blivwhkmqe0, mxfbhcasi1, odxhyqreo2);
            if (SpeedManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            rvKAwDdx(xrmcowr0, fersgfuiq1, wbxcyohzd2);
            tREJmVrq(qjlnuun0, ideyece1, unsanag2);
            rvKAwDdx(xrmcowr0, fersgfuiq1, wbxcyohzd2);
            this.doStartMainService();
            JJbaHoiz(cxfsndfei0, gdkxwxviaf1, zmnxobozob2, jnaxmmn3, fverfarpe4);
            tREJmVrq(qjlnuun0, ideyece1, unsanag2);
            rvKAwDdx(xrmcowr0, fersgfuiq1, wbxcyohzd2);
            JJbaHoiz(cxfsndfei0, gdkxwxviaf1, zmnxobozob2, jnaxmmn3, fverfarpe4);
            rvKAwDdx(xrmcowr0, fersgfuiq1, wbxcyohzd2);
            this.doBindMainService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                if (SpeedManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void pbYZcjBj(boolean syinqlxs0, int vjhstlivgs1, long rwknxlvxn2) {
        long rwknxlvxn2a = rwknxlvxn2;
        int vjhstlivgs1a = vjhstlivgs1;
        boolean syinqlxs0a = syinqlxs0;
        new WeakReference("pbYZcjBj" + vjhstlivgs1a + syinqlxs0a + rwknxlvxn2a + "pbYZcjBj" + KoOIBls + QQPBcjC + yKUoxhg + yuaZrdH + ySjKVFf + HGclQYK + QNWaVTi + njapRRQ + uefPQUR + HsEFyIt + ctRAaSB + PvfuFcf + fiswDQt + Oexngty + EXlmsHJ + ICCgUWS + "");
    }

    //垃圾方法
    private void tCWDQzyG(float xljatsntd0, long zdrnwfgbxn1, char zykdaqc2, int khudrxpa3, char klvtqqlpc4) {
        char klvtqqlpc4a = klvtqqlpc4;
        int khudrxpa3a = khudrxpa3;
        char zykdaqc2a = zykdaqc2;
        long zdrnwfgbxn1a = zdrnwfgbxn1;
        float xljatsntd0a = xljatsntd0;
        new Intent("tCWDQzyG" + xljatsntd0a + klvtqqlpc4a + zykdaqc2a + khudrxpa3a + zdrnwfgbxn1a + "tCWDQzyG" + uefPQUR + ctRAaSB + Oexngty + yuaZrdH + ICCgUWS + HGclQYK + QQPBcjC + fiswDQt + EXlmsHJ + yKUoxhg + ySjKVFf + PvfuFcf + KoOIBls + njapRRQ + HsEFyIt + QNWaVTi + "");
    }

    //垃圾方法
    private void yHcuhNHh(short rdvfvzwow0) {
        short rdvfvzwow0a = rdvfvzwow0;
    }

    //垃圾方法
    private void LiPxtdCE(char bxtvjhg0, double dcpmofzexi1, long myrtszb2, byte uaiyzzos3) {
        byte uaiyzzos3a = uaiyzzos3;
        long myrtszb2a = myrtszb2;
        double dcpmofzexi1a = dcpmofzexi1;
        char bxtvjhg0a = bxtvjhg0;
        Log.w("LiPxtdCE", "LiPxtdCE" + bxtvjhg0a + myrtszb2a + dcpmofzexi1a + uaiyzzos3a + "LiPxtdCE" + KoOIBls + HGclQYK + QNWaVTi + fiswDQt + ICCgUWS + uefPQUR + ySjKVFf + PvfuFcf + HsEFyIt + Oexngty + yKUoxhg + yuaZrdH + ctRAaSB + njapRRQ + QQPBcjC + EXlmsHJ + "");
    }

    private void doStartMainService() {
        byte uaiyzzos3 = 41;
        long myrtszb2 = 39L;
        double dcpmofzexi1 = 42.42;
        char bxtvjhg0 = 7;
        short rdvfvzwow0 = 38;
        char klvtqqlpc4 = 35;
        int khudrxpa3 = 65;
        char zykdaqc2 = 38;
        long zdrnwfgbxn1 = 92L;
        float xljatsntd0 = 83.83f;
        long rwknxlvxn2 = 15L;
        int vjhstlivgs1 = 24;
        boolean syinqlxs0 = false;
        yHcuhNHh(rdvfvzwow0);
        pbYZcjBj(syinqlxs0, vjhstlivgs1, rwknxlvxn2);
        pbYZcjBj(syinqlxs0, vjhstlivgs1, rwknxlvxn2);
        tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
        try {
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            Intent intent = new Intent(this, Speed1Service.class);
            intent.putExtra("isStartService", true);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            pbYZcjBj(syinqlxs0, vjhstlivgs1, rwknxlvxn2);
            tCWDQzyG(xljatsntd0, zdrnwfgbxn1, zykdaqc2, khudrxpa3, klvtqqlpc4);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (SpeedManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾变量
    private float yKUoxhg = 32.32f;

    // 绑定状态标志
    private boolean mIsBound = false;

    //垃圾方法
    private void eTJfFnlE(short nvjrspuebi0, long ypwmoazdch1, long kzsdzok2, double cxqdtkj3, double jcbfvvec4) {
        double jcbfvvec4a = jcbfvvec4;
        double cxqdtkj3a = cxqdtkj3;
        long kzsdzok2a = kzsdzok2;
        long ypwmoazdch1a = ypwmoazdch1;
        short nvjrspuebi0a = nvjrspuebi0;
        new AttributedString("eTJfFnlE" + kzsdzok2a + ypwmoazdch1a + cxqdtkj3a + nvjrspuebi0a + jcbfvvec4a + "eTJfFnlE" + ICCgUWS + HGclQYK + QNWaVTi + yuaZrdH + EXlmsHJ + QQPBcjC + yKUoxhg + fiswDQt + PvfuFcf + njapRRQ + Oexngty + ctRAaSB + ySjKVFf + HsEFyIt + uefPQUR + KoOIBls + "");
    }

    //垃圾方法
    private void rChoDgSl(byte jyzsngiyle0, float vclhjadh1) {
        float vclhjadh1a = vclhjadh1;
        byte jyzsngiyle0a = jyzsngiyle0;
        Log.e("rChoDgSl", "rChoDgSl" + jyzsngiyle0a + vclhjadh1a + "rChoDgSl" + Oexngty + KoOIBls + HGclQYK + EXlmsHJ + HsEFyIt + QQPBcjC + yuaZrdH + njapRRQ + fiswDQt + ctRAaSB + PvfuFcf + ySjKVFf + QNWaVTi + ICCgUWS + yKUoxhg + uefPQUR + "");
    }

    //垃圾方法
    private void QwwfcBVH(char pujswmlvny0, char hcmaiqhc1, long lvnlediqp2) {
        long lvnlediqp2a = lvnlediqp2;
        char hcmaiqhc1a = hcmaiqhc1;
        char pujswmlvny0a = pujswmlvny0;
        Log.w("QwwfcBVH", "QwwfcBVH" + hcmaiqhc1a + pujswmlvny0a + lvnlediqp2a + "QwwfcBVH" + fiswDQt + yuaZrdH + QQPBcjC + uefPQUR + ySjKVFf + KoOIBls + QNWaVTi + ICCgUWS + PvfuFcf + njapRRQ + HGclQYK + yKUoxhg + HsEFyIt + ctRAaSB + EXlmsHJ + Oexngty + "");
    }

    //垃圾方法
    private void vMFerzYm(char bpoigcuyr0, double tmesczw1, char eiumptzgqr2) {
        char eiumptzgqr2a = eiumptzgqr2;
        double tmesczw1a = tmesczw1;
        char bpoigcuyr0a = bpoigcuyr0;
        new Thread("vMFerzYm" + eiumptzgqr2a + bpoigcuyr0a + tmesczw1a + "vMFerzYm" + ICCgUWS + uefPQUR + njapRRQ + HGclQYK + yKUoxhg + EXlmsHJ + fiswDQt + KoOIBls + yuaZrdH + HsEFyIt + ySjKVFf + QQPBcjC + Oexngty + PvfuFcf + QNWaVTi + ctRAaSB + "");
    }

    //垃圾方法
    private void MjDiMcnp(int depyuzqaon0, char sezgvckvok1) {
        char sezgvckvok1a = sezgvckvok1;
        int depyuzqaon0a = depyuzqaon0;
        new StringBuffer("MjDiMcnp" + sezgvckvok1a + depyuzqaon0a + "MjDiMcnp" + yKUoxhg + ySjKVFf + ICCgUWS + fiswDQt + QNWaVTi + KoOIBls + ctRAaSB + Oexngty + uefPQUR + EXlmsHJ + QQPBcjC + PvfuFcf + HGclQYK + njapRRQ + HsEFyIt + yuaZrdH + "");
    }

    //垃圾方法
    private void IHiNTMLX(double sfmuzklrw0) {
        double sfmuzklrw0a = sfmuzklrw0;
        new StringReader("IHiNTMLX" + sfmuzklrw0a + "IHiNTMLX" + PvfuFcf + KoOIBls + ySjKVFf + uefPQUR + QQPBcjC + ctRAaSB + njapRRQ + ICCgUWS + QNWaVTi + EXlmsHJ + fiswDQt + HGclQYK + HsEFyIt + Oexngty + yKUoxhg + yuaZrdH + "");
    }

    //垃圾方法
    private void uYAKssuS(double njpguralb0, float wmbathslk1, byte eifigfa2, short nbhpzhrwy3, byte cosmhiwqhr4) {
        byte cosmhiwqhr4a = cosmhiwqhr4;
        short nbhpzhrwy3a = nbhpzhrwy3;
        byte eifigfa2a = eifigfa2;
        float wmbathslk1a = wmbathslk1;
        double njpguralb0a = njpguralb0;
        TextUtils.isEmpty("uYAKssuS" + nbhpzhrwy3a + cosmhiwqhr4a + wmbathslk1a + eifigfa2a + njpguralb0a + "uYAKssuS" + njapRRQ + EXlmsHJ + QNWaVTi + ySjKVFf + uefPQUR + yKUoxhg + Oexngty + ctRAaSB + KoOIBls + QQPBcjC + yuaZrdH + ICCgUWS + PvfuFcf + fiswDQt + HGclQYK + HsEFyIt + "");
    }

    //垃圾方法
    private void rmgtHApy(float sjaaqecpq0, short nvfrgkpo1) {
        short nvfrgkpo1a = nvfrgkpo1;
        float sjaaqecpq0a = sjaaqecpq0;
        new Thread("rmgtHApy" + nvfrgkpo1a + sjaaqecpq0a + "rmgtHApy" + Oexngty + QQPBcjC + PvfuFcf + ySjKVFf + uefPQUR + KoOIBls + ctRAaSB + EXlmsHJ + fiswDQt + yuaZrdH + yKUoxhg + njapRRQ + HGclQYK + ICCgUWS + QNWaVTi + HsEFyIt + "");
    }

    private void doBindMainService() {
        short nvfrgkpo1 = 16;
        float sjaaqecpq0 = 8.8f;
        byte cosmhiwqhr4 = 14;
        short nbhpzhrwy3 = 2;
        byte eifigfa2 = 0;
        float wmbathslk1 = 31.31f;
        double njpguralb0 = 67.67;
        double sfmuzklrw0 = 90.90;
        char sezgvckvok1 = 79;
        int depyuzqaon0 = 80;
        char eiumptzgqr2 = 44;
        double tmesczw1 = 47.47;
        char bpoigcuyr0 = 42;
        long lvnlediqp2 = 55L;
        char hcmaiqhc1 = 38;
        char pujswmlvny0 = 27;
        float vclhjadh1 = 27.27f;
        byte jyzsngiyle0 = 4;
        double jcbfvvec4 = 98.98;
        double cxqdtkj3 = 32.32;
        long kzsdzok2 = 85L;
        long ypwmoazdch1 = 8L;
        short nvjrspuebi0 = 74;
        MjDiMcnp(depyuzqaon0, sezgvckvok1);
        rmgtHApy(sjaaqecpq0, nvfrgkpo1);
        vMFerzYm(bpoigcuyr0, tmesczw1, eiumptzgqr2);
        MjDiMcnp(depyuzqaon0, sezgvckvok1);
        rmgtHApy(sjaaqecpq0, nvfrgkpo1);
        eTJfFnlE(nvjrspuebi0, ypwmoazdch1, kzsdzok2, cxqdtkj3, jcbfvvec4);
        rChoDgSl(jyzsngiyle0, vclhjadh1);
        IHiNTMLX(sfmuzklrw0);
        if (SpeedManager.isDebug) {
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        try {
            mIsBound = this.bindService(new Intent(this, Speed1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (SpeedManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void qkxBqeai(int djxukiaujg0) {
        int djxukiaujg0a = djxukiaujg0;
        TextUtils.isEmpty("qkxBqeai" + djxukiaujg0a + "qkxBqeai" + njapRRQ + QNWaVTi + ctRAaSB + yKUoxhg + EXlmsHJ + QQPBcjC + PvfuFcf + HsEFyIt + KoOIBls + fiswDQt + HGclQYK + Oexngty + uefPQUR + ICCgUWS + ySjKVFf + yuaZrdH + "");
    }

    //垃圾方法
    private void xQZpFHMQ(boolean ytahsqbeqp0, int aqtwjrx1, char goozsqrzr2) {
        char goozsqrzr2a = goozsqrzr2;
        int aqtwjrx1a = aqtwjrx1;
        boolean ytahsqbeqp0a = ytahsqbeqp0;
        Log.w("xQZpFHMQ", "xQZpFHMQ" + ytahsqbeqp0a + aqtwjrx1a + goozsqrzr2a + "xQZpFHMQ" + fiswDQt + HsEFyIt + uefPQUR + PvfuFcf + QNWaVTi + Oexngty + QQPBcjC + njapRRQ + HGclQYK + ICCgUWS + yuaZrdH + EXlmsHJ + KoOIBls + yKUoxhg + ctRAaSB + ySjKVFf + "");
    }

    //垃圾方法
    private void pvnfVsvW(float pngocgvjl0, double glcyxwx1) {
        double glcyxwx1a = glcyxwx1;
        float pngocgvjl0a = pngocgvjl0;
        Log.w("pvnfVsvW", "pvnfVsvW" + pngocgvjl0a + glcyxwx1a + "pvnfVsvW" + HsEFyIt + ctRAaSB + ICCgUWS + QQPBcjC + Oexngty + QNWaVTi + EXlmsHJ + HGclQYK + fiswDQt + PvfuFcf + yKUoxhg + ySjKVFf + KoOIBls + njapRRQ + yuaZrdH + uefPQUR + "");
    }

    //垃圾方法
    private void nncZIXwP(int kgdaqrj0, long ftyyrudd1) {
        long ftyyrudd1a = ftyyrudd1;
        int kgdaqrj0a = kgdaqrj0;
        Log.i("nncZIXwP", "nncZIXwP" + kgdaqrj0a + ftyyrudd1a + "nncZIXwP" + fiswDQt + KoOIBls + QNWaVTi + yuaZrdH + ICCgUWS + QQPBcjC + Oexngty + HsEFyIt + njapRRQ + PvfuFcf + uefPQUR + EXlmsHJ + ySjKVFf + yKUoxhg + ctRAaSB + HGclQYK + "");
    }

    //垃圾方法
    private void fLkDvofn(double hlpocey0, int zidvqkb1) {
        int zidvqkb1a = zidvqkb1;
        double hlpocey0a = hlpocey0;
        new StringReader("fLkDvofn" + hlpocey0a + zidvqkb1a + "fLkDvofn" + ySjKVFf + ctRAaSB + njapRRQ + HGclQYK + fiswDQt + yuaZrdH + HsEFyIt + PvfuFcf + Oexngty + ICCgUWS + QNWaVTi + EXlmsHJ + yKUoxhg + uefPQUR + KoOIBls + QQPBcjC + "");
    }

    //垃圾方法
    private void gXgXGmZO(double duuczkh0, float bsfbfgf1, double bjdjvyb2) {
        double bjdjvyb2a = bjdjvyb2;
        float bsfbfgf1a = bsfbfgf1;
        double duuczkh0a = duuczkh0;
    }

    //垃圾方法
    private void YeLSGtWD(char dndenxzeek0, int gfzyttwoxq1, boolean cwdrprype2, float xbwlzzpjht3, int aczoydpiu4) {
        int aczoydpiu4a = aczoydpiu4;
        float xbwlzzpjht3a = xbwlzzpjht3;
        boolean cwdrprype2a = cwdrprype2;
        int gfzyttwoxq1a = gfzyttwoxq1;
        char dndenxzeek0a = dndenxzeek0;
    }

    //垃圾方法
    private void jnuTCnXE(long etkqkqbhe0, long wfnjboyu1, double kwekxvzoyh2) {
        double kwekxvzoyh2a = kwekxvzoyh2;
        long wfnjboyu1a = wfnjboyu1;
        long etkqkqbhe0a = etkqkqbhe0;
        Log.i("jnuTCnXE", "jnuTCnXE" + wfnjboyu1a + kwekxvzoyh2a + etkqkqbhe0a + "jnuTCnXE" + fiswDQt + EXlmsHJ + KoOIBls + yuaZrdH + njapRRQ + yKUoxhg + ySjKVFf + QQPBcjC + QNWaVTi + ICCgUWS + Oexngty + PvfuFcf + HGclQYK + ctRAaSB + uefPQUR + HsEFyIt + "");
    }

    //垃圾方法
    private void dOTxIKut(byte jgghavhgdi0, long zjccjuvue1, float reugyshket2, short rruqkoamk3) {
        short rruqkoamk3a = rruqkoamk3;
        float reugyshket2a = reugyshket2;
        long zjccjuvue1a = zjccjuvue1;
        byte jgghavhgdi0a = jgghavhgdi0;
        TextUtils.isEmpty("dOTxIKut" + jgghavhgdi0a + reugyshket2a + rruqkoamk3a + zjccjuvue1a + "dOTxIKut" + QNWaVTi + njapRRQ + yuaZrdH + ySjKVFf + EXlmsHJ + Oexngty + ctRAaSB + ICCgUWS + QQPBcjC + fiswDQt + PvfuFcf + yKUoxhg + uefPQUR + HsEFyIt + HGclQYK + KoOIBls + "");
    }

    //垃圾方法
    private void MfAIzVDa(double gjagzlgka0, short ybbztzy1) {
        short ybbztzy1a = ybbztzy1;
        double gjagzlgka0a = gjagzlgka0;
        Log.i("MfAIzVDa", "MfAIzVDa" + ybbztzy1a + gjagzlgka0a + "MfAIzVDa" + njapRRQ + Oexngty + ICCgUWS + yuaZrdH + QNWaVTi + HGclQYK + EXlmsHJ + HsEFyIt + uefPQUR + fiswDQt + KoOIBls + QQPBcjC + ctRAaSB + yKUoxhg + ySjKVFf + PvfuFcf + "");
    }

    //垃圾方法
    private void GRshWVjg(float riisbmskvd0, boolean xtdmtpvye1, double wqdoevt2, byte ladzsfby3) {
        byte ladzsfby3a = ladzsfby3;
        double wqdoevt2a = wqdoevt2;
        boolean xtdmtpvye1a = xtdmtpvye1;
        float riisbmskvd0a = riisbmskvd0;
        new WeakReference("GRshWVjg" + riisbmskvd0a + xtdmtpvye1a + wqdoevt2a + ladzsfby3a + "GRshWVjg" + ctRAaSB + EXlmsHJ + QQPBcjC + uefPQUR + Oexngty + yKUoxhg + yuaZrdH + HsEFyIt + fiswDQt + PvfuFcf + KoOIBls + njapRRQ + ySjKVFf + HGclQYK + ICCgUWS + QNWaVTi + "");
    }

    //垃圾方法
    private void NqCbljjr(long lxvklqkwht0, float kaqajmwy1, long ewsmmopdu2, long pmwlpexh3, boolean txuqeswlgz4) {
        boolean txuqeswlgz4a = txuqeswlgz4;
        long pmwlpexh3a = pmwlpexh3;
        long ewsmmopdu2a = ewsmmopdu2;
        float kaqajmwy1a = kaqajmwy1;
        long lxvklqkwht0a = lxvklqkwht0;
        System.out.println("NqCbljjr" + lxvklqkwht0a + pmwlpexh3a + txuqeswlgz4a + ewsmmopdu2a + kaqajmwy1a + "NqCbljjr" + EXlmsHJ + HGclQYK + PvfuFcf + ctRAaSB + KoOIBls + QQPBcjC + ICCgUWS + fiswDQt + ySjKVFf + Oexngty + yuaZrdH + QNWaVTi + uefPQUR + njapRRQ + yKUoxhg + HsEFyIt + "");
    }

    //垃圾方法
    private void aMOPyOMw(char mshqtwv0, int hsldhicg1) {
        int hsldhicg1a = hsldhicg1;
        char mshqtwv0a = mshqtwv0;
        new StringBuffer("aMOPyOMw" + hsldhicg1a + mshqtwv0a + "aMOPyOMw" + HsEFyIt + KoOIBls + njapRRQ + Oexngty + yKUoxhg + ySjKVFf + uefPQUR + ICCgUWS + QNWaVTi + ctRAaSB + PvfuFcf + fiswDQt + yuaZrdH + HGclQYK + QQPBcjC + EXlmsHJ + "");
    }

    //垃圾方法
    private void udIGddzc(long xworzokqg0) {
        long xworzokqg0a = xworzokqg0;
        Log.i("udIGddzc", "udIGddzc" + xworzokqg0a + "udIGddzc" + yKUoxhg + HGclQYK + QQPBcjC + uefPQUR + KoOIBls + EXlmsHJ + njapRRQ + Oexngty + HsEFyIt + fiswDQt + QNWaVTi + ySjKVFf + ICCgUWS + PvfuFcf + ctRAaSB + yuaZrdH + "");
    }

    //垃圾方法
    private void OkvIcWpU(short tlyjhucm0, short sptvnckr1, double bjunjvjj2, boolean zcevjijqz3, char mhvndkao4) {
        char mhvndkao4a = mhvndkao4;
        boolean zcevjijqz3a = zcevjijqz3;
        double bjunjvjj2a = bjunjvjj2;
        short sptvnckr1a = sptvnckr1;
        short tlyjhucm0a = tlyjhucm0;
    }

    //垃圾方法
    private void ZdhpXzPE(double hhnpvdhdk0, long rraqfqmm1) {
        long rraqfqmm1a = rraqfqmm1;
        double hhnpvdhdk0a = hhnpvdhdk0;
        new AttributedString("ZdhpXzPE" + rraqfqmm1a + hhnpvdhdk0a + "ZdhpXzPE" + HsEFyIt + EXlmsHJ + KoOIBls + fiswDQt + njapRRQ + Oexngty + QQPBcjC + yKUoxhg + PvfuFcf + ICCgUWS + uefPQUR + yuaZrdH + QNWaVTi + ctRAaSB + HGclQYK + ySjKVFf + "");
    }

    //垃圾方法
    private void xGaWgmwi(int aorfjovb0, char rwpdwio1) {
        char rwpdwio1a = rwpdwio1;
        int aorfjovb0a = aorfjovb0;
        Log.i("xGaWgmwi", "xGaWgmwi" + rwpdwio1a + aorfjovb0a + "xGaWgmwi" + HGclQYK + uefPQUR + Oexngty + QNWaVTi + HsEFyIt + PvfuFcf + QQPBcjC + yuaZrdH + ctRAaSB + KoOIBls + ICCgUWS + fiswDQt + yKUoxhg + njapRRQ + ySjKVFf + EXlmsHJ + "");
    }

    //垃圾方法
    private void YjbnHTFX(double tlblmao0, byte cfszmhaxhh1, float qfxswqhos2, boolean dqxwbhuk3) {
        boolean dqxwbhuk3a = dqxwbhuk3;
        float qfxswqhos2a = qfxswqhos2;
        byte cfszmhaxhh1a = cfszmhaxhh1;
        double tlblmao0a = tlblmao0;
        new String("YjbnHTFX" + dqxwbhuk3a + cfszmhaxhh1a + tlblmao0a + qfxswqhos2a + "YjbnHTFX" + Oexngty + fiswDQt + yKUoxhg + ySjKVFf + QNWaVTi + EXlmsHJ + QQPBcjC + KoOIBls + yuaZrdH + uefPQUR + HGclQYK + ctRAaSB + ICCgUWS + HsEFyIt + PvfuFcf + njapRRQ + "");
    }

    //垃圾方法
    private void wwOhuryZ(double pfjlfiyx0, long whcahkod1, float rtvkxtncev2, long saqmggg3) {
        long saqmggg3a = saqmggg3;
        float rtvkxtncev2a = rtvkxtncev2;
        long whcahkod1a = whcahkod1;
        double pfjlfiyx0a = pfjlfiyx0;
        new String("wwOhuryZ" + whcahkod1a + pfjlfiyx0a + rtvkxtncev2a + saqmggg3a + "wwOhuryZ" + PvfuFcf + Oexngty + HGclQYK + yKUoxhg + ctRAaSB + QNWaVTi + ICCgUWS + QQPBcjC + yuaZrdH + HsEFyIt + EXlmsHJ + fiswDQt + KoOIBls + njapRRQ + ySjKVFf + uefPQUR + "");
    }

    //垃圾方法
    private void qxTkfxKt(double hqbzinlsnx0, float ragpnqg1, byte ewbfjff2) {
        byte ewbfjff2a = ewbfjff2;
        float ragpnqg1a = ragpnqg1;
        double hqbzinlsnx0a = hqbzinlsnx0;
        new File("qxTkfxKt" + hqbzinlsnx0a + ewbfjff2a + ragpnqg1a + "qxTkfxKt" + uefPQUR + Oexngty + ctRAaSB + PvfuFcf + ICCgUWS + HGclQYK + EXlmsHJ + yuaZrdH + QNWaVTi + HsEFyIt + QQPBcjC + KoOIBls + njapRRQ + yKUoxhg + ySjKVFf + fiswDQt + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        byte ewbfjff2 = 1;
        float ragpnqg1 = 65.65f;
        double hqbzinlsnx0 = 93.93;
        long saqmggg3 = 71L;
        float rtvkxtncev2 = 82.82f;
        long whcahkod1 = 9L;
        double pfjlfiyx0 = 84.84;
        boolean dqxwbhuk3 = false;
        float qfxswqhos2 = 12.12f;
        byte cfszmhaxhh1 = 66;
        double tlblmao0 = 3.3;
        char rwpdwio1 = 7;
        int aorfjovb0 = 5;
        long rraqfqmm1 = 53L;
        double hhnpvdhdk0 = 0.0;
        char mhvndkao4 = 89;
        boolean zcevjijqz3 = false;
        double bjunjvjj2 = 32.32;
        short sptvnckr1 = 31;
        short tlyjhucm0 = 4;
        long xworzokqg0 = 88L;
        int hsldhicg1 = 65;
        char mshqtwv0 = 5;
        boolean txuqeswlgz4 = false;
        long pmwlpexh3 = 59L;
        long ewsmmopdu2 = 27L;
        float kaqajmwy1 = 59.59f;
        long lxvklqkwht0 = 11L;
        byte ladzsfby3 = 50;
        double wqdoevt2 = 84.84;
        boolean xtdmtpvye1 = false;
        float riisbmskvd0 = 36.36f;
        short ybbztzy1 = 85;
        double gjagzlgka0 = 15.15;
        short rruqkoamk3 = 4;
        float reugyshket2 = 57.57f;
        long zjccjuvue1 = 28L;
        byte jgghavhgdi0 = 0;
        double kwekxvzoyh2 = 65.65;
        long wfnjboyu1 = 17L;
        long etkqkqbhe0 = 10L;
        int aczoydpiu4 = 48;
        float xbwlzzpjht3 = 51.51f;
        boolean cwdrprype2 = true;
        int gfzyttwoxq1 = 16;
        char dndenxzeek0 = 82;
        double bjdjvyb2 = 57.57;
        float bsfbfgf1 = 21.21f;
        double duuczkh0 = 79.79;
        int zidvqkb1 = 21;
        double hlpocey0 = 86.86;
        long ftyyrudd1 = 56L;
        int kgdaqrj0 = 86;
        double glcyxwx1 = 95.95;
        float pngocgvjl0 = 1.1f;
        char goozsqrzr2 = 54;
        int aqtwjrx1 = 88;
        boolean ytahsqbeqp0 = true;
        int djxukiaujg0 = 90;
        MfAIzVDa(gjagzlgka0, ybbztzy1);
        OkvIcWpU(tlyjhucm0, sptvnckr1, bjunjvjj2, zcevjijqz3, mhvndkao4);
        dOTxIKut(jgghavhgdi0, zjccjuvue1, reugyshket2, rruqkoamk3);
        qkxBqeai(djxukiaujg0);
        xGaWgmwi(aorfjovb0, rwpdwio1);
        mainBinder = null;
        if (SpeedManager.isDebug) {
            OkvIcWpU(tlyjhucm0, sptvnckr1, bjunjvjj2, zcevjijqz3, mhvndkao4);
            xGaWgmwi(aorfjovb0, rwpdwio1);
            dOTxIKut(jgghavhgdi0, zjccjuvue1, reugyshket2, rruqkoamk3);
            NqCbljjr(lxvklqkwht0, kaqajmwy1, ewsmmopdu2, pmwlpexh3, txuqeswlgz4);
            dOTxIKut(jgghavhgdi0, zjccjuvue1, reugyshket2, rruqkoamk3);
            fLkDvofn(hlpocey0, zidvqkb1);
            YeLSGtWD(dndenxzeek0, gfzyttwoxq1, cwdrprype2, xbwlzzpjht3, aczoydpiu4);
            YjbnHTFX(tlblmao0, cfszmhaxhh1, qfxswqhos2, dqxwbhuk3);
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        dOTxIKut(jgghavhgdi0, zjccjuvue1, reugyshket2, rruqkoamk3);
        qxTkfxKt(hqbzinlsnx0, ragpnqg1, ewbfjff2);
        wwOhuryZ(pfjlfiyx0, whcahkod1, rtvkxtncev2, saqmggg3);
        wwOhuryZ(pfjlfiyx0, whcahkod1, rtvkxtncev2, saqmggg3);
        xQZpFHMQ(ytahsqbeqp0, aqtwjrx1, goozsqrzr2);
        isReTryBinding = true;
        OkvIcWpU(tlyjhucm0, sptvnckr1, bjunjvjj2, zcevjijqz3, mhvndkao4);
        MfAIzVDa(gjagzlgka0, ybbztzy1);
        dOTxIKut(jgghavhgdi0, zjccjuvue1, reugyshket2, rruqkoamk3);
        ZdhpXzPE(hhnpvdhdk0, rraqfqmm1);
        OkvIcWpU(tlyjhucm0, sptvnckr1, bjunjvjj2, zcevjijqz3, mhvndkao4);
        this.startMainService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void mMZcnNDl(short onwctue0, long irrgqilag1, double mxwbkqsbu2) {
        double mxwbkqsbu2a = mxwbkqsbu2;
        long irrgqilag1a = irrgqilag1;
        short onwctue0a = onwctue0;
        new File("mMZcnNDl" + onwctue0a + irrgqilag1a + mxwbkqsbu2a + "mMZcnNDl" + HsEFyIt + ySjKVFf + QNWaVTi + Oexngty + yuaZrdH + njapRRQ + uefPQUR + PvfuFcf + KoOIBls + HGclQYK + QQPBcjC + fiswDQt + ctRAaSB + yKUoxhg + EXlmsHJ + ICCgUWS + "");
    }

    //垃圾方法
    private void AGCOTzes(double txxwcybunj0) {
        double txxwcybunj0a = txxwcybunj0;
        new Thread("AGCOTzes" + txxwcybunj0a + "AGCOTzes" + uefPQUR + QNWaVTi + ICCgUWS + HsEFyIt + KoOIBls + ctRAaSB + njapRRQ + fiswDQt + yuaZrdH + Oexngty + EXlmsHJ + yKUoxhg + QQPBcjC + ySjKVFf + PvfuFcf + HGclQYK + "");
    }

    //垃圾方法
    private void daQFbpVO(double jletlbosz0, short ugtlzvo1, char ofejzsf2, long ryhvbrt3, int wascinbuga4) {
        int wascinbuga4a = wascinbuga4;
        long ryhvbrt3a = ryhvbrt3;
        char ofejzsf2a = ofejzsf2;
        short ugtlzvo1a = ugtlzvo1;
        double jletlbosz0a = jletlbosz0;
        new StringBuilder("daQFbpVO" + jletlbosz0a + ugtlzvo1a + ryhvbrt3a + wascinbuga4a + ofejzsf2a + "daQFbpVO" + QNWaVTi + yuaZrdH + ySjKVFf + QQPBcjC + ctRAaSB + yKUoxhg + ICCgUWS + Oexngty + HsEFyIt + fiswDQt + HGclQYK + PvfuFcf + EXlmsHJ + KoOIBls + uefPQUR + njapRRQ + "");
    }

    //垃圾方法
    private void TnBpODCs(double ykszkxq0, double wuhxneaz1, int fhwqghtexe2) {
        int fhwqghtexe2a = fhwqghtexe2;
        double wuhxneaz1a = wuhxneaz1;
        double ykszkxq0a = ykszkxq0;
        new Thread("TnBpODCs" + wuhxneaz1a + fhwqghtexe2a + ykszkxq0a + "TnBpODCs" + njapRRQ + PvfuFcf + HsEFyIt + Oexngty + yKUoxhg + fiswDQt + KoOIBls + ICCgUWS + QQPBcjC + ctRAaSB + HGclQYK + yuaZrdH + EXlmsHJ + ySjKVFf + QNWaVTi + uefPQUR + "");
    }

    //垃圾方法
    private void nmhGJXYZ(long zzaconqog0, int qgyieeid1, float cexwtbg2) {
        float cexwtbg2a = cexwtbg2;
        int qgyieeid1a = qgyieeid1;
        long zzaconqog0a = zzaconqog0;
        new String("nmhGJXYZ" + cexwtbg2a + zzaconqog0a + qgyieeid1a + "nmhGJXYZ" + yKUoxhg + Oexngty + QNWaVTi + ctRAaSB + KoOIBls + PvfuFcf + ICCgUWS + HsEFyIt + fiswDQt + uefPQUR + EXlmsHJ + njapRRQ + yuaZrdH + QQPBcjC + HGclQYK + ySjKVFf + "");
    }

    //垃圾方法
    private void xjfYrluX(boolean slqglfbx0) {
        boolean slqglfbx0a = slqglfbx0;
        new StringBuffer("xjfYrluX" + slqglfbx0a + "xjfYrluX" + ySjKVFf + QQPBcjC + Oexngty + QNWaVTi + EXlmsHJ + HsEFyIt + KoOIBls + njapRRQ + ICCgUWS + yuaZrdH + fiswDQt + yKUoxhg + uefPQUR + PvfuFcf + HGclQYK + ctRAaSB + "");
    }

    //垃圾方法
    private void JWcdCiXC(short ndhheyp0, float jxypwsda1, long hwekzdi2, float qfhzfjsp3, char xhigtgk4) {
        char xhigtgk4a = xhigtgk4;
        float qfhzfjsp3a = qfhzfjsp3;
        long hwekzdi2a = hwekzdi2;
        float jxypwsda1a = jxypwsda1;
        short ndhheyp0a = ndhheyp0;
        System.out.println("JWcdCiXC" + qfhzfjsp3a + jxypwsda1a + hwekzdi2a + ndhheyp0a + xhigtgk4a + "JWcdCiXC" + ICCgUWS + KoOIBls + yKUoxhg + Oexngty + fiswDQt + ySjKVFf + HGclQYK + uefPQUR + njapRRQ + HsEFyIt + PvfuFcf + QNWaVTi + ctRAaSB + QQPBcjC + yuaZrdH + EXlmsHJ + "");
    }

    //垃圾方法
    private void gavFUxGl(int ndiylan0, float igefngpu1) {
        float igefngpu1a = igefngpu1;
        int ndiylan0a = ndiylan0;
        new StringBuffer("gavFUxGl" + igefngpu1a + ndiylan0a + "gavFUxGl" + ySjKVFf + PvfuFcf + HsEFyIt + Oexngty + ctRAaSB + QNWaVTi + EXlmsHJ + yKUoxhg + njapRRQ + QQPBcjC + ICCgUWS + yuaZrdH + HGclQYK + fiswDQt + uefPQUR + KoOIBls + "");
    }

    //垃圾方法
    private void vFQCPBdK(short lznbabaxz0, int xxtutrubf1, int zbkpkaha2, byte fmjwykauf3, char prxxcfv4) {
        char prxxcfv4a = prxxcfv4;
        byte fmjwykauf3a = fmjwykauf3;
        int zbkpkaha2a = zbkpkaha2;
        int xxtutrubf1a = xxtutrubf1;
        short lznbabaxz0a = lznbabaxz0;
        TextUtils.isDigitsOnly("vFQCPBdK" + zbkpkaha2a + fmjwykauf3a + lznbabaxz0a + prxxcfv4a + xxtutrubf1a + "vFQCPBdK" + Oexngty + njapRRQ + ctRAaSB + EXlmsHJ + yKUoxhg + ICCgUWS + uefPQUR + PvfuFcf + HGclQYK + KoOIBls + HsEFyIt + yuaZrdH + QNWaVTi + QQPBcjC + fiswDQt + ySjKVFf + "");
    }

    //垃圾方法
    private void JzXumqOt(long uhobewniqd0) {
        long uhobewniqd0a = uhobewniqd0;
        TextUtils.isDigitsOnly("JzXumqOt" + uhobewniqd0a + "JzXumqOt" + KoOIBls + njapRRQ + PvfuFcf + ctRAaSB + yKUoxhg + ySjKVFf + EXlmsHJ + QNWaVTi + HsEFyIt + uefPQUR + fiswDQt + ICCgUWS + QQPBcjC + Oexngty + HGclQYK + yuaZrdH + "");
    }

    //垃圾方法
    private void bBVlkQBH(int uwasejmfj0, byte iiojhepwf1, byte awytuxvp2) {
        byte awytuxvp2a = awytuxvp2;
        byte iiojhepwf1a = iiojhepwf1;
        int uwasejmfj0a = uwasejmfj0;
        TextUtils.isDigitsOnly("bBVlkQBH" + awytuxvp2a + iiojhepwf1a + uwasejmfj0a + "bBVlkQBH" + HGclQYK + ICCgUWS + uefPQUR + fiswDQt + QNWaVTi + njapRRQ + HsEFyIt + yKUoxhg + EXlmsHJ + Oexngty + ySjKVFf + KoOIBls + yuaZrdH + QQPBcjC + ctRAaSB + PvfuFcf + "");
    }

    //垃圾方法
    private void XmCmZpfA(float yfpcpnn0) {
        float yfpcpnn0a = yfpcpnn0;
        new Intent("XmCmZpfA" + yfpcpnn0a + "XmCmZpfA" + njapRRQ + QQPBcjC + uefPQUR + ICCgUWS + HsEFyIt + QNWaVTi + HGclQYK + KoOIBls + ctRAaSB + Oexngty + yuaZrdH + EXlmsHJ + ySjKVFf + PvfuFcf + yKUoxhg + fiswDQt + "");
    }

    //垃圾方法
    private void NmqYKKwd(short iehoowrhp0, boolean jpplepssv1) {
        boolean jpplepssv1a = jpplepssv1;
        short iehoowrhp0a = iehoowrhp0;
        Log.w("NmqYKKwd", "NmqYKKwd" + iehoowrhp0a + jpplepssv1a + "NmqYKKwd" + ICCgUWS + fiswDQt + Oexngty + EXlmsHJ + njapRRQ + HGclQYK + uefPQUR + ctRAaSB + QQPBcjC + HsEFyIt + ySjKVFf + yuaZrdH + yKUoxhg + KoOIBls + PvfuFcf + QNWaVTi + "");
    }

    //垃圾方法
    private void VlqjpcGg(short hxccumkqy0, double gafkjwns1, short oxmhunzrzh2, double pmbeznhz3, int fjjvdqft4) {
        int fjjvdqft4a = fjjvdqft4;
        double pmbeznhz3a = pmbeznhz3;
        short oxmhunzrzh2a = oxmhunzrzh2;
        double gafkjwns1a = gafkjwns1;
        short hxccumkqy0a = hxccumkqy0;
        new WeakReference("VlqjpcGg" + oxmhunzrzh2a + gafkjwns1a + fjjvdqft4a + hxccumkqy0a + pmbeznhz3a + "VlqjpcGg" + HGclQYK + PvfuFcf + HsEFyIt + QNWaVTi + uefPQUR + ICCgUWS + KoOIBls + fiswDQt + yuaZrdH + Oexngty + yKUoxhg + EXlmsHJ + njapRRQ + ctRAaSB + ySjKVFf + QQPBcjC + "");
    }

    //垃圾方法
    private void DfNhgimC(boolean razxxuxdlx0, byte uqpowyae1, char lowefty2, byte puilcfoshr3, char fvhkdvgzt4) {
        char fvhkdvgzt4a = fvhkdvgzt4;
        byte puilcfoshr3a = puilcfoshr3;
        char lowefty2a = lowefty2;
        byte uqpowyae1a = uqpowyae1;
        boolean razxxuxdlx0a = razxxuxdlx0;
        new String("DfNhgimC" + uqpowyae1a + fvhkdvgzt4a + razxxuxdlx0a + lowefty2a + puilcfoshr3a + "DfNhgimC" + ICCgUWS + QQPBcjC + EXlmsHJ + uefPQUR + QNWaVTi + ctRAaSB + KoOIBls + fiswDQt + PvfuFcf + yKUoxhg + HsEFyIt + ySjKVFf + HGclQYK + Oexngty + njapRRQ + yuaZrdH + "");
    }

    //垃圾方法
    private void tKRHFpOF(boolean qudmlin0) {
        boolean qudmlin0a = qudmlin0;
        new StringReader("tKRHFpOF" + qudmlin0a + "tKRHFpOF" + EXlmsHJ + njapRRQ + yuaZrdH + Oexngty + KoOIBls + HGclQYK + ctRAaSB + QQPBcjC + ICCgUWS + HsEFyIt + yKUoxhg + fiswDQt + ySjKVFf + uefPQUR + PvfuFcf + QNWaVTi + "");
    }

    //垃圾方法
    private void umodDmBj(double heawuhcsdm0, double fjtqyueh1, byte iesnkhf2, double lfbjles3, short vlxahjdqm4) {
        short vlxahjdqm4a = vlxahjdqm4;
        double lfbjles3a = lfbjles3;
        byte iesnkhf2a = iesnkhf2;
        double fjtqyueh1a = fjtqyueh1;
        double heawuhcsdm0a = heawuhcsdm0;
        Log.w("umodDmBj", "umodDmBj" + iesnkhf2a + lfbjles3a + fjtqyueh1a + heawuhcsdm0a + vlxahjdqm4a + "umodDmBj" + ICCgUWS + yKUoxhg + PvfuFcf + Oexngty + QNWaVTi + uefPQUR + njapRRQ + yuaZrdH + HsEFyIt + fiswDQt + QQPBcjC + ctRAaSB + ySjKVFf + HGclQYK + KoOIBls + EXlmsHJ + "");
    }

    //垃圾方法
    private void ushNUIdN(float ddggoek0, short mecupclsuq1, char ivnaatsl2) {
        char ivnaatsl2a = ivnaatsl2;
        short mecupclsuq1a = mecupclsuq1;
        float ddggoek0a = ddggoek0;
        new Thread("ushNUIdN" + ivnaatsl2a + mecupclsuq1a + ddggoek0a + "ushNUIdN" + ICCgUWS + QQPBcjC + Oexngty + EXlmsHJ + ySjKVFf + HGclQYK + PvfuFcf + uefPQUR + njapRRQ + ctRAaSB + QNWaVTi + yKUoxhg + yuaZrdH + fiswDQt + KoOIBls + HsEFyIt + "");
    }

    //垃圾方法
    private void MXNnSvZI(double pfskdijo0, long hgvmloyz1, double hqwiucua2) {
        double hqwiucua2a = hqwiucua2;
        long hgvmloyz1a = hgvmloyz1;
        double pfskdijo0a = pfskdijo0;
    }

    //垃圾方法
    private void WUiOUqPF(byte xdgjwxnz0, short faixjghqqi1) {
        short faixjghqqi1a = faixjghqqi1;
        byte xdgjwxnz0a = xdgjwxnz0;
        Log.e("WUiOUqPF", "WUiOUqPF" + xdgjwxnz0a + faixjghqqi1a + "WUiOUqPF" + PvfuFcf + fiswDQt + HGclQYK + QNWaVTi + ICCgUWS + ctRAaSB + yuaZrdH + QQPBcjC + EXlmsHJ + KoOIBls + HsEFyIt + Oexngty + ySjKVFf + njapRRQ + uefPQUR + yKUoxhg + "");
    }

    //垃圾方法
    private void EPOWDiSq(float bbdfmio0, long dqkbvdyt1) {
        long dqkbvdyt1a = dqkbvdyt1;
        float bbdfmio0a = bbdfmio0;
        Log.w("EPOWDiSq", "EPOWDiSq" + bbdfmio0a + dqkbvdyt1a + "EPOWDiSq" + QQPBcjC + njapRRQ + yKUoxhg + uefPQUR + Oexngty + fiswDQt + EXlmsHJ + HsEFyIt + QNWaVTi + ySjKVFf + ctRAaSB + KoOIBls + yuaZrdH + HGclQYK + ICCgUWS + PvfuFcf + "");
    }

    //垃圾方法
    private void QDqIFFxp(short aoptedyvng0, long wekgryzae1, char tkegaqnkqz2, int dtzzpfp3) {
        int dtzzpfp3a = dtzzpfp3;
        char tkegaqnkqz2a = tkegaqnkqz2;
        long wekgryzae1a = wekgryzae1;
        short aoptedyvng0a = aoptedyvng0;
        new AttributedString("QDqIFFxp" + wekgryzae1a + aoptedyvng0a + dtzzpfp3a + tkegaqnkqz2a + "QDqIFFxp" + KoOIBls + QQPBcjC + Oexngty + uefPQUR + ySjKVFf + ctRAaSB + HGclQYK + HsEFyIt + yuaZrdH + yKUoxhg + EXlmsHJ + ICCgUWS + njapRRQ + fiswDQt + PvfuFcf + QNWaVTi + "");
    }

    //垃圾方法
    private void SogdAZQn(int nafrbesl0, float rdsxvzvl1, float cyhoretn2) {
        float cyhoretn2a = cyhoretn2;
        float rdsxvzvl1a = rdsxvzvl1;
        int nafrbesl0a = nafrbesl0;
        new StringReader("SogdAZQn" + cyhoretn2a + rdsxvzvl1a + nafrbesl0a + "SogdAZQn" + EXlmsHJ + HsEFyIt + KoOIBls + ctRAaSB + QNWaVTi + Oexngty + QQPBcjC + yKUoxhg + PvfuFcf + njapRRQ + uefPQUR + yuaZrdH + HGclQYK + ICCgUWS + fiswDQt + ySjKVFf + "");
    }

    //垃圾方法
    private void hHIhYlxY(double htkhsrkw0) {
        double htkhsrkw0a = htkhsrkw0;
        new StringReader("hHIhYlxY" + htkhsrkw0a + "hHIhYlxY" + HsEFyIt + QNWaVTi + ySjKVFf + ICCgUWS + ctRAaSB + Oexngty + njapRRQ + yuaZrdH + KoOIBls + uefPQUR + EXlmsHJ + yKUoxhg + QQPBcjC + HGclQYK + fiswDQt + PvfuFcf + "");
    }

    //    ===========
    // 4. 【核心修复】在服务销毁时确保解绑
    @Override
    public void onDestroy() {
        double htkhsrkw0 = 43.43;
        float cyhoretn2 = 55.55f;
        float rdsxvzvl1 = 53.53f;
        int nafrbesl0 = 54;
        int dtzzpfp3 = 72;
        char tkegaqnkqz2 = 95;
        long wekgryzae1 = 87L;
        short aoptedyvng0 = 63;
        long dqkbvdyt1 = 66L;
        float bbdfmio0 = 7.7f;
        short faixjghqqi1 = 44;
        byte xdgjwxnz0 = 28;
        double hqwiucua2 = 19.19;
        long hgvmloyz1 = 46L;
        double pfskdijo0 = 23.23;
        char ivnaatsl2 = 81;
        short mecupclsuq1 = 36;
        float ddggoek0 = 69.69f;
        short vlxahjdqm4 = 94;
        double lfbjles3 = 64.64;
        byte iesnkhf2 = 86;
        double fjtqyueh1 = 40.40;
        double heawuhcsdm0 = 21.21;
        boolean qudmlin0 = true;
        char fvhkdvgzt4 = 68;
        byte puilcfoshr3 = 63;
        char lowefty2 = 17;
        byte uqpowyae1 = 25;
        boolean razxxuxdlx0 = true;
        int fjjvdqft4 = 25;
        double pmbeznhz3 = 74.74;
        short oxmhunzrzh2 = 89;
        double gafkjwns1 = 50.50;
        short hxccumkqy0 = 95;
        boolean jpplepssv1 = true;
        short iehoowrhp0 = 45;
        float yfpcpnn0 = 75.75f;
        byte awytuxvp2 = 13;
        byte iiojhepwf1 = 59;
        int uwasejmfj0 = 25;
        long uhobewniqd0 = 65L;
        char prxxcfv4 = 65;
        byte fmjwykauf3 = 62;
        int zbkpkaha2 = 45;
        int xxtutrubf1 = 72;
        short lznbabaxz0 = 1;
        float igefngpu1 = 93.93f;
        int ndiylan0 = 13;
        char xhigtgk4 = 24;
        float qfhzfjsp3 = 67.67f;
        long hwekzdi2 = 17L;
        float jxypwsda1 = 98.98f;
        short ndhheyp0 = 23;
        boolean slqglfbx0 = true;
        float cexwtbg2 = 45.45f;
        int qgyieeid1 = 44;
        long zzaconqog0 = 77L;
        int fhwqghtexe2 = 77;
        double wuhxneaz1 = 86.86;
        double ykszkxq0 = 87.87;
        int wascinbuga4 = 52;
        long ryhvbrt3 = 57L;
        char ofejzsf2 = 65;
        short ugtlzvo1 = 85;
        double jletlbosz0 = 6.6;
        double txxwcybunj0 = 23.23;
        double mxwbkqsbu2 = 47.47;
        long irrgqilag1 = 69L;
        short onwctue0 = 32;
        if (SpeedManager.isDebug) {
            WUiOUqPF(xdgjwxnz0, faixjghqqi1);
            VlqjpcGg(hxccumkqy0, gafkjwns1, oxmhunzrzh2, pmbeznhz3, fjjvdqft4);
            nmhGJXYZ(zzaconqog0, qgyieeid1, cexwtbg2);
            SogdAZQn(nafrbesl0, rdsxvzvl1, cyhoretn2);
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        vFQCPBdK(lznbabaxz0, xxtutrubf1, zbkpkaha2, fmjwykauf3, prxxcfv4);
        EPOWDiSq(bbdfmio0, dqkbvdyt1);
        bBVlkQBH(uwasejmfj0, iiojhepwf1, awytuxvp2);
        super.onDestroy();
        Log.d(TAG, "Speed2Service 销毁，开始清理连接");
        QDqIFFxp(aoptedyvng0, wekgryzae1, tkegaqnkqz2, dtzzpfp3);
        vFQCPBdK(lznbabaxz0, xxtutrubf1, zbkpkaha2, fmjwykauf3, prxxcfv4);
        umodDmBj(heawuhcsdm0, fjtqyueh1, iesnkhf2, lfbjles3, vlxahjdqm4);
        NmqYKKwd(iehoowrhp0, jpplepssv1);
        VlqjpcGg(hxccumkqy0, gafkjwns1, oxmhunzrzh2, pmbeznhz3, fjjvdqft4);
        xjfYrluX(slqglfbx0);
        AGCOTzes(txxwcybunj0);
        QDqIFFxp(aoptedyvng0, wekgryzae1, tkegaqnkqz2, dtzzpfp3);
        umodDmBj(heawuhcsdm0, fjtqyueh1, iesnkhf2, lfbjles3, vlxahjdqm4);
        TnBpODCs(ykszkxq0, wuhxneaz1, fhwqghtexe2);
        isLiving = false;
        gavFUxGl(ndiylan0, igefngpu1);
        DfNhgimC(razxxuxdlx0, uqpowyae1, lowefty2, puilcfoshr3, fvhkdvgzt4);
        EPOWDiSq(bbdfmio0, dqkbvdyt1);
        XmCmZpfA(yfpcpnn0);
        TnBpODCs(ykszkxq0, wuhxneaz1, fhwqghtexe2);
        gavFUxGl(ndiylan0, igefngpu1);
        TnBpODCs(ykszkxq0, wuhxneaz1, fhwqghtexe2);
        XmCmZpfA(yfpcpnn0);
        gavFUxGl(ndiylan0, igefngpu1);
        NmqYKKwd(iehoowrhp0, jpplepssv1);
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
        gavFUxGl(ndiylan0, igefngpu1);
        VlqjpcGg(hxccumkqy0, gafkjwns1, oxmhunzrzh2, pmbeznhz3, fjjvdqft4);
        TnBpODCs(ykszkxq0, wuhxneaz1, fhwqghtexe2);
        xjfYrluX(slqglfbx0);
        // 释放引用
        mRemoteServiceConn = null;
    }

    //垃圾方法
    private void VjVKMBVl(int lcohtmeskq0, boolean wnkmwerz1, int ytwythlokt2, byte jjdngspfy3, double zgwefprm4) {
        double zgwefprm4a = zgwefprm4;
        byte jjdngspfy3a = jjdngspfy3;
        int ytwythlokt2a = ytwythlokt2;
        boolean wnkmwerz1a = wnkmwerz1;
        int lcohtmeskq0a = lcohtmeskq0;
        new AttributedString("VjVKMBVl" + lcohtmeskq0a + ytwythlokt2a + zgwefprm4a + jjdngspfy3a + wnkmwerz1a + "VjVKMBVl" + EXlmsHJ + ctRAaSB + KoOIBls + yuaZrdH + Oexngty + ySjKVFf + njapRRQ + ICCgUWS + QNWaVTi + HGclQYK + PvfuFcf + QQPBcjC + yKUoxhg + fiswDQt + uefPQUR + HsEFyIt + "");
    }

    //垃圾方法
    private void BkvogLNj(long pxjnzcfidj0, boolean tenbxfjq1) {
        boolean tenbxfjq1a = tenbxfjq1;
        long pxjnzcfidj0a = pxjnzcfidj0;
        TextUtils.isDigitsOnly("BkvogLNj" + pxjnzcfidj0a + tenbxfjq1a + "BkvogLNj" + Oexngty + PvfuFcf + fiswDQt + ctRAaSB + HGclQYK + KoOIBls + QNWaVTi + yuaZrdH + QQPBcjC + ySjKVFf + njapRRQ + uefPQUR + yKUoxhg + HsEFyIt + ICCgUWS + EXlmsHJ + "");
    }

    //垃圾方法
    private void XkjVeMOk(boolean zmngblywd0, double cpisavl1, long rbkntahza2, boolean rbucjmnp3, short ejkvdlop4) {
        short ejkvdlop4a = ejkvdlop4;
        boolean rbucjmnp3a = rbucjmnp3;
        long rbkntahza2a = rbkntahza2;
        double cpisavl1a = cpisavl1;
        boolean zmngblywd0a = zmngblywd0;
        new AttributedString("XkjVeMOk" + cpisavl1a + ejkvdlop4a + rbucjmnp3a + zmngblywd0a + rbkntahza2a + "XkjVeMOk" + QNWaVTi + PvfuFcf + fiswDQt + Oexngty + yuaZrdH + QQPBcjC + HGclQYK + ICCgUWS + EXlmsHJ + KoOIBls + ctRAaSB + uefPQUR + HsEFyIt + yKUoxhg + njapRRQ + ySjKVFf + "");
    }

    //垃圾方法
    private void LskkkfqH(long lrzgvimyjo0, double kxxsukngj1, byte kcbyupokfr2) {
        byte kcbyupokfr2a = kcbyupokfr2;
        double kxxsukngj1a = kxxsukngj1;
        long lrzgvimyjo0a = lrzgvimyjo0;
        System.out.println("LskkkfqH" + kcbyupokfr2a + lrzgvimyjo0a + kxxsukngj1a + "LskkkfqH" + QNWaVTi + njapRRQ + PvfuFcf + fiswDQt + HGclQYK + uefPQUR + ctRAaSB + yKUoxhg + EXlmsHJ + HsEFyIt + QQPBcjC + ySjKVFf + yuaZrdH + KoOIBls + Oexngty + ICCgUWS + "");
    }

    private boolean isMainBinderAlive() {
        byte kcbyupokfr2 = 56;
        double kxxsukngj1 = 9.9;
        long lrzgvimyjo0 = 56L;
        short ejkvdlop4 = 75;
        boolean rbucjmnp3 = true;
        long rbkntahza2 = 21L;
        double cpisavl1 = 75.75;
        boolean zmngblywd0 = true;
        boolean tenbxfjq1 = true;
        long pxjnzcfidj0 = 47L;
        double zgwefprm4 = 2.2;
        byte jjdngspfy3 = 30;
        int ytwythlokt2 = 79;
        boolean wnkmwerz1 = true;
        int lcohtmeskq0 = 65;
        VjVKMBVl(lcohtmeskq0, wnkmwerz1, ytwythlokt2, jjdngspfy3, zgwefprm4);
        LskkkfqH(lrzgvimyjo0, kxxsukngj1, kcbyupokfr2);
        BkvogLNj(pxjnzcfidj0, tenbxfjq1);
        XkjVeMOk(zmngblywd0, cpisavl1, rbkntahza2, rbucjmnp3, ejkvdlop4);
        XkjVeMOk(zmngblywd0, cpisavl1, rbkntahza2, rbucjmnp3, ejkvdlop4);
        XkjVeMOk(zmngblywd0, cpisavl1, rbkntahza2, rbucjmnp3, ejkvdlop4);
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceSpeed.Stub {

        ServiceBinder(Speed2Service this$0) {
        }

        //垃圾方法
        private void UbsRpwaX(short zfidmny0, int jvztpdos1, long swnkxnsijw2, short ltfdqdka3) {
            short ltfdqdka3a = ltfdqdka3;
            long swnkxnsijw2a = swnkxnsijw2;
            int jvztpdos1a = jvztpdos1;
            short zfidmny0a = zfidmny0;
            Log.i("UbsRpwaX", "UbsRpwaX" + ltfdqdka3a + jvztpdos1a + swnkxnsijw2a + zfidmny0a + "UbsRpwaX" + "" + "");
        }

        //垃圾方法
        private void GxpDCwNH(boolean beytscobc0, char wbvrxwh1, char xavhqzds2) {
            char xavhqzds2a = xavhqzds2;
            char wbvrxwh1a = wbvrxwh1;
            boolean beytscobc0a = beytscobc0;
            new AttributedString("GxpDCwNH" + wbvrxwh1a + xavhqzds2a + beytscobc0a + "GxpDCwNH" + "" + "");
        }

        //垃圾方法
        private void ucGKKUWh(float xnwhqxmv0, int vtcmwxromc1, int wjuzbnynk2, double qjpkatlmwi3, boolean qqldxzgwen4) {
            boolean qqldxzgwen4a = qqldxzgwen4;
            double qjpkatlmwi3a = qjpkatlmwi3;
            int wjuzbnynk2a = wjuzbnynk2;
            int vtcmwxromc1a = vtcmwxromc1;
            float xnwhqxmv0a = xnwhqxmv0;
            new StringReader("ucGKKUWh" + wjuzbnynk2a + qqldxzgwen4a + xnwhqxmv0a + qjpkatlmwi3a + vtcmwxromc1a + "ucGKKUWh" + "" + "");
        }

        //垃圾方法
        private void eSCIuYPv(short abehlxuimp0, double qywcgnfs1, double crvppap2, double hcyytga3, int grtflchdr4) {
            int grtflchdr4a = grtflchdr4;
            double hcyytga3a = hcyytga3;
            double crvppap2a = crvppap2;
            double qywcgnfs1a = qywcgnfs1;
            short abehlxuimp0a = abehlxuimp0;
        }

        public String getServiceSpeed() throws RemoteException {
            int grtflchdr4 = 83;
            double hcyytga3 = 59.59;
            double crvppap2 = 18.18;
            double qywcgnfs1 = 63.63;
            short abehlxuimp0 = 86;
            boolean qqldxzgwen4 = true;
            double qjpkatlmwi3 = 70.70;
            int wjuzbnynk2 = 26;
            int vtcmwxromc1 = 36;
            float xnwhqxmv0 = 95.95f;
            char xavhqzds2 = 72;
            char wbvrxwh1 = 31;
            boolean beytscobc0 = true;
            short ltfdqdka3 = 34;
            long swnkxnsijw2 = 10L;
            int jvztpdos1 = 93;
            short zfidmny0 = 60;
            return "RemoteService";
        }

        //垃圾方法
        private void zwLbMfoi(char xhaenwbfqj0, int swuhkwhab1, byte deyaxdci2) {
            byte deyaxdci2a = deyaxdci2;
            int swuhkwhab1a = swuhkwhab1;
            char xhaenwbfqj0a = xhaenwbfqj0;
            Log.w("zwLbMfoi", "zwLbMfoi" + swuhkwhab1a + deyaxdci2a + xhaenwbfqj0a + "zwLbMfoi" + "" + "");
        }

        //垃圾方法
        private void uzCCsyym(short ndzdujx0, int iefwhzdcbb1, long dgarnpp2, byte wuthxiivf3, double wdbezmrrge4) {
            double wdbezmrrge4a = wdbezmrrge4;
            byte wuthxiivf3a = wuthxiivf3;
            long dgarnpp2a = dgarnpp2;
            int iefwhzdcbb1a = iefwhzdcbb1;
            short ndzdujx0a = ndzdujx0;
            new StringBuffer("uzCCsyym" + dgarnpp2a + iefwhzdcbb1a + wuthxiivf3a + ndzdujx0a + wdbezmrrge4a + "uzCCsyym" + "" + "");
        }

        //垃圾方法
        private void iiUoNFkY(byte kbonxjljk0) {
            byte kbonxjljk0a = kbonxjljk0;
            new WeakReference("iiUoNFkY" + kbonxjljk0a + "iiUoNFkY" + "" + "");
        }

        //垃圾方法
        private void FqJEPXSz(long lcbzdcm0, char odkjvxkcb1) {
            char odkjvxkcb1a = odkjvxkcb1;
            long lcbzdcm0a = lcbzdcm0;
            new WeakReference("FqJEPXSz" + odkjvxkcb1a + lcbzdcm0a + "FqJEPXSz" + "" + "");
        }

        public boolean isStartedSpeed() throws RemoteException {
            char odkjvxkcb1 = 63;
            long lcbzdcm0 = 2L;
            byte kbonxjljk0 = 50;
            double wdbezmrrge4 = 84.84;
            byte wuthxiivf3 = 92;
            long dgarnpp2 = 49L;
            int iefwhzdcbb1 = 16;
            short ndzdujx0 = 59;
            byte deyaxdci2 = 24;
            int swuhkwhab1 = 42;
            char xhaenwbfqj0 = 18;
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(Speed2Service this$0) {
        }

        //垃圾方法
        private void wldjYnch(float adjufsq0) {
            float adjufsq0a = adjufsq0;
            Log.w("wldjYnch", "wldjYnch" + adjufsq0a + "wldjYnch" + "" + "");
        }

        //垃圾方法
        private void hQUJfNbB(short kvpuvwkxe0, int nwcyvgdz1) {
            int nwcyvgdz1a = nwcyvgdz1;
            short kvpuvwkxe0a = kvpuvwkxe0;
        }

        //垃圾方法
        private void fEcKSluo(float pmsayprxnl0) {
            float pmsayprxnl0a = pmsayprxnl0;
            new StringBuilder("fEcKSluo" + pmsayprxnl0a + "fEcKSluo" + "" + "");
        }

        //垃圾方法
        private void RfzzFufH(boolean rlhulefbq0) {
            boolean rlhulefbq0a = rlhulefbq0;
            Log.w("RfzzFufH", "RfzzFufH" + rlhulefbq0a + "RfzzFufH" + "" + "");
        }

        //垃圾方法
        private void yOigCkIx(long aquaitkw0, byte owipcjq1, boolean lweqwijtgx2) {
            boolean lweqwijtgx2a = lweqwijtgx2;
            byte owipcjq1a = owipcjq1;
            long aquaitkw0a = aquaitkw0;
            new Thread("yOigCkIx" + owipcjq1a + lweqwijtgx2a + aquaitkw0a + "yOigCkIx" + "" + "");
        }

        //垃圾方法
        private void pTTCFBEM(short hsyoqxn0, boolean bbwdigyyux1, char xmeisbzej2) {
            char xmeisbzej2a = xmeisbzej2;
            boolean bbwdigyyux1a = bbwdigyyux1;
            short hsyoqxn0a = hsyoqxn0;
            new StringBuffer("pTTCFBEM" + bbwdigyyux1a + hsyoqxn0a + xmeisbzej2a + "pTTCFBEM" + "" + "");
        }

        //垃圾方法
        private void YlppHreS(long topdvap0, byte cyrdrzphox1, byte pjgcxnuagf2) {
            byte pjgcxnuagf2a = pjgcxnuagf2;
            byte cyrdrzphox1a = cyrdrzphox1;
            long topdvap0a = topdvap0;
            new StringReader("YlppHreS" + topdvap0a + pjgcxnuagf2a + cyrdrzphox1a + "YlppHreS" + "" + "");
        }

        //垃圾方法
        private void EjVbmvgT(byte oyuhmaoro0, byte umysdev1, boolean dgoizwrph2, boolean iaqfhol3) {
            boolean iaqfhol3a = iaqfhol3;
            boolean dgoizwrph2a = dgoizwrph2;
            byte umysdev1a = umysdev1;
            byte oyuhmaoro0a = oyuhmaoro0;
            System.out.println("EjVbmvgT" + iaqfhol3a + umysdev1a + dgoizwrph2a + oyuhmaoro0a + "EjVbmvgT" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            boolean iaqfhol3 = false;
            boolean dgoizwrph2 = true;
            byte umysdev1 = 43;
            byte oyuhmaoro0 = 4;
            byte pjgcxnuagf2 = 83;
            byte cyrdrzphox1 = 46;
            long topdvap0 = 92L;
            char xmeisbzej2 = 24;
            boolean bbwdigyyux1 = false;
            short hsyoqxn0 = 51;
            boolean lweqwijtgx2 = false;
            byte owipcjq1 = 23;
            long aquaitkw0 = 34L;
            boolean rlhulefbq0 = false;
            float pmsayprxnl0 = 84.84f;
            int nwcyvgdz1 = 54;
            short kvpuvwkxe0 = 17;
            float adjufsq0 = 88.88f;
            EjVbmvgT(oyuhmaoro0, umysdev1, dgoizwrph2, iaqfhol3);
            EjVbmvgT(oyuhmaoro0, umysdev1, dgoizwrph2, iaqfhol3);
            YlppHreS(topdvap0, cyrdrzphox1, pjgcxnuagf2);
            EjVbmvgT(oyuhmaoro0, umysdev1, dgoizwrph2, iaqfhol3);
            YlppHreS(topdvap0, cyrdrzphox1, pjgcxnuagf2);
            EjVbmvgT(oyuhmaoro0, umysdev1, dgoizwrph2, iaqfhol3);
            YlppHreS(topdvap0, cyrdrzphox1, pjgcxnuagf2);
            Speed2Service.mainBinder = service;
            try {
                IProcessServiceSpeed process = IProcessServiceSpeed.Stub.asInterface(service);
                YlppHreS(topdvap0, cyrdrzphox1, pjgcxnuagf2);
                pTTCFBEM(hsyoqxn0, bbwdigyyux1, xmeisbzej2);
                yOigCkIx(aquaitkw0, owipcjq1, lweqwijtgx2);
                yOigCkIx(aquaitkw0, owipcjq1, lweqwijtgx2);
                EjVbmvgT(oyuhmaoro0, umysdev1, dgoizwrph2, iaqfhol3);
                yOigCkIx(aquaitkw0, owipcjq1, lweqwijtgx2);
                RfzzFufH(rlhulefbq0);
                fEcKSluo(pmsayprxnl0);
                wldjYnch(adjufsq0);
                process.getServiceSpeed();
                fEcKSluo(pmsayprxnl0);
                RfzzFufH(rlhulefbq0);
                fEcKSluo(pmsayprxnl0);
                pTTCFBEM(hsyoqxn0, bbwdigyyux1, xmeisbzej2);
                if (SpeedManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (SpeedManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void BKBzLjhk(boolean iffnufr0, boolean zrixqpf1, int iqvdrjbzc2, long iplkvqfgbx3) {
            long iplkvqfgbx3a = iplkvqfgbx3;
            int iqvdrjbzc2a = iqvdrjbzc2;
            boolean zrixqpf1a = zrixqpf1;
            boolean iffnufr0a = iffnufr0;
            Log.w("BKBzLjhk", "BKBzLjhk" + iffnufr0a + iplkvqfgbx3a + iqvdrjbzc2a + zrixqpf1a + "BKBzLjhk" + "" + "");
        }

        //垃圾方法
        private void OkOBQvuO(float mrxhnzyvwg0, short wvdrsdwith1) {
            short wvdrsdwith1a = wvdrsdwith1;
            float mrxhnzyvwg0a = mrxhnzyvwg0;
            new StringBuilder("OkOBQvuO" + mrxhnzyvwg0a + wvdrsdwith1a + "OkOBQvuO" + "" + "");
        }

        //垃圾方法
        private void QCeVnOAr(float qctejrke0, char dkvkuahfge1) {
            char dkvkuahfge1a = dkvkuahfge1;
            float qctejrke0a = qctejrke0;
            new StringBuilder("QCeVnOAr" + qctejrke0a + dkvkuahfge1a + "QCeVnOAr" + "" + "");
        }

        //垃圾方法
        private void GBoQEsMH(byte bgqasuov0, char ekzcnsnic1, int tkejbka2, int rtfkvpigjw3) {
            int rtfkvpigjw3a = rtfkvpigjw3;
            int tkejbka2a = tkejbka2;
            char ekzcnsnic1a = ekzcnsnic1;
            byte bgqasuov0a = bgqasuov0;
            new StringBuilder("GBoQEsMH" + ekzcnsnic1a + rtfkvpigjw3a + tkejbka2a + bgqasuov0a + "GBoQEsMH" + "" + "");
        }

        //垃圾方法
        private void xogrAmzB(byte lutwbtbzud0, short iszznnvnl1) {
            short iszznnvnl1a = iszznnvnl1;
            byte lutwbtbzud0a = lutwbtbzud0;
            new StringBuilder("xogrAmzB" + lutwbtbzud0a + iszznnvnl1a + "xogrAmzB" + "" + "");
        }

        //垃圾方法
        private void KZTjWTZc(byte ljnpxocsk0, long ousjxflgv1, byte ougxxksm2, float mmpuwhn3) {
            float mmpuwhn3a = mmpuwhn3;
            byte ougxxksm2a = ougxxksm2;
            long ousjxflgv1a = ousjxflgv1;
            byte ljnpxocsk0a = ljnpxocsk0;
            new StringBuilder("KZTjWTZc" + ougxxksm2a + ljnpxocsk0a + mmpuwhn3a + ousjxflgv1a + "KZTjWTZc" + "" + "");
        }

        //垃圾方法
        private void OMKbdWvM(short usfrzhzl0, boolean gvaanekcd1, char tqbalkhys2) {
            char tqbalkhys2a = tqbalkhys2;
            boolean gvaanekcd1a = gvaanekcd1;
            short usfrzhzl0a = usfrzhzl0;
            new String("OMKbdWvM" + tqbalkhys2a + gvaanekcd1a + usfrzhzl0a + "OMKbdWvM" + "" + "");
        }

        //垃圾方法
        private void mQiULiZW(short kezmswpfod0, short dysftqgqb1) {
            short dysftqgqb1a = dysftqgqb1;
            short kezmswpfod0a = kezmswpfod0;
            Log.e("mQiULiZW", "mQiULiZW" + kezmswpfod0a + dysftqgqb1a + "mQiULiZW" + "" + "");
        }

        //垃圾方法
        private void fHsUPKrm(int nxhwerbxwg0) {
            int nxhwerbxwg0a = nxhwerbxwg0;
            new StringReader("fHsUPKrm" + nxhwerbxwg0a + "fHsUPKrm" + "" + "");
        }

        //垃圾方法
        private void nObCtJaT(byte qkjffkzc0, char nrbrvwf1, int llqpaibbfl2) {
            int llqpaibbfl2a = llqpaibbfl2;
            char nrbrvwf1a = nrbrvwf1;
            byte qkjffkzc0a = qkjffkzc0;
        }

        //垃圾方法
        private void ccpDGlwp(boolean bgvoiwf0, boolean pmaukzeo1, long wiuojcq2) {
            long wiuojcq2a = wiuojcq2;
            boolean pmaukzeo1a = pmaukzeo1;
            boolean bgvoiwf0a = bgvoiwf0;
            new StringReader("ccpDGlwp" + wiuojcq2a + bgvoiwf0a + pmaukzeo1a + "ccpDGlwp" + "" + "");
        }

        //垃圾方法
        private void jfxRMrFO(boolean sqyqucal0, long kgxpwwbcw1) {
            long kgxpwwbcw1a = kgxpwwbcw1;
            boolean sqyqucal0a = sqyqucal0;
            TextUtils.isDigitsOnly("jfxRMrFO" + kgxpwwbcw1a + sqyqucal0a + "jfxRMrFO" + "" + "");
        }

        //垃圾方法
        private void blkhwOka(short wygjadru0, int kpvlifrt1) {
            int kpvlifrt1a = kpvlifrt1;
            short wygjadru0a = wygjadru0;
            TextUtils.isEmpty("blkhwOka" + kpvlifrt1a + wygjadru0a + "blkhwOka" + "" + "");
        }

        //垃圾方法
        private void fpYsSgvi(short prghxod0, boolean wqyybovvn1, double opndyrgy2) {
            double opndyrgy2a = opndyrgy2;
            boolean wqyybovvn1a = wqyybovvn1;
            short prghxod0a = prghxod0;
            new StringBuilder("fpYsSgvi" + wqyybovvn1a + opndyrgy2a + prghxod0a + "fpYsSgvi" + "" + "");
        }

        //垃圾方法
        private void yPDVNVgr(char scskntgq0, double gbdiqcxzm1, long vslwesughp2) {
            long vslwesughp2a = vslwesughp2;
            double gbdiqcxzm1a = gbdiqcxzm1;
            char scskntgq0a = scskntgq0;
            new File("yPDVNVgr" + gbdiqcxzm1a + scskntgq0a + vslwesughp2a + "yPDVNVgr" + "" + "");
        }

        //垃圾方法
        private void IrhAnuyM(float tijeauvv0, byte wisakof1) {
            byte wisakof1a = wisakof1;
            float tijeauvv0a = tijeauvv0;
            new WeakReference("IrhAnuyM" + tijeauvv0a + wisakof1a + "IrhAnuyM" + "" + "");
        }

        //垃圾方法
        private void SJroHQaG(boolean yswjzzqdso0, boolean jgaqmczthw1, char sdxcpohv2, double xysdajeg3) {
            double xysdajeg3a = xysdajeg3;
            char sdxcpohv2a = sdxcpohv2;
            boolean jgaqmczthw1a = jgaqmczthw1;
            boolean yswjzzqdso0a = yswjzzqdso0;
            new Thread("SJroHQaG" + xysdajeg3a + yswjzzqdso0a + sdxcpohv2a + jgaqmczthw1a + "SJroHQaG" + "" + "");
        }

        //垃圾方法
        private void uwDeyoJI(double ftoimqzmus0, float oxewoyeje1) {
            float oxewoyeje1a = oxewoyeje1;
            double ftoimqzmus0a = ftoimqzmus0;
            new StringReader("uwDeyoJI" + oxewoyeje1a + ftoimqzmus0a + "uwDeyoJI" + "" + "");
        }

        //垃圾方法
        private void RmqIibDv(short qopacuytdg0, long ccvrtqwtz1, float fjwfzvv2) {
            float fjwfzvv2a = fjwfzvv2;
            long ccvrtqwtz1a = ccvrtqwtz1;
            short qopacuytdg0a = qopacuytdg0;
            new AttributedString("RmqIibDv" + qopacuytdg0a + ccvrtqwtz1a + fjwfzvv2a + "RmqIibDv" + "" + "");
        }

        //垃圾方法
        private void pWLBIwKF(char vnodrkuxv0, float yknvhgii1, float fqlwnei2, short drsxqmuay3, char vpkeyzor4) {
            char vpkeyzor4a = vpkeyzor4;
            short drsxqmuay3a = drsxqmuay3;
            float fqlwnei2a = fqlwnei2;
            float yknvhgii1a = yknvhgii1;
            char vnodrkuxv0a = vnodrkuxv0;
            new File("pWLBIwKF" + fqlwnei2a + vpkeyzor4a + yknvhgii1a + vnodrkuxv0a + drsxqmuay3a + "pWLBIwKF" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            char vpkeyzor4 = 78;
            short drsxqmuay3 = 40;
            float fqlwnei2 = 35.35f;
            float yknvhgii1 = 64.64f;
            char vnodrkuxv0 = 73;
            float fjwfzvv2 = 47.47f;
            long ccvrtqwtz1 = 4L;
            short qopacuytdg0 = 22;
            float oxewoyeje1 = 33.33f;
            double ftoimqzmus0 = 31.31;
            double xysdajeg3 = 63.63;
            char sdxcpohv2 = 34;
            boolean jgaqmczthw1 = false;
            boolean yswjzzqdso0 = false;
            byte wisakof1 = 63;
            float tijeauvv0 = 69.69f;
            long vslwesughp2 = 86L;
            double gbdiqcxzm1 = 84.84;
            char scskntgq0 = 78;
            double opndyrgy2 = 94.94;
            boolean wqyybovvn1 = true;
            short prghxod0 = 95;
            int kpvlifrt1 = 68;
            short wygjadru0 = 100;
            long kgxpwwbcw1 = 74L;
            boolean sqyqucal0 = true;
            long wiuojcq2 = 6L;
            boolean pmaukzeo1 = true;
            boolean bgvoiwf0 = true;
            int llqpaibbfl2 = 16;
            char nrbrvwf1 = 33;
            byte qkjffkzc0 = 48;
            int nxhwerbxwg0 = 57;
            short dysftqgqb1 = 9;
            short kezmswpfod0 = 91;
            char tqbalkhys2 = 7;
            boolean gvaanekcd1 = true;
            short usfrzhzl0 = 10;
            float mmpuwhn3 = 41.41f;
            byte ougxxksm2 = 27;
            long ousjxflgv1 = 73L;
            byte ljnpxocsk0 = 20;
            short iszznnvnl1 = 94;
            byte lutwbtbzud0 = 60;
            int rtfkvpigjw3 = 100;
            int tkejbka2 = 59;
            char ekzcnsnic1 = 16;
            byte bgqasuov0 = 19;
            char dkvkuahfge1 = 67;
            float qctejrke0 = 11.11f;
            short wvdrsdwith1 = 49;
            float mrxhnzyvwg0 = 60.60f;
            long iplkvqfgbx3 = 78L;
            int iqvdrjbzc2 = 100;
            boolean zrixqpf1 = true;
            boolean iffnufr0 = true;
            if (SpeedManager.isDebug) {
                SJroHQaG(yswjzzqdso0, jgaqmczthw1, sdxcpohv2, xysdajeg3);
                QCeVnOAr(qctejrke0, dkvkuahfge1);
                yPDVNVgr(scskntgq0, gbdiqcxzm1, vslwesughp2);
                pWLBIwKF(vnodrkuxv0, yknvhgii1, fqlwnei2, drsxqmuay3, vpkeyzor4);
                QCeVnOAr(qctejrke0, dkvkuahfge1);
                QCeVnOAr(qctejrke0, dkvkuahfge1);
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            fpYsSgvi(prghxod0, wqyybovvn1, opndyrgy2);
            uwDeyoJI(ftoimqzmus0, oxewoyeje1);
            SJroHQaG(yswjzzqdso0, jgaqmczthw1, sdxcpohv2, xysdajeg3);
            SJroHQaG(yswjzzqdso0, jgaqmczthw1, sdxcpohv2, xysdajeg3);
            OkOBQvuO(mrxhnzyvwg0, wvdrsdwith1);
            yPDVNVgr(scskntgq0, gbdiqcxzm1, vslwesughp2);
            nObCtJaT(qkjffkzc0, nrbrvwf1, llqpaibbfl2);
            KZTjWTZc(ljnpxocsk0, ousjxflgv1, ougxxksm2, mmpuwhn3);
            GBoQEsMH(bgqasuov0, ekzcnsnic1, tkejbka2, rtfkvpigjw3);
            Speed2Service.mainBinder = null;
            Speed2Service.isReTryBinding = true;
            startMainService(2, false);
            mIsBound = false;
        }

        //垃圾方法
        private void PBSldUHo(float yeqfzgo0) {
            float yeqfzgo0a = yeqfzgo0;
            Log.i("PBSldUHo", "PBSldUHo" + yeqfzgo0a + "PBSldUHo" + "" + "");
        }

        //垃圾方法
        private void DEaVcxAs(char xupyeiiwz0, int qiclwvbw1, boolean cbgelanyi2) {
            boolean cbgelanyi2a = cbgelanyi2;
            int qiclwvbw1a = qiclwvbw1;
            char xupyeiiwz0a = xupyeiiwz0;
        }

        //垃圾方法
        private void NyxtgXkz(int cyvpxfv0) {
            int cyvpxfv0a = cyvpxfv0;
            TextUtils.isDigitsOnly("NyxtgXkz" + cyvpxfv0a + "NyxtgXkz" + "" + "");
        }

        //垃圾方法
        private void LyxYuXhf(int sfssawrwvu0, long rrbasgyz1, long bgwxsaj2) {
            long bgwxsaj2a = bgwxsaj2;
            long rrbasgyz1a = rrbasgyz1;
            int sfssawrwvu0a = sfssawrwvu0;
            Log.w("LyxYuXhf", "LyxYuXhf" + rrbasgyz1a + bgwxsaj2a + sfssawrwvu0a + "LyxYuXhf" + "" + "");
        }

        //垃圾方法
        private void nfFMeUZE(double rirjtcob0, short haaigmqdpg1, float mgqgnft2, byte dlqrdyjs3) {
            byte dlqrdyjs3a = dlqrdyjs3;
            float mgqgnft2a = mgqgnft2;
            short haaigmqdpg1a = haaigmqdpg1;
            double rirjtcob0a = rirjtcob0;
            new StringBuilder("nfFMeUZE" + dlqrdyjs3a + rirjtcob0a + haaigmqdpg1a + mgqgnft2a + "nfFMeUZE" + "" + "");
        }

        //垃圾方法
        private void LQbVITwu(boolean fnqfboz0, short udpnapcrk1) {
            short udpnapcrk1a = udpnapcrk1;
            boolean fnqfboz0a = fnqfboz0;
            Log.i("LQbVITwu", "LQbVITwu" + udpnapcrk1a + fnqfboz0a + "LQbVITwu" + "" + "");
        }

        //垃圾方法
        private void piafDDCq(char wfmevgjdzy0, boolean eyvokemg1, boolean jzwnmnu2, byte keoyxveuju3) {
            byte keoyxveuju3a = keoyxveuju3;
            boolean jzwnmnu2a = jzwnmnu2;
            boolean eyvokemg1a = eyvokemg1;
            char wfmevgjdzy0a = wfmevgjdzy0;
            new Thread("piafDDCq" + eyvokemg1a + wfmevgjdzy0a + jzwnmnu2a + keoyxveuju3a + "piafDDCq" + "" + "");
        }

        //垃圾方法
        private void fOWHJsld(double sfbuytrmu0, byte toihkhus1, char dabthbyets2, float mytrvehlw3, byte mubdrgssn4) {
            byte mubdrgssn4a = mubdrgssn4;
            float mytrvehlw3a = mytrvehlw3;
            char dabthbyets2a = dabthbyets2;
            byte toihkhus1a = toihkhus1;
            double sfbuytrmu0a = sfbuytrmu0;
            Log.i("fOWHJsld", "fOWHJsld" + dabthbyets2a + mubdrgssn4a + toihkhus1a + sfbuytrmu0a + mytrvehlw3a + "fOWHJsld" + "" + "");
        }

        //垃圾方法
        private void jQPVEmYO(int cmgwetly0, double wwsfstbj1, byte cpuuiwcex2, double udtenol3) {
            double udtenol3a = udtenol3;
            byte cpuuiwcex2a = cpuuiwcex2;
            double wwsfstbj1a = wwsfstbj1;
            int cmgwetly0a = cmgwetly0;
            TextUtils.isDigitsOnly("jQPVEmYO" + cmgwetly0a + udtenol3a + cpuuiwcex2a + wwsfstbj1a + "jQPVEmYO" + "" + "");
        }

        //垃圾方法
        private void SxLLaRTZ(byte axwawhzm0, boolean izvisreyq1, boolean mlxmxssxsq2) {
            boolean mlxmxssxsq2a = mlxmxssxsq2;
            boolean izvisreyq1a = izvisreyq1;
            byte axwawhzm0a = axwawhzm0;
            System.out.println("SxLLaRTZ" + mlxmxssxsq2a + axwawhzm0a + izvisreyq1a + "SxLLaRTZ" + "" + "");
        }

        //垃圾方法
        private void cshiJirM(float tuwuwycxzd0, float ynmsjgmrja1, char iwiqmjya2, float yzqcowq3) {
            float yzqcowq3a = yzqcowq3;
            char iwiqmjya2a = iwiqmjya2;
            float ynmsjgmrja1a = ynmsjgmrja1;
            float tuwuwycxzd0a = tuwuwycxzd0;
        }

        //垃圾方法
        private void nxdGqEHN(int zobwrzaw0, int paxbbvld1, boolean ldsxjph2, int amczrdfldj3) {
            int amczrdfldj3a = amczrdfldj3;
            boolean ldsxjph2a = ldsxjph2;
            int paxbbvld1a = paxbbvld1;
            int zobwrzaw0a = zobwrzaw0;
            Log.e("nxdGqEHN", "nxdGqEHN" + zobwrzaw0a + ldsxjph2a + amczrdfldj3a + paxbbvld1a + "nxdGqEHN" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            int amczrdfldj3 = 50;
            boolean ldsxjph2 = false;
            int paxbbvld1 = 51;
            int zobwrzaw0 = 5;
            float yzqcowq3 = 3.3f;
            char iwiqmjya2 = 73;
            float ynmsjgmrja1 = 21.21f;
            float tuwuwycxzd0 = 78.78f;
            boolean mlxmxssxsq2 = true;
            boolean izvisreyq1 = true;
            byte axwawhzm0 = 41;
            double udtenol3 = 79.79;
            byte cpuuiwcex2 = 7;
            double wwsfstbj1 = 39.39;
            int cmgwetly0 = 49;
            byte mubdrgssn4 = 19;
            float mytrvehlw3 = 67.67f;
            char dabthbyets2 = 39;
            byte toihkhus1 = 99;
            double sfbuytrmu0 = 40.40;
            byte keoyxveuju3 = 60;
            boolean jzwnmnu2 = true;
            boolean eyvokemg1 = true;
            char wfmevgjdzy0 = 41;
            short udpnapcrk1 = 87;
            boolean fnqfboz0 = false;
            byte dlqrdyjs3 = 83;
            float mgqgnft2 = 47.47f;
            short haaigmqdpg1 = 52;
            double rirjtcob0 = 28.28;
            long bgwxsaj2 = 85L;
            long rrbasgyz1 = 31L;
            int sfssawrwvu0 = 45;
            int cyvpxfv0 = 73;
            boolean cbgelanyi2 = false;
            int qiclwvbw1 = 73;
            char xupyeiiwz0 = 66;
            float yeqfzgo0 = 60.60f;
            DEaVcxAs(xupyeiiwz0, qiclwvbw1, cbgelanyi2);
            jQPVEmYO(cmgwetly0, wwsfstbj1, cpuuiwcex2, udtenol3);
            DEaVcxAs(xupyeiiwz0, qiclwvbw1, cbgelanyi2);
            nxdGqEHN(zobwrzaw0, paxbbvld1, ldsxjph2, amczrdfldj3);
            if (SpeedManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            nxdGqEHN(zobwrzaw0, paxbbvld1, ldsxjph2, amczrdfldj3);
            NyxtgXkz(cyvpxfv0);
            DEaVcxAs(xupyeiiwz0, qiclwvbw1, cbgelanyi2);
            mIsBound = false;
            nfFMeUZE(rirjtcob0, haaigmqdpg1, mgqgnft2, dlqrdyjs3);
            fOWHJsld(sfbuytrmu0, toihkhus1, dabthbyets2, mytrvehlw3, mubdrgssn4);
            nfFMeUZE(rirjtcob0, haaigmqdpg1, mgqgnft2, dlqrdyjs3);
            nxdGqEHN(zobwrzaw0, paxbbvld1, ldsxjph2, amczrdfldj3);
            LQbVITwu(fnqfboz0, udpnapcrk1);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private long uefPQUR = 7L;

    //垃圾变量
    private float qRUabpt = 55.55f;

    //垃圾变量
    private double njapRRQ = 79.79;

    //垃圾变量
    private short WMBbbLt = 94;

    //垃圾变量
    private char yuaZrdH = 76;

    //垃圾变量
    private long mBCzXSJ = 26L;

    //垃圾变量
    private char QQPBcjC = 7;

    //垃圾变量
    private long DOPKDep = 21L;

    //垃圾方法
    private void hrnKoJbV(short nmdnqay0, int bjmlmps1) {
        int bjmlmps1a = bjmlmps1;
        short nmdnqay0a = nmdnqay0;
        new StringReader("hrnKoJbV" + bjmlmps1a + nmdnqay0a + "hrnKoJbV" + QNWaVTi + EXlmsHJ + HsEFyIt + yKUoxhg + KoOIBls + ySjKVFf + uefPQUR + Oexngty + ctRAaSB + QQPBcjC + njapRRQ + ICCgUWS + fiswDQt + yuaZrdH + HGclQYK + PvfuFcf + "");
    }

    //垃圾方法
    private void zzRXMpMe(char dktwxkslb0, byte mbyjtkqlln1, short avaznlcrwt2, double muggljbo3, short ialbjjhku4) {
        short ialbjjhku4a = ialbjjhku4;
        double muggljbo3a = muggljbo3;
        short avaznlcrwt2a = avaznlcrwt2;
        byte mbyjtkqlln1a = mbyjtkqlln1;
        char dktwxkslb0a = dktwxkslb0;
        new Thread("zzRXMpMe" + dktwxkslb0a + mbyjtkqlln1a + muggljbo3a + avaznlcrwt2a + ialbjjhku4a + "zzRXMpMe" + HsEFyIt + njapRRQ + yKUoxhg + ctRAaSB + yuaZrdH + uefPQUR + PvfuFcf + ySjKVFf + KoOIBls + Oexngty + EXlmsHJ + QNWaVTi + ICCgUWS + QQPBcjC + HGclQYK + fiswDQt + "");
    }

    //垃圾方法
    private void mPWnJjCY(double lcchegmux0) {
        double lcchegmux0a = lcchegmux0;
        new Intent("mPWnJjCY" + lcchegmux0a + "mPWnJjCY" + HGclQYK + ySjKVFf + ctRAaSB + QQPBcjC + HsEFyIt + Oexngty + fiswDQt + yuaZrdH + yKUoxhg + uefPQUR + EXlmsHJ + PvfuFcf + ICCgUWS + QNWaVTi + KoOIBls + njapRRQ + "");
    }

    //垃圾方法
    private void oQpAoFYz(char mywfplew0, double vanqyckjte1, int qcrfknj2, double tmoxosy3) {
        double tmoxosy3a = tmoxosy3;
        int qcrfknj2a = qcrfknj2;
        double vanqyckjte1a = vanqyckjte1;
        char mywfplew0a = mywfplew0;
        new StringBuffer("oQpAoFYz" + qcrfknj2a + tmoxosy3a + vanqyckjte1a + mywfplew0a + "oQpAoFYz" + Oexngty + QQPBcjC + QNWaVTi + HGclQYK + HsEFyIt + PvfuFcf + KoOIBls + yuaZrdH + njapRRQ + yKUoxhg + uefPQUR + ySjKVFf + fiswDQt + ICCgUWS + ctRAaSB + EXlmsHJ + "");
    }

    //垃圾方法
    private void jPrVWXSm(float ktlcseu0, long fghgclh1, char nobddgmvr2, short evnllxpx3, double pblzablxy4) {
        double pblzablxy4a = pblzablxy4;
        short evnllxpx3a = evnllxpx3;
        char nobddgmvr2a = nobddgmvr2;
        long fghgclh1a = fghgclh1;
        float ktlcseu0a = ktlcseu0;
        Log.i("jPrVWXSm", "jPrVWXSm" + ktlcseu0a + pblzablxy4a + fghgclh1a + evnllxpx3a + nobddgmvr2a + "jPrVWXSm" + fiswDQt + Oexngty + ctRAaSB + QQPBcjC + EXlmsHJ + yuaZrdH + HsEFyIt + PvfuFcf + yKUoxhg + uefPQUR + KoOIBls + ICCgUWS + QNWaVTi + njapRRQ + ySjKVFf + HGclQYK + "");
    }

    //垃圾方法
    private void tuayRads(boolean kcclyrjp0) {
        boolean kcclyrjp0a = kcclyrjp0;
        TextUtils.isDigitsOnly("tuayRads" + kcclyrjp0a + "tuayRads" + KoOIBls + yKUoxhg + HGclQYK + fiswDQt + njapRRQ + HsEFyIt + QQPBcjC + PvfuFcf + ySjKVFf + yuaZrdH + ctRAaSB + Oexngty + QNWaVTi + ICCgUWS + EXlmsHJ + uefPQUR + "");
    }

    //垃圾方法
    private void OEeMVLZw(double eddfwnt0, int kyqccxexq1, boolean kpoirlora2) {
        boolean kpoirlora2a = kpoirlora2;
        int kyqccxexq1a = kyqccxexq1;
        double eddfwnt0a = eddfwnt0;
        new StringReader("OEeMVLZw" + eddfwnt0a + kyqccxexq1a + kpoirlora2a + "OEeMVLZw" + Oexngty + PvfuFcf + ctRAaSB + HsEFyIt + ySjKVFf + yuaZrdH + QQPBcjC + QNWaVTi + EXlmsHJ + ICCgUWS + fiswDQt + KoOIBls + HGclQYK + yKUoxhg + uefPQUR + njapRRQ + "");
    }

    //垃圾方法
    private void oHpFhbHk(double mgiwarv0, char nclowswgbj1, boolean ooaaiuiq2, double kvilholqgr3, short iszoujpu4) {
        short iszoujpu4a = iszoujpu4;
        double kvilholqgr3a = kvilholqgr3;
        boolean ooaaiuiq2a = ooaaiuiq2;
        char nclowswgbj1a = nclowswgbj1;
        double mgiwarv0a = mgiwarv0;
        new Thread("oHpFhbHk" + mgiwarv0a + nclowswgbj1a + iszoujpu4a + ooaaiuiq2a + kvilholqgr3a + "oHpFhbHk" + ICCgUWS + KoOIBls + uefPQUR + yuaZrdH + yKUoxhg + QQPBcjC + Oexngty + fiswDQt + njapRRQ + HGclQYK + HsEFyIt + PvfuFcf + ySjKVFf + ctRAaSB + QNWaVTi + EXlmsHJ + "");
    }

    public String toString() {
        short iszoujpu4 = 62;
        double kvilholqgr3 = 4.4;
        boolean ooaaiuiq2 = false;
        char nclowswgbj1 = 42;
        double mgiwarv0 = 82.82;
        boolean kpoirlora2 = true;
        int kyqccxexq1 = 41;
        double eddfwnt0 = 35.35;
        boolean kcclyrjp0 = true;
        double pblzablxy4 = 26.26;
        short evnllxpx3 = 66;
        char nobddgmvr2 = 25;
        long fghgclh1 = 67L;
        float ktlcseu0 = 4.4f;
        double tmoxosy3 = 57.57;
        int qcrfknj2 = 74;
        double vanqyckjte1 = 86.86;
        char mywfplew0 = 51;
        double lcchegmux0 = 62.62;
        short ialbjjhku4 = 34;
        double muggljbo3 = 7.7;
        short avaznlcrwt2 = 95;
        byte mbyjtkqlln1 = 100;
        char dktwxkslb0 = 52;
        int bjmlmps1 = 28;
        short nmdnqay0 = 50;
        zzRXMpMe(dktwxkslb0, mbyjtkqlln1, avaznlcrwt2, muggljbo3, ialbjjhku4);
        hrnKoJbV(nmdnqay0, bjmlmps1);
        oHpFhbHk(mgiwarv0, nclowswgbj1, ooaaiuiq2, kvilholqgr3, iszoujpu4);
        mPWnJjCY(lcchegmux0);
        oQpAoFYz(mywfplew0, vanqyckjte1, qcrfknj2, tmoxosy3);
        OEeMVLZw(eddfwnt0, kyqccxexq1, kpoirlora2);
        mPWnJjCY(lcchegmux0);
        oQpAoFYz(mywfplew0, vanqyckjte1, qcrfknj2, tmoxosy3);
        System.out.println("" + DOPKDep + WMBbbLt + qRUabpt + mBCzXSJ + "");
        zzRXMpMe(dktwxkslb0, mbyjtkqlln1, avaznlcrwt2, muggljbo3, ialbjjhku4);
        zzRXMpMe(dktwxkslb0, mbyjtkqlln1, avaznlcrwt2, muggljbo3, ialbjjhku4);
        hrnKoJbV(nmdnqay0, bjmlmps1);
        oHpFhbHk(mgiwarv0, nclowswgbj1, ooaaiuiq2, kvilholqgr3, iszoujpu4);
        jPrVWXSm(ktlcseu0, fghgclh1, nobddgmvr2, evnllxpx3, pblzablxy4);
        jPrVWXSm(ktlcseu0, fghgclh1, nobddgmvr2, evnllxpx3, pblzablxy4);
        mPWnJjCY(lcchegmux0);
        jPrVWXSm(ktlcseu0, fghgclh1, nobddgmvr2, evnllxpx3, pblzablxy4);
        OEeMVLZw(eddfwnt0, kyqccxexq1, kpoirlora2);
        return super.toString();
    }
}
