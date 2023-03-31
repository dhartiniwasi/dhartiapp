package p085l2;

import p014b2.C1635f0;
import p037e2.C4192b0;
import p037e2.C4196c0;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: l2.h */
/* compiled from: VbriSeeker */
final class C4915h implements C4913g {

    /* renamed from: a */
    private final long[] f25896a;

    /* renamed from: b */
    private final long[] f25897b;

    /* renamed from: c */
    private final long f25898c;

    /* renamed from: d */
    private final long f25899d;

    private C4915h(long[] jArr, long[] jArr2, long j, long j2) {
        this.f25896a = jArr;
        this.f25897b = jArr2;
        this.f25898c = j;
        this.f25899d = j2;
    }

    /* renamed from: a */
    public static C4915h m31176a(long j, long j2, C1635f0.C1636a aVar, C5918a0 a0Var) {
        int i;
        long j3 = j;
        C1635f0.C1636a aVar2 = aVar;
        C5918a0 a0Var2 = a0Var;
        a0Var2.mo20547P(10);
        int m = a0Var.mo20560m();
        if (m <= 0) {
            return null;
        }
        int i2 = aVar2.f4696d;
        long N0 = C5953m0.m35095N0((long) m, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int I = a0Var.mo20540I();
        int I2 = a0Var.mo20540I();
        int I3 = a0Var.mo20540I();
        a0Var2.mo20547P(2);
        long j4 = j2 + ((long) aVar2.f4695c);
        long[] jArr = new long[I];
        long[] jArr2 = new long[I];
        int i3 = 0;
        long j5 = j2;
        while (i3 < I) {
            int i4 = I2;
            jArr[i3] = (((long) i3) * N0) / ((long) I);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (I3 == 1) {
                i = a0Var.mo20534C();
            } else if (I3 == 2) {
                i = a0Var.mo20540I();
            } else if (I3 == 3) {
                i = a0Var.mo20537F();
            } else if (I3 != 4) {
                return null;
            } else {
                i = a0Var.mo20538G();
            }
            long j7 = (long) i;
            int i5 = i4;
            j5 += j7 * ((long) i5);
            i3++;
            jArr = jArr;
            I2 = i5;
            j4 = j6;
        }
        long[] jArr3 = jArr;
        if (!(j3 == -1 || j3 == j5)) {
            C5961r.m35215i("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new C4915h(jArr3, jArr2, N0, j5);
    }

    /* renamed from: b */
    public long mo18735b(long j) {
        return this.f25896a[C5953m0.m35136i(this.f25897b, j, true, true)];
    }

    /* renamed from: f */
    public long mo18736f() {
        return this.f25899d;
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        int i = C5953m0.m35136i(this.f25896a, j, true, true);
        C4196c0 c0Var = new C4196c0(this.f25896a[i], this.f25897b[i]);
        if (c0Var.f23485a >= j || i == this.f25896a.length - 1) {
            return new C4192b0.C4193a(c0Var);
        }
        int i2 = i + 1;
        return new C4192b0.C4193a(c0Var, new C4196c0(this.f25896a[i2], this.f25897b[i2]));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f25898c;
    }
}
