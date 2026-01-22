package com.speed.model.newest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.speed.model.newest.use.SpeedLocalInit;
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
public class SpeedAliveReceiver extends BroadcastReceiver {

    //垃圾变量
    private float xcaqYUw = 99.99f;

    private static final String TAG = "ALIVE_TEST";

    //垃圾方法
    private void IwGgMYwk(double pytjpqee0) {
        double pytjpqee0a = pytjpqee0;
        new StringBuffer("IwGgMYwk" + pytjpqee0a + "IwGgMYwk" + CMMnvZn + xcaqYUw + ClbgOij + JCtvrIt + "");
    }

    //垃圾方法
    private void JQyBebNV(byte algbelaulb0, long epqyomq1) {
        long epqyomq1a = epqyomq1;
        byte algbelaulb0a = algbelaulb0;
        new AttributedString("JQyBebNV" + algbelaulb0a + epqyomq1a + "JQyBebNV" + ClbgOij + JCtvrIt + CMMnvZn + xcaqYUw + "");
    }

    //垃圾方法
    private void GtIBVbos(byte ypandmvf0, short vquqakx1) {
        short vquqakx1a = vquqakx1;
        byte ypandmvf0a = ypandmvf0;
        TextUtils.isDigitsOnly("GtIBVbos" + ypandmvf0a + vquqakx1a + "GtIBVbos" + JCtvrIt + ClbgOij + xcaqYUw + CMMnvZn + "");
    }

