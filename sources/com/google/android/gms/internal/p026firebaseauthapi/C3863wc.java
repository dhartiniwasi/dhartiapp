package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3863wc {

    /* renamed from: a */
    private C3337gd f22873a = null;

    /* renamed from: b */
    private C3676qm f22874b = null;

    /* renamed from: c */
    private Integer f22875c = null;

    /* synthetic */ C3863wc(C3831vc vcVar) {
    }

    /* renamed from: a */
    public final C3863wc mo16984a(C3676qm qmVar) throws GeneralSecurityException {
        this.f22874b = qmVar;
        return this;
    }

    /* renamed from: b */
    public final C3863wc mo16985b(Integer num) {
        this.f22875c = num;
        return this;
    }

    /* renamed from: c */
    public final C3863wc mo16986c(C3337gd gdVar) {
        this.f22873a = gdVar;
        return this;
    }

    /* renamed from: d */
    public final C3927yc mo16987d() throws GeneralSecurityException {
        C3676qm qmVar;
        C3643pm b;
        C3337gd gdVar = this.f22873a;
        if (gdVar == null || (qmVar = this.f22874b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (gdVar.mo16070a() != qmVar.mo16605a()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (gdVar.mo16073d() && this.f22875c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.f22873a.mo16073d() || this.f22875c == null) {
            if (this.f22873a.mo16072c() == C3271ed.f21992e) {
                b = C3643pm.m26493b(new byte[0]);
            } else if (this.f22873a.mo16072c() == C3271ed.f21991d || this.f22873a.mo16072c() == C3271ed.f21990c) {
                b = C3643pm.m26493b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f22875c.intValue()).array());
            } else if (this.f22873a.mo16072c() == C3271ed.f21989b) {
                b = C3643pm.m26493b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f22875c.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f22873a.mo16072c())));
            }
            return new C3927yc(this.f22873a, this.f22874b, b, this.f22875c, (C3895xc) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
