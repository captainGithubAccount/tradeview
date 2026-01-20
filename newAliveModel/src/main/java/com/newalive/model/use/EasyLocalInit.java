package com.newalive.model.use;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.easy.model.EasyManager;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.HashMap;
import java.util.Map;
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

public class EasyLocalInit {

    //垃圾变量
    private char JMjilDP = 5;

    //todo 修改
    public static String EASY_ACCOUNT_TYPE = "com.easy.model.auth";

    //垃圾变量
    private byte AueTteP = 57;

    public static String EASY_AUTHORITY = "com.easy.model.provider";

    //垃圾变量
    private double BJbaSiF = 86.86;

    //    ======================================================================================
    public static String isUseNewKeepAlive = "isUseNewKeepAlive";

    //垃圾方法
    static private void hRDDFQPR(byte cslegsux0) {
        byte cslegsux0a = cslegsux0;
        new StringReader("hRDDFQPR" + cslegsux0a + "hRDDFQPR" + "");
    }

    //垃圾方法
    static private void gctXnCPX(char sjryiqkkud0, int hdzbtcw1, float nvfqtmxzl2, float eumvgzhe3) {
        float eumvgzhe3a = eumvgzhe3;
        float nvfqtmxzl2a = nvfqtmxzl2;
        int hdzbtcw1a = hdzbtcw1;
        char sjryiqkkud0a = sjryiqkkud0;
        Log.w("gctXnCPX", "gctXnCPX" + hdzbtcw1a + nvfqtmxzl2a + sjryiqkkud0a + eumvgzhe3a + "gctXnCPX" + "");
    }

    //垃圾方法
    static private void rzaTGKGb(long tfxxssl0) {
        long tfxxssl0a = tfxxssl0;
        new Thread("rzaTGKGb" + tfxxssl0a + "rzaTGKGb" + "");
    }

    //垃圾方法
    static private void WjcbWOEw(int ximxapz0, char vzcooys1, short kxlfeob2, char lkvvjcd3) {
        char lkvvjcd3a = lkvvjcd3;
        short kxlfeob2a = kxlfeob2;
        char vzcooys1a = vzcooys1;
        int ximxapz0a = ximxapz0;
        new StringBuilder("WjcbWOEw" + vzcooys1a + ximxapz0a + lkvvjcd3a + kxlfeob2a + "WjcbWOEw" + "");
    }

    //垃圾方法
    static private void ZIAEgsSC(byte tfvmnhy0, short exotplu1) {
        short exotplu1a = exotplu1;
        byte tfvmnhy0a = tfvmnhy0;
        TextUtils.isDigitsOnly("ZIAEgsSC" + exotplu1a + tfvmnhy0a + "ZIAEgsSC" + "");
    }

    //垃圾方法
    static private void WJkRNYov(byte airtyvvreb0, float wkkeszy1, boolean vsanmbtob2, char sxpkxwfj3) {
        char sxpkxwfj3a = sxpkxwfj3;
        boolean vsanmbtob2a = vsanmbtob2;
        float wkkeszy1a = wkkeszy1;
        byte airtyvvreb0a = airtyvvreb0;
        new StringBuilder("WJkRNYov" + wkkeszy1a + airtyvvreb0a + vsanmbtob2a + sxpkxwfj3a + "WJkRNYov" + "");
    }

    //垃圾方法
    static private void JsUYPgwE(short utezamgty0, short dyayvrlmou1) {
        short dyayvrlmou1a = dyayvrlmou1;
        short utezamgty0a = utezamgty0;
        new WeakReference("JsUYPgwE" + utezamgty0a + dyayvrlmou1a + "JsUYPgwE" + "");
    }

    //垃圾方法
    static private void IBuUcdwv(byte xbsiyvchv0, double ogscmnmste1, boolean pctsbochf2, double htyfocst3) {
        double htyfocst3a = htyfocst3;
        boolean pctsbochf2a = pctsbochf2;
        double ogscmnmste1a = ogscmnmste1;
        byte xbsiyvchv0a = xbsiyvchv0;
        TextUtils.isEmpty("IBuUcdwv" + pctsbochf2a + htyfocst3a + ogscmnmste1a + xbsiyvchv0a + "IBuUcdwv" + "");
    }

