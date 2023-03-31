package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p053g4.C4409t;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class o02 extends q02 {
    public o02(Context context) {
        this.f16115f = new ig0(context, C4409t.m29330v().mo18569b(), this, this);
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
        pm0.m18662b("Cannot connect to remote service, fallback to local instance.");
        this.f16110a.mo11173e(new g12(1));
    }

    /* renamed from: P0 */
    public final void mo8531P0(Bundle bundle) {
        synchronized (this.f16111b) {
            if (!this.f16113d) {
                this.f16113d = true;
                try {
                    this.f16115f.mo11105n0().mo11008r2(this.f16114e, new p02(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f16110a.mo11173e(new g12(1));
                } catch (Throwable th) {
                    C4409t.m29325q().mo15126t(th, "RemoteAdRequestClientTask.onConnected");
                    this.f16110a.mo11173e(new g12(1));
                }
            }
        }
    }
}
