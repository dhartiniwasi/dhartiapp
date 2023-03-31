package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class fo3 extends zh3 {

    /* renamed from: b */
    public final cl3 f9372b = new cl3();

    /* renamed from: c */
    public ByteBuffer f9373c;

    /* renamed from: d */
    public boolean f9374d;

    /* renamed from: e */
    public long f9375e;

    /* renamed from: f */
    public ByteBuffer f9376f;

    /* renamed from: g */
    private final int f9377g;

    static {
        C2492ix.m14583b("media3.decoder");
    }

    public fo3(int i, int i2) {
        this.f9377g = i;
    }

    /* renamed from: l */
    private final ByteBuffer m12766l(int i) {
        int i2;
        int i3 = this.f9377g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f9373c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new en3(i2, i);
    }

    /* renamed from: b */
    public void mo10233b() {
        super.mo10233b();
        ByteBuffer byteBuffer = this.f9373c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9376f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9374d = false;
    }

    /* renamed from: i */
    public final void mo10234i(int i) {
        ByteBuffer byteBuffer = this.f9373c;
        if (byteBuffer == null) {
            this.f9373c = m12766l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f9373c = byteBuffer;
            return;
        }
        ByteBuffer l = m12766l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f9373c = l;
    }

    /* renamed from: j */
    public final void mo10235j() {
        ByteBuffer byteBuffer = this.f9373c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9376f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean mo10236k() {
        return mo15595d(1073741824);
    }
}
