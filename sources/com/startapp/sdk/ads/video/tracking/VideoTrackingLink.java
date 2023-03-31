package com.startapp.sdk.ads.video.tracking;

import com.startapp.C8870c1;
import com.startapp.C9226pb;
import java.io.Serializable;

/* compiled from: Sta */
public abstract class VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean appendReplayParameter;
    private String replayParameter;
    @C9226pb(type = TrackingSource.class)
    private TrackingSource trackingSource;
    private String trackingUrl;

    /* compiled from: Sta */
    public enum TrackingSource {
        STARTAPP,
        EXTERNAL
    }

    /* renamed from: a */
    public void mo30388a(boolean z) {
        this.appendReplayParameter = z;
    }

    /* renamed from: b */
    public void mo30390b(String str) {
        this.trackingUrl = str;
    }

    /* renamed from: c */
    public String mo30391c() {
        return this.trackingUrl;
    }

    /* renamed from: d */
    public boolean mo30392d() {
        return this.appendReplayParameter;
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("trackingSource=");
        a.append(this.trackingSource);
        a.append(", trackingUrl=");
        a.append(this.trackingUrl);
        a.append(", replayParameter=");
        a.append(this.replayParameter);
        a.append(", appendReplayParameter=");
        a.append(this.appendReplayParameter);
        return a.toString();
    }

    /* renamed from: a */
    public String mo30386a() {
        return this.replayParameter;
    }

    /* renamed from: b */
    public TrackingSource mo30389b() {
        return this.trackingSource;
    }

    /* renamed from: a */
    public void mo30387a(String str) {
        this.replayParameter = str;
    }
}
