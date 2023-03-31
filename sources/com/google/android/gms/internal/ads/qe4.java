package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qe4 {
    /* renamed from: a */
    public static void m19177a(le4 le4, bb4 bb4) {
        LogSessionId a = bb4.mo8717a();
        if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            le4.f12758b.setString("log-session-id", a.getStringId());
        }
    }
}
