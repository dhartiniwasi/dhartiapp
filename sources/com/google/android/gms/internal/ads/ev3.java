package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ev3 implements zn3 {

    /* renamed from: a */
    private final SecretKey f8958a;

    /* renamed from: b */
    private final byte[] f8959b;

    /* renamed from: c */
    private final byte[] f8960c;

    public ev3(byte[] bArr) throws GeneralSecurityException {
        lv3.m16238a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f8958a = secretKeySpec;
        Cipher b = m12275b();
        b.init(1, secretKeySpec);
        byte[] b2 = fu3.m12852b(b.doFinal(new byte[16]));
        this.f8959b = b2;
        this.f8960c = fu3.m12852b(b2);
    }

    /* renamed from: b */
    private static Cipher m12275b() throws GeneralSecurityException {
        if (tj3.m21050a(1)) {
            return (Cipher) su3.f17666e.mo14144a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo10018a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m12275b();
            b.init(1, this.f8958a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = gu3.m13542e(bArr, (max - 1) * 16, this.f8959b, 0, 16);
            } else {
                bArr2 = gu3.m13541d(fu3.m12851a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f8960c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(gu3.m13542e(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(gu3.m13541d(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
