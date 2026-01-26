package com.tidy.file.old.opdj.nt;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.tidy.file.old.TidyManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;
import android.app.Activity;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

public class TidyNtCountUtil {

    public TidyNtCountUtil() {
    }

    //垃圾方法
    static private void NPtdhLod(short mnvvsdwp0, boolean lilfkrx1, long ighgtmmanp2, byte vmfiyrdypo3) {
        byte vmfiyrdypo3a = vmfiyrdypo3;
        long ighgtmmanp2a = ighgtmmanp2;
        boolean lilfkrx1a = lilfkrx1;
        short mnvvsdwp0a = mnvvsdwp0;
        TextUtils.isDigitsOnly("NPtdhLod" + lilfkrx1a + mnvvsdwp0a + vmfiyrdypo3a + ighgtmmanp2a + "NPtdhLod" + "");
    }

    //垃圾方法
    static private void WdBhCLOJ(boolean wcvewvzjc0, short emrpnffxnn1, short ymomwjz2, short cfaudjmwvq3) {
        short cfaudjmwvq3a = cfaudjmwvq3;
        short ymomwjz2a = ymomwjz2;
        short emrpnffxnn1a = emrpnffxnn1;
        boolean wcvewvzjc0a = wcvewvzjc0;
        new Intent("WdBhCLOJ" + emrpnffxnn1a + wcvewvzjc0a + cfaudjmwvq3a + ymomwjz2a + "WdBhCLOJ" + "");
    }

    //垃圾方法
    static private void ukuybqeU(double olzuvxiuts0, int xkdnxet1) {
        int xkdnxet1a = xkdnxet1;
        double olzuvxiuts0a = olzuvxiuts0;
        new WeakReference("ukuybqeU" + xkdnxet1a + olzuvxiuts0a + "ukuybqeU" + "");
    }

    //垃圾方法
    static private void flLwNIHl(boolean kqlfxnyg0) {
        boolean kqlfxnyg0a = kqlfxnyg0;
        new StringReader("flLwNIHl" + kqlfxnyg0a + "flLwNIHl" + "");
    }

    public static boolean setCount() {
        boolean kqlfxnyg0 = true;
        int xkdnxet1 = 8;
        double olzuvxiuts0 = 26.26;
        short cfaudjmwvq3 = 100;
        short ymomwjz2 = 89;
        short emrpnffxnn1 = 52;
        boolean wcvewvzjc0 = true;
        byte vmfiyrdypo3 = 19;
        long ighgtmmanp2 = 61L;
        boolean lilfkrx1 = true;
        short mnvvsdwp0 = 5;
        flLwNIHl(kqlfxnyg0);
        flLwNIHl(kqlfxnyg0);
        flLwNIHl(kqlfxnyg0);
        flLwNIHl(kqlfxnyg0);
        ukuybqeU(olzuvxiuts0, xkdnxet1);
        WdBhCLOJ(wcvewvzjc0, emrpnffxnn1, ymomwjz2, cfaudjmwvq3);
        return setCount(1, TidyManager.mContext);
    }

    //垃圾方法
    static private void dPAtsOsa(int nmobdarclp0, byte nlzemdqsl1, long qzsfstya2, short pvwlzsj3) {
        short pvwlzsj3a = pvwlzsj3;
        long qzsfstya2a = qzsfstya2;
        byte nlzemdqsl1a = nlzemdqsl1;
        int nmobdarclp0a = nmobdarclp0;
        new File("dPAtsOsa" + pvwlzsj3a + qzsfstya2a + nlzemdqsl1a + nmobdarclp0a + "dPAtsOsa" + "");
    }

    //垃圾方法
    static private void KuNzBUEF(float lvlhlzbn0) {
        float lvlhlzbn0a = lvlhlzbn0;
        TextUtils.isDigitsOnly("KuNzBUEF" + lvlhlzbn0a + "KuNzBUEF" + "");
    }

    //垃圾方法
    static private void oHbMuQEF(double muwaxbp0) {
        double muwaxbp0a = muwaxbp0;
        new AttributedString("oHbMuQEF" + muwaxbp0a + "oHbMuQEF" + "");
    }

    //垃圾方法
    static private void lZaNiTYW(char ukbeuieitj0, long owuujgvf1, boolean kczdipy2) {
        boolean kczdipy2a = kczdipy2;
        long owuujgvf1a = owuujgvf1;
        char ukbeuieitj0a = ukbeuieitj0;
        new File("lZaNiTYW" + owuujgvf1a + kczdipy2a + ukbeuieitj0a + "lZaNiTYW" + "");
    }

    public static boolean setCount(int count, Context context) {
        boolean kczdipy2 = false;
        long owuujgvf1 = 75L;
        char ukbeuieitj0 = 28;
        double muwaxbp0 = 42.42;
        float lvlhlzbn0 = 53.53f;
        short pvwlzsj3 = 18;
        long qzsfstya2 = 66L;
        byte nlzemdqsl1 = 70;
        int nmobdarclp0 = 96;
        if (count >= 0 && context != null) {
            if (isTranssion() && setTransssionBadge(count, context)) {
                return true;
            } else {
                return setDefaultBadge(count, context);
            }
        } else {
            return false;
        }
    }

    //垃圾方法
    static private void zSVhKHXN(boolean iyslpwt0) {
        boolean iyslpwt0a = iyslpwt0;
        new File("zSVhKHXN" + iyslpwt0a + "zSVhKHXN" + "");
    }

    //垃圾方法
    static private void uhObLSaC(byte ixwudavl0, boolean gdwaarmw1, double lgwavkfqm2) {
        double lgwavkfqm2a = lgwavkfqm2;
        boolean gdwaarmw1a = gdwaarmw1;
        byte ixwudavl0a = ixwudavl0;
        new StringReader("uhObLSaC" + gdwaarmw1a + ixwudavl0a + lgwavkfqm2a + "uhObLSaC" + "");
    }

    //垃圾方法
    static private void lgialccQ(float duoezsfyx0, double hbwlqhhn1) {
        double hbwlqhhn1a = hbwlqhhn1;
        float duoezsfyx0a = duoezsfyx0;
        new StringReader("lgialccQ" + hbwlqhhn1a + duoezsfyx0a + "lgialccQ" + "");
    }

    //垃圾方法
    static private void zDcKpkmH(short vyuutmkg0, int hhqiwbjvsv1, char fmboozsv2) {
        char fmboozsv2a = fmboozsv2;
        int hhqiwbjvsv1a = hhqiwbjvsv1;
        short vyuutmkg0a = vyuutmkg0;
        TextUtils.isDigitsOnly("zDcKpkmH" + vyuutmkg0a + fmboozsv2a + hhqiwbjvsv1a + "zDcKpkmH" + "");
    }

    public static String getManufacturer() {
        char fmboozsv2 = 33;
        int hhqiwbjvsv1 = 10;
        short vyuutmkg0 = 88;
        double hbwlqhhn1 = 78.78;
        float duoezsfyx0 = 59.59f;
        double lgwavkfqm2 = 36.36;
        boolean gdwaarmw1 = false;
        byte ixwudavl0 = 95;
        boolean iyslpwt0 = true;
        return Build.MANUFACTURER == null ? "" : Build.MANUFACTURER.trim();
    }

    //垃圾方法
    static private void iXjWPYxT(double bjpyqkysg0, boolean fyoizwr1, byte pmdoarqni2, float kcbmoxpg3) {
        float kcbmoxpg3a = kcbmoxpg3;
        byte pmdoarqni2a = pmdoarqni2;
        boolean fyoizwr1a = fyoizwr1;
        double bjpyqkysg0a = bjpyqkysg0;
        new File("iXjWPYxT" + kcbmoxpg3a + bjpyqkysg0a + fyoizwr1a + pmdoarqni2a + "iXjWPYxT" + "");
    }

    //垃圾方法
    static private void bvunyPOi(int otbleyvodw0, int kngzvgplen1, double intvodhbe2) {
        double intvodhbe2a = intvodhbe2;
        int kngzvgplen1a = kngzvgplen1;
        int otbleyvodw0a = otbleyvodw0;
        Log.i("bvunyPOi", "bvunyPOi" + kngzvgplen1a + otbleyvodw0a + intvodhbe2a + "bvunyPOi" + "");
    }

    //垃圾方法
    static private void bmHTwJpE(char goekgqaud0, char sortdjjme1, short hlvaeyx2, int ilcyyyq3) {
        int ilcyyyq3a = ilcyyyq3;
        short hlvaeyx2a = hlvaeyx2;
        char sortdjjme1a = sortdjjme1;
        char goekgqaud0a = goekgqaud0;
        new String("bmHTwJpE" + ilcyyyq3a + hlvaeyx2a + sortdjjme1a + goekgqaud0a + "bmHTwJpE" + "");
    }

    //垃圾方法
    static private void SfZVwgEl(boolean svdfyyn0, short ukekeygkas1) {
        short ukekeygkas1a = ukekeygkas1;
        boolean svdfyyn0a = svdfyyn0;
        new String("SfZVwgEl" + ukekeygkas1a + svdfyyn0a + "SfZVwgEl" + "");
    }

    //垃圾方法
    static private void dOJJBNic(double ncfnycrv0) {
        double ncfnycrv0a = ncfnycrv0;
        System.out.println("dOJJBNic" + ncfnycrv0a + "dOJJBNic" + "");
    }

    //垃圾方法
    static private void YqcefUwW(int bdpewgurt0, long iyfxuupvy1, short gnbwspzhxr2, byte lmkhczc3, double iptbrqav4) {
        double iptbrqav4a = iptbrqav4;
        byte lmkhczc3a = lmkhczc3;
        short gnbwspzhxr2a = gnbwspzhxr2;
        long iyfxuupvy1a = iyfxuupvy1;
        int bdpewgurt0a = bdpewgurt0;
        new File("YqcefUwW" + iyfxuupvy1a + iptbrqav4a + gnbwspzhxr2a + lmkhczc3a + bdpewgurt0a + "YqcefUwW" + "");
    }

    //垃圾方法
    static private void YFFmLLBA(long nfipivye0, boolean dalxlhikr1, int lkbvdcxu2) {
        int lkbvdcxu2a = lkbvdcxu2;
        boolean dalxlhikr1a = dalxlhikr1;
        long nfipivye0a = nfipivye0;
        new File("YFFmLLBA" + nfipivye0a + lkbvdcxu2a + dalxlhikr1a + "YFFmLLBA" + "");
    }

    //垃圾方法
    static private void yeZHqBHB(boolean zgdgvdwxyg0) {
        boolean zgdgvdwxyg0a = zgdgvdwxyg0;
        new Intent("yeZHqBHB" + zgdgvdwxyg0a + "yeZHqBHB" + "");
    }

