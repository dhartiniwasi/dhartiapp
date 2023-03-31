package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class b22 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ lf3 f7079a;

    /* renamed from: b */
    public final /* synthetic */ lf3 f7080b;

    public /* synthetic */ b22(lf3 lf3, lf3 lf32) {
        this.f7079a = lf3;
        this.f7080b = lf32;
    }

    public final Object call() {
        lf3 lf3 = this.f7079a;
        lf3 lf32 = this.f7080b;
        return new h22((l22) lf3.get(), ((f22) lf32.get()).f9099b, ((f22) lf32.get()).f9098a);
    }
}
