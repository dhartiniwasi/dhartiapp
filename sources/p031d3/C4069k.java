package p031d3;

import java.io.IOException;
import p031d3.C4061g;
import p037e2.C4202f;
import p155v3.C5828l;
import p155v3.C5835o;
import p155v3.C5836o0;
import p155v3.C5837p;
import p177z1.C6272r1;

/* renamed from: d3.k */
/* compiled from: ContainerMediaChunk */
public class C4069k extends C4055a {

    /* renamed from: o */
    private final int f23201o;

    /* renamed from: p */
    private final long f23202p;

    /* renamed from: q */
    private final C4061g f23203q;

    /* renamed from: r */
    private long f23204r;

    /* renamed from: s */
    private volatile boolean f23205s;

    /* renamed from: t */
    private boolean f23206t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4069k(C5828l lVar, C5837p pVar, C6272r1 r1Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, C4061g gVar) {
        super(lVar, pVar, r1Var, i, obj, j, j2, j3, j4, j5);
        this.f23201o = i2;
        this.f23202p = j6;
        this.f23203q = gVar;
    }

    /* renamed from: b */
    public final void mo6786b() throws IOException {
        C4202f fVar;
        if (this.f23204r == 0) {
            C4057c j = mo17262j();
            j.mo17270b(this.f23202p);
            C4061g gVar = this.f23203q;
            C4061g.C4063b l = mo17298l(j);
            long j2 = this.f23135k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f23202p;
            long j4 = this.f23136l;
            gVar.mo17274c(l, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.f23202p);
        }
        try {
            C5837p e = this.f23163b.mo20369e(this.f23204r);
            C5836o0 o0Var = this.f23170i;
            fVar = new C4202f(o0Var, e.f28887g, o0Var.mo6819o(e));
            do {
                if (this.f23205s || !this.f23203q.mo17273b(fVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f23203q.mo17273b(fVar));
            break;
            this.f23204r = fVar.mo17554c() - this.f23163b.f28887g;
            C5835o.m34625a(this.f23170i);
            this.f23206t = !this.f23205s;
        } catch (Throwable th) {
            C5835o.m34625a(this.f23170i);
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo6787c() {
        this.f23205s = true;
    }

    /* renamed from: g */
    public long mo17296g() {
        return this.f23213j + ((long) this.f23201o);
    }

    /* renamed from: h */
    public boolean mo17297h() {
        return this.f23206t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4061g.C4063b mo17298l(C4057c cVar) {
        return cVar;
    }
}
