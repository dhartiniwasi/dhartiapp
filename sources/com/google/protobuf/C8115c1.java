package com.google.protobuf;

/* renamed from: com.google.protobuf.c1 */
/* compiled from: NewInstanceSchemas */
final class C8115c1 {

    /* renamed from: a */
    private static final C8093a1 f34846a = m44604c();

    /* renamed from: b */
    private static final C8093a1 f34847b = new C8104b1();

    /* renamed from: a */
    static C8093a1 m44602a() {
        return f34846a;
    }

    /* renamed from: b */
    static C8093a1 m44603b() {
        return f34847b;
    }

    /* renamed from: c */
    private static C8093a1 m44604c() {
        try {
            return (C8093a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
