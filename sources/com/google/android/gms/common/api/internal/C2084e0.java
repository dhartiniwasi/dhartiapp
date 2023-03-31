package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import p017b5.C1822t;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2084e0 extends C1822t {

    /* renamed from: a */
    private final WeakReference<C2087f0> f6149a;

    C2084e0(C2087f0 f0Var) {
        this.f6149a = new WeakReference<>(f0Var);
    }

    /* renamed from: a */
    public final void mo6993a() {
        C2087f0 f0Var = (C2087f0) this.f6149a.get();
        if (f0Var != null) {
            C2087f0.m9259p(f0Var);
        }
    }
}
