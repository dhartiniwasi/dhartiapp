package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7020j2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f31778e;

    /* renamed from: f */
    final /* synthetic */ Object f31779f;

    /* renamed from: g */
    final /* synthetic */ C6904c3 f31780g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7020j2(C6904c3 c3Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(c3Var, false);
        this.f31780g = c3Var;
        this.f31778e = str;
        this.f31779f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f31780g.f31614i)).logHealthData(5, this.f31778e, C4956b.m31385o3(this.f31779f), C4956b.m31385o3(null), C4956b.m31385o3(null));
    }
}
