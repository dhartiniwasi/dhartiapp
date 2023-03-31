package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pm */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2741pm {

    /* renamed from: a */
    public final int f15908a;

    /* renamed from: b */
    public final long[] f15909b;

    /* renamed from: c */
    public final int[] f15910c;

    /* renamed from: d */
    public final int f15911d;

    /* renamed from: e */
    public final long[] f15912e;

    /* renamed from: f */
    public final int[] f15913f;

    public C2741pm(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        C2335eq.m12243c(iArr.length == length);
        int length2 = jArr.length;
        C2335eq.m12243c(length2 == length);
        C2335eq.m12243c(iArr2.length != length ? false : z);
        this.f15909b = jArr;
        this.f15910c = iArr;
        this.f15911d = i;
        this.f15912e = jArr2;
        this.f15913f = iArr2;
        this.f15908a = length2;
    }

    /* renamed from: a */
    public final int mo13302a(long j) {
        for (int c = C2893tq.m21172c(this.f15912e, j, true, false); c >= 0; c--) {
            if ((this.f15913f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo13303b(long j) {
        for (int b = C2893tq.m21171b(this.f15912e, j, true, false); b < this.f15912e.length; b++) {
            if ((this.f15913f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
