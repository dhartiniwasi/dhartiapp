package p264io.grpc.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p182a7.C6419h;
import p182a7.C6431n;
import p343rc.C12335j1;
import p343rc.C12367p;
import p343rc.C12370q;
import p343rc.C12376r0;
import p343rc.C12406x;

/* renamed from: io.grpc.internal.r1 */
/* compiled from: PickFirstLoadBalancer */
final class C11345r1 extends C12376r0 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12376r0.C12381d f43570c;

    /* renamed from: d */
    private C12376r0.C12386h f43571d;

    /* renamed from: io.grpc.internal.r1$a */
    /* compiled from: PickFirstLoadBalancer */
    class C11346a implements C12376r0.C12388j {

        /* renamed from: a */
        final /* synthetic */ C12376r0.C12386h f43572a;

        C11346a(C12376r0.C12386h hVar) {
            this.f43572a = hVar;
        }

        /* renamed from: a */
        public void mo35316a(C12370q qVar) {
            C11345r1.this.m55836i(this.f43572a, qVar);
        }
    }

    /* renamed from: io.grpc.internal.r1$b */
    /* compiled from: PickFirstLoadBalancer */
    static /* synthetic */ class C11347b {

        /* renamed from: a */
        static final /* synthetic */ int[] f43574a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                rc.p[] r0 = p343rc.C12367p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43574a = r0
                rc.p r1 = p343rc.C12367p.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43574a     // Catch:{ NoSuchFieldError -> 0x001d }
                rc.p r1 = p343rc.C12367p.CONNECTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43574a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rc.p r1 = p343rc.C12367p.READY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43574a     // Catch:{ NoSuchFieldError -> 0x0033 }
                rc.p r1 = p343rc.C12367p.TRANSIENT_FAILURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11345r1.C11347b.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.r1$c */
    /* compiled from: PickFirstLoadBalancer */
    private static final class C11348c extends C12376r0.C12387i {

        /* renamed from: a */
        private final C12376r0.C12382e f43575a;

        C11348c(C12376r0.C12382e eVar) {
            this.f43575a = (C12376r0.C12382e) C6431n.m37562o(eVar, "result");
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return this.f43575a;
        }

        public String toString() {
            return C6419h.m37527b(C11348c.class).mo21842d("result", this.f43575a).toString();
        }
    }

    /* renamed from: io.grpc.internal.r1$d */
    /* compiled from: PickFirstLoadBalancer */
    private final class C11349d extends C12376r0.C12387i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12376r0.C12386h f43576a;

        /* renamed from: b */
        private final AtomicBoolean f43577b = new AtomicBoolean(false);

        /* renamed from: io.grpc.internal.r1$d$a */
        /* compiled from: PickFirstLoadBalancer */
        class C11350a implements Runnable {
            C11350a() {
            }

            public void run() {
                C11349d.this.f43576a.mo35166e();
            }
        }

        C11349d(C12376r0.C12386h hVar) {
            this.f43576a = (C12376r0.C12386h) C6431n.m37562o(hVar, "subchannel");
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            if (this.f43577b.compareAndSet(false, true)) {
                C11345r1.this.f43570c.mo35124d().execute(new C11350a());
            }
            return C12376r0.C12382e.m59230g();
        }
    }

    C11345r1(C12376r0.C12381d dVar) {
        this.f43570c = (C12376r0.C12381d) C6431n.m37562o(dVar, "helper");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m55836i(C12376r0.C12386h hVar, C12370q qVar) {
        C12376r0.C12387i iVar;
        C12376r0.C12387i iVar2;
        C12367p c = qVar.mo37080c();
        if (c != C12367p.SHUTDOWN) {
            if (qVar.mo37080c() == C12367p.TRANSIENT_FAILURE || qVar.mo37080c() == C12367p.IDLE) {
                this.f43570c.mo35125e();
            }
            int i = C11347b.f43574a[c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    iVar = new C11348c(C12376r0.C12382e.m59230g());
                } else if (i == 3) {
                    iVar2 = new C11348c(C12376r0.C12382e.m59231h(hVar));
                } else if (i == 4) {
                    iVar = new C11348c(C12376r0.C12382e.m59229f(qVar.mo37081d()));
                } else {
                    throw new IllegalArgumentException("Unsupported state:" + c);
                }
                this.f43570c.mo35126f(c, iVar);
            }
            iVar2 = new C11349d(hVar);
            iVar = iVar2;
            this.f43570c.mo35126f(c, iVar);
        }
    }

    /* renamed from: a */
    public boolean mo35213a(C12376r0.C12384g gVar) {
        List<C12406x> a = gVar.mo37109a();
        if (a.isEmpty()) {
            C12335j1 j1Var = C12335j1.f45621u;
            mo35214c(j1Var.mo37030q("NameResolver returned no usable address. addrs=" + gVar.mo37109a() + ", attrs=" + gVar.mo37110b()));
            return false;
        }
        C12376r0.C12386h hVar = this.f43571d;
        if (hVar == null) {
            C12376r0.C12386h a2 = this.f43570c.mo35121a(C12376r0.C12378b.m59211c().mo37099d(a).mo37098b());
            a2.mo35168g(new C11346a(a2));
            this.f43571d = a2;
            this.f43570c.mo35126f(C12367p.CONNECTING, new C11348c(C12376r0.C12382e.m59231h(a2)));
            a2.mo35166e();
            return true;
        }
        hVar.mo35169h(a);
        return true;
    }

    /* renamed from: c */
    public void mo35214c(C12335j1 j1Var) {
        C12376r0.C12386h hVar = this.f43571d;
        if (hVar != null) {
            hVar.mo35167f();
            this.f43571d = null;
        }
        this.f43570c.mo35126f(C12367p.TRANSIENT_FAILURE, new C11348c(C12376r0.C12382e.m59229f(j1Var)));
    }

    /* renamed from: e */
    public void mo35315e() {
        C12376r0.C12386h hVar = this.f43571d;
        if (hVar != null) {
            hVar.mo35166e();
        }
    }

    /* renamed from: f */
    public void mo35216f() {
        C12376r0.C12386h hVar = this.f43571d;
        if (hVar != null) {
            hVar.mo35167f();
        }
    }
}
