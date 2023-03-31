package com.startapp.sdk.adsbase.cache;

import com.startapp.C9055k;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C9419h;

/* renamed from: com.startapp.sdk.adsbase.cache.f */
/* compiled from: Sta */
public class C9417f implements AdEventListener {

    /* renamed from: a */
    public final /* synthetic */ C9419h.C9420a f38807a;

    /* renamed from: b */
    public final /* synthetic */ boolean f38808b;

    /* renamed from: c */
    public final /* synthetic */ C9419h f38809c;

    public C9417f(C9419h hVar, C9419h.C9420a aVar, boolean z) {
        this.f38809c = hVar;
        this.f38807a = aVar;
        this.f38808b = z;
    }

    public void onFailedToReceiveAd(C9381Ad ad) {
        C9419h hVar = this.f38809c;
        hVar.f38815e = null;
        hVar.mo30710a(this.f38808b);
    }

    public void onReceiveAd(C9381Ad ad) {
        C9055k.m48717b(this.f38809c.f38812b, this.f38807a, ad, true);
    }
}
