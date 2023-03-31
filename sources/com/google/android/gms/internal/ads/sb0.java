package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class sb0 extends C2921uh implements tb0 {
    public sb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r14v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r14v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r14v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r14v21, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
        /*
            r10 = this;
            r14 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            r1 = 0
            switch(r11) {
                case 1: goto L_0x0371;
                case 2: goto L_0x0366;
                case 3: goto L_0x0330;
                case 4: goto L_0x0328;
                case 5: goto L_0x0320;
                case 6: goto L_0x02d8;
                case 7: goto L_0x0299;
                case 8: goto L_0x0291;
                case 9: goto L_0x0289;
                case 10: goto L_0x025c;
                case 11: goto L_0x0245;
                case 12: goto L_0x023d;
                case 13: goto L_0x0231;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01dd;
                case 16: goto L_0x01d5;
                case 17: goto L_0x01c9;
                case 18: goto L_0x01bd;
                case 19: goto L_0x01b1;
                case 20: goto L_0x0196;
                case 21: goto L_0x0183;
                case 22: goto L_0x017b;
                case 23: goto L_0x015c;
                case 24: goto L_0x0150;
                case 25: goto L_0x0141;
                case 26: goto L_0x0135;
                case 27: goto L_0x0129;
                case 28: goto L_0x00f2;
                case 29: goto L_0x0007;
                case 30: goto L_0x00df;
                case 31: goto L_0x00be;
                case 32: goto L_0x0087;
                case 33: goto L_0x007b;
                case 34: goto L_0x006f;
                case 35: goto L_0x0027;
                case 36: goto L_0x001b;
                case 37: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r14
        L_0x0008:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13222K4(r11)
            r13.writeNoException()
            goto L_0x03b3
        L_0x001b:
            com.google.android.gms.internal.ads.zb0 r11 = r10.mo13229W()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r11)
            goto L_0x03b3
        L_0x0027:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.q4> r11 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r4 = r11
            h4.q4 r4 = (p060h4.C4571q4) r4
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r5 = r11
            h4.l4 r5 = (p060h4.C4541l4) r5
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0051
        L_0x004f:
            r8 = r1
            goto L_0x0063
        L_0x0051:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.wb0
            if (r0 == 0) goto L_0x005d
            r1 = r14
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x004f
        L_0x005d:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r11)
            goto L_0x004f
        L_0x0063:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r2 = r10
            r2.mo13230W0(r3, r4, r5, r6, r7, r8)
            r13.writeNoException()
            goto L_0x03b3
        L_0x006f:
            com.google.android.gms.internal.ads.wd0 r11 = r10.mo13237c0()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r13, r11)
            goto L_0x03b3
        L_0x007b:
            com.google.android.gms.internal.ads.wd0 r11 = r10.mo13233Z()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r13, r11)
            goto L_0x03b3
        L_0x0087:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.l4> r14 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r14)
            h4.l4 r14 = (p060h4.C4541l4) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            if (r3 != 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.wb0
            if (r1 == 0) goto L_0x00ae
            r1 = r0
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x00b3
        L_0x00ae:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r3)
        L_0x00b3:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13223N4(r11, r14, r2, r1)
            r13.writeNoException()
            goto L_0x03b3
        L_0x00be:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.IBinder r14 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.w70 r14 = com.google.android.gms.internal.ads.v70.m22013I6(r14)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.d80> r0 = com.google.android.gms.internal.ads.d80.CREATOR
            java.util.ArrayList r0 = r12.createTypedArrayList(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13248r5(r11, r14, r0)
            r13.writeNoException()
            goto L_0x03b3
        L_0x00df:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13218A2(r11)
            r13.writeNoException()
            goto L_0x03b3
        L_0x00f2:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.l4> r14 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r14)
            h4.l4 r14 = (p060h4.C4541l4) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            if (r3 != 0) goto L_0x010d
            goto L_0x011e
        L_0x010d:
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.wb0
            if (r1 == 0) goto L_0x0119
            r1 = r0
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x011e
        L_0x0119:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r3)
        L_0x011e:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13241k2(r11, r14, r2, r1)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0129:
            com.google.android.gms.internal.ads.fc0 r11 = r10.mo13231X()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r11)
            goto L_0x03b3
        L_0x0135:
            h4.j2 r11 = r10.mo13227U()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r11)
            goto L_0x03b3
        L_0x0141:
            boolean r11 = com.google.android.gms.internal.ads.C2958vh.m22239h(r12)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13239f4(r11)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0150:
            com.google.android.gms.internal.ads.j30 r11 = r10.mo13228V()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r11)
            goto L_0x03b3
        L_0x015c:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.IBinder r14 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.ai0 r14 = com.google.android.gms.internal.ads.zh0.m24599I6(r14)
            java.util.ArrayList r0 = r12.createStringArrayList()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13249s2(r11, r14, r0)
            r13.writeNoException()
            goto L_0x03b3
        L_0x017b:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r13, r14)
            goto L_0x03b3
        L_0x0183:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13238c2(r11)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0196:
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            h4.l4 r11 = (p060h4.C4541l4) r11
            java.lang.String r14 = r12.readString()
            java.lang.String r0 = r12.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13225S3(r11, r14, r0)
            r13.writeNoException()
            goto L_0x03b3
        L_0x01b1:
            android.os.Bundle r11 = r10.mo13236c()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r13, r11)
            goto L_0x03b3
        L_0x01bd:
            android.os.Bundle r11 = r10.mo13226T()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r13, r11)
            goto L_0x03b3
        L_0x01c9:
            android.os.Bundle r11 = r10.mo13234a()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r13, r11)
            goto L_0x03b3
        L_0x01d5:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r1)
            goto L_0x03b3
        L_0x01dd:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r1)
            goto L_0x03b3
        L_0x01e5:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r4 = r11
            h4.l4 r4 = (p060h4.C4541l4) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0206
        L_0x0204:
            r7 = r1
            goto L_0x0218
        L_0x0206:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.wb0
            if (r0 == 0) goto L_0x0212
            r1 = r14
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x0204
        L_0x0212:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r11)
            goto L_0x0204
        L_0x0218:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.f20> r11 = com.google.android.gms.internal.ads.f20.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r8 = r11
            com.google.android.gms.internal.ads.f20 r8 = (com.google.android.gms.internal.ads.f20) r8
            java.util.ArrayList r9 = r12.createStringArrayList()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r2 = r10
            r2.mo13253z1(r3, r4, r5, r6, r7, r8, r9)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0231:
            boolean r11 = r10.mo13220I()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r13, r11)
            goto L_0x03b3
        L_0x023d:
            r10.mo13250u()
            r13.writeNoException()
            goto L_0x03b3
        L_0x0245:
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            h4.l4 r11 = (p060h4.C4541l4) r11
            java.lang.String r14 = r12.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13244n3(r11, r14)
            r13.writeNoException()
            goto L_0x03b3
        L_0x025c:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r1 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r2 = r11
            h4.l4 r2 = (p060h4.C4541l4) r2
            java.lang.String r3 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.ai0 r4 = com.google.android.gms.internal.ads.zh0.m24599I6(r11)
            java.lang.String r5 = r12.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r0 = r10
            r0.mo13224P3(r1, r2, r3, r4, r5)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0289:
            r10.mo13240k0()
            r13.writeNoException()
            goto L_0x03b3
        L_0x0291:
            r10.mo13221K()
            r13.writeNoException()
            goto L_0x03b3
        L_0x0299:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r4 = r11
            h4.l4 r4 = (p060h4.C4541l4) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x02ba
        L_0x02b8:
            r7 = r1
            goto L_0x02cc
        L_0x02ba:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.wb0
            if (r0 == 0) goto L_0x02c6
            r1 = r14
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x02b8
        L_0x02c6:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r11)
            goto L_0x02b8
        L_0x02cc:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r2 = r10
            r2.mo13251v1(r3, r4, r5, r6, r7)
            r13.writeNoException()
            goto L_0x03b3
        L_0x02d8:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.q4> r11 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r4 = r11
            h4.q4 r4 = (p060h4.C4571q4) r4
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r5 = r11
            h4.l4 r5 = (p060h4.C4541l4) r5
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0302
        L_0x0300:
            r8 = r1
            goto L_0x0314
        L_0x0302:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.wb0
            if (r0 == 0) goto L_0x030e
            r1 = r14
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x0300
        L_0x030e:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r11)
            goto L_0x0300
        L_0x0314:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r2 = r10
            r2.mo13219A3(r3, r4, r5, r6, r7, r8)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0320:
            r10.mo13232Y()
            r13.writeNoException()
            goto L_0x03b3
        L_0x0328:
            r10.mo13245o()
            r13.writeNoException()
            goto L_0x03b3
        L_0x0330:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r11 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.l4> r14 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r14)
            h4.l4 r14 = (p060h4.C4541l4) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            if (r3 != 0) goto L_0x034b
            goto L_0x035c
        L_0x034b:
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.wb0
            if (r1 == 0) goto L_0x0357
            r1 = r0
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x035c
        L_0x0357:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r3)
        L_0x035c:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r10.mo13243m4(r11, r14, r2, r1)
            r13.writeNoException()
            goto L_0x03b3
        L_0x0366:
            l5.a r11 = r10.mo13235a0()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r13, r11)
            goto L_0x03b3
        L_0x0371:
            android.os.IBinder r11 = r12.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r11)
            android.os.Parcelable$Creator<h4.q4> r11 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r4 = r11
            h4.q4 r4 = (p060h4.C4571q4) r4
            android.os.Parcelable$Creator<h4.l4> r11 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C2958vh.m22232a(r12, r11)
            r5 = r11
            h4.l4 r5 = (p060h4.C4541l4) r5
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0397
        L_0x0395:
            r7 = r1
            goto L_0x03a9
        L_0x0397:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.wb0
            if (r0 == 0) goto L_0x03a3
            r1 = r14
            com.google.android.gms.internal.ads.wb0 r1 = (com.google.android.gms.internal.ads.wb0) r1
            goto L_0x0395
        L_0x03a3:
            com.google.android.gms.internal.ads.ub0 r1 = new com.google.android.gms.internal.ads.ub0
            r1.<init>(r11)
            goto L_0x0395
        L_0x03a9:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r12)
            r2 = r10
            r2.mo13246q2(r3, r4, r5, r6, r7)
            r13.writeNoException()
        L_0x03b3:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sb0.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
