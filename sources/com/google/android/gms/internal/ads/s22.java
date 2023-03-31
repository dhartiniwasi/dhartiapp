package com.google.android.gms.internal.ads;

import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s22 implements tc1, lb1, z91 {

    /* renamed from: a */
    private final tx2 f17205a;

    /* renamed from: b */
    private final ux2 f17206b;

    /* renamed from: c */
    private final cm0 f17207c;

    public s22(tx2 tx2, ux2 ux2, cm0 cm0) {
        this.f17205a = tx2;
        this.f17206b = ux2;
        this.f17207c = cm0;
    }

    /* renamed from: a0 */
    public final void mo10019a0() {
        ux2 ux2 = this.f17206b;
        tx2 tx2 = this.f17205a;
        tx2.mo14409a("action", "loaded");
        ux2.mo8622a(tx2);
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        tx2 tx2 = this.f17205a;
        tx2.mo14409a("action", "ftl");
        tx2.mo14409a("ftl", String.valueOf(z2Var.f25062a));
        tx2.mo14409a("ed", z2Var.f25064c);
        this.f17206b.mo8622a(this.f17205a);
    }

    /* renamed from: t */
    public final void mo10020t(us2 us2) {
        this.f17205a.mo14414h(us2, this.f17207c);
    }

    /* renamed from: v */
    public final void mo10021v(yg0 yg0) {
        this.f17205a.mo14415i(yg0.f20594a);
    }
}
