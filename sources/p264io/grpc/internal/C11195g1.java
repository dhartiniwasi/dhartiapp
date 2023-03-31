package p264io.grpc.internal;

import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p182a7.C6419h;
import p182a7.C6431n;
import p182a7.C6441r;
import p182a7.C6444t;
import p264io.grpc.internal.C11256j;
import p264io.grpc.internal.C11264j1;
import p264io.grpc.internal.C11269k;
import p264io.grpc.internal.C11272k1;
import p264io.grpc.internal.C11289m;
import p264io.grpc.internal.C11314p;
import p264io.grpc.internal.C11392y0;
import p264io.grpc.internal.C11436z1;
import p343rc.C12271a;
import p343rc.C12276a1;
import p343rc.C12287b;
import p343rc.C12292c;
import p343rc.C12297c1;
import p343rc.C12301d;
import p343rc.C12302d0;
import p343rc.C12308e0;
import p343rc.C12312f;
import p343rc.C12314f0;
import p343rc.C12319g;
import p343rc.C12322g1;
import p343rc.C12323h;
import p343rc.C12327i0;
import p343rc.C12331j;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12359n1;
import p343rc.C12364o;
import p343rc.C12367p;
import p343rc.C12370q;
import p343rc.C12372r;
import p343rc.C12376r0;
import p343rc.C12399u0;
import p343rc.C12400v;
import p343rc.C12406x;
import p343rc.C12411y0;
import p343rc.C12422z;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.g1 */
/* compiled from: ManagedChannelImpl */
final class C11195g1 extends C12399u0 implements C12327i0<Object> {

    /* renamed from: n0 */
    static final Logger f43103n0 = Logger.getLogger(C11195g1.class.getName());

    /* renamed from: o0 */
    static final Pattern f43104o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0 */
    static final C12335j1 f43105p0;

    /* renamed from: q0 */
    static final C12335j1 f43106q0;

    /* renamed from: r0 */
    static final C12335j1 f43107r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public static final C11264j1 f43108s0 = C11264j1.m55547a();
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public static final C12314f0 f43109t0 = new C11196a();
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final C12319g<Object, Object> f43110u0 = new C11207l();

    /* renamed from: A */
    private final C12301d f43111A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final String f43112B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C12276a1 f43113C;

    /* renamed from: D */
    private boolean f43114D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C11218t f43115E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public volatile C12376r0.C12387i f43116F;

    /* renamed from: G */
    private boolean f43117G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final Set<C11392y0> f43118H = new HashSet(16, 0.75f);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public Collection<C11224v.C11231g<?, ?>> f43119I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final Object f43120J = new Object();

    /* renamed from: K */
    private final Set<C11331q1> f43121K = new HashSet(1, 0.75f);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C11105a0 f43122L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C11239z f43123M = new C11239z(this, (C11196a) null);
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final AtomicBoolean f43124N = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f43125O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f43126P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public volatile boolean f43127Q;

    /* renamed from: R */
    private final CountDownLatch f43128R = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C11289m.C11291b f43129S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C11289m f43130T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C11305o f43131U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C12312f f43132V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C12302d0 f43133W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C11224v f43134X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C11234w f43135Y = C11234w.NO_RESOLUTION;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C11264j1 f43136Z = f43108s0;

    /* renamed from: a */
    private final C12334j0 f43137a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C11264j1 f43138a0;

    /* renamed from: b */
    private final String f43139b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f43140b0 = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f43141c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final boolean f43142c0;

    /* renamed from: d */
    private final C12297c1 f43143d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C11436z1.C11468t f43144d0 = new C11436z1.C11468t();

    /* renamed from: e */
    private final C12276a1.C12281d f43145e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final long f43146e0;

    /* renamed from: f */
    private final C12276a1.C12278b f43147f;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final long f43148f0;

    /* renamed from: g */
    private final C11256j f43149g;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final boolean f43150g0;

    /* renamed from: h */
    private final C11358t f43151h;

    /* renamed from: h0 */
    private final C11272k1.C11273a f43152h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C11358t f43153i;

    /* renamed from: i0 */
    final C11383w0<Object> f43154i0;

    /* renamed from: j */
    private final C11358t f43155j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C12359n1.C12363d f43156j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C11235x f43157k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C11269k f43158k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Executor f43159l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final C11314p.C11323e f43160l0;

    /* renamed from: m */
    private final C11327p1<? extends Executor> f43161m;

    /* renamed from: m0 */
    private final C11412y1 f43162m0;

    /* renamed from: n */
    private final C11327p1<? extends Executor> f43163n;

    /* renamed from: o */
    private final C11215q f43164o;

    /* renamed from: p */
    private final C11215q f43165p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C11287l2 f43166q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final int f43167r;

    /* renamed from: s */
    final C12359n1 f43168s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f43169t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C12400v f43170u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C12364o f43171v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C6444t<C6441r> f43172w;

    /* renamed from: x */
    private final long f43173x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C11381w f43174y = new C11381w();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C11269k.C11270a f43175z;

    /* renamed from: io.grpc.internal.g1$a */
    /* compiled from: ManagedChannelImpl */
    class C11196a extends C12314f0 {
        C11196a() {
        }

        /* renamed from: a */
        public C12314f0.C12316b mo35089a(C12376r0.C12383f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* renamed from: io.grpc.internal.g1$b */
    /* compiled from: ManagedChannelImpl */
    final class C11197b implements Runnable {
        C11197b() {
        }

        public void run() {
            C11195g1.this.m55301A0(true);
        }
    }

    /* renamed from: io.grpc.internal.g1$c */
    /* compiled from: ManagedChannelImpl */
    final class C11198c implements C11289m.C11291b {

        /* renamed from: a */
        final /* synthetic */ C11287l2 f43177a;

        C11198c(C11287l2 l2Var) {
            this.f43177a = l2Var;
        }

        /* renamed from: a */
        public C11289m mo35091a() {
            return new C11289m(this.f43177a);
        }
    }

    /* renamed from: io.grpc.internal.g1$d */
    /* compiled from: ManagedChannelImpl */
    final class C11199d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f43179a;

        /* renamed from: b */
        final /* synthetic */ C12367p f43180b;

        C11199d(Runnable runnable, C12367p pVar) {
            this.f43179a = runnable;
            this.f43180b = pVar;
        }

        public void run() {
            C11195g1.this.f43174y.mo35373c(this.f43179a, C11195g1.this.f43159l, this.f43180b);
        }
    }

    /* renamed from: io.grpc.internal.g1$e */
    /* compiled from: ManagedChannelImpl */
    final class C11200e extends C12376r0.C12387i {

        /* renamed from: a */
        private final C12376r0.C12382e f43182a;

        /* renamed from: b */
        final /* synthetic */ Throwable f43183b;

        C11200e(Throwable th) {
            this.f43183b = th;
            this.f43182a = C12376r0.C12382e.m59228e(C12335j1.f45620t.mo37030q("Panic! This is a bug!").mo37029p(th));
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return this.f43182a;
        }

        public String toString() {
            return C6419h.m37527b(C11200e.class).mo21842d("panicPickResult", this.f43182a).toString();
        }
    }

    /* renamed from: io.grpc.internal.g1$f */
    /* compiled from: ManagedChannelImpl */
    final class C11201f implements Runnable {
        C11201f() {
        }

        public void run() {
            if (!C11195g1.this.f43124N.get() && C11195g1.this.f43115E != null) {
                C11195g1.this.m55301A0(false);
                C11195g1.this.m55305C0();
            }
        }
    }

    /* renamed from: io.grpc.internal.g1$g */
    /* compiled from: ManagedChannelImpl */
    final class C11202g implements Runnable {
        C11202g() {
        }

        public void run() {
            C11195g1.this.mo35076D0();
            if (C11195g1.this.f43116F != null) {
                C11195g1.this.f43116F.mo37121b();
            }
            if (C11195g1.this.f43115E != null) {
                C11195g1.this.f43115E.f43217a.mo35209c();
            }
        }
    }

    /* renamed from: io.grpc.internal.g1$h */
    /* compiled from: ManagedChannelImpl */
    final class C11203h implements Runnable {
        C11203h() {
        }

