package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ak0 implements C2894tr {

    /* renamed from: a */
    private final Context f6651a;

    /* renamed from: b */
    private final Object f6652b;

    /* renamed from: c */
    private final String f6653c;

    /* renamed from: d */
    private boolean f6654d;

    public ak0(Context context, String str) {
        this.f6651a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6653c = str;
        this.f6654d = false;
        this.f6652b = new Object();
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        mo8418b(srVar.f17627j);
    }

    /* renamed from: a */
    public final String mo8417a() {
        return this.f6653c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8418b(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.sk0 r0 = p053g4.C4409t.m29324p()
            android.content.Context r1 = r3.f6651a
            boolean r0 = r0.mo14043z(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f6652b
            monitor-enter(r0)
            boolean r1 = r3.f6654d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f6654d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f6653c     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f6654d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.sk0 r4 = p053g4.C4409t.m29324p()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f6651a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f6653c     // Catch:{ all -> 0x003f }
            r4.mo14030m(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.sk0 r4 = p053g4.C4409t.m29324p()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f6651a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f6653c     // Catch:{ all -> 0x003f }
            r4.mo14031n(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ak0.mo8418b(boolean):void");
    }
}
