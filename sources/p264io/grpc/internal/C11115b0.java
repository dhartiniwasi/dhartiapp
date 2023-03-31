package p264io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p182a7.C6431n;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11333r;
import p343rc.C12335j1;
import p343rc.C12357n;
import p343rc.C12392t;
import p343rc.C12400v;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.b0 */
/* compiled from: DelayedStream */
class C11115b0 implements C11329q {

    /* renamed from: a */
    private volatile boolean f42917a;

    /* renamed from: b */
    private C11333r f42918b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11329q f42919c;

    /* renamed from: d */
    private C12335j1 f42920d;

    /* renamed from: e */
    private List<Runnable> f42921e = new ArrayList();

    /* renamed from: f */
    private C11130o f42922f;

    /* renamed from: g */
    private long f42923g;

    /* renamed from: h */
    private long f42924h;

    /* renamed from: i */
    private List<Runnable> f42925i = new ArrayList();

    /* renamed from: io.grpc.internal.b0$a */
    /* compiled from: DelayedStream */
    class C11116a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f42926a;

        C11116a(int i) {
            this.f42926a = i;
        }

        public void run() {
            C11115b0.this.f42919c.mo34951a(this.f42926a);
        }
    }

    /* renamed from: io.grpc.internal.b0$b */
    /* compiled from: DelayedStream */
    class C11117b implements Runnable {
        C11117b() {
        }

        public void run() {
            C11115b0.this.f42919c.mo34956n();
        }
    }

    /* renamed from: io.grpc.internal.b0$c */
    /* compiled from: DelayedStream */
    class C11118c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12357n f42929a;

        C11118c(C12357n nVar) {
            this.f42929a = nVar;
        }

        public void run() {
            C11115b0.this.f42919c.mo34952e(this.f42929a);
        }
    }

    /* renamed from: io.grpc.internal.b0$d */
    /* compiled from: DelayedStream */
    class C11119d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f42931a;

        C11119d(boolean z) {
            this.f42931a = z;
        }

        public void run() {
            C11115b0.this.f42919c.mo34905p(this.f42931a);
        }
    }

    /* renamed from: io.grpc.internal.b0$e */
    /* compiled from: DelayedStream */
    class C11120e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12400v f42933a;

        C11120e(C12400v vVar) {
            this.f42933a = vVar;
        }

        public void run() {
            C11115b0.this.f42919c.mo34898g(this.f42933a);
        }
    }

    /* renamed from: io.grpc.internal.b0$f */
    /* compiled from: DelayedStream */
    class C11121f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f42935a;

        C11121f(int i) {
            this.f42935a = i;
        }

        public void run() {
            C11115b0.this.f42919c.mo34895b(this.f42935a);
        }
    }

    /* renamed from: io.grpc.internal.b0$g */
    /* compiled from: DelayedStream */
    class C11122g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f42937a;

        C11122g(int i) {
            this.f42937a = i;
        }

        public void run() {
            C11115b0.this.f42919c.mo34897d(this.f42937a);
        }
    }

    /* renamed from: io.grpc.internal.b0$h */
    /* compiled from: DelayedStream */
    class C11123h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12392t f42939a;

        C11123h(C12392t tVar) {
            this.f42939a = tVar;
        }

        public void run() {
            C11115b0.this.f42919c.mo34903l(this.f42939a);
        }
    }

    /* renamed from: io.grpc.internal.b0$i */
    /* compiled from: DelayedStream */
    class C11124i implements Runnable {
        C11124i() {
        }

        public void run() {
            C11115b0.this.m55082s();
        }
    }

    /* renamed from: io.grpc.internal.b0$j */
    /* compiled from: DelayedStream */
    class C11125j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f42942a;

        C11125j(String str) {
            this.f42942a = str;
        }

        public void run() {
            C11115b0.this.f42919c.mo34953f(this.f42942a);
        }
    }

    /* renamed from: io.grpc.internal.b0$k */
    /* compiled from: DelayedStream */
    class C11126k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputStream f42944a;

        C11126k(InputStream inputStream) {
            this.f42944a = inputStream;
        }

        public void run() {
            C11115b0.this.f42919c.mo34955m(this.f42944a);
        }
    }

    /* renamed from: io.grpc.internal.b0$l */
    /* compiled from: DelayedStream */
    class C11127l implements Runnable {
        C11127l() {
        }

        public void run() {
            C11115b0.this.f42919c.flush();
        }
    }

    /* renamed from: io.grpc.internal.b0$m */
    /* compiled from: DelayedStream */
    class C11128m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12335j1 f42947a;

        C11128m(C12335j1 j1Var) {
            this.f42947a = j1Var;
        }

        public void run() {
            C11115b0.this.f42919c.mo34896c(this.f42947a);
        }
    }

    /* renamed from: io.grpc.internal.b0$n */
    /* compiled from: DelayedStream */
    class C11129n implements Runnable {
        C11129n() {
        }

        public void run() {
            C11115b0.this.f42919c.mo34900i();
        }
    }

    /* renamed from: io.grpc.internal.b0$o */
    /* compiled from: DelayedStream */
    private static class C11130o implements C11333r {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C11333r f42950a;

        /* renamed from: b */
        private volatile boolean f42951b;

        /* renamed from: c */
        private List<Runnable> f42952c = new ArrayList();

        /* renamed from: io.grpc.internal.b0$o$a */
        /* compiled from: DelayedStream */
        class C11131a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11274k2.C11275a f42953a;

            C11131a(C11274k2.C11275a aVar) {
                this.f42953a = aVar;
            }

            public void run() {
                C11130o.this.f42950a.mo34972a(this.f42953a);
            }
        }

        /* renamed from: io.grpc.internal.b0$o$b */
        /* compiled from: DelayedStream */
        class C11132b implements Runnable {
            C11132b() {
            }

            public void run() {
                C11130o.this.f42950a.mo34974c();
            }
        }

        /* renamed from: io.grpc.internal.b0$o$c */
        /* compiled from: DelayedStream */
        class C11133c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12411y0 f42956a;

            C11133c(C12411y0 y0Var) {
                this.f42956a = y0Var;
            }

            public void run() {
                C11130o.this.f42950a.mo34973b(this.f42956a);
            }
        }

        /* renamed from: io.grpc.internal.b0$o$d */
        /* compiled from: DelayedStream */
        class C11134d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f42958a;

            /* renamed from: b */
            final /* synthetic */ C11333r.C11334a f42959b;

            /* renamed from: c */
            final /* synthetic */ C12411y0 f42960c;

            C11134d(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
                this.f42958a = j1Var;
                this.f42959b = aVar;
                this.f42960c = y0Var;
            }

            public void run() {
                C11130o.this.f42950a.mo34975d(this.f42958a, this.f42959b, this.f42960c);
            }
        }

        public C11130o(C11333r rVar) {
            this.f42950a = rVar;
        }

        /* renamed from: f */
        private void m55102f(Runnable runnable) {
            synchronized (this) {
                if (!this.f42951b) {
                    this.f42952c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* renamed from: a */
        public void mo34972a(C11274k2.C11275a aVar) {
            if (this.f42951b) {
                this.f42950a.mo34972a(aVar);
            } else {
                m55102f(new C11131a(aVar));
            }
        }

        /* renamed from: b */
        public void mo34973b(C12411y0 y0Var) {
            m55102f(new C11133c(y0Var));
        }

        /* renamed from: c */
        public void mo34974c() {
            if (this.f42951b) {
                this.f42950a.mo34974c();
            } else {
                m55102f(new C11132b());
            }
        }

        /* renamed from: d */
        public void mo34975d(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
            m55102f(new C11134d(j1Var, aVar, y0Var));
        }

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
        public void mo34976g() {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0005:
                monitor-enter(r3)
                java.util.List<java.lang.Runnable> r1 = r3.f42952c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f42952c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f42951b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f42952c     // Catch:{ all -> 0x0034 }
                r3.f42952c = r0     // Catch:{ all -> 0x0034 }
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
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11115b0.C11130o.mo34976g():void");
        }
    }

    C11115b0() {
    }

    /* renamed from: r */
    private void m55081r(Runnable runnable) {
        C6431n.m37568u(this.f42918b != null, "May only be called after start");
        synchronized (this) {
            if (!this.f42917a) {
                this.f42921e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
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
        r0.mo34976g();
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m55082s() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f42921e     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r3.f42921e = r0     // Catch:{ all -> 0x003b }
            r0 = 1
            r3.f42917a = r0     // Catch:{ all -> 0x003b }
            io.grpc.internal.b0$o r0 = r3.f42922f     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x001c
            r0.mo34976g()
        L_0x001c:
            return
        L_0x001d:
            java.util.List<java.lang.Runnable> r1 = r3.f42921e     // Catch:{ all -> 0x003b }
            r3.f42921e = r0     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            java.util.Iterator r0 = r1.iterator()
        L_0x0026:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x0026
        L_0x0036:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11115b0.m55082s():void");
    }

    /* renamed from: t */
    private void m55083t(C11333r rVar) {
        for (Runnable run : this.f42925i) {
            run.run();
        }
        this.f42925i = null;
        this.f42919c.mo34902k(rVar);
    }

    /* renamed from: v */
    private void m55084v(C11329q qVar) {
        C11329q qVar2 = this.f42919c;
        C6431n.m37570w(qVar2 == null, "realStream already set to %s", qVar2);
        this.f42919c = qVar;
        this.f42924h = System.nanoTime();
    }

    /* renamed from: a */
    public void mo34951a(int i) {
        C6431n.m37568u(this.f42918b != null, "May only be called after start");
        if (this.f42917a) {
            this.f42919c.mo34951a(i);
        } else {
            m55081r(new C11116a(i));
        }
    }

    /* renamed from: b */
    public void mo34895b(int i) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        this.f42925i.add(new C11121f(i));
    }

    /* renamed from: c */
    public void mo34896c(C12335j1 j1Var) {
        boolean z = true;
        C6431n.m37568u(this.f42918b != null, "May only be called after start");
        C6431n.m37562o(j1Var, "reason");
        synchronized (this) {
            if (this.f42919c == null) {
                m55084v(C11309o1.f43451a);
                this.f42920d = j1Var;
                z = false;
            }
        }
        if (z) {
            m55081r(new C11128m(j1Var));
            return;
        }
        m55082s();
        mo34944u(j1Var);
        this.f42918b.mo34975d(j1Var, C11333r.C11334a.PROCESSED, new C12411y0());
    }

    /* renamed from: d */
    public void mo34897d(int i) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        this.f42925i.add(new C11122g(i));
    }

    /* renamed from: e */
    public void mo34952e(C12357n nVar) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        C6431n.m37562o(nVar, "compressor");
        this.f42925i.add(new C11118c(nVar));
    }

    /* renamed from: f */
    public void mo34953f(String str) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        C6431n.m37562o(str, "authority");
        this.f42925i.add(new C11125j(str));
    }

    public void flush() {
        C6431n.m37568u(this.f42918b != null, "May only be called after start");
        if (this.f42917a) {
            this.f42919c.flush();
        } else {
            m55081r(new C11127l());
        }
    }

    /* renamed from: g */
    public void mo34898g(C12400v vVar) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        C6431n.m37562o(vVar, "decompressorRegistry");
        this.f42925i.add(new C11120e(vVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34899h(p264io.grpc.internal.C11389x0 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.grpc.internal.r r0 = r5.f42918b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            io.grpc.internal.q r0 = r5.f42919c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "buffered_nanos"
            long r1 = r5.f42924h     // Catch:{ all -> 0x0036 }
            long r3 = r5.f42923g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo35389b(r0, r1)     // Catch:{ all -> 0x0036 }
            io.grpc.internal.q r0 = r5.f42919c     // Catch:{ all -> 0x0036 }
            r0.mo34899h(r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "buffered_nanos"
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            long r3 = r5.f42923g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo35389b(r0, r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "waiting_for_connection"
            r6.mo35388a(r0)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11115b0.mo34899h(io.grpc.internal.x0):void");
    }

    /* renamed from: i */
    public void mo34900i() {
        C6431n.m37568u(this.f42918b != null, "May only be called after start");
        m55081r(new C11129n());
    }

    public boolean isReady() {
        if (this.f42917a) {
            return this.f42919c.isReady();
        }
        return false;
    }

    /* renamed from: k */
    public void mo34902k(C11333r rVar) {
        C12335j1 j1Var;
        boolean z;
        C6431n.m37562o(rVar, "listener");
        C6431n.m37568u(this.f42918b == null, "already started");
        synchronized (this) {
            j1Var = this.f42920d;
            z = this.f42917a;
            if (!z) {
                C11130o oVar = new C11130o(rVar);
                this.f42922f = oVar;
                rVar = oVar;
            }
            this.f42918b = rVar;
            this.f42923g = System.nanoTime();
        }
        if (j1Var != null) {
            rVar.mo34975d(j1Var, C11333r.C11334a.PROCESSED, new C12411y0());
        } else if (z) {
            m55083t(rVar);
        }
    }

    /* renamed from: l */
    public void mo34903l(C12392t tVar) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        this.f42925i.add(new C11123h(tVar));
    }

    /* renamed from: m */
    public void mo34955m(InputStream inputStream) {
        C6431n.m37568u(this.f42918b != null, "May only be called after start");
        C6431n.m37562o(inputStream, "message");
        if (this.f42917a) {
            this.f42919c.mo34955m(inputStream);
        } else {
            m55081r(new C11126k(inputStream));
        }
    }

    /* renamed from: n */
    public void mo34956n() {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        this.f42925i.add(new C11117b());
    }

    /* renamed from: p */
    public void mo34905p(boolean z) {
        C6431n.m37568u(this.f42918b == null, "May only be called before start");
        this.f42925i.add(new C11119d(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo34944u(C12335j1 j1Var) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        m55083t(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return new p264io.grpc.internal.C11115b0.C11124i(r2);
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Runnable mo34957w(p264io.grpc.internal.C11329q r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            io.grpc.internal.q r0 = r2.f42919c     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0008:
            java.lang.String r0 = "stream"
            java.lang.Object r3 = p182a7.C6431n.m37562o(r3, r0)     // Catch:{ all -> 0x0029 }
            io.grpc.internal.q r3 = (p264io.grpc.internal.C11329q) r3     // Catch:{ all -> 0x0029 }
            r2.m55084v(r3)     // Catch:{ all -> 0x0029 }
            io.grpc.internal.r r3 = r2.f42918b     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x001c
            r2.f42921e = r1     // Catch:{ all -> 0x0029 }
            r0 = 1
            r2.f42917a = r0     // Catch:{ all -> 0x0029 }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x0020
            return r1
        L_0x0020:
            r2.m55083t(r3)
            io.grpc.internal.b0$i r3 = new io.grpc.internal.b0$i
            r3.<init>()
            return r3
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11115b0.mo34957w(io.grpc.internal.q):java.lang.Runnable");
    }
}
