package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7440n3 {

    /* renamed from: a */
    private final String f32764a;

    /* renamed from: b */
    private final boolean f32765b;

    /* renamed from: c */
    private boolean f32766c;

    /* renamed from: d */
    private boolean f32767d;

    /* renamed from: e */
    final /* synthetic */ C7495s3 f32768e;

    public C7440n3(C7495s3 s3Var, String str, boolean z) {
        this.f32768e = s3Var;
        C4141r.m28217g(str);
        this.f32764a = str;
        this.f32765b = z;
    }

    /* renamed from: a */
    public final void mo24581a(boolean z) {
        SharedPreferences.Editor edit = this.f32768e.mo24642n().edit();
        edit.putBoolean(this.f32764a, z);
        edit.apply();
        this.f32767d = z;
    }

    /* renamed from: b */
    public final boolean mo24582b() {
        if (!this.f32766c) {
            this.f32766c = true;
            this.f32767d = this.f32768e.mo24642n().getBoolean(this.f32764a, this.f32765b);
        }
        return this.f32767d;
    }
}
