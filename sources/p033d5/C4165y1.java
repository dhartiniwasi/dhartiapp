package p033d5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;
import p137s5.C5486b;
import p137s5.C5487c;

/* renamed from: d5.y1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4165y1 extends C5486b implements C4168z1 {
    public C4165y1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: B0 */
    public static C4168z1 m28276B0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C4168z1 ? (C4168z1) queryLocalInterface : new C4161x1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo17486p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4954a b = mo17489b();
            parcel2.writeNoException();
            C5487c.m33442e(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int e = mo17490e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        return true;
    }
}
