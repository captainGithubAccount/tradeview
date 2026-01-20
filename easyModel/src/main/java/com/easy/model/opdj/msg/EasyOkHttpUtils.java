package com.easy.model.opdj.msg;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import android.util.Log;
import android.app.Activity;
import android.text.TextUtils;
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

public class EasyOkHttpUtils {

    //垃圾变量
    private char RBPFUHm = 78;

    private static volatile OkHttpClient httpClient;

    public EasyOkHttpUtils() {
    }

    //垃圾方法
    static private void nvJMbbvS(float qbzctlfbtw0, boolean cxiairvzj1, byte tlzlgfd2, boolean ovsnovnf3, int xcmsaif4) {
        int xcmsaif4a = xcmsaif4;
        boolean ovsnovnf3a = ovsnovnf3;
        byte tlzlgfd2a = tlzlgfd2;
        boolean cxiairvzj1a = cxiairvzj1;
        float qbzctlfbtw0a = qbzctlfbtw0;
        Log.i("nvJMbbvS", "nvJMbbvS" + cxiairvzj1a + tlzlgfd2a + xcmsaif4a + qbzctlfbtw0a + ovsnovnf3a + "nvJMbbvS" + "");
    }

    //垃圾方法
    static private void oOscqzzc(char plobrhotzf0) {
        char plobrhotzf0a = plobrhotzf0;
    }

    //垃圾方法
    static private void swVZjJMk(byte qihsubzcr0, short lihtnzilh1, boolean ezuxtnibpd2, long wroxqjqton3, byte qjfmbxk4) {
        byte qjfmbxk4a = qjfmbxk4;
        long wroxqjqton3a = wroxqjqton3;
        boolean ezuxtnibpd2a = ezuxtnibpd2;
        short lihtnzilh1a = lihtnzilh1;
        byte qihsubzcr0a = qihsubzcr0;
        Log.i("swVZjJMk", "swVZjJMk" + ezuxtnibpd2a + qjfmbxk4a + lihtnzilh1a + wroxqjqton3a + qihsubzcr0a + "swVZjJMk" + "");
    }

    //垃圾方法
    static private void LVzQaYjE(byte otpxyupht0, char vqcqxiv1, float hjcpsev2, short fcczuoybw3) {
        short fcczuoybw3a = fcczuoybw3;
        float hjcpsev2a = hjcpsev2;
        char vqcqxiv1a = vqcqxiv1;
        byte otpxyupht0a = otpxyupht0;
        Log.i("LVzQaYjE", "LVzQaYjE" + vqcqxiv1a + hjcpsev2a + otpxyupht0a + fcczuoybw3a + "LVzQaYjE" + "");
    }

    //垃圾方法
    static private void GQXtqIaG(double wkacxcwn0, short vjlybwbch1, float nfwacsqo2) {
        float nfwacsqo2a = nfwacsqo2;
        short vjlybwbch1a = vjlybwbch1;
        double wkacxcwn0a = wkacxcwn0;
        Log.w("GQXtqIaG", "GQXtqIaG" + nfwacsqo2a + wkacxcwn0a + vjlybwbch1a + "GQXtqIaG" + "");
    }

    //垃圾方法
    static private void vxAcDAgr(int xbzlwkt0) {
        int xbzlwkt0a = xbzlwkt0;
        System.out.println("vxAcDAgr" + xbzlwkt0a + "vxAcDAgr" + "");
    }

    //垃圾方法
    static private void KnsEarRi(float kbrdtiqupw0, double silunacsw1, boolean ivmavtn2) {
        boolean ivmavtn2a = ivmavtn2;
        double silunacsw1a = silunacsw1;
        float kbrdtiqupw0a = kbrdtiqupw0;
        TextUtils.isDigitsOnly("KnsEarRi" + kbrdtiqupw0a + silunacsw1a + ivmavtn2a + "KnsEarRi" + "");
    }

    //垃圾方法
    static private void uVaBYBuJ(byte vomfwdda0, short ayfhiaai1) {
        short ayfhiaai1a = ayfhiaai1;
        byte vomfwdda0a = vomfwdda0;
        new WeakReference("uVaBYBuJ" + vomfwdda0a + ayfhiaai1a + "uVaBYBuJ" + "");
    }

