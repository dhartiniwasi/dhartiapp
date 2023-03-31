package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lk3 implements qg3 {

    /* renamed from: a */
    final th3 f12833a;

    public lk3(th3 th3) {
        this.f12833a = th3;
    }

    /* renamed from: a */
    public final byte[] mo12040a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        th3 th3 = this.f12833a;
        if (th3.mo14306a() != null) {
            return gu3.m13540c(th3.mo14306a().mo12626d(), ((qg3) this.f12833a.mo14306a().mo12625c()).mo12040a(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
