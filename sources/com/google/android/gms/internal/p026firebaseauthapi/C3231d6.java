package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class C3231d6 implements C3165b6 {

    /* renamed from: a */
    private final C3533mb f21932a;

    /* renamed from: b */
    private final Class f21933b;

    public C3231d6(C3533mb mbVar, Class cls) {
        if (mbVar.mo16388j().contains(cls) || Void.class.equals(cls)) {
            this.f21932a = mbVar;
            this.f21933b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{mbVar.toString(), cls.getName()}));
    }

    /* renamed from: g */
    private final C3198c6 m25400g() {
        return new C3198c6(this.f21932a.mo15786a());
    }

    /* renamed from: h */
    private final Object m25401h(C3591o3 o3Var) throws GeneralSecurityException {
        if (!Void.class.equals(this.f21933b)) {
            this.f21932a.mo15790e(o3Var);
            return this.f21932a.mo16387i(o3Var, this.f21933b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final String mo15780a() {
        return this.f21932a.mo15789d();
    }

    /* renamed from: b */
    public final Object mo15781b(C3591o3 o3Var) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.f21932a.mo16386h().getName());
        if (this.f21932a.mo16386h().isInstance(o3Var)) {
            return m25401h(o3Var);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: d */
    public final Object mo15782d(C3325g1 g1Var) throws GeneralSecurityException {
        try {
            return m25401h(this.f21932a.mo15788c(g1Var));
        } catch (C3689r2 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f21932a.mo16386h().getName()), e);
        }
    }

    /* renamed from: e */
    public final C3591o3 mo15783e(C3325g1 g1Var) throws GeneralSecurityException {
        try {
            return m25400g().mo15899a(g1Var);
        } catch (C3689r2 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f21932a.mo15786a().mo16332e().getName()), e);
        }
    }

    /* renamed from: f */
    public final C3442jj mo15784f(C3325g1 g1Var) throws GeneralSecurityException {
        try {
            C3591o3 a = m25400g().mo15899a(g1Var);
            C3343gj z = C3442jj.m25930z();
            z.mo16081k(this.f21932a.mo15789d());
            z.mo16082l(a.mo16477Y());
            z.mo16080j(this.f21932a.mo15787b());
            return (C3442jj) z.mo16062e();
        } catch (C3689r2 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
