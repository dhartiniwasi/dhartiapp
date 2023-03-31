package com.google.android.gms.internal.ads;

import p060h4.C4596v;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hs2 {

    /* renamed from: a */
    private final C4691e f10472a;

    /* renamed from: b */
    private final Object f10473b = new Object();

    /* renamed from: c */
    private volatile long f10474c = 0;

    /* renamed from: d */
    private volatile int f10475d = 1;

    public hs2(C4691e eVar) {
        this.f10472a = eVar;
    }

    /* renamed from: e */
    private final void m14033e() {
        long a = this.f10472a.mo18370a();
        synchronized (this.f10473b) {
            if (this.f10475d == 3) {
                if (this.f10474c + ((Long) C4596v.m30088c().mo12227b(C2679nz.f14503a5)).longValue() <= a) {
                    this.f10475d = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14034f(int r5, int r6) {
        /*
            r4 = this;
            r4.m14033e()
            i5.e r0 = r4.f10472a
            long r0 = r0.mo18370a()
            java.lang.Object r2 = r4.f10473b
            monitor-enter(r2)
            int r3 = r4.f10475d     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.f10475d = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.f10475d     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.f10474c = r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs2.m14034f(int, int):void");
    }

    /* renamed from: a */
    public final void mo10941a() {
        m14034f(2, 3);
    }

    /* renamed from: b */
    public final void mo10942b(boolean z) {
        if (z) {
            m14034f(1, 2);
        } else {
            m14034f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean mo10943c() {
        boolean z;
        synchronized (this.f10473b) {
            m14033e();
            z = this.f10475d == 3;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo10944d() {
        boolean z;
        synchronized (this.f10473b) {
            m14033e();
            z = this.f10475d == 2;
        }
        return z;
    }
}
