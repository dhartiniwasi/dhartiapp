package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C7016ie;
import com.google.android.gms.internal.measurement.C7286zc;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7412k8 {

    /* renamed from: a */
    final /* synthetic */ C7423l8 f32673a;

    C7412k8(C7423l8 l8Var) {
        this.f32673a = l8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24462a() {
        this.f32673a.mo24189f();
        if (this.f32673a.f32389a.mo24416F().mo24649v(this.f32673a.f32389a.mo24116a().mo18370a())) {
            this.f32673a.f32389a.mo24416F().f32954l.mo24581a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f32673a.f32389a.mo24135l().mo24260v().mo24208a("Detected application was in foreground");
                mo24464c(this.f32673a.f32389a.mo24116a().mo18370a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24463b(long j, boolean z) {
        this.f32673a.mo24189f();
        this.f32673a.m41762r();
        if (this.f32673a.f32389a.mo24416F().mo24649v(j)) {
            this.f32673a.f32389a.mo24416F().f32954l.mo24581a(true);
            C7016ie.m40214b();
            if (this.f32673a.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33067o0)) {
                this.f32673a.f32389a.mo24412B().mo24739v();
            }
        }
        this.f32673a.f32389a.mo24416F().f32957o.mo24605b(j);
        if (this.f32673a.f32389a.mo24416F().f32954l.mo24582b()) {
            mo24464c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24464c(long j, boolean z) {
        this.f32673a.mo24189f();
        if (this.f32673a.f32389a.mo24436n()) {
            this.f32673a.f32389a.mo24416F().f32957o.mo24605b(j);
            this.f32673a.f32389a.mo24135l().mo24260v().mo24209b("Session started, time", Long.valueOf(this.f32673a.f32389a.mo24116a().mo18371b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f32673a.f32389a.mo24418I().mo24335M("auto", "_sid", valueOf, j);
            this.f32673a.f32389a.mo24416F().f32958p.mo24605b(valueOf.longValue());
            this.f32673a.f32389a.mo24416F().f32954l.mo24581a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f32673a.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33041b0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f32673a.f32389a.mo24418I().mo24357v("auto", "_s", j, bundle);
            C7286zc.m41210b();
            if (this.f32673a.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33047e0)) {
                String a = this.f32673a.f32389a.mo24416F().f32963u.mo24631a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f32673a.f32389a.mo24418I().mo24357v("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