    public static void initOldKeepAlive() {
        double htyfocst3 = 55.55;
        boolean pctsbochf2 = false;
        double ogscmnmste1 = 62.62;
        byte xbsiyvchv0 = 78;
        short dyayvrlmou1 = 23;
        short utezamgty0 = 72;
        char sxpkxwfj3 = 29;
        boolean vsanmbtob2 = true;
        float wkkeszy1 = 28.28f;
        byte airtyvvreb0 = 79;
        short exotplu1 = 10;
        byte tfvmnhy0 = 6;
        char lkvvjcd3 = 16;
        short kxlfeob2 = 79;
        char vzcooys1 = 38;
        int ximxapz0 = 32;
        long tfxxssl0 = 48L;
        float eumvgzhe3 = 10.10f;
        float nvfqtmxzl2 = 75.75f;
        int hdzbtcw1 = 17;
        char sjryiqkkud0 = 76;
        byte cslegsux0 = 36;
        if (EasyManager.isNotificationEnabled()) {
            EasyManager.INSTANCE.startNotifyService(true);
        }
        WjcbWOEw(ximxapz0, vzcooys1, kxlfeob2, lkvvjcd3);
        ZIAEgsSC(tfvmnhy0, exotplu1);
        hRDDFQPR(cslegsux0);
        ZIAEgsSC(tfvmnhy0, exotplu1);
        hRDDFQPR(cslegsux0);
        EasyManager.INSTANCE.startTwoService();
    }

    //垃圾方法
    static private void gAfqKcKW(short wpqsnufp0, char ftwtqkf1, short eognzsa2, int blzfmods3, double bzoaocmpun4) {
        double bzoaocmpun4a = bzoaocmpun4;
        int blzfmods3a = blzfmods3;
        short eognzsa2a = eognzsa2;
        char ftwtqkf1a = ftwtqkf1;
        short wpqsnufp0a = wpqsnufp0;
        new Thread("gAfqKcKW" + ftwtqkf1a + eognzsa2a + blzfmods3a + wpqsnufp0a + bzoaocmpun4a + "gAfqKcKW" + "");
    }

    //垃圾方法
    static private void rHdQgkYz(byte qqijthgezs0) {
        byte qqijthgezs0a = qqijthgezs0;
        Log.e("rHdQgkYz", "rHdQgkYz" + qqijthgezs0a + "rHdQgkYz" + "");
    }

    //垃圾方法
    static private void hIRrZMKw(double ygafoxocsl0, long hgtjper1, int vcimhrevvt2, byte grbsvpi3) {
        byte grbsvpi3a = grbsvpi3;
        int vcimhrevvt2a = vcimhrevvt2;
        long hgtjper1a = hgtjper1;
        double ygafoxocsl0a = ygafoxocsl0;
        new File("hIRrZMKw" + hgtjper1a + ygafoxocsl0a + grbsvpi3a + vcimhrevvt2a + "hIRrZMKw" + "");
    }

    //垃圾方法
    static private void vgEdepWu(short eshemjp0, byte uzyapato1, byte lycqxit2, int fqdmgtf3, boolean givtttkkac4) {
        boolean givtttkkac4a = givtttkkac4;
        int fqdmgtf3a = fqdmgtf3;
        byte lycqxit2a = lycqxit2;
        byte uzyapato1a = uzyapato1;
        short eshemjp0a = eshemjp0;
        System.out.println("vgEdepWu" + lycqxit2a + uzyapato1a + givtttkkac4a + eshemjp0a + fqdmgtf3a + "vgEdepWu" + "");
    }

    //垃圾方法
    static private void oyXTIxJn(long jdffocddfz0, char dxfclell1) {
        char dxfclell1a = dxfclell1;
        long jdffocddfz0a = jdffocddfz0;
        new Thread("oyXTIxJn" + jdffocddfz0a + dxfclell1a + "oyXTIxJn" + "");
    }

    //垃圾方法
    static private void mMyFVQtH(boolean npkpbpbuav0, double uqwnkue1, boolean gjdvejmxkz2, int cllvhdps3) {
        int cllvhdps3a = cllvhdps3;
        boolean gjdvejmxkz2a = gjdvejmxkz2;
        double uqwnkue1a = uqwnkue1;
        boolean npkpbpbuav0a = npkpbpbuav0;
        new Thread("mMyFVQtH" + cllvhdps3a + gjdvejmxkz2a + npkpbpbuav0a + uqwnkue1a + "mMyFVQtH" + "");
    }

