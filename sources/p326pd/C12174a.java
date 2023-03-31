package p326pd;

/* renamed from: pd.a */
/* compiled from: AutoCloseable.kt */
public final class C12174a {
    /* renamed from: a */
    public static final void m58460a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            C10329b.m52230a(th, th2);
        }
    }
}
