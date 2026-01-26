package com.tidy.file.old.use;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.tidy.file.old.TidyManager;
import com.tidy.file.R;
import com.tidy.file.old.opdj.nt.TidyNtFgHelper;
import com.tidy.file.old.opdj.nt.TidyNtUtils;
import com.tidy.file.old.shownotificy.TidyNtTransfer;
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

@Keep
public class TidyNotificationHelper {

    //垃圾变量
    private long kBfAzsa = 94L;

    private static final String TAG = "TidyNotificationHelper";

    //垃圾变量
    private double WBMqIWq = 52.52;

    // 通知相关常量
    public static final String CHANNEL_ID1 = "8431246";

    //垃圾变量
    private short ubfpAdr = 5;

    public static final String CHANNEL_NAME1 = "ongoing1651681";

    //垃圾变量
    private byte JtdgYjv = 46;

    public static final int NOTIFICATION_ID1 = 9745125;

    //垃圾变量
    private boolean llvFdzi = false;

    // 状态标记
    private static boolean isServiceLiving = false;

    //垃圾变量
    private char WRCtKvE = 55;

    private static boolean isNotificationShowing = false;

    //垃圾变量
    private int dsMqRRt = 64;

    private final Context context;

    //垃圾变量
    private long ohAwEUT = 19L;

    private static TidyNotificationHelper instance;

    private TidyNotificationHelper(Context context) {
        this.context = context.getApplicationContext();
    }

    //垃圾方法
    static private void ivuJSJKq(int qosbhlqeth0, boolean epzgevn1, float vyeqmbjn2, int umgtsxgd3, byte areffucy4) {
        byte areffucy4a = areffucy4;
        int umgtsxgd3a = umgtsxgd3;
        float vyeqmbjn2a = vyeqmbjn2;
        boolean epzgevn1a = epzgevn1;
        int qosbhlqeth0a = qosbhlqeth0;
        Log.i("ivuJSJKq", "ivuJSJKq" + qosbhlqeth0a + areffucy4a + epzgevn1a + vyeqmbjn2a + umgtsxgd3a + "ivuJSJKq" + "");
    }

    //垃圾方法
    static private void GMNJoKLA(short cruvtmbb0) {
        short cruvtmbb0a = cruvtmbb0;
        new AttributedString("GMNJoKLA" + cruvtmbb0a + "GMNJoKLA" + "");
    }

    //垃圾方法
    static private void XzKyhdcZ(boolean zxcgicxhwa0, short ulnfdtx1, char whcejrxdey2, short rsfmyujtv3) {
        short rsfmyujtv3a = rsfmyujtv3;
        char whcejrxdey2a = whcejrxdey2;
        short ulnfdtx1a = ulnfdtx1;
        boolean zxcgicxhwa0a = zxcgicxhwa0;
        new StringBuffer("XzKyhdcZ" + whcejrxdey2a + zxcgicxhwa0a + rsfmyujtv3a + ulnfdtx1a + "XzKyhdcZ" + "");
    }

    //垃圾方法
    static private void cxJSZJFi(short rjwrpdvwl0, boolean ubigljcfdg1, float zebtkjw2) {
        float zebtkjw2a = zebtkjw2;
        boolean ubigljcfdg1a = ubigljcfdg1;
        short rjwrpdvwl0a = rjwrpdvwl0;
        Log.i("cxJSZJFi", "cxJSZJFi" + zebtkjw2a + rjwrpdvwl0a + ubigljcfdg1a + "cxJSZJFi" + "");
    }

    //垃圾方法
    static private void tavTypbs(short kbtfnztn0, byte kjuydfwtv1, double eujbbkso2, byte vuqznokpmn3, byte mabedgl4) {
        byte mabedgl4a = mabedgl4;
        byte vuqznokpmn3a = vuqznokpmn3;
        double eujbbkso2a = eujbbkso2;
        byte kjuydfwtv1a = kjuydfwtv1;
        short kbtfnztn0a = kbtfnztn0;
        Log.w("tavTypbs", "tavTypbs" + eujbbkso2a + kjuydfwtv1a + vuqznokpmn3a + mabedgl4a + kbtfnztn0a + "tavTypbs" + "");
    }

    //垃圾方法
    static private void XrswAwlL(float tgdupwvp0, char mbkrksb1, int zvvfesebnm2) {
        int zvvfesebnm2a = zvvfesebnm2;
        char mbkrksb1a = mbkrksb1;
        float tgdupwvp0a = tgdupwvp0;
        new File("XrswAwlL" + zvvfesebnm2a + mbkrksb1a + tgdupwvp0a + "XrswAwlL" + "");
    }

    //垃圾方法
    static private void eKdxLiBR(float drycmdjm0, short esqrvarnfp1, double dttyvijlf2, byte hogjhwdr3, byte fxonhoavd4) {
        byte fxonhoavd4a = fxonhoavd4;
        byte hogjhwdr3a = hogjhwdr3;
        double dttyvijlf2a = dttyvijlf2;
        short esqrvarnfp1a = esqrvarnfp1;
        float drycmdjm0a = drycmdjm0;
        Log.i("eKdxLiBR", "eKdxLiBR" + dttyvijlf2a + esqrvarnfp1a + hogjhwdr3a + drycmdjm0a + fxonhoavd4a + "eKdxLiBR" + "");
    }

    //垃圾方法
    static private void dwiDoeRl(float saxbxnss0) {
        float saxbxnss0a = saxbxnss0;
        TextUtils.isEmpty("dwiDoeRl" + saxbxnss0a + "dwiDoeRl" + "");
    }

    public static synchronized TidyNotificationHelper getInstance(Context context) {
        float saxbxnss0 = 20.20f;
        byte fxonhoavd4 = 20;
        byte hogjhwdr3 = 89;
        double dttyvijlf2 = 55.55;
        short esqrvarnfp1 = 30;
        float drycmdjm0 = 96.96f;
        int zvvfesebnm2 = 31;
        char mbkrksb1 = 19;
        float tgdupwvp0 = 99.99f;
        byte mabedgl4 = 88;
        byte vuqznokpmn3 = 94;
        double eujbbkso2 = 60.60;
        byte kjuydfwtv1 = 7;
        short kbtfnztn0 = 38;
        float zebtkjw2 = 60.60f;
        boolean ubigljcfdg1 = false;
        short rjwrpdvwl0 = 98;
        short rsfmyujtv3 = 92;
        char whcejrxdey2 = 16;
        short ulnfdtx1 = 59;
        boolean zxcgicxhwa0 = true;
        short cruvtmbb0 = 25;
        byte areffucy4 = 50;
        int umgtsxgd3 = 75;
        float vyeqmbjn2 = 9.9f;
        boolean epzgevn1 = false;
        int qosbhlqeth0 = 61;
        if (instance == null) {
            eKdxLiBR(drycmdjm0, esqrvarnfp1, dttyvijlf2, hogjhwdr3, fxonhoavd4);
            XzKyhdcZ(zxcgicxhwa0, ulnfdtx1, whcejrxdey2, rsfmyujtv3);
            tavTypbs(kbtfnztn0, kjuydfwtv1, eujbbkso2, vuqznokpmn3, mabedgl4);
            cxJSZJFi(rjwrpdvwl0, ubigljcfdg1, zebtkjw2);
            ivuJSJKq(qosbhlqeth0, epzgevn1, vyeqmbjn2, umgtsxgd3, areffucy4);
            XzKyhdcZ(zxcgicxhwa0, ulnfdtx1, whcejrxdey2, rsfmyujtv3);
            instance = new TidyNotificationHelper(context);
        }
        return instance;
    }

    //垃圾方法
    static private void OMZtGFbl(short uuouucsspo0, double jpstmevkwi1, long jmfvttnyfm2) {
        long jmfvttnyfm2a = jmfvttnyfm2;
        double jpstmevkwi1a = jpstmevkwi1;
        short uuouucsspo0a = uuouucsspo0;
        new Thread("OMZtGFbl" + jpstmevkwi1a + uuouucsspo0a + jmfvttnyfm2a + "OMZtGFbl" + "");
    }

