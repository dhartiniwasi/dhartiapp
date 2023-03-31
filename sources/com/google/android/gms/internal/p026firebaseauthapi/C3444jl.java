package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3444jl implements C3758t5 {

    /* renamed from: a */
    private final C3827v8 f22234a;

    public C3444jl(byte[] bArr) throws GeneralSecurityException {
        this.f22234a = new C3827v8(bArr);
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f22234a.mo16980b(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
