package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7179t1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Activity f32101e;

    /* renamed from: f */
    final /* synthetic */ String f32102f;

    /* renamed from: g */
    final /* synthetic */ String f32103g;

    /* renamed from: h */
    final /* synthetic */ C6904c3 f32104h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7179t1(C6904c3 c3Var, Activity activity, String str, String str2) {
        super(c3Var, true);
        this.f32104h = c3Var;
        this.f32101e = activity;
        this.f32102f = str;
        this.f32103g = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32104h.f31614i)).setCurrentScreen(C4956b.m31385o3(this.f32101e), this.f32102f, this.f32103g, this.f32044a);
    }
}