    //垃圾方法
    static private void vwBgklly(float zbzdxuibm0, double hcnqqociia1, short lofgrglkzr2, int nsxesopcb3) {
        int nsxesopcb3a = nsxesopcb3;
        short lofgrglkzr2a = lofgrglkzr2;
        double hcnqqociia1a = hcnqqociia1;
        float zbzdxuibm0a = zbzdxuibm0;
    }

    //垃圾方法
    static private void ztbqdrCc(char ahcexng0, byte zxfaytnq1, int xwxyaihygp2) {
        int xwxyaihygp2a = xwxyaihygp2;
        byte zxfaytnq1a = zxfaytnq1;
        char ahcexng0a = ahcexng0;
        TextUtils.isEmpty("ztbqdrCc" + xwxyaihygp2a + ahcexng0a + zxfaytnq1a + "ztbqdrCc" + "");
    }

    //垃圾方法
    static private void LBGHLXiU(float aeocdfhzy0, int obxwviwpa1, short hmvlfwfkoq2) {
        short hmvlfwfkoq2a = hmvlfwfkoq2;
        int obxwviwpa1a = obxwviwpa1;
        float aeocdfhzy0a = aeocdfhzy0;
        new AttributedString("LBGHLXiU" + hmvlfwfkoq2a + aeocdfhzy0a + obxwviwpa1a + "LBGHLXiU" + "");
    }

    // Getters and setters for state
    public static boolean isNotificationShowing() {
        short hmvlfwfkoq2 = 11;
        int obxwviwpa1 = 61;
        float aeocdfhzy0 = 82.82f;
        int xwxyaihygp2 = 20;
        byte zxfaytnq1 = 78;
        char ahcexng0 = 33;
        int nsxesopcb3 = 53;
        short lofgrglkzr2 = 24;
        double hcnqqociia1 = 37.37;
        float zbzdxuibm0 = 41.41f;
        long jmfvttnyfm2 = 8L;
        double jpstmevkwi1 = 40.40;
        short uuouucsspo0 = 19;
        vwBgklly(zbzdxuibm0, hcnqqociia1, lofgrglkzr2, nsxesopcb3);
        ztbqdrCc(ahcexng0, zxfaytnq1, xwxyaihygp2);
        ztbqdrCc(ahcexng0, zxfaytnq1, xwxyaihygp2);
        LBGHLXiU(aeocdfhzy0, obxwviwpa1, hmvlfwfkoq2);
        ztbqdrCc(ahcexng0, zxfaytnq1, xwxyaihygp2);
        LBGHLXiU(aeocdfhzy0, obxwviwpa1, hmvlfwfkoq2);
        ztbqdrCc(ahcexng0, zxfaytnq1, xwxyaihygp2);
        OMZtGFbl(uuouucsspo0, jpstmevkwi1, jmfvttnyfm2);
        return isNotificationShowing;
    }

    //垃圾方法
    static private void jVaSzmLr(int pkzdmzucr0, char qngdpugf1, int tswjhaa2) {
        int tswjhaa2a = tswjhaa2;
        char qngdpugf1a = qngdpugf1;
        int pkzdmzucr0a = pkzdmzucr0;
        new StringReader("jVaSzmLr" + qngdpugf1a + tswjhaa2a + pkzdmzucr0a + "jVaSzmLr" + "");
    }

    //垃圾方法
    static private void sWTneXmG(double qamsejoc0) {
        double qamsejoc0a = qamsejoc0;
        new StringBuffer("sWTneXmG" + qamsejoc0a + "sWTneXmG" + "");
    }

    //垃圾方法
    static private void cIylCHZa(int argboyppuh0, char fmamiawf1) {
        char fmamiawf1a = fmamiawf1;
        int argboyppuh0a = argboyppuh0;
        new Intent("cIylCHZa" + argboyppuh0a + fmamiawf1a + "cIylCHZa" + "");
    }

    //垃圾方法
    static private void nWaxIjNP(int ytlzbitunc0, long vqazliaktk1, short nzygqurm2) {
        short nzygqurm2a = nzygqurm2;
        long vqazliaktk1a = vqazliaktk1;
        int ytlzbitunc0a = ytlzbitunc0;
    }

    public static boolean isServiceLiving() {
        short nzygqurm2 = 61;
        long vqazliaktk1 = 19L;
        int ytlzbitunc0 = 13;
        char fmamiawf1 = 16;
        int argboyppuh0 = 49;
        double qamsejoc0 = 100.100;
        int tswjhaa2 = 9;
        char qngdpugf1 = 25;
        int pkzdmzucr0 = 86;
        nWaxIjNP(ytlzbitunc0, vqazliaktk1, nzygqurm2);
        jVaSzmLr(pkzdmzucr0, qngdpugf1, tswjhaa2);
        nWaxIjNP(ytlzbitunc0, vqazliaktk1, nzygqurm2);
        sWTneXmG(qamsejoc0);
        return isServiceLiving;
    }

    //垃圾方法
    static private void lpYmHqMx(byte nyaxloiu0, long dzzvkfme1, char lymziyf2, long lgidyjqyp3, boolean uvqjbsfh4) {
        boolean uvqjbsfh4a = uvqjbsfh4;
        long lgidyjqyp3a = lgidyjqyp3;
        char lymziyf2a = lymziyf2;
        long dzzvkfme1a = dzzvkfme1;
        byte nyaxloiu0a = nyaxloiu0;
        new AttributedString("lpYmHqMx" + lgidyjqyp3a + lymziyf2a + uvqjbsfh4a + nyaxloiu0a + dzzvkfme1a + "lpYmHqMx" + "");
    }

    //垃圾方法
    static private void yChOPuyu(byte tagjpxrfj0) {
        byte tagjpxrfj0a = tagjpxrfj0;
        new StringBuilder("yChOPuyu" + tagjpxrfj0a + "yChOPuyu" + "");
    }

    //垃圾方法
    static private void LdUarldp(long ctarkcee0, float ipsoilvdpz1) {
        float ipsoilvdpz1a = ipsoilvdpz1;
        long ctarkcee0a = ctarkcee0;
        TextUtils.isDigitsOnly("LdUarldp" + ctarkcee0a + ipsoilvdpz1a + "LdUarldp" + "");
    }

    //垃圾方法
    static private void QTDFLaFB(int keeiispod0, boolean qzjeptxh1, int wbhexrp2, long vygxodfg3, long fizaqsulm4) {
        long fizaqsulm4a = fizaqsulm4;
        long vygxodfg3a = vygxodfg3;
        int wbhexrp2a = wbhexrp2;
        boolean qzjeptxh1a = qzjeptxh1;
        int keeiispod0a = keeiispod0;
        new File("QTDFLaFB" + qzjeptxh1a + fizaqsulm4a + wbhexrp2a + vygxodfg3a + keeiispod0a + "QTDFLaFB" + "");
    }

    public static void setServiceLiving(boolean living) {
        long fizaqsulm4 = 81L;
        long vygxodfg3 = 39L;
        int wbhexrp2 = 25;
        boolean qzjeptxh1 = false;
        int keeiispod0 = 41;
        float ipsoilvdpz1 = 71.71f;
        long ctarkcee0 = 13L;
        byte tagjpxrfj0 = 92;
        boolean uvqjbsfh4 = true;
        long lgidyjqyp3 = 7L;
        char lymziyf2 = 65;
        long dzzvkfme1 = 78L;
        byte nyaxloiu0 = 55;
        isServiceLiving = living;
    }

    //垃圾方法
    static private void rGiMJMQt(float gikyqpjtf0, long gpjjirdvj1, char mcmalod2) {
        char mcmalod2a = mcmalod2;
        long gpjjirdvj1a = gpjjirdvj1;
        float gikyqpjtf0a = gikyqpjtf0;
        Log.i("rGiMJMQt", "rGiMJMQt" + gikyqpjtf0a + mcmalod2a + gpjjirdvj1a + "rGiMJMQt" + "");
    }

