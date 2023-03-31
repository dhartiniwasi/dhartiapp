package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nk4 {

    /* renamed from: a */
    private int f14055a;

    /* renamed from: b */
    private int f14056b;

    /* renamed from: c */
    private int f14057c = 0;

    /* renamed from: d */
    private gk4[] f14058d = new gk4[100];

    public nk4(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo12648a() {
        return this.f14056b * 65536;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.gk4 mo12649b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f14056b     // Catch:{ all -> 0x0038 }
            int r0 = r0 + 1
            r4.f14056b = r0     // Catch:{ all -> 0x0038 }
            int r0 = r4.f14057c     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x001a
            com.google.android.gms.internal.ads.gk4[] r1 = r4.f14058d     // Catch:{ all -> 0x0038 }
            int r0 = r0 + -1
            r4.f14057c = r0     // Catch:{ all -> 0x0038 }
            r2 = r1[r0]     // Catch:{ all -> 0x0038 }
            java.util.Objects.requireNonNull(r2)
            r3 = 0
            r1[r0] = r3     // Catch:{ all -> 0x0038 }
            goto L_0x002b
        L_0x001a:
            com.google.android.gms.internal.ads.gk4 r2 = new com.google.android.gms.internal.ads.gk4     // Catch:{ all -> 0x0038 }
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0038 }
            int r0 = r4.f14056b     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.gk4[] r1 = r4.f14058d     // Catch:{ all -> 0x0038 }
            int r3 = r1.length     // Catch:{ all -> 0x0038 }
            if (r0 > r3) goto L_0x002d
        L_0x002b:
            monitor-exit(r4)
            return r2
        L_0x002d:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.gk4[] r0 = (com.google.android.gms.internal.ads.gk4[]) r0     // Catch:{ all -> 0x0038 }
            r4.f14058d = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return r2
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nk4.mo12649b():com.google.android.gms.internal.ads.gk4");
    }

    /* renamed from: c */
    public final synchronized void mo12650c(gk4 gk4) {
        gk4[] gk4Arr = this.f14058d;
        int i = this.f14057c;
        this.f14057c = i + 1;
        gk4Arr[i] = gk4;
        this.f14056b--;
        notifyAll();
    }

    /* renamed from: d */
    public final synchronized void mo12651d(hk4 hk4) {
        while (hk4 != null) {
            gk4[] gk4Arr = this.f14058d;
            int i = this.f14057c;
            this.f14057c = i + 1;
            gk4Arr[i] = hk4.mo10833e();
            this.f14056b--;
            hk4 = hk4.mo10832b();
        }
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo12652e() {
        mo12653f(0);
    }

    /* renamed from: f */
    public final synchronized void mo12653f(int i) {
        int i2 = this.f14055a;
        this.f14055a = i;
        if (i < i2) {
            mo12654g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo12654g() {
        int max = Math.max(0, gb2.m13145O(this.f14055a, 65536) - this.f14056b);
        int i = this.f14057c;
        if (max < i) {
            Arrays.fill(this.f14058d, max, i, (Object) null);
            this.f14057c = max;
        }
    }
}
