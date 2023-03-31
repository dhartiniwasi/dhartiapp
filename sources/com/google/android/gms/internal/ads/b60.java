package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class b60 implements e60 {
    b60() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        if (map.keySet().contains("start")) {
            vs0.mo12108f0().mo9297X();
        } else if (map.keySet().contains("stop")) {
            vs0.mo12108f0().mo9298Z();
        } else if (map.keySet().contains("cancel")) {
            vs0.mo12108f0().mo9296W();
        }
    }
}
