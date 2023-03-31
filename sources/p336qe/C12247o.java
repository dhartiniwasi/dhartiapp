package p336qe;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: qe.o */
/* compiled from: RealBufferedSource */
final class C12247o implements C12234e {

    /* renamed from: a */
    public final C12231c f45408a = new C12231c();

    /* renamed from: b */
    public final C12252t f45409b;

    /* renamed from: c */
    boolean f45410c;

    C12247o(C12252t tVar) {
        Objects.requireNonNull(tVar, "source == null");
        this.f45409b = tVar;
    }

    /* renamed from: B */
    public C12235f mo36762B(long j) throws IOException {
        mo36825y1(j);
        return this.f45408a.mo36762B(j);
    }

    /* renamed from: E1 */
    public long mo36765E1(byte b) throws IOException {
        return mo36871a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: G1 */
    public long mo36769G1() throws IOException {
        mo36825y1(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo36872b((long) i2)) {
                break;
            }
            byte m = this.f45408a.mo36806m((long) i);
            if ((m >= 48 && m <= 57) || ((m >= 97 && m <= 102) || (m >= 65 && m <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(m)}));
            }
        }
        return this.f45408a.mo36769G1();
    }

    /* renamed from: V */
    public byte[] mo36779V() throws IOException {
        this.f45408a.mo36789c0(this.f45409b);
        return this.f45408a.mo36779V();
    }

    /* renamed from: W */
    public C12231c mo36780W() {
        return this.f45408a;
    }

    /* renamed from: W0 */
    public String mo36781W0() throws IOException {
        return mo36805l0(Long.MAX_VALUE);
    }

    /* renamed from: X0 */
    public int mo36782X0() throws IOException {
        mo36825y1(4);
        return this.f45408a.mo36782X0();
    }

    /* renamed from: Z */
    public boolean mo36784Z() throws IOException {
        if (!this.f45410c) {
            return this.f45408a.mo36784Z() && this.f45409b.mo33810z(this.f45408a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Z0 */
    public byte[] mo36785Z0(long j) throws IOException {
        mo36825y1(j);
        return this.f45408a.mo36785Z0(j);
    }

    /* renamed from: a */
    public long mo36871a(byte b, long j, long j2) throws IOException {
        if (this.f45410c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long n = this.f45408a.mo36807n(b, j, j2);
                if (n == -1) {
                    C12231c cVar = this.f45408a;
                    long j3 = cVar.f45378b;
                    if (j3 >= j2 || this.f45409b.mo33810z(cVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return n;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public boolean mo36872b(long j) throws IOException {
        C12231c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f45410c) {
            do {
                cVar = this.f45408a;
                if (cVar.f45378b >= j) {
                    return true;
                }
            } while (this.f45409b.mo33810z(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void close() throws IOException {
        if (!this.f45410c) {
            this.f45410c = true;
            this.f45409b.close();
            this.f45408a.mo36786a();
        }
    }

    /* renamed from: i1 */
    public short mo36800i1() throws IOException {
        mo36825y1(2);
        return this.f45408a.mo36800i1();
    }

    public boolean isOpen() {
        return !this.f45410c;
    }

    /* renamed from: j */
    public C12231c mo36802j() {
        return this.f45408a;
    }

    /* renamed from: l0 */
    public String mo36805l0(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = mo36871a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f45408a.mo36770H(a);
            }
            if (j2 < Long.MAX_VALUE && mo36872b(j2) && this.f45408a.mo36806m(j2 - 1) == 13 && mo36872b(1 + j2) && this.f45408a.mo36806m(j2) == 10) {
                return this.f45408a.mo36770H(j2);
            }
            C12231c cVar = new C12231c();
            C12231c cVar2 = this.f45408a;
            cVar2.mo36796g(cVar, 0, Math.min(32, cVar2.mo36771I()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f45408a.mo36771I(), j) + " content=" + cVar.mo36823x().mo36840q() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: o */
    public C12253u mo33809o() {
        return this.f45409b.mo33809o();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C12231c cVar = this.f45408a;
        if (cVar.f45378b == 0 && this.f45409b.mo33810z(cVar, 8192) == -1) {
            return -1;
        }
        return this.f45408a.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        mo36825y1(1);
        return this.f45408a.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            mo36825y1((long) bArr.length);
            this.f45408a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C12231c cVar = this.f45408a;
                long j = cVar.f45378b;
                if (j > 0) {
                    int read = cVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() throws IOException {
        mo36825y1(4);
        return this.f45408a.readInt();
    }

    public short readShort() throws IOException {
        mo36825y1(2);
        return this.f45408a.readShort();
    }

    public void skip(long j) throws IOException {
        if (!this.f45410c) {
            while (j > 0) {
                C12231c cVar = this.f45408a;
                if (cVar.f45378b == 0 && this.f45409b.mo33810z(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f45408a.mo36771I());
                this.f45408a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f45409b + ")";
    }

    /* renamed from: y1 */
    public void mo36825y1(long j) throws IOException {
        if (!mo36872b(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: z */
    public long mo33810z(C12231c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f45410c) {
            C12231c cVar2 = this.f45408a;
            if (cVar2.f45378b == 0 && this.f45409b.mo33810z(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f45408a.mo33810z(cVar, Math.min(j, this.f45408a.f45378b));
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
