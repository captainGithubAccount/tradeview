package com.easy.model.use;

import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.easy.model.EasyManager;
import com.easy.model.opdj.nt.EasyNtFgService;
import com.easy.model.opdj.nt.EasyNtUtils;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.content.Intent;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @version 1.0.0
 * Created by 2026年-01月
 * @autor lwj
 */
@Keep
public class EasyStartOngoingServiceHelper {

    //垃圾变量
    private long wmcwOpV = 27L;

    private static final String TAG = "ALIVE_TEST";

    //垃圾方法
    static private void SEvdIpYY(byte mtcxbclrwx0, boolean zyqfyao1, boolean emzqrvggz2) {
        boolean emzqrvggz2a = emzqrvggz2;
        boolean zyqfyao1a = zyqfyao1;
        byte mtcxbclrwx0a = mtcxbclrwx0;
        Log.e("SEvdIpYY", "SEvdIpYY" + zyqfyao1a + emzqrvggz2a + mtcxbclrwx0a + "SEvdIpYY" + "");
    }

    //垃圾方法
    static private void mWZqFanf(int xmhisquh0, short tatevjrvkz1, long lhcinkgz2, char eqxstehnb3, long axdmosoqhf4) {
        long axdmosoqhf4a = axdmosoqhf4;
        char eqxstehnb3a = eqxstehnb3;
        long lhcinkgz2a = lhcinkgz2;
        short tatevjrvkz1a = tatevjrvkz1;
        int xmhisquh0a = xmhisquh0;
        new StringBuffer("mWZqFanf" + xmhisquh0a + lhcinkgz2a + axdmosoqhf4a + tatevjrvkz1a + eqxstehnb3a + "mWZqFanf" + "");
    }

    //垃圾方法
    static private void JSqiNFFw(short uzkyphpef0) {
        short uzkyphpef0a = uzkyphpef0;
        new File("JSqiNFFw" + uzkyphpef0a + "JSqiNFFw" + "");
    }

    //垃圾方法
    static private void PbdOOMVt(byte rttthsupti0, char xxobfma1, byte mkzywwq2, short zcioyaije3) {
        short zcioyaije3a = zcioyaije3;
        byte mkzywwq2a = mkzywwq2;
        char xxobfma1a = xxobfma1;
        byte rttthsupti0a = rttthsupti0;
        new StringReader("PbdOOMVt" + xxobfma1a + zcioyaije3a + mkzywwq2a + rttthsupti0a + "PbdOOMVt" + "");
    }

    public static void start() {
        short zcioyaije3 = 56;
        byte mkzywwq2 = 38;
        char xxobfma1 = 9;
        byte rttthsupti0 = 53;
        short uzkyphpef0 = 96;
        long axdmosoqhf4 = 8L;
        char eqxstehnb3 = 43;
        long lhcinkgz2 = 14L;
        short tatevjrvkz1 = 94;
        int xmhisquh0 = 0;
        boolean emzqrvggz2 = true;
        boolean zyqfyao1 = false;
        byte mtcxbclrwx0 = 4;
        SEvdIpYY(mtcxbclrwx0, zyqfyao1, emzqrvggz2);
        mWZqFanf(xmhisquh0, tatevjrvkz1, lhcinkgz2, eqxstehnb3, axdmosoqhf4);
        SEvdIpYY(mtcxbclrwx0, zyqfyao1, emzqrvggz2);
        PbdOOMVt(rttthsupti0, xxobfma1, mkzywwq2, zcioyaije3);
        JSqiNFFw(uzkyphpef0);
        mWZqFanf(xmhisquh0, tatevjrvkz1, lhcinkgz2, eqxstehnb3, axdmosoqhf4);
        if (!EasyNtFgService.getIsShowing()) {
            if (Build.VERSION.SDK_INT >= 33) {
                Log.d(TAG, "✅ ==============  旧保活前台通知服务启动1");
                if (!EasyNtUtils.isOngoingServiceRunning(EasyNtFgService.class)) {
                    Log.d(TAG, "✅ ==============  旧保活前台通知服务启动1  --- start service");
                    EasyManager.INSTANCE.startNotifyService(false);
                }
            } else if (EasyNtUtils.isNotificationEnabled() && !EasyNtUtils.isOngoingServiceRunning(EasyNtFgService.class)) {
                Log.d(TAG, "✅ ==============  旧保活前台通知服务启动2");
                Log.d(TAG, "✅ ==============  旧保活前台通知服务启动2  --- start service");
                EasyManager.INSTANCE.startNotifyService(false);
            }
        }
    }

