package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2670nq {

    /* renamed from: a */
    private final byte[] f14170a;

    /* renamed from: b */
    private final int f14171b;

    /* renamed from: c */
    private int f14172c;

    /* renamed from: d */
    private int f14173d = 0;

    public C2670nq(byte[] bArr, int i, int i2) {
        this.f14170a = bArr;
        this.f14172c = i;
        this.f14171b = i2;
        m17246g();
    }

    /* renamed from: f */
    private final int m17245f() {
        int i = 0;
        int i2 = 0;
        while (!mo12696e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo12692a(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    private final void m17246g() {
        int i;
        int i2;
        int i3 = this.f14172c;
        boolean z = true;
        if (i3 < 0 || (i = this.f14173d) < 0 || i >= 8 || (i3 >= (i2 = this.f14171b) && !(i3 == i2 && i == 0))) {
            z = false;
        }
        C2335eq.m12245e(z);
    }

    /* renamed from: h */
    private final boolean m17247h(int i) {
        if (i < 2 || i >= this.f14171b) {
            return false;
        }
        byte[] bArr = this.f14170a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo12692a(int i) {
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4 = i >> 3;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            if (m17247h(this.f14172c + 1)) {
                i3 = this.f14172c + 2;
            } else {
                i3 = this.f14172c + 1;
            }
            int i6 = this.f14173d;
            if (i6 != 0) {
                byte[] bArr = this.f14170a;
                b2 = ((bArr[i3] & 255) >>> (8 - i6)) | ((bArr[this.f14172c] & 255) << i6);
            } else {
                b2 = this.f14170a[this.f14172c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f14172c = i3;
        }
        if (i > 0) {
            int i7 = this.f14173d + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (m17247h(this.f14172c + 1)) {
                i2 = this.f14172c + 2;
            } else {
                i2 = this.f14172c + 1;
            }
            if (i7 > 8) {
                byte[] bArr2 = this.f14170a;
                b = (b4 & (((255 & bArr2[i2]) >> (16 - i7)) | ((bArr2[this.f14172c] & 255) << (i7 - 8)))) | b3;
                this.f14172c = i2;
            } else {
                b = (b4 & ((255 & this.f14170a[this.f14172c]) >> (8 - i7))) | b3;
                if (i7 == 8) {
                    this.f14172c = i2;
                }
            }
            b3 = b;
            this.f14173d = i7 % 8;
        }
        m17246g();
        return b3;
    }

    /* renamed from: b */
    public final int mo12693b() {
        int f = m17245f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: c */
    public final int mo12694c() {
        return m17245f();
    }

    /* renamed from: d */
    public final void mo12695d(int i) {
        int i2 = this.f14172c;
        int i3 = (i >> 3) + i2;
        this.f14172c = i3;
        int i4 = this.f14173d + (i & 7);
        this.f14173d = i4;
        if (i4 > 7) {
            this.f14172c = i3 + 1;
            this.f14173d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f14172c) {
                m17246g();
                return;
            } else if (m17247h(i2)) {
                this.f14172c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo12696e() {
        return mo12692a(1) == 1;
    }
}
