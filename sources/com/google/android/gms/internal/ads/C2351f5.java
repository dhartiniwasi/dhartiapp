package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2351f5 {

    /* renamed from: a */
    public final C2240c5 f9114a;

    /* renamed from: b */
    public final int f9115b;

    /* renamed from: c */
    public final long[] f9116c;

    /* renamed from: d */
    public final int[] f9117d;

    /* renamed from: e */
    public final int f9118e;

    /* renamed from: f */
    public final long[] f9119f;

    /* renamed from: g */
    public final int[] f9120g;

    /* renamed from: h */
    public final long f9121h;

    public C2351f5(C2240c5 c5Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        v91.m22050d(length == length2);
        int length3 = jArr.length;
        v91.m22050d(length3 == length2);
        int length4 = iArr2.length;
        v91.m22050d(length4 != length2 ? false : z);
        this.f9114a = c5Var;
        this.f9116c = jArr;
        this.f9117d = iArr;
        this.f9118e = i;
        this.f9119f = jArr2;
        this.f9120g = iArr2;
        this.f9121h = j;
        this.f9115b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo10071a(long j) {
        for (int N = gb2.m13144N(this.f9119f, j, true, false); N >= 0; N--) {
            if ((this.f9120g[N] & 1) != 0) {
                return N;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo10072b(long j) {
        for (int L = gb2.m13142L(this.f9119f, j, true, false); L < this.f9119f.length; L++) {
            if ((this.f9120g[L] & 1) != 0) {
                return L;
            }
        }
        return -1;
    }
}
