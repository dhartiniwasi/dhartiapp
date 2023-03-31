package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qk3 implements sk3 {
    qk3() {
    }

    /* renamed from: a */
    public final byte[] mo13292a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new mj3(bArr).mo12642d(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    /* renamed from: d */
    public final byte[] mo13293d() {
        return gl3.f9961k;
    }

    public final int zza() {
        return 32;
    }
}
