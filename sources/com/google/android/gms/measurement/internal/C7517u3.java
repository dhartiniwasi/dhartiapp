package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C7162s0;
import com.google.android.gms.internal.measurement.C7178t0;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7517u3 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f33087a;

    /* renamed from: b */
    final /* synthetic */ C7528v3 f33088b;

    C7517u3(C7528v3 v3Var, String str) {
        this.f33088b = v3Var;
        this.f33087a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C7178t0 B0 = C7162s0.m40862B0(iBinder);
                if (B0 == null) {
                    this.f33088b.f33107a.mo24135l().mo24261w().mo24208a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f33088b.f33107a.mo24135l().mo24260v().mo24208a("Install Referrer Service connected");
                this.f33088b.f33107a.mo24143s().mo24309z(new C7506t3(this, B0, this));
            } catch (RuntimeException e) {
                this.f33088b.f33107a.mo24135l().mo24261w().mo24209b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f33088b.f33107a.mo24135l().mo24261w().mo24208a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f33088b.f33107a.mo24135l().mo24260v().mo24208a("Install Referrer Service disconnected");
    }
}