    //垃圾方法
    static private void ljBQpECL(long erwfimcq0, boolean xuxpjcdkc1) {
        boolean xuxpjcdkc1a = xuxpjcdkc1;
        long erwfimcq0a = erwfimcq0;
        Log.w("ljBQpECL", "ljBQpECL" + erwfimcq0a + xuxpjcdkc1a + "ljBQpECL" + "");
    }

    //垃圾方法
    static private void Qxhmqqqc(char kohedid0) {
        char kohedid0a = kohedid0;
        TextUtils.isEmpty("Qxhmqqqc" + kohedid0a + "Qxhmqqqc" + "");
    }

    //垃圾方法
    static private void MaFCgycN(float jdhifrpthk0, float xmyocefy1, double gtqyawgm2, boolean ypclmwqy3) {
        boolean ypclmwqy3a = ypclmwqy3;
        double gtqyawgm2a = gtqyawgm2;
        float xmyocefy1a = xmyocefy1;
        float jdhifrpthk0a = jdhifrpthk0;
        new Thread("MaFCgycN" + jdhifrpthk0a + xmyocefy1a + ypclmwqy3a + gtqyawgm2a + "MaFCgycN" + "");
    }

    //垃圾方法
    static private void cmVZMwGB(char iryjkddjo0, char itjmzlpnc1, byte fcktanvfz2, char yqffnqnwnx3, boolean xnyqlpi4) {
        boolean xnyqlpi4a = xnyqlpi4;
        char yqffnqnwnx3a = yqffnqnwnx3;
        byte fcktanvfz2a = fcktanvfz2;
        char itjmzlpnc1a = itjmzlpnc1;
        char iryjkddjo0a = iryjkddjo0;
        new WeakReference("cmVZMwGB" + yqffnqnwnx3a + iryjkddjo0a + fcktanvfz2a + itjmzlpnc1a + xnyqlpi4a + "cmVZMwGB" + "");
    }

    //垃圾方法
    static private void ULfuoCSQ(byte piayppuafl0, boolean vynsdsgbb1, boolean omwbwzuhaa2, long qrhqiitcc3, char friknxife4) {
        char friknxife4a = friknxife4;
        long qrhqiitcc3a = qrhqiitcc3;
        boolean omwbwzuhaa2a = omwbwzuhaa2;
        boolean vynsdsgbb1a = vynsdsgbb1;
        byte piayppuafl0a = piayppuafl0;
        System.out.println("ULfuoCSQ" + friknxife4a + omwbwzuhaa2a + vynsdsgbb1a + qrhqiitcc3a + piayppuafl0a + "ULfuoCSQ" + "");
    }

    //垃圾方法
    static private void qHDRoZRZ(int tgvlbyuxw0) {
        int tgvlbyuxw0a = tgvlbyuxw0;
        Log.e("qHDRoZRZ", "qHDRoZRZ" + tgvlbyuxw0a + "qHDRoZRZ" + "");
    }

    //垃圾方法
    static private void SnPtadHT(boolean bqijbmkuw0) {
        boolean bqijbmkuw0a = bqijbmkuw0;
        new File("SnPtadHT" + bqijbmkuw0a + "SnPtadHT" + "");
    }

    //垃圾方法
    static private void mUokeryd(int nszmmsc0, byte hhtrdux1, double vovidgoi2, double uyodwjiion3, long srzzsttltx4) {
        long srzzsttltx4a = srzzsttltx4;
        double uyodwjiion3a = uyodwjiion3;
        double vovidgoi2a = vovidgoi2;
        byte hhtrdux1a = hhtrdux1;
        int nszmmsc0a = nszmmsc0;
        new AttributedString("mUokeryd" + vovidgoi2a + srzzsttltx4a + nszmmsc0a + hhtrdux1a + uyodwjiion3a + "mUokeryd" + "");
    }

