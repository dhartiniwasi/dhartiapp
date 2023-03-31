package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;

/* renamed from: com.startapp.sdk.ads.splash.a */
/* compiled from: Sta */
public class C9336a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f38434a;

    /* renamed from: b */
    public final /* synthetic */ CacheKey f38435b;

    /* renamed from: c */
    public final /* synthetic */ SplashEventHandler f38436c;

    public C9336a(SplashEventHandler splashEventHandler, Runnable runnable, CacheKey cacheKey) {
        this.f38436c = splashEventHandler;
        this.f38434a = runnable;
        this.f38435b = cacheKey;
    }

    public void run() {
        SplashEventHandler splashEventHandler = this.f38436c;
        splashEventHandler.f38403h = true;
        if (splashEventHandler.f38404i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            splashEventHandler.mo30243a(this.f38434a, this.f38435b);
        }
    }
}
