package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import p198c6.C6755d;
import p198c6.C6763l;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2133x extends C6755d {

    /* renamed from: a */
    private final WeakReference<C2071a0> f6299a;

    C2133x(C2071a0 a0Var) {
        this.f6299a = new WeakReference<>(a0Var);
    }

    /* renamed from: q4 */
    public final void mo6957q4(C6763l lVar) {
        C2071a0 a0Var = (C2071a0) this.f6299a.get();
        if (a0Var != null) {
            a0Var.f6089a.mo8078m(new C2131w(this, a0Var, a0Var, lVar));
        }
    }
}
