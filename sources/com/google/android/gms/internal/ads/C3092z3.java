package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3092z3 implements C3055y3 {

    /* renamed from: a */
    private final long[] f20922a;

    /* renamed from: b */
    private final long[] f20923b;

    /* renamed from: c */
    private final long f20924c;

    /* renamed from: d */
    private final long f20925d;

    private C3092z3(long[] jArr, long[] jArr2, long j, long j2) {
        this.f20922a = jArr;
        this.f20923b = jArr2;
        this.f20924c = j;
        this.f20925d = j2;
    }

    /* renamed from: b */
    public static C3092z3 m24356b(long j, long j2, C2271d dVar, y22 y22) {
        int i;
        long j3 = j;
        C2271d dVar2 = dVar;
        y22 y222 = y22;
        y222.mo15294g(10);
        int m = y22.mo15300m();
        if (m <= 0) {
            return null;
        }
        int i2 = dVar2.f7992d;
        long g0 = gb2.m13170g0((long) m, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int w = y22.mo15310w();
        int w2 = y22.mo15310w();
        int w3 = y22.mo15310w();
        y222.mo15294g(2);
        long j4 = j2 + ((long) dVar2.f7991c);
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i3 = 0;
        long j5 = j2;
        while (i3 < w) {
            int i4 = w2;
            jArr[i3] = (((long) i3) * g0) / ((long) w);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (w3 == 1) {
                i = y22.mo15306s();
            } else if (w3 == 2) {
                i = y22.mo15310w();
            } else if (w3 == 3) {
                i = y22.mo15308u();
            } else if (w3 != 4) {
                return null;
            } else {
                i = y22.mo15309v();
            }
            long j7 = (long) i;
            int i5 = i4;
            j5 += j7 * ((long) i5);
            i3++;
            jArr = jArr;
            w2 = i5;
            j4 = j6;
        }
        long[] jArr3 = jArr;
        if (!(j3 == -1 || j3 == j5)) {
            ot1.m18060e("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new C3092z3(jArr3, jArr2, g0, j5);
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        int N = gb2.m13144N(this.f20922a, j, true, true);
        C2680o oVar = new C2680o(this.f20922a[N], this.f20923b[N]);
        if (oVar.f14771a < j) {
            long[] jArr = this.f20922a;
            if (N != jArr.length - 1) {
                int i = N + 1;
                return new C2569l(oVar, new C2680o(jArr[i], this.f20923b[i]));
            }
        }
        return new C2569l(oVar, oVar);
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f20924c;
    }

    /* renamed from: d */
    public final long mo8200d() {
        return this.f20925d;
    }

    /* renamed from: e */
    public final long mo8201e(long j) {
        return this.f20922a[gb2.m13144N(this.f20923b, j, true, true)];
    }
}
