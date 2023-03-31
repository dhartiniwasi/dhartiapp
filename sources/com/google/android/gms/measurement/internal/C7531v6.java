package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p033d5.C4141r;
import p402y5.C13047y;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7531v6 extends C7538w3 {

    /* renamed from: c */
    private volatile C7454o6 f33116c;

    /* renamed from: d */
    private volatile C7454o6 f33117d;

    /* renamed from: e */
    protected C7454o6 f33118e;

    /* renamed from: f */
    private final Map f33119f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f33120g;

    /* renamed from: h */
    private volatile boolean f33121h;

    /* renamed from: i */
    private volatile C7454o6 f33122i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7454o6 f33123j;

    /* renamed from: k */
    private boolean f33124k;

    /* renamed from: l */
    private final Object f33125l = new Object();

    public C7531v6(C7397j4 j4Var) {
        super(j4Var);
    }

    /* renamed from: F */
    private final C7454o6 m41956F(Activity activity) {
        C4141r.m28221k(activity);
        C7454o6 o6Var = (C7454o6) this.f33119f.get(activity);
        if (o6Var == null) {
            C7454o6 o6Var2 = new C7454o6((String) null, mo24701t(activity.getClass(), "Activity"), this.f32389a.mo24423N().mo24400r0());
            this.f33119f.put(activity, o6Var2);
            o6Var = o6Var2;
        }
        return this.f33122i != null ? this.f33122i : o6Var;
    }

    /* renamed from: G */
    private final void m41957G(Activity activity, C7454o6 o6Var, boolean z) {
        C7454o6 o6Var2;
        C7454o6 o6Var3;
        C7454o6 o6Var4 = o6Var;
        if (this.f33116c == null) {
            o6Var2 = this.f33117d;
        } else {
            o6Var2 = this.f33116c;
        }
        C7454o6 o6Var5 = o6Var2;
        if (o6Var4.f32830b == null) {
            o6Var3 = new C7454o6(o6Var4.f32829a, activity != null ? mo24701t(activity.getClass(), "Activity") : null, o6Var4.f32831c, o6Var4.f32833e, o6Var4.f32834f);
        } else {
            o6Var3 = o6Var4;
        }
        this.f33117d = this.f33116c;
        this.f33116c = o6Var3;
        this.f32389a.mo24143s().mo24309z(new C7476q6(this, o6Var3, o6Var5, this.f32389a.mo24116a().mo18371b(), z));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m41958n(C7454o6 o6Var, C7454o6 o6Var2, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        long j3;
        C7454o6 o6Var3 = o6Var;
        C7454o6 o6Var4 = o6Var2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo24189f();
        boolean z2 = false;
        boolean z3 = o6Var4 == null || o6Var4.f32831c != o6Var3.f32831c || !C13047y.m61373a(o6Var4.f32830b, o6Var3.f32830b) || !C13047y.m61373a(o6Var4.f32829a, o6Var3.f32829a);
        if (z && this.f33118e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C7391i9.m41605y(o6Var3, bundle4, true);
            if (o6Var4 != null) {
                String str = o6Var4.f32829a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = o6Var4.f32830b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", o6Var4.f32831c);
            }
            if (z2) {
                C7401j8 j8Var = this.f32389a.mo24422M().f32706e;
                long j5 = j4 - j8Var.f32651b;
                j8Var.f32651b = j4;
                if (j5 > 0) {
                    this.f32389a.mo24423N().mo24406w(bundle4, j5);
                }
            }
            if (!this.f32389a.mo24443z().mo24281D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != o6Var3.f32833e ? "auto" : "app";
            long a = this.f32389a.mo24116a().mo18370a();
            if (o6Var3.f32833e) {
                j3 = a;
                long j6 = o6Var3.f32834f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f32389a.mo24418I().mo24357v(str3, "_vs", j2, bundle4);
                }
            } else {
                j3 = a;
            }
            j2 = j3;
            this.f32389a.mo24418I().mo24357v(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            m41959o(this.f33118e, true, j4);
        }
        this.f33118e = o6Var3;
        if (o6Var3.f32833e) {
            this.f33123j = o6Var3;
        }
        this.f32389a.mo24421L().mo24722u(o6Var3);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m41959o(C7454o6 o6Var, boolean z, long j) {
        this.f32389a.mo24442y().mo24091m(this.f32389a.mo24116a().mo18371b());
        if (this.f32389a.mo24422M().f32706e.mo24450d(o6Var != null && o6Var.f32832d, z, j) && o6Var != null) {
            o6Var.f32832d = false;
        }
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m41963w(C7531v6 v6Var, Bundle bundle, C7454o6 o6Var, C7454o6 o6Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        v6Var.m41958n(o6Var, o6Var2, j, true, v6Var.f32389a.mo24423N().mo24405v0((String) null, "screen_view", bundle, (List) null, false));
    }

    /* renamed from: A */
    public final void mo24694A(Activity activity) {
        synchronized (this.f33125l) {
            this.f33124k = false;
            this.f33121h = true;
        }
        long b = this.f32389a.mo24116a().mo18371b();
        if (!this.f32389a.mo24443z().mo24281D()) {
            this.f33116c = null;
            this.f32389a.mo24143s().mo24309z(new C7498s6(this, b));
            return;
        }
        C7454o6 F = m41956F(activity);
        this.f33117d = this.f33116c;
        this.f33116c = null;
        this.f32389a.mo24143s().mo24309z(new C7509t6(this, F, b));
    }

    /* renamed from: B */
    public final void mo24695B(Activity activity) {
        synchronized (this.f33125l) {
            this.f33124k = true;
            if (activity != this.f33120g) {
                synchronized (this.f33125l) {
                    this.f33120g = activity;
                    this.f33121h = false;
                }
                if (this.f32389a.mo24443z().mo24281D()) {
                    this.f33122i = null;
                    this.f32389a.mo24143s().mo24309z(new C7520u6(this));
                }
            }
        }
        if (!this.f32389a.mo24443z().mo24281D()) {
            this.f33116c = this.f33122i;
            this.f32389a.mo24143s().mo24309z(new C7487r6(this));
            return;
        }
        m41957G(activity, m41956F(activity), false);
        C7296a2 y = this.f32389a.mo24442y();
        y.f32389a.mo24143s().mo24309z(new C7565z0(y, y.f32389a.mo24116a().mo18371b()));
    }

    /* renamed from: C */
    public final void mo24696C(Activity activity, Bundle bundle) {
        C7454o6 o6Var;
        if (this.f32389a.mo24443z().mo24281D() && bundle != null && (o6Var = (C7454o6) this.f33119f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", o6Var.f32831c);
            bundle2.putString(MediationMetaData.KEY_NAME, o6Var.f32829a);
            bundle2.putString("referrer_name", o6Var.f32830b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24697D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.j4 r0 = r3.f32389a
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()
            boolean r0 = r0.mo24281D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24262x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo24208a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.o6 r0 = r3.f33116c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24262x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo24208a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f33119f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24262x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo24208a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo24701t(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f32830b
            boolean r1 = p402y5.C13047y.m61373a(r1, r6)
            java.lang.String r0 = r0.f32829a
            boolean r0 = p402y5.C13047y.m61373a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24262x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo24208a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            com.google.android.gms.measurement.internal.j4 r1 = r3.f32389a
            r1.mo24443z()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24262x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo24209b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.j4 r1 = r3.f32389a
            r1.mo24443z()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.j4 r4 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24262x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo24209b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.j4 r0 = r3.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo24210c(r2, r1, r6)
            com.google.android.gms.measurement.internal.o6 r0 = new com.google.android.gms.measurement.internal.o6
            com.google.android.gms.measurement.internal.j4 r1 = r3.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            long r1 = r1.mo24400r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f33119f
            r5.put(r4, r0)
            r5 = 1
            r3.m41957G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7531v6.mo24697D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f32389a.mo24135l().mo24260v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo24210c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f33116c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f33117d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f33116c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C7454o6(r3, r4, r12.f32389a.mo24423N().mo24400r0(), true, r14);
        r12.f33116c = r2;
        r12.f33117d = r0;
        r12.f33122i = r2;
        r12.f32389a.mo24143s().mo24309z(new com.google.android.gms.measurement.internal.C7465p6(r12, r13, r2, r0, r12.f32389a.mo24116a().mo18371b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24698E(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f33125l
            monitor-enter(r0)
            boolean r1 = r12.f33124k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.j4 r13 = r12.f32389a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.f3 r13 = r13.mo24135l()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo24262x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo24208a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j4 r4 = r12.f32389a     // Catch:{ all -> 0x011b }
            r4.mo24443z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.j4 r13 = r12.f32389a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.f3 r13 = r13.mo24135l()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo24262x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo24209b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j4 r5 = r12.f32389a     // Catch:{ all -> 0x011b }
            r5.mo24443z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.j4 r13 = r12.f32389a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.f3 r13 = r13.mo24135l()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo24262x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo24209b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f33120g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo24701t(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.o6 r1 = r12.f33116c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f33121h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f33121h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f32830b     // Catch:{ all -> 0x011b }
            boolean r2 = p402y5.C13047y.m61373a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f32829a     // Catch:{ all -> 0x011b }
            boolean r1 = p402y5.C13047y.m61373a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.j4 r13 = r12.f32389a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.f3 r13 = r13.mo24135l()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo24262x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo24208a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j4 r0 = r12.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo24210c(r5, r1, r2)
            com.google.android.gms.measurement.internal.o6 r0 = r12.f33116c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.o6 r0 = r12.f33117d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.o6 r0 = r12.f33116c
        L_0x00e5:
            com.google.android.gms.measurement.internal.o6 r1 = new com.google.android.gms.measurement.internal.o6
            com.google.android.gms.measurement.internal.j4 r2 = r12.f32389a
            com.google.android.gms.measurement.internal.i9 r2 = r2.mo24423N()
            long r5 = r2.mo24400r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f33116c = r1
            r12.f33117d = r0
            r12.f33122i = r1
            com.google.android.gms.measurement.internal.j4 r14 = r12.f32389a
            i5.e r14 = r14.mo24116a()
            long r10 = r14.mo18371b()
            com.google.android.gms.measurement.internal.j4 r14 = r12.f32389a
            com.google.android.gms.measurement.internal.h4 r14 = r14.mo24143s()
            com.google.android.gms.measurement.internal.p6 r15 = new com.google.android.gms.measurement.internal.p6
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo24309z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7531v6.mo24698E(android.os.Bundle, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo24349m() {
        return false;
    }

    /* renamed from: q */
    public final C7454o6 mo24699q() {
        return this.f33116c;
    }

    /* renamed from: r */
    public final C7454o6 mo24700r(boolean z) {
        mo24741g();
        mo24189f();
        if (!z) {
            return this.f33118e;
        }
        C7454o6 o6Var = this.f33118e;
        return o6Var != null ? o6Var : this.f33123j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final String mo24701t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f32389a.mo24443z();
        if (length2 <= 100) {
            return str2;
        }
        this.f32389a.mo24443z();
        return str2.substring(0, 100);
    }

    /* renamed from: y */
    public final void mo24702y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f32389a.mo24443z().mo24281D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f33119f.put(activity, new C7454o6(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: z */
    public final void mo24703z(Activity activity) {
        synchronized (this.f33125l) {
            if (activity == this.f33120g) {
                this.f33120g = null;
            }
        }
        if (this.f32389a.mo24443z().mo24281D()) {
            this.f33119f.remove(activity);
        }
    }
}
