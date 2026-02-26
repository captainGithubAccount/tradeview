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
    private byte PdVUekD = 36;

    static boolean isLiving;

    //垃圾变量
    private int PQTSeYH = 93;

    static boolean isShowing;

    //垃圾变量
    private int PvPsyvQ = 46;

    static String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private long PYvAftg = 12L;

    static String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private short QNBvPIC = 68;

    static int Notification_ID1 = 9745125;

    //垃圾变量
    private byte QBldRMb = 25;

    //clock  job  launchapp  everytime_show_notify(每次通知展示的时候)
    static String from = "action_from";

    public SpeedNtFgService() {
    }

    //垃圾方法
    static private void mdBTmatK(double ilvoibpvo0, float oemishfm1, float bchgyqy2, long egetkofs3) {
        long egetkofs3a = egetkofs3;
        float bchgyqy2a = bchgyqy2;
        float oemishfm1a = oemishfm1;
        double ilvoibpvo0a = ilvoibpvo0;
        Log.w("mdBTmatK", "mdBTmatK" + bchgyqy2a + ilvoibpvo0a + egetkofs3a + oemishfm1a + "mdBTmatK" + "");
    }

    //垃圾方法
    static private void xCCuGuLJ(long bozqzquaqe0, double byibdwgr1, boolean goypkipe2, byte oclgvwa3) {
        byte oclgvwa3a = oclgvwa3;
        boolean goypkipe2a = goypkipe2;
        double byibdwgr1a = byibdwgr1;
        long bozqzquaqe0a = bozqzquaqe0;
        Log.i("xCCuGuLJ", "xCCuGuLJ" + goypkipe2a + oclgvwa3a + bozqzquaqe0a + byibdwgr1a + "xCCuGuLJ" + "");
    }

    //垃圾方法
    static private void KvGBkorD(char vqkbzosdt0, float uzarhpv1, long fzsbznb2, float zfqfsckzf3, short ticfxiud4) {
        short ticfxiud4a = ticfxiud4;
        float zfqfsckzf3a = zfqfsckzf3;
        long fzsbznb2a = fzsbznb2;
        float uzarhpv1a = uzarhpv1;
        char vqkbzosdt0a = vqkbzosdt0;
        System.out.println("KvGBkorD" + ticfxiud4a + uzarhpv1a + vqkbzosdt0a + zfqfsckzf3a + fzsbznb2a + "KvGBkorD" + "");
    }

    //垃圾方法
    static private void ZbJGZnsX(double qkbdflelcv0) {
        double qkbdflelcv0a = qkbdflelcv0;
        TextUtils.isEmpty("ZbJGZnsX" + qkbdflelcv0a + "ZbJGZnsX" + "");
    }

    public static boolean getIsShowing() {
        double qkbdflelcv0 = 30.30;
        short ticfxiud4 = 2;
        float zfqfsckzf3 = 90.90f;
        long fzsbznb2 = 0L;
        float uzarhpv1 = 96.96f;
        char vqkbzosdt0 = 14;
        byte oclgvwa3 = 58;
        boolean goypkipe2 = false;
        double byibdwgr1 = 74.74;
        long bozqzquaqe0 = 34L;
        long egetkofs3 = 24L;
        float bchgyqy2 = 52.52f;
        float oemishfm1 = 9.9f;
        double ilvoibpvo0 = 37.37;
        xCCuGuLJ(bozqzquaqe0, byibdwgr1, goypkipe2, oclgvwa3);
        mdBTmatK(ilvoibpvo0, oemishfm1, bchgyqy2, egetkofs3);
        xCCuGuLJ(bozqzquaqe0, byibdwgr1, goypkipe2, oclgvwa3);
        ZbJGZnsX(qkbdflelcv0);
        xCCuGuLJ(bozqzquaqe0, byibdwgr1, goypkipe2, oclgvwa3);
        mdBTmatK(ilvoibpvo0, oemishfm1, bchgyqy2, egetkofs3);
        ZbJGZnsX(qkbdflelcv0);
        mdBTmatK(ilvoibpvo0, oemishfm1, bchgyqy2, egetkofs3);
        KvGBkorD(vqkbzosdt0, uzarhpv1, fzsbznb2, zfqfsckzf3, ticfxiud4);
        KvGBkorD(vqkbzosdt0, uzarhpv1, fzsbznb2, zfqfsckzf3, ticfxiud4);
        return isShowing;
    }

    //垃圾方法
    static private void UjKPDqsh(int hjaspcu0) {
        int hjaspcu0a = hjaspcu0;
        new WeakReference("UjKPDqsh" + hjaspcu0a + "UjKPDqsh" + "");
    }

    //垃圾方法
    static private void zMJHyRPk(long lhkromd0, double oilrrwtg1) {
        double oilrrwtg1a = oilrrwtg1;
        long lhkromd0a = lhkromd0;
        new WeakReference("zMJHyRPk" + lhkromd0a + oilrrwtg1a + "zMJHyRPk" + "");
    }

    //垃圾方法
    static private void PqtMBuMN(short maagcuv0) {
        short maagcuv0a = maagcuv0;
        new Thread("PqtMBuMN" + maagcuv0a + "PqtMBuMN" + "");
    }

    //垃圾方法
    static private void KKRLTBzR(float qskrbme0, short mspbwbpb1) {
        short mspbwbpb1a = mspbwbpb1;
        float qskrbme0a = qskrbme0;
        TextUtils.isDigitsOnly("KKRLTBzR" + qskrbme0a + mspbwbpb1a + "KKRLTBzR" + "");
    }

    public static void startNotifyService(boolean isFromActivity, String from) {
        short mspbwbpb1 = 83;
        float qskrbme0 = 19.19f;
        short maagcuv0 = 51;
        double oilrrwtg1 = 66.66;
        long lhkromd0 = 18L;
        int hjaspcu0 = 40;
        try {
            PqtMBuMN(maagcuv0);
            KKRLTBzR(qskrbme0, mspbwbpb1);
            PqtMBuMN(maagcuv0);
            zMJHyRPk(lhkromd0, oilrrwtg1);
            zMJHyRPk(lhkromd0, oilrrwtg1);
            Context context = SpeedManager.mContext;
            KKRLTBzR(qskrbme0, mspbwbpb1);
            zMJHyRPk(lhkromd0, oilrrwtg1);
            KKRLTBzR(qskrbme0, mspbwbpb1);
            PqtMBuMN(maagcuv0);
            PqtMBuMN(maagcuv0);
            UjKPDqsh(hjaspcu0);
            zMJHyRPk(lhkromd0, oilrrwtg1);
            PqtMBuMN(maagcuv0);
            Intent intent = new Intent(context, SpeedNtFgService.class);
            intent.putExtra(SpeedNtFgService.from, from);
            KKRLTBzR(qskrbme0, mspbwbpb1);
            KKRLTBzR(qskrbme0, mspbwbpb1);
            UjKPDqsh(hjaspcu0);
            UjKPDqsh(hjaspcu0);
            zMJHyRPk(lhkromd0, oilrrwtg1);
            PqtMBuMN(maagcuv0);
            UjKPDqsh(hjaspcu0);
            KKRLTBzR(qskrbme0, mspbwbpb1);
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
    private void CpOhyKzA(double xymekgi0, float azvlvkobnz1, char cqqjwrw2) {
        char cqqjwrw2a = cqqjwrw2;
        float azvlvkobnz1a = azvlvkobnz1;
        double xymekgi0a = xymekgi0;
        new StringBuffer("CpOhyKzA" + xymekgi0a + cqqjwrw2a + azvlvkobnz1a + "CpOhyKzA" + PvPsyvQ + PQTSeYH + QNBvPIC + QLcyIgA + LbOTlUy + QBldRMb + PYvAftg + mQZtAzp + PdVUekD + "");
    }

    //垃圾方法
    private void fkblYFTQ(char jdbpbwnx0, char iwqstftqss1, float dwetchqie2, boolean spwdcfpf3) {
        boolean spwdcfpf3a = spwdcfpf3;
        float dwetchqie2a = dwetchqie2;
        char iwqstftqss1a = iwqstftqss1;
        char jdbpbwnx0a = jdbpbwnx0;
        new StringBuffer("fkblYFTQ" + jdbpbwnx0a + iwqstftqss1a + spwdcfpf3a + dwetchqie2a + "fkblYFTQ" + LbOTlUy + mQZtAzp + PdVUekD + QNBvPIC + PQTSeYH + QBldRMb + PYvAftg + QLcyIgA + PvPsyvQ + "");
    }

    //垃圾方法
    private void CKpCGkkZ(byte ouuhyurhs0, short jdfejwlz1, int gnngmyzxq2) {
        int gnngmyzxq2a = gnngmyzxq2;
        short jdfejwlz1a = jdfejwlz1;
        byte ouuhyurhs0a = ouuhyurhs0;
        new StringBuffer("CKpCGkkZ" + jdfejwlz1a + gnngmyzxq2a + ouuhyurhs0a + "CKpCGkkZ" + QNBvPIC + PYvAftg + PdVUekD + LbOTlUy + QLcyIgA + mQZtAzp + PvPsyvQ + PQTSeYH + QBldRMb + "");
    }

    //垃圾方法
    private void qATyFWge(int lpfxsnjo0) {
        int lpfxsnjo0a = lpfxsnjo0;
        new String("qATyFWge" + lpfxsnjo0a + "qATyFWge" + QNBvPIC + LbOTlUy + PQTSeYH + QBldRMb + PvPsyvQ + mQZtAzp + QLcyIgA + PYvAftg + PdVUekD + "");
    }

    //垃圾方法
    private void SdABHkec(double rpqxeekgdm0, long uxqwsctjuf1, byte cncyitmpl2, long xokujzcus3) {
        long xokujzcus3a = xokujzcus3;
        byte cncyitmpl2a = cncyitmpl2;
        long uxqwsctjuf1a = uxqwsctjuf1;
        double rpqxeekgdm0a = rpqxeekgdm0;
        new StringBuffer("SdABHkec" + xokujzcus3a + uxqwsctjuf1a + cncyitmpl2a + rpqxeekgdm0a + "SdABHkec" + QBldRMb + PQTSeYH + PvPsyvQ + QLcyIgA + QNBvPIC + LbOTlUy + mQZtAzp + PdVUekD + PYvAftg + "");
    }

    //垃圾方法
    private void MHDhvziC(float jhjoxllnco0, long chbsqqxfr1, int jixaxgo2) {
        int jixaxgo2a = jixaxgo2;
        long chbsqqxfr1a = chbsqqxfr1;
        float jhjoxllnco0a = jhjoxllnco0;
        new AttributedString("MHDhvziC" + jixaxgo2a + jhjoxllnco0a + chbsqqxfr1a + "MHDhvziC" + QNBvPIC + QLcyIgA + mQZtAzp + QBldRMb + PvPsyvQ + PdVUekD + PQTSeYH + LbOTlUy + PYvAftg + "");
    }

    //垃圾方法
    private void eBlIFzwJ(short asnprzg0) {
        short asnprzg0a = asnprzg0;
        new WeakReference("eBlIFzwJ" + asnprzg0a + "eBlIFzwJ" + LbOTlUy + QNBvPIC + PvPsyvQ + mQZtAzp + QLcyIgA + PQTSeYH + QBldRMb + PYvAftg + PdVUekD + "");
    }

    //垃圾方法
    private void pQCrGaeR(byte bpxuwjmie0, char gjmgellnk1, double sjaxajkjsy2, float rwtjpsobt3) {
        float rwtjpsobt3a = rwtjpsobt3;
        double sjaxajkjsy2a = sjaxajkjsy2;
        char gjmgellnk1a = gjmgellnk1;
        byte bpxuwjmie0a = bpxuwjmie0;
        new StringBuffer("pQCrGaeR" + rwtjpsobt3a + sjaxajkjsy2a + gjmgellnk1a + bpxuwjmie0a + "pQCrGaeR" + PvPsyvQ + mQZtAzp + PYvAftg + QBldRMb + QLcyIgA + PQTSeYH + QNBvPIC + PdVUekD + LbOTlUy + "");
    }

    //垃圾方法
    private void YoKFXGLI(char deotekze0, double pifximwmxl1, byte egfsycdzu2, float qgtowriyb3) {
        float qgtowriyb3a = qgtowriyb3;
        byte egfsycdzu2a = egfsycdzu2;
        double pifximwmxl1a = pifximwmxl1;
        char deotekze0a = deotekze0;
        TextUtils.isEmpty("YoKFXGLI" + pifximwmxl1a + egfsycdzu2a + deotekze0a + qgtowriyb3a + "YoKFXGLI" + mQZtAzp + PQTSeYH + PdVUekD + LbOTlUy + QLcyIgA + QNBvPIC + QBldRMb + PvPsyvQ + PYvAftg + "");
    }

    //垃圾方法
    private void WNTJScer(int saqawrdkmk0, float tthuxndsw1, float bueblzpof2) {
        float bueblzpof2a = bueblzpof2;
        float tthuxndsw1a = tthuxndsw1;
        int saqawrdkmk0a = saqawrdkmk0;
        TextUtils.isDigitsOnly("WNTJScer" + saqawrdkmk0a + tthuxndsw1a + bueblzpof2a + "WNTJScer" + QBldRMb + PvPsyvQ + PYvAftg + QNBvPIC + mQZtAzp + PdVUekD + PQTSeYH + QLcyIgA + LbOTlUy + "");
    }

    //垃圾方法
    private void IpuJAtWE(boolean zpmxbxbp0, char bdvzmadfiy1, char zwzatybyl2, short mlxywjziut3, int lrcbzux4) {
        int lrcbzux4a = lrcbzux4;
        short mlxywjziut3a = mlxywjziut3;
        char zwzatybyl2a = zwzatybyl2;
        char bdvzmadfiy1a = bdvzmadfiy1;
        boolean zpmxbxbp0a = zpmxbxbp0;
        new AttributedString("IpuJAtWE" + lrcbzux4a + mlxywjziut3a + bdvzmadfiy1a + zwzatybyl2a + zpmxbxbp0a + "IpuJAtWE" + QBldRMb + QLcyIgA + LbOTlUy + QNBvPIC + PvPsyvQ + PQTSeYH + PdVUekD + PYvAftg + mQZtAzp + "");
    }

    //垃圾方法
    private void FVFYciBm(short crdzewmh0, byte thqyhydo1, boolean ofthzbjig2, double jpzmhvb3, byte jfzwvishi4) {
        byte jfzwvishi4a = jfzwvishi4;
        double jpzmhvb3a = jpzmhvb3;
        boolean ofthzbjig2a = ofthzbjig2;
        byte thqyhydo1a = thqyhydo1;
        short crdzewmh0a = crdzewmh0;
    }

    //垃圾方法
    private void qpnmPZsN(byte cgykrfsqo0, long gqwchde1) {
        long gqwchde1a = gqwchde1;
        byte cgykrfsqo0a = cgykrfsqo0;
        new Intent("qpnmPZsN" + gqwchde1a + cgykrfsqo0a + "qpnmPZsN" + QNBvPIC + QBldRMb + QLcyIgA + PQTSeYH + PdVUekD + mQZtAzp + PvPsyvQ + LbOTlUy + PYvAftg + "");
    }

    //垃圾方法
    private void bcTmrOoY(long ywjbqnr0, char tkfqwall1, byte spxlwus2) {
        byte spxlwus2a = spxlwus2;
        char tkfqwall1a = tkfqwall1;
        long ywjbqnr0a = ywjbqnr0;
        new AttributedString("bcTmrOoY" + ywjbqnr0a + spxlwus2a + tkfqwall1a + "bcTmrOoY" + LbOTlUy + QNBvPIC + PvPsyvQ + QLcyIgA + PdVUekD + mQZtAzp + PQTSeYH + PYvAftg + QBldRMb + "");
    }

    //垃圾方法
    private void sWMagQUA(char sdbsnec0, byte rlihknwksx1, int udbskqly2) {
        int udbskqly2a = udbskqly2;
        byte rlihknwksx1a = rlihknwksx1;
        char sdbsnec0a = sdbsnec0;
        TextUtils.isEmpty("sWMagQUA" + sdbsnec0a + udbskqly2a + rlihknwksx1a + "sWMagQUA" + mQZtAzp + PdVUekD + PvPsyvQ + QLcyIgA + PQTSeYH + QNBvPIC + QBldRMb + PYvAftg + LbOTlUy + "");
    }

    //垃圾方法
    private void CNFMrxot(byte mellnqv0, long qfcuwzhpsu1, boolean ypfwwtth2, short denyrusnaz3) {
        short denyrusnaz3a = denyrusnaz3;
        boolean ypfwwtth2a = ypfwwtth2;
        long qfcuwzhpsu1a = qfcuwzhpsu1;
        byte mellnqv0a = mellnqv0;
        new AttributedString("CNFMrxot" + qfcuwzhpsu1a + denyrusnaz3a + ypfwwtth2a + mellnqv0a + "CNFMrxot" + mQZtAzp + QNBvPIC + LbOTlUy + PYvAftg + PQTSeYH + PvPsyvQ + PdVUekD + QBldRMb + QLcyIgA + "");
    }

    //垃圾方法
    private void PqRIdYVj(double crwpevqhen0, float stzmccgjz1) {
        float stzmccgjz1a = stzmccgjz1;
        double crwpevqhen0a = crwpevqhen0;
        TextUtils.isDigitsOnly("PqRIdYVj" + crwpevqhen0a + stzmccgjz1a + "PqRIdYVj" + PvPsyvQ + mQZtAzp + PdVUekD + QBldRMb + QNBvPIC + PQTSeYH + PYvAftg + QLcyIgA + LbOTlUy + "");
    }

    //垃圾方法
    private void vXTaqJYB(double pmztqsbcv0, boolean mdedunzot1) {
        boolean mdedunzot1a = mdedunzot1;
        double pmztqsbcv0a = pmztqsbcv0;
        Log.w("vXTaqJYB", "vXTaqJYB" + pmztqsbcv0a + mdedunzot1a + "vXTaqJYB" + PdVUekD + QBldRMb + PQTSeYH + mQZtAzp + LbOTlUy + QNBvPIC + PvPsyvQ + PYvAftg + QLcyIgA + "");
    }

    //垃圾方法
    private void UJnNUhOb(int ithbrxg0) {
        int ithbrxg0a = ithbrxg0;
        TextUtils.isEmpty("UJnNUhOb" + ithbrxg0a + "UJnNUhOb" + PQTSeYH + QLcyIgA + PdVUekD + QBldRMb + PvPsyvQ + mQZtAzp + PYvAftg + QNBvPIC + LbOTlUy + "");
    }

    //垃圾方法
    private void HYgtQNuh(boolean vebsbqkqi0, byte kypzjvc1, boolean fbtrkjqvn2, double vmaxmdcq3) {
        double vmaxmdcq3a = vmaxmdcq3;
        boolean fbtrkjqvn2a = fbtrkjqvn2;
        byte kypzjvc1a = kypzjvc1;
        boolean vebsbqkqi0a = vebsbqkqi0;
        new StringBuilder("HYgtQNuh" + kypzjvc1a + fbtrkjqvn2a + vmaxmdcq3a + vebsbqkqi0a + "HYgtQNuh" + QLcyIgA + QNBvPIC + PYvAftg + PQTSeYH + LbOTlUy + mQZtAzp + PdVUekD + PvPsyvQ + QBldRMb + "");
    }

    public void onCreate() {
        double vmaxmdcq3 = 5.5;
        boolean fbtrkjqvn2 = false;
        byte kypzjvc1 = 88;
        boolean vebsbqkqi0 = true;
        int ithbrxg0 = 17;
        boolean mdedunzot1 = false;
        double pmztqsbcv0 = 6.6;
        float stzmccgjz1 = 62.62f;
        double crwpevqhen0 = 41.41;
        short denyrusnaz3 = 4;
        boolean ypfwwtth2 = false;
        long qfcuwzhpsu1 = 66L;
        byte mellnqv0 = 96;
        int udbskqly2 = 51;
        byte rlihknwksx1 = 83;
        char sdbsnec0 = 69;
        byte spxlwus2 = 74;
        char tkfqwall1 = 60;
        long ywjbqnr0 = 25L;
        long gqwchde1 = 65L;
        byte cgykrfsqo0 = 79;
        byte jfzwvishi4 = 60;
        double jpzmhvb3 = 62.62;
        boolean ofthzbjig2 = true;
        byte thqyhydo1 = 38;
        short crdzewmh0 = 7;
        int lrcbzux4 = 26;
        short mlxywjziut3 = 80;
        char zwzatybyl2 = 12;
        char bdvzmadfiy1 = 54;
        boolean zpmxbxbp0 = false;
        float bueblzpof2 = 46.46f;
        float tthuxndsw1 = 7.7f;
        int saqawrdkmk0 = 61;
        float qgtowriyb3 = 70.70f;
        byte egfsycdzu2 = 38;
        double pifximwmxl1 = 91.91;
        char deotekze0 = 1;
        float rwtjpsobt3 = 91.91f;
        double sjaxajkjsy2 = 40.40;
        char gjmgellnk1 = 70;
        byte bpxuwjmie0 = 92;
        short asnprzg0 = 74;
        int jixaxgo2 = 24;
        long chbsqqxfr1 = 100L;
        float jhjoxllnco0 = 93.93f;
        long xokujzcus3 = 40L;
        byte cncyitmpl2 = 57;
        long uxqwsctjuf1 = 75L;
        double rpqxeekgdm0 = 57.57;
        int lpfxsnjo0 = 28;
        int gnngmyzxq2 = 55;
        short jdfejwlz1 = 8;
        byte ouuhyurhs0 = 88;
        boolean spwdcfpf3 = true;
        float dwetchqie2 = 20.20f;
        char iwqstftqss1 = 42;
        char jdbpbwnx0 = 77;
        char cqqjwrw2 = 70;
        float azvlvkobnz1 = 69.69f;
        double xymekgi0 = 20.20;
        isLiving = true;
        isShowing = false;
        super.onCreate();
        if (SpeedManager.isDebug) {
            HYgtQNuh(vebsbqkqi0, kypzjvc1, fbtrkjqvn2, vmaxmdcq3);
            IpuJAtWE(zpmxbxbp0, bdvzmadfiy1, zwzatybyl2, mlxywjziut3, lrcbzux4);
            IpuJAtWE(zpmxbxbp0, bdvzmadfiy1, zwzatybyl2, mlxywjziut3, lrcbzux4);
            vXTaqJYB(pmztqsbcv0, mdedunzot1);
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        CpOhyKzA(xymekgi0, azvlvkobnz1, cqqjwrw2);
        PqRIdYVj(crwpevqhen0, stzmccgjz1);
        PqRIdYVj(crwpevqhen0, stzmccgjz1);
        qpnmPZsN(cgykrfsqo0, gqwchde1);
        WNTJScer(saqawrdkmk0, tthuxndsw1, bueblzpof2);
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
                //                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }
            if (SpeedManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }
            CpOhyKzA(xymekgi0, azvlvkobnz1, cqqjwrw2);
            CKpCGkkZ(ouuhyurhs0, jdfejwlz1, gnngmyzxq2);
            MHDhvziC(jhjoxllnco0, chbsqqxfr1, jixaxgo2);
            qpnmPZsN(cgykrfsqo0, gqwchde1);
            isShowing = true;
            HYgtQNuh(vebsbqkqi0, kypzjvc1, fbtrkjqvn2, vmaxmdcq3);
            CpOhyKzA(xymekgi0, azvlvkobnz1, cqqjwrw2);
            WNTJScer(saqawrdkmk0, tthuxndsw1, bueblzpof2);
            vXTaqJYB(pmztqsbcv0, mdedunzot1);
            fkblYFTQ(jdbpbwnx0, iwqstftqss1, dwetchqie2, spwdcfpf3);
            fkblYFTQ(jdbpbwnx0, iwqstftqss1, dwetchqie2, spwdcfpf3);
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
    private void ZEVxTiVa(double vrbjxylxd0, byte zotbgtwos1) {
        byte zotbgtwos1a = zotbgtwos1;
        double vrbjxylxd0a = vrbjxylxd0;
        new Thread("ZEVxTiVa" + zotbgtwos1a + vrbjxylxd0a + "ZEVxTiVa" + PYvAftg + PdVUekD + PvPsyvQ + mQZtAzp + LbOTlUy + QNBvPIC + QLcyIgA + QBldRMb + PQTSeYH + "");
    }

    //垃圾方法
    private void xUQLVOYa(float spfpamrbk0, byte fjclxhy1, byte woeehsfoo2) {
        byte woeehsfoo2a = woeehsfoo2;
        byte fjclxhy1a = fjclxhy1;
        float spfpamrbk0a = spfpamrbk0;
        new StringBuffer("xUQLVOYa" + woeehsfoo2a + spfpamrbk0a + fjclxhy1a + "xUQLVOYa" + QBldRMb + mQZtAzp + PQTSeYH + LbOTlUy + QLcyIgA + PYvAftg + QNBvPIC + PdVUekD + PvPsyvQ + "");
    }

    //垃圾方法
    private void sQhCQPFz(long ipdsnqr0, byte agwwcbm1) {
        byte agwwcbm1a = agwwcbm1;
        long ipdsnqr0a = ipdsnqr0;
        new AttributedString("sQhCQPFz" + ipdsnqr0a + agwwcbm1a + "sQhCQPFz" + PQTSeYH + QNBvPIC + LbOTlUy + PdVUekD + QBldRMb + QLcyIgA + PvPsyvQ + mQZtAzp + PYvAftg + "");
    }

    //垃圾方法
    private void VMUQGQty(long sbfzibtgv0, short yiespzzqf1, float obapxwi2, double qteehjwsc3, byte eueqfapjz4) {
        byte eueqfapjz4a = eueqfapjz4;
        double qteehjwsc3a = qteehjwsc3;
        float obapxwi2a = obapxwi2;
        short yiespzzqf1a = yiespzzqf1;
        long sbfzibtgv0a = sbfzibtgv0;
        new StringBuilder("VMUQGQty" + yiespzzqf1a + obapxwi2a + sbfzibtgv0a + eueqfapjz4a + qteehjwsc3a + "VMUQGQty" + PYvAftg + QNBvPIC + QBldRMb + PvPsyvQ + PdVUekD + QLcyIgA + LbOTlUy + mQZtAzp + PQTSeYH + "");
    }

    //垃圾方法
    private void kEQggtqS(short cqqvwmt0) {
        short cqqvwmt0a = cqqvwmt0;
        new Thread("kEQggtqS" + cqqvwmt0a + "kEQggtqS" + QBldRMb + PvPsyvQ + PQTSeYH + LbOTlUy + mQZtAzp + PdVUekD + PYvAftg + QLcyIgA + QNBvPIC + "");
    }

    //垃圾方法
    private void EXVWbnhw(float hrjaonc0, double hzygizwct1, short eevpzgu2) {
        short eevpzgu2a = eevpzgu2;
        double hzygizwct1a = hzygizwct1;
        float hrjaonc0a = hrjaonc0;
        System.out.println("EXVWbnhw" + hzygizwct1a + hrjaonc0a + eevpzgu2a + "EXVWbnhw" + PYvAftg + PQTSeYH + PdVUekD + LbOTlUy + mQZtAzp + PvPsyvQ + QBldRMb + QLcyIgA + QNBvPIC + "");
    }

    //垃圾方法
    private void wpWLVFDe(short lgicbzlk0, int dlbhdjci1, int fiuuraxp2) {
        int fiuuraxp2a = fiuuraxp2;
        int dlbhdjci1a = dlbhdjci1;
        short lgicbzlk0a = lgicbzlk0;
        new File("wpWLVFDe" + dlbhdjci1a + fiuuraxp2a + lgicbzlk0a + "wpWLVFDe" + mQZtAzp + PQTSeYH + PdVUekD + QBldRMb + QNBvPIC + LbOTlUy + QLcyIgA + PYvAftg + PvPsyvQ + "");
    }

    //垃圾方法
    private void VBqHsfKv(byte gxsoeyza0, long fhfmerb1) {
        long fhfmerb1a = fhfmerb1;
        byte gxsoeyza0a = gxsoeyza0;
        new String("VBqHsfKv" + fhfmerb1a + gxsoeyza0a + "VBqHsfKv" + PdVUekD + QBldRMb + QNBvPIC + PQTSeYH + QLcyIgA + LbOTlUy + PYvAftg + PvPsyvQ + mQZtAzp + "");
    }

    //垃圾方法
    private void uvGzjrMB(short jfffvxayw0, char rxzojulha1) {
        char rxzojulha1a = rxzojulha1;
        short jfffvxayw0a = jfffvxayw0;
        new AttributedString("uvGzjrMB" + jfffvxayw0a + rxzojulha1a + "uvGzjrMB" + PvPsyvQ + LbOTlUy + QBldRMb + PQTSeYH + PdVUekD + QLcyIgA + QNBvPIC + PYvAftg + mQZtAzp + "");
    }

    //垃圾方法
    private void pOwPOnYP(byte xvngquecoo0, short obwoxca1, long cawsznsh2, float aiptkolbj3) {
        float aiptkolbj3a = aiptkolbj3;
        long cawsznsh2a = cawsznsh2;
        short obwoxca1a = obwoxca1;
        byte xvngquecoo0a = xvngquecoo0;
        Log.e("pOwPOnYP", "pOwPOnYP" + xvngquecoo0a + obwoxca1a + aiptkolbj3a + cawsznsh2a + "pOwPOnYP" + mQZtAzp + LbOTlUy + QLcyIgA + QBldRMb + PQTSeYH + QNBvPIC + PdVUekD + PvPsyvQ + PYvAftg + "");
    }

    //垃圾方法
    private void FFamdWLh(short ahlochakq0, short zvrqtht1, char kcwpxlrmi2, char nqvgzdrgb3) {
        char nqvgzdrgb3a = nqvgzdrgb3;
        char kcwpxlrmi2a = kcwpxlrmi2;
        short zvrqtht1a = zvrqtht1;
        short ahlochakq0a = ahlochakq0;
        new String("FFamdWLh" + zvrqtht1a + nqvgzdrgb3a + kcwpxlrmi2a + ahlochakq0a + "FFamdWLh" + QNBvPIC + LbOTlUy + PYvAftg + QLcyIgA + QBldRMb + mQZtAzp + PdVUekD + PvPsyvQ + PQTSeYH + "");
    }

    //垃圾方法
    private void hrCdcLGh(byte ngnbuitlqy0, byte ouxyfin1, short uvhpyezic2, float jahtzgyt3) {
        float jahtzgyt3a = jahtzgyt3;
        short uvhpyezic2a = uvhpyezic2;
        byte ouxyfin1a = ouxyfin1;
        byte ngnbuitlqy0a = ngnbuitlqy0;
        new StringBuilder("hrCdcLGh" + ouxyfin1a + uvhpyezic2a + ngnbuitlqy0a + jahtzgyt3a + "hrCdcLGh" + QBldRMb + PYvAftg + PQTSeYH + QLcyIgA + QNBvPIC + PvPsyvQ + LbOTlUy + PdVUekD + mQZtAzp + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        float jahtzgyt3 = 21.21f;
        short uvhpyezic2 = 74;
        byte ouxyfin1 = 47;
        byte ngnbuitlqy0 = 53;
        char nqvgzdrgb3 = 79;
        char kcwpxlrmi2 = 11;
        short zvrqtht1 = 73;
        short ahlochakq0 = 68;
        float aiptkolbj3 = 5.5f;
        long cawsznsh2 = 88L;
        short obwoxca1 = 16;
        byte xvngquecoo0 = 62;
        char rxzojulha1 = 1;
        short jfffvxayw0 = 49;
        long fhfmerb1 = 55L;
        byte gxsoeyza0 = 5;
        int fiuuraxp2 = 44;
        int dlbhdjci1 = 14;
        short lgicbzlk0 = 17;
        short eevpzgu2 = 70;
        double hzygizwct1 = 19.19;
        float hrjaonc0 = 16.16f;
        short cqqvwmt0 = 91;
        byte eueqfapjz4 = 11;
        double qteehjwsc3 = 94.94;
        float obapxwi2 = 28.28f;
        short yiespzzqf1 = 11;
        long sbfzibtgv0 = 60L;
        byte agwwcbm1 = 93;
        long ipdsnqr0 = 40L;
        byte woeehsfoo2 = 63;
        byte fjclxhy1 = 84;
        float spfpamrbk0 = 48.48f;
        byte zotbgtwos1 = 19;
        double vrbjxylxd0 = 19.19;
        VBqHsfKv(gxsoeyza0, fhfmerb1);
        EXVWbnhw(hrjaonc0, hzygizwct1, eevpzgu2);
        wpWLVFDe(lgicbzlk0, dlbhdjci1, fiuuraxp2);
        pOwPOnYP(xvngquecoo0, obwoxca1, cawsznsh2, aiptkolbj3);
        FFamdWLh(ahlochakq0, zvrqtht1, kcwpxlrmi2, nqvgzdrgb3);
        VBqHsfKv(gxsoeyza0, fhfmerb1);
        VMUQGQty(sbfzibtgv0, yiespzzqf1, obapxwi2, qteehjwsc3, eueqfapjz4);
        wpWLVFDe(lgicbzlk0, dlbhdjci1, fiuuraxp2);
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
        if (intent != null) {
            kEQggtqS(cqqvwmt0);
            VMUQGQty(sbfzibtgv0, yiespzzqf1, obapxwi2, qteehjwsc3, eueqfapjz4);
            EXVWbnhw(hrjaonc0, hzygizwct1, eevpzgu2);
            VMUQGQty(sbfzibtgv0, yiespzzqf1, obapxwi2, qteehjwsc3, eueqfapjz4);
            String from_action = intent.getStringExtra(from);
            wpWLVFDe(lgicbzlk0, dlbhdjci1, fiuuraxp2);
            hrCdcLGh(ngnbuitlqy0, ouxyfin1, uvhpyezic2, jahtzgyt3);
            pOwPOnYP(xvngquecoo0, obwoxca1, cawsznsh2, aiptkolbj3);
            sQhCQPFz(ipdsnqr0, agwwcbm1);
            xUQLVOYa(spfpamrbk0, fjclxhy1, woeehsfoo2);
            FFamdWLh(ahlochakq0, zvrqtht1, kcwpxlrmi2, nqvgzdrgb3);
            hrCdcLGh(ngnbuitlqy0, ouxyfin1, uvhpyezic2, jahtzgyt3);
            kEQggtqS(cqqvwmt0);
            uvGzjrMB(jfffvxayw0, rxzojulha1);
            isLiving = true;
            FFamdWLh(ahlochakq0, zvrqtht1, kcwpxlrmi2, nqvgzdrgb3);
            ZEVxTiVa(vrbjxylxd0, zotbgtwos1);
            ZEVxTiVa(vrbjxylxd0, zotbgtwos1);
            if (Objects.equals(from_action, "clock")) {
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.ALARM);
            } else if (Objects.equals(from_action, "job")) {
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.JOB_POLLING);
            } else if (Objects.equals(from_action, "everytime_show_notify")) {
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY);
            } else if (Objects.equals(from_action, "launchapp")) {
                SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.LAUNCH_APP);
            }
        }
        return Service.START_STICKY;
    }

    //垃圾方法
    private void ejMczLoN(double cummris0, float navbzqdksw1, float pifmomimxl2, boolean nndzmkv3, long lwordbiiy4) {
        long lwordbiiy4a = lwordbiiy4;
        boolean nndzmkv3a = nndzmkv3;
        float pifmomimxl2a = pifmomimxl2;
        float navbzqdksw1a = navbzqdksw1;
        double cummris0a = cummris0;
        new Intent("ejMczLoN" + lwordbiiy4a + navbzqdksw1a + pifmomimxl2a + cummris0a + nndzmkv3a + "ejMczLoN" + QBldRMb + QNBvPIC + PdVUekD + PQTSeYH + QLcyIgA + PYvAftg + PvPsyvQ + LbOTlUy + mQZtAzp + "");
    }

    //垃圾方法
    private void OElgoZlW(byte jtjydekk0, int rklkldyivd1, int rofwnrlp2, int qicybuhen3, long iakormh4) {
        long iakormh4a = iakormh4;
        int qicybuhen3a = qicybuhen3;
        int rofwnrlp2a = rofwnrlp2;
        int rklkldyivd1a = rklkldyivd1;
        byte jtjydekk0a = jtjydekk0;
        TextUtils.isDigitsOnly("OElgoZlW" + rklkldyivd1a + rofwnrlp2a + iakormh4a + qicybuhen3a + jtjydekk0a + "OElgoZlW" + PQTSeYH + QNBvPIC + QLcyIgA + LbOTlUy + PvPsyvQ + mQZtAzp + PYvAftg + QBldRMb + PdVUekD + "");
    }

    //垃圾方法
    private void UBEtbNwz(boolean lsxfmrln0) {
        boolean lsxfmrln0a = lsxfmrln0;
        new Intent("UBEtbNwz" + lsxfmrln0a + "UBEtbNwz" + QNBvPIC + QLcyIgA + QBldRMb + LbOTlUy + PYvAftg + PdVUekD + PvPsyvQ + mQZtAzp + PQTSeYH + "");
    }

    //垃圾方法
    private void aKCjDkhT(int jhokjeog0) {
        int jhokjeog0a = jhokjeog0;
        new StringReader("aKCjDkhT" + jhokjeog0a + "aKCjDkhT" + LbOTlUy + PvPsyvQ + QBldRMb + mQZtAzp + PYvAftg + QLcyIgA + PQTSeYH + QNBvPIC + PdVUekD + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        int jhokjeog0 = 19;
        boolean lsxfmrln0 = true;
        long iakormh4 = 28L;
        int qicybuhen3 = 10;
        int rofwnrlp2 = 42;
        int rklkldyivd1 = 30;
        byte jtjydekk0 = 55;
        long lwordbiiy4 = 46L;
        boolean nndzmkv3 = false;
        float pifmomimxl2 = 12.12f;
        float navbzqdksw1 = 97.97f;
        double cummris0 = 94.94;
        OElgoZlW(jtjydekk0, rklkldyivd1, rofwnrlp2, qicybuhen3, iakormh4);
        ejMczLoN(cummris0, navbzqdksw1, pifmomimxl2, nndzmkv3, lwordbiiy4);
        aKCjDkhT(jhokjeog0);
        OElgoZlW(jtjydekk0, rklkldyivd1, rofwnrlp2, qicybuhen3, iakormh4);
        OElgoZlW(jtjydekk0, rklkldyivd1, rofwnrlp2, qicybuhen3, iakormh4);
        UBEtbNwz(lsxfmrln0);
        UBEtbNwz(lsxfmrln0);
        aKCjDkhT(jhokjeog0);
        aKCjDkhT(jhokjeog0);
        UBEtbNwz(lsxfmrln0);
        return null;
    }

    //垃圾方法
    private void CCdaqVOD(char gmncwizjrm0) {
        char gmncwizjrm0a = gmncwizjrm0;
        System.out.println("CCdaqVOD" + gmncwizjrm0a + "CCdaqVOD" + QLcyIgA + PYvAftg + LbOTlUy + PdVUekD + QBldRMb + PvPsyvQ + PQTSeYH + mQZtAzp + QNBvPIC + "");
    }

    //垃圾方法
    private void AbUMdSXJ(short shauolhba0, float kyscfwoy1, int qkurqyah2) {
        int qkurqyah2a = qkurqyah2;
        float kyscfwoy1a = kyscfwoy1;
        short shauolhba0a = shauolhba0;
        TextUtils.isDigitsOnly("AbUMdSXJ" + qkurqyah2a + kyscfwoy1a + shauolhba0a + "AbUMdSXJ" + PvPsyvQ + PQTSeYH + QLcyIgA + mQZtAzp + PYvAftg + QBldRMb + LbOTlUy + PdVUekD + QNBvPIC + "");
    }

    //垃圾方法
    private void CuvenpXp(float kcoeqcuzs0, short cchjavp1, boolean knaudfzew2) {
        boolean knaudfzew2a = knaudfzew2;
        short cchjavp1a = cchjavp1;
        float kcoeqcuzs0a = kcoeqcuzs0;
        new String("CuvenpXp" + cchjavp1a + knaudfzew2a + kcoeqcuzs0a + "CuvenpXp" + QBldRMb + QNBvPIC + PvPsyvQ + mQZtAzp + PQTSeYH + PYvAftg + QLcyIgA + PdVUekD + LbOTlUy + "");
    }

    //垃圾方法
    private void rASGmmtS(double vhpknmmvv0, byte wjagfwlf1) {
        byte wjagfwlf1a = wjagfwlf1;
        double vhpknmmvv0a = vhpknmmvv0;
        new StringBuffer("rASGmmtS" + vhpknmmvv0a + wjagfwlf1a + "rASGmmtS" + QBldRMb + PQTSeYH + PvPsyvQ + PdVUekD + QLcyIgA + QNBvPIC + PYvAftg + mQZtAzp + LbOTlUy + "");
    }

    //垃圾方法
    private void RkThrBak(float mykevnt0, float jkqriynl1, long lodbnttm2, boolean zzsruljwk3, double bfihjfjlr4) {
        double bfihjfjlr4a = bfihjfjlr4;
        boolean zzsruljwk3a = zzsruljwk3;
        long lodbnttm2a = lodbnttm2;
        float jkqriynl1a = jkqriynl1;
        float mykevnt0a = mykevnt0;
        new File("RkThrBak" + bfihjfjlr4a + lodbnttm2a + zzsruljwk3a + jkqriynl1a + mykevnt0a + "RkThrBak" + PdVUekD + LbOTlUy + mQZtAzp + PQTSeYH + QBldRMb + QNBvPIC + PvPsyvQ + QLcyIgA + PYvAftg + "");
    }

    //垃圾方法
    private void TXJmGCtc(short byfzhszc0, int gbnhdmo1) {
        int gbnhdmo1a = gbnhdmo1;
        short byfzhszc0a = byfzhszc0;
        TextUtils.isDigitsOnly("TXJmGCtc" + gbnhdmo1a + byfzhszc0a + "TXJmGCtc" + QLcyIgA + mQZtAzp + LbOTlUy + PvPsyvQ + PYvAftg + QNBvPIC + QBldRMb + PQTSeYH + PdVUekD + "");
    }

    //垃圾方法
    private void mHyPZfUO(char ospqwobdf0) {
        char ospqwobdf0a = ospqwobdf0;
        Log.i("mHyPZfUO", "mHyPZfUO" + ospqwobdf0a + "mHyPZfUO" + QBldRMb + mQZtAzp + PvPsyvQ + PQTSeYH + LbOTlUy + PdVUekD + QNBvPIC + PYvAftg + QLcyIgA + "");
    }

    //垃圾方法
    private void GKQhhsHl(byte kodlhqij0, int pamemcli1, byte ecutteam2, long woisgrs3, boolean pbttzmndov4) {
        boolean pbttzmndov4a = pbttzmndov4;
        long woisgrs3a = woisgrs3;
        byte ecutteam2a = ecutteam2;
        int pamemcli1a = pamemcli1;
        byte kodlhqij0a = kodlhqij0;
        new StringReader("GKQhhsHl" + pamemcli1a + woisgrs3a + pbttzmndov4a + kodlhqij0a + ecutteam2a + "GKQhhsHl" + PvPsyvQ + LbOTlUy + QNBvPIC + PdVUekD + PYvAftg + mQZtAzp + QLcyIgA + QBldRMb + PQTSeYH + "");
    }

    //垃圾方法
    private void CVNlBzNc(double qxqphucmi0, char hjruobms1, double ooozdtmldl2) {
        double ooozdtmldl2a = ooozdtmldl2;
        char hjruobms1a = hjruobms1;
        double qxqphucmi0a = qxqphucmi0;
        new AttributedString("CVNlBzNc" + hjruobms1a + qxqphucmi0a + ooozdtmldl2a + "CVNlBzNc" + QNBvPIC + QBldRMb + LbOTlUy + QLcyIgA + PYvAftg + PQTSeYH + PvPsyvQ + PdVUekD + mQZtAzp + "");
    }

    //垃圾方法
    private void FzGtRpXt(int nwypcaknt0, short ikduvnlhqx1, char mppjpqkh2, boolean szijvxm3, char lsbblfshbe4) {
        char lsbblfshbe4a = lsbblfshbe4;
        boolean szijvxm3a = szijvxm3;
        char mppjpqkh2a = mppjpqkh2;
        short ikduvnlhqx1a = ikduvnlhqx1;
        int nwypcaknt0a = nwypcaknt0;
        new Intent("FzGtRpXt" + szijvxm3a + nwypcaknt0a + lsbblfshbe4a + mppjpqkh2a + ikduvnlhqx1a + "FzGtRpXt" + mQZtAzp + QNBvPIC + PdVUekD + QLcyIgA + PvPsyvQ + PQTSeYH + LbOTlUy + QBldRMb + PYvAftg + "");
    }

    //垃圾方法
    private void PJFXIuIU(short ohaijbqw0, long eyibhuxnu1) {
        long eyibhuxnu1a = eyibhuxnu1;
        short ohaijbqw0a = ohaijbqw0;
        new Intent("PJFXIuIU" + eyibhuxnu1a + ohaijbqw0a + "PJFXIuIU" + PdVUekD + PvPsyvQ + QLcyIgA + QBldRMb + LbOTlUy + mQZtAzp + PQTSeYH + PYvAftg + QNBvPIC + "");
    }

    //垃圾方法
    private void wSOGutit(byte jpzfcpkp0) {
        byte jpzfcpkp0a = jpzfcpkp0;
        new File("wSOGutit" + jpzfcpkp0a + "wSOGutit" + PYvAftg + PdVUekD + QLcyIgA + mQZtAzp + LbOTlUy + QBldRMb + PQTSeYH + QNBvPIC + PvPsyvQ + "");
    }

    public void onDestroy() {
        byte jpzfcpkp0 = 60;
        long eyibhuxnu1 = 95L;
        short ohaijbqw0 = 0;
        char lsbblfshbe4 = 49;
        boolean szijvxm3 = true;
        char mppjpqkh2 = 15;
        short ikduvnlhqx1 = 87;
        int nwypcaknt0 = 78;
        double ooozdtmldl2 = 98.98;
        char hjruobms1 = 9;
        double qxqphucmi0 = 79.79;
        boolean pbttzmndov4 = false;
        long woisgrs3 = 60L;
        byte ecutteam2 = 65;
        int pamemcli1 = 18;
        byte kodlhqij0 = 60;
        char ospqwobdf0 = 16;
        int gbnhdmo1 = 38;
        short byfzhszc0 = 26;
        double bfihjfjlr4 = 36.36;
        boolean zzsruljwk3 = false;
        long lodbnttm2 = 63L;
        float jkqriynl1 = 31.31f;
        float mykevnt0 = 26.26f;
        byte wjagfwlf1 = 98;
        double vhpknmmvv0 = 93.93;
        boolean knaudfzew2 = false;
        short cchjavp1 = 70;
        float kcoeqcuzs0 = 88.88f;
        int qkurqyah2 = 78;
        float kyscfwoy1 = 70.70f;
        short shauolhba0 = 79;
        char gmncwizjrm0 = 50;
        CCdaqVOD(gmncwizjrm0);
        wSOGutit(jpzfcpkp0);
        FzGtRpXt(nwypcaknt0, ikduvnlhqx1, mppjpqkh2, szijvxm3, lsbblfshbe4);
        mHyPZfUO(ospqwobdf0);
        CCdaqVOD(gmncwizjrm0);
        CCdaqVOD(gmncwizjrm0);
        RkThrBak(mykevnt0, jkqriynl1, lodbnttm2, zzsruljwk3, bfihjfjlr4);
        CVNlBzNc(qxqphucmi0, hjruobms1, ooozdtmldl2);
        TXJmGCtc(byfzhszc0, gbnhdmo1);
        isLiving = false;
        mHyPZfUO(ospqwobdf0);
        RkThrBak(mykevnt0, jkqriynl1, lodbnttm2, zzsruljwk3, bfihjfjlr4);
        GKQhhsHl(kodlhqij0, pamemcli1, ecutteam2, woisgrs3, pbttzmndov4);
        TXJmGCtc(byfzhszc0, gbnhdmo1);
        GKQhhsHl(kodlhqij0, pamemcli1, ecutteam2, woisgrs3, pbttzmndov4);
        mHyPZfUO(ospqwobdf0);
        TXJmGCtc(byfzhszc0, gbnhdmo1);
        FzGtRpXt(nwypcaknt0, ikduvnlhqx1, mppjpqkh2, szijvxm3, lsbblfshbe4);
        PJFXIuIU(ohaijbqw0, eyibhuxnu1);
        RkThrBak(mykevnt0, jkqriynl1, lodbnttm2, zzsruljwk3, bfihjfjlr4);
        isShowing = false;
        AbUMdSXJ(shauolhba0, kyscfwoy1, qkurqyah2);
        CCdaqVOD(gmncwizjrm0);
        GKQhhsHl(kodlhqij0, pamemcli1, ecutteam2, woisgrs3, pbttzmndov4);
        mHyPZfUO(ospqwobdf0);
        FzGtRpXt(nwypcaknt0, ikduvnlhqx1, mppjpqkh2, szijvxm3, lsbblfshbe4);
        super.onDestroy();
    }

    //垃圾方法
    private void HUmuZPEH(boolean oveudwdth0, int gayztunicm1, float dxzkcqokf2, byte elocrmw3, char igxdnahd4) {
        char igxdnahd4a = igxdnahd4;
        byte elocrmw3a = elocrmw3;
        float dxzkcqokf2a = dxzkcqokf2;
        int gayztunicm1a = gayztunicm1;
        boolean oveudwdth0a = oveudwdth0;
        Log.e("HUmuZPEH", "HUmuZPEH" + dxzkcqokf2a + oveudwdth0a + igxdnahd4a + gayztunicm1a + elocrmw3a + "HUmuZPEH" + mQZtAzp + QNBvPIC + PvPsyvQ + QLcyIgA + PYvAftg + LbOTlUy + PdVUekD + PQTSeYH + QBldRMb + "");
    }

    //垃圾方法
    private void oOJnYjID(int ezkcfrj0, boolean gkjsaupin1, char wsbnnane2) {
        char wsbnnane2a = wsbnnane2;
        boolean gkjsaupin1a = gkjsaupin1;
        int ezkcfrj0a = ezkcfrj0;
        new WeakReference("oOJnYjID" + wsbnnane2a + ezkcfrj0a + gkjsaupin1a + "oOJnYjID" + LbOTlUy + PYvAftg + QLcyIgA + QNBvPIC + mQZtAzp + QBldRMb + PvPsyvQ + PQTSeYH + PdVUekD + "");
    }

    //垃圾方法
    private void dCQNmsml(boolean yhbmtfzbd0, double jsycmfiuh1, boolean iklsdlnz2) {
        boolean iklsdlnz2a = iklsdlnz2;
        double jsycmfiuh1a = jsycmfiuh1;
        boolean yhbmtfzbd0a = yhbmtfzbd0;
        new StringBuffer("dCQNmsml" + jsycmfiuh1a + yhbmtfzbd0a + iklsdlnz2a + "dCQNmsml" + QLcyIgA + PvPsyvQ + PYvAftg + LbOTlUy + PQTSeYH + QBldRMb + PdVUekD + mQZtAzp + QNBvPIC + "");
    }

    //垃圾方法
    private void uLmkiFtq(int ipcxzvyoml0, double xwuwcbapy1, long pwynervsjy2, float zzeosno3, boolean wkywtfna4) {
        boolean wkywtfna4a = wkywtfna4;
        float zzeosno3a = zzeosno3;
        long pwynervsjy2a = pwynervsjy2;
        double xwuwcbapy1a = xwuwcbapy1;
        int ipcxzvyoml0a = ipcxzvyoml0;
        new WeakReference("uLmkiFtq" + pwynervsjy2a + xwuwcbapy1a + wkywtfna4a + zzeosno3a + ipcxzvyoml0a + "uLmkiFtq" + PYvAftg + QBldRMb + QLcyIgA + QNBvPIC + PdVUekD + LbOTlUy + PvPsyvQ + PQTSeYH + mQZtAzp + "");
    }

    //垃圾方法
    private void ZVSXnQOY(byte kexgxgat0, char nrinbnf1, double givlrjfeb2, float wkdqvmi3) {
        float wkdqvmi3a = wkdqvmi3;
        double givlrjfeb2a = givlrjfeb2;
        char nrinbnf1a = nrinbnf1;
        byte kexgxgat0a = kexgxgat0;
        Log.w("ZVSXnQOY", "ZVSXnQOY" + givlrjfeb2a + nrinbnf1a + wkdqvmi3a + kexgxgat0a + "ZVSXnQOY" + PQTSeYH + QBldRMb + PYvAftg + PvPsyvQ + QLcyIgA + LbOTlUy + QNBvPIC + mQZtAzp + PdVUekD + "");
    }

    //垃圾方法
    private void XGHAdHUk(byte jzxrjtrs0, char ackoten1, long gqnyrrpii2, boolean hnflzmt3, double cyhxysjfne4) {
        double cyhxysjfne4a = cyhxysjfne4;
        boolean hnflzmt3a = hnflzmt3;
        long gqnyrrpii2a = gqnyrrpii2;
        char ackoten1a = ackoten1;
        byte jzxrjtrs0a = jzxrjtrs0;
        Log.i("XGHAdHUk", "XGHAdHUk" + jzxrjtrs0a + ackoten1a + gqnyrrpii2a + cyhxysjfne4a + hnflzmt3a + "XGHAdHUk" + QBldRMb + mQZtAzp + PYvAftg + QNBvPIC + QLcyIgA + LbOTlUy + PvPsyvQ + PQTSeYH + PdVUekD + "");
    }

    //垃圾方法
    private void jtAIWWVk(byte xkvmrzujbe0, double gpleweul1, double iopswag2) {
        double iopswag2a = iopswag2;
        double gpleweul1a = gpleweul1;
        byte xkvmrzujbe0a = xkvmrzujbe0;
        new StringReader("jtAIWWVk" + iopswag2a + gpleweul1a + xkvmrzujbe0a + "jtAIWWVk" + QNBvPIC + PQTSeYH + PdVUekD + mQZtAzp + LbOTlUy + PYvAftg + PvPsyvQ + QLcyIgA + QBldRMb + "");
    }

    //垃圾方法
    private void SnaAcHNi(int morbtcqnut0, boolean maktdfe1, int rfpxlohso2, double zdhlvwruz3) {
        double zdhlvwruz3a = zdhlvwruz3;
        int rfpxlohso2a = rfpxlohso2;
        boolean maktdfe1a = maktdfe1;
        int morbtcqnut0a = morbtcqnut0;
        new String("SnaAcHNi" + maktdfe1a + zdhlvwruz3a + rfpxlohso2a + morbtcqnut0a + "SnaAcHNi" + PQTSeYH + QNBvPIC + LbOTlUy + PvPsyvQ + PdVUekD + PYvAftg + mQZtAzp + QLcyIgA + QBldRMb + "");
    }

    //垃圾方法
    private void DIdtQTwg(float dusouir0, int pwhhfoogo1, double jklbcyds2, long vbeqjxwh3, float eughnkprk4) {
        float eughnkprk4a = eughnkprk4;
        long vbeqjxwh3a = vbeqjxwh3;
        double jklbcyds2a = jklbcyds2;
        int pwhhfoogo1a = pwhhfoogo1;
        float dusouir0a = dusouir0;
        new StringBuilder("DIdtQTwg" + vbeqjxwh3a + pwhhfoogo1a + jklbcyds2a + eughnkprk4a + dusouir0a + "DIdtQTwg" + QLcyIgA + PvPsyvQ + PQTSeYH + QNBvPIC + PdVUekD + QBldRMb + PYvAftg + mQZtAzp + LbOTlUy + "");
    }

    //垃圾方法
    private void kyZmXfWn(boolean tlyqgoci0, short qedvqmx1, byte dctplligx2, float egvtpzwppp3, double rukzlhufy4) {
        double rukzlhufy4a = rukzlhufy4;
        float egvtpzwppp3a = egvtpzwppp3;
        byte dctplligx2a = dctplligx2;
        short qedvqmx1a = qedvqmx1;
        boolean tlyqgoci0a = tlyqgoci0;
        Log.i("kyZmXfWn", "kyZmXfWn" + rukzlhufy4a + egvtpzwppp3a + dctplligx2a + qedvqmx1a + tlyqgoci0a + "kyZmXfWn" + PdVUekD + QBldRMb + PYvAftg + QNBvPIC + PvPsyvQ + mQZtAzp + LbOTlUy + QLcyIgA + PQTSeYH + "");
    }

    //垃圾方法
    private void KaNWqRGj(boolean ivsittbr0) {
        boolean ivsittbr0a = ivsittbr0;
        TextUtils.isEmpty("KaNWqRGj" + ivsittbr0a + "KaNWqRGj" + PQTSeYH + LbOTlUy + PdVUekD + QNBvPIC + mQZtAzp + PvPsyvQ + QBldRMb + PYvAftg + QLcyIgA + "");
    }

    //垃圾方法
    private void bESnXHck(char fzedvtglm0, short kgasgigpju1, float xkwtjxnhjr2, boolean xgzhanppli3, boolean omjxlka4) {
        boolean omjxlka4a = omjxlka4;
        boolean xgzhanppli3a = xgzhanppli3;
        float xkwtjxnhjr2a = xkwtjxnhjr2;
        short kgasgigpju1a = kgasgigpju1;
        char fzedvtglm0a = fzedvtglm0;
        new StringBuffer("bESnXHck" + fzedvtglm0a + omjxlka4a + xkwtjxnhjr2a + xgzhanppli3a + kgasgigpju1a + "bESnXHck" + PvPsyvQ + mQZtAzp + LbOTlUy + QNBvPIC + PYvAftg + PdVUekD + QBldRMb + QLcyIgA + PQTSeYH + "");
    }

    //垃圾方法
    private void tkJQNloP(double fpyzkfxkh0) {
        double fpyzkfxkh0a = fpyzkfxkh0;
        new StringBuilder("tkJQNloP" + fpyzkfxkh0a + "tkJQNloP" + QBldRMb + PvPsyvQ + mQZtAzp + QNBvPIC + QLcyIgA + PdVUekD + LbOTlUy + PYvAftg + PQTSeYH + "");
    }

    //垃圾方法
    private void mjzgiGJZ(long lzpduouova0, int povlehbtn1) {
        int povlehbtn1a = povlehbtn1;
        long lzpduouova0a = lzpduouova0;
        new File("mjzgiGJZ" + lzpduouova0a + povlehbtn1a + "mjzgiGJZ" + QLcyIgA + QBldRMb + PvPsyvQ + LbOTlUy + QNBvPIC + PYvAftg + PQTSeYH + PdVUekD + mQZtAzp + "");
    }

    //垃圾方法
    private void UuKOxhoB(boolean xkvfgob0, int girjcyeur1) {
        int girjcyeur1a = girjcyeur1;
        boolean xkvfgob0a = xkvfgob0;
        System.out.println("UuKOxhoB" + xkvfgob0a + girjcyeur1a + "UuKOxhoB" + QLcyIgA + PdVUekD + mQZtAzp + PYvAftg + QNBvPIC + PvPsyvQ + PQTSeYH + QBldRMb + LbOTlUy + "");
    }

    //垃圾方法
    private void iqyCUqSa(long ozinjqqli0, byte njlsedy1, double qxpexam2, double fyevvpanot3, long nloknhrjo4) {
        long nloknhrjo4a = nloknhrjo4;
        double fyevvpanot3a = fyevvpanot3;
        double qxpexam2a = qxpexam2;
        byte njlsedy1a = njlsedy1;
        long ozinjqqli0a = ozinjqqli0;
        System.out.println("iqyCUqSa" + fyevvpanot3a + qxpexam2a + njlsedy1a + ozinjqqli0a + nloknhrjo4a + "iqyCUqSa" + PdVUekD + PvPsyvQ + LbOTlUy + QNBvPIC + QLcyIgA + PYvAftg + QBldRMb + PQTSeYH + mQZtAzp + "");
    }

    //垃圾方法
    private void qSSacbnN(short xgbpjwhmb0, float odszfblmez1, long khsoxgyb2, byte vhdeoegkr3) {
        byte vhdeoegkr3a = vhdeoegkr3;
        long khsoxgyb2a = khsoxgyb2;
        float odszfblmez1a = odszfblmez1;
        short xgbpjwhmb0a = xgbpjwhmb0;
        new File("qSSacbnN" + vhdeoegkr3a + xgbpjwhmb0a + khsoxgyb2a + odszfblmez1a + "qSSacbnN" + PYvAftg + LbOTlUy + QBldRMb + QNBvPIC + QLcyIgA + PvPsyvQ + mQZtAzp + PdVUekD + PQTSeYH + "");
    }

    //垃圾方法
    private void lppaPRMD(double xytyziu0, float fdwldtm1, int pckyktvjlf2, float jkjbdzvdzb3, short bfpaogr4) {
        short bfpaogr4a = bfpaogr4;
        float jkjbdzvdzb3a = jkjbdzvdzb3;
        int pckyktvjlf2a = pckyktvjlf2;
        float fdwldtm1a = fdwldtm1;
        double xytyziu0a = xytyziu0;
        Log.i("lppaPRMD", "lppaPRMD" + jkjbdzvdzb3a + xytyziu0a + pckyktvjlf2a + bfpaogr4a + fdwldtm1a + "lppaPRMD" + LbOTlUy + PQTSeYH + QNBvPIC + mQZtAzp + QBldRMb + PdVUekD + PvPsyvQ + QLcyIgA + PYvAftg + "");
    }

    //垃圾方法
    private void DcVXoqZo(char siuxjxu0, byte gcffmsuqzo1) {
        byte gcffmsuqzo1a = gcffmsuqzo1;
        char siuxjxu0a = siuxjxu0;
        TextUtils.isDigitsOnly("DcVXoqZo" + siuxjxu0a + gcffmsuqzo1a + "DcVXoqZo" + mQZtAzp + QLcyIgA + QNBvPIC + PdVUekD + LbOTlUy + PQTSeYH + PvPsyvQ + QBldRMb + PYvAftg + "");
    }

    //垃圾方法
    private void yZHsPgFj(int tjgwbyxtl0, float vptufhwk1) {
        float vptufhwk1a = vptufhwk1;
        int tjgwbyxtl0a = tjgwbyxtl0;
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        float vptufhwk1 = 26.26f;
        int tjgwbyxtl0 = 31;
        byte gcffmsuqzo1 = 2;
        char siuxjxu0 = 32;
        short bfpaogr4 = 41;
        float jkjbdzvdzb3 = 45.45f;
        int pckyktvjlf2 = 3;
        float fdwldtm1 = 69.69f;
        double xytyziu0 = 75.75;
        byte vhdeoegkr3 = 51;
        long khsoxgyb2 = 76L;
        float odszfblmez1 = 76.76f;
        short xgbpjwhmb0 = 93;
        long nloknhrjo4 = 42L;
        double fyevvpanot3 = 95.95;
        double qxpexam2 = 97.97;
        byte njlsedy1 = 82;
        long ozinjqqli0 = 67L;
        int girjcyeur1 = 22;
        boolean xkvfgob0 = false;
        int povlehbtn1 = 12;
        long lzpduouova0 = 96L;
        double fpyzkfxkh0 = 62.62;
        boolean omjxlka4 = false;
        boolean xgzhanppli3 = true;
        float xkwtjxnhjr2 = 89.89f;
        short kgasgigpju1 = 94;
        char fzedvtglm0 = 4;
        boolean ivsittbr0 = false;
        double rukzlhufy4 = 86.86;
        float egvtpzwppp3 = 46.46f;
        byte dctplligx2 = 81;
        short qedvqmx1 = 34;
        boolean tlyqgoci0 = false;
        float eughnkprk4 = 81.81f;
        long vbeqjxwh3 = 41L;
        double jklbcyds2 = 41.41;
        int pwhhfoogo1 = 40;
        float dusouir0 = 51.51f;
        double zdhlvwruz3 = 18.18;
        int rfpxlohso2 = 19;
        boolean maktdfe1 = true;
        int morbtcqnut0 = 86;
        double iopswag2 = 42.42;
        double gpleweul1 = 55.55;
        byte xkvmrzujbe0 = 11;
        double cyhxysjfne4 = 3.3;
        boolean hnflzmt3 = true;
        long gqnyrrpii2 = 51L;
        char ackoten1 = 90;
        byte jzxrjtrs0 = 79;
        float wkdqvmi3 = 70.70f;
        double givlrjfeb2 = 94.94;
        char nrinbnf1 = 12;
        byte kexgxgat0 = 84;
        boolean wkywtfna4 = false;
        float zzeosno3 = 93.93f;
        long pwynervsjy2 = 92L;
        double xwuwcbapy1 = 48.48;
        int ipcxzvyoml0 = 32;
        boolean iklsdlnz2 = true;
        double jsycmfiuh1 = 54.54;
        boolean yhbmtfzbd0 = true;
        char wsbnnane2 = 53;
        boolean gkjsaupin1 = true;
        int ezkcfrj0 = 33;
        char igxdnahd4 = 5;
        byte elocrmw3 = 75;
        float dxzkcqokf2 = 21.21f;
        int gayztunicm1 = 9;
        boolean oveudwdth0 = true;
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
    static private void NEBRarJO(boolean qvfpwha0, short vcatiaunyl1, int mdtvhznixb2, int amdfnfl3) {
        int amdfnfl3a = amdfnfl3;
        int mdtvhznixb2a = mdtvhznixb2;
        short vcatiaunyl1a = vcatiaunyl1;
        boolean qvfpwha0a = qvfpwha0;
        new StringBuilder("NEBRarJO" + qvfpwha0a + vcatiaunyl1a + mdtvhznixb2a + amdfnfl3a + "NEBRarJO" + "");
    }

    //垃圾方法
    static private void iyMVlKXr(float lcbidkh0, byte lmfzfie1, short geiorfv2) {
        short geiorfv2a = geiorfv2;
        byte lmfzfie1a = lmfzfie1;
        float lcbidkh0a = lcbidkh0;
        TextUtils.isEmpty("iyMVlKXr" + lmfzfie1a + geiorfv2a + lcbidkh0a + "iyMVlKXr" + "");
    }

    //垃圾方法
    static private void HDawxXwO(boolean unkinnnubg0, short vdzquicf1) {
        short vdzquicf1a = vdzquicf1;
        boolean unkinnnubg0a = unkinnnubg0;
        new Thread("HDawxXwO" + vdzquicf1a + unkinnnubg0a + "HDawxXwO" + "");
    }

    //垃圾方法
    static private void TonXoPqh(short zfayoglrec0) {
        short zfayoglrec0a = zfayoglrec0;
        new Intent("TonXoPqh" + zfayoglrec0a + "TonXoPqh" + "");
    }

    //垃圾方法
    static private void tWttHKrZ(byte gzboztkmx0) {
        byte gzboztkmx0a = gzboztkmx0;
        new File("tWttHKrZ" + gzboztkmx0a + "tWttHKrZ" + "");
    }

    //垃圾方法
    static private void yzmHwJoI(long nmiphwfdri0, char jzstpssmw1, short szeavofk2, short ghvduphues3) {
        short ghvduphues3a = ghvduphues3;
        short szeavofk2a = szeavofk2;
        char jzstpssmw1a = jzstpssmw1;
        long nmiphwfdri0a = nmiphwfdri0;
        TextUtils.isDigitsOnly("yzmHwJoI" + jzstpssmw1a + nmiphwfdri0a + szeavofk2a + ghvduphues3a + "yzmHwJoI" + "");
    }

    //垃圾方法
    static private void LoZjZOZl(int knreydhsxa0, char ijtfdndgj1, long tozkxlwkw2, short itjszpxow3, char tzmyizzja4) {
        char tzmyizzja4a = tzmyizzja4;
        short itjszpxow3a = itjszpxow3;
        long tozkxlwkw2a = tozkxlwkw2;
        char ijtfdndgj1a = ijtfdndgj1;
        int knreydhsxa0a = knreydhsxa0;
        new StringReader("LoZjZOZl" + tzmyizzja4a + ijtfdndgj1a + itjszpxow3a + tozkxlwkw2a + knreydhsxa0a + "LoZjZOZl" + "");
    }

    //垃圾方法
    static private void gXDmOEoz(boolean kknivnox0, double zxaowbaij1) {
        double zxaowbaij1a = zxaowbaij1;
        boolean kknivnox0a = kknivnox0;
        TextUtils.isEmpty("gXDmOEoz" + zxaowbaij1a + kknivnox0a + "gXDmOEoz" + "");
    }

    //垃圾方法
    static private void YpLFbebK(float jsjxjwii0, short tuojhjuloc1, char vnxenvse2, float qcrnhpi3) {
        float qcrnhpi3a = qcrnhpi3;
        char vnxenvse2a = vnxenvse2;
        short tuojhjuloc1a = tuojhjuloc1;
        float jsjxjwii0a = jsjxjwii0;
    }

    //垃圾方法
    static private void PlxkShRa(double uyfkkxfxli0, float ndcyjtzbnk1) {
        float ndcyjtzbnk1a = ndcyjtzbnk1;
        double uyfkkxfxli0a = uyfkkxfxli0;
    }

    //垃圾方法
    static private void LHWXwZKr(float encqcnriuq0) {
        float encqcnriuq0a = encqcnriuq0;
        new StringBuffer("LHWXwZKr" + encqcnriuq0a + "LHWXwZKr" + "");
    }

    //垃圾方法
    static private void entKTKan(char umxrcfxjpx0) {
        char umxrcfxjpx0a = umxrcfxjpx0;
        new StringBuilder("entKTKan" + umxrcfxjpx0a + "entKTKan" + "");
    }

    //垃圾方法
    static private void IBUnswYx(boolean qyhpwkeht0, float xpkzhweg1, long wbnbsobwee2) {
        long wbnbsobwee2a = wbnbsobwee2;
        float xpkzhweg1a = xpkzhweg1;
        boolean qyhpwkeht0a = qyhpwkeht0;
        new StringReader("IBUnswYx" + qyhpwkeht0a + xpkzhweg1a + wbnbsobwee2a + "IBUnswYx" + "");
    }

    //垃圾方法
    static private void wdYweDfz(short diuewrczfv0, boolean lppenmw1, boolean uhbhugasb2, byte bskowpx3, byte wbrlcyouz4) {
        byte wbrlcyouz4a = wbrlcyouz4;
        byte bskowpx3a = bskowpx3;
        boolean uhbhugasb2a = uhbhugasb2;
        boolean lppenmw1a = lppenmw1;
        short diuewrczfv0a = diuewrczfv0;
        new String("wdYweDfz" + uhbhugasb2a + bskowpx3a + wbrlcyouz4a + diuewrczfv0a + lppenmw1a + "wdYweDfz" + "");
    }

    //垃圾方法
    static private void wSJnkwRQ(int rhgeugw0, char uhqsexdysy1, int qadceuxlm2, int obalfvmqim3) {
        int obalfvmqim3a = obalfvmqim3;
        int qadceuxlm2a = qadceuxlm2;
        char uhqsexdysy1a = uhqsexdysy1;
        int rhgeugw0a = rhgeugw0;
        System.out.println("wSJnkwRQ" + obalfvmqim3a + uhqsexdysy1a + qadceuxlm2a + rhgeugw0a + "wSJnkwRQ" + "");
    }

    //垃圾方法
    static private void TOXvkJEC(double rjsbjksi0, char qfnfrvfr1, char winwgxzvvw2, double iaesztw3, float xiweazen4) {
        float xiweazen4a = xiweazen4;
        double iaesztw3a = iaesztw3;
        char winwgxzvvw2a = winwgxzvvw2;
        char qfnfrvfr1a = qfnfrvfr1;
        double rjsbjksi0a = rjsbjksi0;
        System.out.println("TOXvkJEC" + iaesztw3a + xiweazen4a + winwgxzvvw2a + rjsbjksi0a + qfnfrvfr1a + "TOXvkJEC" + "");
    }

    //垃圾方法
    static private void alCahwCi(int csblrntzc0, int esfxeljnkd1) {
        int esfxeljnkd1a = esfxeljnkd1;
        int csblrntzc0a = csblrntzc0;
        new StringReader("alCahwCi" + esfxeljnkd1a + csblrntzc0a + "alCahwCi" + "");
    }

    //垃圾方法
    static private void EyoseOZH(long egspaxn0, double sejriqdc1) {
        double sejriqdc1a = sejriqdc1;
        long egspaxn0a = egspaxn0;
        new String("EyoseOZH" + sejriqdc1a + egspaxn0a + "EyoseOZH" + "");
    }

    //垃圾方法
    static private void TwLraMSt(float aonskoa0) {
        float aonskoa0a = aonskoa0;
        new StringReader("TwLraMSt" + aonskoa0a + "TwLraMSt" + "");
    }

    //垃圾方法
    static private void LblDWBes(byte vzzopgwv0, float ccghffv1) {
        float ccghffv1a = ccghffv1;
        byte vzzopgwv0a = vzzopgwv0;
        Log.w("LblDWBes", "LblDWBes" + ccghffv1a + vzzopgwv0a + "LblDWBes" + "");
    }

    //垃圾方法
    static private void pGoroPSF(double fkruoshe0, char rymnoklz1, short rbgvdalevx2, int plmqowmxsc3) {
        int plmqowmxsc3a = plmqowmxsc3;
        short rbgvdalevx2a = rbgvdalevx2;
        char rymnoklz1a = rymnoklz1;
        double fkruoshe0a = fkruoshe0;
        TextUtils.isDigitsOnly("pGoroPSF" + rbgvdalevx2a + plmqowmxsc3a + fkruoshe0a + rymnoklz1a + "pGoroPSF" + "");
    }

    //垃圾方法
    static private void aIZwptpj(int vkexfgupta0, long cdwhham1) {
        long cdwhham1a = cdwhham1;
        int vkexfgupta0a = vkexfgupta0;
        new String("aIZwptpj" + vkexfgupta0a + cdwhham1a + "aIZwptpj" + "");
    }

    //垃圾方法
    static private void hZNgBroR(char sfxzmqw0, long drfsqwfrb1, float akvnwdm2) {
        float akvnwdm2a = akvnwdm2;
        long drfsqwfrb1a = drfsqwfrb1;
        char sfxzmqw0a = sfxzmqw0;
    }

    //垃圾方法
    static private void UPijUqET(boolean qmsoclx0, short ghyesnz1, double troiqvo2, int bmqpepa3, float cloqskk4) {
        float cloqskk4a = cloqskk4;
        int bmqpepa3a = bmqpepa3;
        double troiqvo2a = troiqvo2;
        short ghyesnz1a = ghyesnz1;
        boolean qmsoclx0a = qmsoclx0;
        Log.w("UPijUqET", "UPijUqET" + troiqvo2a + ghyesnz1a + qmsoclx0a + cloqskk4a + bmqpepa3a + "UPijUqET" + "");
    }

    //垃圾方法
    static private void BiOCTJQT(int jowqjbxb0) {
        int jowqjbxb0a = jowqjbxb0;
    }

    //垃圾方法
    static private void XMsDpEzB(byte joynevk0, boolean uciohpc1, byte xcwjflvoew2, short legduzwq3, double qziqqlnkz4) {
        double qziqqlnkz4a = qziqqlnkz4;
        short legduzwq3a = legduzwq3;
        byte xcwjflvoew2a = xcwjflvoew2;
        boolean uciohpc1a = uciohpc1;
        byte joynevk0a = joynevk0;
        new StringBuilder("XMsDpEzB" + joynevk0a + legduzwq3a + qziqqlnkz4a + xcwjflvoew2a + uciohpc1a + "XMsDpEzB" + "");
    }

    //垃圾方法
    static private void lNEFWTSY(short xsvkcuel0, byte kclaeygfsj1, short cketknjgu2) {
        short cketknjgu2a = cketknjgu2;
        byte kclaeygfsj1a = kclaeygfsj1;
        short xsvkcuel0a = xsvkcuel0;
        new String("lNEFWTSY" + xsvkcuel0a + cketknjgu2a + kclaeygfsj1a + "lNEFWTSY" + "");
    }

    //垃圾方法
    static private void ToGFiSYw(float owvfrslwwv0, double qgwgntxuja1, byte jvwyqeftai2) {
        byte jvwyqeftai2a = jvwyqeftai2;
        double qgwgntxuja1a = qgwgntxuja1;
        float owvfrslwwv0a = owvfrslwwv0;
        new File("ToGFiSYw" + qgwgntxuja1a + owvfrslwwv0a + jvwyqeftai2a + "ToGFiSYw" + "");
    }

    //垃圾方法
    static private void jQSWNuyh(char ootwdjp0, long chmrvwpo1, byte jyhjhkngw2, float ajdouux3) {
        float ajdouux3a = ajdouux3;
        byte jyhjhkngw2a = jyhjhkngw2;
        long chmrvwpo1a = chmrvwpo1;
        char ootwdjp0a = ootwdjp0;
    }

    //垃圾方法
    static private void HoEFbBGJ(long ccirvgzmk0, byte pwcpfbcyzh1, short gvxmajju2, boolean eygabsg3, char eylvnvolwm4) {
        char eylvnvolwm4a = eylvnvolwm4;
        boolean eygabsg3a = eygabsg3;
        short gvxmajju2a = gvxmajju2;
        byte pwcpfbcyzh1a = pwcpfbcyzh1;
        long ccirvgzmk0a = ccirvgzmk0;
        TextUtils.isEmpty("HoEFbBGJ" + pwcpfbcyzh1a + gvxmajju2a + eylvnvolwm4a + eygabsg3a + ccirvgzmk0a + "HoEFbBGJ" + "");
    }

    //垃圾方法
    static private void lAjaOyQQ(double tpbieyd0) {
        double tpbieyd0a = tpbieyd0;
        Log.e("lAjaOyQQ", "lAjaOyQQ" + tpbieyd0a + "lAjaOyQQ" + "");
    }

    //垃圾方法
    static private void OIZSkzSH(boolean inwndmvbxg0) {
        boolean inwndmvbxg0a = inwndmvbxg0;
        new Intent("OIZSkzSH" + inwndmvbxg0a + "OIZSkzSH" + "");
    }

    //垃圾方法
    static private void SZEmgVeG(boolean uqtctmhw0) {
        boolean uqtctmhw0a = uqtctmhw0;
        new WeakReference("SZEmgVeG" + uqtctmhw0a + "SZEmgVeG" + "");
    }

    //垃圾方法
    static private void ngqCCuHT(double dzlubofpr0, float viltyxyecx1, long kzhmrdquzb2) {
        long kzhmrdquzb2a = kzhmrdquzb2;
        float viltyxyecx1a = viltyxyecx1;
        double dzlubofpr0a = dzlubofpr0;
        System.out.println("ngqCCuHT" + dzlubofpr0a + viltyxyecx1a + kzhmrdquzb2a + "ngqCCuHT" + "");
    }

    //垃圾方法
    static private void TyQlBtHU(float ijxkdcc0, short pgqkxughk1, int hgkewfmgyz2, int hlzvxmt3, boolean lwufunb4) {
        boolean lwufunb4a = lwufunb4;
        int hlzvxmt3a = hlzvxmt3;
        int hgkewfmgyz2a = hgkewfmgyz2;
        short pgqkxughk1a = pgqkxughk1;
        float ijxkdcc0a = ijxkdcc0;
        new Intent("TyQlBtHU" + ijxkdcc0a + lwufunb4a + pgqkxughk1a + hlzvxmt3a + hgkewfmgyz2a + "TyQlBtHU" + "");
    }

    //垃圾方法
    static private void MsMOtcBj(short tgsjqakkoj0) {
        short tgsjqakkoj0a = tgsjqakkoj0;
        TextUtils.isDigitsOnly("MsMOtcBj" + tgsjqakkoj0a + "MsMOtcBj" + "");
    }

    //垃圾方法
    static private void iPESBPDk(short cmexocs0, int ooljshj1, boolean cbghsfapra2) {
        boolean cbghsfapra2a = cbghsfapra2;
        int ooljshj1a = ooljshj1;
        short cmexocs0a = cmexocs0;
        new String("iPESBPDk" + cmexocs0a + cbghsfapra2a + ooljshj1a + "iPESBPDk" + "");
    }

    //垃圾方法
    static private void dXOuAcIc(long eknnpljr0, char caombxhgif1) {
        char caombxhgif1a = caombxhgif1;
        long eknnpljr0a = eknnpljr0;
        Log.w("dXOuAcIc", "dXOuAcIc" + eknnpljr0a + caombxhgif1a + "dXOuAcIc" + "");
    }

    //垃圾方法
    static private void zebAHErS(float hcqpmwjv0, long xuatlhxv1, int vfpyeqbkh2, byte cvuvnlvjg3, int fuophxvxks4) {
        int fuophxvxks4a = fuophxvxks4;
        byte cvuvnlvjg3a = cvuvnlvjg3;
        int vfpyeqbkh2a = vfpyeqbkh2;
        long xuatlhxv1a = xuatlhxv1;
        float hcqpmwjv0a = hcqpmwjv0;
        Log.w("zebAHErS", "zebAHErS" + xuatlhxv1a + vfpyeqbkh2a + fuophxvxks4a + hcqpmwjv0a + cvuvnlvjg3a + "zebAHErS" + "");
    }

    //垃圾方法
    static private void JLJVVOAz(int oxlohncbw0) {
        int oxlohncbw0a = oxlohncbw0;
        new StringBuilder("JLJVVOAz" + oxlohncbw0a + "JLJVVOAz" + "");
    }

    //垃圾方法
    static private void FHBlfFaO(float tuepnjk0, boolean yrasbvk1) {
        boolean yrasbvk1a = yrasbvk1;
        float tuepnjk0a = tuepnjk0;
        new String("FHBlfFaO" + tuepnjk0a + yrasbvk1a + "FHBlfFaO" + "");
    }

    //垃圾方法
    static private void jFvWpOkN(char emjwqsp0, char sapmmstokj1) {
        char sapmmstokj1a = sapmmstokj1;
        char emjwqsp0a = emjwqsp0;
        new Thread("jFvWpOkN" + emjwqsp0a + sapmmstokj1a + "jFvWpOkN" + "");
    }

    //垃圾方法
    static private void SWBnYoGq(char paizmquygm0, boolean zivhocfqnj1) {
        boolean zivhocfqnj1a = zivhocfqnj1;
        char paizmquygm0a = paizmquygm0;
        new StringReader("SWBnYoGq" + paizmquygm0a + zivhocfqnj1a + "SWBnYoGq" + "");
    }

    //垃圾方法
    static private void HlxmkUOM(byte zefkqjeqje0, int zmqlrjpwu1, byte vnatvxbf2, double sdzlemqqu3) {
        double sdzlemqqu3a = sdzlemqqu3;
        byte vnatvxbf2a = vnatvxbf2;
        int zmqlrjpwu1a = zmqlrjpwu1;
        byte zefkqjeqje0a = zefkqjeqje0;
        new AttributedString("HlxmkUOM" + zefkqjeqje0a + vnatvxbf2a + sdzlemqqu3a + zmqlrjpwu1a + "HlxmkUOM" + "");
    }

    public static Notification createOngoingNotification(String channelName) {
        double sdzlemqqu3 = 21.21;
        byte vnatvxbf2 = 43;
        int zmqlrjpwu1 = 90;
        byte zefkqjeqje0 = 35;
        boolean zivhocfqnj1 = false;
        char paizmquygm0 = 36;
        char sapmmstokj1 = 99;
        char emjwqsp0 = 40;
        boolean yrasbvk1 = true;
        float tuepnjk0 = 29.29f;
        int oxlohncbw0 = 97;
        int fuophxvxks4 = 13;
        byte cvuvnlvjg3 = 79;
        int vfpyeqbkh2 = 96;
        long xuatlhxv1 = 6L;
        float hcqpmwjv0 = 30.30f;
        char caombxhgif1 = 100;
        long eknnpljr0 = 78L;
        boolean cbghsfapra2 = true;
        int ooljshj1 = 4;
        short cmexocs0 = 4;
        short tgsjqakkoj0 = 12;
        boolean lwufunb4 = false;
        int hlzvxmt3 = 1;
        int hgkewfmgyz2 = 34;
        short pgqkxughk1 = 90;
        float ijxkdcc0 = 17.17f;
        long kzhmrdquzb2 = 3L;
        float viltyxyecx1 = 26.26f;
        double dzlubofpr0 = 59.59;
        boolean uqtctmhw0 = false;
        boolean inwndmvbxg0 = true;
        double tpbieyd0 = 55.55;
        char eylvnvolwm4 = 50;
        boolean eygabsg3 = true;
        short gvxmajju2 = 97;
        byte pwcpfbcyzh1 = 3;
        long ccirvgzmk0 = 71L;
        float ajdouux3 = 62.62f;
        byte jyhjhkngw2 = 77;
        long chmrvwpo1 = 51L;
        char ootwdjp0 = 2;
        byte jvwyqeftai2 = 40;
        double qgwgntxuja1 = 35.35;
        float owvfrslwwv0 = 26.26f;
        short cketknjgu2 = 48;
        byte kclaeygfsj1 = 51;
        short xsvkcuel0 = 62;
        double qziqqlnkz4 = 53.53;
        short legduzwq3 = 75;
        byte xcwjflvoew2 = 89;
        boolean uciohpc1 = false;
        byte joynevk0 = 68;
        int jowqjbxb0 = 84;
        float cloqskk4 = 66.66f;
        int bmqpepa3 = 59;
        double troiqvo2 = 71.71;
        short ghyesnz1 = 4;
        boolean qmsoclx0 = true;
        float akvnwdm2 = 6.6f;
        long drfsqwfrb1 = 6L;
        char sfxzmqw0 = 8;
        long cdwhham1 = 68L;
        int vkexfgupta0 = 34;
        int plmqowmxsc3 = 94;
        short rbgvdalevx2 = 49;
        char rymnoklz1 = 31;
        double fkruoshe0 = 93.93;
        float ccghffv1 = 11.11f;
        byte vzzopgwv0 = 74;
        float aonskoa0 = 16.16f;
        double sejriqdc1 = 29.29;
        long egspaxn0 = 30L;
        int esfxeljnkd1 = 64;
        int csblrntzc0 = 24;
        float xiweazen4 = 97.97f;
        double iaesztw3 = 75.75;
        char winwgxzvvw2 = 14;
        char qfnfrvfr1 = 68;
        double rjsbjksi0 = 18.18;
        int obalfvmqim3 = 58;
        int qadceuxlm2 = 81;
        char uhqsexdysy1 = 25;
        int rhgeugw0 = 52;
        byte wbrlcyouz4 = 95;
        byte bskowpx3 = 98;
        boolean uhbhugasb2 = false;
        boolean lppenmw1 = true;
        short diuewrczfv0 = 67;
        long wbnbsobwee2 = 97L;
        float xpkzhweg1 = 0.0f;
        boolean qyhpwkeht0 = true;
        char umxrcfxjpx0 = 45;
        float encqcnriuq0 = 17.17f;
        float ndcyjtzbnk1 = 63.63f;
        double uyfkkxfxli0 = 87.87;
        float qcrnhpi3 = 0.0f;
        char vnxenvse2 = 24;
        short tuojhjuloc1 = 59;
        float jsjxjwii0 = 57.57f;
        double zxaowbaij1 = 53.53;
        boolean kknivnox0 = true;
        char tzmyizzja4 = 76;
        short itjszpxow3 = 30;
        long tozkxlwkw2 = 24L;
        char ijtfdndgj1 = 72;
        int knreydhsxa0 = 40;
        short ghvduphues3 = 18;
        short szeavofk2 = 38;
        char jzstpssmw1 = 97;
        long nmiphwfdri0 = 78L;
        byte gzboztkmx0 = 8;
        short zfayoglrec0 = 88;
        short vdzquicf1 = 8;
        boolean unkinnnubg0 = false;
        short geiorfv2 = 42;
        byte lmfzfie1 = 42;
        float lcbidkh0 = 57.57f;
        int amdfnfl3 = 37;
        int mdtvhznixb2 = 28;
        short vcatiaunyl1 = 37;
        boolean qvfpwha0 = false;
        HoEFbBGJ(ccirvgzmk0, pwcpfbcyzh1, gvxmajju2, eygabsg3, eylvnvolwm4);
        LHWXwZKr(encqcnriuq0);
        XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
        BiOCTJQT(jowqjbxb0);
        LHWXwZKr(encqcnriuq0);
        gXDmOEoz(kknivnox0, zxaowbaij1);
        lNEFWTSY(xsvkcuel0, kclaeygfsj1, cketknjgu2);
        if (SpeedManager.isDebug) {
            HDawxXwO(unkinnnubg0, vdzquicf1);
            zebAHErS(hcqpmwjv0, xuatlhxv1, vfpyeqbkh2, cvuvnlvjg3, fuophxvxks4);
            TyQlBtHU(ijxkdcc0, pgqkxughk1, hgkewfmgyz2, hlzvxmt3, lwufunb4);
            TwLraMSt(aonskoa0);
            UPijUqET(qmsoclx0, ghyesnz1, troiqvo2, bmqpepa3, cloqskk4);
            YpLFbebK(jsjxjwii0, tuojhjuloc1, vnxenvse2, qcrnhpi3);
            FHBlfFaO(tuepnjk0, yrasbvk1);
            IBUnswYx(qyhpwkeht0, xpkzhweg1, wbnbsobwee2);
            gXDmOEoz(kknivnox0, zxaowbaij1);
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        NotificationManager manager = (NotificationManager) SpeedManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
        IBUnswYx(qyhpwkeht0, xpkzhweg1, wbnbsobwee2);
        EyoseOZH(egspaxn0, sejriqdc1);
        zebAHErS(hcqpmwjv0, xuatlhxv1, vfpyeqbkh2, cvuvnlvjg3, fuophxvxks4);
        iPESBPDk(cmexocs0, ooljshj1, cbghsfapra2);
        yzmHwJoI(nmiphwfdri0, jzstpssmw1, szeavofk2, ghvduphues3);
        lAjaOyQQ(tpbieyd0);
        EyoseOZH(egspaxn0, sejriqdc1);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(false);
            channel.enableVibration(false);
            TyQlBtHU(ijxkdcc0, pgqkxughk1, hgkewfmgyz2, hlzvxmt3, lwufunb4);
            dXOuAcIc(eknnpljr0, caombxhgif1);
            entKTKan(umxrcfxjpx0);
            lNEFWTSY(xsvkcuel0, kclaeygfsj1, cketknjgu2);
            YpLFbebK(jsjxjwii0, tuojhjuloc1, vnxenvse2, qcrnhpi3);
            SWBnYoGq(paizmquygm0, zivhocfqnj1);
            lNEFWTSY(xsvkcuel0, kclaeygfsj1, cketknjgu2);
            jFvWpOkN(emjwqsp0, sapmmstokj1);
            pGoroPSF(fkruoshe0, rymnoklz1, rbgvdalevx2, plmqowmxsc3);
            XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
            channel.setSound((Uri) null, (AudioAttributes) null);
            LHWXwZKr(encqcnriuq0);
            lNEFWTSY(xsvkcuel0, kclaeygfsj1, cketknjgu2);
            HlxmkUOM(zefkqjeqje0, zmqlrjpwu1, vnatvxbf2, sdzlemqqu3);
            dXOuAcIc(eknnpljr0, caombxhgif1);
            FHBlfFaO(tuepnjk0, yrasbvk1);
            TonXoPqh(zfayoglrec0);
            HoEFbBGJ(ccirvgzmk0, pwcpfbcyzh1, gvxmajju2, eygabsg3, eylvnvolwm4);
            channel.setLockscreenVisibility(-1);
            JLJVVOAz(oxlohncbw0);
            iyMVlKXr(lcbidkh0, lmfzfie1, geiorfv2);
            LHWXwZKr(encqcnriuq0);
            TwLraMSt(aonskoa0);
            XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
            tWttHKrZ(gzboztkmx0);
            HlxmkUOM(zefkqjeqje0, zmqlrjpwu1, vnatvxbf2, sdzlemqqu3);
            ToGFiSYw(owvfrslwwv0, qgwgntxuja1, jvwyqeftai2);
            lAjaOyQQ(tpbieyd0);
            channel.setLightColor(0);
            HoEFbBGJ(ccirvgzmk0, pwcpfbcyzh1, gvxmajju2, eygabsg3, eylvnvolwm4);
            IBUnswYx(qyhpwkeht0, xpkzhweg1, wbnbsobwee2);
            UPijUqET(qmsoclx0, ghyesnz1, troiqvo2, bmqpepa3, cloqskk4);
            OIZSkzSH(inwndmvbxg0);
            IBUnswYx(qyhpwkeht0, xpkzhweg1, wbnbsobwee2);
            wSJnkwRQ(rhgeugw0, uhqsexdysy1, qadceuxlm2, obalfvmqim3);
            aIZwptpj(vkexfgupta0, cdwhham1);
            channel.setVibrationPattern(new long[] { 0L });
            manager.createNotificationChannel(channel);
        }
        iyMVlKXr(lcbidkh0, lmfzfie1, geiorfv2);
        lAjaOyQQ(tpbieyd0);
        NEBRarJO(qvfpwha0, vcatiaunyl1, mdtvhznixb2, amdfnfl3);
        LHWXwZKr(encqcnriuq0);
        FHBlfFaO(tuepnjk0, yrasbvk1);
        SWBnYoGq(paizmquygm0, zivhocfqnj1);
        wdYweDfz(diuewrczfv0, lppenmw1, uhbhugasb2, bskowpx3, wbrlcyouz4);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(SpeedManager.mContext, CHANNEL_ID1);
        iyMVlKXr(lcbidkh0, lmfzfie1, geiorfv2);
        TOXvkJEC(rjsbjksi0, qfnfrvfr1, winwgxzvvw2, iaesztw3, xiweazen4);
        HoEFbBGJ(ccirvgzmk0, pwcpfbcyzh1, gvxmajju2, eygabsg3, eylvnvolwm4);
        XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
        RemoteViews remoteView = SpeedNtFgHelper.ongoingRemoteView();
        RemoteViews remoteViewBig = SpeedNtFgHelper.ongoingRemoteViewBig();
        if (VERSION.SDK_INT >= 31) {
            NEBRarJO(qvfpwha0, vcatiaunyl1, mdtvhznixb2, amdfnfl3);
            FHBlfFaO(tuepnjk0, yrasbvk1);
            HoEFbBGJ(ccirvgzmk0, pwcpfbcyzh1, gvxmajju2, eygabsg3, eylvnvolwm4);
            builder.setCustomContentView(remoteView);
            XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
            HDawxXwO(unkinnnubg0, vdzquicf1);
            TOXvkJEC(rjsbjksi0, qfnfrvfr1, winwgxzvvw2, iaesztw3, xiweazen4);
            dXOuAcIc(eknnpljr0, caombxhgif1);
            UPijUqET(qmsoclx0, ghyesnz1, troiqvo2, bmqpepa3, cloqskk4);
            PlxkShRa(uyfkkxfxli0, ndcyjtzbnk1);
            builder.setContent(remoteView);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setStyle(// 添加这一行
        new NotificationCompat.DecoratedCustomViewStyle()).setSmallIcon(R.drawable.speed_logo).setShowWhen(true).setOngoing(true).setSound((Uri) null)./*.setNumber(5)*/
        setPriority(NotificationCompat.PRIORITY_DEFAULT).setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound((Uri) null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
        BiOCTJQT(jowqjbxb0);
        wSJnkwRQ(rhgeugw0, uhqsexdysy1, qadceuxlm2, obalfvmqim3);
        XMsDpEzB(joynevk0, uciohpc1, xcwjflvoew2, legduzwq3, qziqqlnkz4);
        notification.flags = 32;
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_online", "", SpeedManager.mContext);
        ToGFiSYw(owvfrslwwv0, qgwgntxuja1, jvwyqeftai2);
        ngqCCuHT(dzlubofpr0, viltyxyecx1, kzhmrdquzb2);
        alCahwCi(csblrntzc0, esfxeljnkd1);
        lAjaOyQQ(tpbieyd0);
        return notification;
    }

    //垃圾变量
    private byte QLcyIgA = 45;

    //垃圾变量
    private int vgHKyIZ = 27;

    //垃圾变量
    private float mQZtAzp = 18.18f;

    //垃圾变量
    private double XsoHpMq = 87.87;

    //垃圾变量
    private boolean LbOTlUy = true;

    //垃圾变量
    private int shDFpHA = 13;

    //垃圾方法
    private void SouRYYlo(long rrgzqxn0, long ycbgezso1, long mcxsxibcx2) {
        long mcxsxibcx2a = mcxsxibcx2;
        long ycbgezso1a = ycbgezso1;
        long rrgzqxn0a = rrgzqxn0;
        Log.w("SouRYYlo", "SouRYYlo" + ycbgezso1a + rrgzqxn0a + mcxsxibcx2a + "SouRYYlo" + PQTSeYH + PvPsyvQ + QNBvPIC + QBldRMb + QLcyIgA + LbOTlUy + mQZtAzp + PdVUekD + PYvAftg + "");
    }

    //垃圾方法
    private void IUtUDckF(int kdqqwfxw0, char empdmflofd1, float gdainrnpv2, double eykmixs3, byte tboifto4) {
        byte tboifto4a = tboifto4;
        double eykmixs3a = eykmixs3;
        float gdainrnpv2a = gdainrnpv2;
        char empdmflofd1a = empdmflofd1;
        int kdqqwfxw0a = kdqqwfxw0;
        TextUtils.isEmpty("IUtUDckF" + tboifto4a + eykmixs3a + empdmflofd1a + gdainrnpv2a + kdqqwfxw0a + "IUtUDckF" + PvPsyvQ + mQZtAzp + PdVUekD + QBldRMb + QLcyIgA + PQTSeYH + QNBvPIC + LbOTlUy + PYvAftg + "");
    }

    //垃圾方法
    private void bhcUojEV(boolean cwkywwy0, float wvrefgl1, boolean xzjddbyj2, char fkzawcexa3, long iaqivts4) {
        long iaqivts4a = iaqivts4;
        char fkzawcexa3a = fkzawcexa3;
        boolean xzjddbyj2a = xzjddbyj2;
        float wvrefgl1a = wvrefgl1;
        boolean cwkywwy0a = cwkywwy0;
        Log.i("bhcUojEV", "bhcUojEV" + fkzawcexa3a + wvrefgl1a + iaqivts4a + xzjddbyj2a + cwkywwy0a + "bhcUojEV" + PQTSeYH + QLcyIgA + QNBvPIC + LbOTlUy + QBldRMb + PvPsyvQ + PdVUekD + mQZtAzp + PYvAftg + "");
    }

    //垃圾方法
    private void MtjkHFVE(short qtmalupj0, char battzaw1, int mgcbnlmedn2, short ssgflma3, double webzbypj4) {
        double webzbypj4a = webzbypj4;
        short ssgflma3a = ssgflma3;
        int mgcbnlmedn2a = mgcbnlmedn2;
        char battzaw1a = battzaw1;
        short qtmalupj0a = qtmalupj0;
        new Thread("MtjkHFVE" + webzbypj4a + qtmalupj0a + mgcbnlmedn2a + battzaw1a + ssgflma3a + "MtjkHFVE" + LbOTlUy + PYvAftg + QNBvPIC + QBldRMb + QLcyIgA + mQZtAzp + PvPsyvQ + PQTSeYH + PdVUekD + "");
    }

    //垃圾方法
    private void ciRPqqIc(boolean ldwtzio0, boolean zxnkpdbhqv1, long bdwgkkihx2) {
        long bdwgkkihx2a = bdwgkkihx2;
        boolean zxnkpdbhqv1a = zxnkpdbhqv1;
        boolean ldwtzio0a = ldwtzio0;
        new WeakReference("ciRPqqIc" + zxnkpdbhqv1a + ldwtzio0a + bdwgkkihx2a + "ciRPqqIc" + mQZtAzp + PYvAftg + QBldRMb + PvPsyvQ + PdVUekD + QLcyIgA + QNBvPIC + PQTSeYH + LbOTlUy + "");
    }

    //垃圾方法
    private void oKUyvfSY(boolean wcwydqg0) {
        boolean wcwydqg0a = wcwydqg0;
        System.out.println("oKUyvfSY" + wcwydqg0a + "oKUyvfSY" + LbOTlUy + PQTSeYH + PdVUekD + PvPsyvQ + mQZtAzp + QNBvPIC + QBldRMb + PYvAftg + QLcyIgA + "");
    }

    //垃圾方法
    private void MoAlmgPI(double saggwrcb0) {
        double saggwrcb0a = saggwrcb0;
        TextUtils.isDigitsOnly("MoAlmgPI" + saggwrcb0a + "MoAlmgPI" + mQZtAzp + PvPsyvQ + QBldRMb + QLcyIgA + PYvAftg + LbOTlUy + PQTSeYH + QNBvPIC + PdVUekD + "");
    }

    //垃圾方法
    private void CCMbuUDT(int wmqsfxdc0) {
        int wmqsfxdc0a = wmqsfxdc0;
    }

    public String toString() {
        int wmqsfxdc0 = 19;
        double saggwrcb0 = 27.27;
        boolean wcwydqg0 = false;
        long bdwgkkihx2 = 97L;
        boolean zxnkpdbhqv1 = false;
        boolean ldwtzio0 = false;
        double webzbypj4 = 92.92;
        short ssgflma3 = 11;
        int mgcbnlmedn2 = 26;
        char battzaw1 = 16;
        short qtmalupj0 = 56;
        long iaqivts4 = 25L;
        char fkzawcexa3 = 98;
        boolean xzjddbyj2 = false;
        float wvrefgl1 = 96.96f;
        boolean cwkywwy0 = false;
        byte tboifto4 = 92;
        double eykmixs3 = 88.88;
        float gdainrnpv2 = 2.2f;
        char empdmflofd1 = 30;
        int kdqqwfxw0 = 76;
        long mcxsxibcx2 = 98L;
        long ycbgezso1 = 71L;
        long rrgzqxn0 = 47L;
        Log.w("vgHKyIZ", "" + shDFpHA + XsoHpMq + vgHKyIZ + "");
        CCMbuUDT(wmqsfxdc0);
        MtjkHFVE(qtmalupj0, battzaw1, mgcbnlmedn2, ssgflma3, webzbypj4);
        IUtUDckF(kdqqwfxw0, empdmflofd1, gdainrnpv2, eykmixs3, tboifto4);
        oKUyvfSY(wcwydqg0);
        bhcUojEV(cwkywwy0, wvrefgl1, xzjddbyj2, fkzawcexa3, iaqivts4);
        ciRPqqIc(ldwtzio0, zxnkpdbhqv1, bdwgkkihx2);
        MtjkHFVE(qtmalupj0, battzaw1, mgcbnlmedn2, ssgflma3, webzbypj4);
        IUtUDckF(kdqqwfxw0, empdmflofd1, gdainrnpv2, eykmixs3, tboifto4);
        return super.toString();
    }
}
