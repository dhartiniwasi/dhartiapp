package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7441n4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f32769a;

    /* renamed from: b */
    final /* synthetic */ String f32770b;

    /* renamed from: c */
    final /* synthetic */ String f32771c;

    /* renamed from: d */
    final /* synthetic */ C7310b5 f32772d;

    C7441n4(C7310b5 b5Var, String str, String str2, String str3) {
        this.f32772d = b5Var;
        this.f32769a = str;
        this.f32770b = str2;
        this.f32771c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.f32772d.f32369a.mo24119c();
        return this.f32772d.f32369a.mo24112W().mo24485d0(this.f32769a, this.f32770b, this.f32771c);
    }
}
