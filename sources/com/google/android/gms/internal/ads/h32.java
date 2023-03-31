package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class h32 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ f32 f10176a;

    public /* synthetic */ h32(f32 f32) {
        this.f10176a = f32;
    }

    public final Object call() {
        return this.f10176a.getWritableDatabase();
    }
}