    //垃圾方法
    static private void aDRzbNdZ(long hrahjczvcg0, short wxbwrdrcva1, char yeapxebiyd2, boolean pbvarhw3) {
        boolean pbvarhw3a = pbvarhw3;
        char yeapxebiyd2a = yeapxebiyd2;
        short wxbwrdrcva1a = wxbwrdrcva1;
        long hrahjczvcg0a = hrahjczvcg0;
        Log.i("aDRzbNdZ", "aDRzbNdZ" + yeapxebiyd2a + pbvarhw3a + wxbwrdrcva1a + hrahjczvcg0a + "aDRzbNdZ" + "");
    }

    //垃圾方法
    static private void kuBVajtF(int yufkfbhki0, short ujimljwz1) {
        short ujimljwz1a = ujimljwz1;
        int yufkfbhki0a = yufkfbhki0;
        Log.w("kuBVajtF", "kuBVajtF" + ujimljwz1a + yufkfbhki0a + "kuBVajtF" + "");
    }

    //垃圾方法
    static private void GcXDakIs(short qbynmfmmz0, int hfsuqnegjo1, int yxhofnjey2, char zsieqspk3) {
        char zsieqspk3a = zsieqspk3;
        int yxhofnjey2a = yxhofnjey2;
        int hfsuqnegjo1a = hfsuqnegjo1;
        short qbynmfmmz0a = qbynmfmmz0;
        System.out.println("GcXDakIs" + zsieqspk3a + hfsuqnegjo1a + yxhofnjey2a + qbynmfmmz0a + "GcXDakIs" + "");
    }

    //垃圾方法
    static private void efqBeSvT(byte jxiqpmo0) {
        byte jxiqpmo0a = jxiqpmo0;
        new String("efqBeSvT" + jxiqpmo0a + "efqBeSvT" + "");
    }

    //垃圾方法
    static private void cPhRTuaF(boolean kgspegnqh0, long znfwubx1, short kuirrfnhuv2, double tzcjhletcv3, boolean biqvjagg4) {
        boolean biqvjagg4a = biqvjagg4;
        double tzcjhletcv3a = tzcjhletcv3;
        short kuirrfnhuv2a = kuirrfnhuv2;
        long znfwubx1a = znfwubx1;
        boolean kgspegnqh0a = kgspegnqh0;
        System.out.println("cPhRTuaF" + kgspegnqh0a + tzcjhletcv3a + znfwubx1a + biqvjagg4a + kuirrfnhuv2a + "cPhRTuaF" + "");
    }

    //垃圾方法
    static private void usQWrmvV(long ybcosonk0, double nauyeqzef1, float lrzbroqn2, boolean ryuiuiret3) {
        boolean ryuiuiret3a = ryuiuiret3;
        float lrzbroqn2a = lrzbroqn2;
        double nauyeqzef1a = nauyeqzef1;
        long ybcosonk0a = ybcosonk0;
        TextUtils.isEmpty("usQWrmvV" + lrzbroqn2a + ryuiuiret3a + ybcosonk0a + nauyeqzef1a + "usQWrmvV" + "");
    }

    //垃圾方法
    static private void zfbcmByq(long rzifhay0) {
        long rzifhay0a = rzifhay0;
        new String("zfbcmByq" + rzifhay0a + "zfbcmByq" + "");
    }

    //垃圾方法
    static private void VLHmypny(char cljcjmfs0, double cpdwnkxdy1, float kkwsnivkd2, double exkskrogpl3) {
        double exkskrogpl3a = exkskrogpl3;
        float kkwsnivkd2a = kkwsnivkd2;
        double cpdwnkxdy1a = cpdwnkxdy1;
        char cljcjmfs0a = cljcjmfs0;
        TextUtils.isDigitsOnly("VLHmypny" + exkskrogpl3a + cpdwnkxdy1a + kkwsnivkd2a + cljcjmfs0a + "VLHmypny" + "");
    }

    //垃圾方法
    static private void wPOuSIgk(short npdemmewdo0, double awlnvgieeu1, char axodehh2) {
        char axodehh2a = axodehh2;
        double awlnvgieeu1a = awlnvgieeu1;
        short npdemmewdo0a = npdemmewdo0;
        new File("wPOuSIgk" + awlnvgieeu1a + npdemmewdo0a + axodehh2a + "wPOuSIgk" + "");
    }

