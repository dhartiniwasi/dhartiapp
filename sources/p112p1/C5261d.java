package p112p1;

import java.util.Objects;

/* renamed from: p1.d */
/* compiled from: Preconditions */
public final class C5261d {
    /* renamed from: a */
    public static <T> void m32476a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m32477b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m32478c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
