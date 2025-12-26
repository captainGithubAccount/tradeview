package com.smartfile.model.change;

import java.io.Serializable;

// ServerTimeResponse.java
public class ServerTimeResponse implements Serializable {
    private int code;
    private String msg;
    private TimeData data;



    // getter 和 setter 方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public TimeData getData() {
        return data;
    }

    public void setData(TimeData data) {
        this.data = data;
    }
}