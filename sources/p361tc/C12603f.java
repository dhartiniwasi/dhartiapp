package p361tc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p182a7.C6431n;
import p264io.grpc.internal.C11114b;
import p264io.grpc.internal.C11147c1;
import p264io.grpc.internal.C11183f2;
import p264io.grpc.internal.C11240g2;
import p264io.grpc.internal.C11241h;
import p264io.grpc.internal.C11244h0;
import p264io.grpc.internal.C11245h1;
import p264io.grpc.internal.C11310o2;
import p264io.grpc.internal.C11327p1;
import p264io.grpc.internal.C11335r0;
import p264io.grpc.internal.C11358t;
import p264io.grpc.internal.C11376v;
import p343rc.C12312f;
import p343rc.C12369p1;
import p343rc.C12402v0;
import p371uc.C12725a;
import p371uc.C12726b;
import p371uc.C12736h;
import p371uc.C12747k;

/* renamed from: tc.f */
/* compiled from: OkHttpChannelBuilder */
public final class C12603f extends C11114b<C12603f> {

    /* renamed from: r */
    private static final Logger f46198r = Logger.getLogger(C12603f.class.getName());

    /* renamed from: s */
    static final C12726b f46199s = new C12726b.C12728b(C12726b.f46631f).mo37638g(C12725a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C12725a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C12725a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, C12725a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, C12725a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, C12725a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).mo37641j(C12747k.TLS_1_2).mo37639h(true).mo37636e();

    /* renamed from: t */
    private static final long f46200t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u */
    private static final C11183f2.C11187d<Executor> f46201u;

    /* renamed from: v */
    static final C11327p1<Executor> f46202v;

    /* renamed from: w */
    private static final EnumSet<C12369p1> f46203w = EnumSet.of(C12369p1.MTLS, C12369p1.CUSTOM_MANAGERS);

    /* renamed from: b */
    private final C11245h1 f46204b;

    /* renamed from: c */
    private C11310o2.C11312b f46205c = C11310o2.m55703a();

    /* renamed from: d */
    private C11327p1<Executor> f46206d = f46202v;

    /* renamed from: e */
    private C11327p1<ScheduledExecutorService> f46207e = C11240g2.m55467c(C11335r0.f43548v);

    /* renamed from: f */
    private SocketFactory f46208f;

    /* renamed from: g */
    private SSLSocketFactory f46209g;

    /* renamed from: h */
    private final boolean f46210h;

    /* renamed from: i */
    private HostnameVerifier f46211i;

    /* renamed from: j */
    private C12726b f46212j = f46199s;

    /* renamed from: k */
    private C12606c f46213k = C12606c.TLS;

    /* renamed from: l */
    private long f46214l = Long.MAX_VALUE;

    /* renamed from: m */
    private long f46215m = C11335r0.f43540n;

    /* renamed from: n */
    private int f46216n = 65535;

    /* renamed from: o */
    private boolean f46217o;

    /* renamed from: p */
    private int f46218p = Integer.MAX_VALUE;

    /* renamed from: q */
    private final boolean f46219q = false;

    /* renamed from: tc.f$a */
    /* compiled from: OkHttpChannelBuilder */
    class C12604a implements C11183f2.C11187d<Executor> {
        C12604a() {
        }

        /* renamed from: c */
        public void mo35068b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: d */
        public Executor mo35067a() {
            return Executors.newCachedThreadPool(C11335r0.m55802i("grpc-okhttp-%d", true));
        }
    }

