package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3199c7 extends C3231d6 implements C3166b7 {

    /* renamed from: c */
    private final C3369hc f21870c;

    /* renamed from: d */
    private final C3533mb f21871d;

    public C3199c7(C3369hc hcVar, C3533mb mbVar, Class cls) {
        super(hcVar, cls);
        this.f21870c = hcVar;
        this.f21871d = mbVar;
    }

    /* renamed from: c */
    public final C3442jj mo15785c(C3325g1 g1Var) throws GeneralSecurityException {
        try {
            C3591o3 c = this.f21870c.mo15788c(g1Var);
            this.f21870c.mo15790e(c);
            C3591o3 k = this.f21870c.mo16095k(c);
            this.f21871d.mo15790e(k);
            C3343gj z = C3442jj.m25930z();
            z.mo16081k(this.f21871d.mo15789d());
            z.mo16082l(k.mo16477Y());
            z.mo16080j(this.f21871d.mo15787b());
            return (C3442jj) z.mo16062e();
        } catch (C3689r2 e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
