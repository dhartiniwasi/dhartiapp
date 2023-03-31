package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.lw */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2602lw {

    /* renamed from: a */
    private static final vx3 f12966a = new C2528jw();

    /* renamed from: a */
    public static int m16240a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 1000) {
            return 0;
        }
        return AdError.NO_FILL_ERROR_CODE;
    }
}
