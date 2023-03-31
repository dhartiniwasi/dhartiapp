package com.google.android.gms.internal.ads;

import p033d5.C4087c;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.internal.ads.bu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2228bu implements C4087c.C4089b {

    /* renamed from: a */
    final /* synthetic */ C2265cu f7458a;

    C2228bu(C2265cu cuVar) {
        this.f7458a = cuVar;
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
        synchronized (this.f7458a.f7946c) {
            this.f7458a.f7949f = null;
            C2265cu cuVar = this.f7458a;
            if (cuVar.f7947d != null) {
                cuVar.f7947d = null;
            }
            this.f7458a.f7946c.notifyAll();
        }
    }
}
