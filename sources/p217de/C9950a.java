package p217de;

import kotlinx.coroutines.internal.C11697i;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;
import p344rd.C12439l;
import p344rd.C12443p;

/* renamed from: de.a */
/* compiled from: Cancellable.kt */
public final class C9950a {
    /* renamed from: a */
    private static final void m50940a(C11565d<?> dVar, Throwable th) {
        C10341m.C10342a aVar = C10341m.f40958a;
        dVar.resumeWith(C10341m.m52240a(C10344n.m52244a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m50941b(C11565d<? super C10349s> dVar, C11565d<?> dVar2) {
        try {
            C11565d b = C11629c.m56710b(dVar);
            C10341m.C10342a aVar = C10341m.f40958a;
            C11697i.m56880c(b, C10341m.m52240a(C10349s.f40964a), (C12439l) null, 2, (Object) null);
        } catch (Throwable th) {
            m50940a(dVar2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m50942c(C12443p<? super R, ? super C11565d<? super T>, ? extends Object> pVar, R r, C11565d<? super T> dVar, C12439l<? super Throwable, C10349s> lVar) {
        try {
            C11565d b = C11629c.m56710b(C11629c.m56709a(pVar, r, dVar));
            C10341m.C10342a aVar = C10341m.f40958a;
            C11697i.m56879b(b, C10341m.m52240a(C10349s.f40964a), lVar);
        } catch (Throwable th) {
            m50940a(dVar, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m50943d(C12443p pVar, Object obj, C11565d dVar, C12439l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m50942c(pVar, obj, dVar, lVar);
    }
}
