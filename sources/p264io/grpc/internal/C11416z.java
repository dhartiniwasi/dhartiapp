package p264io.grpc.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6419h;
import p182a7.C6431n;
import p343rc.C12319g;
import p343rc.C12335j1;
import p343rc.C12372r;
import p343rc.C12392t;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.z */
/* compiled from: DelayedClientCall */
public class C11416z<ReqT, RespT> extends C12319g<ReqT, RespT> {

    /* renamed from: j */
    private static final Logger f43737j = Logger.getLogger(C11416z.class.getName());

    /* renamed from: k */
    private static final C12319g<Object, Object> f43738k = new C11425i();

    /* renamed from: a */
    private final ScheduledFuture<?> f43739a;

    /* renamed from: b */
    private final Executor f43740b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12372r f43741c;

    /* renamed from: d */
    private volatile boolean f43742d;

    /* renamed from: e */
    private C12319g.C12320a<RespT> f43743e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12319g<ReqT, RespT> f43744f;

    /* renamed from: g */
    private C12335j1 f43745g;

    /* renamed from: h */
    private List<Runnable> f43746h = new ArrayList();

    /* renamed from: i */
    private C11427k<RespT> f43747i;

    /* renamed from: io.grpc.internal.z$a */
    /* compiled from: DelayedClientCall */
    class C11417a extends C11388x {
        C11417a(C12372r rVar) {
            super(rVar);
        }

        /* renamed from: a */
        public void mo35109a() {
            C11416z.this.m56079m();
        }
    }

    /* renamed from: io.grpc.internal.z$b */
    /* compiled from: DelayedClientCall */
    class C11418b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f43749a;

        C11418b(StringBuilder sb) {
            this.f43749a = sb;
        }

