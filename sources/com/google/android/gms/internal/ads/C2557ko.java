package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.ko */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2557ko {

    /* renamed from: a */
    private int f12183a = AdError.NETWORK_ERROR_CODE;

    /* renamed from: b */
    private int[] f12184b = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: c */
    private long[] f12185c = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: d */
    private int[] f12186d = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: e */
    private int[] f12187e = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: f */
    private long[] f12188f = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: g */
    private C2330el[] f12189g = new C2330el[AdError.NETWORK_ERROR_CODE];

    /* renamed from: h */
    private C2774qi[] f12190h = new C2774qi[AdError.NETWORK_ERROR_CODE];

    /* renamed from: i */
    private int f12191i;

    /* renamed from: j */
    private int f12192j;

    /* renamed from: k */
    private int f12193k;

    /* renamed from: l */
    private int f12194l;

    /* renamed from: m */
    private long f12195m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f12196n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f12197o = true;

    /* renamed from: p */
    private boolean f12198p = true;

    /* renamed from: q */
    private C2774qi f12199q;

    /* renamed from: a */
    public final int mo11736a() {
        return this.f12192j + this.f12191i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        return -3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo11737b(com.google.android.gms.internal.ads.C2811ri r5, com.google.android.gms.internal.ads.C2664nk r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.C2774qi r9, com.google.android.gms.internal.ads.C2520jo r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo11747l()     // Catch:{ all -> 0x0092 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0020
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo11136c(r5)     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.qi r6 = r4.f12199q     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x001e
            if (r7 != 0) goto L_0x001a
            if (r6 == r9) goto L_0x001e
        L_0x001a:
            r5.f16958a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            if (r7 != 0) goto L_0x0088
            com.google.android.gms.internal.ads.qi[] r7 = r4.f12190h     // Catch:{ all -> 0x0092 }
            int r8 = r4.f12193k     // Catch:{ all -> 0x0092 }
            r7 = r7[r8]     // Catch:{ all -> 0x0092 }
            if (r7 == r9) goto L_0x002b
            goto L_0x0088
        L_0x002b:
            java.nio.ByteBuffer r5 = r6.f14049c     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0086
            long[] r5 = r4.f12188f     // Catch:{ all -> 0x0092 }
            r0 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.f14050d = r0     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f12187e     // Catch:{ all -> 0x0092 }
            r5 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.mo11136c(r5)     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f12186d     // Catch:{ all -> 0x0092 }
            int r7 = r4.f12193k     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f11723a = r5     // Catch:{ all -> 0x0092 }
            long[] r5 = r4.f12185c     // Catch:{ all -> 0x0092 }
            r8 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f11724b = r8     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.el[] r5 = r4.f12189g     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f11726d = r5     // Catch:{ all -> 0x0092 }
            long r7 = r4.f12195m     // Catch:{ all -> 0x0092 }
            long r5 = r6.f14050d     // Catch:{ all -> 0x0092 }
            long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0092 }
            r4.f12195m = r5     // Catch:{ all -> 0x0092 }
            int r5 = r4.f12191i     // Catch:{ all -> 0x0092 }
            int r5 = r5 + -1
            r4.f12191i = r5     // Catch:{ all -> 0x0092 }
            int r6 = r4.f12193k     // Catch:{ all -> 0x0092 }
            int r6 = r6 + 1
            r4.f12193k = r6     // Catch:{ all -> 0x0092 }
            int r7 = r4.f12192j     // Catch:{ all -> 0x0092 }
            int r7 = r7 + 1
            r4.f12192j = r7     // Catch:{ all -> 0x0092 }
            int r7 = r4.f12183a     // Catch:{ all -> 0x0092 }
            r8 = 0
            if (r6 != r7) goto L_0x0074
            r4.f12193k = r8     // Catch:{ all -> 0x0092 }
            r6 = 0
        L_0x0074:
            if (r5 <= 0) goto L_0x007b
            long[] r5 = r4.f12185c     // Catch:{ all -> 0x0092 }
            r6 = r5[r6]     // Catch:{ all -> 0x0092 }
            goto L_0x0082
        L_0x007b:
            long r5 = r10.f11724b     // Catch:{ all -> 0x0092 }
            int r7 = r10.f11723a     // Catch:{ all -> 0x0092 }
            long r7 = (long) r7     // Catch:{ all -> 0x0092 }
            long r6 = r5 + r7
        L_0x0082:
            r10.f11725c = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0086:
            monitor-exit(r4)
            return r2
        L_0x0088:
            com.google.android.gms.internal.ads.qi[] r6 = r4.f12190h     // Catch:{ all -> 0x0092 }
            int r7 = r4.f12193k     // Catch:{ all -> 0x0092 }
            r6 = r6[r7]     // Catch:{ all -> 0x0092 }
            r5.f16958a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x0092:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2557ko.mo11737b(com.google.android.gms.internal.ads.ri, com.google.android.gms.internal.ads.nk, boolean, boolean, com.google.android.gms.internal.ads.qi, com.google.android.gms.internal.ads.jo):int");
    }

    /* renamed from: c */
    public final synchronized long mo11738c() {
        return Math.max(this.f12195m, this.f12196n);
    }

    /* renamed from: d */
    public final synchronized long mo11739d() {
        if (!mo11747l()) {
            return -1;
        }
        int i = this.f12193k;
        int i2 = this.f12191i;
        int i3 = i + i2;
        int i4 = this.f12183a;
        int i5 = (i3 - 1) % i4;
        this.f12193k = i3 % i4;
        this.f12192j += i2;
        this.f12191i = 0;
        return this.f12185c[i5] + ((long) this.f12186d[i5]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return -1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo11740e(long r10, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.mo11747l()     // Catch:{ all -> 0x005e }
            r1 = -1
            if (r0 == 0) goto L_0x005c
            long[] r0 = r9.f12188f     // Catch:{ all -> 0x005e }
            int r3 = r9.f12193k     // Catch:{ all -> 0x005e }
            r4 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005c
        L_0x0014:
            long r4 = r9.f12196n     // Catch:{ all -> 0x005e }
            r0 = 0
            r6 = -1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0021
            if (r12 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r9)
            return r1
        L_0x0021:
            r12 = -1
        L_0x0022:
            int r4 = r9.f12194l     // Catch:{ all -> 0x005e }
            if (r3 == r4) goto L_0x0040
            long[] r4 = r9.f12188f     // Catch:{ all -> 0x005e }
            r7 = r4[r3]     // Catch:{ all -> 0x005e }
            int r4 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            int[] r4 = r9.f12187e     // Catch:{ all -> 0x005e }
            r4 = r4[r3]     // Catch:{ all -> 0x005e }
            r5 = 1
            r4 = r4 & r5
            if (r5 != r4) goto L_0x0038
            r12 = r0
        L_0x0038:
            int r3 = r3 + 1
            int r4 = r9.f12183a     // Catch:{ all -> 0x005e }
            int r3 = r3 % r4
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0040:
            if (r12 != r6) goto L_0x0044
            monitor-exit(r9)
            return r1
        L_0x0044:
            int r10 = r9.f12193k     // Catch:{ all -> 0x005e }
            int r10 = r10 + r12
            int r11 = r9.f12183a     // Catch:{ all -> 0x005e }
            int r10 = r10 % r11
            r9.f12193k = r10     // Catch:{ all -> 0x005e }
            int r11 = r9.f12192j     // Catch:{ all -> 0x005e }
            int r11 = r11 + r12
            r9.f12192j = r11     // Catch:{ all -> 0x005e }
            int r11 = r9.f12191i     // Catch:{ all -> 0x005e }
            int r11 = r11 - r12
            r9.f12191i = r11     // Catch:{ all -> 0x005e }
            long[] r11 = r9.f12185c     // Catch:{ all -> 0x005e }
            r10 = r11[r10]     // Catch:{ all -> 0x005e }
            monitor-exit(r9)
            return r10
        L_0x005c:
            monitor-exit(r9)
            return r1
        L_0x005e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2557ko.mo11740e(long, boolean):long");
    }

    /* renamed from: f */
    public final synchronized C2774qi mo11741f() {
        if (this.f12198p) {
            return null;
        }
        return this.f12199q;
    }

    /* renamed from: g */
    public final void mo11742g() {
        this.f12192j = 0;
        this.f12193k = 0;
        this.f12194l = 0;
        this.f12191i = 0;
        this.f12197o = true;
    }

    /* renamed from: h */
    public final synchronized void mo11743h(long j, int i, long j2, int i2, C2330el elVar) {
        if (this.f12197o) {
            if ((i & 1) != 0) {
                this.f12197o = false;
            } else {
                return;
            }
        }
        C2335eq.m12245e(!this.f12198p);
        mo11744i(j);
        long[] jArr = this.f12188f;
        int i3 = this.f12194l;
        jArr[i3] = j;
        long[] jArr2 = this.f12185c;
        jArr2[i3] = j2;
        this.f12186d[i3] = i2;
        this.f12187e[i3] = i;
        this.f12189g[i3] = elVar;
        this.f12190h[i3] = this.f12199q;
        this.f12184b[i3] = 0;
        int i4 = this.f12191i + 1;
        this.f12191i = i4;
        int i5 = this.f12183a;
        if (i4 == i5) {
            int i6 = i5 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i6];
            long[] jArr3 = new long[i6];
            long[] jArr4 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            C2330el[] elVarArr = new C2330el[i6];
            C2774qi[] qiVarArr = new C2774qi[i6];
            int i7 = this.f12193k;
            int i8 = i5 - i7;
            System.arraycopy(jArr2, i7, jArr3, 0, i8);
            System.arraycopy(this.f12188f, this.f12193k, jArr4, 0, i8);
            System.arraycopy(this.f12187e, this.f12193k, iArr2, 0, i8);
            System.arraycopy(this.f12186d, this.f12193k, iArr3, 0, i8);
            System.arraycopy(this.f12189g, this.f12193k, elVarArr, 0, i8);
            System.arraycopy(this.f12190h, this.f12193k, qiVarArr, 0, i8);
            System.arraycopy(this.f12184b, this.f12193k, iArr, 0, i8);
            int i9 = this.f12193k;
            System.arraycopy(this.f12185c, 0, jArr3, i8, i9);
            System.arraycopy(this.f12188f, 0, jArr4, i8, i9);
            System.arraycopy(this.f12187e, 0, iArr2, i8, i9);
            System.arraycopy(this.f12186d, 0, iArr3, i8, i9);
            System.arraycopy(this.f12189g, 0, elVarArr, i8, i9);
            System.arraycopy(this.f12190h, 0, qiVarArr, i8, i9);
            System.arraycopy(this.f12184b, 0, iArr, i8, i9);
            this.f12185c = jArr3;
            this.f12188f = jArr4;
            this.f12187e = iArr2;
            this.f12186d = iArr3;
            this.f12189g = elVarArr;
            this.f12190h = qiVarArr;
            this.f12184b = iArr;
            this.f12193k = 0;
            int i10 = this.f12183a;
            this.f12194l = i10;
            this.f12191i = i10;
            this.f12183a = i6;
            return;
        }
        int i11 = i3 + 1;
        this.f12194l = i11;
        if (i11 == i5) {
            this.f12194l = 0;
        }
    }

    /* renamed from: i */
    public final synchronized void mo11744i(long j) {
        this.f12196n = Math.max(this.f12196n, j);
    }

    /* renamed from: j */
    public final void mo11745j() {
        this.f12195m = Long.MIN_VALUE;
        this.f12196n = Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final synchronized boolean mo11746k(C2774qi qiVar) {
        if (qiVar == null) {
            this.f12198p = true;
            return false;
        }
        this.f12198p = false;
        if (C2893tq.m21184o(qiVar, this.f12199q)) {
            return false;
        }
        this.f12199q = qiVar;
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean mo11747l() {
        return this.f12191i != 0;
    }
}
