package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3664qa implements C3334ga {

    /* renamed from: a */
    private final C3643pm f22548a;

    /* renamed from: b */
    private final C3643pm f22549b;

    private C3664qa(byte[] bArr, byte[] bArr2) {
        this.f22548a = C3643pm.m26493b(bArr);
        this.f22549b = C3643pm.m26493b(bArr2);
    }

    /* renamed from: a */
    static C3664qa m26554a(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        C3675ql.m26587f(C3675ql.m26592k(C3675ql.m26593l(i), 1, bArr2), C3675ql.m26590i(i, bArr));
        return new C3664qa(bArr, bArr2);
    }

    /* renamed from: d */
    public final C3643pm mo16067d() {
        return this.f22549b;
    }

    public final C3643pm zza() {
        return this.f22548a;
    }
}
