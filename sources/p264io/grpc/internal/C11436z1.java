package p264io.grpc.internal;

import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p182a7.C6425j;
import p182a7.C6431n;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11333r;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12357n;
import p343rc.C12359n1;
import p343rc.C12392t;
import p343rc.C12400v;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.z1 */
/* compiled from: RetriableStream */
abstract class C11436z1<ReqT> implements C11329q {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final C12335j1 f43781A = C12335j1.f45607g.mo37030q("Stream thrown away because RetriableStream committed");
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static Random f43782B = new Random();

    /* renamed from: y */
    static final C12411y0.C12418g<String> f43783y;

    /* renamed from: z */
    static final C12411y0.C12418g<String> f43784z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12423z0<ReqT, ?> f43785a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f43786b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f43787c = new C12359n1(new C11437a());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ScheduledExecutorService f43788d;

    /* renamed from: e */
    private final C12411y0 f43789e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11113a2 f43790f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C11360t0 f43791g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f43792h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f43793i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11468t f43794j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f43795k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f43796l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11451c0 f43797m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C11389x0 f43798n = new C11389x0();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C11475z f43799o = new C11475z(new ArrayList(8), Collections.emptyList(), (Collection<C11449b0>) null, (C11449b0) null, false, false, false, 0);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicBoolean f43800p = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicInteger f43801q = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f43802r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11333r f43803s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C11469u f43804t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C11469u f43805u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f43806v;

    /* renamed from: w */
    private C12335j1 f43807w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f43808x;

