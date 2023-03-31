package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.nk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2664nk extends C2479ik {

    /* renamed from: b */
    public final C2590lk f14048b = new C2590lk();

    /* renamed from: c */
    public ByteBuffer f14049c;

    /* renamed from: d */
    public long f14050d;

    public C2664nk(int i) {
    }

    /* renamed from: j */
    private final ByteBuffer m17156j(int i) {
        int i2;
        ByteBuffer byteBuffer = this.f14049c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + i2 + " < " + i + ")");
    }

    /* renamed from: b */
    public final void mo11135b() {
        super.mo11135b();
        ByteBuffer byteBuffer = this.f14049c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void mo12645h(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f14049c;
        if (byteBuffer == null) {
            this.f14049c = m17156j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f14049c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer j = m17156j(i2);
            if (position > 0) {
                this.f14049c.position(0);
                this.f14049c.limit(position);
                j.put(this.f14049c);
            }
            this.f14049c = j;
        }
    }

    /* renamed from: i */
    public final boolean mo12646i() {
        return mo11137d(1073741824);
    }
}
