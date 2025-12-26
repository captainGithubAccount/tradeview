package com.smartfile.model.change;

import java.io.Serializable;

// 内层data对象
public class TimeData implements Serializable {
    private long currentTime;
    private long lastedHighNotifyTime;

    // 添加无参构造函数
    public TimeData() {
    }

    // getter 和 setter 方法
    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public long getLastedHighNotifyTime() {
        return lastedHighNotifyTime;
    }

    public void setLastedHighNotifyTime(long lastedHighNotifyTime) {
        this.lastedHighNotifyTime = lastedHighNotifyTime;
    }
}