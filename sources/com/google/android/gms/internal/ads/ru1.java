package com.google.android.gms.internal.ads;

import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ru1 implements tc1, lb1, z91 {

    /* renamed from: a */
    private final bv1 f17102a;

    /* renamed from: b */
    private final lv1 f17103b;

    public ru1(bv1 bv1, lv1 lv1) {
        this.f17102a = bv1;
        this.f17103b = lv1;
    }

    /* renamed from: a0 */
    public final void mo10019a0() {
        this.f17102a.mo8951a().put("action", "loaded");
        this.f17103b.mo12717e(this.f17102a.mo8951a());
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        this.f17102a.mo8951a().put("action", "ftl");
        this.f17102a.mo8951a().put("ftl", String.valueOf(z2Var.f25062a));
        this.f17102a.mo8951a().put("ed", z2Var.f25064c);
        this.f17103b.mo12717e(this.f17102a.mo8951a());
    }

    /* renamed from: t */
    public final void mo10020t(us2 us2) {
        this.f17102a.mo8952b(us2);
    }

    /* renamed from: v */
    public final void mo10021v(yg0 yg0) {
        this.f17102a.mo8953c(yg0.f20594a);
    }
}
