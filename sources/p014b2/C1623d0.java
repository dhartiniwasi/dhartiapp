package p014b2;

import java.nio.ByteBuffer;
import p014b2.C1637g;
import p161w3.C5953m0;

/* renamed from: b2.d0 */
/* compiled from: FloatResamplingAudioProcessor */
final class C1623d0 extends C1671x {

    /* renamed from: i */
    private static final int f4652i = Float.floatToIntBits(Float.NaN);

    C1623d0() {
    }

    /* renamed from: m */
    private static void m7445m(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f4652i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: c */
    public C1637g.C1638a mo6455c(C1637g.C1638a aVar) throws C1637g.C1639b {
        int i = aVar.f4704c;
        if (!C5953m0.m35157s0(i)) {
            throw new C1637g.C1639b(aVar);
        } else if (i != 4) {
            return new C1637g.C1638a(aVar.f4702a, aVar.f4703b, 4);
        } else {
            return C1637g.C1638a.f4701e;
        }
    }

    /* renamed from: f */
    public void mo6456f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f4843b.f4704c;
        if (i2 == 536870912) {
            byteBuffer2 = mo6623l((i / 3) * 4);
            while (position < limit) {
                m7445m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo6623l(i);
            while (position < limit) {
                m7445m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
}
