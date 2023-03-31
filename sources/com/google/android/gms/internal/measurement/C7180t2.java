package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7180t2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Bundle f32105e;

    /* renamed from: f */
    final /* synthetic */ Activity f32106f;

    /* renamed from: g */
    final /* synthetic */ C6887b3 f32107g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7180t2(C6887b3 b3Var, Bundle bundle, Activity activity) {
        super(b3Var.f31583a, true);
        this.f32107g = b3Var;
        this.f32105e = bundle;
        this.f32106f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        Bundle bundle;
        if (this.f32105e != null) {
            bundle = new Bundle();
            if (this.f32105e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f32105e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C6953f1) C4141r.m28221k(this.f32107g.f31583a.f31614i)).onActivityCreated(C4956b.m31385o3(this.f32106f), bundle, this.f32045b);
    }
}
