package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.pj */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2738pj extends Thread {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f15868a;

    /* renamed from: b */
    final /* synthetic */ C2181ak f15869b;

    C2738pj(C2181ak akVar, AudioTrack audioTrack) {
        this.f15869b = akVar;
        this.f15868a = audioTrack;
    }

    public final void run() {
        try {
            this.f15868a.flush();
            this.f15868a.release();
        } finally {
            this.f15869b.f6629e.open();
        }
    }
}
