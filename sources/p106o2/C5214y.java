package p106o2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4216m;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: o2.y */
/* compiled from: PsDurationReader */
final class C5214y {

    /* renamed from: a */
    private final C5940i0 f27053a = new C5940i0(0);

    /* renamed from: b */
    private final C5918a0 f27054b = new C5918a0();

    /* renamed from: c */
    private boolean f27055c;

    /* renamed from: d */
    private boolean f27056d;

    /* renamed from: e */
    private boolean f27057e;

    /* renamed from: f */
    private long f27058f = -9223372036854775807L;

    /* renamed from: g */
    private long f27059g = -9223372036854775807L;

    /* renamed from: h */
    private long f27060h = -9223372036854775807L;

    C5214y() {
    }

    /* renamed from: a */
    private static boolean m32370a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int m32371b(C4216m mVar) {
        this.f27054b.mo20543L(C5953m0.f29115f);
        this.f27055c = true;
        mVar.mo17560j();
        return 0;
    }

    /* renamed from: f */
    private int m32372f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: h */
    private int m32373h(C4216m mVar, C4190a0 a0Var) throws IOException {
        int min = (int) Math.min(20000, mVar.mo17553b());
        long j = (long) 0;
        if (mVar.mo17554c() != j) {
            a0Var.f23479a = j;
            return 1;
        }
        this.f27054b.mo20542K(min);
        mVar.mo17560j();
        mVar.mo17563p(this.f27054b.mo20551d(), 0, min);
        this.f27058f = m32374i(this.f27054b);
        this.f27056d = true;
        return 0;
    }

    /* renamed from: i */
    private long m32374i(C5918a0 a0Var) {
        int f = a0Var.mo20553f();
        for (int e = a0Var.mo20552e(); e < f - 3; e++) {
            if (m32372f(a0Var.mo20551d(), e) == 442) {
                a0Var.mo20546O(e + 4);
                long l = m32377l(a0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    private int m32375j(C4216m mVar, C4190a0 a0Var) throws IOException {
        long b = mVar.mo17553b();
        int min = (int) Math.min(20000, b);
        long j = b - ((long) min);
        if (mVar.mo17554c() != j) {
            a0Var.f23479a = j;
            return 1;
        }
        this.f27054b.mo20542K(min);
        mVar.mo17560j();
        mVar.mo17563p(this.f27054b.mo20551d(), 0, min);
        this.f27059g = m32376k(this.f27054b);
        this.f27057e = true;
        return 0;
    }

    /* renamed from: k */
    private long m32376k(C5918a0 a0Var) {
        int e = a0Var.mo20552e();
        for (int f = a0Var.mo20553f() - 4; f >= e; f--) {
            if (m32372f(a0Var.mo20551d(), f) == 442) {
                a0Var.mo20546O(f + 4);
                long l = m32377l(a0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public static long m32377l(C5918a0 a0Var) {
        int e = a0Var.mo20552e();
        if (a0Var.mo20548a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.mo20557j(bArr, 0, 9);
        a0Var.mo20546O(e);
        if (!m32370a(bArr)) {
            return -9223372036854775807L;
        }
        return m32378m(bArr);
    }

    /* renamed from: m */
    private static long m32378m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: c */
    public long mo19199c() {
        return this.f27060h;
    }

    /* renamed from: d */
    public C5940i0 mo19200d() {
        return this.f27053a;
    }

    /* renamed from: e */
    public boolean mo19201e() {
        return this.f27055c;
    }

    /* renamed from: g */
    public int mo19202g(C4216m mVar, C4190a0 a0Var) throws IOException {
        if (!this.f27057e) {
            return m32375j(mVar, a0Var);
        }
        if (this.f27059g == -9223372036854775807L) {
            return m32371b(mVar);
        }
        if (!this.f27056d) {
            return m32373h(mVar, a0Var);
        }
        long j = this.f27058f;
        if (j == -9223372036854775807L) {
            return m32371b(mVar);
        }
        long b = this.f27053a.mo20622b(this.f27059g) - this.f27053a.mo20622b(j);
        this.f27060h = b;
        if (b < 0) {
            C5961r.m35215i("PsDurationReader", "Invalid duration: " + this.f27060h + ". Using TIME_UNSET instead.");
            this.f27060h = -9223372036854775807L;
        }
        return m32371b(mVar);
    }
}