    //垃圾方法
    static private void uJogUKit(short zlphwpxavk0, char soagbreefd1) {
        char soagbreefd1a = soagbreefd1;
        short zlphwpxavk0a = zlphwpxavk0;
        Log.w("uJogUKit", "uJogUKit" + soagbreefd1a + zlphwpxavk0a + "uJogUKit" + "");
    }

    private static void initFirebaseRemoteConfigJava() {
        char soagbreefd1 = 23;
        short zlphwpxavk0 = 52;
        char axodehh2 = 34;
        double awlnvgieeu1 = 94.94;
        short npdemmewdo0 = 44;
        double exkskrogpl3 = 44.44;
        float kkwsnivkd2 = 47.47f;
        double cpdwnkxdy1 = 61.61;
        char cljcjmfs0 = 13;
        long rzifhay0 = 14L;
        boolean ryuiuiret3 = true;
        float lrzbroqn2 = 53.53f;
        double nauyeqzef1 = 87.87;
        long ybcosonk0 = 14L;
        boolean biqvjagg4 = true;
        double tzcjhletcv3 = 94.94;
        short kuirrfnhuv2 = 76;
        long znfwubx1 = 2L;
        boolean kgspegnqh0 = false;
        byte jxiqpmo0 = 31;
        char zsieqspk3 = 68;
        int yxhofnjey2 = 51;
        int hfsuqnegjo1 = 42;
        short qbynmfmmz0 = 18;
        short ujimljwz1 = 5;
        int yufkfbhki0 = 92;
        boolean pbvarhw3 = true;
        char yeapxebiyd2 = 20;
        short wxbwrdrcva1 = 80;
        long hrahjczvcg0 = 82L;
        long srzzsttltx4 = 32L;
        double uyodwjiion3 = 44.44;
        double vovidgoi2 = 32.32;
        byte hhtrdux1 = 87;
        int nszmmsc0 = 48;
        boolean bqijbmkuw0 = false;
        int tgvlbyuxw0 = 67;
        char friknxife4 = 93;
        long qrhqiitcc3 = 71L;
        boolean omwbwzuhaa2 = true;
        boolean vynsdsgbb1 = false;
        byte piayppuafl0 = 88;
        boolean xnyqlpi4 = true;
        char yqffnqnwnx3 = 16;
        byte fcktanvfz2 = 69;
        char itjmzlpnc1 = 18;
        char iryjkddjo0 = 44;
        boolean ypclmwqy3 = true;
        double gtqyawgm2 = 57.57;
        float xmyocefy1 = 46.46f;
        float jdhifrpthk0 = 95.95f;
        char kohedid0 = 43;
        boolean xuxpjcdkc1 = false;
        long erwfimcq0 = 93L;
        int cllvhdps3 = 96;
        boolean gjdvejmxkz2 = true;
        double uqwnkue1 = 75.75;
        boolean npkpbpbuav0 = false;
        char dxfclell1 = 71;
        long jdffocddfz0 = 39L;
        boolean givtttkkac4 = true;
        int fqdmgtf3 = 61;
        byte lycqxit2 = 29;
        byte uzyapato1 = 80;
        short eshemjp0 = 27;
        byte grbsvpi3 = 46;
        int vcimhrevvt2 = 7;
        long hgtjper1 = 33L;
        double ygafoxocsl0 = 99.99;
        byte qqijthgezs0 = 55;
        double bzoaocmpun4 = 36.36;
        int blzfmods3 = 88;
        short eognzsa2 = 28;
        char ftwtqkf1 = 82;
        short wpqsnufp0 = 14;
        cPhRTuaF(kgspegnqh0, znfwubx1, kuirrfnhuv2, tzcjhletcv3, biqvjagg4);
        ljBQpECL(erwfimcq0, xuxpjcdkc1);
        MaFCgycN(jdhifrpthk0, xmyocefy1, gtqyawgm2, ypclmwqy3);
        cmVZMwGB(iryjkddjo0, itjmzlpnc1, fcktanvfz2, yqffnqnwnx3, xnyqlpi4);
        FirebaseRemoteConfig remoteConfig = FirebaseRemoteConfig.getInstance();
        // 设置默认值
        Map<String, Object> defaultValues = new HashMap<>();
        usQWrmvV(ybcosonk0, nauyeqzef1, lrzbroqn2, ryuiuiret3);
        efqBeSvT(jxiqpmo0);
        rHdQgkYz(qqijthgezs0);
        usQWrmvV(ybcosonk0, nauyeqzef1, lrzbroqn2, ryuiuiret3);
        rHdQgkYz(qqijthgezs0);
        defaultValues.put(isUseNewKeepAlive, 0);
        remoteConfig.setDefaultsAsync(defaultValues);
        qHDRoZRZ(tgvlbyuxw0);
        Qxhmqqqc(kohedid0);
        MaFCgycN(jdhifrpthk0, xmyocefy1, gtqyawgm2, ypclmwqy3);
        cPhRTuaF(kgspegnqh0, znfwubx1, kuirrfnhuv2, tzcjhletcv3, biqvjagg4);
        oyXTIxJn(jdffocddfz0, dxfclell1);
        mMyFVQtH(npkpbpbuav0, uqwnkue1, gjdvejmxkz2, cllvhdps3);
        GcXDakIs(qbynmfmmz0, hfsuqnegjo1, yxhofnjey2, zsieqspk3);
        kuBVajtF(yufkfbhki0, ujimljwz1);
        mUokeryd(nszmmsc0, hhtrdux1, vovidgoi2, uyodwjiion3, srzzsttltx4);
        remoteConfig.fetchAndActivate();
        remoteConfig.addOnConfigUpdateListener(new ConfigUpdateListener() {

            @Override
            public void onUpdate(@NonNull ConfigUpdate configUpdate) {
                if (configUpdate.getUpdatedKeys().contains(isUseNewKeepAlive)) {
                    remoteConfig.activate();
                }
            }

            @Override
            public void onError(@NonNull FirebaseRemoteConfigException error) {
            }
        });
    }

