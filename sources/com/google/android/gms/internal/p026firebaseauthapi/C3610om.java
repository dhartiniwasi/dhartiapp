package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.om */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3610om implements C3758t5 {

    /* renamed from: a */
    private final C3923y8 f22467a;

    public C3610om(byte[] bArr) throws GeneralSecurityException {
        this.f22467a = new C3923y8(bArr);
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f22467a.mo16980b(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
