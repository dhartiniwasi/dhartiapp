package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class gc4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AudioTrack f9836a;

    /* renamed from: b */
    public final /* synthetic */ yc1 f9837b;

    public /* synthetic */ gc4(AudioTrack audioTrack, yc1 yc1) {
        this.f9836a = audioTrack;
        this.f9837b = yc1;
    }

    public final void run() {
        vc4.m22132t(this.f9836a, this.f9837b);
    }
}
