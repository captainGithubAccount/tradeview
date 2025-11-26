package com.recover.redate.orgyy;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.content.recover.IProcessServiceRecover;
import com.recover.redate.RecoverOrgManager;
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

public class Recover1Service extends Service {

    //垃圾变量
    private float hPjSfna = 67.67f;

    public static long lastTime = 0L;

    //垃圾变量
    private short vNDhcwp = 32;

    private static String TAG = "xxx";

    //垃圾变量
    private float ycvbGUz = 61.61f;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private char HMZmhTp = 47;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private float VyshFOt = 17.17f;

    public static Boolean isLiving = false;

    //垃圾变量
    private short pZRODbs = 91;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private int tEwkbqd = 96;

    private static long delayTime = 250L;

    //垃圾变量
    private float DpCEstk = 85.85f;

    public static boolean isStartService = false;

    //垃圾变量
    private double EzJXPeo = 23.23;

    private IBinder subBinder = null;

    //垃圾变量
    private float lhfNNZg = 34.34f;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private short sETMgqy = 65;

    int nextNum = -1;

    public Recover1Service() {
    }

    //垃圾方法
    static private void nlReBbYQ(boolean pngvgijqbs0) {
        boolean pngvgijqbs0a = pngvgijqbs0;
        Log.i("nlReBbYQ", "nlReBbYQ" + pngvgijqbs0a + "nlReBbYQ" + "");
    }

    //垃圾方法
    static private void oifBbARk(byte huthdkx0) {
        byte huthdkx0a = huthdkx0;
        new AttributedString("oifBbARk" + huthdkx0a + "oifBbARk" + "");
    }

    //垃圾方法
    static private void PTpdcNeZ(char xqyubbbodm0, float ownuumqkw1, long vkzsnhmlhr2, long aqeajadr3) {
        long aqeajadr3a = aqeajadr3;
        long vkzsnhmlhr2a = vkzsnhmlhr2;
        float ownuumqkw1a = ownuumqkw1;
        char xqyubbbodm0a = xqyubbbodm0;
        new AttributedString("PTpdcNeZ" + xqyubbbodm0a + ownuumqkw1a + vkzsnhmlhr2a + aqeajadr3a + "PTpdcNeZ" + "");
    }

    //垃圾方法
    static private void nwQECVoe(float mtlunbxd0) {
        float mtlunbxd0a = mtlunbxd0;
        Log.i("nwQECVoe", "nwQECVoe" + mtlunbxd0a + "nwQECVoe" + "");
    }

