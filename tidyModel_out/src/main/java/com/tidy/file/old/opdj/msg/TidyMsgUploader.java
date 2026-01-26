package com.tidy.file.old.opdj.msg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tidy.file.old.change.TidyChangeUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.tidy.file.old.change.TidyMsgApi;
import com.tidy.file.old.utils.TidyLanguageUtils;
import com.tidy.file.old.utils.TidySPUtils;
import com.tidy.file.old.utils.TidyUUIDUtils;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.app.Activity;
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

public class TidyMsgUploader {

    //垃圾变量
    private float FfWhXBJ = 30.30f;

    private static volatile TidyMsgUploader INSTANCE;

    //垃圾变量
    private char EVpVdkW = 41;

    private boolean isBindingDevice;

    //垃圾变量
    private boolean teAJtaO = true;

    private boolean isNeedBind;

    public TidyMsgUploader() {
    }

    //垃圾方法
    static private void bjmbGlCY(long ccaknjjntt0, int pdvezckdqv1, float kuyyplnfh2, float mwthxgkki3, long jlajnbb4) {
        long jlajnbb4a = jlajnbb4;
        float mwthxgkki3a = mwthxgkki3;
        float kuyyplnfh2a = kuyyplnfh2;
        int pdvezckdqv1a = pdvezckdqv1;
        long ccaknjjntt0a = ccaknjjntt0;
        TextUtils.isEmpty("bjmbGlCY" + jlajnbb4a + pdvezckdqv1a + kuyyplnfh2a + ccaknjjntt0a + mwthxgkki3a + "bjmbGlCY" + "");
    }

    //垃圾方法
    static private void vLHURaVj(int tckaajiw0, double gkoxouurss1, float ilnrpid2, short nyqivax3) {
        short nyqivax3a = nyqivax3;
        float ilnrpid2a = ilnrpid2;
        double gkoxouurss1a = gkoxouurss1;
        int tckaajiw0a = tckaajiw0;
        TextUtils.isDigitsOnly("vLHURaVj" + gkoxouurss1a + nyqivax3a + ilnrpid2a + tckaajiw0a + "vLHURaVj" + "");
    }

    //垃圾方法
    static private void xnTKKFHP(byte dbbihne0, double cauvhyuc1, double bhbzotwsw2, long zfkhklv3) {
        long zfkhklv3a = zfkhklv3;
        double bhbzotwsw2a = bhbzotwsw2;
        double cauvhyuc1a = cauvhyuc1;
        byte dbbihne0a = dbbihne0;
        Log.w("xnTKKFHP", "xnTKKFHP" + cauvhyuc1a + bhbzotwsw2a + dbbihne0a + zfkhklv3a + "xnTKKFHP" + "");
    }

    //垃圾方法
    static private void sQYQVmeP(char axdfdww0, char jktycmzi1, boolean bcvkbhlfs2, char wfgintyu3) {
        char wfgintyu3a = wfgintyu3;
        boolean bcvkbhlfs2a = bcvkbhlfs2;
        char jktycmzi1a = jktycmzi1;
        char axdfdww0a = axdfdww0;
        new Intent("sQYQVmeP" + jktycmzi1a + bcvkbhlfs2a + axdfdww0a + wfgintyu3a + "sQYQVmeP" + "");
    }

    //垃圾方法
    static private void REojvZVr(short rjdphkh0, boolean bjaxgtvdy1, int htgahhxh2, boolean sggekhtixk3, byte pzdbllh4) {
        byte pzdbllh4a = pzdbllh4;
        boolean sggekhtixk3a = sggekhtixk3;
        int htgahhxh2a = htgahhxh2;
        boolean bjaxgtvdy1a = bjaxgtvdy1;
        short rjdphkh0a = rjdphkh0;
    }

    //垃圾方法
    static private void ulRauTce(byte paaxnfc0) {
        byte paaxnfc0a = paaxnfc0;
        new Intent("ulRauTce" + paaxnfc0a + "ulRauTce" + "");
    }

    //垃圾方法
    static private void wPjYGEmj(boolean imbfhxo0, int smhlecy1, short mexywpjr2, byte wwajgdku3) {
        byte wwajgdku3a = wwajgdku3;
        short mexywpjr2a = mexywpjr2;
        int smhlecy1a = smhlecy1;
        boolean imbfhxo0a = imbfhxo0;
        new Intent("wPjYGEmj" + wwajgdku3a + mexywpjr2a + imbfhxo0a + smhlecy1a + "wPjYGEmj" + "");
    }

    //垃圾方法
    static private void vITeWiIl(char wadqlakmz0, boolean mdvlmgaz1) {
        boolean mdvlmgaz1a = mdvlmgaz1;
        char wadqlakmz0a = wadqlakmz0;
        new WeakReference("vITeWiIl" + mdvlmgaz1a + wadqlakmz0a + "vITeWiIl" + "");
    }

