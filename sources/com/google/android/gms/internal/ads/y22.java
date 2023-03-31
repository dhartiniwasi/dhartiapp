package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y22 {

    /* renamed from: a */
    private byte[] f20444a;

    /* renamed from: b */
    private int f20445b;

    /* renamed from: c */
    private int f20446c;

    public y22() {
        this.f20444a = gb2.f9817f;
    }

    public y22(byte[] bArr, int i) {
        this.f20444a = bArr;
        this.f20446c = i;
    }

    /* renamed from: A */
    public final long mo15280A() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20445b = i4;
        byte b3 = bArr[i3];
        this.f20445b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: B */
    public final long mo15281B() {
        long z = mo15313z();
        if (z >= 0) {
            return z;
        }
        throw new IllegalStateException("Top bit not zero: " + z);
    }

    /* renamed from: C */
    public final long mo15282C() {
        int i;
        int i2;
        long j = (long) this.f20444a[this.f20445b];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b = this.f20444a[this.f20445b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f20445b += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: D */
    public final String mo15283D(char c) {
        int i = this.f20446c;
        int i2 = this.f20445b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f20446c && this.f20444a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f20444a;
        int i3 = this.f20445b;
        String j = gb2.m13175j(bArr, i3, i2 - i3);
        this.f20445b = i2;
        if (i2 < this.f20446c) {
            this.f20445b = i2 + 1;
        }
        return j;
    }

    /* renamed from: E */
    public final String mo15284E(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f20445b;
        int i3 = (i2 + i) - 1;
        String j = gb2.m13175j(this.f20444a, i2, (i3 >= this.f20446c || this.f20444a[i3] != 0) ? i : i - 1);
        this.f20445b += i;
        return j;
    }

    /* renamed from: F */
    public final String mo15285F(int i, Charset charset) {
        byte[] bArr = this.f20444a;
        int i2 = this.f20445b;
        String str = new String(bArr, i2, i, charset);
        this.f20445b = i2 + i;
        return str;
    }

    /* renamed from: G */
    public final short mo15286G() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        this.f20445b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: H */
    public final void mo15287H(int i) {
        byte[] bArr = this.f20444a;
        if (i > bArr.length) {
            this.f20444a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: a */
    public final void mo15288a(x12 x12, int i) {
        mo15289b(x12.f19942a, 0, i);
        x12.mo15039h(0);
    }

    /* renamed from: b */
    public final void mo15289b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f20444a, this.f20445b, bArr, i, i2);
        this.f20445b += i2;
    }

    /* renamed from: c */
    public final void mo15290c(int i) {
        byte[] bArr = this.f20444a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo15291d(bArr, i);
    }

    /* renamed from: d */
    public final void mo15291d(byte[] bArr, int i) {
        this.f20444a = bArr;
        this.f20446c = i;
        this.f20445b = 0;
    }

    /* renamed from: e */
    public final void mo15292e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f20444a.length) {
            z = true;
        }
        v91.m22050d(z);
        this.f20446c = i;
    }

    /* renamed from: f */
    public final void mo15293f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f20446c) {
            z = true;
        }
        v91.m22050d(z);
        this.f20445b = i;
    }

    /* renamed from: g */
    public final void mo15294g(int i) {
        mo15293f(this.f20445b + i);
    }

    /* renamed from: h */
    public final byte[] mo15295h() {
        return this.f20444a;
    }

    /* renamed from: i */
    public final int mo15296i() {
        return this.f20446c - this.f20445b;
    }

    /* renamed from: j */
    public final int mo15297j() {
        return this.f20444a.length;
    }

    /* renamed from: k */
    public final int mo15298k() {
        return this.f20445b;
    }

    /* renamed from: l */
    public final int mo15299l() {
        return this.f20446c;
    }

    /* renamed from: m */
    public final int mo15300m() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20445b = i4;
        byte b3 = bArr[i3];
        this.f20445b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: n */
    public final int mo15301n() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        this.f20445b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: o */
    public final int mo15302o() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20445b = i4;
        byte b3 = bArr[i3];
        this.f20445b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: p */
    public final int mo15303p() {
        int o = mo15302o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException("Top bit not zero: " + o);
    }

    /* renamed from: q */
    public final int mo15304q() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        this.f20445b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final int mo15305r() {
        return (mo15306s() << 21) | (mo15306s() << 14) | (mo15306s() << 7) | mo15306s();
    }

    /* renamed from: s */
    public final int mo15306s() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        this.f20445b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: t */
    public final int mo15307t() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        this.f20445b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: u */
    public final int mo15308u() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        this.f20445b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: v */
    public final int mo15309v() {
        int m = mo15300m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException("Top bit not zero: " + m);
    }

    /* renamed from: w */
    public final int mo15310w() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        this.f20445b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: x */
    public final long mo15311x() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20445b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20445b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f20445b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f20445b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f20445b = i8;
        byte b7 = bArr[i7];
        this.f20445b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: y */
    public final long mo15312y() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20445b = i4;
        byte b3 = bArr[i3];
        this.f20445b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: z */
    public final long mo15313z() {
        byte[] bArr = this.f20444a;
        int i = this.f20445b;
        int i2 = i + 1;
        this.f20445b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20445b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20445b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20445b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f20445b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f20445b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f20445b = i8;
        byte b7 = bArr[i7];
        this.f20445b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public y22(int i) {
        this.f20444a = new byte[i];
        this.f20446c = i;
    }

    public y22(byte[] bArr) {
        this.f20444a = bArr;
        this.f20446c = bArr.length;
    }
}
