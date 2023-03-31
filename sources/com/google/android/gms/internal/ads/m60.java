package com.google.android.gms.internal.ads;

import java.util.Map;
import p053g4.C4391b;
import p067i5.C4692f;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m60 implements e60 {

    /* renamed from: d */
    static final Map f13231d = C4692f.m30382e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final C4391b f13232a;

    /* renamed from: b */
    private final ee0 f13233b;

    /* renamed from: c */
    private final me0 f13234c;

    public m60(C4391b bVar, ee0 ee0, me0 me0) {
        this.f13232a = bVar;
        this.f13233b = ee0;
        this.f13234c = me0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        int intValue = ((Integer) f13231d.get((String) map.get("a"))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f13232a.mo17898c()) {
                    this.f13232a.mo17897b((String) null);
                    return;
                } else if (intValue == 1) {
                    this.f13233b.mo9891i(map);
                    return;
                } else if (intValue == 3) {
                    new ie0(vs0, map).mo11098i();
                    return;
                } else if (intValue == 4) {
                    new ce0(vs0, map).mo9162j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f13233b.mo9890h(true);
                        return;
                    } else if (intValue != 7) {
                        pm0.m18666f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f13234c.mo11508e();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (vs0 == null) {
            pm0.m18667g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        vs0.mo12096V0(i);
    }
}
