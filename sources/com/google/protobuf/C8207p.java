package com.google.protobuf;

/* renamed from: com.google.protobuf.p */
/* compiled from: ExtensionRegistryFactory */
final class C8207p {

    /* renamed from: a */
    static final Class<?> f35038a = m45477c();

    /* renamed from: a */
    public static C8210q m45475a() {
        C8210q b = m45476b("getEmptyRegistry");
        return b != null ? b : C8210q.f35047d;
    }

    /* renamed from: b */
    private static final C8210q m45476b(String str) {
        Class<?> cls = f35038a;
        if (cls == null) {
            return null;
        }
        try {
            return (C8210q) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m45477c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
