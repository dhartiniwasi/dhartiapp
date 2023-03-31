package p106o2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4216m;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: o2.f0 */
/* compiled from: TsDurationReader */
final class C5177f0 {

    /* renamed from: a */
    private final int f26764a;

    /* renamed from: b */
    private final C5940i0 f26765b = new C5940i0(0);

    /* renamed from: c */
    private final C5918a0 f26766c = new C5918a0();

    /* renamed from: d */
    private boolean f26767d;

    /* renamed from: e */
    private boolean f26768e;

    /* renamed from: f */
    private boolean f26769f;

    /* renamed from: g */
    private long f26770g = -9223372036854775807L;

    /* renamed from: h */
    private long f26771h = -9223372036854775807L;

    /* renamed from: i */
    private long f26772i = -9223372036854775807L;

    C5177f0(int i) {
        this.f26764a = i;
    }

    /* renamed from: a */
    private int m32143a(C4216m mVar) {
        this.f26766c.mo20543L(C5953m0.f29115f);
        this.f26767d = true;
        mVar.mo17560j();
        return 0;
    }

    /* renamed from: f */
    private int m32144f(C4216m mVar, C4190a0 a0Var, int i) throws IOException {
        int min = (int) Math.min((long) this.f26764a, mVar.mo17553b());
        long j = (long) 0;
        if (mVar.mo17554c() != j) {
            a0Var.f23479a = j;
            return 1;
        }
        this.f26766c.mo20542K(min);
        mVar.mo17560j();
        mVar.mo17563p(this.f26766c.mo20551d(), 0, min);
        this.f26770g = m32145g(this.f26766c, i);
        this.f26768e = true;
        return 0;
    }

    /* renamed from: g */
    private long m32145g(C5918a0 a0Var, int i) {
        int f = a0Var.mo20553f();
        for (int e = a0Var.mo20552e(); e < f; e++) {
            if (a0Var.mo20551d()[e] == 71) {
                long c = C5189j0.m32236c(a0Var, e, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private int m32146h(C4216m mVar, C4190a0 a0Var, int i) throws IOException {
        long b = mVar.mo17553b();
        int min = (int) Math.min((long) this.f26764a, b);
        long j = b - ((long) min);
        if (mVar.mo17554c() != j) {
            a0Var.f23479a = j;
            return 1;
        }
        this.f26766c.mo20542K(min);
        mVar.mo17560j();
        mVar.mo17563p(this.f26766c.mo20551d(), 0, min);
        this.f26771h = m32147i(this.f26766c, i);
        this.f26769f = true;
        return 0;
    }

    /* renamed from: i */
    private long m32147i(C5918a0 a0Var, int i) {
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        for (int i2 = f - 188; i2 >= e; i2--) {
            if (C5189j0.m32235b(a0Var.mo20551d(), e, f, i2)) {
                long c = C5189j0.m32236c(a0Var, i2, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo19157b() {
        return this.f26772i;
    }

    /* renamed from: c */
    public C5940i0 mo19158c() {
        return this.f26765b;
    }

    /* renamed from: d */
    public boolean mo19159d() {
        return this.f26767d;
    }

    /* renamed from: e */
    public int mo19160e(C4216m mVar, C4190a0 a0Var, int i) throws IOException {
        if (i <= 0) {
            return m32143a(mVar);
        }
        if (!this.f26769f) {
            return m32146h(mVar, a0Var, i);
        }
        if (this.f26771h == -9223372036854775807L) {
            return m32143a(mVar);
        }
        if (!this.f26768e) {
            return m32144f(mVar, a0Var, i);
        }
        long j = this.f26770g;
        if (j == -9223372036854775807L) {
            return m32143a(mVar);
        }
        long b = this.f26765b.mo20622b(this.f26771h) - this.f26765b.mo20622b(j);
        this.f26772i = b;
        if (b < 0) {
            C5961r.m35215i("TsDurationReader", "Invalid duration: " + this.f26772i + ". Using TIME_UNSET instead.");
            this.f26772i = -9223372036854775807L;
        }
        return m32143a(mVar);
    }
}
