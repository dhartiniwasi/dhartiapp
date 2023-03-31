package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import p088l5.C4954a;

/* renamed from: h4.m1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4544m1 extends C2847sh {
    C4544m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* renamed from: i5 */
    public final IBinder mo18072i5(C4954a aVar, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(1, p);
        IBinder readStrongBinder = B0.readStrongBinder();
        B0.recycle();
        return readStrongBinder;
    }
}
