package kotlinx.coroutines.scheduling;

/* renamed from: kotlinx.coroutines.scheduling.c */
/* compiled from: Dispatcher.kt */
public final class C11742c extends C11745f {

    /* renamed from: h */
    public static final C11742c f44351h = new C11742c();

    private C11742c() {
        super(C11751l.f44363b, C11751l.f44364c, C11751l.f44365d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
