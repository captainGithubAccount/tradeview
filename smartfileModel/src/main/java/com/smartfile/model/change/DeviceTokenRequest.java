package com.smartfile.model.change;

import java.io.Serializable;

// DeviceTokenRequest.java
public class DeviceTokenRequest implements Serializable {
    private String token;
    
    // 构造方法
    public DeviceTokenRequest(String token) {
        this.token = token;
    }
    
    public DeviceTokenRequest() {
    }
    
    // getter 和 setter
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
}