package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pu1 {

    /* renamed from: a */
    private int f16041a;

    /* renamed from: b */
    private long[] f16042b = new long[32];

    public pu1(int i) {
    }

    /* renamed from: a */
    public final int mo13381a() {
        return this.f16041a;
    }

    /* renamed from: b */
    public final long mo13382b(int i) {
        if (i >= 0 && i < this.f16041a) {
            return this.f16042b[i];
        }
        int i2 = this.f16041a;
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    /* renamed from: c */
    public final void mo13383c(long j) {
        int i = this.f16041a;
        long[] jArr = this.f16042b;
        if (i == jArr.length) {
            this.f16042b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f16042b;
        int i2 = this.f16041a;
        this.f16041a = i2 + 1;
        jArr2[i2] = j;
    }
}
