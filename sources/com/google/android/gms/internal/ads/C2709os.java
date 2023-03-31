package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.os */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2709os {

    /* renamed from: a */
    private final Object f15336a = new Object();

    /* renamed from: b */
    private C2635ms f15337b = null;

    /* renamed from: c */
    private boolean f15338c = false;

    /* renamed from: a */
    public final Activity mo13027a() {
        synchronized (this.f15336a) {
            C2635ms msVar = this.f15337b;
            if (msVar == null) {
                return null;
            }
            Activity a = msVar.mo12420a();
            return a;
        }
    }

    /* renamed from: b */
    public final Context mo13028b() {
        synchronized (this.f15336a) {
            C2635ms msVar = this.f15337b;
            if (msVar == null) {
                return null;
            }
            Context b = msVar.mo12421b();
            return b;
        }
    }

    /* renamed from: c */
    public final void mo13029c(C2672ns nsVar) {
        synchronized (this.f15336a) {
            if (this.f15337b == null) {
                this.f15337b = new C2635ms();
            }
            this.f15337b.mo12422f(nsVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13030d(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f15336a
            monitor-enter(r0)
            boolean r1 = r3.f15338c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x000e
            r1 = r4
        L_0x000e:
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0015
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r4 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.pm0.m18667g(r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.ms r2 = r3.f15337b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.ms r2 = new com.google.android.gms.internal.ads.ms     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r3.f15337b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.ms r2 = r3.f15337b     // Catch:{ all -> 0x0034 }
            r2.mo12423g(r1, r4)     // Catch:{ all -> 0x0034 }
            r4 = 1
            r3.f15338c = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2709os.mo13030d(android.content.Context):void");
    }

    /* renamed from: e */
    public final void mo13031e(C2672ns nsVar) {
        synchronized (this.f15336a) {
            C2635ms msVar = this.f15337b;
            if (msVar != null) {
                msVar.mo12424h(nsVar);
            }
        }
    }
}
