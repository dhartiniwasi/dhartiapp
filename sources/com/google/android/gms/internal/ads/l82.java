package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l82 extends k82 {

    /* renamed from: a */
    private final su0 f12681a;

    /* renamed from: b */
    private final f91 f12682b;

    /* renamed from: c */
    private final va2 f12683c;

    /* renamed from: d */
    private final nf1 f12684d;

    /* renamed from: e */
    private final dk1 f12685e;

    /* renamed from: f */
    private final nc1 f12686f;

    /* renamed from: g */
    private final ViewGroup f12687g;

    /* renamed from: h */
    private final ve1 f12688h;

    public l82(su0 su0, f91 f91, va2 va2, nf1 nf1, dk1 dk1, nc1 nc1, ViewGroup viewGroup, ve1 ve1) {
        this.f12681a = su0;
        this.f12682b = f91;
        this.f12683c = va2;
        this.f12684d = nf1;
        this.f12685e = dk1;
        this.f12686f = nc1;
        this.f12687g = viewGroup;
        this.f12688h = ve1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final lf3 mo11055c(et2 et2, Bundle bundle) {
        n41 i = this.f12681a.mo9716i();
        f91 f91 = this.f12682b;
        f91.mo10114f(et2);
        f91.mo10112d(bundle);
        i.mo12530p(f91.mo10115g());
        i.mo12527h(this.f12684d);
        i.mo12529o(this.f12683c);
        i.mo12525e(this.f12685e);
        i.mo12528n(new m51(this.f12686f, this.f12688h));
        i.mo12526f(new n31(this.f12687g));
        a71 d = i.mo12524W().mo8573d();
        return d.mo8237h(d.mo8238i());
    }
}
