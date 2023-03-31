package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7508t5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f32994a;

    /* renamed from: b */
    final /* synthetic */ String f32995b;

    /* renamed from: c */
    final /* synthetic */ String f32996c;

    /* renamed from: d */
    final /* synthetic */ C7388i6 f32997d;

    C7508t5(C7388i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f32997d = i6Var;
        this.f32994a = atomicReference;
        this.f32995b = str2;
        this.f32996c = str3;
    }

    public final void run() {
        this.f32997d.f32389a.mo24421L().mo24713U(this.f32994a, (String) null, this.f32995b, this.f32996c);
    }
}
