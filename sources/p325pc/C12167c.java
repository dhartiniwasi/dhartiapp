package p325pc;

import java.util.Objects;

/* renamed from: pc.c */
/* compiled from: Preconditions */
public final class C12167c {
    /* renamed from: a */
    public static <T> T m58441a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static void m58442b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
