package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3691r4 extends RuntimeException {
    public C3691r4(C3591o3 o3Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final C3689r2 mo16667a() {
        return new C3689r2(getMessage());
    }
}
