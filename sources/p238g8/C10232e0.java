package p238g8;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p008a8.C6479m;
import p180z4.C6372g;
import p180z4.C6374h;
import p181a6.C6404a;
import p218e6.C9975i;
import p218e6.C9980l;
import p247h8.C10442g;
import p247h8.C10460p;
import p247h8.C10468v;
import p247h8.C10473y;
import p343rc.C12287b;
import p343rc.C12292c;
import p343rc.C12319g;
import p343rc.C12367p;
import p343rc.C12399u0;
import p343rc.C12402v0;
import p343rc.C12423z0;
import p352sc.C12506a;
import p405y8.C13150p;

/* renamed from: g8.e0 */
/* compiled from: GrpcCallProvider */
public class C10232e0 {

    /* renamed from: h */
    private static C10473y<C12402v0<?>> f40708h;

    /* renamed from: a */
    private C9975i<C12399u0> f40709a;

    /* renamed from: b */
    private final C10442g f40710b;

    /* renamed from: c */
    private C12292c f40711c;

    /* renamed from: d */
    private C10442g.C10444b f40712d;

    /* renamed from: e */
    private final Context f40713e;

    /* renamed from: f */
    private final C6479m f40714f;

    /* renamed from: g */
    private final C12287b f40715g;

    C10232e0(C10442g gVar, Context context, C6479m mVar, C12287b bVar) {
        this.f40710b = gVar;
        this.f40713e = context;
        this.f40714f = mVar;
        this.f40715g = bVar;
        m51788k();
    }

    /* renamed from: h */
    private void m51786h() {
        if (this.f40712d != null) {
            C10468v.m52767a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f40712d.mo33528c();
            this.f40712d = null;
        }
    }

    /* renamed from: j */
    private C12399u0 m51787j(Context context, C6479m mVar) {
        C12402v0<?> v0Var;
        try {
            C6404a.m37495a(context);
        } catch (IllegalStateException | C6372g | C6374h e) {
            C10468v.m52770d("GrpcCallProvider", "Failed to update ssl context: %s", e);
        }
        C10473y<C12402v0<?>> yVar = f40708h;
        if (yVar != null) {
            v0Var = yVar.get();
        } else {
            C12402v0<?> b = C12402v0.m59299b(mVar.mo22003b());
            if (!mVar.mo22005d()) {
                b.mo37144d();
            }
            v0Var = b;
        }
        v0Var.mo37143c(30, TimeUnit.SECONDS);
        return C12506a.m59650k(v0Var).mo37298i(context).mo34948a();
    }

    /* renamed from: k */
    private void m51788k() {
        this.f40709a = C9980l.m51029c(C10460p.f41439c, new C10230d0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ C9975i m51789l(C12423z0 z0Var, C9975i iVar) throws Exception {
        return C9980l.m51031e(((C12399u0) iVar.mo26358m()).mo35081e(z0Var, this.f40711c));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ C12399u0 m51791n() throws Exception {
        C12399u0 j = m51787j(this.f40713e, this.f40714f);
        this.f40710b.mo33521l(new C10223b0(this, j));
        this.f40711c = ((C13150p.C13152b) ((C13150p.C13152b) C13150p.m61720f(j).mo38370c(this.f40715g)).mo38371d(this.f40710b.mo33524o())).mo38369b();
        C10468v.m52767a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return j;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m51792o(C12399u0 u0Var) {
        C10468v.m52767a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        m51786h();
        m51797t(u0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m51794q(C12399u0 u0Var) {
        this.f40710b.mo33521l(new C10297y(this, u0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m51795r(C12399u0 u0Var) {
        u0Var.mo35087n();
        m51788k();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m51793p(C12399u0 u0Var) {
        C12367p k = u0Var.mo35084k(true);
        C10468v.m52767a("GrpcCallProvider", "Current gRPC connectivity state: " + k, new Object[0]);
        m51786h();
        if (k == C12367p.CONNECTING) {
            C10468v.m52767a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f40712d = this.f40710b.mo33520k(C10442g.C10448d.CONNECTIVITY_ATTEMPT_TIMER, 15000, new C10221a0(this, u0Var));
        }
        u0Var.mo35085l(k, new C10298z(this, u0Var));
    }

    /* renamed from: t */
    private void m51797t(C12399u0 u0Var) {
        this.f40710b.mo33521l(new C10228c0(this, u0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public <ReqT, RespT> C9975i<C12319g<ReqT, RespT>> mo32935i(C12423z0<ReqT, RespT> z0Var) {
        return this.f40709a.mo26356k(this.f40710b.mo33524o(), new C10296x(this, z0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo32936u() {
        Class<C10285v> cls = C10285v.class;
        try {
            C12399u0 u0Var = (C12399u0) C9980l.m51027a(this.f40709a);
            u0Var.mo35086m();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!u0Var.mo35082i(1, timeUnit)) {
                    C10468v.m52767a(cls.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                    u0Var.mo35087n();
                    if (!u0Var.mo35082i(60, timeUnit)) {
                        C10468v.m52770d(cls.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                u0Var.mo35087n();
                C10468v.m52770d(cls.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (ExecutionException e) {
            C10468v.m52770d(cls.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e);
        } catch (InterruptedException unused2) {
            C10468v.m52770d(cls.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
