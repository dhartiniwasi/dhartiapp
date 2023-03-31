package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.yc */
/* compiled from: Sta */
public class C9665yc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f39452a;

    public C9665yc(VideoMode videoMode) {
        this.f39452a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f39452a;
        if (videoMode.f38446K != null) {
            videoMode.f38451P = !videoMode.f38451P;
            videoMode.mo30307K();
            VideoMode videoMode2 = this.f39452a;
            videoMode2.mo30319a(videoMode2.f38451P);
        }
    }
}
