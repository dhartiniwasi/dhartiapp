package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class C3193c1 extends C3160b1 {

    /* renamed from: e */
    protected final byte[] f21797e;

    C3193c1(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f21797e = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo15871B() {
        return 0;
    }

    /* renamed from: b */
    public byte mo15872b(int i) {
        return this.f21797e[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo15873c(int i) {
        return this.f21797e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3325g1) || mo15875f() != ((C3325g1) obj).mo15875f()) {
            return false;
        }
        if (mo15875f() == 0) {
            return true;
        }
        if (!(obj instanceof C3193c1)) {
            return obj.equals(this);
        }
        C3193c1 c1Var = (C3193c1) obj;
        int t = mo16054t();
        int t2 = c1Var.mo16054t();
        if (t != 0 && t2 != 0 && t != t2) {
            return false;
        }
        int f = mo15875f();
        if (f > c1Var.mo15875f()) {
            int f2 = mo15875f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= c1Var.mo15875f()) {
            byte[] bArr = this.f21797e;
            byte[] bArr2 = c1Var.f21797e;
            c1Var.mo15871B();
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
            int f3 = c1Var.mo15875f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo15875f() {
        return this.f21797e.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo15876i(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f21797e, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo15877j(int i, int i2, int i3) {
        return C3623p2.m26440d(i, this.f21797e, 0, i3);
    }

    /* renamed from: k */
    public final C3325g1 mo15878k(int i, int i2) {
        int s = C3325g1.m25612s(0, i2, mo15875f());
        if (s == 0) {
            return C3325g1.f22056b;
        }
        return new C3947z0(this.f21797e, 0, s);
    }

    /* renamed from: l */
    public final C3457k1 mo15879l() {
        return C3457k1.m25963n(this.f21797e, 0, mo15875f(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo15880o(Charset charset) {
        return new String(this.f21797e, 0, mo15875f(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo15881q(C3819v0 v0Var) throws IOException {
        v0Var.mo16439a(this.f21797e, 0, mo15875f());
    }

    /* renamed from: r */
    public final boolean mo15882r() {
        return C3395i5.m25773f(this.f21797e, 0, mo15875f());
    }
}
