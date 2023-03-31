package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vw3 extends zw3 {

    /* renamed from: d */
    private final byte[] f19255d;

    /* renamed from: e */
    private final int f19256e;

    /* renamed from: f */
    private int f19257f;

    vw3(byte[] bArr, int i, int i2) {
        super((yw3) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f19255d = bArr;
            this.f19257f = 0;
            this.f19256e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: A */
    public final void mo14827A(int i, int i2) throws IOException {
        mo14828B(i << 3);
        mo14828B(i2);
    }

    /* renamed from: B */
    public final void mo14828B(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f19255d;
            int i2 = this.f19257f;
            this.f19257f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f19255d;
            int i3 = this.f19257f;
            this.f19257f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new ww3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f19257f), Integer.valueOf(this.f19256e), 1}), e);
        }
    }

    /* renamed from: C */
    public final void mo14829C(int i, long j) throws IOException {
        mo14828B(i << 3);
        mo14830D(j);
    }

    /* renamed from: D */
    public final void mo14830D(long j) throws IOException {
        if (!zw3.f21504c || this.f19256e - this.f19257f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f19255d;
                int i = this.f19257f;
                this.f19257f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f19255d;
                int i2 = this.f19257f;
                this.f19257f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new ww3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f19257f), Integer.valueOf(this.f19256e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f19255d;
                int i3 = this.f19257f;
                this.f19257f = i3 + 1;
                y04.m23675y(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f19255d;
            int i4 = this.f19257f;
            this.f19257f = i4 + 1;
            y04.m23675y(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: I */
    public final void mo14831I(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f19255d, this.f19257f, i2);
            this.f19257f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ww3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f19257f), Integer.valueOf(this.f19256e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: J */
    public final void mo14832J(String str) throws IOException {
        int i = this.f19257f;
        try {
            int f = zw3.m24869f(str.length() * 3);
            int f2 = zw3.m24869f(str.length());
            if (f2 == f) {
                int i2 = i + f2;
                this.f19257f = i2;
                int d = d14.m11283d(str, this.f19255d, i2, this.f19256e - i2);
                this.f19257f = i;
                mo14828B((d - i) - f2);
                this.f19257f = d;
                return;
            }
            mo14828B(d14.m11284e(str));
            byte[] bArr = this.f19255d;
            int i3 = this.f19257f;
            this.f19257f = d14.m11283d(str, bArr, i3, this.f19256e - i3);
        } catch (c14 e) {
            this.f19257f = i;
            mo15671k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new ww3(e2);
        }
    }

    /* renamed from: a */
    public final void mo14833a(byte[] bArr, int i, int i2) throws IOException {
        mo14831I(bArr, i, i2);
    }

    /* renamed from: m */
    public final void mo14834m() {
    }

    /* renamed from: n */
    public final void mo14835n(byte b) throws IOException {
        try {
            byte[] bArr = this.f19255d;
            int i = this.f19257f;
            this.f19257f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new ww3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f19257f), Integer.valueOf(this.f19256e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo14836o(int i, boolean z) throws IOException {
        mo14828B(i << 3);
        mo14835n(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo14837p(int i, jw3 jw3) throws IOException {
        mo14828B((i << 3) | 2);
        mo14828B(jw3.mo9361q());
        jw3.mo10318A(this);
    }

    /* renamed from: q */
    public final int mo14637q() {
        return this.f19256e - this.f19257f;
    }

    /* renamed from: r */
    public final void mo14838r(int i, int i2) throws IOException {
        mo14828B((i << 3) | 5);
        mo14839s(i2);
    }

    /* renamed from: s */
    public final void mo14839s(int i) throws IOException {
        try {
            byte[] bArr = this.f19255d;
            int i2 = this.f19257f;
            int i3 = i2 + 1;
            this.f19257f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f19257f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f19257f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f19257f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new ww3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f19257f), Integer.valueOf(this.f19256e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo14840t(int i, long j) throws IOException {
        mo14828B((i << 3) | 1);
        mo14841u(j);
    }

    /* renamed from: u */
    public final void mo14841u(long j) throws IOException {
        try {
            byte[] bArr = this.f19255d;
            int i = this.f19257f;
            int i2 = i + 1;
            this.f19257f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f19257f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f19257f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f19257f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f19257f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f19257f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f19257f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f19257f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new ww3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f19257f), Integer.valueOf(this.f19256e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo14842v(int i, int i2) throws IOException {
        mo14828B(i << 3);
        mo14843w(i2);
    }

    /* renamed from: w */
    public final void mo14843w(int i) throws IOException {
        if (i >= 0) {
            mo14828B(i);
        } else {
            mo14830D((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo14844x(int i, cz3 cz3, wz3 wz3) throws IOException {
        mo14828B((i << 3) | 2);
        sv3 sv3 = (sv3) cz3;
        int g = sv3.mo14147g();
        if (g == -1) {
            g = wz3.mo10360b(sv3);
            sv3.mo14148i(g);
        }
        mo14828B(g);
        wz3.mo10367i(cz3, this.f21505a);
    }

    /* renamed from: y */
    public final void mo14845y(int i, String str) throws IOException {
        mo14828B((i << 3) | 2);
        mo14832J(str);
    }

    /* renamed from: z */
    public final void mo14846z(int i, int i2) throws IOException {
        mo14828B((i << 3) | i2);
    }
}
