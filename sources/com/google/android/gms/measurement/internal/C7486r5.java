package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7486r5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f32930a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32931b;

    C7486r5(C7388i6 i6Var, Bundle bundle) {
        this.f32931b = i6Var;
        this.f32930a = bundle;
    }

    public final void run() {
        C7388i6 i6Var = this.f32931b;
        Bundle bundle = this.f32930a;
        i6Var.mo24189f();
        i6Var.mo24741g();
        C4141r.m28221k(bundle);
        String string = bundle.getString(MediationMetaData.KEY_NAME);
        String string2 = bundle.getString("origin");
        C4141r.m28217g(string);
        C4141r.m28217g(string2);
        C4141r.m28221k(bundle.get("value"));
        if (!i6Var.f32389a.mo24436n()) {
            i6Var.f32389a.mo24135l().mo24260v().mo24208a("Conditional property not set since app measurement is disabled");
            return;
        }
        C7336d9 d9Var = new C7336d9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C7524v w0 = i6Var.f32389a.mo24423N().mo24407w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            C7524v w02 = i6Var.f32389a.mo24423N().mo24407w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            C7524v w03 = i6Var.f32389a.mo24423N().mo24407w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            i6Var.f32389a.mo24421L().mo24720r(new C7326d(bundle.getString("app_id"), string2, d9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
