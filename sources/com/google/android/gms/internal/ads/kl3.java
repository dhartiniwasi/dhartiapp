package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kl3 implements yk3 {

    /* renamed from: a */
    private final pv3 f12144a;

    /* renamed from: b */
    private final pv3 f12145b;

    private kl3(byte[] bArr, byte[] bArr2) {
        this.f12144a = pv3.m18935a(bArr);
        this.f12145b = pv3.m18935a(bArr2);
    }

    /* renamed from: a */
    static kl3 m15457a(byte[] bArr) throws GeneralSecurityException {
        return new kl3(bArr, nv3.m17295c(bArr));
    }
}
