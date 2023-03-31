package p140t1;

import android.content.Context;
import p112p1.C5259b;
import p112p1.C5261d;
import p147u1.C5699g;
import p147u1.C5708y;
import p153v1.C5761d;
import p165x1.C6034a;
import p234fd.C10201a;

/* renamed from: t1.i */
/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class C5506i implements C5259b<C5708y> {

    /* renamed from: a */
    private final C10201a<Context> f27973a;

    /* renamed from: b */
    private final C10201a<C5761d> f27974b;

    /* renamed from: c */
    private final C10201a<C5699g> f27975c;

    /* renamed from: d */
    private final C10201a<C6034a> f27976d;

    public C5506i(C10201a<Context> aVar, C10201a<C5761d> aVar2, C10201a<C5699g> aVar3, C10201a<C6034a> aVar4) {
        this.f27973a = aVar;
        this.f27974b = aVar2;
        this.f27975c = aVar3;
        this.f27976d = aVar4;
    }

    /* renamed from: a */
    public static C5506i m33471a(C10201a<Context> aVar, C10201a<C5761d> aVar2, C10201a<C5699g> aVar3, C10201a<C6034a> aVar4) {
        return new C5506i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C5708y m33472c(Context context, C5761d dVar, C5699g gVar, C6034a aVar) {
        return (C5708y) C5261d.m32478c(C5505h.m33470a(context, dVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5708y get() {
        return m33472c(this.f27973a.get(), this.f27974b.get(), this.f27975c.get(), this.f27976d.get());
    }
}
