package p049g0;

import androidx.lifecycle.C1194g0;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* renamed from: g0.f */
/* compiled from: InitializerViewModelFactory.kt */
public final class C4305f<T extends C1194g0> {

    /* renamed from: a */
    private final Class<T> f24180a;

    /* renamed from: b */
    private final C12439l<C4298a, T> f24181b;

    public C4305f(Class<T> cls, C12439l<? super C4298a, ? extends T> lVar) {
        C11669k.m56787e(cls, "clazz");
        C11669k.m56787e(lVar, "initializer");
        this.f24180a = cls;
        this.f24181b = lVar;
    }

    /* renamed from: a */
    public final Class<T> mo17715a() {
        return this.f24180a;
    }

    /* renamed from: b */
    public final C12439l<C4298a, T> mo17716b() {
        return this.f24181b;
    }
}
