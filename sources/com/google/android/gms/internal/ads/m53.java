package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class m53 extends f63 {

    /* renamed from: a */
    private final IBinder f13219a;

    /* renamed from: b */
    private final String f13220b;

    /* renamed from: c */
    private final int f13221c;

    /* renamed from: d */
    private final float f13222d;

    /* renamed from: e */
    private final int f13223e;

    /* renamed from: f */
    private final String f13224f;

    /* synthetic */ m53(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, l53 l53) {
        this.f13219a = iBinder;
        this.f13220b = str;
        this.f13221c = i;
        this.f13222d = f;
        this.f13223e = i3;
        this.f13224f = str3;
    }

    /* renamed from: a */
    public final float mo10075a() {
        return this.f13222d;
    }

    /* renamed from: b */
    public final int mo10076b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo10077c() {
        return this.f13221c;
    }

    /* renamed from: d */
    public final int mo10078d() {
        return this.f13223e;
    }

    /* renamed from: e */
    public final IBinder mo10079e() {
        return this.f13219a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r1 = r4.f13224f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.f63
            r2 = 0
            if (r1 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.f63 r5 = (com.google.android.gms.internal.ads.f63) r5
            android.os.IBinder r1 = r4.f13219a
            android.os.IBinder r3 = r5.mo10079e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006c
            r5.mo10083i()
            java.lang.String r1 = r4.f13220b
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r5.mo10081g()
            if (r1 != 0) goto L_0x006c
            goto L_0x002f
        L_0x0025:
            java.lang.String r3 = r5.mo10081g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006c
        L_0x002f:
            int r1 = r4.f13221c
            int r3 = r5.mo10077c()
            if (r1 != r3) goto L_0x006c
            float r1 = r4.f13222d
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.mo10075a()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x006c
            r5.mo10076b()
            r5.mo10082h()
            int r1 = r4.f13223e
            int r3 = r5.mo10078d()
            if (r1 != r3) goto L_0x006c
            java.lang.String r1 = r4.f13224f
            if (r1 != 0) goto L_0x0060
            java.lang.String r5 = r5.mo10080f()
            if (r5 != 0) goto L_0x006c
            goto L_0x006b
        L_0x0060:
            java.lang.String r5 = r5.mo10080f()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            return r0
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m53.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo10080f() {
        return this.f13224f;
    }

    /* renamed from: g */
    public final String mo10081g() {
        return this.f13220b;
    }

    /* renamed from: h */
    public final String mo10082h() {
        return null;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f13219a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003;
        String str = this.f13220b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int floatToIntBits = (((((((hashCode ^ i) * 1000003) ^ this.f13221c) * 1000003) ^ Float.floatToIntBits(this.f13222d)) * 583896283) ^ this.f13223e) * 1000003;
        String str2 = this.f13224f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return floatToIntBits ^ i2;
    }

    /* renamed from: i */
    public final boolean mo10083i() {
        return false;
    }

    public final String toString() {
        String obj = this.f13219a.toString();
        String str = this.f13220b;
        int i = this.f13221c;
        float f = this.f13222d;
        int i2 = this.f13223e;
        String str2 = this.f13224f;
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", stableSessionToken=false, appId=" + str + ", layoutGravity=" + i + ", layoutVerticalMargin=" + f + ", displayMode=0, sessionToken=null, windowWidthPx=" + i2 + ", adFieldEnifd=" + str2 + "}";
    }
}
