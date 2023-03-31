package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.C11692f0;
import p272jd.C11570g;
import p272jd.C11576h;
import p410yd.C13282d0;
import p410yd.C13298g1;

/* renamed from: kotlinx.coroutines.scheduling.b */
/* compiled from: Dispatcher.kt */
public final class C11741b extends C13298g1 implements Executor {

    /* renamed from: c */
    public static final C11741b f44349c = new C11741b();

    /* renamed from: d */
    private static final C13282d0 f44350d = C11752m.f44369b.mo38415K(C11696h0.m56876d("kotlinx.coroutines.io.parallelism", C12756f.m60449a(64, C11692f0.m56853a()), 0, 0, 12, (Object) null));

    private C11741b() {
    }

    /* renamed from: H */
    public void mo35925H(C11570g gVar, Runnable runnable) {
        f44350d.mo35925H(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo35925H(C11576h.f44049a, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
