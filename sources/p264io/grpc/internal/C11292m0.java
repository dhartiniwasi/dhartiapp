package p264io.grpc.internal;

import java.util.concurrent.TimeUnit;
import p182a7.C6419h;
import p343rc.C12292c;
import p343rc.C12319g;
import p343rc.C12367p;
import p343rc.C12399u0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.m0 */
/* compiled from: ForwardingManagedChannel */
abstract class C11292m0 extends C12399u0 {

    /* renamed from: a */
    private final C12399u0 f43406a;

    C11292m0(C12399u0 u0Var) {
        this.f43406a = u0Var;
    }

    /* renamed from: a */
    public String mo35080a() {
        return this.f43406a.mo35080a();
    }

    /* renamed from: e */
    public <RequestT, ResponseT> C12319g<RequestT, ResponseT> mo35081e(C12423z0<RequestT, ResponseT> z0Var, C12292c cVar) {
        return this.f43406a.mo35081e(z0Var, cVar);
    }

    /* renamed from: i */
    public boolean mo35082i(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f43406a.mo35082i(j, timeUnit);
    }

    /* renamed from: j */
    public void mo35083j() {
        this.f43406a.mo35083j();
    }

    /* renamed from: k */
    public C12367p mo35084k(boolean z) {
        return this.f43406a.mo35084k(z);
    }

    /* renamed from: l */
    public void mo35085l(C12367p pVar, Runnable runnable) {
        this.f43406a.mo35085l(pVar, runnable);
    }

    /* renamed from: m */
    public C12399u0 mo35086m() {
        return this.f43406a.mo35086m();
    }

    /* renamed from: n */
    public C12399u0 mo35087n() {
        return this.f43406a.mo35087n();
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", this.f43406a).toString();
    }
}
