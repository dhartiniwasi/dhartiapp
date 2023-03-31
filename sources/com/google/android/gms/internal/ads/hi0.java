package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class hi0 extends C2921uh implements ii0 {
    public hi0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: I6 */
    public static ii0 m13856I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof ii0 ? (ii0) queryLocalInterface : new gi0(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.qi0} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.pi0] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.li0] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.pi0] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r3) {
                case 1: goto L_0x0127;
                case 2: goto L_0x0103;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00db;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0090;
                case 9: goto L_0x0084;
                case 10: goto L_0x006d;
                case 11: goto L_0x0061;
                case 12: goto L_0x0055;
                case 13: goto L_0x0042;
                case 14: goto L_0x0017;
                case 15: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            boolean r3 = com.google.android.gms.internal.ads.C2958vh.m22239h(r4)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10543u0(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x0017:
            android.os.Parcelable$Creator<h4.l4> r3 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2958vh.m22232a(r4, r3)
            h4.l4 r3 = (p060h4.C4541l4) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.pi0
            if (r0 == 0) goto L_0x0032
            r0 = r6
            com.google.android.gms.internal.ads.pi0 r0 = (com.google.android.gms.internal.ads.pi0) r0
            goto L_0x0037
        L_0x0032:
            com.google.android.gms.internal.ads.ni0 r0 = new com.google.android.gms.internal.ads.ni0
            r0.<init>(r1)
        L_0x0037:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10536H4(r3, r0)
            r5.writeNoException()
            goto L_0x0150
        L_0x0042:
            android.os.IBinder r3 = r4.readStrongBinder()
            h4.d2 r3 = p060h4.C4485c2.m29579I6(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10538V3(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x0055:
            h4.g2 r3 = r2.mo10541e()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r3)
            goto L_0x0150
        L_0x0061:
            com.google.android.gms.internal.ads.fi0 r3 = r2.mo11114b()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r3)
            goto L_0x0150
        L_0x006d:
            android.os.IBinder r3 = r4.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r3)
            boolean r6 = com.google.android.gms.internal.ads.C2958vh.m22239h(r4)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo11116m5(r3, r6)
            r5.writeNoException()
            goto L_0x0150
        L_0x0084:
            android.os.Bundle r3 = r2.mo11115d()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r5, r3)
            goto L_0x0150
        L_0x0090:
            android.os.IBinder r3 = r4.readStrongBinder()
            h4.a2 r3 = p060h4.C4622z1.m30138I6(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10542s3(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x00a3:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.wi0> r3 = com.google.android.gms.internal.ads.wi0.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2958vh.m22232a(r4, r3)
            com.google.android.gms.internal.ads.wi0 r3 = (com.google.android.gms.internal.ads.wi0) r3
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10544u4(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x00b6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d0
        L_0x00bd:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.qi0
            if (r0 == 0) goto L_0x00cb
            r0 = r6
            com.google.android.gms.internal.ads.qi0 r0 = (com.google.android.gms.internal.ads.qi0) r0
            goto L_0x00d0
        L_0x00cb:
            com.google.android.gms.internal.ads.qi0 r0 = new com.google.android.gms.internal.ads.qi0
            r0.<init>(r3)
        L_0x00d0:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo11111D5(r0)
            r5.writeNoException()
            goto L_0x0150
        L_0x00db:
            android.os.IBinder r3 = r4.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10537V0(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x00ed:
            java.lang.String r3 = r2.mo11113a()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0150
        L_0x00f8:
            boolean r3 = r2.mo11112Y()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r5, r3)
            goto L_0x0150
        L_0x0103:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x010a
            goto L_0x011d
        L_0x010a:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.li0
            if (r0 == 0) goto L_0x0118
            r0 = r6
            com.google.android.gms.internal.ads.li0 r0 = (com.google.android.gms.internal.ads.li0) r0
            goto L_0x011d
        L_0x0118:
            com.google.android.gms.internal.ads.ji0 r0 = new com.google.android.gms.internal.ads.ji0
            r0.<init>(r3)
        L_0x011d:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10540d6(r0)
            r5.writeNoException()
            goto L_0x0150
        L_0x0127:
            android.os.Parcelable$Creator<h4.l4> r3 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2958vh.m22232a(r4, r3)
            h4.l4 r3 = (p060h4.C4541l4) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x0136
            goto L_0x0147
        L_0x0136:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.pi0
            if (r0 == 0) goto L_0x0142
            r0 = r6
            com.google.android.gms.internal.ads.pi0 r0 = (com.google.android.gms.internal.ads.pi0) r0
            goto L_0x0147
        L_0x0142:
            com.google.android.gms.internal.ads.ni0 r0 = new com.google.android.gms.internal.ads.ni0
            r0.<init>(r1)
        L_0x0147:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo10539Y3(r3, r0)
            r5.writeNoException()
        L_0x0150:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hi0.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
