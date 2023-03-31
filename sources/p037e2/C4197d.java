package p037e2;

import java.util.Arrays;
import p037e2.C4192b0;
import p161w3.C5953m0;

/* renamed from: e2.d */
/* compiled from: ChunkIndex */
public final class C4197d implements C4192b0 {

    /* renamed from: a */
    public final int f23487a;

    /* renamed from: b */
    public final int[] f23488b;

    /* renamed from: c */
    public final long[] f23489c;

    /* renamed from: d */
    public final long[] f23490d;

    /* renamed from: e */
    public final long[] f23491e;

    /* renamed from: f */
    private final long f23492f;

    public C4197d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f23488b = iArr;
        this.f23489c = jArr;
        this.f23490d = jArr2;
        this.f23491e = jArr3;
        int length = iArr.length;
        this.f23487a = length;
        if (length > 0) {
            this.f23492f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f23492f = 0;
        }
    }

    /* renamed from: a */
    public int mo17547a(long j) {
        return C5953m0.m35136i(this.f23491e, j, true, true);
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        int a = mo17547a(j);
        C4196c0 c0Var = new C4196c0(this.f23491e[a], this.f23489c[a]);
        if (c0Var.f23485a >= j || a == this.f23487a - 1) {
            return new C4192b0.C4193a(c0Var);
        }
        int i = a + 1;
        return new C4192b0.C4193a(c0Var, new C4196c0(this.f23491e[i], this.f23489c[i]));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f23492f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f23487a + ", sizes=" + Arrays.toString(this.f23488b) + ", offsets=" + Arrays.toString(this.f23489c) + ", timeUs=" + Arrays.toString(this.f23491e) + ", durationsUs=" + Arrays.toString(this.f23490d) + ")";
    }
}
