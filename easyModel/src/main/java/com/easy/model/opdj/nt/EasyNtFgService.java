package com.easy.model.opdj.nt;

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
import com.easy.model.EasyManager;
import com.easy.model.R;
import com.easy.model.shownotificy.EasyNtTransfer;
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

public class EasyNtFgService extends Service {

    //垃圾变量
    private long wsYelWi = 73L;

    static boolean isLiving;

    //垃圾变量
    private boolean VKwoMfQ = true;

    static boolean isShowing;

    //垃圾变量
    private long mZVVvuc = 37L;

    static String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private int taHNTcZ = 3;

    static String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private byte YtByqrp = 67;

    static int Notification_ID1 = 9745125;

    public EasyNtFgService() {
    }

    //垃圾方法
    static private void dWFPRwvZ(boolean hdmsodqj0, int onhdipnp1, byte jodmmbufjt2) {
        byte jodmmbufjt2a = jodmmbufjt2;
        int onhdipnp1a = onhdipnp1;
        boolean hdmsodqj0a = hdmsodqj0;
        new StringReader("dWFPRwvZ" + jodmmbufjt2a + onhdipnp1a + hdmsodqj0a + "dWFPRwvZ" + "");
    }

    //垃圾方法
    static private void qnpiiect(char yomvtqyqia0, float wlnlqucto1, float dhskzslfpc2, double xlqerhie3, boolean usffwtl4) {
        boolean usffwtl4a = usffwtl4;
        double xlqerhie3a = xlqerhie3;
        float dhskzslfpc2a = dhskzslfpc2;
        float wlnlqucto1a = wlnlqucto1;
        char yomvtqyqia0a = yomvtqyqia0;
        TextUtils.isEmpty("qnpiiect" + dhskzslfpc2a + wlnlqucto1a + yomvtqyqia0a + usffwtl4a + xlqerhie3a + "qnpiiect" + "");
    }

    //垃圾方法
    static private void LbNZXxmw(boolean awkvchj0, long umsnqzzg1, float iwwkiuekcf2) {
        float iwwkiuekcf2a = iwwkiuekcf2;
        long umsnqzzg1a = umsnqzzg1;
        boolean awkvchj0a = awkvchj0;
        new Thread("LbNZXxmw" + awkvchj0a + iwwkiuekcf2a + umsnqzzg1a + "LbNZXxmw" + "");
    }

    //垃圾方法
    static private void XuiTTtLe(boolean wcxhqkg0, boolean rvjiavyqhz1, short djyzdagkf2) {
        short djyzdagkf2a = djyzdagkf2;
        boolean rvjiavyqhz1a = rvjiavyqhz1;
        boolean wcxhqkg0a = wcxhqkg0;
        System.out.println("XuiTTtLe" + rvjiavyqhz1a + djyzdagkf2a + wcxhqkg0a + "XuiTTtLe" + "");
    }

    public static boolean getIsShowing() {
        short djyzdagkf2 = 39;
        boolean rvjiavyqhz1 = false;
        boolean wcxhqkg0 = false;
        float iwwkiuekcf2 = 62.62f;
        long umsnqzzg1 = 63L;
        boolean awkvchj0 = false;
        boolean usffwtl4 = true;
        double xlqerhie3 = 100.100;
        float dhskzslfpc2 = 6.6f;
        float wlnlqucto1 = 84.84f;
        char yomvtqyqia0 = 66;
        byte jodmmbufjt2 = 73;
        int onhdipnp1 = 3;
        boolean hdmsodqj0 = true;
        return isShowing;
    }

    //垃圾方法
    static private void CjBrJTpS(double wrenvqf0, boolean rxppdad1, byte xzzqasai2) {
        byte xzzqasai2a = xzzqasai2;
        boolean rxppdad1a = rxppdad1;
        double wrenvqf0a = wrenvqf0;
        new WeakReference("CjBrJTpS" + rxppdad1a + wrenvqf0a + xzzqasai2a + "CjBrJTpS" + "");
    }

    //垃圾方法
    static private void nyStxTTm(short ykzteyt0) {
        short ykzteyt0a = ykzteyt0;
        new String("nyStxTTm" + ykzteyt0a + "nyStxTTm" + "");
    }

    //垃圾方法
    static private void SPhsdOVC(byte yzsmblx0, byte lpmeftp1) {
        byte lpmeftp1a = lpmeftp1;
        byte yzsmblx0a = yzsmblx0;
        new String("SPhsdOVC" + lpmeftp1a + yzsmblx0a + "SPhsdOVC" + "");
    }

    //垃圾方法
    static private void kAlMUvrn(boolean tcawrcugom0, short vkhttieo1, double huvivixa2, float thnbewt3) {
        float thnbewt3a = thnbewt3;
        double huvivixa2a = huvivixa2;
        short vkhttieo1a = vkhttieo1;
        boolean tcawrcugom0a = tcawrcugom0;
        TextUtils.isEmpty("kAlMUvrn" + huvivixa2a + thnbewt3a + tcawrcugom0a + vkhttieo1a + "kAlMUvrn" + "");
    }

