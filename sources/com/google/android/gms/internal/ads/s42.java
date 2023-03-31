package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import p066i4.C4678r;
import p073j4.C4811t0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class s42 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ gv1 f17250a;

    /* renamed from: b */
    public final /* synthetic */ Activity f17251b;

    /* renamed from: c */
    public final /* synthetic */ ux2 f17252c;

    /* renamed from: d */
    public final /* synthetic */ o42 f17253d;

    /* renamed from: e */
    public final /* synthetic */ String f17254e;

    /* renamed from: f */
    public final /* synthetic */ C4811t0 f17255f;

    /* renamed from: g */
    public final /* synthetic */ String f17256g;

    /* renamed from: h */
    public final /* synthetic */ Resources f17257h;

    /* renamed from: i */
    public final /* synthetic */ C4678r f17258i;

    public /* synthetic */ s42(gv1 gv1, Activity activity, ux2 ux2, o42 o42, String str, C4811t0 t0Var, String str2, Resources resources, C4678r rVar) {
        this.f17250a = gv1;
        this.f17251b = activity;
        this.f17252c = ux2;
        this.f17253d = o42;
        this.f17254e = str;
        this.f17255f = t0Var;
        this.f17256g = str2;
        this.f17257h = resources;
        this.f17258i = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0.zzf(p088l5.C4956b.m31385o3(r10), r14, r13) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.gms.internal.ads.gv1 r9 = r1.f17250a
            android.app.Activity r10 = r1.f17251b
            com.google.android.gms.internal.ads.ux2 r11 = r1.f17252c
            com.google.android.gms.internal.ads.o42 r12 = r1.f17253d
            java.lang.String r13 = r1.f17254e
            j4.t0 r0 = r1.f17255f
            java.lang.String r14 = r1.f17256g
            android.content.res.Resources r15 = r1.f17257h
            i4.r r8 = r1.f17258i
            if (r9 == 0) goto L_0x0034
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r2 = "dialog_action"
            java.lang.String r3 = "confirm"
            r7.put(r2, r3)
            java.lang.String r16 = "dialog_click"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r17 = r7
            r7 = r16
            r1 = r8
            r8 = r17
            com.google.android.gms.internal.ads.w42.m22576K6(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0035
        L_0x0034:
            r1 = r8
        L_0x0035:
            l5.a r2 = p088l5.C4956b.m31385o3(r10)     // Catch:{ RemoteException -> 0x0040 }
            boolean r0 = r0.zzf(r2, r14, r13)     // Catch:{ RemoteException -> 0x0040 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.pm0.m18665e(r2, r0)
        L_0x0046:
            r12.mo12821f(r13)
            if (r9 == 0) goto L_0x0055
            java.lang.String r7 = "offline_notification_worker_not_scheduled"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.android.gms.internal.ads.w42.m22575J6(r2, r3, r4, r5, r6, r7)
        L_0x0055:
            p053g4.C4409t.m29326r()
            android.app.AlertDialog$Builder r0 = p073j4.C4751b2.m30612g(r10)
            if (r15 != 0) goto L_0x0061
            java.lang.String r2 = "You'll get a notification with the link when you're back online"
            goto L_0x0067
        L_0x0061:
            int r2 = p039e4.C4239b.f23601d
            java.lang.String r2 = r15.getString(r2)
        L_0x0067:
            android.app.AlertDialog$Builder r2 = r0.setMessage(r2)
            com.google.android.gms.internal.ads.r42 r3 = new com.google.android.gms.internal.ads.r42
            r3.<init>(r1)
            r2.setOnCancelListener(r3)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            com.google.android.gms.internal.ads.v42 r3 = new com.google.android.gms.internal.ads.v42
            r3.<init>(r0, r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.schedule(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s42.onClick(android.content.DialogInterface, int):void");
    }
}
