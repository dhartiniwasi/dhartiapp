package p300me;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p253he.C10543e;
import p300me.C11891d;
import p336qe.C12231c;
import p336qe.C12234e;
import p336qe.C12235f;
import p336qe.C12252t;
import p336qe.C12253u;

/* renamed from: me.h */
/* compiled from: Http2Reader */
final class C11913h implements Closeable {

    /* renamed from: e */
    static final Logger f44757e = Logger.getLogger(C11894e.class.getName());

    /* renamed from: a */
    private final C12234e f44758a;

    /* renamed from: b */
    private final C11914a f44759b;

    /* renamed from: c */
    private final boolean f44760c;

    /* renamed from: d */
    final C11891d.C11892a f44761d;

    /* renamed from: me.h$a */
    /* compiled from: Http2Reader */
    static final class C11914a implements C12252t {

        /* renamed from: a */
        private final C12234e f44762a;

        /* renamed from: b */
        int f44763b;

        /* renamed from: c */
        byte f44764c;

        /* renamed from: d */
        int f44765d;

        /* renamed from: e */
        int f44766e;

        /* renamed from: f */
        short f44767f;

        C11914a(C12234e eVar) {
            this.f44762a = eVar;
        }

        /* renamed from: a */
        private void m57526a() throws IOException {
            int i = this.f44765d;
            int p = C11913h.m57519p(this.f44762a);
            this.f44766e = p;
            this.f44763b = p;
            byte readByte = (byte) (this.f44762a.readByte() & 255);
            this.f44764c = (byte) (this.f44762a.readByte() & 255);
            Logger logger = C11913h.f44757e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C11894e.m57431b(true, this.f44765d, this.f44763b, readByte, this.f44764c));
            }
            int readInt = this.f44762a.readInt() & Integer.MAX_VALUE;
            this.f44765d = readInt;
            if (readByte != 9) {
                throw C11894e.m57433d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C11894e.m57433d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return this.f44762a.mo33809o();
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            while (true) {
                int i = this.f44766e;
                if (i == 0) {
                    this.f44762a.skip((long) this.f44767f);
                    this.f44767f = 0;
                    if ((this.f44764c & 4) != 0) {
                        return -1;
                    }
                    m57526a();
                } else {
                    long z = this.f44762a.mo33810z(cVar, Math.min(j, (long) i));
                    if (z == -1) {
                        return -1;
                    }
                    this.f44766e = (int) (((long) this.f44766e) - z);
                    return z;
                }
            }
        }
    }

    /* renamed from: me.h$b */
    /* compiled from: Http2Reader */
    interface C11915b {
        /* renamed from: c */
        void mo36181c(int i, long j);

        /* renamed from: i */
        void mo36182i(boolean z, int i, int i2);

        /* renamed from: j */
        void mo36183j();

        /* renamed from: k */
        void mo36184k(boolean z, int i, C12234e eVar, int i2) throws IOException;

        /* renamed from: l */
        void mo36185l(int i, int i2, int i3, boolean z);

        /* renamed from: m */
        void mo36186m(int i, int i2, List<C11890c> list) throws IOException;

        /* renamed from: n */
        void mo36187n(int i, C11889b bVar, C12235f fVar);

        /* renamed from: o */
        void mo36188o(boolean z, int i, int i2, List<C11890c> list);

        /* renamed from: p */
        void mo36189p(int i, C11889b bVar);

        /* renamed from: q */
        void mo36190q(boolean z, C11925m mVar);
    }

    C11913h(C12234e eVar, boolean z) {
        this.f44758a = eVar;
        this.f44760c = z;
        C11914a aVar = new C11914a(eVar);
        this.f44759b = aVar;
        this.f44761d = new C11891d.C11892a(4096, aVar);
    }

    /* renamed from: D */
    private void m57511D(C11915b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw C11894e.m57433d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int readInt = this.f44758a.readInt();
            C11889b a = C11889b.m57402a(readInt);
            if (a != null) {
                bVar.mo36189p(i2, a);
            } else {
                throw C11894e.m57433d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
        } else {
            throw C11894e.m57433d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    /* renamed from: F */
    private void m57512F(C11915b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw C11894e.m57433d("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo36183j();
                return;
            }
            throw C11894e.m57433d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i % 6 == 0) {
            C11925m mVar = new C11925m();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f44758a.readShort() & 65535;
                int readInt = this.f44758a.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw C11894e.m57433d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw C11894e.m57433d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw C11894e.m57433d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                mVar.mo36244i(readShort, readInt);
            }
            bVar.mo36190q(false, mVar);
        } else {
            throw C11894e.m57433d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: G */
    private void m57513G(C11915b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f44758a.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo36181c(i2, readInt);
            } else {
                throw C11894e.m57433d("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw C11894e.m57433d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    static int m57514a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C11894e.m57433d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m57515g(C11915b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f44758a.readByte() & 255);
                }
                bVar.mo36184k(z2, i2, this.f44758a, m57514a(i, b, s));
                this.f44758a.skip((long) s);
                return;
            }
            throw C11894e.m57433d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw C11894e.m57433d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* renamed from: h */
    private void m57516h(C11915b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw C11894e.m57433d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f44758a.readInt();
            int readInt2 = this.f44758a.readInt();
            int i3 = i - 8;
            C11889b a = C11889b.m57402a(readInt2);
            if (a != null) {
                C12235f fVar = C12235f.f45381e;
                if (i3 > 0) {
                    fVar = this.f44758a.mo36762B((long) i3);
                }
                bVar.mo36187n(readInt, a, fVar);
                return;
            }
            throw C11894e.m57433d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw C11894e.m57433d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    /* renamed from: m */
    private List<C11890c> m57517m(int i, short s, byte b, int i2) throws IOException {
        C11914a aVar = this.f44759b;
        aVar.f44766e = i;
        aVar.f44763b = i;
        aVar.f44767f = s;
        aVar.f44764c = b;
        aVar.f44765d = i2;
        this.f44761d.mo36146k();
        return this.f44761d.mo36144e();
    }

    /* renamed from: n */
    private void m57518n(C11915b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f44758a.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m57521t(bVar, i2);
                i -= 5;
            }
            bVar.mo36188o(z, i2, -1, m57517m(m57514a(i, b, s), s, b, i2));
            return;
        }
        throw C11894e.m57433d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: p */
    static int m57519p(C12234e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: q */
    private void m57520q(C11915b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            throw C11894e.m57433d("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f44758a.readInt();
            int readInt2 = this.f44758a.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo36182i(z, readInt, readInt2);
        } else {
            throw C11894e.m57433d("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    /* renamed from: t */
    private void m57521t(C11915b bVar, int i) throws IOException {
        int readInt = this.f44758a.readInt();
        bVar.mo36185l(i, readInt & Integer.MAX_VALUE, (this.f44758a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: w */
    private void m57522w(C11915b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw C11894e.m57433d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            m57521t(bVar, i2);
        } else {
            throw C11894e.m57433d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    /* renamed from: x */
    private void m57523x(C11915b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f44758a.readByte() & 255);
            }
            bVar.mo36186m(i2, this.f44758a.readInt() & Integer.MAX_VALUE, m57517m(m57514a(i - 4, b, s), s, b, i2));
            return;
        }
        throw C11894e.m57433d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: b */
    public boolean mo36191b(boolean z, C11915b bVar) throws IOException {
        try {
            this.f44758a.mo36825y1(9);
            int p = m57519p(this.f44758a);
            if (p < 0 || p > 16384) {
                throw C11894e.m57433d("FRAME_SIZE_ERROR: %s", Integer.valueOf(p));
            }
            byte readByte = (byte) (this.f44758a.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f44758a.readByte() & 255);
                int readInt = this.f44758a.readInt() & Integer.MAX_VALUE;
                Logger logger = f44757e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C11894e.m57431b(true, readInt, p, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m57515g(bVar, p, readByte2, readInt);
                        break;
                    case 1:
                        m57518n(bVar, p, readByte2, readInt);
                        break;
                    case 2:
                        m57522w(bVar, p, readByte2, readInt);
                        break;
                    case 3:
                        m57511D(bVar, p, readByte2, readInt);
                        break;
                    case 4:
                        m57512F(bVar, p, readByte2, readInt);
                        break;
                    case 5:
                        m57523x(bVar, p, readByte2, readInt);
                        break;
                    case 6:
                        m57520q(bVar, p, readByte2, readInt);
                        break;
                    case 7:
                        m57516h(bVar, p, readByte2, readInt);
                        break;
                    case 8:
                        m57513G(bVar, p, readByte2, readInt);
                        break;
                    default:
                        this.f44758a.skip((long) p);
                        break;
                }
                return true;
            }
            throw C11894e.m57433d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() throws IOException {
        this.f44758a.close();
    }

    /* renamed from: f */
    public void mo36193f(C11915b bVar) throws IOException {
        if (!this.f44760c) {
            C12234e eVar = this.f44758a;
            C12235f fVar = C11894e.f44675a;
            C12235f B = eVar.mo36762B((long) fVar.mo36846w());
            Logger logger = f44757e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C10543e.m53055p("<< CONNECTION %s", B.mo36840q()));
            }
            if (!fVar.equals(B)) {
                throw C11894e.m57433d("Expected a connection header but was %s", B.mo36832B());
            }
        } else if (!mo36191b(true, bVar)) {
            throw C11894e.m57433d("Required SETTINGS preface not received", new Object[0]);
        }
    }
}
