package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class v12 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ lf3 f18883a;

    /* renamed from: b */
    public final /* synthetic */ lf3 f18884b;

    public /* synthetic */ v12(lf3 lf3, lf3 lf32) {
        this.f18883a = lf3;
        this.f18884b = lf32;
    }

    public final Object call() {
        return new o22((JSONObject) this.f18883a.get(), (bh0) this.f18884b.get());
    }
}
