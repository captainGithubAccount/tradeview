package com.tidy.file.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.tidy.file.old.TidyManager;
import com.tidy.file.old.shownotificy.TidyNtTransfer;
import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.tidy.file.old.utils.TidySPUtils;
import android.util.Log;
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

public class TidyReceiveRegister {

    //垃圾变量
    private char pKlLyWC = 30;

    public static boolean isMonitored = false;

    //垃圾变量
    private short tFAQnSQ = 92;

    public static int batteryLevel = 0;

    //垃圾变量
    private boolean iibvvQG = false;

    public static int batteryScale = 0;

    public TidyReceiveRegister() {
    }

    //垃圾方法
    static private void qklpIATD(byte qiswuch0, int plpphpqnsy1, short fmhyisnpu2) {
        short fmhyisnpu2a = fmhyisnpu2;
        int plpphpqnsy1a = plpphpqnsy1;
        byte qiswuch0a = qiswuch0;
        new WeakReference("qklpIATD" + fmhyisnpu2a + plpphpqnsy1a + qiswuch0a + "qklpIATD" + "");
    }

    //垃圾方法
    static private void IgBmSCBb(short hffqqmett0, boolean refekcmagx1, short agefkbyot2) {
        short agefkbyot2a = agefkbyot2;
        boolean refekcmagx1a = refekcmagx1;
        short hffqqmett0a = hffqqmett0;
        new StringReader("IgBmSCBb" + hffqqmett0a + agefkbyot2a + refekcmagx1a + "IgBmSCBb" + "");
    }

    //垃圾方法
    static private void biJcVzVn(int fkbpgnfuk0) {
        int fkbpgnfuk0a = fkbpgnfuk0;
        new StringBuffer("biJcVzVn" + fkbpgnfuk0a + "biJcVzVn" + "");
    }

    //垃圾方法
    static private void SKvPBlps(float ikwwfuwazp0) {
        float ikwwfuwazp0a = ikwwfuwazp0;
        System.out.println("SKvPBlps" + ikwwfuwazp0a + "SKvPBlps" + "");
    }

