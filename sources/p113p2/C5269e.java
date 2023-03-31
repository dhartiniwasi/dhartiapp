package p113p2;

import p037e2.C4192b0;
import p037e2.C4196c0;
import p161w3.C5953m0;

/* renamed from: p2.e */
/* compiled from: WavSeekMap */
final class C5269e implements C4192b0 {

    /* renamed from: a */
    private final C5266c f27170a;

    /* renamed from: b */
    private final int f27171b;

    /* renamed from: c */
    private final long f27172c;

    /* renamed from: d */
    private final long f27173d;

    /* renamed from: e */
    private final long f27174e;

    public C5269e(C5266c cVar, int i, long j, long j2) {
        this.f27170a = cVar;
        this.f27171b = i;
        this.f27172c = j;
        long j3 = (j2 - j) / ((long) cVar.f27165e);
        this.f27173d = j3;
        this.f27174e = m32513a(j3);
    }

    /* renamed from: a */
    private long m32513a(long j) {
        return C5953m0.m35095N0(j * ((long) this.f27171b), 1000000, (long) this.f27170a.f27163c);
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        long r = C5953m0.m35154r((((long) this.f27170a.f27163c) * j) / (((long) this.f27171b) * 1000000), 0, this.f27173d - 1);
        long j2 = this.f27172c + (((long) this.f27170a.f27165e) * r);
        long a = m32513a(r);
        C4196c0 c0Var = new C4196c0(a, j2);
        if (a >= j || r == this.f27173d - 1) {
            return new C4192b0.C4193a(c0Var);
        }
        long j3 = r + 1;
        return new C4192b0.C4193a(c0Var, new C4196c0(m32513a(j3), this.f27172c + (((long) this.f27170a.f27165e) * j3)));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f27174e;
    }
}
