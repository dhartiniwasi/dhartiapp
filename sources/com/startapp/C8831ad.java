package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.ad */
/* compiled from: Sta */
public class C8831ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f36431a;

    public C8831ad(VideoMode videoMode) {
        this.f36431a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f36431a;
        if (videoMode.f38446K != null) {
            videoMode.f36829E++;
            videoMode.f38447L.setVisibility(0);
            VideoMode videoMode2 = this.f36431a;
            videoMode2.f38455T = false;
            videoMode2.f38452Q = 0;
            C9605vb.m50458a(videoMode2.f36834v, true, "videoApi.setVideoCurrentPosition", 0);
            C9605vb.m50458a(videoMode2.f36834v, true, "videoApi.setSkipTimer", 0);
            this.f36431a.mo30308L();
        }
    }
}
