package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7147r1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f31999e;

    /* renamed from: f */
    final /* synthetic */ String f32000f;

    /* renamed from: g */
    final /* synthetic */ C6885b1 f32001g;

    /* renamed from: h */
    final /* synthetic */ C6904c3 f32002h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7147r1(C6904c3 c3Var, String str, String str2, C6885b1 b1Var) {
        super(c3Var, true);
        this.f32002h = c3Var;
        this.f31999e = str;
        this.f32000f = str2;
        this.f32001g = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32002h.f31614i)).getConditionalUserProperties(this.f31999e, this.f32000f, this.f32001g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23306b() {
        this.f32001g.mo23037L2((Bundle) null);
    }
}
