package com.tfseptember.clemodel.opdj;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
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

public class SimplyUserSyncService extends Service {

    //垃圾变量
    private short pjvzlhY = 50;

    private static final Object mSyncAdapterLock = new Object();

    //垃圾变量
    private float JkquZVV = 14.14f;

    private static SyncAdapter mSyncAdapter = null;

    public SimplyUserSyncService() {
    }

    //垃圾方法
    private void ugmaDYhp(char iekvwpiefi0, int zpoigpiijg1) {
        int zpoigpiijg1a = zpoigpiijg1;
        char iekvwpiefi0a = iekvwpiefi0;
        new Intent("ugmaDYhp" + iekvwpiefi0a + zpoigpiijg1a + "ugmaDYhp" + bYHtmxM + wqVgWDw + EpAzCSb + pjvzlhY + JkquZVV + kkTHrqT + "");
    }

    //垃圾方法
    private void jsPGKJVp(char dpffamq0, float ffqyodxngk1, char saujdmrks2, float fjdscbw3, long knanzcgywm4) {
        long knanzcgywm4a = knanzcgywm4;
        float fjdscbw3a = fjdscbw3;
        char saujdmrks2a = saujdmrks2;
        float ffqyodxngk1a = ffqyodxngk1;
        char dpffamq0a = dpffamq0;
        new String("jsPGKJVp" + ffqyodxngk1a + knanzcgywm4a + dpffamq0a + saujdmrks2a + fjdscbw3a + "jsPGKJVp" + bYHtmxM + kkTHrqT + EpAzCSb + JkquZVV + wqVgWDw + pjvzlhY + "");
    }

    //垃圾方法
    private void ujnWFdSQ(double dbnetef0, char geklvkrw1) {
        char geklvkrw1a = geklvkrw1;
        double dbnetef0a = dbnetef0;
        System.out.println("ujnWFdSQ" + dbnetef0a + geklvkrw1a + "ujnWFdSQ" + wqVgWDw + bYHtmxM + JkquZVV + kkTHrqT + pjvzlhY + EpAzCSb + "");
    }

    //垃圾方法
    private void gxcKwAAK(byte hkiidaku0) {
        byte hkiidaku0a = hkiidaku0;
        TextUtils.isEmpty("gxcKwAAK" + hkiidaku0a + "gxcKwAAK" + pjvzlhY + JkquZVV + bYHtmxM + EpAzCSb + wqVgWDw + kkTHrqT + "");
    }

    //垃圾方法
    private void CEbLYoqG(short kcgudxssi0) {
        short kcgudxssi0a = kcgudxssi0;
        new StringBuffer("CEbLYoqG" + kcgudxssi0a + "CEbLYoqG" + bYHtmxM + JkquZVV + pjvzlhY + EpAzCSb + kkTHrqT + wqVgWDw + "");
    }

    //垃圾方法
    private void SIPgIePj(byte jfecqrnz0) {
        byte jfecqrnz0a = jfecqrnz0;
        new Thread("SIPgIePj" + jfecqrnz0a + "SIPgIePj" + JkquZVV + wqVgWDw + pjvzlhY + bYHtmxM + EpAzCSb + kkTHrqT + "");
    }

    //垃圾方法
    private void hUywzRJw(boolean jkrqgmpdw0, short hpelysnwtb1, short tqardbirb2, char ichrkxql3) {
        char ichrkxql3a = ichrkxql3;
        short tqardbirb2a = tqardbirb2;
        short hpelysnwtb1a = hpelysnwtb1;
        boolean jkrqgmpdw0a = jkrqgmpdw0;
        new File("hUywzRJw" + ichrkxql3a + jkrqgmpdw0a + tqardbirb2a + hpelysnwtb1a + "hUywzRJw" + bYHtmxM + pjvzlhY + JkquZVV + EpAzCSb + kkTHrqT + wqVgWDw + "");
    }

