package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class v11 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ vs0 f18881a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f18882b;

    public /* synthetic */ v11(vs0 vs0, JSONObject jSONObject) {
        this.f18881a = vs0;
        this.f18882b = jSONObject;
    }

    public final void run() {
        this.f18881a.mo9090t0("AFMA_updateActiveView", this.f18882b);
    }
}
