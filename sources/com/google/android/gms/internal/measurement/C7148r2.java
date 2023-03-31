package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p033d5.C4141r;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7148r2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f32003e;

    /* renamed from: f */
    final /* synthetic */ String f32004f;

    /* renamed from: g */
    final /* synthetic */ Object f32005g;

    /* renamed from: h */
    final /* synthetic */ boolean f32006h;

    /* renamed from: i */
    final /* synthetic */ C6904c3 f32007i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7148r2(C6904c3 c3Var, String str, String str2, Object obj, boolean z) {
        super(c3Var, true);
        this.f32007i = c3Var;
        this.f32003e = str;
        this.f32004f = str2;
        this.f32005g = obj;
        this.f32006h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        ((C6953f1) C4141r.m28221k(this.f32007i.f31614i)).setUserProperty(this.f32003e, this.f32004f, C4956b.m31385o3(this.f32005g), this.f32006h, this.f32044a);
    }
}
