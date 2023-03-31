package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i82 extends k82 {

    /* renamed from: a */
    private final su0 f10667a;

    /* renamed from: b */
    private final dk1 f10668b;

    /* renamed from: c */
    private final f91 f10669c;

    /* renamed from: d */
    private final nf1 f10670d;

    public i82(su0 su0, dk1 dk1, f91 f91, nf1 nf1) {
        this.f10667a = su0;
        this.f10668b = dk1;
        this.f10669c = f91;
        this.f10670d = nf1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final lf3 mo11055c(et2 et2, Bundle bundle) {
        ik1 l = this.f10667a.mo9719l();
        f91 f91 = this.f10669c;
        f91.mo10114f(et2);
        f91.mo10112d(bundle);
        l.mo11144g(f91.mo10115g());
        l.mo11145k(this.f10670d);
        l.mo11142e(this.f10668b);
        l.mo11143f(new n31((ViewGroup) null));
        a71 a = l.mo11141c().mo11416a();
        return a.mo8237h(a.mo8238i());
    }
}
