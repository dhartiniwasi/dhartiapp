package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: androidx.core.util.c */
/* compiled from: ObjectsCompat */
public class C0825c {

    /* renamed from: androidx.core.util.c$a */
    /* compiled from: ObjectsCompat */
    static class C0826a {
        /* renamed from: a */
        static boolean m3647a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m3648b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m3642a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0826a.m3647a(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m3643b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0826a.m3648b(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static int m3644c(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: d */
    public static <T> T m3645d(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: e */
    public static <T> T m3646e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
