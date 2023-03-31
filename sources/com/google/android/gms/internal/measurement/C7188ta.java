package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ta */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7188ta {

    /* renamed from: a */
    private static final C7172sa f32116a;

    /* renamed from: b */
    private static final C7172sa f32117b = new C7172sa();

    static {
        C7172sa saVar;
        try {
            saVar = (C7172sa) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            saVar = null;
        }
        f32116a = saVar;
    }

    /* renamed from: a */
    static C7172sa m40955a() {
        return f32116a;
    }

    /* renamed from: b */
    static C7172sa m40956b() {
        return f32117b;
    }
}
