package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fc4 extends ec4 {

    /* renamed from: i */
    private int[] f9218i;

    /* renamed from: j */
    private int[] f9219j;

    fc4() {
    }

    /* renamed from: a */
    public final void mo9558a(ByteBuffer byteBuffer) {
        int[] iArr = this.f9219j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer h = mo9882h(((limit - position) / this.f8734b.f8730d) * this.f8735c.f8730d);
        while (position < limit) {
            for (int i : iArr) {
                h.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f8734b.f8730d;
        }
        byteBuffer.position(limit);
        h.flip();
    }

    /* renamed from: g */
    public final eb4 mo9559g(eb4 eb4) throws fb4 {
        int[] iArr = this.f9218i;
        if (iArr == null) {
            return eb4.f8726e;
        }
        if (eb4.f8729c == 2) {
            boolean z = eb4.f8728b != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new eb4(eb4.f8727a, length, 2) : eb4.f8726e;
                }
                int i2 = iArr[i];
                if (i2 < eb4.f8728b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new fb4(eb4);
                }
            }
        } else {
            throw new fb4(eb4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9883i() {
        this.f9219j = this.f9218i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9885k() {
        this.f9219j = null;
        this.f9218i = null;
    }

    /* renamed from: m */
    public final void mo10127m(int[] iArr) {
        this.f9218i = iArr;
    }
}
