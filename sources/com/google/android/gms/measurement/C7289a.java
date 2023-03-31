package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C7388i6;
import com.google.android.gms.measurement.internal.C7397j4;
import java.util.List;
import java.util.Map;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7289a extends C7292d {

    /* renamed from: a */
    private final C7397j4 f32298a;

    /* renamed from: b */
    private final C7388i6 f32299b;

    public C7289a(C7397j4 j4Var) {
        super((C7291c) null);
        C4141r.m28221k(j4Var);
        this.f32298a = j4Var;
        this.f32299b = j4Var.mo24418I();
    }

    /* renamed from: A */
    public final void mo24074A(String str) {
        this.f32298a.mo24442y().mo24089j(str, this.f32298a.mo24116a().mo18371b());
    }

    /* renamed from: D */
    public final void mo24075D(String str) {
        this.f32298a.mo24442y().mo24090k(str, this.f32298a.mo24116a().mo18371b());
    }

    /* renamed from: U */
    public final String mo24076U() {
        return this.f32299b.mo24342V();
    }

    /* renamed from: V */
    public final String mo24077V() {
        return this.f32299b.mo24343W();
    }

    /* renamed from: W */
    public final String mo24078W() {
        return this.f32299b.mo24344X();
    }

    /* renamed from: X */
    public final String mo24079X() {
        return this.f32299b.mo24342V();
    }

    /* renamed from: a */
    public final List mo24080a(String str, String str2) {
        return this.f32299b.mo24346Z(str, str2);
    }

    /* renamed from: b */
    public final Map mo24081b(String str, String str2, boolean z) {
        return this.f32299b.mo24347a0(str, str2, z);
    }

    /* renamed from: c */
    public final void mo24082c(Bundle bundle) {
        this.f32299b.mo24326D(bundle);
    }

    /* renamed from: d */
    public final long mo24083d() {
        return this.f32298a.mo24423N().mo24400r0();
    }

    /* renamed from: e */
    public final void mo24084e(String str, String str2, Bundle bundle) {
        this.f32299b.mo24353q(str, str2, bundle);
    }

    /* renamed from: f */
    public final int mo24085f(String str) {
        this.f32299b.mo24337Q(str);
        return 25;
    }

    /* renamed from: g */
    public final void mo24086g(String str, String str2, Bundle bundle) {
        this.f32298a.mo24418I().mo24350n(str, str2, bundle);
    }
}
