package p243gd;

import kotlin.jvm.internal.C11669k;
import p243gd.C10341m;

/* renamed from: gd.n */
/* compiled from: Result.kt */
public final class C10344n {
    /* renamed from: a */
    public static final Object m52244a(Throwable th) {
        C11669k.m56787e(th, "exception");
        return new C10341m.C10343b(th);
    }

    /* renamed from: b */
    public static final void m52245b(Object obj) {
        if (obj instanceof C10341m.C10343b) {
            throw ((C10341m.C10343b) obj).f40959a;
        }
    }
}
