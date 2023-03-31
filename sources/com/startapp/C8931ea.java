package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.splash.C9336a;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.ea */
/* compiled from: Sta */
public class C8931ea implements C9450c {

    /* renamed from: a */
    public final /* synthetic */ Runnable f36727a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f36728b;

    /* renamed from: c */
    public final /* synthetic */ SplashEventHandler f36729c;

    public C8931ea(SplashEventHandler splashEventHandler, Runnable runnable, AtomicReference atomicReference) {
        this.f36729c = splashEventHandler;
        this.f36727a = runnable;
        this.f36728b = atomicReference;
    }

    /* renamed from: a */
    public void mo29320a(MetaDataRequest.RequestReason requestReason, boolean z) {
        SplashEventHandler splashEventHandler = this.f36729c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new C9336a(splashEventHandler, this.f36727a, (CacheKey) this.f36728b.get()));
    }

    /* renamed from: a */
    public void mo29319a(MetaDataRequest.RequestReason requestReason) {
        SplashEventHandler splashEventHandler = this.f36729c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new C9336a(splashEventHandler, this.f36727a, (CacheKey) this.f36728b.get()));
    }
}
