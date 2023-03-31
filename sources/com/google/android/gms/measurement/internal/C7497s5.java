package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7497s5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f32969a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32970b;

    C7497s5(C7388i6 i6Var, Bundle bundle) {
        this.f32970b = i6Var;
        this.f32969a = bundle;
    }

    public final void run() {
        C7388i6 i6Var = this.f32970b;
        Bundle bundle = this.f32969a;
        i6Var.mo24189f();
        i6Var.mo24741g();
        C4141r.m28221k(bundle);
        String g = C4141r.m28217g(bundle.getString(MediationMetaData.KEY_NAME));
        if (!i6Var.f32389a.mo24436n()) {
            i6Var.f32389a.mo24135l().mo24260v().mo24208a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C7336d9 d9Var = new C7336d9(g, 0, (Object) null, "");
        try {
            C7326d dVar = r4;
            C7326d dVar2 = new C7326d(bundle.getString("app_id"), "", d9Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (C7524v) null, bundle.getLong("trigger_timeout"), (C7524v) null, bundle.getLong("time_to_live"), i6Var.f32389a.mo24423N().mo24407w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            i6Var.f32389a.mo24421L().mo24720r(dVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
