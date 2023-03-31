package p217de;

import kotlin.coroutines.jvm.internal.C11652h;
import kotlin.jvm.internal.C11679u;
import kotlinx.coroutines.internal.C11698i0;
import p243gd.C10341m;
import p243gd.C10344n;
import p272jd.C11565d;
import p272jd.C11570g;
import p344rd.C12443p;

/* renamed from: de.b */
/* compiled from: Undispatched.kt */
public final class C9951b {
    /* renamed from: a */
    public static final <R, T> void m50944a(C12443p<? super R, ? super C11565d<? super T>, ? extends Object> pVar, R r, C11565d<? super T> dVar) {
        C11570g context;
        Object c;
        C11565d<? super T> a = C11652h.m56769a(dVar);
        try {
            context = dVar.getContext();
            c = C11698i0.m56883c(context, (Object) null);
            Object invoke = ((C12443p) C11679u.m56812a(pVar, 2)).invoke(r, a);
            C11698i0.m56881a(context, c);
            if (invoke != C11632d.m56711c()) {
                C10341m.C10342a aVar = C10341m.f40958a;
                a.resumeWith(C10341m.m52240a(invoke));
            }
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            a.resumeWith(C10341m.m52240a(C10344n.m52244a(th)));
        }
    }
}
