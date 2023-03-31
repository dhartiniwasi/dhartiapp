package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ya0 {

    /* renamed from: a */
    private final aa0 f20539a;

    /* renamed from: b */
    private lf3 f20540b;

    ya0(aa0 aa0) {
        this.f20539a = aa0;
    }

    /* renamed from: d */
    private final void m23819d() {
        if (this.f20540b == null) {
            in0 in0 = new in0();
            this.f20540b = in0;
            this.f20539a.mo8282b((C2955ve) null).mo13311e(new wa0(in0), new xa0(in0));
        }
    }

    /* renamed from: a */
    public final bb0 mo15352a(String str, ia0 ia0, ha0 ha0) {
        m23819d();
        return new bb0(this.f20540b, "google.afma.activeView.handleUpdate", ia0, ha0);
    }

    /* renamed from: b */
    public final void mo15353b(String str, e60 e60) {
        m23819d();
        this.f20540b = cf3.m10916n(this.f20540b, new ua0(str, e60), dn0.f8330f);
    }

    /* renamed from: c */
    public final void mo15354c(String str, e60 e60) {
        this.f20540b = cf3.m10915m(this.f20540b, new va0(str, e60), dn0.f8330f);
    }
}
