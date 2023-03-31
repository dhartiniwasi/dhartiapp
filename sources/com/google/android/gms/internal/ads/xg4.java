package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xg4 implements xj4 {

    /* renamed from: a */
    private final xj4 f20096a;

    /* renamed from: b */
    private final gv0 f20097b;

    public xg4(xj4 xj4, gv0 gv0) {
        this.f20096a = xj4;
        this.f20097b = gv0;
    }

    /* renamed from: a */
    public final gv0 mo8851a() {
        return this.f20097b;
    }

    /* renamed from: e */
    public final int mo8852e() {
        return this.f20096a.mo8852e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg4)) {
            return false;
        }
        xg4 xg4 = (xg4) obj;
        return this.f20096a.equals(xg4.f20096a) && this.f20097b.equals(xg4.f20097b);
    }

    /* renamed from: g */
    public final int mo8853g(int i) {
        return this.f20096a.mo8853g(0);
    }

    /* renamed from: h */
    public final C2388g4 mo8854h(int i) {
        return this.f20096a.mo8854h(i);
    }

    public final int hashCode() {
        return ((this.f20097b.hashCode() + 527) * 31) + this.f20096a.hashCode();
    }

    /* renamed from: s */
    public final int mo8855s(int i) {
        return this.f20096a.mo8855s(i);
    }
}
