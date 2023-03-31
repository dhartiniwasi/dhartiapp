package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C6908c7;
import com.google.android.gms.internal.measurement.C7083n1;
import com.google.android.gms.internal.measurement.C7286zc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p067i5.C4691e;
import p067i5.C4694h;
import p081k5.C4888c;
import p402y5.C13018a;
import p402y5.C13020b;
import p402y5.C13036n;
import p402y5.C13044v;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7397j4 implements C7343e5 {

    /* renamed from: H */
    private static volatile C7397j4 f32607H;

    /* renamed from: A */
    private volatile Boolean f32608A;

    /* renamed from: B */
    protected Boolean f32609B;

    /* renamed from: C */
    protected Boolean f32610C;

    /* renamed from: D */
    private volatile boolean f32611D;

    /* renamed from: E */
    private int f32612E;

    /* renamed from: F */
    private final AtomicInteger f32613F = new AtomicInteger(0);

    /* renamed from: G */
    final long f32614G;

    /* renamed from: a */
    private final Context f32615a;

    /* renamed from: b */
    private final String f32616b;

    /* renamed from: c */
    private final String f32617c;

    /* renamed from: d */
    private final String f32618d;

    /* renamed from: e */
    private final boolean f32619e;

    /* renamed from: f */
    private final C7315c f32620f;

    /* renamed from: g */
    private final C7370h f32621g;

    /* renamed from: h */
    private final C7495s3 f32622h;

    /* renamed from: i */
    private final C7352f3 f32623i;

    /* renamed from: j */
    private final C7375h4 f32624j;

    /* renamed from: k */
    private final C7423l8 f32625k;

    /* renamed from: l */
    private final C7391i9 f32626l;

    /* renamed from: m */
    private final C7297a3 f32627m;

    /* renamed from: n */
    private final C4691e f32628n;

    /* renamed from: o */
    private final C7531v6 f32629o;

    /* renamed from: p */
    private final C7388i6 f32630p;

    /* renamed from: q */
    private final C7296a2 f32631q;

    /* renamed from: r */
    private final C7432m6 f32632r;

    /* renamed from: s */
    private final String f32633s;

    /* renamed from: t */
    private C7567z2 f32634t;

    /* renamed from: u */
    private C7532v7 f32635u;

    /* renamed from: v */
    private C7458p f32636v;

    /* renamed from: w */
    private C7537w2 f32637w;

    /* renamed from: x */
    private boolean f32638x = false;

    /* renamed from: y */
    private Boolean f32639y;

    /* renamed from: z */
    private long f32640z;

    C7397j4(C7365g5 g5Var) {
        long j;
        Bundle bundle;
        boolean z = false;
        C4141r.m28221k(g5Var);
        Context context = g5Var.f32505a;
        C7315c cVar = new C7315c(context);
        this.f32620f = cVar;
        C7494s2.f32943a = cVar;
        this.f32615a = context;
        this.f32616b = g5Var.f32506b;
        this.f32617c = g5Var.f32507c;
        this.f32618d = g5Var.f32508d;
        this.f32619e = g5Var.f32512h;
        this.f32608A = g5Var.f32509e;
        this.f32633s = g5Var.f32514j;
        this.f32611D = true;
        C7083n1 n1Var = g5Var.f32511g;
        if (!(n1Var == null || (bundle = n1Var.f31906g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f32609B = (Boolean) obj;
            }
            Object obj2 = n1Var.f31906g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f32610C = (Boolean) obj2;
            }
        }
        C6908c7.m39871e(context);
        C4691e d = C4694h.m30388d();
        this.f32628n = d;
        Long l = g5Var.f32513i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = d.mo18370a();
        }
        this.f32614G = j;
        this.f32621g = new C7370h(this);
        C7495s3 s3Var = new C7495s3(this);
        s3Var.mo24237j();
        this.f32622h = s3Var;
        C7352f3 f3Var = new C7352f3(this);
        f3Var.mo24237j();
        this.f32623i = f3Var;
        C7391i9 i9Var = new C7391i9(this);
        i9Var.mo24237j();
        this.f32626l = i9Var;
        this.f32627m = new C7297a3(new C7354f5(g5Var, this));
        this.f32631q = new C7296a2(this);
        C7531v6 v6Var = new C7531v6(this);
        v6Var.mo24742h();
        this.f32629o = v6Var;
        C7388i6 i6Var = new C7388i6(this);
        i6Var.mo24742h();
        this.f32630p = i6Var;
        C7423l8 l8Var = new C7423l8(this);
        l8Var.mo24742h();
        this.f32625k = l8Var;
        C7432m6 m6Var = new C7432m6(this);
        m6Var.mo24237j();
        this.f32632r = m6Var;
        C7375h4 h4Var = new C7375h4(this);
        h4Var.mo24237j();
        this.f32624j = h4Var;
        C7083n1 n1Var2 = g5Var.f32511g;
        z = (n1Var2 == null || n1Var2.f31901b == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C7388i6 I = mo24418I();
            if (I.f32389a.f32615a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f32389a.f32615a.getApplicationContext();
                if (I.f32564c == null) {
                    I.f32564c = new C7377h6(I, (C13044v) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f32564c);
                    application.registerActivityLifecycleCallbacks(I.f32564c);
                    I.f32389a.mo24135l().mo24260v().mo24208a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo24135l().mo24261w().mo24208a("Application context is not an Application");
        }
        h4Var.mo24309z(new C7386i4(this, g5Var));
    }

    /* renamed from: H */
    public static C7397j4 m41654H(Context context, C7083n1 n1Var, Long l) {
        Bundle bundle;
        if (n1Var != null && (n1Var.f31904e == null || n1Var.f31905f == null)) {
            n1Var = new C7083n1(n1Var.f31900a, n1Var.f31901b, n1Var.f31902c, n1Var.f31903d, (String) null, (String) null, n1Var.f31906g, (String) null);
        }
        C4141r.m28221k(context);
        C4141r.m28221k(context.getApplicationContext());
        if (f32607H == null) {
            synchronized (C7397j4.class) {
                if (f32607H == null) {
                    f32607H = new C7397j4(new C7365g5(context, n1Var, l));
                }
            }
        } else if (!(n1Var == null || (bundle = n1Var.f31906g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C4141r.m28221k(f32607H);
            f32607H.f32608A = Boolean.valueOf(n1Var.f31906g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C4141r.m28221k(f32607H);
        return f32607H;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m41655c(C7397j4 j4Var, C7365g5 g5Var) {
        j4Var.mo24143s().mo24189f();
        j4Var.f32621g.mo24298w();
        C7458p pVar = new C7458p(j4Var);
        pVar.mo24237j();
        j4Var.f32636v = pVar;
        C7537w2 w2Var = new C7537w2(j4Var, g5Var.f32510f);
        w2Var.mo24742h();
        j4Var.f32637w = w2Var;
        C7567z2 z2Var = new C7567z2(j4Var);
        z2Var.mo24742h();
        j4Var.f32634t = z2Var;
        C7532v7 v7Var = new C7532v7(j4Var);
        v7Var.mo24742h();
        j4Var.f32635u = v7Var;
        j4Var.f32626l.mo24238k();
        j4Var.f32622h.mo24238k();
        j4Var.f32637w.mo24743i();
        C7330d3 u = j4Var.mo24135l().mo24259u();
        j4Var.f32621g.mo24292p();
        u.mo24209b("App measurement initialized, version", 74029L);
        j4Var.mo24135l().mo24259u().mo24208a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String r = w2Var.mo24736r();
        if (TextUtils.isEmpty(j4Var.f32616b)) {
            if (j4Var.mo24423N().mo24383T(r)) {
                j4Var.mo24135l().mo24259u().mo24208a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                j4Var.mo24135l().mo24259u().mo24208a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(r)));
            }
        }
        j4Var.mo24135l().mo24255p().mo24208a("Debug-level message logging enabled");
        if (j4Var.f32612E != j4Var.f32613F.get()) {
            j4Var.mo24135l().mo24256q().mo24210c("Not all components initialized", Integer.valueOf(j4Var.f32612E), Integer.valueOf(j4Var.f32613F.get()));
        }
        j4Var.f32638x = true;
    }

    /* renamed from: t */
    static final void m41656t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m41657u(C7321c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m41658v(C7538w3 w3Var) {
        if (w3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!w3Var.mo24744k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(w3Var.getClass())));
        }
    }

    /* renamed from: w */
    private static final void m41659w(C7332d5 d5Var) {
        if (d5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!d5Var.mo24239m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d5Var.getClass())));
        }
    }

    /* renamed from: A */
    public final C7458p mo24411A() {
        m41659w(this.f32636v);
        return this.f32636v;
    }

    /* renamed from: B */
    public final C7537w2 mo24412B() {
        m41658v(this.f32637w);
        return this.f32637w;
    }

    /* renamed from: C */
    public final C7567z2 mo24413C() {
        m41658v(this.f32634t);
        return this.f32634t;
    }

    /* renamed from: D */
    public final C7297a3 mo24414D() {
        return this.f32627m;
    }

    /* renamed from: E */
    public final C7352f3 mo24415E() {
        C7352f3 f3Var = this.f32623i;
        if (f3Var == null || !f3Var.mo24239m()) {
            return null;
        }
        return f3Var;
    }

    /* renamed from: F */
    public final C7495s3 mo24416F() {
        m41657u(this.f32622h);
        return this.f32622h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final C7375h4 mo24417G() {
        return this.f32624j;
    }

    /* renamed from: I */
    public final C7388i6 mo24418I() {
        m41658v(this.f32630p);
        return this.f32630p;
    }

    /* renamed from: J */
    public final C7432m6 mo24419J() {
        m41659w(this.f32632r);
        return this.f32632r;
    }

    /* renamed from: K */
    public final C7531v6 mo24420K() {
        m41658v(this.f32629o);
        return this.f32629o;
    }

    /* renamed from: L */
    public final C7532v7 mo24421L() {
        m41658v(this.f32635u);
        return this.f32635u;
    }

    /* renamed from: M */
    public final C7423l8 mo24422M() {
        m41658v(this.f32625k);
        return this.f32625k;
    }

    /* renamed from: N */
    public final C7391i9 mo24423N() {
        m41657u(this.f32626l);
        return this.f32626l;
    }

    /* renamed from: O */
    public final String mo24424O() {
        return this.f32616b;
    }

    /* renamed from: P */
    public final String mo24425P() {
        return this.f32617c;
    }

    /* renamed from: Q */
    public final String mo24426Q() {
        return this.f32618d;
    }

    /* renamed from: R */
    public final String mo24427R() {
        return this.f32633s;
    }

    /* renamed from: a */
    public final C4691e mo24116a() {
        return this.f32628n;
    }

    /* renamed from: b */
    public final C7315c mo24118b() {
        return this.f32620f;
    }

    /* renamed from: d */
    public final Context mo24121d() {
        return this.f32615a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo24428e() {
        this.f32613F.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo24429f(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo24135l().mo24261w().mo24210c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo24416F().f32961s.mo24581a(true);
            if (bArr == null || bArr.length == 0) {
                mo24135l().mo24255p().mo24208a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo24135l().mo24255p().mo24208a("Deferred Deep Link is empty.");
                    return;
                }
                C7391i9 N = mo24423N();
                C7397j4 j4Var = N.f32389a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f32389a.f32615a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f32630p.mo24356u("auto", "_cmp", bundle);
                        C7391i9 N2 = mo24423N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f32389a.f32615a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f32389a.f32615a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f32389a.mo24135l().mo24256q().mo24209b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo24135l().mo24261w().mo24210c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo24135l().mo24256q().mo24209b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo24135l().mo24261w().mo24210c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo24430g() {
        this.f32612E++;
    }

    /* renamed from: h */
    public final void mo24431h() {
        mo24143s().mo24189f();
        m41659w(mo24419J());
        String r = mo24412B().mo24736r();
        Pair o = mo24416F().mo24643o(r);
        if (!this.f32621g.mo24278A() || ((Boolean) o.second).booleanValue() || TextUtils.isEmpty((CharSequence) o.first)) {
            mo24135l().mo24255p().mo24208a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C7432m6 J = mo24419J();
        J.mo24236i();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f32389a.f32615a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo24135l().mo24261w().mo24208a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C7391i9 N = mo24423N();
        mo24412B().f32389a.f32621g.mo24292p();
        URL r2 = N.mo24399r(74029, r, (String) o.first, mo24416F().f32962t.mo24604a() - 1);
        if (r2 != null) {
            C7432m6 J2 = mo24419J();
            C13036n nVar = new C13036n(this);
            J2.mo24189f();
            J2.mo24236i();
            C4141r.m28221k(r2);
            C4141r.m28221k(nVar);
            J2.f32389a.mo24143s().mo24308y(new C7421l6(J2, r, r2, (byte[]) null, (Map) null, nVar, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo24432i(boolean z) {
        this.f32608A = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public final void mo24433j(boolean z) {
        mo24143s().mo24189f();
        this.f32611D = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo24434k(C7083n1 n1Var) {
        C13020b bVar;
        mo24143s().mo24189f();
        C13020b p = mo24416F().mo24644p();
        C7495s3 F = mo24416F();
        C7397j4 j4Var = F.f32389a;
        F.mo24189f();
        int i = 100;
        int i2 = F.mo24642n().getInt("consent_source", 100);
        C7370h hVar = this.f32621g;
        C7397j4 j4Var2 = hVar.f32389a;
        Boolean t = hVar.mo24295t("google_analytics_default_allow_ad_storage");
        C7370h hVar2 = this.f32621g;
        C7397j4 j4Var3 = hVar2.f32389a;
        Boolean t2 = hVar2.mo24295t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo24416F().mo24650w(-10)) {
            bVar = new C13020b(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo24412B().mo24737t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo24418I().mo24329G(C13020b.f47279b, -10, this.f32614G);
            } else if (TextUtils.isEmpty(mo24412B().mo24737t()) && n1Var != null && n1Var.f31906g != null && mo24416F().mo24650w(30)) {
                bVar = C13020b.m61313a(n1Var.f31906g);
                if (!bVar.equals(C13020b.f47279b)) {
                    i = 30;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            mo24418I().mo24329G(bVar, i, this.f32614G);
            p = bVar;
        }
        mo24418I().mo24332J(p);
        if (mo24416F().f32947e.mo24604a() == 0) {
            mo24135l().mo24260v().mo24209b("Persisting first open", Long.valueOf(this.f32614G));
            mo24416F().f32947e.mo24605b(this.f32614G);
        }
        mo24418I().f32575n.mo24612c();
        if (mo24439q()) {
            if (!TextUtils.isEmpty(mo24412B().mo24737t()) || !TextUtils.isEmpty(mo24412B().mo24735q())) {
                C7391i9 N = mo24423N();
                String t3 = mo24412B().mo24737t();
                C7495s3 F2 = mo24416F();
                F2.mo24189f();
                String string = F2.mo24642n().getString("gmp_app_id", (String) null);
                String q = mo24412B().mo24735q();
                C7495s3 F3 = mo24416F();
                F3.mo24189f();
                if (N.mo24386b0(t3, string, q, F3.mo24642n().getString("admob_app_id", (String) null))) {
                    mo24135l().mo24259u().mo24208a("Rechecking which service to use due to a GMP App Id change");
                    C7495s3 F4 = mo24416F();
                    F4.mo24189f();
                    Boolean q2 = F4.mo24645q();
                    SharedPreferences.Editor edit = F4.mo24642n().edit();
                    edit.clear();
                    edit.apply();
                    if (q2 != null) {
                        F4.mo24646r(q2);
                    }
                    mo24413C().mo24770p();
                    this.f32635u.mo24709Q();
                    this.f32635u.mo24708P();
                    mo24416F().f32947e.mo24605b(this.f32614G);
                    mo24416F().f32949g.mo24632b((String) null);
                }
                C7495s3 F5 = mo24416F();
                String t4 = mo24412B().mo24737t();
                F5.mo24189f();
                SharedPreferences.Editor edit2 = F5.mo24642n().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                C7495s3 F6 = mo24416F();
                String q3 = mo24412B().mo24735q();
                F6.mo24189f();
                SharedPreferences.Editor edit3 = F6.mo24642n().edit();
                edit3.putString("admob_app_id", q3);
                edit3.apply();
            }
            if (!mo24416F().mo24644p().mo38074i(C13018a.ANALYTICS_STORAGE)) {
                mo24416F().f32949g.mo24632b((String) null);
            }
            mo24418I().mo24325C(mo24416F().f32949g.mo24631a());
            C7286zc.m41210b();
            if (this.f32621g.mo24279B((String) null, C7516u2.f33047e0)) {
                try {
                    mo24423N().f32389a.f32615a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo24416F().f32963u.mo24631a())) {
                        mo24135l().mo24261w().mo24208a("Remote config removed with active feature rollouts");
                        mo24416F().f32963u.mo24632b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo24412B().mo24737t()) || !TextUtils.isEmpty(mo24412B().mo24735q())) {
                boolean n = mo24436n();
                if (!mo24416F().mo24648u() && !this.f32621g.mo24282E()) {
                    mo24416F().mo24647t(!n);
                }
                if (n) {
                    mo24418I().mo24348f0();
                }
                mo24422M().f32705d.mo24462a();
                mo24421L().mo24711S(new AtomicReference());
                mo24421L().mo24723v(mo24416F().f32966x.mo24590a());
            }
        } else if (mo24436n()) {
            if (!mo24423N().mo24382S("android.permission.INTERNET")) {
                mo24135l().mo24256q().mo24208a("App is missing INTERNET permission");
            }
            if (!mo24423N().mo24382S("android.permission.ACCESS_NETWORK_STATE")) {
                mo24135l().mo24256q().mo24208a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C4888c.m31075a(this.f32615a).mo18674g() && !this.f32621g.mo24284G()) {
                if (!C7391i9.m41593Y(this.f32615a)) {
                    mo24135l().mo24256q().mo24208a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C7391i9.m41594Z(this.f32615a, false)) {
                    mo24135l().mo24256q().mo24208a("AppMeasurementService not registered/enabled");
                }
            }
            mo24135l().mo24256q().mo24208a("Uploading is not possible. App measurement disabled");
        }
        mo24416F().f32956n.mo24581a(true);
    }

    /* renamed from: l */
    public final C7352f3 mo24135l() {
        m41659w(this.f32623i);
        return this.f32623i;
    }

    /* renamed from: m */
    public final boolean mo24435m() {
        return this.f32608A != null && this.f32608A.booleanValue();
    }

    /* renamed from: n */
    public final boolean mo24436n() {
        return mo24441x() == 0;
    }

    /* renamed from: o */
    public final boolean mo24437o() {
        mo24143s().mo24189f();
        return this.f32611D;
    }

    /* renamed from: p */
    public final boolean mo24438p() {
        return TextUtils.isEmpty(this.f32616b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo24439q() {
        if (this.f32638x) {
            mo24143s().mo24189f();
            Boolean bool = this.f32639y;
            if (bool == null || this.f32640z == 0 || (!bool.booleanValue() && Math.abs(this.f32628n.mo18371b() - this.f32640z) > 1000)) {
                this.f32640z = this.f32628n.mo18371b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo24423N().mo24382S("android.permission.INTERNET") && mo24423N().mo24382S("android.permission.ACCESS_NETWORK_STATE") && (C4888c.m31075a(this.f32615a).mo18674g() || this.f32621g.mo24284G() || (C7391i9.m41593Y(this.f32615a) && C7391i9.m41594Z(this.f32615a, false))));
                this.f32639y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo24423N().mo24375L(mo24412B().mo24737t(), mo24412B().mo24735q()) && TextUtils.isEmpty(mo24412B().mo24735q())) {
                        z = false;
                    }
                    this.f32639y = Boolean.valueOf(z);
                }
            }
            return this.f32639y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: r */
    public final boolean mo24440r() {
        return this.f32619e;
    }

    /* renamed from: s */
    public final C7375h4 mo24143s() {
        m41659w(this.f32624j);
        return this.f32624j;
    }

    /* renamed from: x */
    public final int mo24441x() {
        mo24143s().mo24189f();
        if (this.f32621g.mo24282E()) {
            return 1;
        }
        Boolean bool = this.f32610C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo24143s().mo24189f();
        if (!this.f32611D) {
            return 8;
        }
        Boolean q = mo24416F().mo24645q();
        if (q == null) {
            C7370h hVar = this.f32621g;
            C7315c cVar = hVar.f32389a.f32620f;
            Boolean t = hVar.mo24295t("firebase_analytics_collection_enabled");
            if (t == null) {
                Boolean bool2 = this.f32609B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f32608A == null || this.f32608A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (q.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: y */
    public final C7296a2 mo24442y() {
        C7296a2 a2Var = this.f32631q;
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: z */
    public final C7370h mo24443z() {
        return this.f32621g;
    }
}