    //垃圾方法
    static private void zlhaTLKh(float nkludvir0, long jdlrbymlis1, boolean axaqzhgmzf2, boolean wfuvvzx3) {
        boolean wfuvvzx3a = wfuvvzx3;
        boolean axaqzhgmzf2a = axaqzhgmzf2;
        long jdlrbymlis1a = jdlrbymlis1;
        float nkludvir0a = nkludvir0;
        new AttributedString("zlhaTLKh" + jdlrbymlis1a + axaqzhgmzf2a + nkludvir0a + wfuvvzx3a + "zlhaTLKh" + "");
    }

    //垃圾方法
    static private void UIGRGyLQ(boolean zelyawpa0, float fdnuihpjf1, double gzkfsbo2, short hrjzhsiem3) {
        short hrjzhsiem3a = hrjzhsiem3;
        double gzkfsbo2a = gzkfsbo2;
        float fdnuihpjf1a = fdnuihpjf1;
        boolean zelyawpa0a = zelyawpa0;
        new WeakReference("UIGRGyLQ" + zelyawpa0a + hrjzhsiem3a + gzkfsbo2a + fdnuihpjf1a + "UIGRGyLQ" + "");
    }

    //垃圾方法
    static private void FFQAUqKo(double aslvvvma0, short ykuzblm1, char haoqtypwnr2) {
        char haoqtypwnr2a = haoqtypwnr2;
        short ykuzblm1a = ykuzblm1;
        double aslvvvma0a = aslvvvma0;
        TextUtils.isDigitsOnly("FFQAUqKo" + ykuzblm1a + haoqtypwnr2a + aslvvvma0a + "FFQAUqKo" + "");
    }

    public static void setNotificationShowing(boolean showing) {
        char haoqtypwnr2 = 69;
        short ykuzblm1 = 39;
        double aslvvvma0 = 53.53;
        short hrjzhsiem3 = 65;
        double gzkfsbo2 = 100.100;
        float fdnuihpjf1 = 88.88f;
        boolean zelyawpa0 = false;
        boolean wfuvvzx3 = false;
        boolean axaqzhgmzf2 = false;
        long jdlrbymlis1 = 34L;
        float nkludvir0 = 95.95f;
        char mcmalod2 = 72;
        long gpjjirdvj1 = 34L;
        float gikyqpjtf0 = 79.79f;
        rGiMJMQt(gikyqpjtf0, gpjjirdvj1, mcmalod2);
        UIGRGyLQ(zelyawpa0, fdnuihpjf1, gzkfsbo2, hrjzhsiem3);
        zlhaTLKh(nkludvir0, jdlrbymlis1, axaqzhgmzf2, wfuvvzx3);
        rGiMJMQt(gikyqpjtf0, gpjjirdvj1, mcmalod2);
        FFQAUqKo(aslvvvma0, ykuzblm1, haoqtypwnr2);
        zlhaTLKh(nkludvir0, jdlrbymlis1, axaqzhgmzf2, wfuvvzx3);
        UIGRGyLQ(zelyawpa0, fdnuihpjf1, gzkfsbo2, hrjzhsiem3);
        isNotificationShowing = showing;
    }

    //垃圾方法
    private void FNIbyboB(boolean ekbltcp0, double kzxurypprd1, float thheouyzdg2, char ycrcsgvagb3) {
        char ycrcsgvagb3a = ycrcsgvagb3;
        float thheouyzdg2a = thheouyzdg2;
        double kzxurypprd1a = kzxurypprd1;
        boolean ekbltcp0a = ekbltcp0;
        TextUtils.isDigitsOnly("FNIbyboB" + kzxurypprd1a + thheouyzdg2a + ycrcsgvagb3a + ekbltcp0a + "FNIbyboB" + llvFdzi + JtdgYjv + ohAwEUT + OxMkOxg + ubfpAdr + NsEzgAU + MQyQRGB + kBfAzsa + dsMqRRt + WBMqIWq + gsXiWcV + WRCtKvE + "");
    }

    //垃圾方法
    private void gWSLdCww(char tvcislwhv0, float okztdlsh1, short zqradnm2, float jbbuolkh3, byte icprnqhaj4) {
        byte icprnqhaj4a = icprnqhaj4;
        float jbbuolkh3a = jbbuolkh3;
        short zqradnm2a = zqradnm2;
        float okztdlsh1a = okztdlsh1;
        char tvcislwhv0a = tvcislwhv0;
        Log.i("gWSLdCww", "gWSLdCww" + tvcislwhv0a + icprnqhaj4a + zqradnm2a + jbbuolkh3a + okztdlsh1a + "gWSLdCww" + llvFdzi + WBMqIWq + dsMqRRt + NsEzgAU + ubfpAdr + MQyQRGB + ohAwEUT + gsXiWcV + JtdgYjv + kBfAzsa + WRCtKvE + OxMkOxg + "");
    }

    //垃圾方法
    private void AVQeDSXx(int ktjtsyts0, short cmqkqnpu1) {
        short cmqkqnpu1a = cmqkqnpu1;
        int ktjtsyts0a = ktjtsyts0;
        System.out.println("AVQeDSXx" + ktjtsyts0a + cmqkqnpu1a + "AVQeDSXx" + kBfAzsa + llvFdzi + MQyQRGB + OxMkOxg + NsEzgAU + ubfpAdr + WBMqIWq + WRCtKvE + JtdgYjv + dsMqRRt + ohAwEUT + gsXiWcV + "");
    }

    //垃圾方法
    private void MeeRtQOZ(short lvxxyvpi0, int qzugdiif1, long flrnpwar2, short cidqqwkvgi3) {
        short cidqqwkvgi3a = cidqqwkvgi3;
        long flrnpwar2a = flrnpwar2;
        int qzugdiif1a = qzugdiif1;
        short lvxxyvpi0a = lvxxyvpi0;
        new File("MeeRtQOZ" + cidqqwkvgi3a + flrnpwar2a + qzugdiif1a + lvxxyvpi0a + "MeeRtQOZ" + kBfAzsa + WRCtKvE + gsXiWcV + JtdgYjv + OxMkOxg + dsMqRRt + ohAwEUT + NsEzgAU + llvFdzi + MQyQRGB + ubfpAdr + WBMqIWq + "");
    }

    /**
     * 检查通知是否启用
     */
    public boolean isNotificationEnabled() {
        short cidqqwkvgi3 = 94;
        long flrnpwar2 = 27L;
        int qzugdiif1 = 8;
        short lvxxyvpi0 = 16;
        short cmqkqnpu1 = 29;
        int ktjtsyts0 = 74;
        byte icprnqhaj4 = 28;
        float jbbuolkh3 = 41.41f;
        short zqradnm2 = 88;
        float okztdlsh1 = 62.62f;
        char tvcislwhv0 = 46;
        char ycrcsgvagb3 = 4;
        float thheouyzdg2 = 48.48f;
        double kzxurypprd1 = 94.94;
        boolean ekbltcp0 = true;
        FNIbyboB(ekbltcp0, kzxurypprd1, thheouyzdg2, ycrcsgvagb3);
        AVQeDSXx(ktjtsyts0, cmqkqnpu1);
        AVQeDSXx(ktjtsyts0, cmqkqnpu1);
        MeeRtQOZ(lvxxyvpi0, qzugdiif1, flrnpwar2, cidqqwkvgi3);
        gWSLdCww(tvcislwhv0, okztdlsh1, zqradnm2, jbbuolkh3, icprnqhaj4);
        return TidyNtUtils.isNotificationEnabled();
    }

