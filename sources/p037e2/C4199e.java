package p037e2;

import p037e2.C4192b0;

/* renamed from: e2.e */
/* compiled from: ConstantBitrateSeekMap */
public class C4199e implements C4192b0 {

    /* renamed from: a */
    private final long f23493a;

    /* renamed from: b */
    private final long f23494b;

    /* renamed from: c */
    private final int f23495c;

    /* renamed from: d */
    private final long f23496d;

    /* renamed from: e */
    private final int f23497e;

    /* renamed from: f */
    private final long f23498f;

    /* renamed from: g */
    private final boolean f23499g;

    public C4199e(long j, long j2, int i, int i2, boolean z) {
        this.f23493a = j;
        this.f23494b = j2;
        this.f23495c = i2 == -1 ? 1 : i2;
        this.f23497e = i;
        this.f23499g = z;
        if (j == -1) {
            this.f23496d = -1;
            this.f23498f = -9223372036854775807L;
            return;
        }
        this.f23496d = j - j2;
        this.f23498f = m28385d(j, j2, i);
    }

    /* renamed from: a */
    private long m28384a(long j) {
        int i = this.f23495c;
        long j2 = (((j * ((long) this.f23497e)) / 8000000) / ((long) i)) * ((long) i);
        long j3 = this.f23496d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - ((long) i));
        }
        return this.f23494b + Math.max(j2, 0);
    }

    /* renamed from: d */
    private static long m28385d(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: c */
    public long mo17549c(long j) {
        return m28385d(j, this.f23494b, this.f23497e);
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return this.f23496d != -1 || this.f23499g;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        if (this.f23496d == -1 && !this.f23499g) {
            return new C4192b0.C4193a(new C4196c0(0, this.f23494b));
        }
        long a = m28384a(j);
        long c = mo17549c(a);
        C4196c0 c0Var = new C4196c0(c, a);
        if (this.f23496d != -1 && c < j) {
            int i = this.f23495c;
            if (((long) i) + a < this.f23493a) {
                long j2 = a + ((long) i);
                return new C4192b0.C4193a(c0Var, new C4196c0(mo17549c(j2), j2));
            }
        }
        return new C4192b0.C4193a(c0Var);
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f23498f;
    }
}
