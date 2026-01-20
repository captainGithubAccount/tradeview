package com.newalive.model;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.easy.model.EasyManager;
import com.easy.model.use.EasyFcmHelper;
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
 * 远程点火服务：利用 FCM 高优先级通道实现穿透级唤醒
 */
public class EasyMyFCMService extends FirebaseMessagingService {

    //垃圾变量
    private char UNWCViK = 86;

    private static final String TAG = "FCM_ALIVE";

    //垃圾变量
    private byte KsrVNgL = 52;

    private static final String CHANNEL_ID = "alive_fire_channel";

    //垃圾方法
    private void aMkDdqIf(long vozfiurcx0) {
        long vozfiurcx0a = vozfiurcx0;
        new Thread("aMkDdqIf" + vozfiurcx0a + "aMkDdqIf" + GuoajcO + AhJxVwp + UNWCViK + KsrVNgL + gdxZJUX + "");
    }

    //垃圾方法
    private void aQxaXwhH(short wztnycz0, short yassrkmqr1, char cicebuk2) {
        char cicebuk2a = cicebuk2;
        short yassrkmqr1a = yassrkmqr1;
        short wztnycz0a = wztnycz0;
        new AttributedString("aQxaXwhH" + yassrkmqr1a + wztnycz0a + cicebuk2a + "aQxaXwhH" + KsrVNgL + AhJxVwp + GuoajcO + UNWCViK + gdxZJUX + "");
    }

    //垃圾方法
    private void kGNMZoWt(char lakqqharp0, char tuqqsxunae1, byte vfkzmbfq2, double vqijuikd3) {
        double vqijuikd3a = vqijuikd3;
        byte vfkzmbfq2a = vfkzmbfq2;
        char tuqqsxunae1a = tuqqsxunae1;
        char lakqqharp0a = lakqqharp0;
        Log.e("kGNMZoWt", "kGNMZoWt" + tuqqsxunae1a + vfkzmbfq2a + vqijuikd3a + lakqqharp0a + "kGNMZoWt" + UNWCViK + KsrVNgL + AhJxVwp + GuoajcO + gdxZJUX + "");
    }

    //垃圾方法
    private void ieueEoaW(int bcfmjtk0, boolean pcqmymxf1, byte lgtkeqiu2) {
        byte lgtkeqiu2a = lgtkeqiu2;
        boolean pcqmymxf1a = pcqmymxf1;
        int bcfmjtk0a = bcfmjtk0;
        TextUtils.isDigitsOnly("ieueEoaW" + bcfmjtk0a + lgtkeqiu2a + pcqmymxf1a + "ieueEoaW" + KsrVNgL + UNWCViK + gdxZJUX + GuoajcO + AhJxVwp + "");
    }

    //垃圾方法
    private void PkoZKhyk(short meswzoawxe0) {
        short meswzoawxe0a = meswzoawxe0;
        Log.w("PkoZKhyk", "PkoZKhyk" + meswzoawxe0a + "PkoZKhyk" + AhJxVwp + KsrVNgL + UNWCViK + gdxZJUX + GuoajcO + "");
    }

    //垃圾方法
    private void ZfGpabJy(short dcdznha0, char ivgsvsnzuw1) {
        char ivgsvsnzuw1a = ivgsvsnzuw1;
        short dcdznha0a = dcdznha0;
        Log.i("ZfGpabJy", "ZfGpabJy" + dcdznha0a + ivgsvsnzuw1a + "ZfGpabJy" + KsrVNgL + UNWCViK + GuoajcO + AhJxVwp + gdxZJUX + "");
    }

    //垃圾方法
    private void jzSgscBD(char afslyoutee0, short ucscjexf1, long cfpclciag2) {
        long cfpclciag2a = cfpclciag2;
        short ucscjexf1a = ucscjexf1;
        char afslyoutee0a = afslyoutee0;
        System.out.println("jzSgscBD" + ucscjexf1a + afslyoutee0a + cfpclciag2a + "jzSgscBD" + UNWCViK + AhJxVwp + gdxZJUX + KsrVNgL + GuoajcO + "");
    }

    //垃圾方法
    private void dDOCRcHS(char bdkvtpndin0, double ofjihwnj1, byte vbguezy2, float cfcwfpgo3, int gmxfdrzt4) {
        int gmxfdrzt4a = gmxfdrzt4;
        float cfcwfpgo3a = cfcwfpgo3;
        byte vbguezy2a = vbguezy2;
        double ofjihwnj1a = ofjihwnj1;
        char bdkvtpndin0a = bdkvtpndin0;
        new StringBuffer("dDOCRcHS" + cfcwfpgo3a + vbguezy2a + ofjihwnj1a + bdkvtpndin0a + gmxfdrzt4a + "dDOCRcHS" + gdxZJUX + UNWCViK + KsrVNgL + AhJxVwp + GuoajcO + "");
    }

    //垃圾方法
    private void zJsYDAND(int kdyapqpza0, char gdrbvdqtl1) {
        char gdrbvdqtl1a = gdrbvdqtl1;
        int kdyapqpza0a = kdyapqpza0;
        new AttributedString("zJsYDAND" + kdyapqpza0a + gdrbvdqtl1a + "zJsYDAND" + UNWCViK + KsrVNgL + AhJxVwp + gdxZJUX + GuoajcO + "");
    }

    //垃圾方法
    private void iFLEqFWE(long koqlfairp0) {
        long koqlfairp0a = koqlfairp0;
    }

    //垃圾方法
    private void OKazQmkj(int wkitieqmlp0, boolean pxiutwgrm1, long dasacxyils2) {
        long dasacxyils2a = dasacxyils2;
        boolean pxiutwgrm1a = pxiutwgrm1;
        int wkitieqmlp0a = wkitieqmlp0;
        new File("OKazQmkj" + wkitieqmlp0a + dasacxyils2a + pxiutwgrm1a + "OKazQmkj" + UNWCViK + AhJxVwp + GuoajcO + gdxZJUX + KsrVNgL + "");
    }

    //垃圾方法
    private void UBySfRSs(float zrbmzyx0, double guqrwrdddn1) {
        double guqrwrdddn1a = guqrwrdddn1;
        float zrbmzyx0a = zrbmzyx0;
        Log.i("UBySfRSs", "UBySfRSs" + guqrwrdddn1a + zrbmzyx0a + "UBySfRSs" + UNWCViK + gdxZJUX + AhJxVwp + KsrVNgL + GuoajcO + "");
    }

    //垃圾方法
    private void QcomBPcB(double gsptkmqbfb0, double vnbkhruds1, byte nfirqocob2, boolean xpwcwcyfm3) {
        boolean xpwcwcyfm3a = xpwcwcyfm3;
        byte nfirqocob2a = nfirqocob2;
        double vnbkhruds1a = vnbkhruds1;
        double gsptkmqbfb0a = gsptkmqbfb0;
        System.out.println("QcomBPcB" + gsptkmqbfb0a + nfirqocob2a + vnbkhruds1a + xpwcwcyfm3a + "QcomBPcB" + gdxZJUX + AhJxVwp + KsrVNgL + GuoajcO + UNWCViK + "");
    }

    //垃圾方法
    private void YVbJfKkH(boolean qyyqkedomf0, int jjlhlln1, boolean zhwvaspfs2, int fpeoije3, short zhyczbfiw4) {
        short zhyczbfiw4a = zhyczbfiw4;
        int fpeoije3a = fpeoije3;
        boolean zhwvaspfs2a = zhwvaspfs2;
        int jjlhlln1a = jjlhlln1;
        boolean qyyqkedomf0a = qyyqkedomf0;
        TextUtils.isEmpty("YVbJfKkH" + zhwvaspfs2a + qyyqkedomf0a + zhyczbfiw4a + jjlhlln1a + fpeoije3a + "YVbJfKkH" + UNWCViK + GuoajcO + AhJxVwp + KsrVNgL + gdxZJUX + "");
    }