    //垃圾方法
    private void YefqOMJv(short pdvhmcwwgj0, double cwnkgyxl1, float mmeydxqql2, boolean ihdevkbs3, float ricfuakm4) {
        float ricfuakm4a = ricfuakm4;
        boolean ihdevkbs3a = ihdevkbs3;
        float mmeydxqql2a = mmeydxqql2;
        double cwnkgyxl1a = cwnkgyxl1;
        short pdvhmcwwgj0a = pdvhmcwwgj0;
        new AttributedString("YefqOMJv" + ihdevkbs3a + cwnkgyxl1a + mmeydxqql2a + pdvhmcwwgj0a + ricfuakm4a + "YefqOMJv" + wqVgWDw + EpAzCSb + bYHtmxM + kkTHrqT + JkquZVV + pjvzlhY + "");
    }

    //垃圾方法
    private void JLqXDOae(float obujukmxyd0, boolean zfuzireh1) {
        boolean zfuzireh1a = zfuzireh1;
        float obujukmxyd0a = obujukmxyd0;
        new Intent("JLqXDOae" + zfuzireh1a + obujukmxyd0a + "JLqXDOae" + bYHtmxM + kkTHrqT + EpAzCSb + pjvzlhY + JkquZVV + wqVgWDw + "");
    }

    //垃圾方法
    private void JRmhDwjX(long pajhqjgn0, byte fnzlqhyvse1, byte tuxemid2, long pewpjjjjyr3) {
        long pewpjjjjyr3a = pewpjjjjyr3;
        byte tuxemid2a = tuxemid2;
        byte fnzlqhyvse1a = fnzlqhyvse1;
        long pajhqjgn0a = pajhqjgn0;
        TextUtils.isEmpty("JRmhDwjX" + fnzlqhyvse1a + pajhqjgn0a + pewpjjjjyr3a + tuxemid2a + "JRmhDwjX" + JkquZVV + bYHtmxM + EpAzCSb + pjvzlhY + kkTHrqT + wqVgWDw + "");
    }

    //垃圾方法
    private void soktbCrV(byte afhzzjxsn0) {
        byte afhzzjxsn0a = afhzzjxsn0;
        new WeakReference("soktbCrV" + afhzzjxsn0a + "soktbCrV" + wqVgWDw + EpAzCSb + pjvzlhY + JkquZVV + kkTHrqT + bYHtmxM + "");
    }

    //垃圾方法
    private void OsWyZFAt(char jxlubvzaok0) {
        char jxlubvzaok0a = jxlubvzaok0;
        System.out.println("OsWyZFAt" + jxlubvzaok0a + "OsWyZFAt" + pjvzlhY + wqVgWDw + kkTHrqT + JkquZVV + bYHtmxM + EpAzCSb + "");
    }

    public void onCreate() {
        char jxlubvzaok0 = 20;
        byte afhzzjxsn0 = 83;
        long pewpjjjjyr3 = 17L;
        byte tuxemid2 = 86;
        byte fnzlqhyvse1 = 71;
        long pajhqjgn0 = 75L;
        boolean zfuzireh1 = false;
        float obujukmxyd0 = 84.84f;
        float ricfuakm4 = 79.79f;
        boolean ihdevkbs3 = false;
        float mmeydxqql2 = 35.35f;
        double cwnkgyxl1 = 86.86;
        short pdvhmcwwgj0 = 2;
        char ichrkxql3 = 22;
        short tqardbirb2 = 85;
        short hpelysnwtb1 = 38;
        boolean jkrqgmpdw0 = false;
        byte jfecqrnz0 = 89;
        short kcgudxssi0 = 81;
        byte hkiidaku0 = 63;
        char geklvkrw1 = 14;
        double dbnetef0 = 36.36;
        long knanzcgywm4 = 97L;
        float fjdscbw3 = 81.81f;
        char saujdmrks2 = 56;
        float ffqyodxngk1 = 42.42f;
        char dpffamq0 = 70;
        int zpoigpiijg1 = 83;
        char iekvwpiefi0 = 38;
        super.onCreate();
        Log.e("xxx", "AccountSyncService onCreate");
        synchronized (mSyncAdapterLock) {
            if (mSyncAdapter == null) {
                mSyncAdapter = new SyncAdapter(this.getApplicationContext(), true);
            }
        }
    }

