package com.google.android.gms.internal.ads;

import java.util.Map;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class kt2 implements e60 {

    /* renamed from: a */
    public final /* synthetic */ rz2 f12289a;

    /* renamed from: b */
    public final /* synthetic */ o42 f12290b;

    public /* synthetic */ kt2(rz2 rz2, o42 o42) {
        this.f12289a = rz2;
        this.f12290b = o42;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        rz2 rz2 = this.f12289a;
        o42 o42 = this.f12290b;
        ms0 ms0 = (ms0) obj;
        String str = (String) map.get("u");
        if (str == null) {
            pm0.m18667g("URL missing from httpTrack GMSG.");
        } else if (!ms0.mo12114i0().f10989k0) {
            rz2.mo13909c(str, (yy2) null);
        } else {
            o42.mo12822g(new q42(C4409t.m29310b().mo18370a(), ((tt0) ms0).mo12089P0().f12930b, str, 2));
        }
    }
}
