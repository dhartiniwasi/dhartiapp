package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class u20 extends C2921uh implements v20 {
    public u20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: I6 */
    public static v20 m21375I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof v20 ? (v20) queryLocalInterface : new t20(iBinder);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x009f;
                case 2: goto L_0x008d;
                case 3: goto L_0x007b;
                case 4: goto L_0x0074;
                case 5: goto L_0x0063;
                case 6: goto L_0x0051;
                case 7: goto L_0x003f;
                case 8: goto L_0x0018;
                case 9: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            android.os.IBinder r2 = r3.readStrongBinder()
            l5.a r2 = p088l5.C4954a.C4955a.m31383B0(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo14193g6(r2)
            r4.writeNoException()
            goto L_0x00b4
        L_0x0018:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0020
            r2 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.o20
            if (r0 == 0) goto L_0x002e
            r2 = r5
            com.google.android.gms.internal.ads.o20 r2 = (com.google.android.gms.internal.ads.o20) r2
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.l20 r5 = new com.google.android.gms.internal.ads.l20
            r5.<init>(r2)
            r2 = r5
        L_0x0034:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo14189L3(r2)
            r4.writeNoException()
            goto L_0x00b4
        L_0x003f:
            android.os.IBinder r2 = r3.readStrongBinder()
            l5.a r2 = p088l5.C4954a.C4955a.m31383B0(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo14188D(r2)
            r4.writeNoException()
            goto L_0x00b4
        L_0x0051:
            android.os.IBinder r2 = r3.readStrongBinder()
            l5.a r2 = p088l5.C4954a.C4955a.m31383B0(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo14195i2(r2)
            r4.writeNoException()
            goto L_0x00b4
        L_0x0063:
            android.os.IBinder r2 = r3.readStrongBinder()
            p088l5.C4954a.C4955a.m31383B0(r2)
            r3.readInt()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r4.writeNoException()
            goto L_0x00b4
        L_0x0074:
            r1.mo14192e()
            r4.writeNoException()
            goto L_0x00b4
        L_0x007b:
            android.os.IBinder r2 = r3.readStrongBinder()
            l5.a r2 = p088l5.C4954a.C4955a.m31383B0(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo14190W4(r2)
            r4.writeNoException()
            goto L_0x00b4
        L_0x008d:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            l5.a r2 = r1.mo14194i(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x00b4
        L_0x009f:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            l5.a r5 = p088l5.C4954a.C4955a.m31383B0(r5)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo14196v4(r2, r5)
            r4.writeNoException()
        L_0x00b4:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u20.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