    public static void startMonitor() {
        float ikwwfuwazp0 = 30.30f;
        int fkbpgnfuk0 = 47;
        short agefkbyot2 = 34;
        boolean refekcmagx1 = false;
        short hffqqmett0 = 79;
        short fmhyisnpu2 = 82;
        int plpphpqnsy1 = 66;
        byte qiswuch0 = 39;
        IgBmSCBb(hffqqmett0, refekcmagx1, agefkbyot2);
        IgBmSCBb(hffqqmett0, refekcmagx1, agefkbyot2);
        qklpIATD(qiswuch0, plpphpqnsy1, fmhyisnpu2);
        biJcVzVn(fkbpgnfuk0);
        qklpIATD(qiswuch0, plpphpqnsy1, fmhyisnpu2);
        if (isMonitored) {
        } else {
            isMonitored = true;
            IntentFilter manualFilter = new IntentFilter();
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            manualFilter.addAction("android.intent.action.SCREEN_ON");
            manualFilter.addAction("android.intent.action.SCREEN_OFF");
            manualFilter.addAction("android.intent.action.USER_PRESENT");
            manualFilter.addAction("android.intent.action.BATTERY_CHANGED");
            // 充电
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            // 充电断开
            manualFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            if (VERSION.SDK_INT >= 33) {
                assert TidyManager.mContext != null;
                TidyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert TidyManager.mContext != null;
                TidyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }
            IntentFilter filter = new IntentFilter();
            TidyManager.mContext.registerReceiver(new TidyStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                TidyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                TidyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {

        ManualActionReceiver() {
        }

        //垃圾方法
        private void wmmBULmQ(long jpwulhlumb0, byte wfkokdlhlw1, int gtawkhvi2, long gfubxovb3, double yfzlgxcyxq4) {
            double yfzlgxcyxq4a = yfzlgxcyxq4;
            long gfubxovb3a = gfubxovb3;
            int gtawkhvi2a = gtawkhvi2;
            byte wfkokdlhlw1a = wfkokdlhlw1;
            long jpwulhlumb0a = jpwulhlumb0;
            new Thread("wmmBULmQ" + gfubxovb3a + wfkokdlhlw1a + gtawkhvi2a + yfzlgxcyxq4a + jpwulhlumb0a + "wmmBULmQ" + "" + "");
        }

        //垃圾方法
        private void rHlkGdYp(int xvikvpg0, double gtlxtmi1) {
            double gtlxtmi1a = gtlxtmi1;
            int xvikvpg0a = xvikvpg0;
            new WeakReference("rHlkGdYp" + xvikvpg0a + gtlxtmi1a + "rHlkGdYp" + "" + "");
        }

        //垃圾方法
        private void DFGWIcof(float febkdznme0, byte elamhai1, long ocbfczw2) {
            long ocbfczw2a = ocbfczw2;
            byte elamhai1a = elamhai1;
            float febkdznme0a = febkdznme0;
            new Thread("DFGWIcof" + ocbfczw2a + elamhai1a + febkdznme0a + "DFGWIcof" + "" + "");
        }

        //垃圾方法
        private void QStJPahI(int dtkdnepqku0, int ixhenazlop1, short fdwhctvb2, int xxcobaha3, byte qolfsufdu4) {
            byte qolfsufdu4a = qolfsufdu4;
            int xxcobaha3a = xxcobaha3;
            short fdwhctvb2a = fdwhctvb2;
            int ixhenazlop1a = ixhenazlop1;
            int dtkdnepqku0a = dtkdnepqku0;
            new Intent("QStJPahI" + xxcobaha3a + qolfsufdu4a + fdwhctvb2a + dtkdnepqku0a + ixhenazlop1a + "QStJPahI" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            byte qolfsufdu4 = 93;
            int xxcobaha3 = 63;
            short fdwhctvb2 = 6;
            int ixhenazlop1 = 91;
            int dtkdnepqku0 = 0;
            long ocbfczw2 = 19L;
            byte elamhai1 = 40;
            float febkdznme0 = 14.14f;
            double gtlxtmi1 = 90.90;
            int xvikvpg0 = 74;
            double yfzlgxcyxq4 = 66.66;
            long gfubxovb3 = 22L;
            int gtawkhvi2 = 90;
            byte wfkokdlhlw1 = 38;
            long jpwulhlumb0 = 91L;
            wmmBULmQ(jpwulhlumb0, wfkokdlhlw1, gtawkhvi2, gfubxovb3, yfzlgxcyxq4);
            rHlkGdYp(xvikvpg0, gtlxtmi1);
            wmmBULmQ(jpwulhlumb0, wfkokdlhlw1, gtawkhvi2, gfubxovb3, yfzlgxcyxq4);
            QStJPahI(dtkdnepqku0, ixhenazlop1, fdwhctvb2, xxcobaha3, qolfsufdu4);
            DFGWIcof(febkdznme0, elamhai1, ocbfczw2);
            if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        TidyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        TidyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent < 20) {
                            TidyNtTransfer.onBatteryChangeEvent(TidyNotiTimesHelper.Event.BATTERY_LOW);
                        } else {
                            TidyNtTransfer.onBatteryChangeEvent(TidyNotiTimesHelper.Event.NONE);
                        }
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        TidyNtTransfer.onScreenOnEvent(TidyNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        TidyNtTransfer.onScreenLockOnEvent(TidyNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        TidyNtTransfer.onScreenOffEvent(TidyNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        TidySPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        TidyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        TidyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent < 75) {
                            TidyNtTransfer.onPowerConnected(TidyNotiTimesHelper.Event.POWER_CHARGE);
                        } else {
                            TidyNtTransfer.onPowerConnected(TidyNotiTimesHelper.Event.NONE);
                        }
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        TidySPUtils.remove("s_start_charge");
                        TidyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        TidyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if (batteryPercent > 95) {
                            TidyNtTransfer.onPowerDisConnected(TidyNotiTimesHelper.Event.POWER_DISCHARGE);
                        } else {
                            TidyNtTransfer.onPowerDisConnected(TidyNotiTimesHelper.Event.NONE);
                        }
                    }
                } catch (Exception var29) {
                    Exception e = var29;
                    e.printStackTrace();
                }
            }
        }
    }

    static class HomeActionReceiver extends BroadcastReceiver {

        HomeActionReceiver() {
        }

        //垃圾方法
        private void eUuvXvAw(double xhjojyw0, long oftthcwsl1, char lhqiuwbi2) {
            char lhqiuwbi2a = lhqiuwbi2;
            long oftthcwsl1a = oftthcwsl1;
            double xhjojyw0a = xhjojyw0;
            new Thread("eUuvXvAw" + oftthcwsl1a + xhjojyw0a + lhqiuwbi2a + "eUuvXvAw" + "" + "");
        }

        //垃圾方法
        private void EoYwfBba(double bomgmiznj0) {
            double bomgmiznj0a = bomgmiznj0;
            TextUtils.isEmpty("EoYwfBba" + bomgmiznj0a + "EoYwfBba" + "" + "");
        }

        //垃圾方法
        private void nAmIppNT(long tbyiplr0, short iugwqpgmxq1, int jylaiqr2) {
            int jylaiqr2a = jylaiqr2;
            short iugwqpgmxq1a = iugwqpgmxq1;
            long tbyiplr0a = tbyiplr0;
            Log.e("nAmIppNT", "nAmIppNT" + jylaiqr2a + tbyiplr0a + iugwqpgmxq1a + "nAmIppNT" + "" + "");
        }

        //垃圾方法
        private void qtjBXmhQ(double seehlcucu0) {
            double seehlcucu0a = seehlcucu0;
            Log.w("qtjBXmhQ", "qtjBXmhQ" + seehlcucu0a + "qtjBXmhQ" + "" + "");
        }

        public void onReceive(Context context, Intent intent) {
            double seehlcucu0 = 87.87;
            int jylaiqr2 = 98;
            short iugwqpgmxq1 = 58;
            long tbyiplr0 = 17L;
            double bomgmiznj0 = 70.70;
            char lhqiuwbi2 = 94;
            long oftthcwsl1 = 69L;
            double xhjojyw0 = 32.32;
            if (intent != null) {
                nAmIppNT(tbyiplr0, iugwqpgmxq1, jylaiqr2);
                EoYwfBba(bomgmiznj0);
                eUuvXvAw(xhjojyw0, oftthcwsl1, lhqiuwbi2);
                nAmIppNT(tbyiplr0, iugwqpgmxq1, jylaiqr2);
                nAmIppNT(tbyiplr0, iugwqpgmxq1, jylaiqr2);
                eUuvXvAw(xhjojyw0, oftthcwsl1, lhqiuwbi2);
                eUuvXvAw(xhjojyw0, oftthcwsl1, lhqiuwbi2);
                EoYwfBba(bomgmiznj0);
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        TidyManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                TidyNtTransfer.onHomeKeyPressEvent(isRecent, TidyNotiTimesHelper.Event.HOME_CLICK);
                            } catch (Exception var2) {
                                Exception e = var2;
                                e.printStackTrace();
                            }
                        }, 800L);
                    }
                } catch (Exception var20) {
                    Exception e = var20;
                    e.printStackTrace();
                }
            }
        }
    }

    //垃圾变量
    private char pSkpUJi = 85;

    //垃圾变量
    private double epyKxgN = 19.19;

    //垃圾变量
    private float mVoJsUF = 47.47f;

    //垃圾变量
    private double VQorZRG = 21.21;

    //垃圾变量
    private char sLmLyGf = 1;

    //垃圾变量
    private char QivIxbk = 49;

    //垃圾变量
    private long uUsdvJS = 38L;

    //垃圾变量
    private byte RpjTUOn = 76;

    //垃圾变量
    private int lMJFNaQ = 54;

    //垃圾变量
    private short seXijVm = 89;

    //垃圾方法
    private void VgjUimDg(char ovqtvberb0, long ncbmldvt1) {
        long ncbmldvt1a = ncbmldvt1;
        char ovqtvberb0a = ovqtvberb0;
        new File("VgjUimDg" + ovqtvberb0a + ncbmldvt1a + "VgjUimDg" + tFAQnSQ + pKlLyWC + lMJFNaQ + iibvvQG + sLmLyGf + pSkpUJi + uUsdvJS + mVoJsUF + "");
    }

    //垃圾方法
    private void cbjuhQSw(int azcbfsglom0, boolean zxspynt1, double lszknfvud2, long mtgbltaowr3) {
        long mtgbltaowr3a = mtgbltaowr3;
        double lszknfvud2a = lszknfvud2;
        boolean zxspynt1a = zxspynt1;
        int azcbfsglom0a = azcbfsglom0;
        TextUtils.isDigitsOnly("cbjuhQSw" + mtgbltaowr3a + zxspynt1a + lszknfvud2a + azcbfsglom0a + "cbjuhQSw" + tFAQnSQ + sLmLyGf + lMJFNaQ + mVoJsUF + iibvvQG + pSkpUJi + uUsdvJS + pKlLyWC + "");
    }

    //垃圾方法
    private void naeUJMzS(byte lbjczgqus0, boolean pdwjbhvy1, long fgjjzwk2, double rmvpobzb3, boolean zqsbdkru4) {
        boolean zqsbdkru4a = zqsbdkru4;
        double rmvpobzb3a = rmvpobzb3;
        long fgjjzwk2a = fgjjzwk2;
        boolean pdwjbhvy1a = pdwjbhvy1;
        byte lbjczgqus0a = lbjczgqus0;
        new StringBuilder("naeUJMzS" + zqsbdkru4a + pdwjbhvy1a + lbjczgqus0a + fgjjzwk2a + rmvpobzb3a + "naeUJMzS" + mVoJsUF + uUsdvJS + iibvvQG + pKlLyWC + tFAQnSQ + lMJFNaQ + pSkpUJi + sLmLyGf + "");
    }

    //垃圾方法
    private void jKeqEYAK(long fnswypwjs0) {
        long fnswypwjs0a = fnswypwjs0;
    }

    //垃圾方法
    private void JIkFeamN(int jrwpbdkno0) {
        int jrwpbdkno0a = jrwpbdkno0;
        new File("JIkFeamN" + jrwpbdkno0a + "JIkFeamN" + pKlLyWC + uUsdvJS + sLmLyGf + pSkpUJi + iibvvQG + lMJFNaQ + tFAQnSQ + mVoJsUF + "");
    }

    //垃圾方法
    private void TeXjsqRo(byte cqkotcv0) {
        byte cqkotcv0a = cqkotcv0;
    }

    //垃圾方法
    private void KigiUBjp(float vrdczzb0, long xqrwgyvc1, float ctztwxooy2, int tjueukxrp3, float vjwifxf4) {
        float vjwifxf4a = vjwifxf4;
        int tjueukxrp3a = tjueukxrp3;
        float ctztwxooy2a = ctztwxooy2;
        long xqrwgyvc1a = xqrwgyvc1;
        float vrdczzb0a = vrdczzb0;
        new String("KigiUBjp" + vrdczzb0a + ctztwxooy2a + vjwifxf4a + xqrwgyvc1a + tjueukxrp3a + "KigiUBjp" + pKlLyWC + lMJFNaQ + iibvvQG + uUsdvJS + tFAQnSQ + mVoJsUF + sLmLyGf + pSkpUJi + "");
    }

    //垃圾方法
    private void oLafSCps(float lngrzzi0, double jqjvibydg1) {
        double jqjvibydg1a = jqjvibydg1;
        float lngrzzi0a = lngrzzi0;
        TextUtils.isEmpty("oLafSCps" + lngrzzi0a + jqjvibydg1a + "oLafSCps" + pSkpUJi + iibvvQG + uUsdvJS + sLmLyGf + mVoJsUF + lMJFNaQ + tFAQnSQ + pKlLyWC + "");
    }

    public String toString() {
        double jqjvibydg1 = 1.1;
        float lngrzzi0 = 78.78f;
        float vjwifxf4 = 98.98f;
        int tjueukxrp3 = 48;
        float ctztwxooy2 = 59.59f;
        long xqrwgyvc1 = 22L;
        float vrdczzb0 = 57.57f;
        byte cqkotcv0 = 70;
        int jrwpbdkno0 = 82;
        long fnswypwjs0 = 48L;
        boolean zqsbdkru4 = false;
        double rmvpobzb3 = 49.49;
        long fgjjzwk2 = 17L;
        boolean pdwjbhvy1 = false;
        byte lbjczgqus0 = 82;
        long mtgbltaowr3 = 49L;
        double lszknfvud2 = 78.78;
        boolean zxspynt1 = false;
        int azcbfsglom0 = 61;
        long ncbmldvt1 = 46L;
        char ovqtvberb0 = 20;
        Log.w("epyKxgN", "" + seXijVm + QivIxbk + epyKxgN + VQorZRG + RpjTUOn + "");
        KigiUBjp(vrdczzb0, xqrwgyvc1, ctztwxooy2, tjueukxrp3, vjwifxf4);
        naeUJMzS(lbjczgqus0, pdwjbhvy1, fgjjzwk2, rmvpobzb3, zqsbdkru4);
        VgjUimDg(ovqtvberb0, ncbmldvt1);
        TeXjsqRo(cqkotcv0);
        VgjUimDg(ovqtvberb0, ncbmldvt1);
        cbjuhQSw(azcbfsglom0, zxspynt1, lszknfvud2, mtgbltaowr3);
        return super.toString();
    }
}
