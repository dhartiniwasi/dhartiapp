package com.google.android.gms.internal.ads;

import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mu0 {

    /* renamed from: a */
    private final int f13503a;

    /* renamed from: b */
    public final int f13504b;

    /* renamed from: c */
    public final int f13505c;

    private mu0(int i, int i2, int i3) {
        this.f13503a = i;
        this.f13505c = i2;
        this.f13504b = i3;
    }

    /* renamed from: a */
    public static mu0 m16708a() {
        return new mu0(0, 0, 0);
    }

    /* renamed from: b */
    public static mu0 m16709b(int i, int i2) {
        return new mu0(1, i, i2);
    }

    /* renamed from: c */
    public static mu0 m16710c(C4571q4 q4Var) {
        if (q4Var.f24975d) {
            return new mu0(3, 0, 0);
        }
        if (q4Var.f24980i) {
            return new mu0(2, 0, 0);
        }
        if (q4Var.f24979h) {
            return m16708a();
        }
        return m16709b(q4Var.f24977f, q4Var.f24974c);
    }

    /* renamed from: d */
    public static mu0 m16711d() {
        return new mu0(5, 0, 0);
    }

    /* renamed from: e */
    public static mu0 m16712e() {
        return new mu0(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean mo12439f() {
        return this.f13503a == 0;
    }

    /* renamed from: g */
    public final boolean mo12440g() {
        return this.f13503a == 2;
    }

    /* renamed from: h */
    public final boolean mo12441h() {
        return this.f13503a == 5;
    }

    /* renamed from: i */
    public final boolean mo12442i() {
        return this.f13503a == 3;
    }

    /* renamed from: j */
    public final boolean mo12443j() {
        return this.f13503a == 4;
    }
}
