package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* renamed from: com.startapp.sc */
/* compiled from: Sta */
public class C9284sc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoListener f38199a;

    public C9284sc(VideoListener videoListener, Context context) {
        this.f38199a = videoListener;
    }

    public void run() {
        try {
            this.f38199a.onVideoCompleted();
        } catch (Throwable th) {
            C9605vb.m50460a((Object) this.f38199a, th);
        }
    }
}
