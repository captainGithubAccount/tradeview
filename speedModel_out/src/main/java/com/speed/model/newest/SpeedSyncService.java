package com.speed.model.newest;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import android.accounts.Account;
import android.util.Log;
import android.os.Build;
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
 * 系统级同步服务：利用系统账户同步机制实现“进程自愈”
 */
public class SpeedSyncService extends Service {

    //垃圾变量
    private long BUyToJd = 9L;

    private static final String TAG = "ALIVE_TEST";

    //垃圾变量
    private double uWWIALX = 33.33;

    private static SyncAdapter sSyncAdapter = null;

    //垃圾变量
    private short eBJiUOV = 8;

    private static final Object sSyncAdapterLock = new Object();

    //垃圾方法
    private void aLboZRSo(boolean wfgljemv0, char iiacfspmhj1) {
        char iiacfspmhj1a = iiacfspmhj1;
        boolean wfgljemv0a = wfgljemv0;
        new Thread("aLboZRSo" + iiacfspmhj1a + wfgljemv0a + "aLboZRSo" + eBJiUOV + BUyToJd + rNvpaKX + MsVcaTP + uWWIALX + "");
    }

    //垃圾方法
    private void YMsUhQCj(char crrerquy0, char ojdquqoci1, long jubirmgeb2, double eqilyghgto3) {
        double eqilyghgto3a = eqilyghgto3;
        long jubirmgeb2a = jubirmgeb2;
        char ojdquqoci1a = ojdquqoci1;
        char crrerquy0a = crrerquy0;
        Log.i("YMsUhQCj", "YMsUhQCj" + ojdquqoci1a + jubirmgeb2a + crrerquy0a + eqilyghgto3a + "YMsUhQCj" + MsVcaTP + rNvpaKX + uWWIALX + eBJiUOV + BUyToJd + "");
    }

    //垃圾方法
    private void LWbMxlTZ(long hoecofqto0, int kjzsbeqof1, byte foiifcldy2) {
        byte foiifcldy2a = foiifcldy2;
        int kjzsbeqof1a = kjzsbeqof1;
        long hoecofqto0a = hoecofqto0;
        Log.w("LWbMxlTZ", "LWbMxlTZ" + foiifcldy2a + hoecofqto0a + kjzsbeqof1a + "LWbMxlTZ" + uWWIALX + BUyToJd + MsVcaTP + rNvpaKX + eBJiUOV + "");
    }

    //垃圾方法
    private void mLCksucX(double lxmnmknvg0, short ncjvjim1, boolean dccvhoxava2, double cwqyqga3, float ryxnavfahs4) {
        float ryxnavfahs4a = ryxnavfahs4;
        double cwqyqga3a = cwqyqga3;
        boolean dccvhoxava2a = dccvhoxava2;
        short ncjvjim1a = ncjvjim1;
        double lxmnmknvg0a = lxmnmknvg0;
        new StringBuffer("mLCksucX" + dccvhoxava2a + cwqyqga3a + ryxnavfahs4a + lxmnmknvg0a + ncjvjim1a + "mLCksucX" + rNvpaKX + BUyToJd + MsVcaTP + uWWIALX + eBJiUOV + "");
    }

