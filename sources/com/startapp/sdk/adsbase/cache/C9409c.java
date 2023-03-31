package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C9410d;

/* renamed from: com.startapp.sdk.adsbase.cache.c */
/* compiled from: Sta */
public class C9409c implements C9410d.C9414d {

    /* renamed from: a */
    public final /* synthetic */ C9410d.C9415e f38787a;

    public C9409c(C9410d dVar, C9410d.C9415e eVar) {
        this.f38787a = eVar;
    }

    /* renamed from: a */
    public void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z) {
        AdEventListener adEventListener = this.f38787a.f38805d;
        if (adEventListener == null) {
            return;
        }
        if (!z || ad == null) {
            adEventListener.onFailedToReceiveAd(ad);
        } else {
            adEventListener.onReceiveAd(ad);
        }
    }
}
