package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x12 {

    /* renamed from: a */
    public byte[] f19942a;

    /* renamed from: b */
    private int f19943b;

    /* renamed from: c */
    private int f19944c;

    /* renamed from: d */
    private int f19945d;

    public x12() {
        this.f19942a = gb2.f9817f;
    }

    public x12(byte[] bArr, int i) {
        this.f19942a = bArr;
        this.f19945d = i;
    }

    /* renamed from: m */
    private final void m23032m() {
        int i;
        int i2 = this.f19943b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f19945d) && !(i2 == i && this.f19944c == 0))) {
            z = false;
        }
        v91.m22052f(z);
    }

    /* renamed from: a */
    public final int mo15032a() {
        return ((this.f19945d - this.f19943b) * 8) - this.f19944c;
    }

    /* renamed from: b */
    public final int mo15033b() {
        return (this.f19943b * 8) + this.f19944c;
    }

    /* renamed from: c */
    public final int mo15034c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f19944c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f19944c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f19944c = i4;
            byte[] bArr = this.f19942a;
            int i5 = this.f19943b;
            this.f19943b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f19942a;
        int i6 = this.f19943b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f19944c = 0;
            this.f19943b = i6 + 1;
        }
        m23032m();
        return i7;
    }

    /* renamed from: d */
    public final void mo15035d() {
        if (this.f19944c != 0) {
            this.f19944c = 0;
            this.f19943b++;
            m23032m();
        }
    }

    /* renamed from: e */
    public final void mo15036e(int i, int i2) {
        int i3 = i & 16383;
        int min = Math.min(8 - this.f19944c, 14);
        int i4 = this.f19944c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f19942a;
        int i6 = this.f19943b;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.f19942a[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f19942a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        mo15041j(14);
        m23032m();
    }

    /* renamed from: f */
    public final void mo15037f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f19942a;
            int i5 = this.f19943b;
            int i6 = i5 + 1;
            this.f19943b = i6;
            byte b = bArr2[i5];
            int i7 = this.f19944c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i8));
            bArr[i3] = b3;
            int i9 = this.f19944c;
            if (i9 + i8 > 8) {
                byte[] bArr3 = this.f19942a;
                int i10 = this.f19943b;
                this.f19943b = i10 + 1;
                b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
                bArr[i3] = b3;
                i9 -= 8;
            }
            int i11 = i9 + i8;
            this.f19944c = i11;
            byte[] bArr4 = this.f19942a;
            int i12 = this.f19943b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
            if (i11 == 8) {
                this.f19944c = 0;
                this.f19943b = i12 + 1;
            }
            m23032m();
        }
    }

    /* renamed from: g */
    public final void mo15038g(byte[] bArr, int i) {
        this.f19942a = bArr;
        this.f19943b = 0;
        this.f19944c = 0;
        this.f19945d = i;
    }

    /* renamed from: h */
    public final void mo15039h(int i) {
        int i2 = i / 8;
        this.f19943b = i2;
        this.f19944c = i - (i2 * 8);
        m23032m();
    }

    /* renamed from: i */
    public final void mo15040i() {
        int i = this.f19944c + 1;
        this.f19944c = i;
        if (i == 8) {
            this.f19944c = 0;
            this.f19943b++;
        }
        m23032m();
    }

    /* renamed from: j */
    public final void mo15041j(int i) {
        int i2 = i / 8;
        int i3 = this.f19943b + i2;
        this.f19943b = i3;
        int i4 = this.f19944c + (i - (i2 * 8));
        this.f19944c = i4;
        if (i4 > 7) {
            this.f19943b = i3 + 1;
            this.f19944c = i4 - 8;
        }
        m23032m();
    }

    /* renamed from: k */
    public final void mo15042k(int i) {
        v91.m22052f(this.f19944c == 0);
        this.f19943b += i;
        m23032m();
    }

    /* renamed from: l */
    public final boolean mo15043l() {
        boolean z = (this.f19942a[this.f19943b] & (128 >> this.f19944c)) != 0;
        mo15040i();
        return z;
    }
}
