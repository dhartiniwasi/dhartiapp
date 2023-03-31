package p410yd;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C11669k;

/* renamed from: yd.q1 */
/* compiled from: Exceptions.kt */
public final class C13342q1 extends CancellationException implements C13269b0<C13342q1> {

    /* renamed from: a */
    public final C13337p1 f47664a;

    public C13342q1(String str, Throwable th, C13337p1 p1Var) {
        super(str);
        this.f47664a = p1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public C13342q1 mo38393a() {
        if (!C13330n0.m62283c()) {
            return null;
        }
        String message = getMessage();
        C11669k.m56784b(message);
        return new C13342q1(message, this, this.f47664a);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C13342q1) {
                C13342q1 q1Var = (C13342q1) obj;
                if (!C11669k.m56783a(q1Var.getMessage(), getMessage()) || !C11669k.m56783a(q1Var.f47664a, this.f47664a) || !C11669k.m56783a(q1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (C13330n0.m62283c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C11669k.m56784b(message);
        int hashCode = ((message.hashCode() * 31) + this.f47664a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f47664a;
    }
}
