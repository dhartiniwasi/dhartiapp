package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p243gd.C10349s;
import p272jd.C11570g;
import p344rd.C12439l;
import p410yd.C13297g0;

/* renamed from: kotlinx.coroutines.internal.y */
/* compiled from: OnUndeliveredElement.kt */
public final class C11733y {

    /* renamed from: kotlinx.coroutines.internal.y$a */
    /* compiled from: OnUndeliveredElement.kt */
    static final class C11734a extends C11670l implements C12439l<Throwable, C10349s> {

        /* renamed from: a */
        final /* synthetic */ C12439l<E, C10349s> f44319a;

        /* renamed from: b */
        final /* synthetic */ E f44320b;

        /* renamed from: c */
        final /* synthetic */ C11570g f44321c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11734a(C12439l<? super E, C10349s> lVar, E e, C11570g gVar) {
            super(1);
            this.f44319a = lVar;
            this.f44320b = e;
            this.f44321c = gVar;
        }

        /* renamed from: a */
        public final void mo35958a(Throwable th) {
            C11733y.m56985b(this.f44319a, this.f44320b, this.f44321c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo35958a((Throwable) obj);
            return C10349s.f40964a;
        }
    }

    /* renamed from: a */
    public static final <E> C12439l<Throwable, C10349s> m56984a(C12439l<? super E, C10349s> lVar, E e, C11570g gVar) {
        return new C11734a(lVar, e, gVar);
    }

    /* renamed from: b */
    public static final <E> void m56985b(C12439l<? super E, C10349s> lVar, E e, C11570g gVar) {
        C11715m0 c = m56986c(lVar, e, (C11715m0) null);
        if (c != null) {
            C13297g0.m62201a(gVar, c);
        }
    }

    /* renamed from: c */
    public static final <E> C11715m0 m56986c(C12439l<? super E, C10349s> lVar, E e, C11715m0 m0Var) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (m0Var == null || m0Var.getCause() == th) {
                return new C11715m0(C11669k.m56792j("Exception in undelivered element handler for ", e), th);
            }
            C10329b.m52230a(m0Var, th);
        }
        return m0Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C11715m0 m56987d(C12439l lVar, Object obj, C11715m0 m0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            m0Var = null;
        }
        return m56986c(lVar, obj, m0Var);
    }
}
