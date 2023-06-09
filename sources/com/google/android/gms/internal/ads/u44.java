package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u44 extends gc0 {

    /* renamed from: s */
    public static final za4 f18376s = s44.f17260a;

    /* renamed from: d */
    public final int f18377d;

    /* renamed from: e */
    public final String f18378e;

    /* renamed from: f */
    public final int f18379f;

    /* renamed from: g */
    public final C2388g4 f18380g;

    /* renamed from: h */
    public final int f18381h;

    /* renamed from: i */
    public final l30 f18382i;

    /* renamed from: r */
    final boolean f18383r;

    private u44(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C2388g4) null, 4, false);
    }

    /* renamed from: b */
    public static u44 m21409b(Throwable th, String str, int i, C2388g4 g4Var, int i2, boolean z, int i3) {
        return new u44(1, th, (String) null, i3, str, i, g4Var, g4Var == null ? 4 : i2, z);
    }

    /* renamed from: c */
    public static u44 m21410c(IOException iOException, int i) {
        return new u44(0, iOException, i);
    }

    /* renamed from: d */
    public static u44 m21411d(RuntimeException runtimeException, int i) {
        return new u44(2, runtimeException, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final u44 mo14451a(l30 l30) {
        String message = getMessage();
        int i = gb2.f9812a;
        return new u44(message, getCause(), this.f9830a, this.f18377d, this.f18378e, this.f18379f, this.f18380g, this.f18381h, l30, this.f9831b, this.f18383r);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u44(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.C2388g4 r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x003e
            r0 = 1
            if (r4 == r0) goto L_0x000d
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L_0x0044
        L_0x000d:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.gb2.m13179m(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", format_supported="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x0044
        L_0x003e:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L_0x0044:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L_0x0051:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u44.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.g4, int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u44(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.google.android.gms.internal.ads.C2388g4 r15, int r16, com.google.android.gms.internal.ads.l30 r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0017
            r2 = r12
            if (r2 != r1) goto L_0x0015
            r2 = 1
            goto L_0x0018
        L_0x0015:
            r3 = 0
            goto L_0x0019
        L_0x0017:
            r2 = r12
        L_0x0018:
            r3 = 1
        L_0x0019:
            com.google.android.gms.internal.ads.v91.m22050d(r3)
            if (r10 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            com.google.android.gms.internal.ads.v91.m22050d(r0)
            r6.f18377d = r2
            r0 = r13
            r6.f18378e = r0
            r0 = r14
            r6.f18379f = r0
            r0 = r15
            r6.f18380g = r0
            r0 = r16
            r6.f18381h = r0
            r0 = r17
            r6.f18382i = r0
            r6.f18383r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u44.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.g4, int, com.google.android.gms.internal.ads.l30, long, boolean):void");
    }
}
