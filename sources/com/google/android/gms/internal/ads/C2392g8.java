package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.g8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2392g8 implements qn4 {

    /* renamed from: h */
    public static final xn4 f9765h = C2243c8.f7640b;

    /* renamed from: a */
    private tn4 f9766a;

    /* renamed from: b */
    private C2792r f9767b;

    /* renamed from: c */
    private int f9768c = 0;

    /* renamed from: d */
    private long f9769d = -1;

    /* renamed from: e */
    private C2317e8 f9770e;

    /* renamed from: f */
    private int f9771f = -1;

    /* renamed from: g */
    private long f9772g = -1;

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        return C2504j8.m14740c(rn4);
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f9766a = tn4;
        this.f9767b = tn4.mo10060n(0, 1);
        tn4.mo10058C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        if (r1 != 65534) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r19, com.google.android.gms.internal.ads.C2532k r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.r r2 = r0.f9767b
            com.google.android.gms.internal.ads.v91.m22048b(r2)
            int r2 = com.google.android.gms.internal.ads.gb2.f9812a
            int r2 = r0.f9768c
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0159
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L_0x0124
            r10 = 3
            if (r2 == r7) goto L_0x00a2
            if (r2 == r10) goto L_0x003c
            long r10 = r0.f9772g
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.v91.m22052f(r5)
            long r4 = r0.f9772g
            long r7 = r19.mo9003T()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.e8 r2 = r0.f9770e
            java.util.Objects.requireNonNull(r2)
            boolean r1 = r2.mo9455e(r1, r4)
            if (r1 == 0) goto L_0x003b
            return r3
        L_0x003b:
            return r6
        L_0x003c:
            android.util.Pair r2 = com.google.android.gms.internal.ads.C2504j8.m14738a(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.f9771f = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.f9769d
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0062
            r2 = r10
        L_0x0062:
            int r5 = r0.f9771f
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.f9772g = r10
            long r1 = r19.mo9005b()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0095
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Data exceeds input length: "
            r3.append(r5)
            r3.append(r10)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WavExtractor"
            com.google.android.gms.internal.ads.ot1.m18060e(r5, r3)
            r0.f9772g = r1
            r10 = r1
        L_0x0095:
            com.google.android.gms.internal.ads.e8 r1 = r0.f9770e
            java.util.Objects.requireNonNull(r1)
            int r2 = r0.f9771f
            r1.mo9454d(r2, r10)
            r0.f9768c = r4
            return r6
        L_0x00a2:
            com.google.android.gms.internal.ads.h8 r15 = com.google.android.gms.internal.ads.C2504j8.m14739b(r19)
            int r1 = r15.f10239a
            r2 = 17
            if (r1 != r2) goto L_0x00b8
            com.google.android.gms.internal.ads.d8 r1 = new com.google.android.gms.internal.ads.d8
            com.google.android.gms.internal.ads.tn4 r2 = r0.f9766a
            com.google.android.gms.internal.ads.r r3 = r0.f9767b
            r1.<init>(r2, r3, r15)
            r0.f9770e = r1
            goto L_0x010b
        L_0x00b8:
            r2 = 6
            if (r1 != r2) goto L_0x00cc
            com.google.android.gms.internal.ads.f8 r1 = new com.google.android.gms.internal.ads.f8
            com.google.android.gms.internal.ads.tn4 r13 = r0.f9766a
            com.google.android.gms.internal.ads.r r14 = r0.f9767b
            r17 = -1
            java.lang.String r16 = "audio/g711-alaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f9770e = r1
            goto L_0x010b
        L_0x00cc:
            r2 = 7
            if (r1 != r2) goto L_0x00e0
            com.google.android.gms.internal.ads.f8 r1 = new com.google.android.gms.internal.ads.f8
            com.google.android.gms.internal.ads.tn4 r13 = r0.f9766a
            com.google.android.gms.internal.ads.r r14 = r0.f9767b
            r17 = -1
            java.lang.String r16 = "audio/g711-mlaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f9770e = r1
            goto L_0x010b
        L_0x00e0:
            int r2 = r15.f10243e
            if (r1 == r5) goto L_0x00f5
            if (r1 == r10) goto L_0x00ee
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto L_0x00f5
        L_0x00eb:
            r17 = 0
            goto L_0x00fb
        L_0x00ee:
            r3 = 32
            if (r2 != r3) goto L_0x00eb
            r17 = 4
            goto L_0x00fb
        L_0x00f5:
            int r4 = com.google.android.gms.internal.ads.gb2.m13154X(r2)
            r17 = r4
        L_0x00fb:
            if (r17 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.f8 r1 = new com.google.android.gms.internal.ads.f8
            com.google.android.gms.internal.ads.tn4 r13 = r0.f9766a
            com.google.android.gms.internal.ads.r r14 = r0.f9767b
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f9770e = r1
        L_0x010b:
            r0.f9768c = r10
            return r6
        L_0x010e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11992c(r1)
            throw r1
        L_0x0124:
            com.google.android.gms.internal.ads.y22 r2 = new com.google.android.gms.internal.ads.y22
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.i8 r4 = com.google.android.gms.internal.ads.C2466i8.m14219a(r1, r2)
            int r5 = r4.f10662a
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x013a
            r19.mo9981W()
            goto L_0x0154
        L_0x013a:
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo10217m(r3, r6)
            r2.mo15293f(r6)
            byte[] r5 = r2.mo15295h()
            r1.mo9986i(r5, r6, r3, r6)
            long r8 = r2.mo15311x()
            long r4 = r4.f10663b
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.mo10218n(r2, r6)
        L_0x0154:
            r0.f9769d = r8
            r0.f9768c = r7
            return r6
        L_0x0159:
            long r7 = r19.mo9003T()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0165
            r2 = 1
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            com.google.android.gms.internal.ads.v91.m22052f(r2)
            int r2 = r0.f9771f
            if (r2 == r3) goto L_0x0175
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo10218n(r2, r6)
            r0.f9768c = r4
            goto L_0x018c
        L_0x0175:
            boolean r2 = com.google.android.gms.internal.ads.C2504j8.m14740c(r19)
            if (r2 == 0) goto L_0x018d
            long r2 = r19.mo9004a()
            long r7 = r19.mo9003T()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.mo10218n(r3, r6)
            r0.f9768c = r5
        L_0x018c:
            return r6
        L_0x018d:
            r1 = 0
            java.lang.String r2 = "Unsupported or unrecognized wav file type."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2392g8.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f9768c = j == 0 ? 0 : 4;
        C2317e8 e8Var = this.f9770e;
        if (e8Var != null) {
            e8Var.mo9453c(j2);
        }
    }
}
