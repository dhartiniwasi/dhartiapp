package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3294f3 implements C3525m3 {

    /* renamed from: a */
    private final C3525m3[] f22017a;

    C3294f3(C3525m3... m3VarArr) {
        this.f22017a = m3VarArr;
    }

    /* renamed from: a */
    public final C3492l3 mo15979a(Class cls) {
        C3525m3[] m3VarArr = this.f22017a;
        for (int i = 0; i < 2; i++) {
            C3525m3 m3Var = m3VarArr[i];
            if (m3Var.mo15980b(cls)) {
                return m3Var.mo15979a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo15980b(Class cls) {
        C3525m3[] m3VarArr = this.f22017a;
        for (int i = 0; i < 2; i++) {
            if (m3VarArr[i].mo15980b(cls)) {
                return true;
            }
        }
        return false;
    }
}
