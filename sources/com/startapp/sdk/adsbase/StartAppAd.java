package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.startapp.C8846b6;
import com.startapp.C8958g;
import com.startapp.C8991h;
import com.startapp.C9018i;
import com.startapp.C9023i4;
import com.startapp.C9034j;
import com.startapp.C9055k;
import com.startapp.C9058k0;
import com.startapp.C9284sc;
import com.startapp.C9605vb;
import com.startapp.C9615w2;
import com.startapp.C9673z2;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9402c;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;

/* compiled from: Sta */
public class StartAppAd extends C9381Ad {
    private static final long serialVersionUID = 1;

    /* renamed from: ad */
    public C9440d f38653ad = null;
    /* access modifiers changed from: private */
    public CacheKey adKey = null;
    private AdMode adMode = AdMode.AUTOMATIC;
    private AdPreferences adPreferences = null;
    public AdDisplayListener callback = null;
    private final BroadcastReceiver callbackBroadcastReceiver = new C9387a();
    public VideoListener videoListener = null;

    /* compiled from: Sta */
    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$a */
    /* compiled from: Sta */
    public class C9387a extends BroadcastReceiver {
        public C9387a() {
        }

        public void onReceive(Context context, Intent intent) {
            C8958g gVar;
            C9284sc scVar;
            C9018i iVar;
            C8991h hVar;
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            String stringExtra = intent.getStringExtra("dParam");
            if (action.equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                if (extras.containsKey("showFailedReason")) {
                    StartAppAd.this.mo30415a((NotDisplayedReason) extras.getSerializable("showFailedReason"));
                }
                StartAppAd startAppAd = StartAppAd.this;
                C9034j.m48694a(context, startAppAd.callback, startAppAd);
                C8846b6.m48400a(context).mo29211a((BroadcastReceiver) this);
            } else {
                boolean z = true;
                if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                    StartAppAd startAppAd2 = StartAppAd.this;
                    AdDisplayListener adDisplayListener = startAppAd2.callback;
                    if (adDisplayListener == null) {
                        z = false;
                    }
                    C9615w2.m50488a("onShow", z, stringExtra, (String) null);
                    if (adDisplayListener == null) {
                        hVar = null;
                    } else {
                        hVar = new C8991h(adDisplayListener, startAppAd2, context);
                    }
                    C9396a.m49784a((Runnable) hVar);
                } else if (action.equals("com.startapp.android.OnClickCallback")) {
                    StartAppAd startAppAd3 = StartAppAd.this;
                    AdDisplayListener adDisplayListener2 = startAppAd3.callback;
                    if (adDisplayListener2 == null) {
                        z = false;
                    }
                    C9615w2.m50488a("onClicked", z, stringExtra, (String) null);
                    if (adDisplayListener2 == null) {
                        iVar = null;
                    } else {
                        iVar = new C9018i(adDisplayListener2, startAppAd3, context);
                    }
                    C9396a.m49784a((Runnable) iVar);
                } else if (action.equals("com.startapp.android.OnVideoCompleted")) {
                    VideoListener videoListener = StartAppAd.this.videoListener;
                    if (videoListener == null) {
                        z = false;
                    }
                    C9615w2.m50488a("onVideoCompleted", z, stringExtra, (String) null);
                    if (videoListener == null) {
                        scVar = null;
                    } else {
                        scVar = new C9284sc(videoListener, context);
                    }
                    C9396a.m49784a((Runnable) scVar);
                } else {
                    StartAppAd startAppAd4 = StartAppAd.this;
                    AdDisplayListener adDisplayListener3 = startAppAd4.callback;
                    if (adDisplayListener3 == null) {
                        z = false;
                    }
                    C9615w2.m50488a("adHidden", z, stringExtra, (String) null);
                    if (adDisplayListener3 == null) {
                        gVar = null;
                    } else {
                        gVar = new C8958g(adDisplayListener3, startAppAd4, context);
                    }
                    C9396a.m49784a((Runnable) gVar);
                    C8846b6.m48400a(context).mo29211a((BroadcastReceiver) this);
                }
            }
            StartAppAd.this.f38653ad = null;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$b */
    /* compiled from: Sta */
    public class C9388b implements C9410d.C9414d {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f38655a;

