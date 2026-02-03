package com.smartfile.model.old.change;

import androidx.annotation.Keep;

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

@Keep
public class SmartfileConfig {
    public static void configLaunchClickStr(String str){
        SmartfileChangeUtils.INSTANCE.setNoti_click_str(str);
    }

    public static void configLaunchPath(String path){
        SmartfileChangeUtils.INSTANCE.setLaunchActivityPath(path);
    }

    public static void configHeartUrl(String url){
        SmartfileChangeUtils.INSTANCE.setHttpHeartUrl(url);
    }

    public static void configFcmUrl(String url){
        SmartfileChangeUtils.INSTANCE.setFCM_URL(url);
    }

    public static void configFcmInterfacePath(String path){
        SmartfileChangeUtils.INSTANCE.setFCM_INTERFACE_PATH(path);
    }
}
