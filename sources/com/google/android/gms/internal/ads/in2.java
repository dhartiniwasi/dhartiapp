package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import p060h4.C4596v;
import p060h4.C4607w4;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class in2 implements dd2 {

    /* renamed from: a */
    private final Context f10875a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f10876b;

    /* renamed from: c */
    protected final su0 f10877c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zn2 f10878d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final up2 f10879e;

    /* renamed from: f */
    private final vm0 f10880f;

    /* renamed from: g */
    private final ViewGroup f10881g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final az2 f10882h;

    /* renamed from: i */
    private final ct2 f10883i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public lf3 f10884j;

    protected in2(Context context, Executor executor, su0 su0, up2 up2, zn2 zn2, ct2 ct2, vm0 vm0) {
        this.f10875a = context;
        this.f10876b = executor;
        this.f10877c = su0;
        this.f10879e = up2;
        this.f10878d = zn2;
        this.f10883i = ct2;
        this.f10880f = vm0;
        this.f10881g = new FrameLayout(context);
        this.f10882h = su0.mo9709B();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized d91 m14443l(sp2 sp2) {
        hn2 hn2 = (hn2) sp2;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14495Z6)).booleanValue()) {
            n31 n31 = new n31(this.f10881g);
            f91 f91 = new f91();
            f91.mo10111c(this.f10875a);
            f91.mo10114f(hn2.f10428a);
            h91 g = f91.mo10115g();
            lf1 lf1 = new lf1();
            lf1.mo11999f(this.f10878d, this.f10876b);
            lf1.mo12008o(this.f10878d, this.f10876b);
            return mo8906b(n31, g, lf1.mo12010q());
        }
        zn2 f = zn2.m24693f(this.f10878d);
        lf1 lf12 = new lf1();
        lf12.mo11998e(f, this.f10876b);
        lf12.mo12003j(f, this.f10876b);
        lf12.mo12004k(f, this.f10876b);
        lf12.mo12005l(f, this.f10876b);
        lf12.mo11999f(f, this.f10876b);
        lf12.mo12008o(f, this.f10876b);
        lf12.mo12009p(f);
        n31 n312 = new n31(this.f10881g);
        f91 f912 = new f91();
        f912.mo10111c(this.f10875a);
        f912.mo10114f(hn2.f10428a);
        return mo8906b(n312, f912.mo10115g(), lf12.mo12010q());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo9556a(p060h4.C4541l4 r8, java.lang.String r9, com.google.android.gms.internal.ads.bd2 r10, com.google.android.gms.internal.ads.cd2 r11) throws android.os.RemoteException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.q00 r10 = com.google.android.gms.internal.ads.c10.f7558d     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.mo13438e()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.ez r10 = com.google.android.gms.internal.ads.C2679nz.f14371M8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r2.mo12227b(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x0025
            r10 = 1
            goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.vm0 r2 = r7.f10880f     // Catch:{ all -> 0x00f4 }
            int r2 = r2.f19152c     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14381N8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r4.mo12227b(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f4 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f4 }
            if (r2 < r3) goto L_0x003e
            if (r10 != 0) goto L_0x0043
        L_0x003e:
            java.lang.String r10 = "loadAd must be called on the main UI thread."
            p033d5.C4141r.m28216f(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0043:
            if (r9 != 0) goto L_0x0056
            java.lang.String r8 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.pm0.m18664d(r8)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r8 = r7.f10876b     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.cn2 r9 = new com.google.android.gms.internal.ads.cn2     // Catch:{ all -> 0x00f4 }
            r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.execute(r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.lf3 r10 = r7.f10884j     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x005c
            monitor-exit(r7)
            return r1
        L_0x005c:
            com.google.android.gms.internal.ads.q00 r10 = com.google.android.gms.internal.ads.x00.f19923c     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.mo13438e()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r1 = 7
            r2 = 0
            if (r10 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.up2 r10 = r7.f10879e     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r10.mo8487b()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r10 = r10.mo8487b()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.y21 r10 = (com.google.android.gms.internal.ads.y21) r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.yy2 r10 = r10.mo9828U()     // Catch:{ all -> 0x00f4 }
            r10.mo15522h(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r8.f24904x     // Catch:{ all -> 0x00f4 }
            r10.mo15516b(r3)     // Catch:{ all -> 0x00f4 }
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            android.content.Context r10 = r7.f10875a     // Catch:{ all -> 0x00f4 }
            boolean r3 = r8.f24894f     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.yt2.m24195a(r10, r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.ez r10 = com.google.android.gms.internal.ads.C2679nz.f14290E7     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r3.mo12227b(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            boolean r10 = r8.f24894f     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.su0 r10 = r7.f10877c     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.ey1 r10 = r10.mo9722o()     // Catch:{ all -> 0x00f4 }
            r10.mo10042m(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00af:
            com.google.android.gms.internal.ads.ct2 r10 = r7.f10883i     // Catch:{ all -> 0x00f4 }
            r10.mo9328J(r9)     // Catch:{ all -> 0x00f4 }
            h4.q4 r9 = p060h4.C4571q4.m29982J1()     // Catch:{ all -> 0x00f4 }
            r10.mo9327I(r9)     // Catch:{ all -> 0x00f4 }
            r10.mo9340e(r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.et2 r9 = r10.mo9342g()     // Catch:{ all -> 0x00f4 }
            android.content.Context r10 = r7.f10875a     // Catch:{ all -> 0x00f4 }
            int r3 = com.google.android.gms.internal.ads.xy2.m23614f(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.ny2 r5 = com.google.android.gms.internal.ads.my2.m16826b(r10, r3, r1, r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.hn2 r6 = new com.google.android.gms.internal.ads.hn2     // Catch:{ all -> 0x00f4 }
            r6.<init>(r2)     // Catch:{ all -> 0x00f4 }
            r6.f10428a = r9     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.up2 r8 = r7.f10879e     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.wp2 r9 = new com.google.android.gms.internal.ads.wp2     // Catch:{ all -> 0x00f4 }
            r9.<init>(r6, r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.dn2 r10 = new com.google.android.gms.internal.ads.dn2     // Catch:{ all -> 0x00f4 }
            r10.<init>(r7)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.lf3 r8 = r8.mo8486a(r9, r10, r2)     // Catch:{ all -> 0x00f4 }
            r7.f10884j = r8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.fn2 r9 = new com.google.android.gms.internal.ads.fn2     // Catch:{ all -> 0x00f4 }
            r1 = r9
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r10 = r7.f10876b     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.cf3.m10920r(r8, r9, r10)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r0
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in2.mo9556a(h4.l4, java.lang.String, com.google.android.gms.internal.ads.bd2, com.google.android.gms.internal.ads.cd2):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract d91 mo8906b(n31 n31, h91 h91, nf1 nf1);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo11178j() {
        this.f10878d.mo9420g(eu2.m12271d(6, (String) null, (C4623z2) null));
    }

    /* renamed from: k */
    public final void mo11179k(C4607w4 w4Var) {
        this.f10883i.mo9329K(w4Var);
    }

    public final boolean zza() {
        lf3 lf3 = this.f10884j;
        return lf3 != null && !lf3.isDone();
    }
}
