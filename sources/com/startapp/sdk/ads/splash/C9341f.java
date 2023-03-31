package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;

/* renamed from: com.startapp.sdk.ads.splash.f */
/* compiled from: Sta */
public class C9341f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SplashScreen f38444a;

    public C9341f(SplashScreen splashScreen) {
        this.f38444a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f38444a;
        SplashEventHandler splashEventHandler = splashScreen.f38419b;
        SplashScreen.SplashStartAppAd splashStartAppAd = splashScreen.f38425h;
        if (splashEventHandler.f38404i == SplashEventHandler.SplashState.DISPLAYED && !splashEventHandler.f38401f) {
            splashStartAppAd.close();
            splashEventHandler.f38404i = SplashEventHandler.SplashState.HIDDEN;
            splashEventHandler.mo30244b();
        }
    }
}