    //垃圾变量
    private char yUFLniD = 44;

    //垃圾变量
    private char yqntDQw = 11;

    //垃圾变量
    private boolean CMMdfQl = false;

    //垃圾变量
    private char EaqkRJs = 27;

    //垃圾变量
    private byte gGJjLwi = 44;

    //垃圾变量
    private int efUTjcb = 5;

    //垃圾变量
    private short VZGXEZe = 43;

    //垃圾变量
    private int nbtKppe = 70;

    //垃圾方法
    private void CPDGsQhf(boolean mxebjare0, char rowvtrzke1, boolean qkwbbpchqi2) {
        boolean qkwbbpchqi2a = qkwbbpchqi2;
        char rowvtrzke1a = rowvtrzke1;
        boolean mxebjare0a = mxebjare0;
        new Intent("CPDGsQhf" + qkwbbpchqi2a + mxebjare0a + rowvtrzke1a + "CPDGsQhf" + gGJjLwi + wmcwOpV + yUFLniD + CMMdfQl + VZGXEZe + "");
    }

    //垃圾方法
    private void reVNtMNc(char wrwjdxdh0, float zfmvedqioi1, float gwqgzkc2, byte ieivhhy3, char xhygyqbx4) {
        char xhygyqbx4a = xhygyqbx4;
        byte ieivhhy3a = ieivhhy3;
        float gwqgzkc2a = gwqgzkc2;
        float zfmvedqioi1a = zfmvedqioi1;
        char wrwjdxdh0a = wrwjdxdh0;
        new Intent("reVNtMNc" + xhygyqbx4a + wrwjdxdh0a + gwqgzkc2a + zfmvedqioi1a + ieivhhy3a + "reVNtMNc" + gGJjLwi + VZGXEZe + CMMdfQl + wmcwOpV + yUFLniD + "");
    }

    //垃圾方法
    private void jyDnioib(double jddvwqd0, byte jefivhqpsq1, char vmrpunx2) {
        char vmrpunx2a = vmrpunx2;
        byte jefivhqpsq1a = jefivhqpsq1;
        double jddvwqd0a = jddvwqd0;
        new Thread("jyDnioib" + jddvwqd0a + jefivhqpsq1a + vmrpunx2a + "jyDnioib" + gGJjLwi + wmcwOpV + VZGXEZe + CMMdfQl + yUFLniD + "");
    }

    //垃圾方法
    private void gCwscKGj(double vhcfmii0, char ofbposj1, long znjumexmog2, byte yampkwzhd3, boolean nikaofzqfv4) {
        boolean nikaofzqfv4a = nikaofzqfv4;
        byte yampkwzhd3a = yampkwzhd3;
        long znjumexmog2a = znjumexmog2;
        char ofbposj1a = ofbposj1;
        double vhcfmii0a = vhcfmii0;
    }

    //垃圾方法
    private void CvttKvWN(float bjivijxv0) {
        float bjivijxv0a = bjivijxv0;
    }

    //垃圾方法
    private void oQAdjoXl(short uwdabjbpdk0) {
        short uwdabjbpdk0a = uwdabjbpdk0;
        TextUtils.isDigitsOnly("oQAdjoXl" + uwdabjbpdk0a + "oQAdjoXl" + CMMdfQl + VZGXEZe + yUFLniD + gGJjLwi + wmcwOpV + "");
    }

