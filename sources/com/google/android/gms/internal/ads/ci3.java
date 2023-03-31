package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ci3 implements ig3 {

    /* renamed from: a */
    private final th3 f7762a;

    /* renamed from: b */
    private final sn3 f7763b;

    /* renamed from: c */
    private final sn3 f7764c;

    /* synthetic */ ci3(th3 th3, bi3 bi3) {
        sn3 sn3;
        this.f7762a = th3;
        if (th3.mo14311f()) {
            tn3 b = am3.m9855a().mo8437b();
            yn3 a = xl3.m23367a(th3);
            this.f7763b = b.mo14331a(a, "aead", "encrypt");
            sn3 = b.mo14331a(a, "aead", "decrypt");
        } else {
            sn3 = xl3.f20195a;
            this.f7763b = sn3;
        }
        this.f7764c = sn3;
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (nh3 nh3 : this.f7762a.mo14310e(copyOf)) {
                try {
                    byte[] a = ((ig3) nh3.mo12625c()).mo9175a(copyOfRange, bArr2);
                    nh3.mo12623a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    di3.f8286a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (nh3 nh32 : this.f7762a.mo14310e(ng3.f14013a)) {
            try {
                byte[] a2 = ((ig3) nh32.mo12625c()).mo9175a(bArr, bArr2);
                nh32.mo12623a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] c = gu3.m13540c(this.f7762a.mo14306a().mo12626d(), ((ig3) this.f7762a.mo14306a().mo12625c()).mo9176b(bArr, bArr2));
            this.f7762a.mo14306a().mo12623a();
            int length = bArr.length;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
