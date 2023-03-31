package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C6988h2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ C6885b1 f31716e;

    /* renamed from: f */
    final /* synthetic */ C6904c3 f31717f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6988h2(C6904c3 c3Var, C6885b1 b1Var) {
        super(c3Var, true);
        this.f31717f = c3Var;
        this.f31716e = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f31717f.f31614i)).getCurrentScreenClass(this.f31716e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23306b() {
        this.f31716e.mo23037L2((Bundle) null);
    }
}
