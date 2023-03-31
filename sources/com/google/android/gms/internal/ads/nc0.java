package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class nc0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ wb0 f13941a;

    /* renamed from: b */
    final /* synthetic */ pc0 f13942b;

    nc0(pc0 pc0, wb0 wb0) {
        this.f13942b = pc0;
        this.f13941a = wb0;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            String canonicalName = this.f13942b.f15789a.getClass().getCanonicalName();
            int a = aVar.mo21633a();
            String c = aVar.mo21635c();
            String b = aVar.mo21634b();
            pm0.m18662b(canonicalName + "failed to load mediation ad: ErrorCode = " + a + ". ErrorMessage = " + c + ". ErrorDomain = " + b);
            this.f13941a.mo11366u3(aVar.mo21636d());
            this.f13941a.mo11352A1(aVar.mo21633a(), aVar.mo21635c());
            this.f13941a.mo11362f0(aVar.mo21633a());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