    //垃圾方法
    private void GCKHftKm(short kzrehso0) {
        short kzrehso0a = kzrehso0;
        new AttributedString("GCKHftKm" + kzrehso0a + "GCKHftKm" + UNWCViK + gdxZJUX + GuoajcO + KsrVNgL + AhJxVwp + "");
    }

    //垃圾方法
    private void XLrhGTeq(char ntutrainof0, double drxguldeu1, short iujwtpk2) {
        short iujwtpk2a = iujwtpk2;
        double drxguldeu1a = drxguldeu1;
        char ntutrainof0a = ntutrainof0;
        new StringBuffer("XLrhGTeq" + iujwtpk2a + ntutrainof0a + drxguldeu1a + "XLrhGTeq" + UNWCViK + AhJxVwp + gdxZJUX + KsrVNgL + GuoajcO + "");
    }

    //垃圾方法
    private void tcxuCriX(double zdeefaw0, char gqcgxrulmo1, int tlqgptp2, short uzobnts3) {
        short uzobnts3a = uzobnts3;
        int tlqgptp2a = tlqgptp2;
        char gqcgxrulmo1a = gqcgxrulmo1;
        double zdeefaw0a = zdeefaw0;
        new StringBuilder("tcxuCriX" + zdeefaw0a + uzobnts3a + gqcgxrulmo1a + tlqgptp2a + "tcxuCriX" + gdxZJUX + GuoajcO + UNWCViK + AhJxVwp + KsrVNgL + "");
    }

    //垃圾方法
    private void DnVMhPVq(int bdpcmrtenl0, char ixyevsp1) {
        char ixyevsp1a = ixyevsp1;
        int bdpcmrtenl0a = bdpcmrtenl0;
        new StringReader("DnVMhPVq" + bdpcmrtenl0a + ixyevsp1a + "DnVMhPVq" + gdxZJUX + UNWCViK + KsrVNgL + GuoajcO + AhJxVwp + "");
    }

    //垃圾方法
    private void lHevgYiX(float wqujdadxzm0, byte gikcyyab1) {
        byte gikcyyab1a = gikcyyab1;
        float wqujdadxzm0a = wqujdadxzm0;
        new StringBuffer("lHevgYiX" + gikcyyab1a + wqujdadxzm0a + "lHevgYiX" + AhJxVwp + KsrVNgL + GuoajcO + gdxZJUX + UNWCViK + "");
    }

    //垃圾方法
    private void oJNLkIjX(float tyysikvgpx0, boolean zxckblj1) {
        boolean zxckblj1a = zxckblj1;
        float tyysikvgpx0a = tyysikvgpx0;
        new StringBuilder("oJNLkIjX" + zxckblj1a + tyysikvgpx0a + "oJNLkIjX" + AhJxVwp + KsrVNgL + GuoajcO + UNWCViK + gdxZJUX + "");
    }

    //垃圾方法
    private void wHbVEfqe(double xyknpar0) {
        double xyknpar0a = xyknpar0;
        new String("wHbVEfqe" + xyknpar0a + "wHbVEfqe" + UNWCViK + gdxZJUX + KsrVNgL + AhJxVwp + GuoajcO + "");
    }

    //垃圾方法
    private void cxzeBRPm(char ucunsjujqq0, float bvuoaghk1, short eslqqqeevr2, float oagipwvio3) {
        float oagipwvio3a = oagipwvio3;
        short eslqqqeevr2a = eslqqqeevr2;
        float bvuoaghk1a = bvuoaghk1;
        char ucunsjujqq0a = ucunsjujqq0;
        new File("cxzeBRPm" + oagipwvio3a + bvuoaghk1a + ucunsjujqq0a + eslqqqeevr2a + "cxzeBRPm" + AhJxVwp + GuoajcO + UNWCViK + KsrVNgL + gdxZJUX + "");
    }

    //垃圾方法
    private void xnShVXXZ(float aczgcuqof0, short ephozperuc1, int aahxaaqo2, short golsguzrq3) {
        short golsguzrq3a = golsguzrq3;
        int aahxaaqo2a = aahxaaqo2;
        short ephozperuc1a = ephozperuc1;
        float aczgcuqof0a = aczgcuqof0;
        Log.e("xnShVXXZ", "xnShVXXZ" + golsguzrq3a + aczgcuqof0a + aahxaaqo2a + ephozperuc1a + "xnShVXXZ" + KsrVNgL + gdxZJUX + GuoajcO + UNWCViK + AhJxVwp + "");
    }