        public void run() {
            C11416z.this.m56077k(C12335j1.f45610j.mo37030q(this.f43749a.toString()), true);
        }
    }

    /* renamed from: io.grpc.internal.z$c */
    /* compiled from: DelayedClientCall */
    class C11419c extends C11388x {

        /* renamed from: b */
        final /* synthetic */ C11427k f43751b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11419c(C11427k kVar) {
            super(C11416z.this.f43741c);
            this.f43751b = kVar;
        }

        /* renamed from: a */
        public void mo35109a() {
            this.f43751b.mo35427g();
        }
    }

    /* renamed from: io.grpc.internal.z$d */
    /* compiled from: DelayedClientCall */
    class C11420d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12319g.C12320a f43753a;

        /* renamed from: b */
        final /* synthetic */ C12411y0 f43754b;

        C11420d(C12319g.C12320a aVar, C12411y0 y0Var) {
            this.f43753a = aVar;
            this.f43754b = y0Var;
        }

        public void run() {
            C11416z.this.f43744f.mo35103e(this.f43753a, this.f43754b);
        }
    }

    /* renamed from: io.grpc.internal.z$e */
    /* compiled from: DelayedClientCall */
    class C11421e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12335j1 f43756a;

        C11421e(C12335j1 j1Var) {
            this.f43756a = j1Var;
        }

        public void run() {
            C11416z.this.f43744f.mo35100a(this.f43756a.mo37027n(), this.f43756a.mo37025l());
        }
    }

    /* renamed from: io.grpc.internal.z$f */
    /* compiled from: DelayedClientCall */
    class C11422f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f43758a;

        C11422f(Object obj) {
            this.f43758a = obj;
        }

        public void run() {
            C11416z.this.f43744f.mo35102d(this.f43758a);
        }
    }

    /* renamed from: io.grpc.internal.z$g */
    /* compiled from: DelayedClientCall */
    class C11423g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f43760a;

        C11423g(int i) {
            this.f43760a = i;
        }

        public void run() {
            C11416z.this.f43744f.mo35101c(this.f43760a);
        }
    }

    /* renamed from: io.grpc.internal.z$h */
    /* compiled from: DelayedClientCall */
    class C11424h implements Runnable {
        C11424h() {
        }

        public void run() {
            C11416z.this.f43744f.mo33082b();
        }
    }

    /* renamed from: io.grpc.internal.z$i */
    /* compiled from: DelayedClientCall */
    class C11425i extends C12319g<Object, Object> {
        C11425i() {
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

    /* renamed from: io.grpc.internal.z$j */
    /* compiled from: DelayedClientCall */
    private final class C11426j extends C11388x {

        /* renamed from: b */
        final C12319g.C12320a<RespT> f43763b;

        /* renamed from: c */
        final C12335j1 f43764c;

        C11426j(C12319g.C12320a<RespT> aVar, C12335j1 j1Var) {
            super(C11416z.this.f43741c);
            this.f43763b = aVar;
            this.f43764c = j1Var;
        }

        /* renamed from: a */
        public void mo35109a() {
            this.f43763b.mo33078a(this.f43764c, new C12411y0());
        }
    }

    /* renamed from: io.grpc.internal.z$k */
    /* compiled from: DelayedClientCall */
    private static final class C11427k<RespT> extends C12319g.C12320a<RespT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12319g.C12320a<RespT> f43766a;

        /* renamed from: b */
        private volatile boolean f43767b;

        /* renamed from: c */
        private List<Runnable> f43768c = new ArrayList();

        /* renamed from: io.grpc.internal.z$k$a */
        /* compiled from: DelayedClientCall */
        class C11428a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12411y0 f43769a;

            C11428a(C12411y0 y0Var) {
                this.f43769a = y0Var;
            }

            public void run() {
                C11427k.this.f43766a.mo33079b(this.f43769a);
            }
        }

        /* renamed from: io.grpc.internal.z$k$b */
        /* compiled from: DelayedClientCall */
        class C11429b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f43771a;

            C11429b(Object obj) {
                this.f43771a = obj;
            }

            public void run() {
                C11427k.this.f43766a.mo33080c(this.f43771a);
            }
        }

        /* renamed from: io.grpc.internal.z$k$c */
        /* compiled from: DelayedClientCall */
        class C11430c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f43773a;

            /* renamed from: b */
            final /* synthetic */ C12411y0 f43774b;

            C11430c(C12335j1 j1Var, C12411y0 y0Var) {
                this.f43773a = j1Var;
                this.f43774b = y0Var;
            }

            public void run() {
                C11427k.this.f43766a.mo33078a(this.f43773a, this.f43774b);
            }
        }

        /* renamed from: io.grpc.internal.z$k$d */
        /* compiled from: DelayedClientCall */
        class C11431d implements Runnable {
            C11431d() {
            }

            public void run() {
                C11427k.this.f43766a.mo33081d();
            }
        }

        public C11427k(C12319g.C12320a<RespT> aVar) {
            this.f43766a = aVar;
        }

        /* renamed from: f */
        private void m56098f(Runnable runnable) {
            synchronized (this) {
                if (!this.f43767b) {
                    this.f43768c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* renamed from: a */
        public void mo33078a(C12335j1 j1Var, C12411y0 y0Var) {
            m56098f(new C11430c(j1Var, y0Var));
        }

        /* renamed from: b */
        public void mo33079b(C12411y0 y0Var) {
            if (this.f43767b) {
                this.f43766a.mo33079b(y0Var);
            } else {
                m56098f(new C11428a(y0Var));
            }
        }

        /* renamed from: c */
        public void mo33080c(RespT respt) {
            if (this.f43767b) {
                this.f43766a.mo33080c(respt);
            } else {
                m56098f(new C11429b(respt));
            }
        }

        /* renamed from: d */
        public void mo33081d() {
            if (this.f43767b) {
                this.f43766a.mo33081d();
            } else {
                m56098f(new C11431d());
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r0.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            ((java.lang.Runnable) r0.next()).run();
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35427g() {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0005:
                monitor-enter(r3)
                java.util.List<java.lang.Runnable> r1 = r3.f43768c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f43768c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f43767b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f43768c     // Catch:{ all -> 0x0034 }
                r3.f43768c = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                java.util.Iterator r0 = r1.iterator()
            L_0x001f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x002f
                java.lang.Object r2 = r0.next()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r2.run()
                goto L_0x001f
            L_0x002f:
                r1.clear()
                r0 = r1
                goto L_0x0005
            L_0x0034:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11416z.C11427k.mo35427g():void");
        }
    }

    protected C11416z(Executor executor, ScheduledExecutorService scheduledExecutorService, C12392t tVar) {
        this.f43740b = (Executor) C6431n.m37562o(executor, "callExecutor");
        C6431n.m37562o(scheduledExecutorService, "scheduler");
        this.f43741c = C12372r.m59190e();
        this.f43739a = m56080n(scheduledExecutorService, tVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r4 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        m56078l(new p264io.grpc.internal.C11416z.C11421e(r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2.f43740b.execute(new p264io.grpc.internal.C11416z.C11426j(r2, r0, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        m56079m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        mo35142j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m56077k(p343rc.C12335j1 r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            rc.g<ReqT, RespT> r0 = r2.f43744f     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0010
            rc.g<java.lang.Object, java.lang.Object> r4 = f43738k     // Catch:{ all -> 0x0035 }
            r2.m56081p(r4)     // Catch:{ all -> 0x0035 }
            r4 = 0
            rc.g$a<RespT> r0 = r2.f43743e     // Catch:{ all -> 0x0035 }
            r2.f43745g = r3     // Catch:{ all -> 0x0035 }
            goto L_0x0016
        L_0x0010:
            if (r4 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x0014:
            r4 = 1
            r0 = 0
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0022
            io.grpc.internal.z$e r4 = new io.grpc.internal.z$e
            r4.<init>(r3)
            r2.m56078l(r4)
            goto L_0x0031
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            java.util.concurrent.Executor r4 = r2.f43740b
            io.grpc.internal.z$j r1 = new io.grpc.internal.z$j
            r1.<init>(r0, r3)
            r4.execute(r1)
        L_0x002e:
            r2.m56079m()
        L_0x0031:
            r2.mo35142j()
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11416z.m56077k(rc.j1, boolean):void");
    }

    /* renamed from: l */
    private void m56078l(Runnable runnable) {
        synchronized (this) {
            if (!this.f43742d) {
                this.f43746h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.hasNext() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3.f43740b.execute(new p264io.grpc.internal.C11416z.C11419c(r3, r0));
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m56079m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f43746h     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0024
            r0 = 0
            r3.f43746h = r0     // Catch:{ all -> 0x0042 }
            r0 = 1
            r3.f43742d = r0     // Catch:{ all -> 0x0042 }
            io.grpc.internal.z$k<RespT> r0 = r3.f43747i     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0023
            java.util.concurrent.Executor r1 = r3.f43740b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L_0x0023:
            return
        L_0x0024:
            java.util.List<java.lang.Runnable> r1 = r3.f43746h     // Catch:{ all -> 0x0042 }
            r3.f43746h = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            java.util.Iterator r0 = r1.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x002d
        L_0x003d:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11416z.m56079m():void");
    }

    /* renamed from: n */
    private ScheduledFuture<?> m56080n(ScheduledExecutorService scheduledExecutorService, C12392t tVar) {
        C12392t g = this.f43741c.mo37089g();
        if (tVar == null && g == null) {
            return null;
        }
        long j = Long.MAX_VALUE;
        if (tVar != null) {
            j = Math.min(Long.MAX_VALUE, tVar.mo37133q(TimeUnit.NANOSECONDS));
        }
        if (g != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g.mo37133q(timeUnit) < j) {
                j = g.mo37133q(timeUnit);
                Logger logger = f43737j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(j)}));
                    if (tVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(tVar.mo37133q(timeUnit))}));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long abs = Math.abs(j);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1);
        long abs2 = Math.abs(j) % timeUnit2.toNanos(1);
        StringBuilder sb2 = new StringBuilder();
        if (j < 0) {
            sb2.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
        } else {
            sb2.append("Deadline exceeded after ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new C11418b(sb2), j, TimeUnit.NANOSECONDS);
    }

    /* renamed from: p */
    private void m56081p(C12319g<ReqT, RespT> gVar) {
        C12319g<ReqT, RespT> gVar2 = this.f43744f;
        C6431n.m37570w(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture<?> scheduledFuture = this.f43739a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f43744f = gVar;
    }

    /* renamed from: a */
    public final void mo35100a(String str, Throwable th) {
        C12335j1 j1Var;
        C12335j1 j1Var2 = C12335j1.f45607g;
        if (str != null) {
            j1Var = j1Var2.mo37030q(str);
        } else {
            j1Var = j1Var2.mo37030q("Call cancelled without message");
        }
        if (th != null) {
            j1Var = j1Var.mo37029p(th);
        }
        m56077k(j1Var, false);
    }

    /* renamed from: b */
    public final void mo33082b() {
        m56078l(new C11424h());
    }

    /* renamed from: c */
    public final void mo35101c(int i) {
        if (this.f43742d) {
            this.f43744f.mo35101c(i);
        } else {
            m56078l(new C11423g(i));
        }
    }

    /* renamed from: d */
    public final void mo35102d(ReqT reqt) {
        if (this.f43742d) {
            this.f43744f.mo35102d(reqt);
        } else {
            m56078l(new C11422f(reqt));
        }
    }

    /* renamed from: e */
    public final void mo35103e(C12319g.C12320a<RespT> aVar, C12411y0 y0Var) {
        C12335j1 j1Var;
        boolean z;
        C6431n.m37568u(this.f43743e == null, "already started");
        synchronized (this) {
            this.f43743e = (C12319g.C12320a) C6431n.m37562o(aVar, "listener");
            j1Var = this.f43745g;
            z = this.f43742d;
            if (!z) {
                C11427k<RespT> kVar = new C11427k<>(aVar);
                this.f43747i = kVar;
                aVar = kVar;
            }
        }
        if (j1Var != null) {
            this.f43740b.execute(new C11426j(aVar, j1Var));
        } else if (z) {
            this.f43744f.mo35103e(aVar, y0Var);
        } else {
            m56078l(new C11420d(aVar, y0Var));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo35142j() {
    }

    /* renamed from: o */
    public final Runnable mo35419o(C12319g<ReqT, RespT> gVar) {
        synchronized (this) {
            if (this.f43744f != null) {
                return null;
            }
            m56081p((C12319g) C6431n.m37562o(gVar, "call"));
            return new C11417a(this.f43741c);
        }
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("realCall", this.f43744f).toString();
    }
}
