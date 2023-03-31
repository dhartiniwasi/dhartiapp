package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vh4 {

    /* renamed from: a */
    private final y22 f19099a = new y22(32);

    /* renamed from: b */
    private uh4 f19100b;

    /* renamed from: c */
    private uh4 f19101c;

    /* renamed from: d */
    private uh4 f19102d;

    /* renamed from: e */
    private long f19103e;

    /* renamed from: f */
    private final nk4 f19104f;

    public vh4(nk4 nk4, byte[] bArr) {
        this.f19104f = nk4;
        uh4 uh4 = new uh4(0, 65536);
        this.f19100b = uh4;
        this.f19101c = uh4;
        this.f19102d = uh4;
    }

    /* renamed from: i */
    private final int m22241i(int i) {
        uh4 uh4 = this.f19102d;
        if (uh4.f18541c == null) {
            gk4 b = this.f19104f.mo12649b();
            uh4 uh42 = new uh4(this.f19102d.f18540b, 65536);
            uh4.f18541c = b;
            uh4.f18542d = uh42;
        }
        return Math.min(i, (int) (this.f19102d.f18540b - this.f19103e));
    }

    /* renamed from: j */
    private static uh4 m22242j(uh4 uh4, long j) {
        while (j >= uh4.f18540b) {
            uh4 = uh4.f18542d;
        }
        return uh4;
    }

    /* renamed from: k */
    private static uh4 m22243k(uh4 uh4, long j, ByteBuffer byteBuffer, int i) {
        uh4 j2 = m22242j(uh4, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.f18540b - j));
            byteBuffer.put(j2.f18541c.f9947a, j2.mo14516a(j), min);
            i -= min;
            j += (long) min;
            if (j == j2.f18540b) {
                j2 = j2.f18542d;
            }
        }
        return j2;
    }

    /* renamed from: l */
    private static uh4 m22244l(uh4 uh4, long j, byte[] bArr, int i) {
        uh4 j2 = m22242j(uh4, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.f18540b - j));
            System.arraycopy(j2.f18541c.f9947a, j2.mo14516a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == j2.f18540b) {
                j2 = j2.f18542d;
            }
        }
        return j2;
    }

    /* renamed from: m */
    private static uh4 m22245m(uh4 uh4, fo3 fo3, xh4 xh4, y22 y22) {
        uh4 uh42;
        int i;
        fo3 fo32 = fo3;
        xh4 xh42 = xh4;
        y22 y222 = y22;
        if (fo3.mo10236k()) {
            long j = xh42.f20108b;
            y222.mo15290c(1);
            uh4 l = m22244l(uh4, j, y22.mo15295h(), 1);
            long j2 = j + 1;
            byte b = y22.mo15295h()[0];
            byte b2 = b & C8843b4.f36445d;
            byte b3 = b & Byte.MAX_VALUE;
            cl3 cl3 = fo32.f9372b;
            byte[] bArr = cl3.f7812a;
            if (bArr == null) {
                cl3.f7812a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            uh42 = m22244l(l, j2, cl3.f7812a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                y222.mo15290c(2);
                uh42 = m22244l(uh42, j3, y22.mo15295h(), 2);
                j3 += 2;
                i = y22.mo15310w();
            } else {
                i = 1;
            }
            int[] iArr = cl3.f7815d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = cl3.f7816e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                y222.mo15290c(i2);
                uh42 = m22244l(uh42, j3, y22.mo15295h(), i2);
                j3 += (long) i2;
                y222.mo15293f(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = y22.mo15310w();
                    iArr4[i3] = y22.mo15309v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = xh42.f20107a - ((int) (j3 - xh42.f20108b));
            }
            C2755q qVar = xh42.f20109c;
            int i4 = gb2.f9812a;
            cl3.mo9210c(i, iArr2, iArr4, qVar.f16102b, cl3.f7812a, qVar.f16101a, qVar.f16103c, qVar.f16104d);
            long j4 = xh42.f20108b;
            int i5 = (int) (j3 - j4);
            xh42.f20108b = j4 + ((long) i5);
            xh42.f20107a -= i5;
        } else {
            uh42 = uh4;
        }
        if (fo3.mo15596e()) {
            y222.mo15290c(4);
            uh4 l2 = m22244l(uh42, xh42.f20108b, y22.mo15295h(), 4);
            int v = y22.mo15309v();
            xh42.f20108b += 4;
            xh42.f20107a -= 4;
            fo32.mo10234i(v);
            uh4 k = m22243k(l2, xh42.f20108b, fo32.f9373c, v);
            xh42.f20108b += (long) v;
            int i6 = xh42.f20107a - v;
            xh42.f20107a = i6;
            ByteBuffer byteBuffer = fo32.f9376f;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                fo32.f9376f = ByteBuffer.allocate(i6);
            } else {
                fo32.f9376f.clear();
            }
            return m22243k(k, xh42.f20108b, fo32.f9376f, xh42.f20107a);
        }
        fo32.mo10234i(xh42.f20107a);
        return m22243k(uh42, xh42.f20108b, fo32.f9373c, xh42.f20107a);
    }

    /* renamed from: n */
    private final void m22246n(int i) {
        long j = this.f19103e + ((long) i);
        this.f19103e = j;
        uh4 uh4 = this.f19102d;
        if (j == uh4.f18540b) {
            this.f19102d = uh4.f18542d;
        }
    }

    /* renamed from: a */
    public final int mo14765a(cf4 cf4, int i, boolean z) throws IOException {
        int i2 = m22241i(i);
        uh4 uh4 = this.f19102d;
        int c = cf4.mo8792c(uh4.f18541c.f9947a, uh4.mo14516a(this.f19103e), i2);
        if (c != -1) {
            m22246n(c);
            return c;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final long mo14766b() {
        return this.f19103e;
    }

    /* renamed from: c */
    public final void mo14767c(long j) {
        uh4 uh4;
        if (j != -1) {
            while (true) {
                uh4 = this.f19100b;
                if (j < uh4.f18540b) {
                    break;
                }
                this.f19104f.mo12650c(uh4.f18541c);
                this.f19100b = this.f19100b.mo14517c();
            }
            if (this.f19101c.f18539a < uh4.f18539a) {
                this.f19101c = uh4;
            }
        }
    }

    /* renamed from: d */
    public final void mo14768d(fo3 fo3, xh4 xh4) {
        m22245m(this.f19101c, fo3, xh4, this.f19099a);
    }

    /* renamed from: e */
    public final void mo14769e(fo3 fo3, xh4 xh4) {
        this.f19101c = m22245m(this.f19101c, fo3, xh4, this.f19099a);
    }

    /* renamed from: f */
    public final void mo14770f() {
        uh4 uh4 = this.f19100b;
        if (uh4.f18541c != null) {
            this.f19104f.mo12651d(uh4);
            uh4.mo14517c();
        }
        this.f19100b.mo14518d(0, 65536);
        uh4 uh42 = this.f19100b;
        this.f19101c = uh42;
        this.f19102d = uh42;
        this.f19103e = 0;
        this.f19104f.mo12654g();
    }

    /* renamed from: g */
    public final void mo14771g() {
        this.f19101c = this.f19100b;
    }

    /* renamed from: h */
    public final void mo14772h(y22 y22, int i) {
        while (i > 0) {
            int i2 = m22241i(i);
            uh4 uh4 = this.f19102d;
            y22.mo15289b(uh4.f18541c.f9947a, uh4.mo14516a(this.f19103e), i2);
            i -= i2;
            m22246n(i2);
        }
    }
}
