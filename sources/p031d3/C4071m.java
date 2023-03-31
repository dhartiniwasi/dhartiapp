package p031d3;

import java.io.IOException;
import p031d3.C4061g;
import p037e2.C4202f;
import p155v3.C5828l;
import p155v3.C5835o;
import p155v3.C5836o0;
import p155v3.C5837p;
import p177z1.C6272r1;

/* renamed from: d3.m */
/* compiled from: InitializationChunk */
public final class C4071m extends C4060f {

    /* renamed from: j */
    private final C4061g f23209j;

    /* renamed from: k */
    private C4061g.C4063b f23210k;

    /* renamed from: l */
    private long f23211l;

    /* renamed from: m */
    private volatile boolean f23212m;

    public C4071m(C5828l lVar, C5837p pVar, C6272r1 r1Var, int i, Object obj, C4061g gVar) {
        super(lVar, pVar, 2, r1Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f23209j = gVar;
    }

    /* renamed from: b */
    public void mo6786b() throws IOException {
        C4202f fVar;
        if (this.f23211l == 0) {
            this.f23209j.mo17274c(this.f23210k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C5837p e = this.f23163b.mo20369e(this.f23211l);
            C5836o0 o0Var = this.f23170i;
            fVar = new C4202f(o0Var, e.f28887g, o0Var.mo6819o(e));
            do {
                if (this.f23212m || !this.f23209j.mo17273b(fVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f23209j.mo17273b(fVar));
            break;
            this.f23211l = fVar.mo17554c() - this.f23163b.f28887g;
            C5835o.m34625a(this.f23170i);
        } catch (Throwable th) {
            C5835o.m34625a(this.f23170i);
            throw th;
        }
    }

    /* renamed from: c */
    public void mo6787c() {
        this.f23212m = true;
    }

    /* renamed from: g */
    public void mo17301g(C4061g.C4063b bVar) {
        this.f23210k = bVar;
    }
}
