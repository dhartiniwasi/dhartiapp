package p264io.grpc.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p182a7.C6431n;
import p199c7.C6771b;
import p343rc.C12335j1;
import p343rc.C12346l;
import p343rc.C12357n;
import p343rc.C12371q0;
import p343rc.C12403w;

/* renamed from: io.grpc.internal.m1 */
/* compiled from: MessageFramer */
public class C11293m1 implements C11326p0 {

    /* renamed from: a */
    private final C11297d f43407a;

    /* renamed from: b */
    private int f43408b = -1;

    /* renamed from: c */
    private C11328p2 f43409c;

    /* renamed from: d */
    private C12357n f43410d = C12346l.C12348b.f45659a;

    /* renamed from: e */
    private boolean f43411e = true;

    /* renamed from: f */
    private final C11296c f43412f = new C11296c();

    /* renamed from: g */
    private final ByteBuffer f43413g = ByteBuffer.allocate(5);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C11332q2 f43414h;

    /* renamed from: i */
    private final C11255i2 f43415i;

    /* renamed from: j */
    private boolean f43416j;

    /* renamed from: k */
    private int f43417k;

    /* renamed from: l */
    private int f43418l = -1;

    /* renamed from: m */
    private long f43419m;

    /* renamed from: io.grpc.internal.m1$c */
    /* compiled from: MessageFramer */
    private class C11296c extends OutputStream {
        private C11296c() {
        }

        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public void write(byte[] bArr, int i, int i2) {
            C11293m1.this.m55641o(bArr, i, i2);
        }
    }

    /* renamed from: io.grpc.internal.m1$d */
    /* compiled from: MessageFramer */
    public interface C11297d {
        /* renamed from: o */
        void mo34904o(C11328p2 p2Var, boolean z, boolean z2, int i);
    }

    public C11293m1(C11297d dVar, C11332q2 q2Var, C11255i2 i2Var) {
        this.f43407a = (C11297d) C6431n.m37562o(dVar, "sink");
        this.f43414h = (C11332q2) C6431n.m37562o(q2Var, "bufferAllocator");
        this.f43415i = (C11255i2) C6431n.m37562o(i2Var, "statsTraceCtx");
    }

    /* renamed from: c */
    private void m55634c(boolean z, boolean z2) {
        C11328p2 p2Var = this.f43409c;
        this.f43409c = null;
        this.f43407a.mo34904o(p2Var, z, z2, this.f43417k);
        this.f43417k = 0;
    }

