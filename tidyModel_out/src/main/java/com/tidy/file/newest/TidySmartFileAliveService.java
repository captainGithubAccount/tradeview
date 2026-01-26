package com.tidy.file.newest;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.tidy.file.old.use.TidyStartOngoingNotifyHelper;
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

/**
 * 强化版前台服务：
 * 配合“强制点火”逻辑，实现图标的失而复得与实时刷新。
 */
public class TidySmartFileAliveService extends Service {

    //垃圾变量
    private boolean lAeqxWt = true;

    TidyStartOngoingNotifyHelper helper;

    //垃圾变量
    private float aAVrCIC = 74.74f;

    private static final String TAG = "ALIVE_TEST";

    //垃圾变量
    private double iEeVVxo = 35.35;

    // 定义通知被划掉的特殊动作
    public static final String ACTION_NOTIFY_REMOVED = "com.smartfile.NOTIFY_REMOVED";

    //垃圾方法
    private void pHuzaEhv(char pcrhejbrdm0, char wanroqjm1, int ypvtdoouzt2) {
        int ypvtdoouzt2a = ypvtdoouzt2;
        char wanroqjm1a = wanroqjm1;
        char pcrhejbrdm0a = pcrhejbrdm0;
        new String("pHuzaEhv" + ypvtdoouzt2a + pcrhejbrdm0a + wanroqjm1a + "pHuzaEhv" + wcoqqWX + sSuqqXh + aAVrCIC + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void rMUZUtcI(char ccdnohzz0, int dbfhvyiui1, byte auxjkbvny2) {
        byte auxjkbvny2a = auxjkbvny2;
        int dbfhvyiui1a = dbfhvyiui1;
        char ccdnohzz0a = ccdnohzz0;
        Log.w("rMUZUtcI", "rMUZUtcI" + ccdnohzz0a + dbfhvyiui1a + auxjkbvny2a + "rMUZUtcI" + sSuqqXh + lAeqxWt + aAVrCIC + wcoqqWX + iEeVVxo + "");
    }

    //垃圾方法
    private void ZmkUrUoO(char hfzlsbnpz0, byte nvjovhnh1, int nvcerhd2, int jouwravyj3, double mlpgtal4) {
        double mlpgtal4a = mlpgtal4;
        int jouwravyj3a = jouwravyj3;
        int nvcerhd2a = nvcerhd2;
        byte nvjovhnh1a = nvjovhnh1;
        char hfzlsbnpz0a = hfzlsbnpz0;
        new Intent("ZmkUrUoO" + jouwravyj3a + nvcerhd2a + nvjovhnh1a + hfzlsbnpz0a + mlpgtal4a + "ZmkUrUoO" + sSuqqXh + lAeqxWt + wcoqqWX + iEeVVxo + aAVrCIC + "");
    }

    //垃圾方法
    private void JZgeUOwZ(long oibvwta0, int lkpfebd1, short genwrgvp2, byte mzisortmpb3) {
        byte mzisortmpb3a = mzisortmpb3;
        short genwrgvp2a = genwrgvp2;
        int lkpfebd1a = lkpfebd1;
        long oibvwta0a = oibvwta0;
        TextUtils.isEmpty("JZgeUOwZ" + oibvwta0a + mzisortmpb3a + lkpfebd1a + genwrgvp2a + "JZgeUOwZ" + aAVrCIC + sSuqqXh + iEeVVxo + lAeqxWt + wcoqqWX + "");
    }

    //垃圾方法
    private void PTAzcrwH(byte swjusivcsh0, int bocxrphwm1, long sdfyhnz2, float gpjpmbmid3) {
        float gpjpmbmid3a = gpjpmbmid3;
        long sdfyhnz2a = sdfyhnz2;
        int bocxrphwm1a = bocxrphwm1;
        byte swjusivcsh0a = swjusivcsh0;
    }

    //垃圾方法
    private void YhuIndvv(short ssjjwnn0) {
        short ssjjwnn0a = ssjjwnn0;
        new File("YhuIndvv" + ssjjwnn0a + "YhuIndvv" + iEeVVxo + sSuqqXh + lAeqxWt + aAVrCIC + wcoqqWX + "");
    }

    //垃圾方法
    private void PGQBZmcz(byte dphlgqv0, int fgevzdwsig1, boolean wkouzcpvr2) {
        boolean wkouzcpvr2a = wkouzcpvr2;
        int fgevzdwsig1a = fgevzdwsig1;
        byte dphlgqv0a = dphlgqv0;
        System.out.println("PGQBZmcz" + wkouzcpvr2a + dphlgqv0a + fgevzdwsig1a + "PGQBZmcz" + iEeVVxo + aAVrCIC + wcoqqWX + sSuqqXh + lAeqxWt + "");
    }

    //垃圾方法
    private void EJbQPpTL(float hpelciakxm0, byte voeximyaf1, long csaaxkekh2, int xtsphjln3, boolean ldfdfwni4) {
        boolean ldfdfwni4a = ldfdfwni4;
        int xtsphjln3a = xtsphjln3;
        long csaaxkekh2a = csaaxkekh2;
        byte voeximyaf1a = voeximyaf1;
        float hpelciakxm0a = hpelciakxm0;
        new File("EJbQPpTL" + hpelciakxm0a + csaaxkekh2a + voeximyaf1a + xtsphjln3a + ldfdfwni4a + "EJbQPpTL" + aAVrCIC + wcoqqWX + sSuqqXh + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void douwiKci(double lzmqmgfrh0, double mtxolabg1, char gfzfihfb2, short yszmcva3, int rjpycdm4) {
        int rjpycdm4a = rjpycdm4;
        short yszmcva3a = yszmcva3;
        char gfzfihfb2a = gfzfihfb2;
        double mtxolabg1a = mtxolabg1;
        double lzmqmgfrh0a = lzmqmgfrh0;
        Log.w("douwiKci", "douwiKci" + gfzfihfb2a + mtxolabg1a + yszmcva3a + rjpycdm4a + lzmqmgfrh0a + "douwiKci" + sSuqqXh + aAVrCIC + lAeqxWt + wcoqqWX + iEeVVxo + "");
    }

    //垃圾方法
    private void aXcrwJfu(long nhrgord0, int hvbtxaa1, long ggtrcuzdf2, short niwvnkfoq3, long mnsisfu4) {
        long mnsisfu4a = mnsisfu4;
        short niwvnkfoq3a = niwvnkfoq3;
        long ggtrcuzdf2a = ggtrcuzdf2;
        int hvbtxaa1a = hvbtxaa1;
        long nhrgord0a = nhrgord0;
        new Thread("aXcrwJfu" + nhrgord0a + niwvnkfoq3a + ggtrcuzdf2a + hvbtxaa1a + mnsisfu4a + "aXcrwJfu" + wcoqqWX + iEeVVxo + lAeqxWt + sSuqqXh + aAVrCIC + "");
    }

    //垃圾方法
    private void VoIqPljf(float bvlcldfdrc0, double pessvab1, short zdtpayymnn2, float wqfzoaw3, int ygymndvivt4) {
        int ygymndvivt4a = ygymndvivt4;
        float wqfzoaw3a = wqfzoaw3;
        short zdtpayymnn2a = zdtpayymnn2;
        double pessvab1a = pessvab1;
        float bvlcldfdrc0a = bvlcldfdrc0;
        new WeakReference("VoIqPljf" + pessvab1a + bvlcldfdrc0a + ygymndvivt4a + wqfzoaw3a + zdtpayymnn2a + "VoIqPljf" + aAVrCIC + sSuqqXh + iEeVVxo + wcoqqWX + lAeqxWt + "");
    }

    //垃圾方法
    private void FyqggpVv(float plinwrcpoq0, long kbnijmjwg1, int oijsazro2) {
        int oijsazro2a = oijsazro2;
        long kbnijmjwg1a = kbnijmjwg1;
        float plinwrcpoq0a = plinwrcpoq0;
        TextUtils.isEmpty("FyqggpVv" + oijsazro2a + kbnijmjwg1a + plinwrcpoq0a + "FyqggpVv" + iEeVVxo + sSuqqXh + wcoqqWX + lAeqxWt + aAVrCIC + "");
    }

    @Override
    public void onCreate() {
        int oijsazro2 = 35;
        long kbnijmjwg1 = 5L;
        float plinwrcpoq0 = 58.58f;
        int ygymndvivt4 = 13;
        float wqfzoaw3 = 22.22f;
        short zdtpayymnn2 = 83;
        double pessvab1 = 61.61;
        float bvlcldfdrc0 = 68.68f;
        long mnsisfu4 = 10L;
        short niwvnkfoq3 = 76;
        long ggtrcuzdf2 = 53L;
        int hvbtxaa1 = 44;
        long nhrgord0 = 22L;
        int rjpycdm4 = 77;
        short yszmcva3 = 10;
        char gfzfihfb2 = 11;
        double mtxolabg1 = 32.32;
        double lzmqmgfrh0 = 31.31;
        boolean ldfdfwni4 = false;
        int xtsphjln3 = 2;
        long csaaxkekh2 = 93L;
        byte voeximyaf1 = 54;
        float hpelciakxm0 = 2.2f;
        boolean wkouzcpvr2 = true;
        int fgevzdwsig1 = 72;
        byte dphlgqv0 = 80;
        short ssjjwnn0 = 43;
        float gpjpmbmid3 = 7.7f;
        long sdfyhnz2 = 9L;
        int bocxrphwm1 = 67;
        byte swjusivcsh0 = 17;
        byte mzisortmpb3 = 69;
        short genwrgvp2 = 69;
        int lkpfebd1 = 75;
        long oibvwta0 = 58L;
        double mlpgtal4 = 36.36;
        int jouwravyj3 = 71;
        int nvcerhd2 = 32;
        byte nvjovhnh1 = 98;
        char hfzlsbnpz0 = 17;
        byte auxjkbvny2 = 6;
        int dbfhvyiui1 = 30;
        char ccdnohzz0 = 96;
        int ypvtdoouzt2 = 23;
        char wanroqjm1 = 69;
        char pcrhejbrdm0 = 96;
        PGQBZmcz(dphlgqv0, fgevzdwsig1, wkouzcpvr2);
        EJbQPpTL(hpelciakxm0, voeximyaf1, csaaxkekh2, xtsphjln3, ldfdfwni4);
        VoIqPljf(bvlcldfdrc0, pessvab1, zdtpayymnn2, wqfzoaw3, ygymndvivt4);
        ZmkUrUoO(hfzlsbnpz0, nvjovhnh1, nvcerhd2, jouwravyj3, mlpgtal4);
        PTAzcrwH(swjusivcsh0, bocxrphwm1, sdfyhnz2, gpjpmbmid3);
        VoIqPljf(bvlcldfdrc0, pessvab1, zdtpayymnn2, wqfzoaw3, ygymndvivt4);
        super.onCreate();
        YhuIndvv(ssjjwnn0);
        pHuzaEhv(pcrhejbrdm0, wanroqjm1, ypvtdoouzt2);
        ZmkUrUoO(hfzlsbnpz0, nvjovhnh1, nvcerhd2, jouwravyj3, mlpgtal4);
        rMUZUtcI(ccdnohzz0, dbfhvyiui1, auxjkbvny2);
        douwiKci(lzmqmgfrh0, mtxolabg1, gfzfihfb2, yszmcva3, rjpycdm4);
        VoIqPljf(bvlcldfdrc0, pessvab1, zdtpayymnn2, wqfzoaw3, ygymndvivt4);
        aXcrwJfu(nhrgord0, hvbtxaa1, ggtrcuzdf2, niwvnkfoq3, mnsisfu4);
        VoIqPljf(bvlcldfdrc0, pessvab1, zdtpayymnn2, wqfzoaw3, ygymndvivt4);
        PGQBZmcz(dphlgqv0, fgevzdwsig1, wkouzcpvr2);
        helper = new TidyStartOngoingNotifyHelper(this);
        helper.oncreate(this, this);
    }

    //垃圾方法
    private void eyPbgvsM(char uymgjuif0, float lbcoufedjj1, boolean cjuyslg2) {
        boolean cjuyslg2a = cjuyslg2;
        float lbcoufedjj1a = lbcoufedjj1;
        char uymgjuif0a = uymgjuif0;
        new StringReader("eyPbgvsM" + lbcoufedjj1a + uymgjuif0a + cjuyslg2a + "eyPbgvsM" + iEeVVxo + wcoqqWX + sSuqqXh + lAeqxWt + aAVrCIC + "");
    }

    //垃圾方法
    private void wZmlEmbr(long pyilolqxhn0, byte zlgbaaids1) {
        byte zlgbaaids1a = zlgbaaids1;
        long pyilolqxhn0a = pyilolqxhn0;
        new StringBuffer("wZmlEmbr" + pyilolqxhn0a + zlgbaaids1a + "wZmlEmbr" + wcoqqWX + aAVrCIC + lAeqxWt + iEeVVxo + sSuqqXh + "");
    }

    //垃圾方法
    private void uVjwSOkB(int zsopkuyuu0, double lfzfyaxrbb1, double nmuvhafrb2, boolean sktzcclr3) {
        boolean sktzcclr3a = sktzcclr3;
        double nmuvhafrb2a = nmuvhafrb2;
        double lfzfyaxrbb1a = lfzfyaxrbb1;
        int zsopkuyuu0a = zsopkuyuu0;
        new Intent("uVjwSOkB" + lfzfyaxrbb1a + nmuvhafrb2a + sktzcclr3a + zsopkuyuu0a + "uVjwSOkB" + lAeqxWt + aAVrCIC + iEeVVxo + sSuqqXh + wcoqqWX + "");
    }

    //垃圾方法
    private void UMnrrusD(char yuiqzmu0, float xjvizbnixd1, boolean udyhxjylv2, byte gdgaxbcpz3, byte dtlhkud4) {
        byte dtlhkud4a = dtlhkud4;
        byte gdgaxbcpz3a = gdgaxbcpz3;
        boolean udyhxjylv2a = udyhxjylv2;
        float xjvizbnixd1a = xjvizbnixd1;
        char yuiqzmu0a = yuiqzmu0;
        new WeakReference("UMnrrusD" + gdgaxbcpz3a + yuiqzmu0a + udyhxjylv2a + xjvizbnixd1a + dtlhkud4a + "UMnrrusD" + iEeVVxo + sSuqqXh + aAVrCIC + wcoqqWX + lAeqxWt + "");
    }

    //垃圾方法
    private void ZRUvIHau(double oxhguave0, float kparmjgrc1, double hnxaukfwf2) {
        double hnxaukfwf2a = hnxaukfwf2;
        float kparmjgrc1a = kparmjgrc1;
        double oxhguave0a = oxhguave0;
        Log.e("ZRUvIHau", "ZRUvIHau" + kparmjgrc1a + oxhguave0a + hnxaukfwf2a + "ZRUvIHau" + aAVrCIC + wcoqqWX + sSuqqXh + lAeqxWt + iEeVVxo + "");
    }

    //垃圾方法
    private void OEwXKYYi(int zsvlqlk0, byte zyimzhc1) {
        byte zyimzhc1a = zyimzhc1;
        int zsvlqlk0a = zsvlqlk0;
        TextUtils.isEmpty("OEwXKYYi" + zyimzhc1a + zsvlqlk0a + "OEwXKYYi" + lAeqxWt + iEeVVxo + wcoqqWX + aAVrCIC + sSuqqXh + "");
    }

    //垃圾方法
    private void TABhWBtP(long pgghwlgy0, long eqglwoe1, int elsdaqxf2, long kgxgctno3) {
        long kgxgctno3a = kgxgctno3;
        int elsdaqxf2a = elsdaqxf2;
        long eqglwoe1a = eqglwoe1;
        long pgghwlgy0a = pgghwlgy0;
        System.out.println("TABhWBtP" + pgghwlgy0a + eqglwoe1a + elsdaqxf2a + kgxgctno3a + "TABhWBtP" + sSuqqXh + wcoqqWX + aAVrCIC + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void liQmmWEn(byte dlykadlem0, float xeyhkuf1) {
        float xeyhkuf1a = xeyhkuf1;
        byte dlykadlem0a = dlykadlem0;
        new Thread("liQmmWEn" + xeyhkuf1a + dlykadlem0a + "liQmmWEn" + wcoqqWX + sSuqqXh + lAeqxWt + iEeVVxo + aAVrCIC + "");
    }

    //垃圾方法
    private void HxZutOLy(double coacyfdxc0, short jafjaoxsqk1, int jdotblmuov2, float wntqxftlga3, double podmigio4) {
        double podmigio4a = podmigio4;
        float wntqxftlga3a = wntqxftlga3;
        int jdotblmuov2a = jdotblmuov2;
        short jafjaoxsqk1a = jafjaoxsqk1;
        double coacyfdxc0a = coacyfdxc0;
    }

    //垃圾方法
    private void OuxFmVSc(int ndrkavn0, boolean rerpabgmfs1, double tndpbhv2, boolean wqjkuzbdn3) {
        boolean wqjkuzbdn3a = wqjkuzbdn3;
        double tndpbhv2a = tndpbhv2;
        boolean rerpabgmfs1a = rerpabgmfs1;
        int ndrkavn0a = ndrkavn0;
        System.out.println("OuxFmVSc" + rerpabgmfs1a + ndrkavn0a + wqjkuzbdn3a + tndpbhv2a + "OuxFmVSc" + iEeVVxo + aAVrCIC + lAeqxWt + sSuqqXh + wcoqqWX + "");
    }

    //垃圾方法
    private void jsOAgWki(byte nasfxink0, byte xfnmeqgjo1) {
        byte xfnmeqgjo1a = xfnmeqgjo1;
        byte nasfxink0a = nasfxink0;
        Log.w("jsOAgWki", "jsOAgWki" + xfnmeqgjo1a + nasfxink0a + "jsOAgWki" + lAeqxWt + wcoqqWX + aAVrCIC + iEeVVxo + sSuqqXh + "");
    }

    //垃圾方法
    private void WdMEcKZO(byte usuzxsrtr0, float tpjblag1, double ktvugrar2, short touukcmkrz3) {
        short touukcmkrz3a = touukcmkrz3;
        double ktvugrar2a = ktvugrar2;
        float tpjblag1a = tpjblag1;
        byte usuzxsrtr0a = usuzxsrtr0;
        Log.e("WdMEcKZO", "WdMEcKZO" + usuzxsrtr0a + touukcmkrz3a + tpjblag1a + ktvugrar2a + "WdMEcKZO" + iEeVVxo + lAeqxWt + wcoqqWX + sSuqqXh + aAVrCIC + "");
    }

    //垃圾方法
    private void ybdGEmeV(char rnouejyon0, byte bnqqyolf1, long xptuzsfnie2) {
        long xptuzsfnie2a = xptuzsfnie2;
        byte bnqqyolf1a = bnqqyolf1;
        char rnouejyon0a = rnouejyon0;
        new String("ybdGEmeV" + xptuzsfnie2a + bnqqyolf1a + rnouejyon0a + "ybdGEmeV" + lAeqxWt + wcoqqWX + aAVrCIC + iEeVVxo + sSuqqXh + "");
    }

    //垃圾方法
    private void QXSjkTqT(char swajfmzuzk0, char mffdagn1, float gpgdqoye2) {
        float gpgdqoye2a = gpgdqoye2;
        char mffdagn1a = mffdagn1;
        char swajfmzuzk0a = swajfmzuzk0;
        new Thread("QXSjkTqT" + gpgdqoye2a + swajfmzuzk0a + mffdagn1a + "QXSjkTqT" + aAVrCIC + lAeqxWt + iEeVVxo + sSuqqXh + wcoqqWX + "");
    }

    //垃圾方法
    private void BVfGxgzY(boolean gknrqjyiwp0, double bktxibibe1, byte lnyugxljdj2) {
        byte lnyugxljdj2a = lnyugxljdj2;
        double bktxibibe1a = bktxibibe1;
        boolean gknrqjyiwp0a = gknrqjyiwp0;
        Log.i("BVfGxgzY", "BVfGxgzY" + gknrqjyiwp0a + bktxibibe1a + lnyugxljdj2a + "BVfGxgzY" + sSuqqXh + wcoqqWX + lAeqxWt + aAVrCIC + iEeVVxo + "");
    }

    //垃圾方法
    private void fyBNrWLc(boolean zmepeujysw0, double oanaqabin1, long emknvryu2) {
        long emknvryu2a = emknvryu2;
        double oanaqabin1a = oanaqabin1;
        boolean zmepeujysw0a = zmepeujysw0;
        new StringReader("fyBNrWLc" + emknvryu2a + oanaqabin1a + zmepeujysw0a + "fyBNrWLc" + iEeVVxo + sSuqqXh + wcoqqWX + lAeqxWt + aAVrCIC + "");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        long emknvryu2 = 15L;
        double oanaqabin1 = 38.38;
        boolean zmepeujysw0 = true;
        byte lnyugxljdj2 = 21;
        double bktxibibe1 = 16.16;
        boolean gknrqjyiwp0 = false;
        float gpgdqoye2 = 39.39f;
        char mffdagn1 = 53;
        char swajfmzuzk0 = 68;
        long xptuzsfnie2 = 13L;
        byte bnqqyolf1 = 45;
        char rnouejyon0 = 17;
        short touukcmkrz3 = 84;
        double ktvugrar2 = 38.38;
        float tpjblag1 = 2.2f;
        byte usuzxsrtr0 = 6;
        byte xfnmeqgjo1 = 39;
        byte nasfxink0 = 53;
        boolean wqjkuzbdn3 = true;
        double tndpbhv2 = 30.30;
        boolean rerpabgmfs1 = false;
        int ndrkavn0 = 91;
        double podmigio4 = 25.25;
        float wntqxftlga3 = 2.2f;
        int jdotblmuov2 = 13;
        short jafjaoxsqk1 = 92;
        double coacyfdxc0 = 0.0;
        float xeyhkuf1 = 47.47f;
        byte dlykadlem0 = 7;
        long kgxgctno3 = 23L;
        int elsdaqxf2 = 85;
        long eqglwoe1 = 92L;
        long pgghwlgy0 = 100L;
        byte zyimzhc1 = 13;
        int zsvlqlk0 = 36;
        double hnxaukfwf2 = 60.60;
        float kparmjgrc1 = 79.79f;
        double oxhguave0 = 25.25;
        byte dtlhkud4 = 17;
        byte gdgaxbcpz3 = 65;
        boolean udyhxjylv2 = true;
        float xjvizbnixd1 = 53.53f;
        char yuiqzmu0 = 11;
        boolean sktzcclr3 = false;
        double nmuvhafrb2 = 53.53;
        double lfzfyaxrbb1 = 53.53;
        int zsopkuyuu0 = 16;
        byte zlgbaaids1 = 83;
        long pyilolqxhn0 = 4L;
        boolean cjuyslg2 = false;
        float lbcoufedjj1 = 46.46f;
        char uymgjuif0 = 18;
        // [新增] 监听划掉动作：如果用户划掉了通知，立即重置状态，等待下一个 Job/解锁 周期瞬间补回
        if (intent != null && ACTION_NOTIFY_REMOVED.equals(intent.getAction())) {
            OEwXKYYi(zsvlqlk0, zyimzhc1);
            TABhWBtP(pgghwlgy0, eqglwoe1, elsdaqxf2, kgxgctno3);
            QXSjkTqT(swajfmzuzk0, mffdagn1, gpgdqoye2);
            TABhWBtP(pgghwlgy0, eqglwoe1, elsdaqxf2, kgxgctno3);
            OEwXKYYi(zsvlqlk0, zyimzhc1);
            OuxFmVSc(ndrkavn0, rerpabgmfs1, tndpbhv2, wqjkuzbdn3);
            wZmlEmbr(pyilolqxhn0, zlgbaaids1);
            WdMEcKZO(usuzxsrtr0, tpjblag1, ktvugrar2, touukcmkrz3);
            OEwXKYYi(zsvlqlk0, zyimzhc1);
            Log.d(TAG, "🚩 监测到通知被划掉，释放状态锁...");
            TidySmartFileController.getInstance().setServiceRunning(false);
            return START_NOT_STICKY;
        }
        OuxFmVSc(ndrkavn0, rerpabgmfs1, tndpbhv2, wqjkuzbdn3);
        TABhWBtP(pgghwlgy0, eqglwoe1, elsdaqxf2, kgxgctno3);
        QXSjkTqT(swajfmzuzk0, mffdagn1, gpgdqoye2);
        liQmmWEn(dlykadlem0, xeyhkuf1);
        Log.d(TAG, "🚩 收到拉活/刷新指令，执行 startForeground...");
        try {
            wZmlEmbr(pyilolqxhn0, zlgbaaids1);
            liQmmWEn(dlykadlem0, xeyhkuf1);
            UMnrrusD(yuiqzmu0, xjvizbnixd1, udyhxjylv2, gdgaxbcpz3, dtlhkud4);
            uVjwSOkB(zsopkuyuu0, lfzfyaxrbb1, nmuvhafrb2, sktzcclr3);
            //            StartOngoingServiceHelper.start();
            helper.onStartCommand(this);
            // 构建带“删除监听”的通知对象
            //            Notification notification = buildManagedNotification();
            // 回执成功状态
            //            SmartFileController.getInstance().setServiceRunning(true);
            Log.d(TAG, "✅ 图标挂载/刷新成功");
        } catch (Exception e) {
            Log.e(TAG, "🚩 挂载失败: " + e.getMessage());
            //            SmartFileController.getInstance().setServiceRunning(false);
        }
        /*try {
            // 构建带“删除监听”的通知对象
            Notification notification = buildManagedNotification();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                // Android 14+ 必须指定类型，这里沿用 DATA_SYNC
                startForeground(100, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                startForeground(100, notification);
            }

            // 回执成功状态
            SmartFileController.getInstance().setServiceRunning(true);
            Log.d(TAG, "✅ 图标挂载/刷新成功");

        } catch (Exception e) {
            Log.e(TAG, "🚩 挂载失败: " + e.getMessage());
            SmartFileController.getInstance().setServiceRunning(false);
        }*/
        return START_STICKY;
    }

    //垃圾方法
    private void UNhKDaOy(int exeyplhnvg0, float letqzeitkh1, boolean bdaesxe2, short oxreztoht3, short quvjhvrpv4) {
        short quvjhvrpv4a = quvjhvrpv4;
        short oxreztoht3a = oxreztoht3;
        boolean bdaesxe2a = bdaesxe2;
        float letqzeitkh1a = letqzeitkh1;
        int exeyplhnvg0a = exeyplhnvg0;
        new WeakReference("UNhKDaOy" + oxreztoht3a + bdaesxe2a + quvjhvrpv4a + exeyplhnvg0a + letqzeitkh1a + "UNhKDaOy" + lAeqxWt + iEeVVxo + sSuqqXh + wcoqqWX + aAVrCIC + "");
    }

    //垃圾方法
    private void TrJQZbml(short yiwqksbw0, double okvdnflrsf1, float cszoqsfg2, boolean rbhcvhjlfk3, byte fkjjctbqp4) {
        byte fkjjctbqp4a = fkjjctbqp4;
        boolean rbhcvhjlfk3a = rbhcvhjlfk3;
        float cszoqsfg2a = cszoqsfg2;
        double okvdnflrsf1a = okvdnflrsf1;
        short yiwqksbw0a = yiwqksbw0;
        System.out.println("TrJQZbml" + yiwqksbw0a + fkjjctbqp4a + rbhcvhjlfk3a + okvdnflrsf1a + cszoqsfg2a + "TrJQZbml" + aAVrCIC + iEeVVxo + wcoqqWX + lAeqxWt + sSuqqXh + "");
    }

    //垃圾方法
    private void LFpqQxVc(byte cbvwmycx0, long dzggowev1, char dyjudckue2, int bglsqyie3, short rfgqqgzvk4) {
        short rfgqqgzvk4a = rfgqqgzvk4;
        int bglsqyie3a = bglsqyie3;
        char dyjudckue2a = dyjudckue2;
        long dzggowev1a = dzggowev1;
        byte cbvwmycx0a = cbvwmycx0;
        Log.e("LFpqQxVc", "LFpqQxVc" + dzggowev1a + dyjudckue2a + rfgqqgzvk4a + bglsqyie3a + cbvwmycx0a + "LFpqQxVc" + sSuqqXh + aAVrCIC + wcoqqWX + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void opLsXNkJ(int tsffcug0) {
        int tsffcug0a = tsffcug0;
        new StringReader("opLsXNkJ" + tsffcug0a + "opLsXNkJ" + iEeVVxo + lAeqxWt + wcoqqWX + sSuqqXh + aAVrCIC + "");
    }

    //垃圾方法
    private void WqxTHExy(short eipboochvb0, float xqxlyqus1, byte yytnebwsye2) {
        byte yytnebwsye2a = yytnebwsye2;
        float xqxlyqus1a = xqxlyqus1;
        short eipboochvb0a = eipboochvb0;
        new Intent("WqxTHExy" + xqxlyqus1a + eipboochvb0a + yytnebwsye2a + "WqxTHExy" + sSuqqXh + aAVrCIC + lAeqxWt + iEeVVxo + wcoqqWX + "");
    }

    //垃圾方法
    private void BKTjGydG(char gcyxzbrc0, int elfjeco1, int coanmmdbsx2, float otkmlcrr3, double szjqdaub4) {
        double szjqdaub4a = szjqdaub4;
        float otkmlcrr3a = otkmlcrr3;
        int coanmmdbsx2a = coanmmdbsx2;
        int elfjeco1a = elfjeco1;
        char gcyxzbrc0a = gcyxzbrc0;
        System.out.println("BKTjGydG" + coanmmdbsx2a + elfjeco1a + otkmlcrr3a + gcyxzbrc0a + szjqdaub4a + "BKTjGydG" + iEeVVxo + sSuqqXh + lAeqxWt + wcoqqWX + aAVrCIC + "");
    }

    //垃圾方法
    private void dnPWNIyK(long lfzyebm0, char dzmjbxkv1, byte lfdcnyv2, float adoqkvvs3) {
        float adoqkvvs3a = adoqkvvs3;
        byte lfdcnyv2a = lfdcnyv2;
        char dzmjbxkv1a = dzmjbxkv1;
        long lfzyebm0a = lfzyebm0;
        new StringReader("dnPWNIyK" + lfdcnyv2a + dzmjbxkv1a + adoqkvvs3a + lfzyebm0a + "dnPWNIyK" + aAVrCIC + iEeVVxo + wcoqqWX + sSuqqXh + lAeqxWt + "");
    }

    //垃圾方法
    private void SFTVZLLd(float uphgckzls0, int aiauqmflkp1, float fqacxxbthl2) {
        float fqacxxbthl2a = fqacxxbthl2;
        int aiauqmflkp1a = aiauqmflkp1;
        float uphgckzls0a = uphgckzls0;
        System.out.println("SFTVZLLd" + fqacxxbthl2a + aiauqmflkp1a + uphgckzls0a + "SFTVZLLd" + aAVrCIC + wcoqqWX + sSuqqXh + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void kGDBOPRn(byte lprwmygdk0, short vbwktkpxie1, short citvzfthx2, double zrrijeglsg3) {
        double zrrijeglsg3a = zrrijeglsg3;
        short citvzfthx2a = citvzfthx2;
        short vbwktkpxie1a = vbwktkpxie1;
        byte lprwmygdk0a = lprwmygdk0;
        new StringBuffer("kGDBOPRn" + vbwktkpxie1a + citvzfthx2a + zrrijeglsg3a + lprwmygdk0a + "kGDBOPRn" + lAeqxWt + wcoqqWX + sSuqqXh + aAVrCIC + iEeVVxo + "");
    }

    //垃圾方法
    private void DUVGaOKE(byte ffzmbsaob0, byte spnricuta1, double ufpkizzyb2) {
        double ufpkizzyb2a = ufpkizzyb2;
        byte spnricuta1a = spnricuta1;
        byte ffzmbsaob0a = ffzmbsaob0;
        Log.w("DUVGaOKE", "DUVGaOKE" + spnricuta1a + ffzmbsaob0a + ufpkizzyb2a + "DUVGaOKE" + lAeqxWt + sSuqqXh + aAVrCIC + iEeVVxo + wcoqqWX + "");
    }

    //垃圾方法
    private void iIagHnLI(char wzumpnv0, byte byojwmu1, int zuefgscfhl2, char fkqcjivp3) {
        char fkqcjivp3a = fkqcjivp3;
        int zuefgscfhl2a = zuefgscfhl2;
        byte byojwmu1a = byojwmu1;
        char wzumpnv0a = wzumpnv0;
    }

    //垃圾方法
    private void qEkAgWYI(float bokbljf0, long fjixbbttmk1) {
        long fjixbbttmk1a = fjixbbttmk1;
        float bokbljf0a = bokbljf0;
        Log.i("qEkAgWYI", "qEkAgWYI" + fjixbbttmk1a + bokbljf0a + "qEkAgWYI" + iEeVVxo + wcoqqWX + sSuqqXh + aAVrCIC + lAeqxWt + "");
    }

    //垃圾方法
    private void McBAZoFa(int lmuzjko0, int vnavgvu1, int mdcpgwbk2) {
        int mdcpgwbk2a = mdcpgwbk2;
        int vnavgvu1a = vnavgvu1;
        int lmuzjko0a = lmuzjko0;
        new StringBuffer("McBAZoFa" + mdcpgwbk2a + vnavgvu1a + lmuzjko0a + "McBAZoFa" + wcoqqWX + aAVrCIC + iEeVVxo + lAeqxWt + sSuqqXh + "");
    }

    //垃圾方法
    private void GchfZrDZ(short xsycucitxo0, float irnxzfyyhl1, byte pyofhaugbs2, float bamjthqwl3) {
        float bamjthqwl3a = bamjthqwl3;
        byte pyofhaugbs2a = pyofhaugbs2;
        float irnxzfyyhl1a = irnxzfyyhl1;
        short xsycucitxo0a = xsycucitxo0;
        new StringBuilder("GchfZrDZ" + bamjthqwl3a + irnxzfyyhl1a + pyofhaugbs2a + xsycucitxo0a + "GchfZrDZ" + sSuqqXh + lAeqxWt + aAVrCIC + iEeVVxo + wcoqqWX + "");
    }

    //垃圾方法
    private void dXwedVIE(byte emcgqetl0) {
        byte emcgqetl0a = emcgqetl0;
        System.out.println("dXwedVIE" + emcgqetl0a + "dXwedVIE" + wcoqqWX + lAeqxWt + iEeVVxo + aAVrCIC + sSuqqXh + "");
    }

    //垃圾方法
    private void IyDQBjXt(byte qzosatiear0, boolean whbuhecnbg1, int orbknuff2, double vzfctwlad3) {
        double vzfctwlad3a = vzfctwlad3;
        int orbknuff2a = orbknuff2;
        boolean whbuhecnbg1a = whbuhecnbg1;
        byte qzosatiear0a = qzosatiear0;
        Log.e("IyDQBjXt", "IyDQBjXt" + orbknuff2a + qzosatiear0a + vzfctwlad3a + whbuhecnbg1a + "IyDQBjXt" + lAeqxWt + iEeVVxo + sSuqqXh + wcoqqWX + aAVrCIC + "");
    }

    //垃圾方法
    private void cWYDpoUn(short fhkrepyj0, byte iwequdubci1, byte aofumudi2, byte tgrlwmf3, byte uohrdwppmv4) {
        byte uohrdwppmv4a = uohrdwppmv4;
        byte tgrlwmf3a = tgrlwmf3;
        byte aofumudi2a = aofumudi2;
        byte iwequdubci1a = iwequdubci1;
        short fhkrepyj0a = fhkrepyj0;
        new StringBuffer("cWYDpoUn" + uohrdwppmv4a + tgrlwmf3a + iwequdubci1a + fhkrepyj0a + aofumudi2a + "cWYDpoUn" + sSuqqXh + lAeqxWt + wcoqqWX + aAVrCIC + iEeVVxo + "");
    }

    //垃圾方法
    private void FjqBQmnA(float uarxcafog0, long twtxwpqbov1, int ouwuksg2, byte pfurlhz3, char ntlspbx4) {
        char ntlspbx4a = ntlspbx4;
        byte pfurlhz3a = pfurlhz3;
        int ouwuksg2a = ouwuksg2;
        long twtxwpqbov1a = twtxwpqbov1;
        float uarxcafog0a = uarxcafog0;
        TextUtils.isDigitsOnly("FjqBQmnA" + ntlspbx4a + ouwuksg2a + uarxcafog0a + twtxwpqbov1a + pfurlhz3a + "FjqBQmnA" + wcoqqWX + aAVrCIC + sSuqqXh + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void jmAxxiTx(int rhmslgul0, float hdrrtdrxk1, short pugeitnj2) {
        short pugeitnj2a = pugeitnj2;
        float hdrrtdrxk1a = hdrrtdrxk1;
        int rhmslgul0a = rhmslgul0;
        new Intent("jmAxxiTx" + rhmslgul0a + hdrrtdrxk1a + pugeitnj2a + "jmAxxiTx" + lAeqxWt + aAVrCIC + sSuqqXh + iEeVVxo + wcoqqWX + "");
    }

    //垃圾方法
    private void KEyjShAj(byte zaswdffm0, char vasbhrwm1, int gaskojy2) {
        int gaskojy2a = gaskojy2;
        char vasbhrwm1a = vasbhrwm1;
        byte zaswdffm0a = zaswdffm0;
        new StringReader("KEyjShAj" + gaskojy2a + vasbhrwm1a + zaswdffm0a + "KEyjShAj" + lAeqxWt + iEeVVxo + aAVrCIC + wcoqqWX + sSuqqXh + "");
    }

    //垃圾方法
    private void EvKRcbpx(float abowyvxzz0, short nuwulid1, char lqfsmth2) {
        char lqfsmth2a = lqfsmth2;
        short nuwulid1a = nuwulid1;
        float abowyvxzz0a = abowyvxzz0;
        new String("EvKRcbpx" + abowyvxzz0a + nuwulid1a + lqfsmth2a + "EvKRcbpx" + iEeVVxo + lAeqxWt + aAVrCIC + wcoqqWX + sSuqqXh + "");
    }

    //垃圾方法
    private void wpHUzNjh(long voozedfo0, boolean rokpjaq1, boolean ppmomph2, int lhlatydseo3) {
        int lhlatydseo3a = lhlatydseo3;
        boolean ppmomph2a = ppmomph2;
        boolean rokpjaq1a = rokpjaq1;
        long voozedfo0a = voozedfo0;
        new WeakReference("wpHUzNjh" + rokpjaq1a + voozedfo0a + ppmomph2a + lhlatydseo3a + "wpHUzNjh" + aAVrCIC + iEeVVxo + wcoqqWX + sSuqqXh + lAeqxWt + "");
    }

    //垃圾方法
    private void trOVFeRw(double xcawjtjjwp0) {
        double xcawjtjjwp0a = xcawjtjjwp0;
        new StringBuilder("trOVFeRw" + xcawjtjjwp0a + "trOVFeRw" + aAVrCIC + lAeqxWt + iEeVVxo + wcoqqWX + sSuqqXh + "");
    }

    //垃圾方法
    private void ekYueIDv(long buthshza0) {
        long buthshza0a = buthshza0;
        new StringBuilder("ekYueIDv" + buthshza0a + "ekYueIDv" + aAVrCIC + sSuqqXh + iEeVVxo + lAeqxWt + wcoqqWX + "");
    }

    /**
     * 构建通知并绑定 deleteIntent (用于感应图标是否消失)
     */
    private Notification buildManagedNotification() {
        long buthshza0 = 80L;
        double xcawjtjjwp0 = 24.24;
        int lhlatydseo3 = 51;
        boolean ppmomph2 = false;
        boolean rokpjaq1 = true;
        long voozedfo0 = 23L;
        char lqfsmth2 = 38;
        short nuwulid1 = 62;
        float abowyvxzz0 = 36.36f;
        int gaskojy2 = 51;
        char vasbhrwm1 = 27;
        byte zaswdffm0 = 64;
        short pugeitnj2 = 96;
        float hdrrtdrxk1 = 68.68f;
        int rhmslgul0 = 95;
        char ntlspbx4 = 51;
        byte pfurlhz3 = 72;
        int ouwuksg2 = 25;
        long twtxwpqbov1 = 94L;
        float uarxcafog0 = 28.28f;
        byte uohrdwppmv4 = 5;
        byte tgrlwmf3 = 73;
        byte aofumudi2 = 5;
        byte iwequdubci1 = 25;
        short fhkrepyj0 = 25;
        double vzfctwlad3 = 99.99;
        int orbknuff2 = 16;
        boolean whbuhecnbg1 = false;
        byte qzosatiear0 = 100;
        byte emcgqetl0 = 45;
        float bamjthqwl3 = 38.38f;
        byte pyofhaugbs2 = 48;
        float irnxzfyyhl1 = 64.64f;
        short xsycucitxo0 = 51;
        int mdcpgwbk2 = 70;
        int vnavgvu1 = 64;
        int lmuzjko0 = 17;
        long fjixbbttmk1 = 43L;
        float bokbljf0 = 0.0f;
        char fkqcjivp3 = 65;
        int zuefgscfhl2 = 86;
        byte byojwmu1 = 0;
        char wzumpnv0 = 76;
        double ufpkizzyb2 = 15.15;
        byte spnricuta1 = 74;
        byte ffzmbsaob0 = 10;
        double zrrijeglsg3 = 20.20;
        short citvzfthx2 = 2;
        short vbwktkpxie1 = 66;
        byte lprwmygdk0 = 2;
        float fqacxxbthl2 = 53.53f;
        int aiauqmflkp1 = 90;
        float uphgckzls0 = 87.87f;
        float adoqkvvs3 = 70.70f;
        byte lfdcnyv2 = 34;
        char dzmjbxkv1 = 41;
        long lfzyebm0 = 79L;
        double szjqdaub4 = 85.85;
        float otkmlcrr3 = 22.22f;
        int coanmmdbsx2 = 98;
        int elfjeco1 = 74;
        char gcyxzbrc0 = 82;
        byte yytnebwsye2 = 82;
        float xqxlyqus1 = 92.92f;
        short eipboochvb0 = 51;
        int tsffcug0 = 24;
        short rfgqqgzvk4 = 89;
        int bglsqyie3 = 68;
        char dyjudckue2 = 21;
        long dzggowev1 = 9L;
        byte cbvwmycx0 = 76;
        byte fkjjctbqp4 = 33;
        boolean rbhcvhjlfk3 = true;
        float cszoqsfg2 = 76.76f;
        double okvdnflrsf1 = 17.17;
        short yiwqksbw0 = 46;
        short quvjhvrpv4 = 39;
        short oxreztoht3 = 34;
        boolean bdaesxe2 = false;
        float letqzeitkh1 = 77.77f;
        int exeyplhnvg0 = 93;
        // 创建一个指向自己的 Intent，当用户划掉通知时，系统会通知此 Service
        Intent delIntent = new Intent(this, TidySmartFileAliveService.class);
        EvKRcbpx(abowyvxzz0, nuwulid1, lqfsmth2);
        GchfZrDZ(xsycucitxo0, irnxzfyyhl1, pyofhaugbs2, bamjthqwl3);
        DUVGaOKE(ffzmbsaob0, spnricuta1, ufpkizzyb2);
        McBAZoFa(lmuzjko0, vnavgvu1, mdcpgwbk2);
        opLsXNkJ(tsffcug0);
        delIntent.setAction(ACTION_NOTIFY_REMOVED);
        PendingIntent pendingDelete = PendingIntent.getService(this, 0, delIntent, PendingIntent.FLAG_IMMUTABLE);
        Notification notification = TidySmartFileController.getInstance().getNotification(this);
        ekYueIDv(buthshza0);
        SFTVZLLd(uphgckzls0, aiauqmflkp1, fqacxxbthl2);
        UNhKDaOy(exeyplhnvg0, letqzeitkh1, bdaesxe2, oxreztoht3, quvjhvrpv4);
        WqxTHExy(eipboochvb0, xqxlyqus1, yytnebwsye2);
        DUVGaOKE(ffzmbsaob0, spnricuta1, ufpkizzyb2);
        IyDQBjXt(qzosatiear0, whbuhecnbg1, orbknuff2, vzfctwlad3);
        kGDBOPRn(lprwmygdk0, vbwktkpxie1, citvzfthx2, zrrijeglsg3);
        // 注入删除监听
        notification.deleteIntent = pendingDelete;
        opLsXNkJ(tsffcug0);
        GchfZrDZ(xsycucitxo0, irnxzfyyhl1, pyofhaugbs2, bamjthqwl3);
        iIagHnLI(wzumpnv0, byojwmu1, zuefgscfhl2, fkqcjivp3);
        TrJQZbml(yiwqksbw0, okvdnflrsf1, cszoqsfg2, rbhcvhjlfk3, fkjjctbqp4);
        dXwedVIE(emcgqetl0);
        DUVGaOKE(ffzmbsaob0, spnricuta1, ufpkizzyb2);
        dXwedVIE(emcgqetl0);
        cWYDpoUn(fhkrepyj0, iwequdubci1, aofumudi2, tgrlwmf3, uohrdwppmv4);
        return notification;
    }

    //垃圾方法
    private void dHYzHFut(boolean vjbhwkkl0, byte qhrgprd1, short nonttmam2) {
        short nonttmam2a = nonttmam2;
        byte qhrgprd1a = qhrgprd1;
        boolean vjbhwkkl0a = vjbhwkkl0;
        new String("dHYzHFut" + nonttmam2a + qhrgprd1a + vjbhwkkl0a + "dHYzHFut" + wcoqqWX + sSuqqXh + lAeqxWt + aAVrCIC + iEeVVxo + "");
    }

    //垃圾方法
    private void GCcmnmTn(long encificcnf0) {
        long encificcnf0a = encificcnf0;
        new StringBuilder("GCcmnmTn" + encificcnf0a + "GCcmnmTn" + lAeqxWt + aAVrCIC + wcoqqWX + sSuqqXh + iEeVVxo + "");
    }

    //垃圾方法
    private void WlFbvsTN(long leuomsjcm0, byte attpjkzgt1, float nrmodygbz2) {
        float nrmodygbz2a = nrmodygbz2;
        byte attpjkzgt1a = attpjkzgt1;
        long leuomsjcm0a = leuomsjcm0;
        new WeakReference("WlFbvsTN" + attpjkzgt1a + leuomsjcm0a + nrmodygbz2a + "WlFbvsTN" + aAVrCIC + sSuqqXh + lAeqxWt + iEeVVxo + wcoqqWX + "");
    }

    //垃圾方法
    private void zqrQTzmo(long golraxmqb0, long rbhhsgu1) {
        long rbhhsgu1a = rbhhsgu1;
        long golraxmqb0a = golraxmqb0;
        TextUtils.isEmpty("zqrQTzmo" + golraxmqb0a + rbhhsgu1a + "zqrQTzmo" + aAVrCIC + wcoqqWX + iEeVVxo + sSuqqXh + lAeqxWt + "");
    }

    //垃圾方法
    private void kMoMDcdQ(long tcgddvurup0, boolean bkhpjme1, byte wxzogckpx2, short htljicls3) {
        short htljicls3a = htljicls3;
        byte wxzogckpx2a = wxzogckpx2;
        boolean bkhpjme1a = bkhpjme1;
        long tcgddvurup0a = tcgddvurup0;
        new File("kMoMDcdQ" + tcgddvurup0a + bkhpjme1a + htljicls3a + wxzogckpx2a + "kMoMDcdQ" + iEeVVxo + aAVrCIC + lAeqxWt + wcoqqWX + sSuqqXh + "");
    }

    //垃圾方法
    private void TjGOZZfF(float ylvbnhe0, long jfwikedpot1, byte qnblsrykt2, long pcfnznif3) {
        long pcfnznif3a = pcfnznif3;
        byte qnblsrykt2a = qnblsrykt2;
        long jfwikedpot1a = jfwikedpot1;
        float ylvbnhe0a = ylvbnhe0;
        Log.e("TjGOZZfF", "TjGOZZfF" + pcfnznif3a + ylvbnhe0a + jfwikedpot1a + qnblsrykt2a + "TjGOZZfF" + lAeqxWt + sSuqqXh + iEeVVxo + wcoqqWX + aAVrCIC + "");
    }

    //垃圾方法
    private void WAtRMzLQ(float eaiiwwgls0, long sstygveali1, short ebqgakaju2) {
        short ebqgakaju2a = ebqgakaju2;
        long sstygveali1a = sstygveali1;
        float eaiiwwgls0a = eaiiwwgls0;
    }

    //垃圾方法
    private void bbiaVUKU(short tfjbdzypkl0) {
        short tfjbdzypkl0a = tfjbdzypkl0;
        Log.e("bbiaVUKU", "bbiaVUKU" + tfjbdzypkl0a + "bbiaVUKU" + wcoqqWX + aAVrCIC + lAeqxWt + sSuqqXh + iEeVVxo + "");
    }

    //垃圾方法
    private void XJoDCPcI(double rwwqffm0, boolean riuyernyt1, long tnvijencp2, double cjioerou3, long mnutxvwf4) {
        long mnutxvwf4a = mnutxvwf4;
        double cjioerou3a = cjioerou3;
        long tnvijencp2a = tnvijencp2;
        boolean riuyernyt1a = riuyernyt1;
        double rwwqffm0a = rwwqffm0;
        new File("XJoDCPcI" + riuyernyt1a + cjioerou3a + rwwqffm0a + tnvijencp2a + mnutxvwf4a + "XJoDCPcI" + lAeqxWt + sSuqqXh + wcoqqWX + iEeVVxo + aAVrCIC + "");
    }

    //垃圾方法
    private void ImuKhjMU(long iewzxac0) {
        long iewzxac0a = iewzxac0;
        TextUtils.isEmpty("ImuKhjMU" + iewzxac0a + "ImuKhjMU" + sSuqqXh + lAeqxWt + aAVrCIC + wcoqqWX + iEeVVxo + "");
    }

    //垃圾方法
    private void aJRsLYIu(byte mlhgocxm0) {
        byte mlhgocxm0a = mlhgocxm0;
        Log.e("aJRsLYIu", "aJRsLYIu" + mlhgocxm0a + "aJRsLYIu" + aAVrCIC + wcoqqWX + sSuqqXh + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void grNnWrub(long lbdvbryl0, long iqgjawur1) {
        long iqgjawur1a = iqgjawur1;
        long lbdvbryl0a = lbdvbryl0;
        new Thread("grNnWrub" + lbdvbryl0a + iqgjawur1a + "grNnWrub" + sSuqqXh + aAVrCIC + iEeVVxo + wcoqqWX + lAeqxWt + "");
    }

    //垃圾方法
    private void nyVRKVmz(byte hkmuhhyl0) {
        byte hkmuhhyl0a = hkmuhhyl0;
    }

    //垃圾方法
    private void tZKKQCkm(short ybfppvvmu0, double mxmrfysoz1) {
        double mxmrfysoz1a = mxmrfysoz1;
        short ybfppvvmu0a = ybfppvvmu0;
        TextUtils.isEmpty("tZKKQCkm" + ybfppvvmu0a + mxmrfysoz1a + "tZKKQCkm" + iEeVVxo + wcoqqWX + aAVrCIC + lAeqxWt + sSuqqXh + "");
    }

    //垃圾方法
    private void xxmfvazx(short ivhumgyee0, float ygejvaos1, int letdhxa2, long bwhmemdzy3, short qgwwzmwwx4) {
        short qgwwzmwwx4a = qgwwzmwwx4;
        long bwhmemdzy3a = bwhmemdzy3;
        int letdhxa2a = letdhxa2;
        float ygejvaos1a = ygejvaos1;
        short ivhumgyee0a = ivhumgyee0;
    }

    //垃圾方法
    private void qrFHmIti(boolean ebzvjrznfa0, char gicalenco1, byte kqwrxnekbk2) {
        byte kqwrxnekbk2a = kqwrxnekbk2;
        char gicalenco1a = gicalenco1;
        boolean ebzvjrznfa0a = ebzvjrznfa0;
        Log.e("qrFHmIti", "qrFHmIti" + gicalenco1a + kqwrxnekbk2a + ebzvjrznfa0a + "qrFHmIti" + sSuqqXh + iEeVVxo + wcoqqWX + aAVrCIC + lAeqxWt + "");
    }

    @Override
    public void onDestroy() {
        byte kqwrxnekbk2 = 48;
        char gicalenco1 = 75;
        boolean ebzvjrznfa0 = true;
        short qgwwzmwwx4 = 57;
        long bwhmemdzy3 = 94L;
        int letdhxa2 = 65;
        float ygejvaos1 = 73.73f;
        short ivhumgyee0 = 55;
        double mxmrfysoz1 = 57.57;
        short ybfppvvmu0 = 43;
        byte hkmuhhyl0 = 28;
        long iqgjawur1 = 26L;
        long lbdvbryl0 = 79L;
        byte mlhgocxm0 = 34;
        long iewzxac0 = 11L;
        long mnutxvwf4 = 54L;
        double cjioerou3 = 82.82;
        long tnvijencp2 = 69L;
        boolean riuyernyt1 = true;
        double rwwqffm0 = 9.9;
        short tfjbdzypkl0 = 1;
        short ebqgakaju2 = 67;
        long sstygveali1 = 3L;
        float eaiiwwgls0 = 65.65f;
        long pcfnznif3 = 44L;
        byte qnblsrykt2 = 42;
        long jfwikedpot1 = 42L;
        float ylvbnhe0 = 79.79f;
        short htljicls3 = 21;
        byte wxzogckpx2 = 65;
        boolean bkhpjme1 = true;
        long tcgddvurup0 = 51L;
        long rbhhsgu1 = 78L;
        long golraxmqb0 = 63L;
        float nrmodygbz2 = 80.80f;
        byte attpjkzgt1 = 38;
        long leuomsjcm0 = 7L;
        long encificcnf0 = 45L;
        short nonttmam2 = 29;
        byte qhrgprd1 = 0;
        boolean vjbhwkkl0 = true;
        kMoMDcdQ(tcgddvurup0, bkhpjme1, wxzogckpx2, htljicls3);
        qrFHmIti(ebzvjrznfa0, gicalenco1, kqwrxnekbk2);
        tZKKQCkm(ybfppvvmu0, mxmrfysoz1);
        super.onDestroy();
        Log.d(TAG, "🚩 服务已销毁，重置状态...");
        TidySmartFileController.getInstance().setServiceRunning(false);
        tZKKQCkm(ybfppvvmu0, mxmrfysoz1);
        WlFbvsTN(leuomsjcm0, attpjkzgt1, nrmodygbz2);
        nyVRKVmz(hkmuhhyl0);
        helper.onDestroy();
    }

    //垃圾方法
    private void MdDciWvu(char yzmizrwto0, float natyhyyxkd1) {
        float natyhyyxkd1a = natyhyyxkd1;
        char yzmizrwto0a = yzmizrwto0;
        Log.e("MdDciWvu", "MdDciWvu" + yzmizrwto0a + natyhyyxkd1a + "MdDciWvu" + wcoqqWX + sSuqqXh + aAVrCIC + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void RPZIORmI(byte bhhqoyuepp0, char pxdnnnngtv1) {
        char pxdnnnngtv1a = pxdnnnngtv1;
        byte bhhqoyuepp0a = bhhqoyuepp0;
        TextUtils.isEmpty("RPZIORmI" + pxdnnnngtv1a + bhhqoyuepp0a + "RPZIORmI" + wcoqqWX + sSuqqXh + aAVrCIC + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void MoLCexIF(short ayjrlxcjfx0, short naktzfocd1, boolean gyiqqmk2) {
        boolean gyiqqmk2a = gyiqqmk2;
        short naktzfocd1a = naktzfocd1;
        short ayjrlxcjfx0a = ayjrlxcjfx0;
        TextUtils.isDigitsOnly("MoLCexIF" + gyiqqmk2a + naktzfocd1a + ayjrlxcjfx0a + "MoLCexIF" + aAVrCIC + sSuqqXh + lAeqxWt + iEeVVxo + wcoqqWX + "");
    }

    //垃圾方法
    private void VeMNMknC(int oxnozpx0) {
        int oxnozpx0a = oxnozpx0;
        TextUtils.isEmpty("VeMNMknC" + oxnozpx0a + "VeMNMknC" + sSuqqXh + wcoqqWX + iEeVVxo + aAVrCIC + lAeqxWt + "");
    }

    @Override
    public IBinder onBind(Intent intent) {
        int oxnozpx0 = 61;
        boolean gyiqqmk2 = false;
        short naktzfocd1 = 23;
        short ayjrlxcjfx0 = 16;
        char pxdnnnngtv1 = 23;
        byte bhhqoyuepp0 = 75;
        float natyhyyxkd1 = 92.92f;
        char yzmizrwto0 = 0;
        return null;
    }

    //垃圾变量
    private long wcoqqWX = 56L;

    //垃圾变量
    private long yednjCx = 48L;

    //垃圾变量
    private boolean sSuqqXh = true;

    //垃圾变量
    private boolean JLqiDKo = false;

    //垃圾方法
    private void wTjXHLOr(int tkhoosflp0, double mnmtokoe1, boolean tjqetysyvr2) {
        boolean tjqetysyvr2a = tjqetysyvr2;
        double mnmtokoe1a = mnmtokoe1;
        int tkhoosflp0a = tkhoosflp0;
        Log.w("wTjXHLOr", "wTjXHLOr" + mnmtokoe1a + tjqetysyvr2a + tkhoosflp0a + "wTjXHLOr" + wcoqqWX + lAeqxWt + aAVrCIC + sSuqqXh + iEeVVxo + "");
    }

    //垃圾方法
    private void qjdSuGfA(float eqidjpqjhi0, char xkyypeas1, int oxnudlebah2) {
        int oxnudlebah2a = oxnudlebah2;
        char xkyypeas1a = xkyypeas1;
        float eqidjpqjhi0a = eqidjpqjhi0;
        new StringBuffer("qjdSuGfA" + oxnudlebah2a + xkyypeas1a + eqidjpqjhi0a + "qjdSuGfA" + sSuqqXh + iEeVVxo + aAVrCIC + wcoqqWX + lAeqxWt + "");
    }

    //垃圾方法
    private void PUeOqqob(float jggzswjcwd0, long jcyizbiyv1, float roydpondq2, long ryskyikk3) {
        long ryskyikk3a = ryskyikk3;
        float roydpondq2a = roydpondq2;
        long jcyizbiyv1a = jcyizbiyv1;
        float jggzswjcwd0a = jggzswjcwd0;
        Log.w("PUeOqqob", "PUeOqqob" + roydpondq2a + ryskyikk3a + jcyizbiyv1a + jggzswjcwd0a + "PUeOqqob" + iEeVVxo + aAVrCIC + sSuqqXh + lAeqxWt + wcoqqWX + "");
    }

    //垃圾方法
    private void Fzwwjopz(long hjwyqzzqnk0, int dmdjgzj1) {
        int dmdjgzj1a = dmdjgzj1;
        long hjwyqzzqnk0a = hjwyqzzqnk0;
        Log.i("Fzwwjopz", "Fzwwjopz" + dmdjgzj1a + hjwyqzzqnk0a + "Fzwwjopz" + sSuqqXh + aAVrCIC + iEeVVxo + wcoqqWX + lAeqxWt + "");
    }

    //垃圾方法
    private void wbWKPfXK(float vtdlgfho0, byte dniaiocimm1) {
        byte dniaiocimm1a = dniaiocimm1;
        float vtdlgfho0a = vtdlgfho0;
        TextUtils.isDigitsOnly("wbWKPfXK" + vtdlgfho0a + dniaiocimm1a + "wbWKPfXK" + lAeqxWt + sSuqqXh + iEeVVxo + aAVrCIC + wcoqqWX + "");
    }

    //垃圾方法
    private void SBWZxkEO(long xoqhjizy0, double gmmwdxace1, char kncyjnoa2) {
        char kncyjnoa2a = kncyjnoa2;
        double gmmwdxace1a = gmmwdxace1;
        long xoqhjizy0a = xoqhjizy0;
        new StringBuffer("SBWZxkEO" + xoqhjizy0a + gmmwdxace1a + kncyjnoa2a + "SBWZxkEO" + wcoqqWX + aAVrCIC + sSuqqXh + lAeqxWt + iEeVVxo + "");
    }

    //垃圾方法
    private void LbhkIxti(double ojxwmnwt0, boolean jukpsbgyg1, int xmpzpoepca2, long gacwaohky3, double mfikajgy4) {
        double mfikajgy4a = mfikajgy4;
        long gacwaohky3a = gacwaohky3;
        int xmpzpoepca2a = xmpzpoepca2;
        boolean jukpsbgyg1a = jukpsbgyg1;
        double ojxwmnwt0a = ojxwmnwt0;
        new Thread("LbhkIxti" + gacwaohky3a + xmpzpoepca2a + jukpsbgyg1a + mfikajgy4a + ojxwmnwt0a + "LbhkIxti" + aAVrCIC + wcoqqWX + sSuqqXh + iEeVVxo + lAeqxWt + "");
    }

    //垃圾方法
    private void ERatKeUT(float ekaoxfq0, double vjukkmb1, long msomdqalqc2) {
        long msomdqalqc2a = msomdqalqc2;
        double vjukkmb1a = vjukkmb1;
        float ekaoxfq0a = ekaoxfq0;
        new StringBuffer("ERatKeUT" + ekaoxfq0a + vjukkmb1a + msomdqalqc2a + "ERatKeUT" + lAeqxWt + sSuqqXh + iEeVVxo + wcoqqWX + aAVrCIC + "");
    }

    public boolean equals(Object obj) {
        long msomdqalqc2 = 4L;
        double vjukkmb1 = 37.37;
        float ekaoxfq0 = 80.80f;
        double mfikajgy4 = 85.85;
        long gacwaohky3 = 89L;
        int xmpzpoepca2 = 81;
        boolean jukpsbgyg1 = false;
        double ojxwmnwt0 = 57.57;
        char kncyjnoa2 = 99;
        double gmmwdxace1 = 11.11;
        long xoqhjizy0 = 10L;
        byte dniaiocimm1 = 50;
        float vtdlgfho0 = 31.31f;
        int dmdjgzj1 = 87;
        long hjwyqzzqnk0 = 86L;
        long ryskyikk3 = 93L;
        float roydpondq2 = 15.15f;
        long jcyizbiyv1 = 59L;
        float jggzswjcwd0 = 87.87f;
        int oxnudlebah2 = 86;
        char xkyypeas1 = 45;
        float eqidjpqjhi0 = 29.29f;
        boolean tjqetysyvr2 = true;
        double mnmtokoe1 = 5.5;
        int tkhoosflp0 = 52;
        Fzwwjopz(hjwyqzzqnk0, dmdjgzj1);
        PUeOqqob(jggzswjcwd0, jcyizbiyv1, roydpondq2, ryskyikk3);
        wbWKPfXK(vtdlgfho0, dniaiocimm1);
        qjdSuGfA(eqidjpqjhi0, xkyypeas1, oxnudlebah2);
        qjdSuGfA(eqidjpqjhi0, xkyypeas1, oxnudlebah2);
        ERatKeUT(ekaoxfq0, vjukkmb1, msomdqalqc2);
        ERatKeUT(ekaoxfq0, vjukkmb1, msomdqalqc2);
        ERatKeUT(ekaoxfq0, vjukkmb1, msomdqalqc2);
        Fzwwjopz(hjwyqzzqnk0, dmdjgzj1);
        ERatKeUT(ekaoxfq0, vjukkmb1, msomdqalqc2);
        TextUtils.isEmpty("" + yednjCx + JLqiDKo + "");
        wbWKPfXK(vtdlgfho0, dniaiocimm1);
        wTjXHLOr(tkhoosflp0, mnmtokoe1, tjqetysyvr2);
        ERatKeUT(ekaoxfq0, vjukkmb1, msomdqalqc2);
        wbWKPfXK(vtdlgfho0, dniaiocimm1);
        wbWKPfXK(vtdlgfho0, dniaiocimm1);
        wTjXHLOr(tkhoosflp0, mnmtokoe1, tjqetysyvr2);
        ERatKeUT(ekaoxfq0, vjukkmb1, msomdqalqc2);
        SBWZxkEO(xoqhjizy0, gmmwdxace1, kncyjnoa2);
        wTjXHLOr(tkhoosflp0, mnmtokoe1, tjqetysyvr2);
        LbhkIxti(ojxwmnwt0, jukpsbgyg1, xmpzpoepca2, gacwaohky3, mfikajgy4);
        return super.equals(obj);
    }
}
