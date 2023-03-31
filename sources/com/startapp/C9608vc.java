package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.vc */
/* compiled from: Sta */
public class C9608vc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f39319a;

    /* renamed from: b */
    public final /* synthetic */ VideoMode f39320b;

    public C9608vc(VideoMode videoMode, int i) {
        this.f39320b = videoMode;
        this.f39319a = i;
    }

    public void run() {
        try {
            this.f39320b.mo30326f(this.f39319a);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
