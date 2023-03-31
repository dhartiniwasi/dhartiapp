package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p060h4.C4571q4;
import p060h4.C4596v;
import p073j4.C4820w0;
import p179z3.C6322a0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i62 implements k52 {

    /* renamed from: a */
    private final Context f10630a;

    /* renamed from: b */
    private final o41 f10631b;

    /* renamed from: c */
    private final Executor f10632c;

    public i62(Context context, o41 o41, Executor executor) {
        this.f10630a = context;
        this.f10631b = o41;
        this.f10632c = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo8260a(com.google.android.gms.internal.ads.us2 r7, com.google.android.gms.internal.ads.is2 r8, com.google.android.gms.internal.ads.g52 r9) throws com.google.android.gms.internal.ads.jt2, com.google.android.gms.internal.ads.v82 {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14339J6
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.f10985i0
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.f9705b
            com.google.android.gms.internal.ads.au2 r0 = (com.google.android.gms.internal.ads.au2) r0
            com.google.android.gms.internal.ads.zb0 r0 = r0.mo8542f()
            if (r0 == 0) goto L_0x0067
            l5.a r2 = r0.mo13526a()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = p088l5.C4956b.m31384P0(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.mo13525T()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.lf3 r0 = com.google.android.gms.internal.ads.cf3.m10911i(r1)
            com.google.android.gms.internal.ads.h62 r3 = new com.google.android.gms.internal.ads.h62
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.mf3 r2 = com.google.android.gms.internal.ads.dn0.f8329e
            com.google.android.gms.internal.ads.lf3 r0 = com.google.android.gms.internal.ads.cf3.m10916n(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.jt2 r8 = new com.google.android.gms.internal.ads.jt2
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.jt2 r7 = new com.google.android.gms.internal.ads.jt2
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.jt2 r8 = new com.google.android.gms.internal.ads.jt2
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.pm0.m18664d(r7)
            com.google.android.gms.internal.ads.jt2 r8 = new com.google.android.gms.internal.ads.jt2
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.f9705b
            com.google.android.gms.internal.ads.au2 r0 = (com.google.android.gms.internal.ads.au2) r0
            android.view.View r2 = r0.mo8540d()
        L_0x007f:
            com.google.android.gms.internal.ads.o41 r0 = r6.f10631b
            com.google.android.gms.internal.ads.k61 r3 = new com.google.android.gms.internal.ads.k61
            java.lang.String r4 = r9.f9704a
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.y31 r7 = new com.google.android.gms.internal.ads.y31
            java.lang.Object r4 = r9.f9705b
            com.google.android.gms.internal.ads.au2 r4 = (com.google.android.gms.internal.ads.au2) r4
            com.google.android.gms.internal.ads.g62 r5 = new com.google.android.gms.internal.ads.g62
            r5.<init>(r4)
            java.util.List r8 = r8.f11005v
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.js2 r8 = (com.google.android.gms.internal.ads.js2) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.s31 r7 = r0.mo8570a(r3, r7)
            com.google.android.gms.internal.ads.lh1 r8 = r7.mo13940i()
            r8.mo12019p0(r2)
            com.google.android.gms.internal.ads.va1 r8 = r7.mo11814c()
            com.google.android.gms.internal.ads.c11 r0 = new com.google.android.gms.internal.ads.c11
            java.lang.Object r1 = r9.f9705b
            com.google.android.gms.internal.ads.au2 r1 = (com.google.android.gms.internal.ads.au2) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.f10632c
            r8.mo11669m0(r0, r1)
            com.google.android.gms.internal.ads.hb1 r8 = r9.f9706c
            com.google.android.gms.internal.ads.z62 r8 = (com.google.android.gms.internal.ads.z62) r8
            com.google.android.gms.internal.ads.ja2 r9 = r7.mo12210g()
            r8.mo15552J6(r9)
            com.google.android.gms.internal.ads.r31 r7 = r7.mo13939h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i62.mo8260a(com.google.android.gms.internal.ads.us2, com.google.android.gms.internal.ads.is2, com.google.android.gms.internal.ads.g52):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        C4571q4 a;
        C4571q4 q4Var = us2.f18722a.f17091a.f8934e;
        if (q4Var.f24985v) {
            a = new C4571q4(this.f10630a, C6322a0.m37263d(q4Var.f24976e, q4Var.f24973b));
        } else {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14339J6)).booleanValue() || !is2.f10985i0) {
                a = it2.m14548a(this.f10630a, is2.f11005v);
            } else {
                a = new C4571q4(this.f10630a, C6322a0.m37264e(q4Var.f24976e, q4Var.f24973b));
            }
        }
        C4571q4 q4Var2 = a;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14339J6)).booleanValue() || !is2.f10985i0) {
            ((au2) g52.f9705b).mo8551o(this.f10630a, q4Var2, us2.f18722a.f17091a.f8933d, is2.f11006w.toString(), C4820w0.m30822l(is2.f11003t), (wb0) g52.f9706c);
        } else {
            ((au2) g52.f9705b).mo8552p(this.f10630a, q4Var2, us2.f18722a.f17091a.f8933d, is2.f11006w.toString(), C4820w0.m30822l(is2.f11003t), (wb0) g52.f9706c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo11026c(View view, is2 is2, Object obj) throws Exception {
        return cf3.m10911i(g51.m13041a(this.f10630a, view, is2));
    }
}
