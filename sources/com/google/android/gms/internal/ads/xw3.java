package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xw3 extends uw3 {

    /* renamed from: h */
    private final OutputStream f20378h;

    xw3(OutputStream outputStream, int i) {
        super(i);
        this.f20378h = outputStream;
    }

    /* renamed from: N */
    private final void m23568N() throws IOException {
        this.f20378h.write(this.f18765d, 0, this.f18767f);
        this.f18767f = 0;
    }

    /* renamed from: O */
    private final void m23569O(int i) throws IOException {
        if (this.f18766e - this.f18767f < i) {
            m23568N();
        }
    }

    /* renamed from: A */
    public final void mo14827A(int i, int i2) throws IOException {
        m23569O(20);
        mo14635L(i << 3);
        mo14635L(i2);
    }

    /* renamed from: B */
    public final void mo14828B(int i) throws IOException {
        m23569O(5);
        mo14635L(i);
    }

    /* renamed from: C */
    public final void mo14829C(int i, long j) throws IOException {
        m23569O(20);
        mo14635L(i << 3);
        mo14636M(j);
    }

    /* renamed from: D */
    public final void mo14830D(long j) throws IOException {
        m23569O(10);
        mo14636M(j);
    }

    /* renamed from: P */
    public final void mo15255P(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f18766e;
        int i4 = this.f18767f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f18765d, i4, i2);
            this.f18767f += i2;
            this.f18768g += i2;
            return;
        }
        System.arraycopy(bArr, i, this.f18765d, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f18767f = this.f18766e;
        this.f18768g += i5;
        m23568N();
        if (i7 <= this.f18766e) {
            System.arraycopy(bArr, i6, this.f18765d, 0, i7);
            this.f18767f = i7;
        } else {
            this.f20378h.write(bArr, i6, i7);
        }
        this.f18768g += i7;
    }

    /* renamed from: Q */
    public final void mo15256Q(String str) throws IOException {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int f = zw3.m24869f(length);
            int i3 = f + length;
            int i4 = this.f18766e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int d = d14.m11283d(str, bArr, 0, length);
                mo14828B(d);
                mo15255P(bArr, 0, d);
                return;
            }
            if (i3 > i4 - this.f18767f) {
                m23568N();
            }
            int f2 = zw3.m24869f(str.length());
            i = this.f18767f;
            if (f2 == f) {
                int i5 = i + f2;
                this.f18767f = i5;
                int d2 = d14.m11283d(str, this.f18765d, i5, this.f18766e - i5);
                this.f18767f = i;
                i2 = (d2 - i) - f2;
                mo14635L(i2);
                this.f18767f = d2;
            } else {
                i2 = d14.m11284e(str);
                mo14635L(i2);
                this.f18767f = d14.m11283d(str, this.f18765d, this.f18767f, i2);
            }
            this.f18768g += i2;
        } catch (c14 e) {
            this.f18768g -= this.f18767f - i;
            this.f18767f = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ww3(e2);
        } catch (c14 e3) {
            mo15671k(str, e3);
        }
    }

    /* renamed from: a */
    public final void mo14833a(byte[] bArr, int i, int i2) throws IOException {
        mo15255P(bArr, i, i2);
    }

    /* renamed from: m */
    public final void mo14834m() throws IOException {
        if (this.f18767f > 0) {
            m23568N();
        }
    }

    /* renamed from: n */
    public final void mo14835n(byte b) throws IOException {
        if (this.f18767f == this.f18766e) {
            m23568N();
        }
        mo14632I(b);
    }

    /* renamed from: o */
    public final void mo14836o(int i, boolean z) throws IOException {
        m23569O(11);
        mo14635L(i << 3);
        mo14632I(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo14837p(int i, jw3 jw3) throws IOException {
        mo14828B((i << 3) | 2);
        mo14828B(jw3.mo9361q());
        jw3.mo10318A(this);
    }

    /* renamed from: r */
    public final void mo14838r(int i, int i2) throws IOException {
        m23569O(14);
        mo14635L((i << 3) | 5);
        mo14633J(i2);
    }

    /* renamed from: s */
    public final void mo14839s(int i) throws IOException {
        m23569O(4);
        mo14633J(i);
    }

    /* renamed from: t */
    public final void mo14840t(int i, long j) throws IOException {
        m23569O(18);
        mo14635L((i << 3) | 1);
        mo14634K(j);
    }

    /* renamed from: u */
    public final void mo14841u(long j) throws IOException {
        m23569O(8);
        mo14634K(j);
    }

    /* renamed from: v */
    public final void mo14842v(int i, int i2) throws IOException {
        m23569O(20);
        mo14635L(i << 3);
        if (i2 >= 0) {
            mo14635L(i2);
        } else {
            mo14636M((long) i2);
        }
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
        mo15256Q(str);
    }

    /* renamed from: z */
    public final void mo14846z(int i, int i2) throws IOException {
        mo14828B((i << 3) | i2);
    }
}
