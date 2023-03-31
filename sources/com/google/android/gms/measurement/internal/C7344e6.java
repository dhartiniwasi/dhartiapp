package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7016ie;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7344e6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C13020b f32451a;

    /* renamed from: b */
    final /* synthetic */ int f32452b;

    /* renamed from: c */
    final /* synthetic */ long f32453c;

    /* renamed from: d */
    final /* synthetic */ boolean f32454d;

    /* renamed from: e */
    final /* synthetic */ C13020b f32455e;

    /* renamed from: f */
    final /* synthetic */ C7388i6 f32456f;

    C7344e6(C7388i6 i6Var, C13020b bVar, int i, long j, boolean z, C13020b bVar2) {
        this.f32456f = i6Var;
        this.f32451a = bVar;
        this.f32452b = i;
        this.f32453c = j;
        this.f32454d = z;
        this.f32455e = bVar2;
    }

    public final void run() {
        this.f32456f.mo24332J(this.f32451a);
        C7388i6.m41549c0(this.f32456f, this.f32451a, this.f32452b, this.f32453c, false, this.f32454d);
        C7016ie.m40214b();
        if (this.f32456f.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33067o0)) {
            C7388i6.m41548b0(this.f32456f, this.f32451a, this.f32455e);
        }
    }
}
