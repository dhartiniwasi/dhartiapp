package p410yd;

import java.util.concurrent.Executor;

/* renamed from: yd.i1 */
/* compiled from: Executors.kt */
public final class C13310i1 {
    /* renamed from: a */
    public static final C13282d0 m62220a(Executor executor) {
        C13282d0 d0Var = null;
        C13359w0 w0Var = executor instanceof C13359w0 ? (C13359w0) executor : null;
        if (w0Var != null) {
            d0Var = w0Var.f47680a;
        }
        return d0Var == null ? new C13305h1(executor) : d0Var;
    }
}
