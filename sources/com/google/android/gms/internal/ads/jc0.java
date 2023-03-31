package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p087l4.C4929a;
import p087l4.C4932d;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class jc0 implements C4932d {

    /* renamed from: a */
    final /* synthetic */ wb0 f11312a;

    /* renamed from: b */
    final /* synthetic */ C4929a f11313b;

    /* renamed from: c */
    final /* synthetic */ pc0 f11314c;

    jc0(pc0 pc0, wb0 wb0, C4929a aVar) {
        this.f11314c = pc0;
        this.f11312a = wb0;
        this.f11313b = aVar;
    }

    /* renamed from: a */
    public final void mo11381a(C6321a aVar) {
        try {
            String canonicalName = this.f11313b.getClass().getCanonicalName();
            int a = aVar.mo21633a();
            String c = aVar.mo21635c();
            String b = aVar.mo21634b();
            pm0.m18662b(canonicalName + "failed to load mediation ad: ErrorCode = " + a + ". ErrorMessage = " + c + ". ErrorDomain = " + b);
            this.f11312a.mo11366u3(aVar.mo21636d());
            this.f11312a.mo11352A1(aVar.mo21633a(), aVar.mo21635c());
            this.f11312a.mo11362f0(aVar.mo21633a());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
