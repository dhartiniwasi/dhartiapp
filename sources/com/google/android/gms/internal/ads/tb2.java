package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
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
import p060h4.C4591u0;
import p060h4.C4596v;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p060h4.C4623z2;
import p073j4.C4751b2;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tb2 extends C4561p0 implements oc1 {

    /* renamed from: a */
    private final Context f17931a;

    /* renamed from: b */
    private final no2 f17932b;

    /* renamed from: c */
    private final String f17933c;

    /* renamed from: d */
    private final nc2 f17934d;

    /* renamed from: e */
    private C4571q4 f17935e;

    /* renamed from: f */
    private final ct2 f17936f;

    /* renamed from: g */
    private final vm0 f17937g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public r31 f17938h;

    public tb2(Context context, C4571q4 q4Var, String str, no2 no2, nc2 nc2, vm0 vm0) {
        this.f17931a = context;
        this.f17932b = no2;
        this.f17935e = q4Var;
        this.f17933c = str;
        this.f17934d = nc2;
        this.f17936f = no2.mo12683h();
        this.f17937g = vm0;
        no2.mo12687o(this);
    }

    /* renamed from: K6 */
    private final synchronized void m20912K6(C4571q4 q4Var) {
        this.f17936f.mo9327I(q4Var);
        this.f17936f.mo9332N(this.f17935e.f24985v);
    }

    /* renamed from: L6 */
    private final synchronized boolean m20913L6(C4541l4 l4Var) throws RemoteException {
        if (m20914M6()) {
            C4141r.m28216f("loadAd must be called on the main UI thread.");
        }
        C4409t.m29326r();
        if (!C4751b2.m30609d(this.f17931a) || l4Var.f24883A != null) {
            yt2.m24195a(this.f17931a, l4Var.f24894f);
            return this.f17932b.mo9556a(l4Var, this.f17933c, (bd2) null, new sb2(this));
        }
        pm0.m18664d("Failed to load the ad because app ID is missing.");
        nc2 nc2 = this.f17934d;
        if (nc2 != null) {
            nc2.mo9420g(eu2.m12271d(4, (String) null, (C4623z2) null));
        }
        return false;
    }

    /* renamed from: M6 */
    private final boolean m20914M6() {
        boolean z;
        if (((Boolean) c10.f7560f.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                z = true;
                return this.f17937g.f19152c >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14381N8)).intValue() || !z;
            }
        }
        z = false;
        if (this.f17937g.f19152c >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14381N8)).intValue()) {
        }
    }

    /* renamed from: E6 */
    public final void mo10844E6(kf0 kf0) {
    }

    /* renamed from: H5 */
    public final synchronized boolean mo10845H5() {
        return this.f17932b.zza();
    }

    /* renamed from: J2 */
    public final void mo10846J2(String str) {
    }

    /* renamed from: M5 */
    public final synchronized void mo10847M5(C4571q4 q4Var) {
        C4141r.m28216f("setAdSize must be called on the main UI thread.");
        this.f17936f.mo9327I(q4Var);
        this.f17935e = q4Var;
        r31 r31 = this.f17938h;
        if (r31 != null) {
            r31.mo8212n(this.f17932b.mo12682c(), q4Var);
        }
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
        C4141r.m28216f("setCorrelationIdProvider must be called on the main UI thread");
        this.f17936f.mo9345q(c1Var);
    }

    /* renamed from: S */
    public final void mo10851S() {
    }

    /* renamed from: T1 */
    public final void mo10852T1(uh0 uh0) {
    }

    /* renamed from: V */
    public final C4489d0 mo10853V() {
        return this.f17934d.mo12581a();
    }

    /* renamed from: V1 */
    public final void mo10854V1(C4489d0 d0Var) {
        if (m20914M6()) {
            C4141r.m28216f("setAdListener must be called on the main UI thread.");
        }
        this.f17934d.mo12583e(d0Var);
    }

    /* renamed from: W */
    public final C4609x0 mo10855W() {
        return this.f17934d.mo12582d();
    }

    /* renamed from: X */
    public final synchronized C4509g2 mo10856X() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14408Q5)).booleanValue()) {
            return null;
        }
        r31 r31 = this.f17938h;
        if (r31 == null) {
            return null;
        }
        return r31.mo14679c();
    }

    /* renamed from: Y5 */
    public final void mo10858Y5(C4609x0 x0Var) {
        if (m20914M6()) {
            C4141r.m28216f("setAppEventListener must be called on the main UI thread.");
        }
        this.f17934d.mo12586p(x0Var);
    }

    /* renamed from: Z */
    public final synchronized C4527j2 mo10859Z() {
        C4141r.m28216f("getVideoController must be called from the main thread.");
        r31 r31 = this.f17938h;
        if (r31 == null) {
            return null;
        }
        return r31.mo8208j();
    }

    /* renamed from: Z2 */
    public final synchronized boolean mo10860Z2(C4541l4 l4Var) throws RemoteException {
        m20912K6(this.f17935e);
        return m20913L6(l4Var);
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() {
        if (m20914M6()) {
            C4141r.m28216f("getAdFrame must be called on the main UI thread.");
        }
        return C4956b.m31385o3(this.f17932b.mo12682c());
    }

    /* renamed from: b */
    public final Bundle mo10862b() {
        C4141r.m28216f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: c */
    public final synchronized C4571q4 mo10863c() {
        C4141r.m28216f("getAdSize must be called on the main UI thread.");
        r31 r31 = this.f17938h;
        if (r31 != null) {
            return it2.m14548a(this.f17931a, Collections.singletonList(r31.mo8209k()));
        }
        return this.f17936f.mo9347x();
    }

    /* renamed from: c1 */
    public final void mo10865c1(C4591u0 u0Var) {
        C4141r.m28216f("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: d0 */
    public final synchronized String mo10866d0() {
        r31 r31 = this.f17938h;
        if (r31 == null || r31.mo14679c() == null) {
            return null;
        }
        return r31.mo14679c().mo12867c();
    }

    /* renamed from: d1 */
    public final void mo10867d1(String str) {
    }

    /* renamed from: e0 */
    public final synchronized String mo10868e0() {
        return this.f17933c;
    }

    /* renamed from: e3 */
    public final synchronized void mo10869e3(i00 i00) {
        C4141r.m28216f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f17932b.mo12688p(i00);
    }

    /* renamed from: g */
    public final synchronized String mo10870g() {
        r31 r31 = this.f17938h;
        if (r31 == null || r31.mo14679c() == null) {
            return null;
        }
        return r31.mo14679c().mo12867c();
    }

    /* renamed from: h0 */
    public final synchronized void mo10871h0() {
        C4141r.m28216f("recordManualImpression must be called on the main UI thread.");
        r31 r31 = this.f17938h;
        if (r31 != null) {
            r31.mo8211m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.f17937g.f19152c < ((java.lang.Integer) p060h4.C4596v.m30088c().mo12227b(com.google.android.gms.internal.ads.C2679nz.f14391O8)).intValue()) goto L_0x0037;
     */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10872j0() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.q00 r0 = com.google.android.gms.internal.ads.c10.f7561g     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.mo13438e()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14351K8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.vm0 r0 = r3.f17937g     // Catch:{ all -> 0x004c }
            int r0 = r0.f19152c     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14391O8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.mo12227b(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "pause must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.r31 r0 = r3.f17938h     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.va1 r0 = r0.mo14680d()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.mo14702q0(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tb2.mo10872j0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.f17937g.f19152c < ((java.lang.Integer) p060h4.C4596v.m30088c().mo12227b(com.google.android.gms.internal.ads.C2679nz.f14391O8)).intValue()) goto L_0x0037;
     */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10873l0() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.q00 r0 = com.google.android.gms.internal.ads.c10.f7562h     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.mo13438e()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14331I8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.vm0 r0 = r3.f17937g     // Catch:{ all -> 0x004c }
            int r0 = r0.f19152c     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14391O8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.mo12227b(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "resume must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.r31 r0 = r3.f17938h     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.va1 r0 = r0.mo14680d()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.mo14703s0(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tb2.mo10873l0():void");
    }

    /* renamed from: n4 */
    public final void mo10874n4(C4471a0 a0Var) {
        if (m20914M6()) {
            C4141r.m28216f("setAdListener must be called on the main UI thread.");
        }
        this.f17932b.mo12686n(a0Var);
    }

    /* renamed from: o5 */
    public final void mo10875o5(boolean z) {
    }

    /* renamed from: o6 */
    public final void mo10876o6(C4954a aVar) {
    }

    /* renamed from: p4 */
    public final synchronized void mo10877p4(C4499e4 e4Var) {
        if (m20914M6()) {
            C4141r.m28216f("setVideoOptions must be called on the main UI thread.");
        }
        this.f17936f.mo9341f(e4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.f17937g.f19152c < ((java.lang.Integer) p060h4.C4596v.m30088c().mo12227b(com.google.android.gms.internal.ads.C2679nz.f14391O8)).intValue()) goto L_0x0037;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10878q() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.q00 r0 = com.google.android.gms.internal.ads.c10.f7559e     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.mo13438e()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14341J8     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.vm0 r0 = r3.f17937g     // Catch:{ all -> 0x0047 }
            int r0 = r0.f19152c     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14391O8     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.mo12227b(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0047 }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.google.android.gms.internal.ads.r31 r0 = r3.f17938h     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r0.mo11305a()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tb2.mo10878q():void");
    }

    /* renamed from: t3 */
    public final void mo10879t3(C4551n2 n2Var) {
    }

    /* renamed from: w1 */
    public final void mo10880w1(nf0 nf0, String str) {
    }

    /* renamed from: x4 */
    public final void mo10881x4(C4491d2 d2Var) {
        if (m20914M6()) {
            C4141r.m28216f("setPaidEventListener must be called on the main UI thread.");
        }
        this.f17934d.mo12585k(d2Var);
    }

    /* renamed from: y3 */
    public final void mo10882y3(C2822rt rtVar) {
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) {
    }

    /* renamed from: y6 */
    public final synchronized void mo10884y6(boolean z) {
        if (m20914M6()) {
            C4141r.m28216f("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.f17936f.mo9334P(z);
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) {
    }

    public final synchronized void zza() {
        if (this.f17932b.mo12689q()) {
            C4571q4 x = this.f17936f.mo9347x();
            r31 r31 = this.f17938h;
            if (!(r31 == null || r31.mo8210l() == null || !this.f17936f.mo9344o())) {
                x = it2.m14548a(this.f17931a, Collections.singletonList(this.f17938h.mo8210l()));
            }
            m20912K6(x);
            try {
                m20913L6(this.f17936f.mo9346v());
            } catch (RemoteException unused) {
                pm0.m18667g("Failed to refresh the banner ad.");
            }
        } else {
            this.f17932b.mo12685m();
        }
    }
}
