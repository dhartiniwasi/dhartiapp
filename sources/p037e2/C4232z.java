package p037e2;

import p037e2.C4192b0;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: e2.z */
/* compiled from: IndexSeekMap */
public final class C4232z implements C4192b0 {

    /* renamed from: a */
    private final long[] f23588a;

    /* renamed from: b */
    private final long[] f23589b;

    /* renamed from: c */
    private final long f23590c;

    /* renamed from: d */
    private final boolean f23591d;

    public C4232z(long[] jArr, long[] jArr2, long j) {
        C5917a.m34868a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f23591d = z;
        if (!z || jArr2[0] <= 0) {
            this.f23588a = jArr;
            this.f23589b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f23588a = jArr3;
            long[] jArr4 = new long[i];
            this.f23589b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f23590c = j;
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return this.f23591d;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        if (!this.f23591d) {
            return new C4192b0.C4193a(C4196c0.f23484c);
        }
        int i = C5953m0.m35136i(this.f23589b, j, true, true);
        C4196c0 c0Var = new C4196c0(this.f23589b[i], this.f23588a[i]);
        if (c0Var.f23485a == j || i == this.f23589b.length - 1) {
            return new C4192b0.C4193a(c0Var);
        }
        int i2 = i + 1;
        return new C4192b0.C4193a(c0Var, new C4196c0(this.f23589b[i2], this.f23588a[i2]));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f23590c;
    }
}
