#############################################
#
# 基础混淆配置
#
#############################################

# Gson
-keepattributes *Annotation*
-keep class sun.misc.Unsafe.** { *; }
-keep class com.idea.fifaalarmclock.entity.**
-keep class com.google.gson.stream.** { *; }
#-keep class com.soacross.wifi.bean.** { *; }



# OkHttp3
-dontwarn okhttp3.logging.**
-keep class okhttp3.internal.**{*;}
-dontwarn okio.**


# Retrofit
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions



# 保留 CleanTimeManager 类及其所有方法
-keep class com.smartfile.model.CleanTimeManager {
    public static <methods>;
    private static <methods>;
    public <methods>;
    private <methods>;
}

# 保留 SmartFileManager 的 finish_coldtime 字段（如果存在）
-keepclassmembers class com.smartfile.model.SmartFileManager {
    public static *** finish_coldtime;
}


# 保留 Firebase RemoteConfig 相关的方法调用
-keep class com.google.firebase.remoteconfig.FirebaseRemoteConfig {
    public *;
}


# ==================== CleanTimeManager 类完全保留 ====================
# 保留 CleanTimeManager 类本身
-keep class com.smartfile.model.CleanTimeManager

# 保留 CleanTimeManager 的所有成员（字段、方法、构造函数）
-keepclassmembers class com.smartfile.model.CleanTimeManager {
    *;
}

# 或者更简洁的写法（效果相同）：
# -keep class com.smartfile.model.CleanTimeManager { *; }

# ==================== 保留所有注解 ====================
# 保留 @Keep 注解，防止注解被移除
-keepattributes *Annotation*

# 具体保留 @Keep 注解
-keep @androidx.annotation.Keep class *

# 保留使用 @Keep 注解的类及其成员
-keep @androidx.annotation.Keep class * {
    *;
}







# ==================== 保留 SmartFileManager 中的字段 ====================
# ==================== start ====================


# 保留 SmartFileManager 类中的 finish_coldtime 字段
-keepclassmembers class com.smartfile.model.SmartFileManager {
    public static *** finish_coldtime;
}

# ==================== 保留 Firebase RemoteConfig 相关 ====================
# 保留 Firebase RemoteConfig 的所有方法和类
-keep class com.google.firebase.remoteconfig.** {
    *;
}

# 保留 Firebase 相关的类
-keep class com.google.firebase.** {
    *;
}

# ==================== 保留 SharedPreferences 相关 ====================
# 确保 SharedPreferences 的 key 字符串不被混淆
-keepclassmembers class * {
    static final java.lang.String LAST_CLEANUP_TIME_KEY;
}

# ==================== 其他可能需要保留的 ====================
# 保留所有日志 TAG 字段
-keepclassmembers class * {
    private static final java.lang.String TAG;
}

# 保留 Runnable 回调（如果你使用了 lambda 表达式）
-keepattributes InnerClasses
-keepclassmembers class * implements java.lang.Runnable {
    public void run();
}

# 保留 Context 参数的方法
-keepclassmembers class * {
    public static void init(android.content.Context);
}

# CleanTimeManager 完全保护规则
-keep class com.smartfile.model.CleanTimeManager {
    *;
}

# 确保 Firebase RemoteConfig 调用正常工作
-keep class com.google.firebase.remoteconfig.FirebaseRemoteConfig { *; }
-keep class com.google.firebase.remoteconfig.FirebaseRemoteConfigValue { *; }

# 确保 getLong 方法参数（字符串 key）不被混淆
-keepclassmembers class com.smartfile.model.** {
    *** finish_coldtime;
}

# 保留 SharedPreferences 相关操作
-keepclassmembers class * extends android.content.Context {
    public android.content.SharedPreferences getSharedPreferences(java.lang.String, int);
}

# 保留所有静态字段和方法
-keepclassmembers class com.smartfile.model.CleanTimeManager {
    static *** *;
}

# ==================== end ====================


# 保持整个类不被混淆
-keep class com.smartfile.model.FcmNotificationManager {
    *;
}

# 或者使用更具体的规则
-keep class com.smartfile.model.FcmNotificationManager { *; }

# 如果需要保持所有方法不被混淆
-keepclassmembers class com.smartfile.model.FcmNotificationManager {
    public <methods>;
    private <methods>;
    protected <methods>;
}


# 1. 保持类本身不被混淆
-keep class com.smartfile.model.FcmNotificationManager

# 2. 保持所有成员（字段、方法）不被混淆
-keepclassmembers class com.smartfile.model.FcmNotificationManager {
    *;
}

# 3. 保持所有方法签名
-keepclassmembernames class com.smartfile.model.FcmNotificationManager {
    <methods>;
}

# 4. 保持所有字段名
-keepclassmembernames class com.smartfile.model.FcmNotificationManager {
    <fields>;
}

# 5. 如果类中有内部类，也需要保护
-keep class com.smartfile.model.FcmNotificationManager$* {
    *;
}


# ========== CleanTimeManager 混淆保护 ==========
# 保护整个类不被混淆
-keep class com.smartfile.model.CleanTimeManager

# 保护所有 public、protected、private 方法和字段
-keepclassmembers class com.smartfile.model.CleanTimeManager {
    *;
}

# 保护所有静态方法和字段
-keepclassmembers class com.smartfile.model.CleanTimeManager {
    static *** *;
}

# 保护所有方法（包括构造方法）
-keepclasseswithmembers class com.smartfile.model.CleanTimeManager {
    public <methods>;
    protected <methods>;
    private <methods>;
    <fields>;
}

# 保护所有注解
-keepattributes *Annotation*
-keep @androidx.annotation.Keep class *