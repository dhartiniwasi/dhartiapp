package p264io.grpc.internal;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6419h;
import p182a7.C6431n;
import p187ad.C6573b;
import p187ad.C6574c;
import p187ad.C6575d;
import p228f7.C10140d;
import p264io.grpc.internal.C11264j1;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11333r;
import p343rc.C12292c;
import p343rc.C12314f0;
import p343rc.C12319g;
import p343rc.C12321g0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12346l;
import p343rc.C12357n;
import p343rc.C12364o;
import p343rc.C12372r;
import p343rc.C12389s;
import p343rc.C12392t;
import p343rc.C12400v;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.p */
/* compiled from: ClientCallImpl */
final class C11314p<ReqT, RespT> extends C12319g<ReqT, RespT> {

    /* renamed from: t */
    private static final Logger f43465t = Logger.getLogger(C11314p.class.getName());

    /* renamed from: u */
    private static final byte[] f43466u = "gzip".getBytes(Charset.forName("US-ASCII"));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12423z0<ReqT, RespT> f43467a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6575d f43468b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f43469c;

    /* renamed from: d */
    private final boolean f43470d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11289m f43471e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12372r f43472f;

    /* renamed from: g */
    private volatile ScheduledFuture<?> f43473g;

    /* renamed from: h */
    private final boolean f43474h;

    /* renamed from: i */
    private C12292c f43475i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C11329q f43476j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f43477k;

    /* renamed from: l */
    private boolean f43478l;

    /* renamed from: m */
    private boolean f43479m;

    /* renamed from: n */
    private final C11323e f43480n;

    /* renamed from: o */
    private final C11314p<ReqT, RespT>.f f43481o = new C11324f();

    /* renamed from: p */
    private final ScheduledExecutorService f43482p;

    /* renamed from: q */
    private boolean f43483q;

    /* renamed from: r */
    private C12400v f43484r = C12400v.m59294c();

    /* renamed from: s */
    private C12364o f43485s = C12364o.m59179a();

    /* renamed from: io.grpc.internal.p$b */
    /* compiled from: ClientCallImpl */
    class C11316b extends C11388x {

        /* renamed from: b */
        final /* synthetic */ C12319g.C12320a f43486b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11316b(C12319g.C12320a aVar) {
            super(C11314p.this.f43472f);
            this.f43486b = aVar;
        }

        /* renamed from: a */
        public void mo35109a() {
            C11314p pVar = C11314p.this;
            pVar.m55725r(this.f43486b, C12389s.m59260a(pVar.f43472f), new C12411y0());
        }
    }

    /* renamed from: io.grpc.internal.p$c */
    /* compiled from: ClientCallImpl */
    class C11317c extends C11388x {

        /* renamed from: b */
        final /* synthetic */ C12319g.C12320a f43488b;

        /* renamed from: c */
        final /* synthetic */ String f43489c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11317c(C12319g.C12320a aVar, String str) {
            super(C11314p.this.f43472f);
            this.f43488b = aVar;
            this.f43489c = str;
        }

        /* renamed from: a */
        public void mo35109a() {
            C11314p.this.m55725r(this.f43488b, C12335j1.f45620t.mo37030q(String.format("Unable to find compressor by name %s", new Object[]{this.f43489c})), new C12411y0());
        }
    }

    /* renamed from: io.grpc.internal.p$d */
    /* compiled from: ClientCallImpl */
    private class C11318d implements C11333r {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12319g.C12320a<RespT> f43491a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C12335j1 f43492b;

        /* renamed from: io.grpc.internal.p$d$a */
        /* compiled from: ClientCallImpl */
        final class C11319a extends C11388x {

            /* renamed from: b */
            final /* synthetic */ C6573b f43494b;

            /* renamed from: c */
            final /* synthetic */ C12411y0 f43495c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11319a(C6573b bVar, C12411y0 y0Var) {
                super(C11314p.this.f43472f);
                this.f43494b = bVar;
                this.f43495c = y0Var;
            }

