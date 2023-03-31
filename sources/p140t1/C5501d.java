package p140t1;

import java.util.concurrent.Executor;
import p105o1.C5154e;
import p112p1.C5259b;
import p147u1.C5708y;
import p153v1.C5761d;
import p159w1.C5889b;
import p234fd.C10201a;

/* renamed from: t1.d */
/* compiled from: DefaultScheduler_Factory */
public final class C5501d implements C5259b<C5500c> {

    /* renamed from: a */
    private final C10201a<Executor> f27967a;

    /* renamed from: b */
    private final C10201a<C5154e> f27968b;

    /* renamed from: c */
    private final C10201a<C5708y> f27969c;

    /* renamed from: d */
    private final C10201a<C5761d> f27970d;

    /* renamed from: e */
    private final C10201a<C5889b> f27971e;

    public C5501d(C10201a<Executor> aVar, C10201a<C5154e> aVar2, C10201a<C5708y> aVar3, C10201a<C5761d> aVar4, C10201a<C5889b> aVar5) {
        this.f27967a = aVar;
        this.f27968b = aVar2;
        this.f27969c = aVar3;
        this.f27970d = aVar4;
        this.f27971e = aVar5;
    }

    /* renamed from: a */
    public static C5501d m33462a(C10201a<Executor> aVar, C10201a<C5154e> aVar2, C10201a<C5708y> aVar3, C10201a<C5761d> aVar4, C10201a<C5889b> aVar5) {
        return new C5501d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C5500c m33463c(Executor executor, C5154e eVar, C5708y yVar, C5761d dVar, C5889b bVar) {
        return new C5500c(executor, eVar, yVar, dVar, bVar);
    }

    /* renamed from: b */
    public C5500c get() {
        return m33463c(this.f27967a.get(), this.f27968b.get(), this.f27969c.get(), this.f27970d.get(), this.f27971e.get());
    }
}
