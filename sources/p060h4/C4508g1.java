package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.pb0;
import com.google.android.gms.internal.ads.qb0;

/* renamed from: h4.g1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4508g1 extends C2847sh implements C4520i1 {
    C4508g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final qb0 getAdapterCreator() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        qb0 I6 = pb0.m18446I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    public final C4516h3 getLiteSdkVersion() throws RemoteException {
        Parcel B0 = mo14002B0(1, mo14006p());
        C4516h3 h3Var = (C4516h3) C2958vh.m22232a(B0, C4516h3.CREATOR);
        B0.recycle();
        return h3Var;
    }
}
