package p002a0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a0.b */
/* compiled from: MetadataList */
public final class C0003b extends C0004c {
    /* renamed from: h */
    public static C0003b m14h(ByteBuffer byteBuffer) {
        return m15i(byteBuffer, new C0003b());
    }

    /* renamed from: i */
    public static C0003b m15i(ByteBuffer byteBuffer, C0003b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.mo15f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C0003b mo15f(int i, ByteBuffer byteBuffer) {
        mo16g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo16g(int i, ByteBuffer byteBuffer) {
        mo22c(i, byteBuffer);
    }

    /* renamed from: j */
    public C0002a mo17j(C0002a aVar, int i) {
        int b = mo21b(6);
        if (b != 0) {
            return aVar.mo6f(mo20a(mo23d(b) + (i * 4)), this.f8b);
        }
        return null;
    }

    /* renamed from: k */
    public int mo18k() {
        int b = mo21b(6);
        if (b != 0) {
            return mo24e(b);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo19l() {
        int b = mo21b(4);
        if (b != 0) {
            return this.f8b.getInt(b + this.f7a);
        }
        return 0;
    }
}
