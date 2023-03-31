package com.google.android.gms.internal.ads;

import android.content.Context;
import p023c4.C1859a;
import p023c4.C1868g;
import p060h4.C4484c1;
import p060h4.C4489d0;
import p060h4.C4525j0;
import p060h4.C4537l0;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qb2 extends C4537l0 {

    /* renamed from: a */
    private final Context f16330a;

    /* renamed from: b */
    private final su0 f16331b;

    /* renamed from: c */
    final ct2 f16332c;

    /* renamed from: d */
    final gm1 f16333d = new gm1();

    /* renamed from: e */
    private C4489d0 f16334e;

    public qb2(su0 su0, Context context, String str) {
        ct2 ct2 = new ct2();
        this.f16332c = ct2;
        this.f16331b = su0;
        ct2.mo9328J(str);
        this.f16330a = context;
    }

    /* renamed from: B6 */
    public final void mo13509B6(C4484c1 c1Var) {
        this.f16332c.mo9345q(c1Var);
    }

    /* renamed from: D6 */
    public final void mo13510D6(C4489d0 d0Var) {
        this.f16334e = d0Var;
    }

    /* renamed from: H1 */
    public final void mo13511H1(e40 e40) {
        this.f16333d.mo10577f(e40);
    }

    /* renamed from: J1 */
    public final void mo13512J1(r30 r30) {
        this.f16333d.mo10573b(r30);
    }

    /* renamed from: R4 */
    public final void mo13513R4(String str, x30 x30, u30 u30) {
        this.f16333d.mo10574c(str, x30, u30);
    }

    /* renamed from: U0 */
    public final void mo13514U0(o80 o80) {
        this.f16333d.mo10575d(o80);
    }

    /* renamed from: Y4 */
    public final void mo13515Y4(C1859a aVar) {
        this.f16332c.mo9326H(aVar);
    }

    /* renamed from: a */
    public final C4525j0 mo13516a() {
        jm1 g = this.f16333d.mo10578g();
        this.f16332c.mo9337b(g.mo11447i());
        this.f16332c.mo9338c(g.mo11446h());
        ct2 ct2 = this.f16332c;
        if (ct2.mo9347x() == null) {
            ct2.mo9327I(C4571q4.m29983K1());
        }
        return new rb2(this.f16330a, this.f16331b, this.f16332c, g, this.f16334e);
    }

    /* renamed from: a1 */
    public final void mo13517a1(C1868g gVar) {
        this.f16332c.mo9339d(gVar);
    }

    /* renamed from: a4 */
    public final void mo13518a4(b40 b40, C4571q4 q4Var) {
        this.f16333d.mo10576e(b40);
        this.f16332c.mo9327I(q4Var);
    }

    /* renamed from: c5 */
    public final void mo13519c5(o30 o30) {
        this.f16333d.mo10572a(o30);
    }

    /* renamed from: q1 */
    public final void mo13520q1(f20 f20) {
        this.f16332c.mo9336a(f20);
    }

    /* renamed from: s4 */
    public final void mo13521s4(f80 f80) {
        this.f16332c.mo9331M(f80);
    }
}
