package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jh4 implements xk4, ag4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f11610a = cg4.m10931a();

    /* renamed from: b */
    private final Uri f11611b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ud3 f11612c;

    /* renamed from: d */
    private final eh4 f11613d;

    /* renamed from: e */
    private final tn4 f11614e;

    /* renamed from: f */
    private final yc1 f11615f;

    /* renamed from: g */
    private final C2532k f11616g = new C2532k();

    /* renamed from: h */
    private volatile boolean f11617h;

    /* renamed from: i */
    private boolean f11618i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f11619j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public wq2 f11620k = m14868h(0);

    /* renamed from: l */
    private C2792r f11621l;

    /* renamed from: m */
    private boolean f11622m;

    /* renamed from: n */
    final /* synthetic */ oh4 f11623n;

    public jh4(oh4 oh4, Uri uri, ql2 ql2, eh4 eh4, tn4 tn4, yc1 yc1) {
        this.f11623n = oh4;
        this.f11611b = uri;
        this.f11612c = new ud3(ql2);
        this.f11613d = eh4;
        this.f11614e = tn4;
        this.f11615f = yc1;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m14867g(jh4 jh4, long j, long j2) {
        jh4.f11616g.f11852a = j;
        jh4.f11619j = j2;
        jh4.f11618i = true;
        jh4.f11622m = false;
    }

    /* renamed from: h */
    private final wq2 m14868h(long j) {
        uo2 uo2 = new uo2();
        uo2.mo14559d(this.f11611b);
        uo2.mo14558c(j);
        uo2.mo14556a(6);
        uo2.mo14557b(oh4.f15076a0);
        return uo2.mo14560e();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        com.google.android.gms.internal.ads.ot1.m18060e("IcyHeaders", "Invalid metadata interval: ".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0107 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x020c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c6 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e2 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0113 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0133 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014f A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016b A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0174 A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0187 A[SYNTHETIC, Splitter:B:82:0x0187] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01cd  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11402U() throws java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.f11617h
            if (r2 != 0) goto L_0x020c
            r2 = -1
            r5 = 0
            com.google.android.gms.internal.ads.k r6 = r1.f11616g     // Catch:{ all -> 0x01ec }
            long r13 = r6.f11852a     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.wq2 r6 = r1.m14868h(r13)     // Catch:{ all -> 0x01ec }
            r1.f11620k = r6     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.ud3 r7 = r1.f11612c     // Catch:{ all -> 0x01ec }
            long r6 = r7.mo8794f(r6)     // Catch:{ all -> 0x01ec }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            com.google.android.gms.internal.ads.oh4 r8 = r1.f11623n     // Catch:{ all -> 0x01ec }
            r8.f15109u.post(new com.google.android.gms.internal.ads.hh4(r8))     // Catch:{ all -> 0x01ec }
        L_0x0025:
            r15 = r6
            com.google.android.gms.internal.ads.oh4 r6 = r1.f11623n     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.ud3 r7 = r1.f11612c     // Catch:{ all -> 0x01ec }
            java.util.Map r7 = r7.mo8790a()     // Catch:{ all -> 0x01ec }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01ec }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01ec }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0076
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01ec }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0064 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004b
            r2 = 1
            goto L_0x0061
        L_0x004b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0065 }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x0065 }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x0065 }
            com.google.android.gms.internal.ads.ot1.m18060e(r9, r2)     // Catch:{ NumberFormatException -> 0x0065 }
            r2 = 0
            r11 = -1
        L_0x0061:
            r18 = r11
            goto L_0x0079
        L_0x0064:
            r11 = -1
        L_0x0065:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.ot1.m18060e(r9, r2)     // Catch:{ all -> 0x01ec }
            r18 = r11
            r2 = 0
            goto L_0x0079
        L_0x0076:
            r2 = 0
            r18 = -1
        L_0x0079:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01ec }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ec }
            r8 = 0
            if (r3 == 0) goto L_0x008e
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01ec }
            r19 = r2
            r2 = 1
            goto L_0x0090
        L_0x008e:
            r19 = r8
        L_0x0090:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01ec }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ec }
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01ec }
            r20 = r2
            r2 = 1
            goto L_0x00a6
        L_0x00a4:
            r20 = r8
        L_0x00a6:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01ec }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ec }
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01ec }
            r21 = r2
            r2 = 1
            goto L_0x00bc
        L_0x00ba:
            r21 = r8
        L_0x00bc:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01ec }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ec }
            if (r3 == 0) goto L_0x00d6
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01ec }
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01ec }
            r22 = r2
            r2 = 1
            goto L_0x00d8
        L_0x00d6:
            r22 = 0
        L_0x00d8:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01ec }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ec }
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01ec }
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0106 }
            if (r7 <= 0) goto L_0x00f0
            r2 = 1
            goto L_0x0103
        L_0x00f0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0107 }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x0107 }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x0107 }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x0107 }
            java.lang.String r11 = r11.toString()     // Catch:{ NumberFormatException -> 0x0107 }
            com.google.android.gms.internal.ads.ot1.m18060e(r9, r11)     // Catch:{ NumberFormatException -> 0x0107 }
            r7 = -1
        L_0x0103:
            r23 = r7
            goto L_0x0115
        L_0x0106:
            r7 = -1
        L_0x0107:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01ec }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.ot1.m18060e(r9, r3)     // Catch:{ all -> 0x01ec }
            goto L_0x0103
        L_0x0113:
            r23 = -1
        L_0x0115:
            if (r2 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.q1 r8 = new com.google.android.gms.internal.ads.q1     // Catch:{ all -> 0x01ec }
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01ec }
        L_0x011e:
            r6.f15111w = r8     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.ud3 r2 = r1.f11612c     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.oh4 r3 = r1.f11623n     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.q1 r6 = r3.f15111w     // Catch:{ all -> 0x01ec }
            if (r6 == 0) goto L_0x014f
            com.google.android.gms.internal.ads.q1 r6 = r3.f15111w     // Catch:{ all -> 0x01ec }
            int r6 = r6.f16123f     // Catch:{ all -> 0x01ec }
            if (r6 == r10) goto L_0x014f
            com.google.android.gms.internal.ads.bg4 r6 = new com.google.android.gms.internal.ads.bg4     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.q1 r3 = r3.f15111w     // Catch:{ all -> 0x01ec }
            int r3 = r3.f16123f     // Catch:{ all -> 0x01ec }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.oh4 r2 = r1.f11623n     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.r r2 = r2.mo12921Q()     // Catch:{ all -> 0x01ec }
            r1.f11621l = r2     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.g4 r3 = com.google.android.gms.internal.ads.oh4.f15077b0     // Catch:{ all -> 0x01ec }
            r2.mo8823e(r3)     // Catch:{ all -> 0x01ec }
            r8 = r6
            goto L_0x0150
        L_0x014f:
            r8 = r2
        L_0x0150:
            com.google.android.gms.internal.ads.eh4 r7 = r1.f11613d     // Catch:{ all -> 0x01ec }
            android.net.Uri r9 = r1.f11611b     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.ud3 r2 = r1.f11612c     // Catch:{ all -> 0x01ec }
            java.util.Map r10 = r2.mo8790a()     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.tn4 r2 = r1.f11614e     // Catch:{ all -> 0x01ec }
            r11 = r13
            r4 = r13
            r13 = r15
            r15 = r2
            r7.mo9923f(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.oh4 r2 = r1.f11623n     // Catch:{ all -> 0x01ec }
            com.google.android.gms.internal.ads.q1 r2 = r2.f15111w     // Catch:{ all -> 0x01ec }
            if (r2 == 0) goto L_0x0170
            com.google.android.gms.internal.ads.eh4 r2 = r1.f11613d     // Catch:{ all -> 0x01ec }
            r2.mo9922e()     // Catch:{ all -> 0x01ec }
        L_0x0170:
            boolean r2 = r1.f11618i     // Catch:{ all -> 0x01ec }
            if (r2 == 0) goto L_0x0182
            com.google.android.gms.internal.ads.eh4 r2 = r1.f11613d     // Catch:{ all -> 0x01ec }
            long r7 = r1.f11619j     // Catch:{ all -> 0x01ec }
            r2.mo9920c(r4, r7)     // Catch:{ all -> 0x01ec }
            r2 = 0
            r1.f11618i = r2     // Catch:{ all -> 0x017f }
            goto L_0x0183
        L_0x017f:
            r0 = move-exception
            goto L_0x01ee
        L_0x0182:
            r2 = 0
        L_0x0183:
            r13 = r4
            r4 = 0
        L_0x0185:
            if (r4 != 0) goto L_0x01ca
            boolean r5 = r1.f11617h     // Catch:{ all -> 0x01c6 }
            if (r5 != 0) goto L_0x01c3
            com.google.android.gms.internal.ads.yc1 r5 = r1.f11615f     // Catch:{ InterruptedException -> 0x01bd }
            r5.mo15419a()     // Catch:{ InterruptedException -> 0x01bd }
            com.google.android.gms.internal.ads.eh4 r5 = r1.f11613d     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.ads.k r6 = r1.f11616g     // Catch:{ all -> 0x01c6 }
            int r4 = r5.mo9919b(r6)     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.ads.eh4 r5 = r1.f11613d     // Catch:{ all -> 0x01c6 }
            long r5 = r5.mo9921d()     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.ads.oh4 r7 = r1.f11623n     // Catch:{ all -> 0x01c6 }
            long r7 = r7.f15103g     // Catch:{ all -> 0x01c6 }
            long r7 = r7 + r13
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0185
            com.google.android.gms.internal.ads.yc1 r7 = r1.f11615f     // Catch:{ all -> 0x01c6 }
            r7.mo15421c()     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.ads.oh4 r7 = r1.f11623n     // Catch:{ all -> 0x01c6 }
            android.os.Handler r8 = r7.f15109u     // Catch:{ all -> 0x01c6 }
            java.lang.Runnable r7 = r7.f15108t     // Catch:{ all -> 0x01c6 }
            r8.post(r7)     // Catch:{ all -> 0x01c6 }
            r13 = r5
            goto L_0x0185
        L_0x01bd:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01c6 }
            r0.<init>()     // Catch:{ all -> 0x01c6 }
            throw r0     // Catch:{ all -> 0x01c6 }
        L_0x01c3:
            r3 = 1
            r4 = 0
            goto L_0x01cb
        L_0x01c6:
            r0 = move-exception
            r5 = r4
            r2 = 1
            goto L_0x01f0
        L_0x01ca:
            r3 = 1
        L_0x01cb:
            if (r4 != r3) goto L_0x01cf
            r5 = 0
            goto L_0x01e4
        L_0x01cf:
            com.google.android.gms.internal.ads.eh4 r2 = r1.f11613d
            long r5 = r2.mo9921d()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.k r3 = r1.f11616g
            long r5 = r2.mo9921d()
            r3.f11852a = r5
        L_0x01e3:
            r5 = r4
        L_0x01e4:
            com.google.android.gms.internal.ads.ud3 r2 = r1.f11612c
            com.google.android.gms.internal.ads.sn2.m20535a(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x020c
        L_0x01ec:
            r0 = move-exception
            r2 = 0
        L_0x01ee:
            r2 = 1
            r5 = 0
        L_0x01f0:
            if (r5 == r2) goto L_0x0206
            com.google.android.gms.internal.ads.eh4 r2 = r1.f11613d
            long r3 = r2.mo9921d()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0206
            com.google.android.gms.internal.ads.k r3 = r1.f11616g
            long r4 = r2.mo9921d()
            r3.f11852a = r4
        L_0x0206:
            com.google.android.gms.internal.ads.ud3 r2 = r1.f11612c
            com.google.android.gms.internal.ads.sn2.m20535a(r2)
            throw r0
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jh4.mo11402U():void");
    }

    /* renamed from: b */
    public final void mo8331b(y22 y22) {
        long j;
        if (!this.f11622m) {
            j = this.f11619j;
        } else {
            j = Math.max(this.f11623n.m17782A(true), this.f11619j);
        }
        int i = y22.mo15296i();
        C2792r rVar = this.f11621l;
        Objects.requireNonNull(rVar);
        C2717p.m18261b(rVar, y22, i);
        rVar.mo8824f(j, 1, i, 0, (C2755q) null);
        this.f11622m = true;
    }

    /* renamed from: c */
    public final void mo11403c() {
        this.f11617h = true;
    }
}
