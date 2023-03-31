package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3313fm implements C3897xe {

    /* renamed from: a */
    private final SecretKey f22032a;

    /* renamed from: b */
    private final byte[] f22033b;

    /* renamed from: c */
    private final byte[] f22034c;

    public C3313fm(byte[] bArr) throws GeneralSecurityException {
        C3544mm.m26217b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f22032a = secretKeySpec;
        Cipher b = m25590b();
        b.init(1, secretKeySpec);
        byte[] b2 = C3503le.m26102b(b.doFinal(new byte[16]));
        this.f22033b = b2;
        this.f22034c = C3503le.m26102b(b2);
    }

    /* renamed from: b */
    private static Cipher m25590b() throws GeneralSecurityException {
        if (C3201c9.m25322a(1)) {
            return (Cipher) C3741sl.f22687e.mo16763a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo16030a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m25590b();
            b.init(1, this.f22032a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = C3411il.m25825e(bArr, (max - 1) * 16, this.f22033b, 0, 16);
            } else {
                bArr2 = C3411il.m25824d(C3503le.m26101a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f22034c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(C3411il.m25825e(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(C3411il.m25824d(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
