package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tw1 implements gw1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f18272a;

    /* renamed from: b */
    private final vc2 f18273b;

    tw1(long j, Context context, lw1 lw1, su0 su0, String str) {
        this.f18272a = j;
        lq2 w = su0.mo9730w();
        w.mo8982a(context);
        w.mo8984c(new C4571q4());
        w.mo8985i(str);
        vc2 zza = w.mo8983b().zza();
        this.f18273b = zza;
        zza.mo10854V1(new sw1(this, lw1));
    }

    /* renamed from: a */
    public final void mo10654a(C4541l4 l4Var) {
        this.f18273b.mo10860Z2(l4Var);
    }

    /* renamed from: e */
    public final void mo10655e() {
        this.f18273b.mo10876o6(C4956b.m31385o3(null));
    }

    public final void zza() {
        this.f18273b.mo10878q();
    }
}
