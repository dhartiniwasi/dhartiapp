package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class qh0 extends C2921uh implements rh0 {
    public qh0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.gms.internal.ads.ph0} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.uh0] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x0149
            r0 = 2
            if (r3 == r0) goto L_0x0142
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x011e
            r0 = 34
            if (r3 == r0) goto L_0x0110
            switch(r3) {
                case 5: goto L_0x0105;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00ca;
                case 11: goto L_0x00b7;
                case 12: goto L_0x00ab;
                case 13: goto L_0x009c;
                case 14: goto L_0x0089;
                case 15: goto L_0x007d;
                case 16: goto L_0x0058;
                case 17: goto L_0x004d;
                case 18: goto L_0x003a;
                case 19: goto L_0x002b;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            h4.g2 r3 = r2.mo10285e()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r3)
            goto L_0x015a
        L_0x001f:
            boolean r3 = r2.mo10287g()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r5, r3)
            goto L_0x015a
        L_0x002b:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10273E3(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x003a:
            android.os.IBinder r3 = r4.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10278P(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x004d:
            r4.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r5.writeNoException()
            goto L_0x015a
        L_0x0058:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x005f
            goto L_0x0072
        L_0x005f:
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ph0
            if (r1 == 0) goto L_0x006d
            r1 = r0
            com.google.android.gms.internal.ads.ph0 r1 = (com.google.android.gms.internal.ads.ph0) r1
            goto L_0x0072
        L_0x006d:
            com.google.android.gms.internal.ads.ph0 r1 = new com.google.android.gms.internal.ads.ph0
            r1.<init>(r3)
        L_0x0072:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10290p5(r1)
            r5.writeNoException()
            goto L_0x015a
        L_0x007d:
            android.os.Bundle r3 = r2.mo10283d()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r5, r3)
            goto L_0x015a
        L_0x0089:
            android.os.IBinder r3 = r4.readStrongBinder()
            h4.u0 r3 = p060h4.C4585t0.m30040I6(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10274G6(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x009c:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10272A(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x00ab:
            java.lang.String r3 = r2.mo10282b()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x015a
        L_0x00b7:
            android.os.IBinder r3 = r4.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10275I0(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x00ca:
            android.os.IBinder r3 = r4.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10291y2(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x00dd:
            android.os.IBinder r3 = r4.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10277L(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x00f0:
            r2.mo10281a()
            r5.writeNoException()
            goto L_0x015a
        L_0x00f7:
            r2.mo10280W()
            r5.writeNoException()
            goto L_0x015a
        L_0x00fe:
            r2.mo10279U()
            r5.writeNoException()
            goto L_0x015a
        L_0x0105:
            boolean r3 = r2.mo10284d0()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r5, r3)
            goto L_0x015a
        L_0x0110:
            boolean r3 = com.google.android.gms.internal.ads.C2958vh.m22239h(r4)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10286e2(r3)
            r5.writeNoException()
            goto L_0x015a
        L_0x011e:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0125
            goto L_0x0138
        L_0x0125:
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.uh0
            if (r1 == 0) goto L_0x0133
            r1 = r0
            com.google.android.gms.internal.ads.uh0 r1 = (com.google.android.gms.internal.ads.uh0) r1
            goto L_0x0138
        L_0x0133:
            com.google.android.gms.internal.ads.sh0 r1 = new com.google.android.gms.internal.ads.sh0
            r1.<init>(r3)
        L_0x0138:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10289h6(r1)
            r5.writeNoException()
            goto L_0x015a
        L_0x0142:
            r2.mo10288h()
            r5.writeNoException()
            goto L_0x015a
        L_0x0149:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.vh0> r3 = com.google.android.gms.internal.ads.vh0.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2958vh.m22232a(r4, r3)
            com.google.android.gms.internal.ads.vh0 r3 = (com.google.android.gms.internal.ads.vh0) r3
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10276I5(r3)
            r5.writeNoException()
        L_0x015a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qh0.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
