package com.google.android.gms.internal.ads;

import p060h4.C4596v;
import p067i5.C4691e;
import p073j4.C4794n1;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rj0 {

    /* renamed from: a */
    private final C4691e f16980a;

    /* renamed from: b */
    private final C4800p1 f16981b;

    /* renamed from: c */
    private final sk0 f16982c;

    rj0(C4691e eVar, C4800p1 p1Var, sk0 sk0) {
        this.f16980a = eVar;
        this.f16981b = p1Var;
        this.f16982c = sk0;
    }

    /* renamed from: a */
    public final void mo13821a() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14638o0)).booleanValue()) {
            this.f16982c.mo14042y();
        }
    }

    /* renamed from: b */
    public final void mo13822b(int i, long j) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14628n0)).booleanValue()) {
            if (j - this.f16981b.mo18485T() < 0) {
                C4794n1.m30693k("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14638o0)).booleanValue()) {
                this.f16981b.mo18505j(-1);
                this.f16981b.mo18507l(j);
            } else {
                this.f16981b.mo18505j(i);
                this.f16981b.mo18507l(j);
            }
            mo13821a();
        }
    }
}
