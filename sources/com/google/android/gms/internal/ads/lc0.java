package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class lc0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ wb0 f12731a;

    /* renamed from: b */
    final /* synthetic */ pc0 f12732b;

    lc0(pc0 pc0, wb0 wb0) {
        this.f12732b = pc0;
        this.f12731a = wb0;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            String canonicalName = this.f12732b.f15789a.getClass().getCanonicalName();
            int a = aVar.mo21633a();
            String c = aVar.mo21635c();
            String b = aVar.mo21634b();
            pm0.m18662b(canonicalName + "failed to loaded mediation ad: ErrorCode = " + a + ". ErrorMessage = " + c + ". ErrorDomain = " + b);
            this.f12731a.mo11366u3(aVar.mo21636d());
            this.f12731a.mo11352A1(aVar.mo21633a(), aVar.mo21635c());
            this.f12731a.mo11362f0(aVar.mo21633a());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
