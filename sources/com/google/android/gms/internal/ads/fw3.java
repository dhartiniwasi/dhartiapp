package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class fw3 extends ew3 {

    /* renamed from: e */
    protected final byte[] f9568e;

    fw3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f9568e = bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo10318A(yv3 yv3) throws IOException {
        yv3.mo14833a(this.f9568e, mo9358R(), mo9361q());
    }

    /* renamed from: B */
    public final boolean mo10319B() {
        int R = mo9358R();
        return d14.m11289j(this.f9568e, R, mo9361q() + R);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo10023P(jw3 jw3, int i, int i2) {
        if (i2 <= jw3.mo9361q()) {
            int i3 = i + i2;
            if (i3 > jw3.mo9361q()) {
                int q = jw3.mo9361q();
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + q);
            } else if (!(jw3 instanceof fw3)) {
                return jw3.mo10323w(i, i3).equals(mo10323w(0, i2));
            } else {
                fw3 fw3 = (fw3) jw3;
                byte[] bArr = this.f9568e;
                byte[] bArr2 = fw3.f9568e;
                int R = mo9358R() + i2;
                int R2 = mo9358R();
                int R3 = fw3.mo9358R() + i;
                while (R2 < R) {
                    if (bArr[R2] != bArr2[R3]) {
                        return false;
                    }
                    R2++;
                    R3++;
                }
                return true;
            }
        } else {
            int q2 = mo9361q();
            throw new IllegalArgumentException("Length too large: " + i2 + q2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public int mo9358R() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jw3) || mo9361q() != ((jw3) obj).mo9361q()) {
            return false;
        }
        if (mo9361q() == 0) {
            return true;
        }
        if (!(obj instanceof fw3)) {
            return obj.equals(this);
        }
        fw3 fw3 = (fw3) obj;
        int D = mo11524D();
        int D2 = fw3.mo11524D();
        if (D == 0 || D2 == 0 || D == D2) {
            return mo10023P(fw3, 0, mo9361q());
        }
        return false;
    }

    /* renamed from: k */
    public byte mo9359k(int i) {
        return this.f9568e[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public byte mo9360l(int i) {
        return this.f9568e[i];
    }

    /* renamed from: q */
    public int mo9361q() {
        return this.f9568e.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo9362r(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9568e, i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo10321u(int i, int i2, int i3) {
        return cy3.m11232d(i, this.f9568e, mo9358R() + i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo10322v(int i, int i2, int i3) {
        int R = mo9358R() + i2;
        return d14.m11285f(i, this.f9568e, R, i3 + R);
    }

    /* renamed from: w */
    public final jw3 mo10323w(int i, int i2) {
        int C = jw3.m15083C(i, i2, mo9361q());
        if (C == 0) {
            return jw3.f11808b;
        }
        return new cw3(this.f9568e, mo9358R() + i, C);
    }

    /* renamed from: x */
    public final sw3 mo10324x() {
        return sw3.m20672h(this.f9568e, mo9358R(), mo9361q(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo10325y(Charset charset) {
        return new String(this.f9568e, mo9358R(), mo9361q(), charset);
    }

    /* renamed from: z */
    public final ByteBuffer mo10326z() {
        return ByteBuffer.wrap(this.f9568e, mo9358R(), mo9361q()).asReadOnlyBuffer();
    }
}
