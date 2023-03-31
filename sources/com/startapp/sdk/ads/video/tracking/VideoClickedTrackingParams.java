package com.startapp.sdk.ads.video.tracking;

import com.startapp.C8870c1;

/* compiled from: Sta */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i, int i2, boolean z, String str2) {
        super(str, i, i2, str2);
        this.isVideoFinished = z;
    }

    /* renamed from: e */
    public String mo30365e() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo30366f());
        StringBuilder a = C8870c1.m48422a("&co=");
        a.append(this.isVideoFinished ? "POSTROLL" : "VIDEO");
        sb.append(a.toString());
        sb.append(mo30397g());
        return mo30394b(sb.toString());
    }
}
