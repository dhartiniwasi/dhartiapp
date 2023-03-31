package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.il */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2480il {

    /* renamed from: a */
    private final byte[] f10835a = new byte[8];

    /* renamed from: b */
    private final Stack f10836b = new Stack();

    /* renamed from: c */
    private final C2777ql f10837c = new C2777ql();

    /* renamed from: d */
    private int f10838d;

    /* renamed from: e */
    private int f10839e;

    /* renamed from: f */
    private long f10840f;

    /* renamed from: g */
    private C2591ll f10841g;

    C2480il() {
    }

    /* renamed from: d */
    private final long m14386d(C2924uk ukVar, int i) throws IOException, InterruptedException {
        ukVar.mo14528h(this.f10835a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f10835a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo11148a() {
        this.f10838d = 0;
        this.f10836b.clear();
        this.f10837c.mo13557d();
    }

    /* renamed from: b */
    public final void mo11149b(C2591ll llVar) {
        this.f10841g = llVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 == 1) goto L_0x008d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11150c(com.google.android.gms.internal.ads.C2924uk r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.ll r0 = r12.f10841g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.C2335eq.m12245e(r0)
        L_0x000c:
            java.util.Stack r0 = r12.f10836b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003d
            long r3 = r13.mo14524d()
            java.util.Stack r0 = r12.f10836b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.hl r0 = (com.google.android.gms.internal.ads.C2442hl) r0
            long r5 = r0.f10375b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            com.google.android.gms.internal.ads.ll r13 = r12.f10841g
            java.util.Stack r0 = r12.f10836b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.hl r0 = (com.google.android.gms.internal.ads.C2442hl) r0
            int r0 = r0.f10374a
            com.google.android.gms.internal.ads.ol r13 = r13.f12834a
            r13.mo12966e(r0)
            return r1
        L_0x003d:
            int r0 = r12.f10838d
            r3 = 2
            r4 = 4
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.internal.ads.ql r0 = r12.f10837c
            long r5 = r0.mo13558e(r13, r1, r2, r4)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r13.mo14525e()
        L_0x0052:
            byte[] r0 = r12.f10835a
            r13.mo14527g(r0, r2, r4, r2)
            byte[] r0 = r12.f10835a
            byte r0 = r0[r2]
            int r0 = com.google.android.gms.internal.ads.C2777ql.m19260b(r0)
            r5 = -1
            if (r0 == r5) goto L_0x007a
            if (r0 > r4) goto L_0x007a
            byte[] r5 = r12.f10835a
            long r5 = com.google.android.gms.internal.ads.C2777ql.m19261c(r5, r0, r2)
            int r6 = (int) r5
            com.google.android.gms.internal.ads.ll r5 = r12.f10841g
            com.google.android.gms.internal.ads.ol r5 = r5.f12834a
            boolean r5 = com.google.android.gms.internal.ads.C2702ol.m17915m(r6)
            if (r5 == 0) goto L_0x007a
            r13.mo14529i(r0, r2)
            long r5 = (long) r6
            goto L_0x007e
        L_0x007a:
            r13.mo14529i(r1, r2)
            goto L_0x0052
        L_0x007e:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = (int) r5
            r12.f10839e = r0
            r12.f10838d = r1
            goto L_0x008d
        L_0x008b:
            if (r0 != r1) goto L_0x0099
        L_0x008d:
            com.google.android.gms.internal.ads.ql r0 = r12.f10837c
            r5 = 8
            long r5 = r0.mo13558e(r13, r2, r1, r5)
            r12.f10840f = r5
            r12.f10838d = r3
        L_0x0099:
            com.google.android.gms.internal.ads.ll r0 = r12.f10841g
            int r5 = r12.f10839e
            com.google.android.gms.internal.ads.ol r6 = r0.f12834a
            int r7 = com.google.android.gms.internal.ads.C2702ol.m17914l(r5)
            if (r7 == 0) goto L_0x017b
            if (r7 == r1) goto L_0x0159
            r8 = 8
            if (r7 == r3) goto L_0x012f
            r3 = 3
            if (r7 == r3) goto L_0x00f7
            if (r7 == r4) goto L_0x00ee
            long r6 = r12.f10840f
            r10 = 4
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x00d4
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d4
        L_0x00bd:
            com.google.android.gms.internal.ads.ti r13 = new com.google.android.gms.internal.ads.ti
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x00d4:
            int r3 = (int) r6
            long r6 = r12.m14386d(r13, r3)
            if (r3 != r4) goto L_0x00e2
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r3 = (double) r13
            goto L_0x00e6
        L_0x00e2:
            double r3 = java.lang.Double.longBitsToDouble(r6)
        L_0x00e6:
            com.google.android.gms.internal.ads.ol r13 = r0.f12834a
            r13.mo12967g(r5, r3)
            r12.f10838d = r2
            return r1
        L_0x00ee:
            long r3 = r12.f10840f
            int r0 = (int) r3
            r6.mo12971k(r5, r0, r13)
            r12.f10838d = r2
            return r1
        L_0x00f7:
            long r3 = r12.f10840f
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0118
            int r4 = (int) r3
            if (r4 != 0) goto L_0x0106
            java.lang.String r13 = ""
            goto L_0x0110
        L_0x0106:
            byte[] r3 = new byte[r4]
            r13.mo14528h(r3, r2, r4, r2)
            java.lang.String r13 = new java.lang.String
            r13.<init>(r3)
        L_0x0110:
            com.google.android.gms.internal.ads.ol r0 = r0.f12834a
            r0.mo12970j(r5, r13)
            r12.f10838d = r2
            return r1
        L_0x0118:
            com.google.android.gms.internal.ads.ti r13 = new com.google.android.gms.internal.ads.ti
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "String element size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x012f:
            long r3 = r12.f10840f
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0142
            int r4 = (int) r3
            long r3 = r12.m14386d(r13, r4)
            com.google.android.gms.internal.ads.ol r13 = r0.f12834a
            r13.mo12968h(r5, r3)
            r12.f10838d = r2
            return r1
        L_0x0142:
            com.google.android.gms.internal.ads.ti r13 = new com.google.android.gms.internal.ads.ti
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid integer size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x0159:
            long r6 = r13.mo14524d()
            long r3 = r12.f10840f
            java.util.Stack r13 = r12.f10836b
            com.google.android.gms.internal.ads.hl r0 = new com.google.android.gms.internal.ads.hl
            long r3 = r3 + r6
            r8 = 0
            r0.<init>(r5, r3, r8)
            r13.add(r0)
            com.google.android.gms.internal.ads.ll r13 = r12.f10841g
            int r4 = r12.f10839e
            long r8 = r12.f10840f
            com.google.android.gms.internal.ads.ol r3 = r13.f12834a
            r5 = r6
            r7 = r8
            r3.mo12969i(r4, r5, r7)
            r12.f10838d = r2
            return r1
        L_0x017b:
            long r3 = r12.f10840f
            int r0 = (int) r3
            r13.mo14529i(r0, r2)
            r12.f10838d = r2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2480il.mo11150c(com.google.android.gms.internal.ads.uk):boolean");
    }
}
