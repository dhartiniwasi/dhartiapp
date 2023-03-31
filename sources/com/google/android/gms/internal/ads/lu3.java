package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lu3 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f12959a;

    /* renamed from: b */
    final /* synthetic */ nw3 f12960b;

    public lu3(nw3 nw3, Handler handler) {
        this.f12960b = nw3;
        this.f12959a = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f12959a.post(new kt3(this, i));
    }
}
