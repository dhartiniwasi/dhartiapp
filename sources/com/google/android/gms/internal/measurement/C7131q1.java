package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7131q1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f31961e;

    /* renamed from: f */
    final /* synthetic */ String f31962f;

    /* renamed from: g */
    final /* synthetic */ Bundle f31963g;

    /* renamed from: h */
    final /* synthetic */ C6904c3 f31964h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7131q1(C6904c3 c3Var, String str, String str2, Bundle bundle) {
        super(c3Var, true);
        this.f31964h = c3Var;
        this.f31961e = str;
        this.f31962f = str2;
        this.f31963g = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f31964h.f31614i)).clearConditionalUserProperty(this.f31961e, this.f31962f, this.f31963g);
    }
}
