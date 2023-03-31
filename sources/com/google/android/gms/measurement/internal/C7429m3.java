package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.m3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7429m3 extends BroadcastReceiver {

    /* renamed from: d */
    static final String f32713d = C7429m3.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7303a9 f32714a;

    /* renamed from: b */
    private boolean f32715b;

    /* renamed from: c */
    private boolean f32716c;

    C7429m3(C7303a9 a9Var) {
        C4141r.m28221k(a9Var);
        this.f32714a = a9Var;
    }

    /* renamed from: b */
    public final void mo24509b() {
        this.f32714a.mo24123e();
        this.f32714a.mo24143s().mo24189f();
        if (!this.f32715b) {
            this.f32714a.mo24121d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f32716c = this.f32714a.mo24114Y().mo24457k();
            this.f32714a.mo24135l().mo24260v().mo24209b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f32716c));
            this.f32715b = true;
        }
    }

    /* renamed from: c */
    public final void mo24510c() {
        this.f32714a.mo24123e();
        this.f32714a.mo24143s().mo24189f();
        this.f32714a.mo24143s().mo24189f();
        if (this.f32715b) {
            this.f32714a.mo24135l().mo24260v().mo24208a("Unregistering connectivity change receiver");
            this.f32715b = false;
            this.f32716c = false;
            try {
                this.f32714a.mo24121d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f32714a.mo24135l().mo24256q().mo24209b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f32714a.mo24123e();
        String action = intent.getAction();
        this.f32714a.mo24135l().mo24260v().mo24209b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean k = this.f32714a.mo24114Y().mo24457k();
            if (this.f32716c != k) {
                this.f32716c = k;
                this.f32714a.mo24143s().mo24309z(new C7418l3(this, k));
                return;
            }
            return;
        }
        this.f32714a.mo24135l().mo24261w().mo24209b("NetworkBroadcastReceiver received unknown action", action);
    }
}
