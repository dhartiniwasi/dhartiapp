package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ta */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3763ta {

    /* renamed from: a */
    private final C3758t5 f22733a;

    /* renamed from: b */
    private final C3888x5 f22734b;

    public C3763ta(C3758t5 t5Var) {
        this.f22733a = t5Var;
        this.f22734b = null;
    }

    public C3763ta(C3888x5 x5Var) {
        this.f22733a = null;
        this.f22734b = x5Var;
    }

    /* renamed from: a */
    public final byte[] mo16808a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C3758t5 t5Var = this.f22733a;
        if (t5Var != null) {
            return t5Var.mo15791a(bArr, bArr2);
        }
        return this.f22734b.mo16098a(bArr, bArr2);
    }
}
