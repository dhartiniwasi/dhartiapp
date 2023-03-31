package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7004i2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f31745e;

    /* renamed from: f */
    final /* synthetic */ String f31746f;

    /* renamed from: g */
    final /* synthetic */ boolean f31747g;

    /* renamed from: h */
    final /* synthetic */ C6885b1 f31748h;

    /* renamed from: i */
    final /* synthetic */ C6904c3 f31749i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7004i2(C6904c3 c3Var, String str, String str2, boolean z, C6885b1 b1Var) {
        super(c3Var, true);
        this.f31749i = c3Var;
        this.f31745e = str;
        this.f31746f = str2;
        this.f31747g = z;
        this.f31748h = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f31749i.f31614i)).getUserProperties(this.f31745e, this.f31746f, this.f31747g, this.f31748h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23306b() {
        this.f31748h.mo23037L2((Bundle) null);
    }
}
