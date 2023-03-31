package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7462p3 {

    /* renamed from: a */
    private final String f32852a;

    /* renamed from: b */
    private final long f32853b;

    /* renamed from: c */
    private boolean f32854c;

    /* renamed from: d */
    private long f32855d;

    /* renamed from: e */
    final /* synthetic */ C7495s3 f32856e;

    public C7462p3(C7495s3 s3Var, String str, long j) {
        this.f32856e = s3Var;
        C4141r.m28217g(str);
        this.f32852a = str;
        this.f32853b = j;
    }

    /* renamed from: a */
    public final long mo24604a() {
        if (!this.f32854c) {
            this.f32854c = true;
            this.f32855d = this.f32856e.mo24642n().getLong(this.f32852a, this.f32853b);
        }
        return this.f32855d;
    }

    /* renamed from: b */
    public final void mo24605b(long j) {
        SharedPreferences.Editor edit = this.f32856e.mo24642n().edit();
        edit.putLong(this.f32852a, j);
        edit.apply();
        this.f32855d = j;
    }
}
