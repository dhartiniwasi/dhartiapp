package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.i */
/* compiled from: Sta */
public class C9018i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdDisplayListener f36940a;

    /* renamed from: b */
    public final /* synthetic */ C9381Ad f36941b;

    public C9018i(AdDisplayListener adDisplayListener, C9381Ad ad, Context context) {
        this.f36940a = adDisplayListener;
        this.f36941b = ad;
    }

    public void run() {
        try {
            this.f36940a.adClicked(this.f36941b);
        } catch (Throwable th) {
            C9605vb.m50460a((Object) this.f36940a, th);
        }
    }
}
