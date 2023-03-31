package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ja */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7028ja {

    /* renamed from: a */
    private static final C7012ia f31782a;

    /* renamed from: b */
    private static final C7012ia f31783b = new C7012ia();

    static {
        C7012ia iaVar;
        try {
            iaVar = (C7012ia) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            iaVar = null;
        }
        f31782a = iaVar;
    }

    /* renamed from: a */
    static C7012ia m40261a() {
        return f31782a;
    }

    /* renamed from: b */
    static C7012ia m40262b() {
        return f31783b;
    }
}
