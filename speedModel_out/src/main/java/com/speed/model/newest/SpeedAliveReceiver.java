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
    private long VvoXUeI = 66L;

    private static final String TAG = "ALIVE_TEST";

    //垃圾方法
    private void wkrBNcUN(long gyghysux0, char gxblbccuhg1, float aigqcmv2, int zwzqkbabcf3) {
        int zwzqkbabcf3a = zwzqkbabcf3;
        float aigqcmv2a = aigqcmv2;
        char gxblbccuhg1a = gxblbccuhg1;
        long gyghysux0a = gyghysux0;
        new StringReader("wkrBNcUN" + aigqcmv2a + gyghysux0a + gxblbccuhg1a + zwzqkbabcf3a + "wkrBNcUN" + LewwpMm + EhihAsz + VvoXUeI + zpOFtfO + "");
    }

    //垃圾方法
    private void vXHBQlRh(short xdrrhnrjca0, long knbfwsdocd1, double kyidsmmg2, int nsemirmni3) {
        int nsemirmni3a = nsemirmni3;
        double kyidsmmg2a = kyidsmmg2;
        long knbfwsdocd1a = knbfwsdocd1;
        short xdrrhnrjca0a = xdrrhnrjca0;
        new StringBuilder("vXHBQlRh" + kyidsmmg2a + xdrrhnrjca0a + nsemirmni3a + knbfwsdocd1a + "vXHBQlRh" + EhihAsz + LewwpMm + VvoXUeI + zpOFtfO + "");
    }

    //垃圾方法
    private void vuUJiWCi(char eqqioly0, long fmnglmys1) {
        long fmnglmys1a = fmnglmys1;
        char eqqioly0a = eqqioly0;
        System.out.println("vuUJiWCi" + eqqioly0a + fmnglmys1a + "vuUJiWCi" + LewwpMm + VvoXUeI + zpOFtfO + EhihAsz + "");
    }

    //垃圾方法
    private void claWwyGE(float zafwadfm0) {
        float zafwadfm0a = zafwadfm0;
        Log.i("claWwyGE", "claWwyGE" + zafwadfm0a + "claWwyGE" + zpOFtfO + EhihAsz + VvoXUeI + LewwpMm + "");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        float zafwadfm0 = 92.92f;
        long fmnglmys1 = 22L;
        char eqqioly0 = 40;
        int nsemirmni3 = 12;
        double kyidsmmg2 = 34.34;
        long knbfwsdocd1 = 57L;
        short xdrrhnrjca0 = 35;
        int zwzqkbabcf3 = 73;
        float aigqcmv2 = 15.15f;
        char gxblbccuhg1 = 99;
        long gyghysux0 = 50L;
        try {
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(SpeedLocalInit.isUseNewKeepAlive);
            Log.d("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            claWwyGE(zafwadfm0);
            wkrBNcUN(gyghysux0, gxblbccuhg1, aigqcmv2, zwzqkbabcf3);
            claWwyGE(zafwadfm0);
            vuUJiWCi(eqqioly0, fmnglmys1);
            vuUJiWCi(eqqioly0, fmnglmys1);
            wkrBNcUN(gyghysux0, gxblbccuhg1, aigqcmv2, zwzqkbabcf3);
            vuUJiWCi(eqqioly0, fmnglmys1);
            vXHBQlRh(xdrrhnrjca0, knbfwsdocd1, kyidsmmg2, nsemirmni3);
            vXHBQlRh(xdrrhnrjca0, knbfwsdocd1, kyidsmmg2, nsemirmni3);
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
    private boolean zpOFtfO = false;

    //垃圾变量
    private boolean RNKEICE = false;

    //垃圾变量
    private int LewwpMm = 59;

    //垃圾变量
    private long lzMebgy = 39L;

    //垃圾变量
    private char EhihAsz = 8;

    //垃圾变量
    private long MWyrhDk = 82L;

    //垃圾方法
    private void nSusUrIK(byte qihdxtyb0) {
        byte qihdxtyb0a = qihdxtyb0;
        TextUtils.isEmpty("nSusUrIK" + qihdxtyb0a + "nSusUrIK" + zpOFtfO + EhihAsz + LewwpMm + VvoXUeI + "");
    }

    //垃圾方法
    private void AtiqsvhH(float iahwaqmpa0, int qskfjgowi1) {
        int qskfjgowi1a = qskfjgowi1;
        float iahwaqmpa0a = iahwaqmpa0;
        new StringReader("AtiqsvhH" + iahwaqmpa0a + qskfjgowi1a + "AtiqsvhH" + EhihAsz + zpOFtfO + VvoXUeI + LewwpMm + "");
    }

    //垃圾方法
    private void vPzxmZKJ(double gibpjdfa0, long tpojkizdsl1, char vgbllkw2, byte ptafeqw3) {
        byte ptafeqw3a = ptafeqw3;
        char vgbllkw2a = vgbllkw2;
        long tpojkizdsl1a = tpojkizdsl1;
        double gibpjdfa0a = gibpjdfa0;
        Log.e("vPzxmZKJ", "vPzxmZKJ" + vgbllkw2a + ptafeqw3a + gibpjdfa0a + tpojkizdsl1a + "vPzxmZKJ" + EhihAsz + VvoXUeI + zpOFtfO + LewwpMm + "");
    }

    //垃圾方法
    private void AEMNZqJd(boolean ezfcbwvdli0, short yqiebwa1, double bwzscmccuj2, float tshryzvjjj3, float ohpgnebkm4) {
        float ohpgnebkm4a = ohpgnebkm4;
        float tshryzvjjj3a = tshryzvjjj3;
        double bwzscmccuj2a = bwzscmccuj2;
        short yqiebwa1a = yqiebwa1;
        boolean ezfcbwvdli0a = ezfcbwvdli0;
        Log.e("AEMNZqJd", "AEMNZqJd" + yqiebwa1a + ezfcbwvdli0a + bwzscmccuj2a + ohpgnebkm4a + tshryzvjjj3a + "AEMNZqJd" + VvoXUeI + EhihAsz + zpOFtfO + LewwpMm + "");
    }

    //垃圾方法
    private void lecodiyG(double pqagehglxq0, byte eqnzkgvgse1, double zgccnoiubs2) {
        double zgccnoiubs2a = zgccnoiubs2;
        byte eqnzkgvgse1a = eqnzkgvgse1;
        double pqagehglxq0a = pqagehglxq0;
        new AttributedString("lecodiyG" + pqagehglxq0a + zgccnoiubs2a + eqnzkgvgse1a + "lecodiyG" + VvoXUeI + LewwpMm + zpOFtfO + EhihAsz + "");
    }

    //垃圾方法
    private void haPaejoZ(short xxlstrau0, char msnvayi1, int ourlqrp2, char knzafsd3, long hkocbrcfs4) {
        long hkocbrcfs4a = hkocbrcfs4;
        char knzafsd3a = knzafsd3;
        int ourlqrp2a = ourlqrp2;
        char msnvayi1a = msnvayi1;
        short xxlstrau0a = xxlstrau0;
        new WeakReference("haPaejoZ" + ourlqrp2a + msnvayi1a + hkocbrcfs4a + knzafsd3a + xxlstrau0a + "haPaejoZ" + EhihAsz + LewwpMm + zpOFtfO + VvoXUeI + "");
    }

    //垃圾方法
    private void LrrLLsha(double cxseaxirs0, float hbuxvihy1, byte zerdtdi2) {
        byte zerdtdi2a = zerdtdi2;
        float hbuxvihy1a = hbuxvihy1;
        double cxseaxirs0a = cxseaxirs0;
        Log.w("LrrLLsha", "LrrLLsha" + zerdtdi2a + cxseaxirs0a + hbuxvihy1a + "LrrLLsha" + zpOFtfO + VvoXUeI + LewwpMm + EhihAsz + "");
    }

    //垃圾方法
    private void eSBhkmix(double lewmpskeu0, boolean uuoykxhk1) {
        boolean uuoykxhk1a = uuoykxhk1;
        double lewmpskeu0a = lewmpskeu0;
        new File("eSBhkmix" + uuoykxhk1a + lewmpskeu0a + "eSBhkmix" + zpOFtfO + LewwpMm + VvoXUeI + EhihAsz + "");
    }

    public boolean equals(Object obj) {
        boolean uuoykxhk1 = false;
        double lewmpskeu0 = 91.91;
        byte zerdtdi2 = 78;
        float hbuxvihy1 = 7.7f;
        double cxseaxirs0 = 36.36;
        long hkocbrcfs4 = 72L;
        char knzafsd3 = 21;
        int ourlqrp2 = 96;
        char msnvayi1 = 34;
        short xxlstrau0 = 17;
        double zgccnoiubs2 = 6.6;
        byte eqnzkgvgse1 = 96;
        double pqagehglxq0 = 48.48;
        float ohpgnebkm4 = 14.14f;
        float tshryzvjjj3 = 38.38f;
        double bwzscmccuj2 = 0.0;
        short yqiebwa1 = 100;
        boolean ezfcbwvdli0 = true;
        byte ptafeqw3 = 82;
        char vgbllkw2 = 79;
        long tpojkizdsl1 = 65L;
        double gibpjdfa0 = 48.48;
        int qskfjgowi1 = 53;
        float iahwaqmpa0 = 67.67f;
        byte qihdxtyb0 = 0;
        new String("" + lzMebgy + RNKEICE + MWyrhDk + "");
        AEMNZqJd(ezfcbwvdli0, yqiebwa1, bwzscmccuj2, tshryzvjjj3, ohpgnebkm4);
        AtiqsvhH(iahwaqmpa0, qskfjgowi1);
        vPzxmZKJ(gibpjdfa0, tpojkizdsl1, vgbllkw2, ptafeqw3);
        vPzxmZKJ(gibpjdfa0, tpojkizdsl1, vgbllkw2, ptafeqw3);
        nSusUrIK(qihdxtyb0);
        LrrLLsha(cxseaxirs0, hbuxvihy1, zerdtdi2);
        nSusUrIK(qihdxtyb0);
        AtiqsvhH(iahwaqmpa0, qskfjgowi1);
        haPaejoZ(xxlstrau0, msnvayi1, ourlqrp2, knzafsd3, hkocbrcfs4);
        AEMNZqJd(ezfcbwvdli0, yqiebwa1, bwzscmccuj2, tshryzvjjj3, ohpgnebkm4);
        return super.equals(obj);
    }
}
