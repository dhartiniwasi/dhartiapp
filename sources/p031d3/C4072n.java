package p031d3;

import p155v3.C5828l;
import p155v3.C5837p;
import p161w3.C5917a;
import p177z1.C6272r1;

/* renamed from: d3.n */
/* compiled from: MediaChunk */
public abstract class C4072n extends C4060f {

    /* renamed from: j */
    public final long f23213j;

    public C4072n(C5828l lVar, C5837p pVar, C6272r1 r1Var, int i, Object obj, long j, long j2, long j3) {
        super(lVar, pVar, 1, r1Var, i, obj, j, j2);
        C5917a.m34872e(r1Var);
        this.f23213j = j3;
    }

    /* renamed from: g */
    public long mo17296g() {
        long j = this.f23213j;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    /* renamed from: h */
    public abstract boolean mo17297h();
}
