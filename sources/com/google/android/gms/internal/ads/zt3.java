package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zt3 implements dv3 {

    /* renamed from: d */
    private static final ThreadLocal f21274d = new yt3();

    /* renamed from: a */
    private final SecretKeySpec f21275a;

    /* renamed from: b */
    private final int f21276b;

    /* renamed from: c */
    private final int f21277c;

    public zt3(byte[] bArr, int i) throws GeneralSecurityException {
        if (tj3.m21050a(2)) {
            lv3.m16238a(bArr.length);
            this.f21275a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f21274d.get()).getBlockSize();
            this.f21277c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f21276b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    private final void m24801c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f21274d.get();
        byte[] bArr4 = new byte[this.f21277c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f21276b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f21275a, ivParameterSpec);
        } else {
            cipher.init(2, this.f21275a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    /* renamed from: a */
    public final byte[] mo9704a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f21276b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f21276b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            m24801c(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo9705b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f21276b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = jv3.m15081a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f21276b);
            m24801c(bArr, 0, length, bArr2, this.f21276b, a, true);
            return bArr2;
        }
        int i2 = this.f21276b;
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i2));
    }
}
