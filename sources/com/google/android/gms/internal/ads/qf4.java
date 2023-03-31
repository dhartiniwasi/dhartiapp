package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qf4 implements kg4, jg4 {

    /* renamed from: a */
    public final kg4 f16361a;

    /* renamed from: b */
    private jg4 f16362b;

    /* renamed from: c */
    private pf4[] f16363c = new pf4[0];

    /* renamed from: d */
    private long f16364d = 0;

    /* renamed from: e */
    long f16365e;

    public qf4(kg4 kg4, boolean z, long j, long j2) {
        this.f16361a = kg4;
        this.f16365e = j2;
    }

    /* renamed from: U */
    public final ki4 mo8348U() {
        return this.f16361a.mo8348U();
    }

    /* renamed from: X */
    public final void mo8349X() throws IOException {
        this.f16361a.mo8349X();
    }

    /* renamed from: a */
    public final boolean mo8350a(long j) {
        return this.f16361a.mo8350a(j);
    }

    /* renamed from: b */
    public final long mo8351b() {
        if (mo13531k()) {
            long j = this.f16364d;
            this.f16364d = -9223372036854775807L;
            long b = mo8351b();
            return b != -9223372036854775807L ? b : j;
        }
        long b2 = this.f16361a.mo8351b();
        if (b2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        v91.m22052f(b2 >= 0);
        long j2 = this.f16365e;
        if (j2 == Long.MIN_VALUE || b2 <= j2) {
            z = true;
        }
        v91.m22052f(z);
        return b2;
    }

    /* renamed from: b0 */
    public final boolean mo8352b0() {
        return this.f16361a.mo8352b0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r4 > r7) goto L_0x005c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo8353c(com.google.android.gms.internal.ads.xj4[] r15, boolean[] r16, com.google.android.gms.internal.ads.ci4[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.pf4[] r3 = new com.google.android.gms.internal.ads.pf4[r2]
            r0.f16363c = r3
            com.google.android.gms.internal.ads.ci4[] r2 = new com.google.android.gms.internal.ads.ci4[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L_0x0021
            com.google.android.gms.internal.ads.pf4[] r5 = r0.f16363c
            r6 = r1[r4]
            com.google.android.gms.internal.ads.pf4 r6 = (com.google.android.gms.internal.ads.pf4) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.ci4 r11 = r6.f15850a
        L_0x001c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0021:
            com.google.android.gms.internal.ads.kg4 r4 = r0.f16361a
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.mo8353c(r5, r6, r7, r8, r9)
            boolean r6 = r14.mo13531k()
            r7 = 0
            if (r6 == 0) goto L_0x003d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            r9 = r7
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f16364d = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x005d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x005c
            long r7 = r0.f16365e
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x005d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.v91.m22052f(r6)
        L_0x0060:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0086
            r6 = r2[r3]
            if (r6 != 0) goto L_0x006c
            com.google.android.gms.internal.ads.pf4[] r6 = r0.f16363c
            r6[r3] = r11
            goto L_0x007d
        L_0x006c:
            com.google.android.gms.internal.ads.pf4[] r7 = r0.f16363c
            r8 = r7[r3]
            if (r8 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.ci4 r8 = r8.f15850a
            if (r8 == r6) goto L_0x007d
        L_0x0076:
            com.google.android.gms.internal.ads.pf4 r8 = new com.google.android.gms.internal.ads.pf4
            r8.<init>(r14, r6)
            r7[r3] = r8
        L_0x007d:
            com.google.android.gms.internal.ads.pf4[] r6 = r0.f16363c
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0060
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf4.mo8353c(com.google.android.gms.internal.ads.xj4[], boolean[], com.google.android.gms.internal.ads.ci4[], boolean[], long):long");
    }

    /* renamed from: d */
    public final long mo8354d() {
        long d = this.f16361a.mo8354d();
        if (d != Long.MIN_VALUE) {
            long j = this.f16365e;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public final long mo8355e() {
        long e = this.f16361a.mo8355e();
        if (e != Long.MIN_VALUE) {
            long j = this.f16365e;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: f */
    public final long mo8356f(long j, a84 a84) {
        if (j == 0) {
            return 0;
        }
        long b0 = gb2.m13160b0(a84.f6474a, 0, j);
        long j2 = a84.f6475b;
        long j3 = this.f16365e;
        long b02 = gb2.m13160b0(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (!(b0 == a84.f6474a && b02 == a84.f6475b)) {
            a84 = new a84(b0, b02);
        }
        return this.f16361a.mo8356f(j, a84);
    }

    /* renamed from: g */
    public final void mo8357g(long j, boolean z) {
        this.f16361a.mo8357g(j, false);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo8358h(fi4 fi4) {
        kg4 kg4 = (kg4) fi4;
        jg4 jg4 = this.f16362b;
        Objects.requireNonNull(jg4);
        jg4.mo8358h(this);
    }

    /* renamed from: i */
    public final void mo8359i(kg4 kg4) {
        jg4 jg4 = this.f16362b;
        Objects.requireNonNull(jg4);
        jg4.mo8359i(this);
    }

    /* renamed from: j */
    public final void mo13530j(long j, long j2) {
        this.f16365e = j2;
    }

    /* renamed from: j0 */
    public final void mo8361j0(long j) {
        this.f16361a.mo8361j0(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo13531k() {
        return this.f16364d != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r8) goto L_0x0036;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo8362l(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f16364d = r0
            com.google.android.gms.internal.ads.pf4[] r0 = r7.f16363c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo13272e()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.gms.internal.ads.kg4 r0 = r7.f16361a
            long r0 = r0.mo8362l(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0036
            long r8 = r7.f16365e
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            com.google.android.gms.internal.ads.v91.m22052f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf4.mo8362l(long):long");
    }

    /* renamed from: o */
    public final void mo8363o(jg4 jg4, long j) {
        this.f16362b = jg4;
        this.f16361a.mo8363o(this, j);
    }
}
