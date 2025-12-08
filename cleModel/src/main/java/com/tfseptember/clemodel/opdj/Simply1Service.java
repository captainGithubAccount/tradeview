package com.tfseptember.clemodel.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
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

public class Simply1Service extends Service {

    //垃圾变量
    private long iMuQoEQ = 65L;

    public static long lastTime = 0L;

    //垃圾变量
    private double kVHMZnW = 14.14;

    private static String TAG = "xxx";

    //垃圾变量
    private double DsiGHwZ = 24.24;

    private LocalBinder mLocalBinder;

    //垃圾变量
    private char jSpWUso = 80;

    private LocalServiceConnection mLocalServiceConn;

    //垃圾变量
    private byte NwYBdSC = 72;

    public static Boolean isLiving = false;

    //垃圾变量
    private int hOTVNnh = 20;

    public static Boolean isReTryBinding = false;

    //垃圾变量
    private int qiBgOVr = 58;

    private static long delayTime = 250L;

    //垃圾变量
    private float NCcCJeK = 23.23f;

    public static boolean isStartService = false;

    //垃圾变量
    private byte FrcvoMD = 2;

    private IBinder subBinder = null;

    //垃圾变量
    private int zbbhjdI = 14;

    private Runnable run = new Runnable() {

        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };

    //垃圾变量
    private long zjWuzyZ = 78L;

    int nextNum = -1;

    public Simply1Service() {
    }

    //垃圾方法
    static private void bWRfGGcK(byte nhsxmus0) {
        byte nhsxmus0a = nhsxmus0;
        TextUtils.isEmpty("bWRfGGcK" + nhsxmus0a + "bWRfGGcK" + "");
    }

    //垃圾方法
    static private void fkYkzhLU(byte cxjrnwlt0) {
        byte cxjrnwlt0a = cxjrnwlt0;
        TextUtils.isEmpty("fkYkzhLU" + cxjrnwlt0a + "fkYkzhLU" + "");
    }

    //垃圾方法
    static private void IcBwyNsQ(long vvucznhiqa0, char hpiudfbx1) {
        char hpiudfbx1a = hpiudfbx1;
        long vvucznhiqa0a = vvucznhiqa0;
        Log.w("IcBwyNsQ", "IcBwyNsQ" + vvucznhiqa0a + hpiudfbx1a + "IcBwyNsQ" + "");
    }

    //垃圾方法
    static private void KdvsntsN(byte iotqzpluux0, float ordejdrvn1, long bjdodfvee2) {
        long bjdodfvee2a = bjdodfvee2;
        float ordejdrvn1a = ordejdrvn1;
        byte iotqzpluux0a = iotqzpluux0;
        new StringBuffer("KdvsntsN" + iotqzpluux0a + ordejdrvn1a + bjdodfvee2a + "KdvsntsN" + "");
    }

