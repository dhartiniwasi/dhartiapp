package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hv3 implements ih3 {

    /* renamed from: a */
    private final zn3 f10504a;

    /* renamed from: b */
    private final int f10505b;

    public hv3(zn3 zn3, int i) throws GeneralSecurityException {
        this.f10504a = zn3;
        this.f10505b = i;
        if (i >= 10) {
            zn3.mo10018a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo10953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!gu3.m13539b(mo10954b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: b */
    public final byte[] mo10954b(byte[] bArr) throws GeneralSecurityException {
        return this.f10504a.mo10018a(bArr, this.f10505b);
    }
}
