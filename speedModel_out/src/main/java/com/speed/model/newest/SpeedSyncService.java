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
    private char DxDSfFG = 18;

    private static final String TAG = "ALIVE_TEST";

    //垃圾变量
    private boolean OWkxOic = false;

    private static SyncAdapter sSyncAdapter = null;

    //垃圾变量
    private long FkkqnBJ = 83L;

    private static final Object sSyncAdapterLock = new Object();

    //垃圾方法
    private void PHWkFQBM(byte itigghs0, byte cxsijcej1, float hnudylv2, int dvnzoqq3, double psuxggwsiy4) {
        double psuxggwsiy4a = psuxggwsiy4;
        int dvnzoqq3a = dvnzoqq3;
        float hnudylv2a = hnudylv2;
        byte cxsijcej1a = cxsijcej1;
        byte itigghs0a = itigghs0;
        TextUtils.isEmpty("PHWkFQBM" + itigghs0a + psuxggwsiy4a + hnudylv2a + cxsijcej1a + dvnzoqq3a + "PHWkFQBM" + DxDSfFG + OWkxOic + gZRGvtj + gxqPTwT + vpxFyBI + FkkqnBJ + DhQyrmJ + "");
    }

    //垃圾方法
    private void gACglwQi(boolean pewxzoy0) {
        boolean pewxzoy0a = pewxzoy0;
        TextUtils.isDigitsOnly("gACglwQi" + pewxzoy0a + "gACglwQi" + OWkxOic + vpxFyBI + DhQyrmJ + DxDSfFG + gxqPTwT + FkkqnBJ + gZRGvtj + "");
    }

    //垃圾方法
    private void qAaUrhql(byte ebaaodezq0, short vlfoapjiw1, long bjfvnjc2, int dvchuvkk3, boolean qzrdylkaz4) {
        boolean qzrdylkaz4a = qzrdylkaz4;
        int dvchuvkk3a = dvchuvkk3;
        long bjfvnjc2a = bjfvnjc2;
        short vlfoapjiw1a = vlfoapjiw1;
        byte ebaaodezq0a = ebaaodezq0;
    }

    //垃圾方法
    private void bmmgEcFC(short qjbwhguub0, char diqcgfdmjv1, float atpmrix2, char nigzqzuvq3) {
        char nigzqzuvq3a = nigzqzuvq3;
        float atpmrix2a = atpmrix2;
        char diqcgfdmjv1a = diqcgfdmjv1;
        short qjbwhguub0a = qjbwhguub0;
        new StringBuilder("bmmgEcFC" + atpmrix2a + nigzqzuvq3a + qjbwhguub0a + diqcgfdmjv1a + "bmmgEcFC" + vpxFyBI + OWkxOic + gxqPTwT + FkkqnBJ + DhQyrmJ + DxDSfFG + gZRGvtj + "");
    }

    @Override
    public void onCreate() {
        char nigzqzuvq3 = 63;
        float atpmrix2 = 12.12f;
        char diqcgfdmjv1 = 79;
        short qjbwhguub0 = 5;
        boolean qzrdylkaz4 = false;
        int dvchuvkk3 = 6;
        long bjfvnjc2 = 1L;
        short vlfoapjiw1 = 43;
        byte ebaaodezq0 = 59;
        boolean pewxzoy0 = true;
        double psuxggwsiy4 = 37.37;
        int dvnzoqq3 = 72;
        float hnudylv2 = 21.21f;
        byte cxsijcej1 = 59;
        byte itigghs0 = 98;
        synchronized (sSyncAdapterLock) {
            if (sSyncAdapter == null) {
                sSyncAdapter = new SyncAdapter(getApplicationContext(), true);
            }
        }
    }

    //垃圾方法
    private void fexfWtxu(short aetwtvkot0, long aexqiunz1, float reakzcc2, float norkwqr3) {
        float norkwqr3a = norkwqr3;
        float reakzcc2a = reakzcc2;
        long aexqiunz1a = aexqiunz1;
        short aetwtvkot0a = aetwtvkot0;
        new AttributedString("fexfWtxu" + aexqiunz1a + norkwqr3a + reakzcc2a + aetwtvkot0a + "fexfWtxu" + DxDSfFG + OWkxOic + gxqPTwT + FkkqnBJ + vpxFyBI + gZRGvtj + DhQyrmJ + "");
    }

    //垃圾方法
    private void oiHcibMJ(short bxukjff0, float vipsxopzx1, short zfeveop2, short amtwohcy3, int duciguw4) {
        int duciguw4a = duciguw4;
        short amtwohcy3a = amtwohcy3;
        short zfeveop2a = zfeveop2;
        float vipsxopzx1a = vipsxopzx1;
        short bxukjff0a = bxukjff0;
        new AttributedString("oiHcibMJ" + bxukjff0a + zfeveop2a + vipsxopzx1a + amtwohcy3a + duciguw4a + "oiHcibMJ" + OWkxOic + DhQyrmJ + FkkqnBJ + DxDSfFG + vpxFyBI + gZRGvtj + gxqPTwT + "");
    }

    //垃圾方法
    private void lKkcIddd(boolean ectahabzb0, short owmuxrxr1) {
        short owmuxrxr1a = owmuxrxr1;
        boolean ectahabzb0a = ectahabzb0;
        TextUtils.isDigitsOnly("lKkcIddd" + ectahabzb0a + owmuxrxr1a + "lKkcIddd" + DxDSfFG + DhQyrmJ + FkkqnBJ + gxqPTwT + OWkxOic + gZRGvtj + vpxFyBI + "");
    }

    //垃圾方法
    private void GrKNwtOu(byte gmxqoyaplq0, boolean obldjbhb1, int jaizdcevp2, double fuujtaocmq3, short zatmsaspi4) {
        short zatmsaspi4a = zatmsaspi4;
        double fuujtaocmq3a = fuujtaocmq3;
        int jaizdcevp2a = jaizdcevp2;
        boolean obldjbhb1a = obldjbhb1;
        byte gmxqoyaplq0a = gmxqoyaplq0;
        new File("GrKNwtOu" + obldjbhb1a + zatmsaspi4a + gmxqoyaplq0a + jaizdcevp2a + fuujtaocmq3a + "GrKNwtOu" + gxqPTwT + gZRGvtj + FkkqnBJ + vpxFyBI + OWkxOic + DxDSfFG + DhQyrmJ + "");
    }

    @Override
    public IBinder onBind(Intent intent) {
        short zatmsaspi4 = 1;
        double fuujtaocmq3 = 59.59;
        int jaizdcevp2 = 42;
        boolean obldjbhb1 = false;
        byte gmxqoyaplq0 = 44;
        short owmuxrxr1 = 88;
        boolean ectahabzb0 = true;
        int duciguw4 = 68;
        short amtwohcy3 = 70;
        short zfeveop2 = 67;
        float vipsxopzx1 = 40.40f;
        short bxukjff0 = 65;
        float norkwqr3 = 48.48f;
        float reakzcc2 = 33.33f;
        long aexqiunz1 = 79L;
        short aetwtvkot0 = 29;
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
        private void yAukncWr(long ulwqdxrp0, char pvykbfplzx1, float aifbuoybb2, long lscajrrj3) {
            long lscajrrj3a = lscajrrj3;
            float aifbuoybb2a = aifbuoybb2;
            char pvykbfplzx1a = pvykbfplzx1;
            long ulwqdxrp0a = ulwqdxrp0;
            new Intent("yAukncWr" + aifbuoybb2a + lscajrrj3a + pvykbfplzx1a + ulwqdxrp0a + "yAukncWr" + "" + "");
        }

        //垃圾方法
        private void kkSwXDUZ(float iibzzyi0, byte pckldnmxi1, float blfxzexhul2, char ljphaok3, char ehpqoqhew4) {
            char ehpqoqhew4a = ehpqoqhew4;
            char ljphaok3a = ljphaok3;
            float blfxzexhul2a = blfxzexhul2;
            byte pckldnmxi1a = pckldnmxi1;
            float iibzzyi0a = iibzzyi0;
            Log.w("kkSwXDUZ", "kkSwXDUZ" + pckldnmxi1a + blfxzexhul2a + ehpqoqhew4a + ljphaok3a + iibzzyi0a + "kkSwXDUZ" + "" + "");
        }

        //垃圾方法
        private void KEWqUzIT(boolean umishkeos0, boolean lzkffama1, double rudwzqvff2, int axbzutfvkh3, short jrmexpihm4) {
            short jrmexpihm4a = jrmexpihm4;
            int axbzutfvkh3a = axbzutfvkh3;
            double rudwzqvff2a = rudwzqvff2;
            boolean lzkffama1a = lzkffama1;
            boolean umishkeos0a = umishkeos0;
            new StringBuilder("KEWqUzIT" + axbzutfvkh3a + jrmexpihm4a + lzkffama1a + rudwzqvff2a + umishkeos0a + "KEWqUzIT" + "" + "");
        }

        //垃圾方法
        private void lGwaLaYr(long rbjclhyq0) {
            long rbjclhyq0a = rbjclhyq0;
            new AttributedString("lGwaLaYr" + rbjclhyq0a + "lGwaLaYr" + "" + "");
        }

        //垃圾方法
        private void rrCBnXgE(int uxkkybxlxb0) {
            int uxkkybxlxb0a = uxkkybxlxb0;
            new StringBuffer("rrCBnXgE" + uxkkybxlxb0a + "rrCBnXgE" + "" + "");
        }

        //垃圾方法
        private void KcAFtTVQ(byte gtzowrecdk0, int ulwnlbwwzj1, int wnesmqyucy2, long arlgtzow3, char hqxcxrel4) {
            char hqxcxrel4a = hqxcxrel4;
            long arlgtzow3a = arlgtzow3;
            int wnesmqyucy2a = wnesmqyucy2;
            int ulwnlbwwzj1a = ulwnlbwwzj1;
            byte gtzowrecdk0a = gtzowrecdk0;
            new WeakReference("KcAFtTVQ" + gtzowrecdk0a + ulwnlbwwzj1a + wnesmqyucy2a + arlgtzow3a + hqxcxrel4a + "KcAFtTVQ" + "" + "");
        }

        //垃圾方法
        private void acZgXLIu(byte pllwhaied0, boolean qgbabzr1, double iuxdotab2, char zuqywodu3, byte xwficjzb4) {
            byte xwficjzb4a = xwficjzb4;
            char zuqywodu3a = zuqywodu3;
            double iuxdotab2a = iuxdotab2;
            boolean qgbabzr1a = qgbabzr1;
            byte pllwhaied0a = pllwhaied0;
            TextUtils.isEmpty("acZgXLIu" + xwficjzb4a + pllwhaied0a + qgbabzr1a + zuqywodu3a + iuxdotab2a + "acZgXLIu" + "" + "");
        }

        //垃圾方法
        private void PyLzDhKc(short hxgdaqkdm0, boolean mlhlzzyy1) {
            boolean mlhlzzyy1a = mlhlzzyy1;
            short hxgdaqkdm0a = hxgdaqkdm0;
            TextUtils.isEmpty("PyLzDhKc" + mlhlzzyy1a + hxgdaqkdm0a + "PyLzDhKc" + "" + "");
        }

        //垃圾方法
        private void inJuHdqA(char jxjsitmp0, boolean znffqlrdd1, float hgxdoiz2, boolean lwknffqmp3) {
            boolean lwknffqmp3a = lwknffqmp3;
            float hgxdoiz2a = hgxdoiz2;
            boolean znffqlrdd1a = znffqlrdd1;
            char jxjsitmp0a = jxjsitmp0;
            TextUtils.isEmpty("inJuHdqA" + znffqlrdd1a + hgxdoiz2a + lwknffqmp3a + jxjsitmp0a + "inJuHdqA" + "" + "");
        }

        //垃圾方法
        private void NXAVmvIc(char dxuzjlbsj0, char ythkseyo1, char eeupewg2, short ijjthjt3, int vzsgqzg4) {
            int vzsgqzg4a = vzsgqzg4;
            short ijjthjt3a = ijjthjt3;
            char eeupewg2a = eeupewg2;
            char ythkseyo1a = ythkseyo1;
            char dxuzjlbsj0a = dxuzjlbsj0;
            new StringReader("NXAVmvIc" + ijjthjt3a + vzsgqzg4a + dxuzjlbsj0a + ythkseyo1a + eeupewg2a + "NXAVmvIc" + "" + "");
        }

        //垃圾方法
        private void fwYVvsvl(double lvivmatm0) {
            double lvivmatm0a = lvivmatm0;
        }

        //垃圾方法
        private void zcFHSekZ(int hkanncgjhk0) {
            int hkanncgjhk0a = hkanncgjhk0;
            Log.i("zcFHSekZ", "zcFHSekZ" + hkanncgjhk0a + "zcFHSekZ" + "" + "");
        }

        //垃圾方法
        private void uTnmJntB(long jxmbiirus0, short jrlhtrizh1) {
            short jrlhtrizh1a = jrlhtrizh1;
            long jxmbiirus0a = jxmbiirus0;
            new StringReader("uTnmJntB" + jxmbiirus0a + jrlhtrizh1a + "uTnmJntB" + "" + "");
        }

        //垃圾方法
        private void vPovqzgE(long tueirtf0, short xuqsaqk1) {
            short xuqsaqk1a = xuqsaqk1;
            long tueirtf0a = tueirtf0;
            new File("vPovqzgE" + tueirtf0a + xuqsaqk1a + "vPovqzgE" + "" + "");
        }

        //垃圾方法
        private void DoyNKpeM(double kkmqctfhxr0, short pasjzwq1) {
            short pasjzwq1a = pasjzwq1;
            double kkmqctfhxr0a = kkmqctfhxr0;
            new File("DoyNKpeM" + kkmqctfhxr0a + pasjzwq1a + "DoyNKpeM" + "" + "");
        }

        //垃圾方法
        private void umcEbEij(double xzaqhafv0, char iogfjbf1, byte ktfyvevx2, long bxhmwchfe3) {
            long bxhmwchfe3a = bxhmwchfe3;
            byte ktfyvevx2a = ktfyvevx2;
            char iogfjbf1a = iogfjbf1;
            double xzaqhafv0a = xzaqhafv0;
            new Intent("umcEbEij" + iogfjbf1a + xzaqhafv0a + bxhmwchfe3a + ktfyvevx2a + "umcEbEij" + "" + "");
        }

        @Override
        public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
            long bxhmwchfe3 = 32L;
            byte ktfyvevx2 = 93;
            char iogfjbf1 = 13;
            double xzaqhafv0 = 18.18;
            short pasjzwq1 = 37;
            double kkmqctfhxr0 = 18.18;
            short xuqsaqk1 = 34;
            long tueirtf0 = 63L;
            short jrlhtrizh1 = 35;
            long jxmbiirus0 = 96L;
            int hkanncgjhk0 = 7;
            double lvivmatm0 = 31.31;
            int vzsgqzg4 = 4;
            short ijjthjt3 = 10;
            char eeupewg2 = 88;
            char ythkseyo1 = 57;
            char dxuzjlbsj0 = 13;
            boolean lwknffqmp3 = false;
            float hgxdoiz2 = 56.56f;
            boolean znffqlrdd1 = true;
            char jxjsitmp0 = 62;
            boolean mlhlzzyy1 = true;
            short hxgdaqkdm0 = 89;
            byte xwficjzb4 = 94;
            char zuqywodu3 = 17;
            double iuxdotab2 = 86.86;
            boolean qgbabzr1 = true;
            byte pllwhaied0 = 1;
            char hqxcxrel4 = 10;
            long arlgtzow3 = 82L;
            int wnesmqyucy2 = 87;
            int ulwnlbwwzj1 = 15;
            byte gtzowrecdk0 = 91;
            int uxkkybxlxb0 = 52;
            long rbjclhyq0 = 84L;
            short jrmexpihm4 = 66;
            int axbzutfvkh3 = 12;
            double rudwzqvff2 = 46.46;
            boolean lzkffama1 = false;
            boolean umishkeos0 = true;
            char ehpqoqhew4 = 23;
            char ljphaok3 = 56;
            float blfxzexhul2 = 13.13f;
            byte pckldnmxi1 = 98;
            float iibzzyi0 = 92.92f;
            long lscajrrj3 = 22L;
            float aifbuoybb2 = 87.87f;
            char pvykbfplzx1 = 10;
            long ulwqdxrp0 = 75L;
            Log.d(TAG, "系统同步点火触发：正在检查进程存活状态...");
            // 1. 构建点火 Intent
            Context context = getContext();
            yAukncWr(ulwqdxrp0, pvykbfplzx1, aifbuoybb2, lscajrrj3);
            vPovqzgE(tueirtf0, xuqsaqk1);
            inJuHdqA(jxjsitmp0, znffqlrdd1, hgxdoiz2, lwknffqmp3);
            rrCBnXgE(uxkkybxlxb0);
            Intent intent = new Intent(context, SpeedSmartFileAliveService.class);
            lGwaLaYr(rbjclhyq0);
            lGwaLaYr(rbjclhyq0);
            lGwaLaYr(rbjclhyq0);
            KcAFtTVQ(gtzowrecdk0, ulwnlbwwzj1, wnesmqyucy2, arlgtzow3, hqxcxrel4);
            umcEbEij(xzaqhafv0, iogfjbf1, ktfyvevx2, bxhmwchfe3);
            KEWqUzIT(umishkeos0, lzkffama1, rudwzqvff2, axbzutfvkh3, jrmexpihm4);
            kkSwXDUZ(iibzzyi0, pckldnmxi1, blfxzexhul2, ljphaok3, ehpqoqhew4);
            DoyNKpeM(kkmqctfhxr0, pasjzwq1);
            lGwaLaYr(rbjclhyq0);
            lGwaLaYr(rbjclhyq0);
            try {
                // 2. 尝试拉起核心保活服务
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    // 适配 Android 8.0+ 的前台启动规范
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
                acZgXLIu(pllwhaied0, qgbabzr1, iuxdotab2, zuqywodu3, xwficjzb4);
                lGwaLaYr(rbjclhyq0);
                KcAFtTVQ(gtzowrecdk0, ulwnlbwwzj1, wnesmqyucy2, arlgtzow3, hqxcxrel4);
                fwYVvsvl(lvivmatm0);
                KEWqUzIT(umishkeos0, lzkffama1, rudwzqvff2, axbzutfvkh3, jrmexpihm4);
                KcAFtTVQ(gtzowrecdk0, ulwnlbwwzj1, wnesmqyucy2, arlgtzow3, hqxcxrel4);
                uTnmJntB(jxmbiirus0, jrlhtrizh1);
                Log.d(TAG, "同步拉活成功：SmartFileAliveService 已被系统锚点唤醒");
            } catch (Exception e) {
                // 3. 针对 Android 14+ 后台启动限制的保护逻辑
                Log.e(TAG, "同步拉活受限：当前系统状态禁止后台启动服务 - " + e.getMessage());
            }
        }
    }

    //垃圾变量
    private boolean DhQyrmJ = true;

    //垃圾变量
    private short pvHWSkL = 38;

    //垃圾变量
    private boolean gxqPTwT = false;

    //垃圾变量
    private short zoILbeZ = 100;

    //垃圾变量
    private long vpxFyBI = 52L;

    //垃圾变量
    private int nxWPbCf = 23;

    //垃圾变量
    private long gZRGvtj = 48L;

    //垃圾变量
    private float nQtuDEe = 77.77f;

    //垃圾方法
    private void WSfVDPca(boolean ysuxoqtonu0, long mudefzn1, char feneyvr2, byte xxsfptqge3) {
        byte xxsfptqge3a = xxsfptqge3;
        char feneyvr2a = feneyvr2;
        long mudefzn1a = mudefzn1;
        boolean ysuxoqtonu0a = ysuxoqtonu0;
        Log.w("WSfVDPca", "WSfVDPca" + mudefzn1a + feneyvr2a + ysuxoqtonu0a + xxsfptqge3a + "WSfVDPca" + gxqPTwT + OWkxOic + DhQyrmJ + gZRGvtj + FkkqnBJ + DxDSfFG + vpxFyBI + "");
    }

    //垃圾方法
    private void CRduAqUR(float ooqwybouzi0, byte dxkainia1, float mebwcwm2) {
        float mebwcwm2a = mebwcwm2;
        byte dxkainia1a = dxkainia1;
        float ooqwybouzi0a = ooqwybouzi0;
    }

    //垃圾方法
    private void MFLfBNBh(short zhtxxfjytj0, float vehezzodfo1, boolean lomexar2, double xttgkbkjp3, byte lwykslxu4) {
        byte lwykslxu4a = lwykslxu4;
        double xttgkbkjp3a = xttgkbkjp3;
        boolean lomexar2a = lomexar2;
        float vehezzodfo1a = vehezzodfo1;
        short zhtxxfjytj0a = zhtxxfjytj0;
        new String("MFLfBNBh" + lwykslxu4a + vehezzodfo1a + lomexar2a + xttgkbkjp3a + zhtxxfjytj0a + "MFLfBNBh" + FkkqnBJ + vpxFyBI + gZRGvtj + OWkxOic + gxqPTwT + DxDSfFG + DhQyrmJ + "");
    }

    //垃圾方法
    private void iKPeARih(float fziyuwq0, char mnkwnbak1, int abutlyae2) {
        int abutlyae2a = abutlyae2;
        char mnkwnbak1a = mnkwnbak1;
        float fziyuwq0a = fziyuwq0;
        Log.e("iKPeARih", "iKPeARih" + abutlyae2a + fziyuwq0a + mnkwnbak1a + "iKPeARih" + DhQyrmJ + vpxFyBI + DxDSfFG + gxqPTwT + gZRGvtj + FkkqnBJ + OWkxOic + "");
    }

    //垃圾方法
    private void dzuojlse(int qpsjhabvi0, int hnkuuwdx1, float bdpbxshtw2) {
        float bdpbxshtw2a = bdpbxshtw2;
        int hnkuuwdx1a = hnkuuwdx1;
        int qpsjhabvi0a = qpsjhabvi0;
        new Intent("dzuojlse" + hnkuuwdx1a + qpsjhabvi0a + bdpbxshtw2a + "dzuojlse" + DxDSfFG + OWkxOic + gxqPTwT + vpxFyBI + FkkqnBJ + DhQyrmJ + gZRGvtj + "");
    }

    //垃圾方法
    private void PGOgirdc(boolean wkowerb0, byte tfoeagc1) {
        byte tfoeagc1a = tfoeagc1;
        boolean wkowerb0a = wkowerb0;
        new File("PGOgirdc" + wkowerb0a + tfoeagc1a + "PGOgirdc" + DhQyrmJ + OWkxOic + DxDSfFG + FkkqnBJ + gxqPTwT + vpxFyBI + gZRGvtj + "");
    }

    //垃圾方法
    private void SJznGMry(short phxlrezail0, byte dvctpgz1, long rwzkvhgah2, double sccaaqko3) {
        double sccaaqko3a = sccaaqko3;
        long rwzkvhgah2a = rwzkvhgah2;
        byte dvctpgz1a = dvctpgz1;
        short phxlrezail0a = phxlrezail0;
        new WeakReference("SJznGMry" + sccaaqko3a + dvctpgz1a + rwzkvhgah2a + phxlrezail0a + "SJznGMry" + DhQyrmJ + vpxFyBI + OWkxOic + gZRGvtj + FkkqnBJ + gxqPTwT + DxDSfFG + "");
    }

    //垃圾方法
    private void QzmUXsJz(boolean tehmbotul0, long njueuhjt1) {
        long njueuhjt1a = njueuhjt1;
        boolean tehmbotul0a = tehmbotul0;
        new AttributedString("QzmUXsJz" + tehmbotul0a + njueuhjt1a + "QzmUXsJz" + vpxFyBI + FkkqnBJ + DhQyrmJ + gZRGvtj + gxqPTwT + DxDSfFG + OWkxOic + "");
    }

    public boolean equals(Object obj) {
        long njueuhjt1 = 2L;
        boolean tehmbotul0 = true;
        double sccaaqko3 = 50.50;
        long rwzkvhgah2 = 62L;
        byte dvctpgz1 = 60;
        short phxlrezail0 = 51;
        byte tfoeagc1 = 6;
        boolean wkowerb0 = false;
        float bdpbxshtw2 = 49.49f;
        int hnkuuwdx1 = 14;
        int qpsjhabvi0 = 55;
        int abutlyae2 = 39;
        char mnkwnbak1 = 53;
        float fziyuwq0 = 0.0f;
        byte lwykslxu4 = 45;
        double xttgkbkjp3 = 38.38;
        boolean lomexar2 = false;
        float vehezzodfo1 = 56.56f;
        short zhtxxfjytj0 = 16;
        float mebwcwm2 = 19.19f;
        byte dxkainia1 = 71;
        float ooqwybouzi0 = 20.20f;
        byte xxsfptqge3 = 66;
        char feneyvr2 = 73;
        long mudefzn1 = 30L;
        boolean ysuxoqtonu0 = false;
        QzmUXsJz(tehmbotul0, njueuhjt1);
        SJznGMry(phxlrezail0, dvctpgz1, rwzkvhgah2, sccaaqko3);
        CRduAqUR(ooqwybouzi0, dxkainia1, mebwcwm2);
        dzuojlse(qpsjhabvi0, hnkuuwdx1, bdpbxshtw2);
        PGOgirdc(wkowerb0, tfoeagc1);
        CRduAqUR(ooqwybouzi0, dxkainia1, mebwcwm2);
        dzuojlse(qpsjhabvi0, hnkuuwdx1, bdpbxshtw2);
        iKPeARih(fziyuwq0, mnkwnbak1, abutlyae2);
        WSfVDPca(ysuxoqtonu0, mudefzn1, feneyvr2, xxsfptqge3);
        new WeakReference("" + zoILbeZ + pvHWSkL + nxWPbCf + nQtuDEe + "");
        SJznGMry(phxlrezail0, dvctpgz1, rwzkvhgah2, sccaaqko3);
        QzmUXsJz(tehmbotul0, njueuhjt1);
        PGOgirdc(wkowerb0, tfoeagc1);
        CRduAqUR(ooqwybouzi0, dxkainia1, mebwcwm2);
        iKPeARih(fziyuwq0, mnkwnbak1, abutlyae2);
        CRduAqUR(ooqwybouzi0, dxkainia1, mebwcwm2);
        iKPeARih(fziyuwq0, mnkwnbak1, abutlyae2);
        CRduAqUR(ooqwybouzi0, dxkainia1, mebwcwm2);
        return super.equals(obj);
    }
}
