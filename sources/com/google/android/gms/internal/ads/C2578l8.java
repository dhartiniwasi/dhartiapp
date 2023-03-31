package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2578l8 implements C2643n {

    /* renamed from: a */
    private final C2429h8 f12674a;

    /* renamed from: b */
    private final int f12675b;

    /* renamed from: c */
    private final long f12676c;

    /* renamed from: d */
    private final long f12677d;

    /* renamed from: e */
    private final long f12678e;

    public C2578l8(C2429h8 h8Var, int i, long j, long j2) {
        this.f12674a = h8Var;
        this.f12675b = i;
        this.f12676c = j;
        long j3 = (j2 - j) / ((long) h8Var.f10242d);
        this.f12677d = j3;
        this.f12678e = m15854b(j3);
    }

    /* renamed from: b */
    private final long m15854b(long j) {
        return gb2.m13170g0(j * ((long) this.f12675b), 1000000, (long) this.f12674a.f10241c);
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        long b0 = gb2.m13160b0((((long) this.f12674a.f10241c) * j) / (((long) this.f12675b) * 1000000), 0, this.f12677d - 1);
        long j2 = this.f12676c;
        int i = this.f12674a.f10242d;
        long b = m15854b(b0);
        C2680o oVar = new C2680o(b, j2 + (((long) i) * b0));
        if (b >= j || b0 == this.f12677d - 1) {
            return new C2569l(oVar, oVar);
        }
        long j3 = b0 + 1;
        return new C2569l(oVar, new C2680o(m15854b(j3), this.f12676c + (j3 * ((long) this.f12674a.f10242d))));
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f12678e;
    }
}
