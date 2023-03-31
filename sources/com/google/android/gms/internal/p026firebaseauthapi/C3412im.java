package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.im */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3412im implements C3693r6 {

    /* renamed from: a */
    private final C3897xe f22168a;

    /* renamed from: b */
    private final int f22169b;

    public C3412im(C3897xe xeVar, int i) throws GeneralSecurityException {
        this.f22168a = xeVar;
        this.f22169b = i;
        if (i >= 10) {
            xeVar.mo16030a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo16186a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!C3411il.m25822b(this.f22168a.mo16030a(bArr2, this.f22169b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
