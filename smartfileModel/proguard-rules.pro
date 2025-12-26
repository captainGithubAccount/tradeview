#############################################
#
# 基础混淆配置
#
#############################################


####################基本混淆指令的设置####################

# 代码混淆压缩比，在0~7之间，默认为5，一般不做修改
-optimizationpasses 5

# 混合时不使用大小写混合，混合后的类名为小写
-dontusemixedcaseclassnames

# 优化时允许访问并修改有修饰符的类和类的成员
-allowaccessmodification

# 指定不忽略非公共库的类
-dontskipnonpubliclibraryclasses

# 指定不忽略非公共库的类成员
-dontskipnonpubliclibraryclassmembers

# 记录日志，使我们的项目混淆后产生映射文件（类名->混淆后类名）
-verbose

# 忽略警告，避免打包时某些警告出现，没有这个的话，构建报错
-ignorewarnings

# 不做预校验，preverify是proguard的四个步骤之一，Android不需要preverify，去掉这一步能够加快混淆速度。
-dontpreverify

# 不混淆Annotation(保留注解)
-keepattributes *Annotation*,InnerClasses

# 避免混淆泛型
-keepattributes Signature

# 抛出异常时保留代码行号
-keepattributes SourceFile,LineNumberTable

# 指定混淆是采用的算法，后面的参数是一个过滤器
# 这个过滤器是谷歌推荐的算法，一般不做更改
-optimizations !code/simplification/cast,!field/*,!class/merging/*


####################Android开发中需要保留的公共部分####################

# 保留support下的所有类及其内部类
-keep class android.support.** {*;}

# 避免 ViewBinding 类被混淆导致反射初始化失败
-keep public interface androidx.viewbinding.ViewBinding
-keepclassmembers class * implements androidx.viewbinding.ViewBinding{
    *;
}

# 保留继承的support类
-keep public class * extends android.support.v4.**
-keep public class * extends android.support.v7.**
-keep public class * extends android.support.annotation.**

# 保留R下面的资源
-keep class **.R$* {*;}

# 保留本地native方法不被混淆
-keepclasseswithmembernames class * {
    native <methods>;
}

# 保留Activity中参数类型为View的所有方法
-keepclassmembers class * extends android.app.Activity{
    public void *(android.view.View);
}

# 保留枚举类不被混淆
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# 保留Parcelable序列化类不被混淆
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# 保留Serializable序列化的类不被混淆
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    !private <fields>;
    !private <methods>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# 保留我们自定义控件（继承自View）不被混淆
-keep public class * extends android.view.View{
    *** get*();
    void set*(***);
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# 对于带有回调函数的onXXEvent、**On*Listener的，不能被混淆
-keepclassmembers class * {
    void *(**On*Event);
    void *(**On*Listener);
}

 # 去除log
 -assumenosideeffects class android.util.Log {
     public static *** d(...);
     public static *** v(...);
     public static *** i(...);
#     public static *** e(...);
 }

# 弹窗
-dontwarn com.lxj.xpopup.widget.**
-keep class com.lxj.xpopup.widget.**{*;}

# 状态栏
 -keep class com.gyf.immersionbar.* {*;}
 -dontwarn com.gyf.immersionbar.**


-keep class com.luck.picture.lib.** { *; }

-dontwarn com.yalantis.ucrop**
-keep class com.yalantis.ucrop** { *; }
-keep interface com.yalantis.ucrop** { *; }


-obfuscationdictionary proguard-keys.txt
-classobfuscationdictionary proguard-keys.txt
-packageobfuscationdictionary proguard-keys.txt


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


-keep class com.smartfile.model.FcmNotificationManager
# 保留 CleanTimeManager 的所有成员（字段、方法、构造函数）
-keepclassmembers class com.smartfile.model.FcmNotificationManager {
    *;
}


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


# 在 proguard-rules.pro 中添加
-printmapping build/outputs/mapping/release/mapping.txt
-printusage build/outputs/mapping/release/usage.txt
-printseeds build/outputs/mapping/release/seeds.txt


#========================

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
