package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bo4 implements C2643n {

    /* renamed from: a */
    private final do4 f7385a;

    /* renamed from: b */
    private final long f7386b;

    public bo4(do4 do4, long j) {
        this.f7385a = do4;
        this.f7386b = j;
    }

    /* renamed from: b */
    private final C2680o m10522b(long j, long j2) {
        return new C2680o((j * 1000000) / ((long) this.f7385a.f8347e), this.f7386b + j2);
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        long j2;
        v91.m22048b(this.f7385a.f8353k);
        do4 do4 = this.f7385a;
        co4 co4 = do4.f8353k;
        long[] jArr = co4.f7855a;
        long[] jArr2 = co4.f7856b;
        int N = gb2.m13144N(jArr, do4.mo9637b(j), true, false);
        long j3 = 0;
        if (N == -1) {
            j2 = 0;
        } else {
            j2 = jArr[N];
        }
        if (N != -1) {
            j3 = jArr2[N];
        }
        C2680o b = m10522b(j2, j3);
        if (b.f14771a == j || N == jArr.length - 1) {
            return new C2569l(b, b);
        }
        int i = N + 1;
        return new C2569l(b, m10522b(jArr[i], jArr2[i]));
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f7385a.mo9636a();
    }
}
