package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bb4 {

    /* renamed from: b */
    public static final bb4 f7200b = (gb2.f9812a < 31 ? new bb4() : new bb4(ab4.f6515b));

    /* renamed from: a */
    private final ab4 f7201a;

    public bb4() {
        this.f7201a = null;
        v91.m22052f(gb2.f9812a < 31);
    }

    private bb4(ab4 ab4) {
        this.f7201a = ab4;
    }

    /* renamed from: a */
    public final LogSessionId mo8717a() {
        ab4 ab4 = this.f7201a;
        Objects.requireNonNull(ab4);
        return ab4.f6516a;
    }

    public bb4(LogSessionId logSessionId) {
        this.f7201a = new ab4(logSessionId);
    }
}
