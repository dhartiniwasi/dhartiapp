package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.f7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2353f7 extends bn4 {
    public C2353f7(e92 e92, long j, long j2) {
        super(new wm4(), new C2316e7(e92, (C2279d7) null), j, 0, j + 1, 0, j2, 188, AdError.NETWORK_ERROR_CODE);
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ int m12445h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
