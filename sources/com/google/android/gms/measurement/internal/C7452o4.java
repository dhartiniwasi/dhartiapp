package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7452o4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f32816a;

    /* renamed from: b */
    final /* synthetic */ String f32817b;

    /* renamed from: c */
    final /* synthetic */ String f32818c;

    /* renamed from: d */
    final /* synthetic */ C7310b5 f32819d;

    C7452o4(C7310b5 b5Var, String str, String str2, String str3) {
        this.f32819d = b5Var;
        this.f32816a = str;
        this.f32817b = str2;
        this.f32818c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.f32819d.f32369a.mo24119c();
        return this.f32819d.f32369a.mo24112W().mo24485d0(this.f32816a, this.f32817b, this.f32818c);
    }
}
