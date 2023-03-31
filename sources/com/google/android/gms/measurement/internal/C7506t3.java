package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7178t0;
import p061h5.C4626a;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7506t3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7178t0 f32989a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnection f32990b;

    /* renamed from: c */
    final /* synthetic */ C7517u3 f32991c;

    C7506t3(C7517u3 u3Var, C7178t0 t0Var, ServiceConnection serviceConnection) {
        this.f32991c = u3Var;
        this.f32989a = t0Var;
        this.f32990b = serviceConnection;
    }

    public final void run() {
        C7517u3 u3Var = this.f32991c;
        C7528v3 v3Var = u3Var.f33088b;
        String a = u3Var.f33087a;
        C7178t0 t0Var = this.f32989a;
        ServiceConnection serviceConnection = this.f32990b;
        v3Var.f33107a.mo24143s().mo24189f();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", a);
        Bundle bundle2 = null;
        try {
            Bundle r0 = t0Var.mo23806r0(bundle);
            if (r0 == null) {
                v3Var.f33107a.mo24135l().mo24256q().mo24208a("Install Referrer Service returned a null response");
            } else {
                bundle2 = r0;
            }
        } catch (Exception e) {
            v3Var.f33107a.mo24135l().mo24256q().mo24209b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        v3Var.f33107a.mo24143s().mo24189f();
        C7397j4.m41656t();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                v3Var.f33107a.mo24135l().mo24261w().mo24208a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    v3Var.f33107a.mo24135l().mo24256q().mo24208a("No referrer defined in Install Referrer response");
                } else {
                    v3Var.f33107a.mo24135l().mo24260v().mo24209b("InstallReferrer API result", string);
                    Bundle t0 = v3Var.f33107a.mo24423N().mo24402t0(Uri.parse("?".concat(string)));
                    if (t0 == null) {
                        v3Var.f33107a.mo24135l().mo24256q().mo24208a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                v3Var.f33107a.mo24135l().mo24256q().mo24208a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == v3Var.f33107a.mo24416F().f32948f.mo24604a()) {
                            v3Var.f33107a.mo24135l().mo24260v().mo24208a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (v3Var.f33107a.mo24436n()) {
                            v3Var.f33107a.mo24416F().f32948f.mo24605b(j);
                            v3Var.f33107a.mo24135l().mo24260v().mo24209b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            v3Var.f33107a.mo24418I().mo24355t("auto", "_cmp", t0, a);
                        }
                    }
                }
            }
        }
        C4626a.m30143b().mo18192c(v3Var.f33107a.mo24121d(), serviceConnection);
    }
}
