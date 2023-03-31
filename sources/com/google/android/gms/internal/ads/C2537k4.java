package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2537k4 implements C2425h4 {

    /* renamed from: a */
    private final y22 f11895a;

    /* renamed from: b */
    private final int f11896b;

    /* renamed from: c */
    private final int f11897c;

    /* renamed from: d */
    private int f11898d;

    /* renamed from: e */
    private int f11899e;

    public C2537k4(C2239c4 c4Var) {
        y22 y22 = c4Var.f7583b;
        this.f11895a = y22;
        y22.mo15293f(12);
        this.f11897c = y22.mo15309v() & 255;
        this.f11896b = y22.mo15309v();
    }

    /* renamed from: d */
    public final int mo10729d() {
        return this.f11896b;
    }

    /* renamed from: e */
    public final int mo10730e() {
        int i = this.f11897c;
        if (i == 8) {
            return this.f11895a.mo15306s();
        }
        if (i == 16) {
            return this.f11895a.mo15310w();
        }
        int i2 = this.f11898d;
        this.f11898d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f11899e & 15;
        }
        int s = this.f11895a.mo15306s();
        this.f11899e = s;
        return (s & 240) >> 4;
    }

    public final int zza() {
        return -1;
    }
}
