package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C9023i4;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;

/* renamed from: com.startapp.sdk.adsbase.cache.i */
/* compiled from: Sta */
public class C9422i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f38830a;

    /* renamed from: b */
    public final /* synthetic */ DiskAdCacheManager.C9406c f38831b;

    /* renamed from: com.startapp.sdk.adsbase.cache.i$a */
    /* compiled from: Sta */
    public class C9423a implements Runnable {
        public C9423a() {
        }

        public void run() {
            ((C9408b) C9422i.this.f38831b).f38786a.f38791c = false;
        }
    }

    public C9422i(Context context, DiskAdCacheManager.C9406c cVar) {
        this.f38830a = context;
        this.f38831b = cVar;
    }

    public void run() {
        try {
            C9673z2.m50590a(this.f38830a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new C9423a());
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
