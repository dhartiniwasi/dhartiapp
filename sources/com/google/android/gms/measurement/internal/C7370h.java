package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;
import p033d5.C4141r;
import p067i5.C4701o;
import p081k5.C4888c;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7370h extends C7321c5 {

    /* renamed from: b */
    private Boolean f32525b;

    /* renamed from: c */
    private C7359g f32526c = C7348f.f32459a;

    /* renamed from: d */
    private Boolean f32527d;

    C7370h(C7397j4 j4Var) {
        super(j4Var);
    }

    /* renamed from: I */
    public static final long m41497I() {
        return ((Long) C7516u2.f33046e.mo24669a((Object) null)).longValue();
    }

    /* renamed from: g */
    public static final long m41498g() {
        return ((Long) C7516u2.f33016E.mo24669a((Object) null)).longValue();
    }

    /* renamed from: h */
    private final String m41499h(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C4141r.m28221k(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f32389a.mo24135l().mo24256q().mo24209b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean mo24278A() {
        Boolean t = mo24295t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: B */
    public final boolean mo24279B(String str, C7505t2 t2Var) {
        if (str == null) {
            return ((Boolean) t2Var.mo24669a((Object) null)).booleanValue();
        }
        String c = this.f32526c.mo24226c(str, t2Var.mo24670b());
        if (TextUtils.isEmpty(c)) {
            return ((Boolean) t2Var.mo24669a((Object) null)).booleanValue();
        }
        return ((Boolean) t2Var.mo24669a(Boolean.valueOf("1".equals(c)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo24280C(String str) {
        return "1".equals(this.f32526c.mo24226c(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo24281D() {
        Boolean t = mo24295t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo24282E() {
        this.f32389a.mo24118b();
        Boolean t = mo24295t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo24283F(String str) {
        return "1".equals(this.f32526c.mo24226c(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo24284G() {
        if (this.f32525b == null) {
            Boolean t = mo24295t("app_measurement_lite");
            this.f32525b = t;
            if (t == null) {
                this.f32525b = Boolean.FALSE;
            }
        }
        return this.f32525b.booleanValue() || !this.f32389a.mo24440r();
    }

    /* renamed from: H */
    public final boolean mo24285H() {
        if (this.f32527d == null) {
            synchronized (this) {
                if (this.f32527d == null) {
                    ApplicationInfo applicationInfo = this.f32389a.mo24121d().getApplicationInfo();
                    String a = C4701o.m30423a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f32527d = Boolean.valueOf(z);
                    }
                    if (this.f32527d == null) {
                        this.f32527d = Boolean.TRUE;
                        this.f32389a.mo24135l().mo24256q().mo24208a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f32527d.booleanValue();
    }

    /* renamed from: i */
    public final double mo24286i(String str, C7505t2 t2Var) {
        if (str == null) {
            return ((Double) t2Var.mo24669a((Object) null)).doubleValue();
        }
        String c = this.f32526c.mo24226c(str, t2Var.mo24670b());
        if (TextUtils.isEmpty(c)) {
            return ((Double) t2Var.mo24669a((Object) null)).doubleValue();
        }
        try {
            return ((Double) t2Var.mo24669a(Double.valueOf(Double.parseDouble(c)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) t2Var.mo24669a((Object) null)).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo24287j(String str) {
        return mo24291o(str, C7516u2.f33020I, 500, AdError.SERVER_ERROR_CODE);
    }

    /* renamed from: k */
    public final int mo24288k() {
        C7391i9 N = this.f32389a.mo24423N();
        Boolean J = N.f32389a.mo24421L().mo24706J();
        if (N.mo24395o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: m */
    public final int mo24289m(String str) {
        return mo24291o(str, C7516u2.f33021J, 25, 100);
    }

    /* renamed from: n */
    public final int mo24290n(String str, C7505t2 t2Var) {
        if (str == null) {
            return ((Integer) t2Var.mo24669a((Object) null)).intValue();
        }
        String c = this.f32526c.mo24226c(str, t2Var.mo24670b());
        if (TextUtils.isEmpty(c)) {
            return ((Integer) t2Var.mo24669a((Object) null)).intValue();
        }
        try {
            return ((Integer) t2Var.mo24669a(Integer.valueOf(Integer.parseInt(c)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) t2Var.mo24669a((Object) null)).intValue();
        }
    }

    /* renamed from: o */
    public final int mo24291o(String str, C7505t2 t2Var, int i, int i2) {
        return Math.max(Math.min(mo24290n(str, t2Var), i2), i);
    }

    /* renamed from: p */
    public final long mo24292p() {
        this.f32389a.mo24118b();
        return 74029;
    }

    /* renamed from: q */
    public final long mo24293q(String str, C7505t2 t2Var) {
        if (str == null) {
            return ((Long) t2Var.mo24669a((Object) null)).longValue();
        }
        String c = this.f32526c.mo24226c(str, t2Var.mo24670b());
        if (TextUtils.isEmpty(c)) {
            return ((Long) t2Var.mo24669a((Object) null)).longValue();
        }
        try {
            return ((Long) t2Var.mo24669a(Long.valueOf(Long.parseLong(c)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) t2Var.mo24669a((Object) null)).longValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Bundle mo24294r() {
        try {
            if (this.f32389a.mo24121d().getPackageManager() == null) {
                this.f32389a.mo24135l().mo24256q().mo24208a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C4888c.m31075a(this.f32389a.mo24121d()).mo18670c(this.f32389a.mo24121d().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f32389a.mo24135l().mo24256q().mo24208a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean mo24295t(String str) {
        C4141r.m28217g(str);
        Bundle r = mo24294r();
        if (r == null) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!r.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(r.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo24296u() {
        return m41499h("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo24297v() {
        return m41499h("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo24298w() {
        this.f32389a.mo24118b();
        return "FA";
    }

    /* renamed from: x */
    public final String mo24299x(String str, C7505t2 t2Var) {
        if (str == null) {
            return (String) t2Var.mo24669a((Object) null);
        }
        return (String) t2Var.mo24669a(this.f32526c.mo24226c(str, t2Var.mo24670b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo24300y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p033d5.C4141r.m28217g(r4)
            android.os.Bundle r0 = r3.mo24294r()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24256q()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo24208a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.j4 r0 = r3.f32389a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo24121d()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.j4 r0 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo24209b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7370h.mo24300y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo24301z(C7359g gVar) {
        this.f32526c = gVar;
    }
}
