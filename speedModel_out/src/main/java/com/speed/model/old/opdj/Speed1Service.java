package com.speed.model.old.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
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

public class Speed1Service extends Service {

    //垃圾变量
    private long ayRCzhT = 79L;

    public static long lastTime = 0L;

    //垃圾变量
    private float eoGRirY = 6.6f;

    private static String TAG = "xxx";

    //垃圾变量
    private short XAsJqht = 35;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private int ZCEjCep = 19;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private long lOXscUl = 76L;

    public static Boolean isLiving = false;

    //垃圾变量
    private char hxvNFkt = 14;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private byte hbKcvvL = 9;

    private static long delayTime = 250L;

    //垃圾变量
    private float lmxPGEe = 66.66f;

    public static boolean isStartService = false;

    //垃圾变量
    private short hilOoRD = 62;

    private IBinder subBinder = null;

    //垃圾变量
    private int ktLJiFj = 81;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private double UGdSfTs = 59.59;

    int nextNum = -1;

    public Speed1Service() {
    }

    //垃圾方法
    static private void GYkqXPLT(int uotpwdecg0, char nxrqxddpu1, boolean vyvqlew2) {
        boolean vyvqlew2a = vyvqlew2;
        char nxrqxddpu1a = nxrqxddpu1;
        int uotpwdecg0a = uotpwdecg0;
        System.out.println("GYkqXPLT" + uotpwdecg0a + vyvqlew2a + nxrqxddpu1a + "GYkqXPLT" + "");
    }

    //垃圾方法
    static private void rnJFPozV(byte hsbfxyy0, byte tdlbbmzeug1, byte twbxixjr2, short hgkpnkqtg3, double uyyfimbl4) {
        double uyyfimbl4a = uyyfimbl4;
        short hgkpnkqtg3a = hgkpnkqtg3;
        byte twbxixjr2a = twbxixjr2;
        byte tdlbbmzeug1a = tdlbbmzeug1;
        byte hsbfxyy0a = hsbfxyy0;
        new StringReader("rnJFPozV" + hsbfxyy0a + uyyfimbl4a + tdlbbmzeug1a + twbxixjr2a + hgkpnkqtg3a + "rnJFPozV" + "");
    }

    //垃圾方法
    static private void fUMPjjhZ(boolean qrquzgfxh0, boolean imkwkmmazf1, char wuyvcrwtmq2) {
        char wuyvcrwtmq2a = wuyvcrwtmq2;
        boolean imkwkmmazf1a = imkwkmmazf1;
        boolean qrquzgfxh0a = qrquzgfxh0;
        new File("fUMPjjhZ" + wuyvcrwtmq2a + qrquzgfxh0a + imkwkmmazf1a + "fUMPjjhZ" + "");
    }

    //垃圾方法
    static private void EynGUdyA(short lshdubk0, double toofgfbgh1, byte ewnchgjlsa2, float yrnenmm3, float dszljhuzcb4) {
        float dszljhuzcb4a = dszljhuzcb4;
        float yrnenmm3a = yrnenmm3;
        byte ewnchgjlsa2a = ewnchgjlsa2;
        double toofgfbgh1a = toofgfbgh1;
        short lshdubk0a = lshdubk0;
        TextUtils.isEmpty("EynGUdyA" + dszljhuzcb4a + lshdubk0a + ewnchgjlsa2a + yrnenmm3a + toofgfbgh1a + "EynGUdyA" + "");
    }

