package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fy3 extends InputStream {

    /* renamed from: a */
    private Iterator f9580a;

    /* renamed from: b */
    private ByteBuffer f9581b;

    /* renamed from: c */
    private int f9582c = 0;

    /* renamed from: d */
    private int f9583d;

    /* renamed from: e */
    private int f9584e;

    /* renamed from: f */
    private boolean f9585f;

    /* renamed from: g */
    private byte[] f9586g;

    /* renamed from: h */
    private int f9587h;

    /* renamed from: i */
    private long f9588i;

    fy3(Iterable iterable) {
        this.f9580a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f9582c++;
        }
        this.f9583d = -1;
        if (!m12918b()) {
            this.f9581b = cy3.f7985e;
            this.f9583d = 0;
            this.f9584e = 0;
            this.f9588i = 0;
        }
    }

    /* renamed from: a */
    private final void m12917a(int i) {
        int i2 = this.f9584e + i;
        this.f9584e = i2;
        if (i2 == this.f9581b.limit()) {
            m12918b();
        }
    }

    /* renamed from: b */
    private final boolean m12918b() {
        this.f9583d++;
        if (!this.f9580a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f9580a.next();
        this.f9581b = byteBuffer;
        this.f9584e = byteBuffer.position();
        if (this.f9581b.hasArray()) {
            this.f9585f = true;
            this.f9586g = this.f9581b.array();
            this.f9587h = this.f9581b.arrayOffset();
        } else {
            this.f9585f = false;
            this.f9588i = y04.m23663m(this.f9581b);
            this.f9586g = null;
        }
        return true;
    }

    public final int read() throws IOException {
        byte i;
        if (this.f9583d == this.f9582c) {
            return -1;
        }
        if (this.f9585f) {
            i = this.f9586g[this.f9584e + this.f9587h];
            m12917a(1);
        } else {
            i = y04.m23659i(((long) this.f9584e) + this.f9588i);
            m12917a(1);
        }
        return i & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9583d == this.f9582c) {
            return -1;
        }
        int limit = this.f9581b.limit();
        int i3 = this.f9584e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f9585f) {
            System.arraycopy(this.f9586g, i3 + this.f9587h, bArr, i, i2);
            m12917a(i2);
        } else {
            int position = this.f9581b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f9581b.position(this.f9584e);
            this.f9581b.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f9581b.position(position);
            m12917a(i2);
        }
        return i2;
    }
}
