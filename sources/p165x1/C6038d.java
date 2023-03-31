package p165x1;

import p112p1.C5259b;
import p112p1.C5261d;

/* renamed from: x1.d */
/* compiled from: TimeModule_UptimeClockFactory */
public final class C6038d implements C5259b<C6034a> {

    /* renamed from: x1.d$a */
    /* compiled from: TimeModule_UptimeClockFactory */
    private static final class C6039a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6038d f29308a = new C6038d();
    }

    /* renamed from: a */
    public static C6038d m35464a() {
        return C6039a.f29308a;
    }

    /* renamed from: c */
    public static C6034a m35465c() {
        return (C6034a) C5261d.m32478c(C6035b.m35459b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C6034a get() {
        return m35465c();
    }
}
