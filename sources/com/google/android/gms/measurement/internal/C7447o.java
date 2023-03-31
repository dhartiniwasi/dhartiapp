package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.C6868a1;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.o */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
abstract class C7447o {

    /* renamed from: d */
    private static volatile Handler f32805d;

    /* renamed from: a */
    private final C7343e5 f32806a;

    /* renamed from: b */
    private final Runnable f32807b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f32808c;

    C7447o(C7343e5 e5Var) {
        C4141r.m28221k(e5Var);
        this.f32806a = e5Var;
        this.f32807b = new C7436n(this, e5Var);
    }

    /* renamed from: f */
    private final Handler m41843f() {
        Handler handler;
        if (f32805d != null) {
            return f32805d;
        }
        synchronized (C7447o.class) {
            if (f32805d == null) {
                f32805d = new C6868a1(this.f32806a.mo24121d().getMainLooper());
            }
            handler = f32805d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24587b() {
        this.f32808c = 0;
        m41843f().removeCallbacks(this.f32807b);
    }

    /* renamed from: c */
    public abstract void mo24249c();

    /* renamed from: d */
    public final void mo24588d(long j) {
        mo24587b();
        if (j >= 0) {
            this.f32808c = this.f32806a.mo24116a().mo18370a();
            if (!m41843f().postDelayed(this.f32807b, j)) {
                this.f32806a.mo24135l().mo24256q().mo24209b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo24589e() {
        return this.f32808c != 0;
    }
}