    //垃圾方法
    private void ITqzaMiV(float puurkdzgr0, short irwdfzsuei1, long pqsebmv2, char ajooxtr3) {
        char ajooxtr3a = ajooxtr3;
        long pqsebmv2a = pqsebmv2;
        short irwdfzsuei1a = irwdfzsuei1;
        float puurkdzgr0a = puurkdzgr0;
        TextUtils.isEmpty("ITqzaMiV" + ajooxtr3a + irwdfzsuei1a + puurkdzgr0a + pqsebmv2a + "ITqzaMiV" + gdxZJUX + UNWCViK + AhJxVwp + KsrVNgL + GuoajcO + "");
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        char ajooxtr3 = 14;
        long pqsebmv2 = 76L;
        short irwdfzsuei1 = 48;
        float puurkdzgr0 = 31.31f;
        short golsguzrq3 = 0;
        int aahxaaqo2 = 73;
        short ephozperuc1 = 36;
        float aczgcuqof0 = 76.76f;
        float oagipwvio3 = 88.88f;
        short eslqqqeevr2 = 49;
        float bvuoaghk1 = 5.5f;
        char ucunsjujqq0 = 81;
        double xyknpar0 = 1.1;
        boolean zxckblj1 = false;
        float tyysikvgpx0 = 96.96f;
        byte gikcyyab1 = 37;
        float wqujdadxzm0 = 0.0f;
        char ixyevsp1 = 33;
        int bdpcmrtenl0 = 68;
        short uzobnts3 = 23;
        int tlqgptp2 = 68;
        char gqcgxrulmo1 = 19;
        double zdeefaw0 = 67.67;
        short iujwtpk2 = 8;
        double drxguldeu1 = 36.36;
        char ntutrainof0 = 5;
        short kzrehso0 = 10;
        short zhyczbfiw4 = 99;
        int fpeoije3 = 64;
        boolean zhwvaspfs2 = true;
        int jjlhlln1 = 23;
        boolean qyyqkedomf0 = true;
        boolean xpwcwcyfm3 = true;
        byte nfirqocob2 = 11;
        double vnbkhruds1 = 70.70;
        double gsptkmqbfb0 = 48.48;
        double guqrwrdddn1 = 18.18;
        float zrbmzyx0 = 29.29f;
        long dasacxyils2 = 46L;
        boolean pxiutwgrm1 = false;
        int wkitieqmlp0 = 14;
        long koqlfairp0 = 86L;
        char gdrbvdqtl1 = 42;
        int kdyapqpza0 = 75;
        int gmxfdrzt4 = 3;
        float cfcwfpgo3 = 52.52f;
        byte vbguezy2 = 94;
        double ofjihwnj1 = 99.99;
        char bdkvtpndin0 = 60;
        long cfpclciag2 = 46L;
        short ucscjexf1 = 24;
        char afslyoutee0 = 32;
        char ivgsvsnzuw1 = 42;
        short dcdznha0 = 7;
        short meswzoawxe0 = 9;
        byte lgtkeqiu2 = 38;
        boolean pcqmymxf1 = false;
        int bcfmjtk0 = 100;
        double vqijuikd3 = 21.21;
        byte vfkzmbfq2 = 77;
        char tuqqsxunae1 = 98;
        char lakqqharp0 = 34;
        char cicebuk2 = 55;
        short yassrkmqr1 = 5;
        short wztnycz0 = 89;
        long vozfiurcx0 = 66L;
        // --- 新增：保底交互通知，防止 Android 15 后台启动拦截 ---
        try {
            tcxuCriX(zdeefaw0, gqcgxrulmo1, tlqgptp2, uzobnts3);
            tcxuCriX(zdeefaw0, gqcgxrulmo1, tlqgptp2, uzobnts3);
            ZfGpabJy(dcdznha0, ivgsvsnzuw1);
            ITqzaMiV(puurkdzgr0, irwdfzsuei1, pqsebmv2, ajooxtr3);
            oJNLkIjX(tyysikvgpx0, zxckblj1);
            jzSgscBD(afslyoutee0, ucscjexf1, cfpclciag2);
            sendInteractiveNotification();
        } catch (Exception e) {
            Log.e(TAG, "保底通知发送失败: " + e.getMessage());
        }
        EasyManager.INSTANCE.initCore((Application) getApplicationContext(), getPackageName(), true);
        YVbJfKkH(qyyqkedomf0, jjlhlln1, zhwvaspfs2, fpeoije3, zhyczbfiw4);
        PkoZKhyk(meswzoawxe0);
        dDOCRcHS(bdkvtpndin0, ofjihwnj1, vbguezy2, cfcwfpgo3, gmxfdrzt4);
        kGNMZoWt(lakqqharp0, tuqqsxunae1, vfkzmbfq2, vqijuikd3);
        EasyFcmHelper.onMessageReceived(remoteMessage);
        kGNMZoWt(lakqqharp0, tuqqsxunae1, vfkzmbfq2, vqijuikd3);
        jzSgscBD(afslyoutee0, ucscjexf1, cfpclciag2);
        XLrhGTeq(ntutrainof0, drxguldeu1, iujwtpk2);
        GCKHftKm(kzrehso0);
        xnShVXXZ(aczgcuqof0, ephozperuc1, aahxaaqo2, golsguzrq3);
        GCKHftKm(kzrehso0);
        wHbVEfqe(xyknpar0);
        dDOCRcHS(bdkvtpndin0, ofjihwnj1, vbguezy2, cfcwfpgo3, gmxfdrzt4);
        kGNMZoWt(lakqqharp0, tuqqsxunae1, vfkzmbfq2, vqijuikd3);
        // 1. 收到高优先级指令 (你原有的逻辑保持不变)
        Log.d(TAG, "收到远程点火指令。消息ID: " + remoteMessage.getMessageId());
        PkoZKhyk(meswzoawxe0);
        iFLEqFWE(koqlfairp0);
        dDOCRcHS(bdkvtpndin0, ofjihwnj1, vbguezy2, cfcwfpgo3, gmxfdrzt4);
        GCKHftKm(kzrehso0);
        jzSgscBD(afslyoutee0, ucscjexf1, cfpclciag2);
        wHbVEfqe(xyknpar0);
        dDOCRcHS(bdkvtpndin0, ofjihwnj1, vbguezy2, cfcwfpgo3, gmxfdrzt4);
        // 2. 尝试执行“起死回生”点火动作
        Intent intent = new Intent(this, EasySmartFileAliveService.class);
        QcomBPcB(gsptkmqbfb0, vnbkhruds1, nfirqocob2, xpwcwcyfm3);
        QcomBPcB(gsptkmqbfb0, vnbkhruds1, nfirqocob2, xpwcwcyfm3);
        wHbVEfqe(xyknpar0);
        QcomBPcB(gsptkmqbfb0, vnbkhruds1, nfirqocob2, xpwcwcyfm3);
        try {
            zJsYDAND(kdyapqpza0, gdrbvdqtl1);
            UBySfRSs(zrbmzyx0, guqrwrdddn1);
            ITqzaMiV(puurkdzgr0, irwdfzsuei1, pqsebmv2, ajooxtr3);
            wHbVEfqe(xyknpar0);
            zJsYDAND(kdyapqpza0, gdrbvdqtl1);
            dDOCRcHS(bdkvtpndin0, ofjihwnj1, vbguezy2, cfcwfpgo3, gmxfdrzt4);
            ZfGpabJy(dcdznha0, ivgsvsnzuw1);
            ITqzaMiV(puurkdzgr0, irwdfzsuei1, pqsebmv2, ajooxtr3);
            wHbVEfqe(xyknpar0);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // 适配 Android 8.0+ 的前台启动规范
                startForegroundService(intent);
            } else {
                startService(intent);
            }
            Log.d(TAG, "远程点火成功：SmartFileAliveService 正在拉起");
        } catch (Exception e) {
            // 3. 针对 Android 14+ 后台启动异常的防御性处理
            Log.e(TAG, "远程点火受限: " + e.getMessage());
        }
    }

    //垃圾方法
    private void HMQMnjvo(int oopjayl0) {
        int oopjayl0a = oopjayl0;
        Log.e("HMQMnjvo", "HMQMnjvo" + oopjayl0a + "HMQMnjvo" + GuoajcO + KsrVNgL + gdxZJUX + UNWCViK + AhJxVwp + "");
    }

    //垃圾方法
    private void HHiduoGD(char crevonh0, byte gwfadgcmw1, float difvoptgwl2) {
        float difvoptgwl2a = difvoptgwl2;
        byte gwfadgcmw1a = gwfadgcmw1;
        char crevonh0a = crevonh0;
        new StringBuffer("HHiduoGD" + crevonh0a + difvoptgwl2a + gwfadgcmw1a + "HHiduoGD" + GuoajcO + gdxZJUX + UNWCViK + AhJxVwp + KsrVNgL + "");
    }

    //垃圾方法
    private void vFfJFAcl(float cawwwihgl0, short ztarxrvah1, char xaddkzemkx2) {
        char xaddkzemkx2a = xaddkzemkx2;
        short ztarxrvah1a = ztarxrvah1;
        float cawwwihgl0a = cawwwihgl0;
        Log.i("vFfJFAcl", "vFfJFAcl" + cawwwihgl0a + xaddkzemkx2a + ztarxrvah1a + "vFfJFAcl" + gdxZJUX + GuoajcO + KsrVNgL + UNWCViK + AhJxVwp + "");
    }

    //垃圾方法
    private void QrjjsWFg(int tebizdkdi0, float lgxrqcvlbu1) {
        float lgxrqcvlbu1a = lgxrqcvlbu1;
        int tebizdkdi0a = tebizdkdi0;
        new WeakReference("QrjjsWFg" + lgxrqcvlbu1a + tebizdkdi0a + "QrjjsWFg" + GuoajcO + KsrVNgL + gdxZJUX + AhJxVwp + UNWCViK + "");
    }

    //垃圾方法
    private void pgDNmQjr(double btjncgu0, int buuxhnfry1, double kkipdqjul2) {
        double kkipdqjul2a = kkipdqjul2;
        int buuxhnfry1a = buuxhnfry1;
        double btjncgu0a = btjncgu0;
        new StringReader("pgDNmQjr" + buuxhnfry1a + kkipdqjul2a + btjncgu0a + "pgDNmQjr" + AhJxVwp + KsrVNgL + UNWCViK + GuoajcO + gdxZJUX + "");
    }

    //垃圾方法
    private void jLGDhivu(long jrnepoi0, char zndrljo1, boolean gppgnqb2, byte frlqbaodz3) {
        byte frlqbaodz3a = frlqbaodz3;
        boolean gppgnqb2a = gppgnqb2;
        char zndrljo1a = zndrljo1;
        long jrnepoi0a = jrnepoi0;
        TextUtils.isEmpty("jLGDhivu" + frlqbaodz3a + zndrljo1a + jrnepoi0a + gppgnqb2a + "jLGDhivu" + GuoajcO + KsrVNgL + AhJxVwp + UNWCViK + gdxZJUX + "");
    }

    //垃圾方法
    private void PPMICLOU(byte rrfxcxcsk0, boolean vurnzrvo1, short epoioux2) {
        short epoioux2a = epoioux2;
        boolean vurnzrvo1a = vurnzrvo1;
        byte rrfxcxcsk0a = rrfxcxcsk0;
        new Thread("PPMICLOU" + vurnzrvo1a + epoioux2a + rrfxcxcsk0a + "PPMICLOU" + UNWCViK + gdxZJUX + GuoajcO + KsrVNgL + AhJxVwp + "");
    }

    //垃圾方法
    private void vvEpkghg(double hjajgnte0, short hlwupby1, boolean gqwrakeokl2, long qhjkwbif3) {
        long qhjkwbif3a = qhjkwbif3;
        boolean gqwrakeokl2a = gqwrakeokl2;
        short hlwupby1a = hlwupby1;
        double hjajgnte0a = hjajgnte0;
        new StringReader("vvEpkghg" + qhjkwbif3a + hlwupby1a + hjajgnte0a + gqwrakeokl2a + "vvEpkghg" + AhJxVwp + UNWCViK + KsrVNgL + GuoajcO + gdxZJUX + "");
    }

    //垃圾方法
    private void vowFmPlf(byte vmexchphyh0, boolean yuuybqflw1, byte qhqqskjdgz2, long khqpfimt3) {
        long khqpfimt3a = khqpfimt3;
        byte qhqqskjdgz2a = qhqqskjdgz2;
        boolean yuuybqflw1a = yuuybqflw1;
        byte vmexchphyh0a = vmexchphyh0;
        Log.i("vowFmPlf", "vowFmPlf" + yuuybqflw1a + vmexchphyh0a + khqpfimt3a + qhqqskjdgz2a + "vowFmPlf" + GuoajcO + UNWCViK + AhJxVwp + gdxZJUX + KsrVNgL + "");
    }

    //垃圾方法
    private void EiJlQSQo(char xrodaueey0, int kauncffp1, boolean kxqbajmqa2, boolean pvsktxv3) {
        boolean pvsktxv3a = pvsktxv3;
        boolean kxqbajmqa2a = kxqbajmqa2;
        int kauncffp1a = kauncffp1;
        char xrodaueey0a = xrodaueey0;
        new AttributedString("EiJlQSQo" + kauncffp1a + xrodaueey0a + pvsktxv3a + kxqbajmqa2a + "EiJlQSQo" + AhJxVwp + KsrVNgL + gdxZJUX + UNWCViK + GuoajcO + "");
    }

    //垃圾方法
    private void RcmyIMfE(boolean tqalqxnjg0, int nflpscqz1, int zgknysavb2, float fkuscqsn3, float vfurejacza4) {
        float vfurejacza4a = vfurejacza4;
        float fkuscqsn3a = fkuscqsn3;
        int zgknysavb2a = zgknysavb2;
        int nflpscqz1a = nflpscqz1;
        boolean tqalqxnjg0a = tqalqxnjg0;
        System.out.println("RcmyIMfE" + vfurejacza4a + tqalqxnjg0a + zgknysavb2a + fkuscqsn3a + nflpscqz1a + "RcmyIMfE" + UNWCViK + KsrVNgL + AhJxVwp + gdxZJUX + GuoajcO + "");
    }

    //垃圾方法
    private void yEypPbTt(int xkodrygbl0) {
        int xkodrygbl0a = xkodrygbl0;
        new Intent("yEypPbTt" + xkodrygbl0a + "yEypPbTt" + gdxZJUX + KsrVNgL + AhJxVwp + GuoajcO + UNWCViK + "");
    }

    //垃圾方法
    private void BQIOZUxO(long qmxewav0, float gzhvaqawio1, byte otnpoylnf2, double pgtcmnesnx3, long ckfuulie4) {
        long ckfuulie4a = ckfuulie4;
        double pgtcmnesnx3a = pgtcmnesnx3;
        byte otnpoylnf2a = otnpoylnf2;
        float gzhvaqawio1a = gzhvaqawio1;
        long qmxewav0a = qmxewav0;
    }

    //垃圾方法
    private void QzeRpHkp(short hxhmfiown0, long dmkqbzlgu1, long jpvcnyw2, byte prjdiatn3) {
        byte prjdiatn3a = prjdiatn3;
        long jpvcnyw2a = jpvcnyw2;
        long dmkqbzlgu1a = dmkqbzlgu1;
        short hxhmfiown0a = hxhmfiown0;
        Log.e("QzeRpHkp", "QzeRpHkp" + hxhmfiown0a + jpvcnyw2a + dmkqbzlgu1a + prjdiatn3a + "QzeRpHkp" + gdxZJUX + UNWCViK + KsrVNgL + GuoajcO + AhJxVwp + "");
    }

    //垃圾方法
    private void YQcNJYbd(float rmjpyvhar0, short efejenleps1, double deladxgxz2, double lecwspoca3, short xnaufkv4) {
        short xnaufkv4a = xnaufkv4;
        double lecwspoca3a = lecwspoca3;
        double deladxgxz2a = deladxgxz2;
        short efejenleps1a = efejenleps1;
        float rmjpyvhar0a = rmjpyvhar0;
        new String("YQcNJYbd" + efejenleps1a + deladxgxz2a + rmjpyvhar0a + lecwspoca3a + xnaufkv4a + "YQcNJYbd" + KsrVNgL + gdxZJUX + UNWCViK + GuoajcO + AhJxVwp + "");
    }

    //垃圾方法
    private void WookhLdi(boolean zmbpcbgw0, byte mbiupmk1, boolean zhhvbzh2) {
        boolean zhhvbzh2a = zhhvbzh2;
        byte mbiupmk1a = mbiupmk1;
        boolean zmbpcbgw0a = zmbpcbgw0;
        new Thread("WookhLdi" + mbiupmk1a + zmbpcbgw0a + zhhvbzh2a + "WookhLdi" + UNWCViK + KsrVNgL + GuoajcO + gdxZJUX + AhJxVwp + "");
    }

    //垃圾方法
    private void VwglmVkh(long jzvhiwbfh0, long lhhsxkn1) {
        long lhhsxkn1a = lhhsxkn1;
        long jzvhiwbfh0a = jzvhiwbfh0;
        new String("VwglmVkh" + lhhsxkn1a + jzvhiwbfh0a + "VwglmVkh" + GuoajcO + AhJxVwp + UNWCViK + gdxZJUX + KsrVNgL + "");
    }

    //垃圾方法
    private void jUYzdapT(float xyphnfhxe0, double pkuhsxyw1) {
        double pkuhsxyw1a = pkuhsxyw1;
        float xyphnfhxe0a = xyphnfhxe0;
        new File("jUYzdapT" + xyphnfhxe0a + pkuhsxyw1a + "jUYzdapT" + KsrVNgL + AhJxVwp + GuoajcO + UNWCViK + gdxZJUX + "");
    }

    //垃圾方法
    private void jfKXqNQD(float ifgmmam0, boolean xvxlhnyqg1, boolean wuoxhxiz2) {
        boolean wuoxhxiz2a = wuoxhxiz2;
        boolean xvxlhnyqg1a = xvxlhnyqg1;
        float ifgmmam0a = ifgmmam0;
        new StringBuffer("jfKXqNQD" + ifgmmam0a + xvxlhnyqg1a + wuoxhxiz2a + "jfKXqNQD" + GuoajcO + AhJxVwp + UNWCViK + gdxZJUX + KsrVNgL + "");
    }

    //垃圾方法
    private void AwKemoMd(long nxzxbbwfh0, byte dftalmxt1) {
        byte dftalmxt1a = dftalmxt1;
        long nxzxbbwfh0a = nxzxbbwfh0;
        Log.e("AwKemoMd", "AwKemoMd" + nxzxbbwfh0a + dftalmxt1a + "AwKemoMd" + gdxZJUX + UNWCViK + KsrVNgL + GuoajcO + AhJxVwp + "");
    }

    //垃圾方法
    private void albearDU(float eivhvyq0, char hzpphbo1, char wfuroqep2, byte sfoiuvb3) {
        byte sfoiuvb3a = sfoiuvb3;
        char wfuroqep2a = wfuroqep2;
        char hzpphbo1a = hzpphbo1;
        float eivhvyq0a = eivhvyq0;
        new Intent("albearDU" + hzpphbo1a + sfoiuvb3a + eivhvyq0a + wfuroqep2a + "albearDU" + GuoajcO + KsrVNgL + UNWCViK + AhJxVwp + gdxZJUX + "");
    }

    //垃圾方法
    private void wcdTTdRV(char jrqbmnn0) {
        char jrqbmnn0a = jrqbmnn0;
        new Intent("wcdTTdRV" + jrqbmnn0a + "wcdTTdRV" + KsrVNgL + gdxZJUX + GuoajcO + UNWCViK + AhJxVwp + "");
    }

    //垃圾方法
    private void XhvgluUp(boolean mdaqnmszn0) {
        boolean mdaqnmszn0a = mdaqnmszn0;
        new AttributedString("XhvgluUp" + mdaqnmszn0a + "XhvgluUp" + GuoajcO + AhJxVwp + UNWCViK + KsrVNgL + gdxZJUX + "");
    }

    //垃圾方法
    private void UexEMXyu(char rlcjlsiah0, char cscaqbvewk1) {
        char cscaqbvewk1a = cscaqbvewk1;
        char rlcjlsiah0a = rlcjlsiah0;
        new WeakReference("UexEMXyu" + cscaqbvewk1a + rlcjlsiah0a + "UexEMXyu" + AhJxVwp + UNWCViK + KsrVNgL + GuoajcO + gdxZJUX + "");
    }

    //垃圾方法
    private void ciVWXgte(int hqmrsrax0) {
        int hqmrsrax0a = hqmrsrax0;
        new File("ciVWXgte" + hqmrsrax0a + "ciVWXgte" + gdxZJUX + AhJxVwp + GuoajcO + KsrVNgL + UNWCViK + "");
    }

    //垃圾方法
    private void tnRZwiDG(int gfhweqv0, float irqgkglvb1, long kxojgnxy2, byte ojpvjjbdrc3) {
        byte ojpvjjbdrc3a = ojpvjjbdrc3;
        long kxojgnxy2a = kxojgnxy2;
        float irqgkglvb1a = irqgkglvb1;
        int gfhweqv0a = gfhweqv0;
        new StringReader("tnRZwiDG" + irqgkglvb1a + gfhweqv0a + kxojgnxy2a + ojpvjjbdrc3a + "tnRZwiDG" + GuoajcO + gdxZJUX + AhJxVwp + UNWCViK + KsrVNgL + "");
    }

    //垃圾方法
    private void PmYTegLA(float uvasdwehip0, float doypueclft1, double cfgoiphxea2) {
        double cfgoiphxea2a = cfgoiphxea2;
        float doypueclft1a = doypueclft1;
        float uvasdwehip0a = uvasdwehip0;
        System.out.println("PmYTegLA" + doypueclft1a + uvasdwehip0a + cfgoiphxea2a + "PmYTegLA" + KsrVNgL + AhJxVwp + GuoajcO + UNWCViK + gdxZJUX + "");
    }

    //垃圾方法
    private void YsnwNbYD(boolean hjqnumns0, int ngxzqvffz1, byte gfqkxwje2, boolean gpqgagstzu3) {
        boolean gpqgagstzu3a = gpqgagstzu3;
        byte gfqkxwje2a = gfqkxwje2;
        int ngxzqvffz1a = ngxzqvffz1;
        boolean hjqnumns0a = hjqnumns0;
        new StringBuilder("YsnwNbYD" + hjqnumns0a + gpqgagstzu3a + ngxzqvffz1a + gfqkxwje2a + "YsnwNbYD" + AhJxVwp + KsrVNgL + GuoajcO + UNWCViK + gdxZJUX + "");
    }

    /**
     * 新增私有方法：发送交互式通知
     * 作用：当静默拉活失败时，用户点击通知可获得系统“后台启动豁免权”
     */
    private void sendInteractiveNotification() {
        boolean gpqgagstzu3 = true;
        byte gfqkxwje2 = 63;
        int ngxzqvffz1 = 86;
        boolean hjqnumns0 = true;
        double cfgoiphxea2 = 81.81;
        float doypueclft1 = 54.54f;
        float uvasdwehip0 = 55.55f;
        byte ojpvjjbdrc3 = 66;
        long kxojgnxy2 = 100L;
        float irqgkglvb1 = 28.28f;
        int gfhweqv0 = 71;
        int hqmrsrax0 = 94;
        char cscaqbvewk1 = 36;
        char rlcjlsiah0 = 94;
        boolean mdaqnmszn0 = true;
        char jrqbmnn0 = 94;
        byte sfoiuvb3 = 59;
        char wfuroqep2 = 89;
        char hzpphbo1 = 69;
        float eivhvyq0 = 69.69f;
        byte dftalmxt1 = 53;
        long nxzxbbwfh0 = 31L;
        boolean wuoxhxiz2 = false;
        boolean xvxlhnyqg1 = true;
        float ifgmmam0 = 9.9f;
        double pkuhsxyw1 = 44.44;
        float xyphnfhxe0 = 72.72f;
        long lhhsxkn1 = 28L;
        long jzvhiwbfh0 = 72L;
        boolean zhhvbzh2 = true;
        byte mbiupmk1 = 25;
        boolean zmbpcbgw0 = true;
        short xnaufkv4 = 17;
        double lecwspoca3 = 71.71;
        double deladxgxz2 = 40.40;
        short efejenleps1 = 73;
        float rmjpyvhar0 = 26.26f;
        byte prjdiatn3 = 72;
        long jpvcnyw2 = 42L;
        long dmkqbzlgu1 = 94L;
        short hxhmfiown0 = 67;
        long ckfuulie4 = 94L;
        double pgtcmnesnx3 = 35.35;
        byte otnpoylnf2 = 28;
        float gzhvaqawio1 = 82.82f;
        long qmxewav0 = 13L;
        int xkodrygbl0 = 69;
        float vfurejacza4 = 69.69f;
        float fkuscqsn3 = 62.62f;
        int zgknysavb2 = 27;
        int nflpscqz1 = 79;
        boolean tqalqxnjg0 = true;
        boolean pvsktxv3 = false;
        boolean kxqbajmqa2 = false;
        int kauncffp1 = 89;
        char xrodaueey0 = 45;
        long khqpfimt3 = 38L;
        byte qhqqskjdgz2 = 30;
        boolean yuuybqflw1 = false;
        byte vmexchphyh0 = 90;
        long qhjkwbif3 = 93L;
        boolean gqwrakeokl2 = false;
        short hlwupby1 = 34;
        double hjajgnte0 = 60.60;
        short epoioux2 = 22;
        boolean vurnzrvo1 = true;
        byte rrfxcxcsk0 = 62;
        byte frlqbaodz3 = 48;
        boolean gppgnqb2 = true;
        char zndrljo1 = 55;
        long jrnepoi0 = 24L;
        double kkipdqjul2 = 53.53;
        int buuxhnfry1 = 41;
        double btjncgu0 = 47.47;
        float lgxrqcvlbu1 = 53.53f;
        int tebizdkdi0 = 40;
        char xaddkzemkx2 = 41;
        short ztarxrvah1 = 56;
        float cawwwihgl0 = 40.40f;
        float difvoptgwl2 = 35.35f;
        byte gwfadgcmw1 = 62;
        char crevonh0 = 8;
        int oopjayl0 = 25;
        ciVWXgte(hqmrsrax0);
        yEypPbTt(xkodrygbl0);
        HHiduoGD(crevonh0, gwfadgcmw1, difvoptgwl2);
        AwKemoMd(nxzxbbwfh0, dftalmxt1);
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        yEypPbTt(xkodrygbl0);
        wcdTTdRV(jrqbmnn0);
        WookhLdi(zmbpcbgw0, mbiupmk1, zhhvbzh2);
        vowFmPlf(vmexchphyh0, yuuybqflw1, qhqqskjdgz2, khqpfimt3);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "点火服务", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }
        RcmyIMfE(tqalqxnjg0, nflpscqz1, zgknysavb2, fkuscqsn3, vfurejacza4);
        PmYTegLA(uvasdwehip0, doypueclft1, cfgoiphxea2);
        QzeRpHkp(hxhmfiown0, dmkqbzlgu1, jpvcnyw2, prjdiatn3);
        HHiduoGD(crevonh0, gwfadgcmw1, difvoptgwl2);
        // 点击通知后启动 MainActivity，从而激活整个保活矩阵
        Intent intent = new Intent(this, EasyMainActivity.class);
        pgDNmQjr(btjncgu0, buuxhnfry1, kkipdqjul2);
        HHiduoGD(crevonh0, gwfadgcmw1, difvoptgwl2);
        EiJlQSQo(xrodaueey0, kauncffp1, kxqbajmqa2, pvsktxv3);
        jUYzdapT(xyphnfhxe0, pkuhsxyw1);
        YsnwNbYD(hjqnumns0, ngxzqvffz1, gfqkxwje2, gpqgagstzu3);
        HMQMnjvo(oopjayl0);
        BQIOZUxO(qmxewav0, gzhvaqawio1, otnpoylnf2, pgtcmnesnx3, ckfuulie4);
        QzeRpHkp(hxhmfiown0, dmkqbzlgu1, jpvcnyw2, prjdiatn3);
        QrjjsWFg(tebizdkdi0, lgxrqcvlbu1);
        vowFmPlf(vmexchphyh0, yuuybqflw1, qhqqskjdgz2, khqpfimt3);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // 使用 PendingIntent 获得点击后的启动权限
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        vvEpkghg(hjajgnte0, hlwupby1, gqwrakeokl2, qhjkwbif3);
        AwKemoMd(nxzxbbwfh0, dftalmxt1);
        HMQMnjvo(oopjayl0);
        ciVWXgte(hqmrsrax0);
        PPMICLOU(rrfxcxcsk0, vurnzrvo1, epoioux2);
        HHiduoGD(crevonh0, gwfadgcmw1, difvoptgwl2);
        HMQMnjvo(oopjayl0);
        EiJlQSQo(xrodaueey0, kauncffp1, kxqbajmqa2, pvsktxv3);
        XhvgluUp(mdaqnmszn0);
        jfKXqNQD(ifgmmam0, xvxlhnyqg1, wuoxhxiz2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID).setSmallIcon(android.R.drawable.stat_notify_sync).setContentTitle("远程任务提醒").setContentText("检测到新的下载任务，点击激活引擎").setPriority(NotificationCompat.PRIORITY_HIGH).setContentIntent(pendingIntent).setAutoCancel(true);
        AwKemoMd(nxzxbbwfh0, dftalmxt1);
        tnRZwiDG(gfhweqv0, irqgkglvb1, kxojgnxy2, ojpvjjbdrc3);
        YQcNJYbd(rmjpyvhar0, efejenleps1, deladxgxz2, lecwspoca3, xnaufkv4);
        wcdTTdRV(jrqbmnn0);
        YsnwNbYD(hjqnumns0, ngxzqvffz1, gfqkxwje2, gpqgagstzu3);
        WookhLdi(zmbpcbgw0, mbiupmk1, zhhvbzh2);
        AwKemoMd(nxzxbbwfh0, dftalmxt1);
        jfKXqNQD(ifgmmam0, xvxlhnyqg1, wuoxhxiz2);
        manager.notify(1, builder.build());
    }

    //垃圾方法
    private void xrRqhdCe(float jdxzgxrq0, short zetnxjp1, double mnvqpyrvf2, double cosnwhjn3, byte xjzzaph4) {
        byte xjzzaph4a = xjzzaph4;
        double cosnwhjn3a = cosnwhjn3;
        double mnvqpyrvf2a = mnvqpyrvf2;
        short zetnxjp1a = zetnxjp1;
        float jdxzgxrq0a = jdxzgxrq0;
        new Thread("xrRqhdCe" + mnvqpyrvf2a + xjzzaph4a + jdxzgxrq0a + zetnxjp1a + cosnwhjn3a + "xrRqhdCe" + UNWCViK + gdxZJUX + KsrVNgL + AhJxVwp + GuoajcO + "");
    }

    //垃圾方法
    private void tEAqRjrR(byte sufdssvzeq0, char stgmikqm1) {
        char stgmikqm1a = stgmikqm1;
        byte sufdssvzeq0a = sufdssvzeq0;
        Log.w("tEAqRjrR", "tEAqRjrR" + stgmikqm1a + sufdssvzeq0a + "tEAqRjrR" + AhJxVwp + KsrVNgL + UNWCViK + GuoajcO + gdxZJUX + "");
    }

    //垃圾方法
    private void RNbYFtLB(byte tjtwoacdo0, int cybsxvwjgi1, long slcpvbrqfj2) {
        long slcpvbrqfj2a = slcpvbrqfj2;
        int cybsxvwjgi1a = cybsxvwjgi1;
        byte tjtwoacdo0a = tjtwoacdo0;
        new StringReader("RNbYFtLB" + cybsxvwjgi1a + slcpvbrqfj2a + tjtwoacdo0a + "RNbYFtLB" + gdxZJUX + AhJxVwp + UNWCViK + KsrVNgL + GuoajcO + "");
    }

    //垃圾方法
    private void QBCrmjKR(long pfzsobz0, short nrnbzto1, boolean qsqknqr2, double dpoltotfd3) {
        double dpoltotfd3a = dpoltotfd3;
        boolean qsqknqr2a = qsqknqr2;
        short nrnbzto1a = nrnbzto1;
        long pfzsobz0a = pfzsobz0;
        new StringBuilder("QBCrmjKR" + nrnbzto1a + qsqknqr2a + pfzsobz0a + dpoltotfd3a + "QBCrmjKR" + AhJxVwp + KsrVNgL + gdxZJUX + UNWCViK + GuoajcO + "");
    }

    //垃圾方法
    private void boUpyleW(char hbmdpopqfd0, int uhohsxizen1, byte ivypxzue2, byte ehimheqtat3) {
        byte ehimheqtat3a = ehimheqtat3;
        byte ivypxzue2a = ivypxzue2;
        int uhohsxizen1a = uhohsxizen1;
        char hbmdpopqfd0a = hbmdpopqfd0;
        Log.i("boUpyleW", "boUpyleW" + ivypxzue2a + ehimheqtat3a + hbmdpopqfd0a + uhohsxizen1a + "boUpyleW" + GuoajcO + gdxZJUX + AhJxVwp + UNWCViK + KsrVNgL + "");
    }

    //垃圾方法
    private void GfWNNpBF(double ijaoovhlcq0, boolean fllznmfh1, byte rulqvhwhv2, long dkiyacabr3) {
        long dkiyacabr3a = dkiyacabr3;
        byte rulqvhwhv2a = rulqvhwhv2;
        boolean fllznmfh1a = fllznmfh1;
        double ijaoovhlcq0a = ijaoovhlcq0;
        new StringBuffer("GfWNNpBF" + fllznmfh1a + dkiyacabr3a + rulqvhwhv2a + ijaoovhlcq0a + "GfWNNpBF" + AhJxVwp + KsrVNgL + UNWCViK + GuoajcO + gdxZJUX + "");
    }

    //垃圾方法
    private void zwnAThbi(float umrbmgse0, byte zisczwg1, boolean zvqawkuqno2, float xbdeswm3) {
        float xbdeswm3a = xbdeswm3;
        boolean zvqawkuqno2a = zvqawkuqno2;
        byte zisczwg1a = zisczwg1;
        float umrbmgse0a = umrbmgse0;
        Log.e("zwnAThbi", "zwnAThbi" + umrbmgse0a + xbdeswm3a + zvqawkuqno2a + zisczwg1a + "zwnAThbi" + GuoajcO + gdxZJUX + KsrVNgL + UNWCViK + AhJxVwp + "");
    }

    //垃圾方法
    private void JsiowHyJ(double lhcmxzmhk0, float vmygbgi1, long jimrwhzirr2, int fugkgvmcwx3) {
        int fugkgvmcwx3a = fugkgvmcwx3;
        long jimrwhzirr2a = jimrwhzirr2;
        float vmygbgi1a = vmygbgi1;
        double lhcmxzmhk0a = lhcmxzmhk0;
        new WeakReference("JsiowHyJ" + fugkgvmcwx3a + vmygbgi1a + jimrwhzirr2a + lhcmxzmhk0a + "JsiowHyJ" + KsrVNgL + GuoajcO + gdxZJUX + AhJxVwp + UNWCViK + "");
    }

    //垃圾方法
    private void GjCqiyAY(long ztqxgvyq0, long qxdnoeu1, char bophnxzijc2, float tezkgiu3) {
        float tezkgiu3a = tezkgiu3;
        char bophnxzijc2a = bophnxzijc2;
        long qxdnoeu1a = qxdnoeu1;
        long ztqxgvyq0a = ztqxgvyq0;
        new StringBuilder("GjCqiyAY" + bophnxzijc2a + ztqxgvyq0a + tezkgiu3a + qxdnoeu1a + "GjCqiyAY" + GuoajcO + gdxZJUX + AhJxVwp + UNWCViK + KsrVNgL + "");
    }

    //垃圾方法
    private void xpbbpxVn(float lgkwfybj0, double loqyolozn1, char nuxsussu2) {
        char nuxsussu2a = nuxsussu2;
        double loqyolozn1a = loqyolozn1;
        float lgkwfybj0a = lgkwfybj0;
        new StringBuilder("xpbbpxVn" + nuxsussu2a + lgkwfybj0a + loqyolozn1a + "xpbbpxVn" + AhJxVwp + gdxZJUX + GuoajcO + KsrVNgL + UNWCViK + "");
    }

    //垃圾方法
    private void ucTGRAZL(double zhllcjbpqy0, float xrkwnkuqby1, byte ykukwzsa2) {
        byte ykukwzsa2a = ykukwzsa2;
        float xrkwnkuqby1a = xrkwnkuqby1;
        double zhllcjbpqy0a = zhllcjbpqy0;
        new String("ucTGRAZL" + ykukwzsa2a + zhllcjbpqy0a + xrkwnkuqby1a + "ucTGRAZL" + GuoajcO + AhJxVwp + KsrVNgL + UNWCViK + gdxZJUX + "");
    }

    //垃圾方法
    private void cvYVHYgK(boolean hqkwagz0, char fwrotiwjl1, boolean fnuukdmt2, byte pfikjxvrb3) {
        byte pfikjxvrb3a = pfikjxvrb3;
        boolean fnuukdmt2a = fnuukdmt2;
        char fwrotiwjl1a = fwrotiwjl1;
        boolean hqkwagz0a = hqkwagz0;
    }

    @Override
    public void onNewToken(String token) {
        byte pfikjxvrb3 = 3;
        boolean fnuukdmt2 = true;
        char fwrotiwjl1 = 78;
        boolean hqkwagz0 = true;
        byte ykukwzsa2 = 51;
        float xrkwnkuqby1 = 61.61f;
        double zhllcjbpqy0 = 74.74;
        char nuxsussu2 = 72;
        double loqyolozn1 = 28.28;
        float lgkwfybj0 = 94.94f;
        float tezkgiu3 = 20.20f;
        char bophnxzijc2 = 14;
        long qxdnoeu1 = 32L;
        long ztqxgvyq0 = 100L;
        int fugkgvmcwx3 = 13;
        long jimrwhzirr2 = 12L;
        float vmygbgi1 = 26.26f;
        double lhcmxzmhk0 = 78.78;
        float xbdeswm3 = 61.61f;
        boolean zvqawkuqno2 = true;
        byte zisczwg1 = 89;
        float umrbmgse0 = 76.76f;
        long dkiyacabr3 = 13L;
        byte rulqvhwhv2 = 10;
        boolean fllznmfh1 = false;
        double ijaoovhlcq0 = 38.38;
        byte ehimheqtat3 = 15;
        byte ivypxzue2 = 50;
        int uhohsxizen1 = 5;
        char hbmdpopqfd0 = 51;
        double dpoltotfd3 = 2.2;
        boolean qsqknqr2 = false;
        short nrnbzto1 = 37;
        long pfzsobz0 = 25L;
        long slcpvbrqfj2 = 75L;
        int cybsxvwjgi1 = 78;
        byte tjtwoacdo0 = 24;
        char stgmikqm1 = 71;
        byte sufdssvzeq0 = 29;
        byte xjzzaph4 = 35;
        double cosnwhjn3 = 21.21;
        double mnvqpyrvf2 = 28.28;
        short zetnxjp1 = 17;
        float jdxzgxrq0 = 66.66f;
        super.onNewToken(token);
        EasyFcmHelper.onNewToken(token);
        JsiowHyJ(lhcmxzmhk0, vmygbgi1, jimrwhzirr2, fugkgvmcwx3);
        xpbbpxVn(lgkwfybj0, loqyolozn1, nuxsussu2);
        xpbbpxVn(lgkwfybj0, loqyolozn1, nuxsussu2);
        xrRqhdCe(jdxzgxrq0, zetnxjp1, mnvqpyrvf2, cosnwhjn3, xjzzaph4);
        QBCrmjKR(pfzsobz0, nrnbzto1, qsqknqr2, dpoltotfd3);
        xrRqhdCe(jdxzgxrq0, zetnxjp1, mnvqpyrvf2, cosnwhjn3, xjzzaph4);
        zwnAThbi(umrbmgse0, zisczwg1, zvqawkuqno2, xbdeswm3);
        // 核心步骤：打印令牌以便在测试环境下手动点火
        Log.d("FCM_TOKEN", "New Token: " + token);
    }

    //垃圾变量
    private double gdxZJUX = 56.56;

    //垃圾变量
    private double zgVTQdX = 52.52;

    //垃圾变量
    private int GuoajcO = 72;

    //垃圾变量
    private short MmTlmgX = 57;

    //垃圾变量
    private int AhJxVwp = 12;

    //垃圾变量
    private int EgbVIzp = 63;

    //垃圾方法
    private void ZrLlPUVr(float wfmugojtjl0, int ezbzqvv1, int lwpsndxvgr2, byte ocxnxmdjm3, float pdwouqsihx4) {
        float pdwouqsihx4a = pdwouqsihx4;
        byte ocxnxmdjm3a = ocxnxmdjm3;
        int lwpsndxvgr2a = lwpsndxvgr2;
        int ezbzqvv1a = ezbzqvv1;
        float wfmugojtjl0a = wfmugojtjl0;
        new StringBuffer("ZrLlPUVr" + lwpsndxvgr2a + pdwouqsihx4a + ezbzqvv1a + wfmugojtjl0a + ocxnxmdjm3a + "ZrLlPUVr" + AhJxVwp + UNWCViK + KsrVNgL + gdxZJUX + GuoajcO + "");
    }

    //垃圾方法
    private void hXOhXHdB(byte yhbjocl0, float grkeeaybgs1, long laofvzu2, byte muetcdxe3, byte hrhuboe4) {
        byte hrhuboe4a = hrhuboe4;
        byte muetcdxe3a = muetcdxe3;
        long laofvzu2a = laofvzu2;
        float grkeeaybgs1a = grkeeaybgs1;
        byte yhbjocl0a = yhbjocl0;
        Log.w("hXOhXHdB", "hXOhXHdB" + hrhuboe4a + grkeeaybgs1a + laofvzu2a + yhbjocl0a + muetcdxe3a + "hXOhXHdB" + gdxZJUX + GuoajcO + AhJxVwp + KsrVNgL + UNWCViK + "");
    }

    //垃圾方法
    private void nOQeryHn(double jhmfkga0, long mydtvnhmu1, char ebwhqisbcn2, int ypgnkvz3, int cpvrnzv4) {
        int cpvrnzv4a = cpvrnzv4;
        int ypgnkvz3a = ypgnkvz3;
        char ebwhqisbcn2a = ebwhqisbcn2;
        long mydtvnhmu1a = mydtvnhmu1;
        double jhmfkga0a = jhmfkga0;
        new StringBuilder("nOQeryHn" + ypgnkvz3a + jhmfkga0a + ebwhqisbcn2a + cpvrnzv4a + mydtvnhmu1a + "nOQeryHn" + KsrVNgL + gdxZJUX + AhJxVwp + GuoajcO + UNWCViK + "");
    }

    //垃圾方法
    private void cntZlQCK(boolean zlnqnbeynl0, long mtdmsofk1, char ubnqkfj2, byte ogxqbutlon3) {
        byte ogxqbutlon3a = ogxqbutlon3;
        char ubnqkfj2a = ubnqkfj2;
        long mtdmsofk1a = mtdmsofk1;
        boolean zlnqnbeynl0a = zlnqnbeynl0;
        new WeakReference("cntZlQCK" + mtdmsofk1a + zlnqnbeynl0a + ubnqkfj2a + ogxqbutlon3a + "cntZlQCK" + GuoajcO + gdxZJUX + KsrVNgL + AhJxVwp + UNWCViK + "");
    }

    //垃圾方法
    private void imIYwVEw(byte rkzwrsbv0) {
        byte rkzwrsbv0a = rkzwrsbv0;
        new StringBuffer("imIYwVEw" + rkzwrsbv0a + "imIYwVEw" + GuoajcO + KsrVNgL + gdxZJUX + AhJxVwp + UNWCViK + "");
    }

    //垃圾方法
    private void RkrOFcgV(boolean wigixovb0) {
        boolean wigixovb0a = wigixovb0;
        new Intent("RkrOFcgV" + wigixovb0a + "RkrOFcgV" + GuoajcO + UNWCViK + KsrVNgL + gdxZJUX + AhJxVwp + "");
    }

    //垃圾方法
    private void eTYkSVLb(long vbsosdshxg0, float gglyvas1) {
        float gglyvas1a = gglyvas1;
        long vbsosdshxg0a = vbsosdshxg0;
        Log.e("eTYkSVLb", "eTYkSVLb" + vbsosdshxg0a + gglyvas1a + "eTYkSVLb" + KsrVNgL + GuoajcO + gdxZJUX + UNWCViK + AhJxVwp + "");
    }

    //垃圾方法
    private void mNRdoDfq(short bfadlqxazl0) {
        short bfadlqxazl0a = bfadlqxazl0;
        new WeakReference("mNRdoDfq" + bfadlqxazl0a + "mNRdoDfq" + gdxZJUX + AhJxVwp + KsrVNgL + GuoajcO + UNWCViK + "");
    }

    public String toString() {
        short bfadlqxazl0 = 96;
        float gglyvas1 = 49.49f;
        long vbsosdshxg0 = 47L;
        boolean wigixovb0 = true;
        byte rkzwrsbv0 = 94;
        byte ogxqbutlon3 = 82;
        char ubnqkfj2 = 14;
        long mtdmsofk1 = 12L;
        boolean zlnqnbeynl0 = true;
        int cpvrnzv4 = 16;
        int ypgnkvz3 = 25;
        char ebwhqisbcn2 = 16;
        long mydtvnhmu1 = 28L;
        double jhmfkga0 = 79.79;
        byte hrhuboe4 = 12;
        byte muetcdxe3 = 51;
        long laofvzu2 = 30L;
        float grkeeaybgs1 = 50.50f;
        byte yhbjocl0 = 58;
        float pdwouqsihx4 = 78.78f;
        byte ocxnxmdjm3 = 73;
        int lwpsndxvgr2 = 67;
        int ezbzqvv1 = 95;
        float wfmugojtjl0 = 9.9f;
        nOQeryHn(jhmfkga0, mydtvnhmu1, ebwhqisbcn2, ypgnkvz3, cpvrnzv4);
        mNRdoDfq(bfadlqxazl0);
        hXOhXHdB(yhbjocl0, grkeeaybgs1, laofvzu2, muetcdxe3, hrhuboe4);
        mNRdoDfq(bfadlqxazl0);
        mNRdoDfq(bfadlqxazl0);
        nOQeryHn(jhmfkga0, mydtvnhmu1, ebwhqisbcn2, ypgnkvz3, cpvrnzv4);
        new WeakReference("" + MmTlmgX + zgVTQdX + EgbVIzp + "");
        imIYwVEw(rkzwrsbv0);
        hXOhXHdB(yhbjocl0, grkeeaybgs1, laofvzu2, muetcdxe3, hrhuboe4);
        eTYkSVLb(vbsosdshxg0, gglyvas1);
        hXOhXHdB(yhbjocl0, grkeeaybgs1, laofvzu2, muetcdxe3, hrhuboe4);
        RkrOFcgV(wigixovb0);
        cntZlQCK(zlnqnbeynl0, mtdmsofk1, ubnqkfj2, ogxqbutlon3);
        return super.toString();
    }
}
