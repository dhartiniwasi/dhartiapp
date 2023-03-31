package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zb4 {

    /* renamed from: a */
    private final AudioTrack f21047a;

    /* renamed from: b */
    private final AudioTimestamp f21048b = new AudioTimestamp();

    /* renamed from: c */
    private long f21049c;

    /* renamed from: d */
    private long f21050d;

    /* renamed from: e */
    private long f21051e;

    public zb4(AudioTrack audioTrack) {
        this.f21047a = audioTrack;
    }

    /* renamed from: a */
    public final long mo15578a() {
        return this.f21051e;
    }

    /* renamed from: b */
    public final long mo15579b() {
        return this.f21048b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean mo15580c() {
        boolean timestamp = this.f21047a.getTimestamp(this.f21048b);
        if (timestamp) {
            long j = this.f21048b.framePosition;
            if (this.f21050d > j) {
                this.f21049c++;
            }
            this.f21050d = j;
            this.f21051e = j + (this.f21049c << 32);
        }
        return timestamp;
    }
}
