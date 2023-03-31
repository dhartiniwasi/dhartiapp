package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.k7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2540k7 implements qn4 {

    /* renamed from: l */
    public static final xn4 f11935l = C2428h7.f10215b;

    /* renamed from: a */
    private final e92 f11936a = new e92(0);

    /* renamed from: b */
    private final SparseArray f11937b = new SparseArray();

    /* renamed from: c */
    private final y22 f11938c = new y22(4096);

    /* renamed from: d */
    private final C2391g7 f11939d = new C2391g7();

    /* renamed from: e */
    private boolean f11940e;

    /* renamed from: f */
    private boolean f11941f;

    /* renamed from: g */
    private boolean f11942g;

    /* renamed from: h */
    private long f11943h;

    /* renamed from: i */
    private C2353f7 f11944i;

    /* renamed from: j */
    private tn4 f11945j;

    /* renamed from: k */
    private boolean f11946k;

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        byte[] bArr = new byte[14];
        fn4 fn4 = (fn4) rn4;
        fn4.mo9986i(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        fn4.mo10217m(bArr[13] & 7, false);
        fn4.mo9986i(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f11945j = tn4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r17, com.google.android.gms.internal.ads.C2532k r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.gms.internal.ads.tn4 r3 = r0.f11945j
            com.google.android.gms.internal.ads.v91.m22048b(r3)
            long r10 = r17.mo9005b()
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.g7 r4 = r0.f11939d
            boolean r5 = r4.mo10405e()
            if (r5 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r4.mo10402a(r1, r2)
            return r1
        L_0x0023:
            boolean r4 = r0.f11946k
            r14 = 1
            if (r4 != 0) goto L_0x0064
            r0.f11946k = r14
            com.google.android.gms.internal.ads.g7 r4 = r0.f11939d
            long r5 = r4.mo10403b()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.f7 r15 = new com.google.android.gms.internal.ads.f7
            com.google.android.gms.internal.ads.e92 r5 = r4.mo10404d()
            long r6 = r4.mo10403b()
            r4 = r15
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.f11944i = r15
            com.google.android.gms.internal.ads.tn4 r4 = r0.f11945j
            com.google.android.gms.internal.ads.n r5 = r15.mo8894b()
            r4.mo10059j(r5)
            goto L_0x0064
        L_0x0054:
            com.google.android.gms.internal.ads.tn4 r5 = r0.f11945j
            com.google.android.gms.internal.ads.m r6 = new com.google.android.gms.internal.ads.m
            long r7 = r4.mo10403b()
            r14 = 0
            r6.<init>(r7, r14)
            r5.mo10059j(r6)
        L_0x0064:
            com.google.android.gms.internal.ads.f7 r5 = r0.f11944i
            if (r5 == 0) goto L_0x0074
            boolean r6 = r5.mo8897e()
            if (r6 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            int r1 = r5.mo8893a(r1, r2)
            return r1
        L_0x0074:
            r17.mo9981W()
            if (r3 == 0) goto L_0x007f
            long r2 = r17.mo9004a()
            long r10 = r10 - r2
            goto L_0x0080
        L_0x007f:
            r10 = r12
        L_0x0080:
            r2 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008d
            r5 = 4
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r2
        L_0x008d:
            com.google.android.gms.internal.ads.y22 r3 = r0.f11938c
            byte[] r3 = r3.mo15295h()
            r5 = 4
            r6 = 0
            r4 = 1
            boolean r3 = r1.mo9986i(r3, r6, r5, r4)
            if (r3 != 0) goto L_0x009d
            return r2
        L_0x009d:
            com.google.android.gms.internal.ads.y22 r3 = r0.f11938c
            r3.mo15293f(r6)
            com.google.android.gms.internal.ads.y22 r3 = r0.f11938c
            int r3 = r3.mo15300m()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r3 != r5) goto L_0x00ad
            return r2
        L_0x00ad:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r3 != r2) goto L_0x00d3
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            byte[] r2 = r2.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r3 = 10
            r1.mo9986i(r2, r6, r3, r6)
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            r3 = 9
            r2.mo15293f(r3)
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            int r2 = r2.mo15306s()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.mo10218n(r2, r6)
            return r6
        L_0x00d3:
            r2 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r7 = 6
            if (r3 != r2) goto L_0x00f4
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            byte[] r2 = r2.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9986i(r2, r6, r5, r6)
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            r2.mo15293f(r6)
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            int r2 = r2.mo15310w()
            int r2 = r2 + r7
            r1.mo10218n(r2, r6)
            return r6
        L_0x00f4:
            int r2 = r3 >> 8
            r4 = 1
            if (r2 == r4) goto L_0x00ff
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo10218n(r4, r6)
            return r6
        L_0x00ff:
            r2 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r3 = r0.f11937b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.i7 r3 = (com.google.android.gms.internal.ads.C2465i7) r3
            boolean r8 = r0.f11940e
            if (r8 != 0) goto L_0x0189
            if (r3 != 0) goto L_0x0169
            r8 = 189(0xbd, float:2.65E-43)
            r9 = 0
            if (r2 != r8) goto L_0x0124
            com.google.android.gms.internal.ads.a6 r8 = new com.google.android.gms.internal.ads.a6
            r8.<init>(r9)
            r4 = 1
            r0.f11941f = r4
            long r9 = r17.mo9003T()
            r0.f11943h = r9
        L_0x0122:
            r9 = r8
            goto L_0x014d
        L_0x0124:
            r4 = 1
            r8 = r2 & 224(0xe0, float:3.14E-43)
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x0139
            com.google.android.gms.internal.ads.z6 r8 = new com.google.android.gms.internal.ads.z6
            r8.<init>(r9)
            r0.f11941f = r4
            long r9 = r17.mo9003T()
            r0.f11943h = r9
            goto L_0x0122
        L_0x0139:
            r8 = r2 & 240(0xf0, float:3.36E-43)
            r10 = 224(0xe0, float:3.14E-43)
            if (r8 != r10) goto L_0x014d
            com.google.android.gms.internal.ads.n6 r8 = new com.google.android.gms.internal.ads.n6
            r8.<init>(r9)
            r0.f11942g = r4
            long r9 = r17.mo9003T()
            r0.f11943h = r9
            goto L_0x0122
        L_0x014d:
            if (r9 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.y7 r3 = new com.google.android.gms.internal.ads.y7
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r8, r2, r10)
            com.google.android.gms.internal.ads.tn4 r8 = r0.f11945j
            r9.mo8217c(r8, r3)
            com.google.android.gms.internal.ads.i7 r3 = new com.google.android.gms.internal.ads.i7
            com.google.android.gms.internal.ads.e92 r8 = r0.f11936a
            r3.<init>(r9, r8)
            android.util.SparseArray r8 = r0.f11937b
            r8.put(r2, r3)
        L_0x0169:
            boolean r2 = r0.f11941f
            r8 = 1048576(0x100000, double:5.180654E-318)
            if (r2 == 0) goto L_0x0179
            boolean r2 = r0.f11942g
            if (r2 == 0) goto L_0x0179
            long r8 = r0.f11943h
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r8 + r10
        L_0x0179:
            long r10 = r17.mo9003T()
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0189
            r2 = 1
            r0.f11940e = r2
            com.google.android.gms.internal.ads.tn4 r2 = r0.f11945j
            r2.mo10058C()
        L_0x0189:
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            byte[] r2 = r2.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9986i(r2, r6, r5, r6)
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            r2.mo15293f(r6)
            com.google.android.gms.internal.ads.y22 r2 = r0.f11938c
            int r2 = r2.mo15310w()
            int r2 = r2 + r7
            if (r3 != 0) goto L_0x01a6
            r1.mo10218n(r2, r6)
            goto L_0x01c7
        L_0x01a6:
            com.google.android.gms.internal.ads.y22 r4 = r0.f11938c
            r4.mo15290c(r2)
            com.google.android.gms.internal.ads.y22 r4 = r0.f11938c
            byte[] r4 = r4.mo15295h()
            r1.mo9984g(r4, r6, r2, r6)
            com.google.android.gms.internal.ads.y22 r1 = r0.f11938c
            r1.mo15293f(r7)
            com.google.android.gms.internal.ads.y22 r1 = r0.f11938c
            r3.mo11028a(r1)
            com.google.android.gms.internal.ads.y22 r1 = r0.f11938c
            int r2 = r1.mo15297j()
            r1.mo15292e(r2)
        L_0x01c7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2540k7.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r7) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[LOOP:0: B:12:0x002c->B:14:0x0034, LOOP_END] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9026g(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.e92 r5 = r4.f11936a
            long r0 = r5.mo9835e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r0 = r5.mo9833c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r5.mo9836f(r7)
        L_0x0024:
            com.google.android.gms.internal.ads.f7 r5 = r4.f11944i
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r5.mo8896d(r7)
        L_0x002c:
            android.util.SparseArray r5 = r4.f11937b
            int r5 = r5.size()
            if (r6 >= r5) goto L_0x0042
            android.util.SparseArray r5 = r4.f11937b
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.i7 r5 = (com.google.android.gms.internal.ads.C2465i7) r5
            r5.mo11029b()
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2540k7.mo9026g(long, long):void");
    }
}
