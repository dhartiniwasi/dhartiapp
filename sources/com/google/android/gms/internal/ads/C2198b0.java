package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2198b0 implements C2643n {

    /* renamed from: a */
    private final long f7028a;

    /* renamed from: b */
    final /* synthetic */ C2346f0 f7029b;

    public C2198b0(C2346f0 f0Var, long j) {
        this.f7029b = f0Var;
        this.f7028a = j;
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        C2569l a = this.f7029b.f9057g[0].mo10976a(j);
        int i = 1;
        while (true) {
            C2346f0 f0Var = this.f7029b;
            if (i >= f0Var.f9057g.length) {
                return a;
            }
            C2569l a2 = f0Var.f9057g[i].mo10976a(j);
            if (a2.f12535a.f14772b < a.f12535a.f14772b) {
                a = a2;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f7028a;
    }
}
