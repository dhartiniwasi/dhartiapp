package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3297f6 implements C3363h6 {

    /* renamed from: a */
    final /* synthetic */ C3533mb f22018a;

    C3297f6(C3533mb mbVar) {
        this.f22018a = mbVar;
    }

    /* renamed from: a */
    public final Set mo16016a() {
        return this.f22018a.mo16388j();
    }

    /* renamed from: b */
    public final Class mo16017b() {
        return null;
    }

    /* renamed from: c */
    public final C3165b6 mo16018c(Class cls) throws GeneralSecurityException {
        try {
            return new C3231d6(this.f22018a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final C3165b6 mo16019d() {
        C3533mb mbVar = this.f22018a;
        return new C3231d6(mbVar, mbVar.mo16385g());
    }

    /* renamed from: e */
    public final Class mo16020e() {
        return this.f22018a.getClass();
    }
}
