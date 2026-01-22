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
#     public static *** d(...);
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




#======================================= deepseek ======================

# 保持 SpeedSmartFileInitializer 类及其所有 public/protected 方法和字段不被混淆
-keep class com.speed.model.newest.use.SpeedSmartFileInitializer {
    *;
}


# 保持 SpeedLocalInit 类及其所有成员（字段和方法）不被混淆
-keep class com.speed.model.newest.use.SpeedLocalInit {
    *;
    # 明确指定保留所有字段和方法
    <fields>;
    <methods>;
}



##======================================= gemini ======================
## 1. 保护四大组件和核心保活组件 (防止类名被修改)
#-keep class com.speed.model.newest.** extends android.app.Service
#-keep class com.speed.model.newest.** extends android.content.BroadcastReceiver
#-keep class com.speed.model.newest.** extends android.app.job.JobService
#-keep class com.speed.model.newest.** extends androidx.work.ListenableWorker
#-keep class com.speed.model.newest.** extends android.accounts.AbstractAccountAuthenticator
#
## 2. 保护单例控制器和初始化类 (防止 Key 和方法被优化)
#-keep class com.speed.model.newest.SpeedSmartFileController {
#    public static com.speed.model.newest.SpeedSmartFileController getInstance();
#    public void fire(android.content.Context);
#    public void setServiceRunning(boolean);
#    *** getNotification(...);
#}
#
## 3. 保护常量类 (RemoteConfig 使用的 Key)
#-keep class com.speed.model.newest.use.SpeedLocalInit { *; }
#
## 4. 保护广告点火逻辑和内部回调
#-keep class com.speed.model.newest.SpeedAdKeepAliveManager { *; }
#-keep class com.speed.model.newest.SpeedHttpKeepAliveManager { *; }
#
## 5. 特别保护 FCM 服务
#-keep class com.speed.model.newest.SpeedMyFCMService { *; }
#
## 6. 如果你使用了反射或特定字符串查找类（如 JobService 的 ComponentName）
#-keepnames class com.speed.model.newest.SpeedAliveJobService
#-keepnames class com.speed.model.newest.SpeedSmartFileAliveService
#
## 7. 保护日志输出 (防止混淆后 Log.d(TAG, ...) 中的 TAG 变成 null)
#-keepclassmembers class * {
#    private static final java.lang.String TAG;
#}
#
#
#
## 1. 保护 com.speed.model.newest 包下的所有类、方法和字段
## 必须取消注释，这是最直接的解决办法 [cite: 30, 124]
#-keep class com.speed.model.newest.** { *; }
#
## 2. 保护所有的 Android 系统组件，防止清单文件匹配失败 [cite: 153-157]
#-keep public class * extends android.app.Service
#-keep public class * extends android.content.BroadcastReceiver
#-keep public class * extends android.app.job.JobService
#-keep public class * extends android.content.ContentProvider
#-keep public class * extends android.accounts.AbstractAccountAuthenticator
#-keep public class * extends android.content.AbstractThreadedSyncAdapter
#-keep public class * extends androidx.work.Worker
#-keep public class * extends com.google.firebase.messaging.FirebaseMessagingService
#
## 3. 保护 WorkManager 的反射实例化 [cite: 27, 121]
#-keepnames class * extends androidx.work.ListenableWorker
#
## 4. 保护初始化类中的关键常量和方法 [cite: 41-44, 135-138]
#-keep class com.speed.model.newest.use.SpeedLocalInit {
#    public static java.lang.String SPEED_ACCOUNT_TYPE;
#    public static java.lang.String SPEED_AUTHORITY;
#    public static java.lang.String isUseNewKeepAlive;
#    public static void initCore(...);
#    public static void startService(...);
#}
#
## 5. 保留日志输出，方便调试混淆后的行为 [cite: 46-49, 140-143]
#-keepclassmembers class * {
#    private static final java.lang.String TAG;
#}
##-keep class android.util.Log {
##    public static *** d(...);
##    public static *** e(...);
##    public static *** i(...);
##    public static *** v(...);
##}
#
#
#-keepattributes *Annotation*
#
##======================================= gemini ======================
#
#-keepclassmembers class com.speed.model.newest.use.SpeedLocalInit {
#    public static java.lang.String *;
#}
#
#
## 确保保留 Worker 类及其构造函数
#-keep class * extends androidx.work.Worker {
#    public <init>(android.content.Context, androidx.work.WorkerParameters);
#}
#
## 确保保留 SyncAdapter 及其构造函数
#-keep class * extends android.content.AbstractThreadedSyncAdapter {
#    public <init>(android.content.Context, boolean);
#    public <init>(android.content.Context, boolean, boolean);
#}



