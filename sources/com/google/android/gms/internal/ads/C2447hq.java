package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.hq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2447hq {

    /* renamed from: a */
    private int f10448a;

    /* renamed from: b */
    private long[] f10449b = new long[32];

    public C2447hq(int i) {
    }

    /* renamed from: a */
    public final int mo10891a() {
        return this.f10448a;
    }

    /* renamed from: b */
    public final long mo10892b(int i) {
        if (i >= 0 && i < this.f10448a) {
            return this.f10449b[i];
        }
        int i2 = this.f10448a;
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    /* renamed from: c */
    public final void mo10893c(long j) {
        int i = this.f10448a;
        long[] jArr = this.f10449b;
        if (i == jArr.length) {
            this.f10449b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f10449b;
        int i2 = this.f10448a;
        this.f10448a = i2 + 1;
        jArr2[i2] = j;
    }
}
