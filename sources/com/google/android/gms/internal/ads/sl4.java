package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sl4 {
    /* renamed from: a */
    public static void m20485a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            ot1.m18058c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
