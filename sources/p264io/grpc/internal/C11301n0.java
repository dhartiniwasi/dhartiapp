package p264io.grpc.internal;

import p182a7.C6419h;
import p182a7.C6431n;
import p343rc.C12276a1;

/* renamed from: io.grpc.internal.n0 */
/* compiled from: ForwardingNameResolver */
abstract class C11301n0 extends C12276a1 {

    /* renamed from: a */
    private final C12276a1 f43429a;

    C11301n0(C12276a1 a1Var) {
        C6431n.m37562o(a1Var, "delegate can not be null");
        this.f43429a = a1Var;
    }

    /* renamed from: b */
    public void mo34989b() {
        this.f43429a.mo34989b();
    }

    /* renamed from: c */
    public void mo34990c() {
        this.f43429a.mo34990c();
    }

    /* renamed from: d */
    public void mo34991d(C12276a1.C12282e eVar) {
        this.f43429a.mo34991d(eVar);
    }

    @Deprecated
    /* renamed from: e */
    public void mo35257e(C12276a1.C12283f fVar) {
        this.f43429a.mo35257e(fVar);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", this.f43429a).toString();
    }
}
