package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import p033d5.C4087c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class p70 implements C4087c.C4088a {

    /* renamed from: a */
    final /* synthetic */ in0 f15714a;

    /* renamed from: b */
    final /* synthetic */ r70 f15715b;

    p70(r70 r70, in0 in0) {
        this.f15715b = r70;
        this.f15714a = in0;
    }

    /* renamed from: P0 */
    public final void mo8531P0(Bundle bundle) {
        try {
            this.f15714a.mo11172d(this.f15715b.f16857a.mo9820n0());
        } catch (DeadObjectException e) {
            this.f15714a.mo11173e(e);
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
        in0 in0 = this.f15714a;
        in0.mo11173e(new RuntimeException("onConnectionSuspended: " + i));
    }
}
