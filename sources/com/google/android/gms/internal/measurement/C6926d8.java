package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
class C6926d8 extends C6909c8 {

    /* renamed from: e */
    protected final byte[] f31644e;

    C6926d8(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f31644e = bArr;
    }

    /* renamed from: b */
    public byte mo23323b(int i) {
        return this.f31644e[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo23324c(int i) {
        return this.f31644e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6977g8) || mo23326f() != ((C6977g8) obj).mo23326f()) {
            return false;
        }
        if (mo23326f() == 0) {
            return true;
        }
        if (!(obj instanceof C6926d8)) {
            return obj.equals(this);
        }
        C6926d8 d8Var = (C6926d8) obj;
        int r = mo23441r();
        int r2 = d8Var.mo23441r();
        if (r != 0 && r2 != 0 && r != r2) {
            return false;
        }
        int f = mo23326f();
        if (f > d8Var.mo23326f()) {
            int f2 = mo23326f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= d8Var.mo23326f()) {
            byte[] bArr = this.f31644e;
            byte[] bArr2 = d8Var.f31644e;
            d8Var.mo23332v();
            int i = 0;
            int i2 = 0;
            while (i < f) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int f3 = d8Var.mo23326f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo23326f() {
        return this.f31644e.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo23327i(int i, int i2, int i3) {
        return C7107o9.m40531d(i, this.f31644e, 0, i3);
    }

    /* renamed from: j */
    public final C6977g8 mo23328j(int i, int i2) {
        int q = C6977g8.m40060q(0, i2, mo23326f());
        if (q == 0) {
            return C6977g8.f31702b;
        }
        return new C7281z7(this.f31644e, 0, q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo23329k(Charset charset) {
        return new String(this.f31644e, 0, mo23326f(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo23330l(C7217v7 v7Var) throws IOException {
        ((C7058l8) v7Var).mo23634E(this.f31644e, 0, mo23326f());
    }

    /* renamed from: o */
    public final boolean mo23331o() {
        return C6981gc.m40080f(this.f31644e, 0, mo23326f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo23332v() {
        return 0;
    }
}
