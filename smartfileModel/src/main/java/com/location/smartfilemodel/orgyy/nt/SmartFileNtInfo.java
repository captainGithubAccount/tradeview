package com.location.smartfilemodel.orgyy.nt;

import android.app.PendingIntent;
import android.widget.RemoteViews;

import java.io.Serializable;

public class SmartFileNtInfo implements Serializable {
    private String typedName = "";
    private int targetId = 0;
    private int notId = 0;
    private RemoteViews remoteBig;
    private RemoteViews remoteSmall;
    private RemoteViews remoteMid;
    private PendingIntent pendingIntent;

    public SmartFileNtInfo() {
    }


    public String getTypedName() {
        return this.typedName;
    }

    public void setTypedName(String typedName) {
        this.typedName = typedName;
    }


    public int getTargetId() {
        return this.targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getNotId() {
        return this.notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
    }

    public RemoteViews getRemoteBig() {
        return this.remoteBig;
    }


    public void setRemoteBig(RemoteViews remoteBig) {
        this.remoteBig = remoteBig;
    }


    public RemoteViews getRemoteSmall() {
        return this.remoteSmall;
    }

    public void setRemoteSmall(RemoteViews remoteSmall) {
        this.remoteSmall = remoteSmall;
    }

    public RemoteViews getRemoteMid() {
        return this.remoteMid;
    }

    public void setRemoteMid(RemoteViews remoteMid) {
        this.remoteMid = remoteMid;
    }

    public PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }
}
