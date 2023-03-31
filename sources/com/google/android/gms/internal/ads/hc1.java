package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p060h4.C4583s4;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hc1 extends kf1 implements qa1, wb1 {

    /* renamed from: b */
    private final is2 f10273b;

    /* renamed from: c */
    private final AtomicBoolean f10274c = new AtomicBoolean();

    public hc1(Set set, is2 is2) {
        super(set);
        this.f10273b = is2;
    }

    /* renamed from: d */
    private final void m13792d() {
        C4583s4 s4Var;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14329I6)).booleanValue() && this.f10274c.compareAndSet(false, true) && (s4Var = this.f10273b.f10981g0) != null && s4Var.f25001a == 3) {
            mo11671o0(new gc1(this));
        }
    }

    /* renamed from: U */
    public final void mo10491U() {
        if (this.f10273b.f10970b == 1) {
            m13792d();
        }
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        int i = this.f10273b.f10970b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            m13792d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final /* synthetic */ void mo10796p0(jc1 jc1) throws Exception {
        jc1.mo10492c(this.f10273b.f10981g0);
    }
}
