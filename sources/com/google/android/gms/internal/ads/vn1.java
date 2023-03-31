package com.google.android.gms.internal.ads;

import p124r.C5413a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vn1 implements qa1 {

    /* renamed from: a */
    private final xl1 f19169a;

    /* renamed from: b */
    private final cm1 f19170b;

    public vn1(xl1 xl1, cm1 cm1) {
        this.f19169a = xl1;
        this.f19170b = cm1;
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        xl1 xl1 = this.f19169a;
        if (xl1.mo15152c0() != null) {
            vs0 Y = xl1.mo15146Y();
            vs0 Z = xl1.mo15147Z();
            if (Y == null) {
                Y = Z == null ? null : Z;
            }
            if (this.f19170b.mo8873d() && Y != null) {
                Y.mo9081R("onSdkImpression", new C5413a());
            }
        }
    }
}
