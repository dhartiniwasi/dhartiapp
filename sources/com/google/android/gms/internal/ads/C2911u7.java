package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2911u7 implements qn4 {

    /* renamed from: q */
    public static final xn4 f18418q = C2800r7.f16856b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List f18419a;

    /* renamed from: b */
    private final y22 f18420b;

    /* renamed from: c */
    private final SparseIntArray f18421c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3022x7 f18422d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray f18423e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseBooleanArray f18424f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f18425g;

    /* renamed from: h */
    private final C2763q7 f18426h;

    /* renamed from: i */
    private C2725p7 f18427i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public tn4 f18428j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f18429k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f18430l;

    /* renamed from: m */
    private boolean f18431m;

    /* renamed from: n */
    private boolean f18432n;

    /* renamed from: o */
    private int f18433o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f18434p;

    public C2911u7(int i) {
        this(1, 0, 112800);
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        byte[] h = this.f18420b.mo15295h();
        fn4 fn4 = (fn4) rn4;
        fn4.mo9986i(h, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (h[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            fn4.mo10218n(i, false);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f18428j = tn4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        if (r1 == false) goto L_0x0196;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r19, com.google.android.gms.internal.ads.C2532k r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.mo9005b()
            boolean r3 = r0.f18430l
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x009e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.q7 r3 = r0.f18426h
            boolean r4 = r3.mo13485d()
            if (r4 == 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            int r4 = r0.f18434p
            int r1 = r3.mo13482a(r1, r2, r4)
            return r1
        L_0x0026:
            boolean r3 = r0.f18431m
            r7 = 0
            if (r3 != 0) goto L_0x0075
            r0.f18431m = r15
            com.google.android.gms.internal.ads.q7 r3 = r0.f18426h
            long r4 = r3.mo13483b()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.p7 r9 = new com.google.android.gms.internal.ads.p7
            com.google.android.gms.internal.ads.e92 r4 = r3.mo13484c()
            long r5 = r3.mo13483b()
            int r3 = r0.f18434p
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.f18427i = r15
            com.google.android.gms.internal.ads.tn4 r3 = r0.f18428j
            com.google.android.gms.internal.ads.n r4 = r15.mo8894b()
            r3.mo10059j(r4)
            goto L_0x0076
        L_0x0065:
            r13 = r7
            com.google.android.gms.internal.ads.tn4 r4 = r0.f18428j
            com.google.android.gms.internal.ads.m r5 = new com.google.android.gms.internal.ads.m
            long r6 = r3.mo13483b()
            r5.<init>(r6, r13)
            r4.mo10059j(r5)
            goto L_0x0076
        L_0x0075:
            r13 = r7
        L_0x0076:
            boolean r3 = r0.f18432n
            if (r3 == 0) goto L_0x008d
            r3 = 0
            r0.f18432n = r3
            r0.mo9026g(r13, r13)
            long r4 = r19.mo9003T()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r2.f11852a = r13
            r1 = 1
            return r1
        L_0x008d:
            r3 = 0
        L_0x008e:
            com.google.android.gms.internal.ads.p7 r4 = r0.f18427i
            if (r4 == 0) goto L_0x009f
            boolean r5 = r4.mo8897e()
            if (r5 != 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            int r1 = r4.mo8893a(r1, r2)
            return r1
        L_0x009e:
            r3 = 0
        L_0x009f:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18420b
            byte[] r4 = r2.mo15295h()
            int r5 = r2.mo15298k()
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 < r6) goto L_0x00b0
            goto L_0x00c2
        L_0x00b0:
            int r5 = r2.mo15296i()
            if (r5 <= 0) goto L_0x00bd
            int r2 = r2.mo15298k()
            java.lang.System.arraycopy(r4, r2, r4, r3, r5)
        L_0x00bd:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18420b
            r2.mo15291d(r4, r5)
        L_0x00c2:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18420b
            int r5 = r2.mo15296i()
            r7 = -1
            if (r5 >= r6) goto L_0x00df
            int r2 = r2.mo15299l()
            int r5 = 9400 - r2
            int r5 = r1.mo8792c(r4, r2, r5)
            if (r5 != r7) goto L_0x00d8
            return r7
        L_0x00d8:
            com.google.android.gms.internal.ads.y22 r7 = r0.f18420b
            int r2 = r2 + r5
            r7.mo15292e(r2)
            goto L_0x00c2
        L_0x00df:
            int r1 = r2.mo15298k()
            int r4 = r2.mo15299l()
            byte[] r2 = r2.mo15295h()
            int r2 = com.google.android.gms.internal.ads.C2169a8.m9631a(r2, r1, r4)
            com.google.android.gms.internal.ads.y22 r5 = r0.f18420b
            r5.mo15293f(r2)
            int r5 = r2 + 188
            if (r5 <= r4) goto L_0x00ff
            int r4 = r0.f18433o
            int r2 = r2 - r1
            int r4 = r4 + r2
            r0.f18433o = r4
            goto L_0x0101
        L_0x00ff:
            r0.f18433o = r3
        L_0x0101:
            com.google.android.gms.internal.ads.y22 r1 = r0.f18420b
            int r2 = r1.mo15299l()
            if (r5 <= r2) goto L_0x010a
            return r3
        L_0x010a:
            int r1 = r1.mo15300m()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.y22 r1 = r0.f18420b
            r1.mo15293f(r5)
            return r3
        L_0x0119:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0120
            r10 = 1
            goto L_0x0121
        L_0x0120:
            r10 = 0
        L_0x0121:
            int r4 = r1 >> 8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r1 & 32
            r8 = r1 & 16
            if (r8 == 0) goto L_0x0134
            android.util.SparseArray r8 = r0.f18423e
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.z7 r8 = (com.google.android.gms.internal.ads.C3096z7) r8
            goto L_0x0135
        L_0x0134:
            r8 = 0
        L_0x0135:
            if (r8 != 0) goto L_0x013d
            com.google.android.gms.internal.ads.y22 r1 = r0.f18420b
            r1.mo15293f(r5)
            return r3
        L_0x013d:
            r1 = r1 & 15
            android.util.SparseIntArray r9 = r0.f18421c
            int r13 = r1 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.f18421c
            r13.put(r4, r1)
            if (r9 != r1) goto L_0x0154
            com.google.android.gms.internal.ads.y22 r1 = r0.f18420b
            r1.mo15293f(r5)
            return r3
        L_0x0154:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r1 == r9) goto L_0x015d
            r8.mo9031e()
        L_0x015d:
            if (r6 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.y22 r1 = r0.f18420b
            int r1 = r1.mo15306s()
            com.google.android.gms.internal.ads.y22 r6 = r0.f18420b
            int r6 = r6.mo15306s()
            r6 = r6 & 64
            if (r6 == 0) goto L_0x0171
            r6 = 2
            goto L_0x0172
        L_0x0171:
            r6 = 0
        L_0x0172:
            r10 = r10 | r6
            com.google.android.gms.internal.ads.y22 r6 = r0.f18420b
            int r1 = r1 + r7
            r6.mo15294g(r1)
        L_0x0179:
            boolean r1 = r0.f18430l
            if (r1 != 0) goto L_0x0185
            android.util.SparseBooleanArray r6 = r0.f18425g
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x0196
        L_0x0185:
            com.google.android.gms.internal.ads.y22 r4 = r0.f18420b
            r4.mo15292e(r5)
            com.google.android.gms.internal.ads.y22 r4 = r0.f18420b
            r8.mo9030b(r4, r10)
            com.google.android.gms.internal.ads.y22 r4 = r0.f18420b
            r4.mo15292e(r2)
            if (r1 != 0) goto L_0x01a3
        L_0x0196:
            boolean r1 = r0.f18430l
            if (r1 == 0) goto L_0x01a3
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            r1 = 1
            r0.f18432n = r1
        L_0x01a3:
            com.google.android.gms.internal.ads.y22 r1 = r0.f18420b
            r1.mo15293f(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2911u7.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        C2725p7 p7Var;
        int size = this.f18419a.size();
        for (int i = 0; i < size; i++) {
            e92 e92 = (e92) this.f18419a.get(i);
            if (e92.mo9835e() != -9223372036854775807L) {
                long c = e92.mo9833c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            e92.mo9836f(j2);
        }
        if (!(j2 == 0 || (p7Var = this.f18427i) == null)) {
            p7Var.mo8896d(j2);
        }
        this.f18420b.mo15290c(0);
        this.f18421c.clear();
        for (int i2 = 0; i2 < this.f18423e.size(); i2++) {
            ((C3096z7) this.f18423e.valueAt(i2)).mo9031e();
        }
        this.f18433o = 0;
    }

    public C2911u7(int i, int i2, int i3) {
        e92 e92 = new e92(0);
        this.f18422d = new C2427h6(0);
        this.f18419a = Collections.singletonList(e92);
        this.f18420b = new y22(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f18424f = sparseBooleanArray;
        this.f18425g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f18423e = sparseArray;
        this.f18421c = new SparseIntArray();
        this.f18426h = new C2763q7(112800);
        this.f18428j = tn4.f18174k;
        this.f18434p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f18423e.put(sparseArray2.keyAt(i4), (C3096z7) sparseArray2.valueAt(i4));
        }
        this.f18423e.put(0, new C2614m7(new C2837s7(this)));
    }
}
