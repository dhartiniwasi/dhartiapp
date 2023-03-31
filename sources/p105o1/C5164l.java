package p105o1;

import android.content.Context;
import p112p1.C5259b;
import p234fd.C10201a;

/* renamed from: o1.l */
/* compiled from: MetadataBackendRegistry_Factory */
public final class C5164l implements C5259b<C5162k> {

    /* renamed from: a */
    private final C10201a<Context> f26697a;

    /* renamed from: b */
    private final C10201a<C5160i> f26698b;

    public C5164l(C10201a<Context> aVar, C10201a<C5160i> aVar2) {
        this.f26697a = aVar;
        this.f26698b = aVar2;
    }

    /* renamed from: a */
    public static C5164l m32086a(C10201a<Context> aVar, C10201a<C5160i> aVar2) {
        return new C5164l(aVar, aVar2);
    }

    /* renamed from: c */
    public static C5162k m32087c(Context context, Object obj) {
        return new C5162k(context, (C5160i) obj);
    }

    /* renamed from: b */
    public C5162k get() {
        return m32087c(this.f26697a.get(), this.f26698b.get());
    }
}
