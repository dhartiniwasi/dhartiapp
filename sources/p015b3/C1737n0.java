package p015b3;

import com.startapp.C8843b4;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p015b3.C1743p0;
import p021c2.C1842c;
import p021c2.C1848g;
import p037e2.C4200e0;
import p155v3.C5787a;
import p155v3.C5789b;
import p155v3.C5819i;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;

/* renamed from: b3.n0 */
/* compiled from: SampleDataQueue */
class C1737n0 {

    /* renamed from: a */
    private final C5789b f5146a;

    /* renamed from: b */
    private final int f5147b;

    /* renamed from: c */
    private final C5918a0 f5148c = new C5918a0(32);

    /* renamed from: d */
    private C1738a f5149d;

    /* renamed from: e */
    private C1738a f5150e;

    /* renamed from: f */
    private C1738a f5151f;

    /* renamed from: g */
    private long f5152g;

    /* renamed from: b3.n0$a */
    /* compiled from: SampleDataQueue */
    private static final class C1738a implements C5789b.C5790a {

        /* renamed from: a */
        public long f5153a;

        /* renamed from: b */
        public long f5154b;

        /* renamed from: c */
        public C5787a f5155c;

        /* renamed from: d */
        public C1738a f5156d;

        public C1738a(long j, int i) {
            mo6805d(j, i);
        }

        /* renamed from: a */
        public C5787a mo6802a() {
            return (C5787a) C5917a.m34872e(this.f5155c);
        }

        /* renamed from: b */
        public C1738a mo6803b() {
            this.f5155c = null;
            C1738a aVar = this.f5156d;
            this.f5156d = null;
            return aVar;
        }

        /* renamed from: c */
        public void mo6804c(C5787a aVar, C1738a aVar2) {
            this.f5155c = aVar;
            this.f5156d = aVar2;
        }

        /* renamed from: d */
        public void mo6805d(long j, int i) {
            C5917a.m34873f(this.f5155c == null);
            this.f5153a = j;
            this.f5154b = j + ((long) i);
        }

        /* renamed from: e */
        public int mo6806e(long j) {
            return ((int) (j - this.f5153a)) + this.f5155c.f28780b;
        }

        public C5789b.C5790a next() {
            C1738a aVar = this.f5156d;
            if (aVar == null || aVar.f5155c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C1737n0(C5789b bVar) {
        this.f5146a = bVar;
        int e = bVar.mo20313e();
        this.f5147b = e;
        C1738a aVar = new C1738a(0, e);
        this.f5149d = aVar;
        this.f5150e = aVar;
        this.f5151f = aVar;
    }

    /* renamed from: a */
    private void m8139a(C1738a aVar) {
        if (aVar.f5155c != null) {
            this.f5146a.mo20311c(aVar);
            aVar.mo6803b();
        }
    }

    /* renamed from: d */
    private static C1738a m8140d(C1738a aVar, long j) {
        while (j >= aVar.f5154b) {
            aVar = aVar.f5156d;
        }
        return aVar;
    }

    /* renamed from: g */
    private void m8141g(int i) {
        long j = this.f5152g + ((long) i);
        this.f5152g = j;
        C1738a aVar = this.f5151f;
        if (j == aVar.f5154b) {
            this.f5151f = aVar.f5156d;
        }
    }

    /* renamed from: h */
    private int m8142h(int i) {
        C1738a aVar = this.f5151f;
        if (aVar.f5155c == null) {
            aVar.mo6804c(this.f5146a.mo20309a(), new C1738a(this.f5151f.f5154b, this.f5147b));
        }
        return Math.min(i, (int) (this.f5151f.f5154b - this.f5152g));
    }

    /* renamed from: i */
    private static C1738a m8143i(C1738a aVar, long j, ByteBuffer byteBuffer, int i) {
        C1738a d = m8140d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.f5154b - j));
            byteBuffer.put(d.f5155c.f28779a, d.mo6806e(j), min);
            i -= min;
            j += (long) min;
            if (j == d.f5154b) {
                d = d.f5156d;
            }
        }
        return d;
    }

