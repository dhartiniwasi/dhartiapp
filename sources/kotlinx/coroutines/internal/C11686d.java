package kotlinx.coroutines.internal;

import p344rd.C12439l;

/* renamed from: kotlinx.coroutines.internal.d */
/* compiled from: ExceptionsConstructor.kt */
final class C11686d extends C11693g {

    /* renamed from: a */
    public static final C11686d f44252a = new C11686d();

    /* renamed from: b */
    private static final C11687a f44253b = new C11687a();

    /* renamed from: kotlinx.coroutines.internal.d$a */
    /* compiled from: ExceptionsConstructor.kt */
    public static final class C11687a extends ClassValue<C12439l<? super Throwable, ? extends Throwable>> {
        C11687a() {
        }
    }

    private C11686d() {
    }

    /* renamed from: a */
    public C12439l<Throwable, Throwable> mo35886a(Class<? extends Throwable> cls) {
        return (C12439l) f44253b.get(cls);
    }
}
