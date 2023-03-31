package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.h */
/* compiled from: Sta */
public class C8991h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdDisplayListener f36884a;

    /* renamed from: b */
    public final /* synthetic */ C9381Ad f36885b;

    public C8991h(AdDisplayListener adDisplayListener, C9381Ad ad, Context context) {
        this.f36884a = adDisplayListener;
        this.f36885b = ad;
    }

    public void run() {
        try {
            this.f36884a.adDisplayed(this.f36885b);
        } catch (Throwable th) {
            C9605vb.m50460a((Object) this.f36884a, th);
        }
    }
}