    /* renamed from: h */
    private int m55635h(InputStream inputStream) throws IOException {
        if ((inputStream instanceof C12371q0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    /* renamed from: i */
    private void m55636i() {
        C11328p2 p2Var = this.f43409c;
        if (p2Var != null) {
            p2Var.mo35289a();
            this.f43409c = null;
        }
    }

    /* renamed from: k */
    private void m55637k() {
        if (mo34915f()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* renamed from: l */
    private void m55638l(C11295b bVar, boolean z) {
        int a = bVar.m55651k();
        this.f43413g.clear();
        this.f43413g.put(z ? (byte) 1 : 0).putInt(a);
        C11328p2 a2 = this.f43414h.mo35297a(5);
        a2.mo35291s(this.f43413g.array(), 0, this.f43413g.position());
        if (a == 0) {
            this.f43409c = a2;
            return;
        }
        this.f43407a.mo34904o(a2, false, false, this.f43417k - 1);
        this.f43417k = 1;
        List b = bVar.f43420a;
        for (int i = 0; i < b.size() - 1; i++) {
            this.f43407a.mo34904o((C11328p2) b.get(i), false, false, 0);
        }
        this.f43409c = (C11328p2) b.get(b.size() - 1);
        this.f43419m = (long) a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    private int m55639m(InputStream inputStream, int i) throws IOException {
        C11295b bVar = new C11295b();
        OutputStream c = this.f43410d.mo37051c(bVar);
        try {
            int p = m55642p(inputStream, c);
            c.close();
            int i2 = this.f43408b;
            if (i2 < 0 || p <= i2) {
                m55638l(bVar, true);
                return p;
            }
            throw C12335j1.f45615o.mo37030q(String.format(Locale.US, "message too large %d > %d", new Object[]{Integer.valueOf(p), Integer.valueOf(this.f43408b)})).mo37021d();
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* renamed from: n */
    private int m55640n(InputStream inputStream, int i) throws IOException {
        int i2 = this.f43408b;
        if (i2 < 0 || i <= i2) {
            this.f43413g.clear();
            this.f43413g.put((byte) 0).putInt(i);
            if (this.f43409c == null) {
                this.f43409c = this.f43414h.mo35297a(this.f43413g.position() + i);
            }
            m55641o(this.f43413g.array(), 0, this.f43413g.position());
            return m55642p(inputStream, this.f43412f);
        }
        throw C12335j1.f45615o.mo37030q(String.format(Locale.US, "message too large %d > %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f43408b)})).mo37021d();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m55641o(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            C11328p2 p2Var = this.f43409c;
            if (p2Var != null && p2Var.mo35292t() == 0) {
                m55634c(false, false);
            }
            if (this.f43409c == null) {
                this.f43409c = this.f43414h.mo35297a(i2);
            }
            int min = Math.min(i2, this.f43409c.mo35292t());
            this.f43409c.mo35291s(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    /* renamed from: p */
    private static int m55642p(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof C12403w) {
            return ((C12403w) inputStream).mo37145a(outputStream);
        }
        long b = C6771b.m38712b(inputStream, outputStream);
        C6431n.m37556i(b <= 2147483647L, "Message size overflow: %s", b);
        return (int) b;
    }

    /* renamed from: q */
    private int m55643q(InputStream inputStream, int i) throws IOException {
        if (i != -1) {
            this.f43419m = (long) i;
            return m55640n(inputStream, i);
        }
        C11295b bVar = new C11295b();
        int p = m55642p(inputStream, bVar);
        int i2 = this.f43408b;
        if (i2 < 0 || p <= i2) {
            m55638l(bVar, false);
            return p;
        }
        throw C12335j1.f45615o.mo37030q(String.format(Locale.US, "message too large %d > %d", new Object[]{Integer.valueOf(p), Integer.valueOf(this.f43408b)})).mo37021d();
    }

    public void close() {
        if (!mo34915f()) {
            this.f43416j = true;
            C11328p2 p2Var = this.f43409c;
            if (p2Var != null && p2Var.mo35290k() == 0) {
                m55636i();
            }
            m55634c(true, true);
        }
    }

    /* renamed from: d */
    public void mo34913d(int i) {
        C6431n.m37568u(this.f43408b == -1, "max size already set");
        this.f43408b = i;
    }

    /* renamed from: f */
    public boolean mo34915f() {
        return this.f43416j;
    }

    public void flush() {
        C11328p2 p2Var = this.f43409c;
        if (p2Var != null && p2Var.mo35290k() > 0) {
            m55634c(false, true);
        }
    }

    /* renamed from: g */
    public void mo34917g(InputStream inputStream) {
        int i;
        m55637k();
        this.f43417k++;
        int i2 = this.f43418l + 1;
        this.f43418l = i2;
        this.f43419m = 0;
        this.f43415i.mo35200i(i2);
        boolean z = this.f43411e && this.f43410d != C12346l.C12348b.f45659a;
        try {
            int h = m55635h(inputStream);
            if (h == 0 || !z) {
                i = m55643q(inputStream, h);
            } else {
                i = m55639m(inputStream, h);
            }
            if (h == -1 || i == h) {
                long j = (long) i;
                this.f43415i.mo35202k(j);
                this.f43415i.mo35203l(this.f43419m);
                this.f43415i.mo35201j(this.f43418l, this.f43419m, j);
                return;
            }
            throw C12335j1.f45620t.mo37030q(String.format("Message length inaccurate %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(h)})).mo37021d();
        } catch (IOException e) {
            throw C12335j1.f45620t.mo37030q("Failed to frame message").mo37029p(e).mo37021d();
        } catch (RuntimeException e2) {
            throw C12335j1.f45620t.mo37030q("Failed to frame message").mo37029p(e2).mo37021d();
        }
    }

    /* renamed from: j */
    public C11293m1 mo34914e(C12357n nVar) {
        this.f43410d = (C12357n) C6431n.m37562o(nVar, "Can't pass an empty compressor");
        return this;
    }

    /* renamed from: io.grpc.internal.m1$b */
    /* compiled from: MessageFramer */
    private final class C11295b extends OutputStream {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C11328p2> f43420a;

        /* renamed from: b */
        private C11328p2 f43421b;

        private C11295b() {
            this.f43420a = new ArrayList();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public int m55651k() {
            int i = 0;
            for (C11328p2 k : this.f43420a) {
                i += k.mo35290k();
            }
            return i;
        }

        public void write(int i) throws IOException {
            C11328p2 p2Var = this.f43421b;
            if (p2Var == null || p2Var.mo35292t() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
                return;
            }
            this.f43421b.mo35293u((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.f43421b == null) {
                C11328p2 a = C11293m1.this.f43414h.mo35297a(i2);
                this.f43421b = a;
                this.f43420a.add(a);
            }
            while (i2 > 0) {
                int min = Math.min(i2, this.f43421b.mo35292t());
                if (min == 0) {
                    C11328p2 a2 = C11293m1.this.f43414h.mo35297a(Math.max(i2, this.f43421b.mo35290k() * 2));
                    this.f43421b = a2;
                    this.f43420a.add(a2);
                } else {
                    this.f43421b.mo35291s(bArr, i, min);
                    i += min;
                    i2 -= min;
                }
            }
        }
    }
}
