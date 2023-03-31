package com.google.android.gms.internal.ads;

import p053g4.C4409t;
import p073j4.C4749b0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tl0 extends C4749b0 {

    /* renamed from: c */
    final /* synthetic */ xl0 f18130c;

    tl0(xl0 xl0) {
        this.f18130c = xl0;
    }

    /* renamed from: a */
    public final void mo14322a() {
        xl0 xl0 = this.f18130c;
        C2791qz qzVar = new C2791qz(xl0.f20162e, xl0.f20163f.f19150a);
        synchronized (this.f18130c.f20158a) {
            try {
                C4409t.m29315g();
                C2902tz.m21353a(this.f18130c.f20164g, qzVar);
            } catch (IllegalArgumentException e) {
                pm0.m18668h("Cannot config CSI reporter.", e);
            }
        }
    }
}
