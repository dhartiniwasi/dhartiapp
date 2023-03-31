package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.ne */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2658ne implements C2807re {

    /* renamed from: x */
    private static C2658ne f13965x;

    /* renamed from: a */
    private final Context f13966a;

    /* renamed from: b */
    private final u33 f13967b;

    /* renamed from: c */
    private final b43 f13968c;

    /* renamed from: d */
    private final d43 f13969d;

    /* renamed from: e */
    private final C2734pf f13970e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final e23 f13971f;

    /* renamed from: g */
    private final Executor f13972g;

    /* renamed from: h */
    private final a43 f13973h;

    /* renamed from: i */
    private final CountDownLatch f13974i;

    /* renamed from: r */
    private final C2363fg f13975r;

    /* renamed from: s */
    volatile long f13976s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Object f13977t = new Object();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public volatile boolean f13978u;

    /* renamed from: v */
    private volatile boolean f13979v = false;

    /* renamed from: w */
    private final int f13980w;

    C2658ne(Context context, e23 e23, u33 u33, b43 b43, d43 d43, C2734pf pfVar, Executor executor, z13 z13, int i, C2363fg fgVar) {
        this.f13966a = context;
        this.f13971f = e23;
        this.f13967b = u33;
        this.f13968c = b43;
        this.f13969d = d43;
        this.f13970e = pfVar;
        this.f13972g = executor;
        this.f13980w = i;
        this.f13975r = fgVar;
        this.f13974i = new CountDownLatch(1);
        this.f13973h = new C2584le(this, z13);
    }

    /* renamed from: h */
    public static synchronized C2658ne m17046h(String str, Context context, boolean z, boolean z2) {
        C2658ne i;
        synchronized (C2658ne.class) {
            i = m17047i(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return i;
    }

    @Deprecated
    /* renamed from: i */
    public static synchronized C2658ne m17047i(String str, Context context, Executor executor, boolean z, boolean z2) {
        C2658ne neVar;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (C2658ne.class) {
            if (f13965x == null) {
                f23 a = g23.m12992a();
                a.mo10062a(str);
                a.mo10064c(z);
                g23 d = a.mo10065d();
                e23 a2 = e23.m11882a(context2, executor2, z2);
                C3103ze c = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14255B2)).booleanValue() ? C3103ze.m24546c(context) : null;
                C2363fg d2 = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14265C2)).booleanValue() ? C2363fg.m12594d(context, executor) : null;
                y23 e = y23.m23722e(context2, executor2, a2, d);
                C2696of ofVar = new C2696of(context2);
                C2734pf pfVar = new C2734pf(d, e, new C2288dg(context2, ofVar), ofVar, c, d2);
                int b = h33.m13695b(context2, a2);
                z13 z13 = new z13();
                C2658ne neVar2 = new C2658ne(context, a2, new u33(context2, b), new b43(context2, b, new C2547ke(a2), ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14424S1)).booleanValue()), new d43(context2, pfVar, a2, z13), pfVar, executor, z13, b, d2);
                f13965x = neVar2;
                neVar2.mo12597n();
                f13965x.mo12598o();
            }
            neVar = f13965x;
        }
        return neVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.mo12916I().mo13799O().equals(r5.mo13799O()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.f13971f.mo9789d(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.f13974i;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m17051m(com.google.android.gms.internal.ads.C2658ne r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.t33 r3 = r12.m17054s(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.rh r4 = r3.mo14199a()
            java.lang.String r4 = r4.mo13800P()
            com.google.android.gms.internal.ads.rh r3 = r3.mo14199a()
            java.lang.String r3 = r3.mo13799O()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.f13966a     // Catch:{ ey3 -> 0x012a }
            r6 = 1
            int r7 = r12.f13980w     // Catch:{ ey3 -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.e23 r11 = r12.f13971f     // Catch:{ ey3 -> 0x012a }
            com.google.android.gms.internal.ads.y33 r3 = com.google.android.gms.internal.ads.p23.m18303a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ ey3 -> 0x012a }
            byte[] r4 = r3.f20460b     // Catch:{ ey3 -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ ey3 -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.jw3 r4 = com.google.android.gms.internal.ads.jw3.m15086K(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.ex3 r5 = com.google.android.gms.internal.ads.ex3.m12308a()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.oh r4 = com.google.android.gms.internal.ads.C2698oh.m17773H(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.rh r5 = r4.mo12916I()     // Catch:{ ey3 -> 0x012a }
            java.lang.String r5 = r5.mo13800P()     // Catch:{ ey3 -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ ey3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.rh r5 = r4.mo12916I()     // Catch:{ ey3 -> 0x012a }
            java.lang.String r5 = r5.mo13799O()     // Catch:{ ey3 -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ ey3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.jw3 r5 = r4.mo12917J()     // Catch:{ ey3 -> 0x012a }
            byte[] r5 = r5.mo11531j()     // Catch:{ ey3 -> 0x012a }
            int r5 = r5.length     // Catch:{ ey3 -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.t33 r5 = r12.m17054s(r2)     // Catch:{ ey3 -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.rh r5 = r5.mo14199a()     // Catch:{ ey3 -> 0x012a }
            com.google.android.gms.internal.ads.rh r6 = r4.mo12916I()     // Catch:{ ey3 -> 0x012a }
            java.lang.String r6 = r6.mo13800P()     // Catch:{ ey3 -> 0x012a }
            java.lang.String r7 = r5.mo13800P()     // Catch:{ ey3 -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ ey3 -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.rh r6 = r4.mo12916I()     // Catch:{ ey3 -> 0x012a }
            java.lang.String r6 = r6.mo13799O()     // Catch:{ ey3 -> 0x012a }
            java.lang.String r5 = r5.mo13799O()     // Catch:{ ey3 -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ ey3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.a43 r5 = r12.f13973h     // Catch:{ ey3 -> 0x012a }
            int r3 = r3.f20461c     // Catch:{ ey3 -> 0x012a }
            com.google.android.gms.internal.ads.ez r6 = com.google.android.gms.internal.ads.C2679nz.f14404Q1     // Catch:{ ey3 -> 0x012a }
            com.google.android.gms.internal.ads.lz r7 = p060h4.C4596v.m30088c()     // Catch:{ ey3 -> 0x012a }
            java.lang.Object r6 = r7.mo12227b(r6)     // Catch:{ ey3 -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ ey3 -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ ey3 -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.b43 r3 = r12.f13968c     // Catch:{ ey3 -> 0x012a }
            boolean r3 = r3.mo8671a(r4)     // Catch:{ ey3 -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.b43 r3 = r12.f13968c     // Catch:{ ey3 -> 0x012a }
            boolean r3 = r3.mo8672b(r4, r5)     // Catch:{ ey3 -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.u33 r3 = r12.f13967b     // Catch:{ ey3 -> 0x012a }
            boolean r3 = r3.mo14443b(r4, r5)     // Catch:{ ey3 -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.e23 r2 = r12.f13971f     // Catch:{ ey3 -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ey3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo9789d(r3, r4)     // Catch:{ ey3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.t33 r3 = r12.m17054s(r2)     // Catch:{ ey3 -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.d43 r4 = r12.f13969d     // Catch:{ ey3 -> 0x012a }
            boolean r3 = r4.mo9434c(r3)     // Catch:{ ey3 -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.f13979v = r2     // Catch:{ ey3 -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ ey3 -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.f13976s = r2     // Catch:{ ey3 -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.e23 r2 = r12.f13971f     // Catch:{ ey3 -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ey3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo9789d(r3, r4)     // Catch:{ ey3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.e23 r2 = r12.f13971f     // Catch:{ ey3 -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ey3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo9789d(r3, r4)     // Catch:{ ey3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.e23 r2 = r12.f13971f     // Catch:{ ey3 -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ey3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo9789d(r3, r4)     // Catch:{ ey3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.e23 r3 = r12.f13971f     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.mo9788c(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.f13974i
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2658ne.m17051m(com.google.android.gms.internal.ads.ne):void");
    }

    /* renamed from: r */
    private final void m17053r() {
        C2363fg fgVar = this.f13975r;
        if (fgVar != null) {
            fgVar.mo10160h();
        }
    }

    /* renamed from: s */
    private final t33 m17054s(int i) {
        if (!h33.m13694a(this.f13980w)) {
            return null;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14404Q1)).booleanValue()) {
            return this.f13968c.mo8673c(1);
        }
        return this.f13967b.mo14445d(1);
    }

    /* renamed from: a */
    public final void mo12590a(View view) {
        this.f13970e.mo13268a(view);
    }

    /* renamed from: b */
    public final String mo12591b(Context context) {
        m17053r();
        mo12598o();
        i23 a = this.f13969d.mo9432a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a.mo11009a(context, (String) null);
        this.f13971f.mo9791f(5001, System.currentTimeMillis() - currentTimeMillis, a2, (Map) null);
        return a2;
    }

    /* renamed from: c */
    public final void mo12592c(int i, int i2, int i3) {
    }

    /* renamed from: d */
    public final String mo12593d(Context context, String str, View view, Activity activity) {
        m17053r();
        mo12598o();
        i23 a = this.f13969d.mo9432a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = a.mo11011c(context, (String) null, str, view, activity);
        this.f13971f.mo9791f(5000, System.currentTimeMillis() - currentTimeMillis, c, (Map) null);
        return c;
    }

    /* renamed from: e */
    public final void mo12594e(MotionEvent motionEvent) {
        i23 a = this.f13969d.mo9432a();
        if (a != null) {
            try {
                a.mo11010b((String) null, motionEvent);
            } catch (c43 e) {
                this.f13971f.mo9788c(e.mo9018a(), -1, e);
            }
        }
    }

    /* renamed from: f */
    public final String mo12595f(Context context, View view, Activity activity) {
        m17053r();
        mo12598o();
        i23 a = this.f13969d.mo9432a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d = a.mo11012d(context, (String) null, view, activity);
        this.f13971f.mo9791f(5002, System.currentTimeMillis() - currentTimeMillis, d, (Map) null);
        return d;
    }

    /* renamed from: g */
    public final String mo12596g(Context context, String str, View view) {
        return mo12593d(context, str, view, (Activity) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo12597n() {
        long currentTimeMillis = System.currentTimeMillis();
        t33 s = m17054s(1);
        if (s == null) {
            this.f13971f.mo9789d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f13969d.mo9434c(s)) {
            this.f13979v = true;
            this.f13974i.countDown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12598o() {
        /*
            r6 = this;
            boolean r0 = r6.f13978u
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.f13977t
            monitor-enter(r0)
            boolean r1 = r6.f13978u     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.f13976s     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.d43 r1 = r6.f13969d     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.t33 r1 = r1.mo9433b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.mo14202d(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.f13980w     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.h33.m13694a(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.f13972g     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.me r2 = new com.google.android.gms.internal.ads.me     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2658ne.mo12598o():void");
    }

    /* renamed from: q */
    public final synchronized boolean mo12599q() {
        return this.f13979v;
    }
}
