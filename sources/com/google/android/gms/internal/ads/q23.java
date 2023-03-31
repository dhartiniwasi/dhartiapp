package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q23 {

    /* renamed from: a */
    private final Context f16158a;

    /* renamed from: b */
    private final Looper f16159b;

    public q23(Context context, Looper looper) {
        this.f16158a = context;
        this.f16159b = looper;
    }

    /* renamed from: a */
    public final void mo13461a(String str) {
        e33 G = g33.m13020G();
        G.mo9793p(this.f16158a.getPackageName());
        G.mo9795s(2);
        b33 G2 = c33.m10693G();
        G2.mo8661p(str);
        G2.mo8662r(2);
        G.mo9794r(G2);
        new r23(this.f16158a, this.f16159b, (g33) G.mo13423m()).mo13659a();
    }
}
