package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import p053g4.C4409t;
import p088l5.C4954a;
import p124r.C5413a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h51 implements lb1, qa1 {

    /* renamed from: a */
    private final Context f10194a;

    /* renamed from: b */
    private final vs0 f10195b;

    /* renamed from: c */
    private final is2 f10196c;

    /* renamed from: d */
    private final vm0 f10197d;

    /* renamed from: e */
    private C4954a f10198e;

    /* renamed from: f */
    private boolean f10199f;

    public h51(Context context, vs0 vs0, is2 is2, vm0 vm0) {
        this.f10194a = context;
        this.f10195b = vs0;
        this.f10196c = is2;
        this.f10197d = vm0;
    }

    /* renamed from: a */
    private final synchronized void m13713a() {
        b52 b52;
        c52 c52;
        if (this.f10196c.f10962U) {
            if (this.f10195b != null) {
                if (C4409t.m29309a().mo15330d(this.f10194a)) {
                    vm0 vm0 = this.f10197d;
                    String str = vm0.f19151b + "." + vm0.f19152c;
                    String a = this.f10196c.f10964W.mo10946a();
                    if (this.f10196c.f10964W.mo10947b() == 1) {
                        b52 = b52.VIDEO;
                        c52 = c52.DEFINED_BY_JAVASCRIPT;
                    } else {
                        b52 = b52.HTML_DISPLAY;
                        if (this.f10196c.f10978f == 1) {
                            c52 = c52.ONE_PIXEL;
                        } else {
                            c52 = c52.BEGIN_TO_RENDER;
                        }
                    }
                    C4954a c = C4409t.m29309a().mo15329c(str, this.f10195b.mo12086A(), "", "javascript", a, c52, b52, this.f10196c.f10995n0);
                    this.f10198e = c;
                    vs0 vs0 = this.f10195b;
                    if (c != null) {
                        C4409t.m29309a().mo15328b(this.f10198e, (View) vs0);
                        this.f10195b.mo12116j1(this.f10198e);
                        C4409t.m29309a().mo15326D(this.f10198e);
                        this.f10199f = true;
                        this.f10195b.mo9081R("onSdkLoaded", new C5413a());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9822Z() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10199f     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.m13713a()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.is2 r0 = r3.f10196c     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.f10962U     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            l5.a r0 = r3.f10198e     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.vs0 r0 = r3.f10195b     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r.a r1 = new r.a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.mo9081R(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h51.mo9822Z():void");
    }

    /* renamed from: a0 */
    public final synchronized void mo10019a0() {
        if (!this.f10199f) {
            m13713a();
        }
    }
}
