package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class b63 extends r63 {

    /* renamed from: b */
    final /* synthetic */ k63 f7109b;

    /* renamed from: c */
    final /* synthetic */ int f7110c;

    /* renamed from: d */
    final /* synthetic */ i63 f7111d;

    /* renamed from: e */
    final /* synthetic */ C9977j f7112e;

    /* renamed from: f */
    final /* synthetic */ d63 f7113f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b63(d63 d63, C9977j jVar, k63 k63, int i, i63 i63, C9977j jVar2) {
        super(jVar);
        this.f7113f = d63;
        this.f7109b = k63;
        this.f7110c = i;
        this.f7111d = i63;
        this.f7112e = jVar2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.n63] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8223a() {
        try {
            ? e = this.f7113f.f8107a.mo8687e();
            k63 k63 = this.f7109b;
            String b = this.f7113f.f8108b;
            int i = this.f7110c;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", k63.mo11582b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", k63.mo11581a());
            e.mo11905q6(bundle, new c63(this.f7113f, this.f7111d));
        } catch (RemoteException e2) {
            d63.f8105c.mo13478c(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f7110c), this.f7113f.f8108b);
            this.f7112e.mo32545d(new RuntimeException(e2));
        }
    }
}