    public static void tryStartLaunchMainService() {
        float dszljhuzcb4 = 67.67f;
        float yrnenmm3 = 47.47f;
        byte ewnchgjlsa2 = 36;
        double toofgfbgh1 = 47.47;
        short lshdubk0 = 22;
        char wuyvcrwtmq2 = 3;
        boolean imkwkmmazf1 = true;
        boolean qrquzgfxh0 = true;
        double uyyfimbl4 = 20.20;
        short hgkpnkqtg3 = 9;
        byte twbxixjr2 = 83;
        byte tdlbbmzeug1 = 80;
        byte hsbfxyy0 = 17;
        boolean vyvqlew2 = true;
        char nxrqxddpu1 = 24;
        int uotpwdecg0 = 100;
        if (isLiving) {
            if (SpeedManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (SpeedManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(SpeedManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void oTmXuIBK(short frbdtaoglk0) {
        short frbdtaoglk0a = frbdtaoglk0;
        new AttributedString("oTmXuIBK" + frbdtaoglk0a + "oTmXuIBK" + "");
    }

    //垃圾方法
    static private void FnFrDfOc(int yewnvdquio0, double mgqgksdm1, short bpnagrqk2) {
        short bpnagrqk2a = bpnagrqk2;
        double mgqgksdm1a = mgqgksdm1;
        int yewnvdquio0a = yewnvdquio0;
        System.out.println("FnFrDfOc" + mgqgksdm1a + bpnagrqk2a + yewnvdquio0a + "FnFrDfOc" + "");
    }

    //垃圾方法
    static private void xhntmrmW(long vaecxijkzp0, float sgeaurww1) {
        float sgeaurww1a = sgeaurww1;
        long vaecxijkzp0a = vaecxijkzp0;
        new Thread("xhntmrmW" + vaecxijkzp0a + sgeaurww1a + "xhntmrmW" + "");
    }

    //垃圾方法
    static private void yGBctfXW(boolean wmgufupxbs0) {
        boolean wmgufupxbs0a = wmgufupxbs0;
        new Thread("yGBctfXW" + wmgufupxbs0a + "yGBctfXW" + "");
    }

    //垃圾方法
    static private void xjAEqJak(char pybfkhe0, int aoxyelbfj1, short kgbjwcxb2, short fohfocyfq3, long ntwmnkcu4) {
        long ntwmnkcu4a = ntwmnkcu4;
        short fohfocyfq3a = fohfocyfq3;
        short kgbjwcxb2a = kgbjwcxb2;
        int aoxyelbfj1a = aoxyelbfj1;
        char pybfkhe0a = pybfkhe0;
    }

    //垃圾方法
    static private void YdIalPxV(short zsrsdzxgo0, float zeulyhop1, long mkfitlo2, byte tmxouxe3) {
        byte tmxouxe3a = tmxouxe3;
        long mkfitlo2a = mkfitlo2;
        float zeulyhop1a = zeulyhop1;
        short zsrsdzxgo0a = zsrsdzxgo0;
        new File("YdIalPxV" + mkfitlo2a + zsrsdzxgo0a + tmxouxe3a + zeulyhop1a + "YdIalPxV" + "");
    }

    //垃圾方法
    static private void zPIKUsPX(int kmrbsklnh0, short pdzloxd1, char trqpatqssm2) {
        char trqpatqssm2a = trqpatqssm2;
        short pdzloxd1a = pdzloxd1;
        int kmrbsklnh0a = kmrbsklnh0;
        TextUtils.isDigitsOnly("zPIKUsPX" + trqpatqssm2a + kmrbsklnh0a + pdzloxd1a + "zPIKUsPX" + "");
    }

    //垃圾方法
    static private void bepsmUvU(int plpdcrjwc0, char krqpqhwa1) {
        char krqpqhwa1a = krqpqhwa1;
        int plpdcrjwc0a = plpdcrjwc0;
        new StringBuffer("bepsmUvU" + krqpqhwa1a + plpdcrjwc0a + "bepsmUvU" + "");
    }

    private static void startService(Context context) {
        char krqpqhwa1 = 55;
        int plpdcrjwc0 = 69;
        char trqpatqssm2 = 30;
        short pdzloxd1 = 24;
        int kmrbsklnh0 = 16;
        byte tmxouxe3 = 73;
        long mkfitlo2 = 36L;
        float zeulyhop1 = 59.59f;
        short zsrsdzxgo0 = 10;
        long ntwmnkcu4 = 45L;
        short fohfocyfq3 = 46;
        short kgbjwcxb2 = 14;
        int aoxyelbfj1 = 76;
        char pybfkhe0 = 1;
        boolean wmgufupxbs0 = false;
        float sgeaurww1 = 54.54f;
        long vaecxijkzp0 = 85L;
        short bpnagrqk2 = 12;
        double mgqgksdm1 = 3.3;
        int yewnvdquio0 = 99;
        short frbdtaoglk0 = 67;
        YdIalPxV(zsrsdzxgo0, zeulyhop1, mkfitlo2, tmxouxe3);
        xhntmrmW(vaecxijkzp0, sgeaurww1);
        zPIKUsPX(kmrbsklnh0, pdzloxd1, trqpatqssm2);
        bepsmUvU(plpdcrjwc0, krqpqhwa1);
        YdIalPxV(zsrsdzxgo0, zeulyhop1, mkfitlo2, tmxouxe3);
        oTmXuIBK(frbdtaoglk0);
        if (SpeedManager.isDebug) {
            yGBctfXW(wmgufupxbs0);
            YdIalPxV(zsrsdzxgo0, zeulyhop1, mkfitlo2, tmxouxe3);
            xhntmrmW(vaecxijkzp0, sgeaurww1);
            yGBctfXW(wmgufupxbs0);
            zPIKUsPX(kmrbsklnh0, pdzloxd1, trqpatqssm2);
            FnFrDfOc(yewnvdquio0, mgqgksdm1, bpnagrqk2);
            FnFrDfOc(yewnvdquio0, mgqgksdm1, bpnagrqk2);
            xhntmrmW(vaecxijkzp0, sgeaurww1);
            bepsmUvU(plpdcrjwc0, krqpqhwa1);
            Log.i(TAG, "LocalService startService5");
        }
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void BQYdOcUD(long kipxmhg0) {
        long kipxmhg0a = kipxmhg0;
        new StringBuilder("BQYdOcUD" + kipxmhg0a + "BQYdOcUD" + eoGRirY + UGdSfTs + lOXscUl + ktLJiFj + ZCEjCep + hbKcvvL + hilOoRD + lmxPGEe + ayRCzhT + XAsJqht + hxvNFkt + XgFZUcf + SbwKRKS + "");
    }

    //垃圾方法
    private void xbGmbQio(float hjeeazwbz0, int iiwhllfr1) {
        int iiwhllfr1a = iiwhllfr1;
        float hjeeazwbz0a = hjeeazwbz0;
        Log.i("xbGmbQio", "xbGmbQio" + hjeeazwbz0a + iiwhllfr1a + "xbGmbQio" + UGdSfTs + XgFZUcf + ktLJiFj + hbKcvvL + ZCEjCep + XAsJqht + hxvNFkt + hilOoRD + ayRCzhT + lOXscUl + SbwKRKS + eoGRirY + lmxPGEe + "");
    }

    //垃圾方法
    private void hLTZaGXu(char vodzvmi0) {
        char vodzvmi0a = vodzvmi0;
        new Thread("hLTZaGXu" + vodzvmi0a + "hLTZaGXu" + XAsJqht + XgFZUcf + eoGRirY + ktLJiFj + SbwKRKS + ayRCzhT + hxvNFkt + hbKcvvL + ZCEjCep + lmxPGEe + lOXscUl + UGdSfTs + hilOoRD + "");
    }

    //垃圾方法
    private void JMqyBZho(byte ldrqsyzj0) {
        byte ldrqsyzj0a = ldrqsyzj0;
        new WeakReference("JMqyBZho" + ldrqsyzj0a + "JMqyBZho" + ZCEjCep + hilOoRD + lOXscUl + ayRCzhT + hxvNFkt + SbwKRKS + lmxPGEe + eoGRirY + UGdSfTs + XAsJqht + hbKcvvL + XgFZUcf + ktLJiFj + "");
    }

    //垃圾方法
    private void blwTKwLU(long yqtkugd0, byte dvgfdmy1, long hzcyrjjq2) {
        long hzcyrjjq2a = hzcyrjjq2;
        byte dvgfdmy1a = dvgfdmy1;
        long yqtkugd0a = yqtkugd0;
        Log.w("blwTKwLU", "blwTKwLU" + yqtkugd0a + hzcyrjjq2a + dvgfdmy1a + "blwTKwLU" + lmxPGEe + hbKcvvL + hxvNFkt + lOXscUl + ayRCzhT + SbwKRKS + hilOoRD + XAsJqht + ktLJiFj + ZCEjCep + XgFZUcf + UGdSfTs + eoGRirY + "");
    }

    //垃圾方法
    private void aFdjtsfp(short tawetqks0, float uomyhir1, int mpwuczqcnm2, long zeqwsvpdnb3, long msqkajl4) {
        long msqkajl4a = msqkajl4;
        long zeqwsvpdnb3a = zeqwsvpdnb3;
        int mpwuczqcnm2a = mpwuczqcnm2;
        float uomyhir1a = uomyhir1;
        short tawetqks0a = tawetqks0;
        TextUtils.isEmpty("aFdjtsfp" + zeqwsvpdnb3a + msqkajl4a + uomyhir1a + tawetqks0a + mpwuczqcnm2a + "aFdjtsfp" + ayRCzhT + eoGRirY + SbwKRKS + lOXscUl + ktLJiFj + XAsJqht + hbKcvvL + lmxPGEe + hxvNFkt + hilOoRD + ZCEjCep + UGdSfTs + XgFZUcf + "");
    }

    //垃圾方法
    private void UroImcPB(short ncsdmybl0, boolean ckavowxzq1, float lvzrzhy2, float syndchknb3) {
        float syndchknb3a = syndchknb3;
        float lvzrzhy2a = lvzrzhy2;
        boolean ckavowxzq1a = ckavowxzq1;
        short ncsdmybl0a = ncsdmybl0;
        Log.w("UroImcPB", "UroImcPB" + ckavowxzq1a + syndchknb3a + lvzrzhy2a + ncsdmybl0a + "UroImcPB" + ayRCzhT + XAsJqht + lmxPGEe + UGdSfTs + hilOoRD + ktLJiFj + XgFZUcf + SbwKRKS + lOXscUl + ZCEjCep + hxvNFkt + eoGRirY + hbKcvvL + "");
    }

    //垃圾方法
    private void dgcFRLOC(int chafntpim0, double pwdfpjh1, float dhmgrayqc2) {
        float dhmgrayqc2a = dhmgrayqc2;
        double pwdfpjh1a = pwdfpjh1;
        int chafntpim0a = chafntpim0;
        new StringBuffer("dgcFRLOC" + pwdfpjh1a + chafntpim0a + dhmgrayqc2a + "dgcFRLOC" + ayRCzhT + XgFZUcf + lOXscUl + hbKcvvL + lmxPGEe + XAsJqht + SbwKRKS + ktLJiFj + ZCEjCep + hxvNFkt + eoGRirY + hilOoRD + UGdSfTs + "");
    }

    //垃圾方法
    private void ejTgMgTU(double secknsixk0) {
        double secknsixk0a = secknsixk0;
        Log.w("ejTgMgTU", "ejTgMgTU" + secknsixk0a + "ejTgMgTU" + UGdSfTs + SbwKRKS + hxvNFkt + hbKcvvL + hilOoRD + eoGRirY + ayRCzhT + lmxPGEe + ktLJiFj + lOXscUl + XgFZUcf + ZCEjCep + XAsJqht + "");
    }

    //垃圾方法
    private void GQVQmuhR(float hybukruw0, double doaatcxs1, float ufvxmcuhm2) {
        float ufvxmcuhm2a = ufvxmcuhm2;
        double doaatcxs1a = doaatcxs1;
        float hybukruw0a = hybukruw0;
        new StringReader("GQVQmuhR" + doaatcxs1a + hybukruw0a + ufvxmcuhm2a + "GQVQmuhR" + hbKcvvL + ktLJiFj + hilOoRD + XgFZUcf + XAsJqht + ZCEjCep + SbwKRKS + ayRCzhT + lOXscUl + hxvNFkt + eoGRirY + UGdSfTs + lmxPGEe + "");
    }

    //垃圾方法
    private void uPGKYdNj(short qaxdweudpo0, byte erikwzkj1, float dwjrjpmrme2) {
        float dwjrjpmrme2a = dwjrjpmrme2;
        byte erikwzkj1a = erikwzkj1;
        short qaxdweudpo0a = qaxdweudpo0;
        TextUtils.isEmpty("uPGKYdNj" + dwjrjpmrme2a + erikwzkj1a + qaxdweudpo0a + "uPGKYdNj" + hilOoRD + ZCEjCep + XAsJqht + lOXscUl + XgFZUcf + SbwKRKS + ayRCzhT + ktLJiFj + hbKcvvL + hxvNFkt + UGdSfTs + eoGRirY + lmxPGEe + "");
    }

    //垃圾方法
    private void ArTVDPPA(short inipfzhwq0, double gqglraukpz1, char cynkhpam2, short flkokox3) {
        short flkokox3a = flkokox3;
        char cynkhpam2a = cynkhpam2;
        double gqglraukpz1a = gqglraukpz1;
        short inipfzhwq0a = inipfzhwq0;
    }

    //垃圾方法
    private void HBJGknVx(int kcfgqgnsr0) {
        int kcfgqgnsr0a = kcfgqgnsr0;
        TextUtils.isDigitsOnly("HBJGknVx" + kcfgqgnsr0a + "HBJGknVx" + hxvNFkt + ktLJiFj + SbwKRKS + UGdSfTs + hbKcvvL + lOXscUl + eoGRirY + lmxPGEe + hilOoRD + ayRCzhT + XAsJqht + XgFZUcf + ZCEjCep + "");
    }

    //垃圾方法
    private void FnaEYIot(byte dsmtceoq0, double opaypsbeu1) {
        double opaypsbeu1a = opaypsbeu1;
        byte dsmtceoq0a = dsmtceoq0;
        Log.e("FnaEYIot", "FnaEYIot" + dsmtceoq0a + opaypsbeu1a + "FnaEYIot" + ayRCzhT + eoGRirY + ktLJiFj + UGdSfTs + ZCEjCep + hilOoRD + lOXscUl + XAsJqht + hbKcvvL + lmxPGEe + XgFZUcf + SbwKRKS + hxvNFkt + "");
    }

    //垃圾方法
    private void oIfgQWxu(boolean ugxtqofd0, short cscivuovk1, char qozugncl2, byte akgwmffy3, long bweybeyvoh4) {
        long bweybeyvoh4a = bweybeyvoh4;
        byte akgwmffy3a = akgwmffy3;
        char qozugncl2a = qozugncl2;
        short cscivuovk1a = cscivuovk1;
        boolean ugxtqofd0a = ugxtqofd0;
        Log.w("oIfgQWxu", "oIfgQWxu" + cscivuovk1a + qozugncl2a + bweybeyvoh4a + akgwmffy3a + ugxtqofd0a + "oIfgQWxu" + hxvNFkt + UGdSfTs + eoGRirY + SbwKRKS + lmxPGEe + ZCEjCep + hbKcvvL + ktLJiFj + lOXscUl + XgFZUcf + XAsJqht + ayRCzhT + hilOoRD + "");
    }

    //垃圾方法
    private void EQYssSan(short wzztgwoa0) {
        short wzztgwoa0a = wzztgwoa0;
        new Thread("EQYssSan" + wzztgwoa0a + "EQYssSan" + hilOoRD + lmxPGEe + eoGRirY + XgFZUcf + lOXscUl + hbKcvvL + ktLJiFj + SbwKRKS + UGdSfTs + ayRCzhT + hxvNFkt + ZCEjCep + XAsJqht + "");
    }

    //垃圾方法
    private void dxkwkbRH(char zwuvvyhrfi0) {
        char zwuvvyhrfi0a = zwuvvyhrfi0;
        new File("dxkwkbRH" + zwuvvyhrfi0a + "dxkwkbRH" + eoGRirY + lOXscUl + ZCEjCep + ayRCzhT + lmxPGEe + XgFZUcf + UGdSfTs + ktLJiFj + SbwKRKS + XAsJqht + hxvNFkt + hbKcvvL + hilOoRD + "");
    }

    //垃圾方法
    private void ChZroCWD(short zxyjcht0, int pisfkvrb1, int lwhdxguyq2) {
        int lwhdxguyq2a = lwhdxguyq2;
        int pisfkvrb1a = pisfkvrb1;
        short zxyjcht0a = zxyjcht0;
    }

    //垃圾方法
    private void spzFEnFI(byte tacamhp0, boolean cfjnsgou1, double lfuahhyh2) {
        double lfuahhyh2a = lfuahhyh2;
        boolean cfjnsgou1a = cfjnsgou1;
        byte tacamhp0a = tacamhp0;
        new WeakReference("spzFEnFI" + lfuahhyh2a + cfjnsgou1a + tacamhp0a + "spzFEnFI" + lmxPGEe + ZCEjCep + hilOoRD + ayRCzhT + hxvNFkt + ktLJiFj + hbKcvvL + UGdSfTs + XAsJqht + eoGRirY + lOXscUl + XgFZUcf + SbwKRKS + "");
    }

    //垃圾方法
    private void uUWsdVJG(long bbevkdhq0) {
        long bbevkdhq0a = bbevkdhq0;
        System.out.println("uUWsdVJG" + bbevkdhq0a + "uUWsdVJG" + eoGRirY + UGdSfTs + lmxPGEe + hilOoRD + ZCEjCep + XAsJqht + hbKcvvL + ktLJiFj + XgFZUcf + SbwKRKS + ayRCzhT + lOXscUl + hxvNFkt + "");
    }

    //垃圾方法
    private void DZREHKfS(byte yczpxeznc0, short dyvnwva1) {
        short dyvnwva1a = dyvnwva1;
        byte yczpxeznc0a = yczpxeznc0;
    }

    //垃圾方法
    private void SNUWPlYk(double uosusqcjxa0) {
        double uosusqcjxa0a = uosusqcjxa0;
    }

    //垃圾方法
    private void leewBwqT(double ziligdt0, byte zdtjacv1) {
        byte zdtjacv1a = zdtjacv1;
        double ziligdt0a = ziligdt0;
        TextUtils.isEmpty("leewBwqT" + ziligdt0a + zdtjacv1a + "leewBwqT" + lmxPGEe + hbKcvvL + ayRCzhT + SbwKRKS + eoGRirY + lOXscUl + hxvNFkt + XgFZUcf + hilOoRD + UGdSfTs + ktLJiFj + ZCEjCep + XAsJqht + "");
    }

    //垃圾方法
    private void vzLlLJhb(int xenpnzoxi0, boolean rfxcvraqu1, long ebnlglwyol2, long xzyivmxz3, boolean fxjfgsrzv4) {
        boolean fxjfgsrzv4a = fxjfgsrzv4;
        long xzyivmxz3a = xzyivmxz3;
        long ebnlglwyol2a = ebnlglwyol2;
        boolean rfxcvraqu1a = rfxcvraqu1;
        int xenpnzoxi0a = xenpnzoxi0;
        new StringReader("vzLlLJhb" + rfxcvraqu1a + xzyivmxz3a + fxjfgsrzv4a + ebnlglwyol2a + xenpnzoxi0a + "vzLlLJhb" + lOXscUl + ktLJiFj + XgFZUcf + hxvNFkt + lmxPGEe + ZCEjCep + hbKcvvL + XAsJqht + SbwKRKS + eoGRirY + UGdSfTs + hilOoRD + ayRCzhT + "");
    }

    //垃圾方法
    private void PdbdGVZA(short yufxpzf0) {
        short yufxpzf0a = yufxpzf0;
        new String("PdbdGVZA" + yufxpzf0a + "PdbdGVZA" + lmxPGEe + lOXscUl + ktLJiFj + SbwKRKS + ZCEjCep + XgFZUcf + hbKcvvL + hxvNFkt + XAsJqht + eoGRirY + UGdSfTs + hilOoRD + ayRCzhT + "");
    }

    //垃圾方法
    private void QHnCjjlt(float huzwvwfdm0, char cmheyto1, boolean mhjiwxprky2, double odzphgyfb3) {
        double odzphgyfb3a = odzphgyfb3;
        boolean mhjiwxprky2a = mhjiwxprky2;
        char cmheyto1a = cmheyto1;
        float huzwvwfdm0a = huzwvwfdm0;
        new StringBuffer("QHnCjjlt" + mhjiwxprky2a + odzphgyfb3a + cmheyto1a + huzwvwfdm0a + "QHnCjjlt" + ktLJiFj + hilOoRD + SbwKRKS + ZCEjCep + lmxPGEe + eoGRirY + hbKcvvL + XgFZUcf + ayRCzhT + XAsJqht + UGdSfTs + hxvNFkt + lOXscUl + "");
    }

    //垃圾方法
    private void bTWbGvmP(long xugvvkibdt0, short eauqenckt1, char xqxgaxem2, double lsrtybro3) {
        double lsrtybro3a = lsrtybro3;
        char xqxgaxem2a = xqxgaxem2;
        short eauqenckt1a = eauqenckt1;
        long xugvvkibdt0a = xugvvkibdt0;
        new StringBuffer("bTWbGvmP" + lsrtybro3a + eauqenckt1a + xugvvkibdt0a + xqxgaxem2a + "bTWbGvmP" + ayRCzhT + hbKcvvL + lmxPGEe + SbwKRKS + XgFZUcf + eoGRirY + ZCEjCep + hxvNFkt + hilOoRD + ktLJiFj + XAsJqht + UGdSfTs + lOXscUl + "");
    }

    //垃圾方法
    private void jUyaxQox(boolean uajrrzo0, boolean nqwohccjgj1, long izuktzgi2, boolean ejjimnlxzf3) {
        boolean ejjimnlxzf3a = ejjimnlxzf3;
        long izuktzgi2a = izuktzgi2;
        boolean nqwohccjgj1a = nqwohccjgj1;
        boolean uajrrzo0a = uajrrzo0;
        TextUtils.isEmpty("jUyaxQox" + uajrrzo0a + ejjimnlxzf3a + izuktzgi2a + nqwohccjgj1a + "jUyaxQox" + hbKcvvL + hilOoRD + hxvNFkt + XAsJqht + UGdSfTs + SbwKRKS + XgFZUcf + ayRCzhT + lmxPGEe + ktLJiFj + ZCEjCep + lOXscUl + eoGRirY + "");
    }

    public void onCreate() {
        boolean ejjimnlxzf3 = true;
        long izuktzgi2 = 75L;
        boolean nqwohccjgj1 = true;
        boolean uajrrzo0 = false;
        double lsrtybro3 = 20.20;
        char xqxgaxem2 = 13;
        short eauqenckt1 = 95;
        long xugvvkibdt0 = 48L;
        double odzphgyfb3 = 84.84;
        boolean mhjiwxprky2 = false;
        char cmheyto1 = 50;
        float huzwvwfdm0 = 53.53f;
        short yufxpzf0 = 84;
        boolean fxjfgsrzv4 = false;
        long xzyivmxz3 = 29L;
        long ebnlglwyol2 = 40L;
        boolean rfxcvraqu1 = true;
        int xenpnzoxi0 = 52;
        byte zdtjacv1 = 71;
        double ziligdt0 = 80.80;
        double uosusqcjxa0 = 94.94;
        short dyvnwva1 = 55;
        byte yczpxeznc0 = 1;
        long bbevkdhq0 = 59L;
        double lfuahhyh2 = 66.66;
        boolean cfjnsgou1 = true;
        byte tacamhp0 = 60;
        int lwhdxguyq2 = 19;
        int pisfkvrb1 = 39;
        short zxyjcht0 = 12;
        char zwuvvyhrfi0 = 50;
        short wzztgwoa0 = 87;
        long bweybeyvoh4 = 94L;
        byte akgwmffy3 = 78;
        char qozugncl2 = 19;
        short cscivuovk1 = 95;
        boolean ugxtqofd0 = true;
        double opaypsbeu1 = 72.72;
        byte dsmtceoq0 = 38;
        int kcfgqgnsr0 = 22;
        short flkokox3 = 62;
        char cynkhpam2 = 23;
        double gqglraukpz1 = 35.35;
        short inipfzhwq0 = 43;
        float dwjrjpmrme2 = 51.51f;
        byte erikwzkj1 = 68;
        short qaxdweudpo0 = 11;
        float ufvxmcuhm2 = 45.45f;
        double doaatcxs1 = 2.2;
        float hybukruw0 = 17.17f;
        double secknsixk0 = 97.97;
        float dhmgrayqc2 = 17.17f;
        double pwdfpjh1 = 52.52;
        int chafntpim0 = 49;
        float syndchknb3 = 29.29f;
        float lvzrzhy2 = 74.74f;
        boolean ckavowxzq1 = true;
        short ncsdmybl0 = 35;
        long msqkajl4 = 15L;
        long zeqwsvpdnb3 = 46L;
        int mpwuczqcnm2 = 9;
        float uomyhir1 = 71.71f;
        short tawetqks0 = 22;
        long hzcyrjjq2 = 18L;
        byte dvgfdmy1 = 30;
        long yqtkugd0 = 12L;
        byte ldrqsyzj0 = 63;
        char vodzvmi0 = 9;
        int iiwhllfr1 = 13;
        float hjeeazwbz0 = 53.53f;
        long kipxmhg0 = 9L;
        isLiving = true;
        super.onCreate();
        leewBwqT(ziligdt0, zdtjacv1);
        aFdjtsfp(tawetqks0, uomyhir1, mpwuczqcnm2, zeqwsvpdnb3, msqkajl4);
        FnaEYIot(dsmtceoq0, opaypsbeu1);
        FnaEYIot(dsmtceoq0, opaypsbeu1);
        if (SpeedManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        vzLlLJhb(xenpnzoxi0, rfxcvraqu1, ebnlglwyol2, xzyivmxz3, fxjfgsrzv4);
        spzFEnFI(tacamhp0, cfjnsgou1, lfuahhyh2);
        SNUWPlYk(uosusqcjxa0);
        xbGmbQio(hjeeazwbz0, iiwhllfr1);
        ArTVDPPA(inipfzhwq0, gqglraukpz1, cynkhpam2, flkokox3);
        ChZroCWD(zxyjcht0, pisfkvrb1, lwhdxguyq2);
        DZREHKfS(yczpxeznc0, dyvnwva1);
        vzLlLJhb(xenpnzoxi0, rfxcvraqu1, ebnlglwyol2, xzyivmxz3, fxjfgsrzv4);
        this.mLocalBinder = new LocalBinder(this);
        blwTKwLU(yqtkugd0, dvgfdmy1, hzcyrjjq2);
        jUyaxQox(uajrrzo0, nqwohccjgj1, izuktzgi2, ejjimnlxzf3);
        hLTZaGXu(vodzvmi0);
        JMqyBZho(ldrqsyzj0);
        SNUWPlYk(uosusqcjxa0);
        QHnCjjlt(huzwvwfdm0, cmheyto1, mhjiwxprky2, odzphgyfb3);
        oIfgQWxu(ugxtqofd0, cscivuovk1, qozugncl2, akgwmffy3, bweybeyvoh4);
        spzFEnFI(tacamhp0, cfjnsgou1, lfuahhyh2);
        dgcFRLOC(chafntpim0, pwdfpjh1, dhmgrayqc2);
        uPGKYdNj(qaxdweudpo0, erikwzkj1, dwjrjpmrme2);
        if (this.mLocalServiceConn == null) {
            blwTKwLU(yqtkugd0, dvgfdmy1, hzcyrjjq2);
            ArTVDPPA(inipfzhwq0, gqglraukpz1, cynkhpam2, flkokox3);
            PdbdGVZA(yufxpzf0);
            uPGKYdNj(qaxdweudpo0, erikwzkj1, dwjrjpmrme2);
            ArTVDPPA(inipfzhwq0, gqglraukpz1, cynkhpam2, flkokox3);
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        this.startSubService(1, false);
    }

    //垃圾方法
    private void vYUQkEdo(byte uguafliyxc0, boolean jxyqfehn1, char cbxndnmnf2, byte wxpultkib3, byte hysgepn4) {
        byte hysgepn4a = hysgepn4;
        byte wxpultkib3a = wxpultkib3;
        char cbxndnmnf2a = cbxndnmnf2;
        boolean jxyqfehn1a = jxyqfehn1;
        byte uguafliyxc0a = uguafliyxc0;
        new StringBuffer("vYUQkEdo" + uguafliyxc0a + cbxndnmnf2a + jxyqfehn1a + hysgepn4a + wxpultkib3a + "vYUQkEdo" + ktLJiFj + hxvNFkt + XAsJqht + lmxPGEe + ayRCzhT + eoGRirY + hilOoRD + ZCEjCep + XgFZUcf + hbKcvvL + lOXscUl + SbwKRKS + UGdSfTs + "");
    }

    //垃圾方法
    private void RrOmpiSk(float lrpwjkygul0) {
        float lrpwjkygul0a = lrpwjkygul0;
        new StringBuffer("RrOmpiSk" + lrpwjkygul0a + "RrOmpiSk" + eoGRirY + hxvNFkt + UGdSfTs + SbwKRKS + ktLJiFj + ayRCzhT + XAsJqht + lOXscUl + XgFZUcf + hbKcvvL + hilOoRD + ZCEjCep + lmxPGEe + "");
    }

    //垃圾方法
    private void JJAzquQu(double oixmjtk0, float kjfumrpt1, long ajiquxcqw2, float dwaqiesy3, float jatyqqtutd4) {
        float jatyqqtutd4a = jatyqqtutd4;
        float dwaqiesy3a = dwaqiesy3;
        long ajiquxcqw2a = ajiquxcqw2;
        float kjfumrpt1a = kjfumrpt1;
        double oixmjtk0a = oixmjtk0;
        TextUtils.isEmpty("JJAzquQu" + kjfumrpt1a + ajiquxcqw2a + jatyqqtutd4a + dwaqiesy3a + oixmjtk0a + "JJAzquQu" + ktLJiFj + XAsJqht + hbKcvvL + ZCEjCep + ayRCzhT + hilOoRD + XgFZUcf + lmxPGEe + eoGRirY + UGdSfTs + lOXscUl + hxvNFkt + SbwKRKS + "");
    }

    //垃圾方法
    private void nICXSEpv(char bhgzoqo0, byte pifzzva1, char rzfnpbt2, int ybtqxjsvw3) {
        int ybtqxjsvw3a = ybtqxjsvw3;
        char rzfnpbt2a = rzfnpbt2;
        byte pifzzva1a = pifzzva1;
        char bhgzoqo0a = bhgzoqo0;
        new StringBuilder("nICXSEpv" + pifzzva1a + ybtqxjsvw3a + rzfnpbt2a + bhgzoqo0a + "nICXSEpv" + lOXscUl + SbwKRKS + ktLJiFj + ayRCzhT + eoGRirY + XgFZUcf + hbKcvvL + hxvNFkt + UGdSfTs + lmxPGEe + hilOoRD + XAsJqht + ZCEjCep + "");
    }

    public void onRebind(Intent intent) {
        int ybtqxjsvw3 = 48;
        char rzfnpbt2 = 24;
        byte pifzzva1 = 0;
        char bhgzoqo0 = 78;
        float jatyqqtutd4 = 60.60f;
        float dwaqiesy3 = 18.18f;
        long ajiquxcqw2 = 36L;
        float kjfumrpt1 = 94.94f;
        double oixmjtk0 = 63.63;
        float lrpwjkygul0 = 32.32f;
        byte hysgepn4 = 60;
        byte wxpultkib3 = 72;
        char cbxndnmnf2 = 24;
        boolean jxyqfehn1 = false;
        byte uguafliyxc0 = 81;
        super.onRebind(intent);
    }

    //垃圾方法
    private void BqAZPDZs(long jqqldfe0, int zkvtngcw1, char mczcisk2, long sorhdwtaxs3) {
        long sorhdwtaxs3a = sorhdwtaxs3;
        char mczcisk2a = mczcisk2;
        int zkvtngcw1a = zkvtngcw1;
        long jqqldfe0a = jqqldfe0;
        new WeakReference("BqAZPDZs" + sorhdwtaxs3a + mczcisk2a + zkvtngcw1a + jqqldfe0a + "BqAZPDZs" + ZCEjCep + hilOoRD + XAsJqht + hbKcvvL + lmxPGEe + ktLJiFj + UGdSfTs + lOXscUl + ayRCzhT + hxvNFkt + XgFZUcf + eoGRirY + SbwKRKS + "");
    }

    //垃圾方法
    private void tHCmuzaC(byte liuiabv0, int giohzem1, long xamyoqnc2) {
        long xamyoqnc2a = xamyoqnc2;
        int giohzem1a = giohzem1;
        byte liuiabv0a = liuiabv0;
        System.out.println("tHCmuzaC" + xamyoqnc2a + giohzem1a + liuiabv0a + "tHCmuzaC" + hilOoRD + lOXscUl + hxvNFkt + hbKcvvL + ktLJiFj + ayRCzhT + lmxPGEe + XgFZUcf + ZCEjCep + UGdSfTs + SbwKRKS + eoGRirY + XAsJqht + "");
    }

    //垃圾方法
    private void rfivfZAj(long zwbegzwu0) {
        long zwbegzwu0a = zwbegzwu0;
        Log.i("rfivfZAj", "rfivfZAj" + zwbegzwu0a + "rfivfZAj" + ktLJiFj + hbKcvvL + eoGRirY + lOXscUl + hilOoRD + XgFZUcf + hxvNFkt + SbwKRKS + UGdSfTs + lmxPGEe + ayRCzhT + XAsJqht + ZCEjCep + "");
    }

    //垃圾方法
    private void bFPXxzdP(short jsqmyyas0, short kddgfjtib1, short kiydsbl2, short ccxujmo3) {
        short ccxujmo3a = ccxujmo3;
        short kiydsbl2a = kiydsbl2;
        short kddgfjtib1a = kddgfjtib1;
        short jsqmyyas0a = jsqmyyas0;
        new AttributedString("bFPXxzdP" + kiydsbl2a + ccxujmo3a + kddgfjtib1a + jsqmyyas0a + "bFPXxzdP" + ktLJiFj + ZCEjCep + lOXscUl + XAsJqht + lmxPGEe + hilOoRD + eoGRirY + hxvNFkt + UGdSfTs + XgFZUcf + ayRCzhT + SbwKRKS + hbKcvvL + "");
    }

    //垃圾方法
    private void dsIpKxWj(long qccrckkn0, char ltmtmlv1, float lgcbcto2, double yeeepyqkit3, byte yxoipymc4) {
        byte yxoipymc4a = yxoipymc4;
        double yeeepyqkit3a = yeeepyqkit3;
        float lgcbcto2a = lgcbcto2;
        char ltmtmlv1a = ltmtmlv1;
        long qccrckkn0a = qccrckkn0;
        TextUtils.isDigitsOnly("dsIpKxWj" + yeeepyqkit3a + qccrckkn0a + yxoipymc4a + ltmtmlv1a + lgcbcto2a + "dsIpKxWj" + lmxPGEe + hbKcvvL + ktLJiFj + ayRCzhT + eoGRirY + XgFZUcf + SbwKRKS + ZCEjCep + lOXscUl + hilOoRD + UGdSfTs + hxvNFkt + XAsJqht + "");
    }

    //垃圾方法
    private void APdoZCku(float uorhvdlv0, long cffhybh1, byte onaksoyuv2, double qicdojy3, byte bljwgamm4) {
        byte bljwgamm4a = bljwgamm4;
        double qicdojy3a = qicdojy3;
        byte onaksoyuv2a = onaksoyuv2;
        long cffhybh1a = cffhybh1;
        float uorhvdlv0a = uorhvdlv0;
        TextUtils.isEmpty("APdoZCku" + bljwgamm4a + uorhvdlv0a + onaksoyuv2a + cffhybh1a + qicdojy3a + "APdoZCku" + eoGRirY + UGdSfTs + XAsJqht + ktLJiFj + hxvNFkt + XgFZUcf + lOXscUl + ayRCzhT + hilOoRD + SbwKRKS + ZCEjCep + lmxPGEe + hbKcvvL + "");
    }

    //垃圾方法
    private void eYFDPkEE(long hlcrigbwpp0) {
        long hlcrigbwpp0a = hlcrigbwpp0;
        System.out.println("eYFDPkEE" + hlcrigbwpp0a + "eYFDPkEE" + hilOoRD + ayRCzhT + lOXscUl + ZCEjCep + eoGRirY + SbwKRKS + UGdSfTs + hbKcvvL + XAsJqht + hxvNFkt + XgFZUcf + ktLJiFj + lmxPGEe + "");
    }

    //垃圾方法
    private void bsymfxAU(long nxhnkgr0) {
        long nxhnkgr0a = nxhnkgr0;
        new StringReader("bsymfxAU" + nxhnkgr0a + "bsymfxAU" + ZCEjCep + hbKcvvL + ayRCzhT + lmxPGEe + XAsJqht + eoGRirY + XgFZUcf + lOXscUl + UGdSfTs + SbwKRKS + hilOoRD + ktLJiFj + hxvNFkt + "");
    }

    //垃圾方法
    private void gsTdOQbX(double uqfzlurav0) {
        double uqfzlurav0a = uqfzlurav0;
        Log.w("gsTdOQbX", "gsTdOQbX" + uqfzlurav0a + "gsTdOQbX" + ZCEjCep + SbwKRKS + ayRCzhT + hxvNFkt + hilOoRD + eoGRirY + UGdSfTs + XAsJqht + lmxPGEe + lOXscUl + ktLJiFj + hbKcvvL + XgFZUcf + "");
    }

    //垃圾方法
    private void TGLbkjBf(short ugkudzy0, byte jtyahyh1, char myyoqfx2, int nlrtxflxa3) {
        int nlrtxflxa3a = nlrtxflxa3;
        char myyoqfx2a = myyoqfx2;
        byte jtyahyh1a = jtyahyh1;
        short ugkudzy0a = ugkudzy0;
        new Intent("TGLbkjBf" + jtyahyh1a + ugkudzy0a + myyoqfx2a + nlrtxflxa3a + "TGLbkjBf" + ayRCzhT + eoGRirY + XAsJqht + hxvNFkt + lOXscUl + hilOoRD + ktLJiFj + SbwKRKS + XgFZUcf + lmxPGEe + ZCEjCep + hbKcvvL + UGdSfTs + "");
    }

    //垃圾方法
    private void huLPgZwA(byte sqcuxnf0, byte ssqmljo1, long ktaiwjrawt2) {
        long ktaiwjrawt2a = ktaiwjrawt2;
        byte ssqmljo1a = ssqmljo1;
        byte sqcuxnf0a = sqcuxnf0;
        TextUtils.isDigitsOnly("huLPgZwA" + ktaiwjrawt2a + sqcuxnf0a + ssqmljo1a + "huLPgZwA" + ktLJiFj + hxvNFkt + XgFZUcf + lmxPGEe + eoGRirY + hbKcvvL + XAsJqht + ayRCzhT + lOXscUl + SbwKRKS + hilOoRD + ZCEjCep + UGdSfTs + "");
    }

    //垃圾方法
    private void UKNAGEFB(int gpsjsph0) {
        int gpsjsph0a = gpsjsph0;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        int gpsjsph0 = 92;
        long ktaiwjrawt2 = 59L;
        byte ssqmljo1 = 30;
        byte sqcuxnf0 = 5;
        int nlrtxflxa3 = 75;
        char myyoqfx2 = 3;
        byte jtyahyh1 = 24;
        short ugkudzy0 = 65;
        double uqfzlurav0 = 58.58;
        long nxhnkgr0 = 70L;
        long hlcrigbwpp0 = 11L;
        byte bljwgamm4 = 79;
        double qicdojy3 = 100.100;
        byte onaksoyuv2 = 86;
        long cffhybh1 = 99L;
        float uorhvdlv0 = 22.22f;
        byte yxoipymc4 = 10;
        double yeeepyqkit3 = 55.55;
        float lgcbcto2 = 80.80f;
        char ltmtmlv1 = 46;
        long qccrckkn0 = 27L;
        short ccxujmo3 = 57;
        short kiydsbl2 = 87;
        short kddgfjtib1 = 34;
        short jsqmyyas0 = 74;
        long zwbegzwu0 = 62L;
        long xamyoqnc2 = 28L;
        int giohzem1 = 0;
        byte liuiabv0 = 24;
        long sorhdwtaxs3 = 35L;
        char mczcisk2 = 38;
        int zkvtngcw1 = 99;
        long jqqldfe0 = 52L;
        if (intent != null && !isStartService) {
            bsymfxAU(nxhnkgr0);
            bsymfxAU(nxhnkgr0);
            tHCmuzaC(liuiabv0, giohzem1, xamyoqnc2);
            tHCmuzaC(liuiabv0, giohzem1, xamyoqnc2);
            bFPXxzdP(jsqmyyas0, kddgfjtib1, kiydsbl2, ccxujmo3);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (SpeedManager.isDebug) {
            eYFDPkEE(hlcrigbwpp0);
            gsTdOQbX(uqfzlurav0);
            rfivfZAj(zwbegzwu0);
            BqAZPDZs(jqqldfe0, zkvtngcw1, mczcisk2, sorhdwtaxs3);
            bsymfxAU(nxhnkgr0);
            bsymfxAU(nxhnkgr0);
            rfivfZAj(zwbegzwu0);
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void VOPGBGoT(float cogyyemolq0, byte qhabddjm1, int tpuciwlba2) {
        int tpuciwlba2a = tpuciwlba2;
        byte qhabddjm1a = qhabddjm1;
        float cogyyemolq0a = cogyyemolq0;
        new AttributedString("VOPGBGoT" + qhabddjm1a + tpuciwlba2a + cogyyemolq0a + "VOPGBGoT" + UGdSfTs + ayRCzhT + eoGRirY + hbKcvvL + lmxPGEe + ktLJiFj + XAsJqht + ZCEjCep + lOXscUl + SbwKRKS + XgFZUcf + hxvNFkt + hilOoRD + "");
    }

    //垃圾方法
    private void KMIoKBSb(byte wzfbjchj0, byte tqbwlrk1) {
        byte tqbwlrk1a = tqbwlrk1;
        byte wzfbjchj0a = wzfbjchj0;
        Log.i("KMIoKBSb", "KMIoKBSb" + wzfbjchj0a + tqbwlrk1a + "KMIoKBSb" + hbKcvvL + eoGRirY + XgFZUcf + ktLJiFj + lmxPGEe + UGdSfTs + hilOoRD + hxvNFkt + lOXscUl + ZCEjCep + ayRCzhT + XAsJqht + SbwKRKS + "");
    }

    //垃圾方法
    private void DDcZCWtz(byte htbacfas0, double hutfrhrfyp1, float qxacmwe2, short fkxburocl3, boolean ecgaxor4) {
        boolean ecgaxor4a = ecgaxor4;
        short fkxburocl3a = fkxburocl3;
        float qxacmwe2a = qxacmwe2;
        double hutfrhrfyp1a = hutfrhrfyp1;
        byte htbacfas0a = htbacfas0;
        TextUtils.isDigitsOnly("DDcZCWtz" + qxacmwe2a + hutfrhrfyp1a + htbacfas0a + fkxburocl3a + ecgaxor4a + "DDcZCWtz" + ktLJiFj + lmxPGEe + XgFZUcf + SbwKRKS + hbKcvvL + hilOoRD + XAsJqht + ZCEjCep + eoGRirY + hxvNFkt + ayRCzhT + UGdSfTs + lOXscUl + "");
    }

    //垃圾方法
    private void chFgFvZs(double satnrrnyy0, double tujhvygem1, double enyfzxuagg2) {
        double enyfzxuagg2a = enyfzxuagg2;
        double tujhvygem1a = tujhvygem1;
        double satnrrnyy0a = satnrrnyy0;
        new Intent("chFgFvZs" + satnrrnyy0a + enyfzxuagg2a + tujhvygem1a + "chFgFvZs" + lmxPGEe + XgFZUcf + UGdSfTs + lOXscUl + eoGRirY + hilOoRD + ktLJiFj + ayRCzhT + SbwKRKS + ZCEjCep + XAsJqht + hbKcvvL + hxvNFkt + "");
    }

    //垃圾方法
    private void nUZEBixT(boolean nfwonxhwr0, int tztbebn1, float duqivxr2, char nysvxzpqzm3, boolean hqshyyg4) {
        boolean hqshyyg4a = hqshyyg4;
        char nysvxzpqzm3a = nysvxzpqzm3;
        float duqivxr2a = duqivxr2;
        int tztbebn1a = tztbebn1;
        boolean nfwonxhwr0a = nfwonxhwr0;
        new String("nUZEBixT" + hqshyyg4a + tztbebn1a + duqivxr2a + nysvxzpqzm3a + nfwonxhwr0a + "nUZEBixT" + hxvNFkt + XAsJqht + SbwKRKS + ayRCzhT + lmxPGEe + eoGRirY + lOXscUl + ktLJiFj + ZCEjCep + UGdSfTs + hbKcvvL + XgFZUcf + hilOoRD + "");
    }

    //垃圾方法
    private void torOvpnr(char kbdqcaroj0) {
        char kbdqcaroj0a = kbdqcaroj0;
        TextUtils.isDigitsOnly("torOvpnr" + kbdqcaroj0a + "torOvpnr" + UGdSfTs + eoGRirY + hxvNFkt + lOXscUl + lmxPGEe + ktLJiFj + hbKcvvL + hilOoRD + ZCEjCep + XAsJqht + ayRCzhT + XgFZUcf + SbwKRKS + "");
    }

    //垃圾方法
    private void RxSsUHuE(char psbnkpjbwn0, short fgkkfzyq1, float ewiengf2, double zoyptag3) {
        double zoyptag3a = zoyptag3;
        float ewiengf2a = ewiengf2;
        short fgkkfzyq1a = fgkkfzyq1;
        char psbnkpjbwn0a = psbnkpjbwn0;
        new WeakReference("RxSsUHuE" + fgkkfzyq1a + psbnkpjbwn0a + zoyptag3a + ewiengf2a + "RxSsUHuE" + UGdSfTs + ZCEjCep + hxvNFkt + XgFZUcf + SbwKRKS + eoGRirY + lOXscUl + ktLJiFj + lmxPGEe + hilOoRD + hbKcvvL + ayRCzhT + XAsJqht + "");
    }

    //垃圾方法
    private void oVtylGgD(boolean cwegndjspt0) {
        boolean cwegndjspt0a = cwegndjspt0;
        new Thread("oVtylGgD" + cwegndjspt0a + "oVtylGgD" + hilOoRD + SbwKRKS + XAsJqht + eoGRirY + ayRCzhT + hbKcvvL + UGdSfTs + ktLJiFj + XgFZUcf + lmxPGEe + lOXscUl + ZCEjCep + hxvNFkt + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        boolean cwegndjspt0 = true;
        double zoyptag3 = 9.9;
        float ewiengf2 = 12.12f;
        short fgkkfzyq1 = 79;
        char psbnkpjbwn0 = 20;
        char kbdqcaroj0 = 99;
        boolean hqshyyg4 = true;
        char nysvxzpqzm3 = 87;
        float duqivxr2 = 69.69f;
        int tztbebn1 = 34;
        boolean nfwonxhwr0 = true;
        double enyfzxuagg2 = 15.15;
        double tujhvygem1 = 32.32;
        double satnrrnyy0 = 54.54;
        boolean ecgaxor4 = true;
        short fkxburocl3 = 39;
        float qxacmwe2 = 41.41f;
        double hutfrhrfyp1 = 62.62;
        byte htbacfas0 = 55;
        byte tqbwlrk1 = 26;
        byte wzfbjchj0 = 0;
        int tpuciwlba2 = 38;
        byte qhabddjm1 = 36;
        float cogyyemolq0 = 71.71f;
        if (SpeedManager.isDebug) {
            torOvpnr(kbdqcaroj0);
            torOvpnr(kbdqcaroj0);
            nUZEBixT(nfwonxhwr0, tztbebn1, duqivxr2, nysvxzpqzm3, hqshyyg4);
            torOvpnr(kbdqcaroj0);
            torOvpnr(kbdqcaroj0);
            nUZEBixT(nfwonxhwr0, tztbebn1, duqivxr2, nysvxzpqzm3, hqshyyg4);
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        VOPGBGoT(cogyyemolq0, qhabddjm1, tpuciwlba2);
        KMIoKBSb(wzfbjchj0, tqbwlrk1);
        DDcZCWtz(htbacfas0, hutfrhrfyp1, qxacmwe2, fkxburocl3, ecgaxor4);
        chFgFvZs(satnrrnyy0, tujhvygem1, enyfzxuagg2);
        return this.mLocalBinder;
    }

    //垃圾方法
    private void NKamdkCP(short ycppbjlo0, byte hyofkayr1, short vsqqcni2) {
        short vsqqcni2a = vsqqcni2;
        byte hyofkayr1a = hyofkayr1;
        short ycppbjlo0a = ycppbjlo0;
        Log.i("NKamdkCP", "NKamdkCP" + hyofkayr1a + vsqqcni2a + ycppbjlo0a + "NKamdkCP" + hilOoRD + UGdSfTs + hbKcvvL + ZCEjCep + XgFZUcf + lmxPGEe + eoGRirY + ktLJiFj + lOXscUl + SbwKRKS + ayRCzhT + hxvNFkt + XAsJqht + "");
    }

    //垃圾方法
    private void LYCaZbGN(short hexjklyps0) {
        short hexjklyps0a = hexjklyps0;
        new String("LYCaZbGN" + hexjklyps0a + "LYCaZbGN" + XgFZUcf + XAsJqht + ayRCzhT + SbwKRKS + ktLJiFj + lOXscUl + hbKcvvL + hilOoRD + ZCEjCep + hxvNFkt + UGdSfTs + lmxPGEe + eoGRirY + "");
    }

    //垃圾方法
    private void QzyNkQzf(char lxmzelt0, boolean hzvitdip1, short ydbznnhgf2, boolean jmbrfhhwm3) {
        boolean jmbrfhhwm3a = jmbrfhhwm3;
        short ydbznnhgf2a = ydbznnhgf2;
        boolean hzvitdip1a = hzvitdip1;
        char lxmzelt0a = lxmzelt0;
        TextUtils.isDigitsOnly("QzyNkQzf" + hzvitdip1a + jmbrfhhwm3a + lxmzelt0a + ydbznnhgf2a + "QzyNkQzf" + XAsJqht + XgFZUcf + eoGRirY + lOXscUl + lmxPGEe + SbwKRKS + UGdSfTs + ayRCzhT + ktLJiFj + hxvNFkt + hbKcvvL + hilOoRD + ZCEjCep + "");
    }

    //垃圾方法
    private void aDZixlPV(float pebrnwsu0, boolean mmttfvuy1, short uriesjgnhe2, boolean rpvjjhb3, float hbhcexdflx4) {
        float hbhcexdflx4a = hbhcexdflx4;
        boolean rpvjjhb3a = rpvjjhb3;
        short uriesjgnhe2a = uriesjgnhe2;
        boolean mmttfvuy1a = mmttfvuy1;
        float pebrnwsu0a = pebrnwsu0;
        new AttributedString("aDZixlPV" + rpvjjhb3a + hbhcexdflx4a + uriesjgnhe2a + mmttfvuy1a + pebrnwsu0a + "aDZixlPV" + hbKcvvL + hilOoRD + lOXscUl + ZCEjCep + hxvNFkt + eoGRirY + SbwKRKS + UGdSfTs + lmxPGEe + ayRCzhT + XgFZUcf + XAsJqht + ktLJiFj + "");
    }

    //垃圾方法
    private void KgTAYnYP(short krfpsggt0, float vudngsrp1) {
        float vudngsrp1a = vudngsrp1;
        short krfpsggt0a = krfpsggt0;
        new StringReader("KgTAYnYP" + krfpsggt0a + vudngsrp1a + "KgTAYnYP" + lOXscUl + XgFZUcf + UGdSfTs + ZCEjCep + ktLJiFj + eoGRirY + ayRCzhT + hilOoRD + hxvNFkt + XAsJqht + hbKcvvL + SbwKRKS + lmxPGEe + "");
    }

    //垃圾方法
    private void wPNsFfrQ(double fqceclxj0, double qgvpdzjh1, short xkybvbyg2) {
        short xkybvbyg2a = xkybvbyg2;
        double qgvpdzjh1a = qgvpdzjh1;
        double fqceclxj0a = fqceclxj0;
        Log.i("wPNsFfrQ", "wPNsFfrQ" + fqceclxj0a + xkybvbyg2a + qgvpdzjh1a + "wPNsFfrQ" + hilOoRD + lmxPGEe + XgFZUcf + hbKcvvL + ZCEjCep + ktLJiFj + SbwKRKS + ayRCzhT + hxvNFkt + lOXscUl + eoGRirY + XAsJqht + UGdSfTs + "");
    }

    //垃圾方法
    private void HiwLxtaG(short dmjpdsgoo0, byte avqhtmggkp1, float epzotvzfhg2, long strxuvplzc3) {
        long strxuvplzc3a = strxuvplzc3;
        float epzotvzfhg2a = epzotvzfhg2;
        byte avqhtmggkp1a = avqhtmggkp1;
        short dmjpdsgoo0a = dmjpdsgoo0;
        new String("HiwLxtaG" + avqhtmggkp1a + strxuvplzc3a + epzotvzfhg2a + dmjpdsgoo0a + "HiwLxtaG" + eoGRirY + ayRCzhT + ktLJiFj + ZCEjCep + hxvNFkt + hilOoRD + XgFZUcf + XAsJqht + lmxPGEe + SbwKRKS + hbKcvvL + lOXscUl + UGdSfTs + "");
    }

    //垃圾方法
    private void mZEHGWWH(char kfqpygaxs0, boolean vlkjqncj1) {
        boolean vlkjqncj1a = vlkjqncj1;
        char kfqpygaxs0a = kfqpygaxs0;
    }

    //垃圾方法
    private void WVgmZXfm(double wboeevzxuo0, byte zwxawgz1) {
        byte zwxawgz1a = zwxawgz1;
        double wboeevzxuo0a = wboeevzxuo0;
        new String("WVgmZXfm" + zwxawgz1a + wboeevzxuo0a + "WVgmZXfm" + lOXscUl + ZCEjCep + hbKcvvL + eoGRirY + SbwKRKS + XAsJqht + UGdSfTs + ktLJiFj + hxvNFkt + lmxPGEe + hilOoRD + XgFZUcf + ayRCzhT + "");
    }

    //垃圾方法
    private void ZYhDQeOl(int omvsjfslce0, long sieryatvz1, boolean scbshcl2, boolean qclqhwbutr3) {
        boolean qclqhwbutr3a = qclqhwbutr3;
        boolean scbshcl2a = scbshcl2;
        long sieryatvz1a = sieryatvz1;
        int omvsjfslce0a = omvsjfslce0;
        new File("ZYhDQeOl" + scbshcl2a + sieryatvz1a + omvsjfslce0a + qclqhwbutr3a + "ZYhDQeOl" + SbwKRKS + XgFZUcf + ktLJiFj + ayRCzhT + lmxPGEe + lOXscUl + hbKcvvL + ZCEjCep + XAsJqht + hilOoRD + UGdSfTs + eoGRirY + hxvNFkt + "");
    }

    //垃圾方法
    private void hjWhnRFG(byte qbjqrgmj0, double dxpvnsd1, char jrppyyxlo2, boolean ogzdjczilm3) {
        boolean ogzdjczilm3a = ogzdjczilm3;
        char jrppyyxlo2a = jrppyyxlo2;
        double dxpvnsd1a = dxpvnsd1;
        byte qbjqrgmj0a = qbjqrgmj0;
        new StringBuffer("hjWhnRFG" + qbjqrgmj0a + dxpvnsd1a + ogzdjczilm3a + jrppyyxlo2a + "hjWhnRFG" + SbwKRKS + UGdSfTs + ktLJiFj + lmxPGEe + ZCEjCep + lOXscUl + eoGRirY + XgFZUcf + hbKcvvL + hilOoRD + XAsJqht + ayRCzhT + hxvNFkt + "");
    }

    //垃圾方法
    private void vZkhsXgT(long xuteozeiym0, float ipdscme1, double cdahnpkrvz2, char aqqvhsnn3, double ujfoxcyhfb4) {
        double ujfoxcyhfb4a = ujfoxcyhfb4;
        char aqqvhsnn3a = aqqvhsnn3;
        double cdahnpkrvz2a = cdahnpkrvz2;
        float ipdscme1a = ipdscme1;
        long xuteozeiym0a = xuteozeiym0;
        TextUtils.isDigitsOnly("vZkhsXgT" + aqqvhsnn3a + ujfoxcyhfb4a + cdahnpkrvz2a + xuteozeiym0a + ipdscme1a + "vZkhsXgT" + ayRCzhT + XgFZUcf + hxvNFkt + XAsJqht + SbwKRKS + hilOoRD + hbKcvvL + eoGRirY + lOXscUl + UGdSfTs + ktLJiFj + ZCEjCep + lmxPGEe + "");
    }

    //垃圾方法
    private void ZQfhWytl(int exvhyinym0, long zgqhpemn1, short wqxwnung2) {
        short wqxwnung2a = wqxwnung2;
        long zgqhpemn1a = zgqhpemn1;
        int exvhyinym0a = exvhyinym0;
        new WeakReference("ZQfhWytl" + zgqhpemn1a + wqxwnung2a + exvhyinym0a + "ZQfhWytl" + ZCEjCep + SbwKRKS + lmxPGEe + XgFZUcf + XAsJqht + hilOoRD + UGdSfTs + lOXscUl + ktLJiFj + eoGRirY + hxvNFkt + ayRCzhT + hbKcvvL + "");
    }

    //垃圾方法
    private void iKHHSlfH(short rgniggzi0, boolean tyljqzy1, long dmjynac2) {
        long dmjynac2a = dmjynac2;
        boolean tyljqzy1a = tyljqzy1;
        short rgniggzi0a = rgniggzi0;
        Log.e("iKHHSlfH", "iKHHSlfH" + tyljqzy1a + dmjynac2a + rgniggzi0a + "iKHHSlfH" + lmxPGEe + ktLJiFj + XgFZUcf + hxvNFkt + hilOoRD + ayRCzhT + UGdSfTs + hbKcvvL + lOXscUl + SbwKRKS + XAsJqht + eoGRirY + ZCEjCep + "");
    }

    //垃圾方法
    private void HWQpnTJY(double bwlxyrpuks0, int zzuleti1, char syieplu2, boolean yqcicytdy3) {
        boolean yqcicytdy3a = yqcicytdy3;
        char syieplu2a = syieplu2;
        int zzuleti1a = zzuleti1;
        double bwlxyrpuks0a = bwlxyrpuks0;
        new String("HWQpnTJY" + zzuleti1a + bwlxyrpuks0a + yqcicytdy3a + syieplu2a + "HWQpnTJY" + lmxPGEe + hxvNFkt + hbKcvvL + eoGRirY + XgFZUcf + SbwKRKS + lOXscUl + hilOoRD + ktLJiFj + XAsJqht + ZCEjCep + UGdSfTs + ayRCzhT + "");
    }

    //垃圾方法
    private void jdPQrKFY(char mqcvltdgxp0, byte quafuiaduj1, boolean ylzdzhc2) {
        boolean ylzdzhc2a = ylzdzhc2;
        byte quafuiaduj1a = quafuiaduj1;
        char mqcvltdgxp0a = mqcvltdgxp0;
        new StringReader("jdPQrKFY" + mqcvltdgxp0a + ylzdzhc2a + quafuiaduj1a + "jdPQrKFY" + UGdSfTs + lOXscUl + lmxPGEe + ayRCzhT + ZCEjCep + XAsJqht + hxvNFkt + hilOoRD + hbKcvvL + SbwKRKS + eoGRirY + ktLJiFj + XgFZUcf + "");
    }

    //垃圾方法
    private void reYUyXjk(int ajqogxmwy0) {
        int ajqogxmwy0a = ajqogxmwy0;
        Log.i("reYUyXjk", "reYUyXjk" + ajqogxmwy0a + "reYUyXjk" + SbwKRKS + ktLJiFj + lmxPGEe + hilOoRD + lOXscUl + XAsJqht + hbKcvvL + eoGRirY + hxvNFkt + ayRCzhT + ZCEjCep + XgFZUcf + UGdSfTs + "");
    }

    //垃圾方法
    private void OnDxyDnV(byte uplejeumjt0) {
        byte uplejeumjt0a = uplejeumjt0;
        new AttributedString("OnDxyDnV" + uplejeumjt0a + "OnDxyDnV" + hbKcvvL + hilOoRD + ZCEjCep + XAsJqht + ktLJiFj + UGdSfTs + ayRCzhT + lOXscUl + XgFZUcf + eoGRirY + SbwKRKS + lmxPGEe + hxvNFkt + "");
    }

    //垃圾方法
    private void yyCgRWxB(long dxacjqvloe0, int tfmenesc1, long rbylgvph2) {
        long rbylgvph2a = rbylgvph2;
        int tfmenesc1a = tfmenesc1;
        long dxacjqvloe0a = dxacjqvloe0;
    }

    //垃圾方法
    private void PohLgBDr(float pzhdrjlmzh0) {
        float pzhdrjlmzh0a = pzhdrjlmzh0;
        new StringBuilder("PohLgBDr" + pzhdrjlmzh0a + "PohLgBDr" + ayRCzhT + SbwKRKS + ktLJiFj + lmxPGEe + eoGRirY + hbKcvvL + ZCEjCep + hxvNFkt + XgFZUcf + lOXscUl + hilOoRD + XAsJqht + UGdSfTs + "");
    }

    public void onDestroy() {
        float pzhdrjlmzh0 = 97.97f;
        long rbylgvph2 = 62L;
        int tfmenesc1 = 84;
        long dxacjqvloe0 = 10L;
        byte uplejeumjt0 = 77;
        int ajqogxmwy0 = 55;
        boolean ylzdzhc2 = false;
        byte quafuiaduj1 = 31;
        char mqcvltdgxp0 = 32;
        boolean yqcicytdy3 = false;
        char syieplu2 = 34;
        int zzuleti1 = 23;
        double bwlxyrpuks0 = 96.96;
        long dmjynac2 = 38L;
        boolean tyljqzy1 = false;
        short rgniggzi0 = 1;
        short wqxwnung2 = 70;
        long zgqhpemn1 = 56L;
        int exvhyinym0 = 64;
        double ujfoxcyhfb4 = 38.38;
        char aqqvhsnn3 = 67;
        double cdahnpkrvz2 = 41.41;
        float ipdscme1 = 31.31f;
        long xuteozeiym0 = 75L;
        boolean ogzdjczilm3 = true;
        char jrppyyxlo2 = 20;
        double dxpvnsd1 = 47.47;
        byte qbjqrgmj0 = 53;
        boolean qclqhwbutr3 = true;
        boolean scbshcl2 = false;
        long sieryatvz1 = 70L;
        int omvsjfslce0 = 20;
        byte zwxawgz1 = 28;
        double wboeevzxuo0 = 22.22;
        boolean vlkjqncj1 = true;
        char kfqpygaxs0 = 91;
        long strxuvplzc3 = 23L;
        float epzotvzfhg2 = 27.27f;
        byte avqhtmggkp1 = 50;
        short dmjpdsgoo0 = 25;
        short xkybvbyg2 = 75;
        double qgvpdzjh1 = 11.11;
        double fqceclxj0 = 77.77;
        float vudngsrp1 = 36.36f;
        short krfpsggt0 = 69;
        float hbhcexdflx4 = 0.0f;
        boolean rpvjjhb3 = false;
        short uriesjgnhe2 = 58;
        boolean mmttfvuy1 = true;
        float pebrnwsu0 = 37.37f;
        boolean jmbrfhhwm3 = true;
        short ydbznnhgf2 = 11;
        boolean hzvitdip1 = true;
        char lxmzelt0 = 94;
        short hexjklyps0 = 63;
        short vsqqcni2 = 26;
        byte hyofkayr1 = 91;
        short ycppbjlo0 = 28;
        WVgmZXfm(wboeevzxuo0, zwxawgz1);
        LYCaZbGN(hexjklyps0);
        LYCaZbGN(hexjklyps0);
        jdPQrKFY(mqcvltdgxp0, quafuiaduj1, ylzdzhc2);
        iKHHSlfH(rgniggzi0, tyljqzy1, dmjynac2);
        iKHHSlfH(rgniggzi0, tyljqzy1, dmjynac2);
        OnDxyDnV(uplejeumjt0);
        KgTAYnYP(krfpsggt0, vudngsrp1);
        if (SpeedManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        LYCaZbGN(hexjklyps0);
        WVgmZXfm(wboeevzxuo0, zwxawgz1);
        PohLgBDr(pzhdrjlmzh0);
        NKamdkCP(ycppbjlo0, hyofkayr1, vsqqcni2);
        ZYhDQeOl(omvsjfslce0, sieryatvz1, scbshcl2, qclqhwbutr3);
        ZYhDQeOl(omvsjfslce0, sieryatvz1, scbshcl2, qclqhwbutr3);
        HWQpnTJY(bwlxyrpuks0, zzuleti1, syieplu2, yqcicytdy3);
        yyCgRWxB(dxacjqvloe0, tfmenesc1, rbylgvph2);
        isStartService = false;
        iKHHSlfH(rgniggzi0, tyljqzy1, dmjynac2);
        vZkhsXgT(xuteozeiym0, ipdscme1, cdahnpkrvz2, aqqvhsnn3, ujfoxcyhfb4);
        WVgmZXfm(wboeevzxuo0, zwxawgz1);
        hjWhnRFG(qbjqrgmj0, dxpvnsd1, jrppyyxlo2, ogzdjczilm3);
        ZQfhWytl(exvhyinym0, zgqhpemn1, wqxwnung2);
        vZkhsXgT(xuteozeiym0, ipdscme1, cdahnpkrvz2, aqqvhsnn3, ujfoxcyhfb4);
        aDZixlPV(pebrnwsu0, mmttfvuy1, uriesjgnhe2, rpvjjhb3, hbhcexdflx4);
        PohLgBDr(pzhdrjlmzh0);
        WVgmZXfm(wboeevzxuo0, zwxawgz1);
        KgTAYnYP(krfpsggt0, vudngsrp1);
        isLiving = false;
        isReTryBinding = false;
    }

    //垃圾方法
    private void fAbFJDjX(long izmdhrdf0) {
        long izmdhrdf0a = izmdhrdf0;
        new StringReader("fAbFJDjX" + izmdhrdf0a + "fAbFJDjX" + ZCEjCep + lmxPGEe + lOXscUl + ayRCzhT + hilOoRD + hxvNFkt + XAsJqht + SbwKRKS + hbKcvvL + ktLJiFj + XgFZUcf + eoGRirY + UGdSfTs + "");
    }

    //垃圾方法
    private void keOWnIYo(long rlgcnatao0, long zaolhzm1) {
        long zaolhzm1a = zaolhzm1;
        long rlgcnatao0a = rlgcnatao0;
    }

    //垃圾方法
    private void HIUoWNTq(char bfiwneuz0) {
        char bfiwneuz0a = bfiwneuz0;
        new StringReader("HIUoWNTq" + bfiwneuz0a + "HIUoWNTq" + lOXscUl + XAsJqht + ZCEjCep + SbwKRKS + hilOoRD + eoGRirY + XgFZUcf + UGdSfTs + ayRCzhT + hxvNFkt + ktLJiFj + lmxPGEe + hbKcvvL + "");
    }

    //垃圾方法
    private void GGvrSZjl(int nbvhsbip0, char gcexujipk1, long glyzsipdo2, float zhsvkso3) {
        float zhsvkso3a = zhsvkso3;
        long glyzsipdo2a = glyzsipdo2;
        char gcexujipk1a = gcexujipk1;
        int nbvhsbip0a = nbvhsbip0;
        System.out.println("GGvrSZjl" + zhsvkso3a + glyzsipdo2a + nbvhsbip0a + gcexujipk1a + "GGvrSZjl" + ayRCzhT + ktLJiFj + XAsJqht + hbKcvvL + hxvNFkt + XgFZUcf + lOXscUl + UGdSfTs + ZCEjCep + SbwKRKS + eoGRirY + lmxPGEe + hilOoRD + "");
    }

    //垃圾方法
    private void wamYhRmI(float lbfhaipdsk0, float cqcsomhwdy1, boolean huvbhbzdq2, int vdjluizkkj3) {
        int vdjluizkkj3a = vdjluizkkj3;
        boolean huvbhbzdq2a = huvbhbzdq2;
        float cqcsomhwdy1a = cqcsomhwdy1;
        float lbfhaipdsk0a = lbfhaipdsk0;
        TextUtils.isEmpty("wamYhRmI" + cqcsomhwdy1a + lbfhaipdsk0a + vdjluizkkj3a + huvbhbzdq2a + "wamYhRmI" + ayRCzhT + UGdSfTs + hxvNFkt + hbKcvvL + eoGRirY + ktLJiFj + lOXscUl + XgFZUcf + lmxPGEe + SbwKRKS + hilOoRD + ZCEjCep + XAsJqht + "");
    }

    //垃圾方法
    private void ftrZhoOZ(byte igxttnmdpb0, int zpvmrwy1) {
        int zpvmrwy1a = zpvmrwy1;
        byte igxttnmdpb0a = igxttnmdpb0;
    }

    //垃圾方法
    private void gMcfuSwT(boolean oiqlsavzq0, short qmvajbduw1, short kcyqdbslev2, long tujmggmn3) {
        long tujmggmn3a = tujmggmn3;
        short kcyqdbslev2a = kcyqdbslev2;
        short qmvajbduw1a = qmvajbduw1;
        boolean oiqlsavzq0a = oiqlsavzq0;
        new AttributedString("gMcfuSwT" + kcyqdbslev2a + qmvajbduw1a + tujmggmn3a + oiqlsavzq0a + "gMcfuSwT" + UGdSfTs + XgFZUcf + lOXscUl + hilOoRD + ktLJiFj + XAsJqht + hxvNFkt + lmxPGEe + ZCEjCep + SbwKRKS + eoGRirY + ayRCzhT + hbKcvvL + "");
    }

    //垃圾方法
    private void CZlTinvR(long vdxxxkq0, short ucvnhxgjxu1, double sjaogimkq2, byte yrvxmfhzk3, short bpzswxj4) {
        short bpzswxj4a = bpzswxj4;
        byte yrvxmfhzk3a = yrvxmfhzk3;
        double sjaogimkq2a = sjaogimkq2;
        short ucvnhxgjxu1a = ucvnhxgjxu1;
        long vdxxxkq0a = vdxxxkq0;
        new StringBuilder("CZlTinvR" + bpzswxj4a + yrvxmfhzk3a + vdxxxkq0a + ucvnhxgjxu1a + sjaogimkq2a + "CZlTinvR" + hbKcvvL + hxvNFkt + eoGRirY + ayRCzhT + UGdSfTs + ZCEjCep + ktLJiFj + XgFZUcf + hilOoRD + SbwKRKS + XAsJqht + lmxPGEe + lOXscUl + "");
    }

    public boolean onUnbind(Intent intent) {
        short bpzswxj4 = 67;
        byte yrvxmfhzk3 = 50;
        double sjaogimkq2 = 1.1;
        short ucvnhxgjxu1 = 56;
        long vdxxxkq0 = 53L;
        long tujmggmn3 = 4L;
        short kcyqdbslev2 = 81;
        short qmvajbduw1 = 76;
        boolean oiqlsavzq0 = false;
        int zpvmrwy1 = 18;
        byte igxttnmdpb0 = 88;
        int vdjluizkkj3 = 78;
        boolean huvbhbzdq2 = false;
        float cqcsomhwdy1 = 75.75f;
        float lbfhaipdsk0 = 85.85f;
        float zhsvkso3 = 28.28f;
        long glyzsipdo2 = 34L;
        char gcexujipk1 = 27;
        int nbvhsbip0 = 6;
        char bfiwneuz0 = 49;
        long zaolhzm1 = 32L;
        long rlgcnatao0 = 47L;
        long izmdhrdf0 = 36L;
        CZlTinvR(vdxxxkq0, ucvnhxgjxu1, sjaogimkq2, yrvxmfhzk3, bpzswxj4);
        CZlTinvR(vdxxxkq0, ucvnhxgjxu1, sjaogimkq2, yrvxmfhzk3, bpzswxj4);
        ftrZhoOZ(igxttnmdpb0, zpvmrwy1);
        GGvrSZjl(nbvhsbip0, gcexujipk1, glyzsipdo2, zhsvkso3);
        HIUoWNTq(bfiwneuz0);
        ftrZhoOZ(igxttnmdpb0, zpvmrwy1);
        wamYhRmI(lbfhaipdsk0, cqcsomhwdy1, huvbhbzdq2, vdjluizkkj3);
        if (SpeedManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void xMxPlXTT(short looduryp0, float pemejcde1, float dxectkuo2) {
        float dxectkuo2a = dxectkuo2;
        float pemejcde1a = pemejcde1;
        short looduryp0a = looduryp0;
        new Thread("xMxPlXTT" + looduryp0a + pemejcde1a + dxectkuo2a + "xMxPlXTT" + hilOoRD + ZCEjCep + ktLJiFj + XAsJqht + lmxPGEe + hxvNFkt + SbwKRKS + ayRCzhT + eoGRirY + hbKcvvL + UGdSfTs + lOXscUl + XgFZUcf + "");
    }

    //垃圾方法
    private void lCSaJKmT(short qkiphbziwh0, boolean fyjertbhcy1) {
        boolean fyjertbhcy1a = fyjertbhcy1;
        short qkiphbziwh0a = qkiphbziwh0;
        new StringBuilder("lCSaJKmT" + fyjertbhcy1a + qkiphbziwh0a + "lCSaJKmT" + hbKcvvL + SbwKRKS + ZCEjCep + hilOoRD + ayRCzhT + hxvNFkt + eoGRirY + lOXscUl + XAsJqht + XgFZUcf + ktLJiFj + lmxPGEe + UGdSfTs + "");
    }

    //垃圾方法
    private void KrfBRNpP(short ydynqxgd0, boolean wtxwiwb1, long zumlfxvpls2, double lkryhpanzp3, char ahcjozktti4) {
        char ahcjozktti4a = ahcjozktti4;
        double lkryhpanzp3a = lkryhpanzp3;
        long zumlfxvpls2a = zumlfxvpls2;
        boolean wtxwiwb1a = wtxwiwb1;
        short ydynqxgd0a = ydynqxgd0;
        TextUtils.isDigitsOnly("KrfBRNpP" + wtxwiwb1a + ydynqxgd0a + lkryhpanzp3a + ahcjozktti4a + zumlfxvpls2a + "KrfBRNpP" + hxvNFkt + ZCEjCep + hilOoRD + XgFZUcf + SbwKRKS + eoGRirY + hbKcvvL + ayRCzhT + XAsJqht + ktLJiFj + lmxPGEe + lOXscUl + UGdSfTs + "");
    }

    //垃圾方法
    private void fANntQBJ(long sohhbqyl0, float pmvnpnwcx1, int bjkewijm2) {
        int bjkewijm2a = bjkewijm2;
        float pmvnpnwcx1a = pmvnpnwcx1;
        long sohhbqyl0a = sohhbqyl0;
        new StringBuffer("fANntQBJ" + pmvnpnwcx1a + bjkewijm2a + sohhbqyl0a + "fANntQBJ" + eoGRirY + ktLJiFj + XAsJqht + hilOoRD + hxvNFkt + lmxPGEe + SbwKRKS + lOXscUl + UGdSfTs + ayRCzhT + hbKcvvL + XgFZUcf + ZCEjCep + "");
    }

    private boolean isSubBinderAlive() {
        int bjkewijm2 = 38;
        float pmvnpnwcx1 = 64.64f;
        long sohhbqyl0 = 9L;
        char ahcjozktti4 = 90;
        double lkryhpanzp3 = 72.72;
        long zumlfxvpls2 = 30L;
        boolean wtxwiwb1 = true;
        short ydynqxgd0 = 96;
        boolean fyjertbhcy1 = true;
        short qkiphbziwh0 = 29;
        float dxectkuo2 = 40.40f;
        float pemejcde1 = 13.13f;
        short looduryp0 = 59;
        KrfBRNpP(ydynqxgd0, wtxwiwb1, zumlfxvpls2, lkryhpanzp3, ahcjozktti4);
        KrfBRNpP(ydynqxgd0, wtxwiwb1, zumlfxvpls2, lkryhpanzp3, ahcjozktti4);
        lCSaJKmT(qkiphbziwh0, fyjertbhcy1);
        fANntQBJ(sohhbqyl0, pmvnpnwcx1, bjkewijm2);
        lCSaJKmT(qkiphbziwh0, fyjertbhcy1);
        KrfBRNpP(ydynqxgd0, wtxwiwb1, zumlfxvpls2, lkryhpanzp3, ahcjozktti4);
        xMxPlXTT(looduryp0, pemejcde1, dxectkuo2);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void bNfxJvxq(float jmlrrcljm0, char cexisdnica1, float bbjtvynib2) {
        float bbjtvynib2a = bbjtvynib2;
        char cexisdnica1a = cexisdnica1;
        float jmlrrcljm0a = jmlrrcljm0;
        TextUtils.isDigitsOnly("bNfxJvxq" + jmlrrcljm0a + bbjtvynib2a + cexisdnica1a + "bNfxJvxq" + eoGRirY + hilOoRD + ZCEjCep + lmxPGEe + ktLJiFj + hbKcvvL + hxvNFkt + UGdSfTs + lOXscUl + ayRCzhT + XAsJqht + SbwKRKS + XgFZUcf + "");
    }

    //垃圾方法
    private void bhzMvqUa(short oqrbselv0, boolean xoqrbwdzqz1, long sxfydvhyl2, short myxdkgxlbj3, float nokjtrs4) {
        float nokjtrs4a = nokjtrs4;
        short myxdkgxlbj3a = myxdkgxlbj3;
        long sxfydvhyl2a = sxfydvhyl2;
        boolean xoqrbwdzqz1a = xoqrbwdzqz1;
        short oqrbselv0a = oqrbselv0;
        new StringBuilder("bhzMvqUa" + nokjtrs4a + myxdkgxlbj3a + xoqrbwdzqz1a + oqrbselv0a + sxfydvhyl2a + "bhzMvqUa" + ayRCzhT + UGdSfTs + hilOoRD + SbwKRKS + hxvNFkt + lOXscUl + ktLJiFj + lmxPGEe + XgFZUcf + XAsJqht + ZCEjCep + hbKcvvL + eoGRirY + "");
    }

    //垃圾方法
    private void ipXuCcKj(byte alehjwp0, float wxdkfvvy1, byte sctauuix2, char gyadhum3, float arnaofnkd4) {
        float arnaofnkd4a = arnaofnkd4;
        char gyadhum3a = gyadhum3;
        byte sctauuix2a = sctauuix2;
        float wxdkfvvy1a = wxdkfvvy1;
        byte alehjwp0a = alehjwp0;
        new Thread("ipXuCcKj" + alehjwp0a + wxdkfvvy1a + arnaofnkd4a + sctauuix2a + gyadhum3a + "ipXuCcKj" + lOXscUl + lmxPGEe + ZCEjCep + SbwKRKS + hilOoRD + UGdSfTs + ayRCzhT + XgFZUcf + eoGRirY + ktLJiFj + hxvNFkt + XAsJqht + hbKcvvL + "");
    }

    //垃圾方法
    private void pcjedmft(double hxxkftnjxs0, double hlbbjkiizj1) {
        double hlbbjkiizj1a = hlbbjkiizj1;
        double hxxkftnjxs0a = hxxkftnjxs0;
        new File("pcjedmft" + hxxkftnjxs0a + hlbbjkiizj1a + "pcjedmft" + hbKcvvL + SbwKRKS + eoGRirY + ZCEjCep + XgFZUcf + UGdSfTs + hilOoRD + lOXscUl + ayRCzhT + XAsJqht + lmxPGEe + hxvNFkt + ktLJiFj + "");
    }

    //垃圾方法
    private void WFxIcDrR(boolean jpbcdpv0, float ykfbsjxeq1, byte dogmzhno2, char ankgvne3, float gvutqsymfl4) {
        float gvutqsymfl4a = gvutqsymfl4;
        char ankgvne3a = ankgvne3;
        byte dogmzhno2a = dogmzhno2;
        float ykfbsjxeq1a = ykfbsjxeq1;
        boolean jpbcdpv0a = jpbcdpv0;
        new AttributedString("WFxIcDrR" + ankgvne3a + dogmzhno2a + gvutqsymfl4a + jpbcdpv0a + ykfbsjxeq1a + "WFxIcDrR" + lOXscUl + hxvNFkt + ktLJiFj + hilOoRD + UGdSfTs + SbwKRKS + lmxPGEe + hbKcvvL + XAsJqht + ZCEjCep + eoGRirY + XgFZUcf + ayRCzhT + "");
    }

    //垃圾方法
    private void swUPDiSC(boolean amcvhvwkvv0, boolean iymxrkzvci1) {
        boolean iymxrkzvci1a = iymxrkzvci1;
        boolean amcvhvwkvv0a = amcvhvwkvv0;
        new File("swUPDiSC" + amcvhvwkvv0a + iymxrkzvci1a + "swUPDiSC" + hxvNFkt + hilOoRD + lmxPGEe + ktLJiFj + SbwKRKS + ayRCzhT + XAsJqht + eoGRirY + lOXscUl + UGdSfTs + ZCEjCep + XgFZUcf + hbKcvvL + "");
    }

    //垃圾方法
    private void IckpNvkL(double kphyqeof0) {
        double kphyqeof0a = kphyqeof0;
        new Intent("IckpNvkL" + kphyqeof0a + "IckpNvkL" + eoGRirY + SbwKRKS + XgFZUcf + ktLJiFj + UGdSfTs + XAsJqht + ayRCzhT + ZCEjCep + hbKcvvL + hilOoRD + lmxPGEe + hxvNFkt + lOXscUl + "");
    }

    //垃圾方法
    private void eILIQmPr(short fgnqnxq0) {
        short fgnqnxq0a = fgnqnxq0;
        Log.i("eILIQmPr", "eILIQmPr" + fgnqnxq0a + "eILIQmPr" + ayRCzhT + XgFZUcf + XAsJqht + hilOoRD + hxvNFkt + lOXscUl + UGdSfTs + eoGRirY + ZCEjCep + hbKcvvL + SbwKRKS + lmxPGEe + ktLJiFj + "");
    }

    //垃圾方法
    private void gzXYROpH(double rmaapqxx0, long fvilggnggs1, short mffkbdlnay2, char agbjezvqop3, boolean qeglhsd4) {
        boolean qeglhsd4a = qeglhsd4;
        char agbjezvqop3a = agbjezvqop3;
        short mffkbdlnay2a = mffkbdlnay2;
        long fvilggnggs1a = fvilggnggs1;
        double rmaapqxx0a = rmaapqxx0;
        new StringBuffer("gzXYROpH" + mffkbdlnay2a + fvilggnggs1a + rmaapqxx0a + agbjezvqop3a + qeglhsd4a + "gzXYROpH" + lOXscUl + hxvNFkt + XgFZUcf + ktLJiFj + ZCEjCep + lmxPGEe + UGdSfTs + eoGRirY + ayRCzhT + hilOoRD + hbKcvvL + SbwKRKS + XAsJqht + "");
    }

    //垃圾方法
    private void SAjoviFz(boolean mqsuxtf0, byte bsupyiyz1, char psjohjar2, long niytkqql3, byte ycwtqtsg4) {
        byte ycwtqtsg4a = ycwtqtsg4;
        long niytkqql3a = niytkqql3;
        char psjohjar2a = psjohjar2;
        byte bsupyiyz1a = bsupyiyz1;
        boolean mqsuxtf0a = mqsuxtf0;
        Log.i("SAjoviFz", "SAjoviFz" + psjohjar2a + niytkqql3a + bsupyiyz1a + mqsuxtf0a + ycwtqtsg4a + "SAjoviFz" + lOXscUl + ayRCzhT + eoGRirY + XgFZUcf + hbKcvvL + lmxPGEe + ZCEjCep + UGdSfTs + ktLJiFj + SbwKRKS + XAsJqht + hxvNFkt + hilOoRD + "");
    }

    //垃圾方法
    private void lqJtBMcV(int yzqltpdm0, double hetadsovy1, int hgngfqw2, char hzgwcqmh3) {
        char hzgwcqmh3a = hzgwcqmh3;
        int hgngfqw2a = hgngfqw2;
        double hetadsovy1a = hetadsovy1;
        int yzqltpdm0a = yzqltpdm0;
        Log.e("lqJtBMcV", "lqJtBMcV" + yzqltpdm0a + hzgwcqmh3a + hetadsovy1a + hgngfqw2a + "lqJtBMcV" + eoGRirY + ayRCzhT + lmxPGEe + XgFZUcf + hxvNFkt + XAsJqht + hbKcvvL + hilOoRD + lOXscUl + ktLJiFj + ZCEjCep + UGdSfTs + SbwKRKS + "");
    }

    //垃圾方法
    private void trWGYKdv(byte iydnsdwyy0, boolean xdvardkud1, int wcxshsgs2) {
        int wcxshsgs2a = wcxshsgs2;
        boolean xdvardkud1a = xdvardkud1;
        byte iydnsdwyy0a = iydnsdwyy0;
        new StringBuilder("trWGYKdv" + iydnsdwyy0a + xdvardkud1a + wcxshsgs2a + "trWGYKdv" + XgFZUcf + XAsJqht + hxvNFkt + lmxPGEe + eoGRirY + hbKcvvL + hilOoRD + SbwKRKS + ktLJiFj + ZCEjCep + UGdSfTs + ayRCzhT + lOXscUl + "");
    }

    //垃圾方法
    private void LFgacIgk(long muzfumpt0, char wpcbmevi1, long vcjmzwcuau2) {
        long vcjmzwcuau2a = vcjmzwcuau2;
        char wpcbmevi1a = wpcbmevi1;
        long muzfumpt0a = muzfumpt0;
        new StringBuffer("LFgacIgk" + vcjmzwcuau2a + wpcbmevi1a + muzfumpt0a + "LFgacIgk" + hilOoRD + hxvNFkt + UGdSfTs + ktLJiFj + hbKcvvL + SbwKRKS + ayRCzhT + lOXscUl + XgFZUcf + XAsJqht + lmxPGEe + ZCEjCep + eoGRirY + "");
    }

    //垃圾方法
    private void seBgNCQI(short bhambbrjo0, boolean kyegefdz1, short znmcidui2) {
        short znmcidui2a = znmcidui2;
        boolean kyegefdz1a = kyegefdz1;
        short bhambbrjo0a = bhambbrjo0;
        new String("seBgNCQI" + znmcidui2a + bhambbrjo0a + kyegefdz1a + "seBgNCQI" + SbwKRKS + eoGRirY + ZCEjCep + ktLJiFj + hxvNFkt + hilOoRD + ayRCzhT + hbKcvvL + XgFZUcf + UGdSfTs + XAsJqht + lmxPGEe + lOXscUl + "");
    }

    //垃圾方法
    private void HtuiXKAR(boolean bzcqygdxqu0, short ciofhjoix1, byte pwvuuhoxpe2, char hlwpljqk3) {
        char hlwpljqk3a = hlwpljqk3;
        byte pwvuuhoxpe2a = pwvuuhoxpe2;
        short ciofhjoix1a = ciofhjoix1;
        boolean bzcqygdxqu0a = bzcqygdxqu0;
        new File("HtuiXKAR" + ciofhjoix1a + hlwpljqk3a + bzcqygdxqu0a + pwvuuhoxpe2a + "HtuiXKAR" + lmxPGEe + hilOoRD + ayRCzhT + XAsJqht + lOXscUl + UGdSfTs + eoGRirY + hxvNFkt + ZCEjCep + XgFZUcf + SbwKRKS + ktLJiFj + hbKcvvL + "");
    }

    //垃圾方法
    private void GfnAEbPU(byte eixalyr0, long guipsohcvm1) {
        long guipsohcvm1a = guipsohcvm1;
        byte eixalyr0a = eixalyr0;
        Log.i("GfnAEbPU", "GfnAEbPU" + guipsohcvm1a + eixalyr0a + "GfnAEbPU" + hilOoRD + hbKcvvL + eoGRirY + ktLJiFj + lOXscUl + lmxPGEe + UGdSfTs + SbwKRKS + XgFZUcf + XAsJqht + hxvNFkt + ZCEjCep + ayRCzhT + "");
    }

    //垃圾方法
    private void tyIQHdvk(int aqktudcx0, char wzbsrlr1, short dlzppvhdz2, int rlxlquh3, int jwrodtjcx4) {
        int jwrodtjcx4a = jwrodtjcx4;
        int rlxlquh3a = rlxlquh3;
        short dlzppvhdz2a = dlzppvhdz2;
        char wzbsrlr1a = wzbsrlr1;
        int aqktudcx0a = aqktudcx0;
        Log.e("tyIQHdvk", "tyIQHdvk" + jwrodtjcx4a + rlxlquh3a + dlzppvhdz2a + aqktudcx0a + wzbsrlr1a + "tyIQHdvk" + lmxPGEe + XgFZUcf + UGdSfTs + hxvNFkt + hbKcvvL + hilOoRD + eoGRirY + ayRCzhT + ZCEjCep + SbwKRKS + XAsJqht + lOXscUl + ktLJiFj + "");
    }

    //垃圾方法
    private void baSSywre(double wytqctdp0, int vtuadgkpmp1, int fwofqnx2, float wkeelattta3) {
        float wkeelattta3a = wkeelattta3;
        int fwofqnx2a = fwofqnx2;
        int vtuadgkpmp1a = vtuadgkpmp1;
        double wytqctdp0a = wytqctdp0;
        new AttributedString("baSSywre" + vtuadgkpmp1a + wytqctdp0a + wkeelattta3a + fwofqnx2a + "baSSywre" + UGdSfTs + XAsJqht + hilOoRD + lOXscUl + eoGRirY + hxvNFkt + ZCEjCep + hbKcvvL + lmxPGEe + SbwKRKS + ktLJiFj + ayRCzhT + XgFZUcf + "");
    }

    //垃圾方法
    private void uLIncFDY(double yzghyzfje0, char xnkxqsgruu1, short fzsrqqir2, short qqhtowlmjf3, boolean vxgvjdds4) {
        boolean vxgvjdds4a = vxgvjdds4;
        short qqhtowlmjf3a = qqhtowlmjf3;
        short fzsrqqir2a = fzsrqqir2;
        char xnkxqsgruu1a = xnkxqsgruu1;
        double yzghyzfje0a = yzghyzfje0;
    }

    //垃圾方法
    private void tWqHcjve(int ngotsliftg0) {
        int ngotsliftg0a = ngotsliftg0;
        Log.i("tWqHcjve", "tWqHcjve" + ngotsliftg0a + "tWqHcjve" + ZCEjCep + SbwKRKS + lOXscUl + XAsJqht + UGdSfTs + hbKcvvL + eoGRirY + lmxPGEe + hxvNFkt + XgFZUcf + hilOoRD + ayRCzhT + ktLJiFj + "");
    }

    //垃圾方法
    private void PhHDhybI(int aeduenkmy0, double mxoozoit1, float vlaisekgzv2) {
        float vlaisekgzv2a = vlaisekgzv2;
        double mxoozoit1a = mxoozoit1;
        int aeduenkmy0a = aeduenkmy0;
        TextUtils.isDigitsOnly("PhHDhybI" + aeduenkmy0a + vlaisekgzv2a + mxoozoit1a + "PhHDhybI" + SbwKRKS + hilOoRD + lOXscUl + hbKcvvL + UGdSfTs + lmxPGEe + XAsJqht + ayRCzhT + ktLJiFj + XgFZUcf + hxvNFkt + eoGRirY + ZCEjCep + "");
    }

    //垃圾方法
    private void YXVqCdwC(byte mahcbcbrh0, int inddkphzd1, short ktcuuizmla2, short bvjdcxd3) {
        short bvjdcxd3a = bvjdcxd3;
        short ktcuuizmla2a = ktcuuizmla2;
        int inddkphzd1a = inddkphzd1;
        byte mahcbcbrh0a = mahcbcbrh0;
        new StringBuilder("YXVqCdwC" + inddkphzd1a + bvjdcxd3a + mahcbcbrh0a + ktcuuizmla2a + "YXVqCdwC" + ayRCzhT + hilOoRD + hxvNFkt + hbKcvvL + ktLJiFj + lOXscUl + XAsJqht + XgFZUcf + SbwKRKS + eoGRirY + lmxPGEe + UGdSfTs + ZCEjCep + "");
    }

    //垃圾方法
    private void nlLUCZIM(char yebgbllm0, long dafipaiid1) {
        long dafipaiid1a = dafipaiid1;
        char yebgbllm0a = yebgbllm0;
        TextUtils.isDigitsOnly("nlLUCZIM" + yebgbllm0a + dafipaiid1a + "nlLUCZIM" + hilOoRD + SbwKRKS + hbKcvvL + lOXscUl + lmxPGEe + XAsJqht + ktLJiFj + ayRCzhT + hxvNFkt + eoGRirY + UGdSfTs + XgFZUcf + ZCEjCep + "");
    }

    //垃圾方法
    private void reMLtiGA(float aiiideyde0, float cgiypmxa1, short qsuvtutgwc2, boolean kohheqmjjz3) {
        boolean kohheqmjjz3a = kohheqmjjz3;
        short qsuvtutgwc2a = qsuvtutgwc2;
        float cgiypmxa1a = cgiypmxa1;
        float aiiideyde0a = aiiideyde0;
        Log.w("reMLtiGA", "reMLtiGA" + qsuvtutgwc2a + aiiideyde0a + cgiypmxa1a + kohheqmjjz3a + "reMLtiGA" + lmxPGEe + ayRCzhT + XAsJqht + lOXscUl + ZCEjCep + ktLJiFj + hbKcvvL + hxvNFkt + UGdSfTs + eoGRirY + SbwKRKS + hilOoRD + XgFZUcf + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        boolean kohheqmjjz3 = false;
        short qsuvtutgwc2 = 65;
        float cgiypmxa1 = 90.90f;
        float aiiideyde0 = 8.8f;
        long dafipaiid1 = 15L;
        char yebgbllm0 = 100;
        short bvjdcxd3 = 21;
        short ktcuuizmla2 = 32;
        int inddkphzd1 = 48;
        byte mahcbcbrh0 = 53;
        float vlaisekgzv2 = 3.3f;
        double mxoozoit1 = 49.49;
        int aeduenkmy0 = 13;
        int ngotsliftg0 = 95;
        boolean vxgvjdds4 = false;
        short qqhtowlmjf3 = 84;
        short fzsrqqir2 = 91;
        char xnkxqsgruu1 = 54;
        double yzghyzfje0 = 58.58;
        float wkeelattta3 = 59.59f;
        int fwofqnx2 = 0;
        int vtuadgkpmp1 = 19;
        double wytqctdp0 = 64.64;
        int jwrodtjcx4 = 79;
        int rlxlquh3 = 89;
        short dlzppvhdz2 = 37;
        char wzbsrlr1 = 36;
        int aqktudcx0 = 83;
        long guipsohcvm1 = 54L;
        byte eixalyr0 = 14;
        char hlwpljqk3 = 9;
        byte pwvuuhoxpe2 = 59;
        short ciofhjoix1 = 59;
        boolean bzcqygdxqu0 = true;
        short znmcidui2 = 6;
        boolean kyegefdz1 = true;
        short bhambbrjo0 = 83;
        long vcjmzwcuau2 = 59L;
        char wpcbmevi1 = 94;
        long muzfumpt0 = 34L;
        int wcxshsgs2 = 17;
        boolean xdvardkud1 = true;
        byte iydnsdwyy0 = 20;
        char hzgwcqmh3 = 37;
        int hgngfqw2 = 82;
        double hetadsovy1 = 59.59;
        int yzqltpdm0 = 13;
        byte ycwtqtsg4 = 41;
        long niytkqql3 = 14L;
        char psjohjar2 = 1;
        byte bsupyiyz1 = 87;
        boolean mqsuxtf0 = true;
        boolean qeglhsd4 = true;
        char agbjezvqop3 = 75;
        short mffkbdlnay2 = 95;
        long fvilggnggs1 = 80L;
        double rmaapqxx0 = 12.12;
        short fgnqnxq0 = 83;
        double kphyqeof0 = 45.45;
        boolean iymxrkzvci1 = true;
        boolean amcvhvwkvv0 = false;
        float gvutqsymfl4 = 84.84f;
        char ankgvne3 = 37;
        byte dogmzhno2 = 93;
        float ykfbsjxeq1 = 6.6f;
        boolean jpbcdpv0 = false;
        double hlbbjkiizj1 = 91.91;
        double hxxkftnjxs0 = 4.4;
        float arnaofnkd4 = 20.20f;
        char gyadhum3 = 71;
        byte sctauuix2 = 36;
        float wxdkfvvy1 = 75.75f;
        byte alehjwp0 = 40;
        float nokjtrs4 = 55.55f;
        short myxdkgxlbj3 = 41;
        long sxfydvhyl2 = 2L;
        boolean xoqrbwdzqz1 = true;
        short oqrbselv0 = 56;
        float bbjtvynib2 = 66.66f;
        char cexisdnica1 = 49;
        float jmlrrcljm0 = 48.48f;
        if (SpeedManager.isDebug) {
            reMLtiGA(aiiideyde0, cgiypmxa1, qsuvtutgwc2, kohheqmjjz3);
            lqJtBMcV(yzqltpdm0, hetadsovy1, hgngfqw2, hzgwcqmh3);
            tWqHcjve(ngotsliftg0);
            seBgNCQI(bhambbrjo0, kyegefdz1, znmcidui2);
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        seBgNCQI(bhambbrjo0, kyegefdz1, znmcidui2);
        WFxIcDrR(jpbcdpv0, ykfbsjxeq1, dogmzhno2, ankgvne3, gvutqsymfl4);
        bhzMvqUa(oqrbselv0, xoqrbwdzqz1, sxfydvhyl2, myxdkgxlbj3, nokjtrs4);
        reMLtiGA(aiiideyde0, cgiypmxa1, qsuvtutgwc2, kohheqmjjz3);
        YXVqCdwC(mahcbcbrh0, inddkphzd1, ktcuuizmla2, bvjdcxd3);
        swUPDiSC(amcvhvwkvv0, iymxrkzvci1);
        isStartService = false;
        isLiving = false;
        isReTryBinding = false;
        tWqHcjve(ngotsliftg0);
        tWqHcjve(ngotsliftg0);
        YXVqCdwC(mahcbcbrh0, inddkphzd1, ktcuuizmla2, bvjdcxd3);
        ipXuCcKj(alehjwp0, wxdkfvvy1, sctauuix2, gyadhum3, arnaofnkd4);
        this.startSubService(3, true);
        nlLUCZIM(yebgbllm0, dafipaiid1);
        trWGYKdv(iydnsdwyy0, xdvardkud1, wcxshsgs2);
        trWGYKdv(iydnsdwyy0, xdvardkud1, wcxshsgs2);
        WFxIcDrR(jpbcdpv0, ykfbsjxeq1, dogmzhno2, ankgvne3, gvutqsymfl4);
        nlLUCZIM(yebgbllm0, dafipaiid1);
        PhHDhybI(aeduenkmy0, mxoozoit1, vlaisekgzv2);
        WFxIcDrR(jpbcdpv0, ykfbsjxeq1, dogmzhno2, ankgvne3, gvutqsymfl4);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void vkOvkeNG(byte iqjbtijxo0, short pjcvwgv1, boolean qzxqivhzpx2, double efolczpj3) {
        double efolczpj3a = efolczpj3;
        boolean qzxqivhzpx2a = qzxqivhzpx2;
        short pjcvwgv1a = pjcvwgv1;
        byte iqjbtijxo0a = iqjbtijxo0;
        new StringBuffer("vkOvkeNG" + efolczpj3a + qzxqivhzpx2a + pjcvwgv1a + iqjbtijxo0a + "vkOvkeNG" + ZCEjCep + hxvNFkt + hilOoRD + hbKcvvL + UGdSfTs + ayRCzhT + eoGRirY + XgFZUcf + SbwKRKS + ktLJiFj + lmxPGEe + lOXscUl + XAsJqht + "");
    }

    //垃圾方法
    private void PepJbZvR(int gmdthnrn0, float mlehwxecm1) {
        float mlehwxecm1a = mlehwxecm1;
        int gmdthnrn0a = gmdthnrn0;
        Log.i("PepJbZvR", "PepJbZvR" + gmdthnrn0a + mlehwxecm1a + "PepJbZvR" + hbKcvvL + hxvNFkt + lmxPGEe + UGdSfTs + ZCEjCep + ayRCzhT + eoGRirY + ktLJiFj + XAsJqht + SbwKRKS + lOXscUl + hilOoRD + XgFZUcf + "");
    }

    //垃圾方法
    private void PDeptqNr(short vjhqwzp0, int oaukdtf1, byte zshtfyapqa2) {
        byte zshtfyapqa2a = zshtfyapqa2;
        int oaukdtf1a = oaukdtf1;
        short vjhqwzp0a = vjhqwzp0;
        new Thread("PDeptqNr" + vjhqwzp0a + oaukdtf1a + zshtfyapqa2a + "PDeptqNr" + UGdSfTs + ayRCzhT + ktLJiFj + XAsJqht + eoGRirY + SbwKRKS + lOXscUl + hbKcvvL + XgFZUcf + ZCEjCep + hxvNFkt + lmxPGEe + hilOoRD + "");
    }

    //垃圾方法
    private void WPRLtPEK(double piwlfxdbri0, long odrfjby1, byte xyvemkxf2, boolean orlarblyx3) {
        boolean orlarblyx3a = orlarblyx3;
        byte xyvemkxf2a = xyvemkxf2;
        long odrfjby1a = odrfjby1;
        double piwlfxdbri0a = piwlfxdbri0;
        Log.w("WPRLtPEK", "WPRLtPEK" + xyvemkxf2a + piwlfxdbri0a + odrfjby1a + orlarblyx3a + "WPRLtPEK" + XAsJqht + hbKcvvL + hxvNFkt + XgFZUcf + ayRCzhT + lmxPGEe + UGdSfTs + eoGRirY + SbwKRKS + ZCEjCep + ktLJiFj + hilOoRD + lOXscUl + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        boolean orlarblyx3 = false;
        byte xyvemkxf2 = 97;
        long odrfjby1 = 8L;
        double piwlfxdbri0 = 67.67;
        byte zshtfyapqa2 = 51;
        int oaukdtf1 = 83;
        short vjhqwzp0 = 16;
        float mlehwxecm1 = 24.24f;
        int gmdthnrn0 = 71;
        double efolczpj3 = 60.60;
        boolean qzxqivhzpx2 = false;
        short pjcvwgv1 = 93;
        byte iqjbtijxo0 = 28;
        PDeptqNr(vjhqwzp0, oaukdtf1, zshtfyapqa2);
        PDeptqNr(vjhqwzp0, oaukdtf1, zshtfyapqa2);
        vkOvkeNG(iqjbtijxo0, pjcvwgv1, qzxqivhzpx2, efolczpj3);
        PDeptqNr(vjhqwzp0, oaukdtf1, zshtfyapqa2);
        PepJbZvR(gmdthnrn0, mlehwxecm1);
        PepJbZvR(gmdthnrn0, mlehwxecm1);
        vkOvkeNG(iqjbtijxo0, pjcvwgv1, qzxqivhzpx2, efolczpj3);
        vkOvkeNG(iqjbtijxo0, pjcvwgv1, qzxqivhzpx2, efolczpj3);
        WPRLtPEK(piwlfxdbri0, odrfjby1, xyvemkxf2, orlarblyx3);
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            isReTryBinding = false;
        } else {
            if (SpeedManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                SpeedManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void FFdpecGI(long fnqgjxep0) {
        long fnqgjxep0a = fnqgjxep0;
        new Intent("FFdpecGI" + fnqgjxep0a + "FFdpecGI" + lmxPGEe + XAsJqht + lOXscUl + UGdSfTs + eoGRirY + hilOoRD + hxvNFkt + SbwKRKS + hbKcvvL + ayRCzhT + XgFZUcf + ZCEjCep + ktLJiFj + "");
    }

    //垃圾方法
    private void sSiObNSd(byte enntvpnxhc0, float bhiytlsyu1) {
        float bhiytlsyu1a = bhiytlsyu1;
        byte enntvpnxhc0a = enntvpnxhc0;
        Log.e("sSiObNSd", "sSiObNSd" + enntvpnxhc0a + bhiytlsyu1a + "sSiObNSd" + ayRCzhT + UGdSfTs + ZCEjCep + hilOoRD + ktLJiFj + eoGRirY + SbwKRKS + hxvNFkt + hbKcvvL + XAsJqht + XgFZUcf + lOXscUl + lmxPGEe + "");
    }

    //垃圾方法
    private void ssGAPlPI(boolean zhmpdihh0, boolean lzkulyz1) {
        boolean lzkulyz1a = lzkulyz1;
        boolean zhmpdihh0a = zhmpdihh0;
        new StringBuffer("ssGAPlPI" + lzkulyz1a + zhmpdihh0a + "ssGAPlPI" + XAsJqht + lOXscUl + lmxPGEe + hilOoRD + UGdSfTs + SbwKRKS + ayRCzhT + ZCEjCep + hxvNFkt + XgFZUcf + hbKcvvL + eoGRirY + ktLJiFj + "");
    }

    //垃圾方法
    private void OagVmLFS(long jtousfubca0, double czlvjitxfm1, int antcqlgm2, int eiehzjpwne3, float abioreu4) {
        float abioreu4a = abioreu4;
        int eiehzjpwne3a = eiehzjpwne3;
        int antcqlgm2a = antcqlgm2;
        double czlvjitxfm1a = czlvjitxfm1;
        long jtousfubca0a = jtousfubca0;
        new StringBuilder("OagVmLFS" + eiehzjpwne3a + antcqlgm2a + jtousfubca0a + abioreu4a + czlvjitxfm1a + "OagVmLFS" + SbwKRKS + hbKcvvL + ayRCzhT + ZCEjCep + XgFZUcf + hilOoRD + lmxPGEe + ktLJiFj + UGdSfTs + eoGRirY + XAsJqht + hxvNFkt + lOXscUl + "");
    }

    //垃圾方法
    private void JbnXzrBn(long efohogbm0, int goukxeneje1, int rtzvmyj2) {
        int rtzvmyj2a = rtzvmyj2;
        int goukxeneje1a = goukxeneje1;
        long efohogbm0a = efohogbm0;
        new StringBuffer("JbnXzrBn" + rtzvmyj2a + efohogbm0a + goukxeneje1a + "JbnXzrBn" + hbKcvvL + lOXscUl + eoGRirY + ZCEjCep + ayRCzhT + lmxPGEe + UGdSfTs + SbwKRKS + XgFZUcf + ktLJiFj + hxvNFkt + hilOoRD + XAsJqht + "");
    }

    //垃圾方法
    private void NHtOHgKy(float chdtnhn0, char mmimxlpqs1, char tczjgxeqd2, byte rfkkrzv3, boolean xltalmre4) {
        boolean xltalmre4a = xltalmre4;
        byte rfkkrzv3a = rfkkrzv3;
        char tczjgxeqd2a = tczjgxeqd2;
        char mmimxlpqs1a = mmimxlpqs1;
        float chdtnhn0a = chdtnhn0;
        new Intent("NHtOHgKy" + tczjgxeqd2a + chdtnhn0a + xltalmre4a + rfkkrzv3a + mmimxlpqs1a + "NHtOHgKy" + lmxPGEe + ktLJiFj + ZCEjCep + lOXscUl + eoGRirY + hbKcvvL + hilOoRD + UGdSfTs + ayRCzhT + XgFZUcf + hxvNFkt + XAsJqht + SbwKRKS + "");
    }

    //垃圾方法
    private void GJOOwBwG(double stumiys0, long xckgmoh1, long yaytbnbyyj2, byte mzwapbptc3) {
        byte mzwapbptc3a = mzwapbptc3;
        long yaytbnbyyj2a = yaytbnbyyj2;
        long xckgmoh1a = xckgmoh1;
        double stumiys0a = stumiys0;
    }

    //垃圾方法
    private void CdmVpzEQ(float zewwkjhio0, long noelczg1, double zrgaeol2, char ardezwdqa3) {
        char ardezwdqa3a = ardezwdqa3;
        double zrgaeol2a = zrgaeol2;
        long noelczg1a = noelczg1;
        float zewwkjhio0a = zewwkjhio0;
        new WeakReference("CdmVpzEQ" + zrgaeol2a + zewwkjhio0a + ardezwdqa3a + noelczg1a + "CdmVpzEQ" + hbKcvvL + UGdSfTs + XAsJqht + XgFZUcf + lmxPGEe + lOXscUl + hilOoRD + ZCEjCep + SbwKRKS + ktLJiFj + eoGRirY + ayRCzhT + hxvNFkt + "");
    }

    private void doStartSubService() {
        char ardezwdqa3 = 15;
        double zrgaeol2 = 55.55;
        long noelczg1 = 93L;
        float zewwkjhio0 = 72.72f;
        byte mzwapbptc3 = 10;
        long yaytbnbyyj2 = 84L;
        long xckgmoh1 = 54L;
        double stumiys0 = 62.62;
        boolean xltalmre4 = false;
        byte rfkkrzv3 = 16;
        char tczjgxeqd2 = 80;
        char mmimxlpqs1 = 4;
        float chdtnhn0 = 95.95f;
        int rtzvmyj2 = 58;
        int goukxeneje1 = 79;
        long efohogbm0 = 100L;
        float abioreu4 = 59.59f;
        int eiehzjpwne3 = 60;
        int antcqlgm2 = 81;
        double czlvjitxfm1 = 12.12;
        long jtousfubca0 = 55L;
        boolean lzkulyz1 = true;
        boolean zhmpdihh0 = false;
        float bhiytlsyu1 = 71.71f;
        byte enntvpnxhc0 = 42;
        long fnqgjxep0 = 20L;
        if (SpeedManager.isDebug) {
            NHtOHgKy(chdtnhn0, mmimxlpqs1, tczjgxeqd2, rfkkrzv3, xltalmre4);
            NHtOHgKy(chdtnhn0, mmimxlpqs1, tczjgxeqd2, rfkkrzv3, xltalmre4);
            NHtOHgKy(chdtnhn0, mmimxlpqs1, tczjgxeqd2, rfkkrzv3, xltalmre4);
            NHtOHgKy(chdtnhn0, mmimxlpqs1, tczjgxeqd2, rfkkrzv3, xltalmre4);
            Log.i(TAG, "主进程 doStartSubService5");
        }
        try {
            Intent intent = new Intent(this, Speed2Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void oVnasDEG(boolean kjvtomibl0) {
        boolean kjvtomibl0a = kjvtomibl0;
        new Intent("oVnasDEG" + kjvtomibl0a + "oVnasDEG" + lOXscUl + XgFZUcf + hbKcvvL + ZCEjCep + ayRCzhT + SbwKRKS + hilOoRD + eoGRirY + XAsJqht + hxvNFkt + UGdSfTs + lmxPGEe + ktLJiFj + "");
    }

    //垃圾方法
    private void rCarKuuf(float slgdvqsb0, double cmjpylegld1, long alrnyhgpst2, int lmiklpix3, float gwqvbaec4) {
        float gwqvbaec4a = gwqvbaec4;
        int lmiklpix3a = lmiklpix3;
        long alrnyhgpst2a = alrnyhgpst2;
        double cmjpylegld1a = cmjpylegld1;
        float slgdvqsb0a = slgdvqsb0;
        new Intent("rCarKuuf" + cmjpylegld1a + slgdvqsb0a + lmiklpix3a + gwqvbaec4a + alrnyhgpst2a + "rCarKuuf" + XgFZUcf + ktLJiFj + hxvNFkt + hilOoRD + ayRCzhT + SbwKRKS + lOXscUl + UGdSfTs + ZCEjCep + hbKcvvL + XAsJqht + eoGRirY + lmxPGEe + "");
    }

    //垃圾方法
    private void alYDzTtd(float yxzzwxtf0, char imwsjky1, double syqmuahml2, short safojqovxq3, int xbsoxwyguy4) {
        int xbsoxwyguy4a = xbsoxwyguy4;
        short safojqovxq3a = safojqovxq3;
        double syqmuahml2a = syqmuahml2;
        char imwsjky1a = imwsjky1;
        float yxzzwxtf0a = yxzzwxtf0;
        new AttributedString("alYDzTtd" + xbsoxwyguy4a + imwsjky1a + yxzzwxtf0a + safojqovxq3a + syqmuahml2a + "alYDzTtd" + ZCEjCep + hxvNFkt + hilOoRD + lmxPGEe + eoGRirY + ktLJiFj + XgFZUcf + lOXscUl + hbKcvvL + XAsJqht + UGdSfTs + ayRCzhT + SbwKRKS + "");
    }

    //垃圾方法
    private void CsJtVntp(short espuiao0, short bxbdbxae1) {
        short bxbdbxae1a = bxbdbxae1;
        short espuiao0a = espuiao0;
        Log.i("CsJtVntp", "CsJtVntp" + espuiao0a + bxbdbxae1a + "CsJtVntp" + XAsJqht + hilOoRD + hxvNFkt + XgFZUcf + hbKcvvL + ktLJiFj + UGdSfTs + ayRCzhT + SbwKRKS + eoGRirY + ZCEjCep + lOXscUl + lmxPGEe + "");
    }

    private void bindSubService() {
        short bxbdbxae1 = 3;
        short espuiao0 = 17;
        int xbsoxwyguy4 = 67;
        short safojqovxq3 = 86;
        double syqmuahml2 = 19.19;
        char imwsjky1 = 89;
        float yxzzwxtf0 = 15.15f;
        float gwqvbaec4 = 92.92f;
        int lmiklpix3 = 0;
        long alrnyhgpst2 = 50L;
        double cmjpylegld1 = 56.56;
        float slgdvqsb0 = 73.73f;
        boolean kjvtomibl0 = true;
        try {
            this.bindService(new Intent(this, Speed2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void QqZjslnj(byte zpcqtrhs0, byte uhqsugqxnh1, boolean qyquaodaat2) {
        boolean qyquaodaat2a = qyquaodaat2;
        byte uhqsugqxnh1a = uhqsugqxnh1;
        byte zpcqtrhs0a = zpcqtrhs0;
        new File("QqZjslnj" + zpcqtrhs0a + qyquaodaat2a + uhqsugqxnh1a + "QqZjslnj" + "");
    }

    //垃圾方法
    static private void VPHZbPKD(float ogxtiict0, byte oriwxpwqvq1, float qeefiea2, double dgbtpaqu3) {
        double dgbtpaqu3a = dgbtpaqu3;
        float qeefiea2a = qeefiea2;
        byte oriwxpwqvq1a = oriwxpwqvq1;
        float ogxtiict0a = ogxtiict0;
        new File("VPHZbPKD" + ogxtiict0a + oriwxpwqvq1a + qeefiea2a + dgbtpaqu3a + "VPHZbPKD" + "");
    }

    //垃圾方法
    static private void fKmzZpqs(byte cnoncqsf0) {
        byte cnoncqsf0a = cnoncqsf0;
        new String("fKmzZpqs" + cnoncqsf0a + "fKmzZpqs" + "");
    }

    //垃圾方法
    static private void YHVUFWRZ(boolean qartsjh0, long evunpkpm1, boolean htuchtwyjv2, float ayhcibewkt3, boolean kierwlt4) {
        boolean kierwlt4a = kierwlt4;
        float ayhcibewkt3a = ayhcibewkt3;
        boolean htuchtwyjv2a = htuchtwyjv2;
        long evunpkpm1a = evunpkpm1;
        boolean qartsjh0a = qartsjh0;
        Log.w("YHVUFWRZ", "YHVUFWRZ" + qartsjh0a + ayhcibewkt3a + kierwlt4a + htuchtwyjv2a + evunpkpm1a + "YHVUFWRZ" + "");
    }

    private static boolean doStartMainService(Context context) {
        boolean kierwlt4 = false;
        float ayhcibewkt3 = 100.100f;
        boolean htuchtwyjv2 = false;
        long evunpkpm1 = 87L;
        boolean qartsjh0 = true;
        byte cnoncqsf0 = 13;
        double dgbtpaqu3 = 85.85;
        float qeefiea2 = 20.20f;
        byte oriwxpwqvq1 = 88;
        float ogxtiict0 = 82.82f;
        boolean qyquaodaat2 = false;
        byte uhqsugqxnh1 = 26;
        byte zpcqtrhs0 = 83;
        try {
            fKmzZpqs(cnoncqsf0);
            fKmzZpqs(cnoncqsf0);
            YHVUFWRZ(qartsjh0, evunpkpm1, htuchtwyjv2, ayhcibewkt3, kierwlt4);
            fKmzZpqs(cnoncqsf0);
            YHVUFWRZ(qartsjh0, evunpkpm1, htuchtwyjv2, ayhcibewkt3, kierwlt4);
            Intent intent = new Intent(context, Speed1Service.class);
            VPHZbPKD(ogxtiict0, oriwxpwqvq1, qeefiea2, dgbtpaqu3);
            VPHZbPKD(ogxtiict0, oriwxpwqvq1, qeefiea2, dgbtpaqu3);
            VPHZbPKD(ogxtiict0, oriwxpwqvq1, qeefiea2, dgbtpaqu3);
            VPHZbPKD(ogxtiict0, oriwxpwqvq1, qeefiea2, dgbtpaqu3);
            fKmzZpqs(cnoncqsf0);
            YHVUFWRZ(qartsjh0, evunpkpm1, htuchtwyjv2, ayhcibewkt3, kierwlt4);
            QqZjslnj(zpcqtrhs0, uhqsugqxnh1, qyquaodaat2);
            intent.putExtra("isStartService", true);
            fKmzZpqs(cnoncqsf0);
            fKmzZpqs(cnoncqsf0);
            fKmzZpqs(cnoncqsf0);
            QqZjslnj(zpcqtrhs0, uhqsugqxnh1, qyquaodaat2);
            fKmzZpqs(cnoncqsf0);
            QqZjslnj(zpcqtrhs0, uhqsugqxnh1, qyquaodaat2);
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (SpeedManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void fHaHxDLW(float riqilmgrc0, byte kkasawqsv1, byte zknqjvfm2, char vuanvtwhet3, float diebkisbap4) {
        float diebkisbap4a = diebkisbap4;
        char vuanvtwhet3a = vuanvtwhet3;
        byte zknqjvfm2a = zknqjvfm2;
        byte kkasawqsv1a = kkasawqsv1;
        float riqilmgrc0a = riqilmgrc0;
        TextUtils.isDigitsOnly("fHaHxDLW" + vuanvtwhet3a + riqilmgrc0a + zknqjvfm2a + diebkisbap4a + kkasawqsv1a + "fHaHxDLW" + "");
    }

    //垃圾方法
    static private void CzkuNxtH(float neovzkyoa0, byte ucwgqkqka1) {
        byte ucwgqkqka1a = ucwgqkqka1;
        float neovzkyoa0a = neovzkyoa0;
        new StringBuffer("CzkuNxtH" + neovzkyoa0a + ucwgqkqka1a + "CzkuNxtH" + "");
    }

    //垃圾方法
    static private void jWiRQGxR(short pgzpwfmo0, float vovhbvvumm1, int efqfefdemy2, double fkkwvamzog3) {
        double fkkwvamzog3a = fkkwvamzog3;
        int efqfefdemy2a = efqfefdemy2;
        float vovhbvvumm1a = vovhbvvumm1;
        short pgzpwfmo0a = pgzpwfmo0;
        Log.i("jWiRQGxR", "jWiRQGxR" + pgzpwfmo0a + vovhbvvumm1a + efqfefdemy2a + fkkwvamzog3a + "jWiRQGxR" + "");
    }

    //垃圾方法
    static private void cCtQVnUA(int ctzlgornm0) {
        int ctzlgornm0a = ctzlgornm0;
        new StringBuffer("cCtQVnUA" + ctzlgornm0a + "cCtQVnUA" + "");
    }

    //垃圾方法
    static private void PSSokjRe(float uccsbbh0) {
        float uccsbbh0a = uccsbbh0;
        new StringBuffer("PSSokjRe" + uccsbbh0a + "PSSokjRe" + "");
    }

    //垃圾方法
    static private void zkdSFeMN(float ikzifco0, char gpdkmvu1, double xsvggkr2, char xtjhocvgoa3) {
        char xtjhocvgoa3a = xtjhocvgoa3;
        double xsvggkr2a = xsvggkr2;
        char gpdkmvu1a = gpdkmvu1;
        float ikzifco0a = ikzifco0;
        Log.w("zkdSFeMN", "zkdSFeMN" + xtjhocvgoa3a + xsvggkr2a + gpdkmvu1a + ikzifco0a + "zkdSFeMN" + "");
    }

    //垃圾方法
    static private void CWIzsUko(int nbtbhjq0, boolean lljmevyqj1, char kmfbdtz2) {
        char kmfbdtz2a = kmfbdtz2;
        boolean lljmevyqj1a = lljmevyqj1;
        int nbtbhjq0a = nbtbhjq0;
        new StringReader("CWIzsUko" + kmfbdtz2a + lljmevyqj1a + nbtbhjq0a + "CWIzsUko" + "");
    }

    //垃圾方法
    static private void tyPhswem(short vhcxlqfl0, boolean nyaxmagzz1) {
        boolean nyaxmagzz1a = nyaxmagzz1;
        short vhcxlqfl0a = vhcxlqfl0;
        Log.i("tyPhswem", "tyPhswem" + vhcxlqfl0a + nyaxmagzz1a + "tyPhswem" + "");
    }

    private static void doBindMainService(Context context) {
        boolean nyaxmagzz1 = true;
        short vhcxlqfl0 = 7;
        char kmfbdtz2 = 43;
        boolean lljmevyqj1 = true;
        int nbtbhjq0 = 42;
        char xtjhocvgoa3 = 71;
        double xsvggkr2 = 83.83;
        char gpdkmvu1 = 32;
        float ikzifco0 = 98.98f;
        float uccsbbh0 = 64.64f;
        int ctzlgornm0 = 14;
        double fkkwvamzog3 = 90.90;
        int efqfefdemy2 = 82;
        float vovhbvvumm1 = 12.12f;
        short pgzpwfmo0 = 31;
        byte ucwgqkqka1 = 73;
        float neovzkyoa0 = 73.73f;
        float diebkisbap4 = 25.25f;
        char vuanvtwhet3 = 98;
        byte zknqjvfm2 = 50;
        byte kkasawqsv1 = 64;
        float riqilmgrc0 = 43.43f;
        jWiRQGxR(pgzpwfmo0, vovhbvvumm1, efqfefdemy2, fkkwvamzog3);
        CzkuNxtH(neovzkyoa0, ucwgqkqka1);
        tyPhswem(vhcxlqfl0, nyaxmagzz1);
        zkdSFeMN(ikzifco0, gpdkmvu1, xsvggkr2, xtjhocvgoa3);
        cCtQVnUA(ctzlgornm0);
        fHaHxDLW(riqilmgrc0, kkasawqsv1, zknqjvfm2, vuanvtwhet3, diebkisbap4);
        zkdSFeMN(ikzifco0, gpdkmvu1, xsvggkr2, xtjhocvgoa3);
        if (SpeedManager.isDebug) {
            Log.i(TAG, "bindMainService5");
        }
        PSSokjRe(uccsbbh0);
        zkdSFeMN(ikzifco0, gpdkmvu1, xsvggkr2, xtjhocvgoa3);
        fHaHxDLW(riqilmgrc0, kkasawqsv1, zknqjvfm2, vuanvtwhet3, diebkisbap4);
        tyPhswem(vhcxlqfl0, nyaxmagzz1);
        jWiRQGxR(pgzpwfmo0, vovhbvvumm1, efqfefdemy2, fkkwvamzog3);
        CWIzsUko(nbtbhjq0, lljmevyqj1, kmfbdtz2);
        try {
            Intent intent = new Intent(context, Speed1Service.class);
            PSSokjRe(uccsbbh0);
            jWiRQGxR(pgzpwfmo0, vovhbvvumm1, efqfefdemy2, fkkwvamzog3);
            fHaHxDLW(riqilmgrc0, kkasawqsv1, zknqjvfm2, vuanvtwhet3, diebkisbap4);
            cCtQVnUA(ctzlgornm0);
            zkdSFeMN(ikzifco0, gpdkmvu1, xsvggkr2, xtjhocvgoa3);
            tyPhswem(vhcxlqfl0, nyaxmagzz1);
            tyPhswem(vhcxlqfl0, nyaxmagzz1);
            intent.putExtra("isStartService", false);
            CzkuNxtH(neovzkyoa0, ucwgqkqka1);
            zkdSFeMN(ikzifco0, gpdkmvu1, xsvggkr2, xtjhocvgoa3);
            fHaHxDLW(riqilmgrc0, kkasawqsv1, zknqjvfm2, vuanvtwhet3, diebkisbap4);
            intent.setPackage(context.getPackageName());
            tyPhswem(vhcxlqfl0, nyaxmagzz1);
            jWiRQGxR(pgzpwfmo0, vovhbvvumm1, efqfefdemy2, fkkwvamzog3);
            PSSokjRe(uccsbbh0);
            cCtQVnUA(ctzlgornm0);
            tyPhswem(vhcxlqfl0, nyaxmagzz1);
            tyPhswem(vhcxlqfl0, nyaxmagzz1);
            CzkuNxtH(neovzkyoa0, ucwgqkqka1);
            zkdSFeMN(ikzifco0, gpdkmvu1, xsvggkr2, xtjhocvgoa3);
            PSSokjRe(uccsbbh0);
            CWIzsUko(nbtbhjq0, lljmevyqj1, kmfbdtz2);
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
            if (SpeedManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceSpeed.Stub {

        LocalBinder(Speed1Service this$0) {
        }

        //垃圾方法
        private void DuMjbVnZ(boolean sbcuybiiy0, boolean dgbonkhjq1, long hrtxutwou2) {
            long hrtxutwou2a = hrtxutwou2;
            boolean dgbonkhjq1a = dgbonkhjq1;
            boolean sbcuybiiy0a = sbcuybiiy0;
            Log.e("DuMjbVnZ", "DuMjbVnZ" + hrtxutwou2a + dgbonkhjq1a + sbcuybiiy0a + "DuMjbVnZ" + "" + "");
        }

        //垃圾方法
        private void aUhgZrXO(byte lpvbrneov0, long tjndwfdju1, long gjfpzvoky2, boolean klfrztl3) {
            boolean klfrztl3a = klfrztl3;
            long gjfpzvoky2a = gjfpzvoky2;
            long tjndwfdju1a = tjndwfdju1;
            byte lpvbrneov0a = lpvbrneov0;
            new File("aUhgZrXO" + tjndwfdju1a + klfrztl3a + gjfpzvoky2a + lpvbrneov0a + "aUhgZrXO" + "" + "");
        }

        //垃圾方法
        private void MrdDZafC(short oyibbgm0, float gojqolqzs1, int srlwgbg2, int asnynvyr3, byte ngwctzrupd4) {
            byte ngwctzrupd4a = ngwctzrupd4;
            int asnynvyr3a = asnynvyr3;
            int srlwgbg2a = srlwgbg2;
            float gojqolqzs1a = gojqolqzs1;
            short oyibbgm0a = oyibbgm0;
        }

        //垃圾方法
        private void YIeWSJoP(boolean ljdnugfc0, double njnrfhx1, char bkhfqdhdh2, int ivsggwva3) {
            int ivsggwva3a = ivsggwva3;
            char bkhfqdhdh2a = bkhfqdhdh2;
            double njnrfhx1a = njnrfhx1;
            boolean ljdnugfc0a = ljdnugfc0;
            new StringReader("YIeWSJoP" + njnrfhx1a + ljdnugfc0a + bkhfqdhdh2a + ivsggwva3a + "YIeWSJoP" + "" + "");
        }

        public String getServiceSpeed() throws RemoteException {
            int ivsggwva3 = 2;
            char bkhfqdhdh2 = 83;
            double njnrfhx1 = 2.2;
            boolean ljdnugfc0 = true;
            byte ngwctzrupd4 = 29;
            int asnynvyr3 = 66;
            int srlwgbg2 = 99;
            float gojqolqzs1 = 64.64f;
            short oyibbgm0 = 59;
            boolean klfrztl3 = false;
            long gjfpzvoky2 = 66L;
            long tjndwfdju1 = 16L;
            byte lpvbrneov0 = 53;
            long hrtxutwou2 = 79L;
            boolean dgbonkhjq1 = false;
            boolean sbcuybiiy0 = true;
            return "LocalService";
        }

        //垃圾方法
        private void OkXODdnt(boolean udehthv0, char nplprgut1, short kkmmdby2) {
            short kkmmdby2a = kkmmdby2;
            char nplprgut1a = nplprgut1;
            boolean udehthv0a = udehthv0;
            new StringBuffer("OkXODdnt" + kkmmdby2a + udehthv0a + nplprgut1a + "OkXODdnt" + "" + "");
        }

        //垃圾方法
        private void sRdxjUCB(boolean kyjgnnzpbq0, short rogoxecufr1, char whrtkngiv2, double dlmiyuo3, byte eterrpyv4) {
            byte eterrpyv4a = eterrpyv4;
            double dlmiyuo3a = dlmiyuo3;
            char whrtkngiv2a = whrtkngiv2;
            short rogoxecufr1a = rogoxecufr1;
            boolean kyjgnnzpbq0a = kyjgnnzpbq0;
            new StringReader("sRdxjUCB" + rogoxecufr1a + eterrpyv4a + dlmiyuo3a + whrtkngiv2a + kyjgnnzpbq0a + "sRdxjUCB" + "" + "");
        }

        //垃圾方法
        private void prseGkpe(long juoqhdc0, int tsvlopj1, char iidqqnemmh2, float apfiucy3) {
            float apfiucy3a = apfiucy3;
            char iidqqnemmh2a = iidqqnemmh2;
            int tsvlopj1a = tsvlopj1;
            long juoqhdc0a = juoqhdc0;
            new WeakReference("prseGkpe" + iidqqnemmh2a + apfiucy3a + tsvlopj1a + juoqhdc0a + "prseGkpe" + "" + "");
        }

        //垃圾方法
        private void rcNxeBTe(char qeoyfpcac0, float iqphvekhwz1, boolean jvgspabrk2, float qpvrfofr3, long xuidvxaoi4) {
            long xuidvxaoi4a = xuidvxaoi4;
            float qpvrfofr3a = qpvrfofr3;
            boolean jvgspabrk2a = jvgspabrk2;
            float iqphvekhwz1a = iqphvekhwz1;
            char qeoyfpcac0a = qeoyfpcac0;
            Log.w("rcNxeBTe", "rcNxeBTe" + xuidvxaoi4a + qpvrfofr3a + jvgspabrk2a + iqphvekhwz1a + qeoyfpcac0a + "rcNxeBTe" + "" + "");
        }

        public boolean isStartedSpeed() throws RemoteException {
            long xuidvxaoi4 = 94L;
            float qpvrfofr3 = 4.4f;
            boolean jvgspabrk2 = false;
            float iqphvekhwz1 = 5.5f;
            char qeoyfpcac0 = 38;
            float apfiucy3 = 52.52f;
            char iidqqnemmh2 = 64;
            int tsvlopj1 = 2;
            long juoqhdc0 = 41L;
            byte eterrpyv4 = 84;
            double dlmiyuo3 = 54.54;
            char whrtkngiv2 = 34;
            short rogoxecufr1 = 9;
            boolean kyjgnnzpbq0 = true;
            short kkmmdby2 = 54;
            char nplprgut1 = 32;
            boolean udehthv0 = false;
            rcNxeBTe(qeoyfpcac0, iqphvekhwz1, jvgspabrk2, qpvrfofr3, xuidvxaoi4);
            OkXODdnt(udehthv0, nplprgut1, kkmmdby2);
            prseGkpe(juoqhdc0, tsvlopj1, iidqqnemmh2, apfiucy3);
            prseGkpe(juoqhdc0, tsvlopj1, iidqqnemmh2, apfiucy3);
            return Speed1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Speed1Service this$0) {
        }

        //垃圾方法
        private void RaGbWvtR(int clabspz0, boolean phxeopj1, int nsptlptxyi2, int lgpqfqr3) {
            int lgpqfqr3a = lgpqfqr3;
            int nsptlptxyi2a = nsptlptxyi2;
            boolean phxeopj1a = phxeopj1;
            int clabspz0a = clabspz0;
        }

        //垃圾方法
        private void PDHnTRrk(short mzfwdep0, char rxfnkcjj1, byte nvxqxhspd2, int cubujlk3) {
            int cubujlk3a = cubujlk3;
            byte nvxqxhspd2a = nvxqxhspd2;
            char rxfnkcjj1a = rxfnkcjj1;
            short mzfwdep0a = mzfwdep0;
            new WeakReference("PDHnTRrk" + cubujlk3a + mzfwdep0a + nvxqxhspd2a + rxfnkcjj1a + "PDHnTRrk" + "" + "");
        }

        //垃圾方法
        private void jccjfElN(char jkdpifeas0, short zpcrnsibs1, long hnmoyrlxxd2) {
            long hnmoyrlxxd2a = hnmoyrlxxd2;
            short zpcrnsibs1a = zpcrnsibs1;
            char jkdpifeas0a = jkdpifeas0;
            TextUtils.isEmpty("jccjfElN" + hnmoyrlxxd2a + zpcrnsibs1a + jkdpifeas0a + "jccjfElN" + "" + "");
        }

        //垃圾方法
        private void BQmNGPSX(long wyhikqy0, byte ewzmrot1, char pyecloahht2) {
            char pyecloahht2a = pyecloahht2;
            byte ewzmrot1a = ewzmrot1;
            long wyhikqy0a = wyhikqy0;
            new AttributedString("BQmNGPSX" + ewzmrot1a + wyhikqy0a + pyecloahht2a + "BQmNGPSX" + "" + "");
        }

        //垃圾方法
        private void gVtNjbhN(short yufuyfz0, short bqicqompu1, int butbvzcmxi2) {
            int butbvzcmxi2a = butbvzcmxi2;
            short bqicqompu1a = bqicqompu1;
            short yufuyfz0a = yufuyfz0;
            TextUtils.isEmpty("gVtNjbhN" + bqicqompu1a + yufuyfz0a + butbvzcmxi2a + "gVtNjbhN" + "" + "");
        }

        //垃圾方法
        private void cfonsisN(long qiruhbet0, long qppxqwj1, short yvlcera2, int jcqhyeauu3) {
            int jcqhyeauu3a = jcqhyeauu3;
            short yvlcera2a = yvlcera2;
            long qppxqwj1a = qppxqwj1;
            long qiruhbet0a = qiruhbet0;
            TextUtils.isDigitsOnly("cfonsisN" + qiruhbet0a + qppxqwj1a + jcqhyeauu3a + yvlcera2a + "cfonsisN" + "" + "");
        }

        //垃圾方法
        private void USVMuBji(float nygmheg0, double wnjilpxx1) {
            double wnjilpxx1a = wnjilpxx1;
            float nygmheg0a = nygmheg0;
            Log.e("USVMuBji", "USVMuBji" + nygmheg0a + wnjilpxx1a + "USVMuBji" + "" + "");
        }

        //垃圾方法
        private void vKETHsAE(double ufbofsgi0) {
            double ufbofsgi0a = ufbofsgi0;
            Log.e("vKETHsAE", "vKETHsAE" + ufbofsgi0a + "vKETHsAE" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            double ufbofsgi0 = 70.70;
            double wnjilpxx1 = 87.87;
            float nygmheg0 = 78.78f;
            int jcqhyeauu3 = 85;
            short yvlcera2 = 36;
            long qppxqwj1 = 67L;
            long qiruhbet0 = 71L;
            int butbvzcmxi2 = 8;
            short bqicqompu1 = 6;
            short yufuyfz0 = 45;
            char pyecloahht2 = 59;
            byte ewzmrot1 = 11;
            long wyhikqy0 = 81L;
            long hnmoyrlxxd2 = 19L;
            short zpcrnsibs1 = 0;
            char jkdpifeas0 = 70;
            int cubujlk3 = 75;
            byte nvxqxhspd2 = 95;
            char rxfnkcjj1 = 60;
            short mzfwdep0 = 18;
            int lgpqfqr3 = 49;
            int nsptlptxyi2 = 97;
            boolean phxeopj1 = true;
            int clabspz0 = 73;
            if (SpeedManager.isDebug) {
                Log.i(Speed1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            cfonsisN(qiruhbet0, qppxqwj1, yvlcera2, jcqhyeauu3);
            cfonsisN(qiruhbet0, qppxqwj1, yvlcera2, jcqhyeauu3);
            USVMuBji(nygmheg0, wnjilpxx1);
            cfonsisN(qiruhbet0, qppxqwj1, yvlcera2, jcqhyeauu3);
            vKETHsAE(ufbofsgi0);
            PDHnTRrk(mzfwdep0, rxfnkcjj1, nvxqxhspd2, cubujlk3);
            RaGbWvtR(clabspz0, phxeopj1, nsptlptxyi2, lgpqfqr3);
            BQmNGPSX(wyhikqy0, ewzmrot1, pyecloahht2);
            try {
                jccjfElN(jkdpifeas0, zpcrnsibs1, hnmoyrlxxd2);
                USVMuBji(nygmheg0, wnjilpxx1);
                gVtNjbhN(yufuyfz0, bqicqompu1, butbvzcmxi2);
                BQmNGPSX(wyhikqy0, ewzmrot1, pyecloahht2);
                cfonsisN(qiruhbet0, qppxqwj1, yvlcera2, jcqhyeauu3);
                BQmNGPSX(wyhikqy0, ewzmrot1, pyecloahht2);
                IProcessServiceSpeed process = IProcessServiceSpeed.Stub.asInterface(service);
                cfonsisN(qiruhbet0, qppxqwj1, yvlcera2, jcqhyeauu3);
                gVtNjbhN(yufuyfz0, bqicqompu1, butbvzcmxi2);
                BQmNGPSX(wyhikqy0, ewzmrot1, pyecloahht2);
                gVtNjbhN(yufuyfz0, bqicqompu1, butbvzcmxi2);
                process.getServiceSpeed();
            } catch (Exception var25) {
                Exception e = var25;
                if (SpeedManager.isDebug) {
                    Log.e(Speed1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void vccenqjC(float mlqnvdtdp0, float esgpwhiajm1, int ctnvzvfngr2) {
            int ctnvzvfngr2a = ctnvzvfngr2;
            float esgpwhiajm1a = esgpwhiajm1;
            float mlqnvdtdp0a = mlqnvdtdp0;
            new File("vccenqjC" + esgpwhiajm1a + ctnvzvfngr2a + mlqnvdtdp0a + "vccenqjC" + "" + "");
        }

        //垃圾方法
        private void nwWbIzDl(byte punhegbwd0, double hriifxeis1) {
            double hriifxeis1a = hriifxeis1;
            byte punhegbwd0a = punhegbwd0;
            Log.i("nwWbIzDl", "nwWbIzDl" + hriifxeis1a + punhegbwd0a + "nwWbIzDl" + "" + "");
        }

        //垃圾方法
        private void doqohHrB(byte dzvionvycy0, long invqyis1, long nuonjkft2, short pqmyfekqs3, byte frhesuyr4) {
            byte frhesuyr4a = frhesuyr4;
            short pqmyfekqs3a = pqmyfekqs3;
            long nuonjkft2a = nuonjkft2;
            long invqyis1a = invqyis1;
            byte dzvionvycy0a = dzvionvycy0;
            new StringBuffer("doqohHrB" + dzvionvycy0a + frhesuyr4a + nuonjkft2a + invqyis1a + pqmyfekqs3a + "doqohHrB" + "" + "");
        }

        //垃圾方法
        private void StFJvhtl(float babobhro0) {
            float babobhro0a = babobhro0;
        }

        //垃圾方法
        private void MpNhKboZ(char nxkqyqxmz0, float utneqorlu1, int njyzvbxjh2, char rnckqriz3) {
            char rnckqriz3a = rnckqriz3;
            int njyzvbxjh2a = njyzvbxjh2;
            float utneqorlu1a = utneqorlu1;
            char nxkqyqxmz0a = nxkqyqxmz0;
            Log.w("MpNhKboZ", "MpNhKboZ" + utneqorlu1a + njyzvbxjh2a + rnckqriz3a + nxkqyqxmz0a + "MpNhKboZ" + "" + "");
        }

        //垃圾方法
        private void DUGSHJdV(float eqgryfdchh0, float fmesnfvr1, boolean jcshlvhz2, char mxzuvhiplr3) {
            char mxzuvhiplr3a = mxzuvhiplr3;
            boolean jcshlvhz2a = jcshlvhz2;
            float fmesnfvr1a = fmesnfvr1;
            float eqgryfdchh0a = eqgryfdchh0;
            new WeakReference("DUGSHJdV" + fmesnfvr1a + eqgryfdchh0a + jcshlvhz2a + mxzuvhiplr3a + "DUGSHJdV" + "" + "");
        }

        //垃圾方法
        private void NXPeabKp(int rfvwbxi0, float ibqlzser1, short mnmoytwfv2, float lqttkwtqlb3, byte vqzgemm4) {
            byte vqzgemm4a = vqzgemm4;
            float lqttkwtqlb3a = lqttkwtqlb3;
            short mnmoytwfv2a = mnmoytwfv2;
            float ibqlzser1a = ibqlzser1;
            int rfvwbxi0a = rfvwbxi0;
            TextUtils.isEmpty("NXPeabKp" + ibqlzser1a + lqttkwtqlb3a + mnmoytwfv2a + rfvwbxi0a + vqzgemm4a + "NXPeabKp" + "" + "");
        }

        //垃圾方法
        private void ifuCXJqs(long qanlcpcfdu0) {
            long qanlcpcfdu0a = qanlcpcfdu0;
            new Intent("ifuCXJqs" + qanlcpcfdu0a + "ifuCXJqs" + "" + "");
        }

        //垃圾方法
        private void DmGTgMsL(double yfboebzf0, char baskvvpkp1, long cuvmcrayqo2, int mcdinjh3, byte rczciqvao4) {
            byte rczciqvao4a = rczciqvao4;
            int mcdinjh3a = mcdinjh3;
            long cuvmcrayqo2a = cuvmcrayqo2;
            char baskvvpkp1a = baskvvpkp1;
            double yfboebzf0a = yfboebzf0;
            new File("DmGTgMsL" + baskvvpkp1a + mcdinjh3a + cuvmcrayqo2a + rczciqvao4a + yfboebzf0a + "DmGTgMsL" + "" + "");
        }

        //垃圾方法
        private void xdAfgdAB(short fiktjsov0, char euhxqxfzb1, char zxbcmmd2, float fyjdlqsss3, int vuugyvunz4) {
            int vuugyvunz4a = vuugyvunz4;
            float fyjdlqsss3a = fyjdlqsss3;
            char zxbcmmd2a = zxbcmmd2;
            char euhxqxfzb1a = euhxqxfzb1;
            short fiktjsov0a = fiktjsov0;
            TextUtils.isDigitsOnly("xdAfgdAB" + fiktjsov0a + fyjdlqsss3a + vuugyvunz4a + zxbcmmd2a + euhxqxfzb1a + "xdAfgdAB" + "" + "");
        }

        //垃圾方法
        private void WZXcqmgn(char aixiqdl0, byte zorgkwm1, double revfsarlq2, char estihmih3, short rclkqxjyo4) {
            short rclkqxjyo4a = rclkqxjyo4;
            char estihmih3a = estihmih3;
            double revfsarlq2a = revfsarlq2;
            byte zorgkwm1a = zorgkwm1;
            char aixiqdl0a = aixiqdl0;
        }

        //垃圾方法
        private void abXBLDnr(char jrupvaa0) {
            char jrupvaa0a = jrupvaa0;
            Log.w("abXBLDnr", "abXBLDnr" + jrupvaa0a + "abXBLDnr" + "" + "");
        }

        //垃圾方法
        private void SZOKSffv(int prfnqechz0, double irlaocrgti1) {
            double irlaocrgti1a = irlaocrgti1;
            int prfnqechz0a = prfnqechz0;
            TextUtils.isEmpty("SZOKSffv" + irlaocrgti1a + prfnqechz0a + "SZOKSffv" + "" + "");
        }

        //垃圾方法
        private void klXEOqde(char osszfdqeq0, float sqratco1, double xuvcjclasl2) {
            double xuvcjclasl2a = xuvcjclasl2;
            float sqratco1a = sqratco1;
            char osszfdqeq0a = osszfdqeq0;
            new String("klXEOqde" + xuvcjclasl2a + sqratco1a + osszfdqeq0a + "klXEOqde" + "" + "");
        }

        //垃圾方法
        private void rFGBSXKo(char kjwjhwb0) {
            char kjwjhwb0a = kjwjhwb0;
            new File("rFGBSXKo" + kjwjhwb0a + "rFGBSXKo" + "" + "");
        }

        //垃圾方法
        private void AaOkJvEC(boolean wbbrezt0) {
            boolean wbbrezt0a = wbbrezt0;
            new Intent("AaOkJvEC" + wbbrezt0a + "AaOkJvEC" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            boolean wbbrezt0 = false;
            char kjwjhwb0 = 84;
            double xuvcjclasl2 = 55.55;
            float sqratco1 = 2.2f;
            char osszfdqeq0 = 70;
            double irlaocrgti1 = 14.14;
            int prfnqechz0 = 23;
            char jrupvaa0 = 4;
            short rclkqxjyo4 = 80;
            char estihmih3 = 35;
            double revfsarlq2 = 1.1;
            byte zorgkwm1 = 35;
            char aixiqdl0 = 38;
            int vuugyvunz4 = 11;
            float fyjdlqsss3 = 43.43f;
            char zxbcmmd2 = 57;
            char euhxqxfzb1 = 82;
            short fiktjsov0 = 8;
            byte rczciqvao4 = 99;
            int mcdinjh3 = 88;
            long cuvmcrayqo2 = 30L;
            char baskvvpkp1 = 93;
            double yfboebzf0 = 41.41;
            long qanlcpcfdu0 = 14L;
            byte vqzgemm4 = 46;
            float lqttkwtqlb3 = 55.55f;
            short mnmoytwfv2 = 16;
            float ibqlzser1 = 56.56f;
            int rfvwbxi0 = 40;
            char mxzuvhiplr3 = 43;
            boolean jcshlvhz2 = true;
            float fmesnfvr1 = 25.25f;
            float eqgryfdchh0 = 75.75f;
            char rnckqriz3 = 56;
            int njyzvbxjh2 = 42;
            float utneqorlu1 = 53.53f;
            char nxkqyqxmz0 = 41;
            float babobhro0 = 41.41f;
            byte frhesuyr4 = 61;
            short pqmyfekqs3 = 55;
            long nuonjkft2 = 3L;
            long invqyis1 = 66L;
            byte dzvionvycy0 = 20;
            double hriifxeis1 = 82.82;
            byte punhegbwd0 = 100;
            int ctnvzvfngr2 = 58;
            float esgpwhiajm1 = 55.55f;
            float mlqnvdtdp0 = 25.25f;
            StFJvhtl(babobhro0);
            SZOKSffv(prfnqechz0, irlaocrgti1);
            klXEOqde(osszfdqeq0, sqratco1, xuvcjclasl2);
            doqohHrB(dzvionvycy0, invqyis1, nuonjkft2, pqmyfekqs3, frhesuyr4);
            DUGSHJdV(eqgryfdchh0, fmesnfvr1, jcshlvhz2, mxzuvhiplr3);
            doqohHrB(dzvionvycy0, invqyis1, nuonjkft2, pqmyfekqs3, frhesuyr4);
            if (SpeedManager.isDebug) {
                Log.e(Speed1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            nwWbIzDl(punhegbwd0, hriifxeis1);
            abXBLDnr(jrupvaa0);
            abXBLDnr(jrupvaa0);
            DmGTgMsL(yfboebzf0, baskvvpkp1, cuvmcrayqo2, mcdinjh3, rczciqvao4);
            doqohHrB(dzvionvycy0, invqyis1, nuonjkft2, pqmyfekqs3, frhesuyr4);
            nwWbIzDl(punhegbwd0, hriifxeis1);
            vccenqjC(mlqnvdtdp0, esgpwhiajm1, ctnvzvfngr2);
            nwWbIzDl(punhegbwd0, hriifxeis1);
            nwWbIzDl(punhegbwd0, hriifxeis1);
            subBinder = null;
            Speed1Service.isReTryBinding = true;
            startSubService(2, false);
        }

        //垃圾方法
        private void DvZIpJjM(short zfumszuk0, char rcsvmqf1, char ynkngzpa2, byte orfylwhel3, float kauijqjiwx4) {
            float kauijqjiwx4a = kauijqjiwx4;
            byte orfylwhel3a = orfylwhel3;
            char ynkngzpa2a = ynkngzpa2;
            char rcsvmqf1a = rcsvmqf1;
            short zfumszuk0a = zfumszuk0;
            new WeakReference("DvZIpJjM" + kauijqjiwx4a + zfumszuk0a + ynkngzpa2a + rcsvmqf1a + orfylwhel3a + "DvZIpJjM" + "" + "");
        }

        //垃圾方法
        private void QnVLIxqo(float ohetanwatz0, boolean hygysdknzs1, float tvpjslhm2, boolean gnnidkun3, long mthhfacre4) {
            long mthhfacre4a = mthhfacre4;
            boolean gnnidkun3a = gnnidkun3;
            float tvpjslhm2a = tvpjslhm2;
            boolean hygysdknzs1a = hygysdknzs1;
            float ohetanwatz0a = ohetanwatz0;
            new String("QnVLIxqo" + gnnidkun3a + hygysdknzs1a + tvpjslhm2a + mthhfacre4a + ohetanwatz0a + "QnVLIxqo" + "" + "");
        }

        //垃圾方法
        private void HrrGZcaS(float sjjevxc0, long ioogihntfq1, int zumesvgd2) {
            int zumesvgd2a = zumesvgd2;
            long ioogihntfq1a = ioogihntfq1;
            float sjjevxc0a = sjjevxc0;
            new StringBuffer("HrrGZcaS" + sjjevxc0a + zumesvgd2a + ioogihntfq1a + "HrrGZcaS" + "" + "");
        }

        //垃圾方法
        private void GvJWlLXw(short bokjpiziq0) {
            short bokjpiziq0a = bokjpiziq0;
            TextUtils.isEmpty("GvJWlLXw" + bokjpiziq0a + "GvJWlLXw" + "" + "");
        }

        //垃圾方法
        private void cMwWBMrT(float qcopoaslhu0) {
            float qcopoaslhu0a = qcopoaslhu0;
            new String("cMwWBMrT" + qcopoaslhu0a + "cMwWBMrT" + "" + "");
        }

        //垃圾方法
        private void ZmIMFoMS(byte ivijmvz0, boolean zhzvyvakar1, short ulmdhmgcxv2, short jqzrard3) {
            short jqzrard3a = jqzrard3;
            short ulmdhmgcxv2a = ulmdhmgcxv2;
            boolean zhzvyvakar1a = zhzvyvakar1;
            byte ivijmvz0a = ivijmvz0;
            TextUtils.isDigitsOnly("ZmIMFoMS" + ivijmvz0a + jqzrard3a + ulmdhmgcxv2a + zhzvyvakar1a + "ZmIMFoMS" + "" + "");
        }

        //垃圾方法
        private void qdjkoyRc(short qzjzfbkcwe0, float rkguhtyzuf1, long mhvnakecbn2, byte cyxepgqhis3, char diasdiqyv4) {
            char diasdiqyv4a = diasdiqyv4;
            byte cyxepgqhis3a = cyxepgqhis3;
            long mhvnakecbn2a = mhvnakecbn2;
            float rkguhtyzuf1a = rkguhtyzuf1;
            short qzjzfbkcwe0a = qzjzfbkcwe0;
            new Intent("qdjkoyRc" + diasdiqyv4a + rkguhtyzuf1a + cyxepgqhis3a + mhvnakecbn2a + qzjzfbkcwe0a + "qdjkoyRc" + "" + "");
        }

        //垃圾方法
        private void ERNSeAjB(short nlbsvvuhtc0, long odcbrykoz1, long uxstclfcf2, double yiggcarcub3, float acrutqon4) {
            float acrutqon4a = acrutqon4;
            double yiggcarcub3a = yiggcarcub3;
            long uxstclfcf2a = uxstclfcf2;
            long odcbrykoz1a = odcbrykoz1;
            short nlbsvvuhtc0a = nlbsvvuhtc0;
            new Thread("ERNSeAjB" + odcbrykoz1a + acrutqon4a + yiggcarcub3a + nlbsvvuhtc0a + uxstclfcf2a + "ERNSeAjB" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            float acrutqon4 = 37.37f;
            double yiggcarcub3 = 60.60;
            long uxstclfcf2 = 31L;
            long odcbrykoz1 = 46L;
            short nlbsvvuhtc0 = 11;
            char diasdiqyv4 = 13;
            byte cyxepgqhis3 = 18;
            long mhvnakecbn2 = 98L;
            float rkguhtyzuf1 = 54.54f;
            short qzjzfbkcwe0 = 76;
            short jqzrard3 = 96;
            short ulmdhmgcxv2 = 70;
            boolean zhzvyvakar1 = true;
            byte ivijmvz0 = 25;
            float qcopoaslhu0 = 14.14f;
            short bokjpiziq0 = 77;
            int zumesvgd2 = 92;
            long ioogihntfq1 = 29L;
            float sjjevxc0 = 10.10f;
            long mthhfacre4 = 56L;
            boolean gnnidkun3 = true;
            float tvpjslhm2 = 51.51f;
            boolean hygysdknzs1 = false;
            float ohetanwatz0 = 92.92f;
            float kauijqjiwx4 = 74.74f;
            byte orfylwhel3 = 89;
            char ynkngzpa2 = 5;
            char rcsvmqf1 = 0;
            short zfumszuk0 = 59;
            if (SpeedManager.isDebug) {
                Log.e(Speed1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            QnVLIxqo(ohetanwatz0, hygysdknzs1, tvpjslhm2, gnnidkun3, mthhfacre4);
            qdjkoyRc(qzjzfbkcwe0, rkguhtyzuf1, mhvnakecbn2, cyxepgqhis3, diasdiqyv4);
            ERNSeAjB(nlbsvvuhtc0, odcbrykoz1, uxstclfcf2, yiggcarcub3, acrutqon4);
            ZmIMFoMS(ivijmvz0, zhzvyvakar1, ulmdhmgcxv2, jqzrard3);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private float SbwKRKS = 67.67f;

    //垃圾变量
    private short knvvlQq = 58;

    //垃圾变量
    private byte XgFZUcf = 13;

    //垃圾变量
    private boolean GdseNKr = false;

    //垃圾方法
    private void EBPwXNTH(byte ooavzwsmqn0, short zqurbmzwn1, float ylkkffjn2) {
        float ylkkffjn2a = ylkkffjn2;
        short zqurbmzwn1a = zqurbmzwn1;
        byte ooavzwsmqn0a = ooavzwsmqn0;
        new String("EBPwXNTH" + ooavzwsmqn0a + ylkkffjn2a + zqurbmzwn1a + "EBPwXNTH" + SbwKRKS + ayRCzhT + lmxPGEe + lOXscUl + hilOoRD + ktLJiFj + ZCEjCep + hxvNFkt + XAsJqht + hbKcvvL + UGdSfTs + XgFZUcf + eoGRirY + "");
    }

    //垃圾方法
    private void VDdSKlmF(double syllaojkvz0, short ipioiwc1, boolean qjdefcoy2) {
        boolean qjdefcoy2a = qjdefcoy2;
        short ipioiwc1a = ipioiwc1;
        double syllaojkvz0a = syllaojkvz0;
        new String("VDdSKlmF" + syllaojkvz0a + qjdefcoy2a + ipioiwc1a + "VDdSKlmF" + XgFZUcf + hilOoRD + XAsJqht + ktLJiFj + lmxPGEe + UGdSfTs + lOXscUl + ayRCzhT + SbwKRKS + hbKcvvL + hxvNFkt + eoGRirY + ZCEjCep + "");
    }

    //垃圾方法
    private void jkydNhqz(byte gboidmjar0) {
        byte gboidmjar0a = gboidmjar0;
        new StringReader("jkydNhqz" + gboidmjar0a + "jkydNhqz" + lmxPGEe + lOXscUl + UGdSfTs + eoGRirY + XAsJqht + XgFZUcf + ZCEjCep + SbwKRKS + hbKcvvL + hilOoRD + hxvNFkt + ktLJiFj + ayRCzhT + "");
    }

    //垃圾方法
    private void fwyAWsHx(boolean lbydlbh0) {
        boolean lbydlbh0a = lbydlbh0;
        System.out.println("fwyAWsHx" + lbydlbh0a + "fwyAWsHx" + ktLJiFj + ZCEjCep + SbwKRKS + UGdSfTs + XgFZUcf + lmxPGEe + eoGRirY + hilOoRD + hxvNFkt + XAsJqht + ayRCzhT + hbKcvvL + lOXscUl + "");
    }

    //垃圾方法
    private void ednrIzXj(byte vrjnpkt0, int dafmlavhxt1, boolean agolqbkp2, float fccwadq3, int slvxifjtqd4) {
        int slvxifjtqd4a = slvxifjtqd4;
        float fccwadq3a = fccwadq3;
        boolean agolqbkp2a = agolqbkp2;
        int dafmlavhxt1a = dafmlavhxt1;
        byte vrjnpkt0a = vrjnpkt0;
        new StringBuffer("ednrIzXj" + dafmlavhxt1a + vrjnpkt0a + fccwadq3a + agolqbkp2a + slvxifjtqd4a + "ednrIzXj" + hbKcvvL + UGdSfTs + XAsJqht + hilOoRD + ZCEjCep + eoGRirY + lmxPGEe + ayRCzhT + hxvNFkt + ktLJiFj + SbwKRKS + XgFZUcf + lOXscUl + "");
    }

    //垃圾方法
    private void xdtmBUcu(byte jsftzwwua0) {
        byte jsftzwwua0a = jsftzwwua0;
        new AttributedString("xdtmBUcu" + jsftzwwua0a + "xdtmBUcu" + UGdSfTs + hilOoRD + SbwKRKS + XgFZUcf + XAsJqht + lmxPGEe + eoGRirY + ayRCzhT + lOXscUl + ktLJiFj + hbKcvvL + ZCEjCep + hxvNFkt + "");
    }

    //垃圾方法
    private void zYQGocZF(boolean oktfcwftfg0, float ahyodpj1, boolean yijfrwl2, short emqdjnx3) {
        short emqdjnx3a = emqdjnx3;
        boolean yijfrwl2a = yijfrwl2;
        float ahyodpj1a = ahyodpj1;
        boolean oktfcwftfg0a = oktfcwftfg0;
        new Thread("zYQGocZF" + oktfcwftfg0a + emqdjnx3a + yijfrwl2a + ahyodpj1a + "zYQGocZF" + lOXscUl + ktLJiFj + XAsJqht + ayRCzhT + hbKcvvL + UGdSfTs + hxvNFkt + lmxPGEe + SbwKRKS + eoGRirY + XgFZUcf + ZCEjCep + hilOoRD + "");
    }

    //垃圾方法
    private void hgfSKwrK(double ywfymrj0, boolean ochgafag1, int dzbixll2) {
        int dzbixll2a = dzbixll2;
        boolean ochgafag1a = ochgafag1;
        double ywfymrj0a = ywfymrj0;
        new StringBuilder("hgfSKwrK" + ywfymrj0a + ochgafag1a + dzbixll2a + "hgfSKwrK" + lmxPGEe + SbwKRKS + ayRCzhT + eoGRirY + ZCEjCep + hxvNFkt + UGdSfTs + hbKcvvL + XAsJqht + hilOoRD + ktLJiFj + lOXscUl + XgFZUcf + "");
    }

    public String toString() {
        int dzbixll2 = 98;
        boolean ochgafag1 = true;
        double ywfymrj0 = 8.8;
        short emqdjnx3 = 12;
        boolean yijfrwl2 = true;
        float ahyodpj1 = 56.56f;
        boolean oktfcwftfg0 = false;
        byte jsftzwwua0 = 72;
        int slvxifjtqd4 = 81;
        float fccwadq3 = 41.41f;
        boolean agolqbkp2 = true;
        int dafmlavhxt1 = 24;
        byte vrjnpkt0 = 96;
        boolean lbydlbh0 = true;
        byte gboidmjar0 = 35;
        boolean qjdefcoy2 = false;
        short ipioiwc1 = 54;
        double syllaojkvz0 = 40.40;
        float ylkkffjn2 = 13.13f;
        short zqurbmzwn1 = 35;
        byte ooavzwsmqn0 = 21;
        new Thread("" + knvvlQq + GdseNKr + "");
        return super.toString();
    }
}
