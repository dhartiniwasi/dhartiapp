package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oh2 implements sj2 {

    /* renamed from: a */
    public final hs2 f15075a;

    public oh2(hs2 hs2) {
        this.f15075a = hs2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        hs2 hs2 = this.f15075a;
        if (hs2 != null) {
            bundle.putBoolean("render_in_browser", hs2.mo10944d());
            bundle.putBoolean("disable_ml", this.f15075a.mo10943c());
        }
    }
}
