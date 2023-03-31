package p264io.grpc.internal;

import p182a7.C6419h;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11333r;
import p343rc.C12335j1;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.j0 */
/* compiled from: ForwardingClientStreamListener */
abstract class C11263j0 implements C11333r {
    C11263j0() {
    }

    /* renamed from: a */
    public void mo34972a(C11274k2.C11275a aVar) {
        mo35217e().mo34972a(aVar);
    }

    /* renamed from: b */
    public void mo34973b(C12411y0 y0Var) {
        mo35217e().mo34973b(y0Var);
    }

    /* renamed from: c */
    public void mo34974c() {
        mo35217e().mo34974c();
    }

    /* renamed from: d */
    public void mo34975d(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
        mo35217e().mo34975d(j1Var, aVar, y0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C11333r mo35217e();

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", mo35217e()).toString();
    }
}
