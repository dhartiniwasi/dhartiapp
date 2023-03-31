package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.t3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2870t3 implements C3055y3 {

    /* renamed from: a */
    private final long[] f17817a;

    /* renamed from: b */
    private final long[] f17818b;

    /* renamed from: c */
    private final long f17819c;

    private C2870t3(long[] jArr, long[] jArr2, long j) {
        this.f17817a = jArr;
        this.f17818b = jArr2;
        this.f17819c = j == -9223372036854775807L ? gb2.m13168f0(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: b */
    public static C2870t3 m20777b(long j, C2609m2 m2Var, long j2) {
        int length = m2Var.f13163e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (m2Var.f13161c + m2Var.f13163e[i3]);
            j3 += (long) (m2Var.f13162d + m2Var.f13164f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C2870t3(jArr, jArr2, j2);
    }

    /* renamed from: c */
    private static Pair m20778c(long j, long[] jArr, long[] jArr2) {
        int N = gb2.m13144N(jArr, j, true, true);
        long j2 = jArr[N];
        long j3 = jArr2[N];
        int i = N + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        Pair c = m20778c(gb2.m13176j0(gb2.m13160b0(j, 0, this.f17819c)), this.f17818b, this.f17817a);
        long longValue = ((Long) c.first).longValue();
        C2680o oVar = new C2680o(gb2.m13168f0(longValue), ((Long) c.second).longValue());
        return new C2569l(oVar, oVar);
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f17819c;
    }

    /* renamed from: d */
    public final long mo8200d() {
        return -1;
    }

    /* renamed from: e */
    public final long mo8201e(long j) {
        return gb2.m13168f0(((Long) m20778c(j, this.f17817a, this.f17818b).second).longValue());
    }
}
