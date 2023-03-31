package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.w0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4603w0 extends C2921uh implements C4609x0 {
    public C4603w0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: I6 */
    public static C4609x0 m30112I6(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof C4609x0 ? (C4609x0) queryLocalInterface : new C4597v0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        C2958vh.m22234c(parcel);
        mo11190G0(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