        public C9388b(AdEventListener adEventListener) {
            this.f38655a = adEventListener;
        }

        /* renamed from: a */
        public void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z) {
            CacheKey unused = StartAppAd.this.adKey = cacheKey;
            AdEventListener adEventListener = this.f38655a;
            if (adEventListener == null) {
                return;
            }
            if (!z || ad == null) {
                adEventListener.onFailedToReceiveAd(ad);
            } else {
                adEventListener.onReceiveAd(ad);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$c */
    /* compiled from: Sta */
    public class C9389c implements C9410d.C9414d {

        /* renamed from: a */
        public final /* synthetic */ C9410d.C9414d f38657a;

        public C9389c(C9410d.C9414d dVar) {
            this.f38657a = dVar;
        }

        /* renamed from: a */
        public void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z) {
            CacheKey unused = StartAppAd.this.adKey = cacheKey;
            C9410d.C9414d dVar = this.f38657a;
            if (dVar != null) {
                dVar.mo30269a(ad, cacheKey, z);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$d */
    /* compiled from: Sta */
    public class C9390d extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ Activity f38659a;

        /* renamed from: b */
        public final /* synthetic */ SplashHideListener f38660b;

        public C9390d(Activity activity, SplashHideListener splashHideListener) {
            this.f38659a = activity;
            this.f38660b = splashHideListener;
        }

        public void onReceive(Context context, Intent intent) {
            C9605vb.m50456a(this.f38659a, false);
            SplashHideListener splashHideListener = this.f38660b;
            if (splashHideListener != null) {
                splashHideListener.splashHidden();
            }
            C8846b6.m48400a((Context) this.f38659a).mo29211a((BroadcastReceiver) this);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$e */
    /* compiled from: Sta */
    public static /* synthetic */ class C9391e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38661a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.sdk.adsbase.StartAppAd$AdMode[] r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38661a = r0
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38661a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38661a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38661a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.C9391e.<clinit>():void");
        }
    }

    public StartAppAd(Context context) {
        super(context, (AdPreferences.Placement) null);
        try {
            ComponentLocator.m50248a(context).mo31183s().mo29264a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        C9402c.C9403a.f38781a.f38776a = false;
    }

    public static void disableSplash() {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.f38689w = true;
        C9410d.f38788h.mo30703b(AdPreferences.Placement.INAPP_SPLASH);
    }

    public static void enableAutoInterstitial() {
        C9402c.C9403a.f38781a.f38776a = true;
    }

    public static void enableConsent(Context context, boolean z) {
        ComponentLocator.m50248a(context).mo31170f().f36720e = z;
    }

    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        C9402c cVar = C9402c.C9403a.f38781a;
        cVar.f38777b = autoInterstitialPreferences;
        cVar.f38778c = -1;
        cVar.f38779d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a = C9058k0.m48718a(context);
        if (a != null) {
            Object obj = StartAppSDKInternal.f38662D;
            StartAppSDKInternal.C9395d.f38707a.f38667a = sDKAdPreferences;
            C9673z2.m50596b(a, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences2) {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        boolean z = !C9605vb.m50465a(startAppSDKInternal.f38685s, adPreferences2);
        startAppSDKInternal.f38685s = adPreferences2 != null ? new AdPreferences(adPreferences2) : null;
        if (z) {
            C9410d dVar = C9410d.f38788h;
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (!dVar.f38792d) {
                synchronized (dVar.f38789a) {
                    for (C9419h next : dVar.f38789a.values()) {
                        if (next.f38811a == placement) {
                            next.mo30711b();
                        }
                    }
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle) {
        showSplash(activity, bundle, new SplashConfig());
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences2, AdEventListener adEventListener) {
    }

    public void close() {
        C8846b6.m48400a(this.f38612a).mo29211a(this.callbackBroadcastReceiver);
        C8846b6.m48400a(this.f38612a).mo29213a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.adKey;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.sdk.adsbase.model.AdPreferences.Placement mo30416f() {
        /*
            r3 = this;
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r3.placement
            if (r0 != 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.CacheKey r1 = r3.adKey
            if (r1 == 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            com.startapp.sdk.adsbase.d r1 = r2.mo30695a((com.startapp.sdk.adsbase.cache.CacheKey) r1)
            if (r1 == 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            com.startapp.sdk.adsbase.cache.CacheKey r1 = r3.adKey
            com.startapp.sdk.adsbase.d r0 = r0.mo30695a((com.startapp.sdk.adsbase.cache.CacheKey) r1)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.C9381Ad) r0
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r0.mo30416f()
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.mo30416f():com.startapp.sdk.adsbase.model.AdPreferences$Placement");
    }

    public String getAdId() {
        C9440d a = C9410d.f38788h.mo30695a(this.adKey);
        if (a instanceof HtmlAd) {
            return ((HtmlAd) a).getAdId();
        }
        return null;
    }

    public String getBidToken() {
        C9440d a = C9410d.f38788h.mo30695a(this.adKey);
        if (a instanceof HtmlAd) {
            return ((HtmlAd) a).getBidToken();
        }
        return null;
    }

    public C9381Ad.AdState getState() {
        C9440d a = C9410d.f38788h.mo30695a(this.adKey);
        if (a != null) {
            return a.getState();
        }
        return C9381Ad.AdState.UN_INITIALIZED;
    }

    public boolean isBelowMinCPM() {
        C9440d a = C9410d.f38788h.mo30695a(this.adKey);
        if (a != null) {
            return a.isBelowMinCPM();
        }
        return false;
    }

    public boolean isNetworkAvailable() {
        return C9605vb.m50482g(this.f38612a);
    }

    public boolean isReady() {
        C9440d a = C9410d.f38788h.mo30695a(this.adKey);
        if (a != null) {
            return a.isReady();
        }
        return false;
    }

    @Deprecated
    public void load(AdPreferences adPreferences2, AdEventListener adEventListener) {
        if (MetaData.f38952k.mo31019b()) {
            if (adPreferences2 == null) {
                adPreferences2 = new AdPreferences();
            }
            AdPreferences adPreferences3 = adPreferences2;
            if (adPreferences3.getPlacementId() == null) {
                adPreferences3.setPlacementId(C9396a.m49772a(this.f38612a, (Object) this));
            }
            C9410d.f38788h.mo30696a(this.f38612a, this, this.adMode, adPreferences3, (C9410d.C9414d) new C9388b(adEventListener));
        } else if (adEventListener != null) {
            setErrorMessage("serving ads disabled");
            C9055k.m48716a(this.f38612a, adEventListener, this, false);
        }
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    public void loadSplash(AdPreferences adPreferences2, C9410d.C9414d dVar) {
        C9410d dVar2 = C9410d.f38788h;
        Context context = this.f38612a;
        C9389c cVar = new C9389c(dVar);
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_SPLASH;
        if (dVar2.mo30701a(placement)) {
            dVar2.mo30698a(context, this, placement, adPreferences2, cVar, false, 0);
        } else {
            cVar.mo30269a((C9381Ad) null, (CacheKey) null, false);
        }
    }

    public void onBackPressed() {
        showAd("exit_ad");
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        startAppSDKInternal.f38670d = false;
        startAppSDKInternal.f38672f = true;
    }

    public void onPause() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        int i = bundle.getInt("AdMode");
        this.adMode = AdMode.AUTOMATIC;
        if (i == 1) {
            this.adMode = AdMode.FULLPAGE;
        } else if (i == 2) {
            this.adMode = AdMode.OFFERWALL;
        } else if (i == 3) {
            this.adMode = AdMode.OVERLAY;
        } else if (i == 4) {
            this.adMode = AdMode.REWARDED_VIDEO;
        } else if (i == 5) {
            this.adMode = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.adPreferences = (AdPreferences) serializable;
        }
    }

    public void onResume() {
        if (!isReady()) {
            loadAd();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i = C9391e.f38661a[this.adMode.ordinal()];
        int i2 = 4;
        if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 3) {
            i2 = 3;
        } else if (i != 4) {
            i2 = 0;
        }
        AdPreferences adPreferences2 = this.adPreferences;
        if (adPreferences2 != null) {
            bundle.putSerializable("AdPrefs", adPreferences2);
        }
        bundle.putInt("AdMode", i2);
    }

    public void setVideoListener(VideoListener videoListener2) {
        this.videoListener = videoListener2;
    }

    public boolean showAd() {
        return showAd((String) null, (AdDisplayListener) null);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
        showSplash(activity, bundle, splashConfig, new AdPreferences());
    }

    /* renamed from: a */
    public AdRulesResult mo30261a(String str, AdPreferences.Placement placement) {
        return AdsCommonMetaData.f38625h.mo30456b().mo30640a(placement, str);
    }

    public void loadAd(AdPreferences adPreferences2) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, (AdEventListener) null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, (AdDisplayListener) null);
    }

    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences2) {
        showSplash(activity, bundle, new SplashConfig(), adPreferences2);
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd((String) null, adDisplayListener);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2) {
        showSplash(activity, bundle, splashConfig, adPreferences2, (SplashHideListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        if (r14 == false) goto L_0x016e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30524a(java.lang.String r13, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f38612a
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r0)
            com.startapp.c9 r1 = r0.mo31183s()     // Catch:{ all -> 0x0011 }
            r2 = 32768(0x8000, float:4.5918E-41)
            r1.mo29264a((int) r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0012
        L_0x0011:
        L_0x0012:
            r1 = 0
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r1)
            r12.callback = r14
            com.startapp.sdk.adsbase.remoteconfig.MetaData r14 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
            boolean r14 = r14.mo31019b()
            r2 = 0
            if (r14 != 0) goto L_0x002e
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r13 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.SERVING_ADS_DISABLED
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r13)
            android.content.Context r13 = r12.f38612a
            com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14 = r12.callback
            com.startapp.C9034j.m48694a(r13, r14, r12)
            return r2
        L_0x002e:
            com.startapp.sdk.adsbase.cache.CacheKey r14 = r12.adKey
            if (r14 != 0) goto L_0x0039
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.model.AdPreferences r3 = r12.adPreferences
            r12.loadAd((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14, (com.startapp.sdk.adsbase.model.AdPreferences) r3)
        L_0x0039:
            com.startapp.sdk.adsbase.AdsCommonMetaData r14 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            boolean r14 = r14.mo30453O()
            r3 = 1
            if (r14 == 0) goto L_0x004d
            android.content.Context r14 = r12.f38612a
            boolean r14 = com.startapp.C9605vb.m50479e((android.content.Context) r14)
            if (r14 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r14 = 0
            goto L_0x004e
        L_0x004d:
            r14 = 1
        L_0x004e:
            if (r14 == 0) goto L_0x017e
            boolean r14 = r12.isNetworkAvailable()
            if (r14 == 0) goto L_0x0178
            boolean r14 = r12.isReady()
            if (r14 == 0) goto L_0x0114
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r14 = r12.mo30416f()
            com.startapp.sdk.adsbase.adrules.AdRulesResult r4 = r12.mo30261a((java.lang.String) r13, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r14)
            boolean r5 = r4.mo30646b()
            if (r5 == 0) goto L_0x010b
            com.startapp.sdk.adsbase.cache.d r5 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            com.startapp.sdk.adsbase.cache.CacheKey r6 = r12.adKey
            com.startapp.sdk.adsbase.d r5 = r5.mo30704c(r6)
            r12.f38653ad = r5
            if (r5 == 0) goto L_0x0110
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r6 = r12.placement
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r7 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_SPLASH
            if (r6 != r7) goto L_0x0094
            java.lang.Object r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.f38662D
            com.startapp.sdk.adsbase.StartAppSDKInternal r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.C9395d.f38707a
            boolean r8 = r6.f38669c
            if (r8 == 0) goto L_0x008a
            boolean r6 = r6.f38670d
            if (r6 == 0) goto L_0x008a
            r6 = 1
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r6 == 0) goto L_0x0094
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.APP_IN_BACKGROUND
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
            goto L_0x0110
        L_0x0094:
            boolean r5 = r5.mo30088a((java.lang.String) r13)
            if (r5 == 0) goto L_0x00ee
            com.startapp.f r6 = com.startapp.C8938f.f36742d
            com.startapp.e r8 = new com.startapp.e
            r8.<init>(r14, r13)
            r6.mo29342a(r8)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            if (r14 == 0) goto L_0x00bc
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r14 = r12.placement
            if (r14 == r7) goto L_0x00bc
            com.startapp.sdk.adsbase.model.AdPreferences r14 = r12.adPreferences
            if (r14 == 0) goto L_0x00bd
            com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
            r6.<init>()
            boolean r14 = r14.equals(r6)
            if (r14 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            if (r3 == 0) goto L_0x00fd
            com.startapp.sdk.adsbase.cache.d r14 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.C9410d.m49893a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            com.startapp.sdk.adsbase.e r0 = r0.mo31168d()
            com.startapp.sdk.adsbase.e$a r0 = r0.edit()
            r0.mo30809a((java.lang.String) r14, (int) r2)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.StartAppAd$AdMode r3 = com.startapp.sdk.adsbase.StartAppAd.AdMode.AUTOMATIC
            if (r14 != r3) goto L_0x00ea
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.C9410d.m49893a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            r0.mo30809a((java.lang.String) r14, (int) r2)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.C9410d.m49893a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            r0.mo30809a((java.lang.String) r14, (int) r2)
        L_0x00ea:
            r0.apply()
            goto L_0x00fd
        L_0x00ee:
            com.startapp.sdk.adsbase.d r14 = r12.f38653ad
            boolean r0 = r14 instanceof com.startapp.sdk.adsbase.C9381Ad
            if (r0 == 0) goto L_0x00fd
            com.startapp.sdk.adsbase.Ad r14 = (com.startapp.sdk.adsbase.C9381Ad) r14
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = r14.getNotDisplayedReason()
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x00fd:
            boolean r14 = com.startapp.sdk.adsbase.cache.CacheMetaData.m49873d()
            if (r14 == 0) goto L_0x0111
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.model.AdPreferences r0 = r12.adPreferences
            r12.loadAd(r14, r0, r1)
            goto L_0x0111
        L_0x010b:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_RULES
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x0110:
            r5 = 0
        L_0x0111:
            r3 = 0
            goto L_0x0186
        L_0x0114:
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.StartAppAd$AdMode r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO
            if (r14 == r0) goto L_0x016e
            com.startapp.sdk.adsbase.StartAppAd$AdMode r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.VIDEO
            if (r14 == r0) goto L_0x016e
            com.startapp.sdk.adsbase.remoteconfig.MetaData r14 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
            boolean r14 = r14.mo31019b()
            if (r14 == 0) goto L_0x016a
            com.startapp.sdk.adsbase.AdsCommonMetaData r14 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            com.startapp.sdk.adsbase.VideoConfig r14 = r14.mo30445G()
            boolean r14 = r14.mo30590q()
            if (r14 != 0) goto L_0x0133
            goto L_0x016a
        L_0x0133:
            com.startapp.sdk.adsbase.model.AdPreferences r14 = r12.adPreferences
            if (r14 != 0) goto L_0x013c
            com.startapp.sdk.adsbase.model.AdPreferences r14 = new com.startapp.sdk.adsbase.model.AdPreferences
            r14.<init>()
        L_0x013c:
            com.startapp.sdk.adsbase.Ad$AdType r0 = com.startapp.sdk.adsbase.C9381Ad.AdType.NON_VIDEO
            r14.setType(r0)
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r12.mo30416f()
            com.startapp.sdk.adsbase.cache.d r4 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            com.startapp.sdk.adsbase.cache.CacheKey r5 = new com.startapp.sdk.adsbase.cache.CacheKey
            r5.<init>(r0, r14)
            com.startapp.sdk.adsbase.d r14 = r4.mo30695a((com.startapp.sdk.adsbase.cache.CacheKey) r5)
            if (r14 == 0) goto L_0x016a
            boolean r4 = r14.isReady()
            if (r4 == 0) goto L_0x016a
            com.startapp.sdk.adsbase.adrules.AdRulesResult r0 = r12.mo30261a((java.lang.String) r13, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r0)
            boolean r0 = r0.mo30646b()
            if (r0 == 0) goto L_0x016a
            r14.mo30086a((boolean) r3)
            boolean r14 = r14.mo30088a((java.lang.String) r13)
            goto L_0x016b
        L_0x016a:
            r14 = 0
        L_0x016b:
            if (r14 == 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r3 = 0
        L_0x016f:
            if (r3 != 0) goto L_0x0176
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_NOT_READY
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x0176:
            r4 = r1
            goto L_0x0185
        L_0x0178:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.NETWORK_PROBLEM
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
            goto L_0x0183
        L_0x017e:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.APP_IN_BACKGROUND
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x0183:
            r4 = r1
            r3 = 0
        L_0x0185:
            r5 = 0
        L_0x0186:
            if (r5 != 0) goto L_0x018a
            if (r3 == 0) goto L_0x01e4
        L_0x018a:
            android.content.Context r14 = r12.f38612a
            com.startapp.b6 r14 = com.startapp.C8846b6.m48400a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.HideDisplayBroadcastListener"
            r6.<init>(r7)
            r14.mo29212a(r0, r6)
            android.content.Context r14 = r12.f38612a
            com.startapp.b6 r14 = com.startapp.C8846b6.m48400a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.ShowDisplayBroadcastListener"
            r6.<init>(r7)
            r14.mo29212a(r0, r6)
            android.content.Context r14 = r12.f38612a
            com.startapp.b6 r14 = com.startapp.C8846b6.m48400a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.ShowFailedDisplayBroadcastListener"
            r6.<init>(r7)
            r14.mo29212a(r0, r6)
            android.content.Context r14 = r12.f38612a
            com.startapp.b6 r14 = com.startapp.C8846b6.m48400a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.OnClickCallback"
            r6.<init>(r7)
            r14.mo29212a(r0, r6)
            android.content.Context r14 = r12.f38612a
            com.startapp.b6 r14 = com.startapp.C8846b6.m48400a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.OnVideoCompleted"
            r6.<init>(r7)
            r14.mo29212a(r0, r6)
        L_0x01e4:
            if (r5 != 0) goto L_0x022f
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = r12.getNotDisplayedReason()
            if (r14 != 0) goto L_0x01f1
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r12.mo30415a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x01f1:
            com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            com.startapp.sdk.adsbase.cache.CacheKey r6 = r12.adKey
            com.startapp.sdk.adsbase.d r0 = r0.mo30695a((com.startapp.sdk.adsbase.cache.CacheKey) r6)
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r6 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_RULES
            if (r14 == r6) goto L_0x0217
            if (r3 == 0) goto L_0x0201
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK
        L_0x0201:
            android.content.Context r6 = r12.f38612a
            com.startapp.sdk.adsbase.d r2 = r12.f38653ad
            if (r2 == 0) goto L_0x0208
            r0 = r2
        L_0x0208:
            java.lang.String[] r7 = com.startapp.sdk.adsbase.C9396a.m49791a((com.startapp.sdk.adsbase.C9440d) r0)
            java.lang.String r10 = r14.toString()
            r9 = 0
            r11 = 0
            r8 = r13
            com.startapp.sdk.adsbase.C9396a.m49783a((android.content.Context) r6, (java.lang.String[]) r7, (java.lang.String) r8, (int) r9, (java.lang.String) r10, (org.json.JSONObject) r11)
            goto L_0x0224
        L_0x0217:
            if (r4 == 0) goto L_0x0224
            java.lang.String[] r14 = com.startapp.sdk.adsbase.C9396a.m49791a((com.startapp.sdk.adsbase.C9440d) r0)
            java.lang.String r0 = r4.mo30645a()
            com.startapp.sdk.adsbase.C9396a.m49786a((java.lang.String[]) r14, (java.lang.String) r13, (int) r2, (java.lang.String) r0)
        L_0x0224:
            r12.f38653ad = r1
            if (r3 != 0) goto L_0x022f
            android.content.Context r13 = r12.f38612a
            com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14 = r12.callback
            com.startapp.C9034j.m48694a(r13, r14, r12)
        L_0x022f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.mo30524a(java.lang.String, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener):boolean");
    }

    public void loadAd(AdPreferences adPreferences2, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, adEventListener);
    }

    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return mo30524a(str, adDisplayListener);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            mo30415a(NotDisplayedReason.INTERNAL_ERROR);
            C9034j.m48694a(this.f38612a, this.callback, (C9381Ad) null);
            return false;
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener) {
        m49720a(activity, bundle, splashConfig, adPreferences2, splashHideListener, true);
    }

    public void loadAd(AdMode adMode2) {
        loadAd(adMode2, new AdPreferences(), (AdEventListener) null);
    }

    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2) {
        loadAd(adMode2, adPreferences2, (AdEventListener) null);
    }

    public void loadAd(AdMode adMode2, AdEventListener adEventListener) {
        loadAd(adMode2, new AdPreferences(), adEventListener);
    }

    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2, AdEventListener adEventListener) {
        try {
            ComponentLocator.m50248a(this.f38612a).mo31183s().mo29264a(16384);
        } catch (Throwable unused) {
        }
        this.adMode = adMode2;
        this.adPreferences = adPreferences2;
        try {
            load(adPreferences2, adEventListener);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            if (adEventListener != null) {
                C9055k.m48716a(this.f38612a, adEventListener, this, false);
            }
        }
    }

    /* renamed from: a */
    public static void m49720a(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener, boolean z) {
        if (activity != null && bundle == null && MetaData.f38952k.mo31019b() && C9605vb.m50479e((Context) activity) && ComponentLocator.m50248a((Context) activity).mo31167c().mo29287a()) {
            try {
                Object obj = StartAppSDKInternal.f38662D;
                StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
                int i = 0;
                if (!(!startAppSDKInternal.f38689w) && z) {
                    startAppSDKInternal.f38689w = false;
                }
                startAppSDKInternal.f38688v = z;
                if (!z) {
                    if (adPreferences2 == null) {
                        adPreferences2 = new AdPreferences();
                    }
                    adPreferences2.setAs(Boolean.TRUE);
                }
                splashConfig.setDefaults(activity);
                C9605vb.m50442a(activity, activity.getResources().getConfiguration().orientation, true);
                Intent intent = new Intent(activity, OverlayActivity.class);
                intent.putExtra("SplashConfig", splashConfig);
                intent.putExtra("AdPreference", adPreferences2);
                intent.putExtra("testMode", false);
                intent.putExtra("fullscreen", C9396a.m49787a(activity));
                intent.putExtra("placement", AdPreferences.Placement.INAPP_SPLASH.mo30901a());
                if (Build.VERSION.SDK_INT >= 11) {
                    i = 32768;
                }
                intent.addFlags(67108864 | i | 1073741824);
                activity.startActivity(intent);
                C8846b6.m48400a((Context) activity).mo29212a(new C9390d(activity, splashHideListener), new IntentFilter("com.startapp.android.splashHidden"));
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                if (splashHideListener != null) {
                    splashHideListener.splashHidden();
                }
            }
        }
    }
}
