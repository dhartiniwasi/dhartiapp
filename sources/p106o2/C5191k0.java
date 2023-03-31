package p106o2;

import java.util.List;
import p037e2.C4195c;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: o2.k0 */
/* compiled from: UserDataReader */
final class C5191k0 {

    /* renamed from: a */
    private final List<C6272r1> f26860a;

    /* renamed from: b */
    private final C4200e0[] f26861b;

    public C5191k0(List<C6272r1> list) {
        this.f26860a = list;
        this.f26861b = new C4200e0[list.size()];
    }

    /* renamed from: a */
    public void mo19167a(long j, C5918a0 a0Var) {
        if (a0Var.mo20548a() >= 9) {
            int m = a0Var.mo20560m();
            int m2 = a0Var.mo20560m();
            int C = a0Var.mo20534C();
            if (m == 434 && m2 == 1195456820 && C == 3) {
                C4195c.m28376b(j, a0Var, this.f26861b);
            }
        }
    }

    /* renamed from: b */
    public void mo19168b(C4217n nVar, C5183i0.C5187d dVar) {
        for (int i = 0; i < this.f26861b.length; i++) {
            dVar.mo19164a();
            C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 3);
            C6272r1 r1Var = this.f26860a.get(i);
            String str = r1Var.f30243t;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C5917a.m34869b(z, "Invalid closed caption mime type provided: " + str);
            f.mo6845e(new C6272r1.C6274b().mo21505S(dVar.mo19165b()).mo21517e0(str).mo21519g0(r1Var.f30235d).mo21508V(r1Var.f30234c).mo21492F(r1Var.f30229L).mo21506T(r1Var.f30245v).mo21491E());
            this.f26861b[i] = f;
        }
    }
}