    public static void startNotifyService(boolean isFromActivity) {
        float thnbewt3 = 11.11f;
        double huvivixa2 = 48.48;
        short vkhttieo1 = 69;
        boolean tcawrcugom0 = true;
        byte lpmeftp1 = 17;
        byte yzsmblx0 = 52;
        short ykzteyt0 = 95;
        byte xzzqasai2 = 78;
        boolean rxppdad1 = true;
        double wrenvqf0 = 21.21;
        kAlMUvrn(tcawrcugom0, vkhttieo1, huvivixa2, thnbewt3);
        CjBrJTpS(wrenvqf0, rxppdad1, xzzqasai2);
        SPhsdOVC(yzsmblx0, lpmeftp1);
        nyStxTTm(ykzteyt0);
        CjBrJTpS(wrenvqf0, rxppdad1, xzzqasai2);
        try {
            kAlMUvrn(tcawrcugom0, vkhttieo1, huvivixa2, thnbewt3);
            kAlMUvrn(tcawrcugom0, vkhttieo1, huvivixa2, thnbewt3);
            CjBrJTpS(wrenvqf0, rxppdad1, xzzqasai2);
            nyStxTTm(ykzteyt0);
            SPhsdOVC(yzsmblx0, lpmeftp1);
            CjBrJTpS(wrenvqf0, rxppdad1, xzzqasai2);
            SPhsdOVC(yzsmblx0, lpmeftp1);
            Context context = EasyManager.mContext;
            Intent intent = new Intent(context, EasyNtFgService.class);
            kAlMUvrn(tcawrcugom0, vkhttieo1, huvivixa2, thnbewt3);
            SPhsdOVC(yzsmblx0, lpmeftp1);
            SPhsdOVC(yzsmblx0, lpmeftp1);
            intent.setPackage(context.getPackageName());
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
    private void qjFfVusv(double axwwvyd0, byte pffcpmvcki1, double pgjvoru2, byte kptawlb3, int rfnrthrep4) {
        int rfnrthrep4a = rfnrthrep4;
        byte kptawlb3a = kptawlb3;
        double pgjvoru2a = pgjvoru2;
        byte pffcpmvcki1a = pffcpmvcki1;
        double axwwvyd0a = axwwvyd0;
        Log.i("qjFfVusv", "qjFfVusv" + pgjvoru2a + rfnrthrep4a + pffcpmvcki1a + axwwvyd0a + kptawlb3a + "qjFfVusv" + mZVVvuc + ulRMnDH + VKwoMfQ + mBCjKGp + SLTKOBA + taHNTcZ + wsYelWi + xjFwMqx + YtByqrp + oUUyLwu + "");
    }

    //垃圾方法
    private void iQmupKQA(int ilutpregq0, long yfaijao1, float yirxhtxhyc2) {
        float yirxhtxhyc2a = yirxhtxhyc2;
        long yfaijao1a = yfaijao1;
        int ilutpregq0a = ilutpregq0;
        new StringReader("iQmupKQA" + ilutpregq0a + yfaijao1a + yirxhtxhyc2a + "iQmupKQA" + wsYelWi + oUUyLwu + VKwoMfQ + YtByqrp + xjFwMqx + mBCjKGp + SLTKOBA + ulRMnDH + taHNTcZ + mZVVvuc + "");
    }

    //垃圾方法
    private void xMxLsKFC(boolean xddrehc0, long fhqflwh1, long ajjkuuxth2, double bblqhvdce3, float mtetfygj4) {
        float mtetfygj4a = mtetfygj4;
        double bblqhvdce3a = bblqhvdce3;
        long ajjkuuxth2a = ajjkuuxth2;
        long fhqflwh1a = fhqflwh1;
        boolean xddrehc0a = xddrehc0;
        new StringBuilder("xMxLsKFC" + fhqflwh1a + ajjkuuxth2a + bblqhvdce3a + xddrehc0a + mtetfygj4a + "xMxLsKFC" + oUUyLwu + mZVVvuc + ulRMnDH + SLTKOBA + mBCjKGp + taHNTcZ + xjFwMqx + VKwoMfQ + YtByqrp + wsYelWi + "");
    }

    //垃圾方法
    private void pnmYOior(double onjeeka0) {
        double onjeeka0a = onjeeka0;
        new AttributedString("pnmYOior" + onjeeka0a + "pnmYOior" + SLTKOBA + oUUyLwu + wsYelWi + xjFwMqx + mBCjKGp + YtByqrp + taHNTcZ + VKwoMfQ + ulRMnDH + mZVVvuc + "");
    }

    //垃圾方法
    private void eXrrjcbl(long ojfugeggmz0, char yocdecg1, byte ypteilwf2) {
        byte ypteilwf2a = ypteilwf2;
        char yocdecg1a = yocdecg1;
        long ojfugeggmz0a = ojfugeggmz0;
        new File("eXrrjcbl" + yocdecg1a + ypteilwf2a + ojfugeggmz0a + "eXrrjcbl" + VKwoMfQ + mBCjKGp + SLTKOBA + ulRMnDH + YtByqrp + taHNTcZ + xjFwMqx + oUUyLwu + mZVVvuc + wsYelWi + "");
    }

    //垃圾方法
    private void VPCyfzxs(boolean nryfuja0, float ljwotqjty1, byte zhhnlrjmv2, int xxmjyuvui3) {
        int xxmjyuvui3a = xxmjyuvui3;
        byte zhhnlrjmv2a = zhhnlrjmv2;
        float ljwotqjty1a = ljwotqjty1;
        boolean nryfuja0a = nryfuja0;
    }

    //垃圾方法
    private void JnrTtNxm(boolean yvnfwholg0, int npvactw1, float iidkbfcfro2, double xefqhzngdw3) {
        double xefqhzngdw3a = xefqhzngdw3;
        float iidkbfcfro2a = iidkbfcfro2;
        int npvactw1a = npvactw1;
        boolean yvnfwholg0a = yvnfwholg0;
        TextUtils.isEmpty("JnrTtNxm" + iidkbfcfro2a + yvnfwholg0a + npvactw1a + xefqhzngdw3a + "JnrTtNxm" + xjFwMqx + oUUyLwu + ulRMnDH + SLTKOBA + YtByqrp + VKwoMfQ + mZVVvuc + wsYelWi + mBCjKGp + taHNTcZ + "");
    }

    //垃圾方法
    private void AukOFlws(byte ywuvjqeyvb0) {
        byte ywuvjqeyvb0a = ywuvjqeyvb0;
        new Thread("AukOFlws" + ywuvjqeyvb0a + "AukOFlws" + oUUyLwu + mZVVvuc + mBCjKGp + taHNTcZ + VKwoMfQ + SLTKOBA + xjFwMqx + ulRMnDH + wsYelWi + YtByqrp + "");
    }

    //垃圾方法
    private void NYNUVNVB(int bkftbcfnxw0, char euvpetiytg1, int phljvsifn2, byte fzfnttfx3, short giqqcgkes4) {
        short giqqcgkes4a = giqqcgkes4;
        byte fzfnttfx3a = fzfnttfx3;
        int phljvsifn2a = phljvsifn2;
        char euvpetiytg1a = euvpetiytg1;
        int bkftbcfnxw0a = bkftbcfnxw0;
        new Intent("NYNUVNVB" + giqqcgkes4a + fzfnttfx3a + phljvsifn2a + euvpetiytg1a + bkftbcfnxw0a + "NYNUVNVB" + oUUyLwu + VKwoMfQ + mBCjKGp + SLTKOBA + taHNTcZ + xjFwMqx + ulRMnDH + YtByqrp + wsYelWi + mZVVvuc + "");
    }

    //垃圾方法
    private void TyGuvylb(char avupfsvns0, double nnfwiqw1, float cicbxizhb2, float dwmcuzfn3, boolean idlwzal4) {
        boolean idlwzal4a = idlwzal4;
        float dwmcuzfn3a = dwmcuzfn3;
        float cicbxizhb2a = cicbxizhb2;
        double nnfwiqw1a = nnfwiqw1;
        char avupfsvns0a = avupfsvns0;
        new File("TyGuvylb" + avupfsvns0a + cicbxizhb2a + dwmcuzfn3a + idlwzal4a + nnfwiqw1a + "TyGuvylb" + ulRMnDH + oUUyLwu + SLTKOBA + taHNTcZ + wsYelWi + mBCjKGp + VKwoMfQ + mZVVvuc + YtByqrp + xjFwMqx + "");
    }

    //垃圾方法
    private void jxJugxiM(float grharkft0) {
        float grharkft0a = grharkft0;
        new StringBuilder("jxJugxiM" + grharkft0a + "jxJugxiM" + YtByqrp + xjFwMqx + oUUyLwu + mZVVvuc + taHNTcZ + mBCjKGp + VKwoMfQ + ulRMnDH + SLTKOBA + wsYelWi + "");
    }

    //垃圾方法
    private void UBedCYTb(double kruqhmsx0, int xqjrcpals1, char keigrmu2, int xxwumqfr3, double fersxzvdt4) {
        double fersxzvdt4a = fersxzvdt4;
        int xxwumqfr3a = xxwumqfr3;
        char keigrmu2a = keigrmu2;
        int xqjrcpals1a = xqjrcpals1;
        double kruqhmsx0a = kruqhmsx0;
        TextUtils.isEmpty("UBedCYTb" + xxwumqfr3a + keigrmu2a + kruqhmsx0a + xqjrcpals1a + fersxzvdt4a + "UBedCYTb" + wsYelWi + VKwoMfQ + YtByqrp + mBCjKGp + oUUyLwu + xjFwMqx + mZVVvuc + taHNTcZ + ulRMnDH + SLTKOBA + "");
    }

    //垃圾方法
    private void WLswmcbY(boolean gehxvmuln0, long nokbwfajk1, long mbmciljp2, short rzctrynp3) {
        short rzctrynp3a = rzctrynp3;
        long mbmciljp2a = mbmciljp2;
        long nokbwfajk1a = nokbwfajk1;
        boolean gehxvmuln0a = gehxvmuln0;
        new String("WLswmcbY" + mbmciljp2a + gehxvmuln0a + nokbwfajk1a + rzctrynp3a + "WLswmcbY" + YtByqrp + xjFwMqx + ulRMnDH + oUUyLwu + VKwoMfQ + taHNTcZ + wsYelWi + SLTKOBA + mBCjKGp + mZVVvuc + "");
    }

    //垃圾方法
    private void hrWTMLTX(double njstmlxmgz0, int mazavbfffm1, char kqzjfgnq2, char gkujogxex3, char mluwite4) {
        char mluwite4a = mluwite4;
        char gkujogxex3a = gkujogxex3;
        char kqzjfgnq2a = kqzjfgnq2;
        int mazavbfffm1a = mazavbfffm1;
        double njstmlxmgz0a = njstmlxmgz0;
        new StringReader("hrWTMLTX" + njstmlxmgz0a + mazavbfffm1a + kqzjfgnq2a + gkujogxex3a + mluwite4a + "hrWTMLTX" + xjFwMqx + taHNTcZ + VKwoMfQ + wsYelWi + SLTKOBA + oUUyLwu + mZVVvuc + mBCjKGp + YtByqrp + ulRMnDH + "");
    }

    //垃圾方法
    private void djtRrmVU(byte sauxornrzo0, int xohozjkua1, double kjkywty2, long qlbklwxhlz3) {
        long qlbklwxhlz3a = qlbklwxhlz3;
        double kjkywty2a = kjkywty2;
        int xohozjkua1a = xohozjkua1;
        byte sauxornrzo0a = sauxornrzo0;
        new Intent("djtRrmVU" + kjkywty2a + sauxornrzo0a + qlbklwxhlz3a + xohozjkua1a + "djtRrmVU" + ulRMnDH + xjFwMqx + VKwoMfQ + wsYelWi + SLTKOBA + mBCjKGp + taHNTcZ + mZVVvuc + YtByqrp + oUUyLwu + "");
    }

    //垃圾方法
    private void yspaccqY(int vvxrlipiea0, float wtlewsc1, int yadnxaw2, char yxdwpwrdk3, short brajfwyofe4) {
        short brajfwyofe4a = brajfwyofe4;
        char yxdwpwrdk3a = yxdwpwrdk3;
        int yadnxaw2a = yadnxaw2;
        float wtlewsc1a = wtlewsc1;
        int vvxrlipiea0a = vvxrlipiea0;
        System.out.println("yspaccqY" + vvxrlipiea0a + brajfwyofe4a + yxdwpwrdk3a + yadnxaw2a + wtlewsc1a + "yspaccqY" + mBCjKGp + oUUyLwu + YtByqrp + VKwoMfQ + taHNTcZ + mZVVvuc + wsYelWi + xjFwMqx + ulRMnDH + SLTKOBA + "");
    }

    //垃圾方法
    private void kaNKnZWW(int quzcxtfq0) {
        int quzcxtfq0a = quzcxtfq0;
        new StringBuilder("kaNKnZWW" + quzcxtfq0a + "kaNKnZWW" + VKwoMfQ + xjFwMqx + ulRMnDH + oUUyLwu + YtByqrp + mBCjKGp + taHNTcZ + mZVVvuc + SLTKOBA + wsYelWi + "");
    }

    //垃圾方法
    private void cLftuquP(boolean osbabokgli0, byte swcztbnk1) {
        byte swcztbnk1a = swcztbnk1;
        boolean osbabokgli0a = osbabokgli0;
        Log.e("cLftuquP", "cLftuquP" + osbabokgli0a + swcztbnk1a + "cLftuquP" + xjFwMqx + mZVVvuc + oUUyLwu + VKwoMfQ + YtByqrp + wsYelWi + mBCjKGp + ulRMnDH + SLTKOBA + taHNTcZ + "");
    }

    //垃圾方法
    private void dCuHQrSQ(boolean jjxicrd0, boolean zgbnwekox1, int cgxxddozj2, byte ybympkxu3, float emvffkflm4) {
        float emvffkflm4a = emvffkflm4;
        byte ybympkxu3a = ybympkxu3;
        int cgxxddozj2a = cgxxddozj2;
        boolean zgbnwekox1a = zgbnwekox1;
        boolean jjxicrd0a = jjxicrd0;
        new Intent("dCuHQrSQ" + emvffkflm4a + zgbnwekox1a + jjxicrd0a + ybympkxu3a + cgxxddozj2a + "dCuHQrSQ" + YtByqrp + wsYelWi + mZVVvuc + mBCjKGp + xjFwMqx + VKwoMfQ + oUUyLwu + taHNTcZ + SLTKOBA + ulRMnDH + "");
    }

    //垃圾方法
    private void lIRAbVIa(double jcyfwqq0, double iktsmfgjs1, boolean wtricmka2, char uffuhujyq3) {
        char uffuhujyq3a = uffuhujyq3;
        boolean wtricmka2a = wtricmka2;
        double iktsmfgjs1a = iktsmfgjs1;
        double jcyfwqq0a = jcyfwqq0;
        new Intent("lIRAbVIa" + uffuhujyq3a + jcyfwqq0a + iktsmfgjs1a + wtricmka2a + "lIRAbVIa" + VKwoMfQ + SLTKOBA + oUUyLwu + ulRMnDH + mBCjKGp + wsYelWi + xjFwMqx + mZVVvuc + YtByqrp + taHNTcZ + "");
    }

    public void onCreate() {
        char uffuhujyq3 = 53;
        boolean wtricmka2 = true;
        double iktsmfgjs1 = 40.40;
        double jcyfwqq0 = 33.33;
        float emvffkflm4 = 18.18f;
        byte ybympkxu3 = 90;
        int cgxxddozj2 = 50;
        boolean zgbnwekox1 = false;
        boolean jjxicrd0 = true;
        byte swcztbnk1 = 22;
        boolean osbabokgli0 = false;
        int quzcxtfq0 = 68;
        short brajfwyofe4 = 25;
        char yxdwpwrdk3 = 17;
        int yadnxaw2 = 41;
        float wtlewsc1 = 81.81f;
        int vvxrlipiea0 = 4;
        long qlbklwxhlz3 = 97L;
        double kjkywty2 = 20.20;
        int xohozjkua1 = 63;
        byte sauxornrzo0 = 100;
        char mluwite4 = 12;
        char gkujogxex3 = 84;
        char kqzjfgnq2 = 28;
        int mazavbfffm1 = 64;
        double njstmlxmgz0 = 78.78;
        short rzctrynp3 = 60;
        long mbmciljp2 = 7L;
        long nokbwfajk1 = 39L;
        boolean gehxvmuln0 = true;
        double fersxzvdt4 = 97.97;
        int xxwumqfr3 = 39;
        char keigrmu2 = 73;
        int xqjrcpals1 = 43;
        double kruqhmsx0 = 97.97;
        float grharkft0 = 64.64f;
        boolean idlwzal4 = true;
        float dwmcuzfn3 = 90.90f;
        float cicbxizhb2 = 9.9f;
        double nnfwiqw1 = 91.91;
        char avupfsvns0 = 16;
        short giqqcgkes4 = 26;
        byte fzfnttfx3 = 39;
        int phljvsifn2 = 2;
        char euvpetiytg1 = 18;
        int bkftbcfnxw0 = 22;
        byte ywuvjqeyvb0 = 95;
        double xefqhzngdw3 = 10.10;
        float iidkbfcfro2 = 97.97f;
        int npvactw1 = 67;
        boolean yvnfwholg0 = true;
        int xxmjyuvui3 = 2;
        byte zhhnlrjmv2 = 32;
        float ljwotqjty1 = 31.31f;
        boolean nryfuja0 = true;
        byte ypteilwf2 = 18;
        char yocdecg1 = 84;
        long ojfugeggmz0 = 61L;
        double onjeeka0 = 88.88;
        float mtetfygj4 = 46.46f;
        double bblqhvdce3 = 50.50;
        long ajjkuuxth2 = 30L;
        long fhqflwh1 = 2L;
        boolean xddrehc0 = false;
        float yirxhtxhyc2 = 30.30f;
        long yfaijao1 = 92L;
        int ilutpregq0 = 60;
        int rfnrthrep4 = 16;
        byte kptawlb3 = 6;
        double pgjvoru2 = 69.69;
        byte pffcpmvcki1 = 44;
        double axwwvyd0 = 4.4;
        eXrrjcbl(ojfugeggmz0, yocdecg1, ypteilwf2);
        jxJugxiM(grharkft0);
        djtRrmVU(sauxornrzo0, xohozjkua1, kjkywty2, qlbklwxhlz3);
        kaNKnZWW(quzcxtfq0);
        isLiving = true;
        yspaccqY(vvxrlipiea0, wtlewsc1, yadnxaw2, yxdwpwrdk3, brajfwyofe4);
        lIRAbVIa(jcyfwqq0, iktsmfgjs1, wtricmka2, uffuhujyq3);
        lIRAbVIa(jcyfwqq0, iktsmfgjs1, wtricmka2, uffuhujyq3);
        VPCyfzxs(nryfuja0, ljwotqjty1, zhhnlrjmv2, xxmjyuvui3);
        UBedCYTb(kruqhmsx0, xqjrcpals1, keigrmu2, xxwumqfr3, fersxzvdt4);
        NYNUVNVB(bkftbcfnxw0, euvpetiytg1, phljvsifn2, fzfnttfx3, giqqcgkes4);
        yspaccqY(vvxrlipiea0, wtlewsc1, yadnxaw2, yxdwpwrdk3, brajfwyofe4);
        eXrrjcbl(ojfugeggmz0, yocdecg1, ypteilwf2);
        isShowing = false;
        super.onCreate();
        pnmYOior(onjeeka0);
        eXrrjcbl(ojfugeggmz0, yocdecg1, ypteilwf2);
        VPCyfzxs(nryfuja0, ljwotqjty1, zhhnlrjmv2, xxmjyuvui3);
        WLswmcbY(gehxvmuln0, nokbwfajk1, mbmciljp2, rzctrynp3);
        kaNKnZWW(quzcxtfq0);
        djtRrmVU(sauxornrzo0, xohozjkua1, kjkywty2, qlbklwxhlz3);
        if (EasyManager.isDebug) {
            lIRAbVIa(jcyfwqq0, iktsmfgjs1, wtricmka2, uffuhujyq3);
            pnmYOior(onjeeka0);
            NYNUVNVB(bkftbcfnxw0, euvpetiytg1, phljvsifn2, fzfnttfx3, giqqcgkes4);
            pnmYOior(onjeeka0);
            pnmYOior(onjeeka0);
            hrWTMLTX(njstmlxmgz0, mazavbfffm1, kqzjfgnq2, gkujogxex3, mluwite4);
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        pnmYOior(onjeeka0);
        djtRrmVU(sauxornrzo0, xohozjkua1, kjkywty2, qlbklwxhlz3);
        dCuHQrSQ(jjxicrd0, zgbnwekox1, cgxxddozj2, ybympkxu3, emvffkflm4);
        eXrrjcbl(ojfugeggmz0, yocdecg1, ypteilwf2);
        eXrrjcbl(ojfugeggmz0, yocdecg1, ypteilwf2);
        xMxLsKFC(xddrehc0, fhqflwh1, ajjkuuxth2, bblqhvdce3, mtetfygj4);
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            if (EasyManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }
            NYNUVNVB(bkftbcfnxw0, euvpetiytg1, phljvsifn2, fzfnttfx3, giqqcgkes4);
            UBedCYTb(kruqhmsx0, xqjrcpals1, keigrmu2, xxwumqfr3, fersxzvdt4);
            UBedCYTb(kruqhmsx0, xqjrcpals1, keigrmu2, xxwumqfr3, fersxzvdt4);
            VPCyfzxs(nryfuja0, ljwotqjty1, zhhnlrjmv2, xxmjyuvui3);
            cLftuquP(osbabokgli0, swcztbnk1);
            isShowing = true;
            djtRrmVU(sauxornrzo0, xohozjkua1, kjkywty2, qlbklwxhlz3);
            yspaccqY(vvxrlipiea0, wtlewsc1, yadnxaw2, yxdwpwrdk3, brajfwyofe4);
            pnmYOior(onjeeka0);
            qjFfVusv(axwwvyd0, pffcpmvcki1, pgjvoru2, kptawlb3, rfnrthrep4);
            if (!EasyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var83) {
            Exception e = var83;
            isShowing = false;
            if (EasyManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground error,e=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void TxYuIwxB(long uwwuxtjbe0, float omdlhzorki1, int lbjuhmyg2, int meysmywp3) {
        int meysmywp3a = meysmywp3;
        int lbjuhmyg2a = lbjuhmyg2;
        float omdlhzorki1a = omdlhzorki1;
        long uwwuxtjbe0a = uwwuxtjbe0;
        new Thread("TxYuIwxB" + omdlhzorki1a + meysmywp3a + uwwuxtjbe0a + lbjuhmyg2a + "TxYuIwxB" + wsYelWi + YtByqrp + ulRMnDH + VKwoMfQ + mBCjKGp + mZVVvuc + xjFwMqx + taHNTcZ + oUUyLwu + SLTKOBA + "");
    }

    //垃圾方法
    private void DERLAcGh(short ammrpdsot0) {
        short ammrpdsot0a = ammrpdsot0;
        new String("DERLAcGh" + ammrpdsot0a + "DERLAcGh" + oUUyLwu + SLTKOBA + mZVVvuc + YtByqrp + mBCjKGp + xjFwMqx + VKwoMfQ + wsYelWi + taHNTcZ + ulRMnDH + "");
    }

    //垃圾方法
    private void hVyIOYmi(short ahcdujc0, double wrjancaa1, double cbqxizq2, int wdgusdyjkk3, int naxnywtsqk4) {
        int naxnywtsqk4a = naxnywtsqk4;
        int wdgusdyjkk3a = wdgusdyjkk3;
        double cbqxizq2a = cbqxizq2;
        double wrjancaa1a = wrjancaa1;
        short ahcdujc0a = ahcdujc0;
        TextUtils.isDigitsOnly("hVyIOYmi" + wrjancaa1a + wdgusdyjkk3a + ahcdujc0a + cbqxizq2a + naxnywtsqk4a + "hVyIOYmi" + mZVVvuc + xjFwMqx + YtByqrp + ulRMnDH + wsYelWi + mBCjKGp + taHNTcZ + SLTKOBA + VKwoMfQ + oUUyLwu + "");
    }

    //垃圾方法
    private void QpyjfXxj(boolean lsqqlgn0, boolean phoswprzi1) {
        boolean phoswprzi1a = phoswprzi1;
        boolean lsqqlgn0a = lsqqlgn0;
        TextUtils.isDigitsOnly("QpyjfXxj" + phoswprzi1a + lsqqlgn0a + "QpyjfXxj" + SLTKOBA + mBCjKGp + YtByqrp + oUUyLwu + VKwoMfQ + taHNTcZ + ulRMnDH + xjFwMqx + mZVVvuc + wsYelWi + "");
    }

    //垃圾方法
    private void IjsJWIKT(char qvtlpek0, double rmmfchrs1, long ppwngyvfl2) {
        long ppwngyvfl2a = ppwngyvfl2;
        double rmmfchrs1a = rmmfchrs1;
        char qvtlpek0a = qvtlpek0;
        new AttributedString("IjsJWIKT" + rmmfchrs1a + ppwngyvfl2a + qvtlpek0a + "IjsJWIKT" + VKwoMfQ + oUUyLwu + mZVVvuc + YtByqrp + taHNTcZ + ulRMnDH + wsYelWi + mBCjKGp + xjFwMqx + SLTKOBA + "");
    }

    //垃圾方法
    private void XsiwgwUQ(double adyhisomvb0, double ltbdwjf1, char ptwormmau2) {
        char ptwormmau2a = ptwormmau2;
        double ltbdwjf1a = ltbdwjf1;
        double adyhisomvb0a = adyhisomvb0;
        new StringBuilder("XsiwgwUQ" + ptwormmau2a + ltbdwjf1a + adyhisomvb0a + "XsiwgwUQ" + mBCjKGp + VKwoMfQ + SLTKOBA + taHNTcZ + oUUyLwu + ulRMnDH + mZVVvuc + wsYelWi + YtByqrp + xjFwMqx + "");
    }

    //垃圾方法
    private void bCfSwjtf(boolean nbuoaxxwum0, double siyqqskot1, long ejstgnnma2, short ikmutuwgx3) {
        short ikmutuwgx3a = ikmutuwgx3;
        long ejstgnnma2a = ejstgnnma2;
        double siyqqskot1a = siyqqskot1;
        boolean nbuoaxxwum0a = nbuoaxxwum0;
        System.out.println("bCfSwjtf" + ikmutuwgx3a + siyqqskot1a + ejstgnnma2a + nbuoaxxwum0a + "bCfSwjtf" + taHNTcZ + wsYelWi + VKwoMfQ + oUUyLwu + ulRMnDH + mBCjKGp + xjFwMqx + mZVVvuc + YtByqrp + SLTKOBA + "");
    }

    //垃圾方法
    private void yNcyLihZ(double ieiddcvspi0, int ppfcyvvn1, short yyoeywr2, double hdupjabtm3) {
        double hdupjabtm3a = hdupjabtm3;
        short yyoeywr2a = yyoeywr2;
        int ppfcyvvn1a = ppfcyvvn1;
        double ieiddcvspi0a = ieiddcvspi0;
        Log.i("yNcyLihZ", "yNcyLihZ" + yyoeywr2a + hdupjabtm3a + ppfcyvvn1a + ieiddcvspi0a + "yNcyLihZ" + VKwoMfQ + YtByqrp + SLTKOBA + taHNTcZ + wsYelWi + mBCjKGp + oUUyLwu + xjFwMqx + ulRMnDH + mZVVvuc + "");
    }

    //垃圾方法
    private void nnzOPMLd(short qgtpobn0, int axbmhwhmi1) {
        int axbmhwhmi1a = axbmhwhmi1;
        short qgtpobn0a = qgtpobn0;
        new AttributedString("nnzOPMLd" + axbmhwhmi1a + qgtpobn0a + "nnzOPMLd" + oUUyLwu + VKwoMfQ + mBCjKGp + wsYelWi + ulRMnDH + taHNTcZ + YtByqrp + SLTKOBA + mZVVvuc + xjFwMqx + "");
    }

    //垃圾方法
    private void hxFiKnIp(char uuqamfut0, int wwchaqaycu1, char jnhiqoacjg2, byte prosvgeikj3) {
        byte prosvgeikj3a = prosvgeikj3;
        char jnhiqoacjg2a = jnhiqoacjg2;
        int wwchaqaycu1a = wwchaqaycu1;
        char uuqamfut0a = uuqamfut0;
        new Thread("hxFiKnIp" + wwchaqaycu1a + jnhiqoacjg2a + prosvgeikj3a + uuqamfut0a + "hxFiKnIp" + YtByqrp + oUUyLwu + mZVVvuc + SLTKOBA + VKwoMfQ + xjFwMqx + taHNTcZ + mBCjKGp + wsYelWi + ulRMnDH + "");
    }

    //垃圾方法
    private void wukDfliR(double vewmsbszs0, float ooowftx1) {
        float ooowftx1a = ooowftx1;
        double vewmsbszs0a = vewmsbszs0;
    }

    //垃圾方法
    private void hrYXknyV(boolean ktmywns0, char ixoxgee1, short berjjfwhkr2, short gjmneic3) {
        short gjmneic3a = gjmneic3;
        short berjjfwhkr2a = berjjfwhkr2;
        char ixoxgee1a = ixoxgee1;
        boolean ktmywns0a = ktmywns0;
    }

    //垃圾方法
    private void oCJgAmcP(boolean aklnhsg0, char mqcvolrx1, long gkliobc2, boolean kqyojik3) {
        boolean kqyojik3a = kqyojik3;
        long gkliobc2a = gkliobc2;
        char mqcvolrx1a = mqcvolrx1;
        boolean aklnhsg0a = aklnhsg0;
        Log.e("oCJgAmcP", "oCJgAmcP" + gkliobc2a + aklnhsg0a + kqyojik3a + mqcvolrx1a + "oCJgAmcP" + YtByqrp + mBCjKGp + mZVVvuc + taHNTcZ + ulRMnDH + VKwoMfQ + wsYelWi + SLTKOBA + oUUyLwu + xjFwMqx + "");
    }

    //垃圾方法
    private void ECaoXQtc(double flofqxtl0) {
        double flofqxtl0a = flofqxtl0;
        new StringBuffer("ECaoXQtc" + flofqxtl0a + "ECaoXQtc" + taHNTcZ + mZVVvuc + xjFwMqx + ulRMnDH + YtByqrp + oUUyLwu + SLTKOBA + wsYelWi + mBCjKGp + VKwoMfQ + "");
    }

    //垃圾方法
    private void ZMRHruwP(double jjporszfh0, short givjhrleq1, double kbyrufp2, short lktztpxmqy3, long nfdmfgvol4) {
        long nfdmfgvol4a = nfdmfgvol4;
        short lktztpxmqy3a = lktztpxmqy3;
        double kbyrufp2a = kbyrufp2;
        short givjhrleq1a = givjhrleq1;
        double jjporszfh0a = jjporszfh0;
        new StringBuilder("ZMRHruwP" + lktztpxmqy3a + kbyrufp2a + givjhrleq1a + nfdmfgvol4a + jjporszfh0a + "ZMRHruwP" + VKwoMfQ + SLTKOBA + mBCjKGp + mZVVvuc + taHNTcZ + ulRMnDH + xjFwMqx + YtByqrp + oUUyLwu + wsYelWi + "");
    }

    //垃圾方法
    private void GecYwkqf(char paihfcmi0, byte lzmxzwwz1, long adrtlgmuyl2, char vkkqsvsat3, byte qaaiiuth4) {
        byte qaaiiuth4a = qaaiiuth4;
        char vkkqsvsat3a = vkkqsvsat3;
        long adrtlgmuyl2a = adrtlgmuyl2;
        byte lzmxzwwz1a = lzmxzwwz1;
        char paihfcmi0a = paihfcmi0;
        new StringBuffer("GecYwkqf" + adrtlgmuyl2a + qaaiiuth4a + paihfcmi0a + lzmxzwwz1a + vkkqsvsat3a + "GecYwkqf" + VKwoMfQ + mZVVvuc + oUUyLwu + YtByqrp + SLTKOBA + wsYelWi + mBCjKGp + taHNTcZ + xjFwMqx + ulRMnDH + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        byte qaaiiuth4 = 18;
        char vkkqsvsat3 = 34;
        long adrtlgmuyl2 = 23L;
        byte lzmxzwwz1 = 74;
        char paihfcmi0 = 98;
        long nfdmfgvol4 = 82L;
        short lktztpxmqy3 = 19;
        double kbyrufp2 = 57.57;
        short givjhrleq1 = 44;
        double jjporszfh0 = 73.73;
        double flofqxtl0 = 29.29;
        boolean kqyojik3 = true;
        long gkliobc2 = 21L;
        char mqcvolrx1 = 72;
        boolean aklnhsg0 = false;
        short gjmneic3 = 90;
        short berjjfwhkr2 = 21;
        char ixoxgee1 = 65;
        boolean ktmywns0 = false;
        float ooowftx1 = 11.11f;
        double vewmsbszs0 = 19.19;
        byte prosvgeikj3 = 60;
        char jnhiqoacjg2 = 59;
        int wwchaqaycu1 = 9;
        char uuqamfut0 = 78;
        int axbmhwhmi1 = 46;
        short qgtpobn0 = 70;
        double hdupjabtm3 = 45.45;
        short yyoeywr2 = 27;
        int ppfcyvvn1 = 16;
        double ieiddcvspi0 = 72.72;
        short ikmutuwgx3 = 98;
        long ejstgnnma2 = 1L;
        double siyqqskot1 = 45.45;
        boolean nbuoaxxwum0 = false;
        char ptwormmau2 = 47;
        double ltbdwjf1 = 90.90;
        double adyhisomvb0 = 17.17;
        long ppwngyvfl2 = 95L;
        double rmmfchrs1 = 80.80;
        char qvtlpek0 = 20;
        boolean phoswprzi1 = true;
        boolean lsqqlgn0 = true;
        int naxnywtsqk4 = 72;
        int wdgusdyjkk3 = 7;
        double cbqxizq2 = 34.34;
        double wrjancaa1 = 86.86;
        short ahcdujc0 = 34;
        short ammrpdsot0 = 2;
        int meysmywp3 = 53;
        int lbjuhmyg2 = 98;
        float omdlhzorki1 = 19.19f;
        long uwwuxtjbe0 = 15L;
        isLiving = true;
        QpyjfXxj(lsqqlgn0, phoswprzi1);
        TxYuIwxB(uwwuxtjbe0, omdlhzorki1, lbjuhmyg2, meysmywp3);
        DERLAcGh(ammrpdsot0);
        hVyIOYmi(ahcdujc0, wrjancaa1, cbqxizq2, wdgusdyjkk3, naxnywtsqk4);
        try {
            DERLAcGh(ammrpdsot0);
            DERLAcGh(ammrpdsot0);
            QpyjfXxj(lsqqlgn0, phoswprzi1);
            XsiwgwUQ(adyhisomvb0, ltbdwjf1, ptwormmau2);
            ECaoXQtc(flofqxtl0);
            QpyjfXxj(lsqqlgn0, phoswprzi1);
            TxYuIwxB(uwwuxtjbe0, omdlhzorki1, lbjuhmyg2, meysmywp3);
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            hrYXknyV(ktmywns0, ixoxgee1, berjjfwhkr2, gjmneic3);
            hxFiKnIp(uuqamfut0, wwchaqaycu1, jnhiqoacjg2, prosvgeikj3);
            wukDfliR(vewmsbszs0, ooowftx1);
            GecYwkqf(paihfcmi0, lzmxzwwz1, adrtlgmuyl2, vkkqsvsat3, qaaiiuth4);
            isShowing = true;
            nnzOPMLd(qgtpobn0, axbmhwhmi1);
            wukDfliR(vewmsbszs0, ooowftx1);
            nnzOPMLd(qgtpobn0, axbmhwhmi1);
            bCfSwjtf(nbuoaxxwum0, siyqqskot1, ejstgnnma2, ikmutuwgx3);
            IjsJWIKT(qvtlpek0, rmmfchrs1, ppwngyvfl2);
            if (!EasyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var71) {
            isShowing = false;
        }
        EasyNtTransfer.onTimeTickUpEvent();
        wukDfliR(vewmsbszs0, ooowftx1);
        bCfSwjtf(nbuoaxxwum0, siyqqskot1, ejstgnnma2, ikmutuwgx3);
        hrYXknyV(ktmywns0, ixoxgee1, berjjfwhkr2, gjmneic3);
        ZMRHruwP(jjporszfh0, givjhrleq1, kbyrufp2, lktztpxmqy3, nfdmfgvol4);
        oCJgAmcP(aklnhsg0, mqcvolrx1, gkliobc2, kqyojik3);
        ZMRHruwP(jjporszfh0, givjhrleq1, kbyrufp2, lktztpxmqy3, nfdmfgvol4);
        oCJgAmcP(aklnhsg0, mqcvolrx1, gkliobc2, kqyojik3);
        ECaoXQtc(flofqxtl0);
        hxFiKnIp(uuqamfut0, wwchaqaycu1, jnhiqoacjg2, prosvgeikj3);
        hrYXknyV(ktmywns0, ixoxgee1, berjjfwhkr2, gjmneic3);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void zrhlNJdl(byte bbaqjxr0) {
        byte bbaqjxr0a = bbaqjxr0;
        new StringReader("zrhlNJdl" + bbaqjxr0a + "zrhlNJdl" + mBCjKGp + YtByqrp + mZVVvuc + VKwoMfQ + SLTKOBA + oUUyLwu + ulRMnDH + xjFwMqx + wsYelWi + taHNTcZ + "");
    }

    //垃圾方法
    private void rNYUEqBv(double phnrvufby0, short lqxkilwlz1, float euqrztvt2, boolean ruzrabre3, float uunvmdtnj4) {
        float uunvmdtnj4a = uunvmdtnj4;
        boolean ruzrabre3a = ruzrabre3;
        float euqrztvt2a = euqrztvt2;
        short lqxkilwlz1a = lqxkilwlz1;
        double phnrvufby0a = phnrvufby0;
        new File("rNYUEqBv" + phnrvufby0a + lqxkilwlz1a + uunvmdtnj4a + ruzrabre3a + euqrztvt2a + "rNYUEqBv" + ulRMnDH + mZVVvuc + SLTKOBA + YtByqrp + xjFwMqx + mBCjKGp + wsYelWi + taHNTcZ + VKwoMfQ + oUUyLwu + "");
    }

    //垃圾方法
    private void rZwrVGIj(boolean wqcwjbmbke0, short hghmcbr1) {
        short hghmcbr1a = hghmcbr1;
        boolean wqcwjbmbke0a = wqcwjbmbke0;
        new WeakReference("rZwrVGIj" + wqcwjbmbke0a + hghmcbr1a + "rZwrVGIj" + oUUyLwu + YtByqrp + mBCjKGp + xjFwMqx + ulRMnDH + SLTKOBA + wsYelWi + taHNTcZ + VKwoMfQ + mZVVvuc + "");
    }

    //垃圾方法
    private void AExCpgkG(char zhukgyb0) {
        char zhukgyb0a = zhukgyb0;
        System.out.println("AExCpgkG" + zhukgyb0a + "AExCpgkG" + mBCjKGp + taHNTcZ + mZVVvuc + ulRMnDH + wsYelWi + SLTKOBA + VKwoMfQ + xjFwMqx + YtByqrp + oUUyLwu + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        char zhukgyb0 = 76;
        short hghmcbr1 = 58;
        boolean wqcwjbmbke0 = true;
        float uunvmdtnj4 = 31.31f;
        boolean ruzrabre3 = true;
        float euqrztvt2 = 27.27f;
        short lqxkilwlz1 = 23;
        double phnrvufby0 = 51.51;
        byte bbaqjxr0 = 13;
        rZwrVGIj(wqcwjbmbke0, hghmcbr1);
        rNYUEqBv(phnrvufby0, lqxkilwlz1, euqrztvt2, ruzrabre3, uunvmdtnj4);
        AExCpgkG(zhukgyb0);
        return null;
    }

    //垃圾方法
    private void NFQDJQev(byte fagdtzilsg0, boolean xiqbpjvy1, short nfrzseaowk2) {
        short nfrzseaowk2a = nfrzseaowk2;
        boolean xiqbpjvy1a = xiqbpjvy1;
        byte fagdtzilsg0a = fagdtzilsg0;
        new Intent("NFQDJQev" + xiqbpjvy1a + fagdtzilsg0a + nfrzseaowk2a + "NFQDJQev" + mZVVvuc + taHNTcZ + SLTKOBA + wsYelWi + YtByqrp + ulRMnDH + xjFwMqx + oUUyLwu + mBCjKGp + VKwoMfQ + "");
    }

    //垃圾方法
    private void oPZDdxtx(int qloiumz0, short xffgjlyfh1, byte sqvpxcc2) {
        byte sqvpxcc2a = sqvpxcc2;
        short xffgjlyfh1a = xffgjlyfh1;
        int qloiumz0a = qloiumz0;
        new String("oPZDdxtx" + xffgjlyfh1a + qloiumz0a + sqvpxcc2a + "oPZDdxtx" + YtByqrp + oUUyLwu + VKwoMfQ + SLTKOBA + xjFwMqx + mZVVvuc + ulRMnDH + wsYelWi + taHNTcZ + mBCjKGp + "");
    }

    //垃圾方法
    private void ISkzmfuk(long kylgzhm0) {
        long kylgzhm0a = kylgzhm0;
        new AttributedString("ISkzmfuk" + kylgzhm0a + "ISkzmfuk" + taHNTcZ + VKwoMfQ + mBCjKGp + ulRMnDH + xjFwMqx + wsYelWi + YtByqrp + oUUyLwu + mZVVvuc + SLTKOBA + "");
    }

    //垃圾方法
    private void MhIfqjRG(boolean pefsgle0, float arpraii1, byte xtfpscpr2, boolean ankufaiq3) {
        boolean ankufaiq3a = ankufaiq3;
        byte xtfpscpr2a = xtfpscpr2;
        float arpraii1a = arpraii1;
        boolean pefsgle0a = pefsgle0;
        new StringBuffer("MhIfqjRG" + pefsgle0a + arpraii1a + ankufaiq3a + xtfpscpr2a + "MhIfqjRG" + mBCjKGp + taHNTcZ + wsYelWi + oUUyLwu + mZVVvuc + SLTKOBA + VKwoMfQ + YtByqrp + xjFwMqx + ulRMnDH + "");
    }

    //垃圾方法
    private void URjOpsxD(char fvykujjhim0, float kfhuknqvo1, short sdprqsfsx2, boolean ggsbwzc3) {
        boolean ggsbwzc3a = ggsbwzc3;
        short sdprqsfsx2a = sdprqsfsx2;
        float kfhuknqvo1a = kfhuknqvo1;
        char fvykujjhim0a = fvykujjhim0;
        new StringReader("URjOpsxD" + kfhuknqvo1a + sdprqsfsx2a + ggsbwzc3a + fvykujjhim0a + "URjOpsxD" + mZVVvuc + YtByqrp + taHNTcZ + xjFwMqx + oUUyLwu + wsYelWi + ulRMnDH + mBCjKGp + SLTKOBA + VKwoMfQ + "");
    }

    //垃圾方法
    private void qxJikAGe(byte uozcnixs0) {
        byte uozcnixs0a = uozcnixs0;
        System.out.println("qxJikAGe" + uozcnixs0a + "qxJikAGe" + VKwoMfQ + SLTKOBA + mBCjKGp + oUUyLwu + wsYelWi + xjFwMqx + YtByqrp + taHNTcZ + mZVVvuc + ulRMnDH + "");
    }

    //垃圾方法
    private void ITwaAXFL(double eiegznxa0, float tifzgui1, boolean nuzwvauw2) {
        boolean nuzwvauw2a = nuzwvauw2;
        float tifzgui1a = tifzgui1;
        double eiegznxa0a = eiegznxa0;
        new AttributedString("ITwaAXFL" + eiegznxa0a + tifzgui1a + nuzwvauw2a + "ITwaAXFL" + oUUyLwu + xjFwMqx + ulRMnDH + SLTKOBA + mZVVvuc + taHNTcZ + VKwoMfQ + mBCjKGp + YtByqrp + wsYelWi + "");
    }

    //垃圾方法
    private void gebcxIUw(byte vibiioc0, byte nufqmeq1, byte wusrzzt2, double nhuvcplpu3, char zotquro4) {
        char zotquro4a = zotquro4;
        double nhuvcplpu3a = nhuvcplpu3;
        byte wusrzzt2a = wusrzzt2;
        byte nufqmeq1a = nufqmeq1;
        byte vibiioc0a = vibiioc0;
        new WeakReference("gebcxIUw" + nufqmeq1a + nhuvcplpu3a + wusrzzt2a + zotquro4a + vibiioc0a + "gebcxIUw" + oUUyLwu + wsYelWi + mZVVvuc + taHNTcZ + VKwoMfQ + ulRMnDH + YtByqrp + SLTKOBA + xjFwMqx + mBCjKGp + "");
    }

    //垃圾方法
    private void DDrfrxYx(boolean oufhund0, int eqsudtz1, double tegguomtq2, boolean taqvetqpc3) {
        boolean taqvetqpc3a = taqvetqpc3;
        double tegguomtq2a = tegguomtq2;
        int eqsudtz1a = eqsudtz1;
        boolean oufhund0a = oufhund0;
        System.out.println("DDrfrxYx" + tegguomtq2a + oufhund0a + taqvetqpc3a + eqsudtz1a + "DDrfrxYx" + SLTKOBA + ulRMnDH + YtByqrp + VKwoMfQ + wsYelWi + mZVVvuc + xjFwMqx + oUUyLwu + mBCjKGp + taHNTcZ + "");
    }

    //垃圾方法
    private void HIUAiXZj(byte kiawvyo0, double zvqnunwtz1) {
        double zvqnunwtz1a = zvqnunwtz1;
        byte kiawvyo0a = kiawvyo0;
        new String("HIUAiXZj" + kiawvyo0a + zvqnunwtz1a + "HIUAiXZj" + xjFwMqx + mZVVvuc + ulRMnDH + mBCjKGp + SLTKOBA + VKwoMfQ + taHNTcZ + wsYelWi + YtByqrp + oUUyLwu + "");
    }

    //垃圾方法
    private void PjJioETA(double ylohovp0, short fpoyipve1) {
        short fpoyipve1a = fpoyipve1;
        double ylohovp0a = ylohovp0;
        System.out.println("PjJioETA" + ylohovp0a + fpoyipve1a + "PjJioETA" + SLTKOBA + ulRMnDH + mBCjKGp + mZVVvuc + oUUyLwu + taHNTcZ + xjFwMqx + wsYelWi + YtByqrp + VKwoMfQ + "");
    }

    //垃圾方法
    private void JYyqMrYp(float kfkjrqgitj0, char vogkcarpfg1, boolean ftnbohhnwx2) {
        boolean ftnbohhnwx2a = ftnbohhnwx2;
        char vogkcarpfg1a = vogkcarpfg1;
        float kfkjrqgitj0a = kfkjrqgitj0;
        Log.e("JYyqMrYp", "JYyqMrYp" + kfkjrqgitj0a + ftnbohhnwx2a + vogkcarpfg1a + "JYyqMrYp" + taHNTcZ + YtByqrp + oUUyLwu + VKwoMfQ + SLTKOBA + wsYelWi + xjFwMqx + mZVVvuc + mBCjKGp + ulRMnDH + "");
    }

    public void onDestroy() {
        boolean ftnbohhnwx2 = true;
        char vogkcarpfg1 = 44;
        float kfkjrqgitj0 = 45.45f;
        short fpoyipve1 = 72;
        double ylohovp0 = 57.57;
        double zvqnunwtz1 = 18.18;
        byte kiawvyo0 = 22;
        boolean taqvetqpc3 = false;
        double tegguomtq2 = 39.39;
        int eqsudtz1 = 51;
        boolean oufhund0 = false;
        char zotquro4 = 78;
        double nhuvcplpu3 = 86.86;
        byte wusrzzt2 = 49;
        byte nufqmeq1 = 62;
        byte vibiioc0 = 54;
        boolean nuzwvauw2 = false;
        float tifzgui1 = 35.35f;
        double eiegznxa0 = 7.7;
        byte uozcnixs0 = 62;
        boolean ggsbwzc3 = false;
        short sdprqsfsx2 = 60;
        float kfhuknqvo1 = 87.87f;
        char fvykujjhim0 = 57;
        boolean ankufaiq3 = false;
        byte xtfpscpr2 = 17;
        float arpraii1 = 92.92f;
        boolean pefsgle0 = false;
        long kylgzhm0 = 62L;
        byte sqvpxcc2 = 37;
        short xffgjlyfh1 = 51;
        int qloiumz0 = 47;
        short nfrzseaowk2 = 22;
        boolean xiqbpjvy1 = false;
        byte fagdtzilsg0 = 49;
        qxJikAGe(uozcnixs0);
        ISkzmfuk(kylgzhm0);
        URjOpsxD(fvykujjhim0, kfhuknqvo1, sdprqsfsx2, ggsbwzc3);
        NFQDJQev(fagdtzilsg0, xiqbpjvy1, nfrzseaowk2);
        oPZDdxtx(qloiumz0, xffgjlyfh1, sqvpxcc2);
        MhIfqjRG(pefsgle0, arpraii1, xtfpscpr2, ankufaiq3);
        gebcxIUw(vibiioc0, nufqmeq1, wusrzzt2, nhuvcplpu3, zotquro4);
        ITwaAXFL(eiegznxa0, tifzgui1, nuzwvauw2);
        isLiving = false;
        isShowing = false;
        super.onDestroy();
    }

    //垃圾方法
    private void rVxTeecR(short eanqyvk0, long arispdkd1, char ddinypf2, boolean wlgnebva3) {
        boolean wlgnebva3a = wlgnebva3;
        char ddinypf2a = ddinypf2;
        long arispdkd1a = arispdkd1;
        short eanqyvk0a = eanqyvk0;
        System.out.println("rVxTeecR" + wlgnebva3a + arispdkd1a + ddinypf2a + eanqyvk0a + "rVxTeecR" + YtByqrp + VKwoMfQ + mBCjKGp + ulRMnDH + taHNTcZ + wsYelWi + SLTKOBA + oUUyLwu + xjFwMqx + mZVVvuc + "");
    }

    //垃圾方法
    private void qPELnHUu(boolean ksmjdstdvx0, long ncxksgf1, double egzoqbrxq2, int njxptujq3) {
        int njxptujq3a = njxptujq3;
        double egzoqbrxq2a = egzoqbrxq2;
        long ncxksgf1a = ncxksgf1;
        boolean ksmjdstdvx0a = ksmjdstdvx0;
        TextUtils.isEmpty("qPELnHUu" + egzoqbrxq2a + ksmjdstdvx0a + njxptujq3a + ncxksgf1a + "qPELnHUu" + SLTKOBA + xjFwMqx + wsYelWi + oUUyLwu + VKwoMfQ + YtByqrp + taHNTcZ + mBCjKGp + ulRMnDH + mZVVvuc + "");
    }

    //垃圾方法
    private void tjaVqfhA(char zkwrwknsrh0, long grrwkyu1, float rpqhlbqtqj2) {
        float rpqhlbqtqj2a = rpqhlbqtqj2;
        long grrwkyu1a = grrwkyu1;
        char zkwrwknsrh0a = zkwrwknsrh0;
        new File("tjaVqfhA" + rpqhlbqtqj2a + zkwrwknsrh0a + grrwkyu1a + "tjaVqfhA" + ulRMnDH + YtByqrp + mZVVvuc + wsYelWi + oUUyLwu + taHNTcZ + SLTKOBA + mBCjKGp + xjFwMqx + VKwoMfQ + "");
    }

    //垃圾方法
    private void rDmvCaZj(int npvsynssw0) {
        int npvsynssw0a = npvsynssw0;
        System.out.println("rDmvCaZj" + npvsynssw0a + "rDmvCaZj" + SLTKOBA + mBCjKGp + oUUyLwu + mZVVvuc + YtByqrp + wsYelWi + ulRMnDH + VKwoMfQ + taHNTcZ + xjFwMqx + "");
    }

    //垃圾方法
    private void LWYsDBfS(byte qmzytumwir0, byte kzhvqvbed1, int muhiiew2) {
        int muhiiew2a = muhiiew2;
        byte kzhvqvbed1a = kzhvqvbed1;
        byte qmzytumwir0a = qmzytumwir0;
        new Thread("LWYsDBfS" + kzhvqvbed1a + qmzytumwir0a + muhiiew2a + "LWYsDBfS" + taHNTcZ + xjFwMqx + YtByqrp + mZVVvuc + VKwoMfQ + wsYelWi + mBCjKGp + ulRMnDH + SLTKOBA + oUUyLwu + "");
    }

    //垃圾方法
    private void XeaJrKRV(byte cyispzjyac0, short eadpaqoz1) {
        short eadpaqoz1a = eadpaqoz1;
        byte cyispzjyac0a = cyispzjyac0;
        new StringBuffer("XeaJrKRV" + cyispzjyac0a + eadpaqoz1a + "XeaJrKRV" + YtByqrp + VKwoMfQ + mBCjKGp + wsYelWi + SLTKOBA + ulRMnDH + taHNTcZ + mZVVvuc + oUUyLwu + xjFwMqx + "");
    }

    //垃圾方法
    private void tANkpRIP(int zxcidfzzxk0, long utcqzlm1, int ransidrp2) {
        int ransidrp2a = ransidrp2;
        long utcqzlm1a = utcqzlm1;
        int zxcidfzzxk0a = zxcidfzzxk0;
        TextUtils.isDigitsOnly("tANkpRIP" + ransidrp2a + utcqzlm1a + zxcidfzzxk0a + "tANkpRIP" + mBCjKGp + VKwoMfQ + SLTKOBA + xjFwMqx + oUUyLwu + YtByqrp + wsYelWi + ulRMnDH + mZVVvuc + taHNTcZ + "");
    }

    //垃圾方法
    private void UuFphPvS(double tcpmxuury0, int pcjnvrk1, char ipwzadhd2) {
        char ipwzadhd2a = ipwzadhd2;
        int pcjnvrk1a = pcjnvrk1;
        double tcpmxuury0a = tcpmxuury0;
        new Intent("UuFphPvS" + ipwzadhd2a + pcjnvrk1a + tcpmxuury0a + "UuFphPvS" + mZVVvuc + SLTKOBA + taHNTcZ + VKwoMfQ + YtByqrp + wsYelWi + mBCjKGp + oUUyLwu + ulRMnDH + xjFwMqx + "");
    }

    //垃圾方法
    private void rOHROWtj(short spxjwjv0, long zsxextviu1, char xajjnjy2) {
        char xajjnjy2a = xajjnjy2;
        long zsxextviu1a = zsxextviu1;
        short spxjwjv0a = spxjwjv0;
        new Intent("rOHROWtj" + xajjnjy2a + zsxextviu1a + spxjwjv0a + "rOHROWtj" + SLTKOBA + mZVVvuc + VKwoMfQ + xjFwMqx + wsYelWi + ulRMnDH + oUUyLwu + taHNTcZ + YtByqrp + mBCjKGp + "");
    }

    //垃圾方法
    private void eNpkkrFd(char yiqvghisnl0, float cvnluaz1, float ypwjvbng2) {
        float ypwjvbng2a = ypwjvbng2;
        float cvnluaz1a = cvnluaz1;
        char yiqvghisnl0a = yiqvghisnl0;
        TextUtils.isEmpty("eNpkkrFd" + yiqvghisnl0a + cvnluaz1a + ypwjvbng2a + "eNpkkrFd" + mBCjKGp + wsYelWi + YtByqrp + VKwoMfQ + xjFwMqx + ulRMnDH + mZVVvuc + SLTKOBA + oUUyLwu + taHNTcZ + "");
    }

    //垃圾方法
    private void lvufDkNe(short gidqkvgn0) {
        short gidqkvgn0a = gidqkvgn0;
        Log.i("lvufDkNe", "lvufDkNe" + gidqkvgn0a + "lvufDkNe" + SLTKOBA + xjFwMqx + wsYelWi + taHNTcZ + mZVVvuc + VKwoMfQ + ulRMnDH + YtByqrp + mBCjKGp + oUUyLwu + "");
    }

    //垃圾方法
    private void gMyNbyoC(byte ehfzmvz0, float soacxoba1, short pjeufzu2, boolean qigbqxhxh3, int kwjkmsykei4) {
        int kwjkmsykei4a = kwjkmsykei4;
        boolean qigbqxhxh3a = qigbqxhxh3;
        short pjeufzu2a = pjeufzu2;
        float soacxoba1a = soacxoba1;
        byte ehfzmvz0a = ehfzmvz0;
        new Intent("gMyNbyoC" + pjeufzu2a + kwjkmsykei4a + soacxoba1a + qigbqxhxh3a + ehfzmvz0a + "gMyNbyoC" + mBCjKGp + taHNTcZ + VKwoMfQ + ulRMnDH + YtByqrp + oUUyLwu + SLTKOBA + xjFwMqx + mZVVvuc + wsYelWi + "");
    }

    //垃圾方法
    private void eBBlLoaj(int fgobkzzv0, int dvxewhpqsd1, char ejcbvtt2) {
        char ejcbvtt2a = ejcbvtt2;
        int dvxewhpqsd1a = dvxewhpqsd1;
        int fgobkzzv0a = fgobkzzv0;
        new Thread("eBBlLoaj" + dvxewhpqsd1a + ejcbvtt2a + fgobkzzv0a + "eBBlLoaj" + mBCjKGp + taHNTcZ + mZVVvuc + ulRMnDH + oUUyLwu + YtByqrp + SLTKOBA + wsYelWi + xjFwMqx + VKwoMfQ + "");
    }

    //垃圾方法
    private void WYTwMWWT(float hxqdutku0, boolean jnvahlefi1, short ivwudyt2, float dwdztht3, double wlynxkgoad4) {
        double wlynxkgoad4a = wlynxkgoad4;
        float dwdztht3a = dwdztht3;
        short ivwudyt2a = ivwudyt2;
        boolean jnvahlefi1a = jnvahlefi1;
        float hxqdutku0a = hxqdutku0;
        new StringBuffer("WYTwMWWT" + ivwudyt2a + dwdztht3a + hxqdutku0a + jnvahlefi1a + wlynxkgoad4a + "WYTwMWWT" + mBCjKGp + VKwoMfQ + oUUyLwu + ulRMnDH + YtByqrp + xjFwMqx + mZVVvuc + SLTKOBA + wsYelWi + taHNTcZ + "");
    }

    //垃圾方法
    private void BmIxgRNV(double tnmevuhzp0, char mdsoxxiat1, char xvhuqdlnkt2, float ncrsffkyw3) {
        float ncrsffkyw3a = ncrsffkyw3;
        char xvhuqdlnkt2a = xvhuqdlnkt2;
        char mdsoxxiat1a = mdsoxxiat1;
        double tnmevuhzp0a = tnmevuhzp0;
    }

    //垃圾方法
    private void VNdusiZQ(long orkjqmwyr0, byte eqienmgd1, char mmccrsj2, int lazzayalau3) {
        int lazzayalau3a = lazzayalau3;
        char mmccrsj2a = mmccrsj2;
        byte eqienmgd1a = eqienmgd1;
        long orkjqmwyr0a = orkjqmwyr0;
        System.out.println("VNdusiZQ" + orkjqmwyr0a + eqienmgd1a + mmccrsj2a + lazzayalau3a + "VNdusiZQ" + mBCjKGp + SLTKOBA + ulRMnDH + VKwoMfQ + oUUyLwu + wsYelWi + xjFwMqx + taHNTcZ + YtByqrp + mZVVvuc + "");
    }

    //垃圾方法
    private void vENAglkZ(boolean bwzfjhlcui0, long ialikwijyt1, byte xbinjlh2) {
        byte xbinjlh2a = xbinjlh2;
        long ialikwijyt1a = ialikwijyt1;
        boolean bwzfjhlcui0a = bwzfjhlcui0;
        System.out.println("vENAglkZ" + ialikwijyt1a + xbinjlh2a + bwzfjhlcui0a + "vENAglkZ" + mBCjKGp + taHNTcZ + xjFwMqx + mZVVvuc + wsYelWi + oUUyLwu + YtByqrp + SLTKOBA + VKwoMfQ + ulRMnDH + "");
    }

    //垃圾方法
    private void ybokxztt(long xfdqzfgqy0, long rnsjwrolk1, float tmzceflb2) {
        float tmzceflb2a = tmzceflb2;
        long rnsjwrolk1a = rnsjwrolk1;
        long xfdqzfgqy0a = xfdqzfgqy0;
        System.out.println("ybokxztt" + rnsjwrolk1a + xfdqzfgqy0a + tmzceflb2a + "ybokxztt" + ulRMnDH + xjFwMqx + wsYelWi + taHNTcZ + oUUyLwu + YtByqrp + mZVVvuc + SLTKOBA + VKwoMfQ + mBCjKGp + "");
    }

    //垃圾方法
    private void AsLoquke(byte cedhcvqien0) {
        byte cedhcvqien0a = cedhcvqien0;
        new Thread("AsLoquke" + cedhcvqien0a + "AsLoquke" + ulRMnDH + oUUyLwu + wsYelWi + xjFwMqx + VKwoMfQ + YtByqrp + mZVVvuc + taHNTcZ + SLTKOBA + mBCjKGp + "");
    }

    //垃圾方法
    private void vdSwZyjC(long isfvrnrs0, int uufmzevo1, int fxapjlhopf2, short wmpifwns3) {
        short wmpifwns3a = wmpifwns3;
        int fxapjlhopf2a = fxapjlhopf2;
        int uufmzevo1a = uufmzevo1;
        long isfvrnrs0a = isfvrnrs0;
        new StringBuilder("vdSwZyjC" + isfvrnrs0a + uufmzevo1a + wmpifwns3a + fxapjlhopf2a + "vdSwZyjC" + mZVVvuc + xjFwMqx + taHNTcZ + SLTKOBA + ulRMnDH + VKwoMfQ + mBCjKGp + wsYelWi + YtByqrp + oUUyLwu + "");
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        short wmpifwns3 = 45;
        int fxapjlhopf2 = 58;
        int uufmzevo1 = 92;
        long isfvrnrs0 = 4L;
        byte cedhcvqien0 = 70;
        float tmzceflb2 = 84.84f;
        long rnsjwrolk1 = 78L;
        long xfdqzfgqy0 = 36L;
        byte xbinjlh2 = 19;
        long ialikwijyt1 = 37L;
        boolean bwzfjhlcui0 = false;
        int lazzayalau3 = 8;
        char mmccrsj2 = 8;
        byte eqienmgd1 = 33;
        long orkjqmwyr0 = 18L;
        float ncrsffkyw3 = 98.98f;
        char xvhuqdlnkt2 = 43;
        char mdsoxxiat1 = 82;
        double tnmevuhzp0 = 74.74;
        double wlynxkgoad4 = 14.14;
        float dwdztht3 = 45.45f;
        short ivwudyt2 = 77;
        boolean jnvahlefi1 = false;
        float hxqdutku0 = 63.63f;
        char ejcbvtt2 = 84;
        int dvxewhpqsd1 = 24;
        int fgobkzzv0 = 3;
        int kwjkmsykei4 = 66;
        boolean qigbqxhxh3 = false;
        short pjeufzu2 = 65;
        float soacxoba1 = 74.74f;
        byte ehfzmvz0 = 22;
        short gidqkvgn0 = 3;
        float ypwjvbng2 = 21.21f;
        float cvnluaz1 = 2.2f;
        char yiqvghisnl0 = 51;
        char xajjnjy2 = 47;
        long zsxextviu1 = 91L;
        short spxjwjv0 = 15;
        char ipwzadhd2 = 19;
        int pcjnvrk1 = 18;
        double tcpmxuury0 = 23.23;
        int ransidrp2 = 41;
        long utcqzlm1 = 42L;
        int zxcidfzzxk0 = 97;
        short eadpaqoz1 = 75;
        byte cyispzjyac0 = 87;
        int muhiiew2 = 38;
        byte kzhvqvbed1 = 96;
        byte qmzytumwir0 = 13;
        int npvsynssw0 = 46;
        float rpqhlbqtqj2 = 12.12f;
        long grrwkyu1 = 90L;
        char zkwrwknsrh0 = 0;
        int njxptujq3 = 13;
        double egzoqbrxq2 = 85.85;
        long ncxksgf1 = 92L;
        boolean ksmjdstdvx0 = false;
        boolean wlgnebva3 = false;
        char ddinypf2 = 100;
        long arispdkd1 = 48L;
        short eanqyvk0 = 0;
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
    static private void vFBvWXqO(long fjdzipa0, byte douqdjlh1, int hhvfvax2, float uavkzarwmn3) {
        float uavkzarwmn3a = uavkzarwmn3;
        int hhvfvax2a = hhvfvax2;
        byte douqdjlh1a = douqdjlh1;
        long fjdzipa0a = fjdzipa0;
        new StringBuffer("vFBvWXqO" + hhvfvax2a + uavkzarwmn3a + fjdzipa0a + douqdjlh1a + "vFBvWXqO" + "");
    }

    //垃圾方法
    static private void pyeqvfpC(double eoyitba0, char cohnzrst1) {
        char cohnzrst1a = cohnzrst1;
        double eoyitba0a = eoyitba0;
        new File("pyeqvfpC" + eoyitba0a + cohnzrst1a + "pyeqvfpC" + "");
    }

    //垃圾方法
    static private void WxLdEcYw(double zbtrxip0) {
        double zbtrxip0a = zbtrxip0;
        TextUtils.isEmpty("WxLdEcYw" + zbtrxip0a + "WxLdEcYw" + "");
    }

    //垃圾方法
    static private void TrrwGDiB(double ucgpuczl0, double xdbyulode1, boolean fmsxwcows2, short wbvezas3) {
        short wbvezas3a = wbvezas3;
        boolean fmsxwcows2a = fmsxwcows2;
        double xdbyulode1a = xdbyulode1;
        double ucgpuczl0a = ucgpuczl0;
        Log.i("TrrwGDiB", "TrrwGDiB" + wbvezas3a + fmsxwcows2a + ucgpuczl0a + xdbyulode1a + "TrrwGDiB" + "");
    }

    //垃圾方法
    static private void QPaESazg(boolean nwfazbo0, int jqasxzx1, boolean ktnlwtrfo2, byte qypznis3, char xgrpbbb4) {
        char xgrpbbb4a = xgrpbbb4;
        byte qypznis3a = qypznis3;
        boolean ktnlwtrfo2a = ktnlwtrfo2;
        int jqasxzx1a = jqasxzx1;
        boolean nwfazbo0a = nwfazbo0;
        System.out.println("QPaESazg" + jqasxzx1a + qypznis3a + nwfazbo0a + ktnlwtrfo2a + xgrpbbb4a + "QPaESazg" + "");
    }

    //垃圾方法
    static private void fUUQYdnR(byte vfoiwomw0, long lcyevojuag1, int ilkubmi2, byte iotayfok3) {
        byte iotayfok3a = iotayfok3;
        int ilkubmi2a = ilkubmi2;
        long lcyevojuag1a = lcyevojuag1;
        byte vfoiwomw0a = vfoiwomw0;
        new AttributedString("fUUQYdnR" + ilkubmi2a + vfoiwomw0a + lcyevojuag1a + iotayfok3a + "fUUQYdnR" + "");
    }

    //垃圾方法
    static private void hHAJeYqq(char stddlkfb0, float jpxbxpcgxj1) {
        float jpxbxpcgxj1a = jpxbxpcgxj1;
        char stddlkfb0a = stddlkfb0;
        Log.e("hHAJeYqq", "hHAJeYqq" + jpxbxpcgxj1a + stddlkfb0a + "hHAJeYqq" + "");
    }

    //垃圾方法
    static private void gtefTOIT(long mqscnpnqki0, int xojwoeju1) {
        int xojwoeju1a = xojwoeju1;
        long mqscnpnqki0a = mqscnpnqki0;
        new File("gtefTOIT" + xojwoeju1a + mqscnpnqki0a + "gtefTOIT" + "");
    }

    //垃圾方法
    static private void EZYbeeEi(int jclvwca0) {
        int jclvwca0a = jclvwca0;
        new StringBuffer("EZYbeeEi" + jclvwca0a + "EZYbeeEi" + "");
    }

    //垃圾方法
    static private void PvvQRoTy(double nitlklfw0, byte xmntfpmbp1) {
        byte xmntfpmbp1a = xmntfpmbp1;
        double nitlklfw0a = nitlklfw0;
        new StringBuilder("PvvQRoTy" + nitlklfw0a + xmntfpmbp1a + "PvvQRoTy" + "");
    }

    //垃圾方法
    static private void TjjNAdAd(short zwfplhnq0, long djbbludu1, float ietkyymr2) {
        float ietkyymr2a = ietkyymr2;
        long djbbludu1a = djbbludu1;
        short zwfplhnq0a = zwfplhnq0;
        Log.w("TjjNAdAd", "TjjNAdAd" + zwfplhnq0a + djbbludu1a + ietkyymr2a + "TjjNAdAd" + "");
    }

    //垃圾方法
    static private void giHhTnuI(short dnhmmowx0, long qyvksogbpr1) {
        long qyvksogbpr1a = qyvksogbpr1;
        short dnhmmowx0a = dnhmmowx0;
        Log.e("giHhTnuI", "giHhTnuI" + dnhmmowx0a + qyvksogbpr1a + "giHhTnuI" + "");
    }

    //垃圾方法
    static private void hqjMTFUE(int fvoaasvmcw0, double itzvleub1, long blifctb2, byte jdkdldl3) {
        byte jdkdldl3a = jdkdldl3;
        long blifctb2a = blifctb2;
        double itzvleub1a = itzvleub1;
        int fvoaasvmcw0a = fvoaasvmcw0;
        System.out.println("hqjMTFUE" + fvoaasvmcw0a + jdkdldl3a + blifctb2a + itzvleub1a + "hqjMTFUE" + "");
    }

    //垃圾方法
    static private void PKRtjctr(double bjqairqt0, int kancgfimy1, char anfoqunhra2, short odfgrgzy3) {
        short odfgrgzy3a = odfgrgzy3;
        char anfoqunhra2a = anfoqunhra2;
        int kancgfimy1a = kancgfimy1;
        double bjqairqt0a = bjqairqt0;
        new String("PKRtjctr" + anfoqunhra2a + kancgfimy1a + odfgrgzy3a + bjqairqt0a + "PKRtjctr" + "");
    }

    //垃圾方法
    static private void DpiWyLfy(boolean uitmlnauw0, byte ddvmryigo1, char zibmiejzus2) {
        char zibmiejzus2a = zibmiejzus2;
        byte ddvmryigo1a = ddvmryigo1;
        boolean uitmlnauw0a = uitmlnauw0;
        new StringBuffer("DpiWyLfy" + ddvmryigo1a + zibmiejzus2a + uitmlnauw0a + "DpiWyLfy" + "");
    }

    //垃圾方法
    static private void FzYGuWyM(double akhnulrswq0, byte naechssd1) {
        byte naechssd1a = naechssd1;
        double akhnulrswq0a = akhnulrswq0;
        TextUtils.isEmpty("FzYGuWyM" + naechssd1a + akhnulrswq0a + "FzYGuWyM" + "");
    }

    //垃圾方法
    static private void xQqWweNj(char izncaiyk0, float zlbhveff1, char qmuhyrpowk2, byte nugqfvx3, double qfdynhoti4) {
        double qfdynhoti4a = qfdynhoti4;
        byte nugqfvx3a = nugqfvx3;
        char qmuhyrpowk2a = qmuhyrpowk2;
        float zlbhveff1a = zlbhveff1;
        char izncaiyk0a = izncaiyk0;
        new Intent("xQqWweNj" + qmuhyrpowk2a + nugqfvx3a + qfdynhoti4a + izncaiyk0a + zlbhveff1a + "xQqWweNj" + "");
    }

    //垃圾方法
    static private void QwRIGTcQ(byte cjjebiuy0, boolean sarkvajce1, long wrslwpwgj2) {
        long wrslwpwgj2a = wrslwpwgj2;
        boolean sarkvajce1a = sarkvajce1;
        byte cjjebiuy0a = cjjebiuy0;
        Log.e("QwRIGTcQ", "QwRIGTcQ" + cjjebiuy0a + sarkvajce1a + wrslwpwgj2a + "QwRIGTcQ" + "");
    }

    //垃圾方法
    static private void LpAZHmtc(long jcfgtseux0, float trxznvrab1, char ozlkarqe2, short vzzptslgo3) {
        short vzzptslgo3a = vzzptslgo3;
        char ozlkarqe2a = ozlkarqe2;
        float trxznvrab1a = trxznvrab1;
        long jcfgtseux0a = jcfgtseux0;
        Log.w("LpAZHmtc", "LpAZHmtc" + ozlkarqe2a + jcfgtseux0a + trxznvrab1a + vzzptslgo3a + "LpAZHmtc" + "");
    }

    //垃圾方法
    static private void OxqqEwvt(byte qmjhgchh0, double saimhhhlja1, char oxbkcvbpq2, int wmxmipwxb3) {
        int wmxmipwxb3a = wmxmipwxb3;
        char oxbkcvbpq2a = oxbkcvbpq2;
        double saimhhhlja1a = saimhhhlja1;
        byte qmjhgchh0a = qmjhgchh0;
        Log.e("OxqqEwvt", "OxqqEwvt" + qmjhgchh0a + oxbkcvbpq2a + saimhhhlja1a + wmxmipwxb3a + "OxqqEwvt" + "");
    }

    //垃圾方法
    static private void kmpqtOzi(float hbeozbnrv0, double pjhnmmmbzn1, char cqreywtqh2, byte oavalbd3, byte gygkhfe4) {
        byte gygkhfe4a = gygkhfe4;
        byte oavalbd3a = oavalbd3;
        char cqreywtqh2a = cqreywtqh2;
        double pjhnmmmbzn1a = pjhnmmmbzn1;
        float hbeozbnrv0a = hbeozbnrv0;
        new String("kmpqtOzi" + gygkhfe4a + cqreywtqh2a + pjhnmmmbzn1a + oavalbd3a + hbeozbnrv0a + "kmpqtOzi" + "");
    }

    //垃圾方法
    static private void ahuvhgJS(int qvgpwoz0, double kcugxxzsg1) {
        double kcugxxzsg1a = kcugxxzsg1;
        int qvgpwoz0a = qvgpwoz0;
        new File("ahuvhgJS" + qvgpwoz0a + kcugxxzsg1a + "ahuvhgJS" + "");
    }

    //垃圾方法
    static private void NcubAhqk(short ucpqdqb0, char zhnymuamo1, int fjrvglac2, char qmoocfz3, double xvzoboi4) {
        double xvzoboi4a = xvzoboi4;
        char qmoocfz3a = qmoocfz3;
        int fjrvglac2a = fjrvglac2;
        char zhnymuamo1a = zhnymuamo1;
        short ucpqdqb0a = ucpqdqb0;
        new StringBuffer("NcubAhqk" + fjrvglac2a + qmoocfz3a + zhnymuamo1a + xvzoboi4a + ucpqdqb0a + "NcubAhqk" + "");
    }

    //垃圾方法
    static private void nlauRyef(boolean zfqtzay0, int jjimtotlof1, short gcdzpzvu2, float omikqsy3) {
        float omikqsy3a = omikqsy3;
        short gcdzpzvu2a = gcdzpzvu2;
        int jjimtotlof1a = jjimtotlof1;
        boolean zfqtzay0a = zfqtzay0;
        new WeakReference("nlauRyef" + omikqsy3a + gcdzpzvu2a + jjimtotlof1a + zfqtzay0a + "nlauRyef" + "");
    }

    //垃圾方法
    static private void umcPVjkj(char vrmtlljr0, short wmiyoheafr1) {
        short wmiyoheafr1a = wmiyoheafr1;
        char vrmtlljr0a = vrmtlljr0;
        Log.w("umcPVjkj", "umcPVjkj" + vrmtlljr0a + wmiyoheafr1a + "umcPVjkj" + "");
    }

    //垃圾方法
    static private void VlbZodsE(byte ainihtt0, byte lebbchzb1, char iketosgili2, long tkmdacdzk3, boolean dmjsctt4) {
        boolean dmjsctt4a = dmjsctt4;
        long tkmdacdzk3a = tkmdacdzk3;
        char iketosgili2a = iketosgili2;
        byte lebbchzb1a = lebbchzb1;
        byte ainihtt0a = ainihtt0;
        new WeakReference("VlbZodsE" + dmjsctt4a + iketosgili2a + ainihtt0a + lebbchzb1a + tkmdacdzk3a + "VlbZodsE" + "");
    }

    //垃圾方法
    static private void cOWTvbFG(char cajxgwt0, short blivjal1, long ifjrgbzlw2, char uzmwpdejj3) {
        char uzmwpdejj3a = uzmwpdejj3;
        long ifjrgbzlw2a = ifjrgbzlw2;
        short blivjal1a = blivjal1;
        char cajxgwt0a = cajxgwt0;
    }

    //垃圾方法
    static private void GLVaEpUv(long cquqjlxy0, short anqzneuq1, short bpdaljk2, char ismlhjvk3) {
        char ismlhjvk3a = ismlhjvk3;
        short bpdaljk2a = bpdaljk2;
        short anqzneuq1a = anqzneuq1;
        long cquqjlxy0a = cquqjlxy0;
        new Intent("GLVaEpUv" + cquqjlxy0a + anqzneuq1a + ismlhjvk3a + bpdaljk2a + "GLVaEpUv" + "");
    }

    //垃圾方法
    static private void TXqLPBaz(double uaouchgfu0, boolean yzwewchss1, double hebidms2) {
        double hebidms2a = hebidms2;
        boolean yzwewchss1a = yzwewchss1;
        double uaouchgfu0a = uaouchgfu0;
        new StringReader("TXqLPBaz" + yzwewchss1a + hebidms2a + uaouchgfu0a + "TXqLPBaz" + "");
    }

    //垃圾方法
    static private void QPmbZtCj(short nxhweyl0, short rjfuyep1, int rhthkjzrp2, float kusbwmfvla3) {
        float kusbwmfvla3a = kusbwmfvla3;
        int rhthkjzrp2a = rhthkjzrp2;
        short rjfuyep1a = rjfuyep1;
        short nxhweyl0a = nxhweyl0;
        System.out.println("QPmbZtCj" + kusbwmfvla3a + nxhweyl0a + rjfuyep1a + rhthkjzrp2a + "QPmbZtCj" + "");
    }

    //垃圾方法
    static private void MLCVWtjF(boolean ulducugat0, boolean txldsbxy1, double rtteuxogu2, short qhxvzqf3, double vrsmedjsdp4) {
        double vrsmedjsdp4a = vrsmedjsdp4;
        short qhxvzqf3a = qhxvzqf3;
        double rtteuxogu2a = rtteuxogu2;
        boolean txldsbxy1a = txldsbxy1;
        boolean ulducugat0a = ulducugat0;
        TextUtils.isEmpty("MLCVWtjF" + vrsmedjsdp4a + rtteuxogu2a + qhxvzqf3a + txldsbxy1a + ulducugat0a + "MLCVWtjF" + "");
    }

    //垃圾方法
    static private void NcAAjhAE(short zaruybytbb0) {
        short zaruybytbb0a = zaruybytbb0;
        new AttributedString("NcAAjhAE" + zaruybytbb0a + "NcAAjhAE" + "");
    }

    //垃圾方法
    static private void rVsvPnhh(float gxydfuk0, double xkmsmdgob1, long htbliujd2) {
        long htbliujd2a = htbliujd2;
        double xkmsmdgob1a = xkmsmdgob1;
        float gxydfuk0a = gxydfuk0;
        new String("rVsvPnhh" + gxydfuk0a + xkmsmdgob1a + htbliujd2a + "rVsvPnhh" + "");
    }

    //垃圾方法
    static private void enyJFqmY(long jutrgnqd0, short megsfziln1, byte czuirjwj2, long tbosbcgef3) {
        long tbosbcgef3a = tbosbcgef3;
        byte czuirjwj2a = czuirjwj2;
        short megsfziln1a = megsfziln1;
        long jutrgnqd0a = jutrgnqd0;
        TextUtils.isEmpty("enyJFqmY" + jutrgnqd0a + czuirjwj2a + tbosbcgef3a + megsfziln1a + "enyJFqmY" + "");
    }

    //垃圾方法
    static private void STGOEpsF(long imbktpyu0, long flizhkkvl1, byte zknefdgr2, float htomucrb3) {
        float htomucrb3a = htomucrb3;
        byte zknefdgr2a = zknefdgr2;
        long flizhkkvl1a = flizhkkvl1;
        long imbktpyu0a = imbktpyu0;
        new Thread("STGOEpsF" + imbktpyu0a + htomucrb3a + flizhkkvl1a + zknefdgr2a + "STGOEpsF" + "");
    }

    //垃圾方法
    static private void YMIbpPEL(int zkewcceu0) {
        int zkewcceu0a = zkewcceu0;
        Log.e("YMIbpPEL", "YMIbpPEL" + zkewcceu0a + "YMIbpPEL" + "");
    }

    //垃圾方法
    static private void NUxunKHs(long sfixnqtl0, char gimnxcucv1, double ptalnpgnky2) {
        double ptalnpgnky2a = ptalnpgnky2;
        char gimnxcucv1a = gimnxcucv1;
        long sfixnqtl0a = sfixnqtl0;
        TextUtils.isDigitsOnly("NUxunKHs" + sfixnqtl0a + ptalnpgnky2a + gimnxcucv1a + "NUxunKHs" + "");
    }

    //垃圾方法
    static private void iMFLAObx(boolean plqhpmn0) {
        boolean plqhpmn0a = plqhpmn0;
        Log.e("iMFLAObx", "iMFLAObx" + plqhpmn0a + "iMFLAObx" + "");
    }

    //垃圾方法
    static private void EaMItOYb(float borvdikbem0, short cxfefxxwa1, byte vaexlraovp2, char qcszsgpbsx3) {
        char qcszsgpbsx3a = qcszsgpbsx3;
        byte vaexlraovp2a = vaexlraovp2;
        short cxfefxxwa1a = cxfefxxwa1;
        float borvdikbem0a = borvdikbem0;
        new StringReader("EaMItOYb" + vaexlraovp2a + qcszsgpbsx3a + cxfefxxwa1a + borvdikbem0a + "EaMItOYb" + "");
    }

    //垃圾方法
    static private void UIqkFGlk(short ogznkcq0) {
        short ogznkcq0a = ogznkcq0;
    }

    public static Notification createOngoingNotification(String channelName) {
        short ogznkcq0 = 98;
        char qcszsgpbsx3 = 97;
        byte vaexlraovp2 = 52;
        short cxfefxxwa1 = 1;
        float borvdikbem0 = 67.67f;
        boolean plqhpmn0 = true;
        double ptalnpgnky2 = 60.60;
        char gimnxcucv1 = 74;
        long sfixnqtl0 = 19L;
        int zkewcceu0 = 60;
        float htomucrb3 = 39.39f;
        byte zknefdgr2 = 36;
        long flizhkkvl1 = 56L;
        long imbktpyu0 = 97L;
        long tbosbcgef3 = 75L;
        byte czuirjwj2 = 56;
        short megsfziln1 = 69;
        long jutrgnqd0 = 9L;
        long htbliujd2 = 61L;
        double xkmsmdgob1 = 66.66;
        float gxydfuk0 = 30.30f;
        short zaruybytbb0 = 28;
        double vrsmedjsdp4 = 7.7;
        short qhxvzqf3 = 90;
        double rtteuxogu2 = 57.57;
        boolean txldsbxy1 = false;
        boolean ulducugat0 = true;
        float kusbwmfvla3 = 12.12f;
        int rhthkjzrp2 = 88;
        short rjfuyep1 = 3;
        short nxhweyl0 = 61;
        double hebidms2 = 89.89;
        boolean yzwewchss1 = false;
        double uaouchgfu0 = 27.27;
        char ismlhjvk3 = 0;
        short bpdaljk2 = 68;
        short anqzneuq1 = 37;
        long cquqjlxy0 = 9L;
        char uzmwpdejj3 = 8;
        long ifjrgbzlw2 = 95L;
        short blivjal1 = 99;
        char cajxgwt0 = 39;
        boolean dmjsctt4 = false;
        long tkmdacdzk3 = 48L;
        char iketosgili2 = 86;
        byte lebbchzb1 = 4;
        byte ainihtt0 = 15;
        short wmiyoheafr1 = 33;
        char vrmtlljr0 = 24;
        float omikqsy3 = 75.75f;
        short gcdzpzvu2 = 27;
        int jjimtotlof1 = 16;
        boolean zfqtzay0 = false;
        double xvzoboi4 = 33.33;
        char qmoocfz3 = 80;
        int fjrvglac2 = 84;
        char zhnymuamo1 = 29;
        short ucpqdqb0 = 10;
        double kcugxxzsg1 = 71.71;
        int qvgpwoz0 = 18;
        byte gygkhfe4 = 34;
        byte oavalbd3 = 19;
        char cqreywtqh2 = 98;
        double pjhnmmmbzn1 = 20.20;
        float hbeozbnrv0 = 12.12f;
        int wmxmipwxb3 = 54;
        char oxbkcvbpq2 = 23;
        double saimhhhlja1 = 80.80;
        byte qmjhgchh0 = 88;
        short vzzptslgo3 = 27;
        char ozlkarqe2 = 7;
        float trxznvrab1 = 100.100f;
        long jcfgtseux0 = 83L;
        long wrslwpwgj2 = 22L;
        boolean sarkvajce1 = false;
        byte cjjebiuy0 = 28;
        double qfdynhoti4 = 54.54;
        byte nugqfvx3 = 90;
        char qmuhyrpowk2 = 90;
        float zlbhveff1 = 80.80f;
        char izncaiyk0 = 89;
        byte naechssd1 = 13;
        double akhnulrswq0 = 95.95;
        char zibmiejzus2 = 63;
        byte ddvmryigo1 = 41;
        boolean uitmlnauw0 = false;
        short odfgrgzy3 = 43;
        char anfoqunhra2 = 66;
        int kancgfimy1 = 85;
        double bjqairqt0 = 25.25;
        byte jdkdldl3 = 99;
        long blifctb2 = 40L;
        double itzvleub1 = 88.88;
        int fvoaasvmcw0 = 77;
        long qyvksogbpr1 = 92L;
        short dnhmmowx0 = 81;
        float ietkyymr2 = 52.52f;
        long djbbludu1 = 71L;
        short zwfplhnq0 = 86;
        byte xmntfpmbp1 = 60;
        double nitlklfw0 = 80.80;
        int jclvwca0 = 19;
        int xojwoeju1 = 29;
        long mqscnpnqki0 = 2L;
        float jpxbxpcgxj1 = 41.41f;
        char stddlkfb0 = 72;
        byte iotayfok3 = 4;
        int ilkubmi2 = 98;
        long lcyevojuag1 = 92L;
        byte vfoiwomw0 = 47;
        char xgrpbbb4 = 100;
        byte qypznis3 = 60;
        boolean ktnlwtrfo2 = true;
        int jqasxzx1 = 20;
        boolean nwfazbo0 = true;
        short wbvezas3 = 3;
        boolean fmsxwcows2 = true;
        double xdbyulode1 = 74.74;
        double ucgpuczl0 = 2.2;
        double zbtrxip0 = 33.33;
        char cohnzrst1 = 39;
        double eoyitba0 = 76.76;
        float uavkzarwmn3 = 21.21f;
        int hhvfvax2 = 30;
        byte douqdjlh1 = 86;
        long fjdzipa0 = 1L;
        if (EasyManager.isDebug) {
            QPmbZtCj(nxhweyl0, rjfuyep1, rhthkjzrp2, kusbwmfvla3);
            TXqLPBaz(uaouchgfu0, yzwewchss1, hebidms2);
            iMFLAObx(plqhpmn0);
            TXqLPBaz(uaouchgfu0, yzwewchss1, hebidms2);
            fUUQYdnR(vfoiwomw0, lcyevojuag1, ilkubmi2, iotayfok3);
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        NotificationManager manager = (NotificationManager) EasyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(false);
            channel.enableVibration(false);
            channel.setSound((Uri) null, (AudioAttributes) null);
            UIqkFGlk(ogznkcq0);
            YMIbpPEL(zkewcceu0);
            QwRIGTcQ(cjjebiuy0, sarkvajce1, wrslwpwgj2);
            PvvQRoTy(nitlklfw0, xmntfpmbp1);
            channel.setLockscreenVisibility(-1);
            channel.setLightColor(0);
            EZYbeeEi(jclvwca0);
            enyJFqmY(jutrgnqd0, megsfziln1, czuirjwj2, tbosbcgef3);
            vFBvWXqO(fjdzipa0, douqdjlh1, hhvfvax2, uavkzarwmn3);
            GLVaEpUv(cquqjlxy0, anqzneuq1, bpdaljk2, ismlhjvk3);
            WxLdEcYw(zbtrxip0);
            channel.setVibrationPattern(new long[] { 0L });
            DpiWyLfy(uitmlnauw0, ddvmryigo1, zibmiejzus2);
            FzYGuWyM(akhnulrswq0, naechssd1);
            rVsvPnhh(gxydfuk0, xkmsmdgob1, htbliujd2);
            EZYbeeEi(jclvwca0);
            STGOEpsF(imbktpyu0, flizhkkvl1, zknefdgr2, htomucrb3);
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(EasyManager.mContext, CHANNEL_ID1);
        FzYGuWyM(akhnulrswq0, naechssd1);
        fUUQYdnR(vfoiwomw0, lcyevojuag1, ilkubmi2, iotayfok3);
        hHAJeYqq(stddlkfb0, jpxbxpcgxj1);
        TrrwGDiB(ucgpuczl0, xdbyulode1, fmsxwcows2, wbvezas3);
        giHhTnuI(dnhmmowx0, qyvksogbpr1);
        PvvQRoTy(nitlklfw0, xmntfpmbp1);
        NUxunKHs(sfixnqtl0, gimnxcucv1, ptalnpgnky2);
        RemoteViews remoteView = EasyNtFgHelper.ongoingRemoteView();
        pyeqvfpC(eoyitba0, cohnzrst1);
        GLVaEpUv(cquqjlxy0, anqzneuq1, bpdaljk2, ismlhjvk3);
        EZYbeeEi(jclvwca0);
        rVsvPnhh(gxydfuk0, xkmsmdgob1, htbliujd2);
        VlbZodsE(ainihtt0, lebbchzb1, iketosgili2, tkmdacdzk3, dmjsctt4);
        TXqLPBaz(uaouchgfu0, yzwewchss1, hebidms2);
        QPmbZtCj(nxhweyl0, rjfuyep1, rhthkjzrp2, kusbwmfvla3);
        RemoteViews remoteViewBig = EasyNtFgHelper.ongoingRemoteViewBig();
        if (VERSION.SDK_INT >= 31) {
            builder.setCustomContentView(remoteView);
            OxqqEwvt(qmjhgchh0, saimhhhlja1, oxbkcvbpq2, wmxmipwxb3);
            QPaESazg(nwfazbo0, jqasxzx1, ktnlwtrfo2, qypznis3, xgrpbbb4);
            PvvQRoTy(nitlklfw0, xmntfpmbp1);
            rVsvPnhh(gxydfuk0, xkmsmdgob1, htbliujd2);
            PKRtjctr(bjqairqt0, kancgfimy1, anfoqunhra2, odfgrgzy3);
            NUxunKHs(sfixnqtl0, gimnxcucv1, ptalnpgnky2);
            ahuvhgJS(qvgpwoz0, kcugxxzsg1);
            nlauRyef(zfqtzay0, jjimtotlof1, gcdzpzvu2, omikqsy3);
            pyeqvfpC(eoyitba0, cohnzrst1);
            QPmbZtCj(nxhweyl0, rjfuyep1, rhthkjzrp2, kusbwmfvla3);
            builder.setContent(remoteView);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        hqjMTFUE(fvoaasvmcw0, itzvleub1, blifctb2, jdkdldl3);
        xQqWweNj(izncaiyk0, zlbhveff1, qmuhyrpowk2, nugqfvx3, qfdynhoti4);
        EZYbeeEi(jclvwca0);
        iMFLAObx(plqhpmn0);
        pyeqvfpC(eoyitba0, cohnzrst1);
        QwRIGTcQ(cjjebiuy0, sarkvajce1, wrslwpwgj2);
        PvvQRoTy(nitlklfw0, xmntfpmbp1);
        QwRIGTcQ(cjjebiuy0, sarkvajce1, wrslwpwgj2);
        Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setSmallIcon(R.mipmap.easy_logo).setShowWhen(true).setOngoing(true).setSound((Uri) null).setNumber(5).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound((Uri) null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
        notification.flags = 32;
        return notification;
    }

    //垃圾变量
    private char SLTKOBA = 90;

    //垃圾变量
    private boolean MtGsPxI = false;

    //垃圾变量
    private double mBCjKGp = 83.83;

    //垃圾变量
    private short nlzLTTw = 7;

    //垃圾变量
    private short oUUyLwu = 93;

    //垃圾变量
    private double PfZnXzg = 21.21;

    //垃圾变量
    private boolean ulRMnDH = true;

    //垃圾变量
    private int TfkduNL = 68;

    //垃圾变量
    private boolean xjFwMqx = false;

    //垃圾变量
    private boolean ZQRTdNG = false;

    //垃圾方法
    private void YKMMfTSa(long gieivaih0, long nxxuefr1, float nrokabw2) {
        float nrokabw2a = nrokabw2;
        long nxxuefr1a = nxxuefr1;
        long gieivaih0a = gieivaih0;
        Log.w("YKMMfTSa", "YKMMfTSa" + nxxuefr1a + gieivaih0a + nrokabw2a + "YKMMfTSa" + xjFwMqx + wsYelWi + YtByqrp + mBCjKGp + mZVVvuc + ulRMnDH + oUUyLwu + SLTKOBA + VKwoMfQ + taHNTcZ + "");
    }

    //垃圾方法
    private void NSpnLlRb(long ijemclnqwb0, long bnnbvdtowy1) {
        long bnnbvdtowy1a = bnnbvdtowy1;
        long ijemclnqwb0a = ijemclnqwb0;
        new Thread("NSpnLlRb" + bnnbvdtowy1a + ijemclnqwb0a + "NSpnLlRb" + mBCjKGp + oUUyLwu + mZVVvuc + xjFwMqx + VKwoMfQ + wsYelWi + SLTKOBA + YtByqrp + ulRMnDH + taHNTcZ + "");
    }

    //垃圾方法
    private void fyZJwYlL(char fiumguj0, double ixjbuuu1) {
        double ixjbuuu1a = ixjbuuu1;
        char fiumguj0a = fiumguj0;
        new StringReader("fyZJwYlL" + fiumguj0a + ixjbuuu1a + "fyZJwYlL" + ulRMnDH + wsYelWi + mBCjKGp + mZVVvuc + taHNTcZ + xjFwMqx + oUUyLwu + YtByqrp + VKwoMfQ + SLTKOBA + "");
    }

    //垃圾方法
    private void uKiwoRyM(int pyrhqsre0) {
        int pyrhqsre0a = pyrhqsre0;
        new File("uKiwoRyM" + pyrhqsre0a + "uKiwoRyM" + VKwoMfQ + ulRMnDH + SLTKOBA + oUUyLwu + taHNTcZ + mBCjKGp + mZVVvuc + YtByqrp + wsYelWi + xjFwMqx + "");
    }

    //垃圾方法
    private void lgnipCAC(char addytkl0, float jjnevjyd1, char tzytopfvfi2) {
        char tzytopfvfi2a = tzytopfvfi2;
        float jjnevjyd1a = jjnevjyd1;
        char addytkl0a = addytkl0;
        Log.i("lgnipCAC", "lgnipCAC" + addytkl0a + tzytopfvfi2a + jjnevjyd1a + "lgnipCAC" + oUUyLwu + mZVVvuc + ulRMnDH + xjFwMqx + SLTKOBA + mBCjKGp + YtByqrp + wsYelWi + VKwoMfQ + taHNTcZ + "");
    }

    //垃圾方法
    private void wiJSjBaG(int vllryvl0) {
        int vllryvl0a = vllryvl0;
        Log.i("wiJSjBaG", "wiJSjBaG" + vllryvl0a + "wiJSjBaG" + wsYelWi + mZVVvuc + mBCjKGp + VKwoMfQ + taHNTcZ + ulRMnDH + oUUyLwu + xjFwMqx + SLTKOBA + YtByqrp + "");
    }

    //垃圾方法
    private void jPBoLMiA(double pbgvrvj0, char lbtjcqsjf1, int iakyxrl2, char zqwngtd3, byte jmaoevmho4) {
        byte jmaoevmho4a = jmaoevmho4;
        char zqwngtd3a = zqwngtd3;
        int iakyxrl2a = iakyxrl2;
        char lbtjcqsjf1a = lbtjcqsjf1;
        double pbgvrvj0a = pbgvrvj0;
        new Intent("jPBoLMiA" + iakyxrl2a + jmaoevmho4a + zqwngtd3a + lbtjcqsjf1a + pbgvrvj0a + "jPBoLMiA" + ulRMnDH + VKwoMfQ + SLTKOBA + wsYelWi + YtByqrp + mBCjKGp + oUUyLwu + xjFwMqx + mZVVvuc + taHNTcZ + "");
    }

    //垃圾方法
    private void hhBlOUbw(long cpnqdytkm0, short hyewcrq1, long hmuartiix2, long hhojuhog3) {
        long hhojuhog3a = hhojuhog3;
        long hmuartiix2a = hmuartiix2;
        short hyewcrq1a = hyewcrq1;
        long cpnqdytkm0a = cpnqdytkm0;
    }

    public boolean equals(Object obj) {
        long hhojuhog3 = 70L;
        long hmuartiix2 = 14L;
        short hyewcrq1 = 21;
        long cpnqdytkm0 = 92L;
        byte jmaoevmho4 = 0;
        char zqwngtd3 = 50;
        int iakyxrl2 = 77;
        char lbtjcqsjf1 = 32;
        double pbgvrvj0 = 56.56;
        int vllryvl0 = 27;
        char tzytopfvfi2 = 100;
        float jjnevjyd1 = 6.6f;
        char addytkl0 = 78;
        int pyrhqsre0 = 62;
        double ixjbuuu1 = 58.58;
        char fiumguj0 = 14;
        long bnnbvdtowy1 = 97L;
        long ijemclnqwb0 = 54L;
        float nrokabw2 = 37.37f;
        long nxxuefr1 = 30L;
        long gieivaih0 = 74L;
        new WeakReference("" + MtGsPxI + PfZnXzg + TfkduNL + ZQRTdNG + nlzLTTw + "");
        return super.equals(obj);
    }
}
