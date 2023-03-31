package p144t5;

import java.util.Objects;

/* renamed from: t5.m1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5576m1 {
    /* renamed from: a */
    public static <T> T m33649a(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }

    /* renamed from: b */
    public static <T> void m33650b(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
