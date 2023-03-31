package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p410yd.C13330n0;

/* renamed from: kotlinx.coroutines.internal.c */
/* compiled from: Atomic.kt */
public abstract class C11684c<T> extends C11735z {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44250a = AtomicReferenceFieldUpdater.newUpdater(C11684c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C11682b.f44248a;

    /* renamed from: a */
    public C11684c<?> mo35877a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo35878c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C11682b.f44248a) {
            obj2 = mo35880e(mo22208g(obj));
        }
        mo35879d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo35879d(T t, Object obj);

    /* renamed from: e */
    public final Object mo35880e(Object obj) {
        if (C13330n0.m62281a()) {
            if (!(obj != C11682b.f44248a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C11682b.f44248a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C0600b.m2800a(f44250a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public long mo35881f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo22208g(T t);
}
