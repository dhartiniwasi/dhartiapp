package kotlinx.coroutines.internal;

import p410yd.C13333o0;

/* renamed from: kotlinx.coroutines.internal.z */
/* compiled from: Atomic.kt */
public abstract class C11735z {
    /* renamed from: a */
    public abstract C11684c<?> mo35877a();

    /* renamed from: b */
    public final boolean mo35959b(C11735z zVar) {
        C11684c<?> a;
        C11684c<?> a2 = mo35877a();
        if (a2 == null || (a = zVar.mo35877a()) == null || a2.mo35881f() >= a.mo35881f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo35878c(Object obj);

    public String toString() {
        return C13333o0.m62287a(this) + '@' + C13333o0.m62288b(this);
    }
}