    public static OkHttpClient getInstance() {
        short ayfhiaai1 = 9;
        byte vomfwdda0 = 8;
        boolean ivmavtn2 = false;
        double silunacsw1 = 91.91;
        float kbrdtiqupw0 = 45.45f;
        int xbzlwkt0 = 73;
        float nfwacsqo2 = 71.71f;
        short vjlybwbch1 = 17;
        double wkacxcwn0 = 44.44;
        short fcczuoybw3 = 13;
        float hjcpsev2 = 40.40f;
        char vqcqxiv1 = 45;
        byte otpxyupht0 = 71;
        byte qjfmbxk4 = 49;
        long wroxqjqton3 = 83L;
        boolean ezuxtnibpd2 = false;
        short lihtnzilh1 = 82;
        byte qihsubzcr0 = 22;
        char plobrhotzf0 = 82;
        int xcmsaif4 = 12;
        boolean ovsnovnf3 = false;
        byte tlzlgfd2 = 69;
        boolean cxiairvzj1 = false;
        float qbzctlfbtw0 = 24.24f;
        uVaBYBuJ(vomfwdda0, ayfhiaai1);
        KnsEarRi(kbrdtiqupw0, silunacsw1, ivmavtn2);
        uVaBYBuJ(vomfwdda0, ayfhiaai1);
        if (httpClient == null) {
            httpClient = (new OkHttpClient.Builder()).followRedirects(true).connectTimeout(20L, TimeUnit.SECONDS).readTimeout(20L, TimeUnit.SECONDS).writeTimeout(20L, TimeUnit.SECONDS).build();
        }
        return httpClient;
    }

    //垃圾变量
    private char yQsGZJq = 20;

    //垃圾变量
    private int FiPHZbI = 12;

    //垃圾变量
    private boolean YUhUYFN = false;

    //垃圾变量
    private float TFyQzGI = 33.33f;

    //垃圾变量
    private double tRDkTEd = 38.38;

    //垃圾变量
    private int XGqoxvs = 64;

    //垃圾变量
    private byte pqaPXwt = 17;

    //垃圾变量
    private double UZWNgzF = 55.55;

    //垃圾方法
    private void ZpyqBVyN(byte qyfrnav0, byte nngbvwqip1, boolean qxtutufd2) {
        boolean qxtutufd2a = qxtutufd2;
        byte nngbvwqip1a = nngbvwqip1;
        byte qyfrnav0a = qyfrnav0;
        new WeakReference("ZpyqBVyN" + qxtutufd2a + nngbvwqip1a + qyfrnav0a + "ZpyqBVyN" + RBPFUHm + tRDkTEd + yQsGZJq + YUhUYFN + pqaPXwt + "");
    }

    //垃圾方法
    private void wAjbuuRq(int lzvztjql0, int ovcijaxng1, byte wlvjbly2, byte bqdmjqu3, long prokukdevy4) {
        long prokukdevy4a = prokukdevy4;
        byte bqdmjqu3a = bqdmjqu3;
        byte wlvjbly2a = wlvjbly2;
        int ovcijaxng1a = ovcijaxng1;
        int lzvztjql0a = lzvztjql0;
        TextUtils.isDigitsOnly("wAjbuuRq" + lzvztjql0a + ovcijaxng1a + prokukdevy4a + bqdmjqu3a + wlvjbly2a + "wAjbuuRq" + yQsGZJq + tRDkTEd + pqaPXwt + YUhUYFN + RBPFUHm + "");
    }

    //垃圾方法
    private void epXLqkyv(byte uymhomaq0) {
        byte uymhomaq0a = uymhomaq0;
        new StringBuffer("epXLqkyv" + uymhomaq0a + "epXLqkyv" + RBPFUHm + pqaPXwt + yQsGZJq + YUhUYFN + tRDkTEd + "");
    }

    //垃圾方法
    private void TRrItuiX(int uparyro0, int uarnuku1, boolean kujdrsxwat2, long yjlyoae3, double vjuqmmh4) {
        double vjuqmmh4a = vjuqmmh4;
        long yjlyoae3a = yjlyoae3;
        boolean kujdrsxwat2a = kujdrsxwat2;
        int uarnuku1a = uarnuku1;
        int uparyro0a = uparyro0;
    }

