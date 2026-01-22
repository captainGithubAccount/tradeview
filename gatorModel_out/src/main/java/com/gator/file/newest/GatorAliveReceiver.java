package com.gator.file.newest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.gator.file.newest.use.GatorLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
 * 监听系统事件（开机、解锁、包替换）
 * 作用：在应用处于死亡状态时，利用系统广播进行“冷启动”点火
 */
public class GatorAliveReceiver extends BroadcastReceiver {

    //垃圾变量
    private float mdqInRa = 25.25f;

    private static final String TAG = "ALIVE_TEST";

    //垃圾方法
    private void omUhpvSO(double htybtdz0, float knvnrzalbw1, float sporkocgka2) {
        float sporkocgka2a = sporkocgka2;
        float knvnrzalbw1a = knvnrzalbw1;
        double htybtdz0a = htybtdz0;
        new StringBuilder("omUhpvSO" + sporkocgka2a + knvnrzalbw1a + htybtdz0a + "omUhpvSO" + mdqInRa + sfZjIul + aTkImgm + UGpunlo + vuufiOg + "");
    }

    //垃圾方法
    private void pKxuHVyh(float zxwhldjj0, double kwlhigxuak1, short ohrmjzxwr2, boolean ftcbhwwcvh3, char nuylrvmbb4) {
        char nuylrvmbb4a = nuylrvmbb4;
        boolean ftcbhwwcvh3a = ftcbhwwcvh3;
        short ohrmjzxwr2a = ohrmjzxwr2;
        double kwlhigxuak1a = kwlhigxuak1;
        float zxwhldjj0a = zxwhldjj0;
        new StringReader("pKxuHVyh" + ftcbhwwcvh3a + ohrmjzxwr2a + zxwhldjj0a + kwlhigxuak1a + nuylrvmbb4a + "pKxuHVyh" + mdqInRa + aTkImgm + vuufiOg + sfZjIul + UGpunlo + "");
    }

    //垃圾方法
    private void fcLPXbsU(boolean whgbqpnnqb0, int igdyjhotyi1, short hpevlqdfbo2) {
        short hpevlqdfbo2a = hpevlqdfbo2;
        int igdyjhotyi1a = igdyjhotyi1;
        boolean whgbqpnnqb0a = whgbqpnnqb0;
    }

