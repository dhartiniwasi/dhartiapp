package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nv2 {

    /* renamed from: a */
    private final qu2 f14209a;

    /* renamed from: b */
    private final lv2 f14210b;

    /* renamed from: c */
    private final mu2 f14211c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayDeque f14212d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public tv2 f14213e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f14214f = 1;

    public nv2(qu2 qu2, mu2 mu2, lv2 lv2) {
        this.f14209a = qu2;
        this.f14211c = mu2;
        this.f14210b = lv2;
        this.f14212d = new ArrayDeque();
        mu2.mo12445b(new iv2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m17288h() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14683s5)).booleanValue()) {
            if (!C4409t.m29325q().mo15117h().mo18486U().mo13848h()) {
                this.f14212d.clear();
                return;
            }
        }
        if (m17289i()) {
            while (!this.f14212d.isEmpty()) {
                mv2 mv2 = (mv2) this.f14212d.pollFirst();
                if (mv2 == null || (mv2.zza() != null && this.f14209a.mo13604c(mv2.zza()))) {
                    tv2 tv2 = new tv2(this.f14209a, this.f14210b, mv2);
                    this.f14213e = tv2;
                    tv2.mo14402d(new jv2(this, mv2));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private final synchronized boolean m17289i() {
        return this.f14213e == null;
    }

    /* renamed from: a */
    public final synchronized lf3 mo12718a(mv2 mv2) {
        this.f14214f = 2;
        if (m17289i()) {
            return null;
        }
        return this.f14213e.mo14399a(mv2);
    }

    /* renamed from: e */
    public final synchronized void mo12719e(mv2 mv2) {
        this.f14212d.add(mv2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo12720f() {
        synchronized (this) {
            this.f14214f = 1;
            m17288h();
        }
    }
}
