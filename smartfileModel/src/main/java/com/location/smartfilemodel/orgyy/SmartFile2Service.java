package com.location.smartfilemodel.orgyy;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.content.smartfile.IProcessServiceSmartFile;

import com.location.smartfilemodel.SmartFileOrgManager;

public class SmartFile2Service extends Service {
    String TAG = "xxx";
    private ServiceBinder mServiceBinder;
    private RemoteServiceConnection mRemoteServiceConn;
    public static Boolean isLiving = false;
    public static Boolean isReTryBinding = false;
    private static long delayTime = 250L;
    private static Handler handler = new Handler(Looper.getMainLooper());
    public static boolean isStartService = false;
    private Runnable run = new Runnable() {
        @Override
        public void run() {
            if (SmartFileOrgManager.isDebug) {
                Log.i(TAG, "delay 监视 Runnable nextNum4=" + nextNum);
            }
            startMainService(nextNum, false);
        }
    };
    int nextNum = -1;
    private static IBinder mainBinder = null;

    public SmartFile2Service() {
    }


    public void onCreate() {
        isLiving = true;
        super.onCreate();
        if (SmartFileOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onCreate`");
        }

        this.mServiceBinder = new ServiceBinder(this);
        if (this.mRemoteServiceConn == null) {
            this.mRemoteServiceConn = new RemoteServiceConnection(this);
        }
        isReTryBinding = true;
        this.startMainService(1, false);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
            isStartService = intent.getBooleanExtra("isStartService", false);
        }
        if (SmartFileOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onStartCommand isStartService=2" + isStartService);
        }
        return Service.START_STICKY;
    }

    public boolean onUnbind(Intent intent) {
        if (SmartFileOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onUnbind3");
        }

        return super.onUnbind(intent);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        if (SmartFileOrgManager.isDebug) {
            Log.e(this.TAG, "子进程 RemoteService onBind4");
        }
        return this.mServiceBinder;
    }

    public void startMainService(int retryNum, Boolean onTaskRemoved) {
        if (!this.isMainBinderAlive() || onTaskRemoved) {
            if (SmartFileOrgManager.isDebug) {
                Log.e(this.TAG, "子进程 RemoteService------startMainService4-----");
            }
            this.doStartMainService();
            this.doBindMainService();
            this.nextNum = retryNum - 1;
            if (this.nextNum > 0) {
                if (SmartFileOrgManager.isDebug) {
                    Log.i(this.TAG, "RemoteService postDelayed nextNu4m=" + this.nextNum);
                }
                handler.postDelayed(this.run, 100L);
            } else {
                isReTryBinding = false;
            }
        }

    }

    private void doStartMainService() {
        try {
            Intent intent = new Intent(this, SmartFile1Service.class);
            intent.putExtra("isStartService", true);
            intent.setPackage(this.getPackageName());
            this.startService(intent);
        } catch (Exception var16) {
            Exception e = var16;
            if (SmartFileOrgManager.isDebug) {
                Log.i(this.TAG, "RemoteService startMainService start error4=" + e.getMessage());
            }
        }

    }

    private void doBindMainService() {
        if (SmartFileOrgManager.isDebug) {
            Log.i(this.TAG, "RemoteService bindMainService");
        }
        try {
            this.bindService(new Intent(this, SmartFile1Service.class), this.mRemoteServiceConn, 1);
        } catch (Exception var34) {
            Exception e2 = var34;
            if (SmartFileOrgManager.isDebug) {
                Log.i(this.TAG, "RemoteService bindMainService bind error1=" + e2.getMessage());
            }
        }

    }


    public void onTaskRemoved(Intent rootIntent) {
        mainBinder = null;
        if (SmartFileOrgManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onTaskRemoved1");
        }
        isReTryBinding = true;
        this.startMainService(3, true);
        super.onTaskRemoved(rootIntent);
    }

    public void onDestroy() {
        if (SmartFileOrgManager.isDebug) {
            Log.i(this.TAG, "子进程 RemoteService onDestroy5");
        }
        super.onDestroy();
        isLiving = false;
    }

    private boolean isMainBinderAlive() {
        return mainBinder != null && mainBinder.isBinderAlive();
    }

    class ServiceBinder extends IProcessServiceSmartFile.Stub {
        ServiceBinder(SmartFile2Service this$0) {

        }

        public String getServiceSmartFile() throws RemoteException {
            return "RemoteService";
        }

        public boolean isStartedSmartFile() throws RemoteException {
            return false;
        }
    }


    class RemoteServiceConnection implements ServiceConnection {
        RemoteServiceConnection(SmartFile2Service this$0) {
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            SmartFile2Service.mainBinder = service;
            try {
                IProcessServiceSmartFile process = IProcessServiceSmartFile.Stub.asInterface(service);
                process.getServiceSmartFile();
                if (SmartFileOrgManager.isDebug) {
                    Log.i(TAG, "RemoteService 连接主进程 成功6");
                }
            } catch (Exception var33) {
                Exception e = var33;
                if (SmartFileOrgManager.isDebug) {
                    Log.e(TAG, "RemoteService 连接主进程 fail e6=" + e.getMessage());
                }
            }

        }

        public void onServiceDisconnected(ComponentName name) {
            if (SmartFileOrgManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onServiceDisconnected5");
            }
            SmartFile2Service.mainBinder = null;
            SmartFile2Service.isReTryBinding = true;
            startMainService(2, false);
        }

        public void onBindingDied(ComponentName name) {
            if (SmartFileOrgManager.isDebug) {
                Log.e(TAG, "RemoteService 主服务挂掉了 onBindingDied4");
            }
            this.onServiceDisconnected(name);
        }
    }

}

