package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.C9673z2;
import com.startapp.sdk.ads.video.C9366j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* renamed from: com.startapp.sdk.ads.video.f */
/* compiled from: Sta */
public class C9362f implements C9366j.C9368b {

    /* renamed from: a */
    public final /* synthetic */ C9366j.C9368b f38525a;

    /* renamed from: b */
    public final /* synthetic */ CachedVideoAd f38526b;

    /* renamed from: c */
    public final /* synthetic */ Context f38527c;

    /* renamed from: d */
    public final /* synthetic */ C9364h f38528d;

    public C9362f(C9364h hVar, C9366j.C9368b bVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f38528d = hVar;
        this.f38525a = bVar;
        this.f38526b = cachedVideoAd;
        this.f38527c = context;
    }

    /* renamed from: a */
    public void mo30345a(String str) {
        C9366j.C9368b bVar = this.f38525a;
        if (bVar != null) {
            bVar.mo30345a(str);
        }
        if (str != null) {
            this.f38526b.mo30681a(System.currentTimeMillis());
            this.f38526b.mo30682a(str);
            C9364h hVar = this.f38528d;
            Context context = this.f38527c;
            CachedVideoAd cachedVideoAd = this.f38526b;
            hVar.f38530a.remove(cachedVideoAd);
            hVar.mo30350a(AdsCommonMetaData.f38625h.mo30445G().mo30573b() - 1);
            hVar.f38530a.add(cachedVideoAd);
            C9673z2.m50596b(context, "CachedAds", hVar.f38530a);
        }
    }
}
