package p144t5;

import java.util.Objects;

/* renamed from: t5.l1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5573l1<T> implements C5569k1<T> {

    /* renamed from: b */
    private static final C5573l1<Object> f28158b = new C5573l1<>((Object) null);

    /* renamed from: a */
    private final T f28159a;

    private C5573l1(T t) {
        this.f28159a = t;
    }

    /* renamed from: a */
    public static <T> C5569k1<T> m33645a(T t) {
        Objects.requireNonNull(t, "instance cannot be null");
        return new C5573l1(t);
    }

    /* renamed from: d */
    public final T mo19832d() {
        return this.f28159a;
    }
}
