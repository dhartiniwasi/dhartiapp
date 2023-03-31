package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ha */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3367ha {
    /* renamed from: a */
    static C3169ba m25702a(C3933yi yiVar) throws GeneralSecurityException {
        if (yiVar.mo17079C() == 3) {
            return new C3924y9(16);
        }
        if (yiVar.mo17079C() == 4) {
            return new C3924y9(32);
        }
        if (yiVar.mo17079C() == 5) {
            return new C3956z9();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    static C3301fa m25703b(C3933yi yiVar) throws GeneralSecurityException {
        if (yiVar.mo17081E() == 3) {
            return new C3697ra(new C3136aa("HmacSha256"));
        }
        if (yiVar.mo17081E() == 4) {
            return C3631pa.m26470b(1);
        }
        if (yiVar.mo17081E() == 5) {
            return C3631pa.m26470b(2);
        }
        if (yiVar.mo17081E() == 6) {
            return C3631pa.m26470b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    static C3136aa m25704c(C3933yi yiVar) {
        if (yiVar.mo17080D() == 3) {
            return new C3136aa("HmacSha256");
        }
        if (yiVar.mo17080D() == 4) {
            return new C3136aa("HmacSha384");
        }
        if (yiVar.mo17080D() == 5) {
            return new C3136aa("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
