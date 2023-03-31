package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ej4 implements Comparable {

    /* renamed from: a */
    private final boolean f8819a;

    /* renamed from: b */
    private final boolean f8820b;

    public ej4(C2388g4 g4Var, int i) {
        this.f8819a = 1 != (g4Var.f9665d & 1) ? false : true;
        this.f8820b = vj4.m22280r(i, false);
    }

    /* renamed from: a */
    public final int compareTo(ej4 ej4) {
        return ja3.m14783i().mo10778d(this.f8820b, ej4.f8820b).mo10778d(this.f8819a, ej4.f8819a).mo10775a();
    }
}
