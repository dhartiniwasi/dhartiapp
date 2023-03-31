package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.C8837b0;
import com.startapp.C8953fa;
import com.startapp.C9023i4;
import com.startapp.C9058k0;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class SplashScreen {

    /* renamed from: a */
    public Activity f38418a;

    /* renamed from: b */
    public SplashEventHandler f38419b;

    /* renamed from: c */
    public SplashConfig f38420c;

    /* renamed from: d */
    public final AtomicReference<CacheKey> f38421d = new AtomicReference<>();

    /* renamed from: e */
    public SplashHtml f38422e = null;

    /* renamed from: f */
    public Handler f38423f = new Handler();

    /* renamed from: g */
    public boolean f38424g = false;

    /* renamed from: h */
    public SplashStartAppAd f38425h;

    /* renamed from: i */
    public AdPreferences f38426i;

    /* renamed from: j */
    public Runnable f38427j = new C9331a();

    /* renamed from: k */
    public final Runnable f38428k = new C9332b();

    /* compiled from: Sta */
    public static class SplashStartAppAd extends StartAppAd {
        private static final long serialVersionUID = 1;

        public SplashStartAppAd(Context context) {
            super(context);
            this.placement = AdPreferences.Placement.INAPP_SPLASH;
        }

        /* renamed from: a */
        public AdRulesResult mo30261a(String str, AdPreferences.Placement placement) {
            return new AdRulesResult(true, "");
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$a */
    /* compiled from: Sta */
    public class C9331a implements Runnable {
        public C9331a() {
        }

        public void run() {
            boolean z;
            SplashScreen splashScreen = SplashScreen.this;
            if (splashScreen.f38420c.mo30211b(splashScreen.f38418a)) {
                View view = null;
                if (splashScreen.mo30259b()) {
                    view = splashScreen.f38420c.mo30207a((Context) splashScreen.f38418a);
                } else {
                    SplashHtml splashHtml = splashScreen.f38422e;
                    if (splashHtml != null) {
                        view = splashHtml.mo30251b();
                    }
                }
                if (view != null) {
                    splashScreen.f38418a.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    SplashScreen splashScreen2 = SplashScreen.this;
                    Context a = C9058k0.m48718a(splashScreen2.f38418a);
                    if (a == null) {
                        a = splashScreen2.f38418a;
                    }
                    SplashStartAppAd splashStartAppAd = new SplashStartAppAd(a);
                    splashScreen2.f38425h = splashStartAppAd;
                    splashStartAppAd.loadSplash(splashScreen2.f38426i, new C9338c(splashScreen2));
                    SplashScreen splashScreen3 = SplashScreen.this;
                    splashScreen3.f38423f.postDelayed(new C9339d(splashScreen3), splashScreen3.f38420c.mo30209a().longValue());
                    splashScreen3.f38423f.postDelayed(new C9340e(splashScreen3), splashScreen3.f38420c.getMinSplashTime().getIndex());
                    return;
                }
                SplashScreen.this.f38418a.finish();
                return;
            }
            throw new IllegalArgumentException(splashScreen.f38420c.getErrorMessage());
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b */
    /* compiled from: Sta */
    public class C9332b implements Runnable {

        /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a */
        /* compiled from: Sta */
        public class C9333a implements C8953fa {

            /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a$a */
            /* compiled from: Sta */
            public class C9334a implements AdDisplayListener {
                public C9334a() {
                }

                public void adClicked(C9381Ad ad) {
                    SplashScreen.this.f38419b.f38401f = true;
                }

                public void adDisplayed(C9381Ad ad) {
                    SplashScreen.this.f38419b.f38404i = SplashEventHandler.SplashState.DISPLAYED;
                }

                public void adHidden(C9381Ad ad) {
                    SplashEventHandler splashEventHandler = SplashScreen.this.f38419b;
                    splashEventHandler.f38404i = SplashEventHandler.SplashState.HIDDEN;
                    splashEventHandler.mo30244b();
                }

                public void adNotDisplayed(C9381Ad ad) {
                }
            }

            public C9333a() {
            }

            /* renamed from: a */
            public void mo29366a() {
                SplashStartAppAd splashStartAppAd;
                SplashScreen splashScreen = SplashScreen.this;
                if (!splashScreen.f38424g && (splashStartAppAd = splashScreen.f38425h) != null) {
                    splashStartAppAd.showAd((AdDisplayListener) new C9334a());
                    SplashScreen splashScreen2 = SplashScreen.this;
                    if (splashScreen2.f38420c.getMaxAdDisplayTime() != SplashConfig.MaxAdDisplayTime.FOR_EVER) {
                        splashScreen2.f38423f.postDelayed(new C9341f(splashScreen2), splashScreen2.f38420c.getMaxAdDisplayTime().getIndex());
                    }
                    SplashScreen.this.f38418a.finish();
                }
            }
        }

        public C9332b() {
        }

        public void run() {
            SplashScreen splashScreen = SplashScreen.this;
            SplashEventHandler splashEventHandler = splashScreen.f38419b;
            SplashHtml splashHtml = splashScreen.f38422e;
            C9333a aVar = new C9333a();
            splashEventHandler.getClass();
            if (splashHtml == null) {
                aVar.mo29366a();
                return;
            }
            splashHtml.callback = aVar;
            splashHtml.mo30249a();
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$c */
    /* compiled from: Sta */
    public static /* synthetic */ class C9335c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38433a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.splash.SplashConfig$Orientation[] r0 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38433a = r0
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38433a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashScreen.C9335c.<clinit>():void");
        }
    }

    public SplashScreen(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.f38418a = activity;
        this.f38420c = splashConfig;
        this.f38426i = adPreferences;
        try {
            mo30258a();
            this.f38419b = new SplashEventHandler(activity, this.f38422e);
        } catch (Throwable th) {
            SplashEventHandler splashEventHandler = new SplashEventHandler(activity);
            this.f38419b = splashEventHandler;
            splashEventHandler.mo30246d();
            this.f38419b.mo30241a();
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public final void mo30258a() {
        SplashConfig splashConfig = this.f38420c;
        Activity activity = this.f38418a;
        if (splashConfig.getLogo() == null && splashConfig.getLogoRes() == -1 && splashConfig.getLogoByteArray() != null) {
            byte[] logoByteArray = splashConfig.getLogoByteArray();
            splashConfig.f38394a = new BitmapDrawable(activity.getResources(), BitmapFactory.decodeByteArray(logoByteArray, 0, logoByteArray.length));
        }
        if (!mo30259b()) {
            this.f38422e = this.f38420c.mo30208a(this.f38418a);
        }
    }

    /* renamed from: b */
    public final boolean mo30259b() {
        return !this.f38420c.isHtmlSplash() || this.f38420c.mo30210b();
    }

    /* renamed from: c */
    public final boolean mo30260c() {
        int i = this.f38418a.getResources().getConfiguration().orientation;
        if (this.f38420c.getOrientation() == SplashConfig.Orientation.AUTO) {
            if (i == 2) {
                this.f38420c.setOrientation(SplashConfig.Orientation.LANDSCAPE);
            } else {
                this.f38420c.setOrientation(SplashConfig.Orientation.PORTRAIT);
            }
        }
        int i2 = C9335c.f38433a[this.f38420c.getOrientation().ordinal()];
        boolean z = false;
        boolean z2 = true;
        if (i2 == 1) {
            if (i == 2) {
                z = true;
            }
            Activity activity = this.f38418a;
            int i3 = C8837b0.f36438a;
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    activity.setRequestedOrientation(7);
                    return z;
                } catch (Throwable unused) {
                    return z;
                }
            } else {
                activity.setRequestedOrientation(1);
                return z;
            }
        } else if (i2 != 2) {
            return false;
        } else {
            if (i != 1) {
                z2 = false;
            }
            Activity activity2 = this.f38418a;
            int i4 = C8837b0.f36438a;
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    activity2.setRequestedOrientation(6);
                } catch (Throwable unused2) {
                }
            } else {
                activity2.setRequestedOrientation(0);
            }
            return z2;
        }
    }
}
