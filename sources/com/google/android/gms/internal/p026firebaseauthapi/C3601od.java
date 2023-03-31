package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.od */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3601od {

    /* renamed from: a */
    private C3960zd f22462a = null;

    /* renamed from: b */
    private C3676qm f22463b = null;

    /* renamed from: c */
    private Integer f22464c = null;

    /* synthetic */ C3601od(C3568nd ndVar) {
    }

    /* renamed from: a */
    public final C3601od mo16500a(Integer num) {
        this.f22464c = num;
        return this;
    }

    /* renamed from: b */
    public final C3601od mo16501b(C3676qm qmVar) {
        this.f22463b = qmVar;
        return this;
    }

    /* renamed from: c */
    public final C3601od mo16502c(C3960zd zdVar) {
        this.f22462a = zdVar;
        return this;
    }

    /* renamed from: d */
    public final C3667qd mo16503d() throws GeneralSecurityException {
        C3676qm qmVar;
        C3643pm b;
        C3960zd zdVar = this.f22462a;
        if (zdVar == null || (qmVar = this.f22463b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zdVar.mo17102a() != qmVar.mo16605a()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zdVar.mo17105d() && this.f22464c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.f22462a.mo17105d() || this.f22464c == null) {
            if (this.f22462a.mo17104c() == C3896xd.f22920e) {
                b = C3643pm.m26493b(new byte[0]);
            } else if (this.f22462a.mo17104c() == C3896xd.f22919d || this.f22462a.mo17104c() == C3896xd.f22918c) {
                b = C3643pm.m26493b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f22464c.intValue()).array());
            } else if (this.f22462a.mo17104c() == C3896xd.f22917b) {
                b = C3643pm.m26493b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f22464c.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f22462a.mo17104c())));
            }
            return new C3667qd(this.f22462a, this.f22463b, b, this.f22464c, (C3634pd) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
