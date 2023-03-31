package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import p033d5.C4087c;

/* renamed from: com.google.android.gms.internal.ads.au */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2191au implements C4087c.C4088a {

    /* renamed from: a */
    final /* synthetic */ C2265cu f6772a;

    C2191au(C2265cu cuVar) {
        this.f6772a = cuVar;
    }

    /* renamed from: P0 */
    public final void mo8531P0(Bundle bundle) {
        synchronized (this.f6772a.f7946c) {
            try {
                C2265cu cuVar = this.f6772a;
                if (cuVar.f7947d != null) {
                    cuVar.f7949f = cuVar.f7947d.mo10645o0();
                }
            } catch (DeadObjectException e) {
                pm0.m18665e("Unable to obtain a cache service instance.", e);
                C2265cu.m11188h(this.f6772a);
            }
            this.f6772a.f7946c.notifyAll();
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
        synchronized (this.f6772a.f7946c) {
            this.f6772a.f7949f = null;
            this.f6772a.f7946c.notifyAll();
        }
    }
}
