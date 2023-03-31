package p105o1;

import android.content.Context;
import p112p1.C5259b;
import p165x1.C6034a;
import p234fd.C10201a;

/* renamed from: o1.j */
/* compiled from: CreationContextFactory_Factory */
public final class C5161j implements C5259b<C5160i> {

    /* renamed from: a */
    private final C10201a<Context> f26689a;

    /* renamed from: b */
    private final C10201a<C6034a> f26690b;

    /* renamed from: c */
    private final C10201a<C6034a> f26691c;

    public C5161j(C10201a<Context> aVar, C10201a<C6034a> aVar2, C10201a<C6034a> aVar3) {
        this.f26689a = aVar;
        this.f26690b = aVar2;
        this.f26691c = aVar3;
    }

    /* renamed from: a */
    public static C5161j m32079a(C10201a<Context> aVar, C10201a<C6034a> aVar2, C10201a<C6034a> aVar3) {
        return new C5161j(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C5160i m32080c(Context context, C6034a aVar, C6034a aVar2) {
        return new C5160i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C5160i get() {
        return m32080c(this.f26689a.get(), this.f26690b.get(), this.f26691c.get());
    }
}
