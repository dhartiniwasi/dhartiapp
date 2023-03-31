package p038e3;

import p037e2.C4197d;
import p045f3.C4264i;

/* renamed from: e3.h */
/* compiled from: DashWrappingSegmentIndex */
public final class C4237h implements C4235f {

    /* renamed from: a */
    private final C4197d f23596a;

    /* renamed from: b */
    private final long f23597b;

    public C4237h(C4197d dVar, long j) {
        this.f23596a = dVar;
        this.f23597b = j;
    }

    /* renamed from: b */
    public long mo17600b(long j) {
        return this.f23596a.f23491e[(int) j] - this.f23597b;
    }

    /* renamed from: c */
    public long mo17601c(long j, long j2) {
        return this.f23596a.f23490d[(int) j];
    }

    /* renamed from: d */
    public long mo17602d(long j, long j2) {
        return 0;
    }

    /* renamed from: e */
    public long mo17603e(long j, long j2) {
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public C4264i mo17604f(long j) {
        C4197d dVar = this.f23596a;
        int i = (int) j;
        return new C4264i((String) null, dVar.f23489c[i], (long) dVar.f23488b[i]);
    }

    /* renamed from: g */
    public long mo17605g(long j, long j2) {
        return (long) this.f23596a.mo17547a(j + this.f23597b);
    }

    /* renamed from: h */
    public boolean mo17606h() {
        return true;
    }

    /* renamed from: i */
    public long mo17607i() {
        return 0;
    }

    /* renamed from: j */
    public long mo17608j(long j) {
        return (long) this.f23596a.f23487a;
    }

    /* renamed from: k */
    public long mo17609k(long j, long j2) {
        return (long) this.f23596a.f23487a;
    }
}
