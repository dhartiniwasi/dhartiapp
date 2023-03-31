package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.C8837b0;
import com.startapp.C8898d0;
import com.startapp.C8929e8;
import com.startapp.C8964g2;
import com.startapp.C8980g6;
import com.startapp.C8992h0;
import com.startapp.C9019i0;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9058k0;
import com.startapp.C9090kb;
import com.startapp.C9120ld;
import com.startapp.C9147n4;
import com.startapp.C9545t;
import com.startapp.C9584u9;
import com.startapp.C9605vb;
import com.startapp.C9620w7;
import com.startapp.C9667ye;
import com.startapp.C9673z2;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.crashreport.C9432b;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.C9522y;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.Thread;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class StartAppSDKInternal implements C9019i0 {

    /* renamed from: D */
    public static final Object f38662D = new Object();

    /* renamed from: E */
    public static volatile InitState f38663E = InitState.UNSET;

    /* renamed from: A */
    public C8992h0 f38664A;

    /* renamed from: B */
    public C9090kb f38665B;

    /* renamed from: C */
    public boolean f38666C;

    /* renamed from: a */
    public SDKAdPreferences f38667a;

    /* renamed from: b */
    public boolean f38668b = true;

    /* renamed from: c */
    public final boolean f38669c = C8837b0.m48303a();

    /* renamed from: d */
    public boolean f38670d = false;

    /* renamed from: e */
    public boolean f38671e = false;

    /* renamed from: f */
    public boolean f38672f = false;

    /* renamed from: g */
    public long f38673g;

    /* renamed from: h */
    public Application f38674h;

    /* renamed from: i */
    public HashMap<Integer, Integer> f38675i = new HashMap<>();

    /* renamed from: j */
    public Object f38676j;

    /* renamed from: k */
    public final AtomicBoolean f38677k = new AtomicBoolean();

    /* renamed from: l */
    public Activity f38678l;

    /* renamed from: m */
    public boolean f38679m = false;

    /* renamed from: n */
    public boolean f38680n = true;

    /* renamed from: o */
    public boolean f38681o = false;

    /* renamed from: p */
    public boolean f38682p = false;

    /* renamed from: q */
    public Map<String, String> f38683q;

    /* renamed from: r */
    public Bundle f38684r = null;

    /* renamed from: s */
    public AdPreferences f38685s;

    /* renamed from: t */
    public CacheKey f38686t;

    /* renamed from: u */
    public boolean f38687u;

    /* renamed from: v */
    public boolean f38688v = false;

    /* renamed from: w */
    public boolean f38689w = false;

    /* renamed from: x */
    public boolean f38690x = false;

    /* renamed from: y */
    public boolean f38691y = false;

    /* renamed from: z */
    public C9440d f38692z = null;

    /* compiled from: Sta */
    public enum InitState {
        UNSET,
        IMPLICIT,
        EXPLICIT
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$a */
    /* compiled from: Sta */
    public class C9392a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f38697a;

        /* renamed from: b */
        public final /* synthetic */ String f38698b;

        /* renamed from: c */
        public final /* synthetic */ String f38699c;

        /* renamed from: d */
        public final /* synthetic */ SDKAdPreferences f38700d;

        /* renamed from: e */
        public final /* synthetic */ boolean f38701e;

        public C9392a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
            this.f38697a = context;
            this.f38698b = str;
            this.f38699c = str2;
            this.f38700d = sDKAdPreferences;
            this.f38701e = z;
        }

        public void run() {
            synchronized (StartAppSDKInternal.f38662D) {
                StartAppSDKInternal.m49729a(StartAppSDKInternal.this, this.f38697a, this.f38698b, this.f38699c, this.f38700d, this.f38701e);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$c */
    /* compiled from: Sta */
    public class C9394c implements C9410d.C9414d {
        public C9394c() {
        }

        /* renamed from: a */
        public void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z) {
            StartAppSDKInternal.this.f38686t = cacheKey;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$d */
    /* compiled from: Sta */
    public static class C9395d {

        /* renamed from: a */
        public static final StartAppSDKInternal f38707a = new StartAppSDKInternal();
    }

    public StartAppSDKInternal() {
        Map<Activity, Integer> map = C9605vb.f39316a;
    }

    /* renamed from: a */
    public static void m49729a(StartAppSDKInternal startAppSDKInternal, Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        startAppSDKInternal.getClass();
        C9432b a = ComponentLocator.m50248a(context).f39028H.mo29904a();
        InitState initState = f38663E;
        InitState initState2 = InitState.EXPLICIT;
        if (initState != initState2) {
            boolean a2 = ComponentLocator.m50248a(context).mo31167c().mo29287a();
            if (TextUtils.isEmpty(str2)) {
                if (C9605vb.m50480f(context) || C8837b0.m48309c(context)) {
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
            }
            C8898d0 c = ComponentLocator.m50248a(context).mo31167c();
            if (str != null) {
                str = str.trim();
            }
            if (str2 != null) {
                str2 = str2.trim();
            }
            synchronized (c.f36662a) {
                c.f36664c = str;
                c.f36665d = str2;
                c.f36663b.edit().putString("c88d4eab540fab77", str).putString("2696a7f502faed4b", str2).commit();
            }
            startAppSDKInternal.f38667a = sDKAdPreferences;
            C9673z2.m50596b(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
            startAppSDKInternal.mo30557a(z);
            if (f38663E == InitState.IMPLICIT && !a2) {
                startAppSDKInternal.mo30561b(context, MetaDataRequest.RequestReason.LAUNCH);
            } else if (f38663E == InitState.UNSET) {
                startAppSDKInternal.mo30555a(context, MetaDataRequest.RequestReason.LAUNCH);
            }
            f38663E = initState2;
        }
    }

    /* renamed from: c */
    public static boolean m49731c() {
        boolean z;
        synchronized (f38662D) {
            z = f38663E == InitState.EXPLICIT;
        }
        return z;
    }

    /* renamed from: h */
    public static void m49732h(Context context) {
        if (context != null) {
            m49730a(false, (C9620w7) null);
        }
    }

    /* renamed from: b */
    public boolean mo30562b() {
        return this.f38682p;
    }

    /* renamed from: d */
    public final void mo30564d(Context context) {
        Application application;
        if (Build.VERSION.SDK_INT >= 14) {
            Context a = C9058k0.m48718a(context);
            if (a instanceof Application) {
                application = (Application) a;
            } else if (context instanceof Application) {
                application = (Application) context;
            } else if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else {
                application = context instanceof Service ? ((Service) context).getApplication() : null;
            }
            if (application != null && this.f38664A == null) {
                C8992h0 h0Var = new C8992h0(this);
                this.f38664A = h0Var;
                application.registerActivityLifecycleCallbacks(h0Var);
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ComponentLocator.m50248a(context).mo31183s().f36625e;
                    if (activityLifecycleCallbacks != null) {
                        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                        return;
                    }
                    throw new RuntimeException();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo30566e(Context context) {
        C9441e j = ComponentLocator.m50248a(context).mo31174j();
        if (j.contains("isma")) {
            if (j.getBoolean("isma", false)) {
                if (!j.contains("iscd") || j.getBoolean("iscd", false)) {
                    return false;
                }
                return true;
            } else if (!j.contains("iscd") || !j.getBoolean("iscd", false)) {
                return true;
            } else {
                return false;
            }
        } else if (j.contains("iscd")) {
            return !j.getBoolean("iscd", false);
        } else {
            return true;
        }
    }

    /* renamed from: f */
    public final void mo30567f(Context context) {
        if (this.f38687u && !AdsCommonMetaData.f38625h.mo30449K()) {
            C9410d dVar = C9410d.f38788h;
            AdPreferences adPreferences = this.f38685s;
            AdPreferences adPreferences2 = adPreferences != null ? new AdPreferences(adPreferences) : new AdPreferences();
            C9394c cVar = new C9394c();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (dVar.mo30701a(placement)) {
                dVar.mo30698a(context, (StartAppAd) null, placement, adPreferences2, cVar, false, 0);
            } else {
                cVar.mo30269a((C9381Ad) null, (CacheKey) null, false);
            }
        }
    }

    /* renamed from: g */
    public final void mo30568g(Context context) {
        if (C8837b0.m48303a() && (context instanceof Application)) {
            Application application = (Application) context;
            this.f38674h = application;
            if (this.f38677k.compareAndSet(false, true) && this.f38676j == null) {
                C9445g gVar = new C9445g();
                application.registerActivityLifecycleCallbacks(gVar);
                this.f38676j = gVar;
            }
        }
    }

    /* renamed from: i */
    public final void mo30569i(Context context) {
        C9441e d = ComponentLocator.m50248a(context).mo31168d();
        int i = d.getInt("shared_prefs_app_version_id", -1);
        int i2 = C8837b0.f36438a;
        int i3 = 0;
        try {
            i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
        }
        if (i > 0 && i3 > i) {
            this.f38682p = true;
        }
        C9441e.C9442a a = d.edit();
        a.mo30812a("shared_prefs_app_version_id", Integer.valueOf(i3));
        a.f38873a.putInt("shared_prefs_app_version_id", i3);
        a.apply();
    }

    /* renamed from: j */
    public final void mo30570j(Context context) {
        ComponentLocator a = ComponentLocator.m50248a(context);
        C9441e.C9442a a2 = a.mo31168d().edit();
        Boolean bool = Boolean.FALSE;
        a2.mo30812a("periodicInfoEventPaused", bool);
        a2.f38873a.putBoolean("periodicInfoEventPaused", false);
        a2.mo30812a("periodicMetadataPaused", bool);
        a2.f38873a.putBoolean("periodicMetadataPaused", false);
        a2.apply();
        C9393b bVar = new C9393b(context, a);
        if (MetaData.f38952k.f38955b) {
            bVar.mo29320a((MetaDataRequest.RequestReason) null, false);
        } else {
            MetaData.f38952k.mo31016a((C9450c) bVar);
        }
    }

    /* renamed from: b */
    public void mo30561b(Context context, MetaDataRequest.RequestReason requestReason) {
        C9584u9.f39253d.mo31309a(context, requestReason);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        if (r0.isEmpty() == false) goto L_0x00f0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30560b(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            r1 = 1
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00c9 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "android.intent.action.VIEW"
            java.lang.String r7 = "http://www.example.com"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x00c9 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r6 = r4.resolveActivity(r5, r3)     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x0021
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = r6.packageName     // Catch:{ all -> 0x00c9 }
            goto L_0x0022
        L_0x0021:
            r6 = r2
        L_0x0022:
            java.util.List r7 = r4.queryIntentActivities(r5, r3)     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00c9 }
            r8.<init>()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x002f:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x00c9 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            r10.<init>()     // Catch:{ all -> 0x00c9 }
            r10.setAction(r0)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ActivityInfo r11 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r11.packageName     // Catch:{ all -> 0x00c9 }
            r10.setPackage(r11)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r10 = r4.resolveService(r10, r3)     // Catch:{ all -> 0x00c9 }
            if (r10 == 0) goto L_0x002f
            android.content.pm.ActivityInfo r9 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r9 = r9.packageName     // Catch:{ all -> 0x00c9 }
            r8.add(r9)     // Catch:{ all -> 0x00c9 }
            goto L_0x002f
        L_0x0058:
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x0060
            goto L_0x00cd
        L_0x0060:
            int r4 = r8.size()     // Catch:{ all -> 0x00c9 }
            java.lang.String r7 = "com.android.chrome"
            if (r4 != r1) goto L_0x0070
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00c9 }
            r2 = r4
            goto L_0x00cd
        L_0x0070:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 != 0) goto L_0x00c1
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00b2 }
            r9 = 64
            java.util.List r4 = r4.queryIntentActivities(r5, r9)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x00b6
            int r5 = r4.size()     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0089
            goto L_0x00b6
        L_0x0089:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x008d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00b6
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b2 }
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5     // Catch:{ all -> 0x00b2 }
            android.content.IntentFilter r9 = r5.filter     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x009e
            goto L_0x008d
        L_0x009e:
            int r10 = r9.countDataAuthorities()     // Catch:{ all -> 0x00b2 }
            if (r10 == 0) goto L_0x008d
            int r9 = r9.countDataPaths()     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x00ab
            goto L_0x008d
        L_0x00ab:
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00b0
            goto L_0x008d
        L_0x00b0:
            r4 = 1
            goto L_0x00b7
        L_0x00b2:
            r4 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00c9 }
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            if (r4 != 0) goto L_0x00c1
            boolean r4 = r8.contains(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00c1
            r2 = r6
            goto L_0x00cd
        L_0x00c1:
            boolean r4 = r8.contains(r7)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00cd
            r2 = r7
            goto L_0x00cd
        L_0x00c9:
            r4 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 18
            if (r4 < r5) goto L_0x00ef
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ef
        L_0x00d6:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r2)
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            java.util.List r0 = r0.queryIntentServices(r4, r3)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            com.startapp.sdk.components.ComponentLocator r13 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r13)
            com.startapp.sdk.adsbase.e r13 = r13.mo31168d()
            com.startapp.sdk.adsbase.e$a r13 = r13.edit()
            java.lang.String r0 = "chromeTabs"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r13.mo30812a((java.lang.String) r0, r2)
            android.content.SharedPreferences$Editor r2 = r13.f38873a
            r2.putBoolean(r0, r1)
            r13.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.mo30560b(android.content.Context):void");
    }

    /* renamed from: c */
    public SDKAdPreferences mo30563c(Context context) {
        if (this.f38667a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) C9673z2.m50588a(context, "shared_prefs_sdk_ad_prefs", SDKAdPreferences.class);
            if (sDKAdPreferences == null) {
                this.f38667a = new SDKAdPreferences();
            } else {
                this.f38667a = sDKAdPreferences;
            }
        }
        return this.f38667a;
    }

    /* renamed from: d */
    public boolean mo30565d() {
        return this.f38680n;
    }

    /* renamed from: a */
    public void mo30556a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        Context a = C9058k0.m48718a(context);
        Context context2 = a != null ? a : context;
        mo30568g(context2);
        try {
            ComponentLocator.m50248a(context2).mo31183s().mo29264a(256);
        } catch (Throwable unused) {
        }
        ComponentLocator.m50248a(context2).mo31171g().execute(new C9392a(context2, str, str2, sDKAdPreferences, z));
    }

    /* renamed from: a */
    public static StartAppSDKInternal m49727a() {
        return C9395d.f38707a;
    }

    /* renamed from: a */
    public static void m49728a(Context context) {
        MetaDataRequest.RequestReason requestReason;
        ComponentLocator a = ComponentLocator.m50248a(context);
        C9432b a2 = a.f39028H.mo29904a();
        C9667ye x = a.mo31188x();
        ((C9522y) x.f39453a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        x.f39456d = elapsedRealtime;
        x.f39457e = elapsedRealtime;
        C8980g6 g6Var = new C8980g6(context);
        if (!(g6Var.f36849d == null && g6Var.f36850e == null)) {
            C9441e.C9442a a3 = a.mo31174j().edit();
            Boolean bool = g6Var.f36849d;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                a3.mo30812a("isma", Boolean.valueOf(booleanValue));
                a3.f38873a.putBoolean("isma", booleanValue);
            }
            Boolean bool2 = g6Var.f36850e;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                a3.mo30812a("iscd", Boolean.valueOf(booleanValue2));
                a3.f38873a.putBoolean("iscd", booleanValue2);
            }
            a3.apply();
        }
        String str = g6Var.f36846a;
        if (!TextUtils.isEmpty(str)) {
            C9395d.f38707a.mo30556a(context, (String) null, str, (SDKAdPreferences) null, g6Var.f36847b);
            if (!g6Var.f36848c) {
                StartAppAd.disableSplash();
            }
            if (a.mo31168d().getBoolean("shared_prefs_first_init", true)) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "ManifestInit";
                i4Var.mo29471a();
            }
        } else if (f38663E == InitState.UNSET) {
            f38663E = InitState.IMPLICIT;
            C8898d0 c = a.mo31167c();
            StartAppSDKInternal startAppSDKInternal = C9395d.f38707a;
            if (c.mo29287a()) {
                requestReason = MetaDataRequest.RequestReason.LAUNCH;
            } else {
                requestReason = MetaDataRequest.RequestReason.IMPLICIT_LAUNCH;
            }
            startAppSDKInternal.mo30555a(context, requestReason);
        }
    }

    /* renamed from: a */
    public final void mo30555a(Context context, MetaDataRequest.RequestReason requestReason) {
        ComponentLocator a;
        if (Math.random() < 0.0d) {
            Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:4.10.8");
        }
        try {
            a = ComponentLocator.m50248a(context);
            C9545t a2 = a.f39026F.mo29904a();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof C9545t)) {
                Thread.setDefaultUncaughtExceptionHandler(a2);
                a2.f39168a = defaultUncaughtExceptionHandler;
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return;
        }
        a.mo31177m().mo29782a();
        if (!C8837b0.m48304a(context, "android.permission.INTERNET") || !C8837b0.m48304a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            C9605vb.m50457a(context, 6, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.", true);
        }
        this.f38680n = !C9605vb.m50476d(context);
        a.mo31165a().mo31158a(mo30566e(context));
        C9396a.m49784a((Runnable) new C9120ld(a.mo31187w()));
        mo30564d(context);
        MetaData.m50089c(context);
        Map<Activity, Integer> map = C9605vb.f39316a;
        AdsCommonMetaData.m49634a(context);
        BannerMetaData.m49279a(context);
        SplashMetaData.m49438a(context);
        if (this.f38668b) {
            CacheMetaData.m49870a(context);
        }
        AdInformationMetaData.m49808a(context);
        SimpleTokenUtils.m49712c(context);
        MetaData.f38952k.mo31016a((C9450c) a.mo31170f());
        if (Build.VERSION.SDK_INT >= 9) {
            C8964g2.f36801a = new CookieManager(new C8929e8(context), CookiePolicy.ACCEPT_ALL);
        }
        mo30569i(context);
        mo30561b(context, requestReason);
        mo30560b(context);
        mo30570j(context);
        C9605vb.m50457a(context, 4, "StartApp SDK initialized", true);
    }

    /* renamed from: a */
    public static void m49730a(boolean z, C9620w7 w7Var) {
        C9023i4 i4Var = new C9023i4(C9043j4.f37000k);
        i4Var.f36958j = z;
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.f39020L.f39542a;
            if (componentLocator != null) {
                componentLocator.mo31177m().mo29787a(i4Var, (C9147n4) null);
            } else if (w7Var != null) {
                w7Var.mo29232a(Boolean.FALSE);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo30558a(Activity activity) {
        return this.f38691y || activity.getClass().getName().equals(C9605vb.m50474c((Context) activity));
    }

    /* renamed from: a */
    public boolean mo30559a(String str) {
        String str2;
        Map<String, String> map = this.f38683q;
        if (map == null) {
            str2 = null;
        } else {
            str2 = map.get(str);
        }
        return str2 != null;
    }

    /* renamed from: a */
    public void mo30557a(boolean z) {
        if (!z || !C8837b0.m48303a()) {
            this.f38687u = false;
            C9410d.f38788h.mo30703b(AdPreferences.Placement.INAPP_RETURN);
            return;
        }
        this.f38687u = true;
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$b */
    /* compiled from: Sta */
    public class C9393b implements C9450c {

        /* renamed from: a */
        public final /* synthetic */ Context f38703a;

        /* renamed from: b */
        public final /* synthetic */ ComponentLocator f38704b;

        public C9393b(Context context, ComponentLocator componentLocator) {
            this.f38703a = context;
            this.f38704b = componentLocator;
        }

        /* JADX WARNING: Removed duplicated region for block: B:147:0x047c  */
        /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29320a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r19, boolean r20) {
            /*
                r18 = this;
                r1 = r18
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r8 = r1.f38703a
                boolean r2 = r0.f38668b
                r9 = 0
                r10 = 1
                if (r2 != 0) goto L_0x000e
                goto L_0x0128
            L_0x000e:
                boolean r2 = r0.f38682p
                if (r2 != 0) goto L_0x005f
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f38782a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.mo30676a()
                boolean r2 = r2.mo30669f()
                if (r2 != 0) goto L_0x001f
                goto L_0x005f
            L_0x001f:
                boolean r2 = r0.f38669c
                if (r2 == 0) goto L_0x0078
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
                r2.getClass()
                android.content.Context r3 = com.startapp.C9058k0.m48718a(r8)
                if (r3 == 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = r8
            L_0x0030:
                r2.f38795g = r3
                boolean r4 = r2.f38791c
                if (r4 != 0) goto L_0x0044
                com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f38782a
                com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.mo30676a()
                boolean r4 = r4.mo30669f()
                if (r4 == 0) goto L_0x0044
                r4 = 1
                goto L_0x0045
            L_0x0044:
                r4 = 0
            L_0x0045:
                if (r4 == 0) goto L_0x0078
                r2.f38792d = r10
                com.startapp.sdk.adsbase.cache.a r4 = new com.startapp.sdk.adsbase.cache.a
                r4.<init>(r2, r3)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r3)
                java.util.concurrent.Executor r2 = r2.mo31173i()
                com.startapp.sdk.adsbase.cache.j r5 = new com.startapp.sdk.adsbase.cache.j
                r5.<init>(r3, r4)
                r2.execute(r5)
                goto L_0x0078
            L_0x005f:
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
                r2.f38791c = r10
                com.startapp.sdk.adsbase.cache.b r3 = new com.startapp.sdk.adsbase.cache.b
                r3.<init>(r2)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r8)
                java.util.concurrent.Executor r2 = r2.mo31173i()
                com.startapp.sdk.adsbase.cache.i r4 = new com.startapp.sdk.adsbase.cache.i
                r4.<init>(r8, r3)
                r2.execute(r4)
            L_0x0078:
                r0.mo30567f(r8)
                if (r20 == 0) goto L_0x0128
                com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
                r0.getClass()
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f38782a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.mo30676a()
                if (r2 == 0) goto L_0x0128
                java.util.Set r2 = r2.mo30664b()
                if (r2 == 0) goto L_0x009e
                int r3 = r2.size()
                if (r3 <= 0) goto L_0x009e
                boolean r3 = com.startapp.sdk.adsbase.cache.CacheMetaData.m49873d()
                if (r3 == 0) goto L_0x009e
                r3 = 1
                goto L_0x009f
            L_0x009e:
                r3 = 0
            L_0x009f:
                if (r3 == 0) goto L_0x0128
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r8)
                com.startapp.sdk.adsbase.e r11 = r3.mo31168d()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                int r12 = r3.mo30997M()
                com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
                int r13 = r3.mo30465i()
                java.util.Iterator r14 = r2.iterator()
            L_0x00b9:
                boolean r2 = r14.hasNext()
                if (r2 == 0) goto L_0x0128
                java.lang.Object r2 = r14.next()
                r5 = r2
                com.startapp.sdk.adsbase.StartAppAd$AdMode r5 = (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5
                if (r5 != 0) goto L_0x00c9
                goto L_0x00b9
            L_0x00c9:
                java.lang.String r15 = com.startapp.sdk.adsbase.cache.C9410d.m49893a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r5)
                int r7 = r11.getInt(r15, r9)
                if (r7 < r12) goto L_0x00d4
                goto L_0x00b9
            L_0x00d4:
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
                if (r5 != r6) goto L_0x00f2
                if (r13 <= 0) goto L_0x00ef
                com.startapp.sdk.adsbase.model.AdPreferences r16 = new com.startapp.sdk.adsbase.model.AdPreferences
                r16.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r16
                r16 = r7
                r7 = r17
                r2.mo30696a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.C9410d.C9414d) r7)
                goto L_0x011a
            L_0x00ef:
                r16 = r7
                goto L_0x011a
            L_0x00f2:
                r16 = r7
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
                if (r5 != r6) goto L_0x010e
                r2 = 100
                if (r13 >= r2) goto L_0x011a
                com.startapp.sdk.adsbase.model.AdPreferences r7 = new com.startapp.sdk.adsbase.model.AdPreferences
                r7.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r7
                r7 = r17
                r2.mo30696a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.C9410d.C9414d) r7)
                goto L_0x011a
            L_0x010e:
                com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
                r6.<init>()
                r4 = 0
                r7 = 0
                r2 = r0
                r3 = r8
                r2.mo30696a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.C9410d.C9414d) r7)
            L_0x011a:
                com.startapp.sdk.adsbase.e$a r2 = r11.edit()
                int r7 = r16 + 1
                com.startapp.sdk.adsbase.e$a r2 = r2.mo30809a((java.lang.String) r15, (int) r7)
                r2.apply()
                goto L_0x00b9
            L_0x0128:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.s5<com.startapp.k1> r0 = r0.f39050r
                java.lang.Object r0 = r0.mo29904a()
                com.startapp.k1 r0 = (com.startapp.C9059k1) r0
                r0.mo29091e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.s5<com.startapp.q9> r0 = r0.f39051s
                java.lang.Object r0 = r0.mo29904a()
                com.startapp.q9 r0 = (com.startapp.C9245q9) r0
                r0.mo29091e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.qa r0 = r0.mo31185u()
                r0.mo29091e()
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f38703a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)
                com.startapp.m5 r0 = r0.mo31178n()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                boolean r2 = r2.mo31008X()
                r3 = 60000(0xea60, double:2.9644E-319)
                if (r2 == 0) goto L_0x018c
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                int r2 = r2.mo30987C()
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r7 = com.startapp.sdk.adsbase.remoteconfig.C9451d.class
                r2.<init>(r7)
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.f39148d = r5
                com.startapp.sdk.jobs.JobRequest$Network r5 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f39135b = r5
                com.startapp.sdk.jobs.e r5 = new com.startapp.sdk.jobs.e
                r5.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r5
                r0.mo29688a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x0199
            L_0x018c:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r5 = com.startapp.sdk.adsbase.remoteconfig.C9451d.class
                r2[r9] = r5
                int r2 = com.startapp.sdk.jobs.JobRequest.m50297a((java.lang.Class<? extends com.startapp.sdk.jobs.C9529b>[]) r2)
                r0.mo29687a((int) r2)
            L_0x0199:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f38703a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)
                com.startapp.m5 r0 = r0.mo31178n()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                boolean r5 = r5.mo31007W()
                if (r5 == 0) goto L_0x01d7
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                int r2 = r5.mo31018b(r2)
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.c8> r3 = com.startapp.C8884c8.class
                r2.<init>(r3)
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2.f39148d = r3
                com.startapp.sdk.jobs.JobRequest$Network r3 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f39135b = r3
                com.startapp.sdk.jobs.e r3 = new com.startapp.sdk.jobs.e
                r3.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r3
                r0.mo29688a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x01e4
            L_0x01d7:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.c8> r3 = com.startapp.C8884c8.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.m50297a((java.lang.Class<? extends com.startapp.sdk.jobs.C9529b>[]) r2)
                r0.mo29687a((int) r2)
            L_0x01e4:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f38703a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)
                com.startapp.m5 r0 = r0.mo31178n()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                boolean r4 = r3.mo31007W()
                if (r4 == 0) goto L_0x022c
                boolean r4 = r3.mo31006V()
                if (r4 == 0) goto L_0x022c
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                int r2 = r3.mo31011a((android.content.Context) r2)
                long r2 = (long) r2
                long r2 = r4.toMillis(r2)
                com.startapp.sdk.jobs.e$a r4 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.b8> r5 = com.startapp.C8859b8.class
                r4.<init>(r5)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4.f39148d = r2
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r4.f39135b = r2
                r4.f39136c = r10
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e
                r2.<init>(r4)
                com.startapp.sdk.jobs.JobRequest[] r3 = new com.startapp.sdk.jobs.JobRequest[r10]
                r3[r9] = r2
                r0.mo29688a((com.startapp.sdk.jobs.JobRequest[]) r3)
                goto L_0x0239
            L_0x022c:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.b8> r3 = com.startapp.C8859b8.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.m50297a((java.lang.Class<? extends com.startapp.sdk.jobs.C9529b>[]) r2)
                r0.mo29687a((int) r2)
            L_0x0239:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f38703a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)
                com.startapp.sdk.adsbase.e r4 = r3.mo31168d()
                java.lang.String r5 = "shared_prefs_first_init"
                boolean r5 = r4.getBoolean(r5, r10)
                if (r5 != 0) goto L_0x0251
                goto L_0x0284
            L_0x0251:
                com.startapp.sdk.adsbase.e$a r5 = r4.edit()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                java.lang.String r7 = "totalSessions"
                r5.mo30812a((java.lang.String) r7, r6)
                android.content.SharedPreferences$Editor r6 = r5.f38873a
                r6.putInt(r7, r9)
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                java.lang.String r11 = "firstSessionTime"
                r5.mo30812a((java.lang.String) r11, r8)
                android.content.SharedPreferences$Editor r8 = r5.f38873a
                r8.putLong(r11, r6)
                r5.apply()
                java.util.concurrent.Executor r5 = r3.mo31181q()
                com.startapp.sdk.adsbase.f r6 = new com.startapp.sdk.adsbase.f
                r6.<init>(r0, r2, r3, r4)
                r5.execute(r6)
            L_0x0284:
                android.content.Context r0 = r1.f38703a
                com.startapp.sdk.adsbase.StartAppSDKInternal.m49732h(r0)
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                r0.getClass()
                android.content.Context r0 = r1.f38703a
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r0)
                com.startapp.e2 r2 = r2.mo31170f()
                boolean r2 = r2.mo29324c()
                if (r2 == 0) goto L_0x037f
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                com.startapp.sdk.insight.NetworkTestsMetaData r2 = r2.mo30985A()
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 14
                if (r3 >= r4) goto L_0x02ac
                goto L_0x037f
            L_0x02ac:
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r0)
                com.startapp.m5 r3 = r3.mo31178n()
                java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
                boolean r4 = com.startapp.C8837b0.m48304a((android.content.Context) r0, (java.lang.String) r4)
                if (r4 != 0) goto L_0x02c7
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                boolean r4 = com.startapp.C8837b0.m48304a((android.content.Context) r0, (java.lang.String) r4)
                if (r4 == 0) goto L_0x02c5
                goto L_0x02c7
            L_0x02c5:
                r4 = 0
                goto L_0x02c8
            L_0x02c7:
                r4 = 1
            L_0x02c8:
                if (r2 == 0) goto L_0x036c
                boolean r5 = r2.mo31214n()
                if (r5 == 0) goto L_0x036c
                if (r4 != 0) goto L_0x02d4
                goto L_0x036c
            L_0x02d4:
                double r4 = java.lang.Math.random()
                double r6 = r2.mo31210j()
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x02e8
                com.startapp.m7 r4 = new com.startapp.m7
                r4.<init>()
                com.startapp.C9632x2.m50509a((com.startapp.C9632x2.C9633a) r4)
            L_0x02e8:
                boolean r4 = r2.mo31215o()     // Catch:{ all -> 0x0367 }
                com.startapp.sdk.cachedservice.BackgroundService.m50238a(r0, r4)     // Catch:{ all -> 0x0367 }
                com.startapp.networkTest.startapp.NetworkTester$Config r4 = new com.startapp.networkTest.startapp.NetworkTester$Config     // Catch:{ all -> 0x0367 }
                r4.<init>()     // Catch:{ all -> 0x0367 }
                java.lang.String r5 = r2.mo31211k()     // Catch:{ all -> 0x0367 }
                r4.PROJECT_ID = r5     // Catch:{ all -> 0x0367 }
                java.lang.String r5 = r2.mo31201c()     // Catch:{ all -> 0x0367 }
                r4.CONNECTIVITY_TEST_HOSTNAME = r5     // Catch:{ all -> 0x0367 }
                java.lang.String r5 = r2.mo31200b()     // Catch:{ all -> 0x0367 }
                r4.CONNECTIVITY_TEST_FILENAME = r5     // Catch:{ all -> 0x0367 }
                boolean r5 = r2.mo31212l()     // Catch:{ all -> 0x0367 }
                r4.CONNECTIVITY_TEST_ENABLED = r5     // Catch:{ all -> 0x0367 }
                boolean r5 = r2.mo31216p()     // Catch:{ all -> 0x0367 }
                r4.NIR_COLLECT_CELLINFO = r5     // Catch:{ all -> 0x0367 }
                boolean r5 = r2.mo31213m()     // Catch:{ all -> 0x0367 }
                r4.CT_COLLECT_CELLINFO = r5     // Catch:{ all -> 0x0367 }
                java.lang.String r5 = r2.mo31199a()     // Catch:{ all -> 0x0367 }
                r4.CONNECTIVITY_TEST_CDNCONFIG_URL = r5     // Catch:{ all -> 0x0367 }
                java.lang.String r5 = r2.mo31203e()     // Catch:{ all -> 0x0367 }
                r4.GEOIP_URL = r5     // Catch:{ all -> 0x0367 }
                android.content.Context r5 = com.startapp.C9058k0.m48718a(r0)     // Catch:{ all -> 0x0367 }
                if (r5 == 0) goto L_0x032b
                goto L_0x032c
            L_0x032b:
                r5 = r0
            L_0x032c:
                com.startapp.l7 r6 = new com.startapp.l7     // Catch:{ all -> 0x0367 }
                r6.<init>(r5)     // Catch:{ all -> 0x0367 }
                com.startapp.networkTest.startapp.NetworkTester.init(r0, r4)     // Catch:{ all -> 0x0367 }
                com.startapp.networkTest.startapp.NetworkTester.setOnConnectivityLatencyListener(r6)     // Catch:{ all -> 0x0367 }
                com.startapp.networkTest.startapp.NetworkTester.setOnNetworkInfoListener(r6)     // Catch:{ all -> 0x0367 }
                long r4 = r2.mo31202d()     // Catch:{ all -> 0x0367 }
                long r6 = r2.mo31205f()     // Catch:{ all -> 0x0367 }
                com.startapp.networkTest.startapp.NetworkTester.startListening(r4, r6)     // Catch:{ all -> 0x0367 }
                com.startapp.sdk.jobs.e$a r0 = new com.startapp.sdk.jobs.e$a     // Catch:{ all -> 0x0367 }
                java.lang.Class<com.startapp.n7> r4 = com.startapp.C9150n7.class
                r0.<init>(r4)     // Catch:{ all -> 0x0367 }
                long r4 = r2.mo31202d()     // Catch:{ all -> 0x0367 }
                java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0367 }
                r0.f39148d = r2     // Catch:{ all -> 0x0367 }
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY     // Catch:{ all -> 0x0367 }
                r0.f39135b = r2     // Catch:{ all -> 0x0367 }
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e     // Catch:{ all -> 0x0367 }
                r2.<init>(r0)     // Catch:{ all -> 0x0367 }
                com.startapp.sdk.jobs.JobRequest[] r0 = new com.startapp.sdk.jobs.JobRequest[r10]     // Catch:{ all -> 0x0367 }
                r0[r9] = r2     // Catch:{ all -> 0x0367 }
                r3.mo29688a((com.startapp.sdk.jobs.JobRequest[]) r0)     // Catch:{ all -> 0x0367 }
                goto L_0x037f
            L_0x0367:
                r0 = move-exception
                com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
                goto L_0x037f
            L_0x036c:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.n7> r4 = com.startapp.C9150n7.class
                r2[r9] = r4
                int r2 = com.startapp.sdk.jobs.JobRequest.m50297a((java.lang.Class<? extends com.startapp.sdk.jobs.C9529b>[]) r2)
                r3.mo29687a((int) r2)
                com.startapp.networkTest.startapp.NetworkTester.stopListening()
                com.startapp.sdk.cachedservice.BackgroundService.m50238a(r0, r9)
            L_0x037f:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f38703a
                com.startapp.kb r3 = r0.f38665B
                if (r3 == 0) goto L_0x0388
                goto L_0x0399
            L_0x0388:
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)
                com.startapp.s5<com.startapp.kb> r2 = r2.f39044l
                java.lang.Object r2 = r2.mo29904a()
                com.startapp.kb r2 = (com.startapp.C9090kb) r2
                r0.f38665B = r2
                r2.mo29619b()
            L_0x0399:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.c9 r0 = r0.mo31183s()
                boolean r2 = r0.mo29273b()     // Catch:{ all -> 0x03b1 }
                if (r2 == 0) goto L_0x03a6
                goto L_0x03b5
            L_0x03a6:
                java.util.concurrent.Executor r2 = r0.f36622b     // Catch:{ all -> 0x03b1 }
                com.startapp.d9 r3 = new com.startapp.d9     // Catch:{ all -> 0x03b1 }
                r3.<init>(r0)     // Catch:{ all -> 0x03b1 }
                r2.execute(r3)     // Catch:{ all -> 0x03b1 }
                goto L_0x03b5
            L_0x03b1:
                r0 = move-exception
                com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
            L_0x03b5:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.y8 r0 = r0.mo31182r()
                java.util.List r2 = r0.mo31494a()
                r3 = 1024(0x400, float:1.435E-42)
                boolean r0 = r0.mo31496a((int) r3)
                if (r0 == 0) goto L_0x03f0
                com.startapp.i4 r0 = new com.startapp.i4
                com.startapp.j4 r3 = com.startapp.C9043j4.f36993d
                r0.<init>((com.startapp.C9043j4) r3)
                java.lang.String r3 = "RSC init"
                r0.f36952d = r3
                java.lang.String r3 = "targets: "
                java.lang.StringBuilder r3 = com.startapp.C8870c1.m48422a(r3)
                if (r2 == 0) goto L_0x03e3
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x03e4
            L_0x03e3:
                r2 = 0
            L_0x03e4:
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.f36953e = r2
                r0.mo29471a()
            L_0x03f0:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.j6 r0 = r0.mo31180p()
                com.startapp.sdk.adsbase.remoteconfig.MotionMetadata r2 = r0.mo29510a()
                if (r2 == 0) goto L_0x040d
                double r3 = java.lang.Math.random()
                double r5 = r2.mo31069k()
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 >= 0) goto L_0x040a
                r2 = 1
                goto L_0x040b
            L_0x040a:
                r2 = 0
            L_0x040b:
                r0.f37017f = r2
            L_0x040d:
                android.os.Handler r2 = r0.f37015d
                com.startapp.k6 r3 = new com.startapp.k6
                r3.<init>(r0)
                r2.post(r3)
                com.startapp.sdk.components.ComponentLocator r0 = r1.f38704b
                com.startapp.y r0 = r0.mo31166b()
                if (r20 == 0) goto L_0x0421
                r2 = 1
                goto L_0x0422
            L_0x0421:
                r2 = 2
            L_0x0422:
                r0.mo31379a(r2)
                com.startapp.sdk.adsbase.remoteconfig.MetaData r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                java.lang.String r0 = r0.mo31041w()
                if (r0 == 0) goto L_0x04a0
                java.lang.String r2 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                java.lang.String r3 = "\\."
                java.lang.String[] r4 = r0.split(r3)
                java.lang.String[] r2 = r2.split(r3)
                int r3 = r4.length
                int r5 = r2.length
                int r3 = java.lang.Math.min(r3, r5)
                r5 = 0
            L_0x0442:
                if (r5 >= r3) goto L_0x046b
                r6 = r4[r5]     // Catch:{ NumberFormatException -> 0x0456 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0456 }
                r7 = r2[r5]     // Catch:{ NumberFormatException -> 0x0456 }
                int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0456 }
                if (r6 <= r7) goto L_0x0453
                goto L_0x0461
            L_0x0453:
                if (r6 >= r7) goto L_0x0468
                goto L_0x0465
            L_0x0456:
                r6 = r4[r5]
                r7 = r2[r5]
                int r6 = r6.compareTo(r7)
                if (r6 <= 0) goto L_0x0463
            L_0x0461:
                int r5 = r5 + r10
                goto L_0x047a
            L_0x0463:
                if (r6 >= 0) goto L_0x0468
            L_0x0465:
                int r5 = r5 + r10
                int r5 = -r5
                goto L_0x047a
            L_0x0468:
                int r5 = r5 + 1
                goto L_0x0442
            L_0x046b:
                int r5 = r4.length
                int r6 = r2.length
                if (r5 <= r6) goto L_0x0472
                int r5 = r3 + 1
                goto L_0x047a
            L_0x0472:
                int r4 = r4.length
                int r2 = r2.length
                if (r4 >= r2) goto L_0x0479
                int r3 = r3 + r10
                int r5 = -r3
                goto L_0x047a
            L_0x0479:
                r5 = 0
            L_0x047a:
                if (r5 <= 0) goto L_0x04a0
                android.content.Context r2 = r1.f38703a
                java.lang.String r3 = "Current SDK version ("
                java.lang.StringBuilder r3 = com.startapp.C8870c1.m48422a(r3)
                java.lang.String r4 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                r3.append(r4)
                java.lang.String r4 = ") is outdated. Integrate the most recent version ("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ") in order to improve your ads performance."
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 5
                com.startapp.C9605vb.m50457a((android.content.Context) r2, (int) r3, (java.lang.String) r0, (boolean) r9)
            L_0x04a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.C9393b.mo29320a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean):void");
        }

        /* renamed from: a */
        public void mo29319a(MetaDataRequest.RequestReason requestReason) {
            this.f38704b.mo31166b().mo31379a(0);
        }
    }
}
