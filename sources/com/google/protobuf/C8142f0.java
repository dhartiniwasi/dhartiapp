package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.protobuf.f0 */
/* compiled from: IterableByteBufferInputStream */
class C8142f0 extends InputStream {

    /* renamed from: a */
    private Iterator<ByteBuffer> f34876a;

    /* renamed from: b */
    private ByteBuffer f34877b;

    /* renamed from: c */
    private int f34878c = 0;

    /* renamed from: d */
    private int f34879d;

    /* renamed from: e */
    private int f34880e;

    /* renamed from: f */
    private boolean f34881f;

    /* renamed from: g */
    private byte[] f34882g;

    /* renamed from: h */
    private int f34883h;

    /* renamed from: i */
    private long f34884i;

    C8142f0(Iterable<ByteBuffer> iterable) {
        this.f34876a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f34878c++;
        }
        this.f34879d = -1;
        if (!m44742a()) {
            this.f34877b = C8119d0.f34858e;
            this.f34879d = 0;
            this.f34880e = 0;
            this.f34884i = 0;
        }
    }

    /* renamed from: a */
    private boolean m44742a() {
        this.f34879d++;
        if (!this.f34876a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f34876a.next();
        this.f34877b = next;
        this.f34880e = next.position();
        if (this.f34877b.hasArray()) {
            this.f34881f = true;
            this.f34882g = this.f34877b.array();
            this.f34883h = this.f34877b.arrayOffset();
        } else {
            this.f34881f = false;
            this.f34884i = C8268z1.m46012k(this.f34877b);
            this.f34882g = null;
        }
        return true;
    }

    /* renamed from: b */
    private void m44743b(int i) {
        int i2 = this.f34880e + i;
        this.f34880e = i2;
        if (i2 == this.f34877b.limit()) {
            m44742a();
        }
    }

    public int read() throws IOException {
        if (this.f34879d == this.f34878c) {
            return -1;
        }
        if (this.f34881f) {
            byte b = this.f34882g[this.f34880e + this.f34883h] & 255;
            m44743b(1);
            return b;
        }
        byte w = C8268z1.m46024w(((long) this.f34880e) + this.f34884i) & 255;
        m44743b(1);
        return w;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f34879d == this.f34878c) {
            return -1;
        }
        int limit = this.f34877b.limit();
        int i3 = this.f34880e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f34881f) {
            System.arraycopy(this.f34882g, i3 + this.f34883h, bArr, i, i2);
            m44743b(i2);
        } else {
            int position = this.f34877b.position();
            this.f34877b.position(this.f34880e);
            this.f34877b.get(bArr, i, i2);
            this.f34877b.position(position);
            m44743b(i2);
        }
        return i2;
    }
}
