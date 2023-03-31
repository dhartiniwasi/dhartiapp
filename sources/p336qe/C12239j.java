package p336qe;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: qe.j */
/* compiled from: GzipSource */
public final class C12239j implements C12252t {

    /* renamed from: a */
    private int f45388a = 0;

    /* renamed from: b */
    private final C12234e f45389b;

    /* renamed from: c */
    private final Inflater f45390c;

    /* renamed from: d */
    private final C12240k f45391d;

    /* renamed from: e */
    private final CRC32 f45392e = new CRC32();

    public C12239j(C12252t tVar) {
        if (tVar != null) {
            Inflater inflater = new Inflater(true);
            this.f45390c = inflater;
            C12234e b = C12241l.m58807b(tVar);
            this.f45389b = b;
            this.f45391d = new C12240k(b, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m58796a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: b */
    private void m58797b() throws IOException {
        this.f45389b.mo36825y1(10);
        byte m = this.f45389b.mo36802j().mo36806m(3);
        boolean z = ((m >> 1) & 1) == 1;
        if (z) {
            m58799g(this.f45389b.mo36802j(), 0, 10);
        }
        m58796a("ID1ID2", 8075, this.f45389b.readShort());
        this.f45389b.skip(8);
        if (((m >> 2) & 1) == 1) {
            this.f45389b.mo36825y1(2);
            if (z) {
                m58799g(this.f45389b.mo36802j(), 0, 2);
            }
            long i1 = (long) this.f45389b.mo36802j().mo36800i1();
            this.f45389b.mo36825y1(i1);
            if (z) {
                m58799g(this.f45389b.mo36802j(), 0, i1);
            }
            this.f45389b.skip(i1);
        }
        if (((m >> 3) & 1) == 1) {
            long E1 = this.f45389b.mo36765E1((byte) 0);
            if (E1 != -1) {
                if (z) {
                    m58799g(this.f45389b.mo36802j(), 0, E1 + 1);
                }
                this.f45389b.skip(E1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m >> 4) & 1) == 1) {
            long E12 = this.f45389b.mo36765E1((byte) 0);
            if (E12 != -1) {
                if (z) {
                    m58799g(this.f45389b.mo36802j(), 0, E12 + 1);
                }
                this.f45389b.skip(E12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m58796a("FHCRC", this.f45389b.mo36800i1(), (short) ((int) this.f45392e.getValue()));
            this.f45392e.reset();
        }
    }

    /* renamed from: f */
    private void m58798f() throws IOException {
        m58796a("CRC", this.f45389b.mo36782X0(), (int) this.f45392e.getValue());
        m58796a("ISIZE", this.f45389b.mo36782X0(), (int) this.f45390c.getBytesWritten());
    }

    /* renamed from: g */
    private void m58799g(C12231c cVar, long j, long j2) {
        C12248p pVar = cVar.f45377a;
        while (true) {
            int i = pVar.f45413c;
            int i2 = pVar.f45412b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            pVar = pVar.f45416f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) pVar.f45412b) + j);
            int min = (int) Math.min((long) (pVar.f45413c - i3), j2);
            this.f45392e.update(pVar.f45411a, i3, min);
            j2 -= (long) min;
            pVar = pVar.f45416f;
            j = 0;
        }
    }

    public void close() throws IOException {
        this.f45391d.close();
    }

    /* renamed from: o */
    public C12253u mo33809o() {
        return this.f45389b.mo33809o();
    }

    /* renamed from: z */
    public long mo33810z(C12231c cVar, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f45388a == 0) {
                m58797b();
                this.f45388a = 1;
            }
            if (this.f45388a == 1) {
                long j2 = cVar.f45378b;
                long z = this.f45391d.mo33810z(cVar, j);
                if (z != -1) {
                    m58799g(cVar, j2, z);
                    return z;
                }
                this.f45388a = 2;
            }
            if (this.f45388a == 2) {
                m58798f();
                this.f45388a = 3;
                if (!this.f45389b.mo36784Z()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
