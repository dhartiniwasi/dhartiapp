package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.y1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7259y1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ long f32194e;

    /* renamed from: f */
    final /* synthetic */ C6904c3 f32195f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7259y1(C6904c3 c3Var, long j) {
        super(c3Var, true);
        this.f32195f = c3Var;
        this.f32194e = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32195f.f31614i)).setSessionTimeoutDuration(this.f32194e);
    }
}
