package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class rd0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ ad0 f16916a;

    /* renamed from: b */
    final /* synthetic */ wb0 f16917b;

    /* renamed from: c */
    final /* synthetic */ vd0 f16918c;

    rd0(vd0 vd0, ad0 ad0, wb0 wb0) {
        this.f16918c = vd0;
        this.f16916a = ad0;
        this.f16917b = wb0;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            this.f16916a.mo8308l(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