        public void run() {
            C11195g1.this.f43132V.mo35255a(C12312f.C12313a.INFO, "Entering SHUTDOWN state");
            C11195g1.this.f43174y.mo35372b(C12367p.SHUTDOWN);
        }
    }

    /* renamed from: io.grpc.internal.g1$i */
    /* compiled from: ManagedChannelImpl */
    final class C11204i implements Runnable {
        C11204i() {
        }

        public void run() {
            if (!C11195g1.this.f43125O) {
                boolean unused = C11195g1.this.f43125O = true;
                C11195g1.this.m55314H0();
            }
        }
    }

    /* renamed from: io.grpc.internal.g1$j */
    /* compiled from: ManagedChannelImpl */
    class C11205j implements Thread.UncaughtExceptionHandler {
        C11205j() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = C11195g1.f43103n0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + C11195g1.this.mo34935f() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C11195g1.this.mo35077J0(th);
        }
    }

    /* renamed from: io.grpc.internal.g1$k */
    /* compiled from: ManagedChannelImpl */
    class C11206k extends C11301n0 {

        /* renamed from: b */
        final /* synthetic */ String f43190b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11206k(C12276a1 a1Var, String str) {
            super(a1Var);
            this.f43190b = str;
        }

        /* renamed from: a */
        public String mo34988a() {
            return this.f43190b;
        }
    }

    /* renamed from: io.grpc.internal.g1$l */
    /* compiled from: ManagedChannelImpl */
    class C11207l extends C12319g<Object, Object> {
        C11207l() {
        }

        /* renamed from: a */
        public void mo35100a(String str, Throwable th) {
        }

        /* renamed from: b */
        public void mo33082b() {
        }

        /* renamed from: c */
        public void mo35101c(int i) {
        }

        /* renamed from: d */
        public void mo35102d(Object obj) {
        }

        /* renamed from: e */
        public void mo35103e(C12319g.C12320a<Object> aVar, C12411y0 y0Var) {
        }
    }

    /* renamed from: io.grpc.internal.g1$m */
    /* compiled from: ManagedChannelImpl */
    private final class C11208m implements C11314p.C11323e {

        /* renamed from: io.grpc.internal.g1$m$a */
        /* compiled from: ManagedChannelImpl */
        final class C11209a implements Runnable {
            C11209a() {
            }

            public void run() {
                C11195g1.this.mo35076D0();
            }
        }

        /* renamed from: io.grpc.internal.g1$m$b */
        /* compiled from: ManagedChannelImpl */
        final class C11210b<ReqT> extends C11436z1<ReqT> {

            /* renamed from: C */
            final /* synthetic */ C12423z0 f43193C;

            /* renamed from: D */
            final /* synthetic */ C12411y0 f43194D;

            /* renamed from: E */
            final /* synthetic */ C12292c f43195E;

            /* renamed from: F */
            final /* synthetic */ C11113a2 f43196F;

            /* renamed from: G */
            final /* synthetic */ C11360t0 f43197G;

            /* renamed from: H */
            final /* synthetic */ C11436z1.C11451c0 f43198H;

            /* renamed from: I */
            final /* synthetic */ C12372r f43199I;

