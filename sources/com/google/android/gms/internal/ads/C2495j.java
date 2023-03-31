package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2495j {

    /* renamed from: a */
    private byte[] f11148a;

    /* renamed from: b */
    private int f11149b;

    /* renamed from: c */
    private int f11150c;

    /* renamed from: d */
    private int f11151d = 0;

    public C2495j(byte[] bArr, int i, int i2) {
        this.f11148a = bArr;
        this.f11150c = i;
        this.f11149b = i2;
        m14606h();
    }

    /* renamed from: g */
    private final int m14605g() {
        int i = 0;
        int i2 = 0;
        while (!mo11271f()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo11266a(i2);
        }
        return i3 + i;
    }

    /* renamed from: h */
    private final void m14606h() {
        int i;
        int i2 = this.f11150c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f11149b) && !(i2 == i && this.f11151d == 0))) {
            z = false;
        }
        v91.m22052f(z);
    }

    /* renamed from: i */
    private final boolean m14607i(int i) {
        if (i < 2 || i >= this.f11149b) {
            return false;
        }
        byte[] bArr = this.f11148a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo11266a(int i) {
        int i2;
        int i3;
        this.f11151d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f11151d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f11151d = i5;
            byte[] bArr = this.f11148a;
            int i6 = this.f11150c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m14607i(i6 + 1)) {
                i3 = 1;
            }
            this.f11150c = i6 + i3;
        }
        byte[] bArr2 = this.f11148a;
        int i7 = this.f11150c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f11151d = 0;
            if (true != m14607i(i7 + 1)) {
                i3 = 1;
            }
            this.f11150c = i7 + i3;
        }
        m14606h();
        return i8;
    }

    /* renamed from: b */
    public final int mo11267b() {
        int g = m14605g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    /* renamed from: c */
    public final int mo11268c() {
        return m14605g();
    }

    /* renamed from: d */
    public final void mo11269d() {
        int i = 1;
        int i2 = this.f11151d + 1;
        this.f11151d = i2;
        if (i2 == 8) {
            this.f11151d = 0;
            int i3 = this.f11150c;
            if (true == m14607i(i3 + 1)) {
                i = 2;
            }
            this.f11150c = i3 + i;
        }
        m14606h();
    }

    /* renamed from: e */
    public final void mo11270e(int i) {
        int i2 = this.f11150c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f11150c = i4;
        int i5 = this.f11151d + (i - (i3 * 8));
        this.f11151d = i5;
        if (i5 > 7) {
            this.f11150c = i4 + 1;
            this.f11151d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f11150c) {
                m14606h();
                return;
            } else if (m14607i(i2)) {
                this.f11150c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo11271f() {
        boolean z = (this.f11148a[this.f11150c] & (128 >> this.f11151d)) != 0;
        mo11269d();
        return z;
    }
}
