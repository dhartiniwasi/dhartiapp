package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vz3 extends jw3 {

    /* renamed from: r */
    static final int[] f19385r = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: e */
    private final int f19386e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final jw3 f19387f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final jw3 f19388g;

    /* renamed from: h */
    private final int f19389h;

    /* renamed from: i */
    private final int f19390i;

    private vz3(jw3 jw3, jw3 jw32) {
        this.f19387f = jw3;
        this.f19388g = jw32;
        int q = jw3.mo9361q();
        this.f19389h = q;
        this.f19386e = q + jw32.mo9361q();
        this.f19390i = Math.max(jw3.mo10024s(), jw32.mo10024s()) + 1;
    }

    /* renamed from: R */
    static jw3 m22498R(jw3 jw3, jw3 jw32) {
        if (jw32.mo9361q() == 0) {
            return jw3;
        }
        if (jw3.mo9361q() == 0) {
            return jw32;
        }
        int q = jw3.mo9361q() + jw32.mo9361q();
        if (q < 128) {
            return m22499T(jw3, jw32);
        }
        if (jw3 instanceof vz3) {
            vz3 vz3 = (vz3) jw3;
            if (vz3.f19388g.mo9361q() + jw32.mo9361q() < 128) {
                return new vz3(vz3.f19387f, m22499T(vz3.f19388g, jw32));
            } else if (vz3.f19387f.mo10024s() > vz3.f19388g.mo10024s() && vz3.f19390i > jw32.mo10024s()) {
                return new vz3(vz3.f19387f, new vz3(vz3.f19388g, jw32));
            }
        }
        if (q >= m22500V(Math.max(jw3.mo10024s(), jw32.mo10024s()) + 1)) {
            return new vz3(jw3, jw32);
        }
        return rz3.m20089a(new rz3((qz3) null), jw3, jw32);
    }

    /* renamed from: T */
    private static jw3 m22499T(jw3 jw3, jw3 jw32) {
        int q = jw3.mo9361q();
        int q2 = jw32.mo9361q();
        byte[] bArr = new byte[(q + q2)];
        jw3.mo11527f(bArr, 0, 0, q);
        jw32.mo11527f(bArr, 0, q, q2);
        return new fw3(bArr);
    }

    /* renamed from: V */
    static int m22500V(int i) {
        int[] iArr = f19385r;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo10318A(yv3 yv3) throws IOException {
        this.f19387f.mo10318A(yv3);
        this.f19388g.mo10318A(yv3);
    }

    /* renamed from: B */
    public final boolean mo10319B() {
        int v = this.f19387f.mo10322v(0, 0, this.f19389h);
        jw3 jw3 = this.f19388g;
        if (jw3.mo10322v(v, 0, jw3.mo9361q()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final dw3 mo11525E() {
        return new pz3(this);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jw3)) {
            return false;
        }
        jw3 jw3 = (jw3) obj;
        if (this.f19386e != jw3.mo9361q()) {
            return false;
        }
        if (this.f19386e == 0) {
            return true;
        }
        int D = mo11524D();
        int D2 = jw3.mo11524D();
        if (D != 0 && D2 != 0 && D != D2) {
            return false;
        }
        tz3 tz3 = new tz3(this, (sz3) null);
        ew3 a = tz3.next();
        tz3 tz32 = new tz3(jw3, (sz3) null);
        ew3 a2 = tz32.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int q = a.mo9361q() - i;
            int q2 = a2.mo9361q() - i2;
            int min = Math.min(q, q2);
            if (i == 0) {
                z = a.mo10023P(a2, i2, min);
            } else {
                z = a2.mo10023P(a, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f19386e;
            if (i3 < i4) {
                if (min == q) {
                    a = tz3.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == q2) {
                    a2 = tz32.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new pz3(this);
    }

    /* renamed from: k */
    public final byte mo9359k(int i) {
        jw3.m15091c(i, this.f19386e);
        return mo9360l(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final byte mo9360l(int i) {
        int i2 = this.f19389h;
        if (i < i2) {
            return this.f19387f.mo9360l(i);
        }
        return this.f19388g.mo9360l(i - i2);
    }

    /* renamed from: q */
    public final int mo9361q() {
        return this.f19386e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo9362r(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f19389h;
        if (i + i3 <= i4) {
            this.f19387f.mo9362r(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f19388g.mo9362r(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.f19387f.mo9362r(bArr, i, i2, i5);
            this.f19388g.mo9362r(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo10024s() {
        return this.f19390i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo10025t() {
        return this.f19386e >= m22500V(this.f19390i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo10321u(int i, int i2, int i3) {
        int i4 = this.f19389h;
        if (i2 + i3 <= i4) {
            return this.f19387f.mo10321u(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f19388g.mo10321u(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f19388g.mo10321u(this.f19387f.mo10321u(i, i2, i5), 0, i3 - i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo10322v(int i, int i2, int i3) {
        int i4 = this.f19389h;
        if (i2 + i3 <= i4) {
            return this.f19387f.mo10322v(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f19388g.mo10322v(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f19388g.mo10322v(this.f19387f.mo10322v(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: w */
    public final jw3 mo10323w(int i, int i2) {
        int C = jw3.m15083C(i, i2, this.f19386e);
        if (C == 0) {
            return jw3.f11808b;
        }
        if (C == this.f19386e) {
            return this;
        }
        int i3 = this.f19389h;
        if (i2 <= i3) {
            return this.f19387f.mo10323w(i, i2);
        }
        if (i >= i3) {
            return this.f19388g.mo10323w(i - i3, i2 - i3);
        }
        jw3 jw3 = this.f19387f;
        return new vz3(jw3.mo10323w(i, jw3.mo9361q()), this.f19388g.mo10323w(0, i2 - this.f19389h));
    }

    /* renamed from: x */
    public final sw3 mo10324x() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        tz3 tz3 = new tz3(this, (sz3) null);
        while (tz3.hasNext()) {
            arrayList.add(tz3.next().mo10326z());
        }
        int i = sw3.f17686e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new ow3(arrayList, i2, true, (mw3) null);
        }
        return sw3.m20671g(new fy3(arrayList), 4096);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo10325y(Charset charset) {
        return new String(mo11531j(), charset);
    }
}
