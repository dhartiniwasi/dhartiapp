package p264io.grpc.internal;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p182a7.C6431n;
import p264io.grpc.internal.C11302n1;
import p264io.grpc.internal.C11358t;
import p343rc.C12287b;
import p343rc.C12292c;
import p343rc.C12312f;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12349l0;
import p343rc.C12351m;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.l */
/* compiled from: CallCredentialsApplyingTransportFactory */
final class C11276l implements C11358t {

    /* renamed from: a */
    private final C11358t f43355a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12287b f43356b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f43357c;

    /* renamed from: io.grpc.internal.l$a */
    /* compiled from: CallCredentialsApplyingTransportFactory */
    private class C11277a extends C11271k0 {

        /* renamed from: a */
        private final C11376v f43358a;

        /* renamed from: b */
        private final String f43359b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicInteger f43360c = new AtomicInteger(-2147483647);

        /* renamed from: d */
        private volatile C12335j1 f43361d;

        /* renamed from: e */
        private C12335j1 f43362e;

        /* renamed from: f */
        private C12335j1 f43363f;

        /* renamed from: g */
        private final C11302n1.C11303a f43364g = new C11278a();

        /* renamed from: io.grpc.internal.l$a$a */
        /* compiled from: CallCredentialsApplyingTransportFactory */
        class C11278a implements C11302n1.C11303a {
            C11278a() {
            }

            /* renamed from: a */
            public void mo35236a() {
                if (C11277a.this.f43360c.decrementAndGet() == 0) {
                    C11277a.this.m55584j();
                }
            }
        }

        /* renamed from: io.grpc.internal.l$a$b */
        /* compiled from: CallCredentialsApplyingTransportFactory */
        class C11279b extends C12287b.C12289b {

            /* renamed from: a */
            final /* synthetic */ C12423z0 f43367a;

            /* renamed from: b */
            final /* synthetic */ C12292c f43368b;

            C11279b(C12423z0 z0Var, C12292c cVar) {
                this.f43367a = z0Var;
                this.f43368b = cVar;
            }
        }

        C11277a(C11376v vVar, String str) {
            this.f43358a = (C11376v) C6431n.m37562o(vVar, "delegate");
            this.f43359b = (String) C6431n.m37562o(str, "authority");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            super.mo34934d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r0 == null) goto L_0x001a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            super.mo34936g(r0);
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m55584j() {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.atomic.AtomicInteger r0 = r3.f43360c     // Catch:{ all -> 0x0020 }
                int r0 = r0.get()     // Catch:{ all -> 0x0020 }
                if (r0 == 0) goto L_0x000b
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                return
            L_0x000b:
                rc.j1 r0 = r3.f43362e     // Catch:{ all -> 0x0020 }
                rc.j1 r1 = r3.f43363f     // Catch:{ all -> 0x0020 }
                r2 = 0
                r3.f43362e = r2     // Catch:{ all -> 0x0020 }
                r3.f43363f = r2     // Catch:{ all -> 0x0020 }
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                if (r0 == 0) goto L_0x001a
                super.mo34936g(r0)
            L_0x001a:
                if (r1 == 0) goto L_0x001f
                super.mo34934d(r1)
            L_0x001f:
                return
            L_0x0020:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11276l.C11277a.m55584j():void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11376v mo35230a() {
            return this.f43358a;
        }

        /* renamed from: b */
        public C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
            Executor executor;
            C12287b c = cVar.mo36958c();
            if (c == null) {
                c = C11276l.this.f43356b;
            } else if (C11276l.this.f43356b != null) {
                c = new C12351m(C11276l.this.f43356b, c);
            }
            if (c != null) {
                C11302n1 n1Var = new C11302n1(this.f43358a, z0Var, y0Var, cVar, this.f43364g, kVarArr);
                if (this.f43360c.incrementAndGet() > 0) {
                    this.f43364g.mo35236a();
                    return new C11181f0(this.f43361d, kVarArr);
                }
                C11279b bVar = new C11279b(z0Var, cVar);
                try {
                    if (!(c instanceof C12349l0) || !((C12349l0) c).mo37052a() || cVar.mo36960e() == null) {
                        executor = C11276l.this.f43357c;
                    } else {
                        executor = cVar.mo36960e();
                    }
                    c.mo33031a(bVar, executor, n1Var);
                } catch (Throwable th) {
                    n1Var.mo35260b(C12335j1.f45614n.mo37030q("Credentials should use fail() instead of throwing exceptions").mo37029p(th));
                }
                return n1Var.mo35261d();
            } else if (this.f43360c.get() >= 0) {
                return new C11181f0(this.f43361d, kVarArr);
            } else {
                return this.f43358a.mo34932b(z0Var, y0Var, cVar, kVarArr);
            }
        }

        /* renamed from: d */
        public void mo34934d(C12335j1 j1Var) {
            C6431n.m37562o(j1Var, "status");
            synchronized (this) {
                if (this.f43360c.get() < 0) {
                    this.f43361d = j1Var;
                    this.f43360c.addAndGet(Integer.MAX_VALUE);
                } else if (this.f43363f != null) {
                    return;
                }
                if (this.f43360c.get() != 0) {
                    this.f43363f = j1Var;
                } else {
                    super.mo34934d(j1Var);
                }
            }
        }

        /* renamed from: g */
        public void mo34936g(C12335j1 j1Var) {
            C6431n.m37562o(j1Var, "status");
            synchronized (this) {
                if (this.f43360c.get() < 0) {
                    this.f43361d = j1Var;
                    this.f43360c.addAndGet(Integer.MAX_VALUE);
                    if (this.f43360c.get() != 0) {
                        this.f43362e = j1Var;
                    } else {
                        super.mo34936g(j1Var);
                    }
                }
            }
        }
    }

    C11276l(C11358t tVar, C12287b bVar, Executor executor) {
        this.f43355a = (C11358t) C6431n.m37562o(tVar, "delegate");
        this.f43356b = bVar;
        this.f43357c = (Executor) C6431n.m37562o(executor, "appExecutor");
    }

    public void close() {
        this.f43355a.close();
    }

    /* renamed from: h0 */
    public C11376v mo35234h0(SocketAddress socketAddress, C11358t.C11359a aVar, C12312f fVar) {
        return new C11277a(this.f43355a.mo35234h0(socketAddress, aVar, fVar), aVar.mo35331a());
    }

    /* renamed from: n1 */
    public ScheduledExecutorService mo35235n1() {
        return this.f43355a.mo35235n1();
    }
}
