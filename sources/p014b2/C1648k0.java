package p014b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p014b2.C1637g;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: b2.k0 */
/* compiled from: SonicAudioProcessor */
public final class C1648k0 implements C1637g {

    /* renamed from: b */
    private int f4748b;

    /* renamed from: c */
    private float f4749c = 1.0f;

    /* renamed from: d */
    private float f4750d = 1.0f;

    /* renamed from: e */
    private C1637g.C1638a f4751e;

    /* renamed from: f */
    private C1637g.C1638a f4752f;

    /* renamed from: g */
    private C1637g.C1638a f4753g;

    /* renamed from: h */
    private C1637g.C1638a f4754h;

    /* renamed from: i */
    private boolean f4755i;

    /* renamed from: j */
    private C1646j0 f4756j;

    /* renamed from: k */
    private ByteBuffer f4757k;

    /* renamed from: l */
    private ShortBuffer f4758l;

    /* renamed from: m */
    private ByteBuffer f4759m;

    /* renamed from: n */
    private long f4760n;

    /* renamed from: o */
    private long f4761o;

    /* renamed from: p */
    private boolean f4762p;

    public C1648k0() {
        C1637g.C1638a aVar = C1637g.C1638a.f4701e;
        this.f4751e = aVar;
        this.f4752f = aVar;
        this.f4753g = aVar;
        this.f4754h = aVar;
        ByteBuffer byteBuffer = C1637g.f4700a;
        this.f4757k = byteBuffer;
        this.f4758l = byteBuffer.asShortBuffer();
        this.f4759m = byteBuffer;
        this.f4748b = -1;
    }

    /* renamed from: a */
    public long mo6534a(long j) {
        if (this.f4761o < 1024) {
            return (long) (((double) this.f4749c) * ((double) j));
        }
        long l = this.f4760n - ((long) ((C1646j0) C5917a.m34872e(this.f4756j)).mo6530l());
        int i = this.f4754h.f4702a;
        int i2 = this.f4753g.f4702a;
        if (i == i2) {
            return C5953m0.m35095N0(j, l, this.f4761o);
        }
        return C5953m0.m35095N0(j, l * ((long) i), this.f4761o * ((long) i2));
    }

    /* renamed from: b */
    public boolean mo6512b() {
        return this.f4752f.f4702a != -1 && (Math.abs(this.f4749c - 1.0f) >= 1.0E-4f || Math.abs(this.f4750d - 1.0f) >= 1.0E-4f || this.f4752f.f4702a != this.f4751e.f4702a);
    }

    /* renamed from: c */
    public void mo6535c(float f) {
        if (this.f4750d != f) {
            this.f4750d = f;
            this.f4755i = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f4756j;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6513d() {
        /*
            r1 = this;
            boolean r0 = r1.f4762p
            if (r0 == 0) goto L_0x0010
            b2.j0 r0 = r1.f4756j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.mo6529k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b2.C1648k0.mo6513d():boolean");
    }

    /* renamed from: e */
    public ByteBuffer mo6514e() {
        int k;
        C1646j0 j0Var = this.f4756j;
        if (j0Var != null && (k = j0Var.mo6529k()) > 0) {
            if (this.f4757k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.f4757k = order;
                this.f4758l = order.asShortBuffer();
            } else {
                this.f4757k.clear();
                this.f4758l.clear();
            }
            j0Var.mo6528j(this.f4758l);
            this.f4761o += (long) k;
            this.f4757k.limit(k);
            this.f4759m = this.f4757k;
        }
        ByteBuffer byteBuffer = this.f4759m;
        this.f4759m = C1637g.f4700a;
        return byteBuffer;
    }

    /* renamed from: f */
    public void mo6456f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f4760n += (long) remaining;
            ((C1646j0) C5917a.m34872e(this.f4756j)).mo6532t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void flush() {
        if (mo6512b()) {
            C1637g.C1638a aVar = this.f4751e;
            this.f4753g = aVar;
            C1637g.C1638a aVar2 = this.f4752f;
            this.f4754h = aVar2;
            if (this.f4755i) {
                this.f4756j = new C1646j0(aVar.f4702a, aVar.f4703b, this.f4749c, this.f4750d, aVar2.f4702a);
            } else {
                C1646j0 j0Var = this.f4756j;
                if (j0Var != null) {
                    j0Var.mo6527i();
                }
            }
        }
        this.f4759m = C1637g.f4700a;
        this.f4760n = 0;
        this.f4761o = 0;
        this.f4762p = false;
    }

    /* renamed from: g */
    public C1637g.C1638a mo6516g(C1637g.C1638a aVar) throws C1637g.C1639b {
        if (aVar.f4704c == 2) {
            int i = this.f4748b;
            if (i == -1) {
                i = aVar.f4702a;
            }
            this.f4751e = aVar;
            C1637g.C1638a aVar2 = new C1637g.C1638a(i, aVar.f4703b, 2);
            this.f4752f = aVar2;
            this.f4755i = true;
            return aVar2;
        }
        throw new C1637g.C1639b(aVar);
    }

    /* renamed from: h */
    public void mo6517h() {
        C1646j0 j0Var = this.f4756j;
        if (j0Var != null) {
            j0Var.mo6531s();
        }
        this.f4762p = true;
    }

    /* renamed from: i */
    public void mo6536i(float f) {
        if (this.f4749c != f) {
            this.f4749c = f;
            this.f4755i = true;
        }
    }

    public void reset() {
        this.f4749c = 1.0f;
        this.f4750d = 1.0f;
        C1637g.C1638a aVar = C1637g.C1638a.f4701e;
        this.f4751e = aVar;
        this.f4752f = aVar;
        this.f4753g = aVar;
        this.f4754h = aVar;
        ByteBuffer byteBuffer = C1637g.f4700a;
        this.f4757k = byteBuffer;
        this.f4758l = byteBuffer.asShortBuffer();
        this.f4759m = byteBuffer;
        this.f4748b = -1;
        this.f4755i = false;
        this.f4756j = null;
        this.f4760n = 0;
        this.f4761o = 0;
        this.f4762p = false;
    }
}
