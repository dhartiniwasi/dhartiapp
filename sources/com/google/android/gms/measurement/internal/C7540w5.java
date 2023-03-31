package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7003i1;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7540w5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7003i1 f33156a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f33157b;

    C7540w5(C7388i6 i6Var, C7003i1 i1Var) {
        this.f33157b = i6Var;
        this.f33156a = i1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009a A[SYNTHETIC, Splitter:B:15:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.i6 r0 = r7.f33157b
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.l8 r0 = r0.mo24422M()
            com.google.android.gms.internal.measurement.C6966fe.m40031b()
            com.google.android.gms.measurement.internal.j4 r1 = r0.f32389a
            com.google.android.gms.measurement.internal.h r1 = r1.mo24443z()
            com.google.android.gms.measurement.internal.t2 r2 = com.google.android.gms.measurement.internal.C7516u2.f33083w0
            r3 = 0
            boolean r1 = r1.mo24279B(r3, r2)
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.measurement.internal.j4 r1 = r0.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            y5.b r1 = r1.mo24644p()
            y5.a r2 = p402y5.C13018a.ANALYTICS_STORAGE
            boolean r1 = r1.mo38074i(r2)
            if (r1 != 0) goto L_0x003c
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24262x()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.mo24208a(r1)
            goto L_0x0085
        L_0x003c:
            com.google.android.gms.measurement.internal.j4 r1 = r0.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.j4 r2 = r0.f32389a
            i5.e r2 = r2.mo24116a()
            long r4 = r2.mo18370a()
            boolean r1 = r1.mo24649v(r4)
            if (r1 != 0) goto L_0x0085
            com.google.android.gms.measurement.internal.j4 r1 = r0.f32389a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo24416F()
            com.google.android.gms.measurement.internal.p3 r1 = r1.f32958p
            long r1 = r1.mo24604a()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo24416F()
            com.google.android.gms.measurement.internal.p3 r0 = r0.f32958p
            long r0 = r0.mo24604a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0086
        L_0x0076:
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24262x()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.mo24208a(r1)
        L_0x0085:
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.i6 r1 = r7.f33157b
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo24423N()
            com.google.android.gms.internal.measurement.i1 r2 = r7.f33156a
            long r3 = r0.longValue()
            r1.mo24372I(r2, r3)
            return
        L_0x009a:
            com.google.android.gms.internal.measurement.i1 r0 = r7.f33156a     // Catch:{ RemoteException -> 0x00a0 }
            r0.mo23037L2(r3)     // Catch:{ RemoteException -> 0x00a0 }
            return
        L_0x00a0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.i6 r1 = r7.f33157b
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24256q()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.mo24209b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7540w5.run():void");
    }
}
