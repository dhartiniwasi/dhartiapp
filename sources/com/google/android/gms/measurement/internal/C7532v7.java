package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C7003i1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4141r;
import p040e5.C4240a;
import p061h5.C4626a;
import p180z4.C6378j;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7532v7 extends C7538w3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7521u7 f33126c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C13028f f33127d;

    /* renamed from: e */
    private volatile Boolean f33128e;

    /* renamed from: f */
    private final C7447o f33129f;

    /* renamed from: g */
    private final C7434m8 f33130g;

    /* renamed from: h */
    private final List f33131h = new ArrayList();

    /* renamed from: i */
    private final C7447o f33132i;

    protected C7532v7(C7397j4 j4Var) {
        super(j4Var);
        this.f33130g = new C7434m8(j4Var.mo24116a());
        this.f33126c = new C7521u7(this);
        this.f33129f = new C7345e7(this, j4Var);
        this.f33132i = new C7367g7(this, j4Var);
    }

    /* renamed from: C */
    private final C7446n9 m41976C(boolean z) {
        Pair a;
        this.f32389a.mo24118b();
        C7537w2 B = this.f32389a.mo24412B();
        String str = null;
        if (z) {
            C7352f3 l = this.f32389a.mo24135l();
            if (!(l.f32389a.mo24416F().f32946d == null || (a = l.f32389a.mo24416F().f32946d.mo24617a()) == null || a == C7495s3.f32944y)) {
                str = String.valueOf(a.second) + ":" + ((String) a.first);
            }
        }
        return B.mo24734p(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m41977D() {
        mo24189f();
        this.f32389a.mo24135l().mo24260v().mo24209b("Processing queued up service tasks", Integer.valueOf(this.f33131h.size()));
        for (Runnable run : this.f33131h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Task exception while flushing queue", e);
            }
        }
        this.f33131h.clear();
        this.f33132i.mo24587b();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m41978E() {
        mo24189f();
        this.f33130g.mo24577b();
        C7447o oVar = this.f33129f;
        this.f32389a.mo24443z();
        oVar.mo24588d(((Long) C7516u2.f33022K.mo24669a((Object) null)).longValue());
    }

    /* renamed from: F */
    private final void m41979F(Runnable runnable) throws IllegalStateException {
        mo24189f();
        if (mo24727z()) {
            runnable.run();
            return;
        }
        int size = this.f33131h.size();
        this.f32389a.mo24443z();
        if (((long) size) >= 1000) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f33131h.add(runnable);
        this.f33132i.mo24588d(60000);
        mo24708P();
    }

    /* renamed from: G */
    private final boolean m41980G() {
        this.f32389a.mo24118b();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m41985M(C7532v7 v7Var, ComponentName componentName) {
        v7Var.mo24189f();
        if (v7Var.f33127d != null) {
            v7Var.f33127d = null;
            v7Var.f32389a.mo24135l().mo24260v().mo24209b("Disconnected from device MeasurementService", componentName);
            v7Var.mo24189f();
            v7Var.mo24708P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo24704A() {
        mo24189f();
        mo24741g();
        if (!mo24705B() || this.f32389a.mo24423N().mo24395o0() >= ((Integer) C7516u2.f33053h0.mo24669a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24705B() {
        /*
            r6 = this;
            r6.mo24189f()
            r6.mo24741g()
            java.lang.Boolean r0 = r6.f33128e
            if (r0 != 0) goto L_0x0149
            r6.mo24189f()
            r6.mo24741g()
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo24416F()
            r0.mo24189f()
            android.content.SharedPreferences r1 = r0.mo24642n()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo24642n()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0143
        L_0x003f:
            com.google.android.gms.measurement.internal.j4 r4 = r6.f32389a
            r4.mo24118b()
            com.google.android.gms.measurement.internal.j4 r4 = r6.f32389a
            com.google.android.gms.measurement.internal.w2 r4 = r4.mo24412B()
            int r4 = r4.mo24732n()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x010b
        L_0x0053:
            com.google.android.gms.measurement.internal.j4 r4 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24260v()
            java.lang.String r5 = "Checking service availability"
            r4.mo24208a(r5)
            com.google.android.gms.measurement.internal.j4 r4 = r6.f32389a
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo24423N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo24397p0(r5)
            if (r4 == 0) goto L_0x00fa
            if (r4 == r1) goto L_0x00ea
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo24209b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()
            java.lang.String r3 = "Service updating"
            r0.mo24208a(r3)
            goto L_0x0050
        L_0x00a5:
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()
            java.lang.String r1 = "Service invalid"
            r0.mo24208a(r1)
            goto L_0x00c4
        L_0x00b5:
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()
            java.lang.String r1 = "Service disabled"
            r0.mo24208a(r1)
        L_0x00c4:
            r1 = 0
            goto L_0x010b
        L_0x00c6:
            com.google.android.gms.measurement.internal.j4 r4 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24255p()
            java.lang.String r5 = "Service container out of date"
            r4.mo24208a(r5)
            com.google.android.gms.measurement.internal.j4 r4 = r6.f32389a
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo24423N()
            int r4 = r4.mo24395o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010b
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = 0
        L_0x00e8:
            r3 = r1
            goto L_0x00c4
        L_0x00ea:
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()
            java.lang.String r4 = "Service missing"
            r0.mo24208a(r4)
            goto L_0x010b
        L_0x00fa:
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()
            java.lang.String r3 = "Service available"
            r0.mo24208a(r3)
            goto L_0x0050
        L_0x010b:
            if (r3 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()
            boolean r0 = r0.mo24284G()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo24208a(r1)
            goto L_0x0142
        L_0x0129:
            if (r1 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.j4 r0 = r6.f32389a
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo24416F()
            r0.mo24189f()
            android.content.SharedPreferences r0 = r0.mo24642n()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0142:
            r1 = r3
        L_0x0143:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f33128e = r0
        L_0x0149:
            java.lang.Boolean r0 = r6.f33128e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7532v7.mo24705B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo24706J() {
        return this.f33128e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo24707O() {
        mo24189f();
        mo24741g();
        C7446n9 C = m41976C(true);
        this.f32389a.mo24413C().mo24771q();
        m41979F(new C7312b7(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo24708P() {
        mo24189f();
        mo24741g();
        if (!mo24727z()) {
            if (mo24705B()) {
                this.f33126c.mo24684c();
            } else if (!this.f32389a.mo24443z().mo24284G()) {
                this.f32389a.mo24118b();
                List<ResolveInfo> queryIntentServices = this.f32389a.mo24121d().getPackageManager().queryIntentServices(new Intent().setClassName(this.f32389a.mo24121d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f32389a.mo24135l().mo24256q().mo24208a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context d = this.f32389a.mo24121d();
                this.f32389a.mo24118b();
                intent.setComponent(new ComponentName(d, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f33126c.mo24683b(intent);
            }
        }
    }

    /* renamed from: Q */
    public final void mo24709Q() {
        mo24189f();
        mo24741g();
        this.f33126c.mo24685d();
        try {
            C4626a.m30143b().mo18192c(this.f32389a.mo24121d(), this.f33126c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f33127d = null;
    }

    /* renamed from: R */
    public final void mo24710R(C7003i1 i1Var) {
        mo24189f();
        mo24741g();
        m41979F(new C7301a7(this, m41976C(false), i1Var));
    }

    /* renamed from: S */
    public final void mo24711S(AtomicReference atomicReference) {
        mo24189f();
        mo24741g();
        m41979F(new C7571z6(this, atomicReference, m41976C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo24712T(C7003i1 i1Var, String str, String str2) {
        mo24189f();
        mo24741g();
        m41979F(new C7444n7(this, str, str2, m41976C(false), i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo24713U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo24189f();
        mo24741g();
        m41979F(new C7433m7(this, atomicReference, (String) null, str2, str3, m41976C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo24714V(C7003i1 i1Var, String str, String str2, boolean z) {
        mo24189f();
        mo24741g();
        m41979F(new C7541w6(this, str, str2, m41976C(false), z, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo24715W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo24189f();
        mo24741g();
        m41979F(new C7455o7(this, atomicReference, (String) null, str2, str3, m41976C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo24349m() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo24716n(C7524v vVar, String str) {
        C4141r.m28221k(vVar);
        mo24189f();
        mo24741g();
        m41980G();
        m41979F(new C7411k7(this, true, m41976C(true), this.f32389a.mo24413C().mo24775v(vVar), vVar, str));
    }

    /* renamed from: o */
    public final void mo24717o(C7003i1 i1Var, C7524v vVar, String str) {
        mo24189f();
        mo24741g();
        if (this.f32389a.mo24423N().mo24397p0(C6378j.f30617a) != 0) {
            this.f32389a.mo24135l().mo24261w().mo24208a("Not bundling data. Service unavailable or out of date");
            this.f32389a.mo24423N().mo24370G(i1Var, new byte[0]);
            return;
        }
        m41979F(new C7356f7(this, vVar, str, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo24718p() {
        mo24189f();
        mo24741g();
        C7446n9 C = m41976C(false);
        m41980G();
        this.f32389a.mo24413C().mo24770p();
        m41979F(new C7561y6(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo24719q(C13028f fVar, C4240a aVar, C7446n9 n9Var) {
        int i;
        mo24189f();
        mo24741g();
        m41980G();
        this.f32389a.mo24443z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List o = this.f32389a.mo24413C().mo24769o(100);
            if (o != null) {
                arrayList.addAll(o);
                i = o.size();
            } else {
                i = 0;
            }
            if (aVar != null && i < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C4240a aVar2 = (C4240a) arrayList.get(i4);
                if (aVar2 instanceof C7524v) {
                    try {
                        fVar.mo24171q3((C7524v) aVar2, n9Var);
                    } catch (RemoteException e) {
                        this.f32389a.mo24135l().mo24256q().mo24209b("Failed to send event to the service", e);
                    }
                } else if (aVar2 instanceof C7336d9) {
                    try {
                        fVar.mo24166e4((C7336d9) aVar2, n9Var);
                    } catch (RemoteException e2) {
                        this.f32389a.mo24135l().mo24256q().mo24209b("Failed to send user property to the service", e2);
                    }
                } else if (aVar2 instanceof C7326d) {
                    try {
                        fVar.mo24156C5((C7326d) aVar2, n9Var);
                    } catch (RemoteException e3) {
                        this.f32389a.mo24135l().mo24256q().mo24209b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo24720r(C7326d dVar) {
        C4141r.m28221k(dVar);
        mo24189f();
        mo24741g();
        this.f32389a.mo24118b();
        m41979F(new C7422l7(this, true, m41976C(true), this.f32389a.mo24413C().mo24774u(dVar), new C7326d(dVar), dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo24721t(boolean z) {
        mo24189f();
        mo24741g();
        if (z) {
            m41980G();
            this.f32389a.mo24413C().mo24770p();
        }
        if (mo24704A()) {
            m41979F(new C7400j7(this, m41976C(false)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo24722u(C7454o6 o6Var) {
        mo24189f();
        mo24741g();
        m41979F(new C7323c7(this, o6Var));
    }

    /* renamed from: v */
    public final void mo24723v(Bundle bundle) {
        mo24189f();
        mo24741g();
        m41979F(new C7334d7(this, m41976C(false), bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo24724w() {
        mo24189f();
        mo24741g();
        m41979F(new C7378h7(this, m41976C(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo24725x(C13028f fVar) {
        mo24189f();
        C4141r.m28221k(fVar);
        this.f33127d = fVar;
        m41978E();
        m41977D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo24726y(C7336d9 d9Var) {
        mo24189f();
        mo24741g();
        m41980G();
        m41979F(new C7551x6(this, m41976C(true), this.f32389a.mo24413C().mo24776w(d9Var), d9Var));
    }

    /* renamed from: z */
    public final boolean mo24727z() {
        mo24189f();
        mo24741g();
        return this.f33127d != null;
    }
}
