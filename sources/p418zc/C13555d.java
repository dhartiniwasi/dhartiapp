package p418zc;

import p182a7.C6419h;
import p182a7.C6431n;
import p343rc.C12335j1;
import p343rc.C12367p;
import p343rc.C12376r0;

/* renamed from: zc.d */
/* compiled from: GracefulSwitchLoadBalancer */
public final class C13555d extends C13552a {

    /* renamed from: l */
    static final C12376r0.C12387i f48070l = new C13559c();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12376r0 f48071c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12376r0.C12381d f48072d;

    /* renamed from: e */
    private C12376r0.C12380c f48073e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12376r0 f48074f;

    /* renamed from: g */
    private C12376r0.C12380c f48075g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12376r0 f48076h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12367p f48077i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12376r0.C12387i f48078j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f48079k;

    /* renamed from: zc.d$a */
    /* compiled from: GracefulSwitchLoadBalancer */
    class C13556a extends C12376r0 {

        /* renamed from: zc.d$a$a */
        /* compiled from: GracefulSwitchLoadBalancer */
        class C13557a extends C12376r0.C12387i {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f48081a;

            C13557a(C12335j1 j1Var) {
                this.f48081a = j1Var;
            }

            /* renamed from: a */
            public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
                return C12376r0.C12382e.m59229f(this.f48081a);
            }

            public String toString() {
                return C6419h.m37527b(C13557a.class).mo21842d("error", this.f48081a).toString();
            }
        }

        C13556a() {
        }

        /* renamed from: c */
        public void mo35214c(C12335j1 j1Var) {
            C13555d.this.f48072d.mo35126f(C12367p.TRANSIENT_FAILURE, new C13557a(j1Var));
        }

        /* renamed from: d */
        public void mo35215d(C12376r0.C12384g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        /* renamed from: f */
        public void mo35216f() {
        }
    }

    /* renamed from: zc.d$b */
    /* compiled from: GracefulSwitchLoadBalancer */
    class C13558b extends C13553b {

        /* renamed from: a */
        C12376r0 f48083a;

        C13558b() {
        }

        /* renamed from: f */
        public void mo35126f(C12367p pVar, C12376r0.C12387i iVar) {
            if (this.f48083a == C13555d.this.f48076h) {
                C6431n.m37568u(C13555d.this.f48079k, "there's pending lb while current lb has been out of READY");
                C12367p unused = C13555d.this.f48077i = pVar;
                C12376r0.C12387i unused2 = C13555d.this.f48078j = iVar;
                if (pVar == C12367p.READY) {
                    C13555d.this.m62792q();
                }
            } else if (this.f48083a == C13555d.this.f48074f) {
                boolean unused3 = C13555d.this.f48079k = pVar == C12367p.READY;
                if (C13555d.this.f48079k || C13555d.this.f48076h == C13555d.this.f48071c) {
                    C13555d.this.f48072d.mo35126f(pVar, iVar);
                } else {
                    C13555d.this.m62792q();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C12376r0.C12381d mo38675g() {
            return C13555d.this.f48072d;
        }
    }

    /* renamed from: zc.d$c */
    /* compiled from: GracefulSwitchLoadBalancer */
    class C13559c extends C12376r0.C12387i {
        C13559c() {
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return C12376r0.C12382e.m59230g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public C13555d(C12376r0.C12381d dVar) {
        C13556a aVar = new C13556a();
        this.f48071c = aVar;
        this.f48074f = aVar;
        this.f48076h = aVar;
        this.f48072d = (C12376r0.C12381d) C6431n.m37562o(dVar, "helper");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m62792q() {
        this.f48072d.mo35126f(this.f48077i, this.f48078j);
        this.f48074f.mo35216f();
        this.f48074f = this.f48076h;
        this.f48073e = this.f48075g;
        this.f48076h = this.f48071c;
        this.f48075g = null;
    }

    /* renamed from: f */
    public void mo35216f() {
        this.f48076h.mo35216f();
        this.f48074f.mo35216f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C12376r0 mo38673g() {
        C12376r0 r0Var = this.f48076h;
        return r0Var == this.f48071c ? this.f48074f : r0Var;
    }

    /* renamed from: r */
    public void mo38679r(C12376r0.C12380c cVar) {
        C6431n.m37562o(cVar, "newBalancerFactory");
        if (!cVar.equals(this.f48075g)) {
            this.f48076h.mo35216f();
            this.f48076h = this.f48071c;
            this.f48075g = null;
            this.f48077i = C12367p.CONNECTING;
            this.f48078j = f48070l;
            if (!cVar.equals(this.f48073e)) {
                C13558b bVar = new C13558b();
                C12376r0 a = cVar.mo35326a(bVar);
                bVar.f48083a = a;
                this.f48076h = a;
                this.f48075g = cVar;
                if (!this.f48079k) {
                    m62792q();
                }
            }
        }
    }
}
