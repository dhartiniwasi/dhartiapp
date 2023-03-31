package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class hq3 extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    private final ir3 f10457a;

    /* renamed from: b */
    private final Handler f10458b;

    /* renamed from: c */
    final /* synthetic */ js3 f10459c;

    public hq3(js3 js3, Handler handler, ir3 ir3) {
        this.f10459c = js3;
        this.f10458b = handler;
        this.f10457a = ir3;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10458b.post(this);
        }
    }

    public final void run() {
    }
}
