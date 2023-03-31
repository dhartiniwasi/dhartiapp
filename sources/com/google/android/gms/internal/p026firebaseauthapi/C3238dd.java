package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.dd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3238dd {

    /* renamed from: a */
    private Integer f21944a = null;

    /* renamed from: b */
    private Integer f21945b = null;

    /* renamed from: c */
    private C3271ed f21946c = C3271ed.f21992e;

    /* synthetic */ C3238dd(C3205cd cdVar) {
    }

    /* renamed from: a */
    public final C3238dd mo15950a(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.f21944a = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
    }

    /* renamed from: b */
    public final C3238dd mo15951b(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }
        this.f21945b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C3238dd mo15952c(C3271ed edVar) {
        this.f21946c = edVar;
        return this;
    }

    /* renamed from: d */
    public final C3337gd mo15953d() throws GeneralSecurityException {
        Integer num = this.f21944a;
        if (num != null && this.f21945b != null) {
            return new C3337gd(num.intValue(), this.f21945b.intValue(), this.f21946c, (C3304fd) null);
        }
        throw new GeneralSecurityException("Key size and/or tag size not set");
    }
}
