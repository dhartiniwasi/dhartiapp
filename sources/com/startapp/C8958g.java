package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.g */
/* compiled from: Sta */
public class C8958g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdDisplayListener f36792a;

    /* renamed from: b */
    public final /* synthetic */ C9381Ad f36793b;

    public C8958g(AdDisplayListener adDisplayListener, C9381Ad ad, Context context) {
        this.f36792a = adDisplayListener;
        this.f36793b = ad;
    }

    public void run() {
        try {
            this.f36792a.adHidden(this.f36793b);
        } catch (Throwable th) {
            C9605vb.m50460a((Object) this.f36792a, th);
        }
    }
}