            /* renamed from: J */
            final /* synthetic */ C11208m f43200J;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            C11210b(p264io.grpc.internal.C11195g1.C11208m r16, p343rc.C12423z0 r17, p343rc.C12411y0 r18, p343rc.C12292c r19, p264io.grpc.internal.C11113a2 r20, p264io.grpc.internal.C11360t0 r21, p264io.grpc.internal.C11436z1.C11451c0 r22, p343rc.C12372r r23) {
                /*
                    r15 = this;
                    r13 = r15
                    r0 = r16
                    r1 = r19
                    r13.f43200J = r0
                    r2 = r17
                    r13.f43193C = r2
                    r3 = r18
                    r13.f43194D = r3
                    r13.f43195E = r1
                    r10 = r20
                    r13.f43196F = r10
                    r11 = r21
                    r13.f43197G = r11
                    r12 = r22
                    r13.f43198H = r12
                    r4 = r23
                    r13.f43199I = r4
                    io.grpc.internal.g1 r4 = p264io.grpc.internal.C11195g1.this
                    io.grpc.internal.z1$t r4 = r4.f43144d0
                    io.grpc.internal.g1 r5 = p264io.grpc.internal.C11195g1.this
                    long r5 = r5.f43146e0
                    io.grpc.internal.g1 r7 = p264io.grpc.internal.C11195g1.this
                    long r7 = r7.f43148f0
                    io.grpc.internal.g1 r9 = p264io.grpc.internal.C11195g1.this
                    java.util.concurrent.Executor r9 = r9.m55308E0(r1)
                    io.grpc.internal.g1 r0 = p264io.grpc.internal.C11195g1.this
                    io.grpc.internal.t r0 = r0.f43153i
                    java.util.concurrent.ScheduledExecutorService r14 = r0.mo35235n1()
                    r0 = r15
                    r1 = r17
                    r2 = r18
                    r3 = r4
                    r4 = r5
                    r6 = r7
                    r8 = r9
                    r9 = r14
                    r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11195g1.C11208m.C11210b.<init>(io.grpc.internal.g1$m, rc.z0, rc.y0, rc.c, io.grpc.internal.a2, io.grpc.internal.t0, io.grpc.internal.z1$c0, rc.r):void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f0 */
            public C11329q mo35106f0(C12411y0 y0Var, C12340k.C12341a aVar, int i, boolean z) {
                C12292c q = this.f43195E.mo36972q(aVar);
                C12340k[] f = C11335r0.m55799f(q, y0Var, i, z);
                C11351s b = this.f43200J.m55400c(new C11361t1(this.f43193C, y0Var, q));
                C12372r b2 = this.f43199I.mo37086b();
                try {
                    return b.mo34932b(this.f43193C, y0Var, q, f);
                } finally {
                    this.f43199I.mo37088f(b2);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g0 */
            public void mo35107g0() {
                C11195g1.this.f43123M.mo35179d(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h0 */
            public C12335j1 mo35108h0() {
                return C11195g1.this.f43123M.mo35176a(this);
            }
        }

        private C11208m() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C11351s m55400c(C12376r0.C12383f fVar) {
            C12376r0.C12387i s = C11195g1.this.f43116F;
            if (C11195g1.this.f43124N.get()) {
                return C11195g1.this.f43122L;
            }
            if (s == null) {
                C11195g1.this.f43168s.execute(new C11209a());
                return C11195g1.this.f43122L;
            }
            C11351s j = C11335r0.m55803j(s.mo35093a(fVar), fVar.mo35344a().mo36965j());
            if (j != null) {
                return j;
            }
            return C11195g1.this.f43122L;
        }

        /* renamed from: a */
        public C11329q mo35104a(C12423z0<?, ?> z0Var, C12292c cVar, C12411y0 y0Var, C12372r rVar) {
            C11113a2 a2Var;
            C11360t0 t0Var;
            if (!C11195g1.this.f43150g0) {
                C11351s c = m55400c(new C11361t1(z0Var, y0Var, cVar));
                C12372r b = rVar.mo37086b();
                try {
                    return c.mo34932b(z0Var, y0Var, cVar, C11335r0.m55799f(cVar, y0Var, 0, false));
                } finally {
                    rVar.mo37088f(b);
                }
            } else {
                C11436z1.C11451c0 g = C11195g1.this.f43136Z.mo35224g();
                C11264j1.C11266b bVar = (C11264j1.C11266b) cVar.mo36963h(C11264j1.C11266b.f43347g);
                if (bVar == null) {
                    a2Var = null;
                } else {
                    a2Var = bVar.f43352e;
                }
                if (bVar == null) {
                    t0Var = null;
                } else {
                    t0Var = bVar.f43353f;
                }
                return new C11210b(this, z0Var, y0Var, cVar, a2Var, t0Var, g, rVar);
            }
        }

        /* synthetic */ C11208m(C11195g1 g1Var, C11196a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$n */
    /* compiled from: ManagedChannelImpl */
    static final class C11211n<ReqT, RespT> extends C12422z<ReqT, RespT> {

        /* renamed from: a */
        private final C12314f0 f43201a;

        /* renamed from: b */
        private final C12301d f43202b;

        /* renamed from: c */
        private final Executor f43203c;

        /* renamed from: d */
        private final C12423z0<ReqT, RespT> f43204d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C12372r f43205e;

        /* renamed from: f */
        private C12292c f43206f;

        /* renamed from: g */
        private C12319g<ReqT, RespT> f43207g;

        /* renamed from: io.grpc.internal.g1$n$a */
        /* compiled from: ManagedChannelImpl */
        class C11212a extends C11388x {

            /* renamed from: b */
            final /* synthetic */ C12319g.C12320a f43208b;

            /* renamed from: c */
            final /* synthetic */ C12335j1 f43209c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11212a(C12319g.C12320a aVar, C12335j1 j1Var) {
                super(C11211n.this.f43205e);
                this.f43208b = aVar;
                this.f43209c = j1Var;
            }

            /* renamed from: a */
            public void mo35109a() {
                this.f43208b.mo33078a(this.f43209c, new C12411y0());
            }
        }

        C11211n(C12314f0 f0Var, C12301d dVar, Executor executor, C12423z0<ReqT, RespT> z0Var, C12292c cVar) {
            this.f43201a = f0Var;
            this.f43202b = dVar;
            this.f43204d = z0Var;
            executor = cVar.mo36960e() != null ? cVar.mo36960e() : executor;
            this.f43203c = executor;
            this.f43206f = cVar.mo36968m(executor);
            this.f43205e = C12372r.m59190e();
        }

        /* renamed from: h */
        private void m55406h(C12319g.C12320a<RespT> aVar, C12335j1 j1Var) {
            this.f43203c.execute(new C11212a(aVar, j1Var));
        }

        /* renamed from: a */
        public void mo35100a(String str, Throwable th) {
            C12319g<ReqT, RespT> gVar = this.f43207g;
            if (gVar != null) {
                gVar.mo35100a(str, th);
            }
        }

        /* renamed from: e */
        public void mo35103e(C12319g.C12320a<RespT> aVar, C12411y0 y0Var) {
            C12314f0.C12316b a = this.f43201a.mo35089a(new C11361t1(this.f43204d, y0Var, this.f43206f));
            C12335j1 c = a.mo37012c();
            if (!c.mo37028o()) {
                m55406h(aVar, C11335r0.m55807n(c));
                this.f43207g = C11195g1.f43110u0;
                return;
            }
            C12323h b = a.mo37011b();
            C11264j1.C11266b f = ((C11264j1) a.mo37010a()).mo35223f(this.f43204d);
            if (f != null) {
                this.f43206f = this.f43206f.mo36971p(C11264j1.C11266b.f43347g, f);
            }
            if (b != null) {
                this.f43207g = b.mo37015a(this.f43204d, this.f43206f, this.f43202b);
            } else {
                this.f43207g = this.f43202b.mo35081e(this.f43204d, this.f43206f);
            }
            this.f43207g.mo35103e(aVar, y0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C12319g<ReqT, RespT> mo33083f() {
            return this.f43207g;
        }
    }

    /* renamed from: io.grpc.internal.g1$o */
    /* compiled from: ManagedChannelImpl */
    class C11213o implements Runnable {
        C11213o() {
        }

        public void run() {
            C12359n1.C12363d unused = C11195g1.this.f43156j0 = null;
            C11195g1.this.m55321L0();
        }
    }

    /* renamed from: io.grpc.internal.g1$p */
    /* compiled from: ManagedChannelImpl */
    private final class C11214p implements C11272k1.C11273a {
        private C11214p() {
        }

        /* renamed from: a */
        public void mo35111a() {
        }

        /* renamed from: b */
        public void mo35112b() {
            C6431n.m37568u(C11195g1.this.f43124N.get(), "Channel must have been shut down");
            boolean unused = C11195g1.this.f43126P = true;
            C11195g1.this.m55326O0(false);
            C11195g1.this.m55314H0();
            C11195g1.this.m55316I0();
        }

        /* renamed from: c */
        public void mo35113c(boolean z) {
            C11195g1 g1Var = C11195g1.this;
            g1Var.f43154i0.mo35377e(g1Var.f43122L, z);
        }

        /* renamed from: d */
        public void mo35114d(C12335j1 j1Var) {
            C6431n.m37568u(C11195g1.this.f43124N.get(), "Channel must have been shut down");
        }

        /* synthetic */ C11214p(C11195g1 g1Var, C11196a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$q */
    /* compiled from: ManagedChannelImpl */
    static final class C11215q implements Executor {

        /* renamed from: a */
        private final C11327p1<? extends Executor> f43213a;

        /* renamed from: b */
        private Executor f43214b;

        C11215q(C11327p1<? extends Executor> p1Var) {
            this.f43213a = (C11327p1) C6431n.m37562o(p1Var, "executorPool");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized Executor mo35115b() {
            if (this.f43214b == null) {
                this.f43214b = (Executor) C6431n.m37563p((Executor) this.f43213a.mo35180a(), "%s.getObject()", this.f43214b);
            }
            return this.f43214b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo35116c() {
            Executor executor = this.f43214b;
            if (executor != null) {
                this.f43214b = (Executor) this.f43213a.mo35181b(executor);
            }
        }

        public void execute(Runnable runnable) {
            mo35115b().execute(runnable);
        }
    }

    /* renamed from: io.grpc.internal.g1$r */
    /* compiled from: ManagedChannelImpl */
    private final class C11216r extends C11383w0<Object> {
        private C11216r() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo35118b() {
            C11195g1.this.mo35076D0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo35119c() {
            if (!C11195g1.this.f43124N.get()) {
                C11195g1.this.m55323M0();
            }
        }

        /* synthetic */ C11216r(C11195g1 g1Var, C11196a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$s */
    /* compiled from: ManagedChannelImpl */
    private class C11217s implements Runnable {
        private C11217s() {
        }

        public void run() {
            if (C11195g1.this.f43115E != null) {
                C11195g1.this.m55305C0();
            }
        }

        /* synthetic */ C11217s(C11195g1 g1Var, C11196a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$t */
    /* compiled from: ManagedChannelImpl */
    private final class C11218t extends C12376r0.C12381d {

        /* renamed from: a */
        C11256j.C11258b f43217a;

        /* renamed from: io.grpc.internal.g1$t$a */
        /* compiled from: ManagedChannelImpl */
        final class C11219a implements Runnable {
            C11219a() {
            }

            public void run() {
                C11195g1.this.m55319K0();
            }
        }

        /* renamed from: io.grpc.internal.g1$t$b */
        /* compiled from: ManagedChannelImpl */
        final class C11220b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12376r0.C12387i f43220a;

            /* renamed from: b */
            final /* synthetic */ C12367p f43221b;

            C11220b(C12376r0.C12387i iVar, C12367p pVar) {
                this.f43220a = iVar;
                this.f43221b = pVar;
            }

            public void run() {
                C11218t tVar = C11218t.this;
                if (tVar == C11195g1.this.f43115E) {
                    C11195g1.this.m55329Q0(this.f43220a);
                    if (this.f43221b != C12367p.SHUTDOWN) {
                        C11195g1.this.f43132V.mo35256b(C12312f.C12313a.INFO, "Entering {0} state with picker: {1}", this.f43221b, this.f43220a);
                        C11195g1.this.f43174y.mo35372b(this.f43221b);
                    }
                }
            }
        }

        private C11218t() {
        }

        /* renamed from: b */
        public C12312f mo35122b() {
            return C11195g1.this.f43132V;
        }

        /* renamed from: c */
        public ScheduledExecutorService mo35123c() {
            return C11195g1.this.f43157k;
        }

        /* renamed from: d */
        public C12359n1 mo35124d() {
            return C11195g1.this.f43168s;
        }

        /* renamed from: e */
        public void mo35125e() {
            C11195g1.this.f43168s.mo37068f();
            C11195g1.this.f43168s.execute(new C11219a());
        }

        /* renamed from: f */
        public void mo35126f(C12367p pVar, C12376r0.C12387i iVar) {
            C11195g1.this.f43168s.mo37068f();
            C6431n.m37562o(pVar, "newState");
            C6431n.m37562o(iVar, "newPicker");
            C11195g1.this.f43168s.execute(new C11220b(iVar, pVar));
        }

        /* renamed from: g */
        public C11165e mo35121a(C12376r0.C12378b bVar) {
            C11195g1.this.f43168s.mo37068f();
            C6431n.m37568u(!C11195g1.this.f43126P, "Channel is being terminated");
            return new C11236y(bVar, this);
        }

        /* synthetic */ C11218t(C11195g1 g1Var, C11196a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$u */
    /* compiled from: ManagedChannelImpl */
    private final class C11221u extends C12276a1.C12282e {

        /* renamed from: a */
        final C11218t f43223a;

        /* renamed from: b */
        final C12276a1 f43224b;

        /* renamed from: io.grpc.internal.g1$u$a */
        /* compiled from: ManagedChannelImpl */
        final class C11222a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f43226a;

            C11222a(C12335j1 j1Var) {
                this.f43226a = j1Var;
            }

            public void run() {
                C11221u.this.m55428f(this.f43226a);
            }
        }

        /* renamed from: io.grpc.internal.g1$u$b */
        /* compiled from: ManagedChannelImpl */
        final class C11223b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12276a1.C12284g f43228a;

            C11223b(C12276a1.C12284g gVar) {
                this.f43228a = gVar;
            }

            public void run() {
                C11264j1 j1Var;
                if (C11195g1.this.f43113C == C11221u.this.f43224b) {
                    List<C12406x> a = this.f43228a.mo36945a();
                    C12312f F = C11195g1.this.f43132V;
                    C12312f.C12313a aVar = C12312f.C12313a.DEBUG;
                    F.mo35256b(aVar, "Resolved address: {0}, config={1}", a, this.f43228a.mo36946b());
                    C11234w m0 = C11195g1.this.f43135Y;
                    C11234w wVar = C11234w.SUCCESS;
                    if (m0 != wVar) {
                        C11195g1.this.f43132V.mo35256b(C12312f.C12313a.INFO, "Address resolved: {0}", a);
                        C11234w unused = C11195g1.this.f43135Y = wVar;
                    }
                    C11269k unused2 = C11195g1.this.f43158k0 = null;
                    C12276a1.C12280c c = this.f43228a.mo36947c();
                    C12314f0 f0Var = (C12314f0) this.f43228a.mo36946b().mo36915b(C12314f0.f45586a);
                    C11264j1 j1Var2 = (c == null || c.mo36939c() == null) ? null : (C11264j1) c.mo36939c();
                    C12335j1 d = c != null ? c.mo36940d() : null;
                    if (!C11195g1.this.f43142c0) {
                        if (j1Var2 != null) {
                            C11195g1.this.f43132V.mo35255a(C12312f.C12313a.INFO, "Service config from name resolver discarded by channel settings");
                        }
                        j1Var = C11195g1.this.f43138a0 == null ? C11195g1.f43108s0 : C11195g1.this.f43138a0;
                        if (f0Var != null) {
                            C11195g1.this.f43132V.mo35255a(C12312f.C12313a.INFO, "Config selector from name resolver discarded by channel settings");
                        }
                        C11195g1.this.f43134X.mo35137p(j1Var.mo35219c());
                    } else {
                        if (j1Var2 != null) {
                            if (f0Var != null) {
                                C11195g1.this.f43134X.mo35137p(f0Var);
                                if (j1Var2.mo35219c() != null) {
                                    C11195g1.this.f43132V.mo35255a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                                }
                            } else {
                                C11195g1.this.f43134X.mo35137p(j1Var2.mo35219c());
                            }
                        } else if (C11195g1.this.f43138a0 != null) {
                            j1Var2 = C11195g1.this.f43138a0;
                            C11195g1.this.f43134X.mo35137p(j1Var2.mo35219c());
                            C11195g1.this.f43132V.mo35255a(C12312f.C12313a.INFO, "Received no service config, using default service config");
                        } else if (d == null) {
                            j1Var2 = C11195g1.f43108s0;
                            C11195g1.this.f43134X.mo35137p((C12314f0) null);
                        } else if (!C11195g1.this.f43140b0) {
                            C11195g1.this.f43132V.mo35255a(C12312f.C12313a.INFO, "Fallback to error due to invalid first service config without default config");
                            C11221u.this.mo35130b(c.mo36940d());
                            return;
                        } else {
                            j1Var2 = C11195g1.this.f43136Z;
                        }
                        if (!j1Var2.equals(C11195g1.this.f43136Z)) {
                            C12312f F2 = C11195g1.this.f43132V;
                            C12312f.C12313a aVar2 = C12312f.C12313a.INFO;
                            Object[] objArr = new Object[1];
                            objArr[0] = j1Var2 == C11195g1.f43108s0 ? " to empty" : "";
                            F2.mo35256b(aVar2, "Service config changed{0}", objArr);
                            C11264j1 unused3 = C11195g1.this.f43136Z = j1Var2;
                        }
                        try {
                            boolean unused4 = C11195g1.this.f43140b0 = true;
                        } catch (RuntimeException e) {
                            Logger logger = C11195g1.f43103n0;
                            Level level = Level.WARNING;
                            logger.log(level, "[" + C11195g1.this.mo34935f() + "] Unexpected exception from parsing service config", e);
                        }
                        j1Var = j1Var2;
                    }
                    C12271a b = this.f43228a.mo36946b();
                    C11221u uVar = C11221u.this;
                    if (uVar.f43223a == C11195g1.this.f43115E) {
                        C12271a.C12273b c2 = b.mo36916d().mo36921c(C12314f0.f45586a);
                        Map<String, ?> d2 = j1Var.mo35220d();
                        if (d2 != null) {
                            c2.mo36922d(C12376r0.f45712b, d2).mo36920a();
                        }
                        if (!C11221u.this.f43223a.f43217a.mo35211e(C12376r0.C12384g.m59240d().mo37117b(a).mo37118c(c2.mo36920a()).mo37119d(j1Var.mo35221e()).mo37116a())) {
                            C11221u.this.m55429g();
                        }
                    }
                }
            }
        }

        C11221u(C11218t tVar, C12276a1 a1Var) {
            this.f43223a = (C11218t) C6431n.m37562o(tVar, "helperImpl");
            this.f43224b = (C12276a1) C6431n.m37562o(a1Var, "resolver");
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m55428f(C12335j1 j1Var) {
            C11195g1.f43103n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C11195g1.this.mo34935f(), j1Var});
            C11195g1.this.f43134X.mo35134m();
            C11234w m0 = C11195g1.this.f43135Y;
            C11234w wVar = C11234w.ERROR;
            if (m0 != wVar) {
                C11195g1.this.f43132V.mo35256b(C12312f.C12313a.WARNING, "Failed to resolve name: {0}", j1Var);
                C11234w unused = C11195g1.this.f43135Y = wVar;
            }
            if (this.f43223a == C11195g1.this.f43115E) {
                this.f43223a.f43217a.mo35208b(j1Var);
                m55429g();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m55429g() {
            if (C11195g1.this.f43156j0 == null || !C11195g1.this.f43156j0.mo37075b()) {
                if (C11195g1.this.f43158k0 == null) {
                    C11195g1 g1Var = C11195g1.this;
                    C11269k unused = g1Var.f43158k0 = g1Var.f43175z.get();
                }
                long a = C11195g1.this.f43158k0.mo35037a();
                C11195g1.this.f43132V.mo35256b(C12312f.C12313a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
                C11195g1 g1Var2 = C11195g1.this;
                C12359n1.C12363d unused2 = g1Var2.f43156j0 = g1Var2.f43168s.mo37065d(new C11213o(), a, TimeUnit.NANOSECONDS, C11195g1.this.f43153i.mo35235n1());
            }
        }

        /* renamed from: b */
        public void mo35130b(C12335j1 j1Var) {
            C6431n.m37552e(!j1Var.mo37028o(), "the error status must not be OK");
            C11195g1.this.f43168s.execute(new C11222a(j1Var));
        }

        /* renamed from: c */
        public void mo35131c(C12276a1.C12284g gVar) {
            C11195g1.this.f43168s.execute(new C11223b(gVar));
        }
    }

    /* renamed from: io.grpc.internal.g1$v */
    /* compiled from: ManagedChannelImpl */
    private class C11224v extends C12301d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final AtomicReference<C12314f0> f43230a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f43231b;

        /* renamed from: c */
        private final C12301d f43232c;

        /* renamed from: io.grpc.internal.g1$v$a */
        /* compiled from: ManagedChannelImpl */
        class C11225a extends C12301d {
            C11225a() {
            }

            /* renamed from: a */
            public String mo35080a() {
                return C11224v.this.f43231b;
            }

            /* renamed from: e */
            public <RequestT, ResponseT> C12319g<RequestT, ResponseT> mo35081e(C12423z0<RequestT, ResponseT> z0Var, C12292c cVar) {
                return new C11314p(z0Var, C11195g1.this.m55308E0(cVar), cVar, C11195g1.this.f43160l0, C11195g1.this.f43127Q ? null : C11195g1.this.f43153i.mo35235n1(), C11195g1.this.f43130T, (C12314f0) null).mo35285B(C11195g1.this.f43169t).mo35284A(C11195g1.this.f43170u).mo35287z(C11195g1.this.f43171v);
            }
        }

        /* renamed from: io.grpc.internal.g1$v$b */
        /* compiled from: ManagedChannelImpl */
        final class C11226b implements Runnable {
            C11226b() {
            }

            public void run() {
                if (C11195g1.this.f43119I == null) {
                    if (C11224v.this.f43230a.get() == C11195g1.f43109t0) {
                        C11224v.this.f43230a.set((Object) null);
                    }
                    C11195g1.this.f43123M.mo35177b(C11195g1.f43106q0);
                }
            }
        }

        /* renamed from: io.grpc.internal.g1$v$c */
        /* compiled from: ManagedChannelImpl */
        final class C11227c implements Runnable {
            C11227c() {
            }

            public void run() {
                if (C11224v.this.f43230a.get() == C11195g1.f43109t0) {
                    C11224v.this.f43230a.set((Object) null);
                }
                if (C11195g1.this.f43119I != null) {
                    for (C11231g a : C11195g1.this.f43119I) {
                        a.mo35100a("Channel is forcefully shutdown", (Throwable) null);
                    }
                }
                C11195g1.this.f43123M.mo35178c(C11195g1.f43105p0);
            }
        }

        /* renamed from: io.grpc.internal.g1$v$d */
        /* compiled from: ManagedChannelImpl */
        class C11228d implements Runnable {
            C11228d() {
            }

            public void run() {
                C11195g1.this.mo35076D0();
            }
        }

        /* renamed from: io.grpc.internal.g1$v$e */
        /* compiled from: ManagedChannelImpl */
        class C11229e extends C12319g<ReqT, RespT> {
            C11229e() {
            }

            /* renamed from: a */
            public void mo35100a(String str, Throwable th) {
            }

            /* renamed from: b */
            public void mo33082b() {
            }

            /* renamed from: c */
            public void mo35101c(int i) {
            }

            /* renamed from: d */
            public void mo35102d(ReqT reqt) {
            }

            /* renamed from: e */
            public void mo35103e(C12319g.C12320a<RespT> aVar, C12411y0 y0Var) {
                aVar.mo33078a(C11195g1.f43106q0, new C12411y0());
            }
        }

        /* renamed from: io.grpc.internal.g1$v$f */
        /* compiled from: ManagedChannelImpl */
        class C11230f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11231g f43239a;

            C11230f(C11231g gVar) {
                this.f43239a = gVar;
            }

            public void run() {
                if (C11224v.this.f43230a.get() == C11195g1.f43109t0) {
                    if (C11195g1.this.f43119I == null) {
                        Collection unused = C11195g1.this.f43119I = new LinkedHashSet();
                        C11195g1 g1Var = C11195g1.this;
                        g1Var.f43154i0.mo35377e(g1Var.f43120J, true);
                    }
                    C11195g1.this.f43119I.add(this.f43239a);
                    return;
                }
                this.f43239a.mo35143q();
            }
        }

        /* renamed from: io.grpc.internal.g1$v$g */
        /* compiled from: ManagedChannelImpl */
        private final class C11231g<ReqT, RespT> extends C11416z<ReqT, RespT> {

            /* renamed from: l */
            final C12372r f43241l;

            /* renamed from: m */
            final C12423z0<ReqT, RespT> f43242m;

            /* renamed from: n */
            final C12292c f43243n;

            /* renamed from: io.grpc.internal.g1$v$g$a */
            /* compiled from: ManagedChannelImpl */
            class C11232a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Runnable f43245a;

                C11232a(Runnable runnable) {
                    this.f43245a = runnable;
                }

                public void run() {
                    this.f43245a.run();
                    C11231g gVar = C11231g.this;
                    C11195g1.this.f43168s.execute(new C11233b());
                }
            }

            /* renamed from: io.grpc.internal.g1$v$g$b */
            /* compiled from: ManagedChannelImpl */
            final class C11233b implements Runnable {
                C11233b() {
                }

                public void run() {
                    if (C11195g1.this.f43119I != null) {
                        C11195g1.this.f43119I.remove(C11231g.this);
                        if (C11195g1.this.f43119I.isEmpty()) {
                            C11195g1 g1Var = C11195g1.this;
                            g1Var.f43154i0.mo35377e(g1Var.f43120J, false);
                            Collection unused = C11195g1.this.f43119I = null;
                            if (C11195g1.this.f43124N.get()) {
                                C11195g1.this.f43123M.mo35177b(C11195g1.f43106q0);
                            }
                        }
                    }
                }
            }

            C11231g(C12372r rVar, C12423z0<ReqT, RespT> z0Var, C12292c cVar) {
                super(C11195g1.this.m55308E0(cVar), C11195g1.this.f43157k, cVar.mo36959d());
                this.f43241l = rVar;
                this.f43242m = z0Var;
                this.f43243n = cVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: j */
            public void mo35142j() {
                super.mo35142j();
                C11195g1.this.f43168s.execute(new C11233b());
            }

            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: package-private */
            /* renamed from: q */
            public void mo35143q() {
                C12372r b = this.f43241l.mo37086b();
                try {
                    C12319g k = C11224v.this.m55435l(this.f43242m, this.f43243n);
                    this.f43241l.mo37088f(b);
                    Runnable o = mo35419o(k);
                    if (o == null) {
                        C11195g1.this.f43168s.execute(new C11233b());
                    } else {
                        C11195g1.this.m55308E0(this.f43243n).execute(new C11232a(o));
                    }
                } catch (Throwable th) {
                    this.f43241l.mo37088f(b);
                    throw th;
                }
            }
        }

        /* synthetic */ C11224v(C11195g1 g1Var, String str, C11196a aVar) {
            this(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public <ReqT, RespT> C12319g<ReqT, RespT> m55435l(C12423z0<ReqT, RespT> z0Var, C12292c cVar) {
            C12314f0 f0Var = this.f43230a.get();
            if (f0Var == null) {
                return this.f43232c.mo35081e(z0Var, cVar);
            }
            if (!(f0Var instanceof C11264j1.C11267c)) {
                return new C11211n(f0Var, this.f43232c, C11195g1.this.f43159l, z0Var, cVar);
            }
            C11264j1.C11266b f = ((C11264j1.C11267c) f0Var).f43354b.mo35223f(z0Var);
            if (f != null) {
                cVar = cVar.mo36971p(C11264j1.C11266b.f43347g, f);
            }
            return this.f43232c.mo35081e(z0Var, cVar);
        }

        /* renamed from: a */
        public String mo35080a() {
            return this.f43231b;
        }

        /* renamed from: e */
        public <ReqT, RespT> C12319g<ReqT, RespT> mo35081e(C12423z0<ReqT, RespT> z0Var, C12292c cVar) {
            if (this.f43230a.get() != C11195g1.f43109t0) {
                return m55435l(z0Var, cVar);
            }
            C11195g1.this.f43168s.execute(new C11228d());
            if (this.f43230a.get() != C11195g1.f43109t0) {
                return m55435l(z0Var, cVar);
            }
            if (C11195g1.this.f43124N.get()) {
                return new C11229e();
            }
            C11231g gVar = new C11231g(C12372r.m59190e(), z0Var, cVar);
            C11195g1.this.f43168s.execute(new C11230f(gVar));
            return gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo35134m() {
            if (this.f43230a.get() == C11195g1.f43109t0) {
                mo35137p((C12314f0) null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo35135n() {
            C11195g1.this.f43168s.execute(new C11226b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo35136o() {
            C11195g1.this.f43168s.execute(new C11227c());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo35137p(C12314f0 f0Var) {
            C12314f0 f0Var2 = this.f43230a.get();
            this.f43230a.set(f0Var);
            if (f0Var2 == C11195g1.f43109t0 && C11195g1.this.f43119I != null) {
                for (C11231g q : C11195g1.this.f43119I) {
                    q.mo35143q();
                }
            }
        }

        private C11224v(String str) {
            this.f43230a = new AtomicReference<>(C11195g1.f43109t0);
            this.f43232c = new C11225a();
            this.f43231b = (String) C6431n.m37562o(str, "authority");
        }
    }

    /* renamed from: io.grpc.internal.g1$w */
    /* compiled from: ManagedChannelImpl */
    enum C11234w {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* renamed from: io.grpc.internal.g1$x */
    /* compiled from: ManagedChannelImpl */
    private static final class C11235x implements ScheduledExecutorService {

        /* renamed from: a */
        final ScheduledExecutorService f43252a;

        /* synthetic */ C11235x(ScheduledExecutorService scheduledExecutorService, C11196a aVar) {
            this(scheduledExecutorService);
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f43252a.awaitTermination(j, timeUnit);
        }

        public void execute(Runnable runnable) {
            this.f43252a.execute(runnable);
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f43252a.invokeAll(collection);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            return this.f43252a.invokeAny(collection);
        }

        public boolean isShutdown() {
            return this.f43252a.isShutdown();
        }

        public boolean isTerminated() {
            return this.f43252a.isTerminated();
        }

        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f43252a.schedule(callable, j, timeUnit);
        }

        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f43252a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f43252a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        public <T> Future<T> submit(Callable<T> callable) {
            return this.f43252a.submit(callable);
        }

        private C11235x(ScheduledExecutorService scheduledExecutorService) {
            this.f43252a = (ScheduledExecutorService) C6431n.m37562o(scheduledExecutorService, "delegate");
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f43252a.invokeAll(collection, j, timeUnit);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f43252a.invokeAny(collection, j, timeUnit);
        }

        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f43252a.schedule(runnable, j, timeUnit);
        }

        public Future<?> submit(Runnable runnable) {
            return this.f43252a.submit(runnable);
        }

        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f43252a.submit(runnable, t);
        }
    }

    /* renamed from: io.grpc.internal.g1$y */
    /* compiled from: ManagedChannelImpl */
    private final class C11236y extends C11165e {

        /* renamed from: a */
        final C12376r0.C12378b f43253a;

        /* renamed from: b */
        final C11218t f43254b;

        /* renamed from: c */
        final C12334j0 f43255c;

        /* renamed from: d */
        final C11299n f43256d;

        /* renamed from: e */
        final C11305o f43257e;

        /* renamed from: f */
        List<C12406x> f43258f;

        /* renamed from: g */
        C11392y0 f43259g;

        /* renamed from: h */
        boolean f43260h;

        /* renamed from: i */
        boolean f43261i;

        /* renamed from: j */
        C12359n1.C12363d f43262j;

        /* renamed from: io.grpc.internal.g1$y$a */
        /* compiled from: ManagedChannelImpl */
        final class C11237a extends C11392y0.C11405j {

            /* renamed from: a */
            final /* synthetic */ C12376r0.C12388j f43264a;

            C11237a(C12376r0.C12388j jVar) {
                this.f43264a = jVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo35171a(C11392y0 y0Var) {
                C11195g1.this.f43154i0.mo35377e(y0Var, true);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo35172b(C11392y0 y0Var) {
                C11195g1.this.f43154i0.mo35377e(y0Var, false);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo35173c(C11392y0 y0Var, C12370q qVar) {
                C6431n.m37568u(this.f43264a != null, "listener is null");
                this.f43264a.mo35316a(qVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo35174d(C11392y0 y0Var) {
                C11195g1.this.f43118H.remove(y0Var);
                C11195g1.this.f43133W.mo37000k(y0Var);
                C11195g1.this.m55316I0();
            }
        }

        /* renamed from: io.grpc.internal.g1$y$b */
        /* compiled from: ManagedChannelImpl */
        final class C11238b implements Runnable {
            C11238b() {
            }

            public void run() {
                C11236y.this.f43259g.mo35394g(C11195g1.f43107r0);
            }
        }

        C11236y(C12376r0.C12378b bVar, C11218t tVar) {
            this.f43258f = bVar.mo37094a();
            if (C11195g1.this.f43141c != null) {
                bVar = bVar.mo37096d().mo37099d(m55451i(bVar.mo37094a())).mo37098b();
            }
            this.f43253a = (C12376r0.C12378b) C6431n.m37562o(bVar, "args");
            this.f43254b = (C11218t) C6431n.m37562o(tVar, "helper");
            C12334j0 b = C12334j0.m59093b("Subchannel", C11195g1.this.mo35080a());
            this.f43255c = b;
            int d0 = C11195g1.this.f43167r;
            long a = C11195g1.this.f43166q.mo35246a();
            C11305o oVar = new C11305o(b, d0, a, "Subchannel for " + bVar.mo37094a());
            this.f43257e = oVar;
            this.f43256d = new C11299n(oVar, C11195g1.this.f43166q);
        }

        /* renamed from: i */
        private List<C12406x> m55451i(List<C12406x> list) {
            ArrayList arrayList = new ArrayList();
            for (C12406x next : list) {
                arrayList.add(new C12406x(next.mo37149a(), next.mo37150b().mo36916d().mo36921c(C12406x.f45750d).mo36920a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        /* renamed from: b */
        public List<C12406x> mo35163b() {
            C11195g1.this.f43168s.mo37068f();
            C6431n.m37568u(this.f43260h, "not started");
            return this.f43258f;
        }

        /* renamed from: c */
        public C12271a mo35164c() {
            return this.f43253a.mo37095b();
        }

        /* renamed from: d */
        public Object mo35165d() {
            C6431n.m37568u(this.f43260h, "Subchannel is not started");
            return this.f43259g;
        }

        /* renamed from: e */
        public void mo35166e() {
            C11195g1.this.f43168s.mo37068f();
            C6431n.m37568u(this.f43260h, "not started");
            this.f43259g.mo35262a();
        }

        /* renamed from: f */
        public void mo35167f() {
            C12359n1.C12363d dVar;
            C11195g1.this.f43168s.mo37068f();
            if (this.f43259g == null) {
                this.f43261i = true;
                return;
            }
            if (!this.f43261i) {
                this.f43261i = true;
            } else if (C11195g1.this.f43126P && (dVar = this.f43262j) != null) {
                dVar.mo37074a();
                this.f43262j = null;
            } else {
                return;
            }
            if (!C11195g1.this.f43126P) {
                this.f43262j = C11195g1.this.f43168s.mo37065d(new C11159d1(new C11238b()), 5, TimeUnit.SECONDS, C11195g1.this.f43153i.mo35235n1());
            } else {
                this.f43259g.mo35394g(C11195g1.f43106q0);
            }
        }

        /* renamed from: g */
        public void mo35168g(C12376r0.C12388j jVar) {
            C11195g1.this.f43168s.mo37068f();
            C6431n.m37568u(!this.f43260h, "already started");
            C6431n.m37568u(!this.f43261i, "already shutdown");
            C6431n.m37568u(!C11195g1.this.f43126P, "Channel is being terminated");
            this.f43260h = true;
            List<C12406x> a = this.f43253a.mo37094a();
            String a2 = C11195g1.this.mo35080a();
            String h0 = C11195g1.this.f43112B;
            C11269k.C11270a i0 = C11195g1.this.f43175z;
            C11358t C = C11195g1.this.f43153i;
            ScheduledExecutorService n1 = C11195g1.this.f43153i.mo35235n1();
            C6444t j0 = C11195g1.this.f43172w;
            C12359n1 n1Var = C11195g1.this.f43168s;
            C11237a aVar = new C11237a(jVar);
            C12302d0 f0 = C11195g1.this.f43133W;
            C11289m a3 = C11195g1.this.f43129S.mo35091a();
            C11305o oVar = this.f43257e;
            C11392y0 y0Var = new C11392y0(a, a2, h0, i0, C, n1, j0, n1Var, aVar, f0, a3, oVar, this.f43255c, this.f43256d);
            C11195g1.this.f43131U.mo35265e(new C12308e0.C12309a().mo37006b("Child Subchannel started").mo37007c(C12308e0.C12310b.CT_INFO).mo37009e(C11195g1.this.f43166q.mo35246a()).mo37008d(y0Var).mo37005a());
            this.f43259g = y0Var;
            C11195g1.this.f43133W.mo36997e(y0Var);
            C11195g1.this.f43118H.add(y0Var);
        }

        /* renamed from: h */
        public void mo35169h(List<C12406x> list) {
            C11195g1.this.f43168s.mo37068f();
            this.f43258f = list;
            if (C11195g1.this.f43141c != null) {
                list = m55451i(list);
            }
            this.f43259g.mo35392U(list);
        }

        public String toString() {
            return this.f43255c.toString();
        }
    }

    static {
        C12335j1 j1Var = C12335j1.f45621u;
        f43105p0 = j1Var.mo37030q("Channel shutdownNow invoked");
        f43106q0 = j1Var.mo37030q("Channel shutdown invoked");
        f43107r0 = j1Var.mo37030q("Subchannel shutdown invoked");
    }

    C11195g1(C11245h1 h1Var, C11358t tVar, C11269k.C11270a aVar, C11327p1<? extends Executor> p1Var, C6444t<C6441r> tVar2, List<C12323h> list, C11287l2 l2Var) {
        C11196a aVar2;
        C11245h1 h1Var2 = h1Var;
        C11358t tVar3 = tVar;
        C11327p1<? extends Executor> p1Var2 = p1Var;
        C11287l2 l2Var2 = l2Var;
        C12359n1 n1Var = new C12359n1(new C11205j());
        this.f43168s = n1Var;
        C11214p pVar = new C11214p(this, (C11196a) null);
        this.f43152h0 = pVar;
        this.f43154i0 = new C11216r(this, (C11196a) null);
        this.f43160l0 = new C11208m(this, (C11196a) null);
        String str = (String) C6431n.m37562o(h1Var2.f43296f, "target");
        this.f43139b = str;
        C12334j0 b = C12334j0.m59093b("Channel", str);
        this.f43137a = b;
        this.f43166q = (C11287l2) C6431n.m37562o(l2Var2, "timeProvider");
        C11327p1<? extends Executor> p1Var3 = (C11327p1) C6431n.m37562o(h1Var2.f43291a, "executorPool");
        this.f43161m = p1Var3;
        Executor executor = (Executor) C6431n.m37562o((Executor) p1Var3.mo35180a(), "executor");
        this.f43159l = executor;
        this.f43151h = tVar3;
        C11215q qVar = new C11215q((C11327p1) C6431n.m37562o(h1Var2.f43292b, "offloadExecutorPool"));
        this.f43165p = qVar;
        C11276l lVar = new C11276l(tVar3, h1Var2.f43297g, qVar);
        this.f43153i = lVar;
        this.f43155j = new C11276l(tVar3, (C12287b) null, qVar);
        C11235x xVar = new C11235x(lVar.mo35235n1(), (C11196a) null);
        this.f43157k = xVar;
        this.f43167r = h1Var2.f43312v;
        int i = h1Var2.f43312v;
        long a = l2Var.mo35246a();
        C11305o oVar = r12;
        C11276l lVar2 = lVar;
        int i2 = i;
        C11215q qVar2 = qVar;
        C11305o oVar2 = new C11305o(b, i2, a, "Channel for '" + str + "'");
        this.f43131U = oVar;
        C11299n nVar = new C11299n(oVar, l2Var2);
        this.f43132V = nVar;
        C12322g1 g1Var = h1Var2.f43315y;
        g1Var = g1Var == null ? C11335r0.f43543q : g1Var;
        boolean z = h1Var2.f43310t;
        this.f43150g0 = z;
        C11256j jVar = new C11256j(h1Var2.f43301k);
        this.f43149g = jVar;
        this.f43143d = h1Var2.f43294d;
        C11136b2 b2Var = new C11136b2(z, h1Var2.f43306p, h1Var2.f43307q, jVar);
        String str2 = h1Var2.f43300j;
        this.f43141c = str2;
        C12276a1.C12278b a2 = C12276a1.C12278b.m58948f().mo36932c(h1Var.mo35185e()).mo36935f(g1Var).mo36938i(n1Var).mo36936g(xVar).mo36937h(b2Var).mo36931b(nVar).mo36933d(qVar2).mo36934e(str2).mo36930a();
        this.f43147f = a2;
        C12276a1.C12281d dVar = h1Var2.f43295e;
        this.f43145e = dVar;
        this.f43113C = m55310F0(str, str2, dVar, a2);
        this.f43163n = (C11327p1) C6431n.m37562o(p1Var2, "balancerRpcExecutorPool");
        this.f43164o = new C11215q(p1Var2);
        C11105a0 a0Var = new C11105a0(executor, n1Var);
        this.f43122L = a0Var;
        a0Var.mo34933c(pVar);
        this.f43175z = aVar;
        Map<String, ?> map = h1Var2.f43313w;
        if (map != null) {
            C12276a1.C12280c a3 = b2Var.mo34981a(map);
            C6431n.m37570w(a3.mo36940d() == null, "Default config is invalid: %s", a3.mo36940d());
            C11264j1 j1Var = (C11264j1) a3.mo36939c();
            this.f43138a0 = j1Var;
            this.f43136Z = j1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f43138a0 = null;
        }
        boolean z2 = h1Var2.f43314x;
        this.f43142c0 = z2;
        C11224v vVar = new C11224v(this, this.f43113C.mo34988a(), aVar2);
        this.f43134X = vVar;
        this.f43111A = C12331j.m59084a(vVar, list);
        this.f43172w = (C6444t) C6431n.m37562o(tVar2, "stopwatchSupplier");
        long j = h1Var2.f43305o;
        if (j == -1) {
            this.f43173x = j;
        } else {
            C6431n.m37556i(j >= C11245h1.f43280J, "invalid idleTimeoutMillis %s", j);
            this.f43173x = h1Var2.f43305o;
        }
        this.f43162m0 = new C11412y1(new C11217s(this, (C11196a) null), n1Var, lVar2.mo35235n1(), tVar2.get());
        this.f43169t = h1Var2.f43302l;
        this.f43170u = (C12400v) C6431n.m37562o(h1Var2.f43303m, "decompressorRegistry");
        this.f43171v = (C12364o) C6431n.m37562o(h1Var2.f43304n, "compressorRegistry");
        this.f43112B = h1Var2.f43299i;
        this.f43148f0 = h1Var2.f43308r;
        this.f43146e0 = h1Var2.f43309s;
        C11198c cVar = new C11198c(l2Var);
        this.f43129S = cVar;
        this.f43130T = cVar.mo35091a();
        C12302d0 d0Var = (C12302d0) C6431n.m37561n(h1Var2.f43311u);
        this.f43133W = d0Var;
        d0Var.mo36996d(this);
        if (!z2) {
            if (this.f43138a0 != null) {
                nVar.mo35255a(C12312f.C12313a.INFO, "Service config look-up disabled, using default service config");
            }
            this.f43140b0 = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m55301A0(boolean z) {
        this.f43162m0.mo35415i(z);
    }

    /* renamed from: B0 */
    private void m55303B0() {
        this.f43168s.mo37068f();
        C12359n1.C12363d dVar = this.f43156j0;
        if (dVar != null) {
            dVar.mo37074a();
            this.f43156j0 = null;
            this.f43158k0 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m55305C0() {
        m55326O0(true);
        this.f43122L.mo34939r((C12376r0.C12387i) null);
        this.f43132V.mo35255a(C12312f.C12313a.INFO, "Entering IDLE state");
        this.f43174y.mo35372b(C12367p.IDLE);
        if (this.f43154i0.mo35375a(this.f43120J, this.f43122L)) {
            mo35076D0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public Executor m55308E0(C12292c cVar) {
        Executor e = cVar.mo36960e();
        return e == null ? this.f43159l : e;
    }

    /* renamed from: F0 */
    static C12276a1 m55310F0(String str, String str2, C12276a1.C12281d dVar, C12276a1.C12278b bVar) {
        C12276a1 G0 = m55312G0(str, dVar, bVar);
        if (str2 == null) {
            return G0;
        }
        return new C11206k(G0, str2);
    }

    /* renamed from: G0 */
    private static C12276a1 m55312G0(String str, C12276a1.C12281d dVar, C12276a1.C12278b bVar) {
        URI uri;
        C12276a1 b;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null && (b = dVar.mo35027b(uri, bVar)) != null) {
            return b;
        }
        String str2 = "";
        if (!f43104o0.matcher(str).matches()) {
            try {
                C12276a1 b2 = dVar.mo35027b(new URI(dVar.mo35026a(), str2, "/" + str, (String) null), bVar);
                if (b2 != null) {
                    return b2;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            str2 = " (" + sb + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public void m55314H0() {
        if (this.f43125O) {
            for (C11392y0 d : this.f43118H) {
                d.mo35393d(f43105p0);
            }
            for (C11331q1 o : this.f43121K) {
                o.mo35295o().mo35393d(f43105p0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m55316I0() {
        if (!this.f43127Q && this.f43124N.get() && this.f43118H.isEmpty() && this.f43121K.isEmpty()) {
            this.f43132V.mo35255a(C12312f.C12313a.INFO, "Terminated");
            this.f43133W.mo36999j(this);
            this.f43161m.mo35181b(this.f43159l);
            this.f43164o.mo35116c();
            this.f43165p.mo35116c();
            this.f43153i.close();
            this.f43127Q = true;
            this.f43128R.countDown();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m55319K0() {
        this.f43168s.mo37068f();
        m55303B0();
        m55321L0();
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public void m55321L0() {
        this.f43168s.mo37068f();
        if (this.f43114D) {
            this.f43113C.mo34989b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void m55323M0() {
        long j = this.f43173x;
        if (j != -1) {
            this.f43162m0.mo35416k(j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public void m55326O0(boolean z) {
        this.f43168s.mo37068f();
        if (z) {
            C6431n.m37568u(this.f43114D, "nameResolver is not started");
            C6431n.m37568u(this.f43115E != null, "lbHelper is null");
        }
        if (this.f43113C != null) {
            m55303B0();
            this.f43113C.mo34990c();
            this.f43114D = false;
            if (z) {
                this.f43113C = m55310F0(this.f43139b, this.f43141c, this.f43145e, this.f43147f);
            } else {
                this.f43113C = null;
            }
        }
        C11218t tVar = this.f43115E;
        if (tVar != null) {
            tVar.f43217a.mo35210d();
            this.f43115E = null;
        }
        this.f43116F = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m55329Q0(C12376r0.C12387i iVar) {
        this.f43116F = iVar;
        this.f43122L.mo34939r(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo35076D0() {
        this.f43168s.mo37068f();
        if (!this.f43124N.get() && !this.f43117G) {
            if (this.f43154i0.mo35376d()) {
                m55301A0(false);
            } else {
                m55323M0();
            }
            if (this.f43115E == null) {
                this.f43132V.mo35255a(C12312f.C12313a.INFO, "Exiting idle mode");
                C11218t tVar = new C11218t(this, (C11196a) null);
                tVar.f43217a = this.f43149g.mo35205e(tVar);
                this.f43115E = tVar;
                this.f43113C.mo34991d(new C11221u(tVar, this.f43113C));
                this.f43114D = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo35077J0(Throwable th) {
        if (!this.f43117G) {
            this.f43117G = true;
            m55301A0(true);
            m55326O0(false);
            m55329Q0(new C11200e(th));
            this.f43134X.mo35137p((C12314f0) null);
            this.f43132V.mo35255a(C12312f.C12313a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            this.f43174y.mo35372b(C12367p.TRANSIENT_FAILURE);
        }
    }

    /* renamed from: N0 */
    public C11195g1 mo35086m() {
        this.f43132V.mo35255a(C12312f.C12313a.DEBUG, "shutdown() called");
        if (!this.f43124N.compareAndSet(false, true)) {
            return this;
        }
        this.f43168s.execute(new C11203h());
        this.f43134X.mo35135n();
        this.f43168s.execute(new C11197b());
        return this;
    }

    /* renamed from: P0 */
    public C11195g1 mo35087n() {
        this.f43132V.mo35255a(C12312f.C12313a.DEBUG, "shutdownNow() called");
        mo35086m();
        this.f43134X.mo35136o();
        this.f43168s.execute(new C11204i());
        return this;
    }

    /* renamed from: a */
    public String mo35080a() {
        return this.f43111A.mo35080a();
    }

    /* renamed from: e */
    public <ReqT, RespT> C12319g<ReqT, RespT> mo35081e(C12423z0<ReqT, RespT> z0Var, C12292c cVar) {
        return this.f43111A.mo35081e(z0Var, cVar);
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        return this.f43137a;
    }

    /* renamed from: i */
    public boolean mo35082i(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f43128R.await(j, timeUnit);
    }

    /* renamed from: j */
    public void mo35083j() {
        this.f43168s.execute(new C11201f());
    }

    /* renamed from: k */
    public C12367p mo35084k(boolean z) {
        C12367p a = this.f43174y.mo35371a();
        if (z && a == C12367p.IDLE) {
            this.f43168s.execute(new C11202g());
        }
        return a;
    }

    /* renamed from: l */
    public void mo35085l(C12367p pVar, Runnable runnable) {
        this.f43168s.execute(new C11199d(runnable, pVar));
    }

    public String toString() {
        return C6419h.m37528c(this).mo21841c("logId", this.f43137a.mo37017d()).mo21842d("target", this.f43139b).toString();
    }

    /* renamed from: io.grpc.internal.g1$z */
    /* compiled from: ManagedChannelImpl */
    private final class C11239z {

        /* renamed from: a */
        final Object f43267a;

        /* renamed from: b */
        Collection<C11329q> f43268b;

        /* renamed from: c */
        C12335j1 f43269c;

        private C11239z() {
            this.f43267a = new Object();
            this.f43268b = new HashSet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12335j1 mo35176a(C11436z1<?> z1Var) {
            synchronized (this.f43267a) {
                C12335j1 j1Var = this.f43269c;
                if (j1Var != null) {
                    return j1Var;
                }
                this.f43268b.add(z1Var);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            p264io.grpc.internal.C11195g1.m55365u(r2.f43270d).mo34936g(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35177b(p343rc.C12335j1 r3) {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f43267a
                monitor-enter(r0)
                rc.j1 r1 = r2.f43269c     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                return
            L_0x0009:
                r2.f43269c = r3     // Catch:{ all -> 0x001e }
                java.util.Collection<io.grpc.internal.q> r1 = r2.f43268b     // Catch:{ all -> 0x001e }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001d
                io.grpc.internal.g1 r0 = p264io.grpc.internal.C11195g1.this
                io.grpc.internal.a0 r0 = r0.f43122L
                r0.mo34936g(r3)
            L_0x001d:
                return
            L_0x001e:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11195g1.C11239z.mo35177b(rc.j1):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35178c(C12335j1 j1Var) {
            ArrayList<C11329q> arrayList;
            mo35177b(j1Var);
            synchronized (this.f43267a) {
                arrayList = new ArrayList<>(this.f43268b);
            }
            for (C11329q c : arrayList) {
                c.mo34896c(j1Var);
            }
            C11195g1.this.f43122L.mo34934d(j1Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo35179d(C11436z1<?> z1Var) {
            C12335j1 j1Var;
            synchronized (this.f43267a) {
                this.f43268b.remove(z1Var);
                if (this.f43268b.isEmpty()) {
                    j1Var = this.f43269c;
                    this.f43268b = new HashSet();
                } else {
                    j1Var = null;
                }
            }
            if (j1Var != null) {
                C11195g1.this.f43122L.mo34936g(j1Var);
            }
        }

        /* synthetic */ C11239z(C11195g1 g1Var, C11196a aVar) {
            this();
        }
    }
}