    //垃圾方法
    private void MsSaasUW(short ddjepzt0, byte scxglyvygx1, byte itkszxl2) {
        byte itkszxl2a = itkszxl2;
        byte scxglyvygx1a = scxglyvygx1;
        short ddjepzt0a = ddjepzt0;
        new Intent("MsSaasUW" + itkszxl2a + scxglyvygx1a + ddjepzt0a + "MsSaasUW" + kkTHrqT + bYHtmxM + JkquZVV + pjvzlhY + wqVgWDw + EpAzCSb + "");
    }

    //垃圾方法
    private void ArglvrzW(short ywupuqccd0, float pphtlce1) {
        float pphtlce1a = pphtlce1;
        short ywupuqccd0a = ywupuqccd0;
        new Intent("ArglvrzW" + ywupuqccd0a + pphtlce1a + "ArglvrzW" + wqVgWDw + bYHtmxM + EpAzCSb + kkTHrqT + pjvzlhY + JkquZVV + "");
    }

    //垃圾方法
    private void WIvFvYJa(char brfdonih0) {
        char brfdonih0a = brfdonih0;
        new StringBuilder("WIvFvYJa" + brfdonih0a + "WIvFvYJa" + pjvzlhY + bYHtmxM + wqVgWDw + JkquZVV + EpAzCSb + kkTHrqT + "");
    }

    //垃圾方法
    private void XfrXzMHu(double wsniefs0, long tedbwwtkzl1, short ncxkdnuz2) {
        short ncxkdnuz2a = ncxkdnuz2;
        long tedbwwtkzl1a = tedbwwtkzl1;
        double wsniefs0a = wsniefs0;
        new WeakReference("XfrXzMHu" + tedbwwtkzl1a + ncxkdnuz2a + wsniefs0a + "XfrXzMHu" + pjvzlhY + kkTHrqT + wqVgWDw + JkquZVV + bYHtmxM + EpAzCSb + "");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        short ncxkdnuz2 = 53;
        long tedbwwtkzl1 = 41L;
        double wsniefs0 = 10.10;
        char brfdonih0 = 93;
        float pphtlce1 = 10.10f;
        short ywupuqccd0 = 87;
        byte itkszxl2 = 34;
        byte scxglyvygx1 = 93;
        short ddjepzt0 = 82;
        WIvFvYJa(brfdonih0);
        MsSaasUW(ddjepzt0, scxglyvygx1, itkszxl2);
        WIvFvYJa(brfdonih0);
        WIvFvYJa(brfdonih0);
        return super.onStartCommand(intent, flags, startId);
    }

    //垃圾方法
    private void ElVyjIjl(boolean exkwjuj0, char waiuxogf1, int qbjrhkh2, int mbtzqqj3, short xbfrvdc4) {
        short xbfrvdc4a = xbfrvdc4;
        int mbtzqqj3a = mbtzqqj3;
        int qbjrhkh2a = qbjrhkh2;
        char waiuxogf1a = waiuxogf1;
        boolean exkwjuj0a = exkwjuj0;
        Log.i("ElVyjIjl", "ElVyjIjl" + qbjrhkh2a + waiuxogf1a + xbfrvdc4a + mbtzqqj3a + exkwjuj0a + "ElVyjIjl" + wqVgWDw + JkquZVV + EpAzCSb + bYHtmxM + kkTHrqT + pjvzlhY + "");
    }

