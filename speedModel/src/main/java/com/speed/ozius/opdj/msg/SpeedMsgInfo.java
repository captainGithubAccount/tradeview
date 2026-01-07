package com.speed.ozius.opdj.msg;

import androidx.annotation.Keep;

@Keep
public class SpeedMsgInfo {
    public String token = "";
    public String deviceId = "";
    public String platform = "";
    public String appVersion = "";
    public String sdkInt = "";
    public String packageName = "";
    public String debug = "";
    public String appName = "";
    public int mcc = -1;
    public boolean isVpn = false;
    public String channel = "";
    public String netType = "";
    public String model = "";
    public String brand = "";
    public String country = "";
    public String apiLevel = "";

    public SpeedMsgInfo() {
    }
}