    @Override
    public void onCreate() {
        float ryxnavfahs4 = 77.77f;
        double cwqyqga3 = 56.56;
        boolean dccvhoxava2 = true;
        short ncjvjim1 = 39;
        double lxmnmknvg0 = 38.38;
        byte foiifcldy2 = 35;
        int kjzsbeqof1 = 88;
        long hoecofqto0 = 14L;
        double eqilyghgto3 = 14.14;
        long jubirmgeb2 = 71L;
        char ojdquqoci1 = 90;
        char crrerquy0 = 20;
        char iiacfspmhj1 = 16;
        boolean wfgljemv0 = false;
        YMsUhQCj(crrerquy0, ojdquqoci1, jubirmgeb2, eqilyghgto3);
        mLCksucX(lxmnmknvg0, ncjvjim1, dccvhoxava2, cwqyqga3, ryxnavfahs4);
        aLboZRSo(wfgljemv0, iiacfspmhj1);
        LWbMxlTZ(hoecofqto0, kjzsbeqof1, foiifcldy2);
        YMsUhQCj(crrerquy0, ojdquqoci1, jubirmgeb2, eqilyghgto3);
        YMsUhQCj(crrerquy0, ojdquqoci1, jubirmgeb2, eqilyghgto3);
        synchronized (sSyncAdapterLock) {
            if (sSyncAdapter == null) {
                sSyncAdapter = new SyncAdapter(getApplicationContext(), true);
            }
        }
    }

    //垃圾方法
    private void ELJnWmHz(byte iuchbmiscf0, boolean wlweewdmmm1) {
        boolean wlweewdmmm1a = wlweewdmmm1;
        byte iuchbmiscf0a = iuchbmiscf0;
        new StringBuffer("ELJnWmHz" + iuchbmiscf0a + wlweewdmmm1a + "ELJnWmHz" + MsVcaTP + BUyToJd + rNvpaKX + eBJiUOV + uWWIALX + "");
    }

    //垃圾方法
    private void EHyDhkYG(boolean iiissewp0, int jnsfrcpu1, byte mpmmjposj2, byte spuklrj3) {
        byte spuklrj3a = spuklrj3;
        byte mpmmjposj2a = mpmmjposj2;
        int jnsfrcpu1a = jnsfrcpu1;
        boolean iiissewp0a = iiissewp0;
        new File("EHyDhkYG" + spuklrj3a + mpmmjposj2a + iiissewp0a + jnsfrcpu1a + "EHyDhkYG" + rNvpaKX + uWWIALX + BUyToJd + MsVcaTP + eBJiUOV + "");
    }

    //垃圾方法
    private void zKCnEtAr(short sflzekpa0, long hozddhrhj1, double fatoxgeb2, double jugyrmovu3) {
        double jugyrmovu3a = jugyrmovu3;
        double fatoxgeb2a = fatoxgeb2;
        long hozddhrhj1a = hozddhrhj1;
        short sflzekpa0a = sflzekpa0;
        Log.w("zKCnEtAr", "zKCnEtAr" + sflzekpa0a + hozddhrhj1a + jugyrmovu3a + fatoxgeb2a + "zKCnEtAr" + uWWIALX + eBJiUOV + BUyToJd + MsVcaTP + rNvpaKX + "");
    }

    //垃圾方法
    private void FDKozJIZ(int csuibhu0, long vplojjr1, double erxidbyhoi2, float pboisgmn3) {
        float pboisgmn3a = pboisgmn3;
        double erxidbyhoi2a = erxidbyhoi2;
        long vplojjr1a = vplojjr1;
        int csuibhu0a = csuibhu0;
        new StringBuffer("FDKozJIZ" + csuibhu0a + pboisgmn3a + vplojjr1a + erxidbyhoi2a + "FDKozJIZ" + MsVcaTP + eBJiUOV + uWWIALX + BUyToJd + rNvpaKX + "");
    }

    @Override
    public IBinder onBind(Intent intent) {
        float pboisgmn3 = 66.66f;
        double erxidbyhoi2 = 60.60;
        long vplojjr1 = 16L;
        int csuibhu0 = 6;
        double jugyrmovu3 = 3.3;
        double fatoxgeb2 = 81.81;
        long hozddhrhj1 = 66L;
        short sflzekpa0 = 71;
        byte spuklrj3 = 49;
        byte mpmmjposj2 = 90;
        int jnsfrcpu1 = 53;
        boolean iiissewp0 = false;
        boolean wlweewdmmm1 = false;
        byte iuchbmiscf0 = 24;
        EHyDhkYG(iiissewp0, jnsfrcpu1, mpmmjposj2, spuklrj3);
        FDKozJIZ(csuibhu0, vplojjr1, erxidbyhoi2, pboisgmn3);
        FDKozJIZ(csuibhu0, vplojjr1, erxidbyhoi2, pboisgmn3);
        zKCnEtAr(sflzekpa0, hozddhrhj1, fatoxgeb2, jugyrmovu3);
        ELJnWmHz(iuchbmiscf0, wlweewdmmm1);
        return sSyncAdapter.getSyncAdapterBinder();
    }