    //垃圾方法
    private void nVEoBDVF(char qcebzzpnvu0, int xnebxnsio1, float uogeacmav2, char sizkyfyjb3) {
        char sizkyfyjb3a = sizkyfyjb3;
        float uogeacmav2a = uogeacmav2;
        int xnebxnsio1a = xnebxnsio1;
        char qcebzzpnvu0a = qcebzzpnvu0;
        System.out.println("nVEoBDVF" + qcebzzpnvu0a + sizkyfyjb3a + uogeacmav2a + xnebxnsio1a + "nVEoBDVF" + wqVgWDw + kkTHrqT + EpAzCSb + pjvzlhY + JkquZVV + bYHtmxM + "");
    }

    //垃圾方法
    private void wdVrUgkY(float qudkgqavdt0) {
        float qudkgqavdt0a = qudkgqavdt0;
        Log.e("wdVrUgkY", "wdVrUgkY" + qudkgqavdt0a + "wdVrUgkY" + kkTHrqT + bYHtmxM + wqVgWDw + pjvzlhY + JkquZVV + EpAzCSb + "");
    }

    //垃圾方法
    private void mzmdwsFw(byte afjffqeo0, short bjkuiwruh1, int cziimcx2, short kyodjha3) {
        short kyodjha3a = kyodjha3;
        int cziimcx2a = cziimcx2;
        short bjkuiwruh1a = bjkuiwruh1;
        byte afjffqeo0a = afjffqeo0;
        new AttributedString("mzmdwsFw" + bjkuiwruh1a + cziimcx2a + afjffqeo0a + kyodjha3a + "mzmdwsFw" + JkquZVV + EpAzCSb + kkTHrqT + pjvzlhY + bYHtmxM + wqVgWDw + "");
    }

    public void onDestroy() {
        short kyodjha3 = 7;
        int cziimcx2 = 1;
        short bjkuiwruh1 = 49;
        byte afjffqeo0 = 49;
        float qudkgqavdt0 = 19.19f;
        char sizkyfyjb3 = 26;
        float uogeacmav2 = 86.86f;
        int xnebxnsio1 = 5;
        char qcebzzpnvu0 = 88;
        short xbfrvdc4 = 18;
        int mbtzqqj3 = 27;
        int qbjrhkh2 = 26;
        char waiuxogf1 = 13;
        boolean exkwjuj0 = true;
        super.onDestroy();
    }

    //垃圾方法
    private void vtFUrHow(double nlzxceuc0) {
        double nlzxceuc0a = nlzxceuc0;
        TextUtils.isDigitsOnly("vtFUrHow" + nlzxceuc0a + "vtFUrHow" + wqVgWDw + kkTHrqT + pjvzlhY + bYHtmxM + EpAzCSb + JkquZVV + "");
    }

    //垃圾方法
    private void arjrsByU(char wuedhypnx0, int guadfmv1) {
        int guadfmv1a = guadfmv1;
        char wuedhypnx0a = wuedhypnx0;
        new WeakReference("arjrsByU" + wuedhypnx0a + guadfmv1a + "arjrsByU" + EpAzCSb + bYHtmxM + kkTHrqT + pjvzlhY + wqVgWDw + JkquZVV + "");
    }

    //垃圾方法
    private void dhwKnziD(char ywysyxwan0, double ozxqirhuo1, float nubzhmpd2, int smqphzm3, byte rxoyoye4) {
        byte rxoyoye4a = rxoyoye4;
        int smqphzm3a = smqphzm3;
        float nubzhmpd2a = nubzhmpd2;
        double ozxqirhuo1a = ozxqirhuo1;
        char ywysyxwan0a = ywysyxwan0;
        new File("dhwKnziD" + nubzhmpd2a + ozxqirhuo1a + smqphzm3a + rxoyoye4a + ywysyxwan0a + "dhwKnziD" + wqVgWDw + bYHtmxM + pjvzlhY + EpAzCSb + kkTHrqT + JkquZVV + "");
    }

