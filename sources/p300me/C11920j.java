package p300me;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p253he.C10543e;
import p300me.C11891d;
import p336qe.C12231c;
import p336qe.C12233d;

/* renamed from: me.j */
/* compiled from: Http2Writer */
final class C11920j implements Closeable {

    /* renamed from: g */
    private static final Logger f44793g = Logger.getLogger(C11894e.class.getName());

    /* renamed from: a */
    private final C12233d f44794a;

    /* renamed from: b */
    private final boolean f44795b;

    /* renamed from: c */
    private final C12231c f44796c;

    /* renamed from: d */
    private int f44797d = 16384;

    /* renamed from: e */
    private boolean f44798e;

    /* renamed from: f */
    final C11891d.C11893b f44799f;

    C11920j(C12233d dVar, boolean z) {
        this.f44794a = dVar;
        this.f44795b = z;
        C12231c cVar = new C12231c();
        this.f44796c = cVar;
        this.f44799f = new C11891d.C11893b(cVar);
    }

    /* renamed from: q */
    private void m57568q(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f44797d, j);
            long j2 = (long) min;
            j -= j2;
            mo36220f(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f44794a.mo35694k1(this.f44796c, j2);
        }
    }

    /* renamed from: t */
    private static void m57569t(C12233d dVar, int i) throws IOException {
        dVar.mo36787a0((i >>> 16) & 255);
        dVar.mo36787a0((i >>> 8) & 255);
        dVar.mo36787a0(i & 255);
    }

    /* renamed from: L0 */
    public synchronized void mo36214L0(boolean z, int i, C12231c cVar, int i2) throws IOException {
        if (!this.f44798e) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo36216b(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo36215a(C11925m mVar) throws IOException {
        if (!this.f44798e) {
            this.f44797d = mVar.mo36241f(this.f44797d);
            if (mVar.mo36238c() != -1) {
                this.f44799f.mo36148e(mVar.mo36238c());
            }
            mo36220f(0, 0, (byte) 4, (byte) 1);
            this.f44794a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36216b(int i, byte b, C12231c cVar, int i2) throws IOException {
        mo36220f(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f44794a.mo35694k1(cVar, (long) i2);
        }
    }

    /* renamed from: b0 */
    public synchronized void mo36217b0() throws IOException {
        if (this.f44798e) {
            throw new IOException("closed");
        } else if (this.f44795b) {
            Logger logger = f44793g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C10543e.m53055p(">> CONNECTION %s", C11894e.f44675a.mo36840q()));
            }
            this.f44794a.mo36792e1(C11894e.f44675a.mo36831A());
            this.f44794a.flush();
        }
    }

    /* renamed from: c */
    public synchronized void mo36218c(int i, long j) throws IOException {
        if (this.f44798e) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw C11894e.m57432c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            mo36220f(i, 4, (byte) 8, (byte) 0);
            this.f44794a.mo36775O((int) j);
            this.f44794a.flush();
        }
    }

    public synchronized void close() throws IOException {
        this.f44798e = true;
        this.f44794a.close();
    }

    /* renamed from: f */
    public void mo36220f(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f44793g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C11894e.m57431b(false, i, i2, b, b2));
        }
        int i3 = this.f44797d;
        if (i2 > i3) {
            throw C11894e.m57432c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m57569t(this.f44794a, i2);
            this.f44794a.mo36787a0(b & 255);
            this.f44794a.mo36787a0(b2 & 255);
            this.f44794a.mo36775O(i & Integer.MAX_VALUE);
        } else {
            throw C11894e.m57432c("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.f44798e) {
            this.f44794a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public synchronized void mo36222g(int i, C11889b bVar, byte[] bArr) throws IOException {
        if (this.f44798e) {
            throw new IOException("closed");
        } else if (bVar.f44645a != -1) {
            mo36220f(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f44794a.mo36775O(i);
            this.f44794a.mo36775O(bVar.f44645a);
            if (bArr.length > 0) {
                this.f44794a.mo36792e1(bArr);
            }
            this.f44794a.flush();
        } else {
            throw C11894e.m57432c("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: h */
    public synchronized void mo36223h(boolean z, int i, List<C11890c> list) throws IOException {
        if (!this.f44798e) {
            this.f44799f.mo36150g(list);
            long I = this.f44796c.mo36771I();
            int min = (int) Math.min((long) this.f44797d, I);
            long j = (long) min;
            int i2 = (I > j ? 1 : (I == j ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo36220f(i, min, (byte) 1, b);
            this.f44794a.mo35694k1(this.f44796c, j);
            if (i2 > 0) {
                m57568q(i, I - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    public synchronized void mo36224i(boolean z, int i, int i2) throws IOException {
        if (!this.f44798e) {
            mo36220f(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f44794a.mo36775O(i);
            this.f44794a.mo36775O(i2);
            this.f44794a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: m */
    public synchronized void mo36225m(int i, int i2, List<C11890c> list) throws IOException {
        if (!this.f44798e) {
            this.f44799f.mo36150g(list);
            long I = this.f44796c.mo36771I();
            int min = (int) Math.min((long) (this.f44797d - 4), I);
            long j = (long) min;
            int i3 = (I > j ? 1 : (I == j ? 0 : -1));
            mo36220f(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
            this.f44794a.mo36775O(i2 & Integer.MAX_VALUE);
            this.f44794a.mo35694k1(this.f44796c, j);
            if (i3 > 0) {
                m57568q(i, I - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: n */
    public synchronized void mo36226n(int i, C11889b bVar) throws IOException {
        if (this.f44798e) {
            throw new IOException("closed");
        } else if (bVar.f44645a != -1) {
            mo36220f(i, 4, (byte) 3, (byte) 0);
            this.f44794a.mo36775O(bVar.f44645a);
            this.f44794a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: p */
    public synchronized void mo36227p(C11925m mVar) throws IOException {
        if (!this.f44798e) {
            int i = 0;
            mo36220f(0, mVar.mo36245j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (mVar.mo36242g(i)) {
                    this.f44794a.mo36772J(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f44794a.mo36775O(mVar.mo36237b(i));
                }
                i++;
            }
            this.f44794a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: t1 */
    public int mo36228t1() {
        return this.f44797d;
    }
}
