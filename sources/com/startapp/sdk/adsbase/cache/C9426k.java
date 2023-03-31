package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C9023i4;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;

/* renamed from: com.startapp.sdk.adsbase.cache.k */
/* compiled from: Sta */
public class C9426k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f38837a;

    /* renamed from: b */
    public final /* synthetic */ String f38838b;

    /* renamed from: c */
    public final /* synthetic */ AdEventListener f38839c;

    /* renamed from: d */
    public final /* synthetic */ DiskAdCacheManager.C9404a f38840d;

    /* renamed from: com.startapp.sdk.adsbase.cache.k$a */
    /* compiled from: Sta */
    public class C9427a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DiskAdCacheManager.DiskCachedAd f38841a;

        public C9427a(DiskAdCacheManager.DiskCachedAd diskCachedAd) {
            this.f38841a = diskCachedAd;
        }

        public void run() {
            try {
                DiskAdCacheManager.DiskCachedAd diskCachedAd = this.f38841a;
                if (diskCachedAd == null) {
                    C9426k kVar = C9426k.this;
                    DiskAdCacheManager.m49881a(kVar.f38837a, kVar.f38839c);
                    return;
                }
                if (diskCachedAd.mo30687a() != null) {
                    if (this.f38841a.mo30687a().isReady()) {
                        if (this.f38841a.mo30687a().mo30091d()) {
                            C9426k kVar2 = C9426k.this;
                            DiskAdCacheManager.m49881a(kVar2.f38837a, kVar2.f38839c);
                            return;
                        }
                        C9426k kVar3 = C9426k.this;
                        DiskAdCacheManager.m49882a(kVar3.f38837a, this.f38841a, kVar3.f38840d, kVar3.f38839c);
                        return;
                    }
                }
                C9426k kVar4 = C9426k.this;
                DiskAdCacheManager.m49881a(kVar4.f38837a, kVar4.f38839c);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                C9426k kVar5 = C9426k.this;
                DiskAdCacheManager.m49881a(kVar5.f38837a, kVar5.f38839c);
            }
        }
    }

    public C9426k(Context context, String str, AdEventListener adEventListener, DiskAdCacheManager.C9404a aVar) {
        this.f38837a = context;
        this.f38838b = str;
        this.f38839c = adEventListener;
        this.f38840d = aVar;
    }

    public void run() {
        Object obj;
        try {
            Context context = this.f38837a;
            String a = DiskAdCacheManager.m49880a();
            String str = this.f38838b;
            obj = null;
            if (str != null) {
                obj = C9673z2.m50589a(C9673z2.m50595b(context, a), str);
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            DiskAdCacheManager.m49881a(this.f38837a, this.f38839c);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new C9427a((DiskAdCacheManager.DiskCachedAd) obj));
    }
}
