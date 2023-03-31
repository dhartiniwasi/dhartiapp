package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oe2 implements tj2 {

    /* renamed from: a */
    private final mf3 f15056a;

    /* renamed from: b */
    private final zs1 f15057b;

    /* renamed from: c */
    private final kx1 f15058c;

    /* renamed from: d */
    private final re2 f15059d;

    public oe2(mf3 mf3, zs1 zs1, kx1 kx1, re2 re2) {
        this.f15056a = mf3;
        this.f15057b = zs1;
        this.f15058c = kx1;
        this.f15059d = re2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[Catch:{ jt2 -> 0x005c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.qe2 mo12903a() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14599k1
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zs1 r3 = r7.f15057b     // Catch:{ jt2 -> 0x0060 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ jt2 -> 0x0060 }
            r4.<init>()     // Catch:{ jt2 -> 0x0060 }
            com.google.android.gms.internal.ads.au2 r3 = r3.mo15657c(r2, r4)     // Catch:{ jt2 -> 0x0060 }
            r3.mo8537a()     // Catch:{ jt2 -> 0x0060 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ jt2 -> 0x0060 }
            r4.<init>()     // Catch:{ jt2 -> 0x0060 }
            com.google.android.gms.internal.ads.wd0 r5 = r3.mo8545i()     // Catch:{ jt2 -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ jt2 -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ jt2 -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.wd0 r3 = r3.mo8544h()     // Catch:{ jt2 -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ jt2 -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ jt2 -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ jt2 -> 0x0060 }
            goto L_0x001f
        L_0x0060:
            goto L_0x001f
        L_0x0062:
            com.google.android.gms.internal.ads.qe2 r0 = new com.google.android.gms.internal.ads.qe2
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oe2.mo12903a():com.google.android.gms.internal.ads.qe2");
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (r83.m19615d((String) C4596v.m30088c().mo12227b(C2679nz.f14599k1)) || this.f15059d.mo13788b() || !this.f15058c.mo11811t()) {
            return cf3.m10911i(new qe2(new Bundle(), (pe2) null));
        }
        this.f15059d.mo13787a(true);
        return this.f15056a.mo12324a(new ne2(this));
    }

    public final int zza() {
        return 1;
    }
}
