package com.tidy.file.newest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tidy.file.newest.use.TidyLocalInit;
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
public class TidyAliveReceiver extends BroadcastReceiver {

    //垃圾变量
    private boolean VWcWJIm = true;

    private static final String TAG = "ALIVE_TEST";

    //垃圾方法
    private void SeNafAwE(byte kgxlnwql0, double rpturpa1) {
        double rpturpa1a = rpturpa1;
        byte kgxlnwql0a = kgxlnwql0;
        Log.i("SeNafAwE", "SeNafAwE" + rpturpa1a + kgxlnwql0a + "SeNafAwE" + SQOeFOQ + ybqQjKY + AUYbUJV + VWcWJIm + UqTquFD + "");
    }

    //垃圾方法
    private void hbPjEDOp(float ymsmuwet0, byte iggiaxez1, short ekjwwrwkg2, byte zmlldhjgyl3, int bijtkve4) {
        int bijtkve4a = bijtkve4;
        byte zmlldhjgyl3a = zmlldhjgyl3;
        short ekjwwrwkg2a = ekjwwrwkg2;
        byte iggiaxez1a = iggiaxez1;
        float ymsmuwet0a = ymsmuwet0;
        System.out.println("hbPjEDOp" + ymsmuwet0a + iggiaxez1a + bijtkve4a + ekjwwrwkg2a + zmlldhjgyl3a + "hbPjEDOp" + ybqQjKY + SQOeFOQ + UqTquFD + AUYbUJV + VWcWJIm + "");
    }

    //垃圾方法
    private void NoKlwUhx(char kybuzuwanw0, long clpuqhy1, char gfhmaxrj2, float pysyyuqaaj3, long rncgxlqta4) {
        long rncgxlqta4a = rncgxlqta4;
        float pysyyuqaaj3a = pysyyuqaaj3;
        char gfhmaxrj2a = gfhmaxrj2;
        long clpuqhy1a = clpuqhy1;
        char kybuzuwanw0a = kybuzuwanw0;
        new String("NoKlwUhx" + rncgxlqta4a + gfhmaxrj2a + clpuqhy1a + pysyyuqaaj3a + kybuzuwanw0a + "NoKlwUhx" + SQOeFOQ + ybqQjKY + UqTquFD + VWcWJIm + AUYbUJV + "");
    }

