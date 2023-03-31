package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class hx3 {

    /* renamed from: a */
    private static final fx3 f10521a = new gx3();

    /* renamed from: b */
    private static final fx3 f10522b;

    static {
        fx3 fx3;
        try {
            fx3 = (fx3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            fx3 = null;
        }
        f10522b = fx3;
    }

    /* renamed from: a */
    static fx3 m14072a() {
        fx3 fx3 = f10522b;
        if (fx3 != null) {
            return fx3;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static fx3 m14073b() {
        return f10521a;
    }
}
