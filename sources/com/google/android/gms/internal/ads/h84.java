package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class h84 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ i84 f10249a;

    /* synthetic */ h84(i84 i84, g84 g84) {
        this.f10249a = i84;
    }

    public final void onReceive(Context context, Intent intent) {
        i84 i84 = this.f10249a;
        i84.f10673b.post(new f84(i84));
    }
}
