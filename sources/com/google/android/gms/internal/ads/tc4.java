package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tc4 {

    /* renamed from: a */
    private final Handler f17951a = new Handler(Looper.myLooper());

    /* renamed from: b */
    private final AudioTrack.StreamEventCallback f17952b;

    /* renamed from: c */
    final /* synthetic */ vc4 f17953c;

    public tc4(vc4 vc4) {
        this.f17953c = vc4;
        this.f17952b = new sc4(this, vc4);
    }

    /* renamed from: a */
    public final void mo14288a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new rc4(this.f17951a), this.f17952b);
    }

    /* renamed from: b */
    public final void mo14289b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f17952b);
        this.f17951a.removeCallbacksAndMessages((Object) null);
    }
}
