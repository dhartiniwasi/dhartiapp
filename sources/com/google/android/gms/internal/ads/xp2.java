package com.google.android.gms.internal.ads;

import android.content.Context;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xp2 {
    /* renamed from: a */
    static up2 m23490a(Context context, mu2 mu2, fv2 fv2) {
        return m23492c(context, mu2, fv2);
    }

    /* renamed from: b */
    static up2 m23491b(Context context, mu2 mu2, fv2 fv2) {
        return m23492c(context, mu2, fv2);
    }

    /* renamed from: c */
    private static up2 m23492c(Context context, mu2 mu2, fv2 fv2) {
        rl0 rl0;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14703u5)).booleanValue()) {
            rl0 = C4409t.m29325q().mo15117h().mo18486U();
        } else {
            rl0 = C4409t.m29325q().mo15117h().mo18487V();
        }
        boolean z = false;
        if (rl0 != null && rl0.mo13848h()) {
            z = true;
        }
        if (((Integer) C4596v.m30088c().mo12227b(C2679nz.f14348K5)).intValue() > 0) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14693t5)).booleanValue() || z) {
                ev2 a = fv2.mo10312a(uu2.AppOpen, context, mu2, new yo2(new vo2()));
                kp2 kp2 = new kp2(new jp2());
                qu2 qu2 = a.f8956a;
                mf3 mf3 = dn0.f8325a;
                return new ap2(kp2, new gp2(qu2, mf3), a.f8957b, a.f8956a.zza().f20354h, mf3);
            }
        }
        return new jp2();
    }
}
