package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3622p1 extends C3523m1 {

    /* renamed from: h */
    private final OutputStream f22494h;

    C3622p1(OutputStream outputStream, int i) {
        super(i);
        this.f22494h = outputStream;
    }

    /* renamed from: N */
    private final void m26415N() throws IOException {
        this.f22494h.write(this.f22344d, 0, this.f22346f);
        this.f22346f = 0;
    }

    /* renamed from: O */
    private final void m26416O(int i) throws IOException {
        if (this.f22345e - this.f22346f < i) {
            m26415N();
        }
    }

    /* renamed from: A */
    public final void mo16433A(int i, int i2) throws IOException {
        m26416O(20);
        mo16356L(i << 3);
        mo16356L(i2);
    }

    /* renamed from: B */
    public final void mo16434B(int i) throws IOException {
        m26416O(5);
        mo16356L(i);
    }

    /* renamed from: C */
    public final void mo16435C(int i, long j) throws IOException {
        m26416O(20);
        mo16356L(i << 3);
        mo16357M(j);
    }

    /* renamed from: D */
    public final void mo16436D(long j) throws IOException {
        m26416O(10);
        mo16357M(j);
    }

    /* renamed from: P */
    public final void mo16525P(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f22345e;
        int i4 = this.f22346f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.f22344d, i4, i2);
            this.f22346f += i2;
            this.f22347g += i2;
            return;
        }
        System.arraycopy(bArr, 0, this.f22344d, i4, i5);
        int i6 = i2 - i5;
        this.f22346f = this.f22345e;
        this.f22347g += i5;
        m26415N();
        if (i6 <= this.f22345e) {
            System.arraycopy(bArr, i5, this.f22344d, 0, i6);
            this.f22346f = i6;
        } else {
            this.f22494h.write(bArr, i5, i6);
        }
        this.f22347g += i6;
    }

    /* renamed from: Q */
    public final void mo16526Q(String str) throws IOException {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int f = C3688r1.m26670f(length);
            int i3 = f + length;
            int i4 = this.f22345e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int b = C3395i5.m25769b(str, bArr, 0, length);
                mo16434B(b);
                mo16525P(bArr, 0, b);
                return;
            }
            if (i3 > i4 - this.f22346f) {
                m26415N();
            }
            int f2 = C3688r1.m26670f(str.length());
            i = this.f22346f;
            if (f2 == f) {
                int i5 = i + f2;
                this.f22346f = i5;
                int b2 = C3395i5.m25769b(str, this.f22344d, i5, this.f22345e - i5);
                this.f22346f = i;
                i2 = (b2 - i) - f2;
                mo16356L(i2);
                this.f22346f = b2;
            } else {
                i2 = C3395i5.m25770c(str);
                mo16356L(i2);
                this.f22346f = C3395i5.m25769b(str, this.f22344d, this.f22346f, i2);
            }
            this.f22347g += i2;
        } catch (C3362h5 e) {
            this.f22347g -= this.f22346f - i;
            this.f22346f = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C3589o1(e2);
        } catch (C3362h5 e3) {
            mo16664k(str, e3);
        }
    }

    /* renamed from: a */
    public final void mo16439a(byte[] bArr, int i, int i2) throws IOException {
        mo16525P(bArr, 0, i2);
    }

    /* renamed from: m */
    public final void mo16440m() throws IOException {
        if (this.f22346f > 0) {
            m26415N();
        }
    }

    /* renamed from: n */
    public final void mo16441n(byte b) throws IOException {
        if (this.f22346f == this.f22345e) {
            m26415N();
        }
        mo16353I(b);
    }

    /* renamed from: o */
    public final void mo16442o(int i, boolean z) throws IOException {
        m26416O(11);
        mo16356L(i << 3);
        mo16353I(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo16443p(int i, C3325g1 g1Var) throws IOException {
        mo16434B((i << 3) | 2);
        mo16434B(g1Var.mo15875f());
        g1Var.mo15881q(this);
    }

    /* renamed from: r */
    public final void mo16444r(int i, int i2) throws IOException {
        m26416O(14);
        mo16356L((i << 3) | 5);
        mo16354J(i2);
    }

    /* renamed from: s */
    public final void mo16445s(int i) throws IOException {
        m26416O(4);
        mo16354J(i);
    }

    /* renamed from: t */
    public final void mo16446t(int i, long j) throws IOException {
        m26416O(18);
        mo16356L((i << 3) | 1);
        mo16355K(j);
    }

    /* renamed from: u */
    public final void mo16447u(long j) throws IOException {
        m26416O(8);
        mo16355K(j);
    }

    /* renamed from: v */
    public final void mo16448v(int i, int i2) throws IOException {
        m26416O(20);
        mo16356L(i << 3);
        if (i2 >= 0) {
            mo16356L(i2);
        } else {
            mo16357M((long) i2);
        }
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
        mo16526Q(str);
    }

    /* renamed from: z */
    public final void mo16452z(int i, int i2) throws IOException {
        mo16434B((i << 3) | i2);
    }
}
