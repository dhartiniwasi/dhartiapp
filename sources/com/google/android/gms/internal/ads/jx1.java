package com.google.android.gms.internal.ads;

import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jx1 extends v70 {

    /* renamed from: a */
    final /* synthetic */ Object f11832a;

    /* renamed from: b */
    final /* synthetic */ String f11833b;

    /* renamed from: c */
    final /* synthetic */ long f11834c;

    /* renamed from: d */
    final /* synthetic */ ny2 f11835d;

    /* renamed from: e */
    final /* synthetic */ in0 f11836e;

    /* renamed from: f */
    final /* synthetic */ kx1 f11837f;

    jx1(kx1 kx1, Object obj, String str, long j, ny2 ny2, in0 in0) {
        this.f11837f = kx1;
        this.f11832a = obj;
        this.f11833b = str;
        this.f11834c = j;
        this.f11835d = ny2;
        this.f11836e = in0;
    }

    /* renamed from: T */
    public final void mo11533T() {
        synchronized (this.f11832a) {
            this.f11837f.m15660v(this.f11833b, true, "", (int) (C4409t.m29310b().mo18371b() - this.f11834c));
            this.f11837f.f12334l.mo13399d(this.f11833b);
            this.f11837f.f12337o.mo14302z(this.f11833b);
            az2 e = this.f11837f.f12338p;
            ny2 ny2 = this.f11835d;
            ny2.mo11826G(true);
            e.mo8629b(ny2.mo11831W());
            this.f11836e.mo11172d(Boolean.TRUE);
        }
    }

    /* renamed from: k */
    public final void mo11534k(String str) {
        synchronized (this.f11832a) {
            this.f11837f.m15660v(this.f11833b, false, str, (int) (C4409t.m29310b().mo18371b() - this.f11834c));
            this.f11837f.f12334l.mo13397b(this.f11833b, "error");
            this.f11837f.f12337o.mo14300k(this.f11833b, "error");
            az2 e = this.f11837f.f12338p;
            ny2 ny2 = this.f11835d;
            ny2.mo11826G(false);
            e.mo8629b(ny2.mo11831W());
            this.f11836e.mo11172d(Boolean.FALSE);
        }
    }
}
