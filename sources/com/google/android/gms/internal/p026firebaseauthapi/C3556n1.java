package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3556n1 extends C3688r1 {

    /* renamed from: d */
    private final byte[] f22408d;

    /* renamed from: e */
    private final int f22409e;

    /* renamed from: f */
    private int f22410f;

    C3556n1(byte[] bArr, int i, int i2) {
        super((C3655q1) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f22408d = bArr;
            this.f22410f = 0;
            this.f22409e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: A */
    public final void mo16433A(int i, int i2) throws IOException {
        mo16434B(i << 3);
        mo16434B(i2);
    }

    /* renamed from: B */
    public final void mo16434B(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f22408d;
            int i2 = this.f22410f;
            this.f22410f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f22408d;
            int i3 = this.f22410f;
            this.f22410f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C3589o1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22410f), Integer.valueOf(this.f22409e), 1}), e);
        }
    }

    /* renamed from: C */
    public final void mo16435C(int i, long j) throws IOException {
        mo16434B(i << 3);
        mo16436D(j);
    }

    /* renamed from: D */
    public final void mo16436D(long j) throws IOException {
        if (!C3688r1.f22600c || this.f22409e - this.f22410f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f22408d;
                int i = this.f22410f;
                this.f22410f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f22408d;
                int i2 = this.f22410f;
                this.f22410f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C3589o1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22410f), Integer.valueOf(this.f22409e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f22408d;
                int i3 = this.f22410f;
                this.f22410f = i3 + 1;
                C3197c5.m25311s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f22408d;
            int i4 = this.f22410f;
            this.f22410f = i4 + 1;
            C3197c5.m25311s(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: I */
    public final void mo16437I(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f22408d, this.f22410f, i2);
            this.f22410f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C3589o1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22410f), Integer.valueOf(this.f22409e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: J */
    public final void mo16438J(String str) throws IOException {
        int i = this.f22410f;
        try {
            int f = C3688r1.m26670f(str.length() * 3);
            int f2 = C3688r1.m26670f(str.length());
            if (f2 == f) {
                int i2 = i + f2;
                this.f22410f = i2;
                int b = C3395i5.m25769b(str, this.f22408d, i2, this.f22409e - i2);
                this.f22410f = i;
                mo16434B((b - i) - f2);
                this.f22410f = b;
                return;
            }
            mo16434B(C3395i5.m25770c(str));
            byte[] bArr = this.f22408d;
            int i3 = this.f22410f;
            this.f22410f = C3395i5.m25769b(str, bArr, i3, this.f22409e - i3);
        } catch (C3362h5 e) {
            this.f22410f = i;
            mo16664k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C3589o1(e2);
        }
    }

    /* renamed from: a */
    public final void mo16439a(byte[] bArr, int i, int i2) throws IOException {
        mo16437I(bArr, 0, i2);
    }

    /* renamed from: m */
    public final void mo16440m() {
    }

    /* renamed from: n */
    public final void mo16441n(byte b) throws IOException {
        try {
            byte[] bArr = this.f22408d;
            int i = this.f22410f;
            this.f22410f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C3589o1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22410f), Integer.valueOf(this.f22409e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo16442o(int i, boolean z) throws IOException {
        mo16434B(i << 3);
        mo16441n(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo16443p(int i, C3325g1 g1Var) throws IOException {
        mo16434B((i << 3) | 2);
        mo16434B(g1Var.mo15875f());
        g1Var.mo15881q(this);
    }

    /* renamed from: q */
    public final int mo16358q() {
        return this.f22409e - this.f22410f;
    }

    /* renamed from: r */
    public final void mo16444r(int i, int i2) throws IOException {
        mo16434B((i << 3) | 5);
        mo16445s(i2);
    }

    /* renamed from: s */
    public final void mo16445s(int i) throws IOException {
        try {
            byte[] bArr = this.f22408d;
            int i2 = this.f22410f;
            int i3 = i2 + 1;
            this.f22410f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f22410f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f22410f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f22410f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C3589o1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22410f), Integer.valueOf(this.f22409e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo16446t(int i, long j) throws IOException {
        mo16434B((i << 3) | 1);
        mo16447u(j);
    }

    /* renamed from: u */
    public final void mo16447u(long j) throws IOException {
        try {
            byte[] bArr = this.f22408d;
            int i = this.f22410f;
            int i2 = i + 1;
            this.f22410f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f22410f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f22410f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f22410f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f22410f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f22410f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f22410f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f22410f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C3589o1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22410f), Integer.valueOf(this.f22409e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo16448v(int i, int i2) throws IOException {
        mo16434B(i << 3);
        mo16449w(i2);
    }

    /* renamed from: w */
    public final void mo16449w(int i) throws IOException {
        if (i >= 0) {
            mo16434B(i);
        } else {
            mo16436D((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo16450x(int i, C3591o3 o3Var, C3130a4 a4Var) throws IOException {
        mo16434B((i << 3) | 2);
        mo16434B(((C3621p0) o3Var).mo16200b(a4Var));
        a4Var.mo15707i(o3Var, this.f22601a);
    }

    /* renamed from: y */
    public final void mo16451y(int i, String str) throws IOException {
        mo16434B((i << 3) | 2);
        mo16438J(str);
    }

    /* renamed from: z */
    public final void mo16452z(int i, int i2) throws IOException {
        mo16434B((i << 3) | i2);
    }
}