            /* renamed from: b */
            private void m55752b() {
                if (C11318d.this.f43492b == null) {
                    try {
                        C11318d.this.f43491a.mo33079b(this.f43495c);
                    } catch (Throwable th) {
                        C11318d.this.m55747i(C12335j1.f45607g.mo37029p(th).mo37030q("Failed to read headers"));
                    }
                }
            }

            /* renamed from: a */
            public void mo35109a() {
                C6574c.m38141g("ClientCall$Listener.headersRead", C11314p.this.f43468b);
                C6574c.m38138d(this.f43494b);
                try {
                    m55752b();
                } finally {
                    C6574c.m38143i("ClientCall$Listener.headersRead", C11314p.this.f43468b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$b */
        /* compiled from: ClientCallImpl */
        final class C11320b extends C11388x {

            /* renamed from: b */
            final /* synthetic */ C6573b f43497b;

            /* renamed from: c */
            final /* synthetic */ C11274k2.C11275a f43498c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11320b(C6573b bVar, C11274k2.C11275a aVar) {
                super(C11314p.this.f43472f);
                this.f43497b = bVar;
                this.f43498c = aVar;
            }

            /* renamed from: b */
            private void m55754b() {
                InputStream next;
                if (C11318d.this.f43492b != null) {
                    C11335r0.m55797d(this.f43498c);
                    return;
                }
                while (true) {
                    try {
                        next = this.f43498c.next();
                        if (next != null) {
                            C11318d.this.f43491a.mo33080c(C11314p.this.f43467a.mo37193i(next));
                            next.close();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C11335r0.m55797d(this.f43498c);
                        C11318d.this.m55747i(C12335j1.f45607g.mo37029p(th).mo37030q("Failed to read message."));
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo35109a() {
                C6574c.m38141g("ClientCall$Listener.messagesAvailable", C11314p.this.f43468b);
                C6574c.m38138d(this.f43497b);
                try {
                    m55754b();
                } finally {
                    C6574c.m38143i("ClientCall$Listener.messagesAvailable", C11314p.this.f43468b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$c */
        /* compiled from: ClientCallImpl */
        final class C11321c extends C11388x {

            /* renamed from: b */
            final /* synthetic */ C6573b f43500b;

            /* renamed from: c */
            final /* synthetic */ C12335j1 f43501c;

            /* renamed from: d */
            final /* synthetic */ C12411y0 f43502d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11321c(C6573b bVar, C12335j1 j1Var, C12411y0 y0Var) {
                super(C11314p.this.f43472f);
                this.f43500b = bVar;
                this.f43501c = j1Var;
                this.f43502d = y0Var;
            }

            /* renamed from: b */
            private void m55756b() {
                C12335j1 j1Var = this.f43501c;
                C12411y0 y0Var = this.f43502d;
                if (C11318d.this.f43492b != null) {
                    j1Var = C11318d.this.f43492b;
                    y0Var = new C12411y0();
                }
                boolean unused = C11314p.this.f43477k = true;
                try {
                    C11318d dVar = C11318d.this;
                    C11314p.this.m55725r(dVar.f43491a, j1Var, y0Var);
                } finally {
                    C11314p.this.m55731x();
                    C11314p.this.f43471e.mo35247a(j1Var.mo37028o());
                }
            }

            /* renamed from: a */
            public void mo35109a() {
                C6574c.m38141g("ClientCall$Listener.onClose", C11314p.this.f43468b);
                C6574c.m38138d(this.f43500b);
                try {
                    m55756b();
                } finally {
                    C6574c.m38143i("ClientCall$Listener.onClose", C11314p.this.f43468b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d */
        /* compiled from: ClientCallImpl */
        final class C11322d extends C11388x {

            /* renamed from: b */
            final /* synthetic */ C6573b f43504b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11322d(C6573b bVar) {
                super(C11314p.this.f43472f);
                this.f43504b = bVar;
            }

            /* renamed from: b */
            private void m55758b() {
                if (C11318d.this.f43492b == null) {
                    try {
                        C11318d.this.f43491a.mo33081d();
                    } catch (Throwable th) {
                        C11318d.this.m55747i(C12335j1.f45607g.mo37029p(th).mo37030q("Failed to call onReady."));
                    }
                }
            }

            /* renamed from: a */
            public void mo35109a() {
                C6574c.m38141g("ClientCall$Listener.onReady", C11314p.this.f43468b);
                C6574c.m38138d(this.f43504b);
                try {
                    m55758b();
                } finally {
                    C6574c.m38143i("ClientCall$Listener.onReady", C11314p.this.f43468b);
                }
            }
        }

        public C11318d(C12319g.C12320a<RespT> aVar) {
            this.f43491a = (C12319g.C12320a) C6431n.m37562o(aVar, "observer");
        }

        /* renamed from: h */
        private void m55746h(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
            C12392t g = C11314p.this.m55726s();
            if (j1Var.mo37026m() == C12335j1.C12337b.CANCELLED && g != null && g.mo37131o()) {
                C11389x0 x0Var = new C11389x0();
                C11314p.this.f43476j.mo34899h(x0Var);
                C12335j1 j1Var2 = C12335j1.f45610j;
                j1Var = j1Var2.mo37022e("ClientCall was cancelled at or after deadline. " + x0Var);
                y0Var = new C12411y0();
            }
            C11314p.this.f43469c.execute(new C11321c(C6574c.m38139e(), j1Var, y0Var));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public void m55747i(C12335j1 j1Var) {
            this.f43492b = j1Var;
            C11314p.this.f43476j.mo34896c(j1Var);
        }

        /* renamed from: a */
        public void mo34972a(C11274k2.C11275a aVar) {
            C6574c.m38141g("ClientStreamListener.messagesAvailable", C11314p.this.f43468b);
            try {
                C11314p.this.f43469c.execute(new C11320b(C6574c.m38139e(), aVar));
            } finally {
                C6574c.m38143i("ClientStreamListener.messagesAvailable", C11314p.this.f43468b);
            }
        }

        /* renamed from: b */
        public void mo34973b(C12411y0 y0Var) {
            C6574c.m38141g("ClientStreamListener.headersRead", C11314p.this.f43468b);
            try {
                C11314p.this.f43469c.execute(new C11319a(C6574c.m38139e(), y0Var));
            } finally {
                C6574c.m38143i("ClientStreamListener.headersRead", C11314p.this.f43468b);
            }
        }

        /* renamed from: c */
        public void mo34974c() {
            if (!C11314p.this.f43467a.mo37191e().mo37204a()) {
                C6574c.m38141g("ClientStreamListener.onReady", C11314p.this.f43468b);
                try {
                    C11314p.this.f43469c.execute(new C11322d(C6574c.m38139e()));
                } finally {
                    C6574c.m38143i("ClientStreamListener.onReady", C11314p.this.f43468b);
                }
            }
        }

        /* renamed from: d */
        public void mo34975d(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
            C6574c.m38141g("ClientStreamListener.closed", C11314p.this.f43468b);
            try {
                m55746h(j1Var, aVar, y0Var);
            } finally {
                C6574c.m38143i("ClientStreamListener.closed", C11314p.this.f43468b);
            }
        }
    }

    /* renamed from: io.grpc.internal.p$e */
    /* compiled from: ClientCallImpl */
    interface C11323e {
        /* renamed from: a */
        C11329q mo35104a(C12423z0<?, ?> z0Var, C12292c cVar, C12411y0 y0Var, C12372r rVar);
    }

    /* renamed from: io.grpc.internal.p$f */
    /* compiled from: ClientCallImpl */
    private final class C11324f implements C12372r.C12373a {
        private C11324f() {
        }
    }

    /* renamed from: io.grpc.internal.p$g */
    /* compiled from: ClientCallImpl */
    private class C11325g implements Runnable {

        /* renamed from: a */
        private final long f43507a;

        C11325g(long j) {
            this.f43507a = j;
        }

        public void run() {
            C11389x0 x0Var = new C11389x0();
            C11314p.this.f43476j.mo34899h(x0Var);
            long abs = Math.abs(this.f43507a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1);
            long abs2 = Math.abs(this.f43507a) % timeUnit.toNanos(1);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f43507a < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
            sb.append("s. ");
            sb.append(x0Var);
            C11314p.this.f43476j.mo34896c(C12335j1.f45610j.mo37022e(sb.toString()));
        }
    }

    C11314p(C12423z0<ReqT, RespT> z0Var, Executor executor, C12292c cVar, C11323e eVar, ScheduledExecutorService scheduledExecutorService, C11289m mVar, C12314f0 f0Var) {
        this.f43467a = z0Var;
        C6575d b = C6574c.m38136b(z0Var.mo37189c(), (long) System.identityHashCode(this));
        this.f43468b = b;
        boolean z = true;
        if (executor == C10140d.m51467a()) {
            this.f43469c = new C11154c2();
            this.f43470d = true;
        } else {
            this.f43469c = new C11160d2(executor);
            this.f43470d = false;
        }
        this.f43471e = mVar;
        this.f43472f = C12372r.m59190e();
        if (!(z0Var.mo37191e() == C12423z0.C12427d.UNARY || z0Var.mo37191e() == C12423z0.C12427d.SERVER_STREAMING)) {
            z = false;
        }
        this.f43474h = z;
        this.f43475i = cVar;
        this.f43480n = eVar;
        this.f43482p = scheduledExecutorService;
        C6574c.m38137c("ClientCall.<init>", b);
    }

    /* renamed from: C */
    private ScheduledFuture<?> m55711C(C12392t tVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long q = tVar.mo37133q(timeUnit);
        return this.f43482p.schedule(new C11159d1(new C11325g(q)), q, timeUnit);
    }

    /* renamed from: D */
    private void m55712D(C12319g.C12320a<RespT> aVar, C12411y0 y0Var) {
        C12357n nVar;
        boolean z = true;
        C6431n.m37568u(this.f43476j == null, "Already started");
        C6431n.m37568u(!this.f43478l, "call was cancelled");
        C6431n.m37562o(aVar, "observer");
        C6431n.m37562o(y0Var, "headers");
        if (this.f43472f.mo37090h()) {
            this.f43476j = C11309o1.f43451a;
            this.f43469c.execute(new C11316b(aVar));
            return;
        }
        m55723p();
        String b = this.f43475i.mo36957b();
        if (b != null) {
            nVar = this.f43485s.mo37076b(b);
            if (nVar == null) {
                this.f43476j = C11309o1.f43451a;
                this.f43469c.execute(new C11317c(aVar, b));
                return;
            }
        } else {
            nVar = C12346l.C12348b.f45659a;
        }
        m55730w(y0Var, this.f43484r, nVar, this.f43483q);
        C12392t s = m55726s();
        if (s == null || !s.mo37131o()) {
            z = false;
        }
        if (!z) {
            m55728u(s, this.f43472f.mo37089g(), this.f43475i.mo36959d());
            this.f43476j = this.f43480n.mo35104a(this.f43467a, this.f43475i, y0Var, this.f43472f);
        } else {
            C12340k[] f = C11335r0.m55799f(this.f43475i, y0Var, 0, false);
            C12335j1 j1Var = C12335j1.f45610j;
            this.f43476j = new C11181f0(j1Var.mo37030q("ClientCall started after deadline exceeded: " + s), f);
        }
        if (this.f43470d) {
            this.f43476j.mo34956n();
        }
        if (this.f43475i.mo36956a() != null) {
            this.f43476j.mo34953f(this.f43475i.mo36956a());
        }
        if (this.f43475i.mo36961f() != null) {
            this.f43476j.mo34895b(this.f43475i.mo36961f().intValue());
        }
        if (this.f43475i.mo36962g() != null) {
            this.f43476j.mo34897d(this.f43475i.mo36962g().intValue());
        }
        if (s != null) {
            this.f43476j.mo34903l(s);
        }
        this.f43476j.mo34952e(nVar);
        boolean z2 = this.f43483q;
        if (z2) {
            this.f43476j.mo34905p(z2);
        }
        this.f43476j.mo34898g(this.f43484r);
        this.f43471e.mo35248b();
        this.f43476j.mo34902k(new C11318d(aVar));
        this.f43472f.mo37085a(this.f43481o, C10140d.m51467a());
        if (!(s == null || s.equals(this.f43472f.mo37089g()) || this.f43482p == null)) {
            this.f43473g = m55711C(s);
        }
        if (this.f43477k) {
            m55731x();
        }
    }

    /* renamed from: p */
    private void m55723p() {
        C11264j1.C11266b bVar = (C11264j1.C11266b) this.f43475i.mo36963h(C11264j1.C11266b.f43347g);
        if (bVar != null) {
            Long l = bVar.f43348a;
            if (l != null) {
                C12392t a = C12392t.m59265a(l.longValue(), TimeUnit.NANOSECONDS);
                C12392t d = this.f43475i.mo36959d();
                if (d == null || a.compareTo(d) < 0) {
                    this.f43475i = this.f43475i.mo36967l(a);
                }
            }
            Boolean bool = bVar.f43349b;
            if (bool != null) {
                this.f43475i = bool.booleanValue() ? this.f43475i.mo36973r() : this.f43475i.mo36974s();
            }
            if (bVar.f43350c != null) {
                Integer f = this.f43475i.mo36961f();
                if (f != null) {
                    this.f43475i = this.f43475i.mo36969n(Math.min(f.intValue(), bVar.f43350c.intValue()));
                } else {
                    this.f43475i = this.f43475i.mo36969n(bVar.f43350c.intValue());
                }
            }
            if (bVar.f43351d != null) {
                Integer g = this.f43475i.mo36962g();
                if (g != null) {
                    this.f43475i = this.f43475i.mo36970o(Math.min(g.intValue(), bVar.f43351d.intValue()));
                } else {
                    this.f43475i = this.f43475i.mo36970o(bVar.f43351d.intValue());
                }
            }
        }
    }

    /* renamed from: q */
    private void m55724q(String str, Throwable th) {
        C12335j1 j1Var;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f43465t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.f43478l) {
            this.f43478l = true;
            try {
                if (this.f43476j != null) {
                    C12335j1 j1Var2 = C12335j1.f45607g;
                    if (str != null) {
                        j1Var = j1Var2.mo37030q(str);
                    } else {
                        j1Var = j1Var2.mo37030q("Call cancelled without message");
                    }
                    if (th != null) {
                        j1Var = j1Var.mo37029p(th);
                    }
                    this.f43476j.mo34896c(j1Var);
                }
            } finally {
                m55731x();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m55725r(C12319g.C12320a<RespT> aVar, C12335j1 j1Var, C12411y0 y0Var) {
        aVar.mo33078a(j1Var, y0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C12392t m55726s() {
        return m55729v(this.f43475i.mo36959d(), this.f43472f.mo37089g());
    }

    /* renamed from: t */
    private void m55727t() {
        C6431n.m37568u(this.f43476j != null, "Not started");
        C6431n.m37568u(!this.f43478l, "call was cancelled");
        C6431n.m37568u(!this.f43479m, "call already half-closed");
        this.f43479m = true;
        this.f43476j.mo34900i();
    }

    /* renamed from: u */
    private static void m55728u(C12392t tVar, C12392t tVar2, C12392t tVar3) {
        Logger logger = f43465t;
        if (logger.isLoggable(Level.FINE) && tVar != null && tVar.equals(tVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long max = Math.max(0, tVar.mo37133q(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(max)}));
            if (tVar3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(tVar3.mo37133q(timeUnit))}));
            }
            logger.fine(sb.toString());
        }
    }

    /* renamed from: v */
    private static C12392t m55729v(C12392t tVar, C12392t tVar2) {
        if (tVar == null) {
            return tVar2;
        }
        return tVar2 == null ? tVar : tVar.mo37132p(tVar2);
    }

    /* renamed from: w */
    static void m55730w(C12411y0 y0Var, C12400v vVar, C12357n nVar, boolean z) {
        y0Var.mo37165e(C11335r0.f43535i);
        C12411y0.C12418g<String> gVar = C11335r0.f43531e;
        y0Var.mo37165e(gVar);
        if (nVar != C12346l.C12348b.f45659a) {
            y0Var.mo37170p(gVar, nVar.mo37049a());
        }
        C12411y0.C12418g<byte[]> gVar2 = C11335r0.f43532f;
        y0Var.mo37165e(gVar2);
        byte[] a = C12321g0.m59073a(vVar);
        if (a.length != 0) {
            y0Var.mo37170p(gVar2, a);
        }
        y0Var.mo37165e(C11335r0.f43533g);
        C12411y0.C12418g<byte[]> gVar3 = C11335r0.f43534h;
        y0Var.mo37165e(gVar3);
        if (z) {
            y0Var.mo37170p(gVar3, f43466u);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m55731x() {
        this.f43472f.mo37091i(this.f43481o);
        ScheduledFuture<?> scheduledFuture = this.f43473g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: y */
    private void m55732y(ReqT reqt) {
        C6431n.m37568u(this.f43476j != null, "Not started");
        C6431n.m37568u(!this.f43478l, "call was cancelled");
        C6431n.m37568u(!this.f43479m, "call was half-closed");
        try {
            C11329q qVar = this.f43476j;
            if (qVar instanceof C11436z1) {
                ((C11436z1) qVar).mo35433j0(reqt);
            } else {
                qVar.mo34955m(this.f43467a.mo37194j(reqt));
            }
            if (!this.f43474h) {
                this.f43476j.flush();
            }
        } catch (RuntimeException e) {
            this.f43476j.mo34896c(C12335j1.f45607g.mo37029p(e).mo37030q("Failed to stream message"));
        } catch (Error e2) {
            this.f43476j.mo34896c(C12335j1.f45607g.mo37030q("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C11314p<ReqT, RespT> mo35284A(C12400v vVar) {
        this.f43484r = vVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C11314p<ReqT, RespT> mo35285B(boolean z) {
        this.f43483q = z;
        return this;
    }

    /* renamed from: a */
    public void mo35100a(String str, Throwable th) {
        C6574c.m38141g("ClientCall.cancel", this.f43468b);
        try {
            m55724q(str, th);
        } finally {
            C6574c.m38143i("ClientCall.cancel", this.f43468b);
        }
    }

    /* renamed from: b */
    public void mo33082b() {
        C6574c.m38141g("ClientCall.halfClose", this.f43468b);
        try {
            m55727t();
        } finally {
            C6574c.m38143i("ClientCall.halfClose", this.f43468b);
        }
    }

    /* renamed from: c */
    public void mo35101c(int i) {
        C6574c.m38141g("ClientCall.request", this.f43468b);
        try {
            boolean z = true;
            C6431n.m37568u(this.f43476j != null, "Not started");
            if (i < 0) {
                z = false;
            }
            C6431n.m37552e(z, "Number requested must be non-negative");
            this.f43476j.mo34951a(i);
        } finally {
            C6574c.m38143i("ClientCall.request", this.f43468b);
        }
    }

    /* renamed from: d */
    public void mo35102d(ReqT reqt) {
        C6574c.m38141g("ClientCall.sendMessage", this.f43468b);
        try {
            m55732y(reqt);
        } finally {
            C6574c.m38143i("ClientCall.sendMessage", this.f43468b);
        }
    }

    /* renamed from: e */
    public void mo35103e(C12319g.C12320a<RespT> aVar, C12411y0 y0Var) {
        C6574c.m38141g("ClientCall.start", this.f43468b);
        try {
            m55712D(aVar, y0Var);
        } finally {
            C6574c.m38143i("ClientCall.start", this.f43468b);
        }
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("method", this.f43467a).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C11314p<ReqT, RespT> mo35287z(C12364o oVar) {
        this.f43485s = oVar;
        return this;
    }
}
