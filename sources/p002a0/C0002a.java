package p002a0;

import java.nio.ByteBuffer;

/* renamed from: a0.a */
/* compiled from: MetadataItem */
public final class C0002a extends C0004c {
    /* renamed from: f */
    public C0002a mo6f(int i, ByteBuffer byteBuffer) {
        mo7g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo7g(int i, ByteBuffer byteBuffer) {
        mo22c(i, byteBuffer);
    }

    /* renamed from: h */
    public int mo8h(int i) {
        int b = mo21b(16);
        if (b != 0) {
            return this.f8b.getInt(mo23d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int mo9i() {
        int b = mo21b(16);
        if (b != 0) {
            return mo24e(b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean mo10j() {
        int b = mo21b(6);
        return (b == 0 || this.f8b.get(b + this.f7a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short mo11k() {
        int b = mo21b(14);
        if (b != 0) {
            return this.f8b.getShort(b + this.f7a);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo12l() {
        int b = mo21b(4);
        if (b != 0) {
            return this.f8b.getInt(b + this.f7a);
        }
        return 0;
    }

    /* renamed from: m */
    public short mo13m() {
        int b = mo21b(8);
        if (b != 0) {
            return this.f8b.getShort(b + this.f7a);
        }
        return 0;
    }

    /* renamed from: n */
    public short mo14n() {
        int b = mo21b(12);
        if (b != 0) {
            return this.f8b.getShort(b + this.f7a);
        }
        return 0;
    }
}
