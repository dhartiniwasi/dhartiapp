package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.da */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3235da implements C3920y5 {

    /* renamed from: f */
    private static final byte[] f21938f = new byte[0];

    /* renamed from: a */
    private final C3334ga f21939a;

    /* renamed from: b */
    private final C3301fa f21940b;

    /* renamed from: c */
    private final C3169ba f21941c;

    /* renamed from: d */
    private final int f21942d;

    /* renamed from: e */
    private final C3136aa f21943e;

    private C3235da(C3334ga gaVar, C3301fa faVar, C3136aa aaVar, C3169ba baVar, int i, byte[] bArr) {
        this.f21939a = gaVar;
        this.f21940b = faVar;
        this.f21943e = aaVar;
        this.f21941c = baVar;
        this.f21942d = i;
    }

    /* renamed from: b */
    static C3235da m25413b(C3178bj bjVar) throws GeneralSecurityException {
        int i;
        C3334ga gaVar;
        if (!bjVar.mo15805J()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!bjVar.mo15803D().mo15991K()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!bjVar.mo15804E().mo16057z()) {
            C3933yi A = bjVar.mo15803D().mo15989A();
            C3301fa b = C3367ha.m25703b(A);
            C3136aa c = C3367ha.m25704c(A);
            C3169ba a = C3367ha.m25702a(A);
            int E = A.mo17081E();
            int i2 = E - 2;
            if (i2 == 1) {
                i = 32;
            } else if (i2 == 2) {
                i = 65;
            } else if (i2 == 3) {
                i = 97;
            } else if (i2 == 4) {
                i = 133;
            } else {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(C3738si.m26923a(E)));
            }
            int E2 = bjVar.mo15803D().mo15989A().mo17081E() - 2;
            if (E2 == 1) {
                gaVar = C3730sa.m26897a(bjVar.mo15804E().mo16051A());
            } else if (E2 == 2 || E2 == 3 || E2 == 4) {
                gaVar = C3664qa.m26554a(bjVar.mo15804E().mo16051A(), bjVar.mo15803D().mo15990F().mo16051A(), C3598oa.m26367g(bjVar.mo15803D().mo15989A().mo17081E()));
            } else {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return new C3235da(gaVar, b, c, a, i, (byte[]) null);
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }

    /* renamed from: a */
    public final byte[] mo15949a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f21942d;
        if (length >= i) {
            byte[] copyOf = Arrays.copyOf(bArr, i);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f21942d, length);
            C3334ga gaVar = this.f21939a;
            C3301fa faVar = this.f21940b;
            C3136aa aaVar = this.f21943e;
            C3169ba baVar = this.f21941c;
            return C3202ca.m25323b(copyOf, faVar.mo16022a(copyOf, gaVar), faVar, aaVar, baVar, new byte[0]).mo15901a(copyOfRange, f21938f);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