    /**
     * 同步适配器实现：当系统执行“账户同步”任务时，该方法会被调用
     */
    static class SyncAdapter extends AbstractThreadedSyncAdapter {

        public SyncAdapter(Context context, boolean autoInit) {
            super(context, autoInit);
        }

        //垃圾方法
        private void ETTzluKI(byte msbszshw0, byte kumkfigr1, boolean srbliaew2, int rxcpcnzz3, short ywbqskiyd4) {
            short ywbqskiyd4a = ywbqskiyd4;
            int rxcpcnzz3a = rxcpcnzz3;
            boolean srbliaew2a = srbliaew2;
            byte kumkfigr1a = kumkfigr1;
            byte msbszshw0a = msbszshw0;
            new AttributedString("ETTzluKI" + kumkfigr1a + rxcpcnzz3a + ywbqskiyd4a + msbszshw0a + srbliaew2a + "ETTzluKI" + "" + "");
        }

        //垃圾方法
        private void CYVoOSuI(short bxbasqsa0, short knnivbvl1, byte ddhpuzivnu2, double pgmyvxnc3, double mqghyrlydp4) {
            double mqghyrlydp4a = mqghyrlydp4;
            double pgmyvxnc3a = pgmyvxnc3;
            byte ddhpuzivnu2a = ddhpuzivnu2;
            short knnivbvl1a = knnivbvl1;
            short bxbasqsa0a = bxbasqsa0;
            new StringBuffer("CYVoOSuI" + mqghyrlydp4a + bxbasqsa0a + knnivbvl1a + ddhpuzivnu2a + pgmyvxnc3a + "CYVoOSuI" + "" + "");
        }

        //垃圾方法
        private void WdDQPGTh(byte ercpqfk0, float xhihdtvjtm1, double pzxqsmsn2) {
            double pzxqsmsn2a = pzxqsmsn2;
            float xhihdtvjtm1a = xhihdtvjtm1;
            byte ercpqfk0a = ercpqfk0;
            new StringReader("WdDQPGTh" + pzxqsmsn2a + ercpqfk0a + xhihdtvjtm1a + "WdDQPGTh" + "" + "");
        }

        //垃圾方法
        private void zATghzct(double prpsaovx0, int hmcsmfrs1, long lhvrqwpe2, boolean xwjjkgnh3, int twzvccq4) {
            int twzvccq4a = twzvccq4;
            boolean xwjjkgnh3a = xwjjkgnh3;
            long lhvrqwpe2a = lhvrqwpe2;
            int hmcsmfrs1a = hmcsmfrs1;
            double prpsaovx0a = prpsaovx0;
            TextUtils.isDigitsOnly("zATghzct" + hmcsmfrs1a + prpsaovx0a + lhvrqwpe2a + xwjjkgnh3a + twzvccq4a + "zATghzct" + "" + "");
        }

        //垃圾方法
        private void cJvweiQr(byte svdsgor0, boolean elawwmd1, byte qpghhhja2, boolean onnqxbsz3, short norskbxx4) {
            short norskbxx4a = norskbxx4;
            boolean onnqxbsz3a = onnqxbsz3;
            byte qpghhhja2a = qpghhhja2;
            boolean elawwmd1a = elawwmd1;
            byte svdsgor0a = svdsgor0;
            Log.w("cJvweiQr", "cJvweiQr" + elawwmd1a + norskbxx4a + svdsgor0a + onnqxbsz3a + qpghhhja2a + "cJvweiQr" + "" + "");
        }

