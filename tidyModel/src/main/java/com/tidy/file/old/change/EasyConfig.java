package com.tidy.file.old.change;

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
public class EasyConfig {
    public static void configLaunchClickStr(String str){
        EasyChangeUtils.INSTANCE.setNoti_click_str(str);
    }

    public static void configLaunchPath(String path){
        EasyChangeUtils.INSTANCE.setLaunchActivityPath(path);
    }

    public static void configHeartUrl(String url){
        EasyChangeUtils.INSTANCE.setHttpHeartUrl(url);
    }

    public static void configFcmUrl(String url){
        EasyChangeUtils.INSTANCE.setFCM_URL(url);
    }

    public static void configFcmInterfacePath(String path){
        EasyChangeUtils.INSTANCE.setFCM_INTERFACE_PATH(path);
    }
}
