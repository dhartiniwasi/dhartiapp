package p153v1;

import p112p1.C5259b;
import p112p1.C5261d;

/* renamed from: v1.g */
/* compiled from: EventStoreModule_DbNameFactory */
public final class C5765g implements C5259b<String> {

    /* renamed from: v1.g$a */
    /* compiled from: EventStoreModule_DbNameFactory */
    private static final class C5766a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C5765g f28737a = new C5765g();
    }

    /* renamed from: a */
    public static C5765g m34382a() {
        return C5766a.f28737a;
    }

    /* renamed from: b */
    public static String m34383b() {
        return (String) C5261d.m32478c(C5764f.m34378a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return m34383b();
    }
}
