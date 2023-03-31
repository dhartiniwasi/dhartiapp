package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class uj4 extends rj4 {

    /* renamed from: e */
    private final boolean f18567e;

    /* renamed from: f */
    private final jj4 f18568f;

    /* renamed from: g */
    private final boolean f18569g;

    /* renamed from: h */
    private final boolean f18570h;

    /* renamed from: i */
    private final int f18571i;

    /* renamed from: r */
    private final int f18572r;

    /* renamed from: s */
    private final int f18573s;

    /* renamed from: t */
    private final int f18574t;

    /* renamed from: u */
    private final boolean f18575u;

    /* renamed from: v */
    private final int f18576v;

    /* renamed from: w */
    private final boolean f18577w;

    /* renamed from: x */
    private final boolean f18578x;

    /* renamed from: y */
    private final int f18579y;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uj4(int r4, com.google.android.gms.internal.ads.gv0 r5, int r6, com.google.android.gms.internal.ads.jj4 r7, int r8, int r9, boolean r10) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            r3.f18568f = r7
            boolean r4 = r7.f11664F
            r5 = 1
            if (r5 == r4) goto L_0x000d
            r4 = 16
            goto L_0x000f
        L_0x000d:
            r4 = 24
        L_0x000f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            if (r10 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.g4 r0 = r3.f16988d
            int r1 = r0.f9678q
            float r0 = r0.f9680s
            int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0024
            r1 = 1325400064(0x4f000000, float:2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r3.f18567e = r0
            r0 = -1
            if (r10 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.g4 r10 = r3.f16988d
            int r1 = r10.f9678q
            if (r1 == r0) goto L_0x0034
            if (r1 < 0) goto L_0x004d
        L_0x0034:
            int r1 = r10.f9679r
            if (r1 == r0) goto L_0x003a
            if (r1 < 0) goto L_0x004d
        L_0x003a:
            float r1 = r10.f9680s
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0045
            r6 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x004d
        L_0x0045:
            int r6 = r10.f9669h
            if (r6 == r0) goto L_0x004b
            if (r6 < 0) goto L_0x004d
        L_0x004b:
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            r3.f18569g = r6
            boolean r6 = com.google.android.gms.internal.ads.vj4.m22280r(r8, r9)
            r3.f18570h = r6
            com.google.android.gms.internal.ads.g4 r6 = r3.f16988d
            int r10 = r6.f9669h
            r3.f18571i = r10
            int r6 = r6.mo10383a()
            r3.f18572r = r6
            com.google.android.gms.internal.ads.g4 r6 = r3.f16988d
            int r6 = r6.f9666e
            int r6 = java.lang.Integer.bitCount(r9)
            r3.f18574t = r6
            com.google.android.gms.internal.ads.g4 r6 = r3.f16988d
            int r6 = r6.f9666e
            r3.f18575u = r5
            r6 = 0
        L_0x0073:
            com.google.android.gms.internal.ads.ua3 r10 = r7.f12572l
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x0091
            com.google.android.gms.internal.ads.g4 r10 = r3.f16988d
            java.lang.String r10 = r10.f9673l
            if (r10 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.ua3 r1 = r7.f12572l
            java.lang.Object r1 = r1.get(r6)
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x0091:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0094:
            r3.f18573s = r6
            r6 = r8 & 128(0x80, float:1.794E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 != r7) goto L_0x009e
            r6 = 1
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            r3.f18577w = r6
            r6 = r8 & 64
            r7 = 64
            if (r6 != r7) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            r3.f18578x = r6
            com.google.android.gms.internal.ads.g4 r6 = r3.f16988d
            java.lang.String r7 = r6.f9673l
            r10 = 3
            r1 = 2
            if (r7 != 0) goto L_0x00b6
        L_0x00b4:
            r10 = 0
            goto L_0x00f5
        L_0x00b6:
            int r2 = r7.hashCode()
            switch(r2) {
                case -1662735862: goto L_0x00dc;
                case -1662541442: goto L_0x00d2;
                case 1331836730: goto L_0x00c8;
                case 1599127257: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x00e6
        L_0x00be:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 2
            goto L_0x00e7
        L_0x00c8:
            java.lang.String r2 = "video/avc"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 3
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r2 = "video/hevc"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 1
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r2 = "video/av01"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = -1
        L_0x00e7:
            if (r7 == 0) goto L_0x00f4
            if (r7 == r5) goto L_0x00f5
            if (r7 == r1) goto L_0x00f2
            if (r7 == r10) goto L_0x00f0
            goto L_0x00b4
        L_0x00f0:
            r10 = 1
            goto L_0x00f5
        L_0x00f2:
            r10 = 2
            goto L_0x00f5
        L_0x00f4:
            r10 = 4
        L_0x00f5:
            r3.f18579y = r10
            com.google.android.gms.internal.ads.jj4 r7 = r3.f18568f
            boolean r10 = r7.f11672N
            boolean r10 = com.google.android.gms.internal.ads.vj4.m22280r(r8, r10)
            if (r10 != 0) goto L_0x0103
        L_0x0101:
            r5 = 0
            goto L_0x0120
        L_0x0103:
            boolean r10 = r3.f18567e
            if (r10 != 0) goto L_0x010c
            boolean r7 = r7.f11662D
            if (r7 != 0) goto L_0x010c
            goto L_0x0101
        L_0x010c:
            boolean r7 = com.google.android.gms.internal.ads.vj4.m22280r(r8, r9)
            if (r7 == 0) goto L_0x0120
            boolean r7 = r3.f18569g
            if (r7 == 0) goto L_0x0120
            if (r10 == 0) goto L_0x0120
            int r6 = r6.f9669h
            if (r6 == r0) goto L_0x0120
            r4 = r4 & r8
            if (r4 == 0) goto L_0x0120
            r5 = 2
        L_0x0120:
            r3.f18576v = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uj4.<init>(int, com.google.android.gms.internal.ads.gv0, int, com.google.android.gms.internal.ads.jj4, int, int, boolean):void");
    }

    /* renamed from: c */
    public static /* synthetic */ int m21665c(uj4 uj4, uj4 uj42) {
        cc3 cc3;
        if (!uj4.f18567e || !uj4.f18570h) {
            cc3 = vj4.f19123k.mo8303a();
        } else {
            cc3 = vj4.f19123k;
        }
        ja3 i = ja3.m14783i();
        Integer valueOf = Integer.valueOf(uj4.f18571i);
        Integer valueOf2 = Integer.valueOf(uj42.f18571i);
        boolean z = uj4.f18568f.f12583w;
        return i.mo10777c(valueOf, valueOf2, vj4.f19124l).mo10777c(Integer.valueOf(uj4.f18572r), Integer.valueOf(uj42.f18572r), cc3).mo10777c(Integer.valueOf(uj4.f18571i), Integer.valueOf(uj42.f18571i), cc3).mo10775a();
    }

    /* renamed from: j */
    public static /* synthetic */ int m21666j(uj4 uj4, uj4 uj42) {
        ja3 c = ja3.m14783i().mo10778d(uj4.f18570h, uj42.f18570h).mo10776b(uj4.f18574t, uj42.f18574t).mo10778d(true, true).mo10778d(uj4.f18567e, uj42.f18567e).mo10778d(uj4.f18569g, uj42.f18569g).mo10777c(Integer.valueOf(uj4.f18573s), Integer.valueOf(uj42.f18573s), cc3.m10845c().mo8303a());
        boolean z = uj4.f18577w;
        ja3 d = c.mo10778d(z, uj42.f18577w);
        boolean z2 = uj4.f18578x;
        ja3 d2 = d.mo10778d(z2, uj42.f18578x);
        if (z && z2) {
            d2 = d2.mo10776b(uj4.f18579y, uj42.f18579y);
        }
        return d2.mo10775a();
    }

    /* renamed from: a */
    public final int mo9198a() {
        return this.f18576v;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo9199b(rj4 rj4) {
        uj4 uj4 = (uj4) rj4;
        if (!gb2.m13186t(this.f16988d.f9673l, uj4.f16988d.f9673l)) {
            return false;
        }
        boolean z = this.f18568f.f11665G;
        return this.f18577w == uj4.f18577w && this.f18578x == uj4.f18578x;
    }
}
