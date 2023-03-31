package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.wc */
/* compiled from: Sta */
public class C9625wc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f39337a;

    /* renamed from: b */
    public final /* synthetic */ VideoMode f39338b;

    public C9625wc(VideoMode videoMode, int i) {
        this.f39338b = videoMode;
        this.f39337a = i;
    }

    public void run() {
        try {
            this.f39338b.mo30325e(this.f39337a);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
