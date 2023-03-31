package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7163s1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f32042e;

    /* renamed from: f */
    final /* synthetic */ C6904c3 f32043f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7163s1(C6904c3 c3Var, String str) {
        super(c3Var, true);
        this.f32043f = c3Var;
        this.f32042e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32043f.f31614i)).setUserId(this.f32042e, this.f32044a);
    }
}
