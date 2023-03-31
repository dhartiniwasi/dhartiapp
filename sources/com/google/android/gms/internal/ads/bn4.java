package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class bn4 {

    /* renamed from: a */
    protected final vm4 f7380a;

    /* renamed from: b */
    protected final an4 f7381b;

    /* renamed from: c */
    protected xm4 f7382c;

    /* renamed from: d */
    private final int f7383d;

    protected bn4(ym4 ym4, an4 an4, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f7381b = an4;
        this.f7383d = i;
        this.f7380a = new vm4(ym4, j, 0, j3, j4, j5, j6);
    }

    /* renamed from: f */
    protected static final int m10502f(rn4 rn4, long j, C2532k kVar) {
        if (j == rn4.mo9003T()) {
            return 0;
        }
        kVar.f11852a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m10503g(rn4 rn4, long j) throws IOException {
        long T = j - rn4.mo9003T();
        if (T < 0 || T > 262144) {
            return false;
        }
        ((fn4) rn4).mo10218n((int) T, false);
        return true;
    }

    /* renamed from: a */
    public final int mo8893a(rn4 rn4, C2532k kVar) throws IOException {
        while (true) {
            xm4 xm4 = this.f7382c;
            v91.m22048b(xm4);
            long b = xm4.f20221f;
            long a = xm4.f20222g;
            long c = xm4.f20223h;
            if (a - b <= ((long) this.f7383d)) {
                mo8895c(false, b);
                return m10502f(rn4, b, kVar);
            } else if (!m10503g(rn4, c)) {
                return m10502f(rn4, c, kVar);
            } else {
                rn4.mo9981W();
                zm4 a2 = this.f7381b.mo8442a(rn4, xm4.f20217b);
                int a3 = a2.f21166a;
                if (a3 == -3) {
                    mo8895c(false, c);
                    return m10502f(rn4, c, kVar);
                } else if (a3 == -2) {
                    xm4.m23397h(xm4, a2.f21167b, a2.f21168c);
                } else if (a3 != -1) {
                    m10503g(rn4, a2.f21168c);
                    mo8895c(true, a2.f21168c);
                    return m10502f(rn4, a2.f21168c, kVar);
                } else {
                    xm4.m23396g(xm4, a2.f21167b, a2.f21168c);
                }
            }
        }
    }

    /* renamed from: b */
    public final C2643n mo8894b() {
        return this.f7380a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8895c(boolean z, long j) {
        this.f7382c = null;
        this.f7381b.mo8443d();
    }

    /* renamed from: d */
    public final void mo8896d(long j) {
        long j2 = j;
        xm4 xm4 = this.f7382c;
        if (xm4 == null || xm4.f20216a != j2) {
            long h = this.f7380a.mo14793h(j2);
            vm4 vm4 = this.f7380a;
            xm4 xm42 = r1;
            xm4 xm43 = new xm4(j, h, 0, vm4.f19160c, vm4.f19161d, vm4.f19162e, vm4.f19163f);
            this.f7382c = xm42;
        }
    }

    /* renamed from: e */
    public final boolean mo8897e() {
        return this.f7382c != null;
    }
}
