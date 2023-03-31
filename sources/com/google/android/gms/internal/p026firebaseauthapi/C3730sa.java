package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3730sa implements C3334ga {

    /* renamed from: a */
    private final C3643pm f22673a;

    /* renamed from: b */
    private final C3643pm f22674b;

    private C3730sa(byte[] bArr, byte[] bArr2) {
        this.f22673a = C3643pm.m26493b(bArr);
        this.f22674b = C3643pm.m26493b(bArr2);
    }

    /* renamed from: a */
    static C3730sa m26897a(byte[] bArr) throws GeneralSecurityException {
        return new C3730sa(bArr, C3577nm.m26313b(bArr));
    }

    /* renamed from: d */
    public final C3643pm mo16067d() {
        return this.f22674b;
    }

    public final C3643pm zza() {
        return this.f22673a;
    }
}
