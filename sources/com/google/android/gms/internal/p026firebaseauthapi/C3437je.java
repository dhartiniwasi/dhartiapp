package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.je */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3437je implements C3693r6 {

    /* renamed from: a */
    private final C3953z6 f22231a;

    /* renamed from: b */
    private final C3668qe f22232b;

    /* renamed from: c */
    private final C3668qe f22233c;

    /* synthetic */ C3437je(C3953z6 z6Var, C3404ie ieVar) {
        C3668qe qeVar;
        this.f22231a = z6Var;
        if (z6Var.mo17099f()) {
            C3701re b = C3862wb.m27280a().mo16983b();
            C3865we a = C3764tb.m26996a(z6Var);
            this.f22232b = b.mo16671a(a, "mac", "compute");
            qeVar = b.mo16671a(a, "mac", "verify");
        } else {
            qeVar = C3764tb.f22735a;
            this.f22232b = qeVar;
        }
        this.f22233c = qeVar;
    }

    /* renamed from: a */
    public final void mo16186a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C3825v6 v6Var : this.f22231a.mo17098e(copyOf)) {
                if (v6Var.mo16936d().equals(C3674qk.LEGACY)) {
                    bArr3 = C3411il.m25823c(bArr2, C3470ke.f22296b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((C3693r6) v6Var.mo16937e()).mo16186a(copyOfRange, bArr3);
                    v6Var.mo16933a();
                    return;
                } catch (GeneralSecurityException e) {
                    C3470ke.f22295a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (C3825v6 v6Var2 : this.f22231a.mo17098e(C3856w5.f22862a)) {
                try {
                    ((C3693r6) v6Var2.mo16937e()).mo16186a(bArr, bArr2);
                    v6Var2.mo16933a();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
