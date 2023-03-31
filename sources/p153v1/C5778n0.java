package p153v1;

import p112p1.C5259b;
import p165x1.C6034a;
import p234fd.C10201a;

/* renamed from: v1.n0 */
/* compiled from: SQLiteEventStore_Factory */
public final class C5778n0 implements C5259b<C5773m0> {

    /* renamed from: a */
    private final C10201a<C6034a> f28749a;

    /* renamed from: b */
    private final C10201a<C6034a> f28750b;

    /* renamed from: c */
    private final C10201a<C5762e> f28751c;

    /* renamed from: d */
    private final C10201a<C5779t0> f28752d;

    /* renamed from: e */
    private final C10201a<String> f28753e;

    public C5778n0(C10201a<C6034a> aVar, C10201a<C6034a> aVar2, C10201a<C5762e> aVar3, C10201a<C5779t0> aVar4, C10201a<String> aVar5) {
        this.f28749a = aVar;
        this.f28750b = aVar2;
        this.f28751c = aVar3;
        this.f28752d = aVar4;
        this.f28753e = aVar5;
    }

    /* renamed from: a */
    public static C5778n0 m34487a(C10201a<C6034a> aVar, C10201a<C6034a> aVar2, C10201a<C5762e> aVar3, C10201a<C5779t0> aVar4, C10201a<String> aVar5) {
        return new C5778n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C5773m0 m34488c(C6034a aVar, C6034a aVar2, Object obj, Object obj2, C10201a<String> aVar3) {
        return new C5773m0(aVar, aVar2, (C5762e) obj, (C5779t0) obj2, aVar3);
    }

    /* renamed from: b */
    public C5773m0 get() {
        return m34488c(this.f28749a.get(), this.f28750b.get(), this.f28751c.get(), this.f28752d.get(), this.f28753e);
    }
}
