package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rs1 implements ra1 {

    /* renamed from: a */
    private final vs0 f17090a;

    rs1(vs0 vs0) {
        this.f17090a = vs0;
    }

    /* renamed from: c */
    public final void mo9006c(Context context) {
        vs0 vs0 = this.f17090a;
        if (vs0 != null) {
            vs0.onPause();
        }
    }

    /* renamed from: e */
    public final void mo9007e(Context context) {
        vs0 vs0 = this.f17090a;
        if (vs0 != null) {
            vs0.destroy();
        }
    }

    /* renamed from: f */
    public final void mo9008f(Context context) {
        vs0 vs0 = this.f17090a;
        if (vs0 != null) {
            vs0.onResume();
        }
    }
}
