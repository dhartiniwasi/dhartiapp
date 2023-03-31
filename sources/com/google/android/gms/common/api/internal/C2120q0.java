package com.google.android.gms.common.api.internal;

import android.util.Log;
import p033d5.C4114j;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2120q0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6362b f6267a;

    /* renamed from: b */
    final /* synthetic */ C2122r0 f6268b;

    C2120q0(C2122r0 r0Var, C6362b bVar) {
        this.f6268b = r0Var;
        this.f6267a = bVar;
    }

    public final void run() {
        C2122r0 r0Var = this.f6268b;
        C2115o0 o0Var = (C2115o0) r0Var.f6277f.f6132t.get(r0Var.f6273b);
        if (o0Var != null) {
            if (this.f6267a.mo21755M1()) {
                this.f6268b.f6276e = true;
                if (this.f6268b.f6272a.mo6948s()) {
                    this.f6268b.m9448h();
                    return;
                }
                try {
                    C2122r0 r0Var2 = this.f6268b;
                    r0Var2.f6272a.mo6939i((C4114j) null, r0Var2.f6272a.mo6932c());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f6268b.f6272a.mo6933d("Failed to get service from broker.");
                    o0Var.mo8101F(new C6362b(10), (Exception) null);
                }
            } else {
                o0Var.mo8101F(this.f6267a, (Exception) null);
            }
        }
    }
}
