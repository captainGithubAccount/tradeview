package com.speed.model.old.opdj.nt;

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
import com.speed.model.old.FirebaseUtils;
import com.speed.model.old.SpeedManager;
import com.speed.model.R;
import com.speed.model.old.shownotificy.SpeedNtTransfer;
import com.speed.model.old.use.SpeedNotiTimesHelper;
import java.util.Iterator;
import java.util.Objects;
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

public class SpeedNtFgService extends Service {

    //垃圾变量
    private short EDAGJUI = 36;

    static boolean isLiving;

    //垃圾变量
    private char ZqelZKq = 26;

    static boolean isShowing;

    //垃圾变量
    private double xNynkRu = 56.56;

    static String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private float ofnOmpK = 10.10f;

    static String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private char ixEMBPg = 58;

    static int Notification_ID1 = 9745125;

    //垃圾变量
    private long aBVtpuE = 27L;

    //clock  job  launchapp  everytime_show_notify(每次通知展示的时候)
    static String from = "action_from";

    public SpeedNtFgService() {
    }

    //垃圾方法
    static private void mVDXImIV(float iwaqkao0, short bvmkrwgyo1, float nouwbww2) {
        float nouwbww2a = nouwbww2;
        short bvmkrwgyo1a = bvmkrwgyo1;
        float iwaqkao0a = iwaqkao0;
        new WeakReference("mVDXImIV" + bvmkrwgyo1a + nouwbww2a + iwaqkao0a + "mVDXImIV" + "");
    }

    //垃圾方法
    static private void kjGhOvAn(long axpcolpek0, int qjhctvd1, double yzzabacm2, float hziwjcg3, long pwuvoyqwee4) {
        long pwuvoyqwee4a = pwuvoyqwee4;
        float hziwjcg3a = hziwjcg3;
        double yzzabacm2a = yzzabacm2;
        int qjhctvd1a = qjhctvd1;
        long axpcolpek0a = axpcolpek0;
        TextUtils.isEmpty("kjGhOvAn" + hziwjcg3a + qjhctvd1a + yzzabacm2a + pwuvoyqwee4a + axpcolpek0a + "kjGhOvAn" + "");
    }

    //垃圾方法
    static private void UMGCfCeQ(char vuzjtni0, int rajzineeg1, short ebdnwjcx2, long nqxnfmk3) {
        long nqxnfmk3a = nqxnfmk3;
        short ebdnwjcx2a = ebdnwjcx2;
        int rajzineeg1a = rajzineeg1;
        char vuzjtni0a = vuzjtni0;
        Log.e("UMGCfCeQ", "UMGCfCeQ" + rajzineeg1a + nqxnfmk3a + ebdnwjcx2a + vuzjtni0a + "UMGCfCeQ" + "");
    }

    //垃圾方法
    static private void TEvIEpXv(char gnhnqpxdu0, double lyfigjn1, byte hcsbxhdf2, int uxxjoruj3, long atmzhqe4) {
        long atmzhqe4a = atmzhqe4;
        int uxxjoruj3a = uxxjoruj3;
        byte hcsbxhdf2a = hcsbxhdf2;
        double lyfigjn1a = lyfigjn1;
        char gnhnqpxdu0a = gnhnqpxdu0;
        System.out.println("TEvIEpXv" + gnhnqpxdu0a + hcsbxhdf2a + uxxjoruj3a + lyfigjn1a + atmzhqe4a + "TEvIEpXv" + "");
    }

    public static boolean getIsShowing() {
        long atmzhqe4 = 24L;
        int uxxjoruj3 = 21;
        byte hcsbxhdf2 = 68;
        double lyfigjn1 = 91.91;
        char gnhnqpxdu0 = 63;
        long nqxnfmk3 = 90L;
        short ebdnwjcx2 = 56;
        int rajzineeg1 = 28;
        char vuzjtni0 = 69;
        long pwuvoyqwee4 = 40L;
        float hziwjcg3 = 7.7f;
        double yzzabacm2 = 4.4;
        int qjhctvd1 = 0;
        long axpcolpek0 = 28L;
        float nouwbww2 = 51.51f;
        short bvmkrwgyo1 = 28;
        float iwaqkao0 = 50.50f;
        mVDXImIV(iwaqkao0, bvmkrwgyo1, nouwbww2);
        kjGhOvAn(axpcolpek0, qjhctvd1, yzzabacm2, hziwjcg3, pwuvoyqwee4);
        UMGCfCeQ(vuzjtni0, rajzineeg1, ebdnwjcx2, nqxnfmk3);
        UMGCfCeQ(vuzjtni0, rajzineeg1, ebdnwjcx2, nqxnfmk3);
        mVDXImIV(iwaqkao0, bvmkrwgyo1, nouwbww2);
        TEvIEpXv(gnhnqpxdu0, lyfigjn1, hcsbxhdf2, uxxjoruj3, atmzhqe4);
        kjGhOvAn(axpcolpek0, qjhctvd1, yzzabacm2, hziwjcg3, pwuvoyqwee4);
        kjGhOvAn(axpcolpek0, qjhctvd1, yzzabacm2, hziwjcg3, pwuvoyqwee4);
        UMGCfCeQ(vuzjtni0, rajzineeg1, ebdnwjcx2, nqxnfmk3);
        TEvIEpXv(gnhnqpxdu0, lyfigjn1, hcsbxhdf2, uxxjoruj3, atmzhqe4);
        return isShowing;
    }

    //垃圾方法
    static private void CqJyfJFd(byte nqpvdlq0) {
        byte nqpvdlq0a = nqpvdlq0;
        TextUtils.isDigitsOnly("CqJyfJFd" + nqpvdlq0a + "CqJyfJFd" + "");
    }

    //垃圾方法
    static private void tXicESti(boolean dlfhumcixg0, long ljrdldguwt1, boolean rtdemrfag2, byte jphazuu3, byte atrdjtzsv4) {
        byte atrdjtzsv4a = atrdjtzsv4;
        byte jphazuu3a = jphazuu3;
        boolean rtdemrfag2a = rtdemrfag2;
        long ljrdldguwt1a = ljrdldguwt1;
        boolean dlfhumcixg0a = dlfhumcixg0;
        new String("tXicESti" + ljrdldguwt1a + jphazuu3a + dlfhumcixg0a + atrdjtzsv4a + rtdemrfag2a + "tXicESti" + "");
    }

    //垃圾方法
    static private void ldVpkyQE(byte oosswdgmh0, boolean dudknpowx1, double xarlnji2, byte tkifvsn3) {
        byte tkifvsn3a = tkifvsn3;
        double xarlnji2a = xarlnji2;
        boolean dudknpowx1a = dudknpowx1;
        byte oosswdgmh0a = oosswdgmh0;
        new WeakReference("ldVpkyQE" + dudknpowx1a + tkifvsn3a + oosswdgmh0a + xarlnji2a + "ldVpkyQE" + "");
    }

    //垃圾方法
    static private void irEOwtVw(int rxywizq0, short meprihnqx1, short kgflydl2, char bwocoqmcp3, boolean rwfesfzdw4) {
        boolean rwfesfzdw4a = rwfesfzdw4;
        char bwocoqmcp3a = bwocoqmcp3;
        short kgflydl2a = kgflydl2;
        short meprihnqx1a = meprihnqx1;
        int rxywizq0a = rxywizq0;
        new StringBuffer("irEOwtVw" + bwocoqmcp3a + rxywizq0a + rwfesfzdw4a + kgflydl2a + meprihnqx1a + "irEOwtVw" + "");
    }

