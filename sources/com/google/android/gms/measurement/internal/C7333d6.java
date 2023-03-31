package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7016ie;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7333d6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C13020b f32426a;

    /* renamed from: b */
    final /* synthetic */ long f32427b;

    /* renamed from: c */
    final /* synthetic */ int f32428c;

    /* renamed from: d */
    final /* synthetic */ long f32429d;

    /* renamed from: e */
    final /* synthetic */ boolean f32430e;

    /* renamed from: f */
    final /* synthetic */ C13020b f32431f;

    /* renamed from: g */
    final /* synthetic */ C7388i6 f32432g;

    C7333d6(C7388i6 i6Var, C13020b bVar, long j, int i, long j2, boolean z, C13020b bVar2) {
        this.f32432g = i6Var;
        this.f32426a = bVar;
        this.f32427b = j;
        this.f32428c = i;
        this.f32429d = j2;
        this.f32430e = z;
        this.f32431f = bVar2;
    }

    public final void run() {
        this.f32432g.mo24332J(this.f32426a);
        this.f32432g.mo24361z(this.f32427b, false);
        C7388i6.m41549c0(this.f32432g, this.f32426a, this.f32428c, this.f32429d, true, this.f32430e);
        C7016ie.m40214b();
        if (this.f32432g.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33067o0)) {
            C7388i6.m41548b0(this.f32432g, this.f32426a, this.f32431f);
        }
    }
}
