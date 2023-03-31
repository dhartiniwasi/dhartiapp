package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a82 implements k52 {

    /* renamed from: a */
    private final Context f6464a;

    /* renamed from: b */
    private final jk1 f6465b;

    /* renamed from: c */
    private final Executor f6466c;

    public a82(Context context, jk1 jk1, Executor executor) {
        this.f6464a = context;
        this.f6465b = jk1;
        this.f6466c = executor;
    }

    /* renamed from: c */
    private static final boolean m9636c(us2 us2, int i) {
        return us2.f18722a.f17091a.f8936g.contains(Integer.toString(i));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        xl1 xl1;
        bc0 b = ((au2) g52.f9705b).mo8538b();
        cc0 c = ((au2) g52.f9705b).mo8539c();
        fc0 g = ((au2) g52.f9705b).mo8543g();
        if (g != null && m9636c(us2, 6)) {
            xl1 = xl1.m23313a0(g);
        } else if (b != null && m9636c(us2, 6)) {
            xl1 = xl1.m23308E(b);
        } else if (b != null && m9636c(us2, 2)) {
            xl1 = xl1.m23306C(b);
        } else if (c != null && m9636c(us2, 6)) {
            xl1 = xl1.m23309F(c);
        } else if (c == null || !m9636c(us2, 1)) {
            throw new v82(1, "No native ad mappers");
        } else {
            xl1 = xl1.m23307D(c);
        }
        if (us2.f18722a.f17091a.f8936g.contains(Integer.toString(xl1.mo15132K()))) {
            zl1 d = this.f6465b.mo11419d(new k61(us2, is2, g52.f9704a), new km1(xl1), new zn1(c, b, g, (byte[]) null));
            ((z62) g52.f9706c).mo15552J6(d.mo12210g());
            d.mo11814c().mo11669m0(new c11((au2) g52.f9705b), this.f6466c);
            return d.mo8435h();
        }
        throw new v82(1, "No corresponding native ad listener");
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        et2 et2 = us2.f18722a.f17091a;
        ((au2) g52.f9705b).mo8554r(this.f6464a, us2.f18722a.f17091a.f8933d, is2.f11006w.toString(), C4820w0.m30822l(is2.f11003t), (wb0) g52.f9706c, et2.f8938i, et2.f8936g);
    }
}
