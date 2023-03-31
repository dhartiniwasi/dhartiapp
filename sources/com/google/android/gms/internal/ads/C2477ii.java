package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.ii */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2477ii extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2514ji f10791a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2477ii(C2514ji jiVar, Looper looper) {
        super(looper);
        this.f10791a = jiVar;
    }

    public final void handleMessage(Message message) {
        this.f10791a.mo11405f(message);
    }
}
