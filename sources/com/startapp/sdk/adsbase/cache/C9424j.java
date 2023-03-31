package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C9023i4;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import java.util.List;

/* renamed from: com.startapp.sdk.adsbase.cache.j */
/* compiled from: Sta */
public class C9424j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f38833a;

    /* renamed from: b */
    public final /* synthetic */ DiskAdCacheManager.C9405b f38834b;

    /* renamed from: com.startapp.sdk.adsbase.cache.j$a */
    /* compiled from: Sta */
    public class C9425a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f38835a;

        public C9425a(List list) {
            this.f38835a = list;
        }

        public void run() {
            DiskAdCacheManager.C9405b bVar = C9424j.this.f38834b;
            List<DiskAdCacheManager.DiskCacheKey> list = this.f38835a;
            C9407a aVar = (C9407a) bVar;
            aVar.getClass();
            if (list != null) {
                try {
                    for (DiskAdCacheManager.DiskCacheKey diskCacheKey : list) {
                        if (aVar.f38785b.mo30701a(diskCacheKey.placement)) {
                            aVar.f38785b.mo30698a(aVar.f38784a, (StartAppAd) null, diskCacheKey.placement, diskCacheKey.adPreferences, (C9410d.C9414d) null, true, diskCacheKey.mo30685a());
                        }
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
            C9410d dVar = aVar.f38785b;
            Context context = aVar.f38784a;
            dVar.f38792d = false;
            for (C9410d.C9415e eVar : dVar.f38793e) {
                if (dVar.mo30701a(eVar.f38803b)) {
                    dVar.mo30698a(context, eVar.f38802a, eVar.f38803b, eVar.f38804c, new C9409c(dVar, eVar), false, 0);
                }
            }
            dVar.f38793e.clear();
        }
    }

    public C9424j(Context context, DiskAdCacheManager.C9405b bVar) {
        this.f38833a = context;
        this.f38834b = bVar;
    }

    public void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new C9425a(C9673z2.m50598d(this.f38833a, DiskAdCacheManager.m49883b())));
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
