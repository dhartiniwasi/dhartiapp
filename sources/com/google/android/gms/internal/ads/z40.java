package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z40 implements e60 {

    /* renamed from: a */
    private final a50 f20929a;

    public z40(a50 a50) {
        this.f20929a = a50;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            pm0.m18667g("App event with no name parameter.");
        } else {
            this.f20929a.mo8204R(str, (String) map.get("info"));
        }
    }
}
