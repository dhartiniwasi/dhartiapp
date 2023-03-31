package p014b2;

import java.nio.ByteBuffer;
import p014b2.C1637g;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: b2.i0 */
/* compiled from: SilenceSkippingAudioProcessor */
public final class C1644i0 extends C1671x {

    /* renamed from: i */
    private final long f4710i;

    /* renamed from: j */
    private final long f4711j;

    /* renamed from: k */
    private final short f4712k;

    /* renamed from: l */
    private int f4713l;

    /* renamed from: m */
    private boolean f4714m;

    /* renamed from: n */
    private byte[] f4715n;

    /* renamed from: o */
    private byte[] f4716o;

    /* renamed from: p */
    private int f4717p;

    /* renamed from: q */
    private int f4718q;

    /* renamed from: r */
    private int f4719r;

    /* renamed from: s */
    private boolean f4720s;

    /* renamed from: t */
    private long f4721t;

    public C1644i0() {
        this(150000, 20000, 1024);
    }

    /* renamed from: m */
    private int m7544m(long j) {
        return (int) ((j * ((long) this.f4843b.f4702a)) / 1000000);
    }

    /* renamed from: n */
    private int m7545n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f4712k) {
                int i = this.f4713l;
                return ((limit / i) * i) + i;
            }
        }
    }

    /* renamed from: o */
    private int m7546o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f4712k) {
                int i = this.f4713l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: q */
    private void m7547q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo6623l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f4720s = true;
        }
    }

    /* renamed from: r */
    private void m7548r(byte[] bArr, int i) {
        mo6623l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f4720s = true;
        }
    }

    /* renamed from: s */
    private void m7549s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = m7546o(byteBuffer);
        int position = o - byteBuffer.position();
        byte[] bArr = this.f4715n;
        int length = bArr.length;
        int i = this.f4718q;
        int i2 = length - i;
        if (o >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f4715n, this.f4718q, min);
            int i3 = this.f4718q + min;
            this.f4718q = i3;
            byte[] bArr2 = this.f4715n;
            if (i3 == bArr2.length) {
                if (this.f4720s) {
                    m7548r(bArr2, this.f4719r);
                    this.f4721t += (long) ((this.f4718q - (this.f4719r * 2)) / this.f4713l);
                } else {
                    this.f4721t += (long) ((i3 - this.f4719r) / this.f4713l);
                }
                m7552w(byteBuffer, this.f4715n, this.f4718q);
                this.f4718q = 0;
                this.f4717p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m7548r(bArr, i);
        this.f4718q = 0;
        this.f4717p = 0;
    }

    /* renamed from: t */
    private void m7550t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f4715n.length));
        int n = m7545n(byteBuffer);
        if (n == byteBuffer.position()) {
            this.f4717p = 1;
        } else {
            byteBuffer.limit(n);
            m7547q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: u */
    private void m7551u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = m7546o(byteBuffer);
        byteBuffer.limit(o);
        this.f4721t += (long) (byteBuffer.remaining() / this.f4713l);
        m7552w(byteBuffer, this.f4716o, this.f4719r);
        if (o < limit) {
            m7548r(this.f4716o, this.f4719r);
            this.f4717p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: w */
    private void m7552w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f4719r);
        int i2 = this.f4719r - min;
        System.arraycopy(bArr, i - i2, this.f4716o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f4716o, i2, min);
    }

    /* renamed from: b */
    public boolean mo6512b() {
        return this.f4714m;
    }

    /* renamed from: c */
    public C1637g.C1638a mo6455c(C1637g.C1638a aVar) throws C1637g.C1639b {
        if (aVar.f4704c == 2) {
            return this.f4714m ? aVar : C1637g.C1638a.f4701e;
        }
        throw new C1637g.C1639b(aVar);
    }

    /* renamed from: f */
    public void mo6456f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !mo6622a()) {
            int i = this.f4717p;
            if (i == 0) {
                m7550t(byteBuffer);
            } else if (i == 1) {
                m7549s(byteBuffer);
            } else if (i == 2) {
                m7551u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6521i() {
        if (this.f4714m) {
            this.f4713l = this.f4843b.f4705d;
            int m = m7544m(this.f4710i) * this.f4713l;
            if (this.f4715n.length != m) {
                this.f4715n = new byte[m];
            }
            int m2 = m7544m(this.f4711j) * this.f4713l;
            this.f4719r = m2;
            if (this.f4716o.length != m2) {
                this.f4716o = new byte[m2];
            }
        }
        this.f4717p = 0;
        this.f4721t = 0;
        this.f4718q = 0;
        this.f4720s = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo6522j() {
        int i = this.f4718q;
        if (i > 0) {
            m7548r(this.f4715n, i);
        }
        if (!this.f4720s) {
            this.f4721t += (long) (this.f4719r / this.f4713l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6523k() {
        this.f4714m = false;
        this.f4719r = 0;
        byte[] bArr = C5953m0.f29115f;
        this.f4715n = bArr;
        this.f4716o = bArr;
    }

    /* renamed from: p */
    public long mo6524p() {
        return this.f4721t;
    }

    /* renamed from: v */
    public void mo6525v(boolean z) {
        this.f4714m = z;
    }

    public C1644i0(long j, long j2, short s) {
        C5917a.m34868a(j2 <= j);
        this.f4710i = j;
        this.f4711j = j2;
        this.f4712k = s;
        byte[] bArr = C5953m0.f29115f;
        this.f4715n = bArr;
        this.f4716o = bArr;
    }
}
