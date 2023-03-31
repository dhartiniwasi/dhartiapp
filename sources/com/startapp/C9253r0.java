package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* renamed from: com.startapp.r0 */
/* compiled from: Sta */
public class C9253r0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BannerListener f38134a;

    /* renamed from: b */
    public final /* synthetic */ View f38135b;

    public C9253r0(BannerListener bannerListener, View view, Context context) {
        this.f38134a = bannerListener;
        this.f38135b = view;
    }

    public void run() {
        try {
            this.f38134a.onImpression(this.f38135b);
        } catch (Throwable th) {
            C9605vb.m50460a((Object) this.f38134a, th);
        }
    }
}
