package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3728s8 {

    /* renamed from: c */
    private static final ThreadLocal f22669c = new C3695r8();

    /* renamed from: a */
    private final SecretKey f22670a;

    /* renamed from: b */
    private final boolean f22671b;

    public C3728s8(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (C3201c9.m25322a(2)) {
            C3544mm.m26217b(bArr.length);
            this.f22670a = new SecretKeySpec(bArr, "AES");
            this.f22671b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo16751a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        int i = 12;
        if (bArr.length == 12) {
            boolean z = this.f22671b;
            int i2 = true != z ? 16 : 28;
            int length = bArr2.length;
            if (length < i2) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                if (!C3511lm.m26124a() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) {
                    algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                } else {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                }
                ThreadLocal threadLocal = f22669c;
                ((Cipher) threadLocal.get()).init(2, this.f22670a, algorithmParameterSpec);
                boolean z2 = this.f22671b;
                if (true != z2) {
                    i = 0;
                }
                if (z2) {
                    length -= 12;
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, i, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }
}
