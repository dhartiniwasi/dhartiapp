package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class sd0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ dd0 f17350a;

    /* renamed from: b */
    final /* synthetic */ wb0 f17351b;

    sd0(vd0 vd0, dd0 dd0, wb0 wb0) {
        this.f17350a = dd0;
        this.f17351b = wb0;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            this.f17350a.mo8749l(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
