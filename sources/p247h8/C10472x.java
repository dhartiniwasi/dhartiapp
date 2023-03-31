package p247h8;

import java.util.Locale;
import java.util.Objects;

/* renamed from: h8.x */
/* compiled from: Preconditions */
public class C10472x {
    /* renamed from: a */
    public static void m52784a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static <T> T m52785b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m52786c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: d */
    public static <T> T m52787d(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }

    /* renamed from: e */
    public static void m52788e(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
