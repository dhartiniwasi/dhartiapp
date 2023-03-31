package p014b2;

import java.nio.ByteBuffer;
import p014b2.C1637g;
import p161w3.C5953m0;

/* renamed from: b2.l0 */
/* compiled from: TrimmingAudioProcessor */
final class C1650l0 extends C1671x {

    /* renamed from: i */
    private int f4765i;

    /* renamed from: j */
    private int f4766j;

    /* renamed from: k */
    private boolean f4767k;

    /* renamed from: l */
    private int f4768l;

    /* renamed from: m */
    private byte[] f4769m = C5953m0.f29115f;

    /* renamed from: n */
    private int f4770n;

    /* renamed from: o */
    private long f4771o;

    /* renamed from: c */
    public C1637g.C1638a mo6455c(C1637g.C1638a aVar) throws C1637g.C1639b {
        if (aVar.f4704c == 2) {
            this.f4767k = true;
            return (this.f4765i == 0 && this.f4766j == 0) ? C1637g.C1638a.f4701e : aVar;
        }
        throw new C1637g.C1639b(aVar);
    }

    /* renamed from: d */
    public boolean mo6513d() {
        return super.mo6513d() && this.f4770n == 0;
    }

    /* renamed from: e */
    public ByteBuffer mo6514e() {
        int i;
        if (super.mo6513d() && (i = this.f4770n) > 0) {
            mo6623l(i).put(this.f4769m, 0, this.f4770n).flip();
            this.f4770n = 0;
        }
        return super.mo6514e();
    }

    /* renamed from: f */
    public void mo6456f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f4768l);
            this.f4771o += (long) (min / this.f4843b.f4705d);
            this.f4768l -= min;
            byteBuffer.position(position + min);
            if (this.f4768l <= 0) {
                int i2 = i - min;
                int length = (this.f4770n + i2) - this.f4769m.length;
                ByteBuffer l = mo6623l(length);
                int q = C5953m0.m35152q(length, 0, this.f4770n);
                l.put(this.f4769m, 0, q);
                int q2 = C5953m0.m35152q(length - q, 0, i2);
                byteBuffer.limit(byteBuffer.position() + q2);
                l.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - q2;
                int i4 = this.f4770n - q;
                this.f4770n = i4;
                byte[] bArr = this.f4769m;
                System.arraycopy(bArr, q, bArr, 0, i4);
                byteBuffer.get(this.f4769m, this.f4770n, i3);
                this.f4770n += i3;
                l.flip();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6521i() {
        if (this.f4767k) {
            this.f4767k = false;
            int i = this.f4766j;
            int i2 = this.f4843b.f4705d;
            this.f4769m = new byte[(i * i2)];
            this.f4768l = this.f4765i * i2;
        }
        this.f4770n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo6522j() {
        if (this.f4767k) {
            int i = this.f4770n;
            if (i > 0) {
                this.f4771o += (long) (i / this.f4843b.f4705d);
            }
            this.f4770n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6523k() {
        this.f4769m = C5953m0.f29115f;
    }

    /* renamed from: m */
    public long mo6538m() {
        return this.f4771o;
    }

    /* renamed from: n */
    public void mo6539n() {
        this.f4771o = 0;
    }

    /* renamed from: o */
    public void mo6540o(int i, int i2) {
        this.f4765i = i;
        this.f4766j = i2;
    }
}
