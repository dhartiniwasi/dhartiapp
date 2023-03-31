package p165x1;

import p112p1.C5259b;
import p112p1.C5261d;

/* renamed from: x1.c */
/* compiled from: TimeModule_EventClockFactory */
public final class C6036c implements C5259b<C6034a> {

    /* renamed from: x1.c$a */
    /* compiled from: TimeModule_EventClockFactory */
    private static final class C6037a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6036c f29307a = new C6036c();
    }

    /* renamed from: a */
    public static C6036c m35460a() {
        return C6037a.f29307a;
    }

    /* renamed from: b */
    public static C6034a m35461b() {
        return (C6034a) C5261d.m32478c(C6035b.m35458a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public C6034a get() {
        return m35461b();
    }
}
