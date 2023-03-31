package p264io.grpc.internal;

import p182a7.C6431n;
import p343rc.C12287b;
import p343rc.C12292c;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12372r;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.n1 */
/* compiled from: MetadataApplierImpl */
final class C11302n1 extends C12287b.C12288a {

    /* renamed from: a */
    private final C11351s f43430a;

    /* renamed from: b */
    private final C12423z0<?, ?> f43431b;

    /* renamed from: c */
    private final C12411y0 f43432c;

    /* renamed from: d */
    private final C12292c f43433d;

    /* renamed from: e */
    private final C12372r f43434e;

    /* renamed from: f */
    private final C11303a f43435f;

    /* renamed from: g */
    private final C12340k[] f43436g;

    /* renamed from: h */
    private final Object f43437h = new Object();

    /* renamed from: i */
    private C11329q f43438i;

    /* renamed from: j */
    boolean f43439j;

    /* renamed from: k */
    C11115b0 f43440k;

    /* renamed from: io.grpc.internal.n1$a */
    /* compiled from: MetadataApplierImpl */
    public interface C11303a {
        /* renamed from: a */
        void mo35236a();
    }

    C11302n1(C11351s sVar, C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C11303a aVar, C12340k[] kVarArr) {
        this.f43430a = sVar;
        this.f43431b = z0Var;
        this.f43432c = y0Var;
        this.f43433d = cVar;
        this.f43434e = C12372r.m59190e();
        this.f43435f = aVar;
        this.f43436g = kVarArr;
    }

    /* renamed from: c */
    private void m55670c(C11329q qVar) {
        boolean z;
        boolean z2 = true;
        C6431n.m37568u(!this.f43439j, "already finalized");
        this.f43439j = true;
        synchronized (this.f43437h) {
            if (this.f43438i == null) {
                this.f43438i = qVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f43435f.mo35236a();
            return;
        }
        if (this.f43440k == null) {
            z2 = false;
        }
        C6431n.m37568u(z2, "delayedStream is null");
        Runnable w = this.f43440k.mo34957w(qVar);
        if (w != null) {
            w.run();
        }
        this.f43435f.mo35236a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo35259a(C12411y0 y0Var) {
        C6431n.m37568u(!this.f43439j, "apply() or fail() already called");
        C6431n.m37562o(y0Var, "headers");
        this.f43432c.mo37169m(y0Var);
        C12372r b = this.f43434e.mo37086b();
        try {
            C11329q b2 = this.f43430a.mo34932b(this.f43431b, this.f43432c, this.f43433d, this.f43436g);
            this.f43434e.mo37088f(b);
            m55670c(b2);
        } catch (Throwable th) {
            this.f43434e.mo37088f(b);
            throw th;
        }
    }

    /* renamed from: b */
    public void mo35260b(C12335j1 j1Var) {
        C6431n.m37552e(!j1Var.mo37028o(), "Cannot fail with OK status");
        C6431n.m37568u(!this.f43439j, "apply() or fail() already called");
        m55670c(new C11181f0(C11335r0.m55807n(j1Var), this.f43436g));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C11329q mo35261d() {
        synchronized (this.f43437h) {
            C11329q qVar = this.f43438i;
            if (qVar != null) {
                return qVar;
            }
            C11115b0 b0Var = new C11115b0();
            this.f43440k = b0Var;
            this.f43438i = b0Var;
            return b0Var;
        }
    }
}
