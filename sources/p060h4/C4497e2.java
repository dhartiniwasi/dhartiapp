package p060h4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h4.e2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4497e2 extends C2847sh implements C4509g2 {
    C4497e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: T */
    public final C4595u4 mo12860T() throws RemoteException {
        Parcel B0 = mo14002B0(4, mo14006p());
        C4595u4 u4Var = (C4595u4) C2958vh.m22232a(B0, C4595u4.CREATOR);
        B0.recycle();
        return u4Var;
    }

    /* renamed from: U */
    public final String mo12861U() throws RemoteException {
        Parcel B0 = mo14002B0(6, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: V */
    public final String mo12862V() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: W */
    public final List mo12863W() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        ArrayList<C4595u4> createTypedArrayList = B0.createTypedArrayList(C4595u4.CREATOR);
        B0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final Bundle mo12865a() throws RemoteException {
        Parcel B0 = mo14002B0(5, mo14006p());
        Bundle bundle = (Bundle) C2958vh.m22232a(B0, Bundle.CREATOR);
        B0.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final String mo12867c() throws RemoteException {
        Parcel B0 = mo14002B0(1, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }
}
