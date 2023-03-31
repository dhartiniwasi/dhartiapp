package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ea */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3268ea implements C3952z5 {

    /* renamed from: a */
    private final C3277ej f21983a;

    /* renamed from: b */
    private final C3301fa f21984b;

    /* renamed from: c */
    private final C3169ba f21985c;

    /* renamed from: d */
    private final C3136aa f21986d;

    private C3268ea(C3277ej ejVar, C3301fa faVar, C3136aa aaVar, C3169ba baVar, byte[] bArr) {
        this.f21983a = ejVar;
        this.f21984b = faVar;
        this.f21986d = aaVar;
        this.f21985c = baVar;
    }

    /* renamed from: a */
    static C3268ea m25493a(C3277ej ejVar) throws GeneralSecurityException {
        if (!ejVar.mo15990F().mo16057z()) {
            C3933yi A = ejVar.mo15989A();
            return new C3268ea(ejVar, C3367ha.m25703b(A), C3367ha.m25704c(A), C3367ha.m25702a(A), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
