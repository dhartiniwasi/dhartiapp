package com.google.android.gms.internal.ads;

import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pv2 {

    /* renamed from: a */
    private final long f16054a;

    /* renamed from: b */
    private final ov2 f16055b = new ov2();

    /* renamed from: c */
    private long f16056c;

    /* renamed from: d */
    private int f16057d = 0;

    /* renamed from: e */
    private int f16058e = 0;

    /* renamed from: f */
    private int f16059f = 0;

    public pv2() {
        long a = C4409t.m29310b().mo18370a();
        this.f16054a = a;
        this.f16056c = a;
    }

    /* renamed from: a */
    public final int mo13402a() {
        return this.f16057d;
    }

    /* renamed from: b */
    public final long mo13403b() {
        return this.f16054a;
    }

    /* renamed from: c */
    public final long mo13404c() {
        return this.f16056c;
    }

    /* renamed from: d */
    public final ov2 mo13405d() {
        ov2 a = this.f16055b.clone();
        ov2 ov2 = this.f16055b;
        ov2.f15374a = false;
        ov2.f15375b = 0;
        return a;
    }

    /* renamed from: e */
    public final String mo13406e() {
        return "Created: " + this.f16054a + " Last accessed: " + this.f16056c + " Accesses: " + this.f16057d + "\nEntries retrieved: Valid: " + this.f16058e + " Stale: " + this.f16059f;
    }

    /* renamed from: f */
    public final void mo13407f() {
        this.f16056c = C4409t.m29310b().mo18370a();
        this.f16057d++;
    }

    /* renamed from: g */
    public final void mo13408g() {
        this.f16059f++;
        this.f16055b.f15375b++;
    }

    /* renamed from: h */
    public final void mo13409h() {
        this.f16058e++;
        this.f16055b.f15374a = true;
    }
}
