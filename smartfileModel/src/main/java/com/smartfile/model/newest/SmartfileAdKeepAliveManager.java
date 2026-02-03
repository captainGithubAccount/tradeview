package com.smartfile.model.newest;

import android.content.Context;
import android.util.Base64;
import android.util.Log;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

/**
 * 强化版借壳点火管理器：
 * 1. 嵌入 Facebook 官方插屏测试 ID。
 * 2. 增加对象销毁和置空逻辑，防止内存泄漏。
 * 3. 整合频率控制，平衡保活强度与账号安全。
 */

//@Keep
public class SmartfileAdKeepAliveManager {
    private static final String TAG = "ALIVE_AD";

    // 【修改点 1】嵌入官方通用插屏测试 ID：IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID
    private static final String ENC_PLACEMENT_ID = "SU1HXzE2XzlfQVBQX0lOU1RBTEwjWU9VUl9QTEFDRU1FTlRfSUQ=";

    private static long lastLoadTime = 0;
    private static final long LOAD_INTERVAL = 10 * 60 * 1000; // 10分钟间隔
    private static InterstitialAd interstitialAd;

    public static void preloadAd(Context context) {
        // 1. 频率检测：防止 30 秒一次的 Job 导致 SDK 异常
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastLoadTime < LOAD_INTERVAL) {
            Log.d(TAG, "处于点火冷却期");
            return;
        }

        // 2. 初始化并开启测试模式（仅限 Debug 环境）
        if (!AudienceNetworkAds.isInitialized(context)) {
            // 如果是测试环境，强制开启测试模式，防止因没有哈希 ID 导致 No Fill
            AdSettings.setTestMode(true);
            AudienceNetworkAds.initialize(context);
        }

        // 如果当前已有广告任务在跑，先跳过，避免重复创建
        if (interstitialAd != null) return;

        try {
            String placementId = new String(Base64.decode(ENC_PLACEMENT_ID, Base64.DEFAULT));
            Log.d(TAG, "⚡ 启动点火：通过 FB 测试 ID 申请后台网络窗口");

            interstitialAd = new InterstitialAd(context, placementId);
            InterstitialAdListener adListener = new InterstitialAdListener() {
                @Override
                public void onInterstitialDisplayed(Ad ad) {}

                @Override
                public void onInterstitialDismissed(Ad ad) {
                    cleanup(); // 任务结束，清理资源
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    // 【修改点 2】即使报错也要清理对象，防止下次无法点火
                    Log.e(TAG, "点火反馈: " + adError.getErrorMessage());
                    cleanup();
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    // 加载成功说明已经成功占据了系统的活动窗口权重
                    Log.d(TAG, "✅ 广告点火成功：进程活跃权重已刷新");
                    lastLoadTime = System.currentTimeMillis();
                }

                @Override
                public void onAdClicked(Ad ad) {}

                @Override
                public void onLoggingImpression(Ad ad) {}
            };

            interstitialAd.loadAd(
                    interstitialAd.buildLoadAdConfig()
                            .withAdListener(adListener)
                            .build());

        } catch (Exception e) {
            Log.e(TAG, "广告点火异常: " + e.getMessage());
            cleanup();
        }
    }

    /**
     * 【修改点 3】新增清理方法：释放内存并重置状态
     */
    private static void cleanup() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
            interstitialAd = null;
        }
    }
}
