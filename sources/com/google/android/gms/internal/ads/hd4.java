package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class hd4 extends ec4 {

    /* renamed from: i */
    private int f10290i;

    /* renamed from: j */
    private int f10291j;

    /* renamed from: k */
    private boolean f10292k;

    /* renamed from: l */
    private int f10293l;

    /* renamed from: m */
    private byte[] f10294m = gb2.f9817f;

    /* renamed from: n */
    private int f10295n;

    /* renamed from: o */
    private long f10296o;

    /* renamed from: U */
    public final boolean mo9876U() {
        return super.mo9876U() && this.f10295n == 0;
    }

    /* renamed from: a */
    public final void mo9558a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f10293l);
            this.f10296o += (long) (min / this.f8734b.f8730d);
            this.f10293l -= min;
            byteBuffer.position(position + min);
            if (this.f10293l <= 0) {
                int i2 = i - min;
                int length = (this.f10295n + i2) - this.f10294m.length;
                ByteBuffer h = mo9882h(length);
                int P = gb2.m13146P(length, 0, this.f10295n);
                h.put(this.f10294m, 0, P);
                int P2 = gb2.m13146P(length - P, 0, i2);
                byteBuffer.limit(byteBuffer.position() + P2);
                h.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - P2;
                int i4 = this.f10295n - P;
                this.f10295n = i4;
                byte[] bArr = this.f10294m;
                System.arraycopy(bArr, P, bArr, 0, i4);
                byteBuffer.get(this.f10294m, this.f10295n, i3);
                this.f10295n += i3;
                h.flip();
            }
        }
    }

    /* renamed from: d */
    public final ByteBuffer mo9879d() {
        int i;
        if (super.mo9876U() && (i = this.f10295n) > 0) {
            mo9882h(i).put(this.f10294m, 0, this.f10295n).flip();
            this.f10295n = 0;
        }
        return super.mo9879d();
    }

    /* renamed from: g */
    public final eb4 mo9559g(eb4 eb4) throws fb4 {
        if (eb4.f8729c == 2) {
            this.f10292k = true;
            return (this.f10290i == 0 && this.f10291j == 0) ? eb4.f8726e : eb4;
        }
        throw new fb4(eb4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9883i() {
        if (this.f10292k) {
            this.f10292k = false;
            int i = this.f10291j;
            int i2 = this.f8734b.f8730d;
            this.f10294m = new byte[(i * i2)];
            this.f10293l = this.f10290i * i2;
        }
        this.f10295n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo9884j() {
        if (this.f10292k) {
            int i = this.f10295n;
            if (i > 0) {
                this.f10296o += (long) (i / this.f8734b.f8730d);
            }
            this.f10295n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9885k() {
        this.f10294m = gb2.f9817f;
    }

    /* renamed from: m */
    public final long mo10799m() {
        return this.f10296o;
    }

    /* renamed from: n */
    public final void mo10800n() {
        this.f10296o = 0;
    }

    /* renamed from: o */
    public final void mo10801o(int i, int i2) {
        this.f10290i = i;
        this.f10291j = i2;
    }
}