    public static void tryStartLaunchMainService() {
        float mtlunbxd0 = 71.71f;
        long aqeajadr3 = 36L;
        long vkzsnhmlhr2 = 44L;
        float ownuumqkw1 = 44.44f;
        char xqyubbbodm0 = 66;
        byte huthdkx0 = 9;
        boolean pngvgijqbs0 = false;
        nlReBbYQ(pngvgijqbs0);
        nlReBbYQ(pngvgijqbs0);
        nlReBbYQ(pngvgijqbs0);
        nlReBbYQ(pngvgijqbs0);
        oifBbARk(huthdkx0);
        if (isLiving) {
            if (RecoverOrgManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (RecoverOrgManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(RecoverOrgManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void uXPQPfIx(char cguehhye0, boolean sxhkfmat1) {
        boolean sxhkfmat1a = sxhkfmat1;
        char cguehhye0a = cguehhye0;
        TextUtils.isEmpty("uXPQPfIx" + cguehhye0a + sxhkfmat1a + "uXPQPfIx" + "");
    }

    //垃圾方法
    static private void hquLivmT(boolean syryaefccs0) {
        boolean syryaefccs0a = syryaefccs0;
        new AttributedString("hquLivmT" + syryaefccs0a + "hquLivmT" + "");
    }

    //垃圾方法
    static private void RvhFVRJq(int qfaqhlkx0, double lrjipxnl1, long cqvwzklbd2, long pqnjtudpj3, int bqbkppkz4) {
        int bqbkppkz4a = bqbkppkz4;
        long pqnjtudpj3a = pqnjtudpj3;
        long cqvwzklbd2a = cqvwzklbd2;
        double lrjipxnl1a = lrjipxnl1;
        int qfaqhlkx0a = qfaqhlkx0;
        Log.e("RvhFVRJq", "RvhFVRJq" + qfaqhlkx0a + cqvwzklbd2a + bqbkppkz4a + pqnjtudpj3a + lrjipxnl1a + "RvhFVRJq" + "");
    }

    //垃圾方法
    static private void pKqMrQpz(float luvfgrr0, short gcprrqttj1, double ztwughz2, float brdofxn3) {
        float brdofxn3a = brdofxn3;
        double ztwughz2a = ztwughz2;
        short gcprrqttj1a = gcprrqttj1;
        float luvfgrr0a = luvfgrr0;
        new String("pKqMrQpz" + gcprrqttj1a + luvfgrr0a + brdofxn3a + ztwughz2a + "pKqMrQpz" + "");
    }

    //垃圾方法
    static private void BuhrUEVg(short thwoauuo0) {
        short thwoauuo0a = thwoauuo0;
        Log.i("BuhrUEVg", "BuhrUEVg" + thwoauuo0a + "BuhrUEVg" + "");
    }

    //垃圾方法
    static private void FdGgejzt(int dnegzqrygp0, char edswicc1) {
        char edswicc1a = edswicc1;
        int dnegzqrygp0a = dnegzqrygp0;
        Log.e("FdGgejzt", "FdGgejzt" + dnegzqrygp0a + edswicc1a + "FdGgejzt" + "");
    }

    //垃圾方法
    static private void RQVOxVJs(byte zvocqtv0) {
        byte zvocqtv0a = zvocqtv0;
        new StringBuffer("RQVOxVJs" + zvocqtv0a + "RQVOxVJs" + "");
    }

    //垃圾方法
    static private void YuOKNDye(long bpzsgol0, long ttbtmruotu1) {
        long ttbtmruotu1a = ttbtmruotu1;
        long bpzsgol0a = bpzsgol0;
        new Intent("YuOKNDye" + bpzsgol0a + ttbtmruotu1a + "YuOKNDye" + "");
    }

    private static void startService(Context context) {
        long ttbtmruotu1 = 13L;
        long bpzsgol0 = 33L;
        byte zvocqtv0 = 22;
        char edswicc1 = 2;
        int dnegzqrygp0 = 97;
        short thwoauuo0 = 9;
        float brdofxn3 = 13.13f;
        double ztwughz2 = 53.53;
        short gcprrqttj1 = 87;
        float luvfgrr0 = 34.34f;
        int bqbkppkz4 = 15;
        long pqnjtudpj3 = 55L;
        long cqvwzklbd2 = 41L;
        double lrjipxnl1 = 72.72;
        int qfaqhlkx0 = 3;
        boolean syryaefccs0 = true;
        boolean sxhkfmat1 = true;
        char cguehhye0 = 11;
        RvhFVRJq(qfaqhlkx0, lrjipxnl1, cqvwzklbd2, pqnjtudpj3, bqbkppkz4);
        FdGgejzt(dnegzqrygp0, edswicc1);
        hquLivmT(syryaefccs0);
        pKqMrQpz(luvfgrr0, gcprrqttj1, ztwughz2, brdofxn3);
        uXPQPfIx(cguehhye0, sxhkfmat1);
        pKqMrQpz(luvfgrr0, gcprrqttj1, ztwughz2, brdofxn3);
        hquLivmT(syryaefccs0);
        BuhrUEVg(thwoauuo0);
        RQVOxVJs(zvocqtv0);
        pKqMrQpz(luvfgrr0, gcprrqttj1, ztwughz2, brdofxn3);
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "LocalService startService5");
        }
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void vIMALfJq(double ywntlob0, float fmmlllndd1, char uitkxkc2) {
        char uitkxkc2a = uitkxkc2;
        float fmmlllndd1a = fmmlllndd1;
        double ywntlob0a = ywntlob0;
        TextUtils.isDigitsOnly("vIMALfJq" + fmmlllndd1a + uitkxkc2a + ywntlob0a + "vIMALfJq" + EzJXPeo + VyshFOt + HCEHAtW + vNDhcwp + Kgqzymr + DpCEstk + QAKXFln + pZRODbs + lhfNNZg + xuPiLDw + sETMgqy + ycvbGUz + hPjSfna + HMZmhTp + tEwkbqd + lGUorZP + "");
    }

    //垃圾方法
    private void yBWGbMRO(boolean uzadoxg0, int qzmhtuyuum1, char scoesvsd2, boolean jmcpypwqc3) {
        boolean jmcpypwqc3a = jmcpypwqc3;
        char scoesvsd2a = scoesvsd2;
        int qzmhtuyuum1a = qzmhtuyuum1;
        boolean uzadoxg0a = uzadoxg0;
        TextUtils.isEmpty("yBWGbMRO" + jmcpypwqc3a + qzmhtuyuum1a + scoesvsd2a + uzadoxg0a + "yBWGbMRO" + vNDhcwp + EzJXPeo + sETMgqy + xuPiLDw + lhfNNZg + QAKXFln + hPjSfna + tEwkbqd + ycvbGUz + Kgqzymr + VyshFOt + pZRODbs + HMZmhTp + lGUorZP + DpCEstk + HCEHAtW + "");
    }

    //垃圾方法
    private void xmbzLyJR(long fcwbian0, byte lylpifpb1) {
        byte lylpifpb1a = lylpifpb1;
        long fcwbian0a = fcwbian0;
        new Intent("xmbzLyJR" + lylpifpb1a + fcwbian0a + "xmbzLyJR" + lhfNNZg + Kgqzymr + QAKXFln + vNDhcwp + ycvbGUz + sETMgqy + xuPiLDw + DpCEstk + EzJXPeo + pZRODbs + tEwkbqd + lGUorZP + HMZmhTp + VyshFOt + HCEHAtW + hPjSfna + "");
    }

    //垃圾方法
    private void WtiLICeS(byte kuqulkhl0, char tnrgjlbv1, float oqoyiryzuy2) {
        float oqoyiryzuy2a = oqoyiryzuy2;
        char tnrgjlbv1a = tnrgjlbv1;
        byte kuqulkhl0a = kuqulkhl0;
        TextUtils.isDigitsOnly("WtiLICeS" + tnrgjlbv1a + kuqulkhl0a + oqoyiryzuy2a + "WtiLICeS" + pZRODbs + Kgqzymr + sETMgqy + EzJXPeo + hPjSfna + VyshFOt + ycvbGUz + HMZmhTp + HCEHAtW + tEwkbqd + lGUorZP + QAKXFln + lhfNNZg + xuPiLDw + vNDhcwp + DpCEstk + "");
    }

    //垃圾方法
    private void daSxOFvR(double rofyxzf0) {
        double rofyxzf0a = rofyxzf0;
    }

    //垃圾方法
    private void NNNXxIDY(char keeeqcd0) {
        char keeeqcd0a = keeeqcd0;
        new StringBuffer("NNNXxIDY" + keeeqcd0a + "NNNXxIDY" + pZRODbs + QAKXFln + DpCEstk + xuPiLDw + sETMgqy + ycvbGUz + hPjSfna + tEwkbqd + HCEHAtW + lhfNNZg + EzJXPeo + Kgqzymr + vNDhcwp + VyshFOt + HMZmhTp + lGUorZP + "");
    }

    //垃圾方法
    private void qHGlBwDK(long oijrhwn0) {
        long oijrhwn0a = oijrhwn0;
        Log.i("qHGlBwDK", "qHGlBwDK" + oijrhwn0a + "qHGlBwDK" + pZRODbs + lhfNNZg + hPjSfna + HCEHAtW + tEwkbqd + EzJXPeo + sETMgqy + QAKXFln + DpCEstk + vNDhcwp + lGUorZP + Kgqzymr + ycvbGUz + xuPiLDw + HMZmhTp + VyshFOt + "");
    }

    //垃圾方法
    private void HegkymVm(short oiljcfqtgn0, int ydccqdif1, boolean qvuvjojm2, double kalxmlw3, char rglxgomkmk4) {
        char rglxgomkmk4a = rglxgomkmk4;
        double kalxmlw3a = kalxmlw3;
        boolean qvuvjojm2a = qvuvjojm2;
        int ydccqdif1a = ydccqdif1;
        short oiljcfqtgn0a = oiljcfqtgn0;
        new Thread("HegkymVm" + kalxmlw3a + ydccqdif1a + oiljcfqtgn0a + qvuvjojm2a + rglxgomkmk4a + "HegkymVm" + HMZmhTp + lhfNNZg + EzJXPeo + Kgqzymr + lGUorZP + VyshFOt + xuPiLDw + ycvbGUz + hPjSfna + pZRODbs + DpCEstk + sETMgqy + tEwkbqd + QAKXFln + HCEHAtW + vNDhcwp + "");
    }

    //垃圾方法
    private void GFeatVXs(long ygjjkmrjmu0, boolean qkeehzsp1, long nvutvwjlvb2, long tjeiaixp3, float wscktata4) {
        float wscktata4a = wscktata4;
        long tjeiaixp3a = tjeiaixp3;
        long nvutvwjlvb2a = nvutvwjlvb2;
        boolean qkeehzsp1a = qkeehzsp1;
        long ygjjkmrjmu0a = ygjjkmrjmu0;
        Log.i("GFeatVXs", "GFeatVXs" + ygjjkmrjmu0a + qkeehzsp1a + wscktata4a + nvutvwjlvb2a + tjeiaixp3a + "GFeatVXs" + HCEHAtW + QAKXFln + lhfNNZg + sETMgqy + ycvbGUz + pZRODbs + vNDhcwp + Kgqzymr + VyshFOt + xuPiLDw + tEwkbqd + hPjSfna + lGUorZP + DpCEstk + HMZmhTp + EzJXPeo + "");
    }

    //垃圾方法
    private void mjbqtNch(float qjpgrkzwyk0, double qpoiicfh1) {
        double qpoiicfh1a = qpoiicfh1;
        float qjpgrkzwyk0a = qjpgrkzwyk0;
        new WeakReference("mjbqtNch" + qjpgrkzwyk0a + qpoiicfh1a + "mjbqtNch" + VyshFOt + pZRODbs + QAKXFln + HCEHAtW + DpCEstk + Kgqzymr + sETMgqy + ycvbGUz + lGUorZP + lhfNNZg + HMZmhTp + vNDhcwp + hPjSfna + EzJXPeo + tEwkbqd + xuPiLDw + "");
    }

    //垃圾方法
    private void RebetnPN(double wjblawm0, int pvmunxfkm1) {
        int pvmunxfkm1a = pvmunxfkm1;
        double wjblawm0a = wjblawm0;
        new File("RebetnPN" + pvmunxfkm1a + wjblawm0a + "RebetnPN" + EzJXPeo + QAKXFln + HCEHAtW + VyshFOt + xuPiLDw + hPjSfna + lhfNNZg + sETMgqy + tEwkbqd + lGUorZP + DpCEstk + pZRODbs + HMZmhTp + ycvbGUz + vNDhcwp + Kgqzymr + "");
    }

    //垃圾方法
    private void OFZLyDAk(double exybdyfwb0, float utwstvnic1) {
        float utwstvnic1a = utwstvnic1;
        double exybdyfwb0a = exybdyfwb0;
        Log.w("OFZLyDAk", "OFZLyDAk" + exybdyfwb0a + utwstvnic1a + "OFZLyDAk" + DpCEstk + pZRODbs + hPjSfna + HCEHAtW + sETMgqy + xuPiLDw + HMZmhTp + lGUorZP + tEwkbqd + EzJXPeo + lhfNNZg + QAKXFln + ycvbGUz + VyshFOt + vNDhcwp + Kgqzymr + "");
    }

    //垃圾方法
    private void VrRMYGab(char yythqen0, boolean owvwxrt1, boolean qfpbiyi2, int myuuzipl3) {
        int myuuzipl3a = myuuzipl3;
        boolean qfpbiyi2a = qfpbiyi2;
        boolean owvwxrt1a = owvwxrt1;
        char yythqen0a = yythqen0;
        System.out.println("VrRMYGab" + myuuzipl3a + yythqen0a + qfpbiyi2a + owvwxrt1a + "VrRMYGab" + HCEHAtW + sETMgqy + ycvbGUz + lGUorZP + tEwkbqd + EzJXPeo + QAKXFln + Kgqzymr + lhfNNZg + DpCEstk + hPjSfna + HMZmhTp + vNDhcwp + VyshFOt + xuPiLDw + pZRODbs + "");
    }

    //垃圾方法
    private void pZGMIPhW(int lpmiecy0, byte dblmuntmn1, short rwnfxtkufa2, boolean bzxifnlpye3, short cytswzotgk4) {
        short cytswzotgk4a = cytswzotgk4;
        boolean bzxifnlpye3a = bzxifnlpye3;
        short rwnfxtkufa2a = rwnfxtkufa2;
        byte dblmuntmn1a = dblmuntmn1;
        int lpmiecy0a = lpmiecy0;
        Log.e("pZGMIPhW", "pZGMIPhW" + cytswzotgk4a + dblmuntmn1a + lpmiecy0a + bzxifnlpye3a + rwnfxtkufa2a + "pZGMIPhW" + lhfNNZg + pZRODbs + VyshFOt + HMZmhTp + Kgqzymr + xuPiLDw + ycvbGUz + EzJXPeo + vNDhcwp + QAKXFln + HCEHAtW + DpCEstk + sETMgqy + tEwkbqd + lGUorZP + hPjSfna + "");
    }

    //垃圾方法
    private void BdmKYgrz(boolean tgsniwlxi0, byte sbzoxutgr1, boolean pbphualv2, long hezsudtbz3) {
        long hezsudtbz3a = hezsudtbz3;
        boolean pbphualv2a = pbphualv2;
        byte sbzoxutgr1a = sbzoxutgr1;
        boolean tgsniwlxi0a = tgsniwlxi0;
        Log.i("BdmKYgrz", "BdmKYgrz" + sbzoxutgr1a + hezsudtbz3a + pbphualv2a + tgsniwlxi0a + "BdmKYgrz" + DpCEstk + vNDhcwp + VyshFOt + lhfNNZg + Kgqzymr + pZRODbs + xuPiLDw + tEwkbqd + EzJXPeo + QAKXFln + HCEHAtW + ycvbGUz + hPjSfna + lGUorZP + sETMgqy + HMZmhTp + "");
    }

    //垃圾方法
    private void sMOqUgyF(long aajgymxup0, byte syrcnufyoz1, double hohzssdce2, double pjanadpp3, int hbysvapp4) {
        int hbysvapp4a = hbysvapp4;
        double pjanadpp3a = pjanadpp3;
        double hohzssdce2a = hohzssdce2;
        byte syrcnufyoz1a = syrcnufyoz1;
        long aajgymxup0a = aajgymxup0;
        Log.e("sMOqUgyF", "sMOqUgyF" + pjanadpp3a + aajgymxup0a + syrcnufyoz1a + hbysvapp4a + hohzssdce2a + "sMOqUgyF" + pZRODbs + vNDhcwp + hPjSfna + sETMgqy + lhfNNZg + xuPiLDw + tEwkbqd + HMZmhTp + EzJXPeo + Kgqzymr + VyshFOt + QAKXFln + lGUorZP + ycvbGUz + HCEHAtW + DpCEstk + "");
    }

    //垃圾方法
    private void RLEkVrWS(int gtsjnekij0, double voongnldq1, boolean nrgaogq2, long pacydxorj3) {
        long pacydxorj3a = pacydxorj3;
        boolean nrgaogq2a = nrgaogq2;
        double voongnldq1a = voongnldq1;
        int gtsjnekij0a = gtsjnekij0;
        Log.i("RLEkVrWS", "RLEkVrWS" + voongnldq1a + nrgaogq2a + gtsjnekij0a + pacydxorj3a + "RLEkVrWS" + ycvbGUz + Kgqzymr + hPjSfna + VyshFOt + lhfNNZg + lGUorZP + DpCEstk + QAKXFln + HCEHAtW + HMZmhTp + sETMgqy + EzJXPeo + vNDhcwp + tEwkbqd + pZRODbs + xuPiLDw + "");
    }

    //垃圾方法
    private void XCNohYOQ(char murmnxytc0, boolean nvocajip1) {
        boolean nvocajip1a = nvocajip1;
        char murmnxytc0a = murmnxytc0;
        TextUtils.isEmpty("XCNohYOQ" + nvocajip1a + murmnxytc0a + "XCNohYOQ" + Kgqzymr + xuPiLDw + HCEHAtW + EzJXPeo + lGUorZP + tEwkbqd + VyshFOt + sETMgqy + ycvbGUz + lhfNNZg + QAKXFln + HMZmhTp + hPjSfna + DpCEstk + pZRODbs + vNDhcwp + "");
    }

    //垃圾方法
    private void pyJAPsbm(short xpmalat0, float inxgvoicwv1, float qhpmhfh2) {
        float qhpmhfh2a = qhpmhfh2;
        float inxgvoicwv1a = inxgvoicwv1;
        short xpmalat0a = xpmalat0;
        Log.i("pyJAPsbm", "pyJAPsbm" + inxgvoicwv1a + xpmalat0a + qhpmhfh2a + "pyJAPsbm" + tEwkbqd + Kgqzymr + VyshFOt + EzJXPeo + DpCEstk + HCEHAtW + hPjSfna + ycvbGUz + QAKXFln + pZRODbs + xuPiLDw + vNDhcwp + HMZmhTp + sETMgqy + lGUorZP + lhfNNZg + "");
    }

    //垃圾方法
    private void WdFrKGND(double zmrjezexa0, double nufyela1) {
        double nufyela1a = nufyela1;
        double zmrjezexa0a = zmrjezexa0;
        new Thread("WdFrKGND" + zmrjezexa0a + nufyela1a + "WdFrKGND" + EzJXPeo + HMZmhTp + Kgqzymr + ycvbGUz + pZRODbs + vNDhcwp + QAKXFln + lhfNNZg + DpCEstk + lGUorZP + VyshFOt + sETMgqy + tEwkbqd + xuPiLDw + hPjSfna + HCEHAtW + "");
    }

    //垃圾方法
    private void kNchWmkk(double tavunzg0, double nlkgykqcz1, int cymbobv2, double rpfryto3, short kjvtixr4) {
        short kjvtixr4a = kjvtixr4;
        double rpfryto3a = rpfryto3;
        int cymbobv2a = cymbobv2;
        double nlkgykqcz1a = nlkgykqcz1;
        double tavunzg0a = tavunzg0;
        TextUtils.isEmpty("kNchWmkk" + rpfryto3a + cymbobv2a + tavunzg0a + kjvtixr4a + nlkgykqcz1a + "kNchWmkk" + pZRODbs + lGUorZP + ycvbGUz + HCEHAtW + HMZmhTp + DpCEstk + hPjSfna + lhfNNZg + EzJXPeo + QAKXFln + sETMgqy + Kgqzymr + tEwkbqd + vNDhcwp + VyshFOt + xuPiLDw + "");
    }

    //垃圾方法
    private void OMNOQPhi(float hocravgt0) {
        float hocravgt0a = hocravgt0;
        new StringBuilder("OMNOQPhi" + hocravgt0a + "OMNOQPhi" + xuPiLDw + DpCEstk + lGUorZP + Kgqzymr + tEwkbqd + lhfNNZg + HCEHAtW + sETMgqy + pZRODbs + ycvbGUz + vNDhcwp + QAKXFln + VyshFOt + HMZmhTp + EzJXPeo + hPjSfna + "");
    }

    //垃圾方法
    private void BBhmeOkm(short uaeelhul0, boolean ptjjgdixgq1) {
        boolean ptjjgdixgq1a = ptjjgdixgq1;
        short uaeelhul0a = uaeelhul0;
        TextUtils.isEmpty("BBhmeOkm" + ptjjgdixgq1a + uaeelhul0a + "BBhmeOkm" + tEwkbqd + Kgqzymr + sETMgqy + DpCEstk + VyshFOt + ycvbGUz + pZRODbs + QAKXFln + vNDhcwp + hPjSfna + lGUorZP + xuPiLDw + EzJXPeo + HMZmhTp + lhfNNZg + HCEHAtW + "");
    }

    //垃圾方法
    private void QNZnZjLg(int hxbfunisg0, double qsnhopyet1, boolean oonsohde2) {
        boolean oonsohde2a = oonsohde2;
        double qsnhopyet1a = qsnhopyet1;
        int hxbfunisg0a = hxbfunisg0;
        TextUtils.isDigitsOnly("QNZnZjLg" + oonsohde2a + qsnhopyet1a + hxbfunisg0a + "QNZnZjLg" + pZRODbs + QAKXFln + xuPiLDw + hPjSfna + HCEHAtW + VyshFOt + vNDhcwp + ycvbGUz + EzJXPeo + sETMgqy + lhfNNZg + Kgqzymr + DpCEstk + tEwkbqd + HMZmhTp + lGUorZP + "");
    }

    //垃圾方法
    private void MCdvjcDp(float vjtssaipp0, byte xoktgvj1, long umoncajiq2, char uccvgklq3) {
        char uccvgklq3a = uccvgklq3;
        long umoncajiq2a = umoncajiq2;
        byte xoktgvj1a = xoktgvj1;
        float vjtssaipp0a = vjtssaipp0;
        new Intent("MCdvjcDp" + uccvgklq3a + xoktgvj1a + vjtssaipp0a + umoncajiq2a + "MCdvjcDp" + VyshFOt + HMZmhTp + hPjSfna + Kgqzymr + QAKXFln + sETMgqy + vNDhcwp + ycvbGUz + lhfNNZg + HCEHAtW + pZRODbs + DpCEstk + lGUorZP + EzJXPeo + tEwkbqd + xuPiLDw + "");
    }

    //垃圾方法
    private void yajqXsis(int tyahivp0) {
        int tyahivp0a = tyahivp0;
        new WeakReference("yajqXsis" + tyahivp0a + "yajqXsis" + HCEHAtW + tEwkbqd + ycvbGUz + VyshFOt + pZRODbs + lGUorZP + lhfNNZg + vNDhcwp + xuPiLDw + sETMgqy + HMZmhTp + EzJXPeo + QAKXFln + hPjSfna + DpCEstk + Kgqzymr + "");
    }

    //垃圾方法
    private void iIMpdzRC(double ujpvcoqnb0, short hrsiedznpo1, double lirkwcuft2, long mowztog3) {
        long mowztog3a = mowztog3;
        double lirkwcuft2a = lirkwcuft2;
        short hrsiedznpo1a = hrsiedznpo1;
        double ujpvcoqnb0a = ujpvcoqnb0;
        new Intent("iIMpdzRC" + mowztog3a + lirkwcuft2a + ujpvcoqnb0a + hrsiedznpo1a + "iIMpdzRC" + QAKXFln + HMZmhTp + HCEHAtW + ycvbGUz + DpCEstk + sETMgqy + EzJXPeo + vNDhcwp + VyshFOt + xuPiLDw + Kgqzymr + lhfNNZg + lGUorZP + hPjSfna + tEwkbqd + pZRODbs + "");
    }

    //垃圾方法
    private void WRxJvIwp(char karjokteum0, byte adgzvwh1, byte ccszbdzecf2) {
        byte ccszbdzecf2a = ccszbdzecf2;
        byte adgzvwh1a = adgzvwh1;
        char karjokteum0a = karjokteum0;
        new AttributedString("WRxJvIwp" + karjokteum0a + adgzvwh1a + ccszbdzecf2a + "WRxJvIwp" + lhfNNZg + vNDhcwp + HCEHAtW + VyshFOt + QAKXFln + DpCEstk + lGUorZP + pZRODbs + EzJXPeo + Kgqzymr + xuPiLDw + HMZmhTp + ycvbGUz + hPjSfna + sETMgqy + tEwkbqd + "");
    }

    public void onCreate() {
        byte ccszbdzecf2 = 26;
        byte adgzvwh1 = 74;
        char karjokteum0 = 93;
        long mowztog3 = 86L;
        double lirkwcuft2 = 59.59;
        short hrsiedznpo1 = 80;
        double ujpvcoqnb0 = 35.35;
        int tyahivp0 = 79;
        char uccvgklq3 = 83;
        long umoncajiq2 = 41L;
        byte xoktgvj1 = 19;
        float vjtssaipp0 = 9.9f;
        boolean oonsohde2 = false;
        double qsnhopyet1 = 25.25;
        int hxbfunisg0 = 86;
        boolean ptjjgdixgq1 = false;
        short uaeelhul0 = 69;
        float hocravgt0 = 86.86f;
        short kjvtixr4 = 22;
        double rpfryto3 = 32.32;
        int cymbobv2 = 90;
        double nlkgykqcz1 = 60.60;
        double tavunzg0 = 6.6;
        double nufyela1 = 93.93;
        double zmrjezexa0 = 10.10;
        float qhpmhfh2 = 78.78f;
        float inxgvoicwv1 = 42.42f;
        short xpmalat0 = 87;
        boolean nvocajip1 = false;
        char murmnxytc0 = 92;
        long pacydxorj3 = 5L;
        boolean nrgaogq2 = true;
        double voongnldq1 = 47.47;
        int gtsjnekij0 = 88;
        int hbysvapp4 = 78;
        double pjanadpp3 = 16.16;
        double hohzssdce2 = 33.33;
        byte syrcnufyoz1 = 14;
        long aajgymxup0 = 56L;
        long hezsudtbz3 = 4L;
        boolean pbphualv2 = true;
        byte sbzoxutgr1 = 35;
        boolean tgsniwlxi0 = true;
        short cytswzotgk4 = 24;
        boolean bzxifnlpye3 = true;
        short rwnfxtkufa2 = 53;
        byte dblmuntmn1 = 0;
        int lpmiecy0 = 57;
        int myuuzipl3 = 16;
        boolean qfpbiyi2 = false;
        boolean owvwxrt1 = true;
        char yythqen0 = 25;
        float utwstvnic1 = 31.31f;
        double exybdyfwb0 = 6.6;
        int pvmunxfkm1 = 19;
        double wjblawm0 = 34.34;
        double qpoiicfh1 = 65.65;
        float qjpgrkzwyk0 = 49.49f;
        float wscktata4 = 32.32f;
        long tjeiaixp3 = 46L;
        long nvutvwjlvb2 = 23L;
        boolean qkeehzsp1 = true;
        long ygjjkmrjmu0 = 30L;
        char rglxgomkmk4 = 79;
        double kalxmlw3 = 7.7;
        boolean qvuvjojm2 = true;
        int ydccqdif1 = 33;
        short oiljcfqtgn0 = 83;
        long oijrhwn0 = 57L;
        char keeeqcd0 = 46;
        double rofyxzf0 = 85.85;
        float oqoyiryzuy2 = 38.38f;
        char tnrgjlbv1 = 63;
        byte kuqulkhl0 = 80;
        byte lylpifpb1 = 47;
        long fcwbian0 = 40L;
        boolean jmcpypwqc3 = false;
        char scoesvsd2 = 1;
        int qzmhtuyuum1 = 58;
        boolean uzadoxg0 = false;
        char uitkxkc2 = 28;
        float fmmlllndd1 = 43.43f;
        double ywntlob0 = 40.40;
        isLiving = true;
        VrRMYGab(yythqen0, owvwxrt1, qfpbiyi2, myuuzipl3);
        MCdvjcDp(vjtssaipp0, xoktgvj1, umoncajiq2, uccvgklq3);
        kNchWmkk(tavunzg0, nlkgykqcz1, cymbobv2, rpfryto3, kjvtixr4);
        super.onCreate();
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        this.mLocalBinder = new LocalBinder(this);
        if (this.mLocalServiceConn == null) {
            iIMpdzRC(ujpvcoqnb0, hrsiedznpo1, lirkwcuft2, mowztog3);
            WRxJvIwp(karjokteum0, adgzvwh1, ccszbdzecf2);
            daSxOFvR(rofyxzf0);
            daSxOFvR(rofyxzf0);
            OFZLyDAk(exybdyfwb0, utwstvnic1);
            pZGMIPhW(lpmiecy0, dblmuntmn1, rwnfxtkufa2, bzxifnlpye3, cytswzotgk4);
            yBWGbMRO(uzadoxg0, qzmhtuyuum1, scoesvsd2, jmcpypwqc3);
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        xmbzLyJR(fcwbian0, lylpifpb1);
        NNNXxIDY(keeeqcd0);
        kNchWmkk(tavunzg0, nlkgykqcz1, cymbobv2, rpfryto3, kjvtixr4);
        pyJAPsbm(xpmalat0, inxgvoicwv1, qhpmhfh2);
        mjbqtNch(qjpgrkzwyk0, qpoiicfh1);
        sMOqUgyF(aajgymxup0, syrcnufyoz1, hohzssdce2, pjanadpp3, hbysvapp4);
        this.startSubService(1, false);
    }

    //垃圾方法
    private void ilDriZkk(long hilcehpj0, int xzniasgmpz1, byte wnkyzut2, float keayotoat3, boolean yqfqrje4) {
        boolean yqfqrje4a = yqfqrje4;
        float keayotoat3a = keayotoat3;
        byte wnkyzut2a = wnkyzut2;
        int xzniasgmpz1a = xzniasgmpz1;
        long hilcehpj0a = hilcehpj0;
        new StringBuilder("ilDriZkk" + keayotoat3a + hilcehpj0a + yqfqrje4a + wnkyzut2a + xzniasgmpz1a + "ilDriZkk" + Kgqzymr + HMZmhTp + VyshFOt + xuPiLDw + ycvbGUz + pZRODbs + vNDhcwp + EzJXPeo + DpCEstk + sETMgqy + lGUorZP + HCEHAtW + QAKXFln + tEwkbqd + hPjSfna + lhfNNZg + "");
    }

    //垃圾方法
    private void AYbUmsDS(long luwscie0, boolean onmvwjzr1, boolean ewrlili2, double denjoww3, double rxwyphsv4) {
        double rxwyphsv4a = rxwyphsv4;
        double denjoww3a = denjoww3;
        boolean ewrlili2a = ewrlili2;
        boolean onmvwjzr1a = onmvwjzr1;
        long luwscie0a = luwscie0;
        new Intent("AYbUmsDS" + onmvwjzr1a + denjoww3a + ewrlili2a + rxwyphsv4a + luwscie0a + "AYbUmsDS" + QAKXFln + HCEHAtW + lhfNNZg + lGUorZP + xuPiLDw + VyshFOt + ycvbGUz + tEwkbqd + DpCEstk + pZRODbs + Kgqzymr + vNDhcwp + HMZmhTp + hPjSfna + sETMgqy + EzJXPeo + "");
    }

    //垃圾方法
    private void cdVoXWyU(double ilymkqnqj0, byte aoqbhufkd1) {
        byte aoqbhufkd1a = aoqbhufkd1;
        double ilymkqnqj0a = ilymkqnqj0;
        new StringBuffer("cdVoXWyU" + ilymkqnqj0a + aoqbhufkd1a + "cdVoXWyU" + lhfNNZg + pZRODbs + VyshFOt + Kgqzymr + hPjSfna + DpCEstk + EzJXPeo + ycvbGUz + HCEHAtW + xuPiLDw + tEwkbqd + vNDhcwp + HMZmhTp + QAKXFln + lGUorZP + sETMgqy + "");
    }

    //垃圾方法
    private void EVtNiizu(double eohootnrc0, char xfrccocskg1) {
        char xfrccocskg1a = xfrccocskg1;
        double eohootnrc0a = eohootnrc0;
        TextUtils.isDigitsOnly("EVtNiizu" + eohootnrc0a + xfrccocskg1a + "EVtNiizu" + xuPiLDw + sETMgqy + HCEHAtW + EzJXPeo + hPjSfna + pZRODbs + lhfNNZg + vNDhcwp + tEwkbqd + QAKXFln + VyshFOt + DpCEstk + HMZmhTp + ycvbGUz + Kgqzymr + lGUorZP + "");
    }

    public void onRebind(Intent intent) {
        char xfrccocskg1 = 66;
        double eohootnrc0 = 43.43;
        byte aoqbhufkd1 = 86;
        double ilymkqnqj0 = 40.40;
        double rxwyphsv4 = 31.31;
        double denjoww3 = 63.63;
        boolean ewrlili2 = false;
        boolean onmvwjzr1 = false;
        long luwscie0 = 92L;
        boolean yqfqrje4 = false;
        float keayotoat3 = 76.76f;
        byte wnkyzut2 = 6;
        int xzniasgmpz1 = 26;
        long hilcehpj0 = 40L;
        cdVoXWyU(ilymkqnqj0, aoqbhufkd1);
        ilDriZkk(hilcehpj0, xzniasgmpz1, wnkyzut2, keayotoat3, yqfqrje4);
        ilDriZkk(hilcehpj0, xzniasgmpz1, wnkyzut2, keayotoat3, yqfqrje4);
        ilDriZkk(hilcehpj0, xzniasgmpz1, wnkyzut2, keayotoat3, yqfqrje4);
        cdVoXWyU(ilymkqnqj0, aoqbhufkd1);
        EVtNiizu(eohootnrc0, xfrccocskg1);
        AYbUmsDS(luwscie0, onmvwjzr1, ewrlili2, denjoww3, rxwyphsv4);
        cdVoXWyU(ilymkqnqj0, aoqbhufkd1);
        EVtNiizu(eohootnrc0, xfrccocskg1);
        EVtNiizu(eohootnrc0, xfrccocskg1);
        super.onRebind(intent);
    }

    //垃圾方法
    private void LFuWJRpa(short qjitfbtvo0, byte mnuseirbia1, short kizdedxutl2, byte mquwnrm3) {
        byte mquwnrm3a = mquwnrm3;
        short kizdedxutl2a = kizdedxutl2;
        byte mnuseirbia1a = mnuseirbia1;
        short qjitfbtvo0a = qjitfbtvo0;
        new File("LFuWJRpa" + kizdedxutl2a + mquwnrm3a + qjitfbtvo0a + mnuseirbia1a + "LFuWJRpa" + ycvbGUz + VyshFOt + Kgqzymr + lhfNNZg + sETMgqy + hPjSfna + DpCEstk + vNDhcwp + lGUorZP + EzJXPeo + pZRODbs + HMZmhTp + tEwkbqd + QAKXFln + xuPiLDw + HCEHAtW + "");
    }

    //垃圾方法
    private void fGKNniwC(short hmssabn0, short qlxnefo1, double dvsycohgaj2, byte iqnydrh3) {
        byte iqnydrh3a = iqnydrh3;
        double dvsycohgaj2a = dvsycohgaj2;
        short qlxnefo1a = qlxnefo1;
        short hmssabn0a = hmssabn0;
        new String("fGKNniwC" + qlxnefo1a + dvsycohgaj2a + iqnydrh3a + hmssabn0a + "fGKNniwC" + hPjSfna + HMZmhTp + ycvbGUz + QAKXFln + lGUorZP + pZRODbs + VyshFOt + sETMgqy + Kgqzymr + HCEHAtW + EzJXPeo + DpCEstk + tEwkbqd + lhfNNZg + xuPiLDw + vNDhcwp + "");
    }

    //垃圾方法
    private void LRIjeQZf(float uaejfmdmt0) {
        float uaejfmdmt0a = uaejfmdmt0;
        TextUtils.isDigitsOnly("LRIjeQZf" + uaejfmdmt0a + "LRIjeQZf" + sETMgqy + lGUorZP + Kgqzymr + lhfNNZg + pZRODbs + xuPiLDw + tEwkbqd + HMZmhTp + hPjSfna + ycvbGUz + DpCEstk + vNDhcwp + QAKXFln + HCEHAtW + VyshFOt + EzJXPeo + "");
    }

    //垃圾方法
    private void KXAjOrGe(double buugockuno0, boolean oiovkin1, boolean ugauthjdr2, char imzfwfbv3) {
        char imzfwfbv3a = imzfwfbv3;
        boolean ugauthjdr2a = ugauthjdr2;
        boolean oiovkin1a = oiovkin1;
        double buugockuno0a = buugockuno0;
        new Intent("KXAjOrGe" + oiovkin1a + imzfwfbv3a + ugauthjdr2a + buugockuno0a + "KXAjOrGe" + HMZmhTp + xuPiLDw + lhfNNZg + lGUorZP + ycvbGUz + vNDhcwp + DpCEstk + QAKXFln + pZRODbs + EzJXPeo + HCEHAtW + VyshFOt + tEwkbqd + sETMgqy + hPjSfna + Kgqzymr + "");
    }

    //垃圾方法
    private void qzgQwSlh(short ystpiflixr0, int caxyuukqm1) {
        int caxyuukqm1a = caxyuukqm1;
        short ystpiflixr0a = ystpiflixr0;
        new StringBuffer("qzgQwSlh" + ystpiflixr0a + caxyuukqm1a + "qzgQwSlh" + hPjSfna + lGUorZP + Kgqzymr + QAKXFln + pZRODbs + tEwkbqd + EzJXPeo + lhfNNZg + ycvbGUz + HMZmhTp + sETMgqy + vNDhcwp + xuPiLDw + VyshFOt + HCEHAtW + DpCEstk + "");
    }

    //垃圾方法
    private void TeCNCuSv(double teaaprsx0, char zkalupfsg1, boolean diiwhfcioj2, long vuurjal3, short jdcicrujg4) {
        short jdcicrujg4a = jdcicrujg4;
        long vuurjal3a = vuurjal3;
        boolean diiwhfcioj2a = diiwhfcioj2;
        char zkalupfsg1a = zkalupfsg1;
        double teaaprsx0a = teaaprsx0;
        TextUtils.isEmpty("TeCNCuSv" + diiwhfcioj2a + zkalupfsg1a + teaaprsx0a + vuurjal3a + jdcicrujg4a + "TeCNCuSv" + Kgqzymr + HCEHAtW + EzJXPeo + xuPiLDw + tEwkbqd + sETMgqy + pZRODbs + VyshFOt + ycvbGUz + lGUorZP + lhfNNZg + vNDhcwp + DpCEstk + hPjSfna + HMZmhTp + QAKXFln + "");
    }

    //垃圾方法
    private void gzRbmJWa(int htsoahgblm0) {
        int htsoahgblm0a = htsoahgblm0;
        new StringReader("gzRbmJWa" + htsoahgblm0a + "gzRbmJWa" + xuPiLDw + hPjSfna + HCEHAtW + lhfNNZg + VyshFOt + pZRODbs + vNDhcwp + Kgqzymr + tEwkbqd + EzJXPeo + sETMgqy + DpCEstk + HMZmhTp + ycvbGUz + lGUorZP + QAKXFln + "");
    }

    //垃圾方法
    private void pRjZoyQF(char utvuwrb0, char ygncpfxihk1, char smxckozm2, int imtfojw3, double yzolobeuh4) {
        double yzolobeuh4a = yzolobeuh4;
        int imtfojw3a = imtfojw3;
        char smxckozm2a = smxckozm2;
        char ygncpfxihk1a = ygncpfxihk1;
        char utvuwrb0a = utvuwrb0;
        new StringBuilder("pRjZoyQF" + imtfojw3a + yzolobeuh4a + ygncpfxihk1a + smxckozm2a + utvuwrb0a + "pRjZoyQF" + vNDhcwp + ycvbGUz + EzJXPeo + tEwkbqd + lGUorZP + sETMgqy + HCEHAtW + lhfNNZg + QAKXFln + hPjSfna + VyshFOt + HMZmhTp + xuPiLDw + pZRODbs + DpCEstk + Kgqzymr + "");
    }

    //垃圾方法
    private void vwaRdanj(short amioqsosok0) {
        short amioqsosok0a = amioqsosok0;
        Log.w("vwaRdanj", "vwaRdanj" + amioqsosok0a + "vwaRdanj" + Kgqzymr + HCEHAtW + hPjSfna + QAKXFln + lhfNNZg + sETMgqy + HMZmhTp + xuPiLDw + DpCEstk + lGUorZP + tEwkbqd + ycvbGUz + vNDhcwp + VyshFOt + pZRODbs + EzJXPeo + "");
    }

    //垃圾方法
    private void qMyXKhha(long czgnlyt0, long lhmqndtl1) {
        long lhmqndtl1a = lhmqndtl1;
        long czgnlyt0a = czgnlyt0;
        TextUtils.isDigitsOnly("qMyXKhha" + lhmqndtl1a + czgnlyt0a + "qMyXKhha" + HMZmhTp + pZRODbs + Kgqzymr + xuPiLDw + tEwkbqd + DpCEstk + hPjSfna + lGUorZP + EzJXPeo + HCEHAtW + ycvbGUz + QAKXFln + VyshFOt + sETMgqy + vNDhcwp + lhfNNZg + "");
    }

    //垃圾方法
    private void nhhGIcrj(byte ccnxuzdlaj0, boolean aiifqqn1) {
        boolean aiifqqn1a = aiifqqn1;
        byte ccnxuzdlaj0a = ccnxuzdlaj0;
        new File("nhhGIcrj" + aiifqqn1a + ccnxuzdlaj0a + "nhhGIcrj" + HCEHAtW + DpCEstk + QAKXFln + sETMgqy + lGUorZP + VyshFOt + lhfNNZg + tEwkbqd + HMZmhTp + ycvbGUz + hPjSfna + EzJXPeo + vNDhcwp + xuPiLDw + pZRODbs + Kgqzymr + "");
    }

    //垃圾方法
    private void mNpPYJLM(boolean juihkmpkkz0, boolean vcwkvmrsj1, char rrdfbuw2, double byhjhoxvz3, int wtysspxg4) {
        int wtysspxg4a = wtysspxg4;
        double byhjhoxvz3a = byhjhoxvz3;
        char rrdfbuw2a = rrdfbuw2;
        boolean vcwkvmrsj1a = vcwkvmrsj1;
        boolean juihkmpkkz0a = juihkmpkkz0;
        TextUtils.isDigitsOnly("mNpPYJLM" + wtysspxg4a + rrdfbuw2a + vcwkvmrsj1a + byhjhoxvz3a + juihkmpkkz0a + "mNpPYJLM" + Kgqzymr + lhfNNZg + xuPiLDw + DpCEstk + vNDhcwp + ycvbGUz + HMZmhTp + QAKXFln + sETMgqy + lGUorZP + HCEHAtW + pZRODbs + EzJXPeo + tEwkbqd + hPjSfna + VyshFOt + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        int wtysspxg4 = 38;
        double byhjhoxvz3 = 63.63;
        char rrdfbuw2 = 50;
        boolean vcwkvmrsj1 = true;
        boolean juihkmpkkz0 = false;
        boolean aiifqqn1 = true;
        byte ccnxuzdlaj0 = 94;
        long lhmqndtl1 = 79L;
        long czgnlyt0 = 54L;
        short amioqsosok0 = 5;
        double yzolobeuh4 = 35.35;
        int imtfojw3 = 63;
        char smxckozm2 = 58;
        char ygncpfxihk1 = 38;
        char utvuwrb0 = 23;
        int htsoahgblm0 = 22;
        short jdcicrujg4 = 70;
        long vuurjal3 = 61L;
        boolean diiwhfcioj2 = true;
        char zkalupfsg1 = 20;
        double teaaprsx0 = 40.40;
        int caxyuukqm1 = 15;
        short ystpiflixr0 = 51;
        char imzfwfbv3 = 60;
        boolean ugauthjdr2 = false;
        boolean oiovkin1 = true;
        double buugockuno0 = 20.20;
        float uaejfmdmt0 = 10.10f;
        byte iqnydrh3 = 28;
        double dvsycohgaj2 = 76.76;
        short qlxnefo1 = 100;
        short hmssabn0 = 100;
        byte mquwnrm3 = 6;
        short kizdedxutl2 = 61;
        byte mnuseirbia1 = 80;
        short qjitfbtvo0 = 70;
        qMyXKhha(czgnlyt0, lhmqndtl1);
        TeCNCuSv(teaaprsx0, zkalupfsg1, diiwhfcioj2, vuurjal3, jdcicrujg4);
        nhhGIcrj(ccnxuzdlaj0, aiifqqn1);
        LFuWJRpa(qjitfbtvo0, mnuseirbia1, kizdedxutl2, mquwnrm3);
        if (intent != null && !isStartService) {
            LFuWJRpa(qjitfbtvo0, mnuseirbia1, kizdedxutl2, mquwnrm3);
            KXAjOrGe(buugockuno0, oiovkin1, ugauthjdr2, imzfwfbv3);
            vwaRdanj(amioqsosok0);
            vwaRdanj(amioqsosok0);
            qMyXKhha(czgnlyt0, lhmqndtl1);
            pRjZoyQF(utvuwrb0, ygncpfxihk1, smxckozm2, imtfojw3, yzolobeuh4);
            mNpPYJLM(juihkmpkkz0, vcwkvmrsj1, rrdfbuw2, byhjhoxvz3, wtysspxg4);
            vwaRdanj(amioqsosok0);
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void vooiYpmh(long zztpmffn0) {
        long zztpmffn0a = zztpmffn0;
        Log.e("vooiYpmh", "vooiYpmh" + zztpmffn0a + "vooiYpmh" + EzJXPeo + pZRODbs + ycvbGUz + Kgqzymr + xuPiLDw + sETMgqy + lGUorZP + QAKXFln + HMZmhTp + lhfNNZg + HCEHAtW + hPjSfna + vNDhcwp + tEwkbqd + VyshFOt + DpCEstk + "");
    }

    //垃圾方法
    private void EnzlmYCD(short ahgatuw0, float nfvgkqkbxu1) {
        float nfvgkqkbxu1a = nfvgkqkbxu1;
        short ahgatuw0a = ahgatuw0;
        TextUtils.isEmpty("EnzlmYCD" + ahgatuw0a + nfvgkqkbxu1a + "EnzlmYCD" + ycvbGUz + HCEHAtW + lGUorZP + VyshFOt + tEwkbqd + lhfNNZg + DpCEstk + HMZmhTp + Kgqzymr + pZRODbs + xuPiLDw + vNDhcwp + sETMgqy + QAKXFln + hPjSfna + EzJXPeo + "");
    }

    //垃圾方法
    private void WTMAYQZx(int jlvqbccvcj0, boolean jmuhnvr1, boolean xcuybfaaw2, float qlatorkmmb3, long emvfjoajbq4) {
        long emvfjoajbq4a = emvfjoajbq4;
        float qlatorkmmb3a = qlatorkmmb3;
        boolean xcuybfaaw2a = xcuybfaaw2;
        boolean jmuhnvr1a = jmuhnvr1;
        int jlvqbccvcj0a = jlvqbccvcj0;
        new Intent("WTMAYQZx" + jmuhnvr1a + jlvqbccvcj0a + xcuybfaaw2a + emvfjoajbq4a + qlatorkmmb3a + "WTMAYQZx" + tEwkbqd + sETMgqy + ycvbGUz + hPjSfna + EzJXPeo + Kgqzymr + HMZmhTp + HCEHAtW + lhfNNZg + lGUorZP + DpCEstk + QAKXFln + xuPiLDw + vNDhcwp + pZRODbs + VyshFOt + "");
    }

    //垃圾方法
    private void fqwuMVyz(boolean dswunzi0, double kckwykrbyy1, char vlyskpkky2) {
        char vlyskpkky2a = vlyskpkky2;
        double kckwykrbyy1a = kckwykrbyy1;
        boolean dswunzi0a = dswunzi0;
        new StringReader("fqwuMVyz" + dswunzi0a + kckwykrbyy1a + vlyskpkky2a + "fqwuMVyz" + lGUorZP + Kgqzymr + hPjSfna + VyshFOt + DpCEstk + ycvbGUz + tEwkbqd + QAKXFln + HMZmhTp + pZRODbs + EzJXPeo + sETMgqy + lhfNNZg + vNDhcwp + xuPiLDw + HCEHAtW + "");
    }

    //垃圾方法
    private void plOubEhr(double rtpfwbut0, float witvwnunb1) {
        float witvwnunb1a = witvwnunb1;
        double rtpfwbut0a = rtpfwbut0;
        new AttributedString("plOubEhr" + rtpfwbut0a + witvwnunb1a + "plOubEhr" + ycvbGUz + hPjSfna + lhfNNZg + lGUorZP + EzJXPeo + HMZmhTp + VyshFOt + sETMgqy + Kgqzymr + DpCEstk + pZRODbs + xuPiLDw + vNDhcwp + tEwkbqd + HCEHAtW + QAKXFln + "");
    }

    //垃圾方法
    private void SRbMXeOY(char pkhahnyg0, byte mwmdgryf1, double bsjneryvvd2, int vzzjfwu3, long wownucbv4) {
        long wownucbv4a = wownucbv4;
        int vzzjfwu3a = vzzjfwu3;
        double bsjneryvvd2a = bsjneryvvd2;
        byte mwmdgryf1a = mwmdgryf1;
        char pkhahnyg0a = pkhahnyg0;
        TextUtils.isDigitsOnly("SRbMXeOY" + mwmdgryf1a + bsjneryvvd2a + wownucbv4a + pkhahnyg0a + vzzjfwu3a + "SRbMXeOY" + xuPiLDw + DpCEstk + QAKXFln + EzJXPeo + sETMgqy + Kgqzymr + ycvbGUz + HMZmhTp + lhfNNZg + hPjSfna + tEwkbqd + VyshFOt + pZRODbs + HCEHAtW + vNDhcwp + lGUorZP + "");
    }

    //垃圾方法
    private void yJghHfhn(long gefhgrgmdc0, int zdpgtfcd1, char ejhwiwwa2, short vlpzziza3) {
        short vlpzziza3a = vlpzziza3;
        char ejhwiwwa2a = ejhwiwwa2;
        int zdpgtfcd1a = zdpgtfcd1;
        long gefhgrgmdc0a = gefhgrgmdc0;
        TextUtils.isDigitsOnly("yJghHfhn" + vlpzziza3a + zdpgtfcd1a + gefhgrgmdc0a + ejhwiwwa2a + "yJghHfhn" + Kgqzymr + vNDhcwp + xuPiLDw + pZRODbs + lhfNNZg + ycvbGUz + lGUorZP + tEwkbqd + hPjSfna + HMZmhTp + HCEHAtW + QAKXFln + DpCEstk + VyshFOt + sETMgqy + EzJXPeo + "");
    }

    //垃圾方法
    private void gsmlccXL(char orcndxse0, boolean phxnrziiqm1) {
        boolean phxnrziiqm1a = phxnrziiqm1;
        char orcndxse0a = orcndxse0;
        Log.i("gsmlccXL", "gsmlccXL" + orcndxse0a + phxnrziiqm1a + "gsmlccXL" + HMZmhTp + VyshFOt + tEwkbqd + HCEHAtW + hPjSfna + vNDhcwp + pZRODbs + DpCEstk + ycvbGUz + Kgqzymr + EzJXPeo + QAKXFln + sETMgqy + lhfNNZg + lGUorZP + xuPiLDw + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        boolean phxnrziiqm1 = true;
        char orcndxse0 = 29;
        short vlpzziza3 = 94;
        char ejhwiwwa2 = 5;
        int zdpgtfcd1 = 15;
        long gefhgrgmdc0 = 78L;
        long wownucbv4 = 91L;
        int vzzjfwu3 = 41;
        double bsjneryvvd2 = 7.7;
        byte mwmdgryf1 = 52;
        char pkhahnyg0 = 48;
        float witvwnunb1 = 69.69f;
        double rtpfwbut0 = 69.69;
        char vlyskpkky2 = 18;
        double kckwykrbyy1 = 57.57;
        boolean dswunzi0 = false;
        long emvfjoajbq4 = 25L;
        float qlatorkmmb3 = 92.92f;
        boolean xcuybfaaw2 = false;
        boolean jmuhnvr1 = false;
        int jlvqbccvcj0 = 77;
        float nfvgkqkbxu1 = 92.92f;
        short ahgatuw0 = 89;
        long zztpmffn0 = 42L;
        EnzlmYCD(ahgatuw0, nfvgkqkbxu1);
        WTMAYQZx(jlvqbccvcj0, jmuhnvr1, xcuybfaaw2, qlatorkmmb3, emvfjoajbq4);
        fqwuMVyz(dswunzi0, kckwykrbyy1, vlyskpkky2);
        vooiYpmh(zztpmffn0);
        SRbMXeOY(pkhahnyg0, mwmdgryf1, bsjneryvvd2, vzzjfwu3, wownucbv4);
        vooiYpmh(zztpmffn0);
        WTMAYQZx(jlvqbccvcj0, jmuhnvr1, xcuybfaaw2, qlatorkmmb3, emvfjoajbq4);
        EnzlmYCD(ahgatuw0, nfvgkqkbxu1);
        WTMAYQZx(jlvqbccvcj0, jmuhnvr1, xcuybfaaw2, qlatorkmmb3, emvfjoajbq4);
        SRbMXeOY(pkhahnyg0, mwmdgryf1, bsjneryvvd2, vzzjfwu3, wownucbv4);
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        return this.mLocalBinder;
    }

    //垃圾方法
    private void FQHgaUpl(double qngagrjtl0, short jvmgtxaj1, byte thoeyqcu2, int owwupfl3, short bzpkklbgf4) {
        short bzpkklbgf4a = bzpkklbgf4;
        int owwupfl3a = owwupfl3;
        byte thoeyqcu2a = thoeyqcu2;
        short jvmgtxaj1a = jvmgtxaj1;
        double qngagrjtl0a = qngagrjtl0;
    }

    //垃圾方法
    private void nCIwgQHn(char yayblduwkp0, byte giokkpou1, float hhjozkei2, boolean hupgjmnge3, byte zkuiikuz4) {
        byte zkuiikuz4a = zkuiikuz4;
        boolean hupgjmnge3a = hupgjmnge3;
        float hhjozkei2a = hhjozkei2;
        byte giokkpou1a = giokkpou1;
        char yayblduwkp0a = yayblduwkp0;
        new WeakReference("nCIwgQHn" + zkuiikuz4a + hhjozkei2a + giokkpou1a + hupgjmnge3a + yayblduwkp0a + "nCIwgQHn" + lhfNNZg + EzJXPeo + Kgqzymr + HMZmhTp + DpCEstk + HCEHAtW + VyshFOt + pZRODbs + QAKXFln + xuPiLDw + lGUorZP + ycvbGUz + vNDhcwp + hPjSfna + sETMgqy + tEwkbqd + "");
    }

    //垃圾方法
    private void TYqWJiXn(long hhnpavbwhb0, short mcauasuyn1) {
        short mcauasuyn1a = mcauasuyn1;
        long hhnpavbwhb0a = hhnpavbwhb0;
        new String("TYqWJiXn" + hhnpavbwhb0a + mcauasuyn1a + "TYqWJiXn" + HCEHAtW + lhfNNZg + sETMgqy + ycvbGUz + Kgqzymr + DpCEstk + EzJXPeo + pZRODbs + xuPiLDw + QAKXFln + lGUorZP + tEwkbqd + hPjSfna + vNDhcwp + HMZmhTp + VyshFOt + "");
    }

    //垃圾方法
    private void jsWjLTIK(short gzsrmnxe0, short gclqvyrf1) {
        short gclqvyrf1a = gclqvyrf1;
        short gzsrmnxe0a = gzsrmnxe0;
        new StringBuilder("jsWjLTIK" + gclqvyrf1a + gzsrmnxe0a + "jsWjLTIK" + EzJXPeo + QAKXFln + lhfNNZg + sETMgqy + pZRODbs + HMZmhTp + tEwkbqd + Kgqzymr + HCEHAtW + vNDhcwp + DpCEstk + VyshFOt + lGUorZP + ycvbGUz + xuPiLDw + hPjSfna + "");
    }

    //垃圾方法
    private void LtaYlLpE(double mtjaxoutmd0, float qctduljlgc1) {
        float qctduljlgc1a = qctduljlgc1;
        double mtjaxoutmd0a = mtjaxoutmd0;
        new File("LtaYlLpE" + mtjaxoutmd0a + qctduljlgc1a + "LtaYlLpE" + hPjSfna + sETMgqy + pZRODbs + xuPiLDw + vNDhcwp + EzJXPeo + tEwkbqd + QAKXFln + lhfNNZg + HMZmhTp + DpCEstk + Kgqzymr + ycvbGUz + HCEHAtW + VyshFOt + lGUorZP + "");
    }

    //垃圾方法
    private void icvdhnYq(int kbqqdmviai0) {
        int kbqqdmviai0a = kbqqdmviai0;
        Log.w("icvdhnYq", "icvdhnYq" + kbqqdmviai0a + "icvdhnYq" + sETMgqy + HMZmhTp + lGUorZP + VyshFOt + pZRODbs + ycvbGUz + DpCEstk + vNDhcwp + xuPiLDw + HCEHAtW + Kgqzymr + QAKXFln + tEwkbqd + lhfNNZg + hPjSfna + EzJXPeo + "");
    }

    //垃圾方法
    private void TjdgQWBX(char tocpiqkgui0, float fvxlfdhv1, boolean bgeifvx2) {
        boolean bgeifvx2a = bgeifvx2;
        float fvxlfdhv1a = fvxlfdhv1;
        char tocpiqkgui0a = tocpiqkgui0;
        new StringBuilder("TjdgQWBX" + tocpiqkgui0a + fvxlfdhv1a + bgeifvx2a + "TjdgQWBX" + lhfNNZg + EzJXPeo + VyshFOt + tEwkbqd + DpCEstk + hPjSfna + ycvbGUz + HCEHAtW + HMZmhTp + lGUorZP + Kgqzymr + QAKXFln + vNDhcwp + xuPiLDw + sETMgqy + pZRODbs + "");
    }

    //垃圾方法
    private void MDLiALdV(boolean chizfru0, short exorrbg1, int onxiagvo2, double cmkitgg3, int hfvnfcjdoy4) {
        int hfvnfcjdoy4a = hfvnfcjdoy4;
        double cmkitgg3a = cmkitgg3;
        int onxiagvo2a = onxiagvo2;
        short exorrbg1a = exorrbg1;
        boolean chizfru0a = chizfru0;
        System.out.println("MDLiALdV" + cmkitgg3a + onxiagvo2a + chizfru0a + hfvnfcjdoy4a + exorrbg1a + "MDLiALdV" + lhfNNZg + lGUorZP + vNDhcwp + HCEHAtW + xuPiLDw + sETMgqy + tEwkbqd + QAKXFln + hPjSfna + DpCEstk + HMZmhTp + VyshFOt + Kgqzymr + ycvbGUz + pZRODbs + EzJXPeo + "");
    }

    //垃圾方法
    private void jtHvcFOv(double iqnsdeqdz0, double gditrbegba1, double jqmwngah2) {
        double jqmwngah2a = jqmwngah2;
        double gditrbegba1a = gditrbegba1;
        double iqnsdeqdz0a = iqnsdeqdz0;
        new Intent("jtHvcFOv" + jqmwngah2a + iqnsdeqdz0a + gditrbegba1a + "jtHvcFOv" + hPjSfna + pZRODbs + HCEHAtW + tEwkbqd + lhfNNZg + EzJXPeo + QAKXFln + sETMgqy + HMZmhTp + xuPiLDw + ycvbGUz + VyshFOt + Kgqzymr + DpCEstk + vNDhcwp + lGUorZP + "");
    }

    //垃圾方法
    private void CoUSLxNA(short wotrtxf0, boolean uraoahh1, byte tkpjohl2, short edthncihe3, double szbxmlezca4) {
        double szbxmlezca4a = szbxmlezca4;
        short edthncihe3a = edthncihe3;
        byte tkpjohl2a = tkpjohl2;
        boolean uraoahh1a = uraoahh1;
        short wotrtxf0a = wotrtxf0;
        new File("CoUSLxNA" + szbxmlezca4a + edthncihe3a + tkpjohl2a + uraoahh1a + wotrtxf0a + "CoUSLxNA" + hPjSfna + HMZmhTp + xuPiLDw + QAKXFln + ycvbGUz + lhfNNZg + VyshFOt + sETMgqy + vNDhcwp + HCEHAtW + pZRODbs + EzJXPeo + Kgqzymr + lGUorZP + tEwkbqd + DpCEstk + "");
    }

    //垃圾方法
    private void yetRShcU(long kbpwsdnh0, float iznycdqemq1, long syvtfzgid2) {
        long syvtfzgid2a = syvtfzgid2;
        float iznycdqemq1a = iznycdqemq1;
        long kbpwsdnh0a = kbpwsdnh0;
        new String("yetRShcU" + iznycdqemq1a + kbpwsdnh0a + syvtfzgid2a + "yetRShcU" + lGUorZP + pZRODbs + xuPiLDw + hPjSfna + lhfNNZg + Kgqzymr + DpCEstk + VyshFOt + EzJXPeo + ycvbGUz + sETMgqy + tEwkbqd + HMZmhTp + vNDhcwp + HCEHAtW + QAKXFln + "");
    }

    //垃圾方法
    private void gOrKbfSN(short cebfnhixi0, byte nwrxylwpbp1, short xmvvbik2) {
        short xmvvbik2a = xmvvbik2;
        byte nwrxylwpbp1a = nwrxylwpbp1;
        short cebfnhixi0a = cebfnhixi0;
        new StringBuffer("gOrKbfSN" + xmvvbik2a + nwrxylwpbp1a + cebfnhixi0a + "gOrKbfSN" + ycvbGUz + VyshFOt + EzJXPeo + HMZmhTp + QAKXFln + hPjSfna + vNDhcwp + pZRODbs + sETMgqy + lGUorZP + HCEHAtW + tEwkbqd + lhfNNZg + Kgqzymr + xuPiLDw + DpCEstk + "");
    }

    //垃圾方法
    private void dydDmNKS(boolean fnibiji0, short qcwdbllufs1, byte hnftsgpyg2) {
        byte hnftsgpyg2a = hnftsgpyg2;
        short qcwdbllufs1a = qcwdbllufs1;
        boolean fnibiji0a = fnibiji0;
        TextUtils.isDigitsOnly("dydDmNKS" + fnibiji0a + hnftsgpyg2a + qcwdbllufs1a + "dydDmNKS" + tEwkbqd + EzJXPeo + xuPiLDw + HMZmhTp + DpCEstk + VyshFOt + sETMgqy + ycvbGUz + hPjSfna + pZRODbs + Kgqzymr + vNDhcwp + lhfNNZg + HCEHAtW + lGUorZP + QAKXFln + "");
    }

    //垃圾方法
    private void cxCKkHnk(int cuvwnsu0, int ejaiaes1) {
        int ejaiaes1a = ejaiaes1;
        int cuvwnsu0a = cuvwnsu0;
        System.out.println("cxCKkHnk" + cuvwnsu0a + ejaiaes1a + "cxCKkHnk" + sETMgqy + vNDhcwp + DpCEstk + Kgqzymr + ycvbGUz + xuPiLDw + tEwkbqd + pZRODbs + lGUorZP + VyshFOt + lhfNNZg + HCEHAtW + hPjSfna + EzJXPeo + QAKXFln + HMZmhTp + "");
    }

    //垃圾方法
    private void UJduDkfH(short wefarmcpx0, char jzsvbep1, short fhauuym2, float oumqgjjlds3) {
        float oumqgjjlds3a = oumqgjjlds3;
        short fhauuym2a = fhauuym2;
        char jzsvbep1a = jzsvbep1;
        short wefarmcpx0a = wefarmcpx0;
        Log.w("UJduDkfH", "UJduDkfH" + oumqgjjlds3a + jzsvbep1a + fhauuym2a + wefarmcpx0a + "UJduDkfH" + DpCEstk + Kgqzymr + lGUorZP + lhfNNZg + xuPiLDw + ycvbGUz + tEwkbqd + EzJXPeo + pZRODbs + HCEHAtW + sETMgqy + vNDhcwp + QAKXFln + VyshFOt + HMZmhTp + hPjSfna + "");
    }

    //垃圾方法
    private void YJsLukhT(long jpvuoyfsp0, double ykyuugxsj1) {
        double ykyuugxsj1a = ykyuugxsj1;
        long jpvuoyfsp0a = jpvuoyfsp0;
        TextUtils.isDigitsOnly("YJsLukhT" + jpvuoyfsp0a + ykyuugxsj1a + "YJsLukhT" + ycvbGUz + lGUorZP + HCEHAtW + hPjSfna + pZRODbs + QAKXFln + tEwkbqd + HMZmhTp + vNDhcwp + xuPiLDw + DpCEstk + Kgqzymr + lhfNNZg + EzJXPeo + sETMgqy + VyshFOt + "");
    }

    //垃圾方法
    private void ncuYvobv(double xdvuyhp0, float dfdtmxu1, short ektkzbbj2, char bzofkkhbza3, boolean geuchmpyxg4) {
        boolean geuchmpyxg4a = geuchmpyxg4;
        char bzofkkhbza3a = bzofkkhbza3;
        short ektkzbbj2a = ektkzbbj2;
        float dfdtmxu1a = dfdtmxu1;
        double xdvuyhp0a = xdvuyhp0;
        TextUtils.isDigitsOnly("ncuYvobv" + geuchmpyxg4a + bzofkkhbza3a + dfdtmxu1a + ektkzbbj2a + xdvuyhp0a + "ncuYvobv" + lGUorZP + tEwkbqd + pZRODbs + lhfNNZg + VyshFOt + HCEHAtW + hPjSfna + ycvbGUz + QAKXFln + DpCEstk + HMZmhTp + sETMgqy + vNDhcwp + Kgqzymr + EzJXPeo + xuPiLDw + "");
    }

    //垃圾方法
    private void mUKbcAUS(int ymnkkxtm0, int nbctuegixy1, float ruzsdyhimm2) {
        float ruzsdyhimm2a = ruzsdyhimm2;
        int nbctuegixy1a = nbctuegixy1;
        int ymnkkxtm0a = ymnkkxtm0;
        new Thread("mUKbcAUS" + nbctuegixy1a + ruzsdyhimm2a + ymnkkxtm0a + "mUKbcAUS" + EzJXPeo + vNDhcwp + lGUorZP + sETMgqy + DpCEstk + xuPiLDw + tEwkbqd + lhfNNZg + ycvbGUz + QAKXFln + VyshFOt + HCEHAtW + hPjSfna + HMZmhTp + Kgqzymr + pZRODbs + "");
    }

    //垃圾方法
    private void redFSpjH(char jutcfhvy0, float nnhdiim1) {
        float nnhdiim1a = nnhdiim1;
        char jutcfhvy0a = jutcfhvy0;
        TextUtils.isEmpty("redFSpjH" + nnhdiim1a + jutcfhvy0a + "redFSpjH" + HCEHAtW + hPjSfna + lGUorZP + pZRODbs + Kgqzymr + sETMgqy + VyshFOt + DpCEstk + vNDhcwp + xuPiLDw + ycvbGUz + EzJXPeo + lhfNNZg + QAKXFln + tEwkbqd + HMZmhTp + "");
    }

    //垃圾方法
    private void gfxdKIKQ(boolean gnahlbioux0, double jmrciuo1) {
        double jmrciuo1a = jmrciuo1;
        boolean gnahlbioux0a = gnahlbioux0;
        new WeakReference("gfxdKIKQ" + jmrciuo1a + gnahlbioux0a + "gfxdKIKQ" + hPjSfna + vNDhcwp + HMZmhTp + QAKXFln + lhfNNZg + tEwkbqd + HCEHAtW + Kgqzymr + lGUorZP + xuPiLDw + EzJXPeo + VyshFOt + sETMgqy + pZRODbs + DpCEstk + ycvbGUz + "");
    }

    public void onDestroy() {
        double jmrciuo1 = 37.37;
        boolean gnahlbioux0 = true;
        float nnhdiim1 = 56.56f;
        char jutcfhvy0 = 73;
        float ruzsdyhimm2 = 29.29f;
        int nbctuegixy1 = 50;
        int ymnkkxtm0 = 14;
        boolean geuchmpyxg4 = true;
        char bzofkkhbza3 = 18;
        short ektkzbbj2 = 88;
        float dfdtmxu1 = 80.80f;
        double xdvuyhp0 = 74.74;
        double ykyuugxsj1 = 51.51;
        long jpvuoyfsp0 = 21L;
        float oumqgjjlds3 = 82.82f;
        short fhauuym2 = 43;
        char jzsvbep1 = 30;
        short wefarmcpx0 = 76;
        int ejaiaes1 = 90;
        int cuvwnsu0 = 91;
        byte hnftsgpyg2 = 2;
        short qcwdbllufs1 = 57;
        boolean fnibiji0 = true;
        short xmvvbik2 = 72;
        byte nwrxylwpbp1 = 28;
        short cebfnhixi0 = 10;
        long syvtfzgid2 = 73L;
        float iznycdqemq1 = 69.69f;
        long kbpwsdnh0 = 25L;
        double szbxmlezca4 = 73.73;
        short edthncihe3 = 49;
        byte tkpjohl2 = 11;
        boolean uraoahh1 = false;
        short wotrtxf0 = 42;
        double jqmwngah2 = 66.66;
        double gditrbegba1 = 80.80;
        double iqnsdeqdz0 = 78.78;
        int hfvnfcjdoy4 = 53;
        double cmkitgg3 = 77.77;
        int onxiagvo2 = 85;
        short exorrbg1 = 56;
        boolean chizfru0 = false;
        boolean bgeifvx2 = false;
        float fvxlfdhv1 = 96.96f;
        char tocpiqkgui0 = 10;
        int kbqqdmviai0 = 83;
        float qctduljlgc1 = 94.94f;
        double mtjaxoutmd0 = 4.4;
        short gclqvyrf1 = 54;
        short gzsrmnxe0 = 74;
        short mcauasuyn1 = 85;
        long hhnpavbwhb0 = 63L;
        byte zkuiikuz4 = 74;
        boolean hupgjmnge3 = false;
        float hhjozkei2 = 81.81f;
        byte giokkpou1 = 100;
        char yayblduwkp0 = 64;
        short bzpkklbgf4 = 74;
        int owwupfl3 = 37;
        byte thoeyqcu2 = 74;
        short jvmgtxaj1 = 22;
        double qngagrjtl0 = 8.8;
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        cxCKkHnk(cuvwnsu0, ejaiaes1);
        redFSpjH(jutcfhvy0, nnhdiim1);
        gOrKbfSN(cebfnhixi0, nwrxylwpbp1, xmvvbik2);
        isStartService = false;
        isLiving = false;
        isReTryBinding = false;
    }

    //垃圾方法
    private void DokRTVMM(int qmegfedbx0, byte rsiyiwhyqk1) {
        byte rsiyiwhyqk1a = rsiyiwhyqk1;
        int qmegfedbx0a = qmegfedbx0;
        new Intent("DokRTVMM" + qmegfedbx0a + rsiyiwhyqk1a + "DokRTVMM" + ycvbGUz + vNDhcwp + HCEHAtW + VyshFOt + xuPiLDw + DpCEstk + lGUorZP + pZRODbs + lhfNNZg + QAKXFln + HMZmhTp + Kgqzymr + sETMgqy + tEwkbqd + EzJXPeo + hPjSfna + "");
    }

    //垃圾方法
    private void vQgarLXz(byte zakugxyplq0) {
        byte zakugxyplq0a = zakugxyplq0;
        new Thread("vQgarLXz" + zakugxyplq0a + "vQgarLXz" + HMZmhTp + VyshFOt + QAKXFln + pZRODbs + lhfNNZg + tEwkbqd + vNDhcwp + EzJXPeo + xuPiLDw + lGUorZP + sETMgqy + DpCEstk + ycvbGUz + hPjSfna + Kgqzymr + HCEHAtW + "");
    }

    //垃圾方法
    private void wXUgUVzl(long yrblagjeum0, float lkswcdoa1) {
        float lkswcdoa1a = lkswcdoa1;
        long yrblagjeum0a = yrblagjeum0;
        new String("wXUgUVzl" + lkswcdoa1a + yrblagjeum0a + "wXUgUVzl" + DpCEstk + EzJXPeo + xuPiLDw + sETMgqy + ycvbGUz + pZRODbs + vNDhcwp + lhfNNZg + HMZmhTp + HCEHAtW + VyshFOt + lGUorZP + hPjSfna + Kgqzymr + QAKXFln + tEwkbqd + "");
    }

    //垃圾方法
    private void MznQDqYt(char bghirzbj0, float lqepkue1) {
        float lqepkue1a = lqepkue1;
        char bghirzbj0a = bghirzbj0;
        Log.i("MznQDqYt", "MznQDqYt" + lqepkue1a + bghirzbj0a + "MznQDqYt" + lhfNNZg + tEwkbqd + sETMgqy + DpCEstk + xuPiLDw + Kgqzymr + ycvbGUz + lGUorZP + HCEHAtW + EzJXPeo + VyshFOt + HMZmhTp + pZRODbs + QAKXFln + hPjSfna + vNDhcwp + "");
    }

    //垃圾方法
    private void uePiyUDg(float igqikpm0, boolean zycakjko1, boolean qjfjtbx2) {
        boolean qjfjtbx2a = qjfjtbx2;
        boolean zycakjko1a = zycakjko1;
        float igqikpm0a = igqikpm0;
        Log.e("uePiyUDg", "uePiyUDg" + qjfjtbx2a + zycakjko1a + igqikpm0a + "uePiyUDg" + DpCEstk + hPjSfna + HCEHAtW + HMZmhTp + xuPiLDw + QAKXFln + Kgqzymr + tEwkbqd + vNDhcwp + ycvbGUz + sETMgqy + lGUorZP + VyshFOt + lhfNNZg + pZRODbs + EzJXPeo + "");
    }

    //垃圾方法
    private void MZGRioJC(int vmiyibx0, boolean evtzoysscu1, boolean uczecumxy2, byte uvkzudmqun3, char pvfklbvk4) {
        char pvfklbvk4a = pvfklbvk4;
        byte uvkzudmqun3a = uvkzudmqun3;
        boolean uczecumxy2a = uczecumxy2;
        boolean evtzoysscu1a = evtzoysscu1;
        int vmiyibx0a = vmiyibx0;
        new WeakReference("MZGRioJC" + uczecumxy2a + evtzoysscu1a + pvfklbvk4a + vmiyibx0a + uvkzudmqun3a + "MZGRioJC" + lhfNNZg + pZRODbs + vNDhcwp + tEwkbqd + Kgqzymr + VyshFOt + sETMgqy + QAKXFln + lGUorZP + EzJXPeo + hPjSfna + ycvbGUz + HCEHAtW + DpCEstk + HMZmhTp + xuPiLDw + "");
    }

    //垃圾方法
    private void XrLbhwqA(double wkzdcgqfrb0) {
        double wkzdcgqfrb0a = wkzdcgqfrb0;
        TextUtils.isDigitsOnly("XrLbhwqA" + wkzdcgqfrb0a + "XrLbhwqA" + lhfNNZg + tEwkbqd + ycvbGUz + hPjSfna + sETMgqy + vNDhcwp + pZRODbs + EzJXPeo + Kgqzymr + HCEHAtW + xuPiLDw + lGUorZP + DpCEstk + VyshFOt + HMZmhTp + QAKXFln + "");
    }

    //垃圾方法
    private void RNTxGpsY(short nfylhfrgc0) {
        short nfylhfrgc0a = nfylhfrgc0;
        TextUtils.isDigitsOnly("RNTxGpsY" + nfylhfrgc0a + "RNTxGpsY" + DpCEstk + vNDhcwp + xuPiLDw + Kgqzymr + tEwkbqd + sETMgqy + hPjSfna + VyshFOt + lhfNNZg + HCEHAtW + QAKXFln + lGUorZP + ycvbGUz + HMZmhTp + pZRODbs + EzJXPeo + "");
    }

    public boolean onUnbind(Intent intent) {
        short nfylhfrgc0 = 9;
        double wkzdcgqfrb0 = 47.47;
        char pvfklbvk4 = 75;
        byte uvkzudmqun3 = 69;
        boolean uczecumxy2 = false;
        boolean evtzoysscu1 = false;
        int vmiyibx0 = 94;
        boolean qjfjtbx2 = true;
        boolean zycakjko1 = true;
        float igqikpm0 = 94.94f;
        float lqepkue1 = 80.80f;
        char bghirzbj0 = 74;
        float lkswcdoa1 = 85.85f;
        long yrblagjeum0 = 11L;
        byte zakugxyplq0 = 86;
        byte rsiyiwhyqk1 = 76;
        int qmegfedbx0 = 91;
        MZGRioJC(vmiyibx0, evtzoysscu1, uczecumxy2, uvkzudmqun3, pvfklbvk4);
        XrLbhwqA(wkzdcgqfrb0);
        uePiyUDg(igqikpm0, zycakjko1, qjfjtbx2);
        DokRTVMM(qmegfedbx0, rsiyiwhyqk1);
        vQgarLXz(zakugxyplq0);
        wXUgUVzl(yrblagjeum0, lkswcdoa1);
        if (RecoverOrgManager.isDebug) {
            vQgarLXz(zakugxyplq0);
            wXUgUVzl(yrblagjeum0, lkswcdoa1);
            uePiyUDg(igqikpm0, zycakjko1, qjfjtbx2);
            MznQDqYt(bghirzbj0, lqepkue1);
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        vQgarLXz(zakugxyplq0);
        uePiyUDg(igqikpm0, zycakjko1, qjfjtbx2);
        MznQDqYt(bghirzbj0, lqepkue1);
        MZGRioJC(vmiyibx0, evtzoysscu1, uczecumxy2, uvkzudmqun3, pvfklbvk4);
        uePiyUDg(igqikpm0, zycakjko1, qjfjtbx2);
        DokRTVMM(qmegfedbx0, rsiyiwhyqk1);
        MZGRioJC(vmiyibx0, evtzoysscu1, uczecumxy2, uvkzudmqun3, pvfklbvk4);
        XrLbhwqA(wkzdcgqfrb0);
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void Aiybqfno(boolean cyhmiabbz0, double yejlwcex1, byte pvaruoa2, byte kstztaebmg3) {
        byte kstztaebmg3a = kstztaebmg3;
        byte pvaruoa2a = pvaruoa2;
        double yejlwcex1a = yejlwcex1;
        boolean cyhmiabbz0a = cyhmiabbz0;
        System.out.println("Aiybqfno" + kstztaebmg3a + yejlwcex1a + pvaruoa2a + cyhmiabbz0a + "Aiybqfno" + lhfNNZg + hPjSfna + sETMgqy + EzJXPeo + vNDhcwp + HMZmhTp + ycvbGUz + DpCEstk + HCEHAtW + QAKXFln + tEwkbqd + VyshFOt + pZRODbs + xuPiLDw + Kgqzymr + lGUorZP + "");
    }

    //垃圾方法
    private void HbFhvipS(float qhxeezrw0, int nyroxfd1, boolean nvjfrevyvq2, double mnbudshz3) {
        double mnbudshz3a = mnbudshz3;
        boolean nvjfrevyvq2a = nvjfrevyvq2;
        int nyroxfd1a = nyroxfd1;
        float qhxeezrw0a = qhxeezrw0;
        new StringBuffer("HbFhvipS" + nyroxfd1a + qhxeezrw0a + nvjfrevyvq2a + mnbudshz3a + "HbFhvipS" + Kgqzymr + VyshFOt + tEwkbqd + lGUorZP + ycvbGUz + DpCEstk + hPjSfna + vNDhcwp + xuPiLDw + sETMgqy + EzJXPeo + HMZmhTp + lhfNNZg + HCEHAtW + pZRODbs + QAKXFln + "");
    }

    //垃圾方法
    private void FnCdrWwT(byte uxpxckqvox0, double whrhqmkajk1, float rfldjimq2, char fnlfckuktb3) {
        char fnlfckuktb3a = fnlfckuktb3;
        float rfldjimq2a = rfldjimq2;
        double whrhqmkajk1a = whrhqmkajk1;
        byte uxpxckqvox0a = uxpxckqvox0;
        new String("FnCdrWwT" + rfldjimq2a + uxpxckqvox0a + whrhqmkajk1a + fnlfckuktb3a + "FnCdrWwT" + xuPiLDw + ycvbGUz + lhfNNZg + vNDhcwp + pZRODbs + VyshFOt + tEwkbqd + EzJXPeo + HMZmhTp + HCEHAtW + hPjSfna + lGUorZP + sETMgqy + QAKXFln + Kgqzymr + DpCEstk + "");
    }

    //垃圾方法
    private void emEfmrmK(boolean xisbtxo0, byte dvfhqaujo1, int xkzrbssrg2) {
        int xkzrbssrg2a = xkzrbssrg2;
        byte dvfhqaujo1a = dvfhqaujo1;
        boolean xisbtxo0a = xisbtxo0;
        new StringReader("emEfmrmK" + xisbtxo0a + xkzrbssrg2a + dvfhqaujo1a + "emEfmrmK" + vNDhcwp + xuPiLDw + QAKXFln + tEwkbqd + lGUorZP + hPjSfna + ycvbGUz + EzJXPeo + HCEHAtW + HMZmhTp + Kgqzymr + sETMgqy + pZRODbs + DpCEstk + VyshFOt + lhfNNZg + "");
    }

    private boolean isSubBinderAlive() {
        int xkzrbssrg2 = 76;
        byte dvfhqaujo1 = 60;
        boolean xisbtxo0 = true;
        char fnlfckuktb3 = 42;
        float rfldjimq2 = 29.29f;
        double whrhqmkajk1 = 60.60;
        byte uxpxckqvox0 = 37;
        double mnbudshz3 = 70.70;
        boolean nvjfrevyvq2 = false;
        int nyroxfd1 = 18;
        float qhxeezrw0 = 30.30f;
        byte kstztaebmg3 = 25;
        byte pvaruoa2 = 59;
        double yejlwcex1 = 62.62;
        boolean cyhmiabbz0 = false;
        FnCdrWwT(uxpxckqvox0, whrhqmkajk1, rfldjimq2, fnlfckuktb3);
        emEfmrmK(xisbtxo0, dvfhqaujo1, xkzrbssrg2);
        emEfmrmK(xisbtxo0, dvfhqaujo1, xkzrbssrg2);
        Aiybqfno(cyhmiabbz0, yejlwcex1, pvaruoa2, kstztaebmg3);
        HbFhvipS(qhxeezrw0, nyroxfd1, nvjfrevyvq2, mnbudshz3);
        FnCdrWwT(uxpxckqvox0, whrhqmkajk1, rfldjimq2, fnlfckuktb3);
        FnCdrWwT(uxpxckqvox0, whrhqmkajk1, rfldjimq2, fnlfckuktb3);
        FnCdrWwT(uxpxckqvox0, whrhqmkajk1, rfldjimq2, fnlfckuktb3);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void QYziEnxM(short vkmppxth0, byte alfnhysls1, long yzxptegs2, boolean tgnyacp3, float osvozpyj4) {
        float osvozpyj4a = osvozpyj4;
        boolean tgnyacp3a = tgnyacp3;
        long yzxptegs2a = yzxptegs2;
        byte alfnhysls1a = alfnhysls1;
        short vkmppxth0a = vkmppxth0;
        Log.i("QYziEnxM", "QYziEnxM" + osvozpyj4a + tgnyacp3a + yzxptegs2a + alfnhysls1a + vkmppxth0a + "QYziEnxM" + tEwkbqd + vNDhcwp + QAKXFln + DpCEstk + xuPiLDw + VyshFOt + hPjSfna + pZRODbs + sETMgqy + lhfNNZg + ycvbGUz + HMZmhTp + lGUorZP + Kgqzymr + HCEHAtW + EzJXPeo + "");
    }

    //垃圾方法
    private void OYggsJZP(short hhxqrvs0) {
        short hhxqrvs0a = hhxqrvs0;
        new StringReader("OYggsJZP" + hhxqrvs0a + "OYggsJZP" + DpCEstk + VyshFOt + HMZmhTp + pZRODbs + EzJXPeo + QAKXFln + vNDhcwp + lGUorZP + ycvbGUz + hPjSfna + xuPiLDw + Kgqzymr + lhfNNZg + tEwkbqd + sETMgqy + HCEHAtW + "");
    }

    //垃圾方法
    private void ZKIHoBPB(long bshdjgah0, char euizwdbs1) {
        char euizwdbs1a = euizwdbs1;
        long bshdjgah0a = bshdjgah0;
        TextUtils.isEmpty("ZKIHoBPB" + euizwdbs1a + bshdjgah0a + "ZKIHoBPB" + hPjSfna + ycvbGUz + pZRODbs + vNDhcwp + tEwkbqd + Kgqzymr + HCEHAtW + HMZmhTp + VyshFOt + lGUorZP + sETMgqy + xuPiLDw + lhfNNZg + DpCEstk + QAKXFln + EzJXPeo + "");
    }

    //垃圾方法
    private void HoQjMHTs(short usyhpcg0, short qkwmybuow1, double cedtfztyy2) {
        double cedtfztyy2a = cedtfztyy2;
        short qkwmybuow1a = qkwmybuow1;
        short usyhpcg0a = usyhpcg0;
        System.out.println("HoQjMHTs" + qkwmybuow1a + cedtfztyy2a + usyhpcg0a + "HoQjMHTs" + lhfNNZg + xuPiLDw + DpCEstk + QAKXFln + hPjSfna + VyshFOt + vNDhcwp + HMZmhTp + pZRODbs + tEwkbqd + EzJXPeo + HCEHAtW + lGUorZP + Kgqzymr + ycvbGUz + sETMgqy + "");
    }

    //垃圾方法
    private void sQGZGeIu(char pxitdlyorv0, short mguzcjpkr1, int yudgffs2, int rsircyteoq3) {
        int rsircyteoq3a = rsircyteoq3;
        int yudgffs2a = yudgffs2;
        short mguzcjpkr1a = mguzcjpkr1;
        char pxitdlyorv0a = pxitdlyorv0;
        new File("sQGZGeIu" + rsircyteoq3a + mguzcjpkr1a + pxitdlyorv0a + yudgffs2a + "sQGZGeIu" + DpCEstk + lhfNNZg + sETMgqy + tEwkbqd + xuPiLDw + HCEHAtW + Kgqzymr + hPjSfna + pZRODbs + ycvbGUz + VyshFOt + EzJXPeo + vNDhcwp + lGUorZP + QAKXFln + HMZmhTp + "");
    }

    //垃圾方法
    private void ZElQwRXM(char bnwlmsfzpr0, double tgrkmhnt1, float qjpblhnwcf2, byte httvmpo3, boolean pxghjxji4) {
        boolean pxghjxji4a = pxghjxji4;
        byte httvmpo3a = httvmpo3;
        float qjpblhnwcf2a = qjpblhnwcf2;
        double tgrkmhnt1a = tgrkmhnt1;
        char bnwlmsfzpr0a = bnwlmsfzpr0;
        new Intent("ZElQwRXM" + bnwlmsfzpr0a + pxghjxji4a + qjpblhnwcf2a + httvmpo3a + tgrkmhnt1a + "ZElQwRXM" + sETMgqy + EzJXPeo + hPjSfna + HCEHAtW + vNDhcwp + VyshFOt + ycvbGUz + DpCEstk + lGUorZP + tEwkbqd + pZRODbs + QAKXFln + Kgqzymr + xuPiLDw + HMZmhTp + lhfNNZg + "");
    }

    //垃圾方法
    private void aZQMYuyF(long umdfsxex0, float ffdkskxdp1) {
        float ffdkskxdp1a = ffdkskxdp1;
        long umdfsxex0a = umdfsxex0;
        Log.w("aZQMYuyF", "aZQMYuyF" + ffdkskxdp1a + umdfsxex0a + "aZQMYuyF" + HCEHAtW + EzJXPeo + Kgqzymr + ycvbGUz + lhfNNZg + QAKXFln + xuPiLDw + tEwkbqd + pZRODbs + DpCEstk + sETMgqy + hPjSfna + VyshFOt + HMZmhTp + vNDhcwp + lGUorZP + "");
    }

    //垃圾方法
    private void fnDczXTj(boolean wqcirxgqs0, long hkudkuibx1) {
        long hkudkuibx1a = hkudkuibx1;
        boolean wqcirxgqs0a = wqcirxgqs0;
        new WeakReference("fnDczXTj" + hkudkuibx1a + wqcirxgqs0a + "fnDczXTj" + sETMgqy + tEwkbqd + lhfNNZg + VyshFOt + pZRODbs + vNDhcwp + hPjSfna + ycvbGUz + DpCEstk + HCEHAtW + QAKXFln + lGUorZP + Kgqzymr + HMZmhTp + EzJXPeo + xuPiLDw + "");
    }

    //垃圾方法
    private void MXcKvYJv(double tybwcvnp0) {
        double tybwcvnp0a = tybwcvnp0;
        new Intent("MXcKvYJv" + tybwcvnp0a + "MXcKvYJv" + ycvbGUz + HMZmhTp + VyshFOt + xuPiLDw + QAKXFln + pZRODbs + Kgqzymr + lGUorZP + lhfNNZg + sETMgqy + vNDhcwp + EzJXPeo + tEwkbqd + hPjSfna + DpCEstk + HCEHAtW + "");
    }

    //垃圾方法
    private void OKxoGeBv(int mbvgzqguc0, float vmzezqinji1, float mfrsspukgw2) {
        float mfrsspukgw2a = mfrsspukgw2;
        float vmzezqinji1a = vmzezqinji1;
        int mbvgzqguc0a = mbvgzqguc0;
        new AttributedString("OKxoGeBv" + mfrsspukgw2a + vmzezqinji1a + mbvgzqguc0a + "OKxoGeBv" + pZRODbs + sETMgqy + HCEHAtW + xuPiLDw + EzJXPeo + tEwkbqd + lGUorZP + DpCEstk + ycvbGUz + VyshFOt + hPjSfna + Kgqzymr + HMZmhTp + lhfNNZg + QAKXFln + vNDhcwp + "");
    }

    //垃圾方法
    private void EHnIzCCD(boolean kazhalbb0) {
        boolean kazhalbb0a = kazhalbb0;
        Log.i("EHnIzCCD", "EHnIzCCD" + kazhalbb0a + "EHnIzCCD" + sETMgqy + QAKXFln + vNDhcwp + xuPiLDw + DpCEstk + lGUorZP + pZRODbs + ycvbGUz + EzJXPeo + tEwkbqd + VyshFOt + hPjSfna + Kgqzymr + HMZmhTp + lhfNNZg + HCEHAtW + "");
    }

    //垃圾方法
    private void nUvLbQSu(char zcaajpuuny0, double eqfjxsxlmy1, long izgxiohuvf2) {
        long izgxiohuvf2a = izgxiohuvf2;
        double eqfjxsxlmy1a = eqfjxsxlmy1;
        char zcaajpuuny0a = zcaajpuuny0;
    }

    //垃圾方法
    private void qWIlUEid(float tquuveqsn0, int wkbmiuheo1, char cehjgmyedh2, boolean clhqczkyq3) {
        boolean clhqczkyq3a = clhqczkyq3;
        char cehjgmyedh2a = cehjgmyedh2;
        int wkbmiuheo1a = wkbmiuheo1;
        float tquuveqsn0a = tquuveqsn0;
        new StringReader("qWIlUEid" + tquuveqsn0a + cehjgmyedh2a + clhqczkyq3a + wkbmiuheo1a + "qWIlUEid" + tEwkbqd + HCEHAtW + HMZmhTp + ycvbGUz + Kgqzymr + vNDhcwp + EzJXPeo + hPjSfna + lGUorZP + lhfNNZg + sETMgqy + VyshFOt + DpCEstk + pZRODbs + QAKXFln + xuPiLDw + "");
    }

    //垃圾方法
    private void RrLoIdSV(short onjqfak0, float vrkcwvzym1, short qwaooyngj2, byte iywgltg3) {
        byte iywgltg3a = iywgltg3;
        short qwaooyngj2a = qwaooyngj2;
        float vrkcwvzym1a = vrkcwvzym1;
        short onjqfak0a = onjqfak0;
        new WeakReference("RrLoIdSV" + qwaooyngj2a + vrkcwvzym1a + iywgltg3a + onjqfak0a + "RrLoIdSV" + lhfNNZg + ycvbGUz + EzJXPeo + DpCEstk + lGUorZP + VyshFOt + vNDhcwp + sETMgqy + tEwkbqd + hPjSfna + HCEHAtW + HMZmhTp + QAKXFln + Kgqzymr + pZRODbs + xuPiLDw + "");
    }

    //垃圾方法
    private void xIUimnne(float nlvxtlqjtv0, long qvpuybmqnl1, long rmksbppu2, int zlxrjodh3, boolean gfpvkjtx4) {
        boolean gfpvkjtx4a = gfpvkjtx4;
        int zlxrjodh3a = zlxrjodh3;
        long rmksbppu2a = rmksbppu2;
        long qvpuybmqnl1a = qvpuybmqnl1;
        float nlvxtlqjtv0a = nlvxtlqjtv0;
        Log.w("xIUimnne", "xIUimnne" + zlxrjodh3a + gfpvkjtx4a + nlvxtlqjtv0a + qvpuybmqnl1a + rmksbppu2a + "xIUimnne" + vNDhcwp + lhfNNZg + HCEHAtW + pZRODbs + DpCEstk + EzJXPeo + ycvbGUz + Kgqzymr + sETMgqy + tEwkbqd + hPjSfna + xuPiLDw + QAKXFln + HMZmhTp + VyshFOt + lGUorZP + "");
    }

    //垃圾方法
    private void JoZEtOgP(double xtwjcvahy0, short dfdpyqqu1, boolean rgngevf2, char zxxkstg3, long hztfqpnzuk4) {
        long hztfqpnzuk4a = hztfqpnzuk4;
        char zxxkstg3a = zxxkstg3;
        boolean rgngevf2a = rgngevf2;
        short dfdpyqqu1a = dfdpyqqu1;
        double xtwjcvahy0a = xtwjcvahy0;
        new Intent("JoZEtOgP" + xtwjcvahy0a + hztfqpnzuk4a + zxxkstg3a + rgngevf2a + dfdpyqqu1a + "JoZEtOgP" + QAKXFln + VyshFOt + pZRODbs + lGUorZP + sETMgqy + hPjSfna + Kgqzymr + vNDhcwp + lhfNNZg + HCEHAtW + ycvbGUz + EzJXPeo + tEwkbqd + DpCEstk + HMZmhTp + xuPiLDw + "");
    }

    //垃圾方法
    private void EAqdLVyr(short hwqjftuvil0) {
        short hwqjftuvil0a = hwqjftuvil0;
        new AttributedString("EAqdLVyr" + hwqjftuvil0a + "EAqdLVyr" + xuPiLDw + VyshFOt + sETMgqy + vNDhcwp + HCEHAtW + hPjSfna + lGUorZP + QAKXFln + lhfNNZg + Kgqzymr + HMZmhTp + tEwkbqd + EzJXPeo + pZRODbs + ycvbGUz + DpCEstk + "");
    }

    //垃圾方法
    private void WhykUhuo(char cpangxtezb0, int xpjtardqva1, int cnpsanj2, byte bpkkbfsmtz3) {
        byte bpkkbfsmtz3a = bpkkbfsmtz3;
        int cnpsanj2a = cnpsanj2;
        int xpjtardqva1a = xpjtardqva1;
        char cpangxtezb0a = cpangxtezb0;
        new Thread("WhykUhuo" + cnpsanj2a + cpangxtezb0a + xpjtardqva1a + bpkkbfsmtz3a + "WhykUhuo" + tEwkbqd + ycvbGUz + hPjSfna + QAKXFln + DpCEstk + sETMgqy + HCEHAtW + EzJXPeo + VyshFOt + Kgqzymr + pZRODbs + lhfNNZg + xuPiLDw + HMZmhTp + lGUorZP + vNDhcwp + "");
    }

    //垃圾方法
    private void PdIwNqlK(double xukdcsow0, char slkbikbinz1, short rpmirdfweb2, byte omrbypcg3) {
        byte omrbypcg3a = omrbypcg3;
        short rpmirdfweb2a = rpmirdfweb2;
        char slkbikbinz1a = slkbikbinz1;
        double xukdcsow0a = xukdcsow0;
        new StringBuffer("PdIwNqlK" + rpmirdfweb2a + omrbypcg3a + xukdcsow0a + slkbikbinz1a + "PdIwNqlK" + Kgqzymr + HCEHAtW + sETMgqy + QAKXFln + ycvbGUz + tEwkbqd + lhfNNZg + hPjSfna + vNDhcwp + VyshFOt + HMZmhTp + xuPiLDw + lGUorZP + EzJXPeo + DpCEstk + pZRODbs + "");
    }

    //垃圾方法
    private void eAduNVNG(boolean rowyfqfvd0, boolean kvzkygzgu1, boolean skoxlvx2, double puegowc3, long vmptklry4) {
        long vmptklry4a = vmptklry4;
        double puegowc3a = puegowc3;
        boolean skoxlvx2a = skoxlvx2;
        boolean kvzkygzgu1a = kvzkygzgu1;
        boolean rowyfqfvd0a = rowyfqfvd0;
        TextUtils.isEmpty("eAduNVNG" + rowyfqfvd0a + puegowc3a + vmptklry4a + kvzkygzgu1a + skoxlvx2a + "eAduNVNG" + lhfNNZg + DpCEstk + ycvbGUz + lGUorZP + tEwkbqd + vNDhcwp + Kgqzymr + HCEHAtW + hPjSfna + EzJXPeo + QAKXFln + VyshFOt + HMZmhTp + sETMgqy + pZRODbs + xuPiLDw + "");
    }

    //垃圾方法
    private void bvLNQNtq(short azrwrktlh0, char ypqozmh1, int qlnmggf2, boolean dmeakttgb3, int hvfuzbv4) {
        int hvfuzbv4a = hvfuzbv4;
        boolean dmeakttgb3a = dmeakttgb3;
        int qlnmggf2a = qlnmggf2;
        char ypqozmh1a = ypqozmh1;
        short azrwrktlh0a = azrwrktlh0;
        TextUtils.isEmpty("bvLNQNtq" + ypqozmh1a + dmeakttgb3a + hvfuzbv4a + azrwrktlh0a + qlnmggf2a + "bvLNQNtq" + ycvbGUz + lGUorZP + EzJXPeo + hPjSfna + DpCEstk + HMZmhTp + QAKXFln + xuPiLDw + pZRODbs + sETMgqy + Kgqzymr + tEwkbqd + VyshFOt + vNDhcwp + HCEHAtW + lhfNNZg + "");
    }

    //垃圾方法
    private void TQOLWQCb(double xsddieih0, float ilpaffy1) {
        float ilpaffy1a = ilpaffy1;
        double xsddieih0a = xsddieih0;
        TextUtils.isDigitsOnly("TQOLWQCb" + ilpaffy1a + xsddieih0a + "TQOLWQCb" + sETMgqy + DpCEstk + tEwkbqd + ycvbGUz + VyshFOt + pZRODbs + QAKXFln + lhfNNZg + vNDhcwp + xuPiLDw + Kgqzymr + lGUorZP + hPjSfna + EzJXPeo + HCEHAtW + HMZmhTp + "");
    }

    //垃圾方法
    private void xeXCBRYc(long mwaegbx0, double xqceduvxpg1, boolean uduiofbycm2, short qqrtnsdh3) {
        short qqrtnsdh3a = qqrtnsdh3;
        boolean uduiofbycm2a = uduiofbycm2;
        double xqceduvxpg1a = xqceduvxpg1;
        long mwaegbx0a = mwaegbx0;
    }

    //垃圾方法
    private void bTuDskih(byte ukciewtll0, float dappcweb1) {
        float dappcweb1a = dappcweb1;
        byte ukciewtll0a = ukciewtll0;
        new StringBuilder("bTuDskih" + ukciewtll0a + dappcweb1a + "bTuDskih" + EzJXPeo + QAKXFln + DpCEstk + VyshFOt + xuPiLDw + pZRODbs + sETMgqy + lGUorZP + Kgqzymr + ycvbGUz + HCEHAtW + vNDhcwp + hPjSfna + lhfNNZg + HMZmhTp + tEwkbqd + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        float dappcweb1 = 10.10f;
        byte ukciewtll0 = 46;
        short qqrtnsdh3 = 18;
        boolean uduiofbycm2 = true;
        double xqceduvxpg1 = 99.99;
        long mwaegbx0 = 65L;
        float ilpaffy1 = 71.71f;
        double xsddieih0 = 56.56;
        int hvfuzbv4 = 92;
        boolean dmeakttgb3 = false;
        int qlnmggf2 = 89;
        char ypqozmh1 = 18;
        short azrwrktlh0 = 99;
        long vmptklry4 = 19L;
        double puegowc3 = 11.11;
        boolean skoxlvx2 = true;
        boolean kvzkygzgu1 = true;
        boolean rowyfqfvd0 = true;
        byte omrbypcg3 = 80;
        short rpmirdfweb2 = 27;
        char slkbikbinz1 = 19;
        double xukdcsow0 = 12.12;
        byte bpkkbfsmtz3 = 87;
        int cnpsanj2 = 61;
        int xpjtardqva1 = 54;
        char cpangxtezb0 = 49;
        short hwqjftuvil0 = 70;
        long hztfqpnzuk4 = 98L;
        char zxxkstg3 = 96;
        boolean rgngevf2 = true;
        short dfdpyqqu1 = 53;
        double xtwjcvahy0 = 25.25;
        boolean gfpvkjtx4 = false;
        int zlxrjodh3 = 71;
        long rmksbppu2 = 82L;
        long qvpuybmqnl1 = 24L;
        float nlvxtlqjtv0 = 99.99f;
        byte iywgltg3 = 18;
        short qwaooyngj2 = 14;
        float vrkcwvzym1 = 83.83f;
        short onjqfak0 = 59;
        boolean clhqczkyq3 = true;
        char cehjgmyedh2 = 57;
        int wkbmiuheo1 = 34;
        float tquuveqsn0 = 49.49f;
        long izgxiohuvf2 = 63L;
        double eqfjxsxlmy1 = 65.65;
        char zcaajpuuny0 = 69;
        boolean kazhalbb0 = true;
        float mfrsspukgw2 = 35.35f;
        float vmzezqinji1 = 16.16f;
        int mbvgzqguc0 = 97;
        double tybwcvnp0 = 52.52;
        long hkudkuibx1 = 87L;
        boolean wqcirxgqs0 = false;
        float ffdkskxdp1 = 100.100f;
        long umdfsxex0 = 18L;
        boolean pxghjxji4 = false;
        byte httvmpo3 = 67;
        float qjpblhnwcf2 = 73.73f;
        double tgrkmhnt1 = 43.43;
        char bnwlmsfzpr0 = 58;
        int rsircyteoq3 = 71;
        int yudgffs2 = 53;
        short mguzcjpkr1 = 1;
        char pxitdlyorv0 = 91;
        double cedtfztyy2 = 18.18;
        short qkwmybuow1 = 27;
        short usyhpcg0 = 50;
        char euizwdbs1 = 13;
        long bshdjgah0 = 86L;
        short hhxqrvs0 = 89;
        float osvozpyj4 = 64.64f;
        boolean tgnyacp3 = true;
        long yzxptegs2 = 42L;
        byte alfnhysls1 = 61;
        short vkmppxth0 = 51;
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        EAqdLVyr(hwqjftuvil0);
        ZElQwRXM(bnwlmsfzpr0, tgrkmhnt1, qjpblhnwcf2, httvmpo3, pxghjxji4);
        TQOLWQCb(xsddieih0, ilpaffy1);
        aZQMYuyF(umdfsxex0, ffdkskxdp1);
        PdIwNqlK(xukdcsow0, slkbikbinz1, rpmirdfweb2, omrbypcg3);
        qWIlUEid(tquuveqsn0, wkbmiuheo1, cehjgmyedh2, clhqczkyq3);
        JoZEtOgP(xtwjcvahy0, dfdpyqqu1, rgngevf2, zxxkstg3, hztfqpnzuk4);
        bvLNQNtq(azrwrktlh0, ypqozmh1, qlnmggf2, dmeakttgb3, hvfuzbv4);
        EAqdLVyr(hwqjftuvil0);
        TQOLWQCb(xsddieih0, ilpaffy1);
        isStartService = false;
        isLiving = false;
        RrLoIdSV(onjqfak0, vrkcwvzym1, qwaooyngj2, iywgltg3);
        OYggsJZP(hhxqrvs0);
        fnDczXTj(wqcirxgqs0, hkudkuibx1);
        RrLoIdSV(onjqfak0, vrkcwvzym1, qwaooyngj2, iywgltg3);
        MXcKvYJv(tybwcvnp0);
        aZQMYuyF(umdfsxex0, ffdkskxdp1);
        bTuDskih(ukciewtll0, dappcweb1);
        eAduNVNG(rowyfqfvd0, kvzkygzgu1, skoxlvx2, puegowc3, vmptklry4);
        HoQjMHTs(usyhpcg0, qkwmybuow1, cedtfztyy2);
        isReTryBinding = false;
        qWIlUEid(tquuveqsn0, wkbmiuheo1, cehjgmyedh2, clhqczkyq3);
        EHnIzCCD(kazhalbb0);
        nUvLbQSu(zcaajpuuny0, eqfjxsxlmy1, izgxiohuvf2);
        WhykUhuo(cpangxtezb0, xpjtardqva1, cnpsanj2, bpkkbfsmtz3);
        EAqdLVyr(hwqjftuvil0);
        EAqdLVyr(hwqjftuvil0);
        fnDczXTj(wqcirxgqs0, hkudkuibx1);
        this.startSubService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void bXKxGvnC(char wllvjilgzg0, int bqpicrdal1, long fkvqzmzrnd2, short erfhtyatv3, char gwyyzamq4) {
        char gwyyzamq4a = gwyyzamq4;
        short erfhtyatv3a = erfhtyatv3;
        long fkvqzmzrnd2a = fkvqzmzrnd2;
        int bqpicrdal1a = bqpicrdal1;
        char wllvjilgzg0a = wllvjilgzg0;
    }

    //垃圾方法
    private void nOFCbebe(char vpigedqlc0, int uxrvtvwe1, boolean gopiaxsyb2, double avxlujoqy3) {
        double avxlujoqy3a = avxlujoqy3;
        boolean gopiaxsyb2a = gopiaxsyb2;
        int uxrvtvwe1a = uxrvtvwe1;
        char vpigedqlc0a = vpigedqlc0;
        new File("nOFCbebe" + vpigedqlc0a + uxrvtvwe1a + gopiaxsyb2a + avxlujoqy3a + "nOFCbebe" + VyshFOt + EzJXPeo + tEwkbqd + lhfNNZg + Kgqzymr + QAKXFln + HCEHAtW + HMZmhTp + hPjSfna + xuPiLDw + vNDhcwp + DpCEstk + ycvbGUz + sETMgqy + lGUorZP + pZRODbs + "");
    }

    //垃圾方法
    private void umJKonWX(byte gfciczn0, float fdomfmsvqp1, long ljyxhqti2) {
        long ljyxhqti2a = ljyxhqti2;
        float fdomfmsvqp1a = fdomfmsvqp1;
        byte gfciczn0a = gfciczn0;
        new String("umJKonWX" + gfciczn0a + fdomfmsvqp1a + ljyxhqti2a + "umJKonWX" + lGUorZP + xuPiLDw + Kgqzymr + tEwkbqd + VyshFOt + hPjSfna + QAKXFln + DpCEstk + vNDhcwp + EzJXPeo + HMZmhTp + ycvbGUz + pZRODbs + HCEHAtW + lhfNNZg + sETMgqy + "");
    }

    //垃圾方法
    private void Moqlgqas(char mjrehzkq0, double umwvwbxggh1, long uezqfkrjoi2, float unrevlxx3, float hrgpuprrxt4) {
        float hrgpuprrxt4a = hrgpuprrxt4;
        float unrevlxx3a = unrevlxx3;
        long uezqfkrjoi2a = uezqfkrjoi2;
        double umwvwbxggh1a = umwvwbxggh1;
        char mjrehzkq0a = mjrehzkq0;
        new String("Moqlgqas" + hrgpuprrxt4a + mjrehzkq0a + umwvwbxggh1a + uezqfkrjoi2a + unrevlxx3a + "Moqlgqas" + vNDhcwp + sETMgqy + DpCEstk + QAKXFln + pZRODbs + HCEHAtW + Kgqzymr + EzJXPeo + lGUorZP + ycvbGUz + lhfNNZg + tEwkbqd + xuPiLDw + VyshFOt + hPjSfna + HMZmhTp + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        float hrgpuprrxt4 = 68.68f;
        float unrevlxx3 = 82.82f;
        long uezqfkrjoi2 = 51L;
        double umwvwbxggh1 = 9.9;
        char mjrehzkq0 = 33;
        long ljyxhqti2 = 25L;
        float fdomfmsvqp1 = 51.51f;
        byte gfciczn0 = 42;
        double avxlujoqy3 = 47.47;
        boolean gopiaxsyb2 = false;
        int uxrvtvwe1 = 75;
        char vpigedqlc0 = 38;
        char gwyyzamq4 = 21;
        short erfhtyatv3 = 98;
        long fkvqzmzrnd2 = 26L;
        int bqpicrdal1 = 83;
        char wllvjilgzg0 = 26;
        bXKxGvnC(wllvjilgzg0, bqpicrdal1, fkvqzmzrnd2, erfhtyatv3, gwyyzamq4);
        nOFCbebe(vpigedqlc0, uxrvtvwe1, gopiaxsyb2, avxlujoqy3);
        Moqlgqas(mjrehzkq0, umwvwbxggh1, uezqfkrjoi2, unrevlxx3, hrgpuprrxt4);
        umJKonWX(gfciczn0, fdomfmsvqp1, ljyxhqti2);
        nOFCbebe(vpigedqlc0, uxrvtvwe1, gopiaxsyb2, avxlujoqy3);
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            isReTryBinding = false;
        } else {
            if (RecoverOrgManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                RecoverOrgManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void SMXOFdrg(float toicody0, char zlshqpyy1, float aqofiqh2) {
        float aqofiqh2a = aqofiqh2;
        char zlshqpyy1a = zlshqpyy1;
        float toicody0a = toicody0;
        Log.e("SMXOFdrg", "SMXOFdrg" + zlshqpyy1a + aqofiqh2a + toicody0a + "SMXOFdrg" + QAKXFln + hPjSfna + tEwkbqd + lGUorZP + pZRODbs + VyshFOt + xuPiLDw + lhfNNZg + HMZmhTp + DpCEstk + vNDhcwp + ycvbGUz + HCEHAtW + EzJXPeo + Kgqzymr + sETMgqy + "");
    }

    //垃圾方法
    private void CVNbEHoK(double qnpqzdip0, double mgqsqiu1, short miynzfthq2) {
        short miynzfthq2a = miynzfthq2;
        double mgqsqiu1a = mgqsqiu1;
        double qnpqzdip0a = qnpqzdip0;
        new Thread("CVNbEHoK" + qnpqzdip0a + miynzfthq2a + mgqsqiu1a + "CVNbEHoK" + xuPiLDw + QAKXFln + vNDhcwp + lGUorZP + EzJXPeo + sETMgqy + HMZmhTp + ycvbGUz + tEwkbqd + Kgqzymr + HCEHAtW + DpCEstk + VyshFOt + lhfNNZg + hPjSfna + pZRODbs + "");
    }

    //垃圾方法
    private void TfaMCYaE(double vjtrlidj0, float opddczxydz1) {
        float opddczxydz1a = opddczxydz1;
        double vjtrlidj0a = vjtrlidj0;
        System.out.println("TfaMCYaE" + opddczxydz1a + vjtrlidj0a + "TfaMCYaE" + lGUorZP + EzJXPeo + ycvbGUz + Kgqzymr + DpCEstk + tEwkbqd + QAKXFln + vNDhcwp + sETMgqy + lhfNNZg + HMZmhTp + xuPiLDw + VyshFOt + hPjSfna + HCEHAtW + pZRODbs + "");
    }

    //垃圾方法
    private void ocEZEoWA(short fjvlhgu0, float mlrhgyj1, char bekwuwcpe2, byte mufdzaocz3) {
        byte mufdzaocz3a = mufdzaocz3;
        char bekwuwcpe2a = bekwuwcpe2;
        float mlrhgyj1a = mlrhgyj1;
        short fjvlhgu0a = fjvlhgu0;
        Log.w("ocEZEoWA", "ocEZEoWA" + mlrhgyj1a + bekwuwcpe2a + mufdzaocz3a + fjvlhgu0a + "ocEZEoWA" + HCEHAtW + VyshFOt + sETMgqy + vNDhcwp + DpCEstk + lhfNNZg + tEwkbqd + xuPiLDw + hPjSfna + QAKXFln + pZRODbs + ycvbGUz + HMZmhTp + lGUorZP + EzJXPeo + Kgqzymr + "");
    }

    //垃圾方法
    private void LrKcdqQq(char dmfbeiro0, long ojmlbfkp1, double aqjtnqbq2, short kvbzbbhcwb3, char dfbefvrmjd4) {
        char dfbefvrmjd4a = dfbefvrmjd4;
        short kvbzbbhcwb3a = kvbzbbhcwb3;
        double aqjtnqbq2a = aqjtnqbq2;
        long ojmlbfkp1a = ojmlbfkp1;
        char dmfbeiro0a = dmfbeiro0;
        new Thread("LrKcdqQq" + dmfbeiro0a + aqjtnqbq2a + dfbefvrmjd4a + ojmlbfkp1a + kvbzbbhcwb3a + "LrKcdqQq" + Kgqzymr + vNDhcwp + hPjSfna + xuPiLDw + HCEHAtW + lGUorZP + sETMgqy + HMZmhTp + EzJXPeo + lhfNNZg + ycvbGUz + pZRODbs + QAKXFln + VyshFOt + DpCEstk + tEwkbqd + "");
    }

    //垃圾方法
    private void fKmJgcuK(boolean ezsmwfs0) {
        boolean ezsmwfs0a = ezsmwfs0;
        new StringBuffer("fKmJgcuK" + ezsmwfs0a + "fKmJgcuK" + lhfNNZg + HMZmhTp + xuPiLDw + sETMgqy + VyshFOt + tEwkbqd + DpCEstk + pZRODbs + vNDhcwp + HCEHAtW + EzJXPeo + Kgqzymr + hPjSfna + ycvbGUz + lGUorZP + QAKXFln + "");
    }

    //垃圾方法
    private void yeItcynQ(double pbujnldvru0) {
        double pbujnldvru0a = pbujnldvru0;
        Log.w("yeItcynQ", "yeItcynQ" + pbujnldvru0a + "yeItcynQ" + hPjSfna + lhfNNZg + pZRODbs + vNDhcwp + HCEHAtW + tEwkbqd + Kgqzymr + ycvbGUz + DpCEstk + lGUorZP + xuPiLDw + VyshFOt + QAKXFln + EzJXPeo + sETMgqy + HMZmhTp + "");
    }

    //垃圾方法
    private void uPERkgyE(short sdlqexuea0, char kgwiuzg1, int kbxihyzpch2, char qpiuxewyda3) {
        char qpiuxewyda3a = qpiuxewyda3;
        int kbxihyzpch2a = kbxihyzpch2;
        char kgwiuzg1a = kgwiuzg1;
        short sdlqexuea0a = sdlqexuea0;
        new String("uPERkgyE" + sdlqexuea0a + qpiuxewyda3a + kgwiuzg1a + kbxihyzpch2a + "uPERkgyE" + lGUorZP + HMZmhTp + tEwkbqd + pZRODbs + HCEHAtW + vNDhcwp + sETMgqy + ycvbGUz + DpCEstk + VyshFOt + Kgqzymr + EzJXPeo + QAKXFln + xuPiLDw + hPjSfna + lhfNNZg + "");
    }

    private void doStartSubService() {
        char qpiuxewyda3 = 8;
        int kbxihyzpch2 = 52;
        char kgwiuzg1 = 78;
        short sdlqexuea0 = 35;
        double pbujnldvru0 = 2.2;
        boolean ezsmwfs0 = false;
        char dfbefvrmjd4 = 66;
        short kvbzbbhcwb3 = 97;
        double aqjtnqbq2 = 19.19;
        long ojmlbfkp1 = 77L;
        char dmfbeiro0 = 87;
        byte mufdzaocz3 = 14;
        char bekwuwcpe2 = 81;
        float mlrhgyj1 = 100.100f;
        short fjvlhgu0 = 22;
        float opddczxydz1 = 92.92f;
        double vjtrlidj0 = 15.15;
        short miynzfthq2 = 77;
        double mgqsqiu1 = 71.71;
        double qnpqzdip0 = 76.76;
        float aqofiqh2 = 31.31f;
        char zlshqpyy1 = 79;
        float toicody0 = 88.88f;
        if (RecoverOrgManager.isDebug) {
            uPERkgyE(sdlqexuea0, kgwiuzg1, kbxihyzpch2, qpiuxewyda3);
            ocEZEoWA(fjvlhgu0, mlrhgyj1, bekwuwcpe2, mufdzaocz3);
            CVNbEHoK(qnpqzdip0, mgqsqiu1, miynzfthq2);
            ocEZEoWA(fjvlhgu0, mlrhgyj1, bekwuwcpe2, mufdzaocz3);
            uPERkgyE(sdlqexuea0, kgwiuzg1, kbxihyzpch2, qpiuxewyda3);
            TfaMCYaE(vjtrlidj0, opddczxydz1);
            SMXOFdrg(toicody0, zlshqpyy1, aqofiqh2);
            SMXOFdrg(toicody0, zlshqpyy1, aqofiqh2);
            SMXOFdrg(toicody0, zlshqpyy1, aqofiqh2);
            TfaMCYaE(vjtrlidj0, opddczxydz1);
            Log.i(TAG, "主进程 doStartSubService5");
        }
        yeItcynQ(pbujnldvru0);
        LrKcdqQq(dmfbeiro0, ojmlbfkp1, aqjtnqbq2, kvbzbbhcwb3, dfbefvrmjd4);
        uPERkgyE(sdlqexuea0, kgwiuzg1, kbxihyzpch2, qpiuxewyda3);
        try {
            Intent intent = new Intent(this, Recover2Service.class);
            SMXOFdrg(toicody0, zlshqpyy1, aqofiqh2);
            fKmJgcuK(ezsmwfs0);
            fKmJgcuK(ezsmwfs0);
            uPERkgyE(sdlqexuea0, kgwiuzg1, kbxihyzpch2, qpiuxewyda3);
            intent.putExtra("isStartService", true);
            yeItcynQ(pbujnldvru0);
            ocEZEoWA(fjvlhgu0, mlrhgyj1, bekwuwcpe2, mufdzaocz3);
            SMXOFdrg(toicody0, zlshqpyy1, aqofiqh2);
            yeItcynQ(pbujnldvru0);
            CVNbEHoK(qnpqzdip0, mgqsqiu1, miynzfthq2);
            ocEZEoWA(fjvlhgu0, mlrhgyj1, bekwuwcpe2, mufdzaocz3);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void jxemylml(float kebonrjws0, boolean vbhatipmf1, float qwsppvrd2, short zxrdpmr3) {
        short zxrdpmr3a = zxrdpmr3;
        float qwsppvrd2a = qwsppvrd2;
        boolean vbhatipmf1a = vbhatipmf1;
        float kebonrjws0a = kebonrjws0;
        System.out.println("jxemylml" + qwsppvrd2a + kebonrjws0a + vbhatipmf1a + zxrdpmr3a + "jxemylml" + lhfNNZg + xuPiLDw + Kgqzymr + pZRODbs + vNDhcwp + DpCEstk + EzJXPeo + hPjSfna + sETMgqy + QAKXFln + ycvbGUz + HMZmhTp + tEwkbqd + VyshFOt + lGUorZP + HCEHAtW + "");
    }

    //垃圾方法
    private void FDIzRego(char lhdtvaoha0, byte ihpvnrt1) {
        byte ihpvnrt1a = ihpvnrt1;
        char lhdtvaoha0a = lhdtvaoha0;
        new File("FDIzRego" + ihpvnrt1a + lhdtvaoha0a + "FDIzRego" + vNDhcwp + HCEHAtW + pZRODbs + QAKXFln + tEwkbqd + HMZmhTp + Kgqzymr + lGUorZP + ycvbGUz + VyshFOt + hPjSfna + DpCEstk + xuPiLDw + EzJXPeo + sETMgqy + lhfNNZg + "");
    }

    //垃圾方法
    private void vSMyogIR(int vfbngvin0) {
        int vfbngvin0a = vfbngvin0;
        System.out.println("vSMyogIR" + vfbngvin0a + "vSMyogIR" + ycvbGUz + pZRODbs + HMZmhTp + sETMgqy + VyshFOt + HCEHAtW + xuPiLDw + lhfNNZg + Kgqzymr + tEwkbqd + vNDhcwp + QAKXFln + EzJXPeo + DpCEstk + lGUorZP + hPjSfna + "");
    }

    //垃圾方法
    private void ocoDSnKQ(byte bszngnwxwi0) {
        byte bszngnwxwi0a = bszngnwxwi0;
        System.out.println("ocoDSnKQ" + bszngnwxwi0a + "ocoDSnKQ" + sETMgqy + pZRODbs + HMZmhTp + lGUorZP + QAKXFln + hPjSfna + EzJXPeo + lhfNNZg + ycvbGUz + vNDhcwp + tEwkbqd + xuPiLDw + DpCEstk + Kgqzymr + VyshFOt + HCEHAtW + "");
    }

    private void bindSubService() {
        byte bszngnwxwi0 = 34;
        int vfbngvin0 = 48;
        byte ihpvnrt1 = 32;
        char lhdtvaoha0 = 55;
        short zxrdpmr3 = 64;
        float qwsppvrd2 = 18.18f;
        boolean vbhatipmf1 = false;
        float kebonrjws0 = 98.98f;
        jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
        jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
        FDIzRego(lhdtvaoha0, ihpvnrt1);
        jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
        FDIzRego(lhdtvaoha0, ihpvnrt1);
        ocoDSnKQ(bszngnwxwi0);
        jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
        jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
        try {
            vSMyogIR(vfbngvin0);
            ocoDSnKQ(bszngnwxwi0);
            ocoDSnKQ(bszngnwxwi0);
            vSMyogIR(vfbngvin0);
            FDIzRego(lhdtvaoha0, ihpvnrt1);
            vSMyogIR(vfbngvin0);
            jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
            jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
            jxemylml(kebonrjws0, vbhatipmf1, qwsppvrd2, zxrdpmr3);
            this.bindService(new Intent(this, Recover2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void omkfNXYK(float addboiwp0, long bcnsypuzx1, char ygcezmprvz2) {
        char ygcezmprvz2a = ygcezmprvz2;
        long bcnsypuzx1a = bcnsypuzx1;
        float addboiwp0a = addboiwp0;
        TextUtils.isEmpty("omkfNXYK" + ygcezmprvz2a + addboiwp0a + bcnsypuzx1a + "omkfNXYK" + "");
    }

    //垃圾方法
    static private void wJJASjZk(int lobmkbij0, double foblnxz1) {
        double foblnxz1a = foblnxz1;
        int lobmkbij0a = lobmkbij0;
    }

    //垃圾方法
    static private void VvxwGfPm(float yssgvoqohe0, char ytgprowi1) {
        char ytgprowi1a = ytgprowi1;
        float yssgvoqohe0a = yssgvoqohe0;
        TextUtils.isEmpty("VvxwGfPm" + yssgvoqohe0a + ytgprowi1a + "VvxwGfPm" + "");
    }

    //垃圾方法
    static private void TqwmXKFc(boolean lhcgjhoipb0) {
        boolean lhcgjhoipb0a = lhcgjhoipb0;
        new File("TqwmXKFc" + lhcgjhoipb0a + "TqwmXKFc" + "");
    }

    private static boolean doStartMainService(Context context) {
        boolean lhcgjhoipb0 = true;
        char ytgprowi1 = 40;
        float yssgvoqohe0 = 72.72f;
        double foblnxz1 = 89.89;
        int lobmkbij0 = 97;
        char ygcezmprvz2 = 34;
        long bcnsypuzx1 = 32L;
        float addboiwp0 = 26.26f;
        try {
            Intent intent = new Intent(context, Recover1Service.class);
            TqwmXKFc(lhcgjhoipb0);
            omkfNXYK(addboiwp0, bcnsypuzx1, ygcezmprvz2);
            wJJASjZk(lobmkbij0, foblnxz1);
            VvxwGfPm(yssgvoqohe0, ytgprowi1);
            wJJASjZk(lobmkbij0, foblnxz1);
            omkfNXYK(addboiwp0, bcnsypuzx1, ygcezmprvz2);
            intent.putExtra("isStartService", true);
            omkfNXYK(addboiwp0, bcnsypuzx1, ygcezmprvz2);
            wJJASjZk(lobmkbij0, foblnxz1);
            omkfNXYK(addboiwp0, bcnsypuzx1, ygcezmprvz2);
            TqwmXKFc(lhcgjhoipb0);
            wJJASjZk(lobmkbij0, foblnxz1);
            VvxwGfPm(yssgvoqohe0, ytgprowi1);
            VvxwGfPm(yssgvoqohe0, ytgprowi1);
            omkfNXYK(addboiwp0, bcnsypuzx1, ygcezmprvz2);
            TqwmXKFc(lhcgjhoipb0);
            intent.setPackage(context.getPackageName());
            TqwmXKFc(lhcgjhoipb0);
            wJJASjZk(lobmkbij0, foblnxz1);
            VvxwGfPm(yssgvoqohe0, ytgprowi1);
            wJJASjZk(lobmkbij0, foblnxz1);
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void ZSsnrryk(long pruompl0, short asjcvyzi1, long rdwzwsyvem2, int xyvqjtnonp3, short jjslhdcfau4) {
        short jjslhdcfau4a = jjslhdcfau4;
        int xyvqjtnonp3a = xyvqjtnonp3;
        long rdwzwsyvem2a = rdwzwsyvem2;
        short asjcvyzi1a = asjcvyzi1;
        long pruompl0a = pruompl0;
        System.out.println("ZSsnrryk" + jjslhdcfau4a + pruompl0a + asjcvyzi1a + rdwzwsyvem2a + xyvqjtnonp3a + "ZSsnrryk" + "");
    }

    //垃圾方法
    static private void nOTvGMHB(float wwwqzqk0, double thmgsgj1) {
        double thmgsgj1a = thmgsgj1;
        float wwwqzqk0a = wwwqzqk0;
        new StringBuffer("nOTvGMHB" + wwwqzqk0a + thmgsgj1a + "nOTvGMHB" + "");
    }

    //垃圾方法
    static private void jKeBHMjm(double hkpkwnn0, boolean bruskxuagv1, byte xvovlts2, float ndijuirsg3) {
        float ndijuirsg3a = ndijuirsg3;
        byte xvovlts2a = xvovlts2;
        boolean bruskxuagv1a = bruskxuagv1;
        double hkpkwnn0a = hkpkwnn0;
        new StringBuilder("jKeBHMjm" + xvovlts2a + bruskxuagv1a + ndijuirsg3a + hkpkwnn0a + "jKeBHMjm" + "");
    }

    //垃圾方法
    static private void IedOgfSd(float hkijhzki0) {
        float hkijhzki0a = hkijhzki0;
        TextUtils.isDigitsOnly("IedOgfSd" + hkijhzki0a + "IedOgfSd" + "");
    }

    //垃圾方法
    static private void UZrHDPzw(byte ctvwbhfra0, float bwnhlllfgm1, int yssdglt2, double wtumfhb3) {
        double wtumfhb3a = wtumfhb3;
        int yssdglt2a = yssdglt2;
        float bwnhlllfgm1a = bwnhlllfgm1;
        byte ctvwbhfra0a = ctvwbhfra0;
        new Thread("UZrHDPzw" + ctvwbhfra0a + wtumfhb3a + yssdglt2a + bwnhlllfgm1a + "UZrHDPzw" + "");
    }

    //垃圾方法
    static private void IqOQDFEz(double cehndcurtt0, byte ikurcbad1) {
        byte ikurcbad1a = ikurcbad1;
        double cehndcurtt0a = cehndcurtt0;
        Log.e("IqOQDFEz", "IqOQDFEz" + cehndcurtt0a + ikurcbad1a + "IqOQDFEz" + "");
    }

    //垃圾方法
    static private void yrCNGHWe(char lszvyja0, long spnytso1) {
        long spnytso1a = spnytso1;
        char lszvyja0a = lszvyja0;
        new WeakReference("yrCNGHWe" + lszvyja0a + spnytso1a + "yrCNGHWe" + "");
    }

    //垃圾方法
    static private void fOMDQlEi(double bmcjodcbe0, float mbtannoqt1, long qthlacnx2, long loambvpw3) {
        long loambvpw3a = loambvpw3;
        long qthlacnx2a = qthlacnx2;
        float mbtannoqt1a = mbtannoqt1;
        double bmcjodcbe0a = bmcjodcbe0;
        Log.i("fOMDQlEi", "fOMDQlEi" + qthlacnx2a + loambvpw3a + mbtannoqt1a + bmcjodcbe0a + "fOMDQlEi" + "");
    }

    private static void doBindMainService(Context context) {
        long loambvpw3 = 15L;
        long qthlacnx2 = 22L;
        float mbtannoqt1 = 77.77f;
        double bmcjodcbe0 = 45.45;
        long spnytso1 = 36L;
        char lszvyja0 = 95;
        byte ikurcbad1 = 47;
        double cehndcurtt0 = 91.91;
        double wtumfhb3 = 62.62;
        int yssdglt2 = 67;
        float bwnhlllfgm1 = 55.55f;
        byte ctvwbhfra0 = 66;
        float hkijhzki0 = 32.32f;
        float ndijuirsg3 = 45.45f;
        byte xvovlts2 = 21;
        boolean bruskxuagv1 = true;
        double hkpkwnn0 = 65.65;
        double thmgsgj1 = 33.33;
        float wwwqzqk0 = 89.89f;
        short jjslhdcfau4 = 51;
        int xyvqjtnonp3 = 65;
        long rdwzwsyvem2 = 28L;
        short asjcvyzi1 = 64;
        long pruompl0 = 98L;
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "bindMainService5");
        }
        UZrHDPzw(ctvwbhfra0, bwnhlllfgm1, yssdglt2, wtumfhb3);
        fOMDQlEi(bmcjodcbe0, mbtannoqt1, qthlacnx2, loambvpw3);
        fOMDQlEi(bmcjodcbe0, mbtannoqt1, qthlacnx2, loambvpw3);
        IedOgfSd(hkijhzki0);
        nOTvGMHB(wwwqzqk0, thmgsgj1);
        nOTvGMHB(wwwqzqk0, thmgsgj1);
        IedOgfSd(hkijhzki0);
        try {
            Intent intent = new Intent(context, Recover1Service.class);
            intent.putExtra("isStartService", false);
            intent.setPackage(context.getPackageName());
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
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceRecover.Stub {

        LocalBinder(Recover1Service this$0) {
        }

        //垃圾方法
        private void qBAtIOJz(boolean bkqowcf0, double agkzqtmyrc1, byte pdxiglieoc2, int llhksfmtja3, short ypsqiwnp4) {
            short ypsqiwnp4a = ypsqiwnp4;
            int llhksfmtja3a = llhksfmtja3;
            byte pdxiglieoc2a = pdxiglieoc2;
            double agkzqtmyrc1a = agkzqtmyrc1;
            boolean bkqowcf0a = bkqowcf0;
            Log.i("qBAtIOJz", "qBAtIOJz" + llhksfmtja3a + ypsqiwnp4a + agkzqtmyrc1a + pdxiglieoc2a + bkqowcf0a + "qBAtIOJz" + "" + "");
        }

        //垃圾方法
        private void SxhRTYCe(int bfcrmqbkjs0) {
            int bfcrmqbkjs0a = bfcrmqbkjs0;
        }

        //垃圾方法
        private void gFqerjAV(long krjehvr0, int pxqkhfo1) {
            int pxqkhfo1a = pxqkhfo1;
            long krjehvr0a = krjehvr0;
            Log.i("gFqerjAV", "gFqerjAV" + krjehvr0a + pxqkhfo1a + "gFqerjAV" + "" + "");
        }

        //垃圾方法
        private void ABcTasrE(int dlszsalfs0, short hnmwmdvaq1, double xohzjvlknw2, char mdgaizatug3) {
            char mdgaizatug3a = mdgaizatug3;
            double xohzjvlknw2a = xohzjvlknw2;
            short hnmwmdvaq1a = hnmwmdvaq1;
            int dlszsalfs0a = dlszsalfs0;
            new StringBuilder("ABcTasrE" + mdgaizatug3a + hnmwmdvaq1a + xohzjvlknw2a + dlszsalfs0a + "ABcTasrE" + "" + "");
        }

        public String getServiceRecover() throws RemoteException {
            char mdgaizatug3 = 47;
            double xohzjvlknw2 = 83.83;
            short hnmwmdvaq1 = 99;
            int dlszsalfs0 = 96;
            int pxqkhfo1 = 42;
            long krjehvr0 = 41L;
            int bfcrmqbkjs0 = 27;
            short ypsqiwnp4 = 54;
            int llhksfmtja3 = 14;
            byte pdxiglieoc2 = 21;
            double agkzqtmyrc1 = 95.95;
            boolean bkqowcf0 = true;
            gFqerjAV(krjehvr0, pxqkhfo1);
            ABcTasrE(dlszsalfs0, hnmwmdvaq1, xohzjvlknw2, mdgaizatug3);
            SxhRTYCe(bfcrmqbkjs0);
            ABcTasrE(dlszsalfs0, hnmwmdvaq1, xohzjvlknw2, mdgaizatug3);
            ABcTasrE(dlszsalfs0, hnmwmdvaq1, xohzjvlknw2, mdgaizatug3);
            return "LocalService";
        }

        //垃圾方法
        private void BQlkAhiG(char njgziygp0, short aixysfbdr1, char gzndnewwto2, long rsvfqozz3, float vrulamfha4) {
            float vrulamfha4a = vrulamfha4;
            long rsvfqozz3a = rsvfqozz3;
            char gzndnewwto2a = gzndnewwto2;
            short aixysfbdr1a = aixysfbdr1;
            char njgziygp0a = njgziygp0;
            System.out.println("BQlkAhiG" + gzndnewwto2a + rsvfqozz3a + njgziygp0a + vrulamfha4a + aixysfbdr1a + "BQlkAhiG" + "" + "");
        }

        //垃圾方法
        private void gddrkirM(short apioaybje0, boolean iltxfmpg1, float tpbvuooqmc2, char eyvodzvn3, int zhlzduhdww4) {
            int zhlzduhdww4a = zhlzduhdww4;
            char eyvodzvn3a = eyvodzvn3;
            float tpbvuooqmc2a = tpbvuooqmc2;
            boolean iltxfmpg1a = iltxfmpg1;
            short apioaybje0a = apioaybje0;
            System.out.println("gddrkirM" + tpbvuooqmc2a + zhlzduhdww4a + iltxfmpg1a + apioaybje0a + eyvodzvn3a + "gddrkirM" + "" + "");
        }

        //垃圾方法
        private void UIBMUrPd(char kwhrecywx0, long ifielen1) {
            long ifielen1a = ifielen1;
            char kwhrecywx0a = kwhrecywx0;
            new String("UIBMUrPd" + kwhrecywx0a + ifielen1a + "UIBMUrPd" + "" + "");
        }

        //垃圾方法
        private void LbVNNRuD(float pdpykvk0) {
            float pdpykvk0a = pdpykvk0;
            new Thread("LbVNNRuD" + pdpykvk0a + "LbVNNRuD" + "" + "");
        }

        public boolean isStartedRecover() throws RemoteException {
            float pdpykvk0 = 5.5f;
            long ifielen1 = 31L;
            char kwhrecywx0 = 32;
            int zhlzduhdww4 = 70;
            char eyvodzvn3 = 20;
            float tpbvuooqmc2 = 33.33f;
            boolean iltxfmpg1 = true;
            short apioaybje0 = 75;
            float vrulamfha4 = 67.67f;
            long rsvfqozz3 = 33L;
            char gzndnewwto2 = 95;
            short aixysfbdr1 = 70;
            char njgziygp0 = 92;
            UIBMUrPd(kwhrecywx0, ifielen1);
            LbVNNRuD(pdpykvk0);
            UIBMUrPd(kwhrecywx0, ifielen1);
            gddrkirM(apioaybje0, iltxfmpg1, tpbvuooqmc2, eyvodzvn3, zhlzduhdww4);
            UIBMUrPd(kwhrecywx0, ifielen1);
            gddrkirM(apioaybje0, iltxfmpg1, tpbvuooqmc2, eyvodzvn3, zhlzduhdww4);
            UIBMUrPd(kwhrecywx0, ifielen1);
            return Recover1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Recover1Service this$0) {
        }

        //垃圾方法
        private void GhQersyU(boolean vcviewozlq0, long joalxueq1, double jxlzvjvaux2, boolean yoxptfzqk3) {
            boolean yoxptfzqk3a = yoxptfzqk3;
            double jxlzvjvaux2a = jxlzvjvaux2;
            long joalxueq1a = joalxueq1;
            boolean vcviewozlq0a = vcviewozlq0;
            Log.i("GhQersyU", "GhQersyU" + yoxptfzqk3a + jxlzvjvaux2a + vcviewozlq0a + joalxueq1a + "GhQersyU" + "" + "");
        }

        //垃圾方法
        private void pwTiihjg(float iggdlow0, float nhwpaeih1, float aausese2) {
            float aausese2a = aausese2;
            float nhwpaeih1a = nhwpaeih1;
            float iggdlow0a = iggdlow0;
            new AttributedString("pwTiihjg" + iggdlow0a + aausese2a + nhwpaeih1a + "pwTiihjg" + "" + "");
        }

        //垃圾方法
        private void vvAsrmCu(long axaufrjfr0, short ykujpau1, double ggpnmsbu2, long zbdcfhqt3, double fvsmwvf4) {
            double fvsmwvf4a = fvsmwvf4;
            long zbdcfhqt3a = zbdcfhqt3;
            double ggpnmsbu2a = ggpnmsbu2;
            short ykujpau1a = ykujpau1;
            long axaufrjfr0a = axaufrjfr0;
            Log.w("vvAsrmCu", "vvAsrmCu" + ggpnmsbu2a + ykujpau1a + zbdcfhqt3a + axaufrjfr0a + fvsmwvf4a + "vvAsrmCu" + "" + "");
        }

        //垃圾方法
        private void ijJTQwqu(short bfttgyyx0, short vuegjmeqc1, double vbnajxxeg2) {
            double vbnajxxeg2a = vbnajxxeg2;
            short vuegjmeqc1a = vuegjmeqc1;
            short bfttgyyx0a = bfttgyyx0;
            Log.e("ijJTQwqu", "ijJTQwqu" + bfttgyyx0a + vbnajxxeg2a + vuegjmeqc1a + "ijJTQwqu" + "" + "");
        }

        //垃圾方法
        private void saDHPxfC(byte rozdskiau0, byte piylrvuv1, double bvtzuvcub2) {
            double bvtzuvcub2a = bvtzuvcub2;
            byte piylrvuv1a = piylrvuv1;
            byte rozdskiau0a = rozdskiau0;
            TextUtils.isDigitsOnly("saDHPxfC" + bvtzuvcub2a + rozdskiau0a + piylrvuv1a + "saDHPxfC" + "" + "");
        }

        //垃圾方法
        private void nyORXPFA(int ybpvtqqazr0, int hdvdrefwv1, char qkvbbik2, byte hpkmcvghl3, float onykvevwj4) {
            float onykvevwj4a = onykvevwj4;
            byte hpkmcvghl3a = hpkmcvghl3;
            char qkvbbik2a = qkvbbik2;
            int hdvdrefwv1a = hdvdrefwv1;
            int ybpvtqqazr0a = ybpvtqqazr0;
            TextUtils.isDigitsOnly("nyORXPFA" + onykvevwj4a + hpkmcvghl3a + hdvdrefwv1a + qkvbbik2a + ybpvtqqazr0a + "nyORXPFA" + "" + "");
        }

        //垃圾方法
        private void LuJsMrZd(short aeepszam0, byte gtxbfumg1, boolean sqxutqudap2) {
            boolean sqxutqudap2a = sqxutqudap2;
            byte gtxbfumg1a = gtxbfumg1;
            short aeepszam0a = aeepszam0;
            new StringBuilder("LuJsMrZd" + aeepszam0a + sqxutqudap2a + gtxbfumg1a + "LuJsMrZd" + "" + "");
        }

        //垃圾方法
        private void vVtCpHSA(float zzxyyfuk0, int rhmzaezyq1, float ttcijayji2) {
            float ttcijayji2a = ttcijayji2;
            int rhmzaezyq1a = rhmzaezyq1;
            float zzxyyfuk0a = zzxyyfuk0;
            Log.i("vVtCpHSA", "vVtCpHSA" + zzxyyfuk0a + rhmzaezyq1a + ttcijayji2a + "vVtCpHSA" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            float ttcijayji2 = 71.71f;
            int rhmzaezyq1 = 24;
            float zzxyyfuk0 = 95.95f;
            boolean sqxutqudap2 = false;
            byte gtxbfumg1 = 64;
            short aeepszam0 = 90;
            float onykvevwj4 = 30.30f;
            byte hpkmcvghl3 = 56;
            char qkvbbik2 = 41;
            int hdvdrefwv1 = 49;
            int ybpvtqqazr0 = 40;
            double bvtzuvcub2 = 34.34;
            byte piylrvuv1 = 23;
            byte rozdskiau0 = 38;
            double vbnajxxeg2 = 95.95;
            short vuegjmeqc1 = 58;
            short bfttgyyx0 = 10;
            double fvsmwvf4 = 94.94;
            long zbdcfhqt3 = 87L;
            double ggpnmsbu2 = 38.38;
            short ykujpau1 = 92;
            long axaufrjfr0 = 47L;
            float aausese2 = 81.81f;
            float nhwpaeih1 = 53.53f;
            float iggdlow0 = 99.99f;
            boolean yoxptfzqk3 = false;
            double jxlzvjvaux2 = 98.98;
            long joalxueq1 = 80L;
            boolean vcviewozlq0 = true;
            if (RecoverOrgManager.isDebug) {
                Log.i(Recover1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            try {
                vVtCpHSA(zzxyyfuk0, rhmzaezyq1, ttcijayji2);
                nyORXPFA(ybpvtqqazr0, hdvdrefwv1, qkvbbik2, hpkmcvghl3, onykvevwj4);
                ijJTQwqu(bfttgyyx0, vuegjmeqc1, vbnajxxeg2);
                vVtCpHSA(zzxyyfuk0, rhmzaezyq1, ttcijayji2);
                nyORXPFA(ybpvtqqazr0, hdvdrefwv1, qkvbbik2, hpkmcvghl3, onykvevwj4);
                GhQersyU(vcviewozlq0, joalxueq1, jxlzvjvaux2, yoxptfzqk3);
                pwTiihjg(iggdlow0, nhwpaeih1, aausese2);
                nyORXPFA(ybpvtqqazr0, hdvdrefwv1, qkvbbik2, hpkmcvghl3, onykvevwj4);
                IProcessServiceRecover process = IProcessServiceRecover.Stub.asInterface(service);
                process.getServiceRecover();
            } catch (Exception var25) {
                Exception e = var25;
                if (RecoverOrgManager.isDebug) {
                    Log.e(Recover1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void RxlAkuNk(byte kvxrwrax0, int gaeqflb1, double qngyyiz2, int uzolciwwmo3, double ubotpectrm4) {
            double ubotpectrm4a = ubotpectrm4;
            int uzolciwwmo3a = uzolciwwmo3;
            double qngyyiz2a = qngyyiz2;
            int gaeqflb1a = gaeqflb1;
            byte kvxrwrax0a = kvxrwrax0;
            Log.e("RxlAkuNk", "RxlAkuNk" + gaeqflb1a + qngyyiz2a + ubotpectrm4a + uzolciwwmo3a + kvxrwrax0a + "RxlAkuNk" + "" + "");
        }

        //垃圾方法
        private void OWOfRyKi(int ssthglpkl0, byte oatloyzvip1, char jefntzyd2) {
            char jefntzyd2a = jefntzyd2;
            byte oatloyzvip1a = oatloyzvip1;
            int ssthglpkl0a = ssthglpkl0;
            new StringReader("OWOfRyKi" + jefntzyd2a + oatloyzvip1a + ssthglpkl0a + "OWOfRyKi" + "" + "");
        }

        //垃圾方法
        private void ofbFEBUX(int mtsdtom0, int hduvyli1, short vkortvk2, long bijctqeoj3, int lwatsuvht4) {
            int lwatsuvht4a = lwatsuvht4;
            long bijctqeoj3a = bijctqeoj3;
            short vkortvk2a = vkortvk2;
            int hduvyli1a = hduvyli1;
            int mtsdtom0a = mtsdtom0;
            new AttributedString("ofbFEBUX" + hduvyli1a + mtsdtom0a + bijctqeoj3a + lwatsuvht4a + vkortvk2a + "ofbFEBUX" + "" + "");
        }

        //垃圾方法
        private void eTEAHcLm(double dvxwvyyp0, long jivtjdnt1, long abwfddejg2, char clsgndh3) {
            char clsgndh3a = clsgndh3;
            long abwfddejg2a = abwfddejg2;
            long jivtjdnt1a = jivtjdnt1;
            double dvxwvyyp0a = dvxwvyyp0;
            new StringReader("eTEAHcLm" + abwfddejg2a + dvxwvyyp0a + jivtjdnt1a + clsgndh3a + "eTEAHcLm" + "" + "");
        }

        //垃圾方法
        private void KVztlRxY(boolean mshlgcm0, byte kixdiddyr1) {
            byte kixdiddyr1a = kixdiddyr1;
            boolean mshlgcm0a = mshlgcm0;
            new WeakReference("KVztlRxY" + mshlgcm0a + kixdiddyr1a + "KVztlRxY" + "" + "");
        }

        //垃圾方法
        private void chYtHsco(byte scpjxfzkfe0, char cnpbkypvu1) {
            char cnpbkypvu1a = cnpbkypvu1;
            byte scpjxfzkfe0a = scpjxfzkfe0;
            new StringBuilder("chYtHsco" + cnpbkypvu1a + scpjxfzkfe0a + "chYtHsco" + "" + "");
        }

        //垃圾方法
        private void IvpjqUwL(boolean sdhjsguij0) {
            boolean sdhjsguij0a = sdhjsguij0;
            new File("IvpjqUwL" + sdhjsguij0a + "IvpjqUwL" + "" + "");
        }

        //垃圾方法
        private void iTKkxLRf(long xedrugo0, char qvtibcnsn1, short ohcrbavweu2) {
            short ohcrbavweu2a = ohcrbavweu2;
            char qvtibcnsn1a = qvtibcnsn1;
            long xedrugo0a = xedrugo0;
            Log.e("iTKkxLRf", "iTKkxLRf" + ohcrbavweu2a + qvtibcnsn1a + xedrugo0a + "iTKkxLRf" + "" + "");
        }

        //垃圾方法
        private void nJclLglj(byte epiqebkrda0, char stutykoane1) {
            char stutykoane1a = stutykoane1;
            byte epiqebkrda0a = epiqebkrda0;
            new String("nJclLglj" + epiqebkrda0a + stutykoane1a + "nJclLglj" + "" + "");
        }

        //垃圾方法
        private void iXgNtUwv(byte uqjjvnks0, int rzqvlttttk1, boolean ikfzfqitsj2) {
            boolean ikfzfqitsj2a = ikfzfqitsj2;
            int rzqvlttttk1a = rzqvlttttk1;
            byte uqjjvnks0a = uqjjvnks0;
            new AttributedString("iXgNtUwv" + rzqvlttttk1a + ikfzfqitsj2a + uqjjvnks0a + "iXgNtUwv" + "" + "");
        }

        //垃圾方法
        private void XOQOTCGK(int dfaxnanp0) {
            int dfaxnanp0a = dfaxnanp0;
            System.out.println("XOQOTCGK" + dfaxnanp0a + "XOQOTCGK" + "" + "");
        }

        //垃圾方法
        private void WULOfUCK(char mwskqeqk0) {
            char mwskqeqk0a = mwskqeqk0;
            new StringBuffer("WULOfUCK" + mwskqeqk0a + "WULOfUCK" + "" + "");
        }

        //垃圾方法
        private void XCXnnxGh(int cevhyhv0, float ajwltsou1) {
            float ajwltsou1a = ajwltsou1;
            int cevhyhv0a = cevhyhv0;
            TextUtils.isEmpty("XCXnnxGh" + ajwltsou1a + cevhyhv0a + "XCXnnxGh" + "" + "");
        }

        //垃圾方法
        private void ZtNltUep(boolean otxciim0, int jsnuhuppg1, char wwvgvfs2, double ymzzsaots3) {
            double ymzzsaots3a = ymzzsaots3;
            char wwvgvfs2a = wwvgvfs2;
            int jsnuhuppg1a = jsnuhuppg1;
            boolean otxciim0a = otxciim0;
            Log.w("ZtNltUep", "ZtNltUep" + jsnuhuppg1a + otxciim0a + ymzzsaots3a + wwvgvfs2a + "ZtNltUep" + "" + "");
        }

        //垃圾方法
        private void UTOrheHY(double iamawsm0, boolean ymwykacyq1, long xiheaormge2, long kcgzxvvyo3) {
            long kcgzxvvyo3a = kcgzxvvyo3;
            long xiheaormge2a = xiheaormge2;
            boolean ymwykacyq1a = ymwykacyq1;
            double iamawsm0a = iamawsm0;
            new StringBuffer("UTOrheHY" + iamawsm0a + xiheaormge2a + ymwykacyq1a + kcgzxvvyo3a + "UTOrheHY" + "" + "");
        }

        //垃圾方法
        private void pvuwSMKA(byte agortrbec0) {
            byte agortrbec0a = agortrbec0;
            new StringBuilder("pvuwSMKA" + agortrbec0a + "pvuwSMKA" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            byte agortrbec0 = 20;
            long kcgzxvvyo3 = 12L;
            long xiheaormge2 = 24L;
            boolean ymwykacyq1 = false;
            double iamawsm0 = 100.100;
            double ymzzsaots3 = 86.86;
            char wwvgvfs2 = 48;
            int jsnuhuppg1 = 29;
            boolean otxciim0 = false;
            float ajwltsou1 = 23.23f;
            int cevhyhv0 = 64;
            char mwskqeqk0 = 23;
            int dfaxnanp0 = 50;
            boolean ikfzfqitsj2 = false;
            int rzqvlttttk1 = 72;
            byte uqjjvnks0 = 82;
            char stutykoane1 = 97;
            byte epiqebkrda0 = 86;
            short ohcrbavweu2 = 32;
            char qvtibcnsn1 = 45;
            long xedrugo0 = 96L;
            boolean sdhjsguij0 = true;
            char cnpbkypvu1 = 11;
            byte scpjxfzkfe0 = 87;
            byte kixdiddyr1 = 16;
            boolean mshlgcm0 = true;
            char clsgndh3 = 30;
            long abwfddejg2 = 26L;
            long jivtjdnt1 = 89L;
            double dvxwvyyp0 = 71.71;
            int lwatsuvht4 = 19;
            long bijctqeoj3 = 62L;
            short vkortvk2 = 94;
            int hduvyli1 = 1;
            int mtsdtom0 = 80;
            char jefntzyd2 = 37;
            byte oatloyzvip1 = 75;
            int ssthglpkl0 = 100;
            double ubotpectrm4 = 52.52;
            int uzolciwwmo3 = 13;
            double qngyyiz2 = 100.100;
            int gaeqflb1 = 20;
            byte kvxrwrax0 = 56;
            if (RecoverOrgManager.isDebug) {
                iTKkxLRf(xedrugo0, qvtibcnsn1, ohcrbavweu2);
                ofbFEBUX(mtsdtom0, hduvyli1, vkortvk2, bijctqeoj3, lwatsuvht4);
                KVztlRxY(mshlgcm0, kixdiddyr1);
                XOQOTCGK(dfaxnanp0);
                KVztlRxY(mshlgcm0, kixdiddyr1);
                Log.e(Recover1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            KVztlRxY(mshlgcm0, kixdiddyr1);
            RxlAkuNk(kvxrwrax0, gaeqflb1, qngyyiz2, uzolciwwmo3, ubotpectrm4);
            chYtHsco(scpjxfzkfe0, cnpbkypvu1);
            IvpjqUwL(sdhjsguij0);
            XCXnnxGh(cevhyhv0, ajwltsou1);
            KVztlRxY(mshlgcm0, kixdiddyr1);
            KVztlRxY(mshlgcm0, kixdiddyr1);
            UTOrheHY(iamawsm0, ymwykacyq1, xiheaormge2, kcgzxvvyo3);
            iTKkxLRf(xedrugo0, qvtibcnsn1, ohcrbavweu2);
            ZtNltUep(otxciim0, jsnuhuppg1, wwvgvfs2, ymzzsaots3);
            subBinder = null;
            XOQOTCGK(dfaxnanp0);
            pvuwSMKA(agortrbec0);
            pvuwSMKA(agortrbec0);
            ZtNltUep(otxciim0, jsnuhuppg1, wwvgvfs2, ymzzsaots3);
            ofbFEBUX(mtsdtom0, hduvyli1, vkortvk2, bijctqeoj3, lwatsuvht4);
            KVztlRxY(mshlgcm0, kixdiddyr1);
            eTEAHcLm(dvxwvyyp0, jivtjdnt1, abwfddejg2, clsgndh3);
            Recover1Service.isReTryBinding = true;
            WULOfUCK(mwskqeqk0);
            UTOrheHY(iamawsm0, ymwykacyq1, xiheaormge2, kcgzxvvyo3);
            XOQOTCGK(dfaxnanp0);
            pvuwSMKA(agortrbec0);
            ofbFEBUX(mtsdtom0, hduvyli1, vkortvk2, bijctqeoj3, lwatsuvht4);
            nJclLglj(epiqebkrda0, stutykoane1);
            OWOfRyKi(ssthglpkl0, oatloyzvip1, jefntzyd2);
            IvpjqUwL(sdhjsguij0);
            pvuwSMKA(agortrbec0);
            nJclLglj(epiqebkrda0, stutykoane1);
            startSubService(2, false);
        }

        //垃圾方法
        private void XZgWPman(short inbcridc0, long nhfpnyptbp1, boolean itlulcy2, byte iwpuafaigk3, char mriqmqatzo4) {
            char mriqmqatzo4a = mriqmqatzo4;
            byte iwpuafaigk3a = iwpuafaigk3;
            boolean itlulcy2a = itlulcy2;
            long nhfpnyptbp1a = nhfpnyptbp1;
            short inbcridc0a = inbcridc0;
            new StringReader("XZgWPman" + itlulcy2a + nhfpnyptbp1a + mriqmqatzo4a + iwpuafaigk3a + inbcridc0a + "XZgWPman" + "" + "");
        }

        //垃圾方法
        private void pkOiXQfw(short trhkvkkhen0, char dvbpukpp1) {
            char dvbpukpp1a = dvbpukpp1;
            short trhkvkkhen0a = trhkvkkhen0;
            new StringBuilder("pkOiXQfw" + trhkvkkhen0a + dvbpukpp1a + "pkOiXQfw" + "" + "");
        }

        //垃圾方法
        private void EaltaSOt(long mnjcjcvpw0, long ifaviju1) {
            long ifaviju1a = ifaviju1;
            long mnjcjcvpw0a = mnjcjcvpw0;
            new Thread("EaltaSOt" + mnjcjcvpw0a + ifaviju1a + "EaltaSOt" + "" + "");
        }

        //垃圾方法
        private void HxBJlMaQ(short pohyvfc0, int eexraxumnf1, char pwmkdpbo2, boolean avvodbjp3, byte fwgtchlcn4) {
            byte fwgtchlcn4a = fwgtchlcn4;
            boolean avvodbjp3a = avvodbjp3;
            char pwmkdpbo2a = pwmkdpbo2;
            int eexraxumnf1a = eexraxumnf1;
            short pohyvfc0a = pohyvfc0;
            Log.w("HxBJlMaQ", "HxBJlMaQ" + avvodbjp3a + eexraxumnf1a + pwmkdpbo2a + fwgtchlcn4a + pohyvfc0a + "HxBJlMaQ" + "" + "");
        }

        //垃圾方法
        private void CHDxzVKy(char jlnotojy0, boolean cxgttbz1, short iqvdefq2, char qexqxdy3) {
            char qexqxdy3a = qexqxdy3;
            short iqvdefq2a = iqvdefq2;
            boolean cxgttbz1a = cxgttbz1;
            char jlnotojy0a = jlnotojy0;
            TextUtils.isEmpty("CHDxzVKy" + cxgttbz1a + jlnotojy0a + qexqxdy3a + iqvdefq2a + "CHDxzVKy" + "" + "");
        }

        //垃圾方法
        private void anSpHKjM(float vaedstmop0, boolean lczsqoabv1, char oqhylbbtio2, char ucoxbuk3, int jdhqpvwn4) {
            int jdhqpvwn4a = jdhqpvwn4;
            char ucoxbuk3a = ucoxbuk3;
            char oqhylbbtio2a = oqhylbbtio2;
            boolean lczsqoabv1a = lczsqoabv1;
            float vaedstmop0a = vaedstmop0;
            new String("anSpHKjM" + lczsqoabv1a + ucoxbuk3a + oqhylbbtio2a + jdhqpvwn4a + vaedstmop0a + "anSpHKjM" + "" + "");
        }

        //垃圾方法
        private void rVIMTrtO(byte xngvqdkyz0, boolean khjushx1, char mhsuytedf2, byte llaqxpm3, float pjfxyqemzz4) {
            float pjfxyqemzz4a = pjfxyqemzz4;
            byte llaqxpm3a = llaqxpm3;
            char mhsuytedf2a = mhsuytedf2;
            boolean khjushx1a = khjushx1;
            byte xngvqdkyz0a = xngvqdkyz0;
            new Thread("rVIMTrtO" + pjfxyqemzz4a + mhsuytedf2a + llaqxpm3a + khjushx1a + xngvqdkyz0a + "rVIMTrtO" + "" + "");
        }

        //垃圾方法
        private void rbJkYafW(double mzpbzeoxb0, short twduork1, short cqgcuwvv2, boolean grakvuid3) {
            boolean grakvuid3a = grakvuid3;
            short cqgcuwvv2a = cqgcuwvv2;
            short twduork1a = twduork1;
            double mzpbzeoxb0a = mzpbzeoxb0;
        }

        public void onBindingDied(ComponentName name) {
            boolean grakvuid3 = false;
            short cqgcuwvv2 = 21;
            short twduork1 = 45;
            double mzpbzeoxb0 = 71.71;
            float pjfxyqemzz4 = 32.32f;
            byte llaqxpm3 = 11;
            char mhsuytedf2 = 95;
            boolean khjushx1 = false;
            byte xngvqdkyz0 = 73;
            int jdhqpvwn4 = 35;
            char ucoxbuk3 = 45;
            char oqhylbbtio2 = 70;
            boolean lczsqoabv1 = true;
            float vaedstmop0 = 58.58f;
            char qexqxdy3 = 16;
            short iqvdefq2 = 50;
            boolean cxgttbz1 = false;
            char jlnotojy0 = 35;
            byte fwgtchlcn4 = 51;
            boolean avvodbjp3 = true;
            char pwmkdpbo2 = 90;
            int eexraxumnf1 = 18;
            short pohyvfc0 = 38;
            long ifaviju1 = 31L;
            long mnjcjcvpw0 = 27L;
            char dvbpukpp1 = 93;
            short trhkvkkhen0 = 95;
            char mriqmqatzo4 = 64;
            byte iwpuafaigk3 = 31;
            boolean itlulcy2 = true;
            long nhfpnyptbp1 = 12L;
            short inbcridc0 = 60;
            if (RecoverOrgManager.isDebug) {
                EaltaSOt(mnjcjcvpw0, ifaviju1);
                pkOiXQfw(trhkvkkhen0, dvbpukpp1);
                CHDxzVKy(jlnotojy0, cxgttbz1, iqvdefq2, qexqxdy3);
                XZgWPman(inbcridc0, nhfpnyptbp1, itlulcy2, iwpuafaigk3, mriqmqatzo4);
                rbJkYafW(mzpbzeoxb0, twduork1, cqgcuwvv2, grakvuid3);
                rbJkYafW(mzpbzeoxb0, twduork1, cqgcuwvv2, grakvuid3);
                pkOiXQfw(trhkvkkhen0, dvbpukpp1);
                anSpHKjM(vaedstmop0, lczsqoabv1, oqhylbbtio2, ucoxbuk3, jdhqpvwn4);
                XZgWPman(inbcridc0, nhfpnyptbp1, itlulcy2, iwpuafaigk3, mriqmqatzo4);
                Log.e(Recover1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private byte lGUorZP = 100;

    //垃圾变量
    private boolean idzqxXd = false;

    //垃圾变量
    private char xuPiLDw = 14;

    //垃圾变量
    private float tGCuzdp = 19.19f;

    //垃圾变量
    private double HCEHAtW = 92.92;

    //垃圾变量
    private char Anucbya = 50;

    //垃圾变量
    private short Kgqzymr = 42;

    //垃圾变量
    private short KWrsUCq = 26;

    //垃圾变量
    private boolean QAKXFln = true;

    //垃圾变量
    private byte gmWtYbh = 24;

    //垃圾方法
    private void hAAPBhjD(int gitrbxj0, byte owjbjuz1, double jtanvras2, int exdlmtdu3) {
        int exdlmtdu3a = exdlmtdu3;
        double jtanvras2a = jtanvras2;
        byte owjbjuz1a = owjbjuz1;
        int gitrbxj0a = gitrbxj0;
        System.out.println("hAAPBhjD" + jtanvras2a + owjbjuz1a + gitrbxj0a + exdlmtdu3a + "hAAPBhjD" + QAKXFln + HCEHAtW + Kgqzymr + lhfNNZg + sETMgqy + tEwkbqd + DpCEstk + vNDhcwp + HMZmhTp + lGUorZP + hPjSfna + pZRODbs + EzJXPeo + ycvbGUz + xuPiLDw + VyshFOt + "");
    }

    //垃圾方法
    private void SdSrbYbz(byte irpuwfeny0, short smroubew1) {
        short smroubew1a = smroubew1;
        byte irpuwfeny0a = irpuwfeny0;
        new Intent("SdSrbYbz" + smroubew1a + irpuwfeny0a + "SdSrbYbz" + DpCEstk + tEwkbqd + hPjSfna + sETMgqy + VyshFOt + EzJXPeo + HCEHAtW + lhfNNZg + HMZmhTp + xuPiLDw + QAKXFln + pZRODbs + ycvbGUz + lGUorZP + Kgqzymr + vNDhcwp + "");
    }

    //垃圾方法
    private void yqzJJpKE(float sehjnzdo0, short oaqbjebpjp1, float eeslcuxzck2, byte ghubiusv3, long rrgqknejz4) {
        long rrgqknejz4a = rrgqknejz4;
        byte ghubiusv3a = ghubiusv3;
        float eeslcuxzck2a = eeslcuxzck2;
        short oaqbjebpjp1a = oaqbjebpjp1;
        float sehjnzdo0a = sehjnzdo0;
        new Thread("yqzJJpKE" + ghubiusv3a + oaqbjebpjp1a + rrgqknejz4a + eeslcuxzck2a + sehjnzdo0a + "yqzJJpKE" + vNDhcwp + EzJXPeo + xuPiLDw + QAKXFln + lGUorZP + HCEHAtW + DpCEstk + Kgqzymr + hPjSfna + lhfNNZg + ycvbGUz + HMZmhTp + VyshFOt + sETMgqy + pZRODbs + tEwkbqd + "");
    }

    //垃圾方法
    private void WWtXlKxD(boolean dqqfxvj0) {
        boolean dqqfxvj0a = dqqfxvj0;
        Log.e("WWtXlKxD", "WWtXlKxD" + dqqfxvj0a + "WWtXlKxD" + pZRODbs + hPjSfna + lGUorZP + EzJXPeo + Kgqzymr + ycvbGUz + DpCEstk + sETMgqy + HMZmhTp + VyshFOt + HCEHAtW + xuPiLDw + vNDhcwp + lhfNNZg + tEwkbqd + QAKXFln + "");
    }

    //垃圾方法
    private void OfhFnwKQ(short zjjjztbeu0, double ezjjvifce1) {
        double ezjjvifce1a = ezjjvifce1;
        short zjjjztbeu0a = zjjjztbeu0;
    }

    //垃圾方法
    private void VfophJAS(int twsrwbi0, char hzciqfgwe1) {
        char hzciqfgwe1a = hzciqfgwe1;
        int twsrwbi0a = twsrwbi0;
        new AttributedString("VfophJAS" + twsrwbi0a + hzciqfgwe1a + "VfophJAS" + ycvbGUz + HMZmhTp + lGUorZP + hPjSfna + xuPiLDw + Kgqzymr + VyshFOt + vNDhcwp + lhfNNZg + pZRODbs + QAKXFln + tEwkbqd + DpCEstk + sETMgqy + HCEHAtW + EzJXPeo + "");
    }

    //垃圾方法
    private void pGHUESqn(double fulwhvbvs0) {
        double fulwhvbvs0a = fulwhvbvs0;
        new Intent("pGHUESqn" + fulwhvbvs0a + "pGHUESqn" + sETMgqy + VyshFOt + ycvbGUz + vNDhcwp + QAKXFln + lGUorZP + tEwkbqd + hPjSfna + Kgqzymr + DpCEstk + HCEHAtW + xuPiLDw + HMZmhTp + lhfNNZg + EzJXPeo + pZRODbs + "");
    }

    //垃圾方法
    private void OPcmfrNs(long tggkxgeyz0) {
        long tggkxgeyz0a = tggkxgeyz0;
        Log.i("OPcmfrNs", "OPcmfrNs" + tggkxgeyz0a + "OPcmfrNs" + HMZmhTp + lGUorZP + xuPiLDw + tEwkbqd + HCEHAtW + lhfNNZg + sETMgqy + QAKXFln + hPjSfna + vNDhcwp + EzJXPeo + pZRODbs + Kgqzymr + VyshFOt + DpCEstk + ycvbGUz + "");
    }

    public String toString() {
        long tggkxgeyz0 = 75L;
        double fulwhvbvs0 = 94.94;
        char hzciqfgwe1 = 40;
        int twsrwbi0 = 40;
        double ezjjvifce1 = 52.52;
        short zjjjztbeu0 = 73;
        boolean dqqfxvj0 = true;
        long rrgqknejz4 = 77L;
        byte ghubiusv3 = 62;
        float eeslcuxzck2 = 64.64f;
        short oaqbjebpjp1 = 93;
        float sehjnzdo0 = 20.20f;
        short smroubew1 = 57;
        byte irpuwfeny0 = 85;
        int exdlmtdu3 = 77;
        double jtanvras2 = 32.32;
        byte owjbjuz1 = 34;
        int gitrbxj0 = 4;
        pGHUESqn(fulwhvbvs0);
        hAAPBhjD(gitrbxj0, owjbjuz1, jtanvras2, exdlmtdu3);
        OfhFnwKQ(zjjjztbeu0, ezjjvifce1);
        hAAPBhjD(gitrbxj0, owjbjuz1, jtanvras2, exdlmtdu3);
        System.out.println("" + KWrsUCq + gmWtYbh + Anucbya + tGCuzdp + idzqxXd + "");
        hAAPBhjD(gitrbxj0, owjbjuz1, jtanvras2, exdlmtdu3);
        WWtXlKxD(dqqfxvj0);
        VfophJAS(twsrwbi0, hzciqfgwe1);
        yqzJJpKE(sehjnzdo0, oaqbjebpjp1, eeslcuxzck2, ghubiusv3, rrgqknejz4);
        WWtXlKxD(dqqfxvj0);
        yqzJJpKE(sehjnzdo0, oaqbjebpjp1, eeslcuxzck2, ghubiusv3, rrgqknejz4);
        VfophJAS(twsrwbi0, hzciqfgwe1);
        VfophJAS(twsrwbi0, hzciqfgwe1);
        WWtXlKxD(dqqfxvj0);
        VfophJAS(twsrwbi0, hzciqfgwe1);
        return super.toString();
    }
}
