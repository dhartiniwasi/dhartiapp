package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p060h4.C4596v;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l72 implements k52 {

    /* renamed from: a */
    private final Context f12665a;

    /* renamed from: b */
    private final mj1 f12666b;

    /* renamed from: c */
    private final vm0 f12667c;

    /* renamed from: d */
    private final Executor f12668d;

    public l72(Context context, vm0 vm0, mj1 mj1, Executor executor) {
        this.f12665a = context;
        this.f12667c = vm0;
        this.f12666b = mj1;
        this.f12668d = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        li1 c = this.f12666b.mo12362c(new k61(us2, is2, g52.f9704a), new oi1(new k72(this, g52), (vs0) null));
        c.mo11814c().mo11669m0(new c11((au2) g52.f9705b), this.f12668d);
        ((z62) g52.f9706c).mo15552J6(c.mo12210g());
        return c.mo12023i();
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        ((au2) g52.f9705b).mo8553q(this.f12665a, us2.f18722a.f17091a.f8933d, is2.f11006w.toString(), C4820w0.m30822l(is2.f11003t), (wb0) g52.f9706c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo11907c(g52 g52, boolean z, Context context, ja1 ja1) throws tj1 {
        try {
            ((au2) g52.f9705b).mo8560x(z);
            if (this.f12667c.f19152c < ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14253B0)).intValue()) {
                ((au2) g52.f9705b).mo8561y();
            } else {
                ((au2) g52.f9705b).mo8562z(context);
            }
        } catch (jt2 e) {
            pm0.m18666f("Cannot show interstitial.");
            throw new tj1(e.getCause());
        }
    }
}
