package com.google.protobuf;

/* renamed from: com.google.protobuf.s0 */
/* compiled from: MapFieldSchemas */
final class C8228s0 {

    /* renamed from: a */
    private static final C8212q0 f35078a = m45623c();

    /* renamed from: b */
    private static final C8212q0 f35079b = new C8224r0();

    /* renamed from: a */
    static C8212q0 m45621a() {
        return f35078a;
    }

    /* renamed from: b */
    static C8212q0 m45622b() {
        return f35079b;
    }

    /* renamed from: c */
    private static C8212q0 m45623c() {
        try {
            return (C8212q0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
