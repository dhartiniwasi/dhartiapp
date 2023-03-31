package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.gh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2401gh extends C2513jh {

    /* renamed from: i */
    private final View f9903i;

    public C2401gh(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, View view) {
        super(wfVar, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", ybVar, i, 57);
        this.f9903i = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (this.f9903i != null) {
            Boolean bool = (Boolean) C4596v.m30088c().mo12227b(C2679nz.f14275D2);
            Boolean bool2 = (Boolean) C4596v.m30088c().mo12227b(C2679nz.f14271C8);
            DisplayMetrics displayMetrics = this.f11600b.mo14902b().getResources().getDisplayMetrics();
            C2177ag agVar = new C2177ag((String) this.f11604f.invoke((Object) null, new Object[]{this.f9903i, displayMetrics, bool, bool2}));
            C2619mc G = C2656nc.m17004G();
            G.mo12313r(agVar.f6541b.longValue());
            G.mo12315u(agVar.f6542c.longValue());
            G.mo12316v(agVar.f6543d.longValue());
            if (bool2.booleanValue()) {
                G.mo12314s(agVar.f6545f.longValue());
            }
            if (bool.booleanValue()) {
                G.mo12312p(agVar.f6544e.longValue());
            }
            this.f11603e.mo15375Q((C2656nc) G.mo13423m());
        }
    }
}
