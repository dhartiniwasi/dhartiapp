package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import p067i5.C4691e;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wj0 {

    /* renamed from: a */
    private Context f19644a;

    /* renamed from: b */
    private C4691e f19645b;

    /* renamed from: c */
    private C4800p1 f19646c;

    /* renamed from: d */
    private sk0 f19647d;

    /* synthetic */ wj0(vj0 vj0) {
    }

    /* renamed from: a */
    public final wj0 mo14934a(C4800p1 p1Var) {
        this.f19646c = p1Var;
        return this;
    }

    /* renamed from: b */
    public final wj0 mo14935b(Context context) {
        Objects.requireNonNull(context);
        this.f19644a = context;
        return this;
    }

    /* renamed from: c */
    public final wj0 mo14936c(C4691e eVar) {
        Objects.requireNonNull(eVar);
        this.f19645b = eVar;
        return this;
    }

    /* renamed from: d */
    public final wj0 mo14937d(sk0 sk0) {
        this.f19647d = sk0;
        return this;
    }

    /* renamed from: e */
    public final tk0 mo14938e() {
        j44.m14700c(this.f19644a, Context.class);
        j44.m14700c(this.f19645b, C4691e.class);
        j44.m14700c(this.f19646c, C4800p1.class);
        j44.m14700c(this.f19647d, sk0.class);
        return new zj0(this.f19644a, this.f19645b, this.f19646c, this.f19647d, (yj0) null);
    }
}
