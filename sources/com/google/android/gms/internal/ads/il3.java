package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class il3 implements yk3 {

    /* renamed from: a */
    private final pv3 f10847a;

    /* renamed from: b */
    private final pv3 f10848b;

    private il3(byte[] bArr, byte[] bArr2) {
        this.f10847a = pv3.m18935a(bArr);
        this.f10848b = pv3.m18935a(bArr2);
    }

    /* renamed from: a */
    static il3 m14393a(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        qu3.m19361e(qu3.m19366j(qu3.m19367k(i), 1, bArr2), qu3.m19364h(i, bArr));
        return new il3(bArr, bArr2);
    }
}
