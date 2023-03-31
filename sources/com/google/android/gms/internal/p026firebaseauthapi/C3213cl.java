package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.cl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3213cl implements C3280em {

    /* renamed from: d */
    private static final ThreadLocal f21881d = new C3180bl();

    /* renamed from: a */
    private final SecretKeySpec f21882a;

    /* renamed from: b */
    private final int f21883b;

    /* renamed from: c */
    private final int f21884c;

    public C3213cl(byte[] bArr, int i) throws GeneralSecurityException {
        if (C3201c9.m25322a(2)) {
            C3544mm.m26217b(bArr.length);
            this.f21882a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f21881d.get()).getBlockSize();
            this.f21884c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f21883b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo15908a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f21883b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f21883b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            Cipher cipher = (Cipher) f21881d.get();
            byte[] bArr4 = new byte[this.f21884c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f21883b);
            cipher.init(2, this.f21882a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
