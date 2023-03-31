package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2165a4 implements C3055y3 {

    /* renamed from: a */
    private final long f6398a;

    /* renamed from: b */
    private final int f6399b;

    /* renamed from: c */
    private final long f6400c;

    /* renamed from: d */
    private final long f6401d;

    /* renamed from: e */
    private final long f6402e;

    /* renamed from: f */
    private final long[] f6403f;

    private C2165a4(long j, int i, long j2, long j3, long[] jArr) {
        this.f6398a = j;
        this.f6399b = i;
        this.f6400c = j2;
        this.f6403f = jArr;
        this.f6401d = j3;
        this.f6402e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: b */
    public static C2165a4 m9562b(long j, long j2, C2271d dVar, y22 y22) {
        int v;
        long j3 = j;
        C2271d dVar2 = dVar;
        int i = dVar2.f7995g;
        int i2 = dVar2.f7992d;
        int m = y22.mo15300m();
        if ((m & 1) != 1 || (v = y22.mo15309v()) == 0) {
            return null;
        }
        long g0 = gb2.m13170g0((long) v, ((long) i) * 1000000, (long) i2);
        if ((m & 6) != 6) {
            return new C2165a4(j2, dVar2.f7991c, g0, -1, (long[]) null);
        }
        long A = y22.mo15280A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) y22.mo15306s();
        }
        if (j3 != -1) {
            long j4 = j2 + A;
            if (j3 != j4) {
                ot1.m18060e("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new C2165a4(j2, dVar2.f7991c, g0, A, jArr);
    }

    /* renamed from: c */
    private final long m9563c(int i) {
        return (this.f6400c * ((long) i)) / 100;
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return this.f6403f != null;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        double d;
        if (!mo8197U()) {
            C2680o oVar = new C2680o(0, this.f6398a + ((long) this.f6399b));
            return new C2569l(oVar, oVar);
        }
        long b0 = gb2.m13160b0(j, 0, this.f6400c);
        double d2 = (((double) b0) * 100.0d) / ((double) this.f6400c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) v91.m22048b(this.f6403f);
                double d4 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        C2680o oVar2 = new C2680o(b0, this.f6398a + gb2.m13160b0(Math.round((d3 / 256.0d) * ((double) this.f6401d)), (long) this.f6399b, this.f6401d - 1));
        return new C2569l(oVar2, oVar2);
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f6400c;
    }

    /* renamed from: d */
    public final long mo8200d() {
        return this.f6402e;
    }

    /* renamed from: e */
    public final long mo8201e(long j) {
        long j2;
        long j3 = j - this.f6398a;
        if (!mo8197U() || j3 <= ((long) this.f6399b)) {
            return 0;
        }
        long[] jArr = (long[]) v91.m22048b(this.f6403f);
        double d = (((double) j3) * 256.0d) / ((double) this.f6401d);
        int N = gb2.m13144N(jArr, (long) d, true, true);
        long c = m9563c(N);
        long j4 = jArr[N];
        int i = N + 1;
        long c2 = m9563c(i);
        if (N == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        return c + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (c2 - c)));
    }
}
