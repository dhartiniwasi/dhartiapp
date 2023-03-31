package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sj3 implements ig3 {

    /* renamed from: b */
    private static final ThreadLocal f17499b = new rj3();

    /* renamed from: a */
    private final SecretKey f17500a;

    public sj3(byte[] bArr) throws GeneralSecurityException {
        lv3.m16238a(bArr.length);
        this.f17500a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m20406c(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (kv3.m15635b()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec c = m20406c(bArr, 0, 12);
            ThreadLocal threadLocal = f17499b;
            ((Cipher) threadLocal.get()).init(2, this.f17500a, c);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) threadLocal.get()).updateAAD(bArr2);
            }
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = jv3.m15081a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c = m20406c(a, 0, a.length);
            ThreadLocal threadLocal = f17499b;
            ((Cipher) threadLocal.get()).init(1, this.f17500a, c);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
