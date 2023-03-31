package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class ud0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ hd0 f18496a;

    /* renamed from: b */
    final /* synthetic */ wb0 f18497b;

    /* renamed from: c */
    final /* synthetic */ vd0 f18498c;

    ud0(vd0 vd0, hd0 hd0, wb0 wb0) {
        this.f18498c = vd0;
        this.f18496a = hd0;
        this.f18497b = wb0;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            this.f18496a.mo9471l(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
