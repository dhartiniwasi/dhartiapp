package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7484r3 {

    /* renamed from: a */
    private final String f32924a;

    /* renamed from: b */
    private boolean f32925b;

    /* renamed from: c */
    private String f32926c;

    /* renamed from: d */
    final /* synthetic */ C7495s3 f32927d;

    public C7484r3(C7495s3 s3Var, String str, String str2) {
        this.f32927d = s3Var;
        C4141r.m28217g(str);
        this.f32924a = str;
    }

    /* renamed from: a */
    public final String mo24631a() {
        if (!this.f32925b) {
            this.f32925b = true;
            this.f32926c = this.f32927d.mo24642n().getString(this.f32924a, (String) null);
        }
        return this.f32926c;
    }

    /* renamed from: b */
    public final void mo24632b(String str) {
        SharedPreferences.Editor edit = this.f32927d.mo24642n().edit();
        edit.putString(this.f32924a, str);
        edit.apply();
        this.f32926c = str;
    }
}
