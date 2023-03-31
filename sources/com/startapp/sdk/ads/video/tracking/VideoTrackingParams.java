package com.startapp.sdk.ads.video.tracking;

import com.startapp.C8870c1;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
public class VideoTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private int completed;
    public boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(String str, int i, int i2, String str2) {
        super(str);
        mo30720a(i2);
        this.completed = i;
        this.videoPlayingMode = str2;
    }

    /* renamed from: a */
    public VideoTrackingParams mo30393a(boolean z) {
        this.shouldAppendOffset = z;
        return this;
    }

    /* renamed from: b */
    public String mo30394b(String str) {
        if (!this.internalParamsIndicator) {
            return mo30396c();
        }
        return super.mo30365e() + str;
    }

    /* renamed from: c */
    public VideoTrackingParams mo30395c(String str) {
        this.replayParameter = str;
        return this;
    }

    /* renamed from: e */
    public String mo30365e() {
        return mo30394b(mo30366f() + mo30397g());
    }

    /* renamed from: f */
    public String mo30366f() {
        StringBuilder a = C8870c1.m48422a("&cp=");
        a.append(this.completed);
        return a.toString();
    }

    /* renamed from: g */
    public String mo30397g() {
        StringBuilder a = C8870c1.m48422a("&vpm=");
        a.append(this.videoPlayingMode);
        return a.toString();
    }

    /* renamed from: c */
    public String mo30396c() {
        if (!this.shouldAppendOffset) {
            return "";
        }
        String str = this.replayParameter;
        if (str != null) {
            return str.replace("%startapp_replay_count%", new Integer(mo30723b()).toString());
        }
        return super.mo30396c();
    }
}
