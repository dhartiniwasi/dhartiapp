package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.sj */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2849sj extends C2812rj {

    /* renamed from: j */
    private final AudioTimestamp f17488j = new AudioTimestamp();

    /* renamed from: k */
    private long f17489k;

    /* renamed from: l */
    private long f17490l;

    /* renamed from: m */
    private long f17491m;

    public C2849sj() {
        super((C2775qj) null);
    }

    /* renamed from: c */
    public final long mo13815c() {
        return this.f17491m;
    }

    /* renamed from: d */
    public final long mo13816d() {
        return this.f17488j.nanoTime;
    }

    /* renamed from: g */
    public final void mo13819g(AudioTrack audioTrack, boolean z) {
        super.mo13819g(audioTrack, z);
        this.f17489k = 0;
        this.f17490l = 0;
        this.f17491m = 0;
    }

    /* renamed from: h */
    public final boolean mo13820h() {
        boolean timestamp = this.f16971a.getTimestamp(this.f17488j);
        if (timestamp) {
            long j = this.f17488j.framePosition;
            if (this.f17490l > j) {
                this.f17489k++;
            }
            this.f17490l = j;
            this.f17491m = j + (this.f17489k << 32);
        }
        return timestamp;
    }
}
