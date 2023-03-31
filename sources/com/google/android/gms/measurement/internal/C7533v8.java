package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p033d5.C4141r;
import p402y5.C13018a;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7533v8 implements Callable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f33133a;

    /* renamed from: b */
    final /* synthetic */ C7303a9 f33134b;

    C7533v8(C7303a9 a9Var, C7446n9 n9Var) {
        this.f33134b = a9Var;
        this.f33133a = n9Var;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C13020b V = this.f33134b.mo24111V((String) C4141r.m28221k(this.f33133a.f32787a));
        C13018a aVar = C13018a.ANALYTICS_STORAGE;
        if (V.mo38074i(aVar) && C13020b.m61314b(this.f33133a.f32784D).mo38074i(aVar)) {
            return this.f33134b.mo24108S(this.f33133a).mo24548e0();
        }
        this.f33134b.mo24135l().mo24260v().mo24208a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
