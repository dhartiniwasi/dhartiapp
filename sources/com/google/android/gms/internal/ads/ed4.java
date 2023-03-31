package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ed4 extends ec4 {

    /* renamed from: i */
    private int f8746i;

    /* renamed from: j */
    private boolean f8747j;

    /* renamed from: k */
    private byte[] f8748k;

    /* renamed from: l */
    private byte[] f8749l;

    /* renamed from: m */
    private int f8750m;

    /* renamed from: n */
    private int f8751n;

    /* renamed from: o */
    private int f8752o;

    /* renamed from: p */
    private boolean f8753p;

    /* renamed from: q */
    private long f8754q;

    public ed4() {
        byte[] bArr = gb2.f9817f;
        this.f8748k = bArr;
        this.f8749l = bArr;
    }

    /* renamed from: o */
    private final int m12043o(long j) {
        return (int) ((j * ((long) this.f8734b.f8727a)) / 1000000);
    }

    /* renamed from: p */
    private final int m12044p(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f8746i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: q */
    private final void m12045q(byte[] bArr, int i) {
        mo9882h(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f8753p = true;
        }
    }

    /* renamed from: r */
    private final void m12046r(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f8752o);
        int i2 = this.f8752o - min;
        System.arraycopy(bArr, i - i2, this.f8749l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f8749l, i2, min);
    }

    /* renamed from: a */
    public final void mo9558a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo9886l()) {
            int i = this.f8750m;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f8748k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f8746i;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f8750m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo9882h(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f8753p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int p = m12044p(byteBuffer);
                byteBuffer.limit(p);
                this.f8754q += (long) (byteBuffer.remaining() / this.f8746i);
                m12046r(byteBuffer, this.f8749l, this.f8752o);
                if (p < limit3) {
                    m12045q(this.f8749l, this.f8752o);
                    this.f8750m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int p2 = m12044p(byteBuffer);
                int position2 = p2 - byteBuffer.position();
                byte[] bArr = this.f8748k;
                int length = bArr.length;
                int i3 = this.f8751n;
                int i4 = length - i3;
                if (p2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f8748k, this.f8751n, min);
                    int i5 = this.f8751n + min;
                    this.f8751n = i5;
                    byte[] bArr2 = this.f8748k;
                    if (i5 == bArr2.length) {
                        if (this.f8753p) {
                            m12045q(bArr2, this.f8752o);
                            long j = this.f8754q;
                            int i6 = this.f8751n;
                            int i7 = this.f8752o;
                            this.f8754q = j + ((long) ((i6 - (i7 + i7)) / this.f8746i));
                            i5 = i6;
                        } else {
                            this.f8754q += (long) ((i5 - this.f8752o) / this.f8746i);
                        }
                        m12046r(byteBuffer, this.f8748k, i5);
                        this.f8751n = 0;
                        this.f8750m = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m12045q(bArr, i3);
                    this.f8751n = 0;
                    this.f8750m = 0;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo9878c() {
        return this.f8747j;
    }

    /* renamed from: g */
    public final eb4 mo9559g(eb4 eb4) throws fb4 {
        if (eb4.f8729c == 2) {
            return this.f8747j ? eb4 : eb4.f8726e;
        }
        throw new fb4(eb4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9883i() {
        if (this.f8747j) {
            this.f8746i = this.f8734b.f8730d;
            int o = m12043o(150000) * this.f8746i;
            if (this.f8748k.length != o) {
                this.f8748k = new byte[o];
            }
            int o2 = m12043o(20000) * this.f8746i;
            this.f8752o = o2;
            if (this.f8749l.length != o2) {
                this.f8749l = new byte[o2];
            }
        }
        this.f8750m = 0;
        this.f8754q = 0;
        this.f8751n = 0;
        this.f8753p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo9884j() {
        int i = this.f8751n;
        if (i > 0) {
            m12045q(this.f8748k, i);
        }
        if (!this.f8753p) {
            this.f8754q += (long) (this.f8752o / this.f8746i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9885k() {
        this.f8747j = false;
        this.f8752o = 0;
        byte[] bArr = gb2.f9817f;
        this.f8748k = bArr;
        this.f8749l = bArr;
    }

    /* renamed from: m */
    public final long mo9888m() {
        return this.f8754q;
    }

    /* renamed from: n */
    public final void mo9889n(boolean z) {
        this.f8747j = z;
    }
}
