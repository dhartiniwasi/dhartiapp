package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class qd0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ xc0 f16343a;

    /* renamed from: b */
    final /* synthetic */ wb0 f16344b;

    qd0(vd0 vd0, xc0 xc0, wb0 wb0) {
        this.f16343a = xc0;
        this.f16344b = wb0;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            this.f16343a.mo12536l(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
