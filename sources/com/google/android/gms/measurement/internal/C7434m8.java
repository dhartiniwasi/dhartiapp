package com.google.android.gms.measurement.internal;

import p033d5.C4141r;
import p067i5.C4691e;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7434m8 {

    /* renamed from: a */
    private final C4691e f32755a;

    /* renamed from: b */
    private long f32756b;

    public C7434m8(C4691e eVar) {
        C4141r.m28221k(eVar);
        this.f32755a = eVar;
    }

    /* renamed from: a */
    public final void mo24576a() {
        this.f32756b = 0;
    }

    /* renamed from: b */
    public final void mo24577b() {
        this.f32756b = this.f32755a.mo18371b();
    }

    /* renamed from: c */
    public final boolean mo24578c(long j) {
        return this.f32756b == 0 || this.f32755a.mo18371b() - this.f32756b >= 3600000;
    }
}
