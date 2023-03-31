package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7234w8 {

    /* renamed from: a */
    private static final C7202u8 f32166a = new C7218v8();

    /* renamed from: b */
    private static final C7202u8 f32167b;

    static {
        C7202u8 u8Var;
        try {
            u8Var = (C7202u8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            u8Var = null;
        }
        f32167b = u8Var;
    }

    /* renamed from: a */
    static C7202u8 m41062a() {
        C7202u8 u8Var = f32167b;
        if (u8Var != null) {
            return u8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C7202u8 m41063b() {
        return f32166a;
    }
}