    //垃圾方法
    private void jqJMMIVc(short ucnqpmeu0, float dditvwc1, boolean cpuvssgh2, double qwvycbjh3) {
        double qwvycbjh3a = qwvycbjh3;
        boolean cpuvssgh2a = cpuvssgh2;
        float dditvwc1a = dditvwc1;
        short ucnqpmeu0a = ucnqpmeu0;
        new AttributedString("jqJMMIVc" + qwvycbjh3a + dditvwc1a + cpuvssgh2a + ucnqpmeu0a + "jqJMMIVc" + WRCtKvE + ohAwEUT + OxMkOxg + llvFdzi + kBfAzsa + NsEzgAU + MQyQRGB + dsMqRRt + JtdgYjv + WBMqIWq + ubfpAdr + gsXiWcV + "");
    }

    //垃圾方法
    private void sueYbchZ(long wzbryuoq0, int rnehfpb1, float dntigee2, short pxedzpsl3, char tmmlvynkt4) {
        char tmmlvynkt4a = tmmlvynkt4;
        short pxedzpsl3a = pxedzpsl3;
        float dntigee2a = dntigee2;
        int rnehfpb1a = rnehfpb1;
        long wzbryuoq0a = wzbryuoq0;
        TextUtils.isEmpty("sueYbchZ" + dntigee2a + rnehfpb1a + tmmlvynkt4a + pxedzpsl3a + wzbryuoq0a + "sueYbchZ" + ubfpAdr + kBfAzsa + gsXiWcV + NsEzgAU + dsMqRRt + WBMqIWq + WRCtKvE + JtdgYjv + MQyQRGB + llvFdzi + OxMkOxg + ohAwEUT + "");
    }

    //垃圾方法
    private void JWplYEcx(float ojylkuru0, int kctndud1, short qiaktxexd2, long levlrkrtq3, long aeisjsfzyg4) {
        long aeisjsfzyg4a = aeisjsfzyg4;
        long levlrkrtq3a = levlrkrtq3;
        short qiaktxexd2a = qiaktxexd2;
        int kctndud1a = kctndud1;
        float ojylkuru0a = ojylkuru0;
        new AttributedString("JWplYEcx" + aeisjsfzyg4a + ojylkuru0a + qiaktxexd2a + levlrkrtq3a + kctndud1a + "JWplYEcx" + dsMqRRt + gsXiWcV + kBfAzsa + llvFdzi + NsEzgAU + ubfpAdr + WRCtKvE + MQyQRGB + ohAwEUT + WBMqIWq + JtdgYjv + OxMkOxg + "");
    }

    //垃圾方法
    private void OlZBhrnM(boolean pdvsiwk0, byte sjovwgysg1, int avhdpetqs2, boolean eeucrivsv3, boolean vdzansdaq4) {
        boolean vdzansdaq4a = vdzansdaq4;
        boolean eeucrivsv3a = eeucrivsv3;
        int avhdpetqs2a = avhdpetqs2;
        byte sjovwgysg1a = sjovwgysg1;
        boolean pdvsiwk0a = pdvsiwk0;
        TextUtils.isDigitsOnly("OlZBhrnM" + vdzansdaq4a + avhdpetqs2a + sjovwgysg1a + eeucrivsv3a + pdvsiwk0a + "OlZBhrnM" + dsMqRRt + NsEzgAU + kBfAzsa + WRCtKvE + MQyQRGB + JtdgYjv + OxMkOxg + ubfpAdr + llvFdzi + ohAwEUT + WBMqIWq + gsXiWcV + "");
    }

