package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p066i4.C4680t;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x11 implements C2894tr, ra1, C4680t, qa1 {

    /* renamed from: a */
    private final s11 f19932a;

    /* renamed from: b */
    private final t11 f19933b;

    /* renamed from: c */
    private final Set f19934c = new HashSet();

    /* renamed from: d */
    private final bb0 f19935d;

    /* renamed from: e */
    private final Executor f19936e;

    /* renamed from: f */
    private final C4691e f19937f;

    /* renamed from: g */
    private final AtomicBoolean f19938g = new AtomicBoolean(false);

    /* renamed from: h */
    private final w11 f19939h = new w11();

    /* renamed from: i */
    private boolean f19940i = false;

    /* renamed from: r */
    private WeakReference f19941r = new WeakReference(this);

    public x11(ya0 ya0, t11 t11, Executor executor, s11 s11, C4691e eVar) {
        this.f19932a = s11;
        ja0 ja0 = ma0.f13287b;
        this.f19935d = ya0.mo15352a("google.afma.activeView.handleUpdate", ja0, ja0);
        this.f19933b = t11;
        this.f19936e = executor;
        this.f19937f = eVar;
    }

    /* renamed from: k */
    private final void m23016k() {
        for (vs0 f : this.f19934c) {
            this.f19932a.mo13931f(f);
        }
        this.f19932a.mo13930e();
    }

    /* renamed from: N */
    public final synchronized void mo8416N(C2857sr srVar) {
        w11 w11 = this.f19939h;
        w11.f19420a = srVar.f17627j;
        w11.f19425f = srVar;
        mo15028b();
    }

    /* renamed from: Z */
    public final synchronized void mo9822Z() {
        if (this.f19938g.compareAndSet(false, true)) {
            this.f19932a.mo13928c(this);
            mo15028b();
        }
    }

    /* renamed from: a */
    public final void mo8931a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15028b() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.f19941r     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.f19940i     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f19938g     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.w11 r0 = r5.f19939h     // Catch:{ Exception -> 0x0051 }
            i5.e r1 = r5.f19937f     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.mo18371b()     // Catch:{ Exception -> 0x0051 }
            r0.f19423d = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.t11 r0 = r5.f19933b     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.w11 r1 = r5.f19939h     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.mo10378c(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set r1 = r5.f19934c     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.vs0 r2 = (com.google.android.gms.internal.ads.vs0) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.f19936e     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.v11 r4 = new com.google.android.gms.internal.ads.v11     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.bb0 r1 = r5.f19935d     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.lf3 r0 = r1.mo8712c(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.gn0.m13406b(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            p073j4.C4794n1.m30694l(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.mo15031j()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x11.mo15028b():void");
    }

    /* renamed from: c */
    public final synchronized void mo9006c(Context context) {
        this.f19939h.f19421b = true;
        mo15028b();
    }

    /* renamed from: d */
    public final void mo8932d() {
    }

    /* renamed from: e */
    public final synchronized void mo9007e(Context context) {
        this.f19939h.f19424e = "u";
        mo15028b();
        m23016k();
        this.f19940i = true;
    }

    /* renamed from: f */
    public final synchronized void mo9008f(Context context) {
        this.f19939h.f19421b = false;
        mo15028b();
    }

    /* renamed from: g */
    public final synchronized void mo15029g(vs0 vs0) {
        this.f19934c.add(vs0);
        this.f19932a.mo13929d(vs0);
    }

    /* renamed from: h */
    public final void mo15030h(Object obj) {
        this.f19941r = new WeakReference(obj);
    }

    /* renamed from: i5 */
    public final synchronized void mo8933i5() {
        this.f19939h.f19421b = false;
        mo15028b();
    }

    /* renamed from: j */
    public final synchronized void mo15031j() {
        m23016k();
        this.f19940i = true;
    }

    /* renamed from: o3 */
    public final synchronized void mo8934o3() {
        this.f19939h.f19421b = true;
        mo15028b();
    }

    /* renamed from: p */
    public final void mo8935p(int i) {
    }

    /* renamed from: r6 */
    public final void mo8936r6() {
    }
}
