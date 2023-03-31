package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.startapp.c */
/* compiled from: Sta */
public class C8868c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f36559a;

    /* renamed from: b */
    public final /* synthetic */ C9410d f36560b;

    public C8868c(C9410d dVar, Context context) {
        this.f36560b = dVar;
        this.f36559a = context;
    }

    public void run() {
        try {
            C9673z2.m50590a(this.f36559a, DiskAdCacheManager.m49883b());
            C9673z2.m50590a(this.f36559a, DiskAdCacheManager.m49880a());
            CacheKey cacheKey = null;
            for (Map.Entry next : this.f36560b.f38789a.entrySet()) {
                CacheKey cacheKey2 = (CacheKey) next.getKey();
                if (cacheKey2.mo30672a() == AdPreferences.Placement.INAPP_SPLASH) {
                    cacheKey = cacheKey2;
                } else {
                    C9419h hVar = (C9419h) next.getValue();
                    Context context = this.f36559a;
                    AdPreferences.Placement a = cacheKey2.mo30672a();
                    AdPreferences adPreferences = hVar.f38814d;
                    String b = this.f36560b.mo30702b(cacheKey2);
                    int i = hVar.f38823m;
                    DiskAdCacheManager.DiskCacheKey diskCacheKey = new DiskAdCacheManager.DiskCacheKey(a, adPreferences);
                    diskCacheKey.mo30686a(i);
                    String b2 = DiskAdCacheManager.m49883b();
                    if (b != null) {
                        C9673z2.m50593a(C9673z2.m50595b(context, b2), b, (Serializable) diskCacheKey);
                    }
                    Context context2 = this.f36559a;
                    String b3 = this.f36560b.mo30702b(cacheKey2);
                    DiskAdCacheManager.DiskCachedAd diskCachedAd = new DiskAdCacheManager.DiskCachedAd(hVar.f38815e);
                    String a2 = DiskAdCacheManager.m49880a();
                    if (b3 != null) {
                        try {
                            C9673z2.m50593a(C9673z2.m50595b(context2, a2), b3, (Serializable) diskCachedAd);
                        } catch (Throwable th) {
                            if (C9673z2.m50594a(4)) {
                                C9023i4.m48681a(th);
                            }
                        }
                    }
                }
            }
            if (cacheKey != null) {
                this.f36560b.f38789a.remove(cacheKey);
            }
        } catch (Throwable th2) {
            C9023i4.m48681a(th2);
        }
    }
}
