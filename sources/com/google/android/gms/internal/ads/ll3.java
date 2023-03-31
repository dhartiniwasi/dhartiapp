package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ll3 {

    /* renamed from: a */
    private final ig3 f12838a;

    /* renamed from: b */
    private final og3 f12839b;

    public ll3(ig3 ig3) {
        this.f12838a = ig3;
        this.f12839b = null;
    }

    public ll3(og3 og3) {
        this.f12838a = null;
        this.f12839b = og3;
    }

    /* renamed from: a */
    public final byte[] mo12044a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ig3 ig3 = this.f12838a;
        if (ig3 != null) {
            return ig3.mo9176b(bArr, bArr2);
        }
        return this.f12839b.mo10016a(bArr, bArr2);
    }
}
