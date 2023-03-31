package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p053g4.C4399j;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4607w4;
import p066i4.C4665e0;
import p066i4.C4679s;
import p066i4.C4680t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class r52 implements uj1 {

    /* renamed from: a */
    private final vm0 f16837a;

    /* renamed from: b */
    private final lf3 f16838b;

    /* renamed from: c */
    private final is2 f16839c;

    /* renamed from: d */
    private final vs0 f16840d;

    /* renamed from: e */
    private final et2 f16841e;

    /* renamed from: f */
    private final h60 f16842f;

    /* renamed from: g */
    private final boolean f16843g;

    r52(vm0 vm0, lf3 lf3, is2 is2, vs0 vs0, et2 et2, boolean z, h60 h60) {
        this.f16837a = vm0;
        this.f16838b = lf3;
        this.f16839c = is2;
        this.f16840d = vs0;
        this.f16841e = et2;
        this.f16843g = z;
        this.f16842f = h60;
    }

    /* renamed from: a */
    public final void mo10408a(boolean z, Context context, ja1 ja1) {
        int i;
        b31 b31 = (b31) cf3.m10919q(this.f16838b);
        this.f16840d.mo12119l1(true);
        boolean e = this.f16843g ? this.f16842f.mo10745e(true) : true;
        boolean z2 = this.f16843g;
        C4399j jVar = new C4399j(e, true, z2 ? this.f16842f.mo10744d() : false, z2 ? this.f16842f.mo10741a() : 0.0f, -1, z, this.f16839c.f10957P, false);
        if (ja1 != null) {
            ja1.mo11349T();
        }
        C4409t.m29319k();
        jj1 i2 = b31.mo8659i();
        vs0 vs0 = this.f16840d;
        int i3 = this.f16839c.f10959R;
        if (i3 == -1) {
            C4607w4 w4Var = this.f16841e.f8939j;
            if (w4Var != null) {
                int i4 = w4Var.f25053a;
                if (i4 == 1) {
                    i = 7;
                } else if (i4 == 2) {
                    i = 6;
                }
                vm0 vm0 = this.f16837a;
                is2 is2 = this.f16839c;
                String str = is2.f10944C;
                ns2 ns2 = is2.f11003t;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C4470a) null, (C4680t) i2, (C4665e0) null, vs0, i, vm0, str, jVar, ns2.f14184b, ns2.f14183a, this.f16841e.f8935f, ja1);
                C4679s.m30352a(context, adOverlayInfoParcel, true);
            }
            pm0.m18662b("Error setting app open orientation; no targeting orientation available.");
            i3 = this.f16839c.f10959R;
        }
        i = i3;
        vm0 vm02 = this.f16837a;
        is2 is22 = this.f16839c;
        String str2 = is22.f10944C;
        ns2 ns22 = is22.f11003t;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((C4470a) null, (C4680t) i2, (C4665e0) null, vs0, i, vm02, str2, jVar, ns22.f14184b, ns22.f14183a, this.f16841e.f8935f, ja1);
        C4679s.m30352a(context, adOverlayInfoParcel3, true);
    }
}
