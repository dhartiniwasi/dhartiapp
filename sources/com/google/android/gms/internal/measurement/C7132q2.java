package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7132q2 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ Long f31965e;

    /* renamed from: f */
    final /* synthetic */ String f31966f;

    /* renamed from: g */
    final /* synthetic */ String f31967g;

    /* renamed from: h */
    final /* synthetic */ Bundle f31968h;

    /* renamed from: i */
    final /* synthetic */ boolean f31969i;

    /* renamed from: r */
    final /* synthetic */ boolean f31970r;

    /* renamed from: s */
    final /* synthetic */ C6904c3 f31971s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7132q2(C6904c3 c3Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(c3Var, true);
        this.f31971s = c3Var;
        this.f31965e = l;
        this.f31966f = str;
        this.f31967g = str2;
        this.f31968h = bundle;
        this.f31969i = z;
        this.f31970r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22992a() throws RemoteException {
        long j;
        Long l = this.f31965e;
        if (l == null) {
            j = this.f32044a;
        } else {
            j = l.longValue();
        }
        ((C6953f1) C4141r.m28221k(this.f31971s.f31614i)).logEvent(this.f31966f, this.f31967g, this.f31968h, this.f31969i, this.f31970r, j);
    }
}
