package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class a63 extends r63 {

    /* renamed from: b */
    final /* synthetic */ u53 f6433b;

    /* renamed from: c */
    final /* synthetic */ i63 f6434c;

    /* renamed from: d */
    final /* synthetic */ C9977j f6435d;

    /* renamed from: e */
    final /* synthetic */ d63 f6436e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a63(d63 d63, C9977j jVar, u53 u53, i63 i63, C9977j jVar2) {
        super(jVar);
        this.f6436e = d63;
        this.f6433b = u53;
        this.f6434c = i63;
        this.f6435d = jVar2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.n63] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8223a() {
        try {
            ? e = this.f6436e.f8107a.mo8687e();
            u53 u53 = this.f6433b;
            String b = this.f6436e.f8108b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", u53.mo11324b());
            bundle.putString("callerPackage", b);
            bundle.putString("appId", u53.mo11323a());
            e.mo11903j2(bundle, new c63(this.f6436e, this.f6434c));
        } catch (RemoteException e2) {
            d63.f8105c.mo13478c(e2, "dismiss overlay display from: %s", this.f6436e.f8108b);
            this.f6435d.mo32545d(new RuntimeException(e2));
        }
    }
}
