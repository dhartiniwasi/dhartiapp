package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7453o5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f32820a;

    /* renamed from: b */
    final /* synthetic */ String f32821b;

    /* renamed from: c */
    final /* synthetic */ long f32822c;

    /* renamed from: d */
    final /* synthetic */ Bundle f32823d;

    /* renamed from: e */
    final /* synthetic */ boolean f32824e;

    /* renamed from: f */
    final /* synthetic */ boolean f32825f;

    /* renamed from: g */
    final /* synthetic */ boolean f32826g;

    /* renamed from: h */
    final /* synthetic */ String f32827h;

    /* renamed from: i */
    final /* synthetic */ C7388i6 f32828i;

    C7453o5(C7388i6 i6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f32828i = i6Var;
        this.f32820a = str;
        this.f32821b = str2;
        this.f32822c = j;
        this.f32823d = bundle;
        this.f32824e = z;
        this.f32825f = z2;
        this.f32826g = z3;
        this.f32827h = str3;
    }

    public final void run() {
        this.f32828i.mo24358w(this.f32820a, this.f32821b, this.f32822c, this.f32823d, this.f32824e, this.f32825f, this.f32826g, this.f32827h);
    }
}
