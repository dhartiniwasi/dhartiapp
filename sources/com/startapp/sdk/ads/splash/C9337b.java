package com.startapp.sdk.ads.splash;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.C8846b6;
import com.startapp.C8944f3;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;

/* renamed from: com.startapp.sdk.ads.splash.b */
/* compiled from: Sta */
public class C9337b extends C8944f3 {

    /* renamed from: v */
    public SplashConfig f38437v = null;

    /* renamed from: w */
    public SplashScreen f38438w;

    /* renamed from: x */
    public boolean f38439x = false;

    /* renamed from: y */
    public boolean f38440y = false;

    /* renamed from: a */
    public boolean mo29071a(int i, KeyEvent keyEvent) {
        if (this.f38439x) {
            if (i == 25) {
                if (!this.f38440y) {
                    this.f38440y = true;
                    SplashScreen splashScreen = this.f38438w;
                    splashScreen.f38424g = true;
                    splashScreen.f38419b.f38402g = true;
                    Toast.makeText(this.f36755b, "Test Mode", 0).show();
                    return true;
                }
            } else if (i == 24 && this.f38440y) {
                this.f36755b.finish();
                return true;
            }
        }
        return i == 4;
    }

    /* renamed from: d */
    public void mo29353d() {
    }

    /* renamed from: e */
    public void mo29073e() {
    }

    /* renamed from: f */
    public void mo29074f() {
        AdPreferences adPreferences;
        if (this.f38437v != null) {
            Serializable serializableExtra = this.f36754a.getSerializableExtra("AdPreference");
            if (serializableExtra != null) {
                adPreferences = (AdPreferences) serializableExtra;
            } else {
                adPreferences = new AdPreferences();
            }
            this.f38439x = this.f36754a.getBooleanExtra("testMode", false);
            SplashScreen splashScreen = new SplashScreen(this.f36755b, this.f38437v, adPreferences);
            this.f38438w = splashScreen;
            SplashEventHandler splashEventHandler = splashScreen.f38419b;
            C8846b6.m48400a(splashEventHandler.f38396a).mo29212a(splashEventHandler.f38406k, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
            if (!splashScreen.mo30260c()) {
                splashScreen.f38423f.post(splashScreen.f38427j);
            } else {
                splashScreen.f38423f.postDelayed(splashScreen.f38427j, 100);
            }
        }
    }

    /* renamed from: g */
    public void mo29354g() {
        SplashEventHandler.SplashState splashState;
        SplashScreen splashScreen = this.f38438w;
        if (splashScreen != null) {
            splashScreen.f38423f.removeCallbacks(splashScreen.f38427j);
            SplashEventHandler splashEventHandler = splashScreen.f38419b;
            SplashEventHandler.SplashState splashState2 = splashEventHandler.f38404i;
            if (splashState2 != SplashEventHandler.SplashState.DISPLAYED && splashState2 != (splashState = SplashEventHandler.SplashState.DO_NOT_DISPLAY)) {
                splashEventHandler.f38404i = splashState;
                if (splashEventHandler.f38399d) {
                    splashEventHandler.mo30244b();
                }
            }
        }
    }

    /* renamed from: h */
    public void mo29355h() {
    }

    /* renamed from: a */
    public void mo29070a(Bundle bundle) {
        this.f38437v = (SplashConfig) this.f36754a.getSerializableExtra("SplashConfig");
    }
}
