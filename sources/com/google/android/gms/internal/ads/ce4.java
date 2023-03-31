package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ce4 extends Handler {

    /* renamed from: a */
    final /* synthetic */ ee4 f7703a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ce4(ee4 ee4, Looper looper) {
        super(looper);
        this.f7703a = ee4;
    }

    public final void handleMessage(Message message) {
        ee4.m12068a(this.f7703a, message);
    }
}
