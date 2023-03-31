package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class m40 extends C2921uh implements n40 {
    public m40() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 2: goto L_0x019d;
                case 3: goto L_0x0192;
                case 4: goto L_0x0187;
                case 5: goto L_0x017c;
                case 6: goto L_0x0171;
                case 7: goto L_0x0166;
                case 8: goto L_0x015b;
                case 9: goto L_0x0150;
                case 10: goto L_0x0145;
                case 11: goto L_0x013a;
                case 12: goto L_0x012e;
                case 13: goto L_0x0126;
                case 14: goto L_0x011a;
                case 15: goto L_0x0107;
                case 16: goto L_0x00f0;
                case 17: goto L_0x00dd;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00c5;
                case 20: goto L_0x00b9;
                case 21: goto L_0x0092;
                case 22: goto L_0x008a;
                case 23: goto L_0x007e;
                case 24: goto L_0x0072;
                case 25: goto L_0x005f;
                case 26: goto L_0x004c;
                case 27: goto L_0x0044;
                case 28: goto L_0x003c;
                case 29: goto L_0x0030;
                case 30: goto L_0x0024;
                case 31: goto L_0x0018;
                case 32: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            android.os.IBinder r2 = r3.readStrongBinder()
            h4.d2 r2 = p060h4.C4485c2.m29579I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10897Q2(r2)
            r4.writeNoException()
            goto L_0x01a7
        L_0x0018:
            h4.g2 r2 = r1.mo10910c()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x0024:
            boolean r2 = r1.mo10921o()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x01a7
        L_0x0030:
            com.google.android.gms.internal.ads.o20 r2 = r1.mo10902W()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x003c:
            r1.mo10918h0()
            r4.writeNoException()
            goto L_0x01a7
        L_0x0044:
            r1.mo10896C()
            r4.writeNoException()
            goto L_0x01a7
        L_0x004c:
            android.os.IBinder r2 = r3.readStrongBinder()
            h4.p1 r2 = p060h4.C4556o1.m29823I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10919h2(r2)
            r4.writeNoException()
            goto L_0x01a7
        L_0x005f:
            android.os.IBinder r2 = r3.readStrongBinder()
            h4.s1 r2 = p060h4.C4574r1.m30004I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10903W3(r2)
            r4.writeNoException()
            goto L_0x01a7
        L_0x0072:
            boolean r2 = r1.mo10925w()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x01a7
        L_0x007e:
            java.util.List r2 = r1.mo10916g0()
            r4.writeNoException()
            r4.writeList(r2)
            goto L_0x01a7
        L_0x008a:
            r1.mo10923t()
            r4.writeNoException()
            goto L_0x01a7
        L_0x0092:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x009a
            r2 = 0
            goto L_0x00ae
        L_0x009a:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.j40
            if (r0 == 0) goto L_0x00a8
            r2 = r5
            com.google.android.gms.internal.ads.j40 r2 = (com.google.android.gms.internal.ads.j40) r2
            goto L_0x00ae
        L_0x00a8:
            com.google.android.gms.internal.ads.i40 r5 = new com.google.android.gms.internal.ads.i40
            r5.<init>(r2)
            r2 = r5
        L_0x00ae:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10895A5(r2)
            r4.writeNoException()
            goto L_0x01a7
        L_0x00b9:
            android.os.Bundle r2 = r1.mo10898T()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r4, r2)
            goto L_0x01a7
        L_0x00c5:
            l5.a r2 = r1.mo10906Z()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x00d1:
            l5.a r2 = r1.mo10911c0()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x00dd:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10913d3(r2)
            r4.writeNoException()
            goto L_0x01a7
        L_0x00f0:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            boolean r2 = r1.mo10900U4(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x01a7
        L_0x0107:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10924t6(r2)
            r4.writeNoException()
            goto L_0x01a7
        L_0x011a:
            com.google.android.gms.internal.ads.j20 r2 = r1.mo10901V()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x0126:
            r1.mo10922q()
            r4.writeNoException()
            goto L_0x01a7
        L_0x012e:
            java.lang.String r2 = r1.mo10914e0()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x01a7
        L_0x013a:
            h4.j2 r2 = r1.mo10899U()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x0145:
            java.lang.String r2 = r1.mo10912d0()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x01a7
        L_0x0150:
            java.lang.String r2 = r1.mo10915g()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x01a7
        L_0x015b:
            double r2 = r1.mo10907a()
            r4.writeNoException()
            r4.writeDouble(r2)
            goto L_0x01a7
        L_0x0166:
            java.lang.String r2 = r1.mo10908a0()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x01a7
        L_0x0171:
            java.lang.String r2 = r1.mo10909b0()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x01a7
        L_0x017c:
            com.google.android.gms.internal.ads.r20 r2 = r1.mo10904X()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x01a7
        L_0x0187:
            java.lang.String r2 = r1.mo10905Y()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x01a7
        L_0x0192:
            java.util.List r2 = r1.mo10920j()
            r4.writeNoException()
            r4.writeList(r2)
            goto L_0x01a7
        L_0x019d:
            java.lang.String r2 = r1.mo10917h()
            r4.writeNoException()
            r4.writeString(r2)
        L_0x01a7:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m40.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
