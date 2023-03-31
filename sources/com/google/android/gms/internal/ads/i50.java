package com.google.android.gms.internal.ads;

import java.util.Map;
import p073j4.C4746a1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class i50 implements e60 {

    /* renamed from: a */
    public static final /* synthetic */ i50 f10614a = new i50();

    private /* synthetic */ i50() {
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        e60 e60 = d60.f8078a;
        String str = (String) map.get("u");
        if (str == null) {
            pm0.m18667g("URL missing from httpTrack GMSG.");
        } else {
            new C4746a1(xt0.getContext(), ((fu0) xt0).mo10299b0().f19150a, str).mo15227b();
        }
    }
}