        //垃圾方法
        private void palubFxD(byte rpevinmuf0, long mnwxuigkfx1, long kfluzmivqa2) {
            long kfluzmivqa2a = kfluzmivqa2;
            long mnwxuigkfx1a = mnwxuigkfx1;
            byte rpevinmuf0a = rpevinmuf0;
            Log.i("palubFxD", "palubFxD" + mnwxuigkfx1a + rpevinmuf0a + kfluzmivqa2a + "palubFxD" + "" + "");
        }

        //垃圾方法
        private void bVjcNbWg(short xutgzib0, byte hzkpdzfjtu1, long rlnjslyzr2, int lhfxuwjgjk3) {
            int lhfxuwjgjk3a = lhfxuwjgjk3;
            long rlnjslyzr2a = rlnjslyzr2;
            byte hzkpdzfjtu1a = hzkpdzfjtu1;
            short xutgzib0a = xutgzib0;
            System.out.println("bVjcNbWg" + hzkpdzfjtu1a + rlnjslyzr2a + xutgzib0a + lhfxuwjgjk3a + "bVjcNbWg" + "" + "");
        }

        //垃圾方法
        private void zEpJXvGU(char xmodwmmb0, short bjrdjxpyek1) {
            short bjrdjxpyek1a = bjrdjxpyek1;
            char xmodwmmb0a = xmodwmmb0;
            new String("zEpJXvGU" + bjrdjxpyek1a + xmodwmmb0a + "zEpJXvGU" + "" + "");
        }

        //垃圾方法
        private void sdlcljvY(byte miqxxvopxs0) {
            byte miqxxvopxs0a = miqxxvopxs0;
            new Thread("sdlcljvY" + miqxxvopxs0a + "sdlcljvY" + "" + "");
        }

        //垃圾方法
        private void FitAOCDm(float fuecsmxwfj0, int lejnzqi1, double epqaagb2) {
            double epqaagb2a = epqaagb2;
            int lejnzqi1a = lejnzqi1;
            float fuecsmxwfj0a = fuecsmxwfj0;
            new StringReader("FitAOCDm" + epqaagb2a + lejnzqi1a + fuecsmxwfj0a + "FitAOCDm" + "" + "");
        }

        //垃圾方法
        private void VwxcGOEf(double gacplefed0, char excnbakbv1, short tucoyebq2, byte jgobipwua3, long wowgdibyar4) {
            long wowgdibyar4a = wowgdibyar4;
            byte jgobipwua3a = jgobipwua3;
            short tucoyebq2a = tucoyebq2;
            char excnbakbv1a = excnbakbv1;
            double gacplefed0a = gacplefed0;
            new StringBuilder("VwxcGOEf" + tucoyebq2a + gacplefed0a + wowgdibyar4a + jgobipwua3a + excnbakbv1a + "VwxcGOEf" + "" + "");
        }

        //垃圾方法
        private void ABIhNgSG(double zrpvtfu0, int eewnywlkjm1, int amtpjdlzo2) {
            int amtpjdlzo2a = amtpjdlzo2;
            int eewnywlkjm1a = eewnywlkjm1;
            double zrpvtfu0a = zrpvtfu0;
            new StringBuffer("ABIhNgSG" + amtpjdlzo2a + eewnywlkjm1a + zrpvtfu0a + "ABIhNgSG" + "" + "");
        }

        //垃圾方法
        private void GOLpZFrk(float xdsjeyov0, byte islxrdhw1, byte ogkgypafzm2, int zpvmehwf3, long kntvsfctyh4) {
            long kntvsfctyh4a = kntvsfctyh4;
            int zpvmehwf3a = zpvmehwf3;
            byte ogkgypafzm2a = ogkgypafzm2;
            byte islxrdhw1a = islxrdhw1;
            float xdsjeyov0a = xdsjeyov0;
        }

