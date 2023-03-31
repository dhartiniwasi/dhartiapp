package p002a0;

import java.nio.ByteBuffer;

/* renamed from: a0.c */
/* compiled from: Table */
public class C0004c {

    /* renamed from: a */
    protected int f7a;

    /* renamed from: b */
    protected ByteBuffer f8b;

    /* renamed from: c */
    private int f9c;

    /* renamed from: d */
    private int f10d;

    /* renamed from: e */
    C0005d f11e = C0005d.m26a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo20a(int i) {
        return i + this.f8b.getInt(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo21b(int i) {
        if (i < this.f10d) {
            return this.f8b.getShort(this.f9c + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22c(int i, ByteBuffer byteBuffer) {
        this.f8b = byteBuffer;
        if (byteBuffer != null) {
            this.f7a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f9c = i2;
            this.f10d = this.f8b.getShort(i2);
            return;
        }
        this.f7a = 0;
        this.f9c = 0;
        this.f10d = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo23d(int i) {
        int i2 = i + this.f7a;
        return i2 + this.f8b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo24e(int i) {
        int i2 = i + this.f7a;
        return this.f8b.getInt(i2 + this.f8b.getInt(i2));
    }
}
