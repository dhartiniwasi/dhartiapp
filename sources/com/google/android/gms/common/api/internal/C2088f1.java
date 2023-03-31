package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.f1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2088f1 implements GoogleApiClient.C2050c {

    /* renamed from: a */
    public final int f6175a;

    /* renamed from: b */
    public final GoogleApiClient f6176b;

    /* renamed from: c */
    public final GoogleApiClient.C2050c f6177c;

    /* renamed from: d */
    final /* synthetic */ C2092g1 f6178d;

    public C2088f1(C2092g1 g1Var, int i, GoogleApiClient googleApiClient, GoogleApiClient.C2050c cVar) {
        this.f6178d = g1Var;
        this.f6175a = i;
        this.f6176b = googleApiClient;
        this.f6177c = cVar;
    }

    /* renamed from: B0 */
    public final void mo6954B0(C6362b bVar) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(bVar)));
        this.f6178d.mo8088s(bVar, this.f6175a);
    }
}
