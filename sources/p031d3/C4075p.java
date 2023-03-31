package p031d3;

import java.io.IOException;
import p037e2.C4200e0;
import p037e2.C4202f;
import p155v3.C5828l;
import p155v3.C5835o;
import p155v3.C5837p;
import p177z1.C6272r1;

/* renamed from: d3.p */
/* compiled from: SingleSampleMediaChunk */
public final class C4075p extends C4055a {

    /* renamed from: o */
    private final int f23215o;

    /* renamed from: p */
    private final C6272r1 f23216p;

    /* renamed from: q */
    private long f23217q;

    /* renamed from: r */
    private boolean f23218r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4075p(C5828l lVar, C5837p pVar, C6272r1 r1Var, int i, Object obj, long j, long j2, long j3, int i2, C6272r1 r1Var2) {
        super(lVar, pVar, r1Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f23215o = i2;
        this.f23216p = r1Var2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo6786b() throws IOException {
        C4057c j = mo17262j();
        j.mo17270b(0);
        C4200e0 f = j.mo17271f(0, this.f23215o);
        f.mo6845e(this.f23216p);
        try {
            long o = this.f23170i.mo6819o(this.f23163b.mo20369e(this.f23217q));
            if (o != -1) {
                o += this.f23217q;
            }
            C4202f fVar = new C4202f(this.f23170i, this.f23217q, o);
            for (int i = 0; i != -1; i = f.mo6840b(fVar, Integer.MAX_VALUE, true)) {
                this.f23217q += (long) i;
            }
            f.mo6838a(this.f23168g, 1, (int) this.f23217q, 0, (C4200e0.C4201a) null);
            C5835o.m34625a(this.f23170i);
            this.f23218r = true;
        } catch (Throwable th) {
            C5835o.m34625a(this.f23170i);
            throw th;
        }
    }

    /* renamed from: c */
    public void mo6787c() {
    }

    /* renamed from: h */
    public boolean mo17297h() {
        return this.f23218r;
    }
}
