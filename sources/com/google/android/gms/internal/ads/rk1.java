package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rk1 implements e60 {

    /* renamed from: a */
    private final WeakReference f16992a;

    /* synthetic */ rk1(wk1 wk1, qk1 qk1) {
        this.f16992a = new WeakReference(wk1);
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        wk1 wk1 = (wk1) this.f16992a.get();
        if (wk1 != null && "_ac".equals((String) map.get("eventName"))) {
            wk1.f19671h.onAdClicked();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14726w8)).booleanValue()) {
                wk1.f19672i.mo9272h();
            }
        }
    }
}
