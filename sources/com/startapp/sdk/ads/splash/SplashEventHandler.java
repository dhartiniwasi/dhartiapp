package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.C8846b6;
import com.startapp.C8953fa;
import com.startapp.C9023i4;
import com.startapp.C9058k0;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class SplashEventHandler {

    /* renamed from: a */
    public final Context f38396a;

    /* renamed from: b */
    public final WeakReference<Activity> f38397b;

    /* renamed from: c */
    public boolean f38398c;

    /* renamed from: d */
    public boolean f38399d;

    /* renamed from: e */
    public boolean f38400e;

    /* renamed from: f */
    public boolean f38401f;

    /* renamed from: g */
    public boolean f38402g;

    /* renamed from: h */
    public boolean f38403h;

    /* renamed from: i */
    public SplashState f38404i;

    /* renamed from: j */
    public SplashHtml f38405j;

    /* renamed from: k */
    public final BroadcastReceiver f38406k;

    /* compiled from: Sta */
    public enum SplashState {
        LOADING,
        RECEIVED,
        DISPLAYED,
        HIDDEN,
        DO_NOT_DISPLAY
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashEventHandler$a */
    /* compiled from: Sta */
    public class C9328a implements C8953fa {
        public C9328a() {
        }

        /* renamed from: a */
        public void mo29366a() {
            SplashEventHandler.this.mo30244b();
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashEventHandler$b */
    /* compiled from: Sta */
    public class C9329b extends BroadcastReceiver {
        public C9329b() {
        }

        public void onReceive(Context context, Intent intent) {
            SplashEventHandler.this.f38401f = true;
        }
    }

    public SplashEventHandler(Activity activity) {
        this.f38398c = false;
        this.f38399d = true;
        this.f38400e = false;
        this.f38401f = false;
        this.f38402g = false;
        this.f38403h = false;
        this.f38404i = SplashState.LOADING;
        this.f38405j = null;
        this.f38406k = new C9329b();
        this.f38396a = C9058k0.m48719b(activity);
        this.f38397b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public void mo30243a(Runnable runnable, CacheKey cacheKey) {
        AdRulesResult a = AdaptMetaData.f38768a.mo30647a().mo30640a(AdPreferences.Placement.INAPP_SPLASH, (String) null);
        if (a.mo30646b()) {
            mo30242a(runnable);
            return;
        }
        this.f38404i = SplashState.DO_NOT_DISPLAY;
        if (cacheKey != null) {
            C9396a.m49786a(C9396a.m49791a(C9410d.f38788h.mo30695a(cacheKey)), (String) null, 0, a.mo30645a());
        }
        mo30245c();
    }

    /* renamed from: b */
    public void mo30244b() {
        if (!this.f38400e) {
            this.f38400e = true;
            C8846b6.m48400a(this.f38396a).mo29213a(new Intent("com.startapp.android.splashHidden"));
        }
        try {
            C8846b6.m48400a(this.f38396a).mo29211a(this.f38406k);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        Activity activity = (Activity) this.f38397b.get();
        if (activity != null && !activity.isFinishing()) {
            try {
                activity.finish();
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
        }
    }

    /* renamed from: c */
    public final void mo30245c() {
        SplashHtml splashHtml = this.f38405j;
        C9328a aVar = new C9328a();
        if (splashHtml == null) {
            mo30244b();
            return;
        }
        splashHtml.callback = aVar;
        splashHtml.mo30249a();
    }

    /* renamed from: d */
    public void mo30246d() {
        this.f38398c = true;
    }

    /* renamed from: a */
    public void mo30241a() {
        this.f38404i = SplashState.DO_NOT_DISPLAY;
        mo30242a((Runnable) null);
    }

    /* renamed from: a */
    public final void mo30242a(Runnable runnable) {
        if (!this.f38398c) {
            return;
        }
        if (this.f38403h || runnable == null) {
            SplashState splashState = this.f38404i;
            if (splashState == SplashState.RECEIVED && runnable != null) {
                this.f38399d = false;
                runnable.run();
            } else if (splashState != SplashState.LOADING) {
                mo30245c();
            }
        }
    }

    public SplashEventHandler(Activity activity, SplashHtml splashHtml) {
        this(activity);
        this.f38405j = splashHtml;
    }
}