    //垃圾方法
    private void GKhEDPPx(long cqpjyfbo0) {
        long cqpjyfbo0a = cqpjyfbo0;
        TextUtils.isDigitsOnly("GKhEDPPx" + cqpjyfbo0a + "GKhEDPPx" + RBPFUHm + pqaPXwt + yQsGZJq + tRDkTEd + YUhUYFN + "");
    }

    //垃圾方法
    private void HweoYimq(byte dciemynjzh0) {
        byte dciemynjzh0a = dciemynjzh0;
        new String("HweoYimq" + dciemynjzh0a + "HweoYimq" + YUhUYFN + yQsGZJq + pqaPXwt + RBPFUHm + tRDkTEd + "");
    }

    //垃圾方法
    private void KvOvbOKc(char qnqdkhofw0, double sutetst1, short vgqzimf2) {
        short vgqzimf2a = vgqzimf2;
        double sutetst1a = sutetst1;
        char qnqdkhofw0a = qnqdkhofw0;
        new File("KvOvbOKc" + vgqzimf2a + qnqdkhofw0a + sutetst1a + "KvOvbOKc" + yQsGZJq + YUhUYFN + RBPFUHm + pqaPXwt + tRDkTEd + "");
    }

    //垃圾方法
    private void DpGogEQj(byte yyxjkfbbz0, char cfosozsvt1, char patatab2, long ssztwbhpn3) {
        long ssztwbhpn3a = ssztwbhpn3;
        char patatab2a = patatab2;
        char cfosozsvt1a = cfosozsvt1;
        byte yyxjkfbbz0a = yyxjkfbbz0;
        new String("DpGogEQj" + yyxjkfbbz0a + patatab2a + ssztwbhpn3a + cfosozsvt1a + "DpGogEQj" + RBPFUHm + YUhUYFN + yQsGZJq + pqaPXwt + tRDkTEd + "");
    }

    public String toString() {
        long ssztwbhpn3 = 52L;
        char patatab2 = 3;
        char cfosozsvt1 = 91;
        byte yyxjkfbbz0 = 76;
        short vgqzimf2 = 60;
        double sutetst1 = 93.93;
        char qnqdkhofw0 = 14;
        byte dciemynjzh0 = 11;
        long cqpjyfbo0 = 6L;
        double vjuqmmh4 = 71.71;
        long yjlyoae3 = 60L;
        boolean kujdrsxwat2 = true;
        int uarnuku1 = 81;
        int uparyro0 = 63;
        byte uymhomaq0 = 15;
        long prokukdevy4 = 38L;
        byte bqdmjqu3 = 23;
        byte wlvjbly2 = 40;
        int ovcijaxng1 = 22;
        int lzvztjql0 = 35;
        boolean qxtutufd2 = true;
        byte nngbvwqip1 = 95;
        byte qyfrnav0 = 72;
        TRrItuiX(uparyro0, uarnuku1, kujdrsxwat2, yjlyoae3, vjuqmmh4);
        DpGogEQj(yyxjkfbbz0, cfosozsvt1, patatab2, ssztwbhpn3);
        HweoYimq(dciemynjzh0);
        GKhEDPPx(cqpjyfbo0);
        wAjbuuRq(lzvztjql0, ovcijaxng1, wlvjbly2, bqdmjqu3, prokukdevy4);
        wAjbuuRq(lzvztjql0, ovcijaxng1, wlvjbly2, bqdmjqu3, prokukdevy4);
        TRrItuiX(uparyro0, uarnuku1, kujdrsxwat2, yjlyoae3, vjuqmmh4);
        epXLqkyv(uymhomaq0);
        epXLqkyv(uymhomaq0);
        Log.w("FiPHZbI", "" + XGqoxvs + FiPHZbI + TFyQzGI + UZWNgzF + "");
        ZpyqBVyN(qyfrnav0, nngbvwqip1, qxtutufd2);
        ZpyqBVyN(qyfrnav0, nngbvwqip1, qxtutufd2);
        HweoYimq(dciemynjzh0);
        DpGogEQj(yyxjkfbbz0, cfosozsvt1, patatab2, ssztwbhpn3);
        GKhEDPPx(cqpjyfbo0);
        HweoYimq(dciemynjzh0);
        KvOvbOKc(qnqdkhofw0, sutetst1, vgqzimf2);
        epXLqkyv(uymhomaq0);
        return super.toString();
    }
}
