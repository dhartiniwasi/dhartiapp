package p410yd;

import java.util.concurrent.CancellationException;

/* renamed from: yd.f1 */
/* compiled from: Exceptions.kt */
public final class C13294f1 {
    /* renamed from: a */
    public static final CancellationException m62196a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
