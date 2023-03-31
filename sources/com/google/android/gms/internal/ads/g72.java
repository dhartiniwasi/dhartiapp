package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p053g4.C4399j;
import p053g4.C4409t;
import p060h4.C4470a;
import p066i4.C4665e0;
import p066i4.C4679s;
import p066i4.C4680t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class g72 implements uj1 {

    /* renamed from: a */
    private final Context f9747a;

    /* renamed from: b */
    private final vm0 f9748b;

    /* renamed from: c */
    private final lf3 f9749c;

    /* renamed from: d */
    private final is2 f9750d;

    /* renamed from: e */
    private final vs0 f9751e;

    /* renamed from: f */
    private final et2 f9752f;

    /* renamed from: g */
    private final h60 f9753g;

    /* renamed from: h */
    private final boolean f9754h;

    g72(Context context, vm0 vm0, lf3 lf3, is2 is2, vs0 vs0, et2 et2, boolean z, h60 h60) {
        this.f9747a = context;
        this.f9748b = vm0;
        this.f9749c = lf3;
        this.f9750d = is2;
        this.f9751e = vs0;
        this.f9752f = et2;
        this.f9753g = h60;
        this.f9754h = z;
    }

    /* renamed from: a */
    public final void mo10408a(boolean z, Context context, ja1 ja1) {
        li1 li1 = (li1) cf3.m10919q(this.f9749c);
        this.f9751e.mo12119l1(true);
        boolean e = this.f9754h ? this.f9753g.mo10745e(false) : false;
        C4409t.m29326r();
        boolean e2 = C4751b2.m30610e(this.f9747a);
        boolean z2 = this.f9754h;
        C4399j jVar = new C4399j(e, e2, z2 ? this.f9753g.mo10744d() : false, z2 ? this.f9753g.mo10741a() : 0.0f, -1, z, this.f9750d.f10957P, false);
        if (ja1 != null) {
            ja1.mo11349T();
        }
        C4409t.m29319k();
        jj1 j = li1.mo12024j();
        vs0 vs0 = this.f9751e;
        is2 is2 = this.f9750d;
        int i = is2.f10959R;
        vm0 vm0 = this.f9748b;
        String str = is2.f10944C;
        ns2 ns2 = is2.f11003t;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C4470a) null, (C4680t) j, (C4665e0) null, vs0, i, vm0, str, jVar, ns2.f14184b, ns2.f14183a, this.f9752f.f8935f, ja1);
        C4679s.m30352a(context, adOverlayInfoParcel, true);
    }
}
