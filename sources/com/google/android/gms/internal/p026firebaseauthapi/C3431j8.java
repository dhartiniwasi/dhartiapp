package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3431j8 implements C3758t5 {

    /* renamed from: c */
    private static final byte[] f22224c = new byte[0];

    /* renamed from: a */
    private final C3607oj f22225a;

    /* renamed from: b */
    private final C3758t5 f22226b;

    public C3431j8(C3607oj ojVar, C3758t5 t5Var) {
        this.f22225a = ojVar;
        this.f22226b = t5Var;
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C3758t5) C3265e7.m25479j(this.f22225a.mo16512E(), this.f22226b.mo15791a(bArr3, f22224c), C3758t5.class)).mo15791a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
