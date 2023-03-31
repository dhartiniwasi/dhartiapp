package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import p033d5.C4141r;
import p402y5.C13031i;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7473q3 {

    /* renamed from: a */
    final String f32884a;

    /* renamed from: b */
    private final String f32885b;

    /* renamed from: c */
    private final String f32886c;

    /* renamed from: d */
    private final long f32887d;

    /* renamed from: e */
    final /* synthetic */ C7495s3 f32888e;

    /* synthetic */ C7473q3(C7495s3 s3Var, String str, long j, C13031i iVar) {
        this.f32888e = s3Var;
        C4141r.m28217g("health_monitor");
        C4141r.m28211a(j > 0);
        this.f32884a = "health_monitor:start";
        this.f32885b = "health_monitor:count";
        this.f32886c = "health_monitor:value";
        this.f32887d = j;
    }

    /* renamed from: c */
    private final long m41871c() {
        return this.f32888e.mo24642n().getLong(this.f32884a, 0);
    }

    /* renamed from: d */
    private final void m41872d() {
        this.f32888e.mo24189f();
        long a = this.f32888e.f32389a.mo24116a().mo18370a();
        SharedPreferences.Editor edit = this.f32888e.mo24642n().edit();
        edit.remove(this.f32885b);
        edit.remove(this.f32886c);
        edit.putLong(this.f32884a, a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair mo24617a() {
        long j;
        this.f32888e.mo24189f();
        this.f32888e.mo24189f();
        long c = m41871c();
        if (c == 0) {
            m41872d();
            j = 0;
        } else {
            j = Math.abs(c - this.f32888e.f32389a.mo24116a().mo18370a());
        }
        long j2 = this.f32887d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m41872d();
            return null;
        }
        String string = this.f32888e.mo24642n().getString(this.f32886c, (String) null);
        long j3 = this.f32888e.mo24642n().getLong(this.f32885b, 0);
        m41872d();
        if (string == null || j3 <= 0) {
            return C7495s3.f32944y;
        }
        return new Pair(string, Long.valueOf(j3));
    }

    /* renamed from: b */
    public final void mo24618b(String str, long j) {
        this.f32888e.mo24189f();
        if (m41871c() == 0) {
            m41872d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f32888e.mo24642n().getLong(this.f32885b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f32888e.mo24642n().edit();
            edit.putString(this.f32886c, str);
            edit.putLong(this.f32885b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f32888e.f32389a.mo24423N().mo24403u().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f32888e.mo24642n().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f32886c, str);
        }
        edit2.putLong(this.f32885b, j3);
        edit2.apply();
    }
}
