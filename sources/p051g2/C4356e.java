package p051g2;

import java.io.IOException;
import java.util.Arrays;
import p037e2.C4192b0;
import p037e2.C4196c0;
import p037e2.C4200e0;
import p037e2.C4216m;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: g2.e */
/* compiled from: ChunkReader */
final class C4356e {

    /* renamed from: a */
    protected final C4200e0 f24292a;

    /* renamed from: b */
    private final int f24293b;

    /* renamed from: c */
    private final int f24294c;

    /* renamed from: d */
    private final long f24295d;

    /* renamed from: e */
    private final int f24296e;

    /* renamed from: f */
    private int f24297f;

    /* renamed from: g */
    private int f24298g;

    /* renamed from: h */
    private int f24299h;

    /* renamed from: i */
    private int f24300i;

    /* renamed from: j */
    private int f24301j;

    /* renamed from: k */
    private long[] f24302k;

    /* renamed from: l */
    private int[] f24303l;

    public C4356e(int i, int i2, long j, int i3, C4200e0 e0Var) {
        boolean z = true;
        if (!(i2 == 1 || i2 == 2)) {
            z = false;
        }
        C5917a.m34868a(z);
        this.f24295d = j;
        this.f24296e = i3;
        this.f24292a = e0Var;
        this.f24293b = m28984d(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f24294c = i2 == 2 ? m28984d(i, 1650720768) : -1;
        this.f24302k = new long[512];
        this.f24303l = new int[512];
    }

    /* renamed from: d */
    private static int m28984d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* renamed from: e */
    private long m28985e(int i) {
        return (this.f24295d * ((long) i)) / ((long) this.f24296e);
    }

    /* renamed from: h */
    private C4196c0 m28986h(int i) {
        return new C4196c0(((long) this.f24303l[i]) * mo17788g(), this.f24302k[i]);
    }

    /* renamed from: a */
    public void mo17784a() {
        this.f24299h++;
    }

    /* renamed from: b */
    public void mo17785b(long j) {
        if (this.f24301j == this.f24303l.length) {
            long[] jArr = this.f24302k;
            this.f24302k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f24303l;
            this.f24303l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f24302k;
        int i = this.f24301j;
        jArr2[i] = j;
        this.f24303l[i] = this.f24300i;
        this.f24301j = i + 1;
    }

    /* renamed from: c */
    public void mo17786c() {
        this.f24302k = Arrays.copyOf(this.f24302k, this.f24301j);
        this.f24303l = Arrays.copyOf(this.f24303l, this.f24301j);
    }

    /* renamed from: f */
    public long mo17787f() {
        return m28985e(this.f24299h);
    }

    /* renamed from: g */
    public long mo17788g() {
        return m28985e(1);
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17789i(long j) {
        int g = (int) (j / mo17788g());
        int h = C5953m0.m35134h(this.f24303l, g, true, true);
        if (this.f24303l[h] == g) {
            return new C4192b0.C4193a(m28986h(h));
        }
        C4196c0 h2 = m28986h(h);
        int i = h + 1;
        if (i < this.f24302k.length) {
            return new C4192b0.C4193a(h2, m28986h(i));
        }
        return new C4192b0.C4193a(h2);
    }

    /* renamed from: j */
    public boolean mo17790j(int i) {
        return this.f24293b == i || this.f24294c == i;
    }

    /* renamed from: k */
    public void mo17791k() {
        this.f24300i++;
    }

    /* renamed from: l */
    public boolean mo17792l() {
        return Arrays.binarySearch(this.f24303l, this.f24299h) >= 0;
    }

    /* renamed from: m */
    public boolean mo17793m(C4216m mVar) throws IOException {
        int i = this.f24298g;
        boolean z = false;
        int b = i - this.f24292a.mo6840b(mVar, i, false);
        this.f24298g = b;
        if (b == 0) {
            z = true;
        }
        if (z) {
            if (this.f24297f > 0) {
                C4200e0 e0Var = this.f24292a;
                long f = mo17787f();
                boolean l = mo17792l();
                e0Var.mo6838a(f, l ? 1 : 0, this.f24297f, 0, (C4200e0.C4201a) null);
            }
            mo17784a();
        }
        return z;
    }

    /* renamed from: n */
    public void mo17794n(int i) {
        this.f24297f = i;
        this.f24298g = i;
    }

    /* renamed from: o */
    public void mo17795o(long j) {
        if (this.f24301j == 0) {
            this.f24299h = 0;
            return;
        }
        this.f24299h = this.f24303l[C5953m0.m35136i(this.f24302k, j, true, true)];
    }
}
