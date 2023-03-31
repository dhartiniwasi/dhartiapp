package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class d82 {

    /* renamed from: a */
    private long[] f8135a = new long[10];

    /* renamed from: b */
    private Object[] f8136b = new Object[10];

    /* renamed from: c */
    private int f8137c;

    /* renamed from: d */
    private int f8138d;

    public d82(int i) {
    }

    /* renamed from: f */
    private final Object m11351f() {
        v91.m22052f(this.f8138d > 0);
        Object[] objArr = this.f8136b;
        int i = this.f8137c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f8137c = (i + 1) % objArr.length;
        this.f8138d--;
        return obj;
    }

    /* renamed from: a */
    public final synchronized int mo9457a() {
        return this.f8138d;
    }

    /* renamed from: b */
    public final synchronized Object mo9458b() {
        if (this.f8138d == 0) {
            return null;
        }
        return m11351f();
    }

    /* renamed from: c */
    public final synchronized Object mo9459c(long j) {
        Object obj;
        obj = null;
        while (true) {
            if (this.f8138d <= 0) {
                break;
            } else if (j - this.f8135a[this.f8137c] < 0) {
                break;
            } else {
                obj = m11351f();
            }
        }
        return obj;
    }

    /* renamed from: d */
    public final synchronized void mo9460d(long j, Object obj) {
        int i = this.f8138d;
        if (i > 0) {
            if (j <= this.f8135a[((this.f8137c + i) - 1) % this.f8136b.length]) {
                mo9461e();
            }
        }
        int length = this.f8136b.length;
        if (this.f8138d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.f8137c;
            int i4 = length - i3;
            System.arraycopy(this.f8135a, i3, jArr, 0, i4);
            System.arraycopy(this.f8136b, this.f8137c, objArr, 0, i4);
            int i5 = this.f8137c;
            if (i5 > 0) {
                System.arraycopy(this.f8135a, 0, jArr, i4, i5);
                System.arraycopy(this.f8136b, 0, objArr, i4, this.f8137c);
            }
            this.f8135a = jArr;
            this.f8136b = objArr;
            this.f8137c = 0;
        }
        int i6 = this.f8137c;
        int i7 = this.f8138d;
        Object[] objArr2 = this.f8136b;
        int length2 = (i6 + i7) % objArr2.length;
        this.f8135a[length2] = j;
        objArr2[length2] = obj;
        this.f8138d = i7 + 1;
    }

    /* renamed from: e */
    public final synchronized void mo9461e() {
        this.f8137c = 0;
        this.f8138d = 0;
        Arrays.fill(this.f8136b, (Object) null);
    }
}
