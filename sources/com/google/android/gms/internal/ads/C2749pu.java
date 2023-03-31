package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p033d5.C4087c;

/* renamed from: com.google.android.gms.internal.ads.pu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2749pu implements C4087c.C4088a {

    /* renamed from: a */
    final /* synthetic */ C2451hu f16038a;

    /* renamed from: b */
    final /* synthetic */ in0 f16039b;

    /* renamed from: c */
    final /* synthetic */ C2823ru f16040c;

    C2749pu(C2823ru ruVar, C2451hu huVar, in0 in0) {
        this.f16040c = ruVar;
        this.f16038a = huVar;
        this.f16039b = in0;
    }

    /* renamed from: P0 */
    public final void mo8531P0(Bundle bundle) {
        synchronized (this.f16040c.f17101d) {
            C2823ru ruVar = this.f16040c;
            if (!ruVar.f17099b) {
                ruVar.f17099b = true;
                C2414gu a = this.f16040c.f17098a;
                if (a != null) {
                    lf3 G = dn0.f8325a.mo12323G(new C2637mu(this, a, this.f16038a, this.f16039b));
                    in0 in0 = this.f16039b;
                    in0.mo10135j(new C2674nu(in0, G), dn0.f8330f);
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
    }
}
