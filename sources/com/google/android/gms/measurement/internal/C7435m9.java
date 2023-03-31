package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7035k1;
import p402y5.C13043u;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7435m9 implements C13043u {

    /* renamed from: a */
    public final C7035k1 f32757a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f32758b;

    C7435m9(AppMeasurementDynamiteService appMeasurementDynamiteService, C7035k1 k1Var) {
        this.f32758b = appMeasurementDynamiteService;
        this.f32757a = k1Var;
    }

    /* renamed from: a */
    public final void mo24579a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f32757a.mo23544b1(str, str2, bundle, j);
        } catch (RemoteException e) {
            C7397j4 j4Var = this.f32758b.f32301a;
            if (j4Var != null) {
                j4Var.mo24135l().mo24261w().mo24209b("Event listener threw exception", e);
            }
        }
    }
}
