package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.rj */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class C2812rj {

    /* renamed from: a */
    protected AudioTrack f16971a;

    /* renamed from: b */
    private boolean f16972b;

    /* renamed from: c */
    private int f16973c;

    /* renamed from: d */
    private long f16974d;

    /* renamed from: e */
    private long f16975e;

    /* renamed from: f */
    private long f16976f;

    /* renamed from: g */
    private long f16977g;

    /* renamed from: h */
    private long f16978h;

    /* renamed from: i */
    private long f16979i;

    /* synthetic */ C2812rj(C2775qj qjVar) {
    }

    /* renamed from: a */
    public final long mo13813a() {
        if (this.f16977g != -9223372036854775807L) {
            return Math.min(this.f16979i, this.f16978h + ((((SystemClock.elapsedRealtime() * 1000) - this.f16977g) * ((long) this.f16973c)) / 1000000));
        }
        int playState = this.f16971a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) this.f16971a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f16972b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f16976f = this.f16974d;
            }
            playbackHeadPosition += this.f16976f;
        }
        if (this.f16974d > playbackHeadPosition) {
            this.f16975e++;
        }
        this.f16974d = playbackHeadPosition;
        return playbackHeadPosition + (this.f16975e << 32);
    }

    /* renamed from: b */
    public final long mo13814b() {
        return (mo13813a() * 1000000) / ((long) this.f16973c);
    }

    /* renamed from: c */
    public long mo13815c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo13816d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo13817e(long j) {
        this.f16978h = mo13813a();
        this.f16977g = SystemClock.elapsedRealtime() * 1000;
        this.f16979i = j;
        this.f16971a.stop();
    }

    /* renamed from: f */
    public final void mo13818f() {
        if (this.f16977g == -9223372036854775807L) {
            this.f16971a.pause();
        }
    }

    /* renamed from: g */
    public void mo13819g(AudioTrack audioTrack, boolean z) {
        this.f16971a = audioTrack;
        this.f16972b = z;
        this.f16977g = -9223372036854775807L;
        this.f16974d = 0;
        this.f16975e = 0;
        this.f16976f = 0;
        if (audioTrack != null) {
            this.f16973c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo13820h() {
        return false;
    }
}
