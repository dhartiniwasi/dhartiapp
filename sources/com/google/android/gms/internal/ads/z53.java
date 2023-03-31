package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class z53 extends r63 {

    /* renamed from: b */
    final /* synthetic */ f63 f20939b;

    /* renamed from: c */
    final /* synthetic */ i63 f20940c;

    /* renamed from: d */
    final /* synthetic */ C9977j f20941d;

    /* renamed from: e */
    final /* synthetic */ d63 f20942e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z53(d63 d63, C9977j jVar, f63 f63, i63 i63, C9977j jVar2) {
        super(jVar);
        this.f20942e = d63;
        this.f20939b = f63;
        this.f20940c = i63;
        this.f20941d = jVar2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.n63] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8223a() {
        try {
            ? e = this.f20942e.f8107a.mo8687e();
            d63 d63 = this.f20942e;
            String b = d63.f8108b;
            f63 f63 = this.f20939b;
            String b2 = d63.f8108b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", f63.mo10079e());
            bundle.putString("adFieldEnifd", f63.mo10080f());
            bundle.putInt("layoutGravity", f63.mo10077c());
            bundle.putFloat("layoutVerticalMargin", f63.mo10075a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", f63.mo10078d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", b2);
            if (f63.mo10081g() != null) {
                bundle.putString("appId", f63.mo10081g());
            }
            e.mo11904p3(b, bundle, new c63(this.f20942e, this.f20940c));
        } catch (RemoteException e2) {
            d63.f8105c.mo13478c(e2, "show overlay display from: %s", this.f20942e.f8108b);
            this.f20941d.mo32545d(new RuntimeException(e2));
        }
    }
}
