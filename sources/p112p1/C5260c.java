package p112p1;

/* renamed from: p1.c */
/* compiled from: InstanceFactory */
public final class C5260c<T> implements C5259b<T> {

    /* renamed from: b */
    private static final C5260c<Object> f27129b = new C5260c<>((Object) null);

    /* renamed from: a */
    private final T f27130a;

    private C5260c(T t) {
        this.f27130a = t;
    }

    /* renamed from: a */
    public static <T> C5259b<T> m32475a(T t) {
        return new C5260c(C5261d.m32478c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f27130a;
    }
}
