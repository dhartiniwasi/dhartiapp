package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class f74 {

    /* renamed from: a */
    public final kg4 f9159a;

    /* renamed from: b */
    public final Object f9160b;

    /* renamed from: c */
    public final ci4[] f9161c;

    /* renamed from: d */
    public boolean f9162d;

    /* renamed from: e */
    public boolean f9163e;

    /* renamed from: f */
    public g74 f9164f;

    /* renamed from: g */
    public boolean f9165g;

    /* renamed from: h */
    private final boolean[] f9166h;

    /* renamed from: i */
    private final y74[] f9167i;

    /* renamed from: j */
    private final dk4 f9168j;

    /* renamed from: k */
    private final p74 f9169k;

    /* renamed from: l */
    private f74 f9170l;

    /* renamed from: m */
    private ki4 f9171m = ki4.f12114d;

    /* renamed from: n */
    private fk4 f9172n;

    /* renamed from: o */
    private long f9173o;

    public f74(y74[] y74Arr, long j, dk4 dk4, nk4 nk4, p74 p74, g74 g74, fk4 fk4, byte[] bArr) {
        g74 g742 = g74;
        this.f9167i = y74Arr;
        this.f9173o = j;
        this.f9168j = dk4;
        this.f9169k = p74;
        mg4 mg4 = g742.f9756a;
        this.f9160b = mg4.f12629a;
        this.f9164f = g742;
        this.f9172n = fk4;
        this.f9161c = new ci4[2];
        this.f9166h = new boolean[2];
        long j2 = g742.f9757b;
        long j3 = g742.f9759d;
        nk4 nk42 = nk4;
        kg4 o = p74.mo13160o(mg4, nk4, j2);
        this.f9159a = j3 != -9223372036854775807L ? new qf4(o, true, 0, j3) : o;
    }

    /* renamed from: s */
    private final void m12448s() {
        if (m12450u()) {
            int i = 0;
            while (true) {
                fk4 fk4 = this.f9172n;
                if (i < fk4.f9311a) {
                    fk4.mo10170b(i);
                    xj4 xj4 = this.f9172n.f9313c[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m12449t() {
        if (m12450u()) {
            int i = 0;
            while (true) {
                fk4 fk4 = this.f9172n;
                if (i < fk4.f9311a) {
                    fk4.mo10170b(i);
                    xj4 xj4 = this.f9172n.f9313c[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final boolean m12450u() {
        return this.f9170l == null;
    }

    /* renamed from: a */
    public final long mo10085a(fk4 fk4, long j, boolean z) {
        return mo10086b(fk4, j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo10086b(fk4 fk4, long j, boolean z, boolean[] zArr) {
        fk4 fk42 = fk4;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= fk42.f9311a) {
                break;
            }
            boolean[] zArr2 = this.f9166h;
            if (z || !fk4.mo10169a(this.f9172n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            y74[] y74Arr = this.f9167i;
            if (i2 >= 2) {
                break;
            }
            y74Arr[i2].mo13072d();
            i2++;
        }
        m12448s();
        this.f9172n = fk42;
        m12449t();
        long c = this.f9159a.mo8353c(fk42.f9313c, this.f9166h, this.f9161c, zArr, j);
        int i3 = 0;
        while (true) {
            y74[] y74Arr2 = this.f9167i;
            if (i3 >= 2) {
                break;
            }
            y74Arr2[i3].mo13072d();
            i3++;
        }
        this.f9163e = false;
        int i4 = 0;
        while (true) {
            ci4[] ci4Arr = this.f9161c;
            if (i4 >= 2) {
                return c;
            }
            if (ci4Arr[i4] != null) {
                v91.m22052f(fk4.mo10170b(i4));
                this.f9167i[i4].mo13072d();
                this.f9163e = true;
            } else {
                v91.m22052f(fk42.f9313c[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final long mo10087c() {
        if (!this.f9162d) {
            return this.f9164f.f9757b;
        }
        long d = this.f9163e ? this.f9159a.mo8354d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.f9164f.f9760e : d;
    }

    /* renamed from: d */
    public final long mo10088d() {
        if (!this.f9162d) {
            return 0;
        }
        return this.f9159a.mo8355e();
    }

    /* renamed from: e */
    public final long mo10089e() {
        return this.f9173o;
    }

    /* renamed from: f */
    public final long mo10090f() {
        return this.f9164f.f9757b + this.f9173o;
    }

    /* renamed from: g */
    public final f74 mo10091g() {
        return this.f9170l;
    }

    /* renamed from: h */
    public final ki4 mo10092h() {
        return this.f9171m;
    }

    /* renamed from: i */
    public final fk4 mo10093i() {
        return this.f9172n;
    }

    /* renamed from: j */
    public final fk4 mo10094j(float f, gt0 gt0) throws u44 {
        fk4 d = this.f9168j.mo8423d(this.f9167i, this.f9171m, this.f9164f.f9756a, gt0);
        for (xj4 xj4 : d.f9313c) {
        }
        return d;
    }

    /* renamed from: k */
    public final void mo10095k(long j) {
        v91.m22052f(m12450u());
        this.f9159a.mo8350a(j - this.f9173o);
    }

    /* renamed from: l */
    public final void mo10096l(float f, gt0 gt0) throws u44 {
        this.f9162d = true;
        this.f9171m = this.f9159a.mo8348U();
        fk4 j = mo10094j(f, gt0);
        g74 g74 = this.f9164f;
        long j2 = g74.f9757b;
        long j3 = g74.f9760e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0, j3 - 1);
        }
        long a = mo10085a(j, j2, false);
        long j4 = this.f9173o;
        g74 g742 = this.f9164f;
        this.f9173o = j4 + (g742.f9757b - a);
        this.f9164f = g742.mo10415b(a);
    }

    /* renamed from: m */
    public final void mo10097m(long j) {
        v91.m22052f(m12450u());
        if (this.f9162d) {
            this.f9159a.mo8361j0(j - this.f9173o);
        }
    }

    /* renamed from: n */
    public final void mo10098n() {
        m12448s();
        p74 p74 = this.f9169k;
        kg4 kg4 = this.f9159a;
        try {
            if (kg4 instanceof qf4) {
                p74.mo13153h(((qf4) kg4).f16361a);
            } else {
                p74.mo13153h(kg4);
            }
        } catch (RuntimeException e) {
            ot1.m18058c("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public final void mo10099o(f74 f74) {
        if (f74 != this.f9170l) {
            m12448s();
            this.f9170l = f74;
            m12449t();
        }
    }

    /* renamed from: p */
    public final void mo10100p(long j) {
        this.f9173o = 1000000000000L;
    }

    /* renamed from: q */
    public final void mo10101q() {
        kg4 kg4 = this.f9159a;
        if (kg4 instanceof qf4) {
            long j = this.f9164f.f9759d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((qf4) kg4).mo13530j(0, j);
        }
    }

    /* renamed from: r */
    public final boolean mo10102r() {
        return this.f9162d && (!this.f9163e || this.f9159a.mo8354d() == Long.MIN_VALUE);
    }
}
