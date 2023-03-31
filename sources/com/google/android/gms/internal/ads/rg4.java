package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class rg4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ vg4 f16943a;

    /* renamed from: b */
    public final /* synthetic */ wg4 f16944b;

    /* renamed from: c */
    public final /* synthetic */ cg4 f16945c;

    /* renamed from: d */
    public final /* synthetic */ ig4 f16946d;

    /* renamed from: e */
    public final /* synthetic */ IOException f16947e;

    /* renamed from: f */
    public final /* synthetic */ boolean f16948f;

    public /* synthetic */ rg4(vg4 vg4, wg4 wg4, cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
        this.f16943a = vg4;
        this.f16944b = wg4;
        this.f16945c = cg4;
        this.f16946d = ig4;
        this.f16947e = iOException;
        this.f16948f = z;
    }

    public final void run() {
        vg4 vg4 = this.f16943a;
        this.f16944b.mo11913z(vg4.f19089a, vg4.f19090b, this.f16945c, this.f16946d, this.f16947e, this.f16948f);
    }
}
