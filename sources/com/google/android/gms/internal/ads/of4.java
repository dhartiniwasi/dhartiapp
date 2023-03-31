package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class of4 implements eh4 {

    /* renamed from: a */
    private final xn4 f15069a;

    /* renamed from: b */
    private qn4 f15070b;

    /* renamed from: c */
    private rn4 f15071c;

    public of4(xn4 xn4) {
        this.f15069a = xn4;
    }

    /* renamed from: a */
    public final void mo9918a() {
        if (this.f15070b != null) {
            this.f15070b = null;
        }
        this.f15071c = null;
    }

    /* renamed from: b */
    public final int mo9919b(C2532k kVar) throws IOException {
        qn4 qn4 = this.f15070b;
        Objects.requireNonNull(qn4);
        rn4 rn4 = this.f15071c;
        Objects.requireNonNull(rn4);
        return qn4.mo9025f(rn4, kVar);
    }

    /* renamed from: c */
    public final void mo9920c(long j, long j2) {
        qn4 qn4 = this.f15070b;
        Objects.requireNonNull(qn4);
        qn4.mo9026g(j, j2);
    }

    /* renamed from: d */
    public final long mo9921d() {
        rn4 rn4 = this.f15071c;
        if (rn4 != null) {
            return rn4.mo9003T();
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo9922e() {
        qn4 qn4 = this.f15070b;
        if (qn4 instanceof C2981w3) {
            ((C2981w3) qn4).mo14865a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0.mo9003T() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r0.mo9003T() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r1 = false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9923f(com.google.android.gms.internal.ads.cf4 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.tn4 r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.fn4 r6 = new com.google.android.gms.internal.ads.fn4
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f15071c = r6
            com.google.android.gms.internal.ads.qn4 r8 = r7.f15070b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.xn4 r8 = r7.f15069a
            com.google.android.gms.internal.ads.qn4[] r8 = r8.mo8679a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f15070b = r8
            goto L_0x0074
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x0070
            r1 = r8[r0]
            boolean r2 = r1.mo9023b(r6)     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            if (r2 == 0) goto L_0x0034
            r7.f15070b = r1     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            com.google.android.gms.internal.ads.v91.m22052f(r14)
            r6.mo9981W()
            goto L_0x0070
        L_0x0034:
            com.google.android.gms.internal.ads.qn4 r1 = r7.f15070b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.mo9003T()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0041:
            r8 = move-exception
            com.google.android.gms.internal.ads.qn4 r9 = r7.f15070b
            if (r9 != 0) goto L_0x004e
            long r9 = r6.mo9003T()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x004f
        L_0x004e:
            r13 = 1
        L_0x004f:
            com.google.android.gms.internal.ads.v91.m22052f(r13)
            r6.mo9981W()
            throw r8
        L_0x0056:
            com.google.android.gms.internal.ads.qn4 r1 = r7.f15070b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.mo9003T()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0067
        L_0x0066:
            r1 = 1
        L_0x0067:
            com.google.android.gms.internal.ads.v91.m22052f(r1)
            r6.mo9981W()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0070:
            com.google.android.gms.internal.ads.qn4 r10 = r7.f15070b
            if (r10 == 0) goto L_0x007a
        L_0x0074:
            com.google.android.gms.internal.ads.qn4 r8 = r7.f15070b
            r8.mo9024c(r15)
            return
        L_0x007a:
            com.google.android.gms.internal.ads.li4 r10 = new com.google.android.gms.internal.ads.li4
            java.lang.String r8 = com.google.android.gms.internal.ads.gb2.m13177k(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.of4.mo9923f(com.google.android.gms.internal.ads.cf4, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.tn4):void");
    }
}
