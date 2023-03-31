package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
/* compiled from: Android */
final class C8118d {

    /* renamed from: a */
    private static boolean f34851a;

    /* renamed from: b */
    private static final Class<?> f34852b = m44646a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f34853c = (!f34851a && m44646a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m44646a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class<?> m44647b() {
        return f34852b;
    }

    /* renamed from: c */
    static boolean m44648c() {
        return f34851a || (f34852b != null && !f34853c);
    }
}