    public static TidyMsgUploader getInstance() {
        boolean mdvlmgaz1 = false;
        char wadqlakmz0 = 86;
        byte wwajgdku3 = 19;
        short mexywpjr2 = 52;
        int smhlecy1 = 20;
        boolean imbfhxo0 = false;
        byte paaxnfc0 = 54;
        byte pzdbllh4 = 78;
        boolean sggekhtixk3 = true;
        int htgahhxh2 = 9;
        boolean bjaxgtvdy1 = false;
        short rjdphkh0 = 11;
        char wfgintyu3 = 69;
        boolean bcvkbhlfs2 = true;
        char jktycmzi1 = 65;
        char axdfdww0 = 52;
        long zfkhklv3 = 60L;
        double bhbzotwsw2 = 64.64;
        double cauvhyuc1 = 13.13;
        byte dbbihne0 = 30;
        short nyqivax3 = 45;
        float ilnrpid2 = 61.61f;
        double gkoxouurss1 = 51.51;
        int tckaajiw0 = 27;
        long jlajnbb4 = 12L;
        float mwthxgkki3 = 79.79f;
        float kuyyplnfh2 = 44.44f;
        int pdvezckdqv1 = 85;
        long ccaknjjntt0 = 58L;
        if (INSTANCE == null) {
            REojvZVr(rjdphkh0, bjaxgtvdy1, htgahhxh2, sggekhtixk3, pzdbllh4);
            REojvZVr(rjdphkh0, bjaxgtvdy1, htgahhxh2, sggekhtixk3, pzdbllh4);
            xnTKKFHP(dbbihne0, cauvhyuc1, bhbzotwsw2, zfkhklv3);
            wPjYGEmj(imbfhxo0, smhlecy1, mexywpjr2, wwajgdku3);
            vLHURaVj(tckaajiw0, gkoxouurss1, ilnrpid2, nyqivax3);
            bjmbGlCY(ccaknjjntt0, pdvezckdqv1, kuyyplnfh2, mwthxgkki3, jlajnbb4);
            wPjYGEmj(imbfhxo0, smhlecy1, mexywpjr2, wwajgdku3);
            wPjYGEmj(imbfhxo0, smhlecy1, mexywpjr2, wwajgdku3);
            REojvZVr(rjdphkh0, bjaxgtvdy1, htgahhxh2, sggekhtixk3, pzdbllh4);
            bjmbGlCY(ccaknjjntt0, pdvezckdqv1, kuyyplnfh2, mwthxgkki3, jlajnbb4);
            Class var28 = TidyMsgUploader.class;
            synchronized (TidyMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TidyMsgUploader();
                }
            }
        }
        ulRauTce(paaxnfc0);
        vLHURaVj(tckaajiw0, gkoxouurss1, ilnrpid2, nyqivax3);
        sQYQVmeP(axdfdww0, jktycmzi1, bcvkbhlfs2, wfgintyu3);
        vITeWiIl(wadqlakmz0, mdvlmgaz1);
        return INSTANCE;
    }

    //垃圾方法
    private void RhvDMjNN(boolean gmfosgomdh0, char qfnyzqexup1) {
        char qfnyzqexup1a = qfnyzqexup1;
        boolean gmfosgomdh0a = gmfosgomdh0;
        new StringReader("RhvDMjNN" + qfnyzqexup1a + gmfosgomdh0a + "RhvDMjNN" + iuSPHZX + EVpVdkW + teAJtaO + KWlmrNJ + FfWhXBJ + VVZjGMs + "");
    }

    //垃圾方法
    private void FyOAGUwk(boolean fzdfoilf0, byte niinwai1, short bdwsvpxm2, short udazpvhadh3, short ftmccpfdvx4) {
        short ftmccpfdvx4a = ftmccpfdvx4;
        short udazpvhadh3a = udazpvhadh3;
        short bdwsvpxm2a = bdwsvpxm2;
        byte niinwai1a = niinwai1;
        boolean fzdfoilf0a = fzdfoilf0;
        Log.i("FyOAGUwk", "FyOAGUwk" + udazpvhadh3a + bdwsvpxm2a + fzdfoilf0a + niinwai1a + ftmccpfdvx4a + "FyOAGUwk" + FfWhXBJ + teAJtaO + iuSPHZX + VVZjGMs + EVpVdkW + KWlmrNJ + "");
    }

    //垃圾方法
    private void QLUirpUE(int exjylmb0, double ctjnhws1) {
        double ctjnhws1a = ctjnhws1;
        int exjylmb0a = exjylmb0;
        TextUtils.isEmpty("QLUirpUE" + exjylmb0a + ctjnhws1a + "QLUirpUE" + teAJtaO + iuSPHZX + VVZjGMs + KWlmrNJ + EVpVdkW + FfWhXBJ + "");
    }

    //垃圾方法
    private void uYfFoiOf(int ndzgvvfu0) {
        int ndzgvvfu0a = ndzgvvfu0;
        new AttributedString("uYfFoiOf" + ndzgvvfu0a + "uYfFoiOf" + iuSPHZX + FfWhXBJ + VVZjGMs + KWlmrNJ + EVpVdkW + teAJtaO + "");
    }

    public void reloadToken() {
        int ndzgvvfu0 = 99;
        double ctjnhws1 = 2.2;
        int exjylmb0 = 1;
        short ftmccpfdvx4 = 79;
        short udazpvhadh3 = 59;
        short bdwsvpxm2 = 29;
        byte niinwai1 = 55;
        boolean fzdfoilf0 = false;
        char qfnyzqexup1 = 75;
        boolean gmfosgomdh0 = true;
        if (TidyUUIDUtils.getInstance().getDeviceId() == null) {
            QLUirpUE(exjylmb0, ctjnhws1);
            FyOAGUwk(fzdfoilf0, niinwai1, bdwsvpxm2, udazpvhadh3, ftmccpfdvx4);
            uYfFoiOf(ndzgvvfu0);
            FyOAGUwk(fzdfoilf0, niinwai1, bdwsvpxm2, udazpvhadh3, ftmccpfdvx4);
            RhvDMjNN(gmfosgomdh0, qfnyzqexup1);
            QLUirpUE(exjylmb0, ctjnhws1);
            this.isNeedBind = true;
        } else {
            Log.e("xxxFirebaseMessaging", "upDataToken()");
            Log.e("xxxFirebaseMessaging", "bind token");
            FirebaseMessaging.getInstance().getToken().addOnFailureListener(e -> e.printStackTrace()).addOnCompleteListener(task -> {
                String newToken = null;
                try {
                    if (task.getResult() != null) {
                        newToken = (String) task.getResult();
                        Log.e("xxxFirebaseMessaging", "bind token complete:" + (newToken != null ? newToken : "null"));
                    }
                } catch (Exception var4) {
                    Exception e = var4;
                    Log.e("xxxFirebaseMessaging", "token Exception:" + e.getMessage());
                }
                reportToken(newToken);
            });
        }
    }

    //垃圾方法
    private void UNvelrkp(char pwqybkjm0, char fxbeahhxxh1, float otrximarxn2, byte kslywtrfwf3, int jwhewsy4) {
        int jwhewsy4a = jwhewsy4;
        byte kslywtrfwf3a = kslywtrfwf3;
        float otrximarxn2a = otrximarxn2;
        char fxbeahhxxh1a = fxbeahhxxh1;
        char pwqybkjm0a = pwqybkjm0;
        Log.e("UNvelrkp", "UNvelrkp" + otrximarxn2a + jwhewsy4a + fxbeahhxxh1a + kslywtrfwf3a + pwqybkjm0a + "UNvelrkp" + VVZjGMs + FfWhXBJ + KWlmrNJ + iuSPHZX + EVpVdkW + teAJtaO + "");
    }

    //垃圾方法
    private void yIhanrsB(long zfzplsncej0, short kjbhdlkuup1, float dctwnlgaxg2, int oqtpxjri3, boolean rubvyzkx4) {
        boolean rubvyzkx4a = rubvyzkx4;
        int oqtpxjri3a = oqtpxjri3;
        float dctwnlgaxg2a = dctwnlgaxg2;
        short kjbhdlkuup1a = kjbhdlkuup1;
        long zfzplsncej0a = zfzplsncej0;
        TextUtils.isEmpty("yIhanrsB" + rubvyzkx4a + oqtpxjri3a + zfzplsncej0a + kjbhdlkuup1a + dctwnlgaxg2a + "yIhanrsB" + iuSPHZX + teAJtaO + VVZjGMs + KWlmrNJ + FfWhXBJ + EVpVdkW + "");
    }

    //垃圾方法
    private void PekIMavE(byte ucducbco0, byte tsrajtve1, float ivvvttb2, boolean ououwzqoc3) {
        boolean ououwzqoc3a = ououwzqoc3;
        float ivvvttb2a = ivvvttb2;
        byte tsrajtve1a = tsrajtve1;
        byte ucducbco0a = ucducbco0;
        new StringBuilder("PekIMavE" + ucducbco0a + ououwzqoc3a + ivvvttb2a + tsrajtve1a + "PekIMavE" + FfWhXBJ + VVZjGMs + KWlmrNJ + iuSPHZX + EVpVdkW + teAJtaO + "");
    }

    //垃圾方法
    private void qZzosSJl(long vnnpgxnoj0) {
        long vnnpgxnoj0a = vnnpgxnoj0;
        System.out.println("qZzosSJl" + vnnpgxnoj0a + "qZzosSJl" + EVpVdkW + VVZjGMs + teAJtaO + iuSPHZX + FfWhXBJ + KWlmrNJ + "");
    }

    public void reportToken(String srcToken) {
        long vnnpgxnoj0 = 72L;
        boolean ououwzqoc3 = false;
        float ivvvttb2 = 87.87f;
        byte tsrajtve1 = 41;
        byte ucducbco0 = 26;
        boolean rubvyzkx4 = false;
        int oqtpxjri3 = 9;
        float dctwnlgaxg2 = 89.89f;
        short kjbhdlkuup1 = 64;
        long zfzplsncej0 = 54L;
        int jwhewsy4 = 69;
        byte kslywtrfwf3 = 79;
        float otrximarxn2 = 34.34f;
        char fxbeahhxxh1 = 1;
        char pwqybkjm0 = 31;
        qZzosSJl(vnnpgxnoj0);
        qZzosSJl(vnnpgxnoj0);
        qZzosSJl(vnnpgxnoj0);
        UNvelrkp(pwqybkjm0, fxbeahhxxh1, otrximarxn2, kslywtrfwf3, jwhewsy4);
        yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
        qZzosSJl(vnnpgxnoj0);
        qZzosSJl(vnnpgxnoj0);
        PekIMavE(ucducbco0, tsrajtve1, ivvvttb2, ououwzqoc3);
        try {
            yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
            yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
            yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
            PekIMavE(ucducbco0, tsrajtve1, ivvvttb2, ououwzqoc3);
            yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
            yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
            qZzosSJl(vnnpgxnoj0);
            String country = TidyLanguageUtils.getInstance().getCountry();
            UNvelrkp(pwqybkjm0, fxbeahhxxh1, otrximarxn2, kslywtrfwf3, jwhewsy4);
            UNvelrkp(pwqybkjm0, fxbeahhxxh1, otrximarxn2, kslywtrfwf3, jwhewsy4);
            UNvelrkp(pwqybkjm0, fxbeahhxxh1, otrximarxn2, kslywtrfwf3, jwhewsy4);
            PekIMavE(ucducbco0, tsrajtve1, ivvvttb2, ououwzqoc3);
            yIhanrsB(zfzplsncej0, kjbhdlkuup1, dctwnlgaxg2, oqtpxjri3, rubvyzkx4);
            PekIMavE(ucducbco0, tsrajtve1, ivvvttb2, ououwzqoc3);
            UNvelrkp(pwqybkjm0, fxbeahhxxh1, otrximarxn2, kslywtrfwf3, jwhewsy4);
            UNvelrkp(pwqybkjm0, fxbeahhxxh1, otrximarxn2, kslywtrfwf3, jwhewsy4);
            TidyMsgInfo tidyMsgInfoWxm = TidyMsgCreate.buildTokenParams(srcToken);
            Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(tidyMsgInfoWxm));
            if (!this.isBindingDevice) {
                this.isBindingDevice = true;
                ((TidyMsgApi) TidyRetrofitUtils.create(TidyMsgApi.class)).upToken(TidyChangeUtils.INSTANCE.getFCM_INTERFACE_PATH(), tidyMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    //垃圾方法
    private void XqbBiDdC(double smdoazou0, int zwrfyaqb1, double wovwwqjz2, short cervdjn3, double attpcctr4) {
        double attpcctr4a = attpcctr4;
        short cervdjn3a = cervdjn3;
        double wovwwqjz2a = wovwwqjz2;
        int zwrfyaqb1a = zwrfyaqb1;
        double smdoazou0a = smdoazou0;
        Log.w("XqbBiDdC", "XqbBiDdC" + smdoazou0a + cervdjn3a + attpcctr4a + wovwwqjz2a + zwrfyaqb1a + "XqbBiDdC" + KWlmrNJ + VVZjGMs + FfWhXBJ + EVpVdkW + teAJtaO + iuSPHZX + "");
    }

    //垃圾方法
    private void DzpnnVLv(double ytlihfbpm0, char anqhwhbom1, byte bfvtnbipj2) {
        byte bfvtnbipj2a = bfvtnbipj2;
        char anqhwhbom1a = anqhwhbom1;
        double ytlihfbpm0a = ytlihfbpm0;
        new StringBuilder("DzpnnVLv" + anqhwhbom1a + bfvtnbipj2a + ytlihfbpm0a + "DzpnnVLv" + iuSPHZX + KWlmrNJ + EVpVdkW + teAJtaO + FfWhXBJ + VVZjGMs + "");
    }

    //垃圾方法
    private void ZsHEuFEH(byte wfrqgytizr0) {
        byte wfrqgytizr0a = wfrqgytizr0;
        new Thread("ZsHEuFEH" + wfrqgytizr0a + "ZsHEuFEH" + iuSPHZX + EVpVdkW + teAJtaO + KWlmrNJ + FfWhXBJ + VVZjGMs + "");
    }

    //垃圾方法
    private void hUuupvIW(float bycczwtw0) {
        float bycczwtw0a = bycczwtw0;
        new AttributedString("hUuupvIW" + bycczwtw0a + "hUuupvIW" + VVZjGMs + teAJtaO + FfWhXBJ + iuSPHZX + EVpVdkW + KWlmrNJ + "");
    }

    public void tryUpdateToken(Context context) {
        float bycczwtw0 = 30.30f;
        byte wfrqgytizr0 = 26;
        byte bfvtnbipj2 = 52;
        char anqhwhbom1 = 46;
        double ytlihfbpm0 = 92.92;
        double attpcctr4 = 96.96;
        short cervdjn3 = 77;
        double wovwwqjz2 = 83.83;
        int zwrfyaqb1 = 56;
        double smdoazou0 = 90.90;
        FirebaseMessaging.getInstance().getToken().addOnFailureListener(e -> e.printStackTrace()).addOnCompleteListener(task -> {
            String newToken = null;
            try {
                if (task.getResult() != null) {
                    newToken = (String) task.getResult();
                    Log.e("xxxFirebaseMessaging", "tryUpdateToken token complete:" + (newToken != null ? newToken : "null"));
                }
            } catch (Exception var5) {
                Exception e = var5;
                Log.e("xxxFirebaseMessaging", "tryUpdateToken token Exception:" + e.getMessage());
            }
            if (!TextUtils.isEmpty(newToken) && !getLastReportToken().equals(newToken)) {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken need, currToken:" + newToken + " lastToken:" + getLastReportToken());
                reportToken(newToken);
            } else {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken no need, currToken:" + newToken + " lastToken:" + getLastReportToken());
            }
            String currCountry = TidyLanguageUtils.getInstance().getCountry();
            if (!currCountry.equals(getLastReportCountry())) {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken need, currCountry:" + currCountry + " LastCountry:" + getLastReportCountry());
                String token1 = newToken;
                if (TextUtils.isEmpty(token1)) {
                    token1 = getLastReportToken();
                }
                reportToken(token1);
            }
        });
    }

    //垃圾方法
    private void RubhSyHO(short tzukroe0) {
        short tzukroe0a = tzukroe0;
        TextUtils.isDigitsOnly("RubhSyHO" + tzukroe0a + "RubhSyHO" + teAJtaO + FfWhXBJ + iuSPHZX + EVpVdkW + KWlmrNJ + VVZjGMs + "");
    }

    //垃圾方法
    private void hIJIjsGW(float uydkhfb0, byte zbgykyspc1) {
        byte zbgykyspc1a = zbgykyspc1;
        float uydkhfb0a = uydkhfb0;
    }

    //垃圾方法
    private void ZzhjoRiQ(double ttsfosw0, long zqzajvzjw1, long pcngtzmlk2, byte dbzvewqidh3) {
        byte dbzvewqidh3a = dbzvewqidh3;
        long pcngtzmlk2a = pcngtzmlk2;
        long zqzajvzjw1a = zqzajvzjw1;
        double ttsfosw0a = ttsfosw0;
        Log.e("ZzhjoRiQ", "ZzhjoRiQ" + pcngtzmlk2a + ttsfosw0a + dbzvewqidh3a + zqzajvzjw1a + "ZzhjoRiQ" + KWlmrNJ + EVpVdkW + iuSPHZX + teAJtaO + FfWhXBJ + VVZjGMs + "");
    }

    //垃圾方法
    private void MCVffCxe(int xpkhkclcl0) {
        int xpkhkclcl0a = xpkhkclcl0;
        new StringBuffer("MCVffCxe" + xpkhkclcl0a + "MCVffCxe" + EVpVdkW + FfWhXBJ + iuSPHZX + KWlmrNJ + VVZjGMs + teAJtaO + "");
    }

    public String getLastReportToken() {
        int xpkhkclcl0 = 26;
        byte dbzvewqidh3 = 86;
        long pcngtzmlk2 = 10L;
        long zqzajvzjw1 = 36L;
        double ttsfosw0 = 61.61;
        byte zbgykyspc1 = 74;
        float uydkhfb0 = 77.77f;
        short tzukroe0 = 23;
        MCVffCxe(xpkhkclcl0);
        RubhSyHO(tzukroe0);
        hIJIjsGW(uydkhfb0, zbgykyspc1);
        RubhSyHO(tzukroe0);
        hIJIjsGW(uydkhfb0, zbgykyspc1);
        MCVffCxe(xpkhkclcl0);
        return TidySPUtils.getString("fcm_token_xxx", "");
    }

    //垃圾方法
    private void DvjGawEP(short bsdfpxilmo0, short fnwcthycj1, short yiwcricnkx2, int pvwsavfkad3, byte skgcffcxw4) {
        byte skgcffcxw4a = skgcffcxw4;
        int pvwsavfkad3a = pvwsavfkad3;
        short yiwcricnkx2a = yiwcricnkx2;
        short fnwcthycj1a = fnwcthycj1;
        short bsdfpxilmo0a = bsdfpxilmo0;
        new WeakReference("DvjGawEP" + pvwsavfkad3a + skgcffcxw4a + yiwcricnkx2a + fnwcthycj1a + bsdfpxilmo0a + "DvjGawEP" + KWlmrNJ + VVZjGMs + teAJtaO + FfWhXBJ + iuSPHZX + EVpVdkW + "");
    }

    //垃圾方法
    private void zOEFIcws(boolean fepjbuhiqc0, int smsgcdfj1, double vfyvvbfnrd2, boolean lnvlwio3) {
        boolean lnvlwio3a = lnvlwio3;
        double vfyvvbfnrd2a = vfyvvbfnrd2;
        int smsgcdfj1a = smsgcdfj1;
        boolean fepjbuhiqc0a = fepjbuhiqc0;
        Log.w("zOEFIcws", "zOEFIcws" + vfyvvbfnrd2a + lnvlwio3a + smsgcdfj1a + fepjbuhiqc0a + "zOEFIcws" + VVZjGMs + FfWhXBJ + EVpVdkW + KWlmrNJ + iuSPHZX + teAJtaO + "");
    }

    //垃圾方法
    private void xDkOXwuW(double oojnfsi0, short vruqjeghq1, boolean fqrirmbcs2, boolean oinmcbq3) {
        boolean oinmcbq3a = oinmcbq3;
        boolean fqrirmbcs2a = fqrirmbcs2;
        short vruqjeghq1a = vruqjeghq1;
        double oojnfsi0a = oojnfsi0;
        new StringBuilder("xDkOXwuW" + oojnfsi0a + vruqjeghq1a + oinmcbq3a + fqrirmbcs2a + "xDkOXwuW" + KWlmrNJ + iuSPHZX + VVZjGMs + FfWhXBJ + EVpVdkW + teAJtaO + "");
    }

    //垃圾方法
    private void eujcYQhR(boolean bcqjsrpq0, short eogydugfmp1, byte unyszvt2, boolean lfhhpxtsqg3) {
        boolean lfhhpxtsqg3a = lfhhpxtsqg3;
        byte unyszvt2a = unyszvt2;
        short eogydugfmp1a = eogydugfmp1;
        boolean bcqjsrpq0a = bcqjsrpq0;
        TextUtils.isDigitsOnly("eujcYQhR" + bcqjsrpq0a + eogydugfmp1a + unyszvt2a + lfhhpxtsqg3a + "eujcYQhR" + teAJtaO + EVpVdkW + FfWhXBJ + iuSPHZX + VVZjGMs + KWlmrNJ + "");
    }

    private String getLastReportCountry() {
        boolean lfhhpxtsqg3 = true;
        byte unyszvt2 = 63;
        short eogydugfmp1 = 82;
        boolean bcqjsrpq0 = false;
        boolean oinmcbq3 = false;
        boolean fqrirmbcs2 = true;
        short vruqjeghq1 = 54;
        double oojnfsi0 = 15.15;
        boolean lnvlwio3 = true;
        double vfyvvbfnrd2 = 99.99;
        int smsgcdfj1 = 1;
        boolean fepjbuhiqc0 = false;
        byte skgcffcxw4 = 97;
        int pvwsavfkad3 = 6;
        short yiwcricnkx2 = 44;
        short fnwcthycj1 = 70;
        short bsdfpxilmo0 = 50;
        return TidySPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {

        //垃圾变量
        private float eVNTgQZ = 71.71f;

        boolean device;

        //垃圾变量
        private boolean LDinuFg = true;

        String token;

        //垃圾变量
        private double dCORzFw = 90.90;

        String country;

        public BindCallback(TidyMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        //垃圾方法
        private void LvyntFjl(int gwdwhxgr0, int pynqggozf1, byte lufeayv2, byte sodonaj3) {
            byte sodonaj3a = sodonaj3;
            byte lufeayv2a = lufeayv2;
            int pynqggozf1a = pynqggozf1;
            int gwdwhxgr0a = gwdwhxgr0;
            Log.i("LvyntFjl", "LvyntFjl" + sodonaj3a + gwdwhxgr0a + lufeayv2a + pynqggozf1a + "LvyntFjl" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void AvNiWpxC(double lhwvqsea0, int ntsgomgi1, short ymkovjgsdh2) {
            short ymkovjgsdh2a = ymkovjgsdh2;
            int ntsgomgi1a = ntsgomgi1;
            double lhwvqsea0a = lhwvqsea0;
            Log.w("AvNiWpxC", "AvNiWpxC" + ntsgomgi1a + lhwvqsea0a + ymkovjgsdh2a + "AvNiWpxC" + LDinuFg + dCORzFw + eVNTgQZ + "");
        }

        //垃圾方法
        private void uUQHCNok(char zwpamkdyot0, char obaycxhtts1, boolean pprqawbi2, int flmijtawp3, long ktcqrvh4) {
            long ktcqrvh4a = ktcqrvh4;
            int flmijtawp3a = flmijtawp3;
            boolean pprqawbi2a = pprqawbi2;
            char obaycxhtts1a = obaycxhtts1;
            char zwpamkdyot0a = zwpamkdyot0;
            new WeakReference("uUQHCNok" + zwpamkdyot0a + obaycxhtts1a + ktcqrvh4a + pprqawbi2a + flmijtawp3a + "uUQHCNok" + dCORzFw + eVNTgQZ + LDinuFg + "");
        }

        //垃圾方法
        private void GDaeqvSY(double gzendcz0, char gyycblky1, float zvqxfvntz2, int bbkvskz3) {
            int bbkvskz3a = bbkvskz3;
            float zvqxfvntz2a = zvqxfvntz2;
            char gyycblky1a = gyycblky1;
            double gzendcz0a = gzendcz0;
            new AttributedString("GDaeqvSY" + gzendcz0a + zvqxfvntz2a + gyycblky1a + bbkvskz3a + "GDaeqvSY" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void BOcEtHBz(long bxfamfaqkc0, float dmczqaqae1, double zovsfddghe2) {
            double zovsfddghe2a = zovsfddghe2;
            float dmczqaqae1a = dmczqaqae1;
            long bxfamfaqkc0a = bxfamfaqkc0;
            TextUtils.isEmpty("BOcEtHBz" + zovsfddghe2a + bxfamfaqkc0a + dmczqaqae1a + "BOcEtHBz" + eVNTgQZ + dCORzFw + LDinuFg + "");
        }

        //垃圾方法
        private void PSHViODw(short zuksxkybq0) {
            short zuksxkybq0a = zuksxkybq0;
            new StringReader("PSHViODw" + zuksxkybq0a + "PSHViODw" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void kDsnWGRR(boolean tynypyvtoy0, boolean rjwdrboqa1, byte ugrrkqgm2, short gfbnqtrgwu3, char ldxoaquax4) {
            char ldxoaquax4a = ldxoaquax4;
            short gfbnqtrgwu3a = gfbnqtrgwu3;
            byte ugrrkqgm2a = ugrrkqgm2;
            boolean rjwdrboqa1a = rjwdrboqa1;
            boolean tynypyvtoy0a = tynypyvtoy0;
            Log.w("kDsnWGRR", "kDsnWGRR" + ugrrkqgm2a + gfbnqtrgwu3a + rjwdrboqa1a + ldxoaquax4a + tynypyvtoy0a + "kDsnWGRR" + dCORzFw + eVNTgQZ + LDinuFg + "");
        }

        //垃圾方法
        private void qwWzPoDL(boolean nszkoxl0, byte puydykwiep1, int eaycsxadav2, short gfmcgqnfes3) {
            short gfmcgqnfes3a = gfmcgqnfes3;
            int eaycsxadav2a = eaycsxadav2;
            byte puydykwiep1a = puydykwiep1;
            boolean nszkoxl0a = nszkoxl0;
            TextUtils.isEmpty("qwWzPoDL" + nszkoxl0a + eaycsxadav2a + gfmcgqnfes3a + puydykwiep1a + "qwWzPoDL" + eVNTgQZ + LDinuFg + dCORzFw + "");
        }

        //垃圾方法
        private void DLBcQsXv(double tpugbbswf0, char gzngbkuydb1, double hamsqhiqzm2, char kvbytrh3, int rlhzzwtmx4) {
            int rlhzzwtmx4a = rlhzzwtmx4;
            char kvbytrh3a = kvbytrh3;
            double hamsqhiqzm2a = hamsqhiqzm2;
            char gzngbkuydb1a = gzngbkuydb1;
            double tpugbbswf0a = tpugbbswf0;
            new StringReader("DLBcQsXv" + gzngbkuydb1a + kvbytrh3a + rlhzzwtmx4a + tpugbbswf0a + hamsqhiqzm2a + "DLBcQsXv" + eVNTgQZ + dCORzFw + LDinuFg + "");
        }

        //垃圾方法
        private void NeriHaNq(double ybkpuvt0, short msqmxjtfc1, double bzqsliglst2) {
            double bzqsliglst2a = bzqsliglst2;
            short msqmxjtfc1a = msqmxjtfc1;
            double ybkpuvt0a = ybkpuvt0;
            new StringReader("NeriHaNq" + msqmxjtfc1a + ybkpuvt0a + bzqsliglst2a + "NeriHaNq" + LDinuFg + eVNTgQZ + dCORzFw + "");
        }

        //垃圾方法
        private void HwwReAQu(short snjfmuky0) {
            short snjfmuky0a = snjfmuky0;
            new String("HwwReAQu" + snjfmuky0a + "HwwReAQu" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void uvrFqIZF(byte tbtirugjbu0, int tgjitqeof1, float gkvhvimft2, boolean aqmcjgcx3) {
            boolean aqmcjgcx3a = aqmcjgcx3;
            float gkvhvimft2a = gkvhvimft2;
            int tgjitqeof1a = tgjitqeof1;
            byte tbtirugjbu0a = tbtirugjbu0;
            Log.e("uvrFqIZF", "uvrFqIZF" + tgjitqeof1a + gkvhvimft2a + tbtirugjbu0a + aqmcjgcx3a + "uvrFqIZF" + LDinuFg + dCORzFw + eVNTgQZ + "");
        }

        //垃圾方法
        private void GDJLZMLe(boolean zpgdflrm0) {
            boolean zpgdflrm0a = zpgdflrm0;
            new File("GDJLZMLe" + zpgdflrm0a + "GDJLZMLe" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void zebaaDju(int aohigvn0, byte xshkhnboh1, char rjnlycidg2) {
            char rjnlycidg2a = rjnlycidg2;
            byte xshkhnboh1a = xshkhnboh1;
            int aohigvn0a = aohigvn0;
            new StringReader("zebaaDju" + aohigvn0a + xshkhnboh1a + rjnlycidg2a + "zebaaDju" + dCORzFw + eVNTgQZ + LDinuFg + "");
        }

        //垃圾方法
        private void AHmMqWzb(double zrxchqstf0, boolean rmnwpqqo1, short tzaapbkpm2) {
            short tzaapbkpm2a = tzaapbkpm2;
            boolean rmnwpqqo1a = rmnwpqqo1;
            double zrxchqstf0a = zrxchqstf0;
            new StringReader("AHmMqWzb" + zrxchqstf0a + tzaapbkpm2a + rmnwpqqo1a + "AHmMqWzb" + eVNTgQZ + LDinuFg + dCORzFw + "");
        }

        //垃圾方法
        private void rMCOCzRp(float eycpjcp0, boolean trjpkye1) {
            boolean trjpkye1a = trjpkye1;
            float eycpjcp0a = eycpjcp0;
            new AttributedString("rMCOCzRp" + eycpjcp0a + trjpkye1a + "rMCOCzRp" + dCORzFw + eVNTgQZ + LDinuFg + "");
        }

        //垃圾方法
        private void UIymWFLP(float sgalpqgv0, double zjothveop1) {
            double zjothveop1a = zjothveop1;
            float sgalpqgv0a = sgalpqgv0;
            new File("UIymWFLP" + sgalpqgv0a + zjothveop1a + "UIymWFLP" + eVNTgQZ + LDinuFg + dCORzFw + "");
        }

        //垃圾方法
        private void rjeGcxpq(byte nbqxqmootq0) {
            byte nbqxqmootq0a = nbqxqmootq0;
            System.out.println("rjeGcxpq" + nbqxqmootq0a + "rjeGcxpq" + LDinuFg + dCORzFw + eVNTgQZ + "");
        }

        //垃圾方法
        private void lnvYicwP(short lfrutlj0, byte bmnriirad1, float qsatnjr2, byte gothsjj3, short ctykrazwtk4) {
            short ctykrazwtk4a = ctykrazwtk4;
            byte gothsjj3a = gothsjj3;
            float qsatnjr2a = qsatnjr2;
            byte bmnriirad1a = bmnriirad1;
            short lfrutlj0a = lfrutlj0;
            new StringReader("lnvYicwP" + qsatnjr2a + gothsjj3a + lfrutlj0a + bmnriirad1a + ctykrazwtk4a + "lnvYicwP" + eVNTgQZ + LDinuFg + dCORzFw + "");
        }

        //垃圾方法
        private void BgvxpDTA(boolean zutaflyk0, double ggrmypbn1, double bhoqaoropg2, char rbmpnfenae3, boolean lxdtisi4) {
            boolean lxdtisi4a = lxdtisi4;
            char rbmpnfenae3a = rbmpnfenae3;
            double bhoqaoropg2a = bhoqaoropg2;
            double ggrmypbn1a = ggrmypbn1;
            boolean zutaflyk0a = zutaflyk0;
            new Thread("BgvxpDTA" + zutaflyk0a + rbmpnfenae3a + ggrmypbn1a + lxdtisi4a + bhoqaoropg2a + "BgvxpDTA" + LDinuFg + dCORzFw + eVNTgQZ + "");
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            boolean lxdtisi4 = true;
            char rbmpnfenae3 = 45;
            double bhoqaoropg2 = 32.32;
            double ggrmypbn1 = 79.79;
            boolean zutaflyk0 = true;
            short ctykrazwtk4 = 86;
            byte gothsjj3 = 31;
            float qsatnjr2 = 27.27f;
            byte bmnriirad1 = 23;
            short lfrutlj0 = 92;
            byte nbqxqmootq0 = 70;
            double zjothveop1 = 96.96;
            float sgalpqgv0 = 4.4f;
            boolean trjpkye1 = false;
            float eycpjcp0 = 30.30f;
            short tzaapbkpm2 = 4;
            boolean rmnwpqqo1 = false;
            double zrxchqstf0 = 5.5;
            char rjnlycidg2 = 75;
            byte xshkhnboh1 = 14;
            int aohigvn0 = 45;
            boolean zpgdflrm0 = false;
            boolean aqmcjgcx3 = true;
            float gkvhvimft2 = 17.17f;
            int tgjitqeof1 = 16;
            byte tbtirugjbu0 = 16;
            short snjfmuky0 = 69;
            double bzqsliglst2 = 1.1;
            short msqmxjtfc1 = 79;
            double ybkpuvt0 = 68.68;
            int rlhzzwtmx4 = 32;
            char kvbytrh3 = 18;
            double hamsqhiqzm2 = 97.97;
            char gzngbkuydb1 = 19;
            double tpugbbswf0 = 59.59;
            short gfmcgqnfes3 = 19;
            int eaycsxadav2 = 18;
            byte puydykwiep1 = 74;
            boolean nszkoxl0 = true;
            char ldxoaquax4 = 26;
            short gfbnqtrgwu3 = 83;
            byte ugrrkqgm2 = 94;
            boolean rjwdrboqa1 = false;
            boolean tynypyvtoy0 = false;
            short zuksxkybq0 = 100;
            double zovsfddghe2 = 55.55;
            float dmczqaqae1 = 60.60f;
            long bxfamfaqkc0 = 74L;
            int bbkvskz3 = 60;
            float zvqxfvntz2 = 89.89f;
            char gyycblky1 = 45;
            double gzendcz0 = 77.77;
            long ktcqrvh4 = 99L;
            int flmijtawp3 = 45;
            boolean pprqawbi2 = true;
            char obaycxhtts1 = 77;
            char zwpamkdyot0 = 47;
            short ymkovjgsdh2 = 38;
            int ntsgomgi1 = 56;
            double lhwvqsea0 = 16.16;
            byte sodonaj3 = 96;
            byte lufeayv2 = 38;
            int pynqggozf1 = 19;
            int gwdwhxgr0 = 35;
            uvrFqIZF(tbtirugjbu0, tgjitqeof1, gkvhvimft2, aqmcjgcx3);
            DLBcQsXv(tpugbbswf0, gzngbkuydb1, hamsqhiqzm2, kvbytrh3, rlhzzwtmx4);
            LvyntFjl(gwdwhxgr0, pynqggozf1, lufeayv2, sodonaj3);
            AHmMqWzb(zrxchqstf0, rmnwpqqo1, tzaapbkpm2);
            NeriHaNq(ybkpuvt0, msqmxjtfc1, bzqsliglst2);
            uUQHCNok(zwpamkdyot0, obaycxhtts1, pprqawbi2, flmijtawp3, ktcqrvh4);
            rjeGcxpq(nbqxqmootq0);
            PSHViODw(zuksxkybq0);
            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            rMCOCzRp(eycpjcp0, trjpkye1);
            uUQHCNok(zwpamkdyot0, obaycxhtts1, pprqawbi2, flmijtawp3, ktcqrvh4);
            BOcEtHBz(bxfamfaqkc0, dmczqaqae1, zovsfddghe2);
            Bundle bundle = new Bundle();
            AvNiWpxC(lhwvqsea0, ntsgomgi1, ymkovjgsdh2);
            AHmMqWzb(zrxchqstf0, rmnwpqqo1, tzaapbkpm2);
            GDJLZMLe(zpgdflrm0);
            GDJLZMLe(zpgdflrm0);
            uvrFqIZF(tbtirugjbu0, tgjitqeof1, gkvhvimft2, aqmcjgcx3);
            rjeGcxpq(nbqxqmootq0);
            zebaaDju(aohigvn0, xshkhnboh1, rjnlycidg2);
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            kDsnWGRR(tynypyvtoy0, rjwdrboqa1, ugrrkqgm2, gfbnqtrgwu3, ldxoaquax4);
            kDsnWGRR(tynypyvtoy0, rjwdrboqa1, ugrrkqgm2, gfbnqtrgwu3, ldxoaquax4);
            NeriHaNq(ybkpuvt0, msqmxjtfc1, bzqsliglst2);
            uUQHCNok(zwpamkdyot0, obaycxhtts1, pprqawbi2, flmijtawp3, ktcqrvh4);
            HwwReAQu(snjfmuky0);
            zebaaDju(aohigvn0, xshkhnboh1, rjnlycidg2);
            GDaeqvSY(gzendcz0, gyycblky1, zvqxfvntz2, bbkvskz3);
            rjeGcxpq(nbqxqmootq0);
            LvyntFjl(gwdwhxgr0, pynqggozf1, lufeayv2, sodonaj3);
            if (response.isSuccessful()) {
                qwWzPoDL(nszkoxl0, puydykwiep1, eaycsxadav2, gfmcgqnfes3);
                AvNiWpxC(lhwvqsea0, ntsgomgi1, ymkovjgsdh2);
                BOcEtHBz(bxfamfaqkc0, dmczqaqae1, zovsfddghe2);
                LvyntFjl(gwdwhxgr0, pynqggozf1, lufeayv2, sodonaj3);
                HwwReAQu(snjfmuky0);
                uUQHCNok(zwpamkdyot0, obaycxhtts1, pprqawbi2, flmijtawp3, ktcqrvh4);
                NeriHaNq(ybkpuvt0, msqmxjtfc1, bzqsliglst2);
                GDaeqvSY(gzendcz0, gyycblky1, zvqxfvntz2, bbkvskz3);
                TidySPUtils.putString("fcm_token_xxx", this.token);
                TidySPUtils.putString("fcm_country_xxx", this.country);
            }
            NeriHaNq(ybkpuvt0, msqmxjtfc1, bzqsliglst2);
            rMCOCzRp(eycpjcp0, trjpkye1);
            AHmMqWzb(zrxchqstf0, rmnwpqqo1, tzaapbkpm2);
            isBindingDevice = false;
        }

        //垃圾方法
        private void XlcgMSzy(short tezplzjvg0, char nuwfttzftd1, byte nyccvqopd2) {
            byte nyccvqopd2a = nyccvqopd2;
            char nuwfttzftd1a = nuwfttzftd1;
            short tezplzjvg0a = tezplzjvg0;
            Log.e("XlcgMSzy", "XlcgMSzy" + nuwfttzftd1a + tezplzjvg0a + nyccvqopd2a + "XlcgMSzy" + LDinuFg + eVNTgQZ + dCORzFw + "");
        }

        //垃圾方法
        private void AZKehLhm(long cwzbwiu0, boolean tphilil1, char mmrsayxxc2) {
            char mmrsayxxc2a = mmrsayxxc2;
            boolean tphilil1a = tphilil1;
            long cwzbwiu0a = cwzbwiu0;
            Log.w("AZKehLhm", "AZKehLhm" + tphilil1a + cwzbwiu0a + mmrsayxxc2a + "AZKehLhm" + eVNTgQZ + LDinuFg + dCORzFw + "");
        }

        //垃圾方法
        private void pNKYZEIz(boolean lghaeiysf0, int lslkuiivgh1, short guoshqb2, float fhgforg3) {
            float fhgforg3a = fhgforg3;
            short guoshqb2a = guoshqb2;
            int lslkuiivgh1a = lslkuiivgh1;
            boolean lghaeiysf0a = lghaeiysf0;
            new WeakReference("pNKYZEIz" + lghaeiysf0a + fhgforg3a + guoshqb2a + lslkuiivgh1a + "pNKYZEIz" + eVNTgQZ + LDinuFg + dCORzFw + "");
        }

        //垃圾方法
        private void AdwmUgZV(boolean cwfxlknski0, float gheixvanfr1, double fljkekna2, char epesmxdxly3, short pnznyihg4) {
            short pnznyihg4a = pnznyihg4;
            char epesmxdxly3a = epesmxdxly3;
            double fljkekna2a = fljkekna2;
            float gheixvanfr1a = gheixvanfr1;
            boolean cwfxlknski0a = cwfxlknski0;
            new Intent("AdwmUgZV" + pnznyihg4a + fljkekna2a + epesmxdxly3a + gheixvanfr1a + cwfxlknski0a + "AdwmUgZV" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void FqdFqMWg(double hqbtdyv0, byte evhunudel1, int jexmuutcr2) {
            int jexmuutcr2a = jexmuutcr2;
            byte evhunudel1a = evhunudel1;
            double hqbtdyv0a = hqbtdyv0;
            new Thread("FqdFqMWg" + jexmuutcr2a + hqbtdyv0a + evhunudel1a + "FqdFqMWg" + LDinuFg + eVNTgQZ + dCORzFw + "");
        }

        //垃圾方法
        private void NYjsFYvY(int homijshj0) {
            int homijshj0a = homijshj0;
            new File("NYjsFYvY" + homijshj0a + "NYjsFYvY" + dCORzFw + LDinuFg + eVNTgQZ + "");
        }

        //垃圾方法
        private void XjwOzaQg(int jscbdcgmwd0, int bwdyfpi1, char uhozlijoko2, short lscfqzcki3) {
            short lscfqzcki3a = lscfqzcki3;
            char uhozlijoko2a = uhozlijoko2;
            int bwdyfpi1a = bwdyfpi1;
            int jscbdcgmwd0a = jscbdcgmwd0;
            Log.e("XjwOzaQg", "XjwOzaQg" + bwdyfpi1a + lscfqzcki3a + jscbdcgmwd0a + uhozlijoko2a + "XjwOzaQg" + LDinuFg + dCORzFw + eVNTgQZ + "");
        }

        //垃圾方法
        private void wpqjaOaz(char loooeih0, long qelnkydtv1, double hezycsm2) {
            double hezycsm2a = hezycsm2;
            long qelnkydtv1a = qelnkydtv1;
            char loooeih0a = loooeih0;
            new StringBuffer("wpqjaOaz" + hezycsm2a + qelnkydtv1a + loooeih0a + "wpqjaOaz" + eVNTgQZ + dCORzFw + LDinuFg + "");
        }

        public void onFailure(Call<ResponseBody> call, Throwable t) {
            double hezycsm2 = 49.49;
            long qelnkydtv1 = 71L;
            char loooeih0 = 82;
            short lscfqzcki3 = 59;
            char uhozlijoko2 = 9;
            int bwdyfpi1 = 30;
            int jscbdcgmwd0 = 62;
            int homijshj0 = 54;
            int jexmuutcr2 = 36;
            byte evhunudel1 = 70;
            double hqbtdyv0 = 8.8;
            short pnznyihg4 = 48;
            char epesmxdxly3 = 100;
            double fljkekna2 = 37.37;
            float gheixvanfr1 = 16.16f;
            boolean cwfxlknski0 = false;
            float fhgforg3 = 85.85f;
            short guoshqb2 = 2;
            int lslkuiivgh1 = 88;
            boolean lghaeiysf0 = false;
            char mmrsayxxc2 = 14;
            boolean tphilil1 = true;
            long cwzbwiu0 = 10L;
            byte nyccvqopd2 = 29;
            char nuwfttzftd1 = 5;
            short tezplzjvg0 = 0;
            XjwOzaQg(jscbdcgmwd0, bwdyfpi1, uhozlijoko2, lscfqzcki3);
            pNKYZEIz(lghaeiysf0, lslkuiivgh1, guoshqb2, fhgforg3);
            XlcgMSzy(tezplzjvg0, nuwfttzftd1, nyccvqopd2);
            XlcgMSzy(tezplzjvg0, nuwfttzftd1, nyccvqopd2);
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            pNKYZEIz(lghaeiysf0, lslkuiivgh1, guoshqb2, fhgforg3);
            FqdFqMWg(hqbtdyv0, evhunudel1, jexmuutcr2);
            XjwOzaQg(jscbdcgmwd0, bwdyfpi1, uhozlijoko2, lscfqzcki3);
            AdwmUgZV(cwfxlknski0, gheixvanfr1, fljkekna2, epesmxdxly3, pnznyihg4);
            AdwmUgZV(cwfxlknski0, gheixvanfr1, fljkekna2, epesmxdxly3, pnznyihg4);
            XjwOzaQg(jscbdcgmwd0, bwdyfpi1, uhozlijoko2, lscfqzcki3);
            pNKYZEIz(lghaeiysf0, lslkuiivgh1, guoshqb2, fhgforg3);
            isBindingDevice = false;
        }
    }

    //垃圾变量
    private boolean iuSPHZX = true;

    //垃圾变量
    private boolean qSJTyya = false;

    //垃圾变量
    private float KWlmrNJ = 41.41f;

    //垃圾变量
    private double fhobOKd = 41.41;

    //垃圾变量
    private float VVZjGMs = 23.23f;

    //垃圾变量
    private int KtKgsJv = 50;

    //垃圾方法
    private void fVepmBwh(byte llahrcef0, float fmdxhhtxz1, long vqxuxpkh2) {
        long vqxuxpkh2a = vqxuxpkh2;
        float fmdxhhtxz1a = fmdxhhtxz1;
        byte llahrcef0a = llahrcef0;
        new File("fVepmBwh" + llahrcef0a + fmdxhhtxz1a + vqxuxpkh2a + "fVepmBwh" + FfWhXBJ + EVpVdkW + iuSPHZX + KWlmrNJ + teAJtaO + VVZjGMs + "");
    }

    //垃圾方法
    private void GkuZMCJh(long mbltkitk0, float dbpuwyevid1, boolean ibhrsbroub2) {
        boolean ibhrsbroub2a = ibhrsbroub2;
        float dbpuwyevid1a = dbpuwyevid1;
        long mbltkitk0a = mbltkitk0;
        new File("GkuZMCJh" + ibhrsbroub2a + dbpuwyevid1a + mbltkitk0a + "GkuZMCJh" + KWlmrNJ + iuSPHZX + teAJtaO + FfWhXBJ + EVpVdkW + VVZjGMs + "");
    }

    //垃圾方法
    private void WsEltzGO(double geumderyl0, float wrmfunyrao1, short giqicvxkl2, short ldxezxjw3) {
        short ldxezxjw3a = ldxezxjw3;
        short giqicvxkl2a = giqicvxkl2;
        float wrmfunyrao1a = wrmfunyrao1;
        double geumderyl0a = geumderyl0;
        Log.i("WsEltzGO", "WsEltzGO" + giqicvxkl2a + geumderyl0a + wrmfunyrao1a + ldxezxjw3a + "WsEltzGO" + EVpVdkW + VVZjGMs + teAJtaO + iuSPHZX + KWlmrNJ + FfWhXBJ + "");
    }

    //垃圾方法
    private void fPdbTbUf(char fjoyasnyc0, byte xqqtriqaqx1, byte sewsbzjms2) {
        byte sewsbzjms2a = sewsbzjms2;
        byte xqqtriqaqx1a = xqqtriqaqx1;
        char fjoyasnyc0a = fjoyasnyc0;
        new AttributedString("fPdbTbUf" + sewsbzjms2a + xqqtriqaqx1a + fjoyasnyc0a + "fPdbTbUf" + EVpVdkW + teAJtaO + FfWhXBJ + iuSPHZX + KWlmrNJ + VVZjGMs + "");
    }

    //垃圾方法
    private void CtDszFYg(byte rqvsomkth0, double olqcjssplk1, int yzpsumvrnp2, int uuqoxzd3) {
        int uuqoxzd3a = uuqoxzd3;
        int yzpsumvrnp2a = yzpsumvrnp2;
        double olqcjssplk1a = olqcjssplk1;
        byte rqvsomkth0a = rqvsomkth0;
        new String("CtDszFYg" + yzpsumvrnp2a + olqcjssplk1a + rqvsomkth0a + uuqoxzd3a + "CtDszFYg" + iuSPHZX + KWlmrNJ + VVZjGMs + FfWhXBJ + EVpVdkW + teAJtaO + "");
    }

    //垃圾方法
    private void ZoiBmaOy(byte knwlmrgjho0, boolean twpiwhfu1, float mitjegzw2, long uxdplzhz3, double kuwouwmvhk4) {
        double kuwouwmvhk4a = kuwouwmvhk4;
        long uxdplzhz3a = uxdplzhz3;
        float mitjegzw2a = mitjegzw2;
        boolean twpiwhfu1a = twpiwhfu1;
        byte knwlmrgjho0a = knwlmrgjho0;
        new WeakReference("ZoiBmaOy" + uxdplzhz3a + mitjegzw2a + kuwouwmvhk4a + knwlmrgjho0a + twpiwhfu1a + "ZoiBmaOy" + VVZjGMs + KWlmrNJ + FfWhXBJ + teAJtaO + iuSPHZX + EVpVdkW + "");
    }

    //垃圾方法
    private void ZGBcjSiU(long tmpdpsn0, char abbtjxh1, float gpouvccqk2, float opobmqmdeq3) {
        float opobmqmdeq3a = opobmqmdeq3;
        float gpouvccqk2a = gpouvccqk2;
        char abbtjxh1a = abbtjxh1;
        long tmpdpsn0a = tmpdpsn0;
        TextUtils.isEmpty("ZGBcjSiU" + opobmqmdeq3a + gpouvccqk2a + abbtjxh1a + tmpdpsn0a + "ZGBcjSiU" + EVpVdkW + KWlmrNJ + iuSPHZX + VVZjGMs + teAJtaO + FfWhXBJ + "");
    }

    //垃圾方法
    private void WlXcWBFm(boolean fjppmwizhf0, int ksqtgwjv1, long liefdgf2) {
        long liefdgf2a = liefdgf2;
        int ksqtgwjv1a = ksqtgwjv1;
        boolean fjppmwizhf0a = fjppmwizhf0;
        TextUtils.isDigitsOnly("WlXcWBFm" + liefdgf2a + ksqtgwjv1a + fjppmwizhf0a + "WlXcWBFm" + EVpVdkW + KWlmrNJ + teAJtaO + iuSPHZX + FfWhXBJ + VVZjGMs + "");
    }

    public String toString() {
        long liefdgf2 = 84L;
        int ksqtgwjv1 = 18;
        boolean fjppmwizhf0 = true;
        float opobmqmdeq3 = 74.74f;
        float gpouvccqk2 = 76.76f;
        char abbtjxh1 = 83;
        long tmpdpsn0 = 67L;
        double kuwouwmvhk4 = 94.94;
        long uxdplzhz3 = 100L;
        float mitjegzw2 = 77.77f;
        boolean twpiwhfu1 = false;
        byte knwlmrgjho0 = 32;
        int uuqoxzd3 = 19;
        int yzpsumvrnp2 = 4;
        double olqcjssplk1 = 76.76;
        byte rqvsomkth0 = 76;
        byte sewsbzjms2 = 28;
        byte xqqtriqaqx1 = 44;
        char fjoyasnyc0 = 51;
        short ldxezxjw3 = 23;
        short giqicvxkl2 = 12;
        float wrmfunyrao1 = 71.71f;
        double geumderyl0 = 90.90;
        boolean ibhrsbroub2 = false;
        float dbpuwyevid1 = 90.90f;
        long mbltkitk0 = 50L;
        long vqxuxpkh2 = 38L;
        float fmdxhhtxz1 = 47.47f;
        byte llahrcef0 = 96;
        ZoiBmaOy(knwlmrgjho0, twpiwhfu1, mitjegzw2, uxdplzhz3, kuwouwmvhk4);
        WsEltzGO(geumderyl0, wrmfunyrao1, giqicvxkl2, ldxezxjw3);
        GkuZMCJh(mbltkitk0, dbpuwyevid1, ibhrsbroub2);
        ZGBcjSiU(tmpdpsn0, abbtjxh1, gpouvccqk2, opobmqmdeq3);
        CtDszFYg(rqvsomkth0, olqcjssplk1, yzpsumvrnp2, uuqoxzd3);
        TextUtils.isDigitsOnly("" + qSJTyya + fhobOKd + KtKgsJv + "");
        CtDszFYg(rqvsomkth0, olqcjssplk1, yzpsumvrnp2, uuqoxzd3);
        fPdbTbUf(fjoyasnyc0, xqqtriqaqx1, sewsbzjms2);
        WlXcWBFm(fjppmwizhf0, ksqtgwjv1, liefdgf2);
        CtDszFYg(rqvsomkth0, olqcjssplk1, yzpsumvrnp2, uuqoxzd3);
        ZGBcjSiU(tmpdpsn0, abbtjxh1, gpouvccqk2, opobmqmdeq3);
        GkuZMCJh(mbltkitk0, dbpuwyevid1, ibhrsbroub2);
        ZGBcjSiU(tmpdpsn0, abbtjxh1, gpouvccqk2, opobmqmdeq3);
        fPdbTbUf(fjoyasnyc0, xqqtriqaqx1, sewsbzjms2);
        ZoiBmaOy(knwlmrgjho0, twpiwhfu1, mitjegzw2, uxdplzhz3, kuwouwmvhk4);
        return super.toString();
    }
}
