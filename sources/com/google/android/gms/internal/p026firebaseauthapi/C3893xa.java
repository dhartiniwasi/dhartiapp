package com.google.android.gms.internal.p026firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3893xa implements C3758t5 {

    /* renamed from: b */
    private static final String f22913b = "xa";

    /* renamed from: a */
    private final SecretKey f22914a;

    C3893xa(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f22914a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: c */
    private static void m27365c() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: d */
    private final byte[] m27366d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f22914a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: e */
    private final byte[] m27367e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f22914a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m27366d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f22913b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m27365c();
            return m27366d(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m27367e(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f22913b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m27365c();
            return m27367e(bArr, bArr2);
        }
    }
}
