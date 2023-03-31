package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4470a;
import p060h4.C4471a0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rc2 implements C4470a, qh1 {

    /* renamed from: a */
    private C4471a0 f16912a;

    /* renamed from: a */
    public final synchronized void mo13778a(C4471a0 a0Var) {
        this.f16912a = a0Var;
    }

    /* renamed from: h */
    public final synchronized void mo9272h() {
        C4471a0 a0Var = this.f16912a;
        if (a0Var != null) {
            try {
                a0Var.mo18011d();
            } catch (RemoteException e) {
                pm0.m18668h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    public final synchronized void onAdClicked() {
        C4471a0 a0Var = this.f16912a;
        if (a0Var != null) {
            try {
                a0Var.mo18011d();
            } catch (RemoteException e) {
                pm0.m18668h("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
