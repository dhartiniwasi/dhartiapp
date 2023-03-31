package com.google.android.gms.measurement.internal;

import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7480r {

    /* renamed from: a */
    final String f32911a;

    /* renamed from: b */
    final String f32912b;

    /* renamed from: c */
    final long f32913c;

    /* renamed from: d */
    final long f32914d;

    /* renamed from: e */
    final long f32915e;

    /* renamed from: f */
    final long f32916f;

    /* renamed from: g */
    final long f32917g;

    /* renamed from: h */
    final Long f32918h;

    /* renamed from: i */
    final Long f32919i;

    /* renamed from: j */
    final Long f32920j;

    /* renamed from: k */
    final Boolean f32921k;

    C7480r(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        boolean z = true;
        C4141r.m28211a(j6 >= 0);
        C4141r.m28211a(j7 >= 0);
        C4141r.m28211a(j8 >= 0);
        C4141r.m28211a(j9 < 0 ? false : z);
        this.f32911a = str;
        this.f32912b = str2;
        this.f32913c = j6;
        this.f32914d = j7;
        this.f32915e = j8;
        this.f32916f = j4;
        this.f32917g = j9;
        this.f32918h = l;
        this.f32919i = l2;
        this.f32920j = l3;
        this.f32921k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C7480r mo24628a(Long l, Long l2, Boolean bool) {
        return new C7480r(this.f32911a, this.f32912b, this.f32913c, this.f32914d, this.f32915e, this.f32916f, this.f32917g, this.f32918h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C7480r mo24629b(long j, long j2) {
        return new C7480r(this.f32911a, this.f32912b, this.f32913c, this.f32914d, this.f32915e, this.f32916f, j, Long.valueOf(j2), this.f32919i, this.f32920j, this.f32921k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C7480r mo24630c(long j) {
        return new C7480r(this.f32911a, this.f32912b, this.f32913c, this.f32914d, this.f32915e, j, this.f32917g, this.f32918h, this.f32919i, this.f32920j, this.f32921k);
    }
}
