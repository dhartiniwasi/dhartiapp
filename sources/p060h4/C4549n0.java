package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.qb0;
import p088l5.C4954a;

/* renamed from: h4.n0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4549n0 extends C2847sh {
    C4549n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: i5 */
    public final IBinder mo18081i5(C4954a aVar, String str, qb0 qb0, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        C2958vh.m22238g(p, qb0);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(1, p);
        IBinder readStrongBinder = B0.readStrongBinder();
        B0.recycle();
        return readStrongBinder;
    }
}
