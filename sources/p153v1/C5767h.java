package p153v1;

import android.content.Context;
import p112p1.C5259b;
import p112p1.C5261d;
import p234fd.C10201a;

/* renamed from: v1.h */
/* compiled from: EventStoreModule_PackageNameFactory */
public final class C5767h implements C5259b<String> {

    /* renamed from: a */
    private final C10201a<Context> f28738a;

    public C5767h(C10201a<Context> aVar) {
        this.f28738a = aVar;
    }

    /* renamed from: a */
    public static C5767h m34386a(C10201a<Context> aVar) {
        return new C5767h(aVar);
    }

    /* renamed from: c */
    public static String m34387c(Context context) {
        return (String) C5261d.m32478c(C5764f.m34379b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m34387c(this.f28738a.get());
    }
}