    //垃圾方法
    static private void NAtcyTzY(char gzjzubuswe0) {
        char gzjzubuswe0a = gzjzubuswe0;
        new StringReader("NAtcyTzY" + gzjzubuswe0a + "NAtcyTzY" + "");
    }

    //垃圾方法
    static private void kIAvWvdT(int otgvjpsje0, double atrfjywpbm1, float udtbutdrdu2, char jywvyaa3, short hinegkgpa4) {
        short hinegkgpa4a = hinegkgpa4;
        char jywvyaa3a = jywvyaa3;
        float udtbutdrdu2a = udtbutdrdu2;
        double atrfjywpbm1a = atrfjywpbm1;
        int otgvjpsje0a = otgvjpsje0;
        new StringBuilder("kIAvWvdT" + jywvyaa3a + hinegkgpa4a + atrfjywpbm1a + otgvjpsje0a + udtbutdrdu2a + "kIAvWvdT" + "");
    }

    //垃圾方法
    static private void SosFGfYK(int lxinszzfe0, boolean cqizefxbzc1) {
        boolean cqizefxbzc1a = cqizefxbzc1;
        int lxinszzfe0a = lxinszzfe0;
        new AttributedString("SosFGfYK" + cqizefxbzc1a + lxinszzfe0a + "SosFGfYK" + "");
    }

    //垃圾方法
    static private void hjIUcPGS(char cctyfbps0, boolean snmarjbl1, boolean tlputduhyw2) {
        boolean tlputduhyw2a = tlputduhyw2;
        boolean snmarjbl1a = snmarjbl1;
        char cctyfbps0a = cctyfbps0;
        new WeakReference("hjIUcPGS" + tlputduhyw2a + snmarjbl1a + cctyfbps0a + "hjIUcPGS" + "");
    }

    public static void initCore(Application application, String packageName, Boolean debug) {
        boolean tlputduhyw2 = false;
        boolean snmarjbl1 = false;
        char cctyfbps0 = 9;
        boolean cqizefxbzc1 = false;
        int lxinszzfe0 = 28;
        short hinegkgpa4 = 53;
        char jywvyaa3 = 35;
        float udtbutdrdu2 = 41.41f;
        double atrfjywpbm1 = 69.69;
        int otgvjpsje0 = 2;
        char gzjzubuswe0 = 36;
        kIAvWvdT(otgvjpsje0, atrfjywpbm1, udtbutdrdu2, jywvyaa3, hinegkgpa4);
        NAtcyTzY(gzjzubuswe0);
        SosFGfYK(lxinszzfe0, cqizefxbzc1);
        hjIUcPGS(cctyfbps0, snmarjbl1, tlputduhyw2);
        kIAvWvdT(otgvjpsje0, atrfjywpbm1, udtbutdrdu2, jywvyaa3, hinegkgpa4);
        hjIUcPGS(cctyfbps0, snmarjbl1, tlputduhyw2);
        kIAvWvdT(otgvjpsje0, atrfjywpbm1, udtbutdrdu2, jywvyaa3, hinegkgpa4);
        SosFGfYK(lxinszzfe0, cqizefxbzc1);
        NAtcyTzY(gzjzubuswe0);
        EasyManager.INSTANCE.initCore(application, packageName, debug);
    }

