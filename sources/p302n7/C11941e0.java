package p302n7;

import java.util.Objects;

/* renamed from: n7.e0 */
/* compiled from: Preconditions */
public final class C11941e0 {
    /* renamed from: a */
    public static void m57670a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m57671b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m57672c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m57673d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
