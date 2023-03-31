package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.a3 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C6870a3 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Activity f31542e;

    /* renamed from: f */
    final /* synthetic */ C6887b3 f31543f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6870a3(C6887b3 b3Var, Activity activity) {
        super(b3Var.f31583a, true);
        this.f31543f = b3Var;
        this.f31542e = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f31543f.f31583a.f31614i)).onActivityDestroyed(C4956b.m31385o3(this.f31542e), this.f32045b);
    }
}
