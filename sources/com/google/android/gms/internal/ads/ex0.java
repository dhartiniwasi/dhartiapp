package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ex0 implements qo2 {

    /* renamed from: a */
    private final Context f8964a;

    /* renamed from: b */
    private final C4571q4 f8965b;

    /* renamed from: c */
    private final String f8966c;

    /* renamed from: d */
    private final dw0 f8967d;

    /* renamed from: e */
    private final ex0 f8968e = this;

    /* renamed from: f */
    private final o44 f8969f;

    /* renamed from: g */
    private final o44 f8970g;

    /* renamed from: h */
    private final o44 f8971h;

    /* renamed from: i */
    private final o44 f8972i;

    /* renamed from: j */
    private final o44 f8973j;

    /* renamed from: k */
    private final o44 f8974k;

    /* synthetic */ ex0(dw0 dw0, Context context, String str, C4571q4 q4Var, dx0 dx0) {
        this.f8967d = dw0;
        this.f8964a = context;
        this.f8965b = q4Var;
        this.f8966c = str;
        b44 a = c44.m10704a(context);
        this.f8969f = a;
        b44 a2 = c44.m10704a(q4Var);
        this.f8970g = a2;
        o44 b = a44.m9578b(new oc2(dw0.f8493p));
        this.f8971h = b;
        o44 b2 = a44.m9578b(tc2.m20979a());
        this.f8972i = b2;
        o44 b3 = a44.m9578b(xe1.m23191a());
        this.f8973j = b3;
        this.f8974k = a44.m9578b(new oo2(a, dw0.f8495q, a2, dw0.f8456S, b, b2, gt2.m13526a(), b3));
    }

    public final tb2 zza() {
        vm0 d = this.f8967d.f8465b.mo14824d();
        j44.m14699b(d);
        return new tb2(this.f8964a, this.f8965b, this.f8966c, (no2) this.f8974k.mo8155d(), (nc2) this.f8971h.mo8155d(), d);
    }
}