    /* renamed from: tc.f$b */
    /* compiled from: OkHttpChannelBuilder */
    static /* synthetic */ class C12605b {

        /* renamed from: a */
        static final /* synthetic */ int[] f46220a;

        /* renamed from: b */
        static final /* synthetic */ int[] f46221b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                tc.f$c[] r0 = p361tc.C12603f.C12606c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46221b = r0
                r1 = 1
                tc.f$c r2 = p361tc.C12603f.C12606c.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46221b     // Catch:{ NoSuchFieldError -> 0x001d }
                tc.f$c r3 = p361tc.C12603f.C12606c.TLS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                tc.e[] r2 = p361tc.C12602e.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f46220a = r2
                tc.e r3 = p361tc.C12602e.TLS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f46220a     // Catch:{ NoSuchFieldError -> 0x0038 }
                tc.e r2 = p361tc.C12602e.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p361tc.C12603f.C12605b.<clinit>():void");
        }
    }

    /* renamed from: tc.f$c */
    /* compiled from: OkHttpChannelBuilder */
    private enum C12606c {
        TLS,
        PLAINTEXT
    }

    /* renamed from: tc.f$d */
    /* compiled from: OkHttpChannelBuilder */
    private final class C12607d implements C11245h1.C11247b {
        private C12607d() {
        }

        /* renamed from: a */
        public int mo35187a() {
            return C12603f.this.mo37456h();
        }

        /* synthetic */ C12607d(C12603f fVar, C12604a aVar) {
            this();
        }
    }

    /* renamed from: tc.f$e */
    /* compiled from: OkHttpChannelBuilder */
    private final class C12608e implements C11245h1.C11248c {
        private C12608e() {
        }

        /* renamed from: a */
        public C11358t mo35188a() {
            return C12603f.this.mo37454f();
        }

        /* synthetic */ C12608e(C12603f fVar, C12604a aVar) {
            this();
        }
    }

    /* renamed from: tc.f$f */
    /* compiled from: OkHttpChannelBuilder */
    static final class C12609f implements C11358t {

        /* renamed from: A */
        private boolean f46227A;

        /* renamed from: a */
        private final C11327p1<Executor> f46228a;

        /* renamed from: b */
        final Executor f46229b;

        /* renamed from: c */
        private final C11327p1<ScheduledExecutorService> f46230c;

        /* renamed from: d */
        final ScheduledExecutorService f46231d;

        /* renamed from: e */
        final C11310o2.C11312b f46232e;

        /* renamed from: f */
        final SocketFactory f46233f;

        /* renamed from: g */
        final SSLSocketFactory f46234g;

        /* renamed from: h */
        final HostnameVerifier f46235h;

        /* renamed from: i */
        final C12726b f46236i;

        /* renamed from: r */
        final int f46237r;

        /* renamed from: s */
        private final boolean f46238s;

        /* renamed from: t */
        private final long f46239t;

        /* renamed from: u */
        private final C11241h f46240u;

        /* renamed from: v */
        private final long f46241v;

        /* renamed from: w */
        final int f46242w;

        /* renamed from: x */
        private final boolean f46243x;

        /* renamed from: y */
        final int f46244y;

        /* renamed from: z */
        final boolean f46245z;

        /* renamed from: tc.f$f$a */
        /* compiled from: OkHttpChannelBuilder */
        class C12610a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11241h.C11243b f46246a;

            C12610a(C11241h.C11243b bVar) {
                this.f46246a = bVar;
            }

            public void run() {
                this.f46246a.mo35183a();
            }
        }

        /* synthetic */ C12609f(C11327p1 p1Var, C11327p1 p1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12726b bVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C11310o2.C11312b bVar2, boolean z3, C12604a aVar) {
            this(p1Var, p1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i, z, j, j2, i2, z2, i3, bVar2, z3);
        }

        public void close() {
            if (!this.f46227A) {
                this.f46227A = true;
                this.f46228a.mo35181b(this.f46229b);
                this.f46230c.mo35181b(this.f46231d);
            }
        }

        /* renamed from: h0 */
        public C11376v mo35234h0(SocketAddress socketAddress, C11358t.C11359a aVar, C12312f fVar) {
            if (!this.f46227A) {
                C11241h.C11243b d = this.f46240u.mo35182d();
                C12615i iVar = new C12615i(this, (InetSocketAddress) socketAddress, aVar.mo35331a(), aVar.mo35334d(), aVar.mo35332b(), aVar.mo35333c(), new C12610a(d));
                if (this.f46238s) {
                    iVar.mo37476T(true, d.mo35184b(), this.f46241v, this.f46243x);
                }
                return iVar;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        /* renamed from: n1 */
        public ScheduledExecutorService mo35235n1() {
            return this.f46231d;
        }

        private C12609f(C11327p1<Executor> p1Var, C11327p1<ScheduledExecutorService> p1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12726b bVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C11310o2.C11312b bVar2, boolean z3) {
            this.f46228a = p1Var;
            this.f46229b = p1Var.mo35180a();
            this.f46230c = p1Var2;
            this.f46231d = p1Var2.mo35180a();
            this.f46233f = socketFactory;
            this.f46234g = sSLSocketFactory;
            this.f46235h = hostnameVerifier;
            this.f46236i = bVar;
            this.f46237r = i;
            this.f46238s = z;
            this.f46239t = j;
            this.f46240u = new C11241h("keepalive time nanos", j);
            this.f46241v = j2;
            this.f46242w = i2;
            this.f46243x = z2;
            this.f46244y = i3;
            this.f46245z = z3;
            this.f46232e = (C11310o2.C11312b) C6431n.m37562o(bVar2, "transportTracerFactory");
        }
    }

    static {
        C12604a aVar = new C12604a();
        f46201u = aVar;
        f46202v = C11240g2.m55467c(aVar);
    }

    private C12603f(String str) {
        this.f46204b = new C11245h1(str, new C12608e(this, (C12604a) null), new C12607d(this, (C12604a) null));
        this.f46210h = false;
    }

    public static C12603f forTarget(String str) {
        return new C12603f(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12402v0<?> mo34949e() {
        return this.f46204b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12609f mo37454f() {
        C12609f fVar = r2;
        C12609f fVar2 = new C12609f(this.f46206d, this.f46207e, this.f46208f, mo37455g(), this.f46211i, this.f46212j, this.f42916a, this.f46214l != Long.MAX_VALUE, this.f46214l, this.f46215m, this.f46216n, this.f46217o, this.f46218p, this.f46205c, false, (C12604a) null);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public SSLSocketFactory mo37455g() {
        int i = C12605b.f46221b[this.f46213k.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            try {
                if (this.f46209g == null) {
                    this.f46209g = SSLContext.getInstance("Default", C12736h.m60401e().mo37660g()).getSocketFactory();
                }
                return this.f46209g;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            throw new RuntimeException("Unknown negotiation type: " + this.f46213k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo37456h() {
        int i = C12605b.f46221b[this.f46213k.ordinal()];
        if (i == 1) {
            return 80;
        }
        if (i == 2) {
            return 443;
        }
        throw new AssertionError(this.f46213k + " not handled");
    }

    /* renamed from: i */
    public C12603f mo37143c(long j, TimeUnit timeUnit) {
        C6431n.m37552e(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.f46214l = nanos;
        long l = C11147c1.m55177l(nanos);
        this.f46214l = l;
        if (l >= f46200t) {
            this.f46214l = Long.MAX_VALUE;
        }
        return this;
    }

    /* renamed from: j */
    public C12603f mo37144d() {
        C6431n.m37568u(!this.f46210h, "Cannot change security when using ChannelCredentials");
        this.f46213k = C12606c.PLAINTEXT;
        return this;
    }

    public C12603f scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f46207e = new C11244h0((ScheduledExecutorService) C6431n.m37562o(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public C12603f sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        C6431n.m37568u(!this.f46210h, "Cannot change security when using ChannelCredentials");
        this.f46209g = sSLSocketFactory;
        this.f46213k = C12606c.TLS;
        return this;
    }

    public C12603f transportExecutor(Executor executor) {
        if (executor == null) {
            this.f46206d = f46202v;
        } else {
            this.f46206d = new C11244h0(executor);
        }
        return this;
    }
}
