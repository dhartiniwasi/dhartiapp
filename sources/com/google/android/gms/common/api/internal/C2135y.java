package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import p017b5.C1809m;
import p033d5.C4095d;
import p033d5.C4141r;
import p180z4.C6362b;
import p189b6.C6611f;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2135y implements GoogleApiClient.C2049b, GoogleApiClient.C2050c {

    /* renamed from: a */
    final /* synthetic */ C2071a0 f6301a;

    /* synthetic */ C2135y(C2071a0 a0Var, C1809m mVar) {
        this.f6301a = a0Var;
    }

    /* renamed from: B0 */
    public final void mo6954B0(C6362b bVar) {
        this.f6301a.f6090b.lock();
        try {
            if (this.f6301a.m9166q(bVar)) {
                this.f6301a.m9158i();
                this.f6301a.m9163n();
            } else {
                this.f6301a.m9161l(bVar);
            }
        } finally {
            this.f6301a.f6090b.unlock();
        }
    }

    /* renamed from: P0 */
    public final void mo6918P0(Bundle bundle) {
        C4095d dVar = (C4095d) C4141r.m28221k(this.f6301a.f6106r);
        ((C6611f) C4141r.m28221k(this.f6301a.f6099k)).mo22242q(new C2133x(this.f6301a));
    }

    /* renamed from: p */
    public final void mo6919p(int i) {
    }
}