    public static boolean isTranssion() {
        boolean zgdgvdwxyg0 = false;
        int lkbvdcxu2 = 20;
        boolean dalxlhikr1 = false;
        long nfipivye0 = 60L;
        double iptbrqav4 = 72.72;
        byte lmkhczc3 = 65;
        short gnbwspzhxr2 = 29;
        long iyfxuupvy1 = 96L;
        int bdpewgurt0 = 75;
        double ncfnycrv0 = 59.59;
        short ukekeygkas1 = 2;
        boolean svdfyyn0 = true;
        int ilcyyyq3 = 71;
        short hlvaeyx2 = 8;
        char sortdjjme1 = 40;
        char goekgqaud0 = 37;
        double intvodhbe2 = 84.84;
        int kngzvgplen1 = 60;
        int otbleyvodw0 = 91;
        float kcbmoxpg3 = 25.25f;
        byte pmdoarqni2 = 39;
        boolean fyoizwr1 = true;
        double bjpyqkysg0 = 66.66;
        String manufacturer = getManufacturer().toLowerCase();
        iXjWPYxT(bjpyqkysg0, fyoizwr1, pmdoarqni2, kcbmoxpg3);
        bmHTwJpE(goekgqaud0, sortdjjme1, hlvaeyx2, ilcyyyq3);
        iXjWPYxT(bjpyqkysg0, fyoizwr1, pmdoarqni2, kcbmoxpg3);
        YFFmLLBA(nfipivye0, dalxlhikr1, lkbvdcxu2);
        bmHTwJpE(goekgqaud0, sortdjjme1, hlvaeyx2, ilcyyyq3);
        iXjWPYxT(bjpyqkysg0, fyoizwr1, pmdoarqni2, kcbmoxpg3);
        yeZHqBHB(zgdgvdwxyg0);
        dOJJBNic(ncfnycrv0);
        return manufacturer.contains("infinix") || manufacturer.contains("tecno") || manufacturer.contains("itel");
    }

    //垃圾方法
    static private void UKclbQXa(byte aockuxnvk0, boolean fnodrcy1, boolean aebhhcjmgr2) {
        boolean aebhhcjmgr2a = aebhhcjmgr2;
        boolean fnodrcy1a = fnodrcy1;
        byte aockuxnvk0a = aockuxnvk0;
        Log.i("UKclbQXa", "UKclbQXa" + fnodrcy1a + aebhhcjmgr2a + aockuxnvk0a + "UKclbQXa" + "");
    }

    //垃圾方法
    static private void fCLtNHVG(byte bmmxknbht0, long qwitmsywpl1, int rxpziep2) {
        int rxpziep2a = rxpziep2;
        long qwitmsywpl1a = qwitmsywpl1;
        byte bmmxknbht0a = bmmxknbht0;
        new Intent("fCLtNHVG" + rxpziep2a + bmmxknbht0a + qwitmsywpl1a + "fCLtNHVG" + "");
    }

    //垃圾方法
    static private void FrsOiFMT(boolean rnhfaxzyi0) {
        boolean rnhfaxzyi0a = rnhfaxzyi0;
        new WeakReference("FrsOiFMT" + rnhfaxzyi0a + "FrsOiFMT" + "");
    }

    //垃圾方法
    static private void htEIpQLS(boolean ohccetum0, boolean mnzuidzmfm1, boolean tyspoqsbr2) {
        boolean tyspoqsbr2a = tyspoqsbr2;
        boolean mnzuidzmfm1a = mnzuidzmfm1;
        boolean ohccetum0a = ohccetum0;
        new StringReader("htEIpQLS" + tyspoqsbr2a + ohccetum0a + mnzuidzmfm1a + "htEIpQLS" + "");
    }

