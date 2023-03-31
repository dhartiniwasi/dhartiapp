package p264io.grpc.internal;

import p182a7.C6431n;
import p264io.grpc.internal.C11333r;
import p343rc.C12292c;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.g0 */
/* compiled from: FailingClientTransport */
class C11194g0 implements C11351s {

    /* renamed from: a */
    final C12335j1 f43101a;

    /* renamed from: b */
    private final C11333r.C11334a f43102b;

    C11194g0(C12335j1 j1Var, C11333r.C11334a aVar) {
        C6431n.m37552e(!j1Var.mo37028o(), "error must not be OK");
        this.f43101a = j1Var;
        this.f43102b = aVar;
    }

    /* renamed from: b */
    public C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
        return new C11181f0(this.f43101a, this.f43102b, kVarArr);
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
