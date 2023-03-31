package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tv2 {

    /* renamed from: a */
    private final mv2 f18267a;

    /* renamed from: b */
    private final lf3 f18268b;

    /* renamed from: c */
    private boolean f18269c = false;

    /* renamed from: d */
    private boolean f18270d = false;

    public tv2(qu2 qu2, lv2 lv2, mv2 mv2) {
        this.f18267a = mv2;
        this.f18268b = cf3.m10909g(cf3.m10916n(lv2.mo12157b(mv2), new rv2(this, lv2, qu2, mv2), mv2.mo12447d()), Exception.class, new sv2(this, lv2), mv2.mo12447d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.lf3 mo14399a(com.google.android.gms.internal.ads.mv2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f18270d     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.f18269c     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.mv2 r0 = r2.f18267a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.bv2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.bv2 r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.mv2 r0 = r2.f18267a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.bv2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.bv2 r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.f18269c = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.lf3 r3 = r2.f18268b     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tv2.mo14399a(com.google.android.gms.internal.ads.mv2):com.google.android.gms.internal.ads.lf3");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ lf3 mo14400b(lv2 lv2, qu2 qu2, mv2 mv2, zu2 zu2) throws Exception {
        synchronized (this) {
            this.f18270d = true;
            lv2.mo12156a(zu2);
            if (!this.f18269c) {
                qu2.mo13602a(mv2.zza(), zu2);
                lf3 i = cf3.m10911i((Object) null);
                return i;
            }
            lf3 i2 = cf3.m10911i(new kv2(zu2, mv2));
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo14401c(lv2 lv2, Exception exc) throws Exception {
        synchronized (this) {
            this.f18270d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void mo14402d(ye3 ye3) {
        cf3.m10920r(cf3.m10916n(this.f18268b, qv2.f16527a, this.f18267a.mo12447d()), ye3, this.f18267a.mo12447d());
    }
}
