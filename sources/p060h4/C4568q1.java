package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;

/* renamed from: h4.q1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4568q1 extends C2847sh implements C4580s1 {
    C4568q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: T */
    public final String mo18053T() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: a */
    public final String mo18054a() throws RemoteException {
        Parcel B0 = mo14002B0(1, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }
}
