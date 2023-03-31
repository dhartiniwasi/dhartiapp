package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yc4 extends ec4 {

    /* renamed from: i */
    private static final int f20556i = Float.floatToIntBits(Float.NaN);

    yc4() {
    }

    /* renamed from: m */
    private static void m23942m(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f20556i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: a */
    public final void mo9558a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f8734b.f8729c;
        if (i2 == 536870912) {
            byteBuffer2 = mo9882h((i / 3) * 4);
            while (position < limit) {
                m23942m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo9882h(i);
            while (position < limit) {
                m23942m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: g */
    public final eb4 mo9559g(eb4 eb4) throws fb4 {
        int i = eb4.f8729c;
        if (gb2.m13187u(i)) {
            return i != 4 ? new eb4(eb4.f8727a, eb4.f8728b, 4) : eb4.f8726e;
        }
        throw new fb4(eb4);
    }
}