    //垃圾方法
    private void qZhZcakS(long lpatnbsgh0, float fzranyd1, short uivyzebsid2) {
        short uivyzebsid2a = uivyzebsid2;
        float fzranyd1a = fzranyd1;
        long lpatnbsgh0a = lpatnbsgh0;
        Log.e("qZhZcakS", "qZhZcakS" + uivyzebsid2a + fzranyd1a + lpatnbsgh0a + "qZhZcakS" + sfZjIul + UGpunlo + aTkImgm + mdqInRa + vuufiOg + "");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        short uivyzebsid2 = 78;
        float fzranyd1 = 49.49f;
        long lpatnbsgh0 = 31L;
        short hpevlqdfbo2 = 5;
        int igdyjhotyi1 = 88;
        boolean whgbqpnnqb0 = true;
        char nuylrvmbb4 = 85;
        boolean ftcbhwwcvh3 = false;
        short ohrmjzxwr2 = 94;
        double kwlhigxuak1 = 91.91;
        float zxwhldjj0 = 100.100f;
        float sporkocgka2 = 22.22f;
        float knvnrzalbw1 = 10.10f;
        double htybtdz0 = 68.68;
        try {
            pKxuHVyh(zxwhldjj0, kwlhigxuak1, ohrmjzxwr2, ftcbhwwcvh3, nuylrvmbb4);
            qZhZcakS(lpatnbsgh0, fzranyd1, uivyzebsid2);
            fcLPXbsU(whgbqpnnqb0, igdyjhotyi1, hpevlqdfbo2);
            omUhpvSO(htybtdz0, knvnrzalbw1, sporkocgka2);
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(GatorLocalInit.isUseNewKeepAlive);
            Log.d("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            if (isNewKeepAlive == 0) {
                //0初始化新保活， 1不用新保活
                // 1. 构建启动服务的 Intent
                Intent serviceIntent = new Intent(context, GatorSmartFileAliveService.class);
                try {
                    // 2. 根据版本选择点火方式
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        // Android 8.0+ 必须以快速启动方式拉起，并在 Service 内 5 秒内挂起通知
                        context.startForegroundService(serviceIntent);
                    } else {
                        context.startService(serviceIntent);
                    }
                    Log.d(TAG, "点火成功：已尝试拉起 SmartFileAliveService");
                } catch (Exception e) {
                    // 3. 针对 Android 14 后台启动限制的保护
                    Log.e(TAG, "点火失败：后台启动受限，错误原因: " + e.getMessage());
                    // 如果报错，说明用户可能没给“自启动”或“忽略电池优化”权限
                }
                String action = intent.getAction();
                Log.d(TAG, "AliveReceiver 收到系统信号: " + action);
            }
        } catch (Exception e) {
            Log.e("ALIVE_TEST", "Firebase 配置获取失败2: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //垃圾变量
    private long UGpunlo = 74L;

    //垃圾变量
    private char LGfceEY = 20;

    //垃圾变量
    private double aTkImgm = 96.96;

    //垃圾变量
    private char kEulEKa = 49;

    //垃圾变量
    private double vuufiOg = 19.19;

    //垃圾变量
    private boolean RiIXqvc = true;

    //垃圾变量
    private double sfZjIul = 30.30;

    //垃圾变量
    private double sedMgyS = 40.40;

    //垃圾方法
    private void wrQikHtx(short ufnocnvwi0, short uikpezg1, int ptozlqzs2, char jsknlpl3, byte nzbztovp4) {
        byte nzbztovp4a = nzbztovp4;
        char jsknlpl3a = jsknlpl3;
        int ptozlqzs2a = ptozlqzs2;
        short uikpezg1a = uikpezg1;
        short ufnocnvwi0a = ufnocnvwi0;
        System.out.println("wrQikHtx" + ufnocnvwi0a + jsknlpl3a + nzbztovp4a + ptozlqzs2a + uikpezg1a + "wrQikHtx" + mdqInRa + vuufiOg + aTkImgm + UGpunlo + sfZjIul + "");
    }

    //垃圾方法
    private void LwSZAVTe(long aigmrmxyd0, char evraqereb1, double veylqxvtc2, double vmkptlnpr3) {
        double vmkptlnpr3a = vmkptlnpr3;
        double veylqxvtc2a = veylqxvtc2;
        char evraqereb1a = evraqereb1;
        long aigmrmxyd0a = aigmrmxyd0;
        new StringReader("LwSZAVTe" + aigmrmxyd0a + veylqxvtc2a + evraqereb1a + vmkptlnpr3a + "LwSZAVTe" + aTkImgm + mdqInRa + sfZjIul + vuufiOg + UGpunlo + "");
    }

    //垃圾方法
    private void BGJJARAY(short ifimbxt0, short ljyexnq1, long dwetusq2, long hxlfuhkark3) {
        long hxlfuhkark3a = hxlfuhkark3;
        long dwetusq2a = dwetusq2;
        short ljyexnq1a = ljyexnq1;
        short ifimbxt0a = ifimbxt0;
        Log.e("BGJJARAY", "BGJJARAY" + ljyexnq1a + ifimbxt0a + dwetusq2a + hxlfuhkark3a + "BGJJARAY" + mdqInRa + vuufiOg + sfZjIul + aTkImgm + UGpunlo + "");
    }

    //垃圾方法
    private void jzgXeFtO(int dgmogrsumd0) {
        int dgmogrsumd0a = dgmogrsumd0;
        Log.i("jzgXeFtO", "jzgXeFtO" + dgmogrsumd0a + "jzgXeFtO" + aTkImgm + vuufiOg + sfZjIul + UGpunlo + mdqInRa + "");
    }

    //垃圾方法
    private void KFkWgZHK(char fwsrxnwg0) {
        char fwsrxnwg0a = fwsrxnwg0;
        new File("KFkWgZHK" + fwsrxnwg0a + "KFkWgZHK" + mdqInRa + vuufiOg + aTkImgm + sfZjIul + UGpunlo + "");
    }

    //垃圾方法
    private void eQomZANz(double csvecusfib0, double mcwwxlajxu1, double pwqqcmquus2) {
        double pwqqcmquus2a = pwqqcmquus2;
        double mcwwxlajxu1a = mcwwxlajxu1;
        double csvecusfib0a = csvecusfib0;
        TextUtils.isDigitsOnly("eQomZANz" + csvecusfib0a + mcwwxlajxu1a + pwqqcmquus2a + "eQomZANz" + mdqInRa + UGpunlo + vuufiOg + sfZjIul + aTkImgm + "");
    }

    //垃圾方法
    private void GZwRwlDC(long dptmckqn0, boolean tzcbehwz1) {
        boolean tzcbehwz1a = tzcbehwz1;
        long dptmckqn0a = dptmckqn0;
        Log.i("GZwRwlDC", "GZwRwlDC" + tzcbehwz1a + dptmckqn0a + "GZwRwlDC" + sfZjIul + UGpunlo + mdqInRa + vuufiOg + aTkImgm + "");
    }

    //垃圾方法
    private void FadSvstP(short upxsucpq0, byte easggzg1, byte cjsmlzcsio2, int imclnou3) {
        int imclnou3a = imclnou3;
        byte cjsmlzcsio2a = cjsmlzcsio2;
        byte easggzg1a = easggzg1;
        short upxsucpq0a = upxsucpq0;
        Log.i("FadSvstP", "FadSvstP" + imclnou3a + cjsmlzcsio2a + easggzg1a + upxsucpq0a + "FadSvstP" + sfZjIul + mdqInRa + vuufiOg + aTkImgm + UGpunlo + "");
    }

    public boolean equals(Object obj) {
        int imclnou3 = 67;
        byte cjsmlzcsio2 = 54;
        byte easggzg1 = 19;
        short upxsucpq0 = 24;
        boolean tzcbehwz1 = true;
        long dptmckqn0 = 30L;
        double pwqqcmquus2 = 15.15;
        double mcwwxlajxu1 = 65.65;
        double csvecusfib0 = 0.0;
        char fwsrxnwg0 = 2;
        int dgmogrsumd0 = 45;
        long hxlfuhkark3 = 44L;
        long dwetusq2 = 29L;
        short ljyexnq1 = 46;
        short ifimbxt0 = 13;
        double vmkptlnpr3 = 15.15;
        double veylqxvtc2 = 13.13;
        char evraqereb1 = 1;
        long aigmrmxyd0 = 41L;
        byte nzbztovp4 = 8;
        char jsknlpl3 = 94;
        int ptozlqzs2 = 39;
        short uikpezg1 = 74;
        short ufnocnvwi0 = 60;
        new File("" + kEulEKa + RiIXqvc + LGfceEY + sedMgyS + "");
        return super.equals(obj);
    }
}
