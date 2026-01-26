package com.tidy.file.old.opdj;

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
import androidx.content.tidy.IProcessServiceTidy;
import com.tidy.file.old.TidyManager;
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

public class Tidy2Service extends Service {

    //垃圾变量
    private boolean XKgdlJy = false;

    String TAG = "xxx";

    //垃圾变量
    private boolean uvkfelh = true;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private int xaeVepM = 6;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private float oMuDEtn = 71.71f;

    public static Boolean isLiving = false;

    //垃圾变量
    private float tSnJWPk = 48.48f;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private float HYJmFSS = 5.5f;

    private static long delayTime = 250L;

    //垃圾变量
    private double DDDVQfP = 66.66;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private char qBkqRdp = 57;

    public static boolean isStartService = false;

    //垃圾变量
    private char lOwuCsK = 63;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (TidyManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private byte FBNJsvG = 100;

    int nextNum = -1;

    //垃圾变量
    private float xPYItzA = 17.17f;

    private static IBinder mainBinder = null;

    public Tidy2Service() {
    }

    //垃圾方法
    private void yujOkWKh(byte jqrbsjt0, char moeqoff1) {
        char moeqoff1a = moeqoff1;
        byte jqrbsjt0a = jqrbsjt0;
        Log.w("yujOkWKh", "yujOkWKh" + jqrbsjt0a + moeqoff1a + "yujOkWKh" + qBkqRdp + XKgdlJy + FBNJsvG + tSnJWPk + bAxcwLt + LvBGhSi + ySsnRuA + uvkfelh + xPYItzA + lOwuCsK + DDDVQfP + qMAgxML + xaeVepM + HYJmFSS + oMuDEtn + "");
    }

    //垃圾方法
    private void YKUoDHep(int lfwrqnq0) {
        int lfwrqnq0a = lfwrqnq0;
        new StringBuffer("YKUoDHep" + lfwrqnq0a + "YKUoDHep" + qBkqRdp + DDDVQfP + xPYItzA + qMAgxML + bAxcwLt + LvBGhSi + tSnJWPk + xaeVepM + HYJmFSS + FBNJsvG + XKgdlJy + ySsnRuA + oMuDEtn + lOwuCsK + uvkfelh + "");
    }

    //垃圾方法
    private void jfPfozUX(double noxabaiup0, char ycicmkh1, long pbwkyfyww2, char kfcuigmw3, byte jvnxbuh4) {
        byte jvnxbuh4a = jvnxbuh4;
        char kfcuigmw3a = kfcuigmw3;
        long pbwkyfyww2a = pbwkyfyww2;
        char ycicmkh1a = ycicmkh1;
        double noxabaiup0a = noxabaiup0;
        System.out.println("jfPfozUX" + jvnxbuh4a + noxabaiup0a + kfcuigmw3a + pbwkyfyww2a + ycicmkh1a + "jfPfozUX" + qBkqRdp + qMAgxML + oMuDEtn + ySsnRuA + lOwuCsK + bAxcwLt + XKgdlJy + DDDVQfP + FBNJsvG + xPYItzA + LvBGhSi + tSnJWPk + uvkfelh + HYJmFSS + xaeVepM + "");
    }

    //垃圾方法
    private void IOYmhZFA(long idztyqde0, int iqdfzdoip1, byte fadbkir2) {
        byte fadbkir2a = fadbkir2;
        int iqdfzdoip1a = iqdfzdoip1;
        long idztyqde0a = idztyqde0;
        Log.w("IOYmhZFA", "IOYmhZFA" + iqdfzdoip1a + idztyqde0a + fadbkir2a + "IOYmhZFA" + oMuDEtn + qMAgxML + lOwuCsK + xaeVepM + ySsnRuA + DDDVQfP + xPYItzA + qBkqRdp + XKgdlJy + bAxcwLt + HYJmFSS + tSnJWPk + uvkfelh + LvBGhSi + FBNJsvG + "");
    }

    //垃圾方法
    private void uIUEMZxi(double kpronhvc0, byte yiaxbkbvhz1, boolean mhbaymfsy2, char fmfwmmi3, byte nxhlhkr4) {
        byte nxhlhkr4a = nxhlhkr4;
        char fmfwmmi3a = fmfwmmi3;
        boolean mhbaymfsy2a = mhbaymfsy2;
        byte yiaxbkbvhz1a = yiaxbkbvhz1;
        double kpronhvc0a = kpronhvc0;
        TextUtils.isDigitsOnly("uIUEMZxi" + kpronhvc0a + fmfwmmi3a + mhbaymfsy2a + nxhlhkr4a + yiaxbkbvhz1a + "uIUEMZxi" + uvkfelh + qBkqRdp + FBNJsvG + tSnJWPk + XKgdlJy + HYJmFSS + oMuDEtn + qMAgxML + lOwuCsK + bAxcwLt + DDDVQfP + ySsnRuA + LvBGhSi + xaeVepM + xPYItzA + "");
    }

    //垃圾方法
    private void tcqRKIau(char gemtbvf0, boolean wcurwqkctf1, byte zxxulxqd2) {
        byte zxxulxqd2a = zxxulxqd2;
        boolean wcurwqkctf1a = wcurwqkctf1;
        char gemtbvf0a = gemtbvf0;
        new StringBuffer("tcqRKIau" + wcurwqkctf1a + gemtbvf0a + zxxulxqd2a + "tcqRKIau" + LvBGhSi + qMAgxML + tSnJWPk + qBkqRdp + ySsnRuA + xaeVepM + FBNJsvG + oMuDEtn + DDDVQfP + uvkfelh + bAxcwLt + XKgdlJy + HYJmFSS + lOwuCsK + xPYItzA + "");
    }

    //垃圾方法
    private void EnwRtGdW(long pdmqfiuwg0, char yrpdrpdox1, short wwgwzvse2) {
        short wwgwzvse2a = wwgwzvse2;
        char yrpdrpdox1a = yrpdrpdox1;
        long pdmqfiuwg0a = pdmqfiuwg0;
        Log.w("EnwRtGdW", "EnwRtGdW" + pdmqfiuwg0a + wwgwzvse2a + yrpdrpdox1a + "EnwRtGdW" + FBNJsvG + HYJmFSS + DDDVQfP + tSnJWPk + qBkqRdp + XKgdlJy + lOwuCsK + qMAgxML + LvBGhSi + uvkfelh + oMuDEtn + ySsnRuA + xaeVepM + bAxcwLt + xPYItzA + "");
    }

    //垃圾方法
    private void QPsiIjjv(int afaskwhb0, byte jiidezfjjz1, float irgdxvb2, char urfjcpj3, boolean uxicnemldr4) {
        boolean uxicnemldr4a = uxicnemldr4;
        char urfjcpj3a = urfjcpj3;
        float irgdxvb2a = irgdxvb2;
        byte jiidezfjjz1a = jiidezfjjz1;
        int afaskwhb0a = afaskwhb0;
        new StringBuffer("QPsiIjjv" + uxicnemldr4a + afaskwhb0a + urfjcpj3a + irgdxvb2a + jiidezfjjz1a + "QPsiIjjv" + tSnJWPk + oMuDEtn + qBkqRdp + bAxcwLt + uvkfelh + xPYItzA + FBNJsvG + XKgdlJy + qMAgxML + xaeVepM + HYJmFSS + DDDVQfP + lOwuCsK + LvBGhSi + ySsnRuA + "");
    }

    //垃圾方法
    private void lrbYTXOP(int cmbweidm0, double twietnc1, long hxuebmiebf2, int sociqtxam3, boolean sqcdoow4) {
        boolean sqcdoow4a = sqcdoow4;
        int sociqtxam3a = sociqtxam3;
        long hxuebmiebf2a = hxuebmiebf2;
        double twietnc1a = twietnc1;
        int cmbweidm0a = cmbweidm0;
    }

    //垃圾方法
    private void FnELuoQI(char rqbwlrf0, float nhnrpoyb1, long brobikp2) {
        long brobikp2a = brobikp2;
        float nhnrpoyb1a = nhnrpoyb1;
        char rqbwlrf0a = rqbwlrf0;
        new AttributedString("FnELuoQI" + brobikp2a + rqbwlrf0a + nhnrpoyb1a + "FnELuoQI" + XKgdlJy + uvkfelh + ySsnRuA + bAxcwLt + LvBGhSi + qMAgxML + qBkqRdp + FBNJsvG + lOwuCsK + xaeVepM + xPYItzA + HYJmFSS + tSnJWPk + DDDVQfP + oMuDEtn + "");
    }

    //垃圾方法
    private void JrMJotac(byte mqxztvvm0, long hypxiwfml1) {
        long hypxiwfml1a = hypxiwfml1;
        byte mqxztvvm0a = mqxztvvm0;
        Log.e("JrMJotac", "JrMJotac" + hypxiwfml1a + mqxztvvm0a + "JrMJotac" + HYJmFSS + LvBGhSi + XKgdlJy + qMAgxML + xPYItzA + DDDVQfP + ySsnRuA + FBNJsvG + bAxcwLt + qBkqRdp + uvkfelh + oMuDEtn + lOwuCsK + xaeVepM + tSnJWPk + "");
    }

    //垃圾方法
    private void wqgyCzSJ(short cwffcegxsf0, short ipuhoevgk1, float sspumxpv2) {
        float sspumxpv2a = sspumxpv2;
        short ipuhoevgk1a = ipuhoevgk1;
        short cwffcegxsf0a = cwffcegxsf0;
        new StringBuffer("wqgyCzSJ" + cwffcegxsf0a + ipuhoevgk1a + sspumxpv2a + "wqgyCzSJ" + LvBGhSi + qBkqRdp + tSnJWPk + DDDVQfP + lOwuCsK + xaeVepM + ySsnRuA + FBNJsvG + XKgdlJy + bAxcwLt + HYJmFSS + qMAgxML + xPYItzA + oMuDEtn + uvkfelh + "");
    }

    //垃圾方法
    private void wUjzniWF(char xuecqthmtp0, byte hmlekjw1, double tgysgho2, char hfgjjtapo3) {
        char hfgjjtapo3a = hfgjjtapo3;
        double tgysgho2a = tgysgho2;
        byte hmlekjw1a = hmlekjw1;
        char xuecqthmtp0a = xuecqthmtp0;
        new AttributedString("wUjzniWF" + xuecqthmtp0a + hmlekjw1a + tgysgho2a + hfgjjtapo3a + "wUjzniWF" + qMAgxML + xaeVepM + xPYItzA + uvkfelh + LvBGhSi + qBkqRdp + ySsnRuA + tSnJWPk + oMuDEtn + bAxcwLt + DDDVQfP + lOwuCsK + FBNJsvG + XKgdlJy + HYJmFSS + "");
    }

    //垃圾方法
    private void aXfCXBND(char bcihdcz0) {
        char bcihdcz0a = bcihdcz0;
    }

    //垃圾方法
    private void JINxxPQe(int uomvhgv0, short rhtozyr1) {
        short rhtozyr1a = rhtozyr1;
        int uomvhgv0a = uomvhgv0;
        new File("JINxxPQe" + uomvhgv0a + rhtozyr1a + "JINxxPQe" + LvBGhSi + qMAgxML + oMuDEtn + bAxcwLt + ySsnRuA + qBkqRdp + FBNJsvG + lOwuCsK + DDDVQfP + tSnJWPk + uvkfelh + XKgdlJy + xPYItzA + HYJmFSS + xaeVepM + "");
    }

    //垃圾方法
    private void lFdhlcqY(double uhzegqeeqf0, byte fjllkgwoo1, double sxfkdnytzh2, long okoswnaoi3) {
        long okoswnaoi3a = okoswnaoi3;
        double sxfkdnytzh2a = sxfkdnytzh2;
        byte fjllkgwoo1a = fjllkgwoo1;
        double uhzegqeeqf0a = uhzegqeeqf0;
        new Intent("lFdhlcqY" + fjllkgwoo1a + sxfkdnytzh2a + okoswnaoi3a + uhzegqeeqf0a + "lFdhlcqY" + FBNJsvG + DDDVQfP + bAxcwLt + xaeVepM + qMAgxML + XKgdlJy + ySsnRuA + lOwuCsK + uvkfelh + xPYItzA + tSnJWPk + qBkqRdp + oMuDEtn + LvBGhSi + HYJmFSS + "");
    }

    //垃圾方法
    private void YckphOkC(short aitaflmq0, float vnmbdaadtm1) {
        float vnmbdaadtm1a = vnmbdaadtm1;
        short aitaflmq0a = aitaflmq0;
    }

    //垃圾方法
    private void haGFfBqP(short dbeghwna0, long nbdtwkwm1) {
        long nbdtwkwm1a = nbdtwkwm1;
        short dbeghwna0a = dbeghwna0;
        TextUtils.isEmpty("haGFfBqP" + nbdtwkwm1a + dbeghwna0a + "haGFfBqP" + tSnJWPk + FBNJsvG + HYJmFSS + qMAgxML + qBkqRdp + lOwuCsK + oMuDEtn + xaeVepM + DDDVQfP + uvkfelh + XKgdlJy + bAxcwLt + LvBGhSi + xPYItzA + ySsnRuA + "");
    }

    //垃圾方法
    private void mkBykjRD(byte sgosutogy0) {
        byte sgosutogy0a = sgosutogy0;
        Log.e("mkBykjRD", "mkBykjRD" + sgosutogy0a + "mkBykjRD" + lOwuCsK + qMAgxML + FBNJsvG + xaeVepM + LvBGhSi + oMuDEtn + qBkqRdp + XKgdlJy + bAxcwLt + DDDVQfP + tSnJWPk + HYJmFSS + ySsnRuA + xPYItzA + uvkfelh + "");
    }

    //垃圾方法
    private void TUGoUqGz(int dlvjwdgwvd0) {
        int dlvjwdgwvd0a = dlvjwdgwvd0;
        TextUtils.isDigitsOnly("TUGoUqGz" + dlvjwdgwvd0a + "TUGoUqGz" + xPYItzA + XKgdlJy + xaeVepM + lOwuCsK + uvkfelh + FBNJsvG + ySsnRuA + qMAgxML + bAxcwLt + qBkqRdp + oMuDEtn + LvBGhSi + HYJmFSS + tSnJWPk + DDDVQfP + "");
    }

    //垃圾方法
    private void jkhDeofI(short vzbwtsu0, byte zaxawal1) {
        byte zaxawal1a = zaxawal1;
        short vzbwtsu0a = vzbwtsu0;
        new StringBuffer("jkhDeofI" + vzbwtsu0a + zaxawal1a + "jkhDeofI" + LvBGhSi + HYJmFSS + XKgdlJy + xPYItzA + xaeVepM + uvkfelh + lOwuCsK + qBkqRdp + FBNJsvG + ySsnRuA + DDDVQfP + bAxcwLt + oMuDEtn + tSnJWPk + qMAgxML + "");
    }

    //垃圾方法
    private void NcOjKUyn(byte npmdvimh0, double ngjpdzfuy1, short dtmlorfksi2, double wuszzbzi3, long lwwykdq4) {
        long lwwykdq4a = lwwykdq4;
        double wuszzbzi3a = wuszzbzi3;
        short dtmlorfksi2a = dtmlorfksi2;
        double ngjpdzfuy1a = ngjpdzfuy1;
        byte npmdvimh0a = npmdvimh0;
        System.out.println("NcOjKUyn" + dtmlorfksi2a + wuszzbzi3a + lwwykdq4a + ngjpdzfuy1a + npmdvimh0a + "NcOjKUyn" + DDDVQfP + xPYItzA + XKgdlJy + uvkfelh + ySsnRuA + qBkqRdp + FBNJsvG + tSnJWPk + lOwuCsK + oMuDEtn + xaeVepM + bAxcwLt + qMAgxML + HYJmFSS + LvBGhSi + "");
    }

    //垃圾方法
    private void XCUFVGTa(short isxwiykm0) {
        short isxwiykm0a = isxwiykm0;
        new String("XCUFVGTa" + isxwiykm0a + "XCUFVGTa" + lOwuCsK + xPYItzA + ySsnRuA + DDDVQfP + qBkqRdp + LvBGhSi + HYJmFSS + XKgdlJy + bAxcwLt + uvkfelh + oMuDEtn + tSnJWPk + qMAgxML + FBNJsvG + xaeVepM + "");
    }

    //垃圾方法
    private void lyNYCvbN(long vwvavqhym0, char zseuoqn1) {
        char zseuoqn1a = zseuoqn1;
        long vwvavqhym0a = vwvavqhym0;
        Log.w("lyNYCvbN", "lyNYCvbN" + zseuoqn1a + vwvavqhym0a + "lyNYCvbN" + LvBGhSi + xPYItzA + uvkfelh + bAxcwLt + FBNJsvG + ySsnRuA + DDDVQfP + tSnJWPk + HYJmFSS + xaeVepM + lOwuCsK + qMAgxML + XKgdlJy + qBkqRdp + oMuDEtn + "");
    }

    //垃圾方法
    private void NqTKuuZJ(float rxhwwkswia0) {
        float rxhwwkswia0a = rxhwwkswia0;
        new StringReader("NqTKuuZJ" + rxhwwkswia0a + "NqTKuuZJ" + ySsnRuA + FBNJsvG + qBkqRdp + xaeVepM + tSnJWPk + uvkfelh + LvBGhSi + qMAgxML + HYJmFSS + bAxcwLt + lOwuCsK + xPYItzA + DDDVQfP + XKgdlJy + oMuDEtn + "");
    }

    //垃圾方法
    private void WEBAajPH(long iobynnf0, double isizumyvcu1, float okpljooof2, long ncjmyocq3) {
        long ncjmyocq3a = ncjmyocq3;
        float okpljooof2a = okpljooof2;
        double isizumyvcu1a = isizumyvcu1;
        long iobynnf0a = iobynnf0;
        new StringReader("WEBAajPH" + iobynnf0a + isizumyvcu1a + ncjmyocq3a + okpljooof2a + "WEBAajPH" + HYJmFSS + LvBGhSi + ySsnRuA + lOwuCsK + oMuDEtn + tSnJWPk + bAxcwLt + xPYItzA + qMAgxML + FBNJsvG + XKgdlJy + uvkfelh + qBkqRdp + DDDVQfP + xaeVepM + "");
    }

    //垃圾方法
    private void iOXFZxPo(float aucwjgpcdq0, double avfsyybaty1) {
        double avfsyybaty1a = avfsyybaty1;
        float aucwjgpcdq0a = aucwjgpcdq0;
        TextUtils.isDigitsOnly("iOXFZxPo" + avfsyybaty1a + aucwjgpcdq0a + "iOXFZxPo" + bAxcwLt + LvBGhSi + DDDVQfP + HYJmFSS + lOwuCsK + ySsnRuA + xPYItzA + XKgdlJy + FBNJsvG + xaeVepM + oMuDEtn + tSnJWPk + qBkqRdp + qMAgxML + uvkfelh + "");
    }

    //垃圾方法
    private void zZcwPPMK(short rpiradarne0, float nlmqvhk1, double bpochvf2) {
        double bpochvf2a = bpochvf2;
        float nlmqvhk1a = nlmqvhk1;
        short rpiradarne0a = rpiradarne0;
        new StringReader("zZcwPPMK" + rpiradarne0a + bpochvf2a + nlmqvhk1a + "zZcwPPMK" + uvkfelh + DDDVQfP + tSnJWPk + oMuDEtn + XKgdlJy + ySsnRuA + qBkqRdp + lOwuCsK + FBNJsvG + bAxcwLt + xPYItzA + HYJmFSS + LvBGhSi + xaeVepM + qMAgxML + "");
    }

    public void onCreate() {
        double bpochvf2 = 56.56;
        float nlmqvhk1 = 11.11f;
        short rpiradarne0 = 71;
        double avfsyybaty1 = 76.76;
        float aucwjgpcdq0 = 89.89f;
        long ncjmyocq3 = 14L;
        float okpljooof2 = 71.71f;
        double isizumyvcu1 = 65.65;
        long iobynnf0 = 64L;
        float rxhwwkswia0 = 53.53f;
        char zseuoqn1 = 51;
        long vwvavqhym0 = 51L;
        short isxwiykm0 = 20;
        long lwwykdq4 = 52L;
        double wuszzbzi3 = 35.35;
        short dtmlorfksi2 = 51;
        double ngjpdzfuy1 = 61.61;
        byte npmdvimh0 = 54;
        byte zaxawal1 = 40;
        short vzbwtsu0 = 23;
        int dlvjwdgwvd0 = 74;
        byte sgosutogy0 = 77;
        long nbdtwkwm1 = 0L;
        short dbeghwna0 = 68;
        float vnmbdaadtm1 = 4.4f;
        short aitaflmq0 = 23;
        long okoswnaoi3 = 43L;
        double sxfkdnytzh2 = 13.13;
        byte fjllkgwoo1 = 25;
        double uhzegqeeqf0 = 98.98;
        short rhtozyr1 = 15;
        int uomvhgv0 = 73;
        char bcihdcz0 = 77;
        char hfgjjtapo3 = 33;
        double tgysgho2 = 74.74;
        byte hmlekjw1 = 77;
        char xuecqthmtp0 = 36;
        float sspumxpv2 = 76.76f;
        short ipuhoevgk1 = 48;
        short cwffcegxsf0 = 41;
        long hypxiwfml1 = 68L;
        byte mqxztvvm0 = 100;
        long brobikp2 = 59L;
        float nhnrpoyb1 = 75.75f;
        char rqbwlrf0 = 100;
        boolean sqcdoow4 = false;
        int sociqtxam3 = 75;
        long hxuebmiebf2 = 2L;
        double twietnc1 = 52.52;
        int cmbweidm0 = 46;
        boolean uxicnemldr4 = true;
        char urfjcpj3 = 14;
        float irgdxvb2 = 19.19f;
        byte jiidezfjjz1 = 67;
        int afaskwhb0 = 95;
        short wwgwzvse2 = 71;
        char yrpdrpdox1 = 59;
        long pdmqfiuwg0 = 88L;
        byte zxxulxqd2 = 27;
        boolean wcurwqkctf1 = true;
        char gemtbvf0 = 37;
        byte nxhlhkr4 = 3;
        char fmfwmmi3 = 11;
        boolean mhbaymfsy2 = false;
        byte yiaxbkbvhz1 = 78;
        double kpronhvc0 = 78.78;
        byte fadbkir2 = 53;
        int iqdfzdoip1 = 7;
        long idztyqde0 = 45L;
        byte jvnxbuh4 = 90;
        char kfcuigmw3 = 3;
        long pbwkyfyww2 = 52L;
        char ycicmkh1 = 57;
        double noxabaiup0 = 68.68;
        int lfwrqnq0 = 5;
        char moeqoff1 = 44;
        byte jqrbsjt0 = 2;
        lyNYCvbN(vwvavqhym0, zseuoqn1);
        NcOjKUyn(npmdvimh0, ngjpdzfuy1, dtmlorfksi2, wuszzbzi3, lwwykdq4);
        iOXFZxPo(aucwjgpcdq0, avfsyybaty1);
        tcqRKIau(gemtbvf0, wcurwqkctf1, zxxulxqd2);
        zZcwPPMK(rpiradarne0, nlmqvhk1, bpochvf2);
        mkBykjRD(sgosutogy0);
        NcOjKUyn(npmdvimh0, ngjpdzfuy1, dtmlorfksi2, wuszzbzi3, lwwykdq4);
        TUGoUqGz(dlvjwdgwvd0);
        YKUoDHep(lfwrqnq0);
        isLiving = true;
        super.onCreate();
        yujOkWKh(jqrbsjt0, moeqoff1);
        YckphOkC(aitaflmq0, vnmbdaadtm1);
        lFdhlcqY(uhzegqeeqf0, fjllkgwoo1, sxfkdnytzh2, okoswnaoi3);
        wqgyCzSJ(cwffcegxsf0, ipuhoevgk1, sspumxpv2);
        if (TidyManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        this.mServiceBinder = new ServiceBinder(this);
        wqgyCzSJ(cwffcegxsf0, ipuhoevgk1, sspumxpv2);
        mkBykjRD(sgosutogy0);
        mkBykjRD(sgosutogy0);
        NcOjKUyn(npmdvimh0, ngjpdzfuy1, dtmlorfksi2, wuszzbzi3, lwwykdq4);
        zZcwPPMK(rpiradarne0, nlmqvhk1, bpochvf2);
        yujOkWKh(jqrbsjt0, moeqoff1);
        if (this.mRemoteServiceConn == null) {
            JINxxPQe(uomvhgv0, rhtozyr1);
            lyNYCvbN(vwvavqhym0, zseuoqn1);
            iOXFZxPo(aucwjgpcdq0, avfsyybaty1);
            TUGoUqGz(dlvjwdgwvd0);
            uIUEMZxi(kpronhvc0, yiaxbkbvhz1, mhbaymfsy2, fmfwmmi3, nxhlhkr4);
            lrbYTXOP(cmbweidm0, twietnc1, hxuebmiebf2, sociqtxam3, sqcdoow4);
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        YKUoDHep(lfwrqnq0);
        FnELuoQI(rqbwlrf0, nhnrpoyb1, brobikp2);
        wqgyCzSJ(cwffcegxsf0, ipuhoevgk1, sspumxpv2);
        EnwRtGdW(pdmqfiuwg0, yrpdrpdox1, wwgwzvse2);
        uIUEMZxi(kpronhvc0, yiaxbkbvhz1, mhbaymfsy2, fmfwmmi3, nxhlhkr4);
        aXfCXBND(bcihdcz0);
        NcOjKUyn(npmdvimh0, ngjpdzfuy1, dtmlorfksi2, wuszzbzi3, lwwykdq4);
        uIUEMZxi(kpronhvc0, yiaxbkbvhz1, mhbaymfsy2, fmfwmmi3, nxhlhkr4);
        mkBykjRD(sgosutogy0);
        isReTryBinding = true;
        this.startMainService(1, false);
    }

    //垃圾方法
    private void xpjASwLE(char xsklpsele0, char niseednj1, long jejaxvuzt2) {
        long jejaxvuzt2a = jejaxvuzt2;
        char niseednj1a = niseednj1;
        char xsklpsele0a = xsklpsele0;
        Log.e("xpjASwLE", "xpjASwLE" + niseednj1a + xsklpsele0a + jejaxvuzt2a + "xpjASwLE" + ySsnRuA + bAxcwLt + oMuDEtn + lOwuCsK + qMAgxML + xPYItzA + xaeVepM + uvkfelh + XKgdlJy + tSnJWPk + FBNJsvG + HYJmFSS + DDDVQfP + LvBGhSi + qBkqRdp + "");
    }

    //垃圾方法
    private void IUqYQhhM(byte rbidpupp0, float ghadaqk1, double pyqnsrej2, int uknkvusi3) {
        int uknkvusi3a = uknkvusi3;
        double pyqnsrej2a = pyqnsrej2;
        float ghadaqk1a = ghadaqk1;
        byte rbidpupp0a = rbidpupp0;
        new AttributedString("IUqYQhhM" + rbidpupp0a + pyqnsrej2a + uknkvusi3a + ghadaqk1a + "IUqYQhhM" + xaeVepM + qMAgxML + qBkqRdp + bAxcwLt + FBNJsvG + xPYItzA + LvBGhSi + oMuDEtn + DDDVQfP + HYJmFSS + lOwuCsK + XKgdlJy + tSnJWPk + ySsnRuA + uvkfelh + "");
    }

    //垃圾方法
    private void MlfrnSRS(short eezttpo0, short uhithkyon1, short eakpweici2, float rkslhvbrx3, float srdcwna4) {
        float srdcwna4a = srdcwna4;
        float rkslhvbrx3a = rkslhvbrx3;
        short eakpweici2a = eakpweici2;
        short uhithkyon1a = uhithkyon1;
        short eezttpo0a = eezttpo0;
        TextUtils.isDigitsOnly("MlfrnSRS" + eezttpo0a + eakpweici2a + rkslhvbrx3a + srdcwna4a + uhithkyon1a + "MlfrnSRS" + FBNJsvG + qMAgxML + XKgdlJy + xPYItzA + bAxcwLt + ySsnRuA + xaeVepM + LvBGhSi + tSnJWPk + oMuDEtn + HYJmFSS + qBkqRdp + DDDVQfP + uvkfelh + lOwuCsK + "");
    }

    //垃圾方法
    private void kamyPPyT(byte qtgemjdsdr0, int kbwdndqrx1, double vgyxuth2, short ibtmwvoqj3) {
        short ibtmwvoqj3a = ibtmwvoqj3;
        double vgyxuth2a = vgyxuth2;
        int kbwdndqrx1a = kbwdndqrx1;
        byte qtgemjdsdr0a = qtgemjdsdr0;
        Log.w("kamyPPyT", "kamyPPyT" + vgyxuth2a + ibtmwvoqj3a + qtgemjdsdr0a + kbwdndqrx1a + "kamyPPyT" + qBkqRdp + LvBGhSi + ySsnRuA + bAxcwLt + xPYItzA + qMAgxML + FBNJsvG + uvkfelh + lOwuCsK + xaeVepM + oMuDEtn + tSnJWPk + HYJmFSS + DDDVQfP + XKgdlJy + "");
    }

    //垃圾方法
    private void qiYuSMLb(char rsvkekilkk0, short nghikqi1, short scazjrmu2) {
        short scazjrmu2a = scazjrmu2;
        short nghikqi1a = nghikqi1;
        char rsvkekilkk0a = rsvkekilkk0;
        Log.e("qiYuSMLb", "qiYuSMLb" + scazjrmu2a + rsvkekilkk0a + nghikqi1a + "qiYuSMLb" + tSnJWPk + xaeVepM + DDDVQfP + HYJmFSS + oMuDEtn + qMAgxML + xPYItzA + FBNJsvG + qBkqRdp + LvBGhSi + ySsnRuA + uvkfelh + XKgdlJy + bAxcwLt + lOwuCsK + "");
    }

    //垃圾方法
    private void yaAMnlso(short yafynilwq0, int vfgteuxvld1, int cypjcqsh2, float vxhfgght3, float srmqoszly4) {
        float srmqoszly4a = srmqoszly4;
        float vxhfgght3a = vxhfgght3;
        int cypjcqsh2a = cypjcqsh2;
        int vfgteuxvld1a = vfgteuxvld1;
        short yafynilwq0a = yafynilwq0;
        Log.e("yaAMnlso", "yaAMnlso" + srmqoszly4a + yafynilwq0a + cypjcqsh2a + vfgteuxvld1a + vxhfgght3a + "yaAMnlso" + XKgdlJy + ySsnRuA + DDDVQfP + tSnJWPk + lOwuCsK + FBNJsvG + xPYItzA + qBkqRdp + uvkfelh + HYJmFSS + LvBGhSi + bAxcwLt + qMAgxML + oMuDEtn + xaeVepM + "");
    }

    //垃圾方法
    private void yDwfmqpG(double jizjxda0, int vvjryhzxaf1, float sjqivejj2, short anilrdi3) {
        short anilrdi3a = anilrdi3;
        float sjqivejj2a = sjqivejj2;
        int vvjryhzxaf1a = vvjryhzxaf1;
        double jizjxda0a = jizjxda0;
        TextUtils.isDigitsOnly("yDwfmqpG" + anilrdi3a + sjqivejj2a + jizjxda0a + vvjryhzxaf1a + "yDwfmqpG" + oMuDEtn + LvBGhSi + lOwuCsK + uvkfelh + DDDVQfP + qMAgxML + ySsnRuA + bAxcwLt + qBkqRdp + HYJmFSS + xPYItzA + tSnJWPk + FBNJsvG + xaeVepM + XKgdlJy + "");
    }

    //垃圾方法
    private void OzxpRwBi(byte eijqghzy0, float pztaaphoba1, boolean ydnklylhdy2, byte nbtssri3) {
        byte nbtssri3a = nbtssri3;
        boolean ydnklylhdy2a = ydnklylhdy2;
        float pztaaphoba1a = pztaaphoba1;
        byte eijqghzy0a = eijqghzy0;
        Log.w("OzxpRwBi", "OzxpRwBi" + ydnklylhdy2a + eijqghzy0a + nbtssri3a + pztaaphoba1a + "OzxpRwBi" + xaeVepM + lOwuCsK + oMuDEtn + FBNJsvG + xPYItzA + LvBGhSi + qBkqRdp + XKgdlJy + DDDVQfP + HYJmFSS + ySsnRuA + uvkfelh + tSnJWPk + bAxcwLt + qMAgxML + "");
    }

    //垃圾方法
    private void bUMBjAEa(boolean jbsabzbfp0, float iztrmtcp1, boolean mjtztow2, char iseiqcxln3, long xybhetk4) {
        long xybhetk4a = xybhetk4;
        char iseiqcxln3a = iseiqcxln3;
        boolean mjtztow2a = mjtztow2;
        float iztrmtcp1a = iztrmtcp1;
        boolean jbsabzbfp0a = jbsabzbfp0;
        System.out.println("bUMBjAEa" + mjtztow2a + iztrmtcp1a + iseiqcxln3a + jbsabzbfp0a + xybhetk4a + "bUMBjAEa" + oMuDEtn + bAxcwLt + FBNJsvG + DDDVQfP + xaeVepM + ySsnRuA + HYJmFSS + xPYItzA + qBkqRdp + lOwuCsK + qMAgxML + uvkfelh + LvBGhSi + XKgdlJy + tSnJWPk + "");
    }

    //垃圾方法
    private void rAYCtfGt(char vlbdwzjh0, boolean tanplabers1, double gyaubeeo2, byte bhvckru3, boolean defmhodr4) {
        boolean defmhodr4a = defmhodr4;
        byte bhvckru3a = bhvckru3;
        double gyaubeeo2a = gyaubeeo2;
        boolean tanplabers1a = tanplabers1;
        char vlbdwzjh0a = vlbdwzjh0;
    }

    //垃圾方法
    private void UmJPwWwo(short ozegqgjq0, double cnebtawtlo1) {
        double cnebtawtlo1a = cnebtawtlo1;
        short ozegqgjq0a = ozegqgjq0;
        new Thread("UmJPwWwo" + ozegqgjq0a + cnebtawtlo1a + "UmJPwWwo" + xPYItzA + xaeVepM + oMuDEtn + bAxcwLt + HYJmFSS + DDDVQfP + XKgdlJy + tSnJWPk + FBNJsvG + ySsnRuA + qBkqRdp + qMAgxML + lOwuCsK + uvkfelh + LvBGhSi + "");
    }

    //垃圾方法
    private void YgQisfVu(boolean lsbfhpfayr0) {
        boolean lsbfhpfayr0a = lsbfhpfayr0;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        boolean lsbfhpfayr0 = false;
        double cnebtawtlo1 = 0.0;
        short ozegqgjq0 = 89;
        boolean defmhodr4 = false;
        byte bhvckru3 = 64;
        double gyaubeeo2 = 92.92;
        boolean tanplabers1 = true;
        char vlbdwzjh0 = 2;
        long xybhetk4 = 68L;
        char iseiqcxln3 = 38;
        boolean mjtztow2 = false;
        float iztrmtcp1 = 51.51f;
        boolean jbsabzbfp0 = true;
        byte nbtssri3 = 25;
        boolean ydnklylhdy2 = false;
        float pztaaphoba1 = 30.30f;
        byte eijqghzy0 = 77;
        short anilrdi3 = 21;
        float sjqivejj2 = 42.42f;
        int vvjryhzxaf1 = 70;
        double jizjxda0 = 72.72;
        float srmqoszly4 = 2.2f;
        float vxhfgght3 = 36.36f;
        int cypjcqsh2 = 53;
        int vfgteuxvld1 = 7;
        short yafynilwq0 = 76;
        short scazjrmu2 = 98;
        short nghikqi1 = 98;
        char rsvkekilkk0 = 42;
        short ibtmwvoqj3 = 91;
        double vgyxuth2 = 15.15;
        int kbwdndqrx1 = 46;
        byte qtgemjdsdr0 = 26;
        float srdcwna4 = 41.41f;
        float rkslhvbrx3 = 53.53f;
        short eakpweici2 = 60;
        short uhithkyon1 = 73;
        short eezttpo0 = 22;
        int uknkvusi3 = 22;
        double pyqnsrej2 = 45.45;
        float ghadaqk1 = 28.28f;
        byte rbidpupp0 = 72;
        long jejaxvuzt2 = 2L;
        char niseednj1 = 51;
        char xsklpsele0 = 81;
        if (intent != null) {
            yDwfmqpG(jizjxda0, vvjryhzxaf1, sjqivejj2, anilrdi3);
            bUMBjAEa(jbsabzbfp0, iztrmtcp1, mjtztow2, iseiqcxln3, xybhetk4);
            yDwfmqpG(jizjxda0, vvjryhzxaf1, sjqivejj2, anilrdi3);
            IUqYQhhM(rbidpupp0, ghadaqk1, pyqnsrej2, uknkvusi3);
            YgQisfVu(lsbfhpfayr0);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        kamyPPyT(qtgemjdsdr0, kbwdndqrx1, vgyxuth2, ibtmwvoqj3);
        IUqYQhhM(rbidpupp0, ghadaqk1, pyqnsrej2, uknkvusi3);
        rAYCtfGt(vlbdwzjh0, tanplabers1, gyaubeeo2, bhvckru3, defmhodr4);
        rAYCtfGt(vlbdwzjh0, tanplabers1, gyaubeeo2, bhvckru3, defmhodr4);
        rAYCtfGt(vlbdwzjh0, tanplabers1, gyaubeeo2, bhvckru3, defmhodr4);
        IUqYQhhM(rbidpupp0, ghadaqk1, pyqnsrej2, uknkvusi3);
        UmJPwWwo(ozegqgjq0, cnebtawtlo1);
        YgQisfVu(lsbfhpfayr0);
        qiYuSMLb(rsvkekilkk0, nghikqi1, scazjrmu2);
        OzxpRwBi(eijqghzy0, pztaaphoba1, ydnklylhdy2, nbtssri3);
        if (TidyManager.isDebug) {
            YgQisfVu(lsbfhpfayr0);
            IUqYQhhM(rbidpupp0, ghadaqk1, pyqnsrej2, uknkvusi3);
            YgQisfVu(lsbfhpfayr0);
            qiYuSMLb(rsvkekilkk0, nghikqi1, scazjrmu2);
            IUqYQhhM(rbidpupp0, ghadaqk1, pyqnsrej2, uknkvusi3);
            yDwfmqpG(jizjxda0, vvjryhzxaf1, sjqivejj2, anilrdi3);
            yaAMnlso(yafynilwq0, vfgteuxvld1, cypjcqsh2, vxhfgght3, srmqoszly4);
            bUMBjAEa(jbsabzbfp0, iztrmtcp1, mjtztow2, iseiqcxln3, xybhetk4);
            IUqYQhhM(rbidpupp0, ghadaqk1, pyqnsrej2, uknkvusi3);
            xpjASwLE(xsklpsele0, niseednj1, jejaxvuzt2);
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        xpjASwLE(xsklpsele0, niseednj1, jejaxvuzt2);
        rAYCtfGt(vlbdwzjh0, tanplabers1, gyaubeeo2, bhvckru3, defmhodr4);
        yDwfmqpG(jizjxda0, vvjryhzxaf1, sjqivejj2, anilrdi3);
        UmJPwWwo(ozegqgjq0, cnebtawtlo1);
        MlfrnSRS(eezttpo0, uhithkyon1, eakpweici2, rkslhvbrx3, srdcwna4);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void oGgMqtFS(short tuuijyzuio0, double ofiwwtiub1, float ntgnbcsy2) {
        float ntgnbcsy2a = ntgnbcsy2;
        double ofiwwtiub1a = ofiwwtiub1;
        short tuuijyzuio0a = tuuijyzuio0;
        new AttributedString("oGgMqtFS" + ntgnbcsy2a + ofiwwtiub1a + tuuijyzuio0a + "oGgMqtFS" + xPYItzA + xaeVepM + XKgdlJy + FBNJsvG + qMAgxML + uvkfelh + ySsnRuA + LvBGhSi + lOwuCsK + DDDVQfP + oMuDEtn + HYJmFSS + tSnJWPk + bAxcwLt + qBkqRdp + "");
    }

    //垃圾方法
    private void DoAisRUP(char lkiryexvgq0, boolean mifuljgfpc1) {
        boolean mifuljgfpc1a = mifuljgfpc1;
        char lkiryexvgq0a = lkiryexvgq0;
        new String("DoAisRUP" + lkiryexvgq0a + mifuljgfpc1a + "DoAisRUP" + qMAgxML + uvkfelh + lOwuCsK + XKgdlJy + bAxcwLt + oMuDEtn + ySsnRuA + FBNJsvG + qBkqRdp + xPYItzA + DDDVQfP + HYJmFSS + tSnJWPk + xaeVepM + LvBGhSi + "");
    }

    //垃圾方法
    private void TWiShhWz(short cgxoqafqp0, short tjgsogb1, int eqkkahb2, double tgltirpkbc3) {
        double tgltirpkbc3a = tgltirpkbc3;
        int eqkkahb2a = eqkkahb2;
        short tjgsogb1a = tjgsogb1;
        short cgxoqafqp0a = cgxoqafqp0;
        Log.i("TWiShhWz", "TWiShhWz" + tgltirpkbc3a + tjgsogb1a + eqkkahb2a + cgxoqafqp0a + "TWiShhWz" + ySsnRuA + qBkqRdp + FBNJsvG + oMuDEtn + bAxcwLt + XKgdlJy + tSnJWPk + xaeVepM + qMAgxML + uvkfelh + HYJmFSS + LvBGhSi + xPYItzA + DDDVQfP + lOwuCsK + "");
    }

    //垃圾方法
    private void xTcbUCrY(byte wvqovao0, short dirtfmus1, float rxztlweby2) {
        float rxztlweby2a = rxztlweby2;
        short dirtfmus1a = dirtfmus1;
        byte wvqovao0a = wvqovao0;
        TextUtils.isDigitsOnly("xTcbUCrY" + dirtfmus1a + wvqovao0a + rxztlweby2a + "xTcbUCrY" + xaeVepM + xPYItzA + qBkqRdp + FBNJsvG + ySsnRuA + XKgdlJy + bAxcwLt + lOwuCsK + tSnJWPk + DDDVQfP + oMuDEtn + uvkfelh + qMAgxML + LvBGhSi + HYJmFSS + "");
    }

    //垃圾方法
    private void pzConcnm(int sdxklsnor0, double kmvzaindos1, long aaaqpspd2, float ypbmfcubp3) {
        float ypbmfcubp3a = ypbmfcubp3;
        long aaaqpspd2a = aaaqpspd2;
        double kmvzaindos1a = kmvzaindos1;
        int sdxklsnor0a = sdxklsnor0;
        new WeakReference("pzConcnm" + aaaqpspd2a + kmvzaindos1a + ypbmfcubp3a + sdxklsnor0a + "pzConcnm" + oMuDEtn + lOwuCsK + xaeVepM + tSnJWPk + LvBGhSi + xPYItzA + HYJmFSS + qBkqRdp + bAxcwLt + XKgdlJy + uvkfelh + DDDVQfP + FBNJsvG + ySsnRuA + qMAgxML + "");
    }

    //垃圾方法
    private void huBVpSER(byte shdjlalo0, byte dkbqlbpss1, boolean kbzmpeuycl2, short haxlfez3, long syykhdnuc4) {
        long syykhdnuc4a = syykhdnuc4;
        short haxlfez3a = haxlfez3;
        boolean kbzmpeuycl2a = kbzmpeuycl2;
        byte dkbqlbpss1a = dkbqlbpss1;
        byte shdjlalo0a = shdjlalo0;
        Log.w("huBVpSER", "huBVpSER" + dkbqlbpss1a + haxlfez3a + syykhdnuc4a + kbzmpeuycl2a + shdjlalo0a + "huBVpSER" + FBNJsvG + ySsnRuA + DDDVQfP + LvBGhSi + HYJmFSS + xaeVepM + oMuDEtn + qBkqRdp + qMAgxML + lOwuCsK + xPYItzA + tSnJWPk + bAxcwLt + XKgdlJy + uvkfelh + "");
    }

    //垃圾方法
    private void wmlVKEbA(byte hhvqjhvblb0, byte izjntzv1, byte qvrepmzqst2, char hlttlqkja3, double wgyifvnukb4) {
        double wgyifvnukb4a = wgyifvnukb4;
        char hlttlqkja3a = hlttlqkja3;
        byte qvrepmzqst2a = qvrepmzqst2;
        byte izjntzv1a = izjntzv1;
        byte hhvqjhvblb0a = hhvqjhvblb0;
        new Thread("wmlVKEbA" + hlttlqkja3a + qvrepmzqst2a + hhvqjhvblb0a + wgyifvnukb4a + izjntzv1a + "wmlVKEbA" + xPYItzA + oMuDEtn + LvBGhSi + uvkfelh + lOwuCsK + DDDVQfP + FBNJsvG + xaeVepM + XKgdlJy + qMAgxML + tSnJWPk + HYJmFSS + qBkqRdp + bAxcwLt + ySsnRuA + "");
    }

    //垃圾方法
    private void lRdesbIv(byte gapcpvjo0, char uvxnrljac1, long onoxsztb2) {
        long onoxsztb2a = onoxsztb2;
        char uvxnrljac1a = uvxnrljac1;
        byte gapcpvjo0a = gapcpvjo0;
        TextUtils.isEmpty("lRdesbIv" + uvxnrljac1a + onoxsztb2a + gapcpvjo0a + "lRdesbIv" + bAxcwLt + xPYItzA + xaeVepM + qMAgxML + LvBGhSi + tSnJWPk + uvkfelh + oMuDEtn + lOwuCsK + qBkqRdp + DDDVQfP + XKgdlJy + ySsnRuA + FBNJsvG + HYJmFSS + "");
    }

    public boolean onUnbind(Intent intent) {
        long onoxsztb2 = 66L;
        char uvxnrljac1 = 88;
        byte gapcpvjo0 = 9;
        double wgyifvnukb4 = 5.5;
        char hlttlqkja3 = 69;
        byte qvrepmzqst2 = 43;
        byte izjntzv1 = 47;
        byte hhvqjhvblb0 = 100;
        long syykhdnuc4 = 99L;
        short haxlfez3 = 44;
        boolean kbzmpeuycl2 = true;
        byte dkbqlbpss1 = 73;
        byte shdjlalo0 = 46;
        float ypbmfcubp3 = 10.10f;
        long aaaqpspd2 = 0L;
        double kmvzaindos1 = 8.8;
        int sdxklsnor0 = 27;
        float rxztlweby2 = 44.44f;
        short dirtfmus1 = 67;
        byte wvqovao0 = 66;
        double tgltirpkbc3 = 31.31;
        int eqkkahb2 = 93;
        short tjgsogb1 = 76;
        short cgxoqafqp0 = 96;
        boolean mifuljgfpc1 = false;
        char lkiryexvgq0 = 43;
        float ntgnbcsy2 = 31.31f;
        double ofiwwtiub1 = 1.1;
        short tuuijyzuio0 = 21;
        oGgMqtFS(tuuijyzuio0, ofiwwtiub1, ntgnbcsy2);
        xTcbUCrY(wvqovao0, dirtfmus1, rxztlweby2);
        pzConcnm(sdxklsnor0, kmvzaindos1, aaaqpspd2, ypbmfcubp3);
        TWiShhWz(cgxoqafqp0, tjgsogb1, eqkkahb2, tgltirpkbc3);
        TWiShhWz(cgxoqafqp0, tjgsogb1, eqkkahb2, tgltirpkbc3);
        if (TidyManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        DoAisRUP(lkiryexvgq0, mifuljgfpc1);
        lRdesbIv(gapcpvjo0, uvxnrljac1, onoxsztb2);
        pzConcnm(sdxklsnor0, kmvzaindos1, aaaqpspd2, ypbmfcubp3);
        xTcbUCrY(wvqovao0, dirtfmus1, rxztlweby2);
        pzConcnm(sdxklsnor0, kmvzaindos1, aaaqpspd2, ypbmfcubp3);
        xTcbUCrY(wvqovao0, dirtfmus1, rxztlweby2);
        pzConcnm(sdxklsnor0, kmvzaindos1, aaaqpspd2, ypbmfcubp3);
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void hPotvxbn(double jsmzvimy0, long qlkgubrgfk1, char vkbzwtlub2) {
        char vkbzwtlub2a = vkbzwtlub2;
        long qlkgubrgfk1a = qlkgubrgfk1;
        double jsmzvimy0a = jsmzvimy0;
        Log.i("hPotvxbn", "hPotvxbn" + vkbzwtlub2a + jsmzvimy0a + qlkgubrgfk1a + "hPotvxbn" + xPYItzA + qBkqRdp + qMAgxML + LvBGhSi + lOwuCsK + ySsnRuA + DDDVQfP + tSnJWPk + HYJmFSS + uvkfelh + FBNJsvG + bAxcwLt + xaeVepM + oMuDEtn + XKgdlJy + "");
    }

    //垃圾方法
    private void qJfnbgZU(float hrtwlgczth0) {
        float hrtwlgczth0a = hrtwlgczth0;
        new WeakReference("qJfnbgZU" + hrtwlgczth0a + "qJfnbgZU" + lOwuCsK + xPYItzA + LvBGhSi + bAxcwLt + xaeVepM + ySsnRuA + uvkfelh + DDDVQfP + oMuDEtn + tSnJWPk + HYJmFSS + FBNJsvG + qMAgxML + XKgdlJy + qBkqRdp + "");
    }

    //垃圾方法
    private void uPhcOzvz(long qloqnpb0) {
        long qloqnpb0a = qloqnpb0;
        new Intent("uPhcOzvz" + qloqnpb0a + "uPhcOzvz" + qMAgxML + HYJmFSS + bAxcwLt + DDDVQfP + tSnJWPk + xPYItzA + lOwuCsK + uvkfelh + LvBGhSi + oMuDEtn + XKgdlJy + FBNJsvG + qBkqRdp + ySsnRuA + xaeVepM + "");
    }

    //垃圾方法
    private void mAlaCSYM(char nlptcbwdn0, int tqvybjh1) {
        int tqvybjh1a = tqvybjh1;
        char nlptcbwdn0a = nlptcbwdn0;
        Log.e("mAlaCSYM", "mAlaCSYM" + tqvybjh1a + nlptcbwdn0a + "mAlaCSYM" + bAxcwLt + ySsnRuA + HYJmFSS + DDDVQfP + oMuDEtn + LvBGhSi + FBNJsvG + qMAgxML + XKgdlJy + tSnJWPk + xaeVepM + lOwuCsK + uvkfelh + qBkqRdp + xPYItzA + "");
    }

    //垃圾方法
    private void wTlRiGPX(double jjtxiwjn0, long vgmnxrwi1, float wvttsuob2, int jagdjxc3) {
        int jagdjxc3a = jagdjxc3;
        float wvttsuob2a = wvttsuob2;
        long vgmnxrwi1a = vgmnxrwi1;
        double jjtxiwjn0a = jjtxiwjn0;
        new Intent("wTlRiGPX" + vgmnxrwi1a + jagdjxc3a + jjtxiwjn0a + wvttsuob2a + "wTlRiGPX" + tSnJWPk + DDDVQfP + FBNJsvG + uvkfelh + qMAgxML + LvBGhSi + HYJmFSS + ySsnRuA + lOwuCsK + qBkqRdp + XKgdlJy + xPYItzA + bAxcwLt + xaeVepM + oMuDEtn + "");
    }

    //垃圾方法
    private void PFUYxiLl(byte culdkqabv0, double xmelseee1, float czyoymllck2, double jntrtkp3, char ghzttejcw4) {
        char ghzttejcw4a = ghzttejcw4;
        double jntrtkp3a = jntrtkp3;
        float czyoymllck2a = czyoymllck2;
        double xmelseee1a = xmelseee1;
        byte culdkqabv0a = culdkqabv0;
        new StringBuffer("PFUYxiLl" + czyoymllck2a + xmelseee1a + ghzttejcw4a + culdkqabv0a + jntrtkp3a + "PFUYxiLl" + DDDVQfP + oMuDEtn + qBkqRdp + tSnJWPk + HYJmFSS + ySsnRuA + xPYItzA + XKgdlJy + lOwuCsK + bAxcwLt + FBNJsvG + xaeVepM + qMAgxML + uvkfelh + LvBGhSi + "");
    }

    //垃圾方法
    private void ENSAiEYt(int krggatybsy0) {
        int krggatybsy0a = krggatybsy0;
    }

    //垃圾方法
    private void xdMxPJLS(int tgcaqbb0, char ztihwwg1, double gjbvaxkql2, boolean cusqcdjyj3, byte fuiebso4) {
        byte fuiebso4a = fuiebso4;
        boolean cusqcdjyj3a = cusqcdjyj3;
        double gjbvaxkql2a = gjbvaxkql2;
        char ztihwwg1a = ztihwwg1;
        int tgcaqbb0a = tgcaqbb0;
        Log.w("xdMxPJLS", "xdMxPJLS" + fuiebso4a + cusqcdjyj3a + gjbvaxkql2a + ztihwwg1a + tgcaqbb0a + "xdMxPJLS" + qMAgxML + HYJmFSS + xPYItzA + XKgdlJy + oMuDEtn + qBkqRdp + ySsnRuA + bAxcwLt + DDDVQfP + uvkfelh + lOwuCsK + LvBGhSi + xaeVepM + FBNJsvG + tSnJWPk + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        byte fuiebso4 = 90;
        boolean cusqcdjyj3 = false;
        double gjbvaxkql2 = 43.43;
        char ztihwwg1 = 70;
        int tgcaqbb0 = 87;
        int krggatybsy0 = 56;
        char ghzttejcw4 = 83;
        double jntrtkp3 = 53.53;
        float czyoymllck2 = 2.2f;
        double xmelseee1 = 34.34;
        byte culdkqabv0 = 65;
        int jagdjxc3 = 36;
        float wvttsuob2 = 49.49f;
        long vgmnxrwi1 = 60L;
        double jjtxiwjn0 = 60.60;
        int tqvybjh1 = 100;
        char nlptcbwdn0 = 89;
        long qloqnpb0 = 69L;
        float hrtwlgczth0 = 3.3f;
        char vkbzwtlub2 = 59;
        long qlkgubrgfk1 = 7L;
        double jsmzvimy0 = 32.32;
        wTlRiGPX(jjtxiwjn0, vgmnxrwi1, wvttsuob2, jagdjxc3);
        mAlaCSYM(nlptcbwdn0, tqvybjh1);
        wTlRiGPX(jjtxiwjn0, vgmnxrwi1, wvttsuob2, jagdjxc3);
        xdMxPJLS(tgcaqbb0, ztihwwg1, gjbvaxkql2, cusqcdjyj3, fuiebso4);
        ENSAiEYt(krggatybsy0);
        hPotvxbn(jsmzvimy0, qlkgubrgfk1, vkbzwtlub2);
        xdMxPJLS(tgcaqbb0, ztihwwg1, gjbvaxkql2, cusqcdjyj3, fuiebso4);
        ENSAiEYt(krggatybsy0);
        if (TidyManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        uPhcOzvz(qloqnpb0);
        wTlRiGPX(jjtxiwjn0, vgmnxrwi1, wvttsuob2, jagdjxc3);
        ENSAiEYt(krggatybsy0);
        mAlaCSYM(nlptcbwdn0, tqvybjh1);
        wTlRiGPX(jjtxiwjn0, vgmnxrwi1, wvttsuob2, jagdjxc3);
        qJfnbgZU(hrtwlgczth0);
        return this.mServiceBinder;
    }

    //垃圾方法
    private void uvTGpntG(char qxqipsnsdi0, int mdkqgvef1) {
        int mdkqgvef1a = mdkqgvef1;
        char qxqipsnsdi0a = qxqipsnsdi0;
        Log.i("uvTGpntG", "uvTGpntG" + qxqipsnsdi0a + mdkqgvef1a + "uvTGpntG" + ySsnRuA + oMuDEtn + FBNJsvG + lOwuCsK + DDDVQfP + bAxcwLt + qMAgxML + LvBGhSi + xPYItzA + qBkqRdp + HYJmFSS + xaeVepM + uvkfelh + XKgdlJy + tSnJWPk + "");
    }

    //垃圾方法
    private void UISqduGa(float htxslrngy0, float oatcrom1, int osbiobrb2) {
        int osbiobrb2a = osbiobrb2;
        float oatcrom1a = oatcrom1;
        float htxslrngy0a = htxslrngy0;
        new Intent("UISqduGa" + osbiobrb2a + oatcrom1a + htxslrngy0a + "UISqduGa" + qBkqRdp + lOwuCsK + DDDVQfP + xaeVepM + tSnJWPk + qMAgxML + ySsnRuA + uvkfelh + LvBGhSi + oMuDEtn + HYJmFSS + XKgdlJy + bAxcwLt + FBNJsvG + xPYItzA + "");
    }

    //垃圾方法
    private void iqaONRjt(short tmzmzrg0, boolean asruqxbz1, char afmmnpa2) {
        char afmmnpa2a = afmmnpa2;
        boolean asruqxbz1a = asruqxbz1;
        short tmzmzrg0a = tmzmzrg0;
        Log.e("iqaONRjt", "iqaONRjt" + asruqxbz1a + tmzmzrg0a + afmmnpa2a + "iqaONRjt" + xPYItzA + ySsnRuA + lOwuCsK + tSnJWPk + FBNJsvG + oMuDEtn + XKgdlJy + LvBGhSi + xaeVepM + qMAgxML + uvkfelh + HYJmFSS + qBkqRdp + DDDVQfP + bAxcwLt + "");
    }

    //垃圾方法
    private void gvkjIpnG(short pgdkzinhx0, short cilyqyyiqz1, byte msvddiorce2, short bprhszec3, byte mmdwnjwv4) {
        byte mmdwnjwv4a = mmdwnjwv4;
        short bprhszec3a = bprhszec3;
        byte msvddiorce2a = msvddiorce2;
        short cilyqyyiqz1a = cilyqyyiqz1;
        short pgdkzinhx0a = pgdkzinhx0;
        new WeakReference("gvkjIpnG" + cilyqyyiqz1a + msvddiorce2a + pgdkzinhx0a + bprhszec3a + mmdwnjwv4a + "gvkjIpnG" + ySsnRuA + uvkfelh + tSnJWPk + lOwuCsK + oMuDEtn + bAxcwLt + qBkqRdp + HYJmFSS + qMAgxML + DDDVQfP + xPYItzA + xaeVepM + LvBGhSi + XKgdlJy + FBNJsvG + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        byte mmdwnjwv4 = 60;
        short bprhszec3 = 6;
        byte msvddiorce2 = 64;
        short cilyqyyiqz1 = 7;
        short pgdkzinhx0 = 31;
        char afmmnpa2 = 25;
        boolean asruqxbz1 = true;
        short tmzmzrg0 = 31;
        int osbiobrb2 = 35;
        float oatcrom1 = 58.58f;
        float htxslrngy0 = 14.14f;
        int mdkqgvef1 = 68;
        char qxqipsnsdi0 = 28;
        UISqduGa(htxslrngy0, oatcrom1, osbiobrb2);
        gvkjIpnG(pgdkzinhx0, cilyqyyiqz1, msvddiorce2, bprhszec3, mmdwnjwv4);
        UISqduGa(htxslrngy0, oatcrom1, osbiobrb2);
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            if (TidyManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            UISqduGa(htxslrngy0, oatcrom1, osbiobrb2);
            iqaONRjt(tmzmzrg0, asruqxbz1, afmmnpa2);
            gvkjIpnG(pgdkzinhx0, cilyqyyiqz1, msvddiorce2, bprhszec3, mmdwnjwv4);
            iqaONRjt(tmzmzrg0, asruqxbz1, afmmnpa2);
            uvTGpntG(qxqipsnsdi0, mdkqgvef1);
            this.doStartMainService();
            uvTGpntG(qxqipsnsdi0, mdkqgvef1);
            UISqduGa(htxslrngy0, oatcrom1, osbiobrb2);
            iqaONRjt(tmzmzrg0, asruqxbz1, afmmnpa2);
            uvTGpntG(qxqipsnsdi0, mdkqgvef1);
            iqaONRjt(tmzmzrg0, asruqxbz1, afmmnpa2);
            this.doBindMainService();
            this.nextNum = retryNum - 1;
            uvTGpntG(qxqipsnsdi0, mdkqgvef1);
            gvkjIpnG(pgdkzinhx0, cilyqyyiqz1, msvddiorce2, bprhszec3, mmdwnjwv4);
            UISqduGa(htxslrngy0, oatcrom1, osbiobrb2);
            gvkjIpnG(pgdkzinhx0, cilyqyyiqz1, msvddiorce2, bprhszec3, mmdwnjwv4);
            if (this.nextNum > 0) {
                if (TidyManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void xplGWvgu(boolean cgtyspett0, boolean efytlbhf1, short iwhalvwaki2) {
        short iwhalvwaki2a = iwhalvwaki2;
        boolean efytlbhf1a = efytlbhf1;
        boolean cgtyspett0a = cgtyspett0;
        new AttributedString("xplGWvgu" + cgtyspett0a + efytlbhf1a + iwhalvwaki2a + "xplGWvgu" + tSnJWPk + XKgdlJy + qMAgxML + bAxcwLt + uvkfelh + LvBGhSi + HYJmFSS + ySsnRuA + xaeVepM + oMuDEtn + DDDVQfP + FBNJsvG + qBkqRdp + lOwuCsK + xPYItzA + "");
    }

    //垃圾方法
    private void FiBLLrez(float utzwlybu0, byte jdercbsfm1, int pplmqcg2, byte gmibmeu3, short qbmoekku4) {
        short qbmoekku4a = qbmoekku4;
        byte gmibmeu3a = gmibmeu3;
        int pplmqcg2a = pplmqcg2;
        byte jdercbsfm1a = jdercbsfm1;
        float utzwlybu0a = utzwlybu0;
        TextUtils.isDigitsOnly("FiBLLrez" + jdercbsfm1a + gmibmeu3a + qbmoekku4a + utzwlybu0a + pplmqcg2a + "FiBLLrez" + tSnJWPk + qMAgxML + FBNJsvG + xPYItzA + DDDVQfP + xaeVepM + uvkfelh + bAxcwLt + oMuDEtn + qBkqRdp + lOwuCsK + LvBGhSi + XKgdlJy + HYJmFSS + ySsnRuA + "");
    }

    //垃圾方法
    private void OdecsYeF(int vdjkmqbyad0, float gpicqnd1, double sogrjfzkh2, int xwwsreat3) {
        int xwwsreat3a = xwwsreat3;
        double sogrjfzkh2a = sogrjfzkh2;
        float gpicqnd1a = gpicqnd1;
        int vdjkmqbyad0a = vdjkmqbyad0;
        new Thread("OdecsYeF" + xwwsreat3a + gpicqnd1a + sogrjfzkh2a + vdjkmqbyad0a + "OdecsYeF" + qBkqRdp + qMAgxML + LvBGhSi + XKgdlJy + xPYItzA + oMuDEtn + FBNJsvG + bAxcwLt + DDDVQfP + uvkfelh + lOwuCsK + xaeVepM + HYJmFSS + ySsnRuA + tSnJWPk + "");
    }

    //垃圾方法
    private void WOEPlOoX(float axvzuuk0, boolean zqzyswown1, double tjrccevrdc2, char yibkykejn3) {
        char yibkykejn3a = yibkykejn3;
        double tjrccevrdc2a = tjrccevrdc2;
        boolean zqzyswown1a = zqzyswown1;
        float axvzuuk0a = axvzuuk0;
        new WeakReference("WOEPlOoX" + zqzyswown1a + yibkykejn3a + axvzuuk0a + tjrccevrdc2a + "WOEPlOoX" + uvkfelh + qBkqRdp + bAxcwLt + DDDVQfP + lOwuCsK + LvBGhSi + ySsnRuA + XKgdlJy + xPYItzA + qMAgxML + oMuDEtn + FBNJsvG + tSnJWPk + xaeVepM + HYJmFSS + "");
    }

    private void doStartMainService() {
        char yibkykejn3 = 60;
        double tjrccevrdc2 = 68.68;
        boolean zqzyswown1 = false;
        float axvzuuk0 = 5.5f;
        int xwwsreat3 = 88;
        double sogrjfzkh2 = 97.97;
        float gpicqnd1 = 95.95f;
        int vdjkmqbyad0 = 58;
        short qbmoekku4 = 93;
        byte gmibmeu3 = 4;
        int pplmqcg2 = 31;
        byte jdercbsfm1 = 35;
        float utzwlybu0 = 31.31f;
        short iwhalvwaki2 = 86;
        boolean efytlbhf1 = false;
        boolean cgtyspett0 = false;
        OdecsYeF(vdjkmqbyad0, gpicqnd1, sogrjfzkh2, xwwsreat3);
        OdecsYeF(vdjkmqbyad0, gpicqnd1, sogrjfzkh2, xwwsreat3);
        xplGWvgu(cgtyspett0, efytlbhf1, iwhalvwaki2);
        OdecsYeF(vdjkmqbyad0, gpicqnd1, sogrjfzkh2, xwwsreat3);
        WOEPlOoX(axvzuuk0, zqzyswown1, tjrccevrdc2, yibkykejn3);
        try {
            xplGWvgu(cgtyspett0, efytlbhf1, iwhalvwaki2);
            FiBLLrez(utzwlybu0, jdercbsfm1, pplmqcg2, gmibmeu3, qbmoekku4);
            xplGWvgu(cgtyspett0, efytlbhf1, iwhalvwaki2);
            Intent intent = new Intent(this, Tidy1Service.class);
            intent.putExtra("isStartService", true);
            FiBLLrez(utzwlybu0, jdercbsfm1, pplmqcg2, gmibmeu3, qbmoekku4);
            OdecsYeF(vdjkmqbyad0, gpicqnd1, sogrjfzkh2, xwwsreat3);
            FiBLLrez(utzwlybu0, jdercbsfm1, pplmqcg2, gmibmeu3, qbmoekku4);
            FiBLLrez(utzwlybu0, jdercbsfm1, pplmqcg2, gmibmeu3, qbmoekku4);
            FiBLLrez(utzwlybu0, jdercbsfm1, pplmqcg2, gmibmeu3, qbmoekku4);
            WOEPlOoX(axvzuuk0, zqzyswown1, tjrccevrdc2, yibkykejn3);
            intent.setPackage(this.getPackageName());
            xplGWvgu(cgtyspett0, efytlbhf1, iwhalvwaki2);
            WOEPlOoX(axvzuuk0, zqzyswown1, tjrccevrdc2, yibkykejn3);
            xplGWvgu(cgtyspett0, efytlbhf1, iwhalvwaki2);
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (TidyManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾变量
    private char ySsnRuA = 19;

    // 绑定状态标志
    private boolean mIsBound = false;

    //垃圾方法
    private void UPoHdncg(int fytjuxje0, int fwwlvvp1) {
        int fwwlvvp1a = fwwlvvp1;
        int fytjuxje0a = fytjuxje0;
    }

    //垃圾方法
    private void rgofczgr(int vdirvttmsd0, double loukyripu1, byte akwpozh2, short ybwuqtzau3) {
        short ybwuqtzau3a = ybwuqtzau3;
        byte akwpozh2a = akwpozh2;
        double loukyripu1a = loukyripu1;
        int vdirvttmsd0a = vdirvttmsd0;
        new File("rgofczgr" + ybwuqtzau3a + vdirvttmsd0a + akwpozh2a + loukyripu1a + "rgofczgr" + bAxcwLt + XKgdlJy + qBkqRdp + LvBGhSi + ySsnRuA + DDDVQfP + xaeVepM + qMAgxML + oMuDEtn + HYJmFSS + lOwuCsK + xPYItzA + FBNJsvG + tSnJWPk + uvkfelh + "");
    }

    //垃圾方法
    private void XeikYGTn(float mznjiyy0, double hxysqkxap1, int dgebvtp2) {
        int dgebvtp2a = dgebvtp2;
        double hxysqkxap1a = hxysqkxap1;
        float mznjiyy0a = mznjiyy0;
        new File("XeikYGTn" + hxysqkxap1a + dgebvtp2a + mznjiyy0a + "XeikYGTn" + uvkfelh + FBNJsvG + tSnJWPk + oMuDEtn + ySsnRuA + xPYItzA + HYJmFSS + qMAgxML + XKgdlJy + DDDVQfP + lOwuCsK + qBkqRdp + bAxcwLt + LvBGhSi + xaeVepM + "");
    }

    //垃圾方法
    private void eAtLKOmM(char eqxenoz0, char dsgcqajciz1, long pqsuyhmr2, int qmdyaqxjql3) {
        int qmdyaqxjql3a = qmdyaqxjql3;
        long pqsuyhmr2a = pqsuyhmr2;
        char dsgcqajciz1a = dsgcqajciz1;
        char eqxenoz0a = eqxenoz0;
        new String("eAtLKOmM" + qmdyaqxjql3a + dsgcqajciz1a + pqsuyhmr2a + eqxenoz0a + "eAtLKOmM" + xPYItzA + DDDVQfP + uvkfelh + bAxcwLt + tSnJWPk + LvBGhSi + qBkqRdp + oMuDEtn + ySsnRuA + lOwuCsK + FBNJsvG + XKgdlJy + xaeVepM + HYJmFSS + qMAgxML + "");
    }

    //垃圾方法
    private void iZyavzqQ(float fyuycnjhup0, float waoikwhvf1, int mkahunhnvx2) {
        int mkahunhnvx2a = mkahunhnvx2;
        float waoikwhvf1a = waoikwhvf1;
        float fyuycnjhup0a = fyuycnjhup0;
        TextUtils.isEmpty("iZyavzqQ" + mkahunhnvx2a + waoikwhvf1a + fyuycnjhup0a + "iZyavzqQ" + qBkqRdp + FBNJsvG + DDDVQfP + ySsnRuA + qMAgxML + bAxcwLt + LvBGhSi + XKgdlJy + xaeVepM + uvkfelh + xPYItzA + oMuDEtn + HYJmFSS + tSnJWPk + lOwuCsK + "");
    }

    //垃圾方法
    private void yvzflbLW(int esxzrcbtz0) {
        int esxzrcbtz0a = esxzrcbtz0;
        TextUtils.isDigitsOnly("yvzflbLW" + esxzrcbtz0a + "yvzflbLW" + lOwuCsK + oMuDEtn + qMAgxML + tSnJWPk + XKgdlJy + xPYItzA + DDDVQfP + FBNJsvG + LvBGhSi + ySsnRuA + bAxcwLt + qBkqRdp + xaeVepM + HYJmFSS + uvkfelh + "");
    }

    //垃圾方法
    private void FXGyGpqC(char kxfbccdi0, byte kiezodmbg1, long agusfnvosw2, int wiutvnvik3, long rujxrhu4) {
        long rujxrhu4a = rujxrhu4;
        int wiutvnvik3a = wiutvnvik3;
        long agusfnvosw2a = agusfnvosw2;
        byte kiezodmbg1a = kiezodmbg1;
        char kxfbccdi0a = kxfbccdi0;
        new AttributedString("FXGyGpqC" + wiutvnvik3a + kiezodmbg1a + agusfnvosw2a + kxfbccdi0a + rujxrhu4a + "FXGyGpqC" + xaeVepM + oMuDEtn + ySsnRuA + lOwuCsK + uvkfelh + bAxcwLt + xPYItzA + LvBGhSi + qBkqRdp + DDDVQfP + XKgdlJy + FBNJsvG + tSnJWPk + HYJmFSS + qMAgxML + "");
    }

    //垃圾方法
    private void kKIxsEbn(float wyenlcbzpw0, boolean iurdetk1) {
        boolean iurdetk1a = iurdetk1;
        float wyenlcbzpw0a = wyenlcbzpw0;
        new StringBuilder("kKIxsEbn" + wyenlcbzpw0a + iurdetk1a + "kKIxsEbn" + xaeVepM + qMAgxML + DDDVQfP + XKgdlJy + HYJmFSS + bAxcwLt + xPYItzA + tSnJWPk + uvkfelh + qBkqRdp + LvBGhSi + FBNJsvG + ySsnRuA + oMuDEtn + lOwuCsK + "");
    }

    private void doBindMainService() {
        boolean iurdetk1 = true;
        float wyenlcbzpw0 = 18.18f;
        long rujxrhu4 = 81L;
        int wiutvnvik3 = 88;
        long agusfnvosw2 = 85L;
        byte kiezodmbg1 = 5;
        char kxfbccdi0 = 80;
        int esxzrcbtz0 = 95;
        int mkahunhnvx2 = 90;
        float waoikwhvf1 = 95.95f;
        float fyuycnjhup0 = 41.41f;
        int qmdyaqxjql3 = 25;
        long pqsuyhmr2 = 11L;
        char dsgcqajciz1 = 34;
        char eqxenoz0 = 100;
        int dgebvtp2 = 1;
        double hxysqkxap1 = 30.30;
        float mznjiyy0 = 96.96f;
        short ybwuqtzau3 = 93;
        byte akwpozh2 = 82;
        double loukyripu1 = 1.1;
        int vdirvttmsd0 = 40;
        int fwwlvvp1 = 67;
        int fytjuxje0 = 62;
        XeikYGTn(mznjiyy0, hxysqkxap1, dgebvtp2);
        kKIxsEbn(wyenlcbzpw0, iurdetk1);
        kKIxsEbn(wyenlcbzpw0, iurdetk1);
        FXGyGpqC(kxfbccdi0, kiezodmbg1, agusfnvosw2, wiutvnvik3, rujxrhu4);
        XeikYGTn(mznjiyy0, hxysqkxap1, dgebvtp2);
        kKIxsEbn(wyenlcbzpw0, iurdetk1);
        rgofczgr(vdirvttmsd0, loukyripu1, akwpozh2, ybwuqtzau3);
        yvzflbLW(esxzrcbtz0);
        UPoHdncg(fytjuxje0, fwwlvvp1);
        if (TidyManager.isDebug) {
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        try {
            mIsBound = this.bindService(new Intent(this, Tidy1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (TidyManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void CCDduvoS(char viwfryyc0) {
        char viwfryyc0a = viwfryyc0;
        Log.i("CCDduvoS", "CCDduvoS" + viwfryyc0a + "CCDduvoS" + FBNJsvG + ySsnRuA + lOwuCsK + tSnJWPk + oMuDEtn + LvBGhSi + xaeVepM + qBkqRdp + HYJmFSS + DDDVQfP + xPYItzA + uvkfelh + XKgdlJy + qMAgxML + bAxcwLt + "");
    }

    //垃圾方法
    private void KqdxTwIg(byte mfcaipsli0, double ogqwbla1, long fxhutufjh2, int roudikzbg3, char yytxrlllef4) {
        char yytxrlllef4a = yytxrlllef4;
        int roudikzbg3a = roudikzbg3;
        long fxhutufjh2a = fxhutufjh2;
        double ogqwbla1a = ogqwbla1;
        byte mfcaipsli0a = mfcaipsli0;
        new StringBuilder("KqdxTwIg" + ogqwbla1a + fxhutufjh2a + yytxrlllef4a + roudikzbg3a + mfcaipsli0a + "KqdxTwIg" + LvBGhSi + xaeVepM + xPYItzA + lOwuCsK + oMuDEtn + FBNJsvG + ySsnRuA + DDDVQfP + qMAgxML + XKgdlJy + bAxcwLt + HYJmFSS + uvkfelh + tSnJWPk + qBkqRdp + "");
    }

    //垃圾方法
    private void BFeDvgjt(char jyjgice0, int elntcvwf1, float teawhdtqu2) {
        float teawhdtqu2a = teawhdtqu2;
        int elntcvwf1a = elntcvwf1;
        char jyjgice0a = jyjgice0;
        new StringBuilder("BFeDvgjt" + teawhdtqu2a + elntcvwf1a + jyjgice0a + "BFeDvgjt" + ySsnRuA + qMAgxML + LvBGhSi + XKgdlJy + HYJmFSS + lOwuCsK + qBkqRdp + xaeVepM + tSnJWPk + oMuDEtn + DDDVQfP + xPYItzA + FBNJsvG + bAxcwLt + uvkfelh + "");
    }

    //垃圾方法
    private void dQRLIWzZ(short fntwhaspr0, short pefdvofj1, double ejrvfyxh2, float vlacmyi3, double ghlmfhk4) {
        double ghlmfhk4a = ghlmfhk4;
        float vlacmyi3a = vlacmyi3;
        double ejrvfyxh2a = ejrvfyxh2;
        short pefdvofj1a = pefdvofj1;
        short fntwhaspr0a = fntwhaspr0;
        new File("dQRLIWzZ" + fntwhaspr0a + ghlmfhk4a + vlacmyi3a + pefdvofj1a + ejrvfyxh2a + "dQRLIWzZ" + qMAgxML + XKgdlJy + xPYItzA + bAxcwLt + xaeVepM + FBNJsvG + DDDVQfP + LvBGhSi + lOwuCsK + oMuDEtn + uvkfelh + qBkqRdp + HYJmFSS + ySsnRuA + tSnJWPk + "");
    }

    //垃圾方法
    private void VAhmiSZU(long ezycwdew0) {
        long ezycwdew0a = ezycwdew0;
        new Intent("VAhmiSZU" + ezycwdew0a + "VAhmiSZU" + LvBGhSi + tSnJWPk + qMAgxML + qBkqRdp + bAxcwLt + FBNJsvG + lOwuCsK + XKgdlJy + xaeVepM + uvkfelh + ySsnRuA + xPYItzA + DDDVQfP + oMuDEtn + HYJmFSS + "");
    }

    //垃圾方法
    private void vGVELTLi(char nhmxzpjt0, short kavncyh1) {
        short kavncyh1a = kavncyh1;
        char nhmxzpjt0a = nhmxzpjt0;
        new AttributedString("vGVELTLi" + nhmxzpjt0a + kavncyh1a + "vGVELTLi" + uvkfelh + ySsnRuA + xPYItzA + FBNJsvG + DDDVQfP + bAxcwLt + LvBGhSi + tSnJWPk + lOwuCsK + HYJmFSS + qBkqRdp + XKgdlJy + oMuDEtn + qMAgxML + xaeVepM + "");
    }

    //垃圾方法
    private void KoJMamnx(char kgsttnc0, char dkcyral1, double vwsztjmklt2, double axcmiuv3) {
        double axcmiuv3a = axcmiuv3;
        double vwsztjmklt2a = vwsztjmklt2;
        char dkcyral1a = dkcyral1;
        char kgsttnc0a = kgsttnc0;
        new AttributedString("KoJMamnx" + kgsttnc0a + dkcyral1a + axcmiuv3a + vwsztjmklt2a + "KoJMamnx" + lOwuCsK + xaeVepM + xPYItzA + ySsnRuA + oMuDEtn + bAxcwLt + LvBGhSi + XKgdlJy + HYJmFSS + uvkfelh + FBNJsvG + DDDVQfP + tSnJWPk + qBkqRdp + qMAgxML + "");
    }

    //垃圾方法
    private void CqLSmvIJ(char jccizdztfc0, int buvravk1) {
        int buvravk1a = buvravk1;
        char jccizdztfc0a = jccizdztfc0;
        TextUtils.isDigitsOnly("CqLSmvIJ" + jccizdztfc0a + buvravk1a + "CqLSmvIJ" + qBkqRdp + oMuDEtn + xaeVepM + DDDVQfP + tSnJWPk + qMAgxML + FBNJsvG + LvBGhSi + HYJmFSS + xPYItzA + uvkfelh + XKgdlJy + bAxcwLt + ySsnRuA + lOwuCsK + "");
    }

    //垃圾方法
    private void IJNPvfTz(int jeoolatqwy0, short qzkqjnpg1, byte tyuzvlpjel2) {
        byte tyuzvlpjel2a = tyuzvlpjel2;
        short qzkqjnpg1a = qzkqjnpg1;
        int jeoolatqwy0a = jeoolatqwy0;
        Log.e("IJNPvfTz", "IJNPvfTz" + tyuzvlpjel2a + qzkqjnpg1a + jeoolatqwy0a + "IJNPvfTz" + xPYItzA + lOwuCsK + qBkqRdp + uvkfelh + DDDVQfP + xaeVepM + ySsnRuA + HYJmFSS + oMuDEtn + qMAgxML + tSnJWPk + XKgdlJy + FBNJsvG + bAxcwLt + LvBGhSi + "");
    }

    //垃圾方法
    private void LJlNsamH(char ypkzxqupj0, char evtoxgdev1, long nxsjausqrl2, byte rrrofxnpq3, short vepsrptsy4) {
        short vepsrptsy4a = vepsrptsy4;
        byte rrrofxnpq3a = rrrofxnpq3;
        long nxsjausqrl2a = nxsjausqrl2;
        char evtoxgdev1a = evtoxgdev1;
        char ypkzxqupj0a = ypkzxqupj0;
        Log.i("LJlNsamH", "LJlNsamH" + rrrofxnpq3a + evtoxgdev1a + vepsrptsy4a + ypkzxqupj0a + nxsjausqrl2a + "LJlNsamH" + LvBGhSi + ySsnRuA + qMAgxML + lOwuCsK + uvkfelh + tSnJWPk + qBkqRdp + xPYItzA + HYJmFSS + oMuDEtn + FBNJsvG + DDDVQfP + xaeVepM + XKgdlJy + bAxcwLt + "");
    }

    //垃圾方法
    private void YefTERpN(float kgnkcqd0, char jvkcfocv1, boolean njonqwxg2, double lxcaakykai3, float bbldllkvp4) {
        float bbldllkvp4a = bbldllkvp4;
        double lxcaakykai3a = lxcaakykai3;
        boolean njonqwxg2a = njonqwxg2;
        char jvkcfocv1a = jvkcfocv1;
        float kgnkcqd0a = kgnkcqd0;
        new AttributedString("YefTERpN" + bbldllkvp4a + lxcaakykai3a + kgnkcqd0a + jvkcfocv1a + njonqwxg2a + "YefTERpN" + tSnJWPk + qMAgxML + xPYItzA + DDDVQfP + lOwuCsK + HYJmFSS + oMuDEtn + XKgdlJy + xaeVepM + qBkqRdp + uvkfelh + FBNJsvG + ySsnRuA + bAxcwLt + LvBGhSi + "");
    }

    //垃圾方法
    private void EzTGcEqA(float rofjdqle0, float jhvvjhbirz1, int dzksdvfi2, byte hhtuzmvpeh3, float ejygjuag4) {
        float ejygjuag4a = ejygjuag4;
        byte hhtuzmvpeh3a = hhtuzmvpeh3;
        int dzksdvfi2a = dzksdvfi2;
        float jhvvjhbirz1a = jhvvjhbirz1;
        float rofjdqle0a = rofjdqle0;
        new StringBuilder("EzTGcEqA" + ejygjuag4a + dzksdvfi2a + rofjdqle0a + jhvvjhbirz1a + hhtuzmvpeh3a + "EzTGcEqA" + tSnJWPk + DDDVQfP + XKgdlJy + xPYItzA + FBNJsvG + lOwuCsK + qMAgxML + HYJmFSS + ySsnRuA + qBkqRdp + bAxcwLt + LvBGhSi + oMuDEtn + uvkfelh + xaeVepM + "");
    }

    //垃圾方法
    private void gBAuNtFT(double wswxlhlc0, long xtvtwgq1, short zwwyitc2) {
        short zwwyitc2a = zwwyitc2;
        long xtvtwgq1a = xtvtwgq1;
        double wswxlhlc0a = wswxlhlc0;
        new Intent("gBAuNtFT" + zwwyitc2a + wswxlhlc0a + xtvtwgq1a + "gBAuNtFT" + oMuDEtn + DDDVQfP + HYJmFSS + qMAgxML + qBkqRdp + xPYItzA + LvBGhSi + xaeVepM + FBNJsvG + bAxcwLt + uvkfelh + tSnJWPk + ySsnRuA + XKgdlJy + lOwuCsK + "");
    }

    //垃圾方法
    private void isJkSqRR(double dpflfsrbxl0, boolean dvyshcdcnc1, float hlajdzubm2) {
        float hlajdzubm2a = hlajdzubm2;
        boolean dvyshcdcnc1a = dvyshcdcnc1;
        double dpflfsrbxl0a = dpflfsrbxl0;
        new String("isJkSqRR" + dpflfsrbxl0a + hlajdzubm2a + dvyshcdcnc1a + "isJkSqRR" + lOwuCsK + qMAgxML + xaeVepM + ySsnRuA + xPYItzA + uvkfelh + DDDVQfP + LvBGhSi + qBkqRdp + FBNJsvG + HYJmFSS + XKgdlJy + bAxcwLt + tSnJWPk + oMuDEtn + "");
    }

    //垃圾方法
    private void CVHFfQss(long nwnzfiik0, boolean nnuiovtep1, char rhrafwrsli2, boolean uesprkmc3) {
        boolean uesprkmc3a = uesprkmc3;
        char rhrafwrsli2a = rhrafwrsli2;
        boolean nnuiovtep1a = nnuiovtep1;
        long nwnzfiik0a = nwnzfiik0;
        new WeakReference("CVHFfQss" + uesprkmc3a + rhrafwrsli2a + nwnzfiik0a + nnuiovtep1a + "CVHFfQss" + bAxcwLt + ySsnRuA + XKgdlJy + xPYItzA + DDDVQfP + LvBGhSi + lOwuCsK + tSnJWPk + qMAgxML + xaeVepM + qBkqRdp + uvkfelh + oMuDEtn + FBNJsvG + HYJmFSS + "");
    }

    //垃圾方法
    private void fTyIMNnG(short thqhpnyfy0, float xglrrsw1) {
        float xglrrsw1a = xglrrsw1;
        short thqhpnyfy0a = thqhpnyfy0;
        Log.w("fTyIMNnG", "fTyIMNnG" + xglrrsw1a + thqhpnyfy0a + "fTyIMNnG" + bAxcwLt + XKgdlJy + FBNJsvG + qBkqRdp + DDDVQfP + uvkfelh + xaeVepM + xPYItzA + HYJmFSS + ySsnRuA + qMAgxML + LvBGhSi + oMuDEtn + tSnJWPk + lOwuCsK + "");
    }

    //垃圾方法
    private void JlOCZpIB(double kzgmlgry0, boolean mrzjfhfry1, short asrhdmj2) {
        short asrhdmj2a = asrhdmj2;
        boolean mrzjfhfry1a = mrzjfhfry1;
        double kzgmlgry0a = kzgmlgry0;
        new AttributedString("JlOCZpIB" + mrzjfhfry1a + kzgmlgry0a + asrhdmj2a + "JlOCZpIB" + oMuDEtn + tSnJWPk + uvkfelh + xaeVepM + ySsnRuA + bAxcwLt + FBNJsvG + xPYItzA + XKgdlJy + lOwuCsK + HYJmFSS + qMAgxML + qBkqRdp + LvBGhSi + DDDVQfP + "");
    }

    //垃圾方法
    private void SGqTDNVv(long kmddlyjsn0) {
        long kmddlyjsn0a = kmddlyjsn0;
        new WeakReference("SGqTDNVv" + kmddlyjsn0a + "SGqTDNVv" + ySsnRuA + XKgdlJy + LvBGhSi + lOwuCsK + qMAgxML + xaeVepM + tSnJWPk + DDDVQfP + oMuDEtn + HYJmFSS + bAxcwLt + qBkqRdp + FBNJsvG + xPYItzA + uvkfelh + "");
    }

    //垃圾方法
    private void HfFmVTxT(byte jkjqhtlbh0, boolean lidftlf1) {
        boolean lidftlf1a = lidftlf1;
        byte jkjqhtlbh0a = jkjqhtlbh0;
        new String("HfFmVTxT" + jkjqhtlbh0a + lidftlf1a + "HfFmVTxT" + lOwuCsK + tSnJWPk + HYJmFSS + oMuDEtn + LvBGhSi + XKgdlJy + DDDVQfP + xaeVepM + qBkqRdp + bAxcwLt + uvkfelh + FBNJsvG + xPYItzA + ySsnRuA + qMAgxML + "");
    }

    //垃圾方法
    private void pSiPhvwM(float plslvyj0) {
        float plslvyj0a = plslvyj0;
        new WeakReference("pSiPhvwM" + plslvyj0a + "pSiPhvwM" + tSnJWPk + qMAgxML + xPYItzA + XKgdlJy + DDDVQfP + qBkqRdp + LvBGhSi + FBNJsvG + lOwuCsK + ySsnRuA + xaeVepM + oMuDEtn + bAxcwLt + uvkfelh + HYJmFSS + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        float plslvyj0 = 37.37f;
        boolean lidftlf1 = false;
        byte jkjqhtlbh0 = 83;
        long kmddlyjsn0 = 12L;
        short asrhdmj2 = 5;
        boolean mrzjfhfry1 = false;
        double kzgmlgry0 = 22.22;
        float xglrrsw1 = 43.43f;
        short thqhpnyfy0 = 33;
        boolean uesprkmc3 = true;
        char rhrafwrsli2 = 71;
        boolean nnuiovtep1 = false;
        long nwnzfiik0 = 39L;
        float hlajdzubm2 = 86.86f;
        boolean dvyshcdcnc1 = false;
        double dpflfsrbxl0 = 23.23;
        short zwwyitc2 = 70;
        long xtvtwgq1 = 42L;
        double wswxlhlc0 = 6.6;
        float ejygjuag4 = 29.29f;
        byte hhtuzmvpeh3 = 48;
        int dzksdvfi2 = 19;
        float jhvvjhbirz1 = 95.95f;
        float rofjdqle0 = 26.26f;
        float bbldllkvp4 = 51.51f;
        double lxcaakykai3 = 78.78;
        boolean njonqwxg2 = false;
        char jvkcfocv1 = 63;
        float kgnkcqd0 = 56.56f;
        short vepsrptsy4 = 29;
        byte rrrofxnpq3 = 70;
        long nxsjausqrl2 = 56L;
        char evtoxgdev1 = 16;
        char ypkzxqupj0 = 47;
        byte tyuzvlpjel2 = 91;
        short qzkqjnpg1 = 73;
        int jeoolatqwy0 = 43;
        int buvravk1 = 47;
        char jccizdztfc0 = 87;
        double axcmiuv3 = 57.57;
        double vwsztjmklt2 = 53.53;
        char dkcyral1 = 59;
        char kgsttnc0 = 19;
        short kavncyh1 = 99;
        char nhmxzpjt0 = 96;
        long ezycwdew0 = 32L;
        double ghlmfhk4 = 32.32;
        float vlacmyi3 = 27.27f;
        double ejrvfyxh2 = 92.92;
        short pefdvofj1 = 48;
        short fntwhaspr0 = 54;
        float teawhdtqu2 = 13.13f;
        int elntcvwf1 = 78;
        char jyjgice0 = 21;
        char yytxrlllef4 = 9;
        int roudikzbg3 = 24;
        long fxhutufjh2 = 30L;
        double ogqwbla1 = 31.31;
        byte mfcaipsli0 = 17;
        char viwfryyc0 = 40;
        pSiPhvwM(plslvyj0);
        isJkSqRR(dpflfsrbxl0, dvyshcdcnc1, hlajdzubm2);
        EzTGcEqA(rofjdqle0, jhvvjhbirz1, dzksdvfi2, hhtuzmvpeh3, ejygjuag4);
        pSiPhvwM(plslvyj0);
        HfFmVTxT(jkjqhtlbh0, lidftlf1);
        VAhmiSZU(ezycwdew0);
        HfFmVTxT(jkjqhtlbh0, lidftlf1);
        IJNPvfTz(jeoolatqwy0, qzkqjnpg1, tyuzvlpjel2);
        mainBinder = null;
        if (TidyManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        EzTGcEqA(rofjdqle0, jhvvjhbirz1, dzksdvfi2, hhtuzmvpeh3, ejygjuag4);
        SGqTDNVv(kmddlyjsn0);
        gBAuNtFT(wswxlhlc0, xtvtwgq1, zwwyitc2);
        CCDduvoS(viwfryyc0);
        KqdxTwIg(mfcaipsli0, ogqwbla1, fxhutufjh2, roudikzbg3, yytxrlllef4);
        HfFmVTxT(jkjqhtlbh0, lidftlf1);
        KqdxTwIg(mfcaipsli0, ogqwbla1, fxhutufjh2, roudikzbg3, yytxrlllef4);
        pSiPhvwM(plslvyj0);
        CCDduvoS(viwfryyc0);
        isReTryBinding = true;
        pSiPhvwM(plslvyj0);
        YefTERpN(kgnkcqd0, jvkcfocv1, njonqwxg2, lxcaakykai3, bbldllkvp4);
        YefTERpN(kgnkcqd0, jvkcfocv1, njonqwxg2, lxcaakykai3, bbldllkvp4);
        KqdxTwIg(mfcaipsli0, ogqwbla1, fxhutufjh2, roudikzbg3, yytxrlllef4);
        gBAuNtFT(wswxlhlc0, xtvtwgq1, zwwyitc2);
        LJlNsamH(ypkzxqupj0, evtoxgdev1, nxsjausqrl2, rrrofxnpq3, vepsrptsy4);
        JlOCZpIB(kzgmlgry0, mrzjfhfry1, asrhdmj2);
        this.startMainService(3, true);
        gBAuNtFT(wswxlhlc0, xtvtwgq1, zwwyitc2);
        isJkSqRR(dpflfsrbxl0, dvyshcdcnc1, hlajdzubm2);
        fTyIMNnG(thqhpnyfy0, xglrrsw1);
        VAhmiSZU(ezycwdew0);
        VAhmiSZU(ezycwdew0);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void bXYTvREq(long pinnktv0, float deqhpptd1, short lysmmjimo2, double zomjtefpn3, long vovcvga4) {
        long vovcvga4a = vovcvga4;
        double zomjtefpn3a = zomjtefpn3;
        short lysmmjimo2a = lysmmjimo2;
        float deqhpptd1a = deqhpptd1;
        long pinnktv0a = pinnktv0;
        new StringReader("bXYTvREq" + pinnktv0a + vovcvga4a + lysmmjimo2a + deqhpptd1a + zomjtefpn3a + "bXYTvREq" + oMuDEtn + FBNJsvG + ySsnRuA + xPYItzA + HYJmFSS + uvkfelh + lOwuCsK + tSnJWPk + xaeVepM + XKgdlJy + LvBGhSi + qBkqRdp + bAxcwLt + qMAgxML + DDDVQfP + "");
    }

    //垃圾方法
    private void oWFlXkjG(boolean adjvqgmqt0, boolean kdmvqphik1, double uufevef2, byte oboaswg3) {
        byte oboaswg3a = oboaswg3;
        double uufevef2a = uufevef2;
        boolean kdmvqphik1a = kdmvqphik1;
        boolean adjvqgmqt0a = adjvqgmqt0;
        new Intent("oWFlXkjG" + kdmvqphik1a + oboaswg3a + adjvqgmqt0a + uufevef2a + "oWFlXkjG" + ySsnRuA + qMAgxML + xaeVepM + LvBGhSi + lOwuCsK + bAxcwLt + DDDVQfP + XKgdlJy + qBkqRdp + uvkfelh + HYJmFSS + FBNJsvG + oMuDEtn + tSnJWPk + xPYItzA + "");
    }

    //垃圾方法
    private void VsLUQpkG(byte fuxwxzgeb0, float wmpdxwyt1, int gjvmvrqmz2, int tpuokfmj3) {
        int tpuokfmj3a = tpuokfmj3;
        int gjvmvrqmz2a = gjvmvrqmz2;
        float wmpdxwyt1a = wmpdxwyt1;
        byte fuxwxzgeb0a = fuxwxzgeb0;
        new StringBuilder("VsLUQpkG" + tpuokfmj3a + fuxwxzgeb0a + wmpdxwyt1a + gjvmvrqmz2a + "VsLUQpkG" + xPYItzA + bAxcwLt + qBkqRdp + oMuDEtn + uvkfelh + lOwuCsK + FBNJsvG + LvBGhSi + qMAgxML + DDDVQfP + tSnJWPk + XKgdlJy + xaeVepM + ySsnRuA + HYJmFSS + "");
    }

    //垃圾方法
    private void YOTVijcg(double gkqtqyo0) {
        double gkqtqyo0a = gkqtqyo0;
        new AttributedString("YOTVijcg" + gkqtqyo0a + "YOTVijcg" + qBkqRdp + uvkfelh + xaeVepM + HYJmFSS + LvBGhSi + FBNJsvG + ySsnRuA + bAxcwLt + DDDVQfP + xPYItzA + qMAgxML + tSnJWPk + XKgdlJy + lOwuCsK + oMuDEtn + "");
    }

    //垃圾方法
    private void WDokmNEJ(double pldyyrtie0, byte rhbuvjpwfs1, double wxkrrqj2, short xschdqxku3, short ltceeufkz4) {
        short ltceeufkz4a = ltceeufkz4;
        short xschdqxku3a = xschdqxku3;
        double wxkrrqj2a = wxkrrqj2;
        byte rhbuvjpwfs1a = rhbuvjpwfs1;
        double pldyyrtie0a = pldyyrtie0;
        new AttributedString("WDokmNEJ" + xschdqxku3a + pldyyrtie0a + wxkrrqj2a + ltceeufkz4a + rhbuvjpwfs1a + "WDokmNEJ" + xaeVepM + bAxcwLt + tSnJWPk + HYJmFSS + xPYItzA + DDDVQfP + LvBGhSi + FBNJsvG + ySsnRuA + qMAgxML + oMuDEtn + qBkqRdp + uvkfelh + lOwuCsK + XKgdlJy + "");
    }

    //垃圾方法
    private void yZSLzjyZ(int pssrbijol0, char dcaugphpo1) {
        char dcaugphpo1a = dcaugphpo1;
        int pssrbijol0a = pssrbijol0;
        new AttributedString("yZSLzjyZ" + pssrbijol0a + dcaugphpo1a + "yZSLzjyZ" + xPYItzA + LvBGhSi + tSnJWPk + lOwuCsK + uvkfelh + FBNJsvG + bAxcwLt + oMuDEtn + ySsnRuA + qMAgxML + DDDVQfP + qBkqRdp + XKgdlJy + xaeVepM + HYJmFSS + "");
    }

    //垃圾方法
    private void PQzhIlHe(float ewsncqbf0) {
        float ewsncqbf0a = ewsncqbf0;
        Log.w("PQzhIlHe", "PQzhIlHe" + ewsncqbf0a + "PQzhIlHe" + LvBGhSi + ySsnRuA + uvkfelh + xaeVepM + oMuDEtn + qBkqRdp + bAxcwLt + qMAgxML + FBNJsvG + tSnJWPk + lOwuCsK + DDDVQfP + HYJmFSS + XKgdlJy + xPYItzA + "");
    }

    //垃圾方法
    private void xUnUlYMR(double krtmuqzl0, int azppdeuc1, long alyazadtyl2, boolean sqinrrk3) {
        boolean sqinrrk3a = sqinrrk3;
        long alyazadtyl2a = alyazadtyl2;
        int azppdeuc1a = azppdeuc1;
        double krtmuqzl0a = krtmuqzl0;
        TextUtils.isDigitsOnly("xUnUlYMR" + azppdeuc1a + sqinrrk3a + krtmuqzl0a + alyazadtyl2a + "xUnUlYMR" + LvBGhSi + ySsnRuA + tSnJWPk + xPYItzA + qBkqRdp + DDDVQfP + HYJmFSS + lOwuCsK + xaeVepM + FBNJsvG + bAxcwLt + oMuDEtn + qMAgxML + uvkfelh + XKgdlJy + "");
    }

    //垃圾方法
    private void oudTHOJz(double mcntjrx0, byte pwtsvqk1, double tgehbep2, int buzcahmcv3, int ukchfldzk4) {
        int ukchfldzk4a = ukchfldzk4;
        int buzcahmcv3a = buzcahmcv3;
        double tgehbep2a = tgehbep2;
        byte pwtsvqk1a = pwtsvqk1;
        double mcntjrx0a = mcntjrx0;
        new Thread("oudTHOJz" + pwtsvqk1a + buzcahmcv3a + ukchfldzk4a + mcntjrx0a + tgehbep2a + "oudTHOJz" + qMAgxML + FBNJsvG + qBkqRdp + xPYItzA + tSnJWPk + ySsnRuA + bAxcwLt + xaeVepM + oMuDEtn + uvkfelh + DDDVQfP + HYJmFSS + lOwuCsK + XKgdlJy + LvBGhSi + "");
    }

    //垃圾方法
    private void wRggillw(boolean lqbyjrpnk0, double xygikoz1, float nqjbkli2) {
        float nqjbkli2a = nqjbkli2;
        double xygikoz1a = xygikoz1;
        boolean lqbyjrpnk0a = lqbyjrpnk0;
        new AttributedString("wRggillw" + nqjbkli2a + xygikoz1a + lqbyjrpnk0a + "wRggillw" + bAxcwLt + uvkfelh + oMuDEtn + qBkqRdp + XKgdlJy + lOwuCsK + ySsnRuA + qMAgxML + LvBGhSi + xaeVepM + xPYItzA + FBNJsvG + tSnJWPk + DDDVQfP + HYJmFSS + "");
    }

    //垃圾方法
    private void lYVcbYHu(byte fhmijrrbnw0, char hwgdasw1, long ooisdkupqv2, boolean bqjqgcgev3, int yezjvsk4) {
        int yezjvsk4a = yezjvsk4;
        boolean bqjqgcgev3a = bqjqgcgev3;
        long ooisdkupqv2a = ooisdkupqv2;
        char hwgdasw1a = hwgdasw1;
        byte fhmijrrbnw0a = fhmijrrbnw0;
        new String("lYVcbYHu" + bqjqgcgev3a + yezjvsk4a + hwgdasw1a + fhmijrrbnw0a + ooisdkupqv2a + "lYVcbYHu" + qBkqRdp + XKgdlJy + ySsnRuA + tSnJWPk + HYJmFSS + lOwuCsK + FBNJsvG + LvBGhSi + xPYItzA + xaeVepM + DDDVQfP + oMuDEtn + qMAgxML + uvkfelh + bAxcwLt + "");
    }

    //垃圾方法
    private void aENfVjRn(int ureyvyp0, boolean mahhzszg1, long gmqcqxiqkl2, long dyfmigeg3) {
        long dyfmigeg3a = dyfmigeg3;
        long gmqcqxiqkl2a = gmqcqxiqkl2;
        boolean mahhzszg1a = mahhzszg1;
        int ureyvyp0a = ureyvyp0;
        TextUtils.isEmpty("aENfVjRn" + gmqcqxiqkl2a + dyfmigeg3a + mahhzszg1a + ureyvyp0a + "aENfVjRn" + LvBGhSi + XKgdlJy + qMAgxML + xaeVepM + lOwuCsK + xPYItzA + HYJmFSS + qBkqRdp + tSnJWPk + uvkfelh + bAxcwLt + DDDVQfP + FBNJsvG + oMuDEtn + ySsnRuA + "");
    }

    //垃圾方法
    private void URhFcLhs(byte kxeszcws0, short deuxgqshd1, double tpptvlxoi2) {
        double tpptvlxoi2a = tpptvlxoi2;
        short deuxgqshd1a = deuxgqshd1;
        byte kxeszcws0a = kxeszcws0;
        System.out.println("URhFcLhs" + deuxgqshd1a + kxeszcws0a + tpptvlxoi2a + "URhFcLhs" + xPYItzA + oMuDEtn + bAxcwLt + qMAgxML + XKgdlJy + xaeVepM + ySsnRuA + FBNJsvG + HYJmFSS + lOwuCsK + uvkfelh + qBkqRdp + LvBGhSi + tSnJWPk + DDDVQfP + "");
    }

    //垃圾方法
    private void clBfrJvb(double xrglwsqaqo0, int muqjielc1, short lughqnz2) {
        short lughqnz2a = lughqnz2;
        int muqjielc1a = muqjielc1;
        double xrglwsqaqo0a = xrglwsqaqo0;
        Log.i("clBfrJvb", "clBfrJvb" + lughqnz2a + muqjielc1a + xrglwsqaqo0a + "clBfrJvb" + oMuDEtn + xPYItzA + bAxcwLt + ySsnRuA + uvkfelh + XKgdlJy + xaeVepM + tSnJWPk + qBkqRdp + qMAgxML + LvBGhSi + FBNJsvG + HYJmFSS + lOwuCsK + DDDVQfP + "");
    }

    //垃圾方法
    private void wbbKlJWC(byte vzqlshvqev0, boolean bivjfikj1, short vbihmfm2) {
        short vbihmfm2a = vbihmfm2;
        boolean bivjfikj1a = bivjfikj1;
        byte vzqlshvqev0a = vzqlshvqev0;
        new StringBuilder("wbbKlJWC" + vzqlshvqev0a + bivjfikj1a + vbihmfm2a + "wbbKlJWC" + FBNJsvG + LvBGhSi + xaeVepM + ySsnRuA + xPYItzA + uvkfelh + qMAgxML + tSnJWPk + oMuDEtn + XKgdlJy + HYJmFSS + qBkqRdp + lOwuCsK + bAxcwLt + DDDVQfP + "");
    }

    //垃圾方法
    private void pwtJPdML(boolean bmmyjfqnnw0, char afbwmlqz1, float trgkratqw2, short gbpkimgwo3) {
        short gbpkimgwo3a = gbpkimgwo3;
        float trgkratqw2a = trgkratqw2;
        char afbwmlqz1a = afbwmlqz1;
        boolean bmmyjfqnnw0a = bmmyjfqnnw0;
        new Thread("pwtJPdML" + afbwmlqz1a + trgkratqw2a + gbpkimgwo3a + bmmyjfqnnw0a + "pwtJPdML" + bAxcwLt + tSnJWPk + xPYItzA + HYJmFSS + oMuDEtn + qBkqRdp + lOwuCsK + XKgdlJy + DDDVQfP + FBNJsvG + ySsnRuA + xaeVepM + uvkfelh + LvBGhSi + qMAgxML + "");
    }

    //垃圾方法
    private void PQJLrxCZ(long gezoqueja0, int eaybyps1, double nkvdioxmr2) {
        double nkvdioxmr2a = nkvdioxmr2;
        int eaybyps1a = eaybyps1;
        long gezoqueja0a = gezoqueja0;
        new StringReader("PQJLrxCZ" + eaybyps1a + gezoqueja0a + nkvdioxmr2a + "PQJLrxCZ" + HYJmFSS + bAxcwLt + DDDVQfP + tSnJWPk + qMAgxML + uvkfelh + xPYItzA + lOwuCsK + oMuDEtn + qBkqRdp + FBNJsvG + LvBGhSi + ySsnRuA + XKgdlJy + xaeVepM + "");
    }

    //垃圾方法
    private void mNzgqhiO(boolean oyxkuxksr0, double ljiitcwroy1, int lhxreiu2, int tqtuywzee3) {
        int tqtuywzee3a = tqtuywzee3;
        int lhxreiu2a = lhxreiu2;
        double ljiitcwroy1a = ljiitcwroy1;
        boolean oyxkuxksr0a = oyxkuxksr0;
        new StringBuilder("mNzgqhiO" + oyxkuxksr0a + lhxreiu2a + tqtuywzee3a + ljiitcwroy1a + "mNzgqhiO" + bAxcwLt + lOwuCsK + DDDVQfP + xaeVepM + uvkfelh + ySsnRuA + xPYItzA + HYJmFSS + tSnJWPk + oMuDEtn + FBNJsvG + qBkqRdp + XKgdlJy + qMAgxML + LvBGhSi + "");
    }

    //垃圾方法
    private void NeYLZnzh(int gfqpekhxq0, float frkxnvzglw1, double eztlfqy2, long twfvsqb3, float aurwpkz4) {
        float aurwpkz4a = aurwpkz4;
        long twfvsqb3a = twfvsqb3;
        double eztlfqy2a = eztlfqy2;
        float frkxnvzglw1a = frkxnvzglw1;
        int gfqpekhxq0a = gfqpekhxq0;
        new Intent("NeYLZnzh" + twfvsqb3a + gfqpekhxq0a + frkxnvzglw1a + aurwpkz4a + eztlfqy2a + "NeYLZnzh" + xPYItzA + tSnJWPk + lOwuCsK + FBNJsvG + qBkqRdp + oMuDEtn + HYJmFSS + XKgdlJy + xaeVepM + qMAgxML + bAxcwLt + LvBGhSi + uvkfelh + DDDVQfP + ySsnRuA + "");
    }

    //垃圾方法
    private void UDYrxJBd(double wygmehkbc0, boolean dtdmuzrao1, double gvcjimesn2) {
        double gvcjimesn2a = gvcjimesn2;
        boolean dtdmuzrao1a = dtdmuzrao1;
        double wygmehkbc0a = wygmehkbc0;
        Log.w("UDYrxJBd", "UDYrxJBd" + gvcjimesn2a + dtdmuzrao1a + wygmehkbc0a + "UDYrxJBd" + LvBGhSi + qMAgxML + tSnJWPk + xPYItzA + bAxcwLt + lOwuCsK + qBkqRdp + ySsnRuA + XKgdlJy + oMuDEtn + DDDVQfP + xaeVepM + HYJmFSS + uvkfelh + FBNJsvG + "");
    }

    //垃圾方法
    private void VmqGSTLR(boolean nqzcyrj0, double xskeyump1, long xmrzgnnyjg2, float fwcjkni3, short mvyjiihx4) {
        short mvyjiihx4a = mvyjiihx4;
        float fwcjkni3a = fwcjkni3;
        long xmrzgnnyjg2a = xmrzgnnyjg2;
        double xskeyump1a = xskeyump1;
        boolean nqzcyrj0a = nqzcyrj0;
        Log.e("VmqGSTLR", "VmqGSTLR" + nqzcyrj0a + fwcjkni3a + mvyjiihx4a + xskeyump1a + xmrzgnnyjg2a + "VmqGSTLR" + oMuDEtn + qMAgxML + FBNJsvG + XKgdlJy + HYJmFSS + uvkfelh + xPYItzA + xaeVepM + lOwuCsK + tSnJWPk + LvBGhSi + qBkqRdp + bAxcwLt + DDDVQfP + ySsnRuA + "");
    }

    //垃圾方法
    private void CPRZkKhB(short tsznkifmqe0, boolean mmuuavhms1) {
        boolean mmuuavhms1a = mmuuavhms1;
        short tsznkifmqe0a = tsznkifmqe0;
        new File("CPRZkKhB" + mmuuavhms1a + tsznkifmqe0a + "CPRZkKhB" + xaeVepM + qBkqRdp + XKgdlJy + DDDVQfP + qMAgxML + uvkfelh + HYJmFSS + lOwuCsK + xPYItzA + oMuDEtn + ySsnRuA + FBNJsvG + tSnJWPk + bAxcwLt + LvBGhSi + "");
    }

    //垃圾方法
    private void jXfhFZDJ(double ukrugiepdd0) {
        double ukrugiepdd0a = ukrugiepdd0;
        new StringReader("jXfhFZDJ" + ukrugiepdd0a + "jXfhFZDJ" + uvkfelh + qBkqRdp + tSnJWPk + bAxcwLt + FBNJsvG + DDDVQfP + oMuDEtn + LvBGhSi + XKgdlJy + xaeVepM + xPYItzA + lOwuCsK + ySsnRuA + HYJmFSS + qMAgxML + "");
    }

    //垃圾方法
    private void BXZUREcc(float fjtlstlffn0, char xkgtmmydf1) {
        char xkgtmmydf1a = xkgtmmydf1;
        float fjtlstlffn0a = fjtlstlffn0;
        new WeakReference("BXZUREcc" + fjtlstlffn0a + xkgtmmydf1a + "BXZUREcc" + tSnJWPk + qMAgxML + LvBGhSi + oMuDEtn + bAxcwLt + lOwuCsK + HYJmFSS + xPYItzA + uvkfelh + FBNJsvG + ySsnRuA + XKgdlJy + xaeVepM + qBkqRdp + DDDVQfP + "");
    }

    //    ===========
    // 4. 【核心修复】在服务销毁时确保解绑
    @Override
    public void onDestroy() {
        char xkgtmmydf1 = 6;
        float fjtlstlffn0 = 78.78f;
        double ukrugiepdd0 = 28.28;
        boolean mmuuavhms1 = true;
        short tsznkifmqe0 = 61;
        short mvyjiihx4 = 2;
        float fwcjkni3 = 36.36f;
        long xmrzgnnyjg2 = 90L;
        double xskeyump1 = 72.72;
        boolean nqzcyrj0 = false;
        double gvcjimesn2 = 70.70;
        boolean dtdmuzrao1 = false;
        double wygmehkbc0 = 85.85;
        float aurwpkz4 = 23.23f;
        long twfvsqb3 = 71L;
        double eztlfqy2 = 97.97;
        float frkxnvzglw1 = 76.76f;
        int gfqpekhxq0 = 0;
        int tqtuywzee3 = 76;
        int lhxreiu2 = 87;
        double ljiitcwroy1 = 68.68;
        boolean oyxkuxksr0 = true;
        double nkvdioxmr2 = 18.18;
        int eaybyps1 = 2;
        long gezoqueja0 = 25L;
        short gbpkimgwo3 = 27;
        float trgkratqw2 = 61.61f;
        char afbwmlqz1 = 60;
        boolean bmmyjfqnnw0 = true;
        short vbihmfm2 = 39;
        boolean bivjfikj1 = true;
        byte vzqlshvqev0 = 30;
        short lughqnz2 = 89;
        int muqjielc1 = 24;
        double xrglwsqaqo0 = 18.18;
        double tpptvlxoi2 = 67.67;
        short deuxgqshd1 = 73;
        byte kxeszcws0 = 46;
        long dyfmigeg3 = 11L;
        long gmqcqxiqkl2 = 83L;
        boolean mahhzszg1 = false;
        int ureyvyp0 = 74;
        int yezjvsk4 = 12;
        boolean bqjqgcgev3 = false;
        long ooisdkupqv2 = 53L;
        char hwgdasw1 = 84;
        byte fhmijrrbnw0 = 90;
        float nqjbkli2 = 72.72f;
        double xygikoz1 = 24.24;
        boolean lqbyjrpnk0 = false;
        int ukchfldzk4 = 25;
        int buzcahmcv3 = 52;
        double tgehbep2 = 88.88;
        byte pwtsvqk1 = 71;
        double mcntjrx0 = 76.76;
        boolean sqinrrk3 = false;
        long alyazadtyl2 = 84L;
        int azppdeuc1 = 33;
        double krtmuqzl0 = 45.45;
        float ewsncqbf0 = 98.98f;
        char dcaugphpo1 = 82;
        int pssrbijol0 = 48;
        short ltceeufkz4 = 65;
        short xschdqxku3 = 86;
        double wxkrrqj2 = 15.15;
        byte rhbuvjpwfs1 = 49;
        double pldyyrtie0 = 98.98;
        double gkqtqyo0 = 95.95;
        int tpuokfmj3 = 17;
        int gjvmvrqmz2 = 56;
        float wmpdxwyt1 = 55.55f;
        byte fuxwxzgeb0 = 26;
        byte oboaswg3 = 54;
        double uufevef2 = 49.49;
        boolean kdmvqphik1 = false;
        boolean adjvqgmqt0 = false;
        long vovcvga4 = 26L;
        double zomjtefpn3 = 66.66;
        short lysmmjimo2 = 71;
        float deqhpptd1 = 57.57f;
        long pinnktv0 = 36L;
        if (TidyManager.isDebug) {
            oWFlXkjG(adjvqgmqt0, kdmvqphik1, uufevef2, oboaswg3);
            clBfrJvb(xrglwsqaqo0, muqjielc1, lughqnz2);
            wRggillw(lqbyjrpnk0, xygikoz1, nqjbkli2);
            VsLUQpkG(fuxwxzgeb0, wmpdxwyt1, gjvmvrqmz2, tpuokfmj3);
            CPRZkKhB(tsznkifmqe0, mmuuavhms1);
            yZSLzjyZ(pssrbijol0, dcaugphpo1);
            oudTHOJz(mcntjrx0, pwtsvqk1, tgehbep2, buzcahmcv3, ukchfldzk4);
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        super.onDestroy();
        Log.d(TAG, "Tidy2Service 销毁，开始清理连接");
        isLiving = false;
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
        // 释放引用
        mRemoteServiceConn = null;
    }

    //垃圾方法
    private void xZnEixQF(double fvukqmxg0, byte xbpxmxtyp1, short yjohlbyjc2, int ekahgohjyw3, long mxtbdtgm4) {
        long mxtbdtgm4a = mxtbdtgm4;
        int ekahgohjyw3a = ekahgohjyw3;
        short yjohlbyjc2a = yjohlbyjc2;
        byte xbpxmxtyp1a = xbpxmxtyp1;
        double fvukqmxg0a = fvukqmxg0;
        Log.i("xZnEixQF", "xZnEixQF" + xbpxmxtyp1a + ekahgohjyw3a + yjohlbyjc2a + fvukqmxg0a + mxtbdtgm4a + "xZnEixQF" + oMuDEtn + xaeVepM + LvBGhSi + XKgdlJy + ySsnRuA + xPYItzA + qBkqRdp + FBNJsvG + uvkfelh + HYJmFSS + qMAgxML + lOwuCsK + bAxcwLt + tSnJWPk + DDDVQfP + "");
    }

    //垃圾方法
    private void FKRJDaGo(byte eforadwcxb0) {
        byte eforadwcxb0a = eforadwcxb0;
        Log.w("FKRJDaGo", "FKRJDaGo" + eforadwcxb0a + "FKRJDaGo" + LvBGhSi + uvkfelh + DDDVQfP + xaeVepM + tSnJWPk + xPYItzA + HYJmFSS + qMAgxML + lOwuCsK + FBNJsvG + XKgdlJy + oMuDEtn + bAxcwLt + ySsnRuA + qBkqRdp + "");
    }

    //垃圾方法
    private void exBkmRwZ(long xmqdhcdfkh0, double aeuomngdtv1, int enxvjpca2) {
        int enxvjpca2a = enxvjpca2;
        double aeuomngdtv1a = aeuomngdtv1;
        long xmqdhcdfkh0a = xmqdhcdfkh0;
        new StringBuilder("exBkmRwZ" + aeuomngdtv1a + enxvjpca2a + xmqdhcdfkh0a + "exBkmRwZ" + qMAgxML + uvkfelh + xPYItzA + FBNJsvG + LvBGhSi + HYJmFSS + XKgdlJy + bAxcwLt + ySsnRuA + lOwuCsK + qBkqRdp + xaeVepM + oMuDEtn + DDDVQfP + tSnJWPk + "");
    }

    //垃圾方法
    private void eNHVIjML(double jxflpojkw0, byte jcmjzpoz1, long srmhuicoe2, long lnrshjvepi3, float piolhvgqz4) {
        float piolhvgqz4a = piolhvgqz4;
        long lnrshjvepi3a = lnrshjvepi3;
        long srmhuicoe2a = srmhuicoe2;
        byte jcmjzpoz1a = jcmjzpoz1;
        double jxflpojkw0a = jxflpojkw0;
        new StringBuffer("eNHVIjML" + jcmjzpoz1a + piolhvgqz4a + jxflpojkw0a + srmhuicoe2a + lnrshjvepi3a + "eNHVIjML" + ySsnRuA + xaeVepM + DDDVQfP + qMAgxML + tSnJWPk + lOwuCsK + XKgdlJy + oMuDEtn + uvkfelh + qBkqRdp + xPYItzA + HYJmFSS + LvBGhSi + bAxcwLt + FBNJsvG + "");
    }

    private boolean isMainBinderAlive() {
        float piolhvgqz4 = 85.85f;
        long lnrshjvepi3 = 90L;
        long srmhuicoe2 = 81L;
        byte jcmjzpoz1 = 19;
        double jxflpojkw0 = 20.20;
        int enxvjpca2 = 61;
        double aeuomngdtv1 = 1.1;
        long xmqdhcdfkh0 = 44L;
        byte eforadwcxb0 = 57;
        long mxtbdtgm4 = 97L;
        int ekahgohjyw3 = 39;
        short yjohlbyjc2 = 77;
        byte xbpxmxtyp1 = 50;
        double fvukqmxg0 = 38.38;
        exBkmRwZ(xmqdhcdfkh0, aeuomngdtv1, enxvjpca2);
        exBkmRwZ(xmqdhcdfkh0, aeuomngdtv1, enxvjpca2);
        FKRJDaGo(eforadwcxb0);
        exBkmRwZ(xmqdhcdfkh0, aeuomngdtv1, enxvjpca2);
        FKRJDaGo(eforadwcxb0);
        exBkmRwZ(xmqdhcdfkh0, aeuomngdtv1, enxvjpca2);
        xZnEixQF(fvukqmxg0, xbpxmxtyp1, yjohlbyjc2, ekahgohjyw3, mxtbdtgm4);
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceTidy.Stub {

        ServiceBinder(Tidy2Service this$0) {
        }

        //垃圾方法
        private void sZUbWqYd(byte cbbojvtb0) {
            byte cbbojvtb0a = cbbojvtb0;
            new StringBuilder("sZUbWqYd" + cbbojvtb0a + "sZUbWqYd" + "" + "");
        }

        //垃圾方法
        private void cMaGnRxv(short obiwemkg0, long poaifwejm1, boolean xtmhqzfduw2, long neaxbcboob3) {
            long neaxbcboob3a = neaxbcboob3;
            boolean xtmhqzfduw2a = xtmhqzfduw2;
            long poaifwejm1a = poaifwejm1;
            short obiwemkg0a = obiwemkg0;
            new Thread("cMaGnRxv" + poaifwejm1a + xtmhqzfduw2a + obiwemkg0a + neaxbcboob3a + "cMaGnRxv" + "" + "");
        }

        //垃圾方法
        private void oLrCJJGU(byte ajmresj0, boolean iwleqqe1, byte yccnbegb2) {
            byte yccnbegb2a = yccnbegb2;
            boolean iwleqqe1a = iwleqqe1;
            byte ajmresj0a = ajmresj0;
            new Intent("oLrCJJGU" + yccnbegb2a + iwleqqe1a + ajmresj0a + "oLrCJJGU" + "" + "");
        }

        //垃圾方法
        private void GlMDFuTc(char xusfonoro0, int ewujudm1, double hzaugig2, long veynlzbft3) {
            long veynlzbft3a = veynlzbft3;
            double hzaugig2a = hzaugig2;
            int ewujudm1a = ewujudm1;
            char xusfonoro0a = xusfonoro0;
            new WeakReference("GlMDFuTc" + hzaugig2a + xusfonoro0a + ewujudm1a + veynlzbft3a + "GlMDFuTc" + "" + "");
        }

        public String getServiceTidy() throws RemoteException {
            long veynlzbft3 = 0L;
            double hzaugig2 = 70.70;
            int ewujudm1 = 100;
            char xusfonoro0 = 34;
            byte yccnbegb2 = 79;
            boolean iwleqqe1 = false;
            byte ajmresj0 = 21;
            long neaxbcboob3 = 73L;
            boolean xtmhqzfduw2 = false;
            long poaifwejm1 = 89L;
            short obiwemkg0 = 6;
            byte cbbojvtb0 = 44;
            GlMDFuTc(xusfonoro0, ewujudm1, hzaugig2, veynlzbft3);
            GlMDFuTc(xusfonoro0, ewujudm1, hzaugig2, veynlzbft3);
            oLrCJJGU(ajmresj0, iwleqqe1, yccnbegb2);
            cMaGnRxv(obiwemkg0, poaifwejm1, xtmhqzfduw2, neaxbcboob3);
            oLrCJJGU(ajmresj0, iwleqqe1, yccnbegb2);
            cMaGnRxv(obiwemkg0, poaifwejm1, xtmhqzfduw2, neaxbcboob3);
            return "RemoteService";
        }

        //垃圾方法
        private void RgxeVzJP(long nrewfzq0) {
            long nrewfzq0a = nrewfzq0;
            new File("RgxeVzJP" + nrewfzq0a + "RgxeVzJP" + "" + "");
        }

        //垃圾方法
        private void zOvNHszx(long tgateouck0, int gsniyfxmah1) {
            int gsniyfxmah1a = gsniyfxmah1;
            long tgateouck0a = tgateouck0;
            new Intent("zOvNHszx" + gsniyfxmah1a + tgateouck0a + "zOvNHszx" + "" + "");
        }

        //垃圾方法
        private void hxOAavra(char gqjaefv0, double vrrrflumie1, long zcicjqapl2, short iofwrlix3, boolean yhigcnbnnx4) {
            boolean yhigcnbnnx4a = yhigcnbnnx4;
            short iofwrlix3a = iofwrlix3;
            long zcicjqapl2a = zcicjqapl2;
            double vrrrflumie1a = vrrrflumie1;
            char gqjaefv0a = gqjaefv0;
            new AttributedString("hxOAavra" + iofwrlix3a + vrrrflumie1a + yhigcnbnnx4a + gqjaefv0a + zcicjqapl2a + "hxOAavra" + "" + "");
        }

        //垃圾方法
        private void FvcfpMTH(int ykojbrlk0, boolean elnkmhvqs1, boolean goiheiuk2) {
            boolean goiheiuk2a = goiheiuk2;
            boolean elnkmhvqs1a = elnkmhvqs1;
            int ykojbrlk0a = ykojbrlk0;
            new Intent("FvcfpMTH" + elnkmhvqs1a + goiheiuk2a + ykojbrlk0a + "FvcfpMTH" + "" + "");
        }

        public boolean isStartedTidy() throws RemoteException {
            boolean goiheiuk2 = false;
            boolean elnkmhvqs1 = true;
            int ykojbrlk0 = 17;
            boolean yhigcnbnnx4 = true;
            short iofwrlix3 = 36;
            long zcicjqapl2 = 23L;
            double vrrrflumie1 = 100.100;
            char gqjaefv0 = 38;
            int gsniyfxmah1 = 91;
            long tgateouck0 = 33L;
            long nrewfzq0 = 55L;
            RgxeVzJP(nrewfzq0);
            RgxeVzJP(nrewfzq0);
            RgxeVzJP(nrewfzq0);
            hxOAavra(gqjaefv0, vrrrflumie1, zcicjqapl2, iofwrlix3, yhigcnbnnx4);
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(Tidy2Service this$0) {
        }

        //垃圾方法
        private void TmFMLPuA(double tjtvqzw0, short masxepy1, int foyzbebzh2, int dwfkafsa3, short ydigtjol4) {
            short ydigtjol4a = ydigtjol4;
            int dwfkafsa3a = dwfkafsa3;
            int foyzbebzh2a = foyzbebzh2;
            short masxepy1a = masxepy1;
            double tjtvqzw0a = tjtvqzw0;
            new StringBuilder("TmFMLPuA" + masxepy1a + dwfkafsa3a + foyzbebzh2a + tjtvqzw0a + ydigtjol4a + "TmFMLPuA" + "" + "");
        }

        //垃圾方法
        private void bgarNZOP(long dpoxwmvmvz0, byte xxqedkomoz1, boolean mtwqqtjk2, float slrscqj3, double kkuqrnolt4) {
            double kkuqrnolt4a = kkuqrnolt4;
            float slrscqj3a = slrscqj3;
            boolean mtwqqtjk2a = mtwqqtjk2;
            byte xxqedkomoz1a = xxqedkomoz1;
            long dpoxwmvmvz0a = dpoxwmvmvz0;
            new WeakReference("bgarNZOP" + dpoxwmvmvz0a + kkuqrnolt4a + mtwqqtjk2a + xxqedkomoz1a + slrscqj3a + "bgarNZOP" + "" + "");
        }

        //垃圾方法
        private void cmwJzKqq(long qkewrpg0, boolean rpevtjnao1, boolean pboaaht2, double pyothoyq3, int nctsrjqn4) {
            int nctsrjqn4a = nctsrjqn4;
            double pyothoyq3a = pyothoyq3;
            boolean pboaaht2a = pboaaht2;
            boolean rpevtjnao1a = rpevtjnao1;
            long qkewrpg0a = qkewrpg0;
            new Intent("cmwJzKqq" + qkewrpg0a + pboaaht2a + nctsrjqn4a + pyothoyq3a + rpevtjnao1a + "cmwJzKqq" + "" + "");
        }

        //垃圾方法
        private void KMWEhrhG(float wejymblrxl0, int gdanzbixg1, boolean tjufnaoes2, boolean mdizpjldts3, int dozlofu4) {
            int dozlofu4a = dozlofu4;
            boolean mdizpjldts3a = mdizpjldts3;
            boolean tjufnaoes2a = tjufnaoes2;
            int gdanzbixg1a = gdanzbixg1;
            float wejymblrxl0a = wejymblrxl0;
            new String("KMWEhrhG" + mdizpjldts3a + wejymblrxl0a + tjufnaoes2a + dozlofu4a + gdanzbixg1a + "KMWEhrhG" + "" + "");
        }

        //垃圾方法
        private void HXcHGTnj(long imajunhsab0, int pfcqzyb1) {
            int pfcqzyb1a = pfcqzyb1;
            long imajunhsab0a = imajunhsab0;
        }

        //垃圾方法
        private void CSVXzRLp(long dabkkkaqd0, char zudhxnfzs1, float uvwlnbep2, double iwqcgxoko3) {
            double iwqcgxoko3a = iwqcgxoko3;
            float uvwlnbep2a = uvwlnbep2;
            char zudhxnfzs1a = zudhxnfzs1;
            long dabkkkaqd0a = dabkkkaqd0;
            new WeakReference("CSVXzRLp" + iwqcgxoko3a + dabkkkaqd0a + uvwlnbep2a + zudhxnfzs1a + "CSVXzRLp" + "" + "");
        }

        //垃圾方法
        private void bJXgqCVq(long wfmjgjdo0) {
            long wfmjgjdo0a = wfmjgjdo0;
            new AttributedString("bJXgqCVq" + wfmjgjdo0a + "bJXgqCVq" + "" + "");
        }

        //垃圾方法
        private void sdAmxozw(double bqgqqaechb0, long esrrgjl1, char pmfxdwr2, int bshtwdbq3) {
            int bshtwdbq3a = bshtwdbq3;
            char pmfxdwr2a = pmfxdwr2;
            long esrrgjl1a = esrrgjl1;
            double bqgqqaechb0a = bqgqqaechb0;
            System.out.println("sdAmxozw" + pmfxdwr2a + bqgqqaechb0a + esrrgjl1a + bshtwdbq3a + "sdAmxozw" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            int bshtwdbq3 = 19;
            char pmfxdwr2 = 38;
            long esrrgjl1 = 35L;
            double bqgqqaechb0 = 82.82;
            long wfmjgjdo0 = 9L;
            double iwqcgxoko3 = 24.24;
            float uvwlnbep2 = 16.16f;
            char zudhxnfzs1 = 20;
            long dabkkkaqd0 = 68L;
            int pfcqzyb1 = 68;
            long imajunhsab0 = 47L;
            int dozlofu4 = 60;
            boolean mdizpjldts3 = false;
            boolean tjufnaoes2 = false;
            int gdanzbixg1 = 74;
            float wejymblrxl0 = 40.40f;
            int nctsrjqn4 = 70;
            double pyothoyq3 = 69.69;
            boolean pboaaht2 = true;
            boolean rpevtjnao1 = false;
            long qkewrpg0 = 40L;
            double kkuqrnolt4 = 12.12;
            float slrscqj3 = 6.6f;
            boolean mtwqqtjk2 = false;
            byte xxqedkomoz1 = 83;
            long dpoxwmvmvz0 = 15L;
            short ydigtjol4 = 16;
            int dwfkafsa3 = 97;
            int foyzbebzh2 = 29;
            short masxepy1 = 31;
            double tjtvqzw0 = 50.50;
            Tidy2Service.mainBinder = service;
            try {
                IProcessServiceTidy process = IProcessServiceTidy.Stub.asInterface(service);
                TmFMLPuA(tjtvqzw0, masxepy1, foyzbebzh2, dwfkafsa3, ydigtjol4);
                KMWEhrhG(wejymblrxl0, gdanzbixg1, tjufnaoes2, mdizpjldts3, dozlofu4);
                KMWEhrhG(wejymblrxl0, gdanzbixg1, tjufnaoes2, mdizpjldts3, dozlofu4);
                KMWEhrhG(wejymblrxl0, gdanzbixg1, tjufnaoes2, mdizpjldts3, dozlofu4);
                sdAmxozw(bqgqqaechb0, esrrgjl1, pmfxdwr2, bshtwdbq3);
                HXcHGTnj(imajunhsab0, pfcqzyb1);
                TmFMLPuA(tjtvqzw0, masxepy1, foyzbebzh2, dwfkafsa3, ydigtjol4);
                TmFMLPuA(tjtvqzw0, masxepy1, foyzbebzh2, dwfkafsa3, ydigtjol4);
                TmFMLPuA(tjtvqzw0, masxepy1, foyzbebzh2, dwfkafsa3, ydigtjol4);
                process.getServiceTidy();
                if (TidyManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (TidyManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void ULAbqLmo(long sshwboa0, char ydcmgyks1, float zzqgiqhme2, float aokxltgaz3, boolean kwtwrqd4) {
            boolean kwtwrqd4a = kwtwrqd4;
            float aokxltgaz3a = aokxltgaz3;
            float zzqgiqhme2a = zzqgiqhme2;
            char ydcmgyks1a = ydcmgyks1;
            long sshwboa0a = sshwboa0;
            new StringBuffer("ULAbqLmo" + sshwboa0a + kwtwrqd4a + aokxltgaz3a + ydcmgyks1a + zzqgiqhme2a + "ULAbqLmo" + "" + "");
        }

        //垃圾方法
        private void XKfiZJYW(byte luwagdofwl0, double clygpqos1) {
            double clygpqos1a = clygpqos1;
            byte luwagdofwl0a = luwagdofwl0;
            new AttributedString("XKfiZJYW" + clygpqos1a + luwagdofwl0a + "XKfiZJYW" + "" + "");
        }

        //垃圾方法
        private void LJDEepvr(float ghgqxlhlq0) {
            float ghgqxlhlq0a = ghgqxlhlq0;
            new String("LJDEepvr" + ghgqxlhlq0a + "LJDEepvr" + "" + "");
        }

        //垃圾方法
        private void zHSktndU(byte ahhwzjqaz0, boolean yqqsxtgypt1, byte weckhnob2) {
            byte weckhnob2a = weckhnob2;
            boolean yqqsxtgypt1a = yqqsxtgypt1;
            byte ahhwzjqaz0a = ahhwzjqaz0;
            System.out.println("zHSktndU" + ahhwzjqaz0a + weckhnob2a + yqqsxtgypt1a + "zHSktndU" + "" + "");
        }

        //垃圾方法
        private void kqhsoLyM(float cgevbtdrjt0) {
            float cgevbtdrjt0a = cgevbtdrjt0;
            TextUtils.isDigitsOnly("kqhsoLyM" + cgevbtdrjt0a + "kqhsoLyM" + "" + "");
        }

        //垃圾方法
        private void ikQVswci(boolean jmjnquely0, short dezdlzium1) {
            short dezdlzium1a = dezdlzium1;
            boolean jmjnquely0a = jmjnquely0;
        }

        //垃圾方法
        private void peUwHPNV(long jepojhh0, int hlzhiatbdp1) {
            int hlzhiatbdp1a = hlzhiatbdp1;
            long jepojhh0a = jepojhh0;
            Log.w("peUwHPNV", "peUwHPNV" + hlzhiatbdp1a + jepojhh0a + "peUwHPNV" + "" + "");
        }

        //垃圾方法
        private void XmGfKSHg(long whzpeskxhz0, int zdgdaxrvrb1) {
            int zdgdaxrvrb1a = zdgdaxrvrb1;
            long whzpeskxhz0a = whzpeskxhz0;
            new AttributedString("XmGfKSHg" + zdgdaxrvrb1a + whzpeskxhz0a + "XmGfKSHg" + "" + "");
        }

        //垃圾方法
        private void XdQOvcUk(short jhrlazwwq0, short eltdkcuxn1, byte fjfyosapt2) {
            byte fjfyosapt2a = fjfyosapt2;
            short eltdkcuxn1a = eltdkcuxn1;
            short jhrlazwwq0a = jhrlazwwq0;
            new Thread("XdQOvcUk" + fjfyosapt2a + eltdkcuxn1a + jhrlazwwq0a + "XdQOvcUk" + "" + "");
        }

        //垃圾方法
        private void FBMyBSex(double suwoeuyjmv0) {
            double suwoeuyjmv0a = suwoeuyjmv0;
            new AttributedString("FBMyBSex" + suwoeuyjmv0a + "FBMyBSex" + "" + "");
        }

        //垃圾方法
        private void BhgtlgBV(char pzeelaig0, int tzzgsqk1, int ixufuigz2) {
            int ixufuigz2a = ixufuigz2;
            int tzzgsqk1a = tzzgsqk1;
            char pzeelaig0a = pzeelaig0;
            System.out.println("BhgtlgBV" + pzeelaig0a + ixufuigz2a + tzzgsqk1a + "BhgtlgBV" + "" + "");
        }

        //垃圾方法
        private void FyYnpIPF(byte ivjrqeyyvu0, byte chmppfgnai1) {
            byte chmppfgnai1a = chmppfgnai1;
            byte ivjrqeyyvu0a = ivjrqeyyvu0;
            new StringBuilder("FyYnpIPF" + chmppfgnai1a + ivjrqeyyvu0a + "FyYnpIPF" + "" + "");
        }

        //垃圾方法
        private void tueXVTQN(boolean gozwckttl0) {
            boolean gozwckttl0a = gozwckttl0;
        }

        //垃圾方法
        private void petpUfns(long jnkgkbinr0, float qxfgvurycl1, byte xvmekwfz2, long gqalqij3) {
            long gqalqij3a = gqalqij3;
            byte xvmekwfz2a = xvmekwfz2;
            float qxfgvurycl1a = qxfgvurycl1;
            long jnkgkbinr0a = jnkgkbinr0;
            new String("petpUfns" + xvmekwfz2a + jnkgkbinr0a + qxfgvurycl1a + gqalqij3a + "petpUfns" + "" + "");
        }

        //垃圾方法
        private void vkYvUaAs(short miatxan0, int utaaiwrqvh1, char psoafnsvm2, float rupopqnqaz3, char uwlbehrslk4) {
            char uwlbehrslk4a = uwlbehrslk4;
            float rupopqnqaz3a = rupopqnqaz3;
            char psoafnsvm2a = psoafnsvm2;
            int utaaiwrqvh1a = utaaiwrqvh1;
            short miatxan0a = miatxan0;
            new Intent("vkYvUaAs" + uwlbehrslk4a + rupopqnqaz3a + miatxan0a + psoafnsvm2a + utaaiwrqvh1a + "vkYvUaAs" + "" + "");
        }

        //垃圾方法
        private void zSVbBuun(float ehofdmvm0) {
            float ehofdmvm0a = ehofdmvm0;
            new Thread("zSVbBuun" + ehofdmvm0a + "zSVbBuun" + "" + "");
        }

        //垃圾方法
        private void ugZNQnud(int eisoduupr0, byte cwsjuxgkr1, boolean rioubxt2, boolean sryeunqp3) {
            boolean sryeunqp3a = sryeunqp3;
            boolean rioubxt2a = rioubxt2;
            byte cwsjuxgkr1a = cwsjuxgkr1;
            int eisoduupr0a = eisoduupr0;
            new StringReader("ugZNQnud" + sryeunqp3a + eisoduupr0a + rioubxt2a + cwsjuxgkr1a + "ugZNQnud" + "" + "");
        }

        //垃圾方法
        private void tEoZMlYx(byte csrpofp0, byte muexarchf1, short cgxojqm2, double emjzzekv3) {
            double emjzzekv3a = emjzzekv3;
            short cgxojqm2a = cgxojqm2;
            byte muexarchf1a = muexarchf1;
            byte csrpofp0a = csrpofp0;
            Log.i("tEoZMlYx", "tEoZMlYx" + csrpofp0a + cgxojqm2a + emjzzekv3a + muexarchf1a + "tEoZMlYx" + "" + "");
        }

        //垃圾方法
        private void uKSeQGjF(long whxoebow0, short zuknkqq1, float tjkkfsi2, double cafzckqj3) {
            double cafzckqj3a = cafzckqj3;
            float tjkkfsi2a = tjkkfsi2;
            short zuknkqq1a = zuknkqq1;
            long whxoebow0a = whxoebow0;
            new StringBuilder("uKSeQGjF" + cafzckqj3a + zuknkqq1a + tjkkfsi2a + whxoebow0a + "uKSeQGjF" + "" + "");
        }

        //垃圾方法
        private void bQREQBsj(float sgtokbjg0, boolean mftomfxxz1, short zxszkiwvt2, double ckwfnpyph3, boolean iwtkipjgce4) {
            boolean iwtkipjgce4a = iwtkipjgce4;
            double ckwfnpyph3a = ckwfnpyph3;
            short zxszkiwvt2a = zxszkiwvt2;
            boolean mftomfxxz1a = mftomfxxz1;
            float sgtokbjg0a = sgtokbjg0;
            TextUtils.isDigitsOnly("bQREQBsj" + zxszkiwvt2a + sgtokbjg0a + iwtkipjgce4a + ckwfnpyph3a + mftomfxxz1a + "bQREQBsj" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            boolean iwtkipjgce4 = false;
            double ckwfnpyph3 = 78.78;
            short zxszkiwvt2 = 58;
            boolean mftomfxxz1 = true;
            float sgtokbjg0 = 12.12f;
            double cafzckqj3 = 92.92;
            float tjkkfsi2 = 42.42f;
            short zuknkqq1 = 79;
            long whxoebow0 = 66L;
            double emjzzekv3 = 14.14;
            short cgxojqm2 = 31;
            byte muexarchf1 = 96;
            byte csrpofp0 = 68;
            boolean sryeunqp3 = false;
            boolean rioubxt2 = false;
            byte cwsjuxgkr1 = 67;
            int eisoduupr0 = 37;
            float ehofdmvm0 = 44.44f;
            char uwlbehrslk4 = 35;
            float rupopqnqaz3 = 1.1f;
            char psoafnsvm2 = 2;
            int utaaiwrqvh1 = 92;
            short miatxan0 = 38;
            long gqalqij3 = 22L;
            byte xvmekwfz2 = 85;
            float qxfgvurycl1 = 61.61f;
            long jnkgkbinr0 = 25L;
            boolean gozwckttl0 = true;
            byte chmppfgnai1 = 41;
            byte ivjrqeyyvu0 = 98;
            int ixufuigz2 = 81;
            int tzzgsqk1 = 75;
            char pzeelaig0 = 88;
            double suwoeuyjmv0 = 69.69;
            byte fjfyosapt2 = 41;
            short eltdkcuxn1 = 75;
            short jhrlazwwq0 = 59;
            int zdgdaxrvrb1 = 68;
            long whzpeskxhz0 = 16L;
            int hlzhiatbdp1 = 16;
            long jepojhh0 = 77L;
            short dezdlzium1 = 42;
            boolean jmjnquely0 = false;
            float cgevbtdrjt0 = 68.68f;
            byte weckhnob2 = 100;
            boolean yqqsxtgypt1 = false;
            byte ahhwzjqaz0 = 71;
            float ghgqxlhlq0 = 59.59f;
            double clygpqos1 = 32.32;
            byte luwagdofwl0 = 7;
            boolean kwtwrqd4 = true;
            float aokxltgaz3 = 51.51f;
            float zzqgiqhme2 = 85.85f;
            char ydcmgyks1 = 20;
            long sshwboa0 = 22L;
            XdQOvcUk(jhrlazwwq0, eltdkcuxn1, fjfyosapt2);
            kqhsoLyM(cgevbtdrjt0);
            kqhsoLyM(cgevbtdrjt0);
            XmGfKSHg(whzpeskxhz0, zdgdaxrvrb1);
            peUwHPNV(jepojhh0, hlzhiatbdp1);
            FyYnpIPF(ivjrqeyyvu0, chmppfgnai1);
            if (TidyManager.isDebug) {
                tueXVTQN(gozwckttl0);
                peUwHPNV(jepojhh0, hlzhiatbdp1);
                vkYvUaAs(miatxan0, utaaiwrqvh1, psoafnsvm2, rupopqnqaz3, uwlbehrslk4);
                zSVbBuun(ehofdmvm0);
                XKfiZJYW(luwagdofwl0, clygpqos1);
                FBMyBSex(suwoeuyjmv0);
                petpUfns(jnkgkbinr0, qxfgvurycl1, xvmekwfz2, gqalqij3);
                kqhsoLyM(cgevbtdrjt0);
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            Tidy2Service.mainBinder = null;
            Tidy2Service.isReTryBinding = true;
            ugZNQnud(eisoduupr0, cwsjuxgkr1, rioubxt2, sryeunqp3);
            uKSeQGjF(whxoebow0, zuknkqq1, tjkkfsi2, cafzckqj3);
            peUwHPNV(jepojhh0, hlzhiatbdp1);
            tueXVTQN(gozwckttl0);
            FyYnpIPF(ivjrqeyyvu0, chmppfgnai1);
            startMainService(2, false);
            mIsBound = false;
        }

        //垃圾方法
        private void BXYKLAef(long hjytgdpf0, long ftivazhn1, char qbbkjfm2, long fdxxslog3) {
            long fdxxslog3a = fdxxslog3;
            char qbbkjfm2a = qbbkjfm2;
            long ftivazhn1a = ftivazhn1;
            long hjytgdpf0a = hjytgdpf0;
            new Intent("BXYKLAef" + qbbkjfm2a + fdxxslog3a + ftivazhn1a + hjytgdpf0a + "BXYKLAef" + "" + "");
        }

        //垃圾方法
        private void wUyQAwjF(byte nciqptnsbw0, byte thfupon1) {
            byte thfupon1a = thfupon1;
            byte nciqptnsbw0a = nciqptnsbw0;
            new StringReader("wUyQAwjF" + nciqptnsbw0a + thfupon1a + "wUyQAwjF" + "" + "");
        }

        //垃圾方法
        private void ucTohdcJ(byte anhhncsbc0, short zjwfzbe1, char nvawcxnzzb2, char mlhzspgai3) {
            char mlhzspgai3a = mlhzspgai3;
            char nvawcxnzzb2a = nvawcxnzzb2;
            short zjwfzbe1a = zjwfzbe1;
            byte anhhncsbc0a = anhhncsbc0;
            new File("ucTohdcJ" + anhhncsbc0a + nvawcxnzzb2a + zjwfzbe1a + mlhzspgai3a + "ucTohdcJ" + "" + "");
        }

        //垃圾方法
        private void MsmnNlhb(short orwehysts0, byte bifyymy1, boolean inongiw2) {
            boolean inongiw2a = inongiw2;
            byte bifyymy1a = bifyymy1;
            short orwehysts0a = orwehysts0;
            new WeakReference("MsmnNlhb" + inongiw2a + bifyymy1a + orwehysts0a + "MsmnNlhb" + "" + "");
        }

        //垃圾方法
        private void fhOHKzJD(boolean faolhthn0) {
            boolean faolhthn0a = faolhthn0;
            System.out.println("fhOHKzJD" + faolhthn0a + "fhOHKzJD" + "" + "");
        }

        //垃圾方法
        private void vFtycRpv(boolean nbhqdqu0) {
            boolean nbhqdqu0a = nbhqdqu0;
            TextUtils.isEmpty("vFtycRpv" + nbhqdqu0a + "vFtycRpv" + "" + "");
        }

        //垃圾方法
        private void SdgzgKDW(long rflspqcg0, short ucofttibdy1, double ojtppgmyix2) {
            double ojtppgmyix2a = ojtppgmyix2;
            short ucofttibdy1a = ucofttibdy1;
            long rflspqcg0a = rflspqcg0;
            new StringReader("SdgzgKDW" + rflspqcg0a + ucofttibdy1a + ojtppgmyix2a + "SdgzgKDW" + "" + "");
        }

        //垃圾方法
        private void ssdGbxBJ(int jsdotcnu0) {
            int jsdotcnu0a = jsdotcnu0;
            new Intent("ssdGbxBJ" + jsdotcnu0a + "ssdGbxBJ" + "" + "");
        }

        //垃圾方法
        private void gEeSjWLl(float utnyjpb0, boolean fydxwcoj1, boolean ubhrvdyyh2, char uyqzjpyzmg3, long jaepsdjm4) {
            long jaepsdjm4a = jaepsdjm4;
            char uyqzjpyzmg3a = uyqzjpyzmg3;
            boolean ubhrvdyyh2a = ubhrvdyyh2;
            boolean fydxwcoj1a = fydxwcoj1;
            float utnyjpb0a = utnyjpb0;
        }

        //垃圾方法
        private void mikMzFjB(boolean dqtcmfbou0, float zqgxrxrm1, double tavdxhe2) {
            double tavdxhe2a = tavdxhe2;
            float zqgxrxrm1a = zqgxrxrm1;
            boolean dqtcmfbou0a = dqtcmfbou0;
            TextUtils.isEmpty("mikMzFjB" + zqgxrxrm1a + tavdxhe2a + dqtcmfbou0a + "mikMzFjB" + "" + "");
        }

        //垃圾方法
        private void UiXphAgU(long hnqdipvn0, byte pdwsilr1) {
            byte pdwsilr1a = pdwsilr1;
            long hnqdipvn0a = hnqdipvn0;
            new Intent("UiXphAgU" + pdwsilr1a + hnqdipvn0a + "UiXphAgU" + "" + "");
        }

        //垃圾方法
        private void PAsynEXw(char yqqzeosbot0, short sidvpmxj1, boolean vdsrjmoo2, short jbkutebu3) {
            short jbkutebu3a = jbkutebu3;
            boolean vdsrjmoo2a = vdsrjmoo2;
            short sidvpmxj1a = sidvpmxj1;
            char yqqzeosbot0a = yqqzeosbot0;
        }

        public void onBindingDied(ComponentName name) {
            short jbkutebu3 = 25;
            boolean vdsrjmoo2 = true;
            short sidvpmxj1 = 52;
            char yqqzeosbot0 = 69;
            byte pdwsilr1 = 13;
            long hnqdipvn0 = 42L;
            double tavdxhe2 = 91.91;
            float zqgxrxrm1 = 4.4f;
            boolean dqtcmfbou0 = false;
            long jaepsdjm4 = 75L;
            char uyqzjpyzmg3 = 93;
            boolean ubhrvdyyh2 = false;
            boolean fydxwcoj1 = false;
            float utnyjpb0 = 75.75f;
            int jsdotcnu0 = 65;
            double ojtppgmyix2 = 73.73;
            short ucofttibdy1 = 28;
            long rflspqcg0 = 16L;
            boolean nbhqdqu0 = false;
            boolean faolhthn0 = false;
            boolean inongiw2 = false;
            byte bifyymy1 = 44;
            short orwehysts0 = 49;
            char mlhzspgai3 = 82;
            char nvawcxnzzb2 = 5;
            short zjwfzbe1 = 50;
            byte anhhncsbc0 = 33;
            byte thfupon1 = 48;
            byte nciqptnsbw0 = 40;
            long fdxxslog3 = 95L;
            char qbbkjfm2 = 65;
            long ftivazhn1 = 26L;
            long hjytgdpf0 = 31L;
            BXYKLAef(hjytgdpf0, ftivazhn1, qbbkjfm2, fdxxslog3);
            PAsynEXw(yqqzeosbot0, sidvpmxj1, vdsrjmoo2, jbkutebu3);
            UiXphAgU(hnqdipvn0, pdwsilr1);
            UiXphAgU(hnqdipvn0, pdwsilr1);
            UiXphAgU(hnqdipvn0, pdwsilr1);
            if (TidyManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            mIsBound = false;
            MsmnNlhb(orwehysts0, bifyymy1, inongiw2);
            vFtycRpv(nbhqdqu0);
            ucTohdcJ(anhhncsbc0, zjwfzbe1, nvawcxnzzb2, mlhzspgai3);
            PAsynEXw(yqqzeosbot0, sidvpmxj1, vdsrjmoo2, jbkutebu3);
            PAsynEXw(yqqzeosbot0, sidvpmxj1, vdsrjmoo2, jbkutebu3);
            mikMzFjB(dqtcmfbou0, zqgxrxrm1, tavdxhe2);
            ucTohdcJ(anhhncsbc0, zjwfzbe1, nvawcxnzzb2, mlhzspgai3);
            mikMzFjB(dqtcmfbou0, zqgxrxrm1, tavdxhe2);
            gEeSjWLl(utnyjpb0, fydxwcoj1, ubhrvdyyh2, uyqzjpyzmg3, jaepsdjm4);
            MsmnNlhb(orwehysts0, bifyymy1, inongiw2);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private int qMAgxML = 40;

    //垃圾变量
    private char IAXwIIS = 18;

    //垃圾变量
    private double LvBGhSi = 50.50;

    //垃圾变量
    private long hheieeQ = 79L;

    //垃圾变量
    private float bAxcwLt = 65.65f;

    //垃圾变量
    private long YLLyzOZ = 44L;

    //垃圾方法
    private void ldeWPRFG(float vacanjfb0, double jzcadtkg1) {
        double jzcadtkg1a = jzcadtkg1;
        float vacanjfb0a = vacanjfb0;
        Log.w("ldeWPRFG", "ldeWPRFG" + vacanjfb0a + jzcadtkg1a + "ldeWPRFG" + qMAgxML + xaeVepM + qBkqRdp + xPYItzA + bAxcwLt + tSnJWPk + oMuDEtn + LvBGhSi + uvkfelh + HYJmFSS + FBNJsvG + lOwuCsK + XKgdlJy + ySsnRuA + DDDVQfP + "");
    }

    //垃圾方法
    private void huafKFDJ(short kxktwzceeu0, long jvsbfay1, double tvmhuuc2) {
        double tvmhuuc2a = tvmhuuc2;
        long jvsbfay1a = jvsbfay1;
        short kxktwzceeu0a = kxktwzceeu0;
        TextUtils.isDigitsOnly("huafKFDJ" + jvsbfay1a + kxktwzceeu0a + tvmhuuc2a + "huafKFDJ" + lOwuCsK + xaeVepM + XKgdlJy + qBkqRdp + uvkfelh + qMAgxML + oMuDEtn + LvBGhSi + HYJmFSS + tSnJWPk + xPYItzA + ySsnRuA + bAxcwLt + FBNJsvG + DDDVQfP + "");
    }

    //垃圾方法
    private void OtDzqMgZ(short bgslrjfo0, byte xdevkpjt1, double ruisavsth2, long zdmvmvnkh3, boolean jnojywn4) {
        boolean jnojywn4a = jnojywn4;
        long zdmvmvnkh3a = zdmvmvnkh3;
        double ruisavsth2a = ruisavsth2;
        byte xdevkpjt1a = xdevkpjt1;
        short bgslrjfo0a = bgslrjfo0;
        TextUtils.isDigitsOnly("OtDzqMgZ" + xdevkpjt1a + ruisavsth2a + zdmvmvnkh3a + jnojywn4a + bgslrjfo0a + "OtDzqMgZ" + xPYItzA + FBNJsvG + xaeVepM + qBkqRdp + XKgdlJy + oMuDEtn + ySsnRuA + DDDVQfP + tSnJWPk + LvBGhSi + lOwuCsK + bAxcwLt + qMAgxML + HYJmFSS + uvkfelh + "");
    }

    //垃圾方法
    private void MuZZwJAE(char ctxxvert0, short awcworajhq1, double vuzwtdry2) {
        double vuzwtdry2a = vuzwtdry2;
        short awcworajhq1a = awcworajhq1;
        char ctxxvert0a = ctxxvert0;
    }

    //垃圾方法
    private void gpmQiaDa(short suzojrwswo0) {
        short suzojrwswo0a = suzojrwswo0;
        System.out.println("gpmQiaDa" + suzojrwswo0a + "gpmQiaDa" + HYJmFSS + qBkqRdp + qMAgxML + uvkfelh + xaeVepM + tSnJWPk + LvBGhSi + ySsnRuA + oMuDEtn + XKgdlJy + lOwuCsK + xPYItzA + FBNJsvG + DDDVQfP + bAxcwLt + "");
    }

    //垃圾方法
    private void TdKElaEt(int fvozfixhsf0) {
        int fvozfixhsf0a = fvozfixhsf0;
        TextUtils.isDigitsOnly("TdKElaEt" + fvozfixhsf0a + "TdKElaEt" + XKgdlJy + tSnJWPk + xaeVepM + LvBGhSi + oMuDEtn + HYJmFSS + FBNJsvG + lOwuCsK + qBkqRdp + bAxcwLt + uvkfelh + qMAgxML + DDDVQfP + ySsnRuA + xPYItzA + "");
    }

    //垃圾方法
    private void dnwgTUpH(double barwtiwxw0, int yvbrcghucv1, int dwtjxfk2) {
        int dwtjxfk2a = dwtjxfk2;
        int yvbrcghucv1a = yvbrcghucv1;
        double barwtiwxw0a = barwtiwxw0;
        new String("dnwgTUpH" + dwtjxfk2a + barwtiwxw0a + yvbrcghucv1a + "dnwgTUpH" + FBNJsvG + qMAgxML + XKgdlJy + uvkfelh + bAxcwLt + qBkqRdp + xaeVepM + xPYItzA + oMuDEtn + ySsnRuA + DDDVQfP + lOwuCsK + LvBGhSi + HYJmFSS + tSnJWPk + "");
    }

    //垃圾方法
    private void CYilAqLn(int hznuquqd0) {
        int hznuquqd0a = hznuquqd0;
        Log.i("CYilAqLn", "CYilAqLn" + hznuquqd0a + "CYilAqLn" + xaeVepM + FBNJsvG + XKgdlJy + HYJmFSS + ySsnRuA + uvkfelh + qMAgxML + DDDVQfP + lOwuCsK + oMuDEtn + LvBGhSi + qBkqRdp + xPYItzA + bAxcwLt + tSnJWPk + "");
    }

    public boolean equals(Object obj) {
        int hznuquqd0 = 51;
        int dwtjxfk2 = 87;
        int yvbrcghucv1 = 69;
        double barwtiwxw0 = 66.66;
        int fvozfixhsf0 = 44;
        short suzojrwswo0 = 58;
        double vuzwtdry2 = 67.67;
        short awcworajhq1 = 90;
        char ctxxvert0 = 17;
        boolean jnojywn4 = false;
        long zdmvmvnkh3 = 98L;
        double ruisavsth2 = 6.6;
        byte xdevkpjt1 = 59;
        short bgslrjfo0 = 93;
        double tvmhuuc2 = 64.64;
        long jvsbfay1 = 25L;
        short kxktwzceeu0 = 52;
        double jzcadtkg1 = 34.34;
        float vacanjfb0 = 95.95f;
        new StringReader("" + YLLyzOZ + IAXwIIS + hheieeQ + "");
        return super.equals(obj);
    }
}
