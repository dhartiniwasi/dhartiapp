package p147u1;

import android.content.Context;
import java.util.concurrent.Executor;
import p105o1.C5154e;
import p112p1.C5259b;
import p153v1.C5760c;
import p153v1.C5761d;
import p159w1.C5889b;
import p165x1.C6034a;
import p234fd.C10201a;

/* renamed from: u1.t */
/* compiled from: Uploader_Factory */
public final class C5705t implements C5259b<C5704s> {

    /* renamed from: a */
    private final C10201a<Context> f28479a;

    /* renamed from: b */
    private final C10201a<C5154e> f28480b;

    /* renamed from: c */
    private final C10201a<C5761d> f28481c;

    /* renamed from: d */
    private final C10201a<C5708y> f28482d;

    /* renamed from: e */
    private final C10201a<Executor> f28483e;

    /* renamed from: f */
    private final C10201a<C5889b> f28484f;

    /* renamed from: g */
    private final C10201a<C6034a> f28485g;

    /* renamed from: h */
    private final C10201a<C6034a> f28486h;

    /* renamed from: i */
    private final C10201a<C5760c> f28487i;

    public C5705t(C10201a<Context> aVar, C10201a<C5154e> aVar2, C10201a<C5761d> aVar3, C10201a<C5708y> aVar4, C10201a<Executor> aVar5, C10201a<C5889b> aVar6, C10201a<C6034a> aVar7, C10201a<C6034a> aVar8, C10201a<C5760c> aVar9) {
        this.f28479a = aVar;
        this.f28480b = aVar2;
        this.f28481c = aVar3;
        this.f28482d = aVar4;
        this.f28483e = aVar5;
        this.f28484f = aVar6;
        this.f28485g = aVar7;
        this.f28486h = aVar8;
        this.f28487i = aVar9;
    }

    /* renamed from: a */
    public static C5705t m34029a(C10201a<Context> aVar, C10201a<C5154e> aVar2, C10201a<C5761d> aVar3, C10201a<C5708y> aVar4, C10201a<Executor> aVar5, C10201a<C5889b> aVar6, C10201a<C6034a> aVar7, C10201a<C6034a> aVar8, C10201a<C5760c> aVar9) {
        return new C5705t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    /* renamed from: c */
    public static C5704s m34030c(Context context, C5154e eVar, C5761d dVar, C5708y yVar, Executor executor, C5889b bVar, C6034a aVar, C6034a aVar2, C5760c cVar) {
        return new C5704s(context, eVar, dVar, yVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public C5704s get() {
        return m34030c(this.f28479a.get(), this.f28480b.get(), this.f28481c.get(), this.f28482d.get(), this.f28483e.get(), this.f28484f.get(), this.f28485g.get(), this.f28486h.get(), this.f28487i.get());
    }
}
