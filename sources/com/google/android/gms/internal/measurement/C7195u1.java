package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7195u1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Boolean f32126e;

    /* renamed from: f */
    final /* synthetic */ C6904c3 f32127f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7195u1(C6904c3 c3Var, Boolean bool) {
        super(c3Var, true);
        this.f32127f = c3Var;
        this.f32126e = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        if (this.f32126e != null) {
            ((C6953f1) C4141r.m28221k(this.f32127f.f31614i)).setMeasurementEnabled(this.f32126e.booleanValue(), this.f32044a);
        } else {
            ((C6953f1) C4141r.m28221k(this.f32127f.f31614i)).clearMeasurementEnabled(this.f32044a);
        }
    }
}