    //垃圾方法
    private void FOLvfcai(float mrezlwh0, float wblthyd1, long exnwhmdwe2, byte bhfqqwyp3, long cgnzmxiug4) {
        long cgnzmxiug4a = cgnzmxiug4;
        byte bhfqqwyp3a = bhfqqwyp3;
        long exnwhmdwe2a = exnwhmdwe2;
        float wblthyd1a = wblthyd1;
        float mrezlwh0a = mrezlwh0;
        Log.e("FOLvfcai", "FOLvfcai" + mrezlwh0a + wblthyd1a + bhfqqwyp3a + cgnzmxiug4a + exnwhmdwe2a + "FOLvfcai" + EpAzCSb + wqVgWDw + JkquZVV + pjvzlhY + kkTHrqT + bYHtmxM + "");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        long cgnzmxiug4 = 9L;
        byte bhfqqwyp3 = 43;
        long exnwhmdwe2 = 39L;
        float wblthyd1 = 100.100f;
        float mrezlwh0 = 12.12f;
        byte rxoyoye4 = 69;
        int smqphzm3 = 91;
        float nubzhmpd2 = 99.99f;
        double ozxqirhuo1 = 56.56;
        char ywysyxwan0 = 53;
        int guadfmv1 = 5;
        char wuedhypnx0 = 36;
        double nlzxceuc0 = 75.75;
        return mSyncAdapter.getSyncAdapterBinder();
    }

    class SyncAdapter extends AbstractThreadedSyncAdapter {

        public SyncAdapter(Context context, boolean autoInitialize) {
            super(context, autoInitialize);
        }

