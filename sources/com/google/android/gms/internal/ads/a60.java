package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class a60 implements e60 {
    a60() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            vs0.mo8523q0();
        } else if ("resume".equals(str)) {
            vs0.mo8522e0();
        }
    }
}
