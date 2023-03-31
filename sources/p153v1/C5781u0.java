package p153v1;

import android.content.Context;
import p112p1.C5259b;
import p234fd.C10201a;

/* renamed from: v1.u0 */
/* compiled from: SchemaManager_Factory */
public final class C5781u0 implements C5259b<C5779t0> {

    /* renamed from: a */
    private final C10201a<Context> f28764a;

    /* renamed from: b */
    private final C10201a<String> f28765b;

    /* renamed from: c */
    private final C10201a<Integer> f28766c;

    public C5781u0(C10201a<Context> aVar, C10201a<String> aVar2, C10201a<Integer> aVar3) {
        this.f28764a = aVar;
        this.f28765b = aVar2;
        this.f28766c = aVar3;
    }

    /* renamed from: a */
    public static C5781u0 m34504a(C10201a<Context> aVar, C10201a<String> aVar2, C10201a<Integer> aVar3) {
        return new C5781u0(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C5779t0 m34505c(Context context, String str, int i) {
        return new C5779t0(context, str, i);
    }

    /* renamed from: b */
    public C5779t0 get() {
        return m34505c(this.f28764a.get(), this.f28765b.get(), this.f28766c.get().intValue());
    }
}
