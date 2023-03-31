package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3708rl implements C3758t5 {

    /* renamed from: a */
    private final C3280em f22631a;

    /* renamed from: b */
    private final C3693r6 f22632b;

    /* renamed from: c */
    private final int f22633c;

    public C3708rl(C3280em emVar, C3693r6 r6Var, int i) {
        this.f22631a = emVar;
        this.f22632b = r6Var;
        this.f22633c = i;
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f22633c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f22633c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
            this.f22632b.mo16186a(copyOfRange2, C3411il.m25823c(bArr2, copyOfRange, copyOf));
            return this.f22631a.mo15908a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
