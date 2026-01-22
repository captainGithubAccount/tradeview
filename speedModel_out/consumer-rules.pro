##======================================= deepseek ======================
#
## 保持 SpeedSmartFileInitializer 类及其所有 public/protected 方法和字段不被混淆
#-keep class com.speed.model.newest.use.SpeedSmartFileInitializer {
#    *;
#}
#
#
## 保持 SpeedLocalInit 类及其所有成员（字段和方法）不被混淆
#-keep class com.speed.model.newest.use.SpeedLocalInit {
#    *;
#    # 明确指定保留所有字段和方法
#    <fields>;
#    <methods>;
#}
#
#
#
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
#-keep class android.util.Log {
#    public static *** d(...);
#    public static *** e(...);
#    public static *** i(...);
#    public static *** v(...);
#}
#
#
#-keepattributes *Annotation*
#
##======================================= gemini ======================