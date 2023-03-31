package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fv2 {

    /* renamed from: a */
    private final HashMap f9472a = new HashMap();

    /* renamed from: a */
    public final ev2 mo10312a(uu2 uu2, Context context, mu2 mu2, lv2 lv2) {
        ev2 ev2 = (ev2) this.f9472a.get(uu2);
        if (ev2 != null) {
            return ev2;
        }
        ru2 ru2 = new ru2(xu2.m23545I1(uu2, context));
        ev2 ev22 = new ev2(ru2, new nv2(ru2, mu2, lv2));
        this.f9472a.put(uu2, ev22);
        return ev22;
    }
}
