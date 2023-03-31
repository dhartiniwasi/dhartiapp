package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3696r9 implements C3920y5 {

    /* renamed from: a */
    private final C3953z6 f22622a;

    /* renamed from: b */
    private final C3668qe f22623b;

    public C3696r9(C3953z6 z6Var) {
        this.f22622a = z6Var;
        this.f22623b = z6Var.mo17099f() ? C3862wb.m27280a().mo16983b().mo16671a(C3764tb.m26996a(z6Var), "hybrid_decrypt", "decrypt") : C3764tb.f22735a;
    }

    /* renamed from: a */
    public final byte[] mo15949a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (C3825v6 v6Var : this.f22622a.mo17098e(copyOfRange)) {
                try {
                    byte[] a = ((C3920y5) v6Var.mo16937e()).mo15949a(copyOfRange2, (byte[]) null);
                    v6Var.mo16933a();
                    int length2 = copyOfRange2.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    C3729s9.f22672a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        for (C3825v6 v6Var2 : this.f22622a.mo17098e(C3856w5.f22862a)) {
            try {
                byte[] a2 = ((C3920y5) v6Var2.mo16937e()).mo15949a(bArr, (byte[]) null);
                v6Var2.mo16933a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