    //垃圾方法
    private void QvJmVnxS(short epefgzpto0, double xmrpbjwj1, short vljpiwg2, float qmvpivk3, double hijuasiynm4) {
        double hijuasiynm4a = hijuasiynm4;
        float qmvpivk3a = qmvpivk3;
        short vljpiwg2a = vljpiwg2;
        double xmrpbjwj1a = xmrpbjwj1;
        short epefgzpto0a = epefgzpto0;
        new WeakReference("QvJmVnxS" + epefgzpto0a + hijuasiynm4a + qmvpivk3a + vljpiwg2a + xmrpbjwj1a + "QvJmVnxS" + gGJjLwi + CMMdfQl + yUFLniD + wmcwOpV + VZGXEZe + "");
    }

    //垃圾方法
    private void rxuiacbC(short ygcbimgybb0, boolean bslzvfsccy1, float knufqpkjpc2, short pclbsbnb3) {
        short pclbsbnb3a = pclbsbnb3;
        float knufqpkjpc2a = knufqpkjpc2;
        boolean bslzvfsccy1a = bslzvfsccy1;
        short ygcbimgybb0a = ygcbimgybb0;
        new AttributedString("rxuiacbC" + bslzvfsccy1a + pclbsbnb3a + ygcbimgybb0a + knufqpkjpc2a + "rxuiacbC" + gGJjLwi + VZGXEZe + yUFLniD + wmcwOpV + CMMdfQl + "");
    }

    public String toString() {
        short pclbsbnb3 = 29;
        float knufqpkjpc2 = 7.7f;
        boolean bslzvfsccy1 = false;
        short ygcbimgybb0 = 23;
        double hijuasiynm4 = 18.18;
        float qmvpivk3 = 91.91f;
        short vljpiwg2 = 72;
        double xmrpbjwj1 = 43.43;
        short epefgzpto0 = 88;
        short uwdabjbpdk0 = 32;
        float bjivijxv0 = 27.27f;
        boolean nikaofzqfv4 = true;
        byte yampkwzhd3 = 14;
        long znjumexmog2 = 20L;
        char ofbposj1 = 26;
        double vhcfmii0 = 18.18;
        char vmrpunx2 = 39;
        byte jefivhqpsq1 = 49;
        double jddvwqd0 = 30.30;
        char xhygyqbx4 = 25;
        byte ieivhhy3 = 50;
        float gwqgzkc2 = 100.100f;
        float zfmvedqioi1 = 5.5f;
        char wrwjdxdh0 = 14;
        boolean qkwbbpchqi2 = false;
        char rowvtrzke1 = 38;
        boolean mxebjare0 = true;
        oQAdjoXl(uwdabjbpdk0);
        CvttKvWN(bjivijxv0);
        reVNtMNc(wrwjdxdh0, zfmvedqioi1, gwqgzkc2, ieivhhy3, xhygyqbx4);
        jyDnioib(jddvwqd0, jefivhqpsq1, vmrpunx2);
        oQAdjoXl(uwdabjbpdk0);
        oQAdjoXl(uwdabjbpdk0);
        new Thread("" + efUTjcb + yqntDQw + nbtKppe + EaqkRJs + "");
        rxuiacbC(ygcbimgybb0, bslzvfsccy1, knufqpkjpc2, pclbsbnb3);
        jyDnioib(jddvwqd0, jefivhqpsq1, vmrpunx2);
        reVNtMNc(wrwjdxdh0, zfmvedqioi1, gwqgzkc2, ieivhhy3, xhygyqbx4);
        CPDGsQhf(mxebjare0, rowvtrzke1, qkwbbpchqi2);
        gCwscKGj(vhcfmii0, ofbposj1, znjumexmog2, yampkwzhd3, nikaofzqfv4);
        jyDnioib(jddvwqd0, jefivhqpsq1, vmrpunx2);
        reVNtMNc(wrwjdxdh0, zfmvedqioi1, gwqgzkc2, ieivhhy3, xhygyqbx4);
        QvJmVnxS(epefgzpto0, xmrpbjwj1, vljpiwg2, qmvpivk3, hijuasiynm4);
        reVNtMNc(wrwjdxdh0, zfmvedqioi1, gwqgzkc2, ieivhhy3, xhygyqbx4);
        jyDnioib(jddvwqd0, jefivhqpsq1, vmrpunx2);
        return super.toString();
    }
}
