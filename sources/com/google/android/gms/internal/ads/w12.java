package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class w12 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ lf3 f19426a;

    /* renamed from: b */
    public final /* synthetic */ lf3 f19427b;

    /* renamed from: c */
    public final /* synthetic */ lf3 f19428c;

    public /* synthetic */ w12(lf3 lf3, lf3 lf32, lf3 lf33) {
        this.f19426a = lf3;
        this.f19427b = lf32;
        this.f19428c = lf33;
    }

    public final Object call() {
        return new h22((l22) this.f19426a.get(), (JSONObject) this.f19427b.get(), (bh0) this.f19428c.get());
    }
}
