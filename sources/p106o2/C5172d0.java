package p106o2;

import java.util.List;
import p037e2.C4195c;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: o2.d0 */
/* compiled from: SeiReader */
public final class C5172d0 {

    /* renamed from: a */
    private final List<C6272r1> f26741a;

    /* renamed from: b */
    private final C4200e0[] f26742b;

    public C5172d0(List<C6272r1> list) {
        this.f26741a = list;
        this.f26742b = new C4200e0[list.size()];
    }

    /* renamed from: a */
    public void mo19155a(long j, C5918a0 a0Var) {
        C4195c.m28375a(j, a0Var, this.f26742b);
    }

    /* renamed from: b */
    public void mo19156b(C4217n nVar, C5183i0.C5187d dVar) {
        for (int i = 0; i < this.f26742b.length; i++) {
            dVar.mo19164a();
            C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 3);
            C6272r1 r1Var = this.f26741a.get(i);
            String str = r1Var.f30243t;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C5917a.m34869b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = r1Var.f30232a;
            if (str2 == null) {
                str2 = dVar.mo19165b();
            }
            f.mo6845e(new C6272r1.C6274b().mo21505S(str2).mo21517e0(str).mo21519g0(r1Var.f30235d).mo21508V(r1Var.f30234c).mo21492F(r1Var.f30229L).mo21506T(r1Var.f30245v).mo21491E());
            this.f26742b[i] = f;
        }
    }
}
