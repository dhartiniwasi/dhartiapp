package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C6937e2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ C6885b1 f31664e;

    /* renamed from: f */
    final /* synthetic */ C6904c3 f31665f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6937e2(C6904c3 c3Var, C6885b1 b1Var) {
        super(c3Var, true);
        this.f31665f = c3Var;
        this.f31664e = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f31665f.f31614i)).getCachedAppInstanceId(this.f31664e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23306b() {
        this.f31664e.mo23037L2((Bundle) null);
    }
}
