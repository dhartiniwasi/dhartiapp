package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7260y2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Activity f32196e;

    /* renamed from: f */
    final /* synthetic */ C6887b3 f32197f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7260y2(C6887b3 b3Var, Activity activity) {
        super(b3Var.f31583a, true);
        this.f32197f = b3Var;
        this.f32196e = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32197f.f31583a.f31614i)).onActivityStopped(C4956b.m31385o3(this.f32196e), this.f32045b);
    }
}
