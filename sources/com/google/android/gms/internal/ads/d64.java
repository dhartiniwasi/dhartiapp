package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class d64 {
    /* renamed from: a */
    public static bb4 m11334a(Context context, o64 o64, boolean z) {
        wa4 g = wa4.m22647g(context);
        if (g == null) {
            ot1.m18060e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new bb4(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            o64.mo12855y(g);
        }
        return new bb4(g.mo14886f());
    }
}