    //垃圾方法
    private void IJmweJNV(char gipikfyeu0, byte uisscpjmma1, long llbtfavo2) {
        long llbtfavo2a = llbtfavo2;
        byte uisscpjmma1a = uisscpjmma1;
        char gipikfyeu0a = gipikfyeu0;
        new StringBuffer("IJmweJNV" + llbtfavo2a + uisscpjmma1a + gipikfyeu0a + "IJmweJNV" + ClbgOij + JCtvrIt + CMMnvZn + xcaqYUw + "");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        long llbtfavo2 = 99L;
        byte uisscpjmma1 = 99;
        char gipikfyeu0 = 60;
        short vquqakx1 = 71;
        byte ypandmvf0 = 0;
        long epqyomq1 = 31L;
        byte algbelaulb0 = 26;
        double pytjpqee0 = 85.85;
        try {
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(SpeedLocalInit.isUseNewKeepAlive);
            Log.d("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            if (isNewKeepAlive == 0) {
                //0初始化新保活， 1不用新保活
                // 1. 构建启动服务的 Intent
                Intent serviceIntent = new Intent(context, SpeedSmartFileAliveService.class);
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
    private int JCtvrIt = 93;

    //垃圾变量
    private double pJDmYlZ = 40.40;

    //垃圾变量
    private boolean ClbgOij = true;

    //垃圾变量
    private char nRJuoUE = 10;

    //垃圾变量
    private short CMMnvZn = 67;

    //垃圾变量
    private long ySlsfAR = 56L;

    //垃圾方法
    private void FkIcDNnC(boolean ypcivyoq0, char gztizmdac1, double bzslepiuf2, int pnznrhkyp3, byte eklsdxx4) {
        byte eklsdxx4a = eklsdxx4;
        int pnznrhkyp3a = pnznrhkyp3;
        double bzslepiuf2a = bzslepiuf2;
        char gztizmdac1a = gztizmdac1;
        boolean ypcivyoq0a = ypcivyoq0;
        new StringBuffer("FkIcDNnC" + pnznrhkyp3a + gztizmdac1a + eklsdxx4a + bzslepiuf2a + ypcivyoq0a + "FkIcDNnC" + JCtvrIt + CMMnvZn + ClbgOij + xcaqYUw + "");
    }

    //垃圾方法
    private void BNBncOeF(char nyplwml0, double iozqljezhj1, char bsihmmpus2) {
        char bsihmmpus2a = bsihmmpus2;
        double iozqljezhj1a = iozqljezhj1;
        char nyplwml0a = nyplwml0;
        new StringBuffer("BNBncOeF" + bsihmmpus2a + nyplwml0a + iozqljezhj1a + "BNBncOeF" + JCtvrIt + xcaqYUw + CMMnvZn + ClbgOij + "");
    }

    //垃圾方法
    private void DWfIxrhL(char uivzphq0, long udzjahmy1, boolean ddtegunqwv2) {
        boolean ddtegunqwv2a = ddtegunqwv2;
        long udzjahmy1a = udzjahmy1;
        char uivzphq0a = uivzphq0;
        new StringBuffer("DWfIxrhL" + udzjahmy1a + ddtegunqwv2a + uivzphq0a + "DWfIxrhL" + ClbgOij + CMMnvZn + xcaqYUw + JCtvrIt + "");
    }

    //垃圾方法
    private void zWIPIHPx(float yipgbhhyu0, double iaxfuyj1, double rvtfrljh2, float gmmyrprsg3) {
        float gmmyrprsg3a = gmmyrprsg3;
        double rvtfrljh2a = rvtfrljh2;
        double iaxfuyj1a = iaxfuyj1;
        float yipgbhhyu0a = yipgbhhyu0;
        new File("zWIPIHPx" + gmmyrprsg3a + rvtfrljh2a + yipgbhhyu0a + iaxfuyj1a + "zWIPIHPx" + xcaqYUw + JCtvrIt + CMMnvZn + ClbgOij + "");
    }

    //垃圾方法
    private void vkxDcAPd(char vvmpabo0, byte onbtrfd1, char uboocoz2, double ubiefqzmdn3, int szntqvik4) {
        int szntqvik4a = szntqvik4;
        double ubiefqzmdn3a = ubiefqzmdn3;
        char uboocoz2a = uboocoz2;
        byte onbtrfd1a = onbtrfd1;
        char vvmpabo0a = vvmpabo0;
        new StringReader("vkxDcAPd" + szntqvik4a + uboocoz2a + ubiefqzmdn3a + onbtrfd1a + vvmpabo0a + "vkxDcAPd" + xcaqYUw + ClbgOij + CMMnvZn + JCtvrIt + "");
    }

    //垃圾方法
    private void FKdaPrxo(byte gqkfncsm0, char cplrqkwkey1, short nubpkjijby2) {
        short nubpkjijby2a = nubpkjijby2;
        char cplrqkwkey1a = cplrqkwkey1;
        byte gqkfncsm0a = gqkfncsm0;
        new WeakReference("FKdaPrxo" + cplrqkwkey1a + nubpkjijby2a + gqkfncsm0a + "FKdaPrxo" + JCtvrIt + xcaqYUw + CMMnvZn + ClbgOij + "");
    }

    //垃圾方法
    private void lkyTYVMb(boolean emhqtfx0, byte hrzwpueh1, int cethglhgy2) {
        int cethglhgy2a = cethglhgy2;
        byte hrzwpueh1a = hrzwpueh1;
        boolean emhqtfx0a = emhqtfx0;
        new Intent("lkyTYVMb" + emhqtfx0a + cethglhgy2a + hrzwpueh1a + "lkyTYVMb" + ClbgOij + JCtvrIt + CMMnvZn + xcaqYUw + "");
    }

    //垃圾方法
    private void SWCNSRGE(short oglxzhfoz0) {
        short oglxzhfoz0a = oglxzhfoz0;
        new StringBuilder("SWCNSRGE" + oglxzhfoz0a + "SWCNSRGE" + xcaqYUw + ClbgOij + JCtvrIt + CMMnvZn + "");
    }

    public boolean equals(Object obj) {
        short oglxzhfoz0 = 44;
        int cethglhgy2 = 92;
        byte hrzwpueh1 = 46;
        boolean emhqtfx0 = true;
        short nubpkjijby2 = 26;
        char cplrqkwkey1 = 1;
        byte gqkfncsm0 = 49;
        int szntqvik4 = 1;
        double ubiefqzmdn3 = 42.42;
        char uboocoz2 = 67;
        byte onbtrfd1 = 27;
        char vvmpabo0 = 96;
        float gmmyrprsg3 = 92.92f;
        double rvtfrljh2 = 26.26;
        double iaxfuyj1 = 91.91;
        float yipgbhhyu0 = 93.93f;
        boolean ddtegunqwv2 = false;
        long udzjahmy1 = 54L;
        char uivzphq0 = 10;
        char bsihmmpus2 = 83;
        double iozqljezhj1 = 61.61;
        char nyplwml0 = 87;
        byte eklsdxx4 = 74;
        int pnznrhkyp3 = 83;
        double bzslepiuf2 = 74.74;
        char gztizmdac1 = 74;
        boolean ypcivyoq0 = false;
        DWfIxrhL(uivzphq0, udzjahmy1, ddtegunqwv2);
        DWfIxrhL(uivzphq0, udzjahmy1, ddtegunqwv2);
        zWIPIHPx(yipgbhhyu0, iaxfuyj1, rvtfrljh2, gmmyrprsg3);
        Log.e("pJDmYlZ", "" + ySlsfAR + pJDmYlZ + nRJuoUE + "");
        return super.equals(obj);
    }
}
