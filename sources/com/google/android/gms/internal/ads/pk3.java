package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pk3 implements sk3 {

    /* renamed from: a */
    private final int f15892a;

    pk3(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            this.f15892a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    /* renamed from: a */
    public final byte[] mo13292a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f15892a) {
            return new jj3(bArr, false).mo11409b(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    /* renamed from: d */
    public final byte[] mo13293d() throws GeneralSecurityException {
        int i = this.f15892a;
        if (i == 16) {
            return gl3.f9959i;
        }
        if (i == 32) {
            return gl3.f9960j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final int zza() {
        return this.f15892a;
    }
}
