package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* renamed from: com.startapp.rc */
/* compiled from: Sta */
public class C9266rc extends C9148n5 {

    /* renamed from: h */
    public Runnable f38160h = null;

    /* renamed from: i */
    public Runnable f38161i = null;

    /* renamed from: j */
    public Runnable f38162j = null;

    public C9266rc(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, TrackingParams trackingParams, boolean z) {
        super(context, runnable, runnable2, trackingParams);
        this.f38160h = runnable3;
        this.f38161i = runnable4;
        this.f38162j = runnable5;
        this.f37339b = z;
    }

    @JavascriptInterface
    public void replayVideo() {
        if (this.f38160h != null) {
            new Handler(Looper.getMainLooper()).post(this.f38160h);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        if (this.f38161i != null) {
            new Handler(Looper.getMainLooper()).post(this.f38161i);
        }
    }

    @JavascriptInterface
    public void toggleSound() {
        if (this.f38162j != null) {
            new Handler(Looper.getMainLooper()).post(this.f38162j);
        }
    }
}
