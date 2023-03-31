package com.startapp.sdk.adsbase.commontracking;

/* compiled from: Sta */
public class CloseTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private final long duration;

    public CloseTrackingParams(long j, String str) {
        super(str);
        this.duration = j;
    }

    /* renamed from: e */
    public String mo30365e() {
        return super.mo30365e() + "&displayDuration=" + Math.max(0, this.duration);
    }
}
