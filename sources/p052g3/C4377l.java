package p052g3;

import java.io.IOException;
import p015b3.C1749q0;
import p021c2.C1848g;
import p161w3.C5917a;
import p177z1.C6279s1;

/* renamed from: g3.l */
/* compiled from: HlsSampleStream */
final class C4377l implements C1749q0 {

    /* renamed from: a */
    private final int f24407a;

    /* renamed from: b */
    private final C4378p f24408b;

    /* renamed from: c */
    private int f24409c = -1;

    public C4377l(C4378p pVar, int i) {
        this.f24408b = pVar;
        this.f24407a = i;
    }

    /* renamed from: c */
    private boolean m29114c() {
        int i = this.f24409c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: a */
    public void mo17844a() {
        C5917a.m34868a(this.f24409c == -1);
        this.f24409c = this.f24408b.mo17871x(this.f24407a);
    }

    /* renamed from: b */
    public void mo6700b() throws IOException {
        int i = this.f24409c;
        if (i == -2) {
            throw new C4387r(this.f24408b.mo17869s().mo6903b(this.f24407a).mo6897b(0).f30243t);
        } else if (i == -1) {
            this.f24408b.mo17849T();
        } else if (i != -3) {
            this.f24408b.mo17850U(i);
        }
    }

    /* renamed from: d */
    public void mo17845d() {
        if (this.f24409c != -1) {
            this.f24408b.mo17868o0(this.f24407a);
            this.f24409c = -1;
        }
    }

    /* renamed from: f */
    public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
        if (this.f24409c == -3) {
            gVar.mo7028k(4);
            return -4;
        } else if (m29114c()) {
            return this.f24408b.mo17859d0(this.f24409c, s1Var, gVar, i);
        } else {
            return -3;
        }
    }

    public boolean isReady() {
        return this.f24409c == -3 || (m29114c() && this.f24408b.mo17847P(this.f24409c));
    }

    /* renamed from: l */
    public int mo6703l(long j) {
        if (m29114c()) {
            return this.f24408b.mo17867n0(this.f24409c, j);
        }
        return 0;
    }
}
