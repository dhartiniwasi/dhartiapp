package p410yd;

import kotlin.coroutines.jvm.internal.C11649e;
import kotlin.jvm.internal.C11665g;
import kotlinx.coroutines.internal.C11688d0;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;
import p344rd.C12439l;

/* renamed from: yd.z */
/* compiled from: CompletionState.kt */
public final class C13370z {
    /* renamed from: a */
    public static final <T> Object m62444a(Object obj, C11565d<? super T> dVar) {
        if (obj instanceof C13355v) {
            C10341m.C10342a aVar = C10341m.f40958a;
            Throwable th = ((C13355v) obj).f47676a;
            if (C13330n0.m62284d() && (dVar instanceof C11649e)) {
                th = C11688d0.m56846j(th, (C11649e) dVar);
            }
            return C10341m.m52240a(C10344n.m52244a(th));
        }
        C10341m.C10342a aVar2 = C10341m.f40958a;
        return C10341m.m52240a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m62445b(Object obj, C12439l<? super Throwable, C10349s> lVar) {
        Throwable b = C10341m.m52241b(obj);
        if (b != null) {
            return new C13355v(b, false, 2, (C11665g) null);
        }
        if (lVar != null) {
            return new C13358w(obj, lVar);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m62446c(Object obj, C13316k<?> kVar) {
        Throwable b = C10341m.m52241b(obj);
        if (b != null) {
            if (C13330n0.m62284d() && (kVar instanceof C11649e)) {
                b = C11688d0.m56846j(b, (C11649e) kVar);
            }
            obj = new C13355v(b, false, 2, (C11665g) null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m62447d(Object obj, C12439l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m62445b(obj, lVar);
    }
}
