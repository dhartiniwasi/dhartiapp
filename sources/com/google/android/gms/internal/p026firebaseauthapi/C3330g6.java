package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3330g6 implements C3363h6 {

    /* renamed from: a */
    final /* synthetic */ C3369hc f22064a;

    /* renamed from: b */
    final /* synthetic */ C3533mb f22065b;

    C3330g6(C3369hc hcVar, C3533mb mbVar) {
        this.f22064a = hcVar;
        this.f22065b = mbVar;
    }

    /* renamed from: a */
    public final Set mo16016a() {
        return this.f22064a.mo16388j();
    }

    /* renamed from: b */
    public final Class mo16017b() {
        return this.f22065b.getClass();
    }

    /* renamed from: c */
    public final C3165b6 mo16018c(Class cls) throws GeneralSecurityException {
        try {
            return new C3199c7(this.f22064a, this.f22065b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final C3165b6 mo16019d() {
        C3369hc hcVar = this.f22064a;
        return new C3199c7(hcVar, this.f22065b, hcVar.mo16385g());
    }

    /* renamed from: e */
    public final Class mo16020e() {
        return this.f22064a.getClass();
    }
}
