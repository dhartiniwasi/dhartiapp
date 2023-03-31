package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7058l8 extends C7106o8 {

    /* renamed from: d */
    private final byte[] f31808d;

    /* renamed from: e */
    private final int f31809e;

    /* renamed from: f */
    private int f31810f;

    C7058l8(byte[] bArr, int i, int i2) {
        super((C7090n8) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f31808d = bArr;
            this.f31810f = 0;
            this.f31809e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo23634E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f31808d, this.f31810f, i2);
            this.f31810f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C7074m8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31810f), Integer.valueOf(this.f31809e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo23635F(String str) throws IOException {
        int i = this.f31810f;
        try {
            int a = C7106o8.m40502a(str.length() * 3);
            int a2 = C7106o8.m40502a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f31810f = i2;
                int b = C6981gc.m40076b(str, this.f31808d, i2, this.f31809e - i2);
                this.f31810f = i;
                mo23650u((b - i) - a2);
                this.f31810f = b;
                return;
            }
            mo23650u(C6981gc.m40077c(str));
            byte[] bArr = this.f31808d;
            int i3 = this.f31810f;
            this.f31810f = C6981gc.m40076b(str, bArr, i3, this.f31809e - i3);
        } catch (C6964fc e) {
            this.f31810f = i;
            mo23726e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C7074m8(e2);
        }
    }

    /* renamed from: g */
    public final int mo23636g() {
        return this.f31809e - this.f31810f;
    }

    /* renamed from: h */
    public final void mo23637h(byte b) throws IOException {
        try {
            byte[] bArr = this.f31808d;
            int i = this.f31810f;
            this.f31810f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C7074m8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31810f), Integer.valueOf(this.f31809e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo23638i(int i, boolean z) throws IOException {
        mo23650u(i << 3);
        mo23637h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo23639j(int i, C6977g8 g8Var) throws IOException {
        mo23650u((i << 3) | 2);
        mo23650u(g8Var.mo23326f());
        g8Var.mo23330l(this);
    }

    /* renamed from: k */
    public final void mo23640k(int i, int i2) throws IOException {
        mo23650u((i << 3) | 5);
        mo23641l(i2);
    }

    /* renamed from: l */
    public final void mo23641l(int i) throws IOException {
        try {
            byte[] bArr = this.f31808d;
            int i2 = this.f31810f;
            int i3 = i2 + 1;
            this.f31810f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f31810f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f31810f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f31810f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C7074m8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31810f), Integer.valueOf(this.f31809e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo23642m(int i, long j) throws IOException {
        mo23650u((i << 3) | 1);
        mo23643n(j);
    }

    /* renamed from: n */
    public final void mo23643n(long j) throws IOException {
        try {
            byte[] bArr = this.f31808d;
            int i = this.f31810f;
            int i2 = i + 1;
            this.f31810f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f31810f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f31810f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f31810f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f31810f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f31810f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f31810f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f31810f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C7074m8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31810f), Integer.valueOf(this.f31809e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo23644o(int i, int i2) throws IOException {
        mo23650u(i << 3);
        mo23645p(i2);
    }

    /* renamed from: p */
    public final void mo23645p(int i) throws IOException {
        if (i >= 0) {
            mo23650u(i);
        } else {
            mo23652w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo23646q(byte[] bArr, int i, int i2) throws IOException {
        mo23634E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo23647r(int i, String str) throws IOException {
        mo23650u((i << 3) | 2);
        mo23635F(str);
    }

    /* renamed from: s */
    public final void mo23648s(int i, int i2) throws IOException {
        mo23650u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo23649t(int i, int i2) throws IOException {
        mo23650u(i << 3);
        mo23650u(i2);
    }

    /* renamed from: u */
    public final void mo23650u(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f31808d;
            int i2 = this.f31810f;
            this.f31810f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f31808d;
            int i3 = this.f31810f;
            this.f31810f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C7074m8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31810f), Integer.valueOf(this.f31809e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo23651v(int i, long j) throws IOException {
        mo23650u(i << 3);
        mo23652w(j);
    }

    /* renamed from: w */
    public final void mo23652w(long j) throws IOException {
        if (!C7106o8.f31923c || this.f31809e - this.f31810f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f31808d;
                int i = this.f31810f;
                this.f31810f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f31808d;
                int i2 = this.f31810f;
                this.f31810f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C7074m8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31810f), Integer.valueOf(this.f31809e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f31808d;
                int i3 = this.f31810f;
                this.f31810f = i3 + 1;
                C6879ac.m39553s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f31808d;
            int i4 = this.f31810f;
            this.f31810f = i4 + 1;
            C6879ac.m39553s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
