package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7276z2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Activity f32227e;

    /* renamed from: f */
    final /* synthetic */ C6885b1 f32228f;

    /* renamed from: g */
    final /* synthetic */ C6887b3 f32229g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7276z2(C6887b3 b3Var, Activity activity, C6885b1 b1Var) {
        super(b3Var.f31583a, true);
        this.f32229g = b3Var;
        this.f32227e = activity;
        this.f32228f = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32229g.f31583a.f31614i)).onActivitySaveInstanceState(C4956b.m31385o3(this.f32227e), this.f32228f, this.f32045b);
    }
}
