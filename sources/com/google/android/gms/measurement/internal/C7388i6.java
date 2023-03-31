package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C7016ie;
import com.google.android.gms.internal.measurement.C7031jd;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4141r;
import p124r.C5413a;
import p402y5.C13018a;
import p402y5.C13020b;
import p402y5.C13038p;
import p402y5.C13041s;
import p402y5.C13042t;
import p402y5.C13043u;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7388i6 extends C7538w3 {

    /* renamed from: c */
    protected C7377h6 f32564c;

    /* renamed from: d */
    private C13042t f32565d;

    /* renamed from: e */
    private final Set f32566e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f32567f;

    /* renamed from: g */
    private final AtomicReference f32568g = new AtomicReference();

    /* renamed from: h */
    private final Object f32569h = new Object();

    /* renamed from: i */
    private C13020b f32570i = new C13020b((Boolean) null, (Boolean) null);

    /* renamed from: j */
    private int f32571j = 100;

    /* renamed from: k */
    private final AtomicLong f32572k = new AtomicLong(0);

    /* renamed from: l */
    private long f32573l = -1;

    /* renamed from: m */
    private int f32574m = 100;

    /* renamed from: n */
    final C7468p9 f32575n;

    /* renamed from: o */
    protected boolean f32576o = true;

    /* renamed from: p */
    private final C7380h9 f32577p = new C7550x5(this);

    protected C7388i6(C7397j4 j4Var) {
        super(j4Var);
        this.f32575n = new C7468p9(j4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m41546O(Boolean bool, boolean z) {
        mo24189f();
        mo24741g();
        this.f32389a.mo24135l().mo24255p().mo24209b("Setting app measurement enabled (FE)", bool);
        this.f32389a.mo24416F().mo24646r(bool);
        if (z) {
            C7495s3 F = this.f32389a.mo24416F();
            C7397j4 j4Var = F.f32389a;
            F.mo24189f();
            SharedPreferences.Editor edit = F.mo24642n().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f32389a.mo24437o() || (bool != null && !bool.booleanValue())) {
            m41547P();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m41547P() {
        mo24189f();
        String a = this.f32389a.mo24416F().f32955m.mo24631a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo24335M("app", "_npa", (Object) null, this.f32389a.mo24116a().mo18370a());
            } else {
                mo24335M("app", "_npa", Long.valueOf(true != "true".equals(a) ? 0 : 1), this.f32389a.mo24116a().mo18370a());
            }
        }
        if (!this.f32389a.mo24436n() || !this.f32576o) {
            this.f32389a.mo24135l().mo24255p().mo24208a("Updating Scion state (FE)");
            this.f32389a.mo24421L().mo24724w();
            return;
        }
        this.f32389a.mo24135l().mo24255p().mo24208a("Recording app launch after enabling measurement for the first time (FE)");
        mo24348f0();
        C7031jd.m40299b();
        if (this.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33049f0)) {
            this.f32389a.mo24422M().f32705d.mo24462a();
        }
        this.f32389a.mo24143s().mo24309z(new C7420l5(this));
    }

    /* renamed from: b0 */
    static /* bridge */ /* synthetic */ void m41548b0(C7388i6 i6Var, C13020b bVar, C13020b bVar2) {
        boolean z;
        C13018a[] aVarArr = {C13018a.ANALYTICS_STORAGE, C13018a.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            C13018a aVar = aVarArr[i];
            if (!bVar2.mo38074i(aVar) && bVar.mo38074i(aVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = bVar.mo38076l(bVar2, C13018a.ANALYTICS_STORAGE, C13018a.AD_STORAGE);
        if (z || l) {
            i6Var.f32389a.mo24412B().mo24739v();
        }
    }

    /* renamed from: c0 */
    static /* synthetic */ void m41549c0(C7388i6 i6Var, C13020b bVar, int i, long j, boolean z, boolean z2) {
        i6Var.mo24189f();
        i6Var.mo24741g();
        if (j > i6Var.f32573l || !C13020b.m61316j(i6Var.f32574m, i)) {
            C7495s3 F = i6Var.f32389a.mo24416F();
            C7397j4 j4Var = F.f32389a;
            F.mo24189f();
            if (F.mo24650w(i)) {
                SharedPreferences.Editor edit = F.mo24642n().edit();
                edit.putString("consent_settings", bVar.mo38072h());
                edit.putInt("consent_source", i);
                edit.apply();
                i6Var.f32573l = j;
                i6Var.f32574m = i;
                i6Var.f32389a.mo24421L().mo24721t(z);
                if (z2) {
                    i6Var.f32389a.mo24421L().mo24711S(new AtomicReference());
                    return;
                }
                return;
            }
            i6Var.f32389a.mo24135l().mo24259u().mo24209b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        i6Var.f32389a.mo24135l().mo24259u().mo24209b("Dropped out-of-date consent setting, proposed settings", bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo24323A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f32389a.mo24143s().mo24309z(new C7453o5(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo24324B(String str, String str2, long j, Object obj) {
        this.f32389a.mo24143s().mo24309z(new C7464p5(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo24325C(String str) {
        this.f32568g.set(str);
    }

    /* renamed from: D */
    public final void mo24326D(Bundle bundle) {
        mo24327E(bundle, this.f32389a.mo24116a().mo18370a());
    }

    /* renamed from: E */
    public final void mo24327E(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C4141r.m28221k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f32389a.mo24135l().mo24261w().mo24208a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C4141r.m28221k(bundle2);
        C13038p.m61352a(bundle2, "app_id", cls2, (Object) null);
        C13038p.m61352a(bundle2, "origin", cls2, (Object) null);
        C13038p.m61352a(bundle2, MediationMetaData.KEY_NAME, cls2, (Object) null);
        C13038p.m61352a(bundle2, "value", Object.class, (Object) null);
        C13038p.m61352a(bundle2, "trigger_event_name", cls2, (Object) null);
        C13038p.m61352a(bundle2, "trigger_timeout", cls, 0L);
        C13038p.m61352a(bundle2, "timed_out_event_name", cls2, (Object) null);
        C13038p.m61352a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C13038p.m61352a(bundle2, "triggered_event_name", cls2, (Object) null);
        C13038p.m61352a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C13038p.m61352a(bundle2, "time_to_live", cls, 0L);
        C13038p.m61352a(bundle2, "expired_event_name", cls2, (Object) null);
        C13038p.m61352a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        C4141r.m28217g(bundle2.getString(MediationMetaData.KEY_NAME));
        C4141r.m28217g(bundle2.getString("origin"));
        C4141r.m28221k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        if (this.f32389a.mo24423N().mo24393n0(string) != 0) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Invalid conditional user property name", this.f32389a.mo24414D().mo24097f(string));
        } else if (this.f32389a.mo24423N().mo24388j0(string, obj) == 0) {
            Object o = this.f32389a.mo24423N().mo24394o(string, obj);
            if (o == null) {
                this.f32389a.mo24135l().mo24256q().mo24210c("Unable to normalize conditional user property value", this.f32389a.mo24414D().mo24097f(string), obj);
                return;
            }
            C13038p.m61353b(bundle2, o);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f32389a.mo24443z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f32389a.mo24135l().mo24256q().mo24210c("Invalid conditional user property timeout", this.f32389a.mo24414D().mo24097f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f32389a.mo24443z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f32389a.mo24135l().mo24256q().mo24210c("Invalid conditional user property time to live", this.f32389a.mo24414D().mo24097f(string), Long.valueOf(j3));
            } else {
                this.f32389a.mo24143s().mo24309z(new C7486r5(this, bundle2));
            }
        } else {
            this.f32389a.mo24135l().mo24256q().mo24210c("Invalid conditional user property value", this.f32389a.mo24414D().mo24097f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo24328F(Bundle bundle, int i, long j) {
        mo24741g();
        String g = C13020b.m61315g(bundle);
        if (g != null) {
            this.f32389a.mo24135l().mo24262x().mo24209b("Ignoring invalid consent setting", g);
            this.f32389a.mo24135l().mo24262x().mo24208a("Valid consent values are 'granted', 'denied'");
        }
        mo24329G(C13020b.m61313a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo24329G(C13020b bVar, int i, long j) {
        C13020b bVar2;
        boolean z;
        boolean z2;
        boolean z3;
        C13020b bVar3 = bVar;
        int i2 = i;
        mo24741g();
        if (i2 != -10 && bVar.mo38069e() == null && bVar.mo38071f() == null) {
            this.f32389a.mo24135l().mo24262x().mo24208a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f32569h) {
            bVar2 = this.f32570i;
            z = true;
            z2 = false;
            if (C13020b.m61316j(i2, this.f32571j)) {
                boolean k = bVar3.mo38075k(this.f32570i);
                C13018a aVar = C13018a.ANALYTICS_STORAGE;
                if (bVar3.mo38074i(aVar) && !this.f32570i.mo38074i(aVar)) {
                    z2 = true;
                }
                bVar3 = bVar3.mo38068d(this.f32570i);
                this.f32570i = bVar3;
                this.f32571j = i2;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f32389a.mo24135l().mo24259u().mo24209b("Ignoring lower-priority consent settings, proposed settings", bVar3);
            return;
        }
        long andIncrement = this.f32572k.getAndIncrement();
        if (z2) {
            this.f32568g.set((Object) null);
            this.f32389a.mo24143s().mo24303A(new C7333d6(this, bVar3, j, i, andIncrement, z3, bVar2));
            return;
        }
        C7344e6 e6Var = new C7344e6(this, bVar3, i, andIncrement, z3, bVar2);
        if (i2 == 30 || i2 == -10) {
            this.f32389a.mo24143s().mo24303A(e6Var);
        } else {
            this.f32389a.mo24143s().mo24309z(e6Var);
        }
    }

    /* renamed from: H */
    public final void mo24330H(C13042t tVar) {
        C13042t tVar2;
        mo24189f();
        mo24741g();
        if (!(tVar == null || tVar == (tVar2 = this.f32565d))) {
            C4141r.m28225o(tVar2 == null, "EventInterceptor already set.");
        }
        this.f32565d = tVar;
    }

    /* renamed from: I */
    public final void mo24331I(Boolean bool) {
        mo24741g();
        this.f32389a.mo24143s().mo24309z(new C7322c6(this, bool));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo24332J(C13020b bVar) {
        mo24189f();
        boolean z = (bVar.mo38074i(C13018a.ANALYTICS_STORAGE) && bVar.mo38074i(C13018a.AD_STORAGE)) || this.f32389a.mo24421L().mo24704A();
        if (z != this.f32389a.mo24437o()) {
            this.f32389a.mo24433j(z);
            C7495s3 F = this.f32389a.mo24416F();
            C7397j4 j4Var = F.f32389a;
            F.mo24189f();
            Boolean valueOf = F.mo24642n().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo24642n().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m41546O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo24333K(String str, String str2, Object obj, boolean z) {
        mo24334L("auto", "_ldl", obj, true, this.f32389a.mo24116a().mo18370a());
    }

    /* renamed from: L */
    public final void mo24334L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.f32389a.mo24423N().mo24393n0(str3);
        } else {
            C7391i9 N = this.f32389a.mo24423N();
            if (N.mo24381R("user property", str3)) {
                if (!N.mo24377N("user property", C13041s.f47294a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    N.f32389a.mo24443z();
                    if (N.mo24376M("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            C7391i9 N2 = this.f32389a.mo24423N();
            this.f32389a.mo24443z();
            this.f32389a.mo24423N().mo24365B(this.f32577p, (String) null, i, "_ev", N2.mo24398q(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int j0 = this.f32389a.mo24423N().mo24388j0(str3, obj2);
            if (j0 != 0) {
                C7391i9 N3 = this.f32389a.mo24423N();
                this.f32389a.mo24443z();
                String q = N3.mo24398q(str3, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i2 = obj.toString().length();
                } else {
                    i2 = 0;
                }
                this.f32389a.mo24423N().mo24365B(this.f32577p, (String) null, j0, "_ev", q, i2);
                return;
            }
            Object o = this.f32389a.mo24423N().mo24394o(str3, obj2);
            if (o != null) {
                mo24324B(str4, str2, j, o);
            }
        } else {
            mo24324B(str4, str2, j, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24335M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p033d5.C4141r.m28217g(r9)
            p033d5.C4141r.m28217g(r10)
            r8.mo24189f()
            r8.mo24741g()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.j4 r10 = r8.f32389a
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo24416F()
            com.google.android.gms.measurement.internal.r3 r10 = r10.f32955m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo24632b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.j4 r10 = r8.f32389a
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo24416F()
            com.google.android.gms.measurement.internal.r3 r10 = r10.f32955m
            java.lang.String r0 = "unset"
            r10.mo24632b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.j4 r10 = r8.f32389a
            boolean r10 = r10.mo24436n()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.j4 r9 = r8.f32389a
            com.google.android.gms.measurement.internal.f3 r9 = r9.mo24135l()
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24260v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo24208a(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.j4 r10 = r8.f32389a
            boolean r10 = r10.mo24439q()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.d9 r10 = new com.google.android.gms.measurement.internal.d9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.j4 r9 = r8.f32389a
            com.google.android.gms.measurement.internal.v7 r9 = r9.mo24421L()
            r9.mo24726y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7388i6.mo24335M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo24336N(C13043u uVar) {
        mo24741g();
        C4141r.m28221k(uVar);
        if (!this.f32566e.remove(uVar)) {
            this.f32389a.mo24135l().mo24261w().mo24208a("OnEventListener had not been registered");
        }
    }

    /* renamed from: Q */
    public final int mo24337Q(String str) {
        C4141r.m28217g(str);
        this.f32389a.mo24443z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo24338R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f32389a.mo24143s().mo24305q(atomicReference, 15000, "boolean test flag value", new C7519u5(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo24339S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f32389a.mo24143s().mo24305q(atomicReference, 15000, "double test flag value", new C7311b6(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo24340T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f32389a.mo24143s().mo24305q(atomicReference, 15000, "int test flag value", new C7300a6(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo24341U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f32389a.mo24143s().mo24305q(atomicReference, 15000, "long test flag value", new C7570z5(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo24342V() {
        return (String) this.f32568g.get();
    }

    /* renamed from: W */
    public final String mo24343W() {
        C7454o6 q = this.f32389a.mo24420K().mo24699q();
        if (q != null) {
            return q.f32830b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo24344X() {
        C7454o6 q = this.f32389a.mo24420K().mo24699q();
        if (q != null) {
            return q.f32829a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo24345Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f32389a.mo24143s().mo24305q(atomicReference, 15000, "String test flag value", new C7560y5(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo24346Z(String str, String str2) {
        if (this.f32389a.mo24143s().mo24304C()) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f32389a.mo24118b();
        if (C7315c.m41378a()) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f32389a.mo24143s().mo24305q(atomicReference, 5000, "get conditional user properties", new C7508t5(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C7391i9.m41604v(list);
        }
        this.f32389a.mo24135l().mo24256q().mo24209b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final Map mo24347a0(String str, String str2, boolean z) {
        if (this.f32389a.mo24143s().mo24304C()) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f32389a.mo24118b();
        if (C7315c.m41378a()) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f32389a.mo24143s().mo24305q(atomicReference, 5000, "get user properties", new C7530v5(this, atomicReference, (String) null, str, str2, z));
        List<C7336d9> list = (List) atomicReference.get();
        if (list == null) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C5413a aVar = new C5413a(list.size());
        for (C7336d9 d9Var : list) {
            Object I1 = d9Var.mo24243I1();
            if (I1 != null) {
                aVar.put(d9Var.f32439b, I1);
            }
        }
        return aVar;
    }

    /* renamed from: f0 */
    public final void mo24348f0() {
        mo24189f();
        mo24741g();
        if (this.f32389a.mo24439q()) {
            if (this.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33037Z)) {
                C7370h z = this.f32389a.mo24443z();
                z.f32389a.mo24118b();
                Boolean t = z.mo24295t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f32389a.mo24135l().mo24255p().mo24208a("Deferred Deep Link feature enabled.");
                    this.f32389a.mo24143s().mo24309z(new C7409k5(this));
                }
            }
            this.f32389a.mo24421L().mo24707O();
            this.f32576o = false;
            C7495s3 F = this.f32389a.mo24416F();
            F.mo24189f();
            String string = F.mo24642n().getString("previous_os_version", (String) null);
            F.f32389a.mo24411A().mo24236i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo24642n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f32389a.mo24411A().mo24236i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo24356u("auto", "_ou", bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo24349m() {
        return false;
    }

    /* renamed from: n */
    public final void mo24350n(String str, String str2, Bundle bundle) {
        long a = this.f32389a.mo24116a().mo18370a();
        C4141r.m28217g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f32389a.mo24143s().mo24309z(new C7497s5(this, bundle2));
    }

    /* renamed from: o */
    public final void mo24351o() {
        if ((this.f32389a.mo24121d().getApplicationContext() instanceof Application) && this.f32564c != null) {
            ((Application) this.f32389a.mo24121d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f32564c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo24352p(Bundle bundle) {
        if (bundle == null) {
            this.f32389a.mo24416F().f32966x.mo24591b(new Bundle());
            return;
        }
        Bundle a = this.f32389a.mo24416F().f32966x.mo24590a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f32389a.mo24423N().mo24384U(obj)) {
                    this.f32389a.mo24423N().mo24365B(this.f32577p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f32389a.mo24135l().mo24262x().mo24210c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C7391i9.m41591W(str)) {
                this.f32389a.mo24135l().mo24262x().mo24209b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                C7391i9 N = this.f32389a.mo24423N();
                this.f32389a.mo24443z();
                if (N.mo24379P("param", str, 100, obj)) {
                    this.f32389a.mo24423N().mo24366C(a, str, obj);
                }
            }
        }
        this.f32389a.mo24423N();
        int k = this.f32389a.mo24443z().mo24288k();
        if (a.size() > k) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > k) {
                    a.remove(str2);
                }
            }
            this.f32389a.mo24423N().mo24365B(this.f32577p, (String) null, 26, (String) null, (String) null, 0);
            this.f32389a.mo24135l().mo24262x().mo24208a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f32389a.mo24416F().f32966x.mo24591b(a);
        this.f32389a.mo24421L().mo24723v(a);
    }

    /* renamed from: q */
    public final void mo24353q(String str, String str2, Bundle bundle) {
        mo24354r(str, str2, bundle, true, true, this.f32389a.mo24116a().mo18370a());
    }

    /* renamed from: r */
    public final void mo24354r(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            this.f32389a.mo24420K().mo24698E(bundle2, j);
        } else {
            mo24323A(str4, str2, j, bundle2, z2, !z2 || this.f32565d == null || C7391i9.m41591W(str2), z, (String) null);
        }
    }

    /* renamed from: t */
    public final void mo24355t(String str, String str2, Bundle bundle, String str3) {
        C7397j4.m41656t();
        mo24323A("auto", str2, this.f32389a.mo24116a().mo18370a(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo24356u(String str, String str2, Bundle bundle) {
        mo24189f();
        mo24357v(str, str2, this.f32389a.mo24116a().mo18370a(), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo24357v(String str, String str2, long j, Bundle bundle) {
        mo24189f();
        mo24358w(str, str2, j, bundle, true, this.f32565d == null || C7391i9.m41591W(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24358w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            p033d5.C4141r.m28217g(r20)
            p033d5.C4141r.m28221k(r24)
            r19.mo24189f()
            r19.mo24741g()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            boolean r1 = r1.mo24436n()
            if (r1 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.w2 r1 = r1.mo24412B()
            java.util.List r1 = r1.mo24738u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24255p()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo24210c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f32567f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f32567f = r15
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo24440r()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo24121d()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo24121d()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24261w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo24209b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24259u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo24208a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            r1.mo24118b()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            i5.e r0 = r0.mo24116a()
            long r5 = r0.mo18370a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo24335M(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            r0.mo24118b()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C7391i9.m41595a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo24423N()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.o3 r1 = r1.f32966x
            android.os.Bundle r1 = r1.mo24590a()
            r0.mo24409z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            r1.mo24118b()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo24381R(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = p402y5.C13039q.f47286a
            java.lang.String[] r5 = p402y5.C13039q.f47287b
            boolean r3 = r1.mo24377N(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a
            r3.mo24443z()
            boolean r1 = r1.mo24376M(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24257r()
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r2 = r2.mo24414D()
            java.lang.String r2 = r2.mo24095d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo24209b(r3, r2)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a
            r2.mo24443z()
            java.lang.String r0 = r1.mo24398q(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            com.google.android.gms.measurement.internal.h9 r2 = r7.f32577p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo24365B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            r1.mo24118b()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo24420K()
            com.google.android.gms.measurement.internal.o6 r1 = r1.mo24700r(r14)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0192
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0192
            r1.f32832d = r15
        L_0x0192:
            if (r25 == 0) goto L_0x0198
            if (r27 != 0) goto L_0x0198
            r3 = 1
            goto L_0x0199
        L_0x0198:
            r3 = 0
        L_0x0199:
            com.google.android.gms.measurement.internal.C7391i9.m41605y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C7391i9.m41591W(r21)
            if (r25 == 0) goto L_0x01e9
            y5.t r4 = r7.f32565d
            if (r4 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x01e9
            if (r1 == 0) goto L_0x01b3
            r16 = 1
            goto L_0x01eb
        L_0x01b3:
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24255p()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r1 = r1.mo24414D()
            java.lang.String r1 = r1.mo24095d(r9)
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r2 = r2.mo24414D()
            java.lang.String r2 = r2.mo24093b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo24210c(r3, r1, r2)
            y5.t r0 = r7.f32565d
            p033d5.C4141r.m28221k(r0)
            y5.t r1 = r7.f32565d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo24508a(r2, r3, r4, r5)
            return
        L_0x01e9:
            r16 = r1
        L_0x01eb:
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            boolean r1 = r1.mo24439q()
            if (r1 == 0) goto L_0x04f0
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            int r1 = r1.mo24389k0(r9)
            if (r1 == 0) goto L_0x0249
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24257r()
            com.google.android.gms.measurement.internal.j4 r3 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo24209b(r4, r3)
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r2 = r2.mo24423N()
            com.google.android.gms.measurement.internal.j4 r3 = r7.f32389a
            r3.mo24443z()
            java.lang.String r0 = r2.mo24398q(r9, r0, r15)
            if (r9 == 0) goto L_0x022d
            int r14 = r21.length()
        L_0x022d:
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r2 = r2.mo24423N()
            com.google.android.gms.measurement.internal.h9 r3 = r7.f32577p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo24365B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0249:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = p067i5.C4692f.m30380c(r1)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo24405v0(r2, r3, r4, r5, r6)
            p033d5.C4141r.m28221k(r12)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            r1.mo24118b()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo24420K()
            com.google.android.gms.measurement.internal.o6 r1 = r1.mo24700r(r14)
            java.lang.String r5 = "_ae"
            if (r1 == 0) goto L_0x02ae
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.l8 r1 = r1.mo24422M()
            com.google.android.gms.measurement.internal.j8 r1 = r1.f32706e
            com.google.android.gms.measurement.internal.l8 r2 = r1.f32653d
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            i5.e r2 = r2.mo24116a()
            long r14 = r2.mo18371b()
            long r3 = r1.f32651b
            long r2 = r14 - r3
            r1.f32651b = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            r1.mo24406w(r12, r2)
        L_0x02ae:
            com.google.android.gms.internal.measurement.C7286zc.m41210b()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.h r1 = r1.mo24443z()
            com.google.android.gms.measurement.internal.t2 r2 = com.google.android.gms.measurement.internal.C7516u2.f33047e0
            boolean r1 = r1.mo24279B(r13, r2)
            if (r1 == 0) goto L_0x0338
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0317
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0317
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = p067i5.C4703q.m30426b(r2)
            if (r3 == 0) goto L_0x02e3
            r2 = r13
            goto L_0x02e9
        L_0x02e3:
            if (r2 == 0) goto L_0x02e9
            java.lang.String r2 = r2.trim()
        L_0x02e9:
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo24416F()
            com.google.android.gms.measurement.internal.r3 r3 = r3.f32963u
            java.lang.String r3 = r3.mo24631a()
            boolean r3 = p402y5.C13023c0.m61327a(r2, r3)
            if (r3 != 0) goto L_0x0307
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.r3 r1 = r1.f32963u
            r1.mo24632b(r2)
            goto L_0x0338
        L_0x0307:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24255p()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo24208a(r1)
            return
        L_0x0317:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0338
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.r3 r1 = r1.f32963u
            java.lang.String r1 = r1.mo24631a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0338
            r12.putString(r2, r1)
        L_0x0338:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.p3 r1 = r1.f32957o
            long r1 = r1.mo24604a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            boolean r1 = r1.mo24649v(r10)
            if (r1 == 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.n3 r1 = r1.f32960r
            boolean r1 = r1.mo24582b()
            if (r1 == 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo24208a(r2)
            r6 = 0
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            i5.e r1 = r1.mo24116a()
            long r17 = r1.mo18370a()
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r19
            r24 = r14
            r13 = r3
            r3 = r15
            r4 = r6
            r15 = r5
            r5 = r17
            r1.mo24335M(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            i5.e r1 = r1.mo24116a()
            long r5 = r1.mo18370a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo24335M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            i5.e r1 = r1.mo24116a()
            long r5 = r1.mo18370a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo24335M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.p3 r1 = r1.f32958p
            r1.mo24605b(r13)
            goto L_0x03ce
        L_0x03ca:
            r15 = r5
            r24 = r14
            r13 = r3
        L_0x03ce:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03f5
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo24208a(r2)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.l8 r1 = r1.mo24422M()
            com.google.android.gms.measurement.internal.k8 r1 = r1.f32705d
            r2 = 1
            r1.mo24463b(r10, r2)
        L_0x03f5:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0406:
            if (r3 >= r2) goto L_0x0454
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0451
            com.google.android.gms.measurement.internal.j4 r5 = r7.f32389a
            r5.mo24423N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0426
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x044c
        L_0x0426:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0437
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044c
        L_0x0437:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x044b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044c
        L_0x044b:
            r13 = 0
        L_0x044c:
            if (r13 == 0) goto L_0x0451
            r12.putParcelableArray(r4, r13)
        L_0x0451:
            int r3 = r3 + 1
            goto L_0x0406
        L_0x0454:
            r12 = 0
        L_0x0455:
            int r1 = r24.size()
            if (r12 >= r1) goto L_0x04c2
            r13 = r24
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0468
            java.lang.String r2 = "_ep"
            goto L_0x0469
        L_0x0468:
            r2 = r9
        L_0x0469:
            r1.putString(r0, r8)
            if (r26 == 0) goto L_0x0478
            com.google.android.gms.measurement.internal.j4 r3 = r7.f32389a
            com.google.android.gms.measurement.internal.i9 r3 = r3.mo24423N()
            android.os.Bundle r1 = r3.mo24404u0(r1)
        L_0x0478:
            r14 = r1
            com.google.android.gms.measurement.internal.v r5 = new com.google.android.gms.measurement.internal.v
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t
            r3.<init>(r14)
            r1 = r5
            r4 = r20
            r25 = r0
            r0 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            com.google.android.gms.measurement.internal.v7 r1 = r1.mo24421L()
            r5 = r28
            r1.mo24716n(r0, r5)
            if (r16 != 0) goto L_0x04bb
            java.util.Set r0 = r7.f32566e
            java.util.Iterator r0 = r0.iterator()
        L_0x049e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04bb
            java.lang.Object r1 = r0.next()
            y5.u r1 = (p402y5.C13043u) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo24579a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x049e
        L_0x04bb:
            int r12 = r12 + 1
            r0 = r25
            r24 = r13
            goto L_0x0455
        L_0x04c2:
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            r0.mo24118b()
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.v6 r0 = r0.mo24420K()
            r1 = 0
            com.google.android.gms.measurement.internal.o6 r0 = r0.mo24700r(r1)
            if (r0 == 0) goto L_0x04f0
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x04f0
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.l8 r0 = r0.mo24422M()
            com.google.android.gms.measurement.internal.j4 r1 = r7.f32389a
            i5.e r1 = r1.mo24116a()
            long r1 = r1.mo18371b()
            com.google.android.gms.measurement.internal.j8 r0 = r0.f32706e
            r3 = 1
            r0.mo24450d(r3, r3, r1)
        L_0x04f0:
            return
        L_0x04f1:
            com.google.android.gms.measurement.internal.j4 r0 = r7.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24255p()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo24208a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7388i6.mo24358w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo24359x(C13043u uVar) {
        mo24741g();
        C4141r.m28221k(uVar);
        if (!this.f32566e.add(uVar)) {
            this.f32389a.mo24135l().mo24261w().mo24208a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo24360y(long j) {
        this.f32568g.set((Object) null);
        this.f32389a.mo24143s().mo24309z(new C7475q5(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo24361z(long j, boolean z) {
        mo24189f();
        mo24741g();
        this.f32389a.mo24135l().mo24255p().mo24208a("Resetting analytics data (FE)");
        C7423l8 M = this.f32389a.mo24422M();
        M.mo24189f();
        M.f32706e.mo24447a();
        C7016ie.m40214b();
        if (this.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33067o0)) {
            this.f32389a.mo24412B().mo24739v();
        }
        boolean n = this.f32389a.mo24436n();
        C7495s3 F = this.f32389a.mo24416F();
        F.f32947e.mo24605b(j);
        if (!TextUtils.isEmpty(F.f32389a.mo24416F().f32963u.mo24631a())) {
            F.f32963u.mo24632b((String) null);
        }
        C7031jd.m40299b();
        C7370h z2 = F.f32389a.mo24443z();
        C7505t2 t2Var = C7516u2.f33049f0;
        if (z2.mo24279B((String) null, t2Var)) {
            F.f32957o.mo24605b(0);
        }
        F.f32958p.mo24605b(0);
        if (!F.f32389a.mo24443z().mo24282E()) {
            F.mo24647t(!n);
        }
        F.f32964v.mo24632b((String) null);
        F.f32965w.mo24605b(0);
        F.f32966x.mo24591b((Bundle) null);
        if (z) {
            this.f32389a.mo24421L().mo24718p();
        }
        C7031jd.m40299b();
        if (this.f32389a.mo24443z().mo24279B((String) null, t2Var)) {
            this.f32389a.mo24422M().f32705d.mo24462a();
        }
        this.f32576o = !n;
    }
}