    /* renamed from: j */
    private static C1738a m8144j(C1738a aVar, long j, byte[] bArr, int i) {
        C1738a d = m8140d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.f5154b - j));
            System.arraycopy(d.f5155c.f28779a, d.mo6806e(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == d.f5154b) {
                d = d.f5156d;
            }
        }
        return d;
    }

    /* renamed from: k */
    private static C1738a m8145k(C1738a aVar, C1848g gVar, C1743p0.C1745b bVar, C5918a0 a0Var) {
        int i;
        C1743p0.C1745b bVar2 = bVar;
        C5918a0 a0Var2 = a0Var;
        long j = bVar2.f5198b;
        a0Var2.mo20542K(1);
        C1738a j2 = m8144j(aVar, j, a0Var.mo20551d(), 1);
        long j3 = j + 1;
        byte b = a0Var.mo20551d()[0];
        boolean z = (b & C8843b4.f36445d) != 0;
        byte b2 = b & Byte.MAX_VALUE;
        C1842c cVar = gVar.f5429b;
        byte[] bArr = cVar.f5405a;
        if (bArr == null) {
            cVar.f5405a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C1738a j4 = m8144j(j2, j3, cVar.f5405a, b2);
        long j5 = j3 + ((long) b2);
        if (z) {
            a0Var2.mo20542K(2);
            j4 = m8144j(j4, j5, a0Var.mo20551d(), 2);
            j5 += 2;
            i = a0Var.mo20540I();
        } else {
            i = 1;
        }
        int[] iArr = cVar.f5408d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f5409e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            a0Var2.mo20542K(i2);
            j4 = m8144j(j4, j5, a0Var.mo20551d(), i2);
            j5 += (long) i2;
            a0Var2.mo20546O(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = a0Var.mo20540I();
                iArr4[i3] = a0Var.mo20538G();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f5197a - ((int) (j5 - bVar2.f5198b));
        }
        C4200e0.C4201a aVar2 = (C4200e0.C4201a) C5953m0.m35138j(bVar2.f5199c);
        cVar.mo7040c(i, iArr2, iArr4, aVar2.f23501b, cVar.f5405a, aVar2.f23500a, aVar2.f23502c, aVar2.f23503d);
        long j6 = bVar2.f5198b;
        int i4 = (int) (j5 - j6);
        bVar2.f5198b = j6 + ((long) i4);
        bVar2.f5197a -= i4;
        return j4;
    }

    /* renamed from: l */
    private static C1738a m8146l(C1738a aVar, C1848g gVar, C1743p0.C1745b bVar, C5918a0 a0Var) {
        if (gVar.mo7052z()) {
            aVar = m8145k(aVar, gVar, bVar, a0Var);
        }
        if (gVar.mo7032q()) {
            a0Var.mo20542K(4);
            C1738a j = m8144j(aVar, bVar.f5198b, a0Var.mo20551d(), 4);
            int G = a0Var.mo20538G();
            bVar.f5198b += 4;
            bVar.f5197a -= 4;
            gVar.mo7050x(G);
            C1738a i = m8143i(j, bVar.f5198b, gVar.f5430c, G);
            bVar.f5198b += (long) G;
            int i2 = bVar.f5197a - G;
            bVar.f5197a = i2;
            gVar.mo7049B(i2);
            return m8143i(i, bVar.f5198b, gVar.f5433f, bVar.f5197a);
        }
        gVar.mo7050x(bVar.f5197a);
        return m8143i(aVar, bVar.f5198b, gVar.f5430c, bVar.f5197a);
    }

    /* renamed from: b */
    public void mo6793b(long j) {
        C1738a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f5149d;
                if (j < aVar.f5154b) {
                    break;
                }
                this.f5146a.mo20312d(aVar.f5155c);
                this.f5149d = this.f5149d.mo6803b();
            }
            if (this.f5150e.f5153a < aVar.f5153a) {
                this.f5150e = aVar;
            }
        }
    }

    /* renamed from: c */
    public void mo6794c(long j) {
        C5917a.m34868a(j <= this.f5152g);
        this.f5152g = j;
        if (j != 0) {
            C1738a aVar = this.f5149d;
            if (j != aVar.f5153a) {
                while (this.f5152g > aVar.f5154b) {
                    aVar = aVar.f5156d;
                }
                C1738a aVar2 = (C1738a) C5917a.m34872e(aVar.f5156d);
                m8139a(aVar2);
                C1738a aVar3 = new C1738a(aVar.f5154b, this.f5147b);
                aVar.f5156d = aVar3;
                if (this.f5152g == aVar.f5154b) {
                    aVar = aVar3;
                }
                this.f5151f = aVar;
                if (this.f5150e == aVar2) {
                    this.f5150e = aVar3;
                    return;
                }
                return;
            }
        }
        m8139a(this.f5149d);
        C1738a aVar4 = new C1738a(this.f5152g, this.f5147b);
        this.f5149d = aVar4;
        this.f5150e = aVar4;
        this.f5151f = aVar4;
    }

    /* renamed from: e */
    public long mo6795e() {
        return this.f5152g;
    }

    /* renamed from: f */
    public void mo6796f(C1848g gVar, C1743p0.C1745b bVar) {
        m8146l(this.f5150e, gVar, bVar, this.f5148c);
    }

    /* renamed from: m */
    public void mo6797m(C1848g gVar, C1743p0.C1745b bVar) {
        this.f5150e = m8146l(this.f5150e, gVar, bVar, this.f5148c);
    }

    /* renamed from: n */
    public void mo6798n() {
        m8139a(this.f5149d);
        this.f5149d.mo6805d(0, this.f5147b);
        C1738a aVar = this.f5149d;
        this.f5150e = aVar;
        this.f5151f = aVar;
        this.f5152g = 0;
        this.f5146a.mo20310b();
    }

    /* renamed from: o */
    public void mo6799o() {
        this.f5150e = this.f5149d;
    }

    /* renamed from: p */
    public int mo6800p(C5819i iVar, int i, boolean z) throws IOException {
        int h = m8142h(i);
        C1738a aVar = this.f5151f;
        int read = iVar.read(aVar.f5155c.f28779a, aVar.mo6806e(this.f5152g), h);
        if (read != -1) {
            m8141g(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: q */
    public void mo6801q(C5918a0 a0Var, int i) {
        while (i > 0) {
            int h = m8142h(i);
            C1738a aVar = this.f5151f;
            a0Var.mo20557j(aVar.f5155c.f28779a, aVar.mo6806e(this.f5152g), h);
            i -= h;
            m8141g(h);
        }
    }
}
