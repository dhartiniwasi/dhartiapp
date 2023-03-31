package com.google.android.gms.internal.ads;

import android.content.Context;
import p067i5.C4691e;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zj0 extends tk0 {

    /* renamed from: b */
    private final C4691e f21103b;

    /* renamed from: c */
    private final zj0 f21104c = this;

    /* renamed from: d */
    private final o44 f21105d;

    /* renamed from: e */
    private final o44 f21106e;

    /* renamed from: f */
    private final o44 f21107f;

    /* renamed from: g */
    private final o44 f21108g;

    /* renamed from: h */
    private final o44 f21109h;

    /* renamed from: i */
    private final o44 f21110i;

    /* renamed from: j */
    private final o44 f21111j;

    /* renamed from: k */
    private final o44 f21112k;

    /* synthetic */ zj0(Context context, C4691e eVar, C4800p1 p1Var, sk0 sk0, yj0 yj0) {
        this.f21103b = eVar;
        b44 a = c44.m10704a(context);
        this.f21105d = a;
        b44 a2 = c44.m10704a(p1Var);
        this.f21106e = a2;
        b44 a3 = c44.m10704a(sk0);
        this.f21107f = a3;
        this.f21108g = a44.m9578b(new qj0(a, a2, a3));
        b44 a4 = c44.m10704a(eVar);
        this.f21109h = a4;
        o44 b = a44.m9578b(new sj0(a4, a2, a3));
        this.f21110i = b;
        uj0 uj0 = new uj0(a4, b);
        this.f21111j = uj0;
        this.f21112k = a44.m9578b(new zk0(a, uj0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final pj0 mo14317a() {
        return (pj0) this.f21108g.mo8155d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final tj0 mo14318b() {
        return new tj0(this.f21103b, (rj0) this.f21110i.mo8155d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final xk0 mo14319c() {
        return (xk0) this.f21112k.mo8155d();
    }
}
