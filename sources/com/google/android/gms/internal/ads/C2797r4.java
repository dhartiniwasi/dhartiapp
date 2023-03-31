package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2797r4 {

    /* renamed from: a */
    public final C2792r f16810a;

    /* renamed from: b */
    public final C2314e5 f16811b = new C2314e5();

    /* renamed from: c */
    public final y22 f16812c = new y22();

    /* renamed from: d */
    public C2351f5 f16813d;

    /* renamed from: e */
    public C2648n4 f16814e;

    /* renamed from: f */
    public int f16815f;

    /* renamed from: g */
    public int f16816g;

    /* renamed from: h */
    public int f16817h;

    /* renamed from: i */
    public int f16818i;

    /* renamed from: j */
    private final y22 f16819j = new y22(1);

    /* renamed from: k */
    private final y22 f16820k = new y22();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f16821l;

    public C2797r4(C2792r rVar, C2351f5 f5Var, C2648n4 n4Var) {
        this.f16810a = rVar;
        this.f16813d = f5Var;
        this.f16814e = n4Var;
        mo13672h(f5Var, n4Var);
    }

    /* renamed from: a */
    public final int mo13666a() {
        int i;
        if (!this.f16821l) {
            i = this.f16813d.f9120g[this.f16815f];
        } else {
            i = this.f16811b.f8650j[this.f16815f] ? 1 : 0;
        }
        return mo13671f() != null ? i | 1073741824 : i;
    }

    /* renamed from: b */
    public final int mo13667b() {
        if (!this.f16821l) {
            return this.f16813d.f9117d[this.f16815f];
        }
        return this.f16811b.f8648h[this.f16815f];
    }

    /* renamed from: c */
    public final int mo13668c(int i, int i2) {
        y22 y22;
        C2277d5 f = mo13671f();
        if (f == null) {
            return 0;
        }
        int i3 = f.f8060d;
        if (i3 != 0) {
            y22 = this.f16811b.f8654n;
        } else {
            byte[] bArr = (byte[]) gb2.m13171h(f.f8061e);
            y22 y222 = this.f16820k;
            int length = bArr.length;
            y222.mo15291d(bArr, length);
            y22 = this.f16820k;
            i3 = length;
        }
        boolean b = this.f16811b.mo9803b(this.f16815f);
        boolean z = b || i2 != 0;
        y22 y223 = this.f16819j;
        y223.mo15295h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        y223.mo15293f(0);
        this.f16810a.mo8822d(this.f16819j, 1, 1);
        this.f16810a.mo8822d(y22, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!b) {
            this.f16812c.mo15290c(8);
            y22 y224 = this.f16812c;
            byte[] h = y224.mo15295h();
            h[0] = 0;
            h[1] = 1;
            h[2] = 0;
            h[3] = (byte) i2;
            h[4] = (byte) ((i >> 24) & 255);
            h[5] = (byte) ((i >> 16) & 255);
            h[6] = (byte) ((i >> 8) & 255);
            h[7] = (byte) (i & 255);
            this.f16810a.mo8822d(y224, 8, 1);
            return i3 + 9;
        }
        y22 y225 = this.f16811b.f8654n;
        int w = y225.mo15310w();
        y225.mo15294g(-2);
        int i4 = (w * 6) + 2;
        if (i2 != 0) {
            this.f16812c.mo15290c(i4);
            byte[] h2 = this.f16812c.mo15295h();
            y225.mo15289b(h2, 0, i4);
            int i5 = (((h2[2] & 255) << 8) | (h2[3] & 255)) + i2;
            h2[2] = (byte) ((i5 >> 8) & 255);
            h2[3] = (byte) (i5 & 255);
            y225 = this.f16812c;
        }
        this.f16810a.mo8822d(y225, i4, 1);
        return i3 + 1 + i4;
    }

    /* renamed from: d */
    public final long mo13669d() {
        if (!this.f16821l) {
            return this.f16813d.f9116c[this.f16815f];
        }
        return this.f16811b.f8646f[this.f16817h];
    }

    /* renamed from: e */
    public final long mo13670e() {
        if (!this.f16821l) {
            return this.f16813d.f9119f[this.f16815f];
        }
        C2314e5 e5Var = this.f16811b;
        return e5Var.f8649i[this.f16815f];
    }

    /* renamed from: f */
    public final C2277d5 mo13671f() {
        if (!this.f16821l) {
            return null;
        }
        C2314e5 e5Var = this.f16811b;
        C2648n4 n4Var = e5Var.f8641a;
        int i = gb2.f9812a;
        int i2 = n4Var.f13840a;
        C2277d5 d5Var = e5Var.f8653m;
        if (d5Var == null) {
            d5Var = this.f16813d.f9114a.mo9019a(i2);
        }
        if (d5Var == null || !d5Var.f8057a) {
            return null;
        }
        return d5Var;
    }

    /* renamed from: h */
    public final void mo13672h(C2351f5 f5Var, C2648n4 n4Var) {
        this.f16813d = f5Var;
        this.f16814e = n4Var;
        this.f16810a.mo8823e(f5Var.f9114a.f7595f);
        mo13673i();
    }

    /* renamed from: i */
    public final void mo13673i() {
        C2314e5 e5Var = this.f16811b;
        e5Var.f8644d = 0;
        e5Var.f8656p = 0;
        e5Var.f8657q = false;
        e5Var.f8651k = false;
        e5Var.f8655o = false;
        e5Var.f8653m = null;
        this.f16815f = 0;
        this.f16817h = 0;
        this.f16816g = 0;
        this.f16818i = 0;
        this.f16821l = false;
    }

    /* renamed from: k */
    public final boolean mo13674k() {
        this.f16815f++;
        if (!this.f16821l) {
            return false;
        }
        int i = this.f16816g + 1;
        this.f16816g = i;
        int[] iArr = this.f16811b.f8647g;
        int i2 = this.f16817h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f16817h = i2 + 1;
        this.f16816g = 0;
        return false;
    }
}
