package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ob0 extends C2847sh implements qb0 {
    ob0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.tb0 mo12562i(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo14006p()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo14002B0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.tb0
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.tb0 r0 = (com.google.android.gms.internal.ads.tb0) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.rb0 r1 = new com.google.android.gms.internal.ads.rb0
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ob0.mo12562i(java.lang.String):com.google.android.gms.internal.ads.tb0");
    }

    /* renamed from: k */
    public final boolean mo12563k(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        Parcel B0 = mo14002B0(2, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: x */
    public final kd0 mo12564x(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        Parcel B0 = mo14002B0(3, p);
        kd0 I6 = jd0.m14829I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: z */
    public final boolean mo12565z(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        Parcel B0 = mo14002B0(4, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }
}
