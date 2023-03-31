package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class du3 implements ig3 {

    /* renamed from: a */
    private final jj3 f8428a;

    public du3(byte[] bArr) throws GeneralSecurityException {
        if (tj3.m21050a(2)) {
            this.f8428a = new jj3(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f8428a.mo11408a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f8428a.mo11409b(jv3.m15081a(12), bArr, bArr2);
    }
}
