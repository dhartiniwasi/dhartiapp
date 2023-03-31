package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import p033d5.C4087c;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class r23 implements C4087c.C4088a, C4087c.C4089b {

    /* renamed from: a */
    private final m33 f16794a;

    /* renamed from: b */
    private final g33 f16795b;

    /* renamed from: c */
    private final Object f16796c = new Object();

    /* renamed from: d */
    private boolean f16797d = false;

    /* renamed from: e */
    private boolean f16798e = false;

    r23(Context context, Looper looper, g33 g33) {
        this.f16795b = g33;
        this.f16794a = new m33(context, looper, this, this, 12800000);
    }

    /* renamed from: b */
    private final void m19534b() {
        synchronized (this.f16796c) {
            if (this.f16794a.mo17338a() || this.f16794a.mo17344f()) {
                this.f16794a.mo17343e();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8531P0(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f16796c
            monitor-enter(r4)
            boolean r0 = r3.f16798e     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            r0 = 1
            r3.f16798e = r0     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.m33 r0 = r3.f16794a     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.r33 r0 = r0.mo12269n0()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.k33 r1 = new com.google.android.gms.internal.ads.k33     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.g33 r2 = r3.f16795b     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            byte[] r2 = r2.mo9400b()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r0.mo13662r6(r1)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
        L_0x0020:
            r3.m19534b()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r3.m19534b()     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r23.mo8531P0(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13659a() {
        synchronized (this.f16796c) {
            if (!this.f16797d) {
                this.f16797d = true;
                this.f16794a.mo17355u();
            }
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
    }
}
