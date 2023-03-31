package p410yd;

import kotlinx.coroutines.internal.C11695h;
import p243gd.C10341m;
import p243gd.C10344n;
import p272jd.C11565d;

/* renamed from: yd.o0 */
/* compiled from: DebugStrings.kt */
public final class C13333o0 {
    /* renamed from: a */
    public static final String m62287a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m62288b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m62289c(C11565d<?> dVar) {
        Object obj;
        if (dVar instanceof C11695h) {
            return dVar.toString();
        }
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            obj = C10341m.m52240a(dVar + '@' + m62288b(dVar));
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            obj = C10341m.m52240a(C10344n.m52244a(th));
        }
        Throwable b = C10341m.m52241b(obj);
        String str = obj;
        if (b != null) {
            str = dVar.getClass().getName() + '@' + m62288b(dVar);
        }
        return (String) str;
    }
}