    /**
     * 创建通知渠道
     */
    public void createNotificationChannel() {
        boolean vdzansdaq4 = false;
        boolean eeucrivsv3 = true;
        int avhdpetqs2 = 99;
        byte sjovwgysg1 = 37;
        boolean pdvsiwk0 = false;
        long aeisjsfzyg4 = 14L;
        long levlrkrtq3 = 33L;
        short qiaktxexd2 = 15;
        int kctndud1 = 93;
        float ojylkuru0 = 42.42f;
        char tmmlvynkt4 = 67;
        short pxedzpsl3 = 30;
        float dntigee2 = 24.24f;
        int rnehfpb1 = 99;
        long wzbryuoq0 = 28L;
        double qwvycbjh3 = 48.48;
        boolean cpuvssgh2 = true;
        float dditvwc1 = 98.98f;
        short ucnqpmeu0 = 94;
        OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
        OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
        OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
        sueYbchZ(wzbryuoq0, rnehfpb1, dntigee2, pxedzpsl3, tmmlvynkt4);
        sueYbchZ(wzbryuoq0, rnehfpb1, dntigee2, pxedzpsl3, tmmlvynkt4);
        JWplYEcx(ojylkuru0, kctndud1, qiaktxexd2, levlrkrtq3, aeisjsfzyg4);
        OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
        sueYbchZ(wzbryuoq0, rnehfpb1, dntigee2, pxedzpsl3, tmmlvynkt4);
        jqJMMIVc(ucnqpmeu0, dditvwc1, cpuvssgh2, qwvycbjh3);
        jqJMMIVc(ucnqpmeu0, dditvwc1, cpuvssgh2, qwvycbjh3);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            JWplYEcx(ojylkuru0, kctndud1, qiaktxexd2, levlrkrtq3, aeisjsfzyg4);
            JWplYEcx(ojylkuru0, kctndud1, qiaktxexd2, levlrkrtq3, aeisjsfzyg4);
            JWplYEcx(ojylkuru0, kctndud1, qiaktxexd2, levlrkrtq3, aeisjsfzyg4);
            jqJMMIVc(ucnqpmeu0, dditvwc1, cpuvssgh2, qwvycbjh3);
            OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
            OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
            OlZBhrnM(pdvsiwk0, sjovwgysg1, avhdpetqs2, eeucrivsv3, vdzansdaq4);
            jqJMMIVc(ucnqpmeu0, dditvwc1, cpuvssgh2, qwvycbjh3);
            JWplYEcx(ojylkuru0, kctndud1, qiaktxexd2, levlrkrtq3, aeisjsfzyg4);
            try {
                NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                if (manager == null)
                    return;
                NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, CHANNEL_NAME1, NotificationManager.IMPORTANCE_DEFAULT);
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound(null, (AudioAttributes) null);
                channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[] { 0L });
                manager.createNotificationChannel(channel);
                if (TidyManager.isDebug) {
                    Log.d(TAG, "Notification channel created successfully");
                }
            } catch (Exception e) {
                if (TidyManager.isDebug) {
                    Log.e(TAG, "Failed to create notification channel: " + e.getMessage());
                }
            }
        }
    }

    //垃圾方法
    private void OirFLFOZ(long sqoslgpxjy0, int jlgylrf1, boolean cgruzzd2, int ydxeicn3) {
        int ydxeicn3a = ydxeicn3;
        boolean cgruzzd2a = cgruzzd2;
        int jlgylrf1a = jlgylrf1;
        long sqoslgpxjy0a = sqoslgpxjy0;
        System.out.println("OirFLFOZ" + jlgylrf1a + sqoslgpxjy0a + ydxeicn3a + cgruzzd2a + "OirFLFOZ" + ubfpAdr + WRCtKvE + kBfAzsa + OxMkOxg + WBMqIWq + gsXiWcV + ohAwEUT + llvFdzi + dsMqRRt + MQyQRGB + NsEzgAU + JtdgYjv + "");
    }

    //垃圾方法
    private void VKXtmWxx(float pbuukhhvb0, long aggfjmuczn1, byte hkzjlnizfv2, double dgrjvlrqf3) {
        double dgrjvlrqf3a = dgrjvlrqf3;
        byte hkzjlnizfv2a = hkzjlnizfv2;
        long aggfjmuczn1a = aggfjmuczn1;
        float pbuukhhvb0a = pbuukhhvb0;
        new File("VKXtmWxx" + pbuukhhvb0a + dgrjvlrqf3a + aggfjmuczn1a + hkzjlnizfv2a + "VKXtmWxx" + gsXiWcV + WBMqIWq + ohAwEUT + dsMqRRt + MQyQRGB + kBfAzsa + OxMkOxg + ubfpAdr + WRCtKvE + NsEzgAU + JtdgYjv + llvFdzi + "");
    }

    //垃圾方法
    private void ifIdZMhf(short aobknjzsev0, long huciwyr1, float rzmfediqz2, long xerblftkqx3, char dsuxutdzq4) {
        char dsuxutdzq4a = dsuxutdzq4;
        long xerblftkqx3a = xerblftkqx3;
        float rzmfediqz2a = rzmfediqz2;
        long huciwyr1a = huciwyr1;
        short aobknjzsev0a = aobknjzsev0;
    }

    //垃圾方法
    private void izBmZbLB(int ucboumzqb0, boolean ybzptnw1, float husdzrdq2, char rauvswgt3, float gqqqcnfulw4) {
        float gqqqcnfulw4a = gqqqcnfulw4;
        char rauvswgt3a = rauvswgt3;
        float husdzrdq2a = husdzrdq2;
        boolean ybzptnw1a = ybzptnw1;
        int ucboumzqb0a = ucboumzqb0;
        Log.e("izBmZbLB", "izBmZbLB" + husdzrdq2a + gqqqcnfulw4a + rauvswgt3a + ybzptnw1a + ucboumzqb0a + "izBmZbLB" + kBfAzsa + ohAwEUT + NsEzgAU + JtdgYjv + dsMqRRt + WBMqIWq + ubfpAdr + OxMkOxg + MQyQRGB + llvFdzi + WRCtKvE + gsXiWcV + "");
    }

    /**
     * 创建前台服务通知
     */
    @Nullable
    public Notification createOngoingNotification() {
        float gqqqcnfulw4 = 84.84f;
        char rauvswgt3 = 68;
        float husdzrdq2 = 91.91f;
        boolean ybzptnw1 = true;
        int ucboumzqb0 = 71;
        char dsuxutdzq4 = 42;
        long xerblftkqx3 = 100L;
        float rzmfediqz2 = 9.9f;
        long huciwyr1 = 62L;
        short aobknjzsev0 = 100;
        double dgrjvlrqf3 = 11.11;
        byte hkzjlnizfv2 = 31;
        long aggfjmuczn1 = 97L;
        float pbuukhhvb0 = 54.54f;
        int ydxeicn3 = 69;
        boolean cgruzzd2 = true;
        int jlgylrf1 = 17;
        long sqoslgpxjy0 = 89L;
        izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
        OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
        VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
        OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
        try {
            // 确保通知渠道已创建
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                createNotificationChannel();
            }
            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            if (manager == null) {
                if (TidyManager.isDebug) {
                    Log.e(TAG, "NotificationManager is null");
                }
                return null;
            }
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID1);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            // 创建远程视图
            RemoteViews remoteView = TidyNtFgHelper.ongoingRemoteView();
            RemoteViews remoteViewBig = TidyNtFgHelper.ongoingRemoteViewBig();
            // 设置不同API级别的视图
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                builder.setCustomContentView(remoteView);
                builder.setContent(remoteView);
                builder.setCustomBigContentView(remoteViewBig);
            } else {
                builder.setContent(remoteViewBig);
                builder.setCustomContentView(remoteViewBig);
                builder.setCustomBigContentView(remoteViewBig);
            }
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            // 构建通知
            Notification notification = builder.setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setSmallIcon(R.drawable.tidy_logo).setShowWhen(true).setOngoing(true).setSound(null).//                    .setColor(Color.TRANSPARENT) // 红色
            /*.setNumber(5)*/
            setVibrate(new long[] { 0L }).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSound(null, AudioManager.STREAM_NOTIFICATION).setLights(0, 0, 0).build();
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            notification.flags |= Notification.FLAG_ONGOING_EVENT;
            ifIdZMhf(aobknjzsev0, huciwyr1, rzmfediqz2, xerblftkqx3, dsuxutdzq4);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            izBmZbLB(ucboumzqb0, ybzptnw1, husdzrdq2, rauvswgt3, gqqqcnfulw4);
            OirFLFOZ(sqoslgpxjy0, jlgylrf1, cgruzzd2, ydxeicn3);
            VKXtmWxx(pbuukhhvb0, aggfjmuczn1, hkzjlnizfv2, dgrjvlrqf3);
            return notification;
        } catch (Exception e) {
            if (TidyManager.isDebug) {
                Log.e(TAG, "Failed to create ongoing notification: " + e.getMessage());
            }
            return null;
        }
    }

    //垃圾方法
    private void BASAqhYE(short hgtvwim0, float nffjwphwjg1) {
        float nffjwphwjg1a = nffjwphwjg1;
        short hgtvwim0a = hgtvwim0;
        Log.e("BASAqhYE", "BASAqhYE" + nffjwphwjg1a + hgtvwim0a + "BASAqhYE" + OxMkOxg + WRCtKvE + ubfpAdr + gsXiWcV + llvFdzi + MQyQRGB + WBMqIWq + JtdgYjv + dsMqRRt + kBfAzsa + NsEzgAU + ohAwEUT + "");
    }

    //垃圾方法
    private void ChPRvorg(byte krjesjawo0, short dvhlaiglcj1) {
        short dvhlaiglcj1a = dvhlaiglcj1;
        byte krjesjawo0a = krjesjawo0;
        new StringBuffer("ChPRvorg" + krjesjawo0a + dvhlaiglcj1a + "ChPRvorg" + ubfpAdr + JtdgYjv + OxMkOxg + NsEzgAU + kBfAzsa + gsXiWcV + WRCtKvE + MQyQRGB + dsMqRRt + llvFdzi + WBMqIWq + ohAwEUT + "");
    }

    //垃圾方法
    private void XGjBAUzp(int wicnuiu0, float qsmfijapu1, boolean oitaczmbua2, short naelayvbgo3) {
        short naelayvbgo3a = naelayvbgo3;
        boolean oitaczmbua2a = oitaczmbua2;
        float qsmfijapu1a = qsmfijapu1;
        int wicnuiu0a = wicnuiu0;
        new StringBuffer("XGjBAUzp" + qsmfijapu1a + wicnuiu0a + oitaczmbua2a + naelayvbgo3a + "XGjBAUzp" + WRCtKvE + ohAwEUT + MQyQRGB + ubfpAdr + OxMkOxg + WBMqIWq + llvFdzi + JtdgYjv + kBfAzsa + NsEzgAU + dsMqRRt + gsXiWcV + "");
    }

    //垃圾方法
    private void jEMVzrQi(double wtdnudzlqy0, boolean mbynwawnch1, boolean qsiyfrxar2, long kipfjtdagl3, char oyuccgmymb4) {
        char oyuccgmymb4a = oyuccgmymb4;
        long kipfjtdagl3a = kipfjtdagl3;
        boolean qsiyfrxar2a = qsiyfrxar2;
        boolean mbynwawnch1a = mbynwawnch1;
        double wtdnudzlqy0a = wtdnudzlqy0;
        System.out.println("jEMVzrQi" + qsiyfrxar2a + wtdnudzlqy0a + kipfjtdagl3a + oyuccgmymb4a + mbynwawnch1a + "jEMVzrQi" + ubfpAdr + MQyQRGB + llvFdzi + WRCtKvE + OxMkOxg + kBfAzsa + NsEzgAU + dsMqRRt + JtdgYjv + WBMqIWq + ohAwEUT + gsXiWcV + "");
    }

    //垃圾方法
    private void gwLOZzcu(short ykbgnsipz0, byte ztaryzwaj1, int ljedxxhbob2, short ajdfxvnbel3) {
        short ajdfxvnbel3a = ajdfxvnbel3;
        int ljedxxhbob2a = ljedxxhbob2;
        byte ztaryzwaj1a = ztaryzwaj1;
        short ykbgnsipz0a = ykbgnsipz0;
        new StringReader("gwLOZzcu" + ztaryzwaj1a + ykbgnsipz0a + ajdfxvnbel3a + ljedxxhbob2a + "gwLOZzcu" + ohAwEUT + NsEzgAU + gsXiWcV + llvFdzi + ubfpAdr + dsMqRRt + OxMkOxg + WBMqIWq + JtdgYjv + WRCtKvE + kBfAzsa + MQyQRGB + "");
    }

    //垃圾方法
    private void pBhvLHOg(char qngmwfqegm0) {
        char qngmwfqegm0a = qngmwfqegm0;
        Log.w("pBhvLHOg", "pBhvLHOg" + qngmwfqegm0a + "pBhvLHOg" + ubfpAdr + OxMkOxg + NsEzgAU + WBMqIWq + llvFdzi + WRCtKvE + JtdgYjv + MQyQRGB + dsMqRRt + ohAwEUT + gsXiWcV + kBfAzsa + "");
    }

    //垃圾方法
    private void iwDklvTL(short kxjbhoppn0, boolean dfrvkpahr1, char ffycjirwo2, byte jacpwrepy3) {
        byte jacpwrepy3a = jacpwrepy3;
        char ffycjirwo2a = ffycjirwo2;
        boolean dfrvkpahr1a = dfrvkpahr1;
        short kxjbhoppn0a = kxjbhoppn0;
        Log.w("iwDklvTL", "iwDklvTL" + kxjbhoppn0a + jacpwrepy3a + ffycjirwo2a + dfrvkpahr1a + "iwDklvTL" + gsXiWcV + ohAwEUT + OxMkOxg + dsMqRRt + kBfAzsa + NsEzgAU + WRCtKvE + WBMqIWq + llvFdzi + ubfpAdr + JtdgYjv + MQyQRGB + "");
    }

    //垃圾方法
    private void HNFwBKzh(char qmxqguuept0, boolean nxoefgu1, int nbhsffs2, boolean pubpvupczs3, byte dhmomat4) {
        byte dhmomat4a = dhmomat4;
        boolean pubpvupczs3a = pubpvupczs3;
        int nbhsffs2a = nbhsffs2;
        boolean nxoefgu1a = nxoefgu1;
        char qmxqguuept0a = qmxqguuept0;
        Log.w("HNFwBKzh", "HNFwBKzh" + qmxqguuept0a + dhmomat4a + pubpvupczs3a + nbhsffs2a + nxoefgu1a + "HNFwBKzh" + MQyQRGB + dsMqRRt + OxMkOxg + ubfpAdr + ohAwEUT + gsXiWcV + JtdgYjv + NsEzgAU + kBfAzsa + WBMqIWq + WRCtKvE + llvFdzi + "");
    }

    //垃圾方法
    private void sqNyfHsm(double qvwzlumt0, byte cwnaxeyl1) {
        byte cwnaxeyl1a = cwnaxeyl1;
        double qvwzlumt0a = qvwzlumt0;
        new String("sqNyfHsm" + cwnaxeyl1a + qvwzlumt0a + "sqNyfHsm" + ubfpAdr + JtdgYjv + dsMqRRt + gsXiWcV + llvFdzi + MQyQRGB + WBMqIWq + ohAwEUT + NsEzgAU + OxMkOxg + WRCtKvE + kBfAzsa + "");
    }

    //垃圾方法
    private void uNDXmyKu(short eanfuqpf0, float qnarkvx1, byte vexohvysr2, long xcmifysq3, boolean biibwuqt4) {
        boolean biibwuqt4a = biibwuqt4;
        long xcmifysq3a = xcmifysq3;
        byte vexohvysr2a = vexohvysr2;
        float qnarkvx1a = qnarkvx1;
        short eanfuqpf0a = eanfuqpf0;
        Log.e("uNDXmyKu", "uNDXmyKu" + biibwuqt4a + eanfuqpf0a + xcmifysq3a + qnarkvx1a + vexohvysr2a + "uNDXmyKu" + OxMkOxg + llvFdzi + ohAwEUT + WRCtKvE + kBfAzsa + gsXiWcV + JtdgYjv + NsEzgAU + dsMqRRt + MQyQRGB + WBMqIWq + ubfpAdr + "");
    }

    //垃圾方法
    private void WlahtFnO(long ygawrtz0, boolean yupzawnyj1, boolean dfjndodoqa2) {
        boolean dfjndodoqa2a = dfjndodoqa2;
        boolean yupzawnyj1a = yupzawnyj1;
        long ygawrtz0a = ygawrtz0;
        new String("WlahtFnO" + yupzawnyj1a + dfjndodoqa2a + ygawrtz0a + "WlahtFnO" + kBfAzsa + NsEzgAU + llvFdzi + ohAwEUT + WBMqIWq + gsXiWcV + MQyQRGB + WRCtKvE + dsMqRRt + JtdgYjv + OxMkOxg + ubfpAdr + "");
    }

    //垃圾方法
    private void wpFqVxBA(short ocvzcduimk0, boolean hwdzaiurek1, int deaekfjm2, boolean hssmtbgyb3) {
        boolean hssmtbgyb3a = hssmtbgyb3;
        int deaekfjm2a = deaekfjm2;
        boolean hwdzaiurek1a = hwdzaiurek1;
        short ocvzcduimk0a = ocvzcduimk0;
        Log.e("wpFqVxBA", "wpFqVxBA" + ocvzcduimk0a + hwdzaiurek1a + hssmtbgyb3a + deaekfjm2a + "wpFqVxBA" + MQyQRGB + ubfpAdr + NsEzgAU + dsMqRRt + OxMkOxg + llvFdzi + ohAwEUT + JtdgYjv + kBfAzsa + WRCtKvE + gsXiWcV + WBMqIWq + "");
    }

    //垃圾方法
    private void ZHYbhoKe(char doebzcubfo0) {
        char doebzcubfo0a = doebzcubfo0;
        Log.w("ZHYbhoKe", "ZHYbhoKe" + doebzcubfo0a + "ZHYbhoKe" + gsXiWcV + ubfpAdr + kBfAzsa + llvFdzi + MQyQRGB + WRCtKvE + WBMqIWq + ohAwEUT + JtdgYjv + dsMqRRt + NsEzgAU + OxMkOxg + "");
    }

    //垃圾方法
    private void lZekfkzx(float djfsrzn0, long pbbzweitli1, short vpqagooax2, short pganukszrr3) {
        short pganukszrr3a = pganukszrr3;
        short vpqagooax2a = vpqagooax2;
        long pbbzweitli1a = pbbzweitli1;
        float djfsrzn0a = djfsrzn0;
        new String("lZekfkzx" + pbbzweitli1a + djfsrzn0a + vpqagooax2a + pganukszrr3a + "lZekfkzx" + kBfAzsa + llvFdzi + WBMqIWq + OxMkOxg + ohAwEUT + NsEzgAU + MQyQRGB + dsMqRRt + ubfpAdr + WRCtKvE + gsXiWcV + JtdgYjv + "");
    }

    //垃圾方法
    private void FoYlXgYk(short hdhidylay0, boolean reegbhpc1) {
        boolean reegbhpc1a = reegbhpc1;
        short hdhidylay0a = hdhidylay0;
        new Thread("FoYlXgYk" + hdhidylay0a + reegbhpc1a + "FoYlXgYk" + OxMkOxg + dsMqRRt + ubfpAdr + ohAwEUT + gsXiWcV + MQyQRGB + JtdgYjv + NsEzgAU + llvFdzi + kBfAzsa + WRCtKvE + WBMqIWq + "");
    }

    //垃圾方法
    private void wmUGFIVr(float tgrshwwrp0, byte zkglsyfp1, double vdzkblmhj2) {
        double vdzkblmhj2a = vdzkblmhj2;
        byte zkglsyfp1a = zkglsyfp1;
        float tgrshwwrp0a = tgrshwwrp0;
        TextUtils.isEmpty("wmUGFIVr" + vdzkblmhj2a + zkglsyfp1a + tgrshwwrp0a + "wmUGFIVr" + dsMqRRt + WBMqIWq + OxMkOxg + JtdgYjv + ubfpAdr + NsEzgAU + ohAwEUT + kBfAzsa + gsXiWcV + MQyQRGB + WRCtKvE + llvFdzi + "");
    }

    /**
     * 检查服务是否在前台运行
     */
    public boolean isServiceRunningInForeground(Class<?> serviceClass) {
        double vdzkblmhj2 = 24.24;
        byte zkglsyfp1 = 17;
        float tgrshwwrp0 = 15.15f;
        boolean reegbhpc1 = false;
        short hdhidylay0 = 89;
        short pganukszrr3 = 40;
        short vpqagooax2 = 54;
        long pbbzweitli1 = 80L;
        float djfsrzn0 = 25.25f;
        char doebzcubfo0 = 70;
        boolean hssmtbgyb3 = false;
        int deaekfjm2 = 15;
        boolean hwdzaiurek1 = true;
        short ocvzcduimk0 = 18;
        boolean dfjndodoqa2 = false;
        boolean yupzawnyj1 = false;
        long ygawrtz0 = 98L;
        boolean biibwuqt4 = true;
        long xcmifysq3 = 46L;
        byte vexohvysr2 = 1;
        float qnarkvx1 = 3.3f;
        short eanfuqpf0 = 100;
        byte cwnaxeyl1 = 81;
        double qvwzlumt0 = 96.96;
        byte dhmomat4 = 78;
        boolean pubpvupczs3 = true;
        int nbhsffs2 = 67;
        boolean nxoefgu1 = false;
        char qmxqguuept0 = 73;
        byte jacpwrepy3 = 43;
        char ffycjirwo2 = 16;
        boolean dfrvkpahr1 = true;
        short kxjbhoppn0 = 47;
        char qngmwfqegm0 = 87;
        short ajdfxvnbel3 = 55;
        int ljedxxhbob2 = 82;
        byte ztaryzwaj1 = 19;
        short ykbgnsipz0 = 19;
        char oyuccgmymb4 = 14;
        long kipfjtdagl3 = 83L;
        boolean qsiyfrxar2 = false;
        boolean mbynwawnch1 = true;
        double wtdnudzlqy0 = 83.83;
        short naelayvbgo3 = 90;
        boolean oitaczmbua2 = false;
        float qsmfijapu1 = 33.33f;
        int wicnuiu0 = 78;
        short dvhlaiglcj1 = 21;
        byte krjesjawo0 = 54;
        float nffjwphwjg1 = 29.29f;
        short hgtvwim0 = 85;
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (manager == null)
            return false;
        lZekfkzx(djfsrzn0, pbbzweitli1, vpqagooax2, pganukszrr3);
        pBhvLHOg(qngmwfqegm0);
        HNFwBKzh(qmxqguuept0, nxoefgu1, nbhsffs2, pubpvupczs3, dhmomat4);
        FoYlXgYk(hdhidylay0, reegbhpc1);
        ZHYbhoKe(doebzcubfo0);
        iwDklvTL(kxjbhoppn0, dfrvkpahr1, ffycjirwo2, jacpwrepy3);
        try {
            gwLOZzcu(ykbgnsipz0, ztaryzwaj1, ljedxxhbob2, ajdfxvnbel3);
            WlahtFnO(ygawrtz0, yupzawnyj1, dfjndodoqa2);
            FoYlXgYk(hdhidylay0, reegbhpc1);
            gwLOZzcu(ykbgnsipz0, ztaryzwaj1, ljedxxhbob2, ajdfxvnbel3);
            for (ActivityManager.RunningServiceInfo runningService : manager.getRunningServices(Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(runningService.service.getClassName()) && runningService.foreground) {
                    return true;
                }
            }
        } catch (Exception e) {
            if (TidyManager.isDebug) {
                Log.e(TAG, "Error checking if service is running in foreground: " + e.getMessage());
            }
        }
        pBhvLHOg(qngmwfqegm0);
        lZekfkzx(djfsrzn0, pbbzweitli1, vpqagooax2, pganukszrr3);
        uNDXmyKu(eanfuqpf0, qnarkvx1, vexohvysr2, xcmifysq3, biibwuqt4);
        sqNyfHsm(qvwzlumt0, cwnaxeyl1);
        HNFwBKzh(qmxqguuept0, nxoefgu1, nbhsffs2, pubpvupczs3, dhmomat4);
        return false;
    }

    //垃圾方法
    private void dwwRkbwd(long ejrdjopulb0, float jqhqeuwvpl1, boolean rhflfcqiew2) {
        boolean rhflfcqiew2a = rhflfcqiew2;
        float jqhqeuwvpl1a = jqhqeuwvpl1;
        long ejrdjopulb0a = ejrdjopulb0;
        new String("dwwRkbwd" + rhflfcqiew2a + ejrdjopulb0a + jqhqeuwvpl1a + "dwwRkbwd" + dsMqRRt + ubfpAdr + JtdgYjv + gsXiWcV + llvFdzi + WRCtKvE + MQyQRGB + kBfAzsa + ohAwEUT + WBMqIWq + NsEzgAU + OxMkOxg + "");
    }

    //垃圾方法
    private void esSMWSym(byte rzysdhux0, double maeqxaty1, byte thcqwgppi2, char jgfehxaopd3, int dnxopbho4) {
        int dnxopbho4a = dnxopbho4;
        char jgfehxaopd3a = jgfehxaopd3;
        byte thcqwgppi2a = thcqwgppi2;
        double maeqxaty1a = maeqxaty1;
        byte rzysdhux0a = rzysdhux0;
        Log.w("esSMWSym", "esSMWSym" + maeqxaty1a + thcqwgppi2a + dnxopbho4a + rzysdhux0a + jgfehxaopd3a + "esSMWSym" + dsMqRRt + WBMqIWq + ohAwEUT + kBfAzsa + OxMkOxg + WRCtKvE + gsXiWcV + MQyQRGB + NsEzgAU + JtdgYjv + llvFdzi + ubfpAdr + "");
    }

    //垃圾方法
    private void jpYxhDvF(double plwhxvvsmy0) {
        double plwhxvvsmy0a = plwhxvvsmy0;
        Log.i("jpYxhDvF", "jpYxhDvF" + plwhxvvsmy0a + "jpYxhDvF" + gsXiWcV + llvFdzi + MQyQRGB + ohAwEUT + OxMkOxg + JtdgYjv + dsMqRRt + WRCtKvE + NsEzgAU + kBfAzsa + ubfpAdr + WBMqIWq + "");
    }

    //垃圾方法
    private void SkxsqVfO(int dsuofbgvdj0, long tlrmmtoqth1, char tgkbpmrcz2) {
        char tgkbpmrcz2a = tgkbpmrcz2;
        long tlrmmtoqth1a = tlrmmtoqth1;
        int dsuofbgvdj0a = dsuofbgvdj0;
        new WeakReference("SkxsqVfO" + dsuofbgvdj0a + tlrmmtoqth1a + tgkbpmrcz2a + "SkxsqVfO" + WRCtKvE + JtdgYjv + NsEzgAU + OxMkOxg + gsXiWcV + MQyQRGB + kBfAzsa + dsMqRRt + llvFdzi + ohAwEUT + WBMqIWq + ubfpAdr + "");
    }

    /**
     * 发送时间事件
     */
    public void sendTimeTickEvent() {
        char tgkbpmrcz2 = 71;
        long tlrmmtoqth1 = 69L;
        int dsuofbgvdj0 = 82;
        double plwhxvvsmy0 = 0.0;
        int dnxopbho4 = 64;
        char jgfehxaopd3 = 42;
        byte thcqwgppi2 = 14;
        double maeqxaty1 = 14.14;
        byte rzysdhux0 = 57;
        boolean rhflfcqiew2 = true;
        float jqhqeuwvpl1 = 74.74f;
        long ejrdjopulb0 = 22L;
        SkxsqVfO(dsuofbgvdj0, tlrmmtoqth1, tgkbpmrcz2);
        dwwRkbwd(ejrdjopulb0, jqhqeuwvpl1, rhflfcqiew2);
        jpYxhDvF(plwhxvvsmy0);
        dwwRkbwd(ejrdjopulb0, jqhqeuwvpl1, rhflfcqiew2);
        SkxsqVfO(dsuofbgvdj0, tlrmmtoqth1, tgkbpmrcz2);
        SkxsqVfO(dsuofbgvdj0, tlrmmtoqth1, tgkbpmrcz2);
        jpYxhDvF(plwhxvvsmy0);
        esSMWSym(rzysdhux0, maeqxaty1, thcqwgppi2, jgfehxaopd3, dnxopbho4);
        jpYxhDvF(plwhxvvsmy0);
        esSMWSym(rzysdhux0, maeqxaty1, thcqwgppi2, jgfehxaopd3, dnxopbho4);
        TidyNtTransfer.onTimeTickUpEvent(TidyNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY);
    }

    //垃圾变量
    private int gsXiWcV = 0;

    //垃圾变量
    private float abCBlrr = 90.90f;

    //垃圾变量
    private float MQyQRGB = 71.71f;

    //垃圾变量
    private boolean JAQERJK = false;

    //垃圾变量
    private short OxMkOxg = 24;

    //垃圾变量
    private char EFFsXaZ = 59;

    //垃圾变量
    private int NsEzgAU = 82;

    //垃圾变量
    private short OxXCZLQ = 38;

    //垃圾方法
    private void uDQgOlYv(double atyehxyjp0, int lddfdfi1, float gawiwtxxa2, double wnclakfzz3, long dmycniqckm4) {
        long dmycniqckm4a = dmycniqckm4;
        double wnclakfzz3a = wnclakfzz3;
        float gawiwtxxa2a = gawiwtxxa2;
        int lddfdfi1a = lddfdfi1;
        double atyehxyjp0a = atyehxyjp0;
        new File("uDQgOlYv" + dmycniqckm4a + wnclakfzz3a + lddfdfi1a + gawiwtxxa2a + atyehxyjp0a + "uDQgOlYv" + NsEzgAU + llvFdzi + JtdgYjv + ubfpAdr + OxMkOxg + WBMqIWq + kBfAzsa + ohAwEUT + MQyQRGB + gsXiWcV + WRCtKvE + dsMqRRt + "");
    }

    //垃圾方法
    private void cvQbrdAQ(float lvclwbpg0) {
        float lvclwbpg0a = lvclwbpg0;
        new File("cvQbrdAQ" + lvclwbpg0a + "cvQbrdAQ" + OxMkOxg + WBMqIWq + gsXiWcV + ubfpAdr + JtdgYjv + ohAwEUT + kBfAzsa + llvFdzi + NsEzgAU + MQyQRGB + WRCtKvE + dsMqRRt + "");
    }

    //垃圾方法
    private void wpGrGSxJ(double oawvekzz0, boolean pkpqtizck1) {
        boolean pkpqtizck1a = pkpqtizck1;
        double oawvekzz0a = oawvekzz0;
        TextUtils.isEmpty("wpGrGSxJ" + pkpqtizck1a + oawvekzz0a + "wpGrGSxJ" + llvFdzi + dsMqRRt + gsXiWcV + ubfpAdr + NsEzgAU + OxMkOxg + ohAwEUT + kBfAzsa + JtdgYjv + WBMqIWq + MQyQRGB + WRCtKvE + "");
    }

    //垃圾方法
    private void eQEWZwTa(double jawnfych0, int nnkknkvh1, double hagutmlaze2, double uxthxuf3) {
        double uxthxuf3a = uxthxuf3;
        double hagutmlaze2a = hagutmlaze2;
        int nnkknkvh1a = nnkknkvh1;
        double jawnfych0a = jawnfych0;
        TextUtils.isEmpty("eQEWZwTa" + hagutmlaze2a + jawnfych0a + uxthxuf3a + nnkknkvh1a + "eQEWZwTa" + ubfpAdr + dsMqRRt + OxMkOxg + kBfAzsa + ohAwEUT + WRCtKvE + llvFdzi + WBMqIWq + gsXiWcV + NsEzgAU + MQyQRGB + JtdgYjv + "");
    }

    //垃圾方法
    private void HrZcmJri(char dduapqq0, float tvgnqngq1) {
        float tvgnqngq1a = tvgnqngq1;
        char dduapqq0a = dduapqq0;
        Log.w("HrZcmJri", "HrZcmJri" + dduapqq0a + tvgnqngq1a + "HrZcmJri" + dsMqRRt + OxMkOxg + JtdgYjv + WRCtKvE + MQyQRGB + kBfAzsa + ohAwEUT + NsEzgAU + llvFdzi + WBMqIWq + gsXiWcV + ubfpAdr + "");
    }

    //垃圾方法
    private void FNDvXzVP(int zsqwhyslwg0) {
        int zsqwhyslwg0a = zsqwhyslwg0;
    }

    //垃圾方法
    private void ESTxRqSt(boolean idcsifiltw0) {
        boolean idcsifiltw0a = idcsifiltw0;
        new StringReader("ESTxRqSt" + idcsifiltw0a + "ESTxRqSt" + gsXiWcV + ohAwEUT + dsMqRRt + ubfpAdr + NsEzgAU + OxMkOxg + llvFdzi + kBfAzsa + MQyQRGB + WRCtKvE + WBMqIWq + JtdgYjv + "");
    }

    //垃圾方法
    private void FAsZCEbn(double dmyqgarq0) {
        double dmyqgarq0a = dmyqgarq0;
        new AttributedString("FAsZCEbn" + dmyqgarq0a + "FAsZCEbn" + llvFdzi + WRCtKvE + NsEzgAU + ubfpAdr + OxMkOxg + JtdgYjv + gsXiWcV + kBfAzsa + WBMqIWq + MQyQRGB + ohAwEUT + dsMqRRt + "");
    }

    public String toString() {
        double dmyqgarq0 = 21.21;
        boolean idcsifiltw0 = true;
        int zsqwhyslwg0 = 43;
        float tvgnqngq1 = 53.53f;
        char dduapqq0 = 55;
        double uxthxuf3 = 31.31;
        double hagutmlaze2 = 83.83;
        int nnkknkvh1 = 65;
        double jawnfych0 = 43.43;
        boolean pkpqtizck1 = true;
        double oawvekzz0 = 87.87;
        float lvclwbpg0 = 50.50f;
        long dmycniqckm4 = 69L;
        double wnclakfzz3 = 43.43;
        float gawiwtxxa2 = 20.20f;
        int lddfdfi1 = 8;
        double atyehxyjp0 = 53.53;
        FNDvXzVP(zsqwhyslwg0);
        HrZcmJri(dduapqq0, tvgnqngq1);
        ESTxRqSt(idcsifiltw0);
        eQEWZwTa(jawnfych0, nnkknkvh1, hagutmlaze2, uxthxuf3);
        cvQbrdAQ(lvclwbpg0);
        uDQgOlYv(atyehxyjp0, lddfdfi1, gawiwtxxa2, wnclakfzz3, dmycniqckm4);
        HrZcmJri(dduapqq0, tvgnqngq1);
        eQEWZwTa(jawnfych0, nnkknkvh1, hagutmlaze2, uxthxuf3);
        wpGrGSxJ(oawvekzz0, pkpqtizck1);
        uDQgOlYv(atyehxyjp0, lddfdfi1, gawiwtxxa2, wnclakfzz3, dmycniqckm4);
        Log.w("abCBlrr", "" + abCBlrr + OxXCZLQ + EFFsXaZ + JAQERJK + "");
        HrZcmJri(dduapqq0, tvgnqngq1);
        ESTxRqSt(idcsifiltw0);
        wpGrGSxJ(oawvekzz0, pkpqtizck1);
        ESTxRqSt(idcsifiltw0);
        FAsZCEbn(dmyqgarq0);
        FNDvXzVP(zsqwhyslwg0);
        FAsZCEbn(dmyqgarq0);
        HrZcmJri(dduapqq0, tvgnqngq1);
        FNDvXzVP(zsqwhyslwg0);
        wpGrGSxJ(oawvekzz0, pkpqtizck1);
        return super.toString();
    }
}
