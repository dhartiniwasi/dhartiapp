package com.google.android.gms.internal.ads;

import android.content.Context;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class aq2 implements b44 {

    /* renamed from: a */
    private final o44 f6729a;

    /* renamed from: b */
    private final o44 f6730b;

    /* renamed from: c */
    private final o44 f6731c;

    public aq2(o44 o44, o44 o442, o44 o443) {
        this.f6729a = o44;
        this.f6730b = o442;
        this.f6731c = o443;
    }

    /* renamed from: a */
    public final up2 mo8155d() {
        rl0 rl0;
        Context context = (Context) this.f6729a.mo8155d();
        mu2 mu2 = (mu2) this.f6730b.mo8155d();
        fv2 fv2 = (fv2) this.f6731c.mo8155d();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14703u5)).booleanValue()) {
            rl0 = C4409t.m29325q().mo15117h().mo18486U();
        } else {
            rl0 = C4409t.m29325q().mo15117h().mo18487V();
        }
        boolean z = false;
        if (rl0 != null && rl0.mo13848h()) {
            z = true;
        }
        if (((Integer) C4596v.m30088c().mo12227b(C2679nz.f14723w5)).intValue() > 0) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14693t5)).booleanValue() || z) {
                ev2 a = fv2.mo10312a(uu2.Rewarded, context, mu2, new yo2(new vo2()));
                kp2 kp2 = new kp2(new jp2());
                qu2 qu2 = a.f8956a;
                mf3 mf3 = dn0.f8325a;
                return new ap2(kp2, new gp2(qu2, mf3), a.f8957b, a.f8956a.zza().f20354h, mf3);
            }
        }
        return new jp2();
    }
}
