package com.google.android.gms.internal.ads;

import p033d5.C4087c;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.internal.ads.qu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2786qu implements C4087c.C4089b {

    /* renamed from: a */
    final /* synthetic */ in0 f16518a;

    /* renamed from: b */
    final /* synthetic */ C2823ru f16519b;

    C2786qu(C2823ru ruVar, in0 in0) {
        this.f16519b = ruVar;
        this.f16518a = in0;
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
        synchronized (this.f16519b.f17101d) {
            this.f16518a.mo11173e(new RuntimeException("Connection failed."));
        }
    }
}
