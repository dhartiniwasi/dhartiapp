package p264io.grpc.internal;

import java.util.List;
import java.util.Map;
import p182a7.C6419h;
import p182a7.C6431n;
import p264io.grpc.internal.C11169e2;
import p343rc.C12276a1;
import p343rc.C12312f;
import p343rc.C12335j1;
import p343rc.C12367p;
import p343rc.C12376r0;
import p343rc.C12390s0;
import p343rc.C12396t0;

/* renamed from: io.grpc.internal.j */
/* compiled from: AutoConfiguredLoadBalancerFactory */
public final class C11256j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12396t0 f43334a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f43335b;

    /* renamed from: io.grpc.internal.j$b */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    public final class C11258b {

        /* renamed from: a */
        private final C12376r0.C12381d f43336a;

        /* renamed from: b */
        private C12376r0 f43337b;

        /* renamed from: c */
        private C12390s0 f43338c;

        C11258b(C12376r0.C12381d dVar) {
            this.f43336a = dVar;
            C12390s0 d = C11256j.this.f43334a.mo37136d(C11256j.this.f43335b);
            this.f43338c = d;
            if (d != null) {
                this.f43337b = d.mo35326a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C11256j.this.f43335b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        /* renamed from: a */
        public C12376r0 mo35207a() {
            return this.f43337b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo35208b(C12335j1 j1Var) {
            mo35207a().mo35214c(j1Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35209c() {
            mo35207a().mo35315e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo35210d() {
            this.f43337b.mo35216f();
            this.f43337b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo35211e(C12376r0.C12384g gVar) {
            C11169e2.C11171b bVar = (C11169e2.C11171b) gVar.mo37111c();
            if (bVar == null) {
                try {
                    C11256j jVar = C11256j.this;
                    bVar = new C11169e2.C11171b(jVar.m55528d(jVar.f43335b, "using default policy"), (Object) null);
                } catch (C11262f e) {
                    this.f43336a.mo35126f(C12367p.TRANSIENT_FAILURE, new C11260d(C12335j1.f45620t.mo37030q(e.getMessage())));
                    this.f43337b.mo35216f();
                    this.f43338c = null;
                    this.f43337b = new C11261e();
                    return true;
                }
            }
            if (this.f43338c == null || !bVar.f43059a.mo35327b().equals(this.f43338c.mo35327b())) {
                this.f43336a.mo35126f(C12367p.CONNECTING, new C11259c());
                this.f43337b.mo35216f();
                C12390s0 s0Var = bVar.f43059a;
                this.f43338c = s0Var;
                C12376r0 r0Var = this.f43337b;
                this.f43337b = s0Var.mo35326a(this.f43336a);
                this.f43336a.mo35122b().mo35256b(C12312f.C12313a.INFO, "Load balancer changed from {0} to {1}", r0Var.getClass().getSimpleName(), this.f43337b.getClass().getSimpleName());
            }
            Object obj = bVar.f43060b;
            if (obj != null) {
                this.f43336a.mo35122b().mo35256b(C12312f.C12313a.DEBUG, "Load-balancing config: {0}", bVar.f43060b);
            }
            return mo35207a().mo35213a(C12376r0.C12384g.m59240d().mo37117b(gVar.mo37109a()).mo37118c(gVar.mo37110b()).mo37119d(obj).mo37116a());
        }
    }

    /* renamed from: io.grpc.internal.j$c */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C11259c extends C12376r0.C12387i {
        private C11259c() {
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return C12376r0.C12382e.m59230g();
        }

        public String toString() {
            return C6419h.m37527b(C11259c.class).toString();
        }
    }

    /* renamed from: io.grpc.internal.j$d */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C11260d extends C12376r0.C12387i {

        /* renamed from: a */
        private final C12335j1 f43340a;

        C11260d(C12335j1 j1Var) {
            this.f43340a = j1Var;
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return C12376r0.C12382e.m59229f(this.f43340a);
        }
    }

    /* renamed from: io.grpc.internal.j$e */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C11261e extends C12376r0 {
        private C11261e() {
        }

        /* renamed from: a */
        public boolean mo35213a(C12376r0.C12384g gVar) {
            return true;
        }

        /* renamed from: c */
        public void mo35214c(C12335j1 j1Var) {
        }

        @Deprecated
        /* renamed from: d */
        public void mo35215d(C12376r0.C12384g gVar) {
        }

        /* renamed from: f */
        public void mo35216f() {
        }
    }

    /* renamed from: io.grpc.internal.j$f */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    static final class C11262f extends Exception {
        private C11262f(String str) {
            super(str);
        }
    }

    public C11256j(String str) {
        this(C12396t0.m59277b(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C12390s0 m55528d(String str, String str2) throws C11262f {
        C12390s0 d = this.f43334a.mo37136d(str);
        if (d != null) {
            return d;
        }
        throw new C11262f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* renamed from: e */
    public C11258b mo35205e(C12376r0.C12381d dVar) {
        return new C11258b(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12276a1.C12280c mo35206f(Map<String, ?> map) {
        List<C11169e2.C11170a> list;
        if (map != null) {
            try {
                list = C11169e2.m55238A(C11169e2.m55245g(map));
            } catch (RuntimeException e) {
                return C12276a1.C12280c.m58964b(C12335j1.f45608h.mo37030q("can't parse load balancer configuration").mo37029p(e));
            }
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return C11169e2.m55263y(list, this.f43334a);
    }

    C11256j(C12396t0 t0Var, String str) {
        this.f43334a = (C12396t0) C6431n.m37562o(t0Var, "registry");
        this.f43335b = (String) C6431n.m37562o(str, "defaultPolicy");
    }
}
