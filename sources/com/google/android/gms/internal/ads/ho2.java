package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
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
import p060h4.C4591u0;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p066i4.C4680t;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ho2 extends C4561p0 implements C4680t, C2488it {

    /* renamed from: a */
    private final su0 f10433a;

    /* renamed from: b */
    private final Context f10434b;

    /* renamed from: c */
    private AtomicBoolean f10435c = new AtomicBoolean();

    /* renamed from: d */
    private final String f10436d;

    /* renamed from: e */
    private final bo2 f10437e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zn2 f10438f;

    /* renamed from: g */
    private final vm0 f10439g;

    /* renamed from: h */
    private long f10440h = -1;

    /* renamed from: i */
    private j21 f10441i;

    /* renamed from: r */
    protected j31 f10442r;

    public ho2(su0 su0, Context context, String str, bo2 bo2, zn2 zn2, vm0 vm0) {
        this.f10433a = su0;
        this.f10434b = context;
        this.f10436d = str;
        this.f10437e = bo2;
        this.f10438f = zn2;
        this.f10439g = vm0;
        zn2.mo15632t(this);
    }

    /* renamed from: J6 */
    private final synchronized void m13935J6(int i) {
        if (this.f10435c.compareAndSet(false, true)) {
            this.f10438f.mo15629W();
            j21 j21 = this.f10441i;
            if (j21 != null) {
                C4409t.m29312d().mo13031e(j21);
            }
            if (this.f10442r != null) {
                long j = -1;
                if (this.f10440h != -1) {
                    j = C4409t.m29310b().mo18371b() - this.f10440h;
                }
                this.f10442r.mo11309k(j, i);
            }
            mo10878q();
        }
    }

    /* renamed from: E6 */
    public final void mo10844E6(kf0 kf0) {
    }

    /* renamed from: H5 */
    public final synchronized boolean mo10845H5() {
        return this.f10437e.zza();
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
    public final synchronized void mo10851S() {
    }

    /* renamed from: T1 */
    public final void mo10852T1(uh0 uh0) {
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

    /* renamed from: Y */
    public final void mo10857Y() {
        this.f10433a.mo9711b().execute(new do2(this));
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
            com.google.android.gms.internal.ads.vm0 r2 = r5.f10439g     // Catch:{ all -> 0x0087 }
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
            android.content.Context r0 = r5.f10434b     // Catch:{ all -> 0x0087 }
            boolean r0 = p073j4.C4751b2.m30609d(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            h4.y0 r0 = r6.f24883A     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.pm0.m18664d(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zn2 r6 = r5.f10438f     // Catch:{ all -> 0x0087 }
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
            r5.f10435c = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.fo2 r0 = new com.google.android.gms.internal.ads.fo2     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.bo2 r1 = r5.f10437e     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.f10436d     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.go2 r3 = new com.google.android.gms.internal.ads.go2     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.mo9556a(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ho2.mo10860Z2(h4.l4):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo8931a() {
        j31 j31 = this.f10442r;
        if (j31 != null) {
            j31.mo11309k(C4409t.m29310b().mo18371b() - this.f10440h, 1);
        }
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() {
        return null;
    }

    /* renamed from: b */
    public final Bundle mo10862b() {
        return new Bundle();
    }

    /* renamed from: c */
    public final synchronized C4571q4 mo10863c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final /* synthetic */ void mo10864c0() {
        m13935J6(5);
    }

    /* renamed from: c1 */
    public final void mo10865c1(C4591u0 u0Var) {
    }

    /* renamed from: d */
    public final synchronized void mo8932d() {
        if (this.f10442r != null) {
            this.f10440h = C4409t.m29310b().mo18371b();
            int h = this.f10442r.mo11306h();
            if (h > 0) {
                j21 j21 = new j21(this.f10433a.mo9712c(), C4409t.m29310b());
                this.f10441i = j21;
                j21.mo11304d(h, new eo2(this));
            }
        }
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
        return this.f10436d;
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

    /* renamed from: i5 */
    public final void mo8933i5() {
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

    /* renamed from: o3 */
    public final void mo8934o3() {
    }

    /* renamed from: o5 */
    public final void mo10875o5(boolean z) {
    }

    /* renamed from: o6 */
    public final void mo10876o6(C4954a aVar) {
    }

    /* renamed from: p */
    public final void mo8935p(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            m13935J6(2);
        } else if (i2 == 1) {
            m13935J6(4);
        } else if (i2 == 2) {
            m13935J6(3);
        } else if (i2 == 3) {
            m13935J6(6);
        }
    }

    /* renamed from: p4 */
    public final synchronized void mo10877p4(C4499e4 e4Var) {
    }

    /* renamed from: q */
    public final synchronized void mo10878q() {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        j31 j31 = this.f10442r;
        if (j31 != null) {
            j31.mo11305a();
        }
    }

    /* renamed from: r6 */
    public final void mo8936r6() {
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
        this.f10438f.mo15634x(rtVar);
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) {
        this.f10437e.mo11179k(w4Var);
    }

    /* renamed from: y6 */
    public final synchronized void mo10884y6(boolean z) {
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) {
    }

    public final void zza() {
        m13935J6(3);
    }
}
