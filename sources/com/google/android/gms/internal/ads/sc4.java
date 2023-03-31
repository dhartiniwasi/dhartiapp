package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sc4 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ vc4 f17347a;

    /* renamed from: b */
    final /* synthetic */ tc4 f17348b;

    sc4(tc4 tc4, vc4 vc4) {
        this.f17348b = tc4;
        this.f17347a = vc4;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f17348b.f17953c.f19056q)) {
            vc4 vc4 = this.f17348b.f17953c;
            if (vc4.f19053n != null && vc4.f19032O) {
                vc4.f19053n.mo8316d();
            }
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f17348b.f17953c.f19056q)) {
            vc4 vc4 = this.f17348b.f17953c;
            if (vc4.f19053n != null && vc4.f19032O) {
                vc4.f19053n.mo8316d();
            }
        }
    }
}
