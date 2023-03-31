package p140t1;

import p112p1.C5259b;
import p112p1.C5261d;
import p147u1.C5699g;
import p165x1.C6034a;
import p234fd.C10201a;

/* renamed from: t1.g */
/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class C5504g implements C5259b<C5699g> {

    /* renamed from: a */
    private final C10201a<C6034a> f27972a;

    public C5504g(C10201a<C6034a> aVar) {
        this.f27972a = aVar;
    }

    /* renamed from: a */
    public static C5699g m33467a(C6034a aVar) {
        return (C5699g) C5261d.m32478c(C5503f.m33466a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C5504g m33468b(C10201a<C6034a> aVar) {
        return new C5504g(aVar);
    }

    /* renamed from: c */
    public C5699g get() {
        return m33467a(this.f27972a.get());
    }
}
