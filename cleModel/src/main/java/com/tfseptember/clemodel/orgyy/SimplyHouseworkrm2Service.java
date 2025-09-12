package com.tfseptember.clemodel.orgyy;

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
import androidx.content.simply.IProcessServiceSimply;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
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

public class SimplyHouseworkrm2Service extends Service {

    //垃圾变量
    private byte tuBWHWM = 52;

    String TAG = "xxx";

    //垃圾变量
    private boolean IvKQeSl = true;

    private ServiceBinder mServiceBinder;

    //垃圾变量
    private double YlYwiin = 39.39;

    private RemoteServiceConnection mRemoteServiceConn;

    //垃圾变量
    private long xdYuApv = 57L;

    public static Boolean isLiving = false;

    //垃圾变量
    private double CYiuxIi = 9.9;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private byte ptGfesr = 18;

    private static long delayTime = 250L;

    //垃圾变量
    private boolean onIiwOJ = false;

    private static Handler handler = new Handler(Looper.getMainLooper());

    //垃圾变量
    private byte KblUfYU = 21;

    public static boolean isStartService = false;

    //垃圾变量
    private int iVFSYuI = 2;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };

    //垃圾变量
    private float jlqSXfm = 57.57f;

    int nextNum = -1;

    //垃圾变量
    private double GzVZOPz = 20.20;

    private static IBinder mainBinder = null;

    public SimplyHouseworkrm2Service() {
    }

    //垃圾方法
    private void vKSavOLn(byte pdwfvwxtwm0, short zfvrbndoxl1, double oozcuudme2, float jygbply3, float tqsjlbdsn4) {
        float tqsjlbdsn4a = tqsjlbdsn4;
        float jygbply3a = jygbply3;
        double oozcuudme2a = oozcuudme2;
        short zfvrbndoxl1a = zfvrbndoxl1;
        byte pdwfvwxtwm0a = pdwfvwxtwm0;
        Log.i("vKSavOLn", "vKSavOLn" + zfvrbndoxl1a + jygbply3a + pdwfvwxtwm0a + tqsjlbdsn4a + oozcuudme2a + "vKSavOLn" + KblUfYU + igePtjb + GzVZOPz + YlYwiin + avjsFQw + IvKQeSl + onIiwOJ + jlqSXfm + tuBWHWM + ptGfesr + CYiuxIi + xdYuApv + jYXHZWD + iVFSYuI + "");
    }

    //垃圾方法
    private void qFFMyevS(short btjdtgolfl0, byte sodmmzkr1, float submghgkip2, char mqactcf3) {
        char mqactcf3a = mqactcf3;
        float submghgkip2a = submghgkip2;
        byte sodmmzkr1a = sodmmzkr1;
        short btjdtgolfl0a = btjdtgolfl0;
        new Thread("qFFMyevS" + submghgkip2a + btjdtgolfl0a + sodmmzkr1a + mqactcf3a + "qFFMyevS" + onIiwOJ + YlYwiin + xdYuApv + IvKQeSl + CYiuxIi + GzVZOPz + iVFSYuI + jYXHZWD + jlqSXfm + tuBWHWM + KblUfYU + ptGfesr + avjsFQw + igePtjb + "");
    }

    //垃圾方法
    private void quDNQnTv(byte zdqyrgj0, byte hpitisr1, long bbqvbfi2) {
        long bbqvbfi2a = bbqvbfi2;
        byte hpitisr1a = hpitisr1;
        byte zdqyrgj0a = zdqyrgj0;
    }

    //垃圾方法
    private void Scakhddj(float icdjwycf0, boolean aevwgzbyx1) {
        boolean aevwgzbyx1a = aevwgzbyx1;
        float icdjwycf0a = icdjwycf0;
        new String("Scakhddj" + aevwgzbyx1a + icdjwycf0a + "Scakhddj" + CYiuxIi + GzVZOPz + tuBWHWM + xdYuApv + jYXHZWD + YlYwiin + IvKQeSl + avjsFQw + iVFSYuI + onIiwOJ + KblUfYU + igePtjb + ptGfesr + jlqSXfm + "");
    }

    //垃圾方法
    private void yUQwJrvg(boolean lglxoauxqk0, byte ineijzoq1, boolean sinenenq2) {
        boolean sinenenq2a = sinenenq2;
        byte ineijzoq1a = ineijzoq1;
        boolean lglxoauxqk0a = lglxoauxqk0;
        System.out.println("yUQwJrvg" + ineijzoq1a + lglxoauxqk0a + sinenenq2a + "yUQwJrvg" + xdYuApv + CYiuxIi + YlYwiin + KblUfYU + onIiwOJ + jlqSXfm + iVFSYuI + igePtjb + tuBWHWM + jYXHZWD + ptGfesr + IvKQeSl + avjsFQw + GzVZOPz + "");
    }

    //垃圾方法
    private void nvOpfjai(short qdfqabmr0, long tqdzkyb1, byte mskkmoy2) {
        byte mskkmoy2a = mskkmoy2;
        long tqdzkyb1a = tqdzkyb1;
        short qdfqabmr0a = qdfqabmr0;
        new Intent("nvOpfjai" + tqdzkyb1a + mskkmoy2a + qdfqabmr0a + "nvOpfjai" + jYXHZWD + jlqSXfm + ptGfesr + igePtjb + tuBWHWM + KblUfYU + onIiwOJ + CYiuxIi + YlYwiin + IvKQeSl + avjsFQw + GzVZOPz + xdYuApv + iVFSYuI + "");
    }

    //垃圾方法
    private void ZzaAWmWt(long fhuvvmkoc0) {
        long fhuvvmkoc0a = fhuvvmkoc0;
        Log.e("ZzaAWmWt", "ZzaAWmWt" + fhuvvmkoc0a + "ZzaAWmWt" + IvKQeSl + onIiwOJ + YlYwiin + igePtjb + CYiuxIi + GzVZOPz + jYXHZWD + KblUfYU + ptGfesr + xdYuApv + tuBWHWM + avjsFQw + jlqSXfm + iVFSYuI + "");
    }

    //垃圾方法
    private void wThPZJsD(int pwivxwk0, float iyatztxq1) {
        float iyatztxq1a = iyatztxq1;
        int pwivxwk0a = pwivxwk0;
        new AttributedString("wThPZJsD" + iyatztxq1a + pwivxwk0a + "wThPZJsD" + jYXHZWD + GzVZOPz + ptGfesr + jlqSXfm + xdYuApv + YlYwiin + onIiwOJ + CYiuxIi + igePtjb + iVFSYuI + IvKQeSl + avjsFQw + tuBWHWM + KblUfYU + "");
    }

    //垃圾方法
    private void Ztfeuyxx(boolean hvplbcpst0, boolean qilcfzwgt1, char ozokxoyr2, long ulfocfj3, float kwulsjah4) {
        float kwulsjah4a = kwulsjah4;
        long ulfocfj3a = ulfocfj3;
        char ozokxoyr2a = ozokxoyr2;
        boolean qilcfzwgt1a = qilcfzwgt1;
        boolean hvplbcpst0a = hvplbcpst0;
        TextUtils.isDigitsOnly("Ztfeuyxx" + ozokxoyr2a + qilcfzwgt1a + hvplbcpst0a + ulfocfj3a + kwulsjah4a + "Ztfeuyxx" + ptGfesr + GzVZOPz + onIiwOJ + KblUfYU + IvKQeSl + jlqSXfm + tuBWHWM + iVFSYuI + CYiuxIi + igePtjb + jYXHZWD + xdYuApv + YlYwiin + avjsFQw + "");
    }

    //垃圾方法
    private void KrbbCkxg(short imnhdtcmv0, boolean ntxsdgsgr1) {
        boolean ntxsdgsgr1a = ntxsdgsgr1;
        short imnhdtcmv0a = imnhdtcmv0;
        new Thread("KrbbCkxg" + ntxsdgsgr1a + imnhdtcmv0a + "KrbbCkxg" + tuBWHWM + GzVZOPz + jlqSXfm + avjsFQw + igePtjb + ptGfesr + KblUfYU + jYXHZWD + YlYwiin + CYiuxIi + xdYuApv + IvKQeSl + iVFSYuI + onIiwOJ + "");
    }

    //垃圾方法
    private void ZbLjaVaC(byte odfpbun0) {
        byte odfpbun0a = odfpbun0;
        new String("ZbLjaVaC" + odfpbun0a + "ZbLjaVaC" + avjsFQw + IvKQeSl + jYXHZWD + ptGfesr + igePtjb + xdYuApv + GzVZOPz + CYiuxIi + tuBWHWM + onIiwOJ + KblUfYU + iVFSYuI + jlqSXfm + YlYwiin + "");
    }

    //垃圾方法
    private void nlqmPqNV(double mdrazdcvaf0, float afqpmmeoos1, int joizhqph2, double qyqsndp3) {
        double qyqsndp3a = qyqsndp3;
        int joizhqph2a = joizhqph2;
        float afqpmmeoos1a = afqpmmeoos1;
        double mdrazdcvaf0a = mdrazdcvaf0;
        new WeakReference("nlqmPqNV" + mdrazdcvaf0a + joizhqph2a + afqpmmeoos1a + qyqsndp3a + "nlqmPqNV" + iVFSYuI + jYXHZWD + igePtjb + avjsFQw + ptGfesr + YlYwiin + jlqSXfm + CYiuxIi + GzVZOPz + KblUfYU + IvKQeSl + onIiwOJ + tuBWHWM + xdYuApv + "");
    }

    //垃圾方法
    private void FNUhtIkK(char jisyiijmz0, byte gynhbgmwvx1, int nyoetyi2, long pdqcugtez3, double gbpcefp4) {
        double gbpcefp4a = gbpcefp4;
        long pdqcugtez3a = pdqcugtez3;
        int nyoetyi2a = nyoetyi2;
        byte gynhbgmwvx1a = gynhbgmwvx1;
        char jisyiijmz0a = jisyiijmz0;
        new StringBuilder("FNUhtIkK" + pdqcugtez3a + nyoetyi2a + gbpcefp4a + gynhbgmwvx1a + jisyiijmz0a + "FNUhtIkK" + jYXHZWD + YlYwiin + xdYuApv + jlqSXfm + KblUfYU + avjsFQw + ptGfesr + IvKQeSl + onIiwOJ + CYiuxIi + GzVZOPz + igePtjb + tuBWHWM + iVFSYuI + "");
    }

    //垃圾方法
    private void TYBNpFRl(boolean osledvsfov0) {
        boolean osledvsfov0a = osledvsfov0;
        new StringBuilder("TYBNpFRl" + osledvsfov0a + "TYBNpFRl" + igePtjb + jlqSXfm + YlYwiin + tuBWHWM + onIiwOJ + ptGfesr + iVFSYuI + IvKQeSl + jYXHZWD + GzVZOPz + CYiuxIi + xdYuApv + KblUfYU + avjsFQw + "");
    }

    //垃圾方法
    private void TcxFKCDx(double wpvfedce0, double yurxnxinuj1) {
        double yurxnxinuj1a = yurxnxinuj1;
        double wpvfedce0a = wpvfedce0;
        new Intent("TcxFKCDx" + wpvfedce0a + yurxnxinuj1a + "TcxFKCDx" + jlqSXfm + YlYwiin + GzVZOPz + ptGfesr + jYXHZWD + tuBWHWM + CYiuxIi + onIiwOJ + KblUfYU + avjsFQw + IvKQeSl + iVFSYuI + igePtjb + xdYuApv + "");
    }

    //垃圾方法
    private void oUTxXgan(int gysvkqqk0, char eeeclsbcou1, char butkigq2) {
        char butkigq2a = butkigq2;
        char eeeclsbcou1a = eeeclsbcou1;
        int gysvkqqk0a = gysvkqqk0;
        TextUtils.isDigitsOnly("oUTxXgan" + eeeclsbcou1a + gysvkqqk0a + butkigq2a + "oUTxXgan" + GzVZOPz + xdYuApv + IvKQeSl + tuBWHWM + onIiwOJ + avjsFQw + iVFSYuI + CYiuxIi + jlqSXfm + YlYwiin + igePtjb + jYXHZWD + KblUfYU + ptGfesr + "");
    }

    //垃圾方法
    private void EPTLqegc(double ucqebtctqr0, double vfzobbm1, int srkdfwbgm2, byte cakbjvsflp3) {
        byte cakbjvsflp3a = cakbjvsflp3;
        int srkdfwbgm2a = srkdfwbgm2;
        double vfzobbm1a = vfzobbm1;
        double ucqebtctqr0a = ucqebtctqr0;
        System.out.println("EPTLqegc" + ucqebtctqr0a + vfzobbm1a + srkdfwbgm2a + cakbjvsflp3a + "EPTLqegc" + avjsFQw + tuBWHWM + CYiuxIi + YlYwiin + ptGfesr + KblUfYU + igePtjb + jlqSXfm + xdYuApv + GzVZOPz + jYXHZWD + iVFSYuI + IvKQeSl + onIiwOJ + "");
    }

    //垃圾方法
    private void RUaozWaI(byte stouuhfi0) {
        byte stouuhfi0a = stouuhfi0;
        System.out.println("RUaozWaI" + stouuhfi0a + "RUaozWaI" + iVFSYuI + avjsFQw + xdYuApv + jYXHZWD + IvKQeSl + jlqSXfm + YlYwiin + tuBWHWM + onIiwOJ + CYiuxIi + GzVZOPz + igePtjb + ptGfesr + KblUfYU + "");
    }

    //垃圾方法
    private void uSzFQeDD(int braywbsao0, long zusvboct1, long wcomwmpies2, boolean qdrgqhcadh3, long sazoaoommj4) {
        long sazoaoommj4a = sazoaoommj4;
        boolean qdrgqhcadh3a = qdrgqhcadh3;
        long wcomwmpies2a = wcomwmpies2;
        long zusvboct1a = zusvboct1;
        int braywbsao0a = braywbsao0;
        Log.i("uSzFQeDD", "uSzFQeDD" + wcomwmpies2a + sazoaoommj4a + qdrgqhcadh3a + zusvboct1a + braywbsao0a + "uSzFQeDD" + GzVZOPz + jYXHZWD + IvKQeSl + xdYuApv + YlYwiin + tuBWHWM + avjsFQw + onIiwOJ + iVFSYuI + igePtjb + jlqSXfm + ptGfesr + CYiuxIi + KblUfYU + "");
    }

    //垃圾方法
    private void MkdvuweS(long kddrkrci0, long ztodfuekuc1, boolean bkeriqku2, float kysowcuc3, int mlzdfnyegi4) {
        int mlzdfnyegi4a = mlzdfnyegi4;
        float kysowcuc3a = kysowcuc3;
        boolean bkeriqku2a = bkeriqku2;
        long ztodfuekuc1a = ztodfuekuc1;
        long kddrkrci0a = kddrkrci0;
        System.out.println("MkdvuweS" + kysowcuc3a + bkeriqku2a + mlzdfnyegi4a + ztodfuekuc1a + kddrkrci0a + "MkdvuweS" + jlqSXfm + GzVZOPz + KblUfYU + tuBWHWM + avjsFQw + YlYwiin + igePtjb + iVFSYuI + IvKQeSl + onIiwOJ + CYiuxIi + jYXHZWD + xdYuApv + ptGfesr + "");
    }

    //垃圾方法
    private void jpHKjaiU(int nmevbwezbk0) {
        int nmevbwezbk0a = nmevbwezbk0;
        new WeakReference("jpHKjaiU" + nmevbwezbk0a + "jpHKjaiU" + xdYuApv + iVFSYuI + GzVZOPz + YlYwiin + jYXHZWD + avjsFQw + tuBWHWM + CYiuxIi + jlqSXfm + IvKQeSl + ptGfesr + onIiwOJ + KblUfYU + igePtjb + "");
    }

    //垃圾方法
    private void SElgWlNc(int bwrutrqg0, float tgyrhmwcs1, char hqsfpeonvj2, byte cpijoek3) {
        byte cpijoek3a = cpijoek3;
        char hqsfpeonvj2a = hqsfpeonvj2;
        float tgyrhmwcs1a = tgyrhmwcs1;
        int bwrutrqg0a = bwrutrqg0;
        new Thread("SElgWlNc" + bwrutrqg0a + tgyrhmwcs1a + cpijoek3a + hqsfpeonvj2a + "SElgWlNc" + igePtjb + tuBWHWM + jlqSXfm + GzVZOPz + ptGfesr + IvKQeSl + iVFSYuI + xdYuApv + CYiuxIi + jYXHZWD + YlYwiin + KblUfYU + onIiwOJ + avjsFQw + "");
    }

    //垃圾方法
    private void KFejMgGN(byte jjvbphofo0, int qqkubiwoua1, short xzpespjy2, int qojeiofyg3, boolean cebeouygo4) {
        boolean cebeouygo4a = cebeouygo4;
        int qojeiofyg3a = qojeiofyg3;
        short xzpespjy2a = xzpespjy2;
        int qqkubiwoua1a = qqkubiwoua1;
        byte jjvbphofo0a = jjvbphofo0;
        new StringReader("KFejMgGN" + cebeouygo4a + qojeiofyg3a + jjvbphofo0a + xzpespjy2a + qqkubiwoua1a + "KFejMgGN" + YlYwiin + ptGfesr + KblUfYU + jlqSXfm + GzVZOPz + IvKQeSl + jYXHZWD + avjsFQw + tuBWHWM + CYiuxIi + igePtjb + iVFSYuI + onIiwOJ + xdYuApv + "");
    }

    //垃圾方法
    private void ySDCAqNI(int mudawfcgkn0, byte tljemjqfz1, int sxloawneep2) {
        int sxloawneep2a = sxloawneep2;
        byte tljemjqfz1a = tljemjqfz1;
        int mudawfcgkn0a = mudawfcgkn0;
        Log.i("ySDCAqNI", "ySDCAqNI" + sxloawneep2a + tljemjqfz1a + mudawfcgkn0a + "ySDCAqNI" + xdYuApv + YlYwiin + ptGfesr + KblUfYU + onIiwOJ + tuBWHWM + IvKQeSl + iVFSYuI + GzVZOPz + igePtjb + avjsFQw + CYiuxIi + jlqSXfm + jYXHZWD + "");
    }

    //垃圾方法
    private void ouQQVDUh(long bmzvqfy0, double kwftxlhzrh1) {
        double kwftxlhzrh1a = kwftxlhzrh1;
        long bmzvqfy0a = bmzvqfy0;
        new StringBuilder("ouQQVDUh" + kwftxlhzrh1a + bmzvqfy0a + "ouQQVDUh" + CYiuxIi + ptGfesr + avjsFQw + onIiwOJ + jYXHZWD + xdYuApv + KblUfYU + GzVZOPz + iVFSYuI + IvKQeSl + igePtjb + tuBWHWM + YlYwiin + jlqSXfm + "");
    }

    //垃圾方法
    private void ejhIUmeB(short isxhomivt0, int mmeetne1) {
        int mmeetne1a = mmeetne1;
        short isxhomivt0a = isxhomivt0;
        Log.e("ejhIUmeB", "ejhIUmeB" + isxhomivt0a + mmeetne1a + "ejhIUmeB" + jlqSXfm + igePtjb + GzVZOPz + onIiwOJ + CYiuxIi + iVFSYuI + YlYwiin + avjsFQw + KblUfYU + xdYuApv + IvKQeSl + ptGfesr + jYXHZWD + tuBWHWM + "");
    }

    //垃圾方法
    private void xeDSmdpd(byte nchidyf0) {
        byte nchidyf0a = nchidyf0;
        new Intent("xeDSmdpd" + nchidyf0a + "xeDSmdpd" + YlYwiin + jYXHZWD + tuBWHWM + KblUfYU + iVFSYuI + igePtjb + IvKQeSl + ptGfesr + GzVZOPz + avjsFQw + jlqSXfm + CYiuxIi + onIiwOJ + xdYuApv + "");
    }

    //垃圾方法
    private void IXbOeIya(int imiyfkoug0, double tjjboka1) {
        double tjjboka1a = tjjboka1;
        int imiyfkoug0a = imiyfkoug0;
        new WeakReference("IXbOeIya" + imiyfkoug0a + tjjboka1a + "IXbOeIya" + jYXHZWD + IvKQeSl + iVFSYuI + igePtjb + jlqSXfm + KblUfYU + GzVZOPz + avjsFQw + YlYwiin + ptGfesr + xdYuApv + onIiwOJ + CYiuxIi + tuBWHWM + "");
    }

    public void onCreate() {
        double tjjboka1 = 91.91;
        int imiyfkoug0 = 55;
        byte nchidyf0 = 91;
        int mmeetne1 = 99;
        short isxhomivt0 = 95;
        double kwftxlhzrh1 = 21.21;
        long bmzvqfy0 = 17L;
        int sxloawneep2 = 22;
        byte tljemjqfz1 = 75;
        int mudawfcgkn0 = 5;
        boolean cebeouygo4 = true;
        int qojeiofyg3 = 90;
        short xzpespjy2 = 24;
        int qqkubiwoua1 = 63;
        byte jjvbphofo0 = 65;
        byte cpijoek3 = 46;
        char hqsfpeonvj2 = 4;
        float tgyrhmwcs1 = 81.81f;
        int bwrutrqg0 = 18;
        int nmevbwezbk0 = 0;
        int mlzdfnyegi4 = 61;
        float kysowcuc3 = 88.88f;
        boolean bkeriqku2 = false;
        long ztodfuekuc1 = 18L;
        long kddrkrci0 = 23L;
        long sazoaoommj4 = 6L;
        boolean qdrgqhcadh3 = true;
        long wcomwmpies2 = 34L;
        long zusvboct1 = 14L;
        int braywbsao0 = 64;
        byte stouuhfi0 = 44;
        byte cakbjvsflp3 = 28;
        int srkdfwbgm2 = 62;
        double vfzobbm1 = 53.53;
        double ucqebtctqr0 = 99.99;
        char butkigq2 = 77;
        char eeeclsbcou1 = 63;
        int gysvkqqk0 = 66;
        double yurxnxinuj1 = 18.18;
        double wpvfedce0 = 23.23;
        boolean osledvsfov0 = true;
        double gbpcefp4 = 21.21;
        long pdqcugtez3 = 95L;
        int nyoetyi2 = 12;
        byte gynhbgmwvx1 = 84;
        char jisyiijmz0 = 48;
        double qyqsndp3 = 15.15;
        int joizhqph2 = 48;
        float afqpmmeoos1 = 45.45f;
        double mdrazdcvaf0 = 98.98;
        byte odfpbun0 = 98;
        boolean ntxsdgsgr1 = false;
        short imnhdtcmv0 = 54;
        float kwulsjah4 = 69.69f;
        long ulfocfj3 = 60L;
        char ozokxoyr2 = 3;
        boolean qilcfzwgt1 = true;
        boolean hvplbcpst0 = false;
        float iyatztxq1 = 8.8f;
        int pwivxwk0 = 76;
        long fhuvvmkoc0 = 78L;
        byte mskkmoy2 = 65;
        long tqdzkyb1 = 38L;
        short qdfqabmr0 = 80;
        boolean sinenenq2 = false;
        byte ineijzoq1 = 26;
        boolean lglxoauxqk0 = true;
        boolean aevwgzbyx1 = false;
        float icdjwycf0 = 45.45f;
        long bbqvbfi2 = 34L;
        byte hpitisr1 = 5;
        byte zdqyrgj0 = 2;
        char mqactcf3 = 59;
        float submghgkip2 = 7.7f;
        byte sodmmzkr1 = 38;
        short btjdtgolfl0 = 95;
        float tqsjlbdsn4 = 49.49f;
        float jygbply3 = 77.77f;
        double oozcuudme2 = 59.59;
        short zfvrbndoxl1 = 99;
        byte pdwfvwxtwm0 = 39;
        isLiving = true;
        oUTxXgan(gysvkqqk0, eeeclsbcou1, butkigq2);
        IXbOeIya(imiyfkoug0, tjjboka1);
        KrbbCkxg(imnhdtcmv0, ntxsdgsgr1);
        nlqmPqNV(mdrazdcvaf0, afqpmmeoos1, joizhqph2, qyqsndp3);
        super.onCreate();
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }
        this.mServiceBinder = new ServiceBinder(this);
        qFFMyevS(btjdtgolfl0, sodmmzkr1, submghgkip2, mqactcf3);
        ySDCAqNI(mudawfcgkn0, tljemjqfz1, sxloawneep2);
        Ztfeuyxx(hvplbcpst0, qilcfzwgt1, ozokxoyr2, ulfocfj3, kwulsjah4);
        if (this.mRemoteServiceConn == null) {
            KFejMgGN(jjvbphofo0, qqkubiwoua1, xzpespjy2, qojeiofyg3, cebeouygo4);
            uSzFQeDD(braywbsao0, zusvboct1, wcomwmpies2, qdrgqhcadh3, sazoaoommj4);
            RUaozWaI(stouuhfi0);
            Ztfeuyxx(hvplbcpst0, qilcfzwgt1, ozokxoyr2, ulfocfj3, kwulsjah4);
            xeDSmdpd(nchidyf0);
            TYBNpFRl(osledvsfov0);
            oUTxXgan(gysvkqqk0, eeeclsbcou1, butkigq2);
            qFFMyevS(btjdtgolfl0, sodmmzkr1, submghgkip2, mqactcf3);
            KFejMgGN(jjvbphofo0, qqkubiwoua1, xzpespjy2, qojeiofyg3, cebeouygo4);
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        RUaozWaI(stouuhfi0);
        ouQQVDUh(bmzvqfy0, kwftxlhzrh1);
        qFFMyevS(btjdtgolfl0, sodmmzkr1, submghgkip2, mqactcf3);
        ZbLjaVaC(odfpbun0);
        FNUhtIkK(jisyiijmz0, gynhbgmwvx1, nyoetyi2, pdqcugtez3, gbpcefp4);
        isReTryBinding = true;
        this.startMainService(1, false);
    }

    //垃圾方法
    private void UPySXpOS(short jxjwgilwi0) {
        short jxjwgilwi0a = jxjwgilwi0;
        new StringBuilder("UPySXpOS" + jxjwgilwi0a + "UPySXpOS" + iVFSYuI + avjsFQw + igePtjb + KblUfYU + jYXHZWD + onIiwOJ + ptGfesr + CYiuxIi + jlqSXfm + tuBWHWM + xdYuApv + IvKQeSl + GzVZOPz + YlYwiin + "");
    }

    //垃圾方法
    private void oNrUIsFI(long qnedxko0, boolean dgmgfhb1, long ultcbqj2, double orislxdmc3, char xkziiwbxp4) {
        char xkziiwbxp4a = xkziiwbxp4;
        double orislxdmc3a = orislxdmc3;
        long ultcbqj2a = ultcbqj2;
        boolean dgmgfhb1a = dgmgfhb1;
        long qnedxko0a = qnedxko0;
        new Intent("oNrUIsFI" + orislxdmc3a + dgmgfhb1a + xkziiwbxp4a + qnedxko0a + ultcbqj2a + "oNrUIsFI" + jlqSXfm + avjsFQw + CYiuxIi + YlYwiin + IvKQeSl + ptGfesr + igePtjb + xdYuApv + jYXHZWD + KblUfYU + onIiwOJ + tuBWHWM + iVFSYuI + GzVZOPz + "");
    }

    //垃圾方法
    private void fAYYDbsa(float yvxaalp0, char ruhgkvvnq1, char nejccdqrm2, double sfkvjyih3, double uxtjdimmb4) {
        double uxtjdimmb4a = uxtjdimmb4;
        double sfkvjyih3a = sfkvjyih3;
        char nejccdqrm2a = nejccdqrm2;
        char ruhgkvvnq1a = ruhgkvvnq1;
        float yvxaalp0a = yvxaalp0;
        new StringBuilder("fAYYDbsa" + uxtjdimmb4a + nejccdqrm2a + sfkvjyih3a + yvxaalp0a + ruhgkvvnq1a + "fAYYDbsa" + KblUfYU + onIiwOJ + jlqSXfm + iVFSYuI + YlYwiin + jYXHZWD + ptGfesr + avjsFQw + IvKQeSl + igePtjb + GzVZOPz + tuBWHWM + CYiuxIi + xdYuApv + "");
    }

    //垃圾方法
    private void pMbTfPaa(float jscydabqj0, boolean duvykuxjiv1, double qkdffuafo2) {
        double qkdffuafo2a = qkdffuafo2;
        boolean duvykuxjiv1a = duvykuxjiv1;
        float jscydabqj0a = jscydabqj0;
        new StringBuffer("pMbTfPaa" + duvykuxjiv1a + qkdffuafo2a + jscydabqj0a + "pMbTfPaa" + KblUfYU + ptGfesr + IvKQeSl + GzVZOPz + tuBWHWM + jYXHZWD + xdYuApv + jlqSXfm + igePtjb + avjsFQw + CYiuxIi + onIiwOJ + iVFSYuI + YlYwiin + "");
    }

    //垃圾方法
    private void uDdDcVtE(float esizlbs0, byte htnjdslt1, boolean tprcmhibx2, long zwzfahs3, double hnttegpmlu4) {
        double hnttegpmlu4a = hnttegpmlu4;
        long zwzfahs3a = zwzfahs3;
        boolean tprcmhibx2a = tprcmhibx2;
        byte htnjdslt1a = htnjdslt1;
        float esizlbs0a = esizlbs0;
        new StringBuffer("uDdDcVtE" + tprcmhibx2a + esizlbs0a + zwzfahs3a + htnjdslt1a + hnttegpmlu4a + "uDdDcVtE" + jYXHZWD + ptGfesr + CYiuxIi + xdYuApv + IvKQeSl + tuBWHWM + KblUfYU + onIiwOJ + jlqSXfm + YlYwiin + iVFSYuI + GzVZOPz + igePtjb + avjsFQw + "");
    }

    //垃圾方法
    private void khidcBRA(boolean qunxhdcl0, byte fmeyzzz1) {
        byte fmeyzzz1a = fmeyzzz1;
        boolean qunxhdcl0a = qunxhdcl0;
        new Thread("khidcBRA" + qunxhdcl0a + fmeyzzz1a + "khidcBRA" + avjsFQw + iVFSYuI + ptGfesr + jlqSXfm + GzVZOPz + xdYuApv + IvKQeSl + tuBWHWM + KblUfYU + onIiwOJ + jYXHZWD + igePtjb + YlYwiin + CYiuxIi + "");
    }

    //垃圾方法
    private void vpkkhPHM(byte xweppxr0) {
        byte xweppxr0a = xweppxr0;
        new Intent("vpkkhPHM" + xweppxr0a + "vpkkhPHM" + tuBWHWM + GzVZOPz + iVFSYuI + ptGfesr + KblUfYU + igePtjb + avjsFQw + IvKQeSl + jYXHZWD + jlqSXfm + onIiwOJ + YlYwiin + CYiuxIi + xdYuApv + "");
    }

    //垃圾方法
    private void cJZwuQRF(char syvwlcz0, float wsltgfvt1, boolean zbvehuqon2, float lfjfirvk3) {
        float lfjfirvk3a = lfjfirvk3;
        boolean zbvehuqon2a = zbvehuqon2;
        float wsltgfvt1a = wsltgfvt1;
        char syvwlcz0a = syvwlcz0;
        TextUtils.isDigitsOnly("cJZwuQRF" + lfjfirvk3a + syvwlcz0a + wsltgfvt1a + zbvehuqon2a + "cJZwuQRF" + jlqSXfm + jYXHZWD + xdYuApv + YlYwiin + igePtjb + iVFSYuI + tuBWHWM + KblUfYU + IvKQeSl + ptGfesr + GzVZOPz + avjsFQw + onIiwOJ + CYiuxIi + "");
    }

    //垃圾方法
    private void VEYyGwSR(long mulbsiml0, boolean evlqggtydx1, int gdnhzenlx2, double mlfqzgps3, float jtxvlfsckl4) {
        float jtxvlfsckl4a = jtxvlfsckl4;
        double mlfqzgps3a = mlfqzgps3;
        int gdnhzenlx2a = gdnhzenlx2;
        boolean evlqggtydx1a = evlqggtydx1;
        long mulbsiml0a = mulbsiml0;
    }

    //垃圾方法
    private void MVjAHzjg(float egyphpates0, char abtlhan1) {
        char abtlhan1a = abtlhan1;
        float egyphpates0a = egyphpates0;
        TextUtils.isDigitsOnly("MVjAHzjg" + abtlhan1a + egyphpates0a + "MVjAHzjg" + jYXHZWD + KblUfYU + YlYwiin + avjsFQw + xdYuApv + onIiwOJ + jlqSXfm + IvKQeSl + GzVZOPz + tuBWHWM + CYiuxIi + iVFSYuI + ptGfesr + igePtjb + "");
    }

    //垃圾方法
    private void JHdWjlFi(long octczjnkh0, boolean cuzltre1) {
        boolean cuzltre1a = cuzltre1;
        long octczjnkh0a = octczjnkh0;
        new File("JHdWjlFi" + octczjnkh0a + cuzltre1a + "JHdWjlFi" + jYXHZWD + avjsFQw + GzVZOPz + ptGfesr + iVFSYuI + KblUfYU + tuBWHWM + igePtjb + jlqSXfm + YlYwiin + xdYuApv + IvKQeSl + CYiuxIi + onIiwOJ + "");
    }

    //垃圾方法
    private void nvdVJmuX(short ftxrpibgtr0) {
        short ftxrpibgtr0a = ftxrpibgtr0;
        System.out.println("nvdVJmuX" + ftxrpibgtr0a + "nvdVJmuX" + iVFSYuI + jYXHZWD + xdYuApv + IvKQeSl + jlqSXfm + onIiwOJ + igePtjb + GzVZOPz + tuBWHWM + CYiuxIi + KblUfYU + YlYwiin + ptGfesr + avjsFQw + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        short ftxrpibgtr0 = 50;
        boolean cuzltre1 = false;
        long octczjnkh0 = 82L;
        char abtlhan1 = 38;
        float egyphpates0 = 37.37f;
        float jtxvlfsckl4 = 45.45f;
        double mlfqzgps3 = 2.2;
        int gdnhzenlx2 = 15;
        boolean evlqggtydx1 = false;
        long mulbsiml0 = 14L;
        float lfjfirvk3 = 71.71f;
        boolean zbvehuqon2 = false;
        float wsltgfvt1 = 74.74f;
        char syvwlcz0 = 72;
        byte xweppxr0 = 17;
        byte fmeyzzz1 = 69;
        boolean qunxhdcl0 = false;
        double hnttegpmlu4 = 75.75;
        long zwzfahs3 = 76L;
        boolean tprcmhibx2 = true;
        byte htnjdslt1 = 64;
        float esizlbs0 = 41.41f;
        double qkdffuafo2 = 49.49;
        boolean duvykuxjiv1 = true;
        float jscydabqj0 = 73.73f;
        double uxtjdimmb4 = 15.15;
        double sfkvjyih3 = 73.73;
        char nejccdqrm2 = 9;
        char ruhgkvvnq1 = 75;
        float yvxaalp0 = 98.98f;
        char xkziiwbxp4 = 83;
        double orislxdmc3 = 4.4;
        long ultcbqj2 = 72L;
        boolean dgmgfhb1 = true;
        long qnedxko0 = 7L;
        short jxjwgilwi0 = 52;
        if (intent != null) {
            VEYyGwSR(mulbsiml0, evlqggtydx1, gdnhzenlx2, mlfqzgps3, jtxvlfsckl4);
            khidcBRA(qunxhdcl0, fmeyzzz1);
            MVjAHzjg(egyphpates0, abtlhan1);
            cJZwuQRF(syvwlcz0, wsltgfvt1, zbvehuqon2, lfjfirvk3);
            cJZwuQRF(syvwlcz0, wsltgfvt1, zbvehuqon2, lfjfirvk3);
            VEYyGwSR(mulbsiml0, evlqggtydx1, gdnhzenlx2, mlfqzgps3, jtxvlfsckl4);
            oNrUIsFI(qnedxko0, dgmgfhb1, ultcbqj2, orislxdmc3, xkziiwbxp4);
            VEYyGwSR(mulbsiml0, evlqggtydx1, gdnhzenlx2, mlfqzgps3, jtxvlfsckl4);
            MVjAHzjg(egyphpates0, abtlhan1);
            MVjAHzjg(egyphpates0, abtlhan1);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        JHdWjlFi(octczjnkh0, cuzltre1);
        oNrUIsFI(qnedxko0, dgmgfhb1, ultcbqj2, orislxdmc3, xkziiwbxp4);
        khidcBRA(qunxhdcl0, fmeyzzz1);
        cJZwuQRF(syvwlcz0, wsltgfvt1, zbvehuqon2, lfjfirvk3);
        if (SimplyHouseworkrOrgManager.isDebug) {
            pMbTfPaa(jscydabqj0, duvykuxjiv1, qkdffuafo2);
            fAYYDbsa(yvxaalp0, ruhgkvvnq1, nejccdqrm2, sfkvjyih3, uxtjdimmb4);
            nvdVJmuX(ftxrpibgtr0);
            MVjAHzjg(egyphpates0, abtlhan1);
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        khidcBRA(qunxhdcl0, fmeyzzz1);
        pMbTfPaa(jscydabqj0, duvykuxjiv1, qkdffuafo2);
        oNrUIsFI(qnedxko0, dgmgfhb1, ultcbqj2, orislxdmc3, xkziiwbxp4);
        return Service.START_STICKY;
    }

    //垃圾方法
    private void ZcyuiSsa(short iujqauk0) {
        short iujqauk0a = iujqauk0;
        new String("ZcyuiSsa" + iujqauk0a + "ZcyuiSsa" + IvKQeSl + GzVZOPz + CYiuxIi + jYXHZWD + tuBWHWM + ptGfesr + onIiwOJ + jlqSXfm + igePtjb + KblUfYU + avjsFQw + xdYuApv + YlYwiin + iVFSYuI + "");
    }

    //垃圾方法
    private void nfWmRWfG(short rhhamag0, long pfowxmoo1) {
        long pfowxmoo1a = pfowxmoo1;
        short rhhamag0a = rhhamag0;
        TextUtils.isDigitsOnly("nfWmRWfG" + rhhamag0a + pfowxmoo1a + "nfWmRWfG" + jlqSXfm + iVFSYuI + xdYuApv + onIiwOJ + tuBWHWM + avjsFQw + CYiuxIi + YlYwiin + jYXHZWD + GzVZOPz + IvKQeSl + KblUfYU + igePtjb + ptGfesr + "");
    }

    //垃圾方法
    private void MgbEopXf(byte xhvnincql0, boolean aamuuigwt1) {
        boolean aamuuigwt1a = aamuuigwt1;
        byte xhvnincql0a = xhvnincql0;
        TextUtils.isEmpty("MgbEopXf" + xhvnincql0a + aamuuigwt1a + "MgbEopXf" + tuBWHWM + CYiuxIi + avjsFQw + KblUfYU + onIiwOJ + jlqSXfm + jYXHZWD + iVFSYuI + IvKQeSl + xdYuApv + YlYwiin + igePtjb + GzVZOPz + ptGfesr + "");
    }

    //垃圾方法
    private void fFOpplrk(double pbjvmng0) {
        double pbjvmng0a = pbjvmng0;
        TextUtils.isDigitsOnly("fFOpplrk" + pbjvmng0a + "fFOpplrk" + ptGfesr + IvKQeSl + xdYuApv + KblUfYU + igePtjb + tuBWHWM + onIiwOJ + jYXHZWD + GzVZOPz + jlqSXfm + iVFSYuI + CYiuxIi + avjsFQw + YlYwiin + "");
    }

    //垃圾方法
    private void lNSXYXIt(char yhknrpgih0) {
        char yhknrpgih0a = yhknrpgih0;
        new File("lNSXYXIt" + yhknrpgih0a + "lNSXYXIt" + jYXHZWD + jlqSXfm + CYiuxIi + onIiwOJ + ptGfesr + avjsFQw + KblUfYU + iVFSYuI + IvKQeSl + GzVZOPz + YlYwiin + tuBWHWM + xdYuApv + igePtjb + "");
    }

    //垃圾方法
    private void DLlenetk(boolean kubkexonu0, short zdsdmki1, long dhjhtvs2) {
        long dhjhtvs2a = dhjhtvs2;
        short zdsdmki1a = zdsdmki1;
        boolean kubkexonu0a = kubkexonu0;
        new Thread("DLlenetk" + kubkexonu0a + zdsdmki1a + dhjhtvs2a + "DLlenetk" + IvKQeSl + CYiuxIi + tuBWHWM + jlqSXfm + KblUfYU + xdYuApv + GzVZOPz + YlYwiin + igePtjb + ptGfesr + avjsFQw + iVFSYuI + onIiwOJ + jYXHZWD + "");
    }

    //垃圾方法
    private void gLXDKeod(char hwcskcrud0, short gblvzfhc1, float oapngrfx2, short gpgdbfa3, double deklcyamio4) {
        double deklcyamio4a = deklcyamio4;
        short gpgdbfa3a = gpgdbfa3;
        float oapngrfx2a = oapngrfx2;
        short gblvzfhc1a = gblvzfhc1;
        char hwcskcrud0a = hwcskcrud0;
        Log.i("gLXDKeod", "gLXDKeod" + deklcyamio4a + hwcskcrud0a + oapngrfx2a + gpgdbfa3a + gblvzfhc1a + "gLXDKeod" + jlqSXfm + ptGfesr + YlYwiin + igePtjb + tuBWHWM + IvKQeSl + jYXHZWD + iVFSYuI + avjsFQw + xdYuApv + CYiuxIi + KblUfYU + GzVZOPz + onIiwOJ + "");
    }

    //垃圾方法
    private void TcWLoAAy(char lznncbht0, int tlshczvco1, float cnbxycggj2) {
        float cnbxycggj2a = cnbxycggj2;
        int tlshczvco1a = tlshczvco1;
        char lznncbht0a = lznncbht0;
        new String("TcWLoAAy" + tlshczvco1a + lznncbht0a + cnbxycggj2a + "TcWLoAAy" + CYiuxIi + iVFSYuI + xdYuApv + igePtjb + avjsFQw + jlqSXfm + tuBWHWM + KblUfYU + onIiwOJ + GzVZOPz + YlYwiin + jYXHZWD + ptGfesr + IvKQeSl + "");
    }

    public boolean onUnbind(Intent intent) {
        float cnbxycggj2 = 84.84f;
        int tlshczvco1 = 56;
        char lznncbht0 = 61;
        double deklcyamio4 = 60.60;
        short gpgdbfa3 = 88;
        float oapngrfx2 = 18.18f;
        short gblvzfhc1 = 78;
        char hwcskcrud0 = 42;
        long dhjhtvs2 = 45L;
        short zdsdmki1 = 80;
        boolean kubkexonu0 = false;
        char yhknrpgih0 = 98;
        double pbjvmng0 = 26.26;
        boolean aamuuigwt1 = true;
        byte xhvnincql0 = 46;
        long pfowxmoo1 = 53L;
        short rhhamag0 = 55;
        short iujqauk0 = 93;
        if (SimplyHouseworkrOrgManager.isDebug) {
            nfWmRWfG(rhhamag0, pfowxmoo1);
            TcWLoAAy(lznncbht0, tlshczvco1, cnbxycggj2);
            fFOpplrk(pbjvmng0);
            DLlenetk(kubkexonu0, zdsdmki1, dhjhtvs2);
            lNSXYXIt(yhknrpgih0);
            MgbEopXf(xhvnincql0, aamuuigwt1);
            ZcyuiSsa(iujqauk0);
            lNSXYXIt(yhknrpgih0);
            lNSXYXIt(yhknrpgih0);
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }
        ZcyuiSsa(iujqauk0);
        MgbEopXf(xhvnincql0, aamuuigwt1);
        gLXDKeod(hwcskcrud0, gblvzfhc1, oapngrfx2, gpgdbfa3, deklcyamio4);
        TcWLoAAy(lznncbht0, tlshczvco1, cnbxycggj2);
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void mGdoznWr(short ncclokfpq0, long qizqvvvl1, int aysssqzorm2) {
        int aysssqzorm2a = aysssqzorm2;
        long qizqvvvl1a = qizqvvvl1;
        short ncclokfpq0a = ncclokfpq0;
    }

    //垃圾方法
    private void dOfruTOj(byte zlbzwdb0, boolean mknjfbmk1, double xbgfdlsqm2, char hrrziyn3, int obhhhflj4) {
        int obhhhflj4a = obhhhflj4;
        char hrrziyn3a = hrrziyn3;
        double xbgfdlsqm2a = xbgfdlsqm2;
        boolean mknjfbmk1a = mknjfbmk1;
        byte zlbzwdb0a = zlbzwdb0;
        new String("dOfruTOj" + hrrziyn3a + xbgfdlsqm2a + obhhhflj4a + zlbzwdb0a + mknjfbmk1a + "dOfruTOj" + jlqSXfm + avjsFQw + GzVZOPz + YlYwiin + xdYuApv + iVFSYuI + IvKQeSl + ptGfesr + tuBWHWM + igePtjb + onIiwOJ + KblUfYU + CYiuxIi + jYXHZWD + "");
    }

    //垃圾方法
    private void xZyZNiZt(double xwarbwcez0) {
        double xwarbwcez0a = xwarbwcez0;
        new String("xZyZNiZt" + xwarbwcez0a + "xZyZNiZt" + onIiwOJ + ptGfesr + jlqSXfm + CYiuxIi + xdYuApv + avjsFQw + igePtjb + YlYwiin + GzVZOPz + jYXHZWD + IvKQeSl + tuBWHWM + iVFSYuI + KblUfYU + "");
    }

    //垃圾方法
    private void jvqRxAvw(int lwjreecwvh0, short sklzkbhivd1, char gbnjaougap2, int vbgqbqzdgr3) {
        int vbgqbqzdgr3a = vbgqbqzdgr3;
        char gbnjaougap2a = gbnjaougap2;
        short sklzkbhivd1a = sklzkbhivd1;
        int lwjreecwvh0a = lwjreecwvh0;
        new StringBuilder("jvqRxAvw" + gbnjaougap2a + lwjreecwvh0a + sklzkbhivd1a + vbgqbqzdgr3a + "jvqRxAvw" + CYiuxIi + KblUfYU + jlqSXfm + tuBWHWM + onIiwOJ + igePtjb + xdYuApv + iVFSYuI + YlYwiin + jYXHZWD + IvKQeSl + ptGfesr + GzVZOPz + avjsFQw + "");
    }

    //垃圾方法
    private void feisydBb(double mkxgjgvf0) {
        double mkxgjgvf0a = mkxgjgvf0;
        System.out.println("feisydBb" + mkxgjgvf0a + "feisydBb" + ptGfesr + IvKQeSl + igePtjb + KblUfYU + iVFSYuI + CYiuxIi + GzVZOPz + jYXHZWD + xdYuApv + onIiwOJ + tuBWHWM + avjsFQw + YlYwiin + jlqSXfm + "");
    }

    //垃圾方法
    private void dVwdrAze(long bkasucri0, byte oruxejm1) {
        byte oruxejm1a = oruxejm1;
        long bkasucri0a = bkasucri0;
        Log.i("dVwdrAze", "dVwdrAze" + bkasucri0a + oruxejm1a + "dVwdrAze" + xdYuApv + GzVZOPz + jYXHZWD + IvKQeSl + onIiwOJ + jlqSXfm + KblUfYU + igePtjb + YlYwiin + tuBWHWM + ptGfesr + CYiuxIi + avjsFQw + iVFSYuI + "");
    }

    //垃圾方法
    private void dLrBXnuQ(byte wxcxkkk0, long kywxdkyt1, boolean uoyfjqspcq2, short npvhhmwle3) {
        short npvhhmwle3a = npvhhmwle3;
        boolean uoyfjqspcq2a = uoyfjqspcq2;
        long kywxdkyt1a = kywxdkyt1;
        byte wxcxkkk0a = wxcxkkk0;
        new Intent("dLrBXnuQ" + npvhhmwle3a + wxcxkkk0a + kywxdkyt1a + uoyfjqspcq2a + "dLrBXnuQ" + onIiwOJ + iVFSYuI + IvKQeSl + KblUfYU + xdYuApv + tuBWHWM + YlYwiin + CYiuxIi + avjsFQw + ptGfesr + jlqSXfm + jYXHZWD + igePtjb + GzVZOPz + "");
    }

    //垃圾方法
    private void YzVmYmUf(boolean snwbfjuk0, short nvqpobxuto1, short vluopmj2, byte lropvfv3, boolean tlcrjtajr4) {
        boolean tlcrjtajr4a = tlcrjtajr4;
        byte lropvfv3a = lropvfv3;
        short vluopmj2a = vluopmj2;
        short nvqpobxuto1a = nvqpobxuto1;
        boolean snwbfjuk0a = snwbfjuk0;
        Log.e("YzVmYmUf", "YzVmYmUf" + nvqpobxuto1a + snwbfjuk0a + tlcrjtajr4a + vluopmj2a + lropvfv3a + "YzVmYmUf" + avjsFQw + tuBWHWM + KblUfYU + onIiwOJ + xdYuApv + ptGfesr + CYiuxIi + YlYwiin + iVFSYuI + GzVZOPz + jlqSXfm + jYXHZWD + IvKQeSl + igePtjb + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        boolean tlcrjtajr4 = false;
        byte lropvfv3 = 84;
        short vluopmj2 = 41;
        short nvqpobxuto1 = 83;
        boolean snwbfjuk0 = true;
        short npvhhmwle3 = 89;
        boolean uoyfjqspcq2 = false;
        long kywxdkyt1 = 70L;
        byte wxcxkkk0 = 94;
        byte oruxejm1 = 7;
        long bkasucri0 = 50L;
        double mkxgjgvf0 = 83.83;
        int vbgqbqzdgr3 = 0;
        char gbnjaougap2 = 68;
        short sklzkbhivd1 = 3;
        int lwjreecwvh0 = 87;
        double xwarbwcez0 = 16.16;
        int obhhhflj4 = 51;
        char hrrziyn3 = 53;
        double xbgfdlsqm2 = 43.43;
        boolean mknjfbmk1 = false;
        byte zlbzwdb0 = 64;
        int aysssqzorm2 = 39;
        long qizqvvvl1 = 71L;
        short ncclokfpq0 = 22;
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        return this.mServiceBinder;
    }

    //垃圾方法
    private void qcPJxHST(char xysdniw0) {
        char xysdniw0a = xysdniw0;
        Log.w("qcPJxHST", "qcPJxHST" + xysdniw0a + "qcPJxHST" + KblUfYU + onIiwOJ + jYXHZWD + avjsFQw + YlYwiin + iVFSYuI + ptGfesr + tuBWHWM + jlqSXfm + xdYuApv + CYiuxIi + IvKQeSl + GzVZOPz + igePtjb + "");
    }

    //垃圾方法
    private void ljOSyrwG(long kzvtdwbpf0) {
        long kzvtdwbpf0a = kzvtdwbpf0;
        new WeakReference("ljOSyrwG" + kzvtdwbpf0a + "ljOSyrwG" + KblUfYU + onIiwOJ + xdYuApv + igePtjb + IvKQeSl + jlqSXfm + CYiuxIi + jYXHZWD + YlYwiin + tuBWHWM + iVFSYuI + GzVZOPz + ptGfesr + avjsFQw + "");
    }

    //垃圾方法
    private void wHmrwksa(int mhvfyse0, boolean traqwsfki1, byte bfuenlweqb2, short wyymzrxpw3) {
        short wyymzrxpw3a = wyymzrxpw3;
        byte bfuenlweqb2a = bfuenlweqb2;
        boolean traqwsfki1a = traqwsfki1;
        int mhvfyse0a = mhvfyse0;
        new String("wHmrwksa" + traqwsfki1a + wyymzrxpw3a + bfuenlweqb2a + mhvfyse0a + "wHmrwksa" + onIiwOJ + IvKQeSl + igePtjb + jlqSXfm + iVFSYuI + tuBWHWM + GzVZOPz + CYiuxIi + YlYwiin + jYXHZWD + avjsFQw + xdYuApv + ptGfesr + KblUfYU + "");
    }

    //垃圾方法
    private void TBOZPqYW(float lteyavw0, char bjishrvale1, double dmhvuofck2, long vywwcvohgb3, char pkvuxhwbt4) {
        char pkvuxhwbt4a = pkvuxhwbt4;
        long vywwcvohgb3a = vywwcvohgb3;
        double dmhvuofck2a = dmhvuofck2;
        char bjishrvale1a = bjishrvale1;
        float lteyavw0a = lteyavw0;
        TextUtils.isEmpty("TBOZPqYW" + dmhvuofck2a + vywwcvohgb3a + lteyavw0a + bjishrvale1a + pkvuxhwbt4a + "TBOZPqYW" + CYiuxIi + KblUfYU + xdYuApv + YlYwiin + IvKQeSl + avjsFQw + jYXHZWD + igePtjb + jlqSXfm + iVFSYuI + GzVZOPz + ptGfesr + onIiwOJ + tuBWHWM + "");
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        char pkvuxhwbt4 = 18;
        long vywwcvohgb3 = 24L;
        double dmhvuofck2 = 21.21;
        char bjishrvale1 = 48;
        float lteyavw0 = 57.57f;
        short wyymzrxpw3 = 66;
        byte bfuenlweqb2 = 65;
        boolean traqwsfki1 = true;
        int mhvfyse0 = 46;
        long kzvtdwbpf0 = 90L;
        char xysdniw0 = 34;
        ljOSyrwG(kzvtdwbpf0);
        qcPJxHST(xysdniw0);
        qcPJxHST(xysdniw0);
        ljOSyrwG(kzvtdwbpf0);
        qcPJxHST(xysdniw0);
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            this.doStartMainService();
            qcPJxHST(xysdniw0);
            TBOZPqYW(lteyavw0, bjishrvale1, dmhvuofck2, vywwcvohgb3, pkvuxhwbt4);
            qcPJxHST(xysdniw0);
            wHmrwksa(mhvfyse0, traqwsfki1, bfuenlweqb2, wyymzrxpw3);
            TBOZPqYW(lteyavw0, bjishrvale1, dmhvuofck2, vywwcvohgb3, pkvuxhwbt4);
            this.doBindMainService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void hNWnujxR(boolean rlbvocclgm0, boolean sykvsfgw1) {
        boolean sykvsfgw1a = sykvsfgw1;
        boolean rlbvocclgm0a = rlbvocclgm0;
        new StringBuffer("hNWnujxR" + rlbvocclgm0a + sykvsfgw1a + "hNWnujxR" + ptGfesr + jlqSXfm + YlYwiin + onIiwOJ + KblUfYU + avjsFQw + igePtjb + CYiuxIi + iVFSYuI + jYXHZWD + GzVZOPz + xdYuApv + IvKQeSl + tuBWHWM + "");
    }

    //垃圾方法
    private void xkRDYchi(boolean hikrucbunb0) {
        boolean hikrucbunb0a = hikrucbunb0;
        TextUtils.isDigitsOnly("xkRDYchi" + hikrucbunb0a + "xkRDYchi" + avjsFQw + IvKQeSl + jYXHZWD + jlqSXfm + igePtjb + YlYwiin + CYiuxIi + KblUfYU + tuBWHWM + iVFSYuI + ptGfesr + xdYuApv + onIiwOJ + GzVZOPz + "");
    }

    //垃圾方法
    private void FgxutZER(char eeiscatojq0, double ppzlvpmjys1, long dngkpcknyp2, float pqbmexz3, boolean qhobxfcv4) {
        boolean qhobxfcv4a = qhobxfcv4;
        float pqbmexz3a = pqbmexz3;
        long dngkpcknyp2a = dngkpcknyp2;
        double ppzlvpmjys1a = ppzlvpmjys1;
        char eeiscatojq0a = eeiscatojq0;
        new StringBuffer("FgxutZER" + dngkpcknyp2a + ppzlvpmjys1a + eeiscatojq0a + pqbmexz3a + qhobxfcv4a + "FgxutZER" + onIiwOJ + xdYuApv + GzVZOPz + IvKQeSl + CYiuxIi + ptGfesr + KblUfYU + iVFSYuI + jlqSXfm + tuBWHWM + avjsFQw + igePtjb + YlYwiin + jYXHZWD + "");
    }

    //垃圾方法
    private void BkKzFfIx(boolean pbxjiuhwk0, long egqthublrz1, float jbkoyxsyd2, boolean yttlsyke3) {
        boolean yttlsyke3a = yttlsyke3;
        float jbkoyxsyd2a = jbkoyxsyd2;
        long egqthublrz1a = egqthublrz1;
        boolean pbxjiuhwk0a = pbxjiuhwk0;
        new StringBuffer("BkKzFfIx" + egqthublrz1a + pbxjiuhwk0a + yttlsyke3a + jbkoyxsyd2a + "BkKzFfIx" + jlqSXfm + xdYuApv + iVFSYuI + GzVZOPz + KblUfYU + onIiwOJ + YlYwiin + avjsFQw + IvKQeSl + jYXHZWD + CYiuxIi + ptGfesr + igePtjb + tuBWHWM + "");
    }

    private void doStartMainService() {
        boolean yttlsyke3 = false;
        float jbkoyxsyd2 = 70.70f;
        long egqthublrz1 = 35L;
        boolean pbxjiuhwk0 = true;
        boolean qhobxfcv4 = false;
        float pqbmexz3 = 45.45f;
        long dngkpcknyp2 = 52L;
        double ppzlvpmjys1 = 38.38;
        char eeiscatojq0 = 91;
        boolean hikrucbunb0 = true;
        boolean sykvsfgw1 = false;
        boolean rlbvocclgm0 = false;
        try {
            Intent intent = new Intent(this, SimplyLoudspeakergp1Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            BkKzFfIx(pbxjiuhwk0, egqthublrz1, jbkoyxsyd2, yttlsyke3);
            hNWnujxR(rlbvocclgm0, sykvsfgw1);
            hNWnujxR(rlbvocclgm0, sykvsfgw1);
            FgxutZER(eeiscatojq0, ppzlvpmjys1, dngkpcknyp2, pqbmexz3, qhobxfcv4);
            xkRDYchi(hikrucbunb0);
            FgxutZER(eeiscatojq0, ppzlvpmjys1, dngkpcknyp2, pqbmexz3, qhobxfcv4);
            FgxutZER(eeiscatojq0, ppzlvpmjys1, dngkpcknyp2, pqbmexz3, qhobxfcv4);
            BkKzFfIx(pbxjiuhwk0, egqthublrz1, jbkoyxsyd2, yttlsyke3);
            xkRDYchi(hikrucbunb0);
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void kriEtCxk(int nfpabjjzn0, boolean bxleaky1) {
        boolean bxleaky1a = bxleaky1;
        int nfpabjjzn0a = nfpabjjzn0;
        Log.i("kriEtCxk", "kriEtCxk" + nfpabjjzn0a + bxleaky1a + "kriEtCxk" + GzVZOPz + igePtjb + jlqSXfm + tuBWHWM + KblUfYU + onIiwOJ + IvKQeSl + avjsFQw + jYXHZWD + iVFSYuI + ptGfesr + CYiuxIi + YlYwiin + xdYuApv + "");
    }

    //垃圾方法
    private void VMIErBMI(int sdzhasdzdh0, byte lxfgayd1, boolean phopdjwds2, float ldusyzqq3, long ieguqnbu4) {
        long ieguqnbu4a = ieguqnbu4;
        float ldusyzqq3a = ldusyzqq3;
        boolean phopdjwds2a = phopdjwds2;
        byte lxfgayd1a = lxfgayd1;
        int sdzhasdzdh0a = sdzhasdzdh0;
        Log.i("VMIErBMI", "VMIErBMI" + ieguqnbu4a + phopdjwds2a + sdzhasdzdh0a + lxfgayd1a + ldusyzqq3a + "VMIErBMI" + onIiwOJ + CYiuxIi + iVFSYuI + KblUfYU + IvKQeSl + GzVZOPz + jlqSXfm + avjsFQw + YlYwiin + jYXHZWD + igePtjb + tuBWHWM + xdYuApv + ptGfesr + "");
    }

    //垃圾方法
    private void GyizxyfC(char dhoutzlg0, byte bmldpkmw1, long oarrony2, short xxdaftb3, int gridlpkwdf4) {
        int gridlpkwdf4a = gridlpkwdf4;
        short xxdaftb3a = xxdaftb3;
        long oarrony2a = oarrony2;
        byte bmldpkmw1a = bmldpkmw1;
        char dhoutzlg0a = dhoutzlg0;
        new Intent("GyizxyfC" + dhoutzlg0a + bmldpkmw1a + gridlpkwdf4a + xxdaftb3a + oarrony2a + "GyizxyfC" + jYXHZWD + onIiwOJ + KblUfYU + CYiuxIi + tuBWHWM + YlYwiin + igePtjb + IvKQeSl + iVFSYuI + avjsFQw + jlqSXfm + ptGfesr + xdYuApv + GzVZOPz + "");
    }

    //垃圾方法
    private void kuEKVUAH(short uweyccaqu0, long oycshxq1, int hifetzr2, short dewifiem3) {
        short dewifiem3a = dewifiem3;
        int hifetzr2a = hifetzr2;
        long oycshxq1a = oycshxq1;
        short uweyccaqu0a = uweyccaqu0;
        Log.i("kuEKVUAH", "kuEKVUAH" + uweyccaqu0a + oycshxq1a + hifetzr2a + dewifiem3a + "kuEKVUAH" + CYiuxIi + jYXHZWD + onIiwOJ + igePtjb + ptGfesr + KblUfYU + avjsFQw + GzVZOPz + tuBWHWM + IvKQeSl + YlYwiin + iVFSYuI + jlqSXfm + xdYuApv + "");
    }

    //垃圾方法
    private void SmrZBTIa(long zffrwxvfp0, int pjanoygka1, double ugiagiazy2, boolean wvwehdxac3) {
        boolean wvwehdxac3a = wvwehdxac3;
        double ugiagiazy2a = ugiagiazy2;
        int pjanoygka1a = pjanoygka1;
        long zffrwxvfp0a = zffrwxvfp0;
        new Intent("SmrZBTIa" + zffrwxvfp0a + ugiagiazy2a + wvwehdxac3a + pjanoygka1a + "SmrZBTIa" + igePtjb + CYiuxIi + jlqSXfm + avjsFQw + jYXHZWD + onIiwOJ + ptGfesr + tuBWHWM + YlYwiin + KblUfYU + xdYuApv + IvKQeSl + GzVZOPz + iVFSYuI + "");
    }

    //垃圾方法
    private void wdQhXWWX(double vbrpdgrbd0, float juxgkcevw1, double qgjnpvrcd2, boolean fdyiykwgxe3, double pybiixv4) {
        double pybiixv4a = pybiixv4;
        boolean fdyiykwgxe3a = fdyiykwgxe3;
        double qgjnpvrcd2a = qgjnpvrcd2;
        float juxgkcevw1a = juxgkcevw1;
        double vbrpdgrbd0a = vbrpdgrbd0;
        new StringReader("wdQhXWWX" + qgjnpvrcd2a + pybiixv4a + juxgkcevw1a + fdyiykwgxe3a + vbrpdgrbd0a + "wdQhXWWX" + GzVZOPz + xdYuApv + IvKQeSl + jYXHZWD + onIiwOJ + avjsFQw + YlYwiin + igePtjb + CYiuxIi + tuBWHWM + ptGfesr + iVFSYuI + jlqSXfm + KblUfYU + "");
    }

    //垃圾方法
    private void zGYIAsmh(float fikmlhrz0, char nxqhdquoqg1, int xwjydftk2) {
        int xwjydftk2a = xwjydftk2;
        char nxqhdquoqg1a = nxqhdquoqg1;
        float fikmlhrz0a = fikmlhrz0;
        TextUtils.isDigitsOnly("zGYIAsmh" + xwjydftk2a + fikmlhrz0a + nxqhdquoqg1a + "zGYIAsmh" + onIiwOJ + CYiuxIi + jYXHZWD + avjsFQw + jlqSXfm + ptGfesr + igePtjb + iVFSYuI + IvKQeSl + xdYuApv + KblUfYU + tuBWHWM + GzVZOPz + YlYwiin + "");
    }

    //垃圾方法
    private void tfjBgfOO(short cllaoctrm0, byte xtndtmo1, double ufsdgzdxa2) {
        double ufsdgzdxa2a = ufsdgzdxa2;
        byte xtndtmo1a = xtndtmo1;
        short cllaoctrm0a = cllaoctrm0;
        new WeakReference("tfjBgfOO" + cllaoctrm0a + xtndtmo1a + ufsdgzdxa2a + "tfjBgfOO" + iVFSYuI + YlYwiin + KblUfYU + IvKQeSl + jlqSXfm + tuBWHWM + ptGfesr + avjsFQw + GzVZOPz + jYXHZWD + CYiuxIi + igePtjb + xdYuApv + onIiwOJ + "");
    }

    private void doBindMainService() {
        double ufsdgzdxa2 = 96.96;
        byte xtndtmo1 = 78;
        short cllaoctrm0 = 17;
        int xwjydftk2 = 81;
        char nxqhdquoqg1 = 39;
        float fikmlhrz0 = 98.98f;
        double pybiixv4 = 84.84;
        boolean fdyiykwgxe3 = false;
        double qgjnpvrcd2 = 76.76;
        float juxgkcevw1 = 83.83f;
        double vbrpdgrbd0 = 35.35;
        boolean wvwehdxac3 = true;
        double ugiagiazy2 = 48.48;
        int pjanoygka1 = 67;
        long zffrwxvfp0 = 21L;
        short dewifiem3 = 19;
        int hifetzr2 = 7;
        long oycshxq1 = 0L;
        short uweyccaqu0 = 31;
        int gridlpkwdf4 = 47;
        short xxdaftb3 = 21;
        long oarrony2 = 95L;
        byte bmldpkmw1 = 33;
        char dhoutzlg0 = 62;
        long ieguqnbu4 = 70L;
        float ldusyzqq3 = 95.95f;
        boolean phopdjwds2 = false;
        byte lxfgayd1 = 44;
        int sdzhasdzdh0 = 48;
        boolean bxleaky1 = true;
        int nfpabjjzn0 = 100;
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        kuEKVUAH(uweyccaqu0, oycshxq1, hifetzr2, dewifiem3);
        GyizxyfC(dhoutzlg0, bmldpkmw1, oarrony2, xxdaftb3, gridlpkwdf4);
        kuEKVUAH(uweyccaqu0, oycshxq1, hifetzr2, dewifiem3);
        zGYIAsmh(fikmlhrz0, nxqhdquoqg1, xwjydftk2);
        zGYIAsmh(fikmlhrz0, nxqhdquoqg1, xwjydftk2);
        kriEtCxk(nfpabjjzn0, bxleaky1);
        wdQhXWWX(vbrpdgrbd0, juxgkcevw1, qgjnpvrcd2, fdyiykwgxe3, pybiixv4);
        kriEtCxk(nfpabjjzn0, bxleaky1);
        wdQhXWWX(vbrpdgrbd0, juxgkcevw1, qgjnpvrcd2, fdyiykwgxe3, pybiixv4);
        try {
            kuEKVUAH(uweyccaqu0, oycshxq1, hifetzr2, dewifiem3);
            GyizxyfC(dhoutzlg0, bmldpkmw1, oarrony2, xxdaftb3, gridlpkwdf4);
            kriEtCxk(nfpabjjzn0, bxleaky1);
            tfjBgfOO(cllaoctrm0, xtndtmo1, ufsdgzdxa2);
            wdQhXWWX(vbrpdgrbd0, juxgkcevw1, qgjnpvrcd2, fdyiykwgxe3, pybiixv4);
            zGYIAsmh(fikmlhrz0, nxqhdquoqg1, xwjydftk2);
            wdQhXWWX(vbrpdgrbd0, juxgkcevw1, qgjnpvrcd2, fdyiykwgxe3, pybiixv4);
            kuEKVUAH(uweyccaqu0, oycshxq1, hifetzr2, dewifiem3);
            tfjBgfOO(cllaoctrm0, xtndtmo1, ufsdgzdxa2);
            this.bindService(new Intent(this, SimplyLoudspeakergp1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    private void nJrMZyza(double rrseiham0, byte dbynrow1, char zraraaqbbd2, char rsmggppaz3, char azievfspzw4) {
        char azievfspzw4a = azievfspzw4;
        char rsmggppaz3a = rsmggppaz3;
        char zraraaqbbd2a = zraraaqbbd2;
        byte dbynrow1a = dbynrow1;
        double rrseiham0a = rrseiham0;
        new Intent("nJrMZyza" + zraraaqbbd2a + rsmggppaz3a + dbynrow1a + rrseiham0a + azievfspzw4a + "nJrMZyza" + jlqSXfm + onIiwOJ + CYiuxIi + GzVZOPz + iVFSYuI + xdYuApv + KblUfYU + ptGfesr + IvKQeSl + YlYwiin + avjsFQw + jYXHZWD + igePtjb + tuBWHWM + "");
    }

    //垃圾方法
    private void StEojyjF(boolean fnsyeiehl0, byte ekyjexu1) {
        byte ekyjexu1a = ekyjexu1;
        boolean fnsyeiehl0a = fnsyeiehl0;
        new WeakReference("StEojyjF" + ekyjexu1a + fnsyeiehl0a + "StEojyjF" + onIiwOJ + tuBWHWM + iVFSYuI + avjsFQw + ptGfesr + igePtjb + jlqSXfm + IvKQeSl + jYXHZWD + xdYuApv + KblUfYU + GzVZOPz + CYiuxIi + YlYwiin + "");
    }

    //垃圾方法
    private void dYfqZdFU(byte vnbuaryb0, byte uolbxlal1, char wuyssdlgbe2, short zjrvwdk3, float ugopbkm4) {
        float ugopbkm4a = ugopbkm4;
        short zjrvwdk3a = zjrvwdk3;
        char wuyssdlgbe2a = wuyssdlgbe2;
        byte uolbxlal1a = uolbxlal1;
        byte vnbuaryb0a = vnbuaryb0;
        new Intent("dYfqZdFU" + uolbxlal1a + ugopbkm4a + wuyssdlgbe2a + zjrvwdk3a + vnbuaryb0a + "dYfqZdFU" + onIiwOJ + iVFSYuI + avjsFQw + CYiuxIi + igePtjb + ptGfesr + tuBWHWM + GzVZOPz + jYXHZWD + KblUfYU + xdYuApv + YlYwiin + IvKQeSl + jlqSXfm + "");
    }

    //垃圾方法
    private void uaWGceGJ(char hhwlxdcvml0) {
        char hhwlxdcvml0a = hhwlxdcvml0;
        new Intent("uaWGceGJ" + hhwlxdcvml0a + "uaWGceGJ" + KblUfYU + xdYuApv + jlqSXfm + onIiwOJ + iVFSYuI + IvKQeSl + avjsFQw + jYXHZWD + CYiuxIi + YlYwiin + GzVZOPz + tuBWHWM + igePtjb + ptGfesr + "");
    }

    //垃圾方法
    private void jghTjNXS(boolean ioadplt0) {
        boolean ioadplt0a = ioadplt0;
    }

    //垃圾方法
    private void sZiYNfiB(long erzkcqshpm0, double zfnrffmetm1, float byjzrkx2, byte rtltkdutv3) {
        byte rtltkdutv3a = rtltkdutv3;
        float byjzrkx2a = byjzrkx2;
        double zfnrffmetm1a = zfnrffmetm1;
        long erzkcqshpm0a = erzkcqshpm0;
        Log.e("sZiYNfiB", "sZiYNfiB" + erzkcqshpm0a + zfnrffmetm1a + byjzrkx2a + rtltkdutv3a + "sZiYNfiB" + xdYuApv + igePtjb + tuBWHWM + IvKQeSl + GzVZOPz + iVFSYuI + ptGfesr + jlqSXfm + avjsFQw + jYXHZWD + KblUfYU + YlYwiin + onIiwOJ + CYiuxIi + "");
    }

    //垃圾方法
    private void OaCwEtbN(byte mwfrcprnf0, boolean ukkyytao1, int okjqbttfo2, char imlmpcb3) {
        char imlmpcb3a = imlmpcb3;
        int okjqbttfo2a = okjqbttfo2;
        boolean ukkyytao1a = ukkyytao1;
        byte mwfrcprnf0a = mwfrcprnf0;
        Log.w("OaCwEtbN", "OaCwEtbN" + okjqbttfo2a + ukkyytao1a + mwfrcprnf0a + imlmpcb3a + "OaCwEtbN" + jlqSXfm + iVFSYuI + tuBWHWM + jYXHZWD + ptGfesr + igePtjb + xdYuApv + onIiwOJ + YlYwiin + GzVZOPz + IvKQeSl + avjsFQw + KblUfYU + CYiuxIi + "");
    }

    //垃圾方法
    private void fbjikEbM(int tikznsiske0) {
        int tikznsiske0a = tikznsiske0;
        TextUtils.isDigitsOnly("fbjikEbM" + tikznsiske0a + "fbjikEbM" + IvKQeSl + CYiuxIi + YlYwiin + avjsFQw + onIiwOJ + KblUfYU + ptGfesr + xdYuApv + iVFSYuI + igePtjb + jYXHZWD + tuBWHWM + GzVZOPz + jlqSXfm + "");
    }

    //垃圾方法
    private void KMADqteI(double msxpoupybm0, byte aihmwcdlso1, byte xelwdtoenl2, double yvhddrqr3) {
        double yvhddrqr3a = yvhddrqr3;
        byte xelwdtoenl2a = xelwdtoenl2;
        byte aihmwcdlso1a = aihmwcdlso1;
        double msxpoupybm0a = msxpoupybm0;
        Log.e("KMADqteI", "KMADqteI" + xelwdtoenl2a + aihmwcdlso1a + msxpoupybm0a + yvhddrqr3a + "KMADqteI" + KblUfYU + xdYuApv + YlYwiin + avjsFQw + onIiwOJ + igePtjb + jlqSXfm + CYiuxIi + ptGfesr + tuBWHWM + IvKQeSl + iVFSYuI + jYXHZWD + GzVZOPz + "");
    }

    //垃圾方法
    private void PBggmWTG(byte smoxnptc0, float nprdklsg1, float nzqumbn2) {
        float nzqumbn2a = nzqumbn2;
        float nprdklsg1a = nprdklsg1;
        byte smoxnptc0a = smoxnptc0;
        new AttributedString("PBggmWTG" + smoxnptc0a + nzqumbn2a + nprdklsg1a + "PBggmWTG" + jlqSXfm + YlYwiin + igePtjb + onIiwOJ + GzVZOPz + avjsFQw + xdYuApv + tuBWHWM + KblUfYU + jYXHZWD + IvKQeSl + CYiuxIi + ptGfesr + iVFSYuI + "");
    }

    //垃圾方法
    private void jnHjBjnR(char odtqhtqlk0, boolean xlswltg1, char vuseejnarl2) {
        char vuseejnarl2a = vuseejnarl2;
        boolean xlswltg1a = xlswltg1;
        char odtqhtqlk0a = odtqhtqlk0;
    }

    //垃圾方法
    private void nDABHwNO(byte mqmeqyfjsx0, float ipknkvzecg1) {
        float ipknkvzecg1a = ipknkvzecg1;
        byte mqmeqyfjsx0a = mqmeqyfjsx0;
        new WeakReference("nDABHwNO" + ipknkvzecg1a + mqmeqyfjsx0a + "nDABHwNO" + KblUfYU + jYXHZWD + onIiwOJ + jlqSXfm + GzVZOPz + tuBWHWM + igePtjb + xdYuApv + CYiuxIi + avjsFQw + IvKQeSl + iVFSYuI + YlYwiin + ptGfesr + "");
    }

    //垃圾方法
    private void TMZnNSzS(byte fgdrrbc0, int jcmsusrpn1, int ptevdvfb2, double yrqpzrc3, float pwugdgrly4) {
        float pwugdgrly4a = pwugdgrly4;
        double yrqpzrc3a = yrqpzrc3;
        int ptevdvfb2a = ptevdvfb2;
        int jcmsusrpn1a = jcmsusrpn1;
        byte fgdrrbc0a = fgdrrbc0;
        new Thread("TMZnNSzS" + pwugdgrly4a + ptevdvfb2a + yrqpzrc3a + fgdrrbc0a + jcmsusrpn1a + "TMZnNSzS" + xdYuApv + onIiwOJ + igePtjb + jYXHZWD + tuBWHWM + avjsFQw + CYiuxIi + ptGfesr + IvKQeSl + GzVZOPz + YlYwiin + iVFSYuI + jlqSXfm + KblUfYU + "");
    }

    //垃圾方法
    private void BsIWSNXy(char uekmajaqv0, float egypgvtj1, long lqgfbgo2, float jpqijoidx3, int nwhxbnzzbn4) {
        int nwhxbnzzbn4a = nwhxbnzzbn4;
        float jpqijoidx3a = jpqijoidx3;
        long lqgfbgo2a = lqgfbgo2;
        float egypgvtj1a = egypgvtj1;
        char uekmajaqv0a = uekmajaqv0;
        new StringBuilder("BsIWSNXy" + nwhxbnzzbn4a + uekmajaqv0a + egypgvtj1a + lqgfbgo2a + jpqijoidx3a + "BsIWSNXy" + YlYwiin + tuBWHWM + KblUfYU + iVFSYuI + IvKQeSl + GzVZOPz + igePtjb + CYiuxIi + ptGfesr + jYXHZWD + avjsFQw + onIiwOJ + jlqSXfm + xdYuApv + "");
    }

    //垃圾方法
    private void GLhNatoc(byte fxeaokfxuv0, short brcmnywrz1) {
        short brcmnywrz1a = brcmnywrz1;
        byte fxeaokfxuv0a = fxeaokfxuv0;
        new Intent("GLhNatoc" + brcmnywrz1a + fxeaokfxuv0a + "GLhNatoc" + onIiwOJ + CYiuxIi + xdYuApv + igePtjb + YlYwiin + avjsFQw + tuBWHWM + iVFSYuI + ptGfesr + GzVZOPz + jYXHZWD + IvKQeSl + KblUfYU + jlqSXfm + "");
    }

    //垃圾方法
    private void XWCQNbRS(boolean vkjsketwi0) {
        boolean vkjsketwi0a = vkjsketwi0;
        new AttributedString("XWCQNbRS" + vkjsketwi0a + "XWCQNbRS" + igePtjb + YlYwiin + IvKQeSl + KblUfYU + iVFSYuI + jlqSXfm + ptGfesr + xdYuApv + GzVZOPz + onIiwOJ + CYiuxIi + jYXHZWD + avjsFQw + tuBWHWM + "");
    }

    //垃圾方法
    private void RJzIMFvl(double wbipuflatu0) {
        double wbipuflatu0a = wbipuflatu0;
        TextUtils.isEmpty("RJzIMFvl" + wbipuflatu0a + "RJzIMFvl" + KblUfYU + GzVZOPz + igePtjb + xdYuApv + avjsFQw + tuBWHWM + iVFSYuI + YlYwiin + ptGfesr + jYXHZWD + CYiuxIi + jlqSXfm + onIiwOJ + IvKQeSl + "");
    }

    //垃圾方法
    private void pANbehwD(short hgevkqwvd0, long xgfqqbqc1, boolean stsfhapeh2, char hpfooqrooh3) {
        char hpfooqrooh3a = hpfooqrooh3;
        boolean stsfhapeh2a = stsfhapeh2;
        long xgfqqbqc1a = xgfqqbqc1;
        short hgevkqwvd0a = hgevkqwvd0;
        new StringReader("pANbehwD" + hpfooqrooh3a + stsfhapeh2a + hgevkqwvd0a + xgfqqbqc1a + "pANbehwD" + tuBWHWM + YlYwiin + avjsFQw + CYiuxIi + igePtjb + iVFSYuI + jYXHZWD + ptGfesr + KblUfYU + IvKQeSl + GzVZOPz + xdYuApv + jlqSXfm + onIiwOJ + "");
    }

    //垃圾方法
    private void DzRoFkqc(boolean vuhdmcgmy0, short chedvmj1) {
        short chedvmj1a = chedvmj1;
        boolean vuhdmcgmy0a = vuhdmcgmy0;
        Log.i("DzRoFkqc", "DzRoFkqc" + vuhdmcgmy0a + chedvmj1a + "DzRoFkqc" + onIiwOJ + YlYwiin + xdYuApv + jYXHZWD + ptGfesr + jlqSXfm + iVFSYuI + GzVZOPz + tuBWHWM + CYiuxIi + igePtjb + avjsFQw + IvKQeSl + KblUfYU + "");
    }

    //垃圾方法
    private void APLScMAd(double kspbxvov0, short illyzkk1, int lrpmhebox2, boolean cllyybqcmz3) {
        boolean cllyybqcmz3a = cllyybqcmz3;
        int lrpmhebox2a = lrpmhebox2;
        short illyzkk1a = illyzkk1;
        double kspbxvov0a = kspbxvov0;
        Log.w("APLScMAd", "APLScMAd" + illyzkk1a + kspbxvov0a + lrpmhebox2a + cllyybqcmz3a + "APLScMAd" + IvKQeSl + KblUfYU + igePtjb + iVFSYuI + CYiuxIi + ptGfesr + xdYuApv + onIiwOJ + jYXHZWD + YlYwiin + jlqSXfm + GzVZOPz + avjsFQw + tuBWHWM + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        boolean cllyybqcmz3 = false;
        int lrpmhebox2 = 26;
        short illyzkk1 = 85;
        double kspbxvov0 = 83.83;
        short chedvmj1 = 4;
        boolean vuhdmcgmy0 = false;
        char hpfooqrooh3 = 72;
        boolean stsfhapeh2 = false;
        long xgfqqbqc1 = 91L;
        short hgevkqwvd0 = 51;
        double wbipuflatu0 = 87.87;
        boolean vkjsketwi0 = true;
        short brcmnywrz1 = 92;
        byte fxeaokfxuv0 = 1;
        int nwhxbnzzbn4 = 23;
        float jpqijoidx3 = 83.83f;
        long lqgfbgo2 = 22L;
        float egypgvtj1 = 80.80f;
        char uekmajaqv0 = 0;
        float pwugdgrly4 = 40.40f;
        double yrqpzrc3 = 89.89;
        int ptevdvfb2 = 10;
        int jcmsusrpn1 = 34;
        byte fgdrrbc0 = 46;
        float ipknkvzecg1 = 99.99f;
        byte mqmeqyfjsx0 = 8;
        char vuseejnarl2 = 63;
        boolean xlswltg1 = true;
        char odtqhtqlk0 = 68;
        float nzqumbn2 = 20.20f;
        float nprdklsg1 = 82.82f;
        byte smoxnptc0 = 23;
        double yvhddrqr3 = 19.19;
        byte xelwdtoenl2 = 88;
        byte aihmwcdlso1 = 76;
        double msxpoupybm0 = 11.11;
        int tikznsiske0 = 14;
        char imlmpcb3 = 82;
        int okjqbttfo2 = 70;
        boolean ukkyytao1 = false;
        byte mwfrcprnf0 = 99;
        byte rtltkdutv3 = 69;
        float byjzrkx2 = 23.23f;
        double zfnrffmetm1 = 8.8;
        long erzkcqshpm0 = 54L;
        boolean ioadplt0 = false;
        char hhwlxdcvml0 = 65;
        float ugopbkm4 = 44.44f;
        short zjrvwdk3 = 41;
        char wuyssdlgbe2 = 93;
        byte uolbxlal1 = 42;
        byte vnbuaryb0 = 22;
        byte ekyjexu1 = 26;
        boolean fnsyeiehl0 = true;
        char azievfspzw4 = 65;
        char rsmggppaz3 = 51;
        char zraraaqbbd2 = 28;
        byte dbynrow1 = 74;
        double rrseiham0 = 67.67;
        mainBinder = null;
        dYfqZdFU(vnbuaryb0, uolbxlal1, wuyssdlgbe2, zjrvwdk3, ugopbkm4);
        nDABHwNO(mqmeqyfjsx0, ipknkvzecg1);
        GLhNatoc(fxeaokfxuv0, brcmnywrz1);
        RJzIMFvl(wbipuflatu0);
        nJrMZyza(rrseiham0, dbynrow1, zraraaqbbd2, rsmggppaz3, azievfspzw4);
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        isReTryBinding = true;
        this.startMainService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void lsviMSqf(float pfzuaome0, byte pmfuslxc1, long klpyxhf2) {
        long klpyxhf2a = klpyxhf2;
        byte pmfuslxc1a = pmfuslxc1;
        float pfzuaome0a = pfzuaome0;
        new AttributedString("lsviMSqf" + pfzuaome0a + klpyxhf2a + pmfuslxc1a + "lsviMSqf" + iVFSYuI + CYiuxIi + GzVZOPz + avjsFQw + ptGfesr + igePtjb + jYXHZWD + xdYuApv + tuBWHWM + IvKQeSl + jlqSXfm + onIiwOJ + YlYwiin + KblUfYU + "");
    }

    //垃圾方法
    private void VWgmcwPR(long hjysbaam0, char euxmxmplxb1) {
        char euxmxmplxb1a = euxmxmplxb1;
        long hjysbaam0a = hjysbaam0;
        new File("VWgmcwPR" + euxmxmplxb1a + hjysbaam0a + "VWgmcwPR" + CYiuxIi + jYXHZWD + tuBWHWM + igePtjb + avjsFQw + IvKQeSl + YlYwiin + xdYuApv + KblUfYU + GzVZOPz + jlqSXfm + iVFSYuI + onIiwOJ + ptGfesr + "");
    }

    //垃圾方法
    private void WQWTJIzC(float rpynajw0, float jmhwsojyw1, short ikxismw2) {
        short ikxismw2a = ikxismw2;
        float jmhwsojyw1a = jmhwsojyw1;
        float rpynajw0a = rpynajw0;
        new Intent("WQWTJIzC" + ikxismw2a + jmhwsojyw1a + rpynajw0a + "WQWTJIzC" + CYiuxIi + iVFSYuI + xdYuApv + onIiwOJ + GzVZOPz + YlYwiin + KblUfYU + jYXHZWD + tuBWHWM + igePtjb + avjsFQw + ptGfesr + jlqSXfm + IvKQeSl + "");
    }

    //垃圾方法
    private void ThqcULTz(char smxuscwm0, int cfsgulgfv1, float xftcmpqnh2, char jwalielxrf3) {
        char jwalielxrf3a = jwalielxrf3;
        float xftcmpqnh2a = xftcmpqnh2;
        int cfsgulgfv1a = cfsgulgfv1;
        char smxuscwm0a = smxuscwm0;
        new WeakReference("ThqcULTz" + smxuscwm0a + xftcmpqnh2a + jwalielxrf3a + cfsgulgfv1a + "ThqcULTz" + ptGfesr + jlqSXfm + iVFSYuI + igePtjb + xdYuApv + IvKQeSl + jYXHZWD + YlYwiin + tuBWHWM + KblUfYU + CYiuxIi + onIiwOJ + avjsFQw + GzVZOPz + "");
    }

    //垃圾方法
    private void AFAtvmil(short qzuplrs0, short oejeuexp1, int esiqharorp2) {
        int esiqharorp2a = esiqharorp2;
        short oejeuexp1a = oejeuexp1;
        short qzuplrs0a = qzuplrs0;
        System.out.println("AFAtvmil" + oejeuexp1a + esiqharorp2a + qzuplrs0a + "AFAtvmil" + avjsFQw + iVFSYuI + ptGfesr + tuBWHWM + igePtjb + onIiwOJ + jYXHZWD + YlYwiin + CYiuxIi + xdYuApv + IvKQeSl + jlqSXfm + KblUfYU + GzVZOPz + "");
    }

    //垃圾方法
    private void ztbHrjNp(long rismseafw0) {
        long rismseafw0a = rismseafw0;
        new File("ztbHrjNp" + rismseafw0a + "ztbHrjNp" + ptGfesr + CYiuxIi + jYXHZWD + KblUfYU + IvKQeSl + tuBWHWM + jlqSXfm + iVFSYuI + GzVZOPz + onIiwOJ + igePtjb + xdYuApv + avjsFQw + YlYwiin + "");
    }

    //垃圾方法
    private void jlTbOAnb(float tbnrrvwq0) {
        float tbnrrvwq0a = tbnrrvwq0;
        Log.i("jlTbOAnb", "jlTbOAnb" + tbnrrvwq0a + "jlTbOAnb" + YlYwiin + jYXHZWD + IvKQeSl + iVFSYuI + tuBWHWM + igePtjb + ptGfesr + jlqSXfm + avjsFQw + KblUfYU + CYiuxIi + onIiwOJ + GzVZOPz + xdYuApv + "");
    }

    //垃圾方法
    private void HnGKLWCo(boolean rnjrgbxmsg0) {
        boolean rnjrgbxmsg0a = rnjrgbxmsg0;
        TextUtils.isEmpty("HnGKLWCo" + rnjrgbxmsg0a + "HnGKLWCo" + onIiwOJ + jYXHZWD + ptGfesr + tuBWHWM + xdYuApv + GzVZOPz + CYiuxIi + KblUfYU + jlqSXfm + IvKQeSl + YlYwiin + iVFSYuI + igePtjb + avjsFQw + "");
    }

    //垃圾方法
    private void LzzxgMoe(double nhyfkkanjy0, byte jxtehmm1, boolean yzhngmy2) {
        boolean yzhngmy2a = yzhngmy2;
        byte jxtehmm1a = jxtehmm1;
        double nhyfkkanjy0a = nhyfkkanjy0;
        System.out.println("LzzxgMoe" + yzhngmy2a + nhyfkkanjy0a + jxtehmm1a + "LzzxgMoe" + ptGfesr + avjsFQw + KblUfYU + GzVZOPz + xdYuApv + tuBWHWM + iVFSYuI + CYiuxIi + igePtjb + jYXHZWD + YlYwiin + IvKQeSl + onIiwOJ + jlqSXfm + "");
    }

    //垃圾方法
    private void NkZjDiWm(float pmovdzrvjj0, float bazasfts1, byte jesdikmbtc2) {
        byte jesdikmbtc2a = jesdikmbtc2;
        float bazasfts1a = bazasfts1;
        float pmovdzrvjj0a = pmovdzrvjj0;
        new File("NkZjDiWm" + bazasfts1a + jesdikmbtc2a + pmovdzrvjj0a + "NkZjDiWm" + KblUfYU + ptGfesr + CYiuxIi + jYXHZWD + GzVZOPz + YlYwiin + tuBWHWM + igePtjb + onIiwOJ + avjsFQw + iVFSYuI + IvKQeSl + xdYuApv + jlqSXfm + "");
    }

    //垃圾方法
    private void GrIysKIj(float vfscygbzhi0, int gjaoicmzm1, float wntidteeh2, short dbvnnoavne3, boolean zsmhfkb4) {
        boolean zsmhfkb4a = zsmhfkb4;
        short dbvnnoavne3a = dbvnnoavne3;
        float wntidteeh2a = wntidteeh2;
        int gjaoicmzm1a = gjaoicmzm1;
        float vfscygbzhi0a = vfscygbzhi0;
        new Thread("GrIysKIj" + dbvnnoavne3a + vfscygbzhi0a + wntidteeh2a + gjaoicmzm1a + zsmhfkb4a + "GrIysKIj" + avjsFQw + YlYwiin + KblUfYU + IvKQeSl + tuBWHWM + iVFSYuI + xdYuApv + igePtjb + jYXHZWD + ptGfesr + jlqSXfm + CYiuxIi + onIiwOJ + GzVZOPz + "");
    }

    //垃圾方法
    private void lEmlbyjp(short smhodczv0, int klphaqdg1) {
        int klphaqdg1a = klphaqdg1;
        short smhodczv0a = smhodczv0;
        Log.w("lEmlbyjp", "lEmlbyjp" + klphaqdg1a + smhodczv0a + "lEmlbyjp" + YlYwiin + igePtjb + IvKQeSl + CYiuxIi + tuBWHWM + jlqSXfm + xdYuApv + onIiwOJ + ptGfesr + KblUfYU + avjsFQw + GzVZOPz + iVFSYuI + jYXHZWD + "");
    }

    public void onDestroy() {
        int klphaqdg1 = 62;
        short smhodczv0 = 13;
        boolean zsmhfkb4 = false;
        short dbvnnoavne3 = 82;
        float wntidteeh2 = 6.6f;
        int gjaoicmzm1 = 36;
        float vfscygbzhi0 = 65.65f;
        byte jesdikmbtc2 = 16;
        float bazasfts1 = 22.22f;
        float pmovdzrvjj0 = 29.29f;
        boolean yzhngmy2 = true;
        byte jxtehmm1 = 66;
        double nhyfkkanjy0 = 74.74;
        boolean rnjrgbxmsg0 = false;
        float tbnrrvwq0 = 64.64f;
        long rismseafw0 = 36L;
        int esiqharorp2 = 91;
        short oejeuexp1 = 72;
        short qzuplrs0 = 10;
        char jwalielxrf3 = 70;
        float xftcmpqnh2 = 75.75f;
        int cfsgulgfv1 = 57;
        char smxuscwm0 = 70;
        short ikxismw2 = 21;
        float jmhwsojyw1 = 63.63f;
        float rpynajw0 = 1.1f;
        char euxmxmplxb1 = 10;
        long hjysbaam0 = 55L;
        long klpyxhf2 = 28L;
        byte pmfuslxc1 = 84;
        float pfzuaome0 = 59.59f;
        if (SimplyHouseworkrOrgManager.isDebug) {
            WQWTJIzC(rpynajw0, jmhwsojyw1, ikxismw2);
            jlTbOAnb(tbnrrvwq0);
            AFAtvmil(qzuplrs0, oejeuexp1, esiqharorp2);
            ztbHrjNp(rismseafw0);
            lEmlbyjp(smhodczv0, klphaqdg1);
            VWgmcwPR(hjysbaam0, euxmxmplxb1);
            HnGKLWCo(rnjrgbxmsg0);
            AFAtvmil(qzuplrs0, oejeuexp1, esiqharorp2);
            HnGKLWCo(rnjrgbxmsg0);
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        super.onDestroy();
        jlTbOAnb(tbnrrvwq0);
        lsviMSqf(pfzuaome0, pmfuslxc1, klpyxhf2);
        VWgmcwPR(hjysbaam0, euxmxmplxb1);
        lsviMSqf(pfzuaome0, pmfuslxc1, klpyxhf2);
        VWgmcwPR(hjysbaam0, euxmxmplxb1);
        LzzxgMoe(nhyfkkanjy0, jxtehmm1, yzhngmy2);
        HnGKLWCo(rnjrgbxmsg0);
        HnGKLWCo(rnjrgbxmsg0);
        ztbHrjNp(rismseafw0);
        ztbHrjNp(rismseafw0);
        isLiving = false;
    }

    //垃圾方法
    private void HQvWCZYR(float mfsucmzhlh0, int utcaabhz1, int xwysnbrv2) {
        int xwysnbrv2a = xwysnbrv2;
        int utcaabhz1a = utcaabhz1;
        float mfsucmzhlh0a = mfsucmzhlh0;
        Log.e("HQvWCZYR", "HQvWCZYR" + mfsucmzhlh0a + xwysnbrv2a + utcaabhz1a + "HQvWCZYR" + onIiwOJ + GzVZOPz + jlqSXfm + xdYuApv + KblUfYU + tuBWHWM + iVFSYuI + ptGfesr + jYXHZWD + CYiuxIi + igePtjb + YlYwiin + avjsFQw + IvKQeSl + "");
    }

    //垃圾方法
    private void WbfVNLvj(long fdoionub0, float fxsmmkkumi1, boolean hyzhxvfr2) {
        boolean hyzhxvfr2a = hyzhxvfr2;
        float fxsmmkkumi1a = fxsmmkkumi1;
        long fdoionub0a = fdoionub0;
        new Thread("WbfVNLvj" + fxsmmkkumi1a + fdoionub0a + hyzhxvfr2a + "WbfVNLvj" + iVFSYuI + igePtjb + ptGfesr + CYiuxIi + avjsFQw + KblUfYU + jYXHZWD + tuBWHWM + jlqSXfm + onIiwOJ + GzVZOPz + YlYwiin + IvKQeSl + xdYuApv + "");
    }

    //垃圾方法
    private void IytLbXUz(int qwclqpj0, boolean okojfistv1) {
        boolean okojfistv1a = okojfistv1;
        int qwclqpj0a = qwclqpj0;
        new File("IytLbXUz" + okojfistv1a + qwclqpj0a + "IytLbXUz" + YlYwiin + KblUfYU + tuBWHWM + jlqSXfm + xdYuApv + onIiwOJ + avjsFQw + ptGfesr + IvKQeSl + igePtjb + jYXHZWD + iVFSYuI + GzVZOPz + CYiuxIi + "");
    }

    //垃圾方法
    private void OImWRlVv(long jdoyaggj0, int eabkpppxl1, byte zxbsscwpkr2, int dxuhoabjg3) {
        int dxuhoabjg3a = dxuhoabjg3;
        byte zxbsscwpkr2a = zxbsscwpkr2;
        int eabkpppxl1a = eabkpppxl1;
        long jdoyaggj0a = jdoyaggj0;
        new Intent("OImWRlVv" + dxuhoabjg3a + zxbsscwpkr2a + eabkpppxl1a + jdoyaggj0a + "OImWRlVv" + jlqSXfm + onIiwOJ + GzVZOPz + ptGfesr + xdYuApv + IvKQeSl + iVFSYuI + igePtjb + YlYwiin + tuBWHWM + KblUfYU + avjsFQw + CYiuxIi + jYXHZWD + "");
    }

    private boolean isMainBinderAlive() {
        int dxuhoabjg3 = 88;
        byte zxbsscwpkr2 = 46;
        int eabkpppxl1 = 82;
        long jdoyaggj0 = 100L;
        boolean okojfistv1 = true;
        int qwclqpj0 = 47;
        boolean hyzhxvfr2 = true;
        float fxsmmkkumi1 = 39.39f;
        long fdoionub0 = 36L;
        int xwysnbrv2 = 48;
        int utcaabhz1 = 52;
        float mfsucmzhlh0 = 53.53f;
        IytLbXUz(qwclqpj0, okojfistv1);
        OImWRlVv(jdoyaggj0, eabkpppxl1, zxbsscwpkr2, dxuhoabjg3);
        WbfVNLvj(fdoionub0, fxsmmkkumi1, hyzhxvfr2);
        HQvWCZYR(mfsucmzhlh0, utcaabhz1, xwysnbrv2);
        OImWRlVv(jdoyaggj0, eabkpppxl1, zxbsscwpkr2, dxuhoabjg3);
        WbfVNLvj(fdoionub0, fxsmmkkumi1, hyzhxvfr2);
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceSimply.Stub {

        ServiceBinder(SimplyHouseworkrm2Service this$0) {
        }

        //垃圾方法
        private void FOkrYfmP(int gjvalztaqq0, int abrsxcmq1, byte ensoefct2, int ubcmpkwz3, short mvdrpthvha4) {
            short mvdrpthvha4a = mvdrpthvha4;
            int ubcmpkwz3a = ubcmpkwz3;
            byte ensoefct2a = ensoefct2;
            int abrsxcmq1a = abrsxcmq1;
            int gjvalztaqq0a = gjvalztaqq0;
            Log.e("FOkrYfmP", "FOkrYfmP" + ensoefct2a + mvdrpthvha4a + ubcmpkwz3a + gjvalztaqq0a + abrsxcmq1a + "FOkrYfmP" + "" + "");
        }

        //垃圾方法
        private void WVVjOTvw(int kofgxbidhv0, char qkolcltmgw1, char pdygmygqyb2) {
            char pdygmygqyb2a = pdygmygqyb2;
            char qkolcltmgw1a = qkolcltmgw1;
            int kofgxbidhv0a = kofgxbidhv0;
            new StringReader("WVVjOTvw" + kofgxbidhv0a + pdygmygqyb2a + qkolcltmgw1a + "WVVjOTvw" + "" + "");
        }

        //垃圾方法
        private void LxuDWUZc(char ydsngdo0) {
            char ydsngdo0a = ydsngdo0;
            System.out.println("LxuDWUZc" + ydsngdo0a + "LxuDWUZc" + "" + "");
        }

        //垃圾方法
        private void rUlvEqGQ(long pyglbpr0, int xezhnhur1, short olqowhrety2) {
            short olqowhrety2a = olqowhrety2;
            int xezhnhur1a = xezhnhur1;
            long pyglbpr0a = pyglbpr0;
            new StringBuffer("rUlvEqGQ" + xezhnhur1a + olqowhrety2a + pyglbpr0a + "rUlvEqGQ" + "" + "");
        }

        public String getServiceSimply() throws RemoteException {
            short olqowhrety2 = 0;
            int xezhnhur1 = 63;
            long pyglbpr0 = 66L;
            char ydsngdo0 = 66;
            char pdygmygqyb2 = 44;
            char qkolcltmgw1 = 99;
            int kofgxbidhv0 = 11;
            short mvdrpthvha4 = 34;
            int ubcmpkwz3 = 66;
            byte ensoefct2 = 87;
            int abrsxcmq1 = 22;
            int gjvalztaqq0 = 58;
            WVVjOTvw(kofgxbidhv0, qkolcltmgw1, pdygmygqyb2);
            FOkrYfmP(gjvalztaqq0, abrsxcmq1, ensoefct2, ubcmpkwz3, mvdrpthvha4);
            rUlvEqGQ(pyglbpr0, xezhnhur1, olqowhrety2);
            LxuDWUZc(ydsngdo0);
            return "RemoteService";
        }

        //垃圾方法
        private void BfnrLffp(int zbktquqfre0, double sjannll1, char ogwilcxnck2) {
            char ogwilcxnck2a = ogwilcxnck2;
            double sjannll1a = sjannll1;
            int zbktquqfre0a = zbktquqfre0;
            new File("BfnrLffp" + ogwilcxnck2a + sjannll1a + zbktquqfre0a + "BfnrLffp" + "" + "");
        }

        //垃圾方法
        private void rqRmVSIB(float gmyzglz0, float jchoioj1, short ruorufctpe2, char dkupeiydw3) {
            char dkupeiydw3a = dkupeiydw3;
            short ruorufctpe2a = ruorufctpe2;
            float jchoioj1a = jchoioj1;
            float gmyzglz0a = gmyzglz0;
            new AttributedString("rqRmVSIB" + jchoioj1a + gmyzglz0a + ruorufctpe2a + dkupeiydw3a + "rqRmVSIB" + "" + "");
        }

        //垃圾方法
        private void mnWcvpZA(boolean bdzllgvjc0) {
            boolean bdzllgvjc0a = bdzllgvjc0;
            new File("mnWcvpZA" + bdzllgvjc0a + "mnWcvpZA" + "" + "");
        }

        //垃圾方法
        private void ugHfbNTq(boolean cikpqopkxi0, byte rbwxjpmr1, byte qikioyn2, long jttgmhdpz3, short jtiebqli4) {
            short jtiebqli4a = jtiebqli4;
            long jttgmhdpz3a = jttgmhdpz3;
            byte qikioyn2a = qikioyn2;
            byte rbwxjpmr1a = rbwxjpmr1;
            boolean cikpqopkxi0a = cikpqopkxi0;
            new StringBuffer("ugHfbNTq" + rbwxjpmr1a + jttgmhdpz3a + jtiebqli4a + qikioyn2a + cikpqopkxi0a + "ugHfbNTq" + "" + "");
        }

        public boolean isStartedSimply() throws RemoteException {
            short jtiebqli4 = 68;
            long jttgmhdpz3 = 63L;
            byte qikioyn2 = 88;
            byte rbwxjpmr1 = 78;
            boolean cikpqopkxi0 = true;
            boolean bdzllgvjc0 = false;
            char dkupeiydw3 = 61;
            short ruorufctpe2 = 33;
            float jchoioj1 = 81.81f;
            float gmyzglz0 = 87.87f;
            char ogwilcxnck2 = 0;
            double sjannll1 = 14.14;
            int zbktquqfre0 = 57;
            rqRmVSIB(gmyzglz0, jchoioj1, ruorufctpe2, dkupeiydw3);
            rqRmVSIB(gmyzglz0, jchoioj1, ruorufctpe2, dkupeiydw3);
            rqRmVSIB(gmyzglz0, jchoioj1, ruorufctpe2, dkupeiydw3);
            mnWcvpZA(bdzllgvjc0);
            return false;
        }
    }

    class RemoteServiceConnection implements ServiceConnection {

        RemoteServiceConnection(SimplyHouseworkrm2Service this$0) {
        }

        //垃圾方法
        private void meZsqcxn(boolean mjqoriv0, float neuvhfn1, short xttsdrf2, char czebhokwjn3, long mmofevgni4) {
            long mmofevgni4a = mmofevgni4;
            char czebhokwjn3a = czebhokwjn3;
            short xttsdrf2a = xttsdrf2;
            float neuvhfn1a = neuvhfn1;
            boolean mjqoriv0a = mjqoriv0;
            Log.i("meZsqcxn", "meZsqcxn" + mmofevgni4a + neuvhfn1a + czebhokwjn3a + xttsdrf2a + mjqoriv0a + "meZsqcxn" + "" + "");
        }

        //垃圾方法
        private void nbpOBaYn(double gsaemfzr0, short iqnfjrilcu1, boolean bciiykko2, float oemlcomoep3, int tcypjks4) {
            int tcypjks4a = tcypjks4;
            float oemlcomoep3a = oemlcomoep3;
            boolean bciiykko2a = bciiykko2;
            short iqnfjrilcu1a = iqnfjrilcu1;
            double gsaemfzr0a = gsaemfzr0;
            Log.e("nbpOBaYn", "nbpOBaYn" + oemlcomoep3a + bciiykko2a + tcypjks4a + iqnfjrilcu1a + gsaemfzr0a + "nbpOBaYn" + "" + "");
        }

        //垃圾方法
        private void XApkIKdH(boolean rshnzftc0, float ezihblcmo1, float ogvbdpvvte2) {
            float ogvbdpvvte2a = ogvbdpvvte2;
            float ezihblcmo1a = ezihblcmo1;
            boolean rshnzftc0a = rshnzftc0;
            new Intent("XApkIKdH" + ezihblcmo1a + rshnzftc0a + ogvbdpvvte2a + "XApkIKdH" + "" + "");
        }

        //垃圾方法
        private void rGiPWYoF(short qwqqhtzvkp0, int ukgrufhg1, short gyykkomkht2, byte uxieqnm3, double tvctdumei4) {
            double tvctdumei4a = tvctdumei4;
            byte uxieqnm3a = uxieqnm3;
            short gyykkomkht2a = gyykkomkht2;
            int ukgrufhg1a = ukgrufhg1;
            short qwqqhtzvkp0a = qwqqhtzvkp0;
            new StringBuffer("rGiPWYoF" + gyykkomkht2a + tvctdumei4a + uxieqnm3a + qwqqhtzvkp0a + ukgrufhg1a + "rGiPWYoF" + "" + "");
        }

        //垃圾方法
        private void QDdNEkql(boolean vshvwpwzkb0, boolean qoesvxjpbz1, double jcilueali2, short hrohuamj3, long rnzwtnepoe4) {
            long rnzwtnepoe4a = rnzwtnepoe4;
            short hrohuamj3a = hrohuamj3;
            double jcilueali2a = jcilueali2;
            boolean qoesvxjpbz1a = qoesvxjpbz1;
            boolean vshvwpwzkb0a = vshvwpwzkb0;
            new WeakReference("QDdNEkql" + vshvwpwzkb0a + hrohuamj3a + qoesvxjpbz1a + jcilueali2a + rnzwtnepoe4a + "QDdNEkql" + "" + "");
        }

        //垃圾方法
        private void qejQHEsM(byte ebkxifexix0, char vhngijvrbo1, short lcfwvcv2) {
            short lcfwvcv2a = lcfwvcv2;
            char vhngijvrbo1a = vhngijvrbo1;
            byte ebkxifexix0a = ebkxifexix0;
        }

        //垃圾方法
        private void QnBvDlFr(float ovrqvkqb0, char lmccdnyweo1, float yzmcnepajh2, boolean qpbeyjdew3, float mvusgjfwo4) {
            float mvusgjfwo4a = mvusgjfwo4;
            boolean qpbeyjdew3a = qpbeyjdew3;
            float yzmcnepajh2a = yzmcnepajh2;
            char lmccdnyweo1a = lmccdnyweo1;
            float ovrqvkqb0a = ovrqvkqb0;
            System.out.println("QnBvDlFr" + lmccdnyweo1a + yzmcnepajh2a + ovrqvkqb0a + mvusgjfwo4a + qpbeyjdew3a + "QnBvDlFr" + "" + "");
        }

        //垃圾方法
        private void UVADtQbA(double wkvcfuhx0, boolean auixychi1, long xmoxejal2, long xgrhkbrsbh3, short kbkruvj4) {
            short kbkruvj4a = kbkruvj4;
            long xgrhkbrsbh3a = xgrhkbrsbh3;
            long xmoxejal2a = xmoxejal2;
            boolean auixychi1a = auixychi1;
            double wkvcfuhx0a = wkvcfuhx0;
            TextUtils.isEmpty("UVADtQbA" + kbkruvj4a + wkvcfuhx0a + auixychi1a + xgrhkbrsbh3a + xmoxejal2a + "UVADtQbA" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            short kbkruvj4 = 89;
            long xgrhkbrsbh3 = 52L;
            long xmoxejal2 = 84L;
            boolean auixychi1 = false;
            double wkvcfuhx0 = 35.35;
            float mvusgjfwo4 = 13.13f;
            boolean qpbeyjdew3 = false;
            float yzmcnepajh2 = 27.27f;
            char lmccdnyweo1 = 28;
            float ovrqvkqb0 = 71.71f;
            short lcfwvcv2 = 57;
            char vhngijvrbo1 = 96;
            byte ebkxifexix0 = 57;
            long rnzwtnepoe4 = 92L;
            short hrohuamj3 = 41;
            double jcilueali2 = 68.68;
            boolean qoesvxjpbz1 = false;
            boolean vshvwpwzkb0 = true;
            double tvctdumei4 = 88.88;
            byte uxieqnm3 = 24;
            short gyykkomkht2 = 48;
            int ukgrufhg1 = 70;
            short qwqqhtzvkp0 = 90;
            float ogvbdpvvte2 = 16.16f;
            float ezihblcmo1 = 97.97f;
            boolean rshnzftc0 = false;
            int tcypjks4 = 45;
            float oemlcomoep3 = 12.12f;
            boolean bciiykko2 = true;
            short iqnfjrilcu1 = 89;
            double gsaemfzr0 = 24.24;
            long mmofevgni4 = 97L;
            char czebhokwjn3 = 86;
            short xttsdrf2 = 2;
            float neuvhfn1 = 42.42f;
            boolean mjqoriv0 = false;
            XApkIKdH(rshnzftc0, ezihblcmo1, ogvbdpvvte2);
            rGiPWYoF(qwqqhtzvkp0, ukgrufhg1, gyykkomkht2, uxieqnm3, tvctdumei4);
            QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
            rGiPWYoF(qwqqhtzvkp0, ukgrufhg1, gyykkomkht2, uxieqnm3, tvctdumei4);
            nbpOBaYn(gsaemfzr0, iqnfjrilcu1, bciiykko2, oemlcomoep3, tcypjks4);
            XApkIKdH(rshnzftc0, ezihblcmo1, ogvbdpvvte2);
            XApkIKdH(rshnzftc0, ezihblcmo1, ogvbdpvvte2);
            XApkIKdH(rshnzftc0, ezihblcmo1, ogvbdpvvte2);
            nbpOBaYn(gsaemfzr0, iqnfjrilcu1, bciiykko2, oemlcomoep3, tcypjks4);
            rGiPWYoF(qwqqhtzvkp0, ukgrufhg1, gyykkomkht2, uxieqnm3, tvctdumei4);
            SimplyHouseworkrm2Service.mainBinder = service;
            qejQHEsM(ebkxifexix0, vhngijvrbo1, lcfwvcv2);
            QDdNEkql(vshvwpwzkb0, qoesvxjpbz1, jcilueali2, hrohuamj3, rnzwtnepoe4);
            QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
            qejQHEsM(ebkxifexix0, vhngijvrbo1, lcfwvcv2);
            meZsqcxn(mjqoriv0, neuvhfn1, xttsdrf2, czebhokwjn3, mmofevgni4);
            qejQHEsM(ebkxifexix0, vhngijvrbo1, lcfwvcv2);
            try {
                IProcessServiceSimply process = IProcessServiceSimply.Stub.asInterface(service);
                QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
                QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
                XApkIKdH(rshnzftc0, ezihblcmo1, ogvbdpvvte2);
                meZsqcxn(mjqoriv0, neuvhfn1, xttsdrf2, czebhokwjn3, mmofevgni4);
                nbpOBaYn(gsaemfzr0, iqnfjrilcu1, bciiykko2, oemlcomoep3, tcypjks4);
                QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
                qejQHEsM(ebkxifexix0, vhngijvrbo1, lcfwvcv2);
                nbpOBaYn(gsaemfzr0, iqnfjrilcu1, bciiykko2, oemlcomoep3, tcypjks4);
                UVADtQbA(wkvcfuhx0, auixychi1, xmoxejal2, xgrhkbrsbh3, kbkruvj4);
                process.getServiceSimply();
                QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
                QDdNEkql(vshvwpwzkb0, qoesvxjpbz1, jcilueali2, hrohuamj3, rnzwtnepoe4);
                XApkIKdH(rshnzftc0, ezihblcmo1, ogvbdpvvte2);
                meZsqcxn(mjqoriv0, neuvhfn1, xttsdrf2, czebhokwjn3, mmofevgni4);
                UVADtQbA(wkvcfuhx0, auixychi1, xmoxejal2, xgrhkbrsbh3, kbkruvj4);
                QnBvDlFr(ovrqvkqb0, lmccdnyweo1, yzmcnepajh2, qpbeyjdew3, mvusgjfwo4);
                QDdNEkql(vshvwpwzkb0, qoesvxjpbz1, jcilueali2, hrohuamj3, rnzwtnepoe4);
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void fwGXaFGO(float gyrvviq0, int bcjcvvtfy1, double jgknkrqy2) {
            double jgknkrqy2a = jgknkrqy2;
            int bcjcvvtfy1a = bcjcvvtfy1;
            float gyrvviq0a = gyrvviq0;
            System.out.println("fwGXaFGO" + gyrvviq0a + jgknkrqy2a + bcjcvvtfy1a + "fwGXaFGO" + "" + "");
        }

        //垃圾方法
        private void akPLpwpd(double bqlnsjzdjg0, float tqzlamfiwu1) {
            float tqzlamfiwu1a = tqzlamfiwu1;
            double bqlnsjzdjg0a = bqlnsjzdjg0;
            new WeakReference("akPLpwpd" + bqlnsjzdjg0a + tqzlamfiwu1a + "akPLpwpd" + "" + "");
        }

        //垃圾方法
        private void fOJPUOXG(byte yqukoblhdd0, byte rqxmkgwqm1, double pqhlxom2) {
            double pqhlxom2a = pqhlxom2;
            byte rqxmkgwqm1a = rqxmkgwqm1;
            byte yqukoblhdd0a = yqukoblhdd0;
            TextUtils.isEmpty("fOJPUOXG" + yqukoblhdd0a + rqxmkgwqm1a + pqhlxom2a + "fOJPUOXG" + "" + "");
        }

        //垃圾方法
        private void FGIgbbga(long gkigmbw0, float rwnofjmf1) {
            float rwnofjmf1a = rwnofjmf1;
            long gkigmbw0a = gkigmbw0;
            new AttributedString("FGIgbbga" + gkigmbw0a + rwnofjmf1a + "FGIgbbga" + "" + "");
        }

        //垃圾方法
        private void bRKONFIm(char srdltgp0) {
            char srdltgp0a = srdltgp0;
            Log.i("bRKONFIm", "bRKONFIm" + srdltgp0a + "bRKONFIm" + "" + "");
        }

        //垃圾方法
        private void aXVPeVyi(char jwqzojj0, int txbeezmz1, float vzeuhccqlt2, boolean umeuajuu3) {
            boolean umeuajuu3a = umeuajuu3;
            float vzeuhccqlt2a = vzeuhccqlt2;
            int txbeezmz1a = txbeezmz1;
            char jwqzojj0a = jwqzojj0;
            TextUtils.isDigitsOnly("aXVPeVyi" + umeuajuu3a + jwqzojj0a + txbeezmz1a + vzeuhccqlt2a + "aXVPeVyi" + "" + "");
        }

        //垃圾方法
        private void bsmTmgBx(byte lszsbtm0, int mwnzogfppo1) {
            int mwnzogfppo1a = mwnzogfppo1;
            byte lszsbtm0a = lszsbtm0;
            System.out.println("bsmTmgBx" + lszsbtm0a + mwnzogfppo1a + "bsmTmgBx" + "" + "");
        }

        //垃圾方法
        private void kimOWunl(long aqsfepxfp0, byte ulkpgqpmje1, long ycervke2, boolean udxwnmlrb3) {
            boolean udxwnmlrb3a = udxwnmlrb3;
            long ycervke2a = ycervke2;
            byte ulkpgqpmje1a = ulkpgqpmje1;
            long aqsfepxfp0a = aqsfepxfp0;
        }

        //垃圾方法
        private void pbnwzIJX(float ijsyfbcpm0, short niaijdpe1) {
            short niaijdpe1a = niaijdpe1;
            float ijsyfbcpm0a = ijsyfbcpm0;
            new String("pbnwzIJX" + ijsyfbcpm0a + niaijdpe1a + "pbnwzIJX" + "" + "");
        }

        //垃圾方法
        private void RAAPDjKR(double hxiusswddk0, byte navwelf1, long jvrlfjeojf2, byte qcmvhpgz3) {
            byte qcmvhpgz3a = qcmvhpgz3;
            long jvrlfjeojf2a = jvrlfjeojf2;
            byte navwelf1a = navwelf1;
            double hxiusswddk0a = hxiusswddk0;
            new WeakReference("RAAPDjKR" + hxiusswddk0a + qcmvhpgz3a + navwelf1a + jvrlfjeojf2a + "RAAPDjKR" + "" + "");
        }

        //垃圾方法
        private void pzdFRDdu(int hklhdkxv0, float vthhlcn1, boolean kpcyhfwz2, char amepbet3, byte eztnkcuwup4) {
            byte eztnkcuwup4a = eztnkcuwup4;
            char amepbet3a = amepbet3;
            boolean kpcyhfwz2a = kpcyhfwz2;
            float vthhlcn1a = vthhlcn1;
            int hklhdkxv0a = hklhdkxv0;
            new Intent("pzdFRDdu" + amepbet3a + vthhlcn1a + eztnkcuwup4a + kpcyhfwz2a + hklhdkxv0a + "pzdFRDdu" + "" + "");
        }

        //垃圾方法
        private void XXuvlJYB(byte khdkkwfdgd0, byte capslxy1, short okpupmccv2, byte nubtrily3) {
            byte nubtrily3a = nubtrily3;
            short okpupmccv2a = okpupmccv2;
            byte capslxy1a = capslxy1;
            byte khdkkwfdgd0a = khdkkwfdgd0;
            TextUtils.isDigitsOnly("XXuvlJYB" + khdkkwfdgd0a + capslxy1a + nubtrily3a + okpupmccv2a + "XXuvlJYB" + "" + "");
        }

        //垃圾方法
        private void rPmJxLUZ(long wefngvic0, byte mknoaoazun1, char rnbtioxsk2) {
            char rnbtioxsk2a = rnbtioxsk2;
            byte mknoaoazun1a = mknoaoazun1;
            long wefngvic0a = wefngvic0;
            new String("rPmJxLUZ" + wefngvic0a + mknoaoazun1a + rnbtioxsk2a + "rPmJxLUZ" + "" + "");
        }

        //垃圾方法
        private void xveBkhbm(long iakykni0, long onkjtst1, long pvutxtsyf2, byte jwudfhve3) {
            byte jwudfhve3a = jwudfhve3;
            long pvutxtsyf2a = pvutxtsyf2;
            long onkjtst1a = onkjtst1;
            long iakykni0a = iakykni0;
            TextUtils.isEmpty("xveBkhbm" + jwudfhve3a + pvutxtsyf2a + onkjtst1a + iakykni0a + "xveBkhbm" + "" + "");
        }

        //垃圾方法
        private void zmuhhnFa(short qlxasmpdr0, short drfhmcz1, double qsplvfiipy2) {
            double qsplvfiipy2a = qsplvfiipy2;
            short drfhmcz1a = drfhmcz1;
            short qlxasmpdr0a = qlxasmpdr0;
            TextUtils.isDigitsOnly("zmuhhnFa" + qlxasmpdr0a + qsplvfiipy2a + drfhmcz1a + "zmuhhnFa" + "" + "");
        }

        //垃圾方法
        private void wablqhVi(long bwxhjwczr0, char rrlctbsnbp1, long hcookdtal2, double uljybjenmo3) {
            double uljybjenmo3a = uljybjenmo3;
            long hcookdtal2a = hcookdtal2;
            char rrlctbsnbp1a = rrlctbsnbp1;
            long bwxhjwczr0a = bwxhjwczr0;
            new StringReader("wablqhVi" + rrlctbsnbp1a + uljybjenmo3a + hcookdtal2a + bwxhjwczr0a + "wablqhVi" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            double uljybjenmo3 = 72.72;
            long hcookdtal2 = 55L;
            char rrlctbsnbp1 = 48;
            long bwxhjwczr0 = 43L;
            double qsplvfiipy2 = 73.73;
            short drfhmcz1 = 18;
            short qlxasmpdr0 = 58;
            byte jwudfhve3 = 27;
            long pvutxtsyf2 = 74L;
            long onkjtst1 = 2L;
            long iakykni0 = 34L;
            char rnbtioxsk2 = 75;
            byte mknoaoazun1 = 59;
            long wefngvic0 = 30L;
            byte nubtrily3 = 5;
            short okpupmccv2 = 41;
            byte capslxy1 = 27;
            byte khdkkwfdgd0 = 76;
            byte eztnkcuwup4 = 26;
            char amepbet3 = 82;
            boolean kpcyhfwz2 = false;
            float vthhlcn1 = 14.14f;
            int hklhdkxv0 = 62;
            byte qcmvhpgz3 = 3;
            long jvrlfjeojf2 = 42L;
            byte navwelf1 = 80;
            double hxiusswddk0 = 95.95;
            short niaijdpe1 = 3;
            float ijsyfbcpm0 = 83.83f;
            boolean udxwnmlrb3 = true;
            long ycervke2 = 0L;
            byte ulkpgqpmje1 = 27;
            long aqsfepxfp0 = 29L;
            int mwnzogfppo1 = 2;
            byte lszsbtm0 = 86;
            boolean umeuajuu3 = true;
            float vzeuhccqlt2 = 45.45f;
            int txbeezmz1 = 2;
            char jwqzojj0 = 53;
            char srdltgp0 = 93;
            float rwnofjmf1 = 64.64f;
            long gkigmbw0 = 37L;
            double pqhlxom2 = 74.74;
            byte rqxmkgwqm1 = 67;
            byte yqukoblhdd0 = 100;
            float tqzlamfiwu1 = 90.90f;
            double bqlnsjzdjg0 = 97.97;
            double jgknkrqy2 = 96.96;
            int bcjcvvtfy1 = 77;
            float gyrvviq0 = 99.99f;
            zmuhhnFa(qlxasmpdr0, drfhmcz1, qsplvfiipy2);
            akPLpwpd(bqlnsjzdjg0, tqzlamfiwu1);
            wablqhVi(bwxhjwczr0, rrlctbsnbp1, hcookdtal2, uljybjenmo3);
            FGIgbbga(gkigmbw0, rwnofjmf1);
            RAAPDjKR(hxiusswddk0, navwelf1, jvrlfjeojf2, qcmvhpgz3);
            if (SimplyHouseworkrOrgManager.isDebug) {
                pzdFRDdu(hklhdkxv0, vthhlcn1, kpcyhfwz2, amepbet3, eztnkcuwup4);
                FGIgbbga(gkigmbw0, rwnofjmf1);
                xveBkhbm(iakykni0, onkjtst1, pvutxtsyf2, jwudfhve3);
                zmuhhnFa(qlxasmpdr0, drfhmcz1, qsplvfiipy2);
                kimOWunl(aqsfepxfp0, ulkpgqpmje1, ycervke2, udxwnmlrb3);
                fOJPUOXG(yqukoblhdd0, rqxmkgwqm1, pqhlxom2);
                wablqhVi(bwxhjwczr0, rrlctbsnbp1, hcookdtal2, uljybjenmo3);
                bsmTmgBx(lszsbtm0, mwnzogfppo1);
                bsmTmgBx(lszsbtm0, mwnzogfppo1);
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            rPmJxLUZ(wefngvic0, mknoaoazun1, rnbtioxsk2);
            rPmJxLUZ(wefngvic0, mknoaoazun1, rnbtioxsk2);
            pbnwzIJX(ijsyfbcpm0, niaijdpe1);
            XXuvlJYB(khdkkwfdgd0, capslxy1, okpupmccv2, nubtrily3);
            SimplyHouseworkrm2Service.mainBinder = null;
            fOJPUOXG(yqukoblhdd0, rqxmkgwqm1, pqhlxom2);
            fwGXaFGO(gyrvviq0, bcjcvvtfy1, jgknkrqy2);
            xveBkhbm(iakykni0, onkjtst1, pvutxtsyf2, jwudfhve3);
            bsmTmgBx(lszsbtm0, mwnzogfppo1);
            SimplyHouseworkrm2Service.isReTryBinding = true;
            startMainService(2, false);
        }

        //垃圾方法
        private void hNvmbxDy(boolean vccphkdkcw0, float jhstffkrxh1, char myjolgtxp2) {
            char myjolgtxp2a = myjolgtxp2;
            float jhstffkrxh1a = jhstffkrxh1;
            boolean vccphkdkcw0a = vccphkdkcw0;
            Log.w("hNvmbxDy", "hNvmbxDy" + vccphkdkcw0a + jhstffkrxh1a + myjolgtxp2a + "hNvmbxDy" + "" + "");
        }

        //垃圾方法
        private void zyBQlukI(float keawmpnnc0, float jweoqikj1, boolean mzxxxfeggo2, double hzyyiyg3, boolean bzzfrekk4) {
            boolean bzzfrekk4a = bzzfrekk4;
            double hzyyiyg3a = hzyyiyg3;
            boolean mzxxxfeggo2a = mzxxxfeggo2;
            float jweoqikj1a = jweoqikj1;
            float keawmpnnc0a = keawmpnnc0;
            new String("zyBQlukI" + bzzfrekk4a + keawmpnnc0a + hzyyiyg3a + jweoqikj1a + mzxxxfeggo2a + "zyBQlukI" + "" + "");
        }

        //垃圾方法
        private void QCjiZclH(byte bxhoezsp0, byte snurxora1) {
            byte snurxora1a = snurxora1;
            byte bxhoezsp0a = bxhoezsp0;
            Log.e("QCjiZclH", "QCjiZclH" + bxhoezsp0a + snurxora1a + "QCjiZclH" + "" + "");
        }

        //垃圾方法
        private void PVQBmCUO(float gvoikhep0, boolean upxsriae1, float gogagwuiwr2, boolean pkqpippvbq3) {
            boolean pkqpippvbq3a = pkqpippvbq3;
            float gogagwuiwr2a = gogagwuiwr2;
            boolean upxsriae1a = upxsriae1;
            float gvoikhep0a = gvoikhep0;
            Log.w("PVQBmCUO", "PVQBmCUO" + gogagwuiwr2a + upxsriae1a + pkqpippvbq3a + gvoikhep0a + "PVQBmCUO" + "" + "");
        }

        //垃圾方法
        private void SazkkffO(char lvvbxhwlaz0, byte ymwryizfx1, boolean wentaqvoz2, float cxyhqlgcsp3) {
            float cxyhqlgcsp3a = cxyhqlgcsp3;
            boolean wentaqvoz2a = wentaqvoz2;
            byte ymwryizfx1a = ymwryizfx1;
            char lvvbxhwlaz0a = lvvbxhwlaz0;
            Log.w("SazkkffO", "SazkkffO" + wentaqvoz2a + cxyhqlgcsp3a + lvvbxhwlaz0a + ymwryizfx1a + "SazkkffO" + "" + "");
        }

        //垃圾方法
        private void aNewpnRh(float cfrdkbwp0, float riyofygnde1, float cywiagjufm2) {
            float cywiagjufm2a = cywiagjufm2;
            float riyofygnde1a = riyofygnde1;
            float cfrdkbwp0a = cfrdkbwp0;
            Log.e("aNewpnRh", "aNewpnRh" + cywiagjufm2a + cfrdkbwp0a + riyofygnde1a + "aNewpnRh" + "" + "");
        }

        //垃圾方法
        private void WfeBLskP(char grrnrfu0, long dzsqaxmy1, byte lgbmsecp2, double dueogqtsfr3, boolean dkkmijkv4) {
            boolean dkkmijkv4a = dkkmijkv4;
            double dueogqtsfr3a = dueogqtsfr3;
            byte lgbmsecp2a = lgbmsecp2;
            long dzsqaxmy1a = dzsqaxmy1;
            char grrnrfu0a = grrnrfu0;
            new File("WfeBLskP" + dkkmijkv4a + dueogqtsfr3a + grrnrfu0a + lgbmsecp2a + dzsqaxmy1a + "WfeBLskP" + "" + "");
        }

        //垃圾方法
        private void qSnUcIvX(int xlloiwuvd0, float tnkvxpy1) {
            float tnkvxpy1a = tnkvxpy1;
            int xlloiwuvd0a = xlloiwuvd0;
            new Intent("qSnUcIvX" + xlloiwuvd0a + tnkvxpy1a + "qSnUcIvX" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            float tnkvxpy1 = 81.81f;
            int xlloiwuvd0 = 0;
            boolean dkkmijkv4 = true;
            double dueogqtsfr3 = 40.40;
            byte lgbmsecp2 = 85;
            long dzsqaxmy1 = 77L;
            char grrnrfu0 = 4;
            float cywiagjufm2 = 36.36f;
            float riyofygnde1 = 17.17f;
            float cfrdkbwp0 = 76.76f;
            float cxyhqlgcsp3 = 84.84f;
            boolean wentaqvoz2 = true;
            byte ymwryizfx1 = 23;
            char lvvbxhwlaz0 = 69;
            boolean pkqpippvbq3 = false;
            float gogagwuiwr2 = 47.47f;
            boolean upxsriae1 = false;
            float gvoikhep0 = 77.77f;
            byte snurxora1 = 100;
            byte bxhoezsp0 = 28;
            boolean bzzfrekk4 = true;
            double hzyyiyg3 = 97.97;
            boolean mzxxxfeggo2 = false;
            float jweoqikj1 = 58.58f;
            float keawmpnnc0 = 68.68f;
            char myjolgtxp2 = 74;
            float jhstffkrxh1 = 84.84f;
            boolean vccphkdkcw0 = false;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            SazkkffO(lvvbxhwlaz0, ymwryizfx1, wentaqvoz2, cxyhqlgcsp3);
            SazkkffO(lvvbxhwlaz0, ymwryizfx1, wentaqvoz2, cxyhqlgcsp3);
            aNewpnRh(cfrdkbwp0, riyofygnde1, cywiagjufm2);
            PVQBmCUO(gvoikhep0, upxsriae1, gogagwuiwr2, pkqpippvbq3);
            hNvmbxDy(vccphkdkcw0, jhstffkrxh1, myjolgtxp2);
            SazkkffO(lvvbxhwlaz0, ymwryizfx1, wentaqvoz2, cxyhqlgcsp3);
            qSnUcIvX(xlloiwuvd0, tnkvxpy1);
            WfeBLskP(grrnrfu0, dzsqaxmy1, lgbmsecp2, dueogqtsfr3, dkkmijkv4);
            aNewpnRh(cfrdkbwp0, riyofygnde1, cywiagjufm2);
            qSnUcIvX(xlloiwuvd0, tnkvxpy1);
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private boolean jYXHZWD = true;

    //垃圾变量
    private float wTlKdfJ = 52.52f;

    //垃圾变量
    private double igePtjb = 65.65;

    //垃圾变量
    private int TRznrIa = 46;

    //垃圾变量
    private double avjsFQw = 8.8;

    //垃圾变量
    private char HLVzZqO = 23;

    //垃圾方法
    private void DXvxParP(char tmumhyd0, float tmctmpe1, boolean beemjssh2, short ydxplnbj3, int lbufwwks4) {
        int lbufwwks4a = lbufwwks4;
        short ydxplnbj3a = ydxplnbj3;
        boolean beemjssh2a = beemjssh2;
        float tmctmpe1a = tmctmpe1;
        char tmumhyd0a = tmumhyd0;
        new File("DXvxParP" + tmctmpe1a + tmumhyd0a + ydxplnbj3a + lbufwwks4a + beemjssh2a + "DXvxParP" + igePtjb + jlqSXfm + jYXHZWD + GzVZOPz + CYiuxIi + xdYuApv + onIiwOJ + ptGfesr + avjsFQw + tuBWHWM + KblUfYU + YlYwiin + iVFSYuI + IvKQeSl + "");
    }

    //垃圾方法
    private void vgZSDiOo(byte ntnjhbavym0, float krkgjntwr1, float outsnjutd2, long nbbiizt3) {
        long nbbiizt3a = nbbiizt3;
        float outsnjutd2a = outsnjutd2;
        float krkgjntwr1a = krkgjntwr1;
        byte ntnjhbavym0a = ntnjhbavym0;
        Log.i("vgZSDiOo", "vgZSDiOo" + nbbiizt3a + krkgjntwr1a + ntnjhbavym0a + outsnjutd2a + "vgZSDiOo" + GzVZOPz + avjsFQw + IvKQeSl + igePtjb + YlYwiin + xdYuApv + ptGfesr + KblUfYU + jYXHZWD + tuBWHWM + CYiuxIi + iVFSYuI + jlqSXfm + onIiwOJ + "");
    }

    //垃圾方法
    private void LrGPqRnD(float vzanpxzq0, char kzawkdy1, short rohggzqk2, double mepdnoty3, byte uvzhabvfw4) {
        byte uvzhabvfw4a = uvzhabvfw4;
        double mepdnoty3a = mepdnoty3;
        short rohggzqk2a = rohggzqk2;
        char kzawkdy1a = kzawkdy1;
        float vzanpxzq0a = vzanpxzq0;
        new String("LrGPqRnD" + uvzhabvfw4a + vzanpxzq0a + mepdnoty3a + kzawkdy1a + rohggzqk2a + "LrGPqRnD" + jYXHZWD + YlYwiin + xdYuApv + tuBWHWM + avjsFQw + igePtjb + GzVZOPz + CYiuxIi + IvKQeSl + iVFSYuI + KblUfYU + onIiwOJ + jlqSXfm + ptGfesr + "");
    }

    //垃圾方法
    private void QsxcjOBZ(int eedboawwup0, char buijjnijnn1, float beyakfumuq2, short sogcqkjm3) {
        short sogcqkjm3a = sogcqkjm3;
        float beyakfumuq2a = beyakfumuq2;
        char buijjnijnn1a = buijjnijnn1;
        int eedboawwup0a = eedboawwup0;
        new String("QsxcjOBZ" + buijjnijnn1a + beyakfumuq2a + eedboawwup0a + sogcqkjm3a + "QsxcjOBZ" + GzVZOPz + CYiuxIi + xdYuApv + onIiwOJ + jlqSXfm + tuBWHWM + avjsFQw + iVFSYuI + IvKQeSl + YlYwiin + ptGfesr + KblUfYU + igePtjb + jYXHZWD + "");
    }

    //垃圾方法
    private void ZHiQVGvo(char bedslnjvsh0, char yqoqagxkt1, char ankysqovuw2) {
        char ankysqovuw2a = ankysqovuw2;
        char yqoqagxkt1a = yqoqagxkt1;
        char bedslnjvsh0a = bedslnjvsh0;
        new Thread("ZHiQVGvo" + ankysqovuw2a + yqoqagxkt1a + bedslnjvsh0a + "ZHiQVGvo" + ptGfesr + tuBWHWM + xdYuApv + IvKQeSl + jYXHZWD + igePtjb + CYiuxIi + avjsFQw + GzVZOPz + onIiwOJ + jlqSXfm + KblUfYU + YlYwiin + iVFSYuI + "");
    }

    //垃圾方法
    private void ufaVESKz(float zsduxptau0, boolean tlzxxve1, byte yntvomte2, int rohrvbepu3, boolean ldsanhvo4) {
        boolean ldsanhvo4a = ldsanhvo4;
        int rohrvbepu3a = rohrvbepu3;
        byte yntvomte2a = yntvomte2;
        boolean tlzxxve1a = tlzxxve1;
        float zsduxptau0a = zsduxptau0;
        new String("ufaVESKz" + tlzxxve1a + yntvomte2a + zsduxptau0a + ldsanhvo4a + rohrvbepu3a + "ufaVESKz" + avjsFQw + jYXHZWD + ptGfesr + YlYwiin + tuBWHWM + IvKQeSl + igePtjb + jlqSXfm + xdYuApv + iVFSYuI + GzVZOPz + KblUfYU + onIiwOJ + CYiuxIi + "");
    }

    //垃圾方法
    private void rbLsWqXG(float jxvoztx0, byte zguckxjs1, double bgkfghwvem2, char mzpqwqg3) {
        char mzpqwqg3a = mzpqwqg3;
        double bgkfghwvem2a = bgkfghwvem2;
        byte zguckxjs1a = zguckxjs1;
        float jxvoztx0a = jxvoztx0;
        TextUtils.isEmpty("rbLsWqXG" + jxvoztx0a + mzpqwqg3a + bgkfghwvem2a + zguckxjs1a + "rbLsWqXG" + IvKQeSl + avjsFQw + ptGfesr + tuBWHWM + igePtjb + jYXHZWD + CYiuxIi + KblUfYU + jlqSXfm + xdYuApv + YlYwiin + iVFSYuI + GzVZOPz + onIiwOJ + "");
    }

    //垃圾方法
    private void lsVwNTxD(byte jhjwevka0, byte ivjxzqqsh1, long vuahzia2, int eyoxfmv3, boolean lpnkhwj4) {
        boolean lpnkhwj4a = lpnkhwj4;
        int eyoxfmv3a = eyoxfmv3;
        long vuahzia2a = vuahzia2;
        byte ivjxzqqsh1a = ivjxzqqsh1;
        byte jhjwevka0a = jhjwevka0;
        new Thread("lsVwNTxD" + ivjxzqqsh1a + vuahzia2a + lpnkhwj4a + eyoxfmv3a + jhjwevka0a + "lsVwNTxD" + tuBWHWM + KblUfYU + xdYuApv + onIiwOJ + jYXHZWD + jlqSXfm + CYiuxIi + IvKQeSl + GzVZOPz + avjsFQw + igePtjb + iVFSYuI + YlYwiin + ptGfesr + "");
    }

    public String toString() {
        boolean lpnkhwj4 = false;
        int eyoxfmv3 = 74;
        long vuahzia2 = 43L;
        byte ivjxzqqsh1 = 0;
        byte jhjwevka0 = 68;
        char mzpqwqg3 = 1;
        double bgkfghwvem2 = 38.38;
        byte zguckxjs1 = 45;
        float jxvoztx0 = 66.66f;
        boolean ldsanhvo4 = true;
        int rohrvbepu3 = 90;
        byte yntvomte2 = 58;
        boolean tlzxxve1 = true;
        float zsduxptau0 = 96.96f;
        char ankysqovuw2 = 36;
        char yqoqagxkt1 = 39;
        char bedslnjvsh0 = 0;
        short sogcqkjm3 = 72;
        float beyakfumuq2 = 71.71f;
        char buijjnijnn1 = 0;
        int eedboawwup0 = 100;
        byte uvzhabvfw4 = 79;
        double mepdnoty3 = 47.47;
        short rohggzqk2 = 48;
        char kzawkdy1 = 66;
        float vzanpxzq0 = 76.76f;
        long nbbiizt3 = 5L;
        float outsnjutd2 = 8.8f;
        float krkgjntwr1 = 96.96f;
        byte ntnjhbavym0 = 6;
        int lbufwwks4 = 98;
        short ydxplnbj3 = 95;
        boolean beemjssh2 = true;
        float tmctmpe1 = 55.55f;
        char tmumhyd0 = 70;
        LrGPqRnD(vzanpxzq0, kzawkdy1, rohggzqk2, mepdnoty3, uvzhabvfw4);
        rbLsWqXG(jxvoztx0, zguckxjs1, bgkfghwvem2, mzpqwqg3);
        DXvxParP(tmumhyd0, tmctmpe1, beemjssh2, ydxplnbj3, lbufwwks4);
        ufaVESKz(zsduxptau0, tlzxxve1, yntvomte2, rohrvbepu3, ldsanhvo4);
        QsxcjOBZ(eedboawwup0, buijjnijnn1, beyakfumuq2, sogcqkjm3);
        lsVwNTxD(jhjwevka0, ivjxzqqsh1, vuahzia2, eyoxfmv3, lpnkhwj4);
        new Intent("" + wTlKdfJ + TRznrIa + HLVzZqO + "");
        return super.toString();
    }
}
