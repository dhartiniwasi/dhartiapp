package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.C6868a1;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7423l8 extends C7538w3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f32704c;

    /* renamed from: d */
    protected final C7412k8 f32705d = new C7412k8(this);

    /* renamed from: e */
    protected final C7401j8 f32706e = new C7401j8(this);

    /* renamed from: f */
    protected final C7368g8 f32707f = new C7368g8(this);

    C7423l8(C7397j4 j4Var) {
        super(j4Var);
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m41760p(C7423l8 l8Var, long j) {
        l8Var.mo24189f();
        l8Var.m41762r();
        l8Var.f32389a.mo24135l().mo24260v().mo24209b("Activity paused, time", Long.valueOf(j));
        l8Var.f32707f.mo24275a(j);
        if (l8Var.f32389a.mo24443z().mo24281D()) {
            l8Var.f32706e.mo24448b(j);
        }
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m41761q(C7423l8 l8Var, long j) {
        l8Var.mo24189f();
        l8Var.m41762r();
        l8Var.f32389a.mo24135l().mo24260v().mo24209b("Activity resumed, time", Long.valueOf(j));
        if (l8Var.f32389a.mo24443z().mo24281D() || l8Var.f32389a.mo24416F().f32960r.mo24582b()) {
            l8Var.f32706e.mo24449c(j);
        }
        l8Var.f32707f.mo24276b();
        C7412k8 k8Var = l8Var.f32705d;
        k8Var.f32673a.mo24189f();
        if (k8Var.f32673a.f32389a.mo24436n()) {
            k8Var.mo24463b(k8Var.f32673a.f32389a.mo24116a().mo18370a(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m41762r() {
        mo24189f();
        if (this.f32704c == null) {
            this.f32704c = new C6868a1(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo24349m() {
        return false;
    }
}
