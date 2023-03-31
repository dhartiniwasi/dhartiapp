package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.h2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4515h2 extends C2847sh implements C4527j2 {
    C4515h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: T */
    public final float mo10783T() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4545m2 mo10785V() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 11
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p060h4.C4545m2
            if (r3 == 0) goto L_0x0020
            r1 = r2
            h4.m2 r1 = (p060h4.C4545m2) r1
            goto L_0x0026
        L_0x0020:
            h4.k2 r2 = new h4.k2
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4515h2.mo10785V():h4.m2");
    }

    /* renamed from: a */
    public final float mo10789a() throws RemoteException {
        throw null;
    }

    /* renamed from: c */
    public final float mo10792c() throws RemoteException {
        throw null;
    }

    /* renamed from: l1 */
    public final void mo10794l1(C4545m2 m2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, m2Var);
        mo14003P0(8, p);
    }
}
