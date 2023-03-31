package p264io.grpc.internal;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import p182a7.C6431n;
import p264io.grpc.internal.C11274k2;
import p343rc.C12335j1;
import p343rc.C12346l;
import p343rc.C12398u;

/* renamed from: io.grpc.internal.l1 */
/* compiled from: MessageDeframer */
public class C11281l1 implements Closeable, C11391y {

    /* renamed from: A */
    private volatile boolean f43370A = false;

    /* renamed from: a */
    private C11283b f43371a;

    /* renamed from: b */
    private int f43372b;

    /* renamed from: c */
    private final C11255i2 f43373c;

    /* renamed from: d */
    private final C11310o2 f43374d;

    /* renamed from: e */
    private C12398u f43375e;

    /* renamed from: f */
    private C11353s0 f43376f;

    /* renamed from: g */
    private byte[] f43377g;

    /* renamed from: h */
    private int f43378h;

    /* renamed from: i */
    private C11286e f43379i = C11286e.HEADER;

    /* renamed from: r */
    private int f43380r = 5;

    /* renamed from: s */
    private boolean f43381s;

    /* renamed from: t */
    private C11362u f43382t;

    /* renamed from: u */
    private C11362u f43383u = new C11362u();

    /* renamed from: v */
    private long f43384v;

    /* renamed from: w */
    private boolean f43385w = false;

    /* renamed from: x */
    private int f43386x = -1;

    /* renamed from: y */
    private int f43387y;

    /* renamed from: z */
    private boolean f43388z = false;

    /* renamed from: io.grpc.internal.l1$a */
    /* compiled from: MessageDeframer */
    static /* synthetic */ class C11282a {

        /* renamed from: a */
        static final /* synthetic */ int[] f43389a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.grpc.internal.l1$e[] r0 = p264io.grpc.internal.C11281l1.C11286e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43389a = r0
                io.grpc.internal.l1$e r1 = p264io.grpc.internal.C11281l1.C11286e.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43389a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.l1$e r1 = p264io.grpc.internal.C11281l1.C11286e.BODY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11281l1.C11282a.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.l1$b */
    /* compiled from: MessageDeframer */
    public interface C11283b {
        /* renamed from: a */
        void mo35014a(C11274k2.C11275a aVar);

        /* renamed from: c */
        void mo34929c(boolean z);

        /* renamed from: d */
        void mo35069d(int i);

        /* renamed from: e */
        void mo35070e(Throwable th);
    }

    /* renamed from: io.grpc.internal.l1$c */
    /* compiled from: MessageDeframer */
    private static class C11284c implements C11274k2.C11275a {

        /* renamed from: a */
        private InputStream f43390a;

        /* synthetic */ C11284c(InputStream inputStream, C11282a aVar) {
            this(inputStream);
        }

        public InputStream next() {
            InputStream inputStream = this.f43390a;
            this.f43390a = null;
            return inputStream;
        }

        private C11284c(InputStream inputStream) {
            this.f43390a = inputStream;
        }
    }

    /* renamed from: io.grpc.internal.l1$e */
    /* compiled from: MessageDeframer */
    private enum C11286e {
        HEADER,
        BODY
    }

    public C11281l1(C11283b bVar, C12398u uVar, int i, C11255i2 i2Var, C11310o2 o2Var) {
        this.f43371a = (C11283b) C6431n.m37562o(bVar, "sink");
        this.f43375e = (C12398u) C6431n.m37562o(uVar, "decompressor");
        this.f43372b = i;
        this.f43373c = (C11255i2) C6431n.m37562o(i2Var, "statsTraceCtx");
        this.f43374d = (C11310o2) C6431n.m37562o(o2Var, "transportTracer");
    }

    /* renamed from: D */
    private void m55595D() {
        int readUnsignedByte = this.f43382t.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            this.f43381s = (readUnsignedByte & 1) != 0;
            int readInt = this.f43382t.readInt();
            this.f43380r = readInt;
            if (readInt < 0 || readInt > this.f43372b) {
                throw C12335j1.f45615o.mo37030q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", new Object[]{Integer.valueOf(this.f43372b), Integer.valueOf(this.f43380r)})).mo37021d();
            }
            int i = this.f43386x + 1;
            this.f43386x = i;
            this.f43373c.mo35196d(i);
            this.f43374d.mo35279d();
            this.f43379i = C11286e.BODY;
            return;
        }
        throw C12335j1.f45620t.mo37030q("gRPC frame header malformed: reserved bits not zero").mo37021d();
    }

