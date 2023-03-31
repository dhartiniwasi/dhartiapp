package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2887tk implements C2293dl {

    /* renamed from: a */
    public final int[] f18022a;

    /* renamed from: b */
    public final long[] f18023b;

    /* renamed from: c */
    public final long[] f18024c;

    /* renamed from: d */
    public final long[] f18025d;

    /* renamed from: e */
    private final long f18026e;

    public C2887tk(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18022a = iArr;
        this.f18023b = jArr;
        this.f18024c = jArr2;
        this.f18025d = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f18026e = jArr2[i] + jArr3[i];
            return;
        }
        this.f18026e = 0;
    }

    /* renamed from: c */
    public final long mo9204c(long j) {
        return this.f18023b[C2893tq.m21172c(this.f18025d, j, true, true)];
    }

    /* renamed from: e */
    public final boolean mo9205e() {
        return true;
    }

    public final long zza() {
        return this.f18026e;
    }
}
