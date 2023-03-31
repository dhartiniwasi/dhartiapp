package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4527j2;
import p060h4.C4545m2;
import p179z3.C6355x;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jr1 extends C6355x.C6356a {

    /* renamed from: a */
    private final xl1 f11761a;

    public jr1(xl1 xl1) {
        this.f11761a = xl1;
    }

    /* renamed from: f */
    private static C4545m2 m15021f(xl1 xl1) {
        C4527j2 R = xl1.mo15139R();
        if (R == null) {
            return null;
        }
        try {
            return R.mo10785V();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo11482a() {
        C4545m2 f = m15021f(this.f11761a);
        if (f != null) {
            try {
                f.mo18040a();
            } catch (RemoteException e) {
                pm0.m18668h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo11483c() {
        C4545m2 f = m15021f(this.f11761a);
        if (f != null) {
            try {
                f.mo18041c();
            } catch (RemoteException e) {
                pm0.m18668h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo11484e() {
        C4545m2 f = m15021f(this.f11761a);
        if (f != null) {
            try {
                f.mo18039V();
            } catch (RemoteException e) {
                pm0.m18668h("Unable to call onVideoEnd()", e);
            }
        }
    }
}
