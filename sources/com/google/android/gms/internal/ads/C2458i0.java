package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.i0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2458i0 {

    /* renamed from: a */
    protected final C2792r f10561a;

    /* renamed from: b */
    private final int f10562b;

    /* renamed from: c */
    private final int f10563c;

    /* renamed from: d */
    private final long f10564d;

    /* renamed from: e */
    private final int f10565e;

    /* renamed from: f */
    private int f10566f;

    /* renamed from: g */
    private int f10567g;

    /* renamed from: h */
    private int f10568h;

    /* renamed from: i */
    private int f10569i;

    /* renamed from: j */
    private int f10570j;

    /* renamed from: k */
    private long[] f10571k;

    /* renamed from: l */
    private int[] f10572l;

    public C2458i0(int i, int i2, long j, int i3, C2792r rVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.f10564d = j;
        this.f10565e = i3;
        this.f10561a = rVar;
        this.f10562b = m14090i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f10563c = i2 == 2 ? m14090i(i, 1650720768) : -1;
        this.f10571k = new long[512];
        this.f10572l = new int[512];
    }

    /* renamed from: i */
    private static int m14090i(int i, int i2) {
        return ((i / 10) + 48) | (((i % 10) + 48) << 8) | i2;
    }

    /* renamed from: j */
    private final long m14091j(int i) {
        return (this.f10564d * ((long) i)) / ((long) this.f10565e);
    }

    /* renamed from: k */
    private final C2680o m14092k(int i) {
        return new C2680o(((long) this.f10572l[i]) * m14091j(1), this.f10571k[i]);
    }

    /* renamed from: a */
    public final C2569l mo10976a(long j) {
        int j2 = (int) (j / m14091j(1));
        int M = gb2.m13143M(this.f10572l, j2, true, true);
        if (this.f10572l[M] == j2) {
            C2680o k = m14092k(M);
            return new C2569l(k, k);
        }
        C2680o k2 = m14092k(M);
        int i = M + 1;
        return i < this.f10571k.length ? new C2569l(k2, m14092k(i)) : new C2569l(k2, k2);
    }

    /* renamed from: b */
    public final void mo10977b(long j) {
        if (this.f10570j == this.f10572l.length) {
            long[] jArr = this.f10571k;
            this.f10571k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f10572l;
            this.f10572l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f10571k;
        int i = this.f10570j;
        jArr2[i] = j;
        this.f10572l[i] = this.f10569i;
        this.f10570j = i + 1;
    }

    /* renamed from: c */
    public final void mo10978c() {
        this.f10571k = Arrays.copyOf(this.f10571k, this.f10570j);
        this.f10572l = Arrays.copyOf(this.f10572l, this.f10570j);
    }

    /* renamed from: d */
    public final void mo10979d() {
        this.f10569i++;
    }

    /* renamed from: e */
    public final void mo10980e(int i) {
        this.f10566f = i;
        this.f10567g = i;
    }

    /* renamed from: f */
    public final void mo10981f(long j) {
        if (this.f10570j == 0) {
            this.f10568h = 0;
            return;
        }
        this.f10568h = this.f10572l[gb2.m13144N(this.f10571k, j, true, true)];
    }

    /* renamed from: g */
    public final boolean mo10982g(int i) {
        return this.f10562b == i || this.f10563c == i;
    }

    /* renamed from: h */
    public final boolean mo10983h(rn4 rn4) throws IOException {
        int i = this.f10567g;
        int a = i - this.f10561a.mo8819a(rn4, i, false);
        this.f10567g = a;
        boolean z = a == 0;
        if (z) {
            if (this.f10566f > 0) {
                this.f10561a.mo8824f(m14091j(this.f10568h), Arrays.binarySearch(this.f10572l, this.f10568h) >= 0 ? 1 : 0, this.f10566f, 0, (C2755q) null);
            }
            this.f10568h++;
        }
        return z;
    }
}
