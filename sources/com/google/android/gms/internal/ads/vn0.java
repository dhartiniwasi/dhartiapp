package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vn0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MediaPlayer f19167a;

    /* renamed from: b */
    final /* synthetic */ eo0 f19168b;

    vn0(eo0 eo0, MediaPlayer mediaPlayer) {
        this.f19168b = eo0;
        this.f19167a = mediaPlayer;
    }

    public final void run() {
        eo0.m12190I(this.f19168b, this.f19167a);
        eo0 eo0 = this.f19168b;
        if (eo0.f8879y != null) {
            eo0.f8879y.mo10222T();
        }
    }
}
