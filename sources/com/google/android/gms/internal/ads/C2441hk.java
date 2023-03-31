package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.hk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2441hk implements C2403gj {

    /* renamed from: b */
    private int f10357b = -1;

    /* renamed from: c */
    private int f10358c = -1;

    /* renamed from: d */
    private C2404gk f10359d;

    /* renamed from: e */
    private float f10360e = 1.0f;

    /* renamed from: f */
    private float f10361f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f10362g;

    /* renamed from: h */
    private ShortBuffer f10363h;

    /* renamed from: i */
    private ByteBuffer f10364i;

    /* renamed from: j */
    private long f10365j;

    /* renamed from: k */
    private long f10366k;

    /* renamed from: l */
    private boolean f10367l;

    public C2441hk() {
        ByteBuffer byteBuffer = C2403gj.f9915a;
        this.f10362g = byteBuffer;
        this.f10363h = byteBuffer.asShortBuffer();
        this.f10364i = byteBuffer;
    }

    /* renamed from: V */
    public final boolean mo8838V() {
        return Math.abs(this.f10360e + -1.0f) >= 0.01f || Math.abs(this.f10361f + -1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f10359d;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8839W() {
        /*
            r3 = this;
            boolean r0 = r3.f10367l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.gk r0 = r3.f10359d
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo10557a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2441hk.mo8839W():boolean");
    }

    /* renamed from: a */
    public final void mo8840a() {
        this.f10359d.mo10559c();
        this.f10367l = true;
    }

    /* renamed from: b */
    public final void mo8841b() {
        C2404gk gkVar = new C2404gk(this.f10358c, this.f10357b);
        this.f10359d = gkVar;
        gkVar.mo10562f(this.f10360e);
        this.f10359d.mo10561e(this.f10361f);
        this.f10364i = C2403gj.f9915a;
        this.f10365j = 0;
        this.f10366k = 0;
        this.f10367l = false;
    }

    /* renamed from: c */
    public final void mo8842c() {
        this.f10359d = null;
        ByteBuffer byteBuffer = C2403gj.f9915a;
        this.f10362g = byteBuffer;
        this.f10363h = byteBuffer.asShortBuffer();
        this.f10364i = byteBuffer;
        this.f10357b = -1;
        this.f10358c = -1;
        this.f10365j = 0;
        this.f10366k = 0;
        this.f10367l = false;
    }

    /* renamed from: d */
    public final int mo8843d() {
        return 2;
    }

    /* renamed from: e */
    public final ByteBuffer mo8844e() {
        ByteBuffer byteBuffer = this.f10364i;
        this.f10364i = C2403gj.f9915a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final void mo8845f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f10365j += (long) remaining;
            this.f10359d.mo10560d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = this.f10359d.mo10557a() * this.f10357b;
        int i = a + a;
        if (i > 0) {
            if (this.f10362g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f10362g = order;
                this.f10363h = order.asShortBuffer();
            } else {
                this.f10362g.clear();
                this.f10363h.clear();
            }
            this.f10359d.mo10558b(this.f10363h);
            this.f10366k += (long) i;
            this.f10362g.limit(i);
            this.f10364i = this.f10362g;
        }
    }

    /* renamed from: g */
    public final boolean mo8846g(int i, int i2, int i3) throws C2366fj {
        if (i3 != 2) {
            throw new C2366fj(i, i2, i3);
        } else if (this.f10358c == i && this.f10357b == i2) {
            return false;
        } else {
            this.f10358c = i;
            this.f10357b = i2;
            return true;
        }
    }

    /* renamed from: h */
    public final float mo10827h(float f) {
        this.f10361f = C2893tq.m21170a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: i */
    public final float mo10828i(float f) {
        float a = C2893tq.m21170a(f, 0.1f, 8.0f);
        this.f10360e = a;
        return a;
    }

    /* renamed from: j */
    public final long mo10829j() {
        return this.f10365j;
    }

    /* renamed from: k */
    public final long mo10830k() {
        return this.f10366k;
    }

    public final int zza() {
        return this.f10357b;
    }
}
