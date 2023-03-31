package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3820v1 {

    /* renamed from: a */
    private final Object f22796a;

    /* renamed from: b */
    private final int f22797b;

    C3820v1(Object obj, int i) {
        this.f22796a = obj;
        this.f22797b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3820v1)) {
            return false;
        }
        C3820v1 v1Var = (C3820v1) obj;
        if (this.f22796a == v1Var.f22796a && this.f22797b == v1Var.f22797b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f22796a) * 65535) + this.f22797b;
    }
}
