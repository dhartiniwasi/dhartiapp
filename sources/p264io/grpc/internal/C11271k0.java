package p264io.grpc.internal;

import java.util.concurrent.Executor;
import p182a7.C6419h;
import p264io.grpc.internal.C11272k1;
import p264io.grpc.internal.C11351s;
import p343rc.C12292c;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.k0 */
/* compiled from: ForwardingConnectionClientTransport */
abstract class C11271k0 implements C11376v {
    C11271k0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11376v mo35230a();

    /* renamed from: b */
    public C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
        return mo35230a().mo34932b(z0Var, y0Var, cVar, kVarArr);
    }

    /* renamed from: c */
    public Runnable mo34933c(C11272k1.C11273a aVar) {
        return mo35230a().mo34933c(aVar);
    }

    /* renamed from: d */
    public void mo34934d(C12335j1 j1Var) {
        mo35230a().mo34934d(j1Var);
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        return mo35230a().mo34935f();
    }

    /* renamed from: g */
    public void mo34936g(C12335j1 j1Var) {
        mo35230a().mo34936g(j1Var);
    }

    /* renamed from: h */
    public void mo35231h(C11351s.C11352a aVar, Executor executor) {
        mo35230a().mo35231h(aVar, executor);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", mo35230a()).toString();
    }
}
