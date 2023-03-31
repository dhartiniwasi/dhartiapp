package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fn4 implements rn4 {

    /* renamed from: a */
    private final byte[] f9357a = new byte[4096];

    /* renamed from: b */
    private final cf4 f9358b;

    /* renamed from: c */
    private final long f9359c;

    /* renamed from: d */
    private long f9360d;

    /* renamed from: e */
    private byte[] f9361e = new byte[65536];

    /* renamed from: f */
    private int f9362f;

    /* renamed from: g */
    private int f9363g;

    static {
        C2492ix.m14583b("media3.extractor");
    }

    public fn4(cf4 cf4, long j, long j2) {
        this.f9358b = cf4;
        this.f9360d = j;
        this.f9359c = j2;
    }

    /* renamed from: o */
    private final int m12722o(byte[] bArr, int i, int i2) {
        int i3 = this.f9363g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f9361e, 0, bArr, i, min);
        m12727t(min);
        return min;
    }

    /* renamed from: p */
    private final int m12723p(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int c = this.f9358b.mo8792c(bArr, i + i3, i2 - i3);
            if (c != -1) {
                return i3 + c;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: q */
    private final int m12724q(int i) {
        int min = Math.min(this.f9363g, i);
        m12727t(min);
        return min;
    }

    /* renamed from: r */
    private final void m12725r(int i) {
        if (i != -1) {
            this.f9360d += (long) i;
        }
    }

    /* renamed from: s */
    private final void m12726s(int i) {
        int i2 = this.f9362f + i;
        int length = this.f9361e.length;
        if (i2 > length) {
            this.f9361e = Arrays.copyOf(this.f9361e, gb2.m13146P(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: t */
    private final void m12727t(int i) {
        int i2 = this.f9363g - i;
        this.f9363g = i2;
        this.f9362f = 0;
        byte[] bArr = this.f9361e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f9361e = bArr2;
    }

    /* renamed from: H */
    public final void mo9980H(int i) throws IOException {
        mo10218n(i, false);
    }

    /* renamed from: T */
    public final long mo9003T() {
        return this.f9360d;
    }

    /* renamed from: W */
    public final void mo9981W() {
        this.f9362f = 0;
    }

    /* renamed from: a */
    public final long mo9004a() {
        return this.f9360d + ((long) this.f9362f);
    }

    /* renamed from: b */
    public final long mo9005b() {
        return this.f9359c;
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws IOException {
        int o = m12722o(bArr, i, i2);
        if (o == 0) {
            o = m12723p(bArr, i, i2, 0, true);
        }
        m12725r(o);
        return o;
    }

    /* renamed from: d */
    public final int mo9982d(int i) throws IOException {
        int q = m12724q(1);
        if (q == 0) {
            q = m12723p(this.f9357a, 0, Math.min(1, 4096), 0, true);
        }
        m12725r(q);
        return q;
    }

    /* renamed from: f0 */
    public final void mo9983f0(int i) throws IOException {
        mo10217m(i, false);
    }

    /* renamed from: g */
    public final boolean mo9984g(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int o = m12722o(bArr, i, i2);
        while (o < i2 && o != -1) {
            o = m12723p(bArr, i, i2, o, z);
        }
        m12725r(o);
        return o != -1;
    }

    /* renamed from: h */
    public final int mo9985h(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m12726s(i2);
        int i4 = this.f9363g;
        int i5 = this.f9362f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m12723p(this.f9361e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f9363g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f9361e, this.f9362f, bArr, i, i3);
        this.f9362f += i3;
        return i3;
    }

    /* renamed from: i */
    public final boolean mo9986i(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo10217m(i2, z)) {
            return false;
        }
        System.arraycopy(this.f9361e, this.f9362f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: j */
    public final void mo9987j(byte[] bArr, int i, int i2) throws IOException {
        mo9984g(bArr, i, i2, false);
    }

    /* renamed from: l */
    public final void mo9988l(byte[] bArr, int i, int i2) throws IOException {
        mo9986i(bArr, i, i2, false);
    }

    /* renamed from: m */
    public final boolean mo10217m(int i, boolean z) throws IOException {
        m12726s(i);
        int i2 = this.f9363g - this.f9362f;
        while (i2 < i) {
            i2 = m12723p(this.f9361e, this.f9362f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f9363g = this.f9362f + i2;
        }
        this.f9362f += i;
        return true;
    }

    /* renamed from: n */
    public final boolean mo10218n(int i, boolean z) throws IOException {
        int q = m12724q(i);
        while (q < i && q != -1) {
            q = m12723p(this.f9357a, -q, Math.min(i, q + 4096), q, false);
        }
        m12725r(q);
        return q != -1;
    }
}
