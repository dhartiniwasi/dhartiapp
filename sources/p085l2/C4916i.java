package p085l2;

import p014b2.C1635f0;
import p037e2.C4192b0;
import p037e2.C4196c0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: l2.i */
/* compiled from: XingSeeker */
final class C4916i implements C4913g {

    /* renamed from: a */
    private final long f25900a;

    /* renamed from: b */
    private final int f25901b;

    /* renamed from: c */
    private final long f25902c;

    /* renamed from: d */
    private final long f25903d;

    /* renamed from: e */
    private final long f25904e;

    /* renamed from: f */
    private final long[] f25905f;

    private C4916i(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    /* renamed from: a */
    public static C4916i m31182a(long j, long j2, C1635f0.C1636a aVar, C5918a0 a0Var) {
        int G;
        long j3 = j;
        C1635f0.C1636a aVar2 = aVar;
        int i = aVar2.f4699g;
        int i2 = aVar2.f4696d;
        int m = a0Var.mo20560m();
        if ((m & 1) != 1 || (G = a0Var.mo20538G()) == 0) {
            return null;
        }
        long N0 = C5953m0.m35095N0((long) G, ((long) i) * 1000000, (long) i2);
        if ((m & 6) != 6) {
            return new C4916i(j2, aVar2.f4695c, N0);
        }
        long E = a0Var.mo20536E();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) a0Var.mo20534C();
        }
        if (j3 != -1) {
            long j4 = j2 + E;
            if (j3 != j4) {
                C5961r.m35215i("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new C4916i(j2, aVar2.f4695c, N0, E, jArr);
    }

    /* renamed from: c */
    private long m31183c(int i) {
        return (this.f25902c * ((long) i)) / 100;
    }

    /* renamed from: b */
    public long mo18735b(long j) {
        long j2;
        long j3 = j - this.f25900a;
        if (!mo17534g() || j3 <= ((long) this.f25901b)) {
            return 0;
        }
        long[] jArr = (long[]) C5917a.m34875h(this.f25905f);
        double d = (((double) j3) * 256.0d) / ((double) this.f25903d);
        int i = C5953m0.m35136i(jArr, (long) d, true, true);
        long c = m31183c(i);
        long j4 = jArr[i];
        int i2 = i + 1;
        long c2 = m31183c(i2);
        if (i == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i2];
        }
        return c + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (c2 - c)));
    }

    /* renamed from: f */
    public long mo18736f() {
        return this.f25904e;
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return this.f25905f != null;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        double d;
        if (!mo17534g()) {
            return new C4192b0.C4193a(new C4196c0(0, this.f25900a + ((long) this.f25901b)));
        }
        long r = C5953m0.m35154r(j, 0, this.f25902c);
        double d2 = (((double) r) * 100.0d) / ((double) this.f25902c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) C5917a.m34875h(this.f25905f);
                double d4 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        return new C4192b0.C4193a(new C4196c0(r, this.f25900a + C5953m0.m35154r(Math.round((d3 / 256.0d) * ((double) this.f25903d)), (long) this.f25901b, this.f25903d - 1)));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f25902c;
    }

    private C4916i(long j, int i, long j2, long j3, long[] jArr) {
        this.f25900a = j;
        this.f25901b = i;
        this.f25902c = j2;
        this.f25905f = jArr;
        this.f25903d = j3;
        this.f25904e = j3 != -1 ? j + j3 : -1;
    }
}
