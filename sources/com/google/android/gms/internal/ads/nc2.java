package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p060h4.C4470a;
import p060h4.C4489d0;
import p060h4.C4491d2;
import p060h4.C4502f1;
import p060h4.C4507g0;
import p060h4.C4583s4;
import p060h4.C4596v;
import p060h4.C4609x0;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nc2 implements tc1, lb1, z91, qa1, C4470a, w91, jc1, C3106zh, ma1, qh1 {

    /* renamed from: a */
    private final AtomicReference f13949a = new AtomicReference();

    /* renamed from: b */
    private final AtomicReference f13950b = new AtomicReference();

    /* renamed from: c */
    private final AtomicReference f13951c = new AtomicReference();

    /* renamed from: d */
    private final AtomicReference f13952d = new AtomicReference();

    /* renamed from: e */
    private final AtomicReference f13953e = new AtomicReference();

    /* renamed from: f */
    private final AtomicBoolean f13954f = new AtomicBoolean(true);

    /* renamed from: g */
    private final AtomicBoolean f13955g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f13956h = new AtomicBoolean(false);

    /* renamed from: i */
    private final ux2 f13957i;

    /* renamed from: r */
    final BlockingQueue f13958r = new ArrayBlockingQueue(((Integer) C4596v.m30088c().mo12227b(C2679nz.f14260B7)).intValue());

    public nc2(ux2 ux2) {
        this.f13957i = ux2;
    }

    /* renamed from: F */
    private final void m17017F() {
        if (this.f13955g.get() && this.f13956h.get()) {
            for (Pair dc2 : this.f13958r) {
                ip2.m14473a(this.f13950b, new dc2(dc2));
            }
            this.f13958r.clear();
            this.f13954f.set(false);
        }
    }

    /* renamed from: D */
    public final void mo12580D(C4502f1 f1Var) {
        this.f13953e.set(f1Var);
    }

    /* renamed from: R */
    public final void mo10490R(C4623z2 z2Var) {
        ip2.m14473a(this.f13953e, new ac2(z2Var));
    }

    /* renamed from: W */
    public final void mo8333W() {
        ip2.m14473a(this.f13949a, mc2.f13305a);
        ip2.m14473a(this.f13953e, vb2.f19001a);
    }

    /* renamed from: Y */
    public final void mo8334Y() {
        ip2.m14473a(this.f13949a, wb2.f19573a);
        ip2.m14473a(this.f13953e, xb2.f20064a);
        ip2.m14473a(this.f13953e, yb2.f20548a);
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        ip2.m14473a(this.f13949a, ub2.f18487a);
    }

    /* renamed from: a */
    public final synchronized C4489d0 mo12581a() {
        return (C4489d0) this.f13949a.get();
    }

    /* renamed from: a0 */
    public final synchronized void mo10019a0() {
        ip2.m14473a(this.f13949a, kc2.f12015a);
        ip2.m14473a(this.f13952d, lc2.f12733a);
        this.f13956h.set(true);
        m17017F();
    }

    /* renamed from: c */
    public final void mo10492c(C4583s4 s4Var) {
        ip2.m14473a(this.f13951c, new bc2(s4Var));
    }

    /* renamed from: c0 */
    public final void mo8335c0() {
        ip2.m14473a(this.f13949a, cc2.f7680a);
    }

    /* renamed from: d */
    public final synchronized C4609x0 mo12582d() {
        return (C4609x0) this.f13950b.get();
    }

    /* renamed from: e */
    public final void mo12583e(C4489d0 d0Var) {
        this.f13949a.set(d0Var);
    }

    /* renamed from: e0 */
    public final void mo8336e0() {
    }

    /* renamed from: f */
    public final void mo12584f(C4507g0 g0Var) {
        this.f13952d.set(g0Var);
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        ip2.m14473a(this.f13949a, new gc2(z2Var));
        ip2.m14473a(this.f13949a, new ic2(z2Var));
        ip2.m14473a(this.f13952d, new jc2(z2Var));
        this.f13954f.set(false);
        this.f13958r.clear();
    }

    /* renamed from: h */
    public final void mo9272h() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14726w8)).booleanValue()) {
            ip2.m14473a(this.f13949a, ec2.f8732a);
        }
        ip2.m14473a(this.f13953e, fc2.f9214a);
    }

    /* renamed from: j */
    public final void mo8337j(oh0 oh0, String str, String str2) {
    }

    /* renamed from: k */
    public final void mo12585k(C4491d2 d2Var) {
        this.f13951c.set(d2Var);
    }

    public final void onAdClicked() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14726w8)).booleanValue()) {
            ip2.m14473a(this.f13949a, ec2.f8732a);
        }
    }

    /* renamed from: p */
    public final void mo12586p(C4609x0 x0Var) {
        this.f13950b.set(x0Var);
        this.f13955g.set(true);
        m17017F();
    }

    /* renamed from: t */
    public final void mo10020t(us2 us2) {
        this.f13954f.set(true);
        this.f13956h.set(false);
    }

    /* renamed from: v */
    public final void mo10021v(yg0 yg0) {
    }

    /* renamed from: x */
    public final void mo8338x() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10022z(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f13954f     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue r0 = r3.f13958r     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.pm0.m18662b(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.ux2 r0 = r3.f13957i     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.tx2 r1 = com.google.android.gms.internal.ads.tx2.m21328b(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.mo14409a(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.mo14409a(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.mo8622a(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f13950b     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zb2 r1 = new com.google.android.gms.internal.ads.zb2     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.ip2.m14473a(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nc2.mo10022z(java.lang.String, java.lang.String):void");
    }
}
