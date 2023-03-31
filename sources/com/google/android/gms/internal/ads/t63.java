package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class t63 implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ b73 f17863a;

    public /* synthetic */ t63(b73 b73) {
        this.f17863a = b73;
    }

    public final void binderDied() {
        b73.m10217h(this.f17863a);
    }
}
