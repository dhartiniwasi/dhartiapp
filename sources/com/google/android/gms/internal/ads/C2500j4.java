package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2500j4 implements C2425h4 {

    /* renamed from: a */
    private final int f11212a;

    /* renamed from: b */
    private final int f11213b;

    /* renamed from: c */
    private final y22 f11214c;

    public C2500j4(C2239c4 c4Var, C2388g4 g4Var) {
        y22 y22 = c4Var.f7583b;
        this.f11214c = y22;
        y22.mo15293f(12);
        int v = y22.mo15309v();
        if ("audio/raw".equals(g4Var.f9673l)) {
            int Y = gb2.m13155Y(g4Var.f9656A, g4Var.f9686y);
            if (v == 0 || v % Y != 0) {
                ot1.m18060e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + Y + ", stsz sample size: " + v);
                v = Y;
            }
        }
        this.f11212a = v == 0 ? -1 : v;
        this.f11213b = y22.mo15309v();
    }

    /* renamed from: d */
    public final int mo10729d() {
        return this.f11213b;
    }

    /* renamed from: e */
    public final int mo10730e() {
        int i = this.f11212a;
        return i == -1 ? this.f11214c.mo15309v() : i;
    }

    public final int zza() {
        return this.f11212a;
    }
}