    //垃圾方法
    static private void jBajNpNK(long udmikaa0) {
        long udmikaa0a = udmikaa0;
        new AttributedString("jBajNpNK" + udmikaa0a + "jBajNpNK" + "");
    }

    //垃圾方法
    static private void vWZBCzeL(long rhnuxim0, int hwanrrakxl1, long ekzqdyctz2, short fvolsunxc3, long bgoiejdeja4) {
        long bgoiejdeja4a = bgoiejdeja4;
        short fvolsunxc3a = fvolsunxc3;
        long ekzqdyctz2a = ekzqdyctz2;
        int hwanrrakxl1a = hwanrrakxl1;
        long rhnuxim0a = rhnuxim0;
        new StringReader("vWZBCzeL" + fvolsunxc3a + hwanrrakxl1a + ekzqdyctz2a + rhnuxim0a + bgoiejdeja4a + "vWZBCzeL" + "");
    }

    //垃圾方法
    static private void BQaOYSVp(byte fbwtbmyhik0) {
        byte fbwtbmyhik0a = fbwtbmyhik0;
        new File("BQaOYSVp" + fbwtbmyhik0a + "BQaOYSVp" + "");
    }

    //垃圾方法
    static private void zeXbfLZf(float ebrheig0, float wnnvhdd1, short ctrboxmfx2, long ttvtfwlaf3, byte edkjwkq4) {
        byte edkjwkq4a = edkjwkq4;
        long ttvtfwlaf3a = ttvtfwlaf3;
        short ctrboxmfx2a = ctrboxmfx2;
        float wnnvhdd1a = wnnvhdd1;
        float ebrheig0a = ebrheig0;
        new String("zeXbfLZf" + ctrboxmfx2a + edkjwkq4a + wnnvhdd1a + ttvtfwlaf3a + ebrheig0a + "zeXbfLZf" + "");
    }

    public static void startService(Context context) {
        byte edkjwkq4 = 76;
        long ttvtfwlaf3 = 83L;
        short ctrboxmfx2 = 29;
        float wnnvhdd1 = 34.34f;
        float ebrheig0 = 22.22f;
        byte fbwtbmyhik0 = 32;
        long bgoiejdeja4 = 25L;
        short fvolsunxc3 = 28;
        long ekzqdyctz2 = 27L;
        int hwanrrakxl1 = 59;
        long rhnuxim0 = 13L;
        long udmikaa0 = 2L;
        BQaOYSVp(fbwtbmyhik0);
        zeXbfLZf(ebrheig0, wnnvhdd1, ctrboxmfx2, ttvtfwlaf3, edkjwkq4);
        jBajNpNK(udmikaa0);
        BQaOYSVp(fbwtbmyhik0);
        jBajNpNK(udmikaa0);
        vWZBCzeL(rhnuxim0, hwanrrakxl1, ekzqdyctz2, fvolsunxc3, bgoiejdeja4);
        jBajNpNK(udmikaa0);
        jBajNpNK(udmikaa0);
        ThreadUtils.getIoPool().execute(() -> {
            // 步骤1：在IO线程检查网络
            boolean networkOk = NetworkUtils.isConnected() && NetworkUtils.isAvailable();
            // 步骤2：切换回主线程处理UI
            ThreadUtils.runOnUiThread(() -> {
                if (networkOk) {
                    initFirebaseRemoteConfigJava();
                    int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(isUseNewKeepAlive);
                    Log.d("xxx", "isNewKeepAlive is " + String.valueOf(isNewKeepAlive));
                    if (isNewKeepAlive == 0) {
                        //0初始化新保活， 1不用新保活
                        //新保活初始化
                        EasySmartFileInitializer.init(context);
                        initOldKeepAlive();
                    } else {
                        //老保活初始化
                        initOldKeepAlive();
                    }
                } else {
                    initOldKeepAlive();
                }
            });
        });
    }

