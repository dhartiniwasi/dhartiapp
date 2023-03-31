package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p053g4.C4409t;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x02 extends q02 {

    /* renamed from: g */
    private String f19927g;

    /* renamed from: h */
    private int f19928h = 1;

    x02(Context context) {
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
                    int i = this.f19928h;
                    if (i == 2) {
                        this.f16115f.mo11105n0().mo11006Y0(this.f16114e, new p02(this));
                    } else if (i == 3) {
                        this.f16115f.mo11105n0().mo11005Q3(this.f19927g, new p02(this));
                    } else {
                        this.f16110a.mo11173e(new g12(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f16110a.mo11173e(new g12(1));
                } catch (Throwable th) {
                    C4409t.m29325q().mo15126t(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.f16110a.mo11173e(new g12(1));
                }
            }
        }
    }

    /* renamed from: b */
    public final lf3 mo15015b(yg0 yg0) {
        synchronized (this.f16111b) {
            int i = this.f19928h;
            if (i != 1 && i != 2) {
                lf3 h = cf3.m10910h(new g12(2));
                return h;
            } else if (this.f16112c) {
                in0 in0 = this.f16110a;
                return in0;
            } else {
                this.f19928h = 2;
                this.f16112c = true;
                this.f16114e = yg0;
                this.f16115f.mo17355u();
                this.f16110a.mo10135j(new v02(this), dn0.f8330f);
                in0 in02 = this.f16110a;
                return in02;
            }
        }
    }

    /* renamed from: c */
    public final lf3 mo15016c(String str) {
        synchronized (this.f16111b) {
            int i = this.f19928h;
            if (i != 1 && i != 3) {
                lf3 h = cf3.m10910h(new g12(2));
                return h;
            } else if (this.f16112c) {
                in0 in0 = this.f16110a;
                return in0;
            } else {
                this.f19928h = 3;
                this.f16112c = true;
                this.f19927g = str;
                this.f16115f.mo17355u();
                this.f16110a.mo10135j(new u02(this), dn0.f8330f);
                in0 in02 = this.f16110a;
                return in02;
            }
        }
    }
}
