package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ra */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3697ra implements C3301fa {

    /* renamed from: a */
    private final C3136aa f22624a;

    C3697ra(C3136aa aaVar) {
        this.f22624a = aaVar;
    }

    /* renamed from: a */
    public final byte[] mo16022a(byte[] bArr, C3334ga gaVar) throws GeneralSecurityException {
        byte[] a = C3577nm.m26312a(gaVar.zza().mo16555c(), bArr);
        byte[] c = C3411il.m25823c(bArr, gaVar.mo16067d().mo16555c());
        byte[] d = C3598oa.m26364d(C3598oa.f22446b);
        C3136aa aaVar = this.f22624a;
        return aaVar.mo15726b((byte[]) null, a, "eae_prk", c, "shared_secret", d, aaVar.mo15725a());
    }

    /* renamed from: d */
    public final byte[] mo16023d() throws GeneralSecurityException {
        if (Arrays.equals(this.f22624a.mo15727c(), C3598oa.f22450f)) {
            return C3598oa.f22446b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
