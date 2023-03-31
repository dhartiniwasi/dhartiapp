package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class q92 implements uj1 {

    /* renamed from: a */
    private final Context f16299a;

    /* renamed from: b */
    private final ls1 f16300b;

    /* renamed from: c */
    private final et2 f16301c;

    /* renamed from: d */
    private final vm0 f16302d;

    /* renamed from: e */
    private final is2 f16303e;

    /* renamed from: f */
    private final lf3 f16304f;

    /* renamed from: g */
    private final vs0 f16305g;

    /* renamed from: h */
    private final h60 f16306h;

    /* renamed from: i */
    private final boolean f16307i;

    q92(Context context, ls1 ls1, et2 et2, vm0 vm0, is2 is2, lf3 lf3, vs0 vs0, h60 h60, boolean z) {
        this.f16299a = context;
        this.f16300b = ls1;
        this.f16301c = et2;
        this.f16302d = vm0;
        this.f16303e = is2;
        this.f16304f = lf3;
        this.f16305g = vs0;
        this.f16306h = h60;
        this.f16307i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10408a(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.ja1 r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.lf3 r0 = r1.f16304f
            java.lang.Object r0 = com.google.android.gms.internal.ads.cf3.m10919q(r0)
            com.google.android.gms.internal.ads.qr1 r0 = (com.google.android.gms.internal.ads.qr1) r0
            com.google.android.gms.internal.ads.is2 r2 = r1.f16303e     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.vs0 r3 = r1.f16305g     // Catch:{ ht0 -> 0x00fc }
            boolean r3 = r3.mo12107e1()     // Catch:{ ht0 -> 0x00fc }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.vs0 r2 = r1.f16305g     // Catch:{ ht0 -> 0x00fc }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14303G0     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.lz r5 = p060h4.C4596v.m30088c()     // Catch:{ ht0 -> 0x00fc }
            java.lang.Object r3 = r5.mo12227b(r3)     // Catch:{ ht0 -> 0x00fc }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ht0 -> 0x00fc }
            boolean r3 = r3.booleanValue()     // Catch:{ ht0 -> 0x00fc }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.vs0 r2 = r1.f16305g     // Catch:{ ht0 -> 0x00fc }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.ls1 r3 = r1.f16300b     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.et2 r5 = r1.f16301c     // Catch:{ ht0 -> 0x00fc }
            h4.q4 r5 = r5.f8934e     // Catch:{ ht0 -> 0x00fc }
            r6 = 0
            com.google.android.gms.internal.ads.vs0 r3 = r3.mo12076a(r5, r6, r6)     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.zh1 r5 = r0.mo11817i()     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.w60.m22606b(r3, r5)     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.qs1 r5 = new com.google.android.gms.internal.ads.qs1     // Catch:{ ht0 -> 0x00fc }
            r5.<init>()     // Catch:{ ht0 -> 0x00fc }
            android.content.Context r7 = r1.f16299a     // Catch:{ ht0 -> 0x00fc }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ ht0 -> 0x00fc }
            r5.mo13599a(r7, r8)     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.ks1 r7 = r0.mo11820l()     // Catch:{ ht0 -> 0x00fc }
            boolean r8 = r1.f16307i     // Catch:{ ht0 -> 0x00fc }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.h60 r8 = r1.f16306h     // Catch:{ ht0 -> 0x00fc }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.mo11795i(r3, r4, r8)     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.ku0 r7 = r3.mo12108f0()     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.o92 r8 = new com.google.android.gms.internal.ads.o92     // Catch:{ ht0 -> 0x00fc }
            r8.<init>(r5, r3)     // Catch:{ ht0 -> 0x00fc }
            r7.mo9283G(r8)     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.ku0 r5 = r3.mo12108f0()     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.p92 r7 = new com.google.android.gms.internal.ads.p92     // Catch:{ ht0 -> 0x00fc }
            r7.<init>(r3)     // Catch:{ ht0 -> 0x00fc }
            r5.mo9290P(r7)     // Catch:{ ht0 -> 0x00fc }
            com.google.android.gms.internal.ads.ns2 r2 = r2.f11003t     // Catch:{ ht0 -> 0x00fc }
            java.lang.String r5 = r2.f14184b     // Catch:{ ht0 -> 0x00fc }
            java.lang.String r2 = r2.f14183a     // Catch:{ ht0 -> 0x00fc }
            r3.mo12115i1(r5, r2, r6)     // Catch:{ ht0 -> 0x00fc }
            r11 = r3
        L_0x007e:
            r11.mo12119l1(r4)
            g4.j r2 = new g4.j
            boolean r3 = r1.f16307i
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.h60 r3 = r1.f16306h
            boolean r3 = r3.mo10745e(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            p053g4.C4409t.m29326r()
            android.content.Context r3 = r1.f16299a
            boolean r14 = p073j4.C4751b2.m30610e(r3)
            boolean r3 = r1.f16307i
            if (r3 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.h60 r5 = r1.f16306h
            boolean r5 = r5.mo10744d()
            r15 = r5
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            if (r3 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.h60 r3 = r1.f16306h
            float r3 = r3.mo10741a()
            r16 = r3
            goto L_0x00b5
        L_0x00b2:
            r3 = 0
            r16 = 0
        L_0x00b5:
            com.google.android.gms.internal.ads.is2 r3 = r1.f16303e
            r17 = -1
            boolean r5 = r3.f10957P
            boolean r3 = r3.f10958Q
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00cc
            r24.mo11349T()
        L_0x00cc:
            p053g4.C4409t.m29319k()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.jj1 r9 = r0.mo11818j()
            com.google.android.gms.internal.ads.is2 r0 = r1.f16303e
            int r12 = r0.f10959R
            com.google.android.gms.internal.ads.vm0 r13 = r1.f16302d
            java.lang.String r14 = r0.f10944C
            com.google.android.gms.internal.ads.ns2 r0 = r0.f11003t
            r8 = 0
            r10 = 0
            java.lang.String r5 = r0.f14184b
            java.lang.String r0 = r0.f14183a
            com.google.android.gms.internal.ads.et2 r6 = r1.f16301c
            java.lang.String r6 = r6.f8935f
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((p060h4.C4470a) r8, (p066i4.C4680t) r9, (p066i4.C4665e0) r10, (com.google.android.gms.internal.ads.vs0) r11, (int) r12, (com.google.android.gms.internal.ads.vm0) r13, (java.lang.String) r14, (p053g4.C4399j) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.ja1) r19)
            r0 = r23
            p066i4.C4679s.m30352a(r0, r3, r4)
            return
        L_0x00fc:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.pm0.m18665e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q92.mo10408a(boolean, android.content.Context, com.google.android.gms.internal.ads.ja1):void");
    }
}
