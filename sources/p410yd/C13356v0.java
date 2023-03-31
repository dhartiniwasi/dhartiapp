package p410yd;

import kotlinx.coroutines.internal.C11695h;
import kotlinx.coroutines.internal.C11698i0;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;

/* renamed from: yd.v0 */
/* compiled from: DispatchedTask.kt */
public final class C13356v0 {
    /* renamed from: a */
    public static final <T> void m62348a(C13353u0<? super T> u0Var, int i) {
        boolean z = true;
        if (C13330n0.m62281a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        C11565d<? super T> d = u0Var.mo35891d();
        if (i != 4) {
            z = false;
        }
        if (z || !(d instanceof C11695h) || m62349b(i) != m62349b(u0Var.f47674c)) {
            m62351d(u0Var, d, z);
            return;
        }
        C13282d0 d0Var = ((C11695h) d).f44261d;
        C11570g context = d.getContext();
        if (d0Var.mo35954I(context)) {
            d0Var.mo35925H(context, u0Var);
        } else {
            m62352e(u0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m62349b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m62350c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m62351d(C13353u0<? super T> u0Var, C11565d<? super T> dVar, boolean z) {
        Object obj;
        Object l = u0Var.mo35892l();
        Throwable f = u0Var.mo38451f(l);
        if (f != null) {
            C10341m.C10342a aVar = C10341m.f40958a;
            obj = C10344n.m52244a(f);
        } else {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            obj = u0Var.mo38452g(l);
        }
        Object a = C10341m.m52240a(obj);
        if (z) {
            C11695h hVar = (C11695h) dVar;
            C11565d<T> dVar2 = hVar.f44262e;
            Object obj2 = hVar.f44264g;
            C11570g context = dVar2.getContext();
            Object c = C11698i0.m56883c(context, obj2);
            C13311i2<?> f2 = c != C11698i0.f44267a ? C13275c0.m62176f(dVar2, context, c) : null;
            try {
                hVar.f44262e.resumeWith(a);
                C10349s sVar = C10349s.f40964a;
            } finally {
                if (f2 == null || f2.mo38440z0()) {
                    C11698i0.m56881a(context, c);
                }
            }
        } else {
            dVar.resumeWith(a);
        }
    }

    /* renamed from: e */
    private static final void m62352e(C13353u0<?> u0Var) {
        C13266a1 a = C13301g2.f47622a.mo38422a();
        if (a.mo38386c0()) {
            a.mo38383S(u0Var);
            return;
        }
        a.mo38385X(true);
        try {
            m62351d(u0Var, u0Var.mo35891d(), true);
            do {
            } while (a.mo38388f0());
        } catch (Throwable th) {
            a.mo38382L(true);
            throw th;
        }
        a.mo38382L(true);
    }
}