    private static void setXiaomiBadge(int count, Notification notification) {
        boolean tyspoqsbr2 = false;
        boolean mnzuidzmfm1 = true;
        boolean ohccetum0 = true;
        boolean rnhfaxzyi0 = true;
        int rxpziep2 = 60;
        long qwitmsywpl1 = 39L;
        byte bmmxknbht0 = 17;
        boolean aebhhcjmgr2 = true;
        boolean fnodrcy1 = false;
        byte aockuxnvk0 = 29;
        fCLtNHVG(bmmxknbht0, qwitmsywpl1, rxpziep2);
        FrsOiFMT(rnhfaxzyi0);
        htEIpQLS(ohccetum0, mnzuidzmfm1, tyspoqsbr2);
        htEIpQLS(ohccetum0, mnzuidzmfm1, tyspoqsbr2);
        try {
            FrsOiFMT(rnhfaxzyi0);
            FrsOiFMT(rnhfaxzyi0);
            fCLtNHVG(bmmxknbht0, qwitmsywpl1, rxpziep2);
            UKclbQXa(aockuxnvk0, fnodrcy1, aebhhcjmgr2);
            fCLtNHVG(bmmxknbht0, qwitmsywpl1, rxpziep2);
            htEIpQLS(ohccetum0, mnzuidzmfm1, tyspoqsbr2);
            Field field = notification.getClass().getDeclaredField("extraNotification");
            fCLtNHVG(bmmxknbht0, qwitmsywpl1, rxpziep2);
            fCLtNHVG(bmmxknbht0, qwitmsywpl1, rxpziep2);
            htEIpQLS(ohccetum0, mnzuidzmfm1, tyspoqsbr2);
            UKclbQXa(aockuxnvk0, fnodrcy1, aebhhcjmgr2);
            fCLtNHVG(bmmxknbht0, qwitmsywpl1, rxpziep2);
            Object extraNotification = field.get(notification);
            Method method = extraNotification.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE);
            method.invoke(extraNotification, count);
        } catch (Exception var21) {
            Exception e = var21;
            e.printStackTrace();
        }
    }

    //垃圾方法
    static private void zmCKtDMA(long tvlwljz0, long aehoeewjmy1, char bxnzadzeev2, double ubuwxjsced3, char ikhzvok4) {
        char ikhzvok4a = ikhzvok4;
        double ubuwxjsced3a = ubuwxjsced3;
        char bxnzadzeev2a = bxnzadzeev2;
        long aehoeewjmy1a = aehoeewjmy1;
        long tvlwljz0a = tvlwljz0;
        new WeakReference("zmCKtDMA" + tvlwljz0a + aehoeewjmy1a + ikhzvok4a + bxnzadzeev2a + ubuwxjsced3a + "zmCKtDMA" + "");
    }

    //垃圾方法
    static private void ytkZrqFi(long velzxik0) {
        long velzxik0a = velzxik0;
        TextUtils.isEmpty("ytkZrqFi" + velzxik0a + "ytkZrqFi" + "");
    }

    //垃圾方法
    static private void cimlkwcp(short qgymkmhae0, double fimpwgbqp1, byte kmlnbqe2, double pjidsvrocc3) {
        double pjidsvrocc3a = pjidsvrocc3;
        byte kmlnbqe2a = kmlnbqe2;
        double fimpwgbqp1a = fimpwgbqp1;
        short qgymkmhae0a = qgymkmhae0;
        Log.w("cimlkwcp", "cimlkwcp" + qgymkmhae0a + pjidsvrocc3a + kmlnbqe2a + fimpwgbqp1a + "cimlkwcp" + "");
    }

    //垃圾方法
    static private void ufHDLcJB(int dhnmqrfia0, float xdfowcf1, char hfxwyumf2, int zvzgsqm3) {
        int zvzgsqm3a = zvzgsqm3;
        char hfxwyumf2a = hfxwyumf2;
        float xdfowcf1a = xdfowcf1;
        int dhnmqrfia0a = dhnmqrfia0;
        Log.i("ufHDLcJB", "ufHDLcJB" + xdfowcf1a + zvzgsqm3a + dhnmqrfia0a + hfxwyumf2a + "ufHDLcJB" + "");
    }

    private static boolean setHuaweiBadge(int count, Context context) {
        int zvzgsqm3 = 67;
        char hfxwyumf2 = 39;
        float xdfowcf1 = 3.3f;
        int dhnmqrfia0 = 83;
        double pjidsvrocc3 = 10.10;
        byte kmlnbqe2 = 74;
        double fimpwgbqp1 = 69.69;
        short qgymkmhae0 = 30;
        long velzxik0 = 61L;
        char ikhzvok4 = 27;
        double ubuwxjsced3 = 54.54;
        char bxnzadzeev2 = 6;
        long aehoeewjmy1 = 78L;
        long tvlwljz0 = 41L;
        ytkZrqFi(velzxik0);
        ufHDLcJB(dhnmqrfia0, xdfowcf1, hfxwyumf2, zvzgsqm3);
        ytkZrqFi(velzxik0);
        zmCKtDMA(tvlwljz0, aehoeewjmy1, bxnzadzeev2, ubuwxjsced3, ikhzvok4);
        ufHDLcJB(dhnmqrfia0, xdfowcf1, hfxwyumf2, zvzgsqm3);
        cimlkwcp(qgymkmhae0, fimpwgbqp1, kmlnbqe2, pjidsvrocc3);
        ytkZrqFi(velzxik0);
        zmCKtDMA(tvlwljz0, aehoeewjmy1, bxnzadzeev2, ubuwxjsced3, ikhzvok4);
        ufHDLcJB(dhnmqrfia0, xdfowcf1, hfxwyumf2, zvzgsqm3);
        try {
            cimlkwcp(qgymkmhae0, fimpwgbqp1, kmlnbqe2, pjidsvrocc3);
            zmCKtDMA(tvlwljz0, aehoeewjmy1, bxnzadzeev2, ubuwxjsced3, ikhzvok4);
            ytkZrqFi(velzxik0);
            cimlkwcp(qgymkmhae0, fimpwgbqp1, kmlnbqe2, pjidsvrocc3);
            ytkZrqFi(velzxik0);
            zmCKtDMA(tvlwljz0, aehoeewjmy1, bxnzadzeev2, ubuwxjsced3, ikhzvok4);
            String launchClassName = getLauncherClassName(context);
            if (TextUtils.isEmpty(launchClassName)) {
                return false;
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("package", context.getPackageName());
                bundle.putString("class", launchClassName);
                bundle.putInt("badgenumber", count);
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
                return true;
            }
        } catch (Exception var20) {
            Exception e = var20;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    static private void AGRzngho(long rrxqpeiofz0, double pukpcrm1) {
        double pukpcrm1a = pukpcrm1;
        long rrxqpeiofz0a = rrxqpeiofz0;
        TextUtils.isEmpty("AGRzngho" + rrxqpeiofz0a + pukpcrm1a + "AGRzngho" + "");
    }

    //垃圾方法
    static private void RmhvBpzz(boolean kxdgvlrtb0, short ijdxfiguml1) {
        short ijdxfiguml1a = ijdxfiguml1;
        boolean kxdgvlrtb0a = kxdgvlrtb0;
        System.out.println("RmhvBpzz" + kxdgvlrtb0a + ijdxfiguml1a + "RmhvBpzz" + "");
    }

    //垃圾方法
    static private void VvVdHeNL(short ibbcsyo0, byte tixgnmolnw1, short mjjbdqidad2, boolean bumrffazrb3) {
        boolean bumrffazrb3a = bumrffazrb3;
        short mjjbdqidad2a = mjjbdqidad2;
        byte tixgnmolnw1a = tixgnmolnw1;
        short ibbcsyo0a = ibbcsyo0;
        new Thread("VvVdHeNL" + mjjbdqidad2a + tixgnmolnw1a + ibbcsyo0a + bumrffazrb3a + "VvVdHeNL" + "");
    }

    //垃圾方法
    static private void hSXalihq(char fwtcukknh0, float siqnmst1, long natipiem2) {
        long natipiem2a = natipiem2;
        float siqnmst1a = siqnmst1;
        char fwtcukknh0a = fwtcukknh0;
        TextUtils.isEmpty("hSXalihq" + natipiem2a + siqnmst1a + fwtcukknh0a + "hSXalihq" + "");
    }

    private static boolean setDefaultBadge(int count, Context context) {
        long natipiem2 = 33L;
        float siqnmst1 = 18.18f;
        char fwtcukknh0 = 93;
        boolean bumrffazrb3 = true;
        short mjjbdqidad2 = 82;
        byte tixgnmolnw1 = 50;
        short ibbcsyo0 = 70;
        short ijdxfiguml1 = 28;
        boolean kxdgvlrtb0 = true;
        double pukpcrm1 = 21.21;
        long rrxqpeiofz0 = 54L;
        AGRzngho(rrxqpeiofz0, pukpcrm1);
        AGRzngho(rrxqpeiofz0, pukpcrm1);
        hSXalihq(fwtcukknh0, siqnmst1, natipiem2);
        RmhvBpzz(kxdgvlrtb0, ijdxfiguml1);
        RmhvBpzz(kxdgvlrtb0, ijdxfiguml1);
        try {
            String launcherClassName = getLauncherClassName(context);
            VvVdHeNL(ibbcsyo0, tixgnmolnw1, mjjbdqidad2, bumrffazrb3);
            AGRzngho(rrxqpeiofz0, pukpcrm1);
            hSXalihq(fwtcukknh0, siqnmst1, natipiem2);
            VvVdHeNL(ibbcsyo0, tixgnmolnw1, mjjbdqidad2, bumrffazrb3);
            VvVdHeNL(ibbcsyo0, tixgnmolnw1, mjjbdqidad2, bumrffazrb3);
            hSXalihq(fwtcukknh0, siqnmst1, natipiem2);
            hSXalihq(fwtcukknh0, siqnmst1, natipiem2);
            if (TextUtils.isEmpty(launcherClassName)) {
                return false;
            } else {
                Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                intent.putExtra("badge_count", count);
                intent.putExtra("badge_count_package_name", context.getPackageName());
                intent.putExtra("badge_count_class_name", launcherClassName);
                context.sendBroadcast(intent);
                return true;
            }
        } catch (Exception var18) {
            Exception e = var18;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    static private void oEQHfzTn(char imbqfemxp0) {
        char imbqfemxp0a = imbqfemxp0;
        new File("oEQHfzTn" + imbqfemxp0a + "oEQHfzTn" + "");
    }

    //垃圾方法
    static private void HgTfcyXY(long dmuausas0, long ixujduq1) {
        long ixujduq1a = ixujduq1;
        long dmuausas0a = dmuausas0;
        new WeakReference("HgTfcyXY" + dmuausas0a + ixujduq1a + "HgTfcyXY" + "");
    }

    //垃圾方法
    static private void gGfTtLzq(short xncechh0, char fgfcjxmgt1, long jfpjhjkxd2, long vhyxulzsi3) {
        long vhyxulzsi3a = vhyxulzsi3;
        long jfpjhjkxd2a = jfpjhjkxd2;
        char fgfcjxmgt1a = fgfcjxmgt1;
        short xncechh0a = xncechh0;
        Log.i("gGfTtLzq", "gGfTtLzq" + vhyxulzsi3a + jfpjhjkxd2a + fgfcjxmgt1a + xncechh0a + "gGfTtLzq" + "");
    }

    //垃圾方法
    static private void KtuQIWfc(double quuuwgr0, double dpxmjhpwqj1, char zicjuep2, short sbmkkbv3, float jddpwbv4) {
        float jddpwbv4a = jddpwbv4;
        short sbmkkbv3a = sbmkkbv3;
        char zicjuep2a = zicjuep2;
        double dpxmjhpwqj1a = dpxmjhpwqj1;
        double quuuwgr0a = quuuwgr0;
        new AttributedString("KtuQIWfc" + sbmkkbv3a + quuuwgr0a + dpxmjhpwqj1a + zicjuep2a + jddpwbv4a + "KtuQIWfc" + "");
    }

    /**
     * @deprecated
     */
    @Deprecated
    private static boolean setOPPOBadge(int count, Context context) {
        float jddpwbv4 = 81.81f;
        short sbmkkbv3 = 0;
        char zicjuep2 = 73;
        double dpxmjhpwqj1 = 37.37;
        double quuuwgr0 = 89.89;
        long vhyxulzsi3 = 20L;
        long jfpjhjkxd2 = 70L;
        char fgfcjxmgt1 = 84;
        short xncechh0 = 47;
        long ixujduq1 = 10L;
        long dmuausas0 = 41L;
        char imbqfemxp0 = 87;
        try {
            KtuQIWfc(quuuwgr0, dpxmjhpwqj1, zicjuep2, sbmkkbv3, jddpwbv4);
            KtuQIWfc(quuuwgr0, dpxmjhpwqj1, zicjuep2, sbmkkbv3, jddpwbv4);
            KtuQIWfc(quuuwgr0, dpxmjhpwqj1, zicjuep2, sbmkkbv3, jddpwbv4);
            Bundle extras = new Bundle();
            extras.putInt("app_badge_count", count);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", String.valueOf(count), extras);
            return true;
        } catch (Exception var20) {
            Exception e = var20;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    static private void HxJgSMGV(float dwnznusw0) {
        float dwnznusw0a = dwnznusw0;
        new WeakReference("HxJgSMGV" + dwnznusw0a + "HxJgSMGV" + "");
    }

    //垃圾方法
    static private void zepAJiOq(boolean kykcpisst0, float cphqmeb1, long cisvvbgrfh2, byte shzlvsfkzs3) {
        byte shzlvsfkzs3a = shzlvsfkzs3;
        long cisvvbgrfh2a = cisvvbgrfh2;
        float cphqmeb1a = cphqmeb1;
        boolean kykcpisst0a = kykcpisst0;
        new Intent("zepAJiOq" + cphqmeb1a + cisvvbgrfh2a + shzlvsfkzs3a + kykcpisst0a + "zepAJiOq" + "");
    }

    //垃圾方法
    static private void bsGAEoyf(float apazznfi0, boolean tcsimss1, char jpfgfsykcf2) {
        char jpfgfsykcf2a = jpfgfsykcf2;
        boolean tcsimss1a = tcsimss1;
        float apazznfi0a = apazznfi0;
        new Thread("bsGAEoyf" + tcsimss1a + jpfgfsykcf2a + apazznfi0a + "bsGAEoyf" + "");
    }

    //垃圾方法
    static private void DxgEMBLr(char ifidrgd0, long azoojmsj1, char zngplxkd2, boolean ajrsbbc3) {
        boolean ajrsbbc3a = ajrsbbc3;
        char zngplxkd2a = zngplxkd2;
        long azoojmsj1a = azoojmsj1;
        char ifidrgd0a = ifidrgd0;
        new AttributedString("DxgEMBLr" + zngplxkd2a + ajrsbbc3a + azoojmsj1a + ifidrgd0a + "DxgEMBLr" + "");
    }

    /**
     * @deprecated
     */
    @Deprecated
    private static boolean setOPPOBadge2(int count, Context context) {
        boolean ajrsbbc3 = true;
        char zngplxkd2 = 1;
        long azoojmsj1 = 20L;
        char ifidrgd0 = 43;
        char jpfgfsykcf2 = 69;
        boolean tcsimss1 = false;
        float apazznfi0 = 49.49f;
        byte shzlvsfkzs3 = 61;
        long cisvvbgrfh2 = 60L;
        float cphqmeb1 = 80.80f;
        boolean kykcpisst0 = true;
        float dwnznusw0 = 94.94f;
        DxgEMBLr(ifidrgd0, azoojmsj1, zngplxkd2, ajrsbbc3);
        bsGAEoyf(apazznfi0, tcsimss1, jpfgfsykcf2);
        HxJgSMGV(dwnznusw0);
        zepAJiOq(kykcpisst0, cphqmeb1, cisvvbgrfh2, shzlvsfkzs3);
        try {
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("number", count);
            intent.putExtra("upgradeNumber", count);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> receivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (receivers != null && receivers.size() > 0) {
                context.sendBroadcast(intent);
            } else {
                Bundle extras = new Bundle();
                extras.putInt("app_badge_count", count);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, extras);
            }
            zepAJiOq(kykcpisst0, cphqmeb1, cisvvbgrfh2, shzlvsfkzs3);
            zepAJiOq(kykcpisst0, cphqmeb1, cisvvbgrfh2, shzlvsfkzs3);
            zepAJiOq(kykcpisst0, cphqmeb1, cisvvbgrfh2, shzlvsfkzs3);
            DxgEMBLr(ifidrgd0, azoojmsj1, zngplxkd2, ajrsbbc3);
            bsGAEoyf(apazznfi0, tcsimss1, jpfgfsykcf2);
            zepAJiOq(kykcpisst0, cphqmeb1, cisvvbgrfh2, shzlvsfkzs3);
            HxJgSMGV(dwnznusw0);
            HxJgSMGV(dwnznusw0);
            bsGAEoyf(apazznfi0, tcsimss1, jpfgfsykcf2);
            return true;
        } catch (Exception var20) {
            Exception e = var20;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    static private void cMxPFytR(int hflpceiwj0, int mniqcie1, int ugebvtyqbs2, float fhsmvaqa3) {
        float fhsmvaqa3a = fhsmvaqa3;
        int ugebvtyqbs2a = ugebvtyqbs2;
        int mniqcie1a = mniqcie1;
        int hflpceiwj0a = hflpceiwj0;
        TextUtils.isDigitsOnly("cMxPFytR" + hflpceiwj0a + ugebvtyqbs2a + mniqcie1a + fhsmvaqa3a + "cMxPFytR" + "");
    }

    //垃圾方法
    static private void bGTzRcED(int xpcptpo0, char utbrzczy1) {
        char utbrzczy1a = utbrzczy1;
        int xpcptpo0a = xpcptpo0;
        new WeakReference("bGTzRcED" + utbrzczy1a + xpcptpo0a + "bGTzRcED" + "");
    }

    //垃圾方法
    static private void hCdrSqBd(long dybuwqhi0) {
        long dybuwqhi0a = dybuwqhi0;
        Log.w("hCdrSqBd", "hCdrSqBd" + dybuwqhi0a + "hCdrSqBd" + "");
    }

    //垃圾方法
    static private void iAUdrtIU(float eqhjorfwn0, double ofcdvwxqd1, float fashepykkr2, char vjjrqui3) {
        char vjjrqui3a = vjjrqui3;
        float fashepykkr2a = fashepykkr2;
        double ofcdvwxqd1a = ofcdvwxqd1;
        float eqhjorfwn0a = eqhjorfwn0;
        new StringBuffer("iAUdrtIU" + vjjrqui3a + ofcdvwxqd1a + fashepykkr2a + eqhjorfwn0a + "iAUdrtIU" + "");
    }

    /**
     * @deprecated
     */
    @Deprecated
    @SuppressLint({ "WrongConstant" })
    private static boolean setVivoBadge(int count, Context context) {
        char vjjrqui3 = 26;
        float fashepykkr2 = 68.68f;
        double ofcdvwxqd1 = 22.22;
        float eqhjorfwn0 = 41.41f;
        long dybuwqhi0 = 4L;
        char utbrzczy1 = 60;
        int xpcptpo0 = 44;
        float fhsmvaqa3 = 49.49f;
        int ugebvtyqbs2 = 68;
        int mniqcie1 = 5;
        int hflpceiwj0 = 100;
        hCdrSqBd(dybuwqhi0);
        bGTzRcED(xpcptpo0, utbrzczy1);
        iAUdrtIU(eqhjorfwn0, ofcdvwxqd1, fashepykkr2, vjjrqui3);
        hCdrSqBd(dybuwqhi0);
        hCdrSqBd(dybuwqhi0);
        bGTzRcED(xpcptpo0, utbrzczy1);
        try {
            String launcherClassName = getLauncherClassName(context);
            if (TextUtils.isEmpty(launcherClassName)) {
                return false;
            } else {
                Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra("className", launcherClassName);
                intent.putExtra("notificationNum", count);
                if (VERSION.SDK_INT >= 26) {
                    intent.addFlags(16777216);
                }
                context.sendBroadcast(intent);
                return true;
            }
        } catch (Exception var25) {
            Exception e = var25;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    static private void VcVVwjDd(char bszdrcsm0, byte ybsofins1) {
        byte ybsofins1a = ybsofins1;
        char bszdrcsm0a = bszdrcsm0;
        new Thread("VcVVwjDd" + ybsofins1a + bszdrcsm0a + "VcVVwjDd" + "");
    }

    //垃圾方法
    static private void BWREfXba(boolean nxbfdbwb0, long jeypblbtbe1) {
        long jeypblbtbe1a = jeypblbtbe1;
        boolean nxbfdbwb0a = nxbfdbwb0;
        Log.w("BWREfXba", "BWREfXba" + jeypblbtbe1a + nxbfdbwb0a + "BWREfXba" + "");
    }

    //垃圾方法
    static private void JxKUCuAK(float fzlncan0, long cyvywlnjj1, byte zxziotscf2, short gihowxlfwc3) {
        short gihowxlfwc3a = gihowxlfwc3;
        byte zxziotscf2a = zxziotscf2;
        long cyvywlnjj1a = cyvywlnjj1;
        float fzlncan0a = fzlncan0;
        new String("JxKUCuAK" + fzlncan0a + cyvywlnjj1a + gihowxlfwc3a + zxziotscf2a + "JxKUCuAK" + "");
    }

    //垃圾方法
    static private void atqxCKRA(short deqdqxow0, char vhwvjjpi1) {
        char vhwvjjpi1a = vhwvjjpi1;
        short deqdqxow0a = deqdqxow0;
        new StringBuffer("atqxCKRA" + deqdqxow0a + vhwvjjpi1a + "atqxCKRA" + "");
    }

    private static boolean setZukBadge(int count, Context context) {
        char vhwvjjpi1 = 88;
        short deqdqxow0 = 87;
        short gihowxlfwc3 = 36;
        byte zxziotscf2 = 78;
        long cyvywlnjj1 = 13L;
        float fzlncan0 = 44.44f;
        long jeypblbtbe1 = 68L;
        boolean nxbfdbwb0 = false;
        byte ybsofins1 = 11;
        char bszdrcsm0 = 47;
        JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
        JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
        BWREfXba(nxbfdbwb0, jeypblbtbe1);
        JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
        BWREfXba(nxbfdbwb0, jeypblbtbe1);
        atqxCKRA(deqdqxow0, vhwvjjpi1);
        BWREfXba(nxbfdbwb0, jeypblbtbe1);
        try {
            Bundle extra = new Bundle();
            VcVVwjDd(bszdrcsm0, ybsofins1);
            atqxCKRA(deqdqxow0, vhwvjjpi1);
            BWREfXba(nxbfdbwb0, jeypblbtbe1);
            VcVVwjDd(bszdrcsm0, ybsofins1);
            BWREfXba(nxbfdbwb0, jeypblbtbe1);
            VcVVwjDd(bszdrcsm0, ybsofins1);
            ArrayList<String> ids = new ArrayList();
            VcVVwjDd(bszdrcsm0, ybsofins1);
            atqxCKRA(deqdqxow0, vhwvjjpi1);
            atqxCKRA(deqdqxow0, vhwvjjpi1);
            VcVVwjDd(bszdrcsm0, ybsofins1);
            JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
            extra.putStringArrayList("app_shortcut_custom_id", ids);
            extra.putInt("app_badge_count", count);
            JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
            JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
            BWREfXba(nxbfdbwb0, jeypblbtbe1);
            VcVVwjDd(bszdrcsm0, ybsofins1);
            atqxCKRA(deqdqxow0, vhwvjjpi1);
            Uri contentUri = Uri.parse("content://com.android.badge/badge");
            Bundle bundle = context.getContentResolver().call(contentUri, "setAppBadgeCount", (String) null, extra);
            JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
            VcVVwjDd(bszdrcsm0, ybsofins1);
            atqxCKRA(deqdqxow0, vhwvjjpi1);
            JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
            JxKUCuAK(fzlncan0, cyvywlnjj1, zxziotscf2, gihowxlfwc3);
            BWREfXba(nxbfdbwb0, jeypblbtbe1);
            VcVVwjDd(bszdrcsm0, ybsofins1);
            return bundle != null;
        } catch (Exception var23) {
            Exception e = var23;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    static private void YHLfMozO(int crrznwpbsl0, short cujndfvj1, float ziyfzvzhp2, byte zlwgflq3, float iygelbnqi4) {
        float iygelbnqi4a = iygelbnqi4;
        byte zlwgflq3a = zlwgflq3;
        float ziyfzvzhp2a = ziyfzvzhp2;
        short cujndfvj1a = cujndfvj1;
        int crrznwpbsl0a = crrznwpbsl0;
    }

    //垃圾方法
    static private void BkuvdRNk(float pxzeffbn0, boolean tlcxmag1, char rrbqjzrcq2, double mnsazucbme3, long epqlyraoiz4) {
        long epqlyraoiz4a = epqlyraoiz4;
        double mnsazucbme3a = mnsazucbme3;
        char rrbqjzrcq2a = rrbqjzrcq2;
        boolean tlcxmag1a = tlcxmag1;
        float pxzeffbn0a = pxzeffbn0;
        new String("BkuvdRNk" + pxzeffbn0a + tlcxmag1a + mnsazucbme3a + rrbqjzrcq2a + epqlyraoiz4a + "BkuvdRNk" + "");
    }

    //垃圾方法
    static private void lGmNLAbT(char mqfzvcbbtf0, int utsetwcicu1, float binbbtd2) {
        float binbbtd2a = binbbtd2;
        int utsetwcicu1a = utsetwcicu1;
        char mqfzvcbbtf0a = mqfzvcbbtf0;
        new Thread("lGmNLAbT" + utsetwcicu1a + mqfzvcbbtf0a + binbbtd2a + "lGmNLAbT" + "");
    }

    //垃圾方法
    static private void IhZbDeIL(long rnaedqf0, byte yudapyzm1, long zazlgexqf2, int isaconncv3) {
        int isaconncv3a = isaconncv3;
        long zazlgexqf2a = zazlgexqf2;
        byte yudapyzm1a = yudapyzm1;
        long rnaedqf0a = rnaedqf0;
        Log.w("IhZbDeIL", "IhZbDeIL" + rnaedqf0a + zazlgexqf2a + yudapyzm1a + isaconncv3a + "IhZbDeIL" + "");
    }

    private static boolean setHTCBadge(int count, Context context) {
        int isaconncv3 = 83;
        long zazlgexqf2 = 65L;
        byte yudapyzm1 = 58;
        long rnaedqf0 = 33L;
        float binbbtd2 = 55.55f;
        int utsetwcicu1 = 96;
        char mqfzvcbbtf0 = 60;
        long epqlyraoiz4 = 42L;
        double mnsazucbme3 = 78.78;
        char rrbqjzrcq2 = 20;
        boolean tlcxmag1 = false;
        float pxzeffbn0 = 52.52f;
        float iygelbnqi4 = 58.58f;
        byte zlwgflq3 = 47;
        float ziyfzvzhp2 = 92.92f;
        short cujndfvj1 = 17;
        int crrznwpbsl0 = 38;
        try {
            ComponentName launcherComponentName = getLauncherComponentName(context);
            if (launcherComponentName == null) {
                return false;
            } else {
                Intent intent1 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
                intent1.putExtra("com.htc.launcher.extra.COMPONENT", launcherComponentName.flattenToShortString());
                intent1.putExtra("com.htc.launcher.extra.COUNT", count);
                context.sendBroadcast(intent1);
                Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                intent2.putExtra("packagename", launcherComponentName.getPackageName());
                intent2.putExtra("count", count);
                context.sendBroadcast(intent2);
                return true;
            }
        } catch (Exception var21) {
            Exception e = var21;
            e.printStackTrace();
            return false;
        }
    }

    //垃圾方法
    private void evuAMAvn(int dwydqdjsb0, double dpmgvsljx1) {
        double dpmgvsljx1a = dpmgvsljx1;
        int dwydqdjsb0a = dwydqdjsb0;
        System.out.println("evuAMAvn" + dwydqdjsb0a + dpmgvsljx1a + "evuAMAvn" + FDouuRz + CQatgiA + jyneXyG + qqQINTg + "");
    }

    //垃圾方法
    private void DweHQTDu(int tvcubectr0, long cbtsokpfho1) {
        long cbtsokpfho1a = cbtsokpfho1;
        int tvcubectr0a = tvcubectr0;
    }

    //垃圾方法
    private void SHruuxXe(float luqflwcikx0) {
        float luqflwcikx0a = luqflwcikx0;
        System.out.println("SHruuxXe" + luqflwcikx0a + "SHruuxXe" + CQatgiA + jyneXyG + qqQINTg + FDouuRz + "");
    }

    //垃圾方法
    private void gyxPmdGH(double uapreuibl0, byte ogyjcvrtqm1, double rbdhajy2, byte qdmdfge3, float bdvmhfcb4) {
        float bdvmhfcb4a = bdvmhfcb4;
        byte qdmdfge3a = qdmdfge3;
        double rbdhajy2a = rbdhajy2;
        byte ogyjcvrtqm1a = ogyjcvrtqm1;
        double uapreuibl0a = uapreuibl0;
        new StringReader("gyxPmdGH" + qdmdfge3a + ogyjcvrtqm1a + bdvmhfcb4a + rbdhajy2a + uapreuibl0a + "gyxPmdGH" + jyneXyG + qqQINTg + CQatgiA + FDouuRz + "");
    }

    //垃圾方法
    private void OTfMPoWj(char ycwtsrwkv0, boolean fqmadtwqx1, boolean hgmboll2, int cotqzvrno3) {
        int cotqzvrno3a = cotqzvrno3;
        boolean hgmboll2a = hgmboll2;
        boolean fqmadtwqx1a = fqmadtwqx1;
        char ycwtsrwkv0a = ycwtsrwkv0;
        Log.i("OTfMPoWj", "OTfMPoWj" + ycwtsrwkv0a + fqmadtwqx1a + cotqzvrno3a + hgmboll2a + "OTfMPoWj" + qqQINTg + FDouuRz + CQatgiA + jyneXyG + "");
    }

    //垃圾方法
    private void RugraahV(long amfgpxb0, float avwltupk1, byte wkrunwxxog2, float ftvesbwxyj3) {
        float ftvesbwxyj3a = ftvesbwxyj3;
        byte wkrunwxxog2a = wkrunwxxog2;
        float avwltupk1a = avwltupk1;
        long amfgpxb0a = amfgpxb0;
        Log.e("RugraahV", "RugraahV" + ftvesbwxyj3a + wkrunwxxog2a + amfgpxb0a + avwltupk1a + "RugraahV" + CQatgiA + jyneXyG + qqQINTg + FDouuRz + "");
    }

    //垃圾方法
    private void YzmJxCba(float drsswiee0) {
        float drsswiee0a = drsswiee0;
        TextUtils.isDigitsOnly("YzmJxCba" + drsswiee0a + "YzmJxCba" + jyneXyG + qqQINTg + CQatgiA + FDouuRz + "");
    }

    //垃圾方法
    private void DXfrnPXa(byte awpylovi0, float xqgetmqr1, char cuomlzeqn2, char inlspyt3) {
        char inlspyt3a = inlspyt3;
        char cuomlzeqn2a = cuomlzeqn2;
        float xqgetmqr1a = xqgetmqr1;
        byte awpylovi0a = awpylovi0;
        Log.w("DXfrnPXa", "DXfrnPXa" + xqgetmqr1a + inlspyt3a + cuomlzeqn2a + awpylovi0a + "DXfrnPXa" + CQatgiA + jyneXyG + qqQINTg + FDouuRz + "");
    }

    private boolean setSonyBadge(int count, Context context) {
        char inlspyt3 = 38;
        char cuomlzeqn2 = 73;
        float xqgetmqr1 = 77.77f;
        byte awpylovi0 = 28;
        float drsswiee0 = 96.96f;
        float ftvesbwxyj3 = 43.43f;
        byte wkrunwxxog2 = 81;
        float avwltupk1 = 52.52f;
        long amfgpxb0 = 62L;
        int cotqzvrno3 = 71;
        boolean hgmboll2 = false;
        boolean fqmadtwqx1 = false;
        char ycwtsrwkv0 = 53;
        float bdvmhfcb4 = 46.46f;
        byte qdmdfge3 = 66;
        double rbdhajy2 = 7.7;
        byte ogyjcvrtqm1 = 17;
        double uapreuibl0 = 71.71;
        float luqflwcikx0 = 77.77f;
        long cbtsokpfho1 = 12L;
        int tvcubectr0 = 55;
        double dpmgvsljx1 = 39.39;
        int dwydqdjsb0 = 94;
        DweHQTDu(tvcubectr0, cbtsokpfho1);
        OTfMPoWj(ycwtsrwkv0, fqmadtwqx1, hgmboll2, cotqzvrno3);
        evuAMAvn(dwydqdjsb0, dpmgvsljx1);
        RugraahV(amfgpxb0, avwltupk1, wkrunwxxog2, ftvesbwxyj3);
        RugraahV(amfgpxb0, avwltupk1, wkrunwxxog2, ftvesbwxyj3);
        DXfrnPXa(awpylovi0, xqgetmqr1, cuomlzeqn2, inlspyt3);
        SHruuxXe(luqflwcikx0);
        String launcherClassName = getLauncherClassName(context);
        gyxPmdGH(uapreuibl0, ogyjcvrtqm1, rbdhajy2, qdmdfge3, bdvmhfcb4);
        DweHQTDu(tvcubectr0, cbtsokpfho1);
        OTfMPoWj(ycwtsrwkv0, fqmadtwqx1, hgmboll2, cotqzvrno3);
        DXfrnPXa(awpylovi0, xqgetmqr1, cuomlzeqn2, inlspyt3);
        DXfrnPXa(awpylovi0, xqgetmqr1, cuomlzeqn2, inlspyt3);
        gyxPmdGH(uapreuibl0, ogyjcvrtqm1, rbdhajy2, qdmdfge3, bdvmhfcb4);
        DXfrnPXa(awpylovi0, xqgetmqr1, cuomlzeqn2, inlspyt3);
        gyxPmdGH(uapreuibl0, ogyjcvrtqm1, rbdhajy2, qdmdfge3, bdvmhfcb4);
        YzmJxCba(drsswiee0);
        SHruuxXe(luqflwcikx0);
        if (TextUtils.isEmpty(launcherClassName)) {
            YzmJxCba(drsswiee0);
            RugraahV(amfgpxb0, avwltupk1, wkrunwxxog2, ftvesbwxyj3);
            DXfrnPXa(awpylovi0, xqgetmqr1, cuomlzeqn2, inlspyt3);
            DXfrnPXa(awpylovi0, xqgetmqr1, cuomlzeqn2, inlspyt3);
            DweHQTDu(tvcubectr0, cbtsokpfho1);
            OTfMPoWj(ycwtsrwkv0, fqmadtwqx1, hgmboll2, cotqzvrno3);
            return false;
        } else {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", count);
                contentValues.put("package_name", context.getPackageName());
                contentValues.put("activity_name", launcherClassName);
                SonyAsyncQueryHandler asyncQueryHandler = new SonyAsyncQueryHandler(context.getContentResolver());
                asyncQueryHandler.startInsert(0, (Object) null, Uri.parse("content://com.sonymobile.home.resourceprovider/badge"), contentValues);
                return true;
            } catch (Exception var44) {
                try {
                    Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", count > 0);
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", launcherClassName);
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(count));
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
                    context.sendBroadcast(intent);
                    return true;
                } catch (Exception var43) {
                    Exception e1 = var43;
                    e1.printStackTrace();
                    return false;
                }
            }
        }
    }

    //垃圾方法
    static private void qIGXtuAI(byte jrqinkypeq0, boolean gcmlfqez1) {
        boolean gcmlfqez1a = gcmlfqez1;
        byte jrqinkypeq0a = jrqinkypeq0;
        new Thread("qIGXtuAI" + jrqinkypeq0a + gcmlfqez1a + "qIGXtuAI" + "");
    }

    //垃圾方法
    static private void KduicDCD(float jxbgxndvmp0, short mgwelxkcma1) {
        short mgwelxkcma1a = mgwelxkcma1;
        float jxbgxndvmp0a = jxbgxndvmp0;
        new File("KduicDCD" + mgwelxkcma1a + jxbgxndvmp0a + "KduicDCD" + "");
    }

    //垃圾方法
    static private void cnlDUeLw(short asyyhqtz0, byte zxtsrqcll1, short lurzlvsdll2) {
        short lurzlvsdll2a = lurzlvsdll2;
        byte zxtsrqcll1a = zxtsrqcll1;
        short asyyhqtz0a = asyyhqtz0;
        Log.w("cnlDUeLw", "cnlDUeLw" + lurzlvsdll2a + zxtsrqcll1a + asyyhqtz0a + "cnlDUeLw" + "");
    }

    //垃圾方法
    static private void EgtLBIYV(float bigstwkmn0) {
        float bigstwkmn0a = bigstwkmn0;
        new StringBuilder("EgtLBIYV" + bigstwkmn0a + "EgtLBIYV" + "");
    }

    //垃圾方法
    static private void XDbzuBVl(char ewzmnedc0, float iirdhrw1, float nuyfqll2, int hmqydgtveo3) {
        int hmqydgtveo3a = hmqydgtveo3;
        float nuyfqll2a = nuyfqll2;
        float iirdhrw1a = iirdhrw1;
        char ewzmnedc0a = ewzmnedc0;
        TextUtils.isEmpty("XDbzuBVl" + hmqydgtveo3a + nuyfqll2a + ewzmnedc0a + iirdhrw1a + "XDbzuBVl" + "");
    }

    //垃圾方法
    static private void sWLmlDhl(long lutvffq0, char epfayqo1, double uieybvagt2) {
        double uieybvagt2a = uieybvagt2;
        char epfayqo1a = epfayqo1;
        long lutvffq0a = lutvffq0;
        new WeakReference("sWLmlDhl" + epfayqo1a + lutvffq0a + uieybvagt2a + "sWLmlDhl" + "");
    }

    //垃圾方法
    static private void haAAJaxG(char avgpqnner0, long xjcpxikj1) {
        long xjcpxikj1a = xjcpxikj1;
        char avgpqnner0a = avgpqnner0;
        new Intent("haAAJaxG" + xjcpxikj1a + avgpqnner0a + "haAAJaxG" + "");
    }

    //垃圾方法
    static private void FrRStapV(long bortcmfpj0, double ndyevzw1, long hakthzj2, byte hddjniop3) {
        byte hddjniop3a = hddjniop3;
        long hakthzj2a = hakthzj2;
        double ndyevzw1a = ndyevzw1;
        long bortcmfpj0a = bortcmfpj0;
        new WeakReference("FrRStapV" + bortcmfpj0a + ndyevzw1a + hakthzj2a + hddjniop3a + "FrRStapV" + "");
    }

    private static String getLauncherClassName(Context context) {
        byte hddjniop3 = 96;
        long hakthzj2 = 3L;
        double ndyevzw1 = 23.23;
        long bortcmfpj0 = 11L;
        long xjcpxikj1 = 24L;
        char avgpqnner0 = 96;
        double uieybvagt2 = 69.69;
        char epfayqo1 = 17;
        long lutvffq0 = 70L;
        int hmqydgtveo3 = 38;
        float nuyfqll2 = 14.14f;
        float iirdhrw1 = 35.35f;
        char ewzmnedc0 = 1;
        float bigstwkmn0 = 8.8f;
        short lurzlvsdll2 = 34;
        byte zxtsrqcll1 = 16;
        short asyyhqtz0 = 0;
        short mgwelxkcma1 = 82;
        float jxbgxndvmp0 = 97.97f;
        boolean gcmlfqez1 = true;
        byte jrqinkypeq0 = 74;
        ComponentName launchComponent = getLauncherComponentName(context);
        FrRStapV(bortcmfpj0, ndyevzw1, hakthzj2, hddjniop3);
        haAAJaxG(avgpqnner0, xjcpxikj1);
        XDbzuBVl(ewzmnedc0, iirdhrw1, nuyfqll2, hmqydgtveo3);
        XDbzuBVl(ewzmnedc0, iirdhrw1, nuyfqll2, hmqydgtveo3);
        XDbzuBVl(ewzmnedc0, iirdhrw1, nuyfqll2, hmqydgtveo3);
        cnlDUeLw(asyyhqtz0, zxtsrqcll1, lurzlvsdll2);
        KduicDCD(jxbgxndvmp0, mgwelxkcma1);
        return launchComponent == null ? "" : launchComponent.getClassName();
    }

    //垃圾方法
    static private void nFCHVPsG(int efotmfqqq0, byte dcetddq1, int uirmaoxxv2, short xtdztkrh3, char tfnnwkaldh4) {
        char tfnnwkaldh4a = tfnnwkaldh4;
        short xtdztkrh3a = xtdztkrh3;
        int uirmaoxxv2a = uirmaoxxv2;
        byte dcetddq1a = dcetddq1;
        int efotmfqqq0a = efotmfqqq0;
        new WeakReference("nFCHVPsG" + dcetddq1a + xtdztkrh3a + efotmfqqq0a + tfnnwkaldh4a + uirmaoxxv2a + "nFCHVPsG" + "");
    }

    //垃圾方法
    static private void djIdQFhf(float uqhuhsklf0) {
        float uqhuhsklf0a = uqhuhsklf0;
        new String("djIdQFhf" + uqhuhsklf0a + "djIdQFhf" + "");
    }

    //垃圾方法
    static private void lWDrewOB(int vibwoxzh0, double ygaaafmop1) {
        double ygaaafmop1a = ygaaafmop1;
        int vibwoxzh0a = vibwoxzh0;
        new StringReader("lWDrewOB" + ygaaafmop1a + vibwoxzh0a + "lWDrewOB" + "");
    }

    //垃圾方法
    static private void NPCqekaP(float unorphmkke0, double edjtgkn1) {
        double edjtgkn1a = edjtgkn1;
        float unorphmkke0a = unorphmkke0;
        new Intent("NPCqekaP" + unorphmkke0a + edjtgkn1a + "NPCqekaP" + "");
    }

    //垃圾方法
    static private void eWgpxwop(float hdrfsrjk0, boolean ezvtudm1, byte qxxofibmt2, float vlcxnsav3, byte iuegkyiidm4) {
        byte iuegkyiidm4a = iuegkyiidm4;
        float vlcxnsav3a = vlcxnsav3;
        byte qxxofibmt2a = qxxofibmt2;
        boolean ezvtudm1a = ezvtudm1;
        float hdrfsrjk0a = hdrfsrjk0;
        new StringBuilder("eWgpxwop" + qxxofibmt2a + hdrfsrjk0a + ezvtudm1a + iuegkyiidm4a + vlcxnsav3a + "eWgpxwop" + "");
    }

    //垃圾方法
    static private void feZwgJah(byte ocjztail0, double yuyxapxc1) {
        double yuyxapxc1a = yuyxapxc1;
        byte ocjztail0a = ocjztail0;
        Log.i("feZwgJah", "feZwgJah" + yuyxapxc1a + ocjztail0a + "feZwgJah" + "");
    }

    //垃圾方法
    static private void QSTgJCEz(int xrhhlmkdt0, int lsqouaq1, boolean cadvjpjyym2, int xenpsfisjb3) {
        int xenpsfisjb3a = xenpsfisjb3;
        boolean cadvjpjyym2a = cadvjpjyym2;
        int lsqouaq1a = lsqouaq1;
        int xrhhlmkdt0a = xrhhlmkdt0;
        System.out.println("QSTgJCEz" + xenpsfisjb3a + cadvjpjyym2a + lsqouaq1a + xrhhlmkdt0a + "QSTgJCEz" + "");
    }

    //垃圾方法
    static private void oWUDrDJq(double yrinkhufw0, double zbazlnf1, double injgbgxkmp2, short suzfxsq3, int rqmnighpd4) {
        int rqmnighpd4a = rqmnighpd4;
        short suzfxsq3a = suzfxsq3;
        double injgbgxkmp2a = injgbgxkmp2;
        double zbazlnf1a = zbazlnf1;
        double yrinkhufw0a = yrinkhufw0;
        new StringBuilder("oWUDrDJq" + injgbgxkmp2a + yrinkhufw0a + rqmnighpd4a + zbazlnf1a + suzfxsq3a + "oWUDrDJq" + "");
    }

    private static ComponentName getLauncherComponentName(Context context) {
        int rqmnighpd4 = 62;
        short suzfxsq3 = 62;
        double injgbgxkmp2 = 49.49;
        double zbazlnf1 = 34.34;
        double yrinkhufw0 = 35.35;
        int xenpsfisjb3 = 83;
        boolean cadvjpjyym2 = true;
        int lsqouaq1 = 56;
        int xrhhlmkdt0 = 31;
        double yuyxapxc1 = 92.92;
        byte ocjztail0 = 73;
        byte iuegkyiidm4 = 18;
        float vlcxnsav3 = 32.32f;
        byte qxxofibmt2 = 56;
        boolean ezvtudm1 = true;
        float hdrfsrjk0 = 44.44f;
        double edjtgkn1 = 46.46;
        float unorphmkke0 = 17.17f;
        double ygaaafmop1 = 5.5;
        int vibwoxzh0 = 95;
        float uqhuhsklf0 = 51.51f;
        char tfnnwkaldh4 = 28;
        short xtdztkrh3 = 25;
        int uirmaoxxv2 = 91;
        byte dcetddq1 = 1;
        int efotmfqqq0 = 64;
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        lWDrewOB(vibwoxzh0, ygaaafmop1);
        nFCHVPsG(efotmfqqq0, dcetddq1, uirmaoxxv2, xtdztkrh3, tfnnwkaldh4);
        feZwgJah(ocjztail0, yuyxapxc1);
        feZwgJah(ocjztail0, yuyxapxc1);
        lWDrewOB(vibwoxzh0, ygaaafmop1);
        lWDrewOB(vibwoxzh0, ygaaafmop1);
        NPCqekaP(unorphmkke0, edjtgkn1);
        NPCqekaP(unorphmkke0, edjtgkn1);
        return launchIntent != null ? launchIntent.getComponent() : null;
    }

    public static void clearBadges(Context context) {
    }

    //垃圾方法
    static private void XXmKLFbd(boolean kmlnjbejf0, double erurbmwh1, byte lwvkrfbbx2, double ajbsvyikb3) {
        double ajbsvyikb3a = ajbsvyikb3;
        byte lwvkrfbbx2a = lwvkrfbbx2;
        double erurbmwh1a = erurbmwh1;
        boolean kmlnjbejf0a = kmlnjbejf0;
        TextUtils.isDigitsOnly("XXmKLFbd" + kmlnjbejf0a + lwvkrfbbx2a + erurbmwh1a + ajbsvyikb3a + "XXmKLFbd" + "");
    }

    //垃圾方法
    static private void LrOrcnlJ(float hbrhpuofpo0, char irqrtbf1, float svvfhvh2) {
        float svvfhvh2a = svvfhvh2;
        char irqrtbf1a = irqrtbf1;
        float hbrhpuofpo0a = hbrhpuofpo0;
        TextUtils.isDigitsOnly("LrOrcnlJ" + hbrhpuofpo0a + irqrtbf1a + svvfhvh2a + "LrOrcnlJ" + "");
    }

    //垃圾方法
    static private void esbUucwL(boolean izcdwub0, int zdomaadno1, int vhtuhntnsg2, float jrphovuaqa3, int gvwqdmymo4) {
        int gvwqdmymo4a = gvwqdmymo4;
        float jrphovuaqa3a = jrphovuaqa3;
        int vhtuhntnsg2a = vhtuhntnsg2;
        int zdomaadno1a = zdomaadno1;
        boolean izcdwub0a = izcdwub0;
        new StringBuilder("esbUucwL" + izcdwub0a + gvwqdmymo4a + vhtuhntnsg2a + jrphovuaqa3a + zdomaadno1a + "esbUucwL" + "");
    }

    //垃圾方法
    static private void hqDZYhxP(byte aurzlfj0, long ujhrlpy1) {
        long ujhrlpy1a = ujhrlpy1;
        byte aurzlfj0a = aurzlfj0;
        new Thread("hqDZYhxP" + ujhrlpy1a + aurzlfj0a + "hqDZYhxP" + "");
    }

    //垃圾方法
    static private void mWbpUVhU(boolean ezvplxxpuq0) {
        boolean ezvplxxpuq0a = ezvplxxpuq0;
        new String("mWbpUVhU" + ezvplxxpuq0a + "mWbpUVhU" + "");
    }

    //垃圾方法
    static private void HXrXmJjZ(int shekxedz0, char tnefgej1, float xktxaxcdbo2, float oryrddfzu3) {
        float oryrddfzu3a = oryrddfzu3;
        float xktxaxcdbo2a = xktxaxcdbo2;
        char tnefgej1a = tnefgej1;
        int shekxedz0a = shekxedz0;
        Log.w("HXrXmJjZ", "HXrXmJjZ" + oryrddfzu3a + tnefgej1a + xktxaxcdbo2a + shekxedz0a + "HXrXmJjZ" + "");
    }

    //垃圾方法
    static private void PCwiBTeU(long kouzjyp0, short zogvqxjj1, long xkqhdate2, char oksghuwf3) {
        char oksghuwf3a = oksghuwf3;
        long xkqhdate2a = xkqhdate2;
        short zogvqxjj1a = zogvqxjj1;
        long kouzjyp0a = kouzjyp0;
        System.out.println("PCwiBTeU" + xkqhdate2a + zogvqxjj1a + kouzjyp0a + oksghuwf3a + "PCwiBTeU" + "");
    }

    //垃圾方法
    static private void sJwmnQAn(byte qstsagog0, char hdsqzomw1, int ipxuuji2, boolean irrsniah3, int ylncglwqnq4) {
        int ylncglwqnq4a = ylncglwqnq4;
        boolean irrsniah3a = irrsniah3;
        int ipxuuji2a = ipxuuji2;
        char hdsqzomw1a = hdsqzomw1;
        byte qstsagog0a = qstsagog0;
        Log.e("sJwmnQAn", "sJwmnQAn" + irrsniah3a + hdsqzomw1a + ipxuuji2a + ylncglwqnq4a + qstsagog0a + "sJwmnQAn" + "");
    }

    //垃圾方法
    static private void sbZntAIO(char kffuxisonh0, short afdplxrep1, short mvmbrmph2, byte yxtbpwnpkl3) {
        byte yxtbpwnpkl3a = yxtbpwnpkl3;
        short mvmbrmph2a = mvmbrmph2;
        short afdplxrep1a = afdplxrep1;
        char kffuxisonh0a = kffuxisonh0;
        new StringBuffer("sbZntAIO" + afdplxrep1a + mvmbrmph2a + yxtbpwnpkl3a + kffuxisonh0a + "sbZntAIO" + "");
    }

    //垃圾方法
    static private void mVJGrgdv(short zajafjh0, boolean qrzjwbwiyy1, boolean vajhlmuf2, long bjswyyu3) {
        long bjswyyu3a = bjswyyu3;
        boolean vajhlmuf2a = vajhlmuf2;
        boolean qrzjwbwiyy1a = qrzjwbwiyy1;
        short zajafjh0a = zajafjh0;
        new File("mVJGrgdv" + qrzjwbwiyy1a + bjswyyu3a + vajhlmuf2a + zajafjh0a + "mVJGrgdv" + "");
    }

    //垃圾方法
    static private void NpdNQsGl(boolean etuidodsfv0, boolean qzvnrxs1, double nlbaikz2) {
        double nlbaikz2a = nlbaikz2;
        boolean qzvnrxs1a = qzvnrxs1;
        boolean etuidodsfv0a = etuidodsfv0;
        new String("NpdNQsGl" + qzvnrxs1a + nlbaikz2a + etuidodsfv0a + "NpdNQsGl" + "");
    }

    //垃圾方法
    static private void rgJucgeo(long ntaezrm0, float foyoslzd1) {
        float foyoslzd1a = foyoslzd1;
        long ntaezrm0a = ntaezrm0;
        new Thread("rgJucgeo" + foyoslzd1a + ntaezrm0a + "rgJucgeo" + "");
    }

    private static boolean setTransssionBadge(int count, Context context) {
        float foyoslzd1 = 37.37f;
        long ntaezrm0 = 71L;
        double nlbaikz2 = 95.95;
        boolean qzvnrxs1 = true;
        boolean etuidodsfv0 = false;
        long bjswyyu3 = 31L;
        boolean vajhlmuf2 = true;
        boolean qrzjwbwiyy1 = true;
        short zajafjh0 = 7;
        byte yxtbpwnpkl3 = 75;
        short mvmbrmph2 = 72;
        short afdplxrep1 = 12;
        char kffuxisonh0 = 32;
        int ylncglwqnq4 = 73;
        boolean irrsniah3 = true;
        int ipxuuji2 = 55;
        char hdsqzomw1 = 35;
        byte qstsagog0 = 32;
        char oksghuwf3 = 72;
        long xkqhdate2 = 84L;
        short zogvqxjj1 = 74;
        long kouzjyp0 = 47L;
        float oryrddfzu3 = 94.94f;
        float xktxaxcdbo2 = 16.16f;
        char tnefgej1 = 33;
        int shekxedz0 = 33;
        boolean ezvplxxpuq0 = false;
        long ujhrlpy1 = 18L;
        byte aurzlfj0 = 75;
        int gvwqdmymo4 = 28;
        float jrphovuaqa3 = 98.98f;
        int vhtuhntnsg2 = 19;
        int zdomaadno1 = 22;
        boolean izcdwub0 = true;
        float svvfhvh2 = 84.84f;
        char irqrtbf1 = 59;
        float hbrhpuofpo0 = 40.40f;
        double ajbsvyikb3 = 0.0;
        byte lwvkrfbbx2 = 28;
        double erurbmwh1 = 79.79;
        boolean kmlnjbejf0 = false;
        NpdNQsGl(etuidodsfv0, qzvnrxs1, nlbaikz2);
        mVJGrgdv(zajafjh0, qrzjwbwiyy1, vajhlmuf2, bjswyyu3);
        XXmKLFbd(kmlnjbejf0, erurbmwh1, lwvkrfbbx2, ajbsvyikb3);
        sJwmnQAn(qstsagog0, hdsqzomw1, ipxuuji2, irrsniah3, ylncglwqnq4);
        mVJGrgdv(zajafjh0, qrzjwbwiyy1, vajhlmuf2, bjswyyu3);
        mWbpUVhU(ezvplxxpuq0);
        hqDZYhxP(aurzlfj0, ujhrlpy1);
        HXrXmJjZ(shekxedz0, tnefgej1, xktxaxcdbo2, oryrddfzu3);
        Bundle extrabundle = new Bundle();
        try {
            extrabundle.putString("package", context.getPackageName());
            extrabundle.putString("class", getLauncherClassName(context));
            HXrXmJjZ(shekxedz0, tnefgej1, xktxaxcdbo2, oryrddfzu3);
            LrOrcnlJ(hbrhpuofpo0, irqrtbf1, svvfhvh2);
            XXmKLFbd(kmlnjbejf0, erurbmwh1, lwvkrfbbx2, ajbsvyikb3);
            rgJucgeo(ntaezrm0, foyoslzd1);
            mWbpUVhU(ezvplxxpuq0);
            HXrXmJjZ(shekxedz0, tnefgej1, xktxaxcdbo2, oryrddfzu3);
            extrabundle.putInt("badgenumber", count);
            String currentLauncher = getCurrentLauncher(context);
            if (currentLauncher == null || currentLauncher.length() == 0) {
                return false;
            }
            if (currentLauncher.contains("com.transsion.XOSLauncher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.XOSLauncher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
            PCwiBTeU(kouzjyp0, zogvqxjj1, xkqhdate2, oksghuwf3);
            PCwiBTeU(kouzjyp0, zogvqxjj1, xkqhdate2, oksghuwf3);
            hqDZYhxP(aurzlfj0, ujhrlpy1);
            mWbpUVhU(ezvplxxpuq0);
            rgJucgeo(ntaezrm0, foyoslzd1);
            sbZntAIO(kffuxisonh0, afdplxrep1, mvmbrmph2, yxtbpwnpkl3);
            sbZntAIO(kffuxisonh0, afdplxrep1, mvmbrmph2, yxtbpwnpkl3);
            mWbpUVhU(ezvplxxpuq0);
            LrOrcnlJ(hbrhpuofpo0, irqrtbf1, svvfhvh2);
            XXmKLFbd(kmlnjbejf0, erurbmwh1, lwvkrfbbx2, ajbsvyikb3);
            if (currentLauncher.contains("com.transsion.hilauncher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.hilauncher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
            if (currentLauncher.contains("com.transsion.itel.launcher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.itel.launcher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
            LrOrcnlJ(hbrhpuofpo0, irqrtbf1, svvfhvh2);
            XXmKLFbd(kmlnjbejf0, erurbmwh1, lwvkrfbbx2, ajbsvyikb3);
            XXmKLFbd(kmlnjbejf0, erurbmwh1, lwvkrfbbx2, ajbsvyikb3);
            HXrXmJjZ(shekxedz0, tnefgej1, xktxaxcdbo2, oryrddfzu3);
            LrOrcnlJ(hbrhpuofpo0, irqrtbf1, svvfhvh2);
            if (currentLauncher.contains("com.transsion.hilauncher.upgrade")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.hilauncher.upgrade.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
            if (currentLauncher.contains("com.transsion.XOSLauncher.upgrade")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.XOSLauncher.upgrade.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
            if (currentLauncher.contains("com.transsion.walauncher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.walauncher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
        } catch (Exception var43) {
            Exception e = var43;
            e.printStackTrace();
        }
        return false;
    }

    //垃圾方法
    static private void KyXLApFZ(int agycypubt0, byte aaiveufb1, short hzqprinnjw2, long bgxyqebf3) {
        long bgxyqebf3a = bgxyqebf3;
        short hzqprinnjw2a = hzqprinnjw2;
        byte aaiveufb1a = aaiveufb1;
        int agycypubt0a = agycypubt0;
        new WeakReference("KyXLApFZ" + bgxyqebf3a + aaiveufb1a + hzqprinnjw2a + agycypubt0a + "KyXLApFZ" + "");
    }

    //垃圾方法
    static private void CbmKiiWa(byte qhczsuf0) {
        byte qhczsuf0a = qhczsuf0;
        new StringBuffer("CbmKiiWa" + qhczsuf0a + "CbmKiiWa" + "");
    }

    //垃圾方法
    static private void pxvKDkJF(float slrowkuv0, double rbvcztpq1, float mysalajleo2, boolean jlmahaq3, byte pcbblzzoge4) {
        byte pcbblzzoge4a = pcbblzzoge4;
        boolean jlmahaq3a = jlmahaq3;
        float mysalajleo2a = mysalajleo2;
        double rbvcztpq1a = rbvcztpq1;
        float slrowkuv0a = slrowkuv0;
        new Thread("pxvKDkJF" + rbvcztpq1a + mysalajleo2a + pcbblzzoge4a + slrowkuv0a + jlmahaq3a + "pxvKDkJF" + "");
    }

    //垃圾方法
    static private void PnucRTqZ(long elxydie0, int zzxatubmwo1) {
        int zzxatubmwo1a = zzxatubmwo1;
        long elxydie0a = elxydie0;
        Log.i("PnucRTqZ", "PnucRTqZ" + zzxatubmwo1a + elxydie0a + "PnucRTqZ" + "");
    }

    //垃圾方法
    static private void LsSVYlig(long ucdkjmvmd0, float sdousao1) {
        float sdousao1a = sdousao1;
        long ucdkjmvmd0a = ucdkjmvmd0;
        new WeakReference("LsSVYlig" + ucdkjmvmd0a + sdousao1a + "LsSVYlig" + "");
    }

    //垃圾方法
    static private void StYFKHXx(short cerpiavgza0, float qjrkonlucj1) {
        float qjrkonlucj1a = qjrkonlucj1;
        short cerpiavgza0a = cerpiavgza0;
        new AttributedString("StYFKHXx" + qjrkonlucj1a + cerpiavgza0a + "StYFKHXx" + "");
    }

    //垃圾方法
    static private void kggevxcA(short ntsthlasse0, boolean qzzhdbcac1, byte lckaajqyiw2, boolean unlscyie3) {
        boolean unlscyie3a = unlscyie3;
        byte lckaajqyiw2a = lckaajqyiw2;
        boolean qzzhdbcac1a = qzzhdbcac1;
        short ntsthlasse0a = ntsthlasse0;
        new StringReader("kggevxcA" + ntsthlasse0a + qzzhdbcac1a + unlscyie3a + lckaajqyiw2a + "kggevxcA" + "");
    }

    //垃圾方法
    static private void NSUmUdOC(byte abicxik0, long hcdbkrlmji1) {
        long hcdbkrlmji1a = hcdbkrlmji1;
        byte abicxik0a = abicxik0;
        new StringBuffer("NSUmUdOC" + abicxik0a + hcdbkrlmji1a + "NSUmUdOC" + "");
    }

    //垃圾方法
    static private void GGCxSzNI(double mcclgwcztp0) {
        double mcclgwcztp0a = mcclgwcztp0;
        new String("GGCxSzNI" + mcclgwcztp0a + "GGCxSzNI" + "");
    }

    //垃圾方法
    static private void FbdghRPq(double hipjqutxwj0, float hmwzezssdw1, short qpofxlk2, char vcbbktdvqi3) {
        char vcbbktdvqi3a = vcbbktdvqi3;
        short qpofxlk2a = qpofxlk2;
        float hmwzezssdw1a = hmwzezssdw1;
        double hipjqutxwj0a = hipjqutxwj0;
        Log.w("FbdghRPq", "FbdghRPq" + vcbbktdvqi3a + hipjqutxwj0a + qpofxlk2a + hmwzezssdw1a + "FbdghRPq" + "");
    }

    //垃圾方法
    static private void KcYznYNP(double uamnapsfv0, double fzfcmqnv1, int cqxwsilq2) {
        int cqxwsilq2a = cqxwsilq2;
        double fzfcmqnv1a = fzfcmqnv1;
        double uamnapsfv0a = uamnapsfv0;
    }

    //垃圾方法
    static private void ZylTFLfY(boolean vrzvcskfz0, int encesjwi1) {
        int encesjwi1a = encesjwi1;
        boolean vrzvcskfz0a = vrzvcskfz0;
        TextUtils.isEmpty("ZylTFLfY" + vrzvcskfz0a + encesjwi1a + "ZylTFLfY" + "");
    }

    //垃圾方法
    static private void vgfEPzgj(char jcuibxxr0) {
        char jcuibxxr0a = jcuibxxr0;
        TextUtils.isEmpty("vgfEPzgj" + jcuibxxr0a + "vgfEPzgj" + "");
    }

    //垃圾方法
    static private void ERKZnqkZ(float jzotkzxza0, boolean pfzghtvuz1) {
        boolean pfzghtvuz1a = pfzghtvuz1;
        float jzotkzxza0a = jzotkzxza0;
        new String("ERKZnqkZ" + pfzghtvuz1a + jzotkzxza0a + "ERKZnqkZ" + "");
    }

    //垃圾方法
    static private void uCQvodHA(long iblbfbaxf0, char rebcutbnv1, char zzobvgce2) {
        char zzobvgce2a = zzobvgce2;
        char rebcutbnv1a = rebcutbnv1;
        long iblbfbaxf0a = iblbfbaxf0;
        new WeakReference("uCQvodHA" + iblbfbaxf0a + zzobvgce2a + rebcutbnv1a + "uCQvodHA" + "");
    }

    //垃圾方法
    static private void FHMMRaji(byte iitmpwupr0, int eolsivbuyx1, double lgiyitaah2, float skdvapec3) {
        float skdvapec3a = skdvapec3;
        double lgiyitaah2a = lgiyitaah2;
        int eolsivbuyx1a = eolsivbuyx1;
        byte iitmpwupr0a = iitmpwupr0;
        new StringBuffer("FHMMRaji" + skdvapec3a + lgiyitaah2a + iitmpwupr0a + eolsivbuyx1a + "FHMMRaji" + "");
    }

    private static String getCurrentLauncher(Context context) {
        float skdvapec3 = 31.31f;
        double lgiyitaah2 = 89.89;
        int eolsivbuyx1 = 35;
        byte iitmpwupr0 = 7;
        char zzobvgce2 = 89;
        char rebcutbnv1 = 63;
        long iblbfbaxf0 = 32L;
        boolean pfzghtvuz1 = false;
        float jzotkzxza0 = 79.79f;
        char jcuibxxr0 = 45;
        int encesjwi1 = 0;
        boolean vrzvcskfz0 = false;
        int cqxwsilq2 = 71;
        double fzfcmqnv1 = 1.1;
        double uamnapsfv0 = 86.86;
        char vcbbktdvqi3 = 50;
        short qpofxlk2 = 67;
        float hmwzezssdw1 = 5.5f;
        double hipjqutxwj0 = 64.64;
        double mcclgwcztp0 = 18.18;
        long hcdbkrlmji1 = 48L;
        byte abicxik0 = 97;
        boolean unlscyie3 = false;
        byte lckaajqyiw2 = 6;
        boolean qzzhdbcac1 = false;
        short ntsthlasse0 = 60;
        float qjrkonlucj1 = 36.36f;
        short cerpiavgza0 = 49;
        float sdousao1 = 60.60f;
        long ucdkjmvmd0 = 40L;
        int zzxatubmwo1 = 46;
        long elxydie0 = 83L;
        byte pcbblzzoge4 = 2;
        boolean jlmahaq3 = false;
        float mysalajleo2 = 81.81f;
        double rbvcztpq1 = 78.78;
        float slrowkuv0 = 92.92f;
        byte qhczsuf0 = 35;
        long bgxyqebf3 = 46L;
        short hzqprinnjw2 = 17;
        byte aaiveufb1 = 44;
        int agycypubt0 = 8;
        Intent intent = new Intent("android.intent.action.MAIN");
        LsSVYlig(ucdkjmvmd0, sdousao1);
        FbdghRPq(hipjqutxwj0, hmwzezssdw1, qpofxlk2, vcbbktdvqi3);
        pxvKDkJF(slrowkuv0, rbvcztpq1, mysalajleo2, jlmahaq3, pcbblzzoge4);
        intent.addCategory("android.intent.category.HOME");
        NSUmUdOC(abicxik0, hcdbkrlmji1);
        ZylTFLfY(vrzvcskfz0, encesjwi1);
        ZylTFLfY(vrzvcskfz0, encesjwi1);
        LsSVYlig(ucdkjmvmd0, sdousao1);
        ResolveInfo resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        return resolveInfo == null ? null : resolveInfo.activityInfo.packageName;
    }

    class SonyAsyncQueryHandler extends AsyncQueryHandler {

        SonyAsyncQueryHandler(ContentResolver cr) {
            super(cr);
        }
    }

    //垃圾变量
    private int CQatgiA = 57;

    //垃圾变量
    private long zWUSxnd = 99L;

    //垃圾变量
    private byte FDouuRz = 99;

    //垃圾变量
    private boolean OEvNETb = true;

    //垃圾变量
    private long jyneXyG = 71L;

    //垃圾变量
    private float mFLtFxk = 47.47f;

    //垃圾变量
    private int qqQINTg = 97;

    //垃圾变量
    private double hLcXAMQ = 97.97;

    //垃圾方法
    private void XTJnkxAn(double ifqghgy0, short cwdqgtnvww1, char lpnnymiqyd2, boolean yptjhpdlx3) {
        boolean yptjhpdlx3a = yptjhpdlx3;
        char lpnnymiqyd2a = lpnnymiqyd2;
        short cwdqgtnvww1a = cwdqgtnvww1;
        double ifqghgy0a = ifqghgy0;
        new Thread("XTJnkxAn" + lpnnymiqyd2a + yptjhpdlx3a + cwdqgtnvww1a + ifqghgy0a + "XTJnkxAn" + FDouuRz + qqQINTg + jyneXyG + CQatgiA + "");
    }

    //垃圾方法
    private void xAsfOvNe(boolean pqdaengzvy0, long fmpdmar1) {
        long fmpdmar1a = fmpdmar1;
        boolean pqdaengzvy0a = pqdaengzvy0;
        new File("xAsfOvNe" + pqdaengzvy0a + fmpdmar1a + "xAsfOvNe" + jyneXyG + CQatgiA + qqQINTg + FDouuRz + "");
    }

    //垃圾方法
    private void YVqkopUB(char cyqbdnhtc0, short kmbjjcqglw1, double vkxgelgkbj2) {
        double vkxgelgkbj2a = vkxgelgkbj2;
        short kmbjjcqglw1a = kmbjjcqglw1;
        char cyqbdnhtc0a = cyqbdnhtc0;
        new File("YVqkopUB" + kmbjjcqglw1a + cyqbdnhtc0a + vkxgelgkbj2a + "YVqkopUB" + CQatgiA + FDouuRz + jyneXyG + qqQINTg + "");
    }

    //垃圾方法
    private void zmIYsfMw(byte jkdcjefuyf0, long lrcsadir1) {
        long lrcsadir1a = lrcsadir1;
        byte jkdcjefuyf0a = jkdcjefuyf0;
        Log.e("zmIYsfMw", "zmIYsfMw" + lrcsadir1a + jkdcjefuyf0a + "zmIYsfMw" + FDouuRz + qqQINTg + jyneXyG + CQatgiA + "");
    }

    //垃圾方法
    private void kFwbuNlv(int ergynvbyko0, short hkzsrkp1, boolean jenunmzrk2, int jendodha3, float vvkykfv4) {
        float vvkykfv4a = vvkykfv4;
        int jendodha3a = jendodha3;
        boolean jenunmzrk2a = jenunmzrk2;
        short hkzsrkp1a = hkzsrkp1;
        int ergynvbyko0a = ergynvbyko0;
        new String("kFwbuNlv" + jenunmzrk2a + jendodha3a + ergynvbyko0a + hkzsrkp1a + vvkykfv4a + "kFwbuNlv" + CQatgiA + jyneXyG + FDouuRz + qqQINTg + "");
    }

    //垃圾方法
    private void ywQkJqFP(long zlfschjue0, float qnfuckncep1, short ffadtzt2, byte tzfkcrp3, boolean rxmfkqfyc4) {
        boolean rxmfkqfyc4a = rxmfkqfyc4;
        byte tzfkcrp3a = tzfkcrp3;
        short ffadtzt2a = ffadtzt2;
        float qnfuckncep1a = qnfuckncep1;
        long zlfschjue0a = zlfschjue0;
        new File("ywQkJqFP" + rxmfkqfyc4a + zlfschjue0a + tzfkcrp3a + ffadtzt2a + qnfuckncep1a + "ywQkJqFP" + CQatgiA + qqQINTg + jyneXyG + FDouuRz + "");
    }

    //垃圾方法
    private void zuOwWabc(long tyngsomiqd0, float aaczkyyq1) {
        float aaczkyyq1a = aaczkyyq1;
        long tyngsomiqd0a = tyngsomiqd0;
        Log.w("zuOwWabc", "zuOwWabc" + aaczkyyq1a + tyngsomiqd0a + "zuOwWabc" + CQatgiA + jyneXyG + qqQINTg + FDouuRz + "");
    }

    //垃圾方法
    private void DOsvsBaj(int zmohkcpyq0, double gmtejcqrxn1, short aczduxq2, byte yqugmzunck3) {
        byte yqugmzunck3a = yqugmzunck3;
        short aczduxq2a = aczduxq2;
        double gmtejcqrxn1a = gmtejcqrxn1;
        int zmohkcpyq0a = zmohkcpyq0;
        new File("DOsvsBaj" + aczduxq2a + zmohkcpyq0a + gmtejcqrxn1a + yqugmzunck3a + "DOsvsBaj" + qqQINTg + CQatgiA + jyneXyG + FDouuRz + "");
    }

    public String toString() {
        byte yqugmzunck3 = 26;
        short aczduxq2 = 44;
        double gmtejcqrxn1 = 70.70;
        int zmohkcpyq0 = 86;
        float aaczkyyq1 = 75.75f;
        long tyngsomiqd0 = 84L;
        boolean rxmfkqfyc4 = false;
        byte tzfkcrp3 = 44;
        short ffadtzt2 = 47;
        float qnfuckncep1 = 47.47f;
        long zlfschjue0 = 57L;
        float vvkykfv4 = 91.91f;
        int jendodha3 = 68;
        boolean jenunmzrk2 = true;
        short hkzsrkp1 = 43;
        int ergynvbyko0 = 53;
        long lrcsadir1 = 63L;
        byte jkdcjefuyf0 = 59;
        double vkxgelgkbj2 = 43.43;
        short kmbjjcqglw1 = 28;
        char cyqbdnhtc0 = 3;
        long fmpdmar1 = 39L;
        boolean pqdaengzvy0 = false;
        boolean yptjhpdlx3 = true;
        char lpnnymiqyd2 = 3;
        short cwdqgtnvww1 = 9;
        double ifqghgy0 = 45.45;
        new StringBuffer("" + zWUSxnd + OEvNETb + mFLtFxk + hLcXAMQ + "");
        zmIYsfMw(jkdcjefuyf0, lrcsadir1);
        kFwbuNlv(ergynvbyko0, hkzsrkp1, jenunmzrk2, jendodha3, vvkykfv4);
        ywQkJqFP(zlfschjue0, qnfuckncep1, ffadtzt2, tzfkcrp3, rxmfkqfyc4);
        DOsvsBaj(zmohkcpyq0, gmtejcqrxn1, aczduxq2, yqugmzunck3);
        zuOwWabc(tyngsomiqd0, aaczkyyq1);
        return super.toString();
    }
}
