package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7530v5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f33111a;

    /* renamed from: b */
    final /* synthetic */ String f33112b;

    /* renamed from: c */
    final /* synthetic */ String f33113c;

    /* renamed from: d */
    final /* synthetic */ boolean f33114d;

    /* renamed from: e */
    final /* synthetic */ C7388i6 f33115e;

    C7530v5(C7388i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f33115e = i6Var;
        this.f33111a = atomicReference;
        this.f33112b = str2;
        this.f33113c = str3;
        this.f33114d = z;
    }

    public final void run() {
        this.f33115e.f32389a.mo24421L().mo24715W(this.f33111a, (String) null, this.f33112b, this.f33113c, this.f33114d);
    }
}
