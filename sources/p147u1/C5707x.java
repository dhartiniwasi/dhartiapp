package p147u1;

import java.util.concurrent.Executor;
import p112p1.C5259b;
import p153v1.C5761d;
import p159w1.C5889b;
import p234fd.C10201a;

/* renamed from: u1.x */
/* compiled from: WorkInitializer_Factory */
public final class C5707x implements C5259b<C5706w> {

    /* renamed from: a */
    private final C10201a<Executor> f28492a;

    /* renamed from: b */
    private final C10201a<C5761d> f28493b;

    /* renamed from: c */
    private final C10201a<C5708y> f28494c;

    /* renamed from: d */
    private final C10201a<C5889b> f28495d;

    public C5707x(C10201a<Executor> aVar, C10201a<C5761d> aVar2, C10201a<C5708y> aVar3, C10201a<C5889b> aVar4) {
        this.f28492a = aVar;
        this.f28493b = aVar2;
        this.f28494c = aVar3;
        this.f28495d = aVar4;
    }

    /* renamed from: a */
    public static C5707x m34037a(C10201a<Executor> aVar, C10201a<C5761d> aVar2, C10201a<C5708y> aVar3, C10201a<C5889b> aVar4) {
        return new C5707x(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C5706w m34038c(Executor executor, C5761d dVar, C5708y yVar, C5889b bVar) {
        return new C5706w(executor, dVar, yVar, bVar);
    }

    /* renamed from: b */
    public C5706w get() {
        return m34038c(this.f28492a.get(), this.f28493b.get(), this.f28494c.get(), this.f28495d.get());
    }
}
