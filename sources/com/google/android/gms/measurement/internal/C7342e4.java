package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7342e4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f32449a;

    /* renamed from: b */
    final /* synthetic */ C7375h4 f32450b;

    public C7342e4(C7375h4 h4Var, String str) {
        this.f32450b = h4Var;
        C4141r.m28221k(str);
        this.f32449a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f32450b.f32389a.mo24135l().mo24256q().mo24209b(this.f32449a, th);
    }
}