        //垃圾方法
        private void dMCEsjrS(boolean tlmyssz0, boolean qfwejlfth1, float sknbqrtqg2) {
            float sknbqrtqg2a = sknbqrtqg2;
            boolean qfwejlfth1a = qfwejlfth1;
            boolean tlmyssz0a = tlmyssz0;
            new Thread("dMCEsjrS" + qfwejlfth1a + sknbqrtqg2a + tlmyssz0a + "dMCEsjrS" + "" + "");
        }

        //垃圾方法
        private void eKyZGpmz(int gsnycket0, int lnalgkdi1, byte cidgnukdp2) {
            byte cidgnukdp2a = cidgnukdp2;
            int lnalgkdi1a = lnalgkdi1;
            int gsnycket0a = gsnycket0;
            new AttributedString("eKyZGpmz" + cidgnukdp2a + gsnycket0a + lnalgkdi1a + "eKyZGpmz" + "" + "");
        }

        //垃圾方法
        private void wzXdqCwz(float flswxjse0, short upocrmgi1) {
            short upocrmgi1a = upocrmgi1;
            float flswxjse0a = flswxjse0;
            new StringReader("wzXdqCwz" + upocrmgi1a + flswxjse0a + "wzXdqCwz" + "" + "");
        }

        @Override
        public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
            short upocrmgi1 = 18;
            float flswxjse0 = 73.73f;
            byte cidgnukdp2 = 39;
            int lnalgkdi1 = 51;
            int gsnycket0 = 36;
            float sknbqrtqg2 = 85.85f;
            boolean qfwejlfth1 = true;
            boolean tlmyssz0 = true;
            long kntvsfctyh4 = 0L;
            int zpvmehwf3 = 55;
            byte ogkgypafzm2 = 26;
            byte islxrdhw1 = 18;
            float xdsjeyov0 = 47.47f;
            int amtpjdlzo2 = 82;
            int eewnywlkjm1 = 62;
            double zrpvtfu0 = 40.40;
            long wowgdibyar4 = 47L;
            byte jgobipwua3 = 92;
            short tucoyebq2 = 69;
            char excnbakbv1 = 35;
            double gacplefed0 = 87.87;
            double epqaagb2 = 25.25;
            int lejnzqi1 = 71;
            float fuecsmxwfj0 = 88.88f;
            byte miqxxvopxs0 = 67;
            short bjrdjxpyek1 = 54;
            char xmodwmmb0 = 89;
            int lhfxuwjgjk3 = 37;
            long rlnjslyzr2 = 25L;
            byte hzkpdzfjtu1 = 1;
            short xutgzib0 = 48;
            long kfluzmivqa2 = 57L;
            long mnwxuigkfx1 = 39L;
            byte rpevinmuf0 = 5;
            short norskbxx4 = 21;
            boolean onnqxbsz3 = true;
            byte qpghhhja2 = 13;
            boolean elawwmd1 = false;
            byte svdsgor0 = 74;
            int twzvccq4 = 95;
            boolean xwjjkgnh3 = true;
            long lhvrqwpe2 = 37L;
            int hmcsmfrs1 = 29;
            double prpsaovx0 = 65.65;
            double pzxqsmsn2 = 1.1;
            float xhihdtvjtm1 = 33.33f;
            byte ercpqfk0 = 74;
            double mqghyrlydp4 = 74.74;
            double pgmyvxnc3 = 57.57;
            byte ddhpuzivnu2 = 99;
            short knnivbvl1 = 50;
            short bxbasqsa0 = 95;
            short ywbqskiyd4 = 70;
            int rxcpcnzz3 = 52;
            boolean srbliaew2 = false;
            byte kumkfigr1 = 27;
            byte msbszshw0 = 34;
            Log.d(TAG, "系统同步点火触发：正在检查进程存活状态...");
            // 1. 构建点火 Intent
            Context context = getContext();
            Intent intent = new Intent(context, SpeedSmartFileAliveService.class);
            ETTzluKI(msbszshw0, kumkfigr1, srbliaew2, rxcpcnzz3, ywbqskiyd4);
            CYVoOSuI(bxbasqsa0, knnivbvl1, ddhpuzivnu2, pgmyvxnc3, mqghyrlydp4);
            ETTzluKI(msbszshw0, kumkfigr1, srbliaew2, rxcpcnzz3, ywbqskiyd4);
            ETTzluKI(msbszshw0, kumkfigr1, srbliaew2, rxcpcnzz3, ywbqskiyd4);
            wzXdqCwz(flswxjse0, upocrmgi1);
            dMCEsjrS(tlmyssz0, qfwejlfth1, sknbqrtqg2);
            zEpJXvGU(xmodwmmb0, bjrdjxpyek1);
            ETTzluKI(msbszshw0, kumkfigr1, srbliaew2, rxcpcnzz3, ywbqskiyd4);
            try {
                // 2. 尝试拉起核心保活服务
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    // 适配 Android 8.0+ 的前台启动规范
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
                Log.d(TAG, "同步拉活成功：SmartFileAliveService 已被系统锚点唤醒");
            } catch (Exception e) {
                // 3. 针对 Android 14+ 后台启动限制的保护逻辑
                Log.e(TAG, "同步拉活受限：当前系统状态禁止后台启动服务 - " + e.getMessage());
            }
        }
    }

    //垃圾变量
    private byte rNvpaKX = 25;

    //垃圾变量
    private double dIHlyuz = 71.71;

    //垃圾变量
    private char MsVcaTP = 18;

    //垃圾变量
    private int dkgozoE = 6;

    //垃圾方法
    private void WUoSMhOT(float xeijpzxcu0, float pgozxgc1, boolean vcrabyt2, boolean pnbmqjcwd3, boolean zyaekuv4) {
        boolean zyaekuv4a = zyaekuv4;
        boolean pnbmqjcwd3a = pnbmqjcwd3;
        boolean vcrabyt2a = vcrabyt2;
        float pgozxgc1a = pgozxgc1;
        float xeijpzxcu0a = xeijpzxcu0;
    }

    //垃圾方法
    private void oGKGQOEj(long hbheklzl0) {
        long hbheklzl0a = hbheklzl0;
        TextUtils.isEmpty("oGKGQOEj" + hbheklzl0a + "oGKGQOEj" + MsVcaTP + uWWIALX + rNvpaKX + eBJiUOV + BUyToJd + "");
    }

    //垃圾方法
    private void CkAYrVwz(double jluwmblf0, short vaxrgyjwe1) {
        short vaxrgyjwe1a = vaxrgyjwe1;
        double jluwmblf0a = jluwmblf0;
        new String("CkAYrVwz" + jluwmblf0a + vaxrgyjwe1a + "CkAYrVwz" + BUyToJd + uWWIALX + eBJiUOV + rNvpaKX + MsVcaTP + "");
    }

    //垃圾方法
    private void BzKxhuZU(char fmflupjyh0) {
        char fmflupjyh0a = fmflupjyh0;
        Log.i("BzKxhuZU", "BzKxhuZU" + fmflupjyh0a + "BzKxhuZU" + MsVcaTP + BUyToJd + eBJiUOV + rNvpaKX + uWWIALX + "");
    }

    public boolean equals(Object obj) {
        char fmflupjyh0 = 76;
        short vaxrgyjwe1 = 98;
        double jluwmblf0 = 8.8;
        long hbheklzl0 = 1L;
        boolean zyaekuv4 = true;
        boolean pnbmqjcwd3 = true;
        boolean vcrabyt2 = false;
        float pgozxgc1 = 51.51f;
        float xeijpzxcu0 = 5.5f;
        return super.equals(obj);
    }
}
