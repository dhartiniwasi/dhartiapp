package com.startapp.sdk.ads.splash;

import com.startapp.C8931ea;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.ads.splash.e */
/* compiled from: Sta */
public class C9340e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SplashScreen f38443a;

    public C9340e(SplashScreen splashScreen) {
        this.f38443a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f38443a;
        SplashEventHandler splashEventHandler = splashScreen.f38419b;
        Runnable runnable = splashScreen.f38428k;
        AtomicReference<CacheKey> atomicReference = splashScreen.f38421d;
        splashEventHandler.f38398c = true;
        if (splashEventHandler.f38404i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            C8931ea eaVar = new C8931ea(splashEventHandler, runnable, atomicReference);
            synchronized (MetaData.f38945d) {
                if (MetaData.f38952k.f38955b) {
                    eaVar.mo29320a((MetaDataRequest.RequestReason) null, false);
                } else {
                    MetaData.f38952k.mo31016a((C9450c) eaVar);
                }
            }
            return;
        }
        splashEventHandler.mo30245c();
    }
}
