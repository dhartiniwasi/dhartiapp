package p238g8;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p238g8.C10268q0;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10449g0;
import p247h8.C10462r;
import p247h8.C10468v;
import p343rc.C12319g;
import p343rc.C12335j1;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: g8.c */
/* compiled from: AbstractStream */
abstract class C10224c<ReqT, RespT, CallbackT extends C10268q0> {

    /* renamed from: n */
    private static final long f40679n;

    /* renamed from: o */
    private static final long f40680o;

    /* renamed from: p */
    private static final long f40681p;

    /* renamed from: q */
    private static final long f40682q;

    /* renamed from: r */
    private static final long f40683r;

    /* renamed from: a */
    private C10442g.C10444b f40684a;

    /* renamed from: b */
    private C10442g.C10444b f40685b;

    /* renamed from: c */
    private final C10285v f40686c;

    /* renamed from: d */
    private final C12423z0<ReqT, RespT> f40687d;

    /* renamed from: e */
    private final C10224c<ReqT, RespT, CallbackT>.C1583b f40688e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10442g f40689f;

    /* renamed from: g */
    private final C10442g.C10448d f40690g;

    /* renamed from: h */
    private final C10442g.C10448d f40691h;

    /* renamed from: i */
    private C10266p0 f40692i = C10266p0.Initial;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f40693j = 0;

    /* renamed from: k */
    private C12319g<ReqT, RespT> f40694k;

    /* renamed from: l */
    final C10462r f40695l;

    /* renamed from: m */
    final CallbackT f40696m;

    /* renamed from: g8.c$a */
    /* compiled from: AbstractStream */
    class C10225a {

        /* renamed from: a */
        private final long f40697a;