    public static void tryStartLaunchMainService() {
        long bjdodfvee2 = 42L;
        float ordejdrvn1 = 21.21f;
        byte iotqzpluux0 = 25;
        char hpiudfbx1 = 78;
        long vvucznhiqa0 = 51L;
        byte cxjrnwlt0 = 35;
        byte nhsxmus0 = 11;
        KdvsntsN(iotqzpluux0, ordejdrvn1, bjdodfvee2);
        KdvsntsN(iotqzpluux0, ordejdrvn1, bjdodfvee2);
        bWRfGGcK(nhsxmus0);
        IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
        bWRfGGcK(nhsxmus0);
        IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
        fkYkzhLU(cxjrnwlt0);
        fkYkzhLU(cxjrnwlt0);
        IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
        fkYkzhLU(cxjrnwlt0);
        if (isLiving) {
            bWRfGGcK(nhsxmus0);
            IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
            fkYkzhLU(cxjrnwlt0);
            fkYkzhLU(cxjrnwlt0);
            bWRfGGcK(nhsxmus0);
            IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
            KdvsntsN(iotqzpluux0, ordejdrvn1, bjdodfvee2);
            bWRfGGcK(nhsxmus0);
            IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
            IcBwyNsQ(vvucznhiqa0, hpiudfbx1);
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(SimplyHouseworkrOrgManager.mContext);
            }
        }
    }

    //垃圾方法
    static private void EnPPXTKI(short epuxidl0) {
        short epuxidl0a = epuxidl0;
        TextUtils.isEmpty("EnPPXTKI" + epuxidl0a + "EnPPXTKI" + "");
    }

    //垃圾方法
    static private void KzlySIqC(boolean gbarmqpfle0, short mozvuvy1) {
        short mozvuvy1a = mozvuvy1;
        boolean gbarmqpfle0a = gbarmqpfle0;
        Log.i("KzlySIqC", "KzlySIqC" + gbarmqpfle0a + mozvuvy1a + "KzlySIqC" + "");
    }

    //垃圾方法
    static private void VqcSZFqi(double qwtjrehdwy0, float hnhkiqs1) {
        float hnhkiqs1a = hnhkiqs1;
        double qwtjrehdwy0a = qwtjrehdwy0;
        TextUtils.isEmpty("VqcSZFqi" + qwtjrehdwy0a + hnhkiqs1a + "VqcSZFqi" + "");
    }

    //垃圾方法
    static private void rmuCgRYg(char leutakx0, boolean brmklscdr1, short bqovliudtm2, char baygqjam3, short dcgpmacwki4) {
        short dcgpmacwki4a = dcgpmacwki4;
        char baygqjam3a = baygqjam3;
        short bqovliudtm2a = bqovliudtm2;
        boolean brmklscdr1a = brmklscdr1;
        char leutakx0a = leutakx0;
        new AttributedString("rmuCgRYg" + brmklscdr1a + bqovliudtm2a + dcgpmacwki4a + baygqjam3a + leutakx0a + "rmuCgRYg" + "");
    }

    //垃圾方法
    static private void dwDGXYKQ(short qreahppg0, float mzawbly1) {
        float mzawbly1a = mzawbly1;
        short qreahppg0a = qreahppg0;
        TextUtils.isDigitsOnly("dwDGXYKQ" + qreahppg0a + mzawbly1a + "dwDGXYKQ" + "");
    }

    //垃圾方法
    static private void udALzJkP(double ksoguqhay0) {
        double ksoguqhay0a = ksoguqhay0;
        Log.w("udALzJkP", "udALzJkP" + ksoguqhay0a + "udALzJkP" + "");
    }

    //垃圾方法
    static private void XFbhVogm(int mbysvlyi0) {
        int mbysvlyi0a = mbysvlyi0;
        new AttributedString("XFbhVogm" + mbysvlyi0a + "XFbhVogm" + "");
    }

    //垃圾方法
    static private void wQeQTQza(boolean vdiilysc0, float gcbwrsxxof1, long txandawu2, int flmznpg3, boolean zpcagvy4) {
        boolean zpcagvy4a = zpcagvy4;
        int flmznpg3a = flmznpg3;
        long txandawu2a = txandawu2;
        float gcbwrsxxof1a = gcbwrsxxof1;
        boolean vdiilysc0a = vdiilysc0;
        new Thread("wQeQTQza" + zpcagvy4a + gcbwrsxxof1a + txandawu2a + flmznpg3a + vdiilysc0a + "wQeQTQza" + "");
    }

    private static void startService(Context context) {
        boolean zpcagvy4 = true;
        int flmznpg3 = 6;
        long txandawu2 = 4L;
        float gcbwrsxxof1 = 17.17f;
        boolean vdiilysc0 = true;
        int mbysvlyi0 = 76;
        double ksoguqhay0 = 25.25;
        float mzawbly1 = 90.90f;
        short qreahppg0 = 74;
        short dcgpmacwki4 = 81;
        char baygqjam3 = 81;
        short bqovliudtm2 = 67;
        boolean brmklscdr1 = true;
        char leutakx0 = 34;
        float hnhkiqs1 = 57.57f;
        double qwtjrehdwy0 = 65.65;
        short mozvuvy1 = 54;
        boolean gbarmqpfle0 = true;
        short epuxidl0 = 36;
        VqcSZFqi(qwtjrehdwy0, hnhkiqs1);
        VqcSZFqi(qwtjrehdwy0, hnhkiqs1);
        KzlySIqC(gbarmqpfle0, mozvuvy1);
        EnPPXTKI(epuxidl0);
        wQeQTQza(vdiilysc0, gcbwrsxxof1, txandawu2, flmznpg3, zpcagvy4);
        dwDGXYKQ(qreahppg0, mzawbly1);
        udALzJkP(ksoguqhay0);
        dwDGXYKQ(qreahppg0, mzawbly1);
        udALzJkP(ksoguqhay0);
        udALzJkP(ksoguqhay0);
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(TAG, "LocalService startService5");
        }
        XFbhVogm(mbysvlyi0);
        EnPPXTKI(epuxidl0);
        wQeQTQza(vdiilysc0, gcbwrsxxof1, txandawu2, flmznpg3, zpcagvy4);
        XFbhVogm(mbysvlyi0);
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    //垃圾方法
    private void TnndzWRN(short bcqsexorkc0, int dcjwpnk1, float ihfzvwmm2, char qixvqcbul3) {
        char qixvqcbul3a = qixvqcbul3;
        float ihfzvwmm2a = ihfzvwmm2;
        int dcjwpnk1a = dcjwpnk1;
        short bcqsexorkc0a = bcqsexorkc0;
        new WeakReference("TnndzWRN" + qixvqcbul3a + bcqsexorkc0a + ihfzvwmm2a + dcjwpnk1a + "TnndzWRN" + hOTVNnh + FrcvoMD + DsiGHwZ + NCcCJeK + UOSnIGP + jSpWUso + iMuQoEQ + fbGvVWa + qiBgOVr + lJkJogG + NwYBdSC + zjWuzyZ + zbbhjdI + kVHMZnW + "");
    }

    //垃圾方法
    private void EQXNBeIm(short lhwmjpi0, double wsohanmdb1) {
        double wsohanmdb1a = wsohanmdb1;
        short lhwmjpi0a = lhwmjpi0;
        new WeakReference("EQXNBeIm" + lhwmjpi0a + wsohanmdb1a + "EQXNBeIm" + DsiGHwZ + zbbhjdI + NwYBdSC + NCcCJeK + qiBgOVr + zjWuzyZ + UOSnIGP + hOTVNnh + FrcvoMD + fbGvVWa + jSpWUso + kVHMZnW + lJkJogG + iMuQoEQ + "");
    }

    //垃圾方法
    private void IwGoLSKY(double xfbdwin0, float pnswrbyj1, short ktiwdjkil2, char egdfpnowt3) {
        char egdfpnowt3a = egdfpnowt3;
        short ktiwdjkil2a = ktiwdjkil2;
        float pnswrbyj1a = pnswrbyj1;
        double xfbdwin0a = xfbdwin0;
        new AttributedString("IwGoLSKY" + egdfpnowt3a + ktiwdjkil2a + xfbdwin0a + pnswrbyj1a + "IwGoLSKY" + zjWuzyZ + hOTVNnh + iMuQoEQ + fbGvVWa + qiBgOVr + jSpWUso + FrcvoMD + zbbhjdI + NCcCJeK + UOSnIGP + lJkJogG + DsiGHwZ + NwYBdSC + kVHMZnW + "");
    }

    //垃圾方法
    private void QNbEDYPk(double gwqtcjl0, short wqvbmqmqek1, char bflritcnhd2, byte kiyczaai3, int cngrenfznk4) {
        int cngrenfznk4a = cngrenfznk4;
        byte kiyczaai3a = kiyczaai3;
        char bflritcnhd2a = bflritcnhd2;
        short wqvbmqmqek1a = wqvbmqmqek1;
        double gwqtcjl0a = gwqtcjl0;
        new File("QNbEDYPk" + wqvbmqmqek1a + cngrenfznk4a + kiyczaai3a + gwqtcjl0a + bflritcnhd2a + "QNbEDYPk" + jSpWUso + qiBgOVr + FrcvoMD + NCcCJeK + NwYBdSC + DsiGHwZ + iMuQoEQ + kVHMZnW + hOTVNnh + UOSnIGP + lJkJogG + fbGvVWa + zjWuzyZ + zbbhjdI + "");
    }

    //垃圾方法
    private void qMYbkWXD(char dgacybq0) {
        char dgacybq0a = dgacybq0;
        System.out.println("qMYbkWXD" + dgacybq0a + "qMYbkWXD" + iMuQoEQ + NCcCJeK + FrcvoMD + kVHMZnW + DsiGHwZ + hOTVNnh + lJkJogG + zbbhjdI + NwYBdSC + fbGvVWa + jSpWUso + zjWuzyZ + UOSnIGP + qiBgOVr + "");
    }

    //垃圾方法
    private void JVWcokYX(char pemrcabmyc0, int zgekmkzlf1, char setpokkm2) {
        char setpokkm2a = setpokkm2;
        int zgekmkzlf1a = zgekmkzlf1;
        char pemrcabmyc0a = pemrcabmyc0;
        TextUtils.isDigitsOnly("JVWcokYX" + setpokkm2a + pemrcabmyc0a + zgekmkzlf1a + "JVWcokYX" + DsiGHwZ + NCcCJeK + UOSnIGP + hOTVNnh + NwYBdSC + qiBgOVr + iMuQoEQ + FrcvoMD + kVHMZnW + lJkJogG + zjWuzyZ + jSpWUso + fbGvVWa + zbbhjdI + "");
    }

    //垃圾方法
    private void KQCWrtEN(double ynnwwdd0, int rticacmnf1) {
        int rticacmnf1a = rticacmnf1;
        double ynnwwdd0a = ynnwwdd0;
        new Intent("KQCWrtEN" + ynnwwdd0a + rticacmnf1a + "KQCWrtEN" + kVHMZnW + hOTVNnh + fbGvVWa + iMuQoEQ + NwYBdSC + jSpWUso + qiBgOVr + lJkJogG + NCcCJeK + UOSnIGP + zbbhjdI + zjWuzyZ + DsiGHwZ + FrcvoMD + "");
    }

    //垃圾方法
    private void GhIWSMhe(char krflwcjilr0, int rufanls1, short yhumgbo2) {
        short yhumgbo2a = yhumgbo2;
        int rufanls1a = rufanls1;
        char krflwcjilr0a = krflwcjilr0;
        new Thread("GhIWSMhe" + krflwcjilr0a + yhumgbo2a + rufanls1a + "GhIWSMhe" + hOTVNnh + zbbhjdI + kVHMZnW + iMuQoEQ + zjWuzyZ + fbGvVWa + NCcCJeK + FrcvoMD + lJkJogG + DsiGHwZ + UOSnIGP + jSpWUso + qiBgOVr + NwYBdSC + "");
    }

    //垃圾方法
    private void BtWKoamH(byte enufhrw0) {
        byte enufhrw0a = enufhrw0;
        new Intent("BtWKoamH" + enufhrw0a + "BtWKoamH" + zjWuzyZ + NCcCJeK + qiBgOVr + fbGvVWa + kVHMZnW + jSpWUso + FrcvoMD + DsiGHwZ + lJkJogG + hOTVNnh + NwYBdSC + UOSnIGP + iMuQoEQ + zbbhjdI + "");
    }

    //垃圾方法
    private void EhsCcwsz(byte tnbadwlvfw0) {
        byte tnbadwlvfw0a = tnbadwlvfw0;
    }

    //垃圾方法
    private void sHWIIeUL(double kkvgojwxdq0, boolean ryuxrlru1, double jdpgfota2) {
        double jdpgfota2a = jdpgfota2;
        boolean ryuxrlru1a = ryuxrlru1;
        double kkvgojwxdq0a = kkvgojwxdq0;
        new Thread("sHWIIeUL" + ryuxrlru1a + kkvgojwxdq0a + jdpgfota2a + "sHWIIeUL" + zjWuzyZ + qiBgOVr + kVHMZnW + NwYBdSC + NCcCJeK + lJkJogG + hOTVNnh + UOSnIGP + FrcvoMD + zbbhjdI + jSpWUso + fbGvVWa + iMuQoEQ + DsiGHwZ + "");
    }

    //垃圾方法
    private void dxArWXyl(float pppjzfjcu0) {
        float pppjzfjcu0a = pppjzfjcu0;
        new Intent("dxArWXyl" + pppjzfjcu0a + "dxArWXyl" + fbGvVWa + zjWuzyZ + NwYBdSC + DsiGHwZ + kVHMZnW + lJkJogG + zbbhjdI + iMuQoEQ + UOSnIGP + jSpWUso + FrcvoMD + qiBgOVr + hOTVNnh + NCcCJeK + "");
    }

    //垃圾方法
    private void NBjZNdOp(float zvpmlymse0) {
        float zvpmlymse0a = zvpmlymse0;
        new AttributedString("NBjZNdOp" + zvpmlymse0a + "NBjZNdOp" + DsiGHwZ + NwYBdSC + lJkJogG + zbbhjdI + fbGvVWa + FrcvoMD + iMuQoEQ + qiBgOVr + hOTVNnh + UOSnIGP + jSpWUso + zjWuzyZ + NCcCJeK + kVHMZnW + "");
    }

    //垃圾方法
    private void qcpiwGjN(int iermrzdx0, float milfhxzpty1, byte ohnidhcc2) {
        byte ohnidhcc2a = ohnidhcc2;
        float milfhxzpty1a = milfhxzpty1;
        int iermrzdx0a = iermrzdx0;
        new Intent("qcpiwGjN" + milfhxzpty1a + ohnidhcc2a + iermrzdx0a + "qcpiwGjN" + DsiGHwZ + kVHMZnW + FrcvoMD + NwYBdSC + fbGvVWa + hOTVNnh + qiBgOVr + zbbhjdI + iMuQoEQ + UOSnIGP + NCcCJeK + zjWuzyZ + jSpWUso + lJkJogG + "");
    }

    //垃圾方法
    private void JnpEEseh(float pthtqur0, byte ptnrufk1, int pvqkushoo2, int vmztjgaj3) {
        int vmztjgaj3a = vmztjgaj3;
        int pvqkushoo2a = pvqkushoo2;
        byte ptnrufk1a = ptnrufk1;
        float pthtqur0a = pthtqur0;
        Log.e("JnpEEseh", "JnpEEseh" + pthtqur0a + vmztjgaj3a + pvqkushoo2a + ptnrufk1a + "JnpEEseh" + hOTVNnh + FrcvoMD + iMuQoEQ + jSpWUso + zbbhjdI + zjWuzyZ + NwYBdSC + NCcCJeK + fbGvVWa + qiBgOVr + lJkJogG + DsiGHwZ + UOSnIGP + kVHMZnW + "");
    }

    //垃圾方法
    private void csgCnxCJ(short lsnymeqtb0, byte pnipamtby1, long qaqpqoh2, char iysdxswtmo3, boolean npgehoxccx4) {
        boolean npgehoxccx4a = npgehoxccx4;
        char iysdxswtmo3a = iysdxswtmo3;
        long qaqpqoh2a = qaqpqoh2;
        byte pnipamtby1a = pnipamtby1;
        short lsnymeqtb0a = lsnymeqtb0;
        new WeakReference("csgCnxCJ" + pnipamtby1a + npgehoxccx4a + lsnymeqtb0a + qaqpqoh2a + iysdxswtmo3a + "csgCnxCJ" + jSpWUso + lJkJogG + kVHMZnW + fbGvVWa + qiBgOVr + UOSnIGP + FrcvoMD + NwYBdSC + zjWuzyZ + iMuQoEQ + DsiGHwZ + zbbhjdI + hOTVNnh + NCcCJeK + "");
    }

    //垃圾方法
    private void sCMZKaQC(long mhvfxpyv0, double qiqzpngvz1, double xucbwsi2) {
        double xucbwsi2a = xucbwsi2;
        double qiqzpngvz1a = qiqzpngvz1;
        long mhvfxpyv0a = mhvfxpyv0;
        Log.e("sCMZKaQC", "sCMZKaQC" + xucbwsi2a + qiqzpngvz1a + mhvfxpyv0a + "sCMZKaQC" + jSpWUso + kVHMZnW + NwYBdSC + NCcCJeK + qiBgOVr + lJkJogG + hOTVNnh + UOSnIGP + zjWuzyZ + iMuQoEQ + fbGvVWa + zbbhjdI + DsiGHwZ + FrcvoMD + "");
    }

    //垃圾方法
    private void RLZDGumh(byte jvtrkcptof0) {
        byte jvtrkcptof0a = jvtrkcptof0;
        new Intent("RLZDGumh" + jvtrkcptof0a + "RLZDGumh" + zjWuzyZ + DsiGHwZ + FrcvoMD + NCcCJeK + UOSnIGP + zbbhjdI + lJkJogG + iMuQoEQ + fbGvVWa + qiBgOVr + NwYBdSC + jSpWUso + kVHMZnW + hOTVNnh + "");
    }

    //垃圾方法
    private void rZTqKiOu(float dycexopwd0) {
        float dycexopwd0a = dycexopwd0;
        new String("rZTqKiOu" + dycexopwd0a + "rZTqKiOu" + UOSnIGP + qiBgOVr + hOTVNnh + jSpWUso + zbbhjdI + lJkJogG + DsiGHwZ + zjWuzyZ + NwYBdSC + kVHMZnW + iMuQoEQ + FrcvoMD + NCcCJeK + fbGvVWa + "");
    }

    //垃圾方法
    private void DtYzxzoT(char kskivlkey0, byte blowiokhkr1, float vvcqjnzr2, char vkakfnt3, short clrifpo4) {
        short clrifpo4a = clrifpo4;
        char vkakfnt3a = vkakfnt3;
        float vvcqjnzr2a = vvcqjnzr2;
        byte blowiokhkr1a = blowiokhkr1;
        char kskivlkey0a = kskivlkey0;
        TextUtils.isEmpty("DtYzxzoT" + vvcqjnzr2a + vkakfnt3a + clrifpo4a + kskivlkey0a + blowiokhkr1a + "DtYzxzoT" + hOTVNnh + iMuQoEQ + NwYBdSC + NCcCJeK + kVHMZnW + zbbhjdI + jSpWUso + DsiGHwZ + zjWuzyZ + FrcvoMD + qiBgOVr + UOSnIGP + lJkJogG + fbGvVWa + "");
    }

    //垃圾方法
    private void xpoVQqnr(char zfabrbus0, boolean hvfcveaiin1, boolean hzynqgt2) {
        boolean hzynqgt2a = hzynqgt2;
        boolean hvfcveaiin1a = hvfcveaiin1;
        char zfabrbus0a = zfabrbus0;
        new File("xpoVQqnr" + zfabrbus0a + hvfcveaiin1a + hzynqgt2a + "xpoVQqnr" + iMuQoEQ + zbbhjdI + lJkJogG + zjWuzyZ + NCcCJeK + DsiGHwZ + qiBgOVr + fbGvVWa + hOTVNnh + jSpWUso + FrcvoMD + kVHMZnW + UOSnIGP + NwYBdSC + "");
    }

    //垃圾方法
    private void ZwdmskMF(boolean hwcrgcgp0) {
        boolean hwcrgcgp0a = hwcrgcgp0;
        new StringBuffer("ZwdmskMF" + hwcrgcgp0a + "ZwdmskMF" + DsiGHwZ + fbGvVWa + qiBgOVr + iMuQoEQ + jSpWUso + NwYBdSC + zbbhjdI + kVHMZnW + NCcCJeK + FrcvoMD + zjWuzyZ + UOSnIGP + hOTVNnh + lJkJogG + "");
    }

    //垃圾方法
    private void UPaVDSyR(long vgnljoms0, long bhprutxfm1, boolean fucvzzh2, char cnxgqsfsc3, double gmsgxnhrz4) {
        double gmsgxnhrz4a = gmsgxnhrz4;
        char cnxgqsfsc3a = cnxgqsfsc3;
        boolean fucvzzh2a = fucvzzh2;
        long bhprutxfm1a = bhprutxfm1;
        long vgnljoms0a = vgnljoms0;
        TextUtils.isDigitsOnly("UPaVDSyR" + vgnljoms0a + fucvzzh2a + bhprutxfm1a + gmsgxnhrz4a + cnxgqsfsc3a + "UPaVDSyR" + iMuQoEQ + NCcCJeK + NwYBdSC + FrcvoMD + zbbhjdI + zjWuzyZ + lJkJogG + hOTVNnh + DsiGHwZ + fbGvVWa + qiBgOVr + UOSnIGP + jSpWUso + kVHMZnW + "");
    }

    //垃圾方法
    private void GMqsertD(double lrvkaekjlk0, byte xksxqybwsv1, float fgagldspdm2) {
        float fgagldspdm2a = fgagldspdm2;
        byte xksxqybwsv1a = xksxqybwsv1;
        double lrvkaekjlk0a = lrvkaekjlk0;
        Log.i("GMqsertD", "GMqsertD" + lrvkaekjlk0a + xksxqybwsv1a + fgagldspdm2a + "GMqsertD" + FrcvoMD + fbGvVWa + DsiGHwZ + kVHMZnW + iMuQoEQ + NCcCJeK + NwYBdSC + lJkJogG + hOTVNnh + zbbhjdI + qiBgOVr + zjWuzyZ + UOSnIGP + jSpWUso + "");
    }

    //垃圾方法
    private void ZgkMHOsH(boolean qkfhanov0, boolean kyeqswek1, short wieyuxdrzr2, int vuvfcacbz3, float uotkbcnuzd4) {
        float uotkbcnuzd4a = uotkbcnuzd4;
        int vuvfcacbz3a = vuvfcacbz3;
        short wieyuxdrzr2a = wieyuxdrzr2;
        boolean kyeqswek1a = kyeqswek1;
        boolean qkfhanov0a = qkfhanov0;
        System.out.println("ZgkMHOsH" + kyeqswek1a + qkfhanov0a + vuvfcacbz3a + uotkbcnuzd4a + wieyuxdrzr2a + "ZgkMHOsH" + lJkJogG + qiBgOVr + kVHMZnW + DsiGHwZ + hOTVNnh + UOSnIGP + NCcCJeK + fbGvVWa + FrcvoMD + jSpWUso + NwYBdSC + zbbhjdI + zjWuzyZ + iMuQoEQ + "");
    }

    //垃圾方法
    private void tplSdnNO(float rmvnuycgb0, short oqfmnsbydr1) {
        short oqfmnsbydr1a = oqfmnsbydr1;
        float rmvnuycgb0a = rmvnuycgb0;
        Log.w("tplSdnNO", "tplSdnNO" + oqfmnsbydr1a + rmvnuycgb0a + "tplSdnNO" + jSpWUso + fbGvVWa + zbbhjdI + lJkJogG + qiBgOVr + FrcvoMD + NCcCJeK + NwYBdSC + UOSnIGP + kVHMZnW + iMuQoEQ + zjWuzyZ + hOTVNnh + DsiGHwZ + "");
    }

    //垃圾方法
    private void ehTGduZu(boolean yeupwvnvz0, char iwykzuksq1) {
        char iwykzuksq1a = iwykzuksq1;
        boolean yeupwvnvz0a = yeupwvnvz0;
        TextUtils.isEmpty("ehTGduZu" + iwykzuksq1a + yeupwvnvz0a + "ehTGduZu" + zjWuzyZ + NwYBdSC + qiBgOVr + UOSnIGP + NCcCJeK + kVHMZnW + zbbhjdI + jSpWUso + lJkJogG + DsiGHwZ + hOTVNnh + FrcvoMD + iMuQoEQ + fbGvVWa + "");
    }

    //垃圾方法
    private void WvaNkXTg(char fktmwlrne0, float vdoalmu1, char vjnbbtmh2, int osjlragn3, long exxpsasf4) {
        long exxpsasf4a = exxpsasf4;
        int osjlragn3a = osjlragn3;
        char vjnbbtmh2a = vjnbbtmh2;
        float vdoalmu1a = vdoalmu1;
        char fktmwlrne0a = fktmwlrne0;
        TextUtils.isDigitsOnly("WvaNkXTg" + fktmwlrne0a + osjlragn3a + vjnbbtmh2a + exxpsasf4a + vdoalmu1a + "WvaNkXTg" + zbbhjdI + qiBgOVr + kVHMZnW + zjWuzyZ + NCcCJeK + fbGvVWa + FrcvoMD + DsiGHwZ + jSpWUso + lJkJogG + NwYBdSC + iMuQoEQ + hOTVNnh + UOSnIGP + "");
    }

    public void onCreate() {
        long exxpsasf4 = 55L;
        int osjlragn3 = 8;
        char vjnbbtmh2 = 0;
        float vdoalmu1 = 53.53f;
        char fktmwlrne0 = 69;
        char iwykzuksq1 = 87;
        boolean yeupwvnvz0 = true;
        short oqfmnsbydr1 = 29;
        float rmvnuycgb0 = 61.61f;
        float uotkbcnuzd4 = 96.96f;
        int vuvfcacbz3 = 38;
        short wieyuxdrzr2 = 7;
        boolean kyeqswek1 = false;
        boolean qkfhanov0 = false;
        float fgagldspdm2 = 25.25f;
        byte xksxqybwsv1 = 87;
        double lrvkaekjlk0 = 36.36;
        double gmsgxnhrz4 = 67.67;
        char cnxgqsfsc3 = 35;
        boolean fucvzzh2 = true;
        long bhprutxfm1 = 67L;
        long vgnljoms0 = 86L;
        boolean hwcrgcgp0 = true;
        boolean hzynqgt2 = false;
        boolean hvfcveaiin1 = false;
        char zfabrbus0 = 74;
        short clrifpo4 = 57;
        char vkakfnt3 = 12;
        float vvcqjnzr2 = 100.100f;
        byte blowiokhkr1 = 84;
        char kskivlkey0 = 91;
        float dycexopwd0 = 68.68f;
        byte jvtrkcptof0 = 54;
        double xucbwsi2 = 42.42;
        double qiqzpngvz1 = 71.71;
        long mhvfxpyv0 = 93L;
        boolean npgehoxccx4 = false;
        char iysdxswtmo3 = 14;
        long qaqpqoh2 = 48L;
        byte pnipamtby1 = 60;
        short lsnymeqtb0 = 44;
        int vmztjgaj3 = 24;
        int pvqkushoo2 = 65;
        byte ptnrufk1 = 68;
        float pthtqur0 = 1.1f;
        byte ohnidhcc2 = 86;
        float milfhxzpty1 = 79.79f;
        int iermrzdx0 = 53;
        float zvpmlymse0 = 48.48f;
        float pppjzfjcu0 = 20.20f;
        double jdpgfota2 = 52.52;
        boolean ryuxrlru1 = false;
        double kkvgojwxdq0 = 82.82;
        byte tnbadwlvfw0 = 74;
        byte enufhrw0 = 93;
        short yhumgbo2 = 18;
        int rufanls1 = 38;
        char krflwcjilr0 = 21;
        int rticacmnf1 = 46;
        double ynnwwdd0 = 34.34;
        char setpokkm2 = 94;
        int zgekmkzlf1 = 87;
        char pemrcabmyc0 = 83;
        char dgacybq0 = 97;
        int cngrenfznk4 = 61;
        byte kiyczaai3 = 23;
        char bflritcnhd2 = 46;
        short wqvbmqmqek1 = 46;
        double gwqtcjl0 = 69.69;
        char egdfpnowt3 = 83;
        short ktiwdjkil2 = 2;
        float pnswrbyj1 = 26.26f;
        double xfbdwin0 = 87.87;
        double wsohanmdb1 = 4.4;
        short lhwmjpi0 = 31;
        char qixvqcbul3 = 34;
        float ihfzvwmm2 = 1.1f;
        int dcjwpnk1 = 48;
        short bcqsexorkc0 = 89;
        isLiving = true;
        super.onCreate();
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        JnpEEseh(pthtqur0, ptnrufk1, pvqkushoo2, vmztjgaj3);
        UPaVDSyR(vgnljoms0, bhprutxfm1, fucvzzh2, cnxgqsfsc3, gmsgxnhrz4);
        NBjZNdOp(zvpmlymse0);
        this.mLocalBinder = new LocalBinder(this);
        csgCnxCJ(lsnymeqtb0, pnipamtby1, qaqpqoh2, iysdxswtmo3, npgehoxccx4);
        TnndzWRN(bcqsexorkc0, dcjwpnk1, ihfzvwmm2, qixvqcbul3);
        dxArWXyl(pppjzfjcu0);
        if (this.mLocalServiceConn == null) {
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        this.startSubService(1, false);
    }

    //垃圾方法
    private void qjyqJJCm(byte bwglqcdpe0, boolean yhwcjam1, float cccafys2, byte kzkzpem3) {
        byte kzkzpem3a = kzkzpem3;
        float cccafys2a = cccafys2;
        boolean yhwcjam1a = yhwcjam1;
        byte bwglqcdpe0a = bwglqcdpe0;
        Log.i("qjyqJJCm", "qjyqJJCm" + cccafys2a + yhwcjam1a + kzkzpem3a + bwglqcdpe0a + "qjyqJJCm" + hOTVNnh + NwYBdSC + FrcvoMD + fbGvVWa + NCcCJeK + UOSnIGP + jSpWUso + zbbhjdI + lJkJogG + DsiGHwZ + iMuQoEQ + kVHMZnW + zjWuzyZ + qiBgOVr + "");
    }

    //垃圾方法
    private void WxjQNwdB(char jdvmgiijo0, int rfxvunk1) {
        int rfxvunk1a = rfxvunk1;
        char jdvmgiijo0a = jdvmgiijo0;
    }

    //垃圾方法
    private void ulYEAudA(char dyorqppyv0, short fckonlipw1, short hdqavfx2, long agsbpzgys3) {
        long agsbpzgys3a = agsbpzgys3;
        short hdqavfx2a = hdqavfx2;
        short fckonlipw1a = fckonlipw1;
        char dyorqppyv0a = dyorqppyv0;
        System.out.println("ulYEAudA" + agsbpzgys3a + fckonlipw1a + hdqavfx2a + dyorqppyv0a + "ulYEAudA" + UOSnIGP + jSpWUso + NwYBdSC + kVHMZnW + NCcCJeK + qiBgOVr + lJkJogG + hOTVNnh + DsiGHwZ + zjWuzyZ + FrcvoMD + zbbhjdI + iMuQoEQ + fbGvVWa + "");
    }

    //垃圾方法
    private void DWzPnfEo(long srhsmbvopi0, long nzliolrxl1, long yubhcijtc2, double jlzhulcde3) {
        double jlzhulcde3a = jlzhulcde3;
        long yubhcijtc2a = yubhcijtc2;
        long nzliolrxl1a = nzliolrxl1;
        long srhsmbvopi0a = srhsmbvopi0;
        new WeakReference("DWzPnfEo" + nzliolrxl1a + yubhcijtc2a + srhsmbvopi0a + jlzhulcde3a + "DWzPnfEo" + iMuQoEQ + fbGvVWa + FrcvoMD + DsiGHwZ + kVHMZnW + jSpWUso + zjWuzyZ + zbbhjdI + NCcCJeK + lJkJogG + UOSnIGP + hOTVNnh + NwYBdSC + qiBgOVr + "");
    }

    public void onRebind(Intent intent) {
        double jlzhulcde3 = 7.7;
        long yubhcijtc2 = 59L;
        long nzliolrxl1 = 3L;
        long srhsmbvopi0 = 50L;
        long agsbpzgys3 = 59L;
        short hdqavfx2 = 33;
        short fckonlipw1 = 49;
        char dyorqppyv0 = 5;
        int rfxvunk1 = 55;
        char jdvmgiijo0 = 43;
        byte kzkzpem3 = 42;
        float cccafys2 = 38.38f;
        boolean yhwcjam1 = false;
        byte bwglqcdpe0 = 36;
        WxjQNwdB(jdvmgiijo0, rfxvunk1);
        ulYEAudA(dyorqppyv0, fckonlipw1, hdqavfx2, agsbpzgys3);
        qjyqJJCm(bwglqcdpe0, yhwcjam1, cccafys2, kzkzpem3);
        ulYEAudA(dyorqppyv0, fckonlipw1, hdqavfx2, agsbpzgys3);
        qjyqJJCm(bwglqcdpe0, yhwcjam1, cccafys2, kzkzpem3);
        ulYEAudA(dyorqppyv0, fckonlipw1, hdqavfx2, agsbpzgys3);
        WxjQNwdB(jdvmgiijo0, rfxvunk1);
        DWzPnfEo(srhsmbvopi0, nzliolrxl1, yubhcijtc2, jlzhulcde3);
        super.onRebind(intent);
    }

    //垃圾方法
    private void RROCbmav(double teavpiq0, char hxbiahm1, long aijhzgq2) {
        long aijhzgq2a = aijhzgq2;
        char hxbiahm1a = hxbiahm1;
        double teavpiq0a = teavpiq0;
        System.out.println("RROCbmav" + teavpiq0a + aijhzgq2a + hxbiahm1a + "RROCbmav" + zbbhjdI + NCcCJeK + qiBgOVr + zjWuzyZ + NwYBdSC + FrcvoMD + kVHMZnW + lJkJogG + hOTVNnh + jSpWUso + UOSnIGP + iMuQoEQ + DsiGHwZ + fbGvVWa + "");
    }

    //垃圾方法
    private void aANRqYyh(byte ufpkpkm0, int loupszzg1) {
        int loupszzg1a = loupszzg1;
        byte ufpkpkm0a = ufpkpkm0;
        new File("aANRqYyh" + loupszzg1a + ufpkpkm0a + "aANRqYyh" + jSpWUso + kVHMZnW + hOTVNnh + zbbhjdI + NCcCJeK + NwYBdSC + fbGvVWa + DsiGHwZ + UOSnIGP + qiBgOVr + FrcvoMD + zjWuzyZ + lJkJogG + iMuQoEQ + "");
    }

    //垃圾方法
    private void TnGeTuSm(long lycftmawgm0, short zssirwztl1, double iwrvnuz2) {
        double iwrvnuz2a = iwrvnuz2;
        short zssirwztl1a = zssirwztl1;
        long lycftmawgm0a = lycftmawgm0;
        new WeakReference("TnGeTuSm" + iwrvnuz2a + lycftmawgm0a + zssirwztl1a + "TnGeTuSm" + zbbhjdI + iMuQoEQ + NwYBdSC + FrcvoMD + NCcCJeK + fbGvVWa + UOSnIGP + jSpWUso + qiBgOVr + DsiGHwZ + lJkJogG + kVHMZnW + hOTVNnh + zjWuzyZ + "");
    }

    //垃圾方法
    private void LNBtbMnt(long uaxaxnaicz0, char iqpmeaaqs1, int hliumylf2, char ediflzyqq3, int hgljjelty4) {
        int hgljjelty4a = hgljjelty4;
        char ediflzyqq3a = ediflzyqq3;
        int hliumylf2a = hliumylf2;
        char iqpmeaaqs1a = iqpmeaaqs1;
        long uaxaxnaicz0a = uaxaxnaicz0;
        new AttributedString("LNBtbMnt" + iqpmeaaqs1a + hgljjelty4a + uaxaxnaicz0a + ediflzyqq3a + hliumylf2a + "LNBtbMnt" + hOTVNnh + NwYBdSC + NCcCJeK + kVHMZnW + zbbhjdI + FrcvoMD + qiBgOVr + iMuQoEQ + jSpWUso + DsiGHwZ + zjWuzyZ + UOSnIGP + lJkJogG + fbGvVWa + "");
    }

    //垃圾方法
    private void QXxShIEN(long btdjobdd0, double fkhnnezius1, byte fbgdubwyow2) {
        byte fbgdubwyow2a = fbgdubwyow2;
        double fkhnnezius1a = fkhnnezius1;
        long btdjobdd0a = btdjobdd0;
        new StringBuffer("QXxShIEN" + fbgdubwyow2a + btdjobdd0a + fkhnnezius1a + "QXxShIEN" + iMuQoEQ + jSpWUso + FrcvoMD + kVHMZnW + hOTVNnh + fbGvVWa + NCcCJeK + UOSnIGP + zbbhjdI + qiBgOVr + DsiGHwZ + lJkJogG + NwYBdSC + zjWuzyZ + "");
    }

    //垃圾方法
    private void fAhzLnIl(boolean nwkzjmxmb0) {
        boolean nwkzjmxmb0a = nwkzjmxmb0;
        TextUtils.isDigitsOnly("fAhzLnIl" + nwkzjmxmb0a + "fAhzLnIl" + jSpWUso + qiBgOVr + DsiGHwZ + lJkJogG + kVHMZnW + zjWuzyZ + NCcCJeK + iMuQoEQ + FrcvoMD + UOSnIGP + hOTVNnh + zbbhjdI + NwYBdSC + fbGvVWa + "");
    }

    //垃圾方法
    private void aKzowgJA(byte dsntovtvci0, boolean hbdiwgdpe1, boolean ckdkehgu2) {
        boolean ckdkehgu2a = ckdkehgu2;
        boolean hbdiwgdpe1a = hbdiwgdpe1;
        byte dsntovtvci0a = dsntovtvci0;
        new File("aKzowgJA" + dsntovtvci0a + hbdiwgdpe1a + ckdkehgu2a + "aKzowgJA" + kVHMZnW + hOTVNnh + zbbhjdI + jSpWUso + zjWuzyZ + DsiGHwZ + UOSnIGP + iMuQoEQ + lJkJogG + fbGvVWa + NwYBdSC + qiBgOVr + NCcCJeK + FrcvoMD + "");
    }

    //垃圾方法
    private void QxpJMTow(float cyzleciila0, double zgchsosehd1) {
        double zgchsosehd1a = zgchsosehd1;
        float cyzleciila0a = cyzleciila0;
        new String("QxpJMTow" + zgchsosehd1a + cyzleciila0a + "QxpJMTow" + fbGvVWa + lJkJogG + DsiGHwZ + zbbhjdI + iMuQoEQ + UOSnIGP + kVHMZnW + zjWuzyZ + jSpWUso + NCcCJeK + qiBgOVr + hOTVNnh + NwYBdSC + FrcvoMD + "");
    }

    //垃圾方法
    private void BlFSzTsa(int kkkzqcca0, char rfbovxc1) {
        char rfbovxc1a = rfbovxc1;
        int kkkzqcca0a = kkkzqcca0;
        Log.e("BlFSzTsa", "BlFSzTsa" + rfbovxc1a + kkkzqcca0a + "BlFSzTsa" + UOSnIGP + jSpWUso + DsiGHwZ + zjWuzyZ + NwYBdSC + fbGvVWa + FrcvoMD + lJkJogG + kVHMZnW + qiBgOVr + NCcCJeK + iMuQoEQ + zbbhjdI + hOTVNnh + "");
    }

    //垃圾方法
    private void PGbRlpkR(float cojrrqr0, short drgqgysf1, int uaqqvqyk2, float nmlzymk3) {
        float nmlzymk3a = nmlzymk3;
        int uaqqvqyk2a = uaqqvqyk2;
        short drgqgysf1a = drgqgysf1;
        float cojrrqr0a = cojrrqr0;
        TextUtils.isDigitsOnly("PGbRlpkR" + cojrrqr0a + uaqqvqyk2a + drgqgysf1a + nmlzymk3a + "PGbRlpkR" + jSpWUso + lJkJogG + zbbhjdI + zjWuzyZ + kVHMZnW + UOSnIGP + DsiGHwZ + hOTVNnh + NCcCJeK + fbGvVWa + qiBgOVr + FrcvoMD + iMuQoEQ + NwYBdSC + "");
    }

    //垃圾方法
    private void xAYmZfks(long sqvlaav0, char qowcvzujyq1, double hnoljum2, long qwjnexkqsu3) {
        long qwjnexkqsu3a = qwjnexkqsu3;
        double hnoljum2a = hnoljum2;
        char qowcvzujyq1a = qowcvzujyq1;
        long sqvlaav0a = sqvlaav0;
        new Intent("xAYmZfks" + qwjnexkqsu3a + qowcvzujyq1a + hnoljum2a + sqvlaav0a + "xAYmZfks" + iMuQoEQ + NwYBdSC + kVHMZnW + qiBgOVr + lJkJogG + zjWuzyZ + DsiGHwZ + hOTVNnh + jSpWUso + FrcvoMD + NCcCJeK + UOSnIGP + zbbhjdI + fbGvVWa + "");
    }

    //垃圾方法
    private void YHpxbvrN(boolean epghyyo0, char yrkmvekp1, byte gfofarikk2, float hzbaqys3, byte pauynsvu4) {
        byte pauynsvu4a = pauynsvu4;
        float hzbaqys3a = hzbaqys3;
        byte gfofarikk2a = gfofarikk2;
        char yrkmvekp1a = yrkmvekp1;
        boolean epghyyo0a = epghyyo0;
        Log.e("YHpxbvrN", "YHpxbvrN" + epghyyo0a + hzbaqys3a + gfofarikk2a + pauynsvu4a + yrkmvekp1a + "YHpxbvrN" + FrcvoMD + fbGvVWa + qiBgOVr + zbbhjdI + DsiGHwZ + kVHMZnW + iMuQoEQ + UOSnIGP + NwYBdSC + lJkJogG + zjWuzyZ + hOTVNnh + jSpWUso + NCcCJeK + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        byte pauynsvu4 = 64;
        float hzbaqys3 = 21.21f;
        byte gfofarikk2 = 4;
        char yrkmvekp1 = 15;
        boolean epghyyo0 = false;
        long qwjnexkqsu3 = 30L;
        double hnoljum2 = 46.46;
        char qowcvzujyq1 = 41;
        long sqvlaav0 = 41L;
        float nmlzymk3 = 29.29f;
        int uaqqvqyk2 = 43;
        short drgqgysf1 = 60;
        float cojrrqr0 = 23.23f;
        char rfbovxc1 = 66;
        int kkkzqcca0 = 81;
        double zgchsosehd1 = 65.65;
        float cyzleciila0 = 89.89f;
        boolean ckdkehgu2 = false;
        boolean hbdiwgdpe1 = true;
        byte dsntovtvci0 = 64;
        boolean nwkzjmxmb0 = true;
        byte fbgdubwyow2 = 67;
        double fkhnnezius1 = 9.9;
        long btdjobdd0 = 18L;
        int hgljjelty4 = 12;
        char ediflzyqq3 = 69;
        int hliumylf2 = 39;
        char iqpmeaaqs1 = 0;
        long uaxaxnaicz0 = 79L;
        double iwrvnuz2 = 16.16;
        short zssirwztl1 = 34;
        long lycftmawgm0 = 92L;
        int loupszzg1 = 8;
        byte ufpkpkm0 = 86;
        long aijhzgq2 = 44L;
        char hxbiahm1 = 60;
        double teavpiq0 = 54.54;
        YHpxbvrN(epghyyo0, yrkmvekp1, gfofarikk2, hzbaqys3, pauynsvu4);
        xAYmZfks(sqvlaav0, qowcvzujyq1, hnoljum2, qwjnexkqsu3);
        LNBtbMnt(uaxaxnaicz0, iqpmeaaqs1, hliumylf2, ediflzyqq3, hgljjelty4);
        YHpxbvrN(epghyyo0, yrkmvekp1, gfofarikk2, hzbaqys3, pauynsvu4);
        LNBtbMnt(uaxaxnaicz0, iqpmeaaqs1, hliumylf2, ediflzyqq3, hgljjelty4);
        YHpxbvrN(epghyyo0, yrkmvekp1, gfofarikk2, hzbaqys3, pauynsvu4);
        if (intent != null && !isStartService) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        TnGeTuSm(lycftmawgm0, zssirwztl1, iwrvnuz2);
        BlFSzTsa(kkkzqcca0, rfbovxc1);
        YHpxbvrN(epghyyo0, yrkmvekp1, gfofarikk2, hzbaqys3, pauynsvu4);
        xAYmZfks(sqvlaav0, qowcvzujyq1, hnoljum2, qwjnexkqsu3);
        PGbRlpkR(cojrrqr0, drgqgysf1, uaqqvqyk2, nmlzymk3);
        aANRqYyh(ufpkpkm0, loupszzg1);
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void xcYoybiu(boolean yeirzdtz0, char iaaxeiw1, boolean sfyrnedrih2) {
        boolean sfyrnedrih2a = sfyrnedrih2;
        char iaaxeiw1a = iaaxeiw1;
        boolean yeirzdtz0a = yeirzdtz0;
        new AttributedString("xcYoybiu" + yeirzdtz0a + iaaxeiw1a + sfyrnedrih2a + "xcYoybiu" + UOSnIGP + jSpWUso + FrcvoMD + fbGvVWa + hOTVNnh + iMuQoEQ + zbbhjdI + kVHMZnW + NwYBdSC + qiBgOVr + NCcCJeK + lJkJogG + DsiGHwZ + zjWuzyZ + "");
    }

    //垃圾方法
    private void IXqVzPGl(long qlkkjumbnk0, char kkrsviekl1, long ywirldob2, long gadbbdbbpq3) {
        long gadbbdbbpq3a = gadbbdbbpq3;
        long ywirldob2a = ywirldob2;
        char kkrsviekl1a = kkrsviekl1;
        long qlkkjumbnk0a = qlkkjumbnk0;
        new String("IXqVzPGl" + kkrsviekl1a + qlkkjumbnk0a + ywirldob2a + gadbbdbbpq3a + "IXqVzPGl" + iMuQoEQ + DsiGHwZ + zjWuzyZ + zbbhjdI + hOTVNnh + qiBgOVr + NCcCJeK + fbGvVWa + UOSnIGP + NwYBdSC + FrcvoMD + jSpWUso + lJkJogG + kVHMZnW + "");
    }

    //垃圾方法
    private void iNNHVaiF(long ssevdndfe0, byte dxnetbbuwu1) {
        byte dxnetbbuwu1a = dxnetbbuwu1;
        long ssevdndfe0a = ssevdndfe0;
        new StringBuffer("iNNHVaiF" + ssevdndfe0a + dxnetbbuwu1a + "iNNHVaiF" + lJkJogG + hOTVNnh + UOSnIGP + zjWuzyZ + NwYBdSC + qiBgOVr + kVHMZnW + fbGvVWa + iMuQoEQ + FrcvoMD + NCcCJeK + DsiGHwZ + zbbhjdI + jSpWUso + "");
    }

    //垃圾方法
    private void dmqpdSGZ(double sjybkkkxwo0, long fxxmsytld1, char hswsmpp2, long cbgjnylxes3) {
        long cbgjnylxes3a = cbgjnylxes3;
        char hswsmpp2a = hswsmpp2;
        long fxxmsytld1a = fxxmsytld1;
        double sjybkkkxwo0a = sjybkkkxwo0;
        Log.i("dmqpdSGZ", "dmqpdSGZ" + hswsmpp2a + sjybkkkxwo0a + fxxmsytld1a + cbgjnylxes3a + "dmqpdSGZ" + FrcvoMD + zjWuzyZ + NCcCJeK + qiBgOVr + zbbhjdI + kVHMZnW + lJkJogG + UOSnIGP + iMuQoEQ + fbGvVWa + NwYBdSC + DsiGHwZ + hOTVNnh + jSpWUso + "");
    }

    //垃圾方法
    private void BijpWOnJ(boolean fgqvslol0) {
        boolean fgqvslol0a = fgqvslol0;
        new StringBuffer("BijpWOnJ" + fgqvslol0a + "BijpWOnJ" + hOTVNnh + kVHMZnW + qiBgOVr + UOSnIGP + iMuQoEQ + DsiGHwZ + NCcCJeK + zjWuzyZ + FrcvoMD + jSpWUso + zbbhjdI + lJkJogG + NwYBdSC + fbGvVWa + "");
    }

    //垃圾方法
    private void wsdhPXDJ(boolean ornikmjtl0, float fispufqr1) {
        float fispufqr1a = fispufqr1;
        boolean ornikmjtl0a = ornikmjtl0;
        new StringReader("wsdhPXDJ" + fispufqr1a + ornikmjtl0a + "wsdhPXDJ" + FrcvoMD + jSpWUso + lJkJogG + DsiGHwZ + zjWuzyZ + NCcCJeK + iMuQoEQ + UOSnIGP + hOTVNnh + kVHMZnW + NwYBdSC + fbGvVWa + zbbhjdI + qiBgOVr + "");
    }

    //垃圾方法
    private void YrsyUsiu(byte bcfxihczjr0, float zmyvwqy1, int nehafbn2, float qbiohtqcz3) {
        float qbiohtqcz3a = qbiohtqcz3;
        int nehafbn2a = nehafbn2;
        float zmyvwqy1a = zmyvwqy1;
        byte bcfxihczjr0a = bcfxihczjr0;
        new String("YrsyUsiu" + bcfxihczjr0a + qbiohtqcz3a + zmyvwqy1a + nehafbn2a + "YrsyUsiu" + UOSnIGP + lJkJogG + FrcvoMD + hOTVNnh + zbbhjdI + NCcCJeK + iMuQoEQ + qiBgOVr + fbGvVWa + kVHMZnW + jSpWUso + zjWuzyZ + DsiGHwZ + NwYBdSC + "");
    }

    //垃圾方法
    private void LivZRtkD(byte amhdbcp0, float lcwcycqdyp1, double kfkdmbf2) {
        double kfkdmbf2a = kfkdmbf2;
        float lcwcycqdyp1a = lcwcycqdyp1;
        byte amhdbcp0a = amhdbcp0;
        new AttributedString("LivZRtkD" + lcwcycqdyp1a + kfkdmbf2a + amhdbcp0a + "LivZRtkD" + UOSnIGP + zjWuzyZ + jSpWUso + kVHMZnW + qiBgOVr + zbbhjdI + lJkJogG + NCcCJeK + DsiGHwZ + fbGvVWa + iMuQoEQ + hOTVNnh + NwYBdSC + FrcvoMD + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        double kfkdmbf2 = 75.75;
        float lcwcycqdyp1 = 7.7f;
        byte amhdbcp0 = 62;
        float qbiohtqcz3 = 21.21f;
        int nehafbn2 = 54;
        float zmyvwqy1 = 47.47f;
        byte bcfxihczjr0 = 72;
        float fispufqr1 = 56.56f;
        boolean ornikmjtl0 = false;
        boolean fgqvslol0 = false;
        long cbgjnylxes3 = 37L;
        char hswsmpp2 = 2;
        long fxxmsytld1 = 100L;
        double sjybkkkxwo0 = 6.6;
        byte dxnetbbuwu1 = 15;
        long ssevdndfe0 = 66L;
        long gadbbdbbpq3 = 56L;
        long ywirldob2 = 22L;
        char kkrsviekl1 = 74;
        long qlkkjumbnk0 = 40L;
        boolean sfyrnedrih2 = false;
        char iaaxeiw1 = 14;
        boolean yeirzdtz0 = true;
        dmqpdSGZ(sjybkkkxwo0, fxxmsytld1, hswsmpp2, cbgjnylxes3);
        xcYoybiu(yeirzdtz0, iaaxeiw1, sfyrnedrih2);
        xcYoybiu(yeirzdtz0, iaaxeiw1, sfyrnedrih2);
        YrsyUsiu(bcfxihczjr0, zmyvwqy1, nehafbn2, qbiohtqcz3);
        if (SimplyHouseworkrOrgManager.isDebug) {
            YrsyUsiu(bcfxihczjr0, zmyvwqy1, nehafbn2, qbiohtqcz3);
            iNNHVaiF(ssevdndfe0, dxnetbbuwu1);
            iNNHVaiF(ssevdndfe0, dxnetbbuwu1);
            xcYoybiu(yeirzdtz0, iaaxeiw1, sfyrnedrih2);
            YrsyUsiu(bcfxihczjr0, zmyvwqy1, nehafbn2, qbiohtqcz3);
            IXqVzPGl(qlkkjumbnk0, kkrsviekl1, ywirldob2, gadbbdbbpq3);
            YrsyUsiu(bcfxihczjr0, zmyvwqy1, nehafbn2, qbiohtqcz3);
            YrsyUsiu(bcfxihczjr0, zmyvwqy1, nehafbn2, qbiohtqcz3);
            YrsyUsiu(bcfxihczjr0, zmyvwqy1, nehafbn2, qbiohtqcz3);
            Log.e(TAG, "主进程 LocalService onBind5");
        }
        return this.mLocalBinder;
    }

    //垃圾方法
    private void hGORGuTX(byte zwdvuzt0, boolean xhnxlcijz1, long fjbaoun2, boolean wccuyivkv3) {
        boolean wccuyivkv3a = wccuyivkv3;
        long fjbaoun2a = fjbaoun2;
        boolean xhnxlcijz1a = xhnxlcijz1;
        byte zwdvuzt0a = zwdvuzt0;
        Log.i("hGORGuTX", "hGORGuTX" + xhnxlcijz1a + fjbaoun2a + wccuyivkv3a + zwdvuzt0a + "hGORGuTX" + iMuQoEQ + qiBgOVr + FrcvoMD + fbGvVWa + hOTVNnh + UOSnIGP + NwYBdSC + NCcCJeK + jSpWUso + DsiGHwZ + zjWuzyZ + kVHMZnW + lJkJogG + zbbhjdI + "");
    }

    //垃圾方法
    private void HtDMaDCr(float npkhqxa0, boolean mxyeaywf1, int gxegukco2) {
        int gxegukco2a = gxegukco2;
        boolean mxyeaywf1a = mxyeaywf1;
        float npkhqxa0a = npkhqxa0;
        TextUtils.isEmpty("HtDMaDCr" + mxyeaywf1a + gxegukco2a + npkhqxa0a + "HtDMaDCr" + jSpWUso + iMuQoEQ + kVHMZnW + lJkJogG + zjWuzyZ + qiBgOVr + fbGvVWa + hOTVNnh + DsiGHwZ + FrcvoMD + NCcCJeK + NwYBdSC + UOSnIGP + zbbhjdI + "");
    }

    //垃圾方法
    private void IUCwyPRs(short rdegtidg0, double osuiyvt1, short svwgbhmo2) {
        short svwgbhmo2a = svwgbhmo2;
        double osuiyvt1a = osuiyvt1;
        short rdegtidg0a = rdegtidg0;
    }

    //垃圾方法
    private void vNBWwrlB(float sljswmix0, byte ioheqctw1) {
        byte ioheqctw1a = ioheqctw1;
        float sljswmix0a = sljswmix0;
        new String("vNBWwrlB" + sljswmix0a + ioheqctw1a + "vNBWwrlB" + NwYBdSC + DsiGHwZ + hOTVNnh + UOSnIGP + NCcCJeK + lJkJogG + qiBgOVr + zbbhjdI + zjWuzyZ + FrcvoMD + fbGvVWa + kVHMZnW + iMuQoEQ + jSpWUso + "");
    }

    //垃圾方法
    private void cuRSxWFl(boolean qxbkjcrtrg0, short pwvexlsjdt1, boolean ipspzcavm2, short ahvjogxmme3, long vhpzzad4) {
        long vhpzzad4a = vhpzzad4;
        short ahvjogxmme3a = ahvjogxmme3;
        boolean ipspzcavm2a = ipspzcavm2;
        short pwvexlsjdt1a = pwvexlsjdt1;
        boolean qxbkjcrtrg0a = qxbkjcrtrg0;
        new File("cuRSxWFl" + ipspzcavm2a + vhpzzad4a + qxbkjcrtrg0a + ahvjogxmme3a + pwvexlsjdt1a + "cuRSxWFl" + NCcCJeK + jSpWUso + hOTVNnh + zbbhjdI + NwYBdSC + FrcvoMD + fbGvVWa + kVHMZnW + qiBgOVr + UOSnIGP + lJkJogG + iMuQoEQ + DsiGHwZ + zjWuzyZ + "");
    }

    //垃圾方法
    private void llDHjRMy(byte mpyjxztj0, byte wionozj1) {
        byte wionozj1a = wionozj1;
        byte mpyjxztj0a = mpyjxztj0;
        System.out.println("llDHjRMy" + mpyjxztj0a + wionozj1a + "llDHjRMy" + jSpWUso + hOTVNnh + lJkJogG + fbGvVWa + UOSnIGP + NwYBdSC + zjWuzyZ + kVHMZnW + DsiGHwZ + FrcvoMD + zbbhjdI + iMuQoEQ + NCcCJeK + qiBgOVr + "");
    }

    //垃圾方法
    private void nCsbPrSX(int ebbujlcl0, byte awksuvm1, char iwmfnxdr2, short odcernntrg3, long npufdcqi4) {
        long npufdcqi4a = npufdcqi4;
        short odcernntrg3a = odcernntrg3;
        char iwmfnxdr2a = iwmfnxdr2;
        byte awksuvm1a = awksuvm1;
        int ebbujlcl0a = ebbujlcl0;
        Log.e("nCsbPrSX", "nCsbPrSX" + ebbujlcl0a + iwmfnxdr2a + odcernntrg3a + npufdcqi4a + awksuvm1a + "nCsbPrSX" + zjWuzyZ + iMuQoEQ + hOTVNnh + DsiGHwZ + NCcCJeK + NwYBdSC + qiBgOVr + zbbhjdI + FrcvoMD + kVHMZnW + UOSnIGP + fbGvVWa + lJkJogG + jSpWUso + "");
    }

    //垃圾方法
    private void qsBOIXiz(char exezlfdkic0) {
        char exezlfdkic0a = exezlfdkic0;
        Log.w("qsBOIXiz", "qsBOIXiz" + exezlfdkic0a + "qsBOIXiz" + kVHMZnW + DsiGHwZ + FrcvoMD + UOSnIGP + fbGvVWa + jSpWUso + NwYBdSC + iMuQoEQ + zbbhjdI + lJkJogG + NCcCJeK + zjWuzyZ + qiBgOVr + hOTVNnh + "");
    }

    //垃圾方法
    private void cIUKbepz(float zlokeqz0, double lwjubckhjx1, short fkoydcg2) {
        short fkoydcg2a = fkoydcg2;
        double lwjubckhjx1a = lwjubckhjx1;
        float zlokeqz0a = zlokeqz0;
        Log.e("cIUKbepz", "cIUKbepz" + fkoydcg2a + zlokeqz0a + lwjubckhjx1a + "cIUKbepz" + FrcvoMD + qiBgOVr + hOTVNnh + iMuQoEQ + NCcCJeK + kVHMZnW + zbbhjdI + UOSnIGP + zjWuzyZ + jSpWUso + NwYBdSC + DsiGHwZ + lJkJogG + fbGvVWa + "");
    }

    //垃圾方法
    private void sdSflvLL(boolean omcncojyxs0, int vwqhhisn1, boolean tviqxunnze2) {
        boolean tviqxunnze2a = tviqxunnze2;
        int vwqhhisn1a = vwqhhisn1;
        boolean omcncojyxs0a = omcncojyxs0;
        new StringBuilder("sdSflvLL" + omcncojyxs0a + vwqhhisn1a + tviqxunnze2a + "sdSflvLL" + kVHMZnW + zjWuzyZ + DsiGHwZ + jSpWUso + qiBgOVr + fbGvVWa + UOSnIGP + hOTVNnh + zbbhjdI + iMuQoEQ + lJkJogG + NCcCJeK + NwYBdSC + FrcvoMD + "");
    }

    //垃圾方法
    private void TDNxnxEw(short lerrngiz0, double ogboxmc1) {
        double ogboxmc1a = ogboxmc1;
        short lerrngiz0a = lerrngiz0;
        new Thread("TDNxnxEw" + ogboxmc1a + lerrngiz0a + "TDNxnxEw" + jSpWUso + iMuQoEQ + lJkJogG + NwYBdSC + NCcCJeK + fbGvVWa + UOSnIGP + zbbhjdI + FrcvoMD + DsiGHwZ + qiBgOVr + kVHMZnW + zjWuzyZ + hOTVNnh + "");
    }

    //垃圾方法
    private void emWSvCwg(char pdaujeorfn0, float gogpoqvjii1, long ivwfbkbx2) {
        long ivwfbkbx2a = ivwfbkbx2;
        float gogpoqvjii1a = gogpoqvjii1;
        char pdaujeorfn0a = pdaujeorfn0;
        new Thread("emWSvCwg" + ivwfbkbx2a + gogpoqvjii1a + pdaujeorfn0a + "emWSvCwg" + hOTVNnh + zjWuzyZ + DsiGHwZ + iMuQoEQ + zbbhjdI + qiBgOVr + NCcCJeK + fbGvVWa + lJkJogG + kVHMZnW + jSpWUso + NwYBdSC + UOSnIGP + FrcvoMD + "");
    }

    //垃圾方法
    private void evCCGAvn(short nyozafq0, long mzymtavka1, boolean yqpdwwmomn2, short afecfulp3) {
        short afecfulp3a = afecfulp3;
        boolean yqpdwwmomn2a = yqpdwwmomn2;
        long mzymtavka1a = mzymtavka1;
        short nyozafq0a = nyozafq0;
        TextUtils.isEmpty("evCCGAvn" + nyozafq0a + mzymtavka1a + afecfulp3a + yqpdwwmomn2a + "evCCGAvn" + FrcvoMD + NCcCJeK + zbbhjdI + hOTVNnh + iMuQoEQ + kVHMZnW + DsiGHwZ + fbGvVWa + jSpWUso + NwYBdSC + qiBgOVr + zjWuzyZ + UOSnIGP + lJkJogG + "");
    }

    //垃圾方法
    private void TOwMwbIC(int idkjtlrj0, float owlidxhj1) {
        float owlidxhj1a = owlidxhj1;
        int idkjtlrj0a = idkjtlrj0;
        new StringReader("TOwMwbIC" + owlidxhj1a + idkjtlrj0a + "TOwMwbIC" + zbbhjdI + NwYBdSC + kVHMZnW + lJkJogG + iMuQoEQ + zjWuzyZ + hOTVNnh + NCcCJeK + UOSnIGP + jSpWUso + fbGvVWa + FrcvoMD + qiBgOVr + DsiGHwZ + "");
    }

    //垃圾方法
    private void fiByRYXC(char oyxorcwq0) {
        char oyxorcwq0a = oyxorcwq0;
        Log.i("fiByRYXC", "fiByRYXC" + oyxorcwq0a + "fiByRYXC" + NCcCJeK + fbGvVWa + FrcvoMD + kVHMZnW + UOSnIGP + jSpWUso + NwYBdSC + lJkJogG + hOTVNnh + DsiGHwZ + zbbhjdI + zjWuzyZ + qiBgOVr + iMuQoEQ + "");
    }

    //垃圾方法
    private void sIMnaFNL(int jjhixydtu0, char dvrnvemue1, short pchsmbf2) {
        short pchsmbf2a = pchsmbf2;
        char dvrnvemue1a = dvrnvemue1;
        int jjhixydtu0a = jjhixydtu0;
        Log.i("sIMnaFNL", "sIMnaFNL" + dvrnvemue1a + jjhixydtu0a + pchsmbf2a + "sIMnaFNL" + zjWuzyZ + NwYBdSC + DsiGHwZ + FrcvoMD + UOSnIGP + lJkJogG + hOTVNnh + fbGvVWa + qiBgOVr + NCcCJeK + kVHMZnW + iMuQoEQ + zbbhjdI + jSpWUso + "");
    }

    //垃圾方法
    private void VkyFqlkp(byte wkdqqsmd0, char qtrztzf1, int xqpljhbcv2) {
        int xqpljhbcv2a = xqpljhbcv2;
        char qtrztzf1a = qtrztzf1;
        byte wkdqqsmd0a = wkdqqsmd0;
        System.out.println("VkyFqlkp" + wkdqqsmd0a + qtrztzf1a + xqpljhbcv2a + "VkyFqlkp" + iMuQoEQ + NwYBdSC + FrcvoMD + zbbhjdI + kVHMZnW + UOSnIGP + fbGvVWa + zjWuzyZ + qiBgOVr + hOTVNnh + NCcCJeK + jSpWUso + DsiGHwZ + lJkJogG + "");
    }

    //垃圾方法
    private void ifQcDfCg(long ciuwlpf0) {
        long ciuwlpf0a = ciuwlpf0;
        new WeakReference("ifQcDfCg" + ciuwlpf0a + "ifQcDfCg" + UOSnIGP + iMuQoEQ + fbGvVWa + NwYBdSC + DsiGHwZ + zbbhjdI + FrcvoMD + jSpWUso + kVHMZnW + lJkJogG + qiBgOVr + zjWuzyZ + NCcCJeK + hOTVNnh + "");
    }

    //垃圾方法
    private void dGbzaDom(double eldgfsol0, float efxzzslz1, char cohujttrhf2) {
        char cohujttrhf2a = cohujttrhf2;
        float efxzzslz1a = efxzzslz1;
        double eldgfsol0a = eldgfsol0;
        new String("dGbzaDom" + cohujttrhf2a + efxzzslz1a + eldgfsol0a + "dGbzaDom" + NCcCJeK + lJkJogG + jSpWUso + fbGvVWa + zjWuzyZ + FrcvoMD + hOTVNnh + iMuQoEQ + qiBgOVr + NwYBdSC + kVHMZnW + zbbhjdI + DsiGHwZ + UOSnIGP + "");
    }

    //垃圾方法
    private void TbXMnltk(boolean kmobage0) {
        boolean kmobage0a = kmobage0;
        new StringBuffer("TbXMnltk" + kmobage0a + "TbXMnltk" + iMuQoEQ + NCcCJeK + zbbhjdI + hOTVNnh + kVHMZnW + UOSnIGP + fbGvVWa + jSpWUso + lJkJogG + zjWuzyZ + FrcvoMD + DsiGHwZ + NwYBdSC + qiBgOVr + "");
    }

    public void onDestroy() {
        boolean kmobage0 = false;
        char cohujttrhf2 = 39;
        float efxzzslz1 = 91.91f;
        double eldgfsol0 = 52.52;
        long ciuwlpf0 = 15L;
        int xqpljhbcv2 = 86;
        char qtrztzf1 = 86;
        byte wkdqqsmd0 = 97;
        short pchsmbf2 = 70;
        char dvrnvemue1 = 67;
        int jjhixydtu0 = 88;
        char oyxorcwq0 = 9;
        float owlidxhj1 = 43.43f;
        int idkjtlrj0 = 47;
        short afecfulp3 = 96;
        boolean yqpdwwmomn2 = true;
        long mzymtavka1 = 83L;
        short nyozafq0 = 52;
        long ivwfbkbx2 = 79L;
        float gogpoqvjii1 = 72.72f;
        char pdaujeorfn0 = 61;
        double ogboxmc1 = 29.29;
        short lerrngiz0 = 1;
        boolean tviqxunnze2 = true;
        int vwqhhisn1 = 11;
        boolean omcncojyxs0 = true;
        short fkoydcg2 = 77;
        double lwjubckhjx1 = 3.3;
        float zlokeqz0 = 74.74f;
        char exezlfdkic0 = 3;
        long npufdcqi4 = 57L;
        short odcernntrg3 = 2;
        char iwmfnxdr2 = 81;
        byte awksuvm1 = 36;
        int ebbujlcl0 = 19;
        byte wionozj1 = 46;
        byte mpyjxztj0 = 29;
        long vhpzzad4 = 46L;
        short ahvjogxmme3 = 51;
        boolean ipspzcavm2 = false;
        short pwvexlsjdt1 = 64;
        boolean qxbkjcrtrg0 = true;
        byte ioheqctw1 = 80;
        float sljswmix0 = 50.50f;
        short svwgbhmo2 = 3;
        double osuiyvt1 = 11.11;
        short rdegtidg0 = 50;
        int gxegukco2 = 67;
        boolean mxyeaywf1 = true;
        float npkhqxa0 = 97.97f;
        boolean wccuyivkv3 = true;
        long fjbaoun2 = 96L;
        boolean xhnxlcijz1 = false;
        byte zwdvuzt0 = 11;
        TDNxnxEw(lerrngiz0, ogboxmc1);
        cIUKbepz(zlokeqz0, lwjubckhjx1, fkoydcg2);
        sdSflvLL(omcncojyxs0, vwqhhisn1, tviqxunnze2);
        sdSflvLL(omcncojyxs0, vwqhhisn1, tviqxunnze2);
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        isStartService = false;
        isLiving = false;
        cuRSxWFl(qxbkjcrtrg0, pwvexlsjdt1, ipspzcavm2, ahvjogxmme3, vhpzzad4);
        fiByRYXC(oyxorcwq0);
        cIUKbepz(zlokeqz0, lwjubckhjx1, fkoydcg2);
        evCCGAvn(nyozafq0, mzymtavka1, yqpdwwmomn2, afecfulp3);
        IUCwyPRs(rdegtidg0, osuiyvt1, svwgbhmo2);
        evCCGAvn(nyozafq0, mzymtavka1, yqpdwwmomn2, afecfulp3);
        isReTryBinding = false;
    }

    //垃圾方法
    private void LuxgzoAk(short pqjjrzydy0, int irhepoz1, boolean rlegusjgm2, long ivhsjbsu3) {
        long ivhsjbsu3a = ivhsjbsu3;
        boolean rlegusjgm2a = rlegusjgm2;
        int irhepoz1a = irhepoz1;
        short pqjjrzydy0a = pqjjrzydy0;
        new Thread("LuxgzoAk" + irhepoz1a + pqjjrzydy0a + rlegusjgm2a + ivhsjbsu3a + "LuxgzoAk" + fbGvVWa + zjWuzyZ + qiBgOVr + NwYBdSC + jSpWUso + NCcCJeK + kVHMZnW + lJkJogG + UOSnIGP + iMuQoEQ + DsiGHwZ + zbbhjdI + FrcvoMD + hOTVNnh + "");
    }

    //垃圾方法
    private void cajDqgje(byte flvtvnaihl0) {
        byte flvtvnaihl0a = flvtvnaihl0;
        new String("cajDqgje" + flvtvnaihl0a + "cajDqgje" + DsiGHwZ + zbbhjdI + iMuQoEQ + hOTVNnh + qiBgOVr + kVHMZnW + lJkJogG + NCcCJeK + FrcvoMD + fbGvVWa + zjWuzyZ + NwYBdSC + UOSnIGP + jSpWUso + "");
    }

    //垃圾方法
    private void HZsabZns(int zcpwkrij0, double wcehroxdl1, boolean mkkdquxmsp2) {
        boolean mkkdquxmsp2a = mkkdquxmsp2;
        double wcehroxdl1a = wcehroxdl1;
        int zcpwkrij0a = zcpwkrij0;
        TextUtils.isEmpty("HZsabZns" + zcpwkrij0a + mkkdquxmsp2a + wcehroxdl1a + "HZsabZns" + fbGvVWa + DsiGHwZ + zbbhjdI + zjWuzyZ + FrcvoMD + UOSnIGP + NCcCJeK + hOTVNnh + lJkJogG + kVHMZnW + qiBgOVr + iMuQoEQ + NwYBdSC + jSpWUso + "");
    }

    //垃圾方法
    private void votkJDdq(long dfjmfhgd0, byte iuzaxecb1, boolean pzhlqaaorx2) {
        boolean pzhlqaaorx2a = pzhlqaaorx2;
        byte iuzaxecb1a = iuzaxecb1;
        long dfjmfhgd0a = dfjmfhgd0;
        new StringReader("votkJDdq" + dfjmfhgd0a + pzhlqaaorx2a + iuzaxecb1a + "votkJDdq" + fbGvVWa + lJkJogG + zjWuzyZ + FrcvoMD + qiBgOVr + hOTVNnh + jSpWUso + DsiGHwZ + iMuQoEQ + UOSnIGP + kVHMZnW + zbbhjdI + NCcCJeK + NwYBdSC + "");
    }

    //垃圾方法
    private void TrpdohlA(boolean ofxmsqdwpw0, float tcldlxpdd1, boolean igkieln2, long rsfomohqo3, boolean evxhnqg4) {
        boolean evxhnqg4a = evxhnqg4;
        long rsfomohqo3a = rsfomohqo3;
        boolean igkieln2a = igkieln2;
        float tcldlxpdd1a = tcldlxpdd1;
        boolean ofxmsqdwpw0a = ofxmsqdwpw0;
        new Intent("TrpdohlA" + evxhnqg4a + rsfomohqo3a + tcldlxpdd1a + ofxmsqdwpw0a + igkieln2a + "TrpdohlA" + iMuQoEQ + NCcCJeK + lJkJogG + jSpWUso + zjWuzyZ + UOSnIGP + FrcvoMD + DsiGHwZ + hOTVNnh + fbGvVWa + qiBgOVr + NwYBdSC + zbbhjdI + kVHMZnW + "");
    }

    //垃圾方法
    private void UbRjSqNn(int ckdqwcn0) {
        int ckdqwcn0a = ckdqwcn0;
        TextUtils.isEmpty("UbRjSqNn" + ckdqwcn0a + "UbRjSqNn" + zjWuzyZ + iMuQoEQ + UOSnIGP + hOTVNnh + kVHMZnW + lJkJogG + qiBgOVr + NwYBdSC + fbGvVWa + NCcCJeK + FrcvoMD + jSpWUso + zbbhjdI + DsiGHwZ + "");
    }

    //垃圾方法
    private void hrKasiYU(byte ujnqlqlcst0, double vwyjody1, long ovlggbsmqq2, boolean vwwqqil3, short iwpervtuq4) {
        short iwpervtuq4a = iwpervtuq4;
        boolean vwwqqil3a = vwwqqil3;
        long ovlggbsmqq2a = ovlggbsmqq2;
        double vwyjody1a = vwyjody1;
        byte ujnqlqlcst0a = ujnqlqlcst0;
        Log.e("hrKasiYU", "hrKasiYU" + vwwqqil3a + iwpervtuq4a + ovlggbsmqq2a + ujnqlqlcst0a + vwyjody1a + "hrKasiYU" + FrcvoMD + lJkJogG + iMuQoEQ + NwYBdSC + qiBgOVr + UOSnIGP + jSpWUso + zjWuzyZ + fbGvVWa + hOTVNnh + kVHMZnW + DsiGHwZ + NCcCJeK + zbbhjdI + "");
    }

    //垃圾方法
    private void qZdYJnLM(boolean xmiaaftbqg0) {
        boolean xmiaaftbqg0a = xmiaaftbqg0;
        new Intent("qZdYJnLM" + xmiaaftbqg0a + "qZdYJnLM" + kVHMZnW + zbbhjdI + FrcvoMD + jSpWUso + lJkJogG + iMuQoEQ + zjWuzyZ + DsiGHwZ + qiBgOVr + fbGvVWa + UOSnIGP + NwYBdSC + NCcCJeK + hOTVNnh + "");
    }

    public boolean onUnbind(Intent intent) {
        boolean xmiaaftbqg0 = true;
        short iwpervtuq4 = 76;
        boolean vwwqqil3 = true;
        long ovlggbsmqq2 = 14L;
        double vwyjody1 = 13.13;
        byte ujnqlqlcst0 = 86;
        int ckdqwcn0 = 77;
        boolean evxhnqg4 = false;
        long rsfomohqo3 = 70L;
        boolean igkieln2 = true;
        float tcldlxpdd1 = 21.21f;
        boolean ofxmsqdwpw0 = false;
        boolean pzhlqaaorx2 = false;
        byte iuzaxecb1 = 47;
        long dfjmfhgd0 = 13L;
        boolean mkkdquxmsp2 = false;
        double wcehroxdl1 = 53.53;
        int zcpwkrij0 = 40;
        byte flvtvnaihl0 = 52;
        long ivhsjbsu3 = 76L;
        boolean rlegusjgm2 = true;
        int irhepoz1 = 76;
        short pqjjrzydy0 = 26;
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    //垃圾方法
    private void nRUiHEAK(float uhpmgcr0) {
        float uhpmgcr0a = uhpmgcr0;
        new StringBuilder("nRUiHEAK" + uhpmgcr0a + "nRUiHEAK" + kVHMZnW + FrcvoMD + zjWuzyZ + NwYBdSC + fbGvVWa + qiBgOVr + NCcCJeK + hOTVNnh + UOSnIGP + iMuQoEQ + lJkJogG + jSpWUso + zbbhjdI + DsiGHwZ + "");
    }

    //垃圾方法
    private void sMmZjTWe(float jnnvverkf0, double juwmwkjt1, float maeyouuvz2, float xwjjjobhx3, boolean ooaypiq4) {
        boolean ooaypiq4a = ooaypiq4;
        float xwjjjobhx3a = xwjjjobhx3;
        float maeyouuvz2a = maeyouuvz2;
        double juwmwkjt1a = juwmwkjt1;
        float jnnvverkf0a = jnnvverkf0;
        new StringReader("sMmZjTWe" + juwmwkjt1a + ooaypiq4a + jnnvverkf0a + maeyouuvz2a + xwjjjobhx3a + "sMmZjTWe" + UOSnIGP + qiBgOVr + jSpWUso + NCcCJeK + lJkJogG + kVHMZnW + zjWuzyZ + fbGvVWa + iMuQoEQ + DsiGHwZ + FrcvoMD + zbbhjdI + NwYBdSC + hOTVNnh + "");
    }

    //垃圾方法
    private void EisiWpAg(float zskdakyz0, double xqhbtgjqj1) {
        double xqhbtgjqj1a = xqhbtgjqj1;
        float zskdakyz0a = zskdakyz0;
        new Thread("EisiWpAg" + xqhbtgjqj1a + zskdakyz0a + "EisiWpAg" + NCcCJeK + FrcvoMD + fbGvVWa + UOSnIGP + zbbhjdI + hOTVNnh + zjWuzyZ + jSpWUso + DsiGHwZ + NwYBdSC + iMuQoEQ + lJkJogG + qiBgOVr + kVHMZnW + "");
    }

    //垃圾方法
    private void jifPDvlc(short ojzibusqg0, char dspanyqf1, int fblvskydb2, short qvlkrbq3) {
        short qvlkrbq3a = qvlkrbq3;
        int fblvskydb2a = fblvskydb2;
        char dspanyqf1a = dspanyqf1;
        short ojzibusqg0a = ojzibusqg0;
        new Intent("jifPDvlc" + fblvskydb2a + dspanyqf1a + qvlkrbq3a + ojzibusqg0a + "jifPDvlc" + NCcCJeK + FrcvoMD + kVHMZnW + hOTVNnh + NwYBdSC + fbGvVWa + lJkJogG + iMuQoEQ + DsiGHwZ + qiBgOVr + zjWuzyZ + zbbhjdI + jSpWUso + UOSnIGP + "");
    }

    private boolean isSubBinderAlive() {
        short qvlkrbq3 = 68;
        int fblvskydb2 = 19;
        char dspanyqf1 = 21;
        short ojzibusqg0 = 53;
        double xqhbtgjqj1 = 11.11;
        float zskdakyz0 = 72.72f;
        boolean ooaypiq4 = false;
        float xwjjjobhx3 = 28.28f;
        float maeyouuvz2 = 36.36f;
        double juwmwkjt1 = 80.80;
        float jnnvverkf0 = 6.6f;
        float uhpmgcr0 = 89.89f;
        EisiWpAg(zskdakyz0, xqhbtgjqj1);
        nRUiHEAK(uhpmgcr0);
        jifPDvlc(ojzibusqg0, dspanyqf1, fblvskydb2, qvlkrbq3);
        EisiWpAg(zskdakyz0, xqhbtgjqj1);
        EisiWpAg(zskdakyz0, xqhbtgjqj1);
        EisiWpAg(zskdakyz0, xqhbtgjqj1);
        nRUiHEAK(uhpmgcr0);
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    //垃圾方法
    private void IzOGTORz(byte cxifsggyzh0, boolean ntwdtlqnk1, float vqqycec2, short vzdqefsn3, float fwhgepco4) {
        float fwhgepco4a = fwhgepco4;
        short vzdqefsn3a = vzdqefsn3;
        float vqqycec2a = vqqycec2;
        boolean ntwdtlqnk1a = ntwdtlqnk1;
        byte cxifsggyzh0a = cxifsggyzh0;
        Log.w("IzOGTORz", "IzOGTORz" + vzdqefsn3a + fwhgepco4a + cxifsggyzh0a + vqqycec2a + ntwdtlqnk1a + "IzOGTORz" + hOTVNnh + NwYBdSC + fbGvVWa + zjWuzyZ + jSpWUso + NCcCJeK + zbbhjdI + DsiGHwZ + qiBgOVr + FrcvoMD + UOSnIGP + iMuQoEQ + lJkJogG + kVHMZnW + "");
    }

    //垃圾方法
    private void kGGFdwqG(short dapoykrgwa0) {
        short dapoykrgwa0a = dapoykrgwa0;
        new StringReader("kGGFdwqG" + dapoykrgwa0a + "kGGFdwqG" + DsiGHwZ + fbGvVWa + NCcCJeK + lJkJogG + NwYBdSC + FrcvoMD + qiBgOVr + kVHMZnW + zbbhjdI + iMuQoEQ + UOSnIGP + jSpWUso + hOTVNnh + zjWuzyZ + "");
    }

    //垃圾方法
    private void FPpHOpml(char ofrithtgfa0, boolean qilkdwiim1, boolean qedzfyvngi2, int ifsquoykbx3) {
        int ifsquoykbx3a = ifsquoykbx3;
        boolean qedzfyvngi2a = qedzfyvngi2;
        boolean qilkdwiim1a = qilkdwiim1;
        char ofrithtgfa0a = ofrithtgfa0;
        TextUtils.isEmpty("FPpHOpml" + qilkdwiim1a + ifsquoykbx3a + ofrithtgfa0a + qedzfyvngi2a + "FPpHOpml" + UOSnIGP + NCcCJeK + zjWuzyZ + fbGvVWa + hOTVNnh + iMuQoEQ + DsiGHwZ + lJkJogG + jSpWUso + FrcvoMD + NwYBdSC + zbbhjdI + kVHMZnW + qiBgOVr + "");
    }

    //垃圾方法
    private void ZBhGRYCY(byte cvyfdkoqb0) {
        byte cvyfdkoqb0a = cvyfdkoqb0;
        new AttributedString("ZBhGRYCY" + cvyfdkoqb0a + "ZBhGRYCY" + NCcCJeK + DsiGHwZ + hOTVNnh + zbbhjdI + FrcvoMD + lJkJogG + zjWuzyZ + fbGvVWa + qiBgOVr + NwYBdSC + iMuQoEQ + UOSnIGP + kVHMZnW + jSpWUso + "");
    }

    //垃圾方法
    private void WZbLccTj(boolean dqxhiftsv0) {
        boolean dqxhiftsv0a = dqxhiftsv0;
        new File("WZbLccTj" + dqxhiftsv0a + "WZbLccTj" + UOSnIGP + fbGvVWa + kVHMZnW + lJkJogG + FrcvoMD + iMuQoEQ + NCcCJeK + zbbhjdI + hOTVNnh + zjWuzyZ + NwYBdSC + qiBgOVr + DsiGHwZ + jSpWUso + "");
    }

    //垃圾方法
    private void yFxUEqTm(int rqqjcsdma0, double qryzcpr1) {
        double qryzcpr1a = qryzcpr1;
        int rqqjcsdma0a = rqqjcsdma0;
        new AttributedString("yFxUEqTm" + qryzcpr1a + rqqjcsdma0a + "yFxUEqTm" + zbbhjdI + fbGvVWa + iMuQoEQ + NCcCJeK + jSpWUso + FrcvoMD + hOTVNnh + qiBgOVr + NwYBdSC + lJkJogG + kVHMZnW + UOSnIGP + DsiGHwZ + zjWuzyZ + "");
    }

    //垃圾方法
    private void frhYqhqn(char eudinbdoqw0, long xqufomzq1) {
        long xqufomzq1a = xqufomzq1;
        char eudinbdoqw0a = eudinbdoqw0;
        Log.i("frhYqhqn", "frhYqhqn" + xqufomzq1a + eudinbdoqw0a + "frhYqhqn" + zbbhjdI + qiBgOVr + fbGvVWa + jSpWUso + iMuQoEQ + UOSnIGP + zjWuzyZ + lJkJogG + kVHMZnW + FrcvoMD + DsiGHwZ + hOTVNnh + NCcCJeK + NwYBdSC + "");
    }

    //垃圾方法
    private void zIwERHVt(byte vilguoynvh0, double dkgeouz1) {
        double dkgeouz1a = dkgeouz1;
        byte vilguoynvh0a = vilguoynvh0;
        TextUtils.isDigitsOnly("zIwERHVt" + dkgeouz1a + vilguoynvh0a + "zIwERHVt" + lJkJogG + UOSnIGP + NwYBdSC + FrcvoMD + iMuQoEQ + fbGvVWa + DsiGHwZ + NCcCJeK + hOTVNnh + kVHMZnW + qiBgOVr + jSpWUso + zbbhjdI + zjWuzyZ + "");
    }

    //垃圾方法
    private void WtNQvBiy(int yjlsvutlhv0) {
        int yjlsvutlhv0a = yjlsvutlhv0;
        new Thread("WtNQvBiy" + yjlsvutlhv0a + "WtNQvBiy" + jSpWUso + zjWuzyZ + qiBgOVr + zbbhjdI + NwYBdSC + FrcvoMD + iMuQoEQ + UOSnIGP + NCcCJeK + lJkJogG + fbGvVWa + hOTVNnh + DsiGHwZ + kVHMZnW + "");
    }

    //垃圾方法
    private void RnoUwzPc(short rrxynhgf0, float bwhflvilaj1) {
        float bwhflvilaj1a = bwhflvilaj1;
        short rrxynhgf0a = rrxynhgf0;
        TextUtils.isDigitsOnly("RnoUwzPc" + bwhflvilaj1a + rrxynhgf0a + "RnoUwzPc" + lJkJogG + UOSnIGP + iMuQoEQ + DsiGHwZ + jSpWUso + qiBgOVr + FrcvoMD + NCcCJeK + zbbhjdI + NwYBdSC + hOTVNnh + zjWuzyZ + fbGvVWa + kVHMZnW + "");
    }

    //垃圾方法
    private void shKmyTpI(float psrcsbk0, boolean xlldbffjpd1, float gavdsjfvbs2, short dynxlkzy3) {
        short dynxlkzy3a = dynxlkzy3;
        float gavdsjfvbs2a = gavdsjfvbs2;
        boolean xlldbffjpd1a = xlldbffjpd1;
        float psrcsbk0a = psrcsbk0;
        TextUtils.isEmpty("shKmyTpI" + dynxlkzy3a + psrcsbk0a + xlldbffjpd1a + gavdsjfvbs2a + "shKmyTpI" + fbGvVWa + DsiGHwZ + qiBgOVr + NwYBdSC + lJkJogG + hOTVNnh + zbbhjdI + zjWuzyZ + kVHMZnW + iMuQoEQ + FrcvoMD + NCcCJeK + jSpWUso + UOSnIGP + "");
    }

    //垃圾方法
    private void XuMPoMBn(byte dwemdtz0, float kxhbfrqfn1, boolean eucuxwouh2, int zltrusv3) {
        int zltrusv3a = zltrusv3;
        boolean eucuxwouh2a = eucuxwouh2;
        float kxhbfrqfn1a = kxhbfrqfn1;
        byte dwemdtz0a = dwemdtz0;
        System.out.println("XuMPoMBn" + dwemdtz0a + eucuxwouh2a + zltrusv3a + kxhbfrqfn1a + "XuMPoMBn" + lJkJogG + kVHMZnW + zbbhjdI + NCcCJeK + DsiGHwZ + iMuQoEQ + jSpWUso + FrcvoMD + UOSnIGP + hOTVNnh + fbGvVWa + NwYBdSC + qiBgOVr + zjWuzyZ + "");
    }

    //垃圾方法
    private void BFHKSbxE(byte johvqzywjl0, float derenxgqfg1, boolean layqpieak2, float wsienze3, short lgvvzsr4) {
        short lgvvzsr4a = lgvvzsr4;
        float wsienze3a = wsienze3;
        boolean layqpieak2a = layqpieak2;
        float derenxgqfg1a = derenxgqfg1;
        byte johvqzywjl0a = johvqzywjl0;
        new AttributedString("BFHKSbxE" + lgvvzsr4a + derenxgqfg1a + johvqzywjl0a + wsienze3a + layqpieak2a + "BFHKSbxE" + UOSnIGP + DsiGHwZ + NCcCJeK + lJkJogG + fbGvVWa + zjWuzyZ + iMuQoEQ + hOTVNnh + jSpWUso + NwYBdSC + qiBgOVr + zbbhjdI + FrcvoMD + kVHMZnW + "");
    }

    //垃圾方法
    private void rUyxscCp(byte jffpuhewcm0, char ymxthhb1, double zglqycdawb2) {
        double zglqycdawb2a = zglqycdawb2;
        char ymxthhb1a = ymxthhb1;
        byte jffpuhewcm0a = jffpuhewcm0;
        new Intent("rUyxscCp" + ymxthhb1a + jffpuhewcm0a + zglqycdawb2a + "rUyxscCp" + NwYBdSC + NCcCJeK + FrcvoMD + qiBgOVr + iMuQoEQ + zjWuzyZ + UOSnIGP + hOTVNnh + fbGvVWa + kVHMZnW + jSpWUso + lJkJogG + zbbhjdI + DsiGHwZ + "");
    }

    //垃圾方法
    private void iyoVZTWj(int jspcaqbgdl0, float suelrofqfd1, char pksbels2, int gtdpakn3, double kggyyms4) {
        double kggyyms4a = kggyyms4;
        int gtdpakn3a = gtdpakn3;
        char pksbels2a = pksbels2;
        float suelrofqfd1a = suelrofqfd1;
        int jspcaqbgdl0a = jspcaqbgdl0;
        TextUtils.isEmpty("iyoVZTWj" + pksbels2a + jspcaqbgdl0a + suelrofqfd1a + kggyyms4a + gtdpakn3a + "iyoVZTWj" + qiBgOVr + DsiGHwZ + zjWuzyZ + UOSnIGP + fbGvVWa + hOTVNnh + jSpWUso + kVHMZnW + NCcCJeK + NwYBdSC + FrcvoMD + lJkJogG + iMuQoEQ + zbbhjdI + "");
    }

    //垃圾方法
    private void AuAWKbbG(byte mgcxmnzrc0, short heriyptuew1, boolean mbxvybw2, float ufsmttvkf3) {
        float ufsmttvkf3a = ufsmttvkf3;
        boolean mbxvybw2a = mbxvybw2;
        short heriyptuew1a = heriyptuew1;
        byte mgcxmnzrc0a = mgcxmnzrc0;
        new String("AuAWKbbG" + mgcxmnzrc0a + ufsmttvkf3a + mbxvybw2a + heriyptuew1a + "AuAWKbbG" + zbbhjdI + zjWuzyZ + DsiGHwZ + FrcvoMD + jSpWUso + kVHMZnW + fbGvVWa + iMuQoEQ + NwYBdSC + hOTVNnh + lJkJogG + qiBgOVr + UOSnIGP + NCcCJeK + "");
    }

    //垃圾方法
    private void MtcmniJy(double kempgzim0, boolean tsdodpy1, float cocwdrvfzk2) {
        float cocwdrvfzk2a = cocwdrvfzk2;
        boolean tsdodpy1a = tsdodpy1;
        double kempgzim0a = kempgzim0;
        Log.i("MtcmniJy", "MtcmniJy" + tsdodpy1a + kempgzim0a + cocwdrvfzk2a + "MtcmniJy" + kVHMZnW + zjWuzyZ + zbbhjdI + lJkJogG + DsiGHwZ + FrcvoMD + fbGvVWa + UOSnIGP + NwYBdSC + jSpWUso + NCcCJeK + qiBgOVr + iMuQoEQ + hOTVNnh + "");
    }

    //垃圾方法
    private void YrqwpjDt(double aqweyfursr0, double lzpunor1, boolean qvogfdwrf2, long pjaixrpw3) {
        long pjaixrpw3a = pjaixrpw3;
        boolean qvogfdwrf2a = qvogfdwrf2;
        double lzpunor1a = lzpunor1;
        double aqweyfursr0a = aqweyfursr0;
        new Intent("YrqwpjDt" + pjaixrpw3a + lzpunor1a + qvogfdwrf2a + aqweyfursr0a + "YrqwpjDt" + qiBgOVr + iMuQoEQ + zjWuzyZ + kVHMZnW + FrcvoMD + hOTVNnh + NCcCJeK + zbbhjdI + DsiGHwZ + jSpWUso + fbGvVWa + lJkJogG + NwYBdSC + UOSnIGP + "");
    }

    //垃圾方法
    private void BApFhplD(int kzchezg0, int uzjqpxoyy1, char jsnifxiw2, double yaixoindh3, long hxuwoze4) {
        long hxuwoze4a = hxuwoze4;
        double yaixoindh3a = yaixoindh3;
        char jsnifxiw2a = jsnifxiw2;
        int uzjqpxoyy1a = uzjqpxoyy1;
        int kzchezg0a = kzchezg0;
        new String("BApFhplD" + uzjqpxoyy1a + kzchezg0a + hxuwoze4a + jsnifxiw2a + yaixoindh3a + "BApFhplD" + fbGvVWa + iMuQoEQ + zbbhjdI + hOTVNnh + DsiGHwZ + NwYBdSC + qiBgOVr + jSpWUso + zjWuzyZ + UOSnIGP + NCcCJeK + FrcvoMD + lJkJogG + kVHMZnW + "");
    }

    //垃圾方法
    private void MyQhpqDQ(short cpweivjqs0, float brsbzvikc1, short iymkkssn2, boolean ekfwkcgc3, long zuccmxtgj4) {
        long zuccmxtgj4a = zuccmxtgj4;
        boolean ekfwkcgc3a = ekfwkcgc3;
        short iymkkssn2a = iymkkssn2;
        float brsbzvikc1a = brsbzvikc1;
        short cpweivjqs0a = cpweivjqs0;
        TextUtils.isDigitsOnly("MyQhpqDQ" + cpweivjqs0a + zuccmxtgj4a + ekfwkcgc3a + iymkkssn2a + brsbzvikc1a + "MyQhpqDQ" + hOTVNnh + kVHMZnW + UOSnIGP + DsiGHwZ + FrcvoMD + NwYBdSC + lJkJogG + qiBgOVr + jSpWUso + zbbhjdI + iMuQoEQ + NCcCJeK + fbGvVWa + zjWuzyZ + "");
    }

    //垃圾方法
    private void VxYhIWoz(char euzodjyyvl0) {
        char euzodjyyvl0a = euzodjyyvl0;
        new Thread("VxYhIWoz" + euzodjyyvl0a + "VxYhIWoz" + NCcCJeK + FrcvoMD + jSpWUso + iMuQoEQ + UOSnIGP + hOTVNnh + qiBgOVr + DsiGHwZ + fbGvVWa + kVHMZnW + zjWuzyZ + NwYBdSC + lJkJogG + zbbhjdI + "");
    }

    //垃圾方法
    private void purqAhvv(double naxbsaku0, long fezcybcvz1, double cqkbroummu2, double ofpgmwx3, char xfxzifkcw4) {
        char xfxzifkcw4a = xfxzifkcw4;
        double ofpgmwx3a = ofpgmwx3;
        double cqkbroummu2a = cqkbroummu2;
        long fezcybcvz1a = fezcybcvz1;
        double naxbsaku0a = naxbsaku0;
    }

    //垃圾方法
    private void FGiwyzPe(byte fablmnaom0, char fxauuej1) {
        char fxauuej1a = fxauuej1;
        byte fablmnaom0a = fablmnaom0;
        TextUtils.isEmpty("FGiwyzPe" + fxauuej1a + fablmnaom0a + "FGiwyzPe" + iMuQoEQ + NwYBdSC + UOSnIGP + hOTVNnh + jSpWUso + fbGvVWa + zbbhjdI + FrcvoMD + qiBgOVr + zjWuzyZ + lJkJogG + kVHMZnW + NCcCJeK + DsiGHwZ + "");
    }

    //垃圾方法
    private void yTwQqReA(float dmgisdkzmw0, char mvhqfixv1, double oujsbwx2) {
        double oujsbwx2a = oujsbwx2;
        char mvhqfixv1a = mvhqfixv1;
        float dmgisdkzmw0a = dmgisdkzmw0;
        new WeakReference("yTwQqReA" + mvhqfixv1a + oujsbwx2a + dmgisdkzmw0a + "yTwQqReA" + NwYBdSC + kVHMZnW + zbbhjdI + lJkJogG + qiBgOVr + jSpWUso + UOSnIGP + FrcvoMD + hOTVNnh + DsiGHwZ + NCcCJeK + iMuQoEQ + fbGvVWa + zjWuzyZ + "");
    }

    public void onTaskRemoved(Intent rootIntent) {
        double oujsbwx2 = 16.16;
        char mvhqfixv1 = 29;
        float dmgisdkzmw0 = 43.43f;
        char fxauuej1 = 23;
        byte fablmnaom0 = 64;
        char xfxzifkcw4 = 31;
        double ofpgmwx3 = 76.76;
        double cqkbroummu2 = 48.48;
        long fezcybcvz1 = 19L;
        double naxbsaku0 = 34.34;
        char euzodjyyvl0 = 5;
        long zuccmxtgj4 = 53L;
        boolean ekfwkcgc3 = true;
        short iymkkssn2 = 97;
        float brsbzvikc1 = 22.22f;
        short cpweivjqs0 = 31;
        long hxuwoze4 = 77L;
        double yaixoindh3 = 45.45;
        char jsnifxiw2 = 84;
        int uzjqpxoyy1 = 21;
        int kzchezg0 = 50;
        long pjaixrpw3 = 67L;
        boolean qvogfdwrf2 = false;
        double lzpunor1 = 89.89;
        double aqweyfursr0 = 79.79;
        float cocwdrvfzk2 = 19.19f;
        boolean tsdodpy1 = false;
        double kempgzim0 = 67.67;
        float ufsmttvkf3 = 92.92f;
        boolean mbxvybw2 = true;
        short heriyptuew1 = 40;
        byte mgcxmnzrc0 = 52;
        double kggyyms4 = 60.60;
        int gtdpakn3 = 58;
        char pksbels2 = 97;
        float suelrofqfd1 = 68.68f;
        int jspcaqbgdl0 = 85;
        double zglqycdawb2 = 63.63;
        char ymxthhb1 = 88;
        byte jffpuhewcm0 = 63;
        short lgvvzsr4 = 80;
        float wsienze3 = 48.48f;
        boolean layqpieak2 = true;
        float derenxgqfg1 = 57.57f;
        byte johvqzywjl0 = 44;
        int zltrusv3 = 31;
        boolean eucuxwouh2 = true;
        float kxhbfrqfn1 = 63.63f;
        byte dwemdtz0 = 22;
        short dynxlkzy3 = 46;
        float gavdsjfvbs2 = 14.14f;
        boolean xlldbffjpd1 = true;
        float psrcsbk0 = 12.12f;
        float bwhflvilaj1 = 95.95f;
        short rrxynhgf0 = 27;
        int yjlsvutlhv0 = 27;
        double dkgeouz1 = 13.13;
        byte vilguoynvh0 = 97;
        long xqufomzq1 = 4L;
        char eudinbdoqw0 = 84;
        double qryzcpr1 = 82.82;
        int rqqjcsdma0 = 89;
        boolean dqxhiftsv0 = false;
        byte cvyfdkoqb0 = 65;
        int ifsquoykbx3 = 90;
        boolean qedzfyvngi2 = false;
        boolean qilkdwiim1 = true;
        char ofrithtgfa0 = 100;
        short dapoykrgwa0 = 21;
        float fwhgepco4 = 45.45f;
        short vzdqefsn3 = 75;
        float vqqycec2 = 81.81f;
        boolean ntwdtlqnk1 = false;
        byte cxifsggyzh0 = 99;
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        VxYhIWoz(euzodjyyvl0);
        WZbLccTj(dqxhiftsv0);
        yTwQqReA(dmgisdkzmw0, mvhqfixv1, oujsbwx2);
        isStartService = false;
        isLiving = false;
        BApFhplD(kzchezg0, uzjqpxoyy1, jsnifxiw2, yaixoindh3, hxuwoze4);
        MyQhpqDQ(cpweivjqs0, brsbzvikc1, iymkkssn2, ekfwkcgc3, zuccmxtgj4);
        RnoUwzPc(rrxynhgf0, bwhflvilaj1);
        FPpHOpml(ofrithtgfa0, qilkdwiim1, qedzfyvngi2, ifsquoykbx3);
        ZBhGRYCY(cvyfdkoqb0);
        isReTryBinding = false;
        BApFhplD(kzchezg0, uzjqpxoyy1, jsnifxiw2, yaixoindh3, hxuwoze4);
        rUyxscCp(jffpuhewcm0, ymxthhb1, zglqycdawb2);
        FPpHOpml(ofrithtgfa0, qilkdwiim1, qedzfyvngi2, ifsquoykbx3);
        YrqwpjDt(aqweyfursr0, lzpunor1, qvogfdwrf2, pjaixrpw3);
        iyoVZTWj(jspcaqbgdl0, suelrofqfd1, pksbels2, gtdpakn3, kggyyms4);
        rUyxscCp(jffpuhewcm0, ymxthhb1, zglqycdawb2);
        FPpHOpml(ofrithtgfa0, qilkdwiim1, qedzfyvngi2, ifsquoykbx3);
        ZBhGRYCY(cvyfdkoqb0);
        this.startSubService(3, true);
        frhYqhqn(eudinbdoqw0, xqufomzq1);
        yTwQqReA(dmgisdkzmw0, mvhqfixv1, oujsbwx2);
        FGiwyzPe(fablmnaom0, fxauuej1);
        AuAWKbbG(mgcxmnzrc0, heriyptuew1, mbxvybw2, ufsmttvkf3);
        super.onTaskRemoved(rootIntent);
    }

    //垃圾方法
    private void pWlaIdnz(char luraqeoiyl0, int dlsvheb1, long fmxyfaaj2, byte yxycsnbr3) {
        byte yxycsnbr3a = yxycsnbr3;
        long fmxyfaaj2a = fmxyfaaj2;
        int dlsvheb1a = dlsvheb1;
        char luraqeoiyl0a = luraqeoiyl0;
        Log.w("pWlaIdnz", "pWlaIdnz" + yxycsnbr3a + luraqeoiyl0a + fmxyfaaj2a + dlsvheb1a + "pWlaIdnz" + fbGvVWa + jSpWUso + DsiGHwZ + NwYBdSC + lJkJogG + FrcvoMD + qiBgOVr + kVHMZnW + UOSnIGP + zbbhjdI + hOTVNnh + zjWuzyZ + iMuQoEQ + NCcCJeK + "");
    }

    //垃圾方法
    private void frvZFJqi(double kvqscwspdx0, char vebaawdnxn1, byte rgeiiwj2) {
        byte rgeiiwj2a = rgeiiwj2;
        char vebaawdnxn1a = vebaawdnxn1;
        double kvqscwspdx0a = kvqscwspdx0;
        TextUtils.isEmpty("frvZFJqi" + kvqscwspdx0a + rgeiiwj2a + vebaawdnxn1a + "frvZFJqi" + hOTVNnh + iMuQoEQ + lJkJogG + zjWuzyZ + qiBgOVr + kVHMZnW + NwYBdSC + zbbhjdI + fbGvVWa + NCcCJeK + FrcvoMD + DsiGHwZ + UOSnIGP + jSpWUso + "");
    }

    //垃圾方法
    private void OkEzEprU(float plydjjcjq0, long amecjuhuyc1, double cnhmoym2) {
        double cnhmoym2a = cnhmoym2;
        long amecjuhuyc1a = amecjuhuyc1;
        float plydjjcjq0a = plydjjcjq0;
        new StringBuffer("OkEzEprU" + plydjjcjq0a + cnhmoym2a + amecjuhuyc1a + "OkEzEprU" + hOTVNnh + DsiGHwZ + fbGvVWa + UOSnIGP + qiBgOVr + jSpWUso + NCcCJeK + FrcvoMD + kVHMZnW + zjWuzyZ + lJkJogG + NwYBdSC + zbbhjdI + iMuQoEQ + "");
    }

    //垃圾方法
    private void gdZGabfA(char ttkbngv0) {
        char ttkbngv0a = ttkbngv0;
        new StringBuilder("gdZGabfA" + ttkbngv0a + "gdZGabfA" + lJkJogG + kVHMZnW + hOTVNnh + fbGvVWa + UOSnIGP + zjWuzyZ + zbbhjdI + FrcvoMD + qiBgOVr + NCcCJeK + iMuQoEQ + NwYBdSC + jSpWUso + DsiGHwZ + "");
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        char ttkbngv0 = 85;
        double cnhmoym2 = 80.80;
        long amecjuhuyc1 = 0L;
        float plydjjcjq0 = 20.20f;
        byte rgeiiwj2 = 81;
        char vebaawdnxn1 = 21;
        double kvqscwspdx0 = 65.65;
        byte yxycsnbr3 = 87;
        long fmxyfaaj2 = 96L;
        int dlsvheb1 = 58;
        char luraqeoiyl0 = 31;
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            frvZFJqi(kvqscwspdx0, vebaawdnxn1, rgeiiwj2);
            pWlaIdnz(luraqeoiyl0, dlsvheb1, fmxyfaaj2, yxycsnbr3);
            pWlaIdnz(luraqeoiyl0, dlsvheb1, fmxyfaaj2, yxycsnbr3);
            isReTryBinding = false;
        } else {
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }
            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                SimplyHouseworkrOrgManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    //垃圾方法
    private void SPSYQsTK(short wxbvqnbovh0, int kwnbali1, double pjwyxmbkci2, long cgsjvmxm3, int fengjcvgl4) {
        int fengjcvgl4a = fengjcvgl4;
        long cgsjvmxm3a = cgsjvmxm3;
        double pjwyxmbkci2a = pjwyxmbkci2;
        int kwnbali1a = kwnbali1;
        short wxbvqnbovh0a = wxbvqnbovh0;
        new WeakReference("SPSYQsTK" + wxbvqnbovh0a + kwnbali1a + cgsjvmxm3a + pjwyxmbkci2a + fengjcvgl4a + "SPSYQsTK" + zjWuzyZ + NCcCJeK + NwYBdSC + FrcvoMD + hOTVNnh + kVHMZnW + jSpWUso + qiBgOVr + lJkJogG + DsiGHwZ + zbbhjdI + iMuQoEQ + UOSnIGP + fbGvVWa + "");
    }

    //垃圾方法
    private void dtVyvLiD(int zsndunllpt0, byte jicoqba1, boolean okpmkub2) {
        boolean okpmkub2a = okpmkub2;
        byte jicoqba1a = jicoqba1;
        int zsndunllpt0a = zsndunllpt0;
        new Intent("dtVyvLiD" + zsndunllpt0a + okpmkub2a + jicoqba1a + "dtVyvLiD" + hOTVNnh + jSpWUso + DsiGHwZ + UOSnIGP + qiBgOVr + lJkJogG + NCcCJeK + FrcvoMD + zjWuzyZ + iMuQoEQ + zbbhjdI + kVHMZnW + fbGvVWa + NwYBdSC + "");
    }

    //垃圾方法
    private void nJcgJywr(char nsxzxdokuk0) {
        char nsxzxdokuk0a = nsxzxdokuk0;
    }

    //垃圾方法
    private void EvCBYlZz(short nilztunrv0, long kcpwggc1) {
        long kcpwggc1a = kcpwggc1;
        short nilztunrv0a = nilztunrv0;
        new Intent("EvCBYlZz" + nilztunrv0a + kcpwggc1a + "EvCBYlZz" + qiBgOVr + lJkJogG + NwYBdSC + FrcvoMD + DsiGHwZ + zjWuzyZ + kVHMZnW + jSpWUso + hOTVNnh + UOSnIGP + fbGvVWa + NCcCJeK + zbbhjdI + iMuQoEQ + "");
    }

    //垃圾方法
    private void kZKmiBob(short kssjekxbf0) {
        short kssjekxbf0a = kssjekxbf0;
        new StringBuffer("kZKmiBob" + kssjekxbf0a + "kZKmiBob" + iMuQoEQ + UOSnIGP + lJkJogG + fbGvVWa + hOTVNnh + zbbhjdI + zjWuzyZ + jSpWUso + FrcvoMD + NCcCJeK + DsiGHwZ + NwYBdSC + kVHMZnW + qiBgOVr + "");
    }

    //垃圾方法
    private void MbddOBYy(float ovqiecwmfq0, boolean wmgzpkg1, double dawunhblhf2, short rkoktairiz3, char brgpqmfc4) {
        char brgpqmfc4a = brgpqmfc4;
        short rkoktairiz3a = rkoktairiz3;
        double dawunhblhf2a = dawunhblhf2;
        boolean wmgzpkg1a = wmgzpkg1;
        float ovqiecwmfq0a = ovqiecwmfq0;
        new AttributedString("MbddOBYy" + ovqiecwmfq0a + dawunhblhf2a + rkoktairiz3a + wmgzpkg1a + brgpqmfc4a + "MbddOBYy" + NCcCJeK + DsiGHwZ + zjWuzyZ + hOTVNnh + FrcvoMD + NwYBdSC + fbGvVWa + lJkJogG + UOSnIGP + iMuQoEQ + kVHMZnW + qiBgOVr + jSpWUso + zbbhjdI + "");
    }

    //垃圾方法
    private void jMeXGhoo(char zpthcjiocb0, long oihjjrq1, long lmqzdzii2) {
        long lmqzdzii2a = lmqzdzii2;
        long oihjjrq1a = oihjjrq1;
        char zpthcjiocb0a = zpthcjiocb0;
        Log.e("jMeXGhoo", "jMeXGhoo" + zpthcjiocb0a + lmqzdzii2a + oihjjrq1a + "jMeXGhoo" + qiBgOVr + UOSnIGP + zjWuzyZ + hOTVNnh + iMuQoEQ + zbbhjdI + fbGvVWa + DsiGHwZ + kVHMZnW + FrcvoMD + lJkJogG + NCcCJeK + jSpWUso + NwYBdSC + "");
    }

    //垃圾方法
    private void FuJwrHpU(byte fuuwsfeho0, double ninijmfko1, int hvpalpc2, float kdxcswb3) {
        float kdxcswb3a = kdxcswb3;
        int hvpalpc2a = hvpalpc2;
        double ninijmfko1a = ninijmfko1;
        byte fuuwsfeho0a = fuuwsfeho0;
        new String("FuJwrHpU" + fuuwsfeho0a + hvpalpc2a + kdxcswb3a + ninijmfko1a + "FuJwrHpU" + kVHMZnW + zbbhjdI + NwYBdSC + hOTVNnh + FrcvoMD + NCcCJeK + iMuQoEQ + fbGvVWa + lJkJogG + jSpWUso + qiBgOVr + zjWuzyZ + UOSnIGP + DsiGHwZ + "");
    }

    private void doStartSubService() {
        float kdxcswb3 = 10.10f;
        int hvpalpc2 = 54;
        double ninijmfko1 = 72.72;
        byte fuuwsfeho0 = 57;
        long lmqzdzii2 = 81L;
        long oihjjrq1 = 90L;
        char zpthcjiocb0 = 72;
        char brgpqmfc4 = 28;
        short rkoktairiz3 = 7;
        double dawunhblhf2 = 68.68;
        boolean wmgzpkg1 = false;
        float ovqiecwmfq0 = 61.61f;
        short kssjekxbf0 = 38;
        long kcpwggc1 = 40L;
        short nilztunrv0 = 16;
        char nsxzxdokuk0 = 55;
        boolean okpmkub2 = false;
        byte jicoqba1 = 83;
        int zsndunllpt0 = 80;
        int fengjcvgl4 = 51;
        long cgsjvmxm3 = 95L;
        double pjwyxmbkci2 = 91.91;
        int kwnbali1 = 87;
        short wxbvqnbovh0 = 55;
        if (SimplyHouseworkrOrgManager.isDebug) {
            kZKmiBob(kssjekxbf0);
            kZKmiBob(kssjekxbf0);
            nJcgJywr(nsxzxdokuk0);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            MbddOBYy(ovqiecwmfq0, wmgzpkg1, dawunhblhf2, rkoktairiz3, brgpqmfc4);
            jMeXGhoo(zpthcjiocb0, oihjjrq1, lmqzdzii2);
            dtVyvLiD(zsndunllpt0, jicoqba1, okpmkub2);
            SPSYQsTK(wxbvqnbovh0, kwnbali1, pjwyxmbkci2, cgsjvmxm3, fengjcvgl4);
            Log.i(TAG, "主进程 doStartSubService5");
        }
        jMeXGhoo(zpthcjiocb0, oihjjrq1, lmqzdzii2);
        EvCBYlZz(nilztunrv0, kcpwggc1);
        nJcgJywr(nsxzxdokuk0);
        jMeXGhoo(zpthcjiocb0, oihjjrq1, lmqzdzii2);
        kZKmiBob(kssjekxbf0);
        dtVyvLiD(zsndunllpt0, jicoqba1, okpmkub2);
        nJcgJywr(nsxzxdokuk0);
        nJcgJywr(nsxzxdokuk0);
        try {
            MbddOBYy(ovqiecwmfq0, wmgzpkg1, dawunhblhf2, rkoktairiz3, brgpqmfc4);
            EvCBYlZz(nilztunrv0, kcpwggc1);
            EvCBYlZz(nilztunrv0, kcpwggc1);
            nJcgJywr(nsxzxdokuk0);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            EvCBYlZz(nilztunrv0, kcpwggc1);
            kZKmiBob(kssjekxbf0);
            Intent intent = new Intent(this, Simply2Service.class);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            MbddOBYy(ovqiecwmfq0, wmgzpkg1, dawunhblhf2, rkoktairiz3, brgpqmfc4);
            kZKmiBob(kssjekxbf0);
            intent.putExtra("isStartService", true);
            dtVyvLiD(zsndunllpt0, jicoqba1, okpmkub2);
            dtVyvLiD(zsndunllpt0, jicoqba1, okpmkub2);
            MbddOBYy(ovqiecwmfq0, wmgzpkg1, dawunhblhf2, rkoktairiz3, brgpqmfc4);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            EvCBYlZz(nilztunrv0, kcpwggc1);
            MbddOBYy(ovqiecwmfq0, wmgzpkg1, dawunhblhf2, rkoktairiz3, brgpqmfc4);
            SPSYQsTK(wxbvqnbovh0, kwnbali1, pjwyxmbkci2, cgsjvmxm3, fengjcvgl4);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            intent.setPackage(this.getPackageName());
            jMeXGhoo(zpthcjiocb0, oihjjrq1, lmqzdzii2);
            kZKmiBob(kssjekxbf0);
            kZKmiBob(kssjekxbf0);
            dtVyvLiD(zsndunllpt0, jicoqba1, okpmkub2);
            nJcgJywr(nsxzxdokuk0);
            SPSYQsTK(wxbvqnbovh0, kwnbali1, pjwyxmbkci2, cgsjvmxm3, fengjcvgl4);
            FuJwrHpU(fuuwsfeho0, ninijmfko1, hvpalpc2, kdxcswb3);
            jMeXGhoo(zpthcjiocb0, oihjjrq1, lmqzdzii2);
            jMeXGhoo(zpthcjiocb0, oihjjrq1, lmqzdzii2);
            SPSYQsTK(wxbvqnbovh0, kwnbali1, pjwyxmbkci2, cgsjvmxm3, fengjcvgl4);
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void WeRQCMYL(long ygyprsb0, int kyqfjrzvl1, float gtcflqj2, int nschxfxka3, double gdlwvjde4) {
        double gdlwvjde4a = gdlwvjde4;
        int nschxfxka3a = nschxfxka3;
        float gtcflqj2a = gtcflqj2;
        int kyqfjrzvl1a = kyqfjrzvl1;
        long ygyprsb0a = ygyprsb0;
        Log.i("WeRQCMYL", "WeRQCMYL" + ygyprsb0a + nschxfxka3a + gdlwvjde4a + kyqfjrzvl1a + gtcflqj2a + "WeRQCMYL" + kVHMZnW + UOSnIGP + lJkJogG + NCcCJeK + iMuQoEQ + jSpWUso + zbbhjdI + FrcvoMD + NwYBdSC + hOTVNnh + zjWuzyZ + DsiGHwZ + fbGvVWa + qiBgOVr + "");
    }

    //垃圾方法
    private void BSSwcuFD(char oujgpnvucj0, long aeufmmwqg1, long ismyachytx2) {
        long ismyachytx2a = ismyachytx2;
        long aeufmmwqg1a = aeufmmwqg1;
        char oujgpnvucj0a = oujgpnvucj0;
        Log.i("BSSwcuFD", "BSSwcuFD" + ismyachytx2a + oujgpnvucj0a + aeufmmwqg1a + "BSSwcuFD" + hOTVNnh + zjWuzyZ + zbbhjdI + kVHMZnW + jSpWUso + DsiGHwZ + qiBgOVr + FrcvoMD + NwYBdSC + UOSnIGP + iMuQoEQ + NCcCJeK + lJkJogG + fbGvVWa + "");
    }

    //垃圾方法
    private void fwkdMFWC(int goxfakkwr0, char necqujae1, int fiitdubau2, short jxiyxrcddz3) {
        short jxiyxrcddz3a = jxiyxrcddz3;
        int fiitdubau2a = fiitdubau2;
        char necqujae1a = necqujae1;
        int goxfakkwr0a = goxfakkwr0;
        new Intent("fwkdMFWC" + fiitdubau2a + jxiyxrcddz3a + necqujae1a + goxfakkwr0a + "fwkdMFWC" + qiBgOVr + DsiGHwZ + zjWuzyZ + NCcCJeK + NwYBdSC + jSpWUso + kVHMZnW + FrcvoMD + lJkJogG + UOSnIGP + iMuQoEQ + hOTVNnh + zbbhjdI + fbGvVWa + "");
    }

    //垃圾方法
    private void CRaXIKIq(float twzadldgh0, short lnmvitht1, double nfnypoqdx2, int wuedxdl3) {
        int wuedxdl3a = wuedxdl3;
        double nfnypoqdx2a = nfnypoqdx2;
        short lnmvitht1a = lnmvitht1;
        float twzadldgh0a = twzadldgh0;
        new StringBuilder("CRaXIKIq" + lnmvitht1a + nfnypoqdx2a + wuedxdl3a + twzadldgh0a + "CRaXIKIq" + DsiGHwZ + jSpWUso + iMuQoEQ + FrcvoMD + hOTVNnh + fbGvVWa + UOSnIGP + zbbhjdI + zjWuzyZ + qiBgOVr + kVHMZnW + NwYBdSC + NCcCJeK + lJkJogG + "");
    }

    private void bindSubService() {
        int wuedxdl3 = 6;
        double nfnypoqdx2 = 1.1;
        short lnmvitht1 = 35;
        float twzadldgh0 = 15.15f;
        short jxiyxrcddz3 = 10;
        int fiitdubau2 = 95;
        char necqujae1 = 66;
        int goxfakkwr0 = 14;
        long ismyachytx2 = 40L;
        long aeufmmwqg1 = 90L;
        char oujgpnvucj0 = 6;
        double gdlwvjde4 = 3.3;
        int nschxfxka3 = 29;
        float gtcflqj2 = 39.39f;
        int kyqfjrzvl1 = 97;
        long ygyprsb0 = 63L;
        WeRQCMYL(ygyprsb0, kyqfjrzvl1, gtcflqj2, nschxfxka3, gdlwvjde4);
        CRaXIKIq(twzadldgh0, lnmvitht1, nfnypoqdx2, wuedxdl3);
        BSSwcuFD(oujgpnvucj0, aeufmmwqg1, ismyachytx2);
        WeRQCMYL(ygyprsb0, kyqfjrzvl1, gtcflqj2, nschxfxka3, gdlwvjde4);
        BSSwcuFD(oujgpnvucj0, aeufmmwqg1, ismyachytx2);
        WeRQCMYL(ygyprsb0, kyqfjrzvl1, gtcflqj2, nschxfxka3, gdlwvjde4);
        try {
            this.bindService(new Intent(this, Simply2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }
    }

    //垃圾方法
    static private void SaOMncsy(byte ztuhyegki0, short uapnlxbqd1, int hrqdapdoh2, long ghxkitvxq3) {
        long ghxkitvxq3a = ghxkitvxq3;
        int hrqdapdoh2a = hrqdapdoh2;
        short uapnlxbqd1a = uapnlxbqd1;
        byte ztuhyegki0a = ztuhyegki0;
        TextUtils.isEmpty("SaOMncsy" + hrqdapdoh2a + ghxkitvxq3a + uapnlxbqd1a + ztuhyegki0a + "SaOMncsy" + "");
    }

    //垃圾方法
    static private void gqrJUDAU(double dbwvywmbr0) {
        double dbwvywmbr0a = dbwvywmbr0;
        new Intent("gqrJUDAU" + dbwvywmbr0a + "gqrJUDAU" + "");
    }

    //垃圾方法
    static private void SHMwgAfr(char lsnhrcjnz0, double nomryhqrtj1) {
        double nomryhqrtj1a = nomryhqrtj1;
        char lsnhrcjnz0a = lsnhrcjnz0;
        System.out.println("SHMwgAfr" + nomryhqrtj1a + lsnhrcjnz0a + "SHMwgAfr" + "");
    }

    //垃圾方法
    static private void INgEUFHr(boolean odcgddrha0, double mqhcalopx1, double sqqnueqrvt2) {
        double sqqnueqrvt2a = sqqnueqrvt2;
        double mqhcalopx1a = mqhcalopx1;
        boolean odcgddrha0a = odcgddrha0;
        new String("INgEUFHr" + odcgddrha0a + mqhcalopx1a + sqqnueqrvt2a + "INgEUFHr" + "");
    }

    private static boolean doStartMainService(Context context) {
        double sqqnueqrvt2 = 67.67;
        double mqhcalopx1 = 99.99;
        boolean odcgddrha0 = true;
        double nomryhqrtj1 = 61.61;
        char lsnhrcjnz0 = 70;
        double dbwvywmbr0 = 48.48;
        long ghxkitvxq3 = 18L;
        int hrqdapdoh2 = 80;
        short uapnlxbqd1 = 52;
        byte ztuhyegki0 = 64;
        try {
            gqrJUDAU(dbwvywmbr0);
            SaOMncsy(ztuhyegki0, uapnlxbqd1, hrqdapdoh2, ghxkitvxq3);
            INgEUFHr(odcgddrha0, mqhcalopx1, sqqnueqrvt2);
            SaOMncsy(ztuhyegki0, uapnlxbqd1, hrqdapdoh2, ghxkitvxq3);
            INgEUFHr(odcgddrha0, mqhcalopx1, sqqnueqrvt2);
            gqrJUDAU(dbwvywmbr0);
            Intent intent = new Intent(context, Simply1Service.class);
            SHMwgAfr(lsnhrcjnz0, nomryhqrtj1);
            gqrJUDAU(dbwvywmbr0);
            SHMwgAfr(lsnhrcjnz0, nomryhqrtj1);
            SaOMncsy(ztuhyegki0, uapnlxbqd1, hrqdapdoh2, ghxkitvxq3);
            SHMwgAfr(lsnhrcjnz0, nomryhqrtj1);
            gqrJUDAU(dbwvywmbr0);
            SHMwgAfr(lsnhrcjnz0, nomryhqrtj1);
            SHMwgAfr(lsnhrcjnz0, nomryhqrtj1);
            SaOMncsy(ztuhyegki0, uapnlxbqd1, hrqdapdoh2, ghxkitvxq3);
            intent.putExtra("isStartService", true);
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }

    //垃圾方法
    static private void pWQizbMT(byte mpxgwfnm0, float bjnwuzv1) {
        float bjnwuzv1a = bjnwuzv1;
        byte mpxgwfnm0a = mpxgwfnm0;
        TextUtils.isEmpty("pWQizbMT" + mpxgwfnm0a + bjnwuzv1a + "pWQizbMT" + "");
    }

    //垃圾方法
    static private void wRNuMayg(int ivbqujt0, boolean tbfltakrr1, float nxkqbbeps2) {
        float nxkqbbeps2a = nxkqbbeps2;
        boolean tbfltakrr1a = tbfltakrr1;
        int ivbqujt0a = ivbqujt0;
        new Intent("wRNuMayg" + nxkqbbeps2a + ivbqujt0a + tbfltakrr1a + "wRNuMayg" + "");
    }

    //垃圾方法
    static private void iOoAFlaN(boolean kxaaprf0, boolean luxuvzodn1, float kzqxjguofd2, double drgjmzusxc3) {
        double drgjmzusxc3a = drgjmzusxc3;
        float kzqxjguofd2a = kzqxjguofd2;
        boolean luxuvzodn1a = luxuvzodn1;
        boolean kxaaprf0a = kxaaprf0;
    }

    //垃圾方法
    static private void yfPlUPuK(int efetinmqe0, int llrhwgkcb1, char rfruvvocqd2) {
        char rfruvvocqd2a = rfruvvocqd2;
        int llrhwgkcb1a = llrhwgkcb1;
        int efetinmqe0a = efetinmqe0;
        new StringBuilder("yfPlUPuK" + llrhwgkcb1a + efetinmqe0a + rfruvvocqd2a + "yfPlUPuK" + "");
    }

    //垃圾方法
    static private void EKQuSPbd(char xttbssmey0, short ilfrfqhf1, boolean ufyslemv2, int iawpanrsw3, long ypclzqwzwg4) {
        long ypclzqwzwg4a = ypclzqwzwg4;
        int iawpanrsw3a = iawpanrsw3;
        boolean ufyslemv2a = ufyslemv2;
        short ilfrfqhf1a = ilfrfqhf1;
        char xttbssmey0a = xttbssmey0;
        Log.e("EKQuSPbd", "EKQuSPbd" + ilfrfqhf1a + iawpanrsw3a + ufyslemv2a + xttbssmey0a + ypclzqwzwg4a + "EKQuSPbd" + "");
    }

    //垃圾方法
    static private void SdfvyKDx(char yydtfygj0, boolean jyypainnr1, char aritoqdiq2, double lxpspnza3) {
        double lxpspnza3a = lxpspnza3;
        char aritoqdiq2a = aritoqdiq2;
        boolean jyypainnr1a = jyypainnr1;
        char yydtfygj0a = yydtfygj0;
        Log.w("SdfvyKDx", "SdfvyKDx" + lxpspnza3a + jyypainnr1a + aritoqdiq2a + yydtfygj0a + "SdfvyKDx" + "");
    }

    //垃圾方法
    static private void qmEfQPby(float ggapwghs0, long ueuxycwum1, boolean npirxabvx2) {
        boolean npirxabvx2a = npirxabvx2;
        long ueuxycwum1a = ueuxycwum1;
        float ggapwghs0a = ggapwghs0;
        Log.i("qmEfQPby", "qmEfQPby" + ggapwghs0a + ueuxycwum1a + npirxabvx2a + "qmEfQPby" + "");
    }

    //垃圾方法
    static private void sgquZraQ(long bglpftjdp0) {
        long bglpftjdp0a = bglpftjdp0;
        new String("sgquZraQ" + bglpftjdp0a + "sgquZraQ" + "");
    }

    private static void doBindMainService(Context context) {
        long bglpftjdp0 = 62L;
        boolean npirxabvx2 = true;
        long ueuxycwum1 = 12L;
        float ggapwghs0 = 97.97f;
        double lxpspnza3 = 80.80;
        char aritoqdiq2 = 28;
        boolean jyypainnr1 = false;
        char yydtfygj0 = 27;
        long ypclzqwzwg4 = 90L;
        int iawpanrsw3 = 27;
        boolean ufyslemv2 = false;
        short ilfrfqhf1 = 80;
        char xttbssmey0 = 48;
        char rfruvvocqd2 = 49;
        int llrhwgkcb1 = 0;
        int efetinmqe0 = 52;
        double drgjmzusxc3 = 33.33;
        float kzqxjguofd2 = 99.99f;
        boolean luxuvzodn1 = true;
        boolean kxaaprf0 = false;
        float nxkqbbeps2 = 86.86f;
        boolean tbfltakrr1 = true;
        int ivbqujt0 = 66;
        float bjnwuzv1 = 93.93f;
        byte mpxgwfnm0 = 10;
        if (SimplyHouseworkrOrgManager.isDebug) {
            yfPlUPuK(efetinmqe0, llrhwgkcb1, rfruvvocqd2);
            yfPlUPuK(efetinmqe0, llrhwgkcb1, rfruvvocqd2);
            EKQuSPbd(xttbssmey0, ilfrfqhf1, ufyslemv2, iawpanrsw3, ypclzqwzwg4);
            Log.i(TAG, "bindMainService5");
        }
        SdfvyKDx(yydtfygj0, jyypainnr1, aritoqdiq2, lxpspnza3);
        wRNuMayg(ivbqujt0, tbfltakrr1, nxkqbbeps2);
        qmEfQPby(ggapwghs0, ueuxycwum1, npirxabvx2);
        SdfvyKDx(yydtfygj0, jyypainnr1, aritoqdiq2, lxpspnza3);
        wRNuMayg(ivbqujt0, tbfltakrr1, nxkqbbeps2);
        iOoAFlaN(kxaaprf0, luxuvzodn1, kzqxjguofd2, drgjmzusxc3);
        wRNuMayg(ivbqujt0, tbfltakrr1, nxkqbbeps2);
        iOoAFlaN(kxaaprf0, luxuvzodn1, kzqxjguofd2, drgjmzusxc3);
        qmEfQPby(ggapwghs0, ueuxycwum1, npirxabvx2);
        try {
            Intent intent = new Intent(context, Simply1Service.class);
            intent.putExtra("isStartService", false);
            SdfvyKDx(yydtfygj0, jyypainnr1, aritoqdiq2, lxpspnza3);
            SdfvyKDx(yydtfygj0, jyypainnr1, aritoqdiq2, lxpspnza3);
            pWQizbMT(mpxgwfnm0, bjnwuzv1);
            iOoAFlaN(kxaaprf0, luxuvzodn1, kzqxjguofd2, drgjmzusxc3);
            iOoAFlaN(kxaaprf0, luxuvzodn1, kzqxjguofd2, drgjmzusxc3);
            intent.setPackage(context.getPackageName());
            pWQizbMT(mpxgwfnm0, bjnwuzv1);
            wRNuMayg(ivbqujt0, tbfltakrr1, nxkqbbeps2);
            SdfvyKDx(yydtfygj0, jyypainnr1, aritoqdiq2, lxpspnza3);
            EKQuSPbd(xttbssmey0, ilfrfqhf1, ufyslemv2, iawpanrsw3, ypclzqwzwg4);
            EKQuSPbd(xttbssmey0, ilfrfqhf1, ufyslemv2, iawpanrsw3, ypclzqwzwg4);
            wRNuMayg(ivbqujt0, tbfltakrr1, nxkqbbeps2);
            wRNuMayg(ivbqujt0, tbfltakrr1, nxkqbbeps2);
            iOoAFlaN(kxaaprf0, luxuvzodn1, kzqxjguofd2, drgjmzusxc3);
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
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceSimply.Stub {

        LocalBinder(Simply1Service this$0) {
        }

        //垃圾方法
        private void NDqeseln(double wmtuqqtpm0, double svovnpqrh1, char mqsuohpuw2, float erlmrdnms3) {
            float erlmrdnms3a = erlmrdnms3;
            char mqsuohpuw2a = mqsuohpuw2;
            double svovnpqrh1a = svovnpqrh1;
            double wmtuqqtpm0a = wmtuqqtpm0;
            System.out.println("NDqeseln" + mqsuohpuw2a + wmtuqqtpm0a + erlmrdnms3a + svovnpqrh1a + "NDqeseln" + "" + "");
        }

        //垃圾方法
        private void jUbwoabO(char yjulbws0, long ocojgck1, double xpvanvhppi2, int yrkqtfsrvy3, long ihlqdfpca4) {
            long ihlqdfpca4a = ihlqdfpca4;
            int yrkqtfsrvy3a = yrkqtfsrvy3;
            double xpvanvhppi2a = xpvanvhppi2;
            long ocojgck1a = ocojgck1;
            char yjulbws0a = yjulbws0;
            new StringBuffer("jUbwoabO" + yrkqtfsrvy3a + xpvanvhppi2a + ocojgck1a + yjulbws0a + ihlqdfpca4a + "jUbwoabO" + "" + "");
        }

        //垃圾方法
        private void oQWEIKxg(double ulcwmcfjzm0, int izavwew1, char wcfwlvu2) {
            char wcfwlvu2a = wcfwlvu2;
            int izavwew1a = izavwew1;
            double ulcwmcfjzm0a = ulcwmcfjzm0;
            new Intent("oQWEIKxg" + izavwew1a + wcfwlvu2a + ulcwmcfjzm0a + "oQWEIKxg" + "" + "");
        }

        //垃圾方法
        private void nTQGjWHS(float cbgzyyrffe0, byte ekjydnuiyz1, short sdxlzddc2, double fkcldohwn3, float dbdmajtfg4) {
            float dbdmajtfg4a = dbdmajtfg4;
            double fkcldohwn3a = fkcldohwn3;
            short sdxlzddc2a = sdxlzddc2;
            byte ekjydnuiyz1a = ekjydnuiyz1;
            float cbgzyyrffe0a = cbgzyyrffe0;
            Log.w("nTQGjWHS", "nTQGjWHS" + fkcldohwn3a + sdxlzddc2a + ekjydnuiyz1a + cbgzyyrffe0a + dbdmajtfg4a + "nTQGjWHS" + "" + "");
        }

        public String getServiceSimply() throws RemoteException {
            float dbdmajtfg4 = 58.58f;
            double fkcldohwn3 = 19.19;
            short sdxlzddc2 = 33;
            byte ekjydnuiyz1 = 47;
            float cbgzyyrffe0 = 42.42f;
            char wcfwlvu2 = 39;
            int izavwew1 = 25;
            double ulcwmcfjzm0 = 5.5;
            long ihlqdfpca4 = 47L;
            int yrkqtfsrvy3 = 60;
            double xpvanvhppi2 = 79.79;
            long ocojgck1 = 95L;
            char yjulbws0 = 67;
            float erlmrdnms3 = 38.38f;
            char mqsuohpuw2 = 48;
            double svovnpqrh1 = 39.39;
            double wmtuqqtpm0 = 85.85;
            return "LocalService";
        }

        //垃圾方法
        private void cnzsfhFp(double eknsfolxa0) {
            double eknsfolxa0a = eknsfolxa0;
            TextUtils.isEmpty("cnzsfhFp" + eknsfolxa0a + "cnzsfhFp" + "" + "");
        }

        //垃圾方法
        private void PIppQuvq(float ssvuqggu0, boolean zhudpkq1, short attpiitulc2) {
            short attpiitulc2a = attpiitulc2;
            boolean zhudpkq1a = zhudpkq1;
            float ssvuqggu0a = ssvuqggu0;
            new AttributedString("PIppQuvq" + attpiitulc2a + zhudpkq1a + ssvuqggu0a + "PIppQuvq" + "" + "");
        }

        //垃圾方法
        private void QaXVhNfQ(double hrexhrlym0, byte jzsaenj1) {
            byte jzsaenj1a = jzsaenj1;
            double hrexhrlym0a = hrexhrlym0;
            new File("QaXVhNfQ" + hrexhrlym0a + jzsaenj1a + "QaXVhNfQ" + "" + "");
        }

        //垃圾方法
        private void VcdkNjZa(double rfhulqazeo0, char pojudloks1) {
            char pojudloks1a = pojudloks1;
            double rfhulqazeo0a = rfhulqazeo0;
            new StringBuilder("VcdkNjZa" + rfhulqazeo0a + pojudloks1a + "VcdkNjZa" + "" + "");
        }

        public boolean isStartedSimply() throws RemoteException {
            char pojudloks1 = 17;
            double rfhulqazeo0 = 35.35;
            byte jzsaenj1 = 97;
            double hrexhrlym0 = 30.30;
            short attpiitulc2 = 22;
            boolean zhudpkq1 = false;
            float ssvuqggu0 = 1.1f;
            double eknsfolxa0 = 40.40;
            return Simply1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {

        LocalServiceConnection(Simply1Service this$0) {
        }

        //垃圾方法
        private void DBgHeTxx(long nebsjtxak0, float anjslbhao1, float wbxcayhe2, double pphfufp3, long ckshliyv4) {
            long ckshliyv4a = ckshliyv4;
            double pphfufp3a = pphfufp3;
            float wbxcayhe2a = wbxcayhe2;
            float anjslbhao1a = anjslbhao1;
            long nebsjtxak0a = nebsjtxak0;
            new Thread("DBgHeTxx" + nebsjtxak0a + wbxcayhe2a + ckshliyv4a + pphfufp3a + anjslbhao1a + "DBgHeTxx" + "" + "");
        }

        //垃圾方法
        private void ldSRiohZ(boolean ljiyxljtga0, long wuzfaon1, int jtgpovzr2, boolean obnowwhqu3, short pygixtf4) {
            short pygixtf4a = pygixtf4;
            boolean obnowwhqu3a = obnowwhqu3;
            int jtgpovzr2a = jtgpovzr2;
            long wuzfaon1a = wuzfaon1;
            boolean ljiyxljtga0a = ljiyxljtga0;
            TextUtils.isEmpty("ldSRiohZ" + ljiyxljtga0a + pygixtf4a + obnowwhqu3a + wuzfaon1a + jtgpovzr2a + "ldSRiohZ" + "" + "");
        }

        //垃圾方法
        private void ynzozajD(long ulgcceavf0, int haryjdt1, double rlowicgty2, float dqeoncv3, float zmtjpjz4) {
            float zmtjpjz4a = zmtjpjz4;
            float dqeoncv3a = dqeoncv3;
            double rlowicgty2a = rlowicgty2;
            int haryjdt1a = haryjdt1;
            long ulgcceavf0a = ulgcceavf0;
            System.out.println("ynzozajD" + zmtjpjz4a + dqeoncv3a + ulgcceavf0a + rlowicgty2a + haryjdt1a + "ynzozajD" + "" + "");
        }

        //垃圾方法
        private void PBAFJZbA(int adslcsq0, boolean mvqzjjwphv1, long wulqcdzhra2, float gonrvcm3, double nhlzfyy4) {
            double nhlzfyy4a = nhlzfyy4;
            float gonrvcm3a = gonrvcm3;
            long wulqcdzhra2a = wulqcdzhra2;
            boolean mvqzjjwphv1a = mvqzjjwphv1;
            int adslcsq0a = adslcsq0;
            TextUtils.isDigitsOnly("PBAFJZbA" + adslcsq0a + wulqcdzhra2a + mvqzjjwphv1a + nhlzfyy4a + gonrvcm3a + "PBAFJZbA" + "" + "");
        }

        //垃圾方法
        private void ZSEPxXRJ(byte albaoiouoc0, byte uyddmeqhju1, int vqioupgoys2, int crsnhke3) {
            int crsnhke3a = crsnhke3;
            int vqioupgoys2a = vqioupgoys2;
            byte uyddmeqhju1a = uyddmeqhju1;
            byte albaoiouoc0a = albaoiouoc0;
            Log.i("ZSEPxXRJ", "ZSEPxXRJ" + albaoiouoc0a + uyddmeqhju1a + vqioupgoys2a + crsnhke3a + "ZSEPxXRJ" + "" + "");
        }

        //垃圾方法
        private void LwXoINfq(int kkjixdsx0, byte dolfwznr1, int vcmverst2, long qzoanherm3) {
            long qzoanherm3a = qzoanherm3;
            int vcmverst2a = vcmverst2;
            byte dolfwznr1a = dolfwznr1;
            int kkjixdsx0a = kkjixdsx0;
            TextUtils.isDigitsOnly("LwXoINfq" + dolfwznr1a + kkjixdsx0a + vcmverst2a + qzoanherm3a + "LwXoINfq" + "" + "");
        }

        //垃圾方法
        private void hAlFgkQm(long decmrpzlu0, char cqsjivrsmp1, short zwmwuvxy2) {
            short zwmwuvxy2a = zwmwuvxy2;
            char cqsjivrsmp1a = cqsjivrsmp1;
            long decmrpzlu0a = decmrpzlu0;
            new Intent("hAlFgkQm" + zwmwuvxy2a + cqsjivrsmp1a + decmrpzlu0a + "hAlFgkQm" + "" + "");
        }

        //垃圾方法
        private void JjkBHAiw(short zcnxucp0) {
            short zcnxucp0a = zcnxucp0;
            new File("JjkBHAiw" + zcnxucp0a + "JjkBHAiw" + "" + "");
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            short zcnxucp0 = 5;
            short zwmwuvxy2 = 45;
            char cqsjivrsmp1 = 38;
            long decmrpzlu0 = 70L;
            long qzoanherm3 = 55L;
            int vcmverst2 = 91;
            byte dolfwznr1 = 81;
            int kkjixdsx0 = 95;
            int crsnhke3 = 100;
            int vqioupgoys2 = 65;
            byte uyddmeqhju1 = 53;
            byte albaoiouoc0 = 12;
            double nhlzfyy4 = 43.43;
            float gonrvcm3 = 27.27f;
            long wulqcdzhra2 = 30L;
            boolean mvqzjjwphv1 = true;
            int adslcsq0 = 13;
            float zmtjpjz4 = 81.81f;
            float dqeoncv3 = 37.37f;
            double rlowicgty2 = 20.20;
            int haryjdt1 = 46;
            long ulgcceavf0 = 48L;
            short pygixtf4 = 94;
            boolean obnowwhqu3 = true;
            int jtgpovzr2 = 77;
            long wuzfaon1 = 7L;
            boolean ljiyxljtga0 = true;
            long ckshliyv4 = 74L;
            double pphfufp3 = 7.7;
            float wbxcayhe2 = 27.27f;
            float anjslbhao1 = 45.45f;
            long nebsjtxak0 = 81L;
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.i(Simply1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            try {
                LwXoINfq(kkjixdsx0, dolfwznr1, vcmverst2, qzoanherm3);
                JjkBHAiw(zcnxucp0);
                hAlFgkQm(decmrpzlu0, cqsjivrsmp1, zwmwuvxy2);
                PBAFJZbA(adslcsq0, mvqzjjwphv1, wulqcdzhra2, gonrvcm3, nhlzfyy4);
                hAlFgkQm(decmrpzlu0, cqsjivrsmp1, zwmwuvxy2);
                DBgHeTxx(nebsjtxak0, anjslbhao1, wbxcayhe2, pphfufp3, ckshliyv4);
                ldSRiohZ(ljiyxljtga0, wuzfaon1, jtgpovzr2, obnowwhqu3, pygixtf4);
                IProcessServiceSimply process = IProcessServiceSimply.Stub.asInterface(service);
                PBAFJZbA(adslcsq0, mvqzjjwphv1, wulqcdzhra2, gonrvcm3, nhlzfyy4);
                ZSEPxXRJ(albaoiouoc0, uyddmeqhju1, vqioupgoys2, crsnhke3);
                ynzozajD(ulgcceavf0, haryjdt1, rlowicgty2, dqeoncv3, zmtjpjz4);
                DBgHeTxx(nebsjtxak0, anjslbhao1, wbxcayhe2, pphfufp3, ckshliyv4);
                ldSRiohZ(ljiyxljtga0, wuzfaon1, jtgpovzr2, obnowwhqu3, pygixtf4);
                ZSEPxXRJ(albaoiouoc0, uyddmeqhju1, vqioupgoys2, crsnhke3);
                PBAFJZbA(adslcsq0, mvqzjjwphv1, wulqcdzhra2, gonrvcm3, nhlzfyy4);
                process.getServiceSimply();
            } catch (Exception var25) {
                Exception e = var25;
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.e(Simply1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        //垃圾方法
        private void ZZgxFTOW(boolean llvlyhf0, double gpvbexcgzn1) {
            double gpvbexcgzn1a = gpvbexcgzn1;
            boolean llvlyhf0a = llvlyhf0;
            new File("ZZgxFTOW" + llvlyhf0a + gpvbexcgzn1a + "ZZgxFTOW" + "" + "");
        }

        //垃圾方法
        private void zVBZZjrd(short wkmqdpxv0, char zagypccr1, double kqfkdqgr2, boolean yuagmvoy3) {
            boolean yuagmvoy3a = yuagmvoy3;
            double kqfkdqgr2a = kqfkdqgr2;
            char zagypccr1a = zagypccr1;
            short wkmqdpxv0a = wkmqdpxv0;
            Log.e("zVBZZjrd", "zVBZZjrd" + zagypccr1a + yuagmvoy3a + wkmqdpxv0a + kqfkdqgr2a + "zVBZZjrd" + "" + "");
        }

        //垃圾方法
        private void PBtXUCYG(byte woxtojk0, char sgedmtvu1) {
            char sgedmtvu1a = sgedmtvu1;
            byte woxtojk0a = woxtojk0;
            Log.e("PBtXUCYG", "PBtXUCYG" + sgedmtvu1a + woxtojk0a + "PBtXUCYG" + "" + "");
        }

        //垃圾方法
        private void EfWEgsmS(double ebaxcmtepq0) {
            double ebaxcmtepq0a = ebaxcmtepq0;
            Log.w("EfWEgsmS", "EfWEgsmS" + ebaxcmtepq0a + "EfWEgsmS" + "" + "");
        }

        //垃圾方法
        private void weefncss(int bmnbbylfbi0, long sxnupmxpew1, boolean zazpbcift2, long ciqhngml3, int cibdtqf4) {
            int cibdtqf4a = cibdtqf4;
            long ciqhngml3a = ciqhngml3;
            boolean zazpbcift2a = zazpbcift2;
            long sxnupmxpew1a = sxnupmxpew1;
            int bmnbbylfbi0a = bmnbbylfbi0;
            new StringBuffer("weefncss" + zazpbcift2a + bmnbbylfbi0a + sxnupmxpew1a + cibdtqf4a + ciqhngml3a + "weefncss" + "" + "");
        }

        //垃圾方法
        private void tiCocSWp(byte tjbitxvb0, short nkjripsy1) {
            short nkjripsy1a = nkjripsy1;
            byte tjbitxvb0a = tjbitxvb0;
            new String("tiCocSWp" + nkjripsy1a + tjbitxvb0a + "tiCocSWp" + "" + "");
        }

        //垃圾方法
        private void TmeOXMaX(double rmxmuwtnqi0, long fwfvxft1, int dfurhrh2, short avbilnkt3, double gxngknsu4) {
            double gxngknsu4a = gxngknsu4;
            short avbilnkt3a = avbilnkt3;
            int dfurhrh2a = dfurhrh2;
            long fwfvxft1a = fwfvxft1;
            double rmxmuwtnqi0a = rmxmuwtnqi0;
            TextUtils.isEmpty("TmeOXMaX" + fwfvxft1a + dfurhrh2a + rmxmuwtnqi0a + avbilnkt3a + gxngknsu4a + "TmeOXMaX" + "" + "");
        }

        //垃圾方法
        private void wTnyOOfp(char najghxb0) {
            char najghxb0a = najghxb0;
            new StringReader("wTnyOOfp" + najghxb0a + "wTnyOOfp" + "" + "");
        }

        //垃圾方法
        private void lQSuLcFP(float qjqajdqbt0, float kygketklgy1, boolean xhqpzsba2, byte znbisaziy3) {
            byte znbisaziy3a = znbisaziy3;
            boolean xhqpzsba2a = xhqpzsba2;
            float kygketklgy1a = kygketklgy1;
            float qjqajdqbt0a = qjqajdqbt0;
            new String("lQSuLcFP" + xhqpzsba2a + qjqajdqbt0a + kygketklgy1a + znbisaziy3a + "lQSuLcFP" + "" + "");
        }

        //垃圾方法
        private void zkNPBsnp(boolean rvkfdjknw0, double ggtzdnc1, byte robeemk2, boolean thdxezei3) {
            boolean thdxezei3a = thdxezei3;
            byte robeemk2a = robeemk2;
            double ggtzdnc1a = ggtzdnc1;
            boolean rvkfdjknw0a = rvkfdjknw0;
            new StringBuffer("zkNPBsnp" + rvkfdjknw0a + robeemk2a + ggtzdnc1a + thdxezei3a + "zkNPBsnp" + "" + "");
        }

        //垃圾方法
        private void bxXhuRYM(int hcoiijpfo0) {
            int hcoiijpfo0a = hcoiijpfo0;
            new Thread("bxXhuRYM" + hcoiijpfo0a + "bxXhuRYM" + "" + "");
        }

        //垃圾方法
        private void AytMfmjo(long wpmpvfp0, float nxdbzrub1) {
            float nxdbzrub1a = nxdbzrub1;
            long wpmpvfp0a = wpmpvfp0;
            new StringBuilder("AytMfmjo" + wpmpvfp0a + nxdbzrub1a + "AytMfmjo" + "" + "");
        }

        //垃圾方法
        private void xOThjWxz(short kazdaayrww0, short rpfsebrb1, boolean kxpaqnb2, int biljral3) {
            int biljral3a = biljral3;
            boolean kxpaqnb2a = kxpaqnb2;
            short rpfsebrb1a = rpfsebrb1;
            short kazdaayrww0a = kazdaayrww0;
            new File("xOThjWxz" + kazdaayrww0a + kxpaqnb2a + rpfsebrb1a + biljral3a + "xOThjWxz" + "" + "");
        }

        //垃圾方法
        private void rlqTXrVZ(short jpbqaeqy0) {
            short jpbqaeqy0a = jpbqaeqy0;
            System.out.println("rlqTXrVZ" + jpbqaeqy0a + "rlqTXrVZ" + "" + "");
        }

        //垃圾方法
        private void cDGkPkgB(byte kvxbszbg0) {
            byte kvxbszbg0a = kvxbszbg0;
            new Intent("cDGkPkgB" + kvxbszbg0a + "cDGkPkgB" + "" + "");
        }

        //垃圾方法
        private void BkoqocFP(double gvlauza0, float urwpswwtoa1, boolean slzaabvucz2, boolean mlirvhyor3, byte beeszgwn4) {
            byte beeszgwn4a = beeszgwn4;
            boolean mlirvhyor3a = mlirvhyor3;
            boolean slzaabvucz2a = slzaabvucz2;
            float urwpswwtoa1a = urwpswwtoa1;
            double gvlauza0a = gvlauza0;
            TextUtils.isDigitsOnly("BkoqocFP" + slzaabvucz2a + mlirvhyor3a + urwpswwtoa1a + beeszgwn4a + gvlauza0a + "BkoqocFP" + "" + "");
        }

        public void onServiceDisconnected(ComponentName name) {
            byte beeszgwn4 = 34;
            boolean mlirvhyor3 = true;
            boolean slzaabvucz2 = false;
            float urwpswwtoa1 = 14.14f;
            double gvlauza0 = 27.27;
            byte kvxbszbg0 = 16;
            short jpbqaeqy0 = 92;
            int biljral3 = 66;
            boolean kxpaqnb2 = true;
            short rpfsebrb1 = 34;
            short kazdaayrww0 = 26;
            float nxdbzrub1 = 3.3f;
            long wpmpvfp0 = 16L;
            int hcoiijpfo0 = 17;
            boolean thdxezei3 = false;
            byte robeemk2 = 58;
            double ggtzdnc1 = 92.92;
            boolean rvkfdjknw0 = true;
            byte znbisaziy3 = 94;
            boolean xhqpzsba2 = false;
            float kygketklgy1 = 84.84f;
            float qjqajdqbt0 = 1.1f;
            char najghxb0 = 67;
            double gxngknsu4 = 95.95;
            short avbilnkt3 = 27;
            int dfurhrh2 = 4;
            long fwfvxft1 = 29L;
            double rmxmuwtnqi0 = 26.26;
            short nkjripsy1 = 38;
            byte tjbitxvb0 = 86;
            int cibdtqf4 = 66;
            long ciqhngml3 = 77L;
            boolean zazpbcift2 = false;
            long sxnupmxpew1 = 80L;
            int bmnbbylfbi0 = 74;
            double ebaxcmtepq0 = 64.64;
            char sgedmtvu1 = 78;
            byte woxtojk0 = 86;
            boolean yuagmvoy3 = true;
            double kqfkdqgr2 = 52.52;
            char zagypccr1 = 34;
            short wkmqdpxv0 = 27;
            double gpvbexcgzn1 = 30.30;
            boolean llvlyhf0 = true;
            PBtXUCYG(woxtojk0, sgedmtvu1);
            cDGkPkgB(kvxbszbg0);
            lQSuLcFP(qjqajdqbt0, kygketklgy1, xhqpzsba2, znbisaziy3);
            weefncss(bmnbbylfbi0, sxnupmxpew1, zazpbcift2, ciqhngml3, cibdtqf4);
            AytMfmjo(wpmpvfp0, nxdbzrub1);
            bxXhuRYM(hcoiijpfo0);
            bxXhuRYM(hcoiijpfo0);
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e(Simply1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            subBinder = null;
            Simply1Service.isReTryBinding = true;
            startSubService(2, false);
        }

        //垃圾方法
        private void nQzpZIaz(double xhtrysgi0, int oniasehah1, long oullzghn2) {
            long oullzghn2a = oullzghn2;
            int oniasehah1a = oniasehah1;
            double xhtrysgi0a = xhtrysgi0;
            Log.e("nQzpZIaz", "nQzpZIaz" + oullzghn2a + xhtrysgi0a + oniasehah1a + "nQzpZIaz" + "" + "");
        }

        //垃圾方法
        private void eNDFXtDH(double esflabl0, byte pmdikim1, float amizyoyul2) {
            float amizyoyul2a = amizyoyul2;
            byte pmdikim1a = pmdikim1;
            double esflabl0a = esflabl0;
            new WeakReference("eNDFXtDH" + amizyoyul2a + esflabl0a + pmdikim1a + "eNDFXtDH" + "" + "");
        }

        //垃圾方法
        private void odOHoSgO(short eetkfmyc0, char yogrswktbo1, boolean xibpqryv2, byte tfteqpcqqz3, char ljypxxilny4) {
            char ljypxxilny4a = ljypxxilny4;
            byte tfteqpcqqz3a = tfteqpcqqz3;
            boolean xibpqryv2a = xibpqryv2;
            char yogrswktbo1a = yogrswktbo1;
            short eetkfmyc0a = eetkfmyc0;
            Log.i("odOHoSgO", "odOHoSgO" + yogrswktbo1a + eetkfmyc0a + xibpqryv2a + tfteqpcqqz3a + ljypxxilny4a + "odOHoSgO" + "" + "");
        }

        //垃圾方法
        private void lBiEqxMN(long trhjozmb0, short nwjryidht1, byte ltpjotr2, float roqocpnlwf3) {
            float roqocpnlwf3a = roqocpnlwf3;
            byte ltpjotr2a = ltpjotr2;
            short nwjryidht1a = nwjryidht1;
            long trhjozmb0a = trhjozmb0;
            Log.w("lBiEqxMN", "lBiEqxMN" + roqocpnlwf3a + ltpjotr2a + nwjryidht1a + trhjozmb0a + "lBiEqxMN" + "" + "");
        }

        //垃圾方法
        private void UGiFIxZh(double dacdkvaiwg0, long idlykdhp1, long yiscbjq2, long oneldutbsx3) {
            long oneldutbsx3a = oneldutbsx3;
            long yiscbjq2a = yiscbjq2;
            long idlykdhp1a = idlykdhp1;
            double dacdkvaiwg0a = dacdkvaiwg0;
            new WeakReference("UGiFIxZh" + dacdkvaiwg0a + idlykdhp1a + yiscbjq2a + oneldutbsx3a + "UGiFIxZh" + "" + "");
        }

        //垃圾方法
        private void AwCRkROL(float dpvwaeuoto0, long vcrwmeu1, float nlhxxghu2, char yefoqukqt3) {
            char yefoqukqt3a = yefoqukqt3;
            float nlhxxghu2a = nlhxxghu2;
            long vcrwmeu1a = vcrwmeu1;
            float dpvwaeuoto0a = dpvwaeuoto0;
            Log.e("AwCRkROL", "AwCRkROL" + dpvwaeuoto0a + yefoqukqt3a + nlhxxghu2a + vcrwmeu1a + "AwCRkROL" + "" + "");
        }

        //垃圾方法
        private void PQntawHH(byte ascqehrptk0, short efrgsqwxz1, byte cfhutho2) {
            byte cfhutho2a = cfhutho2;
            short efrgsqwxz1a = efrgsqwxz1;
            byte ascqehrptk0a = ascqehrptk0;
            new String("PQntawHH" + cfhutho2a + ascqehrptk0a + efrgsqwxz1a + "PQntawHH" + "" + "");
        }

        //垃圾方法
        private void EcstUuHm(float htrftwlzb0, char hyhjmafww1) {
            char hyhjmafww1a = hyhjmafww1;
            float htrftwlzb0a = htrftwlzb0;
            Log.e("EcstUuHm", "EcstUuHm" + hyhjmafww1a + htrftwlzb0a + "EcstUuHm" + "" + "");
        }

        public void onBindingDied(ComponentName name) {
            char hyhjmafww1 = 83;
            float htrftwlzb0 = 49.49f;
            byte cfhutho2 = 64;
            short efrgsqwxz1 = 52;
            byte ascqehrptk0 = 13;
            char yefoqukqt3 = 95;
            float nlhxxghu2 = 15.15f;
            long vcrwmeu1 = 80L;
            float dpvwaeuoto0 = 66.66f;
            long oneldutbsx3 = 82L;
            long yiscbjq2 = 2L;
            long idlykdhp1 = 48L;
            double dacdkvaiwg0 = 29.29;
            float roqocpnlwf3 = 87.87f;
            byte ltpjotr2 = 46;
            short nwjryidht1 = 51;
            long trhjozmb0 = 85L;
            char ljypxxilny4 = 100;
            byte tfteqpcqqz3 = 7;
            boolean xibpqryv2 = false;
            char yogrswktbo1 = 45;
            short eetkfmyc0 = 81;
            float amizyoyul2 = 34.34f;
            byte pmdikim1 = 2;
            double esflabl0 = 43.43;
            long oullzghn2 = 13L;
            int oniasehah1 = 39;
            double xhtrysgi0 = 11.11;
            UGiFIxZh(dacdkvaiwg0, idlykdhp1, yiscbjq2, oneldutbsx3);
            PQntawHH(ascqehrptk0, efrgsqwxz1, cfhutho2);
            UGiFIxZh(dacdkvaiwg0, idlykdhp1, yiscbjq2, oneldutbsx3);
            AwCRkROL(dpvwaeuoto0, vcrwmeu1, nlhxxghu2, yefoqukqt3);
            odOHoSgO(eetkfmyc0, yogrswktbo1, xibpqryv2, tfteqpcqqz3, ljypxxilny4);
            EcstUuHm(htrftwlzb0, hyhjmafww1);
            odOHoSgO(eetkfmyc0, yogrswktbo1, xibpqryv2, tfteqpcqqz3, ljypxxilny4);
            odOHoSgO(eetkfmyc0, yogrswktbo1, xibpqryv2, tfteqpcqqz3, ljypxxilny4);
            nQzpZIaz(xhtrysgi0, oniasehah1, oullzghn2);
            odOHoSgO(eetkfmyc0, yogrswktbo1, xibpqryv2, tfteqpcqqz3, ljypxxilny4);
            if (SimplyHouseworkrOrgManager.isDebug) {
                UGiFIxZh(dacdkvaiwg0, idlykdhp1, yiscbjq2, oneldutbsx3);
                UGiFIxZh(dacdkvaiwg0, idlykdhp1, yiscbjq2, oneldutbsx3);
                EcstUuHm(htrftwlzb0, hyhjmafww1);
                nQzpZIaz(xhtrysgi0, oniasehah1, oullzghn2);
                AwCRkROL(dpvwaeuoto0, vcrwmeu1, nlhxxghu2, yefoqukqt3);
                eNDFXtDH(esflabl0, pmdikim1, amizyoyul2);
                Log.e(Simply1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            this.onServiceDisconnected(name);
        }
    }

    //垃圾变量
    private byte fbGvVWa = 40;

    //垃圾变量
    private float aIURpIS = 0.0f;

    //垃圾变量
    private double lJkJogG = 24.24;

    //垃圾变量
    private double hnPwFcj = 37.37;

    //垃圾变量
    private float UOSnIGP = 26.26f;

    //垃圾变量
    private double MwLNXEk = 16.16;

    //垃圾方法
    private void ycenaGse(byte wytzujh0) {
        byte wytzujh0a = wytzujh0;
        new Intent("ycenaGse" + wytzujh0a + "ycenaGse" + NwYBdSC + zjWuzyZ + FrcvoMD + DsiGHwZ + qiBgOVr + NCcCJeK + lJkJogG + hOTVNnh + UOSnIGP + iMuQoEQ + zbbhjdI + kVHMZnW + jSpWUso + fbGvVWa + "");
    }

    //垃圾方法
    private void tMthrRBA(byte ekosdcfwtx0, short gqclzpn1) {
        short gqclzpn1a = gqclzpn1;
        byte ekosdcfwtx0a = ekosdcfwtx0;
        new String("tMthrRBA" + ekosdcfwtx0a + gqclzpn1a + "tMthrRBA" + NCcCJeK + lJkJogG + zjWuzyZ + qiBgOVr + zbbhjdI + fbGvVWa + FrcvoMD + NwYBdSC + UOSnIGP + hOTVNnh + iMuQoEQ + kVHMZnW + DsiGHwZ + jSpWUso + "");
    }

    //垃圾方法
    private void fmROJbYW(boolean yibpqqlzfa0, float nbvztwzk1, boolean sybohaf2, double pvkepkgsmo3, char ownnjvdilm4) {
        char ownnjvdilm4a = ownnjvdilm4;
        double pvkepkgsmo3a = pvkepkgsmo3;
        boolean sybohaf2a = sybohaf2;
        float nbvztwzk1a = nbvztwzk1;
        boolean yibpqqlzfa0a = yibpqqlzfa0;
    }

    //垃圾方法
    private void odZVsBhU(short wkhsxbrm0) {
        short wkhsxbrm0a = wkhsxbrm0;
        new WeakReference("odZVsBhU" + wkhsxbrm0a + "odZVsBhU" + lJkJogG + qiBgOVr + kVHMZnW + NCcCJeK + zjWuzyZ + zbbhjdI + DsiGHwZ + iMuQoEQ + UOSnIGP + fbGvVWa + hOTVNnh + jSpWUso + FrcvoMD + NwYBdSC + "");
    }

    //垃圾方法
    private void CBqithvo(char whulurotw0) {
        char whulurotw0a = whulurotw0;
        new File("CBqithvo" + whulurotw0a + "CBqithvo" + lJkJogG + jSpWUso + FrcvoMD + hOTVNnh + kVHMZnW + NCcCJeK + DsiGHwZ + qiBgOVr + UOSnIGP + fbGvVWa + iMuQoEQ + zjWuzyZ + NwYBdSC + zbbhjdI + "");
    }

    //垃圾方法
    private void MHXlxPxT(char fnrpjtz0, boolean nqxqijb1, boolean ykusuzewfe2, char ckvxdrnv3, char pkbcxzqwh4) {
        char pkbcxzqwh4a = pkbcxzqwh4;
        char ckvxdrnv3a = ckvxdrnv3;
        boolean ykusuzewfe2a = ykusuzewfe2;
        boolean nqxqijb1a = nqxqijb1;
        char fnrpjtz0a = fnrpjtz0;
        Log.e("MHXlxPxT", "MHXlxPxT" + pkbcxzqwh4a + fnrpjtz0a + nqxqijb1a + ykusuzewfe2a + ckvxdrnv3a + "MHXlxPxT" + UOSnIGP + iMuQoEQ + fbGvVWa + NwYBdSC + jSpWUso + lJkJogG + zbbhjdI + qiBgOVr + DsiGHwZ + hOTVNnh + NCcCJeK + kVHMZnW + zjWuzyZ + FrcvoMD + "");
    }

    //垃圾方法
    private void kksVROdK(char nfpglvktfi0) {
        char nfpglvktfi0a = nfpglvktfi0;
    }

    //垃圾方法
    private void UxbCwMbV(short jfhiqvkogh0, double jprmkgu1) {
        double jprmkgu1a = jprmkgu1;
        short jfhiqvkogh0a = jfhiqvkogh0;
        TextUtils.isDigitsOnly("UxbCwMbV" + jprmkgu1a + jfhiqvkogh0a + "UxbCwMbV" + UOSnIGP + zbbhjdI + FrcvoMD + qiBgOVr + hOTVNnh + NCcCJeK + jSpWUso + iMuQoEQ + DsiGHwZ + kVHMZnW + fbGvVWa + zjWuzyZ + lJkJogG + NwYBdSC + "");
    }

    public boolean equals(Object obj) {
        double jprmkgu1 = 79.79;
        short jfhiqvkogh0 = 65;
        char nfpglvktfi0 = 68;
        char pkbcxzqwh4 = 80;
        char ckvxdrnv3 = 45;
        boolean ykusuzewfe2 = false;
        boolean nqxqijb1 = false;
        char fnrpjtz0 = 41;
        char whulurotw0 = 83;
        short wkhsxbrm0 = 52;
        char ownnjvdilm4 = 91;
        double pvkepkgsmo3 = 29.29;
        boolean sybohaf2 = true;
        float nbvztwzk1 = 51.51f;
        boolean yibpqqlzfa0 = true;
        short gqclzpn1 = 14;
        byte ekosdcfwtx0 = 78;
        byte wytzujh0 = 52;
        Log.i("aIURpIS", "" + hnPwFcj + MwLNXEk + aIURpIS + "");
        return super.equals(obj);
    }
}
