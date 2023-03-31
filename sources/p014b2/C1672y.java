package p014b2;

import java.nio.ByteBuffer;
import p014b2.C1637g;
import p161w3.C5917a;

/* renamed from: b2.y */
/* compiled from: ChannelMappingAudioProcessor */
final class C1672y extends C1671x {

    /* renamed from: i */
    private int[] f4850i;

    /* renamed from: j */
    private int[] f4851j;

    C1672y() {
    }

    /* renamed from: c */
    public C1637g.C1638a mo6455c(C1637g.C1638a aVar) throws C1637g.C1639b {
        int[] iArr = this.f4850i;
        if (iArr == null) {
            return C1637g.C1638a.f4701e;
        }
        if (aVar.f4704c == 2) {
            boolean z = aVar.f4703b != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f4703b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new C1637g.C1639b(aVar);
                }
            }
            if (z) {
                return new C1637g.C1638a(aVar.f4702a, iArr.length, 2);
            }
            return C1637g.C1638a.f4701e;
        }
        throw new C1637g.C1639b(aVar);
    }

    /* renamed from: f */
    public void mo6456f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C5917a.m34872e(this.f4851j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = mo6623l(((limit - position) / this.f4843b.f4705d) * this.f4844c.f4705d);
        while (position < limit) {
            for (int i : iArr) {
                l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f4843b.f4705d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6521i() {
        this.f4851j = this.f4850i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6523k() {
        this.f4851j = null;
        this.f4850i = null;
    }

    /* renamed from: m */
    public void mo6624m(int[] iArr) {
        this.f4850i = iArr;
    }
}
