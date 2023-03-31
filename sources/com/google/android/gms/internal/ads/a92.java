package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a92 implements k52 {

    /* renamed from: a */
    private final Context f6487a;

    /* renamed from: b */
    private final Executor f6488b;

    /* renamed from: c */
    private final ur1 f6489c;

    public a92(Context context, Executor executor, ur1 ur1) {
        this.f6487a = context;
        this.f6488b = executor;
        this.f6489c = ur1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        qr1 b = this.f6489c.mo13091b(new k61(us2, is2, g52.f9704a), new rr1(new z82(g52)));
        b.mo11814c().mo11669m0(new c11((au2) g52.f9705b), this.f6488b);
        ((z62) g52.f9706c).mo15552J6(b.mo11821m());
        return b.mo11819k();
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        try {
            et2 et2 = us2.f18722a.f17091a;
            if (et2.f8944o.f16514a == 3) {
                ((au2) g52.f9705b).mo8556t(this.f6487a, et2.f8933d, is2.f11006w.toString(), (wb0) g52.f9706c);
            } else {
                ((au2) g52.f9705b).mo8555s(this.f6487a, et2.f8933d, is2.f11006w.toString(), (wb0) g52.f9706c);
            }
        } catch (Exception e) {
            pm0.m18668h("Fail to load ad from adapter ".concat(String.valueOf(g52.f9704a)), e);
        }
    }
}
