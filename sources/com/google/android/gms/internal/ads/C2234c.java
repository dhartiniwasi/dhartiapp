package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2234c implements C2643n {

    /* renamed from: a */
    private final long[] f7535a;

    /* renamed from: b */
    private final long[] f7536b;

    /* renamed from: c */
    private final long f7537c;

    /* renamed from: d */
    private final boolean f7538d;

    public C2234c(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        v91.m22050d(length == length2);
        boolean z = length2 > 0;
        this.f7538d = z;
        if (!z || jArr2[0] <= 0) {
            this.f7535a = jArr;
            this.f7536b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f7535a = jArr3;
            long[] jArr4 = new long[i];
            this.f7536b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f7537c = j;
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return this.f7538d;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        if (!this.f7538d) {
            C2680o oVar = C2680o.f14770c;
            return new C2569l(oVar, oVar);
        }
        int N = gb2.m13144N(this.f7536b, j, true, true);
        C2680o oVar2 = new C2680o(this.f7536b[N], this.f7535a[N]);
        if (oVar2.f14771a != j) {
            long[] jArr = this.f7536b;
            if (N != jArr.length - 1) {
                int i = N + 1;
                return new C2569l(oVar2, new C2680o(jArr[i], this.f7535a[i]));
            }
        }
        return new C2569l(oVar2, oVar2);
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f7537c;
    }
}