    /* renamed from: F */
    private boolean m55596F() {
        int i;
        int i2 = 0;
        try {
            if (this.f43382t == null) {
                this.f43382t = new C11362u();
            }
            int i3 = 0;
            i = 0;
            while (true) {
                try {
                    int k = this.f43380r - this.f43382t.mo35271k();
                    if (k <= 0) {
                        if (i3 > 0) {
                            this.f43371a.mo35069d(i3);
                            if (this.f43379i == C11286e.BODY) {
                                if (this.f43376f != null) {
                                    this.f43373c.mo35199g((long) i);
                                    this.f43387y += i;
                                } else {
                                    this.f43373c.mo35199g((long) i3);
                                    this.f43387y += i3;
                                }
                            }
                        }
                        return true;
                    } else if (this.f43376f != null) {
                        byte[] bArr = this.f43377g;
                        if (bArr == null || this.f43378h == bArr.length) {
                            this.f43377g = new byte[Math.min(k, 2097152)];
                            this.f43378h = 0;
                        }
                        int F = this.f43376f.mo35319F(this.f43377g, this.f43378h, Math.min(k, this.f43377g.length - this.f43378h));
                        i3 += this.f43376f.mo35323t();
                        i += this.f43376f.mo35324w();
                        if (F == 0) {
                            if (i3 > 0) {
                                this.f43371a.mo35069d(i3);
                                if (this.f43379i == C11286e.BODY) {
                                    if (this.f43376f != null) {
                                        this.f43373c.mo35199g((long) i);
                                        this.f43387y += i;
                                    } else {
                                        this.f43373c.mo35199g((long) i3);
                                        this.f43387y += i3;
                                    }
                                }
                            }
                            return false;
                        }
                        this.f43382t.mo35350b(C11384w1.m55973f(this.f43377g, this.f43378h, F));
                        this.f43378h += F;
                    } else if (this.f43383u.mo35271k() == 0) {
                        if (i3 > 0) {
                            this.f43371a.mo35069d(i3);
                            if (this.f43379i == C11286e.BODY) {
                                if (this.f43376f != null) {
                                    this.f43373c.mo35199g((long) i);
                                    this.f43387y += i;
                                } else {
                                    this.f43373c.mo35199g((long) i3);
                                    this.f43387y += i3;
                                }
                            }
                        }
                        return false;
                    } else {
                        int min = Math.min(k, this.f43383u.mo35271k());
                        i3 += min;
                        this.f43382t.mo35350b(this.f43383u.mo35270P(min));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (DataFormatException e2) {
                    throw new RuntimeException(e2);
                } catch (Throwable th) {
                    int i4 = i3;
                    th = th;
                    i2 = i4;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            if (i2 > 0) {
                this.f43371a.mo35069d(i2);
                if (this.f43379i == C11286e.BODY) {
                    if (this.f43376f != null) {
                        this.f43373c.mo35199g((long) i);
                        this.f43387y += i;
                    } else {
                        this.f43373c.mo35199g((long) i2);
                        this.f43387y += i2;
                    }
                }
            }
            throw th;
        }
    }

    /* renamed from: m */
    private void m55597m() {
        if (!this.f43385w) {
            this.f43385w = true;
            while (!this.f43370A && this.f43384v > 0 && m55596F()) {
                try {
                    int i = C11282a.f43389a[this.f43379i.ordinal()];
                    if (i == 1) {
                        m55595D();
                    } else if (i == 2) {
                        m55602x();
                        this.f43384v--;
                    } else {
                        throw new AssertionError("Invalid state: " + this.f43379i);
                    }
                } finally {
                    this.f43385w = false;
                }
            }
            if (this.f43370A) {
                close();
                return;
            }
            if (this.f43388z && m55601w()) {
                close();
            }
            this.f43385w = false;
        }
    }

    /* renamed from: n */
    private InputStream m55598n() {
        C12398u uVar = this.f43375e;
        if (uVar != C12346l.C12348b.f45659a) {
            try {
                return new C11285d(uVar.mo37050b(C11384w1.m55970c(this.f43382t, true)), this.f43372b, this.f43373c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw C12335j1.f45620t.mo37030q("Can't decode compressed gRPC message as compression not configured").mo37021d();
        }
    }

    /* renamed from: p */
    private InputStream m55599p() {
        this.f43373c.mo35198f((long) this.f43382t.mo35271k());
        return C11384w1.m55970c(this.f43382t, true);
    }

    /* renamed from: t */
    private boolean m55600t() {
        return mo35240q() || this.f43388z;
    }

    /* renamed from: w */
    private boolean m55601w() {
        C11353s0 s0Var = this.f43376f;
        if (s0Var != null) {
            return s0Var.mo35320H();
        }
        return this.f43383u.mo35271k() == 0;
    }

    /* renamed from: x */
    private void m55602x() {
        this.f43373c.mo35197e(this.f43386x, (long) this.f43387y, -1);
        this.f43387y = 0;
        InputStream n = this.f43381s ? m55598n() : m55599p();
        this.f43382t = null;
        this.f43371a.mo35014a(new C11284c(n, (C11282a) null));
        this.f43379i = C11286e.HEADER;
        this.f43380r = 5;
    }

    /* renamed from: G */
    public void mo35237G(C11353s0 s0Var) {
        boolean z = true;
        C6431n.m37568u(this.f43375e == C12346l.C12348b.f45659a, "per-message decompressor already set");
        if (this.f43376f != null) {
            z = false;
        }
        C6431n.m37568u(z, "full stream decompressor already set");
        this.f43376f = (C11353s0) C6431n.m37562o(s0Var, "Can't pass a null full stream decompressor");
        this.f43383u = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo35238H(C11283b bVar) {
        this.f43371a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo35239I() {
        this.f43370A = true;
    }

    /* renamed from: a */
    public void mo35050a(int i) {
        C6431n.m37552e(i > 0, "numMessages must be > 0");
        if (!mo35240q()) {
            this.f43384v += (long) i;
            m55597m();
        }
    }

    /* renamed from: b */
    public void mo35051b(int i) {
        this.f43372b = i;
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        if (!mo35240q()) {
            C11362u uVar = this.f43382t;
            boolean z = true;
            boolean z2 = uVar != null && uVar.mo35271k() > 0;
            try {
                C11353s0 s0Var = this.f43376f;
                if (s0Var != null) {
                    if (!z2) {
                        if (!s0Var.mo35325x()) {
                            z = false;
                        }
                    }
                    this.f43376f.close();
                    z2 = z;
                }
                C11362u uVar2 = this.f43383u;
                if (uVar2 != null) {
                    uVar2.close();
                }
                C11362u uVar3 = this.f43382t;
                if (uVar3 != null) {
                    uVar3.close();
                }
                this.f43376f = null;
                this.f43383u = null;
                this.f43382t = null;
                this.f43371a.mo34929c(z2);
            } catch (Throwable th) {
                this.f43376f = null;
                this.f43383u = null;
                this.f43382t = null;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void mo35053f(C12398u uVar) {
        C6431n.m37568u(this.f43376f == null, "Already set full stream decompressor");
        this.f43375e = (C12398u) C6431n.m37562o(uVar, "Can't pass an empty decompressor");
    }

    /* renamed from: g */
    public void mo35054g() {
        if (!mo35240q()) {
            if (m55601w()) {
                close();
            } else {
                this.f43388z = true;
            }
        }
    }

    /* renamed from: h */
    public void mo35055h(C11380v1 v1Var) {
        C6431n.m37562o(v1Var, JsonStorageKeyNames.DATA_KEY);
        boolean z = true;
        try {
            if (!m55600t()) {
                C11353s0 s0Var = this.f43376f;
                if (s0Var != null) {
                    s0Var.mo35322p(v1Var);
                } else {
                    this.f43383u.mo35350b(v1Var);
                }
                z = false;
                m55597m();
            }
        } finally {
            if (z) {
                v1Var.close();
            }
        }
    }

    /* renamed from: q */
    public boolean mo35240q() {
        return this.f43383u == null && this.f43376f == null;
    }

    /* renamed from: io.grpc.internal.l1$d */
    /* compiled from: MessageDeframer */
    static final class C11285d extends FilterInputStream {

        /* renamed from: a */
        private final int f43391a;

        /* renamed from: b */
        private final C11255i2 f43392b;

        /* renamed from: c */
        private long f43393c;

        /* renamed from: d */
        private long f43394d;

        /* renamed from: e */
        private long f43395e = -1;

        C11285d(InputStream inputStream, int i, C11255i2 i2Var) {
            super(inputStream);
            this.f43391a = i;
            this.f43392b = i2Var;
        }

        /* renamed from: a */
        private void m55616a() {
            long j = this.f43394d;
            long j2 = this.f43393c;
            if (j > j2) {
                this.f43392b.mo35198f(j - j2);
                this.f43393c = this.f43394d;
            }
        }

        /* renamed from: b */
        private void m55617b() {
            if (this.f43394d > ((long) this.f43391a)) {
                C12335j1 j1Var = C12335j1.f45615o;
                throw j1Var.mo37030q("Decompressed gRPC message exceeds maximum size " + this.f43391a).mo37021d();
            }
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f43395e = this.f43394d;
        }

        public int read() throws IOException {
            int read = this.in.read();
            if (read != -1) {
                this.f43394d++;
            }
            m55617b();
            m55616a();
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f43395e != -1) {
                this.in.reset();
                this.f43394d = this.f43395e;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(j);
            this.f43394d += skip;
            m55617b();
            m55616a();
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.in.read(bArr, i, i2);
            if (read != -1) {
                this.f43394d += (long) read;
            }
            m55617b();
            m55616a();
            return read;
        }
    }
}