    /* renamed from: io.grpc.internal.z1$a */
    /* compiled from: RetriableStream */
    class C11437a implements Thread.UncaughtExceptionHandler {
        C11437a() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            throw C12335j1.m59105k(th).mo37030q("Uncaught exception in the SynchronizationContext. Re-thrown.").mo37021d();
        }
    }

    /* renamed from: io.grpc.internal.z1$a0 */
    /* compiled from: RetriableStream */
    private final class C11438a0 implements C11333r {

        /* renamed from: a */
        final C11449b0 f43810a;

        /* renamed from: io.grpc.internal.z1$a0$a */
        /* compiled from: RetriableStream */
        class C11439a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12411y0 f43812a;

            C11439a(C12411y0 y0Var) {
                this.f43812a = y0Var;
            }

            public void run() {
                C11436z1.this.f43803s.mo34973b(this.f43812a);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$b */
        /* compiled from: RetriableStream */
        class C11440b implements Runnable {

            /* renamed from: io.grpc.internal.z1$a0$b$a */
            /* compiled from: RetriableStream */
            class C11441a implements Runnable {
                C11441a() {
                }

                public void run() {
                    C11438a0 a0Var = C11438a0.this;
                    C11436z1.this.m56143c0(C11436z1.this.m56141a0(a0Var.f43810a.f43838d + 1, false));
                }
            }

            C11440b() {
            }

            public void run() {
                C11436z1.this.f43786b.execute(new C11441a());
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$c */
        /* compiled from: RetriableStream */
        class C11442c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f43816a;

            /* renamed from: b */
            final /* synthetic */ C11333r.C11334a f43817b;

            /* renamed from: c */
            final /* synthetic */ C12411y0 f43818c;

            C11442c(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
                this.f43816a = j1Var;
                this.f43817b = aVar;
                this.f43818c = y0Var;
            }

            public void run() {
                boolean unused = C11436z1.this.f43808x = true;
                C11436z1.this.f43803s.mo34975d(this.f43816a, this.f43817b, this.f43818c);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$d */
        /* compiled from: RetriableStream */
        class C11443d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f43820a;

            /* renamed from: b */
            final /* synthetic */ C11333r.C11334a f43821b;

            /* renamed from: c */
            final /* synthetic */ C12411y0 f43822c;

            C11443d(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
                this.f43820a = j1Var;
                this.f43821b = aVar;
                this.f43822c = y0Var;
            }

            public void run() {
                boolean unused = C11436z1.this.f43808x = true;
                C11436z1.this.f43803s.mo34975d(this.f43820a, this.f43821b, this.f43822c);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$e */
        /* compiled from: RetriableStream */
        class C11444e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11449b0 f43824a;

            C11444e(C11449b0 b0Var) {
                this.f43824a = b0Var;
            }

            public void run() {
                C11436z1.this.m56143c0(this.f43824a);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$f */
        /* compiled from: RetriableStream */
        class C11445f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f43826a;

            /* renamed from: b */
            final /* synthetic */ C11333r.C11334a f43827b;

            /* renamed from: c */
            final /* synthetic */ C12411y0 f43828c;

            C11445f(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
                this.f43826a = j1Var;
                this.f43827b = aVar;
                this.f43828c = y0Var;
            }

            public void run() {
                boolean unused = C11436z1.this.f43808x = true;
                C11436z1.this.f43803s.mo34975d(this.f43826a, this.f43827b, this.f43828c);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$g */
        /* compiled from: RetriableStream */
        class C11446g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11274k2.C11275a f43830a;

            C11446g(C11274k2.C11275a aVar) {
                this.f43830a = aVar;
            }

            public void run() {
                C11436z1.this.f43803s.mo34972a(this.f43830a);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$h */
        /* compiled from: RetriableStream */
        class C11447h implements Runnable {
            C11447h() {
            }

            public void run() {
                if (!C11436z1.this.f43808x) {
                    C11436z1.this.f43803s.mo34974c();
                }
            }
        }

        C11438a0(C11449b0 b0Var) {
            this.f43810a = b0Var;
        }

        /* renamed from: e */
        private Integer m56177e(C12411y0 y0Var) {
            String str = (String) y0Var.mo37166g(C11436z1.f43784z);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: f */
        private C11470v m56178f(C12335j1 j1Var, C12411y0 y0Var) {
            Integer e = m56177e(y0Var);
            boolean z = true;
            boolean z2 = !C11436z1.this.f43791g.f43615c.contains(j1Var.mo37026m());
            boolean z3 = (C11436z1.this.f43797m == null || (z2 && (e == null || e.intValue() >= 0))) ? false : !C11436z1.this.f43797m.mo35448b();
            if (z2 || z3) {
                z = false;
            }
            return new C11470v(z, e);
        }

        /* renamed from: g */
        private C11473x m56179g(C12335j1 j1Var, C12411y0 y0Var) {
            long j = 0;
            boolean z = false;
            if (C11436z1.this.f43790f == null) {
                return new C11473x(false, 0);
            }
            boolean contains = C11436z1.this.f43790f.f42915f.contains(j1Var.mo37026m());
            Integer e = m56177e(y0Var);
            boolean z2 = (C11436z1.this.f43797m == null || (!contains && (e == null || e.intValue() >= 0))) ? false : !C11436z1.this.f43797m.mo35448b();
            if (C11436z1.this.f43790f.f42910a > this.f43810a.f43838d + 1 && !z2) {
                if (e == null) {
                    if (contains) {
                        j = (long) (((double) C11436z1.this.f43806v) * C11436z1.f43782B.nextDouble());
                        C11436z1 z1Var = C11436z1.this;
                        long unused = z1Var.f43806v = Math.min((long) (((double) z1Var.f43806v) * C11436z1.this.f43790f.f42913d), C11436z1.this.f43790f.f42912c);
                    }
                } else if (e.intValue() >= 0) {
                    j = TimeUnit.MILLISECONDS.toNanos((long) e.intValue());
                    C11436z1 z1Var2 = C11436z1.this;
                    long unused2 = z1Var2.f43806v = z1Var2.f43790f.f42911b;
                }
                z = true;
            }
            return new C11473x(z, j);
        }

        /* renamed from: a */
        public void mo34972a(C11274k2.C11275a aVar) {
            C11475z P = C11436z1.this.f43799o;
            C6431n.m37568u(P.f43892f != null, "Headers should be received prior to messages.");
            if (P.f43892f == this.f43810a) {
                C11436z1.this.f43787c.execute(new C11446g(aVar));
            }
        }

        /* renamed from: b */
        public void mo34973b(C12411y0 y0Var) {
            C11436z1.this.m56140Z(this.f43810a);
            if (C11436z1.this.f43799o.f43892f == this.f43810a) {
                if (C11436z1.this.f43797m != null) {
                    C11436z1.this.f43797m.mo35449c();
                }
                C11436z1.this.f43787c.execute(new C11439a(y0Var));
            }
        }

        /* renamed from: c */
        public void mo34974c() {
            if (C11436z1.this.isReady()) {
                C11436z1.this.f43787c.execute(new C11447h());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34975d(p343rc.C12335j1 r6, p264io.grpc.internal.C11333r.C11334a r7, p343rc.C12411y0 r8) {
            /*
                r5 = this;
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                java.lang.Object r0 = r0.f43793i
                monitor-enter(r0)
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x01ec }
                io.grpc.internal.z1$z r2 = r1.f43799o     // Catch:{ all -> 0x01ec }
                io.grpc.internal.z1$b0 r3 = r5.f43810a     // Catch:{ all -> 0x01ec }
                io.grpc.internal.z1$z r2 = r2.mo35468g(r3)     // Catch:{ all -> 0x01ec }
                p264io.grpc.internal.C11436z1.C11475z unused = r1.f43799o = r2     // Catch:{ all -> 0x01ec }
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x01ec }
                io.grpc.internal.x0 r1 = r1.f43798n     // Catch:{ all -> 0x01ec }
                rc.j1$b r2 = r6.mo37026m()     // Catch:{ all -> 0x01ec }
                r1.mo35388a(r2)     // Catch:{ all -> 0x01ec }
                monitor-exit(r0)     // Catch:{ all -> 0x01ec }
                io.grpc.internal.z1$b0 r0 = r5.f43810a
                boolean r1 = r0.f43837c
                if (r1 == 0) goto L_0x004a
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this
                r1.m56140Z(r0)
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$z r0 = r0.f43799o
                io.grpc.internal.z1$b0 r0 = r0.f43892f
                io.grpc.internal.z1$b0 r1 = r5.f43810a
                if (r0 != r1) goto L_0x0049
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.Executor r0 = r0.f43787c
                io.grpc.internal.z1$a0$c r1 = new io.grpc.internal.z1$a0$c
                r1.<init>(r6, r7, r8)
                r0.execute(r1)
            L_0x0049:
                return
            L_0x004a:
                io.grpc.internal.r$a r0 = p264io.grpc.internal.C11333r.C11334a.MISCARRIED
                if (r7 != r0) goto L_0x008e
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f43801q
                int r1 = r1.incrementAndGet()
                r2 = 1000(0x3e8, float:1.401E-42)
                if (r1 <= r2) goto L_0x008e
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$b0 r1 = r5.f43810a
                r0.m56140Z(r1)
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$z r0 = r0.f43799o
                io.grpc.internal.z1$b0 r0 = r0.f43892f
                io.grpc.internal.z1$b0 r1 = r5.f43810a
                if (r0 != r1) goto L_0x008d
                rc.j1 r0 = p343rc.C12335j1.f45620t
                java.lang.String r1 = "Too many transparent retries. Might be a bug in gRPC"
                rc.j1 r0 = r0.mo37030q(r1)
                rc.l1 r6 = r6.mo37021d()
                rc.j1 r6 = r0.mo37029p(r6)
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.Executor r0 = r0.f43787c
                io.grpc.internal.z1$a0$d r1 = new io.grpc.internal.z1$a0$d
                r1.<init>(r6, r7, r8)
                r0.execute(r1)
            L_0x008d:
                return
            L_0x008e:
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$z r1 = r1.f43799o
                io.grpc.internal.z1$b0 r1 = r1.f43892f
                if (r1 != 0) goto L_0x01ca
                r1 = 0
                r2 = 1
                if (r7 == r0) goto L_0x0155
                io.grpc.internal.r$a r0 = p264io.grpc.internal.C11333r.C11334a.REFUSED
                if (r7 != r0) goto L_0x00ae
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f43800p
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x00ae
                goto L_0x0155
            L_0x00ae:
                io.grpc.internal.r$a r0 = p264io.grpc.internal.C11333r.C11334a.DROPPED
                if (r7 != r0) goto L_0x00c1
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                boolean r0 = r0.f43792h
                if (r0 == 0) goto L_0x01ca
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                r0.m56144d0()
                goto L_0x01ca
            L_0x00c1:
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f43800p
                r0.set(r2)
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                boolean r0 = r0.f43792h
                if (r0 == 0) goto L_0x011d
                io.grpc.internal.z1$v r0 = r5.m56178f(r6, r8)
                boolean r1 = r0.f43879a
                if (r1 == 0) goto L_0x00e1
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this
                java.lang.Integer r2 = r0.f43880b
                r1.m56146i0(r2)
            L_0x00e1:
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this
                java.lang.Object r1 = r1.f43793i
                monitor-enter(r1)
                io.grpc.internal.z1 r2 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x011a }
                io.grpc.internal.z1$z r3 = r2.f43799o     // Catch:{ all -> 0x011a }
                io.grpc.internal.z1$b0 r4 = r5.f43810a     // Catch:{ all -> 0x011a }
                io.grpc.internal.z1$z r3 = r3.mo35466e(r4)     // Catch:{ all -> 0x011a }
                p264io.grpc.internal.C11436z1.C11475z unused = r2.f43799o = r3     // Catch:{ all -> 0x011a }
                boolean r0 = r0.f43879a     // Catch:{ all -> 0x011a }
                if (r0 == 0) goto L_0x0117
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x011a }
                io.grpc.internal.z1$z r2 = r0.f43799o     // Catch:{ all -> 0x011a }
                boolean r0 = r0.m56145e0(r2)     // Catch:{ all -> 0x011a }
                if (r0 != 0) goto L_0x0115
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x011a }
                io.grpc.internal.z1$z r0 = r0.f43799o     // Catch:{ all -> 0x011a }
                java.util.Collection<io.grpc.internal.z1$b0> r0 = r0.f43890d     // Catch:{ all -> 0x011a }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x011a }
                if (r0 != 0) goto L_0x0117
            L_0x0115:
                monitor-exit(r1)     // Catch:{ all -> 0x011a }
                return
            L_0x0117:
                monitor-exit(r1)     // Catch:{ all -> 0x011a }
                goto L_0x01ca
            L_0x011a:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x011a }
                throw r6
            L_0x011d:
                io.grpc.internal.z1$x r0 = r5.m56179g(r6, r8)
                boolean r1 = r0.f43884a
                if (r1 == 0) goto L_0x01ca
                io.grpc.internal.z1 r6 = p264io.grpc.internal.C11436z1.this
                java.lang.Object r1 = r6.f43793i
                monitor-enter(r1)
                io.grpc.internal.z1 r6 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0152 }
                io.grpc.internal.z1$u r7 = new io.grpc.internal.z1$u     // Catch:{ all -> 0x0152 }
                java.lang.Object r8 = r6.f43793i     // Catch:{ all -> 0x0152 }
                r7.<init>(r8)     // Catch:{ all -> 0x0152 }
                p264io.grpc.internal.C11436z1.C11469u unused = r6.f43804t = r7     // Catch:{ all -> 0x0152 }
                monitor-exit(r1)     // Catch:{ all -> 0x0152 }
                io.grpc.internal.z1 r6 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.ScheduledExecutorService r6 = r6.f43788d
                io.grpc.internal.z1$a0$b r8 = new io.grpc.internal.z1$a0$b
                r8.<init>()
                long r0 = r0.f43885b
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                java.util.concurrent.ScheduledFuture r6 = r6.schedule(r8, r0, r2)
                r7.mo35459c(r6)
                return
            L_0x0152:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0152 }
                throw r6
            L_0x0155:
                io.grpc.internal.z1 r6 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$b0 r7 = r5.f43810a
                int r7 = r7.f43838d
                io.grpc.internal.z1$b0 r6 = r6.m56141a0(r7, r2)
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                boolean r7 = r7.f43792h
                if (r7 == 0) goto L_0x01a4
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                java.lang.Object r7 = r7.f43793i
                monitor-enter(r7)
                io.grpc.internal.z1 r8 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x01a1 }
                io.grpc.internal.z1$z r0 = r8.f43799o     // Catch:{ all -> 0x01a1 }
                io.grpc.internal.z1$b0 r3 = r5.f43810a     // Catch:{ all -> 0x01a1 }
                io.grpc.internal.z1$z r0 = r0.mo35467f(r3, r6)     // Catch:{ all -> 0x01a1 }
                p264io.grpc.internal.C11436z1.C11475z unused = r8.f43799o = r0     // Catch:{ all -> 0x01a1 }
                io.grpc.internal.z1 r8 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x01a1 }
                io.grpc.internal.z1$z r0 = r8.f43799o     // Catch:{ all -> 0x01a1 }
                boolean r8 = r8.m56145e0(r0)     // Catch:{ all -> 0x01a1 }
                if (r8 != 0) goto L_0x0198
                io.grpc.internal.z1 r8 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x01a1 }
                io.grpc.internal.z1$z r8 = r8.f43799o     // Catch:{ all -> 0x01a1 }
                java.util.Collection<io.grpc.internal.z1$b0> r8 = r8.f43890d     // Catch:{ all -> 0x01a1 }
                int r8 = r8.size()     // Catch:{ all -> 0x01a1 }
                if (r8 != r2) goto L_0x0198
                r1 = 1
            L_0x0198:
                monitor-exit(r7)     // Catch:{ all -> 0x01a1 }
                if (r1 == 0) goto L_0x01bb
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                r7.m56140Z(r6)
                goto L_0x01bb
            L_0x01a1:
                r6 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x01a1 }
                throw r6
            L_0x01a4:
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.a2 r7 = r7.f43790f
                if (r7 == 0) goto L_0x01b6
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.a2 r7 = r7.f43790f
                int r7 = r7.f42910a
                if (r7 != r2) goto L_0x01bb
            L_0x01b6:
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                r7.m56140Z(r6)
            L_0x01bb:
                io.grpc.internal.z1 r7 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.Executor r7 = r7.f43786b
                io.grpc.internal.z1$a0$e r8 = new io.grpc.internal.z1$a0$e
                r8.<init>(r6)
                r7.execute(r8)
                return
            L_0x01ca:
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$b0 r1 = r5.f43810a
                r0.m56140Z(r1)
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$z r0 = r0.f43799o
                io.grpc.internal.z1$b0 r0 = r0.f43892f
                io.grpc.internal.z1$b0 r1 = r5.f43810a
                if (r0 != r1) goto L_0x01eb
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                java.util.concurrent.Executor r0 = r0.f43787c
                io.grpc.internal.z1$a0$f r1 = new io.grpc.internal.z1$a0$f
                r1.<init>(r6, r7, r8)
                r0.execute(r1)
            L_0x01eb:
                return
            L_0x01ec:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01ec }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11436z1.C11438a0.mo34975d(rc.j1, io.grpc.internal.r$a, rc.y0):void");
        }
    }

    /* renamed from: io.grpc.internal.z1$b */
    /* compiled from: RetriableStream */
    class C11448b implements C11466r {

        /* renamed from: a */
        final /* synthetic */ String f43833a;

        C11448b(String str) {
            this.f43833a = str;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34953f(this.f43833a);
        }
    }

    /* renamed from: io.grpc.internal.z1$b0 */
    /* compiled from: RetriableStream */
    private static final class C11449b0 {

        /* renamed from: a */
        C11329q f43835a;

        /* renamed from: b */
        boolean f43836b;

        /* renamed from: c */
        boolean f43837c;

        /* renamed from: d */
        final int f43838d;

        C11449b0(int i) {
            this.f43838d = i;
        }
    }

    /* renamed from: io.grpc.internal.z1$c */
    /* compiled from: RetriableStream */
    class C11450c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Collection f43839a;

        /* renamed from: b */
        final /* synthetic */ C11449b0 f43840b;

        /* renamed from: c */
        final /* synthetic */ Future f43841c;

        /* renamed from: d */
        final /* synthetic */ Future f43842d;

        C11450c(Collection collection, C11449b0 b0Var, Future future, Future future2) {
            this.f43839a = collection;
            this.f43840b = b0Var;
            this.f43841c = future;
            this.f43842d = future2;
        }

        public void run() {
            for (C11449b0 b0Var : this.f43839a) {
                if (b0Var != this.f43840b) {
                    b0Var.f43835a.mo34896c(C11436z1.f43781A);
                }
            }
            Future future = this.f43841c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f43842d;
            if (future2 != null) {
                future2.cancel(false);
            }
            C11436z1.this.mo35107g0();
        }
    }

    /* renamed from: io.grpc.internal.z1$c0 */
    /* compiled from: RetriableStream */
    static final class C11451c0 {

        /* renamed from: a */
        final int f43844a;

        /* renamed from: b */
        final int f43845b;

        /* renamed from: c */
        final int f43846c;

        /* renamed from: d */
        final AtomicInteger f43847d;

        C11451c0(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f43847d = atomicInteger;
            this.f43846c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f43844a = i;
            this.f43845b = i / 2;
            atomicInteger.set(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo35447a() {
            return this.f43847d.get() > this.f43845b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo35448b() {
            int i;
            int i2;
            do {
                i = this.f43847d.get();
                if (i == 0) {
                    return false;
                }
                i2 = i - 1000;
            } while (!this.f43847d.compareAndSet(i, Math.max(i2, 0)));
            if (i2 > this.f43845b) {
                return true;
            }
            return false;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        void mo35449c() {
            /*
                r4 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicInteger r0 = r4.f43847d
                int r0 = r0.get()
                int r1 = r4.f43844a
                if (r0 != r1) goto L_0x000b
                goto L_0x001a
            L_0x000b:
                int r2 = r4.f43846c
                int r2 = r2 + r0
                java.util.concurrent.atomic.AtomicInteger r3 = r4.f43847d
                int r1 = java.lang.Math.min(r2, r1)
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11436z1.C11451c0.mo35449c():void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11451c0)) {
                return false;
            }
            C11451c0 c0Var = (C11451c0) obj;
            if (this.f43844a == c0Var.f43844a && this.f43846c == c0Var.f43846c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6425j.m37542b(Integer.valueOf(this.f43844a), Integer.valueOf(this.f43846c));
        }
    }

    /* renamed from: io.grpc.internal.z1$d */
    /* compiled from: RetriableStream */
    class C11452d implements C11466r {

        /* renamed from: a */
        final /* synthetic */ C12357n f43848a;

        C11452d(C12357n nVar) {
            this.f43848a = nVar;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34952e(this.f43848a);
        }
    }

    /* renamed from: io.grpc.internal.z1$e */
    /* compiled from: RetriableStream */
    class C11453e implements C11466r {

        /* renamed from: a */
        final /* synthetic */ C12392t f43850a;

        C11453e(C12392t tVar) {
            this.f43850a = tVar;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34903l(this.f43850a);
        }
    }

    /* renamed from: io.grpc.internal.z1$f */
    /* compiled from: RetriableStream */
    class C11454f implements C11466r {

        /* renamed from: a */
        final /* synthetic */ C12400v f43852a;

        C11454f(C12400v vVar) {
            this.f43852a = vVar;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34898g(this.f43852a);
        }
    }

    /* renamed from: io.grpc.internal.z1$g */
    /* compiled from: RetriableStream */
    class C11455g implements C11466r {
        C11455g() {
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.flush();
        }
    }

    /* renamed from: io.grpc.internal.z1$h */
    /* compiled from: RetriableStream */
    class C11456h implements C11466r {

        /* renamed from: a */
        final /* synthetic */ boolean f43855a;

        C11456h(boolean z) {
            this.f43855a = z;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34905p(this.f43855a);
        }
    }

    /* renamed from: io.grpc.internal.z1$i */
    /* compiled from: RetriableStream */
    class C11457i implements C11466r {
        C11457i() {
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34900i();
        }
    }

    /* renamed from: io.grpc.internal.z1$j */
    /* compiled from: RetriableStream */
    class C11458j implements C11466r {

        /* renamed from: a */
        final /* synthetic */ int f43858a;

        C11458j(int i) {
            this.f43858a = i;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34895b(this.f43858a);
        }
    }

    /* renamed from: io.grpc.internal.z1$k */
    /* compiled from: RetriableStream */
    class C11459k implements C11466r {

        /* renamed from: a */
        final /* synthetic */ int f43860a;

        C11459k(int i) {
            this.f43860a = i;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34897d(this.f43860a);
        }
    }

    /* renamed from: io.grpc.internal.z1$l */
    /* compiled from: RetriableStream */
    class C11460l implements C11466r {
        C11460l() {
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34956n();
        }
    }

    /* renamed from: io.grpc.internal.z1$m */
    /* compiled from: RetriableStream */
    class C11461m implements C11466r {

        /* renamed from: a */
        final /* synthetic */ int f43863a;

        C11461m(int i) {
            this.f43863a = i;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34951a(this.f43863a);
        }
    }

    /* renamed from: io.grpc.internal.z1$n */
    /* compiled from: RetriableStream */
    class C11462n implements C11466r {

        /* renamed from: a */
        final /* synthetic */ Object f43865a;

        C11462n(Object obj) {
            this.f43865a = obj;
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34955m(C11436z1.this.f43785a.mo37194j(this.f43865a));
            b0Var.f43835a.flush();
        }
    }

    /* renamed from: io.grpc.internal.z1$o */
    /* compiled from: RetriableStream */
    class C11463o extends C12340k.C12341a {

        /* renamed from: a */
        final /* synthetic */ C12340k f43867a;

        C11463o(C12340k kVar) {
            this.f43867a = kVar;
        }

        /* renamed from: a */
        public C12340k mo35452a(C12340k.C12342b bVar, C12411y0 y0Var) {
            return this.f43867a;
        }
    }

    /* renamed from: io.grpc.internal.z1$p */
    /* compiled from: RetriableStream */
    class C11464p implements Runnable {
        C11464p() {
        }

        public void run() {
            if (!C11436z1.this.f43808x) {
                C11436z1.this.f43803s.mo34974c();
            }
        }
    }

    /* renamed from: io.grpc.internal.z1$q */
    /* compiled from: RetriableStream */
    class C11465q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12335j1 f43870a;

        C11465q(C12335j1 j1Var) {
            this.f43870a = j1Var;
        }

        public void run() {
            boolean unused = C11436z1.this.f43808x = true;
            C11436z1.this.f43803s.mo34975d(this.f43870a, C11333r.C11334a.PROCESSED, new C12411y0());
        }
    }

    /* renamed from: io.grpc.internal.z1$r */
    /* compiled from: RetriableStream */
    private interface C11466r {
        /* renamed from: a */
        void mo35445a(C11449b0 b0Var);
    }

    /* renamed from: io.grpc.internal.z1$s */
    /* compiled from: RetriableStream */
    class C11467s extends C12340k {

        /* renamed from: a */
        private final C11449b0 f43872a;

        /* renamed from: b */
        long f43873b;

        C11467s(C11449b0 b0Var) {
            this.f43872a = b0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
            r0.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35455h(long r8) {
            /*
                r7 = this;
                io.grpc.internal.z1 r0 = p264io.grpc.internal.C11436z1.this
                io.grpc.internal.z1$z r0 = r0.f43799o
                io.grpc.internal.z1$b0 r0 = r0.f43892f
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                r0 = 0
                io.grpc.internal.z1 r1 = p264io.grpc.internal.C11436z1.this
                java.lang.Object r1 = r1.f43793i
                monitor-enter(r1)
                io.grpc.internal.z1 r2 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1$z r2 = r2.f43799o     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1$b0 r2 = r2.f43892f     // Catch:{ all -> 0x0084 }
                if (r2 != 0) goto L_0x0082
                io.grpc.internal.z1$b0 r2 = r7.f43872a     // Catch:{ all -> 0x0084 }
                boolean r2 = r2.f43836b     // Catch:{ all -> 0x0084 }
                if (r2 == 0) goto L_0x0024
                goto L_0x0082
            L_0x0024:
                long r2 = r7.f43873b     // Catch:{ all -> 0x0084 }
                long r2 = r2 + r8
                r7.f43873b = r2     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r8 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                long r8 = r8.f43802r     // Catch:{ all -> 0x0084 }
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 > 0) goto L_0x0035
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                return
            L_0x0035:
                long r8 = r7.f43873b     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r2 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                long r2 = r2.f43795k     // Catch:{ all -> 0x0084 }
                r4 = 1
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x0047
                io.grpc.internal.z1$b0 r8 = r7.f43872a     // Catch:{ all -> 0x0084 }
                r8.f43837c = r4     // Catch:{ all -> 0x0084 }
                goto L_0x006f
            L_0x0047:
                io.grpc.internal.z1 r8 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1$t r8 = r8.f43794j     // Catch:{ all -> 0x0084 }
                long r2 = r7.f43873b     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r9 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                long r5 = r9.f43802r     // Catch:{ all -> 0x0084 }
                long r2 = r2 - r5
                long r8 = r8.mo35456a(r2)     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r2 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                long r5 = r7.f43873b     // Catch:{ all -> 0x0084 }
                long unused = r2.f43802r = r5     // Catch:{ all -> 0x0084 }
                io.grpc.internal.z1 r2 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                long r2 = r2.f43796l     // Catch:{ all -> 0x0084 }
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x006f
                io.grpc.internal.z1$b0 r8 = r7.f43872a     // Catch:{ all -> 0x0084 }
                r8.f43837c = r4     // Catch:{ all -> 0x0084 }
            L_0x006f:
                io.grpc.internal.z1$b0 r8 = r7.f43872a     // Catch:{ all -> 0x0084 }
                boolean r9 = r8.f43837c     // Catch:{ all -> 0x0084 }
                if (r9 == 0) goto L_0x007b
                io.grpc.internal.z1 r9 = p264io.grpc.internal.C11436z1.this     // Catch:{ all -> 0x0084 }
                java.lang.Runnable r0 = r9.m56139Y(r8)     // Catch:{ all -> 0x0084 }
            L_0x007b:
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                if (r0 == 0) goto L_0x0081
                r0.run()
            L_0x0081:
                return
            L_0x0082:
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                return
            L_0x0084:
                r8 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11436z1.C11467s.mo35455h(long):void");
        }
    }

    /* renamed from: io.grpc.internal.z1$t */
    /* compiled from: RetriableStream */
    static final class C11468t {

        /* renamed from: a */
        private final AtomicLong f43875a = new AtomicLong();

        C11468t() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo35456a(long j) {
            return this.f43875a.addAndGet(j);
        }
    }

    /* renamed from: io.grpc.internal.z1$u */
    /* compiled from: RetriableStream */
    private static final class C11469u {

        /* renamed from: a */
        final Object f43876a;

        /* renamed from: b */
        Future<?> f43877b;

        /* renamed from: c */
        boolean f43878c;

        C11469u(Object obj) {
            this.f43876a = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo35457a() {
            return this.f43878c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Future<?> mo35458b() {
            this.f43878c = true;
            return this.f43877b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35459c(Future<?> future) {
            synchronized (this.f43876a) {
                if (!this.f43878c) {
                    this.f43877b = future;
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.z1$v */
    /* compiled from: RetriableStream */
    private static final class C11470v {

        /* renamed from: a */
        final boolean f43879a;

        /* renamed from: b */
        final Integer f43880b;

        public C11470v(boolean z, Integer num) {
            this.f43879a = z;
            this.f43880b = num;
        }
    }

    /* renamed from: io.grpc.internal.z1$w */
    /* compiled from: RetriableStream */
    private final class C11471w implements Runnable {

        /* renamed from: a */
        final C11469u f43881a;

        /* renamed from: io.grpc.internal.z1$w$a */
        /* compiled from: RetriableStream */
        class C11472a implements Runnable {
            C11472a() {
            }

            public void run() {
                C11469u uVar;
                C11436z1 z1Var = C11436z1.this;
                boolean z = false;
                C11449b0 S = z1Var.m56141a0(z1Var.f43799o.f43891e, false);
                synchronized (C11436z1.this.f43793i) {
                    uVar = null;
                    if (C11471w.this.f43881a.mo35457a()) {
                        z = true;
                    } else {
                        C11436z1 z1Var2 = C11436z1.this;
                        C11475z unused = z1Var2.f43799o = z1Var2.f43799o.mo35462a(S);
                        C11436z1 z1Var3 = C11436z1.this;
                        if (!z1Var3.m56145e0(z1Var3.f43799o) || (C11436z1.this.f43797m != null && !C11436z1.this.f43797m.mo35447a())) {
                            C11436z1 z1Var4 = C11436z1.this;
                            C11475z unused2 = z1Var4.f43799o = z1Var4.f43799o.mo35465d();
                            C11469u unused3 = C11436z1.this.f43805u = null;
                        } else {
                            C11436z1 z1Var5 = C11436z1.this;
                            uVar = new C11469u(z1Var5.f43793i);
                            C11469u unused4 = z1Var5.f43805u = uVar;
                        }
                    }
                }
                if (z) {
                    S.f43835a.mo34896c(C12335j1.f45607g.mo37030q("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.mo35459c(C11436z1.this.f43788d.schedule(new C11471w(uVar), C11436z1.this.f43791g.f43614b, TimeUnit.NANOSECONDS));
                }
                C11436z1.this.m56143c0(S);
            }
        }

        C11471w(C11469u uVar) {
            this.f43881a = uVar;
        }

        public void run() {
            C11436z1.this.f43786b.execute(new C11472a());
        }
    }

    /* renamed from: io.grpc.internal.z1$x */
    /* compiled from: RetriableStream */
    private static final class C11473x {

        /* renamed from: a */
        final boolean f43884a;

        /* renamed from: b */
        final long f43885b;

        C11473x(boolean z, long j) {
            this.f43884a = z;
            this.f43885b = j;
        }
    }

    /* renamed from: io.grpc.internal.z1$y */
    /* compiled from: RetriableStream */
    class C11474y implements C11466r {
        C11474y() {
        }

        /* renamed from: a */
        public void mo35445a(C11449b0 b0Var) {
            b0Var.f43835a.mo34902k(new C11438a0(b0Var));
        }
    }

    /* renamed from: io.grpc.internal.z1$z */
    /* compiled from: RetriableStream */
    private static final class C11475z {

        /* renamed from: a */
        final boolean f43887a;

        /* renamed from: b */
        final List<C11466r> f43888b;

        /* renamed from: c */
        final Collection<C11449b0> f43889c;

        /* renamed from: d */
        final Collection<C11449b0> f43890d;

        /* renamed from: e */
        final int f43891e;

        /* renamed from: f */
        final C11449b0 f43892f;

        /* renamed from: g */
        final boolean f43893g;

        /* renamed from: h */
        final boolean f43894h;

        C11475z(List<C11466r> list, Collection<C11449b0> collection, Collection<C11449b0> collection2, C11449b0 b0Var, boolean z, boolean z2, boolean z3, int i) {
            this.f43888b = list;
            this.f43889c = (Collection) C6431n.m37562o(collection, "drainedSubstreams");
            this.f43892f = b0Var;
            this.f43890d = collection2;
            this.f43893g = z;
            this.f43887a = z2;
            this.f43894h = z3;
            this.f43891e = i;
            boolean z4 = false;
            C6431n.m37568u(!z2 || list == null, "passThrough should imply buffer is null");
            C6431n.m37568u(!z2 || b0Var != null, "passThrough should imply winningSubstream != null");
            C6431n.m37568u(!z2 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f43836b), "passThrough should imply winningSubstream is drained");
            C6431n.m37568u((!z || b0Var != null) ? true : z4, "cancelled should imply committed");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11475z mo35462a(C11449b0 b0Var) {
            Collection collection;
            C6431n.m37568u(!this.f43894h, "hedging frozen");
            C6431n.m37568u(this.f43892f == null, "already committed");
            if (this.f43890d == null) {
                collection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f43890d);
                arrayList.add(b0Var);
                collection = Collections.unmodifiableCollection(arrayList);
            }
            return new C11475z(this.f43888b, this.f43889c, collection, this.f43892f, this.f43893g, this.f43887a, this.f43894h, this.f43891e + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C11475z mo35463b() {
            return new C11475z(this.f43888b, this.f43889c, this.f43890d, this.f43892f, true, this.f43887a, this.f43894h, this.f43891e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C11475z mo35464c(C11449b0 b0Var) {
            boolean z;
            Set set;
            List<C11466r> list;
            C6431n.m37568u(this.f43892f == null, "Already committed");
            List<C11466r> list2 = this.f43888b;
            if (this.f43889c.contains(b0Var)) {
                list = null;
                set = Collections.singleton(b0Var);
                z = true;
            } else {
                list = list2;
                set = Collections.emptyList();
                z = false;
            }
            return new C11475z(list, set, this.f43890d, b0Var, this.f43893g, z, this.f43894h, this.f43891e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C11475z mo35465d() {
            if (this.f43894h) {
                return this;
            }
            return new C11475z(this.f43888b, this.f43889c, this.f43890d, this.f43892f, this.f43893g, this.f43887a, true, this.f43891e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C11475z mo35466e(C11449b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f43890d);
            arrayList.remove(b0Var);
            return new C11475z(this.f43888b, this.f43889c, Collections.unmodifiableCollection(arrayList), this.f43892f, this.f43893g, this.f43887a, this.f43894h, this.f43891e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C11475z mo35467f(C11449b0 b0Var, C11449b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f43890d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new C11475z(this.f43888b, this.f43889c, Collections.unmodifiableCollection(arrayList), this.f43892f, this.f43893g, this.f43887a, this.f43894h, this.f43891e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C11475z mo35468g(C11449b0 b0Var) {
            b0Var.f43836b = true;
            if (!this.f43889c.contains(b0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f43889c);
            arrayList.remove(b0Var);
            return new C11475z(this.f43888b, Collections.unmodifiableCollection(arrayList), this.f43890d, this.f43892f, this.f43893g, this.f43887a, this.f43894h, this.f43891e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C11475z mo35469h(C11449b0 b0Var) {
            Collection unmodifiableCollection;
            boolean z = true;
            C6431n.m37568u(!this.f43887a, "Already passThrough");
            if (b0Var.f43836b) {
                unmodifiableCollection = this.f43889c;
            } else if (this.f43889c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f43889c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            C11449b0 b0Var2 = this.f43892f;
            boolean z2 = b0Var2 != null;
            List<C11466r> list = this.f43888b;
            if (z2) {
                if (b0Var2 != b0Var) {
                    z = false;
                }
                C6431n.m37568u(z, "Another RPC attempt has already committed");
                list = null;
            }
            return new C11475z(list, collection, this.f43890d, this.f43892f, this.f43893g, z2, this.f43894h, this.f43891e);
        }
    }

    static {
        C12411y0.C12415d<String> dVar = C12411y0.f45761e;
        f43783y = C12411y0.C12418g.m59361e("grpc-previous-rpc-attempts", dVar);
        f43784z = C12411y0.C12418g.m59361e("grpc-retry-pushback-ms", dVar);
    }

    C11436z1(C12423z0<ReqT, ?> z0Var, C12411y0 y0Var, C11468t tVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, C11113a2 a2Var, C11360t0 t0Var, C11451c0 c0Var) {
        C11113a2 a2Var2 = a2Var;
        C11360t0 t0Var2 = t0Var;
        this.f43785a = z0Var;
        this.f43794j = tVar;
        this.f43795k = j;
        this.f43796l = j2;
        this.f43786b = executor;
        this.f43788d = scheduledExecutorService;
        this.f43789e = y0Var;
        this.f43790f = a2Var2;
        if (a2Var2 != null) {
            this.f43806v = a2Var2.f42911b;
        }
        this.f43791g = t0Var2;
        boolean z = false;
        C6431n.m37552e(a2Var2 == null || t0Var2 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f43792h = t0Var2 != null ? true : z;
        this.f43797m = c0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public Runnable m56139Y(C11449b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f43793i) {
            if (this.f43799o.f43892f != null) {
                return null;
            }
            Collection<C11449b0> collection = this.f43799o.f43889c;
            this.f43799o = this.f43799o.mo35464c(b0Var);
            this.f43794j.mo35456a(-this.f43802r);
            C11469u uVar = this.f43804t;
            if (uVar != null) {
                Future<?> b = uVar.mo35458b();
                this.f43804t = null;
                future = b;
            } else {
                future = null;
            }
            C11469u uVar2 = this.f43805u;
            if (uVar2 != null) {
                Future<?> b2 = uVar2.mo35458b();
                this.f43805u = null;
                future2 = b2;
            } else {
                future2 = null;
            }
            C11450c cVar = new C11450c(collection, b0Var, future, future2);
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m56140Z(C11449b0 b0Var) {
        Runnable Y = m56139Y(b0Var);
        if (Y != null) {
            Y.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public C11449b0 m56141a0(int i, boolean z) {
        C11449b0 b0Var = new C11449b0(i);
        b0Var.f43835a = mo35106f0(mo35434k0(this.f43789e, i), new C11463o(new C11467s(b0Var)), i, z);
        return b0Var;
    }

    /* renamed from: b0 */
    private void m56142b0(C11466r rVar) {
        Collection<C11449b0> collection;
        synchronized (this.f43793i) {
            if (!this.f43799o.f43887a) {
                this.f43799o.f43888b.add(rVar);
            }
            collection = this.f43799o.f43889c;
        }
        for (C11449b0 a : collection) {
            rVar.mo35445a(a);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r2.hasNext() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0085, code lost:
        r4 = (p264io.grpc.internal.C11436z1.C11466r) r2.next();
        r4.mo35445a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        if ((r4 instanceof p264io.grpc.internal.C11436z1.C11474y) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r1 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r4 = r8.f43799o;
        r5 = r4.f43892f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
        if (r5 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5 == r9) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        if (r4.f43893g == false) goto L_0x007f;
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m56143c0(p264io.grpc.internal.C11436z1.C11449b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L_0x0004:
            java.lang.Object r4 = r8.f43793i
            monitor-enter(r4)
            io.grpc.internal.z1$z r5 = r8.f43799o     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0019
            io.grpc.internal.z1$b0 r6 = r5.f43892f     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0013
            if (r6 == r9) goto L_0x0013
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0013:
            boolean r6 = r5.f43893g     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0019
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0019:
            java.util.List<io.grpc.internal.z1$r> r6 = r5.f43888b     // Catch:{ all -> 0x00a5 }
            int r6 = r6.size()     // Catch:{ all -> 0x00a5 }
            if (r2 != r6) goto L_0x004e
            io.grpc.internal.z1$z r0 = r5.mo35469h(r9)     // Catch:{ all -> 0x00a5 }
            r8.f43799o = r0     // Catch:{ all -> 0x00a5 }
            boolean r0 = r8.isReady()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x002f
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            return
        L_0x002f:
            io.grpc.internal.z1$p r0 = new io.grpc.internal.z1$p     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
        L_0x0035:
            if (r0 == 0) goto L_0x003d
            java.util.concurrent.Executor r9 = r8.f43787c
            r9.execute(r0)
            return
        L_0x003d:
            io.grpc.internal.q r0 = r9.f43835a
            io.grpc.internal.z1$z r1 = r8.f43799o
            io.grpc.internal.z1$b0 r1 = r1.f43892f
            if (r1 != r9) goto L_0x0048
            rc.j1 r9 = r8.f43807w
            goto L_0x004a
        L_0x0048:
            rc.j1 r9 = f43781A
        L_0x004a:
            r0.mo34896c(r9)
            return
        L_0x004e:
            boolean r6 = r9.f43836b     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0054
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            return
        L_0x0054:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.z1$r> r7 = r5.f43888b     // Catch:{ all -> 0x00a5 }
            int r7 = r7.size()     // Catch:{ all -> 0x00a5 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x006e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a5 }
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f43888b     // Catch:{ all -> 0x00a5 }
            java.util.List r2 = r5.subList(r2, r6)     // Catch:{ all -> 0x00a5 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x007a
        L_0x006e:
            r3.clear()     // Catch:{ all -> 0x00a5 }
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f43888b     // Catch:{ all -> 0x00a5 }
            java.util.List r2 = r5.subList(r2, r6)     // Catch:{ all -> 0x00a5 }
            r3.addAll(r2)     // Catch:{ all -> 0x00a5 }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = r3.iterator()
        L_0x007f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00a2
            java.lang.Object r4 = r2.next()
            io.grpc.internal.z1$r r4 = (p264io.grpc.internal.C11436z1.C11466r) r4
            r4.mo35445a(r9)
            boolean r4 = r4 instanceof p264io.grpc.internal.C11436z1.C11474y
            if (r4 == 0) goto L_0x0093
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x007f
            io.grpc.internal.z1$z r4 = r8.f43799o
            io.grpc.internal.z1$b0 r5 = r4.f43892f
            if (r5 == 0) goto L_0x009e
            if (r5 == r9) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            boolean r4 = r4.f43893g
            if (r4 == 0) goto L_0x007f
        L_0x00a2:
            r2 = r6
            goto L_0x0004
        L_0x00a5:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11436z1.m56143c0(io.grpc.internal.z1$b0):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m56144d0() {
        Future<?> future;
        synchronized (this.f43793i) {
            C11469u uVar = this.f43805u;
            future = null;
            if (uVar != null) {
                Future<?> b = uVar.mo35458b();
                this.f43805u = null;
                future = b;
            }
            this.f43799o = this.f43799o.mo35465d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m56145e0(C11475z zVar) {
        return zVar.f43892f == null && zVar.f43891e < this.f43791g.f43613a && !zVar.f43894h;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1.cancel(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2.mo35459c(r5.f43788d.schedule(new p264io.grpc.internal.C11436z1.C11471w(r5, r2), (long) r6.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m56146i0(java.lang.Integer r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r6.intValue()
            if (r0 >= 0) goto L_0x000d
            r5.m56144d0()
            return
        L_0x000d:
            java.lang.Object r0 = r5.f43793i
            monitor-enter(r0)
            io.grpc.internal.z1$u r1 = r5.f43805u     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0016:
            java.util.concurrent.Future r1 = r1.mo35458b()     // Catch:{ all -> 0x0040 }
            io.grpc.internal.z1$u r2 = new io.grpc.internal.z1$u     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r5.f43793i     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            r5.f43805u = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r1.cancel(r0)
        L_0x002a:
            java.util.concurrent.ScheduledExecutorService r0 = r5.f43788d
            io.grpc.internal.z1$w r1 = new io.grpc.internal.z1$w
            r1.<init>(r2)
            int r6 = r6.intValue()
            long r3 = (long) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r6 = r0.schedule(r1, r3, r6)
            r2.mo35459c(r6)
            return
        L_0x0040:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11436z1.m56146i0(java.lang.Integer):void");
    }

    /* renamed from: a */
    public final void mo34951a(int i) {
        C11475z zVar = this.f43799o;
        if (zVar.f43887a) {
            zVar.f43892f.f43835a.mo34951a(i);
        } else {
            m56142b0(new C11461m(i));
        }
    }

    /* renamed from: b */
    public final void mo34895b(int i) {
        m56142b0(new C11458j(i));
    }

    /* renamed from: c */
    public final void mo34896c(C12335j1 j1Var) {
        C11449b0 b0Var = new C11449b0(0);
        b0Var.f43835a = new C11309o1();
        Runnable Y = m56139Y(b0Var);
        if (Y != null) {
            Y.run();
            this.f43787c.execute(new C11465q(j1Var));
            return;
        }
        C11449b0 b0Var2 = null;
        synchronized (this.f43793i) {
            if (this.f43799o.f43889c.contains(this.f43799o.f43892f)) {
                b0Var2 = this.f43799o.f43892f;
            } else {
                this.f43807w = j1Var;
            }
            this.f43799o = this.f43799o.mo35463b();
        }
        if (b0Var2 != null) {
            b0Var2.f43835a.mo34896c(j1Var);
        }
    }

    /* renamed from: d */
    public final void mo34897d(int i) {
        m56142b0(new C11459k(i));
    }

    /* renamed from: e */
    public final void mo34952e(C12357n nVar) {
        m56142b0(new C11452d(nVar));
    }

    /* renamed from: f */
    public final void mo34953f(String str) {
        m56142b0(new C11448b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public abstract C11329q mo35106f0(C12411y0 y0Var, C12340k.C12341a aVar, int i, boolean z);

    public final void flush() {
        C11475z zVar = this.f43799o;
        if (zVar.f43887a) {
            zVar.f43892f.f43835a.flush();
        } else {
            m56142b0(new C11455g());
        }
    }

    /* renamed from: g */
    public final void mo34898g(C12400v vVar) {
        m56142b0(new C11454f(vVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public abstract void mo35107g0();

    /* renamed from: h */
    public void mo34899h(C11389x0 x0Var) {
        C11475z zVar;
        synchronized (this.f43793i) {
            x0Var.mo35389b("closed", this.f43798n);
            zVar = this.f43799o;
        }
        if (zVar.f43892f != null) {
            C11389x0 x0Var2 = new C11389x0();
            zVar.f43892f.f43835a.mo34899h(x0Var2);
            x0Var.mo35389b("committed", x0Var2);
            return;
        }
        C11389x0 x0Var3 = new C11389x0();
        for (C11449b0 b0Var : zVar.f43889c) {
            C11389x0 x0Var4 = new C11389x0();
            b0Var.f43835a.mo34899h(x0Var4);
            x0Var3.mo35388a(x0Var4);
        }
        x0Var.mo35389b("open", x0Var3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public abstract C12335j1 mo35108h0();

    /* renamed from: i */
    public final void mo34900i() {
        m56142b0(new C11457i());
    }

    public final boolean isReady() {
        for (C11449b0 b0Var : this.f43799o.f43889c) {
            if (b0Var.f43835a.isReady()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final void mo35433j0(ReqT reqt) {
        C11475z zVar = this.f43799o;
        if (zVar.f43887a) {
            zVar.f43892f.f43835a.mo34955m(this.f43785a.mo37194j(reqt));
        } else {
            m56142b0(new C11462n(reqt));
        }
    }

    /* renamed from: k */
    public final void mo34902k(C11333r rVar) {
        C11451c0 c0Var;
        this.f43803s = rVar;
        C12335j1 h0 = mo35108h0();
        if (h0 != null) {
            mo34896c(h0);
            return;
        }
        synchronized (this.f43793i) {
            this.f43799o.f43888b.add(new C11474y());
        }
        C11449b0 a0 = m56141a0(0, false);
        if (this.f43792h) {
            C11469u uVar = null;
            synchronized (this.f43793i) {
                this.f43799o = this.f43799o.mo35462a(a0);
                if (m56145e0(this.f43799o) && ((c0Var = this.f43797m) == null || c0Var.mo35447a())) {
                    uVar = new C11469u(this.f43793i);
                    this.f43805u = uVar;
                }
            }
            if (uVar != null) {
                uVar.mo35459c(this.f43788d.schedule(new C11471w(uVar), this.f43791g.f43614b, TimeUnit.NANOSECONDS));
            }
        }
        m56143c0(a0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final C12411y0 mo35434k0(C12411y0 y0Var, int i) {
        C12411y0 y0Var2 = new C12411y0();
        y0Var2.mo37169m(y0Var);
        if (i > 0) {
            y0Var2.mo37170p(f43783y, String.valueOf(i));
        }
        return y0Var2;
    }

    /* renamed from: l */
    public final void mo34903l(C12392t tVar) {
        m56142b0(new C11453e(tVar));
    }

    /* renamed from: m */
    public final void mo34955m(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* renamed from: n */
    public void mo34956n() {
        m56142b0(new C11460l());
    }

    /* renamed from: p */
    public final void mo34905p(boolean z) {
        m56142b0(new C11456h(z));
    }
}
