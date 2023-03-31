package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7243x1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ C6904c3 f32176e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7243x1(C6904c3 c3Var) {
        super(c3Var, true);
        this.f32176e = c3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32176e.f31614i)).resetAnalyticsData(this.f32044a);
    }
}
