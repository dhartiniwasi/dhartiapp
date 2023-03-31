package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.xc */
/* compiled from: Sta */
public class C9645xc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f39410a;

    public C9645xc(VideoMode videoMode) {
        this.f39410a = videoMode;
    }

    public void run() {
        try {
            this.f39410a.mo29409u();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
