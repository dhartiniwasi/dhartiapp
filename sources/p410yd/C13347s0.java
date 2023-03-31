package p410yd;

import p272jd.C11570g;

/* renamed from: yd.s0 */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
final class C13347s0 extends RuntimeException {

    /* renamed from: a */
    private final C11570g f47666a;

    public C13347s0(C11570g gVar) {
        this.f47666a = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f47666a.toString();
    }
}
