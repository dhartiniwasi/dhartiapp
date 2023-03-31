package p021c2;

import java.nio.ByteBuffer;
import p177z1.C6260o1;

/* renamed from: c2.g */
/* compiled from: DecoderInputBuffer */
public class C1848g extends C1840a {

    /* renamed from: b */
    public final C1842c f5429b;

    /* renamed from: c */
    public ByteBuffer f5430c;

    /* renamed from: d */
    public boolean f5431d;

    /* renamed from: e */
    public long f5432e;

    /* renamed from: f */
    public ByteBuffer f5433f;

    /* renamed from: g */
    private final int f5434g;

    /* renamed from: h */
    private final int f5435h;

    /* renamed from: c2.g$a */
    /* compiled from: DecoderInputBuffer */
    public static final class C1849a extends IllegalStateException {

        /* renamed from: a */
        public final int f5436a;

        /* renamed from: b */
        public final int f5437b;

        public C1849a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f5436a = i;
            this.f5437b = i2;
        }
    }

    static {
        C6260o1.m36802a("goog.exo.decoder");
    }

    public C1848g(int i) {
        this(i, 0);
    }

    /* renamed from: A */
    public static C1848g m8572A() {
        return new C1848g(0);
    }

    /* renamed from: w */
    private ByteBuffer m8573w(int i) {
        int i2 = this.f5434g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f5430c;
        throw new C1849a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    /* renamed from: B */
    public void mo7049B(int i) {
        ByteBuffer byteBuffer = this.f5433f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f5433f = ByteBuffer.allocate(i);
        } else {
            this.f5433f.clear();
        }
    }

    /* renamed from: n */
    public void mo7029n() {
        super.mo7029n();
        ByteBuffer byteBuffer = this.f5430c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f5433f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f5431d = false;
    }

    /* renamed from: x */
    public void mo7050x(int i) {
        int i2 = i + this.f5435h;
        ByteBuffer byteBuffer = this.f5430c;
        if (byteBuffer == null) {
            this.f5430c = m8573w(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f5430c = byteBuffer;
            return;
        }
        ByteBuffer w = m8573w(i3);
        w.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            w.put(byteBuffer);
        }
        this.f5430c = w;
    }

    /* renamed from: y */
    public final void mo7051y() {
        ByteBuffer byteBuffer = this.f5430c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f5433f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: z */
    public final boolean mo7052z() {
        return mo7031p(1073741824);
    }

    public C1848g(int i, int i2) {
        this.f5429b = new C1842c();
        this.f5434g = i;
        this.f5435h = i2;
    }
}