    public static void startNotifyService(boolean isFromActivity, String from) {
        boolean rwfesfzdw4 = false;
        char bwocoqmcp3 = 0;
        short kgflydl2 = 92;
        short meprihnqx1 = 88;
        int rxywizq0 = 96;
        byte tkifvsn3 = 55;
        double xarlnji2 = 67.67;
        boolean dudknpowx1 = true;
        byte oosswdgmh0 = 89;
        byte atrdjtzsv4 = 90;
        byte jphazuu3 = 34;
        boolean rtdemrfag2 = true;
        long ljrdldguwt1 = 91L;
        boolean dlfhumcixg0 = false;
        byte nqpvdlq0 = 55;
        CqJyfJFd(nqpvdlq0);
        ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
        CqJyfJFd(nqpvdlq0);
        ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
        try {
            ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
            tXicESti(dlfhumcixg0, ljrdldguwt1, rtdemrfag2, jphazuu3, atrdjtzsv4);
            irEOwtVw(rxywizq0, meprihnqx1, kgflydl2, bwocoqmcp3, rwfesfzdw4);
            ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
            irEOwtVw(rxywizq0, meprihnqx1, kgflydl2, bwocoqmcp3, rwfesfzdw4);
            CqJyfJFd(nqpvdlq0);
            CqJyfJFd(nqpvdlq0);
            ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
            tXicESti(dlfhumcixg0, ljrdldguwt1, rtdemrfag2, jphazuu3, atrdjtzsv4);
            irEOwtVw(rxywizq0, meprihnqx1, kgflydl2, bwocoqmcp3, rwfesfzdw4);
            Context context = SpeedManager.mContext;
            Intent intent = new Intent(context, SpeedNtFgService.class);
            intent.putExtra(SpeedNtFgService.from, from);
            tXicESti(dlfhumcixg0, ljrdldguwt1, rtdemrfag2, jphazuu3, atrdjtzsv4);
            irEOwtVw(rxywizq0, meprihnqx1, kgflydl2, bwocoqmcp3, rwfesfzdw4);
            ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
            irEOwtVw(rxywizq0, meprihnqx1, kgflydl2, bwocoqmcp3, rwfesfzdw4);
            tXicESti(dlfhumcixg0, ljrdldguwt1, rtdemrfag2, jphazuu3, atrdjtzsv4);
            CqJyfJFd(nqpvdlq0);
            ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
            ldVpkyQE(oosswdgmh0, dudknpowx1, xarlnji2, tkifvsn3);
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
    private void vhhKfoYC(char ulrivawv0) {
        char ulrivawv0a = ulrivawv0;
        new StringBuffer("vhhKfoYC" + ulrivawv0a + "vhhKfoYC" + VViTXxY + ofnOmpK + errMeFh + EDAGJUI + aBVtpuE + ixEMBPg + jRQaOhE + ZqelZKq + xNynkRu + "");
    }

    //垃圾方法
    private void keoblguZ(double xpvuwwj0, float aiodltqqq1, int mxqyaspw2, char fomjuihbik3, char qqnnbthje4) {
        char qqnnbthje4a = qqnnbthje4;
        char fomjuihbik3a = fomjuihbik3;
        int mxqyaspw2a = mxqyaspw2;
        float aiodltqqq1a = aiodltqqq1;
        double xpvuwwj0a = xpvuwwj0;
        Log.i("keoblguZ", "keoblguZ" + xpvuwwj0a + aiodltqqq1a + fomjuihbik3a + qqnnbthje4a + mxqyaspw2a + "keoblguZ" + ixEMBPg + ofnOmpK + ZqelZKq + aBVtpuE + errMeFh + xNynkRu + EDAGJUI + VViTXxY + jRQaOhE + "");
    }

    //垃圾方法
    private void pLjPaGqx(boolean mmjueiu0, float hlkentzn1, float egykccq2) {
        float egykccq2a = egykccq2;
        float hlkentzn1a = hlkentzn1;
        boolean mmjueiu0a = mmjueiu0;
        new StringBuilder("pLjPaGqx" + hlkentzn1a + mmjueiu0a + egykccq2a + "pLjPaGqx" + jRQaOhE + ZqelZKq + VViTXxY + aBVtpuE + ofnOmpK + EDAGJUI + ixEMBPg + xNynkRu + errMeFh + "");
    }

    //垃圾方法
    private void qeQNtOJK(double buklmath0) {
        double buklmath0a = buklmath0;
        Log.i("qeQNtOJK", "qeQNtOJK" + buklmath0a + "qeQNtOJK" + VViTXxY + ixEMBPg + EDAGJUI + ofnOmpK + errMeFh + jRQaOhE + aBVtpuE + xNynkRu + ZqelZKq + "");
    }

    //垃圾方法
    private void CfcXcWKd(byte ctskiryt0, char ufhxumhl1, char ztcufth2, float exciqwtu3, short kumvejz4) {
        short kumvejz4a = kumvejz4;
        float exciqwtu3a = exciqwtu3;
        char ztcufth2a = ztcufth2;
        char ufhxumhl1a = ufhxumhl1;
        byte ctskiryt0a = ctskiryt0;
        new StringBuffer("CfcXcWKd" + kumvejz4a + ctskiryt0a + exciqwtu3a + ufhxumhl1a + ztcufth2a + "CfcXcWKd" + EDAGJUI + VViTXxY + xNynkRu + ZqelZKq + errMeFh + aBVtpuE + ofnOmpK + ixEMBPg + jRQaOhE + "");
    }

    //垃圾方法
    private void IURniQOk(long cpdfdwhuer0, float xeaspva1, int diwhdok2, double glrchacm3, double qbtoogmpvq4) {
        double qbtoogmpvq4a = qbtoogmpvq4;
        double glrchacm3a = glrchacm3;
        int diwhdok2a = diwhdok2;
        float xeaspva1a = xeaspva1;
        long cpdfdwhuer0a = cpdfdwhuer0;
        new File("IURniQOk" + cpdfdwhuer0a + glrchacm3a + qbtoogmpvq4a + diwhdok2a + xeaspva1a + "IURniQOk" + errMeFh + jRQaOhE + ZqelZKq + aBVtpuE + VViTXxY + ixEMBPg + EDAGJUI + xNynkRu + ofnOmpK + "");
    }

    //垃圾方法
    private void FQplvXUm(short zcnewlkpxi0, char cmtyftojds1, float nndazey2, double oeicrunj3) {
        double oeicrunj3a = oeicrunj3;
        float nndazey2a = nndazey2;
        char cmtyftojds1a = cmtyftojds1;
        short zcnewlkpxi0a = zcnewlkpxi0;
        new AttributedString("FQplvXUm" + oeicrunj3a + nndazey2a + zcnewlkpxi0a + cmtyftojds1a + "FQplvXUm" + ofnOmpK + VViTXxY + xNynkRu + jRQaOhE + ixEMBPg + ZqelZKq + EDAGJUI + aBVtpuE + errMeFh + "");
    }

    //垃圾方法
    private void RiefrtCQ(char tnuamjih0) {
        char tnuamjih0a = tnuamjih0;
        Log.i("RiefrtCQ", "RiefrtCQ" + tnuamjih0a + "RiefrtCQ" + ofnOmpK + xNynkRu + VViTXxY + errMeFh + EDAGJUI + aBVtpuE + ZqelZKq + jRQaOhE + ixEMBPg + "");
    }

    //垃圾方法
    private void HXnAdyVI(long vyseotlfu0, float ahtcbfsoyr1, float vkwmfiao2, float mfaixni3, double fsmboupu4) {
        double fsmboupu4a = fsmboupu4;
        float mfaixni3a = mfaixni3;
        float vkwmfiao2a = vkwmfiao2;
        float ahtcbfsoyr1a = ahtcbfsoyr1;
        long vyseotlfu0a = vyseotlfu0;
        new StringBuilder("HXnAdyVI" + vkwmfiao2a + vyseotlfu0a + mfaixni3a + ahtcbfsoyr1a + fsmboupu4a + "HXnAdyVI" + jRQaOhE + ZqelZKq + EDAGJUI + errMeFh + ofnOmpK + ixEMBPg + VViTXxY + xNynkRu + aBVtpuE + "");
    }

    //垃圾方法
    private void xhqjUCRB(long jxkfwbxpy0, boolean rzdwzpfbvv1, long gvjilorvmy2, float beincqesxy3, byte smjtvju4) {
        byte smjtvju4a = smjtvju4;
        float beincqesxy3a = beincqesxy3;
        long gvjilorvmy2a = gvjilorvmy2;
        boolean rzdwzpfbvv1a = rzdwzpfbvv1;
        long jxkfwbxpy0a = jxkfwbxpy0;
    }

    //垃圾方法
    private void pZgkxvkS(byte vnxzsrp0, boolean xkrxgfs1, float xpjwicxfed2, char zvpywdubiy3) {
        char zvpywdubiy3a = zvpywdubiy3;
        float xpjwicxfed2a = xpjwicxfed2;
        boolean xkrxgfs1a = xkrxgfs1;
        byte vnxzsrp0a = vnxzsrp0;
        new Intent("pZgkxvkS" + xkrxgfs1a + zvpywdubiy3a + vnxzsrp0a + xpjwicxfed2a + "pZgkxvkS" + aBVtpuE + ofnOmpK + jRQaOhE + VViTXxY + ixEMBPg + errMeFh + xNynkRu + ZqelZKq + EDAGJUI + "");
    }

    //垃圾方法
    private void QftXRHIV(char iquzbam0, short ouukexm1, float gldnhmg2) {
        float gldnhmg2a = gldnhmg2;
        short ouukexm1a = ouukexm1;
        char iquzbam0a = iquzbam0;
        Log.e("QftXRHIV", "QftXRHIV" + iquzbam0a + ouukexm1a + gldnhmg2a + "QftXRHIV" + jRQaOhE + ZqelZKq + errMeFh + ixEMBPg + VViTXxY + aBVtpuE + EDAGJUI + xNynkRu + ofnOmpK + "");
    }

    //垃圾方法
    private void eJMXlvZM(short rrcjelyl0, float keggmnxtfx1, byte wkzgkrmxkl2, boolean mvwghhlwh3, long zlcnycl4) {
        long zlcnycl4a = zlcnycl4;
        boolean mvwghhlwh3a = mvwghhlwh3;
        byte wkzgkrmxkl2a = wkzgkrmxkl2;
        float keggmnxtfx1a = keggmnxtfx1;
        short rrcjelyl0a = rrcjelyl0;
        new File("eJMXlvZM" + wkzgkrmxkl2a + keggmnxtfx1a + mvwghhlwh3a + zlcnycl4a + rrcjelyl0a + "eJMXlvZM" + jRQaOhE + aBVtpuE + ofnOmpK + VViTXxY + EDAGJUI + ixEMBPg + xNynkRu + ZqelZKq + errMeFh + "");
    }

    //垃圾方法
    private void zdKWnacX(char mhwphyzre0) {
        char mhwphyzre0a = mhwphyzre0;
        new StringBuilder("zdKWnacX" + mhwphyzre0a + "zdKWnacX" + ZqelZKq + jRQaOhE + VViTXxY + ixEMBPg + ofnOmpK + EDAGJUI + aBVtpuE + errMeFh + xNynkRu + "");
    }

    //垃圾方法
    private void FMqvdwwM(long swuxaarye0, short dgmoqglx1, long hqbpjsmm2) {
        long hqbpjsmm2a = hqbpjsmm2;
        short dgmoqglx1a = dgmoqglx1;
        long swuxaarye0a = swuxaarye0;
        TextUtils.isEmpty("FMqvdwwM" + hqbpjsmm2a + dgmoqglx1a + swuxaarye0a + "FMqvdwwM" + errMeFh + xNynkRu + EDAGJUI + jRQaOhE + aBVtpuE + ZqelZKq + ofnOmpK + ixEMBPg + VViTXxY + "");
    }

    //垃圾方法
    private void osTKNqYT(int ubxaurtpj0) {
        int ubxaurtpj0a = ubxaurtpj0;
        new String("osTKNqYT" + ubxaurtpj0a + "osTKNqYT" + ZqelZKq + ixEMBPg + errMeFh + EDAGJUI + xNynkRu + VViTXxY + jRQaOhE + aBVtpuE + ofnOmpK + "");
    }

    //垃圾方法
    private void uoxCMKru(boolean egylmipotg0, boolean pkwfpkgz1, byte fqqlhvqwmv2) {
        byte fqqlhvqwmv2a = fqqlhvqwmv2;
        boolean pkwfpkgz1a = pkwfpkgz1;
        boolean egylmipotg0a = egylmipotg0;
        Log.e("uoxCMKru", "uoxCMKru" + fqqlhvqwmv2a + egylmipotg0a + pkwfpkgz1a + "uoxCMKru" + EDAGJUI + errMeFh + ofnOmpK + xNynkRu + VViTXxY + ZqelZKq + ixEMBPg + aBVtpuE + jRQaOhE + "");
    }

    //垃圾方法
    private void AfADNLBY(short mtmevayueu0, boolean alltzgc1) {
        boolean alltzgc1a = alltzgc1;
        short mtmevayueu0a = mtmevayueu0;
        new AttributedString("AfADNLBY" + mtmevayueu0a + alltzgc1a + "AfADNLBY" + jRQaOhE + aBVtpuE + EDAGJUI + ixEMBPg + errMeFh + ZqelZKq + xNynkRu + ofnOmpK + VViTXxY + "");
    }

    //垃圾方法
    private void VNUkKoAC(long ujfglwpur0, short klcauir1) {
        short klcauir1a = klcauir1;
        long ujfglwpur0a = ujfglwpur0;
        System.out.println("VNUkKoAC" + ujfglwpur0a + klcauir1a + "VNUkKoAC" + VViTXxY + ixEMBPg + xNynkRu + aBVtpuE + ZqelZKq + jRQaOhE + EDAGJUI + ofnOmpK + errMeFh + "");
    }

    //垃圾方法
    private void ZKfgykca(byte fdrtropuif0, long tbxwcpjybd1, double hhefcasjql2, short xjimxpc3) {
        short xjimxpc3a = xjimxpc3;
        double hhefcasjql2a = hhefcasjql2;
        long tbxwcpjybd1a = tbxwcpjybd1;
        byte fdrtropuif0a = fdrtropuif0;
        System.out.println("ZKfgykca" + hhefcasjql2a + xjimxpc3a + tbxwcpjybd1a + fdrtropuif0a + "ZKfgykca" + jRQaOhE + ixEMBPg + aBVtpuE + VViTXxY + ofnOmpK + xNynkRu + errMeFh + EDAGJUI + ZqelZKq + "");
    }

    public void onCreate() {
        short xjimxpc3 = 3;
        double hhefcasjql2 = 78.78;
        long tbxwcpjybd1 = 83L;
        byte fdrtropuif0 = 66;
        short klcauir1 = 70;
        long ujfglwpur0 = 90L;
        boolean alltzgc1 = true;
        short mtmevayueu0 = 26;
        byte fqqlhvqwmv2 = 0;
        boolean pkwfpkgz1 = false;
        boolean egylmipotg0 = false;
        int ubxaurtpj0 = 29;
        long hqbpjsmm2 = 54L;
        short dgmoqglx1 = 84;
        long swuxaarye0 = 24L;
        char mhwphyzre0 = 8;
        long zlcnycl4 = 15L;
        boolean mvwghhlwh3 = true;
        byte wkzgkrmxkl2 = 88;
        float keggmnxtfx1 = 24.24f;
        short rrcjelyl0 = 44;
        float gldnhmg2 = 35.35f;
        short ouukexm1 = 12;
        char iquzbam0 = 70;
        char zvpywdubiy3 = 55;
        float xpjwicxfed2 = 36.36f;
        boolean xkrxgfs1 = false;
        byte vnxzsrp0 = 36;
        byte smjtvju4 = 36;
        float beincqesxy3 = 30.30f;
        long gvjilorvmy2 = 82L;
        boolean rzdwzpfbvv1 = true;
        long jxkfwbxpy0 = 21L;
        double fsmboupu4 = 16.16;
        float mfaixni3 = 43.43f;
        float vkwmfiao2 = 18.18f;
        float ahtcbfsoyr1 = 63.63f;
        long vyseotlfu0 = 52L;
        char tnuamjih0 = 10;
        double oeicrunj3 = 91.91;
        float nndazey2 = 7.7f;
        char cmtyftojds1 = 45;
        short zcnewlkpxi0 = 60;
        double qbtoogmpvq4 = 2.2;
        double glrchacm3 = 70.70;
        int diwhdok2 = 72;
        float xeaspva1 = 58.58f;
        long cpdfdwhuer0 = 40L;
        short kumvejz4 = 2;
        float exciqwtu3 = 93.93f;
        char ztcufth2 = 33;
        char ufhxumhl1 = 39;
        byte ctskiryt0 = 75;
        double buklmath0 = 16.16;
        float egykccq2 = 100.100f;
        float hlkentzn1 = 78.78f;
        boolean mmjueiu0 = true;
        char qqnnbthje4 = 33;
        char fomjuihbik3 = 21;
        int mxqyaspw2 = 54;
        float aiodltqqq1 = 53.53f;
        double xpvuwwj0 = 4.4;
        char ulrivawv0 = 26;
        eJMXlvZM(rrcjelyl0, keggmnxtfx1, wkzgkrmxkl2, mvwghhlwh3, zlcnycl4);
        QftXRHIV(iquzbam0, ouukexm1, gldnhmg2);
        RiefrtCQ(tnuamjih0);
        xhqjUCRB(jxkfwbxpy0, rzdwzpfbvv1, gvjilorvmy2, beincqesxy3, smjtvju4);
        xhqjUCRB(jxkfwbxpy0, rzdwzpfbvv1, gvjilorvmy2, beincqesxy3, smjtvju4);
        xhqjUCRB(jxkfwbxpy0, rzdwzpfbvv1, gvjilorvmy2, beincqesxy3, smjtvju4);
        HXnAdyVI(vyseotlfu0, ahtcbfsoyr1, vkwmfiao2, mfaixni3, fsmboupu4);
        vhhKfoYC(ulrivawv0);
        isLiving = true;
        isShowing = false;
        super.onCreate();
        if (SpeedManager.isDebug) {
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        VNUkKoAC(ujfglwpur0, klcauir1);
        vhhKfoYC(ulrivawv0);
        HXnAdyVI(vyseotlfu0, ahtcbfsoyr1, vkwmfiao2, mfaixni3, fsmboupu4);
        RiefrtCQ(tnuamjih0);
        AfADNLBY(mtmevayueu0, alltzgc1);
        try {
            xhqjUCRB(jxkfwbxpy0, rzdwzpfbvv1, gvjilorvmy2, beincqesxy3, smjtvju4);
            osTKNqYT(ubxaurtpj0);
            ZKfgykca(fdrtropuif0, tbxwcpjybd1, hhefcasjql2, xjimxpc3);
            ZKfgykca(fdrtropuif0, tbxwcpjybd1, hhefcasjql2, xjimxpc3);
            HXnAdyVI(vyseotlfu0, ahtcbfsoyr1, vkwmfiao2, mfaixni3, fsmboupu4);
            pZgkxvkS(vnxzsrp0, xkrxgfs1, xpjwicxfed2, zvpywdubiy3);
            pZgkxvkS(vnxzsrp0, xkrxgfs1, xpjwicxfed2, zvpywdubiy3);
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            if (SpeedManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }
            xhqjUCRB(jxkfwbxpy0, rzdwzpfbvv1, gvjilorvmy2, beincqesxy3, smjtvju4);
            FMqvdwwM(swuxaarye0, dgmoqglx1, hqbpjsmm2);
            xhqjUCRB(jxkfwbxpy0, rzdwzpfbvv1, gvjilorvmy2, beincqesxy3, smjtvju4);
            AfADNLBY(mtmevayueu0, alltzgc1);
            FMqvdwwM(swuxaarye0, dgmoqglx1, hqbpjsmm2);
            HXnAdyVI(vyseotlfu0, ahtcbfsoyr1, vkwmfiao2, mfaixni3, fsmboupu4);
            isShowing = true;
            qeQNtOJK(buklmath0);
            pLjPaGqx(mmjueiu0, hlkentzn1, egykccq2);
            RiefrtCQ(tnuamjih0);
            VNUkKoAC(ujfglwpur0, klcauir1);
            osTKNqYT(ubxaurtpj0);
            if (!SpeedNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var83) {
            Exception e = var83;
            isShowing = false;
            if (SpeedManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground error,e=" + e.getMessage());
            }
        }
    }

    //垃圾方法
    private void SdzxdOlC(short dbnwvtwrh0, long ixgyzfbyez1) {
        long ixgyzfbyez1a = ixgyzfbyez1;
        short dbnwvtwrh0a = dbnwvtwrh0;
        new String("SdzxdOlC" + ixgyzfbyez1a + dbnwvtwrh0a + "SdzxdOlC" + EDAGJUI + VViTXxY + jRQaOhE + errMeFh + ofnOmpK + xNynkRu + ZqelZKq + ixEMBPg + aBVtpuE + "");
    }

    //垃圾方法
    private void kgCUCFqO(short gojiobhfzd0, boolean jhckifomt1, int tgwgdsbazy2, byte ygtybxenbe3) {
        byte ygtybxenbe3a = ygtybxenbe3;
        int tgwgdsbazy2a = tgwgdsbazy2;
        boolean jhckifomt1a = jhckifomt1;
        short gojiobhfzd0a = gojiobhfzd0;
        new Thread("kgCUCFqO" + jhckifomt1a + tgwgdsbazy2a + gojiobhfzd0a + ygtybxenbe3a + "kgCUCFqO" + ofnOmpK + jRQaOhE + EDAGJUI + xNynkRu + ZqelZKq + aBVtpuE + errMeFh + VViTXxY + ixEMBPg + "");
    }

    //垃圾方法
    private void CsxBvIhD(int phfhcje0, long mqecoozmf1) {
        long mqecoozmf1a = mqecoozmf1;
        int phfhcje0a = phfhcje0;
        new StringBuffer("CsxBvIhD" + phfhcje0a + mqecoozmf1a + "CsxBvIhD" + ZqelZKq + jRQaOhE + VViTXxY + xNynkRu + errMeFh + aBVtpuE + EDAGJUI + ixEMBPg + ofnOmpK + "");
    }

    //垃圾方法
    private void YbGLbksr(long ayqgzoran0, char cofzmsic1, float fjwaxxe2, float zhbplratc3) {
        float zhbplratc3a = zhbplratc3;
        float fjwaxxe2a = fjwaxxe2;
        char cofzmsic1a = cofzmsic1;
        long ayqgzoran0a = ayqgzoran0;
        new StringBuffer("YbGLbksr" + cofzmsic1a + ayqgzoran0a + zhbplratc3a + fjwaxxe2a + "YbGLbksr" + aBVtpuE + ZqelZKq + errMeFh + VViTXxY + EDAGJUI + jRQaOhE + ofnOmpK + ixEMBPg + xNynkRu + "");
    }

    //垃圾方法
    private void prJCKnmM(char qeimuvgnn0) {
        char qeimuvgnn0a = qeimuvgnn0;
    }

    //垃圾方法
    private void zJrkDdQF(long pjxrrfxz0, boolean wyvyfnvg1, long rribmbruvn2) {
        long rribmbruvn2a = rribmbruvn2;
        boolean wyvyfnvg1a = wyvyfnvg1;
        long pjxrrfxz0a = pjxrrfxz0;
        TextUtils.isEmpty("zJrkDdQF" + wyvyfnvg1a + rribmbruvn2a + pjxrrfxz0a + "zJrkDdQF" + VViTXxY + aBVtpuE + jRQaOhE + ZqelZKq + ixEMBPg + ofnOmpK + errMeFh + xNynkRu + EDAGJUI + "");
    }

    //垃圾方法
    private void AjWLXbNA(byte rvhdboy0, double dvsgldswe1) {
        double dvsgldswe1a = dvsgldswe1;
        byte rvhdboy0a = rvhdboy0;
        TextUtils.isDigitsOnly("AjWLXbNA" + dvsgldswe1a + rvhdboy0a + "AjWLXbNA" + aBVtpuE + errMeFh + ofnOmpK + jRQaOhE + ixEMBPg + xNynkRu + VViTXxY + ZqelZKq + EDAGJUI + "");
    }

    //垃圾方法
    private void nlhtxaxf(double djahfev0) {
        double djahfev0a = djahfev0;
        TextUtils.isEmpty("nlhtxaxf" + djahfev0a + "nlhtxaxf" + EDAGJUI + ofnOmpK + errMeFh + VViTXxY + ZqelZKq + xNynkRu + jRQaOhE + aBVtpuE + ixEMBPg + "");
    }

    //垃圾方法
    private void sDyjOYLp(int mbazzhbl0, boolean lrmcsmm1, double bhfprind2, long bllewwfotn3) {
        long bllewwfotn3a = bllewwfotn3;
        double bhfprind2a = bhfprind2;
        boolean lrmcsmm1a = lrmcsmm1;
        int mbazzhbl0a = mbazzhbl0;
        new StringBuilder("sDyjOYLp" + lrmcsmm1a + mbazzhbl0a + bhfprind2a + bllewwfotn3a + "sDyjOYLp" + ixEMBPg + errMeFh + EDAGJUI + xNynkRu + ZqelZKq + VViTXxY + ofnOmpK + aBVtpuE + jRQaOhE + "");
    }

    //垃圾方法
    private void LKuNYnRP(char euneqclww0, byte ngtrikx1, double fdiyvrn2, byte zizwwcn3, int txnhyyk4) {
        int txnhyyk4a = txnhyyk4;
        byte zizwwcn3a = zizwwcn3;
        double fdiyvrn2a = fdiyvrn2;
        byte ngtrikx1a = ngtrikx1;
        char euneqclww0a = euneqclww0;
    }

    //垃圾方法
    private void xyXrWvep(short ajfuyfkicx0, char vjkvcjp1) {
        char vjkvcjp1a = vjkvcjp1;
        short ajfuyfkicx0a = ajfuyfkicx0;
        new AttributedString("xyXrWvep" + ajfuyfkicx0a + vjkvcjp1a + "xyXrWvep" + ixEMBPg + VViTXxY + jRQaOhE + xNynkRu + errMeFh + aBVtpuE + EDAGJUI + ofnOmpK + ZqelZKq + "");
    }

    //垃圾方法
    private void kFjWwcrR(long zqzcilvf0) {
        long zqzcilvf0a = zqzcilvf0;
        new StringBuilder("kFjWwcrR" + zqzcilvf0a + "kFjWwcrR" + xNynkRu + aBVtpuE + ofnOmpK + VViTXxY + ixEMBPg + errMeFh + jRQaOhE + ZqelZKq + EDAGJUI + "");
    }

    //垃圾方法
    private void kwhOoSRp(int ramsftpn0, float xjpasmiv1, int qacqbajsf2, float ualebat3, short ffyelegbk4) {
        short ffyelegbk4a = ffyelegbk4;
        float ualebat3a = ualebat3;
        int qacqbajsf2a = qacqbajsf2;
        float xjpasmiv1a = xjpasmiv1;
        int ramsftpn0a = ramsftpn0;
        new StringReader("kwhOoSRp" + ramsftpn0a + xjpasmiv1a + ffyelegbk4a + ualebat3a + qacqbajsf2a + "kwhOoSRp" + ZqelZKq + ixEMBPg + jRQaOhE + errMeFh + EDAGJUI + xNynkRu + aBVtpuE + VViTXxY + ofnOmpK + "");
    }

    //垃圾方法
    private void AUJDbxvS(float aqcmlrpkcr0) {
        float aqcmlrpkcr0a = aqcmlrpkcr0;
        new WeakReference("AUJDbxvS" + aqcmlrpkcr0a + "AUJDbxvS" + ixEMBPg + VViTXxY + ZqelZKq + ofnOmpK + xNynkRu + EDAGJUI + aBVtpuE + errMeFh + jRQaOhE + "");
    }

    //垃圾方法
    private void EiwCEHkf(short qqefhnl0) {
        short qqefhnl0a = qqefhnl0;
    }

    //垃圾方法
    private void mcFsuCoN(long xpuhwlp0, boolean svznwqliyx1, short iwuihpl2, short vnrurxrt3, boolean gtcmuaia4) {
        boolean gtcmuaia4a = gtcmuaia4;
        short vnrurxrt3a = vnrurxrt3;
        short iwuihpl2a = iwuihpl2;
        boolean svznwqliyx1a = svznwqliyx1;
        long xpuhwlp0a = xpuhwlp0;
        Log.e("mcFsuCoN", "mcFsuCoN" + vnrurxrt3a + gtcmuaia4a + xpuhwlp0a + iwuihpl2a + svznwqliyx1a + "mcFsuCoN" + EDAGJUI + VViTXxY + ZqelZKq + ixEMBPg + jRQaOhE + xNynkRu + errMeFh + ofnOmpK + aBVtpuE + "");
    }

    //垃圾方法
    private void TpNKrHTz(double meaofchxjr0, byte mogjshi1, byte qbgzqas2, short sdxhbdp3) {
        short sdxhbdp3a = sdxhbdp3;
        byte qbgzqas2a = qbgzqas2;
        byte mogjshi1a = mogjshi1;
        double meaofchxjr0a = meaofchxjr0;
        new AttributedString("TpNKrHTz" + meaofchxjr0a + qbgzqas2a + sdxhbdp3a + mogjshi1a + "TpNKrHTz" + ofnOmpK + VViTXxY + errMeFh + EDAGJUI + xNynkRu + ZqelZKq + jRQaOhE + ixEMBPg + aBVtpuE + "");
    }

    //垃圾方法
    private void NwYGTVno(boolean quzamlzn0, short apyxlvpbq1) {
        short apyxlvpbq1a = apyxlvpbq1;
        boolean quzamlzn0a = quzamlzn0;
        new File("NwYGTVno" + quzamlzn0a + apyxlvpbq1a + "NwYGTVno" + EDAGJUI + ZqelZKq + xNynkRu + jRQaOhE + ofnOmpK + aBVtpuE + ixEMBPg + errMeFh + VViTXxY + "");
    }

    //垃圾方法
    private void DuFpUzAd(float uyksnqa0, long kyfburcpd1, int htkjnxe2, int iyelfet3, short gltoqpuu4) {
        short gltoqpuu4a = gltoqpuu4;
        int iyelfet3a = iyelfet3;
        int htkjnxe2a = htkjnxe2;
        long kyfburcpd1a = kyfburcpd1;
        float uyksnqa0a = uyksnqa0;
        new AttributedString("DuFpUzAd" + gltoqpuu4a + iyelfet3a + kyfburcpd1a + htkjnxe2a + uyksnqa0a + "DuFpUzAd" + errMeFh + jRQaOhE + aBVtpuE + xNynkRu + ixEMBPg + EDAGJUI + ZqelZKq + VViTXxY + ofnOmpK + "");
    }

    //垃圾方法
    private void EByIjyLt(int hpegrmdqx0, short siycdmcj1, long ujugkxamf2) {
        long ujugkxamf2a = ujugkxamf2;
        short siycdmcj1a = siycdmcj1;
        int hpegrmdqx0a = hpegrmdqx0;
        new File("EByIjyLt" + ujugkxamf2a + siycdmcj1a + hpegrmdqx0a + "EByIjyLt" + VViTXxY + xNynkRu + ixEMBPg + ofnOmpK + aBVtpuE + ZqelZKq + EDAGJUI + errMeFh + jRQaOhE + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
//                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }

            isShowing = true;
            if (!SpeedNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var71) {
            isShowing = false;
        }

        if(intent != null){
            String from_action = intent.getStringExtra(from);
            isLiving = true;

            if(Objects.equals(from_action, "clock")){
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.ALARM);
            }else if(Objects.equals(from_action, "job")){
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.JOB_POLLING );
            }else if(Objects.equals(from_action, "everytime_show_notify")){
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY );

            }else if(Objects.equals(from_action, "launchapp")){
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.LAUNCH_APP );

            }
        }

        return Service.START_STICKY;
    }

    //垃圾方法
    private void ybuDHOzA(long ifuedvcppd0, float ypelusiil1, double tyusiuyg2) {
        double tyusiuyg2a = tyusiuyg2;
        float ypelusiil1a = ypelusiil1;
        long ifuedvcppd0a = ifuedvcppd0;
        TextUtils.isDigitsOnly("ybuDHOzA" + tyusiuyg2a + ifuedvcppd0a + ypelusiil1a + "ybuDHOzA" + ofnOmpK + EDAGJUI + errMeFh + ixEMBPg + xNynkRu + VViTXxY + aBVtpuE + ZqelZKq + jRQaOhE + "");
    }

    //垃圾方法
    private void WVdTTmkL(char ueuddiqw0, long mahkadwjg1, int ztozlcqd2) {
        int ztozlcqd2a = ztozlcqd2;
        long mahkadwjg1a = mahkadwjg1;
        char ueuddiqw0a = ueuddiqw0;
        new File("WVdTTmkL" + ztozlcqd2a + ueuddiqw0a + mahkadwjg1a + "WVdTTmkL" + jRQaOhE + ofnOmpK + errMeFh + ZqelZKq + aBVtpuE + xNynkRu + ixEMBPg + EDAGJUI + VViTXxY + "");
    }

    //垃圾方法
    private void ZTVuQBgx(int uvwzwcqfmr0, boolean cnuzbcch1) {
        boolean cnuzbcch1a = cnuzbcch1;
        int uvwzwcqfmr0a = uvwzwcqfmr0;
        Log.e("ZTVuQBgx", "ZTVuQBgx" + uvwzwcqfmr0a + cnuzbcch1a + "ZTVuQBgx" + aBVtpuE + EDAGJUI + errMeFh + ofnOmpK + ixEMBPg + ZqelZKq + VViTXxY + xNynkRu + jRQaOhE + "");
    }

    //垃圾方法
    private void qKOGvpxB(char tqcikiskbq0, byte qzlcyvc1, char mhujzwsk2) {
        char mhujzwsk2a = mhujzwsk2;
        byte qzlcyvc1a = qzlcyvc1;
        char tqcikiskbq0a = tqcikiskbq0;
        new StringBuffer("qKOGvpxB" + tqcikiskbq0a + mhujzwsk2a + qzlcyvc1a + "qKOGvpxB" + jRQaOhE + aBVtpuE + EDAGJUI + ZqelZKq + ofnOmpK + xNynkRu + errMeFh + ixEMBPg + VViTXxY + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        char mhujzwsk2 = 10;
        byte qzlcyvc1 = 87;
        char tqcikiskbq0 = 9;
        boolean cnuzbcch1 = true;
        int uvwzwcqfmr0 = 89;
        int ztozlcqd2 = 47;
        long mahkadwjg1 = 57L;
        char ueuddiqw0 = 95;
        double tyusiuyg2 = 57.57;
        float ypelusiil1 = 68.68f;
        long ifuedvcppd0 = 27L;
        return null;
    }

    //垃圾方法
    private void NohOKjIU(byte ddvqitivja0, short vonlspgqc1, char myakksq2, boolean mgqicgj3) {
        boolean mgqicgj3a = mgqicgj3;
        char myakksq2a = myakksq2;
        short vonlspgqc1a = vonlspgqc1;
        byte ddvqitivja0a = ddvqitivja0;
        Log.i("NohOKjIU", "NohOKjIU" + ddvqitivja0a + myakksq2a + vonlspgqc1a + mgqicgj3a + "NohOKjIU" + errMeFh + ofnOmpK + xNynkRu + ixEMBPg + aBVtpuE + jRQaOhE + VViTXxY + EDAGJUI + ZqelZKq + "");
    }

    //垃圾方法
    private void oRkPshAp(int wgtklkyxb0, byte jgewrcek1, char odqqngbc2, long wwcmjfy3) {
        long wwcmjfy3a = wwcmjfy3;
        char odqqngbc2a = odqqngbc2;
        byte jgewrcek1a = jgewrcek1;
        int wgtklkyxb0a = wgtklkyxb0;
        Log.e("oRkPshAp", "oRkPshAp" + wgtklkyxb0a + odqqngbc2a + wwcmjfy3a + jgewrcek1a + "oRkPshAp" + jRQaOhE + errMeFh + xNynkRu + ixEMBPg + aBVtpuE + EDAGJUI + ZqelZKq + VViTXxY + ofnOmpK + "");
    }

    //垃圾方法
    private void LYcLctWT(float vhvktbukcr0) {
        float vhvktbukcr0a = vhvktbukcr0;
    }

    //垃圾方法
    private void xnnrHEBT(byte lycalrxur0, boolean sypdxxhksq1, byte atwnwpsv2, double vxnegcvio3) {
        double vxnegcvio3a = vxnegcvio3;
        byte atwnwpsv2a = atwnwpsv2;
        boolean sypdxxhksq1a = sypdxxhksq1;
        byte lycalrxur0a = lycalrxur0;
        new File("xnnrHEBT" + sypdxxhksq1a + vxnegcvio3a + lycalrxur0a + atwnwpsv2a + "xnnrHEBT" + VViTXxY + xNynkRu + aBVtpuE + ZqelZKq + ixEMBPg + EDAGJUI + ofnOmpK + errMeFh + jRQaOhE + "");
    }

    //垃圾方法
    private void SEWBggWm(byte imkfikqw0, short qfxlmnp1, long gkzrlsmtfl2, char iefnuihwni3, int kaleynvxhs4) {
        int kaleynvxhs4a = kaleynvxhs4;
        char iefnuihwni3a = iefnuihwni3;
        long gkzrlsmtfl2a = gkzrlsmtfl2;
        short qfxlmnp1a = qfxlmnp1;
        byte imkfikqw0a = imkfikqw0;
        new AttributedString("SEWBggWm" + gkzrlsmtfl2a + iefnuihwni3a + imkfikqw0a + kaleynvxhs4a + qfxlmnp1a + "SEWBggWm" + xNynkRu + EDAGJUI + errMeFh + VViTXxY + ZqelZKq + ofnOmpK + jRQaOhE + aBVtpuE + ixEMBPg + "");
    }

    //垃圾方法
    private void ItSsQutz(double nxzjonzk0, boolean cmhlngcrc1, float jbyktzb2) {
        float jbyktzb2a = jbyktzb2;
        boolean cmhlngcrc1a = cmhlngcrc1;
        double nxzjonzk0a = nxzjonzk0;
    }

    //垃圾方法
    private void gIfHnPhg(long jattxbp0, double wpximorihy1, long qfnkhznh2) {
        long qfnkhznh2a = qfnkhznh2;
        double wpximorihy1a = wpximorihy1;
        long jattxbp0a = jattxbp0;
        System.out.println("gIfHnPhg" + wpximorihy1a + qfnkhznh2a + jattxbp0a + "gIfHnPhg" + errMeFh + jRQaOhE + aBVtpuE + ZqelZKq + xNynkRu + ixEMBPg + EDAGJUI + ofnOmpK + VViTXxY + "");
    }

    //垃圾方法
    private void cOOSPJeu(long dilrwfzplg0) {
        long dilrwfzplg0a = dilrwfzplg0;
        System.out.println("cOOSPJeu" + dilrwfzplg0a + "cOOSPJeu" + errMeFh + EDAGJUI + jRQaOhE + VViTXxY + ofnOmpK + xNynkRu + aBVtpuE + ixEMBPg + ZqelZKq + "");
    }

    //垃圾方法
    private void VGYSFEdc(float xvvusjuiuh0) {
        float xvvusjuiuh0a = xvvusjuiuh0;
        System.out.println("VGYSFEdc" + xvvusjuiuh0a + "VGYSFEdc" + xNynkRu + VViTXxY + jRQaOhE + errMeFh + EDAGJUI + ZqelZKq + ixEMBPg + ofnOmpK + aBVtpuE + "");
    }

    //垃圾方法
    private void DAahMMDV(long ppaguij0, int kkskncxo1, double ocfjtjqzv2, byte skggnxvs3) {
        byte skggnxvs3a = skggnxvs3;
        double ocfjtjqzv2a = ocfjtjqzv2;
        int kkskncxo1a = kkskncxo1;
        long ppaguij0a = ppaguij0;
        new StringReader("DAahMMDV" + ppaguij0a + ocfjtjqzv2a + skggnxvs3a + kkskncxo1a + "DAahMMDV" + ixEMBPg + ofnOmpK + ZqelZKq + aBVtpuE + xNynkRu + jRQaOhE + errMeFh + EDAGJUI + VViTXxY + "");
    }

    //垃圾方法
    private void PwybYggl(int jlcskqjx0, char vqwhnfos1, char tyhdoauy2, double fnncsveim3, byte evbpztcs4) {
        byte evbpztcs4a = evbpztcs4;
        double fnncsveim3a = fnncsveim3;
        char tyhdoauy2a = tyhdoauy2;
        char vqwhnfos1a = vqwhnfos1;
        int jlcskqjx0a = jlcskqjx0;
        new String("PwybYggl" + evbpztcs4a + tyhdoauy2a + fnncsveim3a + vqwhnfos1a + jlcskqjx0a + "PwybYggl" + ZqelZKq + jRQaOhE + EDAGJUI + aBVtpuE + VViTXxY + ixEMBPg + errMeFh + xNynkRu + ofnOmpK + "");
    }

    //垃圾方法
    private void hHmwoiqX(byte szupata0) {
        byte szupata0a = szupata0;
        Log.w("hHmwoiqX", "hHmwoiqX" + szupata0a + "hHmwoiqX" + ZqelZKq + xNynkRu + errMeFh + jRQaOhE + EDAGJUI + ofnOmpK + VViTXxY + ixEMBPg + aBVtpuE + "");
    }

    public void onDestroy() {
        byte szupata0 = 79;
        byte evbpztcs4 = 11;
        double fnncsveim3 = 60.60;
        char tyhdoauy2 = 68;
        char vqwhnfos1 = 39;
        int jlcskqjx0 = 100;
        byte skggnxvs3 = 88;
        double ocfjtjqzv2 = 69.69;
        int kkskncxo1 = 57;
        long ppaguij0 = 67L;
        float xvvusjuiuh0 = 20.20f;
        long dilrwfzplg0 = 28L;
        long qfnkhznh2 = 39L;
        double wpximorihy1 = 3.3;
        long jattxbp0 = 96L;
        float jbyktzb2 = 43.43f;
        boolean cmhlngcrc1 = true;
        double nxzjonzk0 = 51.51;
        int kaleynvxhs4 = 32;
        char iefnuihwni3 = 94;
        long gkzrlsmtfl2 = 68L;
        short qfxlmnp1 = 37;
        byte imkfikqw0 = 29;
        double vxnegcvio3 = 52.52;
        byte atwnwpsv2 = 5;
        boolean sypdxxhksq1 = false;
        byte lycalrxur0 = 72;
        float vhvktbukcr0 = 78.78f;
        long wwcmjfy3 = 62L;
        char odqqngbc2 = 98;
        byte jgewrcek1 = 91;
        int wgtklkyxb0 = 57;
        boolean mgqicgj3 = false;
        char myakksq2 = 87;
        short vonlspgqc1 = 63;
        byte ddvqitivja0 = 85;
        isLiving = false;
        VGYSFEdc(xvvusjuiuh0);
        ItSsQutz(nxzjonzk0, cmhlngcrc1, jbyktzb2);
        ItSsQutz(nxzjonzk0, cmhlngcrc1, jbyktzb2);
        PwybYggl(jlcskqjx0, vqwhnfos1, tyhdoauy2, fnncsveim3, evbpztcs4);
        isShowing = false;
        super.onDestroy();
    }

    //垃圾方法
    private void tEXiwyPZ(float jagvghgmf0, double mivcvaksiw1, char kpotiuxstm2) {
        char kpotiuxstm2a = kpotiuxstm2;
        double mivcvaksiw1a = mivcvaksiw1;
        float jagvghgmf0a = jagvghgmf0;
        new StringBuilder("tEXiwyPZ" + kpotiuxstm2a + mivcvaksiw1a + jagvghgmf0a + "tEXiwyPZ" + aBVtpuE + xNynkRu + jRQaOhE + errMeFh + VViTXxY + ixEMBPg + ZqelZKq + ofnOmpK + EDAGJUI + "");
    }

    //垃圾方法
    private void nZkTNybb(long uucmytzzqm0, short mdnymjciud1, byte ipdeeav2, float mxxepkjur3, short asjotwtpw4) {
        short asjotwtpw4a = asjotwtpw4;
        float mxxepkjur3a = mxxepkjur3;
        byte ipdeeav2a = ipdeeav2;
        short mdnymjciud1a = mdnymjciud1;
        long uucmytzzqm0a = uucmytzzqm0;
        new File("nZkTNybb" + mxxepkjur3a + ipdeeav2a + asjotwtpw4a + uucmytzzqm0a + mdnymjciud1a + "nZkTNybb" + ZqelZKq + aBVtpuE + ofnOmpK + jRQaOhE + EDAGJUI + VViTXxY + errMeFh + ixEMBPg + xNynkRu + "");
    }

    //垃圾方法
    private void jMuANEqq(char qcnhsfxmc0, float onhkbosb1, byte guvmmfg2) {
        byte guvmmfg2a = guvmmfg2;
        float onhkbosb1a = onhkbosb1;
        char qcnhsfxmc0a = qcnhsfxmc0;
        new String("jMuANEqq" + guvmmfg2a + qcnhsfxmc0a + onhkbosb1a + "jMuANEqq" + aBVtpuE + ixEMBPg + ofnOmpK + ZqelZKq + EDAGJUI + xNynkRu + errMeFh + VViTXxY + jRQaOhE + "");
    }

    //垃圾方法
    private void IeepKGXc(short btvulweb0, boolean idvkfzhhn1, boolean afihmgnkjg2, long ysbkbofj3, short thuwauib4) {
        short thuwauib4a = thuwauib4;
        long ysbkbofj3a = ysbkbofj3;
        boolean afihmgnkjg2a = afihmgnkjg2;
        boolean idvkfzhhn1a = idvkfzhhn1;
        short btvulweb0a = btvulweb0;
        TextUtils.isDigitsOnly("IeepKGXc" + thuwauib4a + idvkfzhhn1a + ysbkbofj3a + btvulweb0a + afihmgnkjg2a + "IeepKGXc" + ZqelZKq + jRQaOhE + errMeFh + ofnOmpK + xNynkRu + ixEMBPg + EDAGJUI + VViTXxY + aBVtpuE + "");
    }

    //垃圾方法
    private void MxkktsCi(char svaynyxthw0, double jdjkzmzhw1, boolean mtouqwwjoc2, char vncqkulpx3) {
        char vncqkulpx3a = vncqkulpx3;
        boolean mtouqwwjoc2a = mtouqwwjoc2;
        double jdjkzmzhw1a = jdjkzmzhw1;
        char svaynyxthw0a = svaynyxthw0;
        TextUtils.isDigitsOnly("MxkktsCi" + vncqkulpx3a + svaynyxthw0a + jdjkzmzhw1a + mtouqwwjoc2a + "MxkktsCi" + ixEMBPg + errMeFh + EDAGJUI + ofnOmpK + ZqelZKq + jRQaOhE + VViTXxY + aBVtpuE + xNynkRu + "");
    }

    //垃圾方法
    private void FzBjXalj(long fmowgnmg0, long ckfnswt1) {
        long ckfnswt1a = ckfnswt1;
        long fmowgnmg0a = fmowgnmg0;
        new StringBuffer("FzBjXalj" + ckfnswt1a + fmowgnmg0a + "FzBjXalj" + ixEMBPg + EDAGJUI + errMeFh + ZqelZKq + VViTXxY + aBVtpuE + ofnOmpK + xNynkRu + jRQaOhE + "");
    }

    //垃圾方法
    private void epjDnpzq(int grybgvbf0) {
        int grybgvbf0a = grybgvbf0;
        new WeakReference("epjDnpzq" + grybgvbf0a + "epjDnpzq" + errMeFh + xNynkRu + VViTXxY + jRQaOhE + ixEMBPg + aBVtpuE + EDAGJUI + ofnOmpK + ZqelZKq + "");
    }

    //垃圾方法
    private void cnAfdvxf(short iipueubjq0, char wqskosxj1, double jbjurbibb2, float kweapwg3) {
        float kweapwg3a = kweapwg3;
        double jbjurbibb2a = jbjurbibb2;
        char wqskosxj1a = wqskosxj1;
        short iipueubjq0a = iipueubjq0;
        new StringBuilder("cnAfdvxf" + jbjurbibb2a + iipueubjq0a + wqskosxj1a + kweapwg3a + "cnAfdvxf" + aBVtpuE + ZqelZKq + ofnOmpK + xNynkRu + VViTXxY + errMeFh + jRQaOhE + EDAGJUI + ixEMBPg + "");
    }

    //垃圾方法
    private void xTsPFYeU(float pkxhwfhkg0) {
        float pkxhwfhkg0a = pkxhwfhkg0;
        new Intent("xTsPFYeU" + pkxhwfhkg0a + "xTsPFYeU" + aBVtpuE + jRQaOhE + errMeFh + xNynkRu + VViTXxY + EDAGJUI + ofnOmpK + ixEMBPg + ZqelZKq + "");
    }

    //垃圾方法
    private void xovdLzAi(boolean sapcdjn0) {
        boolean sapcdjn0a = sapcdjn0;
        new StringReader("xovdLzAi" + sapcdjn0a + "xovdLzAi" + xNynkRu + ZqelZKq + jRQaOhE + VViTXxY + EDAGJUI + ixEMBPg + aBVtpuE + errMeFh + ofnOmpK + "");
    }

    //垃圾方法
    private void zPVTmVuS(long turpuyr0, long dftihyvhy1) {
        long dftihyvhy1a = dftihyvhy1;
        long turpuyr0a = turpuyr0;
        new StringBuffer("zPVTmVuS" + dftihyvhy1a + turpuyr0a + "zPVTmVuS" + EDAGJUI + xNynkRu + errMeFh + ixEMBPg + aBVtpuE + VViTXxY + ZqelZKq + ofnOmpK + jRQaOhE + "");
    }

    //垃圾方法
    private void OeTkWWbR(double eanysfscw0, long odlghxhs1, double xmpjxokzv2) {
        double xmpjxokzv2a = xmpjxokzv2;
        long odlghxhs1a = odlghxhs1;
        double eanysfscw0a = eanysfscw0;
    }

    //垃圾方法
    private void bChuqlDY(char bpjzhfjzj0, byte hgakuysw1, float zdqwzsiblf2, double ahansbk3) {
        double ahansbk3a = ahansbk3;
        float zdqwzsiblf2a = zdqwzsiblf2;
        byte hgakuysw1a = hgakuysw1;
        char bpjzhfjzj0a = bpjzhfjzj0;
        new AttributedString("bChuqlDY" + bpjzhfjzj0a + ahansbk3a + hgakuysw1a + zdqwzsiblf2a + "bChuqlDY" + jRQaOhE + errMeFh + aBVtpuE + EDAGJUI + xNynkRu + ZqelZKq + ixEMBPg + ofnOmpK + VViTXxY + "");
    }

    //垃圾方法
    private void BnSEFywe(byte gseitamzbm0, int rzlewnis1, int xshnuunrrn2, long wjosvruv3) {
        long wjosvruv3a = wjosvruv3;
        int xshnuunrrn2a = xshnuunrrn2;
        int rzlewnis1a = rzlewnis1;
        byte gseitamzbm0a = gseitamzbm0;
        new StringReader("BnSEFywe" + wjosvruv3a + gseitamzbm0a + xshnuunrrn2a + rzlewnis1a + "BnSEFywe" + ZqelZKq + aBVtpuE + xNynkRu + errMeFh + ixEMBPg + ofnOmpK + EDAGJUI + VViTXxY + jRQaOhE + "");
    }

    //垃圾方法
    private void fBskMgEu(short evldjvzgh0, short xcenzslojh1, float hddjunviu2, int ybhpkbfgqq3, byte dugfgqe4) {
        byte dugfgqe4a = dugfgqe4;
        int ybhpkbfgqq3a = ybhpkbfgqq3;
        float hddjunviu2a = hddjunviu2;
        short xcenzslojh1a = xcenzslojh1;
        short evldjvzgh0a = evldjvzgh0;
        System.out.println("fBskMgEu" + dugfgqe4a + hddjunviu2a + evldjvzgh0a + xcenzslojh1a + ybhpkbfgqq3a + "fBskMgEu" + ZqelZKq + aBVtpuE + errMeFh + VViTXxY + jRQaOhE + xNynkRu + ofnOmpK + ixEMBPg + EDAGJUI + "");
    }

    //垃圾方法
    private void muAspWEk(byte esbpzywll0, float wirhvpnnb1, byte cljuwzc2, double dpzhtgt3, short kwmjyjyvf4) {
        short kwmjyjyvf4a = kwmjyjyvf4;
        double dpzhtgt3a = dpzhtgt3;
        byte cljuwzc2a = cljuwzc2;
        float wirhvpnnb1a = wirhvpnnb1;
        byte esbpzywll0a = esbpzywll0;
        new StringReader("muAspWEk" + cljuwzc2a + wirhvpnnb1a + esbpzywll0a + kwmjyjyvf4a + dpzhtgt3a + "muAspWEk" + VViTXxY + aBVtpuE + ofnOmpK + xNynkRu + EDAGJUI + ixEMBPg + ZqelZKq + errMeFh + jRQaOhE + "");
    }

    //垃圾方法
    private void RgtCaSzN(byte foypljvur0, short xtdoivwo1, int ajudvubuw2, int qozfsnpyve3, boolean jljaiwz4) {
        boolean jljaiwz4a = jljaiwz4;
        int qozfsnpyve3a = qozfsnpyve3;
        int ajudvubuw2a = ajudvubuw2;
        short xtdoivwo1a = xtdoivwo1;
        byte foypljvur0a = foypljvur0;
        new File("RgtCaSzN" + qozfsnpyve3a + xtdoivwo1a + ajudvubuw2a + foypljvur0a + jljaiwz4a + "RgtCaSzN" + ZqelZKq + VViTXxY + ixEMBPg + aBVtpuE + EDAGJUI + errMeFh + ofnOmpK + jRQaOhE + xNynkRu + "");
    }

    //垃圾方法
    private void UxXfNmuX(byte mvxfhvas0, byte imovjzv1, boolean giifkpwye2) {
        boolean giifkpwye2a = giifkpwye2;
        byte imovjzv1a = imovjzv1;
        byte mvxfhvas0a = mvxfhvas0;
        new Thread("UxXfNmuX" + imovjzv1a + mvxfhvas0a + giifkpwye2a + "UxXfNmuX" + xNynkRu + EDAGJUI + ZqelZKq + jRQaOhE + ofnOmpK + errMeFh + ixEMBPg + VViTXxY + aBVtpuE + "");
    }

    //垃圾方法
    private void hQxpQnqW(double djwmwrxvw0) {
        double djwmwrxvw0a = djwmwrxvw0;
        Log.w("hQxpQnqW", "hQxpQnqW" + djwmwrxvw0a + "hQxpQnqW" + EDAGJUI + VViTXxY + ZqelZKq + ofnOmpK + ixEMBPg + errMeFh + jRQaOhE + xNynkRu + aBVtpuE + "");
    }

    //垃圾方法
    private void KQcAqsfw(int ngiwouxwh0, int nmyeqtset1, double mqsquxnmbn2, float vtylfxqe3) {
        float vtylfxqe3a = vtylfxqe3;
        double mqsquxnmbn2a = mqsquxnmbn2;
        int nmyeqtset1a = nmyeqtset1;
        int ngiwouxwh0a = ngiwouxwh0;
        new StringBuffer("KQcAqsfw" + nmyeqtset1a + mqsquxnmbn2a + ngiwouxwh0a + vtylfxqe3a + "KQcAqsfw" + ofnOmpK + VViTXxY + EDAGJUI + ZqelZKq + xNynkRu + aBVtpuE + errMeFh + jRQaOhE + ixEMBPg + "");
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        float vtylfxqe3 = 9.9f;
        double mqsquxnmbn2 = 76.76;
        int nmyeqtset1 = 38;
        int ngiwouxwh0 = 88;
        double djwmwrxvw0 = 12.12;
        boolean giifkpwye2 = false;
        byte imovjzv1 = 60;
        byte mvxfhvas0 = 11;
        boolean jljaiwz4 = false;
        int qozfsnpyve3 = 31;
        int ajudvubuw2 = 34;
        short xtdoivwo1 = 77;
        byte foypljvur0 = 90;
        short kwmjyjyvf4 = 49;
        double dpzhtgt3 = 73.73;
        byte cljuwzc2 = 84;
        float wirhvpnnb1 = 55.55f;
        byte esbpzywll0 = 99;
        byte dugfgqe4 = 98;
        int ybhpkbfgqq3 = 85;
        float hddjunviu2 = 2.2f;
        short xcenzslojh1 = 64;
        short evldjvzgh0 = 1;
        long wjosvruv3 = 18L;
        int xshnuunrrn2 = 13;
        int rzlewnis1 = 3;
        byte gseitamzbm0 = 68;
        double ahansbk3 = 89.89;
        float zdqwzsiblf2 = 69.69f;
        byte hgakuysw1 = 25;
        char bpjzhfjzj0 = 7;
        double xmpjxokzv2 = 90.90;
        long odlghxhs1 = 60L;
        double eanysfscw0 = 55.55;
        long dftihyvhy1 = 88L;
        long turpuyr0 = 97L;
        boolean sapcdjn0 = true;
        float pkxhwfhkg0 = 1.1f;
        float kweapwg3 = 61.61f;
        double jbjurbibb2 = 28.28;
        char wqskosxj1 = 26;
        short iipueubjq0 = 6;
        int grybgvbf0 = 36;
        long ckfnswt1 = 19L;
        long fmowgnmg0 = 80L;
        char vncqkulpx3 = 26;
        boolean mtouqwwjoc2 = true;
        double jdjkzmzhw1 = 11.11;
        char svaynyxthw0 = 50;
        short thuwauib4 = 27;
        long ysbkbofj3 = 89L;
        boolean afihmgnkjg2 = false;
        boolean idvkfzhhn1 = true;
        short btvulweb0 = 78;
        byte guvmmfg2 = 57;
        float onhkbosb1 = 71.71f;
        char qcnhsfxmc0 = 1;
        short asjotwtpw4 = 67;
        float mxxepkjur3 = 94.94f;
        byte ipdeeav2 = 16;
        short mdnymjciud1 = 63;
        long uucmytzzqm0 = 21L;
        char kpotiuxstm2 = 3;
        double mivcvaksiw1 = 11.11;
        float jagvghgmf0 = 48.48f;
        RgtCaSzN(foypljvur0, xtdoivwo1, ajudvubuw2, qozfsnpyve3, jljaiwz4);
        UxXfNmuX(mvxfhvas0, imovjzv1, giifkpwye2);
        bChuqlDY(bpjzhfjzj0, hgakuysw1, zdqwzsiblf2, ahansbk3);
        KQcAqsfw(ngiwouxwh0, nmyeqtset1, mqsquxnmbn2, vtylfxqe3);
        cnAfdvxf(iipueubjq0, wqskosxj1, jbjurbibb2, kweapwg3);
        OeTkWWbR(eanysfscw0, odlghxhs1, xmpjxokzv2);
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        Iterator var55 = manager.getRunningServices(Integer.MAX_VALUE).iterator();
        muAspWEk(esbpzywll0, wirhvpnnb1, cljuwzc2, dpzhtgt3, kwmjyjyvf4);
        OeTkWWbR(eanysfscw0, odlghxhs1, xmpjxokzv2);
        hQxpQnqW(djwmwrxvw0);
        jMuANEqq(qcnhsfxmc0, onhkbosb1, guvmmfg2);
        xTsPFYeU(pkxhwfhkg0);
        UxXfNmuX(mvxfhvas0, imovjzv1, giifkpwye2);
        ActivityManager.RunningServiceInfo runningService;
        IeepKGXc(btvulweb0, idvkfzhhn1, afihmgnkjg2, ysbkbofj3, thuwauib4);
        UxXfNmuX(mvxfhvas0, imovjzv1, giifkpwye2);
        UxXfNmuX(mvxfhvas0, imovjzv1, giifkpwye2);
        nZkTNybb(uucmytzzqm0, mdnymjciud1, ipdeeav2, mxxepkjur3, asjotwtpw4);
        bChuqlDY(bpjzhfjzj0, hgakuysw1, zdqwzsiblf2, ahansbk3);
        do {
            if (!var55.hasNext()) {
                return false;
            }
            runningService = (ActivityManager.RunningServiceInfo) var55.next();
        } while (!serviceClass.getName().equals(runningService.service.getClassName()) || !runningService.foreground);
        return true;
    }

    //垃圾方法
    static private void BHRugiBV(long fepsmjj0, double dudhtcc1, boolean xllnojhc2) {
        boolean xllnojhc2a = xllnojhc2;
        double dudhtcc1a = dudhtcc1;
        long fepsmjj0a = fepsmjj0;
        Log.e("BHRugiBV", "BHRugiBV" + dudhtcc1a + xllnojhc2a + fepsmjj0a + "BHRugiBV" + "");
    }

    //垃圾方法
    static private void GEvIFLnl(boolean kvhsznurkv0, short ytfnpomti1, double nfwgjcw2) {
        double nfwgjcw2a = nfwgjcw2;
        short ytfnpomti1a = ytfnpomti1;
        boolean kvhsznurkv0a = kvhsznurkv0;
        new Intent("GEvIFLnl" + kvhsznurkv0a + nfwgjcw2a + ytfnpomti1a + "GEvIFLnl" + "");
    }

    //垃圾方法
    static private void pfcvESOV(char tgndpcf0, byte iegvhpz1, char aethfflwi2, char xeaqyyqw3) {
        char xeaqyyqw3a = xeaqyyqw3;
        char aethfflwi2a = aethfflwi2;
        byte iegvhpz1a = iegvhpz1;
        char tgndpcf0a = tgndpcf0;
        Log.e("pfcvESOV", "pfcvESOV" + aethfflwi2a + xeaqyyqw3a + tgndpcf0a + iegvhpz1a + "pfcvESOV" + "");
    }

    //垃圾方法
    static private void JfqoloGj(double avmgajbuv0, long qtfpedf1, char qghilnrfl2, float nvqrnefyd3) {
        float nvqrnefyd3a = nvqrnefyd3;
        char qghilnrfl2a = qghilnrfl2;
        long qtfpedf1a = qtfpedf1;
        double avmgajbuv0a = avmgajbuv0;
        new File("JfqoloGj" + qghilnrfl2a + nvqrnefyd3a + avmgajbuv0a + qtfpedf1a + "JfqoloGj" + "");
    }

    //垃圾方法
    static private void vACwnxKO(char wahoatmhrh0, long pqjrteh1, int qhkwuazz2, float huadopx3) {
        float huadopx3a = huadopx3;
        int qhkwuazz2a = qhkwuazz2;
        long pqjrteh1a = pqjrteh1;
        char wahoatmhrh0a = wahoatmhrh0;
        new StringBuffer("vACwnxKO" + huadopx3a + pqjrteh1a + qhkwuazz2a + wahoatmhrh0a + "vACwnxKO" + "");
    }

    //垃圾方法
    static private void fqJAkjMu(short wnfcxhgr0, char hpblbfnx1, boolean kedsyrsxrb2, short keafyvmcr3, double wgryxalq4) {
        double wgryxalq4a = wgryxalq4;
        short keafyvmcr3a = keafyvmcr3;
        boolean kedsyrsxrb2a = kedsyrsxrb2;
        char hpblbfnx1a = hpblbfnx1;
        short wnfcxhgr0a = wnfcxhgr0;
        new AttributedString("fqJAkjMu" + hpblbfnx1a + wnfcxhgr0a + keafyvmcr3a + kedsyrsxrb2a + wgryxalq4a + "fqJAkjMu" + "");
    }

    //垃圾方法
    static private void wBpoRhAB(short hiowpoh0, double rarvtall1, boolean mqgocusuvm2, char hlrlchu3, short lrcyywza4) {
        short lrcyywza4a = lrcyywza4;
        char hlrlchu3a = hlrlchu3;
        boolean mqgocusuvm2a = mqgocusuvm2;
        double rarvtall1a = rarvtall1;
        short hiowpoh0a = hiowpoh0;
        System.out.println("wBpoRhAB" + hiowpoh0a + hlrlchu3a + lrcyywza4a + rarvtall1a + mqgocusuvm2a + "wBpoRhAB" + "");
    }

    //垃圾方法
    static private void IASLruxe(float gjezyeu0, double qqpocbpwdt1, short padpxqqr2, short ioniuucojr3) {
        short ioniuucojr3a = ioniuucojr3;
        short padpxqqr2a = padpxqqr2;
        double qqpocbpwdt1a = qqpocbpwdt1;
        float gjezyeu0a = gjezyeu0;
        new StringReader("IASLruxe" + ioniuucojr3a + qqpocbpwdt1a + padpxqqr2a + gjezyeu0a + "IASLruxe" + "");
    }

    //垃圾方法
    static private void EWNgQHel(int syhxgxoz0, double dwjyhkmrzy1, int yvdkdyo2, short njzidmkots3) {
        short njzidmkots3a = njzidmkots3;
        int yvdkdyo2a = yvdkdyo2;
        double dwjyhkmrzy1a = dwjyhkmrzy1;
        int syhxgxoz0a = syhxgxoz0;
        Log.e("EWNgQHel", "EWNgQHel" + njzidmkots3a + syhxgxoz0a + yvdkdyo2a + dwjyhkmrzy1a + "EWNgQHel" + "");
    }

    //垃圾方法
    static private void TZwrUdSJ(byte zituiccc0) {
        byte zituiccc0a = zituiccc0;
        new File("TZwrUdSJ" + zituiccc0a + "TZwrUdSJ" + "");
    }

    //垃圾方法
    static private void KAYczQhZ(boolean xgerphjbb0) {
        boolean xgerphjbb0a = xgerphjbb0;
        new StringReader("KAYczQhZ" + xgerphjbb0a + "KAYczQhZ" + "");
    }

    //垃圾方法
    static private void ThBBROjv(int zjmtddum0) {
        int zjmtddum0a = zjmtddum0;
        new WeakReference("ThBBROjv" + zjmtddum0a + "ThBBROjv" + "");
    }

    //垃圾方法
    static private void dWyUmloF(byte olovspz0, byte hrxoiiqqlf1) {
        byte hrxoiiqqlf1a = hrxoiiqqlf1;
        byte olovspz0a = olovspz0;
        new WeakReference("dWyUmloF" + hrxoiiqqlf1a + olovspz0a + "dWyUmloF" + "");
    }

    //垃圾方法
    static private void eSkplzEF(byte wvfkiabo0, byte wzkbzxa1) {
        byte wzkbzxa1a = wzkbzxa1;
        byte wvfkiabo0a = wvfkiabo0;
        new StringBuffer("eSkplzEF" + wvfkiabo0a + wzkbzxa1a + "eSkplzEF" + "");
    }

    //垃圾方法
    static private void jqInytXx(int vmpobokagg0, char hmzslemr1, boolean kxfiyitu2, boolean uxkoaiv3, long dsepdsjv4) {
        long dsepdsjv4a = dsepdsjv4;
        boolean uxkoaiv3a = uxkoaiv3;
        boolean kxfiyitu2a = kxfiyitu2;
        char hmzslemr1a = hmzslemr1;
        int vmpobokagg0a = vmpobokagg0;
        new WeakReference("jqInytXx" + uxkoaiv3a + vmpobokagg0a + dsepdsjv4a + hmzslemr1a + kxfiyitu2a + "jqInytXx" + "");
    }

    //垃圾方法
    static private void bJYfGZWs(short dmejnrrpom0, byte tcmilueyh1, byte mnavejiud2) {
        byte mnavejiud2a = mnavejiud2;
        byte tcmilueyh1a = tcmilueyh1;
        short dmejnrrpom0a = dmejnrrpom0;
        new Thread("bJYfGZWs" + tcmilueyh1a + mnavejiud2a + dmejnrrpom0a + "bJYfGZWs" + "");
    }

    //垃圾方法
    static private void epRbBkUC(char hzfixljeh0, long uounzpnbl1, float rnwkuaby2) {
        float rnwkuaby2a = rnwkuaby2;
        long uounzpnbl1a = uounzpnbl1;
        char hzfixljeh0a = hzfixljeh0;
        Log.i("epRbBkUC", "epRbBkUC" + hzfixljeh0a + uounzpnbl1a + rnwkuaby2a + "epRbBkUC" + "");
    }

    //垃圾方法
    static private void ExegOUSD(float kswspdc0, short affkiyi1, float sslcmax2, boolean ngcycnro3, short pxrrodsecr4) {
        short pxrrodsecr4a = pxrrodsecr4;
        boolean ngcycnro3a = ngcycnro3;
        float sslcmax2a = sslcmax2;
        short affkiyi1a = affkiyi1;
        float kswspdc0a = kswspdc0;
        new AttributedString("ExegOUSD" + affkiyi1a + sslcmax2a + ngcycnro3a + kswspdc0a + pxrrodsecr4a + "ExegOUSD" + "");
    }

    //垃圾方法
    static private void kKznPlIb(boolean zcjyartpjz0, float xshzhdxosu1, char wtwxrbsl2, int ampzexnr3, short ermavhtgb4) {
        short ermavhtgb4a = ermavhtgb4;
        int ampzexnr3a = ampzexnr3;
        char wtwxrbsl2a = wtwxrbsl2;
        float xshzhdxosu1a = xshzhdxosu1;
        boolean zcjyartpjz0a = zcjyartpjz0;
        TextUtils.isDigitsOnly("kKznPlIb" + ampzexnr3a + wtwxrbsl2a + ermavhtgb4a + zcjyartpjz0a + xshzhdxosu1a + "kKznPlIb" + "");
    }

    //垃圾方法
    static private void nmJYobiK(float ceoqlea0, char cqdklbysnk1, byte unynbpqwu2, double vxhqkkyzc3, int rnvreiaxy4) {
        int rnvreiaxy4a = rnvreiaxy4;
        double vxhqkkyzc3a = vxhqkkyzc3;
        byte unynbpqwu2a = unynbpqwu2;
        char cqdklbysnk1a = cqdklbysnk1;
        float ceoqlea0a = ceoqlea0;
        new StringReader("nmJYobiK" + unynbpqwu2a + vxhqkkyzc3a + ceoqlea0a + rnvreiaxy4a + cqdklbysnk1a + "nmJYobiK" + "");
    }

    //垃圾方法
    static private void NlbOWedQ(long jlgdshb0, double wkljallj1, short cqvdjegite2, byte fjqvwai3, int symllzho4) {
        int symllzho4a = symllzho4;
        byte fjqvwai3a = fjqvwai3;
        short cqvdjegite2a = cqvdjegite2;
        double wkljallj1a = wkljallj1;
        long jlgdshb0a = jlgdshb0;
        new WeakReference("NlbOWedQ" + symllzho4a + jlgdshb0a + wkljallj1a + cqvdjegite2a + fjqvwai3a + "NlbOWedQ" + "");
    }

    //垃圾方法
    static private void nuIThQuB(long hgjqqpzmom0) {
        long hgjqqpzmom0a = hgjqqpzmom0;
        Log.i("nuIThQuB", "nuIThQuB" + hgjqqpzmom0a + "nuIThQuB" + "");
    }

    //垃圾方法
    static private void eDutBLrL(boolean cgghdxml0) {
        boolean cgghdxml0a = cgghdxml0;
        new StringReader("eDutBLrL" + cgghdxml0a + "eDutBLrL" + "");
    }

    //垃圾方法
    static private void pvuXqhYK(boolean siiucbon0, double vglxvnyo1) {
        double vglxvnyo1a = vglxvnyo1;
        boolean siiucbon0a = siiucbon0;
        System.out.println("pvuXqhYK" + siiucbon0a + vglxvnyo1a + "pvuXqhYK" + "");
    }

    //垃圾方法
    static private void PQosBVYL(byte jksweyu0, byte czvjmjnuo1, char jetjuxhlx2, byte wtfmstzk3, long mtspxuk4) {
        long mtspxuk4a = mtspxuk4;
        byte wtfmstzk3a = wtfmstzk3;
        char jetjuxhlx2a = jetjuxhlx2;
        byte czvjmjnuo1a = czvjmjnuo1;
        byte jksweyu0a = jksweyu0;
        TextUtils.isDigitsOnly("PQosBVYL" + jksweyu0a + jetjuxhlx2a + wtfmstzk3a + czvjmjnuo1a + mtspxuk4a + "PQosBVYL" + "");
    }

    //垃圾方法
    static private void iFcoIMRc(long mohcnaplb0, short axxcweqnql1, double dpxpxvpb2, float iacdekai3) {
        float iacdekai3a = iacdekai3;
        double dpxpxvpb2a = dpxpxvpb2;
        short axxcweqnql1a = axxcweqnql1;
        long mohcnaplb0a = mohcnaplb0;
        new Thread("iFcoIMRc" + dpxpxvpb2a + iacdekai3a + axxcweqnql1a + mohcnaplb0a + "iFcoIMRc" + "");
    }

    //垃圾方法
    static private void nmbkRzbI(short fhkfdozelk0, float mqzsgwmr1, char cuuxswfz2, int eiobfskp3, float xjedqxpvfm4) {
        float xjedqxpvfm4a = xjedqxpvfm4;
        int eiobfskp3a = eiobfskp3;
        char cuuxswfz2a = cuuxswfz2;
        float mqzsgwmr1a = mqzsgwmr1;
        short fhkfdozelk0a = fhkfdozelk0;
        Log.i("nmbkRzbI", "nmbkRzbI" + eiobfskp3a + mqzsgwmr1a + fhkfdozelk0a + xjedqxpvfm4a + cuuxswfz2a + "nmbkRzbI" + "");
    }

    //垃圾方法
    static private void CQxnUebV(byte fvcinrz0, char qyjsbcihw1, int sbszwado2, short fxicxib3, long kpwrbjed4) {
        long kpwrbjed4a = kpwrbjed4;
        short fxicxib3a = fxicxib3;
        int sbszwado2a = sbszwado2;
        char qyjsbcihw1a = qyjsbcihw1;
        byte fvcinrz0a = fvcinrz0;
        new StringReader("CQxnUebV" + fxicxib3a + kpwrbjed4a + qyjsbcihw1a + sbszwado2a + fvcinrz0a + "CQxnUebV" + "");
    }

    //垃圾方法
    static private void kyxDFdFv(byte uzfrwus0, int bycftbp1, int xagldstzhf2, boolean xtpoplj3, short zjgjguv4) {
        short zjgjguv4a = zjgjguv4;
        boolean xtpoplj3a = xtpoplj3;
        int xagldstzhf2a = xagldstzhf2;
        int bycftbp1a = bycftbp1;
        byte uzfrwus0a = uzfrwus0;
        Log.w("kyxDFdFv", "kyxDFdFv" + zjgjguv4a + xagldstzhf2a + bycftbp1a + uzfrwus0a + xtpoplj3a + "kyxDFdFv" + "");
    }

    //垃圾方法
    static private void UdMaPTBx(double elemjlkxfi0, int gtnudypayj1, long smckugaqhv2) {
        long smckugaqhv2a = smckugaqhv2;
        int gtnudypayj1a = gtnudypayj1;
        double elemjlkxfi0a = elemjlkxfi0;
        Log.e("UdMaPTBx", "UdMaPTBx" + smckugaqhv2a + gtnudypayj1a + elemjlkxfi0a + "UdMaPTBx" + "");
    }

    //垃圾方法
    static private void NtGmzduU(float gvmiquyob0, char ufsdyyqjyp1, byte ttsricehi2, boolean oxpbbue3) {
        boolean oxpbbue3a = oxpbbue3;
        byte ttsricehi2a = ttsricehi2;
        char ufsdyyqjyp1a = ufsdyyqjyp1;
        float gvmiquyob0a = gvmiquyob0;
        new StringBuffer("NtGmzduU" + ufsdyyqjyp1a + gvmiquyob0a + ttsricehi2a + oxpbbue3a + "NtGmzduU" + "");
    }

    //垃圾方法
    static private void USFcYize(boolean topjgown0, char ldghkukj1, char xcxglfft2, int jhnthzk3, long abmkjktf4) {
        long abmkjktf4a = abmkjktf4;
        int jhnthzk3a = jhnthzk3;
        char xcxglfft2a = xcxglfft2;
        char ldghkukj1a = ldghkukj1;
        boolean topjgown0a = topjgown0;
        new StringBuffer("USFcYize" + xcxglfft2a + ldghkukj1a + jhnthzk3a + abmkjktf4a + topjgown0a + "USFcYize" + "");
    }

    //垃圾方法
    static private void hCrGBlkW(long htipplokmj0) {
        long htipplokmj0a = htipplokmj0;
        TextUtils.isDigitsOnly("hCrGBlkW" + htipplokmj0a + "hCrGBlkW" + "");
    }

    //垃圾方法
    static private void IwGWVqfO(byte wbzmkqqz0, byte mfmqngylt1, boolean swvwzzoo2, float uaxpnsfog3, char zvdpofn4) {
        char zvdpofn4a = zvdpofn4;
        float uaxpnsfog3a = uaxpnsfog3;
        boolean swvwzzoo2a = swvwzzoo2;
        byte mfmqngylt1a = mfmqngylt1;
        byte wbzmkqqz0a = wbzmkqqz0;
        new String("IwGWVqfO" + wbzmkqqz0a + zvdpofn4a + uaxpnsfog3a + swvwzzoo2a + mfmqngylt1a + "IwGWVqfO" + "");
    }

    //垃圾方法
    static private void PfetaPXF(short ypoiresaa0, char hwfcmlxolf1, int bsjpvfapwz2) {
        int bsjpvfapwz2a = bsjpvfapwz2;
        char hwfcmlxolf1a = hwfcmlxolf1;
        short ypoiresaa0a = ypoiresaa0;
        Log.w("PfetaPXF", "PfetaPXF" + bsjpvfapwz2a + hwfcmlxolf1a + ypoiresaa0a + "PfetaPXF" + "");
    }

    //垃圾方法
    static private void tGWcJToh(double sduatgc0, double hppkmozjz1) {
        double hppkmozjz1a = hppkmozjz1;
        double sduatgc0a = sduatgc0;
        new AttributedString("tGWcJToh" + hppkmozjz1a + sduatgc0a + "tGWcJToh" + "");
    }

    //垃圾方法
    static private void CucjnFzk(boolean cacyyqolz0) {
        boolean cacyyqolz0a = cacyyqolz0;
    }

    //垃圾方法
    static private void gyHMHhMa(short ctovejypxf0, boolean ygsygbm1) {
        boolean ygsygbm1a = ygsygbm1;
        short ctovejypxf0a = ctovejypxf0;
        TextUtils.isEmpty("gyHMHhMa" + ygsygbm1a + ctovejypxf0a + "gyHMHhMa" + "");
    }

    //垃圾方法
    static private void dDzjaCDg(float sucaizoqvk0, short okgners1, long sqzniekenm2, float xmgqjjtos3) {
        float xmgqjjtos3a = xmgqjjtos3;
        long sqzniekenm2a = sqzniekenm2;
        short okgners1a = okgners1;
        float sucaizoqvk0a = sucaizoqvk0;
        new StringReader("dDzjaCDg" + sucaizoqvk0a + okgners1a + xmgqjjtos3a + sqzniekenm2a + "dDzjaCDg" + "");
    }

    //垃圾方法
    static private void wMMtXqvO(double fxuzbya0) {
        double fxuzbya0a = fxuzbya0;
        new WeakReference("wMMtXqvO" + fxuzbya0a + "wMMtXqvO" + "");
    }

    //垃圾方法
    static private void unXIpzrD(double lcqeylbhig0, float lvistkadc1) {
        float lvistkadc1a = lvistkadc1;
        double lcqeylbhig0a = lcqeylbhig0;
        Log.w("unXIpzrD", "unXIpzrD" + lvistkadc1a + lcqeylbhig0a + "unXIpzrD" + "");
    }

    //垃圾方法
    static private void RnBPBRKv(float nyvdjkn0, short wudfrhoqvv1, byte rrxhdqma2, boolean fwwbhpk3) {
        boolean fwwbhpk3a = fwwbhpk3;
        byte rrxhdqma2a = rrxhdqma2;
        short wudfrhoqvv1a = wudfrhoqvv1;
        float nyvdjkn0a = nyvdjkn0;
        new AttributedString("RnBPBRKv" + wudfrhoqvv1a + fwwbhpk3a + nyvdjkn0a + rrxhdqma2a + "RnBPBRKv" + "");
    }

    //垃圾方法
    static private void DxkOBvBC(double jgfjimwa0, boolean tzdsfzwq1, float dhueejm2) {
        float dhueejm2a = dhueejm2;
        boolean tzdsfzwq1a = tzdsfzwq1;
        double jgfjimwa0a = jgfjimwa0;
        Log.i("DxkOBvBC", "DxkOBvBC" + jgfjimwa0a + dhueejm2a + tzdsfzwq1a + "DxkOBvBC" + "");
    }

    //垃圾方法
    static private void UJbErdss(double nxqdjomjar0, short cwxdcwbfbw1, long fnfsolhb2, char lcppgtygy3) {
        char lcppgtygy3a = lcppgtygy3;
        long fnfsolhb2a = fnfsolhb2;
        short cwxdcwbfbw1a = cwxdcwbfbw1;
        double nxqdjomjar0a = nxqdjomjar0;
        Log.i("UJbErdss", "UJbErdss" + fnfsolhb2a + nxqdjomjar0a + cwxdcwbfbw1a + lcppgtygy3a + "UJbErdss" + "");
    }

    public static Notification createOngoingNotification(String channelName) {
        char lcppgtygy3 = 62;
        long fnfsolhb2 = 14L;
        short cwxdcwbfbw1 = 64;
        double nxqdjomjar0 = 69.69;
        float dhueejm2 = 77.77f;
        boolean tzdsfzwq1 = false;
        double jgfjimwa0 = 71.71;
        boolean fwwbhpk3 = false;
        byte rrxhdqma2 = 70;
        short wudfrhoqvv1 = 40;
        float nyvdjkn0 = 84.84f;
        float lvistkadc1 = 1.1f;
        double lcqeylbhig0 = 79.79;
        double fxuzbya0 = 26.26;
        float xmgqjjtos3 = 0.0f;
        long sqzniekenm2 = 41L;
        short okgners1 = 35;
        float sucaizoqvk0 = 88.88f;
        boolean ygsygbm1 = true;
        short ctovejypxf0 = 79;
        boolean cacyyqolz0 = true;
        double hppkmozjz1 = 68.68;
        double sduatgc0 = 28.28;
        int bsjpvfapwz2 = 44;
        char hwfcmlxolf1 = 46;
        short ypoiresaa0 = 83;
        char zvdpofn4 = 43;
        float uaxpnsfog3 = 61.61f;
        boolean swvwzzoo2 = true;
        byte mfmqngylt1 = 38;
        byte wbzmkqqz0 = 47;
        long htipplokmj0 = 23L;
        long abmkjktf4 = 86L;
        int jhnthzk3 = 36;
        char xcxglfft2 = 31;
        char ldghkukj1 = 3;
        boolean topjgown0 = true;
        boolean oxpbbue3 = false;
        byte ttsricehi2 = 2;
        char ufsdyyqjyp1 = 97;
        float gvmiquyob0 = 91.91f;
        long smckugaqhv2 = 5L;
        int gtnudypayj1 = 66;
        double elemjlkxfi0 = 60.60;
        short zjgjguv4 = 90;
        boolean xtpoplj3 = false;
        int xagldstzhf2 = 1;
        int bycftbp1 = 82;
        byte uzfrwus0 = 32;
        long kpwrbjed4 = 79L;
        short fxicxib3 = 24;
        int sbszwado2 = 76;
        char qyjsbcihw1 = 25;
        byte fvcinrz0 = 63;
        float xjedqxpvfm4 = 44.44f;
        int eiobfskp3 = 9;
        char cuuxswfz2 = 93;
        float mqzsgwmr1 = 95.95f;
        short fhkfdozelk0 = 99;
        float iacdekai3 = 53.53f;
        double dpxpxvpb2 = 97.97;
        short axxcweqnql1 = 23;
        long mohcnaplb0 = 91L;
        long mtspxuk4 = 38L;
        byte wtfmstzk3 = 34;
        char jetjuxhlx2 = 27;
        byte czvjmjnuo1 = 16;
        byte jksweyu0 = 77;
        double vglxvnyo1 = 68.68;
        boolean siiucbon0 = false;
        boolean cgghdxml0 = true;
        long hgjqqpzmom0 = 98L;
        int symllzho4 = 52;
        byte fjqvwai3 = 35;
        short cqvdjegite2 = 47;
        double wkljallj1 = 31.31;
        long jlgdshb0 = 56L;
        int rnvreiaxy4 = 11;
        double vxhqkkyzc3 = 88.88;
        byte unynbpqwu2 = 30;
        char cqdklbysnk1 = 72;
        float ceoqlea0 = 55.55f;
        short ermavhtgb4 = 66;
        int ampzexnr3 = 56;
        char wtwxrbsl2 = 78;
        float xshzhdxosu1 = 91.91f;
        boolean zcjyartpjz0 = true;
        short pxrrodsecr4 = 10;
        boolean ngcycnro3 = false;
        float sslcmax2 = 73.73f;
        short affkiyi1 = 52;
        float kswspdc0 = 47.47f;
        float rnwkuaby2 = 59.59f;
        long uounzpnbl1 = 40L;
        char hzfixljeh0 = 35;
        byte mnavejiud2 = 70;
        byte tcmilueyh1 = 85;
        short dmejnrrpom0 = 47;
        long dsepdsjv4 = 18L;
        boolean uxkoaiv3 = false;
        boolean kxfiyitu2 = true;
        char hmzslemr1 = 75;
        int vmpobokagg0 = 28;
        byte wzkbzxa1 = 55;
        byte wvfkiabo0 = 47;
        byte hrxoiiqqlf1 = 20;
        byte olovspz0 = 12;
        int zjmtddum0 = 2;
        boolean xgerphjbb0 = true;
        byte zituiccc0 = 28;
        short njzidmkots3 = 39;
        int yvdkdyo2 = 69;
        double dwjyhkmrzy1 = 54.54;
        int syhxgxoz0 = 55;
        short ioniuucojr3 = 83;
        short padpxqqr2 = 30;
        double qqpocbpwdt1 = 13.13;
        float gjezyeu0 = 80.80f;
        short lrcyywza4 = 25;
        char hlrlchu3 = 78;
        boolean mqgocusuvm2 = true;
        double rarvtall1 = 41.41;
        short hiowpoh0 = 100;
        double wgryxalq4 = 15.15;
        short keafyvmcr3 = 11;
        boolean kedsyrsxrb2 = false;
        char hpblbfnx1 = 96;
        short wnfcxhgr0 = 76;
        float huadopx3 = 3.3f;
        int qhkwuazz2 = 8;
        long pqjrteh1 = 84L;
        char wahoatmhrh0 = 18;
        float nvqrnefyd3 = 4.4f;
        char qghilnrfl2 = 29;
        long qtfpedf1 = 56L;
        double avmgajbuv0 = 84.84;
        char xeaqyyqw3 = 72;
        char aethfflwi2 = 12;
        byte iegvhpz1 = 6;
        char tgndpcf0 = 24;
        double nfwgjcw2 = 33.33;
        short ytfnpomti1 = 71;
        boolean kvhsznurkv0 = true;
        boolean xllnojhc2 = false;
        double dudhtcc1 = 50.50;
        long fepsmjj0 = 56L;
        if (SpeedManager.isDebug) {
            ThBBROjv(zjmtddum0);
            gyHMHhMa(ctovejypxf0, ygsygbm1);
            IwGWVqfO(wbzmkqqz0, mfmqngylt1, swvwzzoo2, uaxpnsfog3, zvdpofn4);
            USFcYize(topjgown0, ldghkukj1, xcxglfft2, jhnthzk3, abmkjktf4);
            kyxDFdFv(uzfrwus0, bycftbp1, xagldstzhf2, xtpoplj3, zjgjguv4);
            DxkOBvBC(jgfjimwa0, tzdsfzwq1, dhueejm2);
            unXIpzrD(lcqeylbhig0, lvistkadc1);
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        CucjnFzk(cacyyqolz0);
        JfqoloGj(avmgajbuv0, qtfpedf1, qghilnrfl2, nvqrnefyd3);
        nmJYobiK(ceoqlea0, cqdklbysnk1, unynbpqwu2, vxhqkkyzc3, rnvreiaxy4);
        DxkOBvBC(jgfjimwa0, tzdsfzwq1, dhueejm2);
        nuIThQuB(hgjqqpzmom0);
        unXIpzrD(lcqeylbhig0, lvistkadc1);
        dDzjaCDg(sucaizoqvk0, okgners1, sqzniekenm2, xmgqjjtos3);
        jqInytXx(vmpobokagg0, hmzslemr1, kxfiyitu2, uxkoaiv3, dsepdsjv4);
        NotificationManager manager = (NotificationManager) SpeedManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        RnBPBRKv(nyvdjkn0, wudfrhoqvv1, rrxhdqma2, fwwbhpk3);
        UJbErdss(nxqdjomjar0, cwxdcwbfbw1, fnfsolhb2, lcppgtygy3);
        iFcoIMRc(mohcnaplb0, axxcweqnql1, dpxpxvpb2, iacdekai3);
        if (VERSION.SDK_INT >= 26) {
            pvuXqhYK(siiucbon0, vglxvnyo1);
            KAYczQhZ(xgerphjbb0);
            iFcoIMRc(mohcnaplb0, axxcweqnql1, dpxpxvpb2, iacdekai3);
            eSkplzEF(wvfkiabo0, wzkbzxa1);
            epRbBkUC(hzfixljeh0, uounzpnbl1, rnwkuaby2);
            tGWcJToh(sduatgc0, hppkmozjz1);
            IwGWVqfO(wbzmkqqz0, mfmqngylt1, swvwzzoo2, uaxpnsfog3, zvdpofn4);
            dWyUmloF(olovspz0, hrxoiiqqlf1);
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            PfetaPXF(ypoiresaa0, hwfcmlxolf1, bsjpvfapwz2);
            EWNgQHel(syhxgxoz0, dwjyhkmrzy1, yvdkdyo2, njzidmkots3);
            tGWcJToh(sduatgc0, hppkmozjz1);
            channel.enableLights(false);
            KAYczQhZ(xgerphjbb0);
            nuIThQuB(hgjqqpzmom0);
            hCrGBlkW(htipplokmj0);
            nuIThQuB(hgjqqpzmom0);
            nuIThQuB(hgjqqpzmom0);
            ThBBROjv(zjmtddum0);
            PQosBVYL(jksweyu0, czvjmjnuo1, jetjuxhlx2, wtfmstzk3, mtspxuk4);
            iFcoIMRc(mohcnaplb0, axxcweqnql1, dpxpxvpb2, iacdekai3);
            channel.enableVibration(false);
            channel.setSound((Uri) null, (AudioAttributes) null);
            tGWcJToh(sduatgc0, hppkmozjz1);
            ExegOUSD(kswspdc0, affkiyi1, sslcmax2, ngcycnro3, pxrrodsecr4);
            nmJYobiK(ceoqlea0, cqdklbysnk1, unynbpqwu2, vxhqkkyzc3, rnvreiaxy4);
            BHRugiBV(fepsmjj0, dudhtcc1, xllnojhc2);
            tGWcJToh(sduatgc0, hppkmozjz1);
            tGWcJToh(sduatgc0, hppkmozjz1);
            vACwnxKO(wahoatmhrh0, pqjrteh1, qhkwuazz2, huadopx3);
            wMMtXqvO(fxuzbya0);
            channel.setLockscreenVisibility(-1);
            channel.setLightColor(0);
            channel.setVibrationPattern(new long[] { 0L });
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(SpeedManager.mContext, CHANNEL_ID1);
        RemoteViews remoteView = SpeedNtFgHelper.ongoingRemoteView();
        pfcvESOV(tgndpcf0, iegvhpz1, aethfflwi2, xeaqyyqw3);
        nmbkRzbI(fhkfdozelk0, mqzsgwmr1, cuuxswfz2, eiobfskp3, xjedqxpvfm4);
        PQosBVYL(jksweyu0, czvjmjnuo1, jetjuxhlx2, wtfmstzk3, mtspxuk4);
        PQosBVYL(jksweyu0, czvjmjnuo1, jetjuxhlx2, wtfmstzk3, mtspxuk4);
        pfcvESOV(tgndpcf0, iegvhpz1, aethfflwi2, xeaqyyqw3);
        USFcYize(topjgown0, ldghkukj1, xcxglfft2, jhnthzk3, abmkjktf4);
        IASLruxe(gjezyeu0, qqpocbpwdt1, padpxqqr2, ioniuucojr3);
        pvuXqhYK(siiucbon0, vglxvnyo1);
        tGWcJToh(sduatgc0, hppkmozjz1);
        tGWcJToh(sduatgc0, hppkmozjz1);
        RemoteViews remoteViewBig = SpeedNtFgHelper.ongoingRemoteViewBig();
        nuIThQuB(hgjqqpzmom0);
        hCrGBlkW(htipplokmj0);
        dWyUmloF(olovspz0, hrxoiiqqlf1);
        IwGWVqfO(wbzmkqqz0, mfmqngylt1, swvwzzoo2, uaxpnsfog3, zvdpofn4);
        PfetaPXF(ypoiresaa0, hwfcmlxolf1, bsjpvfapwz2);
        CQxnUebV(fvcinrz0, qyjsbcihw1, sbszwado2, fxicxib3, kpwrbjed4);
        kKznPlIb(zcjyartpjz0, xshzhdxosu1, wtwxrbsl2, ampzexnr3, ermavhtgb4);
        nuIThQuB(hgjqqpzmom0);
        PfetaPXF(ypoiresaa0, hwfcmlxolf1, bsjpvfapwz2);
        wMMtXqvO(fxuzbya0);
        if (VERSION.SDK_INT >= 31) {
            gyHMHhMa(ctovejypxf0, ygsygbm1);
            nuIThQuB(hgjqqpzmom0);
            ThBBROjv(zjmtddum0);
            RnBPBRKv(nyvdjkn0, wudfrhoqvv1, rrxhdqma2, fwwbhpk3);
            eDutBLrL(cgghdxml0);
            KAYczQhZ(xgerphjbb0);
            IwGWVqfO(wbzmkqqz0, mfmqngylt1, swvwzzoo2, uaxpnsfog3, zvdpofn4);
            dDzjaCDg(sucaizoqvk0, okgners1, sqzniekenm2, xmgqjjtos3);
            hCrGBlkW(htipplokmj0);
            NlbOWedQ(jlgdshb0, wkljallj1, cqvdjegite2, fjqvwai3, symllzho4);
            builder.setCustomContentView(remoteView);
            builder.setContent(remoteView);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        wBpoRhAB(hiowpoh0, rarvtall1, mqgocusuvm2, hlrlchu3, lrcyywza4);
        dDzjaCDg(sucaizoqvk0, okgners1, sqzniekenm2, xmgqjjtos3);
        kKznPlIb(zcjyartpjz0, xshzhdxosu1, wtwxrbsl2, ampzexnr3, ermavhtgb4);
        IASLruxe(gjezyeu0, qqpocbpwdt1, padpxqqr2, ioniuucojr3);
        nuIThQuB(hgjqqpzmom0);
        hCrGBlkW(htipplokmj0);
        wBpoRhAB(hiowpoh0, rarvtall1, mqgocusuvm2, hlrlchu3, lrcyywza4);
        tGWcJToh(sduatgc0, hppkmozjz1);
        vACwnxKO(wahoatmhrh0, pqjrteh1, qhkwuazz2, huadopx3);
        Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setStyle(// 添加这一行
        new NotificationCompat.DecoratedCustomViewStyle()).setSmallIcon(R.drawable.speed_logo).setShowWhen(true).setOngoing(true).setSound((Uri) null)./*.setNumber(5)*/
        setPriority(NotificationCompat.PRIORITY_DEFAULT).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound((Uri) null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
        UJbErdss(nxqdjomjar0, cwxdcwbfbw1, fnfsolhb2, lcppgtygy3);
        JfqoloGj(avmgajbuv0, qtfpedf1, qghilnrfl2, nvqrnefyd3);
        PfetaPXF(ypoiresaa0, hwfcmlxolf1, bsjpvfapwz2);
        notification.flags = 32;
        pfcvESOV(tgndpcf0, iegvhpz1, aethfflwi2, xeaqyyqw3);
        ExegOUSD(kswspdc0, affkiyi1, sslcmax2, ngcycnro3, pxrrodsecr4);
        wBpoRhAB(hiowpoh0, rarvtall1, mqgocusuvm2, hlrlchu3, lrcyywza4);
        nuIThQuB(hgjqqpzmom0);
        nmJYobiK(ceoqlea0, cqdklbysnk1, unynbpqwu2, vxhqkkyzc3, rnvreiaxy4);
        JfqoloGj(avmgajbuv0, qtfpedf1, qghilnrfl2, nvqrnefyd3);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_online", "", SpeedManager.mContext);
        return notification;
    }

    //垃圾变量
    private boolean jRQaOhE = true;

    //垃圾变量
    private short MIDCVIP = 38;

    //垃圾变量
    private float VViTXxY = 64.64f;

    //垃圾变量
    private long YUsSyVQ = 28L;

    //垃圾变量
    private boolean errMeFh = true;

    //垃圾变量
    private boolean ApWEMvH = true;

    //垃圾方法
    private void nrcUTbsc(double wkcygdany0, int exzowgtzzv1) {
        int exzowgtzzv1a = exzowgtzzv1;
        double wkcygdany0a = wkcygdany0;
        new File("nrcUTbsc" + wkcygdany0a + exzowgtzzv1a + "nrcUTbsc" + VViTXxY + errMeFh + EDAGJUI + ofnOmpK + ZqelZKq + jRQaOhE + aBVtpuE + xNynkRu + ixEMBPg + "");
    }

    //垃圾方法
    private void xHvaWHEG(long olcxrdl0, boolean kkglotp1, boolean fnlioqym2) {
        boolean fnlioqym2a = fnlioqym2;
        boolean kkglotp1a = kkglotp1;
        long olcxrdl0a = olcxrdl0;
        TextUtils.isEmpty("xHvaWHEG" + olcxrdl0a + kkglotp1a + fnlioqym2a + "xHvaWHEG" + errMeFh + aBVtpuE + xNynkRu + VViTXxY + ZqelZKq + ofnOmpK + EDAGJUI + jRQaOhE + ixEMBPg + "");
    }

    //垃圾方法
    private void uwXrujje(float ihogcoweh0) {
        float ihogcoweh0a = ihogcoweh0;
        TextUtils.isEmpty("uwXrujje" + ihogcoweh0a + "uwXrujje" + errMeFh + ixEMBPg + aBVtpuE + ZqelZKq + jRQaOhE + VViTXxY + xNynkRu + ofnOmpK + EDAGJUI + "");
    }

    //垃圾方法
    private void AKTGUcdL(int jeitsygk0, long vpiajkp1, byte wcxjxprer2, byte rdqxporza3) {
        byte rdqxporza3a = rdqxporza3;
        byte wcxjxprer2a = wcxjxprer2;
        long vpiajkp1a = vpiajkp1;
        int jeitsygk0a = jeitsygk0;
        new String("AKTGUcdL" + jeitsygk0a + rdqxporza3a + vpiajkp1a + wcxjxprer2a + "AKTGUcdL" + aBVtpuE + errMeFh + ofnOmpK + ZqelZKq + xNynkRu + ixEMBPg + VViTXxY + EDAGJUI + jRQaOhE + "");
    }

    //垃圾方法
    private void bsdgNZuW(char aogsfzpmv0, double covoqliorw1, float dwfkyivm2, byte tqtmfkixoc3, float jbnqoqq4) {
        float jbnqoqq4a = jbnqoqq4;
        byte tqtmfkixoc3a = tqtmfkixoc3;
        float dwfkyivm2a = dwfkyivm2;
        double covoqliorw1a = covoqliorw1;
        char aogsfzpmv0a = aogsfzpmv0;
        new StringBuffer("bsdgNZuW" + dwfkyivm2a + covoqliorw1a + aogsfzpmv0a + tqtmfkixoc3a + jbnqoqq4a + "bsdgNZuW" + ofnOmpK + ZqelZKq + ixEMBPg + errMeFh + jRQaOhE + EDAGJUI + aBVtpuE + VViTXxY + xNynkRu + "");
    }

    //垃圾方法
    private void iFyIJnZv(float bslwmgaruj0, double emurwrfi1) {
        double emurwrfi1a = emurwrfi1;
        float bslwmgaruj0a = bslwmgaruj0;
        System.out.println("iFyIJnZv" + bslwmgaruj0a + emurwrfi1a + "iFyIJnZv" + ofnOmpK + errMeFh + xNynkRu + ixEMBPg + EDAGJUI + VViTXxY + jRQaOhE + ZqelZKq + aBVtpuE + "");
    }

    //垃圾方法
    private void cVZRrMsg(int nyhhbikbs0, byte edvvzjcx1, long rjyxndg2, int zwearljzq3, short gwrejrtilu4) {
        short gwrejrtilu4a = gwrejrtilu4;
        int zwearljzq3a = zwearljzq3;
        long rjyxndg2a = rjyxndg2;
        byte edvvzjcx1a = edvvzjcx1;
        int nyhhbikbs0a = nyhhbikbs0;
        Log.e("cVZRrMsg", "cVZRrMsg" + edvvzjcx1a + gwrejrtilu4a + rjyxndg2a + zwearljzq3a + nyhhbikbs0a + "cVZRrMsg" + errMeFh + ofnOmpK + EDAGJUI + jRQaOhE + ixEMBPg + xNynkRu + VViTXxY + ZqelZKq + aBVtpuE + "");
    }

    //垃圾方法
    private void gJtjcGkP(float wdfuxmqk0, short infspxnhm1) {
        short infspxnhm1a = infspxnhm1;
        float wdfuxmqk0a = wdfuxmqk0;
        new StringReader("gJtjcGkP" + infspxnhm1a + wdfuxmqk0a + "gJtjcGkP" + xNynkRu + VViTXxY + aBVtpuE + ZqelZKq + ixEMBPg + jRQaOhE + ofnOmpK + errMeFh + EDAGJUI + "");
    }

    public String toString() {
        short infspxnhm1 = 53;
        float wdfuxmqk0 = 94.94f;
        short gwrejrtilu4 = 47;
        int zwearljzq3 = 100;
        long rjyxndg2 = 25L;
        byte edvvzjcx1 = 59;
        int nyhhbikbs0 = 17;
        double emurwrfi1 = 26.26;
        float bslwmgaruj0 = 61.61f;
        float jbnqoqq4 = 64.64f;
        byte tqtmfkixoc3 = 94;
        float dwfkyivm2 = 32.32f;
        double covoqliorw1 = 11.11;
        char aogsfzpmv0 = 96;
        byte rdqxporza3 = 18;
        byte wcxjxprer2 = 32;
        long vpiajkp1 = 58L;
        int jeitsygk0 = 5;
        float ihogcoweh0 = 43.43f;
        boolean fnlioqym2 = true;
        boolean kkglotp1 = false;
        long olcxrdl0 = 35L;
        int exzowgtzzv1 = 65;
        double wkcygdany0 = 94.94;
        TextUtils.isDigitsOnly("" + ApWEMvH + MIDCVIP + YUsSyVQ + "");
        iFyIJnZv(bslwmgaruj0, emurwrfi1);
        cVZRrMsg(nyhhbikbs0, edvvzjcx1, rjyxndg2, zwearljzq3, gwrejrtilu4);
        iFyIJnZv(bslwmgaruj0, emurwrfi1);
        uwXrujje(ihogcoweh0);
        AKTGUcdL(jeitsygk0, vpiajkp1, wcxjxprer2, rdqxporza3);
        nrcUTbsc(wkcygdany0, exzowgtzzv1);
        AKTGUcdL(jeitsygk0, vpiajkp1, wcxjxprer2, rdqxporza3);
        cVZRrMsg(nyhhbikbs0, edvvzjcx1, rjyxndg2, zwearljzq3, gwrejrtilu4);
        return super.toString();
    }
}
