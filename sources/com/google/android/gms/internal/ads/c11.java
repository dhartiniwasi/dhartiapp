package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c11 implements ra1 {

    /* renamed from: a */
    private final au2 f7567a;

    public c11(au2 au2) {
        this.f7567a = au2;
    }

    /* renamed from: c */
    public final void mo9006c(Context context) {
        try {
            this.f7567a.mo8558v();
        } catch (jt2 e) {
            pm0.m18668h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    /* renamed from: e */
    public final void mo9007e(Context context) {
        try {
            this.f7567a.mo8546j();
        } catch (jt2 e) {
            pm0.m18668h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    /* renamed from: f */
    public final void mo9008f(Context context) {
        try {
            this.f7567a.mo8559w();
            if (context != null) {
                this.f7567a.mo8557u(context);
            }
        } catch (jt2 e) {
            pm0.m18668h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
