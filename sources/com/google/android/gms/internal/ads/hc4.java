package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class hc4 {
    /* renamed from: a */
    public static void m13803a(AudioTrack audioTrack, bb4 bb4) {
        LogSessionId a = bb4.mo8717a();
        if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(a);
        }
    }
}