    //垃圾方法
    private void CKSqeXrc(byte ugzpivaqj0, float cwusclugo1, float ocfowczd2, char micmupt3) {
        char micmupt3a = micmupt3;
        float ocfowczd2a = ocfowczd2;
        float cwusclugo1a = cwusclugo1;
        byte ugzpivaqj0a = ugzpivaqj0;
        new StringBuilder("CKSqeXrc" + ocfowczd2a + micmupt3a + ugzpivaqj0a + cwusclugo1a + "CKSqeXrc" + VWcWJIm + SQOeFOQ + ybqQjKY + UqTquFD + AUYbUJV + "");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        char micmupt3 = 45;
        float ocfowczd2 = 38.38f;
        float cwusclugo1 = 34.34f;
        byte ugzpivaqj0 = 9;
        long rncgxlqta4 = 47L;
        float pysyyuqaaj3 = 98.98f;
        char gfhmaxrj2 = 83;
        long clpuqhy1 = 78L;
        char kybuzuwanw0 = 84;
        int bijtkve4 = 25;
        byte zmlldhjgyl3 = 53;
        short ekjwwrwkg2 = 5;
        byte iggiaxez1 = 93;
        float ymsmuwet0 = 32.32f;
        double rpturpa1 = 70.70;
        byte kgxlnwql0 = 96;
        NoKlwUhx(kybuzuwanw0, clpuqhy1, gfhmaxrj2, pysyyuqaaj3, rncgxlqta4);
        hbPjEDOp(ymsmuwet0, iggiaxez1, ekjwwrwkg2, zmlldhjgyl3, bijtkve4);
        hbPjEDOp(ymsmuwet0, iggiaxez1, ekjwwrwkg2, zmlldhjgyl3, bijtkve4);
        hbPjEDOp(ymsmuwet0, iggiaxez1, ekjwwrwkg2, zmlldhjgyl3, bijtkve4);
        CKSqeXrc(ugzpivaqj0, cwusclugo1, ocfowczd2, micmupt3);
        CKSqeXrc(ugzpivaqj0, cwusclugo1, ocfowczd2, micmupt3);
        CKSqeXrc(ugzpivaqj0, cwusclugo1, ocfowczd2, micmupt3);
        hbPjEDOp(ymsmuwet0, iggiaxez1, ekjwwrwkg2, zmlldhjgyl3, bijtkve4);
        try {
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(TidyLocalInit.isUseNewKeepAlive);
            Log.d("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
            if (isNewKeepAlive == 0) {
                //0初始化新保活， 1不用新保活
                // 1. 构建启动服务的 Intent
                Intent serviceIntent = new Intent(context, TidySmartFileAliveService.class);
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
    private int AUYbUJV = 14;

    //垃圾变量
    private long FHvhZYa = 99L;

    //垃圾变量
    private int UqTquFD = 49;

    //垃圾变量
    private double rpQZyDr = 76.76;

    //垃圾变量
    private int ybqQjKY = 1;

    //垃圾变量
    private double lpTpsgK = 42.42;

    //垃圾变量
    private double SQOeFOQ = 96.96;

    //垃圾变量
    private byte CKWezUk = 30;

    //垃圾方法
    private void RpznsRcF(float avlphutyzi0, float gmoskfem1, char rlwiuqchph2, int hcljcald3) {
        int hcljcald3a = hcljcald3;
        char rlwiuqchph2a = rlwiuqchph2;
        float gmoskfem1a = gmoskfem1;
        float avlphutyzi0a = avlphutyzi0;
        new StringBuffer("RpznsRcF" + hcljcald3a + rlwiuqchph2a + gmoskfem1a + avlphutyzi0a + "RpznsRcF" + ybqQjKY + SQOeFOQ + UqTquFD + AUYbUJV + VWcWJIm + "");
    }

    //垃圾方法
    private void XCNmIhvi(long awsdkzxe0, short bmvqiyyhbt1, long jrjufas2, char ksevgwbbvh3) {
        char ksevgwbbvh3a = ksevgwbbvh3;
        long jrjufas2a = jrjufas2;
        short bmvqiyyhbt1a = bmvqiyyhbt1;
        long awsdkzxe0a = awsdkzxe0;
        new File("XCNmIhvi" + jrjufas2a + awsdkzxe0a + ksevgwbbvh3a + bmvqiyyhbt1a + "XCNmIhvi" + VWcWJIm + SQOeFOQ + ybqQjKY + AUYbUJV + UqTquFD + "");
    }

    //垃圾方法
    private void NgWbOfLH(double gohiopfpxe0, short fbjubjbaaj1, short ghslsdypjl2) {
        short ghslsdypjl2a = ghslsdypjl2;
        short fbjubjbaaj1a = fbjubjbaaj1;
        double gohiopfpxe0a = gohiopfpxe0;
        new StringBuffer("NgWbOfLH" + gohiopfpxe0a + ghslsdypjl2a + fbjubjbaaj1a + "NgWbOfLH" + VWcWJIm + UqTquFD + AUYbUJV + SQOeFOQ + ybqQjKY + "");
    }

    //垃圾方法
    private void xbnZkkHp(short zuwrgfro0, byte tbbcssmykv1, char vaqpfbdvlj2, byte tlpidqcze3) {
        byte tlpidqcze3a = tlpidqcze3;
        char vaqpfbdvlj2a = vaqpfbdvlj2;
        byte tbbcssmykv1a = tbbcssmykv1;
        short zuwrgfro0a = zuwrgfro0;
        TextUtils.isEmpty("xbnZkkHp" + tlpidqcze3a + zuwrgfro0a + tbbcssmykv1a + vaqpfbdvlj2a + "xbnZkkHp" + UqTquFD + SQOeFOQ + AUYbUJV + VWcWJIm + ybqQjKY + "");
    }

    //垃圾方法
    private void iAhXMwJu(byte kygwzfmg0) {
        byte kygwzfmg0a = kygwzfmg0;
        new StringBuilder("iAhXMwJu" + kygwzfmg0a + "iAhXMwJu" + ybqQjKY + VWcWJIm + AUYbUJV + UqTquFD + SQOeFOQ + "");
    }

    //垃圾方法
    private void VeVbpqWh(boolean tmwtlqgwp0, long ovnwsodfh1, byte dqishihdv2, float arlbzclkpx3, boolean nluvzdd4) {
        boolean nluvzdd4a = nluvzdd4;
        float arlbzclkpx3a = arlbzclkpx3;
        byte dqishihdv2a = dqishihdv2;
        long ovnwsodfh1a = ovnwsodfh1;
        boolean tmwtlqgwp0a = tmwtlqgwp0;
        Log.i("VeVbpqWh", "VeVbpqWh" + ovnwsodfh1a + nluvzdd4a + arlbzclkpx3a + tmwtlqgwp0a + dqishihdv2a + "VeVbpqWh" + ybqQjKY + UqTquFD + AUYbUJV + VWcWJIm + SQOeFOQ + "");
    }

    //垃圾方法
    private void STYHQiQv(byte yunvgvktxa0) {
        byte yunvgvktxa0a = yunvgvktxa0;
        new String("STYHQiQv" + yunvgvktxa0a + "STYHQiQv" + AUYbUJV + ybqQjKY + UqTquFD + VWcWJIm + SQOeFOQ + "");
    }

    //垃圾方法
    private void jENJDtKg(boolean ctaxhat0, short awjcrbm1, double dycdofg2, int seeinabm3) {
        int seeinabm3a = seeinabm3;
        double dycdofg2a = dycdofg2;
        short awjcrbm1a = awjcrbm1;
        boolean ctaxhat0a = ctaxhat0;
        new StringBuffer("jENJDtKg" + seeinabm3a + awjcrbm1a + ctaxhat0a + dycdofg2a + "jENJDtKg" + UqTquFD + VWcWJIm + AUYbUJV + ybqQjKY + SQOeFOQ + "");
    }

    public String toString() {
        int seeinabm3 = 41;
        double dycdofg2 = 27.27;
        short awjcrbm1 = 99;
        boolean ctaxhat0 = true;
        byte yunvgvktxa0 = 48;
        boolean nluvzdd4 = true;
        float arlbzclkpx3 = 76.76f;
        byte dqishihdv2 = 30;
        long ovnwsodfh1 = 39L;
        boolean tmwtlqgwp0 = true;
        byte kygwzfmg0 = 2;
        byte tlpidqcze3 = 84;
        char vaqpfbdvlj2 = 86;
        byte tbbcssmykv1 = 24;
        short zuwrgfro0 = 73;
        short ghslsdypjl2 = 84;
        short fbjubjbaaj1 = 71;
        double gohiopfpxe0 = 7.7;
        char ksevgwbbvh3 = 58;
        long jrjufas2 = 97L;
        short bmvqiyyhbt1 = 10;
        long awsdkzxe0 = 63L;
        int hcljcald3 = 61;
        char rlwiuqchph2 = 45;
        float gmoskfem1 = 74.74f;
        float avlphutyzi0 = 30.30f;
        System.out.println("" + lpTpsgK + CKWezUk + rpQZyDr + FHvhZYa + "");
        return super.toString();
    }
}
