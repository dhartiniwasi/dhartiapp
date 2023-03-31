package p243gd;

import java.io.Serializable;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p344rd.C12428a;

/* renamed from: gd.o */
/* compiled from: LazyJVM.kt */
final class C10345o<T> implements C10335g<T>, Serializable {

    /* renamed from: a */
    private C12428a<? extends T> f40960a;

    /* renamed from: b */
    private volatile Object f40961b;

    /* renamed from: c */
    private final Object f40962c;

    public C10345o(C12428a<? extends T> aVar, Object obj) {
        C11669k.m56787e(aVar, "initializer");
        this.f40960a = aVar;
        this.f40961b = C10347q.f40963a;
        this.f40962c = obj == null ? this : obj;
    }

    /* renamed from: a */
    public boolean mo33183a() {
        return this.f40961b != C10347q.f40963a;
    }

    public T getValue() {
        T t;
        T t2 = this.f40961b;
        T t3 = C10347q.f40963a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f40962c) {
            t = this.f40961b;
            if (t == t3) {
                C12428a aVar = this.f40960a;
                C11669k.m56784b(aVar);
                t = aVar.invoke();
                this.f40961b = t;
                this.f40960a = null;
            }
        }
        return t;
    }

    public String toString() {
        return mo33183a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10345o(C12428a aVar, Object obj, int i, C11665g gVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
