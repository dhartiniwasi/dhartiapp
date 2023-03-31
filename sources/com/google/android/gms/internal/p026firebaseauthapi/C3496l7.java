package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3496l7 implements C3758t5 {

    /* renamed from: a */
    private final C3953z6 f22325a;

    /* renamed from: b */
    private final C3668qe f22326b;

    /* renamed from: c */
    private final C3668qe f22327c;

    /* synthetic */ C3496l7(C3953z6 z6Var, C3463k7 k7Var) {
        C3668qe qeVar;
        this.f22325a = z6Var;
        if (z6Var.mo17099f()) {
            C3701re b = C3862wb.m27280a().mo16983b();
            C3865we a = C3764tb.m26996a(z6Var);
            this.f22326b = b.mo16671a(a, "aead", "encrypt");
            qeVar = b.mo16671a(a, "aead", "decrypt");
        } else {
            qeVar = C3764tb.f22735a;
            this.f22326b = qeVar;
        }
        this.f22327c = qeVar;
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C3825v6 v6Var : this.f22325a.mo17098e(copyOf)) {
                try {
                    byte[] a = ((C3758t5) v6Var.mo16937e()).mo15791a(copyOfRange, bArr2);
                    v6Var.mo16933a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    C3529m7.f22352a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (C3825v6 v6Var2 : this.f22325a.mo17098e(C3856w5.f22862a)) {
            try {
                byte[] a2 = ((C3758t5) v6Var2.mo16937e()).mo15791a(bArr, bArr2);
                v6Var2.mo16933a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
