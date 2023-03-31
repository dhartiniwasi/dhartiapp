package com.startapp.sdk.ads.video.tracking;

import com.startapp.C8870c1;

/* compiled from: Sta */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 1;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    /* compiled from: Sta */
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i, int i2, int i3, PauseOrigin pauseOrigin2, String str2) {
        super(str, i, i2, str2);
        this.pauseNum = i3;
        this.pauseOrigin = pauseOrigin2;
    }

    /* renamed from: e */
    public String mo30365e() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo30366f());
        StringBuilder a = C8870c1.m48422a("&po=");
        a.append(this.pauseOrigin.toString());
        sb.append(a.toString());
        StringBuilder a2 = C8870c1.m48422a("&pn=");
        a2.append(this.pauseNum);
        sb.append(a2.toString());
        sb.append(mo30397g());
        return mo30394b(sb.toString());
    }
}
