package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gd4 implements gb4 {

    /* renamed from: b */
    private int f9841b;

    /* renamed from: c */
    private float f9842c = 1.0f;

    /* renamed from: d */
    private float f9843d = 1.0f;

    /* renamed from: e */
    private eb4 f9844e;

    /* renamed from: f */
    private eb4 f9845f;

    /* renamed from: g */
    private eb4 f9846g;

    /* renamed from: h */
    private eb4 f9847h;

    /* renamed from: i */
    private boolean f9848i;

    /* renamed from: j */
    private fd4 f9849j;

    /* renamed from: k */
    private ByteBuffer f9850k;

    /* renamed from: l */
    private ShortBuffer f9851l;

    /* renamed from: m */
    private ByteBuffer f9852m;

    /* renamed from: n */
    private long f9853n;

    /* renamed from: o */
    private long f9854o;

    /* renamed from: p */
    private boolean f9855p;

    public gd4() {
        eb4 eb4 = eb4.f8726e;
        this.f9844e = eb4;
        this.f9845f = eb4;
        this.f9846g = eb4;
        this.f9847h = eb4;
        ByteBuffer byteBuffer = gb4.f9828a;
        this.f9850k = byteBuffer;
        this.f9851l = byteBuffer.asShortBuffer();
        this.f9852m = byteBuffer;
        this.f9841b = -1;
    }

    /* renamed from: T */
    public final void mo9875T() {
        this.f9842c = 1.0f;
        this.f9843d = 1.0f;
        eb4 eb4 = eb4.f8726e;
        this.f9844e = eb4;
        this.f9845f = eb4;
        this.f9846g = eb4;
        this.f9847h = eb4;
        ByteBuffer byteBuffer = gb4.f9828a;
        this.f9850k = byteBuffer;
        this.f9851l = byteBuffer.asShortBuffer();
        this.f9852m = byteBuffer;
        this.f9841b = -1;
        this.f9848i = false;
        this.f9849j = null;
        this.f9853n = 0;
        this.f9854o = 0;
        this.f9855p = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f9849j;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9876U() {
        /*
            r3 = this;
            boolean r0 = r3.f9855p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.fd4 r0 = r3.f9849j
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo10141a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gd4.mo9876U():boolean");
    }

    /* renamed from: a */
    public final void mo9558a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            fd4 fd4 = this.f9849j;
            Objects.requireNonNull(fd4);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f9853n += (long) remaining;
            fd4.mo10146f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: b */
    public final void mo9877b() {
        fd4 fd4 = this.f9849j;
        if (fd4 != null) {
            fd4.mo10145e();
        }
        this.f9855p = true;
    }

    /* renamed from: c */
    public final boolean mo9878c() {
        if (this.f9845f.f8727a != -1) {
            return Math.abs(this.f9842c + -1.0f) >= 1.0E-4f || Math.abs(this.f9843d + -1.0f) >= 1.0E-4f || this.f9845f.f8727a != this.f9844e.f8727a;
        }
        return false;
    }

    /* renamed from: d */
    public final ByteBuffer mo9879d() {
        int a;
        fd4 fd4 = this.f9849j;
        if (fd4 != null && (a = fd4.mo10141a()) > 0) {
            if (this.f9850k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f9850k = order;
                this.f9851l = order.asShortBuffer();
            } else {
                this.f9850k.clear();
                this.f9851l.clear();
            }
            fd4.mo10144d(this.f9851l);
            this.f9854o += (long) a;
            this.f9850k.limit(a);
            this.f9852m = this.f9850k;
        }
        ByteBuffer byteBuffer = this.f9852m;
        this.f9852m = gb4.f9828a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final void mo9880e() {
        if (mo9878c()) {
            eb4 eb4 = this.f9844e;
            this.f9846g = eb4;
            eb4 eb42 = this.f9845f;
            this.f9847h = eb42;
            if (this.f9848i) {
                this.f9849j = new fd4(eb4.f8727a, eb4.f8728b, this.f9842c, this.f9843d, eb42.f8727a);
            } else {
                fd4 fd4 = this.f9849j;
                if (fd4 != null) {
                    fd4.mo10143c();
                }
            }
        }
        this.f9852m = gb4.f9828a;
        this.f9853n = 0;
        this.f9854o = 0;
        this.f9855p = false;
    }

    /* renamed from: f */
    public final eb4 mo9881f(eb4 eb4) throws fb4 {
        if (eb4.f8729c == 2) {
            int i = this.f9841b;
            if (i == -1) {
                i = eb4.f8727a;
            }
            this.f9844e = eb4;
            eb4 eb42 = new eb4(i, eb4.f8728b, 2);
            this.f9845f = eb42;
            this.f9848i = true;
            return eb42;
        }
        throw new fb4(eb4);
    }

    /* renamed from: g */
    public final long mo10486g(long j) {
        long j2 = this.f9854o;
        if (j2 < 1024) {
            return (long) (((double) this.f9842c) * ((double) j));
        }
        long j3 = this.f9853n;
        fd4 fd4 = this.f9849j;
        Objects.requireNonNull(fd4);
        long b = j3 - ((long) fd4.mo10142b());
        int i = this.f9847h.f8727a;
        int i2 = this.f9846g.f8727a;
        if (i == i2) {
            return gb2.m13170g0(j, b, j2);
        }
        return gb2.m13170g0(j, b * ((long) i), j2 * ((long) i2));
    }

    /* renamed from: h */
    public final void mo10487h(float f) {
        if (this.f9843d != f) {
            this.f9843d = f;
            this.f9848i = true;
        }
    }

    /* renamed from: i */
    public final void mo10488i(float f) {
        if (this.f9842c != f) {
            this.f9842c = f;
            this.f9848i = true;
        }
    }
}
