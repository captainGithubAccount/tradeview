package com.recover.redate.opdj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.content.recover.IProcessServiceRecover;

import com.recover.redate.RecoverOrgManager;

public class Recover1Service extends Service {
    public static long lastTime = 0L;
    private static String TAG = "xxx";
    private LocalBinder mLocalBinder;
    private LocalServiceConnection mLocalServiceConn;
    public static Boolean isLiving = false;
    public static Boolean isReTryBinding = false;
    private static long delayTime = 250L;
    public static boolean isStartService = false;
    private IBinder subBinder = null;
    private Runnable run = new Runnable() {
        @Override
        public void run() {
            startSubService(nextNum, false);
        }
    };
    int nextNum = -1;

    public Recover1Service() {
    }

    public static void tryStartLaunchMainService() {
        if (isLiving) {
            if (RecoverOrgManager.isDebug) {
                Log.e("xxx", "****tryStartLaunchMainService, LocalService isLiving");
            }
        } else {
            if (!isStartService && System.currentTimeMillis() - lastTime > 10000L) {
                if (RecoverOrgManager.isDebug) {
                    Log.e("xxx", "****tryStartLaunchMainService****5");
                }
                lastTime = System.currentTimeMillis();
                startService(RecoverOrgManager.mContext);
            }
        }
    }

    private static void startService(Context context) {
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "LocalService startService5");
        }
        if (!doStartMainService(context)) {
            doBindMainService(context);
        }
    }

    private void DuDgwHHB(int kwlolhzlir0) {
    }

    public void onCreate() {
        isLiving = true;
        super.onCreate();
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onCreate5");
        }
        this.mLocalBinder = new LocalBinder(this);
        if (this.mLocalServiceConn == null) {
            this.mLocalServiceConn = new LocalServiceConnection(this);
        }
        isReTryBinding = true;
        this.startSubService(1, false);
    }


    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && !isStartService) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onStartCommand isStartService5=" + isStartService);
        }
        return Service.START_STICKY;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onBind5");
        }

        return this.mLocalBinder;
    }

    public void onDestroy() {
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onDestroy5");
        }
        super.onDestroy();
        isStartService = false;
        isLiving = false;
        isReTryBinding = false;
    }

    public boolean onUnbind(Intent intent) {
        if (RecoverOrgManager.isDebug) {
            Log.e(TAG, "主进程 LocalService onUnbind5");
        }
        return super.onUnbind(intent);
    }

    private boolean isSubBinderAlive() {
        return this.subBinder != null && this.subBinder.isBinderAlive();
    }

    public void onTaskRemoved(Intent rootIntent) {
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "主进程 LocalService onTaskRemoved5");
        }
        isStartService = false;
        isLiving = false;
        isReTryBinding = false;
        this.startSubService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    public void startSubService(int retryNum, Boolean onTaskRemoved) {
        if (this.isSubBinderAlive() && !onTaskRemoved) {
            isReTryBinding = false;
        } else {
            if (RecoverOrgManager.isDebug) {
                Log.e(TAG, "主进程 LocalService ------startSubService5-----");
            }

            this.doStartSubService();
            this.bindSubService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                RecoverOrgManager.INSTANCE.getHandler().postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }
    }

    private void doStartSubService() {
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "主进程 doStartSubService5");
        }
        try {
            Intent intent = new Intent(this, Recover2Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var31) {
            Exception e = var31;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "LocalService startSubService start error5=" + e.getMessage());
            }
        }
    }

    private void bindSubService() {
        try {
            this.bindService(new Intent(this, Recover2Service.class), this.mLocalServiceConn, 1);
        } catch (Exception var9) {
            Exception e2 = var9;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startSubService bind error5=" + e2.getMessage());
            }
        }

    }

    private static boolean doStartMainService(Context context) {
        try {
            Intent intent = new Intent(context, Recover1Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            return true;
        } catch (Exception var44) {
            Exception e = var44;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService startMainService start error5=" + e.getMessage());
            }
            return false;
        }
    }


    private static void doBindMainService(Context context) {
        if (RecoverOrgManager.isDebug) {
            Log.i(TAG, "bindMainService5");
        }
        try {
            Intent intent = new Intent(context, Recover1Service.class);
            intent.putExtra("isStartService", false);
            intent.setPackage(context.getPackageName());
            context.bindService(intent, new ServiceConnection() {
                @Override
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

                }

                @Override
                public void onServiceDisconnected(ComponentName componentName) {

                }
            }, 1);
        } catch (Exception var36) {
            Exception e2 = var36;
            if (RecoverOrgManager.isDebug) {
                Log.i(TAG, "主进程 LocalService bindLocalService5" + e2.getMessage());
            }
        }
    }

    class LocalBinder extends IProcessServiceRecover.Stub {
        LocalBinder(Recover1Service this$0) {

        }

        public String getServiceRecover() throws RemoteException {
            return "LocalService";
        }

        public boolean isStartedRecover() throws RemoteException {
            return Recover1Service.isStartService;
        }
    }

    class LocalServiceConnection implements ServiceConnection {
        LocalServiceConnection(Recover1Service this$0) {

        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            if (RecoverOrgManager.isDebug) {
                Log.i(Recover1Service.TAG, "主进程 LocalService 连接子进程成功5");
            }
            try {
                IProcessServiceRecover process = IProcessServiceRecover.Stub.asInterface(service);
                process.getServiceRecover();
            } catch (Exception var25) {
                Exception e = var25;
                if (RecoverOrgManager.isDebug) {
                    Log.e(Recover1Service.TAG, "主进程 LocalService 连接子进程 fail 5e=" + e.getMessage());
                }
            }
        }

        public void onServiceDisconnected(ComponentName name) {
            if (RecoverOrgManager.isDebug) {
                Log.e(Recover1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onServiceDisconnected5");
            }
            subBinder = null;
            Recover1Service.isReTryBinding = true;
            startSubService(2, false);
        }

        public void onBindingDied(ComponentName name) {
            if (RecoverOrgManager.isDebug) {
                Log.e(Recover1Service.TAG, "主进程 LocalService 子进程服务挂掉了 onBindingDied5");
            }
            this.onServiceDisconnected(name);
        }
    }

}

