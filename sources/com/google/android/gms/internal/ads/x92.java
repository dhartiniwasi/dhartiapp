package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x92 implements k52 {

    /* renamed from: a */
    private final Context f20050a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f20051b;

    /* renamed from: c */
    private final ur1 f20052c;

    public x92(Context context, Executor executor, ur1 ur1) {
        this.f20050a = context;
        this.f20051b = executor;
        this.f20052c = ur1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m23145e(us2 us2, is2 is2, g52 g52) {
        try {
            ((au2) g52.f9705b).mo8550n(us2.f18722a.f17091a.f8933d, is2.f11006w.toString());
        } catch (Exception e) {
            pm0.m18668h("Fail to load ad from adapter ".concat(String.valueOf(g52.f9704a)), e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        qr1 b = this.f20052c.mo13091b(new k61(us2, is2, g52.f9704a), new rr1(new t92(g52)));
        b.mo11814c().mo11669m0(new c11((au2) g52.f9705b), this.f20051b);
        eb1 d = b.mo11815d();
        t91 a = b.mo11813a();
        ((a72) g52.f9706c).mo8244J6(new w92(this, b.mo11816h(), a, d, b.mo11817i()));
        return b.mo11819k();
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        if (!((au2) g52.f9705b).mo8537a()) {
            ((a72) g52.f9706c).mo8245K6(new v92(this, us2, is2, g52));
            ((au2) g52.f9705b).mo8547k(this.f20050a, us2.f18722a.f17091a.f8933d, (String) null, (ai0) g52.f9706c, is2.f11006w.toString());
            return;
        }
        m23145e(us2, is2, g52);
    }
}
