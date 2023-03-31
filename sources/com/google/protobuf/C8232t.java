package com.google.protobuf;

/* renamed from: com.google.protobuf.t */
/* compiled from: ExtensionSchemas */
final class C8232t {

    /* renamed from: a */
    private static final C8223r<?> f35081a = new C8226s();

    /* renamed from: b */
    private static final C8223r<?> f35082b = m45631c();

    /* renamed from: a */
    static C8223r<?> m45629a() {
        C8223r<?> rVar = f35082b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C8223r<?> m45630b() {
        return f35081a;
    }

    /* renamed from: c */
    private static C8223r<?> m45631c() {
        try {
            return (C8223r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
