package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class h42 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ o42 f10189a;

    public /* synthetic */ h42(o42 o42) {
        this.f10189a = o42;
    }

    public final Object call() {
        return this.f10189a.getWritableDatabase();
    }
}
