package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2866t {

    /* renamed from: a */
    private final byte[] f17797a;

    /* renamed from: b */
    private final int f17798b;

    /* renamed from: c */
    private int f17799c;

    /* renamed from: d */
    private int f17800d;

    public C2866t(byte[] bArr) {
        this.f17797a = bArr;
        this.f17798b = bArr.length;
    }

    /* renamed from: a */
    public final int mo14173a() {
        return (this.f17799c * 8) + this.f17800d;
    }

    /* renamed from: b */
    public final int mo14174b(int i) {
        int i2 = this.f17799c;
        int min = Math.min(i, 8 - this.f17800d);
        int i3 = i2 + 1;
        int i4 = ((this.f17797a[i2] & 255) >> this.f17800d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f17797a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo14175c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo14175c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f17799c + i3;
        this.f17799c = i4;
        int i5 = this.f17800d + (i - (i3 * 8));
        this.f17800d = i5;
        if (i5 > 7) {
            i4++;
            this.f17799c = i4;
            i5 -= 8;
            this.f17800d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f17798b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        v91.m22052f(z);
    }

    /* renamed from: d */
    public final boolean mo14176d() {
        byte b = this.f17797a[this.f17799c];
        int i = this.f17800d;
        mo14175c(1);
        if (1 != (((b & 255) >> i) & 1)) {
            return false;
        }
        return true;
    }
}
