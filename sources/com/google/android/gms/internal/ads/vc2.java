package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import p033d5.C4141r;
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
import p060h4.C4591u0;
import p060h4.C4596v;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p060h4.C4623z2;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vc2 extends C4561p0 {

    /* renamed from: a */
    private final C4571q4 f19006a;

    /* renamed from: b */
    private final Context f19007b;

    /* renamed from: c */
    private final jq2 f19008c;

    /* renamed from: d */
    private final String f19009d;

    /* renamed from: e */
    private final vm0 f19010e;

    /* renamed from: f */
    private final nc2 f19011f;

    /* renamed from: g */
    private final kr2 f19012g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ki1 f19013h;

    /* renamed from: i */
    private boolean f19014i = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14243A0)).booleanValue();

    public vc2(Context context, C4571q4 q4Var, String str, jq2 jq2, nc2 nc2, kr2 kr2, vm0 vm0) {
        this.f19006a = q4Var;
        this.f19009d = str;
        this.f19007b = context;
        this.f19008c = jq2;
        this.f19011f = nc2;
        this.f19012g = kr2;
        this.f19010e = vm0;
    }

    /* renamed from: K6 */
    private final synchronized boolean m22074K6() {
        ki1 ki1;
        ki1 = this.f19013h;
        return ki1 != null && !ki1.mo11708h();
    }

    /* renamed from: E6 */
    public final void mo10844E6(kf0 kf0) {
    }

    /* renamed from: H5 */
    public final synchronized boolean mo10845H5() {
        return this.f19008c.zza();
    }

    /* renamed from: J2 */
    public final void mo10846J2(String str) {
    }

    /* renamed from: M5 */
    public final void mo10847M5(C4571q4 q4Var) {
    }

    /* renamed from: O0 */
    public final synchronized boolean mo10848O0() {
        C4141r.m28216f("isLoaded must be called on the main UI thread.");
        return m22074K6();
    }

    /* renamed from: R0 */
    public final void mo10849R0(C4541l4 l4Var, C4507g0 g0Var) {
        this.f19011f.mo12584f(g0Var);
        mo10860Z2(l4Var);
    }

    /* renamed from: R2 */
    public final void mo10850R2(C4484c1 c1Var) {
    }

    /* renamed from: S */
    public final synchronized void mo10851S() {
        C4141r.m28216f("showInterstitial must be called on the main UI thread.");
        ki1 ki1 = this.f19013h;
        if (ki1 == null) {
            pm0.m18667g("Interstitial can not be shown before loaded.");
            this.f19011f.mo10490R(eu2.m12271d(9, (String) null, (C4623z2) null));
            return;
        }
        ki1.mo11709i(this.f19014i, (Activity) null);
    }

    /* renamed from: T1 */
    public final void mo10852T1(uh0 uh0) {
        this.f19012g.mo11778F(uh0);
    }

    /* renamed from: V */
    public final C4489d0 mo10853V() {
        return this.f19011f.mo12581a();
    }

    /* renamed from: V1 */
    public final void mo10854V1(C4489d0 d0Var) {
        C4141r.m28216f("setAdListener must be called on the main UI thread.");
        this.f19011f.mo12583e(d0Var);
    }

    /* renamed from: W */
    public final C4609x0 mo10855W() {
        return this.f19011f.mo12582d();
    }

    /* renamed from: X */
    public final synchronized C4509g2 mo10856X() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14408Q5)).booleanValue()) {
            return null;
        }
        ki1 ki1 = this.f19013h;
        if (ki1 == null) {
            return null;
        }
        return ki1.mo14679c();
    }

    /* renamed from: Y5 */
    public final void mo10858Y5(C4609x0 x0Var) {
        C4141r.m28216f("setAppEventListener must be called on the main UI thread.");
        this.f19011f.mo12586p(x0Var);
    }

    /* renamed from: Z */
    public final C4527j2 mo10859Z() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC, Splitter:B:21:0x0065] */
    /* renamed from: Z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10860Z2(p060h4.C4541l4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.q00 r0 = com.google.android.gms.internal.ads.c10.f7563i     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.mo13438e()     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14371M8     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.mo12227b(r0)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.vm0 r2 = r5.f19010e     // Catch:{ all -> 0x008c }
            int r2 = r2.f19152c     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14381N8     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r4.mo12227b(r3)     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x008c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x008c }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x008c }
        L_0x0042:
            p053g4.C4409t.m29326r()     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r5.f19007b     // Catch:{ all -> 0x008c }
            boolean r0 = p073j4.C4751b2.m30609d(r0)     // Catch:{ all -> 0x008c }
            r2 = 0
            if (r0 == 0) goto L_0x0065
            h4.y0 r0 = r6.f24883A     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0065
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.pm0.m18664d(r6)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.nc2 r6 = r5.f19011f     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0063
            r0 = 4
            h4.z2 r0 = com.google.android.gms.internal.ads.eu2.m12271d(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r6.mo9420g(r0)     // Catch:{ all -> 0x008c }
        L_0x0063:
            monitor-exit(r5)
            return r1
        L_0x0065:
            boolean r0 = r5.m22074K6()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r5)
            return r1
        L_0x006d:
            android.content.Context r0 = r5.f19007b     // Catch:{ all -> 0x008c }
            boolean r1 = r6.f24894f     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.yt2.m24195a(r0, r1)     // Catch:{ all -> 0x008c }
            r5.f19013h = r2     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.jq2 r0 = r5.f19008c     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r5.f19009d     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.cq2 r2 = new com.google.android.gms.internal.ads.cq2     // Catch:{ all -> 0x008c }
            h4.q4 r3 = r5.f19006a     // Catch:{ all -> 0x008c }
            r2.<init>(r3)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.uc2 r3 = new com.google.android.gms.internal.ads.uc2     // Catch:{ all -> 0x008c }
            r3.<init>(r5)     // Catch:{ all -> 0x008c }
            boolean r6 = r0.mo9556a(r6, r1, r2, r3)     // Catch:{ all -> 0x008c }
            monitor-exit(r5)
            return r6
        L_0x008c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vc2.mo10860Z2(h4.l4):boolean");
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() {
        return null;
    }

    /* renamed from: b */
    public final Bundle mo10862b() {
        C4141r.m28216f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: c */
    public final C4571q4 mo10863c() {
        return null;
    }

    /* renamed from: c1 */
    public final void mo10865c1(C4591u0 u0Var) {
        C4141r.m28216f("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: d0 */
    public final synchronized String mo10866d0() {
        ki1 ki1 = this.f19013h;
        if (ki1 == null || ki1.mo14679c() == null) {
            return null;
        }
        return ki1.mo14679c().mo12867c();
    }

    /* renamed from: d1 */
    public final void mo10867d1(String str) {
    }

    /* renamed from: e0 */
    public final synchronized String mo10868e0() {
        return this.f19009d;
    }

    /* renamed from: e3 */
    public final synchronized void mo10869e3(i00 i00) {
        C4141r.m28216f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f19008c.mo11480h(i00);
    }

    /* renamed from: g */
    public final synchronized String mo10870g() {
        ki1 ki1 = this.f19013h;
        if (ki1 == null || ki1.mo14679c() == null) {
            return null;
        }
        return ki1.mo14679c().mo12867c();
    }

    /* renamed from: h0 */
    public final void mo10871h0() {
    }

    /* renamed from: j0 */
    public final synchronized void mo10872j0() {
        C4141r.m28216f("pause must be called on the main UI thread.");
        ki1 ki1 = this.f19013h;
        if (ki1 != null) {
            ki1.mo14680d().mo14702q0((Context) null);
        }
    }

    /* renamed from: l0 */
    public final synchronized void mo10873l0() {
        C4141r.m28216f("resume must be called on the main UI thread.");
        ki1 ki1 = this.f19013h;
        if (ki1 != null) {
            ki1.mo14680d().mo14703s0((Context) null);
        }
    }

    /* renamed from: n4 */
    public final void mo10874n4(C4471a0 a0Var) {
    }

    /* renamed from: o5 */
    public final synchronized void mo10875o5(boolean z) {
        C4141r.m28216f("setImmersiveMode must be called on the main UI thread.");
        this.f19014i = z;
    }

    /* renamed from: o6 */
    public final synchronized void mo10876o6(C4954a aVar) {
        if (this.f19013h == null) {
            pm0.m18667g("Interstitial can not be shown before loaded.");
            this.f19011f.mo10490R(eu2.m12271d(9, (String) null, (C4623z2) null));
            return;
        }
        this.f19013h.mo11709i(this.f19014i, (Activity) C4956b.m31384P0(aVar));
    }

    /* renamed from: p4 */
    public final void mo10877p4(C4499e4 e4Var) {
    }

    /* renamed from: q */
    public final synchronized void mo10878q() {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        ki1 ki1 = this.f19013h;
        if (ki1 != null) {
            ki1.mo14680d().mo14701p0((Context) null);
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
        C4141r.m28216f("setPaidEventListener must be called on the main UI thread.");
        this.f19011f.mo12585k(d2Var);
    }

    /* renamed from: y3 */
    public final void mo10882y3(C2822rt rtVar) {
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) {
    }

    /* renamed from: y6 */
    public final void mo10884y6(boolean z) {
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) {
        this.f19011f.mo12580D(f1Var);
    }
}
