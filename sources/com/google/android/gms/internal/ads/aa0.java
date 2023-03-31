package com.google.android.gms.internal.ads;

import android.content.Context;
import p053g4.C4390a;
import p053g4.C4409t;
import p073j4.C4751b2;
import p073j4.C4757d0;
import p073j4.C4758d1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class aa0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f6499a = new Object();

    /* renamed from: b */
    private final Context f6500b;

    /* renamed from: c */
    private final String f6501c;

    /* renamed from: d */
    private final vm0 f6502d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final az2 f6503e;

    /* renamed from: f */
    private final C4757d0 f6504f;

    /* renamed from: g */
    private final C4757d0 f6505g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public z90 f6506h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f6507i = 1;

    public aa0(Context context, vm0 vm0, String str, C4757d0 d0Var, C4757d0 d0Var2, az2 az2) {
        this.f6501c = str;
        this.f6500b = context.getApplicationContext();
        this.f6502d = vm0;
        this.f6503e = az2;
        this.f6504f = d0Var;
        this.f6505g = d0Var2;
    }

    /* renamed from: b */
    public final u90 mo8282b(C2955ve veVar) {
        synchronized (this.f6499a) {
            synchronized (this.f6499a) {
                z90 z90 = this.f6506h;
                if (z90 != null && this.f6507i == 0) {
                    z90.mo13311e(new f90(this), g90.f9781a);
                }
            }
            z90 z902 = this.f6506h;
            if (z902 != null) {
                if (z902.mo13308a() != -1) {
                    int i = this.f6507i;
                    if (i == 0) {
                        u90 f = this.f6506h.mo15569f();
                        return f;
                    } else if (i == 1) {
                        this.f6507i = 2;
                        mo8283d((C2955ve) null);
                        u90 f2 = this.f6506h.mo15569f();
                        return f2;
                    } else {
                        u90 f3 = this.f6506h.mo15569f();
                        return f3;
                    }
                }
            }
            this.f6507i = 2;
            z90 d = mo8283d((C2955ve) null);
            this.f6506h = d;
            u90 f4 = d.mo15569f();
            return f4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final z90 mo8283d(C2955ve veVar) {
        ny2 a = my2.m16825a(this.f6500b, 6);
        a.mo11828T();
        z90 z90 = new z90(this.f6505g);
        dn0.f8329e.execute(new h90(this, (C2955ve) null, z90));
        z90.mo13311e(new p90(this, z90, a), new q90(this, z90, a));
        return z90;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo8284i(com.google.android.gms.internal.ads.z90 r4, com.google.android.gms.internal.ads.u80 r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6499a
            monitor-enter(r0)
            int r1 = r4.mo13308a()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.mo13308a()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.mo13309c()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.mf3 r4 = com.google.android.gms.internal.ads.dn0.f8329e     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.k90 r1 = new com.google.android.gms.internal.ads.k90     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            p073j4.C4794n1.m30693k(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa0.mo8284i(com.google.android.gms.internal.ads.z90, com.google.android.gms.internal.ads.u80):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo8285j(C2955ve veVar, z90 z90) {
        try {
            c90 c90 = new c90(this.f6500b, this.f6502d, (C2955ve) null, (C4390a) null);
            c90.mo9091u0(new j90(this, z90, c90));
            c90.mo8704x("/jsLoaded", new l90(this, z90, c90));
            C4758d1 d1Var = new C4758d1();
            m90 m90 = new m90(this, (C2955ve) null, c90, d1Var);
            d1Var.mo18447b(m90);
            c90.mo8704x("/requestReload", m90);
            if (this.f6501c.endsWith(".js")) {
                c90.mo9079M(this.f6501c);
            } else if (this.f6501c.startsWith("<html>")) {
                c90.mo9092v(this.f6501c);
            } else {
                c90.mo9080O(this.f6501c);
            }
            C4751b2.f25403i.postDelayed(new o90(this, z90, c90), 60000);
        } catch (Throwable th) {
            pm0.m18665e("Error creating webview.", th);
            C4409t.m29325q().mo15126t(th, "SdkJavascriptFactory.loadJavascriptEngine");
            z90.mo13309c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo8286k(u80 u80) {
        if (u80.mo9082V()) {
            this.f6507i = 1;
        }
    }
}
