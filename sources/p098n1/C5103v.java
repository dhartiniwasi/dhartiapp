package p098n1;

import p112p1.C5259b;
import p140t1.C5502e;
import p147u1.C5704s;
import p147u1.C5706w;
import p165x1.C6034a;
import p234fd.C10201a;

/* renamed from: n1.v */
/* compiled from: TransportRuntime_Factory */
public final class C5103v implements C5259b<C5100t> {

    /* renamed from: a */
    private final C10201a<C6034a> f26555a;

    /* renamed from: b */
    private final C10201a<C6034a> f26556b;

    /* renamed from: c */
    private final C10201a<C5502e> f26557c;

    /* renamed from: d */
    private final C10201a<C5704s> f26558d;

    /* renamed from: e */
    private final C10201a<C5706w> f26559e;

    public C5103v(C10201a<C6034a> aVar, C10201a<C6034a> aVar2, C10201a<C5502e> aVar3, C10201a<C5704s> aVar4, C10201a<C5706w> aVar5) {
        this.f26555a = aVar;
        this.f26556b = aVar2;
        this.f26557c = aVar3;
        this.f26558d = aVar4;
        this.f26559e = aVar5;
    }

    /* renamed from: a */
    public static C5103v m31915a(C10201a<C6034a> aVar, C10201a<C6034a> aVar2, C10201a<C5502e> aVar3, C10201a<C5704s> aVar4, C10201a<C5706w> aVar5) {
        return new C5103v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C5100t m31916c(C6034a aVar, C6034a aVar2, C5502e eVar, C5704s sVar, C5706w wVar) {
        return new C5100t(aVar, aVar2, eVar, sVar, wVar);
    }

    /* renamed from: b */
    public C5100t get() {
        return m31916c(this.f26555a.get(), this.f26556b.get(), this.f26557c.get(), this.f26558d.get(), this.f26559e.get());
    }
}
