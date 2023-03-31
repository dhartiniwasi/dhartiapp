package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7211v1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Bundle f32144e;

    /* renamed from: f */
    final /* synthetic */ C6904c3 f32145f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7211v1(C6904c3 c3Var, Bundle bundle) {
        super(c3Var, true);
        this.f32145f = c3Var;
        this.f32144e = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32145f.f31614i)).setConsent(this.f32144e, this.f32044a);
    }
}