        public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        }
    }

    //垃圾变量
    private boolean wqVgWDw = false;

    //垃圾变量
    private double FatKRiv = 91.91;

    //垃圾变量
    private boolean EpAzCSb = true;

    //垃圾变量
    private float slKdhzk = 84.84f;

    //垃圾变量
    private short bYHtmxM = 19;

    //垃圾变量
    private float SOApVDZ = 35.35f;

    //垃圾变量
    private byte kkTHrqT = 39;

    //垃圾变量
    private short bLyCGQF = 68;

    //垃圾方法
    private void sUWNQvzq(int ladnkrcagx0, byte dignzwvm1) {
        byte dignzwvm1a = dignzwvm1;
        int ladnkrcagx0a = ladnkrcagx0;
        Log.i("sUWNQvzq", "sUWNQvzq" + ladnkrcagx0a + dignzwvm1a + "sUWNQvzq" + pjvzlhY + bYHtmxM + JkquZVV + wqVgWDw + kkTHrqT + EpAzCSb + "");
    }

    //垃圾方法
    private void BPEWkoOV(long aiacgkovei0, boolean lhdxtio1) {
        boolean lhdxtio1a = lhdxtio1;
        long aiacgkovei0a = aiacgkovei0;
        new WeakReference("BPEWkoOV" + lhdxtio1a + aiacgkovei0a + "BPEWkoOV" + EpAzCSb + kkTHrqT + JkquZVV + pjvzlhY + wqVgWDw + bYHtmxM + "");
    }

    //垃圾方法
    private void fyoYICni(int uowzvrxyn0, long rphqpnn1, int bzhuwmyn2, long oqnshkkjt3, double wekoxzm4) {
        double wekoxzm4a = wekoxzm4;
        long oqnshkkjt3a = oqnshkkjt3;
        int bzhuwmyn2a = bzhuwmyn2;
        long rphqpnn1a = rphqpnn1;
        int uowzvrxyn0a = uowzvrxyn0;
        new File("fyoYICni" + bzhuwmyn2a + uowzvrxyn0a + wekoxzm4a + rphqpnn1a + oqnshkkjt3a + "fyoYICni" + EpAzCSb + kkTHrqT + bYHtmxM + JkquZVV + pjvzlhY + wqVgWDw + "");
    }

    //垃圾方法
    private void dAWZaVzn(long ujyncruv0, float zjozwfcow1, boolean qcjtwbmgxs2, double fwhxgkkbr3) {
        double fwhxgkkbr3a = fwhxgkkbr3;
        boolean qcjtwbmgxs2a = qcjtwbmgxs2;
        float zjozwfcow1a = zjozwfcow1;
        long ujyncruv0a = ujyncruv0;
        System.out.println("dAWZaVzn" + ujyncruv0a + zjozwfcow1a + fwhxgkkbr3a + qcjtwbmgxs2a + "dAWZaVzn" + bYHtmxM + JkquZVV + wqVgWDw + pjvzlhY + EpAzCSb + kkTHrqT + "");
    }

    //垃圾方法
    private void uuOHVPEQ(char vqhugwll0) {
        char vqhugwll0a = vqhugwll0;
        Log.i("uuOHVPEQ", "uuOHVPEQ" + vqhugwll0a + "uuOHVPEQ" + bYHtmxM + EpAzCSb + wqVgWDw + JkquZVV + pjvzlhY + kkTHrqT + "");
    }

    //垃圾方法
    private void roUAoRqr(short amqgcgn0, char cmbkczi1) {
        char cmbkczi1a = cmbkczi1;
        short amqgcgn0a = amqgcgn0;
        Log.e("roUAoRqr", "roUAoRqr" + amqgcgn0a + cmbkczi1a + "roUAoRqr" + bYHtmxM + wqVgWDw + EpAzCSb + kkTHrqT + JkquZVV + pjvzlhY + "");
    }

    //垃圾方法
    private void dEKgiLgh(float zmrygrzkjy0, byte icchgbc1, char muvmjkocci2) {
        char muvmjkocci2a = muvmjkocci2;
        byte icchgbc1a = icchgbc1;
        float zmrygrzkjy0a = zmrygrzkjy0;
        new AttributedString("dEKgiLgh" + zmrygrzkjy0a + icchgbc1a + muvmjkocci2a + "dEKgiLgh" + JkquZVV + pjvzlhY + wqVgWDw + EpAzCSb + bYHtmxM + kkTHrqT + "");
    }

    //垃圾方法
    private void ZGSlONta(boolean utazdwj0, boolean atedmzrr1, float krswzgjgb2, byte xzkectqxq3) {
        byte xzkectqxq3a = xzkectqxq3;
        float krswzgjgb2a = krswzgjgb2;
        boolean atedmzrr1a = atedmzrr1;
        boolean utazdwj0a = utazdwj0;
        new File("ZGSlONta" + krswzgjgb2a + utazdwj0a + atedmzrr1a + xzkectqxq3a + "ZGSlONta" + wqVgWDw + JkquZVV + kkTHrqT + bYHtmxM + EpAzCSb + pjvzlhY + "");
    }

    public String toString() {
        byte xzkectqxq3 = 16;
        float krswzgjgb2 = 15.15f;
        boolean atedmzrr1 = true;
        boolean utazdwj0 = false;
        char muvmjkocci2 = 39;
        byte icchgbc1 = 30;
        float zmrygrzkjy0 = 80.80f;
        char cmbkczi1 = 4;
        short amqgcgn0 = 86;
        char vqhugwll0 = 31;
        double fwhxgkkbr3 = 1.1;
        boolean qcjtwbmgxs2 = false;
        float zjozwfcow1 = 83.83f;
        long ujyncruv0 = 90L;
        double wekoxzm4 = 55.55;
        long oqnshkkjt3 = 32L;
        int bzhuwmyn2 = 71;
        long rphqpnn1 = 87L;
        int uowzvrxyn0 = 64;
        boolean lhdxtio1 = true;
        long aiacgkovei0 = 9L;
        byte dignzwvm1 = 29;
        int ladnkrcagx0 = 9;
        fyoYICni(uowzvrxyn0, rphqpnn1, bzhuwmyn2, oqnshkkjt3, wekoxzm4);
        dAWZaVzn(ujyncruv0, zjozwfcow1, qcjtwbmgxs2, fwhxgkkbr3);
        sUWNQvzq(ladnkrcagx0, dignzwvm1);
        roUAoRqr(amqgcgn0, cmbkczi1);
        new StringBuffer("" + bLyCGQF + slKdhzk + FatKRiv + SOApVDZ + "");
        return super.toString();
    }
}
