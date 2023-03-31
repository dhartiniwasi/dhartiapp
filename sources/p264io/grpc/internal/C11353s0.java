package p264io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import p182a7.C6431n;

/* renamed from: io.grpc.internal.s0 */
/* compiled from: GzipInflatingBuffer */
class C11353s0 implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11362u f43580a = new C11362u();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final CRC32 f43581b = new CRC32();

    /* renamed from: c */
    private final C11355b f43582c = new C11355b(this, (C11354a) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final byte[] f43583d = new byte[512];
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f43584e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f43585f;

    /* renamed from: g */
    private Inflater f43586g;

    /* renamed from: h */
    private C11356c f43587h = C11356c.HEADER;

    /* renamed from: i */
    private boolean f43588i = false;

    /* renamed from: r */
    private int f43589r;

    /* renamed from: s */
    private int f43590s;

    /* renamed from: t */
    private long f43591t;

    /* renamed from: u */
    private int f43592u = 0;

    /* renamed from: v */
    private int f43593v = 0;

    /* renamed from: w */
    private boolean f43594w = true;

    /* renamed from: io.grpc.internal.s0$a */
    /* compiled from: GzipInflatingBuffer */
    static /* synthetic */ class C11354a {

        /* renamed from: a */
        static final /* synthetic */ int[] f43595a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.grpc.internal.s0$c[] r0 = p264io.grpc.internal.C11353s0.C11356c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43595a = r0
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.HEADER_EXTRA_LEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.HEADER_EXTRA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.HEADER_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.HEADER_COMMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.HEADER_CRC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.INITIALIZE_INFLATER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.INFLATING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.INFLATER_NEEDS_INPUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f43595a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.grpc.internal.s0$c r1 = p264io.grpc.internal.C11353s0.C11356c.TRAILER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11353s0.C11354a.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.s0$b */
    /* compiled from: GzipInflatingBuffer */
    private class C11355b {
        private C11355b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public boolean m55878g() {
            while (m55882k() > 0) {
                if (m55879h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public int m55879h() {
            int i;
            if (C11353s0.this.f43585f - C11353s0.this.f43584e > 0) {
                i = C11353s0.this.f43583d[C11353s0.this.f43584e] & 255;
                C11353s0.m55860f(C11353s0.this, 1);
            } else {
                i = C11353s0.this.f43580a.readUnsignedByte();
            }
            C11353s0.this.f43581b.update(i);
            C11353s0.m55864n(C11353s0.this, 1);
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public long m55880i() {
            return ((long) m55881j()) | (((long) m55881j()) << 16);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public int m55881j() {
            return m55879h() | (m55879h() << 8);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public int m55882k() {
            return (C11353s0.this.f43585f - C11353s0.this.f43584e) + C11353s0.this.f43580a.mo35271k();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public void m55883l(int i) {
            int i2;
            int a = C11353s0.this.f43585f - C11353s0.this.f43584e;
            if (a > 0) {
                int min = Math.min(a, i);
                C11353s0.this.f43581b.update(C11353s0.this.f43583d, C11353s0.this.f43584e, min);
                C11353s0.m55860f(C11353s0.this, min);
                i2 = i - min;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[512];
                int i3 = 0;
                while (i3 < i2) {
                    int min2 = Math.min(i2 - i3, 512);
                    C11353s0.this.f43580a.mo35269A0(bArr, 0, min2);
                    C11353s0.this.f43581b.update(bArr, 0, min2);
                    i3 += min2;
                }
            }
            C11353s0.m55864n(C11353s0.this, i);
        }

        /* synthetic */ C11355b(C11353s0 s0Var, C11354a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.s0$c */
    /* compiled from: GzipInflatingBuffer */
    private enum C11356c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    C11353s0() {
    }

    /* renamed from: D */
    private int m55849D(byte[] bArr, int i, int i2) throws DataFormatException, ZipException {
        C6431n.m37568u(this.f43586g != null, "inflater is null");
        try {
            int totalIn = this.f43586g.getTotalIn();
            int inflate = this.f43586g.inflate(bArr, i, i2);
            int totalIn2 = this.f43586g.getTotalIn() - totalIn;
            this.f43592u += totalIn2;
            this.f43593v += totalIn2;
            this.f43584e += totalIn2;
            this.f43581b.update(bArr, i, inflate);
            if (this.f43586g.finished()) {
                this.f43591t = this.f43586g.getBytesWritten() & 4294967295L;
                this.f43587h = C11356c.TRAILER;
            } else if (this.f43586g.needsInput()) {
                this.f43587h = C11356c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e) {
            throw new DataFormatException("Inflater data format exception: " + e.getMessage());
        }
    }

    /* renamed from: G */
    private boolean m55850G() {
        Inflater inflater = this.f43586g;
        if (inflater == null) {
            this.f43586g = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f43581b.reset();
        int i = this.f43585f;
        int i2 = this.f43584e;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f43586g.setInput(this.f43583d, i2, i3);
            this.f43587h = C11356c.INFLATING;
        } else {
            this.f43587h = C11356c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    /* renamed from: I */
    private boolean m55851I() throws ZipException {
        if (this.f43582c.m55882k() < 10) {
            return false;
        }
        if (this.f43582c.m55881j() != 35615) {
            throw new ZipException("Not in GZIP format");
        } else if (this.f43582c.m55879h() == 8) {
            this.f43589r = this.f43582c.m55879h();
            this.f43582c.m55883l(6);
            this.f43587h = C11356c.HEADER_EXTRA_LEN;
            return true;
        } else {
            throw new ZipException("Unsupported compression method");
        }
    }

    /* renamed from: K */
    private boolean m55852K() {
        if ((this.f43589r & 16) != 16) {
            this.f43587h = C11356c.HEADER_CRC;
            return true;
        } else if (!this.f43582c.m55878g()) {
            return false;
        } else {
            this.f43587h = C11356c.HEADER_CRC;
            return true;
        }
    }

    /* renamed from: L */
    private boolean m55853L() throws ZipException {
        if ((this.f43589r & 2) != 2) {
            this.f43587h = C11356c.INITIALIZE_INFLATER;
            return true;
        } else if (this.f43582c.m55882k() < 2) {
            return false;
        } else {
            if ((65535 & ((int) this.f43581b.getValue())) == this.f43582c.m55881j()) {
                this.f43587h = C11356c.INITIALIZE_INFLATER;
                return true;
            }
            throw new ZipException("Corrupt GZIP header");
        }
    }

    /* renamed from: Q */
    private boolean m55854Q() {
        int d = this.f43582c.m55882k();
        int i = this.f43590s;
        if (d < i) {
            return false;
        }
        this.f43582c.m55883l(i);
        this.f43587h = C11356c.HEADER_NAME;
        return true;
    }

    /* renamed from: S */
    private boolean m55855S() {
        if ((this.f43589r & 4) != 4) {
            this.f43587h = C11356c.HEADER_NAME;
            return true;
        } else if (this.f43582c.m55882k() < 2) {
            return false;
        } else {
            this.f43590s = this.f43582c.m55881j();
            this.f43587h = C11356c.HEADER_EXTRA;
            return true;
        }
    }

    /* renamed from: U */
    private boolean m55856U() {
        if ((this.f43589r & 8) != 8) {
            this.f43587h = C11356c.HEADER_COMMENT;
            return true;
        } else if (!this.f43582c.m55878g()) {
            return false;
        } else {
            this.f43587h = C11356c.HEADER_COMMENT;
            return true;
        }
    }

    /* renamed from: X */
    private boolean m55857X() throws ZipException {
        if (this.f43586g != null && this.f43582c.m55882k() <= 18) {
            this.f43586g.end();
            this.f43586g = null;
        }
        if (this.f43582c.m55882k() < 8) {
            return false;
        }
        if (this.f43581b.getValue() == this.f43582c.m55880i() && this.f43591t == this.f43582c.m55880i()) {
            this.f43581b.reset();
            this.f43587h = C11356c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    /* renamed from: f */
    static /* synthetic */ int m55860f(C11353s0 s0Var, int i) {
        int i2 = s0Var.f43584e + i;
        s0Var.f43584e = i2;
        return i2;
    }

    /* renamed from: n */
    static /* synthetic */ int m55864n(C11353s0 s0Var, int i) {
        int i2 = s0Var.f43592u + i;
        s0Var.f43592u = i2;
        return i2;
    }

    /* renamed from: q */
    private boolean m55865q() {
        C6431n.m37568u(this.f43586g != null, "inflater is null");
        C6431n.m37568u(this.f43584e == this.f43585f, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f43580a.mo35271k(), 512);
        if (min == 0) {
            return false;
        }
        this.f43584e = 0;
        this.f43585f = min;
        this.f43580a.mo35269A0(this.f43583d, 0, min);
        this.f43586g.setInput(this.f43583d, this.f43584e, min);
        this.f43587h = C11356c.INFLATING;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo35319F(byte[] bArr, int i, int i2) throws DataFormatException, ZipException {
        boolean z = true;
        C6431n.m37568u(!this.f43588i, "GzipInflatingBuffer is closed");
        boolean z2 = true;
        int i3 = 0;
        while (z2) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                switch (C11354a.f43595a[this.f43587h.ordinal()]) {
                    case 1:
                        z2 = m55851I();
                        break;
                    case 2:
                        z2 = m55855S();
                        break;
                    case 3:
                        z2 = m55854Q();
                        break;
                    case 4:
                        z2 = m55856U();
                        break;
                    case 5:
                        z2 = m55852K();
                        break;
                    case 6:
                        z2 = m55853L();
                        break;
                    case 7:
                        z2 = m55850G();
                        break;
                    case 8:
                        i3 += m55849D(bArr, i + i3, i4);
                        if (this.f43587h != C11356c.TRAILER) {
                            z2 = true;
                            break;
                        } else {
                            z2 = m55857X();
                            break;
                        }
                    case 9:
                        z2 = m55865q();
                        break;
                    case 10:
                        z2 = m55857X();
                        break;
                    default:
                        throw new AssertionError("Invalid state: " + this.f43587h);
                }
            } else {
                if (z2 && (this.f43587h != C11356c.HEADER || this.f43582c.m55882k() >= 10)) {
                    z = false;
                }
                this.f43594w = z;
                return i3;
            }
        }
        z = false;
        this.f43594w = z;
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo35320H() {
        C6431n.m37568u(!this.f43588i, "GzipInflatingBuffer is closed");
        return this.f43594w;
    }

    public void close() {
        if (!this.f43588i) {
            this.f43588i = true;
            this.f43580a.close();
            Inflater inflater = this.f43586g;
            if (inflater != null) {
                inflater.end();
                this.f43586g = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo35322p(C11380v1 v1Var) {
        C6431n.m37568u(!this.f43588i, "GzipInflatingBuffer is closed");
        this.f43580a.mo35350b(v1Var);
        this.f43594w = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo35323t() {
        int i = this.f43592u;
        this.f43592u = 0;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public int mo35324w() {
        int i = this.f43593v;
        this.f43593v = 0;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo35325x() {
        C6431n.m37568u(!this.f43588i, "GzipInflatingBuffer is closed");
        if (this.f43582c.m55882k() == 0 && this.f43587h == C11356c.HEADER) {
            return false;
        }
        return true;
    }
}
