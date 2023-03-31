package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.CacheKey;

/* renamed from: com.startapp.sdk.ads.splash.c */
/* compiled from: Sta */
public class C9338c implements C9410d.C9414d {

    /* renamed from: a */
    public final /* synthetic */ SplashScreen f38441a;

    public C9338c(SplashScreen splashScreen) {
        this.f38441a = splashScreen;
    }

    /* renamed from: a */
    public void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z) {
        this.f38441a.f38421d.set(cacheKey);
        if (z) {
            SplashScreen splashScreen = this.f38441a;
            SplashEventHandler splashEventHandler = splashScreen.f38419b;
            Runnable runnable = splashScreen.f38428k;
            if (splashEventHandler.f38404i == SplashEventHandler.SplashState.LOADING) {
                splashEventHandler.f38404i = SplashEventHandler.SplashState.RECEIVED;
            }
            splashEventHandler.mo30242a(runnable);
            return;
        }
        SplashScreen splashScreen2 = this.f38441a;
        if (splashScreen2.f38425h != null) {
            SplashEventHandler splashEventHandler2 = splashScreen2.f38419b;
            splashEventHandler2.f38404i = SplashEventHandler.SplashState.DO_NOT_DISPLAY;
            splashEventHandler2.mo30242a((Runnable) null);
        }
    }
}
