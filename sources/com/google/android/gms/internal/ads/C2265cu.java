package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p033d5.C4087c;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* renamed from: com.google.android.gms.internal.ads.cu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2265cu {

    /* renamed from: a */
    private ScheduledFuture f7944a = null;

    /* renamed from: b */
    private final Runnable f7945b = new C3081yt(this);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f7946c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2414gu f7947d;

    /* renamed from: e */
    private Context f7948e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2526ju f7949f;

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m11188h(C2265cu cuVar) {
        synchronized (cuVar.f7946c) {
            C2414gu guVar = cuVar.f7947d;
            if (guVar != null) {
                if (guVar.mo17338a() || cuVar.f7947d.mo17344f()) {
                    cuVar.f7947d.mo17343e();
                }
                cuVar.f7947d = null;
                cuVar.f7949f = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11190l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7946c
            monitor-enter(r0)
            android.content.Context r1 = r3.f7948e     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.gu r1 = r3.f7947d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.au r1 = new com.google.android.gms.internal.ads.au     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.bu r2 = new com.google.android.gms.internal.ads.bu     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.gu r1 = r3.mo9352d(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.f7947d = r1     // Catch:{ all -> 0x0023 }
            r1.mo17355u()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2265cu.m11190l():void");
    }

    /* renamed from: a */
    public final long mo9350a(C2451hu huVar) {
        synchronized (this.f7946c) {
            if (this.f7949f == null) {
                return -2;
            }
            if (this.f7947d.mo10644n0()) {
                try {
                    long i5 = this.f7949f.mo11514i5(huVar);
                    return i5;
                } catch (RemoteException e) {
                    pm0.m18665e("Unable to call into cache service.", e);
                    return -2;
                }
            }
        }
    }

    /* renamed from: b */
    public final C2302du mo9351b(C2451hu huVar) {
        synchronized (this.f7946c) {
            if (this.f7949f == null) {
                C2302du duVar = new C2302du();
                return duVar;
            }
            try {
                if (this.f7947d.mo10644n0()) {
                    C2302du r6 = this.f7949f.mo11515r6(huVar);
                    return r6;
                }
                C2302du T5 = this.f7949f.mo11513T5(huVar);
                return T5;
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call into cache service.", e);
                return new C2302du();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized C2414gu mo9352d(C4087c.C4088a aVar, C4087c.C4089b bVar) {
        return new C2414gu(this.f7948e, C4409t.m29330v().mo18569b(), aVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9353i(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f7946c
            monitor-enter(r0)
            android.content.Context r1 = r2.f7948e     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f7948e = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14651p3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo12227b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m11190l()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14641o3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo12227b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zt r3 = new com.google.android.gms.internal.ads.zt     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.os r1 = p053g4.C4409t.m29312d()     // Catch:{ all -> 0x0048 }
            r1.mo13029c(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2265cu.mo9353i(android.content.Context):void");
    }

    /* renamed from: j */
    public final void mo9354j() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14661q3)).booleanValue()) {
            synchronized (this.f7946c) {
                m11190l();
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14681s3)).booleanValue()) {
                    ScheduledFuture scheduledFuture = this.f7944a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f7944a = dn0.f8328d.schedule(this.f7945b, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14671r3)).longValue(), TimeUnit.MILLISECONDS);
                } else {
                    b53 b53 = C4751b2.f25403i;
                    b53.removeCallbacks(this.f7945b);
                    b53.postDelayed(this.f7945b, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14671r3)).longValue());
                }
            }
        }
    }
}
