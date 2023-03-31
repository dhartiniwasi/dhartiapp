package p106o2;

import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: o2.v */
/* compiled from: PassthroughSectionPayloadReader */
public final class C5209v implements C5169b0 {

    /* renamed from: a */
    private C6272r1 f27036a;

    /* renamed from: b */
    private C5940i0 f27037b;

    /* renamed from: c */
    private C4200e0 f27038c;

    public C5209v(String str) {
        this.f27036a = new C6272r1.C6274b().mo21517e0(str).mo21491E();
    }

    /* renamed from: b */
    private void m32354b() {
        C5917a.m34875h(this.f27037b);
        C5953m0.m35138j(this.f27038c);
    }

    /* renamed from: a */
    public void mo19145a(C5918a0 a0Var) {
        m32354b();
        long d = this.f27037b.mo20624d();
        long e = this.f27037b.mo20625e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C6272r1 r1Var = this.f27036a;
            if (e != r1Var.f30247x) {
                C6272r1 E = r1Var.mo21483b().mo21521i0(e).mo21491E();
                this.f27036a = E;
                this.f27038c.mo6845e(E);
            }
            int a = a0Var.mo20548a();
            this.f27038c.mo6843d(a0Var, a);
            this.f27038c.mo6838a(d, 1, a, 0, (C4200e0.C4201a) null);
        }
    }

    /* renamed from: c */
    public void mo19146c(C5940i0 i0Var, C4217n nVar, C5183i0.C5187d dVar) {
        this.f27037b = i0Var;
        dVar.mo19164a();
        C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 5);
        this.f27038c = f;
        f.mo6845e(this.f27036a);
    }
}
