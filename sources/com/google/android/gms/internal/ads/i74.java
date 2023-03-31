package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class i74 {

    /* renamed from: a */
    private final dq0 f10649a = new dq0();

    /* renamed from: b */
    private final fs0 f10650b = new fs0();

    /* renamed from: c */
    private final l84 f10651c;

    /* renamed from: d */
    private final Handler f10652d;

    /* renamed from: e */
    private long f10653e;

    /* renamed from: f */
    private int f10654f;

    /* renamed from: g */
    private boolean f10655g;

    /* renamed from: h */
    private f74 f10656h;

    /* renamed from: i */
    private f74 f10657i;

    /* renamed from: j */
    private f74 f10658j;

    /* renamed from: k */
    private int f10659k;

    /* renamed from: l */
    private Object f10660l;

    /* renamed from: m */
    private long f10661m;

    public i74(l84 l84, Handler handler) {
        this.f10651c = l84;
        this.f10652d = handler;
    }

    /* renamed from: A */
    private static mg4 m14190A(gt0 gt0, Object obj, long j, long j2, fs0 fs0, dq0 dq0) {
        gt0.mo10608n(obj, dq0);
        gt0.mo8903e(dq0.f8361c, fs0, 0);
        gt0.mo8899a(obj);
        if (dq0.f8362d == 0) {
            dq0.mo9651b();
        }
        gt0.mo10608n(obj, dq0);
        int d = dq0.mo9653d(j);
        if (d == -1) {
            return new mg4(obj, j2, dq0.mo9652c(j));
        }
        return new mg4(obj, d, dq0.mo9654e(d), j2);
    }

    /* renamed from: B */
    private final void m14191B() {
        mg4 mg4;
        ra3 q = ua3.m21502q();
        for (f74 f74 = this.f10656h; f74 != null; f74 = f74.mo10091g()) {
            q.mo13701f(f74.f9164f.f9756a);
        }
        f74 f742 = this.f10657i;
        if (f742 == null) {
            mg4 = null;
        } else {
            mg4 = f742.f9164f.f9756a;
        }
        this.f10652d.post(new h74(this, q, mg4));
    }

    /* renamed from: C */
    private final boolean m14192C(gt0 gt0, mg4 mg4, boolean z) {
        int a = gt0.mo8899a(mg4.f12629a);
        if (!gt0.mo8903e(gt0.mo8902d(a, this.f10649a, false).f8361c, this.f10650b, 0).f9432g) {
            if (gt0.mo10640i(a, this.f10649a, this.f10650b, this.f10654f, this.f10655g) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m14193a(gt0 gt0, mg4 mg4) {
        if (!m14195c(mg4)) {
            return false;
        }
        int i = gt0.mo10608n(mg4.f12629a, this.f10649a).f8361c;
        if (gt0.mo8903e(i, this.f10650b, 0).f9439n == gt0.mo8899a(mg4.f12629a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m14194b(gt0 gt0) {
        f74 f74 = this.f10656h;
        if (f74 == null) {
            return true;
        }
        int a = gt0.mo8899a(f74.f9160b);
        while (true) {
            a = gt0.mo10640i(a, this.f10649a, this.f10650b, this.f10654f, this.f10655g);
            while (f74.mo10091g() != null && !f74.f9164f.f9762g) {
                f74 = f74.mo10091g();
            }
            f74 g = f74.mo10091g();
            if (a == -1 || g == null || gt0.mo8899a(g.f9160b) != a) {
                boolean p = mo11044p(f74);
                f74.f9164f = mo11038j(gt0, f74.f9164f);
            } else {
                f74 = g;
            }
        }
        boolean p2 = mo11044p(f74);
        f74.f9164f = mo11038j(gt0, f74.f9164f);
        if (!p2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m14195c(mg4 mg4) {
        return !mg4.mo11883b() && mg4.f12633e == -1;
    }

    /* renamed from: v */
    private final long m14196v(gt0 gt0, Object obj, int i) {
        gt0.mo10608n(obj, this.f10649a);
        this.f10649a.mo9658h(i);
        this.f10649a.mo9661j(i);
        return 0;
    }

    /* renamed from: w */
    private final g74 m14197w(gt0 gt0, f74 f74, long j) {
        long j2;
        gt0 gt02 = gt0;
        g74 g74 = f74.f9164f;
        long e = (f74.mo10089e() + g74.f9760e) - j;
        if (g74.f9762g) {
            long j3 = 0;
            int i = gt0.mo10640i(gt02.mo8899a(g74.f9756a.f12629a), this.f10649a, this.f10650b, this.f10654f, this.f10655g);
            if (i == -1) {
                return null;
            }
            int i2 = gt02.mo8902d(i, this.f10649a, true).f8361c;
            Object obj = this.f10649a.f8360b;
            Objects.requireNonNull(obj);
            long j4 = g74.f9756a.f12632d;
            if (gt02.mo8903e(i2, this.f10650b, 0).f9438m == i) {
                Pair m = gt0.mo10642m(this.f10650b, this.f10649a, i2, -9223372036854775807L, Math.max(0, e));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                f74 g = f74.mo10091g();
                if (g == null || !g.f9160b.equals(obj)) {
                    j4 = this.f10653e;
                    this.f10653e = 1 + j4;
                } else {
                    j4 = g.f9164f.f9756a.f12632d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            mg4 A = m14190A(gt0, obj, j2, j4, this.f10650b, this.f10649a);
            if (!(j3 == -9223372036854775807L || g74.f9758c == -9223372036854775807L)) {
                gt02.mo10608n(g74.f9756a.f12629a, this.f10649a).mo9651b();
            }
            return m14198x(gt0, A, j3, j2);
        }
        mg4 mg4 = g74.f9756a;
        gt02.mo10608n(mg4.f12629a, this.f10649a);
        if (mg4.mo11883b()) {
            int i3 = mg4.f12630b;
            if (this.f10649a.mo9650a(i3) == -1) {
                return null;
            }
            int f = this.f10649a.mo9656f(i3, mg4.f12631c);
            if (f < 0) {
                return m14199y(gt0, mg4.f12629a, i3, f, g74.f9758c, mg4.f12632d);
            }
            long j5 = g74.f9758c;
            if (j5 == -9223372036854775807L) {
                fs0 fs0 = this.f10650b;
                dq0 dq0 = this.f10649a;
                Pair m2 = gt0.mo10642m(fs0, dq0, dq0.f8361c, -9223372036854775807L, Math.max(0, e));
                if (m2 == null) {
                    return null;
                }
                j5 = ((Long) m2.second).longValue();
            }
            m14196v(gt02, mg4.f12629a, mg4.f12630b);
            return m14200z(gt0, mg4.f12629a, Math.max(0, j5), g74.f9758c, mg4.f12632d);
        }
        int e2 = this.f10649a.mo9654e(mg4.f12633e);
        this.f10649a.mo9663l(mg4.f12633e);
        if (e2 != this.f10649a.mo9650a(mg4.f12633e)) {
            return m14199y(gt0, mg4.f12629a, mg4.f12633e, e2, g74.f9760e, mg4.f12632d);
        }
        m14196v(gt02, mg4.f12629a, mg4.f12633e);
        return m14200z(gt0, mg4.f12629a, 0, g74.f9760e, mg4.f12632d);
    }

    /* renamed from: x */
    private final g74 m14198x(gt0 gt0, mg4 mg4, long j, long j2) {
        mg4 mg42 = mg4;
        gt0 gt02 = gt0;
        gt0.mo10608n(mg42.f12629a, this.f10649a);
        if (mg4.mo11883b()) {
            return m14199y(gt0, mg42.f12629a, mg42.f12630b, mg42.f12631c, j, mg42.f12632d);
        }
        return m14200z(gt0, mg42.f12629a, j2, j, mg42.f12632d);
    }

    /* renamed from: y */
    private final g74 m14199y(gt0 gt0, Object obj, int i, int i2, long j, long j2) {
        mg4 mg4 = new mg4(obj, i, i2, j2);
        long g = gt0.mo10608n(mg4.f12629a, this.f10649a).mo9657g(mg4.f12630b, mg4.f12631c);
        if (i2 == this.f10649a.mo9654e(i)) {
            this.f10649a.mo9660i();
        }
        this.f10649a.mo9663l(mg4.f12630b);
        long j3 = 0;
        if (g != -9223372036854775807L && g <= 0) {
            j3 = Math.max(0, -1 + g);
        }
        return new g74(mg4, j3, j, -9223372036854775807L, g, false, false, false, false);
    }

    /* renamed from: z */
    private final g74 m14200z(gt0 gt0, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        gt0 gt02 = gt0;
        Object obj2 = obj;
        long j7 = j;
        gt02.mo10608n(obj2, this.f10649a);
        int c = this.f10649a.mo9652c(j7);
        if (c == -1) {
            this.f10649a.mo9651b();
        } else {
            this.f10649a.mo9663l(c);
        }
        mg4 mg4 = new mg4(obj2, j3, c);
        boolean c2 = m14195c(mg4);
        boolean a = m14193a(gt02, mg4);
        boolean C = m14192C(gt02, mg4, c2);
        if (c != -1) {
            this.f10649a.mo9663l(c);
        }
        if (c != -1) {
            this.f10649a.mo9658h(c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.f10649a.f8362d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new g74(mg4, j7, j2, j6, j5, false, c2, a, C);
    }

    /* renamed from: d */
    public final f74 mo11032d() {
        f74 f74 = this.f10656h;
        if (f74 == null) {
            return null;
        }
        if (f74 == this.f10657i) {
            this.f10657i = f74.mo10091g();
        }
        f74.mo10098n();
        int i = this.f10659k - 1;
        this.f10659k = i;
        if (i == 0) {
            this.f10658j = null;
            f74 f742 = this.f10656h;
            this.f10660l = f742.f9160b;
            this.f10661m = f742.f9164f.f9756a.f12632d;
        }
        this.f10656h = this.f10656h.mo10091g();
        m14191B();
        return this.f10656h;
    }

    /* renamed from: e */
    public final f74 mo11033e() {
        f74 f74 = this.f10657i;
        boolean z = false;
        if (!(f74 == null || f74.mo10091g() == null)) {
            z = true;
        }
        v91.m22052f(z);
        this.f10657i = this.f10657i.mo10091g();
        m14191B();
        return this.f10657i;
    }

    /* renamed from: f */
    public final f74 mo11034f() {
        return this.f10658j;
    }

    /* renamed from: g */
    public final f74 mo11035g() {
        return this.f10656h;
    }

    /* renamed from: h */
    public final f74 mo11036h() {
        return this.f10657i;
    }

    /* renamed from: i */
    public final g74 mo11037i(long j, q74 q74) {
        f74 f74 = this.f10658j;
        if (f74 != null) {
            return m14197w(q74.f16234a, f74, j);
        }
        return m14198x(q74.f16234a, q74.f16235b, q74.f16236c, q74.f16251r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.g74 mo11038j(com.google.android.gms.internal.ads.gt0 r19, com.google.android.gms.internal.ads.g74 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.mg4 r3 = r2.f9756a
            boolean r12 = m14195c(r3)
            boolean r13 = r0.m14193a(r1, r3)
            boolean r14 = r0.m14192C(r1, r3, r12)
            com.google.android.gms.internal.ads.mg4 r4 = r2.f9756a
            java.lang.Object r4 = r4.f12629a
            com.google.android.gms.internal.ads.dq0 r5 = r0.f10649a
            r1.mo10608n(r4, r5)
            boolean r1 = r3.mo11883b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.f12633e
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.dq0 r9 = r0.f10649a
            r9.mo9658h(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.mo11883b()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.dq0 r1 = r0.f10649a
            int r5 = r3.f12630b
            int r6 = r3.f12631c
            long r5 = r1.mo9657g(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.dq0 r1 = r0.f10649a
            long r5 = r1.f8362d
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.mo11883b()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.dq0 r1 = r0.f10649a
            int r4 = r3.f12630b
            r1.mo9663l(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.f12633e
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.dq0 r4 = r0.f10649a
            r4.mo9663l(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.g74 r15 = new com.google.android.gms.internal.ads.g74
            long r4 = r2.f9757b
            long r1 = r2.f9758c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i74.mo11038j(com.google.android.gms.internal.ads.gt0, com.google.android.gms.internal.ads.g74):com.google.android.gms.internal.ads.g74");
    }

    /* renamed from: k */
    public final mg4 mo11039k(gt0 gt0, Object obj, long j) {
        long j2;
        int a;
        int i = gt0.mo10608n(obj, this.f10649a).f8361c;
        Object obj2 = this.f10660l;
        if (obj2 == null || (a = gt0.mo8899a(obj2)) == -1 || gt0.mo8902d(a, this.f10649a, false).f8361c != i) {
            f74 f74 = this.f10656h;
            while (true) {
                if (f74 == null) {
                    f74 f742 = this.f10656h;
                    while (true) {
                        if (f742 != null) {
                            int a2 = gt0.mo8899a(f742.f9160b);
                            if (a2 != -1 && gt0.mo8902d(a2, this.f10649a, false).f8361c == i) {
                                j2 = f742.f9164f.f9756a.f12632d;
                                break;
                            }
                            f742 = f742.mo10091g();
                        } else {
                            j2 = this.f10653e;
                            this.f10653e = 1 + j2;
                            if (this.f10656h == null) {
                                this.f10660l = obj;
                                this.f10661m = j2;
                            }
                        }
                    }
                } else if (f74.f9160b.equals(obj)) {
                    j2 = f74.f9164f.f9756a.f12632d;
                    break;
                } else {
                    f74 = f74.mo10091g();
                }
            }
        } else {
            j2 = this.f10661m;
        }
        long j3 = j2;
        gt0.mo10608n(obj, this.f10649a);
        gt0.mo8903e(this.f10649a.f8361c, this.f10650b, 0);
        int a3 = gt0.mo8899a(obj);
        Object obj3 = obj;
        while (true) {
            fs0 fs0 = this.f10650b;
            if (a3 < fs0.f9438m) {
                return m14190A(gt0, obj3, j, j3, fs0, this.f10649a);
            }
            gt0.mo8902d(a3, this.f10649a, true);
            this.f10649a.mo9651b();
            dq0 dq0 = this.f10649a;
            if (dq0.mo9653d(dq0.f8362d) != -1) {
                obj3 = this.f10649a.f8360b;
                Objects.requireNonNull(obj3);
            }
            a3--;
        }
    }

    /* renamed from: l */
    public final void mo11040l() {
        if (this.f10659k != 0) {
            f74 f74 = this.f10656h;
            v91.m22048b(f74);
            this.f10660l = f74.f9160b;
            this.f10661m = f74.f9164f.f9756a.f12632d;
            while (f74 != null) {
                f74.mo10098n();
                f74 = f74.mo10091g();
            }
            this.f10656h = null;
            this.f10658j = null;
            this.f10657i = null;
            this.f10659k = 0;
            m14191B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo11041m(ra3 ra3, mg4 mg4) {
        this.f10651c.mo11931s(ra3.mo13703h(), mg4);
    }

    /* renamed from: n */
    public final void mo11042n(long j) {
        f74 f74 = this.f10658j;
        if (f74 != null) {
            f74.mo10097m(j);
        }
    }

    /* renamed from: o */
    public final boolean mo11043o(kg4 kg4) {
        f74 f74 = this.f10658j;
        return f74 != null && f74.f9159a == kg4;
    }

    /* renamed from: p */
    public final boolean mo11044p(f74 f74) {
        boolean z = false;
        v91.m22052f(f74 != null);
        if (f74.equals(this.f10658j)) {
            return false;
        }
        this.f10658j = f74;
        while (f74.mo10091g() != null) {
            f74 = f74.mo10091g();
            if (f74 == this.f10657i) {
                this.f10657i = this.f10656h;
                z = true;
            }
            f74.mo10098n();
            this.f10659k--;
        }
        this.f10658j.mo10099o((f74) null);
        m14191B();
        return z;
    }

    /* renamed from: q */
    public final boolean mo11045q() {
        f74 f74 = this.f10658j;
        if (f74 != null) {
            return !f74.f9164f.f9764i && f74.mo10102r() && this.f10658j.f9164f.f9760e != -9223372036854775807L && this.f10659k < 100;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo11046r(gt0 gt0, long j, long j2) {
        g74 g74;
        long j3;
        boolean z;
        gt0 gt02 = gt0;
        f74 f74 = this.f10656h;
        f74 f742 = null;
        while (f74 != null) {
            g74 g742 = f74.f9164f;
            if (f742 == null) {
                g74 = mo11038j(gt02, g742);
                long j4 = j;
            } else {
                g74 w = m14197w(gt02, f742, j);
                if (w == null) {
                    return !mo11044p(f742);
                }
                if (g742.f9757b != w.f9757b || !g742.f9756a.equals(w.f9756a)) {
                    return !mo11044p(f742);
                }
                g74 = w;
            }
            f74.f9164f = g74.mo10414a(g742.f9758c);
            long j5 = g742.f9760e;
            long j6 = g74.f9760e;
            if (j5 == -9223372036854775807L || j5 == j6) {
                f742 = f74;
                f74 = f74.mo10091g();
            } else {
                f74.mo10101q();
                long j7 = g74.f9760e;
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j7 + f74.mo10089e();
                }
                if (f74 == this.f10657i) {
                    boolean z2 = f74.f9164f.f9761f;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return mo11044p(f74) && !z;
                    }
                }
                z = false;
                if (mo11044p(f74)) {
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo11047s(gt0 gt0, int i) {
        this.f10654f = i;
        return m14194b(gt0);
    }

    /* renamed from: t */
    public final boolean mo11048t(gt0 gt0, boolean z) {
        this.f10655g = z;
        return m14194b(gt0);
    }

    /* renamed from: u */
    public final f74 mo11049u(y74[] y74Arr, dk4 dk4, nk4 nk4, p74 p74, g74 g74, fk4 fk4) {
        long j;
        f74 f74 = this.f10658j;
        if (f74 == null) {
            j = 1000000000000L;
            g74 g742 = g74;
        } else {
            j = (f74.mo10089e() + f74.f9164f.f9760e) - g74.f9757b;
        }
        f74 f742 = new f74(y74Arr, j, dk4, nk4, p74, g74, fk4, (byte[]) null);
        f74 f743 = this.f10658j;
        if (f743 != null) {
            f743.mo10099o(f742);
        } else {
            this.f10656h = f742;
            this.f10657i = f742;
        }
        this.f10660l = null;
        this.f10658j = f742;
        this.f10659k++;
        m14191B();
        return f742;
    }
}
