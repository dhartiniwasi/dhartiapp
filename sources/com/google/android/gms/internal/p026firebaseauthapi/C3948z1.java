package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3948z1 {

    /* renamed from: a */
    private static final C3884x1 f22976a = new C3916y1();

    /* renamed from: b */
    private static final C3884x1 f22977b;

    static {
        C3884x1 x1Var;
        try {
            x1Var = (C3884x1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x1Var = null;
        }
        f22977b = x1Var;
    }

    /* renamed from: a */
    static C3884x1 m27482a() {
        C3884x1 x1Var = f22977b;
        if (x1Var != null) {
            return x1Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C3884x1 m27483b() {
        return f22976a;
    }
}
