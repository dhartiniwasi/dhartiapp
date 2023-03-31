package p410yd;

import p272jd.C11570g;

/* renamed from: yd.g0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class C13297g0 {
    /* renamed from: a */
    public static final void m62201a(C11570g gVar, Throwable th) {
        try {
            C13288e0 e0Var = (C13288e0) gVar.get(C13288e0.f47614Y);
            if (e0Var == null) {
                C13293f0.m62195a(gVar, th);
            } else {
                e0Var.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            C13293f0.m62195a(gVar, m62202b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m62202b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C10329b.m52230a(runtimeException, th);
        return runtimeException;
    }
}