        C10225a(long j) {
            this.f40697a = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32925a(Runnable runnable) {
            C10224c.this.f40689f.mo33527w();
            if (C10224c.this.f40693j == this.f40697a) {
                runnable.run();
            } else {
                C10468v.m52767a(C10224c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* renamed from: g8.c$b */
    /* compiled from: AbstractStream */
    class C10226b implements Runnable {
        C10226b() {
        }

        public void run() {
            C10224c.this.m51751j();
        }
    }

    /* renamed from: g8.c$c */
    /* compiled from: AbstractStream */
    class C10227c implements C10236g0<RespT> {

        /* renamed from: a */
        private final C10224c<ReqT, RespT, CallbackT>.C0000a f40700a;

        C10227c(C10224c<ReqT, RespT, CallbackT>.C0000a aVar) {
            this.f40700a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m51771i(C12335j1 j1Var) {
            if (j1Var.mo37028o()) {
                C10468v.m52767a(C10224c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(C10224c.this)));
            } else {
                C10468v.m52770d(C10224c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(C10224c.this)), j1Var);
            }
            C10224c.this.mo32915k(j1Var);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m51772j(C12411y0 y0Var) {
            if (C10468v.m52769c()) {
                HashMap hashMap = new HashMap();
                for (String next : y0Var.mo37168j()) {
                    if (C10256n.f40770e.contains(next.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(next, (String) y0Var.mo37166g(C12411y0.C12418g.m59361e(next, C12411y0.f45761e)));
                    }
                }
                if (!hashMap.isEmpty()) {
                    C10468v.m52767a(C10224c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(C10224c.this)), hashMap);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m51773k(Object obj) {
            if (C10468v.m52769c()) {
                C10468v.m52767a(C10224c.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(C10224c.this)), obj);
            }
            C10224c.this.mo32920r(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m51774l() {
            C10468v.m52767a(C10224c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(C10224c.this)));
            C10224c.this.m51754s();
        }

        /* renamed from: a */
        public void mo32927a() {
            this.f40700a.mo32925a(new C10229d(this));
        }

        /* renamed from: b */
        public void mo32928b(C12335j1 j1Var) {
            this.f40700a.mo32925a(new C10235g(this, j1Var));
        }

        /* renamed from: c */
        public void mo32929c(C12411y0 y0Var) {
            this.f40700a.mo32925a(new C10233f(this, y0Var));
        }

        /* renamed from: d */
        public void mo32930d(RespT respt) {
            this.f40700a.mo32925a(new C10231e(this, respt));
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f40679n = timeUnit.toMillis(1);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f40680o = timeUnit2.toMillis(1);
        f40681p = timeUnit2.toMillis(1);
        f40682q = timeUnit.toMillis(10);
        f40683r = timeUnit.toMillis(10);
    }

    C10224c(C10285v vVar, C12423z0<ReqT, RespT> z0Var, C10442g gVar, C10442g.C10448d dVar, C10442g.C10448d dVar2, C10442g.C10448d dVar3, CallbackT callbackt) {
        this.f40686c = vVar;
        this.f40687d = z0Var;
        C10442g gVar2 = gVar;
        this.f40689f = gVar2;
        this.f40690g = dVar2;
        this.f40691h = dVar3;
        this.f40696m = callbackt;
        this.f40688e = new C10226b();
        this.f40695l = new C10462r(gVar2, dVar, f40679n, 1.5d, f40680o);
    }

    /* renamed from: g */
    private void m51748g() {
        C10442g.C10444b bVar = this.f40684a;
        if (bVar != null) {
            bVar.mo33528c();
            this.f40684a = null;
        }
    }

    /* renamed from: h */
    private void m51749h() {
        C10442g.C10444b bVar = this.f40685b;
        if (bVar != null) {
            bVar.mo33528c();
            this.f40685b = null;
        }
    }

    /* renamed from: i */
    private void m51750i(C10266p0 p0Var, C12335j1 j1Var) {
        C10432b.m52648d(mo32918n(), "Only started streams should be closed.", new Object[0]);
        C10266p0 p0Var2 = C10266p0.Error;
        C10432b.m52648d(p0Var == p0Var2 || j1Var.mo37028o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f40689f.mo33527w();
        if (C10256n.m51895i(j1Var)) {
            C10449g0.m52716p(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", j1Var.mo37025l()));
        }
        m51749h();
        m51748g();
        this.f40695l.mo33547c();
        this.f40693j++;
        C12335j1.C12337b m = j1Var.mo37026m();
        if (m == C12335j1.C12337b.OK) {
            this.f40695l.mo33548f();
        } else if (m == C12335j1.C12337b.RESOURCE_EXHAUSTED) {
            C10468v.m52767a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f40695l.mo33549g();
        } else if (m == C12335j1.C12337b.UNAUTHENTICATED && this.f40692i != C10266p0.Healthy) {
            this.f40686c.mo33073h();
        } else if (m == C12335j1.C12337b.UNAVAILABLE && ((j1Var.mo37025l() instanceof UnknownHostException) || (j1Var.mo37025l() instanceof ConnectException))) {
            this.f40695l.mo33550h(f40683r);
        }
        if (p0Var != p0Var2) {
            C10468v.m52767a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            mo32923w();
        }
        if (this.f40694k != null) {
            if (j1Var.mo37028o()) {
                C10468v.m52767a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f40694k.mo33082b();
            }
            this.f40694k = null;
        }
        this.f40692i = p0Var;
        this.f40696m.mo33027b(j1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51751j() {
        if (mo32917m()) {
            m51750i(C10266p0.Initial, C12335j1.f45606f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m51752o() {
        if (mo32917m()) {
            this.f40692i = C10266p0.Healthy;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m51753p() {
        C10266p0 p0Var = this.f40692i;
        C10432b.m52648d(p0Var == C10266p0.Backoff, "State should still be backoff but was %s", p0Var);
        this.f40692i = C10266p0.Initial;
        mo32921u();
        C10432b.m52648d(mo32918n(), "Stream should have started", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m51754s() {
        this.f40692i = C10266p0.Open;
        this.f40696m.mo33026a();
        if (this.f40684a == null) {
            this.f40684a = this.f40689f.mo33520k(this.f40691h, f40682q, new C10222b(this));
        }
    }

    /* renamed from: t */
    private void m51755t() {
        C10432b.m52648d(this.f40692i == C10266p0.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f40692i = C10266p0.Backoff;
        this.f40695l.mo33546b(new C10220a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo32915k(C12335j1 j1Var) {
        C10432b.m52648d(mo32918n(), "Can't handle server close on non-started stream!", new Object[0]);
        m51750i(C10266p0.Error, j1Var);
    }

    /* renamed from: l */
    public void mo32916l() {
        C10432b.m52648d(!mo32918n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f40689f.mo33527w();
        this.f40692i = C10266p0.Initial;
        this.f40695l.mo33548f();
    }

    /* renamed from: m */
    public boolean mo32917m() {
        this.f40689f.mo33527w();
        C10266p0 p0Var = this.f40692i;
        return p0Var == C10266p0.Open || p0Var == C10266p0.Healthy;
    }

    /* renamed from: n */
    public boolean mo32918n() {
        this.f40689f.mo33527w();
        C10266p0 p0Var = this.f40692i;
        return p0Var == C10266p0.Starting || p0Var == C10266p0.Backoff || mo32917m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo32919q() {
        if (mo32917m() && this.f40685b == null) {
            this.f40685b = this.f40689f.mo33520k(this.f40690g, f40681p, this.f40688e);
        }
    }

    /* renamed from: r */
    public abstract void mo32920r(RespT respt);

    /* renamed from: u */
    public void mo32921u() {
        this.f40689f.mo33527w();
        boolean z = true;
        C10432b.m52648d(this.f40694k == null, "Last call still set", new Object[0]);
        C10432b.m52648d(this.f40685b == null, "Idle timer still set", new Object[0]);
        C10266p0 p0Var = this.f40692i;
        if (p0Var == C10266p0.Error) {
            m51755t();
            return;
        }
        if (p0Var != C10266p0.Initial) {
            z = false;
        }
        C10432b.m52648d(z, "Already started", new Object[0]);
        this.f40694k = this.f40686c.mo33074m(this.f40687d, new C10227c(new C10225a(this.f40693j)));
        this.f40692i = C10266p0.Starting;
    }

    /* renamed from: v */
    public void mo32922v() {
        if (mo32918n()) {
            m51750i(C10266p0.Initial, C12335j1.f45606f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo32923w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo32924x(ReqT reqt) {
        this.f40689f.mo33527w();
        C10468v.m52767a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        m51749h();
        this.f40694k.mo35102d(reqt);
    }
}
