package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oe3 extends be3 {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ne3 f15060x;

    oe3(pa3 pa3, boolean z, Executor executor, Callable callable) {
        super(pa3, z, false);
        this.f15060x = new me3(this, callable, executor);
        mo8754R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo8752P(int i, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo8753Q() {
        ne3 ne3 = this.f15060x;
        if (ne3 != null) {
            ne3.mo12601i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo8757U(int i) {
        super.mo8757U(i);
        if (i == 1) {
            this.f15060x = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo10137u() {
        ne3 ne3 = this.f15060x;
        if (ne3 != null) {
            ne3.mo11676g();
        }
    }
}
