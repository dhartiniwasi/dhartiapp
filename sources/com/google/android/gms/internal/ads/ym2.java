package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4471a0;
import p060h4.C4484c1;
import p060h4.C4489d0;
import p060h4.C4491d2;
import p060h4.C4499e4;
import p060h4.C4502f1;
import p060h4.C4507g0;
import p060h4.C4509g2;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4551n2;
import p060h4.C4561p0;
import p060h4.C4571q4;
import p060h4.C4584t;
import p060h4.C4591u0;
import p060h4.C4596v;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p066i4.C4664e;
import p066i4.C4682v;
import p066i4.C4683w;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ym2 extends C4561p0 implements C4664e, C2488it, wb1 {

    /* renamed from: a */
    private final su0 f20697a;

    /* renamed from: b */
    private final Context f20698b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ViewGroup f20699c;

    /* renamed from: d */
    private AtomicBoolean f20700d = new AtomicBoolean();

    /* renamed from: e */
    private final String f20701e;

    /* renamed from: f */
    private final sm2 f20702f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zn2 f20703g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final vm0 f20704h;

    /* renamed from: i */
    private long f20705i = -1;

    /* renamed from: r */
    private j21 f20706r;

    /* renamed from: s */
    protected z21 f20707s;

    public ym2(su0 su0, Context context, String str, sm2 sm2, zn2 zn2, vm0 vm0) {
        this.f20699c = new FrameLayout(context);
        this.f20697a = su0;
        this.f20698b = context;
        this.f20701e = str;
        this.f20702f = sm2;
        this.f20703g = zn2;
        zn2.mo15631k(this);
        this.f20704h = vm0;
    }

    /* renamed from: K6 */
    static /* bridge */ /* synthetic */ C4683w m24049K6(ym2 ym2, z21 z21) {
        boolean o = z21.mo15545o();
        int intValue = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14492Z3)).intValue();
        C4682v vVar = new C4682v();
        vVar.f25245d = 50;
        int i = 0;
        vVar.f25242a = true != o ? 0 : intValue;
        if (true != o) {
            i = intValue;
        }
        vVar.f25243b = i;
        vVar.f25244c = intValue;
        return new C4683w(ym2.f20698b, vVar, ym2);
    }

    /* renamed from: N6 */
    private final synchronized void m24052N6(int i) {
        if (this.f20700d.compareAndSet(false, true)) {
            z21 z21 = this.f20707s;
            if (!(z21 == null || z21.mo15547q() == null)) {
                this.f20703g.mo15628D(z21.mo15547q());
            }
            this.f20703g.mo15629W();
            this.f20699c.removeAllViews();
            j21 j21 = this.f20706r;
            if (j21 != null) {
                C4409t.m29312d().mo13031e(j21);
            }
            if (this.f20707s != null) {
                long j = -1;
                if (this.f20705i != -1) {
                    j = C4409t.m29310b().mo18371b() - this.f20705i;
                }
                this.f20707s.mo15546p(j, i);
            }
            mo10878q();
        }
    }

    /* renamed from: E6 */
    public final void mo10844E6(kf0 kf0) {
    }

    /* renamed from: H5 */
    public final synchronized boolean mo10845H5() {
        return this.f20702f.zza();
    }

    /* renamed from: J2 */
    public final void mo10846J2(String str) {
    }

    /* renamed from: M5 */
    public final synchronized void mo10847M5(C4571q4 q4Var) {
        C4141r.m28216f("setAdSize must be called on the main UI thread.");
    }

    /* renamed from: O0 */
    public final boolean mo10848O0() {
        return false;
    }

    /* renamed from: R0 */
    public final void mo10849R0(C4541l4 l4Var, C4507g0 g0Var) {
    }

    /* renamed from: R2 */
    public final synchronized void mo10850R2(C4484c1 c1Var) {
    }

    /* renamed from: S */
    public final void mo10851S() {
    }

    /* renamed from: T1 */
    public final void mo10852T1(uh0 uh0) {
    }

    /* renamed from: T5 */
    public final void mo15462T5() {
        m24052N6(4);
    }

    /* renamed from: U */
    public final void mo10491U() {
        if (this.f20707s != null) {
            this.f20705i = C4409t.m29310b().mo18371b();
            int h = this.f20707s.mo15538h();
            if (h > 0) {
                j21 j21 = new j21(this.f20697a.mo9712c(), C4409t.m29310b());
                this.f20706r = j21;
                j21.mo11304d(h, new vm2(this));
            }
        }
    }

    /* renamed from: V */
    public final C4489d0 mo10853V() {
        return null;
    }

    /* renamed from: V1 */
    public final void mo10854V1(C4489d0 d0Var) {
    }

    /* renamed from: W */
    public final C4609x0 mo10855W() {
        return null;
    }

    /* renamed from: X */
    public final synchronized C4509g2 mo10856X() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final /* synthetic */ void mo15463Y() {
        m24052N6(5);
    }

    /* renamed from: Y5 */
    public final void mo10858Y5(C4609x0 x0Var) {
    }

    /* renamed from: Z */
    public final synchronized C4527j2 mo10859Z() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* renamed from: Z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10860Z2(p060h4.C4541l4 r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.q00 r0 = com.google.android.gms.internal.ads.c10.f7558d     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.mo13438e()     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14371M8     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r2.mo12227b(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.vm0 r2 = r5.f20704h     // Catch:{ all -> 0x0087 }
            int r2 = r2.f19152c     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14381N8     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r4.mo12227b(r3)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0087 }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x0087 }
        L_0x0042:
            p053g4.C4409t.m29326r()     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r5.f20698b     // Catch:{ all -> 0x0087 }
            boolean r0 = p073j4.C4751b2.m30609d(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            h4.y0 r0 = r6.f24883A     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.pm0.m18664d(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zn2 r6 = r5.f20703g     // Catch:{ all -> 0x0087 }
            r0 = 4
            r2 = 0
            h4.z2 r0 = com.google.android.gms.internal.ads.eu2.m12271d(r0, r2, r2)     // Catch:{ all -> 0x0087 }
            r6.mo9420g(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            boolean r0 = r5.mo10845H5()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            monitor-exit(r5)
            return r1
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            r5.f20700d = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.wm2 r0 = new com.google.android.gms.internal.ads.wm2     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.sm2 r1 = r5.f20702f     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.f20701e     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.xm2 r3 = new com.google.android.gms.internal.ads.xm2     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.mo9556a(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ym2.mo10860Z2(h4.l4):boolean");
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() {
        C4141r.m28216f("getAdFrame must be called on the main UI thread.");
        return C4956b.m31385o3(this.f20699c);
    }

    /* renamed from: b */
    public final Bundle mo10862b() {
        return new Bundle();
    }

    /* renamed from: b0 */
    public final void mo15464b0() {
        C4584t.m30036b();
        if (im0.m14415v()) {
            m24052N6(5);
        } else {
            this.f20697a.mo9711b().execute(new um2(this));
        }
    }

    /* renamed from: c */
    public final synchronized C4571q4 mo10863c() {
        C4141r.m28216f("getAdSize must be called on the main UI thread.");
        z21 z21 = this.f20707s;
        if (z21 == null) {
            return null;
        }
        return it2.m14548a(this.f20698b, Collections.singletonList(z21.mo15540j()));
    }

    /* renamed from: c1 */
    public final void mo10865c1(C4591u0 u0Var) {
    }

    /* renamed from: d0 */
    public final synchronized String mo10866d0() {
        return null;
    }

    /* renamed from: d1 */
    public final void mo10867d1(String str) {
    }

    /* renamed from: e0 */
    public final synchronized String mo10868e0() {
        return this.f20701e;
    }

    /* renamed from: e3 */
    public final synchronized void mo10869e3(i00 i00) {
    }

    /* renamed from: g */
    public final synchronized String mo10870g() {
        return null;
    }

    /* renamed from: h0 */
    public final synchronized void mo10871h0() {
    }

    /* renamed from: j0 */
    public final synchronized void mo10872j0() {
        C4141r.m28216f("pause must be called on the main UI thread.");
    }

    /* renamed from: l0 */
    public final synchronized void mo10873l0() {
        C4141r.m28216f("resume must be called on the main UI thread.");
    }

    /* renamed from: n4 */
    public final void mo10874n4(C4471a0 a0Var) {
    }

    /* renamed from: o5 */
    public final void mo10875o5(boolean z) {
    }

    /* renamed from: o6 */
    public final void mo10876o6(C4954a aVar) {
    }

    /* renamed from: p4 */
    public final synchronized void mo10877p4(C4499e4 e4Var) {
    }

    /* renamed from: q */
    public final synchronized void mo10878q() {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        z21 z21 = this.f20707s;
        if (z21 != null) {
            z21.mo11305a();
        }
    }

    /* renamed from: t3 */
    public final void mo10879t3(C4551n2 n2Var) {
    }

    /* renamed from: w1 */
    public final void mo10880w1(nf0 nf0, String str) {
    }

    /* renamed from: x4 */
    public final void mo10881x4(C4491d2 d2Var) {
    }

    /* renamed from: y3 */
    public final void mo10882y3(C2822rt rtVar) {
        this.f20703g.mo15634x(rtVar);
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) {
        this.f20702f.mo11179k(w4Var);
    }

    /* renamed from: y6 */
    public final synchronized void mo10884y6(boolean z) {
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) {
    }

    public final void zza() {
        m24052N6(3);
    }
}
