package p264io.grpc.internal;

import p182a7.C6431n;
import p264io.grpc.internal.C11333r;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.f0 */
/* compiled from: FailingClientStream */
public final class C11181f0 extends C11309o1 {

    /* renamed from: b */
    private boolean f43077b;

    /* renamed from: c */
    private final C12335j1 f43078c;

    /* renamed from: d */
    private final C11333r.C11334a f43079d;

    /* renamed from: e */
    private final C12340k[] f43080e;

    public C11181f0(C12335j1 j1Var, C12340k[] kVarArr) {
        this(j1Var, C11333r.C11334a.PROCESSED, kVarArr);
    }

    /* renamed from: h */
    public void mo34899h(C11389x0 x0Var) {
        x0Var.mo35389b("error", this.f43078c).mo35389b("progress", this.f43079d);
    }

    /* renamed from: k */
    public void mo34902k(C11333r rVar) {
        C6431n.m37568u(!this.f43077b, "already started");
        this.f43077b = true;
        for (C12340k i : this.f43080e) {
            i.mo37062i(this.f43078c);
        }
        rVar.mo34975d(this.f43078c, this.f43079d, new C12411y0());
    }

    public C11181f0(C12335j1 j1Var, C11333r.C11334a aVar, C12340k[] kVarArr) {
        C6431n.m37552e(!j1Var.mo37028o(), "error must not be OK");
        this.f43078c = j1Var;
        this.f43079d = aVar;
        this.f43080e = kVarArr;
    }
}