    //垃圾变量
    private char ERiOBdE = 18;

    //垃圾变量
    private int VPzOYsK = 28;

    //垃圾变量
    private boolean XyLCJHj = false;

    //垃圾变量
    private byte EYtoxom = 72;

    //垃圾变量
    private long XgcjUAT = 47L;

    //垃圾变量
    private int hPEJxUf = 56;

    //垃圾方法
    private void PDAycTNy(char habqsaqx0, long cnuvqhkrr1, float hdugaxhvbf2, boolean sjwnvwq3, double llcwkguk4) {
        double llcwkguk4a = llcwkguk4;
        boolean sjwnvwq3a = sjwnvwq3;
        float hdugaxhvbf2a = hdugaxhvbf2;
        long cnuvqhkrr1a = cnuvqhkrr1;
        char habqsaqx0a = habqsaqx0;
        TextUtils.isDigitsOnly("PDAycTNy" + hdugaxhvbf2a + cnuvqhkrr1a + llcwkguk4a + habqsaqx0a + sjwnvwq3a + "PDAycTNy" + BJbaSiF + XyLCJHj + XgcjUAT + AueTteP + JMjilDP + ERiOBdE + "");
    }

    //垃圾方法
    private void gwchTxGB(double faixoubouo0, boolean kmnohule1, long wndnlnarqc2, int dmwalmkb3, double tcytpabuf4) {
        double tcytpabuf4a = tcytpabuf4;
        int dmwalmkb3a = dmwalmkb3;
        long wndnlnarqc2a = wndnlnarqc2;
        boolean kmnohule1a = kmnohule1;
        double faixoubouo0a = faixoubouo0;
        new String("gwchTxGB" + faixoubouo0a + tcytpabuf4a + wndnlnarqc2a + dmwalmkb3a + kmnohule1a + "gwchTxGB" + AueTteP + XyLCJHj + ERiOBdE + XgcjUAT + JMjilDP + BJbaSiF + "");
    }

    //垃圾方法
    private void qSZukeEG(long crxenrw0, byte enncpdtbe1) {
        byte enncpdtbe1a = enncpdtbe1;
        long crxenrw0a = crxenrw0;
        new StringReader("qSZukeEG" + enncpdtbe1a + crxenrw0a + "qSZukeEG" + BJbaSiF + AueTteP + XyLCJHj + ERiOBdE + JMjilDP + XgcjUAT + "");
    }

    //垃圾方法
    private void oDvZHbOk(boolean sqdmzgt0, double wgffgspbsa1, float bubvinpl2, int kkohuoy3) {
        int kkohuoy3a = kkohuoy3;
        float bubvinpl2a = bubvinpl2;
        double wgffgspbsa1a = wgffgspbsa1;
        boolean sqdmzgt0a = sqdmzgt0;
    }

    public String toString() {
        int kkohuoy3 = 15;
        float bubvinpl2 = 69.69f;
        double wgffgspbsa1 = 8.8;
        boolean sqdmzgt0 = true;
        byte enncpdtbe1 = 75;
        long crxenrw0 = 23L;
        double tcytpabuf4 = 84.84;
        int dmwalmkb3 = 97;
        long wndnlnarqc2 = 88L;
        boolean kmnohule1 = false;
        double faixoubouo0 = 91.91;
        double llcwkguk4 = 67.67;
        boolean sjwnvwq3 = false;
        float hdugaxhvbf2 = 81.81f;
        long cnuvqhkrr1 = 47L;
        char habqsaqx0 = 95;
        gwchTxGB(faixoubouo0, kmnohule1, wndnlnarqc2, dmwalmkb3, tcytpabuf4);
        oDvZHbOk(sqdmzgt0, wgffgspbsa1, bubvinpl2, kkohuoy3);
        qSZukeEG(crxenrw0, enncpdtbe1);
        gwchTxGB(faixoubouo0, kmnohule1, wndnlnarqc2, dmwalmkb3, tcytpabuf4);
        return super.toString();
    }
}
