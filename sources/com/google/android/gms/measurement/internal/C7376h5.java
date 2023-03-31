package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C7376h5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C7388i6 f32541a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f32542b;

    /* renamed from: c */
    public final /* synthetic */ long f32543c;

    public /* synthetic */ C7376h5(C7388i6 i6Var, Bundle bundle, long j) {
        this.f32541a = i6Var;
        this.f32542b = bundle;
        this.f32543c = j;
    }

    public final void run() {
        C7388i6 i6Var = this.f32541a;
        Bundle bundle = this.f32542b;
        long j = this.f32543c;
        if (TextUtils.isEmpty(i6Var.f32389a.mo24412B().mo24737t())) {
            i6Var.mo24328F(bundle, 0, j);
        } else {
            i6Var.f32389a.mo24135l().mo24262x().mo24208a("Using developer consent only; google app id found");
        }
    }
}
