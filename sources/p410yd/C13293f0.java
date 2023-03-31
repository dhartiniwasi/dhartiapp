package p410yd;

import java.util.List;
import java.util.ServiceLoader;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11570g;

/* renamed from: yd.f0 */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C13293f0 {

    /* renamed from: a */
    private static final List<C13288e0> f47619a;

    static {
        Class<C13288e0> cls = C13288e0.class;
        f47619a = C12956h.m61144f(C12953f.m61139a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m62195a(C11570g gVar, Throwable th) {
        for (C13288e0 handleException : f47619a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C13297g0.m62202b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            C10329b.m52230a(th, new C13347s0(gVar));
            C10341m.m52240a(C10349s.f40964a);
        } catch (Throwable th3) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            C10341m.m52240a(C10344n.m52244a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
