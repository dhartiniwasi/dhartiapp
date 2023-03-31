package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C2785qt extends C2921uh implements C2822rt {
    public C2785qt() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: I6 */
    public static C2822rt m19344I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof C2822rt ? (C2822rt) queryLocalInterface : new C2748pt(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x0021
            r0 = 2
            if (r3 == r0) goto L_0x001a
            r0 = 3
            if (r3 == r0) goto L_0x000b
            r3 = 0
            return r3
        L_0x000b:
            android.os.Parcelable$Creator<h4.z2> r3 = p060h4.C4623z2.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2958vh.m22232a(r4, r3)
            h4.z2 r3 = (p060h4.C4623z2) r3
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo11509U5(r3)
            goto L_0x0043
        L_0x001a:
            r4.readInt()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            goto L_0x0043
        L_0x0021:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0029
            r3 = 0
            goto L_0x003d
        L_0x0029:
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2710ot
            if (r1 == 0) goto L_0x0037
            r3 = r0
            com.google.android.gms.internal.ads.ot r3 = (com.google.android.gms.internal.ads.C2710ot) r3
            goto L_0x003d
        L_0x0037:
            com.google.android.gms.internal.ads.mt r0 = new com.google.android.gms.internal.ads.mt
            r0.<init>(r3)
            r3 = r0
        L_0x003d:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r4)
            r2.mo11510l3(r3)
        L_0x0043:
            r5.writeNoException()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2785qt.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
